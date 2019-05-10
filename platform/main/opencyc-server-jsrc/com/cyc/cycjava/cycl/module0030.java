package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0030 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0030";
    public static final String myFingerPrint = "90d2e4b5441d6cd31b0247129c96c19760c481a08d4f74dd572520b6acee4854";
    private static SubLSymbol $g858$;
    private static SubLSymbol $g859$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLString $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLString $ic9$;
    private static final SubLString $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLString $ic14$;
    
    public static SubLObject f1590() {
        return $g858$.getGlobalValue();
    }
    
    public static SubLObject f1591(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0004.f104(var1, $g858$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED) || NIL != module0004.f104(var1, $g859$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f1592(final SubLObject var2) {
        assert NIL != f1591(var2) : var2;
        if (var2.isSymbol()) {
            return var2;
        }
        return Sequences.find(var2, $g858$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic2$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f1593(final SubLObject var1) {
        if (NIL != f1591(var1)) {
            return var1;
        }
        if (var1.eql(Symbols.symbol_function((SubLObject)$ic3$))) {
            return Symbols.symbol_function((SubLObject)EQ);
        }
        if (var1 == $ic3$) {
            return (SubLObject)EQ;
        }
        return Errors.error((SubLObject)$ic4$, var1);
    }
    
    public static SubLObject f1594(final SubLObject var3) {
        return Numbers.numE((SubLObject)ZERO_INTEGER, Hashtables.hash_table_count(var3));
    }
    
    public static SubLObject f1595(final SubLObject var3) {
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        final Iterator var7 = Hashtables.getEntrySetIterator(var3);
        try {
            while (Hashtables.iteratorHasNext(var7)) {
                final Map.Entry var8 = Hashtables.iteratorNextEntry(var7);
                var5 = Hashtables.getEntryKey(var8);
                var6 = Hashtables.getEntryValue(var8);
                var4 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var5, var6), var4);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var7);
        }
        Hashtables.clrhash(var3);
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        var10 = var9.first();
        while (NIL != var9) {
            SubLObject var12;
            final SubLObject var11 = var12 = var10;
            SubLObject var13 = (SubLObject)NIL;
            SubLObject var14 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var12, var11, (SubLObject)$ic5$);
            var13 = var12.first();
            var12 = (var14 = var12.rest());
            Hashtables.sethash(var13, var3, var14);
            var9 = var9.rest();
            var10 = var9.first();
        }
        return var3;
    }
    
    public static SubLObject f1596(final SubLObject var3) {
        if (NIL != f1597(var3)) {
            return f1595(var3);
        }
        return var3;
    }
    
    public static SubLObject f1597(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = f1598(var3);
        var4.resetMultipleValues();
        final SubLObject var6 = Hashtables.gethash(var5, var3, (SubLObject)UNPROVIDED);
        final SubLObject var7 = var4.secondMultipleValue();
        var4.resetMultipleValues();
        return (SubLObject)makeBoolean(NIL == var7);
    }
    
    public static SubLObject f1599(final SubLObject var5, final SubLObject var16, final SubLObject var3) {
        return Hashtables.sethash(var5, var3, (SubLObject)ConsesLow.cons(var16, Hashtables.gethash(var5, var3, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f1600(final SubLObject var5, final SubLObject var16, final SubLObject var3, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = Symbols.symbol_function((SubLObject)EQL);
        }
        return Hashtables.sethash(var5, var3, conses_high.adjoin(var16, Hashtables.gethash(var5, var3, (SubLObject)UNPROVIDED), var2, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f1601(final SubLObject var5, final SubLObject var16, final SubLObject var3) {
        return Hashtables.sethash(var5, var3, module0035.f2084(var16, Hashtables.gethash(var5, var3, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f1602(final SubLObject var5, final SubLObject var3, final SubLObject var16, SubLObject var17, SubLObject var18) {
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)$ic6$;
        }
        if (var18 == UNPROVIDED) {
            var18 = Symbols.symbol_function((SubLObject)$ic7$);
        }
        assert NIL != Types.hash_table_p(var3) : var3;
        SubLObject var19 = Hashtables.gethash(var5, var3, (SubLObject)UNPROVIDED);
        if (var19.isList()) {
            var19 = module0035.f2244(var16, var19, var17, var18);
            return Hashtables.sethash(var5, var3, var19);
        }
        Errors.error((SubLObject)$ic9$, var19);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1603(final SubLObject var5, final SubLObject var16, final SubLObject var3) {
        return Hashtables.sethash(var5, var3, module0035.f2086(var16, Hashtables.gethash(var5, var3, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f1604(final SubLObject var5, final SubLObject var3) {
        final SubLObject var6 = Hashtables.gethash_without_values(var5, var3, (SubLObject)UNPROVIDED);
        Hashtables.sethash(var5, var3, var6.rest());
        return var6.first();
    }
    
    public static SubLObject f1605(final SubLObject var5, final SubLObject var16, final SubLObject var3, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = Symbols.symbol_function((SubLObject)EQL);
        }
        return Hashtables.sethash(var5, var3, Sequences.remove(var16, Hashtables.gethash(var5, var3, (SubLObject)UNPROVIDED), var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f1606(final SubLObject var5, final SubLObject var3, SubLObject var20) {
        if (var20 == UNPROVIDED) {
            var20 = (SubLObject)NIL;
        }
        final SubLThread var21 = SubLProcess.currentSubLThread();
        var21.resetMultipleValues();
        final SubLObject var22 = Hashtables.gethash(var5, var3, var20);
        final SubLObject var23 = var21.secondMultipleValue();
        var21.resetMultipleValues();
        if (var22.isList()) {
            return Values.values(var22.first(), var23);
        }
        return Values.values(var22, var23);
    }
    
    public static SubLObject f1607(final SubLObject var5, final SubLObject var3, final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        SubLObject var8 = (SubLObject)NIL;
        var7.resetMultipleValues();
        final SubLObject var9 = Hashtables.gethash(var5, var3, (SubLObject)UNPROVIDED);
        final SubLObject var10 = var7.secondMultipleValue();
        var7.resetMultipleValues();
        if (NIL == var10) {
            var8 = (SubLObject)ConsesLow.list(var6);
        }
        else if (var9.isList()) {
            var8 = (SubLObject)ConsesLow.cons(var6, var9.rest());
        }
        else {
            var8 = (SubLObject)ConsesLow.list(var6, var9);
        }
        return Hashtables.sethash(var5, var3, var8);
    }
    
    public static SubLObject f1608(final SubLObject var5, final SubLObject var16, final SubLObject var3) {
        return Hashtables.sethash(var5, var3, ConsesLow.nconc(var16, Hashtables.gethash(var5, var3, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f1609(final SubLObject var5, final SubLObject var16, final SubLObject var3) {
        return Hashtables.sethash(var5, var3, ConsesLow.nconc(Hashtables.gethash(var5, var3, (SubLObject)UNPROVIDED), var16));
    }
    
    public static SubLObject f1610(final SubLObject var24, final SubLObject var25) {
        SubLObject var26 = (SubLObject)NIL;
        SubLObject var27 = (SubLObject)NIL;
        final Iterator var28 = Hashtables.getEntrySetIterator(var24);
        try {
            while (Hashtables.iteratorHasNext(var28)) {
                final Map.Entry var29 = Hashtables.iteratorNextEntry(var28);
                var26 = Hashtables.getEntryKey(var29);
                var27 = Hashtables.getEntryValue(var29);
                Hashtables.sethash(var26, var25, var27);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var28);
        }
        return var25;
    }
    
    public static SubLObject f1611(final SubLObject var28, SubLObject var29) {
        if (var29 == UNPROVIDED) {
            var29 = Hashtables.hash_table_count(var28);
        }
        assert NIL != Types.hash_table_p(var28) : var28;
        final SubLObject var30 = Hashtables.hash_table_test(var28);
        final SubLObject var31 = Hashtables.make_hash_table(var29, var30, (SubLObject)UNPROVIDED);
        f1610(var28, var31);
        return var31;
    }
    
    public static SubLObject f1612(final SubLObject var5, final SubLObject var3, final SubLObject var31) {
        return Hashtables.sethash(var5, var3, Functions.funcall(var31, Hashtables.gethash(var5, var3, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f1613(final SubLObject var5, final SubLObject var16, final SubLObject var3, SubLObject var2, SubLObject var32) {
        if (var2 == UNPROVIDED) {
            var2 = Symbols.symbol_function((SubLObject)EQL);
        }
        if (var32 == UNPROVIDED) {
            var32 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        return Hashtables.sethash(var5, var3, Sequences.delete(var16, Hashtables.gethash(var5, var3, (SubLObject)UNPROVIDED), var2, var32, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f1614(final SubLObject var5, final SubLObject var16, final SubLObject var3, SubLObject var2, SubLObject var32) {
        if (var2 == UNPROVIDED) {
            var2 = Symbols.symbol_function((SubLObject)EQL);
        }
        if (var32 == UNPROVIDED) {
            var32 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        final SubLObject var33 = Sequences.delete(var16, Hashtables.gethash(var5, var3, (SubLObject)UNPROVIDED), var2, var32, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != var33) {
            return Hashtables.sethash(var5, var3, var33);
        }
        return Hashtables.remhash(var5, var3);
    }
    
    public static SubLObject f1615(final SubLObject var5, final SubLObject var3, SubLObject var33, SubLObject var34) {
        if (var33 == UNPROVIDED) {
            var33 = (SubLObject)ONE_INTEGER;
        }
        if (var34 == UNPROVIDED) {
            var34 = var33;
        }
        final SubLThread var35 = SubLProcess.currentSubLThread();
        assert NIL != Types.hash_table_p(var3) : var3;
        final SubLObject var36 = Hashtables.gethash(var5, var3, (SubLObject)UNPROVIDED);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var35) && NIL != var36 && !var36.isNumber()) {
            Errors.error((SubLObject)$ic10$, var5, var36, var3);
        }
        return Hashtables.sethash(var5, var3, (NIL != var36) ? Numbers.add(var36, var33) : var34);
    }
    
    public static SubLObject f1616(final SubLObject var5, final SubLObject var36, final SubLObject var3, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = Symbols.symbol_function((SubLObject)EQL);
        }
        return Hashtables.sethash(var5, var3, conses_high.nunion(Hashtables.gethash(var5, var3, (SubLObject)UNPROVIDED), var36, var2, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f1617(final SubLObject var5, final SubLObject var36, final SubLObject var3, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = Symbols.symbol_function((SubLObject)EQL);
        }
        return Hashtables.sethash(var5, var3, conses_high.nset_difference(Hashtables.gethash(var5, var3, (SubLObject)UNPROVIDED), var36, var2, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f1618(final SubLObject var37, final SubLObject var38, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = Symbols.symbol_function((SubLObject)EQL);
        }
        SubLObject var39 = (SubLObject)NIL;
        SubLObject var40 = (SubLObject)NIL;
        SubLObject var41 = (SubLObject)NIL;
        final Iterator var42 = Hashtables.getEntrySetIterator(var37);
        try {
            while (Hashtables.iteratorHasNext(var42)) {
                final Map.Entry var43 = Hashtables.iteratorNextEntry(var42);
                var40 = Hashtables.getEntryKey(var43);
                var41 = Hashtables.getEntryValue(var43);
                if (NIL == Functions.funcall(var2, var41, Hashtables.gethash(var40, var38, (SubLObject)UNPROVIDED))) {
                    var39 = (SubLObject)ConsesLow.cons(var40, var39);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var42);
        }
        return var39;
    }
    
    public static SubLObject f1619(final SubLObject var37, final SubLObject var38) {
        SubLObject var39 = (SubLObject)NIL;
        SubLObject var40 = (SubLObject)NIL;
        SubLObject var41 = (SubLObject)NIL;
        final Iterator var42 = Hashtables.getEntrySetIterator(var37);
        try {
            while (Hashtables.iteratorHasNext(var42)) {
                final Map.Entry var43 = Hashtables.iteratorNextEntry(var42);
                var40 = Hashtables.getEntryKey(var43);
                var41 = Hashtables.getEntryValue(var43);
                if ($ic11$ == Hashtables.gethash(var40, var38, (SubLObject)$ic11$)) {
                    var39 = (SubLObject)ConsesLow.cons(var40, var39);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var42);
        }
        return var39;
    }
    
    public static SubLObject f1620(final SubLObject var5, final SubLObject var16, final SubLObject var3, SubLObject var40, SubLObject var41) {
        if (var40 == UNPROVIDED) {
            var40 = Symbols.symbol_function((SubLObject)EQL);
        }
        if (var41 == UNPROVIDED) {
            var41 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        return module0004.f104(var16, Hashtables.gethash(var5, var3, (SubLObject)UNPROVIDED), var40, var41);
    }
    
    public static SubLObject f1621(final SubLObject var42, final SubLObject var43) {
        SubLObject var44 = (SubLObject)NIL;
        if (NIL == var44) {
            SubLObject var45 = var42;
            SubLObject var46 = (SubLObject)NIL;
            var46 = var45.first();
            while (NIL == var44 && NIL != var45) {
                if (NIL == Hashtables.gethash(var46, var43, (SubLObject)UNPROVIDED)) {
                    var44 = (SubLObject)T;
                }
                var45 = var45.rest();
                var46 = var45.first();
            }
        }
        return (SubLObject)makeBoolean(NIL == var44);
    }
    
    public static SubLObject f1622(final SubLObject var46, final SubLObject var17, SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        assert NIL != Types.hash_table_p(var46) : var46;
        final SubLObject var47 = Hashtables.hash_table_count(var46);
        if (var47.numG((SubLObject)ZERO_INTEGER)) {
            SubLObject var48 = Vectors.make_vector(var47, (SubLObject)UNPROVIDED);
            SubLObject var49 = (SubLObject)NIL;
            SubLObject var50 = (SubLObject)ZERO_INTEGER;
            SubLObject var51 = (SubLObject)NIL;
            SubLObject var52 = (SubLObject)NIL;
            final Iterator var53 = Hashtables.getEntrySetIterator(var46);
            try {
                while (Hashtables.iteratorHasNext(var53)) {
                    final Map.Entry var54 = Hashtables.iteratorNextEntry(var53);
                    var51 = Hashtables.getEntryKey(var54);
                    var52 = Hashtables.getEntryValue(var54);
                    Vectors.set_aref(var48, var50, var52);
                    var50 = Numbers.add(var50, (SubLObject)ONE_INTEGER);
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(var53);
            }
            var48 = Sort.sort(var48, var17, var5);
            SubLObject var55;
            SubLObject var50_53;
            for (var55 = Sequences.length(var48), var50_53 = (SubLObject)NIL, var50_53 = (SubLObject)ZERO_INTEGER; var50_53.numL(var55); var50_53 = Numbers.add(var50_53, (SubLObject)ONE_INTEGER)) {
                var49 = (SubLObject)ConsesLow.cons(Vectors.aref(var48, var50_53), var49);
            }
            return Sequences.nreverse(var49);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1623(final SubLObject var54, final SubLObject var3) {
        final SubLThread var55 = SubLProcess.currentSubLThread();
        SubLObject var56 = (SubLObject)ZERO_INTEGER;
        SubLObject var57 = (SubLObject)NIL;
        SubLObject var58 = (SubLObject)NIL;
        try {
            var55.throwStack.push($ic12$);
            SubLObject var59 = (SubLObject)NIL;
            SubLObject var60 = (SubLObject)NIL;
            final Iterator var61 = Hashtables.getEntrySetIterator(var3);
            try {
                while (Hashtables.iteratorHasNext(var61)) {
                    final Map.Entry var62 = Hashtables.iteratorNextEntry(var61);
                    var59 = Hashtables.getEntryKey(var62);
                    var60 = Hashtables.getEntryValue(var62);
                    if (var56.numGE(var54)) {
                        module0012.f425();
                    }
                    var56 = Numbers.add(var56, (SubLObject)ONE_INTEGER);
                    var57 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var59, var60), var57);
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(var61);
            }
        }
        catch (Throwable var63) {
            var58 = Errors.handleThrowable(var63, (SubLObject)$ic12$);
        }
        finally {
            var55.throwStack.pop();
        }
        return Sequences.nreverse(var57);
    }
    
    public static SubLObject f1624(final SubLObject var28) {
        return f1625(var28);
    }
    
    public static SubLObject f1598(final SubLObject var28) {
        SubLObject var29 = (SubLObject)NIL;
        SubLObject var30 = (SubLObject)NIL;
        final Iterator var31 = Hashtables.getEntrySetIterator(var28);
        try {
            if (Hashtables.iteratorHasNext(var31)) {
                final Map.Entry var32 = Hashtables.iteratorNextEntry(var31);
                var29 = Hashtables.getEntryKey(var32);
                var30 = Hashtables.getEntryValue(var32);
                return var29;
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var31);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1626(final SubLObject var28) {
        SubLObject var29 = (SubLObject)NIL;
        SubLObject var30 = (SubLObject)NIL;
        final Iterator var31 = Hashtables.getEntrySetIterator(var28);
        try {
            if (Hashtables.iteratorHasNext(var31)) {
                final Map.Entry var32 = Hashtables.iteratorNextEntry(var31);
                var29 = Hashtables.getEntryKey(var32);
                var30 = Hashtables.getEntryValue(var32);
                return var30;
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var31);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1625(final SubLObject var28) {
        assert NIL != Types.hash_table_p(var28) : var28;
        SubLObject var30;
        final SubLObject var29 = var30 = (SubLObject)ConsesLow.make_list(Hashtables.hash_table_count(var28), (SubLObject)UNPROVIDED);
        SubLObject var31 = (SubLObject)NIL;
        SubLObject var32 = (SubLObject)NIL;
        final Iterator var33 = Hashtables.getEntrySetIterator(var28);
        try {
            while (Hashtables.iteratorHasNext(var33)) {
                final Map.Entry var34 = Hashtables.iteratorNextEntry(var33);
                var31 = Hashtables.getEntryKey(var34);
                var32 = Hashtables.getEntryValue(var34);
                ConsesLow.rplaca(var30, var31);
                var30 = var30.rest();
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var33);
        }
        return var29;
    }
    
    public static SubLObject f1627(final SubLObject var28) {
        assert NIL != Types.hash_table_p(var28) : var28;
        SubLObject var30;
        final SubLObject var29 = var30 = (SubLObject)ConsesLow.make_list(Hashtables.hash_table_count(var28), (SubLObject)UNPROVIDED);
        SubLObject var31 = (SubLObject)NIL;
        SubLObject var32 = (SubLObject)NIL;
        final Iterator var33 = Hashtables.getEntrySetIterator(var28);
        try {
            while (Hashtables.iteratorHasNext(var33)) {
                final Map.Entry var34 = Hashtables.iteratorNextEntry(var33);
                var31 = Hashtables.getEntryKey(var34);
                var32 = Hashtables.getEntryValue(var34);
                ConsesLow.rplaca(var30, var32);
                var30 = var30.rest();
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var33);
        }
        return var29;
    }
    
    public static SubLObject f1628(final SubLObject var28, final SubLObject var60, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = Symbols.symbol_function((SubLObject)EQL);
        }
        SubLObject var61 = (SubLObject)NIL;
        SubLObject var62 = (SubLObject)NIL;
        SubLObject var63 = (SubLObject)NIL;
        final Iterator var64 = Hashtables.getEntrySetIterator(var28);
        try {
            while (Hashtables.iteratorHasNext(var64)) {
                final Map.Entry var65 = Hashtables.iteratorNextEntry(var64);
                var62 = Hashtables.getEntryKey(var65);
                var63 = Hashtables.getEntryValue(var65);
                if (NIL != Functions.funcall(var2, var63, var60)) {
                    var61 = (SubLObject)ConsesLow.cons(var62, var61);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var64);
        }
        return Sequences.nreverse(var61);
    }
    
    public static SubLObject f1629(final SubLObject var28, final SubLObject var60, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = Symbols.symbol_function((SubLObject)EQL);
        }
        return module0035.f2099(f1628(var28, var60, var2));
    }
    
    public static SubLObject f1630(final SubLObject var28) {
        assert NIL != Types.hash_table_p(var28) : var28;
        final SubLObject var29 = Hashtables.hash_table_test(var28);
        SubLObject var30 = (SubLObject)NIL;
        SubLObject var31 = (SubLObject)NIL;
        SubLObject var32 = (SubLObject)NIL;
        final Iterator var33 = Hashtables.getEntrySetIterator(var28);
        try {
            while (Hashtables.iteratorHasNext(var33)) {
                final Map.Entry var34 = Hashtables.iteratorNextEntry(var33);
                var31 = Hashtables.getEntryKey(var34);
                var32 = Hashtables.getEntryValue(var34);
                var30 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var31, var32), var30);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var33);
        }
        return Values.values(var30, var29);
    }
    
    public static SubLObject f1631(final SubLObject var62, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = Symbols.symbol_function((SubLObject)EQL);
        }
        final SubLObject var63 = Hashtables.make_hash_table(Sequences.length(var62), var2, (SubLObject)UNPROVIDED);
        SubLObject var64 = var62;
        SubLObject var65 = (SubLObject)NIL;
        var65 = var64.first();
        while (NIL != var64) {
            SubLObject var67;
            final SubLObject var66 = var67 = var65;
            SubLObject var68 = (SubLObject)NIL;
            SubLObject var69 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var67, var66, (SubLObject)$ic5$);
            var68 = var67.first();
            var67 = (var69 = var67.rest());
            Hashtables.sethash(var68, var63, var69);
            var64 = var64.rest();
            var65 = var64.first();
        }
        return var63;
    }
    
    public static SubLObject f1632(final SubLObject var46) {
        SubLObject var47 = (SubLObject)NIL;
        SubLObject var48 = (SubLObject)NIL;
        SubLObject var49 = (SubLObject)NIL;
        final Iterator var50 = Hashtables.getEntrySetIterator(var46);
        try {
            while (Hashtables.iteratorHasNext(var50)) {
                final Map.Entry var51 = Hashtables.iteratorNextEntry(var50);
                var48 = Hashtables.getEntryKey(var51);
                var49 = Hashtables.getEntryValue(var51);
                var47 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var48, var49), var47);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var50);
        }
        return var47;
    }
    
    public static SubLObject f1633(final SubLObject var3, SubLObject var20) {
        if (var20 == UNPROVIDED) {
            var20 = (SubLObject)ZERO_INTEGER;
        }
        SubLObject var21 = (SubLObject)NIL;
        if (var3.isHashtable()) {
            SubLObject var22 = (SubLObject)NIL;
            SubLObject var23 = (SubLObject)NIL;
            final Iterator var24 = Hashtables.getEntrySetIterator(var3);
            try {
                while (Hashtables.iteratorHasNext(var24)) {
                    final Map.Entry var25 = Hashtables.iteratorNextEntry(var24);
                    var22 = Hashtables.getEntryKey(var25);
                    var23 = Hashtables.getEntryValue(var25);
                    if (!var23.isCons()) {
                        continue;
                    }
                    if (NIL == var21) {
                        var21 = Sequences.length(var23);
                    }
                    else {
                        if (ZERO_INTEGER.numE(var21)) {
                            continue;
                        }
                        final SubLObject var26 = Sequences.length(var23);
                        if (!var21.numG(var26)) {
                            continue;
                        }
                        var21 = var26;
                    }
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(var24);
            }
        }
        return var21.isNumber() ? var21 : var20;
    }
    
    public static SubLObject f1634(final SubLObject var3, SubLObject var20) {
        if (var20 == UNPROVIDED) {
            var20 = (SubLObject)ZERO_INTEGER;
        }
        SubLObject var21 = (SubLObject)NIL;
        if (var3.isHashtable()) {
            SubLObject var22 = (SubLObject)NIL;
            SubLObject var23 = (SubLObject)NIL;
            final Iterator var24 = Hashtables.getEntrySetIterator(var3);
            try {
                while (Hashtables.iteratorHasNext(var24)) {
                    final Map.Entry var25 = Hashtables.iteratorNextEntry(var24);
                    var22 = Hashtables.getEntryKey(var25);
                    var23 = Hashtables.getEntryValue(var25);
                    if (!var23.isHashtable()) {
                        continue;
                    }
                    if (NIL == var21) {
                        var21 = Hashtables.hash_table_count(var23);
                    }
                    else {
                        if (ZERO_INTEGER.numE(var21)) {
                            continue;
                        }
                        final SubLObject var26 = Hashtables.hash_table_count(var23);
                        if (!var21.numG(var26)) {
                            continue;
                        }
                        var21 = var26;
                    }
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(var24);
            }
        }
        return var21.isNumber() ? var21 : var20;
    }
    
    public static SubLObject f1635(final SubLObject var42, SubLObject var2, SubLObject var29, SubLObject var70) {
        if (var2 == UNPROVIDED) {
            var2 = Symbols.symbol_function((SubLObject)EQUAL);
        }
        if (var29 == UNPROVIDED) {
            var29 = Sequences.length(var42);
        }
        if (var70 == UNPROVIDED) {
            var70 = Symbols.symbol_function((SubLObject)$ic13$);
        }
        final SubLObject var71 = Hashtables.make_hash_table(var29, var2, (SubLObject)UNPROVIDED);
        SubLObject var72 = var42;
        SubLObject var73 = (SubLObject)NIL;
        var73 = var72.first();
        while (NIL != var72) {
            Hashtables.sethash(var73, var71, (SubLObject)(var70.eql(Symbols.symbol_function((SubLObject)$ic13$)) ? T : Functions.funcall(var70, var73)));
            var72 = var72.rest();
            var73 = var72.first();
        }
        return var71;
    }
    
    public static SubLObject f1636(final SubLObject var46, final SubLObject var72, final SubLObject var73) {
        SubLObject var74 = (SubLObject)NIL;
        SubLObject var75 = (SubLObject)NIL;
        SubLObject var76 = (SubLObject)NIL;
        final Iterator var77 = Hashtables.getEntrySetIterator(var46);
        try {
            while (Hashtables.iteratorHasNext(var77)) {
                final Map.Entry var78 = Hashtables.iteratorNextEntry(var77);
                var75 = Hashtables.getEntryKey(var78);
                var76 = Hashtables.getEntryValue(var78);
                if (NIL != Functions.funcall(var72, var75) && NIL != Functions.funcall(var73, var76)) {
                    var74 = (SubLObject)ConsesLow.cons(var75, var74);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var77);
        }
        return var74;
    }
    
    public static SubLObject f1637(final SubLObject var46, final SubLObject var72, final SubLObject var73) {
        SubLObject var74 = (SubLObject)NIL;
        SubLObject var75 = (SubLObject)NIL;
        SubLObject var76 = (SubLObject)NIL;
        final Iterator var77 = Hashtables.getEntrySetIterator(var46);
        try {
            while (Hashtables.iteratorHasNext(var77)) {
                final Map.Entry var78 = Hashtables.iteratorNextEntry(var77);
                var75 = Hashtables.getEntryKey(var78);
                var76 = Hashtables.getEntryValue(var78);
                if (NIL != Functions.funcall(var72, var75)) {
                    if (NIL != Functions.funcall(var73, var76)) {
                        continue;
                    }
                    var74 = (SubLObject)ConsesLow.cons(var75, var74);
                }
                else {
                    var74 = (SubLObject)ConsesLow.cons(var75, var74);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var77);
        }
        return var74;
    }
    
    public static SubLObject f1638(final SubLObject var46, SubLObject var75) {
        if (var75 == UNPROVIDED) {
            var75 = (SubLObject)T;
        }
        SubLObject var76 = (SubLObject)NIL;
        SubLObject var77 = (SubLObject)NIL;
        final Iterator var78 = Hashtables.getEntrySetIterator(var46);
        try {
            while (Hashtables.iteratorHasNext(var78)) {
                final Map.Entry var79 = Hashtables.iteratorNextEntry(var78);
                var76 = Hashtables.getEntryKey(var79);
                var77 = Hashtables.getEntryValue(var79);
                PrintLow.format(var75, (SubLObject)$ic14$, var76, var77);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var78);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1639(final SubLObject var46) {
        assert NIL != Types.hash_table_p(var46) : var46;
        final SubLObject var47 = Hashtables.hash_table_count(var46);
        final SubLObject var48 = Hashtables.make_hash_table(var47, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
        SubLObject var49 = (SubLObject)NIL;
        SubLObject var50 = (SubLObject)NIL;
        final Iterator var51 = Hashtables.getEntrySetIterator(var46);
        try {
            while (Hashtables.iteratorHasNext(var51)) {
                final Map.Entry var52 = Hashtables.iteratorNextEntry(var51);
                var49 = Hashtables.getEntryKey(var52);
                var50 = Hashtables.getEntryValue(var52);
                Hashtables.sethash(Hashtables.gethash_bucket(var49, var46), var48, Numbers.add(Hashtables.gethash(Hashtables.gethash_bucket(var49, var46), var48, (SubLObject)ZERO_INTEGER), (SubLObject)ONE_INTEGER));
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var51);
        }
        final SubLObject var53 = Hashtables.hash_table_count(var48);
        final SubLObject var54 = Numbers.subtract(var47, var53);
        return var54;
    }
    
    public static SubLObject f1640(final SubLObject var46) {
        return Numbers.divide(f1639(var46), Hashtables.hash_table_count(var46));
    }
    
    public static SubLObject f1641() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0030", "f1590", "S#2830", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0030", "f1591", "S#2831", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0030", "f1592", "S#2035", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0030", "f1593", "S#2832", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0030", "f1594", "S#2833", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0030", "f1595", "S#2834", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0030", "f1596", "S#2835", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0030", "f1597", "S#2836", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0030", "f1599", "S#2837", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0030", "f1600", "S#2838", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0030", "f1601", "S#2839", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0030", "f1602", "S#2840", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0030", "f1603", "S#2841", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0030", "f1604", "S#2842", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0030", "f1605", "S#2527", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0030", "f1606", "S#2843", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0030", "f1607", "S#2844", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0030", "f1608", "S#2845", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0030", "f1609", "S#2846", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0030", "f1610", "S#2847", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0030", "f1611", "S#2848", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0030", "f1612", "S#2849", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0030", "f1613", "S#2850", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0030", "f1614", "S#2851", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0030", "f1615", "S#2852", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0030", "f1616", "S#2853", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0030", "f1617", "S#2854", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0030", "f1618", "S#2855", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0030", "f1619", "S#2856", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0030", "f1620", "S#2857", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0030", "f1621", "S#2858", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0030", "f1622", "S#2859", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0030", "f1623", "S#2860", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0030", "f1624", "S#2861", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0030", "f1598", "S#2862", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0030", "f1626", "S#2863", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0030", "f1625", "S#815", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0030", "f1627", "S#207", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0030", "f1628", "S#2864", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0030", "f1629", "S#2865", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0030", "f1630", "S#2866", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0030", "f1631", "S#2867", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0030", "f1632", "S#2868", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0030", "f1633", "S#2869", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0030", "f1634", "S#2870", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0030", "f1635", "S#2871", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0030", "f1636", "S#2872", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0030", "f1637", "S#2873", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0030", "f1638", "S#2874", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0030", "f1639", "S#2875", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0030", "f1640", "S#2876", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1642() {
        $g858$ = SubLFiles.defconstant("S#2877", (SubLObject)$ic0$);
        $g859$ = SubLFiles.defconstant("S#2878", (SubLObject)ConsesLow.list(Symbols.symbol_function((SubLObject)EQ), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)EQUALP)));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1643() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f1641();
    }
    
    public void initializeVariables() {
        f1642();
    }
    
    public void runTopLevelForms() {
        f1643();
    }
    
    static {
        me = (SubLFile)new module0030();
        $g858$ = null;
        $g859$ = null;
        $ic0$ = ConsesLow.list((SubLObject)EQ, (SubLObject)EQL, (SubLObject)EQUAL, (SubLObject)EQUALP);
        $ic1$ = makeSymbol("S#2831", "CYC");
        $ic2$ = makeSymbol("SYMBOL-FUNCTION");
        $ic3$ = makeSymbol("S#2879", "CYC");
        $ic4$ = makeString("~S cannot be coerced into a valid SubL hash test");
        $ic5$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"));
        $ic6$ = makeSymbol("STRING<=");
        $ic7$ = makeSymbol("SYMBOL-NAME");
        $ic8$ = makeSymbol("HASH-TABLE-P");
        $ic9$ = makeString("Corrupted hash table; attempting to add values on a non-listp ~a.~%");
        $ic10$ = makeString("The key ~S maps to the non-numeric value ~S in the hashtable ~A.");
        $ic11$ = makeKeyword("NOTHING");
        $ic12$ = makeKeyword("MAPPING-DONE");
        $ic13$ = makeSymbol("TRUE");
        $ic14$ = makeString("~S -> ~S~%");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 180 ms
	
	Decompiled with Procyon 0.5.32.
*/