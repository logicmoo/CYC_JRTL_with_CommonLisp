package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0441 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0441";
    public static final String myFingerPrint = "e1e12ce7019673026838ad14c1b32d86741fe782d6132ada2186a6fb7f8616c5";
    private static SubLSymbol $g3545$;
    private static SubLSymbol $g3546$;
    private static SubLSymbol $g3547$;
    private static SubLSymbol $g3548$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLList $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLObject $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLList $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLList $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLList $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    
    public static SubLObject f30722(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0144.$g1810$.currentBinding(var3);
        try {
            module0144.$g1810$.bind((SubLObject)NIL, var3);
            final SubLObject var5 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
            final SubLObject var6 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
            var3.resetMultipleValues();
            final SubLObject var7 = module0235.f15474(var5, var6, (SubLObject)T, (SubLObject)T);
            final SubLObject var8 = var3.secondMultipleValue();
            var3.resetMultipleValues();
            if (NIL != var7) {
                module0347.f23330(module0191.f11990((SubLObject)$ic0$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)NIL, var8);
            }
        }
        finally {
            module0144.$g1810$.rebind(var4, var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30723(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0144.$g1810$.currentBinding(var3);
        try {
            module0144.$g1810$.bind((SubLObject)NIL, var3);
            final SubLObject var5 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
            final SubLObject var6 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
            var3.resetMultipleValues();
            final SubLObject var7 = module0235.f15474(var5, var6, (SubLObject)T, (SubLObject)T);
            final SubLObject var8 = var3.secondMultipleValue();
            var3.resetMultipleValues();
            if (NIL != var7) {
                final SubLObject var9 = module0233.f15361(var7, var1);
                module0347.f23330(module0191.f11990((SubLObject)$ic0$, var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var7, var8);
            }
        }
        finally {
            module0144.$g1810$.rebind(var4, var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30724(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        var3.resetMultipleValues();
        final SubLObject var4 = f30725(module0205.f13333(var1));
        final SubLObject var5 = var3.secondMultipleValue();
        var3.resetMultipleValues();
        return var5;
    }
    
    public static SubLObject f30726(final SubLObject var12) {
        return module0052.f3709(module0259.f16848(f30725(var12), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f30725(final SubLObject var12) {
        final SubLObject var13 = module0226.f14881(var12, (SubLObject)UNPROVIDED);
        final SubLObject var14 = module0226.f14883(var12, (SubLObject)UNPROVIDED);
        SubLObject var15 = $ic7$;
        SubLObject var16 = module0549.f33912(var15);
        SubLObject var17 = var13;
        SubLObject var18 = (SubLObject)NIL;
        var18 = var17.first();
        while (NIL != var17) {
            final SubLObject var19 = module0549.f33912(var18);
            if (var19.numL(var16)) {
                var15 = var18;
                var16 = var19;
            }
            var17 = var17.rest();
            var18 = var17.first();
        }
        var17 = var14;
        var18 = (SubLObject)NIL;
        var18 = var17.first();
        while (NIL != var17) {
            final SubLObject var19 = module0549.f33912(var18);
            if (var19.numL(var16)) {
                var15 = var18;
                var16 = var19;
            }
            var17 = var17.rest();
            var18 = var17.first();
        }
        return Values.values(var15, var16);
    }
    
    public static SubLObject f30727(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0144.$g1810$.currentBinding(var3);
        try {
            module0144.$g1810$.bind((SubLObject)NIL, var3);
            final SubLObject var5 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
            final SubLObject var6 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
            var3.resetMultipleValues();
            final SubLObject var7 = module0235.f15474(var5, var6, (SubLObject)T, (SubLObject)T);
            final SubLObject var8 = var3.secondMultipleValue();
            var3.resetMultipleValues();
            if (NIL != var7) {
                module0347.f23330(module0191.f11990((SubLObject)$ic0$, module0205.f13338(var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)NIL, var8);
            }
        }
        finally {
            module0144.$g1810$.rebind(var4, var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30728(final SubLObject var1) {
        if (NIL != module0435.f30612(var1, (SubLObject)$ic10$)) {
            return (SubLObject)$ic11$;
        }
        return (SubLObject)$ic12$;
    }
    
    public static SubLObject f30729(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0144.$g1810$.currentBinding(var3);
        try {
            module0144.$g1810$.bind((SubLObject)NIL, var3);
            final SubLObject var5 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
            final SubLObject var6 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
            var3.resetMultipleValues();
            final SubLObject var7 = module0235.f15474(var5, var6, (SubLObject)T, (SubLObject)T);
            final SubLObject var8 = var3.secondMultipleValue();
            var3.resetMultipleValues();
            if (NIL != var7) {
                final SubLObject var9 = module0233.f15361(var7, var1);
                module0347.f23330(module0191.f11990((SubLObject)$ic0$, module0205.f13338(var9), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var7, var8);
            }
        }
        finally {
            module0144.$g1810$.rebind(var4, var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30730(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        var3.resetMultipleValues();
        final SubLObject var4 = f30725(module0205.f13333(var1));
        final SubLObject var5 = var3.secondMultipleValue();
        var3.resetMultipleValues();
        return var5;
    }
    
    public static SubLObject f30731(final SubLObject var1) {
        if (NIL != module0435.f30612(var1, (SubLObject)$ic10$)) {
            return (SubLObject)$ic11$;
        }
        return (SubLObject)$ic12$;
    }
    
    public static SubLObject f30732(final SubLObject var12) {
        return module0052.f3709(module0259.f16848(f30725(var12), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f30733(final SubLObject var20, final SubLObject var21) {
        final SubLObject var22 = module0191.f11990((SubLObject)$ic0$, var20, var21, (SubLObject)UNPROVIDED);
        final SubLObject var23 = (SubLObject)NIL;
        return Values.values(var22, var23);
    }
    
    public static SubLObject f30734(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(NIL != module0373.f26109() && module0205.f13387(var1, (SubLObject)UNPROVIDED).eql(module0205.f13388(var1, (SubLObject)UNPROVIDED)) && NIL != module0226.f14796(module0205.f13333(var1)));
    }
    
    public static SubLObject f30735(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLObject var3 = module0373.f26109();
        if (NIL != var3) {
            module0373.f26244(var3, (SubLObject)NIL, (SubLObject)$ic20$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30736() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0441", "f30722", "S#33968", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0441", "f30723", "S#33966", 1, 1, false);
        new $f30723$UnaryFunction();
        new $f30723$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0441", "f30724", "S#33969", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0441", "f30726", "S#33970", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0441", "f30725", "S#33971", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0441", "f30727", "S#33972", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0441", "f30728", "S#33973", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0441", "f30729", "S#33974", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0441", "f30730", "S#33975", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0441", "f30731", "S#33976", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0441", "f30732", "S#33977", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0441", "f30733", "S#33978", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0441", "f30734", "S#33979", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0441", "f30735", "S#33980", 1, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30737() {
        $g3545$ = SubLFiles.defparameter("S#33981", module0018.$g658$.getDynamicValue());
        $g3546$ = SubLFiles.defparameter("S#33982", (SubLObject)ONE_INTEGER);
        $g3547$ = SubLFiles.defparameter("S#33983", module0018.$g658$.getDynamicValue());
        $g3548$ = SubLFiles.defparameter("S#33984", (SubLObject)ONE_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30738() {
        module0340.f22941((SubLObject)$ic1$, (SubLObject)$ic2$);
        module0340.f22941((SubLObject)$ic3$, (SubLObject)$ic4$);
        module0340.f22941((SubLObject)$ic5$, (SubLObject)$ic6$);
        module0340.f22941((SubLObject)$ic8$, (SubLObject)$ic9$);
        module0340.f22941((SubLObject)$ic13$, (SubLObject)$ic14$);
        module0340.f22941((SubLObject)$ic15$, (SubLObject)$ic16$);
        module0340.f22941((SubLObject)$ic17$, (SubLObject)$ic18$);
        module0012.f419((SubLObject)$ic19$);
        module0012.f419((SubLObject)$ic21$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f30736();
    }
    
    public void initializeVariables() {
        f30737();
    }
    
    public void runTopLevelForms() {
        f30738();
    }
    
    static {
        me = (SubLFile)new module0441();
        $g3545$ = null;
        $g3546$ = null;
        $g3547$ = null;
        $g3548$ = null;
        $ic0$ = makeKeyword("REFLEXIVE");
        $ic1$ = makeKeyword("REMOVAL-REFLEXIVE-BOTH");
        $ic2$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#26079", "CYC")), (SubLObject)makeKeyword("ANYTHING"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#33981", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#33968", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(<reflexive predicate> <fully-bound> <fully-bound>)\n    by unification of <arg1> and <arg2>"), makeKeyword("EXAMPLE"), makeString("(#$notFarFrom #$Italy #$Italy)\nin\n #$WorldGeographyMt\nvia\n (#$isa #$notFarFrom #$ReflexiveBinaryPredicate)\n\n(#$geographicalSubRegions (#$SchemaObjectFn #$Nima-Gns-LS -4463449) (#$SchemaObjectFn #$Nima-Gns-LS -4463449))\nin\n (#$ContentMtFn #$Nima-KS)\nvia\n (#$isa (#$geographicalSubRegions #$ReflexiveBinaryPredicate))\n") });
        $ic3$ = makeKeyword("REMOVAL-REFLEXIVE-ONE-ARG");
        $ic4$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("OR"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND"))), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#26079", "CYC")), (SubLObject)makeKeyword("ANYTHING"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#33982", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#33966", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(<reflexive predicate> <fully-bound> <not-fully-bound>) and\n    (<reflexive predicate> <not-fully-bound> <fully-bound>)\nby unification of <not-fully-bound> and <fully-bound>\n"), makeKeyword("EXAMPLE"), makeString("(#$notFarFrom #$Italy ?WHERE)\nin\n #$WorldGeographyMt\nvia\n (#$isa #$notFarFrom #$ReflexiveBinaryPredicate)\n\n(#$geographicalSubRegions (#$SchemaObjectFn #$Nima-Gns-LS -4463449) ?WHERE)\nin\n (#$ContentMtFn #$Nima-KS)\nvia\n (#$isa #$geographicalSubRegions #$ReflexiveBinaryPredicate)") });
        $ic5$ = makeKeyword("REMOVAL-REFLEXIVE-MAP");
        $ic6$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#26079", "CYC")), (SubLObject)makeKeyword("ANYTHING"))), makeKeyword("COST"), makeSymbol("S#33969", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#717", "CYC")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#717", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#33970", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#717", "CYC")), (SubLObject)makeKeyword("INPUT"), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("REFLEXIVE"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"), makeString("(<reflexive predicate> <not-fully-bound> <not-fully-bound>)\nby iterating over the instances of the arg-types of <reflexive predicate>"), makeKeyword("EXAMPLE"), makeString("(#$subCultures ?X ?Y)") });
        $ic7$ = constant_handles_oc.f8479((SubLObject)makeString("Thing"));
        $ic8$ = makeKeyword("REMOVAL-IRREFLEXIVE-BOTH");
        $ic9$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24936", "CYC")), (SubLObject)makeKeyword("ANYTHING"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#33983", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#33972", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (<irreflexive predicate> <fully-bound> <fully-bound>))\nby unification of <arg1> and <arg2>"), makeKeyword("EXAMPLE"), makeString("(#$not (#$farFrom #$Italy #$Italy))\nin\n #$WorldGeographyMt\nvia\n (#$isa #$farFrom #$IrreflexiveBinaryPredicate)\n\n(#$not (#$farFrom (#$SchemaObjectFn #$Nima-Gns-LS -4463449) (#$SchemaObjectFn #$Nima-Gns-LS -4463449)))\nin\n (#$ContentMtFn #$Nima-KS)\nvia\n (#$isa #$farFrom #$IrreflexiveBinaryPredicate)") });
        $ic10$ = makeKeyword("NEG");
        $ic11$ = makeKeyword("GROSSLY-INCOMPLETE");
        $ic12$ = makeKeyword("INCOMPLETE");
        $ic13$ = makeKeyword("REMOVAL-IRREFLEXIVE-ONE-ARG");
        $ic14$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("OR"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND"))), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24936", "CYC")), (SubLObject)makeKeyword("ANYTHING"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#33984", "CYC"), makeKeyword("COMPLETENESS-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#33973", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("EXPAND"), makeSymbol("S#33974", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (<irreflexive predicate> <fully-bound> <not-fully-bound>)) and\n    (#$not (<irreflexive predicate> <not-fully-bound> <fully-bound>))\nby unification of <not-fully-bound> and <fully-bound>\n"), makeKeyword("EXAMPLE"), makeString("(#$not (#$farFrom ?WHERE #$Italy))\nin\n #$WorldGeographyMt\nvia\n (#$isa #$farFrom #$IrreflexiveBinaryPredicate)\n\n(#$not (#$farFrom ?WHERE (#$SchemaObjectFn #$Nima-Gns-LS -4463449)))\nin\n (#$ContentMtFn #$Nima-KS)\nvia\n (#$isa #$farFrom #$IrreflexiveBinaryPredicate)") });
        $ic15$ = makeKeyword("REMOVAL-IRREFLEXIVE-MAP");
        $ic16$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24936", "CYC")), (SubLObject)makeKeyword("ANYTHING"))), makeKeyword("COST"), makeSymbol("S#33975", "CYC"), makeKeyword("COMPLETENESS-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#33976", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#717", "CYC")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#717", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#33977", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#717", "CYC")), (SubLObject)makeKeyword("INPUT"), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("S#33978", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (<irreflexive predicate> <not-fully-bound> <not-fully-bound>)) \nby iterating over the instances of the arg-types of <irreflexive predicate>") });
        $ic17$ = makeKeyword("PRUNE-REFLEXIVE-USE-OF-IRREFLEXIVE-PREDICATE");
        $ic18$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24936", "CYC")), (SubLObject)makeKeyword("ANYTHING"))), makeKeyword("REQUIRED"), makeSymbol("S#33979", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("EXPAND"), makeSymbol("S#33980", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(<irreflexive-predicate> <anything> <anything>) pruned when <arg1> and <arg2> are equal."), makeKeyword("EXAMPLE"), makeString("(#$sisters ?var0 ?var0)") });
        $ic19$ = makeSymbol("S#33979", "CYC");
        $ic20$ = makeKeyword("TACTICAL");
        $ic21$ = makeSymbol("S#33980", "CYC");
    }
    
    public static final class $f30723$UnaryFunction extends UnaryFunction
    {
        public $f30723$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#33966"));
        }
        
        public SubLObject processItem(final SubLObject var5) {
            return f30723(var5, (SubLObject)$f30723$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f30723$BinaryFunction extends BinaryFunction
    {
        public $f30723$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#33966"));
        }
        
        public SubLObject processItem(final SubLObject var5, final SubLObject var6) {
            return f30723(var5, var6);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 165 ms
	
	Decompiled with Procyon 0.5.32.
*/