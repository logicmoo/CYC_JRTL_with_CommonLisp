package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0490 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0490";
    public static final String myFingerPrint = "420b06a04ad5734228f31374080ac6d3876430d3fba66918e676f9d7801d605f";
    public static SubLSymbol $g3724$;
    private static SubLSymbol $g3725$;
    private static SubLSymbol $g3726$;
    public static SubLSymbol $g3727$;
    private static SubLSymbol $g3728$;
    private static SubLSymbol $g3729$;
    public static SubLSymbol $g3730$;
    private static SubLSymbol $g3731$;
    private static SubLSymbol $g3732$;
    private static SubLSymbol $g3733$;
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLObject $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
    private static final SubLObject $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLList $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLList $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLList $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLList $ic24$;
    private static final SubLObject $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLList $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLList $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLList $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLList $ic34$;
    
    public static SubLObject f32015(final SubLObject var1, final SubLObject var2) {
        return Equality.equal(var2, constants_high_oc.f10743(var1));
    }
    
    public static SubLObject f32016(final SubLObject var3, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        return (SubLObject)((NIL != f32017(var3)) ? $g3725$.getGlobalValue() : ZERO_INTEGER);
    }
    
    public static SubLObject f32018(final SubLObject var3, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        return module0435.f30613(f32016(var3, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f32017(final SubLObject var3) {
        final SubLObject var4 = module0205.f13387(var3, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0205.f13388(var3, (SubLObject)UNPROVIDED);
        return f32015(var4, var5);
    }
    
    public static SubLObject f32019(final SubLObject var3, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        final SubLObject var5 = module0205.f13388(var3, (SubLObject)UNPROVIDED);
        return (SubLObject)((NIL != constants_high_oc.f10737(var5)) ? ONE_INTEGER : ZERO_INTEGER);
    }
    
    public static SubLObject f32020(final SubLObject var1, final SubLObject var5) {
        return Equality.eql(var5, constants_high_oc.f10749(var1));
    }
    
    public static SubLObject f32021(final SubLObject var1, final SubLObject var5, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        final SubLObject var7 = (SubLObject)ConsesLow.list($ic13$, var1, var5);
        if (NIL == var6) {
            return module0191.f11990((SubLObject)$ic15$, var7, $g3727$.getGlobalValue(), (SubLObject)$ic16$);
        }
        return module0191.f11990((SubLObject)$ic15$, module0205.f13338(var7), $g3727$.getGlobalValue(), (SubLObject)$ic16$);
    }
    
    public static SubLObject f32022(final SubLObject var3, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        return (SubLObject)((NIL != f32023(var3)) ? $g3728$.getGlobalValue() : ZERO_INTEGER);
    }
    
    public static SubLObject f32024(final SubLObject var3, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        return module0435.f30613(f32022(var3, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f32023(final SubLObject var3) {
        final SubLObject var4 = module0205.f13387(var3, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0205.f13388(var3, (SubLObject)UNPROVIDED);
        return f32020(var4, var5);
    }
    
    public static SubLObject f32025(final SubLObject var3, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        final SubLObject var5 = module0205.f13388(var3, (SubLObject)UNPROVIDED);
        return (SubLObject)((NIL != constants_high_oc.f10752(var5)) ? ONE_INTEGER : ZERO_INTEGER);
    }
    
    public static SubLObject f32026(final SubLObject var1, final SubLObject var8) {
        return Equality.equal(var8, Guids.guid_to_string(constants_high_oc.f10757(var1)));
    }
    
    public static SubLObject f32027(final SubLObject var8) {
        if (NIL != Guids.guid_string_p(var8)) {
            final SubLObject var9 = Guids.string_to_guid(var8);
            final SubLObject var10 = constants_high_oc.f10751(var9);
            return var10;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32028(final SubLObject var3, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        return (SubLObject)((NIL != f32029(var3)) ? $g3731$.getGlobalValue() : ZERO_INTEGER);
    }
    
    public static SubLObject f32030(final SubLObject var3, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        return module0435.f30613(f32028(var3, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f32029(final SubLObject var3) {
        final SubLObject var4 = module0205.f13387(var3, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0205.f13388(var3, (SubLObject)UNPROVIDED);
        return f32026(var4, var5);
    }
    
    public static SubLObject f32031() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0490", "f32015", "S#35362", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0490", "f32016", "S#35363", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0490", "f32018", "S#35364", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0490", "f32017", "S#35365", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0490", "f32019", "S#35366", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0490", "f32020", "S#35367", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0490", "f32021", "S#35368", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0490", "f32022", "S#35369", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0490", "f32024", "S#35370", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0490", "f32023", "S#35371", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0490", "f32025", "S#35372", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0490", "f32026", "S#35373", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0490", "f32027", "S#35374", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0490", "f32028", "S#35375", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0490", "f32030", "S#35376", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0490", "f32029", "S#35377", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32032() {
        $g3724$ = SubLFiles.deflexical("S#35378", (NIL != Symbols.boundp((SubLObject)$ic3$)) ? $g3724$.getGlobalValue() : $ic4$);
        $g3725$ = SubLFiles.deflexical("S#35379", module0018.$g659$.getGlobalValue());
        $g3726$ = SubLFiles.deflexical("S#35380", (SubLObject)ONE_INTEGER);
        $g3727$ = SubLFiles.deflexical("S#35381", (NIL != Symbols.boundp((SubLObject)$ic14$)) ? $g3727$.getGlobalValue() : $ic4$);
        $g3728$ = SubLFiles.deflexical("S#35382", module0018.$g659$.getGlobalValue());
        $g3729$ = SubLFiles.deflexical("S#35383", (SubLObject)ONE_INTEGER);
        $g3730$ = SubLFiles.deflexical("S#35384", (NIL != Symbols.boundp((SubLObject)$ic26$)) ? $g3730$.getGlobalValue() : $ic4$);
        $g3731$ = SubLFiles.deflexical("S#35385", module0018.$g659$.getGlobalValue());
        $g3732$ = SubLFiles.deflexical("S#35386", (SubLObject)ONE_INTEGER);
        $g3733$ = SubLFiles.deflexical("S#35387", module0018.$g659$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32033() {
        module0340.f22938($ic0$);
        module0358.f23774((SubLObject)$ic1$, $ic0$);
        module0358.f23773((SubLObject)$ic2$, $ic0$);
        module0003.f57((SubLObject)$ic3$);
        module0132.f8593((SubLObject)$ic3$, $ic0$);
        module0340.f22941((SubLObject)$ic5$, (SubLObject)$ic6$);
        module0340.f22941((SubLObject)$ic7$, (SubLObject)$ic8$);
        module0340.f22941((SubLObject)$ic9$, (SubLObject)$ic10$);
        module0340.f22941((SubLObject)$ic11$, (SubLObject)$ic12$);
        module0340.f22938($ic13$);
        module0358.f23774((SubLObject)$ic1$, $ic13$);
        module0358.f23773((SubLObject)$ic2$, $ic13$);
        module0003.f57((SubLObject)$ic14$);
        module0132.f8593((SubLObject)$ic14$, $ic13$);
        module0340.f22941((SubLObject)$ic17$, (SubLObject)$ic18$);
        module0340.f22941((SubLObject)$ic19$, (SubLObject)$ic20$);
        module0340.f22941((SubLObject)$ic21$, (SubLObject)$ic22$);
        module0340.f22941((SubLObject)$ic23$, (SubLObject)$ic24$);
        module0340.f22938($ic25$);
        module0358.f23774((SubLObject)$ic1$, $ic25$);
        module0358.f23773((SubLObject)$ic2$, $ic25$);
        module0003.f57((SubLObject)$ic26$);
        module0132.f8593((SubLObject)$ic26$, $ic25$);
        module0340.f22941((SubLObject)$ic27$, (SubLObject)$ic28$);
        module0340.f22941((SubLObject)$ic29$, (SubLObject)$ic30$);
        module0340.f22941((SubLObject)$ic31$, (SubLObject)$ic32$);
        module0340.f22941((SubLObject)$ic33$, (SubLObject)$ic34$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f32031();
    }
    
    public void initializeVariables() {
        f32032();
    }
    
    public void runTopLevelForms() {
        f32033();
    }
    
    static {
        me = (SubLFile)new module0490();
        $g3724$ = null;
        $g3725$ = null;
        $g3726$ = null;
        $g3727$ = null;
        $g3728$ = null;
        $g3729$ = null;
        $g3730$ = null;
        $g3731$ = null;
        $g3732$ = null;
        $g3733$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("constantName"));
        $ic1$ = makeKeyword("POS");
        $ic2$ = makeKeyword("NEG");
        $ic3$ = makeSymbol("S#35378", "CYC");
        $ic4$ = constant_handles_oc.f8479((SubLObject)makeString("BaseKB"));
        $ic5$ = makeKeyword("REMOVAL-CONSTANT-NAME-CHECK-POS");
        $ic6$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("constantName")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("constantName")), (SubLObject)makeKeyword("CONSTANT"), (SubLObject)makeKeyword("STRING")), makeKeyword("COST"), makeSymbol("S#35363", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35365", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("S#35378", "CYC"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$constantName <constant-p> <stringp>)"), makeKeyword("EXAMPLE"), makeString("(#$constantName #$Thing \"Thing\")") });
        $ic7$ = makeKeyword("REMOVAL-CONSTANT-NAME-CHECK-NEG");
        $ic8$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("constantName")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("constantName")), (SubLObject)makeKeyword("CONSTANT"), (SubLObject)makeKeyword("STRING")), makeKeyword("COST"), makeSymbol("S#35364", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#33876", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35365", "CYC"), (SubLObject)makeKeyword("INPUT"))), makeKeyword("SUPPORT-MT"), makeSymbol("S#35378", "CYC"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$constantName <constant-p> <stringp>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$constantName #$Thing \"Collection\"))") });
        $ic9$ = makeKeyword("REMOVAL-CONSTANT-NAME-UNIFY");
        $ic10$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("constantName")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("constantName")), (SubLObject)makeKeyword("CONSTANT"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35380", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("constantName")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("CONSTANT", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("CONSTANT", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#33875", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("CONSTANT-NAME"), (SubLObject)makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("constantName")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("CONSTANT", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("S#35378", "CYC"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$constantName <constant-p> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$constantName #$Thing ?NAME)") });
        $ic11$ = makeKeyword("REMOVAL-CONSTANT-NAME-LOOKUP");
        $ic12$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("constantName")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("constantName")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("STRING")), makeKeyword("COST"), makeSymbol("S#35366", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("constantName")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#29", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#29", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#10716", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("FIND-CONSTANT"), (SubLObject)makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("constantName")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#29", "CYC"))), makeKeyword("SUPPORT-MT"), makeSymbol("S#35378", "CYC"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$constantName <not fully-bound> <stringp>)"), makeKeyword("EXAMPLE"), makeString("(#$constantName ?CONSTANT \"Thing\")") });
        $ic13$ = constant_handles_oc.f8479((SubLObject)makeString("constantID"));
        $ic14$ = makeSymbol("S#35381", "CYC");
        $ic15$ = makeKeyword("OPAQUE");
        $ic16$ = makeKeyword("TRUE-MON");
        $ic17$ = makeKeyword("REMOVAL-CONSTANT-ID-CHECK-POS");
        $ic18$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("constantID")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("constantID")), (SubLObject)makeKeyword("CONSTANT"), (SubLObject)makeKeyword("INTEGER")), makeKeyword("COST"), makeSymbol("S#35369", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35371", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("S#35381", "CYC"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$constantID <constant-p> <integerp>)"), makeKeyword("EXAMPLE"), makeString("(#$constantID #$isa 260)") });
        $ic19$ = makeKeyword("REMOVAL-CONSTANT-ID-CHECK-NEG");
        $ic20$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("constantID")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("constantID")), (SubLObject)makeKeyword("CONSTANT"), (SubLObject)makeKeyword("INTEGER")), makeKeyword("COST"), makeSymbol("S#35370", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#33876", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35371", "CYC"), (SubLObject)makeKeyword("INPUT"))), makeKeyword("SUPPORT-MT"), makeSymbol("S#35381", "CYC"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$constantID <constant-p> <integerp>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$constantID #$Thing 260))") });
        $ic21$ = makeKeyword("REMOVAL-CONSTANT-ID-UNIFY");
        $ic22$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("constantID")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("constantID")), (SubLObject)makeKeyword("CONSTANT"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35383", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("constantID")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("CONSTANT", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("CONSTANT", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#33875", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("CONSTANT-INTERNAL-ID"), (SubLObject)makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("constantID")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("CONSTANT", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("S#35381", "CYC"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$constantID <constant-p> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$constantID #$isa ?ID)") });
        $ic23$ = makeKeyword("REMOVAL-CONSTANT-ID-LOOKUP");
        $ic24$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("constantID")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("constantID")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("INTEGER")), makeKeyword("COST"), makeSymbol("S#35372", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("constantID")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#1519", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#1519", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#10716", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("FIND-CONSTANT-BY-INTERNAL-ID"), (SubLObject)makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("constantID")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#1519", "CYC"))), makeKeyword("SUPPORT-MT"), makeSymbol("S#35381", "CYC"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$constantID <not fully-bound> <integerp>)"), makeKeyword("EXAMPLE"), makeString("(#$constantID ?CONSTANT 260)") });
        $ic25$ = constant_handles_oc.f8479((SubLObject)makeString("constantGUID"));
        $ic26$ = makeSymbol("S#35384", "CYC");
        $ic27$ = makeKeyword("REMOVAL-CONSTANT-GUID-CHECK-POS");
        $ic28$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("constantGUID")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("constantGUID")), (SubLObject)makeKeyword("CONSTANT"), (SubLObject)makeKeyword("STRING")), makeKeyword("COST"), makeSymbol("S#35375", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35377", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("S#35384", "CYC"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$constantGUID <constant-p> <stringp>)"), makeKeyword("EXAMPLE"), makeString("(#$constantGUID #$isa \"bd588104-9c29-11b1-9dad-c379636f7270\")") });
        $ic29$ = makeKeyword("REMOVAL-CONSTANT-GUID-CHECK-NEG");
        $ic30$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("constantGUID")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("constantGUID")), (SubLObject)makeKeyword("CONSTANT"), (SubLObject)makeKeyword("STRING")), makeKeyword("COST"), makeSymbol("S#35376", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#33876", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35377", "CYC"), (SubLObject)makeKeyword("INPUT"))), makeKeyword("SUPPORT-MT"), makeSymbol("S#35384", "CYC"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$constantGUID <constant-p> <stringp>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$constantGUID #$Thing \"bd588104-9c29-11b1-9dad-c379636f7270\"))") });
        $ic31$ = makeKeyword("REMOVAL-CONSTANT-GUID-UNIFY");
        $ic32$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("constantGUID")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("constantGUID")), (SubLObject)makeKeyword("CONSTANT"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35386", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("constantGUID")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("CONSTANT", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("CONSTANT", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#33875", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("GUID-TO-STRING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("CONSTANT-EXTERNAL-ID"), (SubLObject)makeKeyword("INPUT")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("constantGUID")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("CONSTANT", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("S#35384", "CYC"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$constantGUID <constant-p> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$constantGUID #$isa ?GUID-STRING)") });
        $ic33$ = makeKeyword("REMOVAL-CONSTANT-GUID-LOOKUP");
        $ic34$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("constantGUID")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("constantGUID")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("STRING")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35387", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("constantGUID")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35388", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35388", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#10716", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35374", "CYC"), (SubLObject)makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("constantGUID")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35388", "CYC"))), makeKeyword("SUPPORT-MT"), makeSymbol("S#35384", "CYC"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$constantGUID <not fully-bound> <stringp>)"), makeKeyword("EXAMPLE"), makeString("(#$constantGUID ?CONSTANT \"bd588104-9c29-11b1-9dad-c379636f7270\")") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 146 ms
	
	Decompiled with Procyon 0.5.32.
*/