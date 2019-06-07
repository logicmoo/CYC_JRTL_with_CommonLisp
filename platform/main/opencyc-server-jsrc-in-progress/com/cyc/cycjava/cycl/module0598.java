package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0598 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0598";
    public static final String myFingerPrint = "eb3602fd68e2e5add82ea9423822791c32ccf3d26f30b85f12446ae53164ba0f";
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLObject $ic2$;
    private static final SubLObject $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    
    public static SubLObject f36650(final SubLObject var1) {
        return f36651(var1, Symbols.symbol_function((SubLObject)$ic0$));
    }
    
    public static SubLObject f36651(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = Symbols.symbol_function((SubLObject)$ic1$);
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        var3.resetMultipleValues();
        final SubLObject var4 = module0282.f18746(var1, module0147.$g2095$.getDynamicValue(var3));
        final SubLObject var5 = var3.secondMultipleValue();
        var3.resetMultipleValues();
        SubLObject var6 = (SubLObject)NIL;
        final SubLObject var7 = var4;
        if (!var7.eql($ic2$)) {
            if (!var7.eql($ic3$)) {
                if (NIL == var6) {
                    SubLObject var8;
                    SubLObject var9;
                    for (var8 = var4, var9 = (SubLObject)NIL, var9 = var8.first(); NIL == var6 && NIL != var8; var6 = (SubLObject)makeBoolean(NIL == f36652(var9, var2)), var8 = var8.rest(), var9 = var8.first()) {}
                }
            }
        }
        return (SubLObject)makeBoolean(NIL == var6);
    }
    
    public static SubLObject f36652(final SubLObject var9, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = Symbols.symbol_function((SubLObject)$ic1$);
        }
        final SubLThread var10 = SubLProcess.currentSubLThread();
        SubLObject var11 = (SubLObject)NIL;
        if (NIL == module0202.f12691(var9, var2) && NIL == f36653(var9, var2)) {
            var11 = (SubLObject)T;
        }
        if (NIL != var11 && NIL != module0152.$g2101$.getDynamicValue(var10) && NIL != module0271.$g2561$.getDynamicValue(var10)) {
            f36654(var9, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)makeBoolean(NIL == var11);
    }
    
    public static SubLObject f36655(final SubLObject var4, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = Symbols.symbol_function((SubLObject)$ic1$);
        }
        SubLObject var5 = var4;
        SubLObject var6 = (SubLObject)NIL;
        var6 = var5.first();
        while (NIL != var5) {
            f36654(var6, var2);
            var5 = var5.rest();
            var6 = var5.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36654(final SubLObject var9, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = Symbols.symbol_function((SubLObject)$ic1$);
        }
        final SubLObject var10 = f36656(var9, var2);
        if (NIL != var10) {
            module0274.f18215((SubLObject)ConsesLow.list((SubLObject)$ic4$, module0232.f15328(var9, (SubLObject)UNPROVIDED), var10));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36657(final SubLObject var9, SubLObject var12, SubLObject var13) {
        if (var12 == UNPROVIDED) {
            var12 = Symbols.symbol_function((SubLObject)$ic0$);
        }
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36653(final SubLObject var9, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        SubLObject var15 = (SubLObject)NIL;
        final SubLObject var16 = module0204.f13071(var9);
        SubLObject var17 = (SubLObject)NIL;
        SubLObject var18 = (SubLObject)NIL;
        SubLObject var19 = (SubLObject)NIL;
        var17 = f36658(var16, var14);
        for (var18 = (var19 = (SubLObject)ConsesLow.list(var17.first())); NIL == var15 && NIL != var18; var18 = f36659(var19, var16, var14, Symbols.symbol_function((SubLObject)EQUAL)), var19 = conses_high.union(var19, var18, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
            var17 = conses_high.set_difference(var17, var19, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        }
        var15 = Types.sublisp_null(var17);
        return var15;
    }
    
    public static SubLObject f36658(final SubLObject var16, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        if (NIL != var14) {
            return module0035.remove_if_not(var14, module0035.f2078((SubLObject)$ic5$, var16, Symbols.symbol_function((SubLObject)EQUAL)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return module0035.f2078((SubLObject)$ic5$, var16, Symbols.symbol_function((SubLObject)EQUAL));
    }
    
    public static SubLObject f36659(final SubLObject var20, final SubLObject var21, SubLObject var22, SubLObject var23) {
        if (var22 == UNPROVIDED) {
            var22 = Symbols.symbol_function((SubLObject)$ic6$);
        }
        if (var23 == UNPROVIDED) {
            var23 = Symbols.symbol_function((SubLObject)EQL);
        }
        SubLObject var24 = (SubLObject)NIL;
        SubLObject var25 = var21;
        SubLObject var26 = (SubLObject)NIL;
        var26 = var25.first();
        while (NIL != var25) {
            if (NIL != f36660(var20, var26, var23)) {
                var24 = conses_high.union(var24, module0035.f2257(var26, var22, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            var25 = var25.rest();
            var26 = var25.first();
        }
        return conses_high.set_difference(var24, var20, var23, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f36660(final SubLObject var20, final SubLObject var25, SubLObject var23) {
        if (var23 == UNPROVIDED) {
            var23 = Symbols.symbol_function((SubLObject)EQL);
        }
        SubLObject var26 = (SubLObject)NIL;
        if (NIL == var26) {
            SubLObject var27;
            SubLObject var28;
            for (var27 = var20, var28 = (SubLObject)NIL, var28 = var27.first(); NIL == var26 && NIL != var27; var26 = module0035.f2427(var28, var25, var23, (SubLObject)UNPROVIDED), var27 = var27.rest(), var28 = var27.first()) {}
        }
        return var26;
    }
    
    public static SubLObject f36661(final SubLObject var20, final SubLObject var21, SubLObject var22, SubLObject var23) {
        if (var22 == UNPROVIDED) {
            var22 = Symbols.symbol_function((SubLObject)$ic6$);
        }
        if (var23 == UNPROVIDED) {
            var23 = Symbols.symbol_function((SubLObject)EQL);
        }
        SubLObject var24 = (SubLObject)NIL;
        SubLObject var25 = var21;
        SubLObject var26 = (SubLObject)NIL;
        var26 = var25.first();
        while (NIL != var25) {
            final SubLObject var27 = Functions.funcall(var22, var26);
            if (NIL != module0035.f2180(var20, var27, var23, (SubLObject)UNPROVIDED)) {
                var24 = conses_high.union(var24, var27, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            var25 = var25.rest();
            var26 = var25.first();
        }
        return conses_high.set_difference(var24, var20, var23, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f36656(final SubLObject var9, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16;
        SubLObject var17;
        SubLObject var18;
        SubLObject var19;
        for (var16 = module0204.f13071(var9), var17 = (SubLObject)NIL, var18 = (SubLObject)NIL, var19 = (SubLObject)NIL, var17 = f36658(var16, var14), var18 = (var19 = (SubLObject)ConsesLow.list(var17.first())); NIL != var17 && NIL != var18; var17 = conses_high.set_difference(var17, var19, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED), var18 = f36659(var19, var16, var14, Symbols.symbol_function((SubLObject)EQUAL)), var19 = conses_high.union(var19, var18, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {}
        var15 = var17;
        return var15;
    }
    
    public static SubLObject f36662(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        var2.resetMultipleValues();
        final SubLObject var3 = module0282.f18746(var1, module0147.$g2095$.getDynamicValue(var2));
        final SubLObject var4 = var2.secondMultipleValue();
        var2.resetMultipleValues();
        SubLObject var5 = (SubLObject)NIL;
        final SubLObject var6 = var3;
        if (!var6.eql($ic2$)) {
            if (!var6.eql($ic3$)) {
                if (NIL == var5) {
                    SubLObject var7;
                    SubLObject var8;
                    for (var7 = var3, var8 = (SubLObject)NIL, var8 = var7.first(); NIL == var5 && NIL != var7; var5 = f36663(var8), var7 = var7.rest(), var8 = var7.first()) {}
                }
            }
        }
        return (SubLObject)makeBoolean(NIL == var5);
    }
    
    public static SubLObject f36664(final SubLObject var9) {
        return (SubLObject)makeBoolean(NIL == f36663(var9));
    }
    
    public static SubLObject f36663(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        final SubLObject var11 = f36665(var9);
        if (NIL != var11 && NIL != module0152.$g2101$.getDynamicValue(var10) && NIL != module0271.$g2561$.getDynamicValue(var10)) {
            f36666(var9);
        }
        return var11;
    }
    
    public static SubLObject f36667(final SubLObject var4) {
        SubLObject var5 = var4;
        SubLObject var6 = (SubLObject)NIL;
        var6 = var5.first();
        while (NIL != var5) {
            f36666(var6);
            var5 = var5.rest();
            var6 = var5.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36666(final SubLObject var9) {
        final SubLObject var10 = f36668(var9);
        if (NIL != var10) {
            module0274.f18215((SubLObject)ConsesLow.list((SubLObject)$ic7$, module0232.f15328(var9, (SubLObject)UNPROVIDED), var10));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36665(final SubLObject var9) {
        return module0035.f2180(module0232.f15308(var9), module0232.f15306(var9), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f36668(final SubLObject var9) {
        return conses_high.intersection(module0232.f15308(var9), module0232.f15306(var9), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f36669() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0598", "f36650", "S#40463", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0598", "f36651", "S#20658", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0598", "f36652", "S#20660", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0598", "f36655", "S#40464", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0598", "f36654", "S#40465", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0598", "f36657", "S#40466", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0598", "f36653", "S#40467", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0598", "f36658", "S#40468", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0598", "f36659", "S#40469", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0598", "f36660", "S#40470", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0598", "f36661", "S#40471", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0598", "f36656", "S#40472", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0598", "f36662", "S#20659", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0598", "f36664", "S#20661", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0598", "f36663", "S#40473", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0598", "f36667", "S#40474", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0598", "f36666", "S#40475", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0598", "f36665", "S#40476", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0598", "f36668", "S#40477", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36670() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36671() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f36669();
    }
    
    public void initializeVariables() {
        f36670();
    }
    
    public void runTopLevelForms() {
        f36671();
    }
    
    static {
        me = (SubLFile)new module0598();
        $ic0$ = makeSymbol("VARIABLE-P");
        $ic1$ = makeSymbol("EL-VAR?");
        $ic2$ = constant_handles_oc.f8479((SubLObject)makeString("True"));
        $ic3$ = constant_handles_oc.f8479((SubLObject)makeString("False"));
        $ic4$ = makeKeyword("ISOLATED-TERMS");
        $ic5$ = makeSymbol("S#16098", "CYC");
        $ic6$ = makeSymbol("CDR");
        $ic7$ = makeKeyword("IRRELEVANT-LITERALS");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 103 ms
	
	Decompiled with Procyon 0.5.32.
*/