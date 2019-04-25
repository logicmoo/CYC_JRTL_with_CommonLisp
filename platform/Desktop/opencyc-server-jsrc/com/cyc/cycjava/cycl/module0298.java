package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0298 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0298";
    public static final String myFingerPrint = "f8f53045aeeafcdeaddea67cba8f502db08030efcc5dfbd12ea3b9c20c456fdb";
    private static SubLSymbol $g2694$;
    private static final SubLObject $ic0$;
    private static final SubLList $ic1$;
    private static final SubLInteger $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLObject $ic4$;
    private static final SubLObject $ic5$;
    private static final SubLObject $ic6$;
    private static final SubLObject $ic7$;
    private static final SubLObject $ic8$;
    private static final SubLObject $ic9$;
    private static final SubLObject $ic10$;
    private static final SubLObject $ic11$;
    private static final SubLList $ic12$;
    private static final SubLString $ic13$;
    private static final SubLObject $ic14$;
    private static final SubLString $ic15$;
    private static final SubLString $ic16$;
    private static final SubLObject $ic17$;
    private static final SubLObject $ic18$;
    private static final SubLString $ic19$;
    private static final SubLString $ic20$;
    
    public static SubLObject f19986(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        return $g2694$.getGlobalValue();
    }
    
    public static SubLObject f19987(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0232.f15323(var1) && NIL != module0035.f1997(var1) && NIL != module0204.f13044(var1.first()));
    }
    
    public static SubLObject f19988(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        final SubLObject var4 = (NIL != f19987(var1)) ? module0204.f13047(var1.first()) : var1;
        if (NIL != module0202.f12590(var4)) {
            SubLObject var5 = (SubLObject)NIL;
            final SubLObject var6 = module0205.f13207(var4, (SubLObject)$ic3$);
            SubLObject var7;
            SubLObject var8;
            for (var7 = (SubLObject)NIL, var7 = var6; NIL == var5 && NIL != var7; var7 = var7.rest()) {
                var8 = var7.first();
                if (NIL != f19989(var8, var2)) {
                    var5 = (SubLObject)T;
                }
            }
            return var5;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19989(final SubLObject var9, final SubLObject var2) {
        return (SubLObject)makeBoolean(NIL != f19990(var9, var2) || NIL != f19991(var9, var2) || NIL != f19992(var9, var2) || NIL != f19993(var9, var2));
    }
    
    public static SubLObject f19990(final SubLObject var9, final SubLObject var2) {
        if (NIL != module0202.f12590(var9) && NIL != module0202.f12734(var9, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED)) {
            final SubLObject var10 = module0205.f13136(var9);
            final SubLObject var11 = module0205.f13204(var9, (SubLObject)UNPROVIDED);
            if (!$ic4$.eql(var10)) {
                return (SubLObject)NIL;
            }
            if (NIL != module0269.f17713(var11, var2) && NIL != module0035.sublisp_boolean(module0347.f23334((SubLObject)ConsesLow.list($ic5$, var11), var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))) {
                return (SubLObject)T;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19991(final SubLObject var9, final SubLObject var2) {
        if (NIL != module0202.f12590(var9) && NIL != module0202.f12734(var9, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED)) {
            final SubLObject var10 = module0205.f13136(var9);
            final SubLObject var11 = module0205.f13204(var9, (SubLObject)UNPROVIDED);
            if (!$ic4$.eql(var10)) {
                return (SubLObject)NIL;
            }
            if (NIL != module0269.f17713(var11, var2) && NIL == module0035.sublisp_boolean(module0347.f23334((SubLObject)ConsesLow.list($ic5$, var11), var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))) {
                return (SubLObject)T;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19992(final SubLObject var9, final SubLObject var2) {
        if (NIL == module0202.f12590(var9) || NIL == module0202.f12734(var9, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        final SubLObject var10 = module0205.f13136(var9);
        final SubLObject var11 = module0205.f13204(var9, (SubLObject)UNPROVIDED);
        if ($ic6$.eql(var10)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19993(final SubLObject var9, final SubLObject var2) {
        if (NIL == module0202.f12590(var9) || NIL == module0202.f12734(var9, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        final SubLObject var10 = module0205.f13136(var9);
        final SubLObject var11 = module0205.f13203(var9, (SubLObject)UNPROVIDED);
        if ($ic7$.eql(var10)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19994(final SubLObject var1, final SubLObject var12, final SubLObject var2, final SubLObject var3) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        if (NIL != f19987(var1)) {
            final SubLObject var14 = module0204.f13047(var1.first());
            SubLObject var15 = (SubLObject)NIL;
            SubLObject var16 = (SubLObject)T;
            if (NIL != module0202.f12590(var14)) {
                SubLObject var17 = (SubLObject)ZERO_INTEGER;
                final SubLObject var18 = module0205.f13207(var14, (SubLObject)$ic3$);
                SubLObject var19;
                SubLObject var20;
                SubLObject var17_18;
                SubLObject var19_20;
                SubLObject var21_22;
                SubLObject var23_24;
                SubLObject var25_26;
                SubLObject var27_28;
                SubLObject var29_30;
                SubLObject var31_32;
                for (var19 = (SubLObject)NIL, var19 = var18; NIL == var15 && NIL != var19; var19 = var19.rest()) {
                    var20 = var19.first();
                    var17 = Numbers.add(var17, (SubLObject)ONE_INTEGER);
                    if (NIL != f19990(var20, var2)) {
                        var13.resetMultipleValues();
                        var17_18 = f19995(var14, var17, var2, var3, var12);
                        var19_20 = var13.secondMultipleValue();
                        var13.resetMultipleValues();
                        var15 = var17_18;
                        var16 = var19_20;
                    }
                    else if (NIL != f19991(var20, var2)) {
                        var13.resetMultipleValues();
                        var21_22 = f19996(var14, var17, var2, var3, var12);
                        var23_24 = var13.secondMultipleValue();
                        var13.resetMultipleValues();
                        var15 = var21_22;
                        var16 = var23_24;
                    }
                    else if (NIL != f19992(var20, var2)) {
                        var13.resetMultipleValues();
                        var25_26 = f19997(var14, var17, var2, var3, var12);
                        var27_28 = var13.secondMultipleValue();
                        var13.resetMultipleValues();
                        var15 = var25_26;
                        var16 = var27_28;
                    }
                    else if (NIL != f19993(var20, var2)) {
                        var13.resetMultipleValues();
                        var29_30 = f19998(var14, var17, var2, var3, var12);
                        var31_32 = var13.secondMultipleValue();
                        var13.resetMultipleValues();
                        var15 = var29_30;
                        var16 = var31_32;
                    }
                }
            }
            return Values.values((SubLObject)ConsesLow.list(module0204.f13033(var15)), var16);
        }
        return Values.values(var1, (SubLObject)NIL);
    }
    
    public static SubLObject f19997(final SubLObject var1, final SubLObject var16, final SubLObject var2, final SubLObject var3, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        final SubLObject var17 = conses_high.copy_tree(var1);
        final SubLObject var18 = module0205.f13134(var17, var16, (SubLObject)UNPROVIDED);
        final SubLObject var19 = module0205.f13333(var17);
        final SubLObject var20 = module0205.f13204(var18, (SubLObject)UNPROVIDED);
        final SubLObject var21 = module0279.f18513((SubLObject)ConsesLow.list(var12, var17), (SubLObject)UNPROVIDED);
        final SubLObject var22 = module0202.f12817(var16, var21, var17);
        return Values.values(module0202.f12761((SubLObject)ConsesLow.listS($ic8$, (SubLObject)ConsesLow.list($ic9$, var21, (SubLObject)ConsesLow.list($ic10$, (SubLObject)ConsesLow.list($ic11$, var21, var20), var22)), (SubLObject)$ic12$)), (SubLObject)ConsesLow.list((SubLObject)$ic13$));
    }
    
    public static SubLObject f19998(final SubLObject var1, final SubLObject var16, final SubLObject var2, final SubLObject var3, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        final SubLObject var17 = conses_high.copy_tree(var1);
        final SubLObject var18 = module0205.f13134(var17, var16, (SubLObject)UNPROVIDED);
        final SubLObject var19 = module0205.f13333(var17);
        final SubLObject var20 = module0205.f13203(var18, (SubLObject)UNPROVIDED);
        final SubLObject var21 = module0279.f18513((SubLObject)ConsesLow.list(var12, var17), (SubLObject)UNPROVIDED);
        final SubLObject var22 = module0202.f12817(var16, var21, var17);
        final SubLObject var23 = module0279.f18513((SubLObject)ConsesLow.list(var12, var17, var22), (SubLObject)UNPROVIDED);
        if (!var19.eql($ic14$) || !var16.numE((SubLObject)ONE_INTEGER) || NIL == module0269.f17713(var20, var2)) {
            return Values.values(module0202.f12761((SubLObject)ConsesLow.list($ic10$, var22, (SubLObject)ConsesLow.list($ic8$, (SubLObject)ConsesLow.list($ic9$, var23, (SubLObject)ConsesLow.list($ic11$, var23, var20)), var21))), (SubLObject)ConsesLow.list((SubLObject)$ic16$));
        }
        final SubLObject var24 = (SubLObject)NIL;
        if (NIL != var24) {
            return Values.values(var24.first(), (SubLObject)ConsesLow.list((SubLObject)$ic15$));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19995(final SubLObject var1, final SubLObject var16, final SubLObject var2, final SubLObject var3, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        final SubLThread var17 = SubLProcess.currentSubLThread();
        final SubLObject var18 = conses_high.copy_tree(var1);
        final SubLObject var19 = module0205.f13134(var18, var16, (SubLObject)UNPROVIDED);
        final SubLObject var20 = module0205.f13333(var18);
        var17.resetMultipleValues();
        final SubLObject var21 = module0202.f12796(var19);
        final SubLObject var22 = var17.secondMultipleValue();
        final SubLObject var23 = var17.thirdMultipleValue();
        var17.resetMultipleValues();
        final SubLObject var24 = module0279.f18513((SubLObject)ConsesLow.list(var12, var18), (SubLObject)UNPROVIDED);
        final SubLObject var25 = module0202.f12817(var16, var24, var18);
        return Values.values(module0202.f12761((SubLObject)ConsesLow.list($ic10$, (SubLObject)ConsesLow.list($ic17$, (SubLObject)ConsesLow.list($ic11$, var24, var22), var25), (SubLObject)ConsesLow.list($ic18$, var22, var23))), (SubLObject)ConsesLow.list((SubLObject)$ic19$));
    }
    
    public static SubLObject f19996(final SubLObject var1, final SubLObject var16, final SubLObject var2, final SubLObject var3, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        final SubLThread var17 = SubLProcess.currentSubLThread();
        final SubLObject var18 = conses_high.copy_tree(var1);
        final SubLObject var19 = module0205.f13134(var18, var16, (SubLObject)UNPROVIDED);
        final SubLObject var20 = module0205.f13333(var18);
        var17.resetMultipleValues();
        final SubLObject var21 = module0202.f12796(var19);
        final SubLObject var22 = var17.secondMultipleValue();
        final SubLObject var23 = var17.thirdMultipleValue();
        var17.resetMultipleValues();
        final SubLObject var24 = module0202.f12817(var16, var22, var18);
        if (NIL != module0269.f17718(var20, var2)) {
            return Values.values(module0202.f12761((SubLObject)ConsesLow.list($ic10$, (SubLObject)ConsesLow.list($ic11$, var22, var23), var24)), (SubLObject)ConsesLow.list((SubLObject)$ic20$));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19999() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0298", "f19986", "S#22628", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0298", "f19987", "S#22629", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0298", "f19988", "S#22630", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0298", "f19989", "S#22631", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0298", "f19990", "S#22632", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0298", "f19991", "S#22633", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0298", "f19992", "S#22634", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0298", "f19993", "S#22635", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0298", "f19994", "S#22636", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0298", "f19997", "S#22637", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0298", "f19998", "S#22638", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0298", "f19995", "S#22639", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0298", "f19996", "S#22640", 4, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20000() {
        $g2694$ = SubLFiles.deflexical("S#22641", (SubLObject)$ic2$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20001() {
        module0292.f19698($ic0$, (SubLObject)$ic1$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f19999();
    }
    
    public void initializeVariables() {
        f20000();
    }
    
    public void runTopLevelForms() {
        f20001();
    }
    
    static {
        me = (SubLFile)new module0298();
        $g2694$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("QueryProcessingRLModule"));
        $ic1$ = ConsesLow.list(new SubLObject[] { makeKeyword("REQUIRED"), makeSymbol("S#22630", "CYC"), makeKeyword("COST"), makeSymbol("S#22628", "CYC"), makeKeyword("REFORMULATE"), makeSymbol("S#22636", "CYC"), makeKeyword("DOCUMENTATION"), makeString("Reformulates #$VariableFn expressions so that queries search for bindings of the appropriate type."), makeKeyword("EXAMPLE-SOURCE"), makeString("(#$contains-Underspecified (#$VariableFn ?WHICH-THING #$DNAMolecule)\n    #$Ribose)"), makeKeyword("EXAMPLE-TARGET"), makeString("(#$and\n     (#$genls ?WHICH-THING #$DNAMolecule)\n     (#$implies\n      (#$isa ?X ?WHICH-THING)\n      (#$contains-Underspecified ?WHICH-THING #$Ribose)))") });
        $ic2$ = makeInteger(1200);
        $ic3$ = makeKeyword("IGNORE");
        $ic4$ = constant_handles_oc.f8479((SubLObject)makeString("VariableFn"));
        $ic5$ = constant_handles_oc.f8479((SubLObject)makeString("noNotableInstances"));
        $ic6$ = constant_handles_oc.f8479((SubLObject)makeString("QuantityVariableFn"));
        $ic7$ = constant_handles_oc.f8479((SubLObject)makeString("CardinalityOfFn"));
        $ic8$ = constant_handles_oc.f8479((SubLObject)makeString("extentCardinality"));
        $ic9$ = constant_handles_oc.f8479((SubLObject)makeString("TheSetOf"));
        $ic10$ = constant_handles_oc.f8479((SubLObject)makeString("and"));
        $ic11$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic12$ = ConsesLow.list((SubLObject)makeSymbol("?CARDIN"));
        $ic13$ = makeString("#$QuantityVariableFn");
        $ic14$ = constant_handles_oc.f8479((SubLObject)makeString("is-Underspecified"));
        $ic15$ = makeString("CardinalityOfFn (QP) 1");
        $ic16$ = makeString("CardinalityOfFn 2");
        $ic17$ = constant_handles_oc.f8479((SubLObject)makeString("implies"));
        $ic18$ = constant_handles_oc.f8479((SubLObject)makeString("genls"));
        $ic19$ = makeString("VariableFn specs");
        $ic20$ = makeString("VariableFn instances");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 111 ms
	
	Decompiled with Procyon 0.5.32.
*/