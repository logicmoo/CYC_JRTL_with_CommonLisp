package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0740 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0740";
    public static final String myFingerPrint = "484b3508257abd2841389a78690a26ea709306f472438175a5f3afa48609f03e";
    private static SubLSymbol $g5875$;
    private static SubLSymbol $g5876$;
    private static SubLSymbol $g5877$;
    private static SubLSymbol $g5878$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLString $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLString $ic9$;
    private static final SubLString $ic10$;
    private static final SubLString $ic11$;
    private static final SubLString $ic12$;
    private static final SubLString $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLString $ic16$;
    private static final SubLSymbol $ic17$;
    
    public static SubLObject f45863() {
        return module0740.$g5877$.getGlobalValue();
    }
    
    public static SubLObject f45864() {
        module0740.$g5877$.setGlobalValue((SubLObject)module0740.T);
        return module0740.$g5877$.getGlobalValue();
    }
    
    public static SubLObject f45865() {
        module0740.$g5877$.setGlobalValue((SubLObject)module0740.NIL);
        return module0740.$g5877$.getGlobalValue();
    }
    
    public static SubLObject f45866() {
        module0740.$g5876$.setGlobalValue((SubLObject)module0740.T);
        return module0740.$g5876$.getGlobalValue();
    }
    
    public static SubLObject f45867() {
        module0740.$g5876$.setGlobalValue((SubLObject)module0740.NIL);
        return module0740.$g5876$.getGlobalValue();
    }
    
    public static SubLObject f45868() {
        return module0740.$g5876$.getGlobalValue();
    }
    
    public static SubLObject f45869(final SubLObject var1) {
        SubLObject var2 = module0021.f1060(var1, (SubLObject)module0740.NIL, (SubLObject)module0740.$ic4$);
        if (var2 != module0740.$ic4$ && var2.isList()) {
            module0740.$g5878$.setGlobalValue(var2);
        }
        else {
            Errors.warn((SubLObject)module0740.$ic5$, var2, (SubLObject)module0740.$ic6$, (SubLObject)module0740.$ic7$);
        }
        var2 = module0021.f1060(var1, (SubLObject)module0740.NIL, (SubLObject)module0740.$ic4$);
        if (var2 != module0740.$ic4$ && module0740.NIL != module0035.f2292(var2)) {
            module0740.$g5875$.setGlobalValue(var2);
        }
        else {
            Errors.warn((SubLObject)module0740.$ic5$, var2, (SubLObject)module0740.$ic0$, (SubLObject)module0740.$ic8$);
        }
        return var1;
    }
    
    public static SubLObject f45870(final SubLObject var1) {
        module0021.f1038(module0740.$g5878$.getGlobalValue(), var1);
        module0021.f1038(module0740.$g5875$.getGlobalValue(), var1);
        return var1;
    }
    
    public static SubLObject f45871() {
        SubLObject var3 = (SubLObject)module0740.NIL;
        if (module0740.NIL != module0737.f45351((SubLObject)module0740.UNPROVIDED)) {
            Errors.warn((SubLObject)module0740.$ic9$);
            return (SubLObject)module0740.NIL;
        }
        if (module0740.NIL != f45863()) {
            var3 = (SubLObject)module0740.T;
        }
        else if (module0740.NIL == module0737.f45541((SubLObject)module0740.UNPROVIDED)) {
            Errors.warn((SubLObject)module0740.$ic10$);
            var3 = (SubLObject)module0740.T;
        }
        else if (module0740.NIL != module0737.f45545((SubLObject)module0740.UNPROVIDED)) {
            Errors.warn((SubLObject)module0740.$ic11$);
            var3 = (SubLObject)module0740.T;
        }
        else if (module0740.NIL != f45872()) {
            Errors.warn((SubLObject)module0740.$ic12$);
            var3 = (SubLObject)module0740.T;
        }
        else if (module0740.NIL == f45873((SubLObject)module0740.UNPROVIDED)) {
            Errors.warn((SubLObject)module0740.$ic13$);
            var3 = (SubLObject)module0740.T;
        }
        if (module0740.NIL != var3) {
            f45864();
        }
        else {
            f45865();
        }
        return var3;
    }
    
    public static SubLObject f45874() {
        SubLObject var3 = (SubLObject)module0740.NIL;
        if (module0740.NIL != module0740.$g5875$.getGlobalValue() && module0740.NIL == var3) {
            SubLObject var4;
            SubLObject var5;
            for (var4 = module0740.$g5878$.getGlobalValue(), var5 = (SubLObject)module0740.NIL, var5 = var4.first(); module0740.NIL == var3 && module0740.NIL != var4; var3 = f45875(var5, (SubLObject)module0740.UNPROVIDED), var4 = var4.rest(), var5 = var4.first()) {}
        }
        return var3;
    }
    
    public static SubLObject f45872() {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        final SubLObject var7 = module0034.$g879$.getDynamicValue(var6);
        SubLObject var8 = (SubLObject)module0740.NIL;
        if (module0740.NIL == var7) {
            return f45874();
        }
        var8 = module0034.f1857(var7, (SubLObject)module0740.$ic14$, (SubLObject)module0740.UNPROVIDED);
        if (module0740.NIL == var8) {
            var8 = module0034.f1807(module0034.f1842(var7), (SubLObject)module0740.$ic14$, (SubLObject)module0740.ZERO_INTEGER, (SubLObject)module0740.NIL, (SubLObject)module0740.EQ, (SubLObject)module0740.UNPROVIDED);
            module0034.f1860(var7, (SubLObject)module0740.$ic14$, var8);
        }
        SubLObject var9 = module0034.f1810(var8, (SubLObject)module0740.UNPROVIDED);
        if (var9 == module0740.$ic15$) {
            var9 = Values.arg2(var6.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f45874()));
            module0034.f1812(var8, var9, (SubLObject)module0740.UNPROVIDED);
        }
        return module0034.f1959(var9);
    }
    
    public static SubLObject f45876() {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0740.NIL == module0035.f2014(module0740.$g5875$.getGlobalValue()));
    }
    
    public static SubLObject f45877() {
        f45878();
        return module0740.$g5875$.getGlobalValue();
    }
    
    public static SubLObject f45878() {
        f45879();
        SubLObject var10 = module0740.$g5878$.getGlobalValue();
        SubLObject var11 = (SubLObject)module0740.NIL;
        var11 = var10.first();
        while (module0740.NIL != var10) {
            module0740.$g5875$.setGlobalValue(module0035.f2063(module0740.$g5875$.getGlobalValue(), var11, Symbols.symbol_value(var11), (SubLObject)module0740.UNPROVIDED));
            var10 = var10.rest();
            var11 = var10.first();
        }
        f45867();
        return module0740.$g5875$.getGlobalValue();
    }
    
    public static SubLObject f45879() {
        module0740.$g5875$.setGlobalValue((SubLObject)module0740.NIL);
        return module0740.$g5875$.getGlobalValue();
    }
    
    public static SubLObject f45875(final SubLObject var5, SubLObject var11) {
        if (var11 == module0740.UNPROVIDED) {
            var11 = (SubLObject)module0740.T;
        }
        final SubLObject var12 = f45880(var5);
        final SubLObject var13 = Symbols.symbol_value(var5);
        final SubLObject var14 = module0584.f35818(var5, var12, var13);
        if (module0740.NIL == var14 && module0740.NIL != var11) {
            Errors.warn((SubLObject)module0740.$ic16$, var5);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0740.NIL == var14);
    }
    
    public static SubLObject f45880(final SubLObject var5) {
        return module0035.f2293(module0740.$g5875$.getGlobalValue(), var5, (SubLObject)module0740.UNPROVIDED, (SubLObject)module0740.UNPROVIDED);
    }
    
    public static SubLObject f45873(SubLObject var15) {
        if (var15 == module0740.UNPROVIDED) {
            var15 = module0737.f45538();
        }
        final SubLObject var16 = Sequences.find_if((SubLObject)module0740.$ic17$, module0087.f5980(var15), (SubLObject)module0740.UNPROVIDED, (SubLObject)module0740.UNPROVIDED, (SubLObject)module0740.UNPROVIDED);
        final SubLObject var17 = var16.first();
        return module0035.f2014(module0737.f45432(var17, (SubLObject)module0740.UNPROVIDED, (SubLObject)module0740.UNPROVIDED));
    }
    
    public static SubLObject f45881() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0740", "f45863", "S#50123", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0740", "f45864", "S#50124", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0740", "f45865", "S#49554", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0740", "f45866", "S#37940", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0740", "f45867", "S#50125", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0740", "f45868", "S#49557", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0740", "f45869", "S#48761", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0740", "f45870", "S#48758", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0740", "f45871", "S#50126", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0740", "f45874", "S#50127", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0740", "f45872", "S#49558", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0740", "f45876", "S#49556", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0740", "f45877", "S#50128", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0740", "f45878", "S#49553", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0740", "f45879", "S#49551", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0740", "f45875", "S#50129", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0740", "f45880", "S#50130", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0740", "f45873", "S#50131", 0, 1, false);
        return (SubLObject)module0740.NIL;
    }
    
    public static SubLObject f45882() {
        module0740.$g5875$ = SubLFiles.deflexical("S#50132", (SubLObject)((module0740.NIL != Symbols.boundp((SubLObject)module0740.$ic0$)) ? module0740.$g5875$.getGlobalValue() : module0740.NIL));
        module0740.$g5876$ = SubLFiles.deflexical("S#50133", (SubLObject)((module0740.NIL != Symbols.boundp((SubLObject)module0740.$ic1$)) ? module0740.$g5876$.getGlobalValue() : module0740.T));
        module0740.$g5877$ = SubLFiles.deflexical("S#50134", (SubLObject)((module0740.NIL != Symbols.boundp((SubLObject)module0740.$ic2$)) ? module0740.$g5877$.getGlobalValue() : module0740.NIL));
        module0740.$g5878$ = SubLFiles.deflexical("S#50135", (SubLObject)module0740.$ic3$);
        return (SubLObject)module0740.NIL;
    }
    
    public static SubLObject f45883() {
        module0003.f57((SubLObject)module0740.$ic0$);
        module0003.f57((SubLObject)module0740.$ic1$);
        module0003.f57((SubLObject)module0740.$ic2$);
        SubLObject var10 = module0740.$g5878$.getGlobalValue();
        SubLObject var11 = (SubLObject)module0740.NIL;
        var11 = var10.first();
        while (module0740.NIL != var10) {
            module0012.f416(var11);
            var10 = var10.rest();
            var11 = var10.first();
        }
        module0034.f1895((SubLObject)module0740.$ic14$);
        return (SubLObject)module0740.NIL;
    }
    
    public void declareFunctions() {
        f45881();
    }
    
    public void initializeVariables() {
        f45882();
    }
    
    public void runTopLevelForms() {
        f45883();
    }
    
    static {
        me = (SubLFile)new module0740();
        module0740.$g5875$ = null;
        module0740.$g5876$ = null;
        module0740.$g5877$ = null;
        module0740.$g5878$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#50132", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#50133", "CYC");
        $ic2$ = SubLObjectFactory.makeSymbol("S#50134", "CYC");
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*NL-TRIE-CODE-REVISION*"), (SubLObject)SubLObjectFactory.makeSymbol("*MORPHOLOGY-CODE-REVISION*"), (SubLObject)SubLObjectFactory.makeSymbol("*LEXICON-CACHE-CODE-REVISION*"));
        $ic4$ = SubLObjectFactory.makeKeyword("EOF");
        $ic5$ = SubLObjectFactory.makeString("~&~S is not the right type of object for ~S (expected a ~S).");
        $ic6$ = SubLObjectFactory.makeSymbol("S#50135", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("LISTP");
        $ic8$ = SubLObjectFactory.makeSymbol("S#3593", "CYC");
        $ic9$ = SubLObjectFactory.makeString("NL trie is currently being initialized.");
        $ic10$ = SubLObjectFactory.makeString("NL trie not present.~%");
        $ic11$ = SubLObjectFactory.makeString("NL trie empty.~%");
        $ic12$ = SubLObjectFactory.makeString("NL trie built with stale code~%");
        $ic13$ = SubLObjectFactory.makeString("NL trie simple string retrieval failed.~%");
        $ic14$ = SubLObjectFactory.makeSymbol("S#49558", "CYC");
        $ic15$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic16$ = SubLObjectFactory.makeString("NL trie built with stale version of ~S~%");
        $ic17$ = SubLObjectFactory.makeSymbol("SINGLETON?");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0740.class
	Total time: 101 ms
	
	Decompiled with Procyon 0.5.32.
*/