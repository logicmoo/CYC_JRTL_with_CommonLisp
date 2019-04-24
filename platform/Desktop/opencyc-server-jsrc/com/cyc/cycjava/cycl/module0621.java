package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0621 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0621";
    public static final String myFingerPrint = "4c9589f4a14705a7b2c2105b76dec01107beebca680712923b7cd2f048de5762";
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    
    public static SubLObject f38268(final SubLObject var1) {
        SubLObject var2 = (SubLObject)module0621.NIL;
        SubLObject var3 = Threads.all_processes();
        SubLObject var4 = (SubLObject)module0621.NIL;
        var4 = var3.first();
        while (module0621.NIL != var3) {
            if (module0621.NIL != module0038.f2668(var1, Threads.process_name(var4), (SubLObject)module0621.UNPROVIDED, (SubLObject)module0621.UNPROVIDED, (SubLObject)module0621.UNPROVIDED)) {
                var2 = (SubLObject)ConsesLow.cons(var4, var2);
            }
            var3 = var3.rest();
            var4 = var3.first();
        }
        return Sequences.nreverse(var2);
    }
    
    public static SubLObject f38269(final SubLObject var1) {
        final SubLObject var2 = f38268(var1);
        Mapping.mapc((SubLObject)module0621.$ic2$, var2, module0621.EMPTY_SUBL_OBJECT_ARRAY);
        return var2;
    }
    
    public static SubLObject f38270() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0621", "f38268", "PROCESSES-WITH-SUBSTRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0621", "f38269", "KILL-PROCESSES-WITH-SUBSTRING", 1, 0, false);
        return (SubLObject)module0621.NIL;
    }
    
    public static SubLObject f38271() {
        return (SubLObject)module0621.NIL;
    }
    
    public static SubLObject f38272() {
        module0002.f38((SubLObject)module0621.$ic0$);
        module0002.f38((SubLObject)module0621.$ic1$);
        return (SubLObject)module0621.NIL;
    }
    
    public void declareFunctions() {
        f38270();
    }
    
    public void initializeVariables() {
        f38271();
    }
    
    public void runTopLevelForms() {
        f38272();
    }
    
    static {
        me = (SubLFile)new module0621();
        $ic0$ = SubLObjectFactory.makeSymbol("PROCESSES-WITH-SUBSTRING");
        $ic1$ = SubLObjectFactory.makeSymbol("KILL-PROCESSES-WITH-SUBSTRING");
        $ic2$ = SubLObjectFactory.makeSymbol("KILL-PROCESS");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0621.class
	Total time: 36 ms
	
	Decompiled with Procyon 0.5.32.
*/