package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0359 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0359";
    public static final String myFingerPrint = "1230d3a84dde5f6b3fcfc688beaf0bccbc1563481458e2b3afdc6f1c259a6999";
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    
    public static SubLObject f23778() {
        return (SubLObject)module0359.NIL;
    }
    
    public static SubLObject f23779() {
        return (SubLObject)module0359.NIL;
    }
    
    public static SubLObject f23780() {
        module0358.f23730((SubLObject)module0359.$ic0$, (SubLObject)module0359.$ic1$);
        module0358.f23730((SubLObject)module0359.$ic2$, (SubLObject)module0359.$ic3$);
        module0358.f23730((SubLObject)module0359.$ic4$, (SubLObject)module0359.$ic5$);
        return (SubLObject)module0359.NIL;
    }
    
    public void declareFunctions() {
        f23778();
    }
    
    public void initializeVariables() {
        f23779();
    }
    
    public void runTopLevelForms() {
        f23780();
    }
    
    static {
        me = (SubLFile)new module0359();
        $ic0$ = SubLObjectFactory.makeKeyword("ABNORMAL-DELAY-POS");
        $ic1$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("abnormal")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("abnormal")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("DISALLOWED"));
        $ic2$ = SubLObjectFactory.makeKeyword("INCREASE-OR-DECREASE-IN-VALUE-RETURNED-BY-NOT-FULLY-BOUND");
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("ANY-PREDICATES"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("decreaseInValueReturnedBy")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("increaseInValueReturnedBy"))), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"))), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("GROSSLY-DISPREFERRED"));
        $ic4$ = SubLObjectFactory.makeKeyword("REQUIRE-ARG1-FULLY-BOUND-GENERAL");
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("ANY-PREDICATES"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("candidateTriggerSituationTypes"))), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.listS((SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("DISALLOWED"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0359.class
	Total time: 44 ms
	
	Decompiled with Procyon 0.5.32.
*/