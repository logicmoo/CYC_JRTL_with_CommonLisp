package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0459 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0459";
    public static final String myFingerPrint = "5c08e87712395e5a9efefbe59281d0d87611977e104c5e63df47a1f0472e48e2";
    private static SubLSymbol $g3630$;
    private static SubLSymbol $g3631$;
    private static SubLSymbol $g3632$;
    private static SubLSymbol $g3633$;
    private static SubLSymbol $g3634$;
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLList $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
    private static final SubLInteger $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    private static final SubLList $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLList $ic19$;
    private static final SubLObject $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLList $ic22$;
    private static final SubLObject $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLList $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLList $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    
    public static SubLObject f31322(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLObject var3 = module0202.f12834(var1, (SubLObject)UNPROVIDED);
        final SubLObject var4 = module0202.f12835(var1, (SubLObject)UNPROVIDED);
        if (NIL != module0257.f16689(var3, var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            final SubLObject var5 = module0351.f23578($ic0$, (SubLObject)ConsesLow.list(var3, var4));
            module0347.f23330(module0191.f11990((SubLObject)$ic5$, var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31323(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLObject var3 = module0202.f12834(var1, (SubLObject)UNPROVIDED);
        final SubLObject var4 = module0202.f12835(var1, (SubLObject)UNPROVIDED);
        return (SubLObject)makeBoolean(NIL != module0349.f23445(var3) && NIL != module0349.f23445(var4) && NIL != module0258.f16779(var3, var4, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31324(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLObject var3 = module0202.f12834(var1, (SubLObject)UNPROVIDED);
        final SubLObject var4 = module0202.f12835(var1, (SubLObject)UNPROVIDED);
        if (NIL != module0258.f16777(var3, var4, (SubLObject)UNPROVIDED)) {
            final SubLObject var5 = module0351.f23578($ic0$, (SubLObject)ConsesLow.list(var3, var4));
            module0347.f23330(module0191.f11990((SubLObject)$ic8$, var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31325(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        SubLObject var3 = module0202.f12834(var1, (SubLObject)UNPROVIDED);
        SubLObject var4 = (SubLObject)NIL;
        if (NIL == module0173.f10955(var3)) {
            var3 = module0202.f12835(var1, (SubLObject)UNPROVIDED);
        }
        var4 = module0549.f33899(var3);
        if (var4.isZero()) {
            var4 = Sequences.length(module0256.f16531(var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        return var4;
    }
    
    public static SubLObject f31326(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0202.f12834(var1, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0202.f12835(var1, (SubLObject)UNPROVIDED);
        final SubLObject var6 = (NIL != module0193.f12067(var4)) ? var4 : var5;
        final SubLObject var7 = (NIL != module0173.f10955(var4)) ? var4 : var5;
        SubLObject var9;
        final SubLObject var8 = var9 = module0257.f16684(var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var10 = (SubLObject)NIL;
        var10 = var9.first();
        while (NIL != var9) {
            var3.resetMultipleValues();
            final SubLObject var11 = module0235.f15474(var6, var10, (SubLObject)T, (SubLObject)T);
            final SubLObject var12 = var3.secondMultipleValue();
            var3.resetMultipleValues();
            final SubLObject var13 = module0233.f15361(var11, var1);
            final SubLObject var14 = module0351.f23578($ic0$, module0202.f12829(var13, (SubLObject)UNPROVIDED));
            module0347.f23330(module0191.f11990((SubLObject)$ic5$, var14, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var11, var12);
            var9 = var9.rest();
            var10 = var9.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31327(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLObject var3 = module0202.f12834(var1, (SubLObject)UNPROVIDED);
        final SubLObject var4 = module0202.f12835(var1, (SubLObject)UNPROVIDED);
        return (SubLObject)makeBoolean((NIL != module0173.f10955(var3) && NIL != module0349.f23445(var3)) || (NIL != module0173.f10955(var4) && NIL != module0349.f23445(var4)));
    }
    
    public static SubLObject f31328(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = f31325(var1, (SubLObject)UNPROVIDED);
        return Numbers.multiply(var4, $g3632$.getDynamicValue(var3));
    }
    
    public static SubLObject f31329(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0202.f12834(var1, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0202.f12835(var1, (SubLObject)UNPROVIDED);
        final SubLObject var6 = (NIL != module0193.f12067(var4)) ? var4 : var5;
        final SubLObject var7 = (NIL != module0173.f10955(var4)) ? var4 : var5;
        SubLObject var9;
        final SubLObject var8 = var9 = module0258.f16757(var7, (SubLObject)UNPROVIDED);
        SubLObject var10 = (SubLObject)NIL;
        var10 = var9.first();
        while (NIL != var9) {
            var3.resetMultipleValues();
            final SubLObject var11 = module0235.f15474(var6, var10, (SubLObject)T, (SubLObject)T);
            final SubLObject var12 = var3.secondMultipleValue();
            var3.resetMultipleValues();
            final SubLObject var13 = module0233.f15361(var11, var1);
            final SubLObject var14 = module0351.f23578($ic0$, module0202.f12829(var13, (SubLObject)UNPROVIDED));
            module0347.f23330(module0191.f11990((SubLObject)$ic8$, var14, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var11, var12);
            var9 = var9.rest();
            var10 = var9.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31330(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var5;
        final SubLObject var4 = var5 = module0202.f12829(var1, (SubLObject)UNPROVIDED);
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic16$);
        var6 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic16$);
        var7 = var5.first();
        var5 = var5.rest();
        if (NIL == var5) {
            if (NIL != module0018.$g646$.getDynamicValue(var3) && NIL == module0257.f16689(var6, var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                final SubLObject var8 = module0351.f23578($ic0$, (SubLObject)ConsesLow.list(var6, var7));
                module0347.f23330(module0191.f11990((SubLObject)$ic17$, module0205.f13338(var8), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else if (NIL != module0257.f16699(var6, var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                final SubLObject var8 = module0351.f23578($ic0$, (SubLObject)ConsesLow.list(var6, var7));
                module0347.f23330(module0191.f11990((SubLObject)$ic5$, module0205.f13338(var8), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic16$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31331(final SubLObject var24, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLObject var25 = module0205.f13387(var24, (SubLObject)UNPROVIDED);
        final SubLObject var26 = module0205.f13388(var24, (SubLObject)UNPROVIDED);
        if (var25.eql(var26)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0257.f16692(var25, var26, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)$ic5$, var24, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31332(final SubLObject var24, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLObject var25 = module0202.f12760(module0205.f13387(var24, (SubLObject)UNPROVIDED));
        return Sequences.length(var25);
    }
    
    public static SubLObject f31333(final SubLObject var27) {
        final SubLObject var28 = module0202.f12760(var27);
        final SubLObject var29 = module0257.f16723(var28);
        return Mapping.mapcar((SubLObject)$ic29$, Mapping.mapcar((SubLObject)$ic30$, var29));
    }
    
    public static SubLObject f31334() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0459", "f31322", "S#34618", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0459", "f31323", "S#34619", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0459", "f31324", "S#34620", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0459", "f31325", "S#34621", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0459", "f31326", "S#34622", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0459", "f31327", "S#34623", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0459", "f31328", "S#34624", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0459", "f31329", "S#34625", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0459", "f31330", "S#34626", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0459", "f31331", "S#34627", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0459", "f31332", "S#34628", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0459", "f31333", "S#34629", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31335() {
        $g3630$ = SubLFiles.defparameter("S#34630", (SubLObject)TWO_INTEGER);
        $g3631$ = SubLFiles.defparameter("S#34631", (SubLObject)TWO_INTEGER);
        $g3632$ = SubLFiles.defparameter("S#34632", (SubLObject)$ic13$);
        $g3633$ = SubLFiles.defparameter("S#34633", (SubLObject)FOUR_INTEGER);
        $g3634$ = SubLFiles.defparameter("S#34634", $g3630$.getDynamicValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31336() {
        module0340.f22938($ic0$);
        module0358.f23774((SubLObject)$ic1$, $ic0$);
        module0358.f23773((SubLObject)$ic2$, $ic0$);
        module0358.f23730((SubLObject)$ic3$, (SubLObject)$ic4$);
        module0340.f22941((SubLObject)$ic6$, (SubLObject)$ic7$);
        module0340.f22941((SubLObject)$ic9$, (SubLObject)$ic10$);
        module0340.f22941((SubLObject)$ic11$, (SubLObject)$ic12$);
        module0340.f22941((SubLObject)$ic14$, (SubLObject)$ic15$);
        module0340.f22941((SubLObject)$ic18$, (SubLObject)$ic19$);
        module0340.f22938($ic20$);
        module0358.f23773((SubLObject)$ic1$, $ic20$);
        module0340.f22941((SubLObject)$ic21$, (SubLObject)$ic22$);
        module0340.f22938($ic23$);
        module0358.f23771((SubLObject)$ic1$, $ic23$, (SubLObject)ONE_INTEGER);
        module0340.f22941((SubLObject)$ic24$, (SubLObject)$ic25$);
        module0340.f22941((SubLObject)$ic26$, (SubLObject)$ic27$);
        module0012.f419((SubLObject)$ic28$);
        module0012.f419((SubLObject)$ic31$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f31334();
    }
    
    public void initializeVariables() {
        f31335();
    }
    
    public void runTopLevelForms() {
        f31336();
    }
    
    static {
        me = (SubLFile)new module0459();
        $g3630$ = null;
        $g3631$ = null;
        $g3632$ = null;
        $g3633$ = null;
        $g3634$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("disjointWith"));
        $ic1$ = makeKeyword("POS");
        $ic2$ = makeKeyword("NEG");
        $ic3$ = makeKeyword("MAX-DISJOINT-WITH-POS");
        $ic4$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("disjointWith")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("OR"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("disjointWith")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("disjointWith")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND"))), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic5$ = makeKeyword("DISJOINTWITH");
        $ic6$ = makeKeyword("REMOVAL-DISJOINTWITH-CHECK");
        $ic7$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("disjointWith")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("disjointWith")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34630", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34618", "CYC") });
        $ic8$ = makeKeyword("SIBLING-DISJOINT");
        $ic9$ = makeKeyword("REMOVAL-SIBLING-DISJOINT-CHECK");
        $ic10$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("disjointWith")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("disjointWith")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FORT")), makeKeyword("REQUIRED"), makeSymbol("S#34619", "CYC"), makeKeyword("COST-EXPRESSION"), ConsesLow.list((SubLObject)makeSymbol("*"), (SubLObject)makeSymbol("S#34630", "CYC"), (SubLObject)makeSymbol("S#34631", "CYC")), makeKeyword("EXPAND"), makeSymbol("S#34620", "CYC") });
        $ic11$ = makeKeyword("REMOVAL-MAX-DISJOINTWITH");
        $ic12$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("disjointWith")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("OR"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("disjointWith")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("VARIABLE")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("disjointWith")), (SubLObject)makeKeyword("VARIABLE"), (SubLObject)makeKeyword("FORT"))), makeKeyword("COST"), makeSymbol("S#34621", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34622", "CYC") });
        $ic13$ = makeInteger(100);
        $ic14$ = makeKeyword("REMOVAL-MAX-SIBLING-DISJOINT");
        $ic15$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("disjointWith")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("OR"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("disjointWith")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("VARIABLE")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("disjointWith")), (SubLObject)makeKeyword("VARIABLE"), (SubLObject)makeKeyword("FORT"))), makeKeyword("REQUIRED"), makeSymbol("S#34623", "CYC"), makeKeyword("COST"), makeSymbol("S#34624", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34625", "CYC") });
        $ic16$ = ConsesLow.list((SubLObject)makeSymbol("S#25108", "CYC"), (SubLObject)makeSymbol("S#25109", "CYC"));
        $ic17$ = makeKeyword("MINIMIZE");
        $ic18$ = makeKeyword("REMOVAL-NOT-DISJOINTWITH-CHECK");
        $ic19$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("disjointWith")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("disjointWith")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34633", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34626", "CYC") });
        $ic20$ = constant_handles_oc.f8479((SubLObject)makeString("instancesOfDisjointCollections"));
        $ic21$ = makeKeyword("REMOVAL-INSTANCES-OF-DISJOINT-COLLECTIONS");
        $ic22$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("instancesOfDisjointCollections")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("instancesOfDisjointCollections")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34634", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34627", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$instancesOfDisjointCollections <fully-bound> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$instancesOfDisjointCollections #$AbrahamLincoln #$CityOfAustinTX)\n    (#$instancesOfDisjointCollections (#$SomeFn #$Cat) (#$SomeFn #$Dog))") });
        $ic23$ = constant_handles_oc.f8479((SubLObject)makeString("maximalConsistentSubsets"));
        $ic24$ = makeKeyword("REMOVAL-MAXIMAL-CONSISTENT-SUBSETS-CHECK");
        $ic25$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("maximalConsistentSubsets")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("maximalConsistentSubsets")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#15603", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#15603", "CYC")))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1889", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("maximalConsistentSubsets")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("SET")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34635", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("SET")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34635", "CYC")))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("SET"), (SubLObject)makeSymbol("S#34635", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#19406", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#15671", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("SET"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#15671", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34635", "CYC"))))), makeKeyword("SUPPORT-MODULE"), makeKeyword("CODE"), makeKeyword("DOCUMENTATION"), makeString("(#$maximalConsistentSubsets <set-of-collections> <set-of-collections>)"), makeKeyword("EXAMPLE"), makeString("(#$maximalConsistentSubsets (#$TheSet #$Animal #$MaleAnimal #$FemaleAnimal) (#$TheSet #$Animal #$MaleAnimal))") });
        $ic26$ = makeKeyword("REMOVAL-MAXIMAL-CONSISTENT-SUBSETS-UNIFY");
        $ic27$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("maximalConsistentSubsets")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("maximalConsistentSubsets")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#15603", "CYC"))), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST"), makeSymbol("S#34628", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("maximalConsistentSubsets")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("SET")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("SET"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34629", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("maximalConsistentSubsets")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("SET")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("CODE"), makeKeyword("DOCUMENTATION"), makeString("(#$maximalConsistentSubsets <set-of-collections> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$maximalConsistentSubsets (#$TheSet #$Animal #$MaleAnimal #$FemaleAnimal) ?WHAT)") });
        $ic28$ = makeSymbol("S#34628", "CYC");
        $ic29$ = makeSymbol("CANONICALIZE-TERM");
        $ic30$ = makeSymbol("S#15690", "CYC");
        $ic31$ = makeSymbol("S#34629", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 166 ms
	
	Decompiled with Procyon 0.5.32.
*/