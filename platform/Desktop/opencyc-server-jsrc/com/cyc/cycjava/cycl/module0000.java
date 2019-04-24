package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0000 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0000";
    public static final String myFingerPrint = "2eb21c5cafffa30579c15615587b57bb09a1d77d70971956497b4820a75bed61";
    public static SubLSymbol $g0$;
    
    public static SubLObject f0() {
        return (SubLObject)module0000.NIL;
    }
    
    public static SubLObject f1() {
        module0000.$g0$ = SubLFiles.defvar("S#0", (SubLObject)module0000.NIL);
        return (SubLObject)module0000.NIL;
    }
    
    public static SubLObject f2() {
        return (SubLObject)module0000.NIL;
    }
    
    public void declareFunctions() {
        f0();
    }
    
    public void initializeVariables() {
        f1();
    }
    
    public void runTopLevelForms() {
        f2();
    }
    
    static {
        me = (SubLFile)new module0000();
        module0000.$g0$ = null;
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0000.class
	Total time: 10 ms
	
	Decompiled with Procyon 0.5.32.
*/