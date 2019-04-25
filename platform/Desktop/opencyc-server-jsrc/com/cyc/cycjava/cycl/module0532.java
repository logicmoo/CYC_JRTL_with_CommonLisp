package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0532 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0532";
    public static final String myFingerPrint = "769c1592c188b665e10966619c43883d1e4c2b3ccccf282c77f66f6f024f7c2c";
    public static SubLSymbol $g3904$;
    private static SubLSymbol $g3905$;
    public static SubLSymbol $g3906$;
    private static SubLSymbol $g3907$;
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLObject $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLInteger $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLString $ic17$;
    private static final SubLString $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLString $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLString $ic22$;
    
    public static SubLObject f33186() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g3905$.getDynamicValue(var1);
    }
    
    public static SubLObject f33187(final SubLObject var2) {
        return (SubLObject)makeBoolean(NIL != module0178.f11290(var2) && NIL != module0211.f13700(var2) && (module0217.f14221(var2, (SubLObject)TWO_INTEGER, $ic0$, (SubLObject)UNPROVIDED).isPositive() || module0217.f14318(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).isPositive() || NIL != ((NIL != f33186()) ? module0211.f13660(var2) : NIL)));
    }
    
    public static SubLObject f33188(final SubLObject var3, final SubLObject var2, final SubLObject var4, final SubLObject var5) {
        if (NIL != f33187(var2)) {
            final SubLObject var6 = Mapping.mapcar((SubLObject)$ic1$, module0373.f26258(var4));
            return f33189(var6, var2, var5, var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33189(final SubLObject var6, final SubLObject var2, final SubLObject var5, final SubLObject var3) {
        final SubLObject var7 = f33190(var6, var2);
        final SubLObject var8 = module0204.f13035(var7);
        SubLObject var9 = f33191(var3);
        SubLObject var10 = module0409.f28508(var8, var5, (SubLObject)NIL, var9);
        if (NIL != f33192(var10, var2)) {
            var9 = conses_high.remf(var9, (SubLObject)$ic2$);
            var10 = module0409.f28508(var8, var5, (SubLObject)NIL, var9);
        }
        return module0035.sublisp_boolean(var10);
    }
    
    public static SubLObject f33190(final SubLObject var6, final SubLObject var2) {
        return module0202.f12768($ic0$, module0202.f12720($ic3$, var6, (SubLObject)UNPROVIDED), var2);
    }
    
    public static SubLObject f33191(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return (SubLObject)ConsesLow.list(new SubLObject[] { $ic2$, var3, $ic4$, ONE_INTEGER, $ic5$, $g3906$.getDynamicValue(var4), $ic6$, $ic7$, $ic8$, $ic9$, $ic10$, $ic11$, $ic12$, $g3907$.getDynamicValue(var4), $ic13$, $ic14$, $ic15$, NIL });
    }
    
    public static SubLObject f33192(final SubLObject var10, final SubLObject var2) {
        SubLObject var12;
        final SubLObject var11 = var12 = Mapping.mapcar((SubLObject)$ic16$, var10);
        SubLObject var13 = (SubLObject)NIL;
        var13 = var12.first();
        while (NIL != var12) {
            if (NIL != f33193(var13, var2)) {
                return (SubLObject)T;
            }
            var12 = var12.rest();
            var13 = var12.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33193(final SubLObject var13, final SubLObject var2) {
        return module0004.f104(var2, var13, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f33194(final SubLObject var2, final SubLObject var14, final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        if (NIL != $g3904$.getDynamicValue(var16) && NIL != f33187(var2)) {
            SubLObject var17 = (SubLObject)NIL;
            SubLObject var18 = (SubLObject)NIL;
            SubLObject var19 = (SubLObject)NIL;
            var17 = module0178.f11350(var2);
            var18 = conses_high.nsublis(var14, var17, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var19 = conses_high.nsublis(var15, var18, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL == module0193.f12105(var19)) {
                Errors.cerror((SubLObject)$ic17$, (SubLObject)$ic18$, var2);
                return (SubLObject)NIL;
            }
            final SubLObject var20 = module0131.$g1534$.currentBinding(var16);
            try {
                module0131.$g1534$.bind((SubLObject)NIL, var16);
                if (NIL != f33189(var19, var2, module0147.$g2095$.getDynamicValue(var16), (SubLObject)NIL)) {
                    f33195(var19, var2);
                }
            }
            finally {
                module0131.$g1534$.rebind(var20, var16);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33196(final SubLObject var19, final SubLObject var2, final SubLObject var20, final SubLObject var21) {
        final SubLThread var22 = SubLProcess.currentSubLThread();
        SubLObject var23 = (SubLObject)NIL;
        try {
            var22.throwStack.push($ic19$);
            f33197(var19, var2, var20, var21);
        }
        catch (Throwable var24) {
            var23 = Errors.handleThrowable(var24, (SubLObject)$ic19$);
        }
        finally {
            var22.throwStack.pop();
        }
        return var23;
    }
    
    public static SubLObject f33197(final SubLObject var19, final SubLObject var2, final SubLObject var20, final SubLObject var21) {
        final SubLThread var22 = SubLProcess.currentSubLThread();
        if (NIL != $g3904$.getDynamicValue(var22) && NIL != f33187(var2)) {
            SubLObject var23 = (SubLObject)NIL;
            SubLObject var24 = (SubLObject)NIL;
            var23 = (var24 = module0178.f11350(var2));
            var24 = conses_high.nsublis(var20, var24, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var24 = conses_high.nsublis(var21, var24, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL == module0193.f12105(var24)) {
                Errors.cerror((SubLObject)$ic17$, (SubLObject)$ic20$, var2);
                return (SubLObject)NIL;
            }
            final SubLObject var25 = module0131.$g1534$.currentBinding(var22);
            try {
                module0131.$g1534$.bind((SubLObject)NIL, var22);
                if (NIL != f33189(var24, var2, var19, (SubLObject)NIL)) {
                    f33195(var24, var2);
                }
            }
            finally {
                module0131.$g1534$.rebind(var25, var22);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33195(final SubLObject var24, final SubLObject var2) {
        return module0352.f23589((SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)$ic22$, var24, var2));
    }
    
    public static SubLObject f33198() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0532", "f33186", "S#26000", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0532", "f33187", "S#16455", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0532", "f33188", "S#29940", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0532", "f33189", "S#36647", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0532", "f33190", "S#36648", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0532", "f33191", "S#36649", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0532", "f33192", "S#36650", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0532", "f33193", "S#36651", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0532", "f33194", "S#36652", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0532", "f33196", "S#36343", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0532", "f33197", "S#36653", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0532", "f33195", "S#36654", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33199() {
        $g3904$ = SubLFiles.defvar("S#36655", (SubLObject)T);
        $g3905$ = SubLFiles.defparameter("S#36656", (SubLObject)T);
        $g3906$ = SubLFiles.defvar("S#36657", (SubLObject)ONE_INTEGER);
        $g3907$ = SubLFiles.defparameter("S#36658", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33200() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f33198();
    }
    
    public void initializeVariables() {
        f33199();
    }
    
    public void runTopLevelForms() {
        f33200();
    }
    
    static {
        me = (SubLFile)new module0532();
        $g3904$ = null;
        $g3905$ = null;
        $g3906$ = null;
        $g3907$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("abnormal"));
        $ic1$ = makeSymbol("S#17993", "CYC");
        $ic2$ = makeKeyword("PROBLEM-STORE");
        $ic3$ = constant_handles_oc.f8479((SubLObject)makeString("TheList"));
        $ic4$ = makeKeyword("MAX-NUMBER");
        $ic5$ = makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $ic6$ = makeKeyword("RESULT-UNIQUENESS");
        $ic7$ = makeKeyword("BINDINGS");
        $ic8$ = makeKeyword("RETURN");
        $ic9$ = makeKeyword("BINDINGS-AND-SUPPORTS");
        $ic10$ = makeKeyword("ANSWER-LANGUAGE");
        $ic11$ = makeKeyword("HL");
        $ic12$ = makeKeyword("BROWSABLE?");
        $ic13$ = makeKeyword("MIN-RULE-UTILITY");
        $ic14$ = makeInteger(-100);
        $ic15$ = makeKeyword("ALLOW-ABNORMALITY-CHECKING?");
        $ic16$ = makeSymbol("SECOND");
        $ic17$ = makeString("Assume it isn't abnormal");
        $ic18$ = makeString("Abnormality checker doesn't have all node-variables for ~S");
        $ic19$ = makeKeyword("INFERENCE-REJECTED");
        $ic20$ = makeString("Abnormality checker doesn't have all bindings for ~S");
        $ic21$ = makeKeyword("ABNORMAL");
        $ic22$ = makeString("~S are exceptions to ~S");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 108 ms
	
	Decompiled with Procyon 0.5.32.
*/