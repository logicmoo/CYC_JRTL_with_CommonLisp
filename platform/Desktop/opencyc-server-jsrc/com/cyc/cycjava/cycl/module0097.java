package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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
        return (SubLObject)SubLObjectFactory.makeBoolean(var1.isHashtable() || module0097.NIL != module0093.f6457(var1));
    }
    
    public static SubLObject f7011(final SubLObject var2, final SubLObject var3, final SubLObject var4) {
        if (var3.isHashtable()) {
            return Hashtables.sethash(var2, var3, var4);
        }
        if (module0097.NIL != module0093.f6457(var3)) {
            return module0093.f6618(var2, var3, var4);
        }
        Errors.error((SubLObject)module0097.$ic0$, var3);
        return (SubLObject)module0097.NIL;
    }
    
    public static SubLObject f7012(final SubLObject var2, final SubLObject var3, SubLObject var5) {
        if (var5 == module0097.UNPROVIDED) {
            var5 = (SubLObject)module0097.NIL;
        }
        if (var3.isHashtable()) {
            return Hashtables.gethash(var2, var3, var5);
        }
        if (module0097.NIL != module0093.f6457(var3)) {
            return module0093.f6621(var2, var3, var5);
        }
        Errors.error((SubLObject)module0097.$ic0$, var3);
        return (SubLObject)module0097.NIL;
    }
    
    public static SubLObject f7013(final SubLObject var2, final SubLObject var3) {
        if (var3.isHashtable()) {
            return Hashtables.remhash(var2, var3);
        }
        if (module0097.NIL != module0093.f6457(var3)) {
            return module0093.f6624(var2, var3);
        }
        Errors.error((SubLObject)module0097.$ic0$, var3);
        return (SubLObject)module0097.NIL;
    }
    
    public static SubLObject f7014(final SubLObject var3) {
        if (var3.isHashtable()) {
            return module0030.f1625(var3);
        }
        if (module0097.NIL != module0093.f6457(var3)) {
            return module0093.f6638(var3);
        }
        Errors.error((SubLObject)module0097.$ic0$, var3);
        return (SubLObject)module0097.NIL;
    }
    
    public static SubLObject f7015(final SubLObject var3) {
        if (var3.isHashtable()) {
            return Hashtables.hash_table_size(var3);
        }
        if (module0097.NIL != module0093.f6457(var3)) {
            return module0093.f6617(var3);
        }
        Errors.error((SubLObject)module0097.$ic0$, var3);
        return (SubLObject)module0097.NIL;
    }
    
    public static SubLObject f7016(final SubLObject var3) {
        if (var3.isHashtable()) {
            return Hashtables.hash_table_count(var3);
        }
        if (module0097.NIL != module0093.f6457(var3)) {
            return module0093.f6612(var3);
        }
        Errors.error((SubLObject)module0097.$ic0$, var3);
        return (SubLObject)module0097.NIL;
    }
    
    public static SubLObject f7017(final SubLObject var6, final SubLObject var7) {
        SubLObject var9;
        final SubLObject var8 = var9 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)module0097.$ic1$);
        final SubLObject var10 = var9.rest();
        var9 = var9.first();
        SubLObject var11 = (SubLObject)module0097.NIL;
        SubLObject var12 = (SubLObject)module0097.NIL;
        SubLObject var13 = (SubLObject)module0097.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)module0097.$ic1$);
        var11 = var9.first();
        var9 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)module0097.$ic1$);
        var12 = var9.first();
        var9 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)module0097.$ic1$);
        var13 = var9.first();
        var9 = var9.rest();
        SubLObject var14 = (SubLObject)module0097.NIL;
        SubLObject var15 = var9;
        SubLObject var16 = (SubLObject)module0097.NIL;
        SubLObject var14_15 = (SubLObject)module0097.NIL;
        while (module0097.NIL != var15) {
            cdestructuring_bind.destructuring_bind_must_consp(var15, var8, (SubLObject)module0097.$ic1$);
            var14_15 = var15.first();
            var15 = var15.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var15, var8, (SubLObject)module0097.$ic1$);
            if (module0097.NIL == conses_high.member(var14_15, (SubLObject)module0097.$ic2$, (SubLObject)module0097.UNPROVIDED, (SubLObject)module0097.UNPROVIDED)) {
                var16 = (SubLObject)module0097.T;
            }
            if (var14_15 == module0097.$ic3$) {
                var14 = var15.first();
            }
            var15 = var15.rest();
        }
        if (module0097.NIL != var16 && module0097.NIL == var14) {
            cdestructuring_bind.cdestructuring_bind_error(var8, (SubLObject)module0097.$ic1$);
        }
        final SubLObject var17 = cdestructuring_bind.property_list_member((SubLObject)module0097.$ic4$, var9);
        final SubLObject var18 = (SubLObject)((module0097.NIL != var17) ? conses_high.cadr(var17) : module0097.NIL);
        final SubLObject var19;
        var9 = (var19 = var10);
        if (module0097.NIL != var18) {
            final SubLObject var20 = (SubLObject)module0097.$ic5$;
            final SubLObject var21 = (SubLObject)module0097.$ic6$;
            final SubLObject var22 = (SubLObject)module0097.$ic7$;
            final SubLObject var23 = (SubLObject)module0097.$ic8$;
            final SubLObject var24 = (SubLObject)module0097.$ic9$;
            return (SubLObject)ConsesLow.list((SubLObject)module0097.$ic10$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var20, var18), reader.bq_cons(var21, (SubLObject)module0097.$ic11$), (SubLObject)ConsesLow.list((SubLObject)module0097.$ic12$, (SubLObject)ConsesLow.list((SubLObject)module0097.$ic13$, var21, (SubLObject)ConsesLow.list((SubLObject)module0097.$ic14$, var20)))), (SubLObject)ConsesLow.list((SubLObject)module0097.$ic15$, (SubLObject)ConsesLow.listS((SubLObject)module0097.$ic16$, var20, (SubLObject)module0097.$ic17$), (SubLObject)ConsesLow.list((SubLObject)module0097.$ic10$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var22, var13), reader.bq_cons(var23, (SubLObject)module0097.$ic18$), (SubLObject)ConsesLow.list(var24, (SubLObject)ConsesLow.list((SubLObject)module0097.$ic19$, var22))), (SubLObject)ConsesLow.list((SubLObject)module0097.$ic20$, (SubLObject)ConsesLow.list(var11, var12, var22), (SubLObject)ConsesLow.listS((SubLObject)module0097.$ic10$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0097.$ic12$, var21)), ConsesLow.append(var19, (SubLObject)module0097.NIL)), (SubLObject)ConsesLow.list((SubLObject)module0097.$ic21$, var23, (SubLObject)ConsesLow.list((SubLObject)module0097.$ic22$, var23)), (SubLObject)ConsesLow.list((SubLObject)module0097.$ic23$, var23, var24)))));
        }
        return (SubLObject)ConsesLow.list((SubLObject)module0097.$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0097.$ic25$, var13), (SubLObject)ConsesLow.listS((SubLObject)module0097.$ic26$, (SubLObject)ConsesLow.list(var11, var12, var13), ConsesLow.append(var19, (SubLObject)module0097.NIL))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0097.$ic27$, var13), (SubLObject)ConsesLow.listS((SubLObject)module0097.$ic28$, (SubLObject)ConsesLow.list(var11, var12, var13), ConsesLow.append(var19, (SubLObject)module0097.NIL))), (SubLObject)ConsesLow.list((SubLObject)module0097.T, (SubLObject)ConsesLow.list((SubLObject)module0097.$ic29$, (SubLObject)module0097.$ic0$, var13)));
    }
    
    public static SubLObject f7018(final SubLObject var2, final SubLObject var3, SubLObject var24, SubLObject var25) {
        if (var24 == module0097.UNPROVIDED) {
            var24 = (SubLObject)module0097.ONE_INTEGER;
        }
        if (var25 == module0097.UNPROVIDED) {
            var25 = var24;
        }
        if (var3.isHashtable()) {
            return module0030.f1615(var2, var3, var24, var25);
        }
        if (module0097.NIL != module0093.f6457(var3)) {
            return module0093.f6626(var2, var3, var24, var25);
        }
        Errors.error((SubLObject)module0097.$ic0$, var3);
        return (SubLObject)module0097.NIL;
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
        return (SubLObject)module0097.NIL;
    }
    
    public static SubLObject f7020() {
        return (SubLObject)module0097.NIL;
    }
    
    public static SubLObject f7021() {
        return (SubLObject)module0097.NIL;
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
        $ic0$ = SubLObjectFactory.makeString("~S is not a GENERIC-TABLE-P.");
        $ic1$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#705", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#130", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE"));
        $ic3$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic4$ = SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE");
        $ic5$ = SubLObjectFactory.makeUninternedSymbol("US#7028EF8");
        $ic6$ = SubLObjectFactory.makeUninternedSymbol("US#2D3BFD5");
        $ic7$ = SubLObjectFactory.makeUninternedSymbol("US#7C5C08F");
        $ic8$ = SubLObjectFactory.makeUninternedSymbol("US#3F92607");
        $ic9$ = SubLObjectFactory.makeUninternedSymbol("US#1FD7008");
        $ic10$ = SubLObjectFactory.makeSymbol("CLET");
        $ic11$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SILENT-PROGRESS?*"));
        $ic12$ = SubLObjectFactory.makeSymbol("*SILENT-PROGRESS?*");
        $ic13$ = SubLObjectFactory.makeSymbol("COR");
        $ic14$ = SubLObjectFactory.makeSymbol("NULL");
        $ic15$ = SubLObjectFactory.makeSymbol("NOTING-PERCENT-PROGRESS");
        $ic16$ = SubLObjectFactory.makeSymbol("FIRST-OF");
        $ic17$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString(""));
        $ic18$ = ConsesLow.list((SubLObject)module0097.ZERO_INTEGER);
        $ic19$ = SubLObjectFactory.makeSymbol("S#8825", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#8826", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("CSETQ");
        $ic22$ = SubLObjectFactory.makeSymbol("1+");
        $ic23$ = SubLObjectFactory.makeSymbol("NOTE-PERCENT-PROGRESS");
        $ic24$ = SubLObjectFactory.makeSymbol("PCOND");
        $ic25$ = SubLObjectFactory.makeSymbol("HASH-TABLE-P");
        $ic26$ = SubLObjectFactory.makeSymbol("DO-HASH-TABLE");
        $ic27$ = SubLObjectFactory.makeSymbol("S#8139", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("S#8307", "CYC");
        $ic29$ = SubLObjectFactory.makeSymbol("ERROR");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0097.class
	Total time: 70 ms
	
	Decompiled with Procyon 0.5.32.
*/