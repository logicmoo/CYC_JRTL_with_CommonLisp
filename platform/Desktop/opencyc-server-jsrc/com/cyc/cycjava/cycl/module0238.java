package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0238 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0238";
    public static final String myFingerPrint = "f42c6f4d74c0baa1377140570d99cc0713998fbfde3e3eff845eb65d520d0393";
    private static final SubLString $ic0$;
    
    public static SubLObject f15580(final SubLObject var1) {
        return module0173.f10955(var1);
    }
    
    public static SubLObject f15581(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0238.NIL != module0178.f11284(var1) || module0238.NIL != module0191.f11952(var1));
    }
    
    public static SubLObject f15582(final SubLObject var2) {
        return (SubLObject)module0238.NIL;
    }
    
    public static SubLObject f15583(final SubLObject var2) {
        if (module0238.NIL != module0178.f11284(var2)) {
            return module0178.f11332(var2);
        }
        if (module0238.NIL != module0191.f11952(var2)) {
            return f15584(var2);
        }
        module0134.f8815((SubLObject)module0238.ONE_INTEGER, (SubLObject)module0238.$ic0$, var2, (SubLObject)module0238.UNPROVIDED, (SubLObject)module0238.UNPROVIDED, (SubLObject)module0238.UNPROVIDED, (SubLObject)module0238.UNPROVIDED);
        return (SubLObject)module0238.NIL;
    }
    
    public static SubLObject f15584(final SubLObject var3) {
        return module0205.f13333(module0191.f11967(var3));
    }
    
    public static SubLObject f15585(final SubLObject var2) {
        if (module0238.NIL != module0178.f11284(var2)) {
            return module0178.f11334(var2);
        }
        if (module0238.NIL != module0191.f11952(var2)) {
            return module0205.f13387(module0191.f11967(var2), (SubLObject)module0238.UNPROVIDED);
        }
        module0134.f8815((SubLObject)module0238.ONE_INTEGER, (SubLObject)module0238.$ic0$, var2, (SubLObject)module0238.UNPROVIDED, (SubLObject)module0238.UNPROVIDED, (SubLObject)module0238.UNPROVIDED, (SubLObject)module0238.UNPROVIDED);
        return (SubLObject)module0238.NIL;
    }
    
    public static SubLObject f15586(final SubLObject var2) {
        if (module0238.NIL != module0178.f11284(var2)) {
            return module0178.f11335(var2);
        }
        if (module0238.NIL != module0191.f11952(var2)) {
            return module0205.f13388(module0191.f11967(var2), (SubLObject)module0238.UNPROVIDED);
        }
        module0134.f8815((SubLObject)module0238.ONE_INTEGER, (SubLObject)module0238.$ic0$, var2, (SubLObject)module0238.UNPROVIDED, (SubLObject)module0238.UNPROVIDED, (SubLObject)module0238.UNPROVIDED, (SubLObject)module0238.UNPROVIDED);
        return (SubLObject)module0238.NIL;
    }
    
    public static SubLObject f15587(final SubLObject var2) {
        if (module0238.NIL != module0178.f11284(var2)) {
            return module0178.f11287(var2);
        }
        if (module0238.NIL != module0191.f11952(var2)) {
            return module0191.f11976(var2);
        }
        module0134.f8815((SubLObject)module0238.ONE_INTEGER, (SubLObject)module0238.$ic0$, var2, (SubLObject)module0238.UNPROVIDED, (SubLObject)module0238.UNPROVIDED, (SubLObject)module0238.UNPROVIDED, (SubLObject)module0238.UNPROVIDED);
        return (SubLObject)module0238.NIL;
    }
    
    public static SubLObject f15588() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0238", "f15580", "S#18342", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0238", "f15581", "S#18343", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0238", "f15582", "S#18344", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0238", "f15583", "S#18345", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0238", "f15584", "S#18346", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0238", "f15585", "S#18347", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0238", "f15586", "S#18348", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0238", "f15587", "S#18349", 1, 0, false);
        return (SubLObject)module0238.NIL;
    }
    
    public static SubLObject f15589() {
        return (SubLObject)module0238.NIL;
    }
    
    public static SubLObject f15590() {
        return (SubLObject)module0238.NIL;
    }
    
    public void declareFunctions() {
        f15588();
    }
    
    public void initializeVariables() {
        f15589();
    }
    
    public void runTopLevelForms() {
        f15590();
    }
    
    static {
        me = (SubLFile)new module0238();
        $ic0$ = SubLObjectFactory.makeString("Invalid ghl-edge ~a");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0238.class
	Total time: 49 ms
	
	Decompiled with Procyon 0.5.32.
*/