package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0591 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0591";
    public static final String myFingerPrint = "4f18a601af2ce50d874e59b41aec229258660130dc9777a97ce22fa89c571a25";
    private static SubLSymbol $g4505$;
    private static final SubLInteger $ic0$;
    private static final SubLString $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLString $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLInteger $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLString $ic8$;
    
    
    public static SubLObject f36104(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == module0591.UNPROVIDED) {
            var3 = (SubLObject)module0591.$ic0$;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        var4.resetMultipleValues();
        SubLObject var5 = module0590.f36051(var1, var2, (SubLObject)module0591.$ic1$, (SubLObject)module0591.$ic2$, var3, (SubLObject)module0591.UNPROVIDED, (SubLObject)module0591.UNPROVIDED, (SubLObject)module0591.UNPROVIDED, (SubLObject)module0591.UNPROVIDED, (SubLObject)module0591.UNPROVIDED, (SubLObject)module0591.UNPROVIDED);
        final SubLObject var6 = var4.secondMultipleValue();
        final SubLObject var7 = var4.thirdMultipleValue();
        var4.resetMultipleValues();
        if (module0591.NIL != module0038.f2653(var7)) {
            Errors.error(var7);
        }
        else if (module0591.NIL != var6) {
            Errors.warn((SubLObject)module0591.$ic3$, var2, var1, var6);
        }
        while (module0591.NIL == module0035.f2012(var5) && module0591.NIL == module0590.f36040(var5.first())) {
            var5 = var5.rest();
        }
        return module0590.f36086(var5);
    }
    
    public static SubLObject f36105(final SubLObject var1, final SubLObject var2, final SubLObject var8, SubLObject var9, SubLObject var3, SubLObject var10) {
        if (var9 == module0591.UNPROVIDED) {
            var9 = (SubLObject)module0591.NIL;
        }
        if (var3 == module0591.UNPROVIDED) {
            var3 = (SubLObject)module0591.$ic0$;
        }
        if (var10 == module0591.UNPROVIDED) {
            var10 = (SubLObject)module0591.T;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        if (module0591.NIL != var9 && !module0591.areAssertionsDisabledFor(me) && module0591.NIL == module0004.f106(var9)) {
            throw new AssertionError(var9);
        }
        if (!module0591.ZERO_INTEGER.eql(var9)) {
            var11.resetMultipleValues();
            final SubLObject var12 = f36106(var1, var2, var3, var8);
            final SubLObject var13 = var11.secondMultipleValue();
            var11.resetMultipleValues();
            if (module0591.NIL != var13 && (module0591.NIL == var9 || Numbers.subtract(Time.get_universal_time(), var13).numL(var9))) {
                return var12;
            }
        }
        final SubLObject var14 = f36104(var1, var2, var3);
        if (module0591.NIL != var10) {
            f36107(var1, var2, var3, var14);
            return Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)module0591.ZERO_INTEGER), f36106(var1, var2, var3, var8));
        }
        return module0590.f36090(var8, var14);
    }
    
    public static SubLObject f36107(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var13) {
        final SubLObject var14 = f36108(var1, var3);
        SubLObject var15 = module0089.f6077(module0591.$g4505$.getGlobalValue(), var14);
        if (module0591.NIL == module0089.f6045(var15)) {
            var15 = module0089.f6070((SubLObject)module0591.$ic5$, Symbols.symbol_function((SubLObject)module0591.EQUAL));
            module0089.f6082(module0591.$g4505$.getGlobalValue(), var14, var15);
        }
        SubLObject var16 = module0089.f6077(var15, var2);
        if (module0591.NIL == module0079.f5404(var16)) {
            var16 = module0067.f4880(Symbols.symbol_function((SubLObject)module0591.EQUAL), Sequences.length(var13));
            module0089.f6082(var15, var2, var16);
        }
        module0079.f5420(var16);
        module0079.f5412(var16, (SubLObject)module0591.$ic6$, Time.get_universal_time());
        SubLObject var17 = var13.rest();
        SubLObject var18 = (SubLObject)module0591.NIL;
        var18 = var17.first();
        while (module0591.NIL != var17) {
            final SubLObject var19 = var18.first().first();
            final SubLObject var20 = conses_high.second(var18);
            module0079.f5412(var16, var19, var20);
            var17 = var17.rest();
            var18 = var17.first();
        }
        return (SubLObject)module0591.NIL;
    }
    
    public static SubLObject f36106(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        final SubLObject var10 = f36108(var1, var3);
        final SubLObject var11 = module0089.f6077(module0591.$g4505$.getGlobalValue(), var10);
        if (module0591.NIL != module0089.f6045(var11)) {
            final SubLObject var12 = module0089.f6077(var11, var2);
            if (module0591.NIL != module0079.f5404(var12)) {
                var9.resetMultipleValues();
                final SubLObject var13 = module0079.f5414(var12, var8, (SubLObject)module0591.UNPROVIDED);
                final SubLObject var14 = var9.secondMultipleValue();
                var9.resetMultipleValues();
                if (module0591.NIL != var14) {
                    return Values.values(var13, module0079.f5414(var12, (SubLObject)module0591.$ic6$, (SubLObject)module0591.UNPROVIDED));
                }
            }
        }
        return Values.values((SubLObject)module0591.NIL, (SubLObject)module0591.NIL);
    }
    
    public static SubLObject f36108(final SubLObject var1, final SubLObject var3) {
        if (var3.eql((SubLObject)module0591.$ic0$) || var3.eql((SubLObject)module0591.$ic7$)) {
            return var1;
        }
        return Sequences.cconcatenate(module0006.f203(var1), new SubLObject[] { module0591.$ic8$, module0006.f203(var3) });
    }
    
    public static SubLObject f36109() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0591", "f36104", "S#39896", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0591", "f36105", "S#39897", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0591", "f36107", "S#39898", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0591", "f36106", "S#39899", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0591", "f36108", "S#39900", 2, 0, false);
        return (SubLObject)module0591.NIL;
    }
    
    public static SubLObject f36110() {
        module0591.$g4505$ = SubLFiles.deflexical("S#39901", module0089.f6070((SubLObject)module0591.SIXTEEN_INTEGER, Symbols.symbol_function((SubLObject)module0591.EQUAL)));
        return (SubLObject)module0591.NIL;
    }
    
    public static SubLObject f36111() {
        return (SubLObject)module0591.NIL;
    }
    
    public void declareFunctions() {
        f36109();
    }
    
    public void initializeVariables() {
        f36110();
    }
    
    public void runTopLevelForms() {
        f36111();
    }
    
    static {
        me = (SubLFile)new module0591();
        module0591.$g4505$ = null;
        $ic0$ = SubLObjectFactory.makeInteger(80);
        $ic1$ = SubLObjectFactory.makeString("");
        $ic2$ = SubLObjectFactory.makeKeyword("GET");
        $ic3$ = SubLObjectFactory.makeString("Timed out getting ~S from ~S: Reason: ~S");
        $ic4$ = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic5$ = SubLObjectFactory.makeInteger(128);
        $ic6$ = SubLObjectFactory.makeKeyword("CACHE-TIME");
        $ic7$ = SubLObjectFactory.makeKeyword("DEFAULT");
        $ic8$ = SubLObjectFactory.makeString(":");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0591.class
	Total time: 80 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/