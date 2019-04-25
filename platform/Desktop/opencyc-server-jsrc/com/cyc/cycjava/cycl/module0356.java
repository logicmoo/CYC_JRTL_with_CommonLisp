package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0356 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0356";
    public static final String myFingerPrint = "df150891dd5d0cfdffae7710426a52b716f7737ee92497148a050dd7440ec36d";
    private static SubLSymbol $g2998$;
    private static SubLSymbol $g2999$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLString $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLString $ic12$;
    private static final SubLSymbol $ic13$;
    
    public static SubLObject f23613(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        if (NIL != f23614((SubLObject)$ic0$)) {
            return f23615((SubLObject)$ic0$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, var1, (SubLObject)$ic5$, var2, (SubLObject)$ic6$, var3));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23616(final SubLObject var4) {
        assert NIL != module0116.f8052(var4) : var4;
        if (module0116.f8053(var4) != $ic0$ && NIL == module0118.f8204(var4)) {
            Errors.error((SubLObject)$ic8$, var4, module0116.f8053(var4), (SubLObject)$ic0$);
        }
        return conses_high.getf(module0116.f8056(var4), (SubLObject)$ic6$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f23617(final SubLObject var4) {
        assert NIL != module0116.f8052(var4) : var4;
        if (module0116.f8053(var4) != $ic0$ && NIL == module0118.f8204(var4)) {
            Errors.error((SubLObject)$ic8$, var4, module0116.f8053(var4), (SubLObject)$ic0$);
        }
        return conses_high.getf(module0116.f8056(var4), (SubLObject)$ic5$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f23618(final SubLObject var4) {
        assert NIL != module0116.f8052(var4) : var4;
        if (module0116.f8053(var4) != $ic0$ && NIL == module0118.f8204(var4)) {
            Errors.error((SubLObject)$ic8$, var4, module0116.f8053(var4), (SubLObject)$ic0$);
        }
        return conses_high.getf(module0116.f8056(var4), (SubLObject)$ic4$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f23619(final SubLObject var1, final SubLObject var2, final SubLObject var5) {
        if (NIL != f23614((SubLObject)$ic2$)) {
            return f23615((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, var1, (SubLObject)$ic5$, var2, (SubLObject)$ic9$, var5));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23620(final SubLObject var4) {
        assert NIL != module0116.f8052(var4) : var4;
        if (module0116.f8053(var4) != $ic2$ && NIL == module0118.f8204(var4)) {
            Errors.error((SubLObject)$ic8$, var4, module0116.f8053(var4), (SubLObject)$ic2$);
        }
        return conses_high.getf(module0116.f8056(var4), (SubLObject)$ic9$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f23621(final SubLObject var4) {
        assert NIL != module0116.f8052(var4) : var4;
        if (module0116.f8053(var4) != $ic2$ && NIL == module0118.f8204(var4)) {
            Errors.error((SubLObject)$ic8$, var4, module0116.f8053(var4), (SubLObject)$ic2$);
        }
        return conses_high.getf(module0116.f8056(var4), (SubLObject)$ic5$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f23622(final SubLObject var4) {
        assert NIL != module0116.f8052(var4) : var4;
        if (module0116.f8053(var4) != $ic2$ && NIL == module0118.f8204(var4)) {
            Errors.error((SubLObject)$ic8$, var4, module0116.f8053(var4), (SubLObject)$ic2$);
        }
        return conses_high.getf(module0116.f8056(var4), (SubLObject)$ic4$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f23623(final SubLObject var1, final SubLObject var2, final SubLObject var6) {
        if (NIL != f23614((SubLObject)$ic10$)) {
            return f23615((SubLObject)$ic10$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, var1, (SubLObject)$ic5$, var2, (SubLObject)$ic11$, var6));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23624(final SubLObject var4) {
        assert NIL != module0116.f8052(var4) : var4;
        if (module0116.f8053(var4) != $ic10$ && NIL == module0118.f8204(var4)) {
            Errors.error((SubLObject)$ic8$, var4, module0116.f8053(var4), (SubLObject)$ic10$);
        }
        return conses_high.getf(module0116.f8056(var4), (SubLObject)$ic11$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f23625(final SubLObject var4) {
        assert NIL != module0116.f8052(var4) : var4;
        if (module0116.f8053(var4) != $ic10$ && NIL == module0118.f8204(var4)) {
            Errors.error((SubLObject)$ic8$, var4, module0116.f8053(var4), (SubLObject)$ic10$);
        }
        return conses_high.getf(module0116.f8056(var4), (SubLObject)$ic5$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f23626(final SubLObject var4) {
        assert NIL != module0116.f8052(var4) : var4;
        if (module0116.f8053(var4) != $ic10$ && NIL == module0118.f8204(var4)) {
            Errors.error((SubLObject)$ic8$, var4, module0116.f8053(var4), (SubLObject)$ic10$);
        }
        return conses_high.getf(module0116.f8056(var4), (SubLObject)$ic4$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f23615(final SubLObject var7, final SubLObject var8) {
        return f23627(f23628(var7, var8));
    }
    
    public static SubLObject f23628(final SubLObject var7, final SubLObject var8) {
        return module0116.f8064(var7, var8, module0018.f967());
    }
    
    public static SubLObject f23627(final SubLObject var9) {
        return module0117.f8161(var9, f23629());
    }
    
    public static SubLObject f23614(final SubLObject var7) {
        return module0117.f8152(var7, f23629());
    }
    
    public static SubLObject f23629() {
        return module0117.f8146();
    }
    
    public static SubLObject f23630() {
        return module0118.f8175((SubLObject)$ic13$);
    }
    
    public static SubLObject f23631() {
        if (NIL == f23630()) {
            f23632();
        }
        return module0118.f8177();
    }
    
    public static SubLObject f23633(final SubLObject var10) {
        final SubLObject var11 = $g2998$.getGlobalValue();
        SubLObject var12 = (SubLObject)NIL;
        try {
            var12 = Locks.seize_lock(var11);
            if (NIL == Sequences.find(var10, $g2999$.getGlobalValue(), (SubLObject)EQUALP, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                $g2999$.setGlobalValue((SubLObject)ConsesLow.cons(var10, $g2999$.getGlobalValue()));
                if (NIL != f23630()) {
                    module0117.f8156(var10, (SubLObject)NIL);
                }
            }
        }
        finally {
            if (NIL != var12) {
                Locks.release_lock(var11);
            }
        }
        return var10;
    }
    
    public static SubLObject f23634(final SubLObject var13) {
        final SubLObject var14 = $g2998$.getGlobalValue();
        SubLObject var15 = (SubLObject)NIL;
        try {
            var15 = Locks.seize_lock(var14);
            $g2999$.setGlobalValue(Sequences.remove(var13, $g2999$.getGlobalValue(), (SubLObject)EQUALP, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            if (NIL != f23630()) {
                module0117.f8158(var13, (SubLObject)NIL);
            }
        }
        finally {
            if (NIL != var15) {
                Locks.release_lock(var14);
            }
        }
        return var13;
    }
    
    public static SubLObject f23635() {
        return module0118.f8181((SubLObject)$ic13$);
    }
    
    public static SubLObject f23632() {
        return module0118.f8178((SubLObject)$ic13$);
    }
    
    public static SubLObject f23636() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0356", "f23613", "S#26291", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0356", "f23616", "S#26292", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0356", "f23617", "S#26293", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0356", "f23618", "S#26294", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0356", "f23619", "S#26295", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0356", "f23620", "S#26296", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0356", "f23621", "S#26297", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0356", "f23622", "S#26298", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0356", "f23623", "S#26299", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0356", "f23624", "S#26300", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0356", "f23625", "S#26301", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0356", "f23626", "S#26302", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0356", "f23615", "S#26303", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0356", "f23628", "S#26304", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0356", "f23627", "S#26305", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0356", "f23614", "S#26306", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0356", "f23629", "S#26307", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0356", "f23630", "S#26308", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0356", "f23631", "S#26309", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0356", "f23633", "S#26310", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0356", "f23634", "S#26311", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0356", "f23635", "S#26312", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0356", "f23632", "S#26313", 0, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23637() {
        $g2998$ = SubLFiles.deflexical("S#26314", Locks.make_lock((SubLObject)$ic12$));
        $g2999$ = SubLFiles.deflexical("S#26315", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic13$)) ? $g2999$.getGlobalValue() : NIL));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23638() {
        module0116.f8043((SubLObject)$ic0$, (SubLObject)$ic1$, (SubLObject)NIL);
        module0355.f23601((SubLObject)$ic0$, (SubLObject)NIL);
        module0116.f8043((SubLObject)$ic2$, (SubLObject)$ic1$, (SubLObject)NIL);
        module0355.f23601((SubLObject)$ic2$, (SubLObject)$ic3$);
        module0003.f57((SubLObject)$ic13$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f23636();
    }
    
    public void initializeVariables() {
        f23637();
    }
    
    public void runTopLevelForms() {
        f23638();
    }
    
    static {
        me = (SubLFile)new module0356();
        $g2998$ = null;
        $g2999$ = null;
        $ic0$ = makeKeyword("INFERENCE-NEW-ANSWER");
        $ic1$ = makeKeyword("INFERENCE-EVENT");
        $ic2$ = makeKeyword("INFERENCE-STATUS-CHANGE");
        $ic3$ = ConsesLow.list((SubLObject)makeKeyword("PROPERTY-CHANGE"));
        $ic4$ = makeKeyword("PROBLEM-STORE-ID");
        $ic5$ = makeKeyword("INFERENCE-ID");
        $ic6$ = makeKeyword("NEW-ANSWER-ID");
        $ic7$ = makeSymbol("S#10059", "CYC");
        $ic8$ = makeString("Event ~S is of type ~S, not ~S.");
        $ic9$ = makeKeyword("NEW-STATUS");
        $ic10$ = makeKeyword("INFERENCE-NEW-TRANSFORMATION-DEPTH-REACHED");
        $ic11$ = makeKeyword("NEW-DEPTH");
        $ic12$ = makeString("INFERENCE-EVENT-DISPATCHER Lock");
        $ic13$ = makeSymbol("S#26315", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 74 ms
	
	Decompiled with Procyon 0.5.32.
*/