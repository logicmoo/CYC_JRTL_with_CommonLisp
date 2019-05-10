package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0560 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0560";
    public static final String myFingerPrint = "cf2df32958564b35000f1e738d3046b7ea54dfcf2b9f0b4b02e1d0fd52f90546";
    private static SubLSymbol $g4071$;
    private static SubLSymbol $g4072$;
    private static final SubLString $ic0$;
    private static final SubLString $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLString $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLString $ic8$;
    private static final SubLList $ic9$;
    private static final SubLString $ic10$;
    private static final SubLSymbol $ic11$;
    
    public static SubLObject f34521(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var1) : var1;
        assert NIL != Types.stringp(var2) : var2;
        SubLObject var4 = (SubLObject)NIL;
        if (NIL != Filesys.probe_file(var1)) {
            SubLObject var5 = (SubLObject)NIL;
            try {
                var5 = compatibility.open_binary(var1, (SubLObject)$ic3$);
                if (!var5.isStream()) {
                    Errors.error((SubLObject)$ic4$, var1);
                }
                final SubLObject var6 = var5;
                SubLObject var7_8 = (SubLObject)NIL;
                try {
                    var7_8 = compatibility.open_binary(var2, (SubLObject)$ic5$);
                    if (!var7_8.isStream()) {
                        Errors.error((SubLObject)$ic4$, var2);
                    }
                    final SubLObject var7 = var7_8;
                    final SubLObject var8 = module0021.$g777$.currentBinding(var3);
                    try {
                        module0021.$g777$.bind((SubLObject)NIL, var3);
                        module0021.f1149(f34522(var6, var7));
                        f34523(var6, var7);
                    }
                    finally {
                        module0021.$g777$.rebind(var8, var3);
                    }
                    f34524(var6, var7);
                    var4 = (SubLObject)T;
                }
                finally {
                    final SubLObject var9 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var3);
                        if (var7_8.isStream()) {
                            streams_high.close(var7_8, (SubLObject)UNPROVIDED);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var9, var3);
                    }
                }
            }
            finally {
                final SubLObject var10 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var3);
                    if (var5.isStream()) {
                        streams_high.close(var5, (SubLObject)UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var10, var3);
                }
            }
        }
        return var4;
    }
    
    public static SubLObject f34522(final SubLObject var6, final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        final SubLObject var11 = module0021.f1060(var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var12 = module0021.f1060(var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var13 = module0021.f1060(var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var14 = module0021.f1060(var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var15 = module0021.f1060(var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        assert NIL != Types.stringp(var11) : var11;
        assert NIL != Types.atom(var12) : var12;
        assert NIL != Types.integerp(var13) : var13;
        assert NIL != Types.integerp(var14) : var14;
        assert NIL != Types.integerp(var15) : var15;
        if (!var12.equal($g4071$.getDynamicValue(var10))) {
            Errors.error((SubLObject)$ic8$, var12, $g4071$.getDynamicValue(var10));
        }
        SubLObject var17;
        final SubLObject var16 = var17 = module0011.f353();
        SubLObject var18 = (SubLObject)NIL;
        SubLObject var19 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)$ic9$);
        var18 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)$ic9$);
        var19 = var17.first();
        final SubLObject var20;
        var17 = (var20 = var17.rest());
        final SubLObject var21 = module0559.f34440(var6);
        module0021.f1038(module0107.f7573(), var9);
        module0021.f1038($g4072$.getDynamicValue(var10), var9);
        module0021.f1038(var18, var9);
        module0021.f1038(var19, var9);
        module0021.f1038(module0051.f3557((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var9);
        dumper_oc.f38026(var21, var9);
        return var21;
    }
    
    public static SubLObject f34523(final SubLObject var6, final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        module0559.f34448(var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0559.f34408(var9);
        final SubLObject var11 = module0021.f1060(var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        assert NIL != Types.integerp(var11) : var11;
        module0021.f1038(var11, var9);
        module0012.$g82$.setDynamicValue((SubLObject)$ic10$, var10);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var10);
        module0012.$g83$.setDynamicValue(var11, var10);
        module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var10);
        final SubLObject var12 = module0012.$g75$.currentBinding(var10);
        final SubLObject var13 = module0012.$g76$.currentBinding(var10);
        final SubLObject var14 = module0012.$g77$.currentBinding(var10);
        final SubLObject var15 = module0012.$g78$.currentBinding(var10);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var10);
            module0012.$g76$.bind((SubLObject)NIL, var10);
            module0012.$g77$.bind((SubLObject)T, var10);
            module0012.$g78$.bind(Time.get_universal_time(), var10);
            module0012.f478(module0012.$g82$.getDynamicValue(var10));
            SubLObject var16;
            for (var16 = (SubLObject)NIL, var16 = (SubLObject)ZERO_INTEGER; var16.numL(module0012.$g83$.getDynamicValue(var10)); var16 = Numbers.add(var16, (SubLObject)ONE_INTEGER)) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var10), module0012.$g83$.getDynamicValue(var10));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var10), (SubLObject)ONE_INTEGER), var10);
                f34525(var6, var9);
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var15, var10);
            module0012.$g77$.rebind(var14, var10);
            module0012.$g76$.rebind(var13, var10);
            module0012.$g75$.rebind(var12, var10);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34525(final SubLObject var6, final SubLObject var9) {
        final SubLObject var10 = module0021.f1060(var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var11 = module0021.f1060(var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var12 = module0021.f1060(var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        assert NIL != Types.integerp(var10) : var10;
        final SubLObject var13 = constants_high_oc.f10765(var10);
        module0021.f1038(var10, var9);
        module0021.f1038(var11, var9);
        module0021.f1038(var13, var9);
        module0021.f1038(var12, var9);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34524(final SubLObject var6, final SubLObject var9) {
        SubLObject var10;
        for (var10 = (SubLObject)NIL, var10 = streams_high.read_byte(var6, (SubLObject)NIL, (SubLObject)$ic11$); var10 != $ic11$; var10 = streams_high.read_byte(var6, (SubLObject)NIL, (SubLObject)$ic11$)) {
            streams_high.write_byte(var10, var9);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34526() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0560", "f34521", "S#37827", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0560", "f34522", "S#37828", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0560", "f34523", "S#37829", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0560", "f34525", "S#37830", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0560", "f34524", "S#37831", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34527() {
        $g4071$ = SubLFiles.defparameter("S#37832", (SubLObject)$ic0$);
        $g4072$ = SubLFiles.defparameter("S#37833", (SubLObject)$ic1$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34528() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f34526();
    }
    
    public void initializeVariables() {
        f34527();
    }
    
    public void runTopLevelForms() {
        f34528();
    }
    
    static {
        me = (SubLFile)new module0560();
        $g4071$ = null;
        $g4072$ = null;
        $ic0$ = makeString("2.0");
        $ic1$ = makeString("2.1");
        $ic2$ = makeSymbol("STRINGP");
        $ic3$ = makeKeyword("INPUT");
        $ic4$ = makeString("Unable to open ~S");
        $ic5$ = makeKeyword("OUTPUT");
        $ic6$ = makeSymbol("ATOM");
        $ic7$ = makeSymbol("INTEGERP");
        $ic8$ = makeString("partition format is ~A, not ~A");
        $ic9$ = ConsesLow.list((SubLObject)makeSymbol("S#37821", "CYC"), (SubLObject)makeSymbol("S#37822", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("REST"));
        $ic10$ = makeString("converting partition constant shells");
        $ic11$ = makeKeyword("EOF");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 107 ms
	
	Decompiled with Procyon 0.5.32.
*/