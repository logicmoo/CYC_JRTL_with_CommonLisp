package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0675 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0675";
    public static final String myFingerPrint = "4b0aacda645390babe530290cff3540c7f246ae185be5c1e1e0c10351c83519a";
    private static final SubLSymbol $ic0$;
    private static final SubLString $ic1$;
    private static final SubLString $ic2$;
    private static final SubLString $ic3$;
    private static final SubLString $ic4$;
    private static final SubLString $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLString $ic8$;
    private static final SubLObject $ic9$;
    private static final SubLString $ic10$;
    private static final SubLObject $ic11$;
    private static final SubLString $ic12$;
    private static final SubLList $ic13$;
    private static final SubLObject $ic14$;
    private static final SubLString $ic15$;
    private static final SubLList $ic16$;
    private static final SubLObject $ic17$;
    private static final SubLObject $ic18$;
    private static final SubLString $ic19$;
    private static final SubLString $ic20$;
    private static final SubLString $ic21$;
    private static final SubLList $ic22$;
    private static final SubLObject $ic23$;
    private static final SubLObject $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLObject $ic27$;
    private static final SubLList $ic28$;
    private static final SubLList $ic29$;
    private static final SubLObject $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLObject $ic32$;
    private static final SubLList $ic33$;
    private static final SubLObject $ic34$;
    private static final SubLObject $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLString $ic37$;
    private static final SubLString $ic38$;
    private static final SubLString $ic39$;
    private static final SubLObject $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLString $ic42$;
    private static final SubLList $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLObject $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLObject $ic47$;
    
    public static SubLObject f41254(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0642.f39104((SubLObject)$ic2$, var1);
        final SubLObject var4 = module0642.f39104((SubLObject)$ic3$, var1);
        final SubLObject var5 = constants_high_oc.f10740(var4, (SubLObject)$ic4$, (SubLObject)$ic4$, (SubLObject)(var3.equalp((SubLObject)$ic5$) ? $ic6$ : $ic7$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var6 = module0543.f33623(var5, (SubLObject)UNPROVIDED);
        final SubLObject var7 = module0213.f13917(module0642.f39104((SubLObject)$ic8$, var1));
        final SubLObject var8 = f41255(var3, var7);
        final SubLObject var9 = $ic9$;
        if (var3.equalp((SubLObject)$ic10$)) {
            module0543.f33628((SubLObject)ConsesLow.list($ic11$, var6, var7), var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (var3.equalp((SubLObject)$ic12$)) {
            module0543.f33628((SubLObject)ConsesLow.listS($ic11$, var6, (SubLObject)$ic13$), var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0543.f33628((SubLObject)ConsesLow.list($ic14$, var6, var7), var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (var3.equalp((SubLObject)$ic15$)) {
            module0543.f33628((SubLObject)ConsesLow.listS($ic11$, var6, (SubLObject)$ic16$), $ic17$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0543.f33628((SubLObject)ConsesLow.list($ic18$, var6, var7), $ic17$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (var3.equalp((SubLObject)$ic5$)) {
            f41256(var7, var6);
        }
        final SubLObject var10 = module0587.$g4457$.currentBinding(var2);
        try {
            module0587.$g4457$.bind(module0015.$g131$.getDynamicValue(var2), var2);
            try {
                final SubLObject var10_11 = module0601.$g4652$.currentBinding(var2);
                final SubLObject var11 = module0601.$g4654$.currentBinding(var2);
                try {
                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                    module0601.f36758((SubLObject)$ic19$, (SubLObject)ConsesLow.list((SubLObject)$ic20$, module0213.f13918(var6), (SubLObject)$ic21$, f41257(var6)), (SubLObject)NIL, (SubLObject)NIL);
                }
                finally {
                    module0601.$g4654$.rebind(var11, var2);
                    module0601.$g4652$.rebind(var10_11, var2);
                }
            }
            finally {
                final SubLObject var10_12 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var2);
                    module0601.f36746();
                    module0601.f36760((SubLObject)$ic19$);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var10_12, var2);
                }
            }
        }
        finally {
            module0587.$g4457$.rebind(var10, var2);
        }
        module0677.f41359(var6);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41256(final SubLObject var14, final SubLObject var15) {
        module0543.f33628((SubLObject)ConsesLow.listS($ic11$, var15, (SubLObject)$ic22$), $ic17$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        Functions.funcall((SubLObject)makeSymbol("S#45279", "CYC"), (SubLObject)ConsesLow.list($ic23$, var15, var14), $ic17$);
        final SubLObject var16 = $ic24$;
        if (NIL != module0158.f10010(var14, (SubLObject)NIL, var16)) {
            final SubLObject var17 = module0158.f10011(var14, (SubLObject)NIL, var16);
            SubLObject var18 = (SubLObject)NIL;
            final SubLObject var19 = (SubLObject)NIL;
            while (NIL == var18) {
                final SubLObject var20 = module0052.f3695(var17, var19);
                final SubLObject var21 = (SubLObject)makeBoolean(!var19.eql(var20));
                if (NIL != var21) {
                    SubLObject var22 = (SubLObject)NIL;
                    try {
                        var22 = module0158.f10316(var20, (SubLObject)$ic25$, (SubLObject)NIL, (SubLObject)NIL);
                        SubLObject var18_23 = (SubLObject)NIL;
                        final SubLObject var19_24 = (SubLObject)NIL;
                        while (NIL == var18_23) {
                            final SubLObject var23 = module0052.f3695(var22, var19_24);
                            final SubLObject var21_26 = (SubLObject)makeBoolean(!var19_24.eql(var23));
                            if (NIL != var21_26) {
                                module0543.f33628(module0205.f13252(var15, var14, module0289.f19396(var23), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), module0178.f11287(var23), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            var18_23 = (SubLObject)makeBoolean(NIL == var21_26);
                        }
                    }
                    finally {
                        final SubLObject var24 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                            if (NIL != var22) {
                                module0158.f10319(var22);
                            }
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var24);
                        }
                    }
                }
                var18 = (SubLObject)makeBoolean(NIL == var21);
            }
        }
        final SubLObject var25 = module0434.f30578((SubLObject)$ic26$, (SubLObject)ConsesLow.listS($ic27$, (SubLObject)ConsesLow.listS($ic11$, var14, (SubLObject)$ic28$), (SubLObject)$ic29$), $ic17$, (SubLObject)UNPROVIDED).first();
        module0543.f33628((SubLObject)ConsesLow.list($ic11$, var15, var25), $ic17$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41257(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        SubLObject var30 = (SubLObject)NIL;
        final SubLObject var31 = module0015.$g131$.currentBinding(var29);
        try {
            module0015.$g131$.bind((SubLObject)NIL, var29);
            try {
                module0015.$g131$.setDynamicValue(streams_high.make_private_string_output_stream(), var29);
                module0656.f39804(var28, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var30 = streams_high.get_output_stream_string(module0015.$g131$.getDynamicValue(var29));
            }
            finally {
                final SubLObject var10_30 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var29);
                    streams_high.close(module0015.$g131$.getDynamicValue(var29), (SubLObject)UNPROVIDED);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var10_30, var29);
                }
            }
        }
        finally {
            module0015.$g131$.rebind(var31, var29);
        }
        return module0589.f35898(var30, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41255(final SubLObject var3, final SubLObject var31) {
        SubLObject var32 = (SubLObject)NIL;
        if (var3.equal((SubLObject)$ic10$) && NIL != module0259.f16854(var3, $ic30$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            var32 = $ic17$;
        }
        else if (var3.equal((SubLObject)$ic10$)) {
            var32 = module0434.f30578((SubLObject)$ic31$, (SubLObject)ConsesLow.listS($ic32$, var31, (SubLObject)$ic33$), $ic34$, (SubLObject)UNPROVIDED).first();
        }
        else if (var3.equal((SubLObject)$ic10$)) {
            var32 = module0434.f30578((SubLObject)$ic31$, (SubLObject)ConsesLow.listS($ic35$, var31, (SubLObject)$ic33$), $ic34$, (SubLObject)UNPROVIDED).first();
        }
        if (NIL == var32) {
            var32 = $ic17$;
        }
        return var32;
    }
    
    public static SubLObject f41258(final SubLObject var1) {
        final SubLObject var2 = module0656.f39970(module0642.f39104((SubLObject)$ic37$, var1));
        final SubLObject var3 = module0289.f19402(var2);
        final SubLObject var4 = (SubLObject)((NIL != var2) ? module0178.f11287(var2) : NIL);
        final SubLObject var5 = (SubLObject)((NIL != var2) ? module0731.f44864(var2) : NIL);
        final SubLObject var6 = Equality.equal((SubLObject)$ic38$, module0642.f39104((SubLObject)$ic39$, var1));
        if (NIL != var4) {
            if (NIL != var6) {
                module0543.f33631((SubLObject)ConsesLow.list($ic40$, var5, var3), var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else {
                f41259((SubLObject)ConsesLow.list($ic40$, var5, var3));
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41260(final SubLObject var1) {
        final SubLObject var2 = module0656.f39970(module0642.f39104((SubLObject)$ic37$, var1));
        final SubLObject var3 = module0289.f19402(var2);
        final SubLObject var4 = module0742.f45941(var2);
        final SubLObject var5 = (SubLObject)((NIL != var2) ? module0178.f11287(var2) : NIL);
        final SubLObject var6 = module0642.f39104((SubLObject)$ic42$, var1);
        final SubLObject var7 = module0035.f2293((SubLObject)$ic43$, var6, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
        if (NIL != var5 && NIL != var7) {
            if (var4 != $ic44$) {
                f41259((SubLObject)ConsesLow.list($ic45$, var3, var4));
            }
            if (var7 != $ic44$) {
                module0543.f33631((SubLObject)ConsesLow.list($ic45$, var3, var7), var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41259(final SubLObject var39) {
        final SubLThread var40 = SubLProcess.currentSubLThread();
        SubLObject var41 = (SubLObject)ZERO_INTEGER;
        final SubLObject var42 = module0147.$g2094$.currentBinding(var40);
        final SubLObject var43 = module0147.$g2095$.currentBinding(var40);
        try {
            module0147.$g2094$.bind((SubLObject)$ic46$, var40);
            module0147.$g2095$.bind($ic47$, var40);
            SubLObject var44 = module0288.f19342(var39, (SubLObject)UNPROVIDED);
            SubLObject var45 = (SubLObject)NIL;
            var45 = var44.first();
            while (NIL != var44) {
                var41 = Numbers.add(var41, (SubLObject)ONE_INTEGER);
                module0543.f33658(var39, module0178.f11287(var45));
                var44 = var44.rest();
                var45 = var44.first();
            }
        }
        finally {
            module0147.$g2095$.rebind(var43, var40);
            module0147.$g2094$.rebind(var42, var40);
        }
        return var41;
    }
    
    public static SubLObject f41261() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0675", "f41254", "XML-TERM-CREATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0675", "f41256", "S#45282", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0675", "f41257", "S#45283", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0675", "f41255", "S#45284", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0675", "f41258", "XML-SET-GENSTRING-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0675", "f41260", "XML-SET-LEXICAL-MAPPING-STRENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0675", "f41259", "S#45285", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41262() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41263() {
        module0015.f877((SubLObject)$ic0$, (SubLObject)$ic1$);
        module0015.f873((SubLObject)$ic0$);
        module0015.f877((SubLObject)$ic36$, (SubLObject)$ic1$);
        module0015.f873((SubLObject)$ic36$);
        module0015.f877((SubLObject)$ic41$, (SubLObject)$ic1$);
        module0015.f873((SubLObject)$ic41$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f41261();
    }
    
    public void initializeVariables() {
        f41262();
    }
    
    public void runTopLevelForms() {
        f41263();
    }
    
    static {
        me = (SubLFile)new module0675();
        $ic0$ = makeSymbol("XML-TERM-CREATE");
        $ic1$ = makeString("text/xml");
        $ic2$ = makeString("createType");
        $ic3$ = makeString("name");
        $ic4$ = makeString("");
        $ic5$ = makeString("spec-pred");
        $ic6$ = makeKeyword("DOWNCASE");
        $ic7$ = makeKeyword("UPCASE");
        $ic8$ = makeString("baseType");
        $ic9$ = constant_handles_oc.f8479((SubLObject)makeString("EnglishMt"));
        $ic10$ = makeString("instance");
        $ic11$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic12$ = makeString("spec");
        $ic13$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Collection")));
        $ic14$ = constant_handles_oc.f8479((SubLObject)makeString("genls"));
        $ic15$ = makeString("spec-mt");
        $ic16$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Microtheory")));
        $ic17$ = constant_handles_oc.f8479((SubLObject)makeString("UniversalVocabularyMt"));
        $ic18$ = constant_handles_oc.f8479((SubLObject)makeString("genlMt"));
        $ic19$ = makeString("concept");
        $ic20$ = makeString("externalId");
        $ic21$ = makeString("url");
        $ic22$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Predicate")));
        $ic23$ = constant_handles_oc.f8479((SubLObject)makeString("genlPreds"));
        $ic24$ = constant_handles_oc.f8479((SubLObject)makeString("argIsa"));
        $ic25$ = makeKeyword("GAF");
        $ic26$ = makeSymbol("?X");
        $ic27$ = constant_handles_oc.f8479((SubLObject)makeString("and"));
        $ic28$ = ConsesLow.list((SubLObject)makeSymbol("?X"));
        $ic29$ = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?X"), constant_handles_oc.f8479((SubLObject)makeString("PredicateTypeByArity"))));
        $ic30$ = constant_handles_oc.f8479((SubLObject)makeString("AtemporalNecessarilyEssentialCollectionType"));
        $ic31$ = makeSymbol("?MT");
        $ic32$ = constant_handles_oc.f8479((SubLObject)makeString("defaultDefiningMtForInstances"));
        $ic33$ = ConsesLow.list((SubLObject)makeSymbol("?MT"));
        $ic34$ = constant_handles_oc.f8479((SubLObject)makeString("BaseKB"));
        $ic35$ = constant_handles_oc.f8479((SubLObject)makeString("defaultDefiningMtForSpecs"));
        $ic36$ = makeSymbol("XML-SET-GENSTRING-ASSERTION");
        $ic37$ = makeString("assert");
        $ic38$ = makeString("add");
        $ic39$ = makeString("action");
        $ic40$ = constant_handles_oc.f8479((SubLObject)makeString("genStringAssertion"));
        $ic41$ = makeSymbol("XML-SET-LEXICAL-MAPPING-STRENGTH");
        $ic42$ = makeString("strength");
        $ic43$ = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)makeString("context"), constant_handles_oc.f8479((SubLObject)makeString("ContextuallyDependentLexicalMapping"))), (SubLObject)ConsesLow.cons((SubLObject)makeString("primary"), constant_handles_oc.f8479((SubLObject)makeString("PrimaryLexicalMapping"))), (SubLObject)ConsesLow.cons((SubLObject)makeString("default"), (SubLObject)makeKeyword("DEFAULT")), (SubLObject)ConsesLow.cons((SubLObject)makeString("vanishing"), constant_handles_oc.f8479((SubLObject)makeString("VanishinglyRareLexicalMapping"))));
        $ic44$ = makeKeyword("DEFAULT");
        $ic45$ = constant_handles_oc.f8479((SubLObject)makeString("strengthOfLexicalMapping"));
        $ic46$ = makeSymbol("S#12274", "CYC");
        $ic47$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 204 ms
	
	Decompiled with Procyon 0.5.32.
*/