package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0609 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0609";
    public static final String myFingerPrint = "7e568dcca55a3b5f85ebad1a842a3927831fbbcc0be26594b29b6300e1a1f38c";
    private static final SubLSymbol $ic0$;
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
    
    public static SubLObject f37178(final SubLObject var1) {
        if (NIL == var1) {
            module0229.f15259();
            return (SubLObject)NIL;
        }
        if (NIL != module0035.f1997(var1)) {
            return var1.first();
        }
        return f37179((SubLObject)$ic0$, (SubLObject)NIL, var1);
    }
    
    public static SubLObject f37180(final SubLObject var2, final SubLObject var3) {
        if (var2.isNumber() && var3.isNumber()) {
            return f37181(Numbers.add(var2, var3));
        }
        return module0610.f37235(var2, var3);
    }
    
    public static SubLObject f37182(final SubLObject var2, final SubLObject var3) {
        return f37180(var2, f37183(var3));
    }
    
    public static SubLObject f37183(final SubLObject var4) {
        if (var4.isNumber()) {
            return f37181(Numbers.minus(var4));
        }
        return module0610.f37237(var4);
    }
    
    public static SubLObject f37184(final SubLObject var1) {
        return f37179((SubLObject)$ic4$, (SubLObject)ONE_INTEGER, var1);
    }
    
    public static SubLObject f37185(final SubLObject var2, final SubLObject var3) {
        if (ZERO_INTEGER.eql(var2)) {
            return (SubLObject)ZERO_INTEGER;
        }
        if (ZERO_INTEGER.eql(var3)) {
            return (SubLObject)ZERO_INTEGER;
        }
        if (ONE_INTEGER.eql(var2)) {
            return var3;
        }
        if (ONE_INTEGER.eql(var3)) {
            return var2;
        }
        if (var2.isNumber() && var3.isNumber()) {
            return f37181(Numbers.multiply(var2, var3));
        }
        return module0610.f37240(var2, var3);
    }
    
    public static SubLObject f37186(final SubLObject var2, final SubLObject var3) {
        return f37187(var3, var2);
    }
    
    public static SubLObject f37187(SubLObject var2, SubLObject var3) {
        var2 = f37188(var2);
        var3 = f37188(var3);
        if (var2.isNumber() && var3.isNumber()) {
            return Numbers.numL(var2, var3);
        }
        return module0610.f37289(var2, var3);
    }
    
    public static SubLObject f37189(final SubLObject var2, final SubLObject var3) {
        return f37190(var3, var2);
    }
    
    public static SubLObject f37190(SubLObject var2, SubLObject var3) {
        var2 = f37188(var2);
        var3 = f37188(var3);
        if (var2.isNumber() && var3.isNumber()) {
            return Numbers.numLE(var2, var3);
        }
        return module0610.f37291(var2, var3);
    }
    
    public static SubLObject f37191(final SubLObject var2, final SubLObject var3) {
        return (SubLObject)makeBoolean(NIL != f37190(var2, var3) && NIL != f37189(var2, var3));
    }
    
    public static SubLObject f37179(final SubLObject var5, final SubLObject var6, final SubLObject var1) {
        final SubLObject var7 = Sequences.length(var1);
        if (var7.numE((SubLObject)ZERO_INTEGER)) {
            if (NIL != var6) {
                return var6;
            }
            module0229.f15259();
            return (SubLObject)NIL;
        }
        else {
            if (!var7.numE((SubLObject)ONE_INTEGER)) {
                SubLObject var8 = var1.first();
                SubLObject var9 = (SubLObject)NIL;
                SubLObject var10 = (SubLObject)NIL;
                SubLObject var11 = (SubLObject)NIL;
                var9 = var1.rest();
                var10 = var8;
                var11 = var9.first();
                while (NIL != var9) {
                    var8 = Functions.funcall(var5, var10, var11);
                    var9 = var9.rest();
                    var10 = var8;
                    var11 = var9.first();
                }
                return var8;
            }
            if (NIL != var6) {
                return Functions.funcall(var5, var6, var1.first());
            }
            return var1.first();
        }
    }
    
    public static SubLObject f37181(final SubLObject var12) {
        return f37188(var12);
    }
    
    public static SubLObject f37188(final SubLObject var13) {
        if (var13.isDouble()) {
            final SubLObject var14 = module0048.f3302(var13, (SubLObject)FIFTEEN_INTEGER);
            if (!var13.numE(var14)) {
                final SubLObject var15 = module0048.f3302(var13, (SubLObject)TEN_INTEGER);
                if (var15.numE(var14)) {
                    return var14;
                }
            }
        }
        return var13;
    }
    
    public static SubLObject f37192() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0609", "f37178", "CYC-PLUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0609", "f37180", "S#40985", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0609", "f37182", "CYC-DIFFERENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0609", "f37183", "CYC-MINUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0609", "f37184", "CYC-TIMES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0609", "f37185", "S#40986", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0609", "f37186", "CYC-GREATER-THAN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0609", "f37187", "CYC-LESS-THAN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0609", "f37189", "CYC-GREATER-THAN-OR-EQUAL-TO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0609", "f37190", "CYC-LESS-THAN-OR-EQUAL-TO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0609", "f37191", "CYC-NUMERICALLY-EQUAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0609", "f37179", "S#40987", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0609", "f37181", "S#40988", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0609", "f37188", "S#40989", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37193() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37194() {
        module0012.f416((SubLObject)$ic1$);
        module0012.f416((SubLObject)$ic2$);
        module0012.f416((SubLObject)$ic3$);
        module0012.f416((SubLObject)$ic5$);
        module0012.f416((SubLObject)$ic6$);
        module0012.f416((SubLObject)$ic7$);
        module0012.f416((SubLObject)$ic8$);
        module0012.f416((SubLObject)$ic9$);
        module0012.f416((SubLObject)$ic10$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f37192();
    }
    
    public void initializeVariables() {
        f37193();
    }
    
    public void runTopLevelForms() {
        f37194();
    }
    
    static {
        me = (SubLFile)new module0609();
        $ic0$ = makeSymbol("S#40985", "CYC");
        $ic1$ = makeSymbol("CYC-PLUS");
        $ic2$ = makeSymbol("CYC-DIFFERENCE");
        $ic3$ = makeSymbol("CYC-MINUS");
        $ic4$ = makeSymbol("S#40986", "CYC");
        $ic5$ = makeSymbol("CYC-TIMES");
        $ic6$ = makeSymbol("CYC-GREATER-THAN");
        $ic7$ = makeSymbol("CYC-LESS-THAN");
        $ic8$ = makeSymbol("CYC-GREATER-THAN-OR-EQUAL-TO");
        $ic9$ = makeSymbol("CYC-LESS-THAN-OR-EQUAL-TO");
        $ic10$ = makeSymbol("CYC-NUMERICALLY-EQUAL");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 66 ms
	
	Decompiled with Procyon 0.5.32.
*/