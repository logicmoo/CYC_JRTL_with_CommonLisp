package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0348 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0348";
    public static final String myFingerPrint = "0badcd8af9d323e56cdecfe3a9deebc5495b77a37478ff2b98e36702b2aa0fac";
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLObject $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLObject $ic7$;
    
    public static SubLObject f23380(final SubLObject var1) {
        if (var1.eql(module0348.$ic0$)) {
            return (SubLObject)module0348.$ic1$;
        }
        if (var1.eql(module0348.$ic2$)) {
            return (SubLObject)module0348.$ic3$;
        }
        if (module0348.NIL == module0202.f12659(var1)) {
            return (SubLObject)module0348.$ic4$;
        }
        if (module0348.NIL != module0161.f10488(var1)) {
            return (SubLObject)module0348.$ic5$;
        }
        if (module0348.NIL != module0161.f10602(var1)) {
            return (SubLObject)module0348.$ic6$;
        }
        return (SubLObject)module0348.$ic4$;
    }
    
    public static SubLObject f23381(final SubLObject var2) {
        return module0259.f16854(var2, module0348.$ic7$, module0132.$g1557$.getGlobalValue(), (SubLObject)module0348.UNPROVIDED);
    }
    
    public static SubLObject f23382() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0348", "f23380", "S#12267", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0348", "f23381", "S#21488", 1, 0, false);
        return (SubLObject)module0348.NIL;
    }
    
    public static SubLObject f23383() {
        return (SubLObject)module0348.NIL;
    }
    
    public static SubLObject f23384() {
        return (SubLObject)module0348.NIL;
    }
    
    public void declareFunctions() {
        f23382();
    }
    
    public void initializeVariables() {
        f23383();
    }
    
    public void runTopLevelForms() {
        f23384();
    }
    
    static {
        me = (SubLFile)new module0348();
        $ic0$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic1$ = SubLObjectFactory.makeSymbol("S#12330", "CYC");
        $ic2$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $ic3$ = SubLObjectFactory.makeSymbol("S#12329", "CYC");
        $ic4$ = SubLObjectFactory.makeSymbol("S#26072", "CYC");
        $ic5$ = SubLObjectFactory.makeSymbol("S#12331", "CYC");
        $ic6$ = SubLObjectFactory.makeSymbol("S#12332", "CYC");
        $ic7$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ProblemSolvingCntxt"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0348.class
	Total time: 47 ms
	
	Decompiled with Procyon 0.5.32.
*/