package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0136 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0136";
    public static final String myFingerPrint = "1c2887e485e89adabb89fd63bc42617b4d93e6ab91163cf7d22eae5da609a56d";
    public static SubLSymbol $g1590$;
    public static SubLSymbol $g1591$;
    public static SubLSymbol $g1592$;
    public static SubLSymbol $g1593$;
    public static SubLSymbol $g1594$;
    public static SubLSymbol $g1595$;
    public static SubLSymbol $g1596$;
    public static SubLSymbol $g1597$;
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLString $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLString $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLList $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLList $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLList $ic29$;
    private static final SubLList $ic30$;
    
    public static SubLObject f8864() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0136.NIL != module0136.$g1590$.getDynamicValue(var1) || module0136.NIL == f8865());
    }
    
    public static SubLObject f8866(final SubLObject var2, final SubLObject var3) {
        final SubLObject var4 = var2.rest();
        final SubLObject var6;
        final SubLObject var5 = var6 = var4;
        return (SubLObject)ConsesLow.listS((SubLObject)module0136.$ic0$, (SubLObject)module0136.$ic1$, ConsesLow.append(var6, (SubLObject)module0136.NIL));
    }
    
    public static SubLObject f8867(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        SubLObject var6 = (SubLObject)module0136.NIL;
        SubLObject var7 = (SubLObject)module0136.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0136.$ic3$);
        var6 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0136.$ic3$);
        var7 = var5.first();
        var5 = var5.rest();
        final SubLObject var8 = (SubLObject)(var5.isCons() ? var5.first() : module0136.ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var5, var4, (SubLObject)module0136.$ic3$);
        var5 = var5.rest();
        if (module0136.NIL == var5) {
            return (SubLObject)ConsesLow.list((SubLObject)module0136.$ic4$, (SubLObject)module0136.$ic5$, (SubLObject)ConsesLow.list((SubLObject)module0136.$ic6$, (SubLObject)ConsesLow.list(var7, var6), (SubLObject)ConsesLow.list((SubLObject)module0136.$ic7$, (SubLObject)module0136.$ic8$, (SubLObject)ConsesLow.list((SubLObject)module0136.$ic2$, (SubLObject)ConsesLow.list((SubLObject)module0136.$ic9$, var8, (SubLObject)module0136.$ic10$, var6, (SubLObject)ConsesLow.list((SubLObject)module0136.$ic11$, var7))), (SubLObject)ConsesLow.list((SubLObject)module0136.$ic12$, (SubLObject)ConsesLow.list((SubLObject)module0136.$ic13$, var8, (SubLObject)module0136.$ic14$, (SubLObject)module0136.$ic10$, var6, (SubLObject)ConsesLow.list((SubLObject)module0136.$ic11$, var7))), (SubLObject)ConsesLow.list((SubLObject)module0136.$ic15$, (SubLObject)ConsesLow.list((SubLObject)module0136.$ic16$, (SubLObject)module0136.$ic10$, var6, (SubLObject)ConsesLow.list((SubLObject)module0136.$ic11$, var7))), (SubLObject)ConsesLow.list((SubLObject)module0136.$ic17$, (SubLObject)module0136.$ic18$, (SubLObject)ConsesLow.list((SubLObject)module0136.$ic19$, (SubLObject)module0136.$ic14$, (SubLObject)module0136.$ic10$, var6, (SubLObject)ConsesLow.list((SubLObject)module0136.$ic11$, var7))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)module0136.$ic3$);
        return (SubLObject)module0136.NIL;
    }
    
    public static SubLObject f8868(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        SubLObject var6 = (SubLObject)module0136.NIL;
        SubLObject var7 = (SubLObject)module0136.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0136.$ic3$);
        var6 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0136.$ic3$);
        var7 = var5.first();
        var5 = var5.rest();
        final SubLObject var8 = (SubLObject)(var5.isCons() ? var5.first() : module0136.ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var5, var4, (SubLObject)module0136.$ic3$);
        var5 = var5.rest();
        if (module0136.NIL == var5) {
            return (SubLObject)ConsesLow.list((SubLObject)module0136.$ic4$, var6, (SubLObject)ConsesLow.list((SubLObject)module0136.$ic20$, var6, var7, var8));
        }
        cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)module0136.$ic3$);
        return (SubLObject)module0136.NIL;
    }
    
    public static SubLObject f8869(final SubLObject var11, final SubLObject var14, SubLObject var15, SubLObject var16, SubLObject var17, SubLObject var18, SubLObject var19) {
        if (var15 == module0136.UNPROVIDED) {
            var15 = (SubLObject)module0136.NIL;
        }
        if (var16 == module0136.UNPROVIDED) {
            var16 = (SubLObject)module0136.NIL;
        }
        if (var17 == module0136.UNPROVIDED) {
            var17 = (SubLObject)module0136.NIL;
        }
        if (var18 == module0136.UNPROVIDED) {
            var18 = (SubLObject)module0136.NIL;
        }
        if (var19 == module0136.UNPROVIDED) {
            var19 = (SubLObject)module0136.NIL;
        }
        final SubLThread var20 = SubLProcess.currentSubLThread();
        assert module0136.NIL != Types.integerp(var11) : var11;
        assert module0136.NIL != Types.stringp(var14) : var14;
        if (module0136.$g1592$.getDynamicValue(var20).numGE(var11)) {
            PrintLow.format((SubLObject)module0136.T, var14, new SubLObject[] { var15, var16, var17, var18, var19 });
            return (SubLObject)module0136.NIL;
        }
        return (SubLObject)module0136.NIL;
    }
    
    public static SubLObject f8870(final SubLObject var11, final SubLObject var14, SubLObject var15, SubLObject var16, SubLObject var17, SubLObject var18, SubLObject var19) {
        if (var15 == module0136.UNPROVIDED) {
            var15 = (SubLObject)module0136.NIL;
        }
        if (var16 == module0136.UNPROVIDED) {
            var16 = (SubLObject)module0136.NIL;
        }
        if (var17 == module0136.UNPROVIDED) {
            var17 = (SubLObject)module0136.NIL;
        }
        if (var18 == module0136.UNPROVIDED) {
            var18 = (SubLObject)module0136.NIL;
        }
        if (var19 == module0136.UNPROVIDED) {
            var19 = (SubLObject)module0136.NIL;
        }
        final SubLThread var20 = SubLProcess.currentSubLThread();
        assert module0136.NIL != Types.integerp(var11) : var11;
        assert module0136.NIL != Types.stringp(var14) : var14;
        if (module0136.$g1592$.getDynamicValue(var20).numGE(var11)) {
            Errors.cerror((SubLObject)module0136.$ic14$, var14, new SubLObject[] { var15, var16, var17, var18, var19 });
        }
        else if (Numbers.add((SubLObject)module0136.TWO_INTEGER, module0136.$g1592$.getDynamicValue(var20)).numGE(var11)) {
            Errors.warn(var14, new SubLObject[] { var15, var16, var17, var18, var19 });
        }
        return (SubLObject)module0136.NIL;
    }
    
    public static SubLObject f8871(final SubLObject var11, final SubLObject var20, final SubLObject var14, SubLObject var15, SubLObject var16, SubLObject var17, SubLObject var18, SubLObject var19) {
        if (var15 == module0136.UNPROVIDED) {
            var15 = (SubLObject)module0136.NIL;
        }
        if (var16 == module0136.UNPROVIDED) {
            var16 = (SubLObject)module0136.NIL;
        }
        if (var17 == module0136.UNPROVIDED) {
            var17 = (SubLObject)module0136.NIL;
        }
        if (var18 == module0136.UNPROVIDED) {
            var18 = (SubLObject)module0136.NIL;
        }
        if (var19 == module0136.UNPROVIDED) {
            var19 = (SubLObject)module0136.NIL;
        }
        final SubLThread var21 = SubLProcess.currentSubLThread();
        assert module0136.NIL != Types.integerp(var11) : var11;
        assert module0136.NIL != Types.stringp(var20) : var20;
        assert module0136.NIL != Types.stringp(var14) : var14;
        if (module0136.$g1592$.getDynamicValue(var21).numGE(var11)) {
            Errors.cerror(var20, var14, new SubLObject[] { var15, var16, var17, var18, var19 });
        }
        else if (Numbers.add((SubLObject)module0136.TWO_INTEGER, module0136.$g1592$.getDynamicValue(var21)).numGE(var11)) {
            Errors.warn(var14, new SubLObject[] { var15, var16, var17, var18, var19 });
        }
        return (SubLObject)module0136.NIL;
    }
    
    public static SubLObject f8872(final SubLObject var11, final SubLObject var14, SubLObject var15, SubLObject var16, SubLObject var17, SubLObject var18, SubLObject var19) {
        if (var15 == module0136.UNPROVIDED) {
            var15 = (SubLObject)module0136.NIL;
        }
        if (var16 == module0136.UNPROVIDED) {
            var16 = (SubLObject)module0136.NIL;
        }
        if (var17 == module0136.UNPROVIDED) {
            var17 = (SubLObject)module0136.NIL;
        }
        if (var18 == module0136.UNPROVIDED) {
            var18 = (SubLObject)module0136.NIL;
        }
        if (var19 == module0136.UNPROVIDED) {
            var19 = (SubLObject)module0136.NIL;
        }
        final SubLThread var20 = SubLProcess.currentSubLThread();
        assert module0136.NIL != Types.integerp(var11) : var11;
        assert module0136.NIL != Types.stringp(var14) : var14;
        if (module0136.$g1592$.getDynamicValue(var20).numGE(var11)) {
            Functions.apply((SubLObject)module0136.$ic16$, var14, new SubLObject[] { var15, var16, var17, var18, var19 });
            return (SubLObject)module0136.NIL;
        }
        return (SubLObject)module0136.NIL;
    }
    
    public static SubLObject f8865() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0136.NIL != Types.$suspend_type_checkingP$.getDynamicValue(var1) || module0136.NIL != module0110.$g1374$.getDynamicValue(var1) || module0136.NIL != module0123.f8349() || module0136.NIL != module0018.$g697$.getDynamicValue(var1));
    }
    
    public static SubLObject f8873(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        SubLObject var6 = (SubLObject)module0136.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0136.$ic23$);
        var6 = var5.first();
        final SubLObject var7;
        var5 = (var7 = var5.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0136.$ic4$, (SubLObject)ConsesLow.list((SubLObject)module0136.$ic24$, (SubLObject)module0136.$ic25$, var6), ConsesLow.append(var7, (SubLObject)module0136.NIL));
    }
    
    public static SubLObject f8874(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        SubLObject var6 = (SubLObject)module0136.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0136.$ic23$);
        var6 = var5.first();
        final SubLObject var7;
        var5 = (var7 = var5.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0136.$ic4$, (SubLObject)ConsesLow.list((SubLObject)module0136.$ic24$, (SubLObject)module0136.$ic26$, var6), ConsesLow.append(var7, (SubLObject)module0136.NIL));
    }
    
    public static SubLObject f8875(final SubLObject var2, final SubLObject var3) {
        final SubLObject var4 = var2.rest();
        final SubLObject var6;
        final SubLObject var5 = var6 = var4;
        return (SubLObject)ConsesLow.listS((SubLObject)module0136.$ic4$, (SubLObject)module0136.$ic27$, ConsesLow.append(var6, (SubLObject)module0136.NIL));
    }
    
    public static SubLObject f8876(final SubLObject var2, final SubLObject var3) {
        final SubLObject var4 = var2.rest();
        final SubLObject var6;
        final SubLObject var5 = var6 = var4;
        return (SubLObject)ConsesLow.listS((SubLObject)module0136.$ic4$, (SubLObject)module0136.$ic28$, ConsesLow.append(var6, (SubLObject)module0136.NIL));
    }
    
    public static SubLObject f8877() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0136.NIL == module0136.$g1597$.getDynamicValue(var1) && module0136.NIL == module0141.$g1598$.getDynamicValue(var1) && module0136.NIL != module0268.f17599());
    }
    
    public static SubLObject f8878(final SubLObject var2, final SubLObject var3) {
        final SubLObject var4 = var2.rest();
        final SubLObject var6;
        final SubLObject var5 = var6 = var4;
        return (SubLObject)ConsesLow.listS((SubLObject)module0136.$ic0$, (SubLObject)module0136.$ic29$, ConsesLow.append(var6, (SubLObject)module0136.NIL));
    }
    
    public static SubLObject f8879(final SubLObject var2, final SubLObject var3) {
        final SubLObject var4 = var2.rest();
        final SubLObject var6;
        final SubLObject var5 = var6 = var4;
        return (SubLObject)ConsesLow.listS((SubLObject)module0136.$ic0$, (SubLObject)module0136.$ic30$, ConsesLow.append(var6, (SubLObject)module0136.NIL));
    }
    
    public static SubLObject f8880() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0136", "f8864", "S#11075", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0136", "f8866", "S#11076");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0136", "f8867", "S#11077");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0136", "f8868", "S#11078");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0136", "f8869", "S#11079", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0136", "f8870", "S#11080", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0136", "f8871", "S#11081", 3, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0136", "f8872", "S#11082", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0136", "f8865", "S#11083", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0136", "f8873", "S#11084");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0136", "f8874", "S#11085");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0136", "f8875", "S#11086");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0136", "f8876", "S#11087");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0136", "f8877", "S#11088", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0136", "f8878", "WITHOUT-SBHL-CACHES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0136", "f8879", "S#11089");
        return (SubLObject)module0136.NIL;
    }
    
    public static SubLObject f8881() {
        module0136.$g1590$ = SubLFiles.defparameter("S#11090", (SubLObject)module0136.T);
        module0136.$g1591$ = SubLFiles.defparameter("S#11091", (SubLObject)module0136.$ic2$);
        module0136.$g1592$ = SubLFiles.defparameter("S#11092", (SubLObject)module0136.ONE_INTEGER);
        module0136.$g1593$ = SubLFiles.defparameter("S#11093", (SubLObject)module0136.THREE_INTEGER);
        module0136.$g1594$ = SubLFiles.defparameter("S#11094", (SubLObject)module0136.NIL);
        module0136.$g1595$ = SubLFiles.defparameter("S#11095", (SubLObject)module0136.NIL);
        module0136.$g1596$ = SubLFiles.defparameter("S#9975", (SubLObject)module0136.NIL);
        module0136.$g1597$ = SubLFiles.defparameter("S#11096", (SubLObject)module0136.NIL);
        return (SubLObject)module0136.NIL;
    }
    
    public static SubLObject f8882() {
        return (SubLObject)module0136.NIL;
    }
    
    public void declareFunctions() {
        f8880();
    }
    
    public void initializeVariables() {
        f8881();
    }
    
    public void runTopLevelForms() {
        f8882();
    }
    
    static {
        me = (SubLFile)new module0136();
        module0136.$g1590$ = null;
        module0136.$g1591$ = null;
        module0136.$g1592$ = null;
        module0136.$g1593$ = null;
        module0136.$g1594$ = null;
        module0136.$g1595$ = null;
        module0136.$g1596$ = null;
        module0136.$g1597$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("CLET");
        $ic1$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11090", "CYC"), (SubLObject)module0136.NIL));
        $ic2$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#154", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11097", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#696", "CYC"), (SubLObject)module0136.ONE_INTEGER));
        $ic4$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11075", "CYC"));
        $ic6$ = SubLObjectFactory.makeSymbol("PUNLESS");
        $ic7$ = SubLObjectFactory.makeSymbol("PCASE");
        $ic8$ = SubLObjectFactory.makeSymbol("S#11091", "CYC");
        $ic9$ = SubLObjectFactory.makeSymbol("S#11080", "CYC");
        $ic10$ = SubLObjectFactory.makeString("~A is not a ~A");
        $ic11$ = SubLObjectFactory.makeSymbol("QUOTE");
        $ic12$ = SubLObjectFactory.makeKeyword("CERROR");
        $ic13$ = SubLObjectFactory.makeSymbol("S#11081", "CYC");
        $ic14$ = SubLObjectFactory.makeString("continue anyway");
        $ic15$ = SubLObjectFactory.makeKeyword("WARN");
        $ic16$ = SubLObjectFactory.makeSymbol("WARN");
        $ic17$ = SubLObjectFactory.makeSymbol("OTHERWISE");
        $ic18$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WARN"), (SubLObject)SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value"), (SubLObject)SubLObjectFactory.makeSymbol("S#11091", "CYC"));
        $ic19$ = SubLObjectFactory.makeSymbol("CERROR");
        $ic20$ = SubLObjectFactory.makeSymbol("S#11077", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("INTEGERP");
        $ic22$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic23$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#696", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic24$ = SubLObjectFactory.makeSymbol(">=");
        $ic25$ = SubLObjectFactory.makeSymbol("S#11092", "CYC");
        $ic26$ = SubLObjectFactory.makeSymbol("S#11093", "CYC");
        $ic27$ = SubLObjectFactory.makeSymbol("S#11094", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("S#11095", "CYC");
        $ic29$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11096", "CYC"), (SubLObject)module0136.T));
        $ic30$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11096", "CYC"), (SubLObject)module0136.NIL));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0136.class
	Total time: 92 ms
	
	Decompiled with Procyon 0.5.32.
*/