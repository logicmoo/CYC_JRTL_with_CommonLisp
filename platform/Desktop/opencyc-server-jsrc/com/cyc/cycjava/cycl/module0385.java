package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0385 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0385";
    public static final String myFingerPrint = "95b5204e9071d977f1a6d36ed933f7f031345e84eec7ca14da81e763608c03be";
    private static final SubLString $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLString $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    
    public static SubLObject f27404(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)module0385.NIL;
        SubLObject var5 = (SubLObject)module0385.NIL;
        final SubLObject var6 = module0363.f24514(var1);
        final SubLObject var7 = module0034.$g879$.currentBinding(var3);
        try {
            module0034.$g879$.bind(var6, var3);
            SubLObject var8 = (SubLObject)module0385.NIL;
            if (module0385.NIL != var6 && module0385.NIL == module0034.f1842(var6)) {
                var8 = module0034.f1869(var6);
                final SubLObject var9 = Threads.current_process();
                if (module0385.NIL == var8) {
                    module0034.f1873(var6, var9);
                }
                else if (!var8.eql(var9)) {
                    Errors.error((SubLObject)module0385.$ic0$);
                }
            }
            try {
                var3.resetMultipleValues();
                final SubLObject var10_11 = f27405(var1, var2);
                final SubLObject var12_13 = var3.secondMultipleValue();
                var3.resetMultipleValues();
                var4 = var10_11;
                var5 = var12_13;
            }
            finally {
                final SubLObject var7_14 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0385.T, var3);
                    if (module0385.NIL != var6 && module0385.NIL == var8) {
                        module0034.f1873(var6, (SubLObject)module0385.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var7_14, var3);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var7, var3);
        }
        return Values.values(var4, var5);
    }
    
    public static SubLObject f27406(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0361.f24117(module0363.f24507(var1));
        final SubLObject var5 = module0034.$g879$.currentBinding(var3);
        try {
            module0034.$g879$.bind(var4, var3);
            SubLObject var6 = (SubLObject)module0385.NIL;
            if (module0385.NIL != var4 && module0385.NIL == module0034.f1842(var4)) {
                var6 = module0034.f1869(var4);
                final SubLObject var7 = Threads.current_process();
                if (module0385.NIL == var6) {
                    module0034.f1873(var4, var7);
                }
                else if (!var6.eql(var7)) {
                    Errors.error((SubLObject)module0385.$ic0$);
                }
            }
            try {
                return f27407(var1, var2);
            }
            finally {
                final SubLObject var7_15 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0385.T, var3);
                    if (module0385.NIL != var4 && module0385.NIL == var6) {
                        module0034.f1873(var4, (SubLObject)module0385.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var7_15, var3);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var5, var3);
        }
    }
    
    public static SubLObject f27405(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0034.$g879$.getDynamicValue(var3);
        SubLObject var5 = (SubLObject)module0385.NIL;
        if (module0385.NIL == var4) {
            return f27406(var1, var2);
        }
        var5 = module0034.f1857(var4, (SubLObject)module0385.$ic1$, (SubLObject)module0385.UNPROVIDED);
        if (module0385.NIL == var5) {
            var5 = module0034.f1807(module0034.f1842(var4), (SubLObject)module0385.$ic1$, (SubLObject)module0385.TWO_INTEGER, (SubLObject)module0385.NIL, (SubLObject)module0385.EQ, (SubLObject)module0385.UNPROVIDED);
            module0034.f1860(var4, (SubLObject)module0385.$ic1$, var5);
        }
        final SubLObject var6 = module0034.f1782(var1, var2);
        final SubLObject var7 = module0034.f1814(var5, var6, (SubLObject)module0385.UNPROVIDED);
        if (var7 != module0385.$ic3$) {
            SubLObject var8 = var7;
            SubLObject var9 = (SubLObject)module0385.NIL;
            var9 = var8.first();
            while (module0385.NIL != var8) {
                SubLObject var10 = var9.first();
                final SubLObject var11 = conses_high.second(var9);
                if (var1.eql(var10.first())) {
                    var10 = var10.rest();
                    if (module0385.NIL != var10 && module0385.NIL == var10.rest() && var2.eql(var10.first())) {
                        return module0034.f1959(var11);
                    }
                }
                var8 = var8.rest();
                var9 = var8.first();
            }
        }
        final SubLObject var12 = Values.arg2(var3.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f27406(var1, var2)));
        module0034.f1836(var5, var6, var7, var12, (SubLObject)ConsesLow.list(var1, var2));
        return module0034.f1959(var12);
    }
    
    public static SubLObject f27407(final SubLObject var1, SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0385.NIL != module0391.f27795(var2)) {
            final SubLObject var4 = module0391.f27898(var2, var1);
            if (module0385.NIL != var4) {
                var2 = var4;
            }
            else {
                var2 = (SubLObject)module0385.$ic4$;
            }
        }
        if (module0385.NIL != module0390.f27709(var2)) {
            var2 = module0390.f27718(var2);
        }
        final SubLObject var5 = module0363.f24643(var1, (SubLObject)module0385.UNPROVIDED);
        SubLObject var7;
        final SubLObject var6 = var7 = module0360.f23935(var5);
        SubLObject var8 = var1;
        SubLObject var10;
        final SubLObject var9 = var10 = f27408(var1, var2);
        SubLObject var11 = (SubLObject)module0385.NIL;
        var11 = var10.first();
        while (module0385.NIL != var10) {
            var3.resetMultipleValues();
            final SubLObject var12 = f27409(var11, var2);
            final SubLObject var13 = var3.secondMultipleValue();
            var3.resetMultipleValues();
            if (module0385.NIL != module0360.f23942(var12, var7)) {
                var7 = var12;
                var8 = var13;
            }
            var10 = var10.rest();
            var11 = var10.first();
        }
        return Values.values(var7, var8);
    }
    
    public static SubLObject f27409(final SubLObject var29, final SubLObject var2) {
        final SubLThread var30 = SubLProcess.currentSubLThread();
        if (module0385.NIL != module0376.f26618(var29) || module0385.NIL != module0379.f26934(var29)) {
            return Values.values(module0365.f24870(var29), var29);
        }
        if (module0385.NIL != module0373.f26165(var29)) {
            final SubLObject var31 = module0373.f26168(var29);
            return f27407(var31, var2);
        }
        if (module0385.NIL != module0382.f27206(var29)) {
            var30.resetMultipleValues();
            final SubLObject var32 = module0382.f27211(var29);
            final SubLObject var33 = var30.secondMultipleValue();
            var30.resetMultipleValues();
            var30.resetMultipleValues();
            final SubLObject var34 = f27407(var32, var2);
            final SubLObject var35 = var30.secondMultipleValue();
            var30.resetMultipleValues();
            var30.resetMultipleValues();
            final SubLObject var36 = f27407(var33, var2);
            final SubLObject var37 = var30.secondMultipleValue();
            var30.resetMultipleValues();
            if (module0385.NIL != module0360.f23942(var36, var34)) {
                return Values.values(var36, var37);
            }
            return Values.values(var34, var35);
        }
        else {
            if (module0385.NIL != module0380.f26995(var29)) {
                return Values.values((SubLObject)module0385.ZERO_INTEGER, var29);
            }
            return Errors.error((SubLObject)module0385.$ic5$, var29);
        }
    }
    
    public static SubLObject f27408(final SubLObject var1, final SubLObject var2) {
        module0373.f26191(var1, var2);
        if (module0385.$ic4$ == var2) {
            return f27410(var1);
        }
        return f27411(var2, var1);
    }
    
    public static SubLObject f27411(final SubLObject var39, final SubLObject var1) {
        return module0367.f25109(var39, (SubLObject)module0385.$ic6$, var1, (SubLObject)module0385.UNPROVIDED, (SubLObject)module0385.UNPROVIDED, (SubLObject)module0385.UNPROVIDED, (SubLObject)module0385.UNPROVIDED);
    }
    
    public static SubLObject f27410(final SubLObject var1) {
        SubLObject var2 = (SubLObject)module0385.NIL;
        SubLObject var3 = module0363.f24517(var1);
        SubLObject var4 = (SubLObject)module0385.NIL;
        var4 = var3.first();
        while (module0385.NIL != var3) {
            if (module0385.NIL != module0363.f24524(var4, (SubLObject)module0385.$ic7$)) {
                var2 = (SubLObject)ConsesLow.cons(var4, var2);
            }
            var3 = var3.rest();
            var4 = var3.first();
        }
        return var2;
    }
    
    public static SubLObject f27412() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0385", "f27404", "S#30111", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0385", "f27406", "S#30499", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0385", "f27405", "S#30500", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0385", "f27407", "S#30501", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0385", "f27409", "S#30502", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0385", "f27408", "S#30503", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0385", "f27411", "S#30504", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0385", "f27410", "S#30505", 1, 0, false);
        return (SubLObject)module0385.NIL;
    }
    
    public static SubLObject f27413() {
        return (SubLObject)module0385.NIL;
    }
    
    public static SubLObject f27414() {
        module0034.f1895((SubLObject)module0385.$ic1$);
        return (SubLObject)module0385.NIL;
    }
    
    public void declareFunctions() {
        f27412();
    }
    
    public void initializeVariables() {
        f27413();
    }
    
    public void runTopLevelForms() {
        f27414();
    }
    
    static {
        me = (SubLFile)new module0385();
        $ic0$ = SubLObjectFactory.makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic1$ = SubLObjectFactory.makeSymbol("S#30500", "CYC");
        $ic2$ = SubLObjectFactory.makeSymbol("S#5859", "CYC");
        $ic3$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic4$ = SubLObjectFactory.makeKeyword("TACTICAL");
        $ic5$ = SubLObjectFactory.makeString("Unexpected removal-relevant tactic ~S");
        $ic6$ = SubLObjectFactory.makeKeyword("RELEVANT-TACTICS-WRT-REMOVAL");
        $ic7$ = SubLObjectFactory.makeKeyword("REMOVAL");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0385.class
	Total time: 124 ms
	
	Decompiled with Procyon 0.5.32.
*/