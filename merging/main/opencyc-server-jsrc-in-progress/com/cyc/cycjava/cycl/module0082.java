package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0082 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0082";
    public static final String myFingerPrint = "33f864bda7bfec376fae7efade678dde6a79282ae4e55283cfb308482167221e";
    public static SubLSymbol $g1164$;
    private static SubLSymbol $g1165$;
    public static SubLSymbol $g1166$;
    private static SubLSymbol $g1167$;
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
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLString $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLString $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLString $ic30$;
    private static final SubLString $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLList $ic36$;
    private static final SubLList $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLList $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLList $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLList $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLList $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLList $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLList $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLList $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLInteger $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLString $ic73$;
    private static final SubLString $ic74$;
    private static final SubLString $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLList $ic82$;
    private static final SubLString $ic83$;
    private static final SubLString $ic84$;
    private static final SubLString $ic85$;
    private static final SubLString $ic86$;
    private static final SubLString $ic87$;
    private static final SubLString $ic88$;
    private static final SubLString $ic89$;
    private static final SubLString $ic90$;
    private static final SubLString $ic91$;
    private static final SubLList $ic92$;
    private static final SubLString $ic93$;
    private static final SubLString $ic94$;
    private static final SubLString $ic95$;
    private static final SubLString $ic96$;
    private static final SubLString $ic97$;
    private static final SubLString $ic98$;
    private static final SubLString $ic99$;
    private static final SubLString $ic100$;
    private static final SubLString $ic101$;
    private static final SubLString $ic102$;
    private static final SubLSymbol $ic103$;
    
    public static SubLObject f5587(final SubLObject var1, final SubLObject var2) {
        f5588(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5589(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX7211_native.class) ? T : NIL);
    }
    
    public static SubLObject f5590(final SubLObject var1) {
        assert NIL != f5589(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f5591(final SubLObject var1) {
        assert NIL != f5589(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f5592(final SubLObject var1) {
        assert NIL != f5589(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f5593(final SubLObject var1) {
        assert NIL != f5589(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f5594(final SubLObject var1, final SubLObject var4) {
        assert NIL != f5589(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f5595(final SubLObject var1, final SubLObject var4) {
        assert NIL != f5589(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f5596(final SubLObject var1, final SubLObject var4) {
        assert NIL != f5589(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f5597(final SubLObject var1, final SubLObject var4) {
        assert NIL != f5589(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f5598(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX7211_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic18$)) {
                f5594(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic19$)) {
                f5595(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic20$)) {
                f5596(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic21$)) {
                f5597(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic22$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f5599(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic23$, (SubLObject)$ic24$, (SubLObject)FOUR_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic25$, (SubLObject)$ic18$, f5590(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic25$, (SubLObject)$ic19$, f5591(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic25$, (SubLObject)$ic20$, f5592(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic25$, (SubLObject)$ic21$, f5593(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic26$, (SubLObject)$ic24$, (SubLObject)FOUR_INTEGER);
        return var11;
    }
    
    public static SubLObject f5600(final SubLObject var11, final SubLObject var12) {
        return f5599(var11, var12);
    }
    
    public static SubLObject f5588(final SubLObject var13, final SubLObject var2, final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (NIL != print_high.$print_readably$.getDynamicValue(var15)) {
            print_high.print_not_readable(var13, var2);
        }
        else {
            streams_high.write_string((SubLObject)$ic28$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var13), new SubLObject[] { $ic29$, var2 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            streams_high.write_string((SubLObject)$ic30$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            print_high.princ(module0030.f1592(f5593(var13)), var2);
            streams_high.write_string((SubLObject)$ic31$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            print_high.princ(module0032.f1710(f5590(var13)), var2);
            streams_high.write_string((SubLObject)$ic32$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            print_high.princ(module0066.f4812(f5591(var13)), var2);
            streams_high.write_string((SubLObject)$ic33$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            streams_high.write_string((SubLObject)$ic34$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            print_high.princ(f5601(var13), var2);
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            PrintLow.write(Equality.pointer(var13), new SubLObject[] { $ic29$, var2, $ic35$, SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var2);
        }
        return var13;
    }
    
    public static SubLObject f5602(final SubLObject var20, final SubLObject var21, final SubLObject var22, final SubLObject var23) {
        final SubLObject var24 = f5598((SubLObject)UNPROVIDED);
        f5597(var24, var20);
        f5596(var24, var21);
        f5595(var24, var23);
        f5594(var24, var22);
        return var24;
    }
    
    public static SubLObject f5603(final SubLObject var25, final SubLObject var20) {
        return module0066.f4824(var25, var20);
    }
    
    public static SubLObject f5604(final SubLObject var26) {
        return module0066.f4825(var26);
    }
    
    public static SubLObject f5605(final SubLObject var26) {
        return module0066.f4826(var26);
    }
    
    public static SubLObject f5606(final SubLObject var26) {
        return module0066.f4827(var26);
    }
    
    public static SubLObject f5607(final SubLObject var27, final SubLObject var26, final SubLObject var20) {
        return module0066.f4831(var26, var27, var20, (SubLObject)ZERO_INTEGER);
    }
    
    public static SubLObject f5608(final SubLObject var27, final SubLObject var26, final SubLObject var20) {
        return Numbers.plusp(f5607(var27, var26, var20));
    }
    
    public static SubLObject f5609(final SubLObject var27, final SubLObject var26, final SubLObject var20) {
        return (SubLObject)((NIL != f5608(var27, var26, var20)) ? var27 : NIL);
    }
    
    public static SubLObject f5610(final SubLObject var26) {
        return module0066.f4846(var26);
    }
    
    public static SubLObject f5611(final SubLObject var27, final SubLObject var26, final SubLObject var20) {
        SubLObject var28 = module0066.f4831(var26, var27, var20, (SubLObject)ONE_INTEGER);
        var28 = Numbers.add(var28, (SubLObject)ONE_INTEGER);
        return module0066.f4833(var26, var27, var28, var20);
    }
    
    public static SubLObject f5612(final SubLObject var27, final SubLObject var26, final SubLObject var20) {
        SubLObject var28 = module0066.f4831(var26, var27, var20, (SubLObject)ZERO_INTEGER);
        if (!var28.isPositive()) {
            return (SubLObject)NIL;
        }
        var28 = Numbers.subtract(var28, (SubLObject)ONE_INTEGER);
        if (ONE_INTEGER.numL(var28)) {
            return module0066.f4833(var26, var27, var28, var20);
        }
        return module0066.f4834(var26, var27, var20);
    }
    
    public static SubLObject f5613(final SubLObject var27, final SubLObject var26, final SubLObject var20) {
        final SubLObject var28 = f5607(var27, var26, var20);
        return Values.values(module0066.f4834(var26, var27, var20), var28);
    }
    
    public static SubLObject f5614(final SubLObject var26) {
        return module0066.f4835(var26);
    }
    
    public static SubLObject f5615(final SubLObject var29, final SubLObject var30) {
        SubLObject var32;
        final SubLObject var31 = var32 = var29.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)$ic36$);
        final SubLObject var33 = var32.rest();
        var32 = var32.first();
        SubLObject var34 = (SubLObject)NIL;
        SubLObject var35 = (SubLObject)NIL;
        SubLObject var36 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)$ic36$);
        var34 = var32.first();
        var32 = var32.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)$ic36$);
        var35 = var32.first();
        var32 = var32.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)$ic36$);
        var36 = var32.first();
        var32 = var32.rest();
        SubLObject var37 = (SubLObject)NIL;
        SubLObject var38 = var32;
        SubLObject var39 = (SubLObject)NIL;
        SubLObject var39_40 = (SubLObject)NIL;
        while (NIL != var38) {
            cdestructuring_bind.destructuring_bind_must_consp(var38, var31, (SubLObject)$ic36$);
            var39_40 = var38.first();
            var38 = var38.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var38, var31, (SubLObject)$ic36$);
            if (NIL == conses_high.member(var39_40, (SubLObject)$ic37$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var39 = (SubLObject)T;
            }
            if (var39_40 == $ic38$) {
                var37 = var38.first();
            }
            var38 = var38.rest();
        }
        if (NIL != var39 && NIL == var37) {
            cdestructuring_bind.cdestructuring_bind_error(var31, (SubLObject)$ic36$);
        }
        final SubLObject var40 = cdestructuring_bind.property_list_member((SubLObject)$ic39$, var32);
        final SubLObject var41 = (SubLObject)((NIL != var40) ? conses_high.cadr(var40) : NIL);
        final SubLObject var42;
        var32 = (var42 = var33);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic40$, (SubLObject)ConsesLow.list(var34, var35, var36, (SubLObject)$ic39$, var41), ConsesLow.append(var42, (SubLObject)NIL));
    }
    
    public static SubLObject f5616(final SubLObject var29, final SubLObject var30) {
        SubLObject var32;
        final SubLObject var31 = var32 = var29.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)$ic41$);
        final SubLObject var33 = var32.rest();
        var32 = var32.first();
        SubLObject var34 = (SubLObject)NIL;
        SubLObject var35 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)$ic41$);
        var34 = var32.first();
        var32 = var32.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)$ic41$);
        var35 = var32.first();
        var32 = var32.rest();
        SubLObject var36 = (SubLObject)NIL;
        SubLObject var37 = var32;
        SubLObject var38 = (SubLObject)NIL;
        SubLObject var50_51 = (SubLObject)NIL;
        while (NIL != var37) {
            cdestructuring_bind.destructuring_bind_must_consp(var37, var31, (SubLObject)$ic41$);
            var50_51 = var37.first();
            var37 = var37.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var37, var31, (SubLObject)$ic41$);
            if (NIL == conses_high.member(var50_51, (SubLObject)$ic37$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var38 = (SubLObject)T;
            }
            if (var50_51 == $ic38$) {
                var36 = var37.first();
            }
            var37 = var37.rest();
        }
        if (NIL != var38 && NIL == var36) {
            cdestructuring_bind.cdestructuring_bind_error(var31, (SubLObject)$ic41$);
        }
        final SubLObject var39 = cdestructuring_bind.property_list_member((SubLObject)$ic39$, var32);
        final SubLObject var40 = (SubLObject)((NIL != var39) ? conses_high.cadr(var39) : NIL);
        final SubLObject var41;
        var32 = (var41 = var33);
        final SubLObject var42 = (SubLObject)$ic42$;
        final SubLObject var43 = (SubLObject)$ic43$;
        final SubLObject var44 = (SubLObject)$ic44$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic45$, (SubLObject)ConsesLow.list(var42, var43, var35, (SubLObject)$ic39$, var40), (SubLObject)ConsesLow.list((SubLObject)$ic46$, (SubLObject)ConsesLow.list(var44, var43), (SubLObject)ConsesLow.listS((SubLObject)$ic47$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var34, var42)), ConsesLow.append(var41, (SubLObject)NIL))));
    }
    
    public static SubLObject f5617(final SubLObject var55, final SubLObject var26, SubLObject var56) {
        if (var56 == UNPROVIDED) {
            var56 = (SubLObject)NIL;
        }
        final SubLThread var57 = SubLProcess.currentSubLThread();
        SubLObject var58;
        for (var58 = module0066.f4838(var26); NIL == module0066.f4841(var58); var58 = module0066.f4840(var58)) {
            var57.resetMultipleValues();
            final SubLObject var59 = module0066.f4839(var58);
            final SubLObject var60 = var57.secondMultipleValue();
            var57.resetMultipleValues();
            SubLObject var61;
            SubLObject var62;
            for (var61 = (SubLObject)NIL, var61 = (SubLObject)ZERO_INTEGER; var61.numL(var60); var61 = Numbers.add(var61, (SubLObject)ONE_INTEGER)) {
                var62 = var59;
                Functions.apply(var55, var62, var56);
            }
        }
        module0066.f4842(var58);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5618(final SubLObject var26) {
        final SubLThread var27 = SubLProcess.currentSubLThread();
        SubLObject var28 = (SubLObject)NIL;
        SubLObject var29;
        for (var29 = module0066.f4838(var26); NIL == module0066.f4841(var29); var29 = module0066.f4840(var29)) {
            var27.resetMultipleValues();
            final SubLObject var30 = module0066.f4839(var29);
            final SubLObject var31 = var27.secondMultipleValue();
            var27.resetMultipleValues();
            SubLObject var32;
            SubLObject var33;
            for (var32 = (SubLObject)NIL, var32 = (SubLObject)ZERO_INTEGER; var32.numL(var31); var32 = Numbers.add(var32, (SubLObject)ONE_INTEGER)) {
                var33 = var30;
                var28 = (SubLObject)ConsesLow.cons(var33, var28);
            }
        }
        module0066.f4842(var29);
        return var28;
    }
    
    public static SubLObject f5619(final SubLObject var26) {
        return module0066.f4844(var26);
    }
    
    public static SubLObject f5620(final SubLObject var26) {
        final SubLObject var27 = module0066.f4836(var26);
        return (SubLObject)ConsesLow.list((SubLObject)ZERO_INTEGER, (SubLObject)NIL, var27);
    }
    
    public static SubLObject f5621(final SubLObject var63) {
        SubLObject var64 = (SubLObject)NIL;
        SubLObject var65 = (SubLObject)NIL;
        SubLObject var66 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var63, var63, (SubLObject)$ic48$);
        var64 = var63.first();
        SubLObject var67 = var63.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var67, var63, (SubLObject)$ic48$);
        var65 = var67.first();
        var67 = var67.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var67, var63, (SubLObject)$ic48$);
        var66 = var67.first();
        var67 = var67.rest();
        if (NIL == var67) {
            return (SubLObject)makeBoolean(var64.isZero() && ($ic49$ == var66 || NIL != module0052.f3687(var66)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var63, (SubLObject)$ic48$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5622(final SubLObject var63) {
        SubLObject var64 = (SubLObject)NIL;
        SubLObject var65 = (SubLObject)NIL;
        SubLObject var66 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var63, var63, (SubLObject)$ic48$);
        var64 = var63.first();
        SubLObject var67 = var63.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var67, var63, (SubLObject)$ic48$);
        var65 = var67.first();
        var67 = var67.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var67, var63, (SubLObject)$ic48$);
        var66 = var67.first();
        var67 = var67.rest();
        if (NIL == var67) {
            if (var64.isZero()) {
                final SubLObject var68 = module0052.f3693(var66);
                SubLObject var71_72;
                final SubLObject var69_70 = var71_72 = var68;
                SubLObject var69 = (SubLObject)NIL;
                SubLObject var70 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var71_72, var69_70, (SubLObject)$ic50$);
                var69 = var71_72.first();
                var71_72 = var71_72.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var71_72, var69_70, (SubLObject)$ic50$);
                var70 = var71_72.first();
                var71_72 = var71_72.rest();
                if (NIL == var71_72) {
                    var65 = var69;
                    var64 = var70;
                    ConsesLow.set_nth((SubLObject)ONE_INTEGER, var63, var65);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var69_70, (SubLObject)$ic50$);
                }
                if (NIL != module0052.f3687(var66)) {
                    ConsesLow.set_nth((SubLObject)TWO_INTEGER, var63, (SubLObject)$ic49$);
                }
            }
            if (var64.isPositive()) {
                var64 = Numbers.subtract(var64, (SubLObject)ONE_INTEGER);
                ConsesLow.set_nth((SubLObject)ZERO_INTEGER, var63, var64);
            }
            return Values.values(var65, var63);
        }
        cdestructuring_bind.cdestructuring_bind_error(var63, (SubLObject)$ic48$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5623(final SubLObject var26) {
        if (NIL != module0066.f4827(var26)) {
            return module0052.f3708();
        }
        if (module0066.f4826(var26).numL($g1165$.getGlobalValue())) {
            return module0052.f3709(f5618(var26));
        }
        return module0052.f3689(f5620(var26), (SubLObject)$ic51$, (SubLObject)$ic52$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f5624(final SubLObject var25, final SubLObject var20) {
        return module0032.f1726(var25, var20);
    }
    
    public static SubLObject f5625(final SubLObject var75) {
        return module0032.f1727(var75);
    }
    
    public static SubLObject f5626(final SubLObject var75) {
        return module0032.f1728(var75);
    }
    
    public static SubLObject f5627(final SubLObject var75) {
        return module0032.f1729(var75);
    }
    
    public static SubLObject f5628(final SubLObject var27, final SubLObject var75, final SubLObject var20) {
        return module0032.f1731(var27, var75, var20);
    }
    
    public static SubLObject f5629(final SubLObject var27, final SubLObject var75, final SubLObject var20) {
        return (SubLObject)((NIL != f5628(var27, var75, var20)) ? ONE_INTEGER : ZERO_INTEGER);
    }
    
    public static SubLObject f5630(final SubLObject var27, final SubLObject var75, final SubLObject var20) {
        return module0032.f1733(var27, var75, var20);
    }
    
    public static SubLObject f5631(final SubLObject var75) {
        return module0032.f1734(var75);
    }
    
    public static SubLObject f5632(final SubLObject var27, final SubLObject var75, final SubLObject var20) {
        return module0032.f1736(var27, var75, var20);
    }
    
    public static SubLObject f5633(final SubLObject var27, final SubLObject var75, final SubLObject var20) {
        return module0032.f1737(var27, var75, var20);
    }
    
    public static SubLObject f5634(final SubLObject var27, final SubLObject var75, final SubLObject var20) {
        return module0032.f1737(var27, var75, var20);
    }
    
    public static SubLObject f5635(final SubLObject var75) {
        return module0032.f1738(var75);
    }
    
    public static SubLObject f5636(final SubLObject var29, final SubLObject var30) {
        SubLObject var32;
        final SubLObject var31 = var32 = var29.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)$ic53$);
        final SubLObject var33 = var32.rest();
        var32 = var32.first();
        SubLObject var34 = (SubLObject)NIL;
        SubLObject var35 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)$ic53$);
        var34 = var32.first();
        var32 = var32.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)$ic53$);
        var35 = var32.first();
        var32 = var32.rest();
        SubLObject var36 = (SubLObject)NIL;
        SubLObject var37 = var32;
        SubLObject var38 = (SubLObject)NIL;
        SubLObject var82_83 = (SubLObject)NIL;
        while (NIL != var37) {
            cdestructuring_bind.destructuring_bind_must_consp(var37, var31, (SubLObject)$ic53$);
            var82_83 = var37.first();
            var37 = var37.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var37, var31, (SubLObject)$ic53$);
            if (NIL == conses_high.member(var82_83, (SubLObject)$ic37$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var38 = (SubLObject)T;
            }
            if (var82_83 == $ic38$) {
                var36 = var37.first();
            }
            var37 = var37.rest();
        }
        if (NIL != var38 && NIL == var36) {
            cdestructuring_bind.cdestructuring_bind_error(var31, (SubLObject)$ic53$);
        }
        final SubLObject var39 = cdestructuring_bind.property_list_member((SubLObject)$ic39$, var32);
        final SubLObject var40 = (SubLObject)((NIL != var39) ? conses_high.cadr(var39) : NIL);
        final SubLObject var41;
        var32 = (var41 = var33);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic54$, (SubLObject)ConsesLow.list(var34, var35, (SubLObject)$ic39$, var40), ConsesLow.append(var41, (SubLObject)NIL));
    }
    
    public static SubLObject f5637(final SubLObject var55, final SubLObject var75, SubLObject var56) {
        if (var56 == UNPROVIDED) {
            var56 = (SubLObject)NIL;
        }
        SubLObject var76;
        SubLObject var77;
        SubLObject var78;
        for (var76 = module0032.f1741(var75), var77 = (SubLObject)NIL, var77 = module0032.f1742(var76, var75); NIL == module0032.f1744(var76, var77); var77 = module0032.f1743(var77)) {
            var78 = module0032.f1745(var76, var77);
            if (NIL != module0032.f1746(var77, var78)) {
                Functions.apply(var55, var78, var56);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5638(final SubLObject var75) {
        SubLObject var76 = (SubLObject)NIL;
        SubLObject var77;
        SubLObject var78;
        SubLObject var79;
        for (var77 = module0032.f1741(var75), var78 = (SubLObject)NIL, var78 = module0032.f1742(var77, var75); NIL == module0032.f1744(var77, var78); var78 = module0032.f1743(var78)) {
            var79 = module0032.f1745(var77, var78);
            if (NIL != module0032.f1746(var78, var79)) {
                var76 = (SubLObject)ConsesLow.cons(var79, var76);
            }
        }
        return var76;
    }
    
    public static SubLObject f5639(final SubLObject var75) {
        return module0032.f1753(var75);
    }
    
    public static SubLObject f5640(final SubLObject var75) {
        if (NIL != f5627(var75)) {
            return module0052.f3708();
        }
        return module0032.f1739(var75);
    }
    
    public static SubLObject f5641(final SubLObject var75, final SubLObject var26) {
        if (NIL != f5627(var75)) {
            return f5623(var26);
        }
        if (NIL != f5606(var26)) {
            return f5640(var75);
        }
        return module0052.f3749((SubLObject)ConsesLow.list(f5640(var75), f5623(var26)));
    }
    
    public static SubLObject f5642(SubLObject var20, SubLObject var25) {
        if (var20 == UNPROVIDED) {
            var20 = $g1166$.getGlobalValue();
        }
        if (var25 == UNPROVIDED) {
            var25 = (SubLObject)ZERO_INTEGER;
        }
        assert NIL != module0030.f1591(var20) : var20;
        assert NIL != Types.integerp(var25) : var25;
        if (var20.isSymbol()) {
            var20 = Symbols.symbol_function(var20);
        }
        final SubLObject var26 = Numbers.integerDivide(var25, (SubLObject)TWO_INTEGER);
        final SubLObject var27 = Numbers.integerDivide(var26, (SubLObject)TWO_INTEGER);
        return f5602(var20, (SubLObject)ZERO_INTEGER, f5624(var26, var20), f5603(var27, var20));
    }
    
    public static SubLObject f5643(final SubLObject var24) {
        assert NIL != f5589(var24) : var24;
        final SubLObject var25 = f5604(f5591(var24));
        final SubLObject var26 = f5625(f5590(var24));
        return f5602(f5644(var24), f5592(var24), var26, var25);
    }
    
    public static SubLObject f5645(final SubLObject var91, SubLObject var20, SubLObject var25) {
        if (var20 == UNPROVIDED) {
            var20 = $g1166$.getGlobalValue();
        }
        if (var25 == UNPROVIDED) {
            var25 = (SubLObject)NIL;
        }
        assert NIL != Types.listp(var91) : var91;
        if (NIL == var25) {
            var25 = Sequences.length(var91);
        }
        final SubLObject var92 = f5642(var20, var25);
        SubLObject var93 = var91;
        SubLObject var94 = (SubLObject)NIL;
        var94 = var93.first();
        while (NIL != var93) {
            f5646(var94, var92);
            var93 = var93.rest();
            var94 = var93.first();
        }
        return var92;
    }
    
    public static SubLObject f5644(final SubLObject var24) {
        assert NIL != f5589(var24) : var24;
        return f5593(var24);
    }
    
    public static SubLObject f5601(final SubLObject var24) {
        assert NIL != f5589(var24) : var24;
        return Numbers.add(f5626(f5590(var24)), f5592(var24));
    }
    
    public static SubLObject f5647(final SubLObject var24) {
        assert NIL != f5589(var24) : var24;
        return Numbers.add(f5626(f5590(var24)), f5605(f5591(var24)));
    }
    
    public static SubLObject f5648(final SubLObject var24) {
        assert NIL != f5589(var24) : var24;
        return (SubLObject)makeBoolean(NIL != f5606(f5591(var24)) && NIL != f5627(f5590(var24)));
    }
    
    public static SubLObject f5649(final SubLObject var93) {
        return (SubLObject)makeBoolean(NIL != f5589(var93) && NIL != f5648(var93));
    }
    
    public static SubLObject f5650(final SubLObject var93) {
        return (SubLObject)makeBoolean(NIL != f5589(var93) && NIL == f5648(var93));
    }
    
    public static SubLObject f5651(final SubLObject var27, final SubLObject var24) {
        assert NIL != f5589(var24) : var24;
        final SubLObject var28 = f5593(var24);
        return (SubLObject)makeBoolean(NIL != f5628(var27, f5590(var24), var28) || NIL != f5608(var27, f5591(var24), var28));
    }
    
    public static SubLObject f5652(final SubLObject var27, final SubLObject var24) {
        assert NIL != f5589(var24) : var24;
        final SubLObject var28 = f5593(var24);
        if (NIL != f5628(var27, f5590(var24), var28)) {
            return (SubLObject)ONE_INTEGER;
        }
        return f5607(var27, f5591(var24), var28);
    }
    
    public static SubLObject f5653(final SubLObject var27, final SubLObject var24) {
        assert NIL != f5589(var24) : var24;
        final SubLObject var28 = f5593(var24);
        final SubLObject var29 = f5630(var27, f5590(var24), var28);
        if (NIL != Functions.funcall(var28, var27, var29)) {
            return var29;
        }
        return f5609(var27, f5591(var24), var28);
    }
    
    public static SubLObject f5654(final SubLObject var24) {
        assert NIL != f5589(var24) : var24;
        if (NIL != f5627(f5590(var24))) {
            return f5610(f5591(var24));
        }
        return f5631(f5590(var24));
    }
    
    public static SubLObject f5646(final SubLObject var27, final SubLObject var24) {
        final SubLObject var28 = f5593(var24);
        SubLObject var29 = (SubLObject)NIL;
        if (NIL != f5628(var27, f5590(var24), var28)) {
            var29 = (SubLObject)T;
            f5594(var24, f5633(var27, f5590(var24), var28));
            f5595(var24, f5611(var27, f5591(var24), var28));
            f5596(var24, Numbers.add(f5592(var24), (SubLObject)TWO_INTEGER));
        }
        else if (NIL != f5608(var27, f5591(var24), var28)) {
            var29 = (SubLObject)T;
            f5595(var24, f5611(var27, f5591(var24), var28));
            f5596(var24, Numbers.add(f5592(var24), (SubLObject)ONE_INTEGER));
        }
        else {
            f5594(var24, f5632(var27, f5590(var24), var28));
        }
        return var29;
    }
    
    public static SubLObject f5655(final SubLObject var27, final SubLObject var24) {
        final SubLObject var28 = f5593(var24);
        final SubLObject var29 = f5607(var27, f5591(var24), var28);
        SubLObject var30 = (SubLObject)NIL;
        if (TWO_INTEGER.numE(var29)) {
            f5595(var24, f5612(var27, f5591(var24), var28));
            f5594(var24, f5632(var27, f5590(var24), var28));
            f5596(var24, Numbers.subtract(f5592(var24), (SubLObject)TWO_INTEGER));
            var30 = (SubLObject)T;
        }
        else if (var29.isPositive()) {
            f5595(var24, f5612(var27, f5591(var24), var28));
            f5596(var24, Numbers.subtract(f5592(var24), (SubLObject)ONE_INTEGER));
            var30 = (SubLObject)T;
        }
        else if (NIL != f5628(var27, f5590(var24), var28)) {
            f5594(var24, f5633(var27, f5590(var24), var28));
            var30 = (SubLObject)T;
        }
        return var30;
    }
    
    public static SubLObject f5656(final SubLObject var27, final SubLObject var24) {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        final SubLObject var29 = f5593(var24);
        var28.resetMultipleValues();
        final SubLObject var30 = f5613(var27, f5591(var24), var29);
        final SubLObject var31 = var28.secondMultipleValue();
        var28.resetMultipleValues();
        if (var31.isPositive()) {
            f5595(var24, var30);
            f5596(var24, Numbers.subtract(f5592(var24), var31));
            return (SubLObject)T;
        }
        if (NIL != f5628(var27, f5590(var24), var29)) {
            f5594(var24, f5634(var27, f5590(var24), var29));
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5657(final SubLObject var24) {
        assert NIL != f5589(var24) : var24;
        f5595(var24, f5614(f5591(var24)));
        f5594(var24, f5635(f5590(var24)));
        f5596(var24, (SubLObject)ZERO_INTEGER);
        return var24;
    }
    
    public static SubLObject f5658(final SubLObject var24) {
        assert NIL != f5589(var24) : var24;
        return f5641(f5590(var24), f5591(var24));
    }
    
    public static SubLObject f5659(final SubLObject var29, final SubLObject var30) {
        SubLObject var32;
        final SubLObject var31 = var32 = var29.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)$ic58$);
        final SubLObject var33 = var32.rest();
        var32 = var32.first();
        SubLObject var34 = (SubLObject)NIL;
        SubLObject var35 = (SubLObject)NIL;
        SubLObject var36 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)$ic58$);
        var34 = var32.first();
        var32 = var32.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)$ic58$);
        var35 = var32.first();
        var32 = var32.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)$ic58$);
        var36 = var32.first();
        var32 = var32.rest();
        SubLObject var37 = (SubLObject)NIL;
        SubLObject var38 = var32;
        SubLObject var39 = (SubLObject)NIL;
        SubLObject var104_105 = (SubLObject)NIL;
        while (NIL != var38) {
            cdestructuring_bind.destructuring_bind_must_consp(var38, var31, (SubLObject)$ic58$);
            var104_105 = var38.first();
            var38 = var38.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var38, var31, (SubLObject)$ic58$);
            if (NIL == conses_high.member(var104_105, (SubLObject)$ic37$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var39 = (SubLObject)T;
            }
            if (var104_105 == $ic38$) {
                var37 = var38.first();
            }
            var38 = var38.rest();
        }
        if (NIL != var39 && NIL == var37) {
            cdestructuring_bind.cdestructuring_bind_error(var31, (SubLObject)$ic58$);
        }
        final SubLObject var40 = cdestructuring_bind.property_list_member((SubLObject)$ic39$, var32);
        final SubLObject var41 = (SubLObject)((NIL != var40) ? conses_high.cadr(var40) : NIL);
        final SubLObject var42;
        var32 = (var42 = var33);
        return (SubLObject)ConsesLow.list((SubLObject)$ic59$, (SubLObject)ConsesLow.listS((SubLObject)$ic45$, (SubLObject)ConsesLow.list(var34, var35, (SubLObject)ConsesLow.list((SubLObject)$ic60$, var36), (SubLObject)$ic39$, var41), ConsesLow.append(var42, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic61$, var41, (SubLObject)ConsesLow.list((SubLObject)$ic47$, (SubLObject)ConsesLow.list(reader.bq_cons(var35, (SubLObject)$ic62$)), (SubLObject)ConsesLow.listS((SubLObject)$ic63$, (SubLObject)ConsesLow.list(var34, (SubLObject)ConsesLow.list((SubLObject)$ic64$, var36), (SubLObject)$ic39$, var41), ConsesLow.append(var42, (SubLObject)NIL)))));
    }
    
    public static SubLObject f5660(final SubLObject var29, final SubLObject var30) {
        SubLObject var32;
        final SubLObject var31 = var32 = var29.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)$ic65$);
        final SubLObject var33 = var32.rest();
        var32 = var32.first();
        SubLObject var34 = (SubLObject)NIL;
        SubLObject var35 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)$ic65$);
        var34 = var32.first();
        var32 = var32.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)$ic65$);
        var35 = var32.first();
        var32 = var32.rest();
        SubLObject var36 = (SubLObject)NIL;
        SubLObject var37 = var32;
        SubLObject var38 = (SubLObject)NIL;
        SubLObject var113_114 = (SubLObject)NIL;
        while (NIL != var37) {
            cdestructuring_bind.destructuring_bind_must_consp(var37, var31, (SubLObject)$ic65$);
            var113_114 = var37.first();
            var37 = var37.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var37, var31, (SubLObject)$ic65$);
            if (NIL == conses_high.member(var113_114, (SubLObject)$ic37$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var38 = (SubLObject)T;
            }
            if (var113_114 == $ic38$) {
                var36 = var37.first();
            }
            var37 = var37.rest();
        }
        if (NIL != var38 && NIL == var36) {
            cdestructuring_bind.cdestructuring_bind_error(var31, (SubLObject)$ic65$);
        }
        final SubLObject var39 = cdestructuring_bind.property_list_member((SubLObject)$ic39$, var32);
        final SubLObject var40 = (SubLObject)((NIL != var39) ? conses_high.cadr(var39) : NIL);
        final SubLObject var41;
        var32 = (var41 = var33);
        final SubLObject var42 = (SubLObject)$ic66$;
        final SubLObject var43 = (SubLObject)$ic67$;
        final SubLObject var44 = (SubLObject)$ic68$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic69$, (SubLObject)ConsesLow.list(var42, var44, var35, (SubLObject)$ic39$, var40), (SubLObject)ConsesLow.list((SubLObject)$ic46$, (SubLObject)ConsesLow.list(var43, var44), (SubLObject)ConsesLow.listS((SubLObject)$ic47$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var34, var42)), ConsesLow.append(var41, (SubLObject)NIL))));
    }
    
    public static SubLObject f5661(final SubLObject var24) {
        assert NIL != f5589(var24) : var24;
        return f5591(var24);
    }
    
    public static SubLObject f5662(final SubLObject var24) {
        assert NIL != f5589(var24) : var24;
        return f5590(var24);
    }
    
    public static SubLObject f5663(final SubLObject var55, final SubLObject var24, SubLObject var56) {
        if (var56 == UNPROVIDED) {
            var56 = (SubLObject)NIL;
        }
        assert NIL != f5589(var24) : var24;
        f5617(var55, f5591(var24), var56);
        f5637(var55, f5590(var24), var56);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5664(final SubLObject var24) {
        assert NIL != f5589(var24) : var24;
        return ConsesLow.nconc(f5618(f5591(var24)), f5638(f5590(var24)));
    }
    
    public static SubLObject f5665(final SubLObject var24) {
        assert NIL != f5589(var24) : var24;
        return ConsesLow.nconc(f5619(f5591(var24)), f5639(f5590(var24)));
    }
    
    public static SubLObject f5666(final SubLObject var24) {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        assert NIL != f5589(var24) : var24;
        SubLObject var26 = (SubLObject)NIL;
        SubLObject var27;
        for (var27 = module0066.f4838(f5661(var24)); NIL == module0066.f4841(var27); var27 = module0066.f4840(var27)) {
            var25.resetMultipleValues();
            final SubLObject var28 = module0066.f4839(var27);
            final SubLObject var29 = var25.secondMultipleValue();
            var25.resetMultipleValues();
            var26 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var28, var29), var26);
        }
        module0066.f4842(var27);
        final SubLObject var30 = (SubLObject)ONE_INTEGER;
        final SubLObject var31 = f5662(var24);
        SubLObject var32;
        SubLObject var33;
        SubLObject var34;
        for (var32 = module0032.f1741(var31), var33 = (SubLObject)NIL, var33 = module0032.f1742(var32, var31); NIL == module0032.f1744(var32, var33); var33 = module0032.f1743(var33)) {
            var34 = module0032.f1745(var32, var33);
            if (NIL != module0032.f1746(var33, var34)) {
                var26 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var34, var30), var26);
            }
        }
        return var26;
    }
    
    public static SubLObject f5667(final SubLObject var13, final SubLObject var2) {
        return f5668(var13, var2);
    }
    
    public static SubLObject f5668(final SubLObject var13, final SubLObject var2) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        module0021.f1086($g1167$.getGlobalValue(), var2);
        final SubLObject var15 = module0030.f1592(f5644(var13));
        final SubLObject var16 = f5601(var13);
        module0021.f1038(var15, var2);
        module0021.f1038(var16, var2);
        module0021.f1038(f5647(var13), var2);
        final SubLObject var17 = f5626(f5590(var13));
        final SubLObject var18 = f5605(f5591(var13));
        module0021.f1038(var17, var2);
        final SubLObject var19 = f5590(var13);
        SubLObject var20;
        SubLObject var21;
        SubLObject var22;
        for (var20 = module0032.f1741(var19), var21 = (SubLObject)NIL, var21 = module0032.f1742(var20, var19); NIL == module0032.f1744(var20, var21); var21 = module0032.f1743(var21)) {
            var22 = module0032.f1745(var20, var21);
            if (NIL != module0032.f1746(var21, var22)) {
                module0021.f1038(var22, var2);
            }
        }
        module0021.f1038(var18, var2);
        SubLObject var23;
        for (var23 = module0066.f4838(f5591(var13)); NIL == module0066.f4841(var23); var23 = module0066.f4840(var23)) {
            var14.resetMultipleValues();
            final SubLObject var24 = module0066.f4839(var23);
            final SubLObject var25 = var14.secondMultipleValue();
            var14.resetMultipleValues();
            module0021.f1038(var24, var2);
            module0021.f1038(var25, var2);
        }
        module0066.f4842(var23);
        return var13;
    }
    
    public static SubLObject f5669(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var6 = module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        final SubLObject var13 = var4;
        if (var13.eql((SubLObject)EQ) || var13.eql((SubLObject)EQL) || var13.eql((SubLObject)EQUAL) || var13.eql((SubLObject)EQUALP)) {
            var4 = Symbols.symbol_function(var4);
        }
        var7 = module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        var11 = module0032.f1726(var7, var4);
        var9 = module0066.f4824((SubLObject)ZERO_INTEGER, var4);
        SubLObject var14;
        SubLObject var15;
        SubLObject var16;
        for (var14 = (SubLObject)NIL, var14 = (SubLObject)ZERO_INTEGER; var14.numL(var7); var14 = Numbers.add(var14, (SubLObject)ONE_INTEGER)) {
            var15 = module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL != module0066.f4831(var9, var15, var4, (SubLObject)NIL)) {
                var16 = module0066.f4831(var9, var15, var4, (SubLObject)ZERO_INTEGER);
                var9 = module0066.f4833(var9, var15, Numbers.add(var16, (SubLObject)ONE_INTEGER), var4);
            }
            else if (NIL != module0032.f1731(var15, var11, var4)) {
                var11 = module0032.f1737(var15, var11, var4);
                var9 = module0066.f4833(var9, var15, (SubLObject)TWO_INTEGER, var4);
            }
            else {
                var11 = module0032.f1736(var15, var11, var4);
            }
        }
        var8 = module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var17 = module0066.f4826(var9);
        final SubLObject var18 = Numbers.add(var8, var17);
        var12 = module0066.f4824(var18, var4);
        SubLObject var19;
        SubLObject var20;
        for (var14 = (SubLObject)NIL, var14 = (SubLObject)ZERO_INTEGER; var14.numL(var8); var14 = Numbers.add(var14, (SubLObject)ONE_INTEGER)) {
            var15 = module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var19 = module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var20 = module0066.f4831(var12, var15, var4, (SubLObject)ZERO_INTEGER);
            var12 = module0066.f4833(var12, var15, Numbers.add(var20, var19), var4);
        }
        SubLObject var21;
        for (var21 = module0066.f4838(var9); NIL == module0066.f4841(var21); var21 = module0066.f4840(var21)) {
            var3.resetMultipleValues();
            var15 = module0066.f4839(var21);
            var19 = var3.secondMultipleValue();
            var3.resetMultipleValues();
            var20 = module0066.f4831(var12, var15, var4, (SubLObject)ZERO_INTEGER);
            var12 = module0066.f4833(var12, var15, Numbers.add(var20, var19), var4);
        }
        module0066.f4842(var21);
        final SubLObject var22 = Numbers.subtract(var5, module0032.f1728(var11));
        var10 = f5602(var4, var22, var11, var12);
        final SubLObject var23 = Numbers.add(f5626(var11), f5605(var12));
        if (NIL != module0066.f4827(var9)) {
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var3) && !var6.numE(var23)) {
                Errors.error((SubLObject)$ic73$, var10, var6);
            }
        }
        else if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var3) && !var6.numGE(var23)) {
            Errors.error((SubLObject)$ic74$, var10, var6);
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var3) && !var5.numE(f5601(var10))) {
            Errors.error((SubLObject)$ic75$, var10, var5);
        }
        return var10;
    }
    
    public static SubLObject f5670(final SubLObject var128, final SubLObject var129) {
        final SubLThread var130 = SubLProcess.currentSubLThread();
        final SubLObject var131 = f5642((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var132 = (SubLObject)ZERO_INTEGER;
        if (NIL == f5648(var131)) {
            return (SubLObject)$ic83$;
        }
        SubLObject var133 = var128;
        SubLObject var134 = (SubLObject)NIL;
        var134 = var133.first();
        while (NIL != var133) {
            SubLObject var135;
            for (var135 = (SubLObject)NIL, var135 = (SubLObject)ZERO_INTEGER; var135.numL(var129); var135 = Numbers.add(var135, (SubLObject)ONE_INTEGER)) {
                if (!var132.numE(f5601(var131))) {
                    return (SubLObject)$ic84$;
                }
                if (!var135.numE(f5652(var134, var131))) {
                    return (SubLObject)$ic85$;
                }
                f5646(var134, var131);
                if (NIL == f5651(var134, var131)) {
                    return (SubLObject)$ic86$;
                }
                var132 = Numbers.add(var132, (SubLObject)ONE_INTEGER);
            }
            var133 = var133.rest();
            var134 = var133.first();
        }
        SubLObject var136;
        for (var136 = module0066.f4838(f5661(var131)); NIL == module0066.f4841(var136); var136 = module0066.f4840(var136)) {
            var130.resetMultipleValues();
            final SubLObject var137 = module0066.f4839(var136);
            final SubLObject var138 = var130.secondMultipleValue();
            var130.resetMultipleValues();
            if (NIL == module0004.f104(var137, var128, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                return (SubLObject)$ic87$;
            }
            if (!var138.numE(var129)) {
                return (SubLObject)$ic88$;
            }
        }
        module0066.f4842(var136);
        final SubLObject var139 = (SubLObject)ONE_INTEGER;
        final SubLObject var140 = f5662(var131);
        SubLObject var141;
        SubLObject var142;
        SubLObject var143;
        for (var141 = module0032.f1741(var140), var142 = (SubLObject)NIL, var142 = module0032.f1742(var141, var140); NIL == module0032.f1744(var141, var142); var142 = module0032.f1743(var142)) {
            var143 = module0032.f1745(var141, var142);
            if (NIL != module0032.f1746(var142, var143)) {
                if (NIL == module0004.f104(var143, var128, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    return (SubLObject)$ic87$;
                }
                if (!var139.numE(var129)) {
                    return (SubLObject)$ic88$;
                }
            }
        }
        var133 = var128;
        var134 = (SubLObject)NIL;
        var134 = var133.first();
        while (NIL != var133) {
            if (!f5652(var134, var131).numE(var129)) {
                return (SubLObject)$ic89$;
            }
            var133 = var133.rest();
            var134 = var133.first();
        }
        final SubLObject var144 = f5658(var131);
        SubLObject var147;
        for (SubLObject var145 = (SubLObject)NIL; NIL == var145; var145 = (SubLObject)makeBoolean(NIL == var147)) {
            var130.resetMultipleValues();
            final SubLObject var146 = module0052.f3693(var144);
            var147 = var130.secondMultipleValue();
            var130.resetMultipleValues();
            if (NIL != var147 && !f5652(var146, var131).numE(var129)) {
                return (SubLObject)$ic90$;
            }
        }
        final SubLObject var148 = f5665(var131);
        if (NIL != module0035.f2213(var148, var128, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)$ic91$;
        }
        SubLObject var150;
        final SubLObject var149 = var150 = f5666(var131);
        SubLObject var151 = (SubLObject)NIL;
        var151 = var150.first();
        while (NIL != var150) {
            SubLObject var153;
            final SubLObject var152 = var153 = var151;
            var143 = (SubLObject)NIL;
            SubLObject var154 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var153, var152, (SubLObject)$ic92$);
            var143 = var153.first();
            var153 = (var154 = var153.rest());
            if (NIL == module0004.f104(var143, var128, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                return (SubLObject)$ic93$;
            }
            if (!var154.numE(var129)) {
                return (SubLObject)$ic94$;
            }
            var150 = var150.rest();
            var151 = var150.first();
        }
        if (NIL == module0035.f1995(f5664(var131), Numbers.multiply(Sequences.length(var128), var129), (SubLObject)UNPROVIDED)) {
            return (SubLObject)$ic95$;
        }
        SubLObject var155 = (SubLObject)NIL;
        SubLObject var156 = (SubLObject)NIL;
        SubLObject var157 = module0021.f1031();
        try {
            module0021.f1038(var131, var157);
            var155 = module0021.f1033(var157);
        }
        finally {
            final SubLObject var158 = Threads.$is_thread_performing_cleanupP$.currentBinding(var130);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var130);
                module0021.f1034(var157);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var158, var130);
            }
        }
        var157 = module0021.f1055(var155);
        try {
            var156 = module0021.f1060(var157, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            final SubLObject var159 = Threads.$is_thread_performing_cleanupP$.currentBinding(var130);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var130);
                module0021.f1057(var157);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var159, var130);
            }
        }
        if (!f5601(var131).numE(f5601(var156))) {
            return (SubLObject)$ic96$;
        }
        if (!f5647(var131).numE(f5647(var156))) {
            return (SubLObject)$ic97$;
        }
        SubLObject var160;
        for (var160 = module0066.f4838(f5661(var156)); NIL == module0066.f4841(var160); var160 = module0066.f4840(var160)) {
            var130.resetMultipleValues();
            final SubLObject var161 = module0066.f4839(var160);
            final SubLObject var162 = var130.secondMultipleValue();
            var130.resetMultipleValues();
            if (NIL == f5651(var161, var131)) {
                return (SubLObject)$ic98$;
            }
            if (!var162.numE(f5652(var161, var131))) {
                return (SubLObject)$ic99$;
            }
        }
        module0066.f4842(var160);
        final SubLObject var163 = (SubLObject)ONE_INTEGER;
        final SubLObject var164 = f5662(var156);
        SubLObject var165;
        SubLObject var166;
        SubLObject var167;
        for (var165 = module0032.f1741(var164), var166 = (SubLObject)NIL, var166 = module0032.f1742(var165, var164); NIL == module0032.f1744(var165, var166); var166 = module0032.f1743(var166)) {
            var167 = module0032.f1745(var165, var166);
            if (NIL != module0032.f1746(var166, var167)) {
                if (NIL == f5651(var167, var131)) {
                    return (SubLObject)$ic98$;
                }
                if (!var163.numE(f5652(var167, var131))) {
                    return (SubLObject)$ic99$;
                }
            }
        }
        var133 = var128;
        var134 = (SubLObject)NIL;
        var134 = var133.first();
        while (NIL != var133) {
            SubLObject var135;
            for (var135 = (SubLObject)NIL, var135 = (SubLObject)ZERO_INTEGER; var135.numL(var129); var135 = Numbers.add(var135, (SubLObject)ONE_INTEGER)) {
                if (!var132.numE(f5601(var131))) {
                    return (SubLObject)$ic100$;
                }
                if (!Numbers.subtract(var129, var135).numE(f5652(var134, var131))) {
                    return (SubLObject)$ic101$;
                }
                f5655(var134, var131);
                var132 = Numbers.subtract(var132, (SubLObject)ONE_INTEGER);
            }
            var133 = var133.rest();
            var134 = var133.first();
        }
        if (NIL == f5648(var131)) {
            return (SubLObject)$ic102$;
        }
        return (SubLObject)$ic103$;
    }
    
    public static SubLObject f5671() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5587", "S#7213", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5589", "S#7212", 1, 0, false);
        new $f5589$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5590", "S#7214", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5591", "S#7215", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5592", "S#7216", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5593", "S#7217", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5594", "S#7218", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5595", "S#7219", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5596", "S#7220", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5597", "S#7221", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5598", "S#7222", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5599", "S#7223", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5600", "S#7224", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5588", "S#7225", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5602", "S#7226", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5603", "S#7227", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5604", "S#7228", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5605", "S#7229", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5606", "S#7230", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5607", "S#7231", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5608", "S#7232", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5609", "S#7233", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5610", "S#7234", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5611", "S#7235", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5612", "S#7236", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5613", "S#7237", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5614", "S#7238", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0082", "f5615", "S#7239");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0082", "f5616", "S#7240");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5617", "S#7241", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5618", "S#7242", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5619", "S#7243", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5620", "S#7244", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5621", "S#7245", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5622", "S#7246", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5623", "S#7247", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5624", "S#7248", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5625", "S#7249", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5626", "S#7250", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5627", "S#7251", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5628", "S#7252", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5629", "S#7253", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5630", "S#7254", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5631", "S#7255", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5632", "S#7256", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5633", "S#7257", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5634", "S#7258", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5635", "S#7259", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0082", "f5636", "S#7260");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5637", "S#7261", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5638", "S#7262", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5639", "S#7263", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5640", "S#7264", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5641", "S#7265", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5642", "S#7266", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5643", "S#7267", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5645", "S#7268", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5644", "S#7269", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5601", "S#7270", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5647", "S#7271", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5648", "S#7272", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5649", "S#7273", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5650", "S#7274", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5651", "S#7275", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5652", "S#7276", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5653", "S#7277", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5654", "S#7278", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5646", "S#7279", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5655", "S#7280", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5656", "S#7281", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5657", "S#7282", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5658", "S#7283", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0082", "f5659", "S#7284");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0082", "f5660", "S#7285");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5661", "S#7286", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5662", "S#7287", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5663", "S#7288", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5664", "S#7289", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5665", "S#7290", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5666", "S#7291", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5667", "S#7292", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5668", "S#7293", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5669", "S#7294", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0082", "f5670", "S#7295", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5672() {
        $g1164$ = SubLFiles.defconstant("S#7296", (SubLObject)$ic0$);
        $g1165$ = SubLFiles.deflexical("S#7297", (SubLObject)EIGHT_INTEGER);
        $g1166$ = SubLFiles.deflexical("S#7298", Symbols.symbol_function((SubLObject)EQL));
        $g1167$ = SubLFiles.defconstant("S#7299", (SubLObject)$ic70$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5673() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g1164$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic8$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic9$);
        Structures.def_csetf((SubLObject)$ic10$, (SubLObject)$ic11$);
        Structures.def_csetf((SubLObject)$ic12$, (SubLObject)$ic13$);
        Structures.def_csetf((SubLObject)$ic14$, (SubLObject)$ic15$);
        Structures.def_csetf((SubLObject)$ic16$, (SubLObject)$ic17$);
        Equality.identity((SubLObject)$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g1164$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic27$));
        module0002.f50((SubLObject)$ic60$, (SubLObject)$ic69$);
        module0002.f50((SubLObject)$ic64$, (SubLObject)$ic69$);
        module0021.f1098($g1167$.getGlobalValue(), (SubLObject)$ic71$);
        Structures.register_method(module0021.$g749$.getGlobalValue(), $g1164$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic72$));
        module0027.f1449((SubLObject)$ic76$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic21$, NIL, $ic77$, NIL, $ic78$, NIL, $ic79$, $ic80$, $ic81$, T }), (SubLObject)$ic82$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f5671();
    }
    
    public void initializeVariables() {
        f5672();
    }
    
    public void runTopLevelForms() {
        f5673();
    }
    
    static {
        me = (SubLFile)new module0082();
        $g1164$ = null;
        $g1165$ = null;
        $g1166$ = null;
        $g1167$ = null;
        $ic0$ = makeSymbol("S#7211", "CYC");
        $ic1$ = makeSymbol("S#7212", "CYC");
        $ic2$ = makeInteger(138);
        $ic3$ = ConsesLow.list((SubLObject)makeSymbol("S#7300", "CYC"), (SubLObject)makeSymbol("S#7301", "CYC"), (SubLObject)makeSymbol("S#7302", "CYC"), (SubLObject)makeSymbol("S#122", "CYC"));
        $ic4$ = ConsesLow.list((SubLObject)makeKeyword("UNIQUE-CONTENTS"), (SubLObject)makeKeyword("REPEAT-CONTENTS"), (SubLObject)makeKeyword("REPEAT-SIZE"), (SubLObject)makeKeyword("TEST"));
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#7214", "CYC"), (SubLObject)makeSymbol("S#7215", "CYC"), (SubLObject)makeSymbol("S#7216", "CYC"), (SubLObject)makeSymbol("S#7217", "CYC"));
        $ic6$ = ConsesLow.list((SubLObject)makeSymbol("S#7218", "CYC"), (SubLObject)makeSymbol("S#7219", "CYC"), (SubLObject)makeSymbol("S#7220", "CYC"), (SubLObject)makeSymbol("S#7221", "CYC"));
        $ic7$ = makeSymbol("S#7225", "CYC");
        $ic8$ = makeSymbol("S#7213", "CYC");
        $ic9$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#7212", "CYC"));
        $ic10$ = makeSymbol("S#7214", "CYC");
        $ic11$ = makeSymbol("S#7218", "CYC");
        $ic12$ = makeSymbol("S#7215", "CYC");
        $ic13$ = makeSymbol("S#7219", "CYC");
        $ic14$ = makeSymbol("S#7216", "CYC");
        $ic15$ = makeSymbol("S#7220", "CYC");
        $ic16$ = makeSymbol("S#7217", "CYC");
        $ic17$ = makeSymbol("S#7221", "CYC");
        $ic18$ = makeKeyword("UNIQUE-CONTENTS");
        $ic19$ = makeKeyword("REPEAT-CONTENTS");
        $ic20$ = makeKeyword("REPEAT-SIZE");
        $ic21$ = makeKeyword("TEST");
        $ic22$ = makeString("Invalid slot ~S for construction function");
        $ic23$ = makeKeyword("BEGIN");
        $ic24$ = makeSymbol("S#7222", "CYC");
        $ic25$ = makeKeyword("SLOT");
        $ic26$ = makeKeyword("END");
        $ic27$ = makeSymbol("S#7224", "CYC");
        $ic28$ = makeString("#<");
        $ic29$ = makeKeyword("STREAM");
        $ic30$ = makeString("(");
        $ic31$ = makeString(" impl ");
        $ic32$ = makeString("//");
        $ic33$ = makeString(")");
        $ic34$ = makeString(" size=");
        $ic35$ = makeKeyword("BASE");
        $ic36$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#715", "CYC"), (SubLObject)makeSymbol("S#7303", "CYC"), (SubLObject)makeSymbol("S#7304", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic37$ = ConsesLow.list((SubLObject)makeKeyword("DONE"));
        $ic38$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic39$ = makeKeyword("DONE");
        $ic40$ = makeSymbol("S#6410", "CYC");
        $ic41$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#715", "CYC"), (SubLObject)makeSymbol("S#7304", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic42$ = makeUninternedSymbol("US#5A4863");
        $ic43$ = makeUninternedSymbol("US#70AB416");
        $ic44$ = makeUninternedSymbol("US#13A64D7");
        $ic45$ = makeSymbol("S#7239", "CYC");
        $ic46$ = makeSymbol("CDOTIMES");
        $ic47$ = makeSymbol("CLET");
        $ic48$ = ConsesLow.list((SubLObject)makeSymbol("S#7305", "CYC"), (SubLObject)makeSymbol("S#7306", "CYC"), (SubLObject)makeSymbol("S#7307", "CYC"));
        $ic49$ = makeKeyword("UNINITIALIZED");
        $ic50$ = ConsesLow.list((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"));
        $ic51$ = makeSymbol("S#7246", "CYC");
        $ic52$ = makeSymbol("S#7245", "CYC");
        $ic53$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#715", "CYC"), (SubLObject)makeSymbol("S#7308", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic54$ = makeSymbol("S#2964", "CYC");
        $ic55$ = makeSymbol("S#2831", "CYC");
        $ic56$ = makeSymbol("INTEGERP");
        $ic57$ = makeSymbol("LISTP");
        $ic58$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#715", "CYC"), (SubLObject)makeSymbol("S#7303", "CYC"), (SubLObject)makeSymbol("S#7211", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic59$ = makeSymbol("PROGN");
        $ic60$ = makeSymbol("S#7286", "CYC");
        $ic61$ = makeSymbol("PUNLESS");
        $ic62$ = ConsesLow.list((SubLObject)ONE_INTEGER);
        $ic63$ = makeSymbol("S#7260", "CYC");
        $ic64$ = makeSymbol("S#7287", "CYC");
        $ic65$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#715", "CYC"), (SubLObject)makeSymbol("S#7211", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic66$ = makeUninternedSymbol("US#2441BAD");
        $ic67$ = makeUninternedSymbol("US#13A64D7");
        $ic68$ = makeUninternedSymbol("US#70AB416");
        $ic69$ = makeSymbol("S#7284", "CYC");
        $ic70$ = makeInteger(62);
        $ic71$ = makeSymbol("S#7294", "CYC");
        $ic72$ = makeSymbol("S#7292", "CYC");
        $ic73$ = makeString("CFASL-loaded bag ~A does not have the needed number of unique elements ~A.");
        $ic74$ = makeString("CFASL-loaded bag ~A has more than the expected unumber of unique elements ~A.");
        $ic75$ = makeString("CFASL-loaded bag ~A does not represent the expected number of total elements ~A.");
        $ic76$ = makeSymbol("S#7295", "CYC");
        $ic77$ = makeKeyword("OWNER");
        $ic78$ = makeKeyword("CLASSES");
        $ic79$ = makeKeyword("KB");
        $ic80$ = makeKeyword("TINY");
        $ic81$ = makeKeyword("WORKING?");
        $ic82$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("RED"), (SubLObject)makeKeyword("BLUE"), (SubLObject)makeKeyword("GREEN"), (SubLObject)makeKeyword("YELLOW"), (SubLObject)makeKeyword("WHITE"), (SubLObject)makeKeyword("BROWN"), (SubLObject)makeKeyword("BLACK")), (SubLObject)TEN_INTEGER), (SubLObject)makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("RED"), (SubLObject)makeKeyword("BLUE"), (SubLObject)makeKeyword("GREEN"), (SubLObject)makeKeyword("YELLOW"), (SubLObject)makeKeyword("WHITE"), (SubLObject)makeKeyword("BROWN"), (SubLObject)makeKeyword("BLACK")), (SubLObject)ONE_INTEGER), (SubLObject)makeKeyword("SUCCESS")));
        $ic83$ = makeString("bag not empty");
        $ic84$ = makeString("bag size != item count");
        $ic85$ = makeString("bag member-count out of whack");
        $ic86$ = makeString("added bag members not findable");
        $ic87$ = makeString("cannot find existing member again");
        $ic88$ = makeString("do-bag existing element not there often enough");
        $ic89$ = makeString("do-list existing element not there often enough");
        $ic90$ = makeString("iterator existing element not there often enough");
        $ic91$ = makeString("unique element list wrong");
        $ic92$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#7306", "CYC"), (SubLObject)makeSymbol("S#7303", "CYC"));
        $ic93$ = makeString("bag-element-count tuple contains bad element");
        $ic94$ = makeString("bag-element-count tuple contains bad count");
        $ic95$ = makeString("list of elements has bogus length");
        $ic96$ = makeString("CFASLed bag has different size.");
        $ic97$ = makeString("CFASLed bag has different unique size.");
        $ic98$ = makeString("CFASLed bag does not contain element.");
        $ic99$ = makeString("CFASLed bag does not contain element as often.");
        $ic100$ = makeString("removing items whacks bag-size");
        $ic101$ = makeString("removing items whacks member count");
        $ic102$ = makeString("emptied bag is not empty");
        $ic103$ = makeKeyword("SUCCESS");
    }
    
    public static final class $sX7211_native extends SubLStructNative
    {
        public SubLObject $unique_contents;
        public SubLObject $repeat_contents;
        public SubLObject $repeat_size;
        public SubLObject $test;
        public static final SubLStructDeclNative structDecl;
        
        public $sX7211_native() {
            this.$unique_contents = (SubLObject)CommonSymbols.NIL;
            this.$repeat_contents = (SubLObject)CommonSymbols.NIL;
            this.$repeat_size = (SubLObject)CommonSymbols.NIL;
            this.$test = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$unique_contents;
        }
        
        public SubLObject getField3() {
            return this.$repeat_contents;
        }
        
        public SubLObject getField4() {
            return this.$repeat_size;
        }
        
        public SubLObject getField5() {
            return this.$test;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$unique_contents = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$repeat_contents = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$repeat_size = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$test = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX7211_native.class, $ic0$, $ic1$, $ic3$, $ic4$, new String[] { "$unique_contents", "$repeat_contents", "$repeat_size", "$test" }, $ic5$, $ic6$, $ic7$);
        }
    }
    
    public static final class $f5589$UnaryFunction extends UnaryFunction
    {
        public $f5589$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#7212"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f5589(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 377 ms
	
	Decompiled with Procyon 0.5.32.
*/