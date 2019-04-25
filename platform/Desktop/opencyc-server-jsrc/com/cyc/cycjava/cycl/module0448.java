package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0448 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0448";
    public static final String myFingerPrint = "65f0f4c02ce87fde97e5aebc1975826f6a39623b0fcb823a2fb46015d9df00b7";
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLObject $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    
    public static SubLObject f30995(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = (SubLObject)$ic2$;
        final SubLObject var4 = module0202.f12768($ic0$, var1, var2);
        final SubLObject var5 = $ic3$;
        return module0191.f11990(var3, var4, var5, (SubLObject)$ic4$);
    }
    
    public static SubLObject f30996(final SubLObject var6, SubLObject var7) {
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)NIL;
        }
        return f30997(var6, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f30998(final SubLObject var6, SubLObject var7) {
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)NIL;
        }
        final SubLThread var8 = SubLProcess.currentSubLThread();
        final SubLObject var9 = module0205.f13387(var6, (SubLObject)UNPROVIDED);
        final SubLObject var10 = module0205.f13388(var6, (SubLObject)UNPROVIDED);
        final SubLObject var11 = module0213.f13920(var9);
        var8.resetMultipleValues();
        final SubLObject var12 = module0235.f15474(var10, var11, (SubLObject)T, (SubLObject)T);
        final SubLObject var13 = var8.secondMultipleValue();
        var8.resetMultipleValues();
        if (NIL != var12) {
            final SubLObject var14 = f30995(var9, var11);
            module0347.f23330(var14, var12, var13);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30997(final SubLObject var6, SubLObject var7) {
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)NIL;
        }
        final SubLThread var8 = SubLProcess.currentSubLThread();
        final SubLObject var9 = module0205.f13387(var6, (SubLObject)UNPROVIDED);
        final SubLObject var10 = module0205.f13388(var6, (SubLObject)UNPROVIDED);
        var8.resetMultipleValues();
        final SubLObject var11 = module0213.f13921(var10);
        final SubLObject var12 = var8.secondMultipleValue();
        var8.resetMultipleValues();
        if (NIL != var12) {
            var8.resetMultipleValues();
            final SubLObject var13 = module0235.f15474(var9, var11, (SubLObject)T, (SubLObject)T);
            final SubLObject var14 = var8.secondMultipleValue();
            var8.resetMultipleValues();
            if (NIL != var13) {
                final SubLObject var15 = f30995(var11, var10);
                module0347.f23330(var15, var13, var14);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30999() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0448", "f30995", "S#34277", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0448", "f30996", "S#34278", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0448", "f30998", "S#34279", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0448", "f30997", "S#34280", 1, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31000() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31001() {
        module0340.f22938($ic0$);
        module0358.f23774((SubLObject)$ic1$, $ic0$);
        module0340.f22941((SubLObject)$ic5$, (SubLObject)$ic6$);
        module0340.f22941((SubLObject)$ic7$, (SubLObject)$ic8$);
        module0340.f22941((SubLObject)$ic9$, (SubLObject)$ic10$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f30999();
    }
    
    public void initializeVariables() {
        f31000();
    }
    
    public void runTopLevelForms() {
        f31001();
    }
    
    static {
        me = (SubLFile)new module0448();
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("termExternalIDString"));
        $ic1$ = makeKeyword("POS");
        $ic2$ = makeKeyword("OPAQUE");
        $ic3$ = constant_handles_oc.f8479((SubLObject)makeString("UniversalVocabularyMt"));
        $ic4$ = makeKeyword("TRUE-MON");
        $ic5$ = makeKeyword("REMOVAL-TERM-EXTERNAL-ID-STRING-FULLY-BOUND");
        $ic6$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("termExternalIDString")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termExternalIDString")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("STRING")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1887", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34278", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$termExternalIDString <fully-bound> <string>)\n    by calling hl-external-id-string"), makeKeyword("EXAMPLE"), makeString("(#$termExternalIDString 0 \"3380\")\n    (#$termExternalIDString #$isa\n      \"331E190FA462643538383130342D396332392D313162312D396461642D633337393633366637323730\")") });
        $ic7$ = makeKeyword("REMOVAL-TERM-EXTERNAL-ID-STRING-BOUND-UNBOUND");
        $ic8$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("termExternalIDString")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termExternalIDString")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("VARIABLE")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34279", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$termExternalIDString <fully-bound> <variable>\n    by calling hl-external-id-string"), makeKeyword("EXAMPLE"), makeString("(#$termExternalIDString 0 ?WHAT)\n    (#$termExternalIDString #$isa ?WHAT)\n    (#$termExternalIDString (#$YearFn 2004) ?WHAT)") });
        $ic9$ = makeKeyword("REMOVAL-TERM-EXTERNAL-ID-STRING-UNBOUND-BOUND");
        $ic10$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("termExternalIDString")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termExternalIDString")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("STRING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34280", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$termExternalIDString <not-fully-bound> <string>)\n    by calling find-object-by-hl-external-id-string"), makeKeyword("EXAMPLE"), makeString("(#$termExternalIDString ?TERM \"3381\")\n    (#$termExternalIDString (#$YearFn ?YEAR)\n      \"330D821E190FA462643538663239612D396332392D313162312D396461642D63333739363336663732373002D407\")") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 77 ms
	
	Decompiled with Procyon 0.5.32.
*/