package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0155 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0155";
    public static final String myFingerPrint = "d78a5b58569f74e31ad851a2d2c15f0e379ed7a90f789a9f7f75c7fc99ea2dbc";
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLString $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLList $ic4$;
    private static final SubLString $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLList $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLList $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLList $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLList $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLList $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLList $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLList $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLList $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLList $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLList $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLList $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLList $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLList $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLList $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLList $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLList $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLList $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLList $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLList $ic59$;
    
    public static SubLObject f9771(final SubLObject var1) {
        Errors.warn((SubLObject)$ic2$);
        return module0167.f10813(var1);
    }
    
    public static SubLObject f9772(final SubLObject var2) {
        Errors.warn((SubLObject)$ic5$);
        return module0172.f10921(var2);
    }
    
    public static SubLObject f9773() {
        final SubLObject var3 = module0011.f353().first();
        return (SubLObject)(var3.isInteger() ? var3 : ZERO_INTEGER);
    }
    
    public static SubLObject f9774() {
        final SubLObject var3 = conses_high.second(module0011.f353());
        return (SubLObject)(var3.isInteger() ? var3 : ZERO_INTEGER);
    }
    
    public static SubLObject f9775(final SubLObject var4, final SubLObject var5, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        if (var5.numG((SubLObject)ZERO_INTEGER)) {
            return module0279.f18485(var4, var5, var6);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9776(final SubLObject var7, SubLObject var8) {
        if (var8 == UNPROVIDED) {
            var8 = Symbols.symbol_function((SubLObject)$ic13$);
        }
        return module0210.f13576(var7, var8);
    }
    
    public static SubLObject f9777(final SubLObject var1) {
        return module0226.f14792(var1);
    }
    
    public static SubLObject f9778(final SubLObject var9) {
        return module0279.f18541(var9);
    }
    
    public static SubLObject f9779(final SubLObject var9, SubLObject var8, SubLObject var6) {
        if (var8 == UNPROVIDED) {
            var8 = Symbols.symbol_function((SubLObject)$ic20$);
        }
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        return module0279.f18539(var9, var8, var6);
    }
    
    public static SubLObject f9780(final SubLObject var7, SubLObject var8) {
        if (var8 == UNPROVIDED) {
            var8 = Symbols.symbol_function((SubLObject)$ic23$);
        }
        return module0210.f13599(var7, var8);
    }
    
    public static SubLObject f9781(final SubLObject var1, SubLObject var6, SubLObject var8) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        if (var8 == UNPROVIDED) {
            var8 = Symbols.symbol_function((SubLObject)$ic13$);
        }
        final SubLThread var9 = SubLProcess.currentSubLThread();
        SubLObject var10 = (SubLObject)NIL;
        final SubLObject var11 = module0147.$g2094$.currentBinding(var9);
        final SubLObject var12 = module0147.$g2095$.currentBinding(var9);
        try {
            module0147.$g2094$.bind((SubLObject)$ic25$, var9);
            module0147.$g2095$.bind(var6, var9);
            var10 = module0210.f13576(var1, var8);
        }
        finally {
            module0147.$g2095$.rebind(var12, var9);
            module0147.$g2094$.rebind(var11, var9);
        }
        return var10;
    }
    
    public static SubLObject f9782(final SubLObject var7, SubLObject var8) {
        if (var8 == UNPROVIDED) {
            var8 = Symbols.symbol_function((SubLObject)$ic20$);
        }
        return module0210.f13593(var7, var8);
    }
    
    public static SubLObject f9783(final SubLObject var7) {
        return module0210.f13594(var7);
    }
    
    public static SubLObject f9784(final SubLObject var1) {
        return module0205.f13330(var1);
    }
    
    public static SubLObject f9785(final SubLObject var1, SubLObject var8) {
        if (var8 == UNPROVIDED) {
            var8 = Symbols.symbol_function((SubLObject)$ic20$);
        }
        return module0210.f13595(var1, var8);
    }
    
    public static SubLObject f9786(final SubLObject var1, SubLObject var8) {
        if (var8 == UNPROVIDED) {
            var8 = Symbols.symbol_function((SubLObject)$ic20$);
        }
        return module0210.f13595(var1, var8);
    }
    
    public static SubLObject f9787(final SubLObject var14, final SubLObject var15) {
        return module0205.f13326(var14, var15);
    }
    
    public static SubLObject f9788(final SubLObject var1) {
        return module0205.f13327(var1);
    }
    
    public static SubLObject f9789(final SubLObject var1) {
        return module0205.f13327(var1);
    }
    
    public static SubLObject f9790(final SubLObject var1) {
        return module0205.f13328(var1);
    }
    
    public static SubLObject f9791(final SubLObject var1) {
        return module0205.f13329(var1);
    }
    
    public static SubLObject f9792(final SubLObject var1, SubLObject var8) {
        if (var8 == UNPROVIDED) {
            var8 = Symbols.symbol_function((SubLObject)$ic20$);
        }
        return module0210.f13596(var1, var8);
    }
    
    public static SubLObject f9793(final SubLObject var1) {
        return module0210.f13598(var1);
    }
    
    public static SubLObject f9794(final SubLObject var7, SubLObject var8) {
        if (var8 == UNPROVIDED) {
            var8 = Symbols.symbol_function((SubLObject)$ic13$);
        }
        return module0210.f13597(var7, var8);
    }
    
    public static SubLObject f9795(final SubLObject var16, SubLObject var17, SubLObject var8, SubLObject var18) {
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)$ic20$;
        }
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)T;
        }
        return module0202.f12911(var16, var17, var8, var18);
    }
    
    public static SubLObject f9796(final SubLObject var16, SubLObject var8, SubLObject var18) {
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)$ic20$;
        }
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)T;
        }
        return module0202.f12943(var16, var8, var18);
    }
    
    public static SubLObject f9797(final SubLObject var19, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(NIL != module0173.f10955(var19) && NIL != module0226.f14858(var19, var6));
    }
    
    public static SubLObject f9798(final SubLObject var20, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        return module0226.f14847(var20, var6);
    }
    
    public static SubLObject f9799(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL == var1 || var1 == T);
    }
    
    public static SubLObject f9800() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0155", "f9771", "S#12602", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0155", "f9772", "S#12603", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0155", "f9773", "CYCL-SYSTEM-NUMBER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0155", "f9774", "CYCL-PATCH-NUMBER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0155", "f9775", "S#12604", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0155", "f9776", "S#12605", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0155", "f9777", "S#12606", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0155", "f9778", "S#12607", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0155", "f9779", "S#12608", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0155", "f9780", "S#12609", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0155", "f9781", "S#12610", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0155", "f9782", "S#12611", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0155", "f9783", "S#12612", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0155", "f9784", "S#12613", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0155", "f9785", "S#11722", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0155", "f9786", "S#12614", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0155", "f9787", "S#12615", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0155", "f9788", "S#12616", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0155", "f9789", "S#12617", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0155", "f9790", "S#12618", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0155", "f9791", "S#12619", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0155", "f9792", "S#12620", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0155", "f9793", "S#12621", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0155", "f9794", "S#12622", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0155", "f9795", "S#12623", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0155", "f9796", "S#12624", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0155", "f9797", "S#12625", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0155", "f9798", "S#12626", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0155", "f9799", "S#12627", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9801() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9802() {
        module0002.f35((SubLObject)$ic0$, (SubLObject)$ic1$);
        module0002.f35((SubLObject)$ic3$, (SubLObject)$ic4$);
        module0002.f35((SubLObject)$ic6$, (SubLObject)$ic7$);
        module0002.f35((SubLObject)$ic8$, (SubLObject)$ic7$);
        module0002.f35((SubLObject)$ic9$, (SubLObject)$ic10$);
        module0002.f35((SubLObject)$ic11$, (SubLObject)$ic12$);
        module0002.f35((SubLObject)$ic14$, (SubLObject)$ic15$);
        module0002.f35((SubLObject)$ic16$, (SubLObject)$ic17$);
        module0002.f35((SubLObject)$ic18$, (SubLObject)$ic19$);
        module0002.f35((SubLObject)$ic21$, (SubLObject)$ic22$);
        module0002.f35((SubLObject)$ic24$, (SubLObject)NIL);
        module0002.f35((SubLObject)$ic26$, (SubLObject)$ic27$);
        module0002.f35((SubLObject)$ic28$, (SubLObject)$ic29$);
        module0002.f35((SubLObject)$ic30$, (SubLObject)$ic31$);
        module0002.f35((SubLObject)$ic32$, (SubLObject)$ic33$);
        module0002.f35((SubLObject)$ic34$, (SubLObject)$ic33$);
        module0002.f35((SubLObject)$ic35$, (SubLObject)$ic36$);
        module0002.f35((SubLObject)$ic37$, (SubLObject)$ic38$);
        module0002.f35((SubLObject)$ic39$, (SubLObject)$ic38$);
        module0002.f35((SubLObject)$ic40$, (SubLObject)$ic41$);
        module0002.f35((SubLObject)$ic42$, (SubLObject)$ic43$);
        module0002.f35((SubLObject)$ic44$, (SubLObject)$ic45$);
        module0002.f35((SubLObject)$ic46$, (SubLObject)$ic47$);
        module0002.f35((SubLObject)$ic48$, (SubLObject)$ic49$);
        module0002.f35((SubLObject)$ic50$, (SubLObject)$ic51$);
        module0002.f35((SubLObject)$ic52$, (SubLObject)$ic53$);
        module0002.f35((SubLObject)$ic54$, (SubLObject)$ic55$);
        module0002.f35((SubLObject)$ic56$, (SubLObject)$ic57$);
        module0002.f35((SubLObject)$ic58$, (SubLObject)$ic59$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f9800();
    }
    
    public void initializeVariables() {
        f9801();
    }
    
    public void runTopLevelForms() {
        f9802();
    }
    
    static {
        me = (SubLFile)new module0155();
        $ic0$ = makeSymbol("S#12602", "CYC");
        $ic1$ = ConsesLow.list((SubLObject)makeSymbol("NART-P"), (SubLObject)makeSymbol("S#12628", "CYC"));
        $ic2$ = makeString("NAT-P is obsolete ; use NART-P or CYCL-NAT-P");
        $ic3$ = makeSymbol("S#12603", "CYC");
        $ic4$ = ConsesLow.list((SubLObject)makeSymbol("NART-P"));
        $ic5$ = makeString("FIND-NAT is obsolete ; use FIND-NART");
        $ic6$ = makeSymbol("CYCL-SYSTEM-NUMBER");
        $ic7$ = ConsesLow.list((SubLObject)makeSymbol("CYC-REVISION-NUMBERS"));
        $ic8$ = makeSymbol("CYCL-PATCH-NUMBER");
        $ic9$ = makeSymbol("S#12604", "CYC");
        $ic10$ = ConsesLow.list((SubLObject)makeSymbol("S#12584", "CYC"));
        $ic11$ = makeSymbol("S#12605", "CYC");
        $ic12$ = ConsesLow.list((SubLObject)makeSymbol("S#12585", "CYC"));
        $ic13$ = makeSymbol("EL-VAR?");
        $ic14$ = makeSymbol("S#12606", "CYC");
        $ic15$ = ConsesLow.list((SubLObject)makeSymbol("RELATION?"));
        $ic16$ = makeSymbol("S#12607", "CYC");
        $ic17$ = ConsesLow.list((SubLObject)makeSymbol("S#12586", "CYC"));
        $ic18$ = makeSymbol("S#12608", "CYC");
        $ic19$ = ConsesLow.list((SubLObject)makeSymbol("S#12587", "CYC"));
        $ic20$ = makeSymbol("S#12629", "CYC");
        $ic21$ = makeSymbol("S#12609", "CYC");
        $ic22$ = ConsesLow.list((SubLObject)makeSymbol("S#12588", "CYC"));
        $ic23$ = makeSymbol("VARIABLE-P");
        $ic24$ = makeSymbol("S#12610", "CYC");
        $ic25$ = makeSymbol("S#12278", "CYC");
        $ic26$ = makeSymbol("S#12611", "CYC");
        $ic27$ = ConsesLow.list((SubLObject)makeSymbol("S#12589", "CYC"));
        $ic28$ = makeSymbol("S#12612", "CYC");
        $ic29$ = ConsesLow.list((SubLObject)makeSymbol("S#12590", "CYC"));
        $ic30$ = makeSymbol("S#12613", "CYC");
        $ic31$ = ConsesLow.list((SubLObject)makeSymbol("S#12591", "CYC"));
        $ic32$ = makeSymbol("S#11722", "CYC");
        $ic33$ = ConsesLow.list((SubLObject)makeSymbol("S#12592", "CYC"));
        $ic34$ = makeSymbol("S#12614", "CYC");
        $ic35$ = makeSymbol("S#12615", "CYC");
        $ic36$ = ConsesLow.list((SubLObject)makeSymbol("S#12593", "CYC"));
        $ic37$ = makeSymbol("S#12616", "CYC");
        $ic38$ = ConsesLow.list((SubLObject)makeSymbol("S#12594", "CYC"));
        $ic39$ = makeSymbol("S#12617", "CYC");
        $ic40$ = makeSymbol("S#12618", "CYC");
        $ic41$ = ConsesLow.list((SubLObject)makeSymbol("S#12595", "CYC"));
        $ic42$ = makeSymbol("S#12619", "CYC");
        $ic43$ = ConsesLow.list((SubLObject)makeSymbol("S#12596", "CYC"));
        $ic44$ = makeSymbol("S#12620", "CYC");
        $ic45$ = ConsesLow.list((SubLObject)makeSymbol("S#12597", "CYC"));
        $ic46$ = makeSymbol("S#12621", "CYC");
        $ic47$ = ConsesLow.list((SubLObject)makeSymbol("S#12598", "CYC"));
        $ic48$ = makeSymbol("S#12622", "CYC");
        $ic49$ = ConsesLow.list((SubLObject)makeSymbol("S#12599", "CYC"));
        $ic50$ = makeSymbol("S#12623", "CYC");
        $ic51$ = ConsesLow.list((SubLObject)makeSymbol("SENTENCE-FREE-VARIABLES"));
        $ic52$ = makeSymbol("S#12624", "CYC");
        $ic53$ = ConsesLow.list((SubLObject)makeSymbol("SENTENCE-VARIABLES"));
        $ic54$ = makeSymbol("S#12625", "CYC");
        $ic55$ = ConsesLow.list((SubLObject)makeSymbol("S#12600", "CYC"));
        $ic56$ = makeSymbol("S#12626", "CYC");
        $ic57$ = ConsesLow.list((SubLObject)makeSymbol("S#12601", "CYC"));
        $ic58$ = makeSymbol("S#12627", "CYC");
        $ic59$ = ConsesLow.list((SubLObject)makeSymbol("BOOLEANP"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 107 ms
	
	Decompiled with Procyon 0.5.32.
*/