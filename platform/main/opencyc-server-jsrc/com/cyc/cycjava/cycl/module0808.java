package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0808 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0808";
    public static final String myFingerPrint = "f2bd69198a8c602dd139ff9b4c1a233785a3f0e7d56f439dea5bfd264ab62b83";
    private static SubLSymbol $g6423$;
    private static SubLSymbol $g6424$;
    private static SubLSymbol $g6425$;
    private static final SubLString $ic0$;
    private static final SubLString $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLInteger $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLString $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLString $ic7$;
    private static final SubLString $ic8$;
    private static final SubLString $ic9$;
    private static final SubLString $ic10$;
    private static final SubLString $ic11$;
    private static final SubLString $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLString $ic14$;
    private static final SubLString $ic15$;
    private static final SubLList $ic16$;
    private static final SubLString $ic17$;
    private static final SubLString $ic18$;
    private static final SubLString $ic19$;
    private static final SubLString $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLString $ic23$;
    private static final SubLString $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    
    public static SubLObject f51378(SubLObject var1, SubLObject var2) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)T;
        }
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)$ic1$;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp($g6423$.getGlobalValue()) : $g6423$.getGlobalValue();
        final SubLObject var4 = module0093.f6607($g6423$.getGlobalValue(), (SubLObject)$ic3$, module0093.$g1222$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)$ic4$);
        final SubLObject var5 = module0012.$g75$.currentBinding(var3);
        final SubLObject var6 = module0012.$g76$.currentBinding(var3);
        final SubLObject var7 = module0012.$g77$.currentBinding(var3);
        final SubLObject var8 = module0012.$g78$.currentBinding(var3);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var3);
            module0012.$g76$.bind((SubLObject)NIL, var3);
            module0012.$g77$.bind((SubLObject)T, var3);
            module0012.$g78$.bind(Time.get_universal_time(), var3);
            module0012.f478((SubLObject)$ic5$);
            final SubLObject var9 = var2;
            SubLObject var10 = (SubLObject)NIL;
            try {
                final SubLObject var5_11 = stream_macros.$stream_requires_locking$.currentBinding(var3);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var3);
                    var10 = compatibility.open_text(var9, (SubLObject)$ic6$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var5_11, var3);
                }
                if (!var10.isStream()) {
                    Errors.error((SubLObject)$ic7$, var9);
                }
                final SubLObject var11 = var10;
                if (var11.isStream()) {
                    final SubLObject var12 = streams_high.file_length(var11);
                    final SubLObject var14_15 = var11;
                    SubLObject var13 = (SubLObject)NIL;
                    SubLObject var14 = (SubLObject)NIL;
                    var13 = (SubLObject)ZERO_INTEGER;
                    for (var14 = module0075.f5202(var14_15); NIL != var14; var14 = module0075.f5202(var14_15)) {
                        final SubLObject var15 = reader.read_from_string(var14, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        final SubLObject var16 = var15.first();
                        final SubLObject var17 = conses_high.second(var15);
                        final SubLObject var18 = conses_high.third(var15);
                        if (NIL != var17 && NIL == module0038.f2668((SubLObject)$ic8$, var18, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                            final SubLObject var19 = module0038.f2674(var17, (SubLObject)$ic9$, (SubLObject)UNPROVIDED);
                            if (NIL != var1) {
                                PrintLow.format((SubLObject)T, (SubLObject)$ic10$, var16, var19);
                            }
                            module0093.f6618(var16, var4, var19);
                        }
                        module0012.note_percent_progress(streams_high.file_position(var11, (SubLObject)UNPROVIDED), var12);
                        var13 = module0048.f_1X(var13);
                    }
                }
            }
            finally {
                final SubLObject var5_12 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var3);
                    if (var10.isStream()) {
                        streams_high.close(var10, (SubLObject)UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var5_12, var3);
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var8, var3);
            module0012.$g77$.rebind(var7, var3);
            module0012.$g76$.rebind(var6, var3);
            module0012.$g75$.rebind(var5, var3);
        }
        return var4;
    }
    
    public static SubLObject f51379(final SubLObject var19, SubLObject var24) {
        if (var24 == UNPROVIDED) {
            var24 = $g6423$.getGlobalValue();
        }
        final SubLThread var25 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var19) : var19;
        assert NIL != Types.stringp(var24) : var24;
        if (NIL != module0038.f2668(module0724.f44348((SubLObject)UNPROVIDED), var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != module0038.f2668(module0038.f2669(module0724.f44348((SubLObject)UNPROVIDED), module0689.f42250(), (SubLObject)$ic14$), var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return var19;
        }
        final SubLObject var26 = (SubLObject)((NIL != $g6425$.getDynamicValue(var25)) ? $g6425$.getDynamicValue(var25) : $ic12$);
        if (NIL != module0038.f2668((SubLObject)$ic15$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            final SubLObject var27 = conses_high.last(module0038.f2752(var19, (SubLObject)$ic16$), (SubLObject)UNPROVIDED).first();
            return module0038.f2669(module0038.f2669(var19, (SubLObject)$ic15$, var26), var27, module0589.f35898(var27, (SubLObject)UNPROVIDED));
        }
        if (NIL != module0038.f2668((SubLObject)$ic17$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            final SubLObject var27 = conses_high.last(module0038.f2752(var19, (SubLObject)$ic16$), (SubLObject)UNPROVIDED).first();
            return module0038.f2669(module0038.f2669(var19, (SubLObject)$ic17$, var26), var27, module0589.f35898(var27, (SubLObject)UNPROVIDED));
        }
        if (NIL != module0038.f2668((SubLObject)$ic18$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            final SubLObject var28 = module0589.f35898(module0038.f2669(var19, (SubLObject)$ic19$, var26), (SubLObject)UNPROVIDED);
            return Sequences.cconcatenate(module0006.f203($g6424$.getDynamicValue(var25)), new SubLObject[] { $ic20$, module0006.f203(var28) });
        }
        final SubLObject var29 = module0093.f6613(var24, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)$ic4$);
        SubLObject var30 = (SubLObject)NIL;
        SubLObject var31 = (SubLObject)NIL;
        SubLObject var32 = (SubLObject)NIL;
        assert NIL != module0093.f6457(var29) : var29;
        try {
            var25.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var33 = Errors.$error_handler$.currentBinding(var25);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic22$, var25);
                try {
                    var30 = Filesys.probe_file(module0093.f6621(var19, var29, (SubLObject)UNPROVIDED));
                }
                catch (Throwable var34) {
                    Errors.handleThrowable(var34, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var33, var25);
            }
        }
        catch (Throwable var35) {
            var32 = Errors.handleThrowable(var35, module0003.$g3$.getGlobalValue());
        }
        finally {
            var25.throwStack.pop();
        }
        if (NIL != var32 || NIL == var30) {
            var30 = Sequences.cconcatenate(module0006.f203(var26), (SubLObject)$ic23$);
        }
        else {
            var31 = module0589.f35898(module0051.f3552(Filesys.file_write_date(var30)), (SubLObject)UNPROVIDED);
            var30 = module0589.f35898(Sequences.cconcatenate(module0006.f203(var26), module0006.f203(module0038.f2674(module0038.f2624(var30), module0038.f2624(Filesys.probe_file((SubLObject)$ic24$)), (SubLObject)UNPROVIDED))), (SubLObject)UNPROVIDED);
        }
        if (NIL != var31) {
            return Sequences.cconcatenate(module0006.f203($g6424$.getDynamicValue(var25)), new SubLObject[] { $ic20$, module0006.f203(var30), $ic25$, module0006.f203(var19), $ic26$, module0006.f203(var31) });
        }
        return Sequences.cconcatenate(module0006.f203($g6424$.getDynamicValue(var25)), new SubLObject[] { $ic20$, module0006.f203(var30), $ic25$, module0006.f203(var19) });
    }
    
    public static SubLObject f51380() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0808", "f51378", "S#56034", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0808", "f51379", "WEBCACHE-URL", 1, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51381() {
        $g6423$ = SubLFiles.deflexical("S#56035", (SubLObject)$ic0$);
        $g6424$ = SubLFiles.defparameter("S#56036", (SubLObject)$ic11$);
        $g6425$ = SubLFiles.defparameter("S#56037", (SubLObject)$ic12$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51382() {
        module0002.f38((SubLObject)$ic13$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f51380();
    }
    
    public void initializeVariables() {
        f51381();
    }
    
    public void runTopLevelForms() {
        f51382();
    }
    
    static {
        me = (SubLFile)new module0808();
        $g6423$ = null;
        $g6424$ = null;
        $g6425$ = null;
        $ic0$ = makeString("data/webpage-downloader/webcache-urls.fht");
        $ic1$ = makeString("/cyc/top/data/webpage-downloader/tkb-fet-sources3.log");
        $ic2$ = makeSymbol("STRINGP");
        $ic3$ = makeInteger(2300);
        $ic4$ = makeKeyword("IMAGE-INDEPENDENT-CFASL");
        $ic5$ = makeString("Creating file-hash-table...");
        $ic6$ = makeKeyword("INPUT");
        $ic7$ = makeString("Unable to open ~S");
        $ic8$ = makeString("Webpage not found");
        $ic9$ = makeString("file:///cyc/top/");
        $ic10$ = makeString("~A -> ~A~%");
        $ic11$ = makeString("http://localhost:8080/CycCachedFileServer/");
        $ic12$ = makeString("");
        $ic13$ = makeSymbol("WEBCACHE-URL");
        $ic14$ = makeString("localhost");
        $ic15$ = makeString("http://doc.cyc.com/");
        $ic16$ = ConsesLow.list((SubLObject)Characters.CHAR_slash);
        $ic17$ = makeString("http://tomcat/");
        $ic18$ = makeString("http://cyc/webcache/factiva");
        $ic19$ = makeString("http://cyc/");
        $ic20$ = makeString("fileCache.jsp?file=");
        $ic21$ = makeSymbol("S#8139", "CYC");
        $ic22$ = makeSymbol("S#38", "CYC");
        $ic23$ = makeString("downloaded-webpages/file-not-found.html");
        $ic24$ = makeString("data/webpage-downloader");
        $ic25$ = makeString("&url=");
        $ic26$ = makeString("&date=");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 144 ms
	
	Decompiled with Procyon 0.5.32.
*/