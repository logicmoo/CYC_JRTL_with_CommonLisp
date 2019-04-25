package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0482 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0482";
    public static final String myFingerPrint = "8b1870ef90c82e8c15c150b66ddf7099a0f1137297f42360f41b9252f14ad7c4";
    private static SubLSymbol $g3698$;
    private static SubLSymbol $g3699$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLList $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    
    public static SubLObject f31837(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        return module0038.f2684(module0038.f2623(var1, var3, (SubLObject)UNPROVIDED), var2);
    }
    
    public static SubLObject f31838(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        return (SubLObject)makeBoolean(NIL == f31837(var1, var2, var3));
    }
    
    public static SubLObject f31839(final SubLObject var1, final SubLObject var2) {
        return module0038.f2689(var2, var1, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31840() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0482", "f31837", "S#35170", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0482", "f31838", "S#35171", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0482", "f31839", "S#35172", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31841() {
        $g3698$ = SubLFiles.deflexical("S#35173", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic0$)) ? $g3698$.getGlobalValue() : ONE_INTEGER));
        $g3699$ = SubLFiles.deflexical("S#35174", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic5$)) ? $g3699$.getGlobalValue() : ONE_INTEGER));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31842() {
        module0003.f57((SubLObject)$ic0$);
        module0340.f22941((SubLObject)$ic1$, (SubLObject)$ic2$);
        module0340.f22941((SubLObject)$ic3$, (SubLObject)$ic4$);
        module0003.f57((SubLObject)$ic5$);
        module0340.f22941((SubLObject)$ic6$, (SubLObject)$ic7$);
        module0340.f22941((SubLObject)$ic8$, (SubLObject)$ic9$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f31840();
    }
    
    public void initializeVariables() {
        f31841();
    }
    
    public void runTopLevelForms() {
        f31842();
    }
    
    static {
        me = (SubLFile)new module0482();
        $g3698$ = null;
        $g3699$ = null;
        $ic0$ = makeSymbol("S#35173", "CYC");
        $ic1$ = makeKeyword("REMOVAL-START-OFFSET-CHECK-POS");
        $ic2$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("startOffset")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("startOffset")), (SubLObject)makeKeyword("STRING"), (SubLObject)makeKeyword("STRING"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35173", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("startOffset")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35175", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35176", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35177", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35175", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35176", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35177", "CYC")))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35170", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35175", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35176", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35177", "CYC"))), makeKeyword("DOCUMENTATION"), makeString("(#$startOffset <string> <string> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$startOffset \"food\" \"foo\" 0)") });
        $ic3$ = makeKeyword("REMOVAL-START-OFFSET-CHECK-NEG");
        $ic4$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("startOffset")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("startOffset")), (SubLObject)makeKeyword("STRING"), (SubLObject)makeKeyword("STRING"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35173", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("startOffset")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35175", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35176", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35177", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35175", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35176", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35177", "CYC")))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35171", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35175", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35176", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35177", "CYC"))), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$startOffset <string> <string> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$startOffset \"foo\" \"bar\" 0))") });
        $ic5$ = makeSymbol("S#35174", "CYC");
        $ic6$ = makeKeyword("REMOVAL-START-OFFSET-UNIFY-ARG3-POS");
        $ic7$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("startOffset")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("startOffset")), (SubLObject)makeKeyword("STRING"), (SubLObject)makeKeyword("STRING"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35174", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("startOffset")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35175", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35176", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35177", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35175", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35176", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35177", "CYC")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35172", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35175", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35176", "CYC"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("startOffset")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35175", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35176", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$startOffset <string> <string> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$startOffset \"food\" \"foo\" ?N)") });
        $ic8$ = makeKeyword("REMOVAL-START-OFFSET-DELAY");
        $ic9$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("startOffset")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("OR"), (SubLObject)ConsesLow.listS(constant_handles_oc.f8479((SubLObject)makeString("startOffset")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("startOffset")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING"))), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("REQUIRED"), makeSymbol("FALSE"), makeKeyword("DOCUMENTATION"), makeString("Delay module that ensures that \n    (#$startOffset . ARGS)\n    is not worked on if one of first two arguments is not fully bound."), makeKeyword("EXAMPLE"), makeString("(#$startOffset ?X ?Y 10)") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 66 ms
	
	Decompiled with Procyon 0.5.32.
*/