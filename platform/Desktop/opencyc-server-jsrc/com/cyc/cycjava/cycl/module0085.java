package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0085 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0085";
    public static final String myFingerPrint = "741db54ecce7980cd05c8af2523a6ad233e7335b26e1f28df4ab8f89785bfad4";
    public static SubLSymbol $g1173$;
    public static SubLSymbol $g1174$;
    private static final SubLString $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
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
    private static final SubLString $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLString $ic22$;
    private static final SubLInteger $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLList $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLList $ic32$;
    private static final SubLList $ic33$;
    private static final SubLList $ic34$;
    private static final SubLList $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLList $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLString $ic51$;
    private static final SubLInteger $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLString $ic55$;
    private static final SubLList $ic56$;
    private static final SubLList $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLList $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLList $ic66$;
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
    private static final SubLList $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLList $ic83$;
    
    public static SubLObject f5843(final SubLObject var1, final SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)ZERO_INTEGER;
        }
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        if (!var1.isVector()) {
            return streams_high.read_sequence(var1, var2, var3, var4);
        }
        return f5844(var1, var2, var3, var4);
    }
    
    public static SubLObject f5845(final SubLObject var5, final SubLObject var1, SubLObject var6, SubLObject var7, SubLObject var8, SubLObject var9) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)ZERO_INTEGER;
        }
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)NIL;
        }
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)ZERO_INTEGER;
        }
        if (var9 == UNPROVIDED) {
            var9 = (SubLObject)NIL;
        }
        if (!var5.isString() || !var1.isVector()) {
            return Sequences.replace(var5, var1, var6, var7, var8, var9);
        }
        return Sequences.replace(var5, var1, var6, var7, var8, var9);
    }
    
    public static SubLObject f5844(final SubLObject var1, final SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)ZERO_INTEGER;
        }
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        if (NIL == var4) {
            var4 = Sequences.length(var1);
        }
        SubLObject var5 = var3;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        while (NIL == var7 && var5.numL(var4)) {
            var6 = streams_high.read_char(var2, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED);
            if (NIL == var6) {
                var7 = (SubLObject)T;
            }
            else {
                Vectors.set_aref(var1, var5, var6);
                var5 = Numbers.add(var5, (SubLObject)ONE_INTEGER);
            }
        }
        return var5;
    }
    
    public static SubLObject f5846(final SubLObject var5, final SubLObject var1, SubLObject var6, SubLObject var7, SubLObject var8, SubLObject var9) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)ZERO_INTEGER;
        }
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)NIL;
        }
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)ZERO_INTEGER;
        }
        if (var9 == UNPROVIDED) {
            var9 = (SubLObject)NIL;
        }
        final SubLThread var10 = SubLProcess.currentSubLThread();
        if (NIL == var7) {
            var7 = Sequences.length(var5);
        }
        if (NIL == var9) {
            var9 = Sequences.length(var1);
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var10) && !var6.numLE(var7)) {
            Errors.error((SubLObject)$ic0$, var6, var7);
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var10) && !var8.numLE(var9)) {
            Errors.error((SubLObject)$ic0$, var8, var9);
        }
        SubLObject var11 = var6;
        SubLObject var12 = var8;
        SubLObject var13 = (SubLObject)NIL;
        while (var11.numL(var7) && var12.numL(var9)) {
            var13 = Vectors.aref(var1, var12);
            Strings.set_char(var5, var11, var13);
            var11 = Numbers.add(var11, (SubLObject)ONE_INTEGER);
            var12 = Numbers.add(var12, (SubLObject)ONE_INTEGER);
        }
        return var5;
    }
    
    public static SubLObject f5847(final SubLObject var16, final SubLObject var2) {
        f5848(var16, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5849(final SubLObject var16) {
        return (SubLObject)((var16.getClass() == $sX7476_native.class) ? T : NIL);
    }
    
    public static SubLObject f5850(final SubLObject var16) {
        assert NIL != f5849(var16) : var16;
        return var16.getField2();
    }
    
    public static SubLObject f5851(final SubLObject var16) {
        assert NIL != f5849(var16) : var16;
        return var16.getField3();
    }
    
    public static SubLObject f5852(final SubLObject var16, final SubLObject var18) {
        assert NIL != f5849(var16) : var16;
        return var16.setField2(var18);
    }
    
    public static SubLObject f5853(final SubLObject var16, final SubLObject var18) {
        assert NIL != f5849(var16) : var16;
        return var16.setField3(var18);
    }
    
    public static SubLObject f5854(SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLObject var20 = (SubLObject)new $sX7476_native();
        SubLObject var21;
        SubLObject var22;
        SubLObject var23;
        SubLObject var24;
        for (var21 = (SubLObject)NIL, var21 = var19; NIL != var21; var21 = conses_high.cddr(var21)) {
            var22 = var21.first();
            var23 = conses_high.cadr(var21);
            var24 = var22;
            if (var24.eql((SubLObject)$ic14$)) {
                f5852(var20, var23);
            }
            else if (var24.eql((SubLObject)$ic15$)) {
                f5853(var20, var23);
            }
            else {
                Errors.error((SubLObject)$ic16$, var22);
            }
        }
        return var20;
    }
    
    public static SubLObject f5855(final SubLObject var25, final SubLObject var26) {
        Functions.funcall(var26, var25, (SubLObject)$ic17$, (SubLObject)$ic18$, (SubLObject)TWO_INTEGER);
        Functions.funcall(var26, var25, (SubLObject)$ic19$, (SubLObject)$ic14$, f5850(var25));
        Functions.funcall(var26, var25, (SubLObject)$ic19$, (SubLObject)$ic15$, f5851(var25));
        Functions.funcall(var26, var25, (SubLObject)$ic20$, (SubLObject)$ic18$, (SubLObject)TWO_INTEGER);
        return var25;
    }
    
    public static SubLObject f5856(final SubLObject var25, final SubLObject var26) {
        return f5855(var25, var26);
    }
    
    public static SubLObject f5848(final SubLObject var27, final SubLObject var2, final SubLObject var28) {
        PrintLow.format(var2, (SubLObject)$ic22$, f5857(var27), f5858(var27));
        return var27;
    }
    
    public static SubLObject f5859(SubLObject var29) {
        if (var29 == UNPROVIDED) {
            var29 = (SubLObject)$ic23$;
        }
        assert NIL != module0004.f106(var29) : var29;
        final SubLObject var30 = f5854((SubLObject)UNPROVIDED);
        f5852(var30, Strings.make_string(var29, (SubLObject)UNPROVIDED));
        f5860(var30);
        return var30;
    }
    
    public static SubLObject f5861(final SubLObject var30) {
        assert NIL != f5849(var30) : var30;
        f5852(var30, (SubLObject)NIL);
        f5853(var30, (SubLObject)$ic25$);
        return var30;
    }
    
    public static SubLObject f5862(final SubLObject var30) {
        return f5850(var30);
    }
    
    public static SubLObject f5858(final SubLObject var30) {
        return f5851(var30);
    }
    
    public static SubLObject f5863(final SubLObject var31, final SubLObject var32) {
        SubLObject var34;
        final SubLObject var33 = var34 = var31.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)$ic26$);
        final SubLObject var35 = var34.rest();
        var34 = var34.first();
        SubLObject var36 = (SubLObject)NIL;
        SubLObject var37 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)$ic26$);
        var36 = var34.first();
        var34 = var34.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)$ic26$);
        var37 = var34.first();
        var34 = var34.rest();
        if (NIL == var34) {
            var34 = var35;
            SubLObject var38 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)$ic26$);
            var38 = var34.first();
            final SubLObject var39;
            var34 = (var39 = var34.rest());
            return (SubLObject)ConsesLow.listS((SubLObject)$ic27$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var36, (SubLObject)ConsesLow.list((SubLObject)$ic28$, var38)), (SubLObject)ConsesLow.list(var37, (SubLObject)ConsesLow.list((SubLObject)$ic29$, var38))), ConsesLow.append(var39, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var33, (SubLObject)$ic26$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5857(final SubLObject var30) {
        return Sequences.length(f5850(var30));
    }
    
    public static SubLObject f5864(final SubLObject var30, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = StreamsLow.$standard_output$.getDynamicValue();
        }
        streams_high.write_string(f5850(var30), var2, (SubLObject)ZERO_INTEGER, f5851(var30));
        return var30;
    }
    
    public static SubLObject f5865(final SubLObject var30, SubLObject var39, SubLObject var40, SubLObject var3) {
        if (var39 == UNPROVIDED) {
            var39 = (SubLObject)NIL;
        }
        if (var40 == UNPROVIDED) {
            var40 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)ZERO_INTEGER;
        }
        final SubLObject var41 = f5862(var30);
        final SubLObject var42 = f5858(var30);
        return reader.read_from_string_ignoring_errors(var41, var39, var40, var3, var42);
    }
    
    public static SubLObject f5860(final SubLObject var30) {
        assert NIL != f5849(var30) : var30;
        f5853(var30, (SubLObject)ZERO_INTEGER);
        return var30;
    }
    
    public static SubLObject f5866(final SubLObject var30, final SubLObject var11) {
        SubLObject var31 = f5850(var30);
        SubLObject var32 = Sequences.length(var31);
        final SubLObject var33 = f5851(var30);
        if (var32.numE(var33)) {
            final SubLObject var34 = Numbers.max((SubLObject)$ic23$, Numbers.add(var32, var32));
            final SubLObject var35 = Strings.make_string(var34, (SubLObject)UNPROVIDED);
            Sequences.replace(var35, var31, (SubLObject)ZERO_INTEGER, var33, (SubLObject)ZERO_INTEGER, var33);
            f5852(var30, var35);
            var31 = var35;
            var32 = var34;
        }
        Strings.set_char(var31, var33, var11);
        f5853(var30, Numbers.add(f5851(var30), (SubLObject)ONE_INTEGER));
        return var30;
    }
    
    public static SubLObject f5867(final SubLObject var30, final SubLObject var45, SubLObject var3, SubLObject var4) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)ZERO_INTEGER;
        }
        if (var4 == UNPROVIDED) {
            var4 = Sequences.length(var45);
        }
        SubLObject var46 = f5850(var30);
        SubLObject var47 = Sequences.length(var46);
        final SubLObject var48 = f5851(var30);
        final SubLObject var49 = Numbers.subtract(var4, var3);
        final SubLObject var51;
        final SubLObject var50 = var51 = Numbers.add(var48, var49);
        if (!var51.numLE(var47)) {
            SubLObject var52;
            for (var52 = Numbers.max((SubLObject)$ic23$, var47); !var51.numLE(var52); var52 = Numbers.add(var52, var52)) {}
            final SubLObject var53 = Strings.make_string(var52, (SubLObject)UNPROVIDED);
            Sequences.replace(var53, var46, (SubLObject)ZERO_INTEGER, var48, (SubLObject)ZERO_INTEGER, var48);
            f5852(var30, var53);
            var46 = var53;
            var47 = var52;
        }
        f5845(var46, var45, var48, var50, var3, var4);
        f5853(var30, var50);
        return var30;
    }
    
    public static SubLObject f5868(final SubLObject var16, final SubLObject var2) {
        f5869(var16, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5870(final SubLObject var16) {
        return (SubLObject)((var16.getClass() == $sX7478_native.class) ? T : NIL);
    }
    
    public static SubLObject f5871(final SubLObject var16) {
        assert NIL != f5870(var16) : var16;
        return var16.getField2();
    }
    
    public static SubLObject f5872(final SubLObject var16) {
        assert NIL != f5870(var16) : var16;
        return var16.getField3();
    }
    
    public static SubLObject f5873(final SubLObject var16) {
        assert NIL != f5870(var16) : var16;
        return var16.getField4();
    }
    
    public static SubLObject f5874(final SubLObject var16) {
        assert NIL != f5870(var16) : var16;
        return var16.getField5();
    }
    
    public static SubLObject f5875(final SubLObject var16, final SubLObject var18) {
        assert NIL != f5870(var16) : var16;
        return var16.setField2(var18);
    }
    
    public static SubLObject f5876(final SubLObject var16, final SubLObject var18) {
        assert NIL != f5870(var16) : var16;
        return var16.setField3(var18);
    }
    
    public static SubLObject f5877(final SubLObject var16, final SubLObject var18) {
        assert NIL != f5870(var16) : var16;
        return var16.setField4(var18);
    }
    
    public static SubLObject f5878(final SubLObject var16, final SubLObject var18) {
        assert NIL != f5870(var16) : var16;
        return var16.setField5(var18);
    }
    
    public static SubLObject f5879(SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLObject var20 = (SubLObject)new $sX7478_native();
        SubLObject var21;
        SubLObject var22;
        SubLObject var23;
        SubLObject var24;
        for (var21 = (SubLObject)NIL, var21 = var19; NIL != var21; var21 = conses_high.cddr(var21)) {
            var22 = var21.first();
            var23 = conses_high.cadr(var21);
            var24 = var22;
            if (var24.eql((SubLObject)$ic47$)) {
                f5875(var20, var23);
            }
            else if (var24.eql((SubLObject)$ic48$)) {
                f5876(var20, var23);
            }
            else if (var24.eql((SubLObject)$ic20$)) {
                f5877(var20, var23);
            }
            else if (var24.eql((SubLObject)$ic15$)) {
                f5878(var20, var23);
            }
            else {
                Errors.error((SubLObject)$ic16$, var22);
            }
        }
        return var20;
    }
    
    public static SubLObject f5880(final SubLObject var25, final SubLObject var26) {
        Functions.funcall(var26, var25, (SubLObject)$ic17$, (SubLObject)$ic49$, (SubLObject)FOUR_INTEGER);
        Functions.funcall(var26, var25, (SubLObject)$ic19$, (SubLObject)$ic47$, f5871(var25));
        Functions.funcall(var26, var25, (SubLObject)$ic19$, (SubLObject)$ic48$, f5872(var25));
        Functions.funcall(var26, var25, (SubLObject)$ic19$, (SubLObject)$ic20$, f5873(var25));
        Functions.funcall(var26, var25, (SubLObject)$ic19$, (SubLObject)$ic15$, f5874(var25));
        Functions.funcall(var26, var25, (SubLObject)$ic20$, (SubLObject)$ic49$, (SubLObject)FOUR_INTEGER);
        return var25;
    }
    
    public static SubLObject f5881(final SubLObject var25, final SubLObject var26) {
        return f5880(var25, var26);
    }
    
    public static SubLObject f5869(final SubLObject var27, final SubLObject var2, final SubLObject var28) {
        final SubLObject var29 = f5882(var27);
        final SubLObject var30 = f5883(var27);
        PrintLow.format(var2, (SubLObject)$ic51$, var29, var30);
        return var27;
    }
    
    public static SubLObject f5884(final SubLObject var2, SubLObject var54) {
        if (var54 == UNPROVIDED) {
            var54 = (SubLObject)$ic52$;
        }
        assert NIL != Types.streamp(var2) : var2;
        assert NIL != module0004.f105(var54) : var54;
        final SubLObject var55 = f5879((SubLObject)UNPROVIDED);
        f5875(var55, var2);
        f5876(var55, Vectors.make_vector(var54, (SubLObject)NIL));
        f5885(var55);
        return var55;
    }
    
    public static SubLObject f5886(final SubLObject var55) {
        assert NIL != f5870(var55) : var55;
        f5875(var55, (SubLObject)$ic25$);
        f5876(var55, (SubLObject)NIL);
        return var55;
    }
    
    public static SubLObject f5883(final SubLObject var55) {
        return f5871(var55);
    }
    
    public static SubLObject f5882(final SubLObject var55) {
        return Sequences.length(f5872(var55));
    }
    
    public static SubLObject f5885(final SubLObject var55) {
        assert NIL != f5870(var55) : var55;
        final SubLObject var56 = f5882(var55);
        f5877(var55, var56);
        f5878(var55, var56);
        return var55;
    }
    
    public static SubLObject f5887(final SubLObject var55) {
        final SubLObject var56 = f5871(var55);
        final SubLObject var57 = f5872(var55);
        final SubLObject var58 = Sequences.length(var57);
        final SubLObject var59 = f5843(var57, var56, (SubLObject)ZERO_INTEGER, var58);
        f5878(var55, (SubLObject)ZERO_INTEGER);
        f5877(var55, var59);
        return var59;
    }
    
    public static SubLObject f5888(final SubLObject var2, SubLObject var30, SubLObject var39, SubLObject var40) {
        if (var30 == UNPROVIDED) {
            var30 = (SubLObject)NIL;
        }
        if (var39 == UNPROVIDED) {
            var39 = (SubLObject)NIL;
        }
        if (var40 == UNPROVIDED) {
            var40 = (SubLObject)NIL;
        }
        if (NIL == var30) {
            var30 = f5859((SubLObject)UNPROVIDED);
        }
        f5860(var30);
        SubLObject var41;
        for (var41 = (SubLObject)NIL, var41 = f5889(var2, var30); NIL != var41 && !var41.eql((SubLObject)Characters.CHAR_newline); var41 = f5889(var2, var30)) {}
        final SubLObject var42 = f5858(var30);
        if (NIL != var41) {
            return var30;
        }
        if (var42.isPositive()) {
            return var30;
        }
        if (NIL == var39) {
            return var40;
        }
        return Errors.error((SubLObject)$ic55$, var2);
    }
    
    public static SubLObject f5890(final SubLObject var55, SubLObject var30, SubLObject var39, SubLObject var40) {
        if (var30 == UNPROVIDED) {
            var30 = (SubLObject)NIL;
        }
        if (var39 == UNPROVIDED) {
            var39 = (SubLObject)NIL;
        }
        if (var40 == UNPROVIDED) {
            var40 = (SubLObject)NIL;
        }
        if (NIL == var30) {
            var30 = f5859((SubLObject)UNPROVIDED);
        }
        f5860(var30);
        SubLObject var56;
        for (var56 = (SubLObject)NIL, var56 = f5891(var55, var30); NIL != var56 && !var56.eql((SubLObject)Characters.CHAR_newline); var56 = f5891(var55, var30)) {}
        final SubLObject var57 = f5858(var30);
        if (NIL != var56) {
            return var30;
        }
        if (var57.isPositive()) {
            return var30;
        }
        if (NIL == var39) {
            return var40;
        }
        return Errors.error((SubLObject)$ic55$, f5883(var55));
    }
    
    public static SubLObject f5889(final SubLObject var2, final SubLObject var30) {
        final SubLObject var31 = streams_high.read_char(var2, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED);
        if (NIL != var31 && !var31.eql((SubLObject)Characters.CHAR_newline)) {
            f5866(var30, var31);
        }
        return var31;
    }
    
    public static SubLObject f5891(final SubLObject var55, final SubLObject var30) {
        final SubLObject var56 = f5872(var55);
        final SubLObject var57 = f5874(var55);
        final SubLObject var58 = f5873(var55);
        if (var57.numE(var58)) {
            final SubLObject var59 = Sequences.length(var56);
            if (var58.numL(var59)) {
                return (SubLObject)NIL;
            }
            f5887(var55);
            return f5891(var55, var30);
        }
        else {
            final SubLObject var60 = Sequences.position((SubLObject)Characters.CHAR_newline, var56, Symbols.symbol_function((SubLObject)EQ), Symbols.symbol_function((SubLObject)IDENTITY), var57, var58);
            if (NIL == var60) {
                f5867(var30, var56, var57, var58);
                f5878(var55, var58);
                return Vectors.aref(var56, Numbers.subtract(var58, (SubLObject)ONE_INTEGER));
            }
            f5867(var30, var56, var57, var60);
            f5878(var55, Numbers.add((SubLObject)ONE_INTEGER, var60));
            return (SubLObject)Characters.CHAR_newline;
        }
    }
    
    public static SubLObject f5892(final SubLObject var31, final SubLObject var32) {
        SubLObject var34;
        final SubLObject var33 = var34 = var31.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)$ic56$);
        final SubLObject var35 = var34.rest();
        var34 = var34.first();
        SubLObject var36 = (SubLObject)NIL;
        SubLObject var37 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)$ic56$);
        var36 = var34.first();
        var34 = var34.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)$ic56$);
        var37 = var34.first();
        var34 = var34.rest();
        SubLObject var38 = (SubLObject)NIL;
        SubLObject var39 = var34;
        SubLObject var40 = (SubLObject)NIL;
        SubLObject var69_70 = (SubLObject)NIL;
        while (NIL != var39) {
            cdestructuring_bind.destructuring_bind_must_consp(var39, var33, (SubLObject)$ic56$);
            var69_70 = var39.first();
            var39 = var39.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var39, var33, (SubLObject)$ic56$);
            if (NIL == conses_high.member(var69_70, (SubLObject)$ic57$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var40 = (SubLObject)T;
            }
            if (var69_70 == $ic58$) {
                var38 = var39.first();
            }
            var39 = var39.rest();
        }
        if (NIL != var40 && NIL == var38) {
            cdestructuring_bind.cdestructuring_bind_error(var33, (SubLObject)$ic56$);
        }
        final SubLObject var41 = cdestructuring_bind.property_list_member((SubLObject)$ic59$, var34);
        final SubLObject var42 = (SubLObject)((NIL != var41) ? conses_high.cadr(var41) : NIL);
        final SubLObject var43 = cdestructuring_bind.property_list_member((SubLObject)$ic60$, var34);
        final SubLObject var44 = (SubLObject)((NIL != var43) ? conses_high.cadr(var43) : NIL);
        final SubLObject var45;
        var34 = (var45 = var35);
        final SubLObject var46 = (SubLObject)$ic61$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic62$, (SubLObject)ConsesLow.listS(var46, var37, (SubLObject)$ic63$), (SubLObject)ConsesLow.list((SubLObject)$ic64$, (SubLObject)ConsesLow.list((SubLObject)$ic53$, var46), (SubLObject)ConsesLow.listS((SubLObject)$ic65$, (SubLObject)ConsesLow.list(var36, var46, (SubLObject)$ic59$, var42, (SubLObject)$ic60$, var44), ConsesLow.append(var45, (SubLObject)NIL))));
    }
    
    public static SubLObject f5893(final SubLObject var31, final SubLObject var32) {
        SubLObject var34;
        final SubLObject var33 = var34 = var31.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)$ic66$);
        final SubLObject var35 = var34.rest();
        var34 = var34.first();
        SubLObject var36 = (SubLObject)NIL;
        SubLObject var37 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)$ic66$);
        var36 = var34.first();
        var34 = var34.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)$ic66$);
        var37 = var34.first();
        var34 = var34.rest();
        SubLObject var38 = (SubLObject)NIL;
        SubLObject var39 = var34;
        SubLObject var40 = (SubLObject)NIL;
        SubLObject var81_82 = (SubLObject)NIL;
        while (NIL != var39) {
            cdestructuring_bind.destructuring_bind_must_consp(var39, var33, (SubLObject)$ic66$);
            var81_82 = var39.first();
            var39 = var39.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var39, var33, (SubLObject)$ic66$);
            if (NIL == conses_high.member(var81_82, (SubLObject)$ic57$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var40 = (SubLObject)T;
            }
            if (var81_82 == $ic58$) {
                var38 = var39.first();
            }
            var39 = var39.rest();
        }
        if (NIL != var40 && NIL == var38) {
            cdestructuring_bind.cdestructuring_bind_error(var33, (SubLObject)$ic66$);
        }
        final SubLObject var41 = cdestructuring_bind.property_list_member((SubLObject)$ic59$, var34);
        final SubLObject var42 = (SubLObject)((NIL != var41) ? conses_high.cadr(var41) : NIL);
        final SubLObject var43 = cdestructuring_bind.property_list_member((SubLObject)$ic60$, var34);
        final SubLObject var44 = (SubLObject)((NIL != var43) ? conses_high.cadr(var43) : NIL);
        final SubLObject var45;
        var34 = (var45 = var35);
        final SubLObject var46 = (SubLObject)$ic67$;
        final SubLObject var47 = (SubLObject)$ic68$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic27$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var46, var44)), (SubLObject)ConsesLow.list((SubLObject)$ic69$, (SubLObject)ConsesLow.list(var47, var36), (SubLObject)ConsesLow.listS((SubLObject)$ic70$, var37, ConsesLow.append((SubLObject)((NIL != var42) ? ConsesLow.list(var42) : NIL), (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic71$, (SubLObject)ConsesLow.list((SubLObject)$ic72$, (SubLObject)ConsesLow.list((SubLObject)$ic73$, var46), (SubLObject)ConsesLow.list((SubLObject)$ic74$, (SubLObject)ConsesLow.list((SubLObject)$ic75$, var47, var36), reader.bq_cons((SubLObject)$ic76$, ConsesLow.append(var45, (SubLObject)((NIL != var44) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic77$, var46, var44)) : NIL), (SubLObject)NIL)), (SubLObject)ConsesLow.listS((SubLObject)$ic77$, var46, (SubLObject)$ic78$)))), (SubLObject)ConsesLow.list((SubLObject)$ic79$, var36, var47)));
    }
    
    public static SubLObject f5894(final SubLObject var2, SubLObject var54) {
        if (var54 == UNPROVIDED) {
            var54 = (SubLObject)NIL;
        }
        final SubLObject var55 = (NIL != var54) ? f5884(var2, var54) : var2;
        final SubLObject var56 = f5859((SubLObject)UNPROVIDED);
        return Values.values(var55, var56);
    }
    
    public static SubLObject f5895(final SubLObject var55, final SubLObject var87) {
        if (var55.isStream()) {
            return f5888(var55, var87, (SubLObject)NIL, (SubLObject)NIL);
        }
        return f5890(var55, var87, (SubLObject)NIL, (SubLObject)NIL);
    }
    
    public static SubLObject f5896(final SubLObject var87, final SubLObject var55) {
        if (NIL != var87) {
            f5861(var87);
        }
        if (!var55.isStream()) {
            f5886(var55);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5897(final SubLObject var2, SubLObject var54) {
        if (var54 == UNPROVIDED) {
            var54 = (SubLObject)NIL;
        }
        return module0052.f3689(f5898(var2, var54), (SubLObject)$ic80$, (SubLObject)$ic81$, (SubLObject)$ic82$);
    }
    
    public static SubLObject f5898(final SubLObject var2, final SubLObject var54) {
        final SubLThread var55 = SubLProcess.currentSubLThread();
        var55.resetMultipleValues();
        final SubLObject var56 = f5894(var2, var54);
        final SubLObject var57 = var55.secondMultipleValue();
        var55.resetMultipleValues();
        return (SubLObject)ConsesLow.list(var56, var57);
    }
    
    public static SubLObject f5899(final SubLObject var88) {
        SubLObject var89 = (SubLObject)NIL;
        SubLObject var90 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var88, var88, (SubLObject)$ic83$);
        var89 = var88.first();
        SubLObject var91 = var88.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var91, var88, (SubLObject)$ic83$);
        var90 = var91.first();
        var91 = var91.rest();
        if (NIL == var91) {
            return Types.sublisp_null(var90);
        }
        cdestructuring_bind.cdestructuring_bind_error(var88, (SubLObject)$ic83$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5900(final SubLObject var88) {
        SubLObject var89 = (SubLObject)NIL;
        SubLObject var90 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var88, var88, (SubLObject)$ic83$);
        var89 = var88.first();
        SubLObject var91 = var88.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var91, var88, (SubLObject)$ic83$);
        var90 = var91.first();
        var91 = var91.rest();
        if (NIL == var91) {
            final SubLObject var92 = f5895(var89, var90);
            SubLObject var93 = (SubLObject)NIL;
            if (NIL == var92) {
                ConsesLow.set_nth((SubLObject)ONE_INTEGER, var88, (SubLObject)NIL);
                f5861(var90);
                var93 = (SubLObject)T;
            }
            return Values.values(var92, var88, var93);
        }
        cdestructuring_bind.cdestructuring_bind_error(var88, (SubLObject)$ic83$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5901(final SubLObject var88) {
        SubLObject var89 = (SubLObject)NIL;
        SubLObject var90 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var88, var88, (SubLObject)$ic83$);
        var89 = var88.first();
        SubLObject var91 = var88.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var91, var88, (SubLObject)$ic83$);
        var90 = var91.first();
        var91 = var91.rest();
        if (NIL == var91) {
            f5896(var90, var89);
            return (SubLObject)T;
        }
        cdestructuring_bind.cdestructuring_bind_error(var88, (SubLObject)$ic83$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5902(final SubLObject var96, final SubLObject var2, SubLObject var97) {
        if (var97 == UNPROVIDED) {
            var97 = (SubLObject)NIL;
        }
        final SubLThread var98 = SubLProcess.currentSubLThread();
        SubLObject var99 = (SubLObject)ZERO_INTEGER;
        SubLObject var100 = (SubLObject)NIL;
        SubLObject var101 = (SubLObject)NIL;
        var98.resetMultipleValues();
        final SubLObject var102 = f5894(var2, (SubLObject)UNPROVIDED);
        final SubLObject var103 = var98.secondMultipleValue();
        var98.resetMultipleValues();
        while (NIL == var101) {
            if (NIL != f5895(var102, var103)) {
                final SubLObject var104 = f5862(var103);
                final SubLObject var105 = f5858(var103);
                var99 = Numbers.add(var99, (SubLObject)ONE_INTEGER);
                final SubLObject var106 = module0045.f3139(var96, var104, var97, (SubLObject)NIL, (SubLObject)ZERO_INTEGER, var105);
                if (NIL == var106) {
                    continue;
                }
                final SubLObject var107 = module0038.f2623(var104, (SubLObject)ZERO_INTEGER, var105);
                var100 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var99, var107, var106), var100);
            }
            else {
                var101 = (SubLObject)T;
            }
        }
        f5896(var103, var102);
        return Sequences.nreverse(var100);
    }
    
    public static SubLObject f5903() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5843", "S#7480", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5845", "S#7481", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5844", "S#7482", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5846", "S#7483", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5847", "S#7484", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5849", "S#7477", 1, 0, false);
        new $f5849$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5850", "S#7485", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5851", "S#7486", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5852", "S#7487", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5853", "S#7488", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5854", "S#7489", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5855", "S#7490", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5856", "S#7491", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5848", "S#7492", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5859", "S#7493", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5861", "S#7494", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5862", "S#7495", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5858", "S#7496", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0085", "f5863", "S#7497");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5857", "S#7498", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5864", "S#7499", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5865", "S#7500", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5860", "S#7501", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5866", "S#7502", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5867", "S#7503", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5868", "S#7504", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5870", "S#7479", 1, 0, false);
        new $f5870$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5871", "S#7505", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5872", "S#7506", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5873", "S#7507", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5874", "S#7508", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5875", "S#7509", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5876", "S#7510", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5877", "S#7511", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5878", "S#7512", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5879", "S#7513", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5880", "S#7514", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5881", "S#7515", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5869", "S#7516", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5884", "S#7517", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5886", "S#7518", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5883", "S#7519", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5882", "S#7520", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5885", "S#7521", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5887", "S#7522", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5888", "S#7523", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5890", "S#7524", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5889", "S#7525", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5891", "S#7526", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0085", "f5892", "S#7527");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0085", "f5893", "S#7528");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5894", "S#7529", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5895", "S#7530", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5896", "S#7531", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5897", "S#7532", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5898", "S#7533", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5899", "S#7534", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5900", "S#7535", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5901", "S#7536", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0085", "f5902", "S#7537", 2, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5904() {
        $g1173$ = SubLFiles.defconstant("S#7538", (SubLObject)$ic1$);
        $g1174$ = SubLFiles.defconstant("S#7539", (SubLObject)$ic30$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5905() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g1173$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic8$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic9$);
        Structures.def_csetf((SubLObject)$ic10$, (SubLObject)$ic11$);
        Structures.def_csetf((SubLObject)$ic12$, (SubLObject)$ic13$);
        Equality.identity((SubLObject)$ic1$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g1173$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic21$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g1174$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic37$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic38$);
        Structures.def_csetf((SubLObject)$ic39$, (SubLObject)$ic40$);
        Structures.def_csetf((SubLObject)$ic41$, (SubLObject)$ic42$);
        Structures.def_csetf((SubLObject)$ic43$, (SubLObject)$ic44$);
        Structures.def_csetf((SubLObject)$ic45$, (SubLObject)$ic46$);
        Equality.identity((SubLObject)$ic30$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g1174$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic50$));
        module0002.f50((SubLObject)$ic70$, (SubLObject)$ic65$);
        module0002.f50((SubLObject)$ic75$, (SubLObject)$ic65$);
        module0002.f50((SubLObject)$ic79$, (SubLObject)$ic65$);
        module0012.f419((SubLObject)$ic80$);
        module0012.f419((SubLObject)$ic81$);
        module0012.f419((SubLObject)$ic82$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f5903();
    }
    
    public void initializeVariables() {
        f5904();
    }
    
    public void runTopLevelForms() {
        f5905();
    }
    
    static {
        me = (SubLFile)new module0085();
        $g1173$ = null;
        $g1174$ = null;
        $ic0$ = makeString("Improper index bounds ~S ~S");
        $ic1$ = makeSymbol("S#7476", "CYC");
        $ic2$ = makeSymbol("S#7477", "CYC");
        $ic3$ = ConsesLow.list((SubLObject)makeSymbol("STRING"), (SubLObject)makeSymbol("POSITION"));
        $ic4$ = ConsesLow.list((SubLObject)makeKeyword("STRING"), (SubLObject)makeKeyword("POSITION"));
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#7485", "CYC"), (SubLObject)makeSymbol("S#7486", "CYC"));
        $ic6$ = ConsesLow.list((SubLObject)makeSymbol("S#7487", "CYC"), (SubLObject)makeSymbol("S#7488", "CYC"));
        $ic7$ = makeSymbol("S#7492", "CYC");
        $ic8$ = makeSymbol("S#7484", "CYC");
        $ic9$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#7477", "CYC"));
        $ic10$ = makeSymbol("S#7485", "CYC");
        $ic11$ = makeSymbol("S#7487", "CYC");
        $ic12$ = makeSymbol("S#7486", "CYC");
        $ic13$ = makeSymbol("S#7488", "CYC");
        $ic14$ = makeKeyword("STRING");
        $ic15$ = makeKeyword("POSITION");
        $ic16$ = makeString("Invalid slot ~S for construction function");
        $ic17$ = makeKeyword("BEGIN");
        $ic18$ = makeSymbol("S#7489", "CYC");
        $ic19$ = makeKeyword("SLOT");
        $ic20$ = makeKeyword("END");
        $ic21$ = makeSymbol("S#7491", "CYC");
        $ic22$ = makeString("#<STRING-BUFFER capacity=~S position=~S>");
        $ic23$ = makeInteger(64);
        $ic24$ = makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic25$ = makeKeyword("DESTROYED");
        $ic26$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#7540", "CYC"), (SubLObject)makeSymbol("S#7541", "CYC")), (SubLObject)makeSymbol("S#7476", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic27$ = makeSymbol("CLET");
        $ic28$ = makeSymbol("S#7495", "CYC");
        $ic29$ = makeSymbol("S#7496", "CYC");
        $ic30$ = makeSymbol("S#7478", "CYC");
        $ic31$ = makeSymbol("S#7479", "CYC");
        $ic32$ = ConsesLow.list((SubLObject)makeSymbol("STREAM"), (SubLObject)makeSymbol("S#7542", "CYC"), (SubLObject)makeSymbol("S#125", "CYC"), (SubLObject)makeSymbol("POSITION"));
        $ic33$ = ConsesLow.list((SubLObject)makeKeyword("STREAM"), (SubLObject)makeKeyword("BUFFER"), (SubLObject)makeKeyword("END"), (SubLObject)makeKeyword("POSITION"));
        $ic34$ = ConsesLow.list((SubLObject)makeSymbol("S#7505", "CYC"), (SubLObject)makeSymbol("S#7506", "CYC"), (SubLObject)makeSymbol("S#7507", "CYC"), (SubLObject)makeSymbol("S#7508", "CYC"));
        $ic35$ = ConsesLow.list((SubLObject)makeSymbol("S#7509", "CYC"), (SubLObject)makeSymbol("S#7510", "CYC"), (SubLObject)makeSymbol("S#7511", "CYC"), (SubLObject)makeSymbol("S#7512", "CYC"));
        $ic36$ = makeSymbol("S#7516", "CYC");
        $ic37$ = makeSymbol("S#7504", "CYC");
        $ic38$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#7479", "CYC"));
        $ic39$ = makeSymbol("S#7505", "CYC");
        $ic40$ = makeSymbol("S#7509", "CYC");
        $ic41$ = makeSymbol("S#7506", "CYC");
        $ic42$ = makeSymbol("S#7510", "CYC");
        $ic43$ = makeSymbol("S#7507", "CYC");
        $ic44$ = makeSymbol("S#7511", "CYC");
        $ic45$ = makeSymbol("S#7508", "CYC");
        $ic46$ = makeSymbol("S#7512", "CYC");
        $ic47$ = makeKeyword("STREAM");
        $ic48$ = makeKeyword("BUFFER");
        $ic49$ = makeSymbol("S#7513", "CYC");
        $ic50$ = makeSymbol("S#7515", "CYC");
        $ic51$ = makeString("#<STREAM-BUFFER block size=~S for ~S>");
        $ic52$ = makeInteger(1024);
        $ic53$ = makeSymbol("STREAMP");
        $ic54$ = makeSymbol("POSITIVE-INTEGER-P");
        $ic55$ = makeString("EOF reached on ~S");
        $ic56$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#7543", "CYC"), (SubLObject)makeSymbol("S#885", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#7544", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic57$ = ConsesLow.list((SubLObject)makeKeyword("BLOCK-SIZE"), (SubLObject)makeKeyword("DONE"));
        $ic58$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic59$ = makeKeyword("BLOCK-SIZE");
        $ic60$ = makeKeyword("DONE");
        $ic61$ = makeUninternedSymbol("US#4E0B20C");
        $ic62$ = makeSymbol("WITH-PRIVATE-TEXT-FILE");
        $ic63$ = ConsesLow.list((SubLObject)makeKeyword("INPUT"));
        $ic64$ = makeSymbol("PWHEN");
        $ic65$ = makeSymbol("S#7528", "CYC");
        $ic66$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#7543", "CYC"), (SubLObject)makeSymbol("STREAM"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#7544", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic67$ = makeUninternedSymbol("US#50BA606");
        $ic68$ = makeUninternedSymbol("US#57621F0");
        $ic69$ = makeSymbol("CMULTIPLE-VALUE-BIND");
        $ic70$ = makeSymbol("S#7529", "CYC");
        $ic71$ = makeSymbol("CUNWIND-PROTECT");
        $ic72$ = makeSymbol("WHILE");
        $ic73$ = makeSymbol("CNOT");
        $ic74$ = makeSymbol("PIF");
        $ic75$ = makeSymbol("S#7530", "CYC");
        $ic76$ = makeSymbol("PROGN");
        $ic77$ = makeSymbol("CSETQ");
        $ic78$ = ConsesLow.list((SubLObject)T);
        $ic79$ = makeSymbol("S#7531", "CYC");
        $ic80$ = makeSymbol("S#7534", "CYC");
        $ic81$ = makeSymbol("S#7535", "CYC");
        $ic82$ = makeSymbol("S#7536", "CYC");
        $ic83$ = ConsesLow.list((SubLObject)makeSymbol("S#7478", "CYC"), (SubLObject)makeSymbol("S#7545", "CYC"));
    }
    
    public static final class $sX7476_native extends SubLStructNative
    {
        public SubLObject $string;
        public SubLObject $position;
        private static final SubLStructDeclNative structDecl;
        
        public $sX7476_native() {
            this.$string = (SubLObject)CommonSymbols.NIL;
            this.$position = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX7476_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$string;
        }
        
        public SubLObject getField3() {
            return this.$position;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$string = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$position = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX7476_native.class, $ic1$, $ic2$, $ic3$, $ic4$, new String[] { "$string", "$position" }, $ic5$, $ic6$, $ic7$);
        }
    }
    
    public static final class $f5849$UnaryFunction extends UnaryFunction
    {
        public $f5849$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#7477"));
        }
        
        public SubLObject processItem(final SubLObject var17) {
            return f5849(var17);
        }
    }
    
    public static final class $sX7478_native extends SubLStructNative
    {
        public SubLObject $stream;
        public SubLObject $buffer;
        public SubLObject $end;
        public SubLObject $position;
        private static final SubLStructDeclNative structDecl;
        
        public $sX7478_native() {
            this.$stream = (SubLObject)CommonSymbols.NIL;
            this.$buffer = (SubLObject)CommonSymbols.NIL;
            this.$end = (SubLObject)CommonSymbols.NIL;
            this.$position = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX7478_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$stream;
        }
        
        public SubLObject getField3() {
            return this.$buffer;
        }
        
        public SubLObject getField4() {
            return this.$end;
        }
        
        public SubLObject getField5() {
            return this.$position;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$stream = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$buffer = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$end = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$position = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX7478_native.class, $ic30$, $ic31$, $ic32$, $ic33$, new String[] { "$stream", "$buffer", "$end", "$position" }, $ic34$, $ic35$, $ic36$);
        }
    }
    
    public static final class $f5870$UnaryFunction extends UnaryFunction
    {
        public $f5870$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#7479"));
        }
        
        public SubLObject processItem(final SubLObject var17) {
            return f5870(var17);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 238 ms
	
	Decompiled with Procyon 0.5.32.
*/