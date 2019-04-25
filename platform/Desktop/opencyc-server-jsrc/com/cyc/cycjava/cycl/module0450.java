package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0450 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0450";
    public static final String myFingerPrint = "fef98746ba2b18c68d4872c5492c321d1e183c0a0f79d3283c44084f4155bc05";
    private static SubLSymbol $g3583$;
    public static SubLSymbol $g3584$;
    public static SubLSymbol $g3585$;
    private static SubLSymbol $g3586$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLObject $ic7$;
    private static final SubLObject $ic8$;
    private static final SubLObject $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLObject $ic11$;
    private static final SubLString $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLList $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLList $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLList $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLList $ic25$;
    
    public static SubLObject f31009() {
        return $g3583$.getGlobalValue();
    }
    
    public static SubLObject f31010(final SubLObject var1) {
        return module0004.f104(var1, $g3583$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31011() {
        SubLObject var2 = (SubLObject)NIL;
        SubLObject var3 = f31009();
        SubLObject var4 = (SubLObject)NIL;
        var4 = var3.first();
        while (NIL != var3) {
            var2 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic1$, var4), var2);
            var3 = var3.rest();
            var4 = var3.first();
        }
        return (SubLObject)ConsesLow.cons((SubLObject)$ic2$, var2);
    }
    
    public static SubLObject f31012(final SubLObject var5) {
        assert NIL != module0361.f24009(var5) : var5;
        final SubLObject var6 = $g3584$.getGlobalValue();
        return module0057.f4175(var6);
    }
    
    public static SubLObject f31013(final SubLObject var7, final SubLObject var8) {
        return module0337.f22626((SubLObject)$ic5$, var7);
    }
    
    public static SubLObject f31014(final SubLObject var7, final SubLObject var8, final SubLObject var5) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        final SubLObject var10 = module0193.f12102(var7);
        final SubLObject var11 = module0307.f20765(var7, var8, (SubLObject)$ic6$, (SubLObject)T);
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14;
        for (var14 = module0066.f4838(module0067.f4891(var11)); NIL == module0066.f4841(var14); var14 = module0066.f4840(var14)) {
            var9.resetMultipleValues();
            final SubLObject var15 = module0066.f4839(var14);
            final SubLObject var16 = var9.secondMultipleValue();
            var9.resetMultipleValues();
            if (NIL != var15) {
                final SubLObject var17 = f31015(var7, var15, var16, var5);
                if (NIL == var17) {
                    return (SubLObject)NIL;
                }
                var13 = conses_high.subst(var15, var17, var13, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var13 = module0233.f15345(var15, var17, var13);
            }
        }
        module0066.f4842(var14);
        if (NIL != module0035.f2004(var13, var10)) {
            var12 = (SubLObject)ConsesLow.cons(var13, var12);
        }
        final SubLObject var18 = module0363.f24530(module0373.f26109());
        SubLObject var19;
        SubLObject var20;
        SubLObject var21;
        SubLObject var22;
        SubLObject var23;
        SubLObject var24;
        SubLObject var25;
        SubLObject var26;
        SubLObject var27;
        SubLObject var28;
        SubLObject var29;
        SubLObject var30;
        for (var19 = module0032.f1741(var18), var20 = (SubLObject)NIL, var20 = module0032.f1742(var19, var18); NIL == module0032.f1744(var19, var20); var20 = module0032.f1743(var20)) {
            var21 = module0032.f1745(var19, var20);
            if (NIL != module0032.f1746(var20, var21)) {
                var22 = var21;
                var23 = module0364.f24735(var22);
                var24 = (SubLObject)NIL;
                var24 = var23.first();
                while (NIL != var23) {
                    if (NIL != module0339.f22743((SubLObject)NIL, var22, var24)) {
                        var25 = module0364.f24736(var24);
                        var26 = module0364.f24737(var24);
                        var27 = module0363.f24509(var25);
                        var28 = module0193.f12102(var27);
                        if (var10.equal(var28)) {
                            var29 = module0363.f24537(var25);
                            var30 = module0066.f4844(var29);
                            var12 = ConsesLow.append(var12, var30);
                        }
                    }
                    var23 = var23.rest();
                    var24 = var23.first();
                }
            }
        }
        return Sequences.nreverse(var12);
    }
    
    public static SubLObject f31016(final SubLObject var15, final SubLObject var16, final SubLObject var7) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        if (NIL != $g3585$.getDynamicValue(var17)) {
            SubLObject var18 = (SubLObject)NIL;
            SubLObject var19 = (SubLObject)NIL;
            if (NIL != var16) {
                var18 = var16.first();
                var19 = conses_high.cadr(var16);
            }
            if (module0202.f12839(var7, (SubLObject)UNPROVIDED).numE((SubLObject)TWO_INTEGER)) {
                final SubLObject var20 = module0202.f12832(var7, (SubLObject)UNPROVIDED);
                final SubLObject var21 = module0202.f12834(var7, (SubLObject)UNPROVIDED);
                final SubLObject var22 = module0202.f12835(var7, (SubLObject)UNPROVIDED);
                final SubLObject var23 = var19.first();
                if (var15.eql(var21)) {
                    return module0202.f12769($ic7$, var23, var20, var22);
                }
                return module0202.f12769($ic8$, var23, var20, var21);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31017(final SubLObject var16, final SubLObject var5) {
        final SubLObject var17 = f31018(var16);
        if (NIL != var17) {
            final SubLObject var18 = module0507.f32383(var5);
            final SubLObject var19 = f31012(var5);
            final SubLObject var20 = module0202.f12769($ic9$, var18, var17, var19);
            return var20;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31015(final SubLObject var7, final SubLObject var15, final SubLObject var16, final SubLObject var5) {
        SubLObject var17 = (SubLObject)NIL;
        SubLObject var18 = (SubLObject)NIL;
        SubLObject var19 = (SubLObject)NIL;
        if (NIL != var16) {
            var17 = var16.first();
            var18 = conses_high.cadr(var16);
            var19 = conses_high.cddr(var16).first();
        }
        if (NIL != Sequences.find_if((SubLObject)$ic10$, var17, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        if (NIL != var18) {
            return f31016(var15, var16, var7);
        }
        return f31017(var16, var5);
    }
    
    public static SubLObject f31018(final SubLObject var16) {
        SubLObject var17 = (SubLObject)NIL;
        SubLObject var18 = (SubLObject)NIL;
        if (NIL != var16) {
            var17 = var16.first();
            var18 = conses_high.cadr(var16);
        }
        var17 = (SubLObject)ConsesLow.cons($ic11$, var17);
        if (NIL != var18) {
            return (SubLObject)NIL;
        }
        if (NIL == var17) {
            return Errors.error((SubLObject)$ic12$);
        }
        if (NIL != module0035.f1997(var17)) {
            return var17.first();
        }
        return module0035.f2378(var17, Symbols.symbol_function((SubLObject)$ic13$), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31019(final SubLObject var7, final SubLObject var8) {
        return module0307.f20760(var7, var8, (SubLObject)$ic6$);
    }
    
    public static SubLObject f31020(final SubLObject var7, final SubLObject var43) {
        return f31021(var7, var43);
    }
    
    public static SubLObject f31021(final SubLObject var7, SubLObject var43) {
        if (var43 == UNPROVIDED) {
            var43 = (SubLObject)$ic14$;
        }
        final SubLThread var44 = SubLProcess.currentSubLThread();
        final SubLObject var45 = module0373.f26113();
        final SubLObject var46 = module0147.$g2095$.getDynamicValue(var44);
        return (SubLObject)makeBoolean(NIL != var45 && NIL != module0361.f24171(var45) && NIL != module0536.f33285(var7, var46, var43));
    }
    
    public static SubLObject f31022(final SubLObject var7, final SubLObject var8, final SubLObject var43) {
        if (NIL != module0536.f33293(var7, var8, var43, (SubLObject)NIL)) {
            final SubLObject var44 = f31023(var7, var8, var43);
            module0347.f23330(var44, (SubLObject)NIL, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31023(final SubLObject var45, SubLObject var8, SubLObject var43) {
        if (var8 == UNPROVIDED) {
            var8 = module0147.$g2095$.getDynamicValue();
        }
        if (var43 == UNPROVIDED) {
            var43 = (SubLObject)NIL;
        }
        return module0191.f11990((SubLObject)$ic15$, (var43 == $ic14$) ? var45 : module0202.f12771(var45), var8, (SubLObject)$ic16$);
    }
    
    public static SubLObject f31024(final SubLObject var7, SubLObject var43) {
        if (var43 == UNPROVIDED) {
            var43 = (SubLObject)NIL;
        }
        return f31020(var7, var43);
    }
    
    public static SubLObject f31025(final SubLObject var7, SubLObject var43) {
        if (var43 == UNPROVIDED) {
            var43 = (SubLObject)NIL;
        }
        final SubLThread var44 = SubLProcess.currentSubLThread();
        final SubLObject var45 = module0147.$g2095$.getDynamicValue(var44);
        return f31022(var7, var45, var43);
    }
    
    public static SubLObject f31026(final SubLObject var7, final SubLObject var8, final SubLObject var43, final SubLObject var46) {
        SubLObject var48;
        final SubLObject var47 = var48 = f31014(var7, var8, var46);
        SubLObject var49 = (SubLObject)NIL;
        var49 = var48.first();
        while (NIL != var48) {
            final SubLObject var50 = module0233.f15362(var49, var7);
            SubLObject var51 = (SubLObject)NIL;
            if (NIL != module0536.f33293(var50, var8, var43, module0205.f13145((SubLObject)$ic19$, var50, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))) {
                var51 = f31023(var50, var8, (SubLObject)$ic14$);
                module0347.f23330(var51, var49, (SubLObject)UNPROVIDED);
            }
            var48 = var48.rest();
            var49 = var48.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31027(final SubLObject var7, SubLObject var43) {
        if (var43 == UNPROVIDED) {
            var43 = (SubLObject)NIL;
        }
        final SubLThread var44 = SubLProcess.currentSubLThread();
        final SubLObject var45 = module0373.f26113();
        final SubLObject var46 = module0147.$g2095$.getDynamicValue(var44);
        return f31026(var7, var46, var43, var45);
    }
    
    public static SubLObject f31028(final SubLObject var7, SubLObject var43) {
        if (var43 == UNPROVIDED) {
            var43 = (SubLObject)NIL;
        }
        final SubLObject var44 = module0373.f26113();
        SubLObject var45 = (SubLObject)NIL;
        if (NIL != var44 && NIL != module0361.f24171(var44) && NIL != module0205.f13145((SubLObject)$ic19$, var7, (SubLObject)T, (SubLObject)UNPROVIDED)) {
            var45 = (SubLObject)T;
        }
        return var45;
    }
    
    public static SubLObject f31029(final SubLObject var7, SubLObject var43) {
        if (var43 == UNPROVIDED) {
            var43 = (SubLObject)NIL;
        }
        return f31027(var7, var43);
    }
    
    public static SubLObject f31030(final SubLObject var7, SubLObject var43) {
        if (var43 == UNPROVIDED) {
            var43 = (SubLObject)NIL;
        }
        return f31020(var7, var43);
    }
    
    public static SubLObject f31031(final SubLObject var7, SubLObject var43) {
        if (var43 == UNPROVIDED) {
            var43 = (SubLObject)NIL;
        }
        final SubLThread var44 = SubLProcess.currentSubLThread();
        final SubLObject var45 = module0147.$g2095$.getDynamicValue(var44);
        return f31022(var7, var45, var43);
    }
    
    public static SubLObject f31032() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0450", "f31009", "S#34288", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0450", "f31010", "S#31807", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0450", "f31011", "S#26085", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0450", "f31012", "S#34289", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0450", "f31013", "S#34290", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0450", "f31014", "S#34291", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0450", "f31016", "S#34292", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0450", "f31017", "S#34293", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0450", "f31015", "S#34294", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0450", "f31018", "S#34295", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0450", "f31019", "S#34296", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0450", "f31020", "S#34297", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0450", "f31021", "S#34286", 1, 1, false);
        new $f31021$UnaryFunction();
        new $f31021$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0450", "f31022", "S#34298", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0450", "f31023", "S#34299", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0450", "f31024", "S#29810", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0450", "f31025", "S#34300", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0450", "f31026", "S#34301", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0450", "f31027", "S#34302", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0450", "f31028", "S#34303", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0450", "f31029", "S#34304", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0450", "f31030", "S#34305", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0450", "f31031", "S#34306", 1, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31033() {
        $g3583$ = SubLFiles.deflexical("S#34307", (SubLObject)$ic0$);
        $g3584$ = SubLFiles.deflexical("S#34308", (NIL != Symbols.boundp((SubLObject)$ic3$)) ? $g3584$.getGlobalValue() : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g3585$ = SubLFiles.defparameter("S#34309", (SubLObject)NIL);
        $g3586$ = SubLFiles.deflexical("S#34310", (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31034() {
        module0003.f57((SubLObject)$ic3$);
        module0340.f22941((SubLObject)$ic17$, (SubLObject)$ic18$);
        module0340.f22941((SubLObject)$ic20$, (SubLObject)$ic21$);
        module0340.f22941((SubLObject)$ic22$, (SubLObject)$ic23$);
        module0340.f22941((SubLObject)$ic24$, (SubLObject)$ic25$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f31032();
    }
    
    public void initializeVariables() {
        f31033();
    }
    
    public void runTopLevelForms() {
        f31034();
    }
    
    static {
        me = (SubLFile)new module0450();
        $g3583$ = null;
        $g3584$ = null;
        $g3585$ = null;
        $g3586$ = null;
        $ic0$ = ConsesLow.list((SubLObject)makeKeyword("REMOVAL-ABDUCTION-POS-UNIFY"), (SubLObject)makeKeyword("REMOVAL-ABDUCTION-POS-CHECK"), (SubLObject)makeKeyword("REMOVAL-EXCLUSIVE-ABDUCTION-POS"));
        $ic1$ = makeKeyword("NOT");
        $ic2$ = makeKeyword("AND");
        $ic3$ = makeSymbol("S#34308", "CYC");
        $ic4$ = makeSymbol("S#26782", "CYC");
        $ic5$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#12600", "CYC")));
        $ic6$ = makeSymbol("VARIABLE-P");
        $ic7$ = constant_handles_oc.f8479((SubLObject)makeString("SubcollectionOfWithRelationToFn"));
        $ic8$ = constant_handles_oc.f8479((SubLObject)makeString("SubcollectionOfWithRelationFromFn"));
        $ic9$ = constant_handles_oc.f8479((SubLObject)makeString("AbducedTermFn"));
        $ic10$ = makeSymbol("S#34311", "CYC");
        $ic11$ = constant_handles_oc.f8479((SubLObject)makeString("Individual"));
        $ic12$ = makeString("no isa constraints for abduced type");
        $ic13$ = makeSymbol("S#17515", "CYC");
        $ic14$ = makeKeyword("POS");
        $ic15$ = makeKeyword("ABDUCTION");
        $ic16$ = makeKeyword("TRUE-DEF");
        $ic17$ = makeKeyword("REMOVAL-ABDUCTION-POS-CHECK");
        $ic18$ = ConsesLow.list(new SubLObject[] { makeKeyword("MODULE-SUBTYPE"), makeKeyword("ABDUCTION"), makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("S#29810", "CYC"), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34310", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34300", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(<fort> . <whatever>) where the asent is deemed abducible, \n    and the problem store allows abduction"), makeKeyword("EXAMPLE"), makeString("(#$competitors #$GeorgeWBush #$BillClinton)") });
        $ic19$ = makeSymbol("S#24006", "CYC");
        $ic20$ = makeKeyword("REMOVAL-ABDUCTION-POS-UNIFY");
        $ic21$ = ConsesLow.list(new SubLObject[] { makeKeyword("MODULE-SUBTYPE"), makeKeyword("ABDUCTION"), makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)ConsesLow.cons((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)ConsesLow.cons((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FULLY-BOUND")))), makeKeyword("REQUIRED"), makeSymbol("S#29810", "CYC"), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34310", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34302", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(<fort> . <whatever>) where the asent is deemed abducible, \n    and the problem store allows abduction"), makeKeyword("EXAMPLE"), makeString("(#$brothers #$GeorgeWBush ?BROTHER)") });
        $ic22$ = makeKeyword("REMOVAL-EXCLUSIVE-ABDUCTION-POS");
        $ic23$ = ConsesLow.list(new SubLObject[] { makeKeyword("MODULE-SUBTYPE"), makeKeyword("ABDUCTION"), makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)ConsesLow.cons((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TREE-FIND"), constant_handles_oc.f8479((SubLObject)makeString("AbducedTermFn")))), makeKeyword("EXCLUSIVE"), makeSymbol("S#34303", "CYC"), makeKeyword("REQUIRED"), makeSymbol("S#29810", "CYC"), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34310", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34304", "CYC"), makeKeyword("DOCUMENTATION"), makeString("apply only abduction on (<fort> . <whatever>) where the asent has an abduced term"), makeKeyword("EXAMPLE"), makeString("(#$brothers #$GeorgeWBush (#$AbducedTermFn (#$CycProblemStoreFn 1388) #$MaleAnimal 2))") });
        $ic24$ = makeKeyword("REMOVAL-ABDUCTION-NEG-CHECK");
        $ic25$ = ConsesLow.list(new SubLObject[] { makeKeyword("MODULE-SUBTYPE"), makeKeyword("ABDUCTION"), makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("S#34305", "CYC"), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34310", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34306", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (<fort> . <fully-bound>)) where the asent is deemed abducible, \n    and the problem store allows abduction"), makeKeyword("EXAMPLE"), makeString("(#$not (#$competitors #$GeorgeWBush #$BillClinton))") });
    }
    
    public static final class $f31021$UnaryFunction extends UnaryFunction
    {
        public $f31021$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34286"));
        }
        
        public SubLObject processItem(final SubLObject var34) {
            return f31021(var34, (SubLObject)$f31021$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f31021$BinaryFunction extends BinaryFunction
    {
        public $f31021$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34286"));
        }
        
        public SubLObject processItem(final SubLObject var34, final SubLObject var35) {
            return f31021(var34, var35);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 182 ms
	
	Decompiled with Procyon 0.5.32.
*/