package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        module0027.f1434((SubLObject)$ic1$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0027.f1434((SubLObject)$ic2$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)$ic3$;
    }
    
    public static SubLObject f51253(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)$ic4$;
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        assert NIL != Types.keywordp(var1) : var1;
        module0421.f29432(module0421.f29383((SubLObject)$ic6$, (SubLObject)UNPROVIDED));
        final SubLObject var3 = var1;
        if (var3.eql((SubLObject)$ic4$)) {
            module0421.f29414((SubLObject)$ic7$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (var3.eql((SubLObject)$ic8$)) {
            module0421.f29414((SubLObject)$ic7$, (SubLObject)T, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (var3.eql((SubLObject)$ic9$)) {
            final SubLObject var4 = module0421.$g3431$.currentBinding(var2);
            final SubLObject var5 = module0421.$g3432$.currentBinding(var2);
            try {
                module0421.$g3431$.bind((SubLObject)T, var2);
                module0421.$g3432$.bind((SubLObject)T, var2);
                module0421.f29434();
                module0421.f29414((SubLObject)$ic7$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            finally {
                module0421.$g3432$.rebind(var5, var2);
                module0421.$g3431$.rebind(var4, var2);
            }
        }
        return (SubLObject)$ic3$;
    }
    
    public static SubLObject f51254() {
        Eval.load(module0421.f29383((SubLObject)$ic10$, (SubLObject)UNPROVIDED));
        module0027.f1434((SubLObject)$ic11$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)$ic3$;
    }
    
    public static SubLObject f51255(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        f51254();
        module0421.f29432(module0421.f29383((SubLObject)$ic12$, (SubLObject)UNPROVIDED));
        if (NIL != var1) {
            module0421.f29414((SubLObject)$ic13$, (SubLObject)T, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else {
            module0421.f29414((SubLObject)$ic13$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)$ic3$;
    }
    
    public static SubLObject f51256() {
        return module0027.f1434((SubLObject)$ic15$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f51257(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        module0027.f1434((SubLObject)$ic17$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0027.f1434((SubLObject)$ic18$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0027.f1434((SubLObject)$ic19$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)$ic3$;
    }
    
    public static SubLObject f51258() {
        module0027.f1434((SubLObject)$ic20$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)$ic3$;
    }
    
    public static SubLObject f51259() {
        module0027.f1434((SubLObject)$ic21$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)$ic3$;
    }
    
    public static SubLObject f51260(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        module0421.f29432(module0421.f29383((SubLObject)$ic22$, (SubLObject)UNPROVIDED));
        if (NIL != var1) {
            module0421.f29414((SubLObject)$ic23$, (SubLObject)T, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else {
            module0421.f29414((SubLObject)$ic23$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)$ic3$;
    }
    
    public static SubLObject f51261(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        module0421.f29432(module0421.f29383((SubLObject)$ic24$, (SubLObject)UNPROVIDED));
        if (NIL != var1) {
            module0421.f29414((SubLObject)$ic25$, (SubLObject)T, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else {
            module0421.f29414((SubLObject)$ic25$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)$ic3$;
    }
    
    public static SubLObject f51262(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        module0421.f29432(module0421.f29383((SubLObject)$ic24$, (SubLObject)UNPROVIDED));
        if (NIL != var1) {
            module0421.f29414((SubLObject)$ic26$, (SubLObject)T, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else {
            module0421.f29414((SubLObject)$ic26$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)$ic3$;
    }
    
    public static SubLObject f51263(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        module0421.f29432(module0421.f29383((SubLObject)$ic24$, (SubLObject)UNPROVIDED));
        if (NIL != var1) {
            module0421.f29414((SubLObject)$ic27$, (SubLObject)T, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else {
            module0421.f29414((SubLObject)$ic27$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)$ic3$;
    }
    
    public static SubLObject f51264(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        module0421.f29432(module0421.f29383((SubLObject)$ic28$, (SubLObject)UNPROVIDED));
        if (NIL != var1) {
            module0421.f29414((SubLObject)$ic29$, (SubLObject)T, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else {
            module0421.f29414((SubLObject)$ic29$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)$ic3$;
    }
    
    public static SubLObject f51265(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        f51258();
        f51259();
        return (SubLObject)$ic3$;
    }
    
    public static SubLObject f51266(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        module0027.f1434((SubLObject)$ic32$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)$ic3$;
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51268() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51269() {
        module0002.f38((SubLObject)$ic0$);
        module0002.f38((SubLObject)$ic14$);
        module0002.f38((SubLObject)$ic16$);
        module0002.f38((SubLObject)$ic30$);
        module0002.f38((SubLObject)$ic31$);
        return (SubLObject)NIL;
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
        $ic0$ = makeSymbol("RUN-LEX-ACCESS-TESTS");
        $ic1$ = makeSymbol("DENOTS-OF-STRING");
        $ic2$ = makeSymbol("DENOTATION-MAPPER");
        $ic3$ = makeSymbol("S#127", "CYC");
        $ic4$ = makeKeyword("NONE");
        $ic5$ = makeSymbol("KEYWORDP");
        $ic6$ = makeString("lexical-semantics");
        $ic7$ = makeKeyword("LEXICAL-SEMANTICS");
        $ic8$ = makeKeyword("ALL");
        $ic9$ = makeKeyword("FAIL");
        $ic10$ = makeString("regular-morphological-forms");
        $ic11$ = makeSymbol("S#48642", "CYC");
        $ic12$ = makeString("regular-morphology");
        $ic13$ = makeKeyword("REGULAR-MORPHOLOGY");
        $ic14$ = makeSymbol("RUN-LINK-PARSER-TESTS");
        $ic15$ = makeSymbol("S#55852", "CYC");
        $ic16$ = makeSymbol("RUN-PSP-TESTS");
        $ic17$ = makeSymbol("S#55853", "CYC");
        $ic18$ = makeSymbol("S#55854", "CYC");
        $ic19$ = makeSymbol("S#55855", "CYC");
        $ic20$ = makeSymbol("S#55856", "CYC");
        $ic21$ = makeSymbol("S#55857", "CYC");
        $ic22$ = makeString("pred-strengthener");
        $ic23$ = makeKeyword("PRED-STRENGTHENER");
        $ic24$ = makeString("rkf-term-reader");
        $ic25$ = makeKeyword("RKF-TERM-READER");
        $ic26$ = makeKeyword("RKF-SENTENCE-READER");
        $ic27$ = makeKeyword("RKF-MTS");
        $ic28$ = makeString("rtp-test");
        $ic29$ = makeKeyword("RTP");
        $ic30$ = makeSymbol("RUN-TP-TESTS");
        $ic31$ = makeSymbol("RUN-PPH-TESTS");
        $ic32$ = makeSymbol("GENERATE-TEXT-W/SENTENTIAL-FORCE");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 77 ms
	
	Decompiled with Procyon 0.5.32.
*/