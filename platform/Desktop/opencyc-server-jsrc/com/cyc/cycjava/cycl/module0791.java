package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0791 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0791";
    public static final String myFingerPrint = "b4171696557533b7662be8c4ab371e6496ee3e12f5c10828cf5c869e6cb94e99";
    private static SubLSymbol $g6313$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    
    public static SubLObject f50537() {
        if (module0791.NIL != module0035.f2370((SubLObject)module0791.$ic1$, module0791.$g6313$.getGlobalValue(), (SubLObject)module0791.UNPROVIDED)) {
            module0131.f8573();
        }
        else {
            module0131.f8574();
        }
        return module0131.f8572();
    }
    
    public static SubLObject f50538(final SubLObject var1, final SubLObject var2) {
        return (SubLObject)module0791.NIL;
    }
    
    public static SubLObject f50539(final SubLObject var1) {
        return (SubLObject)module0791.NIL;
    }
    
    public static SubLObject f50540(final SubLObject var1, SubLObject var3) {
        if (var3 == module0791.UNPROVIDED) {
            var3 = (SubLObject)module0791.NIL;
        }
        return (SubLObject)module0791.NIL;
    }
    
    public static SubLObject f50541(final SubLObject var4, final SubLObject var2) {
        return (SubLObject)module0791.NIL;
    }
    
    public static SubLObject f50542(SubLObject var5) {
        if (var5 == module0791.UNPROVIDED) {
            var5 = (SubLObject)module0791.NIL;
        }
        return (SubLObject)module0791.NIL;
    }
    
    public static SubLObject f50543() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0791", "f50537", "S#41517", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0791", "f50538", "S#55074", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0791", "f50539", "S#48608", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0791", "f50540", "S#44185", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0791", "f50541", "S#55075", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0791", "f50542", "S#55076", 0, 1, false);
        return (SubLObject)module0791.NIL;
    }
    
    public static SubLObject f50544() {
        module0791.$g6313$ = SubLFiles.deflexical("S#55077", (SubLObject)module0791.$ic0$);
        return (SubLObject)module0791.NIL;
    }
    
    public static SubLObject f50545() {
        module0002.f35((SubLObject)module0791.$ic2$, (SubLObject)module0791.NIL);
        return (SubLObject)module0791.NIL;
    }
    
    public void declareFunctions() {
        f50543();
    }
    
    public void initializeVariables() {
        f50544();
    }
    
    public void runTopLevelForms() {
        f50545();
    }
    
    static {
        me = (SubLFile)new module0791();
        module0791.$g6313$ = null;
        $ic0$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("synonymousExternalConcept")));
        $ic1$ = SubLObjectFactory.makeSymbol("VALID-CONSTANT?");
        $ic2$ = SubLObjectFactory.makeSymbol("S#55076", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0791.class
	Total time: 43 ms
	
	Decompiled with Procyon 0.5.32.
*/