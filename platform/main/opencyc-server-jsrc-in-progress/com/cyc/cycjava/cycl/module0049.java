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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0049 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0049";
    public static final String myFingerPrint = "d203c34685b9ccf114e6f94a2d74afd2dca0a4be5ea74af6cdf2043af26801ab";
    public static SubLSymbol $g991$;
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
    private static final SubLString $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLString $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLString $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    
    public static SubLObject f3478(final SubLObject var1, final SubLObject var2) {
        f3479(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3480(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX4884_native.class) ? T : NIL);
    }
    
    public static SubLObject f3481(final SubLObject var1) {
        assert NIL != f3480(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f3482(final SubLObject var1) {
        assert NIL != f3480(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f3483(final SubLObject var1, final SubLObject var4) {
        assert NIL != f3480(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f3484(final SubLObject var1, final SubLObject var4) {
        assert NIL != f3480(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f3485(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX4884_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic13$)) {
                f3483(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic14$)) {
                f3484(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic15$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f3486(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic16$, (SubLObject)$ic17$, (SubLObject)TWO_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic18$, (SubLObject)$ic13$, f3481(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic18$, (SubLObject)$ic14$, f3482(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic19$, (SubLObject)$ic17$, (SubLObject)TWO_INTEGER);
        return var11;
    }
    
    public static SubLObject f3487(final SubLObject var11, final SubLObject var12) {
        return f3486(var11, var12);
    }
    
    public static SubLObject f3479(final SubLObject var13, final SubLObject var2, final SubLObject var14) {
        final SubLObject var15 = f3481(var13);
        final SubLObject var16 = f3482(var13);
        PrintLow.format(var2, (SubLObject)$ic21$, var15, var16);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3488(final SubLObject var15, SubLObject var16) {
        if (var16 == UNPROVIDED) {
            var16 = (SubLObject)ONE_INTEGER;
        }
        assert NIL != Types.integerp(var15) : var15;
        assert NIL != module0004.f109(var16) : var16;
        return f3485((SubLObject)ConsesLow.list((SubLObject)$ic13$, var15, (SubLObject)$ic14$, var16));
    }
    
    public static SubLObject f3489(final SubLObject var13) {
        return (SubLObject)makeBoolean(var13.isInteger() || NIL != f3480(var13));
    }
    
    public static SubLObject f3490(final SubLObject var13) {
        return (SubLObject)makeBoolean(var13.isNumber() || NIL != f3480(var13));
    }
    
    public static SubLObject f3491(final SubLObject var13) {
        if (var13.isList()) {
            SubLObject var14 = var13;
            SubLObject var15 = (SubLObject)NIL;
            var15 = var14.first();
            while (NIL != var14) {
                if (NIL == f3480(var15)) {
                    return (SubLObject)NIL;
                }
                var14 = var14.rest();
                var15 = var14.first();
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3492(final SubLObject var13) {
        if (var13.isList()) {
            SubLObject var14 = var13;
            SubLObject var15 = (SubLObject)NIL;
            var15 = var14.first();
            while (NIL != var14) {
                if (NIL == f3489(var15)) {
                    return (SubLObject)NIL;
                }
                var14 = var14.rest();
                var15 = var14.first();
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3493(final SubLObject var13) {
        if (var13.isList()) {
            SubLObject var14 = var13;
            SubLObject var15 = (SubLObject)NIL;
            var15 = var14.first();
            while (NIL != var14) {
                if (NIL == f3490(var15)) {
                    return (SubLObject)NIL;
                }
                var14 = var14.rest();
                var15 = var14.first();
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3494(final SubLObject var19) {
        assert NIL != f3480(var19) : var19;
        return f3481(var19);
    }
    
    public static SubLObject f3495(final SubLObject var19) {
        assert NIL != f3480(var19) : var19;
        return f3482(var19);
    }
    
    public static SubLObject numerator(final SubLObject var19) {
        assert NIL != f3489(var19) : var19;
        if (var19.isInteger()) {
            return var19;
        }
        return f3494(var19);
    }
    
    public static SubLObject denominator(final SubLObject var19) {
        assert NIL != f3489(var19) : var19;
        if (var19.isInteger()) {
            return (SubLObject)ONE_INTEGER;
        }
        return f3495(var19);
    }
    
    public static SubLObject f3496(final SubLObject var20) {
        assert NIL != Types.integerp(var20) : var20;
        return f3488(var20, (SubLObject)ONE_INTEGER);
    }
    
    public static SubLObject f3497(final SubLObject var19) {
        assert NIL != f3480(var19) : var19;
        return Numbers.divide(f3481(var19), f3482(var19));
    }
    
    public static SubLObject f3498(final SubLObject var13) {
        assert NIL != f3489(var13) : var13;
        return var13.isInteger() ? f3496(var13) : var13;
    }
    
    public static SubLObject f3499(final SubLObject var13) {
        assert NIL != f3490(var13) : var13;
        return (NIL != f3480(var13)) ? f3497(var13) : var13;
    }
    
    public static SubLObject f3500(final SubLObject var19) {
        assert NIL != f3489(var19) : var19;
        if (var19.isInteger()) {
            return var19;
        }
        SubLObject var20 = f3481(var19);
        SubLObject var21 = f3482(var19);
        final SubLObject var22 = module0048.f3437(var20, var21);
        if (NIL != module0004.f108(var21)) {
            var20 = Numbers.minus(var20);
            var21 = Numbers.minus(var21);
        }
        return f3488(Numbers.divide(var20, var22), Numbers.divide(var21, var22));
    }
    
    public static SubLObject f3501(final SubLObject var22) {
        assert NIL != f3489(var22) : var22;
        return f3502(var22);
    }
    
    public static SubLObject f3503(final SubLObject var22) {
        assert NIL != f3489(var22) : var22;
        final SubLObject var23 = f3502(var22);
        return f3500(var23);
    }
    
    public static SubLObject f3502(final SubLObject var22) {
        return f3488(denominator(var22), numerator(var22));
    }
    
    public static SubLObject f3504(final SubLObject var24, final SubLObject var25) {
        assert NIL != f3490(var24) : var24;
        assert NIL != f3490(var25) : var25;
        if (NIL != f3480(var24) && NIL != f3480(var25)) {
            final SubLObject var26 = f3500(var24);
            final SubLObject var27 = f3500(var25);
            return (SubLObject)makeBoolean(f3481(var26).numE(f3481(var27)) && f3482(var26).numE(f3482(var27)));
        }
        return Numbers.numE(f3499(var24), f3499(var25));
    }
    
    public static SubLObject f3505(final SubLObject var28) {
        assert NIL != module0035.f2015(var28) : var28;
        SubLObject var29 = var28;
        SubLObject var30 = (SubLObject)NIL;
        var30 = var29.first();
        while (NIL != var29) {
            assert NIL != f3489(var30) : var30;
            var29 = var29.rest();
            var30 = var29.first();
        }
        if (NIL == var28) {
            return f3488((SubLObject)ONE_INTEGER, (SubLObject)ONE_INTEGER);
        }
        final SubLObject var31 = Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic27$), var28);
        if (NIL != module0035.f1997(var31)) {
            return f3500(var31.first());
        }
        return f3506(var31);
    }
    
    public static SubLObject f3507(final SubLObject var32, final SubLObject var33) {
        assert NIL != f3489(var32) : var32;
        assert NIL != f3489(var33) : var33;
        final SubLObject var34 = f3498(var32);
        final SubLObject var35 = f3498(var33);
        return f3508(var34, var35);
    }
    
    public static SubLObject f3506(final SubLObject var31) {
        final SubLObject var32 = f3508(var31.first(), conses_high.second(var31));
        if (NIL != module0035.f1998(var31)) {
            return var32;
        }
        final SubLObject var33 = conses_high.cddr(var31);
        return f3506((SubLObject)ConsesLow.cons(var32, var33));
    }
    
    public static SubLObject f3508(final SubLObject var24, final SubLObject var25) {
        final SubLObject var26 = f3488(Numbers.multiply(f3481(var24), f3481(var25)), Numbers.multiply(f3482(var24), f3482(var25)));
        return f3500(var26);
    }
    
    public static SubLObject f3509(final SubLObject var32, final SubLObject var33) {
        final SubLThread var34 = SubLProcess.currentSubLThread();
        assert NIL != f3489(var32) : var32;
        assert NIL != f3489(var33) : var33;
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var34) && NIL != f3504((SubLObject)ZERO_INTEGER, var33)) {
            Errors.error((SubLObject)$ic28$);
        }
        final SubLObject var35 = f3498(var32);
        final SubLObject var36 = f3501(var33);
        return f3508(var35, var36);
    }
    
    public static SubLObject f3510(final SubLObject var28) {
        assert NIL != module0035.f2015(var28) : var28;
        SubLObject var29 = var28;
        SubLObject var30 = (SubLObject)NIL;
        var30 = var29.first();
        while (NIL != var29) {
            assert NIL != f3489(var30) : var30;
            var29 = var29.rest();
            var30 = var29.first();
        }
        if (NIL == var28) {
            return f3488((SubLObject)ZERO_INTEGER, (SubLObject)ONE_INTEGER);
        }
        final SubLObject var31 = Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic27$), var28);
        if (NIL != module0035.f1997(var31)) {
            return f3500(var31.first());
        }
        return f3511(var31);
    }
    
    public static SubLObject f3512(final SubLObject var32, final SubLObject var33) {
        assert NIL != f3489(var32) : var32;
        assert NIL != f3489(var33) : var33;
        final SubLObject var34 = f3498(var32);
        final SubLObject var35 = f3498(var33);
        return f3513(var34, var35);
    }
    
    public static SubLObject f3511(final SubLObject var31) {
        final SubLObject var32 = f3513(var31.first(), conses_high.second(var31));
        if (NIL != module0035.f1998(var31)) {
            return var32;
        }
        return f3511((SubLObject)ConsesLow.cons(var32, conses_high.cddr(var31)));
    }
    
    public static SubLObject f3513(final SubLObject var24, final SubLObject var25) {
        final SubLObject var26 = f3481(var24);
        final SubLObject var27 = f3481(var25);
        final SubLObject var28 = f3482(var24);
        final SubLObject var29 = f3482(var25);
        final SubLObject var30 = module0048.f3434(var28, var29);
        final SubLObject var31 = Numbers.divide(var30, var28);
        final SubLObject var32 = Numbers.divide(var30, var29);
        final SubLObject var33 = Numbers.multiply(var31, var26);
        final SubLObject var34 = Numbers.multiply(var32, var27);
        final SubLObject var35 = Numbers.add(var33, var34);
        return f3500(f3488(var35, var30));
    }
    
    public static SubLObject f3514(final SubLObject var32, SubLObject var33) {
        if (var33 == UNPROVIDED) {
            var33 = (SubLObject)NIL;
        }
        assert NIL != f3489(var32) : var32;
        if (NIL != var33) {
            return f3513(f3498(var32), f3514(var33, (SubLObject)UNPROVIDED));
        }
        return f3488(Numbers.minus(numerator(var32)), denominator(var32));
    }
    
    public static SubLObject f3515(final SubLObject var28) {
        assert NIL != module0035.f2015(var28) : var28;
        SubLObject var29 = var28;
        SubLObject var30 = (SubLObject)NIL;
        var30 = var29.first();
        while (NIL != var29) {
            assert NIL != f3489(var30) : var30;
            var29 = var29.rest();
            var30 = var29.first();
        }
        final SubLObject var31 = Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic29$), Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic30$), var28));
        final SubLObject var32 = module0048.lcm(var31);
        SubLObject var33 = (SubLObject)NIL;
        SubLObject var34 = var28;
        SubLObject var35 = (SubLObject)NIL;
        var35 = var34.first();
        while (NIL != var34) {
            final SubLObject var36 = f3507(var35, var32);
            var33 = (SubLObject)ConsesLow.cons(f3497(var36), var33);
            var34 = var34.rest();
            var35 = var34.first();
        }
        var33 = Sequences.nreverse(var33);
        return var33;
    }
    
    public static SubLObject f3516() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0049", "f3478", "S#4886", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0049", "f3480", "S#4885", 1, 0, false);
        new $f3480$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0049", "f3481", "S#4887", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0049", "f3482", "S#4888", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0049", "f3483", "S#4889", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0049", "f3484", "S#4890", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0049", "f3485", "S#4891", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0049", "f3486", "S#4892", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0049", "f3487", "S#4893", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0049", "f3479", "S#4894", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0049", "f3488", "S#4895", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0049", "f3489", "S#4896", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0049", "f3490", "S#4897", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0049", "f3491", "S#4898", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0049", "f3492", "S#4899", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0049", "f3493", "S#4900", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0049", "f3494", "S#4901", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0049", "f3495", "S#4902", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0049", "numerator", "NUMERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0049", "denominator", "DENOMINATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0049", "f3496", "S#4903", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0049", "f3497", "S#4904", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0049", "f3498", "S#4905", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0049", "f3499", "S#4906", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0049", "f3500", "S#4907", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0049", "f3501", "S#4908", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0049", "f3503", "S#4909", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0049", "f3502", "S#4910", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0049", "f3504", "S#4911", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0049", "f3505", "S#4912", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0049", "f3507", "S#4913", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0049", "f3506", "S#4914", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0049", "f3508", "S#4915", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0049", "f3509", "S#4916", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0049", "f3510", "S#4917", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0049", "f3512", "S#4918", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0049", "f3511", "S#4919", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0049", "f3513", "S#4920", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0049", "f3514", "S#4921", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0049", "f3515", "S#4922", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3517() {
        $g991$ = SubLFiles.defconstant("S#4923", (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3518() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g991$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic8$);
        Structures.def_csetf((SubLObject)$ic9$, (SubLObject)$ic10$);
        Structures.def_csetf((SubLObject)$ic11$, (SubLObject)$ic12$);
        Equality.identity((SubLObject)$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g991$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic20$));
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f3516();
    }
    
    public void initializeVariables() {
        f3517();
    }
    
    public void runTopLevelForms() {
        f3518();
    }
    
    static {
        me = (SubLFile)new module0049();
        $g991$ = null;
        $ic0$ = makeSymbol("S#4884", "CYC");
        $ic1$ = makeSymbol("S#4885", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)makeSymbol("NUMERATOR"), (SubLObject)makeSymbol("DENOMINATOR"));
        $ic3$ = ConsesLow.list((SubLObject)makeKeyword("NUMERATOR"), (SubLObject)makeKeyword("DENOMINATOR"));
        $ic4$ = ConsesLow.list((SubLObject)makeSymbol("S#4887", "CYC"), (SubLObject)makeSymbol("S#4888", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#4889", "CYC"), (SubLObject)makeSymbol("S#4890", "CYC"));
        $ic6$ = makeSymbol("S#4894", "CYC");
        $ic7$ = makeSymbol("S#4886", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#4885", "CYC"));
        $ic9$ = makeSymbol("S#4887", "CYC");
        $ic10$ = makeSymbol("S#4889", "CYC");
        $ic11$ = makeSymbol("S#4888", "CYC");
        $ic12$ = makeSymbol("S#4890", "CYC");
        $ic13$ = makeKeyword("NUMERATOR");
        $ic14$ = makeKeyword("DENOMINATOR");
        $ic15$ = makeString("Invalid slot ~S for construction function");
        $ic16$ = makeKeyword("BEGIN");
        $ic17$ = makeSymbol("S#4891", "CYC");
        $ic18$ = makeKeyword("SLOT");
        $ic19$ = makeKeyword("END");
        $ic20$ = makeSymbol("S#4893", "CYC");
        $ic21$ = makeString("~A/~A");
        $ic22$ = makeSymbol("INTEGERP");
        $ic23$ = makeSymbol("S#93", "CYC");
        $ic24$ = makeSymbol("S#4896", "CYC");
        $ic25$ = makeSymbol("S#4897", "CYC");
        $ic26$ = makeSymbol("S#747", "CYC");
        $ic27$ = makeSymbol("S#4905", "CYC");
        $ic28$ = makeString("Attempt to fraction-divide by zero");
        $ic29$ = makeSymbol("DENOMINATOR");
        $ic30$ = makeSymbol("S#4907", "CYC");
    }
    
    public static final class $sX4884_native extends SubLStructNative
    {
        public SubLObject $numerator;
        public SubLObject $denominator;
        public static final SubLStructDeclNative structDecl;
        
        public $sX4884_native() {
            this.$numerator = (SubLObject)CommonSymbols.NIL;
            this.$denominator = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX4884_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$numerator;
        }
        
        public SubLObject getField3() {
            return this.$denominator;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$numerator = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$denominator = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX4884_native.class, $ic0$, $ic1$, $ic2$, $ic3$, new String[] { "$numerator", "$denominator" }, $ic4$, $ic5$, $ic6$);
        }
    }
    
    public static final class $f3480$UnaryFunction extends UnaryFunction
    {
        public $f3480$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#4885"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f3480(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 126 ms
	
	Decompiled with Procyon 0.5.32.
*/