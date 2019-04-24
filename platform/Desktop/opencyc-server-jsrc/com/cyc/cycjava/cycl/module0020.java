package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0020 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0020";
    public static final String myFingerPrint = "910360736e8d29307f473f21e268f571275ab4c865706cbf559e517b34db9f6e";
    private static final SubLSymbol $ic0$;
    
    public static SubLObject f1008(final SubLObject var1, SubLObject var2) {
        if (var2 == module0020.UNPROVIDED) {
            var2 = (SubLObject)module0020.NIL;
        }
        return (SubLObject)module0020.NIL;
    }
    
    public static SubLObject f1009(final SubLObject var3, final SubLObject var4) {
        return (SubLObject)module0020.NIL;
    }
    
    public static SubLObject f1010(final SubLObject var5) {
        assert module0020.NIL != Types.stringp(var5) : var5;
        return (SubLObject)module0020.NIL;
    }
    
    public static SubLObject f1011(final SubLObject var1, SubLObject var6, SubLObject var7, SubLObject var8) {
        if (var6 == module0020.UNPROVIDED) {
            var6 = (SubLObject)module0020.NIL;
        }
        if (var7 == module0020.UNPROVIDED) {
            var7 = (SubLObject)module0020.NIL;
        }
        if (var8 == module0020.UNPROVIDED) {
            var8 = (SubLObject)module0020.NIL;
        }
        return (SubLObject)module0020.NIL;
    }
    
    public static SubLObject f1012(final SubLObject var3, final SubLObject var4) {
        return (SubLObject)module0020.NIL;
    }
    
    public static SubLObject f1013(final SubLObject var9) {
        assert module0020.NIL != Types.stringp(var9) : var9;
        return (SubLObject)module0020.NIL;
    }
    
    public static SubLObject f1014() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0020", "f1008", "S#1995", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0020", "f1009", "S#1996", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0020", "f1010", "S#1997", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0020", "f1011", "S#1998", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0020", "f1012", "S#1999", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0020", "f1013", "S#2000", 1, 0, false);
        return (SubLObject)module0020.NIL;
    }
    
    public static SubLObject f1015() {
        return (SubLObject)module0020.NIL;
    }
    
    public static SubLObject f1016() {
        return (SubLObject)module0020.NIL;
    }
    
    public void declareFunctions() {
        f1014();
    }
    
    public void initializeVariables() {
        f1015();
    }
    
    public void runTopLevelForms() {
        f1016();
    }
    
    static {
        me = (SubLFile)new module0020();
        $ic0$ = SubLObjectFactory.makeSymbol("STRINGP");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0020.class
	Total time: 29 ms
	
	Decompiled with Procyon 0.5.32.
*/