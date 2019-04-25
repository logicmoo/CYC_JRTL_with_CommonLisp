package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0194 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0194";
    public static final String myFingerPrint = "fbc878f5940ca3ed6c5bc3629c937a3a201b2e066bc35c293f44aa051a54c615";
    public static SubLSymbol $g2264$;
    public static SubLSymbol $g2265$;
    public static SubLSymbol $g2266$;
    public static SubLSymbol $g2267$;
    public static SubLSymbol $g2268$;
    public static SubLSymbol $g2269$;
    private static final SubLSymbol $ic0$;
    private static final SubLString $ic1$;
    private static final SubLString $ic2$;
    private static final SubLString $ic3$;
    private static final SubLString $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLInteger $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLList $ic17$;
    
    public static SubLObject f12112(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLObject var4 = (SubLObject)((NIL != var3) ? ZERO_INTEGER : NIL);
        SubLObject var5 = f12113(var1, var4);
        if (NIL == var2) {
            var5 = module0711.f43584(var5);
        }
        var5 = module0038.f2820(var5);
        return var5;
    }
    
    public static SubLObject f12114(final SubLObject var6, SubLObject var7, SubLObject var4) {
        if (var7 == UNPROVIDED) {
            var7 = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)ZERO_INTEGER;
        }
        return f12115(var6, var7, var4);
    }
    
    public static SubLObject f12113(final SubLObject var6, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)ZERO_INTEGER;
        }
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        try {
            var8 = streams_high.make_private_string_output_stream();
            f12114(var6, var8, var4);
            var7 = streams_high.get_output_stream_string(var8);
        }
        finally {
            final SubLObject var9 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                streams_high.close(var8, (SubLObject)UNPROVIDED);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var9);
            }
        }
        return var7;
    }
    
    public static SubLObject f12115(final SubLObject var6, final SubLObject var7, final SubLObject var4) {
        if (var6.isAtom()) {
            f12116(var6, var7, var4);
        }
        else {
            f12117(var7, var4);
            print_high.princ((SubLObject)$ic1$, var7);
            f12115(var6.first(), var7, (SubLObject)NIL);
            SubLObject var8;
            for (var8 = (SubLObject)NIL, var8 = var6.rest(); var8.isCons(); var8 = var8.rest()) {
                print_high.princ((SubLObject)$ic2$, var7);
                f12115(var8.first(), var7, (SubLObject)(var4.isInteger() ? Numbers.add(var4, (SubLObject)ONE_INTEGER) : NIL));
            }
            if (NIL != var8) {
                print_high.princ((SubLObject)$ic3$, var7);
                f12115(var8, var7, (SubLObject)(var4.isInteger() ? Numbers.add(var4, (SubLObject)ONE_INTEGER) : NIL));
            }
            print_high.princ((SubLObject)$ic4$, var7);
        }
        return var6;
    }
    
    public static SubLObject f12118(final SubLObject var7, final SubLObject var4) {
        return module0038.f2648(var7, Numbers.multiply((SubLObject)TWO_INTEGER, var4));
    }
    
    public static SubLObject f12117(final SubLObject var7, final SubLObject var4) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        if (var4.isInteger()) {
            Functions.funcall($g2264$.getDynamicValue(var8), var7);
            if (var4.numG((SubLObject)ZERO_INTEGER)) {
                Functions.funcall($g2265$.getDynamicValue(var8), var7, var4);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12116(final SubLObject var12, final SubLObject var7, final SubLObject var4) {
        final SubLObject var13 = Structures.method_func(var12, $g2266$.getGlobalValue());
        if (NIL != var13) {
            return Functions.funcall(var13, var12, var7, var4);
        }
        return f12119(var12, var7, var4);
    }
    
    public static SubLObject f12119(final SubLObject var12, final SubLObject var7, final SubLObject var4) {
        return print_high.prin1(var12, var7);
    }
    
    public static SubLObject f12120(final SubLObject var12, final SubLObject var7, final SubLObject var4) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        if (NIL != $g2267$.getDynamicValue(var13)) {
            Functions.funcall($g2267$.getDynamicValue(var13), var12, var7, var4);
        }
        else {
            f12119(var12, var7, var4);
        }
        return var12;
    }
    
    public static SubLObject f12121(final SubLObject var12, final SubLObject var7, final SubLObject var4) {
        return f12122(var12, var7, var4);
    }
    
    public static SubLObject f12122(final SubLObject var12, final SubLObject var7, final SubLObject var4) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        if (NIL != $g2268$.getDynamicValue(var13)) {
            Functions.funcall($g2268$.getDynamicValue(var13), var12, var7, var4);
            return (SubLObject)NIL;
        }
        return f12119(var12, var7, var4);
    }
    
    public static SubLObject f12123(final SubLObject var12, final SubLObject var7, final SubLObject var4) {
        return f12124(var12, var7, var4);
    }
    
    public static SubLObject f12124(final SubLObject var12, final SubLObject var7, final SubLObject var4) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        if (NIL != $g2269$.getDynamicValue(var13)) {
            Functions.funcall($g2269$.getDynamicValue(var13), var12, var7, var4);
            return (SubLObject)NIL;
        }
        return f12119(var12, var7, var4);
    }
    
    public static SubLObject f12125() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0194", "f12112", "GET-PRETTY-FORMATTED-STRING", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0194", "f12114", "S#14883", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0194", "f12113", "S#14884", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0194", "f12115", "S#14885", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0194", "f12118", "S#14886", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0194", "f12117", "S#14887", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0194", "f12116", "S#14888", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0194", "f12119", "S#14889", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0194", "f12120", "S#14890", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0194", "f12121", "S#14891", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0194", "f12122", "S#14892", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0194", "f12123", "S#14893", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0194", "f12124", "S#14894", 3, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12126() {
        $g2264$ = SubLFiles.defparameter("S#14895", (SubLObject)$ic5$);
        $g2265$ = SubLFiles.defparameter("S#14896", (SubLObject)$ic6$);
        $g2266$ = SubLFiles.deflexical("S#14897", Vectors.make_vector((SubLObject)$ic7$, (SubLObject)NIL));
        $g2267$ = SubLFiles.defparameter("S#14898", (SubLObject)NIL);
        $g2268$ = SubLFiles.defparameter("S#14899", (SubLObject)NIL);
        $g2269$ = SubLFiles.defparameter("S#14900", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12127() {
        module0002.f38((SubLObject)$ic0$);
        Structures.register_method($g2266$.getGlobalValue(), constant_handles_oc.$g1501$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic8$));
        Structures.register_method($g2266$.getGlobalValue(), module0167.$g2182$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic9$));
        Structures.register_method($g2266$.getGlobalValue(), assertion_handles_oc.$g2194$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic10$));
        module0027.f1449((SubLObject)$ic0$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic11$, NIL, $ic12$, NIL, $ic13$, NIL, $ic14$, $ic15$, $ic16$, T }), (SubLObject)$ic17$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f12125();
    }
    
    public void initializeVariables() {
        f12126();
    }
    
    public void runTopLevelForms() {
        f12127();
    }
    
    static {
        me = (SubLFile)new module0194();
        $g2264$ = null;
        $g2265$ = null;
        $g2266$ = null;
        $g2267$ = null;
        $g2268$ = null;
        $g2269$ = null;
        $ic0$ = makeSymbol("GET-PRETTY-FORMATTED-STRING");
        $ic1$ = makeString("(");
        $ic2$ = makeString(" ");
        $ic3$ = makeString(" . ");
        $ic4$ = makeString(")");
        $ic5$ = makeSymbol("TERPRI");
        $ic6$ = makeSymbol("S#14886", "CYC");
        $ic7$ = makeInteger(256);
        $ic8$ = makeSymbol("S#14890", "CYC");
        $ic9$ = makeSymbol("S#14891", "CYC");
        $ic10$ = makeSymbol("S#14893", "CYC");
        $ic11$ = makeKeyword("TEST");
        $ic12$ = makeKeyword("OWNER");
        $ic13$ = makeKeyword("CLASSES");
        $ic14$ = makeKeyword("KB");
        $ic15$ = makeKeyword("FULL");
        $ic16$ = makeKeyword("WORKING?");
        $ic17$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?X"), constant_handles_oc.f8479((SubLObject)makeString("Cat"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("likesAsFriend")), (SubLObject)makeSymbol("?X"), constant_handles_oc.f8479((SubLObject)makeString("DaveS")))), (SubLObject)T, (SubLObject)T), (SubLObject)makeString("(#$implies \n  (#$isa ?X #$Cat) \n  (#$likesAsFriend ?X #$DaveS))")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?X"), constant_handles_oc.f8479((SubLObject)makeString("Cat"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("likesAsFriend")), (SubLObject)makeSymbol("?X"), constant_handles_oc.f8479((SubLObject)makeString("DaveS")))), (SubLObject)T, (SubLObject)NIL), (SubLObject)makeString("(#$implies (#$isa ?X #$Cat) (#$likesAsFriend ?X #$DaveS))")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?X"), constant_handles_oc.f8479((SubLObject)makeString("Cat"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("likesAsFriend")), (SubLObject)makeSymbol("?X"), constant_handles_oc.f8479((SubLObject)makeString("DaveS")))), (SubLObject)NIL, (SubLObject)T), (SubLObject)makeString("(implies \n  (isa ?X Cat) \n  (likesAsFriend ?X DaveS))")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?X"), constant_handles_oc.f8479((SubLObject)makeString("Cat"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("likesAsFriend")), (SubLObject)makeSymbol("?X"), constant_handles_oc.f8479((SubLObject)makeString("DaveS")))), (SubLObject)NIL, (SubLObject)NIL), (SubLObject)makeString("(implies (isa ?X Cat) (likesAsFriend ?X DaveS))")));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 86 ms
	
	Decompiled with Procyon 0.5.32.
*/