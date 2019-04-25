package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0438 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0438";
    public static final String myFingerPrint = "a5e33da004b66a5fa4c973f6ed1fe8bb1d3d981ce1d9638e5caacc339aa9a8af";
    private static SubLSymbol $g3540$;
    private static SubLSymbol $g3541$;
    private static SubLSymbol $g3542$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLList $ic8$;
    private static final SubLList $ic9$;
    
    public static SubLObject f30664(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLObject var3 = (SubLObject)((NIL != var2) ? $ic0$ : $ic1$);
        return module0191.f11990(var3, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f30665(final SubLObject var4, SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLThread var6 = SubLProcess.currentSubLThread();
        final SubLObject var7 = module0205.f13333(var4);
        final SubLObject var8 = module0147.f9496();
        final SubLObject var9 = module0147.f9558(var8);
        SubLObject var10 = (SubLObject)NIL;
        final SubLObject var11 = module0147.f9540(var9);
        final SubLObject var12 = module0147.$g2095$.currentBinding(var6);
        final SubLObject var13 = module0147.$g2094$.currentBinding(var6);
        final SubLObject var14 = module0147.$g2096$.currentBinding(var6);
        try {
            module0147.$g2095$.bind(module0147.f9545(var11), var6);
            module0147.$g2094$.bind(module0147.f9546(var11), var6);
            module0147.$g2096$.bind(module0147.f9549(var11), var6);
            var10 = module0349.f23396(var7);
        }
        finally {
            module0147.$g2096$.rebind(var14, var6);
            module0147.$g2094$.rebind(var13, var6);
            module0147.$g2095$.rebind(var12, var6);
        }
        return var10;
    }
    
    public static SubLObject f30666(final SubLObject var4, SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        return module0193.f12105(var4);
    }
    
    public static SubLObject f30667(final SubLObject var4, SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLThread var6 = SubLProcess.currentSubLThread();
        var6.resetMultipleValues();
        final SubLObject var7 = module0229.f15243(var4);
        final SubLObject var8 = var6.secondMultipleValue();
        final SubLObject var9 = var6.thirdMultipleValue();
        var6.resetMultipleValues();
        if (NIL != var8 && NIL != var7) {
            final SubLObject var10 = module0351.f23577(var4);
            final SubLObject var11 = f30664(var10, var9);
            module0347.f23330(var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30668(final SubLObject var4, SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        return module0349.f23396(module0205.f13333(var4));
    }
    
    public static SubLObject f30669(final SubLObject var4, SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        return module0193.f12105(var4);
    }
    
    public static SubLObject f30670(final SubLObject var4, SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLThread var6 = SubLProcess.currentSubLThread();
        var6.resetMultipleValues();
        final SubLObject var7 = module0229.f15243(var4);
        final SubLObject var8 = var6.secondMultipleValue();
        final SubLObject var9 = var6.thirdMultipleValue();
        var6.resetMultipleValues();
        if (NIL != var8 && NIL == var7) {
            final SubLObject var10 = module0351.f23577(var4);
            final SubLObject var11 = f30664(module0205.f13338(var10), var9);
            module0347.f23330(var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30671() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0438", "f30664", "S#17985", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0438", "f30665", "S#33914", 1, 1, false);
        new $f30665$UnaryFunction();
        new $f30665$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0438", "f30666", "S#33915", 1, 1, false);
        new $f30666$UnaryFunction();
        new $f30666$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0438", "f30667", "S#29817", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0438", "f30668", "S#33916", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0438", "f30669", "S#33917", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0438", "f30670", "S#33918", 1, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30672() {
        $g3540$ = SubLFiles.defparameter("S#33919", (SubLObject)ONE_INTEGER);
        $g3541$ = SubLFiles.deflexical("S#33920", (SubLObject)$ic8$);
        $g3542$ = SubLFiles.deflexical("S#33921", (SubLObject)$ic9$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30673() {
        module0340.f22941((SubLObject)$ic2$, (SubLObject)$ic3$);
        module0340.f22941((SubLObject)$ic4$, (SubLObject)$ic5$);
        module0358.f23730((SubLObject)$ic6$, (SubLObject)$ic7$);
        SubLObject var21 = $g3541$.getGlobalValue();
        SubLObject var22 = (SubLObject)NIL;
        var22 = var21.first();
        while (NIL != var21) {
            module0340.f22938(var22);
            SubLObject var21_22 = $g3542$.getGlobalValue();
            SubLObject var23 = (SubLObject)NIL;
            var23 = var21_22.first();
            while (NIL != var21_22) {
                module0340.f22944(var22, var23);
                var21_22 = var21_22.rest();
                var23 = var21_22.first();
            }
            var21 = var21.rest();
            var22 = var21.first();
        }
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f30671();
    }
    
    public void initializeVariables() {
        f30672();
    }
    
    public void runTopLevelForms() {
        f30673();
    }
    
    static {
        me = (SubLFile)new module0438();
        $g3540$ = null;
        $g3541$ = null;
        $g3542$ = null;
        $ic0$ = makeKeyword("CODE");
        $ic1$ = makeKeyword("EVAL");
        $ic2$ = makeKeyword("REMOVAL-EVAL");
        $ic3$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("ANYTHING")), makeKeyword("EXCLUSIVE"), makeSymbol("S#33914", "CYC"), makeKeyword("REQUIRED"), makeSymbol("S#33915", "CYC"), makeKeyword("COST-EXPRESSION"), makeSymbol("S#33919", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#29817", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(<evaluatable predicate> . <fully bound>)\nusing (#$evaluationDefn <evaluatable predicate> <symbol>)\nand calling the SubL form (<symbol> . <fully bound>)") });
        $ic4$ = makeKeyword("REMOVAL-NOT-EVAL");
        $ic5$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("ANYTHING")), makeKeyword("EXCLUSIVE"), makeSymbol("S#33916", "CYC"), makeKeyword("REQUIRED"), makeSymbol("S#33917", "CYC"), makeKeyword("COST-EXPRESSION"), makeSymbol("S#33919", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#33918", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (<evaluatable predicate> . <fully bound>))\nusing (#$evaluationDefn <evaluatable predicate> <symbol>)\nand calling the SubL form (<symbol> . <fully bound>)") });
        $ic6$ = makeKeyword("EVALUATABLE-PREDICATE-DOOMED-UNLESS-ALL-ARGS-BOUND");
        $ic7$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)ConsesLow.cons((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#26078", "CYC")), (SubLObject)makeKeyword("ANYTHING"))), (SubLObject)makeKeyword("PREFERENCE"), (SubLObject)makeSymbol("S#26438", "CYC"));
        $ic8$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("greaterThan")), constant_handles_oc.f8479((SubLObject)makeString("greaterThanOrEqualTo")), constant_handles_oc.f8479((SubLObject)makeString("quantitySubsumes")));
        $ic9$ = ConsesLow.list((SubLObject)makeKeyword("REMOVAL-EVAL"), (SubLObject)makeKeyword("REMOVAL-NOT-EVAL"));
    }
    
    public static final class $f30665$UnaryFunction extends UnaryFunction
    {
        public $f30665$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#33914"));
        }
        
        public SubLObject processItem(final SubLObject var15) {
            return f30665(var15, (SubLObject)$f30665$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f30665$BinaryFunction extends BinaryFunction
    {
        public $f30665$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#33914"));
        }
        
        public SubLObject processItem(final SubLObject var15, final SubLObject var16) {
            return f30665(var15, var16);
        }
    }
    
    public static final class $f30666$UnaryFunction extends UnaryFunction
    {
        public $f30666$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#33915"));
        }
        
        public SubLObject processItem(final SubLObject var15) {
            return f30666(var15, (SubLObject)$f30666$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f30666$BinaryFunction extends BinaryFunction
    {
        public $f30666$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#33915"));
        }
        
        public SubLObject processItem(final SubLObject var15, final SubLObject var16) {
            return f30666(var15, var16);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 85 ms
	
	Decompiled with Procyon 0.5.32.
*/