package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0097 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0097";
    public static final String myFingerPrint = "713cc819dd36c6408bfa80ca38e71142d8e3b0cf0f60d1d73f63ecc4a03254bf";
    private static final SubLString $ic0$;
    private static final SubLList $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLList $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLList $ic17$;
    private static final SubLList $ic18$;
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
    
    public static SubLObject f7010(final SubLObject var1) {
        return (SubLObject)makeBoolean(var1.isHashtable() || NIL != module0093.f6457(var1));
    }
    
    public static SubLObject f7011(final SubLObject var2, final SubLObject var3, final SubLObject var4) {
        if (var3.isHashtable()) {
            return Hashtables.sethash(var2, var3, var4);
        }
        if (NIL != module0093.f6457(var3)) {
            return module0093.f6618(var2, var3, var4);
        }
        Errors.error((SubLObject)$ic0$, var3);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7012(final SubLObject var2, final SubLObject var3, SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        if (var3.isHashtable()) {
            return Hashtables.gethash(var2, var3, var5);
        }
        if (NIL != module0093.f6457(var3)) {
            return module0093.f6621(var2, var3, var5);
        }
        Errors.error((SubLObject)$ic0$, var3);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7013(final SubLObject var2, final SubLObject var3) {
        if (var3.isHashtable()) {
            return Hashtables.remhash(var2, var3);
        }
        if (NIL != module0093.f6457(var3)) {
            return module0093.f6624(var2, var3);
        }
        Errors.error((SubLObject)$ic0$, var3);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7014(final SubLObject var3) {
        if (var3.isHashtable()) {
            return module0030.f1625(var3);
        }
        if (NIL != module0093.f6457(var3)) {
            return module0093.f6638(var3);
        }
        Errors.error((SubLObject)$ic0$, var3);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7015(final SubLObject var3) {
        if (var3.isHashtable()) {
            return Hashtables.hash_table_size(var3);
        }
        if (NIL != module0093.f6457(var3)) {
            return module0093.f6617(var3);
        }
        Errors.error((SubLObject)$ic0$, var3);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7016(final SubLObject var3) {
        if (var3.isHashtable()) {
            return Hashtables.hash_table_count(var3);
        }
        if (NIL != module0093.f6457(var3)) {
            return module0093.f6612(var3);
        }
        Errors.error((SubLObject)$ic0$, var3);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7017(final SubLObject var6, final SubLObject var7) {
        SubLObject var9;
        final SubLObject var8 = var9 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic1$);
        final SubLObject var10 = var9.rest();
        var9 = var9.first();
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic1$);
        var11 = var9.first();
        var9 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic1$);
        var12 = var9.first();
        var9 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic1$);
        var13 = var9.first();
        var9 = var9.rest();
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = var9;
        SubLObject var16 = (SubLObject)NIL;
        SubLObject var14_15 = (SubLObject)NIL;
        while (NIL != var15) {
            cdestructuring_bind.destructuring_bind_must_consp(var15, var8, (SubLObject)$ic1$);
            var14_15 = var15.first();
            var15 = var15.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var15, var8, (SubLObject)$ic1$);
            if (NIL == conses_high.member(var14_15, (SubLObject)$ic2$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var16 = (SubLObject)T;
            }
            if (var14_15 == $ic3$) {
                var14 = var15.first();
            }
            var15 = var15.rest();
        }
        if (NIL != var16 && NIL == var14) {
            cdestructuring_bind.cdestructuring_bind_error(var8, (SubLObject)$ic1$);
        }
        final SubLObject var17 = cdestructuring_bind.property_list_member((SubLObject)$ic4$, var9);
        final SubLObject var18 = (SubLObject)((NIL != var17) ? conses_high.cadr(var17) : NIL);
        final SubLObject var19;
        var9 = (var19 = var10);
        if (NIL != var18) {
            final SubLObject var20 = (SubLObject)$ic5$;
            final SubLObject var21 = (SubLObject)$ic6$;
            final SubLObject var22 = (SubLObject)$ic7$;
            final SubLObject var23 = (SubLObject)$ic8$;
            final SubLObject var24 = (SubLObject)$ic9$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic10$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var20, var18), reader.bq_cons(var21, (SubLObject)$ic11$), (SubLObject)ConsesLow.list((SubLObject)$ic12$, (SubLObject)ConsesLow.list((SubLObject)$ic13$, var21, (SubLObject)ConsesLow.list((SubLObject)$ic14$, var20)))), (SubLObject)ConsesLow.list((SubLObject)$ic15$, (SubLObject)ConsesLow.listS((SubLObject)$ic16$, var20, (SubLObject)$ic17$), (SubLObject)ConsesLow.list((SubLObject)$ic10$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var22, var13), reader.bq_cons(var23, (SubLObject)$ic18$), (SubLObject)ConsesLow.list(var24, (SubLObject)ConsesLow.list((SubLObject)$ic19$, var22))), (SubLObject)ConsesLow.list((SubLObject)$ic20$, (SubLObject)ConsesLow.list(var11, var12, var22), (SubLObject)ConsesLow.listS((SubLObject)$ic10$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic12$, var21)), ConsesLow.append(var19, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic21$, var23, (SubLObject)ConsesLow.list((SubLObject)$ic22$, var23)), (SubLObject)ConsesLow.list((SubLObject)$ic23$, var23, var24)))));
        }
        return (SubLObject)ConsesLow.list((SubLObject)$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic25$, var13), (SubLObject)ConsesLow.listS((SubLObject)$ic26$, (SubLObject)ConsesLow.list(var11, var12, var13), ConsesLow.append(var19, (SubLObject)NIL))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic27$, var13), (SubLObject)ConsesLow.listS((SubLObject)$ic28$, (SubLObject)ConsesLow.list(var11, var12, var13), ConsesLow.append(var19, (SubLObject)NIL))), (SubLObject)ConsesLow.list((SubLObject)T, (SubLObject)ConsesLow.list((SubLObject)$ic29$, (SubLObject)$ic0$, var13)));
    }
    
    public static SubLObject f7018(final SubLObject var2, final SubLObject var3, SubLObject var24, SubLObject var25) {
        if (var24 == UNPROVIDED) {
            var24 = (SubLObject)ONE_INTEGER;
        }
        if (var25 == UNPROVIDED) {
            var25 = var24;
        }
        if (var3.isHashtable()) {
            return module0030.f1615(var2, var3, var24, var25);
        }
        if (NIL != module0093.f6457(var3)) {
            return module0093.f6626(var2, var3, var24, var25);
        }
        Errors.error((SubLObject)$ic0$, var3);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7019() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0097", "f7010", "S#8819", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0097", "f7011", "S#8820", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0097", "f7012", "S#8821", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0097", "f7013", "S#8822", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0097", "f7014", "S#8823", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0097", "f7015", "S#8824", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0097", "f7016", "S#8825", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0097", "f7017", "S#8826");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0097", "f7018", "S#8827", 2, 2, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7020() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7021() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f7019();
    }
    
    public void initializeVariables() {
        f7020();
    }
    
    public void runTopLevelForms() {
        f7021();
    }
    
    static {
        me = (SubLFile)new module0097();
        $ic0$ = makeString("~S is not a GENERIC-TABLE-P.");
        $ic1$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"), (SubLObject)makeSymbol("S#705", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#130", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic2$ = ConsesLow.list((SubLObject)makeKeyword("PROGRESS-MESSAGE"));
        $ic3$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic4$ = makeKeyword("PROGRESS-MESSAGE");
        $ic5$ = makeUninternedSymbol("US#7028EF8");
        $ic6$ = makeUninternedSymbol("US#2D3BFD5");
        $ic7$ = makeUninternedSymbol("US#7C5C08F");
        $ic8$ = makeUninternedSymbol("US#3F92607");
        $ic9$ = makeUninternedSymbol("US#1FD7008");
        $ic10$ = makeSymbol("CLET");
        $ic11$ = ConsesLow.list((SubLObject)makeSymbol("*SILENT-PROGRESS?*"));
        $ic12$ = makeSymbol("*SILENT-PROGRESS?*");
        $ic13$ = makeSymbol("COR");
        $ic14$ = makeSymbol("NULL");
        $ic15$ = makeSymbol("NOTING-PERCENT-PROGRESS");
        $ic16$ = makeSymbol("FIRST-OF");
        $ic17$ = ConsesLow.list((SubLObject)makeString(""));
        $ic18$ = ConsesLow.list((SubLObject)ZERO_INTEGER);
        $ic19$ = makeSymbol("S#8825", "CYC");
        $ic20$ = makeSymbol("S#8826", "CYC");
        $ic21$ = makeSymbol("CSETQ");
        $ic22$ = makeSymbol("1+");
        $ic23$ = makeSymbol("NOTE-PERCENT-PROGRESS");
        $ic24$ = makeSymbol("PCOND");
        $ic25$ = makeSymbol("HASH-TABLE-P");
        $ic26$ = makeSymbol("DO-HASH-TABLE");
        $ic27$ = makeSymbol("S#8139", "CYC");
        $ic28$ = makeSymbol("S#8307", "CYC");
        $ic29$ = makeSymbol("ERROR");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 70 ms
	
	Decompiled with Procyon 0.5.32.
*/