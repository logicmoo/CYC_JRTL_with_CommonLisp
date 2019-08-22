package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
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

public final class module0088 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0088";
    public static final String myFingerPrint = "d0c68a9ff1dda9d757748fb4a5c9c46de202be54d6272fa7290991bbc3bd6b2b";
    public static SubLSymbol $g1178$;
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
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLString $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLString $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLString $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLList $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLList $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLString $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLString $ic64$;
    
    public static SubLObject f5995(final SubLObject var1, final SubLObject var2) {
        f5996(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5997(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX7641_native.class) ? T : NIL);
    }
    
    public static SubLObject f5998(final SubLObject var1) {
        assert NIL != f5997(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f5999(final SubLObject var1) {
        assert NIL != f5997(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f6000(final SubLObject var1) {
        assert NIL != f5997(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f6001(final SubLObject var1) {
        assert NIL != f5997(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f6002(final SubLObject var1) {
        assert NIL != f5997(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f6003(final SubLObject var1) {
        assert NIL != f5997(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f6004(final SubLObject var1) {
        assert NIL != f5997(var1) : var1;
        return var1.getField8();
    }
    
    public static SubLObject f6005(final SubLObject var1) {
        assert NIL != f5997(var1) : var1;
        return var1.getField9();
    }
    
    public static SubLObject f6006(final SubLObject var1) {
        assert NIL != f5997(var1) : var1;
        return var1.getField10();
    }
    
    public static SubLObject f6007(final SubLObject var1, final SubLObject var4) {
        assert NIL != f5997(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f6008(final SubLObject var1, final SubLObject var4) {
        assert NIL != f5997(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f6009(final SubLObject var1, final SubLObject var4) {
        assert NIL != f5997(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f6010(final SubLObject var1, final SubLObject var4) {
        assert NIL != f5997(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f6011(final SubLObject var1, final SubLObject var4) {
        assert NIL != f5997(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f6012(final SubLObject var1, final SubLObject var4) {
        assert NIL != f5997(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f6013(final SubLObject var1, final SubLObject var4) {
        assert NIL != f5997(var1) : var1;
        return var1.setField8(var4);
    }
    
    public static SubLObject f6014(final SubLObject var1, final SubLObject var4) {
        assert NIL != f5997(var1) : var1;
        return var1.setField9(var4);
    }
    
    public static SubLObject f6015(final SubLObject var1, final SubLObject var4) {
        assert NIL != f5997(var1) : var1;
        return var1.setField10(var4);
    }
    
    public static SubLObject f6016(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX7641_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic27$)) {
                f6007(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic28$)) {
                f6008(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic29$)) {
                f6009(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic30$)) {
                f6010(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic31$)) {
                f6011(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic32$)) {
                f6012(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic33$)) {
                f6013(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic34$)) {
                f6014(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic35$)) {
                f6015(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic36$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f6017(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic37$, (SubLObject)$ic38$, (SubLObject)NINE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic39$, (SubLObject)$ic27$, f5998(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic39$, (SubLObject)$ic28$, f5999(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic39$, (SubLObject)$ic29$, f6000(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic39$, (SubLObject)$ic30$, f6001(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic39$, (SubLObject)$ic31$, f6002(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic39$, (SubLObject)$ic32$, f6003(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic39$, (SubLObject)$ic33$, f6004(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic39$, (SubLObject)$ic34$, f6005(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic39$, (SubLObject)$ic35$, f6006(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic40$, (SubLObject)$ic38$, (SubLObject)NINE_INTEGER);
        return var11;
    }
    
    public static SubLObject f6018(final SubLObject var11, final SubLObject var12) {
        return f6017(var11, var12);
    }
    
    public static SubLObject f5996(final SubLObject var13, SubLObject var2, SubLObject var14) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        PrintLow.format(var2, (SubLObject)$ic42$, f6001(var13));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6019(final SubLObject var13) {
        return f6006(var13).first().rest();
    }
    
    public static SubLObject f6020(final SubLObject var13) {
        return conses_high.last(f6006(var13), (SubLObject)UNPROVIDED).first().rest();
    }
    
    public static SubLObject f6021(final SubLObject var15, final SubLObject var16, final SubLObject var17, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)$ic43$;
        }
        final SubLThread var19 = SubLProcess.currentSubLThread();
        assert NIL != Types.integerp(var15) : var15;
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var19) && NIL != module0035.find_if_not((SubLObject)$ic44$, var16, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            Errors.error((SubLObject)$ic45$, var16);
        }
        assert NIL != Types.listp(var17) : var17;
        assert NIL != Types.function_spec_p(var18) : var18;
        final SubLObject var20 = f6016((SubLObject)UNPROVIDED);
        final SubLObject var21 = Vectors.make_vector(Numbers.add(f6022(var17), (SubLObject)ONE_INTEGER), (SubLObject)UNPROVIDED);
        SubLObject var22 = Sequences.reverse(var17);
        SubLObject var23 = (SubLObject)NIL;
        var23 = var22.first();
        while (NIL != var22) {
            f6023(var21, var23.first(), conses_high.second(var23), conses_high.third(var23), conses_high.fourth(var23));
            var22 = var22.rest();
            var23 = var22.first();
        }
        f6007(var20, var15);
        f6008(var20, var16);
        f6009(var20, var21);
        f6010(var20, var18);
        return var20;
    }
    
    public static SubLObject f6024(final SubLObject var13) {
        return Mapping.mapcar((SubLObject)$ic48$, f6006(var13));
    }
    
    public static SubLObject f6025(final SubLObject var13, final SubLObject var23) {
        assert NIL != f5997(var13) : var13;
        assert NIL != Types.sequencep(var23) : var23;
        f6026(var13, var23);
        f6027(var13);
        return (SubLObject)((NIL != f6028(var13)) ? Functions.funcall(f6001(var13), var13) : NIL);
    }
    
    public static SubLObject f6029(final SubLObject var24, final SubLObject var25) {
        SubLObject var27;
        final SubLObject var26 = var27 = var24.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var27, var26, (SubLObject)$ic50$);
        final SubLObject var28 = var27.rest();
        var27 = var27.first();
        SubLObject var29 = (SubLObject)NIL;
        SubLObject var30 = (SubLObject)NIL;
        SubLObject var31 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var27, var26, (SubLObject)$ic50$);
        var29 = var27.first();
        var27 = var27.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var27, var26, (SubLObject)$ic50$);
        var30 = var27.first();
        var27 = var27.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var27, var26, (SubLObject)$ic50$);
        var31 = var27.first();
        var27 = var27.rest();
        if (NIL == var27) {
            final SubLObject var32;
            var27 = (var32 = var28);
            return (SubLObject)ConsesLow.list((SubLObject)$ic51$, (SubLObject)ConsesLow.list((SubLObject)$ic52$, var31, var30), (SubLObject)ConsesLow.listS((SubLObject)$ic53$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var29, (SubLObject)ConsesLow.list((SubLObject)$ic54$, var31), (SubLObject)ConsesLow.list((SubLObject)$ic54$, var31))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic55$, var29)), ConsesLow.append(var32, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var26, (SubLObject)$ic50$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6030(final SubLObject var13, final SubLObject var23) {
        assert NIL != f5997(var13) : var13;
        assert NIL != Types.sequencep(var23) : var23;
        SubLObject var24 = (SubLObject)NIL;
        f6026(var13, var23);
        SubLObject var25;
        for (var25 = (SubLObject)NIL, var25 = f6031(var13); NIL != var25; var25 = f6031(var13)) {
            var24 = (SubLObject)ConsesLow.cons(var25, var24);
        }
        return module0035.f2105(Sequences.nreverse(var24));
    }
    
    public static SubLObject f6026(final SubLObject var13, final SubLObject var23) {
        f6011(var13, var23.isList() ? Functions.apply((SubLObject)$ic56$, var23) : var23);
        f6012(var13, (SubLObject)ZERO_INTEGER);
        f6013(var13, f5998(var13));
        f6015(var13, (SubLObject)NIL);
        return var13;
    }
    
    public static SubLObject f6031(final SubLObject var13) {
        f6013(var13, f5998(var13));
        f6015(var13, (SubLObject)NIL);
        f6027(var13);
        return (SubLObject)((NIL != f6028(var13)) ? Functions.funcall(f6001(var13), var13) : NIL);
    }
    
    public static SubLObject f6027(final SubLObject var13) {
        final SubLObject var14 = Sequences.length(f6002(var13));
        SubLObject var15 = (SubLObject)NIL;
        while (!f6003(var13).numGE(var14) && NIL != f6004(var13) && NIL == f6028(var13)) {
            var15 = f6032(f6000(var13), f6004(var13), f6033(var13));
            SubLObject var16 = var15.first();
            SubLObject var17 = (SubLObject)NIL;
            var17 = var16.first();
            while (NIL != var16) {
                f6034(var13, var17);
                var16 = var16.rest();
                var17 = var16.first();
            }
            f6013(var13, var15.rest());
            f6012(var13, Numbers.add(f6003(var13), (SubLObject)ONE_INTEGER));
        }
        if (NIL != f6004(var13) && f6003(var13).eql(var14)) {
            var15 = f6032(f6000(var13), f6004(var13), (SubLObject)$ic40$);
            if (NIL != var15) {
                SubLObject var16 = var15.first();
                SubLObject var17 = (SubLObject)NIL;
                var17 = var16.first();
                while (NIL != var16) {
                    f6034(var13, var17);
                    var16 = var16.rest();
                    var17 = var16.first();
                }
                f6013(var13, var15.rest());
                f6012(var13, Numbers.add(f6003(var13), (SubLObject)ONE_INTEGER));
            }
        }
        f6015(var13, Sequences.nreverse(f6006(var13)));
        return var13;
    }
    
    public static SubLObject f6033(final SubLObject var13) {
        return Vectors.aref(f6002(var13), f6003(var13));
    }
    
    public static SubLObject f6028(final SubLObject var13) {
        return conses_high.member(f6004(var13), f5999(var13), (SubLObject)EQL, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f6035(final SubLObject var35) {
        return conses_high.member(var35, (SubLObject)$ic57$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f6034(final SubLObject var13, final SubLObject var36) {
        if (var36.eql((SubLObject)$ic58$)) {
            return f6036(var13);
        }
        if (var36.eql((SubLObject)$ic59$)) {
            return f6037(var13);
        }
        if (var36.eql((SubLObject)$ic60$)) {
            return f6038(var13);
        }
        Errors.error((SubLObject)$ic61$, var36);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6036(final SubLObject var13) {
        final SubLObject var14 = f6033(var13);
        final SubLObject var15 = (var14.isInteger() && NIL != module0039.f3011(var14)) ? Characters.code_char(var14) : (var14.isInteger() ? module0039.f3048(module0039.f3025(var14)) : var14);
        f6015(var13, (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var15, f6003(var13)), f6006(var13)));
        return var13;
    }
    
    public static SubLObject f6037(final SubLObject var13) {
        f6014(var13, Numbers.subtract(f6003(var13), (SubLObject)ONE_INTEGER));
        return var13;
    }
    
    public static SubLObject f6038(final SubLObject var13) {
        f6012(var13, f6005(var13));
        return var13;
    }
    
    public static SubLObject f6023(final SubLObject var39, final SubLObject var40, final SubLObject var41, final SubLObject var42, final SubLObject var43) {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        assert NIL != Types.vectorp(var39) : var39;
        assert NIL != Types.integerp(var40) : var40;
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var44) && NIL != module0035.find_if_not((SubLObject)$ic63$, var42, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            Errors.error((SubLObject)$ic64$, var42);
        }
        assert NIL != Types.listp(var42) : var42;
        assert NIL != Types.integerp(var43) : var43;
        Vectors.set_aref(var39, var40, (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var41, (SubLObject)ConsesLow.cons(var42, var43)), Vectors.aref(var39, var40)));
        return var39;
    }
    
    public static SubLObject f6032(final SubLObject var39, final SubLObject var40, final SubLObject var44) {
        SubLObject var45;
        SubLObject var46;
        for (var45 = Vectors.aref(var39, var40), var46 = var45.first(); NIL != var46 && NIL == f6039(var46.first(), var44); var46 = var45.first()) {
            var45 = var45.rest();
        }
        return var46.rest();
    }
    
    public static SubLObject f6039(final SubLObject var41, SubLObject var44) {
        if (var44.isInteger() && NIL != module0039.f3011(var44)) {
            var44 = Characters.code_char(var44);
        }
        return (NIL != var44 && var41.isFunction() && !var44.eql((SubLObject)$ic40$)) ? Functions.funcall(var41, var44) : Equality.equalp(var41, var44);
    }
    
    public static SubLObject f6022(final SubLObject var47) {
        assert NIL != Types.listp(var47) : var47;
        SubLObject var48 = (SubLObject)ZERO_INTEGER;
        SubLObject var49 = var47;
        SubLObject var50 = (SubLObject)NIL;
        var50 = var49.first();
        while (NIL != var49) {
            if (var50.first().numG(var48)) {
                var48 = var50.first();
            }
            if (conses_high.last(var50, (SubLObject)UNPROVIDED).first().numG(var48)) {
                var48 = conses_high.last(var50, (SubLObject)UNPROVIDED).first();
            }
            var49 = var49.rest();
            var50 = var49.first();
        }
        return var48;
    }
    
    public static SubLObject f6040() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0088", "f5995", "S#7643", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0088", "f5997", "S#7642", 1, 0, false);
        new $f5997$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0088", "f5998", "S#7644", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0088", "f5999", "S#7645", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0088", "f6000", "S#7646", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0088", "f6001", "S#7647", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0088", "f6002", "S#7648", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0088", "f6003", "S#7649", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0088", "f6004", "S#7650", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0088", "f6005", "S#7651", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0088", "f6006", "S#7652", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0088", "f6007", "S#7653", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0088", "f6008", "S#7654", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0088", "f6009", "S#7655", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0088", "f6010", "S#7656", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0088", "f6011", "S#7657", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0088", "f6012", "S#7658", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0088", "f6013", "S#7659", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0088", "f6014", "S#7660", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0088", "f6015", "S#7661", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0088", "f6016", "S#7662", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0088", "f6017", "S#7663", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0088", "f6018", "S#7664", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0088", "f5996", "S#7665", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0088", "f6019", "S#7666", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0088", "f6020", "S#7667", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0088", "f6021", "S#7668", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0088", "f6024", "S#7669", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0088", "f6025", "S#7670", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0088", "f6029", "S#7671");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0088", "f6030", "S#7672", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0088", "f6026", "S#7673", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0088", "f6031", "S#7674", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0088", "f6027", "S#7675", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0088", "f6033", "S#7676", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0088", "f6028", "S#7677", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0088", "f6035", "S#7678", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0088", "f6034", "S#7679", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0088", "f6036", "S#7680", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0088", "f6037", "S#7681", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0088", "f6038", "S#7682", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0088", "f6023", "S#7683", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0088", "f6032", "S#7684", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0088", "f6039", "S#7685", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0088", "f6022", "S#7686", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6041() {
        $g1178$ = SubLFiles.defconstant("S#7687", (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6042() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g1178$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic8$);
        Structures.def_csetf((SubLObject)$ic9$, (SubLObject)$ic10$);
        Structures.def_csetf((SubLObject)$ic11$, (SubLObject)$ic12$);
        Structures.def_csetf((SubLObject)$ic13$, (SubLObject)$ic14$);
        Structures.def_csetf((SubLObject)$ic15$, (SubLObject)$ic16$);
        Structures.def_csetf((SubLObject)$ic17$, (SubLObject)$ic18$);
        Structures.def_csetf((SubLObject)$ic19$, (SubLObject)$ic20$);
        Structures.def_csetf((SubLObject)$ic21$, (SubLObject)$ic22$);
        Structures.def_csetf((SubLObject)$ic23$, (SubLObject)$ic24$);
        Structures.def_csetf((SubLObject)$ic25$, (SubLObject)$ic26$);
        Equality.identity((SubLObject)$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g1178$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic41$));
        module0012.f419((SubLObject)$ic6$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f6040();
    }
    
    public void initializeVariables() {
        f6041();
    }
    
    public void runTopLevelForms() {
        f6042();
    }
    
    static {
        me = (SubLFile)new module0088();
        $g1178$ = null;
        $ic0$ = makeSymbol("S#7641", "CYC");
        $ic1$ = makeSymbol("S#7642", "CYC");
        $ic2$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#7688", "CYC"), makeSymbol("S#7689", "CYC"), makeSymbol("S#7690", "CYC"), makeSymbol("S#7691", "CYC"), makeSymbol("S#7692", "CYC"), makeSymbol("S#7693", "CYC"), makeSymbol("S#7694", "CYC"), makeSymbol("S#7695", "CYC"), makeSymbol("S#7696", "CYC") });
        $ic3$ = ConsesLow.list(new SubLObject[] { makeKeyword("INITIAL-STATE"), makeKeyword("FINAL-STATES"), makeKeyword("MACHINE-TABLE"), makeKeyword("TOKEN-BUILDER"), makeKeyword("INPUT"), makeKeyword("CURRENT-TOKEN-INDEX"), makeKeyword("CURRENT-STATE"), makeKeyword("MEMORY"), makeKeyword("INDEXED-OUTPUT") });
        $ic4$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#7644", "CYC"), makeSymbol("S#7645", "CYC"), makeSymbol("S#7646", "CYC"), makeSymbol("S#7647", "CYC"), makeSymbol("S#7648", "CYC"), makeSymbol("S#7649", "CYC"), makeSymbol("S#7650", "CYC"), makeSymbol("S#7651", "CYC"), makeSymbol("S#7652", "CYC") });
        $ic5$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#7653", "CYC"), makeSymbol("S#7654", "CYC"), makeSymbol("S#7655", "CYC"), makeSymbol("S#7656", "CYC"), makeSymbol("S#7657", "CYC"), makeSymbol("S#7658", "CYC"), makeSymbol("S#7659", "CYC"), makeSymbol("S#7660", "CYC"), makeSymbol("S#7661", "CYC") });
        $ic6$ = makeSymbol("S#7665", "CYC");
        $ic7$ = makeSymbol("S#7643", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#7642", "CYC"));
        $ic9$ = makeSymbol("S#7644", "CYC");
        $ic10$ = makeSymbol("S#7653", "CYC");
        $ic11$ = makeSymbol("S#7645", "CYC");
        $ic12$ = makeSymbol("S#7654", "CYC");
        $ic13$ = makeSymbol("S#7646", "CYC");
        $ic14$ = makeSymbol("S#7655", "CYC");
        $ic15$ = makeSymbol("S#7647", "CYC");
        $ic16$ = makeSymbol("S#7656", "CYC");
        $ic17$ = makeSymbol("S#7648", "CYC");
        $ic18$ = makeSymbol("S#7657", "CYC");
        $ic19$ = makeSymbol("S#7649", "CYC");
        $ic20$ = makeSymbol("S#7658", "CYC");
        $ic21$ = makeSymbol("S#7650", "CYC");
        $ic22$ = makeSymbol("S#7659", "CYC");
        $ic23$ = makeSymbol("S#7651", "CYC");
        $ic24$ = makeSymbol("S#7660", "CYC");
        $ic25$ = makeSymbol("S#7652", "CYC");
        $ic26$ = makeSymbol("S#7661", "CYC");
        $ic27$ = makeKeyword("INITIAL-STATE");
        $ic28$ = makeKeyword("FINAL-STATES");
        $ic29$ = makeKeyword("MACHINE-TABLE");
        $ic30$ = makeKeyword("TOKEN-BUILDER");
        $ic31$ = makeKeyword("INPUT");
        $ic32$ = makeKeyword("CURRENT-TOKEN-INDEX");
        $ic33$ = makeKeyword("CURRENT-STATE");
        $ic34$ = makeKeyword("MEMORY");
        $ic35$ = makeKeyword("INDEXED-OUTPUT");
        $ic36$ = makeString("Invalid slot ~S for construction function");
        $ic37$ = makeKeyword("BEGIN");
        $ic38$ = makeSymbol("S#7662", "CYC");
        $ic39$ = makeKeyword("SLOT");
        $ic40$ = makeKeyword("END");
        $ic41$ = makeSymbol("S#7664", "CYC");
        $ic42$ = makeString("#<FST: ~S>");
        $ic43$ = makeSymbol("S#7669", "CYC");
        $ic44$ = makeSymbol("INTEGERP");
        $ic45$ = makeString("Invalid final states ~a");
        $ic46$ = makeSymbol("LISTP");
        $ic47$ = makeSymbol("FUNCTION-SPEC-P");
        $ic48$ = makeSymbol("CAR");
        $ic49$ = makeSymbol("SEQUENCEP");
        $ic50$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#7697", "CYC"), (SubLObject)makeSymbol("SEQUENCE"), (SubLObject)makeSymbol("S#7698", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic51$ = makeSymbol("PROGN");
        $ic52$ = makeSymbol("S#7673", "CYC");
        $ic53$ = makeSymbol("CDO");
        $ic54$ = makeSymbol("S#7674", "CYC");
        $ic55$ = makeSymbol("NULL");
        $ic56$ = makeSymbol("VECTOR");
        $ic57$ = ConsesLow.list((SubLObject)makeKeyword("EMIT"), (SubLObject)makeKeyword("REMEMBER"), (SubLObject)makeKeyword("BACKUP"));
        $ic58$ = makeKeyword("EMIT");
        $ic59$ = makeKeyword("REMEMBER");
        $ic60$ = makeKeyword("BACKUP");
        $ic61$ = makeString("Invalid FST command ~a");
        $ic62$ = makeSymbol("VECTORP");
        $ic63$ = makeSymbol("S#7678", "CYC");
        $ic64$ = makeString("Invalid FST action list ~a");
    }
    
    public static final class $sX7641_native extends SubLStructNative
    {
        public SubLObject $initial_state;
        public SubLObject $final_states;
        public SubLObject $machine_table;
        public SubLObject $token_builder;
        public SubLObject $input;
        public SubLObject $current_token_index;
        public SubLObject $current_state;
        public SubLObject $memory;
        public SubLObject $indexed_output;
        public static final SubLStructDeclNative structDecl;
        
        public $sX7641_native() {
            this.$initial_state = (SubLObject)CommonSymbols.NIL;
            this.$final_states = (SubLObject)CommonSymbols.NIL;
            this.$machine_table = (SubLObject)CommonSymbols.NIL;
            this.$token_builder = (SubLObject)CommonSymbols.NIL;
            this.$input = (SubLObject)CommonSymbols.NIL;
            this.$current_token_index = (SubLObject)CommonSymbols.NIL;
            this.$current_state = (SubLObject)CommonSymbols.NIL;
            this.$memory = (SubLObject)CommonSymbols.NIL;
            this.$indexed_output = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$initial_state;
        }
        
        public SubLObject getField3() {
            return this.$final_states;
        }
        
        public SubLObject getField4() {
            return this.$machine_table;
        }
        
        public SubLObject getField5() {
            return this.$token_builder;
        }
        
        public SubLObject getField6() {
            return this.$input;
        }
        
        public SubLObject getField7() {
            return this.$current_token_index;
        }
        
        public SubLObject getField8() {
            return this.$current_state;
        }
        
        public SubLObject getField9() {
            return this.$memory;
        }
        
        public SubLObject getField10() {
            return this.$indexed_output;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$initial_state = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$final_states = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$machine_table = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$token_builder = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$input = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$current_token_index = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$current_state = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$memory = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$indexed_output = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX7641_native.class, $ic0$, $ic1$, $ic2$, $ic3$, new String[] { "$initial_state", "$final_states", "$machine_table", "$token_builder", "$input", "$current_token_index", "$current_state", "$memory", "$indexed_output" }, $ic4$, $ic5$, $ic6$);
        }
    }
    
    public static final class $f5997$UnaryFunction extends UnaryFunction
    {
        public $f5997$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#7642"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f5997(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 168 ms
	
	Decompiled with Procyon 0.5.32.
*/