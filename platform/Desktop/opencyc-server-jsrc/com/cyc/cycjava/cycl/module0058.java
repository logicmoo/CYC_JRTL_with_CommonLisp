package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Semaphores;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0058 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0058";
    public static final String myFingerPrint = "9fab113e9fc9c2cb25cfcabf927d06fa0ab1d2d9db82c850ba181fc59d28d5f9";
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
    private static final SubLList $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    private static final SubLFloat $ic16$;
    private static final SubLFloat $ic17$;
    private static final SubLFloat $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLList $ic20$;
    private static final SubLString $ic21$;
    private static final SubLSymbol $ic22$;
    
    public static SubLObject f4185(final SubLObject var1) {
        return Semaphores.semaphore_wait(var1);
    }
    
    public static SubLObject f4186(final SubLObject var1) {
        return Semaphores.semaphore_signal(var1);
    }
    
    public static SubLObject f4187(final SubLObject var2) {
        final SubLObject var3 = Semaphores.new_semaphore(var2, (SubLObject)module0058.ZERO_INTEGER);
        SubLObject var4 = (SubLObject)module0058.NIL;
        if (!module0058.ZERO_INTEGER.eql(Semaphores.semaphore_current_count(var3))) {
            return (SubLObject)module0058.$ic12$;
        }
        var4 = Semaphores.semaphore_drain(var3);
        if (!module0058.ZERO_INTEGER.eql(var4)) {
            return (SubLObject)module0058.$ic12$;
        }
        if (!module0058.ZERO_INTEGER.eql(Semaphores.semaphore_current_count(var3))) {
            return (SubLObject)module0058.$ic12$;
        }
        Semaphores.semaphore_signal(var3);
        var4 = Semaphores.semaphore_drain(var3);
        if (!module0058.ONE_INTEGER.eql(var4)) {
            return (SubLObject)module0058.$ic12$;
        }
        if (!module0058.ZERO_INTEGER.eql(Semaphores.semaphore_current_count(var3))) {
            return (SubLObject)module0058.$ic12$;
        }
        Semaphores.semaphore_signal(var3);
        Semaphores.semaphore_signal(var3);
        var4 = Semaphores.semaphore_drain(var3);
        if (!module0058.TWO_INTEGER.eql(var4)) {
            return (SubLObject)module0058.$ic12$;
        }
        if (!module0058.ZERO_INTEGER.eql(Semaphores.semaphore_current_count(var3))) {
            return (SubLObject)module0058.$ic12$;
        }
        return (SubLObject)module0058.$ic13$;
    }
    
    public static SubLObject f4188(final SubLObject var2) {
        final SubLObject var3 = Semaphores.new_semaphore(var2, (SubLObject)module0058.ZERO_INTEGER);
        SubLObject var4 = (SubLObject)module0058.MINUS_ONE_INTEGER;
        SubLObject var5 = Time.get_internal_real_time();
        Semaphores.semaphore_wait_with_timeout(var3, (SubLObject)module0058.TWO_INTEGER);
        var4 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var5), time_high.$internal_time_units_per_second$.getGlobalValue());
        if (var4.numL((SubLObject)module0058.$ic16$) || var4.numG((SubLObject)module0058.$ic17$)) {
            return (SubLObject)module0058.$ic12$;
        }
        Semaphores.semaphore_signal(var3);
        var5 = Time.get_internal_real_time();
        Semaphores.semaphore_wait_with_timeout(var3, (SubLObject)module0058.TWO_INTEGER);
        var4 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var5), time_high.$internal_time_units_per_second$.getGlobalValue());
        if (var4.numG((SubLObject)module0058.$ic18$)) {
            return (SubLObject)module0058.$ic12$;
        }
        return (SubLObject)module0058.$ic13$;
    }
    
    public static SubLObject f4189(final SubLObject var7) {
        final SubLObject var8 = Sequences.cconcatenate((SubLObject)module0058.$ic21$, var7);
        final SubLObject var9 = Semaphores.new_semaphore(var8, (SubLObject)module0058.ZERO_INTEGER);
        final SubLObject var10 = module0004.f78(var7, (SubLObject)module0058.$ic22$, (SubLObject)ConsesLow.list(var9));
        Threads.sleep((SubLObject)module0058.TWO_INTEGER);
        Threads.kill_process(var10);
        while (module0058.NIL != Threads.valid_process_p(var10)) {
            Threads.sleep((SubLObject)module0058.ONE_INTEGER);
        }
        return (SubLObject)(Semaphores.semaphore_current_count(var9).isZero() ? module0058.$ic13$ : module0058.$ic12$);
    }
    
    public static SubLObject f4190(final SubLObject var1) {
        Semaphores.semaphore_wait(var1);
        return (SubLObject)module0058.$ic12$;
    }
    
    public static SubLObject f4191() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0058", "f4185", "S#5665", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0058", "f4186", "S#5666", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0058", "f4187", "S#5667", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0058", "f4188", "S#5668", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0058", "f4189", "S#5669", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0058", "f4190", "S#5670", 1, 0, false);
        return (SubLObject)module0058.NIL;
    }
    
    public static SubLObject f4192() {
        return (SubLObject)module0058.NIL;
    }
    
    public static SubLObject f4193() {
        module0002.f35((SubLObject)module0058.$ic0$, (SubLObject)module0058.$ic1$);
        module0002.f35((SubLObject)module0058.$ic2$, (SubLObject)module0058.$ic3$);
        module0027.f1449((SubLObject)module0058.$ic4$, (SubLObject)ConsesLow.list(new SubLObject[] { module0058.$ic5$, module0058.NIL, module0058.$ic6$, module0058.NIL, module0058.$ic7$, module0058.NIL, module0058.$ic8$, module0058.$ic9$, module0058.$ic10$, module0058.T }), (SubLObject)module0058.$ic11$);
        module0027.f1449((SubLObject)module0058.$ic14$, (SubLObject)ConsesLow.list(new SubLObject[] { module0058.$ic5$, module0058.NIL, module0058.$ic6$, module0058.NIL, module0058.$ic7$, module0058.NIL, module0058.$ic8$, module0058.$ic9$, module0058.$ic10$, module0058.T }), (SubLObject)module0058.$ic15$);
        module0027.f1449((SubLObject)module0058.$ic19$, (SubLObject)ConsesLow.list(new SubLObject[] { module0058.$ic5$, module0058.NIL, module0058.$ic6$, module0058.NIL, module0058.$ic7$, module0058.NIL, module0058.$ic8$, module0058.$ic9$, module0058.$ic10$, module0058.T }), (SubLObject)module0058.$ic20$);
        return (SubLObject)module0058.NIL;
    }
    
    public void declareFunctions() {
        f4191();
    }
    
    public void initializeVariables() {
        f4192();
    }
    
    public void runTopLevelForms() {
        f4193();
    }
    
    static {
        me = (SubLFile)new module0058();
        $ic0$ = SubLObjectFactory.makeSymbol("S#5665", "CYC");
        $ic1$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEMAPHORE-WAIT"));
        $ic2$ = SubLObjectFactory.makeSymbol("S#5666", "CYC");
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEMAPHORE-SIGNAL"));
        $ic4$ = SubLObjectFactory.makeSymbol("S#5667", "CYC");
        $ic5$ = SubLObjectFactory.makeKeyword("TEST");
        $ic6$ = SubLObjectFactory.makeKeyword("OWNER");
        $ic7$ = SubLObjectFactory.makeKeyword("CLASSES");
        $ic8$ = SubLObjectFactory.makeKeyword("KB");
        $ic9$ = SubLObjectFactory.makeKeyword("TINY");
        $ic10$ = SubLObjectFactory.makeKeyword("WORKING?");
        $ic11$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Test Semaphore 1")), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")));
        $ic12$ = SubLObjectFactory.makeKeyword("FAILURE");
        $ic13$ = SubLObjectFactory.makeKeyword("SUCCESS");
        $ic14$ = SubLObjectFactory.makeSymbol("S#5668", "CYC");
        $ic15$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Test Semaphore 2")), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")));
        $ic16$ = (SubLFloat)SubLObjectFactory.makeDouble(1.9);
        $ic17$ = (SubLFloat)SubLObjectFactory.makeDouble(3.0);
        $ic18$ = (SubLFloat)SubLObjectFactory.makeDouble(0.5);
        $ic19$ = SubLObjectFactory.makeSymbol("S#5669", "CYC");
        $ic20$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Semaphore Waiting Process")), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")));
        $ic21$ = SubLObjectFactory.makeString("Semaphore for ");
        $ic22$ = SubLObjectFactory.makeSymbol("S#5670", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0058.class
	Total time: 49 ms
	
	Decompiled with Procyon 0.5.32.
*/