package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0162 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0162";
    public static final String myFingerPrint = "66571fd4c4c4781d3ef7bbeabddf5434728ab53a1b98c101e680908723ce01a7";
    private static final SubLSymbol $ic0$;
    private static final SubLObject $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLString $ic7$;
    private static final SubLObject $ic8$;
    private static final SubLObject $ic9$;
    private static final SubLObject $ic10$;
    private static final SubLObject $ic11$;
    private static final SubLString $ic12$;
    private static final SubLObject $ic13$;
    private static final SubLObject $ic14$;
    private static final SubLString $ic15$;
    private static final SubLObject $ic16$;
    private static final SubLObject $ic17$;
    private static final SubLObject $ic18$;
    private static final SubLObject $ic19$;
    private static final SubLObject $ic20$;
    private static final SubLObject $ic21$;
    private static final SubLObject $ic22$;
    private static final SubLObject $ic23$;
    private static final SubLObject $ic24$;
    private static final SubLString $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLObject $ic27$;
    private static final SubLObject $ic28$;
    private static final SubLObject $ic29$;
    private static final SubLObject $ic30$;
    private static final SubLList $ic31$;
    
    public static SubLObject f10628(SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0162.NIL != module0146.$g2046$.getDynamicValue(var2)) {
            return var1;
        }
        assert module0162.NIL != module0161.f10479(var1) : var1;
        var2.resetMultipleValues();
        final SubLObject var3 = module0280.f18634(var1, module0162.$ic1$);
        final SubLObject var4 = var2.secondMultipleValue();
        var2.resetMultipleValues();
        var1 = var3;
        if (module0162.NIL != var1) {
            var1 = module0161.f10555(var1, module0018.f980());
            var1 = module0205.f13327(var1);
            if (module0162.NIL != module0131.f8587() && module0162.NIL == module0151.f9690() && module0162.NIL != module0202.f12659(module0161.f10557(var1)) && module0162.NIL != module0035.f2439(Symbols.symbol_function((SubLObject)module0162.$ic2$), module0161.f10557(var1), (SubLObject)module0162.UNPROVIDED)) {
                var1 = module0285.f18875(var1, module0132.$g1548$.getGlobalValue());
            }
            var1 = f10629(var1);
        }
        return var1;
    }
    
    public static SubLObject f10630(final SubLObject var1) {
        final SubLObject var2 = f10628(var1);
        assert module0162.NIL != module0161.f10499(var2) : var2;
        return var2;
    }
    
    public static SubLObject f10629(SubLObject var5) {
        if (module0162.NIL != module0161.f10494(var5)) {
            var5 = f10631(var5);
            SubLObject var6 = module0161.f10537(var5);
            var6 = f10632(var6);
            var5 = module0161.f10518(var6);
        }
        if (module0162.NIL != module0018.f981() && module0162.NIL != module0161.f10602(var5)) {
            var5 = (SubLObject)module0162.NIL;
        }
        return var5;
    }
    
    public static SubLObject f10632(final SubLObject var7) {
        return module0035.f2344(var7, module0161.f10528(), (SubLObject)module0162.EQL, (SubLObject)module0162.$ic4$);
    }
    
    public static SubLObject f10631(SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        SubLObject var7 = module0161.f10586(var5);
        if (module0162.NIL != var7) {
            if (module0162.NIL == module0161.f10535(var7)) {
                if (module0162.NIL != module0161.f10496(var7)) {
                    SubLObject var8 = module0161.f10588(var7);
                    if (module0162.NIL != module0614.f37617(var8)) {
                        var8 = module0614.f37645(var8);
                        if (module0162.NIL != module0612.f37390(var8)) {
                            var7 = module0161.f10521();
                        }
                        else {
                            var7 = module0161.f10520(var8);
                        }
                        var5 = module0161.f10540((SubLObject)module0162.$ic5$, var5, var7);
                    }
                }
                else {
                    SubLObject var8 = (SubLObject)module0162.NIL;
                    SubLObject var9 = (SubLObject)module0162.NIL;
                    var6.resetMultipleValues();
                    final SubLObject var11_12 = module0161.f10598(var7);
                    final SubLObject var13_14 = var6.secondMultipleValue();
                    var6.resetMultipleValues();
                    var8 = var11_12;
                    var9 = var13_14;
                    if (module0162.NIL != module0614.f37617(var8)) {
                        var8 = module0614.f37645(var8);
                        var7 = module0161.f10543(var8, var9);
                        var5 = module0161.f10540((SubLObject)module0162.$ic5$, var5, var7);
                    }
                }
            }
        }
        return var5;
    }
    
    public static SubLObject f10633(final SubLObject var15, final SubLObject var16, final SubLObject var5) {
        final SubLObject var17 = Equality.eq((SubLObject)module0162.$ic6$, var16);
        return (module0162.NIL != module0161.f10590(var5)) ? f10634(var15, var5, var17) : f10635(var15, var5, var17);
    }
    
    public static SubLObject f10634(final SubLObject var15, final SubLObject var5, final SubLObject var17) {
        return Values.values(f10636(var15, var17), var5);
    }
    
    public static SubLObject f10636(final SubLObject var18, final SubLObject var17) {
        if (module0162.NIL != module0202.f12592(var18)) {
            return f10636(module0205.f13203(var18, (SubLObject)module0162.UNPROVIDED), (SubLObject)SubLObjectFactory.makeBoolean(module0162.NIL == var17));
        }
        final SubLObject var19 = module0205.f13136(var18);
        if (module0162.NIL != module0202.f12631(var19)) {
            return f10636(module0205.f13203(var18, (SubLObject)module0162.UNPROVIDED), var17);
        }
        return (module0162.NIL != var17) ? module0202.f12771(var18) : var18;
    }
    
    public static SubLObject f10635(final SubLObject var15, final SubLObject var5, final SubLObject var17) {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        var18.resetMultipleValues();
        final SubLObject var19 = f10637(var15, var5, var17);
        final SubLObject var20 = var18.secondMultipleValue();
        var18.resetMultipleValues();
        return Values.values(var19, f10628(var20));
    }
    
    public static SubLObject f10637(final SubLObject var22, final SubLObject var5, final SubLObject var17) {
        if (module0162.NIL != module0202.f12592(var22)) {
            return f10637(module0205.f13203(var22, (SubLObject)module0162.UNPROVIDED), var5, (SubLObject)SubLObjectFactory.makeBoolean(module0162.NIL == var17));
        }
        SubLObject var23 = module0205.f13136(var22);
        if (module0162.NIL != module0202.f12631(var23)) {
            if (module0162.NIL != var17) {
                var23 = f10638(var23);
            }
            return f10639(var23, module0205.f13203(var22, (SubLObject)module0162.UNPROVIDED), var5, var17);
        }
        if (module0162.NIL != module0202.f12632(var23)) {
            if (module0162.NIL != var17) {
                Errors.error((SubLObject)module0162.$ic7$);
            }
            return f10640(var22, var5, var17);
        }
        if (module0162.NIL != var17) {
            return Values.values(module0202.f12771(var22), var5);
        }
        return Values.values(var22, var5);
    }
    
    public static SubLObject f10638(final SubLObject var19) {
        if (var19.eql(module0162.$ic8$)) {
            return module0162.$ic9$;
        }
        if (var19.eql(module0162.$ic10$)) {
            return module0162.$ic11$;
        }
        if (var19.eql(module0162.$ic9$)) {
            return module0162.$ic8$;
        }
        if (var19.eql(module0162.$ic11$)) {
            return module0162.$ic10$;
        }
        return Errors.error((SubLObject)module0162.$ic12$, var19);
    }
    
    public static SubLObject f10639(final SubLObject var19, SubLObject var18, SubLObject var5, SubLObject var17) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        if (var19.eql(module0162.$ic8$)) {
            var20.resetMultipleValues();
            final SubLObject var24_25 = f10641(var18, var5, var17);
            final SubLObject var26_27 = var20.secondMultipleValue();
            final SubLObject var28_29 = var20.thirdMultipleValue();
            var20.resetMultipleValues();
            var18 = var24_25;
            var5 = var26_27;
            var17 = var28_29;
        }
        else if (var19.eql(module0162.$ic10$)) {
            var20.resetMultipleValues();
            final SubLObject var30_31 = f10642(var18, var5, var17);
            final SubLObject var32_33 = var20.secondMultipleValue();
            final SubLObject var34_35 = var20.thirdMultipleValue();
            var20.resetMultipleValues();
            var18 = var30_31;
            var5 = var32_33;
            var17 = var34_35;
        }
        else if (var19.eql(module0162.$ic9$)) {
            var20.resetMultipleValues();
            final SubLObject var36_37 = f10643(var18, var5, var17);
            final SubLObject var38_39 = var20.secondMultipleValue();
            final SubLObject var40_41 = var20.thirdMultipleValue();
            var20.resetMultipleValues();
            var18 = var36_37;
            var5 = var38_39;
            var17 = var40_41;
        }
        else if (var19.eql(module0162.$ic11$)) {
            var20.resetMultipleValues();
            final SubLObject var42_43 = f10644(var18, var5, var17);
            final SubLObject var44_45 = var20.secondMultipleValue();
            final SubLObject var46_47 = var20.thirdMultipleValue();
            var20.resetMultipleValues();
            var18 = var42_43;
            var5 = var44_45;
            var17 = var46_47;
        }
        else {
            Errors.error((SubLObject)module0162.$ic12$, var19);
        }
        return f10637(var18, var5, var17);
    }
    
    public static SubLObject f10641(final SubLObject var18, final SubLObject var5, final SubLObject var17) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        SubLObject var20 = (SubLObject)module0162.NIL;
        SubLObject var21 = (SubLObject)module0162.NIL;
        var19.resetMultipleValues();
        final SubLObject var50_51 = module0161.f10612(var5, module0161.$g2160$.getGlobalValue(), module0161.$g2156$.getGlobalValue());
        final SubLObject var52_53 = var19.secondMultipleValue();
        var19.resetMultipleValues();
        var20 = var50_51;
        var21 = var52_53;
        final SubLObject var22 = module0615.f37725(var20, module0162.$ic13$);
        final SubLObject var23 = module0161.f10543(var22, module0162.$ic14$);
        final SubLObject var24 = module0201.f12550(Symbols.gensym((SubLObject)module0162.$ic15$));
        final SubLObject var25 = (module0162.NIL != module0146.f9485()) ? module0161.f10543(var24, (SubLObject)module0162.UNPROVIDED) : var24;
        final SubLObject var26 = module0161.f10540((SubLObject)module0162.$ic5$, var5, var25);
        final SubLObject var27 = (module0162.NIL != var17) ? module0202.f12771(var18) : var18;
        final SubLObject var28 = (SubLObject)ConsesLow.list(module0162.$ic16$, var24, (SubLObject)ConsesLow.list(module0162.$ic17$, (SubLObject)ConsesLow.list(module0162.$ic18$, var23, var25), (SubLObject)ConsesLow.list(module0162.$ic19$, var26, var27)));
        return Values.values(var28, module0162.$ic1$, (SubLObject)module0162.NIL);
    }
    
    public static SubLObject f10642(final SubLObject var18, final SubLObject var5, final SubLObject var17) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        SubLObject var20 = (SubLObject)module0162.NIL;
        SubLObject var21 = (SubLObject)module0162.NIL;
        var19.resetMultipleValues();
        final SubLObject var59_60 = module0161.f10612(var5, module0161.$g2160$.getGlobalValue(), module0161.$g2156$.getGlobalValue());
        final SubLObject var61_62 = var19.secondMultipleValue();
        var19.resetMultipleValues();
        var20 = var59_60;
        var21 = var61_62;
        final SubLObject var22 = module0615.f37727(var20, module0162.$ic13$);
        final SubLObject var23 = module0161.f10543(var22, module0162.$ic14$);
        final SubLObject var24 = module0201.f12550(Symbols.gensym((SubLObject)module0162.$ic15$));
        final SubLObject var25 = (module0162.NIL != module0146.f9485()) ? module0161.f10543(var24, (SubLObject)module0162.UNPROVIDED) : var24;
        final SubLObject var26 = module0161.f10540((SubLObject)module0162.$ic5$, var5, var25);
        final SubLObject var27 = (module0162.NIL != var17) ? module0202.f12771(var18) : var18;
        final SubLObject var28 = (SubLObject)ConsesLow.list(module0162.$ic16$, var24, (SubLObject)ConsesLow.list(module0162.$ic17$, (SubLObject)ConsesLow.list(module0162.$ic18$, var23, var25), (SubLObject)ConsesLow.list(module0162.$ic19$, var26, var27)));
        return Values.values(var28, module0162.$ic1$, (SubLObject)module0162.NIL);
    }
    
    public static SubLObject f10643(final SubLObject var18, final SubLObject var5, final SubLObject var17) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        SubLObject var20 = (SubLObject)module0162.NIL;
        SubLObject var21 = (SubLObject)module0162.NIL;
        SubLObject var22 = (SubLObject)module0162.NIL;
        var19.resetMultipleValues();
        final SubLObject var63_64 = module0161.f10612(var5, module0161.$g2160$.getGlobalValue(), module0161.$g2156$.getGlobalValue());
        final SubLObject var65_66 = var19.secondMultipleValue();
        var19.resetMultipleValues();
        var21 = var63_64;
        var22 = var65_66;
        SubLObject var23 = module0615.f37725(var21, var22);
        if (module0162.NIL == var23) {
            var23 = (SubLObject)ConsesLow.list(module0162.$ic20$, var21, var22);
        }
        var20 = module0161.f10543(var23, module0162.$ic14$);
        return Values.values(var18, module0161.f10540((SubLObject)module0162.$ic5$, var5, var20), var17);
    }
    
    public static SubLObject f10644(final SubLObject var18, final SubLObject var5, final SubLObject var17) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        SubLObject var20 = (SubLObject)module0162.NIL;
        SubLObject var21 = (SubLObject)module0162.NIL;
        SubLObject var22 = (SubLObject)module0162.NIL;
        var19.resetMultipleValues();
        final SubLObject var68_69 = module0161.f10612(var5, module0161.$g2160$.getGlobalValue(), module0161.$g2156$.getGlobalValue());
        final SubLObject var70_71 = var19.secondMultipleValue();
        var19.resetMultipleValues();
        var21 = var68_69;
        var22 = var70_71;
        SubLObject var23 = module0615.f37727(var21, var22);
        if (module0162.NIL == var23) {
            var23 = (SubLObject)ConsesLow.list(module0162.$ic21$, var21, var22);
        }
        var20 = module0161.f10543(var23, module0162.$ic14$);
        return Values.values(var18, module0161.f10540((SubLObject)module0162.$ic5$, var5, var20), var17);
    }
    
    public static SubLObject f10640(final SubLObject var72, final SubLObject var5, final SubLObject var17) {
        final SubLThread var73 = SubLProcess.currentSubLThread();
        var73.resetMultipleValues();
        final SubLObject var74 = module0202.f12797(var72);
        final SubLObject var75 = var73.secondMultipleValue();
        final SubLObject var76 = var73.thirdMultipleValue();
        final SubLObject var77 = var73.fourthMultipleValue();
        var73.resetMultipleValues();
        SubLObject var78 = (SubLObject)module0162.NIL;
        SubLObject var79 = (SubLObject)module0162.NIL;
        var73.resetMultipleValues();
        final SubLObject var75_76 = module0161.f10612(var5, module0161.$g2160$.getGlobalValue(), module0161.$g2156$.getGlobalValue());
        final SubLObject var77_78 = var73.secondMultipleValue();
        var73.resetMultipleValues();
        var78 = var75_76;
        var79 = var77_78;
        if (module0162.NIL != f10645(var78, var74, var75)) {
            return Values.values(module0162.$ic22$, module0162.$ic1$);
        }
        return f10637(var77, f10646(var5, var74, var75, var76), var17);
    }
    
    public static SubLObject f10645(final SubLObject var48, final SubLObject var19, final SubLObject var73) {
        if (module0162.NIL == module0614.f37617(var48) || module0162.NIL == module0614.f37669(var73)) {
            return (SubLObject)module0162.NIL;
        }
        if (var19.eql(module0162.$ic23$)) {
            final SubLObject var74 = module0615.f37743(var48, var73, (SubLObject)module0162.ZERO_INTEGER);
            final SubLObject var75 = module0615.f37726(var48, var73, (SubLObject)module0162.ZERO_INTEGER);
            return (SubLObject)SubLObjectFactory.makeBoolean(!var74.equal(var75) && !var75.equal(module0615.f37736(var74, var73, (SubLObject)module0162.ZERO_INTEGER)));
        }
        if (var19.eql(module0162.$ic24$)) {
            final SubLObject var74 = module0615.f37720(var48, var73, (SubLObject)module0162.ZERO_INTEGER);
            final SubLObject var75 = module0615.f37741(var48, var73, (SubLObject)module0162.ZERO_INTEGER);
            return (SubLObject)SubLObjectFactory.makeBoolean(!var74.equal(var75) && !var75.equal(module0615.f37736(var74, var73, (SubLObject)module0162.ZERO_INTEGER)));
        }
        return Errors.error((SubLObject)module0162.$ic25$, var19);
    }
    
    public static SubLObject f10646(final SubLObject var5, final SubLObject var81, final SubLObject var73, final SubLObject var82) {
        if (var81.eql(module0162.$ic23$)) {
            return f10647(var5, var73, var82);
        }
        if (var81.eql(module0162.$ic24$)) {
            return f10648(var5, var73, var82);
        }
        return Errors.error((SubLObject)module0162.$ic25$, var81);
    }
    
    public static SubLObject f10647(final SubLObject var5, final SubLObject var73, final SubLObject var83) {
        final SubLObject var84 = module0161.f10538((SubLObject)module0162.$ic5$, var5);
        final SubLObject var85 = module0161.f10608(var5);
        final SubLObject var86 = module0614.f37670(var85, var73, var83);
        final SubLObject var87 = module0161.f10543(var86, module0162.$ic13$);
        return module0161.f10565((SubLObject)ConsesLow.cons(var87, module0161.f10537(var84)));
    }
    
    public static SubLObject f10648(final SubLObject var5, final SubLObject var73, final SubLObject var83) {
        final SubLObject var84 = module0161.f10538((SubLObject)module0162.$ic5$, var5);
        final SubLObject var85 = module0161.f10608(var5);
        final SubLObject var86 = module0614.f37671(var85, var73, var83);
        final SubLObject var87 = module0161.f10543(var86, module0162.$ic13$);
        return module0161.f10565((SubLObject)ConsesLow.cons(var87, module0161.f10537(var84)));
    }
    
    public static SubLObject f10649(final SubLObject var85, final SubLObject var1) {
        if (module0162.NIL != module0202.f12606(var85)) {
            final SubLObject var86 = module0202.f12668(var85);
            if (module0162.NIL != module0202.f12595(var86)) {
                final SubLObject var87 = module0205.f13207(var86, (SubLObject)module0162.UNPROVIDED);
                if (module0162.NIL != module0035.f1998(var87)) {
                    final SubLObject var88 = Sequences.find_if((SubLObject)module0162.$ic26$, var87, (SubLObject)module0162.UNPROVIDED, (SubLObject)module0162.UNPROVIDED, (SubLObject)module0162.UNPROVIDED);
                    final SubLObject var89 = module0035.find_if_not((SubLObject)module0162.$ic26$, var87, (SubLObject)module0162.UNPROVIDED, (SubLObject)module0162.UNPROVIDED, (SubLObject)module0162.UNPROVIDED);
                    final SubLObject var90 = module0205.f13379(var88, (SubLObject)module0162.UNPROVIDED);
                    final SubLObject var91 = module0205.f13380(var88, (SubLObject)module0162.UNPROVIDED);
                    if (module0205.f13378(var89).eql(module0162.$ic18$)) {
                        final SubLObject var92 = module0205.f13379(var89, (SubLObject)module0162.UNPROVIDED).equal(var90) ? module0205.f13380(var89, (SubLObject)module0162.UNPROVIDED) : module0205.f13379(var89, (SubLObject)module0162.UNPROVIDED);
                        final SubLObject var93 = module0205.f13378(module0205.f13379(var92, (SubLObject)module0162.UNPROVIDED));
                        final SubLObject var94 = module0205.f13379(module0205.f13379(var92, (SubLObject)module0162.UNPROVIDED), (SubLObject)module0162.UNPROVIDED);
                        final SubLObject var95 = module0205.f13144(module0161.f10557(module0285.f18913(var90)));
                        SubLObject var96 = (SubLObject)module0162.NIL;
                        final SubLObject var97 = var93;
                        if (var97.eql(module0162.$ic27$)) {
                            var96 = module0162.$ic8$;
                        }
                        else if (var97.eql(module0162.$ic28$)) {
                            var96 = module0162.$ic10$;
                        }
                        if (module0162.NIL != var96) {
                            return Values.values(module0202.f12643(var96, var91), (SubLObject)ConsesLow.list(module0162.$ic29$, var95, (SubLObject)ConsesLow.listS(module0162.$ic30$, var94, (SubLObject)module0162.$ic31$)));
                        }
                    }
                }
            }
        }
        return Values.values(var85, var1);
    }
    
    public static SubLObject f10650() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0162", "f10628", "CANONICALIZE-HLMT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0162", "f10630", "S#13461", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0162", "f10629", "S#13462", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0162", "f10632", "S#13463", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0162", "f10631", "S#13464", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0162", "f10633", "S#13465", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0162", "f10634", "S#13466", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0162", "f10636", "S#13467", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0162", "f10635", "S#13468", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0162", "f10637", "S#13469", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0162", "f10638", "S#13470", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0162", "f10639", "S#13471", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0162", "f10641", "S#13472", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0162", "f10642", "S#13473", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0162", "f10643", "S#13474", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0162", "f10644", "S#13475", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0162", "f10640", "S#13476", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0162", "f10645", "S#13477", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0162", "f10646", "S#13478", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0162", "f10647", "S#13479", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0162", "f10648", "S#13480", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0162", "f10649", "S#13481", 2, 0, false);
        return (SubLObject)module0162.NIL;
    }
    
    public static SubLObject f10651() {
        return (SubLObject)module0162.NIL;
    }
    
    public static SubLObject f10652() {
        return (SubLObject)module0162.NIL;
    }
    
    public void declareFunctions() {
        f10650();
    }
    
    public void initializeVariables() {
        f10651();
    }
    
    public void runTopLevelForms() {
        f10652();
    }
    
    static {
        me = (SubLFile)new module0162();
        $ic0$ = SubLObjectFactory.makeSymbol("S#12264", "CYC");
        $ic1$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $ic2$ = SubLObjectFactory.makeSymbol("S#13482", "CYC");
        $ic3$ = SubLObjectFactory.makeSymbol("S#13265", "CYC");
        $ic4$ = SubLObjectFactory.makeSymbol("S#13268", "CYC");
        $ic5$ = SubLObjectFactory.makeKeyword("TIME");
        $ic6$ = SubLObjectFactory.makeKeyword("NEG");
        $ic7$ = SubLObjectFactory.makeString("Can't yet handle negated metric tense operators");
        $ic8$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("was"));
        $ic9$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("hasAlwaysBeen"));
        $ic10$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("willBe"));
        $ic11$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("willAlwaysBe"));
        $ic12$ = SubLObjectFactory.makeString("~a is not a known tense operator.");
        $ic13$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Null-TimeParameter"));
        $ic14$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TimePoint"));
        $ic15$ = SubLObjectFactory.makeString("T");
        $ic16$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("thereExists"));
        $ic17$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("and"));
        $ic18$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("temporalMicrotheoriesIntersect"));
        $ic19$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ist"));
        $ic20$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("IntervalEndedByLastSubintervalOfTypeFn"));
        $ic21$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("IntervalStartedByFirstSubintervalOfTypeFn"));
        $ic22$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("False"));
        $ic23$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("was-Metric"));
        $ic24$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("willBe-Metric"));
        $ic25$ = SubLObjectFactory.makeString("~a is not a metric tense operator.");
        $ic26$ = SubLObjectFactory.makeSymbol("S#13483", "CYC");
        $ic27$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("IntervalEndedByFn"));
        $ic28$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("IntervalStartedByFn"));
        $ic29$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("MtSpace"));
        $ic30$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("MtTimeWithGranularityDimFn"));
        $ic31$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Null-TimeParameter")));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0162.class
	Total time: 149 ms
	
	Decompiled with Procyon 0.5.32.
*/