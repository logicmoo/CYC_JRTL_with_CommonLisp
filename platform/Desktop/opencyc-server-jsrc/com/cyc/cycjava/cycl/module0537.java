package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0537 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0537";
    public static final String myFingerPrint = "f46516c715c42045f30e3a9f91cc213d6dbe01d67b1974e99fdc221b1613b790";
    private static SubLSymbol $g3919$;
    private static final SubLList $ic0$;
    private static final SubLList $ic1$;
    private static final SubLObject $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    
    public static SubLObject f33301() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return conses_high.copy_list($g3919$.getDynamicValue(var1));
    }
    
    public static SubLObject f33302(final SubLObject var2, final SubLObject var3) {
        final SubLObject var4 = module0362.f24465(inference_datastructures_inference_oc.f25487(var3));
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = var2;
        SubLObject var7 = (SubLObject)NIL;
        var7 = var6.first();
        while (NIL != var6) {
            SubLObject var9;
            final SubLObject var8 = var9 = var7;
            SubLObject var10 = (SubLObject)NIL;
            SubLObject var11 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic1$);
            var10 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic1$);
            var11 = var9.first();
            var9 = var9.rest();
            if (NIL == var9) {
                if (NIL != module0035.f1997(var11)) {
                    final SubLObject var12 = var11.first();
                    final SubLObject var13 = module0191.f11967(var12);
                    if (NIL == module0235.f15475(var4, var13, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        var5 = (SubLObject)ConsesLow.cons(var7, var5);
                    }
                }
                else {
                    var5 = (SubLObject)ConsesLow.cons(var7, var5);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var8, (SubLObject)$ic1$);
            }
            var6 = var6.rest();
            var7 = var6.first();
        }
        return Sequences.nreverse(var5);
    }
    
    public static SubLObject f33303(final SubLObject var14, final SubLObject var15, SubLObject var16, SubLObject var17, SubLObject var18) {
        if (var16 == UNPROVIDED) {
            var16 = (SubLObject)NIL;
        }
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)T;
        }
        final SubLThread var19 = SubLProcess.currentSubLThread();
        final SubLObject var20 = module0035.f2340(f33301(), var16);
        SubLObject var21 = (SubLObject)NIL;
        SubLObject var22 = (SubLObject)NIL;
        SubLObject var23 = (SubLObject)NIL;
        final SubLObject var24 = module0377.$g3199$.currentBinding(var19);
        try {
            module0377.$g3199$.bind(var18, var19);
            var19.resetMultipleValues();
            final SubLObject var22_23 = module0409.f28506(var14, var15, var20);
            final SubLObject var24_25 = var19.secondMultipleValue();
            final SubLObject var26_27 = var19.thirdMultipleValue();
            var19.resetMultipleValues();
            var21 = var22_23;
            var22 = var24_25;
            var23 = var26_27;
        }
        finally {
            module0377.$g3199$.rebind(var24, var19);
        }
        var21 = f33302(var21, var23);
        if (var17.isFunctionSpec()) {
            var21 = Sort.sort(var21, var17, (SubLObject)UNPROVIDED);
        }
        return Values.values(var21, var22, var23);
    }
    
    public static SubLObject f33304(final SubLObject var28) {
        return module0205.f13373(var28, $ic2$);
    }
    
    public static SubLObject f33305(final SubLObject var29) {
        return (SubLObject)makeBoolean(NIL != module0191.f11952(var29) && module0191.f11966(var29) == $ic3$);
    }
    
    public static SubLObject f33306(final SubLObject var11) {
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = var11;
        SubLObject var14 = (SubLObject)NIL;
        var14 = var13.first();
        while (NIL != var13) {
            if (NIL != f33305(var14)) {
                var12 = (SubLObject)ConsesLow.cons(var14, var12);
            }
            var13 = var13.rest();
            var14 = var13.first();
        }
        return Sequences.nreverse(var12);
    }
    
    public static SubLObject f33307(final SubLObject var32) {
        return f33306(module0366.f24971(var32));
    }
    
    public static SubLObject f33308(final SubLObject var32) {
        final SubLObject var33 = Sequences.length(module0366.f24971(var32));
        return (SubLObject)(var33.isPositive() ? Numbers.divide(Sequences.length(f33307(var32)), var33) : ZERO_INTEGER);
    }
    
    public static SubLObject f33309(final SubLObject var34) {
        return f33306(inference_datastructures_inference_oc.f25775(var34));
    }
    
    public static SubLObject f33310(final SubLObject var34) {
        return Sequences.length(f33309(var34));
    }
    
    public static SubLObject f33311(final SubLObject var35) {
        final SubLObject var36 = Mapping.mapcar((SubLObject)$ic4$, inference_datastructures_inference_oc.f25744(var35));
        return module0035.f2378(var36, Symbols.symbol_function((SubLObject)$ic5$), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f33312(final SubLObject var37, final SubLObject var38) {
        final SubLObject var39 = f33306(conses_high.second(var37));
        final SubLObject var40 = f33306(conses_high.second(var38));
        return Numbers.numLE(Sequences.length(var39), Sequences.length(var40));
    }
    
    public static SubLObject f33313() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0537", "f33301", "S#36754", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0537", "f33302", "S#36755", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0537", "f33303", "S#36756", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0537", "f33304", "S#24006", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0537", "f33305", "S#33598", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0537", "f33306", "S#36757", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0537", "f33307", "S#36758", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0537", "f33308", "S#36759", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0537", "f33309", "S#36760", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0537", "f33310", "S#36761", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0537", "f33311", "INFERENCE-ANSWER-MINIMAL-ABDUCTION-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0537", "f33312", "S#36762", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33314() {
        $g3919$ = SubLFiles.defparameter("S#36763", (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33315() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f33313();
    }
    
    public void initializeVariables() {
        f33314();
    }
    
    public void runTopLevelForms() {
        f33315();
    }
    
    static {
        me = (SubLFile)new module0537();
        $g3919$ = null;
        $ic0$ = ConsesLow.list(new SubLObject[] { makeKeyword("ABDUCTION-ALLOWED?"), T, makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), T, makeKeyword("RESULT-UNIQUENESS"), makeKeyword("PROOF"), makeKeyword("RETURN"), makeKeyword("BINDINGS-AND-SUPPORTS"), makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), T, makeKeyword("MAX-TRANSFORMATION-DEPTH"), ONE_INTEGER, makeKeyword("MAX-NUMBER"), TEN_INTEGER, makeKeyword("MAX-TIME"), makeInteger(300), makeKeyword("BROWSABLE?"), T, makeKeyword("CONTINUABLE?"), T });
        $ic1$ = ConsesLow.list((SubLObject)makeSymbol("S#15051", "CYC"), (SubLObject)makeSymbol("S#14510", "CYC"));
        $ic2$ = constant_handles_oc.f8479((SubLObject)makeString("AbducedTermFn"));
        $ic3$ = makeKeyword("ABDUCTION");
        $ic4$ = makeSymbol("S#36761", "CYC");
        $ic5$ = makeSymbol("<");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 97 ms
	
	Decompiled with Procyon 0.5.32.
*/