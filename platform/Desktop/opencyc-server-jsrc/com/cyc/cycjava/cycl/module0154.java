package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0154 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0154";
    public static final String myFingerPrint = "23b7d1587e189d94f3fd05e41b295f4dacbc40cb4a56cb8453a2e96b4fe7ec6c";
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    
    public static SubLObject f9767(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0154.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0154.$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        if (module0154.NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)module0154.$ic1$, (SubLObject)module0154.$ic2$, (SubLObject)ConsesLow.list((SubLObject)module0154.$ic3$, var5));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0154.$ic0$);
        return (SubLObject)module0154.NIL;
    }
    
    public static SubLObject f9768() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0154", "f9767", "S#10713");
        return (SubLObject)module0154.NIL;
    }
    
    public static SubLObject f9769() {
        return (SubLObject)module0154.NIL;
    }
    
    public static SubLObject f9770() {
        return (SubLObject)module0154.NIL;
    }
    
    public void declareFunctions() {
        f9768();
    }
    
    public void initializeVariables() {
        f9769();
    }
    
    public void runTopLevelForms() {
        f9770();
    }
    
    static {
        me = (SubLFile)new module0154();
        $ic0$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#151", "CYC"));
        $ic1$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic2$ = SubLObjectFactory.makeSymbol("S#10711", "CYC");
        $ic3$ = SubLObjectFactory.makeSymbol("S#10685", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0154.class
	Total time: 14 ms
	
	Decompiled with Procyon 0.5.32.
*/