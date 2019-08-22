package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0641 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0641";
    public static final String myFingerPrint = "d5a8017eda663a3bcc91583d44a6e9aad27e90f57d9bb1becd80cf25cedc3af8";
    public static SubLSymbol $g4961$;
    public static SubLSymbol $g4962$;
    public static SubLSymbol $g4963$;
    public static SubLSymbol $g4964$;
    public static SubLSymbol $g4965$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLFloat $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLInteger $ic6$;
    private static final SubLInteger $ic7$;
    private static final SubLObject $ic8$;
    private static final SubLObject $ic9$;
    private static final SubLObject $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLObject $ic12$;
    private static final SubLObject $ic13$;
    private static final SubLObject $ic14$;
    private static final SubLObject $ic15$;
    private static final SubLObject $ic16$;
    private static final SubLList $ic17$;
    private static final SubLObject $ic18$;
    private static final SubLObject $ic19$;
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
    private static final SubLFloat $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLInteger $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLList $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLInteger $ic43$;
    private static final SubLInteger $ic44$;
    private static final SubLObject $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLObject $ic47$;
    private static final SubLList $ic48$;
    private static final SubLObject $ic49$;
    private static final SubLObject $ic50$;
    private static final SubLObject $ic51$;
    private static final SubLObject $ic52$;
    private static final SubLObject $ic53$;
    private static final SubLObject $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLString $ic57$;
    private static final SubLObject $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLList $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLString $ic63$;
    
    public static SubLObject f38983(final SubLObject var1, final SubLObject var2) {
        if (NIL == var1 || NIL == var2) {
            return (SubLObject)NIL;
        }
        f38984();
        final SubLObject var3 = f38985(var1);
        final SubLObject var4 = f38986(var1);
        SubLObject var5 = (SubLObject)NIL;
        final SubLObject var6 = var2.isList() ? module0213.f13918(module0172.f10921(var2)) : module0213.f13918(var2);
        SubLObject var7 = $g4961$.getGlobalValue();
        SubLObject var8 = (SubLObject)NIL;
        var8 = var7.first();
        while (NIL != var7) {
            if (var8.first().equal(var6)) {
                var5 = f38987(var3, conses_high.second(var8));
                return f38988(var3, var4, var5, var6);
            }
            var7 = var7.rest();
            var8 = var7.first();
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f38988(final SubLObject var9, final SubLObject var10, SubLObject var5, final SubLObject var6) {
        final SubLObject var11 = Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic4$), Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic5$), var9));
        final SubLObject var12 = f38989(var6);
        final SubLObject var13 = Numbers.add(f38990(var11, var12, var6), f38991(var10, var12));
        if (var13.numG((SubLObject)ZERO_INTEGER)) {
            var5 = Numbers.multiply(var5, (SubLObject)FIFTEEN_INTEGER);
        }
        if (var13.numE((SubLObject)$ic6$)) {
            var5 = Numbers.divide(var5, (SubLObject)$ic7$);
        }
        if (var13.numL((SubLObject)ZERO_INTEGER)) {
            var5 = Numbers.divide(var5, (SubLObject)TEN_INTEGER);
        }
        if (NIL != var12 && var13.numE((SubLObject)ZERO_INTEGER)) {
            var5 = Numbers.divide(var5, (SubLObject)TEN_INTEGER);
        }
        return Numbers.numG(var5, $g4963$.getGlobalValue());
    }
    
    public static SubLObject f38985(final SubLObject var1) {
        if (var1.first().equal($ic8$)) {
            return f38985(ConsesLow.nth((SubLObject)TWO_INTEGER, var1));
        }
        if (var1.first().eql($ic9$) || var1.first().eql($ic10$)) {
            SubLObject var2 = (SubLObject)NIL;
            SubLObject var3 = var1.rest();
            SubLObject var4 = (SubLObject)NIL;
            var4 = var3.first();
            while (NIL != var3) {
                var2 = ConsesLow.append(var2, f38992(var4));
                var3 = var3.rest();
                var4 = var3.first();
            }
            return f38993(var2);
        }
        return f38992(var1);
    }
    
    public static SubLObject f38986(final SubLObject var1) {
        if (var1.first().equal($ic8$)) {
            return f38986(ConsesLow.nth((SubLObject)TWO_INTEGER, var1));
        }
        if (var1.first().eql($ic9$) || var1.first().eql($ic10$)) {
            return Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic5$), var1.rest());
        }
        return (SubLObject)ConsesLow.list(var1.first());
    }
    
    public static SubLObject f38992(final SubLObject var1) {
        final SubLObject var2 = Sequences.remove_if(Symbols.symbol_function((SubLObject)$ic11$), var1.rest(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = var2;
        SubLObject var5 = (SubLObject)NIL;
        var5 = var4.first();
        while (NIL != var4) {
            if (NIL != module0259.f16891(var5, $ic12$)) {
                SubLObject var6 = (SubLObject)NIL;
                var6 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module0213.f13918(var5), (SubLObject)ONE_INTEGER), var6);
                SubLObject var7_19 = f38994(var5);
                SubLObject var7 = (SubLObject)NIL;
                var7 = var7_19.first();
                while (NIL != var7_19) {
                    final SubLObject var8 = conses_high.cdar(var7);
                    if (NIL == conses_high.member(var8, $g4962$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        var6 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module0213.f13918(conses_high.cdar(var7)), (SubLObject)ONE_INTEGER), var6);
                    }
                    var7_19 = var7_19.rest();
                    var7 = var7_19.first();
                }
                var3 = ConsesLow.append(var3, var6);
            }
            if (NIL != module0259.f16891(var5, $ic13$) && NIL == module0259.f16891(var5, $ic14$)) {
                SubLObject var6 = (SubLObject)NIL;
                var6 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module0213.f13918(var5), (SubLObject)ONE_INTEGER), var6);
                SubLObject var7_20 = f38995(var5);
                SubLObject var7 = (SubLObject)NIL;
                var7 = var7_20.first();
                while (NIL != var7_20) {
                    final SubLObject var8 = conses_high.cdar(var7);
                    if (NIL == conses_high.member(var8, $g4962$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        var6 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module0213.f13918(conses_high.cdar(var7)), (SubLObject)ONE_INTEGER), var6);
                    }
                    var7_20 = var7_20.rest();
                    var7 = var7_20.first();
                }
                var3 = ConsesLow.append(var3, var6);
            }
            var4 = var4.rest();
            var5 = var4.first();
        }
        return f38993(var3);
    }
    
    public static SubLObject f38994(final SubLObject var22) {
        return f38996((SubLObject)ConsesLow.list($ic15$, (SubLObject)ConsesLow.listS($ic16$, var22, (SubLObject)$ic17$)), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f38995(final SubLObject var23) {
        return f38996((SubLObject)ConsesLow.list($ic15$, (SubLObject)ConsesLow.listS($ic18$, var23, (SubLObject)$ic17$)), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f38996(final SubLObject var1, SubLObject var24) {
        if (var24 == UNPROVIDED) {
            var24 = (SubLObject)FIVE_INTEGER;
        }
        return module0409.f28506(var1, $ic19$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic20$, $ic21$, $ic22$, T, $ic23$, NIL, $ic24$, $ic25$, $ic26$, T, $ic27$, NIL, $ic28$, T, $ic29$, var24, $ic30$, ZERO_INTEGER, $ic31$, $ic32$, $ic33$, $ic34$, $ic35$, T, $ic36$, $ic37$ }));
    }
    
    public static SubLObject f38987(final SubLObject var25, final SubLObject var26) {
        SubLObject var27 = (SubLObject)ZERO_INTEGER;
        SubLObject var28 = var25;
        SubLObject var29 = (SubLObject)NIL;
        var29 = var28.first();
        while (NIL != var28) {
            SubLObject var7_28 = var26;
            SubLObject var30 = (SubLObject)NIL;
            var30 = var7_28.first();
            while (NIL != var7_28) {
                if (var29.first().equal(var30.first()) && NIL == conses_high.member(var29.first(), $g4962$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
                    var27 = Numbers.add(var27, Numbers.multiply(conses_high.second(var29), conses_high.second(var30)));
                }
                var7_28 = var7_28.rest();
                var30 = var7_28.first();
            }
            var28 = var28.rest();
            var29 = var28.first();
        }
        return var27;
    }
    
    public static SubLObject f38997(final SubLObject var30) {
        SubLObject var31 = (SubLObject)NIL;
        SubLObject var32 = (SubLObject)NIL;
        try {
            SubLObject var33;
            SubLObject var34;
            for (var32 = (var33 = StreamsLow.open(var30, new SubLObject[] { $ic38$, $ic39$ })), var34 = (SubLObject)NIL, var34 = reader.read(var33, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED); NIL != var34; var34 = reader.read(var33, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var31 = (SubLObject)ConsesLow.cons(var34, var31);
            }
        }
        finally {
            final SubLObject var35 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                if (NIL != var32) {
                    streams_high.close(var32, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var35);
            }
        }
        return var31;
    }
    
    public static SubLObject f38998(final SubLObject var1) {
        final SubLObject var2 = f38985(var1);
        final SubLObject var3 = f38986(var1);
        SubLObject var4 = (SubLObject)NIL;
        final SubLObject var5 = f38999(var2, var3);
        SubLObject var6 = $g4961$.getGlobalValue();
        SubLObject var7 = (SubLObject)NIL;
        var7 = var6.first();
        while (NIL != var6) {
            if (NIL == f39000(var7.first()) || NIL != var5) {
                var4 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var7.first(), f38987(var2, conses_high.second(var7))), var4);
            }
            var6 = var6.rest();
            var7 = var6.first();
        }
        return f39001(f39002(var4, var2, var3));
    }
    
    public static SubLObject f38999(final SubLObject var3, final SubLObject var10) {
        final SubLObject var11 = Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic4$), Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic5$), var3));
        return (SubLObject)makeBoolean(f38990(var11, (SubLObject)$ic40$, (SubLObject)UNPROVIDED).numG((SubLObject)ZERO_INTEGER) || f38991(var10, (SubLObject)$ic40$).numG((SubLObject)ZERO_INTEGER));
    }
    
    public static SubLObject f39002(final SubLObject var18, final SubLObject var9, final SubLObject var10) {
        final SubLObject var19 = Sort.sort(var18, Symbols.symbol_function((SubLObject)$ic41$), Symbols.symbol_function((SubLObject)$ic42$));
        SubLObject var20 = (SubLObject)NIL;
        final SubLObject var21 = Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic4$), Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic5$), var9));
        SubLObject var22;
        SubLObject var23;
        SubLObject var24;
        SubLObject var25;
        for (var22 = (SubLObject)NIL, var22 = (SubLObject)ZERO_INTEGER; var22.numL((SubLObject)TWENTY_INTEGER); var22 = Numbers.add(var22, (SubLObject)ONE_INTEGER)) {
            var23 = ConsesLow.nth(var22, var19);
            var24 = f38989(var23.first());
            var25 = Numbers.add(f38990(var21, var24, var23.first()), f38991(var10, var24));
            if (NIL != var24 && var25.numG((SubLObject)ZERO_INTEGER)) {
                var20 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var23.first(), Numbers.multiply(conses_high.second(var23), (SubLObject)FIFTEEN_INTEGER)), var20);
            }
            if (NIL != var24 && var25.numE((SubLObject)$ic43$)) {
                var20 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var23.first(), Numbers.divide(conses_high.second(var23), (SubLObject)$ic44$)), var20);
            }
            if (NIL != var24 && var25.numL((SubLObject)ZERO_INTEGER)) {
                var20 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var23.first(), Numbers.divide(conses_high.second(var23), (SubLObject)TEN_INTEGER)), var20);
            }
            if (NIL != var24 && var25.numE((SubLObject)ZERO_INTEGER)) {
                var20 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var23.first(), Numbers.divide(conses_high.second(var23), (SubLObject)TEN_INTEGER)), var20);
            }
            if (NIL == var24) {
                var20 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var23.first(), conses_high.second(var23)), var20);
            }
        }
        SubLObject var26;
        SubLObject var27;
        SubLObject var28;
        for (var26 = Numbers.subtract(Sequences.length(var19), (SubLObject)TEN_INTEGER), var27 = (SubLObject)NIL, var27 = (SubLObject)ZERO_INTEGER; var27.numL(var26); var27 = Numbers.add(var27, (SubLObject)ONE_INTEGER)) {
            var28 = ConsesLow.nth(Numbers.add(var27, (SubLObject)TEN_INTEGER), var19);
            var20 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var28.first(), conses_high.second(var28)), var20);
        }
        return var20;
    }
    
    public static SubLObject f38989(final SubLObject var6) {
        if (NIL != f39000(var6)) {
            return (SubLObject)ConsesLow.list($ic45$);
        }
        final SubLObject var7 = module0213.f13917(var6);
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic46$), f38996((SubLObject)ConsesLow.listS($ic47$, var7, (SubLObject)$ic48$), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f39000(final SubLObject var6) {
        final SubLObject var7 = module0213.f13917(var6);
        return Equality.eql($ic49$, module0220.f14556(var7, $ic50$, (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f39003(final SubLObject var40) {
        final SubLObject var41 = module0220.f14561(var40, $ic51$, (SubLObject)THREE_INTEGER, (SubLObject)UNPROVIDED);
        SubLObject var42 = (SubLObject)NIL;
        if (NIL != var41) {
            SubLObject var43 = var41;
            SubLObject var44 = (SubLObject)NIL;
            var44 = var43.first();
            while (NIL != var43) {
                final SubLObject var45 = module0178.f11285(var44);
                var42 = (SubLObject)ConsesLow.cons(conses_high.third(var45), var42);
                var43 = var43.rest();
                var44 = var43.first();
            }
        }
        return var42;
    }
    
    public static SubLObject f39004(final SubLObject var40) {
        final SubLObject var41 = module0220.f14561(var40, $ic52$, (SubLObject)THREE_INTEGER, (SubLObject)UNPROVIDED);
        SubLObject var42 = (SubLObject)NIL;
        if (NIL != var41) {
            SubLObject var43 = var41;
            SubLObject var44 = (SubLObject)NIL;
            var44 = var43.first();
            while (NIL != var43) {
                final SubLObject var45 = module0178.f11285(var44);
                var42 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(conses_high.second(var45), conses_high.third(var45)), var42);
                var43 = var43.rest();
                var44 = var43.first();
            }
        }
        return var42;
    }
    
    public static SubLObject f39005(final SubLObject var40) {
        final SubLObject var41 = module0220.f14561(var40, $ic53$, (SubLObject)THREE_INTEGER, (SubLObject)UNPROVIDED);
        SubLObject var42 = (SubLObject)NIL;
        if (NIL != var41) {
            SubLObject var43 = var41;
            SubLObject var44 = (SubLObject)NIL;
            var44 = var43.first();
            while (NIL != var43) {
                final SubLObject var45 = module0178.f11285(var44);
                var42 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(conses_high.second(var45), conses_high.third(var45)), var42);
                var43 = var43.rest();
                var44 = var43.first();
            }
        }
        return var42;
    }
    
    public static SubLObject f38990(final SubLObject var18, final SubLObject var44, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        if (NIL != var6) {
            final SubLObject var45 = module0213.f13917(var6);
            final SubLObject var46 = f39006(var45);
            if (NIL != var46) {
                if (NIL != conses_high.intersection(var46, var18, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
                    return (SubLObject)ONE_INTEGER;
                }
                return (SubLObject)$ic6$;
            }
        }
        if (NIL == var44) {
            return (SubLObject)ZERO_INTEGER;
        }
        SubLObject var47 = (SubLObject)NIL;
        SubLObject var48 = var44;
        SubLObject var49 = (SubLObject)NIL;
        var49 = var48.first();
        while (NIL != var48) {
            var47 = ConsesLow.append(var47, f39003(var49));
            var48 = var48.rest();
            var49 = var48.first();
        }
        var48 = var47;
        SubLObject var50 = (SubLObject)NIL;
        var50 = var48.first();
        while (NIL != var48) {
            SubLObject var7_48 = var18;
            SubLObject var51 = (SubLObject)NIL;
            var51 = var7_48.first();
            while (NIL != var7_48) {
                if (NIL != module0256.f16576(var51, var50, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    return (SubLObject)ONE_INTEGER;
                }
                if (NIL != module0257.f16689(var51, var50, $ic19$, (SubLObject)UNPROVIDED)) {
                    return (SubLObject)MINUS_ONE_INTEGER;
                }
                var7_48 = var7_48.rest();
                var51 = var7_48.first();
            }
            var48 = var48.rest();
            var50 = var48.first();
        }
        var48 = var18;
        SubLObject var52 = (SubLObject)NIL;
        var52 = var48.first();
        while (NIL != var48) {
            SubLObject var7_49 = var44;
            SubLObject var53 = (SubLObject)NIL;
            var53 = var7_49.first();
            while (NIL != var7_49) {
                SubLObject var7_50;
                final SubLObject var54 = var7_50 = f39005(var53);
                SubLObject var55 = (SubLObject)NIL;
                var55 = var7_50.first();
                while (NIL != var7_50) {
                    final SubLObject var56 = var55.first();
                    final SubLObject var57 = conses_high.second(var55);
                    if (NIL != module0256.f16576(var52, var57, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL != module0256.f16576(var56, var52, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        return (SubLObject)ONE_INTEGER;
                    }
                    var7_50 = var7_50.rest();
                    var55 = var7_50.first();
                }
                var7_49 = var7_49.rest();
                var53 = var7_49.first();
            }
            var48 = var48.rest();
            var52 = var48.first();
        }
        return (SubLObject)ZERO_INTEGER;
    }
    
    public static SubLObject f39006(final SubLObject var2) {
        final SubLObject var3 = module0220.f14561(var2, $ic54$, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
        if (NIL != var3) {
            return Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic55$), Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic56$), var3));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38991(final SubLObject var18, final SubLObject var44) {
        if (NIL == var44) {
            return (SubLObject)ZERO_INTEGER;
        }
        SubLObject var45 = var18;
        SubLObject var46 = (SubLObject)NIL;
        var46 = var45.first();
        while (NIL != var45) {
            SubLObject var7_56 = var44;
            SubLObject var47 = (SubLObject)NIL;
            var47 = var7_56.first();
            while (NIL != var7_56) {
                SubLObject var7_57;
                final SubLObject var48 = var7_57 = f39004(var47);
                SubLObject var49 = (SubLObject)NIL;
                var49 = var7_57.first();
                while (NIL != var7_57) {
                    final SubLObject var50 = var49.first();
                    final SubLObject var51 = conses_high.second(var49);
                    if (NIL != module0260.f17090(var46, var51) && NIL != module0260.f17090(var50, var46)) {
                        return (SubLObject)ONE_INTEGER;
                    }
                    var7_57 = var7_57.rest();
                    var49 = var7_57.first();
                }
                var7_56 = var7_56.rest();
                var47 = var7_56.first();
            }
            var45 = var45.rest();
            var46 = var45.first();
        }
        return (SubLObject)ZERO_INTEGER;
    }
    
    public static SubLObject f39007() {
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = $g4964$.getGlobalValue();
        SubLObject var16 = (SubLObject)NIL;
        var16 = var15.first();
        while (NIL != var15) {
            SubLObject var7_61 = f38997(var16);
            SubLObject var17 = (SubLObject)NIL;
            var17 = var7_61.first();
            while (NIL != var7_61) {
                var14 = (SubLObject)ConsesLow.cons(var17, var14);
                var7_61 = var7_61.rest();
                var17 = var7_61.first();
            }
            var15 = var15.rest();
            var16 = var15.first();
        }
        return var14;
    }
    
    public static SubLObject f39001(final SubLObject var18) {
        final SubLObject var19 = Sort.sort(var18, Symbols.symbol_function((SubLObject)$ic41$), Symbols.symbol_function((SubLObject)$ic42$));
        SubLObject var20 = (SubLObject)NIL;
        final SubLObject var21 = conses_high.second(var19.first());
        SubLObject var22 = var19;
        SubLObject var23 = (SubLObject)NIL;
        var23 = var22.first();
        while (NIL != var22) {
            if (conses_high.second(var23).numG((SubLObject)ZERO_INTEGER) && conses_high.second(var23).numG(Numbers.divide(var21, (SubLObject)TEN_INTEGER))) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic57$, module0213.f13917(var23.first()), conses_high.second(var23));
                var20 = (SubLObject)ConsesLow.cons(module0213.f13917(var23.first()), var20);
            }
            var22 = var22.rest();
            var23 = var22.first();
        }
        if (Sequences.length(var20).numG((SubLObject)ONE_INTEGER)) {
            var20 = (SubLObject)ConsesLow.cons($ic58$, var20);
        }
        return var20;
    }
    
    public static SubLObject f38993(final SubLObject var18) {
        final SubLObject var19 = Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic5$), var18);
        SubLObject var20 = (SubLObject)NIL;
        final SubLObject var21 = Sequences.creduce(Symbols.symbol_function((SubLObject)$ic59$), Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic42$), var18), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var22 = Sequences.remove_duplicates(var19, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var23 = (SubLObject)NIL;
        var23 = var22.first();
        while (NIL != var22) {
            SubLObject var24 = (SubLObject)ZERO_INTEGER;
            SubLObject var7_67 = var18;
            SubLObject var25 = (SubLObject)NIL;
            var25 = var7_67.first();
            while (NIL != var7_67) {
                if (var25.first().equal(var23)) {
                    var24 = Numbers.add(var24, conses_high.second(var25));
                }
                var7_67 = var7_67.rest();
                var25 = var7_67.first();
            }
            var20 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var23, Numbers.divide(var24, var21)), var20);
            var22 = var22.rest();
            var23 = var22.first();
        }
        return var20;
    }
    
    public static SubLObject f38984() {
        if (NIL == $g4961$.getGlobalValue()) {
            $g4961$.setGlobalValue(f39007());
            $g4962$.setGlobalValue(f38997($g4965$.getGlobalValue()));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39008() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0641", "f38983", "S#42717", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0641", "f38988", "S#42718", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0641", "f38985", "S#42719", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0641", "f38986", "S#42720", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0641", "f38992", "S#42721", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0641", "f38994", "S#42722", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0641", "f38995", "S#42723", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0641", "f38996", "S#42724", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0641", "f38987", "S#42725", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0641", "f38997", "S#42726", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0641", "f38998", "S#42727", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0641", "f38999", "S#42728", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0641", "f39002", "S#42729", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0641", "f38989", "S#42730", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0641", "f39000", "S#42731", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0641", "f39003", "S#42732", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0641", "f39004", "S#42733", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0641", "f39005", "S#42734", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0641", "f38990", "S#42735", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0641", "f39006", "S#42736", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0641", "f38991", "S#42737", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0641", "f39007", "S#42738", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0641", "f39001", "S#42739", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0641", "f38993", "S#42740", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0641", "f38984", "S#42741", 0, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39009() {
        $g4961$ = SubLFiles.deflexical("S#42742", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic0$)) ? $g4961$.getGlobalValue() : NIL));
        $g4962$ = SubLFiles.deflexical("S#42743", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic1$)) ? $g4962$.getGlobalValue() : NIL));
        $g4963$ = SubLFiles.deflexical("S#42744", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic2$)) ? $g4963$.getGlobalValue() : $ic3$));
        $g4964$ = SubLFiles.deflexical("S#42745", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic60$)) ? $g4964$.getGlobalValue() : $ic61$));
        $g4965$ = SubLFiles.deflexical("S#42746", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic62$)) ? $g4965$.getGlobalValue() : $ic63$));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39010() {
        module0003.f57((SubLObject)$ic0$);
        module0003.f57((SubLObject)$ic1$);
        module0003.f57((SubLObject)$ic2$);
        module0003.f57((SubLObject)$ic60$);
        module0003.f57((SubLObject)$ic62$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f39008();
    }
    
    public void initializeVariables() {
        f39009();
    }
    
    public void runTopLevelForms() {
        f39010();
    }
    
    static {
        me = (SubLFile)new module0641();
        $g4961$ = null;
        $g4962$ = null;
        $g4963$ = null;
        $g4964$ = null;
        $g4965$ = null;
        $ic0$ = makeSymbol("S#42742", "CYC");
        $ic1$ = makeSymbol("S#42743", "CYC");
        $ic2$ = makeSymbol("S#42744", "CYC");
        $ic3$ = (SubLFloat)makeDouble(1.0E-5);
        $ic4$ = makeSymbol("FIND-OBJECT-BY-COMPACT-HL-EXTERNAL-ID-STRING");
        $ic5$ = makeSymbol("CAR");
        $ic6$ = makeInteger(-3);
        $ic7$ = makeInteger(1000);
        $ic8$ = constant_handles_oc.f8479((SubLObject)makeString("thereExists"));
        $ic9$ = constant_handles_oc.f8479((SubLObject)makeString("and"));
        $ic10$ = constant_handles_oc.f8479((SubLObject)makeString("or"));
        $ic11$ = makeSymbol("EL-VARIABLE-P");
        $ic12$ = constant_handles_oc.f8479((SubLObject)makeString("Collection"));
        $ic13$ = constant_handles_oc.f8479((SubLObject)makeString("Individual"));
        $ic14$ = constant_handles_oc.f8479((SubLObject)makeString("Predicate"));
        $ic15$ = constant_handles_oc.f8479((SubLObject)makeString("assertedSentence"));
        $ic16$ = constant_handles_oc.f8479((SubLObject)makeString("genls"));
        $ic17$ = ConsesLow.list((SubLObject)makeSymbol("?X"));
        $ic18$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic19$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic20$ = makeKeyword("INFERENCE-MODE");
        $ic21$ = makeKeyword("MINIMAL");
        $ic22$ = makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?");
        $ic23$ = makeKeyword("ALLOW-INDETERMINATE-RESULTS?");
        $ic24$ = makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY");
        $ic25$ = makeKeyword("COMPUTE-INTERSECTION");
        $ic26$ = makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?");
        $ic27$ = makeKeyword("NEW-TERMS-ALLOWED?");
        $ic28$ = makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?");
        $ic29$ = makeKeyword("MAX-TIME");
        $ic30$ = makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $ic31$ = makeKeyword("PROBABLY-APPROXIMATELY-DONE");
        $ic32$ = (SubLFloat)makeDouble(1.0);
        $ic33$ = makeKeyword("ANSWER-LANGUAGE");
        $ic34$ = makeKeyword("HL");
        $ic35$ = makeKeyword("CONTINUABLE?");
        $ic36$ = makeKeyword("PRODUCTIVITY-LIMIT");
        $ic37$ = makeInteger(20000000);
        $ic38$ = makeKeyword("DIRECTION");
        $ic39$ = makeKeyword("INPUT");
        $ic40$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Terrorism-Topic")));
        $ic41$ = makeSymbol(">");
        $ic42$ = makeSymbol("SECOND");
        $ic43$ = makeInteger(-2);
        $ic44$ = makeInteger(100);
        $ic45$ = constant_handles_oc.f8479((SubLObject)makeString("Terrorism-Topic"));
        $ic46$ = makeSymbol("CDAR");
        $ic47$ = constant_handles_oc.f8479((SubLObject)makeString("mtTopic"));
        $ic48$ = ConsesLow.list((SubLObject)makeSymbol("?M"));
        $ic49$ = constant_handles_oc.f8479((SubLObject)makeString("TKBSourceSpindle"));
        $ic50$ = constant_handles_oc.f8479((SubLObject)makeString("mtSpindleMember"));
        $ic51$ = constant_handles_oc.f8479((SubLObject)makeString("salientSpecForCollectionInTopic"));
        $ic52$ = constant_handles_oc.f8479((SubLObject)makeString("salientPredicateSpaceForTopic"));
        $ic53$ = constant_handles_oc.f8479((SubLObject)makeString("salientCollectionSpaceForTopic"));
        $ic54$ = constant_handles_oc.f8479((SubLObject)makeString("salientIndividualForMt"));
        $ic55$ = makeSymbol("THIRD");
        $ic56$ = makeSymbol("GAF-FORMULA");
        $ic57$ = makeString("~% ~a ~a ");
        $ic58$ = constant_handles_oc.f8479((SubLObject)makeString("MtUnionFn"));
        $ic59$ = makeSymbol("+");
        $ic60$ = makeSymbol("S#42745", "CYC");
        $ic61$ = ConsesLow.list((SubLObject)makeString("/cyc/top/data/mt-vectors/mt-vectors-1.txt"), (SubLObject)makeString("/cyc/top/data/mt-vectors/mt-vectors-2.txt"), (SubLObject)makeString("/cyc/top/data/mt-vectors/mt-vectors-3.txt"), (SubLObject)makeString("/cyc/top/data/mt-vectors/mt-vectors-4.txt"));
        $ic62$ = makeSymbol("S#42746", "CYC");
        $ic63$ = makeString("/cyc/top/data/mt-vectors/too-general-cols.txt");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 170 ms
	
	Decompiled with Procyon 0.5.32.
*/