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
        return Sequences.delete((SubLObject)module0127.NIL, Mapping.mapcar(Symbols.symbol_function((SubLObject)module0127.$ic2$), module0127.$g1498$.getGlobalValue()), (SubLObject)module0127.UNPROVIDED, (SubLObject)module0127.UNPROVIDED, (SubLObject)module0127.UNPROVIDED, (SubLObject)module0127.UNPROVIDED, (SubLObject)module0127.UNPROVIDED);
    }
    
    public static SubLObject f8414(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0127.NIL != constant_handles_oc.f8449(var1) && module0127.NIL != conses_high.member(constants_high_oc.f10743(var1), module0127.$g1498$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0127.EQUAL), (SubLObject)module0127.UNPROVIDED));
    }
    
    public static SubLObject f8415() {
        return Sequences.delete((SubLObject)module0127.NIL, Mapping.mapcar(Symbols.symbol_function((SubLObject)module0127.$ic2$), module0127.$g1499$.getGlobalValue()), (SubLObject)module0127.UNPROVIDED, (SubLObject)module0127.UNPROVIDED, (SubLObject)module0127.UNPROVIDED, (SubLObject)module0127.UNPROVIDED, (SubLObject)module0127.UNPROVIDED);
    }
    
    public static SubLObject f8416() {
        if (module0127.ZERO_INTEGER.numE(constant_handles_oc.f8433())) {
            module0127.$g1498$.setGlobalValue((SubLObject)module0127.NIL);
            SubLObject var2 = constant_handles_oc.f8469();
            SubLObject var3 = (SubLObject)module0127.NIL;
            var3 = var2.first();
            while (module0127.NIL != var2) {
                module0127.$g1498$.setGlobalValue((SubLObject)ConsesLow.cons(var3, module0127.$g1498$.getGlobalValue()));
                var2 = var2.rest();
                var3 = var2.first();
            }
            module0127.$g1498$.setGlobalValue(Sort.sort(module0127.$g1498$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0127.$ic3$), (SubLObject)module0127.UNPROVIDED));
        }
        return Sequences.length(module0127.$g1498$.getGlobalValue());
    }
    
    public static SubLObject f8417() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        if (module0127.NIL != module0127.$g1498$.getGlobalValue()) {
            final SubLObject var5 = (SubLObject)module0127.$ic4$;
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
                module0012.$g67$.bind((SubLObject)module0127.ONE_INTEGER, var4);
                module0012.$g68$.bind((SubLObject)module0127.ZERO_INTEGER, var4);
                module0012.$g66$.bind((SubLObject)module0127.ZERO_INTEGER, var4);
                module0012.$g69$.bind((SubLObject)module0127.ZERO_INTEGER, var4);
                module0012.$g70$.bind((SubLObject)module0127.T, var4);
                module0012.$silent_progressP$.bind((SubLObject)((module0127.NIL != var5) ? module0012.$silent_progressP$.getDynamicValue(var4) : module0127.T), var4);
                module0012.f474(var5);
                module0127.$g1499$.setGlobalValue((SubLObject)module0127.NIL);
                SubLObject var14 = module0127.$g1498$.getGlobalValue();
                SubLObject var15 = (SubLObject)module0127.NIL;
                var15 = var14.first();
                while (module0127.NIL != var14) {
                    final SubLObject var16 = constants_high_oc.f10737(var15);
                    if (module0127.NIL != constants_high_oc.f10755(var16)) {
                        module0127.$g1499$.setGlobalValue((SubLObject)ConsesLow.cons(var15, module0127.$g1499$.getGlobalValue()));
                    }
                    var14 = var14.rest();
                    var15 = var14.first();
                }
                module0127.$g1499$.setGlobalValue(Sort.sort(module0127.$g1499$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0127.$ic3$), (SubLObject)module0127.UNPROVIDED));
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
        return Sequences.length(module0127.$g1499$.getGlobalValue());
    }
    
    public static SubLObject f8418() {
        final SubLObject var15 = f8419();
        if (module0127.NIL != var15) {
            PrintLow.format((SubLObject)module0127.T, (SubLObject)module0127.$ic5$, Sequences.length(var15));
            SubLObject var16 = var15;
            SubLObject var17 = (SubLObject)module0127.NIL;
            var17 = var16.first();
            while (module0127.NIL != var16) {
                PrintLow.format((SubLObject)module0127.T, (SubLObject)module0127.$ic6$, var17);
                var16 = var16.rest();
                var17 = var16.first();
            }
            PrintLow.format((SubLObject)module0127.T, (SubLObject)module0127.$ic7$);
        }
        else {
            PrintLow.format((SubLObject)module0127.T, (SubLObject)module0127.$ic8$);
        }
        streams_high.force_output((SubLObject)module0127.T);
        return (SubLObject)module0127.NIL;
    }
    
    public static SubLObject f8419() {
        SubLObject var17 = (SubLObject)module0127.NIL;
        SubLObject var18 = constant_handles_oc.f8469();
        SubLObject var19 = (SubLObject)module0127.NIL;
        var19 = var18.first();
        while (module0127.NIL != var18) {
            if (var19.isString()) {
                final SubLObject var20 = constants_high_oc.f10737(var19);
                if (module0127.NIL == var20 || module0127.NIL != constants_high_oc.f10755(var20)) {
                    var17 = (SubLObject)ConsesLow.cons(var19, var17);
                }
            }
            var18 = var18.rest();
            var19 = var18.first();
        }
        var17 = Sort.sort(var17, Symbols.symbol_function((SubLObject)module0127.$ic3$), (SubLObject)module0127.UNPROVIDED);
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
        return (SubLObject)module0127.NIL;
    }
    
    public static SubLObject f8421() {
        module0127.$g1498$ = SubLFiles.deflexical("S#10515", (SubLObject)((module0127.NIL != Symbols.boundp((SubLObject)module0127.$ic0$)) ? module0127.$g1498$.getGlobalValue() : module0127.NIL));
        module0127.$g1499$ = SubLFiles.deflexical("S#10516", (SubLObject)((module0127.NIL != Symbols.boundp((SubLObject)module0127.$ic1$)) ? module0127.$g1499$.getGlobalValue() : module0127.NIL));
        return (SubLObject)module0127.NIL;
    }
    
    public static SubLObject f8422() {
        module0003.f57((SubLObject)module0127.$ic0$);
        module0003.f57((SubLObject)module0127.$ic1$);
        return (SubLObject)module0127.NIL;
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
        module0127.$g1498$ = null;
        module0127.$g1499$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#10515", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#10516", "CYC");
        $ic2$ = SubLObjectFactory.makeSymbol("FIND-CONSTANT");
        $ic3$ = SubLObjectFactory.makeSymbol("STRING<");
        $ic4$ = SubLObjectFactory.makeString("Computing bogus constant names in code...");
        $ic5$ = SubLObjectFactory.makeString("The following ~A constants are mentioned in code but missing in the KB:~%");
        $ic6$ = SubLObjectFactory.makeString(" ~A~%");
        $ic7$ = SubLObjectFactory.makeString("~%");
        $ic8$ = SubLObjectFactory.makeString("All constants mentioned in code are good in the KB.~%");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0127.class
	Total time: 63 ms
	
	Decompiled with Procyon 0.5.32.
*/