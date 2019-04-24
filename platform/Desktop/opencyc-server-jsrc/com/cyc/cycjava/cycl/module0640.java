package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Tcp;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0640 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0640";
    public static final String myFingerPrint = "26c4cddf8d1d51b62adbb0311a8fc83feca7d99eea74f0cff54300e68388a552";
    public static SubLSymbol $g4956$;
    public static SubLSymbol $g4957$;
    public static SubLSymbol $g4958$;
    public static SubLSymbol $g4959$;
    private static SubLSymbol $g4960$;
    private static final SubLString $ic0$;
    private static final SubLInteger $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLString $ic4$;
    private static final SubLString $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLString $ic9$;
    private static final SubLString $ic10$;
    private static final SubLString $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLString $ic13$;
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
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLString $ic33$;
    
    public static SubLObject f38974() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = (SubLObject)ConsesLow.list((SubLObject)module0640.$ic3$, module0018.f967(), module0110.$g1378$.getDynamicValue(var1));
        module0640.$g4958$.setGlobalValue((SubLObject)module0640.NIL);
        module0640.$g4958$.setGlobalValue(Tcp.open_tcp_stream(module0640.$g4956$.getGlobalValue(), module0640.$g4957$.getGlobalValue()));
        f38975(var2);
        module0640.$g4959$.setGlobalValue(Packages.intern(Sequences.cconcatenate((SubLObject)module0640.$ic4$, module0018.f967()), (SubLObject)module0640.UNPROVIDED));
        f38976();
        return (SubLObject)module0640.NIL;
    }
    
    public static SubLObject f38975(final SubLObject var2) {
        module0021.f1038(var2, module0640.$g4958$.getGlobalValue());
        streams_high.force_output(module0640.$g4958$.getGlobalValue());
        return (SubLObject)module0640.NIL;
    }
    
    public static SubLObject f38976() {
        if (module0640.NIL != module0640.$g4960$.getGlobalValue()) {
            f38977();
        }
        module0640.$g4960$.setGlobalValue(Threads.make_process((SubLObject)module0640.$ic5$, Symbols.symbol_function((SubLObject)module0640.$ic6$)));
        return (SubLObject)module0640.NIL;
    }
    
    public static SubLObject f38977() {
        if (module0640.NIL != module0640.$g4960$.getGlobalValue()) {
            Threads.kill_process(module0640.$g4960$.getGlobalValue());
            module0640.$g4960$.setGlobalValue((SubLObject)module0640.NIL);
        }
        return (SubLObject)module0640.NIL;
    }
    
    public static SubLObject f38978() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        SubLObject var2 = (SubLObject)module0640.NIL;
        SubLObject var3 = (SubLObject)module0640.NIL;
        try {
            var1.throwStack.push(module0640.$ic7$);
            final SubLObject var4 = Errors.$error_handler$.currentBinding(var1);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0640.$ic8$), var1);
                try {
                    try {
                        while (true) {
                            var2 = module0021.f1060(module0640.$g4958$.getGlobalValue(), (SubLObject)module0640.NIL, (SubLObject)module0640.UNPROVIDED);
                            module0112.f7744((SubLObject)module0640.$ic9$, var2, (SubLObject)module0640.UNPROVIDED, (SubLObject)module0640.UNPROVIDED);
                            PrintLow.format((SubLObject)module0640.NIL, (SubLObject)module0640.$ic10$, var2);
                        }
                    }
                    finally {
                        final SubLObject var5_6 = Threads.$is_thread_performing_cleanupP$.currentBinding(var1);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0640.T, var1);
                            f38977();
                            PrintLow.format((SubLObject)module0640.NIL, (SubLObject)module0640.$ic11$);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var5_6, var1);
                        }
                    }
                }
                catch (Throwable t) {}
            }
            finally {
                Errors.$error_handler$.rebind(var4, var1);
            }
        }
        catch (Throwable var5) {
            var3 = Errors.handleThrowable(var5, (SubLObject)module0640.$ic7$);
        }
        finally {
            var1.throwStack.pop();
        }
        return (SubLObject)module0640.NIL;
    }
    
    public static SubLObject f38979(final SubLObject var9) {
        assert module0640.NIL != Types.listp(var9) : var9;
        SubLObject var10 = (SubLObject)module0640.NIL;
        SubLObject var11 = (SubLObject)module0640.NIL;
        SubLObject var12 = (SubLObject)module0640.NIL;
        SubLObject var13 = (SubLObject)module0640.NIL;
        SubLObject var14 = (SubLObject)module0640.NIL;
        var14 = Packages.intern(Sequences.cconcatenate((SubLObject)module0640.$ic13$, module0018.f967()), (SubLObject)module0640.UNPROVIDED);
        var12 = (SubLObject)ConsesLow.list(new SubLObject[] { module0640.$ic14$, module0640.$ic15$, ConsesLow.list((SubLObject)module0640.$ic16$, (SubLObject)module0640.$ic17$, var14), module0640.$ic18$, ConsesLow.list((SubLObject)module0640.$ic19$, (SubLObject)ConsesLow.list((SubLObject)module0640.$ic16$, (SubLObject)module0640.$ic17$, var14)), module0640.$ic20$, var9, module0640.$ic21$, module0640.$ic22$, module0640.$ic23$, module0640.$ic24$, module0640.$ic25$, module0640.$ic26$ });
        var11 = module0639.f38965(var12);
        var10 = (SubLObject)ConsesLow.list(new SubLObject[] { module0640.$ic27$, module0640.$ic28$, var14, module0640.$ic29$, var14, module0640.$ic30$, Time.get_universal_time(), module0640.$ic31$, module0640.$ic32$ });
        PrintLow.format((SubLObject)module0640.NIL, (SubLObject)module0640.$ic33$, var10);
        var13 = module0639.f38960(var10, var11);
        f38975(var13);
        return (SubLObject)module0640.NIL;
    }
    
    public static SubLObject f38980() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0640", "f38974", "S#42703", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0640", "f38975", "S#42704", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0640", "f38976", "S#42705", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0640", "f38977", "S#42706", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0640", "f38978", "S#42707", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0640", "f38979", "S#42708", 1, 0, false);
        return (SubLObject)module0640.NIL;
    }
    
    public static SubLObject f38981() {
        module0640.$g4956$ = SubLFiles.deflexical("S#42709", (SubLObject)module0640.$ic0$);
        module0640.$g4957$ = SubLFiles.deflexical("S#42710", (SubLObject)module0640.$ic1$);
        module0640.$g4958$ = SubLFiles.deflexical("S#42711", (SubLObject)module0640.NIL);
        module0640.$g4959$ = SubLFiles.deflexical("S#42712", (SubLObject)module0640.NIL);
        module0640.$g4960$ = SubLFiles.deflexical("S#42713", (SubLObject)((module0640.NIL != Symbols.boundp((SubLObject)module0640.$ic2$)) ? module0640.$g4960$.getGlobalValue() : module0640.NIL));
        return (SubLObject)module0640.NIL;
    }
    
    public static SubLObject f38982() {
        module0003.f57((SubLObject)module0640.$ic2$);
        return (SubLObject)module0640.NIL;
    }
    
    public void declareFunctions() {
        f38980();
    }
    
    public void initializeVariables() {
        f38981();
    }
    
    public void runTopLevelForms() {
        f38982();
    }
    
    static {
        me = (SubLFile)new module0640();
        module0640.$g4956$ = null;
        module0640.$g4957$ = null;
        module0640.$g4958$ = null;
        module0640.$g4959$ = null;
        module0640.$g4960$ = null;
        $ic0$ = SubLObjectFactory.makeString("localhost");
        $ic1$ = SubLObjectFactory.makeInteger(4444);
        $ic2$ = SubLObjectFactory.makeSymbol("S#42713", "CYC");
        $ic3$ = SubLObjectFactory.makeSymbol("S#42714", "CYC");
        $ic4$ = SubLObjectFactory.makeString("cyc-api-service-");
        $ic5$ = SubLObjectFactory.makeString("Agent received-message handler");
        $ic6$ = SubLObjectFactory.makeSymbol("S#42707", "CYC");
        $ic7$ = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $ic8$ = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic9$ = SubLObjectFactory.makeString("fipa-transport-message");
        $ic10$ = SubLObjectFactory.makeString("~%Received fipa-transport-message~%~S");
        $ic11$ = SubLObjectFactory.makeString("Agent received-message handler process ended");
        $ic12$ = SubLObjectFactory.makeSymbol("LISTP");
        $ic13$ = SubLObjectFactory.makeString("cyc-echo-");
        $ic14$ = SubLObjectFactory.makeSymbol("S#42715", "CYC");
        $ic15$ = SubLObjectFactory.makeKeyword("SENDER");
        $ic16$ = SubLObjectFactory.makeSymbol("S#42716", "CYC");
        $ic17$ = SubLObjectFactory.makeKeyword("NAME");
        $ic18$ = SubLObjectFactory.makeKeyword("RECEIVER");
        $ic19$ = SubLObjectFactory.makeSymbol("SET");
        $ic20$ = SubLObjectFactory.makeKeyword("CONTENT");
        $ic21$ = SubLObjectFactory.makeKeyword("LANGUAGE");
        $ic22$ = SubLObjectFactory.makeKeyword("CYCL");
        $ic23$ = SubLObjectFactory.makeKeyword("ONTOLOGY");
        $ic24$ = SubLObjectFactory.makeKeyword("CYC-API-SERVICE-ECHO");
        $ic25$ = SubLObjectFactory.makeKeyword("PROTOCOL");
        $ic26$ = SubLObjectFactory.makeKeyword("FIPA-INFORM");
        $ic27$ = SubLObjectFactory.makeSymbol("S#42693", "CYC");
        $ic28$ = SubLObjectFactory.makeKeyword("TO");
        $ic29$ = SubLObjectFactory.makeKeyword("FROM");
        $ic30$ = SubLObjectFactory.makeKeyword("DATE");
        $ic31$ = SubLObjectFactory.makeKeyword("X-AGENT-COMMUNITY");
        $ic32$ = SubLObjectFactory.makeKeyword("COABS");
        $ic33$ = SubLObjectFactory.makeString("~%envelope~%~S");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0640.class
	Total time: 74 ms
	
	Decompiled with Procyon 0.5.32.
*/