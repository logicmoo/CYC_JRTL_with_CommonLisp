package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0215 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0215";
    public static final String myFingerPrint = "e24bb1a532a2637948296ed9434172fae61d8713bd503051d5fe4323af24dcb4";
    private static SubLSymbol $g2384$;
    private static SubLSymbol $g2385$;
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLString $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLList $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLList $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLList $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLList $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLList $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLList $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLList $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLList $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLList $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLList $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLList $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLList $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLList $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLList $ic43$;
    
    public static SubLObject f14153(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0215.$ic1$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0215.NIL;
        SubLObject var7 = (SubLObject)module0215.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0215.$ic1$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0215.$ic1$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)module0215.NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)module0215.NIL;
        SubLObject var11_12 = (SubLObject)module0215.NIL;
        while (module0215.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0215.$ic1$);
            var11_12 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0215.$ic1$);
            if (module0215.NIL == conses_high.member(var11_12, (SubLObject)module0215.$ic2$, (SubLObject)module0215.UNPROVIDED, (SubLObject)module0215.UNPROVIDED)) {
                var10 = (SubLObject)module0215.T;
            }
            if (var11_12 == module0215.$ic3$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0215.NIL != var10 && module0215.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0215.$ic1$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0215.$ic4$, var4);
        final SubLObject var12 = (SubLObject)((module0215.NIL != var11) ? conses_high.cadr(var11) : module0215.NIL);
        final SubLObject var13;
        var4 = (var13 = var5);
        return (SubLObject)ConsesLow.listS((SubLObject)module0215.$ic5$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)module0215.$ic6$, var12), ConsesLow.append(var13, (SubLObject)module0215.NIL));
    }
    
    public static SubLObject f14154() {
        return module0215.$g2385$.getGlobalValue();
    }
    
    public static SubLObject f14155() {
        module0215.$g2385$.setGlobalValue(module0067.f4880(Symbols.symbol_function((SubLObject)module0215.EQL), (SubLObject)module0215.UNPROVIDED));
        return module0215.$g2385$.getGlobalValue();
    }
    
    public static SubLObject f14156(final SubLObject var6, final SubLObject var7) {
        return module0067.f4886(module0215.$g2385$.getGlobalValue(), var6, var7);
    }
    
    public static SubLObject f14157(final SubLObject var6) {
        return module0067.f4887(module0215.$g2385$.getGlobalValue(), var6);
    }
    
    public static SubLObject f14158(final SubLObject var6) {
        return module0067.f4884(module0215.$g2385$.getGlobalValue(), var6, (SubLObject)module0215.UNPROVIDED);
    }
    
    public static SubLObject f14159(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        final SubLObject var18 = f14158(var16);
        if (module0215.NIL != var18 && var16.eql(f14160(var18, (SubLObject)module0215.$ic9$))) {
            return var18;
        }
        SubLObject var19;
        for (var19 = module0066.f4838(module0067.f4891(f14154())); module0215.NIL == module0066.f4841(var19); var19 = module0066.f4840(var19)) {
            var17.resetMultipleValues();
            final SubLObject var20 = module0066.f4839(var19);
            final SubLObject var21 = var17.secondMultipleValue();
            var17.resetMultipleValues();
            if (var16.eql(f14160(var20, (SubLObject)module0215.$ic9$))) {
                return var20;
            }
        }
        module0066.f4842(var19);
        return (SubLObject)module0215.NIL;
    }
    
    public static SubLObject f14161(final SubLObject var19, final SubLObject var20, SubLObject var21) {
        if (var21 == module0215.UNPROVIDED) {
            var21 = (SubLObject)module0215.NIL;
        }
        return conses_high.getf(var19, var20, var21);
    }
    
    public static SubLObject f14160(final SubLObject var6, final SubLObject var20) {
        return conses_high.getf(f14158(var6), var20, (SubLObject)module0215.UNPROVIDED);
    }
    
    public static SubLObject f14162(final SubLObject var6, final SubLObject var7) {
        f14156(var6, var7);
        return var6;
    }
    
    public static SubLObject f14163(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        SubLObject var24 = (SubLObject)module0215.NIL;
        SubLObject var25 = (SubLObject)module0215.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var22, var22, (SubLObject)module0215.$ic10$);
        var24 = var22.first();
        final SubLObject var26 = var25 = var22.rest();
        final SubLObject var27 = f14159(var24);
        if (module0215.NIL == Errors.$ignore_mustsP$.getDynamicValue(var23) && module0215.NIL == var27) {
            Errors.error((SubLObject)module0215.$ic11$, var24);
        }
        final SubLObject var28 = f14160(var27, (SubLObject)module0215.$ic12$);
        final SubLObject var29 = Sequences.length(var25);
        final SubLObject var30 = ConsesLow.nth(var29, var28);
        final SubLObject var31 = f14161(var30, (SubLObject)module0215.$ic13$, module0215.$g2384$.getGlobalValue());
        return var31;
    }
    
    public static SubLObject f14164() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0215", "f14153", "S#17024");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0215", "f14154", "S#17025", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0215", "f14155", "S#17026", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0215", "f14156", "S#17027", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0215", "f14157", "S#17028", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0215", "f14158", "S#17029", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0215", "f14159", "S#17030", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0215", "f14161", "S#17031", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0215", "f14160", "S#17032", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0215", "f14162", "S#17033", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0215", "f14163", "S#16587", 1, 0, false);
        return (SubLObject)module0215.NIL;
    }
    
    public static SubLObject f14165() {
        module0215.$g2384$ = SubLFiles.deflexical("S#17034", Symbols.symbol_function((SubLObject)module0215.EQL));
        module0215.$g2385$ = SubLFiles.deflexical("S#17035", (module0215.NIL != Symbols.boundp((SubLObject)module0215.$ic0$)) ? module0215.$g2385$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)module0215.EQL), (SubLObject)module0215.UNPROVIDED));
        return (SubLObject)module0215.NIL;
    }
    
    public static SubLObject f14166() {
        module0003.f57((SubLObject)module0215.$ic0$);
        module0002.f50((SubLObject)module0215.$ic7$, (SubLObject)module0215.$ic8$);
        f14162((SubLObject)module0215.$ic14$, (SubLObject)module0215.$ic15$);
        f14162((SubLObject)module0215.$ic16$, (SubLObject)module0215.$ic17$);
        f14162((SubLObject)module0215.$ic18$, (SubLObject)module0215.$ic19$);
        f14162((SubLObject)module0215.$ic20$, (SubLObject)module0215.$ic21$);
        f14162((SubLObject)module0215.$ic22$, (SubLObject)module0215.$ic23$);
        f14162((SubLObject)module0215.$ic24$, (SubLObject)module0215.$ic25$);
        f14162((SubLObject)module0215.$ic26$, (SubLObject)module0215.$ic27$);
        f14162((SubLObject)module0215.$ic28$, (SubLObject)module0215.$ic29$);
        f14162((SubLObject)module0215.$ic30$, (SubLObject)module0215.$ic31$);
        f14162((SubLObject)module0215.$ic32$, (SubLObject)module0215.$ic33$);
        f14162((SubLObject)module0215.$ic34$, (SubLObject)module0215.$ic35$);
        f14162((SubLObject)module0215.$ic36$, (SubLObject)module0215.$ic37$);
        f14162((SubLObject)module0215.$ic38$, (SubLObject)module0215.$ic39$);
        f14162((SubLObject)module0215.$ic40$, (SubLObject)module0215.$ic41$);
        f14162((SubLObject)module0215.$ic42$, (SubLObject)module0215.$ic43$);
        return (SubLObject)module0215.NIL;
    }
    
    public void declareFunctions() {
        f14164();
    }
    
    public void initializeVariables() {
        f14165();
    }
    
    public void runTopLevelForms() {
        f14166();
    }
    
    static {
        me = (SubLFile)new module0215();
        module0215.$g2384$ = null;
        module0215.$g2385$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#17035", "CYC");
        $ic1$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#134", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#138", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic3$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic4$ = SubLObjectFactory.makeKeyword("DONE");
        $ic5$ = SubLObjectFactory.makeSymbol("DO-DICTIONARY");
        $ic6$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#17025", "CYC"));
        $ic7$ = SubLObjectFactory.makeSymbol("S#17025", "CYC");
        $ic8$ = SubLObjectFactory.makeSymbol("S#17024", "CYC");
        $ic9$ = SubLObjectFactory.makeKeyword("TOP-LEVEL-KEY");
        $ic10$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#17036", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5234", "CYC"));
        $ic11$ = SubLObjectFactory.makeString("Could not find an index with top-level key ~S");
        $ic12$ = SubLObjectFactory.makeKeyword("KEYS");
        $ic13$ = SubLObjectFactory.makeKeyword("EQUAL-TEST");
        $ic14$ = SubLObjectFactory.makeKeyword("GAF-ARG");
        $ic15$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("GAF Arg"), SubLObjectFactory.makeKeyword("DOMAIN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("term"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXED-TERM-P")), SubLObjectFactory.makeKeyword("TOP-LEVEL-KEY"), SubLObjectFactory.makeKeyword("GAF-ARG"), SubLObjectFactory.makeKeyword("KEYS"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("argnum"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P"), (SubLObject)SubLObjectFactory.makeKeyword("EQUAL-TEST"), (SubLObject)module0215.EQL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("pred"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P"), (SubLObject)SubLObjectFactory.makeKeyword("RELEVANCE-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#12350", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("EQUAL-TEST"), (SubLObject)module0215.EQL), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("mt"), SubLObjectFactory.makeKeyword("MT?"), module0215.T, SubLObjectFactory.makeKeyword("VALIDITY-TEST"), SubLObjectFactory.makeSymbol("S#12263", "CYC"), SubLObjectFactory.makeKeyword("RELEVANCE-TEST"), SubLObjectFactory.makeSymbol("RELEVANT-MT?"), SubLObjectFactory.makeKeyword("EQUAL-TEST"), module0215.EQUAL })), SubLObjectFactory.makeKeyword("RANGE"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("gaf"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#11995", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("A gaf assertion in mt MT with predicate PRED which mentions TERM\nin position ARGNUM")), SubLObjectFactory.makeKeyword("DUPLICATE-VALUES?"), module0215.T, SubLObjectFactory.makeKeyword("NUM-FUNCTION"), SubLObjectFactory.makeSymbol("NUM-GAF-ARG-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION"), SubLObjectFactory.makeSymbol("RELEVANT-NUM-GAF-ARG-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), SubLObjectFactory.makeSymbol("S#17037", "CYC"), SubLObjectFactory.makeKeyword("KEY-FUNCTION"), SubLObjectFactory.makeSymbol("KEY-GAF-ARG-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-KEY-FUNCTION"), SubLObjectFactory.makeSymbol("S#17038", "CYC"), SubLObjectFactory.makeKeyword("SIMPLE-MATCH-FUNCTION"), SubLObjectFactory.makeSymbol("S#16961", "CYC"), SubLObjectFactory.makeKeyword("SIMPLE-KEY-FUNCTION"), SubLObjectFactory.makeSymbol("S#16962", "CYC"), SubLObjectFactory.makeKeyword("GET-SUBINDEX-FUNCTION"), SubLObjectFactory.makeSymbol("S#17039", "CYC") });
        $ic16$ = SubLObjectFactory.makeKeyword("NART-ARG");
        $ic17$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("NART Arg"), SubLObjectFactory.makeKeyword("DOMAIN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("term"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXED-TERM-P")), SubLObjectFactory.makeKeyword("TOP-LEVEL-KEY"), SubLObjectFactory.makeKeyword("NART-ARG"), SubLObjectFactory.makeKeyword("KEYS"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("argnum"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P"), (SubLObject)SubLObjectFactory.makeKeyword("EQUAL-TEST"), (SubLObject)module0215.EQL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("func"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P"), (SubLObject)SubLObjectFactory.makeKeyword("EQUAL-TEST"), (SubLObject)module0215.EQL)), SubLObjectFactory.makeKeyword("RANGE"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("tou-ass"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#12747", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("A #$termOfUnit assertion whose arg2 is a naut with functor FUNC\nwhich mentions TERM in position ARGNUM")), SubLObjectFactory.makeKeyword("DUPLICATE-VALUES?"), module0215.T, SubLObjectFactory.makeKeyword("NUM-FUNCTION"), SubLObjectFactory.makeSymbol("NUM-NART-ARG-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION"), SubLObjectFactory.makeSymbol("RELEVANT-NUM-NART-ARG-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), SubLObjectFactory.makeSymbol("S#17040", "CYC"), SubLObjectFactory.makeKeyword("KEY-FUNCTION"), SubLObjectFactory.makeSymbol("KEY-NART-ARG-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-KEY-FUNCTION"), SubLObjectFactory.makeSymbol("S#17041", "CYC"), SubLObjectFactory.makeKeyword("SIMPLE-MATCH-FUNCTION"), SubLObjectFactory.makeSymbol("S#12756", "CYC"), SubLObjectFactory.makeKeyword("SIMPLE-KEY-FUNCTION"), SubLObjectFactory.makeSymbol("S#16965", "CYC"), SubLObjectFactory.makeKeyword("GET-SUBINDEX-FUNCTION"), SubLObjectFactory.makeSymbol("S#17042", "CYC") });
        $ic18$ = SubLObjectFactory.makeKeyword("PREDICATE-EXTENT");
        $ic19$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("Predicate Extent"), SubLObjectFactory.makeKeyword("DOMAIN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("pred"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), SubLObjectFactory.makeKeyword("TOP-LEVEL-KEY"), SubLObjectFactory.makeKeyword("PREDICATE-EXTENT"), SubLObjectFactory.makeKeyword("KEYS"), ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("mt"), SubLObjectFactory.makeKeyword("MT?"), module0215.T, SubLObjectFactory.makeKeyword("VALIDITY-TEST"), SubLObjectFactory.makeSymbol("S#12263", "CYC"), SubLObjectFactory.makeKeyword("RELEVANCE-TEST"), SubLObjectFactory.makeSymbol("RELEVANT-MT?"), SubLObjectFactory.makeKeyword("EQUAL-TEST"), module0215.EQUAL })), SubLObjectFactory.makeKeyword("RANGE"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("gaf"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#11995", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("A gaf assertion in mt MT with predicate PRED.")), SubLObjectFactory.makeKeyword("DUPLICATE-VALUES?"), module0215.NIL, SubLObjectFactory.makeKeyword("NUM-FUNCTION"), SubLObjectFactory.makeSymbol("NUM-PREDICATE-EXTENT-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION"), SubLObjectFactory.makeSymbol("RELEVANT-NUM-PREDICATE-EXTENT-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), SubLObjectFactory.makeSymbol("S#17043", "CYC"), SubLObjectFactory.makeKeyword("KEY-FUNCTION"), SubLObjectFactory.makeSymbol("KEY-PREDICATE-EXTENT-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-KEY-FUNCTION"), SubLObjectFactory.makeSymbol("S#17044", "CYC"), SubLObjectFactory.makeKeyword("SIMPLE-MATCH-FUNCTION"), SubLObjectFactory.makeSymbol("S#16968", "CYC"), SubLObjectFactory.makeKeyword("SIMPLE-KEY-FUNCTION"), SubLObjectFactory.makeSymbol("S#16969", "CYC"), SubLObjectFactory.makeKeyword("GET-SUBINDEX-FUNCTION"), SubLObjectFactory.makeSymbol("S#17045", "CYC") });
        $ic20$ = SubLObjectFactory.makeKeyword("FUNCTION-EXTENT");
        $ic21$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("Function Extent"), SubLObjectFactory.makeKeyword("TOP-LEVEL-KEY"), SubLObjectFactory.makeKeyword("FUNCTION-EXTENT"), SubLObjectFactory.makeKeyword("DOMAIN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("func"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), SubLObjectFactory.makeKeyword("RANGE"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("tou-ass"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#12747", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("A #$termOfUnit assertion whose arg2 is a naut with functor FUNC")), SubLObjectFactory.makeKeyword("DUPLICATE-VALUES?"), module0215.NIL, SubLObjectFactory.makeKeyword("NUM-FUNCTION"), SubLObjectFactory.makeSymbol("NUM-FUNCTION-EXTENT-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION"), SubLObjectFactory.makeSymbol("RELEVANT-NUM-FUNCTION-EXTENT-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), SubLObjectFactory.makeSymbol("S#17046", "CYC"), SubLObjectFactory.makeKeyword("SIMPLE-MATCH-FUNCTION"), SubLObjectFactory.makeSymbol("S#16971", "CYC"), SubLObjectFactory.makeKeyword("GET-SUBINDEX-FUNCTION"), SubLObjectFactory.makeSymbol("S#17047", "CYC") });
        $ic22$ = SubLObjectFactory.makeKeyword("PREDICATE-RULE");
        $ic23$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("Predicate Rules"), SubLObjectFactory.makeKeyword("DOMAIN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("pred"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), SubLObjectFactory.makeKeyword("TOP-LEVEL-KEY"), SubLObjectFactory.makeKeyword("PREDICATE-RULE"), SubLObjectFactory.makeKeyword("KEYS"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("sense"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("SENSE-P"), (SubLObject)SubLObjectFactory.makeKeyword("EQUAL-TEST"), (SubLObject)module0215.EQ), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("mt"), SubLObjectFactory.makeKeyword("MT?"), module0215.T, SubLObjectFactory.makeKeyword("VALIDITY-TEST"), SubLObjectFactory.makeSymbol("S#12263", "CYC"), SubLObjectFactory.makeKeyword("RELEVANCE-TEST"), SubLObjectFactory.makeSymbol("RELEVANT-MT?"), SubLObjectFactory.makeKeyword("EQUAL-TEST"), module0215.EQUAL }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("direction"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION-P"), (SubLObject)SubLObjectFactory.makeKeyword("EQUAL-TEST"), (SubLObject)module0215.EQ)), SubLObjectFactory.makeKeyword("RANGE"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("rule"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#12732", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("A rule assertion in mt MT with direction DIRECTION, which contains\na SENSE-lit with predicate PRED")), SubLObjectFactory.makeKeyword("DUPLICATE-VALUES?"), module0215.T, SubLObjectFactory.makeKeyword("NUM-FUNCTION"), SubLObjectFactory.makeSymbol("NUM-PREDICATE-RULE-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION"), SubLObjectFactory.makeSymbol("S#17048", "CYC"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), SubLObjectFactory.makeSymbol("S#17049", "CYC"), SubLObjectFactory.makeKeyword("KEY-FUNCTION"), SubLObjectFactory.makeSymbol("KEY-PREDICATE-RULE-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-KEY-FUNCTION"), SubLObjectFactory.makeSymbol("S#17050", "CYC"), SubLObjectFactory.makeKeyword("SIMPLE-MATCH-FUNCTION"), SubLObjectFactory.makeSymbol("S#16973", "CYC"), SubLObjectFactory.makeKeyword("SIMPLE-KEY-FUNCTION"), SubLObjectFactory.makeSymbol("S#16974", "CYC"), SubLObjectFactory.makeKeyword("GET-SUBINDEX-FUNCTION"), SubLObjectFactory.makeSymbol("S#17051", "CYC") });
        $ic24$ = SubLObjectFactory.makeKeyword("DECONTEXTUALIZED-IST-PREDICATE-RULE");
        $ic25$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("Decontextualized #$ist Predicate Rules"), SubLObjectFactory.makeKeyword("DOMAIN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("pred"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), SubLObjectFactory.makeKeyword("TOP-LEVEL-KEY"), SubLObjectFactory.makeKeyword("DECONTEXTUALIZED-IST-PREDICATE-RULE"), SubLObjectFactory.makeKeyword("KEYS"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("sense"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("SENSE-P"), (SubLObject)SubLObjectFactory.makeKeyword("EQUAL-TEST"), (SubLObject)module0215.EQ), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("direction"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION-P"), (SubLObject)SubLObjectFactory.makeKeyword("EQUAL-TEST"), (SubLObject)module0215.EQ)), SubLObjectFactory.makeKeyword("RANGE"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("rule"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#12732", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("A rule assertion with direction DIRECTION, which contains\na SENSE-lit wrapped in an #$ist with predicate PRED.  The mt of the rule is ignored.")), SubLObjectFactory.makeKeyword("DUPLICATE-VALUES?"), module0215.T, SubLObjectFactory.makeKeyword("NUM-FUNCTION"), SubLObjectFactory.makeSymbol("NUM-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION"), SubLObjectFactory.makeSymbol("S#17052", "CYC"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), SubLObjectFactory.makeSymbol("S#17053", "CYC"), SubLObjectFactory.makeKeyword("KEY-FUNCTION"), SubLObjectFactory.makeSymbol("KEY-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-KEY-FUNCTION"), SubLObjectFactory.makeSymbol("S#17054", "CYC"), SubLObjectFactory.makeKeyword("SIMPLE-MATCH-FUNCTION"), SubLObjectFactory.makeSymbol("S#16979", "CYC"), SubLObjectFactory.makeKeyword("SIMPLE-KEY-FUNCTION"), SubLObjectFactory.makeSymbol("S#16980", "CYC"), SubLObjectFactory.makeKeyword("GET-SUBINDEX-FUNCTION"), SubLObjectFactory.makeSymbol("S#17055", "CYC") });
        $ic26$ = SubLObjectFactory.makeKeyword("ISA-RULE");
        $ic27$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("#$isa Rules"), SubLObjectFactory.makeKeyword("DOMAIN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("col"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), SubLObjectFactory.makeKeyword("TOP-LEVEL-KEY"), SubLObjectFactory.makeKeyword("ISA-RULE"), SubLObjectFactory.makeKeyword("KEYS"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("sense"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("SENSE-P"), (SubLObject)SubLObjectFactory.makeKeyword("EQUAL-TEST"), (SubLObject)module0215.EQ), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("mt"), SubLObjectFactory.makeKeyword("MT?"), module0215.T, SubLObjectFactory.makeKeyword("VALIDITY-TEST"), SubLObjectFactory.makeSymbol("S#12263", "CYC"), SubLObjectFactory.makeKeyword("RELEVANCE-TEST"), SubLObjectFactory.makeSymbol("RELEVANT-MT?"), SubLObjectFactory.makeKeyword("EQUAL-TEST"), module0215.EQUAL }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("direction"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION-P"), (SubLObject)SubLObjectFactory.makeKeyword("EQUAL-TEST"), (SubLObject)module0215.EQ)), SubLObjectFactory.makeKeyword("RANGE"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("rule"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#12732", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("A rule assertion in mt MT with direction DIRECTION, which contains\na SENSE-lit with predicate #$isa and arg2 COL")), SubLObjectFactory.makeKeyword("DUPLICATE-VALUES?"), module0215.T, SubLObjectFactory.makeKeyword("NUM-FUNCTION"), SubLObjectFactory.makeSymbol("NUM-ISA-RULE-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION"), SubLObjectFactory.makeSymbol("S#17056", "CYC"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), SubLObjectFactory.makeSymbol("S#17057", "CYC"), SubLObjectFactory.makeKeyword("KEY-FUNCTION"), SubLObjectFactory.makeSymbol("KEY-ISA-RULE-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-KEY-FUNCTION"), SubLObjectFactory.makeSymbol("S#17058", "CYC"), SubLObjectFactory.makeKeyword("SIMPLE-MATCH-FUNCTION"), SubLObjectFactory.makeSymbol("S#16982", "CYC"), SubLObjectFactory.makeKeyword("SIMPLE-KEY-FUNCTION"), SubLObjectFactory.makeSymbol("S#16983", "CYC"), SubLObjectFactory.makeKeyword("GET-SUBINDEX-FUNCTION"), SubLObjectFactory.makeSymbol("S#17059", "CYC") });
        $ic28$ = SubLObjectFactory.makeKeyword("QUOTED-ISA-RULE");
        $ic29$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("#$quotedIsa Rules"), SubLObjectFactory.makeKeyword("DOMAIN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("col"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), SubLObjectFactory.makeKeyword("TOP-LEVEL-KEY"), SubLObjectFactory.makeKeyword("QUOTED-ISA-RULE"), SubLObjectFactory.makeKeyword("KEYS"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("sense"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("SENSE-P"), (SubLObject)SubLObjectFactory.makeKeyword("EQUAL-TEST"), (SubLObject)module0215.EQ), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("mt"), SubLObjectFactory.makeKeyword("MT?"), module0215.T, SubLObjectFactory.makeKeyword("VALIDITY-TEST"), SubLObjectFactory.makeSymbol("S#12263", "CYC"), SubLObjectFactory.makeKeyword("RELEVANCE-TEST"), SubLObjectFactory.makeSymbol("RELEVANT-MT?"), SubLObjectFactory.makeKeyword("EQUAL-TEST"), module0215.EQUAL }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("direction"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION-P"), (SubLObject)SubLObjectFactory.makeKeyword("EQUAL-TEST"), (SubLObject)module0215.EQ)), SubLObjectFactory.makeKeyword("RANGE"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("rule"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#12732", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("A rule assertion in mt MT with direction DIRECTION, which contains\na SENSE-lit with predicate #$quotedIsa and arg2 COL")), SubLObjectFactory.makeKeyword("DUPLICATE-VALUES?"), module0215.T, SubLObjectFactory.makeKeyword("NUM-FUNCTION"), SubLObjectFactory.makeSymbol("NUM-QUOTED-ISA-RULE-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION"), SubLObjectFactory.makeSymbol("S#17060", "CYC"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), SubLObjectFactory.makeSymbol("S#17061", "CYC"), SubLObjectFactory.makeKeyword("KEY-FUNCTION"), SubLObjectFactory.makeSymbol("KEY-QUOTED-ISA-RULE-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-KEY-FUNCTION"), SubLObjectFactory.makeSymbol("S#17062", "CYC"), SubLObjectFactory.makeKeyword("SIMPLE-MATCH-FUNCTION"), SubLObjectFactory.makeSymbol("S#16985", "CYC"), SubLObjectFactory.makeKeyword("SIMPLE-KEY-FUNCTION"), SubLObjectFactory.makeSymbol("S#16986", "CYC"), SubLObjectFactory.makeKeyword("GET-SUBINDEX-FUNCTION"), SubLObjectFactory.makeSymbol("S#17063", "CYC") });
        $ic30$ = SubLObjectFactory.makeKeyword("GENLS-RULE");
        $ic31$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("#$genls Rules"), SubLObjectFactory.makeKeyword("DOMAIN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("col"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), SubLObjectFactory.makeKeyword("TOP-LEVEL-KEY"), SubLObjectFactory.makeKeyword("GENLS-RULE"), SubLObjectFactory.makeKeyword("KEYS"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("sense"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("SENSE-P"), (SubLObject)SubLObjectFactory.makeKeyword("EQUAL-TEST"), (SubLObject)module0215.EQ), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("mt"), SubLObjectFactory.makeKeyword("MT?"), module0215.T, SubLObjectFactory.makeKeyword("VALIDITY-TEST"), SubLObjectFactory.makeSymbol("S#12263", "CYC"), SubLObjectFactory.makeKeyword("RELEVANCE-TEST"), SubLObjectFactory.makeSymbol("RELEVANT-MT?"), SubLObjectFactory.makeKeyword("EQUAL-TEST"), module0215.EQUAL }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("direction"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION-P"), (SubLObject)SubLObjectFactory.makeKeyword("EQUAL-TEST"), (SubLObject)module0215.EQ)), SubLObjectFactory.makeKeyword("RANGE"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("rule"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#12732", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("A rule assertion in mt MT with direction DIRECTION, which contains\na SENSE-lit with predicate #$genls and arg2 COL")), SubLObjectFactory.makeKeyword("DUPLICATE-VALUES?"), module0215.T, SubLObjectFactory.makeKeyword("NUM-FUNCTION"), SubLObjectFactory.makeSymbol("NUM-GENLS-RULE-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION"), SubLObjectFactory.makeSymbol("S#17064", "CYC"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), SubLObjectFactory.makeSymbol("S#17065", "CYC"), SubLObjectFactory.makeKeyword("KEY-FUNCTION"), SubLObjectFactory.makeSymbol("KEY-GENLS-RULE-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-KEY-FUNCTION"), SubLObjectFactory.makeSymbol("S#17066", "CYC"), SubLObjectFactory.makeKeyword("SIMPLE-MATCH-FUNCTION"), SubLObjectFactory.makeSymbol("S#16988", "CYC"), SubLObjectFactory.makeKeyword("SIMPLE-KEY-FUNCTION"), SubLObjectFactory.makeSymbol("S#16989", "CYC"), SubLObjectFactory.makeKeyword("GET-SUBINDEX-FUNCTION"), SubLObjectFactory.makeSymbol("S#17067", "CYC") });
        $ic32$ = SubLObjectFactory.makeKeyword("GENL-MT-RULE");
        $ic33$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("#$genlMt Rules"), SubLObjectFactory.makeKeyword("DOMAIN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("genl-mt"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#12263", "CYC")), SubLObjectFactory.makeKeyword("TOP-LEVEL-KEY"), SubLObjectFactory.makeKeyword("GENL-MT-RULE"), SubLObjectFactory.makeKeyword("KEYS"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("sense"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("SENSE-P"), (SubLObject)SubLObjectFactory.makeKeyword("EQUAL-TEST"), (SubLObject)module0215.EQ), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("rule-mt"), SubLObjectFactory.makeKeyword("MT?"), module0215.T, SubLObjectFactory.makeKeyword("VALIDITY-TEST"), SubLObjectFactory.makeSymbol("S#12263", "CYC"), SubLObjectFactory.makeKeyword("RELEVANCE-TEST"), SubLObjectFactory.makeSymbol("RELEVANT-MT?"), SubLObjectFactory.makeKeyword("EQUAL-TEST"), module0215.EQUAL }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("direction"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION-P"), (SubLObject)SubLObjectFactory.makeKeyword("EQUAL-TEST"), (SubLObject)module0215.EQ)), SubLObjectFactory.makeKeyword("RANGE"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("rule"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#12732", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("A rule assertion in mt RULE-MT with direction DIRECTION, which contains\na SENSE-lit with predicate #$genlMt and arg2 GENL-MT")), SubLObjectFactory.makeKeyword("DUPLICATE-VALUES?"), module0215.T, SubLObjectFactory.makeKeyword("NUM-FUNCTION"), SubLObjectFactory.makeSymbol("NUM-GENL-MT-RULE-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION"), SubLObjectFactory.makeSymbol("S#17068", "CYC"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), SubLObjectFactory.makeSymbol("S#17069", "CYC"), SubLObjectFactory.makeKeyword("KEY-FUNCTION"), SubLObjectFactory.makeSymbol("KEY-GENL-MT-RULE-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-KEY-FUNCTION"), SubLObjectFactory.makeSymbol("S#17070", "CYC"), SubLObjectFactory.makeKeyword("SIMPLE-MATCH-FUNCTION"), SubLObjectFactory.makeSymbol("S#16991", "CYC"), SubLObjectFactory.makeKeyword("SIMPLE-KEY-FUNCTION"), SubLObjectFactory.makeSymbol("S#16992", "CYC"), SubLObjectFactory.makeKeyword("GET-SUBINDEX-FUNCTION"), SubLObjectFactory.makeSymbol("S#17071", "CYC") });
        $ic34$ = SubLObjectFactory.makeKeyword("FUNCTION-RULE");
        $ic35$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("Function Rules"), SubLObjectFactory.makeKeyword("DOMAIN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("func"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), SubLObjectFactory.makeKeyword("TOP-LEVEL-KEY"), SubLObjectFactory.makeKeyword("FUNCTION-RULE"), SubLObjectFactory.makeKeyword("KEYS"), ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("mt"), SubLObjectFactory.makeKeyword("MT?"), module0215.T, SubLObjectFactory.makeKeyword("VALIDITY-TEST"), SubLObjectFactory.makeSymbol("S#12263", "CYC"), SubLObjectFactory.makeKeyword("RELEVANCE-TEST"), SubLObjectFactory.makeSymbol("RELEVANT-MT?"), SubLObjectFactory.makeKeyword("EQUAL-TEST"), module0215.EQUAL }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("direction"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION-P"), (SubLObject)SubLObjectFactory.makeKeyword("EQUAL-TEST"), (SubLObject)module0215.EQ)), SubLObjectFactory.makeKeyword("RANGE"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("rule"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#12732", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("A rule assertion in mt MT with direction DIRECTION, which contains\na neg-lit whose predicate is #$termOfUnit and whose arg2 is a naut with functor FUNC")), SubLObjectFactory.makeKeyword("DUPLICATE-VALUES?"), module0215.NIL, SubLObjectFactory.makeKeyword("NUM-FUNCTION"), SubLObjectFactory.makeSymbol("NUM-FUNCTION-RULE-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION"), SubLObjectFactory.makeSymbol("S#17072", "CYC"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), SubLObjectFactory.makeSymbol("S#17073", "CYC"), SubLObjectFactory.makeKeyword("KEY-FUNCTION"), SubLObjectFactory.makeSymbol("KEY-FUNCTION-RULE-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-KEY-FUNCTION"), SubLObjectFactory.makeSymbol("S#17074", "CYC"), SubLObjectFactory.makeKeyword("SIMPLE-MATCH-FUNCTION"), SubLObjectFactory.makeSymbol("S#16994", "CYC"), SubLObjectFactory.makeKeyword("SIMPLE-KEY-FUNCTION"), SubLObjectFactory.makeSymbol("S#16995", "CYC"), SubLObjectFactory.makeKeyword("GET-SUBINDEX-FUNCTION"), SubLObjectFactory.makeSymbol("S#17075", "CYC") });
        $ic36$ = SubLObjectFactory.makeKeyword("EXCEPTION-RULE");
        $ic37$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("Exception Rules"), SubLObjectFactory.makeKeyword("DOMAIN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("rule"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#12732", "CYC")), SubLObjectFactory.makeKeyword("TOP-LEVEL-KEY"), SubLObjectFactory.makeKeyword("EXCEPTION-RULE"), SubLObjectFactory.makeKeyword("KEYS"), ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("mt"), SubLObjectFactory.makeKeyword("MT?"), module0215.T, SubLObjectFactory.makeKeyword("VALIDITY-TEST"), SubLObjectFactory.makeSymbol("S#12263", "CYC"), SubLObjectFactory.makeKeyword("RELEVANCE-TEST"), SubLObjectFactory.makeSymbol("RELEVANT-MT?"), SubLObjectFactory.makeKeyword("EQUAL-TEST"), module0215.EQUAL }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("direction"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION-P"), (SubLObject)SubLObjectFactory.makeKeyword("EQUAL-TEST"), (SubLObject)module0215.EQ)), SubLObjectFactory.makeKeyword("RANGE"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("exception-rule"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#12732", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("A rule assertion in mt MT with direction DIRECTION, which contains\na pos-lit whose predicate is #$abnormal and whose arg2 is RULE")), SubLObjectFactory.makeKeyword("DUPLICATE-VALUES?"), module0215.NIL, SubLObjectFactory.makeKeyword("NUM-FUNCTION"), SubLObjectFactory.makeSymbol("NUM-EXCEPTION-RULE-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION"), SubLObjectFactory.makeSymbol("S#17076", "CYC"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), SubLObjectFactory.makeSymbol("S#17077", "CYC"), SubLObjectFactory.makeKeyword("KEY-FUNCTION"), SubLObjectFactory.makeSymbol("KEY-EXCEPTION-RULE-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-KEY-FUNCTION"), SubLObjectFactory.makeSymbol("S#17078", "CYC"), SubLObjectFactory.makeKeyword("SIMPLE-MATCH-FUNCTION"), SubLObjectFactory.makeSymbol("S#16997", "CYC"), SubLObjectFactory.makeKeyword("SIMPLE-KEY-FUNCTION"), SubLObjectFactory.makeSymbol("S#16998", "CYC"), SubLObjectFactory.makeKeyword("GET-SUBINDEX-FUNCTION"), SubLObjectFactory.makeSymbol("S#17079", "CYC") });
        $ic38$ = SubLObjectFactory.makeKeyword("PRAGMA-RULE");
        $ic39$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("Pragmatic Requirement Rules"), SubLObjectFactory.makeKeyword("DOMAIN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("rule"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#12732", "CYC")), SubLObjectFactory.makeKeyword("TOP-LEVEL-KEY"), SubLObjectFactory.makeKeyword("PRAGMA-RULE"), SubLObjectFactory.makeKeyword("KEYS"), ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("mt"), SubLObjectFactory.makeKeyword("MT?"), module0215.T, SubLObjectFactory.makeKeyword("VALIDITY-TEST"), SubLObjectFactory.makeSymbol("S#12263", "CYC"), SubLObjectFactory.makeKeyword("RELEVANCE-TEST"), SubLObjectFactory.makeSymbol("RELEVANT-MT?"), SubLObjectFactory.makeKeyword("EQUAL-TEST"), module0215.EQUAL }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("direction"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION-P"), (SubLObject)SubLObjectFactory.makeKeyword("EQUAL-TEST"), (SubLObject)module0215.EQ)), SubLObjectFactory.makeKeyword("RANGE"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("pragma-rule"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#12732", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("A rule assertion in mt MT with direction DIRECTION, which contains\na pos-lit whose predicate is #$meetsPragmaticRequirement and whose arg2 is RULE")), SubLObjectFactory.makeKeyword("DUPLICATE-VALUES?"), module0215.NIL, SubLObjectFactory.makeKeyword("NUM-FUNCTION"), SubLObjectFactory.makeSymbol("NUM-PRAGMA-RULE-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION"), SubLObjectFactory.makeSymbol("S#17080", "CYC"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), SubLObjectFactory.makeSymbol("S#17081", "CYC"), SubLObjectFactory.makeKeyword("KEY-FUNCTION"), SubLObjectFactory.makeSymbol("KEY-PRAGMA-RULE-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-KEY-FUNCTION"), SubLObjectFactory.makeSymbol("S#17082", "CYC"), SubLObjectFactory.makeKeyword("SIMPLE-MATCH-FUNCTION"), SubLObjectFactory.makeSymbol("S#17000", "CYC"), SubLObjectFactory.makeKeyword("SIMPLE-KEY-FUNCTION"), SubLObjectFactory.makeSymbol("S#17001", "CYC"), SubLObjectFactory.makeKeyword("GET-SUBINDEX-FUNCTION"), SubLObjectFactory.makeSymbol("S#17083", "CYC") });
        $ic40$ = SubLObjectFactory.makeKeyword("MICROTHEORY-CONTENTS");
        $ic41$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("Microtheory Contents"), SubLObjectFactory.makeKeyword("DOMAIN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("mt"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#12263", "CYC")), SubLObjectFactory.makeKeyword("TOP-LEVEL-KEY"), SubLObjectFactory.makeKeyword("IST"), SubLObjectFactory.makeKeyword("RANGE"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("ass"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-P"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("An assertion in mt MT")), SubLObjectFactory.makeKeyword("DUPLICATE-VALUES?"), module0215.NIL, SubLObjectFactory.makeKeyword("NUM-FUNCTION"), SubLObjectFactory.makeSymbol("NUM-MT-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION"), SubLObjectFactory.makeSymbol("S#17084", "CYC"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), SubLObjectFactory.makeSymbol("S#17085", "CYC"), SubLObjectFactory.makeKeyword("SIMPLE-MATCH-FUNCTION"), SubLObjectFactory.makeSymbol("S#17004", "CYC"), SubLObjectFactory.makeKeyword("GET-SUBINDEX-FUNCTION"), SubLObjectFactory.makeSymbol("S#17086", "CYC") });
        $ic42$ = SubLObjectFactory.makeKeyword("MISCELLANEOUS");
        $ic43$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("Miscellaneous"), SubLObjectFactory.makeKeyword("DOMAIN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("term"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXED-TERM-P")), SubLObjectFactory.makeKeyword("TOP-LEVEL-KEY"), SubLObjectFactory.makeKeyword("OTHER"), SubLObjectFactory.makeKeyword("RANGE"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("ass"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-P"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("An assertion mentioning TERM but not indexed by any other means")), SubLObjectFactory.makeKeyword("DUPLICATE-VALUES?"), module0215.NIL, SubLObjectFactory.makeKeyword("NUM-FUNCTION"), SubLObjectFactory.makeSymbol("NUM-OTHER-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION"), SubLObjectFactory.makeSymbol("S#17087", "CYC"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), SubLObjectFactory.makeSymbol("S#17088", "CYC"), SubLObjectFactory.makeKeyword("SIMPLE-MATCH-FUNCTION"), SubLObjectFactory.makeSymbol("S#12736", "CYC"), SubLObjectFactory.makeKeyword("GET-SUBINDEX-FUNCTION"), SubLObjectFactory.makeSymbol("S#17089", "CYC") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0215.class
	Total time: 207 ms
	
	Decompiled with Procyon 0.5.32.
*/