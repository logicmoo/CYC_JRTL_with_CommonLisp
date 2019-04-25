package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0296 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0296";
    public static final String myFingerPrint = "b869a0e2c6bb619eb3647e73e6550298ec03ba46a3d186e7b5bdc523b0948d8a";
    private static SubLSymbol $g2692$;
    private static final SubLObject $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLInteger $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLObject $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLObject $ic10$;
    private static final SubLObject $ic11$;
    private static final SubLObject $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLObject $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLList $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLList $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLList $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLInteger $ic30$;
    private static final SubLSymbol $ic31$;
    
    public static SubLObject f19920(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        return Numbers.$most_positive_fixnum$.getGlobalValue();
    }
    
    public static SubLObject f19921(final SubLObject var1, final SubLObject var4, final SubLObject var2, final SubLObject var3) {
        final SubLObject var5 = f19922(var3, var2);
        return f19923(var1, var2, var3, var5);
    }
    
    public static SubLObject f19924(final SubLObject var1, SubLObject var2, SubLObject var6, SubLObject var7) {
        if (var2 == module0296.UNPROVIDED) {
            var2 = (SubLObject)module0296.NIL;
        }
        if (var6 == module0296.UNPROVIDED) {
            var6 = (SubLObject)module0296.NIL;
        }
        if (var7 == module0296.UNPROVIDED) {
            var7 = (SubLObject)module0296.NIL;
        }
        final SubLThread var8 = SubLProcess.currentSubLThread();
        if (module0296.NIL == module0291.f19546()) {
            return (SubLObject)module0296.NIL;
        }
        SubLObject var9 = (SubLObject)module0296.ZERO_INTEGER;
        final SubLObject var10 = var2;
        final SubLObject var11 = module0147.$g2094$.currentBinding(var8);
        final SubLObject var12 = module0147.$g2095$.currentBinding(var8);
        try {
            module0147.$g2094$.bind(module0147.f9531(var10), var8);
            module0147.$g2095$.bind(module0147.f9534(var10), var8);
            if (module0296.NIL == var6) {
                var6 = module0291.f19595(var2);
            }
            if (module0296.NIL != var6) {
                final SubLObject var13 = module0295.f19882(var1);
                SubLObject var15;
                final SubLObject var14 = var15 = f19925(var1, var13, var2, (SubLObject)module0296.NIL, var6, (SubLObject)module0296.$ic2$, var7);
                SubLObject var16 = (SubLObject)module0296.NIL;
                var16 = var15.first();
                while (module0296.NIL != var15) {
                    if (module0296.NIL != f19926(var16, var2)) {
                        final SubLObject var17 = f19927(var16, var2, var6);
                        if (module0296.NIL != f19928(var1, var13, var16, var17)) {
                            var9 = Numbers.add(var9, (SubLObject)module0296.ONE_INTEGER);
                        }
                    }
                    var15 = var15.rest();
                    var16 = var15.first();
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var12, var8);
            module0147.$g2094$.rebind(var11, var8);
        }
        return var9;
    }
    
    public static SubLObject f19929(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        final SubLObject var7 = module0295.f19882(var1);
        final SubLObject var8 = module0291.f19635(var3);
        final SubLObject var9 = module0291.f19633(var3);
        final SubLObject var10 = module0291.f19631(var3);
        final SubLObject var11 = module0291.f19640(var3);
        final SubLObject var12 = module0291.f19632(var3);
        final SubLObject var13 = module0291.f19623(var3, var2);
        final SubLObject var14 = module0291.f19638(var3);
        SubLObject var15 = (SubLObject)module0296.NIL;
        SubLObject var16 = (SubLObject)module0296.NIL;
        SubLObject var17 = (SubLObject)module0296.NIL;
        SubLObject var18 = (SubLObject)module0296.NIL;
        SubLObject var19 = (SubLObject)module0296.NIL;
        if (var12 == module0296.$ic4$) {
            var15 = f19925(var1, var7, var2, var8, var13, var10, var14);
            var16 = f19930(ConsesLow.append(var9, var15), var1, var7, var2, var13);
            var17 = ((module0296.NIL != module0173.f10955(var1)) ? var16 : ConsesLow.append(var16, var5));
        }
        else {
            var17 = f19930(var9, var1, var7, var2, var13);
        }
        final SubLObject var20 = var11;
        if (var20.eql((SubLObject)module0296.$ic5$)) {
            var6.resetMultipleValues();
            final SubLObject var28_29 = f19931(var17, var1, var7, var2, var3, var13, var10);
            final SubLObject var30_31 = var6.secondMultipleValue();
            var6.resetMultipleValues();
            var18 = var28_29;
            var19 = var30_31;
        }
        if (module0296.NIL != var18) {
            return Values.values(var18, var19);
        }
        return Values.values(var1, (SubLObject)module0296.NIL);
    }
    
    public static SubLObject f19923(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        final SubLObject var7 = module0034.$g879$.getDynamicValue(var6);
        SubLObject var8 = (SubLObject)module0296.NIL;
        if (module0296.NIL == var7) {
            return f19929(var1, var2, var3, var5);
        }
        var8 = module0034.f1857(var7, (SubLObject)module0296.$ic3$, (SubLObject)module0296.UNPROVIDED);
        if (module0296.NIL == var8) {
            var8 = module0034.f1807(module0034.f1842(var7), (SubLObject)module0296.$ic3$, (SubLObject)module0296.FOUR_INTEGER, (SubLObject)module0296.$ic6$, (SubLObject)module0296.EQUAL, (SubLObject)module0296.UNPROVIDED);
            module0034.f1860(var7, (SubLObject)module0296.$ic3$, var8);
        }
        final SubLObject var9 = module0034.f1780(var1, var2, var3, var5);
        final SubLObject var10 = module0034.f1814(var8, var9, (SubLObject)module0296.UNPROVIDED);
        if (var10 != module0296.$ic7$) {
            SubLObject var11 = var10;
            SubLObject var12 = (SubLObject)module0296.NIL;
            var12 = var11.first();
            while (module0296.NIL != var11) {
                SubLObject var13 = var12.first();
                final SubLObject var14 = conses_high.second(var12);
                if (var1.equal(var13.first())) {
                    var13 = var13.rest();
                    if (var2.equal(var13.first())) {
                        var13 = var13.rest();
                        if (var3.equal(var13.first())) {
                            var13 = var13.rest();
                            if (module0296.NIL != var13 && module0296.NIL == var13.rest() && var5.equal(var13.first())) {
                                return module0034.f1959(var14);
                            }
                        }
                    }
                }
                var11 = var11.rest();
                var12 = var11.first();
            }
        }
        final SubLObject var15 = Values.arg2(var6.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f19929(var1, var2, var3, var5)));
        module0034.f1836(var8, var9, var10, var15, (SubLObject)ConsesLow.list(var1, var2, var3, var5));
        return module0034.f1959(var15);
    }
    
    public static SubLObject f19931(final SubLObject var40, final SubLObject var1, final SubLObject var13, final SubLObject var2, final SubLObject var3, final SubLObject var6, final SubLObject var20) {
        SubLObject var41 = (SubLObject)module0296.NIL;
        SubLObject var42 = (SubLObject)module0296.NIL;
        if (module0296.NIL == var41) {
            SubLObject var43 = var40;
            SubLObject var44 = (SubLObject)module0296.NIL;
            var44 = var43.first();
            while (module0296.NIL == var41 && module0296.NIL != var43) {
                var41 = f19932(var1, var13, var44, var2, var3, var6, var20);
                if (module0296.NIL != var41) {
                    var42 = (SubLObject)ConsesLow.cons(f19933(var44), var42);
                }
                var43 = var43.rest();
                var44 = var43.first();
            }
        }
        return Values.values(var41, var42);
    }
    
    public static SubLObject f19934(final SubLObject var16, final SubLObject var42, final SubLObject var2) {
        final SubLThread var43 = SubLProcess.currentSubLThread();
        final SubLObject var44 = module0295.f19829(var16, var42);
        final SubLObject var45 = module0295.f19816(var44);
        SubLObject var46 = (SubLObject)module0296.NIL;
        if (module0296.NIL != f19935(var16) && module0296.NIL == var46) {
            SubLObject var47 = var45;
            SubLObject var48 = (SubLObject)module0296.NIL;
            var48 = var47.first();
            while (module0296.NIL == var46 && module0296.NIL != var47) {
                if (module0296.NIL != module0222.f14635(module0296.$ic8$, var48, (SubLObject)module0296.ONE_INTEGER, (SubLObject)module0296.UNPROVIDED)) {
                    final SubLObject var49 = module0147.$g2094$.currentBinding(var43);
                    final SubLObject var50 = module0147.$g2095$.currentBinding(var43);
                    try {
                        module0147.$g2094$.bind((SubLObject)module0296.$ic9$, var43);
                        module0147.$g2095$.bind(var2, var43);
                        if (module0296.NIL != module0035.sublisp_boolean(module0220.f14553(var48, module0296.$ic8$, (SubLObject)module0296.ONE_INTEGER, (SubLObject)module0296.ONE_INTEGER, (SubLObject)module0296.UNPROVIDED))) {
                            var46 = (SubLObject)module0296.T;
                        }
                    }
                    finally {
                        module0147.$g2095$.rebind(var50, var43);
                        module0147.$g2094$.rebind(var49, var43);
                    }
                }
                var47 = var47.rest();
                var48 = var47.first();
            }
        }
        return var46;
    }
    
    public static SubLObject f19936(final SubLObject var16, final SubLObject var42, final SubLObject var2) {
        final SubLObject var43 = module0295.f19829(var16, var42);
        final SubLObject var44 = module0295.f19816(var43);
        SubLObject var45 = (SubLObject)module0296.NIL;
        SubLObject var46 = (SubLObject)module0296.NIL;
        if (module0296.NIL != f19935(var16)) {
            final SubLObject var47 = module0295.f19813(var43);
            if (module0296.$ic10$.eql(var42) && module0296.NIL != module0204.f13060(var47)) {
                var45 = module0204.f13063(var47);
            }
            else {
                var45 = module0205.f13203(module0293.f19754(var16), (SubLObject)module0296.UNPROVIDED);
            }
            if (module0296.NIL != module0004.f104(var45, var44, (SubLObject)module0296.UNPROVIDED, (SubLObject)module0296.UNPROVIDED) && module0296.NIL != module0269.f17769(var45, var2)) {
                var46 = (SubLObject)module0296.T;
            }
        }
        return var46;
    }
    
    public static SubLObject f19935(final SubLObject var16) {
        final SubLObject var17 = module0295.f19825(var16);
        return (SubLObject)SubLObjectFactory.makeBoolean(var17.eql(module0296.$ic11$) || var17.eql(module0296.$ic12$));
    }
    
    public static SubLObject f19932(final SubLObject var1, final SubLObject var13, final SubLObject var16, final SubLObject var2, final SubLObject var3, final SubLObject var6, final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        final SubLObject var22 = f19927(var16, var2, var6);
        if (module0296.NIL == var22) {
            return (SubLObject)module0296.NIL;
        }
        if (module0296.NIL == f19928(var1, var13, var16, var22)) {
            return (SubLObject)module0296.NIL;
        }
        if (module0296.NIL != f19934(var16, var22, var2)) {
            return (SubLObject)module0296.NIL;
        }
        if (module0296.NIL != f19936(var16, var22, var2)) {
            return (SubLObject)module0296.NIL;
        }
        var21.resetMultipleValues();
        final SubLObject var23 = f19937(var1, var16, var2, var22, var20);
        final SubLObject var24 = var21.secondMultipleValue();
        final SubLObject var25 = var21.thirdMultipleValue();
        var21.resetMultipleValues();
        if (module0296.NIL != var23 && module0296.NIL != f19938(var1, var16, var2, var23, var24, var25, var3, var22)) {
            return var23;
        }
        return (SubLObject)module0296.NIL;
    }
    
    public static SubLObject f19937(SubLObject var1, final SubLObject var16, final SubLObject var2, final SubLObject var17, final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        final SubLObject var22 = module0295.f19813(module0295.f19828(var16, var17));
        final SubLObject var23 = module0295.f19832(var16, var17);
        final SubLObject var24 = module0232.f15323(var22);
        SubLObject var25 = (SubLObject)module0296.NIL;
        SubLObject var26 = (SubLObject)module0296.NIL;
        final SubLObject var27 = module0295.$g2691$.currentBinding(var21);
        try {
            module0295.$g2691$.bind((SubLObject)module0296.NIL, var21);
            var1 = module0295.f19889(var1);
            var25 = f19939(var1, var22, module0232.f15323(var1), var24);
            if (module0296.NIL != var25) {
                final SubLObject var28 = module0295.f19829(var16, var17);
                SubLObject var29 = module0295.f19817(var28);
                var29 = conses_high.nsublis(var23, var29, (SubLObject)module0296.UNPROVIDED, (SubLObject)module0296.UNPROVIDED);
                var29 = conses_high.nsublis(var25, var29, (SubLObject)module0296.UNPROVIDED, (SubLObject)module0296.UNPROVIDED);
                var29 = module0295.f19890(var29);
                var29 = (var26 = module0295.f19891(var29));
            }
        }
        finally {
            module0295.$g2691$.rebind(var27, var21);
        }
        return Values.values(var26, var23, var25);
    }
    
    public static SubLObject f19939(final SubLObject var59, final SubLObject var60, final SubLObject var61, final SubLObject var62) {
        if (!var61.eql(var62)) {
            return (SubLObject)module0296.NIL;
        }
        SubLObject var63 = (SubLObject)module0296.NIL;
        var63 = ((module0296.NIL != var61) ? module0235.f15481(var59, var60, (SubLObject)module0296.NIL, (SubLObject)module0296.UNPROVIDED).first() : module0234.f15444(var59, var60, (SubLObject)module0296.NIL, (SubLObject)module0296.UNPROVIDED));
        if (module0296.NIL != f19940(var59, var60, var63)) {
            return var63;
        }
        return (SubLObject)module0296.NIL;
    }
    
    public static SubLObject f19940(final SubLObject var59, final SubLObject var60, final SubLObject var63) {
        SubLObject var64 = (SubLObject)module0296.NIL;
        SubLObject var65 = (SubLObject)module0296.NIL;
        SubLObject var66 = var63;
        SubLObject var67 = (SubLObject)module0296.NIL;
        var67 = var66.first();
        while (module0296.NIL != var66) {
            if (module0296.NIL != module0201.f12546(var67.first())) {
                var64 = (SubLObject)ConsesLow.cons(var67, var64);
            }
            else {
                var65 = (SubLObject)ConsesLow.cons(var67, var65);
            }
            var66 = var66.rest();
            var67 = var66.first();
        }
        final SubLObject var68 = conses_high.sublis(var65, var59, (SubLObject)module0296.UNPROVIDED, (SubLObject)module0296.UNPROVIDED);
        final SubLObject var69 = conses_high.sublis(var65, var60, (SubLObject)module0296.UNPROVIDED, (SubLObject)module0296.UNPROVIDED);
        SubLObject var70 = var64;
        SubLObject var71 = (SubLObject)module0296.NIL;
        var71 = var70.first();
        while (module0296.NIL != var70) {
            final SubLObject var72 = var71.first();
            final SubLObject var73 = var71.rest();
            if (module0296.NIL != f19941(var68, var69, var72, var73)) {
                return (SubLObject)module0296.NIL;
            }
            var70 = var70.rest();
            var71 = var70.first();
        }
        if (module0296.NIL != module0035.f2194(var64, Symbols.symbol_function((SubLObject)module0296.EQUAL), Symbols.symbol_function((SubLObject)module0296.$ic13$)) || module0296.NIL != module0035.f2194(var64, Symbols.symbol_function((SubLObject)module0296.EQUAL), Symbols.symbol_function((SubLObject)module0296.$ic14$))) {
            return (SubLObject)module0296.NIL;
        }
        return (SubLObject)module0296.T;
    }
    
    public static SubLObject f19941(final SubLObject var59, final SubLObject var60, final SubLObject var69, final SubLObject var70) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0296.NIL != module0205.f13220(var69, var60, (SubLObject)module0296.UNPROVIDED, (SubLObject)module0296.UNPROVIDED, (SubLObject)module0296.UNPROVIDED) || module0296.NIL != module0205.f13220(var70, var59, (SubLObject)module0296.UNPROVIDED, (SubLObject)module0296.UNPROVIDED, (SubLObject)module0296.UNPROVIDED));
    }
    
    public static SubLObject f19942(final SubLObject var71) {
        return module0206.f13500(var71.first());
    }
    
    public static SubLObject f19933(final SubLObject var16) {
        final SubLObject var17 = module0295.f19834(var16);
        return (module0296.NIL != var17) ? var17 : var16;
    }
    
    public static SubLObject f19927(final SubLObject var16, final SubLObject var2, final SubLObject var6) {
        SubLObject var17 = (SubLObject)module0296.NIL;
        if (module0296.NIL == var17) {
            SubLObject var18;
            SubLObject var19;
            for (var18 = var6, var19 = (SubLObject)module0296.NIL, var19 = var18.first(); module0296.NIL == var17 && module0296.NIL != var18; var17 = f19943(var16, var2, var19), var18 = var18.rest(), var19 = var18.first()) {}
        }
        return var17;
    }
    
    public static SubLObject f19943(final SubLObject var16, final SubLObject var2, final SubLObject var72) {
        SubLObject var73 = f19944(var16, var2, var72);
        if (module0296.NIL == var73) {
            var73 = f19945(var16, var2, var72);
        }
        return var73;
    }
    
    public static SubLObject f19944(final SubLObject var16, final SubLObject var2, final SubLObject var72) {
        final SubLObject var73 = module0295.f19896(var72, module0295.f19824(var16));
        return f19946(var73, var2);
    }
    
    public static SubLObject f19945(final SubLObject var16, final SubLObject var2, final SubLObject var72) {
        final SubLObject var73 = f19947(var16, var72);
        return f19946(var73, var2);
    }
    
    public static SubLObject f19946(final SubLObject var73, final SubLObject var2) {
        SubLObject var74 = (SubLObject)module0296.NIL;
        if (module0296.NIL == var74) {
            SubLObject var75 = var73;
            SubLObject var76 = (SubLObject)module0296.NIL;
            var76 = var75.first();
            while (module0296.NIL == var74 && module0296.NIL != var75) {
                if (module0296.NIL == f19948(var76) && module0296.NIL != f19949(var76, var2)) {
                    var74 = f19950(var76);
                }
                var75 = var75.rest();
                var76 = var75.first();
            }
        }
        return var74;
    }
    
    public static SubLObject f19947(final SubLObject var16, final SubLObject var72) {
        final SubLObject var73 = module0295.f19825(var16);
        final SubLObject var74 = module0291.f19657(var73, var72, module0291.f19551());
        return var74;
    }
    
    public static SubLObject f19948(final SubLObject var75) {
        return Equality.eq(f19950(var75), module0296.$ic15$);
    }
    
    public static SubLObject f19949(final SubLObject var75, final SubLObject var2) {
        final SubLThread var76 = SubLProcess.currentSubLThread();
        SubLObject var77 = (SubLObject)module0296.NIL;
        final SubLObject var78 = module0147.$g2094$.currentBinding(var76);
        final SubLObject var79 = module0147.$g2095$.currentBinding(var76);
        try {
            module0147.$g2094$.bind(module0147.f9531(var2), var76);
            module0147.$g2095$.bind(module0147.f9534(var2), var76);
            var77 = module0147.f9507(f19951(var75));
        }
        finally {
            module0147.$g2095$.rebind(var79, var76);
            module0147.$g2094$.rebind(var78, var76);
        }
        return var77;
    }
    
    public static SubLObject f19950(final SubLObject var75) {
        return var75.first();
    }
    
    public static SubLObject f19951(final SubLObject var75) {
        return conses_high.second(var75);
    }
    
    public static SubLObject f19925(final SubLObject var1, final SubLObject var13, final SubLObject var2, final SubLObject var18, final SubLObject var6, final SubLObject var20, final SubLObject var7) {
        SubLObject var21 = (SubLObject)module0296.NIL;
        SubLObject var22 = (SubLObject)module0296.NIL;
        if (module0296.NIL != constant_handles_oc.f8449(var1)) {
            var21 = Hashtables.gethash(var1, module0295.f19837(), (SubLObject)module0296.UNPROVIDED);
        }
        else if (module0296.NIL != module0167.f10813(var1)) {
            var21 = Hashtables.gethash(var1, module0295.f19838(), (SubLObject)module0296.UNPROVIDED);
        }
        else {
            SubLObject var23 = var13;
            SubLObject var24 = (SubLObject)module0296.NIL;
            var24 = var23.first();
            while (module0296.NIL != var23) {
                var21 = conses_high.union(var21, Hashtables.gethash(var24, module0295.f19836(), (SubLObject)module0296.UNPROVIDED), (SubLObject)module0296.UNPROVIDED, (SubLObject)module0296.UNPROVIDED);
                var23 = var23.rest();
                var24 = var23.first();
            }
        }
        SubLObject var23 = var21;
        SubLObject var25 = (SubLObject)module0296.NIL;
        var25 = var23.first();
        while (module0296.NIL != var23) {
            if (module0296.NIL == module0004.f104(var25, var18, (SubLObject)module0296.UNPROVIDED, (SubLObject)module0296.UNPROVIDED)) {
                final SubLObject var26 = Hashtables.gethash(var25, module0295.f19835(), (SubLObject)module0296.UNPROVIDED);
                if (module0296.NIL != f19952(var26, var2, var6, var20, var7)) {
                    var22 = (SubLObject)ConsesLow.cons(var26, var22);
                }
            }
            var23 = var23.rest();
            var25 = var23.first();
        }
        return var22;
    }
    
    public static SubLObject f19922(final SubLObject var3, final SubLObject var2) {
        final SubLObject var4 = module0291.f19632(var3);
        final SubLObject var5 = module0291.f19635(var3);
        final SubLObject var6 = module0291.f19623(var3, var2);
        final SubLObject var7 = module0291.f19631(var3);
        final SubLObject var8 = module0291.f19638(var3);
        return f19953(var4, var5, var2, var6, var7, var8);
    }
    
    public static SubLObject f19954(final SubLObject var22, final SubLObject var18, final SubLObject var2, final SubLObject var6, final SubLObject var20, final SubLObject var7) {
        return f19955(var22, var18, var2, var6, var20, var7);
    }
    
    public static SubLObject f19953(final SubLObject var22, final SubLObject var18, final SubLObject var2, final SubLObject var6, final SubLObject var20, final SubLObject var7) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        final SubLObject var24 = module0034.$g879$.getDynamicValue(var23);
        SubLObject var25 = (SubLObject)module0296.NIL;
        if (module0296.NIL == var24) {
            return f19954(var22, var18, var2, var6, var20, var7);
        }
        var25 = module0034.f1857(var24, (SubLObject)module0296.$ic16$, (SubLObject)module0296.UNPROVIDED);
        if (module0296.NIL == var25) {
            var25 = module0034.f1807(module0034.f1842(var24), (SubLObject)module0296.$ic16$, (SubLObject)module0296.SIX_INTEGER, (SubLObject)module0296.NIL, (SubLObject)module0296.EQUAL, (SubLObject)module0296.UNPROVIDED);
            module0034.f1860(var24, (SubLObject)module0296.$ic16$, var25);
        }
        final SubLObject var26 = module0034.f1778(var22, var18, var2, var6, var20, var7);
        final SubLObject var27 = module0034.f1814(var25, var26, (SubLObject)module0296.UNPROVIDED);
        if (var27 != module0296.$ic7$) {
            SubLObject var28 = var27;
            SubLObject var29 = (SubLObject)module0296.NIL;
            var29 = var28.first();
            while (module0296.NIL != var28) {
                SubLObject var30 = var29.first();
                final SubLObject var31 = conses_high.second(var29);
                if (var22.equal(var30.first())) {
                    var30 = var30.rest();
                    if (var18.equal(var30.first())) {
                        var30 = var30.rest();
                        if (var2.equal(var30.first())) {
                            var30 = var30.rest();
                            if (var6.equal(var30.first())) {
                                var30 = var30.rest();
                                if (var20.equal(var30.first())) {
                                    var30 = var30.rest();
                                    if (module0296.NIL != var30 && module0296.NIL == var30.rest() && var7.equal(var30.first())) {
                                        return module0034.f1959(var31);
                                    }
                                }
                            }
                        }
                    }
                }
                var28 = var28.rest();
                var29 = var28.first();
            }
        }
        final SubLObject var32 = Values.arg2(var23.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f19954(var22, var18, var2, var6, var20, var7)));
        module0034.f1836(var25, var26, var27, var32, (SubLObject)ConsesLow.list(var22, var18, var2, var6, var20, var7));
        return module0034.f1959(var32);
    }
    
    public static SubLObject f19955(final SubLObject var22, final SubLObject var18, final SubLObject var2, final SubLObject var6, final SubLObject var20, final SubLObject var7) {
        if (module0296.$ic17$ == var22) {
            return (SubLObject)module0296.NIL;
        }
        SubLObject var23 = (SubLObject)module0296.NIL;
        SubLObject var24 = module0295.f19839();
        SubLObject var25 = (SubLObject)module0296.NIL;
        var25 = var24.first();
        while (module0296.NIL != var24) {
            if (module0296.NIL == module0004.f104(module0295.f19834(var25), var18, (SubLObject)module0296.UNPROVIDED, (SubLObject)module0296.UNPROVIDED) && module0296.NIL != f19952(var25, var2, var6, var20, var7)) {
                var23 = (SubLObject)ConsesLow.cons(var25, var23);
            }
            var24 = var24.rest();
            var25 = var24.first();
        }
        return var23;
    }
    
    public static SubLObject f19952(final SubLObject var16, final SubLObject var2, final SubLObject var6, final SubLObject var20, final SubLObject var7) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0296.NIL != f19956(var16, var20) && module0296.NIL != f19926(var16, var2) && module0296.NIL != f19957(var16, var7) && module0296.NIL != f19958(var16, var6, var2));
    }
    
    public static SubLObject f19959(final SubLObject var13, final SubLObject var2) {
        SubLObject var14 = var13;
        SubLObject var15 = var13;
        SubLObject var16 = (SubLObject)module0296.NIL;
        var16 = var15.first();
        while (module0296.NIL != var15) {
            if (module0296.NIL != module0269.f17715(var16)) {
                SubLObject var15_82 = module0260.f17028(var16, var2, (SubLObject)module0296.UNPROVIDED);
                SubLObject var17 = (SubLObject)module0296.NIL;
                var17 = var15_82.first();
                while (module0296.NIL != var15_82) {
                    final SubLObject var18 = var17;
                    if (module0296.NIL == conses_high.member(var18, var14, Symbols.symbol_function((SubLObject)module0296.EQL), Symbols.symbol_function((SubLObject)module0296.IDENTITY))) {
                        var14 = (SubLObject)ConsesLow.cons(var18, var14);
                    }
                    var15_82 = var15_82.rest();
                    var17 = var15_82.first();
                }
            }
            else if (module0296.NIL != module0269.f17709(var16)) {
                SubLObject var15_83 = module0256.f16547(var16, var2);
                SubLObject var19 = (SubLObject)module0296.NIL;
                var19 = var15_83.first();
                while (module0296.NIL != var15_83) {
                    final SubLObject var18 = var19;
                    if (module0296.NIL == conses_high.member(var18, var14, Symbols.symbol_function((SubLObject)module0296.EQL), Symbols.symbol_function((SubLObject)module0296.IDENTITY))) {
                        var14 = (SubLObject)ConsesLow.cons(var18, var14);
                    }
                    var15_83 = var15_83.rest();
                    var19 = var15_83.first();
                }
            }
            else if (module0296.NIL != module0269.f17730(var16)) {
                SubLObject var15_84 = module0262.f17311(var16, var2, (SubLObject)module0296.UNPROVIDED);
                SubLObject var20 = (SubLObject)module0296.NIL;
                var20 = var15_84.first();
                while (module0296.NIL != var15_84) {
                    final SubLObject var18 = var20;
                    if (module0296.NIL == conses_high.member(var18, var14, Symbols.symbol_function((SubLObject)module0296.EQL), Symbols.symbol_function((SubLObject)module0296.IDENTITY))) {
                        var14 = (SubLObject)ConsesLow.cons(var18, var14);
                    }
                    var15_84 = var15_84.rest();
                    var20 = var15_84.first();
                }
            }
            var15 = var15.rest();
            var16 = var15.first();
        }
        return var14;
    }
    
    public static SubLObject f19930(final SubLObject var40, final SubLObject var1, final SubLObject var13, final SubLObject var2, final SubLObject var6) {
        final SubLObject var41 = module0291.f19628(var6);
        final SubLObject var42 = module0291.f19629(var6);
        final SubLObject var43 = module0291.f19630(var6);
        SubLObject var44 = (SubLObject)module0296.NIL;
        SubLObject var45 = (SubLObject)module0296.NIL;
        SubLObject var46 = (SubLObject)module0296.NIL;
        SubLObject var47 = (SubLObject)module0296.NIL;
        SubLObject var48 = (SubLObject)module0296.NIL;
        SubLObject var49 = var40;
        SubLObject var50 = (SubLObject)module0296.NIL;
        var50 = var49.first();
        while (module0296.NIL != var49) {
            if (module0296.NIL != f19960(var50, var2) && module0296.NIL != f19961(var50, var13)) {
                if (module0296.NIL != f19962(var50, var41, var2)) {
                    var44 = (SubLObject)ConsesLow.cons(var50, var44);
                }
                else if (module0296.NIL != f19962(var50, var42, var2)) {
                    var45 = (SubLObject)ConsesLow.cons(var50, var45);
                }
                else if (module0296.NIL != f19962(var50, var43, var2)) {
                    var46 = (SubLObject)ConsesLow.cons(var50, var46);
                }
                else {
                    var47 = (SubLObject)ConsesLow.cons(var50, var47);
                }
            }
            else {
                var48 = (SubLObject)ConsesLow.cons(var50, var48);
            }
            var49 = var49.rest();
            var50 = var49.first();
        }
        return ConsesLow.nconc(new SubLObject[] { var44, var45, var46, var47, var48 });
    }
    
    public static SubLObject f19926(final SubLObject var16, final SubLObject var2) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        SubLObject var18 = (SubLObject)module0296.NIL;
        final SubLObject var19 = module0147.$g2094$.currentBinding(var17);
        final SubLObject var20 = module0147.$g2095$.currentBinding(var17);
        try {
            module0147.$g2094$.bind(module0147.f9531(var2), var17);
            module0147.$g2095$.bind(module0147.f9534(var2), var17);
            var18 = module0147.f9507(module0295.f19822(var16));
        }
        finally {
            module0147.$g2095$.rebind(var20, var17);
            module0147.$g2094$.rebind(var19, var17);
        }
        return var18;
    }
    
    public static SubLObject f19960(final SubLObject var16, final SubLObject var2) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        SubLObject var18 = (SubLObject)module0296.NIL;
        final SubLObject var19 = module0147.$g2094$.currentBinding(var17);
        final SubLObject var20 = module0147.$g2095$.currentBinding(var17);
        try {
            module0147.$g2094$.bind((SubLObject)module0296.$ic18$, var17);
            module0147.$g2095$.bind(var2, var17);
            var18 = module0147.f9507(module0295.f19822(var16));
        }
        finally {
            module0147.$g2095$.rebind(var20, var17);
            module0147.$g2094$.rebind(var19, var17);
        }
        return var18;
    }
    
    public static SubLObject f19961(final SubLObject var16, final SubLObject var97) {
        SubLObject var98 = (SubLObject)module0296.T;
        SubLObject var99 = (SubLObject)module0296.NIL;
        if (module0296.NIL == var99) {
            SubLObject var100 = var97;
            SubLObject var101 = (SubLObject)module0296.NIL;
            var101 = var100.first();
            while (module0296.NIL == var99 && module0296.NIL != var100) {
                if (module0296.NIL == module0293.f19756(var16, var101)) {
                    var98 = (SubLObject)module0296.NIL;
                    var99 = (SubLObject)module0296.T;
                }
                var100 = var100.rest();
                var101 = var100.first();
            }
        }
        return var98;
    }
    
    public static SubLObject f19956(final SubLObject var81, final SubLObject var20) {
        final SubLObject var82 = module0295.f19823(var81);
        SubLObject var83 = (SubLObject)module0296.NIL;
        if (var20.eql((SubLObject)module0296.$ic19$)) {
            var83 = (SubLObject)module0296.T;
        }
        else if (var20.eql((SubLObject)module0296.$ic2$)) {
            var83 = conses_high.member(var82, (SubLObject)module0296.$ic20$, (SubLObject)module0296.UNPROVIDED, (SubLObject)module0296.UNPROVIDED);
        }
        else if (var20.eql((SubLObject)module0296.$ic21$)) {
            var83 = conses_high.member(var82, (SubLObject)module0296.$ic22$, (SubLObject)module0296.UNPROVIDED, (SubLObject)module0296.UNPROVIDED);
        }
        else if (var20.eql((SubLObject)module0296.$ic23$)) {
            var83 = Equality.eq(var82, (SubLObject)module0296.$ic23$);
        }
        return var83;
    }
    
    public static SubLObject f19958(final SubLObject var81, final SubLObject var6, final SubLObject var2) {
        SubLObject var82 = (SubLObject)module0296.NIL;
        if (module0296.NIL == var82) {
            SubLObject var83;
            SubLObject var84;
            for (var83 = var6, var84 = (SubLObject)module0296.NIL, var84 = var83.first(); module0296.NIL == var82 && module0296.NIL != var83; var82 = f19962(var81, var84, var2), var83 = var83.rest(), var84 = var83.first()) {}
        }
        return var82;
    }
    
    public static SubLObject f19962(final SubLObject var81, final SubLObject var72, final SubLObject var2) {
        final SubLThread var82 = SubLProcess.currentSubLThread();
        final SubLObject var83 = module0295.f19896(var72, module0295.f19824(var81));
        final SubLObject var84 = f19963(var81, var72, var2, var83);
        final SubLObject var85 = module0035.delete_if_not((SubLObject)module0296.$ic24$, ConsesLow.append(var83, var84), (SubLObject)module0296.UNPROVIDED, (SubLObject)module0296.UNPROVIDED, (SubLObject)module0296.UNPROVIDED, (SubLObject)module0296.UNPROVIDED);
        final SubLObject var86 = Mapping.mapcar(Symbols.symbol_function((SubLObject)module0296.$ic25$), var85);
        SubLObject var87 = (SubLObject)module0296.NIL;
        if (module0296.NIL != var86) {
            final SubLObject var88 = module0147.$g2094$.currentBinding(var82);
            final SubLObject var89 = module0147.$g2095$.currentBinding(var82);
            try {
                module0147.$g2094$.bind(module0147.f9531(var2), var82);
                module0147.$g2095$.bind(module0147.f9534(var2), var82);
                if (module0296.NIL == var87) {
                    SubLObject var90;
                    SubLObject var91;
                    for (var90 = var86, var91 = (SubLObject)module0296.NIL, var91 = var90.first(); module0296.NIL == var87 && module0296.NIL != var90; var87 = module0147.f9507(var91), var90 = var90.rest(), var91 = var90.first()) {}
                }
            }
            finally {
                module0147.$g2095$.rebind(var89, var82);
                module0147.$g2094$.rebind(var88, var82);
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0296.NIL == var87);
    }
    
    public static SubLObject f19963(final SubLObject var81, final SubLObject var72, final SubLObject var2, final SubLObject var73) {
        final SubLObject var82 = f19947(var81, var72);
        SubLObject var83 = (SubLObject)module0296.NIL;
        SubLObject var84 = var82;
        SubLObject var85 = (SubLObject)module0296.NIL;
        var85 = var84.first();
        while (module0296.NIL != var84) {
            if (module0296.NIL == f19964(var85, var2, var73)) {
                var83 = (SubLObject)ConsesLow.cons(var85, var83);
            }
            var84 = var84.rest();
            var85 = var84.first();
        }
        return var83;
    }
    
    public static SubLObject f19964(final SubLObject var104, final SubLObject var2, final SubLObject var105) {
        final SubLThread var106 = SubLProcess.currentSubLThread();
        final SubLObject var107 = f19951(var104);
        SubLObject var108 = (SubLObject)module0296.NIL;
        if (module0296.NIL == var108) {
            SubLObject var109 = var105;
            SubLObject var110 = (SubLObject)module0296.NIL;
            var110 = var109.first();
            while (module0296.NIL == var108 && module0296.NIL != var109) {
                if (module0296.NIL != f19949(var110, var2)) {
                    final SubLObject var111 = module0147.$g2094$.currentBinding(var106);
                    final SubLObject var112 = module0147.$g2095$.currentBinding(var106);
                    try {
                        module0147.$g2094$.bind(module0147.f9531(var2), var106);
                        module0147.$g2095$.bind(module0147.f9534(var2), var106);
                        var108 = (SubLObject)SubLObjectFactory.makeBoolean(module0296.NIL != module0147.f9507(var107) && module0296.NIL != module0147.f9507(f19951(var110)));
                    }
                    finally {
                        module0147.$g2095$.rebind(var112, var106);
                        module0147.$g2094$.rebind(var111, var106);
                    }
                }
                var109 = var109.rest();
                var110 = var109.first();
            }
        }
        return var108;
    }
    
    public static SubLObject f19957(final SubLObject var16, final SubLObject var7) {
        if (module0296.NIL == var7) {
            return (SubLObject)module0296.T;
        }
        final SubLObject var17 = module0295.f19834(var16);
        SubLObject var18 = (SubLObject)module0296.NIL;
        if (module0296.NIL == var17) {
            return (SubLObject)module0296.NIL;
        }
        if (module0296.NIL == var18) {
            SubLObject var19 = module0211.f13701(var17);
            SubLObject var20 = (SubLObject)module0296.NIL;
            var20 = var19.first();
            while (module0296.NIL == var18 && module0296.NIL != var19) {
                if (module0296.NIL != module0178.f11284(var20) && module0296.NIL != conses_high.member(module0178.f11333(var20), var7, (SubLObject)module0296.UNPROVIDED, (SubLObject)module0296.UNPROVIDED)) {
                    var18 = (SubLObject)module0296.T;
                }
                var19 = var19.rest();
                var20 = var19.first();
            }
        }
        return var18;
    }
    
    public static SubLObject f19938(final SubLObject var1, final SubLObject var16, final SubLObject var2, final SubLObject var50, final SubLObject var51, final SubLObject var52, final SubLObject var3, final SubLObject var111) {
        final SubLThread var112 = SubLProcess.currentSubLThread();
        final SubLObject var113 = module0291.f19639(var3);
        SubLObject var114 = module0295.f19826(var16);
        SubLObject var115 = (SubLObject)module0296.NIL;
        var115 = var114.first();
        while (module0296.NIL != var114) {
            var112.resetMultipleValues();
            final SubLObject var116 = f19965(var115);
            final SubLObject var117 = var112.secondMultipleValue();
            final SubLObject var118 = var112.thirdMultipleValue();
            var112.resetMultipleValues();
            if (module0296.NIL != f19966(var116, var111) && module0296.NIL != f19967(var118, var2) && module0296.NIL == f19968(var117, var1, var16, var2, var50, var51, var52, var113, var3)) {
                return (SubLObject)module0296.NIL;
            }
            var114 = var114.rest();
            var115 = var114.first();
        }
        return (SubLObject)module0296.T;
    }
    
    public static SubLObject f19967(final SubLObject var116, final SubLObject var2) {
        final SubLThread var117 = SubLProcess.currentSubLThread();
        SubLObject var118 = (SubLObject)module0296.NIL;
        final SubLObject var119 = module0147.$g2094$.currentBinding(var117);
        final SubLObject var120 = module0147.$g2095$.currentBinding(var117);
        try {
            module0147.$g2094$.bind(module0147.f9531(var2), var117);
            module0147.$g2095$.bind(module0147.f9534(var2), var117);
            var118 = module0147.f9507(var116);
        }
        finally {
            module0147.$g2095$.rebind(var120, var117);
            module0147.$g2094$.rebind(var119, var117);
        }
        return var118;
    }
    
    public static SubLObject f19968(final SubLObject var115, final SubLObject var1, final SubLObject var16, final SubLObject var2, final SubLObject var50, final SubLObject var51, final SubLObject var52, final SubLObject var112, final SubLObject var3) {
        final SubLObject var116 = conses_high.nsublis(var52, conses_high.sublis(var51, var115, (SubLObject)module0296.UNPROVIDED, (SubLObject)module0296.UNPROVIDED), (SubLObject)module0296.UNPROVIDED, (SubLObject)module0296.UNPROVIDED);
        SubLObject var117 = (SubLObject)module0296.NIL;
        if (var112.eql((SubLObject)module0296.$ic26$)) {
            var117 = f19969(var116, var2, var3);
        }
        return var117;
    }
    
    public static SubLObject f19970(final SubLObject var117, final SubLObject var2, final SubLObject var3) {
        final SubLThread var118 = SubLProcess.currentSubLThread();
        SubLObject var119 = (SubLObject)module0296.NIL;
        SubLObject var120 = module0296.$g2692$.getGlobalValue();
        final SubLObject var121 = module0291.f19647(var3);
        if (module0296.NIL != var121) {
            var120 = ConsesLow.append((SubLObject)ConsesLow.list((SubLObject)module0296.$ic29$, Numbers.floor(var121, (SubLObject)module0296.UNPROVIDED)), var120);
        }
        final SubLObject var122 = module0018.$g696$.currentBinding(var118);
        final SubLObject var123 = module0271.$g2562$.currentBinding(var118);
        final SubLObject var124 = module0144.$g1752$.currentBinding(var118);
        final SubLObject var125 = module0271.$g2560$.currentBinding(var118);
        final SubLObject var126 = module0271.$g2561$.currentBinding(var118);
        final SubLObject var127 = module0271.$g2563$.currentBinding(var118);
        final SubLObject var128 = module0146.$g2055$.currentBinding(var118);
        final SubLObject var129 = module0144.$g1771$.currentBinding(var118);
        final SubLObject var130 = module0144.$g1769$.currentBinding(var118);
        final SubLObject var131 = module0152.$g2107$.currentBinding(var118);
        final SubLObject var132 = module0110.$g1374$.currentBinding(var118);
        final SubLObject var133 = module0271.$g2564$.currentBinding(var118);
        try {
            module0018.$g696$.bind((SubLObject)module0296.NIL, var118);
            module0271.$g2562$.bind((SubLObject)module0296.NIL, var118);
            module0144.$g1752$.bind((SubLObject)module0296.NIL, var118);
            module0271.$g2560$.bind((SubLObject)module0296.NIL, var118);
            module0271.$g2561$.bind((SubLObject)module0296.NIL, var118);
            module0271.$g2563$.bind((SubLObject)module0296.NIL, var118);
            module0146.$g2055$.bind((SubLObject)module0296.NIL, var118);
            module0144.$g1771$.bind((SubLObject)module0296.NIL, var118);
            module0144.$g1769$.bind((SubLObject)module0296.NIL, var118);
            module0152.$g2107$.bind((SubLObject)module0296.NIL, var118);
            module0110.$g1374$.bind((SubLObject)module0296.T, var118);
            module0271.$g2564$.bind((SubLObject)module0296.NIL, var118);
            if (module0296.NIL != module0202.f12691(var117, (SubLObject)module0296.UNPROVIDED) && module0296.NIL != module0552.f34036(var117)) {
                if (module0296.NIL != module0347.f23352(var117)) {
                    var119 = module0347.f23354(var117, (module0296.NIL != var2) ? var2 : module0147.$g2095$.getDynamicValue(var118), (SubLObject)module0296.UNPROVIDED);
                }
                else {
                    var119 = module0540.f33526(module0409.f28506(var117, (module0296.NIL != var2) ? var2 : module0147.$g2095$.getDynamicValue(var118), var120));
                }
            }
        }
        finally {
            module0271.$g2564$.rebind(var133, var118);
            module0110.$g1374$.rebind(var132, var118);
            module0152.$g2107$.rebind(var131, var118);
            module0144.$g1769$.rebind(var130, var118);
            module0144.$g1771$.rebind(var129, var118);
            module0146.$g2055$.rebind(var128, var118);
            module0271.$g2563$.rebind(var127, var118);
            module0271.$g2561$.rebind(var126, var118);
            module0271.$g2560$.rebind(var125, var118);
            module0144.$g1752$.rebind(var124, var118);
            module0271.$g2562$.rebind(var123, var118);
            module0018.$g696$.rebind(var122, var118);
        }
        return var119;
    }
    
    public static SubLObject f19969(final SubLObject var117, final SubLObject var2, final SubLObject var3) {
        final SubLThread var118 = SubLProcess.currentSubLThread();
        final SubLObject var119 = module0034.$g879$.getDynamicValue(var118);
        SubLObject var120 = (SubLObject)module0296.NIL;
        if (module0296.NIL == var119) {
            return f19970(var117, var2, var3);
        }
        var120 = module0034.f1857(var119, (SubLObject)module0296.$ic28$, (SubLObject)module0296.UNPROVIDED);
        if (module0296.NIL == var120) {
            var120 = module0034.f1807(module0034.f1842(var119), (SubLObject)module0296.$ic28$, (SubLObject)module0296.THREE_INTEGER, (SubLObject)module0296.$ic30$, (SubLObject)module0296.EQUAL, (SubLObject)module0296.UNPROVIDED);
            module0034.f1860(var119, (SubLObject)module0296.$ic28$, var120);
        }
        final SubLObject var121 = module0034.f1781(var117, var2, var3);
        final SubLObject var122 = module0034.f1814(var120, var121, (SubLObject)module0296.UNPROVIDED);
        if (var122 != module0296.$ic7$) {
            SubLObject var123 = var122;
            SubLObject var124 = (SubLObject)module0296.NIL;
            var124 = var123.first();
            while (module0296.NIL != var123) {
                SubLObject var125 = var124.first();
                final SubLObject var126 = conses_high.second(var124);
                if (var117.equal(var125.first())) {
                    var125 = var125.rest();
                    if (var2.equal(var125.first())) {
                        var125 = var125.rest();
                        if (module0296.NIL != var125 && module0296.NIL == var125.rest() && var3.equal(var125.first())) {
                            return module0034.f1959(var126);
                        }
                    }
                }
                var123 = var123.rest();
                var124 = var123.first();
            }
        }
        final SubLObject var127 = Values.arg2(var118.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f19970(var117, var2, var3)));
        module0034.f1836(var120, var121, var122, var127, (SubLObject)ConsesLow.list(var117, var2, var3));
        return module0034.f1959(var127);
    }
    
    public static SubLObject f19966(final SubLObject var114, final SubLObject var111) {
        return Equality.eq(var114, var111);
    }
    
    public static SubLObject f19965(final SubLObject var113) {
        final SubLObject var114 = f19971(var113);
        final SubLObject var115 = f19972(var113);
        final SubLObject var116 = f19973(var113);
        return Values.values(var114, var115, var116);
    }
    
    public static SubLObject f19971(final SubLObject var113) {
        return var113.first();
    }
    
    public static SubLObject f19972(final SubLObject var113) {
        return conses_high.second(var113);
    }
    
    public static SubLObject f19973(final SubLObject var113) {
        return conses_high.third(var113);
    }
    
    public static SubLObject f19928(final SubLObject var1, final SubLObject var13, final SubLObject var16, final SubLObject var17) {
        final SubLObject var18 = module0295.f19828(var16, var17);
        return f19974(var1, var13, var18);
    }
    
    public static SubLObject f19974(final SubLObject var1, final SubLObject var13, final SubLObject var133) {
        return module0035.f2183(module0295.f19816(var133), var13, Symbols.symbol_function((SubLObject)module0296.EQL), (SubLObject)module0296.$ic31$, (SubLObject)module0296.UNPROVIDED);
    }
    
    public static SubLObject f19975() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19920", "S#22567", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19921", "S#22568", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19924", "S#22569", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19929", "S#22570", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19923", "S#22571", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19931", "S#22572", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19934", "S#22573", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19936", "S#22574", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19935", "S#22575", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19932", "S#22576", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19937", "S#22577", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19939", "S#22578", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19940", "S#22579", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19941", "S#22580", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19942", "S#22581", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19933", "S#22582", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19927", "S#22583", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19943", "S#22584", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19944", "S#22585", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19945", "S#22586", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19946", "S#22587", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19947", "S#22588", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19948", "S#22563", 1, 0, false);
        new $f19948$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19949", "S#22589", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19950", "S#22590", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19951", "S#22591", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19925", "S#22592", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19922", "S#22593", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19954", "S#22594", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19953", "S#22595", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19955", "S#22596", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19952", "S#22597", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19959", "S#22598", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19930", "S#22599", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19926", "S#22600", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19960", "S#22601", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19961", "S#22602", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19956", "S#22603", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19958", "S#22604", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19962", "S#22605", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19963", "S#22606", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19964", "S#22607", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19957", "S#22608", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19938", "S#22609", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19967", "S#22610", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19968", "S#22611", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19970", "S#22612", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19969", "S#22613", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19966", "S#22614", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19965", "S#22615", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19971", "S#22616", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19972", "S#22617", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19973", "S#22618", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19928", "S#22619", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0296", "f19974", "S#22620", 3, 0, false);
        return (SubLObject)module0296.NIL;
    }
    
    public static SubLObject f19976() {
        module0296.$g2692$ = SubLFiles.defconstant("S#22621", (SubLObject)module0296.$ic27$);
        return (SubLObject)module0296.NIL;
    }
    
    public static SubLObject f19977() {
        module0292.f19698(module0296.$ic0$, (SubLObject)module0296.$ic1$);
        module0034.f1895((SubLObject)module0296.$ic3$);
        module0034.f1895((SubLObject)module0296.$ic16$);
        module0034.f1895((SubLObject)module0296.$ic28$);
        return (SubLObject)module0296.NIL;
    }
    
    public void declareFunctions() {
        f19975();
    }
    
    public void initializeVariables() {
        f19976();
    }
    
    public void runTopLevelForms() {
        f19977();
    }
    
    static {
        me = (SubLFile)new module0296();
        module0296.$g2692$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ReformulatorRuleUnifier"));
        $ic1$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("TRUE"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#22567", "CYC"), SubLObjectFactory.makeKeyword("REFORMULATE"), SubLObjectFactory.makeSymbol("S#22568", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("The fallback mechanism for the reformulator.\n    Unifies the input expression with applicable reformulator rules."), SubLObjectFactory.makeKeyword("EXAMPLE-SOURCE"), SubLObjectFactory.makeString("(#$implies (#$isa ?X #$Dog) (#$isa ?X #$Animal))"), SubLObjectFactory.makeKeyword("EXAMPLE-TARGET"), SubLObjectFactory.makeString("(#$genls #$Dog #$Animal)") });
        $ic2$ = SubLObjectFactory.makeKeyword("KB");
        $ic3$ = SubLObjectFactory.makeSymbol("S#22571", "CYC");
        $ic4$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic5$ = SubLObjectFactory.makeKeyword("NO-SEARCH");
        $ic6$ = SubLObjectFactory.makeInteger(64);
        $ic7$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic8$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("notAssertible"));
        $ic9$ = SubLObjectFactory.makeSymbol("S#12278", "CYC");
        $ic10$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ReformulationBackwardDirection"));
        $ic11$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("expansion"));
        $ic12$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("expansionAxiom"));
        $ic13$ = SubLObjectFactory.makeSymbol("CAR");
        $ic14$ = SubLObjectFactory.makeSymbol("CDR");
        $ic15$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ReformulationNeitherDirection"));
        $ic16$ = SubLObjectFactory.makeSymbol("S#22595", "CYC");
        $ic17$ = SubLObjectFactory.makeKeyword("FALSE");
        $ic18$ = SubLObjectFactory.makeSymbol("S#12276", "CYC");
        $ic19$ = SubLObjectFactory.makeKeyword("NONE");
        $ic20$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("KB"), (SubLObject)SubLObjectFactory.makeKeyword("ARITY"), (SubLObject)SubLObjectFactory.makeKeyword("ALL"));
        $ic21$ = SubLObjectFactory.makeKeyword("ARITY");
        $ic22$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ARITY"), (SubLObject)SubLObjectFactory.makeKeyword("ALL"));
        $ic23$ = SubLObjectFactory.makeKeyword("ALL");
        $ic24$ = SubLObjectFactory.makeSymbol("S#22563", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("SECOND");
        $ic26$ = SubLObjectFactory.makeKeyword("REMOVAL-ONLY-ASK");
        $ic27$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("HL"), (SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)module0296.ONE_INTEGER);
        $ic28$ = SubLObjectFactory.makeSymbol("S#22613", "CYC");
        $ic29$ = SubLObjectFactory.makeKeyword("MAX-TIME");
        $ic30$ = SubLObjectFactory.makeInteger(256);
        $ic31$ = SubLObjectFactory.makeSymbol("S#16704", "CYC");
    }
    
    public static final class $f19948$UnaryFunction extends UnaryFunction
    {
        public $f19948$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#22563"));
        }
        
        public SubLObject processItem(final SubLObject var77) {
            return module0296.f19948(var77);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0296.class
	Total time: 317 ms
	
	Decompiled with Procyon 0.5.32.
*/