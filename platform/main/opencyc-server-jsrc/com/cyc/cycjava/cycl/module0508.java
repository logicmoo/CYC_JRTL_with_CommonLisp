package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0508 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0508";
    public static final String myFingerPrint = "58a5d06b0af3a2d421bf4315d315a6989c65f8591d063e3e730df514f785ac2a";
    public static SubLSymbol $g3824$;
    private static SubLSymbol $g3825$;
    private static SubLSymbol $g3826$;
    private static SubLSymbol $g3827$;
    private static final SubLString $ic0$;
    private static final SubLString $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLString $ic3$;
    private static final SubLString $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLString $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
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
    private static final SubLSymbol $ic30$;
    private static final SubLList $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    
    public static SubLObject f32426(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)T;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL == $g3824$.getDynamicValue(var3)) {
            Errors.warn((SubLObject)$ic0$, var1);
            return (SubLObject)NIL;
        }
        var3.resetMultipleValues();
        final SubLObject var4 = f32427(var1);
        final SubLObject var5 = var3.secondMultipleValue();
        var3.resetMultipleValues();
        final SubLObject var6 = module0340.f22941(var5, var4);
        f32428(var1, var6);
        if (NIL != var2) {
            module0340.f22950();
        }
        return var6;
    }
    
    public static SubLObject f32429(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)T;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        f32430(var1);
        if (NIL != assertion_handles_oc.f11041(var1, (SubLObject)UNPROVIDED)) {
            var3.resetMultipleValues();
            final SubLObject var4 = f32427(var1);
            final SubLObject var5 = var3.secondMultipleValue();
            var3.resetMultipleValues();
            return module0340.f22949(var5, var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32431(final SubLObject var1) {
        f32429(var1, (SubLObject)UNPROVIDED);
        return f32426(var1, (SubLObject)T);
    }
    
    public static SubLObject f32432() {
        SubLObject var7 = (SubLObject)ZERO_INTEGER;
        final SubLObject var8 = module0340.f22842();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        final Iterator var11 = Hashtables.getEntrySetIterator(var8);
        try {
            while (Hashtables.iteratorHasNext(var11)) {
                final Map.Entry var12 = Hashtables.iteratorNextEntry(var11);
                var9 = Hashtables.getEntryKey(var12);
                var10 = Hashtables.getEntryValue(var12);
                final SubLObject var13 = module0340.f22825(var10);
                if (NIL != module0038.f2668($g3825$.getGlobalValue(), module0038.f2638(var13), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                    module0340.f22949(var13, (SubLObject)NIL);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var11);
        }
        module0340.f22950();
        return var7;
    }
    
    public static SubLObject f32427(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        assert NIL != module0178.f11290(var1) : var1;
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        final SubLObject var5 = module0178.f11282(var1);
        final SubLObject var6 = module0232.f15308(var5);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var2) && !ONE_INTEGER.numE(Sequences.length(var6))) {
            Errors.error((SubLObject)$ic3$, var1);
        }
        final SubLObject var7 = var6.first();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var2) && NIL != module0202.f12707(var7, (SubLObject)UNPROVIDED)) {
            Errors.error((SubLObject)$ic4$, var1);
        }
        final SubLObject var8 = (SubLObject)$ic5$;
        var3 = conses_high.putf(var3, (SubLObject)$ic6$, var8);
        final SubLObject var9 = module0178.f11291(var1);
        var3 = conses_high.putf(var3, (SubLObject)$ic7$, var9);
        final SubLObject var10 = module0205.f13333(var7);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var2) && NIL == module0173.f10955(var10)) {
            Errors.error((SubLObject)$ic8$, var1);
        }
        var3 = conses_high.putf(var3, (SubLObject)$ic9$, var10);
        var4 = f32433(var1);
        final SubLObject var11 = module0202.f12725(var7, (SubLObject)UNPROVIDED);
        var3 = conses_high.putf(var3, (SubLObject)$ic10$, var11);
        final SubLObject var12 = module0178.f11287(var1);
        var3 = conses_high.putf(var3, (SubLObject)$ic11$, var12);
        final SubLObject var13 = (SubLObject)ConsesLow.list((SubLObject)$ic12$, var7);
        var3 = conses_high.putf(var3, (SubLObject)$ic13$, var13);
        final SubLObject var14 = (SubLObject)ConsesLow.list((SubLObject)$ic14$, (SubLObject)$ic15$, (SubLObject)$ic16$, var1);
        var3 = conses_high.putf(var3, (SubLObject)$ic17$, var14);
        final SubLObject var15 = (SubLObject)ConsesLow.list((SubLObject)$ic14$, (SubLObject)$ic18$, (SubLObject)$ic16$, var1, (SubLObject)ConsesLow.list((SubLObject)$ic19$, var4));
        var3 = conses_high.putf(var3, (SubLObject)$ic20$, var15);
        return Values.values(var3, var4);
    }
    
    public static SubLObject f32434(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        var2.resetMultipleValues();
        final SubLObject var3 = f32427(var1);
        final SubLObject var4 = var2.secondMultipleValue();
        var2.resetMultipleValues();
        return var4;
    }
    
    public static SubLObject f32435(final SubLObject var23, final SubLObject var1) {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        SubLObject var25 = (SubLObject)NIL;
        if (NIL == $g3826$.getDynamicValue(var24)) {
            final SubLObject var26 = $g3826$.currentBinding(var24);
            try {
                $g3826$.bind((SubLObject)T, var24);
                final SubLObject var27 = module0373.f26113();
                if (NIL != var27) {
                    final SubLObject var28 = module0361.f24177(var27);
                    final SubLObject var29 = module0147.f9551();
                    final SubLObject var30 = f32434(var1);
                    final SubLObject var31 = f32436(var23, var1, var28, (SubLObject)ConsesLow.list((SubLObject)$ic19$, var30));
                    final SubLObject var32 = module0411.f28599(var23, var29, var1, var28, var31);
                    final SubLObject var33 = inference_datastructures_inference_oc.f25597(var32);
                    if (NIL != var33 && NIL != inference_datastructures_inference_oc.f25605(var32)) {
                        final SubLObject var34 = inference_datastructures_inference_oc.f25606(var32);
                        var25 = module0360.f23936(module0385.f27404(var33, var34));
                    }
                    inference_datastructures_inference_oc.f25471(var32);
                }
            }
            finally {
                $g3826$.rebind(var26, var24);
            }
        }
        return var25;
    }
    
    public static SubLObject f32437(final SubLObject var32, final SubLObject var19, final SubLObject var1, final SubLObject var33, final SubLObject var34) {
        final SubLObject var35 = f32436(var32, var1, var33, var34);
        final SubLObject var36 = module0409.f28515(var32, var19, var35);
        return var36;
    }
    
    public static SubLObject f32438(final SubLObject var32, final SubLObject var1, final SubLObject var34) {
        final SubLObject var35 = module0373.f26113();
        final SubLObject var36 = f32436(var32, var1, var35, var34);
        final SubLObject var37 = module0411.f28599(var32, module0147.f9551(), var1, var35, var36);
        final SubLObject var38 = f32439(var32);
        final SubLObject var39 = module0542.f33603(var37, var38, (SubLObject)$ic21$);
        return var39;
    }
    
    public static SubLObject f32436(final SubLObject var32, final SubLObject var1, final SubLObject var33, final SubLObject var34) {
        final SubLObject var35 = (SubLObject)ConsesLow.list((SubLObject)$ic22$, var33, (SubLObject)$ic23$, (SubLObject)$ic24$, (SubLObject)$ic25$, (SubLObject)ConsesLow.list(var1), (SubLObject)$ic26$, var34);
        return var35;
    }
    
    public static SubLObject f32439(final SubLObject var32) {
        final SubLObject var33 = (SubLObject)ConsesLow.list(new SubLObject[] { $ic27$, NIL, $ic28$, ONE_INTEGER, $ic29$, ConsesLow.list((SubLObject)$ic30$, reader.bq_cons(var32, (SubLObject)$ic31$)), $ic32$, $ic33$, $ic34$, NIL });
        return var33;
    }
    
    public static SubLObject f32428(final SubLObject var1, final SubLObject var6) {
        return module0067.f4886($g3827$.getGlobalValue(), var1, var6);
    }
    
    public static SubLObject f32430(final SubLObject var1) {
        return module0067.f4887($g3827$.getGlobalValue(), var1);
    }
    
    public static SubLObject f32440(final SubLObject var1) {
        return module0067.f4884($g3827$.getGlobalValue(), var1, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f32433(final SubLObject var1) {
        final SubLObject var2 = f32440(var1);
        if (NIL != var2) {
            return module0340.f22825(var2);
        }
        final SubLObject var3 = module0232.f15308(module0178.f11282(var1)).first();
        final SubLObject var4 = module0205.f13333(var3);
        final SubLObject var5 = (SubLObject)$ic5$;
        final SubLObject var6 = Sequences.cconcatenate(module0038.f2638(var4), $g3825$.getGlobalValue());
        return module0435.f30626(var6, var5);
    }
    
    public static SubLObject f32441() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0508", "f32426", "S#25960", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0508", "f32429", "S#25961", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0508", "f32431", "S#35852", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0508", "f32432", "S#35853", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0508", "f32427", "S#35854", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0508", "f32434", "S#35855", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0508", "f32435", "S#35856", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0508", "f32437", "S#31685", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0508", "f32438", "S#35857", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0508", "f32436", "S#35858", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0508", "f32439", "S#31686", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0508", "f32428", "S#35859", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0508", "f32430", "S#35860", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0508", "f32440", "S#35861", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0508", "f32433", "S#35862", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32442() {
        $g3824$ = SubLFiles.defvar("*KNOWN-ANTECEDENT-RULE-ENABLED?*", (SubLObject)NIL);
        $g3825$ = SubLFiles.deflexical("S#35863", (SubLObject)$ic1$);
        $g3826$ = SubLFiles.defparameter("S#35864", (SubLObject)NIL);
        $g3827$ = SubLFiles.deflexical("S#35865", (NIL != Symbols.boundp((SubLObject)$ic35$)) ? $g3827$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32443() {
        module0003.f57((SubLObject)$ic35$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f32441();
    }
    
    public void initializeVariables() {
        f32442();
    }
    
    public void runTopLevelForms() {
        f32443();
    }
    
    static {
        me = (SubLFile)new module0508();
        $g3824$ = null;
        $g3825$ = null;
        $g3826$ = null;
        $g3827$ = null;
        $ic0$ = makeString("#$knownAntecedentRule support is disabled.  Asserting #$knownAntecedentRule on ~s will have no effect.~%");
        $ic1$ = makeString("-via-known-antecedent-rule");
        $ic2$ = makeSymbol("S#12732", "CYC");
        $ic3$ = makeString("#$knownAntecedentRule currently only applies to rules with exactly one poslit, but was applied to ~s");
        $ic4$ = makeString("#$knownAntecedentRule cannot handle poslits with sequence variables, but was applied to ~s");
        $ic5$ = makeKeyword("POS");
        $ic6$ = makeKeyword("SENSE");
        $ic7$ = makeKeyword("DIRECTION");
        $ic8$ = makeString("#$knownAntecedentRule currently only applies to rules with a fort as the predicate of their single pos-lit, but was applied to ~s");
        $ic9$ = makeKeyword("PREDICATE");
        $ic10$ = makeKeyword("ARITY");
        $ic11$ = makeKeyword("REQUIRED-MT");
        $ic12$ = makeKeyword("UNIFY");
        $ic13$ = makeKeyword("REQUIRED-PATTERN");
        $ic14$ = makeKeyword("CALL");
        $ic15$ = makeSymbol("S#35856", "CYC");
        $ic16$ = makeKeyword("INPUT");
        $ic17$ = makeKeyword("COST-PATTERN");
        $ic18$ = makeSymbol("S#35857", "CYC");
        $ic19$ = makeKeyword("NOT");
        $ic20$ = makeKeyword("OUTPUT-GENERATE-PATTERN");
        $ic21$ = makeSymbol("DESTROY-INFERENCE");
        $ic22$ = makeKeyword("PROBLEM-STORE");
        $ic23$ = makeKeyword("RESULT-UNIQUENESS");
        $ic24$ = makeKeyword("PROOF");
        $ic25$ = makeKeyword("ALLOWED-RULES");
        $ic26$ = makeKeyword("ALLOWED-MODULES");
        $ic27$ = makeKeyword("CONTINUABLE?");
        $ic28$ = makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $ic29$ = makeKeyword("RETURN");
        $ic30$ = makeKeyword("TEMPLATE");
        $ic31$ = ConsesLow.list((SubLObject)makeKeyword("SUPPORTS"));
        $ic32$ = makeKeyword("ANSWER-LANGUAGE");
        $ic33$ = makeKeyword("HL");
        $ic34$ = makeKeyword("CACHE-INFERENCE-RESULTS?");
        $ic35$ = makeSymbol("S#35865", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 148 ms
	
	Decompiled with Procyon 0.5.32.
*/