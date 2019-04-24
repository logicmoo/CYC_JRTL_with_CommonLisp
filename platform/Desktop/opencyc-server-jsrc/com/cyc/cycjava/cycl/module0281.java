package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0281 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0281";
    public static final String myFingerPrint = "0e3dd0b5cb17997b8d3f346f16db2abb487e496707cc87323ea4f97fa655d943";
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    
    public static SubLObject f18657(final SubLObject var1, final SubLObject var2) {
        return f18658(var1, var2);
    }
    
    public static SubLObject f18658(SubLObject var1, final SubLObject var2) {
        if (module0281.NIL == module0035.f2439((SubLObject)module0281.$ic0$, module0205.f13377(var1, (SubLObject)module0281.UNPROVIDED), (SubLObject)module0281.UNPROVIDED)) {
            return Values.values(var1, var2);
        }
        if (module0281.NIL != module0202.f12595(var1)) {
            SubLObject var3 = (SubLObject)module0281.NIL;
            SubLObject var5;
            final SubLObject var4 = var5 = module0205.f13207(var1, (SubLObject)module0281.$ic1$);
            SubLObject var6 = (SubLObject)module0281.NIL;
            var6 = var5.first();
            while (module0281.NIL != var5) {
                var3 = (SubLObject)ConsesLow.cons(f18659(var6, var2), var3);
                var5 = var5.rest();
                var6 = var5.first();
            }
            var1 = module0202.f12773(Sequences.nreverse(var3));
        }
        else if (module0281.NIL != module0202.f12594(var1)) {
            var1 = f18659(var1, var2);
        }
        return Values.values(var1, var2);
    }
    
    public static SubLObject f18659(SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0281.NIL != module0202.f12594(var1)) {
            SubLObject var4 = (SubLObject)module0281.NIL;
            SubLObject var5 = (SubLObject)module0281.NIL;
            SubLObject var7;
            final SubLObject var6 = var7 = module0205.f13207(var1, (SubLObject)module0281.$ic1$);
            SubLObject var8 = (SubLObject)module0281.NIL;
            var8 = var7.first();
            while (module0281.NIL != var7) {
                if (module0281.NIL != module0202.f12592(var8) && module0281.NIL != module0202.f12653(module0205.f13379(var8, (SubLObject)module0281.UNPROVIDED))) {
                    final SubLObject var9 = module0205.f13379(module0205.f13379(var8, (SubLObject)module0281.UNPROVIDED), (SubLObject)module0281.UNPROVIDED);
                    var5 = module0285.f18906(var9, (SubLObject)module0281.UNPROVIDED);
                    if (module0281.NIL == module0035.f1997(var5)) {
                        if (module0281.NIL != module0151.f9690() && module0281.NIL != module0152.$g2115$.getDynamicValue(var3)) {
                            module0274.f18082((SubLObject)ConsesLow.list((SubLObject)module0281.$ic2$, var9, module0282.f18729(), module0282.f18730()));
                            return Values.values(var1, var2);
                        }
                        return Values.values((SubLObject)module0281.NIL, (SubLObject)module0281.NIL);
                    }
                    else {
                        var4 = (SubLObject)ConsesLow.cons(f18660(var5), var4);
                    }
                }
                else {
                    var4 = (SubLObject)ConsesLow.cons(var8, var4);
                }
                var7 = var7.rest();
                var8 = var7.first();
            }
            var1 = module0202.f12772(Sequences.nreverse(var4));
        }
        return Values.values(var1, var2);
    }
    
    public static SubLObject f18660(final SubLObject var12) {
        final SubLObject var13 = module0279.f18497(var12).first();
        SubLObject var15;
        final SubLObject var14 = var15 = var13;
        SubLObject var16 = (SubLObject)module0281.NIL;
        SubLObject var17 = (SubLObject)module0281.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)module0281.$ic3$);
        var16 = var15.first();
        var15 = var15.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)module0281.$ic3$);
        var17 = var15.first();
        var15 = var15.rest();
        if (module0281.NIL == var15) {
            final SubLObject var18 = module0232.f15330(var17, var16);
            return module0279.f18545(var18);
        }
        cdestructuring_bind.cdestructuring_bind_error(var14, (SubLObject)module0281.$ic3$);
        return (SubLObject)module0281.NIL;
    }
    
    public static SubLObject f18661() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0281", "f18657", "S#21236", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0281", "f18658", "S#21237", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0281", "f18659", "S#21238", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0281", "f18660", "S#21239", 1, 0, false);
        return (SubLObject)module0281.NIL;
    }
    
    public static SubLObject f18662() {
        return (SubLObject)module0281.NIL;
    }
    
    public static SubLObject f18663() {
        return (SubLObject)module0281.NIL;
    }
    
    public void declareFunctions() {
        f18661();
    }
    
    public void initializeVariables() {
        f18662();
    }
    
    public void runTopLevelForms() {
        f18663();
    }
    
    static {
        me = (SubLFile)new module0281();
        $ic0$ = SubLObjectFactory.makeSymbol("S#15484", "CYC");
        $ic1$ = SubLObjectFactory.makeKeyword("IGNORE");
        $ic2$ = SubLObjectFactory.makeKeyword("DISJUNCT-IN-PRAGMATIC-REQUIREMENT");
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEG-LITS"), (SubLObject)SubLObjectFactory.makeSymbol("POS-LITS"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0281.class
	Total time: 83 ms
	
	Decompiled with Procyon 0.5.32.
*/