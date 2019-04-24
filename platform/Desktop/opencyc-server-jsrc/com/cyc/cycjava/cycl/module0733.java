package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0733 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0733";
    public static final String myFingerPrint = "a3b66980762f8ae59e19f6ceb2c25e13cfd65dfdd4024f3fcb2a77e6de00a5c8";
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    
    public static SubLObject f45168(final SubLObject var1, final SubLObject var2) {
        if (module0733.NIL != module0178.f11284(var2) && module0178.f11333(var2).eql(module0733.$ic0$)) {
            module0731.f44748();
        }
        module0737.f45566(var2, (SubLObject)module0733.UNPROVIDED);
        module0731.f44739();
        return (SubLObject)module0733.NIL;
    }
    
    public static SubLObject f45169(final SubLObject var1, final SubLObject var2) {
        if (module0733.NIL == module0226.f15088(var2, (SubLObject)module0733.$ic2$)) {
            if (module0733.NIL != module0178.f11284(var2) && module0178.f11333(var2).eql(module0733.$ic0$)) {
                module0731.f44748();
            }
            module0737.f45571(var2, (SubLObject)module0733.UNPROVIDED);
            module0731.f44739();
        }
        return (SubLObject)module0733.NIL;
    }
    
    public static SubLObject f45170(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        module0584.f35808();
        module0770.f49102((SubLObject)module0733.UNPROVIDED, (SubLObject)module0733.UNPROVIDED);
        final SubLObject var4 = module0732.f44996(var2);
        module0732.f44981(var4);
        final SubLObject var5 = module0584.$g4403$.currentBinding(var3);
        try {
            module0584.$g4403$.bind((SubLObject)module0733.NIL, var3);
            var3.resetMultipleValues();
            final SubLObject var6 = module0737.f45573(var2, (SubLObject)module0733.UNPROVIDED);
            final SubLObject var7 = var3.secondMultipleValue();
            var3.resetMultipleValues();
            SubLObject var8 = var7;
            SubLObject var9 = (SubLObject)module0733.NIL;
            var9 = var8.first();
            while (module0733.NIL != var8) {
                module0741.f45900(var9, (SubLObject)module0733.NIL);
                var8 = var8.rest();
                var9 = var8.first();
            }
        }
        finally {
            module0584.$g4403$.rebind(var5, var3);
        }
        return (SubLObject)module0733.NIL;
    }
    
    public static SubLObject f45171(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0733.NIL == module0226.f15088(var2, (SubLObject)module0733.$ic2$)) {
            module0770.f49102((SubLObject)module0733.UNPROVIDED, (SubLObject)module0733.UNPROVIDED);
            final SubLObject var4 = module0732.f44996(var2);
            module0732.f44981(var4);
            var3.resetMultipleValues();
            final SubLObject var5 = module0737.f45576(var2, (SubLObject)module0733.UNPROVIDED);
            final SubLObject var6 = var3.secondMultipleValue();
            var3.resetMultipleValues();
            SubLObject var7 = var6;
            SubLObject var8 = (SubLObject)module0733.NIL;
            var8 = var7.first();
            while (module0733.NIL != var7) {
                module0741.f45900(var8, (SubLObject)module0733.T);
                var7 = var7.rest();
                var8 = var7.first();
            }
        }
        return (SubLObject)module0733.NIL;
    }
    
    public static SubLObject f45172(final SubLObject var1, final SubLObject var2) {
        return (SubLObject)module0733.NIL;
    }
    
    public static SubLObject f45173(final SubLObject var1, final SubLObject var2) {
        return (SubLObject)module0733.NIL;
    }
    
    public static SubLObject f45174(final SubLObject var1, final SubLObject var2) {
        SubLObject var3 = module0741.f45906(module0178.f11333(var2));
        SubLObject var4 = (SubLObject)module0733.NIL;
        var4 = var3.first();
        while (module0733.NIL != var3) {
            final SubLObject var5 = module0178.f11331(var2, var4);
            if (module0733.NIL != module0209.f13550(var5)) {
                module0741.f45900(var5, (SubLObject)module0733.NIL);
            }
            var3 = var3.rest();
            var4 = var3.first();
        }
        return (SubLObject)module0733.NIL;
    }
    
    public static SubLObject f45175(final SubLObject var1, final SubLObject var2) {
        SubLObject var3 = module0741.f45906(module0178.f11333(var2));
        SubLObject var4 = (SubLObject)module0733.NIL;
        var4 = var3.first();
        while (module0733.NIL != var3) {
            final SubLObject var5 = module0178.f11331(var2, var4);
            if (module0733.NIL != module0209.f13550(var5)) {
                module0741.f45900(var5, (SubLObject)module0733.T);
            }
            var3 = var3.rest();
            var4 = var3.first();
        }
        return (SubLObject)module0733.NIL;
    }
    
    public static SubLObject f45176(final SubLObject var1, final SubLObject var2) {
        module0584.f35808();
        module0770.f49102((SubLObject)module0733.UNPROVIDED, (SubLObject)module0733.UNPROVIDED);
        final SubLObject var3 = module0732.f44996(var2);
        module0732.f44981(var3);
        return (SubLObject)module0733.NIL;
    }
    
    public static SubLObject f45177(final SubLObject var1, final SubLObject var2) {
        if (module0733.NIL == module0226.f15088(var2, (SubLObject)module0733.$ic2$)) {
            module0770.f49102((SubLObject)module0733.UNPROVIDED, (SubLObject)module0733.UNPROVIDED);
            final SubLObject var3 = module0732.f44996(var2);
            module0732.f44981(var3);
        }
        return (SubLObject)module0733.NIL;
    }
    
    public static SubLObject f45178(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = module0178.f11334(var2);
        module0737.f45577(var3, (SubLObject)module0733.UNPROVIDED);
        module0770.f49102((SubLObject)module0733.UNPROVIDED, (SubLObject)module0733.UNPROVIDED);
        return (SubLObject)module0733.NIL;
    }
    
    public static SubLObject f45179(final SubLObject var1, final SubLObject var2) {
        if (module0733.NIL == module0226.f15088(var2, (SubLObject)module0733.$ic2$)) {
            final SubLObject var3 = module0178.f11334(var2);
            module0737.f45577(var3, (SubLObject)module0733.UNPROVIDED);
            module0770.f49102((SubLObject)module0733.UNPROVIDED, (SubLObject)module0733.UNPROVIDED);
        }
        return (SubLObject)module0733.NIL;
    }
    
    public static SubLObject f45180(final SubLObject var1, final SubLObject var2) {
        module0731.f44775();
        return (SubLObject)module0733.NIL;
    }
    
    public static SubLObject f45181(final SubLObject var1, final SubLObject var2) {
        module0731.f44775();
        return (SubLObject)module0733.NIL;
    }
    
    public static SubLObject f45182(final SubLObject var1, final SubLObject var2) {
        module0731.f44665();
        module0731.f44649();
        module0737.f45487();
        module0732.f44926();
        return (SubLObject)module0733.NIL;
    }
    
    public static SubLObject f45183(final SubLObject var1, final SubLObject var2) {
        module0731.f44665();
        module0731.f44649();
        module0737.f45487();
        module0732.f44926();
        return (SubLObject)module0733.NIL;
    }
    
    public static SubLObject f45184(final SubLObject var1, final SubLObject var2) {
        module0731.f44665();
        return (SubLObject)module0733.NIL;
    }
    
    public static SubLObject f45185(final SubLObject var1, final SubLObject var2) {
        module0731.f44665();
        return (SubLObject)module0733.NIL;
    }
    
    public static SubLObject f45186(final SubLObject var1, final SubLObject var2) {
        module0788.f50514();
        module0786.f50449();
        return (SubLObject)module0733.NIL;
    }
    
    public static SubLObject f45187(final SubLObject var1, final SubLObject var2) {
        module0788.f50514();
        module0786.f50449();
        return (SubLObject)module0733.NIL;
    }
    
    public static SubLObject f45188(final SubLObject var1, final SubLObject var2) {
        module0788.f50514();
        module0786.f50460();
        return (SubLObject)module0733.NIL;
    }
    
    public static SubLObject f45189(final SubLObject var1, final SubLObject var2) {
        module0788.f50514();
        module0786.f50460();
        return (SubLObject)module0733.NIL;
    }
    
    public static SubLObject f45190(final SubLObject var1, final SubLObject var2) {
        module0788.f50514();
        module0786.f50456();
        return (SubLObject)module0733.NIL;
    }
    
    public static SubLObject f45191(final SubLObject var1, final SubLObject var2) {
        module0788.f50514();
        module0786.f50456();
        return (SubLObject)module0733.NIL;
    }
    
    public static SubLObject f45192(final SubLObject var1, final SubLObject var2) {
        module0788.f50514();
        return (SubLObject)module0733.NIL;
    }
    
    public static SubLObject f45193(final SubLObject var1, final SubLObject var2) {
        module0788.f50514();
        return (SubLObject)module0733.NIL;
    }
    
    public static SubLObject f45194(final SubLObject var1, final SubLObject var2) {
        module0788.f50514();
        module0785.f50426();
        return (SubLObject)module0733.NIL;
    }
    
    public static SubLObject f45195(final SubLObject var1, final SubLObject var2) {
        module0788.f50514();
        module0785.f50426();
        return (SubLObject)module0733.NIL;
    }
    
    public static SubLObject f45196() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0733", "f45168", "ADD-LEXICON-PREDICATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0733", "f45169", "REMOVE-LEXICON-PREDICATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0733", "f45170", "ADD-SEMANTIC-ASSERTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0733", "f45171", "REMOVE-SEMANTIC-ASSERTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0733", "f45172", "ADD-INDEX-SUB-WORDS-FOR-ARG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0733", "f45173", "REMOVE-INDEX-SUB-WORDS-FOR-ARG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0733", "f45174", "ADD-SUB-WORD-INDEXED-ASSERTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0733", "f45175", "REMOVE-SUB-WORD-INDEXED-ASSERTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0733", "f45176", "ADD-GENERATION-ASSERTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0733", "f45177", "REMOVE-GENERATION-ASSERTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0733", "f45178", "ADD-PRAGMATIC-ASSERTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0733", "f45179", "REMOVE-PRAGMATIC-ASSERTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0733", "f45180", "ADD-DETERMINER-AGREEMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0733", "f45181", "REMOVE-DETERMINER-AGREEMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0733", "f45182", "ADD-SPEECH-PART-PREDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0733", "f45183", "REMOVE-SPEECH-PART-PREDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0733", "f45184", "ADD-REGULAR-SUFFIX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0733", "f45185", "REMOVE-REGULAR-SUFFIX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0733", "f45186", "ADD-DERIVATIONAL-AFFIX-BASE-POS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0733", "f45187", "REMOVE-DERIVATIONAL-AFFIX-BASE-POS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0733", "f45188", "ADD-DERIVATIONAL-AFFIX-RESULT-POS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0733", "f45189", "REMOVE-DERIVATIONAL-AFFIX-RESULT-POS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0733", "f45190", "ADD-AFFIX-SEMANTICS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0733", "f45191", "REMOVE-AFFIX-SEMANTICS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0733", "f45192", "ADD-AFFIX-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0733", "f45193", "REMOVE-AFFIX-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0733", "f45194", "ADD-BASIC-SPEECH-PART-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0733", "f45195", "REMOVE-BASIC-SPEECH-PART-PRED", 2, 0, false);
        return (SubLObject)module0733.NIL;
    }
    
    public static SubLObject f45197() {
        return (SubLObject)module0733.NIL;
    }
    
    public static SubLObject f45198() {
        module0012.f416((SubLObject)module0733.$ic1$);
        module0012.f416((SubLObject)module0733.$ic3$);
        module0012.f416((SubLObject)module0733.$ic4$);
        module0012.f416((SubLObject)module0733.$ic5$);
        module0012.f416((SubLObject)module0733.$ic6$);
        module0012.f416((SubLObject)module0733.$ic7$);
        module0012.f416((SubLObject)module0733.$ic8$);
        module0012.f416((SubLObject)module0733.$ic9$);
        module0012.f416((SubLObject)module0733.$ic10$);
        module0012.f416((SubLObject)module0733.$ic11$);
        module0012.f416((SubLObject)module0733.$ic12$);
        module0012.f416((SubLObject)module0733.$ic13$);
        module0012.f416((SubLObject)module0733.$ic14$);
        module0012.f416((SubLObject)module0733.$ic15$);
        module0012.f416((SubLObject)module0733.$ic16$);
        module0012.f416((SubLObject)module0733.$ic17$);
        module0012.f416((SubLObject)module0733.$ic18$);
        module0012.f416((SubLObject)module0733.$ic19$);
        module0012.f416((SubLObject)module0733.$ic20$);
        module0012.f416((SubLObject)module0733.$ic21$);
        module0012.f416((SubLObject)module0733.$ic22$);
        module0012.f416((SubLObject)module0733.$ic23$);
        module0012.f416((SubLObject)module0733.$ic24$);
        module0012.f416((SubLObject)module0733.$ic25$);
        module0012.f416((SubLObject)module0733.$ic26$);
        module0012.f416((SubLObject)module0733.$ic27$);
        module0012.f416((SubLObject)module0733.$ic28$);
        module0012.f416((SubLObject)module0733.$ic29$);
        return (SubLObject)module0733.NIL;
    }
    
    public void declareFunctions() {
        f45196();
    }
    
    public void initializeVariables() {
        f45197();
    }
    
    public void runTopLevelForms() {
        f45198();
    }
    
    static {
        me = (SubLFile)new module0733();
        $ic0$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("partOfSpeech"));
        $ic1$ = SubLObjectFactory.makeSymbol("ADD-LEXICON-PREDICATE");
        $ic2$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic3$ = SubLObjectFactory.makeSymbol("REMOVE-LEXICON-PREDICATE");
        $ic4$ = SubLObjectFactory.makeSymbol("ADD-SEMANTIC-ASSERTION");
        $ic5$ = SubLObjectFactory.makeSymbol("REMOVE-SEMANTIC-ASSERTION");
        $ic6$ = SubLObjectFactory.makeSymbol("ADD-INDEX-SUB-WORDS-FOR-ARG");
        $ic7$ = SubLObjectFactory.makeSymbol("REMOVE-INDEX-SUB-WORDS-FOR-ARG");
        $ic8$ = SubLObjectFactory.makeSymbol("ADD-SUB-WORD-INDEXED-ASSERTION");
        $ic9$ = SubLObjectFactory.makeSymbol("REMOVE-SUB-WORD-INDEXED-ASSERTION");
        $ic10$ = SubLObjectFactory.makeSymbol("ADD-GENERATION-ASSERTION");
        $ic11$ = SubLObjectFactory.makeSymbol("REMOVE-GENERATION-ASSERTION");
        $ic12$ = SubLObjectFactory.makeSymbol("ADD-PRAGMATIC-ASSERTION");
        $ic13$ = SubLObjectFactory.makeSymbol("REMOVE-PRAGMATIC-ASSERTION");
        $ic14$ = SubLObjectFactory.makeSymbol("ADD-DETERMINER-AGREEMENT");
        $ic15$ = SubLObjectFactory.makeSymbol("REMOVE-DETERMINER-AGREEMENT");
        $ic16$ = SubLObjectFactory.makeSymbol("ADD-SPEECH-PART-PREDS");
        $ic17$ = SubLObjectFactory.makeSymbol("REMOVE-SPEECH-PART-PREDS");
        $ic18$ = SubLObjectFactory.makeSymbol("ADD-REGULAR-SUFFIX");
        $ic19$ = SubLObjectFactory.makeSymbol("REMOVE-REGULAR-SUFFIX");
        $ic20$ = SubLObjectFactory.makeSymbol("ADD-DERIVATIONAL-AFFIX-BASE-POS");
        $ic21$ = SubLObjectFactory.makeSymbol("REMOVE-DERIVATIONAL-AFFIX-BASE-POS");
        $ic22$ = SubLObjectFactory.makeSymbol("ADD-DERIVATIONAL-AFFIX-RESULT-POS");
        $ic23$ = SubLObjectFactory.makeSymbol("REMOVE-DERIVATIONAL-AFFIX-RESULT-POS");
        $ic24$ = SubLObjectFactory.makeSymbol("ADD-AFFIX-SEMANTICS");
        $ic25$ = SubLObjectFactory.makeSymbol("REMOVE-AFFIX-SEMANTICS");
        $ic26$ = SubLObjectFactory.makeSymbol("ADD-AFFIX-STRING");
        $ic27$ = SubLObjectFactory.makeSymbol("REMOVE-AFFIX-STRING");
        $ic28$ = SubLObjectFactory.makeSymbol("ADD-BASIC-SPEECH-PART-PRED");
        $ic29$ = SubLObjectFactory.makeSymbol("REMOVE-BASIC-SPEECH-PART-PRED");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0733.class
	Total time: 113 ms
	
	Decompiled with Procyon 0.5.32.
*/