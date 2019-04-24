package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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
        if (module0471.NIL != var1 && module0471.NIL == module0004.f104(var1, (SubLObject)module0471.$ic3$, (SubLObject)module0471.UNPROVIDED, (SubLObject)module0471.UNPROVIDED) && module0471.NIL == module0004.f104(var2, (SubLObject)module0471.$ic3$, (SubLObject)module0471.UNPROVIDED, (SubLObject)module0471.UNPROVIDED)) {
            final SubLObject var3 = f31581(var1, var2);
            return var3;
        }
        return (SubLObject)module0471.NIL;
    }
    
    public static SubLObject f31581(final SubLObject var4, final SubLObject var5) {
        final SubLObject var6 = module0202.f12768(module0471.$ic0$, var4, var5);
        return module0191.f11990((SubLObject)module0471.$ic4$, var6, module0132.$g1548$.getGlobalValue(), (SubLObject)module0471.UNPROVIDED);
    }
    
    public static SubLObject f31582(final SubLObject var7, SubLObject var8) {
        if (var8 == module0471.UNPROVIDED) {
            var8 = (SubLObject)module0471.NIL;
        }
        SubLObject var10;
        final SubLObject var9 = var10 = module0205.f13385(var7, (SubLObject)module0471.UNPROVIDED);
        SubLObject var11 = (SubLObject)module0471.NIL;
        SubLObject var12 = (SubLObject)module0471.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)module0471.$ic5$);
        var11 = var10.first();
        var10 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)module0471.$ic5$);
        var12 = var10.first();
        var10 = var10.rest();
        if (module0471.NIL == var10) {
            if (module0471.NIL != f31583(var11, var12)) {
                module0347.f23330(module0191.f11990((SubLObject)module0471.$ic4$, var7, (SubLObject)module0471.UNPROVIDED, (SubLObject)module0471.UNPROVIDED), (SubLObject)module0471.UNPROVIDED, (SubLObject)module0471.UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var9, (SubLObject)module0471.$ic5$);
        }
        return (SubLObject)module0471.NIL;
    }
    
    public static SubLObject f31583(final SubLObject var4, final SubLObject var5) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0471.NIL != module0161.f10499(var4) && module0471.NIL != module0161.f10499(var5) && module0471.NIL != module0262.f17336(var4, var5, (SubLObject)module0471.UNPROVIDED, (SubLObject)module0471.UNPROVIDED));
    }
    
    public static SubLObject f31584(final SubLObject var7, SubLObject var8) {
        if (var8 == module0471.UNPROVIDED) {
            var8 = (SubLObject)module0471.NIL;
        }
        return module0549.f33899(module0205.f13387(var7, (SubLObject)module0471.UNPROVIDED));
    }
    
    public static SubLObject f31585(final SubLObject var11) {
        return module0052.f3709(f31586(var11));
    }
    
    public static SubLObject f31586(final SubLObject var12) {
        if (module0471.NIL != module0161.f10499(var12)) {
            return module0262.f17311(var12, (SubLObject)module0471.UNPROVIDED, (SubLObject)module0471.UNPROVIDED);
        }
        return (SubLObject)module0471.NIL;
    }
    
    public static SubLObject f31587(final SubLObject var7, SubLObject var8) {
        if (var8 == module0471.UNPROVIDED) {
            var8 = (SubLObject)module0471.NIL;
        }
        return module0549.f33901(module0205.f13388(var7, (SubLObject)module0471.UNPROVIDED));
    }
    
    public static SubLObject f31588(final SubLObject var5) {
        return module0052.f3709(f31589(var5));
    }
    
    public static SubLObject f31589(final SubLObject var12) {
        if (module0471.NIL != module0161.f10499(var12)) {
            return module0262.f17312(var12, (SubLObject)module0471.UNPROVIDED, (SubLObject)module0471.UNPROVIDED);
        }
        return (SubLObject)module0471.NIL;
    }
    
    public static SubLObject f31590(final SubLObject var7, SubLObject var8) {
        if (var8 == module0471.UNPROVIDED) {
            var8 = (SubLObject)module0471.NIL;
        }
        final SubLThread var9 = SubLProcess.currentSubLThread();
        SubLObject var11;
        final SubLObject var10 = var11 = module0205.f13385(var7, (SubLObject)module0471.UNPROVIDED);
        SubLObject var12 = (SubLObject)module0471.NIL;
        SubLObject var13 = (SubLObject)module0471.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var11, var10, (SubLObject)module0471.$ic5$);
        var12 = var11.first();
        var11 = var11.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var11, var10, (SubLObject)module0471.$ic5$);
        var13 = var11.first();
        var11 = var11.rest();
        if (module0471.NIL == var11) {
            if (module0471.NIL != module0018.$g646$.getDynamicValue(var9) && module0471.NIL == f31583(var12, var13)) {
                module0347.f23330(module0191.f11990((SubLObject)module0471.$ic12$, module0205.f13338(var7), (SubLObject)module0471.UNPROVIDED, (SubLObject)module0471.UNPROVIDED), (SubLObject)module0471.UNPROVIDED, (SubLObject)module0471.UNPROVIDED);
            }
            else if (module0471.NIL != f31591(var12, var13)) {
                module0347.f23330(module0191.f11990((SubLObject)module0471.$ic4$, module0205.f13338(var7), (SubLObject)module0471.UNPROVIDED, (SubLObject)module0471.UNPROVIDED), (SubLObject)module0471.UNPROVIDED, (SubLObject)module0471.UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var10, (SubLObject)module0471.$ic5$);
        }
        return (SubLObject)module0471.NIL;
    }
    
    public static SubLObject f31591(final SubLObject var4, final SubLObject var5) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0471.NIL != module0161.f10499(var4) && module0471.NIL != module0161.f10499(var5) && module0471.NIL != module0262.f17348(var4, var5, (SubLObject)module0471.UNPROVIDED, (SubLObject)module0471.UNPROVIDED));
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
        return (SubLObject)module0471.NIL;
    }
    
    public static SubLObject f31593() {
        module0471.$g3680$ = SubLFiles.defparameter("S#34940", module0018.$g658$.getDynamicValue());
        module0471.$g3681$ = SubLFiles.defparameter("S#34941", (SubLObject)module0471.TWO_INTEGER);
        return (SubLObject)module0471.NIL;
    }
    
    public static SubLObject f31594() {
        module0340.f22938(module0471.$ic0$);
        module0358.f23774((SubLObject)module0471.$ic1$, module0471.$ic0$);
        module0358.f23773((SubLObject)module0471.$ic2$, module0471.$ic0$);
        module0340.f22941((SubLObject)module0471.$ic6$, (SubLObject)module0471.$ic7$);
        module0340.f22941((SubLObject)module0471.$ic8$, (SubLObject)module0471.$ic9$);
        module0340.f22941((SubLObject)module0471.$ic10$, (SubLObject)module0471.$ic11$);
        module0340.f22941((SubLObject)module0471.$ic13$, (SubLObject)module0471.$ic14$);
        return (SubLObject)module0471.NIL;
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
        module0471.$g3680$ = null;
        module0471.$g3681$ = null;
        $ic0$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlMt"));
        $ic1$ = SubLObjectFactory.makeKeyword("POS");
        $ic2$ = SubLObjectFactory.makeKeyword("NEG");
        $ic3$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("InferencePSC")));
        $ic4$ = SubLObjectFactory.makeKeyword("GENLMT");
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#34609", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13096", "CYC"));
        $ic6$ = SubLObjectFactory.makeKeyword("REMOVAL-GENLMT-CHECK");
        $ic7$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlMt")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlMt")), (SubLObject)SubLObjectFactory.makeKeyword("CLOSED-HLMT"), (SubLObject)SubLObjectFactory.makeKeyword("CLOSED-HLMT")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#34940", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34930", "CYC"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$genlMt #$GermanLexicalMt #$CrossLinguisticLexicalMt)") });
        $ic8$ = SubLObjectFactory.makeKeyword("REMOVAL-ALL-GENLMT");
        $ic9$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlMt")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlMt")), (SubLObject)SubLObjectFactory.makeKeyword("CLOSED-HLMT"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#34932", "CYC"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlMt")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#34942", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#34942", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#34933", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlMt")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#34942", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("GENLMT"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("DEFAULT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$genlMt <closed-hlmt> <not-fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$genlMt #$GermanLexicalMt ?GENL-MT)") });
        $ic10$ = SubLObjectFactory.makeKeyword("REMOVAL-ALL-SPEC-MTS");
        $ic11$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlMt")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlMt")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("CLOSED-HLMT")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#34935", "CYC"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlMt")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#13096", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13096", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#34936", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlMt")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13096", "CYC"))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("GENLMT"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("DEFAULT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$genlMt <not-fully-bound> <closed-hlmt>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$genlMt ?SPEC-MT #$GermanLexicalMt)") });
        $ic12$ = SubLObjectFactory.makeKeyword("MINIMIZE");
        $ic13$ = SubLObjectFactory.makeKeyword("REMOVAL-NOT-GENLMT-CHECK");
        $ic14$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlMt")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlMt")), (SubLObject)SubLObjectFactory.makeKeyword("CLOSED-HLMT"), (SubLObject)SubLObjectFactory.makeKeyword("CLOSED-HLMT")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#34941", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34938", "CYC") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0471.class
	Total time: 107 ms
	
	Decompiled with Procyon 0.5.32.
*/