package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0264 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0264";
    public static final String myFingerPrint = "89d0662fa109b38b953416e6c48026a3456c7f66028f42604da3b1265d2563aa";
    private static SubLSymbol $g2516$;
    private static SubLSymbol $g2517$;
    private static SubLSymbol $g2518$;
    private static SubLSymbol $g2519$;
    private static SubLSymbol $g2520$;
    private static SubLSymbol $g2521$;
    private static SubLSymbol $g2522$;
    private static SubLSymbol $g2523$;
    private static SubLSymbol $g2524$;
    private static final SubLInteger $ic0$;
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
    
    public static SubLObject f17432(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = module0147.$g2095$.getDynamicValue();
        }
        return (NIL != module0173.f10955(var1) && NIL != module0173.f10955(var2)) ? f17433(var1, var2, var3) : f17434(var1, var2, var3);
    }
    
    public static SubLObject f17435(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = module0147.$g2095$.getDynamicValue();
        }
        return (NIL != module0173.f10955(var1) && NIL != module0173.f10955(var2)) ? f17436(var1, var2, var3) : f17437(var1, var2, var3);
    }
    
    public static SubLObject f17438(final SubLObject var2, final SubLObject var1, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = module0147.$g2095$.getDynamicValue();
        }
        return (NIL != module0173.f10955(var2) && NIL != module0173.f10955(var1)) ? f17439(var2, var1, var3) : f17440(var2, var1, var3);
    }
    
    public static SubLObject f17441(final SubLObject var2, final SubLObject var1, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = module0147.$g2095$.getDynamicValue();
        }
        return (NIL != module0173.f10955(var1) && NIL != module0173.f10955(var2)) ? f17442(var2, var1, var3) : f17443(var2, var1, var3);
    }
    
    public static SubLObject f17444() {
        f17445();
        f17446();
        f17447();
        f17448();
        f17449();
        f17450();
        f17451();
        f17452();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17453(final SubLObject var4, final SubLObject var5, final SubLObject var6, final SubLObject var3, final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        final SubLObject var9 = (SubLObject)ConsesLow.list(var5, var3);
        var8.resetMultipleValues();
        SubLObject var10 = module0089.f6077(var4, var9);
        final SubLObject var11 = var8.secondMultipleValue();
        var8.resetMultipleValues();
        if (NIL == var11) {
            var10 = f17454(var7, var5, var3);
            module0089.f6082(var4, var9, var10);
        }
        return module0032.f1731(var6, var10, Symbols.symbol_function((SubLObject)EQL));
    }
    
    public static SubLObject f17454(final SubLObject var7, final SubLObject var12, final SubLObject var3) {
        if (var7.eql((SubLObject)$ic9$)) {
            return module0078.f5368(module0260.f17033(var12, var3, (SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
        }
        if (var7.eql((SubLObject)$ic10$)) {
            return module0078.f5368(module0260.f17035(var12, var3, (SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
        }
        if (var7.eql((SubLObject)$ic11$)) {
            return module0078.f5368(module0260.f17028(var12, var3, (SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
        }
        if (var7.eql((SubLObject)$ic12$)) {
            return module0078.f5368(module0260.f17030(var12, var3, (SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
        }
        return module0078.f5368(Functions.funcall(var7, var12, var3), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17455(final SubLObject var4, final SubLObject var5, final SubLObject var6, final SubLObject var3, final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        final SubLObject var9 = (SubLObject)ConsesLow.list(var5, var6, var3);
        var8.resetMultipleValues();
        SubLObject var10 = module0089.f6077(var4, var9);
        final SubLObject var11 = var8.secondMultipleValue();
        var8.resetMultipleValues();
        if (NIL == var11) {
            var10 = f17456(var7, var5, var6, var3);
            module0089.f6082(var4, var9, var10);
        }
        return var10;
    }
    
    public static SubLObject f17456(final SubLObject var7, final SubLObject var5, final SubLObject var6, final SubLObject var3) {
        if (var7.eql((SubLObject)$ic13$)) {
            return module0260.f17093(var5, var6, var3, (SubLObject)UNPROVIDED);
        }
        if (var7.eql((SubLObject)$ic14$)) {
            return module0260.f17095(var5, var6, var3, (SubLObject)UNPROVIDED);
        }
        if (var7.eql((SubLObject)$ic15$)) {
            return module0260.f17089(var5, var6, var3, (SubLObject)UNPROVIDED);
        }
        if (var7.eql((SubLObject)$ic16$)) {
            return module0260.f17094(var5, var6, var3, (SubLObject)UNPROVIDED);
        }
        return Functions.funcall(var7, var5, var6, var3);
    }
    
    public static SubLObject f17433(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        return f17453($g2517$.getGlobalValue(), var1, var2, var3, (SubLObject)$ic9$);
    }
    
    public static SubLObject f17434(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        return f17455($g2521$.getGlobalValue(), var1, var2, var3, (SubLObject)$ic13$);
    }
    
    public static SubLObject f17445() {
        return module0089.f6092($g2517$.getGlobalValue());
    }
    
    public static SubLObject f17446() {
        return module0089.f6092($g2521$.getGlobalValue());
    }
    
    public static SubLObject f17436(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        return f17453($g2518$.getGlobalValue(), var1, var2, var3, (SubLObject)$ic10$);
    }
    
    public static SubLObject f17437(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        return f17455($g2522$.getGlobalValue(), var1, var2, var3, (SubLObject)$ic14$);
    }
    
    public static SubLObject f17447() {
        return module0089.f6092($g2518$.getGlobalValue());
    }
    
    public static SubLObject f17448() {
        return module0089.f6092($g2522$.getGlobalValue());
    }
    
    public static SubLObject f17439(final SubLObject var2, final SubLObject var1, final SubLObject var3) {
        return f17453($g2519$.getGlobalValue(), var2, var1, var3, (SubLObject)$ic11$);
    }
    
    public static SubLObject f17440(final SubLObject var2, final SubLObject var1, final SubLObject var3) {
        return f17455($g2523$.getGlobalValue(), var2, var1, var3, (SubLObject)$ic15$);
    }
    
    public static SubLObject f17449() {
        return module0089.f6092($g2519$.getGlobalValue());
    }
    
    public static SubLObject f17450() {
        return module0089.f6092($g2523$.getGlobalValue());
    }
    
    public static SubLObject f17442(final SubLObject var2, final SubLObject var1, final SubLObject var3) {
        return f17453($g2520$.getGlobalValue(), var2, var1, var3, (SubLObject)$ic12$);
    }
    
    public static SubLObject f17443(final SubLObject var2, final SubLObject var1, final SubLObject var3) {
        return f17455($g2524$.getGlobalValue(), var2, var1, var3, (SubLObject)$ic16$);
    }
    
    public static SubLObject f17451() {
        return module0089.f6092($g2518$.getGlobalValue());
    }
    
    public static SubLObject f17452() {
        return module0089.f6092($g2522$.getGlobalValue());
    }
    
    public static SubLObject f17457() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0264", "f17432", "S#12334", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0264", "f17435", "S#12335", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0264", "f17438", "S#12338", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0264", "f17441", "S#12339", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0264", "f17444", "S#19966", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0264", "f17453", "S#19967", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0264", "f17454", "S#19968", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0264", "f17455", "S#19969", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0264", "f17456", "S#19970", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0264", "f17433", "S#19971", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0264", "f17434", "S#19972", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0264", "f17445", "S#19973", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0264", "f17446", "S#19974", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0264", "f17436", "S#19975", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0264", "f17437", "S#19976", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0264", "f17447", "S#19977", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0264", "f17448", "S#19978", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0264", "f17439", "S#19979", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0264", "f17440", "S#19980", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0264", "f17449", "S#19981", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0264", "f17450", "S#19982", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0264", "f17442", "S#19983", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0264", "f17443", "S#19984", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0264", "f17451", "S#19985", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0264", "f17452", "S#19986", 0, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17458() {
        $g2516$ = SubLFiles.deflexical("S#19987", (SubLObject)$ic0$);
        $g2517$ = SubLFiles.deflexical("S#19988", (NIL != Symbols.boundp((SubLObject)$ic1$)) ? $g2517$.getGlobalValue() : module0089.f6070($g2516$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQUAL)));
        $g2518$ = SubLFiles.deflexical("S#19989", (NIL != Symbols.boundp((SubLObject)$ic2$)) ? $g2518$.getGlobalValue() : module0089.f6070($g2516$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQUAL)));
        $g2519$ = SubLFiles.deflexical("S#19990", (NIL != Symbols.boundp((SubLObject)$ic3$)) ? $g2519$.getGlobalValue() : module0089.f6070($g2516$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQUAL)));
        $g2520$ = SubLFiles.deflexical("S#19991", (NIL != Symbols.boundp((SubLObject)$ic4$)) ? $g2520$.getGlobalValue() : module0089.f6070($g2516$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQUAL)));
        $g2521$ = SubLFiles.deflexical("S#19992", (NIL != Symbols.boundp((SubLObject)$ic5$)) ? $g2521$.getGlobalValue() : module0089.f6070($g2516$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQUAL)));
        $g2522$ = SubLFiles.deflexical("S#19993", (NIL != Symbols.boundp((SubLObject)$ic6$)) ? $g2522$.getGlobalValue() : module0089.f6070($g2516$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQUAL)));
        $g2523$ = SubLFiles.deflexical("S#19994", (NIL != Symbols.boundp((SubLObject)$ic7$)) ? $g2523$.getGlobalValue() : module0089.f6070($g2516$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQUAL)));
        $g2524$ = SubLFiles.deflexical("S#19995", (NIL != Symbols.boundp((SubLObject)$ic8$)) ? $g2524$.getGlobalValue() : module0089.f6070($g2516$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQUAL)));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17459() {
        module0003.f57((SubLObject)$ic1$);
        module0003.f57((SubLObject)$ic2$);
        module0003.f57((SubLObject)$ic3$);
        module0003.f57((SubLObject)$ic4$);
        module0003.f57((SubLObject)$ic5$);
        module0003.f57((SubLObject)$ic6$);
        module0003.f57((SubLObject)$ic7$);
        module0003.f57((SubLObject)$ic8$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f17457();
    }
    
    public void initializeVariables() {
        f17458();
    }
    
    public void runTopLevelForms() {
        f17459();
    }
    
    static {
        me = (SubLFile)new module0264();
        $g2516$ = null;
        $g2517$ = null;
        $g2518$ = null;
        $g2519$ = null;
        $g2520$ = null;
        $g2521$ = null;
        $g2522$ = null;
        $g2523$ = null;
        $g2524$ = null;
        $ic0$ = makeInteger(128);
        $ic1$ = makeSymbol("S#19988", "CYC");
        $ic2$ = makeSymbol("S#19989", "CYC");
        $ic3$ = makeSymbol("S#19990", "CYC");
        $ic4$ = makeSymbol("S#19991", "CYC");
        $ic5$ = makeSymbol("S#19992", "CYC");
        $ic6$ = makeSymbol("S#19993", "CYC");
        $ic7$ = makeSymbol("S#19994", "CYC");
        $ic8$ = makeSymbol("S#19995", "CYC");
        $ic9$ = makeSymbol("ALL-SPEC-PREDICATES");
        $ic10$ = makeSymbol("ALL-SPEC-INVERSES");
        $ic11$ = makeSymbol("ALL-GENL-PREDICATES");
        $ic12$ = makeSymbol("ALL-GENL-INVERSES");
        $ic13$ = makeSymbol("SPEC-PREDICATE?");
        $ic14$ = makeSymbol("SPEC-INVERSE?");
        $ic15$ = makeSymbol("GENL-PREDICATE?");
        $ic16$ = makeSymbol("GENL-INVERSE?");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 74 ms
	
	Decompiled with Procyon 0.5.32.
*/