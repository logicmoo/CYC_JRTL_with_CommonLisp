package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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
        if (module0205.f13136(var1).eql(module0503.$ic1$)) {
            final SubLObject var2 = module0205.f13203(var1, (SubLObject)module0503.UNPROVIDED);
            final SubLObject var3 = module0184.f11675(var2);
            return var3;
        }
        return (SubLObject)module0503.NIL;
    }
    
    public static SubLObject f32354(final SubLObject var4, final SubLObject var5) {
        if (module0205.f13136(var5).eql(module0503.$ic1$)) {
            final SubLObject var6 = f32353(var5);
            return conses_high.member(var6, module0178.f11380(var4), Symbols.symbol_function((SubLObject)module0503.$ic2$), (SubLObject)module0503.UNPROVIDED);
        }
        return (SubLObject)module0503.NIL;
    }
    
    public static SubLObject f32355(final SubLObject var4, final SubLObject var6) {
        if (module0503.NIL != module0259.f16854(var6, module0503.$ic3$, module0503.$ic4$, (SubLObject)module0503.UNPROVIDED)) {
            final SubLObject var7 = module0220.f14554(var6, module0503.$ic5$, module0503.$ic6$, (SubLObject)module0503.UNPROVIDED, (SubLObject)module0503.UNPROVIDED, (SubLObject)module0503.UNPROVIDED);
            final SubLObject var8 = module0205.f13204(var7, (SubLObject)module0503.UNPROVIDED);
            return conses_high.member(var8, module0178.f11299(var4), (SubLObject)module0503.UNPROVIDED, (SubLObject)module0503.UNPROVIDED);
        }
        return (SubLObject)module0503.NIL;
    }
    
    public static SubLObject f32356(final SubLObject var4, final SubLObject var9) {
        if (module0503.NIL != module0259.f16854(var9, module0503.$ic3$, module0503.$ic4$, (SubLObject)module0503.UNPROVIDED)) {
            return f32355(var4, var9);
        }
        if (module0205.f13136(var9).eql(module0503.$ic1$)) {
            return f32354(var4, var9);
        }
        return (SubLObject)module0503.NIL;
    }
    
    public static SubLObject f32357(final SubLObject var4) {
        final SubLObject var5 = module0178.f11299(var4);
        SubLObject var6 = (SubLObject)module0503.NIL;
        SubLObject var7 = var5;
        SubLObject var8 = (SubLObject)module0503.NIL;
        var8 = var7.first();
        while (module0503.NIL != var7) {
            if (module0503.NIL != module0184.f11659(var8)) {
                final SubLObject var9 = module0184.f11649(var8);
                final SubLObject var10 = (SubLObject)ConsesLow.list(module0503.$ic1$, var9);
                var6 = (SubLObject)ConsesLow.cons(var10, var6);
            }
            else if (module0503.NIL != module0191.f11932(var8)) {
                final SubLObject var11 = var8;
                final SubLObject var12 = (SubLObject)ConsesLow.list(module0503.$ic7$, module0503.$ic3$, (SubLObject)ConsesLow.list(module0503.$ic8$, var11));
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
        return (SubLObject)module0503.NIL;
    }
    
    public static SubLObject f32359() {
        module0503.$g3803$ = SubLFiles.defparameter("S#35766", module0018.$g659$.getGlobalValue());
        module0503.$g3804$ = SubLFiles.deflexical("S#35767", (SubLObject)module0503.$ic15$);
        return (SubLObject)module0503.NIL;
    }
    
    public static SubLObject f32360() {
        module0340.f22938(module0503.$ic0$);
        module0358.f23771((SubLObject)module0503.$ic9$, module0503.$ic0$, (SubLObject)module0503.ONE_INTEGER);
        module0358.f23773((SubLObject)module0503.$ic10$, module0503.$ic0$);
        module0340.f22941((SubLObject)module0503.$ic11$, (SubLObject)module0503.$ic12$);
        module0340.f22941((SubLObject)module0503.$ic13$, (SubLObject)module0503.$ic14$);
        module0340.f22941((SubLObject)module0503.$ic16$, (SubLObject)module0503.$ic17$);
        return (SubLObject)module0503.NIL;
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
        module0503.$g3803$ = null;
        module0503.$g3804$ = null;
        $ic0$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertionArguments"));
        $ic1$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CycDeductionDatastructureFn"));
        $ic2$ = SubLObjectFactory.makeSymbol("ARGUMENT-EQUAL");
        $ic3$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("HLAssertedArgumentKeywordDatastructure"));
        $ic4$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CycArchitectureMt"));
        $ic5$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("subLIdentifier"));
        $ic6$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CycAPIMt"));
        $ic7$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("SubLSymbolEntityFn"));
        $ic8$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("SubLQuoteFn"));
        $ic9$ = SubLObjectFactory.makeKeyword("POS");
        $ic10$ = SubLObjectFactory.makeKeyword("NEG");
        $ic11$ = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-ARGUMENTS-CHECK-POS");
        $ic12$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertionArguments")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertionArguments")), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#35766", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertionArguments")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#9952", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#9952", "CYC")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9952", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35764", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#9952", "CYC")))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertionArguments <assertion> <fully-bound-p>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertionArguments  \n     (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate)) #$AssertedTrueMonotonic)") });
        $ic13$ = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-ARGUMENTS-CHECK-NEG");
        $ic14$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertionArguments")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertionArguments")), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#35766", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertionArguments")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#9952", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#9952", "CYC")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9952", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#33876", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35764", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#9952", "CYC"))))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$assertionArguments <assertion> <fully-bound-p>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not #$assertionArguments \n     (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate)) #$AssertedTrueDefault))") });
        $ic15$ = (SubLFloat)SubLObjectFactory.makeDouble(1.1);
        $ic16$ = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-ARGUMENT-UNIFY");
        $ic17$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertionArguments")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertionArguments")), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#35767", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertionArguments")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35765", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertionArguments")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertionArguments <assertion> <not fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertionArguments\n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      ?ARG)") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0503.class
	Total time: 95 ms
	
	Decompiled with Procyon 0.5.32.
*/