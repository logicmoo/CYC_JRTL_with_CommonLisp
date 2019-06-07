package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0762 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0762";
    public static final String myFingerPrint = "c3923bda562d397a79689aa0d938edd57d884508e0cf5415de0e486329a86440";
    private static SubLSymbol $g6101$;
    private static SubLSymbol $g6102$;
    private static SubLSymbol $g6103$;
    private static SubLSymbol $g6104$;
    private static SubLSymbol $g6105$;
    private static SubLSymbol $g6106$;
    private static final SubLList $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLInteger $ic3$;
    private static final SubLList $ic4$;
    private static final SubLString $ic5$;
    private static final SubLString $ic6$;
    private static final SubLList $ic7$;
    private static final SubLString $ic8$;
    private static final SubLString $ic9$;
    private static final SubLString $ic10$;
    private static final SubLString $ic11$;
    private static final SubLString $ic12$;
    private static final SubLString $ic13$;
    private static final SubLString $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLString $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLList $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLList $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLList $ic27$;
    private static final SubLList $ic28$;
    private static final SubLString $ic29$;
    private static final SubLString $ic30$;
    private static final SubLString $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLObject $ic35$;
    private static final SubLObject $ic36$;
    private static final SubLList $ic37$;
    private static final SubLList $ic38$;
    private static final SubLList $ic39$;
    private static final SubLList $ic40$;
    private static final SubLList $ic41$;
    private static final SubLObject $ic42$;
    private static final SubLList $ic43$;
    private static final SubLObject $ic44$;
    private static final SubLObject $ic45$;
    private static final SubLObject $ic46$;
    private static final SubLObject $ic47$;
    private static final SubLObject $ic48$;
    private static final SubLObject $ic49$;
    private static final SubLObject $ic50$;
    private static final SubLList $ic51$;
    private static final SubLObject $ic52$;
    private static final SubLObject $ic53$;
    private static final SubLObject $ic54$;
    private static final SubLObject $ic55$;
    private static final SubLObject $ic56$;
    private static final SubLObject $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLObject $ic61$;
    private static final SubLObject $ic62$;
    private static final SubLObject $ic63$;
    private static final SubLObject $ic64$;
    private static final SubLObject $ic65$;
    private static final SubLObject $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLString $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLString $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLString $ic77$;
    private static final SubLString $ic78$;
    private static final SubLString $ic79$;
    private static final SubLList $ic80$;
    private static final SubLString $ic81$;
    private static final SubLObject $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLList $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLObject $ic93$;
    private static final SubLObject $ic94$;
    private static final SubLObject $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLObject $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLList $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLString $ic105$;
    private static final SubLObject $ic106$;
    private static final SubLString $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLInteger $ic110$;
    private static final SubLObject $ic111$;
    private static final SubLObject $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLObject $ic114$;
    private static final SubLList $ic115$;
    private static final SubLObject $ic116$;
    private static final SubLList $ic117$;
    
    public static SubLObject f48141(final SubLObject var1) {
        final SubLObject var2 = f48142(var1);
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)ZERO_INTEGER;
        SubLObject var6 = var2;
        SubLObject var7 = (SubLObject)NIL;
        var7 = var6.first();
        while (NIL != var6) {
            final SubLObject var8 = f48143(var7);
            final SubLObject var9 = f48144(var7, var4);
            var5 = Numbers.add(var5, var9);
            if (NIL != var8) {
                if (NIL != module0578.f35470((SubLObject)THREE_INTEGER)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic5$, new SubLObject[] { Sequences.length(var8), var7, var8 });
                }
            }
            else if (NIL != module0578.f35470((SubLObject)TWO_INTEGER) && NIL == module0578.f35477()) {
                Errors.warn((SubLObject)$ic6$, var7);
            }
            SubLObject var6_10 = var8;
            SubLObject var10 = (SubLObject)NIL;
            var10 = var6_10.first();
            while (NIL != var6_10) {
                SubLObject var12;
                final SubLObject var11 = var12 = var10;
                SubLObject var13 = (SubLObject)NIL;
                SubLObject var14 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var12, var11, (SubLObject)$ic7$);
                var13 = var12.first();
                var12 = var12.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var12, var11, (SubLObject)$ic7$);
                var14 = var12.first();
                var12 = var12.rest();
                if (NIL == var12) {
                    final SubLObject var15 = f48145(var14);
                    final SubLObject var16 = Numbers.add(var5, var15);
                    final SubLObject var17 = (SubLObject)ConsesLow.list(var13, var16);
                    if (NIL == conses_high.member(var17, var3, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                        var3 = (SubLObject)ConsesLow.cons(var17, var3);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var11, (SubLObject)$ic7$);
                }
                var6_10 = var6_10.rest();
                var10 = var6_10.first();
            }
            var4 = var7;
            var6 = var6.rest();
            var7 = var6.first();
        }
        var3 = f48146(Sequences.nreverse(var3));
        if (NIL != var3) {
            if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic8$, var1, var3);
            }
        }
        else if (NIL != module0578.f35470((SubLObject)ONE_INTEGER) && NIL == module0578.f35477()) {
            Errors.warn((SubLObject)$ic9$, var1);
        }
        return var3;
    }
    
    public static SubLObject f48147(final SubLObject var19, final SubLObject var7, final SubLObject var20) {
        if (NIL == f48148(var7)) {
            final SubLObject var21 = Sequences.cconcatenate((SubLObject)$ic10$, new SubLObject[] { module0006.f205((SubLObject)TWO_INTEGER), $ic11$, module0006.f203((SubLObject)$ic12$) });
            module0578.f35476(var21, (SubLObject)ConsesLow.list(var7));
            return (SubLObject)NIL;
        }
        if (!var19.isSymbol()) {
            final SubLObject var21 = Sequences.cconcatenate((SubLObject)$ic10$, new SubLObject[] { module0006.f205((SubLObject)TWO_INTEGER), $ic11$, module0006.f203((SubLObject)$ic13$) });
            module0578.f35476(var21, (SubLObject)ConsesLow.list(var19));
            return (SubLObject)NIL;
        }
        if (NIL == f48149(var20)) {
            final SubLObject var21 = Sequences.cconcatenate((SubLObject)$ic10$, new SubLObject[] { module0006.f205((SubLObject)TWO_INTEGER), $ic11$, module0006.f203((SubLObject)$ic14$) });
            module0578.f35476(var21, (SubLObject)ConsesLow.list(var7, $g6104$.getGlobalValue()));
            return (SubLObject)NIL;
        }
        final SubLObject var22 = f48150(var7);
        final SubLObject var23 = (SubLObject)ConsesLow.list(var19, var20);
        final SubLObject var24 = f48151((SubLObject)ConsesLow.cons(var23, Sequences.remove(var19, var22, Symbols.symbol_function((SubLObject)EQ), Symbols.symbol_function((SubLObject)$ic15$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
        Hashtables.sethash(var7, $g6103$.getGlobalValue(), var24);
        return f48150(var7);
    }
    
    public static SubLObject f48152(final SubLObject var19, final SubLObject var7) {
        if (NIL == f48148(var7)) {
            final SubLObject var20 = Sequences.cconcatenate((SubLObject)$ic10$, new SubLObject[] { module0006.f205((SubLObject)TWO_INTEGER), $ic11$, module0006.f203((SubLObject)$ic12$) });
            module0578.f35476(var20, (SubLObject)ConsesLow.list(var7));
            return (SubLObject)NIL;
        }
        if (!var19.isSymbol()) {
            final SubLObject var20 = Sequences.cconcatenate((SubLObject)$ic10$, new SubLObject[] { module0006.f205((SubLObject)TWO_INTEGER), $ic11$, module0006.f203((SubLObject)$ic13$) });
            module0578.f35476(var20, (SubLObject)ConsesLow.list(var19));
            return (SubLObject)NIL;
        }
        final SubLObject var21 = f48150(var7);
        final SubLObject var22 = conses_high.assoc(var19, var21, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL == var22) {
            if (NIL != module0578.f35470((SubLObject)THREE_INTEGER) && NIL == module0578.f35477()) {
                Errors.warn((SubLObject)$ic16$, var19, var7);
            }
        }
        else {
            Hashtables.sethash(var7, $g6103$.getGlobalValue(), Sequences.remove(var22, var21, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        return f48150(var7);
    }
    
    public static SubLObject f48153(final SubLObject var14, final SubLObject var27) {
        SubLObject var28 = (SubLObject)NIL;
        if (NIL != var27) {
            SubLObject var29 = f48150(var27);
            SubLObject var30 = (SubLObject)NIL;
            var30 = var29.first();
            while (NIL != var29) {
                SubLObject var32;
                final SubLObject var31 = var32 = var30;
                SubLObject var33 = (SubLObject)NIL;
                SubLObject var34 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)$ic19$);
                var33 = var32.first();
                var32 = var32.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)$ic19$);
                var34 = var32.first();
                var32 = var32.rest();
                if (NIL == var32) {
                    if (var33.eql(var14)) {
                        var28 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var27, var34), var28);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var31, (SubLObject)$ic19$);
                }
                var29 = var29.rest();
                var30 = var29.first();
            }
        }
        else {
            SubLObject var35 = (SubLObject)NIL;
            SubLObject var36 = (SubLObject)NIL;
            final Iterator var37 = Hashtables.getEntrySetIterator($g6103$.getGlobalValue());
            try {
                while (Hashtables.iteratorHasNext(var37)) {
                    final Map.Entry var38 = Hashtables.iteratorNextEntry(var37);
                    var35 = Hashtables.getEntryKey(var38);
                    SubLObject var39;
                    var36 = (var39 = Hashtables.getEntryValue(var38));
                    SubLObject var40 = (SubLObject)NIL;
                    var40 = var39.first();
                    while (NIL != var39) {
                        SubLObject var42;
                        final SubLObject var41 = var42 = var40;
                        SubLObject var43 = (SubLObject)NIL;
                        SubLObject var44 = (SubLObject)NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var42, var41, (SubLObject)$ic19$);
                        var43 = var42.first();
                        var42 = var42.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var42, var41, (SubLObject)$ic19$);
                        var44 = var42.first();
                        var42 = var42.rest();
                        if (NIL == var42) {
                            if (var43.eql(var14)) {
                                var28 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var35, var44), var28);
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var41, (SubLObject)$ic19$);
                        }
                        var39 = var39.rest();
                        var40 = var39.first();
                    }
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(var37);
            }
        }
        return var28;
    }
    
    public static SubLObject f48154(final SubLObject var14, final SubLObject var37) {
        SubLObject var38 = var37;
        SubLObject var39 = (SubLObject)NIL;
        var39 = var38.first();
        while (NIL != var38) {
            SubLObject var41;
            final SubLObject var40 = var41 = var39;
            SubLObject var42 = (SubLObject)NIL;
            SubLObject var43 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var41, var40, (SubLObject)$ic21$);
            var42 = var41.first();
            var41 = var41.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var41, var40, (SubLObject)$ic21$);
            var43 = var41.first();
            var41 = var41.rest();
            if (NIL == var41) {
                f48147(var14, var42, var43);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var40, (SubLObject)$ic21$);
            }
            var38 = var38.rest();
            var39 = var38.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f48155(final SubLObject var14, final SubLObject var37) {
        SubLObject var38 = var37;
        SubLObject var39 = (SubLObject)NIL;
        var39 = var38.first();
        while (NIL != var38) {
            SubLObject var41;
            final SubLObject var40 = var41 = var39;
            SubLObject var42 = (SubLObject)NIL;
            SubLObject var43 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var41, var40, (SubLObject)$ic21$);
            var42 = var41.first();
            var41 = var41.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var41, var40, (SubLObject)$ic21$);
            var43 = var41.first();
            var41 = var41.rest();
            if (NIL == var41) {
                f48152(var14, var42);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var40, (SubLObject)$ic21$);
            }
            var38 = var38.rest();
            var39 = var38.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f48150(final SubLObject var7) {
        return Hashtables.gethash(var7, $g6103$.getGlobalValue(), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f48156(final SubLObject var42) {
        return conses_high.second(module0035.f2293($g6101$.getGlobalValue(), var42, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f48144(final SubLObject var42, final SubLObject var4) {
        final SubLObject var43 = module0035.remove_if_not(Symbols.symbol_function((SubLObject)$ic23$), f48156(var42), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return module0035.f2293(var43, var4, Symbols.symbol_function((SubLObject)EQ), (SubLObject)ZERO_INTEGER);
    }
    
    public static SubLObject f48151(final SubLObject var3) {
        return Sort.stable_sort(conses_high.copy_list(var3), Symbols.symbol_function((SubLObject)$ic24$), Symbols.symbol_function((SubLObject)$ic25$));
    }
    
    public static SubLObject f48146(final SubLObject var3) {
        return Sort.stable_sort(conses_high.copy_list(var3), Symbols.symbol_function((SubLObject)$ic26$), Symbols.symbol_function((SubLObject)$ic25$));
    }
    
    public static SubLObject f48157(final SubLObject var44, final SubLObject var45) {
        final SubLObject var46 = f48158(var44);
        final SubLObject var47 = f48158(var45);
        return (SubLObject)makeBoolean(NIL != var46 && NIL != var47 && var46.numG(var47));
    }
    
    public static SubLObject f48158(final SubLObject var20) {
        return Sequences.position(var20, $g6104$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f48145(final SubLObject var20) {
        final SubLObject var21 = f48158(var20);
        return (SubLObject)(var21.isInteger() ? Numbers.subtract(Sequences.length($g6104$.getGlobalValue()), module0048.f_1X(var21)) : NIL);
    }
    
    public static SubLObject f48148(final SubLObject var1) {
        return module0035.sublisp_boolean(module0035.f2428(var1, $g6101$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f48149(final SubLObject var1) {
        return module0004.f104(var1, $g6104$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f48159(final SubLObject var49) {
        return module0035.f2293($g6102$.getGlobalValue(), var49, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f48143(final SubLObject var7) {
        return f48150(var7);
    }
    
    public static SubLObject f48142(final SubLObject var1) {
        return f48160(var1, (SubLObject)$ic27$, (SubLObject)NIL);
    }
    
    public static SubLObject f48160(final SubLObject var1, final SubLObject var50, SubLObject var51) {
        if (NIL == var50) {
            return var51;
        }
        SubLObject var52 = (SubLObject)NIL;
        SubLObject var53 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var50, var50, (SubLObject)$ic28$);
        var52 = var50.first();
        final SubLObject var54 = var53 = var50.rest();
        if (var52.isCons() && var52.first().isSymbol() && var52.rest().isInteger()) {
            var52 = var52.first();
        }
        final SubLObject var55 = f48159(var52);
        final SubLObject var56 = f48161(var1, var52);
        final SubLObject var57 = (SubLObject)((NIL != var56) ? f48156(var52) : NIL);
        if (NIL != var56) {
            var51 = (SubLObject)ConsesLow.cons(var52, var51);
        }
        if (NIL != var56) {
            if (NIL == var57) {
                if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic29$, new SubLObject[] { var1, var55, var52 });
                }
            }
            else if (NIL != module0578.f35470((SubLObject)THREE_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic30$, new SubLObject[] { var1, var55, var52 });
            }
            return f48160(var1, var57, var51);
        }
        if (NIL != var53) {
            if (NIL != module0578.f35470((SubLObject)THREE_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic31$, new SubLObject[] { var1, var55, var52 });
            }
            return f48160(var1, var53, var51);
        }
        if (NIL != var51) {
            if (NIL != module0578.f35470((SubLObject)THREE_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic32$, new SubLObject[] { var1, var55, var52 });
            }
            if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic33$, var1, var51.first());
            }
            return var51;
        }
        final SubLObject var58 = Sequences.cconcatenate((SubLObject)$ic10$, new SubLObject[] { module0006.f205((SubLObject)ONE_INTEGER), $ic11$, module0006.f203((SubLObject)$ic34$) });
        module0578.f35476(var58, (SubLObject)ConsesLow.list(var1, var55));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f48161(final SubLObject var1, final SubLObject var7) {
        final SubLObject var8 = f48159(var7);
        return (SubLObject)((NIL != Symbols.fboundp(var8)) ? Functions.funcall(var8, var1) : NIL);
    }
    
    public static SubLObject f48162(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0206.f13450(var1) || var1.isList() || var1.isAtom());
    }
    
    public static SubLObject f48163(final SubLObject var58) {
        final SubLObject var59 = module0205.f13276(var58);
        return module0751.f46684(var59, $ic35$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f48164(final SubLObject var58) {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f48165(final SubLObject var58) {
        return (SubLObject)makeBoolean(module0205.f13276(var58).eql($ic36$) && NIL != module0202.f12590(module0205.f13368(var58, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f48166(final SubLObject var58) {
        return module0337.f22630(var58, (SubLObject)$ic37$);
    }
    
    public static SubLObject f48167(final SubLObject var58) {
        return module0208.f13537(var58, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f48168(final SubLObject var58) {
        return module0004.f104(module0205.f13276(var58), $g6105$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f48169(final SubLObject var58) {
        return module0337.f22630(var58, (SubLObject)$ic39$);
    }
    
    public static SubLObject f48170(final SubLObject var58) {
        return module0337.f22630(var58, (SubLObject)$ic40$);
    }
    
    public static SubLObject f48171(final SubLObject var58) {
        return module0337.f22630(var58, (SubLObject)$ic41$);
    }
    
    public static SubLObject f48172(final SubLObject var58) {
        return module0612.f37385(var58);
    }
    
    public static SubLObject f48173(final SubLObject var60) {
        final SubLThread var61 = SubLProcess.currentSubLThread();
        SubLObject var62 = (SubLObject)NIL;
        final SubLObject var63 = module0147.f9540(module0579.$g4262$.getDynamicValue(var61));
        final SubLObject var64 = module0147.$g2095$.currentBinding(var61);
        final SubLObject var65 = module0147.$g2094$.currentBinding(var61);
        final SubLObject var66 = module0147.$g2096$.currentBinding(var61);
        try {
            module0147.$g2095$.bind(module0147.f9545(var63), var61);
            module0147.$g2094$.bind(module0147.f9546(var63), var61);
            module0147.$g2096$.bind(module0147.f9549(var63), var61);
            var62 = (SubLObject)makeBoolean(NIL != f48174(var60) && NIL != module0206.f13433(module0205.f13204(var60, (SubLObject)UNPROVIDED)));
        }
        finally {
            module0147.$g2096$.rebind(var66, var61);
            module0147.$g2094$.rebind(var65, var61);
            module0147.$g2095$.rebind(var64, var61);
        }
        return var62;
    }
    
    public static SubLObject f48175(final SubLObject var60) {
        final SubLThread var61 = SubLProcess.currentSubLThread();
        final SubLObject var62 = var60.first();
        final SubLObject var63 = (SubLObject)makeBoolean(NIL != module0202.f12590(var60) && NIL != ((NIL != module0173.f10955(var62)) ? module0269.f17725(var62) : module0751.f46684(var62, $ic42$, module0579.$g4262$.getDynamicValue(var61))));
        return var63;
    }
    
    public static SubLObject f48176(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0202.f12590(var1) && NIL != module0337.f22630(var1, (SubLObject)$ic43$));
    }
    
    public static SubLObject f48177(final SubLObject var60) {
        final SubLThread var61 = SubLProcess.currentSubLThread();
        final SubLObject var62 = var60.first();
        final SubLObject var63 = (SubLObject)makeBoolean(NIL != module0202.f12590(var60) && (NIL != module0269.f17706(var62) || NIL != module0201.f12546(var62) || NIL != ((NIL != module0173.f10955(var62)) ? module0269.f17736(var62) : module0751.f46684(var62, $ic44$, module0579.$g4262$.getDynamicValue(var61)))));
        return var63;
    }
    
    public static SubLObject f48178(final SubLObject var60) {
        return (SubLObject)makeBoolean(NIL != module0202.f12595(var60) || NIL != module0202.f12594(var60));
    }
    
    public static SubLObject f48174(final SubLObject var60) {
        return (SubLObject)makeBoolean(NIL != module0202.f12604(var60) && NIL != module0201.f12546(module0205.f13203(var60, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f48179(final SubLObject var60) {
        return module0269.f17706(var60.first());
    }
    
    public static SubLObject f48180(final SubLObject var60) {
        return (SubLObject)makeBoolean(var60.isSymbol() && NIL != Symbols.fboundp(var60));
    }
    
    public static SubLObject f48181(final SubLObject var60) {
        return (SubLObject)makeBoolean(var60.isSymbol() && NIL == Symbols.fboundp(var60));
    }
    
    public static SubLObject f48182(final SubLObject var1) {
        return Equality.eq(var1, $ic45$);
    }
    
    public static SubLObject f48183(final SubLObject var1) {
        return Equality.eq(var1, $ic46$);
    }
    
    public static SubLObject f48184(final SubLObject var1) {
        return (SubLObject)makeBoolean(var1.isCons() && NIL != module0201.f12546(var1.first()));
    }
    
    public static SubLObject f48185(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0202.f12592(var1) && NIL != module0202.f12689(module0205.f13203(var1, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f48186(final SubLObject var68) {
        final SubLObject var69 = module0205.f13333(var68);
        return f48187(var69, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f48187(final SubLObject var70, SubLObject var71) {
        if (var71 == UNPROVIDED) {
            var71 = module0579.$g4262$.getDynamicValue();
        }
        final SubLThread var72 = SubLProcess.currentSubLThread();
        SubLObject var73 = (SubLObject)NIL;
        if (NIL != module0212.f13762(var70)) {
            final SubLObject var74 = module0147.f9540(var71);
            final SubLObject var75 = module0147.$g2095$.currentBinding(var72);
            final SubLObject var76 = module0147.$g2094$.currentBinding(var72);
            final SubLObject var77 = module0147.$g2096$.currentBinding(var72);
            try {
                module0147.$g2095$.bind(module0147.f9545(var74), var72);
                module0147.$g2094$.bind(module0147.f9546(var74), var72);
                module0147.$g2096$.bind(module0147.f9549(var74), var72);
                var73 = module0220.f14544(var70, $ic47$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            finally {
                module0147.$g2096$.rebind(var77, var72);
                module0147.$g2094$.rebind(var76, var72);
                module0147.$g2095$.rebind(var75, var72);
            }
        }
        return var73;
    }
    
    public static SubLObject f48188(final SubLObject var72) {
        return (SubLObject)makeBoolean(NIL != module0202.f12590(var72) && NIL != module0202.f12734(var72, (SubLObject)THREE_INTEGER, (SubLObject)UNPROVIDED) && NIL != module0212.f13762(module0205.f13203(var72, (SubLObject)UNPROVIDED)) && NIL != module0765.f48710(module0205.f13136(var72)));
    }
    
    public static SubLObject f48189(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != constant_handles_oc.f8463($ic48$, (SubLObject)UNPROVIDED) && NIL != module0202.f12589(var1, $ic48$));
    }
    
    public static SubLObject f48190(final SubLObject var1) {
        return module0202.f12589(var1, $ic49$);
    }
    
    public static SubLObject f48191(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != constant_handles_oc.f8463($ic50$, (SubLObject)UNPROVIDED) && NIL != module0202.f12589(var1, $ic47$) && NIL != module0751.f46684(module0205.f13203(var1, (SubLObject)UNPROVIDED), $ic50$, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f48192(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f48193(var1) && NIL != conses_high.member(var1.first(), (SubLObject)$ic51$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f48194(final SubLObject var60) {
        return module0210.f13587(var60);
    }
    
    public static SubLObject f48195(final SubLObject var73) {
        return (SubLObject)makeBoolean(NIL == module0751.f46684(var73, $ic52$, (SubLObject)UNPROVIDED) && NIL != module0751.f46684(var73, $ic53$, $ic54$));
    }
    
    public static SubLObject f48196(final SubLObject var73) {
        return module0751.f46684(var73, $ic55$, $ic54$);
    }
    
    public static SubLObject f48197(final SubLObject var73) {
        return module0751.f46684(var73, $ic56$, $ic54$);
    }
    
    public static SubLObject f48198(final SubLObject var74) {
        return (SubLObject)makeBoolean(NIL == f48197(var74));
    }
    
    public static SubLObject f48199(final SubLObject var75) {
        final SubLThread var76 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL != module0579.$g4273$.getDynamicValue(var76) && NIL != module0751.f46847((SubLObject)ConsesLow.list($ic57$, var75), $ic54$));
    }
    
    public static SubLObject f48200(final SubLObject var1) {
        return module0731.f44764(var1, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f48201(final SubLObject var60) {
        return (SubLObject)makeBoolean(NIL != module0751.f46597((SubLObject)$ic58$) && NIL != module0051.f3603(var60));
    }
    
    public static SubLObject f48202(final SubLObject var60) {
        return (SubLObject)makeBoolean(NIL != module0751.f46597((SubLObject)$ic59$) && NIL != module0051.f3631(var60));
    }
    
    public static SubLObject f48193(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = module0147.$g2094$.currentBinding(var2);
        final SubLObject var5 = module0147.$g2095$.currentBinding(var2);
        try {
            module0147.$g2094$.bind((SubLObject)$ic60$, var2);
            module0147.$g2095$.bind($ic61$, var2);
            var3 = (SubLObject)makeBoolean(NIL != module0202.f12930(var1) || NIL != module0210.f13576(var1, (SubLObject)UNPROVIDED) || NIL != module0751.f46684(var1, $ic62$, (SubLObject)UNPROVIDED));
        }
        finally {
            module0147.$g2095$.rebind(var5, var2);
            module0147.$g2094$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f48203(final SubLObject var1) {
        return f48204(var1.first());
    }
    
    public static SubLObject f48204(final SubLObject var76) {
        return (SubLObject)makeBoolean(NIL != module0552.f34022(var76) && module0205.f13136(var76).eql($ic63$));
    }
    
    public static SubLObject f48205(final SubLObject var58) {
        return f48206(module0205.f13364(var58));
    }
    
    public static SubLObject f48207(final SubLObject var77) {
        return Equality.eql(module0205.f13276(var77), $ic64$);
    }
    
    public static SubLObject f48208() {
        final SubLThread var61 = SubLProcess.currentSubLThread();
        module0077.f5328($g6106$.getDynamicValue(var61));
        final SubLObject var62 = module0147.$g2094$.currentBinding(var61);
        final SubLObject var63 = module0147.$g2095$.currentBinding(var61);
        try {
            module0147.$g2094$.bind((SubLObject)$ic60$, var61);
            module0147.$g2095$.bind($ic61$, var61);
            final SubLObject var64 = $ic65$;
            final SubLObject var63_79 = module0137.$g1605$.currentBinding(var61);
            final SubLObject var64_80 = module0139.$g1636$.currentBinding(var61);
            try {
                module0137.$g1605$.bind(module0137.f8955($ic66$), var61);
                module0139.$g1636$.bind(module0139.f9007(), var61);
                SubLObject var81_82 = var64;
                final SubLObject var65 = (SubLObject)$ic69$;
                final SubLObject var66 = module0056.f4145(var65);
                final SubLObject var63_80 = module0139.$g1635$.currentBinding(var61);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var61);
                    final SubLObject var67 = (SubLObject)NIL;
                    final SubLObject var63_81 = module0141.$g1714$.currentBinding(var61);
                    final SubLObject var64_81 = module0141.$g1715$.currentBinding(var61);
                    try {
                        module0141.$g1714$.bind((NIL != var67) ? var67 : module0141.f9283(), var61);
                        module0141.$g1715$.bind((SubLObject)((NIL != var67) ? $ic70$ : module0141.$g1715$.getDynamicValue(var61)), var61);
                        if (NIL != var67 && NIL != module0136.f8864() && NIL == module0141.f9279(var67)) {
                            final SubLObject var68 = module0136.$g1591$.getDynamicValue(var61);
                            if (var68.eql((SubLObject)$ic71$)) {
                                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic72$, var67, (SubLObject)$ic73$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var68.eql((SubLObject)$ic74$)) {
                                module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic75$, (SubLObject)$ic72$, var67, (SubLObject)$ic73$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var68.eql((SubLObject)$ic76$)) {
                                Errors.warn((SubLObject)$ic72$, var67, (SubLObject)$ic73$);
                            }
                            else {
                                Errors.warn((SubLObject)$ic77$, module0136.$g1591$.getDynamicValue(var61));
                                Errors.cerror((SubLObject)$ic75$, (SubLObject)$ic72$, var67, (SubLObject)$ic73$);
                            }
                        }
                        final SubLObject var63_82 = module0141.$g1670$.currentBinding(var61);
                        final SubLObject var64_82 = module0141.$g1671$.currentBinding(var61);
                        final SubLObject var69 = module0141.$g1672$.currentBinding(var61);
                        final SubLObject var70 = module0141.$g1674$.currentBinding(var61);
                        final SubLObject var71 = module0137.$g1605$.currentBinding(var61);
                        try {
                            module0141.$g1670$.bind(module0244.f15771(module0137.f8955($ic66$)), var61);
                            module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955($ic66$))), var61);
                            module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955($ic66$))), var61);
                            module0141.$g1674$.bind((SubLObject)NIL, var61);
                            module0137.$g1605$.bind(module0244.f15771(module0137.f8955($ic66$)), var61);
                            if (NIL != module0136.f8865() || NIL != module0244.f15795(var64, module0137.f8955((SubLObject)UNPROVIDED))) {
                                final SubLObject var63_83 = module0141.$g1677$.currentBinding(var61);
                                final SubLObject var64_83 = module0138.$g1619$.currentBinding(var61);
                                final SubLObject var65_96 = module0141.$g1674$.currentBinding(var61);
                                try {
                                    module0141.$g1677$.bind(module0141.f9210(), var61);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955($ic66$))), var61);
                                    module0141.$g1674$.bind((SubLObject)NIL, var61);
                                    module0249.f16055(var81_82, (SubLObject)UNPROVIDED);
                                    while (NIL != var81_82) {
                                        final SubLObject var72 = var81_82;
                                        SubLObject var74;
                                        final SubLObject var73 = var74 = module0200.f12443(module0137.f8955($ic66$));
                                        SubLObject var75 = (SubLObject)NIL;
                                        var75 = var74.first();
                                        while (NIL != var74) {
                                            final SubLObject var63_84 = module0137.$g1605$.currentBinding(var61);
                                            final SubLObject var64_84 = module0141.$g1674$.currentBinding(var61);
                                            try {
                                                module0137.$g1605$.bind(var75, var61);
                                                module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var61)) : module0141.$g1674$.getDynamicValue(var61)), var61);
                                                final SubLObject var76 = module0228.f15229(var72);
                                                if (NIL != module0138.f8992(var76)) {
                                                    final SubLObject var77 = module0242.f15664(var76, module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var77) {
                                                        final SubLObject var78 = module0245.f15834(var77, module0244.f15780(module0137.f8955($ic66$)), module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var78) {
                                                            SubLObject var79;
                                                            for (var79 = module0066.f4838(module0067.f4891(var78)); NIL == module0066.f4841(var79); var79 = module0066.f4840(var79)) {
                                                                var61.resetMultipleValues();
                                                                final SubLObject var80 = module0066.f4839(var79);
                                                                final SubLObject var81 = var61.secondMultipleValue();
                                                                var61.resetMultipleValues();
                                                                if (NIL != module0147.f9507(var80)) {
                                                                    final SubLObject var63_85 = module0138.$g1623$.currentBinding(var61);
                                                                    try {
                                                                        module0138.$g1623$.bind(var80, var61);
                                                                        SubLObject var105_109;
                                                                        for (var105_109 = module0066.f4838(module0067.f4891(var81)); NIL == module0066.f4841(var105_109); var105_109 = module0066.f4840(var105_109)) {
                                                                            var61.resetMultipleValues();
                                                                            final SubLObject var82 = module0066.f4839(var105_109);
                                                                            final SubLObject var83 = var61.secondMultipleValue();
                                                                            var61.resetMultipleValues();
                                                                            if (NIL != module0141.f9289(var82)) {
                                                                                final SubLObject var63_86 = module0138.$g1624$.currentBinding(var61);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var82, var61);
                                                                                    final SubLObject var84 = var83;
                                                                                    if (NIL != module0077.f5302(var84)) {
                                                                                        final SubLObject var85 = module0077.f5333(var84);
                                                                                        SubLObject var86;
                                                                                        SubLObject var87;
                                                                                        SubLObject var88;
                                                                                        for (var86 = module0032.f1741(var85), var87 = (SubLObject)NIL, var87 = module0032.f1742(var86, var85); NIL == module0032.f1744(var86, var87); var87 = module0032.f1743(var87)) {
                                                                                            var88 = module0032.f1745(var86, var87);
                                                                                            if (NIL != module0032.f1746(var87, var88) && NIL == module0249.f16059(var88, module0139.$g1636$.getDynamicValue(var61))) {
                                                                                                module0249.f16055(var88, module0139.$g1636$.getDynamicValue(var61));
                                                                                                module0077.f5326(var88, $g6106$.getDynamicValue(var61));
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var84.isList()) {
                                                                                        SubLObject var89 = var84;
                                                                                        SubLObject var90 = (SubLObject)NIL;
                                                                                        var90 = var89.first();
                                                                                        while (NIL != var89) {
                                                                                            if (NIL == module0249.f16059(var90, module0139.$g1636$.getDynamicValue(var61))) {
                                                                                                module0249.f16055(var90, module0139.$g1636$.getDynamicValue(var61));
                                                                                                module0077.f5326(var90, $g6106$.getDynamicValue(var61));
                                                                                            }
                                                                                            var89 = var89.rest();
                                                                                            var90 = var89.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)$ic78$, var84);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var63_86, var61);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var105_109);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var63_85, var61);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var79);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic79$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                    }
                                                    if (NIL != module0200.f12419(var76, module0137.f8955((SubLObject)UNPROVIDED))) {
                                                        SubLObject var91 = module0248.f15995(var76);
                                                        SubLObject var92 = (SubLObject)NIL;
                                                        var92 = var91.first();
                                                        while (NIL != var91) {
                                                            SubLObject var94;
                                                            final SubLObject var93 = var94 = var92;
                                                            SubLObject var95 = (SubLObject)NIL;
                                                            SubLObject var96 = (SubLObject)NIL;
                                                            SubLObject var97 = (SubLObject)NIL;
                                                            cdestructuring_bind.destructuring_bind_must_consp(var94, var93, (SubLObject)$ic80$);
                                                            var95 = var94.first();
                                                            var94 = var94.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var94, var93, (SubLObject)$ic80$);
                                                            var96 = var94.first();
                                                            var94 = var94.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var94, var93, (SubLObject)$ic80$);
                                                            var97 = var94.first();
                                                            var94 = var94.rest();
                                                            if (NIL == var94) {
                                                                if (NIL != module0147.f9507(var96)) {
                                                                    final SubLObject var63_87 = module0138.$g1623$.currentBinding(var61);
                                                                    try {
                                                                        module0138.$g1623$.bind(var96, var61);
                                                                        if (NIL != module0141.f9289(var97)) {
                                                                            final SubLObject var63_88 = module0138.$g1624$.currentBinding(var61);
                                                                            try {
                                                                                module0138.$g1624$.bind(var97, var61);
                                                                                final SubLObject var84;
                                                                                final SubLObject var98 = var84 = (SubLObject)ConsesLow.list(var95);
                                                                                if (NIL != module0077.f5302(var84)) {
                                                                                    final SubLObject var85 = module0077.f5333(var84);
                                                                                    SubLObject var86;
                                                                                    SubLObject var87;
                                                                                    SubLObject var88;
                                                                                    for (var86 = module0032.f1741(var85), var87 = (SubLObject)NIL, var87 = module0032.f1742(var86, var85); NIL == module0032.f1744(var86, var87); var87 = module0032.f1743(var87)) {
                                                                                        var88 = module0032.f1745(var86, var87);
                                                                                        if (NIL != module0032.f1746(var87, var88) && NIL == module0249.f16059(var88, module0139.$g1636$.getDynamicValue(var61))) {
                                                                                            module0249.f16055(var88, module0139.$g1636$.getDynamicValue(var61));
                                                                                            module0077.f5326(var88, $g6106$.getDynamicValue(var61));
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var84.isList()) {
                                                                                    SubLObject var117_126 = var84;
                                                                                    SubLObject var90 = (SubLObject)NIL;
                                                                                    var90 = var117_126.first();
                                                                                    while (NIL != var117_126) {
                                                                                        if (NIL == module0249.f16059(var90, module0139.$g1636$.getDynamicValue(var61))) {
                                                                                            module0249.f16055(var90, module0139.$g1636$.getDynamicValue(var61));
                                                                                            module0077.f5326(var90, $g6106$.getDynamicValue(var61));
                                                                                        }
                                                                                        var117_126 = var117_126.rest();
                                                                                        var90 = var117_126.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)$ic78$, var84);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var63_88, var61);
                                                                            }
                                                                        }
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var63_87, var61);
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                cdestructuring_bind.cdestructuring_bind_error(var93, (SubLObject)$ic80$);
                                                            }
                                                            var91 = var91.rest();
                                                            var92 = var91.first();
                                                        }
                                                    }
                                                }
                                                else if (NIL != module0155.f9785(var76, (SubLObject)UNPROVIDED)) {
                                                    SubLObject var6_128;
                                                    final SubLObject var99 = var6_128 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955($ic66$)), module0141.$g1714$.getDynamicValue(var61), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955($ic66$)), module0141.$g1714$.getDynamicValue(var61), module0137.f8955((SubLObject)UNPROVIDED)));
                                                    SubLObject var100 = (SubLObject)NIL;
                                                    var100 = var6_128.first();
                                                    while (NIL != var6_128) {
                                                        final SubLObject var63_89 = module0138.$g1625$.currentBinding(var61);
                                                        try {
                                                            module0138.$g1625$.bind(var100, var61);
                                                            final SubLObject var102;
                                                            final SubLObject var101 = var102 = Functions.funcall(var100, var76);
                                                            if (NIL != module0077.f5302(var102)) {
                                                                final SubLObject var103 = module0077.f5333(var102);
                                                                SubLObject var104;
                                                                SubLObject var105;
                                                                SubLObject var106;
                                                                for (var104 = module0032.f1741(var103), var105 = (SubLObject)NIL, var105 = module0032.f1742(var104, var103); NIL == module0032.f1744(var104, var105); var105 = module0032.f1743(var105)) {
                                                                    var106 = module0032.f1745(var104, var105);
                                                                    if (NIL != module0032.f1746(var105, var106) && NIL == module0249.f16059(var106, module0139.$g1636$.getDynamicValue(var61))) {
                                                                        module0249.f16055(var106, module0139.$g1636$.getDynamicValue(var61));
                                                                        module0077.f5326(var106, $g6106$.getDynamicValue(var61));
                                                                    }
                                                                }
                                                            }
                                                            else if (var102.isList()) {
                                                                SubLObject var107 = var102;
                                                                SubLObject var108 = (SubLObject)NIL;
                                                                var108 = var107.first();
                                                                while (NIL != var107) {
                                                                    if (NIL == module0249.f16059(var108, module0139.$g1636$.getDynamicValue(var61))) {
                                                                        module0249.f16055(var108, module0139.$g1636$.getDynamicValue(var61));
                                                                        module0077.f5326(var108, $g6106$.getDynamicValue(var61));
                                                                    }
                                                                    var107 = var107.rest();
                                                                    var108 = var107.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)$ic78$, var102);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var63_89, var61);
                                                        }
                                                        var6_128 = var6_128.rest();
                                                        var100 = var6_128.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var64_84, var61);
                                                module0137.$g1605$.rebind(var63_84, var61);
                                            }
                                            var74 = var74.rest();
                                            var75 = var74.first();
                                        }
                                        SubLObject var110;
                                        final SubLObject var109 = var110 = module0200.f12443(module0244.f15771(module0137.f8955($ic66$)));
                                        SubLObject var111 = (SubLObject)NIL;
                                        var111 = var110.first();
                                        while (NIL != var110) {
                                            final SubLObject var63_90 = module0137.$g1605$.currentBinding(var61);
                                            final SubLObject var64_85 = module0141.$g1674$.currentBinding(var61);
                                            try {
                                                module0137.$g1605$.bind(var111, var61);
                                                module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var61)) : module0141.$g1674$.getDynamicValue(var61)), var61);
                                                final SubLObject var112 = module0228.f15229(var81_82);
                                                if (NIL != module0138.f8992(var112)) {
                                                    final SubLObject var113 = module0242.f15664(var112, module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var113) {
                                                        final SubLObject var114 = module0245.f15834(var113, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var114) {
                                                            SubLObject var115;
                                                            for (var115 = module0066.f4838(module0067.f4891(var114)); NIL == module0066.f4841(var115); var115 = module0066.f4840(var115)) {
                                                                var61.resetMultipleValues();
                                                                final SubLObject var116 = module0066.f4839(var115);
                                                                final SubLObject var117 = var61.secondMultipleValue();
                                                                var61.resetMultipleValues();
                                                                if (NIL != module0147.f9507(var116)) {
                                                                    final SubLObject var63_91 = module0138.$g1623$.currentBinding(var61);
                                                                    try {
                                                                        module0138.$g1623$.bind(var116, var61);
                                                                        SubLObject var105_110;
                                                                        for (var105_110 = module0066.f4838(module0067.f4891(var117)); NIL == module0066.f4841(var105_110); var105_110 = module0066.f4840(var105_110)) {
                                                                            var61.resetMultipleValues();
                                                                            final SubLObject var118 = module0066.f4839(var105_110);
                                                                            final SubLObject var119 = var61.secondMultipleValue();
                                                                            var61.resetMultipleValues();
                                                                            if (NIL != module0141.f9289(var118)) {
                                                                                final SubLObject var63_92 = module0138.$g1624$.currentBinding(var61);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var118, var61);
                                                                                    final SubLObject var120 = var119;
                                                                                    if (NIL != module0077.f5302(var120)) {
                                                                                        final SubLObject var121 = module0077.f5333(var120);
                                                                                        SubLObject var122;
                                                                                        SubLObject var123;
                                                                                        SubLObject var124;
                                                                                        for (var122 = module0032.f1741(var121), var123 = (SubLObject)NIL, var123 = module0032.f1742(var122, var121); NIL == module0032.f1744(var122, var123); var123 = module0032.f1743(var123)) {
                                                                                            var124 = module0032.f1745(var122, var123);
                                                                                            if (NIL != module0032.f1746(var123, var124) && NIL == module0249.f16059(var124, (SubLObject)UNPROVIDED)) {
                                                                                                module0249.f16055(var124, (SubLObject)UNPROVIDED);
                                                                                                module0056.f4149(var124, var66);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var120.isList()) {
                                                                                        SubLObject var125 = var120;
                                                                                        SubLObject var126 = (SubLObject)NIL;
                                                                                        var126 = var125.first();
                                                                                        while (NIL != var125) {
                                                                                            if (NIL == module0249.f16059(var126, (SubLObject)UNPROVIDED)) {
                                                                                                module0249.f16055(var126, (SubLObject)UNPROVIDED);
                                                                                                module0056.f4149(var126, var66);
                                                                                            }
                                                                                            var125 = var125.rest();
                                                                                            var126 = var125.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)$ic78$, var120);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var63_92, var61);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var105_110);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var63_91, var61);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var115);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic79$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                    }
                                                }
                                                else if (NIL != module0155.f9785(var112, (SubLObject)UNPROVIDED)) {
                                                    SubLObject var6_129;
                                                    final SubLObject var127 = var6_129 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var61), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var61), module0137.f8955((SubLObject)UNPROVIDED)));
                                                    SubLObject var128 = (SubLObject)NIL;
                                                    var128 = var6_129.first();
                                                    while (NIL != var6_129) {
                                                        final SubLObject var63_93 = module0138.$g1625$.currentBinding(var61);
                                                        try {
                                                            module0138.$g1625$.bind(var128, var61);
                                                            final SubLObject var130;
                                                            final SubLObject var129 = var130 = Functions.funcall(var128, var112);
                                                            if (NIL != module0077.f5302(var130)) {
                                                                final SubLObject var131 = module0077.f5333(var130);
                                                                SubLObject var132;
                                                                SubLObject var133;
                                                                SubLObject var134;
                                                                for (var132 = module0032.f1741(var131), var133 = (SubLObject)NIL, var133 = module0032.f1742(var132, var131); NIL == module0032.f1744(var132, var133); var133 = module0032.f1743(var133)) {
                                                                    var134 = module0032.f1745(var132, var133);
                                                                    if (NIL != module0032.f1746(var133, var134) && NIL == module0249.f16059(var134, (SubLObject)UNPROVIDED)) {
                                                                        module0249.f16055(var134, (SubLObject)UNPROVIDED);
                                                                        module0056.f4149(var134, var66);
                                                                    }
                                                                }
                                                            }
                                                            else if (var130.isList()) {
                                                                SubLObject var135 = var130;
                                                                SubLObject var136 = (SubLObject)NIL;
                                                                var136 = var135.first();
                                                                while (NIL != var135) {
                                                                    if (NIL == module0249.f16059(var136, (SubLObject)UNPROVIDED)) {
                                                                        module0249.f16055(var136, (SubLObject)UNPROVIDED);
                                                                        module0056.f4149(var136, var66);
                                                                    }
                                                                    var135 = var135.rest();
                                                                    var136 = var135.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)$ic78$, var130);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var63_93, var61);
                                                        }
                                                        var6_129 = var6_129.rest();
                                                        var128 = var6_129.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var64_85, var61);
                                                module0137.$g1605$.rebind(var63_90, var61);
                                            }
                                            var110 = var110.rest();
                                            var111 = var110.first();
                                        }
                                        var81_82 = module0056.f4150(var66);
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var65_96, var61);
                                    module0138.$g1619$.rebind(var64_83, var61);
                                    module0141.$g1677$.rebind(var63_83, var61);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic81$, var64, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var71, var61);
                            module0141.$g1674$.rebind(var70, var61);
                            module0141.$g1672$.rebind(var69, var61);
                            module0141.$g1671$.rebind(var64_82, var61);
                            module0141.$g1670$.rebind(var63_82, var61);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var64_81, var61);
                        module0141.$g1714$.rebind(var63_81, var61);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var61));
                }
                finally {
                    module0139.$g1635$.rebind(var63_80, var61);
                }
                module0139.f9011(module0139.$g1636$.getDynamicValue(var61));
            }
            finally {
                module0139.$g1636$.rebind(var64_80, var61);
                module0137.$g1605$.rebind(var63_79, var61);
            }
        }
        finally {
            module0147.$g2095$.rebind(var63, var61);
            module0147.$g2094$.rebind(var62, var61);
        }
        module0077.f5326($ic82$, $g6106$.getDynamicValue(var61));
        return (SubLObject)$ic83$;
    }
    
    public static SubLObject f48206(final SubLObject var59) {
        final SubLThread var60 = SubLProcess.currentSubLThread();
        if (NIL != module0077.f5316($g6106$.getDynamicValue(var60))) {
            f48208();
        }
        return module0077.f5320(var59, $g6106$.getDynamicValue(var60));
    }
    
    public static SubLObject f48209(final SubLObject var141) {
        final SubLThread var142 = SubLProcess.currentSubLThread();
        SubLObject var143 = (SubLObject)NIL;
        var142.resetMultipleValues();
        final SubLObject var144 = module0337.f22630(var141, (SubLObject)$ic84$);
        final SubLObject var145 = var142.secondMultipleValue();
        var142.resetMultipleValues();
        if (NIL != var144) {
            final SubLObject var146 = module0035.f2294(var145, (SubLObject)$ic85$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var147 = module0035.f2294(var145, (SubLObject)$ic86$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var148 = module0035.f2294(var145, (SubLObject)$ic87$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var149 = module0035.f2294(var145, (SubLObject)$ic88$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL != module0212.f13762(var147)) {
                final SubLObject var150 = module0147.f9540(module0579.$g4260$.getDynamicValue(var142));
                final SubLObject var151 = module0147.$g2095$.currentBinding(var142);
                final SubLObject var152 = module0147.$g2094$.currentBinding(var142);
                final SubLObject var153 = module0147.$g2096$.currentBinding(var142);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var150), var142);
                    module0147.$g2094$.bind(module0147.f9546(var150), var142);
                    module0147.$g2096$.bind(module0147.f9549(var150), var142);
                    if (NIL == var143) {
                        SubLObject var154 = module0764.f48454((SubLObject)UNPROVIDED);
                        SubLObject var155 = (SubLObject)NIL;
                        var155 = var154.first();
                        while (NIL == var143 && NIL != var154) {
                            final SubLObject var156 = module0732.f44992(var155);
                            if (var156.isInteger() && NIL != module0220.f14544(var147, var155, var156, (SubLObject)$ic89$)) {
                                var143 = (SubLObject)T;
                            }
                            var154 = var154.rest();
                            var155 = var154.first();
                        }
                    }
                }
                finally {
                    module0147.$g2096$.rebind(var153, var142);
                    module0147.$g2094$.rebind(var152, var142);
                    module0147.$g2095$.rebind(var151, var142);
                }
            }
        }
        return var143;
    }
    
    public static SubLObject f48210(final SubLObject var58) {
        return f48211(module0205.f13364(var58), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f48212(final SubLObject var58, SubLObject var71) {
        if (var71 == UNPROVIDED) {
            var71 = module0579.$g4260$.getDynamicValue();
        }
        return (SubLObject)makeBoolean(NIL != f48210(var58) && NIL != f48213(module0205.f13276(var58), var71));
    }
    
    public static SubLObject f48214(final SubLObject var149, SubLObject var71) {
        if (var71 == UNPROVIDED) {
            var71 = (SubLObject)$ic91$;
        }
        final SubLThread var150 = SubLProcess.currentSubLThread();
        if (var71 == $ic91$) {
            return module0220.f14547(var149, $ic47$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        SubLObject var151 = (SubLObject)NIL;
        final SubLObject var152 = module0147.f9540(var71);
        final SubLObject var153 = module0147.$g2095$.currentBinding(var150);
        final SubLObject var154 = module0147.$g2094$.currentBinding(var150);
        final SubLObject var155 = module0147.$g2096$.currentBinding(var150);
        try {
            module0147.$g2095$.bind(module0147.f9545(var152), var150);
            module0147.$g2094$.bind(module0147.f9546(var152), var150);
            module0147.$g2096$.bind(module0147.f9549(var152), var150);
            var151 = module0220.f14548(var149, $ic47$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0147.$g2096$.rebind(var155, var150);
            module0147.$g2094$.rebind(var154, var150);
            module0147.$g2095$.rebind(var153, var150);
        }
        return var151;
    }
    
    public static SubLObject f48213(final SubLObject var149, SubLObject var71) {
        if (var71 == UNPROVIDED) {
            var71 = (SubLObject)$ic91$;
        }
        final SubLThread var150 = SubLProcess.currentSubLThread();
        final SubLObject var151 = module0034.$g879$.getDynamicValue(var150);
        SubLObject var152 = (SubLObject)NIL;
        if (NIL == var151) {
            return f48214(var149, var71);
        }
        var152 = module0034.f1857(var151, (SubLObject)$ic90$, (SubLObject)UNPROVIDED);
        if (NIL == var152) {
            var152 = module0034.f1807(module0034.f1842(var151), (SubLObject)$ic90$, (SubLObject)TWO_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var151, (SubLObject)$ic90$, var152);
        }
        final SubLObject var153 = module0034.f1782(var149, var71);
        final SubLObject var154 = module0034.f1814(var152, var153, (SubLObject)UNPROVIDED);
        if (var154 != $ic92$) {
            SubLObject var155 = var154;
            SubLObject var156 = (SubLObject)NIL;
            var156 = var155.first();
            while (NIL != var155) {
                SubLObject var157 = var156.first();
                final SubLObject var158 = conses_high.second(var156);
                if (var149.equal(var157.first())) {
                    var157 = var157.rest();
                    if (NIL != var157 && NIL == var157.rest() && var71.equal(var157.first())) {
                        return module0034.f1959(var158);
                    }
                }
                var155 = var155.rest();
                var156 = var155.first();
            }
        }
        final SubLObject var159 = Values.arg2(var150.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f48214(var149, var71)));
        module0034.f1836(var152, var153, var154, var159, (SubLObject)ConsesLow.list(var149, var71));
        return module0034.f1959(var159);
    }
    
    public static SubLObject f48215(final SubLObject var158) {
        return module0202.f12643($ic93$, var158.isString() ? module0208.f13539(var158) : var158);
    }
    
    public static SubLObject f48216() {
        final SubLThread var61 = SubLProcess.currentSubLThread();
        module0067.f4881(module0579.$g4318$.getDynamicValue(var61));
        final SubLObject var62 = module0147.$g2094$.currentBinding(var61);
        final SubLObject var63 = module0147.$g2095$.currentBinding(var61);
        try {
            module0147.$g2094$.bind((SubLObject)$ic60$, var61);
            module0147.$g2095$.bind($ic61$, var61);
            SubLObject var64 = $ic94$;
            final SubLObject var65 = (SubLObject)$ic69$;
            final SubLObject var66 = module0056.f4145(var65);
            final SubLObject var63_159 = module0139.$g1635$.currentBinding(var61);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var61);
                final SubLObject var67 = (SubLObject)NIL;
                final SubLObject var63_160 = module0141.$g1714$.currentBinding(var61);
                final SubLObject var64_161 = module0141.$g1715$.currentBinding(var61);
                try {
                    module0141.$g1714$.bind((NIL != var67) ? var67 : module0141.f9283(), var61);
                    module0141.$g1715$.bind((SubLObject)((NIL != var67) ? $ic70$ : module0141.$g1715$.getDynamicValue(var61)), var61);
                    if (NIL != var67 && NIL != module0136.f8864() && NIL == module0141.f9279(var67)) {
                        final SubLObject var68 = module0136.$g1591$.getDynamicValue(var61);
                        if (var68.eql((SubLObject)$ic71$)) {
                            module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic72$, var67, (SubLObject)$ic73$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        else if (var68.eql((SubLObject)$ic74$)) {
                            module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic75$, (SubLObject)$ic72$, var67, (SubLObject)$ic73$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        else if (var68.eql((SubLObject)$ic76$)) {
                            Errors.warn((SubLObject)$ic72$, var67, (SubLObject)$ic73$);
                        }
                        else {
                            Errors.warn((SubLObject)$ic77$, module0136.$g1591$.getDynamicValue(var61));
                            Errors.cerror((SubLObject)$ic75$, (SubLObject)$ic72$, var67, (SubLObject)$ic73$);
                        }
                    }
                    final SubLObject var63_161 = module0141.$g1670$.currentBinding(var61);
                    final SubLObject var64_162 = module0141.$g1671$.currentBinding(var61);
                    final SubLObject var69 = module0141.$g1672$.currentBinding(var61);
                    final SubLObject var70 = module0141.$g1674$.currentBinding(var61);
                    final SubLObject var71 = module0137.$g1605$.currentBinding(var61);
                    try {
                        module0141.$g1670$.bind(module0137.f8955($ic95$), var61);
                        module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic95$)), var61);
                        module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic95$)), var61);
                        module0141.$g1674$.bind((SubLObject)NIL, var61);
                        module0137.$g1605$.bind(module0137.f8955($ic95$), var61);
                        if (NIL != module0136.f8865() || NIL != module0244.f15795($ic94$, module0137.f8955((SubLObject)UNPROVIDED))) {
                            final SubLObject var63_162 = module0141.$g1677$.currentBinding(var61);
                            final SubLObject var64_163 = module0138.$g1619$.currentBinding(var61);
                            final SubLObject var65_166 = module0141.$g1674$.currentBinding(var61);
                            try {
                                module0141.$g1677$.bind(module0141.f9210(), var61);
                                module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955($ic95$)), var61);
                                module0141.$g1674$.bind((SubLObject)NIL, var61);
                                module0249.f16055(var64, (SubLObject)UNPROVIDED);
                                while (NIL != var64) {
                                    final SubLObject var72 = var64;
                                    final SubLObject var63_163 = module0148.$g2099$.currentBinding(var61);
                                    final SubLObject var64_164 = module0148.$g2097$.currentBinding(var61);
                                    try {
                                        module0148.$g2099$.bind((SubLObject)$ic96$, var61);
                                        module0148.$g2097$.bind($ic97$, var61);
                                        final SubLObject var73 = (SubLObject)NIL;
                                        if (NIL != module0158.f10010(var72, (SubLObject)TWO_INTEGER, var73)) {
                                            final SubLObject var74 = module0158.f10011(var72, (SubLObject)TWO_INTEGER, var73);
                                            SubLObject var75 = (SubLObject)NIL;
                                            final SubLObject var76 = (SubLObject)NIL;
                                            while (NIL == var75) {
                                                final SubLObject var77 = module0052.f3695(var74, var76);
                                                final SubLObject var78 = (SubLObject)makeBoolean(!var76.eql(var77));
                                                if (NIL != var78) {
                                                    SubLObject var79 = (SubLObject)NIL;
                                                    try {
                                                        var79 = module0158.f10316(var77, (SubLObject)$ic98$, (SubLObject)NIL, (SubLObject)NIL);
                                                        SubLObject var172_177 = (SubLObject)NIL;
                                                        final SubLObject var173_178 = (SubLObject)NIL;
                                                        while (NIL == var172_177) {
                                                            final SubLObject var80 = module0052.f3695(var79, var173_178);
                                                            final SubLObject var175_180 = (SubLObject)makeBoolean(!var173_178.eql(var80));
                                                            if (NIL != var175_180) {
                                                                module0084.f5762(module0579.$g4318$.getDynamicValue(var61), module0178.f11334(var80), module0178.f11287(var80));
                                                            }
                                                            var172_177 = (SubLObject)makeBoolean(NIL == var175_180);
                                                        }
                                                    }
                                                    finally {
                                                        final SubLObject var63_164 = Threads.$is_thread_performing_cleanupP$.currentBinding(var61);
                                                        try {
                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var61);
                                                            if (NIL != var79) {
                                                                module0158.f10319(var79);
                                                            }
                                                        }
                                                        finally {
                                                            Threads.$is_thread_performing_cleanupP$.rebind(var63_164, var61);
                                                        }
                                                    }
                                                }
                                                var75 = (SubLObject)makeBoolean(NIL == var78);
                                            }
                                        }
                                    }
                                    finally {
                                        module0148.$g2097$.rebind(var64_164, var61);
                                        module0148.$g2099$.rebind(var63_163, var61);
                                    }
                                    SubLObject var82;
                                    final SubLObject var81 = var82 = module0200.f12443(module0137.f8955($ic95$));
                                    SubLObject var83 = (SubLObject)NIL;
                                    var83 = var82.first();
                                    while (NIL != var82) {
                                        final SubLObject var63_165 = module0137.$g1605$.currentBinding(var61);
                                        final SubLObject var64_165 = module0141.$g1674$.currentBinding(var61);
                                        try {
                                            module0137.$g1605$.bind(var83, var61);
                                            module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var61)) : module0141.$g1674$.getDynamicValue(var61)), var61);
                                            final SubLObject var84 = module0228.f15229(var64);
                                            if (NIL != module0138.f8992(var84)) {
                                                final SubLObject var85 = module0242.f15664(var84, module0137.f8955((SubLObject)UNPROVIDED));
                                                if (NIL != var85) {
                                                    final SubLObject var86 = module0245.f15834(var85, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var86) {
                                                        SubLObject var87;
                                                        for (var87 = module0066.f4838(module0067.f4891(var86)); NIL == module0066.f4841(var87); var87 = module0066.f4840(var87)) {
                                                            var61.resetMultipleValues();
                                                            final SubLObject var88 = module0066.f4839(var87);
                                                            final SubLObject var89 = var61.secondMultipleValue();
                                                            var61.resetMultipleValues();
                                                            if (NIL != module0147.f9507(var88)) {
                                                                final SubLObject var63_166 = module0138.$g1623$.currentBinding(var61);
                                                                try {
                                                                    module0138.$g1623$.bind(var88, var61);
                                                                    SubLObject var105_185;
                                                                    for (var105_185 = module0066.f4838(module0067.f4891(var89)); NIL == module0066.f4841(var105_185); var105_185 = module0066.f4840(var105_185)) {
                                                                        var61.resetMultipleValues();
                                                                        final SubLObject var90 = module0066.f4839(var105_185);
                                                                        final SubLObject var91 = var61.secondMultipleValue();
                                                                        var61.resetMultipleValues();
                                                                        if (NIL != module0141.f9289(var90)) {
                                                                            final SubLObject var63_167 = module0138.$g1624$.currentBinding(var61);
                                                                            try {
                                                                                module0138.$g1624$.bind(var90, var61);
                                                                                final SubLObject var92 = var91;
                                                                                if (NIL != module0077.f5302(var92)) {
                                                                                    final SubLObject var93 = module0077.f5333(var92);
                                                                                    SubLObject var94;
                                                                                    SubLObject var95;
                                                                                    SubLObject var96;
                                                                                    for (var94 = module0032.f1741(var93), var95 = (SubLObject)NIL, var95 = module0032.f1742(var94, var93); NIL == module0032.f1744(var94, var95); var95 = module0032.f1743(var95)) {
                                                                                        var96 = module0032.f1745(var94, var95);
                                                                                        if (NIL != module0032.f1746(var95, var96) && NIL == module0249.f16059(var96, (SubLObject)UNPROVIDED)) {
                                                                                            module0249.f16055(var96, (SubLObject)UNPROVIDED);
                                                                                            module0056.f4149(var96, var66);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var92.isList()) {
                                                                                    SubLObject var97 = var92;
                                                                                    SubLObject var98 = (SubLObject)NIL;
                                                                                    var98 = var97.first();
                                                                                    while (NIL != var97) {
                                                                                        if (NIL == module0249.f16059(var98, (SubLObject)UNPROVIDED)) {
                                                                                            module0249.f16055(var98, (SubLObject)UNPROVIDED);
                                                                                            module0056.f4149(var98, var66);
                                                                                        }
                                                                                        var97 = var97.rest();
                                                                                        var98 = var97.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)$ic78$, var92);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var63_167, var61);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var105_185);
                                                                }
                                                                finally {
                                                                    module0138.$g1623$.rebind(var63_166, var61);
                                                                }
                                                            }
                                                        }
                                                        module0066.f4842(var87);
                                                    }
                                                }
                                                else {
                                                    module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic79$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                }
                                            }
                                            else if (NIL != module0155.f9785(var84, (SubLObject)UNPROVIDED)) {
                                                SubLObject var6_187;
                                                final SubLObject var99 = var6_187 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var61), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var61), module0137.f8955((SubLObject)UNPROVIDED)));
                                                SubLObject var100 = (SubLObject)NIL;
                                                var100 = var6_187.first();
                                                while (NIL != var6_187) {
                                                    final SubLObject var63_168 = module0138.$g1625$.currentBinding(var61);
                                                    try {
                                                        module0138.$g1625$.bind(var100, var61);
                                                        final SubLObject var102;
                                                        final SubLObject var101 = var102 = Functions.funcall(var100, var84);
                                                        if (NIL != module0077.f5302(var102)) {
                                                            final SubLObject var103 = module0077.f5333(var102);
                                                            SubLObject var104;
                                                            SubLObject var105;
                                                            SubLObject var106;
                                                            for (var104 = module0032.f1741(var103), var105 = (SubLObject)NIL, var105 = module0032.f1742(var104, var103); NIL == module0032.f1744(var104, var105); var105 = module0032.f1743(var105)) {
                                                                var106 = module0032.f1745(var104, var105);
                                                                if (NIL != module0032.f1746(var105, var106) && NIL == module0249.f16059(var106, (SubLObject)UNPROVIDED)) {
                                                                    module0249.f16055(var106, (SubLObject)UNPROVIDED);
                                                                    module0056.f4149(var106, var66);
                                                                }
                                                            }
                                                        }
                                                        else if (var102.isList()) {
                                                            SubLObject var107 = var102;
                                                            SubLObject var108 = (SubLObject)NIL;
                                                            var108 = var107.first();
                                                            while (NIL != var107) {
                                                                if (NIL == module0249.f16059(var108, (SubLObject)UNPROVIDED)) {
                                                                    module0249.f16055(var108, (SubLObject)UNPROVIDED);
                                                                    module0056.f4149(var108, var66);
                                                                }
                                                                var107 = var107.rest();
                                                                var108 = var107.first();
                                                            }
                                                        }
                                                        else {
                                                            Errors.error((SubLObject)$ic78$, var102);
                                                        }
                                                    }
                                                    finally {
                                                        module0138.$g1625$.rebind(var63_168, var61);
                                                    }
                                                    var6_187 = var6_187.rest();
                                                    var100 = var6_187.first();
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var64_165, var61);
                                            module0137.$g1605$.rebind(var63_165, var61);
                                        }
                                        var82 = var82.rest();
                                        var83 = var82.first();
                                    }
                                    var64 = module0056.f4150(var66);
                                }
                            }
                            finally {
                                module0141.$g1674$.rebind(var65_166, var61);
                                module0138.$g1619$.rebind(var64_163, var61);
                                module0141.$g1677$.rebind(var63_162, var61);
                            }
                        }
                        else {
                            module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic81$, $ic94$, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                    }
                    finally {
                        module0137.$g1605$.rebind(var71, var61);
                        module0141.$g1674$.rebind(var70, var61);
                        module0141.$g1672$.rebind(var69, var61);
                        module0141.$g1671$.rebind(var64_162, var61);
                        module0141.$g1670$.rebind(var63_161, var61);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var64_161, var61);
                    module0141.$g1714$.rebind(var63_160, var61);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var61));
            }
            finally {
                module0139.$g1635$.rebind(var63_159, var61);
            }
        }
        finally {
            module0147.$g2095$.rebind(var63, var61);
            module0147.$g2094$.rebind(var62, var61);
        }
        module0067.f4886(module0579.$g4318$.getDynamicValue(var61), (SubLObject)$ic99$, (SubLObject)T);
        return (SubLObject)$ic83$;
    }
    
    public static SubLObject f48217() {
        final SubLThread var61 = SubLProcess.currentSubLThread();
        return module0067.f4884(module0579.$g4318$.getDynamicValue(var61), (SubLObject)$ic99$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f48211(final SubLObject var59, SubLObject var71) {
        if (var71 == UNPROVIDED) {
            var71 = (SubLObject)$ic91$;
        }
        final SubLThread var72 = SubLProcess.currentSubLThread();
        if (NIL == module0173.f10955(var59)) {
            return (SubLObject)NIL;
        }
        if (NIL == f48217()) {
            f48216();
        }
        final SubLObject var73 = module0067.f4884(module0579.$g4318$.getDynamicValue(var72), var59, (SubLObject)UNPROVIDED);
        SubLObject var74 = (SubLObject)NIL;
        if (NIL == var74) {
            SubLObject var75;
            SubLObject var76;
            for (var75 = var73, var76 = (SubLObject)NIL, var76 = var75.first(); NIL == var74 && NIL != var75; var74 = (SubLObject)makeBoolean(var71 == $ic91$ || NIL != module0751.f47007(var76, var71)), var75 = var75.rest(), var76 = var75.first()) {}
        }
        return var74;
    }
    
    public static SubLObject f48218(final SubLObject var76, SubLObject var71) {
        if (var71 == UNPROVIDED) {
            var71 = module0579.$g4260$.getDynamicValue();
        }
        return module0035.sublisp_boolean(f48219(var76, var71));
    }
    
    public static SubLObject f48220(final SubLObject var76, final SubLObject var71) {
        final SubLThread var77 = SubLProcess.currentSubLThread();
        final SubLObject var78 = module0077.f5313((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var79 = module0077.f5313((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var80;
        for (var80 = var76; NIL != module0202.f12606(var80); var80 = module0205.f13204(var80, (SubLObject)UNPROVIDED)) {
            module0077.f5326(module0205.f13203(var80, (SubLObject)UNPROVIDED), var79);
        }
        if (NIL != f48221(var80, var71)) {
            SubLObject var82;
            final SubLObject var81 = var82 = module0205.f13207(var80, (SubLObject)$ic101$);
            SubLObject var83 = (SubLObject)NIL;
            var83 = var82.first();
            while (NIL != var82) {
                var77.resetMultipleValues();
                final SubLObject var84 = module0337.f22630(var83, (SubLObject)$ic102$);
                final SubLObject var85 = var77.secondMultipleValue();
                var77.resetMultipleValues();
                if (NIL != var84) {
                    final SubLObject var86 = module0035.f2294(var85, (SubLObject)$ic103$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    final SubLObject var87 = module0035.f2294(var85, (SubLObject)$ic104$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    if (NIL != module0077.f5320(var87, var79)) {
                        if (NIL != module0578.f35470((SubLObject)TWO_INTEGER)) {
                            PrintLow.format((SubLObject)T, (SubLObject)$ic105$, var83);
                        }
                        final SubLObject var88 = module0147.f9540(var71);
                        final SubLObject var89 = module0147.$g2095$.currentBinding(var77);
                        final SubLObject var90 = module0147.$g2094$.currentBinding(var77);
                        final SubLObject var91 = module0147.$g2096$.currentBinding(var77);
                        try {
                            module0147.$g2095$.bind(module0147.f9545(var88), var77);
                            module0147.$g2094$.bind(module0147.f9546(var88), var77);
                            module0147.$g2096$.bind(module0147.f9549(var88), var77);
                            final SubLObject var92 = $ic106$;
                            if (NIL != module0158.f10010(var86, (SubLObject)FOUR_INTEGER, var92)) {
                                final SubLObject var93 = module0158.f10011(var86, (SubLObject)FOUR_INTEGER, var92);
                                SubLObject var94 = (SubLObject)NIL;
                                final SubLObject var95 = (SubLObject)NIL;
                                while (NIL == var94) {
                                    final SubLObject var96 = module0052.f3695(var93, var95);
                                    final SubLObject var97 = (SubLObject)makeBoolean(!var95.eql(var96));
                                    if (NIL != var97) {
                                        SubLObject var98 = (SubLObject)NIL;
                                        try {
                                            var98 = module0158.f10316(var96, (SubLObject)$ic98$, (SubLObject)$ic89$, (SubLObject)NIL);
                                            SubLObject var172_196 = (SubLObject)NIL;
                                            final SubLObject var173_197 = (SubLObject)NIL;
                                            while (NIL == var172_196) {
                                                final SubLObject var99 = module0052.f3695(var98, var173_197);
                                                final SubLObject var175_199 = (SubLObject)makeBoolean(!var173_197.eql(var99));
                                                if (NIL != var175_199) {
                                                    if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                                                        PrintLow.format((SubLObject)T, (SubLObject)$ic107$, var99);
                                                    }
                                                    module0077.f5326(var99, var78);
                                                }
                                                var172_196 = (SubLObject)makeBoolean(NIL == var175_199);
                                            }
                                        }
                                        finally {
                                            final SubLObject var63_200 = Threads.$is_thread_performing_cleanupP$.currentBinding(var77);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var77);
                                                if (NIL != var98) {
                                                    module0158.f10319(var98);
                                                }
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var63_200, var77);
                                            }
                                        }
                                    }
                                    var94 = (SubLObject)makeBoolean(NIL == var97);
                                }
                            }
                        }
                        finally {
                            module0147.$g2096$.rebind(var91, var77);
                            module0147.$g2094$.rebind(var90, var77);
                            module0147.$g2095$.rebind(var89, var77);
                        }
                    }
                }
                var82 = var82.rest();
                var83 = var82.first();
            }
        }
        return module0751.f47010(Sort.sort(module0077.f5312(var78), (SubLObject)$ic108$, (SubLObject)$ic109$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f48219(final SubLObject var76, final SubLObject var71) {
        final SubLThread var77 = SubLProcess.currentSubLThread();
        final SubLObject var78 = module0034.$g879$.getDynamicValue(var77);
        SubLObject var79 = (SubLObject)NIL;
        if (NIL == var78) {
            return f48220(var76, var71);
        }
        var79 = module0034.f1857(var78, (SubLObject)$ic100$, (SubLObject)UNPROVIDED);
        if (NIL == var79) {
            var79 = module0034.f1807(module0034.f1842(var78), (SubLObject)$ic100$, (SubLObject)TWO_INTEGER, (SubLObject)$ic110$, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var78, (SubLObject)$ic100$, var79);
        }
        final SubLObject var80 = module0034.f1782(var76, var71);
        final SubLObject var81 = module0034.f1814(var79, var80, (SubLObject)UNPROVIDED);
        if (var81 != $ic92$) {
            SubLObject var82 = var81;
            SubLObject var83 = (SubLObject)NIL;
            var83 = var82.first();
            while (NIL != var82) {
                SubLObject var84 = var83.first();
                final SubLObject var85 = conses_high.second(var83);
                if (var76.equal(var84.first())) {
                    var84 = var84.rest();
                    if (NIL != var84 && NIL == var84.rest() && var71.equal(var84.first())) {
                        return module0034.f1959(var85);
                    }
                }
                var82 = var82.rest();
                var83 = var82.first();
            }
        }
        final SubLObject var86 = Values.arg2(var77.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f48220(var76, var71)));
        module0034.f1836(var79, var80, var81, var86, (SubLObject)ConsesLow.list(var76, var71));
        return module0034.f1959(var86);
    }
    
    public static SubLObject f48221(final SubLObject var76, final SubLObject var71) {
        return module0202.f12595(var76);
    }
    
    public static SubLObject f48222(final SubLObject var201, final SubLObject var202) {
        return Numbers.numG(module0731.f44830(var201), module0731.f44830(var202));
    }
    
    public static SubLObject f48223(final SubLObject var1) {
        return (SubLObject)makeBoolean(var1.isList() && var1.first().eql($ic111$) && conses_high.second(var1).isInteger() && NIL != module0269.f17706(conses_high.third(var1)));
    }
    
    public static SubLObject f48224(final SubLObject var1) {
        return (SubLObject)makeBoolean(var1.isCons() && NIL != f48223(var1.first()));
    }
    
    public static SubLObject f48225(final SubLObject var1) {
        if (var1.isList() && var1.first().eql($ic112$)) {
            final SubLObject var2 = conses_high.second(var1);
            final SubLObject var3 = conses_high.third(var1);
            return (SubLObject)makeBoolean(NIL != var2 && NIL == module0035.find_if_not(Symbols.symbol_function((SubLObject)$ic113$), var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL != f48193(var3));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f48226(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f48227(var1) && NIL != module0035.f2438(Symbols.symbol_function((SubLObject)$ic113$), var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f48228(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f48227(var1) && NIL == module0035.f2438(Symbols.symbol_function((SubLObject)$ic113$), var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f48227(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = module0147.$g2094$.currentBinding(var2);
        final SubLObject var5 = module0147.$g2095$.currentBinding(var2);
        try {
            module0147.$g2094$.bind((SubLObject)$ic60$, var2);
            module0147.$g2095$.bind($ic61$, var2);
            var3 = (SubLObject)makeBoolean((NIL != module0212.f13762(var1) && NIL != module0220.f14544(var1, $ic114$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) || NIL != conses_high.member(module0205.f13136(var1), (SubLObject)$ic115$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        finally {
            module0147.$g2095$.rebind(var5, var2);
            module0147.$g2094$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f48229(final SubLObject var1) {
        final SubLObject var2 = module0228.f15230(var1);
        return module0202.f12589(var2, $ic116$);
    }
    
    public static SubLObject f48230(final SubLObject var1, SubLObject var71) {
        if (var71 == UNPROVIDED) {
            var71 = (SubLObject)NIL;
        }
        return module0337.f22630(var1, (SubLObject)$ic117$);
    }
    
    public static SubLObject f48231() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48141", "S#50974", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48147", "S#52627", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48152", "S#52628", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48153", "S#39319", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48154", "S#39321", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48155", "S#39320", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48150", "S#52629", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48156", "S#52630", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48144", "S#52631", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48151", "S#52632", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48146", "S#52633", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48157", "S#52634", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48158", "S#52635", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48145", "S#52636", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48148", "S#52637", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48149", "S#52638", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48159", "S#52639", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48143", "S#52640", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48142", "PPH-IDENTIFY-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48160", "S#52641", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48161", "S#52642", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48162", "S#52643", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48163", "S#52644", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48164", "S#51004", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48165", "S#52645", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48166", "S#52646", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48167", "S#52647", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48168", "S#52648", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48169", "S#52649", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48170", "S#52650", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48171", "S#52651", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48172", "S#52652", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48173", "S#52653", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48175", "S#52623", 1, 0, false);
        new $f48175$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48176", "S#52654", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48177", "S#50967", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48178", "S#52655", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48174", "S#52656", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48179", "S#52657", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48180", "S#52658", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48181", "S#52659", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48182", "S#52660", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48183", "S#52661", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48184", "S#52662", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48185", "S#52663", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48186", "S#52664", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48187", "S#52665", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48188", "S#52666", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48189", "S#52667", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48190", "S#52668", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48191", "S#52669", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48192", "S#52670", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48194", "S#52671", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48195", "S#52625", 1, 0, false);
        new $f48195$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48196", "S#51693", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48197", "S#52672", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48198", "S#52673", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48199", "S#52626", 1, 0, false);
        new $f48199$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48200", "S#50947", 1, 0, false);
        new $f48200$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48201", "S#52674", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48202", "S#52675", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48193", "S#52676", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48203", "S#52677", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48204", "S#52678", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48205", "S#52679", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48207", "S#52680", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48208", "S#52681", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48206", "S#50964", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48209", "S#52682", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48210", "S#39913", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48212", "S#52683", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48214", "S#52684", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48213", "S#52685", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48215", "S#50949", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48216", "S#41508", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48217", "S#41507", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48211", "S#25957", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48218", "S#52686", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48220", "S#52687", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48219", "S#52688", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48221", "S#52689", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48222", "S#52690", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48223", "S#52691", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48224", "S#52692", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48225", "S#52693", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48226", "S#52694", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48228", "S#52695", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48227", "S#52696", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48229", "S#52697", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0762", "f48230", "S#52698", 1, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f48232() {
        $g6101$ = SubLFiles.deflexical("S#52699", (SubLObject)$ic0$);
        $g6102$ = SubLFiles.deflexical("S#52700", (SubLObject)$ic1$);
        $g6103$ = SubLFiles.deflexical("S#52701", (NIL != Symbols.boundp((SubLObject)$ic2$)) ? $g6103$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)$ic3$, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        $g6104$ = SubLFiles.deflexical("S#52702", (SubLObject)$ic4$);
        $g6105$ = SubLFiles.deflexical("S#52703", (SubLObject)$ic38$);
        $g6106$ = SubLFiles.defparameter("S#52704", module0077.f5313(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f48233() {
        module0003.f57((SubLObject)$ic2$);
        module0002.f50((SubLObject)$ic17$, (SubLObject)$ic18$);
        module0002.f50((SubLObject)$ic20$, (SubLObject)$ic18$);
        module0002.f50((SubLObject)$ic22$, (SubLObject)$ic18$);
        module0034.f1895((SubLObject)$ic90$);
        module0034.f1895((SubLObject)$ic100$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f48231();
    }
    
    public void initializeVariables() {
        f48232();
    }
    
    public void runTopLevelForms() {
        f48233();
    }
    
    static {
        me = (SubLFile)new module0762();
        $g6101$ = null;
        $g6102$ = null;
        $g6103$ = null;
        $g6104$ = null;
        $g6105$ = null;
        $g6106$ = null;
        $ic0$ = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)makeKeyword("OBJECT"), (SubLObject)makeSymbol("S#49433", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("LIST"), (SubLObject)ConsesLow.cons((SubLObject)makeKeyword("ASSERTION"), (SubLObject)THREE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)makeKeyword("CONSTANT"), (SubLObject)THREE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)makeKeyword("NART"), (SubLObject)THREE_INTEGER), (SubLObject)makeKeyword("STRING"), (SubLObject)makeKeyword("NUMBER"), (SubLObject)makeKeyword("SYMBOL"))), ConsesLow.list((SubLObject)makeKeyword("LIST"), (SubLObject)makeSymbol("S#49433", "CYC"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)makeKeyword("NAUT"), (SubLObject)THREE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)makeKeyword("CYCL-SENTENCE"), (SubLObject)THREE_INTEGER), (SubLObject)makeKeyword("ROP-EXPRESSION"))), ConsesLow.list((SubLObject)makeKeyword("SYMBOL"), (SubLObject)makeSymbol("S#49433", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VARIABLE"), (SubLObject)makeKeyword("KEYWORD"), (SubLObject)makeKeyword("CYCL-SYMBOL"), (SubLObject)makeKeyword("NON-CYCL-SYMBOL"))), ConsesLow.list((SubLObject)makeKeyword("VARIABLE"), (SubLObject)makeSymbol("S#49433", "CYC"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)makeKeyword("LEXIFIED-VARIABLE"), (SubLObject)THREE_INTEGER))), ConsesLow.list((SubLObject)makeKeyword("CYCL-SENTENCE"), (SubLObject)makeSymbol("S#49433", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("ATOMIC-SENTENCE"), (SubLObject)makeKeyword("NEGATION"), (SubLObject)makeKeyword("IMPLICATION"), (SubLObject)ConsesLow.cons((SubLObject)makeKeyword("EXISTENTIAL"), (SubLObject)THREE_INTEGER), (SubLObject)makeKeyword("UNIVERSAL"), (SubLObject)makeKeyword("COORDINATION"), (SubLObject)makeKeyword("CFF-EXPR"), (SubLObject)makeKeyword("CF-IMPLICATION"))), ConsesLow.list((SubLObject)makeKeyword("NEGATION"), (SubLObject)makeSymbol("S#49433", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("SIMPLE-NEGATION"))), ConsesLow.list((SubLObject)makeKeyword("ATOMIC-SENTENCE"), (SubLObject)makeSymbol("S#49433", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("ISA-EXPR"), (SubLObject)makeKeyword("SCRIPT-EXPANSION"), (SubLObject)makeKeyword("RMP-SENTENCE"), (SubLObject)makeKeyword("ABNORMAL"), (SubLObject)makeKeyword("EXCEPTION"), (SubLObject)makeKeyword("NTH-EXPR"))), ConsesLow.list((SubLObject)makeKeyword("RMP-SENTENCE"), (SubLObject)makeSymbol("S#49433", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("SPECIFIED-SCOPE-SENTENCE"))), ConsesLow.list((SubLObject)makeKeyword("EXISTENTIAL"), (SubLObject)makeSymbol("S#49433", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VERB-SEMTRANS-MATCHER"))), ConsesLow.list((SubLObject)makeKeyword("CONSTANT"), (SubLObject)makeSymbol("S#49433", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TRUE"), (SubLObject)makeKeyword("FALSE"), (SubLObject)makeKeyword("HYPOTHETICAL"), (SubLObject)makeKeyword("LEXICAL-WORD"), (SubLObject)makeKeyword("DISCOURSE-PARTICIPANT"), (SubLObject)makeKeyword("GEOPOLITICAL-ENTITY"))), ConsesLow.list((SubLObject)makeKeyword("NART"), (SubLObject)makeSymbol("S#49433", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("SKOLEM-TERM"), (SubLObject)makeKeyword("THE-COLLECTION-OF-NAT"), (SubLObject)makeKeyword("GEOPOLITICAL-ENTITY"))), ConsesLow.list((SubLObject)makeKeyword("NAUT"), (SubLObject)makeSymbol("S#49433", "CYC"), (SubLObject)ConsesLow.list(new SubLObject[] { makeKeyword("PHRASE-DENOTING-NAUT"), makeKeyword("DATE-NAUT"), makeKeyword("IMAGE-URL"), makeKeyword("COLLECTION-DENOTING-NAT"), ConsesLow.cons((SubLObject)makeKeyword("RESOURCE-WITH-URI"), (SubLObject)THREE_INTEGER), makeKeyword("SET-NAUT"), makeKeyword("EXPONENT-NAUT"), makeKeyword("UNICODE-NAUT"), makeKeyword("FN-TO-ARG-0"), makeKeyword("KAPPA-EXPR"), makeKeyword("SKOLEM-TERM") })), ConsesLow.list((SubLObject)makeKeyword("DATE-NAUT"), (SubLObject)makeSymbol("S#49433", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("YEAR-NAUT"), (SubLObject)makeKeyword("MONTH-NAUT"), (SubLObject)makeKeyword("DAY-NAUT"))), ConsesLow.list((SubLObject)makeKeyword("COLLECTION-DENOTING-NAT"), (SubLObject)makeSymbol("S#49433", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("SUBCOLLECTION-RELATION-NAUT"), (SubLObject)makeKeyword("THE-COLLECTION-OF-NAT"), (SubLObject)makeKeyword("NL-TAGGED-TERM"))), ConsesLow.list((SubLObject)makeKeyword("SUBCOLLECTION-RELATION-NAUT"), (SubLObject)makeSymbol("S#49433", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("RELATIONAL-NOUN-SUBCOLLECTION-NAUT"))), ConsesLow.list((SubLObject)makeKeyword("NUMBER"), (SubLObject)makeSymbol("S#49433", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("UNIVERSAL-DATE"), (SubLObject)makeKeyword("UNIVERSAL-SECOND"), (SubLObject)makeKeyword("FLOAT"))) });
        $ic1$ = ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)makeKeyword("OBJECT"), (SubLObject)makeSymbol("TRUE")), ConsesLow.cons((SubLObject)makeKeyword("ASSERTION"), (SubLObject)makeSymbol("ASSERTION-P")), ConsesLow.cons((SubLObject)makeKeyword("LIST"), (SubLObject)makeSymbol("LISTP")), ConsesLow.cons((SubLObject)makeKeyword("SYMBOL"), (SubLObject)makeSymbol("SYMBOLP")), ConsesLow.cons((SubLObject)makeKeyword("NON-CYCL-SYMBOL"), (SubLObject)makeSymbol("S#52659", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("SCRIPT-EXPANSION"), (SubLObject)makeSymbol("S#52669", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("NTH-EXPR"), (SubLObject)makeSymbol("S#52670", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("VARIABLE"), (SubLObject)makeSymbol("EL-VAR?")), ConsesLow.cons((SubLObject)makeKeyword("LEXIFIED-VARIABLE"), (SubLObject)makeSymbol("S#51786", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("NAUT"), (SubLObject)makeSymbol("S#52623", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("SKSI-SUPPORTED-EXTERNAL-TERM"), (SubLObject)makeSymbol("SKSI-SUPPORTED-EXTERNAL-TERM?")), ConsesLow.cons((SubLObject)makeKeyword("RESOURCE-WITH-URI"), (SubLObject)makeSymbol("S#52705", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("DATE-NAUT"), (SubLObject)makeSymbol("S#52648", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("YEAR-NAUT"), (SubLObject)makeSymbol("S#52649", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("MONTH-NAUT"), (SubLObject)makeSymbol("S#52650", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("DAY-NAUT"), (SubLObject)makeSymbol("S#52651", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("IMAGE-URL"), (SubLObject)makeSymbol("S#52698", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("SET-NAUT"), (SubLObject)makeSymbol("S#52645", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("EXPONENT-NAUT"), (SubLObject)makeSymbol("S#52646", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("UNICODE-NAUT"), (SubLObject)makeSymbol("S#52647", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("PHRASE-DENOTING-NAUT"), (SubLObject)makeSymbol("S#39913", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("SUBCOLLECTION-RELATION-NAUT"), (SubLObject)makeSymbol("S#52679", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("THE-COLLECTION-OF-NAT"), (SubLObject)makeSymbol("S#52680", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("RELATIONAL-NOUN-SUBCOLLECTION-NAUT"), (SubLObject)makeSymbol("S#52682", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("NUMBER"), (SubLObject)makeSymbol("NUMBERP")), ConsesLow.cons((SubLObject)makeKeyword("UNIVERSAL-DATE"), (SubLObject)makeSymbol("S#52674", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("UNIVERSAL-SECOND"), (SubLObject)makeSymbol("S#52675", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("FLOAT"), (SubLObject)makeSymbol("FLOATP")), ConsesLow.cons((SubLObject)makeKeyword("STRING"), (SubLObject)makeSymbol("STRINGP")), ConsesLow.cons((SubLObject)makeKeyword("CONSTANT"), (SubLObject)makeSymbol("CONSTANT-P")), ConsesLow.cons((SubLObject)makeKeyword("CYCL-SENTENCE"), (SubLObject)makeSymbol("S#50967", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("ROP-EXPRESSION"), (SubLObject)makeSymbol("S#52677", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("REL-VARIABLE"), (SubLObject)makeSymbol("S#52662", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("SKOLEM-TERM"), (SubLObject)makeSymbol("S#52671", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("GEOPOLITICAL-ENTITY"), (SubLObject)makeSymbol("S#52625", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("CITY"), (SubLObject)makeSymbol("S#51693", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("US-CITY"), (SubLObject)makeSymbol("S#52672", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("NON-US-CITY"), (SubLObject)makeSymbol("S#52673", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("KEYWORD"), (SubLObject)makeSymbol("KEYWORDP")), ConsesLow.cons((SubLObject)makeKeyword("CYCL-SYMBOL"), (SubLObject)makeSymbol("S#52658", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("ATOMIC-SENTENCE"), (SubLObject)makeSymbol("S#52657", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("NEGATION"), (SubLObject)makeSymbol("S#13439", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("SIMPLE-NEGATION"), (SubLObject)makeSymbol("S#52663", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("RMP-SENTENCE"), (SubLObject)makeSymbol("S#52664", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("SPECIFIED-SCOPE-SENTENCE"), (SubLObject)makeSymbol("S#52666", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("IMPLICATION"), (SubLObject)makeSymbol("S#15542", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("EXISTENTIAL"), (SubLObject)makeSymbol("S#13455", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("UNIVERSAL"), (SubLObject)makeSymbol("S#52656", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("COORDINATION"), (SubLObject)makeSymbol("S#52655", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("VERB-SEMTRANS-MATCHER"), (SubLObject)makeSymbol("S#52686", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("NART"), (SubLObject)makeSymbol("NART-P")), ConsesLow.cons((SubLObject)makeKeyword("TRUE"), (SubLObject)makeSymbol("S#52660", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("FALSE"), (SubLObject)makeSymbol("S#52661", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("HYPOTHETICAL"), (SubLObject)makeSymbol("S#52626", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("LEXICAL-WORD"), (SubLObject)makeSymbol("S#50947", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("DISCOURSE-PARTICIPANT"), (SubLObject)makeSymbol("S#52616", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("OTHER-CONSTANT"), (SubLObject)makeSymbol("VALID-CONSTANT?")), ConsesLow.cons((SubLObject)makeKeyword("COLLECTION-DENOTING-NAT"), (SubLObject)makeSymbol("S#52644", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("NL-TAGGED-TERM"), (SubLObject)makeSymbol("S#51004", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("DB-FIELD"), (SubLObject)makeSymbol("S#52696", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("GROUND-DB-FIELD"), (SubLObject)makeSymbol("S#52695", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("OPEN-DB-FIELD"), (SubLObject)makeSymbol("S#52694", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("KAPPA-EXPR"), (SubLObject)makeSymbol("S#52693", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("FN-TO-ARG-0"), (SubLObject)makeSymbol("S#52692", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("ABNORMAL"), (SubLObject)makeSymbol("S#15584", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("EXCEPTION"), (SubLObject)makeSymbol("S#15583", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("CFF-EXPR"), (SubLObject)makeSymbol("S#52668", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("CF-IMPLICATION"), (SubLObject)makeSymbol("S#52667", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("DB-ENTRY-FN"), (SubLObject)makeSymbol("S#52697", "CYC")) });
        $ic2$ = makeSymbol("S#52701", "CYC");
        $ic3$ = makeInteger(256);
        $ic4$ = ConsesLow.list((SubLObject)makeKeyword("FALLBACK"), (SubLObject)makeKeyword("DECENT"), (SubLObject)makeKeyword("BEST"));
        $ic5$ = makeString("~&Found ~D methods for ~S: ~S.~%");
        $ic6$ = makeString("~&Found no methods for ~S.~%");
        $ic7$ = ConsesLow.list((SubLObject)makeSymbol("S#39317", "CYC"), (SubLObject)makeSymbol("S#52706", "CYC"));
        $ic8$ = makeString("~&Found paraphrase methods for ~S:~% ~S~%");
        $ic9$ = makeString("~&No paraphrase methods found for ~S.~%");
        $ic10$ = makeString("(PPH error level ");
        $ic11$ = makeString(") ");
        $ic12$ = makeString("~&~S is not a valid paraphrase type.~%");
        $ic13$ = makeString("~&~S is not a symbol.~%");
        $ic14$ = makeString("~&~S is not a valid paraphrase method quality.~%Must be in ~S.~%");
        $ic15$ = makeSymbol("FIRST");
        $ic16$ = makeString("~&~S is not a registered method for ~S.~%");
        $ic17$ = makeSymbol("S#39319", "CYC");
        $ic18$ = makeSymbol("S#39213", "CYC");
        $ic19$ = ConsesLow.list((SubLObject)makeSymbol("SYMBOL"), (SubLObject)makeSymbol("S#52707", "CYC"));
        $ic20$ = makeSymbol("S#39321", "CYC");
        $ic21$ = ConsesLow.list((SubLObject)makeSymbol("TYPE"), (SubLObject)makeSymbol("S#52707", "CYC"));
        $ic22$ = makeSymbol("S#39320", "CYC");
        $ic23$ = makeSymbol("LISTP");
        $ic24$ = makeSymbol("S#52634", "CYC");
        $ic25$ = makeSymbol("SECOND");
        $ic26$ = makeSymbol("<");
        $ic27$ = ConsesLow.list((SubLObject)makeKeyword("OBJECT"));
        $ic28$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("TYPE"), (SubLObject)makeSymbol("S#52708", "CYC"));
        $ic29$ = makeString("~&~S~% passed test ~S for terminal type ~S.~%");
        $ic30$ = makeString("~&~S~% passed test ~S for non-terminal type ~S.~%");
        $ic31$ = makeString("~&~S~% failed test ~S for non-final type ~S.~%");
        $ic32$ = makeString("~&~S~% failed test ~S for final type ~S.~%");
        $ic33$ = makeString("~&~S~% judged to be non-terminal type ~S.~%");
        $ic34$ = makeString("~&~S~% does not pass top-level test ~S.~%");
        $ic35$ = constant_handles_oc.f8479((SubLObject)makeString("CollectionDenotingFunction"));
        $ic36$ = constant_handles_oc.f8479((SubLObject)makeString("TheSetOf"));
        $ic37$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ExponentFn")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("ANYTHING"));
        $ic38$ = ConsesLow.list(new SubLObject[] { constant_handles_oc.f8479((SubLObject)makeString("CenturyFn")), constant_handles_oc.f8479((SubLObject)makeString("DecadeFn")), constant_handles_oc.f8479((SubLObject)makeString("YearFn")), constant_handles_oc.f8479((SubLObject)makeString("QuarterFn")), constant_handles_oc.f8479((SubLObject)makeString("MonthFn")), constant_handles_oc.f8479((SubLObject)makeString("DayFn")), constant_handles_oc.f8479((SubLObject)makeString("HourFn")), constant_handles_oc.f8479((SubLObject)makeString("MinuteFn")), constant_handles_oc.f8479((SubLObject)makeString("SecondFn")), constant_handles_oc.f8479((SubLObject)makeString("MilliSecondFn")) });
        $ic39$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("YearFn")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("POSITIVE-INTEGER-P")));
        $ic40$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("MonthFn")), (SubLObject)makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#52649", "CYC")));
        $ic41$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("DayFn")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("POSITIVE-INTEGER-P")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#52650", "CYC")));
        $ic42$ = constant_handles_oc.f8479((SubLObject)makeString("Function-Denotational"));
        $ic43$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("SchemaObjectFn")), constant_handles_oc.f8479((SubLObject)makeString("CCF-SDB-Bnode-CMLS")), (SubLObject)makeKeyword("STRING"));
        $ic44$ = constant_handles_oc.f8479((SubLObject)makeString("TruthFunction"));
        $ic45$ = constant_handles_oc.f8479((SubLObject)makeString("True"));
        $ic46$ = constant_handles_oc.f8479((SubLObject)makeString("False"));
        $ic47$ = constant_handles_oc.f8479((SubLObject)makeString("expansion"));
        $ic48$ = constant_handles_oc.f8479((SubLObject)makeString("cfImplies"));
        $ic49$ = constant_handles_oc.f8479((SubLObject)makeString("compositeFieldFormat"));
        $ic50$ = constant_handles_oc.f8479((SubLObject)makeString("ScriptPredicate"));
        $ic51$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nthLargestElement")), constant_handles_oc.f8479((SubLObject)makeString("nthSmallestElement")));
        $ic52$ = constant_handles_oc.f8479((SubLObject)makeString("Collection"));
        $ic53$ = constant_handles_oc.f8479((SubLObject)makeString("GeopoliticalEntity"));
        $ic54$ = constant_handles_oc.f8479((SubLObject)makeString("InferencePSC"));
        $ic55$ = constant_handles_oc.f8479((SubLObject)makeString("City"));
        $ic56$ = constant_handles_oc.f8479((SubLObject)makeString("USCity"));
        $ic57$ = constant_handles_oc.f8479((SubLObject)makeString("hypotheticalTerm"));
        $ic58$ = makeKeyword("UNIVERSAL-DATE");
        $ic59$ = makeKeyword("UNIVERSAL-SECOND");
        $ic60$ = makeSymbol("S#12274", "CYC");
        $ic61$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic62$ = constant_handles_oc.f8479((SubLObject)makeString("TruthValue"));
        $ic63$ = constant_handles_oc.f8479((SubLObject)makeString("TheResultOfParsing"));
        $ic64$ = constant_handles_oc.f8479((SubLObject)makeString("TheCollectionOf"));
        $ic65$ = constant_handles_oc.f8479((SubLObject)makeString("SubcollectionRelationFunction"));
        $ic66$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic67$ = makeKeyword("BREADTH");
        $ic68$ = makeKeyword("QUEUE");
        $ic69$ = makeKeyword("STACK");
        $ic70$ = makeSymbol("S#11450", "CYC");
        $ic71$ = makeKeyword("ERROR");
        $ic72$ = makeString("~A is not a ~A");
        $ic73$ = makeSymbol("S#11592", "CYC");
        $ic74$ = makeKeyword("CERROR");
        $ic75$ = makeString("continue anyway");
        $ic76$ = makeKeyword("WARN");
        $ic77$ = makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic78$ = makeString("~A is neither SET-P nor LISTP.");
        $ic79$ = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic80$ = ConsesLow.list((SubLObject)makeUninternedSymbol("US#4D5E436"), (SubLObject)makeUninternedSymbol("US#1526883"), (SubLObject)makeUninternedSymbol("US#15AA083"));
        $ic81$ = makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic82$ = constant_handles_oc.f8479((SubLObject)makeString("CollectionSubsetFn"));
        $ic83$ = makeKeyword("INITIALIZED");
        $ic84$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("OR"), constant_handles_oc.f8479((SubLObject)makeString("SubcollectionOfWithRelationFromTypeFn")), constant_handles_oc.f8479((SubLObject)makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles_oc.f8479((SubLObject)makeString("SubcollectionOfWithRelationFromFn")), constant_handles_oc.f8479((SubLObject)makeString("SubcollectionOfWithRelationToFn"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#12112", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#24413", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#132", "CYC")));
        $ic85$ = makeSymbol("S#132", "CYC");
        $ic86$ = makeSymbol("S#24413", "CYC");
        $ic87$ = makeSymbol("S#12112", "CYC");
        $ic88$ = makeSymbol("S#11675", "CYC");
        $ic89$ = makeKeyword("TRUE");
        $ic90$ = makeSymbol("S#52685", "CYC");
        $ic91$ = makeKeyword("ANY");
        $ic92$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic93$ = constant_handles_oc.f8479((SubLObject)makeString("BestNLPhraseOfStringFn"));
        $ic94$ = constant_handles_oc.f8479((SubLObject)makeString("SententialConstituent"));
        $ic95$ = constant_handles_oc.f8479((SubLObject)makeString("genls"));
        $ic96$ = makeSymbol("S#12344", "CYC");
        $ic97$ = constant_handles_oc.f8479((SubLObject)makeString("resultIsa"));
        $ic98$ = makeKeyword("GAF");
        $ic99$ = makeSymbol("S#39294", "CYC");
        $ic100$ = makeSymbol("S#52688", "CYC");
        $ic101$ = makeKeyword("IGNORE");
        $ic102$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#750", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#751", "CYC")));
        $ic103$ = makeSymbol("S#751", "CYC");
        $ic104$ = makeSymbol("S#750", "CYC");
        $ic105$ = makeString("Found head-binding conjunct:~% ~S");
        $ic106$ = constant_handles_oc.f8479((SubLObject)makeString("verbSemTrans-Canonical"));
        $ic107$ = makeString("Found matching vST-Canonical:~% ~S");
        $ic108$ = makeSymbol("S#52690", "CYC");
        $ic109$ = makeSymbol("GAF-ARG3");
        $ic110$ = makeInteger(24);
        $ic111$ = constant_handles_oc.f8479((SubLObject)makeString("FunctionToArg"));
        $ic112$ = constant_handles_oc.f8479((SubLObject)makeString("Kappa"));
        $ic113$ = makeSymbol("EL-VAR?");
        $ic114$ = constant_handles_oc.f8479((SubLObject)makeString("fieldCodes"));
        $ic115$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("SchemaLF")), constant_handles_oc.f8479((SubLObject)makeString("SchemaPF")));
        $ic116$ = constant_handles_oc.f8479((SubLObject)makeString("DBEntryFn"));
        $ic117$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ImageURLFn")), (SubLObject)makeKeyword("ANYTHING"));
    }
    
    public static final class $f48175$UnaryFunction extends UnaryFunction
    {
        public $f48175$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#52623"));
        }
        
        public SubLObject processItem(final SubLObject var67) {
            return f48175(var67);
        }
    }
    
    public static final class $f48195$UnaryFunction extends UnaryFunction
    {
        public $f48195$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#52625"));
        }
        
        public SubLObject processItem(final SubLObject var67) {
            return f48195(var67);
        }
    }
    
    public static final class $f48199$UnaryFunction extends UnaryFunction
    {
        public $f48199$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#52626"));
        }
        
        public SubLObject processItem(final SubLObject var67) {
            return f48199(var67);
        }
    }
    
    public static final class $f48200$UnaryFunction extends UnaryFunction
    {
        public $f48200$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#50947"));
        }
        
        public SubLObject processItem(final SubLObject var67) {
            return f48200(var67);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 1516 ms
	
	Decompiled with Procyon 0.5.32.
*/