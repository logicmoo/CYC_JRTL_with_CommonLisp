package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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
        return Equality.equal(var2, module0166.f10743(var1));
    }
    
    public static SubLObject f32016(final SubLObject var3, SubLObject var4) {
        if (var4 == module0490.UNPROVIDED) {
            var4 = (SubLObject)module0490.NIL;
        }
        return (SubLObject)((module0490.NIL != f32017(var3)) ? module0490.$g3725$.getGlobalValue() : module0490.ZERO_INTEGER);
    }
    
    public static SubLObject f32018(final SubLObject var3, SubLObject var4) {
        if (var4 == module0490.UNPROVIDED) {
            var4 = (SubLObject)module0490.NIL;
        }
        return module0435.f30613(f32016(var3, (SubLObject)module0490.UNPROVIDED));
    }
    
    public static SubLObject f32017(final SubLObject var3) {
        final SubLObject var4 = module0205.f13387(var3, (SubLObject)module0490.UNPROVIDED);
        final SubLObject var5 = module0205.f13388(var3, (SubLObject)module0490.UNPROVIDED);
        return f32015(var4, var5);
    }
    
    public static SubLObject f32019(final SubLObject var3, SubLObject var4) {
        if (var4 == module0490.UNPROVIDED) {
            var4 = (SubLObject)module0490.NIL;
        }
        final SubLObject var5 = module0205.f13388(var3, (SubLObject)module0490.UNPROVIDED);
        return (SubLObject)((module0490.NIL != module0166.f10737(var5)) ? module0490.ONE_INTEGER : module0490.ZERO_INTEGER);
    }
    
    public static SubLObject f32020(final SubLObject var1, final SubLObject var5) {
        return Equality.eql(var5, module0166.f10749(var1));
    }
    
    public static SubLObject f32021(final SubLObject var1, final SubLObject var5, SubLObject var6) {
        if (var6 == module0490.UNPROVIDED) {
            var6 = (SubLObject)module0490.NIL;
        }
        final SubLObject var7 = (SubLObject)ConsesLow.list(module0490.$ic13$, var1, var5);
        if (module0490.NIL == var6) {
            return module0191.f11990((SubLObject)module0490.$ic15$, var7, module0490.$g3727$.getGlobalValue(), (SubLObject)module0490.$ic16$);
        }
        return module0191.f11990((SubLObject)module0490.$ic15$, module0205.f13338(var7), module0490.$g3727$.getGlobalValue(), (SubLObject)module0490.$ic16$);
    }
    
    public static SubLObject f32022(final SubLObject var3, SubLObject var4) {
        if (var4 == module0490.UNPROVIDED) {
            var4 = (SubLObject)module0490.NIL;
        }
        return (SubLObject)((module0490.NIL != f32023(var3)) ? module0490.$g3728$.getGlobalValue() : module0490.ZERO_INTEGER);
    }
    
    public static SubLObject f32024(final SubLObject var3, SubLObject var4) {
        if (var4 == module0490.UNPROVIDED) {
            var4 = (SubLObject)module0490.NIL;
        }
        return module0435.f30613(f32022(var3, (SubLObject)module0490.UNPROVIDED));
    }
    
    public static SubLObject f32023(final SubLObject var3) {
        final SubLObject var4 = module0205.f13387(var3, (SubLObject)module0490.UNPROVIDED);
        final SubLObject var5 = module0205.f13388(var3, (SubLObject)module0490.UNPROVIDED);
        return f32020(var4, var5);
    }
    
    public static SubLObject f32025(final SubLObject var3, SubLObject var4) {
        if (var4 == module0490.UNPROVIDED) {
            var4 = (SubLObject)module0490.NIL;
        }
        final SubLObject var5 = module0205.f13388(var3, (SubLObject)module0490.UNPROVIDED);
        return (SubLObject)((module0490.NIL != module0166.f10752(var5)) ? module0490.ONE_INTEGER : module0490.ZERO_INTEGER);
    }
    
    public static SubLObject f32026(final SubLObject var1, final SubLObject var8) {
        return Equality.equal(var8, Guids.guid_to_string(module0166.f10757(var1)));
    }
    
    public static SubLObject f32027(final SubLObject var8) {
        if (module0490.NIL != Guids.guid_string_p(var8)) {
            final SubLObject var9 = Guids.string_to_guid(var8);
            final SubLObject var10 = module0166.f10751(var9);
            return var10;
        }
        return (SubLObject)module0490.NIL;
    }
    
    public static SubLObject f32028(final SubLObject var3, SubLObject var4) {
        if (var4 == module0490.UNPROVIDED) {
            var4 = (SubLObject)module0490.NIL;
        }
        return (SubLObject)((module0490.NIL != f32029(var3)) ? module0490.$g3731$.getGlobalValue() : module0490.ZERO_INTEGER);
    }
    
    public static SubLObject f32030(final SubLObject var3, SubLObject var4) {
        if (var4 == module0490.UNPROVIDED) {
            var4 = (SubLObject)module0490.NIL;
        }
        return module0435.f30613(f32028(var3, (SubLObject)module0490.UNPROVIDED));
    }
    
    public static SubLObject f32029(final SubLObject var3) {
        final SubLObject var4 = module0205.f13387(var3, (SubLObject)module0490.UNPROVIDED);
        final SubLObject var5 = module0205.f13388(var3, (SubLObject)module0490.UNPROVIDED);
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
        return (SubLObject)module0490.NIL;
    }
    
    public static SubLObject f32032() {
        module0490.$g3724$ = SubLFiles.deflexical("S#35378", (module0490.NIL != Symbols.boundp((SubLObject)module0490.$ic3$)) ? module0490.$g3724$.getGlobalValue() : module0490.$ic4$);
        module0490.$g3725$ = SubLFiles.deflexical("S#35379", module0018.$g659$.getGlobalValue());
        module0490.$g3726$ = SubLFiles.deflexical("S#35380", (SubLObject)module0490.ONE_INTEGER);
        module0490.$g3727$ = SubLFiles.deflexical("S#35381", (module0490.NIL != Symbols.boundp((SubLObject)module0490.$ic14$)) ? module0490.$g3727$.getGlobalValue() : module0490.$ic4$);
        module0490.$g3728$ = SubLFiles.deflexical("S#35382", module0018.$g659$.getGlobalValue());
        module0490.$g3729$ = SubLFiles.deflexical("S#35383", (SubLObject)module0490.ONE_INTEGER);
        module0490.$g3730$ = SubLFiles.deflexical("S#35384", (module0490.NIL != Symbols.boundp((SubLObject)module0490.$ic26$)) ? module0490.$g3730$.getGlobalValue() : module0490.$ic4$);
        module0490.$g3731$ = SubLFiles.deflexical("S#35385", module0018.$g659$.getGlobalValue());
        module0490.$g3732$ = SubLFiles.deflexical("S#35386", (SubLObject)module0490.ONE_INTEGER);
        module0490.$g3733$ = SubLFiles.deflexical("S#35387", module0018.$g659$.getGlobalValue());
        return (SubLObject)module0490.NIL;
    }
    
    public static SubLObject f32033() {
        module0340.f22938(module0490.$ic0$);
        module0358.f23774((SubLObject)module0490.$ic1$, module0490.$ic0$);
        module0358.f23773((SubLObject)module0490.$ic2$, module0490.$ic0$);
        module0003.f57((SubLObject)module0490.$ic3$);
        module0132.f8593((SubLObject)module0490.$ic3$, module0490.$ic0$);
        module0340.f22941((SubLObject)module0490.$ic5$, (SubLObject)module0490.$ic6$);
        module0340.f22941((SubLObject)module0490.$ic7$, (SubLObject)module0490.$ic8$);
        module0340.f22941((SubLObject)module0490.$ic9$, (SubLObject)module0490.$ic10$);
        module0340.f22941((SubLObject)module0490.$ic11$, (SubLObject)module0490.$ic12$);
        module0340.f22938(module0490.$ic13$);
        module0358.f23774((SubLObject)module0490.$ic1$, module0490.$ic13$);
        module0358.f23773((SubLObject)module0490.$ic2$, module0490.$ic13$);
        module0003.f57((SubLObject)module0490.$ic14$);
        module0132.f8593((SubLObject)module0490.$ic14$, module0490.$ic13$);
        module0340.f22941((SubLObject)module0490.$ic17$, (SubLObject)module0490.$ic18$);
        module0340.f22941((SubLObject)module0490.$ic19$, (SubLObject)module0490.$ic20$);
        module0340.f22941((SubLObject)module0490.$ic21$, (SubLObject)module0490.$ic22$);
        module0340.f22941((SubLObject)module0490.$ic23$, (SubLObject)module0490.$ic24$);
        module0340.f22938(module0490.$ic25$);
        module0358.f23774((SubLObject)module0490.$ic1$, module0490.$ic25$);
        module0358.f23773((SubLObject)module0490.$ic2$, module0490.$ic25$);
        module0003.f57((SubLObject)module0490.$ic26$);
        module0132.f8593((SubLObject)module0490.$ic26$, module0490.$ic25$);
        module0340.f22941((SubLObject)module0490.$ic27$, (SubLObject)module0490.$ic28$);
        module0340.f22941((SubLObject)module0490.$ic29$, (SubLObject)module0490.$ic30$);
        module0340.f22941((SubLObject)module0490.$ic31$, (SubLObject)module0490.$ic32$);
        module0340.f22941((SubLObject)module0490.$ic33$, (SubLObject)module0490.$ic34$);
        return (SubLObject)module0490.NIL;
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
        module0490.$g3724$ = null;
        module0490.$g3725$ = null;
        module0490.$g3726$ = null;
        module0490.$g3727$ = null;
        module0490.$g3728$ = null;
        module0490.$g3729$ = null;
        module0490.$g3730$ = null;
        module0490.$g3731$ = null;
        module0490.$g3732$ = null;
        module0490.$g3733$ = null;
        $ic0$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("constantName"));
        $ic1$ = SubLObjectFactory.makeKeyword("POS");
        $ic2$ = SubLObjectFactory.makeKeyword("NEG");
        $ic3$ = SubLObjectFactory.makeSymbol("S#35378", "CYC");
        $ic4$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $ic5$ = SubLObjectFactory.makeKeyword("REMOVAL-CONSTANT-NAME-CHECK-POS");
        $ic6$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("constantName")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("constantName")), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANT"), (SubLObject)SubLObjectFactory.makeKeyword("STRING")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35363", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("CHECK"), module0490.T, SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35365", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("S#35378", "CYC"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$constantName <constant-p> <stringp>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$constantName #$Thing \"Thing\")") });
        $ic7$ = SubLObjectFactory.makeKeyword("REMOVAL-CONSTANT-NAME-CHECK-NEG");
        $ic8$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("constantName")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("constantName")), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANT"), (SubLObject)SubLObjectFactory.makeKeyword("STRING")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35364", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("CHECK"), module0490.T, SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#33876", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35365", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("S#35378", "CYC"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$constantName <constant-p> <stringp>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$constantName #$Thing \"Collection\"))") });
        $ic9$ = SubLObjectFactory.makeKeyword("REMOVAL-CONSTANT-NAME-UNIFY");
        $ic10$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("constantName")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("constantName")), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANT"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#35380", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("constantName")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#10505", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#10505", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#33875", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-NAME"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("constantName")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#10505", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("S#35378", "CYC"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$constantName <constant-p> <not fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$constantName #$Thing ?NAME)") });
        $ic11$ = SubLObjectFactory.makeKeyword("REMOVAL-CONSTANT-NAME-LOOKUP");
        $ic12$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("constantName")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("constantName")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("STRING")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35366", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("constantName")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#10716", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-CONSTANT"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("constantName")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"))), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("S#35378", "CYC"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$constantName <not fully-bound> <stringp>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$constantName ?CONSTANT \"Thing\")") });
        $ic13$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("constantID"));
        $ic14$ = SubLObjectFactory.makeSymbol("S#35381", "CYC");
        $ic15$ = SubLObjectFactory.makeKeyword("OPAQUE");
        $ic16$ = SubLObjectFactory.makeKeyword("TRUE-MON");
        $ic17$ = SubLObjectFactory.makeKeyword("REMOVAL-CONSTANT-ID-CHECK-POS");
        $ic18$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("constantID")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("constantID")), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANT"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35369", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("CHECK"), module0490.T, SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35371", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("S#35381", "CYC"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$constantID <constant-p> <integerp>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$constantID #$isa 260)") });
        $ic19$ = SubLObjectFactory.makeKeyword("REMOVAL-CONSTANT-ID-CHECK-NEG");
        $ic20$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("constantID")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("constantID")), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANT"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35370", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("CHECK"), module0490.T, SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#33876", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35371", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("S#35381", "CYC"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$constantID <constant-p> <integerp>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$constantID #$Thing 260))") });
        $ic21$ = SubLObjectFactory.makeKeyword("REMOVAL-CONSTANT-ID-UNIFY");
        $ic22$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("constantID")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("constantID")), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANT"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#35383", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("constantID")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#10505", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#10505", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#33875", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-INTERNAL-ID"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("constantID")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#10505", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("S#35381", "CYC"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$constantID <constant-p> <not fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$constantID #$isa ?ID)") });
        $ic23$ = SubLObjectFactory.makeKeyword("REMOVAL-CONSTANT-ID-LOOKUP");
        $ic24$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("constantID")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("constantID")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35372", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("constantID")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#1519", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#1519", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#10716", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-CONSTANT-BY-INTERNAL-ID"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("constantID")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#1519", "CYC"))), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("S#35381", "CYC"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$constantID <not fully-bound> <integerp>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$constantID ?CONSTANT 260)") });
        $ic25$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("constantGUID"));
        $ic26$ = SubLObjectFactory.makeSymbol("S#35384", "CYC");
        $ic27$ = SubLObjectFactory.makeKeyword("REMOVAL-CONSTANT-GUID-CHECK-POS");
        $ic28$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("constantGUID")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("constantGUID")), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANT"), (SubLObject)SubLObjectFactory.makeKeyword("STRING")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35375", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("CHECK"), module0490.T, SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35377", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("S#35384", "CYC"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$constantGUID <constant-p> <stringp>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$constantGUID #$isa \"bd588104-9c29-11b1-9dad-c379636f7270\")") });
        $ic29$ = SubLObjectFactory.makeKeyword("REMOVAL-CONSTANT-GUID-CHECK-NEG");
        $ic30$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("constantGUID")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("constantGUID")), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANT"), (SubLObject)SubLObjectFactory.makeKeyword("STRING")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35376", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("CHECK"), module0490.T, SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#33876", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35377", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("S#35384", "CYC"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$constantGUID <constant-p> <stringp>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$constantGUID #$Thing \"bd588104-9c29-11b1-9dad-c379636f7270\"))") });
        $ic31$ = SubLObjectFactory.makeKeyword("REMOVAL-CONSTANT-GUID-UNIFY");
        $ic32$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("constantGUID")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("constantGUID")), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANT"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#35386", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("constantGUID")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#10505", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#10505", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#33875", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("GUID-TO-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-EXTERNAL-ID"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("constantGUID")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#10505", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("S#35384", "CYC"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$constantGUID <constant-p> <not fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$constantGUID #$isa ?GUID-STRING)") });
        $ic33$ = SubLObjectFactory.makeKeyword("REMOVAL-CONSTANT-GUID-LOOKUP");
        $ic34$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("constantGUID")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("constantGUID")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("STRING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#35387", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("constantGUID")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#35388", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#35388", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#10716", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35374", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("constantGUID")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#35388", "CYC"))), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("S#35384", "CYC"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$constantGUID <not fully-bound> <stringp>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$constantGUID ?CONSTANT \"bd588104-9c29-11b1-9dad-c379636f7270\")") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0490.class
	Total time: 146 ms
	
	Decompiled with Procyon 0.5.32.
*/