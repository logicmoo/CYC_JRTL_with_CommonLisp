package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0805 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0805";
    public static final String myFingerPrint = "512718550c84fdb9043fa6cdac72b0855b38de788c65c626ade68454bfd1f5e3";
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLString $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLString $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLString $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLString $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLString $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLString $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    
    public static SubLObject f51252(SubLObject var1) {
        if (var1 == module0805.UNPROVIDED) {
            var1 = (SubLObject)module0805.NIL;
        }
        module0027.f1434((SubLObject)module0805.$ic1$, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED);
        module0027.f1434((SubLObject)module0805.$ic2$, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED);
        return (SubLObject)module0805.$ic3$;
    }
    
    public static SubLObject f51253(SubLObject var1) {
        if (var1 == module0805.UNPROVIDED) {
            var1 = (SubLObject)module0805.$ic4$;
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        assert module0805.NIL != Types.keywordp(var1) : var1;
        module0421.f29432(module0421.f29383((SubLObject)module0805.$ic6$, (SubLObject)module0805.UNPROVIDED));
        final SubLObject var3 = var1;
        if (var3.eql((SubLObject)module0805.$ic4$)) {
            module0421.f29414((SubLObject)module0805.$ic7$, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED);
        }
        else if (var3.eql((SubLObject)module0805.$ic8$)) {
            module0421.f29414((SubLObject)module0805.$ic7$, (SubLObject)module0805.T, (SubLObject)module0805.T, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED);
        }
        else if (var3.eql((SubLObject)module0805.$ic9$)) {
            final SubLObject var4 = module0421.$g3431$.currentBinding(var2);
            final SubLObject var5 = module0421.$g3432$.currentBinding(var2);
            try {
                module0421.$g3431$.bind((SubLObject)module0805.T, var2);
                module0421.$g3432$.bind((SubLObject)module0805.T, var2);
                module0421.f29434();
                module0421.f29414((SubLObject)module0805.$ic7$, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED);
            }
            finally {
                module0421.$g3432$.rebind(var5, var2);
                module0421.$g3431$.rebind(var4, var2);
            }
        }
        return (SubLObject)module0805.$ic3$;
    }
    
    public static SubLObject f51254() {
        Eval.load(module0421.f29383((SubLObject)module0805.$ic10$, (SubLObject)module0805.UNPROVIDED));
        module0027.f1434((SubLObject)module0805.$ic11$, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED);
        return (SubLObject)module0805.$ic3$;
    }
    
    public static SubLObject f51255(SubLObject var1) {
        if (var1 == module0805.UNPROVIDED) {
            var1 = (SubLObject)module0805.NIL;
        }
        f51254();
        module0421.f29432(module0421.f29383((SubLObject)module0805.$ic12$, (SubLObject)module0805.UNPROVIDED));
        if (module0805.NIL != var1) {
            module0421.f29414((SubLObject)module0805.$ic13$, (SubLObject)module0805.T, (SubLObject)module0805.T, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED);
        }
        else {
            module0421.f29414((SubLObject)module0805.$ic13$, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED);
        }
        return (SubLObject)module0805.$ic3$;
    }
    
    public static SubLObject f51256() {
        return module0027.f1434((SubLObject)module0805.$ic15$, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED);
    }
    
    public static SubLObject f51257(SubLObject var1) {
        if (var1 == module0805.UNPROVIDED) {
            var1 = (SubLObject)module0805.NIL;
        }
        module0027.f1434((SubLObject)module0805.$ic17$, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED);
        module0027.f1434((SubLObject)module0805.$ic18$, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED);
        module0027.f1434((SubLObject)module0805.$ic19$, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED);
        return (SubLObject)module0805.$ic3$;
    }
    
    public static SubLObject f51258() {
        module0027.f1434((SubLObject)module0805.$ic20$, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED);
        return (SubLObject)module0805.$ic3$;
    }
    
    public static SubLObject f51259() {
        module0027.f1434((SubLObject)module0805.$ic21$, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED);
        return (SubLObject)module0805.$ic3$;
    }
    
    public static SubLObject f51260(SubLObject var1) {
        if (var1 == module0805.UNPROVIDED) {
            var1 = (SubLObject)module0805.NIL;
        }
        module0421.f29432(module0421.f29383((SubLObject)module0805.$ic22$, (SubLObject)module0805.UNPROVIDED));
        if (module0805.NIL != var1) {
            module0421.f29414((SubLObject)module0805.$ic23$, (SubLObject)module0805.T, (SubLObject)module0805.T, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED);
        }
        else {
            module0421.f29414((SubLObject)module0805.$ic23$, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED);
        }
        return (SubLObject)module0805.$ic3$;
    }
    
    public static SubLObject f51261(SubLObject var1) {
        if (var1 == module0805.UNPROVIDED) {
            var1 = (SubLObject)module0805.NIL;
        }
        module0421.f29432(module0421.f29383((SubLObject)module0805.$ic24$, (SubLObject)module0805.UNPROVIDED));
        if (module0805.NIL != var1) {
            module0421.f29414((SubLObject)module0805.$ic25$, (SubLObject)module0805.T, (SubLObject)module0805.T, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED);
        }
        else {
            module0421.f29414((SubLObject)module0805.$ic25$, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED);
        }
        return (SubLObject)module0805.$ic3$;
    }
    
    public static SubLObject f51262(SubLObject var1) {
        if (var1 == module0805.UNPROVIDED) {
            var1 = (SubLObject)module0805.NIL;
        }
        module0421.f29432(module0421.f29383((SubLObject)module0805.$ic24$, (SubLObject)module0805.UNPROVIDED));
        if (module0805.NIL != var1) {
            module0421.f29414((SubLObject)module0805.$ic26$, (SubLObject)module0805.T, (SubLObject)module0805.T, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED);
        }
        else {
            module0421.f29414((SubLObject)module0805.$ic26$, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED);
        }
        return (SubLObject)module0805.$ic3$;
    }
    
    public static SubLObject f51263(SubLObject var1) {
        if (var1 == module0805.UNPROVIDED) {
            var1 = (SubLObject)module0805.NIL;
        }
        module0421.f29432(module0421.f29383((SubLObject)module0805.$ic24$, (SubLObject)module0805.UNPROVIDED));
        if (module0805.NIL != var1) {
            module0421.f29414((SubLObject)module0805.$ic27$, (SubLObject)module0805.T, (SubLObject)module0805.T, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED);
        }
        else {
            module0421.f29414((SubLObject)module0805.$ic27$, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED);
        }
        return (SubLObject)module0805.$ic3$;
    }
    
    public static SubLObject f51264(SubLObject var1) {
        if (var1 == module0805.UNPROVIDED) {
            var1 = (SubLObject)module0805.NIL;
        }
        module0421.f29432(module0421.f29383((SubLObject)module0805.$ic28$, (SubLObject)module0805.UNPROVIDED));
        if (module0805.NIL != var1) {
            module0421.f29414((SubLObject)module0805.$ic29$, (SubLObject)module0805.T, (SubLObject)module0805.T, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED);
        }
        else {
            module0421.f29414((SubLObject)module0805.$ic29$, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED);
        }
        return (SubLObject)module0805.$ic3$;
    }
    
    public static SubLObject f51265(SubLObject var1) {
        if (var1 == module0805.UNPROVIDED) {
            var1 = (SubLObject)module0805.NIL;
        }
        f51258();
        f51259();
        return (SubLObject)module0805.$ic3$;
    }
    
    public static SubLObject f51266(SubLObject var1) {
        if (var1 == module0805.UNPROVIDED) {
            var1 = (SubLObject)module0805.NIL;
        }
        module0027.f1434((SubLObject)module0805.$ic32$, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED, (SubLObject)module0805.UNPROVIDED);
        return (SubLObject)module0805.$ic3$;
    }
    
    public static SubLObject f51267() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0805", "f51252", "RUN-LEX-ACCESS-TESTS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0805", "f51253", "S#55842", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0805", "f51254", "S#55843", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0805", "f51255", "S#55844", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0805", "f51256", "RUN-LINK-PARSER-TESTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0805", "f51257", "RUN-PSP-TESTS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0805", "f51258", "S#55845", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0805", "f51259", "S#55846", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0805", "f51260", "S#55847", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0805", "f51261", "S#55848", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0805", "f51262", "S#55849", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0805", "f51263", "S#55850", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0805", "f51264", "S#55851", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0805", "f51265", "RUN-TP-TESTS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0805", "f51266", "RUN-PPH-TESTS", 0, 1, false);
        return (SubLObject)module0805.NIL;
    }
    
    public static SubLObject f51268() {
        return (SubLObject)module0805.NIL;
    }
    
    public static SubLObject f51269() {
        module0002.f38((SubLObject)module0805.$ic0$);
        module0002.f38((SubLObject)module0805.$ic14$);
        module0002.f38((SubLObject)module0805.$ic16$);
        module0002.f38((SubLObject)module0805.$ic30$);
        module0002.f38((SubLObject)module0805.$ic31$);
        return (SubLObject)module0805.NIL;
    }
    
    public void declareFunctions() {
        f51267();
    }
    
    public void initializeVariables() {
        f51268();
    }
    
    public void runTopLevelForms() {
        f51269();
    }
    
    static {
        me = (SubLFile)new module0805();
        $ic0$ = SubLObjectFactory.makeSymbol("RUN-LEX-ACCESS-TESTS");
        $ic1$ = SubLObjectFactory.makeSymbol("DENOTS-OF-STRING");
        $ic2$ = SubLObjectFactory.makeSymbol("DENOTATION-MAPPER");
        $ic3$ = SubLObjectFactory.makeSymbol("S#127", "CYC");
        $ic4$ = SubLObjectFactory.makeKeyword("NONE");
        $ic5$ = SubLObjectFactory.makeSymbol("KEYWORDP");
        $ic6$ = SubLObjectFactory.makeString("lexical-semantics");
        $ic7$ = SubLObjectFactory.makeKeyword("LEXICAL-SEMANTICS");
        $ic8$ = SubLObjectFactory.makeKeyword("ALL");
        $ic9$ = SubLObjectFactory.makeKeyword("FAIL");
        $ic10$ = SubLObjectFactory.makeString("regular-morphological-forms");
        $ic11$ = SubLObjectFactory.makeSymbol("S#48642", "CYC");
        $ic12$ = SubLObjectFactory.makeString("regular-morphology");
        $ic13$ = SubLObjectFactory.makeKeyword("REGULAR-MORPHOLOGY");
        $ic14$ = SubLObjectFactory.makeSymbol("RUN-LINK-PARSER-TESTS");
        $ic15$ = SubLObjectFactory.makeSymbol("S#55852", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("RUN-PSP-TESTS");
        $ic17$ = SubLObjectFactory.makeSymbol("S#55853", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#55854", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#55855", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#55856", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#55857", "CYC");
        $ic22$ = SubLObjectFactory.makeString("pred-strengthener");
        $ic23$ = SubLObjectFactory.makeKeyword("PRED-STRENGTHENER");
        $ic24$ = SubLObjectFactory.makeString("rkf-term-reader");
        $ic25$ = SubLObjectFactory.makeKeyword("RKF-TERM-READER");
        $ic26$ = SubLObjectFactory.makeKeyword("RKF-SENTENCE-READER");
        $ic27$ = SubLObjectFactory.makeKeyword("RKF-MTS");
        $ic28$ = SubLObjectFactory.makeString("rtp-test");
        $ic29$ = SubLObjectFactory.makeKeyword("RTP");
        $ic30$ = SubLObjectFactory.makeSymbol("RUN-TP-TESTS");
        $ic31$ = SubLObjectFactory.makeSymbol("RUN-PPH-TESTS");
        $ic32$ = SubLObjectFactory.makeSymbol("GENERATE-TEXT-W/SENTENTIAL-FORCE");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0805.class
	Total time: 77 ms
	
	Decompiled with Procyon 0.5.32.
*/