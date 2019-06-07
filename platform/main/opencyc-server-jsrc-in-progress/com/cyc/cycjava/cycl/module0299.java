package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        if (NIL != module0232.f15323(var1) && NIL != module0035.f1997(var1) && NIL != module0204.f13044(var1.first())) {
            final SubLObject var4 = module0204.f13047(var1.first());
            if (NIL != module0202.f12590(var4)) {
                SubLObject var5 = (SubLObject)NIL;
                if (NIL != f20003(var4, var2) || NIL != f20004(var4, var2)) {
                    var5 = (SubLObject)T;
                }
                return var5;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20005(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        return $g2695$.getGlobalValue();
    }
    
    public static SubLObject f20006(final SubLObject var1, final SubLObject var6, final SubLObject var2, final SubLObject var3) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        if (NIL != module0232.f15323(var1) && NIL != module0035.f1997(var1) && NIL != module0204.f13044(var1.first())) {
            final SubLObject var8 = module0204.f13047(var1.first());
            SubLObject var9 = (SubLObject)NIL;
            SubLObject var10 = (SubLObject)T;
            if (NIL != module0202.f12590(var8) && NIL != module0269.f17718(module0205.f13136(var8), var2)) {
                final SubLObject var11 = f20003(var8, var2);
                final SubLObject var12 = f20004(var8, var2);
                if (NIL != module0035.sublisp_boolean(var11)) {
                    var7.resetMultipleValues();
                    final SubLObject var12_13 = f20007(var8, var11, var2, var3, var6);
                    final SubLObject var14_15 = var7.secondMultipleValue();
                    var7.resetMultipleValues();
                    var9 = var12_13;
                    var10 = var14_15;
                }
                else {
                    if (NIL == var12.first()) {
                        return (SubLObject)NIL;
                    }
                    var7.resetMultipleValues();
                    final SubLObject var16_17 = f20008(var8, var12, var2, var3, var6);
                    final SubLObject var18_19 = var7.secondMultipleValue();
                    var7.resetMultipleValues();
                    var9 = var16_17;
                    var10 = var18_19;
                }
                if (NIL != var9) {
                    return Values.values(var9, var10);
                }
            }
            return Values.values((SubLObject)ConsesLow.list(var1), (SubLObject)NIL);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20003(final SubLObject var4, final SubLObject var2) {
        final SubLObject var5 = module0205.f13136(var4);
        if (NIL != module0269.f17718(var5, var2) && !var5.eql($ic3$)) {
            final SubLObject var6 = module0274.f18192(var4, var2, (SubLObject)UNPROVIDED);
            final SubLObject var7 = Sequences.find((SubLObject)$ic4$, var6, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic5$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL != var7) {
                SubLObject var8 = (SubLObject)NIL;
                final SubLObject var9 = module0205.f13180(var4, (SubLObject)$ic6$);
                SubLObject var10 = (SubLObject)NIL;
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                var10 = var9;
                var11 = var10.first();
                for (var12 = (SubLObject)ZERO_INTEGER; NIL == var8 && NIL != var10; var10 = var10.rest(), var11 = var10.first(), var12 = module0048.f_1X(var12)) {
                    if (!var11.eql(var5) && NIL != module0173.f10955(var11)) {
                        final SubLObject var13 = module0226.f14882(var5, var12, (SubLObject)UNPROVIDED);
                        final SubLObject var14 = var13.first();
                        SubLObject var15 = var13;
                        SubLObject var16 = (SubLObject)NIL;
                        var16 = var15.first();
                        while (NIL != var15) {
                            if (NIL == module0259.f16854(var11, var14, var2, (SubLObject)UNPROVIDED) && NIL != module0256.f16596(var11, var16, var2, (SubLObject)UNPROVIDED)) {
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20004(final SubLObject var4, final SubLObject var2) {
        final SubLObject var5 = module0205.f13136(var4);
        if (NIL != module0269.f17718(var5, var2)) {
            final SubLObject var6 = module0274.f18192(var4, var2, (SubLObject)UNPROVIDED);
            final SubLObject var8;
            final SubLObject var7 = var8 = Sequences.find((SubLObject)$ic7$, var6, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic5$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var9 = conses_high.second(var8);
            if (NIL != var7 && NIL != module0173.f10955(var9)) {
                if ($ic7$.eql(var8.first()) && NIL != module0256.f16596(var9, conses_high.fifth(var8), var2, (SubLObject)UNPROVIDED)) {
                    return (SubLObject)ConsesLow.list((SubLObject)T, conses_high.fourth(var8));
                }
                return (SubLObject)NIL;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20007(final SubLObject var4, final SubLObject var27, final SubLObject var2, final SubLObject var3, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        final SubLObject var28 = module0205.f13136(var4);
        if (var27.numE((SubLObject)ZERO_INTEGER)) {
            return (SubLObject)NIL;
        }
        if ($ic8$.equal(module0226.f15030(var28, var2)) || $ic9$.equal(module0226.f15030(var28, var2))) {
            return Values.values((SubLObject)ConsesLow.list(f20009(var4, var27, var6)), (SubLObject)ConsesLow.list((SubLObject)$ic10$));
        }
        return Values.values((SubLObject)ConsesLow.list(f20009(var4, var27, var6), f20010(var4, var27, var6)), (SubLObject)ConsesLow.list((SubLObject)$ic11$));
    }
    
    public static SubLObject f20008(final SubLObject var4, final SubLObject var35, final SubLObject var2, final SubLObject var3, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        final SubLObject var36 = conses_high.second(var35);
        if (!var36.numE((SubLObject)ZERO_INTEGER)) {
            return Values.values((SubLObject)ConsesLow.list(f20009(var4, var36, var6)), (SubLObject)ConsesLow.list((SubLObject)$ic12$));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20010(final SubLObject var4, final SubLObject var27, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        final SubLObject var28 = conses_high.copy_tree(var4);
        final SubLObject var29 = module0279.f18513((SubLObject)ConsesLow.list(var6, var28), (SubLObject)UNPROVIDED);
        final SubLObject var30 = module0202.f12817(var27, var29, var28);
        final SubLObject var31 = module0205.f13134(var28, var27, (SubLObject)UNPROVIDED);
        return module0202.f12761((SubLObject)ConsesLow.list($ic13$, var29, (SubLObject)ConsesLow.list($ic14$, (SubLObject)ConsesLow.list($ic3$, var29, var31), var30)));
    }
    
    public static SubLObject f20009(final SubLObject var4, final SubLObject var27, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        final SubLObject var28 = conses_high.copy_tree(var4);
        final SubLObject var29 = module0279.f18513((SubLObject)ConsesLow.list(var6, var28), (SubLObject)UNPROVIDED);
        final SubLObject var30 = module0202.f12817(var27, var29, var28);
        final SubLObject var31 = module0205.f13134(var28, var27, (SubLObject)UNPROVIDED);
        return module0202.f12761((SubLObject)ConsesLow.list($ic15$, var29, (SubLObject)ConsesLow.list($ic16$, (SubLObject)ConsesLow.list($ic3$, var29, var31), var30)));
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20012() {
        $g2695$ = SubLFiles.deflexical("S#22651", (SubLObject)$ic2$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20013() {
        module0292.f19698($ic0$, (SubLObject)$ic1$);
        return (SubLObject)NIL;
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
        $g2695$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("WffViolationResolutionRLModule"));
        $ic1$ = ConsesLow.list(new SubLObject[] { makeKeyword("REQUIRED"), makeSymbol("S#22642", "CYC"), makeKeyword("COST"), makeSymbol("S#22643", "CYC"), makeKeyword("REFORMULATE"), makeSymbol("S#22644", "CYC"), makeKeyword("DOCUMENTATION"), makeString("Returns wff alternatives to several common instance-type violations."), makeKeyword("EXAMPLE-SOURCE"), makeString("(#$hasPhysicalPartTypes #$Cell #$CellNucleus)"), makeKeyword("EXAMPLE-TARGET"), makeString("(#$relationAllInstance #$hasPhysicalPartTypes #$Cell #$CellNucleus)") });
        $ic2$ = makeInteger(20000);
        $ic3$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic4$ = makeKeyword("MAL-ARG-WRT-ARG-ISA");
        $ic5$ = makeSymbol("FIRST");
        $ic6$ = makeKeyword("IGNORE");
        $ic7$ = makeKeyword("MAL-ARG-WRT-INTER-ARG-ISA");
        $ic8$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("SingleEntry")));
        $ic9$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("singleEntryFormatInArgs")));
        $ic10$ = makeString("Wff Options 1.1a");
        $ic11$ = makeString("Wff Options 1.1b");
        $ic12$ = makeString("Wff Options 2.1");
        $ic13$ = constant_handles_oc.f8479((SubLObject)makeString("forAll"));
        $ic14$ = constant_handles_oc.f8479((SubLObject)makeString("implies"));
        $ic15$ = constant_handles_oc.f8479((SubLObject)makeString("thereExists"));
        $ic16$ = constant_handles_oc.f8479((SubLObject)makeString("and"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 123 ms
	
	Decompiled with Procyon 0.5.32.
*/