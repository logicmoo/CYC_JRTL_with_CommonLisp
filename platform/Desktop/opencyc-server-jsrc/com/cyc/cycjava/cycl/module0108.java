package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0108 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0108";
    public static final String myFingerPrint = "f8996971d68b9b5da073138174425405ee54fa749d025d926d38bec6d8198182";
    public static SubLSymbol $g1368$;
    public static SubLSymbol $g1369$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLList $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLList $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLString $ic19$;
    private static final SubLString $ic20$;
    private static final SubLList $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLList $ic25$;
    private static final SubLString $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLList $ic28$;
    
    public static SubLObject f7640(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0108.$ic0$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        final SubLObject var6 = (SubLObject)(var4.isCons() ? var4.first() : module0108.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0108.$ic0$);
        var4 = var4.rest();
        if (module0108.NIL == var4) {
            final SubLObject var7;
            var4 = (var7 = var5);
            final SubLObject var8 = (SubLObject)module0108.$ic1$;
            return (SubLObject)ConsesLow.list((SubLObject)module0108.$ic2$, (SubLObject)ConsesLow.list((SubLObject)module0108.$ic3$, var8), (SubLObject)ConsesLow.list((SubLObject)module0108.$ic4$, var8, reader.bq_cons((SubLObject)module0108.$ic5$, ConsesLow.append(var7, (SubLObject)module0108.NIL))), (SubLObject)ConsesLow.list((SubLObject)module0108.$ic6$, var6, var8));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0108.$ic0$);
        return (SubLObject)module0108.NIL;
    }
    
    public static SubLObject f7641(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0108.$ic7$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0108.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0108.$ic7$);
        var6 = var4.first();
        var4 = var4.rest();
        if (module0108.NIL == var4) {
            final SubLObject var7;
            var4 = (var7 = var5);
            final SubLObject var8 = (SubLObject)module0108.$ic8$;
            return (SubLObject)ConsesLow.list((SubLObject)module0108.$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0108.$ic9$, (SubLObject)ConsesLow.listS((SubLObject)module0108.$ic10$, var6, (SubLObject)module0108.$ic11$)), var8), (SubLObject)ConsesLow.list((SubLObject)module0108.$ic4$, var8, reader.bq_cons((SubLObject)module0108.$ic5$, ConsesLow.append(var7, (SubLObject)module0108.NIL))), (SubLObject)ConsesLow.list((SubLObject)module0108.$ic12$, (SubLObject)module0108.$ic13$, (SubLObject)ConsesLow.listS((SubLObject)module0108.$ic14$, var8, (SubLObject)module0108.$ic15$)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0108.$ic7$);
        return (SubLObject)module0108.NIL;
    }
    
    public static SubLObject f7642() {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        return module0108.$g1368$.getDynamicValue(var14);
    }
    
    public static SubLObject f7643(final SubLObject var6, final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        if (module0108.NIL == var6 || (var6.isStream() && module0108.NIL != streams_high.output_stream_p(var6))) {
            final SubLObject var10 = StreamsLow.$debug_io$.currentBinding(var9);
            try {
                StreamsLow.$debug_io$.bind((module0108.NIL != var6) ? var6 : StreamsLow.$debug_io$.getDynamicValue(var9), var9);
                SubLObject var11 = (SubLObject)module0108.ZERO_INTEGER;
                SubLObject var12;
                for (var12 = module0066.f4838(module0067.f4891(f7642())); module0108.NIL == module0066.f4841(var12); var12 = module0066.f4840(var12)) {
                    var9.resetMultipleValues();
                    final SubLObject var13 = module0066.f4839(var12);
                    final SubLObject var14 = var9.secondMultipleValue();
                    var9.resetMultipleValues();
                    if (!var13.eql((SubLObject)module0108.$ic18$)) {
                        var11 = Numbers.add(var11, f7644(var14));
                    }
                }
                module0066.f4842(var12);
                final SubLObject var15 = Numbers.subtract(var8, var11);
                if (module0108.NIL == Errors.$ignore_mustsP$.getDynamicValue(var9) && module0108.NIL == module0048.f3294(var15)) {
                    Errors.error((SubLObject)module0108.$ic19$, module0051.f3574(var11, (SubLObject)module0108.UNPROVIDED), module0051.f3574(var8, (SubLObject)module0108.UNPROVIDED));
                }
                if (var15.isPositive()) {
                    module0067.f4886(f7642(), (SubLObject)module0108.$ic18$, var15);
                }
                PrintLow.format(StreamsLow.$debug_io$.getDynamicValue(var9), (SubLObject)module0108.$ic20$, module0051.f3574(var8, (SubLObject)module0108.UNPROVIDED));
                SubLObject var16 = module0084.f5795(f7642(), (SubLObject)module0108.$ic22$);
                SubLObject var17 = (SubLObject)module0108.NIL;
                var17 = var16.first();
                while (module0108.NIL != var16) {
                    SubLObject var19;
                    final SubLObject var18 = var19 = var17;
                    SubLObject var20 = (SubLObject)module0108.NIL;
                    SubLObject var21 = (SubLObject)module0108.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var19, var18, (SubLObject)module0108.$ic21$);
                    var20 = var19.first();
                    var19 = (var21 = var19.rest());
                    f7645(var20, var21, var8);
                    var16 = var16.rest();
                    var17 = var16.first();
                }
            }
            finally {
                StreamsLow.$debug_io$.rebind(var10, var9);
            }
        }
        return (SubLObject)module0108.NIL;
    }
    
    public static SubLObject f7646(final SubLObject var25, final SubLObject var26) {
        return Numbers.numG(f7644(var25), f7644(var26));
    }
    
    public static SubLObject f7644(final SubLObject var19) {
        if (var19.isNumber()) {
            return var19;
        }
        if (module0108.NIL != module0067.f4852(var19)) {
            return module0067.f4885(var19, (SubLObject)module0108.$ic23$, (SubLObject)module0108.UNPROVIDED);
        }
        return (SubLObject)module0108.NIL;
    }
    
    public static SubLObject f7645(final SubLObject var18, final SubLObject var19, final SubLObject var8) {
        f7647(var18, var19, var8, (SubLObject)module0108.ZERO_INTEGER);
        return (SubLObject)module0108.NIL;
    }
    
    public static SubLObject f7647(final SubLObject var18, final SubLObject var19, final SubLObject var8, final SubLObject var27) {
        assert module0108.NIL != module0048.f3294(var8) : var8;
        if (var19.isNumber()) {
            f7648(var18, var19, var8, var27);
        }
        else if (module0108.NIL != module0067.f4852(var19)) {
            final SubLObject var28 = module0067.f4885(var19, (SubLObject)module0108.$ic23$, (SubLObject)module0108.UNPROVIDED);
            f7648(var18, var28, var8, var27);
            SubLObject var29 = module0084.f5795(var19, (SubLObject)module0108.$ic22$);
            SubLObject var30 = (SubLObject)module0108.NIL;
            var30 = var29.first();
            while (module0108.NIL != var29) {
                SubLObject var32;
                final SubLObject var31 = var32 = var30;
                SubLObject var33 = (SubLObject)module0108.NIL;
                SubLObject var34 = (SubLObject)module0108.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)module0108.$ic25$);
                var33 = var32.first();
                var32 = (var34 = var32.rest());
                if (!var33.eql((SubLObject)module0108.$ic23$)) {
                    f7647(var33, var34, var28, module0048.f_1X(var27));
                }
                var29 = var29.rest();
                var30 = var29.first();
            }
        }
        return (SubLObject)module0108.NIL;
    }
    
    public static SubLObject f7648(final SubLObject var18, final SubLObject var13, final SubLObject var8, final SubLObject var27) {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        assert module0108.NIL != module0048.f3294(var13) : var13;
        PrintLow.format(StreamsLow.$debug_io$.getDynamicValue(var28), (SubLObject)module0108.$ic26$, new SubLObject[] { Strings.make_string(var27, (SubLObject)Characters.CHAR_space), var18, module0051.f3574(var13, (SubLObject)module0108.UNPROVIDED), module0048.f3313(var13, var8, (SubLObject)module0108.T) });
        return (SubLObject)module0108.NIL;
    }
    
    public static SubLObject f7649(final SubLObject var13, final SubLObject var33, final SubLObject var34) {
        if (module0108.NIL != module0107.f7629(var33)) {
            SubLObject var35 = (SubLObject)module0108.NIL;
            SubLObject var36 = (SubLObject)module0108.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var34, var34, (SubLObject)module0108.$ic28$);
            var35 = var34.first();
            final SubLObject var37 = var36 = var34.rest();
            final SubLObject var38 = f7650(var33, var36);
            f7651(var38, var35, var13);
        }
        return (SubLObject)module0108.NIL;
    }
    
    public static SubLObject f7650(final SubLObject var33, final SubLObject var38) {
        SubLObject var39 = var33;
        SubLObject var40 = (SubLObject)module0108.NIL;
        SubLObject var41 = Sequences.reverse(var38);
        SubLObject var42 = (SubLObject)module0108.NIL;
        var42 = var41.first();
        while (module0108.NIL != var41) {
            var40 = var39;
            var39 = module0067.f4885(var40, var42, (SubLObject)module0108.ZERO_INTEGER);
            if (var39.isNumber()) {
                final SubLObject var43 = var39;
                var39 = module0067.f4880(Symbols.symbol_function((SubLObject)module0108.EQL), (SubLObject)module0108.UNPROVIDED);
                module0067.f4886(var39, (SubLObject)module0108.$ic23$, var43);
                module0067.f4886(var40, var42, var39);
            }
            var41 = var41.rest();
            var42 = var41.first();
        }
        return var39;
    }
    
    public static SubLObject f7651(final SubLObject var39, final SubLObject var12, final SubLObject var13) {
        final SubLObject var40 = module0067.f4885(var39, var12, (SubLObject)module0108.ZERO_INTEGER);
        if (var40.isNumber()) {
            module0084.f5775(var39, var12, var13);
        }
        else {
            module0084.f5775(var40, (SubLObject)module0108.$ic23$, var13);
        }
        return var40;
    }
    
    public static SubLObject f7652() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0108", "f7640", "S#9622");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0108", "f7641", "S#9623");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0108", "f7642", "S#9624", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0108", "f7643", "S#9625", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0108", "f7646", "S#9626", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0108", "f7644", "S#9627", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0108", "f7645", "S#9628", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0108", "f7647", "S#9629", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0108", "f7648", "S#9630", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0108", "f7649", "S#9631", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0108", "f7650", "S#9632", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0108", "f7651", "S#9633", 3, 0, false);
        return (SubLObject)module0108.NIL;
    }
    
    public static SubLObject f7653() {
        module0108.$g1368$ = SubLFiles.defparameter("S#9634", module0107.f7627());
        module0108.$g1369$ = SubLFiles.defparameter("S#9635", (SubLObject)module0108.NIL);
        return (SubLObject)module0108.NIL;
    }
    
    public static SubLObject f7654() {
        module0002.f50((SubLObject)module0108.$ic16$, (SubLObject)module0108.$ic17$);
        module0002.f50((SubLObject)module0108.$ic6$, (SubLObject)module0108.$ic17$);
        module0002.f50((SubLObject)module0108.$ic14$, (SubLObject)module0108.$ic27$);
        return (SubLObject)module0108.NIL;
    }
    
    public void declareFunctions() {
        f7652();
    }
    
    public void initializeVariables() {
        f7653();
    }
    
    public void runTopLevelForms() {
        f7654();
    }
    
    static {
        me = (SubLFile)new module0108();
        module0108.$g1368$ = null;
        module0108.$g1369$ = null;
        $ic0$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic1$ = SubLObjectFactory.makeUninternedSymbol("US#3BCD0F7");
        $ic2$ = SubLObjectFactory.makeSymbol("CLET");
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9634", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-DICTIONARY")));
        $ic4$ = SubLObjectFactory.makeSymbol("CTIME");
        $ic5$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic6$ = SubLObjectFactory.makeSymbol("S#9625", "CYC");
        $ic7$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9636", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic8$ = SubLObjectFactory.makeUninternedSymbol("US#326A0D5");
        $ic9$ = SubLObjectFactory.makeSymbol("S#9635", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("CONS");
        $ic11$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9635", "CYC"));
        $ic12$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic13$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#361", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9624", "CYC")));
        $ic14$ = SubLObjectFactory.makeSymbol("S#9631", "CYC");
        $ic15$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9624", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("S#9635", "CYC"));
        $ic16$ = SubLObjectFactory.makeSymbol("S#9624", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#9622", "CYC");
        $ic18$ = SubLObjectFactory.makeKeyword("UNCATEGORIZED");
        $ic19$ = SubLObjectFactory.makeString("Categorized time (~S) is greater than total time (~S)!");
        $ic20$ = SubLObjectFactory.makeString("~&Timing data (total time ~A):~%");
        $ic21$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9637", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1625", "CYC"));
        $ic22$ = SubLObjectFactory.makeSymbol("S#9626", "CYC");
        $ic23$ = SubLObjectFactory.makeKeyword("TOTAL-TIME");
        $ic24$ = SubLObjectFactory.makeSymbol("S#65", "CYC");
        $ic25$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9638", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9639", "CYC"));
        $ic26$ = SubLObjectFactory.makeString("~&~A~S: ~A (~D%)~%");
        $ic27$ = SubLObjectFactory.makeSymbol("S#9623", "CYC");
        $ic28$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9640", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9641", "CYC"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0108.class
	Total time: 89 ms
	
	Decompiled with Procyon 0.5.32.
*/