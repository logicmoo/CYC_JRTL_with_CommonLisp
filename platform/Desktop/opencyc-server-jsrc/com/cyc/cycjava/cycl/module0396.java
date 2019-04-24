package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0396 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0396";
    public static final String myFingerPrint = "816f01c8845fcd00e4e3f4b92b27045385067a9fcd15f36b0896bbc0a08ad14d";
    private static SubLSymbol $g3285$;
    public static SubLSymbol $g3286$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLString $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLString $ic11$;
    private static final SubLString $ic12$;
    
    public static SubLObject f28115(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0396.NIL != module0393.f28005(var1) && module0396.NIL == module0367.f25079(var1));
    }
    
    public static SubLObject f28116(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3;
        for (var3 = (SubLObject)module0396.$ic1$; module0396.$ic1$ == var3; var3 = f28117(var1)) {}
        if (module0396.NIL != module0018.$g629$.getDynamicValue(var2) && module0396.$ic2$ == var3 && module0396.NIL == module0393.f28005(var1)) {
            Errors.cerror((SubLObject)module0396.$ic3$, var1);
        }
        return Equality.eq((SubLObject)module0396.$ic2$, var3);
    }
    
    public static SubLObject f28117(final SubLObject var1) {
        SubLObject var2 = (SubLObject)module0396.NIL;
        if (module0396.NIL != module0367.f25060(var1)) {
            module0387.f27567(var1);
            var2 = (SubLObject)module0396.$ic1$;
        }
        else if (module0396.NIL != module0387.f27469(var1)) {
            var2 = (SubLObject)module0396.$ic2$;
        }
        else {
            final SubLObject var3 = f28118(var1);
            if (module0396.NIL != var3) {
                if (module0396.NIL != module0365.f24847(var3)) {
                    var2 = (SubLObject)module0396.$ic1$;
                }
                else {
                    var2 = module0387.f27508(var1, var3);
                }
            }
            else {
                var2 = (SubLObject)module0396.$ic2$;
            }
        }
        return var2;
    }
    
    public static SubLObject f28118(final SubLObject var1) {
        return module0367.f25109(var1, (SubLObject)module0396.$ic5$, (SubLObject)module0396.UNPROVIDED, (SubLObject)module0396.UNPROVIDED, (SubLObject)module0396.UNPROVIDED, (SubLObject)module0396.UNPROVIDED, (SubLObject)module0396.UNPROVIDED);
    }
    
    public static SubLObject f28119(final SubLObject var1) {
        f28120(var1);
        if (module0396.NIL == module0393.f28005(var1)) {
            return module0393.f28001(var1);
        }
        if (module0396.NIL != module0367.f25079(var1)) {
            return module0367.f25077(var1);
        }
        return (SubLObject)module0396.NIL;
    }
    
    public static SubLObject f28120(final SubLObject var1) {
        assert module0396.NIL != module0397.f28129(var1) : var1;
        while (true) {
            final SubLObject var2 = module0393.f27993(var1);
            if (module0396.NIL == var2) {
                return (SubLObject)module0396.NIL;
            }
            final SubLObject var3 = module0394.f28048(var1, var2);
            if (module0396.NIL == var3) {
                return var2;
            }
            final SubLObject var4 = var3;
            if (var4.eql((SubLObject)module0396.$ic7$)) {
                module0393.f28002(var1, var2);
            }
            else if (var4.eql((SubLObject)module0396.$ic8$)) {
                module0393.f28004(var1, var2);
            }
            module0393.f28001(var1);
            module0395.f28107(var1, var2);
        }
    }
    
    public static SubLObject f28121(final SubLObject var1, final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        assert module0396.NIL != module0397.f28129(var1) : var1;
        assert module0396.NIL != module0387.f27526(var4) : var4;
        SubLObject var6 = (SubLObject)module0396.$ic1$;
        if (module0396.NIL != module0387.f27527(var4)) {
            final SubLObject var7 = module0387.f27530(var4);
            module0395.f28108(var1, var4);
            f28122(var1, var4);
            module0395.f28109(var1, var7);
            var6 = (SubLObject)module0396.$ic10$;
        }
        else if (module0396.NIL != module0373.f26163(var4)) {
            if (module0396.NIL == module0396.$g3285$.getDynamicValue(var5) || module0396.NIL == module0384.f27366(var4, var1)) {
                module0395.f28073(var1, var4);
                final SubLObject var7 = module0387.f27530(var4);
                module0395.f28108(var1, var4);
                module0387.f27511(var1, var4);
                module0395.f28109(var1, var7);
                var6 = (SubLObject)module0396.$ic10$;
            }
        }
        else {
            if (module0396.NIL != module0377.f26746(var4)) {
                return Errors.error((SubLObject)module0396.$ic11$, var4);
            }
            if (module0396.NIL == module0374.f26529(var4)) {
                return Errors.error((SubLObject)module0396.$ic12$, var4);
            }
            final SubLObject var8 = module0374.f26538(var4);
            module0395.f28075(var1, var8);
            module0373.f26349(var4);
            var6 = (SubLObject)module0396.$ic10$;
        }
        return var6;
    }
    
    public static SubLObject f28122(final SubLObject var1, final SubLObject var8) {
        if (module0396.NIL != module0373.f26176(var8)) {
            return f28123(var1, var8);
        }
        return f28124(var1, var8);
    }
    
    public static SubLObject f28123(final SubLObject var1, final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        if (module0396.NIL == module0396.$g3286$.getDynamicValue(var14) && module0396.NIL != module0376.f26619(var13)) {
            module0387.f27510(var1, var13);
            if (module0396.NIL != module0365.f24883(var13)) {
                module0395.f28106(var1, var13);
            }
        }
        else {
            f28125(var1, var13);
        }
        return var1;
    }
    
    public static SubLObject f28124(final SubLObject var1, final SubLObject var14) {
        return f28125(var1, var14);
    }
    
    public static SubLObject f28125(final SubLObject var1, final SubLObject var4) {
        final SubLObject var5 = module0365.f24883(var4);
        if (module0396.NIL != var5) {
            module0395.f28106(var1, var4);
        }
        module0387.f27510(var1, var4);
        if (module0396.NIL == var5 && module0396.NIL != module0365.f24883(var4)) {
            module0395.f28106(var1, var4);
        }
        return var4;
    }
    
    public static SubLObject f28126() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0396", "f28115", "S#31247", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0396", "f28116", "S#31248", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0396", "f28117", "S#31249", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0396", "f28118", "S#31250", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0396", "f28119", "S#31251", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0396", "f28120", "S#31252", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0396", "f28121", "S#31253", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0396", "f28122", "S#31254", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0396", "f28123", "S#31255", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0396", "f28124", "S#31256", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0396", "f28125", "S#31257", 2, 0, false);
        return (SubLObject)module0396.NIL;
    }
    
    public static SubLObject f28127() {
        module0396.$g3285$ = SubLFiles.defparameter("S#31258", (SubLObject)module0396.T);
        module0396.$g3286$ = SubLFiles.defparameter("S#31259", (SubLObject)module0396.T);
        return (SubLObject)module0396.NIL;
    }
    
    public static SubLObject f28128() {
        module0012.f419((SubLObject)module0396.$ic0$);
        module0012.f419((SubLObject)module0396.$ic4$);
        return (SubLObject)module0396.NIL;
    }
    
    public void declareFunctions() {
        f28126();
    }
    
    public void initializeVariables() {
        f28127();
    }
    
    public void runTopLevelForms() {
        f28128();
    }
    
    static {
        me = (SubLFile)new module0396();
        module0396.$g3285$ = null;
        module0396.$g3286$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#31247", "CYC");
        $ic1$ = SubLObjectFactory.makeKeyword("UNINTERESTING");
        $ic2$ = SubLObjectFactory.makeKeyword("DONE");
        $ic3$ = SubLObjectFactory.makeString("~s says it's done, but its R-box is nonempty");
        $ic4$ = SubLObjectFactory.makeSymbol("S#31248", "CYC");
        $ic5$ = SubLObjectFactory.makeKeyword("SELECT-BEST-STRATEGEM");
        $ic6$ = SubLObjectFactory.makeSymbol("S#29327", "CYC");
        $ic7$ = SubLObjectFactory.makeKeyword("SET-ASIDE");
        $ic8$ = SubLObjectFactory.makeKeyword("THROW-AWAY");
        $ic9$ = SubLObjectFactory.makeSymbol("S#30616", "CYC");
        $ic10$ = SubLObjectFactory.makeKeyword("INTERESTING");
        $ic11$ = SubLObjectFactory.makeString("removal tactician does not handle transformation link ~a");
        $ic12$ = SubLObjectFactory.makeString("~S was an unexpected strategem");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0396.class
	Total time: 91 ms
	
	Decompiled with Procyon 0.5.32.
*/