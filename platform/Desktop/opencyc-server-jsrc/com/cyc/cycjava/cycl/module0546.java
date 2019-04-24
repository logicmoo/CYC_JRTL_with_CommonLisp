package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0546 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0546";
    public static final String myFingerPrint = "3f594a970b64229c683287384d71f02dd7fd00815159d3f403dc6c7b9f5e5ae1";
    private static SubLSymbol $g3971$;
    private static SubLSymbol $g3972$;
    public static SubLSymbol $g3973$;
    public static SubLSymbol $g3974$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLString $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLString $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLFloat $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLInteger $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLList $ic17$;
    private static final SubLList $ic18$;
    private static final SubLString $ic19$;
    
    
    public static SubLObject f33758(final SubLObject var1, SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var2 == module0546.UNPROVIDED) {
            var2 = (SubLObject)module0546.NIL;
        }
        if (var3 == module0546.UNPROVIDED) {
            var3 = Symbols.symbol_function((SubLObject)module0546.$ic0$);
        }
        if (var4 == module0546.UNPROVIDED) {
            var4 = (SubLObject)module0546.T;
        }
        if (module0546.NIL != var2 && !module0546.areAssertionsDisabledFor(me) && module0546.NIL == module0004.f105(var2)) {
            throw new AssertionError(var2);
        }
        final SubLObject var5 = module0067.f4880(Symbols.symbol_function((SubLObject)module0546.EQL), (SubLObject)module0546.UNPROVIDED);
        SubLObject var6 = (SubLObject)module0546.NIL;
        if (module0546.NIL != module0369.f25417(var1)) {
            final SubLObject var7 = module0369.f25817(var1);
            var6 = module0030.f1630(var7);
            final SubLObject var8 = module0078.f5367(f33759(var1, var4), (SubLObject)module0546.UNPROVIDED, (SubLObject)module0546.UNPROVIDED);
            final SubLObject var9 = Time.get_internal_real_time();
            SubLObject var10 = var6;
            SubLObject var11 = (SubLObject)module0546.NIL;
            var11 = var10.first();
            while (module0546.NIL != var10) {
                SubLObject var13;
                final SubLObject var12 = var13 = var11;
                SubLObject var14 = (SubLObject)module0546.NIL;
                SubLObject var15 = (SubLObject)module0546.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0546.$ic2$);
                var14 = var13.first();
                var13 = (var15 = var13.rest());
                final SubLObject var16 = Numbers.subtract(var9, var15);
                SubLObject var10_17 = module0205.f13189(module0363.f24509(var14), var4, (SubLObject)module0546.UNPROVIDED, (SubLObject)module0546.UNPROVIDED);
                SubLObject var17 = (SubLObject)module0546.NIL;
                var17 = var10_17.first();
                while (module0546.NIL != var10_17) {
                    if (module0546.NIL == module0077.f5320(var17, var8) && module0546.NIL != f33760(var17, var3)) {
                        module0084.f5775(var5, var17, var16);
                    }
                    var10_17 = var10_17.rest();
                    var17 = var10_17.first();
                }
                var10 = var10.rest();
                var11 = var10.first();
            }
        }
        final SubLObject var18 = module0084.f5795(var5, Symbols.symbol_function((SubLObject)module0546.$ic3$));
        if (module0546.NIL != module0004.f105(var2)) {
            return module0035.f2124(var2, var18);
        }
        return var18;
    }
    
    public static SubLObject f33760(final SubLObject var18, final SubLObject var3) {
        if (Symbols.symbol_function((SubLObject)module0546.$ic0$).eql(var3)) {
            return (SubLObject)module0546.T;
        }
        return Functions.funcall(var3, var18);
    }
    
    public static SubLObject f33759(final SubLObject var1, final SubLObject var4) {
        return module0205.f13189(module0369.f25484(var1), var4, (SubLObject)module0546.UNPROVIDED, (SubLObject)module0546.UNPROVIDED);
    }
    
    public static SubLObject f33761(final SubLObject var20, final SubLObject var21, final SubLObject var22) {
        final SubLObject var23 = conses_high.putf(conses_high.copy_list(var22), (SubLObject)module0546.$ic7$, (SubLObject)module0546.T);
        final SubLObject var24 = module0409.f28515(var20, var21, module0360.f23800(var23));
        final SubLObject var25 = module0546.$g3971$.getGlobalValue();
        SubLObject var26 = (SubLObject)module0546.NIL;
        try {
            var26 = Locks.seize_lock(var25);
            module0546.$g3972$.setGlobalValue(var24);
            module0409.f28521(module0546.$g3972$.getGlobalValue(), module0360.f23805(var23));
        }
        finally {
            if (module0546.NIL != var26) {
                Locks.release_lock(var25);
            }
        }
        return (SubLObject)module0546.NIL;
    }
    
    public static SubLObject f33762(final SubLObject var20, SubLObject var21, SubLObject var22, SubLObject var26, SubLObject var3, SubLObject var4) {
        if (var21 == module0546.UNPROVIDED) {
            var21 = (SubLObject)module0546.NIL;
        }
        if (var22 == module0546.UNPROVIDED) {
            var22 = (SubLObject)module0546.NIL;
        }
        if (var26 == module0546.UNPROVIDED) {
            var26 = (SubLObject)module0546.NIL;
        }
        if (var3 == module0546.UNPROVIDED) {
            var3 = Symbols.symbol_function((SubLObject)module0546.$ic0$);
        }
        if (var4 == module0546.UNPROVIDED) {
            var4 = (SubLObject)module0546.T;
        }
        assert module0546.NIL != module0048.f3294(var26) : var26;
        SubLObject var27 = (SubLObject)module0546.NIL;
        final SubLObject var28 = module0546.$g3971$.getGlobalValue();
        SubLObject var29 = (SubLObject)module0546.NIL;
        try {
            var29 = Locks.seize_lock(var28);
            module0546.$g3972$.setGlobalValue((SubLObject)module0546.NIL);
        }
        finally {
            if (module0546.NIL != var29) {
                Locks.release_lock(var28);
            }
        }
        module0004.f78((SubLObject)module0546.$ic9$, (SubLObject)module0546.$ic10$, (SubLObject)ConsesLow.list(var20, var21, var22));
        while (module0546.NIL == module0369.f25275(module0546.$g3972$.getGlobalValue()) || module0546.NIL == module0369.f25430(module0546.$g3972$.getGlobalValue())) {
            if (module0546.NIL != module0369.f25275(module0546.$g3972$.getGlobalValue())) {
                final SubLObject var30 = (SubLObject)ConsesLow.list(Time.get_universal_time(), f33758(module0546.$g3972$.getGlobalValue(), (SubLObject)module0546.NIL, var3, var4));
                var27 = (SubLObject)ConsesLow.cons(var30, var27);
            }
            Threads.sleep(var26);
        }
        return Sequences.nreverse(var27);
    }
    
    public static SubLObject f33763(final SubLObject var31, final SubLObject var32, SubLObject var33, SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var33 == module0546.UNPROVIDED) {
            var33 = module0546.$g3973$.getGlobalValue();
        }
        if (var2 == module0546.UNPROVIDED) {
            var2 = module0546.$g3974$.getGlobalValue();
        }
        if (var3 == module0546.UNPROVIDED) {
            var3 = Symbols.symbol_function((SubLObject)module0546.$ic0$);
        }
        if (var4 == module0546.UNPROVIDED) {
            var4 = (SubLObject)module0546.T;
        }
        final SubLThread var34 = SubLProcess.currentSubLThread();
        assert module0546.NIL != module0048.f3294(var33) : var33;
        assert module0546.NIL != module0004.f105(var2) : var2;
        SubLObject var35 = (SubLObject)module0546.NIL;
        try {
            var34.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var36 = Errors.$error_handler$.currentBinding(var34);
            try {
                Errors.$error_handler$.bind((SubLObject)module0546.$ic16$, var34);
                try {
                    final SubLObject var37 = module0361.f24195(var31, var32);
                    while (module0546.NIL != module0369.f25417(var37) && module0546.NIL == module0369.f25430(var37)) {
                        if (module0546.NIL != module0369.f25417(var37)) {
                            final SubLObject var38 = f33758(var37, var2, var3, var4);
                            SubLObject var39 = (SubLObject)module0546.NIL;
                            SubLObject var40 = var38;
                            SubLObject var41 = (SubLObject)module0546.NIL;
                            var41 = var40.first();
                            while (module0546.NIL != var40) {
                                SubLObject var43;
                                final SubLObject var42 = var43 = var41;
                                SubLObject var44 = (SubLObject)module0546.NIL;
                                SubLObject var45 = (SubLObject)module0546.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(var43, var42, (SubLObject)module0546.$ic17$);
                                var44 = var43.first();
                                var43 = (var45 = var43.rest());
                                var39 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module0770.f49061(var44, (SubLObject)module0546.UNPROVIDED), var45), var39);
                                var40 = var40.rest();
                                var41 = var40.first();
                            }
                            var39 = Sequences.nreverse(var39);
                            final SubLObject var46 = (SubLObject)ConsesLow.list(Time.get_universal_time(), var39);
                            module0623.f38420(var46);
                            Threads.sleep(var33);
                        }
                    }
                }
                catch (Throwable var47) {
                    Errors.handleThrowable(var47, (SubLObject)module0546.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var36, var34);
            }
        }
        catch (Throwable var48) {
            var35 = Errors.handleThrowable(var48, module0003.$g3$.getGlobalValue());
        }
        finally {
            var34.throwStack.pop();
        }
        return var35;
    }
    
    public static SubLObject f33764(final SubLObject var27) {
        SubLObject var28 = var27;
        SubLObject var29 = (SubLObject)module0546.NIL;
        var29 = var28.first();
        while (module0546.NIL != var28) {
            SubLObject var30;
            final SubLObject var45_46 = var30 = var29;
            SubLObject var31 = (SubLObject)module0546.NIL;
            SubLObject var32 = (SubLObject)module0546.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var30, var45_46, (SubLObject)module0546.$ic18$);
            var31 = var30.first();
            var30 = var30.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var30, var45_46, (SubLObject)module0546.$ic18$);
            var32 = var30.first();
            var30 = var30.rest();
            if (module0546.NIL == var30) {
                PrintLow.format((SubLObject)module0546.T, (SubLObject)module0546.$ic19$, module0051.f3552(var31));
                module0006.f215(var32, (SubLObject)module0546.UNPROVIDED);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var45_46, (SubLObject)module0546.$ic18$);
            }
            var28 = var28.rest();
            var29 = var28.first();
        }
        return (SubLObject)module0546.NIL;
    }
    
    public static SubLObject f33765() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0546", "f33758", "S#37157", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0546", "f33760", "S#37158", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0546", "f33759", "S#37159", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0546", "f33761", "S#37160", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0546", "f33762", "S#37161", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0546", "f33763", "EXTERNALLY-MONITOR-INFERENCE-TERM-WORKING-SET", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0546", "f33764", "S#37162", 1, 0, false);
        return (SubLObject)module0546.NIL;
    }
    
    public static SubLObject f33766() {
        module0546.$g3971$ = SubLFiles.deflexical("S#37163", (module0546.NIL != Symbols.boundp((SubLObject)module0546.$ic4$)) ? module0546.$g3971$.getGlobalValue() : Locks.make_lock((SubLObject)module0546.$ic5$));
        module0546.$g3972$ = SubLFiles.deflexical("S#37164", (SubLObject)((module0546.NIL != Symbols.boundp((SubLObject)module0546.$ic6$)) ? module0546.$g3972$.getGlobalValue() : module0546.NIL));
        module0546.$g3973$ = SubLFiles.deflexical("*EXTERNAL-INFERENCE-MONITOR-TIME-INCREMENT-SECS*", (SubLObject)module0546.$ic12$);
        module0546.$g3974$ = SubLFiles.deflexical("*EXTERNAL-INFERENCE-MONITOR-MAX-TERMS*", (SubLObject)module0546.$ic14$);
        return (SubLObject)module0546.NIL;
    }
    
    public static SubLObject f33767() {
        module0003.f57((SubLObject)module0546.$ic4$);
        module0003.f57((SubLObject)module0546.$ic6$);
        module0002.f38((SubLObject)module0546.$ic11$);
        module0002.f38((SubLObject)module0546.$ic13$);
        module0002.f38((SubLObject)module0546.$ic15$);
        return (SubLObject)module0546.NIL;
    }
    
    public void declareFunctions() {
        f33765();
    }
    
    public void initializeVariables() {
        f33766();
    }
    
    public void runTopLevelForms() {
        f33767();
    }
    
    static {
        me = (SubLFile)new module0546();
        module0546.$g3971$ = null;
        module0546.$g3972$ = null;
        module0546.$g3973$ = null;
        module0546.$g3974$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("TRUE");
        $ic1$ = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $ic2$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#24274", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("TIME"));
        $ic3$ = SubLObjectFactory.makeSymbol(">");
        $ic4$ = SubLObjectFactory.makeSymbol("S#37163", "CYC");
        $ic5$ = SubLObjectFactory.makeString("cyc-term-working-set-query lock");
        $ic6$ = SubLObjectFactory.makeSymbol("S#37164", "CYC");
        $ic7$ = SubLObjectFactory.makeKeyword("MAINTAIN-TERM-WORKING-SET?");
        $ic8$ = SubLObjectFactory.makeSymbol("S#65", "CYC");
        $ic9$ = SubLObjectFactory.makeString("cyc-query subprocess");
        $ic10$ = SubLObjectFactory.makeSymbol("S#37160", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("*EXTERNAL-INFERENCE-MONITOR-TIME-INCREMENT-SECS*");
        $ic12$ = (SubLFloat)SubLObjectFactory.makeDouble(0.5);
        $ic13$ = SubLObjectFactory.makeSymbol("*EXTERNAL-INFERENCE-MONITOR-MAX-TERMS*");
        $ic14$ = SubLObjectFactory.makeInteger(25);
        $ic15$ = SubLObjectFactory.makeSymbol("EXTERNALLY-MONITOR-INFERENCE-TERM-WORKING-SET");
        $ic16$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic17$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#704", "CYC"));
        $ic18$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TIME"), (SubLObject)SubLObjectFactory.makeSymbol("S#133", "CYC"));
        $ic19$ = SubLObjectFactory.makeString("~%~%Time: ~s~%");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0546.class
	Total time: 165 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/