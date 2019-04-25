package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0127 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0127";
    public static final String myFingerPrint = "343128ffb056501532eaf0603c93caaa87c35b6ed0609776269ce07df9232973";
    private static SubLSymbol $g1498$;
    private static SubLSymbol $g1499$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLString $ic4$;
    private static final SubLString $ic5$;
    private static final SubLString $ic6$;
    private static final SubLString $ic7$;
    private static final SubLString $ic8$;
    
    public static SubLObject f8413() {
        return Sequences.delete((SubLObject)NIL, Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic2$), $g1498$.getGlobalValue()), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f8414(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != constant_handles_oc.f8449(var1) && NIL != conses_high.member(constants_high_oc.f10743(var1), $g1498$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f8415() {
        return Sequences.delete((SubLObject)NIL, Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic2$), $g1499$.getGlobalValue()), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f8416() {
        if (ZERO_INTEGER.numE(constant_handles_oc.f8433())) {
            $g1498$.setGlobalValue((SubLObject)NIL);
            SubLObject var2 = constant_handles_oc.f8469();
            SubLObject var3 = (SubLObject)NIL;
            var3 = var2.first();
            while (NIL != var2) {
                $g1498$.setGlobalValue((SubLObject)ConsesLow.cons(var3, $g1498$.getGlobalValue()));
                var2 = var2.rest();
                var3 = var2.first();
            }
            $g1498$.setGlobalValue(Sort.sort($g1498$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic3$), (SubLObject)UNPROVIDED));
        }
        return Sequences.length($g1498$.getGlobalValue());
    }
    
    public static SubLObject f8417() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        if (NIL != $g1498$.getGlobalValue()) {
            final SubLObject var5 = (SubLObject)$ic4$;
            final SubLObject var6 = module0012.$g73$.currentBinding(var4);
            final SubLObject var7 = module0012.$g65$.currentBinding(var4);
            final SubLObject var8 = module0012.$g67$.currentBinding(var4);
            final SubLObject var9 = module0012.$g68$.currentBinding(var4);
            final SubLObject var10 = module0012.$g66$.currentBinding(var4);
            final SubLObject var11 = module0012.$g69$.currentBinding(var4);
            final SubLObject var12 = module0012.$g70$.currentBinding(var4);
            final SubLObject var13 = module0012.$silent_progressP$.currentBinding(var4);
            try {
                module0012.$g73$.bind(Time.get_universal_time(), var4);
                module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var4), var4);
                module0012.$g67$.bind((SubLObject)ONE_INTEGER, var4);
                module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var4);
                module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var4);
                module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var4);
                module0012.$g70$.bind((SubLObject)T, var4);
                module0012.$silent_progressP$.bind((SubLObject)((NIL != var5) ? module0012.$silent_progressP$.getDynamicValue(var4) : T), var4);
                module0012.f474(var5);
                $g1499$.setGlobalValue((SubLObject)NIL);
                SubLObject var14 = $g1498$.getGlobalValue();
                SubLObject var15 = (SubLObject)NIL;
                var15 = var14.first();
                while (NIL != var14) {
                    final SubLObject var16 = constants_high_oc.f10737(var15);
                    if (NIL != constants_high_oc.f10755(var16)) {
                        $g1499$.setGlobalValue((SubLObject)ConsesLow.cons(var15, $g1499$.getGlobalValue()));
                    }
                    var14 = var14.rest();
                    var15 = var14.first();
                }
                $g1499$.setGlobalValue(Sort.sort($g1499$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic3$), (SubLObject)UNPROVIDED));
                module0012.f475();
            }
            finally {
                module0012.$silent_progressP$.rebind(var13, var4);
                module0012.$g70$.rebind(var12, var4);
                module0012.$g69$.rebind(var11, var4);
                module0012.$g66$.rebind(var10, var4);
                module0012.$g68$.rebind(var9, var4);
                module0012.$g67$.rebind(var8, var4);
                module0012.$g65$.rebind(var7, var4);
                module0012.$g73$.rebind(var6, var4);
            }
        }
        return Sequences.length($g1499$.getGlobalValue());
    }
    
    public static SubLObject f8418() {
        final SubLObject var15 = f8419();
        if (NIL != var15) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic5$, Sequences.length(var15));
            SubLObject var16 = var15;
            SubLObject var17 = (SubLObject)NIL;
            var17 = var16.first();
            while (NIL != var16) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic6$, var17);
                var16 = var16.rest();
                var17 = var16.first();
            }
            PrintLow.format((SubLObject)T, (SubLObject)$ic7$);
        }
        else {
            PrintLow.format((SubLObject)T, (SubLObject)$ic8$);
        }
        streams_high.force_output((SubLObject)T);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8419() {
        SubLObject var17 = (SubLObject)NIL;
        SubLObject var18 = constant_handles_oc.f8469();
        SubLObject var19 = (SubLObject)NIL;
        var19 = var18.first();
        while (NIL != var18) {
            if (var19.isString()) {
                final SubLObject var20 = constants_high_oc.f10737(var19);
                if (NIL == var20 || NIL != constants_high_oc.f10755(var20)) {
                    var17 = (SubLObject)ConsesLow.cons(var19, var17);
                }
            }
            var18 = var18.rest();
            var19 = var18.first();
        }
        var17 = Sort.sort(var17, Symbols.symbol_function((SubLObject)$ic3$), (SubLObject)UNPROVIDED);
        return var17;
    }
    
    public static SubLObject f8420() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0127", "f8413", "S#10508", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0127", "f8414", "S#10509", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0127", "f8415", "S#10510", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0127", "f8416", "S#10511", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0127", "f8417", "S#10512", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0127", "f8418", "S#10513", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0127", "f8419", "S#10514", 0, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8421() {
        $g1498$ = SubLFiles.deflexical("S#10515", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic0$)) ? $g1498$.getGlobalValue() : NIL));
        $g1499$ = SubLFiles.deflexical("S#10516", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic1$)) ? $g1499$.getGlobalValue() : NIL));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8422() {
        module0003.f57((SubLObject)$ic0$);
        module0003.f57((SubLObject)$ic1$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f8420();
    }
    
    public void initializeVariables() {
        f8421();
    }
    
    public void runTopLevelForms() {
        f8422();
    }
    
    static {
        me = (SubLFile)new module0127();
        $g1498$ = null;
        $g1499$ = null;
        $ic0$ = makeSymbol("S#10515", "CYC");
        $ic1$ = makeSymbol("S#10516", "CYC");
        $ic2$ = makeSymbol("FIND-CONSTANT");
        $ic3$ = makeSymbol("STRING<");
        $ic4$ = makeString("Computing bogus constant names in code...");
        $ic5$ = makeString("The following ~A constants are mentioned in code but missing in the KB:~%");
        $ic6$ = makeString(" ~A~%");
        $ic7$ = makeString("~%");
        $ic8$ = makeString("All constants mentioned in code are good in the KB.~%");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 63 ms
	
	Decompiled with Procyon 0.5.32.
*/