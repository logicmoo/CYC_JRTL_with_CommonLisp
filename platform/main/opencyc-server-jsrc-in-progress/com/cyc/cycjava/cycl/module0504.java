package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0504 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0504";
    public static final String myFingerPrint = "5913588e631201f2355f794b76ff528e5b3cbab470b185f82241537cf0f1c220";
    private static SubLSymbol $g3805$;
    private static SubLSymbol $g3806$;
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLObject $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    
    public static SubLObject f32361(final SubLObject var1, final SubLObject var2) {
        return conses_high.member(var2, module0188.f11770(var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f32362(final SubLObject var3) {
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        if (!module0205.f13136(var3).eql($ic3$)) {
            return (SubLObject)NIL;
        }
        var4 = module0205.f13203(var3, (SubLObject)UNPROVIDED);
        var5 = deduction_handles_oc.f11675(var4);
        if (NIL != deduction_handles_oc.f11659(var5)) {
            return var5;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32363(final SubLObject var3) {
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        if (!module0205.f13136(var3).eql($ic3$)) {
            return (SubLObject)NIL;
        }
        var4 = f32362(var3);
        if (NIL != deduction_handles_oc.f11659(var4)) {
            var5 = module0188.f11770(var4);
            return var5;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32364() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0504", "f32361", "S#35768", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0504", "f32362", "S#35769", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0504", "f32363", "S#35770", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32365() {
        $g3805$ = SubLFiles.defparameter("S#35771", module0018.$g659$.getGlobalValue());
        $g3806$ = SubLFiles.deflexical("S#35772", (SubLObject)THREE_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32366() {
        module0340.f22938($ic0$);
        module0358.f23771((SubLObject)$ic1$, $ic0$, (SubLObject)ONE_INTEGER);
        module0358.f23773((SubLObject)$ic2$, $ic0$);
        module0340.f22941((SubLObject)$ic4$, (SubLObject)$ic5$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f32364();
    }
    
    public void initializeVariables() {
        f32365();
    }
    
    public void runTopLevelForms() {
        f32366();
    }
    
    static {
        me = (SubLFile)new module0504();
        $g3805$ = null;
        $g3806$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("deductionSupports"));
        $ic1$ = makeKeyword("POS");
        $ic2$ = makeKeyword("NEG");
        $ic3$ = constant_handles_oc.f8479((SubLObject)makeString("CycDeductionDatastructureFn"));
        $ic4$ = makeKeyword("REMOVAL-DEDUCTION-SUPPORT-UNIFY");
        $ic5$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("deductionSupports")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("deductionSupports")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35772", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("deductionSupports")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("DEDUCTION", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("DEDUCTION", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35770", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("deductionSupports")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("DEDUCTION", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$deductionSupports <deduction-term> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$deductionSupports \n      (#$CycDeductionDatastructureFn 408468)\n      ?SUPPORT)") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 52 ms
	
	Decompiled with Procyon 0.5.32.
*/