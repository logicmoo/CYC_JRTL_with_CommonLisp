package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0405 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0405";
    public static final String myFingerPrint = "0097fec621cc8f378380b2c8647febab773c6f73638a98c8b369c2ddca80b50d";
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLString $ic8$;
    
    public static SubLObject f28332(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0405.NIL != module0403.f28317(var1) && module0405.NIL == module0367.f25079(var1));
    }
    
    public static SubLObject f28333(final SubLObject var1) {
        SubLObject var2;
        for (var2 = (SubLObject)module0405.$ic1$; module0405.$ic1$ == var2; var2 = f28334(var1)) {}
        return Equality.eq((SubLObject)module0405.$ic2$, var2);
    }
    
    public static SubLObject f28334(final SubLObject var1) {
        SubLObject var2 = (SubLObject)module0405.NIL;
        if (module0405.NIL != module0387.f27469(var1)) {
            var2 = (SubLObject)module0405.$ic2$;
        }
        else {
            final SubLObject var3 = f28335(var1);
            if (module0405.NIL != var3) {
                var2 = module0387.f27508(var1, var3);
            }
            else {
                var2 = (SubLObject)module0405.$ic2$;
            }
        }
        return var2;
    }
    
    public static SubLObject f28335(final SubLObject var1) {
        return f28336(var1, (SubLObject)module0405.T);
    }
    
    public static SubLObject f28337(final SubLObject var1) {
        return f28336(var1, (SubLObject)module0405.NIL);
    }
    
    public static SubLObject f28336(final SubLObject var1, final SubLObject var4) {
        f28338(var1);
        if (module0405.NIL == module0403.f28317(var1)) {
            return (module0405.NIL != var4) ? module0403.f28316(var1) : module0406.f28346(var1);
        }
        if (module0405.NIL != module0367.f25079(var1)) {
            return module0367.f25077(var1);
        }
        return (SubLObject)module0405.NIL;
    }
    
    public static SubLObject f28338(final SubLObject var1) {
        return var1;
    }
    
    public static SubLObject f28339(final SubLObject var1, final SubLObject var3) {
        assert module0405.NIL != module0406.f28343(var1) : var1;
        assert module0405.NIL != module0387.f27526(var3) : var3;
        SubLObject var4 = (SubLObject)module0405.$ic1$;
        if (module0405.NIL != module0363.f24478(var3)) {
            var4 = (SubLObject)module0405.$ic7$;
        }
        else {
            if (module0405.NIL == module0374.f26529(var3)) {
                return Errors.error((SubLObject)module0405.$ic8$, var3);
            }
            final SubLObject var5 = module0374.f26538(var3);
            module0404.f28321(var1, var5);
            module0373.f26349(var3);
            var4 = (SubLObject)module0405.$ic7$;
        }
        return var4;
    }
    
    public static SubLObject f28340() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0405", "f28332", "S#31448", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0405", "f28333", "S#31449", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0405", "f28334", "S#31450", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0405", "f28335", "S#31451", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0405", "f28337", "S#31452", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0405", "f28336", "S#31453", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0405", "f28338", "S#31454", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0405", "f28339", "S#31455", 2, 0, false);
        return (SubLObject)module0405.NIL;
    }
    
    public static SubLObject f28341() {
        return (SubLObject)module0405.NIL;
    }
    
    public static SubLObject f28342() {
        module0012.f419((SubLObject)module0405.$ic0$);
        module0012.f419((SubLObject)module0405.$ic3$);
        module0012.f419((SubLObject)module0405.$ic4$);
        return (SubLObject)module0405.NIL;
    }
    
    public void declareFunctions() {
        f28340();
    }
    
    public void initializeVariables() {
        f28341();
    }
    
    public void runTopLevelForms() {
        f28342();
    }
    
    static {
        me = (SubLFile)new module0405();
        $ic0$ = SubLObjectFactory.makeSymbol("S#31448", "CYC");
        $ic1$ = SubLObjectFactory.makeKeyword("UNINTERESTING");
        $ic2$ = SubLObjectFactory.makeKeyword("DONE");
        $ic3$ = SubLObjectFactory.makeSymbol("S#31451", "CYC");
        $ic4$ = SubLObjectFactory.makeSymbol("S#31452", "CYC");
        $ic5$ = SubLObjectFactory.makeSymbol("S#29328", "CYC");
        $ic6$ = SubLObjectFactory.makeSymbol("S#30616", "CYC");
        $ic7$ = SubLObjectFactory.makeKeyword("INTERESTING");
        $ic8$ = SubLObjectFactory.makeString("~S was an unexpected strategem");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0405.class
	Total time: 66 ms
	
	Decompiled with Procyon 0.5.32.
*/