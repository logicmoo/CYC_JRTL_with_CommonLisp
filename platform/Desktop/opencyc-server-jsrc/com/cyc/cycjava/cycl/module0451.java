package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0451 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0451";
    public static final String myFingerPrint = "bbaabb1575ef009a4ad61622bbb00d7257aa9a47b0d551a09d928e467b3dc122";
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLList $ic4$;
    
    public static SubLObject f31035() {
        final SubLObject var1 = module0373.f26109();
        if (module0451.NIL != var1) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0451.NIL != module0363.f24630(var1, (SubLObject)module0451.$ic0$) && module0451.NIL == module0363.f24631(var1, (SubLObject)module0451.$ic0$));
        }
        return (SubLObject)module0451.NIL;
    }
    
    public static SubLObject f31036(final SubLObject var2, SubLObject var3) {
        if (var3 == module0451.UNPROVIDED) {
            var3 = (SubLObject)module0451.NIL;
        }
        final SubLObject var4 = module0363.f24638(module0373.f26109());
        return module0360.f23937(var4);
    }
    
    public static SubLObject f31037(final SubLObject var2, SubLObject var3) {
        if (var3 == module0451.UNPROVIDED) {
            var3 = (SubLObject)module0451.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0451.NIL != f31035() && module0451.NIL != module0350.f23546(var2, module0147.f9551()));
    }
    
    public static SubLObject f31038(final SubLObject var2, SubLObject var3) {
        if (var3 == module0451.UNPROVIDED) {
            var3 = (SubLObject)module0451.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0451.NIL != f31035() && module0451.NIL != module0350.f23545(var2, module0147.f9551()));
    }
    
    public static SubLObject f31039() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0451", "f31035", "S#34312", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0451", "f31036", "S#34313", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0451", "f31037", "S#29809", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0451", "f31038", "S#29808", 1, 1, false);
        return (SubLObject)module0451.NIL;
    }
    
    public static SubLObject f31040() {
        return (SubLObject)module0451.NIL;
    }
    
    public static SubLObject f31041() {
        module0340.f22972((SubLObject)module0451.$ic1$, (SubLObject)module0451.$ic2$);
        module0340.f22972((SubLObject)module0451.$ic3$, (SubLObject)module0451.$ic4$);
        return (SubLObject)module0451.NIL;
    }
    
    public void declareFunctions() {
        f31039();
    }
    
    public void initializeVariables() {
        f31040();
    }
    
    public void runTopLevelForms() {
        f31041();
    }
    
    static {
        me = (SubLFile)new module0451();
        $ic0$ = SubLObjectFactory.makeKeyword("TACTICAL");
        $ic1$ = SubLObjectFactory.makeKeyword("META-REMOVAL-COMPLETELY-ENUMERABLE-POS");
        $ic2$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("S#29809", "CYC"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#34313", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<predicate> . <not fully bound>))\n    via indirection, by execution of other tactics on the problem\n    and completeness meta-knowledge about the sentence."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$borderingCountries #$Canada ?WHAT)\n    given other tactics to solve this and\n    (#$completeExtentEnumerable #$borderingCountries)") });
        $ic3$ = SubLObjectFactory.makeKeyword("META-REMOVAL-COMPLETELY-DECIDABLE-POS");
        $ic4$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("S#29808", "CYC"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#34313", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<predicate> . <fully bound>))\n    via indirection, by execution of other tactics on the problem\n    and completeness meta-knowledge about the sentence."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$borderingCountries #$Canada #$Mexico)\n    given other tactics to solve this and\n    (#$completeExtentDecidable #$borderingCountries)") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0451.class
	Total time: 54 ms
	
	Decompiled with Procyon 0.5.32.
*/