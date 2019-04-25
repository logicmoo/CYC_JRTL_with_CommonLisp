package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0473 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0473";
    public static final String myFingerPrint = "3a30f363df17cbac5a8369fc81aaff29702eff50f806dfce2067532dae017ba7";
    private static SubLSymbol $g3684$;
    private static SubLSymbol $g3685$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLObject $ic11$;
    private static final SubLSymbol $ic12$;
    
    public static SubLObject f31604(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        SubLObject var4;
        final SubLObject var3 = var4 = module0205.f13385(var1, (SubLObject)UNPROVIDED);
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            if (NIL != module0260.f17094(var5, var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                module0347.f23330(module0191.f11990((SubLObject)$ic1$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic0$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31605(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0549.f33899(module0205.f13387(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31606(final SubLObject var5) {
        return module0052.f3709(module0260.f17030(var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31607(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0549.f33901(module0205.f13388(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31608(final SubLObject var6) {
        return module0052.f3709(module0260.f17035(var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31609(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var5;
        final SubLObject var4 = var5 = module0205.f13385(var1, (SubLObject)UNPROVIDED);
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic0$);
        var6 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic0$);
        var7 = var5.first();
        var5 = var5.rest();
        if (NIL == var5) {
            if (NIL != module0018.$g646$.getDynamicValue(var3) && NIL == module0260.f17094(var6, var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                module0347.f23330(module0191.f11990((SubLObject)$ic8$, module0205.f13338(var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else if (NIL != module0260.f17106(var6, var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                module0347.f23330(module0191.f11990((SubLObject)$ic1$, module0205.f13338(var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic0$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31610() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0473", "f31604", "S#34953", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0473", "f31605", "S#34954", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0473", "f31606", "S#34955", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0473", "f31607", "S#34956", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0473", "f31608", "S#34957", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0473", "f31609", "S#34958", 1, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31611() {
        $g3684$ = SubLFiles.defparameter("S#34959", module0018.$g658$.getDynamicValue());
        $g3685$ = SubLFiles.defparameter("S#34960", (SubLObject)TWO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31612() {
        module0340.f22941((SubLObject)$ic2$, (SubLObject)$ic3$);
        module0340.f22941((SubLObject)$ic4$, (SubLObject)$ic5$);
        module0340.f22941((SubLObject)$ic6$, (SubLObject)$ic7$);
        module0340.f22941((SubLObject)$ic9$, (SubLObject)$ic10$);
        module0340.f22938($ic11$);
        module0358.f23773((SubLObject)$ic12$, $ic11$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f31610();
    }
    
    public void initializeVariables() {
        f31611();
    }
    
    public void runTopLevelForms() {
        f31612();
    }
    
    static {
        me = (SubLFile)new module0473();
        $g3684$ = null;
        $g3685$ = null;
        $ic0$ = ConsesLow.list((SubLObject)makeSymbol("S#34951", "CYC"), (SubLObject)makeSymbol("S#34952", "CYC"));
        $ic1$ = makeKeyword("GENLPREDS");
        $ic2$ = makeKeyword("REMOVAL-GENLINVERSE-CHECK");
        $ic3$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("genlInverse")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genlInverse")), (SubLObject)makeKeyword("PREDICATE-FORT"), (SubLObject)makeKeyword("PREDICATE-FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34959", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34953", "CYC") });
        $ic4$ = makeKeyword("REMOVAL-ALL-GENL-INVERSES");
        $ic5$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("genlInverse")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genlInverse")), (SubLObject)makeKeyword("PREDICATE-FORT"), (SubLObject)makeKeyword("VARIABLE")), makeKeyword("COST"), makeSymbol("S#34954", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genlInverse")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34951", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34951", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34955", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genlInverse")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34951", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("GENLPREDS"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"), makeString("(#$genlInverse <predicate-fort> <variable>"), makeKeyword("EXAMPLE"), makeString("(#$genlInverse #$geographicalSubRegions ?WHAT)") });
        $ic6$ = makeKeyword("REMOVAL-ALL-SPEC-INVERSES");
        $ic7$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("genlInverse")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genlInverse")), (SubLObject)makeKeyword("VARIABLE"), (SubLObject)makeKeyword("PREDICATE-FORT")), makeKeyword("COST"), makeSymbol("S#34956", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genlInverse")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34952", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34952", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34957", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genlInverse")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34952", "CYC"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("GENLPREDS"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"), makeString("(#$genlInverse <variable> <predicate-fort>)"), makeKeyword("EXAMPLE"), makeString("(#$genlInverse ?WHAT #$inRegion)") });
        $ic8$ = makeKeyword("MINIMIZE");
        $ic9$ = makeKeyword("REMOVAL-NOT-GENLINVERSE-CHECK");
        $ic10$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("genlInverse")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genlInverse")), (SubLObject)makeKeyword("PREDICATE-FORT"), (SubLObject)makeKeyword("PREDICATE-FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34960", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34958", "CYC") });
        $ic11$ = constant_handles_oc.f8479((SubLObject)makeString("genlInverse"));
        $ic12$ = makeKeyword("NEG");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 90 ms
	
	Decompiled with Procyon 0.5.32.
*/