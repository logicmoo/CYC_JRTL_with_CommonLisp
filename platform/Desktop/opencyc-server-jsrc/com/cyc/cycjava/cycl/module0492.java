package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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
        return (SubLObject)SubLObjectFactory.makeBoolean(module0492.NIL != module0035.f2171(var2, f32096(var1, (SubLObject)module0492.UNPROVIDED, (SubLObject)module0492.UNPROVIDED)) || module0492.NIL != module0035.f2171(var1, f32097(var2)));
    }
    
    public static SubLObject f32098(final SubLObject var1, final SubLObject var2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0492.NIL == f32095(var1, var2));
    }
    
    public static SubLObject f32096(final SubLObject var1, SubLObject var3, SubLObject var4) {
        if (var3 == module0492.UNPROVIDED) {
            var3 = (SubLObject)module0492.$ic7$;
        }
        if (var4 == module0492.UNPROVIDED) {
            var4 = (SubLObject)module0492.NIL;
        }
        return module0764.f48456(var1, var3, var4, (SubLObject)module0492.UNPROVIDED);
    }
    
    public static SubLObject f32097(final SubLObject var2) {
        return module0731.f44800(var2, (SubLObject)module0492.UNPROVIDED, (SubLObject)module0492.UNPROVIDED, (SubLObject)module0492.UNPROVIDED);
    }
    
    public static SubLObject f32099(final SubLObject var5) {
        return module0191.f11990((SubLObject)module0492.$ic10$, var5, module0492.$g3762$.getGlobalValue(), (SubLObject)module0492.$ic11$);
    }
    
    public static SubLObject f32100(final SubLObject var1) {
        return module0052.f3709(f32096(var1, (SubLObject)module0492.UNPROVIDED, (SubLObject)module0492.UNPROVIDED));
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
        return (SubLObject)module0492.NIL;
    }
    
    public static SubLObject f32103() {
        module0492.$g3762$ = SubLFiles.deflexical("S#35489", (module0492.NIL != Symbols.boundp((SubLObject)module0492.$ic8$)) ? module0492.$g3762$.getGlobalValue() : module0492.$ic9$);
        module0492.$g3763$ = SubLFiles.deflexical("S#35490", module0018.$g658$.getDynamicValue());
        module0492.$g3764$ = SubLFiles.deflexical("S#35491", (SubLObject)module0492.ONE_INTEGER);
        module0492.$g3765$ = SubLFiles.deflexical("S#35492", (SubLObject)module0492.ONE_INTEGER);
        return (SubLObject)module0492.NIL;
    }
    
    public static SubLObject f32104() {
        module0340.f22938(module0492.$ic0$);
        module0358.f23730((SubLObject)module0492.$ic1$, (SubLObject)module0492.$ic2$);
        module0340.f22941((SubLObject)module0492.$ic3$, (SubLObject)module0492.$ic4$);
        module0340.f22941((SubLObject)module0492.$ic5$, (SubLObject)module0492.$ic6$);
        module0003.f57((SubLObject)module0492.$ic8$);
        module0132.f8593((SubLObject)module0492.$ic8$, module0492.$ic0$);
        module0340.f22941((SubLObject)module0492.$ic12$, (SubLObject)module0492.$ic13$);
        module0340.f22941((SubLObject)module0492.$ic14$, (SubLObject)module0492.$ic15$);
        return (SubLObject)module0492.NIL;
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
        module0492.$g3762$ = null;
        module0492.$g3763$ = null;
        module0492.$g3764$ = null;
        module0492.$g3765$ = null;
        $ic0$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("termStrings"));
        $ic1$ = SubLObjectFactory.makeKeyword("TERMSTRINGS-X-Y-POS");
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("termStrings")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("termStrings")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("GROSSLY-DISPREFERRED"));
        $ic3$ = SubLObjectFactory.makeKeyword("REMOVAL-TERM-STRINGS-CHECK-POS");
        $ic4$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("termStrings")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("termStrings")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("STRING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#35490", "CYC"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("termStrings")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35482", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("TERM-PHRASES"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$termStrings <fully-bound-p> <stringp>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$termStrings #$Dog \"Dog\")") });
        $ic5$ = SubLObjectFactory.makeKeyword("REMOVAL-TERM-STRINGS-CHECK-NEG");
        $ic6$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("termStrings")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("termStrings")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("STRING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#35490", "CYC"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("termStrings")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35483", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")))), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeKeyword("TERM-PHRASES"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$termStrings <fully-bound-p> <stringp>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$termStrings #$Dog \"Cat\"))") });
        $ic7$ = SubLObjectFactory.makeKeyword("ALL");
        $ic8$ = SubLObjectFactory.makeSymbol("S#35489", "CYC");
        $ic9$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $ic10$ = SubLObjectFactory.makeKeyword("OPAQUE");
        $ic11$ = SubLObjectFactory.makeKeyword("TRUE-MON");
        $ic12$ = SubLObjectFactory.makeKeyword("REMOVAL-TERM-STRINGS-UNIFY");
        $ic13$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("termStrings")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("termStrings")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE")), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#35491", "CYC"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("termStrings")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35487", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("termStrings")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("TERM-PHRASES"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$termStrings <fully-bound-p> <variable-p>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$termStrings #$Dog ?STRING)") });
        $ic14$ = SubLObjectFactory.makeKeyword("REMOVAL-TERM-STRINGS-LOOKUP");
        $ic15$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("termStrings")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("termStrings")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("STRING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#35492", "CYC"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("termStrings")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35488", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("termStrings")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("TERM-PHRASES"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$termStrings <not-fully-bound-p> <stringp>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$termStrings ?TERM \"Dog\")") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0492.class
	Total time: 104 ms
	
	Decompiled with Procyon 0.5.32.
*/