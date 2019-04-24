package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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
        return module0627.$g4826$.getDynamicValue(var1);
    }
    
    public static SubLObject f38579() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0627.$g4827$.getDynamicValue(var1);
    }
    
    public static SubLObject f38580(final SubLObject var2, final SubLObject var3, SubLObject var4, SubLObject var5) {
        if (var4 == module0627.UNPROVIDED) {
            var4 = (SubLObject)module0627.ONE_INTEGER;
        }
        if (var5 == module0627.UNPROVIDED) {
            var5 = (SubLObject)module0627.NIL;
        }
        final SubLObject var6 = module0213.f13917(var2);
        final SubLObject var7 = Mapping.mapcar((SubLObject)module0627.$ic3$, var3);
        final SubLObject var8 = (module0627.NIL != var5) ? module0213.f13917(var5) : f38578();
        return f38581(var6, var7, var4, var8);
    }
    
    public static SubLObject f38581(final SubLObject var6, final SubLObject var7, SubLObject var4, SubLObject var8) {
        if (var4 == module0627.UNPROVIDED) {
            var4 = module0627.$g4828$.getDynamicValue();
        }
        if (var8 == module0627.UNPROVIDED) {
            var8 = f38578();
        }
        final SubLThread var9 = SubLProcess.currentSubLThread();
        SubLObject var10 = (SubLObject)module0627.NIL;
        SubLObject var11 = (SubLObject)module0627.NIL;
        final SubLObject var12 = (SubLObject)ConsesLow.cons(var6, var7);
        if (module0627.NIL == module0202.f12691(var12, (SubLObject)module0627.UNPROVIDED)) {
            var10 = (SubLObject)module0627.$ic5$;
            var11 = (SubLObject)module0627.$ic6$;
        }
        if (module0627.NIL == module0552.f34027(var12)) {
            var10 = (SubLObject)module0627.$ic5$;
            var11 = Sequences.cconcatenate((SubLObject)module0627.$ic7$, new SubLObject[] { module0006.f205(var12), module0627.$ic8$ });
        }
        if (module0627.NIL == var10 && module0627.NIL == module0274.f18060(module0278.f18389(var12, var8), var8, (SubLObject)module0627.UNPROVIDED)) {
            var10 = (SubLObject)module0627.$ic9$;
            var11 = Sequences.cconcatenate(module0006.f205(var12), (SubLObject)module0627.$ic10$);
        }
        if (module0627.NIL == var10) {
            final SubLObject var13 = module0361.f24136((SubLObject)module0627.UNPROVIDED);
            final SubLObject var14 = Numbers.divide(var4, (SubLObject)module0627.TWO_INTEGER);
            final SubLObject var15 = (SubLObject)ConsesLow.listS((SubLObject)module0627.$ic11$, var14, (SubLObject)module0627.$ic12$, var13, (SubLObject)module0627.$ic13$);
            var9.resetMultipleValues();
            SubLObject var16 = module0409.f28506(var12, var8, var15);
            final SubLObject var17 = var9.secondMultipleValue();
            final SubLObject var18 = var9.thirdMultipleValue();
            var9.resetMultipleValues();
            if (var17 == module0627.$ic11$) {
                var10 = (SubLObject)module0627.$ic5$;
                var11 = Sequences.copy_seq((SubLObject)module0627.$ic14$);
            }
            if (module0627.NIL != module0540.f33533(var16)) {
                var10 = (SubLObject)module0627.$ic15$;
            }
            if (module0627.NIL == var10) {
                final SubLObject var19 = Numbers.subtract(var4, module0369.f25706(var18, (SubLObject)module0627.NIL));
                final SubLObject var20 = (SubLObject)ConsesLow.list(module0627.$ic16$, var12);
                final SubLObject var14_20 = (SubLObject)ConsesLow.list((SubLObject)module0627.$ic11$, var19, (SubLObject)module0627.$ic12$, var13);
                module0369.f25471(var18);
                var16 = module0409.f28506(var20, var8, var14_20);
                if (module0627.NIL != module0540.f33533(var16)) {
                    var10 = (SubLObject)module0627.$ic9$;
                }
            }
            module0361.f24005(var13);
        }
        if (module0627.NIL == var10) {
            var10 = (SubLObject)module0627.$ic17$;
        }
        return (SubLObject)ConsesLow.list(var10, var11);
    }
    
    public static SubLObject f38582() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0627", "f38578", "S#42211", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0627", "f38579", "S#42212", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0627", "f38580", "SIMPLE-BOOLEAN-QUERY-EXTERNAL-ID", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0627", "f38581", "SIMPLE-BOOLEAN-QUERY-CYCL", 2, 2, false);
        return (SubLObject)module0627.NIL;
    }
    
    public static SubLObject f38583() {
        module0627.$g4826$ = SubLFiles.defparameter("S#42213", (SubLObject)module0627.$ic0$);
        module0627.$g4827$ = SubLFiles.defparameter("S#42214", module0627.$ic1$);
        module0627.$g4828$ = SubLFiles.defparameter("S#42215", (SubLObject)module0627.ONE_INTEGER);
        module0627.$g4829$ = SubLFiles.defparameter("S#42216", (SubLObject)module0627.TWENTY_INTEGER);
        return (SubLObject)module0627.NIL;
    }
    
    public static SubLObject f38584() {
        module0002.f38((SubLObject)module0627.$ic2$);
        module0002.f38((SubLObject)module0627.$ic4$);
        return (SubLObject)module0627.NIL;
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
        module0627.$g4826$ = null;
        module0627.$g4827$ = null;
        module0627.$g4828$ = null;
        module0627.$g4829$ = null;
        $ic0$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("MtSpace")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("MtTimeDimFn")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Now"))), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("MtUnionFn")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("AssistedReaderSourceSpindleCollectorMt")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("AllGeneralEnglishValidatedLexicalMicrotheoryPSC"))));
        $ic1$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("RelationParaphraseMt"));
        $ic2$ = SubLObjectFactory.makeSymbol("SIMPLE-BOOLEAN-QUERY-EXTERNAL-ID");
        $ic3$ = SubLObjectFactory.makeSymbol("FIND-OBJECT-BY-COMPACT-HL-EXTERNAL-ID-STRING");
        $ic4$ = SubLObjectFactory.makeSymbol("SIMPLE-BOOLEAN-QUERY-CYCL");
        $ic5$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic6$ = SubLObjectFactory.makeString("The sentence contains an open variable.");
        $ic7$ = SubLObjectFactory.makeString("The sentence ");
        $ic8$ = SubLObjectFactory.makeString(" is not a valid CycL sentence.");
        $ic9$ = SubLObjectFactory.makeKeyword("FALSE");
        $ic10$ = SubLObjectFactory.makeString(" is not semantically well-formed");
        $ic11$ = SubLObjectFactory.makeKeyword("MAX-TIME");
        $ic12$ = SubLObjectFactory.makeKeyword("PROBLEM-STORE");
        $ic13$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BROWSABLE?"), (SubLObject)module0627.T);
        $ic14$ = SubLObjectFactory.makeString("Timed out");
        $ic15$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic16$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("not"));
        $ic17$ = SubLObjectFactory.makeKeyword("UNKNOWN");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0627.class
	Total time: 105 ms
	
	Decompiled with Procyon 0.5.32.
*/