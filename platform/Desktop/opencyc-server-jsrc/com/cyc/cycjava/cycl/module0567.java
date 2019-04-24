package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0567 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0567";
    public static final String myFingerPrint = "10f2511acb7138f60e4263b608847564c8d551c327f6df39b190a85b206a170a";
    private static SubLSymbol $g4137$;
    private static SubLSymbol $g4138$;
    private static SubLSymbol $g4139$;
    private static final SubLList $ic0$;
    private static final SubLList $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLList $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLObject $ic6$;
    private static final SubLString $ic7$;
    private static final SubLString $ic8$;
    private static final SubLString $ic9$;
    private static final SubLString $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLInteger $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLString $ic16$;
    private static final SubLString $ic17$;
    private static final SubLString $ic18$;
    private static final SubLString $ic19$;
    private static final SubLString $ic20$;
    
    public static SubLObject f34881(final SubLObject var1, final SubLObject var2) {
        if (module0567.NIL != var2 || module0567.NIL == module0563.f34778() || !module0562.f34634().equal(var1)) {
            module0562.f34696(var1);
            module0563.f34783();
        }
        return var1;
    }
    
    public static SubLObject f34882() {
        return module0434.f30578((SubLObject)module0567.$ic3$, (SubLObject)module0567.$ic4$, (SubLObject)module0567.UNPROVIDED, (SubLObject)module0567.UNPROVIDED);
    }
    
    public static SubLObject f34883(final SubLObject var3) {
        SubLObject var4 = (SubLObject)module0567.NIL;
        SubLObject var5 = var3;
        SubLObject var6 = (SubLObject)module0567.NIL;
        var6 = var5.first();
        while (module0567.NIL != var5) {
            var4 = (SubLObject)ConsesLow.cons(module0259.f16877(var6, (SubLObject)module0567.$ic5$, module0567.$ic6$, (SubLObject)module0567.UNPROVIDED), var4);
            var5 = var5.rest();
            var6 = var5.first();
        }
        return Sequences.reverse(var4);
    }
    
    public static SubLObject f34884(final SubLObject var3) {
        SubLObject var4 = (SubLObject)module0567.NIL;
        SubLObject var5 = var3;
        SubLObject var6 = (SubLObject)module0567.NIL;
        var6 = var5.first();
        while (module0567.NIL != var5) {
            var4 = (SubLObject)ConsesLow.cons(module0259.f16884(var6, (SubLObject)module0567.$ic5$, module0567.$ic6$, (SubLObject)module0567.UNPROVIDED), var4);
            var5 = var5.rest();
            var6 = var5.first();
        }
        return Sequences.reverse(var4);
    }
    
    public static SubLObject f34885(final SubLObject var3) {
        SubLObject var4 = (SubLObject)module0567.NIL;
        SubLObject var5 = var3;
        SubLObject var6 = (SubLObject)module0567.NIL;
        var6 = var5.first();
        while (module0567.NIL != var5) {
            var4 = (SubLObject)ConsesLow.cons(module0256.f16559(var6, (SubLObject)module0567.$ic5$, module0567.$ic6$, (SubLObject)module0567.UNPROVIDED), var4);
            var5 = var5.rest();
            var6 = var5.first();
        }
        return Sequences.reverse(var4);
    }
    
    public static SubLObject f34886(final SubLObject var9, SubLObject var10) {
        if (var10 == module0567.UNPROVIDED) {
            var10 = (SubLObject)module0567.NIL;
        }
        SubLObject var11 = (SubLObject)module0567.NIL;
        SubLObject var12 = var9;
        SubLObject var13 = (SubLObject)module0567.NIL;
        var13 = var12.first();
        while (module0567.NIL != var12) {
            var11 = (SubLObject)ConsesLow.cons(module0563.f34798(var13, var10), var11);
            var12 = var12.rest();
            var13 = var12.first();
        }
        return Sequences.reverse(var11);
    }
    
    public static SubLObject f34887(final SubLObject var13, final SubLObject var14) {
        SubLObject var15 = (SubLObject)module0567.NIL;
        SubLObject var16 = (SubLObject)module0567.NIL;
        SubLObject var17_18 = (SubLObject)module0567.NIL;
        SubLObject var17 = (SubLObject)module0567.NIL;
        SubLObject var20_21 = (SubLObject)module0567.NIL;
        var16 = var13;
        var17_18 = var16.first();
        var17 = var14;
        var20_21 = var17.first();
        while (module0567.NIL != var17 || module0567.NIL != var16) {
            var15 = (SubLObject)ConsesLow.cons(Numbers.subtract(var17_18, var20_21), var15);
            var16 = var16.rest();
            var17_18 = var16.first();
            var17 = var17.rest();
            var20_21 = var17.first();
        }
        return Sequences.reverse(var15);
    }
    
    public static SubLObject f34888(final SubLObject var22, final SubLObject var23, final SubLObject var24) {
        if (module0567.NIL != var24) {
            return PrintLow.format((SubLObject)module0567.T, (SubLObject)module0567.$ic7$, new SubLObject[] { var22, Characters.CHAR_tab, Characters.CHAR_tab, var23, Characters.CHAR_tab, var24, Characters.CHAR_tab });
        }
        return PrintLow.format((SubLObject)module0567.T, (SubLObject)module0567.$ic8$, new SubLObject[] { var22, Characters.CHAR_tab, Characters.CHAR_tab, var23 });
    }
    
    public static SubLObject f34889(final SubLObject var25, final SubLObject var26, SubLObject var27) {
        if (var27 == module0567.UNPROVIDED) {
            var27 = (SubLObject)module0567.NIL;
        }
        if (module0567.NIL != var27) {
            final SubLObject var28 = f34887(var26, var27);
            SubLObject var29 = (SubLObject)module0567.NIL;
            SubLObject var30_31 = (SubLObject)module0567.NIL;
            SubLObject var30 = (SubLObject)module0567.NIL;
            SubLObject var33_34 = (SubLObject)module0567.NIL;
            SubLObject var31 = (SubLObject)module0567.NIL;
            SubLObject var36_37 = (SubLObject)module0567.NIL;
            SubLObject var32 = (SubLObject)module0567.NIL;
            SubLObject var39_40 = (SubLObject)module0567.NIL;
            var29 = var25;
            var30_31 = var29.first();
            var30 = var26;
            var33_34 = var30.first();
            var31 = var27;
            var36_37 = var31.first();
            var32 = var28;
            var39_40 = var32.first();
            while (module0567.NIL != var32 || module0567.NIL != var31 || module0567.NIL != var30 || module0567.NIL != var29) {
                PrintLow.format((SubLObject)module0567.T, (SubLObject)module0567.$ic9$, new SubLObject[] { var30_31, Characters.CHAR_tab, Characters.CHAR_tab, var33_34, Characters.CHAR_tab, var36_37, Characters.CHAR_tab, var39_40 });
                var29 = var29.rest();
                var30_31 = var29.first();
                var30 = var30.rest();
                var33_34 = var30.first();
                var31 = var31.rest();
                var36_37 = var31.first();
                var32 = var32.rest();
                var39_40 = var32.first();
            }
        }
        else {
            SubLObject var33 = (SubLObject)module0567.NIL;
            SubLObject var30_32 = (SubLObject)module0567.NIL;
            SubLObject var34 = (SubLObject)module0567.NIL;
            SubLObject var44_45 = (SubLObject)module0567.NIL;
            var33 = var25;
            var30_32 = var33.first();
            var34 = var26;
            var44_45 = var34.first();
            while (module0567.NIL != var34 || module0567.NIL != var33) {
                PrintLow.format((SubLObject)module0567.T, (SubLObject)module0567.$ic10$, new SubLObject[] { var30_32, Characters.CHAR_tab, Characters.CHAR_tab, var44_45 });
                var33 = var33.rest();
                var30_32 = var33.first();
                var34 = var34.rest();
                var44_45 = var34.first();
            }
        }
        return (SubLObject)module0567.$ic11$;
    }
    
    public static SubLObject f34890(final SubLObject var23, SubLObject var24, SubLObject var2, SubLObject var46, SubLObject var47, SubLObject var48, SubLObject var49) {
        if (var24 == module0567.UNPROVIDED) {
            var24 = (SubLObject)module0567.NIL;
        }
        if (var2 == module0567.UNPROVIDED) {
            var2 = (SubLObject)module0567.NIL;
        }
        if (var46 == module0567.UNPROVIDED) {
            var46 = module0567.$g4137$.getGlobalValue();
        }
        if (var47 == module0567.UNPROVIDED) {
            var47 = module0567.$g4138$.getGlobalValue();
        }
        if (var48 == module0567.UNPROVIDED) {
            var48 = module0567.$g4139$.getGlobalValue();
        }
        if (var49 == module0567.UNPROVIDED) {
            var49 = f34882();
        }
        f34881(var23, var2);
        final SubLObject var50 = f34883(var46);
        final SubLObject var51 = f34884(var47);
        final SubLObject var52 = f34885(var48);
        SubLObject var53 = (SubLObject)module0567.NIL;
        SubLObject var54 = (SubLObject)module0567.NIL;
        SubLObject var55 = (SubLObject)module0567.NIL;
        SubLObject var56 = (SubLObject)module0567.NIL;
        SubLObject var57 = (SubLObject)module0567.NIL;
        SubLObject var58 = (SubLObject)module0567.NIL;
        SubLObject var59 = (SubLObject)module0567.NIL;
        SubLObject var60 = (SubLObject)module0567.NIL;
        SubLObject var61 = var49;
        SubLObject var62 = (SubLObject)module0567.NIL;
        var62 = var61.first();
        while (module0567.NIL != var61) {
            var53 = conses_high.acons(var62, module0563.f34798(var62, (SubLObject)module0567.UNPROVIDED), var53);
            var61 = var61.rest();
            var62 = var61.first();
        }
        var53 = module0035.f2326(var53, Symbols.symbol_function((SubLObject)module0567.$ic12$));
        if (Sequences.length(var53).numG((SubLObject)module0567.$ic13$)) {
            var53 = Sequences.subseq(var53, (SubLObject)module0567.ZERO_INTEGER, (SubLObject)module0567.$ic13$);
        }
        var49 = module0035.f2062(var53);
        var54 = f34886(var49, (SubLObject)module0567.$ic14$);
        var55 = f34886(var49, (SubLObject)module0567.$ic15$);
        if (module0567.NIL != var24) {
            f34881(var24, var2);
            var56 = f34883(var46);
            var57 = f34884(var47);
            var58 = f34885(var48);
            var59 = f34886(var49, (SubLObject)module0567.$ic14$);
            var60 = f34886(var49, (SubLObject)module0567.$ic15$);
        }
        f34888((SubLObject)module0567.$ic16$, var23, var24);
        f34889(var46, var50, var56);
        f34888((SubLObject)module0567.$ic17$, var23, var24);
        f34889(var47, var51, var57);
        f34888((SubLObject)module0567.$ic18$, var23, var24);
        f34889(var48, var52, var58);
        f34888((SubLObject)module0567.$ic19$, var23, var24);
        f34889(var49, var54, var59);
        f34888((SubLObject)module0567.$ic20$, var23, var24);
        f34889(var49, var55, var60);
        return (SubLObject)module0567.$ic11$;
    }
    
    public static SubLObject f34891() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0567", "f34881", "S#38255", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0567", "f34882", "S#38256", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0567", "f34883", "S#38257", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0567", "f34884", "S#38258", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0567", "f34885", "S#38259", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0567", "f34886", "S#38260", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0567", "f34887", "S#38261", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0567", "f34888", "S#38262", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0567", "f34889", "S#38263", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0567", "f34890", "S#38264", 1, 6, false);
        return (SubLObject)module0567.NIL;
    }
    
    public static SubLObject f34892() {
        module0567.$g4137$ = SubLFiles.deflexical("S#38265", (SubLObject)module0567.$ic0$);
        module0567.$g4138$ = SubLFiles.deflexical("S#38266", (SubLObject)module0567.$ic1$);
        module0567.$g4139$ = SubLFiles.deflexical("S#38267", (SubLObject)module0567.$ic2$);
        return (SubLObject)module0567.NIL;
    }
    
    public static SubLObject f34893() {
        return (SubLObject)module0567.NIL;
    }
    
    public void declareFunctions() {
        f34891();
    }
    
    public void initializeVariables() {
        f34892();
    }
    
    public void runTopLevelForms() {
        f34893();
    }
    
    static {
        me = (SubLFile)new module0567();
        module0567.$g4137$ = null;
        module0567.$g4138$ = null;
        module0567.$g4139$ = null;
        $ic0$ = ConsesLow.list(new SubLObject[] { module0128.f8479((SubLObject)SubLObjectFactory.makeString("Individual")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Relation")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("TruthFunction")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Predicate")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Function-Denotational")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("LinguisticObject")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Event")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Agent-Generic")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Place-NonAgent")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SetOrCollection")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Collection")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("FirstOrderCollection")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("CollectionType")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("FacetingCollectionType")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Set-Mathematical")) });
        $ic1$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("DocumentationConstant")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("ImplementationConstant")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("TimeDimensionRelatedConstant")));
        $ic2$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Agent-Generic")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Event")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Place-NonAgent")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Collection")));
        $ic3$ = SubLObjectFactory.makeSymbol("?MT");
        $ic4$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?MT"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Microtheory")));
        $ic5$ = SubLObjectFactory.makeSymbol("S#37977", "CYC");
        $ic6$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic7$ = SubLObjectFactory.makeString("~A:~A~A~A~A~A~ADifference~%");
        $ic8$ = SubLObjectFactory.makeString("~A:~A~A~A~%");
        $ic9$ = SubLObjectFactory.makeString("~A~A~A~A~A~A~A~A~%");
        $ic10$ = SubLObjectFactory.makeString("~A~A~A~A~%");
        $ic11$ = SubLObjectFactory.makeSymbol("S#127", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol(">");
        $ic13$ = SubLObjectFactory.makeInteger(100);
        $ic14$ = SubLObjectFactory.makeKeyword("GAF");
        $ic15$ = SubLObjectFactory.makeKeyword("RULE");
        $ic16$ = SubLObjectFactory.makeString("Collections (instance-count)");
        $ic17$ = SubLObjectFactory.makeString("Collections (quoted-instance-count)");
        $ic18$ = SubLObjectFactory.makeString("Collections (spec-count)");
        $ic19$ = SubLObjectFactory.makeString("Assertion MT (gaf-count)");
        $ic20$ = SubLObjectFactory.makeString("Assertion MT (rule-count)");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0567.class
	Total time: 100 ms
	
	Decompiled with Procyon 0.5.32.
*/