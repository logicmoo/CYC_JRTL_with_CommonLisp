package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        return (SubLObject)makeBoolean(NIL != module0608.f37152(var1) || NIL != module0552.f34136(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f32116(final SubLObject var2) {
        return module0229.f15243((SubLObject)ConsesLow.list($ic5$, var2));
    }
    
    public static SubLObject f32117(final SubLObject var2) {
        return module0229.f15243((SubLObject)ConsesLow.list($ic10$, var2));
    }
    
    public static SubLObject f32118() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0494", "f32115", "S#35503", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0494", "f32116", "S#35504", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0494", "f32117", "S#35505", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32119() {
        $g3768$ = SubLFiles.deflexical("S#35506", (NIL != Symbols.boundp((SubLObject)$ic3$)) ? $g3768$.getGlobalValue() : $ic4$);
        $g3769$ = SubLFiles.deflexical("S#35507", (NIL != Symbols.boundp((SubLObject)$ic9$)) ? $g3769$.getGlobalValue() : $ic4$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32120() {
        module0340.f22938($ic0$);
        module0358.f23771((SubLObject)$ic1$, $ic0$, (SubLObject)ONE_INTEGER);
        module0340.f22944($ic0$, (SubLObject)$ic2$);
        module0003.f57((SubLObject)$ic3$);
        module0132.f8593((SubLObject)$ic3$, $ic0$);
        module0340.f22941((SubLObject)$ic6$, (SubLObject)$ic7$);
        module0340.f22938($ic8$);
        module0358.f23771((SubLObject)$ic1$, $ic8$, (SubLObject)ONE_INTEGER);
        module0340.f22944($ic8$, (SubLObject)$ic2$);
        module0003.f57((SubLObject)$ic9$);
        module0132.f8593((SubLObject)$ic9$, $ic8$);
        module0340.f22941((SubLObject)$ic11$, (SubLObject)$ic12$);
        return (SubLObject)NIL;
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
        $g3768$ = null;
        $g3769$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("minQuantValue"));
        $ic1$ = makeKeyword("POS");
        $ic2$ = makeKeyword("REMOVAL-LOOKUP-POS");
        $ic3$ = makeSymbol("S#35506", "CYC");
        $ic4$ = constant_handles_oc.f8479((SubLObject)makeString("UniversalVocabularyMt"));
        $ic5$ = constant_handles_oc.f8479((SubLObject)makeString("MinQuantValueFn"));
        $ic6$ = makeKeyword("REMOVAL-MIN-QUANT-VALUE-POS");
        $ic7$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("minQuantValue")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("minQuantValue")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#35503", "CYC"))), (SubLObject)makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("minQuantValue")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35508", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35508", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#10716", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35504", "CYC"), (SubLObject)makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("minQuantValue")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35508", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeSymbol("S#35506", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$minQuantValue <numberp> <whatever>) or\n    (#$minQuantValue (<unit> <min/max>) <whatever>) or\n    (#$minQuantValue (<unit> <min> <max>) <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$minQuantValue 212 ?VAL)\n    (#$minQuantValue (#$Unity 212) 212)\n    (#$minQuantValue (#$Meter 2 3) (#$Meter ?VAL)") });
        $ic8$ = constant_handles_oc.f8479((SubLObject)makeString("maxQuantValue"));
        $ic9$ = makeSymbol("S#35507", "CYC");
        $ic10$ = constant_handles_oc.f8479((SubLObject)makeString("MaxQuantValueFn"));
        $ic11$ = makeKeyword("REMOVAL-MAX-QUANT-VALUE-POS");
        $ic12$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("maxQuantValue")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("maxQuantValue")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#35503", "CYC"))), (SubLObject)makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("maxQuantValue")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35508", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35508", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#10716", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35505", "CYC"), (SubLObject)makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("maxQuantValue")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35508", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeSymbol("S#35507", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$maxQuantValue <numberp> <whatever>) or\n    (#$maxQuantValue (<unit> <min/max>) <whatever>) or\n    (#$maxQuantValue (<unit> <min> <max>) <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$maxQuantValue 212 ?VAL)\n    (#$maxQuantValue (#$Unity 212) 212)\n    (#$maxQuantValue (#$Meter 2 3) (#$Meter ?VAL)") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 64 ms
	
	Decompiled with Procyon 0.5.32.
*/