package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0463 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0463";
    public static final String myFingerPrint = "e535d5f0b47dc20aca079752291315ed3904a6dec74716ef0dbbca2678d9dbed";
    public static SubLSymbol $g3648$;
    private static SubLSymbol $g3649$;
    private static SubLSymbol $g3650$;
    public static SubLSymbol $g3651$;
    private static SubLSymbol $g3652$;
    public static SubLSymbol $g3653$;
    private static SubLSymbol $g3654$;
    public static SubLSymbol $g3655$;
    private static SubLSymbol $g3656$;
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLObject $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLList $ic14$;
    private static final SubLObject $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLList $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLList $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLList $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLList $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLList $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLList $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLObject $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLList $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLList $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLList $ic36$;
    private static final SubLObject $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLList $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLList $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLList $ic43$;
    private static final SubLObject $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLList $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLList $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLList $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLList $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLList $ic54$;
    
    public static SubLObject f31460(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = module0191.f11990((SubLObject)$ic5$, var1, var2, (SubLObject)$ic6$);
        final SubLObject var4 = (SubLObject)ConsesLow.list(f31461());
        return Values.values(var3, var4);
    }
    
    public static SubLObject f31461() {
        return module0191.f11990((SubLObject)$ic8$, $g3649$.getGlobalValue(), $g3648$.getGlobalValue(), (SubLObject)$ic6$);
    }
    
    public static SubLObject f31462(final SubLObject var5, final SubLObject var6) {
        return Equality.equal(var6, module0205.f13136(var5));
    }
    
    public static SubLObject f31463(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = module0191.f11990((SubLObject)$ic5$, var1, var2, (SubLObject)$ic6$);
        final SubLObject var4 = (SubLObject)ConsesLow.list(f31464());
        return Values.values(var3, var4);
    }
    
    public static SubLObject f31464() {
        return module0191.f11990((SubLObject)$ic8$, (SubLObject)$ic17$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31465(final SubLObject var7, final SubLObject var8, final SubLObject var5) {
        return module0279.f18552(var7, module0205.f13134(var5, var8, (SubLObject)UNPROVIDED), (SubLObject)NIL);
    }
    
    public static SubLObject f31466(final SubLObject var9, SubLObject var10) {
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        return module0202.f12725(var9, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31467(final SubLObject var9, SubLObject var10) {
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        final SubLObject var12 = module0205.f13389(var9, (SubLObject)UNPROVIDED);
        final SubLObject var13 = module0205.f13180(var12, (SubLObject)$ic28$);
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        var14 = var13;
        var15 = var14.first();
        for (var16 = (SubLObject)ZERO_INTEGER; NIL != var14; var14 = var14.rest(), var15 = var14.first(), var16 = module0048.f_1X(var16)) {
            final SubLObject var17 = module0202.f12769($ic15$, var15, var16, var12);
            var11.resetMultipleValues();
            final SubLObject var18 = module0235.f15474(var17, var9, (SubLObject)T, (SubLObject)T);
            final SubLObject var19 = var11.secondMultipleValue();
            var11.resetMultipleValues();
            if (NIL != var18) {
                module0347.f23330(f31464(), var18, var19);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31468(final SubLObject var5, final SubLObject var18) {
        return module0202.f12734(var5, var18, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31469(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = module0191.f11990((SubLObject)$ic5$, var1, var2, (SubLObject)$ic6$);
        final SubLObject var4 = (SubLObject)ConsesLow.list(f31470());
        return Values.values(var3, var4);
    }
    
    public static SubLObject f31470() {
        return module0191.f11990((SubLObject)$ic8$, (SubLObject)$ic46$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31471(final SubLObject var19, final SubLObject var20) {
        return Equality.equal(var20, module0205.f13134(var19, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31472() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0463", "f31460", "S#34767", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0463", "f31461", "S#34768", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0463", "f31462", "S#34769", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0463", "f31463", "S#34770", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0463", "f31464", "S#34771", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0463", "f31465", "S#34772", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0463", "f31466", "S#34773", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0463", "f31467", "S#34774", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0463", "f31468", "S#34775", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0463", "f31469", "S#34776", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0463", "f31470", "S#34777", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0463", "f31471", "S#34778", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31473() {
        $g3648$ = SubLFiles.deflexical("S#34779", (NIL != Symbols.boundp((SubLObject)$ic3$)) ? $g3648$.getGlobalValue() : $ic4$);
        $g3649$ = SubLFiles.deflexical("S#34780", (SubLObject)$ic7$);
        $g3650$ = SubLFiles.deflexical("S#34781", module0018.$g658$.getDynamicValue());
        $g3651$ = SubLFiles.deflexical("S#34782", (NIL != Symbols.boundp((SubLObject)$ic16$)) ? $g3651$.getGlobalValue() : $ic4$);
        $g3652$ = SubLFiles.deflexical("S#34783", module0018.$g658$.getDynamicValue());
        $g3653$ = SubLFiles.deflexical("S#34784", (NIL != Symbols.boundp((SubLObject)$ic30$)) ? $g3653$.getGlobalValue() : $ic4$);
        $g3654$ = SubLFiles.deflexical("S#34785", module0018.$g658$.getDynamicValue());
        $g3655$ = SubLFiles.deflexical("S#34786", (NIL != Symbols.boundp((SubLObject)$ic45$)) ? $g3655$.getGlobalValue() : $ic4$);
        $g3656$ = SubLFiles.deflexical("S#34787", module0018.$g658$.getDynamicValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31474() {
        module0340.f22938($ic0$);
        module0358.f23771((SubLObject)$ic1$, $ic0$, (SubLObject)TWO_INTEGER);
        module0358.f23773((SubLObject)$ic2$, $ic0$);
        module0003.f57((SubLObject)$ic3$);
        module0132.f8593((SubLObject)$ic3$, $ic0$);
        module0340.f22941((SubLObject)$ic9$, (SubLObject)$ic10$);
        module0340.f22941((SubLObject)$ic11$, (SubLObject)$ic12$);
        module0340.f22941((SubLObject)$ic13$, (SubLObject)$ic14$);
        module0340.f22938($ic15$);
        module0358.f23771((SubLObject)$ic1$, $ic15$, (SubLObject)THREE_INTEGER);
        module0003.f57((SubLObject)$ic16$);
        module0132.f8593((SubLObject)$ic16$, $ic15$);
        module0340.f22941((SubLObject)$ic18$, (SubLObject)$ic19$);
        module0340.f22941((SubLObject)$ic20$, (SubLObject)$ic21$);
        module0340.f22941((SubLObject)$ic22$, (SubLObject)$ic23$);
        module0340.f22941((SubLObject)$ic24$, (SubLObject)$ic25$);
        module0340.f22941((SubLObject)$ic26$, (SubLObject)$ic27$);
        module0340.f22938($ic29$);
        module0358.f23771((SubLObject)$ic1$, $ic29$, (SubLObject)ONE_INTEGER);
        module0358.f23773((SubLObject)$ic2$, $ic29$);
        module0003.f57((SubLObject)$ic30$);
        module0132.f8593((SubLObject)$ic30$, $ic29$);
        module0340.f22941((SubLObject)$ic31$, (SubLObject)$ic32$);
        module0340.f22941((SubLObject)$ic33$, (SubLObject)$ic34$);
        module0340.f22941((SubLObject)$ic35$, (SubLObject)$ic36$);
        module0340.f22938($ic37$);
        module0358.f23771((SubLObject)$ic1$, $ic37$, (SubLObject)ONE_INTEGER);
        module0358.f23773((SubLObject)$ic2$, $ic37$);
        module0340.f22941((SubLObject)$ic38$, (SubLObject)$ic39$);
        module0340.f22941((SubLObject)$ic40$, (SubLObject)$ic41$);
        module0340.f22941((SubLObject)$ic42$, (SubLObject)$ic43$);
        module0340.f22938($ic44$);
        module0358.f23774((SubLObject)$ic1$, $ic44$);
        module0358.f23773((SubLObject)$ic2$, $ic44$);
        module0003.f57((SubLObject)$ic45$);
        module0132.f8593((SubLObject)$ic45$, $ic44$);
        module0340.f22941((SubLObject)$ic47$, (SubLObject)$ic48$);
        module0340.f22941((SubLObject)$ic49$, (SubLObject)$ic50$);
        module0340.f22941((SubLObject)$ic51$, (SubLObject)$ic52$);
        module0340.f22941((SubLObject)$ic53$, (SubLObject)$ic54$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f31472();
    }
    
    public void initializeVariables() {
        f31473();
    }
    
    public void runTopLevelForms() {
        f31474();
    }
    
    static {
        me = (SubLFile)new module0463();
        $g3648$ = null;
        $g3649$ = null;
        $g3650$ = null;
        $g3651$ = null;
        $g3652$ = null;
        $g3653$ = null;
        $g3654$ = null;
        $g3655$ = null;
        $g3656$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("operatorFormulas"));
        $ic1$ = makeKeyword("POS");
        $ic2$ = makeKeyword("NEG");
        $ic3$ = makeSymbol("S#34779", "CYC");
        $ic4$ = constant_handles_oc.f8479((SubLObject)makeString("BaseKB"));
        $ic5$ = makeKeyword("OPAQUE");
        $ic6$ = makeKeyword("TRUE-MON");
        $ic7$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("equals")), (SubLObject)makeSymbol("?FORMULA"), (SubLObject)ConsesLow.cons((SubLObject)makeSymbol("?RELATION"), (SubLObject)makeSymbol("??ARGS"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("operatorFormulas")), (SubLObject)makeSymbol("?RELATION"), (SubLObject)makeSymbol("?FORMULA")));
        $ic8$ = makeKeyword("CODE");
        $ic9$ = makeKeyword("REMOVAL-OPERATOR-FORMULAS-CHECK-POS");
        $ic10$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("operatorFormulas")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("operatorFormulas")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#15500", "CYC")))), makeKeyword("CHECK"), T, makeKeyword("COST-EXPRESSION"), makeSymbol("S#34781", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("operatorFormulas")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#17572", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#6061", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#17572", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#6061", "CYC")))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#17572", "CYC"), (SubLObject)makeSymbol("S#6061", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34769", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#6061", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#17572", "CYC")))), makeKeyword("SUPPORT-MT"), makeSymbol("S#34779", "CYC"), makeKeyword("SUPPORT"), makeSymbol("S#34767", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$operatorFormulas <fully-bound> <CycL formula>)"), makeKeyword("EXAMPLE"), makeString("(#$operatorFormulas #$JuvenileFn (#$JuvenileFn #$Dog))") });
        $ic11$ = makeKeyword("REMOVAL-OPERATOR-FORMULAS-CHECK-NEG");
        $ic12$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("operatorFormulas")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("operatorFormulas")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#15500", "CYC")))), makeKeyword("CHECK"), T, makeKeyword("COST-EXPRESSION"), ConsesLow.list((SubLObject)makeSymbol("S#33874", "CYC"), (SubLObject)makeSymbol("S#34781", "CYC")), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("operatorFormulas")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#17572", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#6061", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#17572", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#6061", "CYC")))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#17572", "CYC"), (SubLObject)makeSymbol("S#6061", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#33876", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34769", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#6061", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#17572", "CYC"))))), makeKeyword("SUPPORT-MT"), makeSymbol("S#34779", "CYC"), makeKeyword("SUPPORT"), makeSymbol("S#34767", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$operatorFormulas <fully-bound> <CycL formula>)"), makeKeyword("EXAMPLE"), makeString("(#$not (#$operatorFormulas #$isa (#$JuvenileFn #$Dog)))") });
        $ic13$ = makeKeyword("REMOVAL-OPERATOR-FORMULAS-UNIFY");
        $ic14$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("operatorFormulas")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("operatorFormulas")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#15500", "CYC")))), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("operatorFormulas")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#6061", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#6061", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#33875", "CYC"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("operatorFormulas")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("FORMULA-OPERATOR"), (SubLObject)makeKeyword("INPUT")), (SubLObject)makeKeyword("INPUT"))), makeKeyword("SUPPORT-MT"), makeSymbol("S#34779", "CYC"), makeKeyword("SUPPORT"), makeSymbol("S#34767", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$operatorFormulas <not fully-bound> <CycL formula>)"), makeKeyword("EXAMPLE"), makeString("(#$operatorFormulas ?WHAT (#$JuvenileFn #$Dog))") });
        $ic15$ = constant_handles_oc.f8479((SubLObject)makeString("argN"));
        $ic16$ = makeSymbol("S#34782", "CYC");
        $ic17$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("argN")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("FormulaArgFn")), (SubLObject)makeSymbol("?N"), (SubLObject)makeSymbol("?FORMULA")), (SubLObject)makeSymbol("?N"), (SubLObject)makeSymbol("?FORMULA"));
        $ic18$ = makeKeyword("REMOVAL-ARG-N-CHECK-POS");
        $ic19$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("argN")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("argN")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("INTEGER"), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("argN")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("NON-NEGATIVE-INTEGER-P")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#15500", "CYC")))), makeKeyword("CHECK"), T, makeKeyword("COST-EXPRESSION"), makeSymbol("S#34783", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("argN")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#12141", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#15200", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#6061", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12141", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#15200", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#6061", "CYC")))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("S#15200", "CYC"), (SubLObject)makeSymbol("S#6061", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34772", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12141", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#15200", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#6061", "CYC")))), makeKeyword("SUPPORT-MT"), makeSymbol("S#34782", "CYC"), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT"), makeSymbol("S#34770", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$argN <fully-bound> <integer> <CycL formula>)"), makeKeyword("EXAMPLE"), makeString("(#$argN #$Dog 1 (#$JuvenileFn #$Dog))") });
        $ic20$ = makeKeyword("REMOVAL-ARG-N-CHECK-NEG");
        $ic21$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("argN")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("argN")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("INTEGER"), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("argN")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("NON-NEGATIVE-INTEGER-P")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#15500", "CYC")))), makeKeyword("CHECK"), T, makeKeyword("COST-EXPRESSION"), ConsesLow.list((SubLObject)makeSymbol("S#33874", "CYC"), (SubLObject)makeSymbol("S#34783", "CYC")), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("argN")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#12141", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#15200", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#6061", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12141", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#15200", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#6061", "CYC")))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("S#15200", "CYC"), (SubLObject)makeSymbol("S#6061", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#33876", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34772", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12141", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#15200", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#6061", "CYC"))))), makeKeyword("SUPPORT-MT"), makeSymbol("S#34782", "CYC"), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT"), makeSymbol("S#34770", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$argN <fully-bound> <integer> <CycL formula>)"), makeKeyword("EXAMPLE"), makeString("(#$not (#$argN #$Muffet 1 (#$JuvenileFn #$Dog)))") });
        $ic22$ = makeKeyword("REMOVAL-ARG-N-UNIFY-ARG1");
        $ic23$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("argN")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("argN")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("INTEGER"), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("argN")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("NON-NEGATIVE-INTEGER-P")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#15500", "CYC")))), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("argN")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#15200", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#6061", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#15200", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#6061", "CYC")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#15200", "CYC"), (SubLObject)makeSymbol("S#6061", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#10716", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#15512", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#6061", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#15200", "CYC"))))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("argN")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#15200", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#6061", "CYC"))), makeKeyword("SUPPORT-MT"), makeSymbol("S#34782", "CYC"), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT"), makeSymbol("S#34770", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$argN <not fully-bound> <integer> <CycL formula>)"), makeKeyword("EXAMPLE"), makeString("(#$argN ?WHAT 1 (#$JuvenileFn #$Dog))") });
        $ic24$ = makeKeyword("REMOVAL-ARG-N-UNIFY-ARG2");
        $ic25$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("argN")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("argN")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#15500", "CYC")))), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("argN")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#12141", "CYC")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#6061", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12141", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#6061", "CYC")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#15200", "CYC"), (SubLObject)makeSymbol("S#6061", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#16221", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#6061", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#15200", "CYC")), (SubLObject)EQUAL)), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("argN")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12141", "CYC")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#6061", "CYC"))), makeKeyword("SUPPORT-MT"), makeSymbol("S#34782", "CYC"), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT"), makeSymbol("S#34770", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$argN <fully-bound> <not-fully-bound> <CycL formula>)"), makeKeyword("EXAMPLE"), makeString("(#$argN #$Dog ?WHAT (#$JuvenileFn #$Dog))") });
        $ic26$ = makeKeyword("REMOVAL-ARG-N-ITERATE");
        $ic27$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("argN")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("argN")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#15500", "CYC")))), makeKeyword("COST"), makeSymbol("S#34773", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34774", "CYC"), makeKeyword("SUPPORT-MT"), makeSymbol("S#34782", "CYC"), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$argN <not-fully-bound> <not-fully-bound> <CycL formula>)"), makeKeyword("EXAMPLE"), makeString("(#$argN ?ARG ?NUM (#$JuvenileFn #$Dog))") });
        $ic28$ = makeKeyword("IGNORE");
        $ic29$ = constant_handles_oc.f8479((SubLObject)makeString("formulaArity"));
        $ic30$ = makeSymbol("S#34784", "CYC");
        $ic31$ = makeKeyword("REMOVAL-FORMULA-ARITY-CHECK-POS");
        $ic32$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("formulaArity")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("formulaArity")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#15500", "CYC")), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("CHECK"), T, makeKeyword("COST-EXPRESSION"), makeSymbol("S#34785", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("formulaArity")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#6061", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("ARITY"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#6061", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ARITY")))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#6061", "CYC"), (SubLObject)makeSymbol("ARITY")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34775", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#6061", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ARITY")))), makeKeyword("SUPPORT-MT"), makeSymbol("S#34784", "CYC"), makeKeyword("SUPPORT-MODULE"), makeKeyword("CODE"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$formulaArity <CycL formula> <integer>)"), makeKeyword("EXAMPLE"), makeString("(#$formulaArity (#$JuvenileFn #$Dog) 1)") });
        $ic33$ = makeKeyword("REMOVAL-FORMULA-ARITY-CHECK-NEG");
        $ic34$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("formulaArity")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("formulaArity")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#15500", "CYC")), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("CHECK"), T, makeKeyword("COST-EXPRESSION"), ConsesLow.list((SubLObject)makeSymbol("S#33874", "CYC"), (SubLObject)makeSymbol("S#34785", "CYC")), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("formulaArity")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#6061", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("ARITY"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#6061", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ARITY")))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#6061", "CYC"), (SubLObject)makeSymbol("ARITY")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#33876", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34775", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#6061", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ARITY"))))), makeKeyword("SUPPORT-MT"), makeSymbol("S#34784", "CYC"), makeKeyword("SUPPORT-MODULE"), makeKeyword("CODE"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$formulaArity <CycL formula> <integer>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$formulaArity (#$JuvenileFn #$Dog) 2))") });
        $ic35$ = makeKeyword("REMOVAL-FORMULA-ARITY-UNIFY");
        $ic36$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("formulaArity")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("formulaArity")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#15500", "CYC"))), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("formulaArity")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#6061", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#6061", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#33875", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#15640", "CYC"), (SubLObject)makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("formulaArity")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#6061", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("S#34784", "CYC"), makeKeyword("SUPPORT-MODULE"), makeKeyword("CODE"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$formulaArity <not fully-bound> <CycL formula>)"), makeKeyword("EXAMPLE"), makeString("(#$formulaArity ?WHAT (#$JuvenileFn #$Dog))") });
        $ic37$ = constant_handles_oc.f8479((SubLObject)makeString("quotedFormulaArity"));
        $ic38$ = makeKeyword("REMOVAL-QUOTED-FORMULA-ARITY-CHECK-POS");
        $ic39$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("quotedFormulaArity")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("quotedFormulaArity")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Quote")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#15500", "CYC"))), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("CHECK"), T, makeKeyword("COST-EXPRESSION"), makeSymbol("S#34785", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("quotedFormulaArity")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Quote")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#6061", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("ARITY"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#6061", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ARITY")))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#6061", "CYC"), (SubLObject)makeSymbol("ARITY")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34775", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#6061", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ARITY")))), makeKeyword("SUPPORT-MT"), makeSymbol("S#34784", "CYC"), makeKeyword("SUPPORT-MODULE"), makeKeyword("CODE"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$quotedFormulaArity (#$Quote <CycL formula>) <integer>)"), makeKeyword("EXAMPLE"), makeString("(#$quotedFormulaArity (#$Quote (#$JuvenileFn #$Dog)) 1)") });
        $ic40$ = makeKeyword("REMOVAL-QUOTED-FORMULA-ARITY-CHECK-NEG");
        $ic41$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("quotedFormulaArity")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("quotedFormulaArity")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Quote")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#15500", "CYC"))), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("CHECK"), T, makeKeyword("COST-EXPRESSION"), ConsesLow.list((SubLObject)makeSymbol("S#33874", "CYC"), (SubLObject)makeSymbol("S#34785", "CYC")), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("quotedFormulaArity")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Quote")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#6061", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("ARITY"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#6061", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ARITY")))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#6061", "CYC"), (SubLObject)makeSymbol("ARITY")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#33876", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34775", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#6061", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ARITY"))))), makeKeyword("SUPPORT-MT"), makeSymbol("S#34784", "CYC"), makeKeyword("SUPPORT-MODULE"), makeKeyword("CODE"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$quotedFormulaArity (#$Quote <CycL formula>) <integer>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$quotedFormulaArity (#$Quote (#$JuvenileFn #$Dog)) 2))") });
        $ic42$ = makeKeyword("REMOVAL-QUOTED-FORMULA-ARITY-UNIFY");
        $ic43$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("quotedFormulaArity")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("quotedFormulaArity")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Quote")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#15500", "CYC")))), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("quotedFormulaArity")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Quote")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#6061", "CYC"))), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#6061", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#33875", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#15640", "CYC"), (SubLObject)makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("quotedFormulaArity")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Quote")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#6061", "CYC"))), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("S#34784", "CYC"), makeKeyword("SUPPORT-MODULE"), makeKeyword("CODE"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$quotedFormulaArity <not fully-bound> <CycL formula>)"), makeKeyword("EXAMPLE"), makeString("(#$quotedFormulaArity ?WHAT (#$JuvenileFn #$Dog))") });
        $ic44$ = constant_handles_oc.f8479((SubLObject)makeString("cycLForSubL"));
        $ic45$ = makeSymbol("S#34786", "CYC");
        $ic46$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycLForSubL")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("SubLQuoteFn")), (SubLObject)makeSymbol("?SUBL")), (SubLObject)makeSymbol("?SUBL"));
        $ic47$ = makeKeyword("REMOVAL-CYCL-FOR-SUBL-CHECK-POS");
        $ic48$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("cycLForSubL")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycLForSubL")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#15500", "CYC")), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("CHECK"), T, makeKeyword("COST-EXPRESSION"), makeSymbol("S#34787", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycLForSubL")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34788", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#6061", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34788", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#6061", "CYC")))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("S#6061", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34778", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34788", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#6061", "CYC")))), makeKeyword("SUPPORT-MT"), makeSymbol("S#34786", "CYC"), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT"), makeSymbol("S#34776", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$cycLForSubL (#$SubLQuoteFn <SubL expression>) <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$cycLForSubL #$Dog (#$cycLForSubL #$Dog))") });
        $ic49$ = makeKeyword("REMOVAL-CYCL-FOR-SUBL-CHECK-NEG");
        $ic50$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("cycLForSubL")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycLForSubL")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#15500", "CYC")), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("CHECK"), T, makeKeyword("COST-EXPRESSION"), ConsesLow.list((SubLObject)makeSymbol("S#33874", "CYC"), (SubLObject)makeSymbol("S#34787", "CYC")), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycLForSubL")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34788", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#6061", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34788", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#6061", "CYC")))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("S#6061", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#33876", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34778", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34788", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#6061", "CYC"))))), makeKeyword("SUPPORT-MT"), makeSymbol("S#34786", "CYC"), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT"), makeSymbol("S#34776", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$cycLForSubL (#$SubLQuoteFn <SubL expression>) <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$cycLForSubL (#$SubLQuoteFn #$Dog) #$Cat))") });
        $ic51$ = makeKeyword("REMOVAL-CYCL-FOR-SUBL-UNIFY-ARG1");
        $ic52$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("cycLForSubL")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycLForSubL")), (SubLObject)makeKeyword("VARIABLE"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycLForSubL")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34788", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34788", "CYC")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34788", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#10716", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("MAKE-UNARY-FORMULA"), constant_handles_oc.f8479((SubLObject)makeString("SubLQuoteFn")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34788", "CYC"))))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycLForSubL")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34788", "CYC"))), makeKeyword("SUPPORT-MT"), makeSymbol("S#34786", "CYC"), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT"), makeSymbol("S#34776", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$cycLForSubL ?CYCL <SubL Formula>"), makeKeyword("EXAMPLE"), makeString("(#$cycLForSubL ?CYCL :FOO)") });
        $ic53$ = makeKeyword("REMOVAL-CYCL-FOR-SUBL-UNIFY-ARG2");
        $ic54$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("cycLForSubL")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycLForSubL")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#16313", "CYC")), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycLForSubL")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34789", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34789", "CYC")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34789", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#10716", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#15512", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34789", "CYC")), (SubLObject)ONE_INTEGER))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cycLForSubL")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34789", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("S#34786", "CYC"), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT"), makeSymbol("S#34776", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$cycLForSubL (#$SubLQuoteFn <SubL formula>) ?SUBL)"), makeKeyword("EXAMPLE"), makeString("(#$cycLForSubL (#$SubLQuoteFn :FOO) ?FOO)") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 314 ms
	
	Decompiled with Procyon 0.5.32.
*/