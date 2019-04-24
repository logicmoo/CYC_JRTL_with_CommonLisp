package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0486 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0486";
    public static final String myFingerPrint = "3c13f9a4ac913151468e97d02e5b938717e0f8d9e1cf2149036215bfd98fba4b";
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLObject $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
    
    public static SubLObject f31942(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = module0202.f12751(var1);
        final SubLObject var4 = module0202.f12751(var2);
        final SubLObject var5 = module0279.f18513(var3, (SubLObject)module0486.$ic4$);
        SubLObject var6 = (SubLObject)module0486.NIL;
        SubLObject var7 = (SubLObject)module0486.NIL;
        SubLObject var8_9 = (SubLObject)module0486.NIL;
        SubLObject var8 = (SubLObject)module0486.NIL;
        SubLObject var11_12 = (SubLObject)module0486.NIL;
        var7 = var3;
        var8_9 = var7.first();
        var8 = var4;
        var11_12 = var8.first();
        while (module0486.NIL != var8 || module0486.NIL != var7) {
            final SubLObject var9 = Sequences.substitute(var5, var8_9, var11_12, (SubLObject)module0486.EQUAL, (SubLObject)module0486.UNPROVIDED, (SubLObject)module0486.UNPROVIDED, (SubLObject)module0486.UNPROVIDED, (SubLObject)module0486.UNPROVIDED);
            if (module0486.NIL != var6) {
                if (!var6.equal(var9)) {
                    return (SubLObject)module0486.NIL;
                }
            }
            else {
                var6 = var9;
            }
            var7 = var7.rest();
            var8_9 = var7.first();
            var8 = var8.rest();
            var11_12 = var8.first();
        }
        return (SubLObject)module0486.T;
    }
    
    public static SubLObject f31943(final SubLObject var14, SubLObject var15) {
        if (var15 == module0486.UNPROVIDED) {
            var15 = (SubLObject)module0486.NIL;
        }
        return f31944();
    }
    
    public static SubLObject f31944() {
        final SubLObject var16 = module0191.f11990((SubLObject)module0486.$ic5$, (SubLObject)module0486.$ic6$, module0486.$ic7$, (SubLObject)module0486.$ic8$);
        final SubLObject var17 = (SubLObject)module0486.NIL;
        return Values.values(var16, var17);
    }
    
    public static SubLObject f31945(final SubLObject var18, SubLObject var19) {
        if (var19 == module0486.UNPROVIDED) {
            var19 = (SubLObject)module0486.NIL;
        }
        final SubLThread var20 = SubLProcess.currentSubLThread();
        final SubLObject var21 = module0205.f13387(var18, (SubLObject)module0486.UNPROVIDED);
        final SubLObject var22 = module0202.f12751(module0205.f13388(var18, (SubLObject)module0486.UNPROVIDED));
        final SubLObject var23 = f31946(var22);
        var20.resetMultipleValues();
        final SubLObject var24 = module0235.f15474(var21, var23, (SubLObject)module0486.T, (SubLObject)module0486.T);
        final SubLObject var25 = var20.secondMultipleValue();
        var20.resetMultipleValues();
        if (module0486.NIL != var24) {
            module0347.f23330(f31944(), var24, var25);
        }
        return (SubLObject)module0486.NIL;
    }
    
    public static SubLObject f31946(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)module0486.NIL;
        SubLObject var7 = (SubLObject)module0486.NIL;
        SubLObject var8 = (SubLObject)module0486.NIL;
        SubLObject var9 = (SubLObject)module0486.NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)module0486.NIL;
        var11 = var10.first();
        while (module0486.NIL != var10) {
            if (module0486.NIL != var6) {
                if (!var9.eql(module0202.f12725(var11, (SubLObject)module0486.UNPROVIDED))) {
                    return (SubLObject)module0486.NIL;
                }
                var5.resetMultipleValues();
                final SubLObject var29_30 = f31947(var6, var11, var7, var8);
                final SubLObject var31_32 = var5.secondMultipleValue();
                var5.resetMultipleValues();
                var8 = var29_30;
                var7 = var31_32;
                if (var7.eql((SubLObject)module0486.ZERO_INTEGER) || module0486.NIL == var8) {
                    return (SubLObject)module0486.NIL;
                }
            }
            var9 = module0202.f12725(var11, (SubLObject)module0486.UNPROVIDED);
            var6 = var11;
            var10 = var10.rest();
            var11 = var10.first();
        }
        var5.resetMultipleValues();
        final SubLObject var33_34 = f31947(var6, var4.first(), var7, var8);
        final SubLObject var35_36 = var5.secondMultipleValue();
        var5.resetMultipleValues();
        var8 = var33_34;
        var7 = var35_36;
        return module0202.f12787(Sequences.nreverse(var8), (SubLObject)module0486.UNPROVIDED);
    }
    
    public static SubLObject f31947(final SubLObject var37, final SubLObject var38, final SubLObject var39, SubLObject var26) {
        SubLObject var40 = (SubLObject)module0486.NIL;
        SubLObject var41 = (SubLObject)module0486.NIL;
        if (module0486.NIL != var37) {
            var40 = f31948(var37, var38, (SubLObject)module0486.EQUAL);
            if (module0486.NIL != var39 && module0486.NIL == module0035.f1995(var40, var39, (SubLObject)module0486.UNPROVIDED)) {
                return Values.values((SubLObject)module0486.NIL, (SubLObject)module0486.NIL);
            }
            var41 = Sequences.length(var40);
            if (module0486.NIL == module0035.f1997(var40)) {
                var40 = module0035.f2269(var40, (SubLObject)module0486.UNPROVIDED, (SubLObject)module0486.UNPROVIDED, (SubLObject)module0486.UNPROVIDED, (SubLObject)module0486.UNPROVIDED, (SubLObject)module0486.UNPROVIDED);
            }
            if (module0486.NIL != module0035.f1997(var40)) {
                var40 = var40.first();
            }
            else {
                var40 = module0202.f12787(Sequences.nreverse(var40), (SubLObject)module0486.UNPROVIDED);
            }
            var26 = (SubLObject)ConsesLow.cons(var40, var26);
        }
        return Values.values(var26, var41);
    }
    
    public static SubLObject f31948(final SubLObject var41, final SubLObject var42, SubLObject var43) {
        if (var43 == module0486.UNPROVIDED) {
            var43 = (SubLObject)module0486.EQL;
        }
        SubLObject var44 = (SubLObject)module0486.NIL;
        SubLObject var45 = (SubLObject)module0486.NIL;
        SubLObject var46_47 = (SubLObject)module0486.NIL;
        SubLObject var46 = (SubLObject)module0486.NIL;
        SubLObject var49_50 = (SubLObject)module0486.NIL;
        var45 = var41;
        var46_47 = var45.first();
        var46 = var42;
        var49_50 = var46.first();
        while (module0486.NIL != var46 || module0486.NIL != var45) {
            if (module0486.NIL == Functions.funcall(var43, var46_47, var49_50)) {
                var44 = (SubLObject)ConsesLow.cons(var46_47, var44);
            }
            var45 = var45.rest();
            var46_47 = var45.first();
            var46 = var46.rest();
            var49_50 = var46.first();
        }
        return Sequences.nreverse(var44);
    }
    
    public static SubLObject f31949(final SubLObject var18, SubLObject var19) {
        if (var19 == module0486.UNPROVIDED) {
            var19 = (SubLObject)module0486.NIL;
        }
        final SubLObject var20 = module0205.f13387(var18, (SubLObject)module0486.UNPROVIDED);
        final SubLObject var21 = module0205.f13388(var18, (SubLObject)module0486.UNPROVIDED);
        final SubLObject var22 = module0193.f12067(var20);
        final SubLObject var23 = (SubLObject)((module0486.NIL == var22 && module0486.NIL != module0202.f12674(var20)) ? module0202.f12751(var20) : module0486.NIL);
        final SubLObject var24 = (SubLObject)((module0486.NIL != module0202.f12674(var21)) ? module0202.f12751(var21) : module0486.NIL);
        final SubLObject var25 = Sequences.length(var24);
        if (module0486.NIL == var24) {
            return (SubLObject)module0486.T;
        }
        if (var25.eql((SubLObject)module0486.ONE_INTEGER)) {
            return (SubLObject)module0486.T;
        }
        if (module0486.NIL == var22) {
            if (module0486.NIL == var23) {
                return (SubLObject)module0486.T;
            }
            final SubLObject var26 = Sequences.length(var23);
            if (!var26.eql(var25)) {
                return (SubLObject)module0486.T;
            }
        }
        return f31950(var23, var24, var22);
    }
    
    public static SubLObject f31950(final SubLObject var3, final SubLObject var4, final SubLObject var51) {
        SubLObject var52 = (SubLObject)module0486.NIL;
        SubLObject var53 = (SubLObject)module0486.NIL;
        SubLObject var8_56 = (SubLObject)module0486.NIL;
        SubLObject var54 = (SubLObject)module0486.NIL;
        SubLObject var11_58 = (SubLObject)module0486.NIL;
        var53 = var3;
        var8_56 = var53.first();
        var54 = var4;
        var11_58 = var54.first();
        while (module0486.NIL != var54 || module0486.NIL != var53) {
            if (module0486.NIL == var51 && module0486.NIL == Sequences.find(var8_56, var11_58, (SubLObject)module0486.EQUAL, (SubLObject)module0486.UNPROVIDED, (SubLObject)module0486.UNPROVIDED, (SubLObject)module0486.UNPROVIDED)) {
                return (SubLObject)module0486.T;
            }
            final SubLObject var55 = module0202.f12725(var11_58, (SubLObject)module0486.UNPROVIDED);
            if (module0486.NIL != var52) {
                if (!var55.eql(var52)) {
                    return (SubLObject)module0486.T;
                }
            }
            else {
                var52 = var55;
            }
            var53 = var53.rest();
            var8_56 = var53.first();
            var54 = var54.rest();
            var11_58 = var54.first();
        }
        return (SubLObject)module0486.NIL;
    }
    
    public static SubLObject f31951() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0486", "f31942", "S#35280", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0486", "f31943", "S#35281", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0486", "f31944", "S#35282", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0486", "f31945", "S#35283", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0486", "f31946", "S#35284", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0486", "f31947", "S#35285", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0486", "f31948", "S#35286", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0486", "f31949", "S#35287", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0486", "f31950", "S#35288", 3, 0, false);
        return (SubLObject)module0486.NIL;
    }
    
    public static SubLObject f31952() {
        return (SubLObject)module0486.NIL;
    }
    
    public static SubLObject f31953() {
        module0340.f22938(module0486.$ic0$);
        module0358.f23771((SubLObject)module0486.$ic1$, module0486.$ic0$, (SubLObject)module0486.TWO_INTEGER);
        module0340.f22941((SubLObject)module0486.$ic2$, (SubLObject)module0486.$ic3$);
        module0340.f22941((SubLObject)module0486.$ic9$, (SubLObject)module0486.$ic10$);
        module0340.f22941((SubLObject)module0486.$ic11$, (SubLObject)module0486.$ic12$);
        return (SubLObject)module0486.NIL;
    }
    
    public void declareFunctions() {
        f31951();
    }
    
    public void initializeVariables() {
        f31952();
    }
    
    public void runTopLevelForms() {
        f31953();
    }
    
    static {
        me = (SubLFile)new module0486();
        $ic0$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("isomorphicSentences"));
        $ic1$ = SubLObjectFactory.makeKeyword("POS");
        $ic2$ = SubLObjectFactory.makeKeyword("REMOVAL-ISOMORPHIC-SENTENCES-CHECK-POS");
        $ic3$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("isomorphicSentences")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isomorphicSentences")), (SubLObject)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#1887", "CYC"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isomorphicSentences")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#35289", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#35290", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#35289", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#35290", "CYC")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#35289", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#35290", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35280", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#35289", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#35290", "CYC")))), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("S#35281", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$isomorphicSentences (#$TheList . <fullybound>) (#$TheList . <fullybound>)  "), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$isomorphicSentences \n       (#$TheList #$Muffet #$Snoopy #$Molly) \n       (#$TheList (#$isa #$Muffet #$Dog) (#$isa #$Snoopy #$Dog) (#$isa #$Molly #$Dog)))") });
        $ic4$ = SubLObjectFactory.makeSymbol("?FOO");
        $ic5$ = SubLObjectFactory.makeKeyword("CODE");
        $ic6$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(new SubLObject[] { module0128.f8479((SubLObject)SubLObjectFactory.makeString("and")), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isomorphicSentences")), (SubLObject)SubLObjectFactory.makeSymbol("?TERM-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("?FORMULA-LIST")), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("integerBetween")), (SubLObject)module0486.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("?NUM-1"), (SubLObject)SubLObjectFactory.makeSymbol("?TERM-COUNT")), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("integerBetween")), (SubLObject)module0486.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("?NUM-2"), (SubLObject)SubLObjectFactory.makeSymbol("?TERM-COUNT")), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("evaluate")), (SubLObject)SubLObjectFactory.makeSymbol("?TERM-COUNT"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("LengthOfListFn")), (SubLObject)SubLObjectFactory.makeSymbol("?TERM-LIST"))), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("evaluate")), (SubLObject)SubLObjectFactory.makeSymbol("?TERM-1"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("NthInListFn")), (SubLObject)SubLObjectFactory.makeSymbol("?TERM-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("?NUM-1"))), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("evaluate")), (SubLObject)SubLObjectFactory.makeSymbol("?TERM-2"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("NthInListFn")), (SubLObject)SubLObjectFactory.makeSymbol("?TERM-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("?NUM-2"))), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("evaluate")), (SubLObject)SubLObjectFactory.makeSymbol("?FORMULA-1"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("NthInListFn")), (SubLObject)SubLObjectFactory.makeSymbol("?FORMULA-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("?NUM-1"))), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("evaluate")), (SubLObject)SubLObjectFactory.makeSymbol("?FORMULA-2"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("NthInListFn")), (SubLObject)SubLObjectFactory.makeSymbol("?FORMULA-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("?NUM-2"))) }), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("formulaSubstitutionFor")), (SubLObject)SubLObjectFactory.makeSymbol("?TERM-1"), (SubLObject)SubLObjectFactory.makeSymbol("?TERM-2"), (SubLObject)SubLObjectFactory.makeSymbol("?FORMULA-1"), (SubLObject)SubLObjectFactory.makeSymbol("?FORMULA-2")));
        $ic7$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $ic8$ = SubLObjectFactory.makeKeyword("TRUE-DEF");
        $ic9$ = SubLObjectFactory.makeKeyword("REMOVAL-ISOMORPHIC-SENTENCES-TERM-UNIFY");
        $ic10$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("isomorphicSentences")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isomorphicSentences")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE"), (SubLObject)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"))), (SubLObject)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), module0486.ONE_INTEGER, SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35283", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$isomorphicSentences <variable> (#$TheList . <fullybound>))  "), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$isomorphicSentences \n       ?X\n       (#$TheList (#$isa #$Muffet #$Dog) (#$isa #$Snoopy #$Dog) (#$isa #$Molly #$Dog)))") });
        $ic11$ = SubLObjectFactory.makeKeyword("REMOVAL-ISOMORPHIC-SENTENCES-PRUNE");
        $ic12$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("isomorphicSentences")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isomorphicSentences")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheEmptyList")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheEmptyList")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("S#35287", "CYC"), SubLObjectFactory.makeKeyword("EXCLUSIVE"), SubLObjectFactory.makeSymbol("S#35287", "CYC"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), module0486.ZERO_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("pruning module that handles\n    (#$isomorphicSentences #$TheEmptyList #$TheEmptyList)\n    (#$isomorphicSentences #$TheEmptyList (#$TheList . <fullybound>))\n    (#$isomorphicSentences (#$TheList . <fullybound>) #$TheEmptyList)\n\n    (#$isomorphicSentences <variable> (#$TheList . <fullybound>))\n     where in ARG2 has just one sentence or it has sentences with unequal arity.\n   \n   (#$isomorphicSentences (#$TheList . <fullybound>) (#$TheList . <fullybound>))\n    where in ARG2 has just one sentence or it has sentences with unequal arity\n    or the number of terms in ARG1 is different than the number of sentences in ARG2\n    or a term in ARG1 is not present in the corresponding sentence of ARG2.\n   "), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$isomorphicSentences #$TheEmptyList (#$TheList (#$isa #$Muffet #$Dog) (#$isa #$Molly Dog)))\n    (#$isomorphicSentences (#$TheList #$Muffet #$Molly) #$TheEmptyList)\n\n   (#$isomorphicSentences ?X (#$TheList (#$isa #$Muffet #$Dog)))\n   (#$isomorphicSentences ?X (#$TheList (#$isa #$Relation #$Collection) (#$backchainRequired #$Relation)))\n  \n   (#$isomorphicSentences (#$TheList #$isa) (#$TheList (#$isa #$Muffet #$Dog)))\n   (#$isomorphicSentences (#$TheList #$isa #$backchainRequired) \n         (#$TheList (#$isa #$Relation #$Collection) (#$backchainRequired #$Relation)))\n   (#$isomorphicSentences (#$TheList #$Muffet #$Molly #$Snoopy) (#$TheList (#$isa #$Muffet #$Dog) (#$isa #$Molly Dog)))\n   (#$isomorphicSentences (#$TheList #$Muffet #$Snoopy) (#$TheList (#$isa #$Muffet #$Dog) (#$isa #$Molly Dog)))\n") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0486.class
	Total time: 131 ms
	
	Decompiled with Procyon 0.5.32.
*/