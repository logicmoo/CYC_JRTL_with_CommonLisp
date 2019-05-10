package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0263 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0263";
    public static final String myFingerPrint = "58a1c8dd59f16a3f6a46f274e218d29563bab55951059b2f081a01d6f1559e23";
    private static SubLSymbol $g2512$;
    private static SubLSymbol $g2513$;
    private static SubLSymbol $g2514$;
    private static SubLSymbol $g2515$;
    private static final SubLSymbol $ic0$;
    private static final SubLString $ic1$;
    private static final SubLString $ic2$;
    private static final SubLString $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLInteger $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLInteger $ic8$;
    
    public static SubLObject f17409(SubLObject var1, SubLObject var2) {
        if (NIL != module0161.f10586(var1) && NIL != module0161.f10586(var2)) {
            var1 = f17410(var1);
            var2 = f17410(var2);
        }
        if (NIL != module0161.f10471()) {
            return (NIL != module0173.f10955(var1) && NIL != module0173.f10955(var2)) ? f17411(var1, var2) : f17412(var1, var2);
        }
        return f17411(var1, var2);
    }
    
    public static SubLObject f17413() {
        f17414();
        f17415();
        if (NIL != module0161.f10471()) {
            f17416();
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f17417(final SubLObject var3, final SubLObject var4) {
        return f17413();
    }
    
    public static SubLObject f17410(SubLObject var1) {
        if (NIL == module0173.f10955(var1)) {
            var1 = module0612.f37519(var1);
        }
        return var1;
    }
    
    public static SubLObject f17411(final SubLObject var1, final SubLObject var2) {
        if (var1.equal(var2)) {
            return (SubLObject)T;
        }
        if (NIL != module0173.f10955(var1) && NIL != module0173.f10955(var2)) {
            return f17418(var1, var2);
        }
        return f17419(var1, var2);
    }
    
    public static SubLObject f17412(final SubLObject var1, final SubLObject var2) {
        if (var1.equal(var2)) {
            return (SubLObject)T;
        }
        if (NIL != module0161.f10515(var1) && NIL != module0161.f10515(var2)) {
            return f17411(var1, var2);
        }
        return (SubLObject)makeBoolean(NIL != f17411(module0161.f10557(var1), module0161.f10557(var2)) && NIL != f17420(var1, var2));
    }
    
    public static SubLObject f17420(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)NIL;
        final SubLObject var5 = module0161.f10586(var1);
        final SubLObject var6 = module0161.f10586(var2);
        final SubLObject var7 = module0161.f10557(var1);
        final SubLObject var8 = module0147.f9540(var7);
        final SubLObject var9 = module0147.$g2095$.currentBinding(var3);
        final SubLObject var10 = module0147.$g2094$.currentBinding(var3);
        final SubLObject var11 = module0147.$g2096$.currentBinding(var3);
        try {
            module0147.$g2095$.bind(module0147.f9545(var8), var3);
            module0147.$g2094$.bind(module0147.f9546(var8), var3);
            module0147.$g2096$.bind(module0147.f9549(var8), var3);
            if (NIL == f17421(var5, var6)) {
                var4 = (SubLObject)T;
            }
        }
        finally {
            module0147.$g2096$.rebind(var11, var3);
            module0147.$g2094$.rebind(var10, var3);
            module0147.$g2095$.rebind(var9, var3);
        }
        return (SubLObject)makeBoolean(NIL == var4);
    }
    
    public static SubLObject f17421(final SubLObject var1, final SubLObject var2) {
        if (NIL == var2) {
            return (SubLObject)T;
        }
        if (var1.equal(var2)) {
            return (SubLObject)T;
        }
        return f17422(var1, var2);
    }
    
    public static SubLObject f17423(final SubLObject var14) {
        return Equality.eql(var14, $g2512$.getGlobalValue());
    }
    
    public static SubLObject f17424(final SubLObject var15, final SubLObject var16) {
        if (NIL != module0089.f6045(var15)) {
            return module0089.f6077(var15, var16);
        }
        if (var15.isHashtable()) {
            return Hashtables.gethash(var16, var15, (SubLObject)UNPROVIDED);
        }
        return Errors.error((SubLObject)$ic1$);
    }
    
    public static SubLObject f17425(final SubLObject var15, final SubLObject var16, final SubLObject var17) {
        if (NIL != module0089.f6045(var15)) {
            return module0089.f6082(var15, var16, var17);
        }
        if (var15.isHashtable()) {
            return Hashtables.sethash(var16, var15, var17);
        }
        return Errors.error((SubLObject)$ic1$);
    }
    
    public static SubLObject f17426(final SubLObject var15, final SubLObject var16) {
        if (NIL != module0089.f6045(var15)) {
            return module0089.f6087(var15, var16);
        }
        if (var15.isHashtable()) {
            return Hashtables.remhash(var16, var15);
        }
        return Errors.error((SubLObject)$ic1$);
    }
    
    public static SubLObject f17427(final SubLObject var1, final SubLObject var2, final SubLObject var15, final SubLObject var18) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        var19.resetMultipleValues();
        final SubLObject var20 = f17424(var15, var1);
        final SubLObject var21 = var19.secondMultipleValue();
        var19.resetMultipleValues();
        if (!var20.isVector()) {
            if (NIL != var21) {
                Errors.warn((SubLObject)$ic2$, var1);
                f17426(var15, var1);
            }
            return $g2512$.getGlobalValue();
        }
        final SubLObject var22 = Vectors.aref(var20, (SubLObject)ZERO_INTEGER);
        final SubLObject var23 = Vectors.aref(var20, (SubLObject)ONE_INTEGER);
        if (NIL != module0032.f1731(var2, var22, var18)) {
            return (SubLObject)T;
        }
        if (NIL != module0032.f1731(var2, var23, var18)) {
            return (SubLObject)NIL;
        }
        return $g2512$.getGlobalValue();
    }
    
    public static SubLObject f17428(final SubLObject var1, final SubLObject var2, final SubLObject var22, final SubLObject var15, final SubLObject var18) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        var23.resetMultipleValues();
        SubLObject var24 = f17424(var15, var1);
        final SubLObject var25 = var23.secondMultipleValue();
        var23.resetMultipleValues();
        if (!var24.isVector()) {
            if (NIL != var25) {
                Errors.warn((SubLObject)$ic3$, var1);
            }
            var24 = Vectors.make_vector((SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED);
            f17425(var15, var1, var24);
        }
        if (NIL != var22) {
            Vectors.set_aref(var24, (SubLObject)ZERO_INTEGER, module0032.f1736(var2, Vectors.aref(var24, (SubLObject)ZERO_INTEGER), var18));
        }
        else {
            Vectors.set_aref(var24, (SubLObject)ONE_INTEGER, module0032.f1736(var2, Vectors.aref(var24, (SubLObject)ONE_INTEGER), var18));
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f17418(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        var3.resetMultipleValues();
        SubLObject var4 = module0089.f6077($g2513$.getGlobalValue(), var1);
        final SubLObject var5 = var3.secondMultipleValue();
        var3.resetMultipleValues();
        if (NIL == var5) {
            var4 = module0078.f5368(module0262.f17311(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
            module0089.f6082($g2513$.getGlobalValue(), var1, var4);
        }
        return module0032.f1731(var2, var4, Symbols.symbol_function((SubLObject)EQL));
    }
    
    public static SubLObject f17414() {
        return module0089.f6092($g2513$.getGlobalValue());
    }
    
    public static SubLObject f17419(final SubLObject var1, final SubLObject var2) {
        SubLObject var3 = f17427(var1, var2, $g2514$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQUAL));
        if (NIL != f17423(var3)) {
            var3 = module0262.f17337(var1, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            f17428(var1, var2, var3, $g2514$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQUAL));
        }
        return var3;
    }
    
    public static SubLObject f17415() {
        return module0089.f6092($g2514$.getGlobalValue());
    }
    
    public static SubLObject f17422(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = f17427(var1, var2, $g2515$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQUAL));
        if (NIL != f17423(var4)) {
            SubLObject var5 = (SubLObject)NIL;
            SubLObject var6 = (SubLObject)NIL;
            var3.resetMultipleValues();
            final SubLObject var26_27 = module0161.f10612(var1, module0161.$g2160$.getGlobalValue(), module0161.$g2156$.getGlobalValue());
            final SubLObject var28_29 = var3.secondMultipleValue();
            var3.resetMultipleValues();
            var5 = var26_27;
            var6 = var28_29;
            SubLObject var7 = (SubLObject)NIL;
            SubLObject var8 = (SubLObject)NIL;
            var3.resetMultipleValues();
            final SubLObject var32_33 = module0161.f10612(var2, module0161.$g2160$.getGlobalValue(), module0161.$g2156$.getGlobalValue());
            final SubLObject var34_35 = var3.secondMultipleValue();
            var3.resetMultipleValues();
            var7 = var32_33;
            var8 = var34_35;
            final SubLObject var9 = module0267.f17561(var5, var7, var6, var8);
            f17428(var1, var2, var9, $g2515$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQUAL));
            return var9;
        }
        return var4;
    }
    
    public static SubLObject f17416() {
        return module0089.f6092($g2515$.getGlobalValue());
    }
    
    public static SubLObject f17429() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0263", "f17409", "S#12258", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0263", "f17413", "S#19943", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0263", "f17417", "S#19944", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0263", "f17410", "S#19945", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0263", "f17411", "S#19946", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0263", "f17412", "S#19947", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0263", "f17420", "S#19948", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0263", "f17421", "S#19949", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0263", "f17423", "S#19950", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0263", "f17424", "S#19951", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0263", "f17425", "S#19952", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0263", "f17426", "S#19953", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0263", "f17427", "S#19954", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0263", "f17428", "S#19955", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0263", "f17418", "S#19956", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0263", "f17414", "S#19957", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0263", "f17419", "S#19958", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0263", "f17415", "S#19959", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0263", "f17422", "S#19960", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0263", "f17416", "S#19961", 0, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17430() {
        $g2512$ = SubLFiles.deflexical("S#19962", (SubLObject)$ic0$);
        $g2513$ = SubLFiles.deflexical("S#19963", (NIL != Symbols.boundp((SubLObject)$ic4$)) ? $g2513$.getGlobalValue() : module0089.f6070((SubLObject)$ic5$, Symbols.symbol_function((SubLObject)EQL)));
        $g2514$ = SubLFiles.deflexical("S#19964", (NIL != Symbols.boundp((SubLObject)$ic6$)) ? $g2514$.getGlobalValue() : module0089.f6070((SubLObject)$ic5$, Symbols.symbol_function((SubLObject)EQUAL)));
        $g2515$ = SubLFiles.deflexical("S#19965", (NIL != Symbols.boundp((SubLObject)$ic7$)) ? $g2515$.getGlobalValue() : module0089.f6070((SubLObject)$ic8$, Symbols.symbol_function((SubLObject)EQUAL)));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17431() {
        module0003.f57((SubLObject)$ic4$);
        module0003.f57((SubLObject)$ic6$);
        module0003.f57((SubLObject)$ic7$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f17429();
    }
    
    public void initializeVariables() {
        f17430();
    }
    
    public void runTopLevelForms() {
        f17431();
    }
    
    static {
        me = (SubLFile)new module0263();
        $g2512$ = null;
        $g2513$ = null;
        $g2514$ = null;
        $g2515$ = null;
        $ic0$ = makeKeyword("UNKNOWN");
        $ic1$ = makeString("Unsupported Mt relevance cache type.");
        $ic2$ = makeString("Corrupt entry in Mt relevance cache for ~s.  Removing entry.");
        $ic3$ = makeString("Previous entry for ~s corrupt.  Replacing entry.");
        $ic4$ = makeSymbol("S#19963", "CYC");
        $ic5$ = makeInteger(256);
        $ic6$ = makeSymbol("S#19964", "CYC");
        $ic7$ = makeSymbol("S#19965", "CYC");
        $ic8$ = makeInteger(1024);
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 83 ms
	
	Decompiled with Procyon 0.5.32.
*/