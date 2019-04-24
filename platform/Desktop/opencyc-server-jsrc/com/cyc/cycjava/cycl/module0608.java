package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0608 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0608";
    public static final String myFingerPrint = "49b73e9ede9936c2130bfb0ec94ed6d7d67789dcac93f6a9f53af879b6e50cf2";
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    
    public static SubLObject f37151(final SubLObject var1) {
        return f37152(var1);
    }
    
    public static SubLObject f37152(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var1.isNumber() || module0608.NIL != module0606.f37086(var1));
    }
    
    public static SubLObject f37153(final SubLObject var2) {
        assert module0608.NIL != f37152(var2) : var2;
        if (module0608.NIL != module0606.f37086(var2)) {
            return module0606.f37092(var2);
        }
        return Numbers.zerop(var2);
    }
    
    public static SubLObject f37154(final SubLObject var2) {
        assert module0608.NIL != f37152(var2) : var2;
        if (module0608.NIL != module0606.f37086(var2)) {
            return module0606.f37093(var2);
        }
        return Numbers.minusp(var2);
    }
    
    public static SubLObject f37155(final SubLObject var2) {
        assert module0608.NIL != f37152(var2) : var2;
        if (module0608.NIL != module0606.f37086(var2)) {
            return module0606.f37094(var2);
        }
        return Numbers.plusp(var2);
    }
    
    public static SubLObject f37156(final SubLObject var2) {
        assert module0608.NIL != f37152(var2) : var2;
        if (module0608.NIL != module0606.f37086(var2)) {
            return module0606.f37095(var2);
        }
        return module0048.f3294(var2);
    }
    
    public static SubLObject f37157(final SubLObject var2) {
        assert module0608.NIL != f37152(var2) : var2;
        if (module0608.NIL != module0606.f37086(var2)) {
            return module0607.f37109(var2);
        }
        return Numbers.abs(var2);
    }
    
    public static SubLObject f37158(final SubLObject var2) {
        assert module0608.NIL != f37152(var2) : var2;
        if (module0608.NIL != module0606.f37086(var2)) {
            return module0607.f37110(var2);
        }
        return Numbers.minus(var2);
    }
    
    public static SubLObject f37159(final SubLObject var2) {
        assert module0608.NIL != f37152(var2) : var2;
        if (module0608.NIL != module0606.f37086(var2)) {
            return module0606.f37091(var2);
        }
        return var2;
    }
    
    public static SubLObject f37160(final SubLObject var3, final SubLObject var4, SubLObject var5) {
        if (var5 == module0608.UNPROVIDED) {
            var5 = (SubLObject)module0608.NIL;
        }
        assert module0608.NIL != f37152(var3) : var3;
        assert module0608.NIL != f37152(var4) : var4;
        if (module0608.NIL != module0606.f37086(var3)) {
            if (module0608.NIL != module0606.f37086(var4)) {
                return module0607.f37114(var3, var4, var5);
            }
            if (var4.isInteger()) {
                return module0607.f37115(var3, var4, var5);
            }
            return module0607.f37114(var3, module0606.f37104(var4, (SubLObject)module0608.UNPROVIDED), var5);
        }
        else if (module0608.NIL != module0606.f37086(var4)) {
            if (var3.isInteger()) {
                return module0607.f37116(var3, var4, var5);
            }
            return module0607.f37114(module0606.f37104(var3, (SubLObject)module0608.UNPROVIDED), var4, (SubLObject)module0608.UNPROVIDED);
        }
        else {
            if (module0608.NIL != var5) {
                return Numbers.numE(module0048.f3302(var3, var5), module0048.f3302(var4, var5));
            }
            return Numbers.numE(var3, var4);
        }
    }
    
    public static SubLObject f37161(final SubLObject var3, final SubLObject var4, SubLObject var5) {
        if (var5 == module0608.UNPROVIDED) {
            var5 = (SubLObject)module0608.NIL;
        }
        assert module0608.NIL != f37152(var3) : var3;
        assert module0608.NIL != f37152(var4) : var4;
        if (module0608.NIL != module0606.f37086(var3)) {
            if (module0608.NIL != module0606.f37086(var4)) {
                return module0607.f37117(var3, var4, var5);
            }
            if (var4.isInteger()) {
                return module0607.f37118(var3, var4, var5);
            }
            return module0607.f37117(var3, module0606.f37104(var4, (SubLObject)module0608.UNPROVIDED), var5);
        }
        else if (module0608.NIL != module0606.f37086(var4)) {
            if (var3.isInteger()) {
                return module0607.f37119(var3, var4, (SubLObject)module0608.UNPROVIDED);
            }
            return module0607.f37117(module0606.f37104(var3, (SubLObject)module0608.UNPROVIDED), var4, var5);
        }
        else {
            if (module0608.NIL != var5) {
                return Numbers.numG(module0048.f3302(var3, var5), module0048.f3302(var4, var5));
            }
            return Numbers.numG(var3, var4);
        }
    }
    
    public static SubLObject f37162(final SubLObject var3, final SubLObject var4, SubLObject var5) {
        if (var5 == module0608.UNPROVIDED) {
            var5 = (SubLObject)module0608.NIL;
        }
        assert module0608.NIL != f37152(var3) : var3;
        assert module0608.NIL != f37152(var4) : var4;
        if (module0608.NIL != module0606.f37086(var3)) {
            if (module0608.NIL != module0606.f37086(var4)) {
                return module0607.f37120(var3, var4, var5);
            }
            if (var4.isInteger()) {
                return module0607.f37121(var3, var4, var5);
            }
            return module0607.f37120(var3, module0606.f37104(var4, (SubLObject)module0608.UNPROVIDED), var5);
        }
        else if (module0608.NIL != module0606.f37086(var4)) {
            if (var3.isInteger()) {
                return module0607.f37122(var3, var4, var5);
            }
            return module0607.f37120(module0606.f37104(var3, (SubLObject)module0608.UNPROVIDED), var4, var5);
        }
        else {
            if (module0608.NIL != var5) {
                return Numbers.numGE(module0048.f3302(var3, var5), module0048.f3302(var4, var5));
            }
            return Numbers.numGE(var3, var4);
        }
    }
    
    public static SubLObject f37163(final SubLObject var3, final SubLObject var4, SubLObject var5) {
        if (var5 == module0608.UNPROVIDED) {
            var5 = (SubLObject)module0608.NIL;
        }
        return f37161(var4, var3, var5);
    }
    
    public static SubLObject f37164(final SubLObject var3, final SubLObject var4, SubLObject var5) {
        if (var5 == module0608.UNPROVIDED) {
            var5 = (SubLObject)module0608.NIL;
        }
        return f37162(var4, var3, var5);
    }
    
    public static SubLObject f37165(final SubLObject var3, final SubLObject var4) {
        assert module0608.NIL != f37152(var3) : var3;
        assert module0608.NIL != f37152(var4) : var4;
        if (module0608.NIL != module0606.f37086(var3)) {
            if (module0608.NIL != module0606.f37086(var4)) {
                return module0607.f37129(var3, var4);
            }
            if (var4.isInteger()) {
                return module0607.f37130(var3, var4);
            }
            return module0607.f37129(var3, module0606.f37104(var4, (SubLObject)module0608.UNPROVIDED));
        }
        else {
            if (module0608.NIL == module0606.f37086(var4)) {
                return Numbers.multiply(var3, var4);
            }
            if (var3.isInteger()) {
                return module0607.f37131(var3, var4);
            }
            return module0607.f37129(module0606.f37104(var3, (SubLObject)module0608.UNPROVIDED), var4);
        }
    }
    
    public static SubLObject f37166(final SubLObject var3, final SubLObject var4) {
        assert module0608.NIL != f37152(var3) : var3;
        assert module0608.NIL != f37152(var4) : var4;
        if (module0608.NIL != module0606.f37086(var3)) {
            if (module0608.NIL != module0606.f37086(var4)) {
                return module0607.f37133(var3, var4);
            }
            if (var4.isInteger()) {
                return module0607.f37134(var3, var4);
            }
            return module0607.f37133(var3, module0606.f37104(var4, (SubLObject)module0608.UNPROVIDED));
        }
        else {
            if (module0608.NIL == module0606.f37086(var4)) {
                return Numbers.divide(var3, var4);
            }
            if (var3.isInteger()) {
                return module0607.f37135(var3, var4);
            }
            return module0607.f37133(module0606.f37104(var3, (SubLObject)module0608.UNPROVIDED), var4);
        }
    }
    
    public static SubLObject f37167(final SubLObject var3, final SubLObject var4) {
        assert module0608.NIL != f37152(var3) : var3;
        assert module0608.NIL != f37152(var4) : var4;
        if (module0608.NIL != module0606.f37086(var3)) {
            if (module0608.NIL != module0606.f37086(var4)) {
                return module0607.f37136(var3, var4);
            }
            return module0607.f37136(var3, module0606.f37104(var4, (SubLObject)module0608.UNPROVIDED));
        }
        else {
            if (module0608.NIL != module0606.f37086(var4)) {
                return module0607.f37136(module0606.f37104(var3, (SubLObject)module0608.UNPROVIDED), var4);
            }
            return Numbers.add(var3, var4);
        }
    }
    
    public static SubLObject f37168(final SubLObject var3, final SubLObject var4) {
        assert module0608.NIL != f37152(var3) : var3;
        assert module0608.NIL != f37152(var4) : var4;
        if (module0608.NIL != module0606.f37086(var3)) {
            if (module0608.NIL != module0606.f37086(var4)) {
                return module0607.f37139(var3, var4);
            }
            return module0607.f37139(var3, module0606.f37104(var4, (SubLObject)module0608.UNPROVIDED));
        }
        else {
            if (module0608.NIL != module0606.f37086(var4)) {
                return module0607.f37139(module0606.f37104(var3, (SubLObject)module0608.UNPROVIDED), var4);
            }
            return Numbers.subtract(var3, var4);
        }
    }
    
    public static SubLObject f37169(final SubLObject var6) {
        assert module0608.NIL != module0035.f2015(var6) : var6;
        SubLObject var7 = var6;
        SubLObject var8 = (SubLObject)module0608.NIL;
        var8 = var7.first();
        while (module0608.NIL != var7) {
            assert module0608.NIL != f37152(var8) : var8;
            var7 = var7.rest();
            var8 = var7.first();
        }
        SubLObject var9 = var6.first();
        var7 = var6.rest();
        SubLObject var10 = (SubLObject)module0608.NIL;
        var10 = var7.first();
        while (module0608.NIL != var7) {
            if (module0608.NIL != f37163(var10, var9, (SubLObject)module0608.UNPROVIDED)) {
                var9 = f37159(var10);
            }
            var7 = var7.rest();
            var10 = var7.first();
        }
        return var9;
    }
    
    public static SubLObject f37170(final SubLObject var6) {
        assert module0608.NIL != module0035.f2015(var6) : var6;
        SubLObject var7 = var6;
        SubLObject var8 = (SubLObject)module0608.NIL;
        var8 = var7.first();
        while (module0608.NIL != var7) {
            assert module0608.NIL != f37152(var8) : var8;
            var7 = var7.rest();
            var8 = var7.first();
        }
        SubLObject var9 = var6.first();
        var7 = var6.rest();
        SubLObject var10 = (SubLObject)module0608.NIL;
        var10 = var7.first();
        while (module0608.NIL != var7) {
            if (module0608.NIL != f37161(var10, var9, (SubLObject)module0608.UNPROVIDED)) {
                var9 = f37159(var10);
            }
            var7 = var7.rest();
            var10 = var7.first();
        }
        return var9;
    }
    
    public static SubLObject f37171(final SubLObject var2) {
        assert module0608.NIL != f37152(var2) : var2;
        if (module0608.NIL != module0606.f37086(var2)) {
            return module0607.f37145(var2);
        }
        return Numbers.sqrt(var2);
    }
    
    public static SubLObject f37172(final SubLObject var2, SubLObject var11) {
        if (var11 == module0608.UNPROVIDED) {
            var11 = Numbers.$exp1$.getGlobalValue();
        }
        assert module0608.NIL != f37152(var2) : var2;
        assert module0608.NIL != f37152(var11) : var11;
        if (module0608.NIL != module0606.f37086(var2)) {
            return module0607.f37140(var2, var11);
        }
        return Numbers.log(var2, var11);
    }
    
    public static SubLObject f37173(final SubLObject var11, final SubLObject var2) {
        assert module0608.NIL != Types.numberp(var11) : var11;
        assert module0608.NIL != f37152(var2) : var2;
        if (module0608.NIL != module0606.f37086(var2)) {
            return module0607.f37143(var11, var2);
        }
        return Numbers.expt(var11, var2);
    }
    
    public static SubLObject f37174(final SubLObject var2) {
        assert module0608.NIL != f37152(var2) : var2;
        if (module0608.NIL != module0606.f37086(var2)) {
            return module0607.f37147(var2);
        }
        return Numbers.exp(var2);
    }
    
    public static SubLObject f37175() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0608", "f37151", "CYC-EXTENDED-NUMBER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0608", "f37152", "S#4668", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0608", "f37153", "S#40958", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0608", "f37154", "S#40959", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0608", "f37155", "S#40960", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0608", "f37156", "S#40961", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0608", "f37157", "S#40962", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0608", "f37158", "S#40963", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0608", "f37159", "S#40964", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0608", "f37160", "S#40965", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0608", "f37161", "S#40966", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0608", "f37162", "S#40967", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0608", "f37163", "S#40968", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0608", "f37164", "S#40969", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0608", "f37165", "S#40970", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0608", "f37166", "S#40971", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0608", "f37167", "S#40972", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0608", "f37168", "S#40973", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0608", "f37169", "S#40974", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0608", "f37170", "S#40975", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0608", "f37171", "S#40976", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0608", "f37172", "S#40977", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0608", "f37173", "S#40978", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0608", "f37174", "S#40979", 1, 0, false);
        return (SubLObject)module0608.NIL;
    }
    
    public static SubLObject f37176() {
        return (SubLObject)module0608.NIL;
    }
    
    public static SubLObject f37177() {
        module0012.f416((SubLObject)module0608.$ic0$);
        return (SubLObject)module0608.NIL;
    }
    
    public void declareFunctions() {
        f37175();
    }
    
    public void initializeVariables() {
        f37176();
    }
    
    public void runTopLevelForms() {
        f37177();
    }
    
    static {
        me = (SubLFile)new module0608();
        $ic0$ = SubLObjectFactory.makeSymbol("CYC-EXTENDED-NUMBER-P");
        $ic1$ = SubLObjectFactory.makeSymbol("S#4668", "CYC");
        $ic2$ = SubLObjectFactory.makeSymbol("S#747", "CYC");
        $ic3$ = SubLObjectFactory.makeSymbol("NUMBERP");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0608.class
	Total time: 95 ms
	
	Decompiled with Procyon 0.5.32.
*/