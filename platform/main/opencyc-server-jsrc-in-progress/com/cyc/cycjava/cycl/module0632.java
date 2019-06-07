package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0632 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0632";
    public static final String myFingerPrint = "76d31cd7a46a1f57c0b901290b2bbf5e11af4e75c19e28a1ba182e87c16eb155";
    private static SubLSymbol $g4937$;
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLObject $ic2$;
    private static final SubLObject $ic3$;
    
    public static SubLObject f38705() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g4937$.getDynamicValue(var1);
    }
    
    public static SubLObject f38706(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        assert NIL != module0269.f17731(var2) : var2;
        $g4937$.setDynamicValue(var2, var3);
        return $g4937$.getDynamicValue(var3);
    }
    
    public static SubLObject f38707(SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = f38705();
        }
        return module0633.f38742(var2, $ic2$, $ic3$);
    }
    
    public static SubLObject f38708() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0632", "f38705", "S#32786", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0632", "f38706", "S#42442", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0632", "f38707", "S#42443", 0, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38709() {
        $g4937$ = SubLFiles.defparameter("S#42444", $ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38710() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f38708();
    }
    
    public void initializeVariables() {
        f38709();
    }
    
    public void runTopLevelForms() {
        f38710();
    }
    
    static {
        me = (SubLFile)new module0632();
        $g4937$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("TestVocabularyMt"));
        $ic1$ = makeSymbol("S#16717", "CYC");
        $ic2$ = constant_handles_oc.f8479((SubLObject)makeString("Now"));
        $ic3$ = constant_handles_oc.f8479((SubLObject)makeString("Null-TimeParameter"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 36 ms
	
	Decompiled with Procyon 0.5.32.
*/