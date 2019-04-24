package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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
        final SubLObject var3 = module0642.f39104((SubLObject)module0675.$ic2$, var1);
        final SubLObject var4 = module0642.f39104((SubLObject)module0675.$ic3$, var1);
        final SubLObject var5 = module0166.f10740(var4, (SubLObject)module0675.$ic4$, (SubLObject)module0675.$ic4$, (SubLObject)(var3.equalp((SubLObject)module0675.$ic5$) ? module0675.$ic6$ : module0675.$ic7$), (SubLObject)module0675.UNPROVIDED, (SubLObject)module0675.UNPROVIDED);
        final SubLObject var6 = module0543.f33623(var5, (SubLObject)module0675.UNPROVIDED);
        final SubLObject var7 = module0213.f13917(module0642.f39104((SubLObject)module0675.$ic8$, var1));
        final SubLObject var8 = f41255(var3, var7);
        final SubLObject var9 = module0675.$ic9$;
        if (var3.equalp((SubLObject)module0675.$ic10$)) {
            module0543.f33628((SubLObject)ConsesLow.list(module0675.$ic11$, var6, var7), var8, (SubLObject)module0675.UNPROVIDED, (SubLObject)module0675.UNPROVIDED);
        }
        else if (var3.equalp((SubLObject)module0675.$ic12$)) {
            module0543.f33628((SubLObject)ConsesLow.listS(module0675.$ic11$, var6, (SubLObject)module0675.$ic13$), var8, (SubLObject)module0675.UNPROVIDED, (SubLObject)module0675.UNPROVIDED);
            module0543.f33628((SubLObject)ConsesLow.list(module0675.$ic14$, var6, var7), var8, (SubLObject)module0675.UNPROVIDED, (SubLObject)module0675.UNPROVIDED);
        }
        else if (var3.equalp((SubLObject)module0675.$ic15$)) {
            module0543.f33628((SubLObject)ConsesLow.listS(module0675.$ic11$, var6, (SubLObject)module0675.$ic16$), module0675.$ic17$, (SubLObject)module0675.UNPROVIDED, (SubLObject)module0675.UNPROVIDED);
            module0543.f33628((SubLObject)ConsesLow.list(module0675.$ic18$, var6, var7), module0675.$ic17$, (SubLObject)module0675.UNPROVIDED, (SubLObject)module0675.UNPROVIDED);
        }
        else if (var3.equalp((SubLObject)module0675.$ic5$)) {
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
                    module0601.f36758((SubLObject)module0675.$ic19$, (SubLObject)ConsesLow.list((SubLObject)module0675.$ic20$, module0213.f13918(var6), (SubLObject)module0675.$ic21$, f41257(var6)), (SubLObject)module0675.NIL, (SubLObject)module0675.NIL);
                }
                finally {
                    module0601.$g4654$.rebind(var11, var2);
                    module0601.$g4652$.rebind(var10_11, var2);
                }
            }
            finally {
                final SubLObject var10_12 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0675.T, var2);
                    module0601.f36746();
                    module0601.f36760((SubLObject)module0675.$ic19$);
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
        return (SubLObject)module0675.NIL;
    }
    
    public static SubLObject f41256(final SubLObject var14, final SubLObject var15) {
        module0543.f33628((SubLObject)ConsesLow.listS(module0675.$ic11$, var15, (SubLObject)module0675.$ic22$), module0675.$ic17$, (SubLObject)module0675.UNPROVIDED, (SubLObject)module0675.UNPROVIDED);
        Functions.funcall((SubLObject)SubLObjectFactory.makeSymbol("S#45279", "CYC"), (SubLObject)ConsesLow.list(module0675.$ic23$, var15, var14), module0675.$ic17$);
        final SubLObject var16 = module0675.$ic24$;
        if (module0675.NIL != module0158.f10010(var14, (SubLObject)module0675.NIL, var16)) {
            final SubLObject var17 = module0158.f10011(var14, (SubLObject)module0675.NIL, var16);
            SubLObject var18 = (SubLObject)module0675.NIL;
            final SubLObject var19 = (SubLObject)module0675.NIL;
            while (module0675.NIL == var18) {
                final SubLObject var20 = module0052.f3695(var17, var19);
                final SubLObject var21 = (SubLObject)SubLObjectFactory.makeBoolean(!var19.eql(var20));
                if (module0675.NIL != var21) {
                    SubLObject var22 = (SubLObject)module0675.NIL;
                    try {
                        var22 = module0158.f10316(var20, (SubLObject)module0675.$ic25$, (SubLObject)module0675.NIL, (SubLObject)module0675.NIL);
                        SubLObject var18_23 = (SubLObject)module0675.NIL;
                        final SubLObject var19_24 = (SubLObject)module0675.NIL;
                        while (module0675.NIL == var18_23) {
                            final SubLObject var23 = module0052.f3695(var22, var19_24);
                            final SubLObject var21_26 = (SubLObject)SubLObjectFactory.makeBoolean(!var19_24.eql(var23));
                            if (module0675.NIL != var21_26) {
                                module0543.f33628(module0205.f13252(var15, var14, module0289.f19396(var23), (SubLObject)module0675.UNPROVIDED, (SubLObject)module0675.UNPROVIDED), module0178.f11287(var23), (SubLObject)module0675.UNPROVIDED, (SubLObject)module0675.UNPROVIDED);
                            }
                            var18_23 = (SubLObject)SubLObjectFactory.makeBoolean(module0675.NIL == var21_26);
                        }
                    }
                    finally {
                        final SubLObject var24 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0675.T);
                            if (module0675.NIL != var22) {
                                module0158.f10319(var22);
                            }
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var24);
                        }
                    }
                }
                var18 = (SubLObject)SubLObjectFactory.makeBoolean(module0675.NIL == var21);
            }
        }
        final SubLObject var25 = module0434.f30578((SubLObject)module0675.$ic26$, (SubLObject)ConsesLow.listS(module0675.$ic27$, (SubLObject)ConsesLow.listS(module0675.$ic11$, var14, (SubLObject)module0675.$ic28$), (SubLObject)module0675.$ic29$), module0675.$ic17$, (SubLObject)module0675.UNPROVIDED).first();
        module0543.f33628((SubLObject)ConsesLow.list(module0675.$ic11$, var15, var25), module0675.$ic17$, (SubLObject)module0675.UNPROVIDED, (SubLObject)module0675.UNPROVIDED);
        return (SubLObject)module0675.NIL;
    }
    
    public static SubLObject f41257(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        SubLObject var30 = (SubLObject)module0675.NIL;
        final SubLObject var31 = module0015.$g131$.currentBinding(var29);
        try {
            module0015.$g131$.bind((SubLObject)module0675.NIL, var29);
            try {
                module0015.$g131$.setDynamicValue(streams_high.make_private_string_output_stream(), var29);
                module0656.f39804(var28, (SubLObject)module0675.UNPROVIDED, (SubLObject)module0675.UNPROVIDED);
                var30 = streams_high.get_output_stream_string(module0015.$g131$.getDynamicValue(var29));
            }
            finally {
                final SubLObject var10_30 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0675.T, var29);
                    streams_high.close(module0015.$g131$.getDynamicValue(var29), (SubLObject)module0675.UNPROVIDED);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var10_30, var29);
                }
            }
        }
        finally {
            module0015.$g131$.rebind(var31, var29);
        }
        return module0589.f35898(var30, (SubLObject)module0675.UNPROVIDED);
    }
    
    public static SubLObject f41255(final SubLObject var3, final SubLObject var31) {
        SubLObject var32 = (SubLObject)module0675.NIL;
        if (var3.equal((SubLObject)module0675.$ic10$) && module0675.NIL != module0259.f16854(var3, module0675.$ic30$, (SubLObject)module0675.UNPROVIDED, (SubLObject)module0675.UNPROVIDED)) {
            var32 = module0675.$ic17$;
        }
        else if (var3.equal((SubLObject)module0675.$ic10$)) {
            var32 = module0434.f30578((SubLObject)module0675.$ic31$, (SubLObject)ConsesLow.listS(module0675.$ic32$, var31, (SubLObject)module0675.$ic33$), module0675.$ic34$, (SubLObject)module0675.UNPROVIDED).first();
        }
        else if (var3.equal((SubLObject)module0675.$ic10$)) {
            var32 = module0434.f30578((SubLObject)module0675.$ic31$, (SubLObject)ConsesLow.listS(module0675.$ic35$, var31, (SubLObject)module0675.$ic33$), module0675.$ic34$, (SubLObject)module0675.UNPROVIDED).first();
        }
        if (module0675.NIL == var32) {
            var32 = module0675.$ic17$;
        }
        return var32;
    }
    
    public static SubLObject f41258(final SubLObject var1) {
        final SubLObject var2 = module0656.f39970(module0642.f39104((SubLObject)module0675.$ic37$, var1));
        final SubLObject var3 = module0289.f19402(var2);
        final SubLObject var4 = (SubLObject)((module0675.NIL != var2) ? module0178.f11287(var2) : module0675.NIL);
        final SubLObject var5 = (SubLObject)((module0675.NIL != var2) ? module0731.f44864(var2) : module0675.NIL);
        final SubLObject var6 = Equality.equal((SubLObject)module0675.$ic38$, module0642.f39104((SubLObject)module0675.$ic39$, var1));
        if (module0675.NIL != var4) {
            if (module0675.NIL != var6) {
                module0543.f33631((SubLObject)ConsesLow.list(module0675.$ic40$, var5, var3), var4, (SubLObject)module0675.UNPROVIDED, (SubLObject)module0675.UNPROVIDED);
            }
            else {
                f41259((SubLObject)ConsesLow.list(module0675.$ic40$, var5, var3));
            }
        }
        return (SubLObject)module0675.NIL;
    }
    
    public static SubLObject f41260(final SubLObject var1) {
        final SubLObject var2 = module0656.f39970(module0642.f39104((SubLObject)module0675.$ic37$, var1));
        final SubLObject var3 = module0289.f19402(var2);
        final SubLObject var4 = module0742.f45941(var2);
        final SubLObject var5 = (SubLObject)((module0675.NIL != var2) ? module0178.f11287(var2) : module0675.NIL);
        final SubLObject var6 = module0642.f39104((SubLObject)module0675.$ic42$, var1);
        final SubLObject var7 = module0035.f2293((SubLObject)module0675.$ic43$, var6, (SubLObject)module0675.EQUAL, (SubLObject)module0675.UNPROVIDED);
        if (module0675.NIL != var5 && module0675.NIL != var7) {
            if (var4 != module0675.$ic44$) {
                f41259((SubLObject)ConsesLow.list(module0675.$ic45$, var3, var4));
            }
            if (var7 != module0675.$ic44$) {
                module0543.f33631((SubLObject)ConsesLow.list(module0675.$ic45$, var3, var7), var5, (SubLObject)module0675.UNPROVIDED, (SubLObject)module0675.UNPROVIDED);
            }
        }
        return (SubLObject)module0675.NIL;
    }
    
    public static SubLObject f41259(final SubLObject var39) {
        final SubLThread var40 = SubLProcess.currentSubLThread();
        SubLObject var41 = (SubLObject)module0675.ZERO_INTEGER;
        final SubLObject var42 = module0147.$g2094$.currentBinding(var40);
        final SubLObject var43 = module0147.$g2095$.currentBinding(var40);
        try {
            module0147.$g2094$.bind((SubLObject)module0675.$ic46$, var40);
            module0147.$g2095$.bind(module0675.$ic47$, var40);
            SubLObject var44 = module0288.f19342(var39, (SubLObject)module0675.UNPROVIDED);
            SubLObject var45 = (SubLObject)module0675.NIL;
            var45 = var44.first();
            while (module0675.NIL != var44) {
                var41 = Numbers.add(var41, (SubLObject)module0675.ONE_INTEGER);
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
        return (SubLObject)module0675.NIL;
    }
    
    public static SubLObject f41262() {
        return (SubLObject)module0675.NIL;
    }
    
    public static SubLObject f41263() {
        module0015.f877((SubLObject)module0675.$ic0$, (SubLObject)module0675.$ic1$);
        module0015.f873((SubLObject)module0675.$ic0$);
        module0015.f877((SubLObject)module0675.$ic36$, (SubLObject)module0675.$ic1$);
        module0015.f873((SubLObject)module0675.$ic36$);
        module0015.f877((SubLObject)module0675.$ic41$, (SubLObject)module0675.$ic1$);
        module0015.f873((SubLObject)module0675.$ic41$);
        return (SubLObject)module0675.NIL;
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
        $ic0$ = SubLObjectFactory.makeSymbol("XML-TERM-CREATE");
        $ic1$ = SubLObjectFactory.makeString("text/xml");
        $ic2$ = SubLObjectFactory.makeString("createType");
        $ic3$ = SubLObjectFactory.makeString("name");
        $ic4$ = SubLObjectFactory.makeString("");
        $ic5$ = SubLObjectFactory.makeString("spec-pred");
        $ic6$ = SubLObjectFactory.makeKeyword("DOWNCASE");
        $ic7$ = SubLObjectFactory.makeKeyword("UPCASE");
        $ic8$ = SubLObjectFactory.makeString("baseType");
        $ic9$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EnglishMt"));
        $ic10$ = SubLObjectFactory.makeString("instance");
        $ic11$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic12$ = SubLObjectFactory.makeString("spec");
        $ic13$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Collection")));
        $ic14$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genls"));
        $ic15$ = SubLObjectFactory.makeString("spec-mt");
        $ic16$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Microtheory")));
        $ic17$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $ic18$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlMt"));
        $ic19$ = SubLObjectFactory.makeString("concept");
        $ic20$ = SubLObjectFactory.makeString("externalId");
        $ic21$ = SubLObjectFactory.makeString("url");
        $ic22$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Predicate")));
        $ic23$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $ic24$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("argIsa"));
        $ic25$ = SubLObjectFactory.makeKeyword("GAF");
        $ic26$ = SubLObjectFactory.makeSymbol("?X");
        $ic27$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("and"));
        $ic28$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?X"));
        $ic29$ = ConsesLow.list((SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("PredicateTypeByArity"))));
        $ic30$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("AtemporalNecessarilyEssentialCollectionType"));
        $ic31$ = SubLObjectFactory.makeSymbol("?MT");
        $ic32$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("defaultDefiningMtForInstances"));
        $ic33$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?MT"));
        $ic34$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $ic35$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("defaultDefiningMtForSpecs"));
        $ic36$ = SubLObjectFactory.makeSymbol("XML-SET-GENSTRING-ASSERTION");
        $ic37$ = SubLObjectFactory.makeString("assert");
        $ic38$ = SubLObjectFactory.makeString("add");
        $ic39$ = SubLObjectFactory.makeString("action");
        $ic40$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genStringAssertion"));
        $ic41$ = SubLObjectFactory.makeSymbol("XML-SET-LEXICAL-MAPPING-STRENGTH");
        $ic42$ = SubLObjectFactory.makeString("strength");
        $ic43$ = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("context"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("ContextuallyDependentLexicalMapping"))), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("primary"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("PrimaryLexicalMapping"))), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("default"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("vanishing"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("VanishinglyRareLexicalMapping"))));
        $ic44$ = SubLObjectFactory.makeKeyword("DEFAULT");
        $ic45$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("strengthOfLexicalMapping"));
        $ic46$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic47$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0675.class
	Total time: 204 ms
	
	Decompiled with Procyon 0.5.32.
*/