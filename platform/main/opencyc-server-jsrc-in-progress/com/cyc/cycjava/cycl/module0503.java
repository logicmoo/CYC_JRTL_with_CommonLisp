package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0503 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0503";
    public static final String myFingerPrint = "7b1642bca02fe06f05beab0d0426d61085fe3e418da3c597aad8eafadd818ff8";
    private static SubLSymbol $g3803$;
    private static SubLSymbol $g3804$;
    private static final SubLObject $ic0$;
    private static final SubLObject $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLObject $ic3$;
    private static final SubLObject $ic4$;
    private static final SubLObject $ic5$;
    private static final SubLObject $ic6$;
    private static final SubLObject $ic7$;
    private static final SubLObject $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLList $ic14$;
    private static final SubLFloat $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLList $ic17$;
    
    public static SubLObject f32353(final SubLObject var1) {
        if (module0205.f13136(var1).eql($ic1$)) {
            final SubLObject var2 = module0205.f13203(var1, (SubLObject)UNPROVIDED);
            final SubLObject var3 = deduction_handles_oc.f11675(var2);
            return var3;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32354(final SubLObject var4, final SubLObject var5) {
        if (module0205.f13136(var5).eql($ic1$)) {
            final SubLObject var6 = f32353(var5);
            return conses_high.member(var6, module0178.f11380(var4), Symbols.symbol_function((SubLObject)$ic2$), (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32355(final SubLObject var4, final SubLObject var6) {
        if (NIL != module0259.f16854(var6, $ic3$, $ic4$, (SubLObject)UNPROVIDED)) {
            final SubLObject var7 = module0220.f14554(var6, $ic5$, $ic6$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var8 = module0205.f13204(var7, (SubLObject)UNPROVIDED);
            return conses_high.member(var8, module0178.f11299(var4), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32356(final SubLObject var4, final SubLObject var9) {
        if (NIL != module0259.f16854(var9, $ic3$, $ic4$, (SubLObject)UNPROVIDED)) {
            return f32355(var4, var9);
        }
        if (module0205.f13136(var9).eql($ic1$)) {
            return f32354(var4, var9);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32357(final SubLObject var4) {
        final SubLObject var5 = module0178.f11299(var4);
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = var5;
        SubLObject var8 = (SubLObject)NIL;
        var8 = var7.first();
        while (NIL != var7) {
            if (NIL != deduction_handles_oc.f11659(var8)) {
                final SubLObject var9 = deduction_handles_oc.f11649(var8);
                final SubLObject var10 = (SubLObject)ConsesLow.list($ic1$, var9);
                var6 = (SubLObject)ConsesLow.cons(var10, var6);
            }
            else if (NIL != module0191.f11932(var8)) {
                final SubLObject var11 = var8;
                final SubLObject var12 = (SubLObject)ConsesLow.list($ic7$, $ic3$, (SubLObject)ConsesLow.list($ic8$, var11));
                var6 = (SubLObject)ConsesLow.cons(var12, var6);
            }
            var7 = var7.rest();
            var8 = var7.first();
        }
        return var6;
    }
    
    public static SubLObject f32358() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0503", "f32353", "S#35761", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0503", "f32354", "S#35762", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0503", "f32355", "S#35763", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0503", "f32356", "S#35764", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0503", "f32357", "S#35765", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32359() {
        $g3803$ = SubLFiles.defparameter("S#35766", module0018.$g659$.getGlobalValue());
        $g3804$ = SubLFiles.deflexical("S#35767", (SubLObject)$ic15$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32360() {
        module0340.f22938($ic0$);
        module0358.f23771((SubLObject)$ic9$, $ic0$, (SubLObject)ONE_INTEGER);
        module0358.f23773((SubLObject)$ic10$, $ic0$);
        module0340.f22941((SubLObject)$ic11$, (SubLObject)$ic12$);
        module0340.f22941((SubLObject)$ic13$, (SubLObject)$ic14$);
        module0340.f22941((SubLObject)$ic16$, (SubLObject)$ic17$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f32358();
    }
    
    public void initializeVariables() {
        f32359();
    }
    
    public void runTopLevelForms() {
        f32360();
    }
    
    static {
        me = (SubLFile)new module0503();
        $g3803$ = null;
        $g3804$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("assertionArguments"));
        $ic1$ = constant_handles_oc.f8479((SubLObject)makeString("CycDeductionDatastructureFn"));
        $ic2$ = makeSymbol("ARGUMENT-EQUAL");
        $ic3$ = constant_handles_oc.f8479((SubLObject)makeString("HLAssertedArgumentKeywordDatastructure"));
        $ic4$ = constant_handles_oc.f8479((SubLObject)makeString("CycArchitectureMt"));
        $ic5$ = constant_handles_oc.f8479((SubLObject)makeString("subLIdentifier"));
        $ic6$ = constant_handles_oc.f8479((SubLObject)makeString("CycAPIMt"));
        $ic7$ = constant_handles_oc.f8479((SubLObject)makeString("SubLSymbolEntityFn"));
        $ic8$ = constant_handles_oc.f8479((SubLObject)makeString("SubLQuoteFn"));
        $ic9$ = makeKeyword("POS");
        $ic10$ = makeKeyword("NEG");
        $ic11$ = makeKeyword("REMOVAL-ASSERTION-ARGUMENTS-CHECK-POS");
        $ic12$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertionArguments")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionArguments")), (SubLObject)makeKeyword("ASSERTION"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35766", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionArguments")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#9952", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#9952", "CYC")))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("ASSERTION", "CYC"), (SubLObject)makeSymbol("S#9952", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35764", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#9952", "CYC")))), makeKeyword("DOCUMENTATION"), makeString("(#$assertionArguments <assertion> <fully-bound-p>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionArguments  \n     (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate)) #$AssertedTrueMonotonic)") });
        $ic13$ = makeKeyword("REMOVAL-ASSERTION-ARGUMENTS-CHECK-NEG");
        $ic14$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertionArguments")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionArguments")), (SubLObject)makeKeyword("ASSERTION"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35766", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionArguments")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#9952", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#9952", "CYC")))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("ASSERTION", "CYC"), (SubLObject)makeSymbol("S#9952", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#33876", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35764", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#9952", "CYC"))))), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertionArguments <assertion> <fully-bound-p>))"), makeKeyword("EXAMPLE"), makeString("(#$not #$assertionArguments \n     (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate)) #$AssertedTrueDefault))") });
        $ic15$ = (SubLFloat)makeDouble(1.1);
        $ic16$ = makeKeyword("REMOVAL-ASSERTION-ARGUMENT-UNIFY");
        $ic17$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertionArguments")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionArguments")), (SubLObject)makeKeyword("ASSERTION"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35767", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionArguments")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35765", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionArguments")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$assertionArguments <assertion> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionArguments\n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      ?ARG)") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 95 ms
	
	Decompiled with Procyon 0.5.32.
*/