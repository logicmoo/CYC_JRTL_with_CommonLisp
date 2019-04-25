package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0780 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0780";
    public static final String myFingerPrint = "af37fb00febe8988200da589fc8968f9f372e7a919ce7ffa8a0214bb9e1661c9";
    private static SubLSymbol $g6285$;
    private static SubLSymbol $g6286$;
    private static final SubLObject $ic0$;
    private static final SubLObject $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLString $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    
    public static SubLObject f50259(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        return (SubLObject)ConsesLow.list(var1, var2, var3);
    }
    
    public static SubLObject f50260(final SubLObject var4) {
        assert module0780.NIL != module0577.f35438(var4) : var4;
        return module0577.f35443(var4).first();
    }
    
    public static SubLObject f50261(final SubLObject var4) {
        assert module0780.NIL != module0577.f35438(var4) : var4;
        return conses_high.second(module0577.f35443(var4));
    }
    
    public static SubLObject f50262(final SubLObject var4) {
        assert module0780.NIL != module0577.f35438(var4) : var4;
        return conses_high.third(module0577.f35443(var4));
    }
    
    public static SubLObject f50263(final SubLObject var1, SubLObject var5, SubLObject var2, SubLObject var3) {
        if (var5 == module0780.UNPROVIDED) {
            var5 = module0574.f35152();
        }
        if (var2 == module0780.UNPROVIDED) {
            var2 = (SubLObject)module0780.NIL;
        }
        if (var3 == module0780.UNPROVIDED) {
            var3 = (SubLObject)module0780.NIL;
        }
        if (module0780.NIL == module0173.f10955(var1)) {
            return (SubLObject)module0780.NIL;
        }
        final SubLObject var6 = f50259(var1, var2, var3);
        final SubLObject var7 = module0577.f35454((SubLObject)ConsesLow.list((SubLObject)module0780.$ic3$, var5, (SubLObject)module0780.$ic4$, (SubLObject)module0780.$ic5$, (SubLObject)module0780.$ic6$, var6));
        return var7;
    }
    
    public static SubLObject f50264(final SubLObject var8, SubLObject var5, SubLObject var2, SubLObject var3) {
        if (var5 == module0780.UNPROVIDED) {
            var5 = module0574.f35152();
        }
        if (var2 == module0780.UNPROVIDED) {
            var2 = (SubLObject)module0780.NIL;
        }
        if (var3 == module0780.UNPROVIDED) {
            var3 = (SubLObject)module0780.NIL;
        }
        return f50263(var8, var5, var2, var3);
    }
    
    public static SubLObject f50265(final SubLObject var9, final SubLObject var10) {
        final SubLObject var11 = module0577.f35443(var10);
        final SubLObject var12 = (SubLObject)(var11.isList() ? conses_high.third(var11) : module0780.NIL);
        module0577.f35455(var10);
        if (module0778.f50163(var9) == module0780.$ic7$ && module0780.NIL != module0178.f11284(var12) && module0603.f36871(module0778.f50150(var9)).eql(module0178.f11334(var12)) && module0778.f50151(var9).equalp(module0178.f11335(var12))) {
            module0603.f36864(module0178.f11303(var12), module0178.f11287(var12));
        }
        return (SubLObject)module0780.T;
    }
    
    public static SubLObject f50266(SubLObject var5) {
        if (var5 == module0780.UNPROVIDED) {
            var5 = module0574.f35152();
        }
        return module0577.f35462(var5, (SubLObject)module0780.$ic5$);
    }
    
    public static SubLObject f50267(SubLObject var5) {
        if (var5 == module0780.UNPROVIDED) {
            var5 = module0574.f35152();
        }
        SubLObject var6 = (SubLObject)module0780.NIL;
        SubLObject var7 = f50266(var5);
        SubLObject var8 = (SubLObject)module0780.NIL;
        var8 = var7.first();
        while (module0780.NIL != var7) {
            if (module0780.NIL != f50268(var8)) {
                var6 = (SubLObject)ConsesLow.cons(var8, var6);
            }
            else {
                f50269(var8);
            }
            var7 = var7.rest();
            var8 = var7.first();
        }
        return Sequences.nreverse(var6);
    }
    
    public static SubLObject f50268(final SubLObject var4) {
        final SubLObject var5 = f50260(var4);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0780.NIL == constant_handles_oc.f8467(var5, (SubLObject)module0780.UNPROVIDED) && module0780.NIL == module0172.f10918(var5, (SubLObject)module0780.UNPROVIDED) && (module0780.NIL != module0206.f13453(var5) || module0780.NIL != constant_handles_oc.f8449(var5)));
    }
    
    public static SubLObject f50269(final SubLObject var4) {
        return module0577.f35455(var4);
    }
    
    public static SubLObject f50270(SubLObject var5) {
        if (var5 == module0780.UNPROVIDED) {
            var5 = module0574.f35152();
        }
        return (SubLObject)module0780.NIL;
    }
    
    public static SubLObject f50271(final SubLObject var8) {
        return module0219.f14509(var8, (SubLObject)module0780.ONE_INTEGER, module0780.$g6285$.getGlobalValue(), module0780.$g6286$.getGlobalValue(), (SubLObject)module0780.UNPROVIDED);
    }
    
    public static SubLObject f50272(SubLObject var14, SubLObject var15, SubLObject var16, SubLObject var17, SubLObject var18) {
        if (var14 == module0780.UNPROVIDED) {
            var14 = module0574.f35152();
        }
        if (var15 == module0780.UNPROVIDED) {
            var15 = module0777.$g6252$.getGlobalValue();
        }
        if (var16 == module0780.UNPROVIDED) {
            var16 = (SubLObject)module0780.NIL;
        }
        if (var17 == module0780.UNPROVIDED) {
            var17 = (SubLObject)module0780.NIL;
        }
        if (var18 == module0780.UNPROVIDED) {
            var18 = module0574.f35152();
        }
        final SubLObject var19 = module0777.f50028(var14, var15, var16);
        return f50273(var19, (SubLObject)module0780.NIL, (SubLObject)module0780.NIL, var17, var18);
    }
    
    public static SubLObject f50274(SubLObject var20, SubLObject var17, SubLObject var18) {
        if (var20 == module0780.UNPROVIDED) {
            var20 = module0574.f35152();
        }
        if (var17 == module0780.UNPROVIDED) {
            var17 = (SubLObject)module0780.NIL;
        }
        if (var18 == module0780.UNPROVIDED) {
            var18 = module0574.f35152();
        }
        final SubLObject var21 = module0777.f50036(var20);
        SubLObject var22 = (SubLObject)module0780.ZERO_INTEGER;
        SubLObject var23 = (SubLObject)module0780.NIL;
        if (module0780.NIL == var23) {
            SubLObject var24 = var21;
            SubLObject var25 = (SubLObject)module0780.NIL;
            var25 = var24.first();
            while (module0780.NIL == var23 && module0780.NIL != var24) {
                if (module0780.NIL != module0178.f11284(var25)) {
                    final SubLObject var26 = module0178.f11334(var25);
                    final SubLObject var27 = module0178.f11335(var25);
                    f50263(var26, var18, var27, var25);
                    var22 = Numbers.add(var22, (SubLObject)module0780.ONE_INTEGER);
                    var23 = (SubLObject)SubLObjectFactory.makeBoolean(module0780.NIL != var17 && var22.numGE(var17));
                }
                var24 = var24.rest();
                var25 = var24.first();
            }
        }
        return var22;
    }
    
    public static SubLObject f50273(final SubLObject var25, SubLObject var26, SubLObject var16, SubLObject var17, SubLObject var18) {
        if (var26 == module0780.UNPROVIDED) {
            var26 = (SubLObject)module0780.NIL;
        }
        if (var16 == module0780.UNPROVIDED) {
            var16 = (SubLObject)module0780.NIL;
        }
        if (var17 == module0780.UNPROVIDED) {
            var17 = (SubLObject)module0780.NIL;
        }
        if (var18 == module0780.UNPROVIDED) {
            var18 = module0574.f35152();
        }
        SubLObject var27 = (SubLObject)module0780.ZERO_INTEGER;
        SubLObject var28 = (SubLObject)module0780.NIL;
        if (module0780.NIL == var28) {
            SubLObject var29 = var25;
            SubLObject var30 = (SubLObject)module0780.NIL;
            var30 = var29.first();
            while (module0780.NIL == var28 && module0780.NIL != var29) {
                if (module0780.NIL == var26 || module0780.NIL != module0777.f50031(var30, var16)) {
                    final SubLObject var31 = f50271(var30);
                    final SubLObject var32 = (SubLObject)((module0780.NIL != var31) ? var31.first() : module0780.NIL);
                    final SubLObject var33 = (SubLObject)((module0780.NIL != module0178.f11284(var32)) ? module0178.f11335(var32) : module0780.NIL);
                    if (module0780.NIL != f50263(var30, var18, var33, var32)) {
                        var27 = Numbers.add(var27, (SubLObject)module0780.ONE_INTEGER);
                        var28 = (SubLObject)SubLObjectFactory.makeBoolean(module0780.NIL != var17 && var27.numGE(var17));
                    }
                }
                var29 = var29.rest();
                var30 = var29.first();
            }
        }
        return var27;
    }
    
    public static SubLObject f50275(final SubLObject var8, SubLObject var18) {
        if (var18 == module0780.UNPROVIDED) {
            var18 = module0574.f35152();
        }
        return f50273((SubLObject)ConsesLow.list(var8), (SubLObject)module0780.NIL, (SubLObject)module0780.NIL, (SubLObject)module0780.NIL, var18);
    }
    
    public static SubLObject f50276(final SubLObject var28, SubLObject var26, SubLObject var16, SubLObject var17, SubLObject var18) {
        if (var26 == module0780.UNPROVIDED) {
            var26 = (SubLObject)module0780.NIL;
        }
        if (var16 == module0780.UNPROVIDED) {
            var16 = (SubLObject)module0780.NIL;
        }
        if (var17 == module0780.UNPROVIDED) {
            var17 = (SubLObject)module0780.NIL;
        }
        if (var18 == module0780.UNPROVIDED) {
            var18 = module0574.f35152();
        }
        final SubLObject var29 = module0603.f36872(var28);
        return f50273(var29, var26, var16, var17, var18);
    }
    
    public static SubLObject f50277(SubLObject var16, SubLObject var17, SubLObject var18) {
        if (var16 == module0780.UNPROVIDED) {
            var16 = (SubLObject)module0780.NIL;
        }
        if (var17 == module0780.UNPROVIDED) {
            var17 = (SubLObject)module0780.NIL;
        }
        if (var18 == module0780.UNPROVIDED) {
            var18 = module0574.f35152();
        }
        final SubLThread var19 = SubLProcess.currentSubLThread();
        SubLObject var20 = (SubLObject)module0780.ZERO_INTEGER;
        final SubLObject var21 = (module0780.NIL != var17) ? var17 : module0173.f10962();
        final SubLObject var22 = constant_handles_oc.f8425();
        final SubLObject var23 = (SubLObject)module0780.$ic8$;
        final SubLObject var24 = module0065.f4733(var22);
        SubLObject var25 = (SubLObject)module0780.ZERO_INTEGER;
        assert module0780.NIL != Types.stringp(var23) : var23;
        final SubLObject var26 = module0012.$g75$.currentBinding(var19);
        final SubLObject var27 = module0012.$g76$.currentBinding(var19);
        final SubLObject var28 = module0012.$g77$.currentBinding(var19);
        final SubLObject var29 = module0012.$g78$.currentBinding(var19);
        try {
            module0012.$g75$.bind((SubLObject)module0780.ZERO_INTEGER, var19);
            module0012.$g76$.bind((SubLObject)module0780.NIL, var19);
            module0012.$g77$.bind((SubLObject)module0780.T, var19);
            module0012.$g78$.bind(Time.get_universal_time(), var19);
            module0012.f478(var23);
            final SubLObject var40_41 = var22;
            if (module0780.NIL == module0065.f4772(var40_41, (SubLObject)module0780.$ic10$)) {
                final SubLObject var42_43 = var40_41;
                if (module0780.NIL == module0065.f4775(var42_43, (SubLObject)module0780.$ic10$)) {
                    final SubLObject var30 = module0065.f4740(var42_43);
                    final SubLObject var31 = (SubLObject)module0780.NIL;
                    SubLObject var32;
                    SubLObject var33;
                    SubLObject var34;
                    SubLObject var35;
                    for (var32 = Sequences.length(var30), var33 = (SubLObject)module0780.NIL, var33 = (SubLObject)module0780.ZERO_INTEGER; var33.numL(var32); var33 = Numbers.add(var33, (SubLObject)module0780.ONE_INTEGER)) {
                        var34 = ((module0780.NIL != var31) ? Numbers.subtract(var32, var33, (SubLObject)module0780.ONE_INTEGER) : var33);
                        var35 = Vectors.aref(var30, var34);
                        if (module0780.NIL == module0065.f4749(var35) || module0780.NIL == module0065.f4773((SubLObject)module0780.$ic10$)) {
                            if (module0780.NIL != module0065.f4749(var35)) {
                                var35 = (SubLObject)module0780.$ic10$;
                            }
                            module0012.note_percent_progress(var25, var24);
                            var25 = Numbers.add(var25, (SubLObject)module0780.ONE_INTEGER);
                            if (module0780.NIL != module0777.f50031(var35, var16) && !var20.numGE(var21)) {
                                f50275(var35, var18);
                                var20 = Numbers.add(var20, (SubLObject)module0780.ONE_INTEGER);
                            }
                        }
                    }
                }
                final SubLObject var49_50 = var40_41;
                if (module0780.NIL == module0065.f4777(var49_50) || module0780.NIL == module0065.f4773((SubLObject)module0780.$ic10$)) {
                    final SubLObject var36 = module0065.f4738(var49_50);
                    SubLObject var37 = module0065.f4739(var49_50);
                    final SubLObject var38 = module0065.f4734(var49_50);
                    final SubLObject var39 = (SubLObject)((module0780.NIL != module0065.f4773((SubLObject)module0780.$ic10$)) ? module0780.NIL : module0780.$ic10$);
                    while (var37.numL(var38)) {
                        final SubLObject var40 = Hashtables.gethash_without_values(var37, var36, var39);
                        if (module0780.NIL == module0065.f4773((SubLObject)module0780.$ic10$) || module0780.NIL == module0065.f4749(var40)) {
                            module0012.note_percent_progress(var25, var24);
                            var25 = Numbers.add(var25, (SubLObject)module0780.ONE_INTEGER);
                            if (module0780.NIL != module0777.f50031(var40, var16) && !var20.numGE(var21)) {
                                f50275(var40, var18);
                                var20 = Numbers.add(var20, (SubLObject)module0780.ONE_INTEGER);
                            }
                        }
                        var37 = Numbers.add(var37, (SubLObject)module0780.ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var29, var19);
            module0012.$g77$.rebind(var28, var19);
            module0012.$g76$.rebind(var27, var19);
            module0012.$g75$.rebind(var26, var19);
        }
        return var20;
    }
    
    public static SubLObject f50278() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0780", "f50259", "S#54833", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0780", "f50260", "S#54834", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0780", "f50261", "S#54835", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0780", "f50262", "S#54836", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0780", "f50263", "S#54810", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0780", "f50264", "S#54837", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0780", "f50265", "S#54691", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0780", "f50266", "S#54808", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0780", "f50267", "S#54809", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0780", "f50268", "S#54838", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0780", "f50269", "S#54839", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0780", "f50270", "S#54811", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0780", "f50271", "S#54840", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0780", "f50272", "S#54841", 0, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0780", "f50274", "S#54842", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0780", "f50273", "S#54843", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0780", "f50275", "S#54844", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0780", "f50276", "S#54845", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0780", "f50277", "S#54846", 0, 3, false);
        return (SubLObject)module0780.NIL;
    }
    
    public static SubLObject f50279() {
        module0780.$g6285$ = SubLFiles.deflexical("S#54847", module0780.$ic0$);
        module0780.$g6286$ = SubLFiles.deflexical("S#54848", module0780.$ic1$);
        return (SubLObject)module0780.NIL;
    }
    
    public static SubLObject f50280() {
        return (SubLObject)module0780.NIL;
    }
    
    public void declareFunctions() {
        f50278();
    }
    
    public void initializeVariables() {
        f50279();
    }
    
    public void runTopLevelForms() {
        f50280();
    }
    
    static {
        me = (SubLFile)new module0780();
        module0780.$g6285$ = null;
        module0780.$g6286$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("termStrings-GuessedFromName"));
        $ic1$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TemporaryLexicalAssertions-GuessedMt"));
        $ic2$ = SubLObjectFactory.makeSymbol("S#38849", "CYC");
        $ic3$ = SubLObjectFactory.makeKeyword("CYCLIST");
        $ic4$ = SubLObjectFactory.makeKeyword("TYPE-KEY");
        $ic5$ = SubLObjectFactory.makeKeyword("LEXIFICATION-NEEDED");
        $ic6$ = SubLObjectFactory.makeKeyword("DATA");
        $ic7$ = SubLObjectFactory.makeKeyword("DONE");
        $ic8$ = SubLObjectFactory.makeString("Adding lexwiz reminders for unlexified terms ...");
        $ic9$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic10$ = SubLObjectFactory.makeKeyword("SKIP");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0780.class
	Total time: 144 ms
	
	Decompiled with Procyon 0.5.32.
*/