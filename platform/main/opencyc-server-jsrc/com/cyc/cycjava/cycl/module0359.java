package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23779() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23780() {
        module0358.f23730((SubLObject)$ic0$, (SubLObject)$ic1$);
        module0358.f23730((SubLObject)$ic2$, (SubLObject)$ic3$);
        module0358.f23730((SubLObject)$ic4$, (SubLObject)$ic5$);
        return (SubLObject)NIL;
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
        $ic0$ = makeKeyword("ABNORMAL-DELAY-POS");
        $ic1$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("abnormal")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("abnormal")), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("DISALLOWED"));
        $ic2$ = makeKeyword("INCREASE-OR-DECREASE-IN-VALUE-RETURNED-BY-NOT-FULLY-BOUND");
        $ic3$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("ANY-PREDICATES"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("decreaseInValueReturnedBy")), constant_handles_oc.f8479((SubLObject)makeString("increaseInValueReturnedBy"))), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("OR"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND"))), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic4$ = makeKeyword("REQUIRE-ARG1-FULLY-BOUND-GENERAL");
        $ic5$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("ANY-PREDICATES"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("candidateTriggerSituationTypes"))), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.listS((SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("DISALLOWED"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 44 ms
	
	Decompiled with Procyon 0.5.32.
*/