package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0752 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0752";
    public static final String myFingerPrint = "f778704819ecaa26ca8cc85a4fb55269ba288e57b2a78856f32c6a34765a63af";
    private static SubLSymbol $g6057$;
    private static SubLSymbol $g6058$;
    private static SubLSymbol $g6059$;
    private static SubLSymbol $g6060$;
    private static final SubLString $ic0$;
    private static final SubLString $ic1$;
    private static final SubLString $ic2$;
    private static final SubLString $ic3$;
    private static final SubLInteger $ic4$;
    private static final SubLList $ic5$;
    
    public static SubLObject f47234(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        var2.resetMultipleValues();
        final SubLObject var3 = f47235(var1);
        final SubLObject var4 = var2.secondMultipleValue();
        final SubLObject var5 = var2.thirdMultipleValue();
        var2.resetMultipleValues();
        SubLObject var6 = conses_high.copy_list(var5);
        SubLObject var7 = (SubLObject)module0752.NIL;
        if (module0752.NIL != var3) {
            final SubLObject var8 = var3.first().rest().first();
            final SubLObject var9 = Sequences.cconcatenate((SubLObject)module0752.$ic0$, new SubLObject[] { module0006.f207(var8), module0752.$ic1$ });
            var6 = (SubLObject)ConsesLow.cons(var9, Sequences.subseq(var6, module0048.f_1_(var4), (SubLObject)module0752.UNPROVIDED));
        }
        final SubLObject var10 = f47236();
        SubLObject var11 = (SubLObject)module0752.NIL;
        try {
            var11 = streams_high.make_private_string_output_stream();
            PrintLow.format(var11, (SubLObject)module0752.$ic2$, var10);
            SubLObject var12 = Sequences.nreverse(var6);
            SubLObject var13 = (SubLObject)module0752.NIL;
            var13 = var12.first();
            while (module0752.NIL != var12) {
                PrintLow.format(var11, (SubLObject)module0752.$ic3$, var13);
                var12 = var12.rest();
                var13 = var12.first();
            }
            var7 = streams_high.get_output_stream_string(var11);
        }
        finally {
            final SubLObject var14 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0752.T, var2);
                streams_high.close(var11, (SubLObject)module0752.UNPROVIDED);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var14, var2);
            }
        }
        if (module0752.NIL == module0035.f1995(var5, var4, (SubLObject)module0752.UNPROVIDED)) {
            f47237(var5, var10);
        }
        f47238(var10);
        SubLObject var12 = var3;
        SubLObject var15 = (SubLObject)module0752.NIL;
        var15 = var12.first();
        while (module0752.NIL != var12) {
            SubLObject var12_15 = var15.rest();
            SubLObject var16 = (SubLObject)module0752.NIL;
            var16 = var12_15.first();
            while (module0752.NIL != var12_15) {
                f47238(var16);
                var12_15 = var12_15.rest();
                var16 = var12_15.first();
            }
            var12 = var12.rest();
            var15 = var12.first();
        }
        return var7;
    }
    
    public static SubLObject f47239(final SubLObject var17) {
        return Sequences.nreverse(module0038.f2738(var17, (SubLObject)module0752.$ic5$, (SubLObject)module0752.UNPROVIDED, (SubLObject)module0752.UNPROVIDED, (SubLObject)module0752.UNPROVIDED, (SubLObject)module0752.UNPROVIDED, (SubLObject)module0752.UNPROVIDED));
    }
    
    public static SubLObject f47240(final SubLObject var17, final SubLObject var10) {
        final SubLObject var18 = f47239(var17);
        return f47237(var18, var10);
    }
    
    public static SubLObject f47237(final SubLObject var5, final SubLObject var10) {
        module0087.f5968(module0752.$g6058$.getGlobalValue(), var5, var10);
        return var10;
    }
    
    public static SubLObject f47236() {
        return module0065.f4746(module0752.$g6057$.getGlobalValue());
    }
    
    public static SubLObject f47241(final SubLObject var10) {
        module0087.f5970(module0752.$g6058$.getGlobalValue(), module0065.f4750(module0752.$g6057$.getGlobalValue(), var10, (SubLObject)module0752.UNPROVIDED));
        module0065.f4761(module0752.$g6057$.getGlobalValue(), var10);
        return var10;
    }
    
    public static SubLObject f47238(final SubLObject var10) {
        module0752.$g6059$.setGlobalValue(module0035.f2083(var10, Sequences.delete(var10, conses_high.copy_list(module0752.$g6059$.getGlobalValue()), (SubLObject)module0752.UNPROVIDED, (SubLObject)module0752.UNPROVIDED, (SubLObject)module0752.UNPROVIDED, (SubLObject)module0752.UNPROVIDED, (SubLObject)module0752.UNPROVIDED)));
        if (module0752.NIL != module0035.f2002(module0752.$g6059$.getGlobalValue(), module0752.$g6060$.getGlobalValue(), (SubLObject)module0752.UNPROVIDED)) {
            final SubLObject var11 = module0752.$g6059$.getGlobalValue().first();
            module0752.$g6059$.setGlobalValue(module0752.$g6059$.getGlobalValue().rest());
            f47241(var11);
        }
        return var10;
    }
    
    public static SubLObject f47235(final SubLObject var17) {
        final SubLObject var18 = f47239(var17);
        SubLObject var19 = (SubLObject)module0752.NIL;
        SubLObject var20 = (SubLObject)module0752.ZERO_INTEGER;
        SubLObject var21 = (SubLObject)module0752.NIL;
        if (module0752.NIL == var21) {
            SubLObject var22;
            SubLObject var23;
            SubLObject var24;
            for (var22 = module0048.f_1X(Sequences.length(var18)), var23 = (SubLObject)module0752.NIL, var23 = (SubLObject)module0752.ONE_INTEGER; module0752.NIL == var21 && !var23.numGE(var22); var23 = module0048.f_1X(var23)) {
                var24 = module0087.f5984(module0752.$g6058$.getGlobalValue(), Sequences.subseq(var18, (SubLObject)module0752.ZERO_INTEGER, var23));
                if (module0752.NIL != module0035.f2012(var24)) {
                    var21 = (SubLObject)module0752.T;
                }
                else {
                    var19 = var24;
                    var20 = var23;
                }
            }
        }
        return Values.values(var19, var20, var18);
    }
    
    public static SubLObject f47242() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0752", "f47234", "S#38926", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0752", "f47239", "S#51682", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0752", "f47240", "S#51683", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0752", "f47237", "S#51684", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0752", "f47236", "S#51685", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0752", "f47241", "S#51686", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0752", "f47238", "S#51687", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0752", "f47235", "S#51688", 1, 0, false);
        return (SubLObject)module0752.NIL;
    }
    
    public static SubLObject f47243() {
        module0752.$g6057$ = SubLFiles.deflexical("S#51689", module0065.f4745((SubLObject)module0752.UNPROVIDED, (SubLObject)module0752.UNPROVIDED));
        module0752.$g6058$ = SubLFiles.deflexical("S#51690", module0087.f5954(Symbols.symbol_function((SubLObject)module0752.EQUAL)));
        module0752.$g6059$ = SubLFiles.deflexical("S#51691", (SubLObject)module0752.NIL);
        module0752.$g6060$ = SubLFiles.deflexical("S#51692", (SubLObject)module0752.$ic4$);
        return (SubLObject)module0752.NIL;
    }
    
    public static SubLObject f47244() {
        return (SubLObject)module0752.NIL;
    }
    
    public void declareFunctions() {
        f47242();
    }
    
    public void initializeVariables() {
        f47243();
    }
    
    public void runTopLevelForms() {
        f47244();
    }
    
    static {
        me = (SubLFile)new module0752();
        module0752.$g6057$ = null;
        module0752.$g6058$ = null;
        module0752.$g6059$ = null;
        module0752.$g6060$ = null;
        $ic0$ = SubLObjectFactory.makeString("...See PPH Error [");
        $ic1$ = SubLObjectFactory.makeString("] for remaining lines of error message.");
        $ic2$ = SubLObjectFactory.makeString("PPH Error [~D]:~%");
        $ic3$ = SubLObjectFactory.makeString("~A~%");
        $ic4$ = SubLObjectFactory.makeInteger(500);
        $ic5$ = ConsesLow.list((SubLObject)Characters.CHAR_newline);
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0752.class
	Total time: 89 ms
	
	Decompiled with Procyon 0.5.32.
*/