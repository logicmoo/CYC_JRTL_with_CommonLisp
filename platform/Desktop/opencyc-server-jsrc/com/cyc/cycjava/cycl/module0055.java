package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
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

public final class module0055 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0055";
    public static final String myFingerPrint = "a3b84f77246044f10a45469c93182d5c93373ff0b134f4592d6d055a98388873";
    public static SubLSymbol $g1033$;
    private static SubLSymbol $g1034$;
    public static SubLSymbol $g1035$;
    public static SubLSymbol $g1036$;
    public static SubLSymbol $g1037$;
    public static SubLSymbol $g1038$;
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
    private static final SubLString $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLString $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLString $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLList $ic28$;
    private static final SubLList $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLString $ic44$;
    private static final SubLString $ic45$;
    private static final SubLString $ic46$;
    private static final SubLInteger $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLString $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLList $ic53$;
    private static final SubLList $ic54$;
    private static final SubLList $ic55$;
    private static final SubLList $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLList $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLList $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLList $ic89$;
    private static final SubLList $ic90$;
    private static final SubLList $ic91$;
    private static final SubLList $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLList $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLString $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLList $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLList $ic110$;
    private static final SubLList $ic111$;
    private static final SubLList $ic112$;
    private static final SubLList $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLList $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLString $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLList $ic128$;
    private static final SubLList $ic129$;
    private static final SubLList $ic130$;
    private static final SubLList $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLList $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLString $ic142$;
    
    public static SubLObject f4004(final SubLObject var1, final SubLObject var2) {
        f4005(var1, var2, (SubLObject)module0055.ZERO_INTEGER);
        return (SubLObject)module0055.NIL;
    }
    
    public static SubLObject f4006(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX5243_native.class) ? module0055.T : module0055.NIL);
    }
    
    public static SubLObject f4007(final SubLObject var1) {
        assert module0055.NIL != f4006(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f4008(final SubLObject var1) {
        assert module0055.NIL != f4006(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f4009(final SubLObject var1) {
        assert module0055.NIL != f4006(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f4010(final SubLObject var1, final SubLObject var4) {
        assert module0055.NIL != f4006(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f4011(final SubLObject var1, final SubLObject var4) {
        assert module0055.NIL != f4006(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f4012(final SubLObject var1, final SubLObject var4) {
        assert module0055.NIL != f4006(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f4013(SubLObject var5) {
        if (var5 == module0055.UNPROVIDED) {
            var5 = (SubLObject)module0055.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX5243_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0055.NIL, var7 = var5; module0055.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0055.$ic15$)) {
                f4010(var6, var9);
            }
            else if (var10.eql((SubLObject)module0055.$ic16$)) {
                f4011(var6, var9);
            }
            else if (var10.eql((SubLObject)module0055.$ic17$)) {
                f4012(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0055.$ic18$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f4014(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0055.$ic19$, (SubLObject)module0055.$ic20$, (SubLObject)module0055.THREE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0055.$ic21$, (SubLObject)module0055.$ic15$, f4007(var11));
        Functions.funcall(var12, var11, (SubLObject)module0055.$ic21$, (SubLObject)module0055.$ic16$, f4008(var11));
        Functions.funcall(var12, var11, (SubLObject)module0055.$ic21$, (SubLObject)module0055.$ic17$, f4009(var11));
        Functions.funcall(var12, var11, (SubLObject)module0055.$ic22$, (SubLObject)module0055.$ic20$, (SubLObject)module0055.THREE_INTEGER);
        return var11;
    }
    
    public static SubLObject f4015(final SubLObject var11, final SubLObject var12) {
        return f4014(var11, var12);
    }
    
    public static SubLObject f4005(final SubLObject var13, final SubLObject var2, final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (module0055.NIL != print_high.$print_readably$.getDynamicValue(var15)) {
            print_high.print_not_readable(var13, var2);
        }
        else {
            streams_high.write_string((SubLObject)module0055.$ic24$, var2, (SubLObject)module0055.UNPROVIDED, (SubLObject)module0055.UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var13), new SubLObject[] { module0055.$ic25$, var2 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            streams_high.write_string((SubLObject)module0055.$ic26$, var2, (SubLObject)module0055.UNPROVIDED, (SubLObject)module0055.UNPROVIDED);
            print_high.princ(f4016(var13), var2);
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            PrintLow.write(Equality.pointer(var13), new SubLObject[] { module0055.$ic25$, var2, module0055.$ic27$, module0055.SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var2);
        }
        return var13;
    }
    
    public static SubLObject f4017() {
        return f4018(f4013((SubLObject)module0055.UNPROVIDED));
    }
    
    public static SubLObject f4018(final SubLObject var13) {
        assert module0055.NIL != f4006(var13) : var13;
        f4010(var13, (SubLObject)module0055.ZERO_INTEGER);
        f4011(var13, (SubLObject)module0055.NIL);
        f4012(var13, (SubLObject)module0055.NIL);
        return var13;
    }
    
    public static SubLObject f4019(final SubLObject var13) {
        assert module0055.NIL != f4006(var13) : var13;
        return Types.sublisp_null(f4008(var13));
    }
    
    public static SubLObject f4016(final SubLObject var13) {
        assert module0055.NIL != f4006(var13) : var13;
        return f4007(var13);
    }
    
    public static SubLObject f4020(final SubLObject var13) {
        assert module0055.NIL != f4006(var13) : var13;
        return conses_high.copy_list(f4008(var13));
    }
    
    public static SubLObject f4021(final SubLObject var19, final SubLObject var13) {
        final SubLObject var20 = (SubLObject)ConsesLow.list(var19);
        if (module0055.NIL != f4019(var13)) {
            f4011(var13, var20);
        }
        else {
            ConsesLow.rplacd(f4009(var13), var20);
        }
        f4010(var13, Numbers.add(f4007(var13), (SubLObject)module0055.ONE_INTEGER));
        f4012(var13, var20);
        return var13;
    }
    
    public static SubLObject f4022(final SubLObject var21, final SubLObject var13) {
        SubLObject var22 = var21;
        SubLObject var23 = (SubLObject)module0055.NIL;
        var23 = var22.first();
        while (module0055.NIL != var22) {
            f4021(var23, var13);
            var22 = var22.rest();
            var23 = var22.first();
        }
        return var13;
    }
    
    public static SubLObject f4023(final SubLObject var13) {
        assert module0055.NIL != f4006(var13) : var13;
        if (module0055.NIL == f4019(var13)) {
            final SubLObject var14 = f4008(var13);
            final SubLObject var15 = var14.first();
            final SubLObject var16 = var14.rest();
            f4010(var13, Numbers.subtract(f4007(var13), (SubLObject)module0055.ONE_INTEGER));
            f4011(var13, var16);
            if (module0055.NIL == var16) {
                f4012(var13, (SubLObject)module0055.NIL);
            }
            return var15;
        }
        return (SubLObject)module0055.NIL;
    }
    
    public static SubLObject f4024(final SubLObject var13) {
        assert module0055.NIL != f4006(var13) : var13;
        final SubLObject var14 = f4008(var13);
        f4018(var13);
        return var14;
    }
    
    public static SubLObject f4025(final SubLObject var13) {
        assert module0055.NIL != f4006(var13) : var13;
        final SubLObject var14 = f4023(var13);
        f4021(var14, var13);
        return var14;
    }
    
    public static SubLObject f4026(final SubLObject var19, final SubLObject var13, SubLObject var25) {
        if (var25 == module0055.UNPROVIDED) {
            var25 = Symbols.symbol_function((SubLObject)module0055.EQL);
        }
        assert module0055.NIL != f4006(var13) : var13;
        final SubLObject var26 = f4009(var13);
        SubLObject var27 = (SubLObject)module0055.NIL;
        SubLObject var28;
        for (var28 = (SubLObject)module0055.NIL, var28 = f4008(var13); module0055.NIL != var28; var28 = var28.rest()) {
            if (module0055.NIL != Functions.funcall(var25, var28.first(), var19)) {
                f4010(var13, Numbers.subtract(f4007(var13), (SubLObject)module0055.ONE_INTEGER));
                if (var28.eql(var26)) {
                    f4012(var13, var27);
                }
                if (var28.eql(f4008(var13))) {
                    f4011(var13, var28.rest());
                }
                else {
                    ConsesLow.rplacd(var27, var28.rest());
                }
            }
            else {
                var27 = var28;
            }
        }
        return var13;
    }
    
    public static SubLObject f4027(final SubLObject var13) {
        assert module0055.NIL != f4006(var13) : var13;
        if (module0055.NIL != f4019(var13)) {
            return var13;
        }
        if (f4016(var13).numE((SubLObject)module0055.ONE_INTEGER)) {
            return f4018(var13);
        }
        SubLObject var14 = (SubLObject)module0055.NIL;
        SubLObject var15;
        SubLObject var16;
        for (var15 = f4009(var13), var16 = (SubLObject)module0055.NIL, var16 = f4008(var13); !var16.eql(var15); var16 = var16.rest()) {
            var14 = var16;
        }
        f4010(var13, Numbers.subtract(f4007(var13), (SubLObject)module0055.ONE_INTEGER));
        f4012(var13, var14);
        ConsesLow.rplacd(var14, var16.rest());
        return var13;
    }
    
    public static SubLObject f4028(final SubLObject var19, final SubLObject var13, SubLObject var25, SubLObject var29) {
        if (var25 == module0055.UNPROVIDED) {
            var25 = Symbols.symbol_function((SubLObject)module0055.EQL);
        }
        if (var29 == module0055.UNPROVIDED) {
            var29 = Symbols.symbol_function((SubLObject)module0055.IDENTITY);
        }
        assert module0055.NIL != f4006(var13) : var13;
        return Sequences.find(var19, f4008(var13), var25, var29, (SubLObject)module0055.UNPROVIDED, (SubLObject)module0055.UNPROVIDED);
    }
    
    public static SubLObject f4029(final SubLObject var25, final SubLObject var13, SubLObject var29) {
        if (var29 == module0055.UNPROVIDED) {
            var29 = Symbols.symbol_function((SubLObject)module0055.IDENTITY);
        }
        assert module0055.NIL != f4006(var13) : var13;
        return Sequences.find_if(var25, f4008(var13), var29, (SubLObject)module0055.UNPROVIDED, (SubLObject)module0055.UNPROVIDED);
    }
    
    public static SubLObject f4030(final SubLObject var13) {
        assert module0055.NIL != f4006(var13) : var13;
        return f4008(var13).first();
    }
    
    public static SubLObject f4031(final SubLObject var13, final SubLObject var30) {
        assert module0055.NIL != f4006(var13) : var13;
        return module0035.f2124(var30, f4008(var13));
    }
    
    public static SubLObject f4032(final SubLObject var13) {
        assert module0055.NIL != f4006(var13) : var13;
        return module0052.f3709(f4008(var13));
    }
    
    public static SubLObject f4033(final SubLObject var31, final SubLObject var32) {
        SubLObject var34;
        final SubLObject var33 = var34 = var31.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)module0055.$ic28$);
        final SubLObject var35 = var34.rest();
        var34 = var34.first();
        SubLObject var36 = (SubLObject)module0055.NIL;
        SubLObject var37 = (SubLObject)module0055.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)module0055.$ic28$);
        var36 = var34.first();
        var34 = var34.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)module0055.$ic28$);
        var37 = var34.first();
        var34 = var34.rest();
        SubLObject var38 = (SubLObject)module0055.NIL;
        SubLObject var39 = var34;
        SubLObject var40 = (SubLObject)module0055.NIL;
        SubLObject var40_41 = (SubLObject)module0055.NIL;
        while (module0055.NIL != var39) {
            cdestructuring_bind.destructuring_bind_must_consp(var39, var33, (SubLObject)module0055.$ic28$);
            var40_41 = var39.first();
            var39 = var39.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var39, var33, (SubLObject)module0055.$ic28$);
            if (module0055.NIL == conses_high.member(var40_41, (SubLObject)module0055.$ic29$, (SubLObject)module0055.UNPROVIDED, (SubLObject)module0055.UNPROVIDED)) {
                var40 = (SubLObject)module0055.T;
            }
            if (var40_41 == module0055.$ic30$) {
                var38 = var39.first();
            }
            var39 = var39.rest();
        }
        if (module0055.NIL != var40 && module0055.NIL == var38) {
            cdestructuring_bind.cdestructuring_bind_error(var33, (SubLObject)module0055.$ic28$);
        }
        final SubLObject var41 = cdestructuring_bind.property_list_member((SubLObject)module0055.$ic31$, var34);
        final SubLObject var42 = (SubLObject)((module0055.NIL != var41) ? conses_high.cadr(var41) : module0055.NIL);
        final SubLObject var43;
        var34 = (var43 = var35);
        return (SubLObject)ConsesLow.listS((SubLObject)module0055.$ic32$, (SubLObject)ConsesLow.list(var36, (SubLObject)ConsesLow.list((SubLObject)module0055.$ic33$, var37), (SubLObject)module0055.$ic31$, var42), ConsesLow.append(var43, (SubLObject)module0055.NIL));
    }
    
    public static SubLObject f4034(final SubLObject var13) {
        return f4008(var13);
    }
    
    public static SubLObject f4035(final SubLObject var31, final SubLObject var32) {
        SubLObject var34;
        final SubLObject var33 = var34 = var31.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)module0055.$ic28$);
        final SubLObject var35 = var34.rest();
        var34 = var34.first();
        SubLObject var36 = (SubLObject)module0055.NIL;
        SubLObject var37 = (SubLObject)module0055.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)module0055.$ic28$);
        var36 = var34.first();
        var34 = var34.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)module0055.$ic28$);
        var37 = var34.first();
        var34 = var34.rest();
        SubLObject var38 = (SubLObject)module0055.NIL;
        SubLObject var39 = var34;
        SubLObject var40 = (SubLObject)module0055.NIL;
        SubLObject var51_52 = (SubLObject)module0055.NIL;
        while (module0055.NIL != var39) {
            cdestructuring_bind.destructuring_bind_must_consp(var39, var33, (SubLObject)module0055.$ic28$);
            var51_52 = var39.first();
            var39 = var39.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var39, var33, (SubLObject)module0055.$ic28$);
            if (module0055.NIL == conses_high.member(var51_52, (SubLObject)module0055.$ic29$, (SubLObject)module0055.UNPROVIDED, (SubLObject)module0055.UNPROVIDED)) {
                var40 = (SubLObject)module0055.T;
            }
            if (var51_52 == module0055.$ic30$) {
                var38 = var39.first();
            }
            var39 = var39.rest();
        }
        if (module0055.NIL != var40 && module0055.NIL == var38) {
            cdestructuring_bind.cdestructuring_bind_error(var33, (SubLObject)module0055.$ic28$);
        }
        final SubLObject var41 = cdestructuring_bind.property_list_member((SubLObject)module0055.$ic31$, var34);
        final SubLObject var42 = (SubLObject)((module0055.NIL != var41) ? conses_high.cadr(var41) : module0055.NIL);
        final SubLObject var43;
        var34 = (var43 = var35);
        final SubLObject var44 = (SubLObject)module0055.$ic35$;
        final SubLObject var45 = (SubLObject)module0055.$ic36$;
        return (SubLObject)ConsesLow.list((SubLObject)module0055.$ic37$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var44, var37), (SubLObject)ConsesLow.list(var45, reader.bq_cons((SubLObject)module0055.$ic38$, ConsesLow.append((SubLObject)((module0055.NIL != var42) ? ConsesLow.list(var42) : module0055.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0055.$ic39$, var44)))))), (SubLObject)ConsesLow.list((SubLObject)module0055.$ic40$, (SubLObject)ConsesLow.list((SubLObject)module0055.$ic41$, var45), (SubLObject)ConsesLow.listS((SubLObject)module0055.$ic37$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var36, (SubLObject)ConsesLow.list((SubLObject)module0055.$ic42$, var44))), ConsesLow.append(var43, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0055.$ic43$, var45, reader.bq_cons((SubLObject)module0055.$ic38$, ConsesLow.append((SubLObject)((module0055.NIL != var42) ? ConsesLow.list(var42) : module0055.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0055.$ic39$, var44))))))))));
    }
    
    public static SubLObject f4036(final SubLObject var13) {
        final SubLObject var14 = f4017();
        SubLObject var15 = f4034(var13);
        SubLObject var16 = (SubLObject)module0055.NIL;
        var16 = var15.first();
        while (module0055.NIL != var15) {
            f4021(var16, var14);
            var15 = var15.rest();
            var16 = var15.first();
        }
        return var14;
    }
    
    public static SubLObject f4037(final SubLObject var13, SubLObject var2) {
        if (var2 == module0055.UNPROVIDED) {
            var2 = (SubLObject)module0055.T;
        }
        PrintLow.format(var2, (SubLObject)module0055.$ic44$, f4016(var13));
        PrintLow.format(var2, (SubLObject)module0055.$ic45$);
        SubLObject var14 = f4008(var13);
        SubLObject var15 = (SubLObject)module0055.NIL;
        var15 = var14.first();
        while (module0055.NIL != var14) {
            PrintLow.format(var2, (SubLObject)module0055.$ic46$, var15);
            var14 = var14.rest();
            var15 = var14.first();
        }
        return (SubLObject)module0055.NIL;
    }
    
    public static SubLObject f4038(final SubLObject var57, final SubLObject var2) {
        f4039(var57, var2);
        return var57;
    }
    
    public static SubLObject f4039(final SubLObject var13, final SubLObject var2) {
        module0021.f1110(module0055.$g1034$.getGlobalValue(), var2);
        f4040(var13, var2);
        return var13;
    }
    
    public static SubLObject f4040(final SubLObject var13, final SubLObject var2) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = f4016(var13);
        SubLObject var16 = (SubLObject)module0055.ZERO_INTEGER;
        module0021.f1038(var15, var2);
        SubLObject var17 = f4034(var13);
        SubLObject var18 = (SubLObject)module0055.NIL;
        var18 = var17.first();
        while (module0055.NIL != var17) {
            module0021.f1038(var18, var2);
            var16 = Numbers.add(var16, (SubLObject)module0055.ONE_INTEGER);
            var17 = var17.rest();
            var18 = var17.first();
        }
        if (module0055.NIL == Errors.$ignore_mustsP$.getDynamicValue(var14) && !var16.numE(var15)) {
            Errors.error((SubLObject)module0055.$ic50$, var15, var16);
        }
        return var13;
    }
    
    public static SubLObject f4041(final SubLObject var2) {
        final SubLObject var3 = module0021.f1060(var2, (SubLObject)module0055.UNPROVIDED, (SubLObject)module0055.UNPROVIDED);
        final SubLObject var4 = f4017();
        SubLObject var5;
        SubLObject var6;
        for (var5 = (SubLObject)module0055.NIL, var5 = (SubLObject)module0055.ZERO_INTEGER; var5.numL(var3); var5 = Numbers.add(var5, (SubLObject)module0055.ONE_INTEGER)) {
            var6 = module0021.f1060(var2, (SubLObject)module0055.UNPROVIDED, (SubLObject)module0055.UNPROVIDED);
            f4021(var6, var4);
        }
        return var4;
    }
    
    public static SubLObject f4042(final SubLObject var1, final SubLObject var2) {
        f4043(var1, var2, (SubLObject)module0055.ZERO_INTEGER);
        return (SubLObject)module0055.NIL;
    }
    
    public static SubLObject f4044(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX5479_native.class) ? module0055.T : module0055.NIL);
    }
    
    public static SubLObject f4045(final SubLObject var1) {
        assert module0055.NIL != f4044(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f4046(final SubLObject var1) {
        assert module0055.NIL != f4044(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f4047(final SubLObject var1) {
        assert module0055.NIL != f4044(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f4048(final SubLObject var1) {
        assert module0055.NIL != f4044(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f4049(final SubLObject var1) {
        assert module0055.NIL != f4044(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f4050(final SubLObject var1, final SubLObject var4) {
        assert module0055.NIL != f4044(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f4051(final SubLObject var1, final SubLObject var4) {
        assert module0055.NIL != f4044(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f4052(final SubLObject var1, final SubLObject var4) {
        assert module0055.NIL != f4044(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f4053(final SubLObject var1, final SubLObject var4) {
        assert module0055.NIL != f4044(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f4054(final SubLObject var1, final SubLObject var4) {
        assert module0055.NIL != f4044(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f4055(SubLObject var5) {
        if (var5 == module0055.UNPROVIDED) {
            var5 = (SubLObject)module0055.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX5479_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0055.NIL, var7 = var5; module0055.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0055.$ic15$)) {
                f4050(var6, var9);
            }
            else if (var10.eql((SubLObject)module0055.$ic70$)) {
                f4051(var6, var9);
            }
            else if (var10.eql((SubLObject)module0055.$ic71$)) {
                f4052(var6, var9);
            }
            else if (var10.eql((SubLObject)module0055.$ic72$)) {
                f4053(var6, var9);
            }
            else if (var10.eql((SubLObject)module0055.$ic73$)) {
                f4054(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0055.$ic18$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f4056(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0055.$ic19$, (SubLObject)module0055.$ic74$, (SubLObject)module0055.FIVE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0055.$ic21$, (SubLObject)module0055.$ic15$, f4045(var11));
        Functions.funcall(var12, var11, (SubLObject)module0055.$ic21$, (SubLObject)module0055.$ic70$, f4046(var11));
        Functions.funcall(var12, var11, (SubLObject)module0055.$ic21$, (SubLObject)module0055.$ic71$, f4047(var11));
        Functions.funcall(var12, var11, (SubLObject)module0055.$ic21$, (SubLObject)module0055.$ic72$, f4048(var11));
        Functions.funcall(var12, var11, (SubLObject)module0055.$ic21$, (SubLObject)module0055.$ic73$, f4049(var11));
        Functions.funcall(var12, var11, (SubLObject)module0055.$ic22$, (SubLObject)module0055.$ic74$, (SubLObject)module0055.FIVE_INTEGER);
        return var11;
    }
    
    public static SubLObject f4057(final SubLObject var11, final SubLObject var12) {
        return f4056(var11, var12);
    }
    
    public static SubLObject f4043(final SubLObject var65, final SubLObject var2, final SubLObject var14) {
        final SubLThread var66 = SubLProcess.currentSubLThread();
        if (module0055.NIL != print_high.$print_readably$.getDynamicValue(var66)) {
            print_high.print_not_readable(var65, var2);
        }
        else {
            streams_high.write_string((SubLObject)module0055.$ic24$, var2, (SubLObject)module0055.UNPROVIDED, (SubLObject)module0055.UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var65), new SubLObject[] { module0055.$ic25$, var2 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            streams_high.write_string((SubLObject)module0055.$ic26$, var2, (SubLObject)module0055.UNPROVIDED, (SubLObject)module0055.UNPROVIDED);
            print_high.princ(f4058(var65), var2);
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            PrintLow.write(Equality.pointer(var65), new SubLObject[] { module0055.$ic25$, var2, module0055.$ic27$, module0055.SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var2);
        }
        return var65;
    }
    
    public static SubLObject f4059(final SubLObject var69, final SubLObject var70, SubLObject var71) {
        if (var71 == module0055.UNPROVIDED) {
            var71 = Symbols.symbol_function((SubLObject)module0055.$ic76$);
        }
        final SubLObject var72 = f4055((SubLObject)module0055.UNPROVIDED);
        f4050(var72, (SubLObject)module0055.ZERO_INTEGER);
        f4051(var72, var69);
        f4052(var72, var70);
        f4053(var72, var71);
        f4054(var72, (SubLObject)module0055.NIL);
        return var72;
    }
    
    public static SubLObject f4060(final SubLObject var73) {
        f4050(var73, (SubLObject)module0055.ZERO_INTEGER);
        f4054(var73, (SubLObject)module0055.NIL);
        return var73;
    }
    
    public static SubLObject f4058(final SubLObject var73) {
        assert module0055.NIL != f4044(var73) : var73;
        return f4045(var73);
    }
    
    public static SubLObject f4061(final SubLObject var73) {
        assert module0055.NIL != f4044(var73) : var73;
        return Numbers.numE(f4058(var73), (SubLObject)module0055.ZERO_INTEGER);
    }
    
    public static SubLObject f4062(final SubLObject var73) {
        assert module0055.NIL != f4044(var73) : var73;
        return (SubLObject)SubLObjectFactory.makeBoolean(f4046(var73).isFixnum() && f4058(var73).numE(f4046(var73)));
    }
    
    public static SubLObject f4063(final SubLObject var73) {
        assert module0055.NIL != f4044(var73) : var73;
        final SubLObject var74 = module0053.f3832(f4049(var73));
        if (module0055.NIL != module0053.f3802(var74)) {
            return f4064(module0053.f3804(var74));
        }
        return (SubLObject)module0055.NIL;
    }
    
    public static SubLObject f4065(final SubLObject var73) {
        assert module0055.NIL != f4044(var73) : var73;
        final SubLObject var74 = module0053.f3833(f4049(var73));
        if (module0055.NIL != module0053.f3802(var74)) {
            return f4066(module0053.f3804(var74));
        }
        return (SubLObject)module0055.NIL;
    }
    
    public static SubLObject f4067(final SubLObject var19, final SubLObject var73) {
        assert module0055.NIL != f4044(var73) : var73;
        final SubLObject var74 = f4062(var73);
        if (module0055.NIL == var74) {
            final SubLObject var75 = module0053.f3826(var19, Functions.funcall(f4047(var73), var19), f4049(var73), f4048(var73), Symbols.symbol_function((SubLObject)module0055.$ic77$));
            if (!var75.eql(f4049(var73))) {
                f4054(var73, var75);
            }
            f4050(var73, Numbers.add(f4045(var73), (SubLObject)module0055.ONE_INTEGER));
            return Values.values(var73, var74, (SubLObject)module0055.NIL);
        }
        final SubLObject var76 = f4065(var73);
        if (module0055.NIL != Functions.funcall(f4048(var73), Functions.funcall(f4047(var73), var19), Functions.funcall(f4047(var73), var76))) {
            final SubLObject var77 = f4068(var73, (SubLObject)module0055.T);
            f4067(var19, var73);
            return Values.values(var73, var74, var77);
        }
        return Values.values(var73, var74, var19);
    }
    
    public static SubLObject f4068(final SubLObject var73, SubLObject var79) {
        if (var79 == module0055.UNPROVIDED) {
            var79 = (SubLObject)module0055.NIL;
        }
        assert module0055.NIL != f4044(var73) : var73;
        if (module0055.NIL == f4061(var73)) {
            final SubLObject var80 = (module0055.NIL != var79) ? f4065(var73) : f4063(var73);
            final SubLObject var81 = module0053.f3829(var80, Functions.funcall(f4047(var73), var80), f4049(var73), f4048(var73), Symbols.symbol_function((SubLObject)module0055.$ic78$), Symbols.symbol_function((SubLObject)module0055.$ic79$));
            if (!var81.eql(f4049(var73))) {
                f4054(var73, var81);
            }
            f4050(var73, Numbers.subtract(f4045(var73), (SubLObject)module0055.ONE_INTEGER));
            return var80;
        }
        return (SubLObject)module0055.NIL;
    }
    
    public static SubLObject f4069(final SubLObject var31, final SubLObject var32) {
        SubLObject var34;
        final SubLObject var33 = var34 = var31.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)module0055.$ic80$);
        final SubLObject var35 = var34.rest();
        var34 = var34.first();
        SubLObject var36 = (SubLObject)module0055.NIL;
        SubLObject var37 = (SubLObject)module0055.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)module0055.$ic80$);
        var36 = var34.first();
        var34 = var34.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)module0055.$ic80$);
        var37 = var34.first();
        var34 = var34.rest();
        SubLObject var38 = (SubLObject)module0055.NIL;
        SubLObject var39 = var34;
        SubLObject var40 = (SubLObject)module0055.NIL;
        SubLObject var87_88 = (SubLObject)module0055.NIL;
        while (module0055.NIL != var39) {
            cdestructuring_bind.destructuring_bind_must_consp(var39, var33, (SubLObject)module0055.$ic80$);
            var87_88 = var39.first();
            var39 = var39.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var39, var33, (SubLObject)module0055.$ic80$);
            if (module0055.NIL == conses_high.member(var87_88, (SubLObject)module0055.$ic29$, (SubLObject)module0055.UNPROVIDED, (SubLObject)module0055.UNPROVIDED)) {
                var40 = (SubLObject)module0055.T;
            }
            if (var87_88 == module0055.$ic30$) {
                var38 = var39.first();
            }
            var39 = var39.rest();
        }
        if (module0055.NIL != var40 && module0055.NIL == var38) {
            cdestructuring_bind.cdestructuring_bind_error(var33, (SubLObject)module0055.$ic80$);
        }
        final SubLObject var41 = cdestructuring_bind.property_list_member((SubLObject)module0055.$ic31$, var34);
        final SubLObject var42 = (SubLObject)((module0055.NIL != var41) ? conses_high.cadr(var41) : module0055.NIL);
        final SubLObject var43;
        var34 = (var43 = var35);
        final SubLObject var44 = (SubLObject)module0055.$ic81$;
        final SubLObject var45 = (SubLObject)module0055.$ic82$;
        return (SubLObject)ConsesLow.list((SubLObject)module0055.$ic83$, (SubLObject)ConsesLow.list(var44, var45, (SubLObject)ConsesLow.list((SubLObject)module0055.$ic84$, var37), (SubLObject)module0055.$ic31$, var42), (SubLObject)ConsesLow.list((SubLObject)module0055.$ic85$, var44), (SubLObject)ConsesLow.listS((SubLObject)module0055.$ic32$, (SubLObject)ConsesLow.list(var36, var45, (SubLObject)module0055.$ic31$, var42), ConsesLow.append(var43, (SubLObject)module0055.NIL)));
    }
    
    public static SubLObject f4070(final SubLObject var73) {
        assert module0055.NIL != f4044(var73) : var73;
        return f4049(var73);
    }
    
    public static SubLObject f4071(final SubLObject var73) {
        SubLObject var74 = (SubLObject)module0055.NIL;
        SubLObject var75 = (SubLObject)module0055.NIL;
        SubLObject var76 = f4070(var73);
        while (module0055.NIL != var76) {
            final SubLObject var77 = module0053.f3821(var76);
            SubLObject var79;
            final SubLObject var78 = var79 = module0053.f3822(var76);
            SubLObject var80 = (SubLObject)module0055.NIL;
            var80 = var79.first();
            while (module0055.NIL != var79) {
                var74 = (SubLObject)ConsesLow.cons(var80, var74);
                var79 = var79.rest();
                var80 = var79.first();
            }
            final SubLObject var81 = module0053.f3824(var76);
            final SubLObject var82 = module0053.f3825(var76);
            if (module0055.NIL != var81) {
                if (module0055.NIL != var82) {
                    var75 = (SubLObject)ConsesLow.cons(var82, var75);
                }
                var76 = var81;
            }
            else if (module0055.NIL != var82) {
                var76 = var82;
            }
            else {
                var76 = var75.first();
                var75 = var75.rest();
            }
        }
        var75 = (SubLObject)module0055.NIL;
        final SubLObject var83 = f4048(var73);
        final SubLObject var84 = f4047(var73);
        var74 = Sort.sort(var74, var83, var84);
        return var74;
    }
    
    public static SubLObject f4072(final SubLObject var19, final SubLObject var13, SubLObject var25, SubLObject var29) {
        if (var25 == module0055.UNPROVIDED) {
            var25 = Symbols.symbol_function((SubLObject)module0055.EQL);
        }
        if (var29 == module0055.UNPROVIDED) {
            var29 = Symbols.symbol_function((SubLObject)module0055.IDENTITY);
        }
        assert module0055.NIL != f4044(var13) : var13;
        SubLObject var30 = (SubLObject)module0055.NIL;
        SubLObject var31 = (SubLObject)module0055.NIL;
        SubLObject var32 = f4070(var13);
        while (module0055.NIL == var30 && module0055.NIL != var32) {
            final SubLObject var33 = module0053.f3821(var32);
            final SubLObject var34 = module0053.f3822(var32);
            SubLObject var35;
            SubLObject var36;
            for (var35 = (SubLObject)module0055.NIL, var35 = var34; module0055.NIL == var30 && module0055.NIL != var35; var35 = var35.rest()) {
                var36 = var35.first();
                if (module0055.NIL != Functions.funcall(var25, var19, Functions.funcall(var29, var36))) {
                    var30 = var36;
                }
            }
            final SubLObject var37 = module0053.f3824(var32);
            final SubLObject var38 = module0053.f3825(var32);
            if (module0055.NIL != var37) {
                if (module0055.NIL != var38) {
                    var31 = (SubLObject)ConsesLow.cons(var38, var31);
                }
                var32 = var37;
            }
            else if (module0055.NIL != var38) {
                var32 = var38;
            }
            else {
                var32 = var31.first();
                var31 = var31.rest();
            }
        }
        var31 = (SubLObject)module0055.NIL;
        return var30;
    }
    
    public static SubLObject f4073(final SubLObject var25, final SubLObject var13, SubLObject var29) {
        if (var29 == module0055.UNPROVIDED) {
            var29 = Symbols.symbol_function((SubLObject)module0055.IDENTITY);
        }
        assert module0055.NIL != f4044(var13) : var13;
        SubLObject var30 = (SubLObject)module0055.NIL;
        SubLObject var31 = (SubLObject)module0055.NIL;
        SubLObject var32 = f4070(var13);
        while (module0055.NIL == var30 && module0055.NIL != var32) {
            final SubLObject var33 = module0053.f3821(var32);
            final SubLObject var34 = module0053.f3822(var32);
            SubLObject var35;
            SubLObject var36;
            for (var35 = (SubLObject)module0055.NIL, var35 = var34; module0055.NIL == var30 && module0055.NIL != var35; var35 = var35.rest()) {
                var36 = var35.first();
                if (module0055.NIL != Functions.funcall(var25, Functions.funcall(var29, var36))) {
                    var30 = var36;
                }
            }
            final SubLObject var37 = module0053.f3824(var32);
            final SubLObject var38 = module0053.f3825(var32);
            if (module0055.NIL != var37) {
                if (module0055.NIL != var38) {
                    var31 = (SubLObject)ConsesLow.cons(var38, var31);
                }
                var32 = var37;
            }
            else if (module0055.NIL != var38) {
                var32 = var38;
            }
            else {
                var32 = var31.first();
                var31 = var31.rest();
            }
        }
        var31 = (SubLObject)module0055.NIL;
        return var30;
    }
    
    public static SubLObject f4074(final SubLObject var19, final SubLObject var13) {
        return module0035.f2084(var19, var13);
    }
    
    public static SubLObject f4064(final SubLObject var13) {
        return var13.first();
    }
    
    public static SubLObject f4066(final SubLObject var13) {
        return module0035.f2114(var13);
    }
    
    public static SubLObject f4075(final SubLObject var19, final SubLObject var13) {
        return module0035.f2073(var19, var13, (SubLObject)module0055.UNPROVIDED);
    }
    
    public static SubLObject f4076(final SubLObject var13) {
        return Types.sublisp_null(var13);
    }
    
    public static SubLObject f4077(final SubLObject var1, final SubLObject var2) {
        f4078(var1, var2, (SubLObject)module0055.ZERO_INTEGER);
        return (SubLObject)module0055.NIL;
    }
    
    public static SubLObject f4079(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX5484_native.class) ? module0055.T : module0055.NIL);
    }
    
    public static SubLObject f4080(final SubLObject var1) {
        assert module0055.NIL != f4079(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f4081(final SubLObject var1) {
        assert module0055.NIL != f4079(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f4082(final SubLObject var1, final SubLObject var4) {
        assert module0055.NIL != f4079(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f4083(final SubLObject var1, final SubLObject var4) {
        assert module0055.NIL != f4079(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f4084(SubLObject var5) {
        if (var5 == module0055.UNPROVIDED) {
            var5 = (SubLObject)module0055.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX5484_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0055.NIL, var7 = var5; module0055.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0055.$ic100$)) {
                f4082(var6, var9);
            }
            else if (var10.eql((SubLObject)module0055.$ic101$)) {
                f4083(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0055.$ic18$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f4085(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0055.$ic19$, (SubLObject)module0055.$ic102$, (SubLObject)module0055.TWO_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0055.$ic21$, (SubLObject)module0055.$ic100$, f4080(var11));
        Functions.funcall(var12, var11, (SubLObject)module0055.$ic21$, (SubLObject)module0055.$ic101$, f4081(var11));
        Functions.funcall(var12, var11, (SubLObject)module0055.$ic22$, (SubLObject)module0055.$ic102$, (SubLObject)module0055.TWO_INTEGER);
        return var11;
    }
    
    public static SubLObject f4086(final SubLObject var11, final SubLObject var12) {
        return f4085(var11, var12);
    }
    
    public static SubLObject f4078(final SubLObject var105, final SubLObject var2, final SubLObject var14) {
        final SubLThread var106 = SubLProcess.currentSubLThread();
        if (module0055.NIL != print_high.$print_readably$.getDynamicValue(var106)) {
            print_high.print_not_readable(var105, var2);
        }
        else {
            streams_high.write_string((SubLObject)module0055.$ic24$, var2, (SubLObject)module0055.UNPROVIDED, (SubLObject)module0055.UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var105), new SubLObject[] { module0055.$ic25$, var2 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            streams_high.write_string((SubLObject)module0055.$ic26$, var2, (SubLObject)module0055.UNPROVIDED, (SubLObject)module0055.UNPROVIDED);
            print_high.princ(f4087(var105), var2);
            final SubLObject var107 = f4016(f4081(var105));
            if (!var107.isZero()) {
                PrintLow.format(var2, (SubLObject)module0055.$ic104$, var107);
            }
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            PrintLow.write(Equality.pointer(var105), new SubLObject[] { module0055.$ic25$, var2, module0055.$ic27$, module0055.SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var2);
        }
        return var105;
    }
    
    public static SubLObject f4088(final SubLObject var70, SubLObject var71) {
        if (var71 == module0055.UNPROVIDED) {
            var71 = Symbols.symbol_function((SubLObject)module0055.$ic105$);
        }
        final SubLObject var72 = f4084((SubLObject)module0055.UNPROVIDED);
        f4082(var72, f4059((SubLObject)module0055.NIL, var70, var71));
        f4083(var72, f4017());
        return var72;
    }
    
    public static SubLObject f4089(final SubLObject var31, final SubLObject var32) {
        SubLObject var34;
        final SubLObject var33 = var34 = var31.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)module0055.$ic106$);
        final SubLObject var35 = var34.rest();
        var34 = var34.first();
        SubLObject var36 = (SubLObject)module0055.NIL;
        SubLObject var37 = (SubLObject)module0055.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)module0055.$ic106$);
        var36 = var34.first();
        var34 = var34.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)module0055.$ic106$);
        var37 = var34.first();
        var34 = var34.rest();
        SubLObject var38 = (SubLObject)module0055.NIL;
        SubLObject var39 = var34;
        SubLObject var40 = (SubLObject)module0055.NIL;
        SubLObject var116_117 = (SubLObject)module0055.NIL;
        while (module0055.NIL != var39) {
            cdestructuring_bind.destructuring_bind_must_consp(var39, var33, (SubLObject)module0055.$ic106$);
            var116_117 = var39.first();
            var39 = var39.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var39, var33, (SubLObject)module0055.$ic106$);
            if (module0055.NIL == conses_high.member(var116_117, (SubLObject)module0055.$ic29$, (SubLObject)module0055.UNPROVIDED, (SubLObject)module0055.UNPROVIDED)) {
                var40 = (SubLObject)module0055.T;
            }
            if (var116_117 == module0055.$ic30$) {
                var38 = var39.first();
            }
            var39 = var39.rest();
        }
        if (module0055.NIL != var40 && module0055.NIL == var38) {
            cdestructuring_bind.cdestructuring_bind_error(var33, (SubLObject)module0055.$ic106$);
        }
        final SubLObject var41 = cdestructuring_bind.property_list_member((SubLObject)module0055.$ic31$, var34);
        final SubLObject var42 = (SubLObject)((module0055.NIL != var41) ? conses_high.cadr(var41) : module0055.NIL);
        final SubLObject var43;
        var34 = (var43 = var35);
        return (SubLObject)ConsesLow.listS((SubLObject)module0055.$ic32$, (SubLObject)ConsesLow.list(var36, (SubLObject)ConsesLow.list((SubLObject)module0055.$ic107$, var37), (SubLObject)module0055.$ic31$, var42), ConsesLow.append(var43, (SubLObject)module0055.NIL));
    }
    
    public static SubLObject f4087(final SubLObject var105) {
        assert module0055.NIL != f4079(var105) : var105;
        return Numbers.add(f4058(f4080(var105)), f4016(f4081(var105)));
    }
    
    public static SubLObject f4090(final SubLObject var105) {
        return Numbers.zerop(f4087(var105));
    }
    
    public static SubLObject f4091(final SubLObject var105) {
        assert module0055.NIL != f4079(var105) : var105;
        f4092(var105);
        return f4063(f4080(var105));
    }
    
    public static SubLObject f4093(final SubLObject var105) {
        assert module0055.NIL != f4079(var105) : var105;
        f4092(var105);
        return f4071(f4080(var105));
    }
    
    public static SubLObject f4094(final SubLObject var105, final SubLObject var19) {
        assert module0055.NIL != f4079(var105) : var105;
        f4021(var19, f4081(var105));
        return var105;
    }
    
    public static SubLObject f4095(final SubLObject var105) {
        assert module0055.NIL != f4079(var105) : var105;
        f4092(var105);
        return f4068(f4080(var105), (SubLObject)module0055.UNPROVIDED);
    }
    
    public static SubLObject f4092(final SubLObject var105) {
        final SubLObject var106 = f4080(var105);
        final SubLObject var107 = f4081(var105);
        while (module0055.NIL == f4019(var107)) {
            f4067(f4023(var107), var106);
        }
        return var105;
    }
    
    public static SubLObject f4096(final SubLObject var1, final SubLObject var2) {
        compatibility.default_struct_print_function(var1, var2, (SubLObject)module0055.ZERO_INTEGER);
        return (SubLObject)module0055.NIL;
    }
    
    public static SubLObject f4097(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX5486_native.class) ? module0055.T : module0055.NIL);
    }
    
    public static SubLObject f4098(final SubLObject var1) {
        assert module0055.NIL != f4097(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f4099(final SubLObject var1) {
        assert module0055.NIL != f4097(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f4100(final SubLObject var1, final SubLObject var4) {
        assert module0055.NIL != f4097(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f4101(final SubLObject var1, final SubLObject var4) {
        assert module0055.NIL != f4097(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f4102(SubLObject var5) {
        if (var5 == module0055.UNPROVIDED) {
            var5 = (SubLObject)module0055.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX5486_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0055.NIL, var7 = var5; module0055.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0055.$ic121$)) {
                f4100(var6, var9);
            }
            else if (var10.eql((SubLObject)module0055.$ic122$)) {
                f4101(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0055.$ic18$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f4103(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0055.$ic19$, (SubLObject)module0055.$ic123$, (SubLObject)module0055.TWO_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0055.$ic21$, (SubLObject)module0055.$ic121$, f4098(var11));
        Functions.funcall(var12, var11, (SubLObject)module0055.$ic21$, (SubLObject)module0055.$ic122$, f4099(var11));
        Functions.funcall(var12, var11, (SubLObject)module0055.$ic22$, (SubLObject)module0055.$ic123$, (SubLObject)module0055.TWO_INTEGER);
        return var11;
    }
    
    public static SubLObject f4104(final SubLObject var11, final SubLObject var12) {
        return f4103(var11, var12);
    }
    
    public static SubLObject f4105() {
        final SubLObject var124 = f4102((SubLObject)module0055.UNPROVIDED);
        f4101(var124, f4017());
        f4100(var124, Locks.make_lock((SubLObject)module0055.$ic125$));
        return var124;
    }
    
    public static SubLObject f4106(final SubLObject var124) {
        SubLObject var125 = (SubLObject)module0055.NIL;
        if (module0055.NIL != f4097(var124)) {
            final SubLObject var126 = f4098(var124);
            SubLObject var127 = (SubLObject)module0055.NIL;
            try {
                var127 = Locks.seize_lock(var126);
                var125 = f4018(f4099(var124));
            }
            finally {
                if (module0055.NIL != var127) {
                    Locks.release_lock(var126);
                }
            }
        }
        return var125;
    }
    
    public static SubLObject f4107(final SubLObject var124) {
        SubLObject var125 = (SubLObject)module0055.NIL;
        if (module0055.NIL != f4097(var124)) {
            final SubLObject var126 = f4098(var124);
            SubLObject var127 = (SubLObject)module0055.NIL;
            try {
                var127 = Locks.seize_lock(var126);
                var125 = f4019(f4099(var124));
            }
            finally {
                if (module0055.NIL != var127) {
                    Locks.release_lock(var126);
                }
            }
        }
        return var125;
    }
    
    public static SubLObject f4108(final SubLObject var124) {
        SubLObject var125 = (SubLObject)module0055.NIL;
        if (module0055.NIL != f4097(var124)) {
            final SubLObject var126 = f4098(var124);
            SubLObject var127 = (SubLObject)module0055.NIL;
            try {
                var127 = Locks.seize_lock(var126);
                var125 = f4016(f4099(var124));
            }
            finally {
                if (module0055.NIL != var127) {
                    Locks.release_lock(var126);
                }
            }
        }
        return var125;
    }
    
    public static SubLObject f4109(final SubLObject var124) {
        SubLObject var125 = (SubLObject)module0055.NIL;
        if (module0055.NIL != f4097(var124)) {
            final SubLObject var126 = f4098(var124);
            SubLObject var127 = (SubLObject)module0055.NIL;
            try {
                var127 = Locks.seize_lock(var126);
                var125 = f4020(f4099(var124));
            }
            finally {
                if (module0055.NIL != var127) {
                    Locks.release_lock(var126);
                }
            }
        }
        return var125;
    }
    
    public static SubLObject f4110(final SubLObject var19, final SubLObject var124) {
        SubLObject var125 = (SubLObject)module0055.NIL;
        if (module0055.NIL != f4097(var124)) {
            final SubLObject var126 = f4098(var124);
            SubLObject var127 = (SubLObject)module0055.NIL;
            try {
                var127 = Locks.seize_lock(var126);
                var125 = f4021(var19, f4099(var124));
            }
            finally {
                if (module0055.NIL != var127) {
                    Locks.release_lock(var126);
                }
            }
        }
        return var125;
    }
    
    public static SubLObject f4111(final SubLObject var124) {
        SubLObject var125 = (SubLObject)module0055.NIL;
        if (module0055.NIL != f4097(var124)) {
            final SubLObject var126 = f4098(var124);
            SubLObject var127 = (SubLObject)module0055.NIL;
            try {
                var127 = Locks.seize_lock(var126);
                var125 = f4023(f4099(var124));
            }
            finally {
                if (module0055.NIL != var127) {
                    Locks.release_lock(var126);
                }
            }
        }
        return var125;
    }
    
    public static SubLObject f4112(final SubLObject var1, final SubLObject var2) {
        f4113(var1, var2, (SubLObject)module0055.ZERO_INTEGER);
        return (SubLObject)module0055.NIL;
    }
    
    public static SubLObject f4114(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX5488_native.class) ? module0055.T : module0055.NIL);
    }
    
    public static SubLObject f4115(final SubLObject var1) {
        assert module0055.NIL != f4114(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f4116(final SubLObject var1) {
        assert module0055.NIL != f4114(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f4117(final SubLObject var1, final SubLObject var4) {
        assert module0055.NIL != f4114(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f4118(final SubLObject var1, final SubLObject var4) {
        assert module0055.NIL != f4114(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f4119(SubLObject var5) {
        if (var5 == module0055.UNPROVIDED) {
            var5 = (SubLObject)module0055.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX5488_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0055.NIL, var7 = var5; module0055.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0055.$ic121$)) {
                f4117(var6, var9);
            }
            else if (var10.eql((SubLObject)module0055.$ic139$)) {
                f4118(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0055.$ic18$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f4120(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0055.$ic19$, (SubLObject)module0055.$ic140$, (SubLObject)module0055.TWO_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0055.$ic21$, (SubLObject)module0055.$ic121$, f4115(var11));
        Functions.funcall(var12, var11, (SubLObject)module0055.$ic21$, (SubLObject)module0055.$ic139$, f4116(var11));
        Functions.funcall(var12, var11, (SubLObject)module0055.$ic22$, (SubLObject)module0055.$ic140$, (SubLObject)module0055.TWO_INTEGER);
        return var11;
    }
    
    public static SubLObject f4121(final SubLObject var11, final SubLObject var12) {
        return f4120(var11, var12);
    }
    
    public static SubLObject f4113(final SubLObject var140, final SubLObject var2, final SubLObject var14) {
        final SubLThread var141 = SubLProcess.currentSubLThread();
        if (module0055.NIL != print_high.$print_readably$.getDynamicValue(var141)) {
            print_high.print_not_readable(var140, var2);
        }
        else {
            streams_high.write_string((SubLObject)module0055.$ic24$, var2, (SubLObject)module0055.UNPROVIDED, (SubLObject)module0055.UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var140), new SubLObject[] { module0055.$ic25$, var2 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            streams_high.write_string((SubLObject)module0055.$ic26$, var2, (SubLObject)module0055.UNPROVIDED, (SubLObject)module0055.UNPROVIDED);
            print_high.princ(f4122(var140), var2);
            streams_high.write_string((SubLObject)module0055.$ic142$, var2, (SubLObject)module0055.UNPROVIDED, (SubLObject)module0055.UNPROVIDED);
            print_high.princ(f4049(f4116(var140)), var2);
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            PrintLow.write(Equality.pointer(var140), new SubLObject[] { module0055.$ic25$, var2, module0055.$ic27$, module0055.SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var2);
        }
        return var140;
    }
    
    public static SubLObject f4123(final SubLObject var69, final SubLObject var70, SubLObject var71) {
        if (var71 == module0055.UNPROVIDED) {
            var71 = Symbols.symbol_function((SubLObject)module0055.$ic76$);
        }
        final SubLObject var72 = f4119((SubLObject)module0055.UNPROVIDED);
        f4118(var72, f4059(var69, var70, var71));
        f4117(var72, Locks.make_lock((SubLObject)module0055.$ic125$));
        return var72;
    }
    
    public static SubLObject f4122(final SubLObject var140) {
        SubLObject var141 = (SubLObject)module0055.NIL;
        if (module0055.NIL != f4114(var140)) {
            final SubLObject var142 = f4115(var140);
            SubLObject var143 = (SubLObject)module0055.NIL;
            try {
                var143 = Locks.seize_lock(var142);
                var141 = f4058(f4116(var140));
            }
            finally {
                if (module0055.NIL != var143) {
                    Locks.release_lock(var142);
                }
            }
        }
        return var141;
    }
    
    public static SubLObject f4124(final SubLObject var140) {
        SubLObject var141 = (SubLObject)module0055.NIL;
        if (module0055.NIL != f4114(var140)) {
            final SubLObject var142 = f4115(var140);
            SubLObject var143 = (SubLObject)module0055.NIL;
            try {
                var143 = Locks.seize_lock(var142);
                var141 = f4061(f4116(var140));
            }
            finally {
                if (module0055.NIL != var143) {
                    Locks.release_lock(var142);
                }
            }
        }
        return var141;
    }
    
    public static SubLObject f4125(final SubLObject var140) {
        SubLObject var141 = (SubLObject)module0055.NIL;
        if (module0055.NIL != f4114(var140)) {
            final SubLObject var142 = f4115(var140);
            SubLObject var143 = (SubLObject)module0055.NIL;
            try {
                var143 = Locks.seize_lock(var142);
                var141 = f4062(f4116(var140));
            }
            finally {
                if (module0055.NIL != var143) {
                    Locks.release_lock(var142);
                }
            }
        }
        return var141;
    }
    
    public static SubLObject f4126(final SubLObject var140) {
        SubLObject var141 = (SubLObject)module0055.NIL;
        if (module0055.NIL != f4114(var140)) {
            final SubLObject var142 = f4115(var140);
            SubLObject var143 = (SubLObject)module0055.NIL;
            try {
                var143 = Locks.seize_lock(var142);
                var141 = f4063(f4116(var140));
            }
            finally {
                if (module0055.NIL != var143) {
                    Locks.release_lock(var142);
                }
            }
        }
        return var141;
    }
    
    public static SubLObject f4127(final SubLObject var140) {
        SubLObject var141 = (SubLObject)module0055.NIL;
        if (module0055.NIL != f4114(var140)) {
            final SubLObject var142 = f4115(var140);
            SubLObject var143 = (SubLObject)module0055.NIL;
            try {
                var143 = Locks.seize_lock(var142);
                var141 = f4065(f4116(var140));
            }
            finally {
                if (module0055.NIL != var143) {
                    Locks.release_lock(var142);
                }
            }
        }
        return var141;
    }
    
    public static SubLObject f4128(final SubLObject var19, final SubLObject var140) {
        final SubLThread var141 = SubLProcess.currentSubLThread();
        SubLObject var142 = (SubLObject)module0055.NIL;
        if (module0055.NIL != f4114(var140)) {
            final SubLObject var143 = f4115(var140);
            SubLObject var144 = (SubLObject)module0055.NIL;
            try {
                var144 = Locks.seize_lock(var143);
                var141.resetMultipleValues();
                final SubLObject var145 = f4067(var19, f4116(var140));
                final SubLObject var146 = var141.secondMultipleValue();
                final SubLObject var147 = var141.thirdMultipleValue();
                var141.resetMultipleValues();
                var142 = (SubLObject)ConsesLow.list(var140, var146, var147);
            }
            finally {
                if (module0055.NIL != var144) {
                    Locks.release_lock(var143);
                }
            }
        }
        return module0004.values_list(var142);
    }
    
    public static SubLObject f4129(final SubLObject var140, SubLObject var79) {
        if (var79 == module0055.UNPROVIDED) {
            var79 = (SubLObject)module0055.NIL;
        }
        SubLObject var141 = (SubLObject)module0055.NIL;
        if (module0055.NIL != f4114(var140)) {
            final SubLObject var142 = f4115(var140);
            SubLObject var143 = (SubLObject)module0055.NIL;
            try {
                var143 = Locks.seize_lock(var142);
                var141 = f4068(f4116(var140), var79);
            }
            finally {
                if (module0055.NIL != var143) {
                    Locks.release_lock(var142);
                }
            }
        }
        return var141;
    }
    
    public static SubLObject f4130() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4004", "S#5490", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4006", "S#690", 1, 0, false);
        new $f4006$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4007", "S#5491", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4008", "S#5492", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4009", "S#5493", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4010", "S#5494", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4011", "S#5495", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4012", "S#5496", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4013", "S#5497", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4014", "S#5498", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4015", "S#5499", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4005", "S#5500", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4017", "S#4669", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4018", "S#5501", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4019", "S#4672", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4016", "S#5502", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4020", "S#5503", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4021", "S#4670", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4022", "S#5504", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4023", "S#4671", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4024", "S#5505", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4025", "S#5506", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4026", "S#5507", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4027", "S#5508", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4028", "S#5509", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4029", "S#5510", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4030", "S#5511", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4031", "S#5512", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4032", "S#5513", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0055", "f4033", "S#5514");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4034", "S#5515", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0055", "f4035", "S#5516");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4036", "S#5517", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4037", "S#5518", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4038", "S#5519", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4039", "S#5520", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4040", "S#5521", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4041", "S#5522", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4042", "S#5523", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4044", "S#5480", 1, 0, false);
        new $f4044$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4045", "S#5524", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4046", "S#5525", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4047", "S#5526", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4048", "S#5527", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4049", "S#5528", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4050", "S#5529", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4051", "S#5530", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4052", "S#5531", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4053", "S#5532", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4054", "S#5533", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4055", "S#5534", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4056", "S#5535", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4057", "S#5536", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4043", "S#5537", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4059", "S#5538", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4060", "S#5539", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4058", "S#5540", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4061", "S#5541", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4062", "S#5542", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4063", "S#5543", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4065", "S#5544", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4067", "S#5545", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4068", "S#5546", 1, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0055", "f4069", "S#5547");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4070", "S#5548", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4071", "S#5549", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4072", "S#5550", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4073", "S#5551", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4074", "S#5481", 2, 0, false);
        new $f4074$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4064", "S#5552", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4066", "S#5553", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4075", "S#5482", 2, 0, false);
        new $f4075$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4076", "S#5483", 1, 0, false);
        new $f4076$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4077", "S#5554", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4079", "S#5485", 1, 0, false);
        new $f4079$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4080", "S#5555", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4081", "S#5556", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4082", "S#5557", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4083", "S#5558", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4084", "S#5559", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4085", "S#5560", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4086", "S#5561", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4078", "S#5562", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4088", "S#5563", 1, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0055", "f4089", "S#5564");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4087", "S#5565", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4090", "S#5566", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4091", "S#5567", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4093", "S#5568", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4094", "S#5569", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4095", "S#5570", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4092", "S#5571", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4096", "S#5572", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4097", "S#5487", 1, 0, false);
        new $f4097$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4098", "S#5573", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4099", "S#5574", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4100", "S#5575", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4101", "S#5576", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4102", "S#5577", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4103", "S#5578", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4104", "S#5579", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4105", "S#5580", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4106", "S#5581", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4107", "S#5582", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4108", "S#5583", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4109", "S#5584", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4110", "S#5585", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4111", "S#5586", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4112", "S#5587", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4114", "S#5489", 1, 0, false);
        new $f4114$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4115", "S#5588", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4116", "S#5589", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4117", "S#5590", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4118", "S#5591", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4119", "S#5592", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4120", "S#5593", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4121", "S#5594", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4113", "S#5595", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4123", "S#5596", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4122", "S#5597", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4124", "S#5598", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4125", "S#5599", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4126", "S#5600", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4127", "S#5601", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4128", "S#5602", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0055", "f4129", "S#5603", 1, 1, false);
        return (SubLObject)module0055.NIL;
    }
    
    public static SubLObject f4131() {
        module0055.$g1033$ = SubLFiles.defconstant("S#5604", (SubLObject)module0055.$ic0$);
        module0055.$g1034$ = SubLFiles.defconstant("S#5605", (SubLObject)module0055.$ic47$);
        module0055.$g1035$ = SubLFiles.defconstant("S#5606", (SubLObject)module0055.$ic51$);
        module0055.$g1036$ = SubLFiles.defconstant("S#5607", (SubLObject)module0055.$ic87$);
        module0055.$g1037$ = SubLFiles.defconstant("S#5608", (SubLObject)module0055.$ic108$);
        module0055.$g1038$ = SubLFiles.defconstant("S#5609", (SubLObject)module0055.$ic126$);
        return (SubLObject)module0055.NIL;
    }
    
    public static SubLObject f4132() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0055.$g1033$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0055.$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0055.$ic8$);
        Structures.def_csetf((SubLObject)module0055.$ic9$, (SubLObject)module0055.$ic10$);
        Structures.def_csetf((SubLObject)module0055.$ic11$, (SubLObject)module0055.$ic12$);
        Structures.def_csetf((SubLObject)module0055.$ic13$, (SubLObject)module0055.$ic14$);
        Equality.identity((SubLObject)module0055.$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0055.$g1033$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0055.$ic23$));
        module0002.f50((SubLObject)module0055.$ic33$, (SubLObject)module0055.$ic34$);
        module0021.f1193(module0055.$g1034$.getGlobalValue(), (SubLObject)module0055.$ic48$);
        Structures.register_method(module0021.$g749$.getGlobalValue(), module0055.$g1033$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0055.$ic49$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0055.$g1035$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0055.$ic58$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0055.$ic59$);
        Structures.def_csetf((SubLObject)module0055.$ic60$, (SubLObject)module0055.$ic61$);
        Structures.def_csetf((SubLObject)module0055.$ic62$, (SubLObject)module0055.$ic63$);
        Structures.def_csetf((SubLObject)module0055.$ic64$, (SubLObject)module0055.$ic65$);
        Structures.def_csetf((SubLObject)module0055.$ic66$, (SubLObject)module0055.$ic67$);
        Structures.def_csetf((SubLObject)module0055.$ic68$, (SubLObject)module0055.$ic69$);
        Equality.identity((SubLObject)module0055.$ic51$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0055.$g1035$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0055.$ic75$));
        module0002.f50((SubLObject)module0055.$ic84$, (SubLObject)module0055.$ic86$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0055.$g1036$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0055.$ic94$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0055.$ic95$);
        Structures.def_csetf((SubLObject)module0055.$ic96$, (SubLObject)module0055.$ic97$);
        Structures.def_csetf((SubLObject)module0055.$ic98$, (SubLObject)module0055.$ic99$);
        Equality.identity((SubLObject)module0055.$ic87$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0055.$g1036$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0055.$ic103$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0055.$g1037$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0055.$ic115$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0055.$ic116$);
        Structures.def_csetf((SubLObject)module0055.$ic117$, (SubLObject)module0055.$ic118$);
        Structures.def_csetf((SubLObject)module0055.$ic119$, (SubLObject)module0055.$ic120$);
        Equality.identity((SubLObject)module0055.$ic108$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0055.$g1037$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0055.$ic124$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0055.$g1038$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0055.$ic133$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0055.$ic134$);
        Structures.def_csetf((SubLObject)module0055.$ic135$, (SubLObject)module0055.$ic136$);
        Structures.def_csetf((SubLObject)module0055.$ic137$, (SubLObject)module0055.$ic138$);
        Equality.identity((SubLObject)module0055.$ic126$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0055.$g1038$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0055.$ic141$));
        return (SubLObject)module0055.NIL;
    }
    
    public void declareFunctions() {
        f4130();
    }
    
    public void initializeVariables() {
        f4131();
    }
    
    public void runTopLevelForms() {
        f4132();
    }
    
    static {
        me = (SubLFile)new module0055();
        module0055.$g1033$ = null;
        module0055.$g1034$ = null;
        module0055.$g1035$ = null;
        module0055.$g1036$ = null;
        module0055.$g1037$ = null;
        module0055.$g1038$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#5243", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#690", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1993", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5477", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("LAST"));
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NUM"), (SubLObject)SubLObjectFactory.makeKeyword("ELEMENTS"), (SubLObject)SubLObjectFactory.makeKeyword("LAST"));
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5491", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5492", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5493", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5494", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5495", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5496", "CYC"));
        $ic6$ = SubLObjectFactory.makeSymbol("S#5500", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#5490", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#690", "CYC"));
        $ic9$ = SubLObjectFactory.makeSymbol("S#5491", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#5494", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#5492", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#5495", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#5493", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#5496", "CYC");
        $ic15$ = SubLObjectFactory.makeKeyword("NUM");
        $ic16$ = SubLObjectFactory.makeKeyword("ELEMENTS");
        $ic17$ = SubLObjectFactory.makeKeyword("LAST");
        $ic18$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic19$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic20$ = SubLObjectFactory.makeSymbol("S#5497", "CYC");
        $ic21$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic22$ = SubLObjectFactory.makeKeyword("END");
        $ic23$ = SubLObjectFactory.makeSymbol("S#5499", "CYC");
        $ic24$ = SubLObjectFactory.makeString("#<");
        $ic25$ = SubLObjectFactory.makeKeyword("STREAM");
        $ic26$ = SubLObjectFactory.makeString("size=");
        $ic27$ = SubLObjectFactory.makeKeyword("BASE");
        $ic28$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5478", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5243", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic29$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic30$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic31$ = SubLObjectFactory.makeKeyword("DONE");
        $ic32$ = SubLObjectFactory.makeSymbol("DO-LIST");
        $ic33$ = SubLObjectFactory.makeSymbol("S#5515", "CYC");
        $ic34$ = SubLObjectFactory.makeSymbol("S#5514", "CYC");
        $ic35$ = SubLObjectFactory.makeUninternedSymbol("US#28883");
        $ic36$ = SubLObjectFactory.makeUninternedSymbol("US#50BA606");
        $ic37$ = SubLObjectFactory.makeSymbol("CLET");
        $ic38$ = SubLObjectFactory.makeSymbol("COR");
        $ic39$ = SubLObjectFactory.makeSymbol("S#4672", "CYC");
        $ic40$ = SubLObjectFactory.makeSymbol("WHILE");
        $ic41$ = SubLObjectFactory.makeSymbol("CNOT");
        $ic42$ = SubLObjectFactory.makeSymbol("S#4671", "CYC");
        $ic43$ = SubLObjectFactory.makeSymbol("CSETQ");
        $ic44$ = SubLObjectFactory.makeString("~%Queue length : ~a");
        $ic45$ = SubLObjectFactory.makeString("~%Queue contents :");
        $ic46$ = SubLObjectFactory.makeString("~%~s");
        $ic47$ = SubLObjectFactory.makeInteger(131);
        $ic48$ = SubLObjectFactory.makeSymbol("S#5522", "CYC");
        $ic49$ = SubLObjectFactory.makeSymbol("S#5519", "CYC");
        $ic50$ = SubLObjectFactory.makeString("We promised to write ~A elements but wrote ~A.");
        $ic51$ = SubLObjectFactory.makeSymbol("S#5479", "CYC");
        $ic52$ = SubLObjectFactory.makeSymbol("S#5480", "CYC");
        $ic53$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1993", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5610", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5611", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5612", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#720", "CYC"));
        $ic54$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NUM"), (SubLObject)SubLObjectFactory.makeKeyword("MAX-SIZE"), (SubLObject)SubLObjectFactory.makeKeyword("RANK-FUNC"), (SubLObject)SubLObjectFactory.makeKeyword("COMP-FUNC"), (SubLObject)SubLObjectFactory.makeKeyword("TREE"));
        $ic55$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5524", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5525", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5526", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5527", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5528", "CYC"));
        $ic56$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5529", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5530", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5531", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5532", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5533", "CYC"));
        $ic57$ = SubLObjectFactory.makeSymbol("S#5537", "CYC");
        $ic58$ = SubLObjectFactory.makeSymbol("S#5523", "CYC");
        $ic59$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#5480", "CYC"));
        $ic60$ = SubLObjectFactory.makeSymbol("S#5524", "CYC");
        $ic61$ = SubLObjectFactory.makeSymbol("S#5529", "CYC");
        $ic62$ = SubLObjectFactory.makeSymbol("S#5525", "CYC");
        $ic63$ = SubLObjectFactory.makeSymbol("S#5530", "CYC");
        $ic64$ = SubLObjectFactory.makeSymbol("S#5526", "CYC");
        $ic65$ = SubLObjectFactory.makeSymbol("S#5531", "CYC");
        $ic66$ = SubLObjectFactory.makeSymbol("S#5527", "CYC");
        $ic67$ = SubLObjectFactory.makeSymbol("S#5532", "CYC");
        $ic68$ = SubLObjectFactory.makeSymbol("S#5528", "CYC");
        $ic69$ = SubLObjectFactory.makeSymbol("S#5533", "CYC");
        $ic70$ = SubLObjectFactory.makeKeyword("MAX-SIZE");
        $ic71$ = SubLObjectFactory.makeKeyword("RANK-FUNC");
        $ic72$ = SubLObjectFactory.makeKeyword("COMP-FUNC");
        $ic73$ = SubLObjectFactory.makeKeyword("TREE");
        $ic74$ = SubLObjectFactory.makeSymbol("S#5534", "CYC");
        $ic75$ = SubLObjectFactory.makeSymbol("S#5536", "CYC");
        $ic76$ = SubLObjectFactory.makeSymbol("<");
        $ic77$ = SubLObjectFactory.makeSymbol("S#5481", "CYC");
        $ic78$ = SubLObjectFactory.makeSymbol("S#5482", "CYC");
        $ic79$ = SubLObjectFactory.makeSymbol("S#5483", "CYC");
        $ic80$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5478", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5479", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic81$ = SubLObjectFactory.makeUninternedSymbol("US#1463399");
        $ic82$ = SubLObjectFactory.makeUninternedSymbol("US#611A6A9");
        $ic83$ = SubLObjectFactory.makeSymbol("S#5280", "CYC");
        $ic84$ = SubLObjectFactory.makeSymbol("S#5548", "CYC");
        $ic85$ = SubLObjectFactory.makeSymbol("IGNORE");
        $ic86$ = SubLObjectFactory.makeSymbol("S#5547", "CYC");
        $ic87$ = SubLObjectFactory.makeSymbol("S#5484", "CYC");
        $ic88$ = SubLObjectFactory.makeSymbol("S#5485", "CYC");
        $ic89$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5613", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5614", "CYC"));
        $ic90$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ORDERED-ITEMS"), (SubLObject)SubLObjectFactory.makeKeyword("NEW-ITEMS"));
        $ic91$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5555", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5556", "CYC"));
        $ic92$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5557", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5558", "CYC"));
        $ic93$ = SubLObjectFactory.makeSymbol("S#5562", "CYC");
        $ic94$ = SubLObjectFactory.makeSymbol("S#5554", "CYC");
        $ic95$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#5485", "CYC"));
        $ic96$ = SubLObjectFactory.makeSymbol("S#5555", "CYC");
        $ic97$ = SubLObjectFactory.makeSymbol("S#5557", "CYC");
        $ic98$ = SubLObjectFactory.makeSymbol("S#5556", "CYC");
        $ic99$ = SubLObjectFactory.makeSymbol("S#5558", "CYC");
        $ic100$ = SubLObjectFactory.makeKeyword("ORDERED-ITEMS");
        $ic101$ = SubLObjectFactory.makeKeyword("NEW-ITEMS");
        $ic102$ = SubLObjectFactory.makeSymbol("S#5559", "CYC");
        $ic103$ = SubLObjectFactory.makeSymbol("S#5561", "CYC");
        $ic104$ = SubLObjectFactory.makeString(" (~S new)");
        $ic105$ = SubLObjectFactory.makeSymbol(">");
        $ic106$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5478", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5615", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic107$ = SubLObjectFactory.makeSymbol("S#5568", "CYC");
        $ic108$ = SubLObjectFactory.makeSymbol("S#5486", "CYC");
        $ic109$ = SubLObjectFactory.makeSymbol("S#5487", "CYC");
        $ic110$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#672", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5243", "CYC"));
        $ic111$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LOCK"), (SubLObject)SubLObjectFactory.makeKeyword("QUEUE"));
        $ic112$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5573", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5574", "CYC"));
        $ic113$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5575", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5576", "CYC"));
        $ic114$ = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic115$ = SubLObjectFactory.makeSymbol("S#5572", "CYC");
        $ic116$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#5487", "CYC"));
        $ic117$ = SubLObjectFactory.makeSymbol("S#5573", "CYC");
        $ic118$ = SubLObjectFactory.makeSymbol("S#5575", "CYC");
        $ic119$ = SubLObjectFactory.makeSymbol("S#5574", "CYC");
        $ic120$ = SubLObjectFactory.makeSymbol("S#5576", "CYC");
        $ic121$ = SubLObjectFactory.makeKeyword("LOCK");
        $ic122$ = SubLObjectFactory.makeKeyword("QUEUE");
        $ic123$ = SubLObjectFactory.makeSymbol("S#5577", "CYC");
        $ic124$ = SubLObjectFactory.makeSymbol("S#5579", "CYC");
        $ic125$ = SubLObjectFactory.makeString("Queue Lock");
        $ic126$ = SubLObjectFactory.makeSymbol("S#5488", "CYC");
        $ic127$ = SubLObjectFactory.makeSymbol("S#5489", "CYC");
        $ic128$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#672", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5479", "CYC"));
        $ic129$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LOCK"), (SubLObject)SubLObjectFactory.makeKeyword("PRIORITY-QUEUE"));
        $ic130$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5588", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5589", "CYC"));
        $ic131$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5590", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5591", "CYC"));
        $ic132$ = SubLObjectFactory.makeSymbol("S#5595", "CYC");
        $ic133$ = SubLObjectFactory.makeSymbol("S#5587", "CYC");
        $ic134$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#5489", "CYC"));
        $ic135$ = SubLObjectFactory.makeSymbol("S#5588", "CYC");
        $ic136$ = SubLObjectFactory.makeSymbol("S#5590", "CYC");
        $ic137$ = SubLObjectFactory.makeSymbol("S#5589", "CYC");
        $ic138$ = SubLObjectFactory.makeSymbol("S#5591", "CYC");
        $ic139$ = SubLObjectFactory.makeKeyword("PRIORITY-QUEUE");
        $ic140$ = SubLObjectFactory.makeSymbol("S#5592", "CYC");
        $ic141$ = SubLObjectFactory.makeSymbol("S#5594", "CYC");
        $ic142$ = SubLObjectFactory.makeString(" tree=");
    }
    
    public static final class $sX5243_native extends SubLStructNative
    {
        public SubLObject $num;
        public SubLObject $elements;
        public SubLObject $last;
        private static final SubLStructDeclNative structDecl;
        
        public $sX5243_native() {
            this.$num = (SubLObject)CommonSymbols.NIL;
            this.$elements = (SubLObject)CommonSymbols.NIL;
            this.$last = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX5243_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$num;
        }
        
        public SubLObject getField3() {
            return this.$elements;
        }
        
        public SubLObject getField4() {
            return this.$last;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$num = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$elements = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$last = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX5243_native.class, module0055.$ic0$, module0055.$ic1$, module0055.$ic2$, module0055.$ic3$, new String[] { "$num", "$elements", "$last" }, module0055.$ic4$, module0055.$ic5$, module0055.$ic6$);
        }
    }
    
    public static final class $f4006$UnaryFunction extends UnaryFunction
    {
        public $f4006$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#690"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0055.f4006(var3);
        }
    }
    
    public static final class $sX5479_native extends SubLStructNative
    {
        public SubLObject $num;
        public SubLObject $max_size;
        public SubLObject $rank_func;
        public SubLObject $comp_func;
        public SubLObject $tree;
        private static final SubLStructDeclNative structDecl;
        
        public $sX5479_native() {
            this.$num = (SubLObject)CommonSymbols.NIL;
            this.$max_size = (SubLObject)CommonSymbols.NIL;
            this.$rank_func = (SubLObject)CommonSymbols.NIL;
            this.$comp_func = (SubLObject)CommonSymbols.NIL;
            this.$tree = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX5479_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$num;
        }
        
        public SubLObject getField3() {
            return this.$max_size;
        }
        
        public SubLObject getField4() {
            return this.$rank_func;
        }
        
        public SubLObject getField5() {
            return this.$comp_func;
        }
        
        public SubLObject getField6() {
            return this.$tree;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$num = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$max_size = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$rank_func = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$comp_func = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$tree = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX5479_native.class, module0055.$ic51$, module0055.$ic52$, module0055.$ic53$, module0055.$ic54$, new String[] { "$num", "$max_size", "$rank_func", "$comp_func", "$tree" }, module0055.$ic55$, module0055.$ic56$, module0055.$ic57$);
        }
    }
    
    public static final class $f4044$UnaryFunction extends UnaryFunction
    {
        public $f4044$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#5480"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0055.f4044(var3);
        }
    }
    
    public static final class $f4074$BinaryFunction extends BinaryFunction
    {
        public $f4074$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#5481"));
        }
        
        public SubLObject processItem(final SubLObject var3, final SubLObject var101) {
            return module0055.f4074(var3, var101);
        }
    }
    
    public static final class $f4075$BinaryFunction extends BinaryFunction
    {
        public $f4075$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#5482"));
        }
        
        public SubLObject processItem(final SubLObject var3, final SubLObject var101) {
            return module0055.f4075(var3, var101);
        }
    }
    
    public static final class $f4076$UnaryFunction extends UnaryFunction
    {
        public $f4076$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#5483"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0055.f4076(var3);
        }
    }
    
    public static final class $sX5484_native extends SubLStructNative
    {
        public SubLObject $ordered_items;
        public SubLObject $new_items;
        private static final SubLStructDeclNative structDecl;
        
        public $sX5484_native() {
            this.$ordered_items = (SubLObject)CommonSymbols.NIL;
            this.$new_items = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX5484_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$ordered_items;
        }
        
        public SubLObject getField3() {
            return this.$new_items;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$ordered_items = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$new_items = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX5484_native.class, module0055.$ic87$, module0055.$ic88$, module0055.$ic89$, module0055.$ic90$, new String[] { "$ordered_items", "$new_items" }, module0055.$ic91$, module0055.$ic92$, module0055.$ic93$);
        }
    }
    
    public static final class $f4079$UnaryFunction extends UnaryFunction
    {
        public $f4079$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#5485"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0055.f4079(var3);
        }
    }
    
    public static final class $sX5486_native extends SubLStructNative
    {
        public SubLObject $lock;
        public SubLObject $queue;
        private static final SubLStructDeclNative structDecl;
        
        public $sX5486_native() {
            this.$lock = (SubLObject)CommonSymbols.NIL;
            this.$queue = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX5486_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$lock;
        }
        
        public SubLObject getField3() {
            return this.$queue;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$lock = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$queue = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX5486_native.class, module0055.$ic108$, module0055.$ic109$, module0055.$ic110$, module0055.$ic111$, new String[] { "$lock", "$queue" }, module0055.$ic112$, module0055.$ic113$, module0055.$ic114$);
        }
    }
    
    public static final class $f4097$UnaryFunction extends UnaryFunction
    {
        public $f4097$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#5487"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0055.f4097(var3);
        }
    }
    
    public static final class $sX5488_native extends SubLStructNative
    {
        public SubLObject $lock;
        public SubLObject $priority_queue;
        private static final SubLStructDeclNative structDecl;
        
        public $sX5488_native() {
            this.$lock = (SubLObject)CommonSymbols.NIL;
            this.$priority_queue = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX5488_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$lock;
        }
        
        public SubLObject getField3() {
            return this.$priority_queue;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$lock = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$priority_queue = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX5488_native.class, module0055.$ic126$, module0055.$ic127$, module0055.$ic128$, module0055.$ic129$, new String[] { "$lock", "$priority_queue" }, module0055.$ic130$, module0055.$ic131$, module0055.$ic132$);
        }
    }
    
    public static final class $f4114$UnaryFunction extends UnaryFunction
    {
        public $f4114$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#5489"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0055.f4114(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0055.class
	Total time: 443 ms
	
	Decompiled with Procyon 0.5.32.
*/