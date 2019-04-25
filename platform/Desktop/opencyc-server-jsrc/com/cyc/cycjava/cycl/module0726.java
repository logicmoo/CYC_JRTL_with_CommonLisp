package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0726 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0726";
    public static final String myFingerPrint = "a8d9592b1931bd70e655b6add907ce0c26f7c46334fcaecbca45ae2d78f2de74";
    private static final SubLObject $ic0$;
    private static final SubLObject $ic1$;
    
    public static SubLObject f44382(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0726.NIL != module0584.f35775(module0584.$g4392$.getDynamicValue(var2)) && module0726.NIL != module0731.f44840(var1)) {
            return (SubLObject)module0726.NIL;
        }
        if (module0726.NIL != module0584.f35775(module0584.$g4393$.getDynamicValue(var2)) && module0726.$ic0$.eql(var1)) {
            return (SubLObject)module0726.NIL;
        }
        if (module0726.NIL != module0584.f35775(module0584.$g4394$.getDynamicValue(var2)) && module0726.$ic1$.eql(var1)) {
            return (SubLObject)module0726.NIL;
        }
        return (SubLObject)module0726.T;
    }
    
    public static SubLObject f44383() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0726", "f44382", "S#48559", 1, 0, false);
        return (SubLObject)module0726.NIL;
    }
    
    public static SubLObject f44384() {
        return (SubLObject)module0726.NIL;
    }
    
    public static SubLObject f44385() {
        return (SubLObject)module0726.NIL;
    }
    
    public void declareFunctions() {
        f44383();
    }
    
    public void initializeVariables() {
        f44384();
    }
    
    public void runTopLevelForms() {
        f44385();
    }
    
    static {
        me = (SubLFile)new module0726();
        $ic0$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SlangSpeech"));
        $ic1$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ArchaicSpeech"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0726.class
	Total time: 37 ms
	
	Decompiled with Procyon 0.5.32.
*/