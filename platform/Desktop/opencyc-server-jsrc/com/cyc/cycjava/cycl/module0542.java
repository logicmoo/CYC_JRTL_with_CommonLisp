package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0542 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0542";
    public static final String myFingerPrint = "92163ba67342e07ce2eb1be3c49178831a957bc6d2dd2a8c6842a5e24edbd88e";
    private static SubLSymbol $g3952$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLList $ic11$;
    private static final SubLList $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLList $ic21$;
    private static final SubLList $ic22$;
    private static final SubLList $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    
    
    public static SubLObject f33603(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0542.UNPROVIDED) {
            var2 = (SubLObject)module0542.NIL;
        }
        if (var3 == module0542.UNPROVIDED) {
            var3 = (SubLObject)module0542.NIL;
        }
        assert module0542.NIL != module0369.f25275(var1) : var1;
        assert module0542.NIL != module0360.f23804(var2) : var2;
        if (module0542.NIL != var3 && !module0542.areAssertionsDisabledFor(me) && module0542.NIL == Types.function_spec_p(var3)) {
            throw new AssertionError(var3);
        }
        return module0052.f3689(f33604(var1, var2, var3), (SubLObject)module0542.$ic3$, (SubLObject)module0542.$ic4$, (SubLObject)module0542.$ic5$);
    }
    
    public static SubLObject f33604(final SubLObject var1, SubLObject var2, final SubLObject var3) {
        var2 = conses_high.putf(var2, (SubLObject)module0542.$ic6$, (SubLObject)module0542.T);
        var2 = conses_high.putf(var2, (SubLObject)module0542.$ic7$, (SubLObject)module0542.ONE_INTEGER);
        final SubLObject var4 = module0055.f4017();
        return (SubLObject)ConsesLow.list(var4, var1, var2, var3);
    }
    
    public static SubLObject f33605(final SubLObject var5) {
        SubLObject var6 = (SubLObject)module0542.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var5, (SubLObject)module0542.$ic8$);
        var6 = var5.first();
        final SubLObject var8;
        final SubLObject var7 = var8 = var5.rest();
        return Equality.eq((SubLObject)module0542.$ic9$, var6);
    }
    
    public static SubLObject f33606(final SubLObject var5) {
        SubLObject var6 = (SubLObject)module0542.$ic10$;
        SubLObject var7 = (SubLObject)module0542.NIL;
        SubLObject var8 = (SubLObject)module0542.NIL;
        SubLObject var9 = (SubLObject)module0542.NIL;
        SubLObject var10 = (SubLObject)module0542.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var5, (SubLObject)module0542.$ic11$);
        var8 = var5.first();
        SubLObject var11 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var11, var5, (SubLObject)module0542.$ic11$);
        var9 = var11.first();
        var11 = var11.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var11, var5, (SubLObject)module0542.$ic11$);
        var10 = var11.first();
        final SubLObject var12;
        var11 = (var12 = var11.rest());
        while (module0542.$ic10$ == var6 && (module0542.NIL == module0055.f4019(var8) || (module0542.NIL != module0369.f25431(var9) && module0542.NIL == module0369.f25434(var9)))) {
            if (module0542.NIL == module0055.f4019(var8)) {
                var6 = module0055.f4023(var8);
            }
            else {
                SubLObject var14;
                final SubLObject var13 = var14 = module0409.f28521(var9, var10);
                SubLObject var15 = (SubLObject)module0542.NIL;
                var15 = var14.first();
                while (module0542.NIL != var14) {
                    module0055.f4021(var15, var8);
                    var14 = var14.rest();
                    var15 = var14.first();
                }
            }
        }
        if (var6 == module0542.$ic10$) {
            var7 = (SubLObject)module0542.T;
            ConsesLow.set_nth((SubLObject)module0542.ZERO_INTEGER, var5, (SubLObject)module0542.$ic9$);
        }
        return Values.values(var6, var5, var7);
    }
    
    public static SubLObject f33607(final SubLObject var5) {
        SubLObject var6 = (SubLObject)module0542.NIL;
        SubLObject var7 = (SubLObject)module0542.NIL;
        SubLObject var8 = (SubLObject)module0542.NIL;
        SubLObject var9 = (SubLObject)module0542.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var5, (SubLObject)module0542.$ic12$);
        var6 = var5.first();
        SubLObject var10 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var10, var5, (SubLObject)module0542.$ic12$);
        var7 = var10.first();
        var10 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var10, var5, (SubLObject)module0542.$ic12$);
        var8 = var10.first();
        var10 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var10, var5, (SubLObject)module0542.$ic12$);
        var9 = var10.first();
        var10 = var10.rest();
        if (module0542.NIL == var10) {
            if (var9.isFunctionSpec()) {
                return Functions.funcall(var9, var7);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0542.$ic12$);
        }
        return (SubLObject)module0542.NIL;
    }
    
    public static SubLObject f33608(final SubLObject var18, SubLObject var19, SubLObject var20) {
        if (var19 == module0542.UNPROVIDED) {
            var19 = (SubLObject)module0542.NIL;
        }
        if (var20 == module0542.UNPROVIDED) {
            var20 = (SubLObject)module0542.NIL;
        }
        assert module0542.NIL != module0202.f12663(var18) : var18;
        if (module0542.NIL != var19 && !module0542.areAssertionsDisabledFor(me) && module0542.NIL == module0161.f10479(var19)) {
            throw new AssertionError(var19);
        }
        final SubLObject var21 = var20;
        assert module0542.NIL != module0035.f2327(var21) : var21;
        SubLObject var22;
        SubLObject var23;
        SubLObject var24;
        for (var22 = (SubLObject)module0542.NIL, var22 = var21; module0542.NIL != var22; var22 = conses_high.cddr(var22)) {
            var23 = var22.first();
            var24 = conses_high.cadr(var22);
            assert module0542.NIL != module0360.f23781(var23) : var23;
        }
        return module0052.f3689(f33609(var18, var19, var20), (SubLObject)module0542.$ic17$, (SubLObject)module0542.$ic18$, (SubLObject)module0542.$ic19$);
    }
    
    public static SubLObject f33609(final SubLObject var18, final SubLObject var19, final SubLObject var20) {
        final SubLObject var21 = module0360.f23800(var20);
        final SubLObject var22 = module0360.f23805(var20);
        final SubLObject var23 = module0361.f24009(conses_high.getf(var21, (SubLObject)module0542.$ic20$, (SubLObject)module0542.UNPROVIDED));
        final SubLObject var24 = module0409.f28515(var18, var19, var21);
        final SubLObject var25 = f33603(var24, var22, (SubLObject)module0542.UNPROVIDED);
        return (SubLObject)ConsesLow.list(var25, var24, var23);
    }
    
    public static SubLObject f33610(final SubLObject var5) {
        SubLObject var30_31 = (SubLObject)module0542.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var5, (SubLObject)module0542.$ic21$);
        var30_31 = var5.first();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5.rest();
        return Equality.eq((SubLObject)module0542.$ic9$, var30_31);
    }
    
    public static SubLObject f33611(final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        SubLObject var7 = (SubLObject)module0542.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var5, (SubLObject)module0542.$ic22$);
        var7 = var5.first();
        final SubLObject var9;
        final SubLObject var8 = var9 = var5.rest();
        var6.resetMultipleValues();
        final SubLObject var10 = module0052.f3693(var7);
        final SubLObject var11 = var6.secondMultipleValue();
        var6.resetMultipleValues();
        if (module0542.NIL == var11) {
            f33612(var5);
            return Values.values((SubLObject)module0542.NIL, var5, (SubLObject)module0542.T);
        }
        return Values.values(var10, var5, (SubLObject)module0542.NIL);
    }
    
    public static SubLObject f33612(final SubLObject var5) {
        SubLObject var30_39 = (SubLObject)module0542.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var5, (SubLObject)module0542.$ic21$);
        var30_39 = var5.first();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5.rest();
        if (module0542.NIL != module0052.f3674(var30_39)) {
            SubLObject var8 = (SubLObject)module0542.NIL;
            SubLObject var9 = (SubLObject)module0542.NIL;
            SubLObject var10 = (SubLObject)module0542.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var5, var5, (SubLObject)module0542.$ic23$);
            var8 = var5.first();
            SubLObject var42_43 = var5.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var42_43, var5, (SubLObject)module0542.$ic23$);
            var9 = var42_43.first();
            var42_43 = var42_43.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var42_43, var5, (SubLObject)module0542.$ic23$);
            var10 = var42_43.first();
            var42_43 = var42_43.rest();
            if (module0542.NIL == var42_43) {
                module0052.f3696(var8);
                if (module0542.NIL != var10) {
                    module0369.f25471(var9);
                }
                else {
                    module0369.f25476(var9);
                }
                final SubLObject var11 = (SubLObject)module0542.$ic9$;
                ConsesLow.rplaca(var5, var11);
                ConsesLow.rplacd(var5, (SubLObject)module0542.NIL);
                return (SubLObject)module0542.T;
            }
            cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0542.$ic23$);
        }
        return (SubLObject)module0542.NIL;
    }
    
    public static SubLObject f33613(final SubLObject var18, SubLObject var19, SubLObject var20, SubLObject var45) {
        if (var19 == module0542.UNPROVIDED) {
            var19 = (SubLObject)module0542.NIL;
        }
        if (var20 == module0542.UNPROVIDED) {
            var20 = (SubLObject)module0542.NIL;
        }
        if (var45 == module0542.UNPROVIDED) {
            var45 = Symbols.symbol_function((SubLObject)module0542.$ic24$);
        }
        final SubLThread var46 = SubLProcess.currentSubLThread();
        assert module0542.NIL != module0202.f12663(var18) : var18;
        if (module0542.NIL != var19 && !module0542.areAssertionsDisabledFor(me) && module0542.NIL == module0161.f10479(var19)) {
            throw new AssertionError(var19);
        }
        final SubLObject var47 = var20;
        assert module0542.NIL != module0035.f2327(var47) : var47;
        SubLObject var48;
        SubLObject var49;
        SubLObject var50;
        for (var48 = (SubLObject)module0542.NIL, var48 = var47; module0542.NIL != var48; var48 = conses_high.cddr(var48)) {
            var49 = var48.first();
            var50 = conses_high.cadr(var48);
            assert module0542.NIL != module0360.f23781(var49) : var49;
        }
        assert module0542.NIL != Types.function_spec_p(var45) : var45;
        final SubLObject var51 = conses_high.getf(var20, (SubLObject)module0542.$ic7$, (SubLObject)module0542.NIL);
        final SubLObject var52 = conses_high.getf(var20, (SubLObject)module0542.$ic25$, (SubLObject)module0542.NIL);
        var20 = conses_high.copy_list(var20);
        var20 = conses_high.putf(var20, (SubLObject)module0542.$ic25$, (SubLObject)module0542.NIL);
        SubLObject var53 = (SubLObject)module0542.NIL;
        SubLObject var54 = (SubLObject)module0542.NIL;
        SubLObject var55 = (SubLObject)module0542.NIL;
        final SubLObject var56 = f33608(var18, var19, var20);
        final SubLObject var57 = module0542.$g3952$.currentBinding(var46);
        try {
            module0542.$g3952$.bind((SubLObject)module0542.NIL, var46);
            if (module0542.NIL != var52) {
                final SubLObject var58 = module0003.f61();
                try {
                    var46.throwStack.push(var58);
                    final SubLObject var52_54 = module0003.$g4$.currentBinding(var46);
                    try {
                        module0003.$g4$.bind((SubLObject)module0542.T, var46);
                        SubLObject var59 = (SubLObject)module0542.NIL;
                        try {
                            final SubLObject var52_55 = module0003.$g5$.currentBinding(var46);
                            try {
                                module0003.$g5$.bind(Numbers.add((SubLObject)module0542.ONE_INTEGER, module0003.$g5$.getDynamicValue(var46)), var46);
                                var59 = module0003.f62(var52, var58);
                                var54 = f33614(var56, var51, var45);
                            }
                            finally {
                                module0003.$g5$.rebind(var52_55, var46);
                            }
                        }
                        finally {
                            final SubLObject var52_56 = Threads.$is_thread_performing_cleanupP$.currentBinding(var46);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0542.T, var46);
                                module0003.f64(var59);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var52_56, var46);
                            }
                        }
                    }
                    finally {
                        module0003.$g4$.rebind(var52_54, var46);
                    }
                }
                catch (Throwable var60) {
                    var53 = Errors.handleThrowable(var60, var58);
                }
                finally {
                    var46.throwStack.pop();
                }
            }
            else {
                var54 = f33614(var56, var51, var45);
            }
            var55 = Sequences.nreverse(module0542.$g3952$.getDynamicValue(var46));
        }
        finally {
            module0542.$g3952$.rebind(var57, var46);
        }
        final SubLObject var61 = (SubLObject)((module0542.NIL != var53) ? module0542.$ic25$ : ((module0542.NIL != var54) ? module0542.$ic7$ : module0542.$ic26$));
        return Values.values(var55, var61);
    }
    
    public static SubLObject f33614(final SubLObject var51, final SubLObject var46, final SubLObject var45) {
        final SubLThread var52 = SubLProcess.currentSubLThread();
        SubLObject var53 = (SubLObject)module0542.ZERO_INTEGER;
        SubLObject var54 = (SubLObject)((module0542.NIL != var46) ? Numbers.numGE(var53, var46) : module0542.NIL);
        try {
            SubLObject var57;
            for (SubLObject var55 = var54; module0542.NIL == var55; var55 = (SubLObject)SubLObjectFactory.makeBoolean(module0542.NIL == var57 || module0542.NIL != var54)) {
                var52.resetMultipleValues();
                final SubLObject var56 = module0052.f3693(var51);
                var57 = var52.secondMultipleValue();
                var52.resetMultipleValues();
                if (module0542.NIL != var57) {
                    var53 = Numbers.add(var53, (SubLObject)module0542.ONE_INTEGER);
                    var54 = (SubLObject)((module0542.NIL != var46) ? Numbers.numGE(var53, var46) : module0542.NIL);
                    Functions.funcall(var45, var56);
                    module0542.$g3952$.setDynamicValue((SubLObject)ConsesLow.cons(var56, module0542.$g3952$.getDynamicValue(var52)), var52);
                }
            }
        }
        finally {
            final SubLObject var58 = Threads.$is_thread_performing_cleanupP$.currentBinding(var52);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0542.T, var52);
                module0052.f3696(var51);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var58, var52);
            }
        }
        return var54;
    }
    
    public static SubLObject f33615() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0542", "f33603", "S#35851", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0542", "f33604", "S#37004", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0542", "f33605", "S#37005", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0542", "f33606", "S#37006", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0542", "f33607", "S#37007", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0542", "f33608", "S#37008", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0542", "f33609", "S#37009", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0542", "f33610", "S#37010", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0542", "f33611", "S#37011", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0542", "f33612", "S#37012", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0542", "f33613", "S#37013", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0542", "f33614", "S#37014", 3, 0, false);
        return (SubLObject)module0542.NIL;
    }
    
    public static SubLObject f33616() {
        module0542.$g3952$ = SubLFiles.defparameter("S#37015", (SubLObject)module0542.NIL);
        return (SubLObject)module0542.NIL;
    }
    
    public static SubLObject f33617() {
        return (SubLObject)module0542.NIL;
    }
    
    public void declareFunctions() {
        f33615();
    }
    
    public void initializeVariables() {
        f33616();
    }
    
    public void runTopLevelForms() {
        f33617();
    }
    
    static {
        me = (SubLFile)new module0542();
        module0542.$g3952$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("INFERENCE-P");
        $ic1$ = SubLObjectFactory.makeSymbol("S#26495", "CYC");
        $ic2$ = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $ic3$ = SubLObjectFactory.makeSymbol("S#37005", "CYC");
        $ic4$ = SubLObjectFactory.makeSymbol("S#37006", "CYC");
        $ic5$ = SubLObjectFactory.makeSymbol("S#37007", "CYC");
        $ic6$ = SubLObjectFactory.makeKeyword("CONTINUABLE?");
        $ic7$ = SubLObjectFactory.makeKeyword("MAX-NUMBER");
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#17958", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("REST"));
        $ic9$ = SubLObjectFactory.makeKeyword("DONE");
        $ic10$ = SubLObjectFactory.makeKeyword("UNDETERMINED");
        $ic11$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#17958", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25426", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#37016", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("REST"));
        $ic12$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#17958", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25426", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#37016", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#37017", "CYC"));
        $ic13$ = SubLObjectFactory.makeSymbol("S#15591", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#12264", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#748", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("QUERY-PROPERTY-P");
        $ic17$ = SubLObjectFactory.makeSymbol("S#37010", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#37011", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#37012", "CYC");
        $ic20$ = SubLObjectFactory.makeKeyword("PROBLEM-STORE");
        $ic21$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5232", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("REST"));
        $ic22$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#37018", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("REST"));
        $ic23$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#37018", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25426", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#37019", "CYC"));
        $ic24$ = SubLObjectFactory.makeSymbol("PRINT");
        $ic25$ = SubLObjectFactory.makeKeyword("MAX-TIME");
        $ic26$ = SubLObjectFactory.makeKeyword("EXHAUST");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0542.class
	Total time: 179 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/