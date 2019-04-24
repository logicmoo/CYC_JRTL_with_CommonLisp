package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0750 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0750";
    public static final String myFingerPrint = "1c589a386c74a589c30dcf2f5957902d9e74e1f7db6629ebd691ec9395de5c68";
    private static SubLSymbol $g5985$;
    private static SubLSymbol $g5986$;
    private static SubLSymbol $g5987$;
    private static SubLSymbol $g5988$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLString $ic4$;
    private static final SubLString $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLString $ic8$;
    
    public static SubLObject f46571() {
        return module0750.$g5987$.getGlobalValue();
    }
    
    public static SubLObject f46572() {
        module0750.$g5987$.setGlobalValue((SubLObject)module0750.T);
        return module0750.$g5987$.getGlobalValue();
    }
    
    public static SubLObject f46573() {
        module0750.$g5987$.setGlobalValue((SubLObject)module0750.NIL);
        return module0750.$g5987$.getGlobalValue();
    }
    
    public static SubLObject f46574() {
        module0750.$g5986$.setGlobalValue((SubLObject)module0750.T);
        return module0750.$g5986$.getGlobalValue();
    }
    
    public static SubLObject f46575() {
        module0750.$g5986$.setGlobalValue((SubLObject)module0750.NIL);
        return module0750.$g5986$.getGlobalValue();
    }
    
    public static SubLObject f46576() {
        return module0750.$g5986$.getGlobalValue();
    }
    
    public static SubLObject f46577() {
        SubLObject var1 = (SubLObject)module0750.NIL;
        if (module0750.NIL != f46571()) {
            var1 = (SubLObject)module0750.T;
        }
        else if (module0750.NIL == module0749.f46336()) {
            Errors.warn((SubLObject)module0750.$ic4$);
            var1 = (SubLObject)module0750.T;
        }
        else if (module0750.NIL != f46578()) {
            Errors.warn((SubLObject)module0750.$ic5$);
            var1 = (SubLObject)module0750.T;
        }
        if (module0750.NIL != var1) {
            f46572();
        }
        else {
            f46573();
        }
        return var1;
    }
    
    public static SubLObject f46579() {
        SubLObject var1 = (SubLObject)module0750.NIL;
        if (module0750.NIL != module0750.$g5985$.getGlobalValue() && module0750.NIL == var1) {
            SubLObject var2;
            SubLObject var3;
            for (var2 = module0750.$g5988$.getGlobalValue(), var3 = (SubLObject)module0750.NIL, var3 = var2.first(); module0750.NIL == var1 && module0750.NIL != var2; var1 = f46580(var3, (SubLObject)module0750.UNPROVIDED), var2 = var2.rest(), var3 = var2.first()) {}
        }
        return var1;
    }
    
    public static SubLObject f46578() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = module0034.$g879$.getDynamicValue(var4);
        SubLObject var6 = (SubLObject)module0750.NIL;
        if (module0750.NIL == var5) {
            return f46579();
        }
        var6 = module0034.f1857(var5, (SubLObject)module0750.$ic6$, (SubLObject)module0750.UNPROVIDED);
        if (module0750.NIL == var6) {
            var6 = module0034.f1807(module0034.f1842(var5), (SubLObject)module0750.$ic6$, (SubLObject)module0750.ZERO_INTEGER, (SubLObject)module0750.NIL, (SubLObject)module0750.EQ, (SubLObject)module0750.UNPROVIDED);
            module0034.f1860(var5, (SubLObject)module0750.$ic6$, var6);
        }
        SubLObject var7 = module0034.f1810(var6, (SubLObject)module0750.UNPROVIDED);
        if (var7 == module0750.$ic7$) {
            var7 = Values.arg2(var4.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f46579()));
            module0034.f1812(var6, var7, (SubLObject)module0750.UNPROVIDED);
        }
        return module0034.f1959(var7);
    }
    
    public static SubLObject f46581() {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0750.NIL == module0035.f2014(module0750.$g5985$.getGlobalValue()));
    }
    
    public static SubLObject f46582() {
        f46583();
        return module0750.$g5985$.getGlobalValue();
    }
    
    public static SubLObject f46583() {
        f46584();
        SubLObject var8 = module0750.$g5988$.getGlobalValue();
        SubLObject var9 = (SubLObject)module0750.NIL;
        var9 = var8.first();
        while (module0750.NIL != var8) {
            module0750.$g5985$.setGlobalValue(module0035.f2063(module0750.$g5985$.getGlobalValue(), var9, Symbols.symbol_value(var9), (SubLObject)module0750.UNPROVIDED));
            var8 = var8.rest();
            var9 = var8.first();
        }
        f46575();
        return module0750.$g5985$.getGlobalValue();
    }
    
    public static SubLObject f46584() {
        module0750.$g5985$.setGlobalValue((SubLObject)module0750.NIL);
        return module0750.$g5985$.getGlobalValue();
    }
    
    public static SubLObject f46580(final SubLObject var3, SubLObject var9) {
        if (var9 == module0750.UNPROVIDED) {
            var9 = (SubLObject)module0750.T;
        }
        final SubLObject var10 = module0035.f2293(module0750.$g5985$.getGlobalValue(), var3, (SubLObject)module0750.UNPROVIDED, (SubLObject)module0750.UNPROVIDED);
        final SubLObject var11 = Symbols.symbol_value(var3);
        final SubLObject var12 = Equality.equal(var10, var11);
        if (module0750.NIL == var12 && module0750.NIL != var9) {
            Errors.warn((SubLObject)module0750.$ic8$, var3);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0750.NIL == var12);
    }
    
    public static SubLObject f46585() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0750", "f46571", "S#50930", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0750", "f46572", "S#50931", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0750", "f46573", "S#50668", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0750", "f46574", "S#50932", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0750", "f46575", "S#50933", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0750", "f46576", "S#50515", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0750", "f46577", "S#50516", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0750", "f46579", "S#50934", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0750", "f46578", "S#50935", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0750", "f46581", "S#50936", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0750", "f46582", "S#50937", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0750", "f46583", "S#50667", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0750", "f46584", "S#50938", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0750", "f46580", "S#50939", 1, 1, false);
        return (SubLObject)module0750.NIL;
    }
    
    public static SubLObject f46586() {
        module0750.$g5985$ = SubLFiles.deflexical("S#50940", (SubLObject)((module0750.NIL != Symbols.boundp((SubLObject)module0750.$ic0$)) ? module0750.$g5985$.getGlobalValue() : module0750.NIL));
        module0750.$g5986$ = SubLFiles.deflexical("S#50941", (SubLObject)((module0750.NIL != Symbols.boundp((SubLObject)module0750.$ic1$)) ? module0750.$g5986$.getGlobalValue() : module0750.NIL));
        module0750.$g5987$ = SubLFiles.deflexical("S#50942", (SubLObject)((module0750.NIL != Symbols.boundp((SubLObject)module0750.$ic2$)) ? module0750.$g5987$.getGlobalValue() : module0750.NIL));
        module0750.$g5988$ = SubLFiles.deflexical("S#50943", (SubLObject)module0750.$ic3$);
        return (SubLObject)module0750.NIL;
    }
    
    public static SubLObject f46587() {
        module0003.f57((SubLObject)module0750.$ic0$);
        module0003.f57((SubLObject)module0750.$ic1$);
        module0003.f57((SubLObject)module0750.$ic2$);
        module0034.f1895((SubLObject)module0750.$ic6$);
        return (SubLObject)module0750.NIL;
    }
    
    public void declareFunctions() {
        f46585();
    }
    
    public void initializeVariables() {
        f46586();
    }
    
    public void runTopLevelForms() {
        f46587();
    }
    
    static {
        me = (SubLFile)new module0750();
        module0750.$g5985$ = null;
        module0750.$g5986$ = null;
        module0750.$g5987$ = null;
        module0750.$g5988$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#50940", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#50941", "CYC");
        $ic2$ = SubLObjectFactory.makeSymbol("S#50942", "CYC");
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39021", "CYC"));
        $ic4$ = SubLObjectFactory.makeString("gen-template store not present.~%");
        $ic5$ = SubLObjectFactory.makeString("gen-template store built with stale code~%");
        $ic6$ = SubLObjectFactory.makeSymbol("S#50935", "CYC");
        $ic7$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic8$ = SubLObjectFactory.makeString("gen-template store built with stale version of ~S~%");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0750.class
	Total time: 73 ms
	
	Decompiled with Procyon 0.5.32.
*/