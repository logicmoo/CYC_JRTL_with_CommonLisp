package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0506 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0506";
    public static final String myFingerPrint = "edee9dfa29f4050f2566e2b05414ac0817cad25cf66391acf6dbf9c5fe1fb7b4";
    private static SubLSymbol $g3809$;
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLObject $ic3$;
    private static final SubLObject $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    
    public static SubLObject f32371(final SubLObject var1) {
        final SubLObject var2 = module0178.f11299(var1);
        SubLObject var3 = (SubLObject)module0506.NIL;
        SubLObject var4 = var2;
        SubLObject var5 = (SubLObject)module0506.NIL;
        var5 = var4.first();
        while (module0506.NIL != var4) {
            if (module0506.NIL != module0191.f11932(var5)) {
                final SubLObject var6 = module0219.f14525(module0506.$ic3$);
                SubLObject var7 = (SubLObject)module0506.NIL;
                SubLObject var8 = (SubLObject)module0506.NIL;
                SubLObject var9 = (SubLObject)module0506.NIL;
                SubLObject var4_10 = var6;
                SubLObject var10 = (SubLObject)module0506.NIL;
                var10 = var4_10.first();
                while (module0506.NIL != var4_10) {
                    if (module0205.f13136(var10).eql(module0506.$ic4$)) {
                        var7 = module0205.f13204(var10, (SubLObject)module0506.UNPROVIDED);
                        var9 = module0205.f13204(var7, (SubLObject)module0506.UNPROVIDED);
                        if (var9.eql(var5)) {
                            var8 = module0205.f13203(var10, (SubLObject)module0506.UNPROVIDED);
                            var3 = (SubLObject)ConsesLow.cons(var8, var3);
                        }
                    }
                    var4_10 = var4_10.rest();
                    var10 = var4_10.first();
                }
            }
            var4 = var4.rest();
            var5 = var4.first();
        }
        return var3;
    }
    
    public static SubLObject f32372() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0506", "f32371", "S#35776", 1, 0, false);
        return (SubLObject)module0506.NIL;
    }
    
    public static SubLObject f32373() {
        module0506.$g3809$ = SubLFiles.defparameter("S#35777", module0018.$g659$.getGlobalValue());
        return (SubLObject)module0506.NIL;
    }
    
    public static SubLObject f32374() {
        module0340.f22938(module0506.$ic0$);
        module0358.f23771((SubLObject)module0506.$ic1$, module0506.$ic0$, (SubLObject)module0506.ONE_INTEGER);
        module0358.f23773((SubLObject)module0506.$ic2$, module0506.$ic0$);
        module0340.f22941((SubLObject)module0506.$ic5$, (SubLObject)module0506.$ic6$);
        module0340.f22941((SubLObject)module0506.$ic7$, (SubLObject)module0506.$ic8$);
        module0340.f22941((SubLObject)module0506.$ic9$, (SubLObject)module0506.$ic10$);
        return (SubLObject)module0506.NIL;
    }
    
    public void declareFunctions() {
        f32372();
    }
    
    public void initializeVariables() {
        f32373();
    }
    
    public void runTopLevelForms() {
        f32374();
    }
    
    static {
        me = (SubLFile)new module0506();
        module0506.$g3809$ = null;
        $ic0$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertionHLAssertedArgumentKeyword"));
        $ic1$ = SubLObjectFactory.makeKeyword("POS");
        $ic2$ = SubLObjectFactory.makeKeyword("NEG");
        $ic3$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ExpandSubLFn"));
        $ic4$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("subLIdentifier"));
        $ic5$ = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-HL-ASSERTED-ARGUMENT-KEYWORD-CHECK-POS");
        $ic6$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertionHLAssertedArgumentKeyword")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertionHLAssertedArgumentKeyword")), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#35777", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertionHLAssertedArgumentKeyword")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORD"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORD")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35763", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORD")))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertionHLAssertedArgumentKeyword <assertion> <fully-bound-p>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertionHLAssertedArgumentKeyword  \n     (#$ist #$UniversalVocabularyMt (#$arg1Isa #$isa #$Thing)) \n     #$AssertedTrueMonotonic)") });
        $ic7$ = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-HL-ASSERTED-ARGUMENT-KEYWORD-CHECK-NEG");
        $ic8$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertionHLAssertedArgumentKeyword")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertionHLAssertedArgumentKeyword")), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#35777", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertionHLAssertedArgumentKeyword")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORD"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORD")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#33876", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35763", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORD"))))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$assertionHLAssertedArgumentKeyword <assertion> <fully-bound-p>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not #$assertionHLAssertedArgumentKeyword\n      (#$ist #$UniversalVocabularyMt (#$arg1Isa #$isa #$Thing)) \n      #$AssertedTrueMonotonic)") });
        $ic9$ = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-HL-ASSERTED-ARGUMENT-KEYWORD-UNIFY");
        $ic10$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertionHLAssertedArgumentKeyword")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertionHLAssertedArgumentKeyword")), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), module0506.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertionHLAssertedArgumentKeyword")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35765", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertionHLAssertedArgumentKeyword")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertionHLAssertedArgumentKeyword <assertion> <not fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertionHLAssertedArgumentKeyword\n      (#$ist #$UniversalVocabularyMt (#$arg1Isa #$isa #$Thing))\n      ?KEYWORD)") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0506.class
	Total time: 75 ms
	
	Decompiled with Procyon 0.5.32.
*/