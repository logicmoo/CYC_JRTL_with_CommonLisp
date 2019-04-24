package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0050 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0050";
    public static final String myFingerPrint = "f3cb86c084b70ca6be5ca0252a85902baac50a0c30b2b24a22403d6f1da1465d";
    private static final SubLSymbol $ic0$;
    private static final SubLString $ic1$;
    private static final SubLString $ic2$;
    private static final SubLString $ic3$;
    private static final SubLString $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLString $ic6$;
    private static final SubLString $ic7$;
    private static final SubLString $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    
    public static SubLObject f3519(final SubLObject var1) {
        if (module0050.NIL == module0035.f2015(var1)) {
            return (SubLObject)module0050.NIL;
        }
        final SubLObject var2 = var1.first();
        if (module0050.NIL != module0049.f3492(var2)) {
            final SubLObject var3 = Sequences.length(var2);
            SubLObject var4 = var1.rest();
            SubLObject var5 = (SubLObject)module0050.NIL;
            var5 = var4.first();
            while (module0050.NIL != var4) {
                if (module0050.NIL == module0049.f3492(var5)) {
                    return (SubLObject)module0050.NIL;
                }
                if (module0050.NIL == module0035.f1995(var5, var3, (SubLObject)module0050.UNPROVIDED)) {
                    return (SubLObject)module0050.NIL;
                }
                var4 = var4.rest();
                var5 = var4.first();
            }
            return (SubLObject)module0050.T;
        }
        return (SubLObject)module0050.NIL;
    }
    
    public static SubLObject f3520(final SubLObject var1) {
        return f3519(var1);
    }
    
    public static SubLObject f3521(final SubLObject var1) {
        if (module0050.NIL == f3519(var1)) {
            return (SubLObject)module0050.NIL;
        }
        final SubLObject var2 = f3522(var1);
        final SubLObject var3 = f3523(var1);
        if (!var3.numE(Numbers.add(var2, (SubLObject)module0050.ONE_INTEGER))) {
            return (SubLObject)module0050.NIL;
        }
        SubLObject var4 = (SubLObject)module0050.NIL;
        SubLObject var5 = (SubLObject)module0050.NIL;
        SubLObject var6 = (SubLObject)module0050.NIL;
        var4 = var1;
        var5 = var4.first();
        for (var6 = (SubLObject)module0050.ZERO_INTEGER; module0050.NIL != var4; var4 = var4.rest(), var5 = var4.first(), var6 = Numbers.add((SubLObject)module0050.ONE_INTEGER, var6)) {
            SubLObject var7;
            for (var7 = (SubLObject)module0050.NIL, var7 = (SubLObject)module0050.ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)module0050.ONE_INTEGER)) {
                if (module0050.NIL == module0049.f3504((SubLObject)module0050.ZERO_INTEGER, ConsesLow.nth(var7, var5))) {
                    return (SubLObject)module0050.NIL;
                }
            }
            if (module0050.NIL != module0049.f3504((SubLObject)module0050.ZERO_INTEGER, ConsesLow.nth(var6, var5))) {
                return (SubLObject)module0050.NIL;
            }
        }
        return (SubLObject)module0050.T;
    }
    
    public static SubLObject f3524(final SubLObject var10) {
        assert module0050.NIL != f3520(var10) : var10;
        return var10;
    }
    
    public static SubLObject f3525(final SubLObject var11, SubLObject var12) {
        if (var12 == module0050.UNPROVIDED) {
            var12 = StreamsLow.$standard_output$.getDynamicValue();
        }
        assert module0050.NIL != f3520(var11) : var11;
        PrintLow.format(var12, (SubLObject)module0050.$ic1$);
        SubLObject var13 = var11;
        SubLObject var14 = (SubLObject)module0050.NIL;
        var14 = var13.first();
        while (module0050.NIL != var13) {
            print_high.princ((SubLObject)module0050.$ic2$, var12);
            SubLObject var4_13 = var14;
            SubLObject var15 = (SubLObject)module0050.NIL;
            var15 = var4_13.first();
            while (module0050.NIL != var4_13) {
                print_high.princ(var15, var12);
                print_high.princ((SubLObject)module0050.$ic3$, var12);
                var4_13 = var4_13.rest();
                var15 = var4_13.first();
            }
            PrintLow.format(var12, (SubLObject)module0050.$ic4$);
            var13 = var13.rest();
            var14 = var13.first();
        }
        return (SubLObject)module0050.NIL;
    }
    
    public static SubLObject f3526(final SubLObject var11) {
        assert module0050.NIL != f3520(var11) : var11;
        return conses_high.copy_tree(var11);
    }
    
    public static SubLObject f3522(final SubLObject var11) {
        assert module0050.NIL != f3520(var11) : var11;
        return Sequences.length(var11);
    }
    
    public static SubLObject f3523(final SubLObject var11) {
        assert module0050.NIL != f3520(var11) : var11;
        return Sequences.length(var11.first());
    }
    
    public static SubLObject f3527(final SubLObject var11, final SubLObject var15, final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        assert module0050.NIL != f3520(var11) : var11;
        assert module0050.NIL != module0004.f106(var15) : var15;
        assert module0050.NIL != module0004.f106(var16) : var16;
        if (module0050.NIL == Errors.$ignore_mustsP$.getDynamicValue(var17) && !var15.numL(f3522(var11))) {
            Errors.error((SubLObject)module0050.$ic6$, var15);
        }
        if (module0050.NIL == Errors.$ignore_mustsP$.getDynamicValue(var17) && !var16.numL(f3523(var11))) {
            Errors.error((SubLObject)module0050.$ic7$, var16);
        }
        return ConsesLow.nth(var16, ConsesLow.nth(var15, var11));
    }
    
    public static SubLObject f3528(final SubLObject var11, final SubLObject var18, final SubLObject var19) {
        return f3529(var11, var18, var19, (SubLObject)module0050.NIL);
    }
    
    public static SubLObject f3530(final SubLObject var11, final SubLObject var18, final SubLObject var19) {
        return f3529(var11, var18, var19, (SubLObject)module0050.T);
    }
    
    public static SubLObject f3529(final SubLObject var11, final SubLObject var18, final SubLObject var19, final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        assert module0050.NIL != f3520(var11) : var11;
        assert module0050.NIL != module0004.f106(var18) : var18;
        assert module0050.NIL != module0004.f106(var19) : var19;
        final SubLObject var22 = f3522(var11);
        if (module0050.NIL == Errors.$ignore_mustsP$.getDynamicValue(var21) && !var18.numL(var22)) {
            Errors.error((SubLObject)module0050.$ic8$, var18);
        }
        if (module0050.NIL == Errors.$ignore_mustsP$.getDynamicValue(var21) && !var19.numL(var22)) {
            Errors.error((SubLObject)module0050.$ic8$, var19);
        }
        final SubLObject var23 = (module0050.NIL != var20) ? var11 : f3526(var11);
        ConsesLow.set_nth(var18, var23, ConsesLow.nth(var19, var11));
        ConsesLow.set_nth(var19, var23, ConsesLow.nth(var18, var11));
        return var23;
    }
    
    public static SubLObject f3531(final SubLObject var11) {
        assert module0050.NIL != f3519(var11) : var11;
        final SubLObject var12 = f3532(var11);
        assert module0050.NIL != f3521(var12) : var12;
        final SubLObject var13 = Sequences.nreverse(var12);
        SubLObject var14 = (SubLObject)module0050.NIL;
        SubLObject var15 = var13;
        SubLObject var16 = (SubLObject)module0050.NIL;
        var16 = var15.first();
        while (module0050.NIL != var15) {
            var16 = f3533(var16);
            var14 = (SubLObject)ConsesLow.cons(f3534(var16, var14), var14);
            var15 = var15.rest();
            var16 = var15.first();
        }
        return var14;
    }
    
    public static SubLObject f3532(final SubLObject var11) {
        SubLObject var12 = f3526(var11);
        SubLObject var13 = (SubLObject)module0050.NIL;
        SubLObject var14 = (SubLObject)module0050.NIL;
        SubLObject var15 = (SubLObject)module0050.NIL;
        var13 = Sequences.reverse(var12);
        var14 = var13.first();
        for (var15 = module0048.f_1_(Sequences.length(var12)); module0050.NIL != var13; var13 = var13.rest(), var14 = var13.first(), var15 = module0048.f_1_(var15)) {
            if (module0050.NIL != f3535(var14)) {
                var12 = module0035.f2045(var15, var12);
            }
        }
        return var12;
    }
    
    public static SubLObject f3535(final SubLObject var5) {
        SubLObject var6 = var5;
        SubLObject var7 = (SubLObject)module0050.NIL;
        var7 = var6.first();
        while (module0050.NIL != var6) {
            if (module0050.NIL == module0049.f3504((SubLObject)module0050.ZERO_INTEGER, var7)) {
                return (SubLObject)module0050.NIL;
            }
            var6 = var6.rest();
            var7 = var6.first();
        }
        return (SubLObject)module0050.T;
    }
    
    public static SubLObject f3533(SubLObject var5) {
        while (module0050.NIL != module0049.f3504((SubLObject)module0050.ZERO_INTEGER, var5.first())) {
            var5 = var5.rest();
        }
        return var5;
    }
    
    public static SubLObject f3534(final SubLObject var5, final SubLObject var27) {
        SubLObject var28 = conses_high.last(var5, (SubLObject)module0050.UNPROVIDED).first();
        SubLObject var29 = (SubLObject)module0050.NIL;
        SubLObject var30 = (SubLObject)module0050.NIL;
        var29 = conses_high.butlast(var5, (SubLObject)module0050.UNPROVIDED).rest();
        for (var30 = var27; module0050.NIL != var30; var30 = var30.rest()) {
            var28 = module0049.f3514(var28, module0049.f3507(var30.first(), var29.first()));
            var29 = var29.rest();
        }
        var28 = module0049.f3509(var28, var5.first());
        return var28;
    }
    
    public static SubLObject f3536(final SubLObject var11) {
        assert module0050.NIL != f3519(var11) : var11;
        final SubLObject var12 = f3522(var11);
        final SubLObject var13 = f3523(var11);
        SubLObject var14 = f3526(var11);
        SubLObject var15;
        SubLObject var16;
        SubLObject var17;
        SubLObject var18;
        SubLObject var19;
        SubLObject var20;
        for (var15 = Numbers.subtract(Numbers.min(var13, var12), (SubLObject)module0050.ONE_INTEGER), var16 = (SubLObject)module0050.NIL, var16 = (SubLObject)module0050.ZERO_INTEGER; var16.numL(var15); var16 = Numbers.add(var16, (SubLObject)module0050.ONE_INTEGER)) {
            var17 = var16;
            while (module0050.NIL != module0049.f3504((SubLObject)module0050.ZERO_INTEGER, f3527(var14, var17, var16))) {
                var17 = module0048.f_1X(var17);
                if (var17.numGE(var12)) {
                    return (SubLObject)module0050.NIL;
                }
            }
            if (var17.numG(var16)) {
                var14 = f3528(var14, var16, var17);
            }
            for (var18 = (SubLObject)module0050.NIL, var18 = Numbers.add(var16, (SubLObject)module0050.ONE_INTEGER); !var18.numGE(var12); var18 = Numbers.add(var18, (SubLObject)module0050.ONE_INTEGER)) {
                var19 = module0049.f3509(f3527(var14, var18, var16), f3527(var14, var16, var16));
                for (var20 = (SubLObject)module0050.NIL, var20 = (SubLObject)module0050.ZERO_INTEGER; var20.numL(var13); var20 = Numbers.add(var20, (SubLObject)module0050.ONE_INTEGER)) {
                    ConsesLow.set_nth(var20, ConsesLow.nth(var18, var14), module0049.f3514(f3527(var14, var18, var20), module0049.f3507(f3527(var14, var16, var20), var19)));
                }
            }
        }
        return var14;
    }
    
    public static SubLObject f3537() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0050", "f3519", "S#4924", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0050", "f3520", "S#4925", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0050", "f3521", "S#4926", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0050", "f3524", "S#4927", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0050", "f3525", "S#4928", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0050", "f3526", "S#4929", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0050", "f3522", "S#4930", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0050", "f3523", "S#4931", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0050", "f3527", "S#4932", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0050", "f3528", "S#4933", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0050", "f3530", "S#4934", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0050", "f3529", "S#4935", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0050", "f3531", "S#4936", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0050", "f3532", "S#4937", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0050", "f3535", "S#4938", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0050", "f3533", "S#4939", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0050", "f3534", "S#4940", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0050", "f3536", "S#4941", 1, 0, false);
        return (SubLObject)module0050.NIL;
    }
    
    public static SubLObject f3538() {
        return (SubLObject)module0050.NIL;
    }
    
    public static SubLObject f3539() {
        return (SubLObject)module0050.NIL;
    }
    
    public void declareFunctions() {
        f3537();
    }
    
    public void initializeVariables() {
        f3538();
    }
    
    public void runTopLevelForms() {
        f3539();
    }
    
    static {
        me = (SubLFile)new module0050();
        $ic0$ = SubLObjectFactory.makeSymbol("S#4925", "CYC");
        $ic1$ = SubLObjectFactory.makeString("~%");
        $ic2$ = SubLObjectFactory.makeString("| ");
        $ic3$ = SubLObjectFactory.makeString("   ");
        $ic4$ = SubLObjectFactory.makeString("|~%");
        $ic5$ = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic6$ = SubLObjectFactory.makeString("Row-index ~A is out of bounds");
        $ic7$ = SubLObjectFactory.makeString("Column-index ~A is out of bounds");
        $ic8$ = SubLObjectFactory.makeString("In method swap-rows: index ~A out of bounds");
        $ic9$ = SubLObjectFactory.makeSymbol("S#4924", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#4926", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0050.class
	Total time: 96 ms
	
	Decompiled with Procyon 0.5.32.
*/