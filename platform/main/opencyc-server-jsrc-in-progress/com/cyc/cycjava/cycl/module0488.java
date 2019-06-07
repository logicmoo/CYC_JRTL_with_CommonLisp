package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0488 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0488";
    public static final String myFingerPrint = "c48cb2be6f75355a028581e7ba74c464d2c2851f7a52d513740187740b727e1b";
    private static SubLSymbol $g3718$;
    public static SubLSymbol $g3719$;
    private static SubLSymbol $g3720$;
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLList $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLObject $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLList $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLList $ic16$;
    private static final SubLList $ic17$;
    private static final SubLObject $ic18$;
    private static final SubLObject $ic19$;
    private static final SubLObject $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    
    public static SubLObject f31981(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLObject var3 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var4 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0205.f13389(var1, (SubLObject)UNPROVIDED);
        if (var3.numLE(var4) && var4.numLE(var5)) {
            module0347.f23330(f31982(var3, var4, var5, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31982(final SubLObject var3, final SubLObject var4, final SubLObject var5, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        assert NIL != Types.integerp(var3) : var3;
        assert NIL != Types.integerp(var4) : var4;
        assert NIL != Types.integerp(var5) : var5;
        SubLObject var7 = (SubLObject)ConsesLow.list($ic0$, var3, var4, var5);
        if (NIL != var6) {
            var7 = module0205.f13338(var7);
        }
        final SubLObject var8 = module0191.f11990((SubLObject)$ic8$, var7, $g3719$.getGlobalValue(), (SubLObject)$ic9$);
        return var8;
    }
    
    public static SubLObject f31983(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLObject var3 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var4 = module0205.f13389(var1, (SubLObject)UNPROVIDED);
        final SubLObject var5 = Numbers.add((SubLObject)ONE_INTEGER, Numbers.subtract(var4, var3));
        return Numbers.max((SubLObject)ZERO_INTEGER, var5);
    }
    
    public static SubLObject f31984(final SubLObject var10) {
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var10, var10, (SubLObject)$ic10$);
        var11 = var10.first();
        SubLObject var13 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var13, var10, (SubLObject)$ic10$);
        var12 = var13.first();
        var13 = var13.rest();
        if (NIL == var13) {
            return Numbers.numLE(var11, var12);
        }
        cdestructuring_bind.cdestructuring_bind_error(var10, (SubLObject)$ic10$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31985(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLObject var3 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var4 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0205.f13389(var1, (SubLObject)UNPROVIDED);
        if (!var3.numLE(var4) || !var4.numLE(var5)) {
            module0347.f23330(f31982(var3, var4, var5, (SubLObject)T), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31986(final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var16 = module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var17 = module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var18 = (SubLObject)ZERO_INTEGER;
        SubLObject var19 = module0232.f15308(var13);
        SubLObject var20 = (SubLObject)NIL;
        var20 = var19.first();
        while (NIL != var19) {
            SubLObject var22;
            final SubLObject var21 = var22 = var20;
            SubLObject var23 = (SubLObject)NIL;
            SubLObject var24 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)$ic17$);
            var23 = var22.first();
            var22 = var22.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)$ic17$);
            var24 = var22.first();
            var22 = var22.rest();
            if (NIL == var22) {
                if (NIL != module0202.f12598(var24)) {
                    var14.resetMultipleValues();
                    final SubLObject var25 = module0202.f12796(var24);
                    final SubLObject var26 = var14.secondMultipleValue();
                    final SubLObject var27 = var14.thirdMultipleValue();
                    var14.resetMultipleValues();
                    final SubLObject var28 = var25;
                    if (var28.eql($ic18$)) {
                        if ($ic19$.eql(var27)) {
                            module0084.f5762(var15, var26, var18);
                        }
                    }
                    else if (var28.eql($ic20$)) {
                        if (NIL != module0193.f12067(var26) && var27.isInteger()) {
                            module0084.f5762(var16, var26, var18);
                        }
                        else if (var26.isInteger() && NIL != module0193.f12067(var27)) {
                            module0084.f5762(var17, var27, var18);
                        }
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var21, (SubLObject)$ic17$);
            }
            var18 = Numbers.add(var18, (SubLObject)ONE_INTEGER);
            var19 = var19.rest();
            var20 = var19.first();
        }
        SubLObject var29 = (SubLObject)NIL;
        SubLObject var30;
        for (var30 = module0066.f4838(module0067.f4891(var16)); NIL == module0066.f4841(var30); var30 = module0066.f4840(var30)) {
            var14.resetMultipleValues();
            final SubLObject var31 = module0066.f4839(var30);
            final SubLObject var32 = var14.secondMultipleValue();
            var14.resetMultipleValues();
            final SubLObject var33 = module0067.f4884(var17, var31, (SubLObject)UNPROVIDED);
            if (NIL != var33) {
                final SubLObject var34 = module0067.f4884(var15, var31, (SubLObject)UNPROVIDED);
                if (NIL != var34) {
                    SubLObject var36;
                    final SubLObject var35 = var36 = module0035.f2489((SubLObject)ConsesLow.list(var34, var32, var33), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    SubLObject var37 = (SubLObject)NIL;
                    var37 = var36.first();
                    while (NIL != var36) {
                        var29 = (SubLObject)ConsesLow.cons(module0204.f13098((SubLObject)NIL, var37), var29);
                        var36 = var36.rest();
                        var37 = var36.first();
                    }
                }
            }
        }
        module0066.f4842(var30);
        return Sequences.nreverse(var29);
    }
    
    public static SubLObject f31987(final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        var14.resetMultipleValues();
        final SubLObject var15 = f31988(var13);
        final SubLObject var16 = var14.secondMultipleValue();
        final SubLObject var17 = var14.thirdMultipleValue();
        final SubLObject var18 = var14.fourthMultipleValue();
        var14.resetMultipleValues();
        if (var16.numL(var15)) {
            return (SubLObject)ZERO_INTEGER;
        }
        return module0048.f_1X(Numbers.subtract(var16, var15));
    }
    
    public static SubLObject f31989(final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        var14.resetMultipleValues();
        final SubLObject var15 = f31988(var13);
        final SubLObject var16 = var14.secondMultipleValue();
        final SubLObject var17 = var14.thirdMultipleValue();
        final SubLObject var18 = var14.fourthMultipleValue();
        var14.resetMultipleValues();
        for (SubLObject var19 = var15; var19.numLE(var16); var19 = Numbers.add(var19, (SubLObject)ONE_INTEGER)) {
            var14.resetMultipleValues();
            final SubLObject var20 = module0235.f15474(var17, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var21 = var14.secondMultipleValue();
            var14.resetMultipleValues();
            if (NIL != var20) {
                final SubLObject var22 = module0202.f12768($ic18$, var19, $ic19$);
                final SubLObject var23 = module0202.f12768($ic20$, var19, var15);
                final SubLObject var24 = module0202.f12768($ic20$, var16, var19);
                final SubLObject var25 = (SubLObject)ConsesLow.list(module0191.f11990((SubLObject)$ic23$, var22, module0132.$g1547$.getGlobalValue(), (SubLObject)UNPROVIDED));
                final SubLObject var26 = (SubLObject)ConsesLow.list(module0191.f11990((SubLObject)$ic24$, var23, module0132.$g1547$.getGlobalValue(), (SubLObject)UNPROVIDED));
                final SubLObject var27 = (SubLObject)ConsesLow.list(module0191.f11990((SubLObject)$ic24$, var24, module0132.$g1547$.getGlobalValue(), (SubLObject)UNPROVIDED));
                final SubLObject var28 = module0035.f2477((SubLObject)ConsesLow.list(var25, var26, var27), var18);
                module0376.f26641(var20, var28);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31988(final SubLObject var13) {
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        SubLObject var17 = (SubLObject)NIL;
        SubLObject var18 = (SubLObject)ZERO_INTEGER;
        SubLObject var19 = module0232.f15308(var13);
        SubLObject var20 = (SubLObject)NIL;
        var20 = var19.first();
        while (NIL != var19) {
            SubLObject var22;
            final SubLObject var21 = var22 = var20;
            SubLObject var23 = (SubLObject)NIL;
            SubLObject var24 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)$ic17$);
            var23 = var22.first();
            var22 = var22.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)$ic17$);
            var24 = var22.first();
            var22 = var22.rest();
            if (NIL == var22) {
                if (NIL != module0205.f13332(var24, $ic20$) && module0205.f13388(var24, (SubLObject)UNPROVIDED).isInteger()) {
                    var14 = module0205.f13388(var24, (SubLObject)UNPROVIDED);
                    var17 = (SubLObject)ConsesLow.cons((SubLObject)ONE_INTEGER, var17);
                }
                else if (NIL != module0205.f13332(var24, $ic20$) && module0205.f13387(var24, (SubLObject)UNPROVIDED).isInteger()) {
                    var15 = module0205.f13387(var24, (SubLObject)UNPROVIDED);
                    var17 = (SubLObject)ConsesLow.cons((SubLObject)TWO_INTEGER, var17);
                }
                else {
                    var16 = module0205.f13387(var24, (SubLObject)UNPROVIDED);
                    var17 = (SubLObject)ConsesLow.cons((SubLObject)ZERO_INTEGER, var17);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var21, (SubLObject)$ic17$);
            }
            var18 = Numbers.add(var18, (SubLObject)ONE_INTEGER);
            var19 = var19.rest();
            var20 = var19.first();
        }
        var17 = Sequences.nreverse(var17);
        return Values.values(var14, var15, var16, var17);
    }
    
    public static SubLObject f31990() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0488", "f31981", "S#35321", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0488", "f31982", "S#35322", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0488", "f31983", "S#35323", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0488", "f31984", "S#35324", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0488", "f31985", "S#35325", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0488", "f31986", "S#35326", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0488", "f31987", "S#35327", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0488", "f31989", "S#35328", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0488", "f31988", "S#35329", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31991() {
        $g3718$ = SubLFiles.defparameter("S#35330", module0018.$g658$.getDynamicValue());
        $g3719$ = SubLFiles.deflexical("S#35331", (NIL != Symbols.boundp((SubLObject)$ic5$)) ? $g3719$.getGlobalValue() : $ic6$);
        $g3720$ = SubLFiles.defparameter("S#35332", module0018.$g658$.getDynamicValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31992() {
        module0340.f22938($ic0$);
        module0358.f23771((SubLObject)$ic1$, $ic0$, (SubLObject)ONE_INTEGER);
        module0358.f23771((SubLObject)$ic1$, $ic0$, (SubLObject)THREE_INTEGER);
        module0358.f23773((SubLObject)$ic2$, $ic0$);
        module0340.f22941((SubLObject)$ic3$, (SubLObject)$ic4$);
        module0003.f57((SubLObject)$ic5$);
        module0132.f8593((SubLObject)$ic5$, $ic0$);
        module0340.f22941((SubLObject)$ic11$, (SubLObject)$ic12$);
        module0340.f22941((SubLObject)$ic13$, (SubLObject)$ic14$);
        module0340.f22962((SubLObject)$ic15$, (SubLObject)$ic16$);
        module0012.f419((SubLObject)$ic21$);
        module0012.f419((SubLObject)$ic22$);
        module0012.f419((SubLObject)$ic25$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f31990();
    }
    
    public void initializeVariables() {
        f31991();
    }
    
    public void runTopLevelForms() {
        f31992();
    }
    
    static {
        me = (SubLFile)new module0488();
        $g3718$ = null;
        $g3719$ = null;
        $g3720$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("integerBetween"));
        $ic1$ = makeKeyword("POS");
        $ic2$ = makeKeyword("NEG");
        $ic3$ = makeKeyword("REMOVAL-INTEGER-BETWEEN-CHECK");
        $ic4$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("integerBetween")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("integerBetween")), (SubLObject)makeKeyword("INTEGER"), (SubLObject)makeKeyword("INTEGER"), (SubLObject)makeKeyword("INTEGER")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35330", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35321", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$integerBetween <integer> <integer> <integer>)"), makeKeyword("EXAMPLE"), makeString("(#$integerBetween 1 2 3)") });
        $ic5$ = makeSymbol("S#35331", "CYC");
        $ic6$ = constant_handles_oc.f8479((SubLObject)makeString("BaseKB"));
        $ic7$ = makeSymbol("INTEGERP");
        $ic8$ = makeKeyword("CODE");
        $ic9$ = makeKeyword("TRUE-MON");
        $ic10$ = ConsesLow.list((SubLObject)makeSymbol("S#35333", "CYC"), (SubLObject)makeSymbol("S#35334", "CYC"));
        $ic11$ = makeKeyword("REMOVAL-INTEGER-BETWEEN-UNIFY");
        $ic12$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("integerBetween")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("integerBetween")), (SubLObject)makeKeyword("INTEGER"), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("INTEGER")), makeKeyword("COST"), makeSymbol("S#35323", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("integerBetween")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35333", "CYC")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35334", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35333", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35334", "CYC")))), makeKeyword("INPUT-VERIFY-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#35324", "CYC")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#35333", "CYC"), (SubLObject)makeSymbol("S#35334", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#5139", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35333", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("1+"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35334", "CYC"))), (SubLObject)ONE_INTEGER)), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("integerBetween")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35333", "CYC")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35334", "CYC"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("CODE"), makeKeyword("SUPPORT-MT"), makeSymbol("S#35331", "CYC"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$integerBetween <integer> <whatever> <integer>)"), makeKeyword("EXAMPLE"), makeString("(#$integerBetween 1 ?NUM 10)") });
        $ic13$ = makeKeyword("REMOVAL-NOT-INTEGER-BETWEEN-CHECK");
        $ic14$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("integerBetween")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("integerBetween")), (SubLObject)makeKeyword("INTEGER"), (SubLObject)makeKeyword("INTEGER"), (SubLObject)makeKeyword("INTEGER")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35332", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35325", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$integerBetween <integer> <whatever> <integer>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$integerBetween 1 42 10))") });
        $ic15$ = makeKeyword("REMOVAL-CONJUNCTIVE-INTEGER-BETWEEN");
        $ic16$ = ConsesLow.list(new SubLObject[] { makeKeyword("EVERY-PREDICATES"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), constant_handles_oc.f8479((SubLObject)makeString("greaterThanOrEqualTo"))), makeKeyword("APPLICABILITY"), makeSymbol("S#35326", "CYC"), makeKeyword("COST"), makeSymbol("S#35327", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35328", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$and (#$isa ?NUM #$Integer) (#$greaterThanOrEqualTo ?NUM <int1>) (#$greaterThanOrEqualTo <int2> ?NUM))"), makeKeyword("EXAMPLE"), makeString("(#$and (#$isa ?NUM #$Integer) (#$greaterThanOrEqualTo ?NUM 1) (#$greaterThanOrEqualTo 212 ?NUM))") });
        $ic17$ = ConsesLow.list((SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#13100", "CYC"));
        $ic18$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic19$ = constant_handles_oc.f8479((SubLObject)makeString("Integer"));
        $ic20$ = constant_handles_oc.f8479((SubLObject)makeString("greaterThanOrEqualTo"));
        $ic21$ = makeSymbol("S#35326", "CYC");
        $ic22$ = makeSymbol("S#35327", "CYC");
        $ic23$ = makeKeyword("ISA");
        $ic24$ = makeKeyword("EVAL");
        $ic25$ = makeSymbol("S#35328", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 165 ms
	
	Decompiled with Procyon 0.5.32.
*/