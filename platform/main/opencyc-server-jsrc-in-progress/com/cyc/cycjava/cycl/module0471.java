package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0471 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0471";
    public static final String myFingerPrint = "ddd3dd514c44520c4daeb9b4460027d03c78e513fe6c3a4e49e5f9a0f1411f07";
    private static SubLSymbol $g3680$;
    private static SubLSymbol $g3681$;
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLList $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLList $ic14$;
    
    public static SubLObject f31580(final SubLObject var1, final SubLObject var2) {
        if (NIL != var1 && NIL == module0004.f104(var1, (SubLObject)$ic3$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL == module0004.f104(var2, (SubLObject)$ic3$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            final SubLObject var3 = f31581(var1, var2);
            return var3;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31581(final SubLObject var4, final SubLObject var5) {
        final SubLObject var6 = module0202.f12768($ic0$, var4, var5);
        return module0191.f11990((SubLObject)$ic4$, var6, module0132.$g1548$.getGlobalValue(), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31582(final SubLObject var7, SubLObject var8) {
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)NIL;
        }
        SubLObject var10;
        final SubLObject var9 = var10 = module0205.f13385(var7, (SubLObject)UNPROVIDED);
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)$ic5$);
        var11 = var10.first();
        var10 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)$ic5$);
        var12 = var10.first();
        var10 = var10.rest();
        if (NIL == var10) {
            if (NIL != f31583(var11, var12)) {
                module0347.f23330(module0191.f11990((SubLObject)$ic4$, var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var9, (SubLObject)$ic5$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31583(final SubLObject var4, final SubLObject var5) {
        return (SubLObject)makeBoolean(NIL != module0161.f10499(var4) && NIL != module0161.f10499(var5) && NIL != module0262.f17336(var4, var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31584(final SubLObject var7, SubLObject var8) {
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)NIL;
        }
        return module0549.f33899(module0205.f13387(var7, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31585(final SubLObject var11) {
        return module0052.f3709(f31586(var11));
    }
    
    public static SubLObject f31586(final SubLObject var12) {
        if (NIL != module0161.f10499(var12)) {
            return module0262.f17311(var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31587(final SubLObject var7, SubLObject var8) {
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)NIL;
        }
        return module0549.f33901(module0205.f13388(var7, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31588(final SubLObject var5) {
        return module0052.f3709(f31589(var5));
    }
    
    public static SubLObject f31589(final SubLObject var12) {
        if (NIL != module0161.f10499(var12)) {
            return module0262.f17312(var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31590(final SubLObject var7, SubLObject var8) {
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)NIL;
        }
        final SubLThread var9 = SubLProcess.currentSubLThread();
        SubLObject var11;
        final SubLObject var10 = var11 = module0205.f13385(var7, (SubLObject)UNPROVIDED);
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var11, var10, (SubLObject)$ic5$);
        var12 = var11.first();
        var11 = var11.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var11, var10, (SubLObject)$ic5$);
        var13 = var11.first();
        var11 = var11.rest();
        if (NIL == var11) {
            if (NIL != module0018.$g646$.getDynamicValue(var9) && NIL == f31583(var12, var13)) {
                module0347.f23330(module0191.f11990((SubLObject)$ic12$, module0205.f13338(var7), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else if (NIL != f31591(var12, var13)) {
                module0347.f23330(module0191.f11990((SubLObject)$ic4$, module0205.f13338(var7), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var10, (SubLObject)$ic5$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31591(final SubLObject var4, final SubLObject var5) {
        return (SubLObject)makeBoolean(NIL != module0161.f10499(var4) && NIL != module0161.f10499(var5) && NIL != module0262.f17348(var4, var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31592() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0471", "f31580", "S#24927", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0471", "f31581", "S#34929", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0471", "f31582", "S#34930", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0471", "f31583", "S#34931", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0471", "f31584", "S#34932", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0471", "f31585", "S#34933", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0471", "f31586", "S#34934", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0471", "f31587", "S#34935", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0471", "f31588", "S#34936", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0471", "f31589", "S#34937", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0471", "f31590", "S#34938", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0471", "f31591", "S#34939", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31593() {
        $g3680$ = SubLFiles.defparameter("S#34940", module0018.$g658$.getDynamicValue());
        $g3681$ = SubLFiles.defparameter("S#34941", (SubLObject)TWO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31594() {
        module0340.f22938($ic0$);
        module0358.f23774((SubLObject)$ic1$, $ic0$);
        module0358.f23773((SubLObject)$ic2$, $ic0$);
        module0340.f22941((SubLObject)$ic6$, (SubLObject)$ic7$);
        module0340.f22941((SubLObject)$ic8$, (SubLObject)$ic9$);
        module0340.f22941((SubLObject)$ic10$, (SubLObject)$ic11$);
        module0340.f22941((SubLObject)$ic13$, (SubLObject)$ic14$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f31592();
    }
    
    public void initializeVariables() {
        f31593();
    }
    
    public void runTopLevelForms() {
        f31594();
    }
    
    static {
        me = (SubLFile)new module0471();
        $g3680$ = null;
        $g3681$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("genlMt"));
        $ic1$ = makeKeyword("POS");
        $ic2$ = makeKeyword("NEG");
        $ic3$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC")), constant_handles_oc.f8479((SubLObject)makeString("InferencePSC")));
        $ic4$ = makeKeyword("GENLMT");
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#34609", "CYC"), (SubLObject)makeSymbol("S#13096", "CYC"));
        $ic6$ = makeKeyword("REMOVAL-GENLMT-CHECK");
        $ic7$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("genlMt")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genlMt")), (SubLObject)makeKeyword("CLOSED-HLMT"), (SubLObject)makeKeyword("CLOSED-HLMT")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34940", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34930", "CYC"), makeKeyword("EXAMPLE"), makeString("(#$genlMt #$GermanLexicalMt #$CrossLinguisticLexicalMt)") });
        $ic8$ = makeKeyword("REMOVAL-ALL-GENLMT");
        $ic9$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("genlMt")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genlMt")), (SubLObject)makeKeyword("CLOSED-HLMT"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST"), makeSymbol("S#34932", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genlMt")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34942", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34942", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34933", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genlMt")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34942", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("GENLMT"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"), makeString("(#$genlMt <closed-hlmt> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$genlMt #$GermanLexicalMt ?GENL-MT)") });
        $ic10$ = makeKeyword("REMOVAL-ALL-SPEC-MTS");
        $ic11$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("genlMt")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genlMt")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("CLOSED-HLMT")), makeKeyword("COST"), makeSymbol("S#34935", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genlMt")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#13096", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13096", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34936", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genlMt")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13096", "CYC"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("GENLMT"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"), makeString("(#$genlMt <not-fully-bound> <closed-hlmt>)"), makeKeyword("EXAMPLE"), makeString("(#$genlMt ?SPEC-MT #$GermanLexicalMt)") });
        $ic12$ = makeKeyword("MINIMIZE");
        $ic13$ = makeKeyword("REMOVAL-NOT-GENLMT-CHECK");
        $ic14$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("genlMt")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genlMt")), (SubLObject)makeKeyword("CLOSED-HLMT"), (SubLObject)makeKeyword("CLOSED-HLMT")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34941", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34938", "CYC") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 107 ms
	
	Decompiled with Procyon 0.5.32.
*/