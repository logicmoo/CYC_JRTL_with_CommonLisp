package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0468 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0468";
    public static final String myFingerPrint = "11cb0555c169606db7e8104136025a5e2965b1e5012ca7ca6ea12f00fa703748";
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLObject $ic10$;
    private static final SubLList $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLObject $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLList $ic17$;
    private static final SubLObject $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLList $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLList $ic22$;
    private static final SubLObject $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLList $ic26$;
    private static final SubLObject $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLList $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLList $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLList $ic33$;
    
    public static SubLObject f31544(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0205.f13204(var1, (SubLObject)UNPROVIDED);
        SubLObject var5 = (SubLObject)NIL;
        final SubLObject var6 = module0147.f9540((SubLObject)ConsesLow.listS($ic10$, var4, (SubLObject)$ic11$));
        final SubLObject var7 = module0147.$g2095$.currentBinding(var3);
        final SubLObject var8 = module0147.$g2094$.currentBinding(var3);
        final SubLObject var9 = module0147.$g2096$.currentBinding(var3);
        try {
            module0147.$g2095$.bind(module0147.f9545(var6), var3);
            module0147.$g2094$.bind(module0147.f9546(var6), var3);
            module0147.$g2096$.bind(module0147.f9549(var6), var3);
            var5 = module0218.f14458((SubLObject)ConsesLow.list($ic10$, var4), (SubLObject)UNPROVIDED);
        }
        finally {
            module0147.$g2096$.rebind(var9, var3);
            module0147.$g2094$.rebind(var8, var3);
            module0147.$g2095$.rebind(var7, var3);
        }
        return var5;
    }
    
    public static SubLObject f31545(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)ConsesLow.list(var4);
        final SubLObject var7 = module0147.f9540((SubLObject)ConsesLow.listS($ic10$, var4, (SubLObject)$ic11$));
        final SubLObject var8 = module0147.$g2095$.currentBinding(var5);
        final SubLObject var9 = module0147.$g2094$.currentBinding(var5);
        final SubLObject var10 = module0147.$g2096$.currentBinding(var5);
        try {
            module0147.$g2095$.bind(module0147.f9545(var7), var5);
            module0147.$g2094$.bind(module0147.f9546(var7), var5);
            module0147.$g2096$.bind(module0147.f9549(var7), var5);
            SubLObject var11 = module0218.f14453((SubLObject)ConsesLow.list($ic10$, var4), (SubLObject)UNPROVIDED);
            SubLObject var12 = (SubLObject)NIL;
            var12 = var11.first();
            while (NIL != var11) {
                final SubLObject var13 = module0178.f11287(var12);
                if (NIL != module0161.f10513(var4, module0161.f10557(var13))) {
                    final SubLObject var14 = var13;
                    if (NIL == conses_high.member(var14, var6, (SubLObject)$ic12$, Symbols.symbol_function((SubLObject)IDENTITY))) {
                        var6 = (SubLObject)ConsesLow.cons(var14, var6);
                    }
                }
                var11 = var11.rest();
                var12 = var11.first();
            }
        }
        finally {
            module0147.$g2096$.rebind(var10, var5);
            module0147.$g2094$.rebind(var9, var5);
            module0147.$g2095$.rebind(var8, var5);
        }
        return module0052.f3709(var6);
    }
    
    public static SubLObject f31546(final SubLObject var1) {
        SubLObject var2 = module0205.f13207(var1, (SubLObject)UNPROVIDED);
        if (NIL != module0035.f2369((SubLObject)$ic24$, var2, (SubLObject)UNPROVIDED)) {
            var2 = module0612.f37521(var2);
        }
        return module0267.f17584(var2);
    }
    
    public static SubLObject f31547(final SubLObject var16, final SubLObject var17, final SubLObject var18, final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        if (NIL != module0305.f20438(var16, var18, (SubLObject)UNPROVIDED) && NIL != module0305.f20438(var17, var18, (SubLObject)UNPROVIDED)) {
            var20.resetMultipleValues();
            final SubLObject var21 = module0234.f15444(var16, module0615.f37720(var17, var18, var19), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var22 = var20.secondMultipleValue();
            var20.resetMultipleValues();
            return var21;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31548(final SubLObject var18, final SubLObject var19, final SubLObject var22) {
        final SubLObject var23 = (SubLObject)((NIL != module0305.f20438(var22, var18, (SubLObject)UNPROVIDED)) ? module0615.f37720(var22, var18, var19) : NIL);
        return (SubLObject)((NIL != var23) ? ConsesLow.list(var23) : NIL);
    }
    
    public static SubLObject f31549(final SubLObject var18, final SubLObject var19, final SubLObject var22) {
        final SubLObject var23 = (SubLObject)((NIL != module0305.f20438(var22, var18, (SubLObject)UNPROVIDED)) ? module0615.f37717(var22, var18, var19) : NIL);
        return (SubLObject)((NIL != var23) ? ConsesLow.list(var23) : NIL);
    }
    
    public static SubLObject f31550() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0468", "f31544", "S#34884", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0468", "f31545", "S#34885", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0468", "f31546", "S#34886", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0468", "f31547", "S#34887", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0468", "f31548", "S#34888", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0468", "f31549", "S#34889", 3, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31551() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31552() {
        module0340.f22938($ic0$);
        module0358.f23774((SubLObject)$ic1$, $ic0$);
        module0340.f22941((SubLObject)$ic2$, (SubLObject)$ic3$);
        module0340.f22941((SubLObject)$ic4$, (SubLObject)$ic5$);
        module0340.f22941((SubLObject)$ic6$, (SubLObject)$ic7$);
        module0358.f23730((SubLObject)$ic8$, (SubLObject)$ic9$);
        module0340.f22938($ic13$);
        module0358.f23771((SubLObject)$ic1$, $ic13$, (SubLObject)ONE_INTEGER);
        module0340.f22941((SubLObject)$ic14$, (SubLObject)$ic15$);
        module0340.f22941((SubLObject)$ic16$, (SubLObject)$ic17$);
        module0340.f22938($ic18$);
        module0358.f23771((SubLObject)$ic1$, $ic18$, (SubLObject)ONE_INTEGER);
        module0340.f22941((SubLObject)$ic19$, (SubLObject)$ic20$);
        module0340.f22941((SubLObject)$ic21$, (SubLObject)$ic22$);
        module0340.f22938($ic23$);
        module0358.f23773((SubLObject)$ic1$, $ic23$);
        module0340.f22941((SubLObject)$ic25$, (SubLObject)$ic26$);
        module0340.f22938($ic27$);
        module0340.f22941((SubLObject)$ic28$, (SubLObject)$ic29$);
        module0340.f22941((SubLObject)$ic30$, (SubLObject)$ic31$);
        module0340.f22941((SubLObject)$ic32$, (SubLObject)$ic33$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f31550();
    }
    
    public void initializeVariables() {
        f31551();
    }
    
    public void runTopLevelForms() {
        f31552();
    }
    
    static {
        me = (SubLFile)new module0468();
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("mtMonad"));
        $ic1$ = makeKeyword("POS");
        $ic2$ = makeKeyword("REMOVAL-MT-MONAD-CHECK");
        $ic3$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("mtMonad")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("mtMonad")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1887", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("mtMonad")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#13431", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34890", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13431", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34890", "CYC")))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#13431", "CYC"), (SubLObject)makeSymbol("S#34890", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#13355", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("HLMT-MONAD-MT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13431", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34890", "CYC")))), makeKeyword("DOCUMENTATION"), makeString("(#$mtMonad <fully-bound> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$mtMonad (#$MtSpace #$HumanActivitiesMt (#$MtTimeDimFn (#$YearFn 2000))) #$HumanActivitiesMt)") });
        $ic4$ = makeKeyword("REMOVAL-MT-MONAD-UNIFY");
        $ic5$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("mtMonad")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("mtMonad")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1887", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("mtMonad")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#13431", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13431", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#10716", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("HLMT-MONAD-MT"), (SubLObject)makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("mtMonad")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13431", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$mtMonad <fully-bound> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$mtMonad (#$MtSpace #$HumanActivitiesMt (#$MtTimeDimFn (#$YearFn 2000))) ?MONAD)\n    -->\n    (((?MONAD . #$HumanActivitiesMt)))") });
        $ic6$ = makeKeyword("REMOVAL-MT-MONAD-UNIFY-ARG1");
        $ic7$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("mtMonad")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("mtMonad")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST"), makeSymbol("S#34884", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("mtMonad")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34890", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34890", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34885", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("mtMonad")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34890", "CYC"))), makeKeyword("DOCUMENTATION"), makeString("(#$mtMonad <not-fully-bound> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$mtMonad ?HLMT #$HumanActivitiesMt)") });
        $ic8$ = makeKeyword("MT-MONAD-UNIFY-ARG1-POS");
        $ic9$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("mtMonad")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("mtMonad")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic10$ = constant_handles_oc.f8479((SubLObject)makeString("MtSpace"));
        $ic11$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("AnytimePSC")));
        $ic12$ = makeSymbol("HLMT-EQUAL");
        $ic13$ = constant_handles_oc.f8479((SubLObject)makeString("mtTimeIndex"));
        $ic14$ = makeKeyword("REMOVAL-MT-TIME-INDEX-CHECK");
        $ic15$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("mtTimeIndex")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("mtTimeIndex")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1887", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("mtTimeIndex")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#13431", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("TIME"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13431", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("TIME")))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#13431", "CYC"), (SubLObject)makeSymbol("TIME")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#13380", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#13385", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13431", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("TIME")))), makeKeyword("DOCUMENTATION"), makeString("(#$mtTimeIndex <fully-bound> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$mtTimeIndex (#$MtSpace #$HumanActivitiesMt (#$MtTimeDimFn (#$YearFn 2000))) (#$YearFn 2000))") });
        $ic16$ = makeKeyword("REMOVAL-MT-TIME-INDEX-UNIFY");
        $ic17$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("mtTimeIndex")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("mtTimeIndex")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1887", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("mtTimeIndex")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#13431", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13431", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#10716", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#13385", "CYC"), (SubLObject)makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("mtTimeIndex")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13431", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$mtTimeIndex <fully-bound> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$mtTimeIndex (#$MtSpace #$HumanActivitiesMt (#$MtTimeDimFn (#$YearFn 2000))) ?TIME)\n    -->\n    (((?TIME #$YearFn 2000)))") });
        $ic18$ = constant_handles_oc.f8479((SubLObject)makeString("mtTimeParameter"));
        $ic19$ = makeKeyword("REMOVAL-MT-TIME-PARAMETER-CHECK");
        $ic20$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("mtTimeParameter")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("mtTimeParameter")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1887", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("mtTimeParameter")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#13431", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#5251", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13431", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#5251", "CYC")))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#13431", "CYC"), (SubLObject)makeSymbol("S#5251", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#13381", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#13386", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13431", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#5251", "CYC")))), makeKeyword("DOCUMENTATION"), makeString("(#$mtTimeParameter <fully-bound> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$mtTimeParameter (#$MtSpace #$HumanActivitiesMt (#$MtTimeWithGranularityDimFn (#$YearFn 2000) #$CalendarSecond)) #$CalendarSecond)") });
        $ic21$ = makeKeyword("REMOVAL-MT-TIME-PARAMETER-UNIFY");
        $ic22$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("mtTimeParameter")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("mtTimeParameter")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1887", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("mtTimeParameter")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#13431", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13431", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#10716", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#13386", "CYC"), (SubLObject)makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("mtTimeParameter")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13431", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$mtTimeParameter <fully-bound> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$mtTimeParameter (#$MtSpace #$HumanActivitiesMt (#$MtTimeWithGranularityDimFn (#$YearFn 2000) #$CalendarSecond)) ?PARAM)\n    -->\n    (((?PARAM . #$CalendarSecond)))") });
        $ic23$ = constant_handles_oc.f8479((SubLObject)makeString("temporalMicrotheoriesIntersect"));
        $ic24$ = makeSymbol("S#20160", "CYC");
        $ic25$ = makeKeyword("REMOVAL-TEMPORAL-MICROTHEORIES-INTERSECT-CHECK-POS");
        $ic26$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporalMicrotheoriesIntersect")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("temporalMicrotheoriesIntersect")), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1889", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34886", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporalMicrotheoriesIntersect . <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$temporalMicrotheoriesIntersect (#$MtTimeWithGranularityDimFn (#$YearFn 2004) #$CalendarMonth) (#$MtTimeDimFn (#$MonthFn #$September (#$YearFn 2004))))") });
        $ic27$ = constant_handles_oc.f8479((SubLObject)makeString("precedes-Metric"));
        $ic28$ = makeKeyword("REMOVAL-PRECEDES-METRIC-CHECK");
        $ic29$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("precedes-Metric")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("precedes-Metric")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("POSITIVE-INTEGER-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1889", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("precedes-Metric")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34891", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34892", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("TYPE")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#17306", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34891", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34892", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("TYPE")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#17306", "CYC")))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34891", "CYC"), (SubLObject)makeSymbol("S#34892", "CYC"), (SubLObject)makeSymbol("TYPE"), (SubLObject)makeSymbol("S#17306", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34887", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34891", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34892", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("TYPE")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#17306", "CYC")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$precedes-Metric <fully-bound> <fully-bound> <fully-bound> <positive-integer-p>"), makeKeyword("EXAMPLE"), makeString("(#$precedes-Metric (#$YearFn 2001) (#$YearFn 2004) #$CalendarYear 3)") });
        $ic30$ = makeKeyword("REMOVAL-PRECEDES-METRIC-UNIFY-1");
        $ic31$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("precedes-Metric")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("precedes-Metric")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("POSITIVE-INTEGER-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1889", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("precedes-Metric")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#24567", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("TYPE")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#17306", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#24567", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("TYPE")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#17306", "CYC")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#24567", "CYC"), (SubLObject)makeSymbol("TYPE"), (SubLObject)makeSymbol("S#17306", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34888", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("TYPE")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#17306", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#24567", "CYC")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("precedes-Metric")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#24567", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("TYPE")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#17306", "CYC"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$precedes-Metric <not-fully-bound> <fully-bound> <fully-bound> <positive-integer-p>"), makeKeyword("EXAMPLE"), makeString("(#$precedes-Metric ?WHAT (#$YearFn 2004) #$CalendarYear 3)") });
        $ic32$ = makeKeyword("REMOVAL-PRECEDES-METRIC-UNIFY-2");
        $ic33$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("precedes-Metric")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("precedes-Metric")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("POSITIVE-INTEGER-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1889", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("precedes-Metric")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#24567", "CYC")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("TYPE")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#17306", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#24567", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("TYPE")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#17306", "CYC")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#24567", "CYC"), (SubLObject)makeSymbol("TYPE"), (SubLObject)makeSymbol("S#17306", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34889", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("TYPE")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#17306", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#24567", "CYC")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("precedes-Metric")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#24567", "CYC")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("TYPE")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#17306", "CYC"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$precedes-Metric <fully-bound> <not-fully-bound> <fully-bound> <positive-integer-p>"), makeKeyword("EXAMPLE"), makeString("(#$precedes-Metric (#$YearFn 2001) ?WHAT #$CalendarYear 3)") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 189 ms
	
	Decompiled with Procyon 0.5.32.
*/