package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0465 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0465";
    public static final String myFingerPrint = "fdb2f380e66a8821ff611aa2ca888c386f7a9488894f7861d7788024e017f286";
    public static SubLSymbol $g3670$;
    private static SubLSymbol $g3671$;
    public static SubLSymbol $g3672$;
    private static SubLSymbol $g3673$;
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLObject $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLObject $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLList $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLList $ic19$;
    private static final SubLList $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLList $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLObject $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLList $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLList $ic30$;
    private static final SubLList $ic31$;
    
    public static SubLObject f31502(final SubLObject var1, SubLObject var2) {
        if (var2 == module0465.UNPROVIDED) {
            var2 = (SubLObject)module0465.NIL;
        }
        return module0024.f1250();
    }
    
    public static SubLObject f31503(final SubLObject var3, final SubLObject var4) {
        assert module0465.NIL != Types.stringp(var3) : var3;
        assert module0465.NIL != Types.stringp(var4) : var4;
        return module0035.sublisp_boolean(module0045.f3140(var3, var4, (SubLObject)module0465.UNPROVIDED, (SubLObject)module0465.UNPROVIDED));
    }
    
    public static SubLObject f31504(final SubLObject var1, final SubLObject var2) {
        return f31505(var1, var2, (SubLObject)module0465.NIL);
    }
    
    public static SubLObject f31505(final SubLObject var1, final SubLObject var2, final SubLObject var5) {
        final SubLObject var6 = module0205.f13203(var1, (SubLObject)module0465.UNPROVIDED);
        final SubLObject var7 = module0205.f13204(var1, (SubLObject)module0465.UNPROVIDED);
        final SubLObject var8 = Numbers.subtract(module0202.f12725(var1, (SubLObject)module0465.UNPROVIDED), (SubLObject)module0465.TWO_INTEGER);
        final SubLObject var9 = module0045.f3147(var6, var7, var5);
        final SubLObject var10 = module0202.f12720(module0205.f13132(var1), (SubLObject)ConsesLow.list(var6, var7), (SubLObject)module0465.UNPROVIDED);
        final SubLObject var11 = (SubLObject)module0465.NIL;
        SubLObject var12;
        SubLObject var13;
        SubLObject var14;
        SubLObject var15;
        for (var12 = Sequences.length(var9), var13 = (SubLObject)module0465.NIL, var13 = (SubLObject)module0465.ZERO_INTEGER; var13.numL(var12); var13 = Numbers.add(var13, (SubLObject)module0465.ONE_INTEGER)) {
            var14 = ConsesLow.nth(var13, var9);
            var15 = Sequences.cconcatenate(var10, var14);
            module0347.f23330(module0191.f11990((SubLObject)module0465.$ic12$, var15, module0465.$ic3$, (SubLObject)module0465.$ic13$), module0235.f15475(var1, var15, (SubLObject)module0465.T, (SubLObject)module0465.UNPROVIDED), (SubLObject)module0465.UNPROVIDED);
        }
        return (SubLObject)module0465.NIL;
    }
    
    public static SubLObject f31506(final SubLObject var1, SubLObject var2) {
        if (var2 == module0465.UNPROVIDED) {
            var2 = (SubLObject)module0465.NIL;
        }
        return module0024.f1250();
    }
    
    public static SubLObject f31507(final SubLObject var3, final SubLObject var4) {
        assert module0465.NIL != Types.stringp(var3) : var3;
        assert module0465.NIL != Types.stringp(var4) : var4;
        return module0035.sublisp_boolean(module0045.f3140(var3, var4, (SubLObject)module0465.$ic20$, (SubLObject)module0465.UNPROVIDED));
    }
    
    public static SubLObject f31508(final SubLObject var1, final SubLObject var2) {
        return f31505(var1, var2, (SubLObject)module0465.$ic20$);
    }
    
    public static SubLObject f31509(final SubLObject var16) {
        return f31510(var16, (SubLObject)module0465.UNPROVIDED);
    }
    
    public static SubLObject f31510(final SubLObject var16, SubLObject var5) {
        if (var5 == module0465.UNPROVIDED) {
            var5 = (SubLObject)module0465.NIL;
        }
        SubLObject var17 = (SubLObject)module0465.NIL;
        SubLObject var18 = (SubLObject)module0465.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var16, var16, (SubLObject)module0465.$ic30$);
        var17 = var16.first();
        SubLObject var19 = var16.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var19, var16, (SubLObject)module0465.$ic30$);
        var18 = var19.first();
        var19 = var19.rest();
        final SubLObject var20 = (SubLObject)(var19.isCons() ? var19.first() : module0465.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var19, var16, (SubLObject)module0465.$ic30$);
        var19 = var19.rest();
        final SubLObject var21 = (SubLObject)(var19.isCons() ? var19.first() : module0465.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var19, var16, (SubLObject)module0465.$ic30$);
        var19 = var19.rest();
        if (module0465.NIL == var19) {
            final SubLObject var22 = module0045.f3140(var17, var18, var5, (SubLObject)module0465.UNPROVIDED);
            SubLObject var23 = (SubLObject)module0465.NIL;
            SubLObject var24 = var22;
            SubLObject var25 = (SubLObject)module0465.NIL;
            var25 = var24.first();
            while (module0465.NIL != var24) {
                SubLObject var27_28;
                final SubLObject var25_26 = var27_28 = var25;
                SubLObject var26 = (SubLObject)module0465.NIL;
                SubLObject var27 = (SubLObject)module0465.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var27_28, var25_26, (SubLObject)module0465.$ic31$);
                var26 = var27_28.first();
                var27_28 = (var27 = var27_28.rest());
                final SubLObject var28 = Numbers.subtract(var27, var26);
                final SubLObject var29 = module0202.f12720(module0465.$ic24$, var16, (SubLObject)module0465.UNPROVIDED);
                final SubLObject var30 = module0202.f12720(module0465.$ic24$, (SubLObject)ConsesLow.list(var17, var18, var26, var28), (SubLObject)module0465.UNPROVIDED);
                final SubLObject var31 = module0235.f15476(var29, var30, (SubLObject)module0465.UNPROVIDED, (SubLObject)module0465.UNPROVIDED);
                if (module0465.NIL != var31) {
                    var23 = (SubLObject)ConsesLow.cons(var31, var23);
                }
                var24 = var24.rest();
                var25 = var24.first();
            }
            return module0052.f3709(var23);
        }
        cdestructuring_bind.cdestructuring_bind_error(var16, (SubLObject)module0465.$ic30$);
        return (SubLObject)module0465.NIL;
    }
    
    public static SubLObject f31511() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0465", "f31502", "S#34827", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0465", "f31503", "S#34828", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0465", "f31504", "S#34829", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0465", "f31505", "S#34830", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0465", "f31506", "S#34831", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0465", "f31507", "S#34832", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0465", "f31508", "S#34833", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0465", "f31509", "S#34834", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0465", "f31510", "S#34835", 1, 1, false);
        return (SubLObject)module0465.NIL;
    }
    
    public static SubLObject f31512() {
        module0465.$g3670$ = SubLFiles.deflexical("S#34836", (module0465.NIL != Symbols.boundp((SubLObject)module0465.$ic2$)) ? module0465.$g3670$.getGlobalValue() : module0465.$ic3$);
        module0465.$g3671$ = SubLFiles.defparameter("S#34837", module0018.$g659$.getGlobalValue());
        module0465.$g3672$ = SubLFiles.deflexical("S#34838", (module0465.NIL != Symbols.boundp((SubLObject)module0465.$ic15$)) ? module0465.$g3672$.getGlobalValue() : module0465.$ic3$);
        module0465.$g3673$ = SubLFiles.defparameter("S#34839", module0018.$g659$.getGlobalValue());
        return (SubLObject)module0465.NIL;
    }
    
    public static SubLObject f31513() {
        module0340.f22938(module0465.$ic0$);
        module0358.f23771((SubLObject)module0465.$ic1$, module0465.$ic0$, (SubLObject)module0465.ONE_INTEGER);
        module0358.f23771((SubLObject)module0465.$ic1$, module0465.$ic0$, (SubLObject)module0465.TWO_INTEGER);
        module0003.f57((SubLObject)module0465.$ic2$);
        module0132.f8593((SubLObject)module0465.$ic2$, module0465.$ic0$);
        module0340.f22941((SubLObject)module0465.$ic4$, (SubLObject)module0465.$ic5$);
        module0340.f22941((SubLObject)module0465.$ic6$, (SubLObject)module0465.$ic7$);
        module0340.f22941((SubLObject)module0465.$ic9$, (SubLObject)module0465.$ic10$);
        module0012.f419((SubLObject)module0465.$ic11$);
        module0340.f22938(module0465.$ic14$);
        module0358.f23771((SubLObject)module0465.$ic1$, module0465.$ic14$, (SubLObject)module0465.ONE_INTEGER);
        module0358.f23771((SubLObject)module0465.$ic1$, module0465.$ic14$, (SubLObject)module0465.TWO_INTEGER);
        module0003.f57((SubLObject)module0465.$ic15$);
        module0132.f8593((SubLObject)module0465.$ic15$, module0465.$ic14$);
        module0340.f22941((SubLObject)module0465.$ic16$, (SubLObject)module0465.$ic17$);
        module0340.f22941((SubLObject)module0465.$ic18$, (SubLObject)module0465.$ic19$);
        module0340.f22941((SubLObject)module0465.$ic21$, (SubLObject)module0465.$ic22$);
        module0012.f419((SubLObject)module0465.$ic23$);
        module0340.f22938(module0465.$ic24$);
        module0340.f22946(module0465.$ic24$, (SubLObject)module0465.$ic25$);
        module0340.f22944(module0465.$ic24$, (SubLObject)module0465.$ic26$);
        module0358.f23771((SubLObject)module0465.$ic1$, module0465.$ic24$, (SubLObject)module0465.ONE_INTEGER);
        module0358.f23771((SubLObject)module0465.$ic1$, module0465.$ic24$, (SubLObject)module0465.TWO_INTEGER);
        module0340.f22941((SubLObject)module0465.$ic27$, (SubLObject)module0465.$ic28$);
        module0012.f419((SubLObject)module0465.$ic29$);
        return (SubLObject)module0465.NIL;
    }
    
    public void declareFunctions() {
        f31511();
    }
    
    public void initializeVariables() {
        f31512();
    }
    
    public void runTopLevelForms() {
        f31513();
    }
    
    static {
        me = (SubLFile)new module0465();
        module0465.$g3670$ = null;
        module0465.$g3671$ = null;
        module0465.$g3672$ = null;
        module0465.$g3673$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("regexStringMatch"));
        $ic1$ = SubLObjectFactory.makeKeyword("POS");
        $ic2$ = SubLObjectFactory.makeSymbol("S#34836", "CYC");
        $ic3$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $ic4$ = SubLObjectFactory.makeKeyword("REMOVAL-REGEX-STRING-MATCH-POS");
        $ic5$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("regexStringMatch")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("regexStringMatch")), (SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeKeyword("STRING")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("S#34827", "CYC"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#34837", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("CHECK"), module0465.T, SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("regexStringMatch")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#2346", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#1625", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#2346", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#1625", "CYC")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#34828", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#2346", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#1625", "CYC"))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("OPAQUE"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("S#34836", "CYC"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$regexStringMatch <regular-expression string> <data string>)\n    when <data string> matches the regular expression in <regular-expression string>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$regexStringMatch \"[FD]og\" \"Dog\")") });
        $ic6$ = SubLObjectFactory.makeKeyword("REMOVAL-REGEX-STRING-MATCH-NEG");
        $ic7$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("regexStringMatch")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("regexStringMatch")), (SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeKeyword("STRING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#34837", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("CHECK"), module0465.T, SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("regexStringMatch")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#2346", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#1625", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#2346", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#1625", "CYC")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#33876", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#34828", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#2346", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#1625", "CYC")))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("OPAQUE"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("S#34836", "CYC"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$regexStringMatch <regular-expression string> <data string>))\n    when <data string> doesn't match the regular expression in <regular-expression string>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$regexStringMatch \"[FD]og\" \"Log\"))") });
        $ic8$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic9$ = SubLObjectFactory.makeKeyword("REMOVAL-REGEX-STRING-MATCH-WITH-BINDINGS-POS");
        $ic10$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("regexStringMatch")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.listS(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("regexStringMatch")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#34837", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34829", "CYC"), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("OPAQUE"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("BaseKB")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$regexStringMatch <regular-expression string> <data string> <vars>))\n    holds when <vars> is the captured matches when <regular-expression string> is applied to <data string>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$regexStringMatch \"dog(.*)mice\" \"dogs hate mice\" \"s hate \")") });
        $ic11$ = SubLObjectFactory.makeSymbol("S#34829", "CYC");
        $ic12$ = SubLObjectFactory.makeKeyword("OPAQUE");
        $ic13$ = SubLObjectFactory.makeKeyword("TRUE-MON");
        $ic14$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("regexStringMatch-CaseInsensitive"));
        $ic15$ = SubLObjectFactory.makeSymbol("S#34838", "CYC");
        $ic16$ = SubLObjectFactory.makeKeyword("REMOVAL-REGEX-STRING-MATCH-CASE-INSENSITIVE-POS");
        $ic17$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("regexStringMatch-CaseInsensitive")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("regexStringMatch-CaseInsensitive")), (SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeKeyword("STRING")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("S#34831", "CYC"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#34839", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("CHECK"), module0465.T, SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("regexStringMatch-CaseInsensitive")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#2346", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#1625", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#2346", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#1625", "CYC")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#34832", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#2346", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#1625", "CYC"))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("OPAQUE"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("S#34838", "CYC"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$regexStringMatch-CaseInsensitive <regular-expression string> <data string>)\n    when <data string> matches the regular expression in <regular-expression string>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$regexStringMatch-CaseInsensitive \"[fd]OG\" \"Dog\")") });
        $ic18$ = SubLObjectFactory.makeKeyword("REMOVAL-REGEX-STRING-MATCH-CASE-INSENSITIVE-NEG");
        $ic19$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("regexStringMatch-CaseInsensitive")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("regexStringMatch-CaseInsensitive")), (SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeKeyword("STRING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#34839", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("CHECK"), module0465.T, SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("regexStringMatch-CaseInsensitive")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#2346", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#1625", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#2346", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#1625", "CYC")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#33876", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#34832", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#2346", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#1625", "CYC")))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("OPAQUE"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("S#34838", "CYC"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$regexStringMatch-CaseInsensitive <regular-expression string> <data string>))\n    when <data string> doesn't match the regular expression in <regular-expression string>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$regexStringMatch-CaseInsensitive \"[fd]OG\" \"Log\"))") });
        $ic20$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CASELESS"));
        $ic21$ = SubLObjectFactory.makeKeyword("REMOVAL-REGEX-STRING-MATCH-WITH-BINDINGS-CASE-INSENSITIVE-POS");
        $ic22$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("regexStringMatch-CaseInsensitive")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.listS(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("regexStringMatch-CaseInsensitive")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#34837", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34833", "CYC"), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("OPAQUE"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("BaseKB")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$regexStringMatch-CaseInsensitive <regular-expression string> <data string> <vars>))\n    holds when <vars> is the captured matches when <regular-expression string> is applied case-insensitively \n    to <data string>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$regexStringMatch-CaseInsensitive \"Dog(.*)mice\" \"dogs hate mice\" \"s hate \")") });
        $ic23$ = SubLObjectFactory.makeSymbol("S#34833", "CYC");
        $ic24$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("regexSubstringMatch"));
        $ic25$ = SubLObjectFactory.makeKeyword("META-REMOVAL-COMPLETELY-DECIDABLE-POS");
        $ic26$ = SubLObjectFactory.makeKeyword("REMOVAL-COMPLETELY-DECIDABLE-NEG");
        $ic27$ = SubLObjectFactory.makeKeyword("REMOVAL-REGEX-SUBSTRING-MATCH-POS");
        $ic28$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("regexSubstringMatch")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("regexSubstringMatch")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("S#34827", "CYC"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#34837", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("regexSubstringMatch")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#2346", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#1625", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#134", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#34840", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#2346", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#1625", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#134", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#34840", "CYC")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#34834", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#18075", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("regexSubstringMatch")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#2346", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#1625", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#134", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#34840", "CYC")))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("OPAQUE"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("S#34836", "CYC"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$regexSubstringMatch <regular-expression string> <data string> <data index> <data span>)\n    when <data string> matches the regular expression in <regular-expression string> starting\n    at index and continuing for span characters"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$regexSubstringMatch \"[FD]og\" \"Dog\" 0 3)") });
        $ic29$ = SubLObjectFactory.makeSymbol("S#34834", "CYC");
        $ic30$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#32", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1625", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#134", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#34840", "CYC"));
        $ic31$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#34841", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#34842", "CYC"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0465.class
	Total time: 170 ms
	
	Decompiled with Procyon 0.5.32.
*/