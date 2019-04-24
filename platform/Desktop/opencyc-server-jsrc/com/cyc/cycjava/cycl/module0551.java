package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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
        SubLObject var5 = (SubLObject)module0551.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0551.$ic1$);
        var5 = var4.first();
        var4 = var4.rest();
        SubLObject var6 = (SubLObject)module0551.NIL;
        SubLObject var7 = var4;
        SubLObject var8 = (SubLObject)module0551.NIL;
        SubLObject var9_10 = (SubLObject)module0551.NIL;
        while (module0551.NIL != var7) {
            cdestructuring_bind.destructuring_bind_must_consp(var7, var3, (SubLObject)module0551.$ic1$);
            var9_10 = var7.first();
            var7 = var7.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var7, var3, (SubLObject)module0551.$ic1$);
            if (module0551.NIL == conses_high.member(var9_10, (SubLObject)module0551.$ic2$, (SubLObject)module0551.UNPROVIDED, (SubLObject)module0551.UNPROVIDED)) {
                var8 = (SubLObject)module0551.T;
            }
            if (var9_10 == module0551.$ic3$) {
                var6 = var7.first();
            }
            var7 = var7.rest();
        }
        if (module0551.NIL != var8 && module0551.NIL == var6) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0551.$ic1$);
        }
        final SubLObject var9 = cdestructuring_bind.property_list_member((SubLObject)module0551.$ic4$, var4);
        final SubLObject var10 = (SubLObject)((module0551.NIL != var9) ? conses_high.cadr(var9) : module0551.$ic5$);
        return (SubLObject)ConsesLow.list((SubLObject)module0551.$ic6$, var5, var10);
    }
    
    public static SubLObject f33980(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0551.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0551.$ic1$);
        var5 = var4.first();
        var4 = var4.rest();
        SubLObject var6 = (SubLObject)module0551.NIL;
        SubLObject var7 = var4;
        SubLObject var8 = (SubLObject)module0551.NIL;
        SubLObject var18_19 = (SubLObject)module0551.NIL;
        while (module0551.NIL != var7) {
            cdestructuring_bind.destructuring_bind_must_consp(var7, var3, (SubLObject)module0551.$ic1$);
            var18_19 = var7.first();
            var7 = var7.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var7, var3, (SubLObject)module0551.$ic1$);
            if (module0551.NIL == conses_high.member(var18_19, (SubLObject)module0551.$ic2$, (SubLObject)module0551.UNPROVIDED, (SubLObject)module0551.UNPROVIDED)) {
                var8 = (SubLObject)module0551.T;
            }
            if (var18_19 == module0551.$ic3$) {
                var6 = var7.first();
            }
            var7 = var7.rest();
        }
        if (module0551.NIL != var8 && module0551.NIL == var6) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0551.$ic1$);
        }
        final SubLObject var9 = cdestructuring_bind.property_list_member((SubLObject)module0551.$ic4$, var4);
        final SubLObject var10 = (SubLObject)((module0551.NIL != var9) ? conses_high.cadr(var9) : module0551.$ic5$);
        return (SubLObject)ConsesLow.list((SubLObject)module0551.$ic8$, var5, var10);
    }
    
    public static SubLObject f33981(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0551.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0551.$ic10$);
        var5 = var4.first();
        var4 = var4.rest();
        SubLObject var6 = (SubLObject)module0551.NIL;
        SubLObject var7 = var4;
        SubLObject var8 = (SubLObject)module0551.NIL;
        SubLObject var27_28 = (SubLObject)module0551.NIL;
        while (module0551.NIL != var7) {
            cdestructuring_bind.destructuring_bind_must_consp(var7, var3, (SubLObject)module0551.$ic10$);
            var27_28 = var7.first();
            var7 = var7.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var7, var3, (SubLObject)module0551.$ic10$);
            if (module0551.NIL == conses_high.member(var27_28, (SubLObject)module0551.$ic2$, (SubLObject)module0551.UNPROVIDED, (SubLObject)module0551.UNPROVIDED)) {
                var8 = (SubLObject)module0551.T;
            }
            if (var27_28 == module0551.$ic3$) {
                var6 = var7.first();
            }
            var7 = var7.rest();
        }
        if (module0551.NIL != var8 && module0551.NIL == var6) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0551.$ic10$);
        }
        final SubLObject var9 = cdestructuring_bind.property_list_member((SubLObject)module0551.$ic4$, var4);
        final SubLObject var10 = (SubLObject)((module0551.NIL != var9) ? conses_high.cadr(var9) : module0551.$ic5$);
        return (SubLObject)ConsesLow.list((SubLObject)module0551.$ic11$, var5, var10);
    }
    
    public static SubLObject f33982(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0551.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0551.$ic10$);
        var5 = var4.first();
        var4 = var4.rest();
        SubLObject var6 = (SubLObject)module0551.NIL;
        SubLObject var7 = var4;
        SubLObject var8 = (SubLObject)module0551.NIL;
        SubLObject var35_36 = (SubLObject)module0551.NIL;
        while (module0551.NIL != var7) {
            cdestructuring_bind.destructuring_bind_must_consp(var7, var3, (SubLObject)module0551.$ic10$);
            var35_36 = var7.first();
            var7 = var7.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var7, var3, (SubLObject)module0551.$ic10$);
            if (module0551.NIL == conses_high.member(var35_36, (SubLObject)module0551.$ic2$, (SubLObject)module0551.UNPROVIDED, (SubLObject)module0551.UNPROVIDED)) {
                var8 = (SubLObject)module0551.T;
            }
            if (var35_36 == module0551.$ic3$) {
                var6 = var7.first();
            }
            var7 = var7.rest();
        }
        if (module0551.NIL != var8 && module0551.NIL == var6) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0551.$ic10$);
        }
        final SubLObject var9 = cdestructuring_bind.property_list_member((SubLObject)module0551.$ic4$, var4);
        final SubLObject var10 = (SubLObject)((module0551.NIL != var9) ? conses_high.cadr(var9) : module0551.$ic5$);
        return (SubLObject)ConsesLow.list((SubLObject)module0551.$ic13$, var5, var10);
    }
    
    public static SubLObject f33983(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0551.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0551.$ic15$);
        var5 = var4.first();
        var4 = var4.rest();
        SubLObject var6 = (SubLObject)module0551.NIL;
        SubLObject var7 = var4;
        SubLObject var8 = (SubLObject)module0551.NIL;
        SubLObject var43_44 = (SubLObject)module0551.NIL;
        while (module0551.NIL != var7) {
            cdestructuring_bind.destructuring_bind_must_consp(var7, var3, (SubLObject)module0551.$ic15$);
            var43_44 = var7.first();
            var7 = var7.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var7, var3, (SubLObject)module0551.$ic15$);
            if (module0551.NIL == conses_high.member(var43_44, (SubLObject)module0551.$ic16$, (SubLObject)module0551.UNPROVIDED, (SubLObject)module0551.UNPROVIDED)) {
                var8 = (SubLObject)module0551.T;
            }
            if (var43_44 == module0551.$ic3$) {
                var6 = var7.first();
            }
            var7 = var7.rest();
        }
        if (module0551.NIL != var8 && module0551.NIL == var6) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0551.$ic15$);
        }
        final SubLObject var9 = cdestructuring_bind.property_list_member((SubLObject)module0551.$ic17$, var4);
        final SubLObject var10 = (SubLObject)((module0551.NIL != var9) ? conses_high.cadr(var9) : module0551.NIL);
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0551.$ic18$, var4);
        final SubLObject var12 = (SubLObject)((module0551.NIL != var11) ? conses_high.cadr(var11) : module0551.NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)module0551.$ic4$, var4);
        final SubLObject var14 = (SubLObject)((module0551.NIL != var13) ? conses_high.cadr(var13) : module0551.$ic5$);
        return (SubLObject)ConsesLow.list((SubLObject)module0551.$ic19$, var5, var10, var12, var14);
    }
    
    public static SubLObject f33984(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0551.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0551.$ic21$);
        var5 = var4.first();
        var4 = var4.rest();
        SubLObject var6 = (SubLObject)module0551.NIL;
        SubLObject var7 = var4;
        SubLObject var8 = (SubLObject)module0551.NIL;
        SubLObject var56_57 = (SubLObject)module0551.NIL;
        while (module0551.NIL != var7) {
            cdestructuring_bind.destructuring_bind_must_consp(var7, var3, (SubLObject)module0551.$ic21$);
            var56_57 = var7.first();
            var7 = var7.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var7, var3, (SubLObject)module0551.$ic21$);
            if (module0551.NIL == conses_high.member(var56_57, (SubLObject)module0551.$ic22$, (SubLObject)module0551.UNPROVIDED, (SubLObject)module0551.UNPROVIDED)) {
                var8 = (SubLObject)module0551.T;
            }
            if (var56_57 == module0551.$ic3$) {
                var6 = var7.first();
            }
            var7 = var7.rest();
        }
        if (module0551.NIL != var8 && module0551.NIL == var6) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0551.$ic21$);
        }
        final SubLObject var9 = cdestructuring_bind.property_list_member((SubLObject)module0551.$ic23$, var4);
        final SubLObject var10 = (SubLObject)((module0551.NIL != var9) ? conses_high.cadr(var9) : module0551.NIL);
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0551.$ic24$, var4);
        final SubLObject var12 = (SubLObject)((module0551.NIL != var11) ? conses_high.cadr(var11) : module0551.ZERO_INTEGER);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)module0551.$ic25$, var4);
        final SubLObject var14 = (SubLObject)((module0551.NIL != var13) ? conses_high.cadr(var13) : module0551.NIL);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)module0551.$ic26$, var4);
        final SubLObject var16 = (SubLObject)((module0551.NIL != var15) ? conses_high.cadr(var15) : module0551.NIL);
        return (SubLObject)ConsesLow.list((SubLObject)module0551.$ic27$, var5, var10, var12, var14, var16);
    }
    
    public static SubLObject f33985(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0551.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0551.$ic29$);
        var5 = var4.first();
        var4 = var4.rest();
        SubLObject var6 = (SubLObject)module0551.NIL;
        SubLObject var7 = var4;
        SubLObject var8 = (SubLObject)module0551.NIL;
        SubLObject var71_72 = (SubLObject)module0551.NIL;
        while (module0551.NIL != var7) {
            cdestructuring_bind.destructuring_bind_must_consp(var7, var3, (SubLObject)module0551.$ic29$);
            var71_72 = var7.first();
            var7 = var7.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var7, var3, (SubLObject)module0551.$ic29$);
            if (module0551.NIL == conses_high.member(var71_72, (SubLObject)module0551.$ic30$, (SubLObject)module0551.UNPROVIDED, (SubLObject)module0551.UNPROVIDED)) {
                var8 = (SubLObject)module0551.T;
            }
            if (var71_72 == module0551.$ic3$) {
                var6 = var7.first();
            }
            var7 = var7.rest();
        }
        if (module0551.NIL != var8 && module0551.NIL == var6) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0551.$ic29$);
        }
        final SubLObject var9 = cdestructuring_bind.property_list_member((SubLObject)module0551.$ic31$, var4);
        final SubLObject var10 = (SubLObject)((module0551.NIL != var9) ? conses_high.cadr(var9) : module0551.$ic32$);
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0551.$ic23$, var4);
        final SubLObject var12 = (SubLObject)((module0551.NIL != var11) ? conses_high.cadr(var11) : module0551.T);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)module0551.$ic24$, var4);
        final SubLObject var14 = (SubLObject)((module0551.NIL != var13) ? conses_high.cadr(var13) : module0551.ZERO_INTEGER);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)module0551.$ic33$, var4);
        final SubLObject var16 = (SubLObject)((module0551.NIL != var15) ? conses_high.cadr(var15) : module0551.T);
        final SubLObject var17 = cdestructuring_bind.property_list_member((SubLObject)module0551.$ic26$, var4);
        final SubLObject var18 = (SubLObject)((module0551.NIL != var17) ? conses_high.cadr(var17) : module0551.NIL);
        return (SubLObject)ConsesLow.list((SubLObject)module0551.$ic34$, var5, (SubLObject)ConsesLow.list((SubLObject)module0551.$ic35$, var10), var12, var14, var16, var18);
    }
    
    public static SubLObject f33986() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0551", "f33979", "CYCL-TERM-TO-NL-STRING");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0551", "f33980", "CYCL-TERM-TO-NL");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0551", "f33981", "CYCL-TERMS-TO-NL");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0551", "f33982", "CYCL-TERMS-TO-NL-STRINGS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0551", "f33983", "CYCL-TERM-TO-SEARCH-QUERY");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0551", "f33984", "PPH-OUTPUT-MAP-TO-TEXT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0551", "f33985", "PPH-OUTPUT-MAP-TO-HTML");
        return (SubLObject)module0551.NIL;
    }
    
    public static SubLObject f33987() {
        return (SubLObject)module0551.NIL;
    }
    
    public static SubLObject f33988() {
        module0002.f38((SubLObject)module0551.$ic0$);
        module0002.f38((SubLObject)module0551.$ic7$);
        module0002.f38((SubLObject)module0551.$ic9$);
        module0002.f38((SubLObject)module0551.$ic12$);
        module0002.f38((SubLObject)module0551.$ic14$);
        module0002.f38((SubLObject)module0551.$ic20$);
        module0002.f38((SubLObject)module0551.$ic28$);
        return (SubLObject)module0551.NIL;
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
        $ic0$ = SubLObjectFactory.makeSymbol("CYCL-TERM-TO-NL-STRING");
        $ic1$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#37358", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#37359", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT")));
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PPH-PARAMS"));
        $ic3$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic4$ = SubLObjectFactory.makeKeyword("PPH-PARAMS");
        $ic5$ = SubLObjectFactory.makeKeyword("DEFAULT");
        $ic6$ = SubLObjectFactory.makeSymbol("S#37360", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("CYCL-TERM-TO-NL");
        $ic8$ = SubLObjectFactory.makeSymbol("S#37361", "CYC");
        $ic9$ = SubLObjectFactory.makeSymbol("CYCL-TERMS-TO-NL");
        $ic10$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#37362", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#37359", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT")));
        $ic11$ = SubLObjectFactory.makeSymbol("S#37363", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("CYCL-TERMS-TO-NL-STRINGS");
        $ic13$ = SubLObjectFactory.makeSymbol("S#37364", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("CYCL-TERM-TO-SEARCH-QUERY");
        $ic15$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#37358", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#37365", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#37366", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#37359", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT")));
        $ic16$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ENGINE"), (SubLObject)SubLObjectFactory.makeKeyword("MAX-WORDS"), (SubLObject)SubLObjectFactory.makeKeyword("PPH-PARAMS"));
        $ic17$ = SubLObjectFactory.makeKeyword("ENGINE");
        $ic18$ = SubLObjectFactory.makeKeyword("MAX-WORDS");
        $ic19$ = SubLObjectFactory.makeSymbol("S#37367", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("PPH-OUTPUT-MAP-TO-TEXT");
        $ic21$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAP"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#37368", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#37369", "CYC"), (SubLObject)module0551.ZERO_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("S#37370", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#37371", "CYC"));
        $ic22$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("USE-BULLETED-LISTS?"), (SubLObject)SubLObjectFactory.makeKeyword("BULLETED-LIST-INDENT-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("ALLOW-UTF8?"), (SubLObject)SubLObjectFactory.makeKeyword("USE-BLANKS-FOR-VARS?"));
        $ic23$ = SubLObjectFactory.makeKeyword("USE-BULLETED-LISTS?");
        $ic24$ = SubLObjectFactory.makeKeyword("BULLETED-LIST-INDENT-LEVEL");
        $ic25$ = SubLObjectFactory.makeKeyword("ALLOW-UTF8?");
        $ic26$ = SubLObjectFactory.makeKeyword("USE-BLANKS-FOR-VARS?");
        $ic27$ = SubLObjectFactory.makeSymbol("S#37372", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("PPH-OUTPUT-MAP-TO-HTML");
        $ic29$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAP"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#37373", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#37374", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#37368", "CYC"), (SubLObject)module0551.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#37369", "CYC"), (SubLObject)module0551.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#37375", "CYC"), (SubLObject)module0551.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#37371", "CYC"), (SubLObject)module0551.NIL));
        $ic30$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TAG-FUNCTION"), (SubLObject)SubLObjectFactory.makeKeyword("USE-BULLETED-LISTS?"), (SubLObject)SubLObjectFactory.makeKeyword("BULLETED-LIST-INDENT-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("LINK-ARG0?"), (SubLObject)SubLObjectFactory.makeKeyword("USE-BLANKS-FOR-VARS?"));
        $ic31$ = SubLObjectFactory.makeKeyword("TAG-FUNCTION");
        $ic32$ = SubLObjectFactory.makeSymbol("S#37374", "CYC");
        $ic33$ = SubLObjectFactory.makeKeyword("LINK-ARG0?");
        $ic34$ = SubLObjectFactory.makeSymbol("S#37376", "CYC");
        $ic35$ = SubLObjectFactory.makeSymbol("QUOTE");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0551.class
	Total time: 83 ms
	
	Decompiled with Procyon 0.5.32.
*/