package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0198 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0198";
    public static final String myFingerPrint = "e0c3682d080e080c61b09d88e5854744fe2f1adf66edcb6bd435fa4b16f57516";
    private static SubLSymbol $g2285$;
    private static SubLSymbol $g2286$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLList $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLList $ic13$;
    private static final SubLSymbol $ic14$;
    
    public static SubLObject f12342(final SubLObject var1) {
        return module0022.f1215(constants_high_oc.f10757(var1));
    }
    
    public static SubLObject f12343() {
        final SubLObject var2 = $g2286$.getGlobalValue();
        if (NIL != var2) {
            module0034.f1818(var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12344(final SubLObject var1) {
        return module0034.f1829($g2286$.getGlobalValue(), (SubLObject)ConsesLow.list(var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12345(final SubLObject var1) {
        return f12342(var1);
    }
    
    public static SubLObject f12346(final SubLObject var1) {
        SubLObject var2 = $g2286$.getGlobalValue();
        if (NIL == var2) {
            var2 = module0034.f1934((SubLObject)$ic1$, (SubLObject)$ic2$, (SubLObject)NIL, (SubLObject)EQ, (SubLObject)ONE_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        SubLObject var3 = module0034.f1814(var2, var1, (SubLObject)$ic3$);
        if (var3 == $ic3$) {
            var3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f12345(var1)));
            module0034.f1816(var2, var1, var3, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var3);
    }
    
    public static SubLObject f12347(final SubLObject var5) {
        if (NIL == $g2285$.getGlobalValue()) {
            return f12342(var5);
        }
        return f12346(var5);
    }
    
    public static SubLObject f12348(final SubLObject var6) {
        return module0022.f1215(module0172.f10915(var6));
    }
    
    public static SubLObject f12349(final SubLObject var5) {
        return f12348(var5);
    }
    
    public static SubLObject f12350(final SubLObject var7) {
        return module0022.f1215(module0193.f12073(var7));
    }
    
    public static SubLObject f12351(final SubLObject var5) {
        return f12350(var5);
    }
    
    public static SubLObject f12352(final SubLObject var8) {
        return Numbers.logxor(module0022.f1215(module0178.f11282(var8)), module0022.f1215(module0178.f11287(var8)));
    }
    
    public static SubLObject f12353(final SubLObject var5) {
        return f12352(var5);
    }
    
    public static SubLObject f12354(final SubLObject var9) {
        return Numbers.logxor(new SubLObject[] { module0022.f1215(module0188.f11781(var9)), module0022.f1215(module0188.f11770(var9)), module0022.f1215(module0191.f11924(var9)) });
    }
    
    public static SubLObject f12355(final SubLObject var5) {
        return f12354(var5);
    }
    
    public static SubLObject f12356(final SubLObject var10) {
        return module0022.f1215(module0192.f12017(var10));
    }
    
    public static SubLObject f12357(final SubLObject var5) {
        return f12356(var5);
    }
    
    public static SubLObject f12358() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0198", "f12342", "S#15143", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0198", "f12343", "S#15144", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0198", "f12344", "S#15145", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0198", "f12345", "S#15146", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0198", "f12346", "S#15147", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0198", "f12347", "S#15148", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0198", "f12348", "S#15149", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0198", "f12349", "S#15150", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0198", "f12350", "S#15151", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0198", "f12351", "S#15152", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0198", "f12352", "S#15153", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0198", "f12353", "S#15154", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0198", "f12354", "S#15155", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0198", "f12355", "S#15156", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0198", "f12356", "S#15157", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0198", "f12357", "S#15158", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12359() {
        $g2285$ = SubLFiles.deflexical("S#15159", (SubLObject)T);
        $g2286$ = SubLFiles.deflexical("S#15160", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12360() {
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic0$);
        module0034.f1909((SubLObject)$ic1$);
        Structures.register_method(module0022.$g804$.getGlobalValue(), constant_handles_oc.$g1501$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic4$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic5$);
        Structures.register_method(module0022.$g804$.getGlobalValue(), module0167.$g2182$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic6$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic7$);
        Structures.register_method(module0022.$g804$.getGlobalValue(), module0193.$g2259$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic8$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic9$);
        Structures.register_method(module0022.$g804$.getGlobalValue(), assertion_handles_oc.$g2194$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic10$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic11$);
        Structures.register_method(module0022.$g804$.getGlobalValue(), deduction_handles_oc.$g2229$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic12$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic13$);
        Structures.register_method(module0022.$g804$.getGlobalValue(), module0192.$g2252$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic14$));
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f12358();
    }
    
    public void initializeVariables() {
        f12359();
    }
    
    public void runTopLevelForms() {
        f12360();
    }
    
    static {
        me = (SubLFile)new module0198();
        $g2285$ = null;
        $g2286$ = null;
        $ic0$ = ConsesLow.list((SubLObject)makeSymbol("INLINE"), (SubLObject)makeSymbol("S#15147", "CYC"), (SubLObject)makeSymbol("S#15143", "CYC"));
        $ic1$ = makeSymbol("S#15147", "CYC");
        $ic2$ = makeSymbol("S#15160", "CYC");
        $ic3$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic4$ = makeSymbol("S#15148", "CYC");
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("INLINE"), (SubLObject)makeSymbol("S#15149", "CYC"));
        $ic6$ = makeSymbol("S#15150", "CYC");
        $ic7$ = ConsesLow.list((SubLObject)makeSymbol("INLINE"), (SubLObject)makeSymbol("S#15151", "CYC"));
        $ic8$ = makeSymbol("S#15152", "CYC");
        $ic9$ = ConsesLow.list((SubLObject)makeSymbol("INLINE"), (SubLObject)makeSymbol("S#15153", "CYC"));
        $ic10$ = makeSymbol("S#15154", "CYC");
        $ic11$ = ConsesLow.list((SubLObject)makeSymbol("INLINE"), (SubLObject)makeSymbol("S#15155", "CYC"));
        $ic12$ = makeSymbol("S#15156", "CYC");
        $ic13$ = ConsesLow.list((SubLObject)makeSymbol("INLINE"), (SubLObject)makeSymbol("S#15157", "CYC"));
        $ic14$ = makeSymbol("S#15158", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 70 ms
	
	Decompiled with Procyon 0.5.32.
*/