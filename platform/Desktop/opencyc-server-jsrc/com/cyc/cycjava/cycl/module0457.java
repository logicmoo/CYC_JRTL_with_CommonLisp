package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0457 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0457";
    public static final String myFingerPrint = "ac612c462d0e2989e3736ced3d25e1f498f12809e7f23bbaf8d63c4e5d747c90";
    private static SubLSymbol $g3604$;
    private static SubLSymbol $g3605$;
    private static SubLSymbol $g3606$;
    private static SubLSymbol $g3607$;
    private static SubLSymbol $g3608$;
    private static SubLSymbol $g3609$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLObject $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLList $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLList $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLList $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLList $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLList $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLList $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLList $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLList $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLList $ic32$;
    private static final SubLObject $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLList $ic35$;
    
    public static SubLObject f31205(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)$ic0$;
        }
        return module0191.f11990((SubLObject)$ic1$, var1, var2, var3);
    }
    
    public static SubLObject f31206(final SubLObject var4, SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = module0205.f13387(var4, (SubLObject)UNPROVIDED);
        final SubLObject var7 = module0205.f13388(var4, (SubLObject)UNPROVIDED);
        final SubLObject var8 = module0205.f13304(var6, (SubLObject)UNPROVIDED);
        final SubLObject var9 = module0205.f13304(var7, (SubLObject)UNPROVIDED);
        if (NIL != conses_high.subsetp(var8, var9, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
            module0347.f23330(f31205(var4, module0132.$g1564$.getGlobalValue(), (SubLObject)$ic4$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31207(final SubLObject var4, SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = module0205.f13387(var4, (SubLObject)UNPROVIDED);
        final SubLObject var7 = module0205.f13388(var4, (SubLObject)UNPROVIDED);
        final SubLObject var8 = module0205.f13304(var6, (SubLObject)UNPROVIDED);
        final SubLObject var9 = module0205.f13304(var7, (SubLObject)UNPROVIDED);
        if (NIL == conses_high.subsetp(var8, var9, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
            module0347.f23330(f31205(module0205.f13338(var4), module0132.$g1564$.getGlobalValue(), (SubLObject)$ic4$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31208(final SubLObject var4, SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLThread var6 = SubLProcess.currentSubLThread();
        final SubLObject var7 = module0205.f13387(var4, (SubLObject)UNPROVIDED);
        final SubLObject var8 = module0205.f13388(var4, (SubLObject)UNPROVIDED);
        SubLObject var10;
        final SubLObject var9 = var10 = module0205.f13304(var7, (SubLObject)UNPROVIDED);
        SubLObject var11 = (SubLObject)NIL;
        var11 = var10.first();
        while (NIL != var10) {
            var6.resetMultipleValues();
            final SubLObject var12 = module0453.f31089(var11, var8, (SubLObject)UNPROVIDED);
            final SubLObject var13 = var6.secondMultipleValue();
            var6.resetMultipleValues();
            if (NIL == var12 && NIL != var13) {
                return (SubLObject)NIL;
            }
            var10 = var10.rest();
            var11 = var10.first();
        }
        module0347.f23330(f31205(var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31209(final SubLObject var4, SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLThread var6 = SubLProcess.currentSubLThread();
        final SubLObject var7 = module0205.f13387(var4, (SubLObject)UNPROVIDED);
        final SubLObject var8 = module0205.f13388(var4, (SubLObject)UNPROVIDED);
        SubLObject var10;
        final SubLObject var9 = var10 = module0205.f13304(var7, (SubLObject)UNPROVIDED);
        SubLObject var11 = (SubLObject)NIL;
        var11 = var10.first();
        while (NIL != var10) {
            var6.resetMultipleValues();
            final SubLObject var12 = module0453.f31089(var11, var8, (SubLObject)UNPROVIDED);
            final SubLObject var13 = var6.secondMultipleValue();
            var6.resetMultipleValues();
            if (NIL == var12 && NIL != var13) {
                module0347.f23330(f31205(module0205.f13338(var4), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                return (SubLObject)NIL;
            }
            var10 = var10.rest();
            var11 = var10.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31210(final SubLObject var4, SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        return f31211(var4, (SubLObject)$ic13$);
    }
    
    public static SubLObject f31212(final SubLObject var4, SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        return f31211(var4, (SubLObject)$ic14$);
    }
    
    public static SubLObject f31211(final SubLObject var4, final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        final SubLObject var7 = module0205.f13387(var4, (SubLObject)UNPROVIDED);
        final SubLObject var8 = module0205.f13368(var7, (SubLObject)UNPROVIDED);
        final SubLObject var9 = module0205.f13388(var4, (SubLObject)UNPROVIDED);
        var6.resetMultipleValues();
        final SubLObject var10 = f31213(var8, (SubLObject)UNPROVIDED);
        final SubLObject var11 = var6.secondMultipleValue();
        var6.resetMultipleValues();
        final SubLObject var12 = (SubLObject)makeBoolean(NIL != var10 && NIL != var11 && NIL != module0259.f16854(var11, var9, var10, (SubLObject)UNPROVIDED));
        if (NIL != ((NIL != var12) ? Equality.eq((SubLObject)$ic13$, var5) : Equality.eq((SubLObject)$ic14$, var5))) {
            SubLObject var13 = var4;
            if ($ic14$ == var5) {
                var13 = module0205.f13338(var13);
            }
            module0347.f23330(f31205(var13, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31213(final SubLObject var19, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var20 = SubLProcess.currentSubLThread();
        SubLObject var21 = (SubLObject)NIL;
        SubLObject var22 = (SubLObject)NIL;
        final SubLObject var23 = module0144.$g1858$.currentBinding(var20);
        try {
            module0144.$g1858$.bind((SubLObject)NIL, var20);
            var20.resetMultipleValues();
            final SubLObject var24 = module0541.f33579(var19, var2, (SubLObject)ZERO_INTEGER);
            final SubLObject var25 = var20.secondMultipleValue();
            final SubLObject var26 = var20.thirdMultipleValue();
            var20.resetMultipleValues();
            if (NIL == var26) {
                final SubLObject var27 = var25.first();
                final SubLObject var28 = module0233.f15370(var27);
                if (NIL != module0173.f10955(var28)) {
                    var21 = var24;
                    var22 = var28;
                }
            }
        }
        finally {
            module0144.$g1858$.rebind(var23, var20);
        }
        if (NIL != var22) {
            return Values.values(var21, var22);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31214(final SubLObject var4, SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        return f31211(var4, (SubLObject)$ic13$);
    }
    
    public static SubLObject f31215(final SubLObject var4, SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        return f31211(var4, (SubLObject)$ic14$);
    }
    
    public static SubLObject f31216(final SubLObject var4, SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        return f31217(var4, (SubLObject)$ic13$);
    }
    
    public static SubLObject f31218(final SubLObject var4, SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        return f31217(var4, (SubLObject)$ic14$);
    }
    
    public static SubLObject f31217(final SubLObject var4, final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        final SubLObject var7 = module0205.f13387(var4, (SubLObject)UNPROVIDED);
        final SubLObject var8 = module0205.f13368(var7, (SubLObject)UNPROVIDED);
        final SubLObject var9 = module0205.f13388(var4, (SubLObject)UNPROVIDED);
        var6.resetMultipleValues();
        final SubLObject var10 = f31213(var8, (SubLObject)UNPROVIDED);
        final SubLObject var11 = var6.secondMultipleValue();
        var6.resetMultipleValues();
        if (NIL != var10 && NIL != var11) {
            var6.resetMultipleValues();
            final SubLObject var12 = module0453.f31089(var11, var9, var10);
            final SubLObject var13 = var6.secondMultipleValue();
            var6.resetMultipleValues();
            if (NIL != var13 && NIL != ((NIL != var12) ? Equality.eq((SubLObject)$ic13$, var5) : Equality.eq((SubLObject)$ic14$, var5))) {
                SubLObject var14 = var4;
                if ($ic14$ == var5) {
                    var14 = module0205.f13338(var14);
                }
                module0347.f23330(module0191.f11990((SubLObject)$ic1$, var14, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31219(final SubLObject var4, SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        return f31217(var4, (SubLObject)$ic13$);
    }
    
    public static SubLObject f31220(final SubLObject var4, SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        return f31217(var4, (SubLObject)$ic14$);
    }
    
    public static SubLObject f31221() {
        return module0191.f11990((SubLObject)$ic31$, (SubLObject)$ic32$, $ic33$, (SubLObject)$ic4$);
    }
    
    public static SubLObject f31222(final SubLObject var4, SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        module0347.f23330(f31205(var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)NIL, (SubLObject)ConsesLow.list(f31221()));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31223() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0457", "f31205", "S#34480", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0457", "f31206", "S#34481", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0457", "f31207", "S#34482", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0457", "f31208", "S#34483", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0457", "f31209", "S#34484", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0457", "f31210", "S#34485", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0457", "f31212", "S#34486", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0457", "f31211", "S#34487", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0457", "f31213", "S#34488", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0457", "f31214", "S#34489", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0457", "f31215", "S#34490", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0457", "f31216", "S#34491", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0457", "f31218", "S#34492", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0457", "f31217", "S#34493", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0457", "f31219", "S#34494", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0457", "f31220", "S#34495", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0457", "f31221", "S#34496", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0457", "f31222", "S#34497", 1, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31224() {
        $g3604$ = SubLFiles.defparameter("S#34498", module0018.$g658$.getDynamicValue());
        $g3605$ = SubLFiles.defparameter("S#34499", (SubLObject)TWO_INTEGER);
        $g3606$ = SubLFiles.defparameter("S#34500", (SubLObject)TWO_INTEGER);
        $g3607$ = SubLFiles.defparameter("S#34501", $g3606$.getDynamicValue());
        $g3608$ = SubLFiles.defparameter("S#34502", (SubLObject)TWO_INTEGER);
        $g3609$ = SubLFiles.defparameter("S#34503", $g3608$.getDynamicValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31225() {
        module0340.f22938($ic2$);
        module0358.f23773((SubLObject)$ic3$, $ic2$);
        module0340.f22941((SubLObject)$ic5$, (SubLObject)$ic6$);
        module0340.f22941((SubLObject)$ic7$, (SubLObject)$ic8$);
        module0340.f22941((SubLObject)$ic9$, (SubLObject)$ic10$);
        module0340.f22941((SubLObject)$ic11$, (SubLObject)$ic12$);
        module0340.f22941((SubLObject)$ic15$, (SubLObject)$ic16$);
        module0340.f22941((SubLObject)$ic17$, (SubLObject)$ic18$);
        module0340.f22941((SubLObject)$ic19$, (SubLObject)$ic20$);
        module0340.f22941((SubLObject)$ic21$, (SubLObject)$ic22$);
        module0340.f22941((SubLObject)$ic23$, (SubLObject)$ic24$);
        module0340.f22941((SubLObject)$ic25$, (SubLObject)$ic26$);
        module0340.f22941((SubLObject)$ic27$, (SubLObject)$ic28$);
        module0340.f22941((SubLObject)$ic29$, (SubLObject)$ic30$);
        module0340.f22941((SubLObject)$ic34$, (SubLObject)$ic35$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f31223();
    }
    
    public void initializeVariables() {
        f31224();
    }
    
    public void runTopLevelForms() {
        f31225();
    }
    
    static {
        me = (SubLFile)new module0457();
        $g3604$ = null;
        $g3605$ = null;
        $g3606$ = null;
        $g3607$ = null;
        $g3608$ = null;
        $g3609$ = null;
        $ic0$ = makeKeyword("TRUE-DEF");
        $ic1$ = makeKeyword("SUBSETOF");
        $ic2$ = constant_handles_oc.f8479((SubLObject)makeString("subsetOf"));
        $ic3$ = makeKeyword("BOTH");
        $ic4$ = makeKeyword("TRUE-MON");
        $ic5$ = makeKeyword("REMOVAL-SUBSETOF-THESET-THESET-POS");
        $ic6$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("subsetOf")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("subsetOf")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("TheSet")), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("TheSet")), (SubLObject)makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34498", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34481", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$subsetOf (#$TheSet . <fully-bound>)(#$TheSet . <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$subsetOf (#$TheSet 1 2)(#$TheSet 1 2 3))") });
        $ic7$ = makeKeyword("REMOVAL-SUBSETOF-THESET-THESET-NEG");
        $ic8$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("subsetOf")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("subsetOf")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("TheSet")), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("TheSet")), (SubLObject)makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34498", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34482", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$subsetOf (#$TheSet . <fully-bound>)(#$TheSet . <fully-bound>)))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$subsetOf (#$TheSet 1 2 3)(#$TheSet 1 2)))") });
        $ic9$ = makeKeyword("REMOVAL-SUBSETOF-THESET-THESETOF-POS");
        $ic10$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("subsetOf")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("subsetOf")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("TheSet")), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("TheSetOf")), (SubLObject)makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34499", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34483", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$subsetOf\n  (#$TheSet . <fully-bound>)\n  (#$TheSetOf <variable> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$subsetOf\n  (#$TheSet #$France #$Austria)\n  (#$TheSetOf ?COUNTRY\n    (#$bordersOn #$Germany ?COUNTRY)))") });
        $ic11$ = makeKeyword("REMOVAL-SUBSETOF-THESET-THESETOF-NEG");
        $ic12$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("subsetOf")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("subsetOf")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("TheSet")), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("TheSetOf")), (SubLObject)makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34499", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34484", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not \n (#$subsetOf\n  (#$TheSet . <fully-bound>)\n  (#$TheSetOf <variable> <fully-bound>)))"), makeKeyword("EXAMPLE"), makeString("(#$not\n (#$subsetOf\n  (#$TheSet #$France #$Canada)\n  (#$TheSetOf ?COUNTRY\n    (#$bordersOn #$Germany ?COUNTRY))))") });
        $ic13$ = makeKeyword("POS");
        $ic14$ = makeKeyword("NEG");
        $ic15$ = makeKeyword("REMOVAL-SUBSETOF-THESETOF-FORT-POS");
        $ic16$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("subsetOf")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("subsetOf")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("TheSetOf")), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34500", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34485", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$subsetOf (#$TheSetOf <variable> <fully-bound>) <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$subsetOf \n  (#$TheSetOf ?DOG \n    (#$and \n      (#$isa ?DOG #$Dog)\n      (#$colorOfObject ?DOG #$RedColor)))\n  #$Mammal)") });
        $ic17$ = makeKeyword("REMOVAL-SUBSETOF-THESETOF-FORT-NEG");
        $ic18$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("subsetOf")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("subsetOf")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("TheSetOf")), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34500", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34486", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not\n  (#$subsetOf (#$TheSetOf <variable> <fully-bound>) <fort>))"), makeKeyword("EXAMPLE"), makeString("(#$not\n  (#$subsetOf \n    (#$TheSetOf ?MAMMAL \n      (#$and \n        (#$isa ?MAMMAL #$Mammal)\n        (#$colorOfObject ?MAMMAL #$RedColor)))\n    #$Dog))") });
        $ic19$ = makeKeyword("REMOVAL-GENLS-THECOLLECTIONOF-FORT-POS");
        $ic20$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("genls")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genls")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NAT"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("TheCollectionOf")), (SubLObject)makeKeyword("FULLY-BOUND"))), (SubLObject)makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34501", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34489", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$genls (#$TheCollectionOf <variable> <fully-bound>) <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$genls \n  (#$TheCollectionOf ?DOG \n    (#$and \n      (#$isa ?DOG #$Dog)\n      (#$colorOfObject ?DOG #$RedColor)))\n  #$Mammal)") });
        $ic21$ = makeKeyword("REMOVAL-GENLS-THECOLLECTIONOF-FORT-NEG");
        $ic22$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("genls")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genls")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NAT"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("TheCollectionOf")), (SubLObject)makeKeyword("FULLY-BOUND"))), (SubLObject)makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34501", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34490", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not\n  (#$genls (#$TheCollectionOf <variable> <fully-bound>) <fort>))"), makeKeyword("EXAMPLE"), makeString("(#$not\n  (#$genls \n    (#$TheCollectionOf ?MAMMAL \n      (#$and \n        (#$isa ?MAMMAL #$Mammal)\n        (#$colorOfObject ?MAMMAL #$RedColor)))\n    #$Dog))") });
        $ic23$ = makeKeyword("REMOVAL-SUBSETOF-THESETOF-THESETOF-POS");
        $ic24$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("subsetOf")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("subsetOf")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("TheSetOf")), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("TheSetOf")), (SubLObject)makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34502", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34491", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$subsetOf \n  (#$TheSetOf <variable> <fully-bound>) \n  (#$TheSetOf <variable> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$subsetOf \n  (#$TheSetOf ?DOG \n    (#$and \n      (#$isa ?DOG #$Dog)\n      (#$colorOfObject ?DOG #$RedColor)))\n  (#$TheSetOf ?MAMMAL\n    (#$and \n      (#$isa ?MAMMAL #$Mammal)\n      (#$colorOfObject ?MAMMAL #$RedColor))))") });
        $ic25$ = makeKeyword("REMOVAL-SUBSETOF-THESETOF-THESETOF-NEG");
        $ic26$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("subsetOf")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("subsetOf")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("TheSetOf")), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("TheSetOf")), (SubLObject)makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34502", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34492", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not \n  (#$subsetOf \n    (#$TheSetOf <variable> <fully-bound>) \n    (#$TheSetOf <variable> <fully-bound>)))"), makeKeyword("EXAMPLE"), makeString("(#$not\n  (#$subsetOf \n    (#$TheSetOf ?MAMMAL\n      (#$and \n        (#$isa ?MAMMAL #$Mammal)\n        (#$colorOfObject ?MAMMAL #$RedColor)))\n    (#$TheSetOf ?DOG \n      (#$and \n        (#$isa ?DOG #$Dog)\n        (#$colorOfObject ?DOG #$RedColor)))))") });
        $ic27$ = makeKeyword("REMOVAL-GENLS-THECOLLECTIONOF-THECOLLECTIONOF-POS");
        $ic28$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("genls")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genls")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NAT"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("TheCollectionOf")), (SubLObject)makeKeyword("FULLY-BOUND"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NAT"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("TheCollectionOf")), (SubLObject)makeKeyword("FULLY-BOUND")))), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("SUPPLANTS"), ConsesLow.list((SubLObject)makeKeyword("REMOVAL-GENLS-THECOLLECTIONOF-FORT-POS")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34503", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34494", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$genls \n  (#$TheCollectionOf <variable> <fully-bound>) \n  (#$TheCollectionOf <variable> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$genls \n  (#$TheCollectionOf ?DOG \n    (#$and \n      (#$isa ?DOG #$Dog)\n      (#$colorOfObject ?DOG #$RedColor)))\n  (#$TheCollectionOf ?MAMMAL\n    (#$and \n      (#$isa ?MAMMAL #$Mammal)\n      (#$colorOfObject ?MAMMAL #$RedColor))))") });
        $ic29$ = makeKeyword("REMOVAL-GENLS-THECOLLECTIONOF-THECOLLECTIONOF-NEG");
        $ic30$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("genls")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genls")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NAT"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("TheCollectionOf")), (SubLObject)makeKeyword("FULLY-BOUND"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NAT"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("TheCollectionOf")), (SubLObject)makeKeyword("FULLY-BOUND")))), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("SUPPLANTS"), ConsesLow.list((SubLObject)makeKeyword("REMOVAL-GENLS-THECOLLECTIONOF-FORT-NEG")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34503", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34495", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not \n  (#$genls \n    (#$TheCollectionOf <variable> <fully-bound>) \n    (#$TheCollectionOf <variable> <fully-bound>)))"), makeKeyword("EXAMPLE"), makeString("(#$not\n  (#$genls \n    (#$TheCollectionOf ?MAMMAL\n      (#$and \n        (#$isa ?MAMMAL #$Mammal)\n        (#$colorOfObject ?MAMMAL #$RedColor)))\n    (#$TheCollectionOf ?DOG \n      (#$and \n        (#$isa ?DOG #$Dog)\n        (#$colorOfObject ?DOG #$RedColor)))))") });
        $ic31$ = makeKeyword("CODE");
        $ic32$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("subsetOf")), constant_handles_oc.f8479((SubLObject)makeString("TheEmptySet")), (SubLObject)makeSymbol("?SET"));
        $ic33$ = constant_handles_oc.f8479((SubLObject)makeString("BaseKB"));
        $ic34$ = makeKeyword("REMOVAL-SUBSETOF-THEEMPTYSET-SET-OR-COLLECTION");
        $ic35$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("subsetOf")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("subsetOf")), constant_handles_oc.f8479((SubLObject)makeString("TheEmptySet")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("SET-OR-COLLECTION?")))), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34497", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$subsetOf #$TheEmptySet <fully-bound>)\n    where <fully-bound> arg2 is also a #$Set-Mathematical or a #$Collection"), makeKeyword("EXAMPLE"), makeString(" (#$subsetOf #$TheEmptySet #$TheEmptySet)\n\n  (#$subsetOf \n  #$TheEmptySet\n  (#$TheSet #$isa #$Thing #$Collection))\n\n  (#$subsetOf \n  #$TheEmptySet\n  (#$TheSetOf ?DOG \n    (#$and \n      (#$isa ?DOG #$Dog)\n      (#$colorOfObject ?DOG #$RedColor))))\n") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 167 ms
	
	Decompiled with Procyon 0.5.32.
*/