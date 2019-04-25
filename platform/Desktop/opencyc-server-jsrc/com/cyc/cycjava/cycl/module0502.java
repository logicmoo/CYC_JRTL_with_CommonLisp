package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0502 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0502";
    public static final String myFingerPrint = "25a320dc88bfc478418ec060a75ec7b0fdd0acf6e70184f8c63dcc8915e242ff";
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
    
    public static SubLObject f32345(final SubLObject var1) {
        SubLObject var3;
        final SubLObject var2 = var3 = module0205.f13385(var1, (SubLObject)module0502.UNPROVIDED);
        SubLObject var4 = (SubLObject)module0502.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var3, var2, (SubLObject)module0502.$ic3$);
        var4 = var3.first();
        var3 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var3, var2, (SubLObject)module0502.$ic3$);
        final SubLObject var5 = var3.rest();
        var3 = var3.first();
        SubLObject var6 = (SubLObject)module0502.NIL;
        SubLObject var7 = (SubLObject)module0502.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var3, var2, (SubLObject)module0502.$ic3$);
        var6 = var3.first();
        var3 = (var7 = var3.rest());
        var3 = var5;
        if (module0502.NIL == var3) {
            return conses_high.member(var4, var7, Symbols.symbol_function((SubLObject)module0502.EQUAL), (SubLObject)module0502.UNPROVIDED);
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)module0502.$ic3$);
        return (SubLObject)module0502.NIL;
    }
    
    public static SubLObject f32346(final SubLObject var1, SubLObject var8) {
        if (var8 == module0502.UNPROVIDED) {
            var8 = (SubLObject)module0502.NIL;
        }
        return f32345(var1);
    }
    
    public static SubLObject f32347(final SubLObject var1, SubLObject var8) {
        if (var8 == module0502.UNPROVIDED) {
            var8 = (SubLObject)module0502.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0502.NIL == f32345(var1));
    }
    
    public static SubLObject f32348(final SubLObject var1, SubLObject var8) {
        if (var8 == module0502.UNPROVIDED) {
            var8 = (SubLObject)module0502.NIL;
        }
        SubLObject var10;
        final SubLObject var9 = var10 = module0205.f13385(var1, (SubLObject)module0502.UNPROVIDED);
        SubLObject var11 = (SubLObject)module0502.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)module0502.$ic3$);
        var11 = var10.first();
        var10 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)module0502.$ic3$);
        final SubLObject var12 = var10.rest();
        var10 = var10.first();
        SubLObject var13 = (SubLObject)module0502.NIL;
        SubLObject var14 = (SubLObject)module0502.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)module0502.$ic3$);
        var13 = var10.first();
        var10 = (var14 = var10.rest());
        var10 = var12;
        if (module0502.NIL == var10) {
            return Sequences.length(var14);
        }
        cdestructuring_bind.cdestructuring_bind_error(var9, (SubLObject)module0502.$ic3$);
        return (SubLObject)module0502.NIL;
    }
    
    public static SubLObject f32349(final SubLObject var12) {
        return module0052.f3709(module0205.f13207(var12, (SubLObject)module0502.UNPROVIDED));
    }
    
    public static SubLObject f32350() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0502", "f32345", "S#35754", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0502", "f32346", "S#35755", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0502", "f32347", "S#35756", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0502", "f32348", "S#35757", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0502", "f32349", "S#35758", 1, 0, false);
        return (SubLObject)module0502.NIL;
    }
    
    public static SubLObject f32351() {
        return (SubLObject)module0502.NIL;
    }
    
    public static SubLObject f32352() {
        module0340.f22938(module0502.$ic0$);
        module0358.f23771((SubLObject)module0502.$ic1$, module0502.$ic0$, (SubLObject)module0502.TWO_INTEGER);
        module0358.f23773((SubLObject)module0502.$ic2$, module0502.$ic0$);
        module0340.f22941((SubLObject)module0502.$ic4$, (SubLObject)module0502.$ic5$);
        module0340.f22941((SubLObject)module0502.$ic6$, (SubLObject)module0502.$ic7$);
        module0340.f22941((SubLObject)module0502.$ic8$, (SubLObject)module0502.$ic9$);
        return (SubLObject)module0502.NIL;
    }
    
    public void declareFunctions() {
        f32350();
    }
    
    public void initializeVariables() {
        f32351();
    }
    
    public void runTopLevelForms() {
        f32352();
    }
    
    static {
        me = (SubLFile)new module0502();
        $ic0$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("memberOfList"));
        $ic1$ = SubLObjectFactory.makeKeyword("POS");
        $ic2$ = SubLObjectFactory.makeKeyword("NEG");
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#7306", "CYC"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#35759", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5477", "CYC")));
        $ic4$ = SubLObjectFactory.makeKeyword("REMOVAL-MEMBER-OF-LIST-CHECK");
        $ic5$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("memberOfList")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("memberOfList")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#1887", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35755", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$memberOfList <fully-bound> (#$TheList . <fully-bound>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$memberOfList #$Dog (#$TheList #$Dog #$Cat))") });
        $ic6$ = SubLObjectFactory.makeKeyword("REMOVAL-NOT-MEMBER-OF-LIST-CHECK");
        $ic7$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("memberOfList")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("memberOfList")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#1887", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35756", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$memberOfList <fully-bound> (#$TheList . <fully-bound>)))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$memberOfList #$Bird (#$TheList #$Dog #$Cat)))") });
        $ic8$ = SubLObjectFactory.makeKeyword("REMOVAL-MEMBER-OF-LIST-UNIFY");
        $ic9$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("memberOfList")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("memberOfList")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35757", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("memberOfList")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#35760", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#35760", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35758", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("memberOfList")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#35760", "CYC"))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$memberOfList <not fully-bound> (#$TheList . <fully-bound>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$memberOfList ?WHAT (#$TheList #$Dog #$Cat))") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0502.class
	Total time: 68 ms
	
	Decompiled with Procyon 0.5.32.
*/