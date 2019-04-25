package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0550 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0550";
    public static final String myFingerPrint = "7fce423eaab815f10c5d8eb98d97c268c0dbebe3e0714ec2761e0d5e064995e8";
    private static SubLSymbol $g3990$;
    private static SubLSymbol $g3991$;
    private static final SubLObject $ic0$;
    private static final SubLObject $ic1$;
    private static final SubLObject $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLFloat $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLObject $ic6$;
    private static final SubLInteger $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLInteger $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    
    public static SubLObject f33964(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == module0550.UNPROVIDED) {
            var3 = (SubLObject)module0550.NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        var4.resetMultipleValues();
        final SubLObject var5 = f33965(var1, var2, var3);
        final SubLObject var6 = var4.secondMultipleValue();
        var4.resetMultipleValues();
        final SubLObject var7 = var6;
        if (var7.eql(module0550.$ic0$)) {
            return module0549.f33895(var5);
        }
        if (var7.eql(module0550.$ic1$)) {
            return module0549.f33901(var5);
        }
        return module0549.f33895(module0550.$ic2$);
    }
    
    public static SubLObject f33966(final SubLObject var1) {
        if (module0550.NIL == module0173.f10955(var1)) {
            return (SubLObject)module0550.ZERO_INTEGER;
        }
        return f33967(var1);
    }
    
    public static SubLObject f33968() {
        final SubLObject var8 = module0550.$g3990$.getGlobalValue();
        if (module0550.NIL != var8) {
            module0034.f1818(var8);
        }
        return (SubLObject)module0550.NIL;
    }
    
    public static SubLObject f33969(final SubLObject var1) {
        return module0034.f1829(module0550.$g3990$.getGlobalValue(), (SubLObject)ConsesLow.list(var1), (SubLObject)module0550.UNPROVIDED, (SubLObject)module0550.UNPROVIDED);
    }
    
    public static SubLObject f33970(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0550.$ic4$;
        final SubLObject var4 = module0147.$g2094$.currentBinding(var2);
        final SubLObject var5 = module0147.$g2095$.currentBinding(var2);
        try {
            module0147.$g2094$.bind((SubLObject)module0550.$ic5$, var2);
            module0147.$g2095$.bind(module0550.$ic6$, var2);
            final SubLObject var6 = module0225.f14762(var1);
            if (module0550.NIL != var6) {
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var7 = (SubLObject)module0550.NIL, var7 = (SubLObject)module0550.ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)module0550.ONE_INTEGER)) {
                    var8 = Numbers.add(var7, (SubLObject)module0550.ONE_INTEGER);
                    var9 = f33964(var1, var8, (SubLObject)module0550.NIL);
                    var3 = Numbers.multiply(var3, var9);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var5, var2);
            module0147.$g2094$.rebind(var4, var2);
        }
        if (!var3.isPositive()) {
            return (SubLObject)module0550.ZERO_INTEGER;
        }
        return Values.values(Numbers.truncate(Numbers.multiply((SubLObject)module0550.$ic7$, Numbers.log(var3, (SubLObject)module0550.TWO_INTEGER)), (SubLObject)module0550.UNPROVIDED));
    }
    
    public static SubLObject f33967(final SubLObject var1) {
        SubLObject var2 = module0550.$g3990$.getGlobalValue();
        if (module0550.NIL == var2) {
            var2 = module0034.f1934((SubLObject)module0550.$ic3$, (SubLObject)module0550.$ic8$, (SubLObject)module0550.NIL, (SubLObject)module0550.EQL, (SubLObject)module0550.ONE_INTEGER, (SubLObject)module0550.$ic9$);
        }
        SubLObject var3 = module0034.f1814(var2, var1, (SubLObject)module0550.$ic10$);
        if (var3 == module0550.$ic10$) {
            var3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f33970(var1)));
            module0034.f1816(var2, var1, var3, (SubLObject)module0550.UNPROVIDED);
        }
        return module0034.f1959(var3);
    }
    
    public static SubLObject f33971() {
        final SubLObject var8 = module0550.$g3991$.getGlobalValue();
        if (module0550.NIL != var8) {
            module0034.f1818(var8);
        }
        return (SubLObject)module0550.NIL;
    }
    
    public static SubLObject f33972(final SubLObject var1) {
        return module0034.f1829(module0550.$g3991$.getGlobalValue(), (SubLObject)ConsesLow.list(var1), (SubLObject)module0550.UNPROVIDED, (SubLObject)module0550.UNPROVIDED);
    }
    
    public static SubLObject f33973(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = Numbers.$most_positive_fixnum$.getGlobalValue();
        SubLObject var4 = (SubLObject)module0550.ZERO_INTEGER;
        final SubLObject var5 = module0147.$g2094$.currentBinding(var2);
        final SubLObject var6 = module0147.$g2095$.currentBinding(var2);
        try {
            module0147.$g2094$.bind((SubLObject)module0550.$ic5$, var2);
            module0147.$g2095$.bind(module0550.$ic6$, var2);
            final SubLObject var7 = module0225.f14762(var1);
            if (module0550.NIL != var7) {
                SubLObject var8;
                SubLObject var9;
                SubLObject var10;
                for (var8 = (SubLObject)module0550.NIL, var8 = (SubLObject)module0550.ZERO_INTEGER; var8.numL(var7); var8 = Numbers.add(var8, (SubLObject)module0550.ONE_INTEGER)) {
                    var9 = Numbers.add(var8, (SubLObject)module0550.ONE_INTEGER);
                    var10 = f33964(var1, var9, (SubLObject)module0550.NIL);
                    if (var10.numL(var3)) {
                        var3 = var10;
                        var4 = var9;
                    }
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var6, var2);
            module0147.$g2094$.rebind(var5, var2);
        }
        return var4;
    }
    
    public static SubLObject f33974(final SubLObject var1) {
        SubLObject var2 = module0550.$g3991$.getGlobalValue();
        if (module0550.NIL == var2) {
            var2 = module0034.f1934((SubLObject)module0550.$ic11$, (SubLObject)module0550.$ic12$, (SubLObject)module0550.NIL, (SubLObject)module0550.EQL, (SubLObject)module0550.ONE_INTEGER, (SubLObject)module0550.TEN_INTEGER);
        }
        SubLObject var3 = module0034.f1814(var2, var1, (SubLObject)module0550.$ic10$);
        if (var3 == module0550.$ic10$) {
            var3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f33973(var1)));
            module0034.f1816(var2, var1, var3, (SubLObject)module0550.UNPROVIDED);
        }
        return module0034.f1959(var3);
    }
    
    public static SubLObject f33965(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == module0550.UNPROVIDED) {
            var3 = (SubLObject)module0550.NIL;
        }
        SubLObject var4 = module0550.$ic2$;
        SubLObject var5 = module0550.$ic0$;
        SubLObject var6 = module0549.f33895(var4);
        SubLObject var8;
        SubLObject var7 = var8 = module0226.f14917(var1, var2, var3);
        SubLObject var9 = (SubLObject)module0550.NIL;
        var9 = var8.first();
        while (module0550.NIL != var8) {
            final SubLObject var10 = module0549.f33895(var9);
            if (var10.numL(var6)) {
                var4 = var9;
                var5 = module0550.$ic0$;
                var6 = var10;
            }
            var8 = var8.rest();
            var9 = var8.first();
        }
        var7 = (var8 = module0226.f14949(var1, var2, var3));
        var9 = (SubLObject)module0550.NIL;
        var9 = var8.first();
        while (module0550.NIL != var8) {
            final SubLObject var10 = module0549.f33901(var9);
            if (var10.numL(var6)) {
                var4 = var9;
                var5 = module0550.$ic1$;
                var6 = var10;
            }
            var8 = var8.rest();
            var9 = var8.first();
        }
        return Values.values(var4, var5);
    }
    
    public static SubLObject f33975(final SubLObject var26, final SubLObject var27) {
        return Numbers.numL(f33966(var26), f33966(var27));
    }
    
    public static SubLObject f33976() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0550", "f33964", "S#37345", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0550", "f33966", "S#23702", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0550", "f33968", "S#37346", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0550", "f33969", "S#37347", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0550", "f33970", "S#37348", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0550", "f33967", "S#37349", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0550", "f33971", "S#37350", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0550", "f33972", "S#37351", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0550", "f33973", "S#37352", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0550", "f33974", "S#37353", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0550", "f33965", "S#37354", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0550", "f33975", "S#37355", 2, 0, false);
        return (SubLObject)module0550.NIL;
    }
    
    public static SubLObject f33977() {
        module0550.$g3990$ = SubLFiles.deflexical("S#37356", (SubLObject)module0550.NIL);
        module0550.$g3991$ = SubLFiles.deflexical("S#37357", (SubLObject)module0550.NIL);
        return (SubLObject)module0550.NIL;
    }
    
    public static SubLObject f33978() {
        module0034.f1909((SubLObject)module0550.$ic3$);
        module0034.f1909((SubLObject)module0550.$ic11$);
        return (SubLObject)module0550.NIL;
    }
    
    public void declareFunctions() {
        f33976();
    }
    
    public void initializeVariables() {
        f33977();
    }
    
    public void runTopLevelForms() {
        f33978();
    }
    
    static {
        me = (SubLFile)new module0550();
        module0550.$g3990$ = null;
        module0550.$g3991$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("argIsa"));
        $ic1$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("argGenl"));
        $ic2$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Thing"));
        $ic3$ = SubLObjectFactory.makeSymbol("S#37349", "CYC");
        $ic4$ = (SubLFloat)SubLObjectFactory.makeDouble(1.0);
        $ic5$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic6$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic7$ = SubLObjectFactory.makeInteger(1000);
        $ic8$ = SubLObjectFactory.makeSymbol("S#37356", "CYC");
        $ic9$ = SubLObjectFactory.makeInteger(100);
        $ic10$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic11$ = SubLObjectFactory.makeSymbol("S#37353", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#37357", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0550.class
	Total time: 81 ms
	
	Decompiled with Procyon 0.5.32.
*/