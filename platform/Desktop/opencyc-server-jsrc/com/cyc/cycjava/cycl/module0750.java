package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        return $g5987$.getGlobalValue();
    }
    
    public static SubLObject f46572() {
        $g5987$.setGlobalValue((SubLObject)T);
        return $g5987$.getGlobalValue();
    }
    
    public static SubLObject f46573() {
        $g5987$.setGlobalValue((SubLObject)NIL);
        return $g5987$.getGlobalValue();
    }
    
    public static SubLObject f46574() {
        $g5986$.setGlobalValue((SubLObject)T);
        return $g5986$.getGlobalValue();
    }
    
    public static SubLObject f46575() {
        $g5986$.setGlobalValue((SubLObject)NIL);
        return $g5986$.getGlobalValue();
    }
    
    public static SubLObject f46576() {
        return $g5986$.getGlobalValue();
    }
    
    public static SubLObject f46577() {
        SubLObject var1 = (SubLObject)NIL;
        if (NIL != f46571()) {
            var1 = (SubLObject)T;
        }
        else if (NIL == module0749.f46336()) {
            Errors.warn((SubLObject)$ic4$);
            var1 = (SubLObject)T;
        }
        else if (NIL != f46578()) {
            Errors.warn((SubLObject)$ic5$);
            var1 = (SubLObject)T;
        }
        if (NIL != var1) {
            f46572();
        }
        else {
            f46573();
        }
        return var1;
    }
    
    public static SubLObject f46579() {
        SubLObject var1 = (SubLObject)NIL;
        if (NIL != $g5985$.getGlobalValue() && NIL == var1) {
            SubLObject var2;
            SubLObject var3;
            for (var2 = $g5988$.getGlobalValue(), var3 = (SubLObject)NIL, var3 = var2.first(); NIL == var1 && NIL != var2; var1 = f46580(var3, (SubLObject)UNPROVIDED), var2 = var2.rest(), var3 = var2.first()) {}
        }
        return var1;
    }
    
    public static SubLObject f46578() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = module0034.$g879$.getDynamicValue(var4);
        SubLObject var6 = (SubLObject)NIL;
        if (NIL == var5) {
            return f46579();
        }
        var6 = module0034.f1857(var5, (SubLObject)$ic6$, (SubLObject)UNPROVIDED);
        if (NIL == var6) {
            var6 = module0034.f1807(module0034.f1842(var5), (SubLObject)$ic6$, (SubLObject)ZERO_INTEGER, (SubLObject)NIL, (SubLObject)EQ, (SubLObject)UNPROVIDED);
            module0034.f1860(var5, (SubLObject)$ic6$, var6);
        }
        SubLObject var7 = module0034.f1810(var6, (SubLObject)UNPROVIDED);
        if (var7 == $ic7$) {
            var7 = Values.arg2(var4.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f46579()));
            module0034.f1812(var6, var7, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var7);
    }
    
    public static SubLObject f46581() {
        return (SubLObject)makeBoolean(NIL == module0035.f2014($g5985$.getGlobalValue()));
    }
    
    public static SubLObject f46582() {
        f46583();
        return $g5985$.getGlobalValue();
    }
    
    public static SubLObject f46583() {
        f46584();
        SubLObject var8 = $g5988$.getGlobalValue();
        SubLObject var9 = (SubLObject)NIL;
        var9 = var8.first();
        while (NIL != var8) {
            $g5985$.setGlobalValue(module0035.f2063($g5985$.getGlobalValue(), var9, Symbols.symbol_value(var9), (SubLObject)UNPROVIDED));
            var8 = var8.rest();
            var9 = var8.first();
        }
        f46575();
        return $g5985$.getGlobalValue();
    }
    
    public static SubLObject f46584() {
        $g5985$.setGlobalValue((SubLObject)NIL);
        return $g5985$.getGlobalValue();
    }
    
    public static SubLObject f46580(final SubLObject var3, SubLObject var9) {
        if (var9 == UNPROVIDED) {
            var9 = (SubLObject)T;
        }
        final SubLObject var10 = module0035.f2293($g5985$.getGlobalValue(), var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var11 = Symbols.symbol_value(var3);
        final SubLObject var12 = Equality.equal(var10, var11);
        if (NIL == var12 && NIL != var9) {
            Errors.warn((SubLObject)$ic8$, var3);
        }
        return (SubLObject)makeBoolean(NIL == var12);
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f46586() {
        $g5985$ = SubLFiles.deflexical("S#50940", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic0$)) ? $g5985$.getGlobalValue() : NIL));
        $g5986$ = SubLFiles.deflexical("S#50941", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic1$)) ? $g5986$.getGlobalValue() : NIL));
        $g5987$ = SubLFiles.deflexical("S#50942", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic2$)) ? $g5987$.getGlobalValue() : NIL));
        $g5988$ = SubLFiles.deflexical("S#50943", (SubLObject)$ic3$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f46587() {
        module0003.f57((SubLObject)$ic0$);
        module0003.f57((SubLObject)$ic1$);
        module0003.f57((SubLObject)$ic2$);
        module0034.f1895((SubLObject)$ic6$);
        return (SubLObject)NIL;
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
        $g5985$ = null;
        $g5986$ = null;
        $g5987$ = null;
        $g5988$ = null;
        $ic0$ = makeSymbol("S#50940", "CYC");
        $ic1$ = makeSymbol("S#50941", "CYC");
        $ic2$ = makeSymbol("S#50942", "CYC");
        $ic3$ = ConsesLow.list((SubLObject)makeSymbol("S#39021", "CYC"));
        $ic4$ = makeString("gen-template store not present.~%");
        $ic5$ = makeString("gen-template store built with stale code~%");
        $ic6$ = makeSymbol("S#50935", "CYC");
        $ic7$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic8$ = makeString("gen-template store built with stale version of ~S~%");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 73 ms
	
	Decompiled with Procyon 0.5.32.
*/