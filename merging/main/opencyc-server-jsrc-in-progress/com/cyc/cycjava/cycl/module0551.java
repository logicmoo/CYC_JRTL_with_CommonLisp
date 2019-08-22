package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0551 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0551";
    public static final String myFingerPrint = "4f2e68e8ce89f6ffbf72c7debbe300c02f18331051c65abe750492046e3af350";
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    private static final SubLList $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLList $ic21$;
    private static final SubLList $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLList $ic29$;
    private static final SubLList $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    
    public static SubLObject f33979(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic1$);
        var5 = var4.first();
        var4 = var4.rest();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = var4;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9_10 = (SubLObject)NIL;
        while (NIL != var7) {
            cdestructuring_bind.destructuring_bind_must_consp(var7, var3, (SubLObject)$ic1$);
            var9_10 = var7.first();
            var7 = var7.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var7, var3, (SubLObject)$ic1$);
            if (NIL == conses_high.member(var9_10, (SubLObject)$ic2$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var8 = (SubLObject)T;
            }
            if (var9_10 == $ic3$) {
                var6 = var7.first();
            }
            var7 = var7.rest();
        }
        if (NIL != var8 && NIL == var6) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic1$);
        }
        final SubLObject var9 = cdestructuring_bind.property_list_member((SubLObject)$ic4$, var4);
        final SubLObject var10 = (SubLObject)((NIL != var9) ? conses_high.cadr(var9) : $ic5$);
        return (SubLObject)ConsesLow.list((SubLObject)$ic6$, var5, var10);
    }
    
    public static SubLObject f33980(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic1$);
        var5 = var4.first();
        var4 = var4.rest();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = var4;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var18_19 = (SubLObject)NIL;
        while (NIL != var7) {
            cdestructuring_bind.destructuring_bind_must_consp(var7, var3, (SubLObject)$ic1$);
            var18_19 = var7.first();
            var7 = var7.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var7, var3, (SubLObject)$ic1$);
            if (NIL == conses_high.member(var18_19, (SubLObject)$ic2$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var8 = (SubLObject)T;
            }
            if (var18_19 == $ic3$) {
                var6 = var7.first();
            }
            var7 = var7.rest();
        }
        if (NIL != var8 && NIL == var6) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic1$);
        }
        final SubLObject var9 = cdestructuring_bind.property_list_member((SubLObject)$ic4$, var4);
        final SubLObject var10 = (SubLObject)((NIL != var9) ? conses_high.cadr(var9) : $ic5$);
        return (SubLObject)ConsesLow.list((SubLObject)$ic8$, var5, var10);
    }
    
    public static SubLObject f33981(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic10$);
        var5 = var4.first();
        var4 = var4.rest();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = var4;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var27_28 = (SubLObject)NIL;
        while (NIL != var7) {
            cdestructuring_bind.destructuring_bind_must_consp(var7, var3, (SubLObject)$ic10$);
            var27_28 = var7.first();
            var7 = var7.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var7, var3, (SubLObject)$ic10$);
            if (NIL == conses_high.member(var27_28, (SubLObject)$ic2$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var8 = (SubLObject)T;
            }
            if (var27_28 == $ic3$) {
                var6 = var7.first();
            }
            var7 = var7.rest();
        }
        if (NIL != var8 && NIL == var6) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic10$);
        }
        final SubLObject var9 = cdestructuring_bind.property_list_member((SubLObject)$ic4$, var4);
        final SubLObject var10 = (SubLObject)((NIL != var9) ? conses_high.cadr(var9) : $ic5$);
        return (SubLObject)ConsesLow.list((SubLObject)$ic11$, var5, var10);
    }
    
    public static SubLObject f33982(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic10$);
        var5 = var4.first();
        var4 = var4.rest();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = var4;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var35_36 = (SubLObject)NIL;
        while (NIL != var7) {
            cdestructuring_bind.destructuring_bind_must_consp(var7, var3, (SubLObject)$ic10$);
            var35_36 = var7.first();
            var7 = var7.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var7, var3, (SubLObject)$ic10$);
            if (NIL == conses_high.member(var35_36, (SubLObject)$ic2$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var8 = (SubLObject)T;
            }
            if (var35_36 == $ic3$) {
                var6 = var7.first();
            }
            var7 = var7.rest();
        }
        if (NIL != var8 && NIL == var6) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic10$);
        }
        final SubLObject var9 = cdestructuring_bind.property_list_member((SubLObject)$ic4$, var4);
        final SubLObject var10 = (SubLObject)((NIL != var9) ? conses_high.cadr(var9) : $ic5$);
        return (SubLObject)ConsesLow.list((SubLObject)$ic13$, var5, var10);
    }
    
    public static SubLObject f33983(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic15$);
        var5 = var4.first();
        var4 = var4.rest();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = var4;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var43_44 = (SubLObject)NIL;
        while (NIL != var7) {
            cdestructuring_bind.destructuring_bind_must_consp(var7, var3, (SubLObject)$ic15$);
            var43_44 = var7.first();
            var7 = var7.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var7, var3, (SubLObject)$ic15$);
            if (NIL == conses_high.member(var43_44, (SubLObject)$ic16$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var8 = (SubLObject)T;
            }
            if (var43_44 == $ic3$) {
                var6 = var7.first();
            }
            var7 = var7.rest();
        }
        if (NIL != var8 && NIL == var6) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic15$);
        }
        final SubLObject var9 = cdestructuring_bind.property_list_member((SubLObject)$ic17$, var4);
        final SubLObject var10 = (SubLObject)((NIL != var9) ? conses_high.cadr(var9) : NIL);
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic18$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic4$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : $ic5$);
        return (SubLObject)ConsesLow.list((SubLObject)$ic19$, var5, var10, var12, var14);
    }
    
    public static SubLObject f33984(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic21$);
        var5 = var4.first();
        var4 = var4.rest();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = var4;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var56_57 = (SubLObject)NIL;
        while (NIL != var7) {
            cdestructuring_bind.destructuring_bind_must_consp(var7, var3, (SubLObject)$ic21$);
            var56_57 = var7.first();
            var7 = var7.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var7, var3, (SubLObject)$ic21$);
            if (NIL == conses_high.member(var56_57, (SubLObject)$ic22$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var8 = (SubLObject)T;
            }
            if (var56_57 == $ic3$) {
                var6 = var7.first();
            }
            var7 = var7.rest();
        }
        if (NIL != var8 && NIL == var6) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic21$);
        }
        final SubLObject var9 = cdestructuring_bind.property_list_member((SubLObject)$ic23$, var4);
        final SubLObject var10 = (SubLObject)((NIL != var9) ? conses_high.cadr(var9) : NIL);
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic24$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : ZERO_INTEGER);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic25$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)$ic26$, var4);
        final SubLObject var16 = (SubLObject)((NIL != var15) ? conses_high.cadr(var15) : NIL);
        return (SubLObject)ConsesLow.list((SubLObject)$ic27$, var5, var10, var12, var14, var16);
    }
    
    public static SubLObject f33985(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic29$);
        var5 = var4.first();
        var4 = var4.rest();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = var4;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var71_72 = (SubLObject)NIL;
        while (NIL != var7) {
            cdestructuring_bind.destructuring_bind_must_consp(var7, var3, (SubLObject)$ic29$);
            var71_72 = var7.first();
            var7 = var7.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var7, var3, (SubLObject)$ic29$);
            if (NIL == conses_high.member(var71_72, (SubLObject)$ic30$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var8 = (SubLObject)T;
            }
            if (var71_72 == $ic3$) {
                var6 = var7.first();
            }
            var7 = var7.rest();
        }
        if (NIL != var8 && NIL == var6) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic29$);
        }
        final SubLObject var9 = cdestructuring_bind.property_list_member((SubLObject)$ic31$, var4);
        final SubLObject var10 = (SubLObject)((NIL != var9) ? conses_high.cadr(var9) : $ic32$);
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic23$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : T);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic24$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : ZERO_INTEGER);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)$ic33$, var4);
        final SubLObject var16 = (SubLObject)((NIL != var15) ? conses_high.cadr(var15) : T);
        final SubLObject var17 = cdestructuring_bind.property_list_member((SubLObject)$ic26$, var4);
        final SubLObject var18 = (SubLObject)((NIL != var17) ? conses_high.cadr(var17) : NIL);
        return (SubLObject)ConsesLow.list((SubLObject)$ic34$, var5, (SubLObject)ConsesLow.list((SubLObject)$ic35$, var10), var12, var14, var16, var18);
    }
    
    public static SubLObject f33986() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0551", "f33979", "CYCL-TERM-TO-NL-STRING");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0551", "f33980", "CYCL-TERM-TO-NL");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0551", "f33981", "CYCL-TERMS-TO-NL");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0551", "f33982", "CYCL-TERMS-TO-NL-STRINGS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0551", "f33983", "CYCL-TERM-TO-SEARCH-QUERY");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0551", "f33984", "PPH-OUTPUT-MAP-TO-TEXT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0551", "f33985", "PPH-OUTPUT-MAP-TO-HTML");
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33987() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33988() {
        module0002.f38((SubLObject)$ic0$);
        module0002.f38((SubLObject)$ic7$);
        module0002.f38((SubLObject)$ic9$);
        module0002.f38((SubLObject)$ic12$);
        module0002.f38((SubLObject)$ic14$);
        module0002.f38((SubLObject)$ic20$);
        module0002.f38((SubLObject)$ic28$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f33986();
    }
    
    public void initializeVariables() {
        f33987();
    }
    
    public void runTopLevelForms() {
        f33988();
    }
    
    static {
        me = (SubLFile)new module0551();
        $ic0$ = makeSymbol("CYCL-TERM-TO-NL-STRING");
        $ic1$ = ConsesLow.list((SubLObject)makeSymbol("S#37358", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#37359", "CYC"), (SubLObject)makeKeyword("DEFAULT")));
        $ic2$ = ConsesLow.list((SubLObject)makeKeyword("PPH-PARAMS"));
        $ic3$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic4$ = makeKeyword("PPH-PARAMS");
        $ic5$ = makeKeyword("DEFAULT");
        $ic6$ = makeSymbol("S#37360", "CYC");
        $ic7$ = makeSymbol("CYCL-TERM-TO-NL");
        $ic8$ = makeSymbol("S#37361", "CYC");
        $ic9$ = makeSymbol("CYCL-TERMS-TO-NL");
        $ic10$ = ConsesLow.list((SubLObject)makeSymbol("S#37362", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#37359", "CYC"), (SubLObject)makeKeyword("DEFAULT")));
        $ic11$ = makeSymbol("S#37363", "CYC");
        $ic12$ = makeSymbol("CYCL-TERMS-TO-NL-STRINGS");
        $ic13$ = makeSymbol("S#37364", "CYC");
        $ic14$ = makeSymbol("CYCL-TERM-TO-SEARCH-QUERY");
        $ic15$ = ConsesLow.list((SubLObject)makeSymbol("S#37358", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#37365", "CYC"), (SubLObject)makeSymbol("S#37366", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#37359", "CYC"), (SubLObject)makeKeyword("DEFAULT")));
        $ic16$ = ConsesLow.list((SubLObject)makeKeyword("ENGINE"), (SubLObject)makeKeyword("MAX-WORDS"), (SubLObject)makeKeyword("PPH-PARAMS"));
        $ic17$ = makeKeyword("ENGINE");
        $ic18$ = makeKeyword("MAX-WORDS");
        $ic19$ = makeSymbol("S#37367", "CYC");
        $ic20$ = makeSymbol("PPH-OUTPUT-MAP-TO-TEXT");
        $ic21$ = ConsesLow.list((SubLObject)makeSymbol("MAP"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#37368", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#37369", "CYC"), (SubLObject)ZERO_INTEGER), (SubLObject)makeSymbol("S#37370", "CYC"), (SubLObject)makeSymbol("S#37371", "CYC"));
        $ic22$ = ConsesLow.list((SubLObject)makeKeyword("USE-BULLETED-LISTS?"), (SubLObject)makeKeyword("BULLETED-LIST-INDENT-LEVEL"), (SubLObject)makeKeyword("ALLOW-UTF8?"), (SubLObject)makeKeyword("USE-BLANKS-FOR-VARS?"));
        $ic23$ = makeKeyword("USE-BULLETED-LISTS?");
        $ic24$ = makeKeyword("BULLETED-LIST-INDENT-LEVEL");
        $ic25$ = makeKeyword("ALLOW-UTF8?");
        $ic26$ = makeKeyword("USE-BLANKS-FOR-VARS?");
        $ic27$ = makeSymbol("S#37372", "CYC");
        $ic28$ = makeSymbol("PPH-OUTPUT-MAP-TO-HTML");
        $ic29$ = ConsesLow.list((SubLObject)makeSymbol("MAP"), (SubLObject)makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#37373", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#37374", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#37368", "CYC"), (SubLObject)T), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#37369", "CYC"), (SubLObject)ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#37375", "CYC"), (SubLObject)T), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#37371", "CYC"), (SubLObject)NIL));
        $ic30$ = ConsesLow.list((SubLObject)makeKeyword("TAG-FUNCTION"), (SubLObject)makeKeyword("USE-BULLETED-LISTS?"), (SubLObject)makeKeyword("BULLETED-LIST-INDENT-LEVEL"), (SubLObject)makeKeyword("LINK-ARG0?"), (SubLObject)makeKeyword("USE-BLANKS-FOR-VARS?"));
        $ic31$ = makeKeyword("TAG-FUNCTION");
        $ic32$ = makeSymbol("S#37374", "CYC");
        $ic33$ = makeKeyword("LINK-ARG0?");
        $ic34$ = makeSymbol("S#37376", "CYC");
        $ic35$ = makeSymbol("QUOTE");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 83 ms
	
	Decompiled with Procyon 0.5.32.
*/