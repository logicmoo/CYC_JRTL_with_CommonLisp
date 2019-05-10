package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        final SubLObject var3 = Semaphores.new_semaphore(var2, (SubLObject)ZERO_INTEGER);
        SubLObject var4 = (SubLObject)NIL;
        if (!ZERO_INTEGER.eql(Semaphores.semaphore_current_count(var3))) {
            return (SubLObject)$ic12$;
        }
        var4 = Semaphores.semaphore_drain(var3);
        if (!ZERO_INTEGER.eql(var4)) {
            return (SubLObject)$ic12$;
        }
        if (!ZERO_INTEGER.eql(Semaphores.semaphore_current_count(var3))) {
            return (SubLObject)$ic12$;
        }
        Semaphores.semaphore_signal(var3);
        var4 = Semaphores.semaphore_drain(var3);
        if (!ONE_INTEGER.eql(var4)) {
            return (SubLObject)$ic12$;
        }
        if (!ZERO_INTEGER.eql(Semaphores.semaphore_current_count(var3))) {
            return (SubLObject)$ic12$;
        }
        Semaphores.semaphore_signal(var3);
        Semaphores.semaphore_signal(var3);
        var4 = Semaphores.semaphore_drain(var3);
        if (!TWO_INTEGER.eql(var4)) {
            return (SubLObject)$ic12$;
        }
        if (!ZERO_INTEGER.eql(Semaphores.semaphore_current_count(var3))) {
            return (SubLObject)$ic12$;
        }
        return (SubLObject)$ic13$;
    }
    
    public static SubLObject f4188(final SubLObject var2) {
        final SubLObject var3 = Semaphores.new_semaphore(var2, (SubLObject)ZERO_INTEGER);
        SubLObject var4 = (SubLObject)MINUS_ONE_INTEGER;
        SubLObject var5 = Time.get_internal_real_time();
        Semaphores.semaphore_wait_with_timeout(var3, (SubLObject)TWO_INTEGER);
        var4 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var5), time_high.$internal_time_units_per_second$.getGlobalValue());
        if (var4.numL((SubLObject)$ic16$) || var4.numG((SubLObject)$ic17$)) {
            return (SubLObject)$ic12$;
        }
        Semaphores.semaphore_signal(var3);
        var5 = Time.get_internal_real_time();
        Semaphores.semaphore_wait_with_timeout(var3, (SubLObject)TWO_INTEGER);
        var4 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var5), time_high.$internal_time_units_per_second$.getGlobalValue());
        if (var4.numG((SubLObject)$ic18$)) {
            return (SubLObject)$ic12$;
        }
        return (SubLObject)$ic13$;
    }
    
    public static SubLObject f4189(final SubLObject var7) {
        final SubLObject var8 = Sequences.cconcatenate((SubLObject)$ic21$, var7);
        final SubLObject var9 = Semaphores.new_semaphore(var8, (SubLObject)ZERO_INTEGER);
        final SubLObject var10 = module0004.f78(var7, (SubLObject)$ic22$, (SubLObject)ConsesLow.list(var9));
        Threads.sleep((SubLObject)TWO_INTEGER);
        Threads.kill_process(var10);
        while (NIL != Threads.valid_process_p(var10)) {
            Threads.sleep((SubLObject)ONE_INTEGER);
        }
        return (SubLObject)(Semaphores.semaphore_current_count(var9).isZero() ? $ic13$ : $ic12$);
    }
    
    public static SubLObject f4190(final SubLObject var1) {
        Semaphores.semaphore_wait(var1);
        return (SubLObject)$ic12$;
    }
    
    public static SubLObject f4191() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0058", "f4185", "S#5665", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0058", "f4186", "S#5666", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0058", "f4187", "S#5667", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0058", "f4188", "S#5668", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0058", "f4189", "S#5669", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0058", "f4190", "S#5670", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4192() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4193() {
        module0002.f35((SubLObject)$ic0$, (SubLObject)$ic1$);
        module0002.f35((SubLObject)$ic2$, (SubLObject)$ic3$);
        module0027.f1449((SubLObject)$ic4$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic5$, NIL, $ic6$, NIL, $ic7$, NIL, $ic8$, $ic9$, $ic10$, T }), (SubLObject)$ic11$);
        module0027.f1449((SubLObject)$ic14$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic5$, NIL, $ic6$, NIL, $ic7$, NIL, $ic8$, $ic9$, $ic10$, T }), (SubLObject)$ic15$);
        module0027.f1449((SubLObject)$ic19$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic5$, NIL, $ic6$, NIL, $ic7$, NIL, $ic8$, $ic9$, $ic10$, T }), (SubLObject)$ic20$);
        return (SubLObject)NIL;
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
        $ic0$ = makeSymbol("S#5665", "CYC");
        $ic1$ = ConsesLow.list((SubLObject)makeSymbol("SEMAPHORE-WAIT"));
        $ic2$ = makeSymbol("S#5666", "CYC");
        $ic3$ = ConsesLow.list((SubLObject)makeSymbol("SEMAPHORE-SIGNAL"));
        $ic4$ = makeSymbol("S#5667", "CYC");
        $ic5$ = makeKeyword("TEST");
        $ic6$ = makeKeyword("OWNER");
        $ic7$ = makeKeyword("CLASSES");
        $ic8$ = makeKeyword("KB");
        $ic9$ = makeKeyword("TINY");
        $ic10$ = makeKeyword("WORKING?");
        $ic11$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("Test Semaphore 1")), (SubLObject)makeKeyword("SUCCESS")));
        $ic12$ = makeKeyword("FAILURE");
        $ic13$ = makeKeyword("SUCCESS");
        $ic14$ = makeSymbol("S#5668", "CYC");
        $ic15$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("Test Semaphore 2")), (SubLObject)makeKeyword("SUCCESS")));
        $ic16$ = (SubLFloat)makeDouble(1.9);
        $ic17$ = (SubLFloat)makeDouble(3.0);
        $ic18$ = (SubLFloat)makeDouble(0.5);
        $ic19$ = makeSymbol("S#5669", "CYC");
        $ic20$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("Semaphore Waiting Process")), (SubLObject)makeKeyword("SUCCESS")));
        $ic21$ = makeString("Semaphore for ");
        $ic22$ = makeSymbol("S#5670", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 49 ms
	
	Decompiled with Procyon 0.5.32.
*/