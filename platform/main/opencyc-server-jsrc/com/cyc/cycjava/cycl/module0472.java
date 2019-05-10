package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0472 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0472";
    public static final String myFingerPrint = "fb566c69ffa4a5fd606d82e4c1773f9db984b3714a0bffad324c0f512a415e0b";
    private static SubLSymbol $g3682$;
    private static SubLSymbol $g3683$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLObject $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    
    public static SubLObject f31595(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        SubLObject var4;
        final SubLObject var3 = var4 = module0205.f13385(var1, (SubLObject)UNPROVIDED);
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            if (NIL != module0260.f17091(var5, var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                module0347.f23330(module0191.f11990((SubLObject)$ic1$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic0$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31596(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0549.f33899(module0205.f13387(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31597(final SubLObject var5) {
        return module0052.f3709(module0260.f17032(var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31598(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0549.f33901(module0205.f13388(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31599(final SubLObject var6) {
        return module0052.f3709(module0260.f17034(var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31600(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var5;
        final SubLObject var4 = var5 = module0205.f13385(var1, (SubLObject)UNPROVIDED);
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic0$);
        var6 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic0$);
        var7 = var5.first();
        var5 = var5.rest();
        if (NIL == var5) {
            if (NIL != module0018.$g646$.getDynamicValue(var3) && NIL == module0260.f17091(var6, var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                module0347.f23330(module0191.f11990((SubLObject)$ic8$, module0205.f13338(var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else if (NIL != module0260.f17103(var6, var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                module0347.f23330(module0191.f11990((SubLObject)$ic1$, module0205.f13338(var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic0$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31601() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0472", "f31595", "S#34943", 1, 1, false);
        new $f31595$UnaryFunction();
        new $f31595$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0472", "f31596", "S#34944", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0472", "f31597", "S#34945", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0472", "f31598", "S#34946", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0472", "f31599", "S#34947", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0472", "f31600", "S#34948", 1, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31602() {
        $g3682$ = SubLFiles.defparameter("S#34949", module0018.$g658$.getDynamicValue());
        $g3683$ = SubLFiles.defparameter("S#34950", (SubLObject)TWO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31603() {
        module0340.f22941((SubLObject)$ic2$, (SubLObject)$ic3$);
        module0340.f22941((SubLObject)$ic4$, (SubLObject)$ic5$);
        module0340.f22941((SubLObject)$ic6$, (SubLObject)$ic7$);
        module0340.f22941((SubLObject)$ic9$, (SubLObject)$ic10$);
        module0340.f22938($ic11$);
        module0358.f23774((SubLObject)$ic12$, $ic11$);
        module0358.f23773((SubLObject)$ic13$, $ic11$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f31601();
    }
    
    public void initializeVariables() {
        f31602();
    }
    
    public void runTopLevelForms() {
        f31603();
    }
    
    static {
        me = (SubLFile)new module0472();
        $g3682$ = null;
        $g3683$ = null;
        $ic0$ = ConsesLow.list((SubLObject)makeSymbol("S#34951", "CYC"), (SubLObject)makeSymbol("S#34952", "CYC"));
        $ic1$ = makeKeyword("GENLPREDS");
        $ic2$ = makeKeyword("REMOVAL-GENLPREDS-CHECK");
        $ic3$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("genlPreds")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genlPreds")), (SubLObject)makeKeyword("PREDICATE-FORT"), (SubLObject)makeKeyword("PREDICATE-FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34949", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34943", "CYC") });
        $ic4$ = makeKeyword("REMOVAL-ALL-GENLPREDS");
        $ic5$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("genlPreds")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genlPreds")), (SubLObject)makeKeyword("PREDICATE-FORT"), (SubLObject)makeKeyword("VARIABLE")), makeKeyword("COST"), makeSymbol("S#34944", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genlPreds")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34951", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34951", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34945", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genlPreds")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34951", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("GENLPREDS"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"), makeString("(#$genlPreds <predicate-fort> <variable>)"), makeKeyword("EXAMPLE"), makeString("(#$genlPreds #$performedBy ?WHAT)") });
        $ic6$ = makeKeyword("REMOVAL-ALL-SPEC-PREDS");
        $ic7$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("genlPreds")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genlPreds")), (SubLObject)makeKeyword("VARIABLE"), (SubLObject)makeKeyword("PREDICATE-FORT")), makeKeyword("COST"), makeSymbol("S#34946", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genlPreds")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34952", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34952", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34947", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genlPreds")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34952", "CYC"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("GENLPREDS"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"), makeString("(#$genlPreds <variable> <predicate-fort>"), makeKeyword("EXAMPLE"), makeString("(#$genlPreds ?WHAT #$performedBy)") });
        $ic8$ = makeKeyword("MINIMIZE");
        $ic9$ = makeKeyword("REMOVAL-NOT-GENLPREDS-CHECK");
        $ic10$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("genlPreds")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genlPreds")), (SubLObject)makeKeyword("PREDICATE-FORT"), (SubLObject)makeKeyword("PREDICATE-FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34950", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34948", "CYC") });
        $ic11$ = constant_handles_oc.f8479((SubLObject)makeString("genlPreds"));
        $ic12$ = makeKeyword("POS");
        $ic13$ = makeKeyword("NEG");
    }
    
    public static final class $f31595$UnaryFunction extends UnaryFunction
    {
        public $f31595$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34943"));
        }
        
        public SubLObject processItem(final SubLObject var7) {
            return f31595(var7, (SubLObject)$f31595$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f31595$BinaryFunction extends BinaryFunction
    {
        public $f31595$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34943"));
        }
        
        public SubLObject processItem(final SubLObject var7, final SubLObject var8) {
            return f31595(var7, var8);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 91 ms
	
	Decompiled with Procyon 0.5.32.
*/