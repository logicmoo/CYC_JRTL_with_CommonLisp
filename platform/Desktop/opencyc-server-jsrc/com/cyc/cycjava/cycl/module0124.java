package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0124 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0124";
    public static final String myFingerPrint = "3385724f24f9a16273eebc121344f942ba442868230293e0d6feffa88e01aca6";
    private static SubLSymbol $g1494$;
    public static SubLSymbol $g1495$;
    private static final SubLSymbol $ic0$;
    private static final SubLString $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    
    public static SubLObject f8359(final SubLObject var1) {
        assert module0124.NIL != Types.stringp(var1) : var1;
        return module0063.f4581(module0124.$g1494$.getGlobalValue(), var1, (SubLObject)module0124.T, (SubLObject)module0124.ZERO_INTEGER, (SubLObject)module0124.NIL);
    }
    
    public static SubLObject f8360(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = module0063.f4581(module0124.$g1494$.getGlobalValue(), var1, (SubLObject)module0124.T, var2, var3);
        if (module0124.NIL != module0128.f8449(var5) && module0124.NIL != module0124.$g1495$.getDynamicValue(var4) && module0124.NIL == module0128.f8461(var5)) {
            var5 = (SubLObject)module0124.NIL;
        }
        return var5;
    }
    
    public static SubLObject f8361(final SubLObject var6, final SubLObject var7, final SubLObject var8, final SubLObject var2, final SubLObject var3) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        SubLObject var10 = module0063.f4584(module0124.$g1494$.getGlobalValue(), var6, var7, var8, var2, var3);
        if (module0124.NIL != module0124.$g1495$.getDynamicValue(var9)) {
            var10 = Sequences.delete_if((SubLObject)module0124.$ic3$, var10, (SubLObject)module0124.UNPROVIDED, (SubLObject)module0124.UNPROVIDED, (SubLObject)module0124.UNPROVIDED, (SubLObject)module0124.UNPROVIDED);
        }
        return var10;
    }
    
    public static SubLObject f8362(final SubLObject var9, final SubLObject var7, final SubLObject var2, final SubLObject var3) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        SubLObject var11 = module0063.f4592(module0124.$g1494$.getGlobalValue(), var9, var7, var2, var3);
        if (module0124.NIL != module0124.$g1495$.getDynamicValue(var10)) {
            var11 = Sequences.delete_if((SubLObject)module0124.$ic3$, var11, (SubLObject)module0124.UNPROVIDED, (SubLObject)module0124.UNPROVIDED, (SubLObject)module0124.UNPROVIDED, (SubLObject)module0124.UNPROVIDED);
        }
        return var11;
    }
    
    public static SubLObject f8363(final SubLObject var10, final SubLObject var7, final SubLObject var2, final SubLObject var3) {
        final SubLObject var11 = f8362(var10, var7, var2, var3);
        SubLObject var12 = (SubLObject)module0124.NIL;
        SubLObject var13 = var11;
        SubLObject var14 = (SubLObject)module0124.NIL;
        var14 = var13.first();
        while (module0124.NIL != var13) {
            final SubLObject var15 = module0166.f10743(var14);
            final SubLObject var16 = Sequences.length(var15);
            final SubLObject var17 = (module0124.NIL != var3) ? var3 : Sequences.length(var10);
            final SubLObject var18 = Numbers.subtract(var17, var2);
            final SubLObject var19 = Numbers.subtract(var16, var18);
            if (module0124.NIL != Sequences.search(var10, var15, Symbols.symbol_function((SubLObject)module0124.$ic4$), Symbols.symbol_function((SubLObject)module0124.IDENTITY), var2, var3, var19, var16)) {
                var12 = (SubLObject)ConsesLow.cons(var14, var12);
            }
            var13 = var13.rest();
            var14 = var13.first();
        }
        return Sequences.nreverse(var12);
    }
    
    public static SubLObject f8364(final SubLObject var20, final SubLObject var1, final SubLObject var7, final SubLObject var2, final SubLObject var3, final SubLObject var21) {
        return f8365(var20, var1, var7, var2, var3, (SubLObject)module0124.NIL, var21);
    }
    
    public static SubLObject f8366(final SubLObject var20, final SubLObject var1, final SubLObject var7, final SubLObject var2, final SubLObject var3, final SubLObject var21) {
        return f8365(var20, var1, var7, var2, var3, (SubLObject)module0124.T, var21);
    }
    
    public static SubLObject f8365(final SubLObject var20, final SubLObject var1, final SubLObject var7, final SubLObject var2, final SubLObject var3, final SubLObject var22, final SubLObject var21) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        SubLObject var24 = (SubLObject)module0124.NIL;
        if (!var20.isZero()) {
            final SubLObject var25 = f8367(var1, var7, var2, var3, var22, var21);
            SubLObject var26 = (SubLObject)module0124.ZERO_INTEGER;
            SubLObject var28;
            SubLObject var30;
            for (SubLObject var27 = var28 = Numbers.numGE(var26, var20); module0124.NIL == var28; var28 = (SubLObject)SubLObjectFactory.makeBoolean(module0124.NIL == var30 || module0124.NIL != var27)) {
                var23.resetMultipleValues();
                final SubLObject var29 = module0052.f3693(var25);
                var30 = var23.secondMultipleValue();
                var23.resetMultipleValues();
                if (module0124.NIL != var30) {
                    var24 = (SubLObject)ConsesLow.cons(var29, var24);
                    var26 = Numbers.add(var26, (SubLObject)module0124.ONE_INTEGER);
                    if (var26.numGE(var20)) {
                        var27 = (SubLObject)module0124.T;
                    }
                }
            }
            module0052.f3696(var25);
        }
        return Sequences.nreverse(var24);
    }
    
    public static SubLObject f8368() {
        return module0063.f4563(module0124.$g1494$.getGlobalValue());
    }
    
    public static SubLObject f8369(final SubLObject var28, final SubLObject var1) {
        assert module0124.NIL != module0128.f8449(var28) : var28;
        assert module0124.NIL != Types.stringp(var1) : var1;
        module0063.f4562(module0124.$g1494$.getGlobalValue(), var1, var28, (SubLObject)module0124.UNPROVIDED, (SubLObject)module0124.UNPROVIDED);
        return var28;
    }
    
    public static SubLObject f8370(final SubLObject var28, final SubLObject var1) {
        assert module0124.NIL != module0128.f8449(var28) : var28;
        assert module0124.NIL != Types.stringp(var1) : var1;
        module0063.f4577(module0124.$g1494$.getGlobalValue(), var1, var28, (SubLObject)module0124.UNPROVIDED, (SubLObject)module0124.UNPROVIDED);
        return var28;
    }
    
    public static SubLObject f8371(SubLObject var22) {
        if (var22 == module0124.UNPROVIDED) {
            var22 = (SubLObject)module0124.T;
        }
        return module0063.f4601(module0124.$g1494$.getGlobalValue(), var22);
    }
    
    public static SubLObject f8367(final SubLObject var1, SubLObject var7, SubLObject var2, SubLObject var3, SubLObject var22, SubLObject var21) {
        if (var7 == module0124.UNPROVIDED) {
            var7 = (SubLObject)module0124.T;
        }
        if (var2 == module0124.UNPROVIDED) {
            var2 = (SubLObject)module0124.ZERO_INTEGER;
        }
        if (var3 == module0124.UNPROVIDED) {
            var3 = (SubLObject)module0124.NIL;
        }
        if (var22 == module0124.UNPROVIDED) {
            var22 = (SubLObject)module0124.T;
        }
        if (var21 == module0124.UNPROVIDED) {
            var21 = (SubLObject)module0124.NIL;
        }
        return module0063.f4611(module0124.$g1494$.getGlobalValue(), var1, var7, var2, var3, var22, var21);
    }
    
    public static SubLObject f8372() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0124", "f8359", "S#10470", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0124", "f8360", "S#10471", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0124", "f8361", "S#10472", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0124", "f8362", "S#10473", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0124", "f8363", "S#10474", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0124", "f8364", "S#10475", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0124", "f8366", "S#10476", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0124", "f8365", "S#10477", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0124", "f8368", "S#10478", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0124", "f8369", "S#10479", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0124", "f8370", "S#10480", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0124", "f8371", "S#10481", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0124", "f8367", "S#10482", 1, 5, false);
        return (SubLObject)module0124.NIL;
    }
    
    public static SubLObject f8373() {
        module0124.$g1494$ = SubLFiles.deflexical("S#10483", (module0124.NIL != Symbols.boundp((SubLObject)module0124.$ic0$)) ? module0124.$g1494$.getGlobalValue() : module0063.f4560((SubLObject)module0124.T, (SubLObject)module0124.$ic1$, (SubLObject)module0124.UNPROVIDED, (SubLObject)module0124.UNPROVIDED));
        module0124.$g1495$ = SubLFiles.defparameter("S#10484", (SubLObject)module0124.T);
        return (SubLObject)module0124.NIL;
    }
    
    public static SubLObject f8374() {
        module0003.f57((SubLObject)module0124.$ic0$);
        return (SubLObject)module0124.NIL;
    }
    
    public void declareFunctions() {
        f8372();
    }
    
    public void initializeVariables() {
        f8373();
    }
    
    public void runTopLevelForms() {
        f8374();
    }
    
    static {
        me = (SubLFile)new module0124();
        module0124.$g1494$ = null;
        module0124.$g1495$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#10483", "CYC");
        $ic1$ = SubLObjectFactory.makeString("Constant Completion Table");
        $ic2$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic3$ = SubLObjectFactory.makeSymbol("S#10485", "CYC");
        $ic4$ = SubLObjectFactory.makeSymbol("CHAR-EQUAL");
        $ic5$ = SubLObjectFactory.makeSymbol("CONSTANT-P");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0124.class
	Total time: 69 ms
	
	Decompiled with Procyon 0.5.32.
*/