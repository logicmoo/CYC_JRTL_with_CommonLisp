package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0057 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0057";
    public static final String myFingerPrint = "75e0f470924e95d6caf6dd935ca8a5609c04ff0c5be17462b6189dcfcb3ae11c";
    public static SubLSymbol $g1040$;
    private static SubLSymbol $g1041$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLList $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLString $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLString $ic30$;
    private static final SubLString $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLString $ic35$;
    private static final SubLString $ic36$;
    private static final SubLString $ic37$;
    private static final SubLInteger $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    
    
    public static SubLObject f4156(final SubLObject var1, final SubLObject var2) {
        f4157(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4158(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX5638_native.class) ? T : NIL);
    }
    
    public static SubLObject f4159(final SubLObject var1) {
        assert NIL != f4158(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f4160(final SubLObject var1) {
        assert NIL != f4158(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f4161(final SubLObject var1) {
        assert NIL != f4158(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f4162(final SubLObject var1) {
        assert NIL != f4158(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f4163(final SubLObject var1) {
        assert NIL != f4158(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f4164(final SubLObject var1, final SubLObject var4) {
        assert NIL != f4158(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f4165(final SubLObject var1, final SubLObject var4) {
        assert NIL != f4158(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f4166(final SubLObject var1, final SubLObject var4) {
        assert NIL != f4158(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f4167(final SubLObject var1, final SubLObject var4) {
        assert NIL != f4158(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f4168(final SubLObject var1, final SubLObject var4) {
        assert NIL != f4158(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f4169(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX5638_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic19$)) {
                f4164(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic20$)) {
                f4165(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic21$)) {
                f4166(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic22$)) {
                f4167(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic23$)) {
                f4168(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic24$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f4170(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic25$, (SubLObject)$ic26$, (SubLObject)FIVE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic27$, (SubLObject)$ic19$, f4159(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic27$, (SubLObject)$ic20$, f4160(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic27$, (SubLObject)$ic21$, f4161(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic27$, (SubLObject)$ic22$, f4162(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic27$, (SubLObject)$ic23$, f4163(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic28$, (SubLObject)$ic26$, (SubLObject)FIVE_INTEGER);
        return var11;
    }
    
    public static SubLObject f4171(final SubLObject var11, final SubLObject var12) {
        return f4170(var11, var12);
    }
    
    public static SubLObject f4157(final SubLObject var13, final SubLObject var2, final SubLObject var14) {
        final SubLObject var15 = f4161(var13);
        final SubLObject var16 = f4160(var13);
        final SubLObject var17 = f4162(var13);
        final SubLObject var18 = f4163(var13);
        PrintLow.format(var2, (SubLObject)$ic30$, var15);
        if (NIL != var17) {
            PrintLow.format(var2, (SubLObject)$ic31$, var17);
        }
        PrintLow.format(var2, (SubLObject)$ic32$, var18);
        PrintLow.format(var2, (SubLObject)$ic33$, var16);
        return var13;
    }
    
    public static SubLObject f4172(final SubLObject var19, final SubLObject var16) {
        assert NIL != f4158(var19) : var19;
        final SubLObject var21_22;
        final SubLObject var20 = var21_22 = f4159(var19);
        SubLObject var21 = (SubLObject)NIL;
        try {
            var21 = Locks.seize_lock(var21_22);
            f4165(var19, var16);
        }
        finally {
            if (NIL != var21) {
                Locks.release_lock(var21_22);
            }
        }
        return var19;
    }
    
    public static SubLObject f4173(SubLObject var15, SubLObject var17, SubLObject var18) {
        if (var15 == UNPROVIDED) {
            var15 = (SubLObject)ZERO_INTEGER;
        }
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)ONE_INTEGER;
        }
        final SubLThread var19 = SubLProcess.currentSubLThread();
        assert NIL != Types.integerp(var15) : var15;
        assert NIL != Types.integerp(var18) : var18;
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var19) && var18.isZero()) {
            Errors.error((SubLObject)$ic35$);
        }
        if (NIL != var17 && !areAssertionsDisabledFor(me) && NIL == Types.integerp(var17)) {
            throw new AssertionError(var17);
        }
        final SubLObject var20 = f4169((SubLObject)UNPROVIDED);
        final SubLObject var21 = Locks.make_lock((SubLObject)$ic36$);
        f4164(var20, var21);
        f4166(var20, var15);
        f4167(var20, var17);
        f4168(var20, var18);
        return f4174(var20);
    }
    
    public static SubLObject f4174(final SubLObject var19) {
        assert NIL != f4158(var19) : var19;
        final SubLObject var25_26;
        final SubLObject var20 = var25_26 = f4159(var19);
        SubLObject var21 = (SubLObject)NIL;
        try {
            var21 = Locks.seize_lock(var25_26);
            f4165(var19, f4161(var19));
        }
        finally {
            if (NIL != var21) {
                Locks.release_lock(var25_26);
            }
        }
        return var19;
    }
    
    public static SubLObject f4175(final SubLObject var19) {
        assert NIL != f4158(var19) : var19;
        final SubLObject var20 = f4159(var19);
        SubLObject var21 = (SubLObject)NIL;
        final SubLObject var28_29 = var20;
        SubLObject var22 = (SubLObject)NIL;
        try {
            var22 = Locks.seize_lock(var28_29);
            final SubLObject var23 = f4162(var19);
            final SubLObject var24 = f4163(var19);
            var21 = f4160(var19);
            if (NIL != var23 && NIL != (var24.isNegative() ? Numbers.numLE(var21, var23) : Numbers.numGE(var21, var23))) {
                var21 = (SubLObject)NIL;
            }
            if (NIL != var21) {
                f4165(var19, Numbers.add(f4160(var19), var24));
            }
        }
        finally {
            if (NIL != var22) {
                Locks.release_lock(var28_29);
            }
        }
        if (NIL != var21) {
            return var21;
        }
        Errors.error((SubLObject)$ic37$, var19);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4176(final SubLObject var19) {
        assert NIL != f4158(var19) : var19;
        return f4161(var19);
    }
    
    public static SubLObject f4177(final SubLObject var19) {
        assert NIL != f4158(var19) : var19;
        final SubLObject var20 = f4159(var19);
        SubLObject var21 = (SubLObject)NIL;
        final SubLObject var32_33 = var20;
        SubLObject var22 = (SubLObject)NIL;
        try {
            var22 = Locks.seize_lock(var32_33);
            var21 = f4160(var19);
        }
        finally {
            if (NIL != var22) {
                Locks.release_lock(var32_33);
            }
        }
        if (!var21.numE(f4161(var19))) {
            var21 = Numbers.subtract(var21, f4163(var19));
        }
        return var21;
    }
    
    public static SubLObject f4178(final SubLObject var13, final SubLObject var2) {
        f4179(var13, var2);
        return var13;
    }
    
    public static SubLObject f4179(final SubLObject var19, final SubLObject var2) {
        module0021.f1110($g1041$.getGlobalValue(), var2);
        f4180(var19, var2);
        return var19;
    }
    
    public static SubLObject f4180(final SubLObject var19, final SubLObject var2) {
        final SubLObject var20 = f4159(var19);
        SubLObject var21 = (SubLObject)NIL;
        SubLObject var22 = (SubLObject)NIL;
        SubLObject var23 = (SubLObject)NIL;
        SubLObject var24 = (SubLObject)NIL;
        final SubLObject var35_36 = var20;
        SubLObject var25 = (SubLObject)NIL;
        try {
            var25 = Locks.seize_lock(var35_36);
            var21 = f4160(var19);
            var22 = f4161(var19);
            var24 = f4162(var19);
            var23 = f4163(var19);
        }
        finally {
            if (NIL != var25) {
                Locks.release_lock(var35_36);
            }
        }
        module0021.f1038(var21, var2);
        module0021.f1038(var22, var2);
        module0021.f1038(var24, var2);
        module0021.f1038(var23, var2);
        return var19;
    }
    
    public static SubLObject f4181(final SubLObject var2) {
        final SubLObject var3 = module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var4 = module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var6 = module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var7 = f4173(var4, var5, var6);
        return f4172(var7, var3);
    }
    
    public static SubLObject f4182() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0057", "f4156", "S#5639", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0057", "f4158", "S#910", 1, 0, false);
        new $f4158$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0057", "f4159", "S#5640", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0057", "f4160", "S#5641", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0057", "f4161", "S#5642", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0057", "f4162", "S#5643", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0057", "f4163", "S#5644", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0057", "f4164", "S#5645", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0057", "f4165", "S#5646", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0057", "f4166", "S#5647", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0057", "f4167", "S#5648", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0057", "f4168", "S#5649", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0057", "f4169", "S#5650", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0057", "f4170", "S#5651", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0057", "f4171", "S#5652", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0057", "f4157", "S#5653", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0057", "f4172", "S#5654", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0057", "f4173", "S#911", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0057", "f4174", "S#5655", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0057", "f4175", "S#909", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0057", "f4176", "S#5656", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0057", "f4177", "S#5657", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0057", "f4178", "S#5658", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0057", "f4179", "S#5659", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0057", "f4180", "S#5660", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0057", "f4181", "S#5661", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4183() {
        $g1040$ = SubLFiles.defconstant("S#5662", (SubLObject)$ic0$);
        $g1041$ = SubLFiles.defconstant("S#5663", (SubLObject)$ic38$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4184() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g1040$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic8$);
        Structures.def_csetf((SubLObject)$ic9$, (SubLObject)$ic10$);
        Structures.def_csetf((SubLObject)$ic11$, (SubLObject)$ic12$);
        Structures.def_csetf((SubLObject)$ic13$, (SubLObject)$ic14$);
        Structures.def_csetf((SubLObject)$ic15$, (SubLObject)$ic16$);
        Structures.def_csetf((SubLObject)$ic17$, (SubLObject)$ic18$);
        Equality.identity((SubLObject)$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g1040$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic29$));
        module0021.f1193($g1041$.getGlobalValue(), (SubLObject)$ic39$);
        Structures.register_method(module0021.$g749$.getGlobalValue(), $g1040$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic40$));
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f4182();
    }
    
    public void initializeVariables() {
        f4183();
    }
    
    public void runTopLevelForms() {
        f4184();
    }
    
    static {
        me = (SubLFile)new module0057();
        $g1040$ = null;
        $g1041$ = null;
        $ic0$ = makeSymbol("S#5638", "CYC");
        $ic1$ = makeSymbol("S#910", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)makeSymbol("S#672", "CYC"), (SubLObject)makeSymbol("S#5232", "CYC"), (SubLObject)makeSymbol("S#124", "CYC"), (SubLObject)makeSymbol("S#5664", "CYC"), (SubLObject)makeSymbol("S#126", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)makeKeyword("LOCK"), (SubLObject)makeKeyword("CURRENT"), (SubLObject)makeKeyword("START"), (SubLObject)makeKeyword("LIMIT"), (SubLObject)makeKeyword("DELTA"));
        $ic4$ = ConsesLow.list((SubLObject)makeSymbol("S#5640", "CYC"), (SubLObject)makeSymbol("S#5641", "CYC"), (SubLObject)makeSymbol("S#5642", "CYC"), (SubLObject)makeSymbol("S#5643", "CYC"), (SubLObject)makeSymbol("S#5644", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#5645", "CYC"), (SubLObject)makeSymbol("S#5646", "CYC"), (SubLObject)makeSymbol("S#5647", "CYC"), (SubLObject)makeSymbol("S#5648", "CYC"), (SubLObject)makeSymbol("S#5649", "CYC"));
        $ic6$ = makeSymbol("S#5653", "CYC");
        $ic7$ = makeSymbol("S#5639", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#910", "CYC"));
        $ic9$ = makeSymbol("S#5640", "CYC");
        $ic10$ = makeSymbol("S#5645", "CYC");
        $ic11$ = makeSymbol("S#5641", "CYC");
        $ic12$ = makeSymbol("S#5646", "CYC");
        $ic13$ = makeSymbol("S#5642", "CYC");
        $ic14$ = makeSymbol("S#5647", "CYC");
        $ic15$ = makeSymbol("S#5643", "CYC");
        $ic16$ = makeSymbol("S#5648", "CYC");
        $ic17$ = makeSymbol("S#5644", "CYC");
        $ic18$ = makeSymbol("S#5649", "CYC");
        $ic19$ = makeKeyword("LOCK");
        $ic20$ = makeKeyword("CURRENT");
        $ic21$ = makeKeyword("START");
        $ic22$ = makeKeyword("LIMIT");
        $ic23$ = makeKeyword("DELTA");
        $ic24$ = makeString("Invalid slot ~S for construction function");
        $ic25$ = makeKeyword("BEGIN");
        $ic26$ = makeSymbol("S#5650", "CYC");
        $ic27$ = makeKeyword("SLOT");
        $ic28$ = makeKeyword("END");
        $ic29$ = makeSymbol("S#5652", "CYC");
        $ic30$ = makeString("#<ISG:From ~A");
        $ic31$ = makeString(" to ~A");
        $ic32$ = makeString(" by ~A");
        $ic33$ = makeString(" at ~A>");
        $ic34$ = makeSymbol("INTEGERP");
        $ic35$ = makeString("DELTA must not be zero");
        $ic36$ = makeString("ISG");
        $ic37$ = makeString("Integer Sequence Generator ~S has been exhausted");
        $ic38$ = makeInteger(130);
        $ic39$ = makeSymbol("S#5661", "CYC");
        $ic40$ = makeSymbol("S#5658", "CYC");
    }
    
    public static final class $sX5638_native extends SubLStructNative
    {
        public SubLObject $lock;
        public SubLObject $current;
        public SubLObject $start;
        public SubLObject $limit;
        public SubLObject $delta;
        public static final SubLStructDeclNative structDecl;
        
        public $sX5638_native() {
            this.$lock = (SubLObject)CommonSymbols.NIL;
            this.$current = (SubLObject)CommonSymbols.NIL;
            this.$start = (SubLObject)CommonSymbols.NIL;
            this.$limit = (SubLObject)CommonSymbols.NIL;
            this.$delta = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$lock;
        }
        
        public SubLObject getField3() {
            return this.$current;
        }
        
        public SubLObject getField4() {
            return this.$start;
        }
        
        public SubLObject getField5() {
            return this.$limit;
        }
        
        public SubLObject getField6() {
            return this.$delta;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$lock = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$current = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$start = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$limit = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$delta = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX5638_native.class, $ic0$, $ic1$, $ic2$, $ic3$, new String[] { "$lock", "$current", "$start", "$limit", "$delta" }, $ic4$, $ic5$, $ic6$);
        }
    }
    
    public static final class $f4158$UnaryFunction extends UnaryFunction
    {
        public $f4158$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#910"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f4158(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 118 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/