package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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
        module0489.$g3721$.setGlobalValue(module0035.f2063(module0489.$g3721$.getGlobalValue(), var1, var2, Symbols.symbol_function((SubLObject)module0489.EQUAL)));
        return (SubLObject)module0489.NIL;
    }
    
    public static SubLObject f31994(final SubLObject var1) {
        if (module0489.NIL == f31995(var1)) {
            module0229.f15259();
        }
        final SubLObject var2 = f31996(var1);
        if (module0489.NIL == var2) {
            module0229.f15259();
        }
        return var2;
    }
    
    public static SubLObject f31995(final SubLObject var4) {
        return module0035.sublisp_boolean(module0035.f2293(module0489.$g3721$.getGlobalValue(), var4, Symbols.symbol_function((SubLObject)module0489.EQUAL), (SubLObject)module0489.UNPROVIDED));
    }
    
    public static SubLObject f31996(final SubLObject var6) {
        final SubLObject var7 = module0035.f2293(module0489.$g3721$.getGlobalValue(), var6, Symbols.symbol_function((SubLObject)module0489.EQUAL), (SubLObject)module0489.UNPROVIDED);
        if (module0489.NIL != module0004.f85(var7)) {
            return Functions.funcall(var7);
        }
        return (SubLObject)module0489.NIL;
    }
    
    public static SubLObject f31997(final SubLObject var1) {
        return f31996(var1);
    }
    
    public static SubLObject f31998() {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        SubLObject var8;
        SubLObject var9;
        for (var8 = module0147.$g2095$.getDynamicValue(var7); module0489.NIL != module0161.f10481(var8) && module0489.NIL != module0259.f16891(var8, module0489.$ic5$); var9 = (var8 = module0220.f14556(var8, module0489.$ic6$, (SubLObject)module0489.UNPROVIDED, (SubLObject)module0489.UNPROVIDED, (SubLObject)module0489.UNPROVIDED))) {}
        if (module0489.NIL != module0161.f10481(var8)) {
            return var8;
        }
        return (SubLObject)module0489.NIL;
    }
    
    public static SubLObject f31999() {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        SubLObject var8 = module0147.$g2095$.getDynamicValue(var7);
        var8 = f32000(var8);
        if (module0489.NIL != module0161.f10481(var8)) {
            return var8;
        }
        return (SubLObject)module0489.NIL;
    }
    
    public static SubLObject f32000(SubLObject var8) {
        while (module0489.NIL != module0161.f10481(var8) && module0489.NIL != module0259.f16891(var8, module0489.$ic5$)) {
            final SubLObject var9 = module0220.f14556(var8, module0489.$ic6$, (SubLObject)module0489.UNPROVIDED, (SubLObject)module0489.UNPROVIDED, (SubLObject)module0489.UNPROVIDED);
            if (module0489.NIL == module0259.f16891(var9, module0489.$ic5$)) {
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
        if (module0489.NIL == var10) {
            var10 = module0489.$ic13$;
        }
        return var10;
    }
    
    public static SubLObject f32003() {
        final SubLObject var11 = module0489.$g3723$.getGlobalValue();
        if (module0489.NIL != var11) {
            module0034.f1818(var11);
        }
        return (SubLObject)module0489.NIL;
    }
    
    public static SubLObject f32004() {
        return module0034.f1829(module0489.$g3723$.getGlobalValue(), (SubLObject)ConsesLow.list(module0489.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)module0489.UNPROVIDED, (SubLObject)module0489.UNPROVIDED);
    }
    
    public static SubLObject f32005() {
        return module0226.f15171((SubLObject)module0489.UNPROVIDED);
    }
    
    public static SubLObject f32006() {
        SubLObject var12 = module0489.$g3723$.getGlobalValue();
        if (module0489.NIL == var12) {
            var12 = module0034.f1934((SubLObject)module0489.$ic16$, (SubLObject)module0489.$ic17$, (SubLObject)module0489.NIL, (SubLObject)module0489.EQL, (SubLObject)module0489.ZERO_INTEGER, (SubLObject)module0489.ZERO_INTEGER);
        }
        SubLObject var13 = module0034.f1810(var12, (SubLObject)module0489.UNPROVIDED);
        if (var13 == module0489.$ic18$) {
            var13 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f32005()));
            module0034.f1812(var12, var13, (SubLObject)module0489.UNPROVIDED);
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
        return Environment.get_machine_name((SubLObject)module0489.UNPROVIDED);
    }
    
    public static SubLObject f32010() {
        final SubLObject var14 = module0339.f22757();
        if (module0489.NIL != var14) {
            return module0507.f32391(var14);
        }
        return (SubLObject)module0489.NIL;
    }
    
    public static SubLObject f32011() {
        final SubLObject var14 = module0339.f22757();
        if (module0489.NIL != var14) {
            final SubLObject var15 = module0369.f25421(var14);
            return module0507.f32383(var15);
        }
        return (SubLObject)module0489.NIL;
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
        return (SubLObject)module0489.NIL;
    }
    
    public static SubLObject f32013() {
        module0489.$g3721$ = SubLFiles.deflexical("S#35354", (SubLObject)module0489.NIL);
        module0489.$g3722$ = SubLFiles.defparameter("S#35355", (SubLObject)module0489.ONE_INTEGER);
        module0489.$g3723$ = SubLFiles.deflexical("S#35356", (SubLObject)module0489.NIL);
        return (SubLObject)module0489.NIL;
    }
    
    public static SubLObject f32014() {
        module0012.f416((SubLObject)module0489.$ic0$);
        module0340.f22938(module0489.$ic1$);
        module0358.f23771((SubLObject)module0489.$ic2$, module0489.$ic1$, (SubLObject)module0489.ONE_INTEGER);
        module0340.f22941((SubLObject)module0489.$ic3$, (SubLObject)module0489.$ic4$);
        f31993(module0489.$ic7$, (SubLObject)module0489.$ic8$);
        f31993(module0489.$ic9$, (SubLObject)module0489.$ic10$);
        f31993(module0489.$ic11$, (SubLObject)module0489.$ic12$);
        f31993(module0489.$ic14$, (SubLObject)module0489.$ic15$);
        module0034.f1909((SubLObject)module0489.$ic16$);
        f31993(module0489.$ic19$, (SubLObject)module0489.$ic16$);
        f31993(module0489.$ic20$, (SubLObject)module0489.$ic21$);
        f31993(module0489.$ic22$, (SubLObject)module0489.$ic23$);
        f31993(module0489.$ic24$, (SubLObject)module0489.$ic25$);
        f31993(module0489.$ic26$, (SubLObject)module0489.$ic27$);
        f31993(module0489.$ic28$, (SubLObject)module0489.$ic29$);
        f31993(module0489.$ic30$, (SubLObject)module0489.$ic31$);
        f31993(module0489.$ic32$, (SubLObject)module0489.$ic31$);
        f31993(module0489.$ic33$, (SubLObject)module0489.$ic34$);
        f31993(module0489.$ic35$, (SubLObject)module0489.$ic36$);
        f31993(module0489.$ic37$, (SubLObject)module0489.$ic38$);
        f31993(module0489.$ic39$, (SubLObject)module0489.$ic40$);
        return (SubLObject)module0489.NIL;
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
        module0489.$g3721$ = null;
        module0489.$g3722$ = null;
        module0489.$g3723$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("CYC-INDEXICAL-REFERENT");
        $ic1$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("indexicalReferent"));
        $ic2$ = SubLObjectFactory.makeKeyword("POS");
        $ic3$ = SubLObjectFactory.makeKeyword("REMOVAL-INDEXICAL-REFERENT-POS");
        $ic4$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("indexicalReferent")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("indexicalReferent")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#35335", "CYC"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#35355", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("indexicalReferent")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#35357", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#35357", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#10716", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35339", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("indexicalReferent")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#35357", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")) });
        $ic5$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("HypotheticalContext"));
        $ic6$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("termDependsOn"));
        $ic7$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("QueryMt"));
        $ic8$ = SubLObjectFactory.makeSymbol("S#35340", "CYC");
        $ic9$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("HypothesisMt"));
        $ic10$ = SubLObjectFactory.makeSymbol("S#35341", "CYC");
        $ic11$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheUser"));
        $ic12$ = SubLObjectFactory.makeSymbol("S#35343", "CYC");
        $ic13$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("GeneralCycKE"));
        $ic14$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ThePurpose"));
        $ic15$ = SubLObjectFactory.makeSymbol("S#35344", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#35348", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#35356", "CYC");
        $ic18$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic19$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheCycProcessOwner"));
        $ic20$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheCurrentKBNumber"));
        $ic21$ = SubLObjectFactory.makeSymbol("S#35349", "CYC");
        $ic22$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheCurrentSystemNumber"));
        $ic23$ = SubLObjectFactory.makeSymbol("S#35350", "CYC");
        $ic24$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheCurrentHostName"));
        $ic25$ = SubLObjectFactory.makeSymbol("S#35351", "CYC");
        $ic26$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ThisInference"));
        $ic27$ = SubLObjectFactory.makeSymbol("S#35352", "CYC");
        $ic28$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ThisProblemStore"));
        $ic29$ = SubLObjectFactory.makeSymbol("S#35353", "CYC");
        $ic30$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Now"));
        $ic31$ = SubLObjectFactory.makeSymbol("S#31692", "CYC");
        $ic32$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Now-Indexical"));
        $ic33$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Today-Indexical"));
        $ic34$ = SubLObjectFactory.makeSymbol("S#35358", "CYC");
        $ic35$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Tomorrow-Indexical"));
        $ic36$ = SubLObjectFactory.makeSymbol("S#35359", "CYC");
        $ic37$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Yesterday-Indexical"));
        $ic38$ = SubLObjectFactory.makeSymbol("S#35360", "CYC");
        $ic39$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("SecondsSince1970-Indexical"));
        $ic40$ = SubLObjectFactory.makeSymbol("S#35361", "CYC");
    }
    
    public static final class $f31995$UnaryFunction extends UnaryFunction
    {
        public $f31995$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#35335"));
        }
        
        public SubLObject processItem(final SubLObject var5) {
            return module0489.f31995(var5);
        }
    }
    
    public static final class $f31997$UnaryFunction extends UnaryFunction
    {
        public $f31997$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#35336"));
        }
        
        public SubLObject processItem(final SubLObject var5) {
            return module0489.f31997(var5);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0489.class
	Total time: 143 ms
	
	Decompiled with Procyon 0.5.32.
*/