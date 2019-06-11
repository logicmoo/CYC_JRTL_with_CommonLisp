package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0736 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0736";
    public static final String myFingerPrint = "95357cf9c809a3bcd20d2e4dc4c581b4b01d84adc7eb4b3054b0e9b658ff4825";
    public static SubLSymbol $g5822$;
    private static SubLSymbol $g5823$;
    private static SubLSymbol $g5824$;
    private static final SubLInteger $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLString $ic3$;
    private static final SubLString $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLString $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLString $ic8$;
    
    public static SubLObject f45310(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)ZERO_INTEGER;
        }
        if (var3 == UNPROVIDED) {
            var3 = $g5823$.getGlobalValue();
        }
        assert NIL != Types.stringp(var1) : var1;
        return Hashtables.gethash(var1, var3, var2);
    }
    
    public static SubLObject f45311(SubLObject var4, SubLObject var5) {
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)$ic1$;
        }
        if (var5 == UNPROVIDED) {
            var5 = $g5824$.getDynamicValue();
        }
        Symbols.set(var4, module0069.f4939(var5));
        return Eval.eval(var4);
    }
    
    public static SubLObject f45312(SubLObject var3, SubLObject var5) {
        if (var3 == UNPROVIDED) {
            var3 = $g5823$.getGlobalValue();
        }
        if (var5 == UNPROVIDED) {
            var5 = $g5824$.getDynamicValue();
        }
        return module0069.f4937(var3, var5);
    }
    
    public static SubLObject f45313(final SubLObject var6, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)$ic1$;
        }
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic6$, var6);
        SubLObject var9 = (SubLObject)NIL;
        if (NIL == Symbols.boundp(var4) || NIL == Eval.eval(var4)) {
            Symbols.set(var4, Hashtables.make_hash_table($g5822$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQUALP), (SubLObject)UNPROVIDED));
        }
        var9 = Eval.eval(var4);
        Hashtables.clrhash(var9);
        SubLObject var10 = (SubLObject)NIL;
        try {
            var10 = compatibility.open_text(var6, (SubLObject)$ic7$);
            if (!var10.isStream()) {
                Errors.error((SubLObject)$ic8$, var6);
            }
            final SubLObject var11 = var10;
            final SubLObject var12 = module0012.$g75$.currentBinding(var7);
            final SubLObject var13 = module0012.$g76$.currentBinding(var7);
            final SubLObject var14 = module0012.$g77$.currentBinding(var7);
            final SubLObject var15 = module0012.$g78$.currentBinding(var7);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var7);
                module0012.$g76$.bind((SubLObject)NIL, var7);
                module0012.$g77$.bind((SubLObject)T, var7);
                module0012.$g78$.bind(Time.get_universal_time(), var7);
                module0012.f478(var8);
                SubLObject var16 = (SubLObject)NIL;
                SubLObject var17 = (SubLObject)NIL;
                SubLObject var18 = (SubLObject)NIL;
                var16 = module0038.f2835(var11, (SubLObject)NIL, module0038.$g916$.getGlobalValue(), (SubLObject)UNPROVIDED);
                var17 = module0038.f2738(var16, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var18 = streams_high.file_length(var11);
                while (!var16.equal(module0038.$g916$.getGlobalValue())) {
                    if (!var16.equal(module0038.$g916$.getGlobalValue())) {
                        Hashtables.sethash(conses_high.second(var17), var9, reader.parse_integer(var17.first(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                        module0012.note_percent_progress(streams_high.file_position(var11, (SubLObject)UNPROVIDED), var18);
                    }
                    var16 = module0038.f2835(var11, (SubLObject)NIL, module0038.$g916$.getGlobalValue(), (SubLObject)UNPROVIDED);
                    var17 = module0038.f2738(var16, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                   /// var18 = var18;
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var15, var7);
                module0012.$g77$.rebind(var14, var7);
                module0012.$g76$.rebind(var13, var7);
                module0012.$g75$.rebind(var12, var7);
            }
        }
        finally {
            final SubLObject var19 = Threads.$is_thread_performing_cleanupP$.currentBinding(var7);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var7);
                if (var10.isStream()) {
                    streams_high.close(var10, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var19, var7);
            }
        }
        return var9;
    }
    
    public static SubLObject f45314() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0736", "f45310", "S#49538", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0736", "f45311", "S#49539", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0736", "f45312", "S#49540", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0736", "f45313", "S#49541", 1, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45315() {
        $g5822$ = SubLFiles.deflexical("S#49542", (SubLObject)$ic0$);
        $g5823$ = SubLFiles.deflexical("S#49543", (NIL != Symbols.boundp((SubLObject)$ic1$)) ? $g5823$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)$ic0$, Symbols.symbol_function((SubLObject)EQUALP), (SubLObject)UNPROVIDED));
        $g5824$ = SubLFiles.defparameter("S#49544", Filesys.construct_filename((SubLObject)$ic2$, (SubLObject)$ic3$, (SubLObject)$ic4$, (SubLObject)T));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45316() {
        module0003.f57((SubLObject)$ic1$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f45314();
    }
    
    public void initializeVariables() {
        f45315();
    }
    
    public void runTopLevelForms() {
        f45316();
    }
    
    static {
        me = (SubLFile)new module0736();
        $g5822$ = null;
        $g5823$ = null;
        $g5824$ = null;
        $ic0$ = makeInteger(64000);
        $ic1$ = makeSymbol("S#49543", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)makeString("data"), (SubLObject)makeString("word-frequencies"));
        $ic3$ = makeString("word-frequencies");
        $ic4$ = makeString("hash");
        $ic5$ = makeSymbol("STRINGP");
        $ic6$ = makeString("Loading frequencies from ~a ...");
        $ic7$ = makeKeyword("INPUT");
        $ic8$ = makeString("Unable to open ~S");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 81 ms
	
	Decompiled with Procyon 0.5.32.
*/