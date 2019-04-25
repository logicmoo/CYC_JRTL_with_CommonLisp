package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0586 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0586";
    public static final String myFingerPrint = "c0e085f4caa2fd7f4ef2b995742da4895488ddf4ac910e77bd8d008d2dd0991d";
    public static SubLSymbol $g4451$;
    public static SubLSymbol $g4452$;
    public static SubLSymbol $g4453$;
    private static SubLSymbol $g4454$;
    public static SubLSymbol $g4455$;
    public static SubLSymbol $g4456$;
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLList $ic16$;
    private static final SubLList $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLList $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLList $ic23$;
    private static final SubLList $ic24$;
    private static final SubLSymbol $ic25$;
    
    public static SubLObject f35846() {
        return module0034.f1854((SubLObject)module0586.UNPROVIDED, (SubLObject)module0586.UNPROVIDED, (SubLObject)module0586.UNPROVIDED, (SubLObject)module0586.UNPROVIDED);
    }
    
    public static SubLObject f35847(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.list((SubLObject)module0586.$ic0$, (SubLObject)module0586.$ic1$, reader.bq_cons((SubLObject)module0586.$ic2$, ConsesLow.append(var5, (SubLObject)module0586.NIL)));
    }
    
    public static SubLObject f35848(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0586.$ic3$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0586.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0586.$ic3$);
        var6 = var4.first();
        var4 = var4.rest();
        if (module0586.NIL == var4) {
            final SubLObject var7;
            var4 = (var7 = var5);
            return (SubLObject)ConsesLow.list((SubLObject)module0586.$ic0$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0586.$ic4$, var6)), reader.bq_cons((SubLObject)module0586.$ic2$, ConsesLow.append(var7, (SubLObject)module0586.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0586.$ic3$);
        return (SubLObject)module0586.NIL;
    }
    
    public static SubLObject f35849() {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        if (module0586.$ic5$ == module0586.$g4453$.getDynamicValue(var10)) {
            return (SubLObject)module0586.NIL;
        }
        if (module0586.NIL == f35850()) {
            if (module0586.NIL != module0361.f24009(module0586.$g4453$.getDynamicValue(var10))) {
                f35851((SubLObject)module0586.UNPROVIDED);
            }
            module0586.$g4453$.setDynamicValue(f35852(), var10);
        }
        return module0586.$g4453$.getDynamicValue(var10);
    }
    
    public static SubLObject f35853() {
        final SubLObject var11 = f35849();
        final SubLObject var12 = module0035.sublisp_boolean(var11);
        return Values.values((module0586.NIL != var11) ? var11 : f35852(), var12);
    }
    
    public static SubLObject f35852() {
        final SubLObject var11 = module0361.f24136((SubLObject)module0586.UNPROVIDED);
        module0586.$g4454$.setGlobalValue((SubLObject)ConsesLow.cons(var11, module0586.$g4454$.getGlobalValue()));
        return var11;
    }
    
    public static SubLObject f35851(SubLObject var11) {
        if (var11 == module0586.UNPROVIDED) {
            var11 = module0586.$g4453$.getDynamicValue();
        }
        module0586.$g4454$.setGlobalValue(Sequences.delete(var11, module0586.$g4454$.getGlobalValue(), (SubLObject)module0586.UNPROVIDED, (SubLObject)module0586.UNPROVIDED, (SubLObject)module0586.UNPROVIDED, (SubLObject)module0586.UNPROVIDED, (SubLObject)module0586.UNPROVIDED));
        return module0361.f24005(var11);
    }
    
    public static SubLObject f35850() {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        return module0361.f24109(module0586.$g4453$.getDynamicValue(var10));
    }
    
    public static SubLObject f35854(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        final SubLObject var6 = (SubLObject)module0586.$ic9$;
        return (SubLObject)ConsesLow.list((SubLObject)module0586.$ic10$, (SubLObject)ConsesLow.list((SubLObject)module0586.$ic11$, var6), (SubLObject)module0586.$ic12$, (SubLObject)ConsesLow.list((SubLObject)module0586.$ic13$, reader.bq_cons((SubLObject)module0586.$ic2$, ConsesLow.append(var5, (SubLObject)module0586.NIL)), (SubLObject)ConsesLow.listS((SubLObject)module0586.$ic14$, (SubLObject)ConsesLow.listS((SubLObject)module0586.$ic15$, var6, (SubLObject)module0586.$ic16$), (SubLObject)module0586.$ic17$)));
    }
    
    public static SubLObject f35855() {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        return f35856(module0586.$g4453$.getDynamicValue(var10));
    }
    
    public static SubLObject f35856(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        SubLObject var13 = (SubLObject)module0586.NIL;
        if (module0586.NIL != module0361.f24109(var11)) {
            final SubLObject var14 = module0361.f24123(var11);
            if (module0586.NIL == module0065.f4772(var14, (SubLObject)module0586.$ic19$)) {
                final SubLObject var17_18 = var14;
                if (module0586.NIL == module0065.f4775(var17_18, (SubLObject)module0586.$ic19$)) {
                    final SubLObject var15 = module0065.f4740(var17_18);
                    final SubLObject var16 = (SubLObject)module0586.NIL;
                    final SubLObject var17 = Sequences.length(var15);
                    SubLObject var19;
                    final SubLObject var18 = var19 = (SubLObject)((module0586.NIL != var16) ? ConsesLow.list(Numbers.subtract(var17, (SubLObject)module0586.ONE_INTEGER), (SubLObject)module0586.MINUS_ONE_INTEGER, (SubLObject)module0586.MINUS_ONE_INTEGER) : ConsesLow.list((SubLObject)module0586.ZERO_INTEGER, var17, (SubLObject)module0586.ONE_INTEGER));
                    SubLObject var20 = (SubLObject)module0586.NIL;
                    SubLObject var21 = (SubLObject)module0586.NIL;
                    SubLObject var22 = (SubLObject)module0586.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var19, var18, (SubLObject)module0586.$ic20$);
                    var20 = var19.first();
                    var19 = var19.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var19, var18, (SubLObject)module0586.$ic20$);
                    var21 = var19.first();
                    var19 = var19.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var19, var18, (SubLObject)module0586.$ic20$);
                    var22 = var19.first();
                    var19 = var19.rest();
                    if (module0586.NIL == var19) {
                        if (module0586.NIL == var13) {
                            SubLObject var23;
                            SubLObject var24;
                            SubLObject var25;
                            for (var23 = var21, var24 = (SubLObject)module0586.NIL, var24 = var20; module0586.NIL == var13 && module0586.NIL == module0005.f124(var24, var22, var23); var24 = Numbers.add(var24, var22)) {
                                var25 = Vectors.aref(var15, var24);
                                if (module0586.NIL == module0065.f4749(var25) || module0586.NIL == module0065.f4773((SubLObject)module0586.$ic19$)) {
                                    if (module0586.NIL != module0065.f4749(var25)) {
                                        var25 = (SubLObject)module0586.$ic19$;
                                    }
                                    var13 = oc_inference_datastructures_inference.f25515(var25);
                                }
                            }
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var18, (SubLObject)module0586.$ic20$);
                    }
                }
                final SubLObject var30_31 = var14;
                if (module0586.NIL == module0065.f4777(var30_31) && module0586.NIL == var13) {
                    SubLObject var26 = (SubLObject)module0586.NIL;
                    try {
                        var12.throwStack.push(module0586.$ic21$);
                        final SubLObject var27 = module0065.f4738(var30_31);
                        SubLObject var28 = (SubLObject)module0586.NIL;
                        SubLObject var29 = (SubLObject)module0586.NIL;
                        final Iterator var30 = Hashtables.getEntrySetIterator(var27);
                        try {
                            while (Hashtables.iteratorHasNext(var30)) {
                                final Map.Entry var31 = Hashtables.iteratorNextEntry(var30);
                                var28 = Hashtables.getEntryKey(var31);
                                var29 = Hashtables.getEntryValue(var31);
                                module0005.f153(var13);
                                var13 = oc_inference_datastructures_inference.f25515(var29);
                            }
                        }
                        finally {
                            Hashtables.releaseEntrySetIterator(var30);
                        }
                    }
                    catch (Throwable var32) {
                        var26 = Errors.handleThrowable(var32, (SubLObject)module0586.$ic21$);
                    }
                    finally {
                        var12.throwStack.pop();
                    }
                }
            }
        }
        return var13;
    }
    
    public static SubLObject f35857(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0586.$ic22$, (SubLObject)module0586.$ic23$, ConsesLow.append(var5, (SubLObject)module0586.NIL));
    }
    
    public static SubLObject f35858(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0586.$ic24$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0586.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0586.$ic24$);
        var6 = var4.first();
        var4 = var4.rest();
        if (module0586.NIL == var4) {
            final SubLObject var7;
            var4 = (var7 = var5);
            return (SubLObject)ConsesLow.listS((SubLObject)module0586.$ic0$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0586.$ic25$, var6)), ConsesLow.append(var7, (SubLObject)module0586.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0586.$ic24$);
        return (SubLObject)module0586.NIL;
    }
    
    public static SubLObject f35859() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0586", "f35846", "S#39572", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0586", "f35847", "S#39573");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0586", "f35848", "S#39574");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0586", "f35849", "S#39575", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0586", "f35853", "S#39576", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0586", "f35852", "S#39577", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0586", "f35851", "S#39578", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0586", "f35850", "S#39579", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0586", "f35854", "S#39580");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0586", "f35855", "S#39581", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0586", "f35856", "S#39582", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0586", "f35857", "S#39583");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0586", "f35858", "S#39584");
        return (SubLObject)module0586.NIL;
    }
    
    public static SubLObject f35860() {
        module0586.$g4451$ = SubLFiles.deflexical("S#39585", module0034.f1854((SubLObject)module0586.UNPROVIDED, (SubLObject)module0586.UNPROVIDED, (SubLObject)module0586.UNPROVIDED, (SubLObject)module0586.UNPROVIDED));
        module0586.$g4452$ = SubLFiles.defparameter("S#39586", (SubLObject)module0586.NIL);
        module0586.$g4453$ = SubLFiles.defparameter("S#39587", (SubLObject)module0586.$ic5$);
        module0586.$g4454$ = SubLFiles.deflexical("S#39588", (SubLObject)module0586.NIL);
        module0586.$g4455$ = SubLFiles.deflexical("S#39589", (SubLObject)module0586.T);
        module0586.$g4456$ = SubLFiles.defparameter("S#39590", (SubLObject)module0586.NIL);
        return (SubLObject)module0586.NIL;
    }
    
    public static SubLObject f35861() {
        module0002.f50((SubLObject)module0586.$ic6$, (SubLObject)module0586.$ic7$);
        module0002.f50((SubLObject)module0586.$ic8$, (SubLObject)module0586.$ic7$);
        module0002.f50((SubLObject)module0586.$ic18$, (SubLObject)module0586.$ic7$);
        return (SubLObject)module0586.NIL;
    }
    
    public void declareFunctions() {
        f35859();
    }
    
    public void initializeVariables() {
        f35860();
    }
    
    public void runTopLevelForms() {
        f35861();
    }
    
    static {
        me = (SubLFile)new module0586();
        module0586.$g4451$ = null;
        module0586.$g4452$ = null;
        module0586.$g4453$ = null;
        module0586.$g4454$ = null;
        module0586.$g4455$ = null;
        module0586.$g4456$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("CLET");
        $ic1$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39586", "CYC"), (SubLObject)module0586.T));
        $ic2$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic3$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic4$ = SubLObjectFactory.makeSymbol("S#39586", "CYC");
        $ic5$ = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $ic6$ = SubLObjectFactory.makeSymbol("S#39576", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#39580", "CYC");
        $ic8$ = SubLObjectFactory.makeSymbol("S#39578", "CYC");
        $ic9$ = SubLObjectFactory.makeUninternedSymbol("US#E7B245");
        $ic10$ = SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND");
        $ic11$ = SubLObjectFactory.makeSymbol("S#39587", "CYC");
        $ic12$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39576", "CYC"));
        $ic13$ = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $ic14$ = SubLObjectFactory.makeSymbol("PUNLESS");
        $ic15$ = SubLObjectFactory.makeSymbol("COR");
        $ic16$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39581", "CYC")));
        $ic17$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39578", "CYC")));
        $ic18$ = SubLObjectFactory.makeSymbol("S#39581", "CYC");
        $ic19$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic20$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("US#352B2C1"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#13A2892"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#1160044"));
        $ic21$ = SubLObjectFactory.makeKeyword("DO-HASH-TABLE");
        $ic22$ = SubLObjectFactory.makeSymbol("S#3165", "CYC");
        $ic23$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39572", "CYC")));
        $ic24$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12327", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic25$ = SubLObjectFactory.makeSymbol("S#39590", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0586.class
	Total time: 117 ms
	
	Decompiled with Procyon 0.5.32.
*/