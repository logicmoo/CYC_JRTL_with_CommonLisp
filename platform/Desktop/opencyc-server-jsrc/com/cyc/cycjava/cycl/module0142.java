package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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
        return (SubLObject)SubLObjectFactory.makeBoolean(module0142.NIL != module0142.$g1716$.getDynamicValue(var1) && module0142.NIL != module0131.f8563());
    }
    
    public static SubLObject f9312(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        SubLObject var6 = (SubLObject)module0142.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0142.$ic4$);
        var6 = var5.first();
        final SubLObject var7;
        var5 = (var7 = var5.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0142.$ic5$, (SubLObject)module0142.$ic6$, (SubLObject)ConsesLow.list((SubLObject)module0142.$ic7$, (SubLObject)ConsesLow.listS((SubLObject)module0142.$ic8$, (SubLObject)ConsesLow.list((SubLObject)module0142.$ic9$, var6), (SubLObject)module0142.$ic10$), (SubLObject)ConsesLow.listS((SubLObject)module0142.$ic11$, var6, (SubLObject)module0142.$ic12$)), (SubLObject)ConsesLow.list((SubLObject)module0142.$ic7$, (SubLObject)module0142.$ic0$, (SubLObject)ConsesLow.list((SubLObject)module0142.$ic13$, var6)), ConsesLow.append(var7, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0142.$ic7$, (SubLObject)module0142.$ic0$, (SubLObject)ConsesLow.list((SubLObject)module0142.$ic14$, var6)))));
    }
    
    public static SubLObject f9313(final SubLObject var2, final SubLObject var3) {
        final SubLObject var4 = var2.rest();
        final SubLObject var6;
        final SubLObject var5 = var6 = var4;
        return (SubLObject)ConsesLow.listS((SubLObject)module0142.$ic5$, (SubLObject)module0142.$ic23$, ConsesLow.append(var6, (SubLObject)module0142.NIL));
    }
    
    public static SubLObject f9314(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        SubLObject var6 = (SubLObject)module0142.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0142.$ic24$);
        var6 = var5.first();
        final SubLObject var7;
        var5 = (var7 = var5.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0142.$ic25$, (SubLObject)ConsesLow.listS((SubLObject)module0142.$ic26$, var6, (SubLObject)module0142.$ic27$), (SubLObject)ConsesLow.listS((SubLObject)module0142.$ic5$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0142.$ic28$, var6)), ConsesLow.append(var7, (SubLObject)module0142.NIL)));
    }
    
    public static SubLObject f9315(final SubLObject var2, final SubLObject var3) {
        final SubLObject var4 = var2.rest();
        final SubLObject var6;
        final SubLObject var5 = var6 = var4;
        return (SubLObject)ConsesLow.listS((SubLObject)module0142.$ic5$, (SubLObject)module0142.$ic29$, ConsesLow.append(var6, (SubLObject)module0142.NIL));
    }
    
    public static SubLObject f9316(final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        return module0004.f104(var15, module0142.$g1730$.getDynamicValue(var16), (SubLObject)module0142.UNPROVIDED, (SubLObject)module0142.UNPROVIDED);
    }
    
    public static SubLObject f9317(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        SubLObject var6 = (SubLObject)module0142.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0142.$ic30$);
        var6 = var5.first();
        final SubLObject var7;
        var5 = (var7 = var5.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0142.$ic25$, (SubLObject)ConsesLow.listS((SubLObject)module0142.$ic26$, var6, (SubLObject)module0142.$ic31$), (SubLObject)ConsesLow.listS((SubLObject)module0142.$ic5$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0142.$ic32$, var6)), ConsesLow.append(var7, (SubLObject)module0142.NIL)));
    }
    
    public static SubLObject f9318() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(!module0142.$g1731$.getDynamicValue(var1).isNegative());
    }
    
    public static SubLObject f9319() {
        return module0142.$g1733$.getGlobalValue();
    }
    
    public static SubLObject f9320(final SubLObject var2, final SubLObject var3) {
        final SubLObject var4 = var2.rest();
        final SubLObject var6;
        final SubLObject var5 = var6 = var4;
        return (SubLObject)ConsesLow.listS((SubLObject)module0142.$ic5$, (SubLObject)module0142.$ic33$, ConsesLow.append(var6, (SubLObject)module0142.NIL));
    }
    
    public static SubLObject f9321(final SubLObject var21) {
        return module0004.f104(var21, module0142.$g1736$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0142.EQL), (SubLObject)module0142.UNPROVIDED);
    }
    
    public static SubLObject f9322() {
        return module0142.$g1736$.getGlobalValue();
    }
    
    public static SubLObject f9323(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0142.$ic35$);
        final SubLObject var6 = var5.rest();
        var5 = var5.first();
        SubLObject var7 = (SubLObject)module0142.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0142.$ic35$);
        var7 = var5.first();
        var5 = var5.rest();
        final SubLObject var8 = (SubLObject)(var5.isCons() ? var5.first() : module0142.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var5, var4, (SubLObject)module0142.$ic35$);
        var5 = var5.rest();
        if (module0142.NIL == var5) {
            final SubLObject var9;
            var5 = (var9 = var6);
            return (SubLObject)ConsesLow.listS((SubLObject)module0142.$ic36$, (SubLObject)ConsesLow.list(var7, (SubLObject)module0142.$ic37$, var8), ConsesLow.append(var9, (SubLObject)module0142.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)module0142.$ic35$);
        return (SubLObject)module0142.NIL;
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
        return (SubLObject)module0142.NIL;
    }
    
    public static SubLObject f9325() {
        module0142.$g1716$ = SubLFiles.defparameter("*SBHL-TEMPORALITY-ACTIVE?*", (SubLObject)module0142.T);
        module0142.$g1717$ = SubLFiles.defparameter("S#11694", (SubLObject)module0142.NIL);
        module0142.$g1718$ = SubLFiles.defparameter("S#11695", (SubLObject)module0142.NIL);
        module0142.$g1719$ = SubLFiles.defparameter("S#11696", (SubLObject)module0142.NIL);
        module0142.$g1720$ = SubLFiles.deflexical("S#11697", (module0142.NIL != Symbols.boundp((SubLObject)module0142.$ic15$)) ? module0142.$g1720$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)module0142.$ic16$, Symbols.symbol_function((SubLObject)module0142.EQUAL), (SubLObject)module0142.UNPROVIDED));
        module0142.$g1721$ = SubLFiles.deflexical("S#11698", (module0142.NIL != Symbols.boundp((SubLObject)module0142.$ic17$)) ? module0142.$g1721$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)module0142.$ic18$, Symbols.symbol_function((SubLObject)module0142.EQUAL), (SubLObject)module0142.UNPROVIDED));
        module0142.$g1722$ = SubLFiles.deflexical("S#11699", (module0142.NIL != Symbols.boundp((SubLObject)module0142.$ic19$)) ? module0142.$g1722$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)module0142.$ic18$, (SubLObject)module0142.UNPROVIDED, (SubLObject)module0142.UNPROVIDED));
        module0142.$g1723$ = SubLFiles.deflexical("S#11700", (SubLObject)((module0142.NIL != Symbols.boundp((SubLObject)module0142.$ic20$)) ? module0142.$g1723$.getGlobalValue() : module0142.NIL));
        module0142.$g1724$ = SubLFiles.deflexical("S#11701", (SubLObject)((module0142.NIL != Symbols.boundp((SubLObject)module0142.$ic21$)) ? module0142.$g1724$.getGlobalValue() : module0142.NIL));
        module0142.$g1725$ = SubLFiles.deflexical("S#11702", (module0142.NIL != Symbols.boundp((SubLObject)module0142.$ic22$)) ? module0142.$g1725$.getGlobalValue() : module0067.f4880((SubLObject)module0142.UNPROVIDED, (SubLObject)module0142.UNPROVIDED));
        module0142.$g1726$ = SubLFiles.defparameter("S#11703", (SubLObject)module0142.NIL);
        module0142.$g1727$ = SubLFiles.defparameter("S#11704", (SubLObject)module0142.NIL);
        module0142.$g1728$ = SubLFiles.defparameter("S#11705", (SubLObject)module0142.NIL);
        module0142.$g1729$ = SubLFiles.defparameter("S#11706", (SubLObject)module0142.NIL);
        module0142.$g1730$ = SubLFiles.defparameter("S#11707", (SubLObject)module0142.NIL);
        module0142.$g1731$ = SubLFiles.defparameter("S#11708", (SubLObject)module0142.NIL);
        module0142.$g1732$ = SubLFiles.defparameter("S#11709", (SubLObject)module0142.TEN_INTEGER);
        module0142.$g1733$ = SubLFiles.deflexical("S#11710", (SubLObject)module0142.TEN_INTEGER);
        module0142.$g1734$ = SubLFiles.defparameter("S#11711", (SubLObject)module0142.NIL);
        module0142.$g1735$ = SubLFiles.defparameter("S#11712", (SubLObject)module0142.NIL);
        module0142.$g1736$ = SubLFiles.deflexical("S#11713", (SubLObject)module0142.$ic34$);
        return (SubLObject)module0142.NIL;
    }
    
    public static SubLObject f9326() {
        module0012.f423((SubLObject)module0142.$ic0$, (SubLObject)module0142.$ic1$, (SubLObject)module0142.$ic2$, (SubLObject)module0142.$ic3$);
        module0003.f57((SubLObject)module0142.$ic15$);
        module0003.f57((SubLObject)module0142.$ic17$);
        module0003.f57((SubLObject)module0142.$ic19$);
        module0003.f57((SubLObject)module0142.$ic20$);
        module0003.f57((SubLObject)module0142.$ic21$);
        module0003.f57((SubLObject)module0142.$ic22$);
        return (SubLObject)module0142.NIL;
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
        module0142.$g1716$ = null;
        module0142.$g1717$ = null;
        module0142.$g1718$ = null;
        module0142.$g1719$ = null;
        module0142.$g1720$ = null;
        module0142.$g1721$ = null;
        module0142.$g1722$ = null;
        module0142.$g1723$ = null;
        module0142.$g1724$ = null;
        module0142.$g1725$ = null;
        module0142.$g1726$ = null;
        module0142.$g1727$ = null;
        module0142.$g1728$ = null;
        module0142.$g1729$ = null;
        module0142.$g1730$ = null;
        module0142.$g1731$ = null;
        module0142.$g1732$ = null;
        module0142.$g1733$ = null;
        module0142.$g1734$ = null;
        module0142.$g1735$ = null;
        module0142.$g1736$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#11694", "CYC");
        $ic1$ = SubLObjectFactory.makeString("Consider disjunctive temporal relation literals");
        $ic2$ = SubLObjectFactory.makeString("This controls whether the HL module that handles temporal relation\n   queries will consider temporal relation literal assertions the\n   information content of which is disjunctive.  Typically, such literals\n   are negated ground atomic formulas.  (Considering them adds some expense.)");
        $ic3$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)module0142.NIL, (SubLObject)SubLObjectFactory.makeString("No")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)module0142.T, (SubLObject)SubLObjectFactory.makeString("Yes")));
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic5$ = SubLObjectFactory.makeSymbol("CLET");
        $ic6$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11704", "CYC"));
        $ic7$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic8$ = SubLObjectFactory.makeSymbol("CAND");
        $ic9$ = SubLObjectFactory.makeSymbol("NULL");
        $ic10$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11714", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11715", "CYC")))));
        $ic11$ = SubLObjectFactory.makeSymbol("CSETQ");
        $ic12$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*MT*"));
        $ic13$ = SubLObjectFactory.makeSymbol("S#11716", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#11717", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#11697", "CYC");
        $ic16$ = SubLObjectFactory.makeInteger(40000);
        $ic17$ = SubLObjectFactory.makeSymbol("S#11698", "CYC");
        $ic18$ = SubLObjectFactory.makeInteger(4000);
        $ic19$ = SubLObjectFactory.makeSymbol("S#11699", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#11700", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#11701", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("S#11702", "CYC");
        $ic23$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11705", "CYC"), (SubLObject)module0142.T));
        $ic24$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11718", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic25$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic26$ = SubLObjectFactory.makeSymbol("CHECK-TYPE");
        $ic27$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEYWORDP"));
        $ic28$ = SubLObjectFactory.makeSymbol("S#11706", "CYC");
        $ic29$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11706", "CYC"), (SubLObject)module0142.NIL));
        $ic30$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTEGER"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic31$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTEGERP"));
        $ic32$ = SubLObjectFactory.makeSymbol("S#11708", "CYC");
        $ic33$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11712", "CYC"), (SubLObject)module0142.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11711", "CYC"), (SubLObject)module0142.NIL));
        $ic34$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("weak-HL-TimePrecedence")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("strict-HL-TimePrecedence")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("successorStrict-HL-TimePrecedence")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("weakSuccessor-HL-TimePrecedence")));
        $ic35$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11208", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#8587", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic36$ = SubLObjectFactory.makeSymbol("S#115", "CYC");
        $ic37$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11692", "CYC"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0142.class
	Total time: 76 ms
	
	Decompiled with Procyon 0.5.32.
*/