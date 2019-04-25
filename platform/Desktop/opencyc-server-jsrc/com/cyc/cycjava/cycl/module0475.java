package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0475 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0475";
    public static final String myFingerPrint = "a3a4a1aaec237688d9b1cafcedcaf431dbe23d7f2f539eceec9ec3134c1933c8";
    private static SubLSymbol $g3688$;
    private static SubLSymbol $g3689$;
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLList $ic13$;
    
    public static SubLObject f31620(final SubLObject var1, SubLObject var2) {
        if (var2 == module0475.UNPROVIDED) {
            var2 = (SubLObject)module0475.NIL;
        }
        SubLObject var4;
        final SubLObject var3 = var4 = module0202.f12829(var1, (SubLObject)module0475.UNPROVIDED);
        SubLObject var5 = (SubLObject)module0475.NIL;
        SubLObject var6 = (SubLObject)module0475.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0475.$ic3$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0475.$ic3$);
        var6 = var4.first();
        var4 = var4.rest();
        if (module0475.NIL == var4) {
            if (module0475.NIL != module0261.f17250(var5, var6, (SubLObject)module0475.UNPROVIDED, (SubLObject)module0475.UNPROVIDED)) {
                final SubLObject var7 = module0351.f23578(module0475.$ic0$, (SubLObject)ConsesLow.list(var5, var6));
                module0347.f23330(module0191.f11990((SubLObject)module0475.$ic4$, var7, (SubLObject)module0475.UNPROVIDED, (SubLObject)module0475.UNPROVIDED), (SubLObject)module0475.UNPROVIDED, (SubLObject)module0475.UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0475.$ic3$);
        }
        return (SubLObject)module0475.NIL;
    }
    
    public static SubLObject f31621(final SubLObject var1, SubLObject var2) {
        if (var2 == module0475.UNPROVIDED) {
            var2 = (SubLObject)module0475.NIL;
        }
        SubLObject var3 = module0202.f12834(var1, (SubLObject)module0475.UNPROVIDED);
        if (module0475.NIL == module0173.f10955(var3)) {
            var3 = module0202.f12835(var1, (SubLObject)module0475.UNPROVIDED);
        }
        return module0549.f33899(var3);
    }
    
    public static SubLObject f31622(final SubLObject var1, SubLObject var2) {
        if (var2 == module0475.UNPROVIDED) {
            var2 = (SubLObject)module0475.NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0202.f12834(var1, (SubLObject)module0475.UNPROVIDED);
        final SubLObject var5 = module0202.f12835(var1, (SubLObject)module0475.UNPROVIDED);
        final SubLObject var6 = (module0475.NIL != module0193.f12067(var4)) ? var4 : var5;
        final SubLObject var7 = (module0475.NIL != module0173.f10955(var4)) ? var4 : var5;
        SubLObject var9;
        final SubLObject var8 = var9 = module0261.f17234(var7, (SubLObject)module0475.UNPROVIDED);
        SubLObject var10 = (SubLObject)module0475.NIL;
        var10 = var9.first();
        while (module0475.NIL != var9) {
            var3.resetMultipleValues();
            final SubLObject var11 = module0235.f15474(var6, var10, (SubLObject)module0475.T, (SubLObject)module0475.T);
            final SubLObject var12 = var3.secondMultipleValue();
            var3.resetMultipleValues();
            if (module0475.NIL != var11) {
                final SubLObject var13 = module0233.f15361(var11, var1);
                final SubLObject var14 = module0351.f23578(module0475.$ic0$, module0202.f12829(var13, (SubLObject)module0475.UNPROVIDED));
                module0347.f23330(module0191.f11990((SubLObject)module0475.$ic4$, var14, (SubLObject)module0475.UNPROVIDED, (SubLObject)module0475.UNPROVIDED), var11, var12);
            }
            var9 = var9.rest();
            var10 = var9.first();
        }
        return (SubLObject)module0475.NIL;
    }
    
    public static SubLObject f31623(final SubLObject var1, SubLObject var2) {
        if (var2 == module0475.UNPROVIDED) {
            var2 = (SubLObject)module0475.NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var5;
        final SubLObject var4 = var5 = module0202.f12829(var1, (SubLObject)module0475.UNPROVIDED);
        SubLObject var6 = (SubLObject)module0475.NIL;
        SubLObject var7 = (SubLObject)module0475.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0475.$ic3$);
        var6 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0475.$ic3$);
        var7 = var5.first();
        var5 = var5.rest();
        if (module0475.NIL == var5) {
            if (module0475.NIL != module0018.$g646$.getDynamicValue(var3) && module0475.NIL == module0261.f17250(var6, var7, (SubLObject)module0475.UNPROVIDED, (SubLObject)module0475.UNPROVIDED)) {
                final SubLObject var8 = module0351.f23578(module0475.$ic0$, (SubLObject)ConsesLow.list(var6, var7));
                module0347.f23330(module0191.f11990((SubLObject)module0475.$ic11$, module0205.f13338(var8), (SubLObject)module0475.UNPROVIDED, (SubLObject)module0475.UNPROVIDED), (SubLObject)module0475.UNPROVIDED, (SubLObject)module0475.UNPROVIDED);
            }
            else if (module0475.NIL != module0261.f17254(var6, var7, (SubLObject)module0475.UNPROVIDED, (SubLObject)module0475.UNPROVIDED)) {
                final SubLObject var8 = module0351.f23578(module0475.$ic0$, (SubLObject)ConsesLow.list(var6, var7));
                module0347.f23330(module0191.f11990((SubLObject)module0475.$ic4$, module0205.f13338(var8), (SubLObject)module0475.UNPROVIDED, (SubLObject)module0475.UNPROVIDED), (SubLObject)module0475.UNPROVIDED, (SubLObject)module0475.UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)module0475.$ic3$);
        }
        return (SubLObject)module0475.NIL;
    }
    
    public static SubLObject f31624() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0475", "f31620", "S#34967", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0475", "f31621", "S#34968", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0475", "f31622", "S#34969", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0475", "f31623", "S#34970", 1, 1, false);
        return (SubLObject)module0475.NIL;
    }
    
    public static SubLObject f31625() {
        module0475.$g3688$ = SubLFiles.defparameter("S#34971", module0018.$g658$.getDynamicValue());
        module0475.$g3689$ = SubLFiles.defparameter("S#34972", (SubLObject)module0475.TWO_INTEGER);
        return (SubLObject)module0475.NIL;
    }
    
    public static SubLObject f31626() {
        module0340.f22938(module0475.$ic0$);
        module0358.f23774((SubLObject)module0475.$ic1$, module0475.$ic0$);
        module0358.f23773((SubLObject)module0475.$ic2$, module0475.$ic0$);
        module0340.f22941((SubLObject)module0475.$ic5$, (SubLObject)module0475.$ic6$);
        module0340.f22941((SubLObject)module0475.$ic7$, (SubLObject)module0475.$ic8$);
        module0358.f23730((SubLObject)module0475.$ic9$, (SubLObject)module0475.$ic10$);
        module0340.f22941((SubLObject)module0475.$ic12$, (SubLObject)module0475.$ic13$);
        return (SubLObject)module0475.NIL;
    }
    
    public void declareFunctions() {
        f31624();
    }
    
    public void initializeVariables() {
        f31625();
    }
    
    public void runTopLevelForms() {
        f31626();
    }
    
    static {
        me = (SubLFile)new module0475();
        module0475.$g3688$ = null;
        module0475.$g3689$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("negationInverse"));
        $ic1$ = SubLObjectFactory.makeKeyword("POS");
        $ic2$ = SubLObjectFactory.makeKeyword("NEG");
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#19778", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#19779", "CYC"));
        $ic4$ = SubLObjectFactory.makeKeyword("NEGATIONPREDS");
        $ic5$ = SubLObjectFactory.makeKeyword("REMOVAL-NEGATIONINVERSE-CHECK");
        $ic6$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("negationInverse")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("negationInverse")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#34971", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34967", "CYC") });
        $ic7$ = SubLObjectFactory.makeKeyword("REMOVAL-MAX-NEGATIONINVERSE");
        $ic8$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("negationInverse")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("negationInverse")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("negationInverse")), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#34968", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34969", "CYC") });
        $ic9$ = SubLObjectFactory.makeKeyword("MAX-NEGATION-INVERSE-POS");
        $ic10$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("negationInverse")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("negationInverse")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("negationInverse")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"))), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("GROSSLY-DISPREFERRED"));
        $ic11$ = SubLObjectFactory.makeKeyword("MINIMIZE");
        $ic12$ = SubLObjectFactory.makeKeyword("REMOVAL-NOT-NEGATIONINVERSE-CHECK");
        $ic13$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("negationInverse")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("negationInverse")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#34973", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34970", "CYC") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0475.class
	Total time: 99 ms
	
	Decompiled with Procyon 0.5.32.
*/