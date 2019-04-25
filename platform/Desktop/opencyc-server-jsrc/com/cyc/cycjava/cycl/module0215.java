package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic1$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic1$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic1$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11_12 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic1$);
            var11_12 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic1$);
            if (NIL == conses_high.member(var11_12, (SubLObject)$ic2$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var11_12 == $ic3$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic1$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic4$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13;
        var4 = (var13 = var5);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)$ic6$, var12), ConsesLow.append(var13, (SubLObject)NIL));
    }
    
    public static SubLObject f14154() {
        return $g2385$.getGlobalValue();
    }
    
    public static SubLObject f14155() {
        $g2385$.setGlobalValue(module0067.f4880(Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED));
        return $g2385$.getGlobalValue();
    }
    
    public static SubLObject f14156(final SubLObject var6, final SubLObject var7) {
        return module0067.f4886($g2385$.getGlobalValue(), var6, var7);
    }
    
    public static SubLObject f14157(final SubLObject var6) {
        return module0067.f4887($g2385$.getGlobalValue(), var6);
    }
    
    public static SubLObject f14158(final SubLObject var6) {
        return module0067.f4884($g2385$.getGlobalValue(), var6, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f14159(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        final SubLObject var18 = f14158(var16);
        if (NIL != var18 && var16.eql(f14160(var18, (SubLObject)$ic9$))) {
            return var18;
        }
        SubLObject var19;
        for (var19 = module0066.f4838(module0067.f4891(f14154())); NIL == module0066.f4841(var19); var19 = module0066.f4840(var19)) {
            var17.resetMultipleValues();
            final SubLObject var20 = module0066.f4839(var19);
            final SubLObject var21 = var17.secondMultipleValue();
            var17.resetMultipleValues();
            if (var16.eql(f14160(var20, (SubLObject)$ic9$))) {
                return var20;
            }
        }
        module0066.f4842(var19);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14161(final SubLObject var19, final SubLObject var20, SubLObject var21) {
        if (var21 == UNPROVIDED) {
            var21 = (SubLObject)NIL;
        }
        return conses_high.getf(var19, var20, var21);
    }
    
    public static SubLObject f14160(final SubLObject var6, final SubLObject var20) {
        return conses_high.getf(f14158(var6), var20, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f14162(final SubLObject var6, final SubLObject var7) {
        f14156(var6, var7);
        return var6;
    }
    
    public static SubLObject f14163(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        SubLObject var24 = (SubLObject)NIL;
        SubLObject var25 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var22, var22, (SubLObject)$ic10$);
        var24 = var22.first();
        final SubLObject var26 = var25 = var22.rest();
        final SubLObject var27 = f14159(var24);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var23) && NIL == var27) {
            Errors.error((SubLObject)$ic11$, var24);
        }
        final SubLObject var28 = f14160(var27, (SubLObject)$ic12$);
        final SubLObject var29 = Sequences.length(var25);
        final SubLObject var30 = ConsesLow.nth(var29, var28);
        final SubLObject var31 = f14161(var30, (SubLObject)$ic13$, $g2384$.getGlobalValue());
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14165() {
        $g2384$ = SubLFiles.deflexical("S#17034", Symbols.symbol_function((SubLObject)EQL));
        $g2385$ = SubLFiles.deflexical("S#17035", (NIL != Symbols.boundp((SubLObject)$ic0$)) ? $g2385$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14166() {
        module0003.f57((SubLObject)$ic0$);
        module0002.f50((SubLObject)$ic7$, (SubLObject)$ic8$);
        f14162((SubLObject)$ic14$, (SubLObject)$ic15$);
        f14162((SubLObject)$ic16$, (SubLObject)$ic17$);
        f14162((SubLObject)$ic18$, (SubLObject)$ic19$);
        f14162((SubLObject)$ic20$, (SubLObject)$ic21$);
        f14162((SubLObject)$ic22$, (SubLObject)$ic23$);
        f14162((SubLObject)$ic24$, (SubLObject)$ic25$);
        f14162((SubLObject)$ic26$, (SubLObject)$ic27$);
        f14162((SubLObject)$ic28$, (SubLObject)$ic29$);
        f14162((SubLObject)$ic30$, (SubLObject)$ic31$);
        f14162((SubLObject)$ic32$, (SubLObject)$ic33$);
        f14162((SubLObject)$ic34$, (SubLObject)$ic35$);
        f14162((SubLObject)$ic36$, (SubLObject)$ic37$);
        f14162((SubLObject)$ic38$, (SubLObject)$ic39$);
        f14162((SubLObject)$ic40$, (SubLObject)$ic41$);
        f14162((SubLObject)$ic42$, (SubLObject)$ic43$);
        return (SubLObject)NIL;
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
        $g2384$ = null;
        $g2385$ = null;
        $ic0$ = makeSymbol("S#17035", "CYC");
        $ic1$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#134", "CYC"), (SubLObject)makeSymbol("S#138", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic2$ = ConsesLow.list((SubLObject)makeKeyword("DONE"));
        $ic3$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic4$ = makeKeyword("DONE");
        $ic5$ = makeSymbol("DO-DICTIONARY");
        $ic6$ = ConsesLow.list((SubLObject)makeSymbol("S#17025", "CYC"));
        $ic7$ = makeSymbol("S#17025", "CYC");
        $ic8$ = makeSymbol("S#17024", "CYC");
        $ic9$ = makeKeyword("TOP-LEVEL-KEY");
        $ic10$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#17036", "CYC"), (SubLObject)makeSymbol("S#5234", "CYC"));
        $ic11$ = makeString("Could not find an index with top-level key ~S");
        $ic12$ = makeKeyword("KEYS");
        $ic13$ = makeKeyword("EQUAL-TEST");
        $ic14$ = makeKeyword("GAF-ARG");
        $ic15$ = ConsesLow.list(new SubLObject[] { makeKeyword("NAME"), makeString("GAF Arg"), makeKeyword("DOMAIN"), ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeString("term"), (SubLObject)makeKeyword("VALIDITY-TEST"), (SubLObject)makeSymbol("INDEXED-TERM-P")), makeKeyword("TOP-LEVEL-KEY"), makeKeyword("GAF-ARG"), makeKeyword("KEYS"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeString("argnum"), (SubLObject)makeKeyword("VALIDITY-TEST"), (SubLObject)makeSymbol("POSITIVE-INTEGER-P"), (SubLObject)makeKeyword("EQUAL-TEST"), (SubLObject)EQL), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeString("pred"), (SubLObject)makeKeyword("VALIDITY-TEST"), (SubLObject)makeSymbol("FORT-P"), (SubLObject)makeKeyword("RELEVANCE-TEST"), (SubLObject)makeSymbol("S#12350", "CYC"), (SubLObject)makeKeyword("EQUAL-TEST"), (SubLObject)EQL), (SubLObject)ConsesLow.list(new SubLObject[] { makeKeyword("NAME"), makeString("mt"), makeKeyword("MT?"), T, makeKeyword("VALIDITY-TEST"), makeSymbol("S#12263", "CYC"), makeKeyword("RELEVANCE-TEST"), makeSymbol("RELEVANT-MT?"), makeKeyword("EQUAL-TEST"), EQUAL })), makeKeyword("RANGE"), ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeString("gaf"), (SubLObject)makeKeyword("VALIDITY-TEST"), (SubLObject)makeSymbol("S#11995", "CYC"), (SubLObject)makeKeyword("DOCUMENTATION"), (SubLObject)makeString("A gaf assertion in mt MT with predicate PRED which mentions TERM\nin position ARGNUM")), makeKeyword("DUPLICATE-VALUES?"), T, makeKeyword("NUM-FUNCTION"), makeSymbol("NUM-GAF-ARG-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION"), makeSymbol("RELEVANT-NUM-GAF-ARG-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), makeSymbol("S#17037", "CYC"), makeKeyword("KEY-FUNCTION"), makeSymbol("KEY-GAF-ARG-INDEX"), makeKeyword("RELEVANT-KEY-FUNCTION"), makeSymbol("S#17038", "CYC"), makeKeyword("SIMPLE-MATCH-FUNCTION"), makeSymbol("S#16961", "CYC"), makeKeyword("SIMPLE-KEY-FUNCTION"), makeSymbol("S#16962", "CYC"), makeKeyword("GET-SUBINDEX-FUNCTION"), makeSymbol("S#17039", "CYC") });
        $ic16$ = makeKeyword("NART-ARG");
        $ic17$ = ConsesLow.list(new SubLObject[] { makeKeyword("NAME"), makeString("NART Arg"), makeKeyword("DOMAIN"), ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeString("term"), (SubLObject)makeKeyword("VALIDITY-TEST"), (SubLObject)makeSymbol("INDEXED-TERM-P")), makeKeyword("TOP-LEVEL-KEY"), makeKeyword("NART-ARG"), makeKeyword("KEYS"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeString("argnum"), (SubLObject)makeKeyword("VALIDITY-TEST"), (SubLObject)makeSymbol("POSITIVE-INTEGER-P"), (SubLObject)makeKeyword("EQUAL-TEST"), (SubLObject)EQL), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeString("func"), (SubLObject)makeKeyword("VALIDITY-TEST"), (SubLObject)makeSymbol("FORT-P"), (SubLObject)makeKeyword("EQUAL-TEST"), (SubLObject)EQL)), makeKeyword("RANGE"), ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeString("tou-ass"), (SubLObject)makeKeyword("VALIDITY-TEST"), (SubLObject)makeSymbol("S#12747", "CYC"), (SubLObject)makeKeyword("DOCUMENTATION"), (SubLObject)makeString("A #$termOfUnit assertion whose arg2 is a naut with functor FUNC\nwhich mentions TERM in position ARGNUM")), makeKeyword("DUPLICATE-VALUES?"), T, makeKeyword("NUM-FUNCTION"), makeSymbol("NUM-NART-ARG-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION"), makeSymbol("RELEVANT-NUM-NART-ARG-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), makeSymbol("S#17040", "CYC"), makeKeyword("KEY-FUNCTION"), makeSymbol("KEY-NART-ARG-INDEX"), makeKeyword("RELEVANT-KEY-FUNCTION"), makeSymbol("S#17041", "CYC"), makeKeyword("SIMPLE-MATCH-FUNCTION"), makeSymbol("S#12756", "CYC"), makeKeyword("SIMPLE-KEY-FUNCTION"), makeSymbol("S#16965", "CYC"), makeKeyword("GET-SUBINDEX-FUNCTION"), makeSymbol("S#17042", "CYC") });
        $ic18$ = makeKeyword("PREDICATE-EXTENT");
        $ic19$ = ConsesLow.list(new SubLObject[] { makeKeyword("NAME"), makeString("Predicate Extent"), makeKeyword("DOMAIN"), ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeString("pred"), (SubLObject)makeKeyword("VALIDITY-TEST"), (SubLObject)makeSymbol("FORT-P")), makeKeyword("TOP-LEVEL-KEY"), makeKeyword("PREDICATE-EXTENT"), makeKeyword("KEYS"), ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { makeKeyword("NAME"), makeString("mt"), makeKeyword("MT?"), T, makeKeyword("VALIDITY-TEST"), makeSymbol("S#12263", "CYC"), makeKeyword("RELEVANCE-TEST"), makeSymbol("RELEVANT-MT?"), makeKeyword("EQUAL-TEST"), EQUAL })), makeKeyword("RANGE"), ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeString("gaf"), (SubLObject)makeKeyword("VALIDITY-TEST"), (SubLObject)makeSymbol("S#11995", "CYC"), (SubLObject)makeKeyword("DOCUMENTATION"), (SubLObject)makeString("A gaf assertion in mt MT with predicate PRED.")), makeKeyword("DUPLICATE-VALUES?"), NIL, makeKeyword("NUM-FUNCTION"), makeSymbol("NUM-PREDICATE-EXTENT-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION"), makeSymbol("RELEVANT-NUM-PREDICATE-EXTENT-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), makeSymbol("S#17043", "CYC"), makeKeyword("KEY-FUNCTION"), makeSymbol("KEY-PREDICATE-EXTENT-INDEX"), makeKeyword("RELEVANT-KEY-FUNCTION"), makeSymbol("S#17044", "CYC"), makeKeyword("SIMPLE-MATCH-FUNCTION"), makeSymbol("S#16968", "CYC"), makeKeyword("SIMPLE-KEY-FUNCTION"), makeSymbol("S#16969", "CYC"), makeKeyword("GET-SUBINDEX-FUNCTION"), makeSymbol("S#17045", "CYC") });
        $ic20$ = makeKeyword("FUNCTION-EXTENT");
        $ic21$ = ConsesLow.list(new SubLObject[] { makeKeyword("NAME"), makeString("Function Extent"), makeKeyword("TOP-LEVEL-KEY"), makeKeyword("FUNCTION-EXTENT"), makeKeyword("DOMAIN"), ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeString("func"), (SubLObject)makeKeyword("VALIDITY-TEST"), (SubLObject)makeSymbol("FORT-P")), makeKeyword("RANGE"), ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeString("tou-ass"), (SubLObject)makeKeyword("VALIDITY-TEST"), (SubLObject)makeSymbol("S#12747", "CYC"), (SubLObject)makeKeyword("DOCUMENTATION"), (SubLObject)makeString("A #$termOfUnit assertion whose arg2 is a naut with functor FUNC")), makeKeyword("DUPLICATE-VALUES?"), NIL, makeKeyword("NUM-FUNCTION"), makeSymbol("NUM-FUNCTION-EXTENT-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION"), makeSymbol("RELEVANT-NUM-FUNCTION-EXTENT-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), makeSymbol("S#17046", "CYC"), makeKeyword("SIMPLE-MATCH-FUNCTION"), makeSymbol("S#16971", "CYC"), makeKeyword("GET-SUBINDEX-FUNCTION"), makeSymbol("S#17047", "CYC") });
        $ic22$ = makeKeyword("PREDICATE-RULE");
        $ic23$ = ConsesLow.list(new SubLObject[] { makeKeyword("NAME"), makeString("Predicate Rules"), makeKeyword("DOMAIN"), ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeString("pred"), (SubLObject)makeKeyword("VALIDITY-TEST"), (SubLObject)makeSymbol("FORT-P")), makeKeyword("TOP-LEVEL-KEY"), makeKeyword("PREDICATE-RULE"), makeKeyword("KEYS"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeString("sense"), (SubLObject)makeKeyword("VALIDITY-TEST"), (SubLObject)makeSymbol("SENSE-P"), (SubLObject)makeKeyword("EQUAL-TEST"), (SubLObject)EQ), (SubLObject)ConsesLow.list(new SubLObject[] { makeKeyword("NAME"), makeString("mt"), makeKeyword("MT?"), T, makeKeyword("VALIDITY-TEST"), makeSymbol("S#12263", "CYC"), makeKeyword("RELEVANCE-TEST"), makeSymbol("RELEVANT-MT?"), makeKeyword("EQUAL-TEST"), EQUAL }), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeString("direction"), (SubLObject)makeKeyword("VALIDITY-TEST"), (SubLObject)makeSymbol("DIRECTION-P"), (SubLObject)makeKeyword("EQUAL-TEST"), (SubLObject)EQ)), makeKeyword("RANGE"), ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeString("rule"), (SubLObject)makeKeyword("VALIDITY-TEST"), (SubLObject)makeSymbol("S#12732", "CYC"), (SubLObject)makeKeyword("DOCUMENTATION"), (SubLObject)makeString("A rule assertion in mt MT with direction DIRECTION, which contains\na SENSE-lit with predicate PRED")), makeKeyword("DUPLICATE-VALUES?"), T, makeKeyword("NUM-FUNCTION"), makeSymbol("NUM-PREDICATE-RULE-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION"), makeSymbol("S#17048", "CYC"), makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), makeSymbol("S#17049", "CYC"), makeKeyword("KEY-FUNCTION"), makeSymbol("KEY-PREDICATE-RULE-INDEX"), makeKeyword("RELEVANT-KEY-FUNCTION"), makeSymbol("S#17050", "CYC"), makeKeyword("SIMPLE-MATCH-FUNCTION"), makeSymbol("S#16973", "CYC"), makeKeyword("SIMPLE-KEY-FUNCTION"), makeSymbol("S#16974", "CYC"), makeKeyword("GET-SUBINDEX-FUNCTION"), makeSymbol("S#17051", "CYC") });
        $ic24$ = makeKeyword("DECONTEXTUALIZED-IST-PREDICATE-RULE");
        $ic25$ = ConsesLow.list(new SubLObject[] { makeKeyword("NAME"), makeString("Decontextualized #$ist Predicate Rules"), makeKeyword("DOMAIN"), ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeString("pred"), (SubLObject)makeKeyword("VALIDITY-TEST"), (SubLObject)makeSymbol("FORT-P")), makeKeyword("TOP-LEVEL-KEY"), makeKeyword("DECONTEXTUALIZED-IST-PREDICATE-RULE"), makeKeyword("KEYS"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeString("sense"), (SubLObject)makeKeyword("VALIDITY-TEST"), (SubLObject)makeSymbol("SENSE-P"), (SubLObject)makeKeyword("EQUAL-TEST"), (SubLObject)EQ), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeString("direction"), (SubLObject)makeKeyword("VALIDITY-TEST"), (SubLObject)makeSymbol("DIRECTION-P"), (SubLObject)makeKeyword("EQUAL-TEST"), (SubLObject)EQ)), makeKeyword("RANGE"), ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeString("rule"), (SubLObject)makeKeyword("VALIDITY-TEST"), (SubLObject)makeSymbol("S#12732", "CYC"), (SubLObject)makeKeyword("DOCUMENTATION"), (SubLObject)makeString("A rule assertion with direction DIRECTION, which contains\na SENSE-lit wrapped in an #$ist with predicate PRED.  The mt of the rule is ignored.")), makeKeyword("DUPLICATE-VALUES?"), T, makeKeyword("NUM-FUNCTION"), makeSymbol("NUM-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION"), makeSymbol("S#17052", "CYC"), makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), makeSymbol("S#17053", "CYC"), makeKeyword("KEY-FUNCTION"), makeSymbol("KEY-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX"), makeKeyword("RELEVANT-KEY-FUNCTION"), makeSymbol("S#17054", "CYC"), makeKeyword("SIMPLE-MATCH-FUNCTION"), makeSymbol("S#16979", "CYC"), makeKeyword("SIMPLE-KEY-FUNCTION"), makeSymbol("S#16980", "CYC"), makeKeyword("GET-SUBINDEX-FUNCTION"), makeSymbol("S#17055", "CYC") });
        $ic26$ = makeKeyword("ISA-RULE");
        $ic27$ = ConsesLow.list(new SubLObject[] { makeKeyword("NAME"), makeString("#$isa Rules"), makeKeyword("DOMAIN"), ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeString("col"), (SubLObject)makeKeyword("VALIDITY-TEST"), (SubLObject)makeSymbol("FORT-P")), makeKeyword("TOP-LEVEL-KEY"), makeKeyword("ISA-RULE"), makeKeyword("KEYS"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeString("sense"), (SubLObject)makeKeyword("VALIDITY-TEST"), (SubLObject)makeSymbol("SENSE-P"), (SubLObject)makeKeyword("EQUAL-TEST"), (SubLObject)EQ), (SubLObject)ConsesLow.list(new SubLObject[] { makeKeyword("NAME"), makeString("mt"), makeKeyword("MT?"), T, makeKeyword("VALIDITY-TEST"), makeSymbol("S#12263", "CYC"), makeKeyword("RELEVANCE-TEST"), makeSymbol("RELEVANT-MT?"), makeKeyword("EQUAL-TEST"), EQUAL }), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeString("direction"), (SubLObject)makeKeyword("VALIDITY-TEST"), (SubLObject)makeSymbol("DIRECTION-P"), (SubLObject)makeKeyword("EQUAL-TEST"), (SubLObject)EQ)), makeKeyword("RANGE"), ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeString("rule"), (SubLObject)makeKeyword("VALIDITY-TEST"), (SubLObject)makeSymbol("S#12732", "CYC"), (SubLObject)makeKeyword("DOCUMENTATION"), (SubLObject)makeString("A rule assertion in mt MT with direction DIRECTION, which contains\na SENSE-lit with predicate #$isa and arg2 COL")), makeKeyword("DUPLICATE-VALUES?"), T, makeKeyword("NUM-FUNCTION"), makeSymbol("NUM-ISA-RULE-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION"), makeSymbol("S#17056", "CYC"), makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), makeSymbol("S#17057", "CYC"), makeKeyword("KEY-FUNCTION"), makeSymbol("KEY-ISA-RULE-INDEX"), makeKeyword("RELEVANT-KEY-FUNCTION"), makeSymbol("S#17058", "CYC"), makeKeyword("SIMPLE-MATCH-FUNCTION"), makeSymbol("S#16982", "CYC"), makeKeyword("SIMPLE-KEY-FUNCTION"), makeSymbol("S#16983", "CYC"), makeKeyword("GET-SUBINDEX-FUNCTION"), makeSymbol("S#17059", "CYC") });
        $ic28$ = makeKeyword("QUOTED-ISA-RULE");
        $ic29$ = ConsesLow.list(new SubLObject[] { makeKeyword("NAME"), makeString("#$quotedIsa Rules"), makeKeyword("DOMAIN"), ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeString("col"), (SubLObject)makeKeyword("VALIDITY-TEST"), (SubLObject)makeSymbol("FORT-P")), makeKeyword("TOP-LEVEL-KEY"), makeKeyword("QUOTED-ISA-RULE"), makeKeyword("KEYS"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeString("sense"), (SubLObject)makeKeyword("VALIDITY-TEST"), (SubLObject)makeSymbol("SENSE-P"), (SubLObject)makeKeyword("EQUAL-TEST"), (SubLObject)EQ), (SubLObject)ConsesLow.list(new SubLObject[] { makeKeyword("NAME"), makeString("mt"), makeKeyword("MT?"), T, makeKeyword("VALIDITY-TEST"), makeSymbol("S#12263", "CYC"), makeKeyword("RELEVANCE-TEST"), makeSymbol("RELEVANT-MT?"), makeKeyword("EQUAL-TEST"), EQUAL }), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeString("direction"), (SubLObject)makeKeyword("VALIDITY-TEST"), (SubLObject)makeSymbol("DIRECTION-P"), (SubLObject)makeKeyword("EQUAL-TEST"), (SubLObject)EQ)), makeKeyword("RANGE"), ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeString("rule"), (SubLObject)makeKeyword("VALIDITY-TEST"), (SubLObject)makeSymbol("S#12732", "CYC"), (SubLObject)makeKeyword("DOCUMENTATION"), (SubLObject)makeString("A rule assertion in mt MT with direction DIRECTION, which contains\na SENSE-lit with predicate #$quotedIsa and arg2 COL")), makeKeyword("DUPLICATE-VALUES?"), T, makeKeyword("NUM-FUNCTION"), makeSymbol("NUM-QUOTED-ISA-RULE-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION"), makeSymbol("S#17060", "CYC"), makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), makeSymbol("S#17061", "CYC"), makeKeyword("KEY-FUNCTION"), makeSymbol("KEY-QUOTED-ISA-RULE-INDEX"), makeKeyword("RELEVANT-KEY-FUNCTION"), makeSymbol("S#17062", "CYC"), makeKeyword("SIMPLE-MATCH-FUNCTION"), makeSymbol("S#16985", "CYC"), makeKeyword("SIMPLE-KEY-FUNCTION"), makeSymbol("S#16986", "CYC"), makeKeyword("GET-SUBINDEX-FUNCTION"), makeSymbol("S#17063", "CYC") });
        $ic30$ = makeKeyword("GENLS-RULE");
        $ic31$ = ConsesLow.list(new SubLObject[] { makeKeyword("NAME"), makeString("#$genls Rules"), makeKeyword("DOMAIN"), ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeString("col"), (SubLObject)makeKeyword("VALIDITY-TEST"), (SubLObject)makeSymbol("FORT-P")), makeKeyword("TOP-LEVEL-KEY"), makeKeyword("GENLS-RULE"), makeKeyword("KEYS"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeString("sense"), (SubLObject)makeKeyword("VALIDITY-TEST"), (SubLObject)makeSymbol("SENSE-P"), (SubLObject)makeKeyword("EQUAL-TEST"), (SubLObject)EQ), (SubLObject)ConsesLow.list(new SubLObject[] { makeKeyword("NAME"), makeString("mt"), makeKeyword("MT?"), T, makeKeyword("VALIDITY-TEST"), makeSymbol("S#12263", "CYC"), makeKeyword("RELEVANCE-TEST"), makeSymbol("RELEVANT-MT?"), makeKeyword("EQUAL-TEST"), EQUAL }), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeString("direction"), (SubLObject)makeKeyword("VALIDITY-TEST"), (SubLObject)makeSymbol("DIRECTION-P"), (SubLObject)makeKeyword("EQUAL-TEST"), (SubLObject)EQ)), makeKeyword("RANGE"), ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeString("rule"), (SubLObject)makeKeyword("VALIDITY-TEST"), (SubLObject)makeSymbol("S#12732", "CYC"), (SubLObject)makeKeyword("DOCUMENTATION"), (SubLObject)makeString("A rule assertion in mt MT with direction DIRECTION, which contains\na SENSE-lit with predicate #$genls and arg2 COL")), makeKeyword("DUPLICATE-VALUES?"), T, makeKeyword("NUM-FUNCTION"), makeSymbol("NUM-GENLS-RULE-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION"), makeSymbol("S#17064", "CYC"), makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), makeSymbol("S#17065", "CYC"), makeKeyword("KEY-FUNCTION"), makeSymbol("KEY-GENLS-RULE-INDEX"), makeKeyword("RELEVANT-KEY-FUNCTION"), makeSymbol("S#17066", "CYC"), makeKeyword("SIMPLE-MATCH-FUNCTION"), makeSymbol("S#16988", "CYC"), makeKeyword("SIMPLE-KEY-FUNCTION"), makeSymbol("S#16989", "CYC"), makeKeyword("GET-SUBINDEX-FUNCTION"), makeSymbol("S#17067", "CYC") });
        $ic32$ = makeKeyword("GENL-MT-RULE");
        $ic33$ = ConsesLow.list(new SubLObject[] { makeKeyword("NAME"), makeString("#$genlMt Rules"), makeKeyword("DOMAIN"), ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeString("genl-mt"), (SubLObject)makeKeyword("VALIDITY-TEST"), (SubLObject)makeSymbol("S#12263", "CYC")), makeKeyword("TOP-LEVEL-KEY"), makeKeyword("GENL-MT-RULE"), makeKeyword("KEYS"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeString("sense"), (SubLObject)makeKeyword("VALIDITY-TEST"), (SubLObject)makeSymbol("SENSE-P"), (SubLObject)makeKeyword("EQUAL-TEST"), (SubLObject)EQ), (SubLObject)ConsesLow.list(new SubLObject[] { makeKeyword("NAME"), makeString("rule-mt"), makeKeyword("MT?"), T, makeKeyword("VALIDITY-TEST"), makeSymbol("S#12263", "CYC"), makeKeyword("RELEVANCE-TEST"), makeSymbol("RELEVANT-MT?"), makeKeyword("EQUAL-TEST"), EQUAL }), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeString("direction"), (SubLObject)makeKeyword("VALIDITY-TEST"), (SubLObject)makeSymbol("DIRECTION-P"), (SubLObject)makeKeyword("EQUAL-TEST"), (SubLObject)EQ)), makeKeyword("RANGE"), ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeString("rule"), (SubLObject)makeKeyword("VALIDITY-TEST"), (SubLObject)makeSymbol("S#12732", "CYC"), (SubLObject)makeKeyword("DOCUMENTATION"), (SubLObject)makeString("A rule assertion in mt RULE-MT with direction DIRECTION, which contains\na SENSE-lit with predicate #$genlMt and arg2 GENL-MT")), makeKeyword("DUPLICATE-VALUES?"), T, makeKeyword("NUM-FUNCTION"), makeSymbol("NUM-GENL-MT-RULE-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION"), makeSymbol("S#17068", "CYC"), makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), makeSymbol("S#17069", "CYC"), makeKeyword("KEY-FUNCTION"), makeSymbol("KEY-GENL-MT-RULE-INDEX"), makeKeyword("RELEVANT-KEY-FUNCTION"), makeSymbol("S#17070", "CYC"), makeKeyword("SIMPLE-MATCH-FUNCTION"), makeSymbol("S#16991", "CYC"), makeKeyword("SIMPLE-KEY-FUNCTION"), makeSymbol("S#16992", "CYC"), makeKeyword("GET-SUBINDEX-FUNCTION"), makeSymbol("S#17071", "CYC") });
        $ic34$ = makeKeyword("FUNCTION-RULE");
        $ic35$ = ConsesLow.list(new SubLObject[] { makeKeyword("NAME"), makeString("Function Rules"), makeKeyword("DOMAIN"), ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeString("func"), (SubLObject)makeKeyword("VALIDITY-TEST"), (SubLObject)makeSymbol("FORT-P")), makeKeyword("TOP-LEVEL-KEY"), makeKeyword("FUNCTION-RULE"), makeKeyword("KEYS"), ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { makeKeyword("NAME"), makeString("mt"), makeKeyword("MT?"), T, makeKeyword("VALIDITY-TEST"), makeSymbol("S#12263", "CYC"), makeKeyword("RELEVANCE-TEST"), makeSymbol("RELEVANT-MT?"), makeKeyword("EQUAL-TEST"), EQUAL }), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeString("direction"), (SubLObject)makeKeyword("VALIDITY-TEST"), (SubLObject)makeSymbol("DIRECTION-P"), (SubLObject)makeKeyword("EQUAL-TEST"), (SubLObject)EQ)), makeKeyword("RANGE"), ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeString("rule"), (SubLObject)makeKeyword("VALIDITY-TEST"), (SubLObject)makeSymbol("S#12732", "CYC"), (SubLObject)makeKeyword("DOCUMENTATION"), (SubLObject)makeString("A rule assertion in mt MT with direction DIRECTION, which contains\na neg-lit whose predicate is #$termOfUnit and whose arg2 is a naut with functor FUNC")), makeKeyword("DUPLICATE-VALUES?"), NIL, makeKeyword("NUM-FUNCTION"), makeSymbol("NUM-FUNCTION-RULE-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION"), makeSymbol("S#17072", "CYC"), makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), makeSymbol("S#17073", "CYC"), makeKeyword("KEY-FUNCTION"), makeSymbol("KEY-FUNCTION-RULE-INDEX"), makeKeyword("RELEVANT-KEY-FUNCTION"), makeSymbol("S#17074", "CYC"), makeKeyword("SIMPLE-MATCH-FUNCTION"), makeSymbol("S#16994", "CYC"), makeKeyword("SIMPLE-KEY-FUNCTION"), makeSymbol("S#16995", "CYC"), makeKeyword("GET-SUBINDEX-FUNCTION"), makeSymbol("S#17075", "CYC") });
        $ic36$ = makeKeyword("EXCEPTION-RULE");
        $ic37$ = ConsesLow.list(new SubLObject[] { makeKeyword("NAME"), makeString("Exception Rules"), makeKeyword("DOMAIN"), ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeString("rule"), (SubLObject)makeKeyword("VALIDITY-TEST"), (SubLObject)makeSymbol("S#12732", "CYC")), makeKeyword("TOP-LEVEL-KEY"), makeKeyword("EXCEPTION-RULE"), makeKeyword("KEYS"), ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { makeKeyword("NAME"), makeString("mt"), makeKeyword("MT?"), T, makeKeyword("VALIDITY-TEST"), makeSymbol("S#12263", "CYC"), makeKeyword("RELEVANCE-TEST"), makeSymbol("RELEVANT-MT?"), makeKeyword("EQUAL-TEST"), EQUAL }), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeString("direction"), (SubLObject)makeKeyword("VALIDITY-TEST"), (SubLObject)makeSymbol("DIRECTION-P"), (SubLObject)makeKeyword("EQUAL-TEST"), (SubLObject)EQ)), makeKeyword("RANGE"), ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeString("exception-rule"), (SubLObject)makeKeyword("VALIDITY-TEST"), (SubLObject)makeSymbol("S#12732", "CYC"), (SubLObject)makeKeyword("DOCUMENTATION"), (SubLObject)makeString("A rule assertion in mt MT with direction DIRECTION, which contains\na pos-lit whose predicate is #$abnormal and whose arg2 is RULE")), makeKeyword("DUPLICATE-VALUES?"), NIL, makeKeyword("NUM-FUNCTION"), makeSymbol("NUM-EXCEPTION-RULE-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION"), makeSymbol("S#17076", "CYC"), makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), makeSymbol("S#17077", "CYC"), makeKeyword("KEY-FUNCTION"), makeSymbol("KEY-EXCEPTION-RULE-INDEX"), makeKeyword("RELEVANT-KEY-FUNCTION"), makeSymbol("S#17078", "CYC"), makeKeyword("SIMPLE-MATCH-FUNCTION"), makeSymbol("S#16997", "CYC"), makeKeyword("SIMPLE-KEY-FUNCTION"), makeSymbol("S#16998", "CYC"), makeKeyword("GET-SUBINDEX-FUNCTION"), makeSymbol("S#17079", "CYC") });
        $ic38$ = makeKeyword("PRAGMA-RULE");
        $ic39$ = ConsesLow.list(new SubLObject[] { makeKeyword("NAME"), makeString("Pragmatic Requirement Rules"), makeKeyword("DOMAIN"), ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeString("rule"), (SubLObject)makeKeyword("VALIDITY-TEST"), (SubLObject)makeSymbol("S#12732", "CYC")), makeKeyword("TOP-LEVEL-KEY"), makeKeyword("PRAGMA-RULE"), makeKeyword("KEYS"), ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { makeKeyword("NAME"), makeString("mt"), makeKeyword("MT?"), T, makeKeyword("VALIDITY-TEST"), makeSymbol("S#12263", "CYC"), makeKeyword("RELEVANCE-TEST"), makeSymbol("RELEVANT-MT?"), makeKeyword("EQUAL-TEST"), EQUAL }), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeString("direction"), (SubLObject)makeKeyword("VALIDITY-TEST"), (SubLObject)makeSymbol("DIRECTION-P"), (SubLObject)makeKeyword("EQUAL-TEST"), (SubLObject)EQ)), makeKeyword("RANGE"), ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeString("pragma-rule"), (SubLObject)makeKeyword("VALIDITY-TEST"), (SubLObject)makeSymbol("S#12732", "CYC"), (SubLObject)makeKeyword("DOCUMENTATION"), (SubLObject)makeString("A rule assertion in mt MT with direction DIRECTION, which contains\na pos-lit whose predicate is #$meetsPragmaticRequirement and whose arg2 is RULE")), makeKeyword("DUPLICATE-VALUES?"), NIL, makeKeyword("NUM-FUNCTION"), makeSymbol("NUM-PRAGMA-RULE-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION"), makeSymbol("S#17080", "CYC"), makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), makeSymbol("S#17081", "CYC"), makeKeyword("KEY-FUNCTION"), makeSymbol("KEY-PRAGMA-RULE-INDEX"), makeKeyword("RELEVANT-KEY-FUNCTION"), makeSymbol("S#17082", "CYC"), makeKeyword("SIMPLE-MATCH-FUNCTION"), makeSymbol("S#17000", "CYC"), makeKeyword("SIMPLE-KEY-FUNCTION"), makeSymbol("S#17001", "CYC"), makeKeyword("GET-SUBINDEX-FUNCTION"), makeSymbol("S#17083", "CYC") });
        $ic40$ = makeKeyword("MICROTHEORY-CONTENTS");
        $ic41$ = ConsesLow.list(new SubLObject[] { makeKeyword("NAME"), makeString("Microtheory Contents"), makeKeyword("DOMAIN"), ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeString("mt"), (SubLObject)makeKeyword("VALIDITY-TEST"), (SubLObject)makeSymbol("S#12263", "CYC")), makeKeyword("TOP-LEVEL-KEY"), makeKeyword("IST"), makeKeyword("RANGE"), ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeString("ass"), (SubLObject)makeKeyword("VALIDITY-TEST"), (SubLObject)makeSymbol("ASSERTION-P"), (SubLObject)makeKeyword("DOCUMENTATION"), (SubLObject)makeString("An assertion in mt MT")), makeKeyword("DUPLICATE-VALUES?"), NIL, makeKeyword("NUM-FUNCTION"), makeSymbol("NUM-MT-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION"), makeSymbol("S#17084", "CYC"), makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), makeSymbol("S#17085", "CYC"), makeKeyword("SIMPLE-MATCH-FUNCTION"), makeSymbol("S#17004", "CYC"), makeKeyword("GET-SUBINDEX-FUNCTION"), makeSymbol("S#17086", "CYC") });
        $ic42$ = makeKeyword("MISCELLANEOUS");
        $ic43$ = ConsesLow.list(new SubLObject[] { makeKeyword("NAME"), makeString("Miscellaneous"), makeKeyword("DOMAIN"), ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeString("term"), (SubLObject)makeKeyword("VALIDITY-TEST"), (SubLObject)makeSymbol("INDEXED-TERM-P")), makeKeyword("TOP-LEVEL-KEY"), makeKeyword("OTHER"), makeKeyword("RANGE"), ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeString("ass"), (SubLObject)makeKeyword("VALIDITY-TEST"), (SubLObject)makeSymbol("ASSERTION-P"), (SubLObject)makeKeyword("DOCUMENTATION"), (SubLObject)makeString("An assertion mentioning TERM but not indexed by any other means")), makeKeyword("DUPLICATE-VALUES?"), NIL, makeKeyword("NUM-FUNCTION"), makeSymbol("NUM-OTHER-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION"), makeSymbol("S#17087", "CYC"), makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), makeSymbol("S#17088", "CYC"), makeKeyword("SIMPLE-MATCH-FUNCTION"), makeSymbol("S#12736", "CYC"), makeKeyword("GET-SUBINDEX-FUNCTION"), makeSymbol("S#17089", "CYC") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 207 ms
	
	Decompiled with Procyon 0.5.32.
*/