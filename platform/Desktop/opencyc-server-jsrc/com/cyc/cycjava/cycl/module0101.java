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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
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

public final class module0101 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0101";
    public static final String myFingerPrint = "19f7471a9e5ee638769e68ee54c1de1d6560a689a64fd84997c2606af3286468";
    public static SubLSymbol $g1337$;
    private static SubLSymbol $g1338$;
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
    private static final SubLSymbol $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    private static final SubLString $ic28$;
    private static final SubLString $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLList $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLString $ic34$;
    private static final SubLString $ic35$;
    private static final SubLInteger $ic36$;
    private static final SubLInteger $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    
    public static SubLObject f7279(final SubLObject var1, final SubLObject var2) {
        f7280(var1, var2, (SubLObject)module0101.ZERO_INTEGER);
        return (SubLObject)module0101.NIL;
    }
    
    public static SubLObject f7281(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX9187_native.class) ? module0101.T : module0101.NIL);
    }
    
    public static SubLObject f7282(final SubLObject var1) {
        assert module0101.NIL != f7281(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f7283(final SubLObject var1) {
        assert module0101.NIL != f7281(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f7284(final SubLObject var1, final SubLObject var4) {
        assert module0101.NIL != f7281(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f7285(final SubLObject var1, final SubLObject var4) {
        assert module0101.NIL != f7281(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f7286(SubLObject var5) {
        if (var5 == module0101.UNPROVIDED) {
            var5 = (SubLObject)module0101.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX9187_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0101.NIL, var7 = var5; module0101.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0101.$ic13$)) {
                f7284(var6, var9);
            }
            else if (var10.eql((SubLObject)module0101.$ic14$)) {
                f7285(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0101.$ic15$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f7287(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0101.$ic16$, (SubLObject)module0101.$ic17$, (SubLObject)module0101.TWO_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0101.$ic18$, (SubLObject)module0101.$ic13$, f7282(var11));
        Functions.funcall(var12, var11, (SubLObject)module0101.$ic18$, (SubLObject)module0101.$ic14$, f7283(var11));
        Functions.funcall(var12, var11, (SubLObject)module0101.$ic19$, (SubLObject)module0101.$ic17$, (SubLObject)module0101.TWO_INTEGER);
        return var11;
    }
    
    public static SubLObject f7288(final SubLObject var11, final SubLObject var12) {
        return f7287(var11, var12);
    }
    
    public static SubLObject f7289(SubLObject var13, SubLObject var14) {
        if (var13 == module0101.UNPROVIDED) {
            var13 = (SubLObject)module0101.EQL;
        }
        if (var14 == module0101.UNPROVIDED) {
            var14 = (SubLObject)module0101.$ic21$;
        }
        assert module0101.NIL != module0030.f1591(var13) : var13;
        assert module0101.NIL != Types.integerp(var14) : var14;
        final SubLObject var15 = f7286((SubLObject)module0101.UNPROVIDED);
        f7285(var15, Hashtables.make_hash_table(var14, var13, (SubLObject)module0101.UNPROVIDED));
        return var15;
    }
    
    public static SubLObject f7280(final SubLObject var15, final SubLObject var2, final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        streams_high.write_string((SubLObject)module0101.$ic24$, var2, (SubLObject)module0101.UNPROVIDED, (SubLObject)module0101.UNPROVIDED);
        SubLObject var18 = (SubLObject)module0101.ZERO_INTEGER;
        final SubLObject var19 = Hashtables.hash_table_count(f7283(var15));
        if (!var18.numE(Numbers.min(var19, (SubLObject)module0101.TEN_INTEGER))) {
            SubLObject var20 = (SubLObject)module0101.NIL;
            try {
                var17.throwStack.push(module0101.$ic25$);
                final SubLObject var21 = f7283(var15);
                SubLObject var22 = (SubLObject)module0101.NIL;
                SubLObject var23 = (SubLObject)module0101.NIL;
                final Iterator var24 = Hashtables.getEntrySetIterator(var21);
                try {
                    while (Hashtables.iteratorHasNext(var24)) {
                        final Map.Entry var25 = Hashtables.iteratorNextEntry(var24);
                        var22 = Hashtables.getEntryKey(var25);
                        var23 = Hashtables.getEntryValue(var25);
                        module0005.f153(Numbers.numE(var18, Numbers.min(var19, (SubLObject)module0101.TEN_INTEGER)));
                        print_high.princ(var22, var2);
                        streams_high.write_string((SubLObject)module0101.$ic26$, var2, (SubLObject)module0101.UNPROVIDED, (SubLObject)module0101.UNPROVIDED);
                        print_high.princ(var23, var2);
                        print_high.princ((SubLObject)module0101.$ic27$, var2);
                        var18 = Numbers.add(var18, (SubLObject)module0101.ONE_INTEGER);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var24);
                }
            }
            catch (Throwable var26) {
                var20 = Errors.handleThrowable(var26, (SubLObject)module0101.$ic25$);
            }
            finally {
                var17.throwStack.pop();
            }
        }
        if (var19.numG(var18)) {
            streams_high.write_string((SubLObject)module0101.$ic28$, var2, (SubLObject)module0101.UNPROVIDED, (SubLObject)module0101.UNPROVIDED);
        }
        streams_high.write_string((SubLObject)module0101.$ic29$, var2, (SubLObject)module0101.UNPROVIDED, (SubLObject)module0101.UNPROVIDED);
        return var15;
    }
    
    public static SubLObject f7290(final SubLObject var15) {
        assert module0101.NIL != f7281(var15) : var15;
        return Hashtables.hash_table_test(f7283(var15));
    }
    
    public static SubLObject f7291(final SubLObject var15) {
        assert module0101.NIL != f7281(var15) : var15;
        return Hashtables.hash_table_count(f7283(var15));
    }
    
    public static SubLObject f7292(final SubLObject var15) {
        assert module0101.NIL != f7281(var15) : var15;
        final SubLObject var16 = f7289(f7290(var15), (SubLObject)module0101.UNPROVIDED);
        final SubLObject var17 = f7283(var15);
        SubLObject var18 = (SubLObject)module0101.NIL;
        SubLObject var19 = (SubLObject)module0101.NIL;
        final Iterator var20 = Hashtables.getEntrySetIterator(var17);
        try {
            while (Hashtables.iteratorHasNext(var20)) {
                final Map.Entry var21 = Hashtables.iteratorNextEntry(var20);
                var18 = Hashtables.getEntryKey(var21);
                var19 = Hashtables.getEntryValue(var21);
                f7293(var16, var18, var19);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var20);
        }
        return var16;
    }
    
    public static SubLObject f7294(final SubLObject var15, final SubLObject var22) {
        assert module0101.NIL != f7281(var15) : var15;
        return Hashtables.gethash(var22, f7283(var15), (SubLObject)module0101.ZERO_INTEGER);
    }
    
    public static SubLObject f7293(final SubLObject var15, final SubLObject var22, final SubLObject var23) {
        assert module0101.NIL != f7281(var15) : var15;
        assert module0101.NIL != Types.numberp(var23) : var23;
        if (var23.isZero()) {
            Hashtables.remhash(var22, f7283(var15));
        }
        else {
            Hashtables.sethash(var22, f7283(var15), var23);
        }
        return var15;
    }
    
    public static SubLObject f7295(final SubLObject var15, final SubLObject var22) {
        assert module0101.NIL != f7281(var15) : var15;
        Hashtables.sethash(var22, f7283(var15), Numbers.add(Hashtables.gethash(var22, f7283(var15), (SubLObject)module0101.ZERO_INTEGER), (SubLObject)module0101.ONE_INTEGER));
        return var15;
    }
    
    public static SubLObject f7296(final SubLObject var15, final SubLObject var22) {
        assert module0101.NIL != f7281(var15) : var15;
        Hashtables.sethash(var22, f7283(var15), Numbers.subtract(Hashtables.gethash(var22, f7283(var15), (SubLObject)module0101.ZERO_INTEGER), (SubLObject)module0101.ONE_INTEGER));
        return var15;
    }
    
    public static SubLObject f7297(final SubLObject var15) {
        assert module0101.NIL != f7281(var15) : var15;
        if (module0101.NIL == f7282(var15)) {
            SubLObject var16 = (SubLObject)module0101.ZERO_INTEGER;
            final SubLObject var17 = f7283(var15);
            SubLObject var18 = (SubLObject)module0101.NIL;
            SubLObject var19 = (SubLObject)module0101.NIL;
            final Iterator var20 = Hashtables.getEntrySetIterator(var17);
            try {
                while (Hashtables.iteratorHasNext(var20)) {
                    final Map.Entry var21 = Hashtables.iteratorNextEntry(var20);
                    var18 = Hashtables.getEntryKey(var21);
                    var19 = Hashtables.getEntryValue(var21);
                    var16 = Numbers.add(var16, module0048.f3282(var19));
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(var20);
            }
            f7284(var15, Numbers.sqrt(var16));
        }
        return f7282(var15);
    }
    
    public static SubLObject f7298(final SubLObject var30, final SubLObject var31) {
        SubLObject var33;
        final SubLObject var32 = var33 = var30.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var33, var32, (SubLObject)module0101.$ic31$);
        final SubLObject var34 = var33.rest();
        var33 = var33.first();
        SubLObject var35 = (SubLObject)module0101.NIL;
        SubLObject var36 = (SubLObject)module0101.NIL;
        SubLObject var37 = (SubLObject)module0101.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var33, var32, (SubLObject)module0101.$ic31$);
        var35 = var33.first();
        var33 = var33.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var33, var32, (SubLObject)module0101.$ic31$);
        var36 = var33.first();
        var33 = var33.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var33, var32, (SubLObject)module0101.$ic31$);
        var37 = var33.first();
        var33 = var33.rest();
        if (module0101.NIL == var33) {
            final SubLObject var38;
            var33 = (var38 = var34);
            return (SubLObject)ConsesLow.listS((SubLObject)module0101.$ic32$, (SubLObject)ConsesLow.list(var35, var36, (SubLObject)ConsesLow.list((SubLObject)module0101.$ic11$, var37)), ConsesLow.append(var38, (SubLObject)module0101.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var32, (SubLObject)module0101.$ic31$);
        return (SubLObject)module0101.NIL;
    }
    
    public static SubLObject f7299(final SubLObject var15) {
        assert module0101.NIL != f7281(var15) : var15;
        return Numbers.zerop(Hashtables.hash_table_count(f7283(var15)));
    }
    
    public static SubLObject f7300(final SubLObject var15) {
        assert module0101.NIL != f7281(var15) : var15;
        return f7297(var15);
    }
    
    public static SubLObject f7301(final SubLObject var15) {
        assert module0101.NIL != f7281(var15) : var15;
        SubLObject var16 = (SubLObject)module0101.ZERO_INTEGER;
        final SubLObject var17 = f7283(var15);
        SubLObject var18 = (SubLObject)module0101.NIL;
        SubLObject var19 = (SubLObject)module0101.NIL;
        final Iterator var20 = Hashtables.getEntrySetIterator(var17);
        try {
            while (Hashtables.iteratorHasNext(var20)) {
                final Map.Entry var21 = Hashtables.iteratorNextEntry(var20);
                var18 = Hashtables.getEntryKey(var21);
                var19 = Hashtables.getEntryValue(var21);
                var16 = Numbers.add(var16, var19);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var20);
        }
        return var16;
    }
    
    public static SubLObject f7302(final SubLObject var15) {
        assert module0101.NIL != f7281(var15) : var15;
        SubLObject var16 = (SubLObject)module0101.ZERO_INTEGER;
        final SubLObject var17 = f7283(var15);
        SubLObject var18 = (SubLObject)module0101.NIL;
        SubLObject var19 = (SubLObject)module0101.NIL;
        final Iterator var20 = Hashtables.getEntrySetIterator(var17);
        try {
            while (Hashtables.iteratorHasNext(var20)) {
                final Map.Entry var21 = Hashtables.iteratorNextEntry(var20);
                var18 = Hashtables.getEntryKey(var21);
                var19 = Hashtables.getEntryValue(var21);
                if (var19.numG(var16)) {
                    var16 = var19;
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var20);
        }
        return var16;
    }
    
    public static SubLObject f7303(final SubLObject var38, final SubLObject var39) {
        assert module0101.NIL != f7281(var39) : var39;
        assert module0101.NIL != f7281(var38) : var38;
        final SubLObject var40 = f7283(var38);
        final SubLObject var41 = f7283(var39);
        SubLObject var42 = (SubLObject)module0101.NIL;
        SubLObject var43 = (SubLObject)module0101.NIL;
        final Iterator var44 = Hashtables.getEntrySetIterator(var41);
        try {
            while (Hashtables.iteratorHasNext(var44)) {
                final Map.Entry var45 = Hashtables.iteratorNextEntry(var44);
                var42 = Hashtables.getEntryKey(var45);
                var43 = Hashtables.getEntryValue(var45);
                Hashtables.sethash(var42, var40, Numbers.add(Hashtables.gethash(var42, var40, (SubLObject)module0101.ZERO_INTEGER), var43));
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var44);
        }
        f7284(var38, (SubLObject)module0101.NIL);
        return var38;
    }
    
    public static SubLObject f7304(final SubLObject var39, final SubLObject var38) {
        assert module0101.NIL != f7281(var39) : var39;
        assert module0101.NIL != f7281(var38) : var38;
        final SubLObject var40 = f7289((SubLObject)module0101.UNPROVIDED, (SubLObject)module0101.UNPROVIDED);
        f7303(var39, var40);
        f7303(var38, var40);
        return var40;
    }
    
    public static SubLObject f7305(final SubLObject var39, final SubLObject var38) {
        assert module0101.NIL != f7281(var39) : var39;
        assert module0101.NIL != f7281(var38) : var38;
        SubLObject var40 = (SubLObject)module0101.ZERO_INTEGER;
        final SubLObject var41 = f7283(var38);
        final SubLObject var42 = f7283(var39);
        SubLObject var43 = (SubLObject)module0101.NIL;
        SubLObject var44 = (SubLObject)module0101.NIL;
        final Iterator var45 = Hashtables.getEntrySetIterator(var42);
        try {
            while (Hashtables.iteratorHasNext(var45)) {
                final Map.Entry var46 = Hashtables.iteratorNextEntry(var45);
                var43 = Hashtables.getEntryKey(var46);
                var44 = Hashtables.getEntryValue(var46);
                var40 = Numbers.add(var40, Numbers.multiply(var44, Hashtables.gethash(var43, var41, (SubLObject)module0101.ZERO_INTEGER)));
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var45);
        }
        return var40;
    }
    
    public static SubLObject f7306(final SubLObject var15, final SubLObject var43) {
        assert module0101.NIL != f7281(var15) : var15;
        assert module0101.NIL != Types.numberp(var43) : var43;
        f7284(var15, (SubLObject)module0101.NIL);
        final SubLObject var44 = f7283(var15);
        SubLObject var45 = (SubLObject)module0101.NIL;
        SubLObject var46 = (SubLObject)module0101.NIL;
        final Iterator var47 = Hashtables.getEntrySetIterator(var44);
        try {
            while (Hashtables.iteratorHasNext(var47)) {
                final Map.Entry var48 = Hashtables.iteratorNextEntry(var47);
                var45 = Hashtables.getEntryKey(var48);
                var46 = Hashtables.getEntryValue(var48);
                f7293(var15, var45, Numbers.multiply(var46, var43));
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var47);
        }
        return var15;
    }
    
    public static SubLObject f7307(final SubLObject var15) {
        assert module0101.NIL != f7281(var15) : var15;
        final SubLObject var16 = f7297(var15);
        if (!var16.isZero()) {
            return f7306(var15, Numbers.divide((SubLObject)module0101.ONE_INTEGER, var16));
        }
        return (SubLObject)module0101.NIL;
    }
    
    public static SubLObject f7308(final SubLObject var15) {
        assert module0101.NIL != f7281(var15) : var15;
        return Numbers.numE(f7297(var15), (SubLObject)module0101.ONE_INTEGER);
    }
    
    public static SubLObject f7309(final SubLObject var39, final SubLObject var38) {
        assert module0101.NIL != f7281(var39) : var39;
        assert module0101.NIL != f7281(var38) : var38;
        SubLObject var40 = (SubLObject)module0101.ZERO_INTEGER;
        final SubLObject var41 = f7283(var38);
        final SubLObject var42 = f7283(var39);
        SubLObject var43 = (SubLObject)module0101.NIL;
        SubLObject var44 = (SubLObject)module0101.NIL;
        final Iterator var45 = Hashtables.getEntrySetIterator(var42);
        try {
            while (Hashtables.iteratorHasNext(var45)) {
                final Map.Entry var46 = Hashtables.iteratorNextEntry(var45);
                var43 = Hashtables.getEntryKey(var46);
                var44 = Hashtables.getEntryValue(var46);
                var40 = Numbers.add(var40, module0048.f3282(Numbers.subtract(var44, Hashtables.gethash(var43, var41, (SubLObject)module0101.ZERO_INTEGER))));
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var45);
        }
        return Numbers.sqrt(var40);
    }
    
    public static SubLObject f7310(final SubLObject var45) {
        assert module0101.NIL != module0035.f2013(var45) : var45;
        final SubLObject var46 = f7290(var45.first());
        final SubLObject var47 = f7289(var46, (SubLObject)module0101.UNPROVIDED);
        SubLObject var48 = var45;
        SubLObject var49 = (SubLObject)module0101.NIL;
        var49 = var48.first();
        while (module0101.NIL != var48) {
            if (module0101.NIL == f7281(var49) || !f7290(var49).eql(var46)) {
                Errors.error((SubLObject)module0101.$ic34$, var49, var46);
            }
            f7303(var47, var49);
            var48 = var48.rest();
            var49 = var48.first();
        }
        return f7306(var47, Numbers.divide((SubLObject)module0101.ONE_INTEGER, Sequences.length(var45)));
    }
    
    public static SubLObject f7311(final SubLObject var39, final SubLObject var38) {
        final SubLThread var40 = SubLProcess.currentSubLThread();
        assert module0101.NIL != f7281(var39) : var39;
        assert module0101.NIL != f7281(var38) : var38;
        if (module0101.NIL == Errors.$ignore_mustsP$.getDynamicValue(var40) && !f7290(var39).eql(f7290(var38))) {
            Errors.error((SubLObject)module0101.$ic35$, f7290(var39), f7290(var38));
        }
        final SubLObject var41 = module0077.f5313(f7290(var39), (SubLObject)module0101.$ic36$);
        final SubLObject var42 = f7283(var39);
        SubLObject var43 = (SubLObject)module0101.NIL;
        SubLObject var44 = (SubLObject)module0101.NIL;
        final Iterator var45 = Hashtables.getEntrySetIterator(var42);
        try {
            while (Hashtables.iteratorHasNext(var45)) {
                final Map.Entry var46 = Hashtables.iteratorNextEntry(var45);
                var43 = Hashtables.getEntryKey(var46);
                var44 = Hashtables.getEntryValue(var46);
                if (!f7294(var38, var43).isZero()) {
                    module0077.f5326(var43, var41);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var45);
        }
        return module0077.f5311(var41);
    }
    
    public static SubLObject f7312(final SubLObject var39, final SubLObject var38) {
        assert module0101.NIL != f7281(var39) : var39;
        assert module0101.NIL != f7281(var38) : var38;
        return Numbers.divide(f7305(var39, var38), Numbers.multiply(f7297(var39), f7297(var38)));
    }
    
    public static SubLObject f7313(final SubLObject var39, final SubLObject var38) {
        assert module0101.NIL != f7281(var39) : var39;
        assert module0101.NIL != f7281(var38) : var38;
        return Numbers.divide(f7311(var39, var38), Numbers.min(Hashtables.hash_table_count(f7283(var39)), Hashtables.hash_table_count(f7283(var38))));
    }
    
    public static SubLObject f7314(final SubLObject var49, final SubLObject var2) {
        return f7315(var49, var2);
    }
    
    public static SubLObject f7315(final SubLObject var50, final SubLObject var2) {
        module0021.f1086(module0101.$g1338$.getGlobalValue(), var2);
        module0021.f1038(f7283(var50), var2);
        return var50;
    }
    
    public static SubLObject f7316(final SubLObject var2) {
        final SubLObject var3 = f7286((SubLObject)module0101.UNPROVIDED);
        f7285(var3, module0021.f1090(var2));
        return var3;
    }
    
    public static SubLObject f7317() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0101", "f7279", "S#9189", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0101", "f7281", "S#9188", 1, 0, false);
        new $f7281$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0101", "f7282", "S#9190", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0101", "f7283", "S#9191", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0101", "f7284", "S#9192", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0101", "f7285", "S#9193", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0101", "f7286", "S#9194", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0101", "f7287", "S#9195", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0101", "f7288", "S#9196", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0101", "f7289", "S#9197", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0101", "f7280", "S#9198", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0101", "f7290", "S#9199", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0101", "f7291", "S#9200", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0101", "f7292", "S#9201", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0101", "f7294", "S#9202", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0101", "f7293", "S#9203", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0101", "f7295", "S#9204", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0101", "f7296", "S#9205", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0101", "f7297", "S#9206", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0101", "f7298", "S#9207");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0101", "f7299", "S#9208", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0101", "f7300", "S#9209", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0101", "f7301", "S#9210", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0101", "f7302", "S#9211", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0101", "f7303", "S#9212", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0101", "f7304", "S#9213", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0101", "f7305", "S#9214", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0101", "f7306", "S#9215", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0101", "f7307", "S#9216", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0101", "f7308", "S#9217", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0101", "f7309", "S#9218", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0101", "f7310", "S#9219", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0101", "f7311", "S#9220", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0101", "f7312", "S#9221", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0101", "f7313", "S#9222", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0101", "f7314", "S#9223", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0101", "f7315", "S#9224", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0101", "f7316", "S#9225", 1, 0, false);
        return (SubLObject)module0101.NIL;
    }
    
    public static SubLObject f7318() {
        module0101.$g1337$ = SubLFiles.defconstant("S#9226", (SubLObject)module0101.$ic0$);
        module0101.$g1338$ = SubLFiles.defconstant("S#9227", (SubLObject)module0101.$ic37$);
        return (SubLObject)module0101.NIL;
    }
    
    public static SubLObject f7319() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0101.$g1337$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0101.$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0101.$ic8$);
        Structures.def_csetf((SubLObject)module0101.$ic9$, (SubLObject)module0101.$ic10$);
        Structures.def_csetf((SubLObject)module0101.$ic11$, (SubLObject)module0101.$ic12$);
        Equality.identity((SubLObject)module0101.$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0101.$g1337$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0101.$ic20$));
        module0021.f1098(module0101.$g1338$.getGlobalValue(), (SubLObject)module0101.$ic38$);
        Structures.register_method(module0021.$g749$.getGlobalValue(), module0101.$g1337$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0101.$ic39$));
        return (SubLObject)module0101.NIL;
    }
    
    public void declareFunctions() {
        f7317();
    }
    
    public void initializeVariables() {
        f7318();
    }
    
    public void runTopLevelForms() {
        f7319();
    }
    
    static {
        me = (SubLFile)new module0101();
        module0101.$g1337$ = null;
        module0101.$g1338$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#9187", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#9188", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9228", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9229", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAGNITUDE"), (SubLObject)SubLObjectFactory.makeKeyword("DIMENSIONS"));
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9190", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9191", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9192", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9193", "CYC"));
        $ic6$ = SubLObjectFactory.makeSymbol("S#9198", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#9189", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#9188", "CYC"));
        $ic9$ = SubLObjectFactory.makeSymbol("S#9190", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#9192", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#9191", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#9193", "CYC");
        $ic13$ = SubLObjectFactory.makeKeyword("MAGNITUDE");
        $ic14$ = SubLObjectFactory.makeKeyword("DIMENSIONS");
        $ic15$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic16$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic17$ = SubLObjectFactory.makeSymbol("S#9194", "CYC");
        $ic18$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic19$ = SubLObjectFactory.makeKeyword("END");
        $ic20$ = SubLObjectFactory.makeSymbol("S#9196", "CYC");
        $ic21$ = SubLObjectFactory.makeInteger(50);
        $ic22$ = SubLObjectFactory.makeSymbol("S#2831", "CYC");
        $ic23$ = SubLObjectFactory.makeSymbol("INTEGERP");
        $ic24$ = SubLObjectFactory.makeString("#<SVECTOR: ");
        $ic25$ = SubLObjectFactory.makeKeyword("DO-HASH-TABLE");
        $ic26$ = SubLObjectFactory.makeString(" -> ");
        $ic27$ = SubLObjectFactory.makeString(", ");
        $ic28$ = SubLObjectFactory.makeString("...");
        $ic29$ = SubLObjectFactory.makeString(">");
        $ic30$ = SubLObjectFactory.makeSymbol("NUMBERP");
        $ic31$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9230", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("VECTOR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic32$ = SubLObjectFactory.makeSymbol("CDOHASH");
        $ic33$ = SubLObjectFactory.makeSymbol("S#3341", "CYC");
        $ic34$ = SubLObjectFactory.makeString("~a is not a sparse vector with test ~a");
        $ic35$ = SubLObjectFactory.makeString("Non-matching vector tests ~a and ~a");
        $ic36$ = SubLObjectFactory.makeInteger(64);
        $ic37$ = SubLObjectFactory.makeInteger(65);
        $ic38$ = SubLObjectFactory.makeSymbol("S#9225", "CYC");
        $ic39$ = SubLObjectFactory.makeSymbol("S#9223", "CYC");
    }
    
    public static final class $sX9187_native extends SubLStructNative
    {
        public SubLObject $magnitude;
        public SubLObject $dimensions;
        private static final SubLStructDeclNative structDecl;
        
        public $sX9187_native() {
            this.$magnitude = (SubLObject)CommonSymbols.NIL;
            this.$dimensions = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX9187_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$magnitude;
        }
        
        public SubLObject getField3() {
            return this.$dimensions;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$magnitude = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$dimensions = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX9187_native.class, module0101.$ic0$, module0101.$ic1$, module0101.$ic2$, module0101.$ic3$, new String[] { "$magnitude", "$dimensions" }, module0101.$ic4$, module0101.$ic5$, module0101.$ic6$);
        }
    }
    
    public static final class $f7281$UnaryFunction extends UnaryFunction
    {
        public $f7281$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#9188"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0101.f7281(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0101.class
	Total time: 171 ms
	
	Decompiled with Procyon 0.5.32.
*/