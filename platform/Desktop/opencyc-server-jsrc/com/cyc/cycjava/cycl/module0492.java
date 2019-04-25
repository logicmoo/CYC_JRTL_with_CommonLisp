package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0492 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0492";
    public static final String myFingerPrint = "efd131bd0a0ae7a325638a5a4585b292477ff7ba1762dc53f7ed032ef4d1421b";
    public static SubLSymbol $g3762$;
    private static SubLSymbol $g3763$;
    private static SubLSymbol $g3764$;
    private static SubLSymbol $g3765$;
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLList $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLObject $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLList $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    
    public static SubLObject f32095(final SubLObject var1, final SubLObject var2) {
        return (SubLObject)makeBoolean(NIL != module0035.f2171(var2, f32096(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) || NIL != module0035.f2171(var1, f32097(var2)));
    }
    
    public static SubLObject f32098(final SubLObject var1, final SubLObject var2) {
        return (SubLObject)makeBoolean(NIL == f32095(var1, var2));
    }
    
    public static SubLObject f32096(final SubLObject var1, SubLObject var3, SubLObject var4) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)$ic7$;
        }
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        return module0764.f48456(var1, var3, var4, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f32097(final SubLObject var2) {
        return module0731.f44800(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f32099(final SubLObject var5) {
        return module0191.f11990((SubLObject)$ic10$, var5, $g3762$.getGlobalValue(), (SubLObject)$ic11$);
    }
    
    public static SubLObject f32100(final SubLObject var1) {
        return module0052.f3709(f32096(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f32101(final SubLObject var2) {
        return module0052.f3709(f32097(var2));
    }
    
    public static SubLObject f32102() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0492", "f32095", "S#35482", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0492", "f32098", "S#35483", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0492", "f32096", "S#35484", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0492", "f32097", "S#35485", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0492", "f32099", "S#35486", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0492", "f32100", "S#35487", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0492", "f32101", "S#35488", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32103() {
        $g3762$ = SubLFiles.deflexical("S#35489", (NIL != Symbols.boundp((SubLObject)$ic8$)) ? $g3762$.getGlobalValue() : $ic9$);
        $g3763$ = SubLFiles.deflexical("S#35490", module0018.$g658$.getDynamicValue());
        $g3764$ = SubLFiles.deflexical("S#35491", (SubLObject)ONE_INTEGER);
        $g3765$ = SubLFiles.deflexical("S#35492", (SubLObject)ONE_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32104() {
        module0340.f22938($ic0$);
        module0358.f23730((SubLObject)$ic1$, (SubLObject)$ic2$);
        module0340.f22941((SubLObject)$ic3$, (SubLObject)$ic4$);
        module0340.f22941((SubLObject)$ic5$, (SubLObject)$ic6$);
        module0003.f57((SubLObject)$ic8$);
        module0132.f8593((SubLObject)$ic8$, $ic0$);
        module0340.f22941((SubLObject)$ic12$, (SubLObject)$ic13$);
        module0340.f22941((SubLObject)$ic14$, (SubLObject)$ic15$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f32102();
    }
    
    public void initializeVariables() {
        f32103();
    }
    
    public void runTopLevelForms() {
        f32104();
    }
    
    static {
        me = (SubLFile)new module0492();
        $g3762$ = null;
        $g3763$ = null;
        $g3764$ = null;
        $g3765$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("termStrings"));
        $ic1$ = makeKeyword("TERMSTRINGS-X-Y-POS");
        $ic2$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("termStrings")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termStrings")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic3$ = makeKeyword("REMOVAL-TERM-STRINGS-CHECK-POS");
        $ic4$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("termStrings")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termStrings")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("STRING")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35490", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termStrings")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#12141", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("STRING"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12141", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("STRING")))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("STRING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35482", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12141", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("STRING")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TERM-PHRASES"), makeKeyword("DOCUMENTATION"), makeString("(#$termStrings <fully-bound-p> <stringp>)"), makeKeyword("EXAMPLE"), makeString("(#$termStrings #$Dog \"Dog\")") });
        $ic5$ = makeKeyword("REMOVAL-TERM-STRINGS-CHECK-NEG");
        $ic6$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("termStrings")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termStrings")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("STRING")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35490", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termStrings")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#12141", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("STRING"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12141", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("STRING")))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("STRING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35483", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12141", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("STRING")))), makeKeyword("SUPPORT"), makeKeyword("TERM-PHRASES"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$termStrings <fully-bound-p> <stringp>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$termStrings #$Dog \"Cat\"))") });
        $ic7$ = makeKeyword("ALL");
        $ic8$ = makeSymbol("S#35489", "CYC");
        $ic9$ = constant_handles_oc.f8479((SubLObject)makeString("BaseKB"));
        $ic10$ = makeKeyword("OPAQUE");
        $ic11$ = makeKeyword("TRUE-MON");
        $ic12$ = makeKeyword("REMOVAL-TERM-STRINGS-UNIFY");
        $ic13$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("termStrings")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termStrings")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("VARIABLE")), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35491", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termStrings")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#12141", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12141", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35487", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termStrings")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12141", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TERM-PHRASES"), makeKeyword("DOCUMENTATION"), makeString("(#$termStrings <fully-bound-p> <variable-p>)"), makeKeyword("EXAMPLE"), makeString("(#$termStrings #$Dog ?STRING)") });
        $ic14$ = makeKeyword("REMOVAL-TERM-STRINGS-LOOKUP");
        $ic15$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("termStrings")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termStrings")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("STRING")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35492", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termStrings")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("STRING"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("STRING"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35488", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termStrings")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("STRING"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TERM-PHRASES"), makeKeyword("DOCUMENTATION"), makeString("(#$termStrings <not-fully-bound-p> <stringp>)"), makeKeyword("EXAMPLE"), makeString("(#$termStrings ?TERM \"Dog\")") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 104 ms
	
	Decompiled with Procyon 0.5.32.
*/