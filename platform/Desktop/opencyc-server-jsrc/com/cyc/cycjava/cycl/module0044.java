package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0044 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0044";
    public static final String myFingerPrint = "17bdb2db9cd3d77a03027441c4d9c5c85e236bc8993805bcd3b70c23c8ea6a16";
    public static SubLSymbol $g966$;
    private static SubLSymbol $g967$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    
    
    public static SubLObject f3126(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var1.isCons() && var1.first().eql(module0044.$g966$.getGlobalValue()) && conses_high.second(var1).isFunctionSpec() && module0044.NIL != module0035.f2327(var1));
    }
    
    public static SubLObject f3127(final SubLObject var2) {
        if (!var2.first().eql(module0044.$g966$.getGlobalValue()) && !module0044.areAssertionsDisabledFor(me) && module0044.NIL == f3126(var2)) {
            throw new AssertionError(var2);
        }
        final SubLObject var3 = conses_high.second(var2);
        assert module0044.NIL != Types.function_spec_p(var3) : var3;
        return var3;
    }
    
    public static SubLObject f3128(final SubLObject var2) {
        assert module0044.NIL != f3126(var2) : var2;
        final SubLObject var3 = var2.rest();
        final SubLObject var4 = var3.rest();
        return var4;
    }
    
    public static SubLObject f3129(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        SubLObject var8 = (SubLObject)module0044.NIL;
        final SubLObject var9 = module0044.$g967$.currentBinding(var7);
        try {
            module0044.$g967$.bind((SubLObject)module0044.NIL, var7);
            visitation.visit_defstruct(var6, Symbols.symbol_function((SubLObject)module0044.$ic3$));
            var8 = module0044.$g967$.getDynamicValue(var7);
        }
        finally {
            module0044.$g967$.rebind(var9, var7);
        }
        return var8;
    }
    
    public static SubLObject f3130(final SubLObject var1, final SubLObject var9, final SubLObject var10, final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        if (var9.eql((SubLObject)module0044.$ic4$)) {
            module0044.$g967$.setDynamicValue((SubLObject)module0044.NIL, var12);
        }
        else if (var9.eql((SubLObject)module0044.$ic5$)) {
            module0044.$g967$.setDynamicValue((SubLObject)ConsesLow.cons(var10, (SubLObject)ConsesLow.cons(var11, module0044.$g967$.getDynamicValue(var12))), var12);
        }
        else if (var9.eql((SubLObject)module0044.$ic6$)) {
            module0044.$g967$.setDynamicValue((SubLObject)ConsesLow.cons(module0044.$g966$.getGlobalValue(), (SubLObject)ConsesLow.cons(var10, module0044.$g967$.getDynamicValue(var12))), var12);
        }
        return var1;
    }
    
    public static SubLObject f3131(final SubLObject var2) {
        assert module0044.NIL != f3126(var2) : var2;
        final SubLObject var3 = f3127(var2);
        final SubLObject var4 = f3128(var2);
        return Functions.funcall(var3, var4);
    }
    
    public static SubLObject f3132() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0044", "f3126", "S#4503", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0044", "f3127", "S#4504", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0044", "f3128", "S#4505", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0044", "f3129", "S#4506", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0044", "f3130", "S#4507", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0044", "f3131", "S#4508", 1, 0, false);
        return (SubLObject)module0044.NIL;
    }
    
    public static SubLObject f3133() {
        module0044.$g966$ = SubLFiles.defconstant("S#4509", (SubLObject)module0044.$ic0$);
        module0044.$g967$ = SubLFiles.defparameter("S#4510", (SubLObject)module0044.NIL);
        return (SubLObject)module0044.NIL;
    }
    
    public static SubLObject f3134() {
        return (SubLObject)module0044.NIL;
    }
    
    public void declareFunctions() {
        f3132();
    }
    
    public void initializeVariables() {
        f3133();
    }
    
    public void runTopLevelForms() {
        f3134();
    }
    
    static {
        me = (SubLFile)new module0044();
        module0044.$g966$ = null;
        module0044.$g967$ = null;
        $ic0$ = SubLObjectFactory.makeKeyword("%%CONSTRUCTOR");
        $ic1$ = SubLObjectFactory.makeSymbol("S#4503", "CYC");
        $ic2$ = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $ic3$ = SubLObjectFactory.makeSymbol("S#4507", "CYC");
        $ic4$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic5$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic6$ = SubLObjectFactory.makeKeyword("END");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0044.class
	Total time: 53 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/