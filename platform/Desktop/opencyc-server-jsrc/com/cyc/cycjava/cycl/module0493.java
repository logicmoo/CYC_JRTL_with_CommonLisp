package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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
        final SubLObject var3 = module0610.f37329(var1, module0147.$g2095$.getDynamicValue(var2), (SubLObject)module0493.$ic3$);
        return Sequences.length(var3);
    }
    
    public static SubLObject f32106(final SubLObject var4) {
        if (module0493.NIL != module0202.f12658(var4) && module0493.$ic4$.eql(module0205.f13276(var4))) {
            return Sequences.length(module0434.f30598(var4, (SubLObject)module0493.UNPROVIDED, (SubLObject)module0493.UNPROVIDED));
        }
        return module0259.f16876(var4, (SubLObject)module0493.UNPROVIDED, (SubLObject)module0493.UNPROVIDED);
    }
    
    public static SubLObject f32107(final SubLObject var1) {
        if (module0493.NIL != module0173.f10955(var1)) {
            if (module0493.$ic5$.eql(var1)) {
                return f32105(var1);
            }
            if (module0493.NIL != module0269.f17705(var1)) {
                return f32106(var1);
            }
        }
        return (SubLObject)module0493.NIL;
    }
    
    public static SubLObject f32108(final SubLObject var1, final SubLObject var5) {
        if (module0493.NIL != module0173.f10955(var1)) {
            final SubLObject var6 = module0610.f37220(var5);
            if (module0493.NIL != module0004.f106(var6)) {
                if (module0493.$ic5$.eql(var1)) {
                    return Numbers.zerop(var6);
                }
                if (module0493.NIL != module0269.f17705(var1)) {
                    return module0259.f16878(var1, var6, (SubLObject)module0493.UNPROVIDED, (SubLObject)module0493.UNPROVIDED);
                }
            }
        }
        return (SubLObject)module0493.NIL;
    }
    
    public static SubLObject f32109(final SubLObject var7, final SubLObject var8) {
        assert module0493.NIL != Types.integerp(var8) : var8;
        return Numbers.numE(module0202.f12752(var7), var8);
    }
    
    public static SubLObject f32110(final SubLObject var7, final SubLObject var8) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0493.NIL != module0202.f12674(var7) && module0493.NIL != module0004.f106(var8) && module0493.NIL != f32109(var7, var8));
    }
    
    public static SubLObject f32111(final SubLObject var9, SubLObject var10) {
        if (var10 == module0493.UNPROVIDED) {
            var10 = (SubLObject)module0493.NIL;
        }
        final SubLObject var11 = module0205.f13387(var9, (SubLObject)module0493.UNPROVIDED);
        final SubLObject var12 = module0205.f13388(var9, (SubLObject)module0493.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0493.NIL == f32110(var11, var12));
    }
    
    public static SubLObject f32112() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0493", "f32105", "S#35493", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0493", "f32106", "S#35494", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0493", "f32107", "S#35495", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0493", "f32108", "S#35496", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0493", "f32109", "S#35497", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0493", "f32110", "S#35498", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0493", "f32111", "S#35499", 1, 1, false);
        return (SubLObject)module0493.NIL;
    }
    
    public static SubLObject f32113() {
        module0493.$g3766$ = SubLFiles.deflexical("S#35500", module0018.$g661$.getGlobalValue());
        module0493.$g3767$ = SubLFiles.deflexical("S#35501", (module0493.NIL != Symbols.boundp((SubLObject)module0493.$ic22$)) ? module0493.$g3767$.getGlobalValue() : module0493.$ic23$);
        return (SubLObject)module0493.NIL;
    }
    
    public static SubLObject f32114() {
        module0340.f22938(module0493.$ic0$);
        module0358.f23771((SubLObject)module0493.$ic1$, module0493.$ic0$, (SubLObject)module0493.ONE_INTEGER);
        module0358.f23773((SubLObject)module0493.$ic2$, module0493.$ic0$);
        module0340.f22941((SubLObject)module0493.$ic6$, (SubLObject)module0493.$ic7$);
        module0340.f22941((SubLObject)module0493.$ic8$, (SubLObject)module0493.$ic9$);
        module0340.f22941((SubLObject)module0493.$ic10$, (SubLObject)module0493.$ic11$);
        module0340.f22941((SubLObject)module0493.$ic12$, (SubLObject)module0493.$ic13$);
        module0340.f22941((SubLObject)module0493.$ic14$, (SubLObject)module0493.$ic15$);
        module0340.f22941((SubLObject)module0493.$ic16$, (SubLObject)module0493.$ic17$);
        module0340.f22941((SubLObject)module0493.$ic18$, (SubLObject)module0493.$ic19$);
        module0340.f22941((SubLObject)module0493.$ic20$, (SubLObject)module0493.$ic21$);
        module0003.f57((SubLObject)module0493.$ic22$);
        module0132.f8593((SubLObject)module0493.$ic22$, module0493.$ic24$);
        module0340.f22941((SubLObject)module0493.$ic26$, (SubLObject)module0493.$ic27$);
        module0340.f22941((SubLObject)module0493.$ic28$, (SubLObject)module0493.$ic29$);
        module0340.f22941((SubLObject)module0493.$ic30$, (SubLObject)module0493.$ic31$);
        module0358.f23771((SubLObject)module0493.$ic1$, module0493.$ic24$, (SubLObject)module0493.ONE_INTEGER);
        module0358.f23773((SubLObject)module0493.$ic2$, module0493.$ic24$);
        module0340.f22941((SubLObject)module0493.$ic32$, (SubLObject)module0493.$ic33$);
        return (SubLObject)module0493.NIL;
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
        module0493.$g3766$ = null;
        module0493.$g3767$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("extentCardinality"));
        $ic1$ = SubLObjectFactory.makeKeyword("POS");
        $ic2$ = SubLObjectFactory.makeKeyword("NEG");
        $ic3$ = SubLObjectFactory.makeKeyword("HL");
        $ic4$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TheCollectionOf"));
        $ic5$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TheEmptySet"));
        $ic6$ = SubLObjectFactory.makeKeyword("REMOVAL-EXTENT-CARDINALITY-FORT-GENERATE");
        $ic7$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("extentCardinality")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("extentCardinality")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#35500", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("extentCardinality")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SET"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#10716", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35495", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("extentCardinality")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*MT*"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$extentCardinality <fort> <not-fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$extentCardinality #$MonthOfYearType ?COUNT)") });
        $ic8$ = SubLObjectFactory.makeKeyword("REMOVAL-EXTENT-CARDINALITY-FORT-CHECK-POS");
        $ic9$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("extentCardinality")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("extentCardinality")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#35500", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("extentCardinality")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#35502", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#35502", "CYC")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET"), (SubLObject)SubLObjectFactory.makeSymbol("S#35502", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35496", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#35502", "CYC")))), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*MT*"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$extentCardinality <fort> <fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$extentCardinality #$MonthOfYearType 12)") });
        $ic10$ = SubLObjectFactory.makeKeyword("REMOVAL-EXTENT-CARDINALITY-FORT-CHECK-NEG");
        $ic11$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("extentCardinality")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("extentCardinality")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#35500", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("extentCardinality")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#35502", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#35502", "CYC")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET"), (SubLObject)SubLObjectFactory.makeSymbol("S#35502", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#33876", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35496", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#35502", "CYC"))))), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*MT*"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$extentCardinality <fort> <fully-bound>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$extentCardinality #$MonthOfYearType 14))") });
        $ic12$ = SubLObjectFactory.makeKeyword("REMOVAL-EXTENT-CARDINALITY-THESET");
        $ic13$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("extentCardinality")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("extentCardinality")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TheSet")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#1887", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("extentCardinality")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SET"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#10716", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35493", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("extentCardinality")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*MT*"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$extentCardinality (#$TheSet . <fully-bound>) <whatever>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$extentCardinality (#$TheSet #$Andorra #$France #$Portugal) ?COUNT)") });
        $ic14$ = SubLObjectFactory.makeKeyword("REMOVAL-EXTENT-CARDINALITY-THESETOF");
        $ic15$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("extentCardinality")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("extentCardinality")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TheSetOf")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#1889", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("extentCardinality")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SET"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#10716", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35493", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("extentCardinality")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*MT*"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$extentCardinality (#$TheSetOf <variable> <closed except for variable>) <whatever>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$extentCardinality \n      (#$TheSetOf ?COUNTRY\n        (#$and\n          (#$isa ?COUNTRY #$Country)\n          (#$politiesBorderEachOther #$Spain ?COUNTRY)))\n      ?COUNT)") });
        $ic16$ = SubLObjectFactory.makeKeyword("REMOVAL-EXTENT-CARDINALITY-THECOLLECTIONOF");
        $ic17$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("extentCardinality")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("extentCardinality")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAT"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TheCollectionOf")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("EXCLUSIVE"), SubLObjectFactory.makeSymbol("TRUE"), SubLObjectFactory.makeKeyword("SUPPLANTS"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-EXTENT-CARDINALITY-FORT-GENERATE"), (SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-EXTENT-CARDINALITY-FORT-CHECK-POS")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#1889", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("extentCardinality")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#12458", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12458", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#10716", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35494", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("extentCardinality")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12458", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*MT*"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$extentCardinality (#$TheCollectionOf <variable> <closed except for variable>) <whatever>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$extentCardinality \n      (#$TheCollectionOf ?COUNTRY\n        (#$and\n          (#$isa ?COUNTRY #$Country)\n          (#$politiesBorderEachOther #$Spain ?COUNTRY)))\n      ?COUNT)") });
        $ic18$ = SubLObjectFactory.makeKeyword("REMOVAL-EXTENT-CARDINALITY-CYCLASSERTION");
        $ic19$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("extentCardinality")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("extentCardinality")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CycLAssertion")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#1887", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXCLUSIVE"), SubLObjectFactory.makeSymbol("TRUE"), SubLObjectFactory.makeKeyword("SUPPLANTS"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-EXTENT-CARDINALITY-FORT-GENERATE"), (SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-EXTENT-CARDINALITY-FORT-CHECK-POS")), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#10716", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-COUNT"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("extentCardinality")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CycLAssertion")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*MT*"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$extentCardinality #$CycLAssertion <whatever>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$extentCardinality #$CycLAssertion ?COUNT)") });
        $ic20$ = SubLObjectFactory.makeKeyword("REMOVAL-EXTENT-CARDINALITY-CYCLREIFIEDDENOTATIONALTERM");
        $ic21$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("extentCardinality")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("extentCardinality")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CycLReifiedDenotationalTerm")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#1887", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXCLUSIVE"), SubLObjectFactory.makeSymbol("TRUE"), SubLObjectFactory.makeKeyword("SUPPLANTS"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-EXTENT-CARDINALITY-FORT-GENERATE"), (SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-EXTENT-CARDINALITY-FORT-CHECK-POS")), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#10716", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-COUNT"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("extentCardinality")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CycLReifiedDenotationalTerm")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*MT*"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$extentCardinality #$CycLReifiedDenotationalTerm <whatever>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$extentCardinality #$CycLReifiedDenotationalTerm ?COUNT)") });
        $ic22$ = SubLObjectFactory.makeSymbol("S#35501", "CYC");
        $ic23$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $ic24$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("lengthOfList"));
        $ic25$ = SubLObjectFactory.makeSymbol("INTEGERP");
        $ic26$ = SubLObjectFactory.makeKeyword("REMOVAL-LENGTH-OF-THELIST-CHECK-POS");
        $ic27$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("lengthOfList")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("lengthOfList")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#15600", "CYC"))), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#1887", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXCLUSIVE"), SubLObjectFactory.makeSymbol("TRUE"), SubLObjectFactory.makeKeyword("CHECK"), module0493.T, SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("lengthOfList")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("LIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("LENGTH"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("LIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("LENGTH")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("LENGTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35498", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("LIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("LENGTH")))), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("S#35501", "CYC"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$lengthOfList (#$TheList . <fully-bound>) <fully-bound>) or\n    (#$lengthOfList #$TheEmptyList <fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$lengthOfList (#$TheList #$Andorra #$France #$Portugal) 3)\n    (#$lengthOfList (#$TheList) 0)\n    (#$lengthOfList #$TheEmptyList 0)") });
        $ic28$ = SubLObjectFactory.makeKeyword("REMOVAL-LENGTH-OF-THELIST-CHECK-NEG");
        $ic29$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("lengthOfList")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("lengthOfList")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#15600", "CYC"))), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#1887", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXCLUSIVE"), SubLObjectFactory.makeSymbol("TRUE"), SubLObjectFactory.makeKeyword("CHECK"), module0493.T, SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("lengthOfList")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("LIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("LENGTH"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("LIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("LENGTH")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("LENGTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#33876", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35498", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("LIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("LENGTH"))))), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("S#35501", "CYC"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$lengthOfList (#$TheList . <fully-bound>) <fully-bound>)) or\n    (#$not (#$lengthOfList #$TheEmptyList <fully-bound>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$lengthOfList (#$TheList #$Andorra #$France #$Portugal) 1))\n    (#$not (#$lengthOfList (#$TheList) 1))\n    (#$not (#$lengthOfList #$TheEmptyList 1))") });
        $ic30$ = SubLObjectFactory.makeKeyword("REMOVAL-LENGTH-OF-THELIST-GENERATE");
        $ic31$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("lengthOfList")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("lengthOfList")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#15600", "CYC"))), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), module0493.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXCLUSIVE"), SubLObjectFactory.makeSymbol("TRUE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("lengthOfList")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("LIST")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("LIST"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#33875", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#15665", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("lengthOfList")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("LIST")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("S#35501", "CYC"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$lengthOfList (#$TheList . <fully-bound>) <not-fully-bound>) or\n    (#$lengthOfList #$TheEmptyList <not-fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$lengthOfList (#$TheList #$Andorra #$France #$Portugal) ?COUNT)\n    (#$lengthOfList (#$TheList) ?COUNT)\n    (#$lengthOfList #$TheEmptyList ?COUNT)") });
        $ic32$ = SubLObjectFactory.makeKeyword("REMOVAL-LENGTH-OF-THELIST-PRUNE");
        $ic33$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("lengthOfList")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("lengthOfList")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#2028", "CYC"))), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("EXCLUSIVE"), SubLObjectFactory.makeSymbol("TRUE"), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("S#35499", "CYC"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), module0493.ZERO_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("pruning module that handles\n    (#$lengthOfList (#$TheList . <not fully-bound>) <fully-bound>) \n    where the length in ARG2 does not match the list in ARG1"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$lengthOfList (#$TheList #$isa ?X) 1)") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0493.class
	Total time: 180 ms
	
	Decompiled with Procyon 0.5.32.
*/