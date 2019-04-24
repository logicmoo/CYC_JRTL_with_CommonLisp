package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0600 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0600";
    public static final String myFingerPrint = "5f1f11225582cd6d7b0ce42cad502ebe48580dfc26ccc8a0f97d65e8ef3f592a";
    private static final SubLObject $ic0$;
    private static final SubLObject $ic1$;
    
    public static SubLObject f36733(SubLObject var1, final SubLObject var2, final SubLObject var3, SubLObject var4) {
        if (var4 == module0600.UNPROVIDED) {
            var4 = (SubLObject)module0600.NIL;
        }
        if (module0600.NIL != module0173.f10955(var1)) {
            var1 = (SubLObject)ConsesLow.list(var1);
        }
        return f36734(module0213.f13949(var2, var3, var4), var1);
    }
    
    public static SubLObject f36735(SubLObject var1, final SubLObject var2, final SubLObject var3, SubLObject var4) {
        if (var4 == module0600.UNPROVIDED) {
            var4 = (SubLObject)module0600.NIL;
        }
        if (module0600.NIL != module0173.f10955(var1)) {
            var1 = (SubLObject)ConsesLow.list(var1);
        }
        return f36736(module0213.f13954(var2, var3, var4), var1);
    }
    
    public static SubLObject f36734(final SubLObject var5, SubLObject var1) {
        SubLObject var6 = (SubLObject)module0600.NIL;
        if (var1.isAtom()) {
            var1 = (SubLObject)ConsesLow.list(var1);
        }
        SubLObject var7 = var5;
        SubLObject var8 = (SubLObject)module0600.NIL;
        var8 = var7.first();
        while (module0600.NIL != var7) {
            if (module0600.NIL != module0004.f104(module0617.f37874(var8, (SubLObject)module0600.UNPROVIDED), var1, (SubLObject)module0600.UNPROVIDED, (SubLObject)module0600.UNPROVIDED)) {
                var6 = (SubLObject)ConsesLow.cons(var8, var6);
            }
            var7 = var7.rest();
            var8 = var7.first();
        }
        return var6;
    }
    
    public static SubLObject f36736(final SubLObject var9, SubLObject var1) {
        SubLObject var10 = (SubLObject)module0600.NIL;
        if (var1.isAtom()) {
            var1 = (SubLObject)ConsesLow.list(var1);
        }
        SubLObject var11 = var9;
        SubLObject var12 = (SubLObject)module0600.NIL;
        var12 = var11.first();
        while (module0600.NIL != var11) {
            if (module0600.NIL != module0004.f104(module0178.f11297(var12), var1, (SubLObject)module0600.UNPROVIDED, (SubLObject)module0600.UNPROVIDED)) {
                var10 = (SubLObject)ConsesLow.cons(var12, var10);
            }
            var11 = var11.rest();
            var12 = var11.first();
        }
        return var10;
    }
    
    public static SubLObject f36737(final SubLObject var9, SubLObject var11) {
        SubLObject var12 = (SubLObject)module0600.NIL;
        if (module0600.NIL != module0173.f10955(var11)) {
            var11 = (SubLObject)ConsesLow.list(var11);
        }
        SubLObject var13 = var9;
        SubLObject var14 = (SubLObject)module0600.NIL;
        var14 = var13.first();
        while (module0600.NIL != var13) {
            if (module0600.NIL != module0004.f104(module0178.f11295(var14), var11, (SubLObject)module0600.UNPROVIDED, (SubLObject)module0600.UNPROVIDED)) {
                var12 = (SubLObject)ConsesLow.cons(var14, var12);
            }
            var13 = var13.rest();
            var14 = var13.first();
        }
        return var12;
    }
    
    public static SubLObject f36738(final SubLObject var9, final SubLObject var2, final SubLObject var3) {
        SubLObject var10 = (SubLObject)module0600.NIL;
        SubLObject var11 = var9;
        SubLObject var12 = (SubLObject)module0600.NIL;
        var12 = var11.first();
        while (module0600.NIL != var11) {
            final SubLObject var13 = module0178.f11296(var12);
            if (module0600.NIL != var13 && var13.numGE(var2) && var13.numLE(var3)) {
                var10 = (SubLObject)ConsesLow.cons(var12, var10);
            }
            var11 = var11.rest();
            var12 = var11.first();
        }
        return var10;
    }
    
    public static SubLObject f36739(final SubLObject var13) {
        return module0304.f20285(var13, (SubLObject)module0600.TWO_INTEGER, module0600.$ic0$, module0600.$ic1$);
    }
    
    public static SubLObject f36740() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0600", "f36733", "S#40536", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0600", "f36735", "S#40537", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0600", "f36734", "S#40538", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0600", "f36736", "S#40539", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0600", "f36737", "S#40540", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0600", "f36738", "S#40541", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0600", "f36739", "S#40542", 1, 0, false);
        return (SubLObject)module0600.NIL;
    }
    
    public static SubLObject f36741() {
        return (SubLObject)module0600.NIL;
    }
    
    public static SubLObject f36742() {
        return (SubLObject)module0600.NIL;
    }
    
    public void declareFunctions() {
        f36740();
    }
    
    public void initializeVariables() {
        f36741();
    }
    
    public void runTopLevelForms() {
        f36742();
    }
    
    static {
        me = (SubLFile)new module0600();
        $ic0$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("myCreationPurpose"));
        $ic1$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("BookkeepingMt"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0600.class
	Total time: 56 ms
	
	Decompiled with Procyon 0.5.32.
*/