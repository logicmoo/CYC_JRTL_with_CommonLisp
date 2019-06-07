package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0638 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0638";
    public static final String myFingerPrint = "ae9c837e6a8379f5eddeaccdd4066d1148a7ea7dd38a5a9c532d598c873b5947";
    public static SubLSymbol $g4952$;
    private static SubLSymbol $g4953$;
    private static SubLSymbol $g4954$;
    private static SubLSymbol $g4955$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLString $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    
    public static SubLObject f38942() {
        $g4952$.setDynamicValue((SubLObject)T);
        return f38943();
    }
    
    public static SubLObject f38944() {
        $g4952$.setDynamicValue((SubLObject)NIL);
        return f38943();
    }
    
    public static SubLObject f38943() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g4952$.getDynamicValue(var1);
    }
    
    public static SubLObject f38945(final SubLObject var2, final SubLObject var3) {
        final SubLObject var4 = var2.rest();
        final SubLObject var6;
        final SubLObject var5 = var6 = var4;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic3$, (SubLObject)$ic4$, ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f38946(final SubLObject var2, final SubLObject var3) {
        final SubLObject var4 = var2.rest();
        final SubLObject var6;
        final SubLObject var5 = var6 = var4;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic3$, (SubLObject)$ic5$, ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f38947() {
        return module0118.f8175((SubLObject)$ic7$);
    }
    
    public static SubLObject f38948() {
        if (NIL == f38947()) {
            f38949();
        }
        return module0118.f8177();
    }
    
    public static SubLObject f38950(final SubLObject var9) {
        final SubLObject var10 = $g4953$.getGlobalValue();
        SubLObject var11 = (SubLObject)NIL;
        try {
            var11 = Locks.seize_lock(var10);
            if (NIL == Sequences.find(var9, $g4954$.getGlobalValue(), (SubLObject)EQUALP, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                $g4954$.setGlobalValue((SubLObject)ConsesLow.cons(var9, $g4954$.getGlobalValue()));
                if (NIL != f38947()) {
                    module0117.f8156(var9, (SubLObject)NIL);
                }
            }
        }
        finally {
            if (NIL != var11) {
                Locks.release_lock(var10);
            }
        }
        return var9;
    }
    
    public static SubLObject f38951(final SubLObject var12) {
        final SubLObject var13 = $g4953$.getGlobalValue();
        SubLObject var14 = (SubLObject)NIL;
        try {
            var14 = Locks.seize_lock(var13);
            $g4954$.setGlobalValue(Sequences.remove(var12, $g4954$.getGlobalValue(), (SubLObject)EQUALP, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            if (NIL != f38947()) {
                module0117.f8158(var12, (SubLObject)NIL);
            }
        }
        finally {
            if (NIL != var14) {
                Locks.release_lock(var13);
            }
        }
        return var12;
    }
    
    public static SubLObject f38952() {
        return module0118.f8181((SubLObject)$ic7$);
    }
    
    public static SubLObject f38949() {
        return module0118.f8178((SubLObject)$ic7$);
    }
    
    public static SubLObject f38953(final SubLObject var15, final SubLObject var16, final SubLObject var17, final SubLObject var18) {
        if (NIL != f38954()) {
            module0117.f8161(f38955((SubLObject)ConsesLow.list(var15, var16, var17, var18)), f38956());
        }
        return var15;
    }
    
    public static SubLObject f38955(final SubLObject var15) {
        return module0116.f8064((SubLObject)$ic2$, var15, module0723.f44261());
    }
    
    public static SubLObject f38956() {
        return module0117.f8146();
    }
    
    public static SubLObject f38954() {
        if (NIL != module0011.f350() && NIL != module0018.f984() && NIL != f38943()) {
            f38948();
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38957() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0638", "f38942", "S#42662", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0638", "f38944", "S#42663", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0638", "f38943", "S#42664", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0638", "f38945", "S#42665");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0638", "f38946", "WITHOUT-UNLEXIFIED-TERM-DISCOVERY-LOGGING");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0638", "f38947", "S#42666", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0638", "f38948", "S#42667", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0638", "f38950", "S#42668", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0638", "f38951", "S#42669", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0638", "f38952", "S#42670", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0638", "f38949", "S#42671", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0638", "f38953", "S#42672", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0638", "f38955", "S#42673", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0638", "f38956", "S#42674", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0638", "f38954", "S#42675", 0, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38958() {
        $g4952$ = SubLFiles.defparameter("S#42676", (SubLObject)NIL);
        $g4953$ = SubLFiles.deflexical("S#42677", Locks.make_lock((SubLObject)$ic6$));
        $g4954$ = SubLFiles.deflexical("S#42678", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic7$)) ? $g4954$.getGlobalValue() : NIL));
        $g4955$ = SubLFiles.deflexical("S#42679", module0117.f8104((SubLObject)$ic2$, (SubLObject)$ic8$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38959() {
        module0116.f8043((SubLObject)$ic0$, (SubLObject)$ic1$, (SubLObject)NIL);
        module0116.f8043((SubLObject)$ic2$, (SubLObject)$ic0$, (SubLObject)NIL);
        module0003.f57((SubLObject)$ic7$);
        f38950($g4955$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f38957();
    }
    
    public void initializeVariables() {
        f38958();
    }
    
    public void runTopLevelForms() {
        f38959();
    }
    
    static {
        me = (SubLFile)new module0638();
        $g4952$ = null;
        $g4953$ = null;
        $g4954$ = null;
        $g4955$ = null;
        $ic0$ = makeKeyword("MISSING-KNOWLEDGE-DISCOVERY-EVENT");
        $ic1$ = makeKeyword("CYC-APPLICATION-EVENT");
        $ic2$ = makeKeyword("UNLEXIFIED-TERM-DISCOVERY-EVENT");
        $ic3$ = makeSymbol("CLET");
        $ic4$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#42676", "CYC"), (SubLObject)T));
        $ic5$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#42676", "CYC"), (SubLObject)NIL));
        $ic6$ = makeString("MISSING-KNOWLEDGE-DISCOVERY-EVENT-DISPATCHER Lock");
        $ic7$ = makeSymbol("S#42678", "CYC");
        $ic8$ = makeSymbol("S#42680", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 59 ms
	
	Decompiled with Procyon 0.5.32.
*/