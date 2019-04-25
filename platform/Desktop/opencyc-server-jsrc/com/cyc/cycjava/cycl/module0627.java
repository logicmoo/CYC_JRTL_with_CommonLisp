package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0627 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0627";
    public static final String myFingerPrint = "146335e13ec352d6dde2420b329a049e5d8e0c91bbff5e1ae6c9ffa2deef250f";
    private static SubLSymbol $g4826$;
    private static SubLSymbol $g4827$;
    private static SubLSymbol $g4828$;
    private static SubLSymbol $g4829$;
    private static final SubLList $ic0$;
    private static final SubLObject $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLString $ic6$;
    private static final SubLString $ic7$;
    private static final SubLString $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLString $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLList $ic13$;
    private static final SubLString $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLObject $ic16$;
    private static final SubLSymbol $ic17$;
    
    public static SubLObject f38578() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g4826$.getDynamicValue(var1);
    }
    
    public static SubLObject f38579() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g4827$.getDynamicValue(var1);
    }
    
    public static SubLObject f38580(final SubLObject var2, final SubLObject var3, SubLObject var4, SubLObject var5) {
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)ONE_INTEGER;
        }
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = module0213.f13917(var2);
        final SubLObject var7 = Mapping.mapcar((SubLObject)$ic3$, var3);
        final SubLObject var8 = (NIL != var5) ? module0213.f13917(var5) : f38578();
        return f38581(var6, var7, var4, var8);
    }
    
    public static SubLObject f38581(final SubLObject var6, final SubLObject var7, SubLObject var4, SubLObject var8) {
        if (var4 == UNPROVIDED) {
            var4 = $g4828$.getDynamicValue();
        }
        if (var8 == UNPROVIDED) {
            var8 = f38578();
        }
        final SubLThread var9 = SubLProcess.currentSubLThread();
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = (SubLObject)NIL;
        final SubLObject var12 = (SubLObject)ConsesLow.cons(var6, var7);
        if (NIL == module0202.f12691(var12, (SubLObject)UNPROVIDED)) {
            var10 = (SubLObject)$ic5$;
            var11 = (SubLObject)$ic6$;
        }
        if (NIL == module0552.f34027(var12)) {
            var10 = (SubLObject)$ic5$;
            var11 = Sequences.cconcatenate((SubLObject)$ic7$, new SubLObject[] { module0006.f205(var12), $ic8$ });
        }
        if (NIL == var10 && NIL == module0274.f18060(module0278.f18389(var12, var8), var8, (SubLObject)UNPROVIDED)) {
            var10 = (SubLObject)$ic9$;
            var11 = Sequences.cconcatenate(module0006.f205(var12), (SubLObject)$ic10$);
        }
        if (NIL == var10) {
            final SubLObject var13 = module0361.f24136((SubLObject)UNPROVIDED);
            final SubLObject var14 = Numbers.divide(var4, (SubLObject)TWO_INTEGER);
            final SubLObject var15 = (SubLObject)ConsesLow.listS((SubLObject)$ic11$, var14, (SubLObject)$ic12$, var13, (SubLObject)$ic13$);
            var9.resetMultipleValues();
            SubLObject var16 = module0409.f28506(var12, var8, var15);
            final SubLObject var17 = var9.secondMultipleValue();
            final SubLObject var18 = var9.thirdMultipleValue();
            var9.resetMultipleValues();
            if (var17 == $ic11$) {
                var10 = (SubLObject)$ic5$;
                var11 = Sequences.copy_seq((SubLObject)$ic14$);
            }
            if (NIL != module0540.f33533(var16)) {
                var10 = (SubLObject)$ic15$;
            }
            if (NIL == var10) {
                final SubLObject var19 = Numbers.subtract(var4, inference_datastructures_inference_oc.f25706(var18, (SubLObject)NIL));
                final SubLObject var20 = (SubLObject)ConsesLow.list($ic16$, var12);
                final SubLObject var14_20 = (SubLObject)ConsesLow.list((SubLObject)$ic11$, var19, (SubLObject)$ic12$, var13);
                inference_datastructures_inference_oc.f25471(var18);
                var16 = module0409.f28506(var20, var8, var14_20);
                if (NIL != module0540.f33533(var16)) {
                    var10 = (SubLObject)$ic9$;
                }
            }
            module0361.f24005(var13);
        }
        if (NIL == var10) {
            var10 = (SubLObject)$ic17$;
        }
        return (SubLObject)ConsesLow.list(var10, var11);
    }
    
    public static SubLObject f38582() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0627", "f38578", "S#42211", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0627", "f38579", "S#42212", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0627", "f38580", "SIMPLE-BOOLEAN-QUERY-EXTERNAL-ID", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0627", "f38581", "SIMPLE-BOOLEAN-QUERY-CYCL", 2, 2, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38583() {
        $g4826$ = SubLFiles.defparameter("S#42213", (SubLObject)$ic0$);
        $g4827$ = SubLFiles.defparameter("S#42214", $ic1$);
        $g4828$ = SubLFiles.defparameter("S#42215", (SubLObject)ONE_INTEGER);
        $g4829$ = SubLFiles.defparameter("S#42216", (SubLObject)TWENTY_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38584() {
        module0002.f38((SubLObject)$ic2$);
        module0002.f38((SubLObject)$ic4$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f38582();
    }
    
    public void initializeVariables() {
        f38583();
    }
    
    public void runTopLevelForms() {
        f38584();
    }
    
    static {
        me = (SubLFile)new module0627();
        $g4826$ = null;
        $g4827$ = null;
        $g4828$ = null;
        $g4829$ = null;
        $ic0$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("MtSpace")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("MtTimeDimFn")), constant_handles_oc.f8479((SubLObject)makeString("Now"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("MtUnionFn")), constant_handles_oc.f8479((SubLObject)makeString("AssistedReaderSourceSpindleCollectorMt")), constant_handles_oc.f8479((SubLObject)makeString("AllGeneralEnglishValidatedLexicalMicrotheoryPSC"))));
        $ic1$ = constant_handles_oc.f8479((SubLObject)makeString("RelationParaphraseMt"));
        $ic2$ = makeSymbol("SIMPLE-BOOLEAN-QUERY-EXTERNAL-ID");
        $ic3$ = makeSymbol("FIND-OBJECT-BY-COMPACT-HL-EXTERNAL-ID-STRING");
        $ic4$ = makeSymbol("SIMPLE-BOOLEAN-QUERY-CYCL");
        $ic5$ = makeKeyword("ERROR");
        $ic6$ = makeString("The sentence contains an open variable.");
        $ic7$ = makeString("The sentence ");
        $ic8$ = makeString(" is not a valid CycL sentence.");
        $ic9$ = makeKeyword("FALSE");
        $ic10$ = makeString(" is not semantically well-formed");
        $ic11$ = makeKeyword("MAX-TIME");
        $ic12$ = makeKeyword("PROBLEM-STORE");
        $ic13$ = ConsesLow.list((SubLObject)makeKeyword("BROWSABLE?"), (SubLObject)T);
        $ic14$ = makeString("Timed out");
        $ic15$ = makeKeyword("TRUE");
        $ic16$ = constant_handles_oc.f8479((SubLObject)makeString("not"));
        $ic17$ = makeKeyword("UNKNOWN");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 105 ms
	
	Decompiled with Procyon 0.5.32.
*/