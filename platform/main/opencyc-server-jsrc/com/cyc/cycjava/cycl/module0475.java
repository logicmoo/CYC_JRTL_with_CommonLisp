package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        SubLObject var4;
        final SubLObject var3 = var4 = module0202.f12829(var1, (SubLObject)UNPROVIDED);
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic3$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic3$);
        var6 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            if (NIL != module0261.f17250(var5, var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                final SubLObject var7 = module0351.f23578($ic0$, (SubLObject)ConsesLow.list(var5, var6));
                module0347.f23330(module0191.f11990((SubLObject)$ic4$, var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic3$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31621(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        SubLObject var3 = module0202.f12834(var1, (SubLObject)UNPROVIDED);
        if (NIL == module0173.f10955(var3)) {
            var3 = module0202.f12835(var1, (SubLObject)UNPROVIDED);
        }
        return module0549.f33899(var3);
    }
    
    public static SubLObject f31622(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0202.f12834(var1, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0202.f12835(var1, (SubLObject)UNPROVIDED);
        final SubLObject var6 = (NIL != module0193.f12067(var4)) ? var4 : var5;
        final SubLObject var7 = (NIL != module0173.f10955(var4)) ? var4 : var5;
        SubLObject var9;
        final SubLObject var8 = var9 = module0261.f17234(var7, (SubLObject)UNPROVIDED);
        SubLObject var10 = (SubLObject)NIL;
        var10 = var9.first();
        while (NIL != var9) {
            var3.resetMultipleValues();
            final SubLObject var11 = module0235.f15474(var6, var10, (SubLObject)T, (SubLObject)T);
            final SubLObject var12 = var3.secondMultipleValue();
            var3.resetMultipleValues();
            if (NIL != var11) {
                final SubLObject var13 = module0233.f15361(var11, var1);
                final SubLObject var14 = module0351.f23578($ic0$, module0202.f12829(var13, (SubLObject)UNPROVIDED));
                module0347.f23330(module0191.f11990((SubLObject)$ic4$, var14, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var11, var12);
            }
            var9 = var9.rest();
            var10 = var9.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31623(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var5;
        final SubLObject var4 = var5 = module0202.f12829(var1, (SubLObject)UNPROVIDED);
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic3$);
        var6 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic3$);
        var7 = var5.first();
        var5 = var5.rest();
        if (NIL == var5) {
            if (NIL != module0018.$g646$.getDynamicValue(var3) && NIL == module0261.f17250(var6, var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                final SubLObject var8 = module0351.f23578($ic0$, (SubLObject)ConsesLow.list(var6, var7));
                module0347.f23330(module0191.f11990((SubLObject)$ic11$, module0205.f13338(var8), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else if (NIL != module0261.f17254(var6, var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                final SubLObject var8 = module0351.f23578($ic0$, (SubLObject)ConsesLow.list(var6, var7));
                module0347.f23330(module0191.f11990((SubLObject)$ic4$, module0205.f13338(var8), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic3$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31624() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0475", "f31620", "S#34967", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0475", "f31621", "S#34968", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0475", "f31622", "S#34969", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0475", "f31623", "S#34970", 1, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31625() {
        $g3688$ = SubLFiles.defparameter("S#34971", module0018.$g658$.getDynamicValue());
        $g3689$ = SubLFiles.defparameter("S#34972", (SubLObject)TWO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31626() {
        module0340.f22938($ic0$);
        module0358.f23774((SubLObject)$ic1$, $ic0$);
        module0358.f23773((SubLObject)$ic2$, $ic0$);
        module0340.f22941((SubLObject)$ic5$, (SubLObject)$ic6$);
        module0340.f22941((SubLObject)$ic7$, (SubLObject)$ic8$);
        module0358.f23730((SubLObject)$ic9$, (SubLObject)$ic10$);
        module0340.f22941((SubLObject)$ic12$, (SubLObject)$ic13$);
        return (SubLObject)NIL;
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
        $g3688$ = null;
        $g3689$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("negationInverse"));
        $ic1$ = makeKeyword("POS");
        $ic2$ = makeKeyword("NEG");
        $ic3$ = ConsesLow.list((SubLObject)makeSymbol("S#19778", "CYC"), (SubLObject)makeSymbol("S#19779", "CYC"));
        $ic4$ = makeKeyword("NEGATIONPREDS");
        $ic5$ = makeKeyword("REMOVAL-NEGATIONINVERSE-CHECK");
        $ic6$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("negationInverse")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("negationInverse")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34971", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34967", "CYC") });
        $ic7$ = makeKeyword("REMOVAL-MAX-NEGATIONINVERSE");
        $ic8$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("negationInverse")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("OR"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("negationInverse")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("VARIABLE")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("negationInverse")), (SubLObject)makeKeyword("VARIABLE"), (SubLObject)makeKeyword("FORT"))), makeKeyword("COST"), makeSymbol("S#34968", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34969", "CYC") });
        $ic9$ = makeKeyword("MAX-NEGATION-INVERSE-POS");
        $ic10$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("negationInverse")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("OR"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("negationInverse")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("negationInverse")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("FORT"))), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic11$ = makeKeyword("MINIMIZE");
        $ic12$ = makeKeyword("REMOVAL-NOT-NEGATIONINVERSE-CHECK");
        $ic13$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("negationInverse")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("negationInverse")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34973", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34970", "CYC") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 99 ms
	
	Decompiled with Procyon 0.5.32.
*/