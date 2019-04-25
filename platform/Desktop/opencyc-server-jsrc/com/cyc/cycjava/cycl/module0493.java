package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0493 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0493";
    public static final String myFingerPrint = "b86440853b5f2a7cb56a3e713cf336c388d7182e7082e7f8c569c9519ced772a";
    private static SubLSymbol $g3766$;
    public static SubLSymbol $g3767$;
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLObject $ic4$;
    private static final SubLObject $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLList $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLList $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLList $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLList $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLList $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLObject $ic23$;
    private static final SubLObject $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLList $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLList $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLList $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLList $ic33$;
    
    public static SubLObject f32105(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0610.f37329(var1, module0147.$g2095$.getDynamicValue(var2), (SubLObject)$ic3$);
        return Sequences.length(var3);
    }
    
    public static SubLObject f32106(final SubLObject var4) {
        if (NIL != module0202.f12658(var4) && $ic4$.eql(module0205.f13276(var4))) {
            return Sequences.length(module0434.f30598(var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        return module0259.f16876(var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f32107(final SubLObject var1) {
        if (NIL != module0173.f10955(var1)) {
            if ($ic5$.eql(var1)) {
                return f32105(var1);
            }
            if (NIL != module0269.f17705(var1)) {
                return f32106(var1);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32108(final SubLObject var1, final SubLObject var5) {
        if (NIL != module0173.f10955(var1)) {
            final SubLObject var6 = module0610.f37220(var5);
            if (NIL != module0004.f106(var6)) {
                if ($ic5$.eql(var1)) {
                    return Numbers.zerop(var6);
                }
                if (NIL != module0269.f17705(var1)) {
                    return module0259.f16878(var1, var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32109(final SubLObject var7, final SubLObject var8) {
        assert NIL != Types.integerp(var8) : var8;
        return Numbers.numE(module0202.f12752(var7), var8);
    }
    
    public static SubLObject f32110(final SubLObject var7, final SubLObject var8) {
        return (SubLObject)makeBoolean(NIL != module0202.f12674(var7) && NIL != module0004.f106(var8) && NIL != f32109(var7, var8));
    }
    
    public static SubLObject f32111(final SubLObject var9, SubLObject var10) {
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        final SubLObject var11 = module0205.f13387(var9, (SubLObject)UNPROVIDED);
        final SubLObject var12 = module0205.f13388(var9, (SubLObject)UNPROVIDED);
        return (SubLObject)makeBoolean(NIL == f32110(var11, var12));
    }
    
    public static SubLObject f32112() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0493", "f32105", "S#35493", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0493", "f32106", "S#35494", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0493", "f32107", "S#35495", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0493", "f32108", "S#35496", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0493", "f32109", "S#35497", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0493", "f32110", "S#35498", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0493", "f32111", "S#35499", 1, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32113() {
        $g3766$ = SubLFiles.deflexical("S#35500", module0018.$g661$.getGlobalValue());
        $g3767$ = SubLFiles.deflexical("S#35501", (NIL != Symbols.boundp((SubLObject)$ic22$)) ? $g3767$.getGlobalValue() : $ic23$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32114() {
        module0340.f22938($ic0$);
        module0358.f23771((SubLObject)$ic1$, $ic0$, (SubLObject)ONE_INTEGER);
        module0358.f23773((SubLObject)$ic2$, $ic0$);
        module0340.f22941((SubLObject)$ic6$, (SubLObject)$ic7$);
        module0340.f22941((SubLObject)$ic8$, (SubLObject)$ic9$);
        module0340.f22941((SubLObject)$ic10$, (SubLObject)$ic11$);
        module0340.f22941((SubLObject)$ic12$, (SubLObject)$ic13$);
        module0340.f22941((SubLObject)$ic14$, (SubLObject)$ic15$);
        module0340.f22941((SubLObject)$ic16$, (SubLObject)$ic17$);
        module0340.f22941((SubLObject)$ic18$, (SubLObject)$ic19$);
        module0340.f22941((SubLObject)$ic20$, (SubLObject)$ic21$);
        module0003.f57((SubLObject)$ic22$);
        module0132.f8593((SubLObject)$ic22$, $ic24$);
        module0340.f22941((SubLObject)$ic26$, (SubLObject)$ic27$);
        module0340.f22941((SubLObject)$ic28$, (SubLObject)$ic29$);
        module0340.f22941((SubLObject)$ic30$, (SubLObject)$ic31$);
        module0358.f23771((SubLObject)$ic1$, $ic24$, (SubLObject)ONE_INTEGER);
        module0358.f23773((SubLObject)$ic2$, $ic24$);
        module0340.f22941((SubLObject)$ic32$, (SubLObject)$ic33$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f32112();
    }
    
    public void initializeVariables() {
        f32113();
    }
    
    public void runTopLevelForms() {
        f32114();
    }
    
    static {
        me = (SubLFile)new module0493();
        $g3766$ = null;
        $g3767$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("extentCardinality"));
        $ic1$ = makeKeyword("POS");
        $ic2$ = makeKeyword("NEG");
        $ic3$ = makeKeyword("HL");
        $ic4$ = constant_handles_oc.f8479((SubLObject)makeString("TheCollectionOf"));
        $ic5$ = constant_handles_oc.f8479((SubLObject)makeString("TheEmptySet"));
        $ic6$ = makeKeyword("REMOVAL-EXTENT-CARDINALITY-FORT-GENERATE");
        $ic7$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("extentCardinality")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("extentCardinality")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35500", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("extentCardinality")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("SET")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("SET"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#10716", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35495", "CYC"), (SubLObject)makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("extentCardinality")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("SET")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("*MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$extentCardinality <fort> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$extentCardinality #$MonthOfYearType ?COUNT)") });
        $ic8$ = makeKeyword("REMOVAL-EXTENT-CARDINALITY-FORT-CHECK-POS");
        $ic9$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("extentCardinality")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("extentCardinality")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35500", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("extentCardinality")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("SET")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35502", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("SET")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35502", "CYC")))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("SET"), (SubLObject)makeSymbol("S#35502", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35496", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("SET")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35502", "CYC")))), makeKeyword("SUPPORT-MT"), makeSymbol("*MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$extentCardinality <fort> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$extentCardinality #$MonthOfYearType 12)") });
        $ic10$ = makeKeyword("REMOVAL-EXTENT-CARDINALITY-FORT-CHECK-NEG");
        $ic11$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("extentCardinality")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("extentCardinality")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35500", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("extentCardinality")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("SET")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35502", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("SET")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35502", "CYC")))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("SET"), (SubLObject)makeSymbol("S#35502", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#33876", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35496", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("SET")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35502", "CYC"))))), makeKeyword("SUPPORT-MT"), makeSymbol("*MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$extentCardinality <fort> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$extentCardinality #$MonthOfYearType 14))") });
        $ic12$ = makeKeyword("REMOVAL-EXTENT-CARDINALITY-THESET");
        $ic13$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("extentCardinality")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("extentCardinality")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("TheSet")), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1887", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("extentCardinality")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("SET")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("SET"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#10716", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35493", "CYC"), (SubLObject)makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("extentCardinality")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("SET")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("*MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$extentCardinality (#$TheSet . <fully-bound>) <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$extentCardinality (#$TheSet #$Andorra #$France #$Portugal) ?COUNT)") });
        $ic14$ = makeKeyword("REMOVAL-EXTENT-CARDINALITY-THESETOF");
        $ic15$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("extentCardinality")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("extentCardinality")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheSetOf")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1889", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("extentCardinality")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("SET")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("SET"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#10716", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35493", "CYC"), (SubLObject)makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("extentCardinality")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("SET")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("*MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$extentCardinality (#$TheSetOf <variable> <closed except for variable>) <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$extentCardinality \n      (#$TheSetOf ?COUNTRY\n        (#$and\n          (#$isa ?COUNTRY #$Country)\n          (#$politiesBorderEachOther #$Spain ?COUNTRY)))\n      ?COUNT)") });
        $ic16$ = makeKeyword("REMOVAL-EXTENT-CARDINALITY-THECOLLECTIONOF");
        $ic17$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("extentCardinality")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("extentCardinality")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NAT"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheCollectionOf")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND"))), (SubLObject)makeKeyword("ANYTHING")), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("SUPPLANTS"), ConsesLow.list((SubLObject)makeKeyword("REMOVAL-EXTENT-CARDINALITY-FORT-GENERATE"), (SubLObject)makeKeyword("REMOVAL-EXTENT-CARDINALITY-FORT-CHECK-POS")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1889", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("extentCardinality")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#12458", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12458", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#10716", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35494", "CYC"), (SubLObject)makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("extentCardinality")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12458", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("*MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$extentCardinality (#$TheCollectionOf <variable> <closed except for variable>) <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$extentCardinality \n      (#$TheCollectionOf ?COUNTRY\n        (#$and\n          (#$isa ?COUNTRY #$Country)\n          (#$politiesBorderEachOther #$Spain ?COUNTRY)))\n      ?COUNT)") });
        $ic18$ = makeKeyword("REMOVAL-EXTENT-CARDINALITY-CYCLASSERTION");
        $ic19$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("extentCardinality")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("extentCardinality")), constant_handles_oc.f8479((SubLObject)makeString("CycLAssertion")), (SubLObject)makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1887", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("SUPPLANTS"), ConsesLow.list((SubLObject)makeKeyword("REMOVAL-EXTENT-CARDINALITY-FORT-GENERATE"), (SubLObject)makeKeyword("REMOVAL-EXTENT-CARDINALITY-FORT-CHECK-POS")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#10716", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("ASSERTION-COUNT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("extentCardinality")), constant_handles_oc.f8479((SubLObject)makeString("CycLAssertion")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("*MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$extentCardinality #$CycLAssertion <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$extentCardinality #$CycLAssertion ?COUNT)") });
        $ic20$ = makeKeyword("REMOVAL-EXTENT-CARDINALITY-CYCLREIFIEDDENOTATIONALTERM");
        $ic21$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("extentCardinality")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("extentCardinality")), constant_handles_oc.f8479((SubLObject)makeString("CycLReifiedDenotationalTerm")), (SubLObject)makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1887", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("SUPPLANTS"), ConsesLow.list((SubLObject)makeKeyword("REMOVAL-EXTENT-CARDINALITY-FORT-GENERATE"), (SubLObject)makeKeyword("REMOVAL-EXTENT-CARDINALITY-FORT-CHECK-POS")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#10716", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("FORT-COUNT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("extentCardinality")), constant_handles_oc.f8479((SubLObject)makeString("CycLReifiedDenotationalTerm")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("*MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$extentCardinality #$CycLReifiedDenotationalTerm <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$extentCardinality #$CycLReifiedDenotationalTerm ?COUNT)") });
        $ic22$ = makeSymbol("S#35501", "CYC");
        $ic23$ = constant_handles_oc.f8479((SubLObject)makeString("BaseKB"));
        $ic24$ = constant_handles_oc.f8479((SubLObject)makeString("lengthOfList"));
        $ic25$ = makeSymbol("INTEGERP");
        $ic26$ = makeKeyword("REMOVAL-LENGTH-OF-THELIST-CHECK-POS");
        $ic27$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("lengthOfList")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("lengthOfList")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#15600", "CYC"))), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1887", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("CHECK"), T, makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("lengthOfList")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("LIST")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("LENGTH"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("LIST")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("LENGTH")))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("LIST"), (SubLObject)makeSymbol("LENGTH")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35498", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("LIST")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("LENGTH")))), makeKeyword("SUPPORT-MT"), makeSymbol("S#35501", "CYC"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$lengthOfList (#$TheList . <fully-bound>) <fully-bound>) or\n    (#$lengthOfList #$TheEmptyList <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$lengthOfList (#$TheList #$Andorra #$France #$Portugal) 3)\n    (#$lengthOfList (#$TheList) 0)\n    (#$lengthOfList #$TheEmptyList 0)") });
        $ic28$ = makeKeyword("REMOVAL-LENGTH-OF-THELIST-CHECK-NEG");
        $ic29$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("lengthOfList")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("lengthOfList")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#15600", "CYC"))), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1887", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("CHECK"), T, makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("lengthOfList")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("LIST")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("LENGTH"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("LIST")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("LENGTH")))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("LIST"), (SubLObject)makeSymbol("LENGTH")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#33876", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35498", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("LIST")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("LENGTH"))))), makeKeyword("SUPPORT-MT"), makeSymbol("S#35501", "CYC"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$lengthOfList (#$TheList . <fully-bound>) <fully-bound>)) or\n    (#$not (#$lengthOfList #$TheEmptyList <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$lengthOfList (#$TheList #$Andorra #$France #$Portugal) 1))\n    (#$not (#$lengthOfList (#$TheList) 1))\n    (#$not (#$lengthOfList #$TheEmptyList 1))") });
        $ic30$ = makeKeyword("REMOVAL-LENGTH-OF-THELIST-GENERATE");
        $ic31$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("lengthOfList")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("lengthOfList")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#15600", "CYC"))), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("lengthOfList")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("LIST")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("LIST"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#33875", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#15665", "CYC"), (SubLObject)makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("lengthOfList")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("LIST")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("S#35501", "CYC"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$lengthOfList (#$TheList . <fully-bound>) <not-fully-bound>) or\n    (#$lengthOfList #$TheEmptyList <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$lengthOfList (#$TheList #$Andorra #$France #$Portugal) ?COUNT)\n    (#$lengthOfList (#$TheList) ?COUNT)\n    (#$lengthOfList #$TheEmptyList ?COUNT)") });
        $ic32$ = makeKeyword("REMOVAL-LENGTH-OF-THELIST-PRUNE");
        $ic33$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("lengthOfList")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("lengthOfList")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("TheList")), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#2028", "CYC"))), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("REQUIRED"), makeSymbol("S#35499", "CYC"), makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("pruning module that handles\n    (#$lengthOfList (#$TheList . <not fully-bound>) <fully-bound>) \n    where the length in ARG2 does not match the list in ARG1"), makeKeyword("EXAMPLE"), makeString("(#$lengthOfList (#$TheList #$isa ?X) 1)") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 180 ms
	
	Decompiled with Procyon 0.5.32.
*/