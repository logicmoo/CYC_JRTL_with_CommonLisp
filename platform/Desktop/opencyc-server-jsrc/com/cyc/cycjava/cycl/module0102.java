package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0102 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0102";
    public static final String myFingerPrint = "22ebe476cae6a5880917e009aef71c18c3b1dffd3418601ee2c16f09b0eeaa08";
    public static SubLSymbol $g1339$;
    public static SubLSymbol $g1340$;
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
    private static final SubLInteger $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLString $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLString $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLFloat $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLList $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLFloat $ic37$;
    private static final SubLInteger $ic38$;
    
    public static SubLObject f7320(final SubLObject var1, final SubLObject var2) {
        f7321(var1, var2, (SubLObject)module0102.ZERO_INTEGER);
        return (SubLObject)module0102.NIL;
    }
    
    public static SubLObject f7322(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX9231_native.class) ? module0102.T : module0102.NIL);
    }
    
    public static SubLObject f7323(final SubLObject var1) {
        assert module0102.NIL != f7322(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f7324(final SubLObject var1) {
        assert module0102.NIL != f7322(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f7325(final SubLObject var1, final SubLObject var4) {
        assert module0102.NIL != f7322(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f7326(final SubLObject var1, final SubLObject var4) {
        assert module0102.NIL != f7322(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f7327(SubLObject var5) {
        if (var5 == module0102.UNPROVIDED) {
            var5 = (SubLObject)module0102.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX9231_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0102.NIL, var7 = var5; module0102.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0102.$ic13$)) {
                f7325(var6, var9);
            }
            else if (var10.eql((SubLObject)module0102.$ic14$)) {
                f7326(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0102.$ic15$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f7328(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0102.$ic16$, (SubLObject)module0102.$ic17$, (SubLObject)module0102.TWO_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0102.$ic18$, (SubLObject)module0102.$ic13$, f7323(var11));
        Functions.funcall(var12, var11, (SubLObject)module0102.$ic18$, (SubLObject)module0102.$ic14$, f7324(var11));
        Functions.funcall(var12, var11, (SubLObject)module0102.$ic19$, (SubLObject)module0102.$ic17$, (SubLObject)module0102.TWO_INTEGER);
        return var11;
    }
    
    public static SubLObject f7329(final SubLObject var11, final SubLObject var12) {
        return f7328(var11, var12);
    }
    
    public static SubLObject f7330(SubLObject var13, SubLObject var14) {
        if (var13 == module0102.UNPROVIDED) {
            var13 = (SubLObject)module0102.EQL;
        }
        if (var14 == module0102.UNPROVIDED) {
            var14 = (SubLObject)module0102.$ic21$;
        }
        assert module0102.NIL != module0004.f105(var14) : var14;
        assert module0102.NIL != module0030.f1591(var13) : var13;
        final SubLObject var15 = f7327((SubLObject)module0102.UNPROVIDED);
        f7325(var15, Hashtables.make_hash_table(var14, var13, (SubLObject)module0102.UNPROVIDED));
        f7326(var15, Hashtables.make_hash_table(var14, var13, (SubLObject)module0102.UNPROVIDED));
        return var15;
    }
    
    public static SubLObject f7331(final SubLObject var15) {
        assert module0102.NIL != f7322(var15) : var15;
        return Hashtables.hash_table_test(f7323(var15));
    }
    
    public static SubLObject f7321(final SubLObject var15, final SubLObject var2, final SubLObject var16) {
        streams_high.write_string((SubLObject)module0102.$ic24$, var2, (SubLObject)module0102.UNPROVIDED, (SubLObject)module0102.UNPROVIDED);
        streams_high.terpri(var2);
        final SubLObject var17 = f7323(var15);
        SubLObject var18 = (SubLObject)module0102.NIL;
        SubLObject var19 = (SubLObject)module0102.NIL;
        final Iterator var20 = Hashtables.getEntrySetIterator(var17);
        try {
            while (Hashtables.iteratorHasNext(var20)) {
                final Map.Entry var21 = Hashtables.iteratorNextEntry(var20);
                var18 = Hashtables.getEntryKey(var21);
                var19 = Hashtables.getEntryValue(var21);
                print_high.princ(var18, var2);
                streams_high.write_string((SubLObject)module0102.$ic25$, var2, (SubLObject)module0102.UNPROVIDED, (SubLObject)module0102.UNPROVIDED);
                module0101.f7280(var19, var2, (SubLObject)module0102.ZERO_INTEGER);
                streams_high.terpri(var2);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var20);
        }
        streams_high.write_string((SubLObject)module0102.$ic26$, var2, (SubLObject)module0102.UNPROVIDED, (SubLObject)module0102.UNPROVIDED);
        return var15;
    }
    
    public static SubLObject f7332(final SubLObject var15) {
        assert module0102.NIL != f7322(var15) : var15;
        return Numbers.zerop(Hashtables.hash_table_count(f7323(var15)));
    }
    
    public static SubLObject f7333(final SubLObject var15) {
        assert module0102.NIL != f7322(var15) : var15;
        final SubLObject var16 = f7330((SubLObject)module0102.UNPROVIDED, (SubLObject)module0102.UNPROVIDED);
        final SubLObject var17 = f7323(var15);
        SubLObject var18 = (SubLObject)module0102.NIL;
        SubLObject var19 = (SubLObject)module0102.NIL;
        final Iterator var20 = Hashtables.getEntrySetIterator(var17);
        try {
            while (Hashtables.iteratorHasNext(var20)) {
                final Map.Entry var21 = Hashtables.iteratorNextEntry(var20);
                var18 = Hashtables.getEntryKey(var21);
                var19 = Hashtables.getEntryValue(var21);
                f7334(var16, var18, module0101.f7292(var19));
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var20);
        }
        return var16;
    }
    
    public static SubLObject f7334(final SubLObject var15, final SubLObject var18, final SubLObject var19) {
        assert module0102.NIL != f7322(var15) : var15;
        assert module0102.NIL != f7335(var18) : var18;
        assert module0102.NIL != module0101.f7281(var19) : var19;
        if (!f7331(var15).eql(module0101.f7290(var19))) {
            Errors.error((SubLObject)module0102.$ic29$);
        }
        if (module0102.NIL == module0101.f7299(var19)) {
            Hashtables.sethash(var18, f7323(var15), var19);
            f7336(var15);
        }
        return var15;
    }
    
    public static SubLObject f7337(final SubLObject var15, final SubLObject var18, final SubLObject var23, final SubLObject var24) {
        assert module0102.NIL != f7322(var15) : var15;
        assert module0102.NIL != f7335(var18) : var18;
        assert module0102.NIL != f7338(var23) : var23;
        assert module0102.NIL != Types.numberp(var24) : var24;
        SubLObject var25 = Hashtables.gethash(var18, f7323(var15), (SubLObject)module0102.UNPROVIDED);
        if (module0102.NIL == var25) {
            var25 = module0101.f7289(f7331(var15), (SubLObject)module0102.UNPROVIDED);
            Hashtables.sethash(var18, f7323(var15), var25);
        }
        return module0101.f7293(var25, var23, var24);
    }
    
    public static SubLObject f7339(final SubLObject var15, final SubLObject var18, final SubLObject var23) {
        assert module0102.NIL != f7322(var15) : var15;
        assert module0102.NIL != f7335(var18) : var18;
        assert module0102.NIL != f7338(var23) : var23;
        return module0101.f7294(Hashtables.gethash(var18, f7323(var15), (SubLObject)module0102.UNPROVIDED), var23);
    }
    
    public static SubLObject f7340(final SubLObject var25, final SubLObject var26) {
        assert module0102.NIL != f7322(var25) : var25;
        assert module0102.NIL != f7322(var26) : var26;
        f7336(var25);
        SubLObject var27 = (SubLObject)module0102.NIL;
        final SubLObject var28 = f7323(var25);
        SubLObject var29 = (SubLObject)module0102.NIL;
        SubLObject var30 = (SubLObject)module0102.NIL;
        final Iterator var31 = Hashtables.getEntrySetIterator(var28);
        try {
            while (Hashtables.iteratorHasNext(var31)) {
                final Map.Entry var32 = Hashtables.iteratorNextEntry(var31);
                var29 = Hashtables.getEntryKey(var32);
                var30 = Hashtables.getEntryValue(var32);
                var27 = Hashtables.gethash(var29, f7323(var26), (SubLObject)module0102.UNPROVIDED);
                if (module0102.NIL != var27) {
                    module0101.f7303(var30, var27);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var31);
        }
        return var25;
    }
    
    public static SubLObject f7341(final SubLObject var15, final SubLObject var29) {
        assert module0102.NIL != f7322(var15) : var15;
        assert module0102.NIL != Types.numberp(var29) : var29;
        f7336(var15);
        final SubLObject var30 = f7323(var15);
        SubLObject var31 = (SubLObject)module0102.NIL;
        SubLObject var32 = (SubLObject)module0102.NIL;
        final Iterator var33 = Hashtables.getEntrySetIterator(var30);
        try {
            while (Hashtables.iteratorHasNext(var33)) {
                final Map.Entry var34 = Hashtables.iteratorNextEntry(var33);
                var31 = Hashtables.getEntryKey(var34);
                var32 = Hashtables.getEntryValue(var34);
                module0101.f7306(var32, var29);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var33);
        }
        return var15;
    }
    
    public static SubLObject f7342(final SubLObject var15, final SubLObject var19) {
        assert module0102.NIL != f7322(var15) : var15;
        assert module0102.NIL != module0101.f7281(var19) : var19;
        final SubLObject var20 = module0101.f7289(f7331(var15), (SubLObject)module0102.UNPROVIDED);
        final SubLObject var21 = f7323(var15);
        SubLObject var22 = (SubLObject)module0102.NIL;
        SubLObject var23 = (SubLObject)module0102.NIL;
        final Iterator var24 = Hashtables.getEntrySetIterator(var21);
        try {
            while (Hashtables.iteratorHasNext(var24)) {
                final Map.Entry var25 = Hashtables.iteratorNextEntry(var24);
                var22 = Hashtables.getEntryKey(var25);
                var23 = Hashtables.getEntryValue(var25);
                module0101.f7293(var20, var22, module0101.f7305(var23, var19));
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var24);
        }
        return var20;
    }
    
    public static SubLObject f7343(final SubLObject var25, final SubLObject var26) {
        assert module0102.NIL != f7322(var25) : var25;
        assert module0102.NIL != f7322(var26) : var26;
        final SubLObject var27 = f7330((SubLObject)module0102.UNPROVIDED, (SubLObject)module0102.UNPROVIDED);
        f7344(var26);
        final SubLObject var28 = f7323(var25);
        SubLObject var29 = (SubLObject)module0102.NIL;
        SubLObject var30 = (SubLObject)module0102.NIL;
        final Iterator var31 = Hashtables.getEntrySetIterator(var28);
        try {
            while (Hashtables.iteratorHasNext(var31)) {
                final Map.Entry var32 = Hashtables.iteratorNextEntry(var31);
                var29 = Hashtables.getEntryKey(var32);
                var30 = Hashtables.getEntryValue(var32);
                final SubLObject var33 = module0101.f7289(f7331(var25), (SubLObject)module0102.UNPROVIDED);
                final SubLObject var17_34 = f7324(var26);
                SubLObject var34 = (SubLObject)module0102.NIL;
                SubLObject var35 = (SubLObject)module0102.NIL;
                final Iterator var20_36 = Hashtables.getEntrySetIterator(var17_34);
                try {
                    while (Hashtables.iteratorHasNext(var20_36)) {
                        final Map.Entry var21_37 = Hashtables.iteratorNextEntry(var20_36);
                        var34 = Hashtables.getEntryKey(var21_37);
                        var35 = Hashtables.getEntryValue(var21_37);
                        module0101.f7293(var33, var34, module0101.f7305(var30, var35));
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var20_36);
                }
                f7334(var27, var29, var33);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var31);
        }
        return var27;
    }
    
    public static SubLObject f7345(final SubLObject var15) {
        assert module0102.NIL != f7322(var15) : var15;
        f7344(var15);
        SubLObject var16 = (SubLObject)module0102.NIL;
        var16 = f7323(var15);
        f7325(var15, f7324(var15));
        f7326(var15, var16);
        return var15;
    }
    
    public static SubLObject f7346(final SubLObject var15) {
        assert module0102.NIL != f7322(var15) : var15;
        return f7341(var15, (SubLObject)module0102.MINUS_ONE_INTEGER);
    }
    
    public static SubLObject f7347(final SubLObject var15) {
        assert module0102.NIL != f7322(var15) : var15;
        f7344(var15);
        SubLObject var16 = (SubLObject)module0102.ZERO_INTEGER;
        SubLObject var17 = (SubLObject)module0102.NIL;
        final SubLObject var18 = f7324(var15);
        SubLObject var19 = (SubLObject)module0102.NIL;
        SubLObject var20 = (SubLObject)module0102.NIL;
        final Iterator var21 = Hashtables.getEntrySetIterator(var18);
        try {
            while (Hashtables.iteratorHasNext(var21)) {
                final Map.Entry var22 = Hashtables.iteratorNextEntry(var21);
                var19 = Hashtables.getEntryKey(var22);
                var20 = Hashtables.getEntryValue(var22);
                var17 = module0101.f7301(var20);
                if (var17.numG(var16)) {
                    var16 = var17;
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var21);
        }
        return var16;
    }
    
    public static SubLObject f7348(final SubLObject var15) {
        assert module0102.NIL != f7322(var15) : var15;
        SubLObject var16 = (SubLObject)module0102.ZERO_INTEGER;
        SubLObject var17 = (SubLObject)module0102.NIL;
        final SubLObject var18 = f7323(var15);
        SubLObject var19 = (SubLObject)module0102.NIL;
        SubLObject var20 = (SubLObject)module0102.NIL;
        final Iterator var21 = Hashtables.getEntrySetIterator(var18);
        try {
            while (Hashtables.iteratorHasNext(var21)) {
                final Map.Entry var22 = Hashtables.iteratorNextEntry(var21);
                var19 = Hashtables.getEntryKey(var22);
                var20 = Hashtables.getEntryValue(var22);
                var17 = module0101.f7302(var20);
                if (var17.numG(var16)) {
                    var16 = var17;
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var21);
        }
        return var16;
    }
    
    public static SubLObject f7349(final SubLObject var15, SubLObject var41, SubLObject var42) {
        if (var41 == module0102.UNPROVIDED) {
            var41 = Hashtables.hash_table_count(f7323(var15));
        }
        if (var42 == module0102.UNPROVIDED) {
            var42 = module0102.$g1340$.getGlobalValue();
        }
        assert module0102.NIL != f7322(var15) : var15;
        assert module0102.NIL != module0004.f106(var41) : var41;
        assert module0102.NIL != Types.floatp(var42) : var42;
        SubLObject var43 = (SubLObject)module0102.NIL;
        SubLObject var44 = (SubLObject)module0102.ONE_INTEGER;
        SubLObject var45 = (SubLObject)module0102.NIL;
        while (!var44.numG(var41)) {
            var45 = f7350(var15, var42);
            if (module0102.NIL != module0101.f7307(var45.first())) {
                var43 = (SubLObject)ConsesLow.cons(var45, var43);
                if (!var44.numE(var41)) {
                    f7351(var15, var45.rest(), var45.first());
                }
            }
            else {
                var44 = var41;
            }
            var44 = Numbers.add(var44, (SubLObject)module0102.ONE_INTEGER);
        }
        return Sequences.nreverse(var43);
    }
    
    public static SubLObject f7352(final SubLObject var15) {
        assert module0102.NIL != f7322(var15) : var15;
        final SubLObject var16 = f7343(f7345(f7333(var15)), var15);
        final SubLObject var17 = f7330(f7331(var15), (SubLObject)module0102.UNPROVIDED);
        final SubLObject var18 = f7330(f7331(var15), (SubLObject)module0102.UNPROVIDED);
        final SubLObject var19 = f7330(f7331(var15), (SubLObject)module0102.UNPROVIDED);
        SubLObject var20 = (SubLObject)module0102.NIL;
        SubLObject var21 = (SubLObject)module0102.ONE_INTEGER;
        SubLObject var22 = f7349(var16, (SubLObject)module0102.UNPROVIDED, (SubLObject)module0102.UNPROVIDED);
        SubLObject var23 = (SubLObject)module0102.NIL;
        var23 = var22.first();
        while (module0102.NIL != var22) {
            f7334(var17, var21, var23.first());
            var20 = Numbers.sqrt(Numbers.abs(var23.rest()));
            f7334(var18, var21, module0101.f7306(f7342(var15, var23.first()), Numbers.divide((SubLObject)module0102.ONE_INTEGER, var20)));
            f7337(var19, var21, var21, var20);
            var21 = Numbers.add(var21, (SubLObject)module0102.ONE_INTEGER);
            var22 = var22.rest();
            var23 = var22.first();
        }
        f7345(var18);
        return Values.values(var18, var19, var17);
    }
    
    public static SubLObject f7353(final SubLObject var52, final SubLObject var53) {
        SubLObject var55;
        final SubLObject var54 = var55 = var52.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var55, var54, (SubLObject)module0102.$ic35$);
        final SubLObject var56 = var55.rest();
        var55 = var55.first();
        SubLObject var57 = (SubLObject)module0102.NIL;
        SubLObject var58 = (SubLObject)module0102.NIL;
        SubLObject var59 = (SubLObject)module0102.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var55, var54, (SubLObject)module0102.$ic35$);
        var57 = var55.first();
        var55 = var55.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var55, var54, (SubLObject)module0102.$ic35$);
        var58 = var55.first();
        var55 = var55.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var55, var54, (SubLObject)module0102.$ic35$);
        var59 = var55.first();
        var55 = var55.rest();
        if (module0102.NIL == var55) {
            final SubLObject var60;
            var55 = (var60 = var56);
            return (SubLObject)ConsesLow.listS((SubLObject)module0102.$ic36$, (SubLObject)ConsesLow.list(var57, var58, (SubLObject)ConsesLow.list((SubLObject)module0102.$ic9$, var59)), ConsesLow.append(var60, (SubLObject)module0102.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var54, (SubLObject)module0102.$ic35$);
        return (SubLObject)module0102.NIL;
    }
    
    public static SubLObject f7350(final SubLObject var15, SubLObject var42) {
        if (var42 == module0102.UNPROVIDED) {
            var42 = module0102.$g1340$.getGlobalValue();
        }
        assert module0102.NIL != f7322(var15) : var15;
        final SubLObject var43 = module0101.f7289(f7331(var15), (SubLObject)module0102.UNPROVIDED);
        SubLObject var44 = (SubLObject)module0102.ZERO_INTEGER;
        SubLObject var45 = module0101.f7289(f7331(var15), (SubLObject)module0102.UNPROVIDED);
        final SubLObject var46 = Numbers.add(Hashtables.hash_table_count(f7323(var15)), (SubLObject)module0102.$ic21$);
        SubLObject var47 = f7354(var15);
        SubLObject var48 = (SubLObject)module0102.NIL;
        var48 = var47.first();
        while (module0102.NIL != var47) {
            module0101.f7293(var43, var48, module0048.f_1X(random.random((SubLObject)module0102.TEN_INTEGER)));
            var47 = var47.rest();
            var48 = var47.first();
        }
        SubLObject var49;
        SubLObject var50;
        SubLObject var51;
        SubLObject var52;
        SubLObject var53;
        SubLObject var54;
        for (var49 = (SubLObject)module0102.NIL, var50 = (SubLObject)module0102.NIL, var51 = (SubLObject)module0102.NIL, var52 = (SubLObject)module0102.NIL, var53 = (SubLObject)module0102.NIL, var54 = (SubLObject)module0102.NIL, var49 = (SubLObject)module0102.ZERO_INTEGER, var50 = var43, var51 = f7342(var15, var50), var52 = (SubLObject)module0102.ZERO_INTEGER, var53 = f7355(var51, var50), var54 = Numbers.abs(Numbers.subtract(var53, var52)); !var54.numL(var42) && !var49.numG(var46); var49 = module0048.f_1X(var49), var50 = var51, var51 = f7342(var15, var50), var52 = var53, var53 = f7355(var51, var50), var54 = Numbers.abs(Numbers.subtract(var53, var52))) {
            var44 = var53;
            var45 = var51;
        }
        return (SubLObject)ConsesLow.cons(var45, var44);
    }
    
    public static SubLObject f7356(final SubLObject var28, final SubLObject var27) {
        assert module0102.NIL != module0101.f7281(var28) : var28;
        assert module0102.NIL != module0101.f7281(var27) : var27;
        final SubLObject var29 = f7330(module0101.f7290(var28), (SubLObject)module0102.UNPROVIDED);
        final SubLObject var30 = module0101.f7283(var28);
        SubLObject var31 = (SubLObject)module0102.NIL;
        SubLObject var32 = (SubLObject)module0102.NIL;
        final Iterator var33 = Hashtables.getEntrySetIterator(var30);
        try {
            while (Hashtables.iteratorHasNext(var33)) {
                final Map.Entry var34 = Hashtables.iteratorNextEntry(var33);
                var31 = Hashtables.getEntryKey(var34);
                var32 = Hashtables.getEntryValue(var34);
                f7334(var29, var31, module0101.f7306(module0101.f7292(var27), var32));
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var33);
        }
        return var29;
    }
    
    public static SubLObject f7351(final SubLObject var15, final SubLObject var59, final SubLObject var60) {
        assert module0102.NIL != f7322(var15) : var15;
        assert module0102.NIL != Types.numberp(var59) : var59;
        assert module0102.NIL != module0101.f7281(var60) : var60;
        return f7340(var15, f7346(f7356(module0101.f7306(module0101.f7292(var60), var59), var60)));
    }
    
    public static SubLObject f7357(final SubLObject var63, final SubLObject var62) {
        return Numbers.divide(module0101.f7302(var63), module0101.f7302(var62));
    }
    
    public static SubLObject f7355(final SubLObject var63, final SubLObject var62) {
        final SubLObject var64 = module0101.f7305(var62, var63);
        final SubLObject var65 = module0101.f7305(var62, var62);
        if (var64.numE(var65)) {
            return (SubLObject)module0102.ONE_INTEGER;
        }
        if (var65.isZero()) {
            return (SubLObject)module0102.$ic37$;
        }
        return Numbers.divide(var64, var65);
    }
    
    public static SubLObject f7354(final SubLObject var15) {
        f7344(var15);
        SubLObject var16 = (SubLObject)module0102.NIL;
        final SubLObject var17 = f7324(var15);
        SubLObject var18 = (SubLObject)module0102.NIL;
        SubLObject var19 = (SubLObject)module0102.NIL;
        final Iterator var20 = Hashtables.getEntrySetIterator(var17);
        try {
            while (Hashtables.iteratorHasNext(var20)) {
                final Map.Entry var21 = Hashtables.iteratorNextEntry(var20);
                var18 = Hashtables.getEntryKey(var21);
                var19 = Hashtables.getEntryValue(var21);
                var16 = (SubLObject)ConsesLow.cons(var18, var16);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var20);
        }
        return var16;
    }
    
    public static SubLObject f7335(final SubLObject var71) {
        return var71;
    }
    
    public static SubLObject f7338(final SubLObject var71) {
        return var71;
    }
    
    public static SubLObject f7336(final SubLObject var15) {
        return Hashtables.clrhash(f7324(var15));
    }
    
    public static SubLObject f7358(final SubLObject var15) {
        final SubLObject var16 = f7323(var15);
        SubLObject var17 = (SubLObject)module0102.NIL;
        SubLObject var18 = (SubLObject)module0102.NIL;
        final Iterator var19 = Hashtables.getEntrySetIterator(var16);
        try {
            while (Hashtables.iteratorHasNext(var19)) {
                final Map.Entry var20 = Hashtables.iteratorNextEntry(var19);
                var17 = Hashtables.getEntryKey(var20);
                var18 = Hashtables.getEntryValue(var20);
                final SubLObject var17_72 = module0101.f7283(var18);
                SubLObject var21 = (SubLObject)module0102.NIL;
                SubLObject var22 = (SubLObject)module0102.NIL;
                final Iterator var20_73 = Hashtables.getEntrySetIterator(var17_72);
                try {
                    while (Hashtables.iteratorHasNext(var20_73)) {
                        final Map.Entry var21_74 = Hashtables.iteratorNextEntry(var20_73);
                        var21 = Hashtables.getEntryKey(var21_74);
                        var22 = Hashtables.getEntryValue(var21_74);
                        f7359(var15, var21);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var20_73);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var19);
        }
        return var15;
    }
    
    public static SubLObject f7359(final SubLObject var15, final SubLObject var23) {
        assert module0102.NIL != f7322(var15) : var15;
        assert module0102.NIL != f7338(var23) : var23;
        SubLObject var24 = Hashtables.gethash(var23, f7324(var15), (SubLObject)module0102.UNPROVIDED);
        SubLObject var25 = (SubLObject)module0102.NIL;
        if (module0102.NIL == var24) {
            var24 = module0101.f7289(f7331(var15), (SubLObject)module0102.UNPROVIDED);
            final SubLObject var26 = f7323(var15);
            SubLObject var27 = (SubLObject)module0102.NIL;
            SubLObject var28 = (SubLObject)module0102.NIL;
            final Iterator var29 = Hashtables.getEntrySetIterator(var26);
            try {
                while (Hashtables.iteratorHasNext(var29)) {
                    final Map.Entry var30 = Hashtables.iteratorNextEntry(var29);
                    var27 = Hashtables.getEntryKey(var30);
                    var28 = Hashtables.getEntryValue(var30);
                    var25 = module0101.f7294(var28, var23);
                    if (!var25.isZero()) {
                        module0101.f7293(var24, var27, module0101.f7294(var28, var23));
                    }
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(var29);
            }
        }
        Hashtables.sethash(var23, f7324(var15), var24);
        return var24;
    }
    
    public static SubLObject f7344(final SubLObject var15) {
        if (module0102.NIL == module0004.f105(Hashtables.hash_table_count(f7324(var15)))) {
            f7326(var15, Hashtables.make_hash_table((SubLObject)module0102.$ic38$, f7331(var15), (SubLObject)module0102.UNPROVIDED));
            f7358(var15);
        }
        return var15;
    }
    
    public static SubLObject f7360(final SubLObject var15, final SubLObject var75) {
        f7336(var15);
        final SubLObject var76 = f7323(var15);
        SubLObject var77 = (SubLObject)module0102.NIL;
        SubLObject var78 = (SubLObject)module0102.NIL;
        final Iterator var79 = Hashtables.getEntrySetIterator(var76);
        try {
            while (Hashtables.iteratorHasNext(var79)) {
                final Map.Entry var80 = Hashtables.iteratorNextEntry(var79);
                var77 = Hashtables.getEntryKey(var80);
                var78 = Hashtables.getEntryValue(var80);
                if (module0102.NIL == module0004.f104(var77, var75, f7331(var15), (SubLObject)module0102.UNPROVIDED)) {
                    Hashtables.remhash(var77, var76);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var79);
        }
        return var15;
    }
    
    public static SubLObject f7361() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0102", "f7320", "S#9233", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0102", "f7322", "S#9232", 1, 0, false);
        new $f7322$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0102", "f7323", "S#9234", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0102", "f7324", "S#9235", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0102", "f7325", "S#9236", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0102", "f7326", "S#9237", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0102", "f7327", "S#9238", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0102", "f7328", "S#9239", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0102", "f7329", "S#9240", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0102", "f7330", "S#9241", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0102", "f7331", "S#9242", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0102", "f7321", "S#9243", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0102", "f7332", "S#9244", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0102", "f7333", "S#9245", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0102", "f7334", "S#9246", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0102", "f7337", "S#9247", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0102", "f7339", "S#9248", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0102", "f7340", "S#9249", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0102", "f7341", "S#9250", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0102", "f7342", "S#9251", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0102", "f7343", "S#9252", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0102", "f7345", "S#9253", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0102", "f7346", "S#9254", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0102", "f7347", "S#9255", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0102", "f7348", "S#9256", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0102", "f7349", "S#9257", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0102", "f7352", "S#9258", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0102", "f7353", "S#9259");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0102", "f7350", "S#9260", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0102", "f7356", "S#9261", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0102", "f7351", "S#9262", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0102", "f7357", "S#9263", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0102", "f7355", "S#9264", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0102", "f7354", "S#9265", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0102", "f7335", "S#9266", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0102", "f7338", "S#9267", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0102", "f7336", "S#9268", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0102", "f7358", "S#9269", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0102", "f7359", "S#9270", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0102", "f7344", "S#9271", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0102", "f7360", "S#9272", 2, 0, false);
        return (SubLObject)module0102.NIL;
    }
    
    public static SubLObject f7362() {
        module0102.$g1339$ = SubLFiles.defconstant("S#9273", (SubLObject)module0102.$ic0$);
        module0102.$g1340$ = SubLFiles.deflexical("S#9274", (SubLObject)module0102.$ic32$);
        return (SubLObject)module0102.NIL;
    }
    
    public static SubLObject f7363() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0102.$g1339$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0102.$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0102.$ic8$);
        Structures.def_csetf((SubLObject)module0102.$ic9$, (SubLObject)module0102.$ic10$);
        Structures.def_csetf((SubLObject)module0102.$ic11$, (SubLObject)module0102.$ic12$);
        Equality.identity((SubLObject)module0102.$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0102.$g1339$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0102.$ic20$));
        return (SubLObject)module0102.NIL;
    }
    
    public void declareFunctions() {
        f7361();
    }
    
    public void initializeVariables() {
        f7362();
    }
    
    public void runTopLevelForms() {
        f7363();
    }
    
    static {
        me = (SubLFile)new module0102();
        module0102.$g1339$ = null;
        module0102.$g1340$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#9231", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#9232", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1574", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9275", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ROWS"), (SubLObject)SubLObjectFactory.makeKeyword("COLUMNS"));
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9234", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9235", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9236", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9237", "CYC"));
        $ic6$ = SubLObjectFactory.makeSymbol("S#9243", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#9233", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#9232", "CYC"));
        $ic9$ = SubLObjectFactory.makeSymbol("S#9234", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#9236", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#9235", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#9237", "CYC");
        $ic13$ = SubLObjectFactory.makeKeyword("ROWS");
        $ic14$ = SubLObjectFactory.makeKeyword("COLUMNS");
        $ic15$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic16$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic17$ = SubLObjectFactory.makeSymbol("S#9238", "CYC");
        $ic18$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic19$ = SubLObjectFactory.makeKeyword("END");
        $ic20$ = SubLObjectFactory.makeSymbol("S#9240", "CYC");
        $ic21$ = SubLObjectFactory.makeInteger(100);
        $ic22$ = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $ic23$ = SubLObjectFactory.makeSymbol("S#2831", "CYC");
        $ic24$ = SubLObjectFactory.makeString("#<SPARSE-MATRIX ");
        $ic25$ = SubLObjectFactory.makeString("|");
        $ic26$ = SubLObjectFactory.makeString(">");
        $ic27$ = SubLObjectFactory.makeSymbol("S#9266", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("S#9188", "CYC");
        $ic29$ = SubLObjectFactory.makeString("non-equal matrix and vector test functions");
        $ic30$ = SubLObjectFactory.makeSymbol("S#9267", "CYC");
        $ic31$ = SubLObjectFactory.makeSymbol("NUMBERP");
        $ic32$ = (SubLFloat)SubLObjectFactory.makeDouble(0.01);
        $ic33$ = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic34$ = SubLObjectFactory.makeSymbol("FLOATP");
        $ic35$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9276", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9277", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic36$ = SubLObjectFactory.makeSymbol("CDOHASH");
        $ic37$ = (SubLFloat)SubLObjectFactory.makeDouble(3.4028232E38);
        $ic38$ = SubLObjectFactory.makeInteger(50);
    }
    
    public static final class $sX9231_native extends SubLStructNative
    {
        public SubLObject $rows;
        public SubLObject $columns;
        private static final SubLStructDeclNative structDecl;
        
        public $sX9231_native() {
            this.$rows = (SubLObject)CommonSymbols.NIL;
            this.$columns = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX9231_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$rows;
        }
        
        public SubLObject getField3() {
            return this.$columns;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$rows = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$columns = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX9231_native.class, module0102.$ic0$, module0102.$ic1$, module0102.$ic2$, module0102.$ic3$, new String[] { "$rows", "$columns" }, module0102.$ic4$, module0102.$ic5$, module0102.$ic6$);
        }
    }
    
    public static final class $f7322$UnaryFunction extends UnaryFunction
    {
        public $f7322$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#9232"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0102.f7322(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0102.class
	Total time: 174 ms
	
	Decompiled with Procyon 0.5.32.
*/