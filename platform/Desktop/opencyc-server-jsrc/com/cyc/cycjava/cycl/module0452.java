package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0452 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0452";
    public static final String myFingerPrint = "a222370274558e9f7c472bde77a238b30c3fbf9685fa2fd4a495c5feb86106ee";
    private static SubLSymbol $g3587$;
    private static final SubLList $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLObject $ic5$;
    private static final SubLObject $ic6$;
    
    public static SubLObject f31042(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)module0452.NIL;
        final SubLObject var5 = module0018.$g696$.currentBinding(var3);
        try {
            module0018.$g696$.bind((SubLObject)module0452.NIL, var3);
            var4 = (SubLObject)SubLObjectFactory.makeBoolean(module0452.NIL != module0274.f18060(var1, var2, (SubLObject)module0452.$ic0$) || module0452.NIL != module0274.f18060(var1, var2, (SubLObject)module0452.$ic1$));
        }
        finally {
            module0018.$g696$.rebind(var5, var3);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0452.NIL == var4);
    }
    
    public static SubLObject f31043(final SubLObject var1, SubLObject var6) {
        if (var6 == module0452.UNPROVIDED) {
            var6 = (SubLObject)module0452.NIL;
        }
        final SubLThread var7 = SubLProcess.currentSubLThread();
        if (module0452.NIL != f31042(var1, module0147.$g2095$.getDynamicValue(var7))) {
            module0347.f23330(module0191.f11990((SubLObject)module0452.$ic4$, (SubLObject)ConsesLow.list(module0452.$ic5$, (SubLObject)ConsesLow.list(module0452.$ic6$, var1)), (SubLObject)module0452.UNPROVIDED, (SubLObject)module0452.UNPROVIDED), (SubLObject)module0452.UNPROVIDED, (SubLObject)module0452.UNPROVIDED);
        }
        return (SubLObject)module0452.NIL;
    }
    
    public static SubLObject f31044(final SubLObject var7) {
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var8 = (SubLObject)module0452.NIL, var9 = (SubLObject)module0452.NIL, var9 = module0366.f24977(var7); module0452.NIL == var8 && module0452.NIL != var9; var8 = f31045(var10), var9 = var9.rest()) {
            var10 = var9.first();
        }
        return var8;
    }
    
    public static SubLObject f31046(final SubLObject var11) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0452.NIL != module0340.f22913(var11) && module0452.$ic2$ == module0340.f22825(var11));
    }
    
    public static SubLObject f31045(final SubLObject var11) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0452.NIL != module0376.f26656(var11) && module0452.NIL != f31046(module0373.f26181(var11)));
    }
    
    public static SubLObject f31047() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0452", "f31042", "S#34314", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0452", "f31043", "S#34315", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0452", "f31044", "S#29252", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0452", "f31046", "S#34316", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0452", "f31045", "S#34317", 1, 0, false);
        return (SubLObject)module0452.NIL;
    }
    
    public static SubLObject f31048() {
        module0452.$g3587$ = SubLFiles.deflexical("S#34318", module0018.$g661$.getGlobalValue());
        return (SubLObject)module0452.NIL;
    }
    
    public static SubLObject f31049() {
        module0340.f22941((SubLObject)module0452.$ic2$, (SubLObject)module0452.$ic3$);
        return (SubLObject)module0452.NIL;
    }
    
    public void declareFunctions() {
        f31047();
    }
    
    public void initializeVariables() {
        f31048();
    }
    
    public void runTopLevelForms() {
        f31049();
    }
    
    static {
        me = (SubLFile)new module0452();
        module0452.$g3587$ = null;
        $ic0$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("WFF-MODE"), (SubLObject)SubLObjectFactory.makeKeyword("STRICT"));
        $ic1$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("WFF-MODE"), (SubLObject)SubLObjectFactory.makeKeyword("LENIENT"));
        $ic2$ = SubLObjectFactory.makeKeyword("REMOVAL-NON-WFF-CHECK-NEG");
        $ic3$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("UNIVERSAL"), module0452.T, SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), SubLObjectFactory.makeKeyword("FULLY-BOUND"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#34318", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34315", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("Prove (#$not <fully-bound asent>)\nwhere the fully-bound asent is not well formed"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$biologicalFather #$Cyc #$Lenat))\nas (#$biologicalFather #$Cyc #$Lenat) is not well formed ") });
        $ic4$ = SubLObjectFactory.makeKeyword("ADMIT");
        $ic5$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("not"));
        $ic6$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("admittedSentence"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0452.class
	Total time: 69 ms
	
	Decompiled with Procyon 0.5.32.
*/