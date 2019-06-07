package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        final SubLObject var2 = (SubLObject)ConsesLow.list((SubLObject)$ic3$, module0018.f967(), module0110.$g1378$.getDynamicValue(var1));
        $g4958$.setGlobalValue((SubLObject)NIL);
        $g4958$.setGlobalValue(Tcp.open_tcp_stream($g4956$.getGlobalValue(), $g4957$.getGlobalValue()));
        f38975(var2);
        $g4959$.setGlobalValue(Packages.intern(Sequences.cconcatenate((SubLObject)$ic4$, module0018.f967()), (SubLObject)UNPROVIDED));
        f38976();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38975(final SubLObject var2) {
        module0021.f1038(var2, $g4958$.getGlobalValue());
        streams_high.force_output($g4958$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38976() {
        if (NIL != $g4960$.getGlobalValue()) {
            f38977();
        }
        $g4960$.setGlobalValue(Threads.make_process((SubLObject)$ic5$, Symbols.symbol_function((SubLObject)$ic6$)));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38977() {
        if (NIL != $g4960$.getGlobalValue()) {
            Threads.kill_process($g4960$.getGlobalValue());
            $g4960$.setGlobalValue((SubLObject)NIL);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38978() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        SubLObject var2 = (SubLObject)NIL;
        SubLObject var3 = (SubLObject)NIL;
        try {
            var1.throwStack.push($ic7$);
            final SubLObject var4 = Errors.$error_handler$.currentBinding(var1);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic8$), var1);
                try {
                    try {
                        while (true) {
                            var2 = module0021.f1060($g4958$.getGlobalValue(), (SubLObject)NIL, (SubLObject)UNPROVIDED);
                            module0112.f7744((SubLObject)$ic9$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            PrintLow.format((SubLObject)NIL, (SubLObject)$ic10$, var2);
                        }
                    }
                    finally {
                        final SubLObject var5_6 = Threads.$is_thread_performing_cleanupP$.currentBinding(var1);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var1);
                            f38977();
                            PrintLow.format((SubLObject)NIL, (SubLObject)$ic11$);
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
            var3 = Errors.handleThrowable(var5, (SubLObject)$ic7$);
        }
        finally {
            var1.throwStack.pop();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38979(final SubLObject var9) {
        assert NIL != Types.listp(var9) : var9;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        var14 = Packages.intern(Sequences.cconcatenate((SubLObject)$ic13$, module0018.f967()), (SubLObject)UNPROVIDED);
        var12 = (SubLObject)ConsesLow.list(new SubLObject[] { $ic14$, $ic15$, ConsesLow.list((SubLObject)$ic16$, (SubLObject)$ic17$, var14), $ic18$, ConsesLow.list((SubLObject)$ic19$, (SubLObject)ConsesLow.list((SubLObject)$ic16$, (SubLObject)$ic17$, var14)), $ic20$, var9, $ic21$, $ic22$, $ic23$, $ic24$, $ic25$, $ic26$ });
        var11 = module0639.f38965(var12);
        var10 = (SubLObject)ConsesLow.list(new SubLObject[] { $ic27$, $ic28$, var14, $ic29$, var14, $ic30$, Time.get_universal_time(), $ic31$, $ic32$ });
        PrintLow.format((SubLObject)NIL, (SubLObject)$ic33$, var10);
        var13 = module0639.f38960(var10, var11);
        f38975(var13);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38980() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0640", "f38974", "S#42703", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0640", "f38975", "S#42704", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0640", "f38976", "S#42705", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0640", "f38977", "S#42706", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0640", "f38978", "S#42707", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0640", "f38979", "S#42708", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38981() {
        $g4956$ = SubLFiles.deflexical("S#42709", (SubLObject)$ic0$);
        $g4957$ = SubLFiles.deflexical("S#42710", (SubLObject)$ic1$);
        $g4958$ = SubLFiles.deflexical("S#42711", (SubLObject)NIL);
        $g4959$ = SubLFiles.deflexical("S#42712", (SubLObject)NIL);
        $g4960$ = SubLFiles.deflexical("S#42713", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic2$)) ? $g4960$.getGlobalValue() : NIL));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38982() {
        module0003.f57((SubLObject)$ic2$);
        return (SubLObject)NIL;
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
        $g4956$ = null;
        $g4957$ = null;
        $g4958$ = null;
        $g4959$ = null;
        $g4960$ = null;
        $ic0$ = makeString("localhost");
        $ic1$ = makeInteger(4444);
        $ic2$ = makeSymbol("S#42713", "CYC");
        $ic3$ = makeSymbol("S#42714", "CYC");
        $ic4$ = makeString("cyc-api-service-");
        $ic5$ = makeString("Agent received-message handler");
        $ic6$ = makeSymbol("S#42707", "CYC");
        $ic7$ = makeKeyword("IGNORE-ERRORS-TARGET");
        $ic8$ = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic9$ = makeString("fipa-transport-message");
        $ic10$ = makeString("~%Received fipa-transport-message~%~S");
        $ic11$ = makeString("Agent received-message handler process ended");
        $ic12$ = makeSymbol("LISTP");
        $ic13$ = makeString("cyc-echo-");
        $ic14$ = makeSymbol("S#42715", "CYC");
        $ic15$ = makeKeyword("SENDER");
        $ic16$ = makeSymbol("S#42716", "CYC");
        $ic17$ = makeKeyword("NAME");
        $ic18$ = makeKeyword("RECEIVER");
        $ic19$ = makeSymbol("SET");
        $ic20$ = makeKeyword("CONTENT");
        $ic21$ = makeKeyword("LANGUAGE");
        $ic22$ = makeKeyword("CYCL");
        $ic23$ = makeKeyword("ONTOLOGY");
        $ic24$ = makeKeyword("CYC-API-SERVICE-ECHO");
        $ic25$ = makeKeyword("PROTOCOL");
        $ic26$ = makeKeyword("FIPA-INFORM");
        $ic27$ = makeSymbol("S#42693", "CYC");
        $ic28$ = makeKeyword("TO");
        $ic29$ = makeKeyword("FROM");
        $ic30$ = makeKeyword("DATE");
        $ic31$ = makeKeyword("X-AGENT-COMMUNITY");
        $ic32$ = makeKeyword("COABS");
        $ic33$ = makeString("~%envelope~%~S");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 74 ms
	
	Decompiled with Procyon 0.5.32.
*/