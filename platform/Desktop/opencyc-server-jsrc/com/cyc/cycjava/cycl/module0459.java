package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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
        if (var2 == module0459.UNPROVIDED) {
            var2 = (SubLObject)module0459.NIL;
        }
        final SubLObject var3 = module0202.f12834(var1, (SubLObject)module0459.UNPROVIDED);
        final SubLObject var4 = module0202.f12835(var1, (SubLObject)module0459.UNPROVIDED);
        if (module0459.NIL != module0257.f16689(var3, var4, (SubLObject)module0459.UNPROVIDED, (SubLObject)module0459.UNPROVIDED)) {
            final SubLObject var5 = module0351.f23578(module0459.$ic0$, (SubLObject)ConsesLow.list(var3, var4));
            module0347.f23330(module0191.f11990((SubLObject)module0459.$ic5$, var5, (SubLObject)module0459.UNPROVIDED, (SubLObject)module0459.UNPROVIDED), (SubLObject)module0459.UNPROVIDED, (SubLObject)module0459.UNPROVIDED);
        }
        return (SubLObject)module0459.NIL;
    }
    
    public static SubLObject f31323(final SubLObject var1, SubLObject var2) {
        if (var2 == module0459.UNPROVIDED) {
            var2 = (SubLObject)module0459.NIL;
        }
        final SubLObject var3 = module0202.f12834(var1, (SubLObject)module0459.UNPROVIDED);
        final SubLObject var4 = module0202.f12835(var1, (SubLObject)module0459.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0459.NIL != module0349.f23445(var3) && module0459.NIL != module0349.f23445(var4) && module0459.NIL != module0258.f16779(var3, var4, (SubLObject)module0459.UNPROVIDED));
    }
    
    public static SubLObject f31324(final SubLObject var1, SubLObject var2) {
        if (var2 == module0459.UNPROVIDED) {
            var2 = (SubLObject)module0459.NIL;
        }
        final SubLObject var3 = module0202.f12834(var1, (SubLObject)module0459.UNPROVIDED);
        final SubLObject var4 = module0202.f12835(var1, (SubLObject)module0459.UNPROVIDED);
        if (module0459.NIL != module0258.f16777(var3, var4, (SubLObject)module0459.UNPROVIDED)) {
            final SubLObject var5 = module0351.f23578(module0459.$ic0$, (SubLObject)ConsesLow.list(var3, var4));
            module0347.f23330(module0191.f11990((SubLObject)module0459.$ic8$, var5, (SubLObject)module0459.UNPROVIDED, (SubLObject)module0459.UNPROVIDED), (SubLObject)module0459.UNPROVIDED, (SubLObject)module0459.UNPROVIDED);
        }
        return (SubLObject)module0459.NIL;
    }
    
    public static SubLObject f31325(final SubLObject var1, SubLObject var2) {
        if (var2 == module0459.UNPROVIDED) {
            var2 = (SubLObject)module0459.NIL;
        }
        SubLObject var3 = module0202.f12834(var1, (SubLObject)module0459.UNPROVIDED);
        SubLObject var4 = (SubLObject)module0459.NIL;
        if (module0459.NIL == module0173.f10955(var3)) {
            var3 = module0202.f12835(var1, (SubLObject)module0459.UNPROVIDED);
        }
        var4 = module0549.f33899(var3);
        if (var4.isZero()) {
            var4 = Sequences.length(module0256.f16531(var3, (SubLObject)module0459.UNPROVIDED, (SubLObject)module0459.UNPROVIDED));
        }
        return var4;
    }
    
    public static SubLObject f31326(final SubLObject var1, SubLObject var2) {
        if (var2 == module0459.UNPROVIDED) {
            var2 = (SubLObject)module0459.NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0202.f12834(var1, (SubLObject)module0459.UNPROVIDED);
        final SubLObject var5 = module0202.f12835(var1, (SubLObject)module0459.UNPROVIDED);
        final SubLObject var6 = (module0459.NIL != module0193.f12067(var4)) ? var4 : var5;
        final SubLObject var7 = (module0459.NIL != module0173.f10955(var4)) ? var4 : var5;
        SubLObject var9;
        final SubLObject var8 = var9 = module0257.f16684(var7, (SubLObject)module0459.UNPROVIDED, (SubLObject)module0459.UNPROVIDED);
        SubLObject var10 = (SubLObject)module0459.NIL;
        var10 = var9.first();
        while (module0459.NIL != var9) {
            var3.resetMultipleValues();
            final SubLObject var11 = module0235.f15474(var6, var10, (SubLObject)module0459.T, (SubLObject)module0459.T);
            final SubLObject var12 = var3.secondMultipleValue();
            var3.resetMultipleValues();
            final SubLObject var13 = module0233.f15361(var11, var1);
            final SubLObject var14 = module0351.f23578(module0459.$ic0$, module0202.f12829(var13, (SubLObject)module0459.UNPROVIDED));
            module0347.f23330(module0191.f11990((SubLObject)module0459.$ic5$, var14, (SubLObject)module0459.UNPROVIDED, (SubLObject)module0459.UNPROVIDED), var11, var12);
            var9 = var9.rest();
            var10 = var9.first();
        }
        return (SubLObject)module0459.NIL;
    }
    
    public static SubLObject f31327(final SubLObject var1, SubLObject var2) {
        if (var2 == module0459.UNPROVIDED) {
            var2 = (SubLObject)module0459.NIL;
        }
        final SubLObject var3 = module0202.f12834(var1, (SubLObject)module0459.UNPROVIDED);
        final SubLObject var4 = module0202.f12835(var1, (SubLObject)module0459.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean((module0459.NIL != module0173.f10955(var3) && module0459.NIL != module0349.f23445(var3)) || (module0459.NIL != module0173.f10955(var4) && module0459.NIL != module0349.f23445(var4)));
    }
    
    public static SubLObject f31328(final SubLObject var1, SubLObject var2) {
        if (var2 == module0459.UNPROVIDED) {
            var2 = (SubLObject)module0459.NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = f31325(var1, (SubLObject)module0459.UNPROVIDED);
        return Numbers.multiply(var4, module0459.$g3632$.getDynamicValue(var3));
    }
    
    public static SubLObject f31329(final SubLObject var1, SubLObject var2) {
        if (var2 == module0459.UNPROVIDED) {
            var2 = (SubLObject)module0459.NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0202.f12834(var1, (SubLObject)module0459.UNPROVIDED);
        final SubLObject var5 = module0202.f12835(var1, (SubLObject)module0459.UNPROVIDED);
        final SubLObject var6 = (module0459.NIL != module0193.f12067(var4)) ? var4 : var5;
        final SubLObject var7 = (module0459.NIL != module0173.f10955(var4)) ? var4 : var5;
        SubLObject var9;
        final SubLObject var8 = var9 = module0258.f16757(var7, (SubLObject)module0459.UNPROVIDED);
        SubLObject var10 = (SubLObject)module0459.NIL;
        var10 = var9.first();
        while (module0459.NIL != var9) {
            var3.resetMultipleValues();
            final SubLObject var11 = module0235.f15474(var6, var10, (SubLObject)module0459.T, (SubLObject)module0459.T);
            final SubLObject var12 = var3.secondMultipleValue();
            var3.resetMultipleValues();
            final SubLObject var13 = module0233.f15361(var11, var1);
            final SubLObject var14 = module0351.f23578(module0459.$ic0$, module0202.f12829(var13, (SubLObject)module0459.UNPROVIDED));
            module0347.f23330(module0191.f11990((SubLObject)module0459.$ic8$, var14, (SubLObject)module0459.UNPROVIDED, (SubLObject)module0459.UNPROVIDED), var11, var12);
            var9 = var9.rest();
            var10 = var9.first();
        }
        return (SubLObject)module0459.NIL;
    }
    
    public static SubLObject f31330(final SubLObject var1, SubLObject var2) {
        if (var2 == module0459.UNPROVIDED) {
            var2 = (SubLObject)module0459.NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var5;
        final SubLObject var4 = var5 = module0202.f12829(var1, (SubLObject)module0459.UNPROVIDED);
        SubLObject var6 = (SubLObject)module0459.NIL;
        SubLObject var7 = (SubLObject)module0459.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0459.$ic16$);
        var6 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0459.$ic16$);
        var7 = var5.first();
        var5 = var5.rest();
        if (module0459.NIL == var5) {
            if (module0459.NIL != module0018.$g646$.getDynamicValue(var3) && module0459.NIL == module0257.f16689(var6, var7, (SubLObject)module0459.UNPROVIDED, (SubLObject)module0459.UNPROVIDED)) {
                final SubLObject var8 = module0351.f23578(module0459.$ic0$, (SubLObject)ConsesLow.list(var6, var7));
                module0347.f23330(module0191.f11990((SubLObject)module0459.$ic17$, module0205.f13338(var8), (SubLObject)module0459.UNPROVIDED, (SubLObject)module0459.UNPROVIDED), (SubLObject)module0459.UNPROVIDED, (SubLObject)module0459.UNPROVIDED);
            }
            else if (module0459.NIL != module0257.f16699(var6, var7, (SubLObject)module0459.UNPROVIDED, (SubLObject)module0459.UNPROVIDED)) {
                final SubLObject var8 = module0351.f23578(module0459.$ic0$, (SubLObject)ConsesLow.list(var6, var7));
                module0347.f23330(module0191.f11990((SubLObject)module0459.$ic5$, module0205.f13338(var8), (SubLObject)module0459.UNPROVIDED, (SubLObject)module0459.UNPROVIDED), (SubLObject)module0459.UNPROVIDED, (SubLObject)module0459.UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)module0459.$ic16$);
        }
        return (SubLObject)module0459.NIL;
    }
    
    public static SubLObject f31331(final SubLObject var24, SubLObject var2) {
        if (var2 == module0459.UNPROVIDED) {
            var2 = (SubLObject)module0459.NIL;
        }
        final SubLObject var25 = module0205.f13387(var24, (SubLObject)module0459.UNPROVIDED);
        final SubLObject var26 = module0205.f13388(var24, (SubLObject)module0459.UNPROVIDED);
        if (var25.eql(var26)) {
            return (SubLObject)module0459.NIL;
        }
        if (module0459.NIL != module0257.f16692(var25, var26, (SubLObject)module0459.UNPROVIDED, (SubLObject)module0459.UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)module0459.$ic5$, var24, (SubLObject)module0459.UNPROVIDED, (SubLObject)module0459.UNPROVIDED), (SubLObject)module0459.UNPROVIDED, (SubLObject)module0459.UNPROVIDED);
        }
        return (SubLObject)module0459.NIL;
    }
    
    public static SubLObject f31332(final SubLObject var24, SubLObject var2) {
        if (var2 == module0459.UNPROVIDED) {
            var2 = (SubLObject)module0459.NIL;
        }
        final SubLObject var25 = module0202.f12760(module0205.f13387(var24, (SubLObject)module0459.UNPROVIDED));
        return Sequences.length(var25);
    }
    
    public static SubLObject f31333(final SubLObject var27) {
        final SubLObject var28 = module0202.f12760(var27);
        final SubLObject var29 = module0257.f16723(var28);
        return Mapping.mapcar((SubLObject)module0459.$ic29$, Mapping.mapcar((SubLObject)module0459.$ic30$, var29));
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
        return (SubLObject)module0459.NIL;
    }
    
    public static SubLObject f31335() {
        module0459.$g3630$ = SubLFiles.defparameter("S#34630", (SubLObject)module0459.TWO_INTEGER);
        module0459.$g3631$ = SubLFiles.defparameter("S#34631", (SubLObject)module0459.TWO_INTEGER);
        module0459.$g3632$ = SubLFiles.defparameter("S#34632", (SubLObject)module0459.$ic13$);
        module0459.$g3633$ = SubLFiles.defparameter("S#34633", (SubLObject)module0459.FOUR_INTEGER);
        module0459.$g3634$ = SubLFiles.defparameter("S#34634", module0459.$g3630$.getDynamicValue());
        return (SubLObject)module0459.NIL;
    }
    
    public static SubLObject f31336() {
        module0340.f22938(module0459.$ic0$);
        module0358.f23774((SubLObject)module0459.$ic1$, module0459.$ic0$);
        module0358.f23773((SubLObject)module0459.$ic2$, module0459.$ic0$);
        module0358.f23730((SubLObject)module0459.$ic3$, (SubLObject)module0459.$ic4$);
        module0340.f22941((SubLObject)module0459.$ic6$, (SubLObject)module0459.$ic7$);
        module0340.f22941((SubLObject)module0459.$ic9$, (SubLObject)module0459.$ic10$);
        module0340.f22941((SubLObject)module0459.$ic11$, (SubLObject)module0459.$ic12$);
        module0340.f22941((SubLObject)module0459.$ic14$, (SubLObject)module0459.$ic15$);
        module0340.f22941((SubLObject)module0459.$ic18$, (SubLObject)module0459.$ic19$);
        module0340.f22938(module0459.$ic20$);
        module0358.f23773((SubLObject)module0459.$ic1$, module0459.$ic20$);
        module0340.f22941((SubLObject)module0459.$ic21$, (SubLObject)module0459.$ic22$);
        module0340.f22938(module0459.$ic23$);
        module0358.f23771((SubLObject)module0459.$ic1$, module0459.$ic23$, (SubLObject)module0459.ONE_INTEGER);
        module0340.f22941((SubLObject)module0459.$ic24$, (SubLObject)module0459.$ic25$);
        module0340.f22941((SubLObject)module0459.$ic26$, (SubLObject)module0459.$ic27$);
        module0012.f419((SubLObject)module0459.$ic28$);
        module0012.f419((SubLObject)module0459.$ic31$);
        return (SubLObject)module0459.NIL;
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
        module0459.$g3630$ = null;
        module0459.$g3631$ = null;
        module0459.$g3632$ = null;
        module0459.$g3633$ = null;
        module0459.$g3634$ = null;
        $ic0$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("disjointWith"));
        $ic1$ = SubLObjectFactory.makeKeyword("POS");
        $ic2$ = SubLObjectFactory.makeKeyword("NEG");
        $ic3$ = SubLObjectFactory.makeKeyword("MAX-DISJOINT-WITH-POS");
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("disjointWith")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("disjointWith")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("disjointWith")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"))), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("GROSSLY-DISPREFERRED"));
        $ic5$ = SubLObjectFactory.makeKeyword("DISJOINTWITH");
        $ic6$ = SubLObjectFactory.makeKeyword("REMOVAL-DISJOINTWITH-CHECK");
        $ic7$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("disjointWith")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("disjointWith")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#34630", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34618", "CYC") });
        $ic8$ = SubLObjectFactory.makeKeyword("SIBLING-DISJOINT");
        $ic9$ = SubLObjectFactory.makeKeyword("REMOVAL-SIBLING-DISJOINT-CHECK");
        $ic10$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("disjointWith")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("disjointWith")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("S#34619", "CYC"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*"), (SubLObject)SubLObjectFactory.makeSymbol("S#34630", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#34631", "CYC")), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34620", "CYC") });
        $ic11$ = SubLObjectFactory.makeKeyword("REMOVAL-MAX-DISJOINTWITH");
        $ic12$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("disjointWith")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("disjointWith")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("disjointWith")), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#34621", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34622", "CYC") });
        $ic13$ = SubLObjectFactory.makeInteger(100);
        $ic14$ = SubLObjectFactory.makeKeyword("REMOVAL-MAX-SIBLING-DISJOINT");
        $ic15$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("disjointWith")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("disjointWith")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("disjointWith")), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"))), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("S#34623", "CYC"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#34624", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34625", "CYC") });
        $ic16$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#25108", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25109", "CYC"));
        $ic17$ = SubLObjectFactory.makeKeyword("MINIMIZE");
        $ic18$ = SubLObjectFactory.makeKeyword("REMOVAL-NOT-DISJOINTWITH-CHECK");
        $ic19$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("disjointWith")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("disjointWith")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#34633", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34626", "CYC") });
        $ic20$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("instancesOfDisjointCollections"));
        $ic21$ = SubLObjectFactory.makeKeyword("REMOVAL-INSTANCES-OF-DISJOINT-COLLECTIONS");
        $ic22$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("instancesOfDisjointCollections")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("instancesOfDisjointCollections")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#34634", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34627", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$instancesOfDisjointCollections <fully-bound> <fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$instancesOfDisjointCollections #$AbrahamLincoln #$CityOfAustinTX)\n    (#$instancesOfDisjointCollections (#$SomeFn #$Cat) (#$SomeFn #$Dog))") });
        $ic23$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("maximalConsistentSubsets"));
        $ic24$ = SubLObjectFactory.makeKeyword("REMOVAL-MAXIMAL-CONSISTENT-SUBSETS-CHECK");
        $ic25$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("maximalConsistentSubsets")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("maximalConsistentSubsets")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#15603", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#15603", "CYC")))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#1889", "CYC"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("maximalConsistentSubsets")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#34635", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#34635", "CYC")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET"), (SubLObject)SubLObjectFactory.makeSymbol("S#34635", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#19406", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#15671", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SET"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#15671", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#34635", "CYC"))))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("CODE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$maximalConsistentSubsets <set-of-collections> <set-of-collections>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$maximalConsistentSubsets (#$TheSet #$Animal #$MaleAnimal #$FemaleAnimal) (#$TheSet #$Animal #$MaleAnimal))") });
        $ic26$ = SubLObjectFactory.makeKeyword("REMOVAL-MAXIMAL-CONSISTENT-SUBSETS-UNIFY");
        $ic27$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("maximalConsistentSubsets")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("maximalConsistentSubsets")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#15603", "CYC"))), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#34628", "CYC"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("maximalConsistentSubsets")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SET"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#34629", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("maximalConsistentSubsets")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("CODE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$maximalConsistentSubsets <set-of-collections> <not-fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$maximalConsistentSubsets (#$TheSet #$Animal #$MaleAnimal #$FemaleAnimal) ?WHAT)") });
        $ic28$ = SubLObjectFactory.makeSymbol("S#34628", "CYC");
        $ic29$ = SubLObjectFactory.makeSymbol("CANONICALIZE-TERM");
        $ic30$ = SubLObjectFactory.makeSymbol("S#15690", "CYC");
        $ic31$ = SubLObjectFactory.makeSymbol("S#34629", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0459.class
	Total time: 166 ms
	
	Decompiled with Procyon 0.5.32.
*/