package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0130 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0130";
    public static final String myFingerPrint = "c8c44e528a78b3e60b002e94ad9def197e754f717183f35eea1e25624cb9921d";
    private static SubLSymbol $g1505$;
    private static SubLSymbol $g1506$;
    public static SubLSymbol $g1507$;
    private static SubLSymbol $g1508$;
    public static SubLSymbol $g1509$;
    private static SubLSymbol $g1510$;
    public static SubLSymbol $g1511$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLString $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLString $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLString $ic15$;
    private static final SubLString $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLString $ic19$;
    private static final SubLList $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLString $ic22$;
    private static final SubLString $ic23$;
    private static final SubLList $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLString $ic31$;
    private static final SubLString $ic32$;
    private static final SubLList $ic33$;
    
    public static SubLObject f8502() {
        return $g1505$.getGlobalValue();
    }
    
    public static SubLObject f8503(final SubLObject var1) {
        return module0035.f2169(var1, $g1505$.getGlobalValue());
    }
    
    public static SubLObject f8504(final SubLObject var2) {
        return Sequences.position(var2, f8502(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f8505(final SubLObject var3) {
        return ConsesLow.nth(var3, f8502());
    }
    
    public static SubLObject f8506(final SubLObject var1) {
        return module0035.f2169(var1, $g1506$.getGlobalValue());
    }
    
    public static SubLObject f8507(final SubLObject var1) {
        return module0035.f2169(var1, $g1507$.getGlobalValue());
    }
    
    public static SubLObject f8508(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f8507(var1) || $ic9$ == var1);
    }
    
    public static SubLObject f8509(final SubLObject var4, final SubLObject var5) {
        return (SubLObject)makeBoolean(NIL == module0035.f2385(var4, var5, $g1507$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f8510() {
        return $g1508$.getGlobalValue();
    }
    
    public static SubLObject f8511(final SubLObject var1) {
        return (SubLObject)makeBoolean(var1 == $ic11$ || var1 == $ic12$ || var1 == $ic13$);
    }
    
    public static SubLObject f8512(final SubLObject var6) {
        if (var6.eql((SubLObject)$ic11$)) {
            return (SubLObject)$ic12$;
        }
        if (var6.eql((SubLObject)$ic12$)) {
            return (SubLObject)$ic11$;
        }
        if (var6.eql((SubLObject)$ic13$)) {
            return (SubLObject)$ic13$;
        }
        return Errors.error((SubLObject)$ic16$, var6);
    }
    
    public static SubLObject f8513(final SubLObject var6) {
        if (var6.eql((SubLObject)$ic11$)) {
            return (SubLObject)$ic17$;
        }
        if (var6.eql((SubLObject)$ic12$)) {
            return (SubLObject)$ic18$;
        }
        if (var6.eql((SubLObject)$ic13$)) {
            return (SubLObject)$ic18$;
        }
        return Errors.error((SubLObject)$ic16$, var6);
    }
    
    public static SubLObject f8514(final SubLObject var6) {
        if (var6.eql((SubLObject)$ic11$)) {
            return (SubLObject)T;
        }
        if (var6.eql((SubLObject)$ic12$)) {
            return (SubLObject)NIL;
        }
        if (var6.eql((SubLObject)$ic13$)) {
            Errors.error((SubLObject)$ic19$);
            return (SubLObject)NIL;
        }
        return Errors.error((SubLObject)$ic16$, var6);
    }
    
    public static SubLObject f8515(final SubLObject var8) {
        return (SubLObject)((NIL != var8) ? $ic11$ : $ic12$);
    }
    
    public static SubLObject f8516(final SubLObject var1) {
        return module0035.f2169(var1, $g1509$.getGlobalValue());
    }
    
    public static SubLObject f8517(final SubLObject var9) {
        if (var9.eql((SubLObject)$ic17$)) {
            return (SubLObject)$ic18$;
        }
        if (var9.eql((SubLObject)$ic18$)) {
            return (SubLObject)$ic17$;
        }
        return Errors.error((SubLObject)$ic23$, var9);
    }
    
    public static SubLObject f8518(final SubLObject var9) {
        if (var9.eql((SubLObject)$ic17$)) {
            return (SubLObject)$ic11$;
        }
        if (var9.eql((SubLObject)$ic18$)) {
            return (SubLObject)$ic12$;
        }
        return Errors.error((SubLObject)$ic23$, var9);
    }
    
    public static SubLObject f8519() {
        return $g1510$.getGlobalValue();
    }
    
    public static SubLObject f8520(final SubLObject var1) {
        return module0035.f2169(var1, $g1510$.getGlobalValue());
    }
    
    public static SubLObject f8521(final SubLObject var10) {
        return Sequences.position(var10, f8519(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f8522(final SubLObject var3) {
        return ConsesLow.nth(var3, f8519());
    }
    
    public static SubLObject f8523(final SubLObject var10) {
        if (var10.eql((SubLObject)$ic25$)) {
            return (SubLObject)$ic26$;
        }
        if (var10.eql((SubLObject)$ic27$)) {
            return (SubLObject)$ic28$;
        }
        if (var10.eql((SubLObject)$ic29$)) {
            return (SubLObject)$ic26$;
        }
        if (var10.eql((SubLObject)$ic30$)) {
            return (SubLObject)$ic28$;
        }
        if (var10.eql((SubLObject)$ic13$)) {
            return (SubLObject)$ic26$;
        }
        return Errors.error((SubLObject)$ic31$, var10);
    }
    
    public static SubLObject f8524(final SubLObject var10) {
        if (var10.eql((SubLObject)$ic25$)) {
            return (SubLObject)$ic11$;
        }
        if (var10.eql((SubLObject)$ic27$)) {
            return (SubLObject)$ic11$;
        }
        if (var10.eql((SubLObject)$ic29$)) {
            return (SubLObject)$ic12$;
        }
        if (var10.eql((SubLObject)$ic30$)) {
            return (SubLObject)$ic12$;
        }
        if (var10.eql((SubLObject)$ic13$)) {
            return (SubLObject)$ic13$;
        }
        return Errors.error((SubLObject)$ic31$, var10);
    }
    
    public static SubLObject f8525(final SubLObject var10) {
        if (var10.eql((SubLObject)$ic27$)) {
            return (SubLObject)$ic30$;
        }
        if (var10.eql((SubLObject)$ic25$)) {
            return (SubLObject)$ic29$;
        }
        if (var10.eql((SubLObject)$ic30$)) {
            return (SubLObject)$ic27$;
        }
        if (var10.eql((SubLObject)$ic29$)) {
            return (SubLObject)$ic25$;
        }
        if (var10.eql((SubLObject)$ic13$)) {
            return (SubLObject)$ic13$;
        }
        return Errors.error((SubLObject)$ic31$, var10);
    }
    
    public static SubLObject f8526(final SubLObject var10) {
        return (SubLObject)makeBoolean(var10 == $ic25$ || var10 == $ic27$);
    }
    
    public static SubLObject f8527(final SubLObject var10) {
        return (SubLObject)makeBoolean(var10 == $ic29$ || var10 == $ic30$);
    }
    
    public static SubLObject f8528(final SubLObject var10) {
        return f8513(f8524(var10));
    }
    
    public static SubLObject f8529(final SubLObject var6, final SubLObject var11) {
        if (var6.eql((SubLObject)$ic11$)) {
            if (var11.eql((SubLObject)$ic26$)) {
                return (SubLObject)$ic25$;
            }
            if (var11.eql((SubLObject)$ic28$)) {
                return (SubLObject)$ic27$;
            }
            return Errors.error((SubLObject)$ic32$, var11);
        }
        else if (var6.eql((SubLObject)$ic12$)) {
            if (var11.eql((SubLObject)$ic26$)) {
                return (SubLObject)$ic29$;
            }
            if (var11.eql((SubLObject)$ic28$)) {
                return (SubLObject)$ic30$;
            }
            return Errors.error((SubLObject)$ic32$, var11);
        }
        else {
            if (var6.eql((SubLObject)$ic13$)) {
                return (SubLObject)$ic13$;
            }
            return Errors.error((SubLObject)$ic16$, var6);
        }
    }
    
    public static SubLObject f8530(final SubLObject var9, final SubLObject var11) {
        return f8529(f8518(var9), var11);
    }
    
    public static SubLObject f8531(final SubLObject var1) {
        return conses_high.member(var1, $g1511$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f8532() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0130", "f8502", "S#10601", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0130", "f8503", "DIRECTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0130", "f8504", "S#10602", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0130", "f8505", "S#10603", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0130", "f8506", "S#10604", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0130", "f8507", "EL-STRENGTH-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0130", "f8508", "S#10605", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0130", "f8509", "S#10606", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0130", "f8510", "S#10607", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0130", "f8511", "TRUTH-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0130", "f8512", "S#10608", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0130", "f8513", "S#10609", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0130", "f8514", "S#10610", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0130", "f8515", "S#10611", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0130", "f8516", "SENSE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0130", "f8517", "S#10612", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0130", "f8518", "S#10613", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0130", "f8519", "S#10614", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0130", "f8520", "S#10615", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0130", "f8521", "S#10616", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0130", "f8522", "S#10617", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0130", "f8523", "S#10618", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0130", "f8524", "S#10619", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0130", "f8525", "S#10620", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0130", "f8526", "S#10621", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0130", "f8527", "S#10622", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0130", "f8528", "S#10623", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0130", "f8529", "S#10624", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0130", "f8530", "S#10625", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0130", "f8531", "S#10626", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8533() {
        $g1505$ = SubLFiles.defconstant("S#10627", (SubLObject)$ic0$);
        $g1506$ = SubLFiles.defconstant("S#10628", (SubLObject)$ic5$);
        $g1507$ = SubLFiles.defconstant("S#10629", (SubLObject)$ic6$);
        $g1508$ = SubLFiles.defconstant("S#10630", (SubLObject)$ic10$);
        $g1509$ = SubLFiles.defconstant("S#10631", (SubLObject)$ic20$);
        $g1510$ = SubLFiles.defconstant("S#10632", (SubLObject)$ic24$);
        $g1511$ = SubLFiles.defconstant("S#10633", (SubLObject)$ic33$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8534() {
        module0012.f368((SubLObject)$ic1$, (SubLObject)$ic2$, (SubLObject)$ic3$, (SubLObject)NIL, (SubLObject)$ic4$);
        module0012.f368((SubLObject)$ic7$, (SubLObject)$ic2$, (SubLObject)$ic8$, (SubLObject)NIL, (SubLObject)$ic4$);
        module0012.f368((SubLObject)$ic14$, (SubLObject)$ic2$, (SubLObject)$ic15$, (SubLObject)NIL, (SubLObject)NIL);
        module0012.f368((SubLObject)$ic21$, (SubLObject)$ic2$, (SubLObject)$ic22$, (SubLObject)NIL, (SubLObject)$ic4$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f8532();
    }
    
    public void initializeVariables() {
        f8533();
    }
    
    public void runTopLevelForms() {
        f8534();
    }
    
    static {
        me = (SubLFile)new module0130();
        $g1505$ = null;
        $g1506$ = null;
        $g1507$ = null;
        $g1508$ = null;
        $g1509$ = null;
        $g1510$ = null;
        $g1511$ = null;
        $ic0$ = ConsesLow.list((SubLObject)makeKeyword("BACKWARD"), (SubLObject)makeKeyword("FORWARD"), (SubLObject)makeKeyword("CODE"));
        $ic1$ = makeSymbol("DIRECTION-P");
        $ic2$ = ConsesLow.list((SubLObject)makeSymbol("OBJECT", "CYC"));
        $ic3$ = makeString("Return T iff OBJECT is a valid assertion inference direction\n :backward :forward or :code.");
        $ic4$ = ConsesLow.list((SubLObject)makeSymbol("BOOLEANP"));
        $ic5$ = ConsesLow.list((SubLObject)makeKeyword("GAF"), (SubLObject)makeKeyword("RULE"));
        $ic6$ = ConsesLow.list((SubLObject)makeKeyword("DEFAULT"), (SubLObject)makeKeyword("MONOTONIC"));
        $ic7$ = makeSymbol("EL-STRENGTH-P");
        $ic8$ = makeString("Return T iff OBJECT is a valid CycL assertion strength \n :default or :monotonic.");
        $ic9$ = makeKeyword("UNSPECIFIED");
        $ic10$ = ConsesLow.list((SubLObject)makeKeyword("TRUE"), (SubLObject)makeKeyword("UNKNOWN"), (SubLObject)makeKeyword("FALSE"));
        $ic11$ = makeKeyword("TRUE");
        $ic12$ = makeKeyword("FALSE");
        $ic13$ = makeKeyword("UNKNOWN");
        $ic14$ = makeSymbol("TRUTH-P");
        $ic15$ = makeString("Returns T iff OBJECT is a valid CycL truth\n :true :false or :unknown.");
        $ic16$ = makeString("~S is not a TRUTH-P");
        $ic17$ = makeKeyword("POS");
        $ic18$ = makeKeyword("NEG");
        $ic19$ = makeString(":unknown cannot be converted into a boolean");
        $ic20$ = ConsesLow.list((SubLObject)makeKeyword("NEG"), (SubLObject)makeKeyword("POS"));
        $ic21$ = makeSymbol("SENSE-P");
        $ic22$ = makeString("Return T iff OBJECT is a valid CycL literal sense\n :neg or :pos.");
        $ic23$ = makeString("~S is not a SENSE-P");
        $ic24$ = ConsesLow.list((SubLObject)makeKeyword("TRUE-MON"), (SubLObject)makeKeyword("TRUE-DEF"), (SubLObject)makeKeyword("UNKNOWN"), (SubLObject)makeKeyword("FALSE-DEF"), (SubLObject)makeKeyword("FALSE-MON"));
        $ic25$ = makeKeyword("TRUE-DEF");
        $ic26$ = makeKeyword("DEFAULT");
        $ic27$ = makeKeyword("TRUE-MON");
        $ic28$ = makeKeyword("MONOTONIC");
        $ic29$ = makeKeyword("FALSE-DEF");
        $ic30$ = makeKeyword("FALSE-MON");
        $ic31$ = makeString("~S does not satisfy TV-P");
        $ic32$ = makeString("~S is not a STRENGTH-P");
        $ic33$ = ConsesLow.list(new SubLObject[] { ONE_INTEGER, TWO_INTEGER, ZERO_INTEGER, makeKeyword("NEG"), makeKeyword("POS"), THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, makeKeyword("IST"), makeKeyword("OTHER") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 81 ms
	
	Decompiled with Procyon 0.5.32.
*/