package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0515 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0515";
    public static final String myFingerPrint = "1959364b4582ae9b9e9bf72f2a0ff961803c07a48542748f344b058668ce79aa";
    private static SubLSymbol $g3849$;
    private static SubLSymbol $g3850$;
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLObject $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLObject $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLObject $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
    
    public static SubLObject f32522(final SubLObject var1) {
        if (module0515.NIL != module0173.f10955(var1) && module0515.NIL == module0217.f14342(var1)) {
            return module0217.f14336(var1);
        }
        return (SubLObject)module0515.NIL;
    }
    
    public static SubLObject f32523(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)module0515.NIL;
        if (module0515.NIL != module0173.f10955(var1) && module0515.NIL != module0173.f10955(var2)) {
            final SubLObject var5 = module0147.$g2094$.currentBinding(var3);
            final SubLObject var6 = module0147.$g2095$.currentBinding(var3);
            try {
                module0147.$g2094$.bind((SubLObject)module0515.$ic5$, var3);
                module0147.$g2095$.bind(var1, var3);
                var4 = module0217.f14358(var2);
            }
            finally {
                module0147.$g2095$.rebind(var6, var3);
                module0147.$g2094$.rebind(var5, var3);
            }
        }
        return var4;
    }
    
    public static SubLObject f32524(final SubLObject var7) {
        SubLObject var8 = (SubLObject)module0515.NIL;
        if (module0515.NIL != module0202.f12677(var7)) {
            final SubLObject var9 = module0202.f12760(var7);
            var8 = module0549.f33960(var9, (SubLObject)module0515.NIL, (SubLObject)module0515.$ic9$);
        }
        return var8;
    }
    
    public static SubLObject f32525(final SubLObject var9) {
        if (module0515.NIL != module0178.f11284(var9)) {
            final SubLObject var10 = module0178.f11332(var9);
            if (var10.eql(module0515.$ic10$) || module0515.NIL != module0269.f17765(var10) || module0515.NIL != module0269.f17809(var10, (SubLObject)module0515.UNPROVIDED)) {
                return (SubLObject)module0515.T;
            }
        }
        return (SubLObject)module0515.NIL;
    }
    
    public static SubLObject f32526() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0515", "f32522", "S#35962", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0515", "f32523", "S#35963", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0515", "f32524", "S#35964", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0515", "f32525", "S#35965", 1, 0, false);
        return (SubLObject)module0515.NIL;
    }
    
    public static SubLObject f32527() {
        module0515.$g3849$ = SubLFiles.deflexical("S#35966", (SubLObject)module0515.ONE_INTEGER);
        module0515.$g3850$ = SubLFiles.deflexical("S#35967", (SubLObject)module0515.ONE_INTEGER);
        return (SubLObject)module0515.NIL;
    }
    
    public static SubLObject f32528() {
        module0340.f22938(module0515.$ic0$);
        module0358.f23771((SubLObject)module0515.$ic1$, module0515.$ic0$, (SubLObject)module0515.ONE_INTEGER);
        module0340.f22941((SubLObject)module0515.$ic2$, (SubLObject)module0515.$ic3$);
        module0340.f22938(module0515.$ic4$);
        module0358.f23771((SubLObject)module0515.$ic1$, module0515.$ic4$, (SubLObject)module0515.ONE_INTEGER);
        module0358.f23771((SubLObject)module0515.$ic1$, module0515.$ic4$, (SubLObject)module0515.TWO_INTEGER);
        module0340.f22941((SubLObject)module0515.$ic6$, (SubLObject)module0515.$ic7$);
        module0340.f22938(module0515.$ic8$);
        module0358.f23771((SubLObject)module0515.$ic1$, module0515.$ic8$, (SubLObject)module0515.TWO_INTEGER);
        module0012.f419((SubLObject)module0515.$ic9$);
        module0340.f22941((SubLObject)module0515.$ic11$, (SubLObject)module0515.$ic12$);
        return (SubLObject)module0515.NIL;
    }
    
    public void declareFunctions() {
        f32526();
    }
    
    public void initializeVariables() {
        f32527();
    }
    
    public void runTopLevelForms() {
        f32528();
    }
    
    static {
        me = (SubLFile)new module0515();
        module0515.$g3849$ = null;
        module0515.$g3850$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("mtCardinality"));
        $ic1$ = SubLObjectFactory.makeKeyword("POS");
        $ic2$ = SubLObjectFactory.makeKeyword("REMOVAL-MT-CARDINALITY-GENERATE");
        $ic3$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("mtCardinality")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("mtCardinality")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#35966", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("mtCardinality")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#10716", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35962", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("mtCardinality")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*MT*"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$mtCardinality <fort> <not-fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$mtCardinality #$CyclistsMt ?COUNT)") });
        $ic4$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("mtCardinalityForTerm"));
        $ic5$ = SubLObjectFactory.makeSymbol("S#12276", "CYC");
        $ic6$ = SubLObjectFactory.makeKeyword("REMOVAL-MT-CARDINALITY-FOR-TERM-GENERATE");
        $ic7$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("mtCardinalityForTerm")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("mtCardinalityForTerm")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#35967", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("mtCardinalityForTerm")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)SubLObjectFactory.makeKeyword("NA")), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#10716", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35963", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("mtCardinalityForTerm")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*MT*"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$mtCardinalityForTerm <fort> <fort> <not-fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$mtCardinalityForTerm #$CyclistsMt #$Cyc ?COUNT)") });
        $ic8$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("assertionCountForTermsInSet"));
        $ic9$ = SubLObjectFactory.makeSymbol("S#35965", "CYC");
        $ic10$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("quotedIsa"));
        $ic11$ = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-COUNT-FOR-TERMS-SET-GENERATE");
        $ic12$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("assertionCountForTermsInSet")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("assertionCountForTermsInSet")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), module0515.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("assertionCountForTermsInSet")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#35968", "CYC"))), (SubLObject)SubLObjectFactory.makeKeyword("NA")), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#10716", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35964", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#35968", "CYC")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("assertionCountForTermsInSet")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#35968", "CYC"))), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*MT*"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertionCountForTermsInSet <not-fully-bound> <el-set>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$isa CyclistsMt (#$assertionCountForTermsInSet ?COUNT #$Cyc)") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0515.class
	Total time: 94 ms
	
	Decompiled with Procyon 0.5.32.
*/