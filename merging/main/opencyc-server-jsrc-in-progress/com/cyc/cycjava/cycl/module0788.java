package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0788 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0788";
    public static final String myFingerPrint = "df83752463d1c6567e59bb2a8dccb5faaa11983bd335fd5bb6c03dd07c77fd8b";
    private static SubLSymbol $g6307$;
    private static SubLSymbol $g6308$;
    private static SubLSymbol $g6309$;
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLList $ic11$;
    private static final SubLList $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLList $ic14$;
    private static final SubLList $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLList $ic18$;
    private static final SubLList $ic19$;
    private static final SubLList $ic20$;
    private static final SubLList $ic21$;
    private static final SubLList $ic22$;
    private static final SubLList $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLList $ic28$;
    private static final SubLList $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLInteger $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLInteger $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    
    public static SubLObject f50487(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)T;
        }
        assert NIL != Types.stringp(var1) : var1;
        final SubLObject var3 = f50488(var1, (SubLObject)UNPROVIDED);
        SubLObject var4 = (SubLObject)NIL;
        final SubLObject var5 = module0077.f5333(module0785.f50386(var3));
        SubLObject var6;
        SubLObject var7;
        SubLObject var8;
        SubLObject var10;
        SubLObject var9;
        SubLObject var11;
        SubLObject var12;
        SubLObject var13;
        SubLObject var14_15;
        SubLObject var14;
        SubLObject var15;
        SubLObject var16;
        SubLObject var17;
        SubLObject var18;
        SubLObject var19;
        SubLObject var20;
        for (var6 = module0032.f1741(var5), var7 = (SubLObject)NIL, var7 = module0032.f1742(var6, var5); NIL == module0032.f1744(var6, var7); var7 = module0032.f1743(var7)) {
            var8 = module0032.f1745(var6, var7);
            if (NIL != module0032.f1746(var7, var8)) {
                var9 = (var10 = var8);
                var11 = (SubLObject)NIL;
                var12 = var10;
                var13 = (SubLObject)NIL;
                var14_15 = (SubLObject)NIL;
                while (NIL != var12) {
                    cdestructuring_bind.destructuring_bind_must_consp(var12, var9, (SubLObject)$ic1$);
                    var14_15 = var12.first();
                    var12 = var12.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var12, var9, (SubLObject)$ic1$);
                    if (NIL == conses_high.member(var14_15, (SubLObject)$ic2$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        var13 = (SubLObject)T;
                    }
                    if (var14_15 == $ic3$) {
                        var11 = var12.first();
                    }
                    var12 = var12.rest();
                }
                if (NIL != var13 && NIL == var11) {
                    cdestructuring_bind.cdestructuring_bind_error(var9, (SubLObject)$ic1$);
                }
                var14 = cdestructuring_bind.property_list_member((SubLObject)$ic4$, var10);
                var15 = (SubLObject)((NIL != var14) ? conses_high.cadr(var14) : NIL);
                var16 = cdestructuring_bind.property_list_member((SubLObject)$ic5$, var10);
                var17 = (SubLObject)((NIL != var16) ? conses_high.cadr(var16) : NIL);
                var18 = cdestructuring_bind.property_list_member((SubLObject)$ic6$, var10);
                var19 = (SubLObject)((NIL != var18) ? conses_high.cadr(var18) : NIL);
                if ((NIL != var15 || NIL != var17 || NIL != var19) && NIL != f50489(var15, var2)) {
                    var20 = (SubLObject)ConsesLow.list(var15, var17, var19);
                    if (NIL == conses_high.member(var20, var4, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                        var4 = (SubLObject)ConsesLow.cons(var20, var4);
                    }
                }
            }
        }
        return var4;
    }
    
    public static SubLObject f50490(final SubLObject var1) {
        assert NIL != Types.stringp(var1) : var1;
        f50491();
        return module0785.f50412(var1, (SubLObject)NIL);
    }
    
    public static SubLObject f50492(final SubLObject var1) {
        assert NIL != Types.stringp(var1) : var1;
        final SubLObject var2 = f50488(var1, (SubLObject)UNPROVIDED);
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = module0077.f5333(module0785.f50386(var2));
        SubLObject var5;
        SubLObject var6;
        SubLObject var7;
        SubLObject var9;
        SubLObject var8;
        SubLObject var10;
        SubLObject var11;
        SubLObject var12;
        SubLObject var28_29;
        SubLObject var13;
        SubLObject var14;
        SubLObject var15;
        SubLObject var16;
        SubLObject var17;
        SubLObject var18;
        SubLObject var19;
        for (var5 = module0032.f1741(var4), var6 = (SubLObject)NIL, var6 = module0032.f1742(var5, var4); NIL == module0032.f1744(var5, var6); var6 = module0032.f1743(var6)) {
            var7 = module0032.f1745(var5, var6);
            if (NIL != module0032.f1746(var6, var7)) {
                var8 = (var9 = var7);
                var10 = (SubLObject)NIL;
                var11 = var9;
                var12 = (SubLObject)NIL;
                var28_29 = (SubLObject)NIL;
                while (NIL != var11) {
                    cdestructuring_bind.destructuring_bind_must_consp(var11, var8, (SubLObject)$ic7$);
                    var28_29 = var11.first();
                    var11 = var11.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var11, var8, (SubLObject)$ic7$);
                    if (NIL == conses_high.member(var28_29, (SubLObject)$ic8$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        var12 = (SubLObject)T;
                    }
                    if (var28_29 == $ic3$) {
                        var10 = var11.first();
                    }
                    var11 = var11.rest();
                }
                if (NIL != var12 && NIL == var10) {
                    cdestructuring_bind.cdestructuring_bind_error(var8, (SubLObject)$ic7$);
                }
                var13 = cdestructuring_bind.property_list_member((SubLObject)$ic9$, var9);
                var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
                var15 = cdestructuring_bind.property_list_member((SubLObject)$ic10$, var9);
                var16 = (SubLObject)((NIL != var15) ? conses_high.cadr(var15) : NIL);
                var17 = cdestructuring_bind.property_list_member((SubLObject)$ic5$, var9);
                var18 = (SubLObject)((NIL != var17) ? conses_high.cadr(var17) : NIL);
                var19 = (SubLObject)ConsesLow.list(var14, var16, var18);
                if (NIL == conses_high.member(var19, var3, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var3 = (SubLObject)ConsesLow.cons(var19, var3);
                }
            }
        }
        return var3;
    }
    
    public static SubLObject f50493(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)T;
        }
        assert NIL != Types.stringp(var1) : var1;
        final SubLObject var3 = f50488(var1, (SubLObject)UNPROVIDED);
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        final SubLObject var6 = module0077.f5333(module0785.f50386(var3));
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var11;
        SubLObject var10;
        SubLObject var12;
        SubLObject var13;
        SubLObject var14;
        SubLObject var42_43;
        SubLObject var15;
        SubLObject var16;
        SubLObject var17;
        SubLObject var18;
        for (var7 = module0032.f1741(var6), var8 = (SubLObject)NIL, var8 = module0032.f1742(var7, var6); NIL == module0032.f1744(var7, var8); var8 = module0032.f1743(var8)) {
            var9 = module0032.f1745(var7, var8);
            if (NIL != module0032.f1746(var8, var9)) {
                var10 = (var11 = var9);
                var12 = (SubLObject)NIL;
                var13 = var11;
                var14 = (SubLObject)NIL;
                var42_43 = (SubLObject)NIL;
                while (NIL != var13) {
                    cdestructuring_bind.destructuring_bind_must_consp(var13, var10, (SubLObject)$ic11$);
                    var42_43 = var13.first();
                    var13 = var13.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var13, var10, (SubLObject)$ic11$);
                    if (NIL == conses_high.member(var42_43, (SubLObject)$ic12$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        var14 = (SubLObject)T;
                    }
                    if (var42_43 == $ic3$) {
                        var12 = var13.first();
                    }
                    var13 = var13.rest();
                }
                if (NIL != var14 && NIL == var12) {
                    cdestructuring_bind.cdestructuring_bind_error(var10, (SubLObject)$ic11$);
                }
                var15 = cdestructuring_bind.property_list_member((SubLObject)$ic4$, var11);
                var16 = (SubLObject)((NIL != var15) ? conses_high.cadr(var15) : NIL);
                var17 = cdestructuring_bind.property_list_member((SubLObject)$ic13$, var11);
                var18 = (SubLObject)((NIL != var17) ? conses_high.cadr(var17) : NIL);
                if (NIL != var16 && NIL != f50489(var16, var2) && NIL == module0004.f104(var16, var4, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
                    var4 = (SubLObject)ConsesLow.cons(var16, var4);
                    var5 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var18), var5);
                }
            }
        }
        return Values.values(var4, var5);
    }
    
    public static SubLObject f50494(final SubLObject var1, final SubLObject var47, SubLObject var48, SubLObject var2) {
        if (var48 == UNPROVIDED) {
            var48 = module0584.$g4396$.getDynamicValue();
        }
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)T;
        }
        assert NIL != Types.stringp(var1) : var1;
        final SubLObject var49 = f50488(var1, (SubLObject)UNPROVIDED);
        SubLObject var50 = (SubLObject)NIL;
        SubLObject var51 = (SubLObject)NIL;
        final SubLObject var52 = module0077.f5333(module0785.f50386(var49));
        SubLObject var53;
        SubLObject var54;
        SubLObject var55;
        SubLObject var57;
        SubLObject var56;
        SubLObject var58;
        SubLObject var59;
        SubLObject var60;
        SubLObject var54_55;
        SubLObject var61;
        SubLObject var62;
        SubLObject var63;
        SubLObject var64;
        SubLObject var65;
        SubLObject var66;
        for (var53 = module0032.f1741(var52), var54 = (SubLObject)NIL, var54 = module0032.f1742(var53, var52); NIL == module0032.f1744(var53, var54); var54 = module0032.f1743(var54)) {
            var55 = module0032.f1745(var53, var54);
            if (NIL != module0032.f1746(var54, var55)) {
                var56 = (var57 = var55);
                var58 = (SubLObject)NIL;
                var59 = var57;
                var60 = (SubLObject)NIL;
                var54_55 = (SubLObject)NIL;
                while (NIL != var59) {
                    cdestructuring_bind.destructuring_bind_must_consp(var59, var56, (SubLObject)$ic14$);
                    var54_55 = var59.first();
                    var59 = var59.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var59, var56, (SubLObject)$ic14$);
                    if (NIL == conses_high.member(var54_55, (SubLObject)$ic15$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        var60 = (SubLObject)T;
                    }
                    if (var54_55 == $ic3$) {
                        var58 = var59.first();
                    }
                    var59 = var59.rest();
                }
                if (NIL != var60 && NIL == var58) {
                    cdestructuring_bind.cdestructuring_bind_error(var56, (SubLObject)$ic14$);
                }
                var61 = cdestructuring_bind.property_list_member((SubLObject)$ic4$, var57);
                var62 = (SubLObject)((NIL != var61) ? conses_high.cadr(var61) : NIL);
                var63 = cdestructuring_bind.property_list_member((SubLObject)$ic5$, var57);
                var64 = (SubLObject)((NIL != var63) ? conses_high.cadr(var63) : NIL);
                var65 = cdestructuring_bind.property_list_member((SubLObject)$ic13$, var57);
                var66 = (SubLObject)((NIL != var65) ? conses_high.cadr(var65) : NIL);
                if (NIL != module0731.f44702(var64, var47, var48) && NIL != f50489(var62, var2) && NIL == module0004.f104(var62, var50, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
                    var50 = (SubLObject)ConsesLow.cons(var62, var50);
                    var51 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var66), var51);
                }
            }
        }
        return Values.values(var50, var51);
    }
    
    public static SubLObject f50495(final SubLObject var1, final SubLObject var59, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)T;
        }
        assert NIL != Types.stringp(var1) : var1;
        assert NIL != module0731.f44656(var59, (SubLObject)UNPROVIDED) : var59;
        final SubLObject var60 = f50488(var1, (SubLObject)UNPROVIDED);
        SubLObject var61 = (SubLObject)NIL;
        SubLObject var62 = (SubLObject)NIL;
        final SubLObject var63 = module0077.f5333(module0785.f50386(var60));
        SubLObject var64;
        SubLObject var65;
        SubLObject var66;
        SubLObject var68;
        SubLObject var67;
        SubLObject var69;
        SubLObject var70;
        SubLObject var71;
        SubLObject var65_66;
        SubLObject var72;
        SubLObject var73;
        SubLObject var74;
        SubLObject var75;
        SubLObject var76;
        SubLObject var77;
        for (var64 = module0032.f1741(var63), var65 = (SubLObject)NIL, var65 = module0032.f1742(var64, var63); NIL == module0032.f1744(var64, var65); var65 = module0032.f1743(var65)) {
            var66 = module0032.f1745(var64, var65);
            if (NIL != module0032.f1746(var65, var66)) {
                var67 = (var68 = var66);
                var69 = (SubLObject)NIL;
                var70 = var68;
                var71 = (SubLObject)NIL;
                var65_66 = (SubLObject)NIL;
                while (NIL != var70) {
                    cdestructuring_bind.destructuring_bind_must_consp(var70, var67, (SubLObject)$ic14$);
                    var65_66 = var70.first();
                    var70 = var70.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var70, var67, (SubLObject)$ic14$);
                    if (NIL == conses_high.member(var65_66, (SubLObject)$ic15$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        var71 = (SubLObject)T;
                    }
                    if (var65_66 == $ic3$) {
                        var69 = var70.first();
                    }
                    var70 = var70.rest();
                }
                if (NIL != var71 && NIL == var69) {
                    cdestructuring_bind.cdestructuring_bind_error(var67, (SubLObject)$ic14$);
                }
                var72 = cdestructuring_bind.property_list_member((SubLObject)$ic4$, var68);
                var73 = (SubLObject)((NIL != var72) ? conses_high.cadr(var72) : NIL);
                var74 = cdestructuring_bind.property_list_member((SubLObject)$ic5$, var68);
                var75 = (SubLObject)((NIL != var74) ? conses_high.cadr(var74) : NIL);
                var76 = cdestructuring_bind.property_list_member((SubLObject)$ic13$, var68);
                var77 = (SubLObject)((NIL != var76) ? conses_high.cadr(var76) : NIL);
                if (NIL != module0731.f44713(module0731.f44691(var75), var59, (SubLObject)UNPROVIDED) && NIL != f50489(var73, var2) && NIL == module0004.f104(var73, var61, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
                    var61 = (SubLObject)ConsesLow.cons(var73, var61);
                    var62 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var77), var62);
                }
            }
        }
        return Values.values(var61, var62);
    }
    
    public static SubLObject f50496(final SubLObject var1, final SubLObject var70, SubLObject var48, SubLObject var2) {
        if (var48 == UNPROVIDED) {
            var48 = module0584.$g4396$.getDynamicValue();
        }
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)T;
        }
        assert NIL != Types.stringp(var1) : var1;
        assert NIL != Types.keywordp(var70) : var70;
        final SubLObject var71 = module0731.f44736(var70, var48);
        final SubLObject var72 = f50488(var1, (SubLObject)UNPROVIDED);
        SubLObject var73 = (SubLObject)NIL;
        SubLObject var74 = (SubLObject)NIL;
        final SubLObject var75 = module0077.f5333(module0785.f50386(var72));
        SubLObject var76;
        SubLObject var77;
        SubLObject var78;
        SubLObject var80;
        SubLObject var79;
        SubLObject var81;
        SubLObject var82;
        SubLObject var83;
        SubLObject var77_78;
        SubLObject var84;
        SubLObject var85;
        SubLObject var86;
        SubLObject var87;
        SubLObject var88;
        SubLObject var89;
        for (var76 = module0032.f1741(var75), var77 = (SubLObject)NIL, var77 = module0032.f1742(var76, var75); NIL == module0032.f1744(var76, var77); var77 = module0032.f1743(var77)) {
            var78 = module0032.f1745(var76, var77);
            if (NIL != module0032.f1746(var77, var78)) {
                var79 = (var80 = var78);
                var81 = (SubLObject)NIL;
                var82 = var80;
                var83 = (SubLObject)NIL;
                var77_78 = (SubLObject)NIL;
                while (NIL != var82) {
                    cdestructuring_bind.destructuring_bind_must_consp(var82, var79, (SubLObject)$ic14$);
                    var77_78 = var82.first();
                    var82 = var82.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var82, var79, (SubLObject)$ic14$);
                    if (NIL == conses_high.member(var77_78, (SubLObject)$ic15$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        var83 = (SubLObject)T;
                    }
                    if (var77_78 == $ic3$) {
                        var81 = var82.first();
                    }
                    var82 = var82.rest();
                }
                if (NIL != var83 && NIL == var81) {
                    cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)$ic14$);
                }
                var84 = cdestructuring_bind.property_list_member((SubLObject)$ic4$, var80);
                var85 = (SubLObject)((NIL != var84) ? conses_high.cadr(var84) : NIL);
                var86 = cdestructuring_bind.property_list_member((SubLObject)$ic5$, var80);
                var87 = (SubLObject)((NIL != var86) ? conses_high.cadr(var86) : NIL);
                var88 = cdestructuring_bind.property_list_member((SubLObject)$ic13$, var80);
                var89 = (SubLObject)((NIL != var88) ? conses_high.cadr(var88) : NIL);
                if (NIL != module0004.f104(module0731.f44691(var87), var71, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED) && NIL != f50489(var85, var2) && NIL == module0004.f104(var85, var73, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
                    var73 = (SubLObject)ConsesLow.cons(var85, var73);
                    var74 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var89), var74);
                }
            }
        }
        return Values.values(var73, var74);
    }
    
    public static SubLObject f50497(final SubLObject var1) {
        assert NIL != Types.stringp(var1) : var1;
        final SubLObject var2 = f50488(var1, (SubLObject)UNPROVIDED);
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = module0077.f5333(module0785.f50386(var2));
        SubLObject var5;
        SubLObject var6;
        SubLObject var7;
        SubLObject var9;
        SubLObject var8;
        SubLObject var10;
        SubLObject var11;
        SubLObject var12;
        SubLObject var87_88;
        SubLObject var13;
        SubLObject var15;
        SubLObject var14;
        for (var5 = module0032.f1741(var4), var6 = (SubLObject)NIL, var6 = module0032.f1742(var5, var4); NIL == module0032.f1744(var5, var6); var6 = module0032.f1743(var6)) {
            var7 = module0032.f1745(var5, var6);
            if (NIL != module0032.f1746(var6, var7)) {
                var8 = (var9 = var7);
                var10 = (SubLObject)NIL;
                var11 = var9;
                var12 = (SubLObject)NIL;
                var87_88 = (SubLObject)NIL;
                while (NIL != var11) {
                    cdestructuring_bind.destructuring_bind_must_consp(var11, var8, (SubLObject)$ic18$);
                    var87_88 = var11.first();
                    var11 = var11.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var11, var8, (SubLObject)$ic18$);
                    if (NIL == conses_high.member(var87_88, (SubLObject)$ic19$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        var12 = (SubLObject)T;
                    }
                    if (var87_88 == $ic3$) {
                        var10 = var11.first();
                    }
                    var11 = var11.rest();
                }
                if (NIL != var12 && NIL == var10) {
                    cdestructuring_bind.cdestructuring_bind_error(var8, (SubLObject)$ic18$);
                }
                var13 = cdestructuring_bind.property_list_member((SubLObject)$ic6$, var9);
                var14 = (var15 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL));
                if (NIL == conses_high.member(var15, var3, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var3 = (SubLObject)ConsesLow.cons(var15, var3);
                }
            }
        }
        return var3;
    }
    
    public static SubLObject f50498(final SubLObject var1, final SubLObject var59) {
        assert NIL != Types.stringp(var1) : var1;
        assert NIL != module0731.f44656(var59, (SubLObject)UNPROVIDED) : var59;
        final SubLObject var60 = f50488(var1, (SubLObject)UNPROVIDED);
        SubLObject var61 = (SubLObject)NIL;
        final SubLObject var62 = module0077.f5333(module0785.f50386(var60));
        SubLObject var63;
        SubLObject var64;
        SubLObject var65;
        SubLObject var67;
        SubLObject var66;
        SubLObject var68;
        SubLObject var69;
        SubLObject var70;
        SubLObject var96_97;
        SubLObject var71;
        SubLObject var72;
        SubLObject var73;
        SubLObject var74;
        for (var63 = module0032.f1741(var62), var64 = (SubLObject)NIL, var64 = module0032.f1742(var63, var62); NIL == module0032.f1744(var63, var64); var64 = module0032.f1743(var64)) {
            var65 = module0032.f1745(var63, var64);
            if (NIL != module0032.f1746(var64, var65) && NIL != module0785.f50391(var65)) {
                var66 = (var67 = var65);
                var68 = (SubLObject)NIL;
                var69 = var67;
                var70 = (SubLObject)NIL;
                var96_97 = (SubLObject)NIL;
                while (NIL != var69) {
                    cdestructuring_bind.destructuring_bind_must_consp(var69, var66, (SubLObject)$ic20$);
                    var96_97 = var69.first();
                    var69 = var69.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var69, var66, (SubLObject)$ic20$);
                    if (NIL == conses_high.member(var96_97, (SubLObject)$ic21$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        var70 = (SubLObject)T;
                    }
                    if (var96_97 == $ic3$) {
                        var68 = var69.first();
                    }
                    var69 = var69.rest();
                }
                if (NIL != var70 && NIL == var68) {
                    cdestructuring_bind.cdestructuring_bind_error(var66, (SubLObject)$ic20$);
                }
                var71 = cdestructuring_bind.property_list_member((SubLObject)$ic6$, var67);
                var72 = (SubLObject)((NIL != var71) ? conses_high.cadr(var71) : NIL);
                var73 = cdestructuring_bind.property_list_member((SubLObject)$ic5$, var67);
                var74 = (SubLObject)((NIL != var73) ? conses_high.cadr(var73) : NIL);
                if (NIL != module0731.f44713(module0731.f44691(var74), var59, (SubLObject)UNPROVIDED)) {
                    var61 = module0035.f2314(var61, var72, var74, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)EQUAL));
                }
            }
        }
        return Values.values(module0035.f2062(var61), module0035.f2319(var61));
    }
    
    public static SubLObject f50499(final SubLObject var1, final SubLObject var70, SubLObject var48) {
        if (var48 == UNPROVIDED) {
            var48 = module0584.$g4396$.getDynamicValue();
        }
        assert NIL != Types.stringp(var1) : var1;
        assert NIL != Types.keywordp(var70) : var70;
        final SubLObject var71 = module0731.f44736(var70, var48);
        final SubLObject var72 = f50488(var1, (SubLObject)UNPROVIDED);
        SubLObject var73 = (SubLObject)NIL;
        final SubLObject var74 = module0077.f5333(module0785.f50386(var72));
        SubLObject var75;
        SubLObject var76;
        SubLObject var77;
        SubLObject var79;
        SubLObject var78;
        SubLObject var80;
        SubLObject var81;
        SubLObject var82;
        SubLObject var106_107;
        SubLObject var83;
        SubLObject var84;
        SubLObject var85;
        SubLObject var86;
        SubLObject var87;
        SubLObject var88;
        SubLObject var89;
        for (var75 = module0032.f1741(var74), var76 = (SubLObject)NIL, var76 = module0032.f1742(var75, var74); NIL == module0032.f1744(var75, var76); var76 = module0032.f1743(var76)) {
            var77 = module0032.f1745(var75, var76);
            if (NIL != module0032.f1746(var76, var77) && NIL != module0785.f50391(var77)) {
                var78 = (var79 = var77);
                var80 = (SubLObject)NIL;
                var81 = var79;
                var82 = (SubLObject)NIL;
                var106_107 = (SubLObject)NIL;
                while (NIL != var81) {
                    cdestructuring_bind.destructuring_bind_must_consp(var81, var78, (SubLObject)$ic22$);
                    var106_107 = var81.first();
                    var81 = var81.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var81, var78, (SubLObject)$ic22$);
                    if (NIL == conses_high.member(var106_107, (SubLObject)$ic23$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        var82 = (SubLObject)T;
                    }
                    if (var106_107 == $ic3$) {
                        var80 = var81.first();
                    }
                    var81 = var81.rest();
                }
                if (NIL != var82 && NIL == var80) {
                    cdestructuring_bind.cdestructuring_bind_error(var78, (SubLObject)$ic22$);
                }
                var83 = cdestructuring_bind.property_list_member((SubLObject)$ic6$, var79);
                var84 = (SubLObject)((NIL != var83) ? conses_high.cadr(var83) : NIL);
                var85 = cdestructuring_bind.property_list_member((SubLObject)$ic5$, var79);
                var86 = (SubLObject)((NIL != var85) ? conses_high.cadr(var85) : NIL);
                var87 = cdestructuring_bind.property_list_member((SubLObject)$ic13$, var79);
                var88 = (SubLObject)((NIL != var87) ? conses_high.cadr(var87) : NIL);
                if (NIL != module0004.f104(module0731.f44691(var86), var71, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED)) {
                    var89 = (SubLObject)ConsesLow.list(var84, var86, var88);
                    if (NIL == conses_high.member(var89, var73, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                        var73 = (SubLObject)ConsesLow.cons(var89, var73);
                    }
                }
            }
        }
        return Values.values(Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic24$), var73), Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic25$), var73), Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic26$), var73));
    }
    
    public static SubLObject f50500(final SubLObject var1, final SubLObject var111) {
        assert NIL != Types.stringp(var1) : var1;
        assert NIL != module0731.f44690(var111, (SubLObject)UNPROVIDED) : var111;
        final SubLObject var112 = f50488(var1, (SubLObject)UNPROVIDED);
        SubLObject var113 = (SubLObject)NIL;
        final SubLObject var114 = module0077.f5333(module0785.f50386(var112));
        SubLObject var115;
        SubLObject var116;
        SubLObject var117;
        SubLObject var119;
        SubLObject var118;
        SubLObject var120;
        SubLObject var121;
        SubLObject var122;
        SubLObject var117_118;
        SubLObject var123;
        SubLObject var124;
        SubLObject var125;
        SubLObject var126;
        SubLObject var127;
        for (var115 = module0032.f1741(var114), var116 = (SubLObject)NIL, var116 = module0032.f1742(var115, var114); NIL == module0032.f1744(var115, var116); var116 = module0032.f1743(var116)) {
            var117 = module0032.f1745(var115, var116);
            if (NIL != module0032.f1746(var116, var117) && NIL != module0785.f50391(var117)) {
                var118 = (var119 = var117);
                var120 = (SubLObject)NIL;
                var121 = var119;
                var122 = (SubLObject)NIL;
                var117_118 = (SubLObject)NIL;
                while (NIL != var121) {
                    cdestructuring_bind.destructuring_bind_must_consp(var121, var118, (SubLObject)$ic20$);
                    var117_118 = var121.first();
                    var121 = var121.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var121, var118, (SubLObject)$ic20$);
                    if (NIL == conses_high.member(var117_118, (SubLObject)$ic21$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        var122 = (SubLObject)T;
                    }
                    if (var117_118 == $ic3$) {
                        var120 = var121.first();
                    }
                    var121 = var121.rest();
                }
                if (NIL != var122 && NIL == var120) {
                    cdestructuring_bind.cdestructuring_bind_error(var118, (SubLObject)$ic20$);
                }
                var123 = cdestructuring_bind.property_list_member((SubLObject)$ic6$, var119);
                var124 = (SubLObject)((NIL != var123) ? conses_high.cadr(var123) : NIL);
                var125 = cdestructuring_bind.property_list_member((SubLObject)$ic5$, var119);
                var126 = (SubLObject)((NIL != var125) ? conses_high.cadr(var125) : NIL);
                if (NIL != module0731.f44702(var126, var111, (SubLObject)UNPROVIDED)) {
                    var127 = var124;
                    if (NIL == conses_high.member(var127, var113, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                        var113 = (SubLObject)ConsesLow.cons(var127, var113);
                    }
                }
            }
        }
        return var113;
    }
    
    public static SubLObject f50501(final SubLObject var1) {
        assert NIL != Types.stringp(var1) : var1;
        final SubLObject var2 = f50488(var1, (SubLObject)UNPROVIDED);
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = module0077.f5333(module0785.f50386(var2));
        SubLObject var5;
        SubLObject var6;
        SubLObject var7;
        SubLObject var9;
        SubLObject var8;
        SubLObject var10;
        SubLObject var11;
        SubLObject var12;
        SubLObject var126_127;
        SubLObject var13;
        SubLObject var15;
        SubLObject var14;
        for (var5 = module0032.f1741(var4), var6 = (SubLObject)NIL, var6 = module0032.f1742(var5, var4); NIL == module0032.f1744(var5, var6); var6 = module0032.f1743(var6)) {
            var7 = module0032.f1745(var5, var6);
            if (NIL != module0032.f1746(var6, var7) && NIL != module0785.f50391(var7)) {
                var8 = (var9 = var7);
                var10 = (SubLObject)NIL;
                var11 = var9;
                var12 = (SubLObject)NIL;
                var126_127 = (SubLObject)NIL;
                while (NIL != var11) {
                    cdestructuring_bind.destructuring_bind_must_consp(var11, var8, (SubLObject)$ic28$);
                    var126_127 = var11.first();
                    var11 = var11.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var11, var8, (SubLObject)$ic28$);
                    if (NIL == conses_high.member(var126_127, (SubLObject)$ic29$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        var12 = (SubLObject)T;
                    }
                    if (var126_127 == $ic3$) {
                        var10 = var11.first();
                    }
                    var11 = var11.rest();
                }
                if (NIL != var12 && NIL == var10) {
                    cdestructuring_bind.cdestructuring_bind_error(var8, (SubLObject)$ic28$);
                }
                var13 = cdestructuring_bind.property_list_member((SubLObject)$ic5$, var9);
                var14 = (var15 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL));
                if (NIL == conses_high.member(var15, var3, Symbols.symbol_function((SubLObject)EQ), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var3 = (SubLObject)ConsesLow.cons(var15, var3);
                }
            }
        }
        return var3;
    }
    
    public static SubLObject f50502(final SubLObject var1, final SubLObject var129) {
        assert NIL != Types.stringp(var1) : var1;
        assert NIL != module0731.f44719(var129) : var129;
        final SubLObject var130 = f50488(var1, (SubLObject)UNPROVIDED);
        SubLObject var131 = (SubLObject)NIL;
        final SubLObject var132 = module0077.f5333(module0785.f50386(var130));
        SubLObject var133;
        SubLObject var134;
        SubLObject var135;
        SubLObject var137;
        SubLObject var136;
        SubLObject var138;
        SubLObject var139;
        SubLObject var140;
        SubLObject var135_136;
        SubLObject var141;
        SubLObject var142;
        SubLObject var143;
        SubLObject var144;
        SubLObject var145;
        for (var133 = module0032.f1741(var132), var134 = (SubLObject)NIL, var134 = module0032.f1742(var133, var132); NIL == module0032.f1744(var133, var134); var134 = module0032.f1743(var134)) {
            var135 = module0032.f1745(var133, var134);
            if (NIL != module0032.f1746(var134, var135) && NIL != module0785.f50391(var135)) {
                var136 = (var137 = var135);
                var138 = (SubLObject)NIL;
                var139 = var137;
                var140 = (SubLObject)NIL;
                var135_136 = (SubLObject)NIL;
                while (NIL != var139) {
                    cdestructuring_bind.destructuring_bind_must_consp(var139, var136, (SubLObject)$ic20$);
                    var135_136 = var139.first();
                    var139 = var139.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var139, var136, (SubLObject)$ic20$);
                    if (NIL == conses_high.member(var135_136, (SubLObject)$ic21$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        var140 = (SubLObject)T;
                    }
                    if (var135_136 == $ic3$) {
                        var138 = var139.first();
                    }
                    var139 = var139.rest();
                }
                if (NIL != var140 && NIL == var138) {
                    cdestructuring_bind.cdestructuring_bind_error(var136, (SubLObject)$ic20$);
                }
                var141 = cdestructuring_bind.property_list_member((SubLObject)$ic6$, var137);
                var142 = (SubLObject)((NIL != var141) ? conses_high.cadr(var141) : NIL);
                var143 = cdestructuring_bind.property_list_member((SubLObject)$ic5$, var137);
                var144 = (SubLObject)((NIL != var143) ? conses_high.cadr(var143) : NIL);
                if (NIL != module0279.f18551(var142, var129, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var145 = var144;
                    if (NIL == conses_high.member(var145, var131, Symbols.symbol_function((SubLObject)EQ), Symbols.symbol_function((SubLObject)IDENTITY))) {
                        var131 = (SubLObject)ConsesLow.cons(var145, var131);
                    }
                }
            }
        }
        return var131;
    }
    
    public static SubLObject f50503(final SubLObject var1) {
        assert NIL != Types.stringp(var1) : var1;
        final SubLObject var2 = f50501(var1);
        return module0035.f2081(Symbols.symbol_function((SubLObject)$ic31$), var2, Symbols.symbol_function((SubLObject)EQ));
    }
    
    public static SubLObject f50504(final SubLObject var1, final SubLObject var129) {
        assert NIL != Types.stringp(var1) : var1;
        assert NIL != module0731.f44719(var129) : var129;
        final SubLObject var130 = f50502(var1, var129);
        return module0035.f2081(Symbols.symbol_function((SubLObject)$ic31$), var130, Symbols.symbol_function((SubLObject)EQ));
    }
    
    public static SubLObject f50505() {
        final SubLObject var140 = $g6307$.getGlobalValue();
        if (NIL != var140) {
            module0034.f1818(var140);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50506(final SubLObject var1, final SubLObject var59) {
        return module0034.f1829($g6307$.getGlobalValue(), (SubLObject)ConsesLow.list(var1, var59), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f50507(final SubLObject var1, final SubLObject var59) {
        assert NIL != Types.stringp(var1) : var1;
        assert NIL != module0731.f44656(var59, (SubLObject)UNPROVIDED) : var59;
        final SubLObject var60 = f50488(var1, (SubLObject)UNPROVIDED);
        final SubLObject var61 = module0077.f5333(module0785.f50386(var60));
        SubLObject var62;
        SubLObject var63;
        SubLObject var64;
        SubLObject var66;
        SubLObject var65;
        SubLObject var67;
        SubLObject var68;
        SubLObject var69;
        SubLObject var146_147;
        SubLObject var70;
        SubLObject var71;
        for (var62 = module0032.f1741(var61), var63 = (SubLObject)NIL, var63 = module0032.f1742(var62, var61); NIL == module0032.f1744(var62, var63); var63 = module0032.f1743(var63)) {
            var64 = module0032.f1745(var62, var63);
            if (NIL != module0032.f1746(var63, var64)) {
                var65 = (var66 = var64);
                var67 = (SubLObject)NIL;
                var68 = var66;
                var69 = (SubLObject)NIL;
                var146_147 = (SubLObject)NIL;
                while (NIL != var68) {
                    cdestructuring_bind.destructuring_bind_must_consp(var68, var65, (SubLObject)$ic28$);
                    var146_147 = var68.first();
                    var68 = var68.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var68, var65, (SubLObject)$ic28$);
                    if (NIL == conses_high.member(var146_147, (SubLObject)$ic29$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        var69 = (SubLObject)T;
                    }
                    if (var146_147 == $ic3$) {
                        var67 = var68.first();
                    }
                    var68 = var68.rest();
                }
                if (NIL != var69 && NIL == var67) {
                    cdestructuring_bind.cdestructuring_bind_error(var65, (SubLObject)$ic28$);
                }
                var70 = cdestructuring_bind.property_list_member((SubLObject)$ic5$, var66);
                var71 = (SubLObject)((NIL != var70) ? conses_high.cadr(var70) : NIL);
                if (NIL != module0731.f44713(module0731.f44691(var71), var59, (SubLObject)UNPROVIDED)) {
                    return (SubLObject)T;
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50508(final SubLObject var1, final SubLObject var59) {
        SubLObject var60 = $g6307$.getGlobalValue();
        if (NIL == var60) {
            var60 = module0034.f1934((SubLObject)$ic32$, (SubLObject)$ic33$, (SubLObject)$ic34$, (SubLObject)EQUAL, (SubLObject)TWO_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        final SubLObject var61 = module0034.f1782(var1, var59);
        final SubLObject var62 = module0034.f1814(var60, var61, (SubLObject)UNPROVIDED);
        if (var62 != $ic35$) {
            SubLObject var63 = var62;
            SubLObject var64 = (SubLObject)NIL;
            var64 = var63.first();
            while (NIL != var63) {
                SubLObject var65 = var64.first();
                final SubLObject var66 = conses_high.second(var64);
                if (var1.equal(var65.first())) {
                    var65 = var65.rest();
                    if (NIL != var65 && NIL == var65.rest() && var59.equal(var65.first())) {
                        return module0034.f1959(var66);
                    }
                }
                var63 = var63.rest();
                var64 = var63.first();
            }
        }
        final SubLObject var67 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f50507(var1, var59)));
        module0034.f1836(var60, var61, var62, var67, (SubLObject)ConsesLow.list(var1, var59));
        return module0034.f1959(var67);
    }
    
    public static SubLObject f50509() {
        final SubLObject var140 = $g6308$.getGlobalValue();
        if (NIL != var140) {
            module0034.f1818(var140);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50510(final SubLObject var1, SubLObject var157) {
        if (var157 == UNPROVIDED) {
            var157 = module0584.$g4438$.getDynamicValue();
        }
        return module0034.f1829($g6308$.getGlobalValue(), (SubLObject)ConsesLow.list(var1, var157), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f50511(final SubLObject var1, final SubLObject var157) {
        final SubLThread var158 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var1) : var1;
        f50491();
        final SubLObject var159 = module0785.f50383(var1);
        final SubLObject var160 = module0584.$g4438$.currentBinding(var158);
        try {
            module0584.$g4438$.bind(var157, var158);
            module0785.f50395(var159, (SubLObject)UNPROVIDED);
        }
        finally {
            module0584.$g4438$.rebind(var160, var158);
        }
        return var159;
    }
    
    public static SubLObject f50488(final SubLObject var1, SubLObject var157) {
        if (var157 == UNPROVIDED) {
            var157 = module0584.$g4438$.getDynamicValue();
        }
        SubLObject var158 = $g6308$.getGlobalValue();
        if (NIL == var158) {
            var158 = module0034.f1934((SubLObject)$ic36$, (SubLObject)$ic37$, (SubLObject)$ic38$, (SubLObject)EQUAL, (SubLObject)TWO_INTEGER, (SubLObject)ZERO_INTEGER);
            module0034.f1940((SubLObject)$ic39$);
        }
        final SubLObject var159 = module0034.f1782(var1, var157);
        final SubLObject var160 = module0034.f1814(var158, var159, (SubLObject)UNPROVIDED);
        if (var160 != $ic35$) {
            SubLObject var161 = var160;
            SubLObject var162 = (SubLObject)NIL;
            var162 = var161.first();
            while (NIL != var161) {
                SubLObject var163 = var162.first();
                final SubLObject var164 = conses_high.second(var162);
                if (var1.equal(var163.first())) {
                    var163 = var163.rest();
                    if (NIL != var163 && NIL == var163.rest() && var157.equal(var163.first())) {
                        return module0034.f1959(var164);
                    }
                }
                var161 = var161.rest();
                var162 = var161.first();
            }
        }
        final SubLObject var165 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f50511(var1, var157)));
        module0034.f1836(var158, var159, var160, var165, (SubLObject)ConsesLow.list(var1, var157));
        return module0034.f1959(var165);
    }
    
    public static SubLObject f50491() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50512() {
        return $g6309$.getGlobalValue();
    }
    
    public static SubLObject f50513() {
        final SubLThread var158 = SubLProcess.currentSubLThread();
        final SubLObject var159 = module0012.$silent_progressP$.currentBinding(var158);
        try {
            module0012.$silent_progressP$.bind((SubLObject)T, var158);
            module0787.f50474();
            module0787.f50476();
            module0786.f50439();
            module0786.f50441();
        }
        finally {
            module0012.$silent_progressP$.rebind(var159, var158);
        }
        $g6309$.setGlobalValue((SubLObject)T);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50514() {
        $g6309$.setGlobalValue((SubLObject)NIL);
        f50505();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50489(final SubLObject var160, final SubLObject var2) {
        return (SubLObject)makeBoolean(NIL == var2 || NIL == f50515(var160));
    }
    
    public static SubLObject f50515(final SubLObject var161) {
        return module0205.f13145(Symbols.symbol_function((SubLObject)$ic41$), var161, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f50516(final SubLObject var161) {
        return (SubLObject)makeBoolean(var161 == $ic42$ || var161 == $ic43$);
    }
    
    public static SubLObject f50517() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0788", "f50487", "S#55040", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0788", "f50490", "S#49555", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0788", "f50492", "S#55041", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0788", "f50493", "DENOTS-OF-COMPLEX-WORD-STRING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0788", "f50494", "S#48879", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0788", "f50495", "S#48881", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0788", "f50496", "S#48883", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0788", "f50497", "S#48744", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0788", "f50498", "S#48851", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0788", "f50499", "S#48855", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0788", "f50500", "S#48853", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0788", "f50501", "S#49153", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0788", "f50502", "S#48852", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0788", "f50503", "S#48860", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0788", "f50504", "S#48864", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0788", "f50505", "S#55042", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0788", "f50506", "S#55043", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0788", "f50507", "S#55044", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0788", "f50508", "S#48862", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0788", "f50509", "S#55045", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0788", "f50510", "S#55046", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0788", "f50511", "S#55047", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0788", "f50488", "S#55048", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0788", "f50491", "S#54932", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0788", "f50512", "S#55049", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0788", "f50513", "S#55050", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0788", "f50514", "S#49405", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0788", "f50489", "S#55051", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0788", "f50515", "S#55052", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0788", "f50516", "S#55053", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50518() {
        $g6307$ = SubLFiles.deflexical("S#55054", (SubLObject)NIL);
        $g6308$ = SubLFiles.deflexical("S#55055", (SubLObject)NIL);
        $g6309$ = SubLFiles.deflexical("S#55056", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic40$)) ? $g6309$.getGlobalValue() : NIL));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50519() {
        module0034.f1909((SubLObject)$ic32$);
        module0034.f1909((SubLObject)$ic36$);
        module0003.f57((SubLObject)$ic40$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f50517();
    }
    
    public void initializeVariables() {
        f50518();
    }
    
    public void runTopLevelForms() {
        f50519();
    }
    
    static {
        me = (SubLFile)new module0788();
        $g6307$ = null;
        $g6308$ = null;
        $g6309$ = null;
        $ic0$ = makeSymbol("STRINGP");
        $ic1$ = ConsesLow.list((SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#54984", "CYC"), (SubLObject)makeSymbol("S#54985", "CYC"), (SubLObject)makeSymbol("S#54807", "CYC"));
        $ic2$ = ConsesLow.list((SubLObject)makeKeyword("WORD-DENOT"), (SubLObject)makeKeyword("WORD-POS-PRED"), (SubLObject)makeKeyword("WORD-UNIT"));
        $ic3$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic4$ = makeKeyword("WORD-DENOT");
        $ic5$ = makeKeyword("WORD-POS-PRED");
        $ic6$ = makeKeyword("WORD-UNIT");
        $ic7$ = ConsesLow.list((SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#53521", "CYC"), (SubLObject)makeSymbol("S#55057", "CYC"), (SubLObject)makeSymbol("S#54985", "CYC"));
        $ic8$ = ConsesLow.list((SubLObject)makeKeyword("BASE"), (SubLObject)makeKeyword("AFFIX"), (SubLObject)makeKeyword("WORD-POS-PRED"));
        $ic9$ = makeKeyword("BASE");
        $ic10$ = makeKeyword("AFFIX");
        $ic11$ = ConsesLow.list((SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#54984", "CYC"), (SubLObject)makeSymbol("S#55058", "CYC"));
        $ic12$ = ConsesLow.list((SubLObject)makeKeyword("WORD-DENOT"), (SubLObject)makeKeyword("SEM-PRED"));
        $ic13$ = makeKeyword("SEM-PRED");
        $ic14$ = ConsesLow.list((SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#54984", "CYC"), (SubLObject)makeSymbol("S#54985", "CYC"), (SubLObject)makeSymbol("S#55058", "CYC"));
        $ic15$ = ConsesLow.list((SubLObject)makeKeyword("WORD-DENOT"), (SubLObject)makeKeyword("WORD-POS-PRED"), (SubLObject)makeKeyword("SEM-PRED"));
        $ic16$ = makeSymbol("S#49076", "CYC");
        $ic17$ = makeSymbol("KEYWORDP");
        $ic18$ = ConsesLow.list((SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#54807", "CYC"));
        $ic19$ = ConsesLow.list((SubLObject)makeKeyword("WORD-UNIT"));
        $ic20$ = ConsesLow.list((SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#54807", "CYC"), (SubLObject)makeSymbol("S#54985", "CYC"));
        $ic21$ = ConsesLow.list((SubLObject)makeKeyword("WORD-UNIT"), (SubLObject)makeKeyword("WORD-POS-PRED"));
        $ic22$ = ConsesLow.list((SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#54807", "CYC"), (SubLObject)makeSymbol("S#54985", "CYC"), (SubLObject)makeSymbol("S#55058", "CYC"));
        $ic23$ = ConsesLow.list((SubLObject)makeKeyword("WORD-UNIT"), (SubLObject)makeKeyword("WORD-POS-PRED"), (SubLObject)makeKeyword("SEM-PRED"));
        $ic24$ = makeSymbol("FIRST");
        $ic25$ = makeSymbol("SECOND");
        $ic26$ = makeSymbol("THIRD");
        $ic27$ = makeSymbol("S#39429", "CYC");
        $ic28$ = ConsesLow.list((SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#54985", "CYC"));
        $ic29$ = ConsesLow.list((SubLObject)makeKeyword("WORD-POS-PRED"));
        $ic30$ = makeSymbol("S#48745", "CYC");
        $ic31$ = makeSymbol("S#48575", "CYC");
        $ic32$ = makeSymbol("S#48862", "CYC");
        $ic33$ = makeSymbol("S#55054", "CYC");
        $ic34$ = makeInteger(200);
        $ic35$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic36$ = makeSymbol("S#55048", "CYC");
        $ic37$ = makeSymbol("S#55055", "CYC");
        $ic38$ = makeInteger(1000);
        $ic39$ = makeSymbol("S#55045", "CYC");
        $ic40$ = makeSymbol("S#55056", "CYC");
        $ic41$ = makeSymbol("S#55053", "CYC");
        $ic42$ = makeKeyword("APPLY-AFFIX");
        $ic43$ = makeKeyword("DENOT-OF");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 319 ms
	
	Decompiled with Procyon 0.5.32.
*/