package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0449 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0449";
    public static final String myFingerPrint = "e9e37d94e86f18fc1a4fbb9b47417f403e5c2c7e4ed9eea66be6e604a9db4414";
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    
    public static SubLObject f31002(SubLObject var1) {
        if (var1 == module0449.UNPROVIDED) {
            var1 = (SubLObject)module0449.NIL;
        }
        final SubLObject var2 = module0373.f26113();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0449.NIL != var2 && module0449.NIL != module0361.f24164(var2));
    }
    
    public static SubLObject f31003(final SubLObject var4) {
        return module0377.f26853(var4, module0147.f9496());
    }
    
    public static SubLObject f31004(final SubLObject var4, SubLObject var5) {
        if (var5 == module0449.UNPROVIDED) {
            var5 = (SubLObject)module0449.NIL;
        }
        final SubLThread var6 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0449.NIL == module0377.f26768(var4, module0147.$g2095$.getDynamicValue(var6)));
    }
    
    public static SubLObject f31005(final SubLObject var4, SubLObject var5) {
        if (var5 == module0449.UNPROVIDED) {
            var5 = (SubLObject)module0449.NIL;
        }
        final SubLThread var6 = SubLProcess.currentSubLThread();
        return module0349.f23463(var4, module0147.$g2095$.getDynamicValue(var6));
    }
    
    public static SubLObject f31006() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0449", "f31002", "S#34281", 0, 1, false);
        new $f31002$ZeroArityFunction();
        new $f31002$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0449", "f31003", "S#34283", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0449", "f31004", "S#34284", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0449", "f31005", "S#34282", 1, 1, false);
        new $f31005$UnaryFunction();
        new $f31005$BinaryFunction();
        return (SubLObject)module0449.NIL;
    }
    
    public static SubLObject f31007() {
        return (SubLObject)module0449.NIL;
    }
    
    public static SubLObject f31008() {
        module0358.f23730((SubLObject)module0449.$ic0$, (SubLObject)module0449.$ic1$);
        module0358.f23730((SubLObject)module0449.$ic2$, (SubLObject)module0449.$ic3$);
        module0340.f22941((SubLObject)module0449.$ic4$, (SubLObject)module0449.$ic5$);
        module0012.f419((SubLObject)module0449.$ic6$);
        module0012.f419((SubLObject)module0449.$ic7$);
        return (SubLObject)module0449.NIL;
    }
    
    public void declareFunctions() {
        f31006();
    }
    
    public void initializeVariables() {
        f31007();
    }
    
    public void runTopLevelForms() {
        f31008();
    }
    
    static {
        me = (SubLFile)new module0449();
        $ic0$ = SubLObjectFactory.makeKeyword("BACKCHAIN-REQUIRED-POS");
        $ic1$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#34282", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("PREFERRED"), (SubLObject)SubLObjectFactory.makeKeyword("SUPPLANTS"), (SubLObject)SubLObjectFactory.makeKeyword("ALL"));
        $ic2$ = SubLObjectFactory.makeKeyword("BACKCHAIN-FORBIDDEN-UNLESS-ARG-CHOSEN-DELAY");
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#34281", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#34282", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#34283", "CYC"))), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("DISALLOWED"));
        $ic4$ = SubLObjectFactory.makeKeyword("REMOVAL-BACKCHAIN-REQUIRED-PRUNE");
        $ic5$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#34282", "CYC")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("S#34284", "CYC"), SubLObjectFactory.makeKeyword("EXCLUSIVE"), SubLObjectFactory.makeSymbol("TRUE"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), module0449.ZERO_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<fort> . <whatever>)\n    in all cases where <fort> is #$backchainRequired should immediately fail."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$sentenceTruth (#$isa ?X #$Integer))") });
        $ic6$ = SubLObjectFactory.makeSymbol("S#34284", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#34282", "CYC");
    }
    
    public static final class $f31002$ZeroArityFunction extends ZeroArityFunction
    {
        public $f31002$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34281"));
        }
        
        public SubLObject processItem() {
            return module0449.f31002((SubLObject)$f31002$ZeroArityFunction.UNPROVIDED);
        }
    }
    
    public static final class $f31002$UnaryFunction extends UnaryFunction
    {
        public $f31002$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34281"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0449.f31002(var3);
        }
    }
    
    public static final class $f31005$UnaryFunction extends UnaryFunction
    {
        public $f31005$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34282"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0449.f31005(var3, (SubLObject)$f31005$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f31005$BinaryFunction extends BinaryFunction
    {
        public $f31005$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34282"));
        }
        
        public SubLObject processItem(final SubLObject var3, final SubLObject var7) {
            return module0449.f31005(var3, var7);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0449.class
	Total time: 83 ms
	
	Decompiled with Procyon 0.5.32.
*/