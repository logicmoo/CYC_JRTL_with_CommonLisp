package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0247 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0247";
    public static final String myFingerPrint = "8aa4117758636a57f4773a106e5bed23d28a6c54e8e7d17e54daf783bf038100";
    private static final SubLString $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLList $ic3$;
    
    public static SubLObject f15902(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0242.f15664(var1, var2);
        if (NIL != var4) {
            SubLObject var5 = module0244.f15784(var2);
            SubLObject var6 = (SubLObject)NIL;
            var6 = var5.first();
            while (NIL != var5) {
                final SubLObject var7 = module0245.f15834(var4, var6, var2);
                if (NIL != var7) {
                    SubLObject var8;
                    for (var8 = module0066.f4838(module0067.f4891(var7)); NIL == module0066.f4841(var8); var8 = module0066.f4840(var8)) {
                        var3.resetMultipleValues();
                        final SubLObject var9 = module0066.f4839(var8);
                        final SubLObject var10 = var3.secondMultipleValue();
                        var3.resetMultipleValues();
                        SubLObject var8_11;
                        for (var8_11 = module0066.f4838(module0067.f4891(var10)); NIL == module0066.f4841(var8_11); var8_11 = module0066.f4840(var8_11)) {
                            var3.resetMultipleValues();
                            final SubLObject var11 = module0066.f4839(var8_11);
                            final SubLObject var12 = var3.secondMultipleValue();
                            var3.resetMultipleValues();
                            PrintLow.format((SubLObject)T, (SubLObject)$ic0$, new SubLObject[] { var6, var9, var11, var12 });
                        }
                        module0066.f4842(var8_11);
                    }
                    module0066.f4842(var8);
                }
                var5 = var5.rest();
                var6 = var5.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15903(final SubLObject var12, final SubLObject var14) {
        return module0077.f5317(module0245.f15852(var14, var12));
    }
    
    public static SubLObject f15904(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        SubLObject var16 = (SubLObject)T;
        SubLObject var17;
        SubLObject var18;
        for (var17 = (SubLObject)NIL, var18 = module0066.f4838(module0067.f4891(var14)); NIL == var17 && NIL == module0066.f4841(var18); var18 = module0066.f4840(var18)) {
            var15.resetMultipleValues();
            final SubLObject var19 = module0066.f4839(var18);
            final SubLObject var20 = var15.secondMultipleValue();
            var15.resetMultipleValues();
            if (NIL != var20) {
                var17 = (SubLObject)T;
                var16 = (SubLObject)NIL;
            }
        }
        module0066.f4842(var18);
        return var16;
    }
    
    public static SubLObject f15905(final SubLObject var9, final SubLObject var18) {
        final SubLObject var19 = module0245.f15844(var18, var9);
        if (NIL != var19) {
            return f15904(var19);
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f15906(final SubLObject var18) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        SubLObject var20 = (SubLObject)T;
        SubLObject var21;
        SubLObject var22;
        for (var21 = (SubLObject)NIL, var22 = module0066.f4838(module0067.f4891(var18)); NIL == var21 && NIL == module0066.f4841(var22); var22 = module0066.f4840(var22)) {
            var19.resetMultipleValues();
            final SubLObject var23 = module0066.f4839(var22);
            final SubLObject var24 = var19.secondMultipleValue();
            var19.resetMultipleValues();
            if (NIL == f15904(var24)) {
                var21 = (SubLObject)T;
                var20 = (SubLObject)NIL;
            }
        }
        module0066.f4842(var22);
        return var20;
    }
    
    public static SubLObject f15907(final SubLObject var6, final SubLObject var19) {
        final SubLObject var20 = module0245.f15834(var19, var6, module0137.f8955((SubLObject)UNPROVIDED));
        if (NIL != var20) {
            return f15906(var20);
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f15908(final SubLObject var1, final SubLObject var2) {
        assert NIL != module0137.f8885(var2) : var2;
        SubLObject var3 = (SubLObject)T;
        SubLObject var4 = (SubLObject)NIL;
        final SubLObject var5 = module0242.f15664(var1, var2);
        if (NIL != var5) {
            SubLObject var6;
            SubLObject var7;
            SubLObject var8;
            for (var6 = (SubLObject)NIL, var6 = module0244.f15784(var2); NIL == var4 && NIL != var6; var6 = var6.rest()) {
                var7 = var6.first();
                var8 = module0245.f15834(var5, var7, var2);
                if (NIL != var8 && NIL == f15906(var8)) {
                    var4 = (SubLObject)T;
                    var3 = (SubLObject)NIL;
                }
            }
        }
        return var3;
    }
    
    public static SubLObject f15909(final SubLObject var1, final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = module0242.f15664(var1, var2);
        if (NIL != var4) {
            SubLObject var5;
            SubLObject var6;
            SubLObject var7;
            for (var5 = (SubLObject)NIL, var5 = module0244.f15784(var2); NIL == var3 && NIL != var5; var5 = var5.rest()) {
                var6 = var5.first();
                var7 = module0245.f15834(var4, var6, var2);
                if (NIL != var7 && NIL == module0245.f15840(var7)) {
                    var3 = (SubLObject)T;
                }
            }
        }
        return (SubLObject)makeBoolean(NIL == var3);
    }
    
    public static SubLObject f15910(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var5 = (SubLObject)NIL;
        final SubLObject var6 = module0096.$g1262$.currentBinding(var3);
        final SubLObject var7 = module0021.$g777$.currentBinding(var3);
        try {
            module0096.$g1262$.bind(module0242.$g2454$.getGlobalValue(), var3);
            module0021.$g777$.bind((SubLObject)NIL, var3);
            module0021.f1151(module0107.f7590());
            final SubLObject var8 = module0244.f15766(var2);
            SubLObject var9 = (SubLObject)NIL;
            final SubLObject var10 = module0079.f5424(var8);
            SubLObject var13;
            for (SubLObject var11 = (SubLObject)NIL; NIL == var11; var11 = (SubLObject)makeBoolean(NIL == var13)) {
                var3.resetMultipleValues();
                final SubLObject var12 = module0052.f3693(var10);
                var13 = var3.secondMultipleValue();
                var3.resetMultipleValues();
                if (NIL != var13) {
                    SubLObject var15;
                    final SubLObject var14 = var15 = var12;
                    SubLObject var16 = (SubLObject)NIL;
                    SubLObject var17 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)$ic2$);
                    var16 = var15.first();
                    var15 = var15.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)$ic2$);
                    var17 = var15.first();
                    var15 = var15.rest();
                    if (NIL == var15) {
                        if (NIL == module0096.f6883(var17) || NIL == module0096.f6910(var17)) {
                            var9 = module0096.f6925(var8, module0242.$g2449$.getGlobalValue(), (SubLObject)NIL, var16, (SubLObject)UNPROVIDED);
                            if (NIL == f15909(var16, var2)) {
                                var5 = (SubLObject)T;
                                module0067.f4886(var4, var16, var9);
                            }
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var14, (SubLObject)$ic2$);
                    }
                }
            }
        }
        finally {
            module0021.$g777$.rebind(var7, var3);
            module0096.$g1262$.rebind(var6, var3);
        }
        if (NIL != var5) {
            return Values.values((SubLObject)NIL, var4);
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f15911(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        SubLObject var3 = module0137.f8931();
        SubLObject var4 = (SubLObject)NIL;
        var4 = var3.first();
        while (NIL != var3) {
            SubLObject var6;
            final SubLObject var5 = var6 = var4;
            SubLObject var7 = (SubLObject)NIL;
            SubLObject var8 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic3$);
            var7 = var6.first();
            var6 = (var8 = var6.rest());
            if (NIL == f15909(var1, var8)) {
                var2 = (SubLObject)ConsesLow.cons(var8, var2);
            }
            var3 = var3.rest();
            var4 = var3.first();
        }
        if (NIL != var2) {
            return var2;
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f15912() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = module0137.f8931();
        SubLObject var7 = (SubLObject)NIL;
        var7 = var6.first();
        while (NIL != var6) {
            SubLObject var9;
            final SubLObject var8 = var9 = var7;
            SubLObject var10 = (SubLObject)NIL;
            SubLObject var11 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic3$);
            var10 = var9.first();
            var9 = (var11 = var9.rest());
            var3.resetMultipleValues();
            final SubLObject var12 = f15910(var11);
            final SubLObject var13 = var3.secondMultipleValue();
            var3.resetMultipleValues();
            if (NIL == var12) {
                var5 = (SubLObject)T;
                module0067.f4886(var4, var11, var13);
            }
            var6 = var6.rest();
            var7 = var6.first();
        }
        if (NIL != var5) {
            return Values.values((SubLObject)NIL, var4);
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f15913() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0247", "f15902", "S#18645", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0247", "f15903", "S#18646", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0247", "f15904", "S#18647", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0247", "f15905", "S#18648", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0247", "f15906", "S#18649", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0247", "f15907", "S#18650", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0247", "f15908", "S#18651", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0247", "f15909", "S#18652", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0247", "f15910", "S#18653", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0247", "f15911", "VALID-SBHL-LINKS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0247", "f15912", "S#18654", 0, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15914() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15915() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f15913();
    }
    
    public void initializeVariables() {
        f15914();
    }
    
    public void runTopLevelForms() {
        f15915();
    }
    
    static {
        me = (SubLFile)new module0247();
        $ic0$ = makeString("Direction ~a, Mt ~a, Tv ~a: ~a~%");
        $ic1$ = makeSymbol("S#11099", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)makeSymbol("S#9182", "CYC"), (SubLObject)makeUninternedSymbol("US#102D8BE"));
        $ic3$ = (SubLList)ConsesLow.cons((SubLObject)makeUninternedSymbol("US#3165895"), (SubLObject)makeSymbol("S#205", "CYC"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 101 ms
	
	Decompiled with Procyon 0.5.32.
*/