package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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
        if (var1 == module0808.UNPROVIDED) {
            var1 = (SubLObject)module0808.T;
        }
        if (var2 == module0808.UNPROVIDED) {
            var2 = (SubLObject)module0808.$ic1$;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        assert module0808.NIL != Types.stringp(module0808.$g6423$.getGlobalValue()) : module0808.$g6423$.getGlobalValue();
        final SubLObject var4 = module0093.f6607(module0808.$g6423$.getGlobalValue(), (SubLObject)module0808.$ic3$, module0093.$g1222$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0808.EQUAL), (SubLObject)module0808.$ic4$);
        final SubLObject var5 = module0012.$g75$.currentBinding(var3);
        final SubLObject var6 = module0012.$g76$.currentBinding(var3);
        final SubLObject var7 = module0012.$g77$.currentBinding(var3);
        final SubLObject var8 = module0012.$g78$.currentBinding(var3);
        try {
            module0012.$g75$.bind((SubLObject)module0808.ZERO_INTEGER, var3);
            module0012.$g76$.bind((SubLObject)module0808.NIL, var3);
            module0012.$g77$.bind((SubLObject)module0808.T, var3);
            module0012.$g78$.bind(Time.get_universal_time(), var3);
            module0012.f478((SubLObject)module0808.$ic5$);
            final SubLObject var9 = var2;
            SubLObject var10 = (SubLObject)module0808.NIL;
            try {
                final SubLObject var5_11 = stream_macros.$stream_requires_locking$.currentBinding(var3);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0808.NIL, var3);
                    var10 = compatibility.open_text(var9, (SubLObject)module0808.$ic6$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var5_11, var3);
                }
                if (!var10.isStream()) {
                    Errors.error((SubLObject)module0808.$ic7$, var9);
                }
                final SubLObject var11 = var10;
                if (var11.isStream()) {
                    final SubLObject var12 = streams_high.file_length(var11);
                    final SubLObject var14_15 = var11;
                    SubLObject var13 = (SubLObject)module0808.NIL;
                    SubLObject var14 = (SubLObject)module0808.NIL;
                    var13 = (SubLObject)module0808.ZERO_INTEGER;
                    for (var14 = module0075.f5202(var14_15); module0808.NIL != var14; var14 = module0075.f5202(var14_15)) {
                        final SubLObject var15 = reader.read_from_string(var14, (SubLObject)module0808.UNPROVIDED, (SubLObject)module0808.UNPROVIDED, (SubLObject)module0808.UNPROVIDED, (SubLObject)module0808.UNPROVIDED, (SubLObject)module0808.UNPROVIDED);
                        final SubLObject var16 = var15.first();
                        final SubLObject var17 = conses_high.second(var15);
                        final SubLObject var18 = conses_high.third(var15);
                        if (module0808.NIL != var17 && module0808.NIL == module0038.f2668((SubLObject)module0808.$ic8$, var18, (SubLObject)module0808.UNPROVIDED, (SubLObject)module0808.UNPROVIDED, (SubLObject)module0808.UNPROVIDED)) {
                            final SubLObject var19 = module0038.f2674(var17, (SubLObject)module0808.$ic9$, (SubLObject)module0808.UNPROVIDED);
                            if (module0808.NIL != var1) {
                                PrintLow.format((SubLObject)module0808.T, (SubLObject)module0808.$ic10$, var16, var19);
                            }
                            module0093.f6618(var16, var4, var19);
                        }
                        module0012.note_percent_progress(streams_high.file_position(var11, (SubLObject)module0808.UNPROVIDED), var12);
                        var13 = module0048.f_1X(var13);
                    }
                }
            }
            finally {
                final SubLObject var5_12 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0808.T, var3);
                    if (var10.isStream()) {
                        streams_high.close(var10, (SubLObject)module0808.UNPROVIDED);
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
        if (var24 == module0808.UNPROVIDED) {
            var24 = module0808.$g6423$.getGlobalValue();
        }
        final SubLThread var25 = SubLProcess.currentSubLThread();
        assert module0808.NIL != Types.stringp(var19) : var19;
        assert module0808.NIL != Types.stringp(var24) : var24;
        if (module0808.NIL != module0038.f2668(module0724.f44348((SubLObject)module0808.UNPROVIDED), var19, (SubLObject)module0808.UNPROVIDED, (SubLObject)module0808.UNPROVIDED, (SubLObject)module0808.UNPROVIDED) || module0808.NIL != module0038.f2668(module0038.f2669(module0724.f44348((SubLObject)module0808.UNPROVIDED), module0689.f42250(), (SubLObject)module0808.$ic14$), var19, (SubLObject)module0808.UNPROVIDED, (SubLObject)module0808.UNPROVIDED, (SubLObject)module0808.UNPROVIDED)) {
            return var19;
        }
        final SubLObject var26 = (SubLObject)((module0808.NIL != module0808.$g6425$.getDynamicValue(var25)) ? module0808.$g6425$.getDynamicValue(var25) : module0808.$ic12$);
        if (module0808.NIL != module0038.f2668((SubLObject)module0808.$ic15$, var19, (SubLObject)module0808.UNPROVIDED, (SubLObject)module0808.UNPROVIDED, (SubLObject)module0808.UNPROVIDED)) {
            final SubLObject var27 = conses_high.last(module0038.f2752(var19, (SubLObject)module0808.$ic16$), (SubLObject)module0808.UNPROVIDED).first();
            return module0038.f2669(module0038.f2669(var19, (SubLObject)module0808.$ic15$, var26), var27, module0589.f35898(var27, (SubLObject)module0808.UNPROVIDED));
        }
        if (module0808.NIL != module0038.f2668((SubLObject)module0808.$ic17$, var19, (SubLObject)module0808.UNPROVIDED, (SubLObject)module0808.UNPROVIDED, (SubLObject)module0808.UNPROVIDED)) {
            final SubLObject var27 = conses_high.last(module0038.f2752(var19, (SubLObject)module0808.$ic16$), (SubLObject)module0808.UNPROVIDED).first();
            return module0038.f2669(module0038.f2669(var19, (SubLObject)module0808.$ic17$, var26), var27, module0589.f35898(var27, (SubLObject)module0808.UNPROVIDED));
        }
        if (module0808.NIL != module0038.f2668((SubLObject)module0808.$ic18$, var19, (SubLObject)module0808.UNPROVIDED, (SubLObject)module0808.UNPROVIDED, (SubLObject)module0808.UNPROVIDED)) {
            final SubLObject var28 = module0589.f35898(module0038.f2669(var19, (SubLObject)module0808.$ic19$, var26), (SubLObject)module0808.UNPROVIDED);
            return Sequences.cconcatenate(module0006.f203(module0808.$g6424$.getDynamicValue(var25)), new SubLObject[] { module0808.$ic20$, module0006.f203(var28) });
        }
        final SubLObject var29 = module0093.f6613(var24, Symbols.symbol_function((SubLObject)module0808.EQUAL), (SubLObject)module0808.$ic4$);
        SubLObject var30 = (SubLObject)module0808.NIL;
        SubLObject var31 = (SubLObject)module0808.NIL;
        SubLObject var32 = (SubLObject)module0808.NIL;
        assert module0808.NIL != module0093.f6457(var29) : var29;
        try {
            var25.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var33 = Errors.$error_handler$.currentBinding(var25);
            try {
                Errors.$error_handler$.bind((SubLObject)module0808.$ic22$, var25);
                try {
                    var30 = Filesys.probe_file(module0093.f6621(var19, var29, (SubLObject)module0808.UNPROVIDED));
                }
                catch (Throwable var34) {
                    Errors.handleThrowable(var34, (SubLObject)module0808.NIL);
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
        if (module0808.NIL != var32 || module0808.NIL == var30) {
            var30 = Sequences.cconcatenate(module0006.f203(var26), (SubLObject)module0808.$ic23$);
        }
        else {
            var31 = module0589.f35898(module0051.f3552(Filesys.file_write_date(var30)), (SubLObject)module0808.UNPROVIDED);
            var30 = module0589.f35898(Sequences.cconcatenate(module0006.f203(var26), module0006.f203(module0038.f2674(module0038.f2624(var30), module0038.f2624(Filesys.probe_file((SubLObject)module0808.$ic24$)), (SubLObject)module0808.UNPROVIDED))), (SubLObject)module0808.UNPROVIDED);
        }
        if (module0808.NIL != var31) {
            return Sequences.cconcatenate(module0006.f203(module0808.$g6424$.getDynamicValue(var25)), new SubLObject[] { module0808.$ic20$, module0006.f203(var30), module0808.$ic25$, module0006.f203(var19), module0808.$ic26$, module0006.f203(var31) });
        }
        return Sequences.cconcatenate(module0006.f203(module0808.$g6424$.getDynamicValue(var25)), new SubLObject[] { module0808.$ic20$, module0006.f203(var30), module0808.$ic25$, module0006.f203(var19) });
    }
    
    public static SubLObject f51380() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0808", "f51378", "S#56034", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0808", "f51379", "WEBCACHE-URL", 1, 1, false);
        return (SubLObject)module0808.NIL;
    }
    
    public static SubLObject f51381() {
        module0808.$g6423$ = SubLFiles.deflexical("S#56035", (SubLObject)module0808.$ic0$);
        module0808.$g6424$ = SubLFiles.defparameter("S#56036", (SubLObject)module0808.$ic11$);
        module0808.$g6425$ = SubLFiles.defparameter("S#56037", (SubLObject)module0808.$ic12$);
        return (SubLObject)module0808.NIL;
    }
    
    public static SubLObject f51382() {
        module0002.f38((SubLObject)module0808.$ic13$);
        return (SubLObject)module0808.NIL;
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
        module0808.$g6423$ = null;
        module0808.$g6424$ = null;
        module0808.$g6425$ = null;
        $ic0$ = SubLObjectFactory.makeString("data/webpage-downloader/webcache-urls.fht");
        $ic1$ = SubLObjectFactory.makeString("/cyc/top/data/webpage-downloader/tkb-fet-sources3.log");
        $ic2$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic3$ = SubLObjectFactory.makeInteger(2300);
        $ic4$ = SubLObjectFactory.makeKeyword("IMAGE-INDEPENDENT-CFASL");
        $ic5$ = SubLObjectFactory.makeString("Creating file-hash-table...");
        $ic6$ = SubLObjectFactory.makeKeyword("INPUT");
        $ic7$ = SubLObjectFactory.makeString("Unable to open ~S");
        $ic8$ = SubLObjectFactory.makeString("Webpage not found");
        $ic9$ = SubLObjectFactory.makeString("file:///cyc/top/");
        $ic10$ = SubLObjectFactory.makeString("~A -> ~A~%");
        $ic11$ = SubLObjectFactory.makeString("http://localhost:8080/CycCachedFileServer/");
        $ic12$ = SubLObjectFactory.makeString("");
        $ic13$ = SubLObjectFactory.makeSymbol("WEBCACHE-URL");
        $ic14$ = SubLObjectFactory.makeString("localhost");
        $ic15$ = SubLObjectFactory.makeString("http://doc.cyc.com/");
        $ic16$ = ConsesLow.list((SubLObject)Characters.CHAR_slash);
        $ic17$ = SubLObjectFactory.makeString("http://tomcat/");
        $ic18$ = SubLObjectFactory.makeString("http://cyc/webcache/factiva");
        $ic19$ = SubLObjectFactory.makeString("http://cyc/");
        $ic20$ = SubLObjectFactory.makeString("fileCache.jsp?file=");
        $ic21$ = SubLObjectFactory.makeSymbol("S#8139", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic23$ = SubLObjectFactory.makeString("downloaded-webpages/file-not-found.html");
        $ic24$ = SubLObjectFactory.makeString("data/webpage-downloader");
        $ic25$ = SubLObjectFactory.makeString("&url=");
        $ic26$ = SubLObjectFactory.makeString("&date=");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0808.class
	Total time: 144 ms
	
	Decompiled with Procyon 0.5.32.
*/