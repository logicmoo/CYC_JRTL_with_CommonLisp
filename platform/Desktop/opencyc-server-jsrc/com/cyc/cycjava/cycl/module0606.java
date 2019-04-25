package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0606 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0606";
    public static final String myFingerPrint = "240ef224409e260cf1931c7a5ad62459da35f21633ab65c285501017e4ced0a0";
    private static final SubLSymbol $ic0$;
    private static final SubLObject $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLString $ic7$;
    private static final SubLString $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLString $ic10$;
    private static final SubLString $ic11$;
    private static final SubLString $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    
    public static SubLObject f37085(final SubLObject var1) {
        return f37086(var1);
    }
    
    public static SubLObject f37086(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0606.NIL != module0202.f12589(var1, module0606.$ic1$) && module0606.NIL != module0202.f12598(var1) && module0205.f13343(var1, (SubLObject)module0606.UNPROVIDED).isInteger() && module0205.f13344(var1, (SubLObject)module0606.UNPROVIDED).isInteger());
    }
    
    public static SubLObject f37087(final SubLObject var2, final SubLObject var3) {
        assert module0606.NIL != Types.integerp(var2) : var2;
        assert module0606.NIL != Types.integerp(var3) : var3;
        return (SubLObject)ConsesLow.list(module0606.$ic1$, var2, var3);
    }
    
    public static SubLObject f37088(final SubLObject var4, SubLObject var5) {
        if (var5 == module0606.UNPROVIDED) {
            var5 = (SubLObject)module0606.NIL;
        }
        assert module0606.NIL != Types.integerp(var4) : var4;
        if (var4.isZero()) {
            return f37087((SubLObject)module0606.ZERO_INTEGER, (SubLObject)module0606.ZERO_INTEGER);
        }
        SubLObject var6 = (SubLObject)module0606.NIL;
        SubLObject var7 = (SubLObject)module0606.NIL;
        if (module0606.NIL != var5) {
            assert module0606.NIL != module0004.f105(var5) : var5;
            final SubLObject var8 = module0048.f3302(var4, var5);
            final SubLObject var9 = module0048.f3301(var8);
            final SubLObject var10 = Numbers.subtract(var5, var9);
            var6 = (var10.numGE((SubLObject)module0606.ZERO_INTEGER) ? Numbers.multiply(var8, Numbers.expt((SubLObject)module0606.TEN_INTEGER, var10)) : Numbers.integerDivide(var8, Numbers.expt((SubLObject)module0606.TEN_INTEGER, Numbers.abs(var10))));
            var7 = Numbers.subtract(var9, (SubLObject)module0606.ONE_INTEGER);
        }
        else {
            var6 = var4;
            var7 = Numbers.subtract(module0048.f3301(var4), (SubLObject)module0606.ONE_INTEGER);
        }
        return f37087(var6, var7);
    }
    
    public static SubLObject f37089(final SubLObject var9) {
        assert module0606.NIL != f37086(var9) : var9;
        return module0205.f13343(var9, (SubLObject)module0606.UNPROVIDED);
    }
    
    public static SubLObject f37090(final SubLObject var9) {
        assert module0606.NIL != f37086(var9) : var9;
        return module0205.f13344(var9, (SubLObject)module0606.UNPROVIDED);
    }
    
    public static SubLObject f37091(final SubLObject var9) {
        assert module0606.NIL != f37086(var9) : var9;
        final SubLObject var10 = f37089(var9);
        final SubLObject var11 = f37090(var9);
        return f37087(var10, var11);
    }
    
    public static SubLObject f37092(final SubLObject var9) {
        assert module0606.NIL != f37086(var9) : var9;
        return Numbers.numE((SubLObject)module0606.ZERO_INTEGER, f37089(var9));
    }
    
    public static SubLObject f37093(final SubLObject var9) {
        assert module0606.NIL != f37086(var9) : var9;
        return Numbers.minusp(f37089(var9));
    }
    
    public static SubLObject f37094(final SubLObject var9) {
        assert module0606.NIL != f37086(var9) : var9;
        return Numbers.plusp(f37089(var9));
    }
    
    public static SubLObject f37095(final SubLObject var9) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0606.NIL == f37093(var9));
    }
    
    public static SubLObject f37096(final SubLObject var9, final SubLObject var10) {
        assert module0606.NIL != f37086(var9) : var9;
        assert module0606.NIL != module0004.f105(var10) : var10;
        final SubLObject var11 = f37089(var9);
        final SubLObject var12 = f37090(var9);
        final SubLObject var13 = Numbers.multiply(var11, Numbers.expt((SubLObject)module0606.TEN_INTEGER, var10));
        return f37087(var13, var12);
    }
    
    public static SubLObject f37097(final SubLObject var12) {
        return f37098(var12, (SubLObject)module0606.UNPROVIDED);
    }
    
    public static SubLObject f37098(final SubLObject var12, SubLObject var5) {
        if (var5 == module0606.UNPROVIDED) {
            var5 = (SubLObject)module0606.NIL;
        }
        if (module0606.NIL == module0048.f3410(var12)) {
            module0229.f15259();
        }
        SubLObject var13 = (SubLObject)module0606.NIL;
        SubLObject var14 = (SubLObject)module0606.NIL;
        final SubLObject var15 = Sequences.find_if((SubLObject)module0606.$ic6$, var12, (SubLObject)module0606.UNPROVIDED, (SubLObject)module0606.UNPROVIDED, (SubLObject)module0606.UNPROVIDED);
        final SubLObject var16 = (SubLObject)((module0606.NIL != var15) ? module0038.f2703(var12, var15) : module0606.$ic7$);
        SubLObject var17 = (module0606.NIL != var15) ? module0038.f2622(var12, var15) : module0038.f2658(var12);
        SubLObject var18 = (SubLObject)module0606.NIL;
        if (Characters.CHAR_hyphen.eql(Sequences.elt(var17, (SubLObject)module0606.ZERO_INTEGER))) {
            var18 = (SubLObject)module0606.T;
            var17 = module0038.f2623(var17, (SubLObject)module0606.ONE_INTEGER, (SubLObject)module0606.UNPROVIDED);
        }
        else if (Characters.CHAR_plus.eql(Sequences.elt(var17, (SubLObject)module0606.ZERO_INTEGER))) {
            var17 = module0038.f2623(var17, (SubLObject)module0606.ONE_INTEGER, (SubLObject)module0606.UNPROVIDED);
        }
        if (Characters.CHAR_period.eql(Sequences.elt(var17, (SubLObject)module0606.ZERO_INTEGER))) {
            var17 = Sequences.cconcatenate((SubLObject)module0606.$ic7$, var17);
        }
        SubLObject var19 = module0038.f2702((SubLObject)Characters.CHAR_period, var17, (SubLObject)module0606.UNPROVIDED);
        if (module0606.NIL != var19) {
            var17 = Sequences.remove((SubLObject)Characters.CHAR_period, var17, (SubLObject)module0606.UNPROVIDED, (SubLObject)module0606.UNPROVIDED, (SubLObject)module0606.UNPROVIDED, (SubLObject)module0606.UNPROVIDED, (SubLObject)module0606.UNPROVIDED);
        }
        else {
            var19 = Sequences.length(var17);
        }
        final SubLObject var20 = f37099(var17);
        if (module0606.NIL != var18 && module0606.NIL != var20) {
            var17 = Sequences.cconcatenate((SubLObject)module0606.$ic8$, var17);
        }
        if (module0606.NIL != var20) {
            var13 = module0038.f2642(var17);
            var14 = Numbers.add(module0038.f2642(var16), Numbers.subtract(var19, var20, (SubLObject)module0606.ONE_INTEGER));
        }
        else {
            var13 = (SubLObject)module0606.ZERO_INTEGER;
        }
        if (var13.numE((SubLObject)module0606.ZERO_INTEGER)) {
            var14 = (SubLObject)module0606.ZERO_INTEGER;
        }
        final SubLObject var21 = f37087(var13, var14);
        if (module0606.NIL == var5) {
            return var21;
        }
        final SubLObject var22 = f37100(var21);
        if (var22.numG(var5)) {
            return module0048.f3302(var21, var5);
        }
        if (var22.numL(var5)) {
            return f37096(var21, Numbers.subtract(var5, var22));
        }
        return var21;
    }
    
    public static SubLObject f37099(final SubLObject var12) {
        return Sequences.position_if((SubLObject)module0606.$ic9$, var12, (SubLObject)module0606.UNPROVIDED, (SubLObject)module0606.UNPROVIDED, (SubLObject)module0606.UNPROVIDED);
    }
    
    public static SubLObject f37101(final SubLObject var21) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0606.NIL != Characters.digit_char_p(var21, (SubLObject)module0606.UNPROVIDED) && !var21.eql((SubLObject)Characters.CHAR_0));
    }
    
    public static SubLObject f37102(final SubLObject var22) {
        SubLObject var23 = (SubLObject)module0606.NIL;
        SubLObject var24 = (SubLObject)module0606.$ic10$;
        if (Sequences.length(var22).numE((SubLObject)module0606.ONE_INTEGER)) {
            var23 = var22.first();
        }
        else {
            var23 = var22.first();
            var24 = conses_high.second(var22);
        }
        if (module0606.NIL == f37085(var23) || !var24.isString()) {
            module0229.f15259();
        }
        final SubLObject var25 = f37089(var23);
        if (var25.isZero()) {
            return (SubLObject)module0606.$ic7$;
        }
        SubLObject var26 = module0038.f2638(var25);
        final SubLObject var27 = f37090(var23);
        final SubLObject var28 = module0038.f2638(var27);
        SubLObject var29 = (SubLObject)module0606.NIL;
        if (Characters.CHAR_hyphen.eql(Sequences.elt(var26, (SubLObject)module0606.ZERO_INTEGER))) {
            var29 = (SubLObject)module0606.$ic8$;
            var26 = module0038.f2623(var26, (SubLObject)module0606.ONE_INTEGER, (SubLObject)module0606.UNPROVIDED);
        }
        else {
            var29 = (SubLObject)module0606.$ic11$;
        }
        if (Sequences.length(var26).numG((SubLObject)module0606.ONE_INTEGER)) {
            var26 = Sequences.cconcatenate(module0038.f2623(var26, (SubLObject)module0606.ZERO_INTEGER, (SubLObject)module0606.ONE_INTEGER), new SubLObject[] { module0606.$ic12$, module0038.f2623(var26, (SubLObject)module0606.ONE_INTEGER, (SubLObject)module0606.UNPROVIDED) });
        }
        return Sequences.cconcatenate(var29, new SubLObject[] { var26, var24, var28 });
    }
    
    public static SubLObject f37103(final SubLObject var25) {
        return f37104(var25, (SubLObject)module0606.UNPROVIDED);
    }
    
    public static SubLObject f37104(final SubLObject var25, SubLObject var5) {
        if (var5 == module0606.UNPROVIDED) {
            var5 = (SubLObject)module0606.NIL;
        }
        return f37098(module0038.f2638(var25), var5);
    }
    
    public static SubLObject f37105(final SubLObject var23) {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        final SubLObject var25 = f37102((SubLObject)ConsesLow.list(var23));
        var24.resetMultipleValues();
        final SubLObject var26 = reader.read_from_string_ignoring_errors(var25, (SubLObject)module0606.UNPROVIDED, (SubLObject)module0606.UNPROVIDED, (SubLObject)module0606.UNPROVIDED, (SubLObject)module0606.UNPROVIDED);
        final SubLObject var27 = var24.secondMultipleValue();
        var24.resetMultipleValues();
        return var26;
    }
    
    public static SubLObject f37100(final SubLObject var23) {
        final SubLObject var24 = f37089(var23);
        return module0048.f3301(var24);
    }
    
    public static SubLObject f37106() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0606", "f37085", "CYC-SCIENTIFIC-NUMBER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0606", "f37086", "S#4666", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0606", "f37087", "S#40905", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0606", "f37088", "S#40906", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0606", "f37089", "S#40907", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0606", "f37090", "S#40908", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0606", "f37091", "S#40909", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0606", "f37092", "S#40910", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0606", "f37093", "S#40911", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0606", "f37094", "S#40912", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0606", "f37095", "S#40913", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0606", "f37096", "S#40914", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0606", "f37097", "CYC-SCIENTIFIC-NUMBER-FROM-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0606", "f37098", "S#40915", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0606", "f37099", "S#40916", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0606", "f37101", "S#40917", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0606", "f37102", "CYC-SCIENTIFIC-NUMBER-TO-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0606", "f37103", "CYC-SCIENTIFIC-NUMBER-FROM-SUBL-REAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0606", "f37104", "S#40918", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0606", "f37105", "CYC-SCIENTIFIC-NUMBER-TO-SUBL-REAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0606", "f37100", "CYC-SCIENTIFIC-NUMBER-SIGNIFICANT-DIGIT-COUNT", 1, 0, false);
        return (SubLObject)module0606.NIL;
    }
    
    public static SubLObject f37107() {
        return (SubLObject)module0606.NIL;
    }
    
    public static SubLObject f37108() {
        module0012.f416((SubLObject)module0606.$ic0$);
        module0012.f416((SubLObject)module0606.$ic5$);
        module0012.f416((SubLObject)module0606.$ic13$);
        module0012.f416((SubLObject)module0606.$ic14$);
        module0012.f416((SubLObject)module0606.$ic15$);
        module0012.f416((SubLObject)module0606.$ic16$);
        return (SubLObject)module0606.NIL;
    }
    
    public void declareFunctions() {
        f37106();
    }
    
    public void initializeVariables() {
        f37107();
    }
    
    public void runTopLevelForms() {
        f37108();
    }
    
    static {
        me = (SubLFile)new module0606();
        $ic0$ = SubLObjectFactory.makeSymbol("CYC-SCIENTIFIC-NUMBER-P");
        $ic1$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ScientificNumberFn"));
        $ic2$ = SubLObjectFactory.makeSymbol("INTEGERP");
        $ic3$ = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $ic4$ = SubLObjectFactory.makeSymbol("S#4666", "CYC");
        $ic5$ = SubLObjectFactory.makeSymbol("CYC-SCIENTIFIC-NUMBER-FROM-STRING");
        $ic6$ = SubLObjectFactory.makeSymbol("ALPHA-CHAR-P");
        $ic7$ = SubLObjectFactory.makeString("0");
        $ic8$ = SubLObjectFactory.makeString("-");
        $ic9$ = SubLObjectFactory.makeSymbol("S#40917", "CYC");
        $ic10$ = SubLObjectFactory.makeString("e");
        $ic11$ = SubLObjectFactory.makeString("");
        $ic12$ = SubLObjectFactory.makeString(".");
        $ic13$ = SubLObjectFactory.makeSymbol("CYC-SCIENTIFIC-NUMBER-TO-STRING");
        $ic14$ = SubLObjectFactory.makeSymbol("CYC-SCIENTIFIC-NUMBER-FROM-SUBL-REAL");
        $ic15$ = SubLObjectFactory.makeSymbol("CYC-SCIENTIFIC-NUMBER-TO-SUBL-REAL");
        $ic16$ = SubLObjectFactory.makeSymbol("CYC-SCIENTIFIC-NUMBER-SIGNIFICANT-DIGIT-COUNT");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0606.class
	Total time: 112 ms
	
	Decompiled with Procyon 0.5.32.
*/