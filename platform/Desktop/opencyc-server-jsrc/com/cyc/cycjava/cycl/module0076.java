package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0076 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0076";
    public static final String myFingerPrint = "f9eb4ae6453a7e8fa7d5a47c8a0ab94da4835b7320db40624a754575a5a0a163";
    private static SubLSymbol $g1140$;
    private static SubLSymbol $g1141$;
    private static final SubLInteger $ic0$;
    private static final SubLString $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    
    public static SubLObject f5287(final SubLObject var1) {
        SubLObject var2 = (SubLObject)module0076.NIL;
        final SubLObject var3 = module0031.f1696(var1);
        final SubLObject var4 = (SubLObject)module0076.NIL;
        SubLObject var5;
        SubLObject var6;
        SubLObject var7;
        SubLObject var8;
        for (var5 = Sequences.length(var3), var6 = (SubLObject)module0076.NIL, var6 = (SubLObject)module0076.ZERO_INTEGER; var6.numL(var5); var6 = Numbers.add(var6, (SubLObject)module0076.ONE_INTEGER)) {
            var7 = ((module0076.NIL != var4) ? Numbers.subtract(var5, var6, (SubLObject)module0076.ONE_INTEGER) : var6);
            var8 = Vectors.aref(var3, var7);
            if (module0076.NIL != module0031.f1697(var8)) {
                var2 = (SubLObject)ConsesLow.cons(var8, var2);
            }
        }
        return Sequences.nreverse(var2);
    }
    
    public static SubLObject f5288(final SubLObject var9, SubLObject var10, SubLObject var11) {
        if (var10 == module0076.UNPROVIDED) {
            var10 = (SubLObject)module0076.NIL;
        }
        if (var11 == module0076.UNPROVIDED) {
            var11 = Sequences.length(var9);
        }
        final SubLObject var12 = module0031.f1685(var11, var10);
        SubLObject var13 = var9;
        SubLObject var14 = (SubLObject)module0076.NIL;
        var14 = var13.first();
        while (module0076.NIL != var13) {
            module0031.f1690(var14, var12);
            var13 = var13.rest();
            var14 = var13.first();
        }
        return var12;
    }
    
    public static SubLObject f5289(final SubLObject var1) {
        final SubLObject var2 = f5287(var1);
        module0031.f1686(var1);
        SubLObject var3 = var2;
        SubLObject var4 = (SubLObject)module0076.NIL;
        var4 = var3.first();
        while (module0076.NIL != var3) {
            module0031.f1690(var4, var1);
            var3 = var3.rest();
            var4 = var3.first();
        }
        return var1;
    }
    
    public static SubLObject f5290(final SubLObject var15, final SubLObject var16, SubLObject var17, SubLObject var8, SubLObject var1) {
        if (var17 == module0076.UNPROVIDED) {
            var17 = Symbols.symbol_function((SubLObject)module0076.EQUAL);
        }
        if (var8 == module0076.UNPROVIDED) {
            var8 = Symbols.symbol_function((SubLObject)module0076.IDENTITY);
        }
        if (var1 == module0076.UNPROVIDED) {
            var1 = (SubLObject)module0076.NIL;
        }
        final SubLThread var18 = SubLProcess.currentSubLThread();
        assert module0076.NIL != Types.function_spec_p(var17) : var17;
        if (module0076.NIL != module0035.f1994(var15, module0035.$g892$.getDynamicValue(var18), (SubLObject)module0076.UNPROVIDED)) {
            return conses_high.intersection(var15, var16, var17, var8);
        }
        if (module0076.NIL != module0035.f1994(var16, module0035.$g892$.getDynamicValue(var18), (SubLObject)module0076.UNPROVIDED)) {
            return conses_high.intersection(var15, var16, var17, var8);
        }
        if (module0076.NIL != var1) {
            return f5291(var15, var16, var1, var8);
        }
        if (module0076.NIL != module0030.f1591(var17)) {
            return f5291(var15, var16, module0076.$g1140$.getDynamicValue(var18), var8);
        }
        return conses_high.intersection(var15, var16, var17, var8);
    }
    
    public static SubLObject f5292(final SubLObject var19, final SubLObject var20) {
        return f5290(var19, var20, (SubLObject)module0076.UNPROVIDED, (SubLObject)module0076.UNPROVIDED, (SubLObject)module0076.UNPROVIDED);
    }
    
    public static SubLObject f5291(final SubLObject var15, final SubLObject var16, SubLObject var1, SubLObject var8) {
        if (var1 == module0076.UNPROVIDED) {
            var1 = module0076.$g1140$.getDynamicValue();
        }
        if (var8 == module0076.UNPROVIDED) {
            var8 = Symbols.symbol_function((SubLObject)module0076.IDENTITY);
        }
        final SubLThread var17 = SubLProcess.currentSubLThread();
        if (var1.eql(module0076.$g1140$.getDynamicValue(var17))) {
            SubLObject var18 = (SubLObject)module0076.NIL;
            final SubLObject var19 = module0076.$g1141$.getDynamicValue(var17);
            SubLObject var20 = (SubLObject)module0076.NIL;
            try {
                var20 = Locks.seize_lock(var19);
                var18 = f5293(var15, var16, var1, var8);
            }
            finally {
                if (module0076.NIL != var20) {
                    Locks.release_lock(var19);
                }
            }
            return var18;
        }
        return f5293(var15, var16, var1, var8);
    }
    
    public static SubLObject f5293(final SubLObject var15, final SubLObject var16, SubLObject var1, SubLObject var8) {
        if (var1 == module0076.UNPROVIDED) {
            var1 = module0076.$g1140$.getDynamicValue();
        }
        if (var8 == module0076.UNPROVIDED) {
            var8 = Symbols.symbol_function((SubLObject)module0076.IDENTITY);
        }
        assert module0076.NIL != Types.listp(var15) : var15;
        assert module0076.NIL != Types.listp(var16) : var16;
        assert module0076.NIL != module0031.f1646(var1) : var1;
        if (var15.eql(var16)) {
            return var15;
        }
        SubLObject var17 = (SubLObject)module0076.NIL;
        module0031.f1686(var1);
        if (var8.eql(Symbols.symbol_function((SubLObject)module0076.IDENTITY)) || var8 == module0076.IDENTITY) {
            SubLObject var18 = var15;
            SubLObject var19 = (SubLObject)module0076.NIL;
            var19 = var18.first();
            while (module0076.NIL != var18) {
                module0031.f1690(var19, var1);
                var18 = var18.rest();
                var19 = var18.first();
            }
            var18 = var16;
            var19 = (SubLObject)module0076.NIL;
            var19 = var18.first();
            while (module0076.NIL != var18) {
                if (module0076.NIL != module0031.f1688(var19, var1)) {
                    var17 = (SubLObject)ConsesLow.cons(var19, var17);
                }
                var18 = var18.rest();
                var19 = var18.first();
            }
        }
        else {
            SubLObject var18 = var15;
            SubLObject var19 = (SubLObject)module0076.NIL;
            var19 = var18.first();
            while (module0076.NIL != var18) {
                module0031.f1690(Functions.funcall(var8, var19), var1);
                var18 = var18.rest();
                var19 = var18.first();
            }
            var18 = var16;
            var19 = (SubLObject)module0076.NIL;
            var19 = var18.first();
            while (module0076.NIL != var18) {
                if (module0076.NIL != module0031.f1688(Functions.funcall(var8, var19), var1)) {
                    var17 = (SubLObject)ConsesLow.cons(var19, var17);
                }
                var18 = var18.rest();
                var19 = var18.first();
            }
        }
        return Sequences.nreverse(var17);
    }
    
    public static SubLObject f5294(final SubLObject var15, final SubLObject var16, SubLObject var17, SubLObject var8, SubLObject var1) {
        if (var17 == module0076.UNPROVIDED) {
            var17 = Symbols.symbol_function((SubLObject)module0076.EQUAL);
        }
        if (var8 == module0076.UNPROVIDED) {
            var8 = Symbols.symbol_function((SubLObject)module0076.IDENTITY);
        }
        if (var1 == module0076.UNPROVIDED) {
            var1 = (SubLObject)module0076.NIL;
        }
        final SubLThread var18 = SubLProcess.currentSubLThread();
        assert module0076.NIL != Types.function_spec_p(var17) : var17;
        if (module0076.NIL != module0035.f1994(var15, module0035.$g892$.getDynamicValue(var18), (SubLObject)module0076.UNPROVIDED)) {
            return module0035.f2180(var15, var16, var17, var8);
        }
        if (module0076.NIL != module0035.f1994(var16, module0035.$g892$.getDynamicValue(var18), (SubLObject)module0076.UNPROVIDED)) {
            return module0035.f2180(var15, var16, var17, var8);
        }
        if (module0076.NIL != var1) {
            return f5295(var15, var16, var1, var8);
        }
        if (module0076.NIL != module0030.f1591(var17)) {
            return f5295(var15, var16, module0076.$g1140$.getDynamicValue(var18), var8);
        }
        return module0035.f2180(var15, var16, var17, var8);
    }
    
    public static SubLObject f5295(final SubLObject var15, final SubLObject var16, SubLObject var1, SubLObject var8) {
        if (var1 == module0076.UNPROVIDED) {
            var1 = module0076.$g1140$.getDynamicValue();
        }
        if (var8 == module0076.UNPROVIDED) {
            var8 = Symbols.symbol_function((SubLObject)module0076.IDENTITY);
        }
        final SubLThread var17 = SubLProcess.currentSubLThread();
        if (var1.eql(module0076.$g1140$.getDynamicValue(var17))) {
            SubLObject var18 = (SubLObject)module0076.NIL;
            final SubLObject var19 = module0076.$g1141$.getDynamicValue(var17);
            SubLObject var20 = (SubLObject)module0076.NIL;
            try {
                var20 = Locks.seize_lock(var19);
                var18 = f5296(var15, var16, var1, var8);
            }
            finally {
                if (module0076.NIL != var20) {
                    Locks.release_lock(var19);
                }
            }
            return var18;
        }
        return f5296(var15, var16, var1, var8);
    }
    
    public static SubLObject f5296(final SubLObject var15, final SubLObject var16, SubLObject var1, SubLObject var8) {
        if (var1 == module0076.UNPROVIDED) {
            var1 = module0076.$g1140$.getDynamicValue();
        }
        if (var8 == module0076.UNPROVIDED) {
            var8 = Symbols.symbol_function((SubLObject)module0076.IDENTITY);
        }
        assert module0076.NIL != Types.listp(var15) : var15;
        assert module0076.NIL != Types.listp(var16) : var16;
        assert module0076.NIL != module0031.f1646(var1) : var1;
        if (var15.eql(var16)) {
            return (SubLObject)module0076.T;
        }
        final SubLObject var17 = module0035.f2007(var15, var16);
        final SubLObject var18 = (module0076.NIL != var17) ? var16 : var15;
        final SubLObject var19 = (module0076.NIL != var17) ? var15 : var16;
        module0031.f1686(var1);
        if (var8.eql(Symbols.symbol_function((SubLObject)module0076.IDENTITY)) || var8 == module0076.IDENTITY) {
            SubLObject var20 = var18;
            SubLObject var21 = (SubLObject)module0076.NIL;
            var21 = var20.first();
            while (module0076.NIL != var20) {
                module0031.f1690(var21, var1);
                var20 = var20.rest();
                var21 = var20.first();
            }
            var20 = var19;
            var21 = (SubLObject)module0076.NIL;
            var21 = var20.first();
            while (module0076.NIL != var20) {
                if (module0076.NIL != module0031.f1688(var21, var1)) {
                    return (SubLObject)module0076.T;
                }
                var20 = var20.rest();
                var21 = var20.first();
            }
        }
        else {
            SubLObject var20 = var18;
            SubLObject var21 = (SubLObject)module0076.NIL;
            var21 = var20.first();
            while (module0076.NIL != var20) {
                module0031.f1690(Functions.funcall(var8, var21), var1);
                var20 = var20.rest();
                var21 = var20.first();
            }
            var20 = var19;
            var21 = (SubLObject)module0076.NIL;
            var21 = var20.first();
            while (module0076.NIL != var20) {
                if (module0076.NIL != module0031.f1688(Functions.funcall(var8, var21), var1)) {
                    return (SubLObject)module0076.T;
                }
                var20 = var20.rest();
                var21 = var20.first();
            }
        }
        return (SubLObject)module0076.NIL;
    }
    
    public static SubLObject f5297() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0076", "f5287", "S#2967", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0076", "f5288", "S#2966", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0076", "f5289", "S#2970", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0076", "f5290", "S#6911", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0076", "f5292", "S#6912", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0076", "f5291", "S#6913", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0076", "f5293", "S#6914", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0076", "f5294", "S#6915", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0076", "f5295", "S#6916", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0076", "f5296", "S#6917", 2, 2, false);
        return (SubLObject)module0076.NIL;
    }
    
    public static SubLObject f5298() {
        module0076.$g1140$ = SubLFiles.defparameter("S#6918", module0031.f1685((SubLObject)module0076.$ic0$, Symbols.symbol_function((SubLObject)module0076.EQUAL)));
        module0076.$g1141$ = SubLFiles.defparameter("S#6919", Locks.make_lock((SubLObject)module0076.$ic1$));
        return (SubLObject)module0076.NIL;
    }
    
    public static SubLObject f5299() {
        return (SubLObject)module0076.NIL;
    }
    
    public void declareFunctions() {
        f5297();
    }
    
    public void initializeVariables() {
        f5298();
    }
    
    public void runTopLevelForms() {
        f5299();
    }
    
    static {
        me = (SubLFile)new module0076();
        module0076.$g1140$ = null;
        module0076.$g1141$ = null;
        $ic0$ = SubLObjectFactory.makeInteger(500);
        $ic1$ = SubLObjectFactory.makeString("Intersection table Lock");
        $ic2$ = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $ic3$ = SubLObjectFactory.makeSymbol("LISTP");
        $ic4$ = SubLObjectFactory.makeSymbol("S#2881", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0076.class
	Total time: 87 ms
	
	Decompiled with Procyon 0.5.32.
*/