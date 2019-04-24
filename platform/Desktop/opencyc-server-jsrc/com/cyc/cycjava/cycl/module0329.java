package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0329 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0329";
    public static final String myFingerPrint = "bede373d7984bd5b17328515bfbd4a0d3697a783b3cc541d5f4c91eecc199902";
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLObject $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLObject $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLObject $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLObject $ic11$;
    private static final SubLSymbol $ic12$;
    
    public static SubLObject f22343(final SubLObject var1) {
        final SubLObject var2 = module0267.f17589(var1);
        if (module0329.NIL == var2) {
            module0229.f15259();
        }
        return var2;
    }
    
    public static SubLObject f22344(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = module0615.f37725(var3, var4);
        if (module0329.NIL == var5) {
            module0229.f15259();
        }
        return var5;
    }
    
    public static SubLObject f22345(final SubLObject var3, final SubLObject var4) {
        SubLObject var5 = module0615.f37725(var3, var4);
        if (module0329.NIL == var5) {
            var5 = module0202.f12768(module0329.$ic2$, var3, var4);
        }
        return var5;
    }
    
    public static SubLObject f22346(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = module0615.f37727(var3, var4);
        if (module0329.NIL == var5) {
            module0229.f15259();
        }
        return var5;
    }
    
    public static SubLObject f22347(final SubLObject var3, final SubLObject var4) {
        SubLObject var5 = module0615.f37727(var3, var4);
        if (module0329.NIL == var5) {
            var5 = module0202.f12768(module0329.$ic5$, var3, var4);
        }
        return var5;
    }
    
    public static SubLObject f22348(final SubLObject var5, final SubLObject var3, final SubLObject var4) {
        final SubLObject var6 = f22349(var5, var3, var4);
        if (module0329.NIL == var6) {
            module0229.f15259();
        }
        return var6;
    }
    
    public static SubLObject f22349(final SubLObject var5, final SubLObject var3, final SubLObject var4) {
        SubLObject var6 = (SubLObject)module0329.NIL;
        if (module0329.NIL != module0614.f37617(var3) && module0329.NIL != module0614.f37669(var4)) {
            final SubLObject var7 = module0615.f37753(var3, var4, (SubLObject)module0329.ZERO_INTEGER);
            if (module0329.NIL != var7) {
                var6 = module0615.f37720(var7, var4, var5);
            }
        }
        return var6;
    }
    
    public static SubLObject f22350(final SubLObject var5, final SubLObject var3, final SubLObject var4) {
        SubLObject var6 = f22349(var5, var3, var4);
        if (module0329.NIL == var6) {
            var6 = module0202.f12769(module0329.$ic8$, var5, var3, var4);
        }
        return var6;
    }
    
    public static SubLObject f22351(final SubLObject var5, final SubLObject var3, final SubLObject var4) {
        final SubLObject var6 = f22352(var5, var3, var4);
        if (module0329.NIL == var6) {
            module0229.f15259();
        }
        return var6;
    }
    
    public static SubLObject f22352(final SubLObject var5, final SubLObject var3, final SubLObject var4) {
        SubLObject var6 = (SubLObject)module0329.NIL;
        if (module0329.NIL != module0614.f37617(var3) && module0329.NIL != module0614.f37669(var4)) {
            final SubLObject var7 = module0615.f37720(var3, var4, (SubLObject)module0329.ZERO_INTEGER);
            if (module0329.NIL != var7) {
                var6 = module0615.f37717(var7, var4, var5);
            }
        }
        return var6;
    }
    
    public static SubLObject f22353(final SubLObject var5, final SubLObject var3, final SubLObject var4) {
        SubLObject var6 = f22352(var5, var3, var4);
        if (module0329.NIL == var6) {
            var6 = module0202.f12769(module0329.$ic11$, var5, var3, var4);
        }
        return var6;
    }
    
    public static SubLObject f22354() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0329", "f22343", "CYC-TEMPORAL-INTERSECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0329", "f22344", "CYC-INTERVAL-ENDED-BY-LAST-SUBINTERVAL-OF-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0329", "f22345", "CYC-EL-INTERVAL-ENDED-BY-LAST-SUBINTERVAL-OF-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0329", "f22346", "CYC-INTERVAL-STARTED-BY-FIRST-SUBINTERVAL-OF-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0329", "f22347", "CYC-EL-INTERVAL-STARTED-BY-FIRST-SUBINTERVAL-OF-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0329", "f22348", "CYC-NTH-METRICALLY-PRECEDING-TIME-INTERVAL-OF-TYPE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0329", "f22349", "S#24876", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0329", "f22350", "CYC-EL-NTH-METRICALLY-PRECEDING-TIME-INTERVAL-OF-TYPE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0329", "f22351", "CYC-NTH-METRICALLY-SUCCEEDING-TIME-INTERVAL-OF-TYPE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0329", "f22352", "S#24877", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0329", "f22353", "CYC-EL-NTH-METRICALLY-SUCCEEDING-TIME-INTERVAL-OF-TYPE", 3, 0, false);
        return (SubLObject)module0329.NIL;
    }
    
    public static SubLObject f22355() {
        return (SubLObject)module0329.NIL;
    }
    
    public static SubLObject f22356() {
        module0012.f416((SubLObject)module0329.$ic0$);
        module0012.f416((SubLObject)module0329.$ic1$);
        module0012.f416((SubLObject)module0329.$ic3$);
        module0012.f416((SubLObject)module0329.$ic4$);
        module0012.f416((SubLObject)module0329.$ic6$);
        module0012.f416((SubLObject)module0329.$ic7$);
        module0012.f416((SubLObject)module0329.$ic9$);
        module0012.f416((SubLObject)module0329.$ic10$);
        module0012.f416((SubLObject)module0329.$ic12$);
        return (SubLObject)module0329.NIL;
    }
    
    public void declareFunctions() {
        f22354();
    }
    
    public void initializeVariables() {
        f22355();
    }
    
    public void runTopLevelForms() {
        f22356();
    }
    
    static {
        me = (SubLFile)new module0329();
        $ic0$ = SubLObjectFactory.makeSymbol("CYC-TEMPORAL-INTERSECTION");
        $ic1$ = SubLObjectFactory.makeSymbol("CYC-INTERVAL-ENDED-BY-LAST-SUBINTERVAL-OF-TYPE");
        $ic2$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("IntervalEndedByLastSubintervalOfTypeFn"));
        $ic3$ = SubLObjectFactory.makeSymbol("CYC-EL-INTERVAL-ENDED-BY-LAST-SUBINTERVAL-OF-TYPE");
        $ic4$ = SubLObjectFactory.makeSymbol("CYC-INTERVAL-STARTED-BY-FIRST-SUBINTERVAL-OF-TYPE");
        $ic5$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("IntervalStartedByFirstSubintervalOfTypeFn"));
        $ic6$ = SubLObjectFactory.makeSymbol("CYC-EL-INTERVAL-STARTED-BY-FIRST-SUBINTERVAL-OF-TYPE");
        $ic7$ = SubLObjectFactory.makeSymbol("CYC-NTH-METRICALLY-PRECEDING-TIME-INTERVAL-OF-TYPE");
        $ic8$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("NthMetricallyPrecedingTimeIntervalOfTypeFn"));
        $ic9$ = SubLObjectFactory.makeSymbol("CYC-EL-NTH-METRICALLY-PRECEDING-TIME-INTERVAL-OF-TYPE");
        $ic10$ = SubLObjectFactory.makeSymbol("CYC-NTH-METRICALLY-SUCCEEDING-TIME-INTERVAL-OF-TYPE");
        $ic11$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("NthMetricallySucceedingTimeIntervalOfTypeFn"));
        $ic12$ = SubLObjectFactory.makeSymbol("CYC-EL-NTH-METRICALLY-SUCCEEDING-TIME-INTERVAL-OF-TYPE");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0329.class
	Total time: 58 ms
	
	Decompiled with Procyon 0.5.32.
*/