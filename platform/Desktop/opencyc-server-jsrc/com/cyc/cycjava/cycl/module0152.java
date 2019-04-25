package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0152 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0152";
    public static final String myFingerPrint = "cf2955ada8505d9c14c14387429607565764b823e4f2fe45c4a252b40804c037";
    private static SubLSymbol $g2103$;
    public static SubLSymbol $g2104$;
    public static SubLSymbol $g2105$;
    public static SubLSymbol $g2106$;
    public static SubLSymbol $g2107$;
    public static SubLSymbol $g2108$;
    public static SubLSymbol $g2109$;
    public static SubLSymbol $g2110$;
    public static SubLSymbol $g2111$;
    public static SubLSymbol $g2112$;
    public static SubLSymbol $g2113$;
    public static SubLSymbol $g2114$;
    public static SubLSymbol $g2115$;
    public static SubLSymbol $g2116$;
    public static SubLSymbol $g2117$;
    public static SubLSymbol $g2118$;
    public static SubLSymbol $g2119$;
    public static SubLSymbol $g2120$;
    public static SubLSymbol $g2121$;
    public static SubLSymbol $g2122$;
    public static SubLSymbol $g2101$;
    private static SubLSymbol $g2123$;
    public static SubLSymbol $g2124$;
    public static SubLSymbol $g2125$;
    public static SubLSymbol $g2126$;
    public static SubLSymbol $g2127$;
    public static SubLSymbol $g2128$;
    public static SubLSymbol $g2129$;
    public static SubLSymbol $g2130$;
    public static SubLSymbol $g2131$;
    public static SubLSymbol $g2132$;
    public static SubLSymbol $g2102$;
    public static SubLSymbol $g2133$;
    public static SubLSymbol $g2134$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLList $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    
    
    public static SubLObject f9708() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g2103$.getDynamicValue(var1);
    }
    
    public static SubLObject f9709(final SubLObject var2, final SubLObject var3, final SubLObject var4) {
        return module0067.f4886(f9708(), var2, (SubLObject)ConsesLow.list(var3, var4));
    }
    
    public static SubLObject f9710(final SubLObject var5) {
        return module0067.f4884(f9708(), var5, (SubLObject)UNPROVIDED).first();
    }
    
    public static SubLObject f9711(final SubLObject var5) {
        return conses_high.second(module0067.f4884(f9708(), var5, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f9712(final SubLObject var6) {
        return (SubLObject)makeBoolean(var6.isKeyword() && NIL != module0084.f5808(f9708(), var6));
    }
    
    public static SubLObject f9713() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g2104$.getDynamicValue(var1);
    }
    
    public static SubLObject f9714() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g2106$.getDynamicValue(var1);
    }
    
    public static SubLObject f9715() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g2119$.getDynamicValue(var1);
    }
    
    public static SubLObject f9716(final SubLObject var7) {
        assert NIL != module0035.f2327(var7) : var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var8 = (SubLObject)NIL, var8 = var7; NIL != var8; var8 = conses_high.cddr(var8)) {
            var9 = var8.first();
            var10 = conses_high.cadr(var8);
            assert NIL != f9712(var9) : var9;
        }
        if (NIL != conses_high.getf(var7, (SubLObject)$ic1$, (SubLObject)NIL) && !areAssertionsDisabledFor(me) && NIL == f9717(conses_high.getf(var7, (SubLObject)$ic1$, (SubLObject)NIL))) {
            throw new AssertionError(conses_high.getf(var7, (SubLObject)$ic1$, (SubLObject)NIL));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9717(final SubLObject var6) {
        return module0035.f2169(var6, $g2123$.getGlobalValue());
    }
    
    public static SubLObject f9718() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g2105$.getDynamicValue(var1);
    }
    
    public static SubLObject f9719() {
        return Equality.eq((SubLObject)$ic44$, f9718());
    }
    
    public static SubLObject f9720() {
        return (SubLObject)makeBoolean($ic0$ == f9718() || $ic45$ == f9718());
    }
    
    public static SubLObject f9721() {
        return Equality.eq((SubLObject)$ic0$, f9718());
    }
    
    public static SubLObject f9722() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g2124$.getDynamicValue(var1);
    }
    
    public static SubLObject f9723() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g2125$.getDynamicValue(var1);
    }
    
    public static SubLObject f9724() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g2126$.getDynamicValue(var1);
    }
    
    public static SubLObject f9725() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g2127$.getDynamicValue(var1);
    }
    
    public static SubLObject f9726() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g2133$.getDynamicValue(var1);
    }
    
    public static SubLObject f9727() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL != $g2122$.getDynamicValue(var1) && NIL == f9726());
    }
    
    public static SubLObject f9728() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g2134$.getDynamicValue(var1);
    }
    
    public static SubLObject f9729() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0152", "f9708", "S#12477", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0152", "f9709", "S#12505", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0152", "f9710", "S#12509", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0152", "f9711", "S#12510", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0152", "f9712", "S#12511", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0152", "f9713", "S#12512", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0152", "f9714", "S#12513", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0152", "f9715", "S#12514", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0152", "f9716", "S#12476", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0152", "f9717", "S#12515", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0152", "f9718", "S#11859", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0152", "f9719", "S#11860", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0152", "f9720", "S#12516", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0152", "f9721", "S#12517", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0152", "f9722", "S#12518", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0152", "f9723", "S#12519", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0152", "f9724", "S#12497", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0152", "f9725", "S#12500", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0152", "f9726", "S#12520", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0152", "f9727", "S#12521", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0152", "f9728", "S#12522", 0, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9730() {
        $g2103$ = SubLFiles.defvar("S#12523", module0067.f4880(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        $g2104$ = SubLFiles.defparameter("S#12507", (SubLObject)NIL);
        $g2105$ = SubLFiles.defparameter("S#12508", (SubLObject)$ic0$);
        $g2106$ = SubLFiles.defparameter("S#12524", (SubLObject)NIL);
        $g2107$ = SubLFiles.defparameter("S#12525", (SubLObject)T);
        $g2108$ = SubLFiles.defparameter("S#12526", (SubLObject)T);
        $g2109$ = SubLFiles.defparameter("S#12527", (SubLObject)T);
        $g2110$ = SubLFiles.defparameter("S#12528", (SubLObject)T);
        $g2111$ = SubLFiles.defparameter("S#12529", (SubLObject)NIL);
        $g2112$ = SubLFiles.defparameter("S#12530", (SubLObject)T);
        $g2113$ = SubLFiles.defparameter("*ENFORCE-ONLY-DEFINITIONAL-GAFS-IN-VOCAB-MT?*", (SubLObject)NIL);
        $g2114$ = SubLFiles.defparameter("*INHIBIT-CYCLIC-COMMUTATIVE-IN-ARGS?*", (SubLObject)T);
        $g2115$ = SubLFiles.defparameter("*ACCUMULATING-WFF-VIOLATIONS?*", (SubLObject)NIL);
        $g2116$ = SubLFiles.defparameter("S#12463", (SubLObject)NIL);
        $g2117$ = SubLFiles.defparameter("S#12531", (SubLObject)T);
        $g2118$ = SubLFiles.defparameter("S#12532", (SubLObject)T);
        $g2119$ = SubLFiles.defparameter("*WFF-VIOLATION-DATA-TERSE?*", (SubLObject)NIL);
        $g2120$ = SubLFiles.defparameter("S#12533", (SubLObject)NIL);
        $g2121$ = SubLFiles.defparameter("S#12534", (SubLObject)NIL);
        $g2122$ = SubLFiles.defparameter("*VALIDATE-EXPANSIONS?*", (SubLObject)NIL);
        $g2101$ = SubLFiles.defparameter("S#12494", (SubLObject)NIL);
        $g2123$ = SubLFiles.deflexical("S#12535", (SubLObject)$ic43$);
        $g2124$ = SubLFiles.defparameter("S#12536", (SubLObject)NIL);
        $g2125$ = SubLFiles.defparameter("S#12495", (SubLObject)NIL);
        $g2126$ = SubLFiles.defparameter("S#12496", (SubLObject)NIL);
        $g2127$ = SubLFiles.defparameter("S#12499", (SubLObject)NIL);
        $g2128$ = SubLFiles.defparameter("S#12537", (SubLObject)NIL);
        $g2129$ = SubLFiles.defparameter("S#12538", (SubLObject)NIL);
        $g2130$ = SubLFiles.defparameter("S#12539", (SubLObject)NIL);
        $g2131$ = SubLFiles.defparameter("S#12464", (SubLObject)NIL);
        $g2132$ = SubLFiles.defparameter("S#12540", (SubLObject)NIL);
        $g2102$ = SubLFiles.defparameter("S#12501", (SubLObject)NIL);
        $g2133$ = SubLFiles.defparameter("S#12504", (SubLObject)NIL);
        $g2134$ = SubLFiles.defparameter("S#12503", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9731() {
        f9709((SubLObject)$ic1$, (SubLObject)$ic2$, (SubLObject)$ic0$);
        f9709((SubLObject)$ic3$, (SubLObject)$ic4$, (SubLObject)NIL);
        f9709((SubLObject)$ic5$, (SubLObject)$ic6$, (SubLObject)T);
        f9709((SubLObject)$ic7$, (SubLObject)$ic8$, (SubLObject)T);
        f9709((SubLObject)$ic9$, (SubLObject)$ic10$, (SubLObject)T);
        f9709((SubLObject)$ic11$, (SubLObject)$ic12$, (SubLObject)T);
        f9709((SubLObject)$ic13$, (SubLObject)$ic14$, (SubLObject)NIL);
        f9709((SubLObject)$ic15$, (SubLObject)$ic16$, (SubLObject)T);
        f9709((SubLObject)$ic17$, (SubLObject)$ic18$, (SubLObject)NIL);
        f9709((SubLObject)$ic19$, (SubLObject)$ic20$, (SubLObject)T);
        f9709((SubLObject)$ic21$, (SubLObject)$ic22$, (SubLObject)NIL);
        f9709((SubLObject)$ic23$, (SubLObject)$ic24$, (SubLObject)NIL);
        f9709((SubLObject)$ic25$, (SubLObject)$ic26$, (SubLObject)T);
        f9709((SubLObject)$ic27$, (SubLObject)$ic28$, (SubLObject)T);
        f9709((SubLObject)$ic29$, (SubLObject)$ic30$, (SubLObject)NIL);
        f9709((SubLObject)$ic31$, (SubLObject)$ic32$, (SubLObject)NIL);
        f9709((SubLObject)$ic33$, (SubLObject)$ic34$, (SubLObject)NIL);
        f9709((SubLObject)$ic35$, (SubLObject)$ic36$, (SubLObject)NIL);
        f9709((SubLObject)$ic37$, (SubLObject)NIL, (SubLObject)$ic38$);
        f9709((SubLObject)$ic39$, (SubLObject)NIL, (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f9729();
    }
    
    public void initializeVariables() {
        f9730();
    }
    
    public void runTopLevelForms() {
        f9731();
    }
    
    static {
        me = (SubLFile)new module0152();
        $g2103$ = null;
        $g2104$ = null;
        $g2105$ = null;
        $g2106$ = null;
        $g2107$ = null;
        $g2108$ = null;
        $g2109$ = null;
        $g2110$ = null;
        $g2111$ = null;
        $g2112$ = null;
        $g2113$ = null;
        $g2114$ = null;
        $g2115$ = null;
        $g2116$ = null;
        $g2117$ = null;
        $g2118$ = null;
        $g2119$ = null;
        $g2120$ = null;
        $g2121$ = null;
        $g2122$ = null;
        $g2101$ = null;
        $g2123$ = null;
        $g2124$ = null;
        $g2125$ = null;
        $g2126$ = null;
        $g2127$ = null;
        $g2128$ = null;
        $g2129$ = null;
        $g2130$ = null;
        $g2131$ = null;
        $g2132$ = null;
        $g2102$ = null;
        $g2133$ = null;
        $g2134$ = null;
        $ic0$ = makeKeyword("ASSERTIVE");
        $ic1$ = makeKeyword("WFF-MODE");
        $ic2$ = makeSymbol("S#12508", "CYC");
        $ic3$ = makeKeyword("DEBUG?");
        $ic4$ = makeSymbol("S#12524", "CYC");
        $ic5$ = makeKeyword("VALIDATE-CONSTANTS?");
        $ic6$ = makeSymbol("S#12525", "CYC");
        $ic7$ = makeKeyword("RECOGNIZE-VARIABLES?");
        $ic8$ = makeSymbol("S#12526", "CYC");
        $ic9$ = makeKeyword("REJECT-SBHL-CONFLICTS?");
        $ic10$ = makeSymbol("S#12527", "CYC");
        $ic11$ = makeKeyword("INHIBIT-SKOLEM-ASSERTS?");
        $ic12$ = makeSymbol("S#12528", "CYC");
        $ic13$ = makeKeyword("SIMPLIFY-EVALUATABLE-EXPRESSIONS?");
        $ic14$ = makeSymbol("S#12529", "CYC");
        $ic15$ = makeKeyword("ENFORCE-EVALUATABLE-SATISFIABILITY?");
        $ic16$ = makeSymbol("S#12530", "CYC");
        $ic17$ = makeKeyword("ENFORCE-ONLY-DEFINITIONAL-GAFS-IN-VOCAB-MT?");
        $ic18$ = makeSymbol("*ENFORCE-ONLY-DEFINITIONAL-GAFS-IN-VOCAB-MT?*");
        $ic19$ = makeKeyword("INHIBIT-CYCLIC-COMMUTATIVE-IN-ARGS?");
        $ic20$ = makeSymbol("*INHIBIT-CYCLIC-COMMUTATIVE-IN-ARGS?*");
        $ic21$ = makeKeyword("ACCUMULATING-VIOLATIONS?");
        $ic22$ = makeSymbol("*ACCUMULATING-WFF-VIOLATIONS?*");
        $ic23$ = makeKeyword("NOTING-VIOLATIONS?");
        $ic24$ = makeSymbol("S#12463", "CYC");
        $ic25$ = makeKeyword("INCLUDE-SUF-DEFN-VIOLATIONS?");
        $ic26$ = makeSymbol("S#12531", "CYC");
        $ic27$ = makeKeyword("ENFORCE-LITERAL-IDIOSYNCRASIES?");
        $ic28$ = makeSymbol("S#12532", "CYC");
        $ic29$ = makeKeyword("VIOLATION-DATA-TERSE?");
        $ic30$ = makeSymbol("*WFF-VIOLATION-DATA-TERSE?*");
        $ic31$ = makeKeyword("PERMIT-KEYWORD-VARIABLES?");
        $ic32$ = makeSymbol("S#12533", "CYC");
        $ic33$ = makeKeyword("PERMIT-GENERIC-ARG-VARIABLES?");
        $ic34$ = makeSymbol("S#12534", "CYC");
        $ic35$ = makeKeyword("VALIDATE-EXPANSIONS?");
        $ic36$ = makeSymbol("*VALIDATE-EXPANSIONS?*");
        $ic37$ = makeKeyword("IO-MODE");
        $ic38$ = makeKeyword("NL");
        $ic39$ = makeKeyword("VIOLATIONS");
        $ic40$ = makeSymbol("S#748", "CYC");
        $ic41$ = makeSymbol("S#12511", "CYC");
        $ic42$ = makeSymbol("S#12515", "CYC");
        $ic43$ = ConsesLow.list((SubLObject)makeKeyword("STRICT"), (SubLObject)makeKeyword("LENIENT"), (SubLObject)makeKeyword("ASSERTIVE"));
        $ic44$ = makeKeyword("STRICT");
        $ic45$ = makeKeyword("LENIENT");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 82 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/