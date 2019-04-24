package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0478 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0478";
    public static final String myFingerPrint = "6d343951bb19ad9dd8668f78dcdd51fa16961dfb548ad2d336a19e8907af439a";
    private static SubLSymbol $g3694$;
    private static SubLSymbol $g3695$;
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLObject $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLObject $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
    private static final SubLFloat $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLObject $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLList $ic18$;
    
    public static SubLObject f31675(final SubLObject var1, SubLObject var2) {
        if (var2 == module0478.UNPROVIDED) {
            var2 = (SubLObject)module0478.NIL;
        }
        final SubLObject var3 = module0205.f13387(var1, (SubLObject)module0478.UNPROVIDED);
        final SubLObject var4 = f31676(var3, (SubLObject)module0478.UNPROVIDED);
        if (module0478.NIL != var4) {
            module0347.f23330(module0191.f11990((SubLObject)module0478.$ic3$, var1, (SubLObject)module0478.UNPROVIDED, (SubLObject)module0478.UNPROVIDED), (SubLObject)module0478.UNPROVIDED, (SubLObject)module0478.UNPROVIDED);
        }
        return (SubLObject)module0478.NIL;
    }
    
    public static SubLObject f31677(final SubLObject var3, SubLObject var5) {
        if (var5 == module0478.UNPROVIDED) {
            var5 = (SubLObject)module0478.NIL;
        }
        if (module0478.NIL != module0202.f12590(var3)) {
            if (module0478.NIL == module0202.f12665(var3)) {
                final SubLObject var6 = module0205.f13136(var3);
                SubLObject var7 = (SubLObject)module0478.ZERO_INTEGER;
                SubLObject var9;
                final SubLObject var8 = var9 = module0205.f13207(var3, (SubLObject)module0478.$ic6$);
                SubLObject var10 = (SubLObject)module0478.NIL;
                var10 = var9.first();
                while (module0478.NIL != var9) {
                    var7 = Numbers.add(var7, (SubLObject)module0478.ONE_INTEGER);
                    if (module0478.NIL == f31678(var10, var7, var6, var5)) {
                        return (SubLObject)module0478.NIL;
                    }
                    var9 = var9.rest();
                    var10 = var9.first();
                }
            }
            return module0304.f20288(var3, var5);
        }
        return Equality.eql(module0478.$ic7$, var3);
    }
    
    public static SubLObject f31676(final SubLObject var11, SubLObject var5) {
        if (var5 == module0478.UNPROVIDED) {
            var5 = (SubLObject)module0478.NIL;
        }
        if (module0478.NIL != module0202.f12590(var11)) {
            if (module0478.NIL == module0202.f12665(var11)) {
                final SubLObject var12 = module0205.f13136(var11);
                SubLObject var13 = (SubLObject)module0478.ZERO_INTEGER;
                SubLObject var15;
                final SubLObject var14 = var15 = module0205.f13207(var11, (SubLObject)module0478.$ic6$);
                SubLObject var16 = (SubLObject)module0478.NIL;
                var16 = var15.first();
                while (module0478.NIL != var15) {
                    var13 = Numbers.add(var13, (SubLObject)module0478.ONE_INTEGER);
                    if (module0478.NIL == f31678(var16, var13, var12, var5)) {
                        return (SubLObject)module0478.NIL;
                    }
                    var15 = var15.rest();
                    var16 = var15.first();
                }
            }
            return module0304.f20289(var11, var5);
        }
        return Equality.eql(module0478.$ic7$, var11);
    }
    
    public static SubLObject f31679(final SubLObject var1, SubLObject var2) {
        if (var2 == module0478.UNPROVIDED) {
            var2 = (SubLObject)module0478.NIL;
        }
        final SubLObject var3 = module0205.f13387(var1, (SubLObject)module0478.UNPROVIDED);
        final SubLObject var4 = f31676(var3, (SubLObject)module0478.UNPROVIDED);
        if (module0478.NIL == var4) {
            module0347.f23330(module0191.f11990((SubLObject)module0478.$ic3$, module0205.f13338(var1), (SubLObject)module0478.UNPROVIDED, (SubLObject)module0478.UNPROVIDED), (SubLObject)module0478.UNPROVIDED, (SubLObject)module0478.UNPROVIDED);
        }
        return (SubLObject)module0478.NIL;
    }
    
    public static SubLObject f31680(final SubLObject var1, SubLObject var2) {
        if (var2 == module0478.UNPROVIDED) {
            var2 = (SubLObject)module0478.NIL;
        }
        final SubLObject var3 = module0205.f13387(var1, (SubLObject)module0478.UNPROVIDED);
        final SubLObject var4 = module0205.f13388(var1, (SubLObject)module0478.UNPROVIDED);
        final SubLObject var5 = module0205.f13389(var1, (SubLObject)module0478.UNPROVIDED);
        final SubLObject var6 = f31678(var3, var4, var5, (SubLObject)module0478.UNPROVIDED);
        if (module0478.NIL != var6) {
            module0347.f23330(module0191.f11990((SubLObject)module0478.$ic3$, var1, (SubLObject)module0478.UNPROVIDED, (SubLObject)module0478.UNPROVIDED), (SubLObject)module0478.UNPROVIDED, (SubLObject)module0478.UNPROVIDED);
        }
        return (SubLObject)module0478.NIL;
    }
    
    public static SubLObject f31678(final SubLObject var12, final SubLObject var7, final SubLObject var6, SubLObject var5) {
        if (var5 == module0478.UNPROVIDED) {
            var5 = (SubLObject)module0478.NIL;
        }
        final SubLThread var13 = SubLProcess.currentSubLThread();
        if (module0478.NIL == module0202.f12590(var12)) {
            SubLObject var14 = (SubLObject)module0478.NIL;
            final SubLObject var15 = module0226.f14903(var7, var6, var5);
            SubLObject var16 = var5;
            SubLObject var17 = module0147.$g2095$.currentBinding(var13);
            SubLObject var18 = module0147.$g2094$.currentBinding(var13);
            SubLObject var19 = module0147.$g2096$.currentBinding(var13);
            try {
                module0147.$g2095$.bind(module0147.f9545(var16), var13);
                module0147.$g2094$.bind(module0147.f9546(var16), var13);
                module0147.$g2096$.bind(module0147.f9549(var16), var13);
                SubLObject var20 = (SubLObject)module0478.NIL;
                final SubLObject var21 = var15;
                if (module0478.NIL != module0158.f10010(var6, (SubLObject)module0478.ONE_INTEGER, var21)) {
                    final SubLObject var22 = module0158.f10011(var6, (SubLObject)module0478.ONE_INTEGER, var21);
                    SubLObject var23 = var14;
                    final SubLObject var24 = (SubLObject)module0478.NIL;
                    while (module0478.NIL == var23) {
                        final SubLObject var25 = module0052.f3695(var22, var24);
                        final SubLObject var26 = (SubLObject)SubLObjectFactory.makeBoolean(!var24.eql(var25));
                        if (module0478.NIL != var26) {
                            SubLObject var27 = (SubLObject)module0478.NIL;
                            try {
                                var27 = module0158.f10316(var25, (SubLObject)module0478.$ic14$, (SubLObject)module0478.$ic15$, (SubLObject)module0478.NIL);
                                SubLObject var23_28 = var14;
                                final SubLObject var24_29 = (SubLObject)module0478.NIL;
                                while (module0478.NIL == var23_28) {
                                    final SubLObject var28 = module0052.f3695(var27, var24_29);
                                    final SubLObject var26_31 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_29.eql(var28));
                                    if (module0478.NIL != var26_31) {
                                        var20 = module0178.f11331(var28, (SubLObject)module0478.TWO_INTEGER);
                                        if (module0478.NIL != module0173.f10955(var20) && !var20.eql(module0478.$ic16$) && module0478.NIL == module0259.f16854(var12, var20, var5, (SubLObject)module0478.UNPROVIDED) && module0478.NIL == module0305.f20337(var20, var12, var5)) {
                                            var14 = (SubLObject)module0478.T;
                                        }
                                    }
                                    var23_28 = (SubLObject)SubLObjectFactory.makeBoolean(module0478.NIL == var26_31 || module0478.NIL != var14);
                                }
                            }
                            finally {
                                final SubLObject var17_32 = Threads.$is_thread_performing_cleanupP$.currentBinding(var13);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0478.T, var13);
                                    if (module0478.NIL != var27) {
                                        module0158.f10319(var27);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var17_32, var13);
                                }
                            }
                        }
                        var23 = (SubLObject)SubLObjectFactory.makeBoolean(module0478.NIL == var26 || module0478.NIL != var14);
                    }
                }
            }
            finally {
                module0147.$g2096$.rebind(var19, var13);
                module0147.$g2094$.rebind(var18, var13);
                module0147.$g2095$.rebind(var17, var13);
            }
            if (module0478.NIL != var14) {
                return (SubLObject)module0478.NIL;
            }
            final SubLObject var29 = module0226.f14947(var7, (SubLObject)module0478.UNPROVIDED, (SubLObject)module0478.UNPROVIDED);
            var16 = var5;
            var17 = module0147.$g2095$.currentBinding(var13);
            var18 = module0147.$g2094$.currentBinding(var13);
            var19 = module0147.$g2096$.currentBinding(var13);
            try {
                module0147.$g2095$.bind(module0147.f9545(var16), var13);
                module0147.$g2094$.bind(module0147.f9546(var16), var13);
                module0147.$g2096$.bind(module0147.f9549(var16), var13);
                SubLObject var30 = (SubLObject)module0478.NIL;
                final SubLObject var21 = var29;
                if (module0478.NIL != module0158.f10010(var6, (SubLObject)module0478.ONE_INTEGER, var21)) {
                    final SubLObject var22 = module0158.f10011(var6, (SubLObject)module0478.ONE_INTEGER, var21);
                    SubLObject var23 = var14;
                    final SubLObject var24 = (SubLObject)module0478.NIL;
                    while (module0478.NIL == var23) {
                        final SubLObject var25 = module0052.f3695(var22, var24);
                        final SubLObject var26 = (SubLObject)SubLObjectFactory.makeBoolean(!var24.eql(var25));
                        if (module0478.NIL != var26) {
                            SubLObject var27 = (SubLObject)module0478.NIL;
                            try {
                                var27 = module0158.f10316(var25, (SubLObject)module0478.$ic14$, (SubLObject)module0478.$ic15$, (SubLObject)module0478.NIL);
                                SubLObject var23_29 = var14;
                                final SubLObject var24_30 = (SubLObject)module0478.NIL;
                                while (module0478.NIL == var23_29) {
                                    final SubLObject var28 = module0052.f3695(var27, var24_30);
                                    final SubLObject var26_32 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_30.eql(var28));
                                    if (module0478.NIL != var26_32) {
                                        var30 = module0178.f11331(var28, (SubLObject)module0478.TWO_INTEGER);
                                        if (module0478.NIL != module0173.f10955(var30) && !var30.eql(module0478.$ic16$) && module0478.NIL == module0256.f16596(var12, var30, var5, (SubLObject)module0478.UNPROVIDED)) {
                                            var14 = (SubLObject)module0478.T;
                                        }
                                    }
                                    var23_29 = (SubLObject)SubLObjectFactory.makeBoolean(module0478.NIL == var26_32 || module0478.NIL != var14);
                                }
                            }
                            finally {
                                final SubLObject var17_33 = Threads.$is_thread_performing_cleanupP$.currentBinding(var13);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0478.T, var13);
                                    if (module0478.NIL != var27) {
                                        module0158.f10319(var27);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var17_33, var13);
                                }
                            }
                        }
                        var23 = (SubLObject)SubLObjectFactory.makeBoolean(module0478.NIL == var26 || module0478.NIL != var14);
                    }
                }
            }
            finally {
                module0147.$g2096$.rebind(var19, var13);
                module0147.$g2094$.rebind(var18, var13);
                module0147.$g2095$.rebind(var17, var13);
            }
            if (module0478.NIL != var14) {
                return (SubLObject)module0478.NIL;
            }
        }
        return module0304.f20285(var12, var7, var6, var5);
    }
    
    public static SubLObject f31681(final SubLObject var1, SubLObject var2) {
        if (var2 == module0478.UNPROVIDED) {
            var2 = (SubLObject)module0478.NIL;
        }
        final SubLObject var3 = module0205.f13387(var1, (SubLObject)module0478.UNPROVIDED);
        final SubLObject var4 = module0205.f13388(var1, (SubLObject)module0478.UNPROVIDED);
        final SubLObject var5 = module0205.f13389(var1, (SubLObject)module0478.UNPROVIDED);
        final SubLObject var6 = f31678(var3, var4, var5, (SubLObject)module0478.UNPROVIDED);
        if (module0478.NIL == var6) {
            module0347.f23330(module0191.f11990((SubLObject)module0478.$ic3$, module0205.f13338(var1), (SubLObject)module0478.UNPROVIDED, (SubLObject)module0478.UNPROVIDED), (SubLObject)module0478.UNPROVIDED, (SubLObject)module0478.UNPROVIDED);
        }
        return (SubLObject)module0478.NIL;
    }
    
    public static SubLObject f31682() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0478", "f31675", "S#35019", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0478", "f31677", "S#35020", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0478", "f31676", "S#24932", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0478", "f31679", "S#35021", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0478", "f31680", "S#35022", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0478", "f31678", "S#35023", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0478", "f31681", "S#35024", 1, 1, false);
        return (SubLObject)module0478.NIL;
    }
    
    public static SubLObject f31683() {
        module0478.$g3694$ = SubLFiles.defparameter("S#35025", (SubLObject)module0478.ONE_INTEGER);
        module0478.$g3695$ = SubLFiles.defparameter("S#35026", (SubLObject)module0478.$ic13$);
        return (SubLObject)module0478.NIL;
    }
    
    public static SubLObject f31684() {
        module0340.f22938(module0478.$ic0$);
        module0340.f22947(module0478.$ic0$, (SubLObject)module0478.$ic1$);
        module0358.f23773((SubLObject)module0478.$ic2$, module0478.$ic0$);
        module0340.f22941((SubLObject)module0478.$ic4$, (SubLObject)module0478.$ic5$);
        module0340.f22941((SubLObject)module0478.$ic8$, (SubLObject)module0478.$ic9$);
        module0340.f22938(module0478.$ic10$);
        module0340.f22947(module0478.$ic10$, (SubLObject)module0478.$ic1$);
        module0358.f23773((SubLObject)module0478.$ic2$, module0478.$ic10$);
        module0340.f22941((SubLObject)module0478.$ic11$, (SubLObject)module0478.$ic12$);
        module0340.f22941((SubLObject)module0478.$ic17$, (SubLObject)module0478.$ic18$);
        return (SubLObject)module0478.NIL;
    }
    
    public void declareFunctions() {
        f31682();
    }
    
    public void initializeVariables() {
        f31683();
    }
    
    public void runTopLevelForms() {
        f31684();
    }
    
    static {
        me = (SubLFile)new module0478();
        module0478.$g3694$ = null;
        module0478.$g3695$ = null;
        $ic0$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("admittedSentence"));
        $ic1$ = SubLObjectFactory.makeKeyword("REMOVAL-NON-WFF-CHECK-NEG");
        $ic2$ = SubLObjectFactory.makeKeyword("BOTH");
        $ic3$ = SubLObjectFactory.makeKeyword("ADMIT");
        $ic4$ = SubLObjectFactory.makeKeyword("REMOVAL-ADMITTED-SENTENCE-POS");
        $ic5$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("admittedSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("admittedSentence")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#35025", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35019", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$admittedSentence <fully-bound>)\nby checking that the formula is syntactically and semantically well-formed"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$admittedSentence (#$bordersOn #$Canada #$France))") });
        $ic6$ = SubLObjectFactory.makeKeyword("IGNORE");
        $ic7$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("True"));
        $ic8$ = SubLObjectFactory.makeKeyword("REMOVAL-ADMITTED-SENTENCE-NEG");
        $ic9$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("admittedSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("admittedSentence")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#35025", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35021", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$admittedSentence <fully-bound>))\nby checking that the formula is not both syntactically and semantically well-formed"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$admittedSentence (#$genls #$Canada #$Country)))") });
        $ic10$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("admittedArgument"));
        $ic11$ = SubLObjectFactory.makeKeyword("REMOVAL-ADMITTED-ARGUMENT-CHECK-POS");
        $ic12$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("admittedArgument")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("admittedArgument")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#35026", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35022", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$admittedArgument <fully-bound> <integer> <fort>)\nby checking that the argument is syntactically and semantically well-formed"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$admittedArgument #$Canada 1 #$bordersOn)\n (#$admittedArgument #$Dog 1 #$JuvenileFn)") });
        $ic13$ = (SubLFloat)SubLObjectFactory.makeDouble(0.9);
        $ic14$ = SubLObjectFactory.makeKeyword("GAF");
        $ic15$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic16$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Thing"));
        $ic17$ = SubLObjectFactory.makeKeyword("REMOVAL-ADMITTED-ARGUMENT-CHECK-NEG");
        $ic18$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("admittedArgument")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("admittedArgument")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#35026", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35024", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$admittedArgument <fully-bound> <integer> <fort>))\nby checking that the argument is not both syntactically and semantically well-formed"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$admittedArgument #$Canada 1 #$genls))\n (#$not (#$admittedArgument #$Dog 1 #$LeftFn))") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0478.class
	Total time: 225 ms
	
	Decompiled with Procyon 0.5.32.
*/