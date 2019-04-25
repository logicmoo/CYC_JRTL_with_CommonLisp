package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0650 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0650";
    public static final String myFingerPrint = "30f7776870a6b7fc2360256abb834da437f5929e6827fa8420146739b0c0dd28";
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLObject $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLObject $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
    private static final SubLObject $ic13$;
    
    public static SubLObject f39690(final SubLObject var1, final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0650.NIL;
        if (module0650.NIL != module0259.f16854(var1, module0650.$ic0$, var2, (SubLObject)module0650.UNPROVIDED)) {
            var3 = f39691(var1, var3, var2);
            var3 = f39692(var1, var3, var2);
            var3 = f39693(var1, var3, var2);
            var3 = f39694(var1, var3, var2);
            var3 = f39695(var1, var3, var2);
            var3 = f39696(var1, var3, var2);
            var3 = f39697(var1, var3, var2);
            var3 = f39698(var1, var3, var2);
            var3 = f39699(var1, var3, var2);
        }
        return var3;
    }
    
    public static SubLObject f39700(final SubLObject var4, final SubLObject var2, final SubLObject var1, SubLObject var5) {
        if (var5 == module0650.UNPROVIDED) {
            var5 = (SubLObject)module0650.NIL;
        }
        if (module0650.NIL == var5) {
            var5 = var2;
        }
        return module0293.f19713(var4, var2, f39690(var1, var5));
    }
    
    public static SubLObject f39691(final SubLObject var1, final SubLObject var3, final SubLObject var2) {
        return var3;
    }
    
    public static SubLObject f39692(final SubLObject var1, final SubLObject var3, final SubLObject var2) {
        return var3;
    }
    
    public static SubLObject f39693(final SubLObject var1, final SubLObject var3, final SubLObject var2) {
        return var3;
    }
    
    public static SubLObject f39694(final SubLObject var1, final SubLObject var3, final SubLObject var2) {
        return var3;
    }
    
    public static SubLObject f39695(final SubLObject var1, final SubLObject var3, final SubLObject var2) {
        return var3;
    }
    
    public static SubLObject f39696(final SubLObject var1, SubLObject var3, final SubLObject var2) {
        var3 = f39701(var1, var3, var2);
        var3 = f39702(var1, var3, var2);
        return var3;
    }
    
    public static SubLObject f39702(final SubLObject var1, final SubLObject var3, final SubLObject var2) {
        assert module0650.NIL != module0291.f19601((SubLObject)module0650.$ic1$) : module0650.$ic1$;
        final SubLObject var4 = module0434.f30577((SubLObject)module0650.$ic3$, (SubLObject)ConsesLow.listS(module0650.$ic4$, var1, (SubLObject)module0650.$ic3$), var2, (SubLObject)module0650.ZERO_INTEGER, (SubLObject)module0650.UNPROVIDED, (SubLObject)module0650.UNPROVIDED, (SubLObject)module0650.UNPROVIDED);
        return (module0650.NIL != var4) ? conses_high.putf(var3, (SubLObject)module0650.$ic1$, Mapping.mapcar(Symbols.symbol_function((SubLObject)module0650.$ic5$), Sort.sort(var4, Symbols.symbol_function((SubLObject)module0650.$ic6$), Symbols.symbol_function((SubLObject)module0650.$ic7$)))) : var3;
    }
    
    public static SubLObject f39701(final SubLObject var1, final SubLObject var3, final SubLObject var2) {
        assert module0650.NIL != module0291.f19601((SubLObject)module0650.$ic8$) : module0650.$ic8$;
        final SubLObject var4 = module0434.f30577((SubLObject)module0650.$ic9$, (SubLObject)ConsesLow.listS(module0650.$ic10$, var1, (SubLObject)module0650.$ic9$), var2, (SubLObject)module0650.ZERO_INTEGER, (SubLObject)module0650.UNPROVIDED, (SubLObject)module0650.UNPROVIDED, (SubLObject)module0650.UNPROVIDED);
        final SubLObject var5 = Sort.sort(var4, Symbols.symbol_function((SubLObject)module0650.$ic6$), Symbols.symbol_function((SubLObject)module0650.$ic7$));
        SubLObject var6 = (SubLObject)module0650.NIL;
        SubLObject var7 = var5;
        SubLObject var8 = (SubLObject)module0650.NIL;
        var8 = var7.first();
        while (module0650.NIL != var7) {
            final SubLObject var9 = var8.first();
            final SubLObject var10 = module0288.f19338(var9, var2);
            final SubLObject var11 = (SubLObject)((module0650.NIL != assertion_handles_oc.f11035(var10)) ? module0291.f19561(var10) : module0650.NIL);
            if (module0650.NIL != module0295.f19791(var11)) {
                var6 = (SubLObject)ConsesLow.cons(var11, var6);
            }
            var7 = var7.rest();
            var8 = var7.first();
        }
        return (module0650.NIL != var6) ? conses_high.putf(var3, (SubLObject)module0650.$ic8$, Sequences.nreverse(var6)) : var3;
    }
    
    public static SubLObject f39697(final SubLObject var1, final SubLObject var3, final SubLObject var2) {
        return var3;
    }
    
    public static SubLObject f39698(final SubLObject var1, final SubLObject var3, final SubLObject var2) {
        return var3;
    }
    
    public static SubLObject f39699(final SubLObject var1, SubLObject var3, final SubLObject var2) {
        var3 = f39703(var1, var3, var2);
        return var3;
    }
    
    public static SubLObject f39703(final SubLObject var1, final SubLObject var3, final SubLObject var2) {
        assert module0650.NIL != module0291.f19601((SubLObject)module0650.$ic11$) : module0650.$ic11$;
        final SubLObject var4 = module0434.f30577((SubLObject)module0650.$ic12$, (SubLObject)ConsesLow.listS(module0650.$ic13$, var1, (SubLObject)module0650.$ic12$), var2, (SubLObject)module0650.ZERO_INTEGER, (SubLObject)module0650.UNPROVIDED, (SubLObject)module0650.UNPROVIDED, (SubLObject)module0650.UNPROVIDED);
        return (module0650.NIL != var4) ? conses_high.putf(var3, (SubLObject)module0650.$ic11$, Mapping.mapcar(Symbols.symbol_function((SubLObject)module0650.$ic5$), Sort.sort(var4, Symbols.symbol_function((SubLObject)module0650.$ic6$), Symbols.symbol_function((SubLObject)module0650.$ic7$)))) : var3;
    }
    
    public static SubLObject f39704() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0650", "f39690", "S#43582", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0650", "f39700", "S#43583", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0650", "f39691", "S#43584", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0650", "f39692", "S#43585", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0650", "f39693", "S#43586", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0650", "f39694", "S#43587", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0650", "f39695", "S#43588", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0650", "f39696", "S#43589", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0650", "f39702", "S#43590", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0650", "f39701", "S#43591", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0650", "f39697", "S#43592", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0650", "f39698", "S#43593", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0650", "f39699", "S#43594", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0650", "f39703", "S#43595", 3, 0, false);
        return (SubLObject)module0650.NIL;
    }
    
    public static SubLObject f39705() {
        return (SubLObject)module0650.NIL;
    }
    
    public static SubLObject f39706() {
        return (SubLObject)module0650.NIL;
    }
    
    public void declareFunctions() {
        f39704();
    }
    
    public void initializeVariables() {
        f39705();
    }
    
    public void runTopLevelForms() {
        f39706();
    }
    
    static {
        me = (SubLFile)new module0650();
        $ic0$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ReformulationSpecification"));
        $ic1$ = SubLObjectFactory.makeKeyword("META-PREDICATES");
        $ic2$ = SubLObjectFactory.makeSymbol("S#22212", "CYC");
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?PRED"), (SubLObject)SubLObjectFactory.makeSymbol("?POSITION"));
        $ic4$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("useMetaPredicateInReformulation"));
        $ic5$ = SubLObjectFactory.makeSymbol("FIRST");
        $ic6$ = SubLObjectFactory.makeSymbol("<");
        $ic7$ = SubLObjectFactory.makeSymbol("SECOND");
        $ic8$ = SubLObjectFactory.makeKeyword("REFORMULATOR-RULES");
        $ic9$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?RULE"), (SubLObject)SubLObjectFactory.makeSymbol("?POSITION"));
        $ic10$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("useRuleInReformulation"));
        $ic11$ = SubLObjectFactory.makeKeyword("IGNORE-RL-MODULES");
        $ic12$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("?POSITION"));
        $ic13$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ignoreModuleInReformulation"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0650.class
	Total time: 73 ms
	
	Decompiled with Procyon 0.5.32.
*/