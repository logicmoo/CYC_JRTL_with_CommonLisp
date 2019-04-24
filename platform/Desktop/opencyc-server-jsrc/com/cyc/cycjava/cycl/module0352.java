package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0352 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0352";
    public static final String myFingerPrint = "7de194988eca5038911999c80d9b181503da81fcb46454efbfc11a8c58df3c9b";
    public static SubLSymbol $g2992$;
    public static SubLSymbol $g2993$;
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLString $ic3$;
    private static final SubLSymbol $ic4$;
    
    public static SubLObject f23589(final SubLObject var1) {
        f23590(var1);
        return Dynamic.sublisp_throw((SubLObject)module0352.$ic0$, (SubLObject)module0352.T);
    }
    
    public static SubLObject f23590(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0352.NIL != module0018.$g629$.getDynamicValue(var2)) {
            SubLObject var3 = (SubLObject)module0352.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)module0352.$ic1$);
            var3 = var1.first();
            SubLObject var4 = var1.rest();
            final SubLObject var5 = (SubLObject)(var4.isCons() ? var4.first() : module0352.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(var4, var1, (SubLObject)module0352.$ic1$);
            final SubLObject var6;
            var4 = (var6 = var4.rest());
            if (module0352.NIL != var5) {
                Functions.apply(Symbols.symbol_function((SubLObject)module0352.$ic2$), var5, var6);
            }
            else {
                Errors.warn((SubLObject)module0352.$ic3$, var3);
            }
        }
        return (SubLObject)module0352.NIL;
    }
    
    public static SubLObject f23591() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0352", "f23589", "S#26273", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0352", "f23590", "S#25129", 1, 0, false);
        return (SubLObject)module0352.NIL;
    }
    
    public static SubLObject f23592() {
        module0352.$g2992$ = SubLFiles.defparameter("S#26274", (SubLObject)module0352.$ic4$);
        module0352.$g2993$ = SubLFiles.defparameter("S#26275", (SubLObject)module0352.NIL);
        return (SubLObject)module0352.NIL;
    }
    
    public static SubLObject f23593() {
        return (SubLObject)module0352.NIL;
    }
    
    public void declareFunctions() {
        f23591();
    }
    
    public void initializeVariables() {
        f23592();
    }
    
    public void runTopLevelForms() {
        f23593();
    }
    
    static {
        me = (SubLFile)new module0352();
        module0352.$g2992$ = null;
        module0352.$g2993$ = null;
        $ic0$ = SubLObjectFactory.makeKeyword("INFERENCE-REJECTED");
        $ic1$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#159", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26276", "CYC"));
        $ic2$ = SubLObjectFactory.makeSymbol("WARN");
        $ic3$ = SubLObjectFactory.makeString("Inference rejected : ~S");
        $ic4$ = SubLObjectFactory.makeKeyword("NONE");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0352.class
	Total time: 22 ms
	
	Decompiled with Procyon 0.5.32.
*/