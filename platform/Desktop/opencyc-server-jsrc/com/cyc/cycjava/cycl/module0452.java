package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        SubLObject var4 = (SubLObject)NIL;
        final SubLObject var5 = module0018.$g696$.currentBinding(var3);
        try {
            module0018.$g696$.bind((SubLObject)NIL, var3);
            var4 = (SubLObject)makeBoolean(NIL != module0274.f18060(var1, var2, (SubLObject)$ic0$) || NIL != module0274.f18060(var1, var2, (SubLObject)$ic1$));
        }
        finally {
            module0018.$g696$.rebind(var5, var3);
        }
        return (SubLObject)makeBoolean(NIL == var4);
    }
    
    public static SubLObject f31043(final SubLObject var1, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        final SubLThread var7 = SubLProcess.currentSubLThread();
        if (NIL != f31042(var1, module0147.$g2095$.getDynamicValue(var7))) {
            module0347.f23330(module0191.f11990((SubLObject)$ic4$, (SubLObject)ConsesLow.list($ic5$, (SubLObject)ConsesLow.list($ic6$, var1)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31044(final SubLObject var7) {
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var8 = (SubLObject)NIL, var9 = (SubLObject)NIL, var9 = module0366.f24977(var7); NIL == var8 && NIL != var9; var8 = f31045(var10), var9 = var9.rest()) {
            var10 = var9.first();
        }
        return var8;
    }
    
    public static SubLObject f31046(final SubLObject var11) {
        return (SubLObject)makeBoolean(NIL != module0340.f22913(var11) && $ic2$ == module0340.f22825(var11));
    }
    
    public static SubLObject f31045(final SubLObject var11) {
        return (SubLObject)makeBoolean(NIL != module0376.f26656(var11) && NIL != f31046(module0373.f26181(var11)));
    }
    
    public static SubLObject f31047() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0452", "f31042", "S#34314", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0452", "f31043", "S#34315", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0452", "f31044", "S#29252", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0452", "f31046", "S#34316", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0452", "f31045", "S#34317", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31048() {
        $g3587$ = SubLFiles.deflexical("S#34318", module0018.$g661$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31049() {
        module0340.f22941((SubLObject)$ic2$, (SubLObject)$ic3$);
        return (SubLObject)NIL;
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
        $g3587$ = null;
        $ic0$ = ConsesLow.list((SubLObject)makeKeyword("WFF-MODE"), (SubLObject)makeKeyword("STRICT"));
        $ic1$ = ConsesLow.list((SubLObject)makeKeyword("WFF-MODE"), (SubLObject)makeKeyword("LENIENT"));
        $ic2$ = makeKeyword("REMOVAL-NON-WFF-CHECK-NEG");
        $ic3$ = ConsesLow.list(new SubLObject[] { makeKeyword("UNIVERSAL"), T, makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("REQUIRED-PATTERN"), makeKeyword("FULLY-BOUND"), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34318", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34315", "CYC"), makeKeyword("DOCUMENTATION"), makeString("Prove (#$not <fully-bound asent>)\nwhere the fully-bound asent is not well formed"), makeKeyword("EXAMPLE"), makeString("(#$not (#$biologicalFather #$Cyc #$Lenat))\nas (#$biologicalFather #$Cyc #$Lenat) is not well formed ") });
        $ic4$ = makeKeyword("ADMIT");
        $ic5$ = constant_handles_oc.f8479((SubLObject)makeString("not"));
        $ic6$ = constant_handles_oc.f8479((SubLObject)makeString("admittedSentence"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 69 ms
	
	Decompiled with Procyon 0.5.32.
*/