package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0142 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0142";
    public static final String myFingerPrint = "f5f18d0472059a35b4c8a133e1b4b25aeb8094293b1ac5c68a1daa7936e1595d";
    public static SubLSymbol $g1716$;
    public static SubLSymbol $g1717$;
    public static SubLSymbol $g1718$;
    public static SubLSymbol $g1719$;
    public static SubLSymbol $g1720$;
    public static SubLSymbol $g1721$;
    public static SubLSymbol $g1722$;
    public static SubLSymbol $g1723$;
    public static SubLSymbol $g1724$;
    public static SubLSymbol $g1725$;
    public static SubLSymbol $g1726$;
    public static SubLSymbol $g1727$;
    public static SubLSymbol $g1728$;
    public static SubLSymbol $g1729$;
    public static SubLSymbol $g1730$;
    public static SubLSymbol $g1731$;
    public static SubLSymbol $g1732$;
    private static SubLSymbol $g1733$;
    public static SubLSymbol $g1734$;
    public static SubLSymbol $g1735$;
    private static SubLSymbol $g1736$;
    private static final SubLSymbol $ic0$;
    private static final SubLString $ic1$;
    private static final SubLString $ic2$;
    private static final SubLList $ic3$;
    private static final SubLList $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLInteger $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLInteger $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLList $ic23$;
    private static final SubLList $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLList $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLList $ic29$;
    private static final SubLList $ic30$;
    private static final SubLList $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLList $ic33$;
    private static final SubLList $ic34$;
    private static final SubLList $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLList $ic37$;
    
    public static SubLObject f9311() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL != $g1716$.getDynamicValue(var1) && NIL != module0131.f8563());
    }
    
    public static SubLObject f9312(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic4$);
        var6 = var5.first();
        final SubLObject var7;
        var5 = (var7 = var5.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic7$, (SubLObject)ConsesLow.listS((SubLObject)$ic8$, (SubLObject)ConsesLow.list((SubLObject)$ic9$, var6), (SubLObject)$ic10$), (SubLObject)ConsesLow.listS((SubLObject)$ic11$, var6, (SubLObject)$ic12$)), (SubLObject)ConsesLow.list((SubLObject)$ic7$, (SubLObject)$ic0$, (SubLObject)ConsesLow.list((SubLObject)$ic13$, var6)), ConsesLow.append(var7, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic7$, (SubLObject)$ic0$, (SubLObject)ConsesLow.list((SubLObject)$ic14$, var6)))));
    }
    
    public static SubLObject f9313(final SubLObject var2, final SubLObject var3) {
        final SubLObject var4 = var2.rest();
        final SubLObject var6;
        final SubLObject var5 = var6 = var4;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)$ic23$, ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9314(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic24$);
        var6 = var5.first();
        final SubLObject var7;
        var5 = (var7 = var5.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic25$, (SubLObject)ConsesLow.listS((SubLObject)$ic26$, var6, (SubLObject)$ic27$), (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic28$, var6)), ConsesLow.append(var7, (SubLObject)NIL)));
    }
    
    public static SubLObject f9315(final SubLObject var2, final SubLObject var3) {
        final SubLObject var4 = var2.rest();
        final SubLObject var6;
        final SubLObject var5 = var6 = var4;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)$ic29$, ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9316(final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        return module0004.f104(var15, $g1730$.getDynamicValue(var16), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f9317(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic30$);
        var6 = var5.first();
        final SubLObject var7;
        var5 = (var7 = var5.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic25$, (SubLObject)ConsesLow.listS((SubLObject)$ic26$, var6, (SubLObject)$ic31$), (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic32$, var6)), ConsesLow.append(var7, (SubLObject)NIL)));
    }
    
    public static SubLObject f9318() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(!$g1731$.getDynamicValue(var1).isNegative());
    }
    
    public static SubLObject f9319() {
        return $g1733$.getGlobalValue();
    }
    
    public static SubLObject f9320(final SubLObject var2, final SubLObject var3) {
        final SubLObject var4 = var2.rest();
        final SubLObject var6;
        final SubLObject var5 = var6 = var4;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)$ic33$, ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9321(final SubLObject var21) {
        return module0004.f104(var21, $g1736$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f9322() {
        return $g1736$.getGlobalValue();
    }
    
    public static SubLObject f9323(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic35$);
        final SubLObject var6 = var5.rest();
        var5 = var5.first();
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic35$);
        var7 = var5.first();
        var5 = var5.rest();
        final SubLObject var8 = (SubLObject)(var5.isCons() ? var5.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var5, var4, (SubLObject)$ic35$);
        var5 = var5.rest();
        if (NIL == var5) {
            final SubLObject var9;
            var5 = (var9 = var6);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic36$, (SubLObject)ConsesLow.list(var7, (SubLObject)$ic37$, var8), ConsesLow.append(var9, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic35$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9324() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0142", "f9311", "S#11681", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0142", "f9312", "S#11682");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0142", "f9313", "S#11683");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0142", "f9314", "S#11684");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0142", "f9315", "S#11685");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0142", "f9316", "S#11686", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0142", "f9317", "S#11687");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0142", "f9318", "S#11688", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0142", "f9319", "S#11689", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0142", "f9320", "S#11690");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0142", "f9321", "S#11691", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0142", "f9322", "S#11692", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0142", "f9323", "S#11693");
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9325() {
        $g1716$ = SubLFiles.defparameter("*SBHL-TEMPORALITY-ACTIVE?*", (SubLObject)T);
        $g1717$ = SubLFiles.defparameter("S#11694", (SubLObject)NIL);
        $g1718$ = SubLFiles.defparameter("S#11695", (SubLObject)NIL);
        $g1719$ = SubLFiles.defparameter("S#11696", (SubLObject)NIL);
        $g1720$ = SubLFiles.deflexical("S#11697", (NIL != Symbols.boundp((SubLObject)$ic15$)) ? $g1720$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)$ic16$, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
        $g1721$ = SubLFiles.deflexical("S#11698", (NIL != Symbols.boundp((SubLObject)$ic17$)) ? $g1721$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)$ic18$, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
        $g1722$ = SubLFiles.deflexical("S#11699", (NIL != Symbols.boundp((SubLObject)$ic19$)) ? $g1722$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)$ic18$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g1723$ = SubLFiles.deflexical("S#11700", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic20$)) ? $g1723$.getGlobalValue() : NIL));
        $g1724$ = SubLFiles.deflexical("S#11701", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic21$)) ? $g1724$.getGlobalValue() : NIL));
        $g1725$ = SubLFiles.deflexical("S#11702", (NIL != Symbols.boundp((SubLObject)$ic22$)) ? $g1725$.getGlobalValue() : module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g1726$ = SubLFiles.defparameter("S#11703", (SubLObject)NIL);
        $g1727$ = SubLFiles.defparameter("S#11704", (SubLObject)NIL);
        $g1728$ = SubLFiles.defparameter("S#11705", (SubLObject)NIL);
        $g1729$ = SubLFiles.defparameter("S#11706", (SubLObject)NIL);
        $g1730$ = SubLFiles.defparameter("S#11707", (SubLObject)NIL);
        $g1731$ = SubLFiles.defparameter("S#11708", (SubLObject)NIL);
        $g1732$ = SubLFiles.defparameter("S#11709", (SubLObject)TEN_INTEGER);
        $g1733$ = SubLFiles.deflexical("S#11710", (SubLObject)TEN_INTEGER);
        $g1734$ = SubLFiles.defparameter("S#11711", (SubLObject)NIL);
        $g1735$ = SubLFiles.defparameter("S#11712", (SubLObject)NIL);
        $g1736$ = SubLFiles.deflexical("S#11713", (SubLObject)$ic34$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9326() {
        module0012.f423((SubLObject)$ic0$, (SubLObject)$ic1$, (SubLObject)$ic2$, (SubLObject)$ic3$);
        module0003.f57((SubLObject)$ic15$);
        module0003.f57((SubLObject)$ic17$);
        module0003.f57((SubLObject)$ic19$);
        module0003.f57((SubLObject)$ic20$);
        module0003.f57((SubLObject)$ic21$);
        module0003.f57((SubLObject)$ic22$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f9324();
    }
    
    public void initializeVariables() {
        f9325();
    }
    
    public void runTopLevelForms() {
        f9326();
    }
    
    static {
        me = (SubLFile)new module0142();
        $g1716$ = null;
        $g1717$ = null;
        $g1718$ = null;
        $g1719$ = null;
        $g1720$ = null;
        $g1721$ = null;
        $g1722$ = null;
        $g1723$ = null;
        $g1724$ = null;
        $g1725$ = null;
        $g1726$ = null;
        $g1727$ = null;
        $g1728$ = null;
        $g1729$ = null;
        $g1730$ = null;
        $g1731$ = null;
        $g1732$ = null;
        $g1733$ = null;
        $g1734$ = null;
        $g1735$ = null;
        $g1736$ = null;
        $ic0$ = makeSymbol("S#11694", "CYC");
        $ic1$ = makeString("Consider disjunctive temporal relation literals");
        $ic2$ = makeString("This controls whether the HL module that handles temporal relation\n   queries will consider temporal relation literal assertions the\n   information content of which is disjunctive.  Typically, such literals\n   are negated ground atomic formulas.  (Considering them adds some expense.)");
        $ic3$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)NIL, (SubLObject)makeString("No")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)T, (SubLObject)makeString("Yes")));
        $ic4$ = ConsesLow.list((SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic5$ = makeSymbol("CLET");
        $ic6$ = ConsesLow.list((SubLObject)makeSymbol("S#11704", "CYC"));
        $ic7$ = makeSymbol("PWHEN");
        $ic8$ = makeSymbol("CAND");
        $ic9$ = makeSymbol("NULL");
        $ic10$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11714", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11715", "CYC")))));
        $ic11$ = makeSymbol("CSETQ");
        $ic12$ = ConsesLow.list((SubLObject)makeSymbol("*MT*"));
        $ic13$ = makeSymbol("S#11716", "CYC");
        $ic14$ = makeSymbol("S#11717", "CYC");
        $ic15$ = makeSymbol("S#11697", "CYC");
        $ic16$ = makeInteger(40000);
        $ic17$ = makeSymbol("S#11698", "CYC");
        $ic18$ = makeInteger(4000);
        $ic19$ = makeSymbol("S#11699", "CYC");
        $ic20$ = makeSymbol("S#11700", "CYC");
        $ic21$ = makeSymbol("S#11701", "CYC");
        $ic22$ = makeSymbol("S#11702", "CYC");
        $ic23$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11705", "CYC"), (SubLObject)T));
        $ic24$ = ConsesLow.list((SubLObject)makeSymbol("S#11718", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic25$ = makeSymbol("PROGN");
        $ic26$ = makeSymbol("CHECK-TYPE");
        $ic27$ = ConsesLow.list((SubLObject)makeSymbol("KEYWORDP"));
        $ic28$ = makeSymbol("S#11706", "CYC");
        $ic29$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11706", "CYC"), (SubLObject)NIL));
        $ic30$ = ConsesLow.list((SubLObject)makeSymbol("INTEGER"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic31$ = ConsesLow.list((SubLObject)makeSymbol("INTEGERP"));
        $ic32$ = makeSymbol("S#11708", "CYC");
        $ic33$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11712", "CYC"), (SubLObject)NIL), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11711", "CYC"), (SubLObject)NIL));
        $ic34$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("weak-HL-TimePrecedence")), constant_handles_oc.f8479((SubLObject)makeString("strict-HL-TimePrecedence")), constant_handles_oc.f8479((SubLObject)makeString("successorStrict-HL-TimePrecedence")), constant_handles_oc.f8479((SubLObject)makeString("weakSuccessor-HL-TimePrecedence")));
        $ic35$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11208", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#8587", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic36$ = makeSymbol("S#115", "CYC");
        $ic37$ = ConsesLow.list((SubLObject)makeSymbol("S#11692", "CYC"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 76 ms
	
	Decompiled with Procyon 0.5.32.
*/