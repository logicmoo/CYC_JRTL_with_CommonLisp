package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0187 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0187";
    public static final String myFingerPrint = "054e5dee9d089d92aeb57999efd83ab9f62937fcc02196e1d61e21bf9b185a01";
    public static SubLSymbol $g2233$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLInteger $ic2$;
    private static final SubLList $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLString $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    
    public static SubLObject f11722(final SubLObject var1, final SubLObject var2) {
        compatibility.default_struct_print_function(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f11723(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX14537_native.class) ? T : NIL);
    }
    
    public static SubLObject f11724(final SubLObject var1) {
        assert NIL != f11723(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f11725(final SubLObject var1) {
        assert NIL != f11723(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f11726(final SubLObject var1) {
        assert NIL != f11723(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f11727(final SubLObject var1, final SubLObject var4) {
        assert NIL != f11723(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f11728(final SubLObject var1, final SubLObject var4) {
        assert NIL != f11723(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f11729(final SubLObject var1, final SubLObject var4) {
        assert NIL != f11723(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f11730(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX14537_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic16$)) {
                f11727(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic17$)) {
                f11728(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic18$)) {
                f11729(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic19$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f11731(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic20$, (SubLObject)$ic21$, (SubLObject)THREE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic22$, (SubLObject)$ic16$, f11724(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic22$, (SubLObject)$ic17$, f11725(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic22$, (SubLObject)$ic18$, f11726(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic23$, (SubLObject)$ic21$, (SubLObject)THREE_INTEGER);
        return var11;
    }
    
    public static SubLObject f11732(final SubLObject var11, final SubLObject var12) {
        return f11731(var11, var12);
    }
    
    public static SubLObject f11733(final SubLObject var13, final SubLObject var14, final SubLObject var15) {
        SubLObject var16 = (SubLObject)NIL;
        var16 = f11730((SubLObject)UNPROVIDED);
        f11728(var16, var14);
        f11729(var16, var15);
        f11727(var16, (SubLObject)$ic25$);
        module0186.f11710(var13, var16);
        return var16;
    }
    
    public static SubLObject f11734(final SubLObject var13) {
        final SubLObject var14 = module0186.f11708(var13);
        if (NIL != f11723(var14)) {
            module0186.f11711(var13);
            f11727(var14, (SubLObject)NIL);
            f11728(var14, (SubLObject)NIL);
            f11729(var14, (SubLObject)NIL);
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f11735(final SubLObject var13) {
        return f11724(module0186.f11708(var13));
    }
    
    public static SubLObject f11736(final SubLObject var13) {
        return f11725(module0186.f11708(var13));
    }
    
    public static SubLObject f11737(final SubLObject var13) {
        return f11726(module0186.f11708(var13));
    }
    
    public static SubLObject f11738(final SubLObject var13, final SubLObject var17) {
        f11727(module0186.f11708(var13), var17);
        module0186.f11712(var13);
        return var13;
    }
    
    public static SubLObject f11739(final SubLObject var13, final SubLObject var18) {
        f11729(module0186.f11708(var13), var18);
        module0186.f11712(var13);
        return var13;
    }
    
    public static SubLObject f11740(final SubLObject var19, final SubLObject var2) {
        module0021.f1038(f11741(var19), var2);
        module0021.f1038(module0188.f11781(var19), var2);
        module0021.f1038(module0188.f11770(var19), var2);
        return var19;
    }
    
    public static SubLObject f11742(final SubLObject var19) {
        return f11743(f11741(var19), module0188.f11781(var19), module0188.f11770(var19));
    }
    
    public static SubLObject f11743(final SubLObject var20, final SubLObject var21, final SubLObject var15) {
        return (SubLObject)ConsesLow.list(var20, var21, var15);
    }
    
    public static SubLObject f11744(final SubLObject var19, final SubLObject var2) {
        final SubLObject var20 = deduction_handles_oc.f11649(var19);
        final SubLObject var21 = module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var22 = module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var23 = module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f11745(var20, var22, var23, var21);
        return var19;
    }
    
    public static SubLObject f11746(final SubLObject var13, final SubLObject var2) {
        final SubLObject var14 = module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var15 = module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var16 = module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return f11743(var14, var15, var16);
    }
    
    public static SubLObject f11745(final SubLObject var13, final SubLObject var21, final SubLObject var15, final SubLObject var20) {
        final SubLObject var22 = f11733(var13, var21, var15);
        f11727(var22, var20);
        return var13;
    }
    
    public static SubLObject f11747(final SubLObject var21, final SubLObject var15, final SubLObject var22, final SubLObject var23) {
        final SubLObject var24 = deduction_handles_oc.f11653();
        final SubLObject var25 = deduction_handles_oc.f11672(var24);
        f11748(var25, var24, var21, var15, var22, var23);
        return var24;
    }
    
    public static SubLObject f11748(final SubLObject var19, final SubLObject var24, final SubLObject var21, final SubLObject var15, final SubLObject var22, final SubLObject var23) {
        final SubLObject var25 = module0130.f8529(var22, var23);
        f11733(var24, var21, var15);
        f11749(var19, var25);
        if (NIL != assertion_handles_oc.f11035(var21)) {
            assertions_low_oc.f11259(var21, var19);
        }
        f11750(var19);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f11751(final SubLObject var24) {
        return deduction_handles_oc.f11672(var24);
    }
    
    public static SubLObject f11752(final SubLObject var19, final SubLObject var24, final SubLObject var21, final SubLObject var15, final SubLObject var22, final SubLObject var23) {
        final SubLObject var25 = module0130.f8529(var22, var23);
        f11733(var24, var21, var15);
        f11749(var19, var25);
        if (NIL != assertion_handles_oc.f11035(var21)) {
            assertions_low_oc.f11259(var21, var19);
        }
        f11750(var19);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f11750(final SubLObject var19) {
        assert NIL != deduction_handles_oc.f11659(var19) : var19;
        SubLObject var20 = f11753(var19);
        SubLObject var21 = (SubLObject)NIL;
        var21 = var20.first();
        while (NIL != var20) {
            if (NIL != assertion_handles_oc.f11035(var21)) {
                assertions_low_oc.f11270(var21, var19);
            }
            else if (NIL != module0179.f11424(var21)) {
                module0182.f11517(var21, var19);
            }
            var20 = var20.rest();
            var21 = var20.first();
        }
        return var19;
    }
    
    public static SubLObject f11754(final SubLObject var19) {
        final SubLObject var20 = deduction_handles_oc.f11649(var19);
        f11734(var20);
        deduction_handles_oc.f11652(var20);
        deduction_handles_oc.f11668(var19);
        return (SubLObject)T;
    }
    
    public static SubLObject f11755(final SubLObject var19) {
        assert NIL != deduction_handles_oc.f11659(var19) : var19;
        SubLObject var20 = f11753(var19);
        SubLObject var21 = (SubLObject)NIL;
        var21 = var20.first();
        while (NIL != var20) {
            if (NIL != assertion_handles_oc.f11041(var21, (SubLObject)UNPROVIDED)) {
                assertions_low_oc.f11271(var21, var19);
            }
            else if (NIL != module0179.f11430(var21, (SubLObject)UNPROVIDED)) {
                module0182.f11518(var21, var19);
            }
            var20 = var20.rest();
            var21 = var20.first();
        }
        return var19;
    }
    
    public static SubLObject f11749(final SubLObject var19, final SubLObject var17) {
        f11738(deduction_handles_oc.f11649(var19), var17);
        return var19;
    }
    
    public static SubLObject f11756(final SubLObject var19, final SubLObject var27) {
        final SubLObject var28 = module0191.f11924(var19);
        final SubLObject var29 = module0130.f8529(var28, var27);
        return f11749(var19, var29);
    }
    
    public static SubLObject f11757(final SubLObject var19, final SubLObject var18) {
        f11739(deduction_handles_oc.f11649(var19), var18);
        return var19;
    }
    
    public static SubLObject f11758(SubLObject var14, final SubLObject var15, final SubLObject var22) {
        SubLObject var23 = (SubLObject)NIL;
        if (NIL != module0191.f11952(var14)) {
            final SubLObject var24 = module0183.f11552(var14);
            if (NIL != module0179.f11424(var24)) {
                var14 = var24;
            }
        }
        if (NIL != assertion_handles_oc.f11035(var14)) {
            SubLObject var25;
            SubLObject var26;
            for (var25 = (SubLObject)NIL, var25 = module0178.f11299(var14); NIL == var23 && NIL != var25; var25 = var25.rest()) {
                var26 = var25.first();
                if (NIL != deduction_handles_oc.f11659(var26) && NIL != f11759(var26, var14, var15, var22)) {
                    var23 = var26;
                }
            }
        }
        else if (NIL != module0179.f11424(var14)) {
            SubLObject var25;
            SubLObject var26;
            SubLObject var27;
            for (var25 = (SubLObject)NIL, var25 = module0180.f11454(var14); NIL == var23 && NIL != var25; var25 = var25.rest()) {
                var26 = var25.first();
                if (NIL != deduction_handles_oc.f11659(var26)) {
                    var27 = module0182.f11516(var14);
                    if (NIL != f11759(var26, var27, var15, var22)) {
                        var23 = var26;
                    }
                }
            }
        }
        return var23;
    }
    
    public static SubLObject f11759(final SubLObject var19, final SubLObject var14, final SubLObject var15, SubLObject var22) {
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)$ic27$;
        }
        return (SubLObject)makeBoolean(var14.equal(module0188.f11781(var19)) && var22.eql(module0191.f11924(var19)) && NIL != module0188.f11779(var15, module0188.f11770(var19)));
    }
    
    public static SubLObject f11760(final SubLObject var19) {
        return f11736(deduction_handles_oc.f11649(var19));
    }
    
    public static SubLObject f11741(final SubLObject var19) {
        assert NIL != deduction_handles_oc.f11659(var19) : var19;
        return f11735(deduction_handles_oc.f11649(var19));
    }
    
    public static SubLObject f11753(final SubLObject var19) {
        return f11737(deduction_handles_oc.f11649(var19));
    }
    
    public static SubLObject f11761(final SubLObject var19) {
        return module0130.f8524(f11741(var19));
    }
    
    public static SubLObject f11762(final SubLObject var19) {
        return module0130.f8523(f11741(var19));
    }
    
    public static SubLObject f11763() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0187", "f11722", "S#14540", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0187", "f11723", "S#14538", 1, 0, false);
        new $f11723$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0187", "f11724", "S#14541", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0187", "f11725", "S#14542", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0187", "f11726", "S#14543", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0187", "f11727", "S#14544", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0187", "f11728", "S#14545", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0187", "f11729", "S#14546", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0187", "f11730", "S#14547", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0187", "f11731", "S#14548", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0187", "f11732", "S#14549", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0187", "f11733", "S#14550", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0187", "f11734", "S#14551", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0187", "f11735", "S#14552", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0187", "f11736", "S#14553", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0187", "f11737", "S#14554", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0187", "f11738", "S#14555", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0187", "f11739", "S#14556", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0187", "f11740", "S#14557", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0187", "f11742", "S#14558", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0187", "f11743", "S#14559", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0187", "f11744", "S#14560", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0187", "f11746", "S#14561", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0187", "f11745", "S#14562", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0187", "f11747", "S#14497", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0187", "f11748", "S#14496", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0187", "f11751", "S#14495", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0187", "f11752", "S#14563", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0187", "f11750", "S#14564", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0187", "f11754", "S#14500", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0187", "f11755", "S#14499", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0187", "f11749", "S#14565", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0187", "f11756", "S#14506", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0187", "f11757", "S#14310", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0187", "f11758", "S#14501", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0187", "f11759", "S#14566", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0187", "f11760", "S#14502", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0187", "f11741", "S#14567", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0187", "f11753", "S#14503", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0187", "f11761", "S#14504", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0187", "f11762", "S#14505", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f11764() {
        $g2233$ = SubLFiles.defconstant("S#14568", (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f11765() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g2233$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic8$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic9$);
        Structures.def_csetf((SubLObject)$ic10$, (SubLObject)$ic11$);
        Structures.def_csetf((SubLObject)$ic12$, (SubLObject)$ic13$);
        Structures.def_csetf((SubLObject)$ic14$, (SubLObject)$ic15$);
        Equality.identity((SubLObject)$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g2233$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic24$));
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f11763();
    }
    
    public void initializeVariables() {
        f11764();
    }
    
    public void runTopLevelForms() {
        f11765();
    }
    
    static {
        me = (SubLFile)new module0187();
        $g2233$ = null;
        $ic0$ = makeSymbol("S#14537", "CYC");
        $ic1$ = makeSymbol("S#14538", "CYC");
        $ic2$ = makeInteger(149);
        $ic3$ = ConsesLow.list((SubLObject)makeSymbol("S#10995", "CYC"), (SubLObject)makeSymbol("S#14569", "CYC"), (SubLObject)makeSymbol("S#14510", "CYC"));
        $ic4$ = ConsesLow.list((SubLObject)makeKeyword("TV"), (SubLObject)makeKeyword("SUPPORTED-OBJECT"), (SubLObject)makeKeyword("SUPPORTS"));
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#14541", "CYC"), (SubLObject)makeSymbol("S#14542", "CYC"), (SubLObject)makeSymbol("S#14543", "CYC"));
        $ic6$ = ConsesLow.list((SubLObject)makeSymbol("S#14544", "CYC"), (SubLObject)makeSymbol("S#14545", "CYC"), (SubLObject)makeSymbol("S#14546", "CYC"));
        $ic7$ = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic8$ = makeSymbol("S#14540", "CYC");
        $ic9$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#14538", "CYC"));
        $ic10$ = makeSymbol("S#14541", "CYC");
        $ic11$ = makeSymbol("S#14544", "CYC");
        $ic12$ = makeSymbol("S#14542", "CYC");
        $ic13$ = makeSymbol("S#14545", "CYC");
        $ic14$ = makeSymbol("S#14543", "CYC");
        $ic15$ = makeSymbol("S#14546", "CYC");
        $ic16$ = makeKeyword("TV");
        $ic17$ = makeKeyword("SUPPORTED-OBJECT");
        $ic18$ = makeKeyword("SUPPORTS");
        $ic19$ = makeString("Invalid slot ~S for construction function");
        $ic20$ = makeKeyword("BEGIN");
        $ic21$ = makeSymbol("S#14547", "CYC");
        $ic22$ = makeKeyword("SLOT");
        $ic23$ = makeKeyword("END");
        $ic24$ = makeSymbol("S#14549", "CYC");
        $ic25$ = makeKeyword("UNKNOWN");
        $ic26$ = makeSymbol("DEDUCTION-P");
        $ic27$ = makeKeyword("TRUE");
    }
    
    public static final class $sX14537_native extends SubLStructNative
    {
        public SubLObject $tv;
        public SubLObject $supported_object;
        public SubLObject $supports;
        public static final SubLStructDeclNative structDecl;
        
        public $sX14537_native() {
            this.$tv = (SubLObject)CommonSymbols.NIL;
            this.$supported_object = (SubLObject)CommonSymbols.NIL;
            this.$supports = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$tv;
        }
        
        public SubLObject getField3() {
            return this.$supported_object;
        }
        
        public SubLObject getField4() {
            return this.$supports;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$tv = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$supported_object = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$supports = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX14537_native.class, $ic0$, $ic1$, $ic3$, $ic4$, new String[] { "$tv", "$supported_object", "$supports" }, $ic5$, $ic6$, $ic7$);
        }
    }
    
    public static final class $f11723$UnaryFunction extends UnaryFunction
    {
        public $f11723$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#14538"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f11723(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 128 ms
	
	Decompiled with Procyon 0.5.32.
*/