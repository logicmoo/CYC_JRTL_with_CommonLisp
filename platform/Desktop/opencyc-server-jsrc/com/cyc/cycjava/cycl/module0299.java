package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0299 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0299";
    public static final String myFingerPrint = "9fc40d2998b49001360db7a70cbae6eb586b89a78ca8220bdfc7693332c3a61f";
    private static SubLSymbol $g2695$;
    private static final SubLObject $ic0$;
    private static final SubLList $ic1$;
    private static final SubLInteger $ic2$;
    private static final SubLObject $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLList $ic9$;
    private static final SubLString $ic10$;
    private static final SubLString $ic11$;
    private static final SubLString $ic12$;
    private static final SubLObject $ic13$;
    private static final SubLObject $ic14$;
    private static final SubLObject $ic15$;
    private static final SubLObject $ic16$;
    
    public static SubLObject f20002(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        if (module0299.NIL != module0232.f15323(var1) && module0299.NIL != module0035.f1997(var1) && module0299.NIL != module0204.f13044(var1.first())) {
            final SubLObject var4 = module0204.f13047(var1.first());
            if (module0299.NIL != module0202.f12590(var4)) {
                SubLObject var5 = (SubLObject)module0299.NIL;
                if (module0299.NIL != f20003(var4, var2) || module0299.NIL != f20004(var4, var2)) {
                    var5 = (SubLObject)module0299.T;
                }
                return var5;
            }
        }
        return (SubLObject)module0299.NIL;
    }
    
    public static SubLObject f20005(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        return module0299.$g2695$.getGlobalValue();
    }
    
    public static SubLObject f20006(final SubLObject var1, final SubLObject var6, final SubLObject var2, final SubLObject var3) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        if (module0299.NIL != module0232.f15323(var1) && module0299.NIL != module0035.f1997(var1) && module0299.NIL != module0204.f13044(var1.first())) {
            final SubLObject var8 = module0204.f13047(var1.first());
            SubLObject var9 = (SubLObject)module0299.NIL;
            SubLObject var10 = (SubLObject)module0299.T;
            if (module0299.NIL != module0202.f12590(var8) && module0299.NIL != module0269.f17718(module0205.f13136(var8), var2)) {
                final SubLObject var11 = f20003(var8, var2);
                final SubLObject var12 = f20004(var8, var2);
                if (module0299.NIL != module0035.sublisp_boolean(var11)) {
                    var7.resetMultipleValues();
                    final SubLObject var12_13 = f20007(var8, var11, var2, var3, var6);
                    final SubLObject var14_15 = var7.secondMultipleValue();
                    var7.resetMultipleValues();
                    var9 = var12_13;
                    var10 = var14_15;
                }
                else {
                    if (module0299.NIL == var12.first()) {
                        return (SubLObject)module0299.NIL;
                    }
                    var7.resetMultipleValues();
                    final SubLObject var16_17 = f20008(var8, var12, var2, var3, var6);
                    final SubLObject var18_19 = var7.secondMultipleValue();
                    var7.resetMultipleValues();
                    var9 = var16_17;
                    var10 = var18_19;
                }
                if (module0299.NIL != var9) {
                    return Values.values(var9, var10);
                }
            }
            return Values.values((SubLObject)ConsesLow.list(var1), (SubLObject)module0299.NIL);
        }
        return (SubLObject)module0299.NIL;
    }
    
    public static SubLObject f20003(final SubLObject var4, final SubLObject var2) {
        final SubLObject var5 = module0205.f13136(var4);
        if (module0299.NIL != module0269.f17718(var5, var2) && !var5.eql(module0299.$ic3$)) {
            final SubLObject var6 = module0274.f18192(var4, var2, (SubLObject)module0299.UNPROVIDED);
            final SubLObject var7 = Sequences.find((SubLObject)module0299.$ic4$, var6, Symbols.symbol_function((SubLObject)module0299.EQL), Symbols.symbol_function((SubLObject)module0299.$ic5$), (SubLObject)module0299.UNPROVIDED, (SubLObject)module0299.UNPROVIDED);
            if (module0299.NIL != var7) {
                SubLObject var8 = (SubLObject)module0299.NIL;
                final SubLObject var9 = module0205.f13180(var4, (SubLObject)module0299.$ic6$);
                SubLObject var10 = (SubLObject)module0299.NIL;
                SubLObject var11 = (SubLObject)module0299.NIL;
                SubLObject var12 = (SubLObject)module0299.NIL;
                var10 = var9;
                var11 = var10.first();
                for (var12 = (SubLObject)module0299.ZERO_INTEGER; module0299.NIL == var8 && module0299.NIL != var10; var10 = var10.rest(), var11 = var10.first(), var12 = module0048.f_1X(var12)) {
                    if (!var11.eql(var5) && module0299.NIL != module0173.f10955(var11)) {
                        final SubLObject var13 = module0226.f14882(var5, var12, (SubLObject)module0299.UNPROVIDED);
                        final SubLObject var14 = var13.first();
                        SubLObject var15 = var13;
                        SubLObject var16 = (SubLObject)module0299.NIL;
                        var16 = var15.first();
                        while (module0299.NIL != var15) {
                            if (module0299.NIL == module0259.f16854(var11, var14, var2, (SubLObject)module0299.UNPROVIDED) && module0299.NIL != module0256.f16596(var11, var16, var2, (SubLObject)module0299.UNPROVIDED)) {
                                var8 = var11;
                                return var12;
                            }
                            var15 = var15.rest();
                            var16 = var15.first();
                        }
                    }
                }
            }
        }
        return (SubLObject)module0299.NIL;
    }
    
    public static SubLObject f20004(final SubLObject var4, final SubLObject var2) {
        final SubLObject var5 = module0205.f13136(var4);
        if (module0299.NIL != module0269.f17718(var5, var2)) {
            final SubLObject var6 = module0274.f18192(var4, var2, (SubLObject)module0299.UNPROVIDED);
            final SubLObject var8;
            final SubLObject var7 = var8 = Sequences.find((SubLObject)module0299.$ic7$, var6, Symbols.symbol_function((SubLObject)module0299.EQL), Symbols.symbol_function((SubLObject)module0299.$ic5$), (SubLObject)module0299.UNPROVIDED, (SubLObject)module0299.UNPROVIDED);
            final SubLObject var9 = conses_high.second(var8);
            if (module0299.NIL != var7 && module0299.NIL != module0173.f10955(var9)) {
                if (module0299.$ic7$.eql(var8.first()) && module0299.NIL != module0256.f16596(var9, conses_high.fifth(var8), var2, (SubLObject)module0299.UNPROVIDED)) {
                    return (SubLObject)ConsesLow.list((SubLObject)module0299.T, conses_high.fourth(var8));
                }
                return (SubLObject)module0299.NIL;
            }
        }
        return (SubLObject)module0299.NIL;
    }
    
    public static SubLObject f20007(final SubLObject var4, final SubLObject var27, final SubLObject var2, final SubLObject var3, SubLObject var6) {
        if (var6 == module0299.UNPROVIDED) {
            var6 = (SubLObject)module0299.NIL;
        }
        final SubLObject var28 = module0205.f13136(var4);
        if (var27.numE((SubLObject)module0299.ZERO_INTEGER)) {
            return (SubLObject)module0299.NIL;
        }
        if (module0299.$ic8$.equal(module0226.f15030(var28, var2)) || module0299.$ic9$.equal(module0226.f15030(var28, var2))) {
            return Values.values((SubLObject)ConsesLow.list(f20009(var4, var27, var6)), (SubLObject)ConsesLow.list((SubLObject)module0299.$ic10$));
        }
        return Values.values((SubLObject)ConsesLow.list(f20009(var4, var27, var6), f20010(var4, var27, var6)), (SubLObject)ConsesLow.list((SubLObject)module0299.$ic11$));
    }
    
    public static SubLObject f20008(final SubLObject var4, final SubLObject var35, final SubLObject var2, final SubLObject var3, SubLObject var6) {
        if (var6 == module0299.UNPROVIDED) {
            var6 = (SubLObject)module0299.NIL;
        }
        final SubLObject var36 = conses_high.second(var35);
        if (!var36.numE((SubLObject)module0299.ZERO_INTEGER)) {
            return Values.values((SubLObject)ConsesLow.list(f20009(var4, var36, var6)), (SubLObject)ConsesLow.list((SubLObject)module0299.$ic12$));
        }
        return (SubLObject)module0299.NIL;
    }
    
    public static SubLObject f20010(final SubLObject var4, final SubLObject var27, SubLObject var6) {
        if (var6 == module0299.UNPROVIDED) {
            var6 = (SubLObject)module0299.NIL;
        }
        final SubLObject var28 = conses_high.copy_tree(var4);
        final SubLObject var29 = module0279.f18513((SubLObject)ConsesLow.list(var6, var28), (SubLObject)module0299.UNPROVIDED);
        final SubLObject var30 = module0202.f12817(var27, var29, var28);
        final SubLObject var31 = module0205.f13134(var28, var27, (SubLObject)module0299.UNPROVIDED);
        return module0202.f12761((SubLObject)ConsesLow.list(module0299.$ic13$, var29, (SubLObject)ConsesLow.list(module0299.$ic14$, (SubLObject)ConsesLow.list(module0299.$ic3$, var29, var31), var30)));
    }
    
    public static SubLObject f20009(final SubLObject var4, final SubLObject var27, SubLObject var6) {
        if (var6 == module0299.UNPROVIDED) {
            var6 = (SubLObject)module0299.NIL;
        }
        final SubLObject var28 = conses_high.copy_tree(var4);
        final SubLObject var29 = module0279.f18513((SubLObject)ConsesLow.list(var6, var28), (SubLObject)module0299.UNPROVIDED);
        final SubLObject var30 = module0202.f12817(var27, var29, var28);
        final SubLObject var31 = module0205.f13134(var28, var27, (SubLObject)module0299.UNPROVIDED);
        return module0202.f12761((SubLObject)ConsesLow.list(module0299.$ic15$, var29, (SubLObject)ConsesLow.list(module0299.$ic16$, (SubLObject)ConsesLow.list(module0299.$ic3$, var29, var31), var30)));
    }
    
    public static SubLObject f20011() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0299", "f20002", "S#22642", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0299", "f20005", "S#22643", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0299", "f20006", "S#22644", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0299", "f20003", "S#22645", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0299", "f20004", "S#22646", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0299", "f20007", "S#22647", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0299", "f20008", "S#22648", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0299", "f20010", "S#22649", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0299", "f20009", "S#22650", 2, 1, false);
        return (SubLObject)module0299.NIL;
    }
    
    public static SubLObject f20012() {
        module0299.$g2695$ = SubLFiles.deflexical("S#22651", (SubLObject)module0299.$ic2$);
        return (SubLObject)module0299.NIL;
    }
    
    public static SubLObject f20013() {
        module0292.f19698(module0299.$ic0$, (SubLObject)module0299.$ic1$);
        return (SubLObject)module0299.NIL;
    }
    
    public void declareFunctions() {
        f20011();
    }
    
    public void initializeVariables() {
        f20012();
    }
    
    public void runTopLevelForms() {
        f20013();
    }
    
    static {
        me = (SubLFile)new module0299();
        module0299.$g2695$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("WffViolationResolutionRLModule"));
        $ic1$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("S#22642", "CYC"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#22643", "CYC"), SubLObjectFactory.makeKeyword("REFORMULATE"), SubLObjectFactory.makeSymbol("S#22644", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("Returns wff alternatives to several common instance-type violations."), SubLObjectFactory.makeKeyword("EXAMPLE-SOURCE"), SubLObjectFactory.makeString("(#$hasPhysicalPartTypes #$Cell #$CellNucleus)"), SubLObjectFactory.makeKeyword("EXAMPLE-TARGET"), SubLObjectFactory.makeString("(#$relationAllInstance #$hasPhysicalPartTypes #$Cell #$CellNucleus)") });
        $ic2$ = SubLObjectFactory.makeInteger(20000);
        $ic3$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic4$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-ARG-ISA");
        $ic5$ = SubLObjectFactory.makeSymbol("FIRST");
        $ic6$ = SubLObjectFactory.makeKeyword("IGNORE");
        $ic7$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-INTER-ARG-ISA");
        $ic8$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SingleEntry")));
        $ic9$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("singleEntryFormatInArgs")));
        $ic10$ = SubLObjectFactory.makeString("Wff Options 1.1a");
        $ic11$ = SubLObjectFactory.makeString("Wff Options 1.1b");
        $ic12$ = SubLObjectFactory.makeString("Wff Options 2.1");
        $ic13$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("forAll"));
        $ic14$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("implies"));
        $ic15$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("thereExists"));
        $ic16$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("and"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0299.class
	Total time: 123 ms
	
	Decompiled with Procyon 0.5.32.
*/