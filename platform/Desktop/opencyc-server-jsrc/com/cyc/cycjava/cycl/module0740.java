package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        return $g5877$.getGlobalValue();
    }
    
    public static SubLObject f45864() {
        $g5877$.setGlobalValue((SubLObject)T);
        return $g5877$.getGlobalValue();
    }
    
    public static SubLObject f45865() {
        $g5877$.setGlobalValue((SubLObject)NIL);
        return $g5877$.getGlobalValue();
    }
    
    public static SubLObject f45866() {
        $g5876$.setGlobalValue((SubLObject)T);
        return $g5876$.getGlobalValue();
    }
    
    public static SubLObject f45867() {
        $g5876$.setGlobalValue((SubLObject)NIL);
        return $g5876$.getGlobalValue();
    }
    
    public static SubLObject f45868() {
        return $g5876$.getGlobalValue();
    }
    
    public static SubLObject f45869(final SubLObject var1) {
        SubLObject var2 = module0021.f1060(var1, (SubLObject)NIL, (SubLObject)$ic4$);
        if (var2 != $ic4$ && var2.isList()) {
            $g5878$.setGlobalValue(var2);
        }
        else {
            Errors.warn((SubLObject)$ic5$, var2, (SubLObject)$ic6$, (SubLObject)$ic7$);
        }
        var2 = module0021.f1060(var1, (SubLObject)NIL, (SubLObject)$ic4$);
        if (var2 != $ic4$ && NIL != module0035.f2292(var2)) {
            $g5875$.setGlobalValue(var2);
        }
        else {
            Errors.warn((SubLObject)$ic5$, var2, (SubLObject)$ic0$, (SubLObject)$ic8$);
        }
        return var1;
    }
    
    public static SubLObject f45870(final SubLObject var1) {
        module0021.f1038($g5878$.getGlobalValue(), var1);
        module0021.f1038($g5875$.getGlobalValue(), var1);
        return var1;
    }
    
    public static SubLObject f45871() {
        SubLObject var3 = (SubLObject)NIL;
        if (NIL != module0737.f45351((SubLObject)UNPROVIDED)) {
            Errors.warn((SubLObject)$ic9$);
            return (SubLObject)NIL;
        }
        if (NIL != f45863()) {
            var3 = (SubLObject)T;
        }
        else if (NIL == module0737.f45541((SubLObject)UNPROVIDED)) {
            Errors.warn((SubLObject)$ic10$);
            var3 = (SubLObject)T;
        }
        else if (NIL != module0737.f45545((SubLObject)UNPROVIDED)) {
            Errors.warn((SubLObject)$ic11$);
            var3 = (SubLObject)T;
        }
        else if (NIL != f45872()) {
            Errors.warn((SubLObject)$ic12$);
            var3 = (SubLObject)T;
        }
        else if (NIL == f45873((SubLObject)UNPROVIDED)) {
            Errors.warn((SubLObject)$ic13$);
            var3 = (SubLObject)T;
        }
        if (NIL != var3) {
            f45864();
        }
        else {
            f45865();
        }
        return var3;
    }
    
    public static SubLObject f45874() {
        SubLObject var3 = (SubLObject)NIL;
        if (NIL != $g5875$.getGlobalValue() && NIL == var3) {
            SubLObject var4;
            SubLObject var5;
            for (var4 = $g5878$.getGlobalValue(), var5 = (SubLObject)NIL, var5 = var4.first(); NIL == var3 && NIL != var4; var3 = f45875(var5, (SubLObject)UNPROVIDED), var4 = var4.rest(), var5 = var4.first()) {}
        }
        return var3;
    }
    
    public static SubLObject f45872() {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        final SubLObject var7 = module0034.$g879$.getDynamicValue(var6);
        SubLObject var8 = (SubLObject)NIL;
        if (NIL == var7) {
            return f45874();
        }
        var8 = module0034.f1857(var7, (SubLObject)$ic14$, (SubLObject)UNPROVIDED);
        if (NIL == var8) {
            var8 = module0034.f1807(module0034.f1842(var7), (SubLObject)$ic14$, (SubLObject)ZERO_INTEGER, (SubLObject)NIL, (SubLObject)EQ, (SubLObject)UNPROVIDED);
            module0034.f1860(var7, (SubLObject)$ic14$, var8);
        }
        SubLObject var9 = module0034.f1810(var8, (SubLObject)UNPROVIDED);
        if (var9 == $ic15$) {
            var9 = Values.arg2(var6.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f45874()));
            module0034.f1812(var8, var9, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var9);
    }
    
    public static SubLObject f45876() {
        return (SubLObject)makeBoolean(NIL == module0035.f2014($g5875$.getGlobalValue()));
    }
    
    public static SubLObject f45877() {
        f45878();
        return $g5875$.getGlobalValue();
    }
    
    public static SubLObject f45878() {
        f45879();
        SubLObject var10 = $g5878$.getGlobalValue();
        SubLObject var11 = (SubLObject)NIL;
        var11 = var10.first();
        while (NIL != var10) {
            $g5875$.setGlobalValue(module0035.f2063($g5875$.getGlobalValue(), var11, Symbols.symbol_value(var11), (SubLObject)UNPROVIDED));
            var10 = var10.rest();
            var11 = var10.first();
        }
        f45867();
        return $g5875$.getGlobalValue();
    }
    
    public static SubLObject f45879() {
        $g5875$.setGlobalValue((SubLObject)NIL);
        return $g5875$.getGlobalValue();
    }
    
    public static SubLObject f45875(final SubLObject var5, SubLObject var11) {
        if (var11 == UNPROVIDED) {
            var11 = (SubLObject)T;
        }
        final SubLObject var12 = f45880(var5);
        final SubLObject var13 = Symbols.symbol_value(var5);
        final SubLObject var14 = module0584.f35818(var5, var12, var13);
        if (NIL == var14 && NIL != var11) {
            Errors.warn((SubLObject)$ic16$, var5);
        }
        return (SubLObject)makeBoolean(NIL == var14);
    }
    
    public static SubLObject f45880(final SubLObject var5) {
        return module0035.f2293($g5875$.getGlobalValue(), var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f45873(SubLObject var15) {
        if (var15 == UNPROVIDED) {
            var15 = module0737.f45538();
        }
        final SubLObject var16 = Sequences.find_if((SubLObject)$ic17$, module0087.f5980(var15), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var17 = var16.first();
        return module0035.f2014(module0737.f45432(var17, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45882() {
        $g5875$ = SubLFiles.deflexical("S#50132", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic0$)) ? $g5875$.getGlobalValue() : NIL));
        $g5876$ = SubLFiles.deflexical("S#50133", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic1$)) ? $g5876$.getGlobalValue() : T));
        $g5877$ = SubLFiles.deflexical("S#50134", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic2$)) ? $g5877$.getGlobalValue() : NIL));
        $g5878$ = SubLFiles.deflexical("S#50135", (SubLObject)$ic3$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45883() {
        module0003.f57((SubLObject)$ic0$);
        module0003.f57((SubLObject)$ic1$);
        module0003.f57((SubLObject)$ic2$);
        SubLObject var10 = $g5878$.getGlobalValue();
        SubLObject var11 = (SubLObject)NIL;
        var11 = var10.first();
        while (NIL != var10) {
            module0012.f416(var11);
            var10 = var10.rest();
            var11 = var10.first();
        }
        module0034.f1895((SubLObject)$ic14$);
        return (SubLObject)NIL;
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
        $g5875$ = null;
        $g5876$ = null;
        $g5877$ = null;
        $g5878$ = null;
        $ic0$ = makeSymbol("S#50132", "CYC");
        $ic1$ = makeSymbol("S#50133", "CYC");
        $ic2$ = makeSymbol("S#50134", "CYC");
        $ic3$ = ConsesLow.list((SubLObject)makeSymbol("*NL-TRIE-CODE-REVISION*"), (SubLObject)makeSymbol("*MORPHOLOGY-CODE-REVISION*"), (SubLObject)makeSymbol("*LEXICON-CACHE-CODE-REVISION*"));
        $ic4$ = makeKeyword("EOF");
        $ic5$ = makeString("~&~S is not the right type of object for ~S (expected a ~S).");
        $ic6$ = makeSymbol("S#50135", "CYC");
        $ic7$ = makeSymbol("LISTP");
        $ic8$ = makeSymbol("S#3593", "CYC");
        $ic9$ = makeString("NL trie is currently being initialized.");
        $ic10$ = makeString("NL trie not present.~%");
        $ic11$ = makeString("NL trie empty.~%");
        $ic12$ = makeString("NL trie built with stale code~%");
        $ic13$ = makeString("NL trie simple string retrieval failed.~%");
        $ic14$ = makeSymbol("S#49558", "CYC");
        $ic15$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic16$ = makeString("NL trie built with stale version of ~S~%");
        $ic17$ = makeSymbol("SINGLETON?");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 101 ms
	
	Decompiled with Procyon 0.5.32.
*/