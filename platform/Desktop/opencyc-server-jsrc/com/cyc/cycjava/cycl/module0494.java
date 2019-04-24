package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0494 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0494";
    public static final String myFingerPrint = "c16be27bff08b7e1f8f99df67c87a0daca60ac7d257b40cf4add7396e549f798";
    public static SubLSymbol $g3768$;
    public static SubLSymbol $g3769$;
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLObject $ic4$;
    private static final SubLObject $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLObject $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLObject $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
    
    public static SubLObject f32115(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0494.NIL != module0608.f37152(var1) || module0494.NIL != module0552.f34136(var1, (SubLObject)module0494.UNPROVIDED));
    }
    
    public static SubLObject f32116(final SubLObject var2) {
        return module0229.f15243((SubLObject)ConsesLow.list(module0494.$ic5$, var2));
    }
    
    public static SubLObject f32117(final SubLObject var2) {
        return module0229.f15243((SubLObject)ConsesLow.list(module0494.$ic10$, var2));
    }
    
    public static SubLObject f32118() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0494", "f32115", "S#35503", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0494", "f32116", "S#35504", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0494", "f32117", "S#35505", 1, 0, false);
        return (SubLObject)module0494.NIL;
    }
    
    public static SubLObject f32119() {
        module0494.$g3768$ = SubLFiles.deflexical("S#35506", (module0494.NIL != Symbols.boundp((SubLObject)module0494.$ic3$)) ? module0494.$g3768$.getGlobalValue() : module0494.$ic4$);
        module0494.$g3769$ = SubLFiles.deflexical("S#35507", (module0494.NIL != Symbols.boundp((SubLObject)module0494.$ic9$)) ? module0494.$g3769$.getGlobalValue() : module0494.$ic4$);
        return (SubLObject)module0494.NIL;
    }
    
    public static SubLObject f32120() {
        module0340.f22938(module0494.$ic0$);
        module0358.f23771((SubLObject)module0494.$ic1$, module0494.$ic0$, (SubLObject)module0494.ONE_INTEGER);
        module0340.f22944(module0494.$ic0$, (SubLObject)module0494.$ic2$);
        module0003.f57((SubLObject)module0494.$ic3$);
        module0132.f8593((SubLObject)module0494.$ic3$, module0494.$ic0$);
        module0340.f22941((SubLObject)module0494.$ic6$, (SubLObject)module0494.$ic7$);
        module0340.f22938(module0494.$ic8$);
        module0358.f23771((SubLObject)module0494.$ic1$, module0494.$ic8$, (SubLObject)module0494.ONE_INTEGER);
        module0340.f22944(module0494.$ic8$, (SubLObject)module0494.$ic2$);
        module0003.f57((SubLObject)module0494.$ic9$);
        module0132.f8593((SubLObject)module0494.$ic9$, module0494.$ic8$);
        module0340.f22941((SubLObject)module0494.$ic11$, (SubLObject)module0494.$ic12$);
        return (SubLObject)module0494.NIL;
    }
    
    public void declareFunctions() {
        f32118();
    }
    
    public void initializeVariables() {
        f32119();
    }
    
    public void runTopLevelForms() {
        f32120();
    }
    
    static {
        me = (SubLFile)new module0494();
        module0494.$g3768$ = null;
        module0494.$g3769$ = null;
        $ic0$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("minQuantValue"));
        $ic1$ = SubLObjectFactory.makeKeyword("POS");
        $ic2$ = SubLObjectFactory.makeKeyword("REMOVAL-LOOKUP-POS");
        $ic3$ = SubLObjectFactory.makeSymbol("S#35506", "CYC");
        $ic4$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $ic5$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("MinQuantValueFn"));
        $ic6$ = SubLObjectFactory.makeKeyword("REMOVAL-MIN-QUANT-VALUE-POS");
        $ic7$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("minQuantValue")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("minQuantValue")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#35503", "CYC"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), module0494.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("minQuantValue")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#35508", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#35508", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#10716", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35504", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("minQuantValue")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#35508", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("S#35506", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$minQuantValue <numberp> <whatever>) or\n    (#$minQuantValue (<unit> <min/max>) <whatever>) or\n    (#$minQuantValue (<unit> <min> <max>) <whatever>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$minQuantValue 212 ?VAL)\n    (#$minQuantValue (#$Unity 212) 212)\n    (#$minQuantValue (#$Meter 2 3) (#$Meter ?VAL)") });
        $ic8$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("maxQuantValue"));
        $ic9$ = SubLObjectFactory.makeSymbol("S#35507", "CYC");
        $ic10$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("MaxQuantValueFn"));
        $ic11$ = SubLObjectFactory.makeKeyword("REMOVAL-MAX-QUANT-VALUE-POS");
        $ic12$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("maxQuantValue")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("maxQuantValue")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#35503", "CYC"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), module0494.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("maxQuantValue")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#35508", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#35508", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#10716", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35505", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("maxQuantValue")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#35508", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("S#35507", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$maxQuantValue <numberp> <whatever>) or\n    (#$maxQuantValue (<unit> <min/max>) <whatever>) or\n    (#$maxQuantValue (<unit> <min> <max>) <whatever>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$maxQuantValue 212 ?VAL)\n    (#$maxQuantValue (#$Unity 212) 212)\n    (#$maxQuantValue (#$Meter 2 3) (#$Meter ?VAL)") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0494.class
	Total time: 64 ms
	
	Decompiled with Procyon 0.5.32.
*/