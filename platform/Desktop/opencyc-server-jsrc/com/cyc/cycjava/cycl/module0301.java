package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0301 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0301";
    public static final String myFingerPrint = "dcd44590712798797edb6835f49e333dded220514e799f070144582754700257";
    public static SubLSymbol $g2697$;
    public static SubLSymbol $g2698$;
    public static SubLSymbol $g2699$;
    public static SubLSymbol $g2700$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLList $ic3$;
    private static final SubLList $ic4$;
    
    public static SubLObject f20023(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0301.UNPROVIDED) {
            var2 = (SubLObject)module0301.NIL;
        }
        if (var3 == module0301.UNPROVIDED) {
            var3 = (SubLObject)module0301.NIL;
        }
        SubLObject var4 = (SubLObject)module0301.NIL;
        SubLObject var5 = var1;
        SubLObject var6 = (SubLObject)module0301.NIL;
        var6 = var5.first();
        while (module0301.NIL != var5) {
            var4 = (SubLObject)ConsesLow.cons(module0293.f19713(var6, var2, var3), var4);
            var5 = var5.rest();
            var6 = var5.first();
        }
        return Sequences.nreverse(var4);
    }
    
    public static SubLObject f20024(final SubLObject var7, final SubLObject var2, SubLObject var8) {
        if (var8 == module0301.UNPROVIDED) {
            var8 = (SubLObject)module0301.ZERO_INTEGER;
        }
        SubLObject var9 = (SubLObject)module0301.NIL;
        SubLObject var10 = (SubLObject)module0301.NIL;
        SubLObject var11 = var7;
        SubLObject var12 = (SubLObject)module0301.NIL;
        var12 = var11.first();
        while (module0301.NIL != var11) {
            var9 = f20025(var12, var2, var8);
            if (module0301.NIL != module0202.f12590(var9)) {
                var10 = (SubLObject)ConsesLow.cons(var9, var10);
            }
            var11 = var11.rest();
            var12 = var11.first();
        }
        return var10;
    }
    
    public static SubLObject f20025(final SubLObject var10, final SubLObject var2, SubLObject var8) {
        if (var8 == module0301.UNPROVIDED) {
            var8 = (SubLObject)module0301.ZERO_INTEGER;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        return f20026(module0293.f19713(var10, var2, (module0301.NIL != var8) ? Sequences.cconcatenate(module0301.$g2697$.getDynamicValue(var11), (SubLObject)ConsesLow.list((SubLObject)module0301.$ic1$, var8)) : module0301.$g2697$.getDynamicValue(var11)), var10);
    }
    
    public static SubLObject f20027(final SubLObject var10, final SubLObject var2, SubLObject var8) {
        if (var8 == module0301.UNPROVIDED) {
            var8 = (SubLObject)module0301.ZERO_INTEGER;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        return f20026(module0293.f19713(var10, var2, (module0301.NIL != var8) ? Sequences.cconcatenate(module0301.$g2698$.getDynamicValue(var11), (SubLObject)ConsesLow.list((SubLObject)module0301.$ic1$, var8)) : module0301.$g2698$.getDynamicValue(var11)), (SubLObject)ConsesLow.list(var10));
    }
    
    public static SubLObject f20028(final SubLObject var10, final SubLObject var2, SubLObject var8) {
        if (var8 == module0301.UNPROVIDED) {
            var8 = (SubLObject)module0301.ZERO_INTEGER;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        return f20026(module0293.f19713(var10, var2, (module0301.NIL != var8) ? Sequences.cconcatenate(module0301.$g2699$.getDynamicValue(var11), (SubLObject)ConsesLow.list((SubLObject)module0301.$ic1$, var8)) : module0301.$g2699$.getDynamicValue(var11)), var10);
    }
    
    public static SubLObject f20026(final SubLObject var12, final SubLObject var13) {
        return (module0301.NIL != var12) ? var12 : var13;
    }
    
    public static SubLObject f20029(final SubLObject var10, final SubLObject var2, SubLObject var8) {
        if (var8 == module0301.UNPROVIDED) {
            var8 = (SubLObject)module0301.NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        return f20026(module0293.f19713(var10, var2, (module0301.NIL != var8) ? Sequences.cconcatenate(module0301.$g2700$.getDynamicValue(var11), (SubLObject)ConsesLow.list((SubLObject)module0301.$ic1$, var8)) : module0301.$g2700$.getDynamicValue(var11)), var10);
    }
    
    public static SubLObject f20030() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0301", "f20023", "S#22659", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0301", "f20024", "S#22660", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0301", "f20025", "S#22661", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0301", "f20027", "S#22662", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0301", "f20028", "S#22663", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0301", "f20026", "S#22664", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0301", "f20029", "S#22665", 2, 1, false);
        return (SubLObject)module0301.NIL;
    }
    
    public static SubLObject f20031() {
        module0301.$g2697$ = SubLFiles.defparameter("S#22666", (SubLObject)module0301.$ic0$);
        module0301.$g2698$ = SubLFiles.defparameter("S#22667", (SubLObject)module0301.$ic2$);
        module0301.$g2699$ = SubLFiles.defparameter("S#22668", (SubLObject)module0301.$ic3$);
        module0301.$g2700$ = SubLFiles.defparameter("S#22669", (SubLObject)module0301.$ic4$);
        return (SubLObject)module0301.NIL;
    }
    
    public static SubLObject f20032() {
        return (SubLObject)module0301.NIL;
    }
    
    public void declareFunctions() {
        f20030();
    }
    
    public void initializeVariables() {
        f20031();
    }
    
    public void runTopLevelForms() {
        f20032();
    }
    
    static {
        me = (SubLFile)new module0301();
        module0301.$g2697$ = null;
        module0301.$g2698$ = null;
        module0301.$g2699$ = null;
        module0301.$g2700$ = null;
        $ic0$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FOCUS"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("QueryProcessingRLModule")));
        $ic1$ = SubLObjectFactory.makeKeyword("RECURSION-LIMIT");
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FOCUS"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("WffViolationResolutionRLModule")));
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FOCUS"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("DatesReformulatorRLModule")));
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MODES"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("ReformulatorMode-Simplify"))));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0301.class
	Total time: 53 ms
	
	Decompiled with Procyon 0.5.32.
*/