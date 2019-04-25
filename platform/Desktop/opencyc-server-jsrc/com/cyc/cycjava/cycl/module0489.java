package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0489 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0489";
    public static final String myFingerPrint = "0b9bb0a504ac2762a0119db039b05da05af18358d592d931cf088a5612a1b975";
    private static SubLSymbol $g3721$;
    private static SubLSymbol $g3722$;
    private static SubLSymbol $g3723$;
    private static final SubLSymbol $ic0$;
    private static final SubLObject $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLList $ic4$;
    private static final SubLObject $ic5$;
    private static final SubLObject $ic6$;
    private static final SubLObject $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLObject $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLObject $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLObject $ic13$;
    private static final SubLObject $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLObject $ic19$;
    private static final SubLObject $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLObject $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLObject $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLObject $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLObject $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLObject $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLObject $ic32$;
    private static final SubLObject $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLObject $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLObject $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLObject $ic39$;
    private static final SubLSymbol $ic40$;
    
    public static SubLObject f31993(final SubLObject var1, final SubLObject var2) {
        $g3721$.setGlobalValue(module0035.f2063($g3721$.getGlobalValue(), var1, var2, Symbols.symbol_function((SubLObject)EQUAL)));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31994(final SubLObject var1) {
        if (NIL == f31995(var1)) {
            module0229.f15259();
        }
        final SubLObject var2 = f31996(var1);
        if (NIL == var2) {
            module0229.f15259();
        }
        return var2;
    }
    
    public static SubLObject f31995(final SubLObject var4) {
        return module0035.sublisp_boolean(module0035.f2293($g3721$.getGlobalValue(), var4, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31996(final SubLObject var6) {
        final SubLObject var7 = module0035.f2293($g3721$.getGlobalValue(), var6, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        if (NIL != module0004.f85(var7)) {
            return Functions.funcall(var7);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31997(final SubLObject var1) {
        return f31996(var1);
    }
    
    public static SubLObject f31998() {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        SubLObject var8;
        SubLObject var9;
        for (var8 = module0147.$g2095$.getDynamicValue(var7); NIL != module0161.f10481(var8) && NIL != module0259.f16891(var8, $ic5$); var9 = (var8 = module0220.f14556(var8, $ic6$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))) {}
        if (NIL != module0161.f10481(var8)) {
            return var8;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31999() {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        SubLObject var8 = module0147.$g2095$.getDynamicValue(var7);
        var8 = f32000(var8);
        if (NIL != module0161.f10481(var8)) {
            return var8;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32000(SubLObject var8) {
        while (NIL != module0161.f10481(var8) && NIL != module0259.f16891(var8, $ic5$)) {
            final SubLObject var9 = module0220.f14556(var8, $ic6$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL == module0259.f16891(var9, $ic5$)) {
                return var8;
            }
            var8 = var9;
        }
        return var8;
    }
    
    public static SubLObject f32001() {
        return module0574.f35152();
    }
    
    public static SubLObject f32002() {
        SubLObject var10 = module0538.f33465();
        if (NIL == var10) {
            var10 = $ic13$;
        }
        return var10;
    }
    
    public static SubLObject f32003() {
        final SubLObject var11 = $g3723$.getGlobalValue();
        if (NIL != var11) {
            module0034.f1818(var11);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32004() {
        return module0034.f1829($g3723$.getGlobalValue(), (SubLObject)ConsesLow.list(EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f32005() {
        return module0226.f15171((SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f32006() {
        SubLObject var12 = $g3723$.getGlobalValue();
        if (NIL == var12) {
            var12 = module0034.f1934((SubLObject)$ic16$, (SubLObject)$ic17$, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        SubLObject var13 = module0034.f1810(var12, (SubLObject)UNPROVIDED);
        if (var13 == $ic18$) {
            var13 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f32005()));
            module0034.f1812(var12, var13, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var13);
    }
    
    public static SubLObject f32007() {
        return module0574.f35164();
    }
    
    public static SubLObject f32008() {
        return module0011.f351();
    }
    
    public static SubLObject f32009() {
        return Environment.get_machine_name((SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f32010() {
        final SubLObject var14 = module0339.f22757();
        if (NIL != var14) {
            return module0507.f32391(var14);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32011() {
        final SubLObject var14 = module0339.f22757();
        if (NIL != var14) {
            final SubLObject var15 = inference_datastructures_inference_oc.f25421(var14);
            return module0507.f32383(var15);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32012() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0489", "f31993", "S#35338", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0489", "f31994", "CYC-INDEXICAL-REFERENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0489", "f31995", "S#35335", 1, 0, false);
        new $f31995$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0489", "f31996", "S#35339", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0489", "f31997", "S#35336", 1, 0, false);
        new $f31997$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0489", "f31998", "S#35340", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0489", "f31999", "S#35341", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0489", "f32000", "S#35342", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0489", "f32001", "S#35343", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0489", "f32002", "S#35344", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0489", "f32003", "S#35345", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0489", "f32004", "S#35346", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0489", "f32005", "S#35347", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0489", "f32006", "S#35348", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0489", "f32007", "S#35349", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0489", "f32008", "S#35350", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0489", "f32009", "S#35351", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0489", "f32010", "S#35352", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0489", "f32011", "S#35353", 0, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32013() {
        $g3721$ = SubLFiles.deflexical("S#35354", (SubLObject)NIL);
        $g3722$ = SubLFiles.defparameter("S#35355", (SubLObject)ONE_INTEGER);
        $g3723$ = SubLFiles.deflexical("S#35356", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32014() {
        module0012.f416((SubLObject)$ic0$);
        module0340.f22938($ic1$);
        module0358.f23771((SubLObject)$ic2$, $ic1$, (SubLObject)ONE_INTEGER);
        module0340.f22941((SubLObject)$ic3$, (SubLObject)$ic4$);
        f31993($ic7$, (SubLObject)$ic8$);
        f31993($ic9$, (SubLObject)$ic10$);
        f31993($ic11$, (SubLObject)$ic12$);
        f31993($ic14$, (SubLObject)$ic15$);
        module0034.f1909((SubLObject)$ic16$);
        f31993($ic19$, (SubLObject)$ic16$);
        f31993($ic20$, (SubLObject)$ic21$);
        f31993($ic22$, (SubLObject)$ic23$);
        f31993($ic24$, (SubLObject)$ic25$);
        f31993($ic26$, (SubLObject)$ic27$);
        f31993($ic28$, (SubLObject)$ic29$);
        f31993($ic30$, (SubLObject)$ic31$);
        f31993($ic32$, (SubLObject)$ic31$);
        f31993($ic33$, (SubLObject)$ic34$);
        f31993($ic35$, (SubLObject)$ic36$);
        f31993($ic37$, (SubLObject)$ic38$);
        f31993($ic39$, (SubLObject)$ic40$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f32012();
    }
    
    public void initializeVariables() {
        f32013();
    }
    
    public void runTopLevelForms() {
        f32014();
    }
    
    static {
        me = (SubLFile)new module0489();
        $g3721$ = null;
        $g3722$ = null;
        $g3723$ = null;
        $ic0$ = makeSymbol("CYC-INDEXICAL-REFERENT");
        $ic1$ = constant_handles_oc.f8479((SubLObject)makeString("indexicalReferent"));
        $ic2$ = makeKeyword("POS");
        $ic3$ = makeKeyword("REMOVAL-INDEXICAL-REFERENT-POS");
        $ic4$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("indexicalReferent")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("indexicalReferent")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#35335", "CYC"))), (SubLObject)makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35355", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("indexicalReferent")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35357", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35357", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#10716", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35339", "CYC"), (SubLObject)makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("indexicalReferent")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35357", "CYC")), (SubLObject)makeKeyword("INPUT")) });
        $ic5$ = constant_handles_oc.f8479((SubLObject)makeString("HypotheticalContext"));
        $ic6$ = constant_handles_oc.f8479((SubLObject)makeString("termDependsOn"));
        $ic7$ = constant_handles_oc.f8479((SubLObject)makeString("QueryMt"));
        $ic8$ = makeSymbol("S#35340", "CYC");
        $ic9$ = constant_handles_oc.f8479((SubLObject)makeString("HypothesisMt"));
        $ic10$ = makeSymbol("S#35341", "CYC");
        $ic11$ = constant_handles_oc.f8479((SubLObject)makeString("TheUser"));
        $ic12$ = makeSymbol("S#35343", "CYC");
        $ic13$ = constant_handles_oc.f8479((SubLObject)makeString("GeneralCycKE"));
        $ic14$ = constant_handles_oc.f8479((SubLObject)makeString("ThePurpose"));
        $ic15$ = makeSymbol("S#35344", "CYC");
        $ic16$ = makeSymbol("S#35348", "CYC");
        $ic17$ = makeSymbol("S#35356", "CYC");
        $ic18$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic19$ = constant_handles_oc.f8479((SubLObject)makeString("TheCycProcessOwner"));
        $ic20$ = constant_handles_oc.f8479((SubLObject)makeString("TheCurrentKBNumber"));
        $ic21$ = makeSymbol("S#35349", "CYC");
        $ic22$ = constant_handles_oc.f8479((SubLObject)makeString("TheCurrentSystemNumber"));
        $ic23$ = makeSymbol("S#35350", "CYC");
        $ic24$ = constant_handles_oc.f8479((SubLObject)makeString("TheCurrentHostName"));
        $ic25$ = makeSymbol("S#35351", "CYC");
        $ic26$ = constant_handles_oc.f8479((SubLObject)makeString("ThisInference"));
        $ic27$ = makeSymbol("S#35352", "CYC");
        $ic28$ = constant_handles_oc.f8479((SubLObject)makeString("ThisProblemStore"));
        $ic29$ = makeSymbol("S#35353", "CYC");
        $ic30$ = constant_handles_oc.f8479((SubLObject)makeString("Now"));
        $ic31$ = makeSymbol("S#31692", "CYC");
        $ic32$ = constant_handles_oc.f8479((SubLObject)makeString("Now-Indexical"));
        $ic33$ = constant_handles_oc.f8479((SubLObject)makeString("Today-Indexical"));
        $ic34$ = makeSymbol("S#35358", "CYC");
        $ic35$ = constant_handles_oc.f8479((SubLObject)makeString("Tomorrow-Indexical"));
        $ic36$ = makeSymbol("S#35359", "CYC");
        $ic37$ = constant_handles_oc.f8479((SubLObject)makeString("Yesterday-Indexical"));
        $ic38$ = makeSymbol("S#35360", "CYC");
        $ic39$ = constant_handles_oc.f8479((SubLObject)makeString("SecondsSince1970-Indexical"));
        $ic40$ = makeSymbol("S#35361", "CYC");
    }
    
    public static final class $f31995$UnaryFunction extends UnaryFunction
    {
        public $f31995$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#35335"));
        }
        
        public SubLObject processItem(final SubLObject var5) {
            return f31995(var5);
        }
    }
    
    public static final class $f31997$UnaryFunction extends UnaryFunction
    {
        public $f31997$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#35336"));
        }
        
        public SubLObject processItem(final SubLObject var5) {
            return f31997(var5);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 143 ms
	
	Decompiled with Procyon 0.5.32.
*/