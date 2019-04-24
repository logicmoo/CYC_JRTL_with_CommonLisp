package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0570 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0570";
    public static final String myFingerPrint = "16ab13d6460d342c092b84088b9bbcb6a1fbd67bd5d99088b9894380941ff26f";
    private static final SubLString $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLObject $ic3$;
    private static final SubLObject $ic4$;
    
    public static SubLObject f34975(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0570.NIL;
        final SubLObject var4 = (SubLObject)module0570.$ic0$;
        final SubLObject var5 = module0173.f10962();
        SubLObject var6 = (SubLObject)module0570.ZERO_INTEGER;
        final SubLObject var7 = module0012.$g75$.currentBinding(var2);
        final SubLObject var8 = module0012.$g76$.currentBinding(var2);
        final SubLObject var9 = module0012.$g77$.currentBinding(var2);
        final SubLObject var10 = module0012.$g78$.currentBinding(var2);
        try {
            module0012.$g75$.bind((SubLObject)module0570.ZERO_INTEGER, var2);
            module0012.$g76$.bind((SubLObject)module0570.NIL, var2);
            module0012.$g77$.bind((SubLObject)module0570.T, var2);
            module0012.$g78$.bind(Time.get_universal_time(), var2);
            module0012.f478(var4);
            SubLObject var11 = module0173.f10961();
            SubLObject var12 = (SubLObject)module0570.NIL;
            var12 = var11.first();
            while (module0570.NIL != var11) {
                final SubLObject var13 = var12;
                if (module0570.NIL == module0065.f4772(var13, (SubLObject)module0570.$ic1$)) {
                    final SubLObject var14_15 = var13;
                    if (module0570.NIL == module0065.f4775(var14_15, (SubLObject)module0570.$ic1$)) {
                        final SubLObject var14 = module0065.f4740(var14_15);
                        final SubLObject var15 = (SubLObject)module0570.NIL;
                        SubLObject var16;
                        SubLObject var17;
                        SubLObject var18;
                        SubLObject var19;
                        for (var16 = Sequences.length(var14), var17 = (SubLObject)module0570.NIL, var17 = (SubLObject)module0570.ZERO_INTEGER; var17.numL(var16); var17 = Numbers.add(var17, (SubLObject)module0570.ONE_INTEGER)) {
                            var18 = ((module0570.NIL != var15) ? Numbers.subtract(var16, var17, (SubLObject)module0570.ONE_INTEGER) : var17);
                            var19 = Vectors.aref(var14, var18);
                            if (module0570.NIL == module0065.f4749(var19) || module0570.NIL == module0065.f4773((SubLObject)module0570.$ic1$)) {
                                if (module0570.NIL != module0065.f4749(var19)) {
                                    var19 = (SubLObject)module0570.$ic1$;
                                }
                                var6 = Numbers.add(var6, (SubLObject)module0570.ONE_INTEGER);
                                module0012.note_percent_progress(var6, var5);
                                if (module0570.NIL != Functions.funcall(var1, var19)) {
                                    var3 = (SubLObject)ConsesLow.cons(var19, var3);
                                }
                            }
                        }
                    }
                    final SubLObject var22_23 = var13;
                    if (module0570.NIL == module0065.f4777(var22_23) || module0570.NIL == module0065.f4773((SubLObject)module0570.$ic1$)) {
                        final SubLObject var20 = module0065.f4738(var22_23);
                        SubLObject var21 = module0065.f4739(var22_23);
                        final SubLObject var22 = module0065.f4734(var22_23);
                        final SubLObject var23 = (SubLObject)((module0570.NIL != module0065.f4773((SubLObject)module0570.$ic1$)) ? module0570.NIL : module0570.$ic1$);
                        while (var21.numL(var22)) {
                            final SubLObject var24 = Hashtables.gethash_without_values(var21, var20, var23);
                            if (module0570.NIL == module0065.f4773((SubLObject)module0570.$ic1$) || module0570.NIL == module0065.f4749(var24)) {
                                var6 = Numbers.add(var6, (SubLObject)module0570.ONE_INTEGER);
                                module0012.note_percent_progress(var6, var5);
                                if (module0570.NIL != Functions.funcall(var1, var24)) {
                                    var3 = (SubLObject)ConsesLow.cons(var24, var3);
                                }
                            }
                            var21 = Numbers.add(var21, (SubLObject)module0570.ONE_INTEGER);
                        }
                    }
                }
                var11 = var11.rest();
                var12 = var11.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var10, var2);
            module0012.$g77$.rebind(var9, var2);
            module0012.$g76$.rebind(var8, var2);
            module0012.$g75$.rebind(var7, var2);
        }
        return var3;
    }
    
    public static SubLObject f34976(final SubLObject var21) {
        assert module0570.NIL != module0173.f10955(var21) : var21;
        return (SubLObject)SubLObjectFactory.makeBoolean(module0570.NIL == module0226.f14817(var21));
    }
    
    public static SubLObject f34977(final SubLObject var21) {
        assert module0570.NIL != module0173.f10955(var21) : var21;
        return (SubLObject)SubLObjectFactory.makeBoolean(module0570.NIL != module0269.f17710(var21) && module0570.NIL == module0256.f16598(var21, module0570.$ic3$));
    }
    
    public static SubLObject f34978(final SubLObject var21) {
        assert module0570.NIL != module0173.f10955(var21) : var21;
        return (SubLObject)SubLObjectFactory.makeBoolean(module0570.NIL == module0269.f17710(var21) && (module0570.NIL != module0220.f14547(var21, module0570.$ic4$, (SubLObject)module0570.ONE_INTEGER, (SubLObject)module0570.UNPROVIDED) || module0570.NIL != module0220.f14547(var21, module0570.$ic4$, (SubLObject)module0570.TWO_INTEGER, (SubLObject)module0570.UNPROVIDED)));
    }
    
    public static SubLObject f34979(final SubLObject var21) {
        assert module0570.NIL != module0173.f10955(var21) : var21;
        return (SubLObject)SubLObjectFactory.makeBoolean(module0570.NIL != module0226.f14817(var21) && module0570.NIL == module0226.f14815(var21) && module0570.NIL == module0226.f14813(var21));
    }
    
    public static SubLObject f34980(final SubLObject var21) {
        assert module0570.NIL != module0173.f10955(var21) : var21;
        return (SubLObject)SubLObjectFactory.makeBoolean(module0570.NIL == module0226.f14815(var21) && module0570.NIL == module0226.f14813(var21));
    }
    
    public static SubLObject f34981(final SubLObject var21) {
        assert module0570.NIL != module0173.f10955(var21) : var21;
        return (SubLObject)SubLObjectFactory.makeBoolean(module0570.NIL != module0226.f14815(var21) && module0570.NIL != module0226.f14813(var21));
    }
    
    public static SubLObject f34982(final SubLObject var21) {
        assert module0570.NIL != module0173.f10955(var21) : var21;
        if (module0570.NIL != module0269.f17710(var21)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0570.NIL == module0256.f16598(var21, module0570.$ic3$));
        }
        if (module0570.NIL != module0226.f14813(var21)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0570.NIL != module0220.f14547(var21, module0570.$ic4$, (SubLObject)module0570.ONE_INTEGER, (SubLObject)module0570.UNPROVIDED) || module0570.NIL != module0220.f14547(var21, module0570.$ic4$, (SubLObject)module0570.TWO_INTEGER, (SubLObject)module0570.UNPROVIDED));
        }
        if (module0570.NIL != module0226.f14814(var21)) {
            return (SubLObject)module0570.NIL;
        }
        return (SubLObject)module0570.T;
    }
    
    public static SubLObject f34983() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0570", "f34975", "S#38344", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0570", "f34976", "S#38345", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0570", "f34977", "S#38346", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0570", "f34978", "S#38347", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0570", "f34979", "S#38348", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0570", "f34980", "S#38349", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0570", "f34981", "S#38350", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0570", "f34982", "S#38351", 1, 0, false);
        return (SubLObject)module0570.NIL;
    }
    
    public static SubLObject f34984() {
        return (SubLObject)module0570.NIL;
    }
    
    public static SubLObject f34985() {
        return (SubLObject)module0570.NIL;
    }
    
    public void declareFunctions() {
        f34983();
    }
    
    public void initializeVariables() {
        f34984();
    }
    
    public void runTopLevelForms() {
        f34985();
    }
    
    static {
        me = (SubLFile)new module0570();
        $ic0$ = SubLObjectFactory.makeString("mapping Cyc FORTs");
        $ic1$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic2$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic3$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Thing"));
        $ic4$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genls"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0570.class
	Total time: 106 ms
	
	Decompiled with Procyon 0.5.32.
*/