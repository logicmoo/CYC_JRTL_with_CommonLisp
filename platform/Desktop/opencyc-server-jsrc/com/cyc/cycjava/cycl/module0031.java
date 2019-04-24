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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
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

public final class module0031 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0031";
    public static final String myFingerPrint = "b8e11ea70544d6752a20c9ba892ec34091b79a6aaeada61d9500fb63ad14d41a";
    public static SubLSymbol $g860$;
    private static SubLSymbol $g861$;
    private static SubLSymbol $g862$;
    private static SubLSymbol $g863$;
    private static SubLSymbol $g864$;
    private static SubLSymbol $g865$;
    private static SubLSymbol $g866$;
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
    private static final SubLSymbol $ic32$;
    private static final SubLList $ic33$;
    private static final SubLInteger $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLString $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLList $ic38$;
    private static final SubLList $ic39$;
    private static final SubLList $ic40$;
    private static final SubLInteger $ic41$;
    private static final SubLList $ic42$;
    private static final SubLList $ic43$;
    private static final SubLString $ic44$;
    private static final SubLList $ic45$;
    private static final SubLList $ic46$;
    private static final SubLList $ic47$;
    private static final SubLList $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLList $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLList $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLList $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLList $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLList $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLList $ic66$;
    private static final SubLList $ic67$;
    private static final SubLList $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLList $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLString $ic73$;
    private static final SubLList $ic74$;
    private static final SubLString $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLString $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLList $ic80$;
    private static final SubLList $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLList $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLList $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLList $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLList $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLInteger $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLSymbol $ic97$;
    
    public static SubLObject f1644(final SubLObject var1, final SubLObject var2) {
        f1645(var1, var2, (SubLObject)module0031.ZERO_INTEGER);
        return (SubLObject)module0031.NIL;
    }
    
    public static SubLObject f1646(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX2880_native.class) ? module0031.T : module0031.NIL);
    }
    
    public static SubLObject f1647(final SubLObject var1) {
        assert module0031.NIL != f1646(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f1648(final SubLObject var1) {
        assert module0031.NIL != f1646(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f1649(final SubLObject var1) {
        assert module0031.NIL != f1646(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f1650(final SubLObject var1) {
        assert module0031.NIL != f1646(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f1651(final SubLObject var1, final SubLObject var4) {
        assert module0031.NIL != f1646(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f1652(final SubLObject var1, final SubLObject var4) {
        assert module0031.NIL != f1646(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f1653(final SubLObject var1, final SubLObject var4) {
        assert module0031.NIL != f1646(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f1654(final SubLObject var1, final SubLObject var4) {
        assert module0031.NIL != f1646(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f1655(SubLObject var5) {
        if (var5 == module0031.UNPROVIDED) {
            var5 = (SubLObject)module0031.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX2880_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0031.NIL, var7 = var5; module0031.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0031.$ic18$)) {
                f1651(var6, var9);
            }
            else if (var10.eql((SubLObject)module0031.$ic19$)) {
                f1652(var6, var9);
            }
            else if (var10.eql((SubLObject)module0031.$ic20$)) {
                f1653(var6, var9);
            }
            else if (var10.eql((SubLObject)module0031.$ic21$)) {
                f1654(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0031.$ic22$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f1656(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0031.$ic23$, (SubLObject)module0031.$ic24$, (SubLObject)module0031.FOUR_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0031.$ic25$, (SubLObject)module0031.$ic18$, f1647(var11));
        Functions.funcall(var12, var11, (SubLObject)module0031.$ic25$, (SubLObject)module0031.$ic19$, f1648(var11));
        Functions.funcall(var12, var11, (SubLObject)module0031.$ic25$, (SubLObject)module0031.$ic20$, f1649(var11));
        Functions.funcall(var12, var11, (SubLObject)module0031.$ic25$, (SubLObject)module0031.$ic21$, f1650(var11));
        Functions.funcall(var12, var11, (SubLObject)module0031.$ic26$, (SubLObject)module0031.$ic24$, (SubLObject)module0031.FOUR_INTEGER);
        return var11;
    }
    
    public static SubLObject f1657(final SubLObject var11, final SubLObject var12) {
        return f1656(var11, var12);
    }
    
    public static SubLObject f1645(final SubLObject var13, final SubLObject var2, final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (module0031.NIL != print_high.$print_readably$.getDynamicValue(var15)) {
            print_high.print_not_readable(var13, var2);
        }
        else {
            streams_high.write_string((SubLObject)module0031.$ic28$, var2, (SubLObject)module0031.UNPROVIDED, (SubLObject)module0031.UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var13), new SubLObject[] { module0031.$ic29$, var2 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            print_high.princ(f1658(var13), var2);
            streams_high.write_string((SubLObject)module0031.$ic30$, var2, (SubLObject)module0031.UNPROVIDED, (SubLObject)module0031.UNPROVIDED);
            print_high.princ(f1649(var13), var2);
            streams_high.write_string((SubLObject)module0031.$ic31$, var2, (SubLObject)module0031.UNPROVIDED, (SubLObject)module0031.UNPROVIDED);
            print_high.princ(f1659(var13), var2);
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            PrintLow.write(Equality.pointer(var13), new SubLObject[] { module0031.$ic29$, var2, module0031.$ic32$, module0031.SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var2);
        }
        return var13;
    }
    
    public static SubLObject f1659(final SubLObject var20) {
        return Sequences.length(f1647(var20));
    }
    
    public static SubLObject f1660(final SubLObject var21, final SubLObject var22) {
        SubLObject var24;
        final SubLObject var23 = var24 = var21.rest();
        SubLObject var25 = (SubLObject)module0031.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)module0031.$ic38$);
        var25 = var24.first();
        var24 = var24.rest();
        if (module0031.NIL == var24) {
            return (SubLObject)ConsesLow.listS((SubLObject)module0031.EQ, var25, (SubLObject)module0031.$ic39$);
        }
        cdestructuring_bind.cdestructuring_bind_error(var23, (SubLObject)module0031.$ic38$);
        return (SubLObject)module0031.NIL;
    }
    
    public static SubLObject f1661(final SubLObject var21, final SubLObject var22) {
        SubLObject var24;
        final SubLObject var23 = var24 = var21.rest();
        SubLObject var25 = (SubLObject)module0031.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)module0031.$ic38$);
        var25 = var24.first();
        var24 = var24.rest();
        if (module0031.NIL == var24) {
            return (SubLObject)ConsesLow.listS((SubLObject)module0031.EQ, var25, (SubLObject)module0031.$ic40$);
        }
        cdestructuring_bind.cdestructuring_bind_error(var23, (SubLObject)module0031.$ic38$);
        return (SubLObject)module0031.NIL;
    }
    
    public static SubLObject f1662(final SubLObject var28, final SubLObject var29) {
        final SubLObject var30 = Numbers.ceiling(Numbers.log(var28, (SubLObject)module0031.TWO_INTEGER), (SubLObject)module0031.UNPROVIDED);
        final SubLObject var31 = Numbers.ceiling(Numbers.log(var29, (SubLObject)module0031.TWO_INTEGER), (SubLObject)module0031.UNPROVIDED);
        final SubLObject var32 = Numbers.subtract(var31, var30);
        SubLObject var33 = Numbers.expt((SubLObject)module0031.TWO_INTEGER, var30);
        SubLObject var34 = (SubLObject)module0031.NIL;
        SubLObject var35;
        SubLObject var36;
        for (var35 = (SubLObject)module0031.NIL, var35 = (SubLObject)module0031.ZERO_INTEGER; var35.numL(var32); var35 = Numbers.add(var35, (SubLObject)module0031.ONE_INTEGER)) {
            var36 = Numbers.integerDivide(Numbers.multiply(var33, (SubLObject)module0031.FOUR_INTEGER), (SubLObject)module0031.FIVE_INTEGER);
            var34 = conses_high.acons(var33, var36, var34);
            var33 = Numbers.add(var33, var33);
        }
        return Sequences.nreverse(var34);
    }
    
    public static SubLObject f1663(final SubLObject var37) {
        final SubLObject var38 = Numbers.integerDivide(Numbers.multiply(var37, (SubLObject)module0031.FOUR_INTEGER), (SubLObject)module0031.THREE_INTEGER);
        SubLObject var39 = (SubLObject)module0031.NIL;
        SubLObject var40 = (SubLObject)module0031.NIL;
        if (module0031.NIL == var40) {
            SubLObject var41 = module0031.$g865$.getGlobalValue();
            SubLObject var42 = (SubLObject)module0031.NIL;
            var42 = var41.first();
            while (module0031.NIL == var40 && module0031.NIL != var41) {
                SubLObject var44;
                final SubLObject var43 = var44 = var42;
                SubLObject var45 = (SubLObject)module0031.NIL;
                SubLObject var46 = (SubLObject)module0031.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var44, var43, (SubLObject)module0031.$ic42$);
                var45 = var44.first();
                var44 = (var46 = var44.rest());
                var39 = var45;
                var40 = Numbers.numL(var38, var45);
                var41 = var41.rest();
                var42 = var41.first();
            }
        }
        return var39;
    }
    
    public static SubLObject f1664() {
        return conses_high.last(module0031.$g865$.getGlobalValue(), (SubLObject)module0031.UNPROVIDED).first();
    }
    
    public static SubLObject f1665(final SubLObject var20, final SubLObject var45) {
        final SubLObject var46 = f1663(var45);
        f1666(var20, var46);
        f1653(var20, (SubLObject)module0031.ZERO_INTEGER);
        return var20;
    }
    
    public static SubLObject f1666(final SubLObject var20, final SubLObject var46) {
        f1651(var20, Vectors.make_vector(var46, module0031.$g863$.getGlobalValue()));
        f1654(var20, Vectors.make_vector(var46, module0031.$g864$.getGlobalValue()));
        return var20;
    }
    
    public static SubLObject f1667(final SubLObject var20) {
        final SubLObject var21 = f1647(var20);
        final SubLObject var22 = f1650(var20);
        final SubLObject var23 = f1659(var20);
        final SubLObject var24 = Numbers.add(var23, var23);
        f1666(var20, var24);
        SubLObject var25;
        SubLObject var26;
        SubLObject var27;
        for (var25 = (SubLObject)module0031.NIL, var25 = (SubLObject)module0031.ZERO_INTEGER; var25.numL(var23); var25 = Numbers.add(var25, (SubLObject)module0031.ONE_INTEGER)) {
            var26 = Vectors.aref(var21, var25);
            if (!var26.eql(module0031.$g863$.getGlobalValue())) {
                var27 = Vectors.aref(var22, var25);
                f1668(var26, var27, var20);
            }
        }
        return var20;
    }
    
    public static SubLObject f1669(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        final SubLObject var22 = f1659(var20);
        final SubLObject var23 = f1670(var20);
        final SubLObject var24 = conses_high.assoc(var22, module0031.$g865$.getGlobalValue(), (SubLObject)module0031.UNPROVIDED, (SubLObject)module0031.UNPROVIDED);
        if (module0031.NIL == Errors.$ignore_mustsP$.getDynamicValue(var21) && !var24.isCons()) {
            Errors.error((SubLObject)module0031.$ic44$, var22, f1664());
        }
        SubLObject var26;
        final SubLObject var25 = var26 = var24;
        SubLObject var27 = (SubLObject)module0031.NIL;
        SubLObject var28 = (SubLObject)module0031.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var26, var25, (SubLObject)module0031.$ic45$);
        var27 = var26.first();
        var26 = (var28 = var26.rest());
        if (!var23.numL(var28)) {
            f1667(var20);
        }
        return var20;
    }
    
    public static SubLObject f1671(final SubLObject var20, final SubLObject var58) {
        Vectors.set_aref(f1647(var20), var58, module0031.$g863$.getGlobalValue());
        Vectors.set_aref(f1650(var20), var58, module0031.$g864$.getGlobalValue());
        return var20;
    }
    
    public static SubLObject f1672(final SubLObject var20) {
        SubLObject var21;
        SubLObject var22;
        for (var21 = f1659(var20), var22 = (SubLObject)module0031.NIL, var22 = (SubLObject)module0031.ZERO_INTEGER; var22.numL(var21); var22 = Numbers.add(var22, (SubLObject)module0031.ONE_INTEGER)) {
            f1671(var20, var22);
        }
        return var20;
    }
    
    public static SubLObject f1673(final SubLObject var59, final SubLObject var20) {
        final SubLObject var60 = Sxhash.sxhash(var59);
        final SubLObject var61 = f1674(var60, var20);
        return Values.values(var60, var61);
    }
    
    public static SubLObject f1674(final SubLObject var60, final SubLObject var20) {
        final SubLObject var61 = f1659(var20);
        final SubLObject var62 = Numbers.subtract(var61, (SubLObject)module0031.ONE_INTEGER);
        return Numbers.logand(Numbers.fixnumMultiply(Numbers.logand(var60, var62), module0031.$g861$.getGlobalValue()), var62);
    }
    
    public static SubLObject f1675(final SubLObject var21, final SubLObject var22) {
        SubLObject var24;
        final SubLObject var23 = var24 = var21.rest();
        SubLObject var25 = (SubLObject)module0031.NIL;
        SubLObject var26 = (SubLObject)module0031.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)module0031.$ic48$);
        var25 = var24.first();
        var24 = var24.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)module0031.$ic48$);
        var26 = var24.first();
        var24 = var24.rest();
        if (module0031.NIL == var24) {
            return (SubLObject)ConsesLow.list((SubLObject)module0031.$ic49$, (SubLObject)ConsesLow.listS((SubLObject)module0031.$ic50$, var25, (SubLObject)module0031.$ic51$), (SubLObject)ConsesLow.list((SubLObject)module0031.$ic52$, (SubLObject)ConsesLow.list((SubLObject)module0031.$ic53$, var25), (SubLObject)ConsesLow.list((SubLObject)module0031.$ic54$, var25, var26)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var23, (SubLObject)module0031.$ic48$);
        return (SubLObject)module0031.NIL;
    }
    
    public static SubLObject f1676(final SubLObject var21, final SubLObject var22) {
        SubLObject var24;
        final SubLObject var23 = var24 = var21.rest();
        SubLObject var25 = (SubLObject)module0031.NIL;
        SubLObject var26 = (SubLObject)module0031.NIL;
        SubLObject var27 = (SubLObject)module0031.NIL;
        SubLObject var28 = (SubLObject)module0031.NIL;
        SubLObject var29 = (SubLObject)module0031.NIL;
        SubLObject var30 = (SubLObject)module0031.NIL;
        SubLObject var31 = (SubLObject)module0031.NIL;
        SubLObject var32 = (SubLObject)module0031.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)module0031.$ic55$);
        var25 = var24.first();
        var24 = var24.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)module0031.$ic55$);
        var26 = var24.first();
        var24 = var24.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)module0031.$ic55$);
        var27 = var24.first();
        var24 = var24.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)module0031.$ic55$);
        var28 = var24.first();
        var24 = var24.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)module0031.$ic55$);
        var29 = var24.first();
        var24 = var24.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)module0031.$ic55$);
        var30 = var24.first();
        var24 = var24.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)module0031.$ic55$);
        var31 = var24.first();
        var24 = var24.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)module0031.$ic55$);
        var32 = var24.first();
        var24 = var24.rest();
        if (module0031.NIL == var24) {
            return (SubLObject)ConsesLow.list((SubLObject)module0031.$ic56$, (SubLObject)module0031.$ic57$, (SubLObject)ConsesLow.list((SubLObject)module0031.$ic58$, (SubLObject)module0031.$ic59$, (SubLObject)ConsesLow.list((SubLObject)module0031.$ic56$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0031.$ic60$, (SubLObject)ConsesLow.list((SubLObject)module0031.$ic61$, var28, var31))), (SubLObject)ConsesLow.list((SubLObject)module0031.$ic62$, (SubLObject)module0031.$ic63$, reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)module0031.$ic64$, (SubLObject)ConsesLow.list((SubLObject)module0031.$ic65$, var27, (SubLObject)ConsesLow.list((SubLObject)module0031.$ic61$, var29, var31)), (SubLObject)ConsesLow.listS(var25, var26, (SubLObject)module0031.$ic66$)), (SubLObject)module0031.$ic67$), reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)module0031.$ic65$, var31, var32), (SubLObject)module0031.$ic68$), (SubLObject)ConsesLow.list((SubLObject)module0031.T, (SubLObject)ConsesLow.list((SubLObject)module0031.$ic69$, var31, var30))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var23, (SubLObject)module0031.$ic55$);
        return (SubLObject)module0031.NIL;
    }
    
    public static SubLObject f1677(final SubLObject var59, final SubLObject var60, final SubLObject var67, final SubLObject var68, final SubLObject var46, SubLObject var58, final SubLObject var69) {
        SubLObject var70 = (SubLObject)module0031.NIL;
        while (module0031.NIL == var70) {
            final SubLObject var71 = Vectors.aref(var67, var58);
            if (var71.eql(module0031.$g863$.getGlobalValue())) {
                var70 = (SubLObject)module0031.T;
            }
            else if (var60.numE(Vectors.aref(var68, var58)) && var59.eql(var71)) {
                var70 = (SubLObject)module0031.T;
            }
            else {
                if (var58.numE(var69)) {
                    return (SubLObject)module0031.$ic71$;
                }
                var58 = Numbers.subtract(var58, module0031.$g862$.getGlobalValue());
                if (!var58.isNegative()) {
                    continue;
                }
                var58 = Numbers.add(var58, var46);
            }
        }
        return var58;
    }
    
    public static SubLObject f1678(final SubLObject var59, final SubLObject var60, final SubLObject var67, final SubLObject var68, final SubLObject var46, SubLObject var58, final SubLObject var69) {
        SubLObject var70 = (SubLObject)module0031.NIL;
        while (module0031.NIL == var70) {
            final SubLObject var71 = Vectors.aref(var67, var58);
            if (var71.eql(module0031.$g863$.getGlobalValue())) {
                var70 = (SubLObject)module0031.T;
            }
            else if (var60.numE(Vectors.aref(var68, var58)) && var59.eql(var71)) {
                var70 = (SubLObject)module0031.T;
            }
            else {
                if (var58.numE(var69)) {
                    return (SubLObject)module0031.$ic71$;
                }
                var58 = Numbers.subtract(var58, module0031.$g862$.getGlobalValue());
                if (!var58.isNegative()) {
                    continue;
                }
                var58 = Numbers.add(var58, var46);
            }
        }
        return var58;
    }
    
    public static SubLObject f1679(final SubLObject var59, final SubLObject var60, final SubLObject var67, final SubLObject var68, final SubLObject var46, SubLObject var58, final SubLObject var69) {
        SubLObject var70 = (SubLObject)module0031.NIL;
        while (module0031.NIL == var70) {
            final SubLObject var71 = Vectors.aref(var67, var58);
            if (var71.eql(module0031.$g863$.getGlobalValue())) {
                var70 = (SubLObject)module0031.T;
            }
            else if (var60.numE(Vectors.aref(var68, var58)) && var59.equal(var71)) {
                var70 = (SubLObject)module0031.T;
            }
            else {
                if (var58.numE(var69)) {
                    return (SubLObject)module0031.$ic71$;
                }
                var58 = Numbers.subtract(var58, module0031.$g862$.getGlobalValue());
                if (!var58.isNegative()) {
                    continue;
                }
                var58 = Numbers.add(var58, var46);
            }
        }
        return var58;
    }
    
    public static SubLObject f1680(final SubLObject var59, final SubLObject var60, final SubLObject var67, final SubLObject var68, final SubLObject var46, SubLObject var58, final SubLObject var69) {
        SubLObject var70 = (SubLObject)module0031.NIL;
        while (module0031.NIL == var70) {
            final SubLObject var71 = Vectors.aref(var67, var58);
            if (var71.eql(module0031.$g863$.getGlobalValue())) {
                var70 = (SubLObject)module0031.T;
            }
            else if (var60.numE(Vectors.aref(var68, var58)) && var59.equalp(var71)) {
                var70 = (SubLObject)module0031.T;
            }
            else {
                if (var58.numE(var69)) {
                    return (SubLObject)module0031.$ic71$;
                }
                var58 = Numbers.subtract(var58, module0031.$g862$.getGlobalValue());
                if (!var58.isNegative()) {
                    continue;
                }
                var58 = Numbers.add(var58, var46);
            }
        }
        return var58;
    }
    
    public static SubLObject f1681(final SubLObject var59, final SubLObject var60, final SubLObject var20) {
        final SubLObject var61 = f1658(var20);
        final SubLObject var62 = f1647(var20);
        final SubLObject var63 = f1650(var20);
        final SubLObject var64 = f1659(var20);
        final SubLObject var65 = f1674(var60, var20);
        SubLObject var66 = Numbers.add(var65, module0031.$g862$.getGlobalValue());
        if (var66.numG(var64)) {
            var66 = Numbers.subtract(var66, var64);
        }
        final SubLObject var67 = var61;
        if (var67.eql((SubLObject)module0031.$ic72$) || var67.eql((SubLObject)module0031.EQ)) {
            return f1677(var59, var60, var62, var63, var64, var65, var66);
        }
        if (var67.eql((SubLObject)module0031.$ic72$) || var67.eql((SubLObject)module0031.EQL)) {
            return f1678(var59, var60, var62, var63, var64, var65, var66);
        }
        if (var67.eql((SubLObject)module0031.$ic72$) || var67.eql((SubLObject)module0031.EQUAL)) {
            return f1679(var59, var60, var62, var63, var64, var65, var66);
        }
        if (var67.eql((SubLObject)module0031.$ic72$) || var67.eql((SubLObject)module0031.EQUALP)) {
            return f1680(var59, var60, var62, var63, var64, var65, var66);
        }
        Errors.error((SubLObject)module0031.$ic73$, var61);
        return (SubLObject)module0031.NIL;
    }
    
    public static SubLObject f1682(final SubLObject var59, final SubLObject var20) {
        return f1681(var59, Sxhash.sxhash(var59), var20);
    }
    
    public static SubLObject f1683(final SubLObject var25) {
        return Equality.eq(var25, (SubLObject)module0031.$ic71$);
    }
    
    public static SubLObject f1668(final SubLObject var50, final SubLObject var51, final SubLObject var20) {
        final SubLObject var52 = f1681(var50, var51, var20);
        if (!var52.isNumber()) {
            Errors.error((SubLObject)module0031.$ic75$, var20);
        }
        final SubLObject var53 = f1647(var20);
        final SubLObject var54 = f1650(var20);
        Vectors.set_aref(var53, var52, var50);
        Vectors.set_aref(var54, var52, var51);
        return var20;
    }
    
    public static SubLObject f1684(SubLObject var71, final SubLObject var20) {
        final SubLObject var72 = f1659(var20);
        final SubLObject var73 = f1647(var20);
        final SubLObject var74 = f1650(var20);
        SubLObject var75 = var71;
        SubLObject var76 = (SubLObject)module0031.NIL;
        f1671(var20, var75);
        while (module0031.NIL == var76) {
            var71 = Numbers.subtract(var71, module0031.$g862$.getGlobalValue());
            if (var71.isNegative()) {
                var71 = Numbers.add(var71, var72);
            }
            final SubLObject var77 = Vectors.aref(var73, var71);
            if (var77.eql(module0031.$g863$.getGlobalValue())) {
                var76 = (SubLObject)module0031.T;
            }
            else {
                final SubLObject var78 = Vectors.aref(var74, var71);
                final SubLObject var79 = f1681(var77, var78, var20);
                if (!var79.numE(var75)) {
                    continue;
                }
                Vectors.set_aref(var73, var75, var77);
                Vectors.set_aref(var74, var75, var78);
                var75 = var71;
                f1671(var20, var75);
            }
        }
        return var20;
    }
    
    public static SubLObject f1685(final SubLObject var33, SubLObject var74) {
        if (var74 == module0031.UNPROVIDED) {
            var74 = Symbols.symbol_function((SubLObject)module0031.EQL);
        }
        assert module0031.NIL != Types.fixnump(var33) : var33;
        assert module0031.NIL != module0030.f1591(var74) : var74;
        if (var74.isFunction()) {
            var74 = module0030.f1592(var74);
        }
        final SubLObject var75 = f1655((SubLObject)module0031.UNPROVIDED);
        f1665(var75, var33);
        f1652(var75, var74);
        return var75;
    }
    
    public static SubLObject f1686(final SubLObject var20) {
        assert module0031.NIL != f1646(var20) : var20;
        f1672(var20);
        f1653(var20, (SubLObject)module0031.ZERO_INTEGER);
        return var20;
    }
    
    public static SubLObject f1658(final SubLObject var20) {
        assert module0031.NIL != f1646(var20) : var20;
        final SubLObject var21 = f1648(var20);
        if (var21.isFunction()) {
            f1652(var20, module0030.f1592(var21));
            return f1658(var20);
        }
        return var21;
    }
    
    public static SubLObject f1670(final SubLObject var20) {
        assert module0031.NIL != f1646(var20) : var20;
        return f1649(var20);
    }
    
    public static SubLObject f1687(final SubLObject var20) {
        assert module0031.NIL != f1646(var20) : var20;
        return f1659(var20);
    }
    
    public static SubLObject f1688(final SubLObject var59, final SubLObject var20) {
        final SubLObject var60 = f1689(var59, var20);
        return module0035.sublisp_boolean(var60);
    }
    
    public static SubLObject f1689(final SubLObject var59, final SubLObject var20) {
        assert module0031.NIL != f1646(var20) : var20;
        final SubLObject var60 = f1682(var59, var20);
        if (!var60.isFixnum()) {
            return (SubLObject)module0031.NIL;
        }
        final SubLObject var61 = Vectors.aref(f1647(var20), var60);
        if (var61.eql(module0031.$g863$.getGlobalValue())) {
            return (SubLObject)module0031.NIL;
        }
        return var61;
    }
    
    public static SubLObject f1690(final SubLObject var59, final SubLObject var20) {
        assert module0031.NIL != f1646(var20) : var20;
        final SubLObject var60 = Sxhash.sxhash(var59);
        SubLObject var61 = f1681(var59, var60, var20);
        if (module0031.NIL != f1683(var61)) {
            f1667(var20);
            var61 = f1681(var59, var60, var20);
            if (module0031.NIL != f1683(var61)) {
                Errors.error((SubLObject)module0031.$ic78$, var20);
            }
        }
        if (Vectors.aref(f1647(var20), var61).eql(module0031.$g863$.getGlobalValue())) {
            f1653(var20, Numbers.add(f1649(var20), (SubLObject)module0031.ONE_INTEGER));
            Vectors.set_aref(f1647(var20), var61, var59);
            Vectors.set_aref(f1650(var20), var61, var60);
            f1669(var20);
        }
        return var59;
    }
    
    public static SubLObject f1691(final SubLObject var59, final SubLObject var20) {
        assert module0031.NIL != f1646(var20) : var20;
        final SubLObject var60 = Sxhash.sxhash(var59);
        final SubLObject var61 = f1681(var59, var60, var20);
        if (var61.isFixnum() && !Vectors.aref(f1647(var20), var61).eql(module0031.$g863$.getGlobalValue())) {
            f1653(var20, Numbers.subtract(f1649(var20), (SubLObject)module0031.ONE_INTEGER));
            f1671(var20, var61);
            f1684(var61, var20);
            return (SubLObject)module0031.T;
        }
        return (SubLObject)module0031.NIL;
    }
    
    public static SubLObject f1692(final SubLObject var20) {
        assert module0031.NIL != f1646(var20) : var20;
        return module0052.f3781(module0052.f3726(f1647(var20)), (SubLObject)module0031.$ic79$, (SubLObject)module0031.UNPROVIDED);
    }
    
    public static SubLObject f1693(final SubLObject var59) {
        return (SubLObject)SubLObjectFactory.makeBoolean(!var59.eql(module0031.$g863$.getGlobalValue()));
    }
    
    public static SubLObject f1694(final SubLObject var21, final SubLObject var22) {
        SubLObject var24;
        final SubLObject var23 = var24 = var21.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)module0031.$ic80$);
        final SubLObject var25 = var24.rest();
        var24 = var24.first();
        SubLObject var26 = (SubLObject)module0031.NIL;
        SubLObject var27 = (SubLObject)module0031.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)module0031.$ic80$);
        var26 = var24.first();
        var24 = var24.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)module0031.$ic80$);
        var27 = var24.first();
        var24 = var24.rest();
        SubLObject var28 = (SubLObject)module0031.NIL;
        SubLObject var29 = var24;
        SubLObject var30 = (SubLObject)module0031.NIL;
        SubLObject var83_84 = (SubLObject)module0031.NIL;
        while (module0031.NIL != var29) {
            cdestructuring_bind.destructuring_bind_must_consp(var29, var23, (SubLObject)module0031.$ic80$);
            var83_84 = var29.first();
            var29 = var29.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var29, var23, (SubLObject)module0031.$ic80$);
            if (module0031.NIL == conses_high.member(var83_84, (SubLObject)module0031.$ic81$, (SubLObject)module0031.UNPROVIDED, (SubLObject)module0031.UNPROVIDED)) {
                var30 = (SubLObject)module0031.T;
            }
            if (var83_84 == module0031.$ic82$) {
                var28 = var29.first();
            }
            var29 = var29.rest();
        }
        if (module0031.NIL != var30 && module0031.NIL == var28) {
            cdestructuring_bind.cdestructuring_bind_error(var23, (SubLObject)module0031.$ic80$);
        }
        final SubLObject var31 = cdestructuring_bind.property_list_member((SubLObject)module0031.$ic83$, var24);
        final SubLObject var32 = (SubLObject)((module0031.NIL != var31) ? conses_high.cadr(var31) : module0031.NIL);
        final SubLObject var33;
        var24 = (var33 = var25);
        return (SubLObject)ConsesLow.list((SubLObject)module0031.$ic84$, (SubLObject)ConsesLow.list(var26, (SubLObject)ConsesLow.list((SubLObject)module0031.$ic85$, var27), (SubLObject)module0031.$ic83$, var32), (SubLObject)ConsesLow.listS((SubLObject)module0031.$ic52$, (SubLObject)ConsesLow.list((SubLObject)module0031.$ic86$, var26), ConsesLow.append(var33, (SubLObject)module0031.NIL)));
    }
    
    public static SubLObject f1695(final SubLObject var21, final SubLObject var22) {
        SubLObject var24;
        final SubLObject var23 = var24 = var21.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)module0031.$ic87$);
        final SubLObject var25 = var24.rest();
        var24 = var24.first();
        SubLObject var26 = (SubLObject)module0031.NIL;
        SubLObject var27 = (SubLObject)module0031.NIL;
        SubLObject var28 = (SubLObject)module0031.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)module0031.$ic87$);
        var26 = var24.first();
        var24 = var24.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)module0031.$ic87$);
        var27 = var24.first();
        var24 = var24.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)module0031.$ic87$);
        var28 = var24.first();
        var24 = var24.rest();
        if (module0031.NIL == var24) {
            final SubLObject var29;
            var24 = (var29 = var25);
            return (SubLObject)ConsesLow.listS((SubLObject)module0031.$ic88$, (SubLObject)ConsesLow.list(var26, var27, (SubLObject)module0031.$ic83$, var28), ConsesLow.append(var29, (SubLObject)module0031.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var23, (SubLObject)module0031.$ic87$);
        return (SubLObject)module0031.NIL;
    }
    
    public static SubLObject f1696(final SubLObject var20) {
        assert module0031.NIL != f1646(var20) : var20;
        return f1647(var20);
    }
    
    public static SubLObject f1697(final SubLObject var59) {
        return (SubLObject)SubLObjectFactory.makeBoolean(!var59.eql(module0031.$g863$.getGlobalValue()));
    }
    
    public static SubLObject f1698(final SubLObject var20, final SubLObject var58) {
        return (SubLObject)SubLObjectFactory.makeBoolean(!Vectors.aref(f1647(var20), var58).eql(module0031.$g863$.getGlobalValue()));
    }
    
    public static SubLObject f1699(final SubLObject var20, final SubLObject var58) {
        return Vectors.aref(f1647(var20), var58);
    }
    
    public static SubLObject f1700(final SubLObject var90, final SubLObject var20) {
        assert module0031.NIL != f1646(var20) : var20;
        assert module0031.NIL != Types.function_spec_p(var90) : var90;
        final SubLObject var91 = f1696(var20);
        final SubLObject var92 = (SubLObject)module0031.NIL;
        SubLObject var93;
        SubLObject var94;
        SubLObject var95;
        SubLObject var96;
        for (var93 = Sequences.length(var91), var94 = (SubLObject)module0031.NIL, var94 = (SubLObject)module0031.ZERO_INTEGER; var94.numL(var93); var94 = Numbers.add(var94, (SubLObject)module0031.ONE_INTEGER)) {
            var95 = ((module0031.NIL != var92) ? Numbers.subtract(var93, var94, (SubLObject)module0031.ONE_INTEGER) : var94);
            var96 = Vectors.aref(var91, var95);
            if (module0031.NIL != f1697(var96)) {
                Functions.funcall(var90, var96);
            }
        }
        return (SubLObject)module0031.NIL;
    }
    
    public static SubLObject f1701(final SubLObject var13, final SubLObject var2) {
        return f1702(var13, var2);
    }
    
    public static SubLObject f1702(final SubLObject var13, final SubLObject var2) {
        module0021.f1086(module0031.$g866$.getGlobalValue(), var2);
        final SubLObject var14 = f1658(var13);
        final SubLObject var15 = f1670(var13);
        module0021.f1038(var14, var2);
        module0021.f1038(var15, var2);
        final SubLObject var16 = f1696(var13);
        final SubLObject var17 = (SubLObject)module0031.NIL;
        SubLObject var18;
        SubLObject var19;
        SubLObject var20;
        SubLObject var21;
        for (var18 = Sequences.length(var16), var19 = (SubLObject)module0031.NIL, var19 = (SubLObject)module0031.ZERO_INTEGER; var19.numL(var18); var19 = Numbers.add(var19, (SubLObject)module0031.ONE_INTEGER)) {
            var20 = ((module0031.NIL != var17) ? Numbers.subtract(var18, var19, (SubLObject)module0031.ONE_INTEGER) : var19);
            var21 = Vectors.aref(var16, var20);
            if (module0031.NIL != f1697(var21)) {
                module0021.f1038(var21, var2);
            }
        }
        return var13;
    }
    
    public static SubLObject f1703(final SubLObject var2) {
        final SubLObject var3 = module0021.f1060(var2, (SubLObject)module0031.UNPROVIDED, (SubLObject)module0031.UNPROVIDED);
        final SubLObject var4 = module0021.f1060(var2, (SubLObject)module0031.UNPROVIDED, (SubLObject)module0031.UNPROVIDED);
        SubLObject var5 = (SubLObject)module0031.NIL;
        SubLObject var6 = (SubLObject)module0031.NIL;
        final SubLObject var7 = var3;
        if (var7.eql((SubLObject)module0031.EQ) || var7.eql((SubLObject)module0031.EQL) || var7.eql((SubLObject)module0031.EQUAL) || var7.eql((SubLObject)module0031.EQUALP)) {
            var5 = Symbols.symbol_function(var3);
        }
        var6 = f1685(var4, var5);
        SubLObject var8;
        SubLObject var9;
        for (var8 = (SubLObject)module0031.NIL, var8 = (SubLObject)module0031.ZERO_INTEGER; var8.numL(var4); var8 = Numbers.add(var8, (SubLObject)module0031.ONE_INTEGER)) {
            var9 = module0021.f1060(var2, (SubLObject)module0031.UNPROVIDED, (SubLObject)module0031.UNPROVIDED);
            f1690(var9, var6);
        }
        return var6;
    }
    
    public static SubLObject f1704(final SubLObject var20) {
        assert module0031.NIL != f1646(var20) : var20;
        final SubLObject var21 = f1670(var20);
        final SubLObject var22 = f1658(var20);
        final SubLObject var23 = f1685(var21, var22);
        final SubLObject var24 = f1696(var20);
        final SubLObject var25 = (SubLObject)module0031.NIL;
        SubLObject var26;
        SubLObject var27;
        SubLObject var28;
        SubLObject var29;
        for (var26 = Sequences.length(var24), var27 = (SubLObject)module0031.NIL, var27 = (SubLObject)module0031.ZERO_INTEGER; var27.numL(var26); var27 = Numbers.add(var27, (SubLObject)module0031.ONE_INTEGER)) {
            var28 = ((module0031.NIL != var25) ? Numbers.subtract(var26, var27, (SubLObject)module0031.ONE_INTEGER) : var27);
            var29 = Vectors.aref(var24, var28);
            if (module0031.NIL != f1697(var29)) {
                f1690(var29, var23);
            }
        }
        return var23;
    }
    
    public static SubLObject f1705(final SubLObject var20) {
        assert module0031.NIL != f1646(var20) : var20;
        final SubLObject var21 = f1670(var20);
        final SubLObject var22 = f1687(var20);
        if (var21.isZero()) {
            return (SubLObject)module0031.NIL;
        }
        if (module0048.f3274(var21).numGE(var22)) {
            SubLObject var23;
            do {
                var23 = Vectors.aref(f1647(var20), random.random(var22));
            } while (var23.eql(module0031.$g863$.getGlobalValue()));
            return var23;
        }
        SubLObject var24 = random.random(var21);
        final SubLObject var25 = f1696(var20);
        final SubLObject var26 = (SubLObject)module0031.NIL;
        SubLObject var27;
        SubLObject var28;
        SubLObject var29;
        SubLObject var30;
        for (var27 = Sequences.length(var25), var28 = (SubLObject)module0031.NIL, var28 = (SubLObject)module0031.ZERO_INTEGER; var28.numL(var27); var28 = Numbers.add(var28, (SubLObject)module0031.ONE_INTEGER)) {
            var29 = ((module0031.NIL != var26) ? Numbers.subtract(var27, var28, (SubLObject)module0031.ONE_INTEGER) : var28);
            var30 = Vectors.aref(var25, var29);
            if (module0031.NIL != f1697(var30)) {
                if (var24.isZero()) {
                    return var30;
                }
                var24 = Numbers.subtract(var24, (SubLObject)module0031.ONE_INTEGER);
            }
        }
        return (SubLObject)module0031.NIL;
    }
    
    public static SubLObject f1706() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1644", "S#2886", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1646", "S#2881", 1, 0, false);
        new $f1646$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1647", "S#2887", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1648", "S#2888", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1649", "S#2889", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1650", "S#2890", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1651", "S#2891", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1652", "S#2892", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1653", "S#2893", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1654", "S#2894", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1655", "S#2895", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1656", "S#2896", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1657", "S#2897", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1645", "S#2898", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1659", "S#2899", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0031", "f1660", "S#2900");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0031", "f1661", "S#2901");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1662", "S#2902", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1663", "S#2903", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1664", "S#2904", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1665", "S#2905", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1666", "S#2906", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1667", "S#2907", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1669", "S#2908", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1671", "S#2909", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1672", "S#2910", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1673", "S#2911", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1674", "S#2912", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0031", "f1675", "S#2913");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0031", "f1676", "S#2914");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1677", "S#2915", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1678", "S#2916", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1679", "S#2917", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1680", "S#2918", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1681", "S#2919", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1682", "S#2920", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1683", "S#2921", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1668", "S#2922", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1684", "S#2923", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1685", "S#2924", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1686", "S#2925", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1658", "S#2926", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1670", "S#2927", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1687", "S#2928", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1688", "S#2929", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1689", "S#2930", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1690", "S#2931", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1691", "S#2932", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1692", "S#2933", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1693", "S#2884", 1, 0, false);
        new $f1693$UnaryFunction();
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0031", "f1694", "S#2934");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0031", "f1695", "S#2935");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1696", "S#2936", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1697", "S#2937", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1698", "S#2938", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1699", "S#2939", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1700", "S#2940", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1701", "S#2941", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1702", "S#2942", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1703", "S#2943", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1704", "S#2944", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0031", "f1705", "S#2945", 1, 0, false);
        return (SubLObject)module0031.NIL;
    }
    
    public static SubLObject f1707() {
        module0031.$g860$ = SubLFiles.defconstant("S#2946", (SubLObject)module0031.$ic0$);
        module0031.$g861$ = SubLFiles.defconstant("S#2947", (SubLObject)module0031.$ic34$);
        module0031.$g862$ = SubLFiles.defconstant("S#2948", (SubLObject)module0031.THIRTEEN_INTEGER);
        module0031.$g863$ = SubLFiles.deflexical("S#2949", (module0031.NIL != Symbols.boundp((SubLObject)module0031.$ic35$)) ? module0031.$g863$.getGlobalValue() : Symbols.make_symbol((SubLObject)module0031.$ic36$));
        module0031.$g864$ = SubLFiles.deflexical("S#2950", (SubLObject)((module0031.NIL != Symbols.boundp((SubLObject)module0031.$ic37$)) ? module0031.$g864$.getGlobalValue() : module0031.NIL));
        module0031.$g865$ = SubLFiles.deflexical("S#2951", f1662(module0031.$g862$.getGlobalValue(), Numbers.max(Numbers.$most_positive_fixnum$.getGlobalValue(), Numbers.expt((SubLObject)module0031.TWO_INTEGER, (SubLObject)module0031.$ic41$))));
        module0031.$g866$ = SubLFiles.defconstant("S#2952", (SubLObject)module0031.$ic95$);
        return (SubLObject)module0031.NIL;
    }
    
    public static SubLObject f1708() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0031.$g860$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0031.$ic8$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0031.$ic9$);
        Structures.def_csetf((SubLObject)module0031.$ic10$, (SubLObject)module0031.$ic11$);
        Structures.def_csetf((SubLObject)module0031.$ic12$, (SubLObject)module0031.$ic13$);
        Structures.def_csetf((SubLObject)module0031.$ic14$, (SubLObject)module0031.$ic15$);
        Structures.def_csetf((SubLObject)module0031.$ic16$, (SubLObject)module0031.$ic17$);
        Equality.identity((SubLObject)module0031.$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0031.$g860$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0031.$ic27$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0031.$ic33$);
        module0003.f57((SubLObject)module0031.$ic35$);
        module0003.f57((SubLObject)module0031.$ic37$);
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0031.$ic43$);
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0031.$ic46$);
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0031.$ic47$);
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0031.$ic70$);
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0031.$ic74$);
        module0002.f50((SubLObject)module0031.$ic85$, (SubLObject)module0031.$ic89$);
        module0002.f50((SubLObject)module0031.$ic86$, (SubLObject)module0031.$ic89$);
        module0002.f35((SubLObject)module0031.$ic90$, (SubLObject)module0031.$ic91$);
        module0002.f35((SubLObject)module0031.$ic92$, (SubLObject)module0031.$ic93$);
        module0021.f1098(module0031.$g866$.getGlobalValue(), (SubLObject)module0031.$ic96$);
        Structures.register_method(module0021.$g749$.getGlobalValue(), module0031.$g860$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0031.$ic97$));
        return (SubLObject)module0031.NIL;
    }
    
    public void declareFunctions() {
        f1706();
    }
    
    public void initializeVariables() {
        f1707();
    }
    
    public void runTopLevelForms() {
        f1708();
    }
    
    static {
        me = (SubLFile)new module0031();
        module0031.$g860$ = null;
        module0031.$g861$ = null;
        module0031.$g862$ = null;
        module0031.$g863$ = null;
        module0031.$g864$ = null;
        module0031.$g865$ = null;
        module0031.$g866$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#2880", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#2881", "CYC");
        $ic2$ = SubLObjectFactory.makeInteger(137);
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2953", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#122", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("S#2954", "CYC"));
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NODES"), (SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeKeyword("COUNT"), (SubLObject)SubLObjectFactory.makeKeyword("HASH-STASH"));
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2887", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2888", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2889", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2890", "CYC"));
        $ic6$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2891", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2892", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2893", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2894", "CYC"));
        $ic7$ = SubLObjectFactory.makeSymbol("S#2898", "CYC");
        $ic8$ = SubLObjectFactory.makeSymbol("S#2886", "CYC");
        $ic9$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#2881", "CYC"));
        $ic10$ = SubLObjectFactory.makeSymbol("S#2887", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#2891", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#2888", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#2892", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#2889", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#2893", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#2890", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#2894", "CYC");
        $ic18$ = SubLObjectFactory.makeKeyword("NODES");
        $ic19$ = SubLObjectFactory.makeKeyword("TEST");
        $ic20$ = SubLObjectFactory.makeKeyword("COUNT");
        $ic21$ = SubLObjectFactory.makeKeyword("HASH-STASH");
        $ic22$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic23$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic24$ = SubLObjectFactory.makeSymbol("S#2895", "CYC");
        $ic25$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic26$ = SubLObjectFactory.makeKeyword("END");
        $ic27$ = SubLObjectFactory.makeSymbol("S#2897", "CYC");
        $ic28$ = SubLObjectFactory.makeString("#<");
        $ic29$ = SubLObjectFactory.makeKeyword("STREAM");
        $ic30$ = SubLObjectFactory.makeString(" ");
        $ic31$ = SubLObjectFactory.makeString("/");
        $ic32$ = SubLObjectFactory.makeKeyword("BASE");
        $ic33$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE"), (SubLObject)SubLObjectFactory.makeSymbol("S#2899", "CYC"));
        $ic34$ = SubLObjectFactory.makeInteger(10009);
        $ic35$ = SubLObjectFactory.makeSymbol("S#2949", "CYC");
        $ic36$ = SubLObjectFactory.makeString("The Empty KEYHASH Key");
        $ic37$ = SubLObjectFactory.makeSymbol("S#2950", "CYC");
        $ic38$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#704", "CYC"));
        $ic39$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2949", "CYC"));
        $ic40$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2950", "CYC"));
        $ic41$ = SubLObjectFactory.makeInteger(27);
        $ic42$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#2955", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2956", "CYC"));
        $ic43$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE"), (SubLObject)SubLObjectFactory.makeSymbol("S#2905", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2906", "CYC"));
        $ic44$ = SubLObjectFactory.makeString("Keyhash capacity ~A has exceeded the limit ~A for this platform.");
        $ic45$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#2957", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2958", "CYC"));
        $ic46$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE"), (SubLObject)SubLObjectFactory.makeSymbol("S#2909", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2910", "CYC"));
        $ic47$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE"), (SubLObject)SubLObjectFactory.makeSymbol("S#2911", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2912", "CYC"));
        $ic48$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#134", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2959", "CYC"));
        $ic49$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic50$ = SubLObjectFactory.makeSymbol("CDEC");
        $ic51$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2948", "CYC"));
        $ic52$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic53$ = SubLObjectFactory.makeSymbol("MINUSP");
        $ic54$ = SubLObjectFactory.makeSymbol("CINC");
        $ic55$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2960", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2961", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2953", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2954", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2959", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#134", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2962", "CYC"));
        $ic56$ = SubLObjectFactory.makeSymbol("CLET");
        $ic57$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC"));
        $ic58$ = SubLObjectFactory.makeSymbol("WHILE");
        $ic59$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC"));
        $ic60$ = SubLObjectFactory.makeSymbol("S#2963", "CYC");
        $ic61$ = SubLObjectFactory.makeSymbol("AREF");
        $ic62$ = SubLObjectFactory.makeSymbol("PCOND");
        $ic63$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2900", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2963", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC"), (SubLObject)module0031.T));
        $ic64$ = SubLObjectFactory.makeSymbol("CAND");
        $ic65$ = SubLObjectFactory.makeSymbol("=");
        $ic66$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2963", "CYC"));
        $ic67$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC"), (SubLObject)module0031.T));
        $ic68$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeKeyword("NO-NODE")));
        $ic69$ = SubLObjectFactory.makeSymbol("S#2913", "CYC");
        $ic70$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE"), (SubLObject)SubLObjectFactory.makeSymbol("S#2915", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2916", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2917", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2918", "CYC"));
        $ic71$ = SubLObjectFactory.makeKeyword("NO-NODE");
        $ic72$ = SubLObjectFactory.makeSymbol("QUOTE");
        $ic73$ = SubLObjectFactory.makeString("Unsupported test function ~s");
        $ic74$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE"), (SubLObject)SubLObjectFactory.makeSymbol("S#2920", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2921", "CYC"));
        $ic75$ = SubLObjectFactory.makeString("The keyhash ~A mysteriously overflowed.");
        $ic76$ = SubLObjectFactory.makeSymbol("FIXNUMP");
        $ic77$ = SubLObjectFactory.makeSymbol("S#2831", "CYC");
        $ic78$ = SubLObjectFactory.makeString("Cannot grow keyhash ~A any more.");
        $ic79$ = SubLObjectFactory.makeSymbol("S#2884", "CYC");
        $ic80$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2880", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic81$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic82$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic83$ = SubLObjectFactory.makeKeyword("DONE");
        $ic84$ = SubLObjectFactory.makeSymbol("DO-VECTOR");
        $ic85$ = SubLObjectFactory.makeSymbol("S#2936", "CYC");
        $ic86$ = SubLObjectFactory.makeSymbol("S#2937", "CYC");
        $ic87$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2880", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic88$ = SubLObjectFactory.makeSymbol("S#2934", "CYC");
        $ic89$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2934", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2964", "CYC"));
        $ic90$ = SubLObjectFactory.makeSymbol("S#2938", "CYC");
        $ic91$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2937", "CYC"));
        $ic92$ = SubLObjectFactory.makeSymbol("S#2939", "CYC");
        $ic93$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2936", "CYC"));
        $ic94$ = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $ic95$ = SubLObjectFactory.makeInteger(68);
        $ic96$ = SubLObjectFactory.makeSymbol("S#2943", "CYC");
        $ic97$ = SubLObjectFactory.makeSymbol("S#2941", "CYC");
    }
    
    public static final class $sX2880_native extends SubLStructNative
    {
        public SubLObject $nodes;
        public SubLObject $test;
        public SubLObject $count;
        public SubLObject $hash_stash;
        private static final SubLStructDeclNative structDecl;
        
        public $sX2880_native() {
            this.$nodes = (SubLObject)CommonSymbols.NIL;
            this.$test = (SubLObject)CommonSymbols.NIL;
            this.$count = (SubLObject)CommonSymbols.NIL;
            this.$hash_stash = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX2880_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$nodes;
        }
        
        public SubLObject getField3() {
            return this.$test;
        }
        
        public SubLObject getField4() {
            return this.$count;
        }
        
        public SubLObject getField5() {
            return this.$hash_stash;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$nodes = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$test = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$count = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$hash_stash = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX2880_native.class, module0031.$ic0$, module0031.$ic1$, module0031.$ic3$, module0031.$ic4$, new String[] { "$nodes", "$test", "$count", "$hash_stash" }, module0031.$ic5$, module0031.$ic6$, module0031.$ic7$);
        }
    }
    
    public static final class $f1646$UnaryFunction extends UnaryFunction
    {
        public $f1646$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#2881"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0031.f1646(var3);
        }
    }
    
    public static final class $f1693$UnaryFunction extends UnaryFunction
    {
        public $f1693$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#2884"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0031.f1693(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0031.class
	Total time: 255 ms
	
	Decompiled with Procyon 0.5.32.
*/