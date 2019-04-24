package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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
        return conses_high.member(var2, module0188.f11770(var1), (SubLObject)module0504.UNPROVIDED, (SubLObject)module0504.UNPROVIDED);
    }
    
    public static SubLObject f32362(final SubLObject var3) {
        SubLObject var4 = (SubLObject)module0504.NIL;
        SubLObject var5 = (SubLObject)module0504.NIL;
        if (!module0205.f13136(var3).eql(module0504.$ic3$)) {
            return (SubLObject)module0504.NIL;
        }
        var4 = module0205.f13203(var3, (SubLObject)module0504.UNPROVIDED);
        var5 = module0184.f11675(var4);
        if (module0504.NIL != module0184.f11659(var5)) {
            return var5;
        }
        return (SubLObject)module0504.NIL;
    }
    
    public static SubLObject f32363(final SubLObject var3) {
        SubLObject var4 = (SubLObject)module0504.NIL;
        SubLObject var5 = (SubLObject)module0504.NIL;
        if (!module0205.f13136(var3).eql(module0504.$ic3$)) {
            return (SubLObject)module0504.NIL;
        }
        var4 = f32362(var3);
        if (module0504.NIL != module0184.f11659(var4)) {
            var5 = module0188.f11770(var4);
            return var5;
        }
        return (SubLObject)module0504.NIL;
    }
    
    public static SubLObject f32364() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0504", "f32361", "S#35768", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0504", "f32362", "S#35769", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0504", "f32363", "S#35770", 1, 0, false);
        return (SubLObject)module0504.NIL;
    }
    
    public static SubLObject f32365() {
        module0504.$g3805$ = SubLFiles.defparameter("S#35771", module0018.$g659$.getGlobalValue());
        module0504.$g3806$ = SubLFiles.deflexical("S#35772", (SubLObject)module0504.THREE_INTEGER);
        return (SubLObject)module0504.NIL;
    }
    
    public static SubLObject f32366() {
        module0340.f22938(module0504.$ic0$);
        module0358.f23771((SubLObject)module0504.$ic1$, module0504.$ic0$, (SubLObject)module0504.ONE_INTEGER);
        module0358.f23773((SubLObject)module0504.$ic2$, module0504.$ic0$);
        module0340.f22941((SubLObject)module0504.$ic4$, (SubLObject)module0504.$ic5$);
        return (SubLObject)module0504.NIL;
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
        module0504.$g3805$ = null;
        module0504.$g3806$ = null;
        $ic0$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("deductionSupports"));
        $ic1$ = SubLObjectFactory.makeKeyword("POS");
        $ic2$ = SubLObjectFactory.makeKeyword("NEG");
        $ic3$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CycDeductionDatastructureFn"));
        $ic4$ = SubLObjectFactory.makeKeyword("REMOVAL-DEDUCTION-SUPPORT-UNIFY");
        $ic5$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("deductionSupports")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("deductionSupports")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#35772", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("deductionSupports")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#14450", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#14450", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35770", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("deductionSupports")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#14450", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$deductionSupports <deduction-term> <not fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$deductionSupports \n      (#$CycDeductionDatastructureFn 408468)\n      ?SUPPORT)") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0504.class
	Total time: 52 ms
	
	Decompiled with Procyon 0.5.32.
*/