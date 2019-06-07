package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0332 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0332";
    public static final String myFingerPrint = "3e499663556baf150104b1c495fbd09bea8d024c1b21e919f0a45f572108b7a4";
    public static SubLSymbol $g2845$;
    private static SubLSymbol $g2846$;
    private static SubLSymbol $g2847$;
    private static SubLSymbol $g2848$;
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLObject $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLObject $ic13$;
    
    public static SubLObject f22400(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL != $g2845$.getDynamicValue(var3) && NIL != module0211.f13649(var2, $ic0$) && NIL != module0178.f11343(var2, (SubLObject)$ic1$)) {
            final SubLObject var4 = module0178.f11285(var2);
            if (NIL != module0202.f12734(var4, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED)) {
                final SubLObject var5 = module0205.f13380(var4, (SubLObject)UNPROVIDED);
                final SubLObject var6 = module0205.f13379(var4, (SubLObject)UNPROVIDED);
                if (NIL != module0173.f10955(var6) && NIL != module0173.f10955(var5) && !var6.equal(var5)) {
                    f22401(var5, var6, var2);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22401(final SubLObject var5, final SubLObject var6, final SubLObject var2) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = $g2846$.currentBinding(var7);
        final SubLObject var9 = $g2847$.currentBinding(var7);
        final SubLObject var10 = $g2848$.currentBinding(var7);
        final SubLObject var11 = module0147.$g2094$.currentBinding(var7);
        final SubLObject var12 = module0147.$g2095$.currentBinding(var7);
        try {
            $g2846$.bind(var5, var7);
            $g2847$.bind(var6, var7);
            $g2848$.bind(var2, var7);
            module0147.$g2094$.bind((SubLObject)$ic3$, var7);
            module0147.$g2095$.bind($ic4$, var7);
            module0219.f14491((SubLObject)$ic5$, var5);
        }
        finally {
            module0147.$g2095$.rebind(var12, var7);
            module0147.$g2094$.rebind(var11, var7);
            $g2848$.rebind(var10, var7);
            $g2847$.rebind(var9, var7);
            $g2846$.rebind(var8, var7);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22402(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = $g2846$.getDynamicValue(var3);
        final SubLObject var5 = $g2847$.getDynamicValue(var3);
        final SubLObject var6 = $g2848$.getDynamicValue(var3);
        if (!var2.eql($g2848$.getDynamicValue(var3))) {
            f22403(var2, var4, var5, var6);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22404(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL != $g2845$.getDynamicValue(var3)) {
            final SubLObject var4 = module0205.f13183(var2, (SubLObject)$ic6$, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL != var4) {
                SubLObject var5 = var4;
                SubLObject var6 = (SubLObject)NIL;
                var6 = var5.first();
                while (NIL != var5) {
                    f22405(var6, var2);
                    var5 = var5.rest();
                    var6 = var5.first();
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f22405(final SubLObject var5, final SubLObject var2) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        final SubLObject var7 = module0147.$g2094$.currentBinding(var6);
        final SubLObject var8 = module0147.$g2095$.currentBinding(var6);
        try {
            module0147.$g2094$.bind((SubLObject)$ic3$, var6);
            module0147.$g2095$.bind($ic4$, var6);
            final SubLObject var9 = $ic0$;
            if (NIL != module0158.f10010(var5, (SubLObject)TWO_INTEGER, var9)) {
                final SubLObject var10 = module0158.f10011(var5, (SubLObject)TWO_INTEGER, var9);
                SubLObject var11 = (SubLObject)NIL;
                final SubLObject var12 = (SubLObject)NIL;
                while (NIL == var11) {
                    final SubLObject var13 = module0052.f3695(var10, var12);
                    final SubLObject var14 = (SubLObject)makeBoolean(!var12.eql(var13));
                    if (NIL != var14) {
                        SubLObject var15 = (SubLObject)NIL;
                        try {
                            var15 = module0158.f10316(var13, (SubLObject)$ic7$, (SubLObject)$ic1$, (SubLObject)NIL);
                            SubLObject var18_23 = (SubLObject)NIL;
                            final SubLObject var19_24 = (SubLObject)NIL;
                            while (NIL == var18_23) {
                                final SubLObject var16 = module0052.f3695(var15, var19_24);
                                final SubLObject var21_25 = (SubLObject)makeBoolean(!var19_24.eql(var16));
                                if (NIL != var21_25) {
                                    final SubLObject var17 = module0178.f11334(var16);
                                    if (NIL != module0173.f10955(var17) && !var5.equal(var17) && !var16.eql(var2)) {
                                        f22403(var2, var5, var17, var16);
                                    }
                                }
                                var18_23 = (SubLObject)makeBoolean(NIL == var21_25);
                            }
                        }
                        finally {
                            final SubLObject var7_26 = Threads.$is_thread_performing_cleanupP$.currentBinding(var6);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var6);
                                if (NIL != var15) {
                                    module0158.f10319(var15);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var7_26, var6);
                            }
                        }
                    }
                    var11 = (SubLObject)makeBoolean(NIL == var14);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var8, var6);
            module0147.$g2094$.rebind(var7, var6);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22406(final SubLObject var15) {
        return module0330.f22365(var15);
    }
    
    public static SubLObject f22403(final SubLObject var2, final SubLObject var5, final SubLObject var6, final SubLObject var12) {
        assert NIL != assertion_handles_oc.f11035(var2) : var2;
        assert NIL != module0173.f10955(var5) : var5;
        assert NIL != module0173.f10955(var6) : var6;
        assert NIL != assertion_handles_oc.f11035(var12) : var12;
        final SubLObject var13 = module0211.f13654(var2);
        if (NIL != f22407(var13, var5, var6)) {
            final SubLObject var14 = f22408(var13, var5, var6);
            if (!var14.equal(var13)) {
                final SubLObject var15 = module0232.f15328(var14, module0178.f11292(var2));
                final SubLObject var16 = module0178.f11291(var2);
                final SubLObject var17 = (SubLObject)ConsesLow.list(var2, var12);
                final SubLObject var18 = module0178.f11287(var2);
                final SubLObject var19 = module0178.f11287(var12);
                final SubLObject var20 = f22409(var18, var19);
                if (NIL != var20) {
                    module0538.f33372(var15, var20, var17, var16, (SubLObject)UNPROVIDED);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22407(final SubLObject var28, final SubLObject var5, final SubLObject var6) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        SubLObject var30 = (SubLObject)NIL;
        try {
            var29.throwStack.push($ic10$);
            f22410(var28, var5, var6, (SubLObject)T);
        }
        catch (Throwable var31) {
            var30 = Errors.handleThrowable(var31, (SubLObject)$ic10$);
        }
        finally {
            var29.throwStack.pop();
        }
        return var30;
    }
    
    public static SubLObject f22411() {
        Dynamic.sublisp_throw((SubLObject)$ic10$, (SubLObject)T);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22408(final SubLObject var28, final SubLObject var5, final SubLObject var6) {
        return f22410(var28, var5, var6, (SubLObject)NIL);
    }
    
    public static SubLObject f22410(final SubLObject var28, final SubLObject var5, final SubLObject var6, final SubLObject var38) {
        final SubLObject var39 = module0232.f15306(var28);
        final SubLObject var40 = module0232.f15308(var28);
        SubLObject var41 = (SubLObject)NIL;
        SubLObject var42 = (SubLObject)NIL;
        if (NIL != module0205.f13224(var5, var39, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            SubLObject var43 = var39;
            SubLObject var44 = (SubLObject)NIL;
            var44 = var43.first();
            while (NIL != var43) {
                final SubLObject var45 = f22412(var44, var5, var6, var38);
                if (NIL == var38) {
                    var41 = (SubLObject)ConsesLow.cons(var45, var41);
                }
                var43 = var43.rest();
                var44 = var43.first();
            }
            if (NIL == var38) {
                var41 = Sequences.nreverse(var41);
            }
        }
        else if (NIL == var38) {
            var41 = var39;
        }
        if (NIL != module0205.f13224(var5, var40, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            SubLObject var43 = var40;
            SubLObject var46 = (SubLObject)NIL;
            var46 = var43.first();
            while (NIL != var43) {
                final SubLObject var45 = f22412(var46, var5, var6, var38);
                if (NIL == var38) {
                    var42 = (SubLObject)ConsesLow.cons(var45, var42);
                }
                var43 = var43.rest();
                var46 = var43.first();
            }
            if (NIL == var38) {
                var42 = Sequences.nreverse(var42);
            }
        }
        else if (NIL == var38) {
            var42 = var40;
        }
        if (NIL != var38) {
            return (SubLObject)NIL;
        }
        return module0232.f15326(var41, var42);
    }
    
    public static SubLObject f22412(final SubLObject var4, final SubLObject var5, final SubLObject var6, final SubLObject var38) {
        final SubLThread var39 = SubLProcess.currentSubLThread();
        final SubLObject var40 = module0205.$g2314$.currentBinding(var39);
        try {
            module0205.$g2314$.bind((SubLObject)$ic11$, var39);
            if (NIL == module0205.f13220(var5, var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                return var4;
            }
            final SubLObject var41 = module0205.f13333(var4);
            if (NIL == module0173.f10955(var41)) {
                return var4;
            }
            if (var41.eql($ic13$) && NIL != var38) {
                f22411();
                return module0205.f13250(var6, var5, var4, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
            }
            if (NIL == module0226.f14840(var41)) {
                if (NIL != var38) {
                    f22411();
                }
                return module0205.f13250(var6, var5, var4, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
            }
            final SubLObject var42 = module0205.f13377(var4, (SubLObject)UNPROVIDED);
            SubLObject var43 = (SubLObject)ZERO_INTEGER;
            SubLObject var44 = (SubLObject)NIL;
            SubLObject var45 = var42;
            SubLObject var46 = (SubLObject)NIL;
            var46 = var45.first();
            while (NIL != var45) {
                var43 = Numbers.add(var43, (SubLObject)ONE_INTEGER);
                if (NIL != module0205.f13220(var5, var46, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL == module0226.f14839(var41, var43)) {
                    if (NIL != var38) {
                        f22411();
                    }
                    var44 = (SubLObject)ConsesLow.cons(var43, var44);
                }
                var45 = var45.rest();
                var46 = var45.first();
            }
            if (NIL == var44) {
                return var4;
            }
            final SubLObject var47 = module0202.f12702(var4);
            SubLObject var48 = var44;
            SubLObject var49 = (SubLObject)NIL;
            var49 = var48.first();
            while (NIL != var48) {
                final SubLObject var50 = module0205.f13376(var47, var49, (SubLObject)UNPROVIDED);
                ConsesLow.set_nth(var49, var47, module0205.f13251(var6, var5, var50, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
                var48 = var48.rest();
                var49 = var48.first();
            }
            return var47;
        }
        finally {
            module0205.$g2314$.rebind(var40, var39);
        }
    }
    
    public static SubLObject f22409(final SubLObject var33, final SubLObject var34) {
        if (NIL != module0262.f17336(var33, var34, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return var33;
        }
        if (NIL != module0262.f17336(var34, var33, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return var34;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22413() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0332", "f22400", "REWRITE-OF-AFTER-ADDING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0332", "f22401", "S#24913", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0332", "f22402", "S#24914", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0332", "f22404", "S#24915", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0332", "f22405", "S#24916", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0332", "f22406", "S#24912", 1, 0, false);
        new $f22406$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0332", "f22403", "S#24917", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0332", "f22407", "S#24918", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0332", "f22411", "S#24919", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0332", "f22408", "S#24920", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0332", "f22410", "S#24921", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0332", "f22412", "S#24922", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0332", "f22409", "S#24923", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22414() {
        $g2845$ = SubLFiles.defparameter("*ENABLE-REWRITE-OF-PROPAGATION?*", (SubLObject)T);
        $g2846$ = SubLFiles.defparameter("S#24924", (SubLObject)NIL);
        $g2847$ = SubLFiles.defparameter("S#24925", (SubLObject)NIL);
        $g2848$ = SubLFiles.defparameter("S#24926", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22415() {
        module0012.f416((SubLObject)$ic2$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f22413();
    }
    
    public void initializeVariables() {
        f22414();
    }
    
    public void runTopLevelForms() {
        f22415();
    }
    
    static {
        me = (SubLFile)new module0332();
        $g2845$ = null;
        $g2846$ = null;
        $g2847$ = null;
        $g2848$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("rewriteOf"));
        $ic1$ = makeKeyword("TRUE");
        $ic2$ = makeSymbol("REWRITE-OF-AFTER-ADDING");
        $ic3$ = makeSymbol("S#12274", "CYC");
        $ic4$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic5$ = makeSymbol("S#24914", "CYC");
        $ic6$ = makeSymbol("S#24912", "CYC");
        $ic7$ = makeKeyword("GAF");
        $ic8$ = makeSymbol("ASSERTION-P");
        $ic9$ = makeSymbol("FORT-P");
        $ic10$ = makeKeyword("PROPAGATE-REWRITE-OF-CNF");
        $ic11$ = makeSymbol("S#16025", "CYC");
        $ic12$ = makeSymbol("S#5859", "CYC");
        $ic13$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
    }
    
    public static final class $f22406$UnaryFunction extends UnaryFunction
    {
        public $f22406$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#24912"));
        }
        
        public SubLObject processItem(final SubLObject var27) {
            return f22406(var27);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 171 ms
	
	Decompiled with Procyon 0.5.32.
*/