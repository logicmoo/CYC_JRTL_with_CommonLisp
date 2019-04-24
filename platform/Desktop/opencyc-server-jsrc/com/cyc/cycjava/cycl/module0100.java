package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0100 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0100";
    public static final String myFingerPrint = "15d1ce9bccb9064896a9ac26a2f01669fa46cc595e19257cdbed8de081c81df5";
    private static SubLSymbol $g1335$;
    private static SubLSymbol $g1336$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLList $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
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
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLList $ic35$;
    private static final SubLString $ic36$;
    private static final SubLList $ic37$;
    private static final SubLString $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLList $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLList $ic43$;
    private static final SubLString $ic44$;
    private static final SubLString $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLList $ic47$;
    private static final SubLString $ic48$;
    private static final SubLString $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLList $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLList $ic53$;
    private static final SubLString $ic54$;
    private static final SubLList $ic55$;
    private static final SubLString $ic56$;
    private static final SubLString $ic57$;
    private static final SubLString $ic58$;
    
    public static SubLObject f7254(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == module0100.UNPROVIDED) {
            var3 = Symbols.symbol_function((SubLObject)module0100.EQL);
        }
        SubLObject var4 = (SubLObject)module0100.NIL;
        SubLObject var5 = var1;
        SubLObject var6 = (SubLObject)module0100.NIL;
        var6 = var5.first();
        while (module0100.NIL != var5) {
            var4 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6), (SubLObject)module0100.NIL), var4);
            var5 = var5.rest();
            var6 = var5.first();
        }
        var5 = var2;
        SubLObject var7 = (SubLObject)module0100.NIL;
        var7 = var5.first();
        while (module0100.NIL != var5) {
            final SubLObject var8 = f7255(var7, var1, var3);
            final SubLObject var9 = f7256(var8, var4, var3);
            SubLObject var10 = (SubLObject)module0100.NIL;
            if (module0100.NIL != module0035.f1997(var9)) {
                var10 = var9.first();
            }
            else {
                final SubLObject var11 = f7257(var9);
                var4 = conses_high.set_difference(var4, var9, (SubLObject)module0100.UNPROVIDED, (SubLObject)module0100.UNPROVIDED);
                var4 = (SubLObject)ConsesLow.cons(var11, var4);
                var10 = var11;
            }
            SubLObject var13;
            final SubLObject var12 = var13 = var10;
            SubLObject var14 = (SubLObject)module0100.NIL;
            SubLObject var15 = (SubLObject)module0100.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0100.$ic0$);
            var14 = var13.first();
            var13 = var13.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0100.$ic0$);
            var15 = var13.first();
            var13 = var13.rest();
            if (module0100.NIL == var13) {
                ConsesLow.set_nth((SubLObject)module0100.ONE_INTEGER, var10, (SubLObject)ConsesLow.cons(var7, var15));
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)module0100.$ic0$);
            }
            var5 = var5.rest();
            var7 = var5.first();
        }
        SubLObject var16 = (SubLObject)module0100.NIL;
        SubLObject var17 = (SubLObject)module0100.NIL;
        SubLObject var18 = (SubLObject)module0100.NIL;
        SubLObject var19 = var4;
        SubLObject var10 = (SubLObject)module0100.NIL;
        var10 = var19.first();
        while (module0100.NIL != var19) {
            SubLObject var21;
            final SubLObject var20 = var21 = var10;
            SubLObject var14 = (SubLObject)module0100.NIL;
            SubLObject var15 = (SubLObject)module0100.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0100.$ic0$);
            var14 = var21.first();
            var21 = var21.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0100.$ic0$);
            var15 = var21.first();
            var21 = var21.rest();
            if (module0100.NIL == var21) {
                if (module0100.NIL != module0035.f1997(var14)) {
                    if (module0100.NIL == var15) {
                        var18 = (SubLObject)ConsesLow.cons(var10, var18);
                    }
                    else {
                        var17 = (SubLObject)ConsesLow.cons(var10, var17);
                    }
                }
                else {
                    var16 = (SubLObject)ConsesLow.cons(var10, var16);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)module0100.$ic0$);
            }
            var19 = var19.rest();
            var10 = var19.first();
        }
        if (module0100.ONE_INTEGER.numE(Sequences.length(var1))) {
            var16 = var17;
            var17 = (SubLObject)module0100.NIL;
        }
        var16 = f7258(var16, var1, var2, var3);
        var17 = f7259(var17, var1, var2, var3);
        var18 = f7260(var18, var1, var3);
        return Values.values(var16, var17, var18);
    }
    
    public static SubLObject f7255(final SubLObject var7, final SubLObject var21, SubLObject var3) {
        if (var3 == module0100.UNPROVIDED) {
            var3 = Symbols.symbol_function((SubLObject)module0100.EQL);
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        SubLObject var23 = (SubLObject)module0100.NIL;
        final SubLObject var24 = module0100.$g1335$.currentBinding(var22);
        final SubLObject var25 = module0100.$g1336$.currentBinding(var22);
        try {
            module0100.$g1335$.bind(var21, var22);
            module0100.$g1336$.bind(var3, var22);
            var23 = module0035.f2399(var7, (SubLObject)module0100.$ic1$, var3, (SubLObject)module0100.UNPROVIDED, (SubLObject)module0100.UNPROVIDED);
        }
        finally {
            module0100.$g1336$.rebind(var25, var22);
            module0100.$g1335$.rebind(var24, var22);
        }
        return var23;
    }
    
    public static SubLObject f7261(final SubLObject var26) {
        final SubLThread var27 = SubLProcess.currentSubLThread();
        return module0004.f104(var26, module0100.$g1335$.getDynamicValue(var27), module0100.$g1336$.getDynamicValue(var27), (SubLObject)module0100.UNPROVIDED);
    }
    
    public static SubLObject f7256(final SubLObject var1, final SubLObject var28, SubLObject var3) {
        if (var3 == module0100.UNPROVIDED) {
            var3 = Symbols.symbol_function((SubLObject)module0100.EQL);
        }
        SubLObject var29 = (SubLObject)module0100.NIL;
        SubLObject var30 = var1;
        SubLObject var31 = (SubLObject)module0100.NIL;
        var31 = var30.first();
        while (module0100.NIL != var30) {
            final SubLObject var33;
            final SubLObject var32 = var33 = f7262(var31, var28, var3);
            if (module0100.NIL == conses_high.member(var33, var29, Symbols.symbol_function((SubLObject)module0100.EQL), Symbols.symbol_function((SubLObject)module0100.IDENTITY))) {
                var29 = (SubLObject)ConsesLow.cons(var33, var29);
            }
            var30 = var30.rest();
            var31 = var30.first();
        }
        return var29;
    }
    
    public static SubLObject f7262(final SubLObject var6, final SubLObject var9, SubLObject var3) {
        if (var3 == module0100.UNPROVIDED) {
            var3 = Symbols.symbol_function((SubLObject)module0100.EQL);
        }
        SubLObject var10 = (SubLObject)module0100.NIL;
        if (module0100.NIL == var10) {
            SubLObject var11 = var9;
            SubLObject var12 = (SubLObject)module0100.NIL;
            var12 = var11.first();
            while (module0100.NIL == var10 && module0100.NIL != var11) {
                SubLObject var14;
                final SubLObject var13 = var14 = var12;
                SubLObject var15 = (SubLObject)module0100.NIL;
                SubLObject var16 = (SubLObject)module0100.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0100.$ic2$);
                var15 = var14.first();
                var14 = var14.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0100.$ic2$);
                var16 = var14.first();
                var14 = var14.rest();
                if (module0100.NIL == var14) {
                    if (module0100.NIL != module0004.f104(var6, var15, var3, (SubLObject)module0100.UNPROVIDED)) {
                        var10 = var12;
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var13, (SubLObject)module0100.$ic2$);
                }
                var11 = var11.rest();
                var12 = var11.first();
            }
        }
        return var10;
    }
    
    public static SubLObject f7257(final SubLObject var9) {
        SubLObject var10 = (SubLObject)module0100.NIL;
        SubLObject var11 = (SubLObject)module0100.NIL;
        SubLObject var12 = var9;
        SubLObject var13 = (SubLObject)module0100.NIL;
        var13 = var12.first();
        while (module0100.NIL != var12) {
            SubLObject var15;
            final SubLObject var14 = var15 = var13;
            SubLObject var16 = (SubLObject)module0100.NIL;
            SubLObject var17 = (SubLObject)module0100.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)module0100.$ic0$);
            var16 = var15.first();
            var15 = var15.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)module0100.$ic0$);
            var17 = var15.first();
            var15 = var15.rest();
            if (module0100.NIL == var15) {
                SubLObject var5_37 = var16;
                SubLObject var18 = (SubLObject)module0100.NIL;
                var18 = var5_37.first();
                while (module0100.NIL != var5_37) {
                    var10 = (SubLObject)ConsesLow.cons(var18, var10);
                    var5_37 = var5_37.rest();
                    var18 = var5_37.first();
                }
                SubLObject var5_38 = var17;
                SubLObject var19 = (SubLObject)module0100.NIL;
                var19 = var5_38.first();
                while (module0100.NIL != var5_38) {
                    var11 = (SubLObject)ConsesLow.cons(var19, var11);
                    var5_38 = var5_38.rest();
                    var19 = var5_38.first();
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var14, (SubLObject)module0100.$ic0$);
            }
            var12 = var12.rest();
            var13 = var12.first();
        }
        final SubLObject var20 = (SubLObject)ConsesLow.list(var10, var11);
        return var20;
    }
    
    public static SubLObject f7258(SubLObject var16, final SubLObject var39, final SubLObject var40, SubLObject var3) {
        if (var3 == module0100.UNPROVIDED) {
            var3 = Symbols.symbol_function((SubLObject)module0100.EQL);
        }
        SubLObject var41 = var16;
        SubLObject var42 = (SubLObject)module0100.NIL;
        var42 = var41.first();
        while (module0100.NIL != var41) {
            SubLObject var44;
            final SubLObject var43 = var44 = var42;
            SubLObject var45 = (SubLObject)module0100.NIL;
            SubLObject var46 = (SubLObject)module0100.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var44, var43, (SubLObject)module0100.$ic2$);
            var45 = var44.first();
            var44 = var44.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var44, var43, (SubLObject)module0100.$ic2$);
            var46 = var44.first();
            var44 = var44.rest();
            if (module0100.NIL == var44) {
                ConsesLow.set_nth((SubLObject)module0100.ZERO_INTEGER, var42, module0035.f2344(var45, var39, Symbols.symbol_function((SubLObject)module0100.EQL), (SubLObject)module0100.UNPROVIDED));
                ConsesLow.set_nth((SubLObject)module0100.ONE_INTEGER, var42, module0035.f2344(var46, var40, Symbols.symbol_function((SubLObject)module0100.EQL), (SubLObject)module0100.UNPROVIDED));
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var43, (SubLObject)module0100.$ic2$);
            }
            var41 = var41.rest();
            var42 = var41.first();
        }
        var16 = module0035.f2344(var16, var39, var3, Symbols.symbol_function((SubLObject)module0100.$ic3$));
        return Sort.stable_sort(var16, Symbols.symbol_function((SubLObject)module0100.$ic4$), Symbols.symbol_function((SubLObject)module0100.$ic5$));
    }
    
    public static SubLObject f7263(final SubLObject var26) {
        return Sequences.length(var26.first());
    }
    
    public static SubLObject f7259(final SubLObject var17, final SubLObject var39, final SubLObject var40, SubLObject var3) {
        if (var3 == module0100.UNPROVIDED) {
            var3 = Symbols.symbol_function((SubLObject)module0100.EQL);
        }
        SubLObject var41 = var17;
        SubLObject var42 = (SubLObject)module0100.NIL;
        var42 = var41.first();
        while (module0100.NIL != var41) {
            SubLObject var44;
            final SubLObject var43 = var44 = var42;
            SubLObject var45 = (SubLObject)module0100.NIL;
            SubLObject var46 = (SubLObject)module0100.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var44, var43, (SubLObject)module0100.$ic2$);
            var45 = var44.first();
            var44 = var44.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var44, var43, (SubLObject)module0100.$ic2$);
            var46 = var44.first();
            var44 = var44.rest();
            if (module0100.NIL == var44) {
                ConsesLow.set_nth((SubLObject)module0100.ONE_INTEGER, var42, module0035.f2344(var46, var40, Symbols.symbol_function((SubLObject)module0100.EQL), (SubLObject)module0100.UNPROVIDED));
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var43, (SubLObject)module0100.$ic2$);
            }
            var41 = var41.rest();
            var42 = var41.first();
        }
        return module0035.f2344(var17, var39, var3, Symbols.symbol_function((SubLObject)module0100.$ic3$));
    }
    
    public static SubLObject f7260(final SubLObject var18, final SubLObject var39, SubLObject var3) {
        if (var3 == module0100.UNPROVIDED) {
            var3 = Symbols.symbol_function((SubLObject)module0100.EQL);
        }
        return module0035.f2344(var18, var39, var3, Symbols.symbol_function((SubLObject)module0100.$ic3$));
    }
    
    public static SubLObject f7264(final SubLObject var45, final SubLObject var46) {
        SubLObject var48;
        final SubLObject var47 = var48 = var45.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var48, var47, (SubLObject)module0100.$ic6$);
        final SubLObject var49 = var48.rest();
        var48 = var48.first();
        SubLObject var50 = (SubLObject)module0100.NIL;
        SubLObject var51_52 = (SubLObject)module0100.NIL;
        SubLObject var51 = (SubLObject)module0100.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var48, var47, (SubLObject)module0100.$ic6$);
        var50 = var48.first();
        var48 = var48.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var48, var47, (SubLObject)module0100.$ic6$);
        var51_52 = var48.first();
        var48 = var48.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var48, var47, (SubLObject)module0100.$ic6$);
        var51 = var48.first();
        var48 = var48.rest();
        SubLObject var52 = (SubLObject)module0100.NIL;
        SubLObject var53 = var48;
        SubLObject var54 = (SubLObject)module0100.NIL;
        SubLObject var57_58 = (SubLObject)module0100.NIL;
        while (module0100.NIL != var53) {
            cdestructuring_bind.destructuring_bind_must_consp(var53, var47, (SubLObject)module0100.$ic6$);
            var57_58 = var53.first();
            var53 = var53.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var53, var47, (SubLObject)module0100.$ic6$);
            if (module0100.NIL == conses_high.member(var57_58, (SubLObject)module0100.$ic7$, (SubLObject)module0100.UNPROVIDED, (SubLObject)module0100.UNPROVIDED)) {
                var54 = (SubLObject)module0100.T;
            }
            if (var57_58 == module0100.$ic8$) {
                var52 = var53.first();
            }
            var53 = var53.rest();
        }
        if (module0100.NIL != var54 && module0100.NIL == var52) {
            cdestructuring_bind.cdestructuring_bind_error(var47, (SubLObject)module0100.$ic6$);
        }
        final SubLObject var55 = cdestructuring_bind.property_list_member((SubLObject)module0100.$ic9$, var48);
        final SubLObject var56 = (SubLObject)((module0100.NIL != var55) ? conses_high.cadr(var55) : module0100.$ic10$);
        final SubLObject var57;
        var48 = (var57 = var49);
        final SubLObject var58 = (SubLObject)module0100.$ic11$;
        final SubLObject var59 = (SubLObject)module0100.$ic12$;
        final SubLObject var60 = (SubLObject)module0100.$ic13$;
        return (SubLObject)ConsesLow.list((SubLObject)module0100.$ic14$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var58, (SubLObject)ConsesLow.list((SubLObject)module0100.$ic15$, var56)), reader.bq_cons(var59, (SubLObject)module0100.$ic16$)), (SubLObject)ConsesLow.list((SubLObject)module0100.$ic17$, var50, var59), (SubLObject)ConsesLow.list((SubLObject)module0100.$ic18$, var50, var58), (SubLObject)ConsesLow.list((SubLObject)module0100.$ic19$, (SubLObject)ConsesLow.list((SubLObject)module0100.$ic20$, (SubLObject)ConsesLow.list((SubLObject)module0100.$ic21$, var59)), (SubLObject)ConsesLow.list((SubLObject)module0100.$ic14$, (SubLObject)ConsesLow.list(var51_52, var51), (SubLObject)ConsesLow.list((SubLObject)module0100.$ic22$, var51_52, (SubLObject)ConsesLow.list((SubLObject)module0100.$ic23$, var59)), reader.bq_cons((SubLObject)module0100.$ic24$, ConsesLow.append(var57, (SubLObject)module0100.NIL)), (SubLObject)ConsesLow.list((SubLObject)module0100.$ic25$, (SubLObject)ConsesLow.list(var60, var51), (SubLObject)ConsesLow.list((SubLObject)module0100.$ic26$, (SubLObject)ConsesLow.list((SubLObject)module0100.$ic27$, var60, var58), (SubLObject)ConsesLow.list((SubLObject)module0100.$ic18$, var60, var58), (SubLObject)ConsesLow.list((SubLObject)module0100.$ic17$, var60, var59))))));
    }
    
    public static SubLObject f7265(final SubLObject var65, SubLObject var66, SubLObject var67) {
        if (var66 == module0100.UNPROVIDED) {
            var66 = (SubLObject)module0100.NIL;
        }
        if (var67 == module0100.UNPROVIDED) {
            var67 = (SubLObject)module0100.NIL;
        }
        if (module0100.NIL == module0079.f5404(var66)) {
            var66 = module0079.f5429(var65, (SubLObject)module0100.NIL);
        }
        final SubLObject var68 = (SubLObject)ConsesLow.list((SubLObject)module0100.NIL);
        final SubLObject var69 = module0079.f5408(var65);
        final SubLObject var70 = module0078.f5367(module0079.f5433(var65), var69, module0079.f5406(var65));
        final SubLObject var71 = module0077.f5313(module0079.f5408(var65), (SubLObject)module0100.UNPROVIDED);
        SubLObject var72 = module0077.f5333(var70);
        SubLObject var73;
        SubLObject var74;
        SubLObject var75;
        SubLObject var76;
        SubLObject var77;
        SubLObject var78;
        SubLObject var79;
        SubLObject var80;
        SubLObject var81;
        SubLObject var82;
        for (var73 = module0032.f1741(var72), var74 = (SubLObject)module0100.NIL, var74 = module0032.f1742(var73, var72); module0100.NIL == module0032.f1744(var73, var74); var74 = module0032.f1743(var74)) {
            var75 = module0032.f1745(var73, var74);
            if (module0100.NIL != module0032.f1746(var74, var75)) {
                var76 = (SubLObject)module0100.ONE_INTEGER;
                if (module0100.NIL != module0079.f5404(var67)) {
                    var76 = module0079.f5414(var67, var75, var76);
                }
                var77 = module0077.f5313((SubLObject)module0100.EQL, (SubLObject)module0100.UNPROVIDED);
                var78 = module0055.f4017();
                module0055.f4021(var75, var78);
                module0077.f5326(var75, var77);
                while (module0100.NIL == module0055.f4019(var78)) {
                    var79 = (SubLObject)module0100.NIL;
                    var80 = (SubLObject)module0100.NIL;
                    var79 = module0055.f4023(var78);
                    module0079.f5441(var66, var79, var76);
                    var80 = module0079.f5414(var65, var79, (SubLObject)module0100.UNPROVIDED);
                    if (module0100.NIL == var80) {
                        if (module0100.NIL == module0077.f5320(var79, var70)) {
                            module0077.f5326(var79, var71);
                        }
                    }
                    else if (!var80.isCons()) {
                        ConsesLow.rplaca(var68, var80);
                        var80 = var68;
                    }
                    var81 = var80;
                    var82 = (SubLObject)module0100.NIL;
                    var82 = var81.first();
                    while (module0100.NIL != var81) {
                        if (module0100.NIL == module0077.f5320(var82, var77)) {
                            module0077.f5326(var82, var77);
                            module0055.f4021(var82, var78);
                        }
                        var81 = var81.rest();
                        var82 = var81.first();
                    }
                }
            }
        }
        var72 = module0077.f5333(var71);
        for (var73 = module0032.f1741(var72), var74 = (SubLObject)module0100.NIL, var74 = module0032.f1742(var73, var72); module0100.NIL == module0032.f1744(var73, var74); var74 = module0032.f1743(var74)) {
            var75 = module0032.f1745(var73, var74);
            if (module0100.NIL != module0032.f1746(var74, var75)) {
                var76 = (SubLObject)module0100.ONE_INTEGER;
                if (module0100.NIL != module0079.f5404(var67)) {
                    var76 = module0079.f5414(var67, var75, var76);
                }
                module0079.f5441(var66, var75, var76);
            }
        }
        return var66;
    }
    
    public static SubLObject f7266(final SubLObject var80, final SubLObject var81, SubLObject var82) {
        if (var82 == module0100.UNPROVIDED) {
            var82 = (SubLObject)module0100.NIL;
        }
        final SubLObject var83 = module0084.f5781(var80, (SubLObject)module0100.UNPROVIDED);
        final SubLObject var84 = module0084.f5781(var81, (SubLObject)module0100.UNPROVIDED);
        final SubLObject var85 = (SubLObject)((module0100.NIL != module0035.f2292(var82)) ? module0084.f5781(var82, (SubLObject)module0100.UNPROVIDED) : module0100.NIL);
        final SubLObject var86 = f7265(var83, (SubLObject)module0100.NIL, var85);
        return f7267(var84, var86);
    }
    
    public static SubLObject f7267(final SubLObject var84, final SubLObject var85) {
        final SubLThread var86 = SubLProcess.currentSubLThread();
        if (!module0079.f5406(var84).numE(module0079.f5406(var85))) {
            Errors.error((SubLObject)module0100.$ic36$, module0079.f5406(var84), module0079.f5406(var85));
        }
        final SubLObject var87 = module0079.f5424(var84);
        SubLObject var90;
        for (SubLObject var88 = (SubLObject)module0100.NIL; module0100.NIL == var88; var88 = (SubLObject)SubLObjectFactory.makeBoolean(module0100.NIL == var90)) {
            var86.resetMultipleValues();
            final SubLObject var89 = module0052.f3693(var87);
            var90 = var86.secondMultipleValue();
            var86.resetMultipleValues();
            if (module0100.NIL != var90) {
                SubLObject var92;
                final SubLObject var91 = var92 = var89;
                SubLObject var93 = (SubLObject)module0100.NIL;
                SubLObject var94 = (SubLObject)module0100.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var92, var91, (SubLObject)module0100.$ic37$);
                var93 = var92.first();
                var92 = var92.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var92, var91, (SubLObject)module0100.$ic37$);
                var94 = var92.first();
                var92 = var92.rest();
                if (module0100.NIL == var92) {
                    final SubLObject var95 = module0079.f5414(var85, var93, (SubLObject)module0100.UNPROVIDED);
                    if (!var94.numE(var95)) {
                        print_high.print(module0084.f5780(var85), (SubLObject)module0100.UNPROVIDED);
                        Errors.error((SubLObject)module0100.$ic38$, var94, var93, var95);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var91, (SubLObject)module0100.$ic37$);
                }
            }
        }
        return (SubLObject)module0100.$ic39$;
    }
    
    public static SubLObject f7268(final SubLObject var65, SubLObject var94) {
        if (var94 == module0100.UNPROVIDED) {
            var94 = (SubLObject)module0100.NIL;
        }
        final SubLThread var95 = SubLProcess.currentSubLThread();
        assert module0100.NIL != module0079.f5404(var65) : var65;
        if (module0100.NIL == module0077.f5302(var94)) {
            var94 = module0077.f5313(module0079.f5408(var65), (SubLObject)module0100.UNPROVIDED);
        }
        module0077.f5328(var94);
        module0078.f5374(module0079.f5433(var65), var94);
        final SubLObject var96 = (SubLObject)ConsesLow.list((SubLObject)module0100.NIL);
        final SubLObject var97 = module0079.f5424(var65);
        SubLObject var100;
        for (SubLObject var98 = (SubLObject)module0100.NIL; module0100.NIL == var98; var98 = (SubLObject)SubLObjectFactory.makeBoolean(module0100.NIL == var100)) {
            var95.resetMultipleValues();
            final SubLObject var99 = module0052.f3693(var97);
            var100 = var95.secondMultipleValue();
            var95.resetMultipleValues();
            if (module0100.NIL != var100) {
                SubLObject var102;
                final SubLObject var101 = var102 = var99;
                SubLObject var103 = (SubLObject)module0100.NIL;
                SubLObject var104 = (SubLObject)module0100.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var102, var101, (SubLObject)module0100.$ic41$);
                var103 = var102.first();
                var102 = var102.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var102, var101, (SubLObject)module0100.$ic41$);
                var104 = var102.first();
                var102 = var102.rest();
                if (module0100.NIL == var102) {
                    if (module0100.NIL != var104) {
                        if (!var104.isCons()) {
                            ConsesLow.rplaca(var96, var104);
                            var104 = var96;
                        }
                        SubLObject var105 = var104;
                        SubLObject var106 = (SubLObject)module0100.NIL;
                        var106 = var105.first();
                        while (module0100.NIL != var105) {
                            module0077.f5327(var106, var94);
                            var105 = var105.rest();
                            var106 = var105.first();
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var101, (SubLObject)module0100.$ic41$);
                }
            }
        }
        return var94;
    }
    
    public static SubLObject f7269(final SubLObject var80, final SubLObject var98) {
        final SubLThread var99 = SubLProcess.currentSubLThread();
        final SubLObject var100 = module0084.f5781(var80, (SubLObject)module0100.UNPROVIDED);
        final SubLObject var101 = module0078.f5367(var98, (SubLObject)module0100.UNPROVIDED, (SubLObject)module0100.UNPROVIDED);
        final SubLObject var102 = f7268(var100, (SubLObject)module0100.UNPROVIDED);
        if (module0100.NIL == Errors.$ignore_mustsP$.getDynamicValue(var99) && !module0077.f5311(var101).numE(module0077.f5311(var102))) {
            Errors.error((SubLObject)module0100.$ic44$, module0077.f5311(var101), module0077.f5311(var102));
        }
        if (module0100.NIL == Errors.$ignore_mustsP$.getDynamicValue(var99) && module0100.NIL == module0078.f5359(var102, var101)) {
            Errors.error((SubLObject)module0100.$ic45$, module0077.f5312(var101), module0077.f5312(var102));
        }
        return (SubLObject)module0100.$ic39$;
    }
    
    public static SubLObject f7270(final SubLObject var65, SubLObject var100) {
        if (var100 == module0100.UNPROVIDED) {
            var100 = (SubLObject)module0100.NIL;
        }
        final SubLThread var101 = SubLProcess.currentSubLThread();
        if (module0100.NIL == module0077.f5302(var100)) {
            var100 = module0077.f5313(module0079.f5408(var65), module0079.f5406(var65));
        }
        module0077.f5328(var100);
        final SubLObject var102 = (SubLObject)ConsesLow.list((SubLObject)module0100.NIL);
        SubLObject var103 = (SubLObject)module0100.NIL;
        final SubLObject var104 = module0079.f5424(var65);
        SubLObject var107;
        for (SubLObject var105 = (SubLObject)module0100.NIL; module0100.NIL == var105; var105 = (SubLObject)SubLObjectFactory.makeBoolean(module0100.NIL == var107)) {
            var101.resetMultipleValues();
            final SubLObject var106 = module0052.f3693(var104);
            var107 = var101.secondMultipleValue();
            var101.resetMultipleValues();
            if (module0100.NIL != var107) {
                SubLObject var109;
                final SubLObject var108 = var109 = var106;
                SubLObject var110 = (SubLObject)module0100.NIL;
                SubLObject var111 = (SubLObject)module0100.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var109, var108, (SubLObject)module0100.$ic41$);
                var110 = var109.first();
                var109 = var109.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var109, var108, (SubLObject)module0100.$ic41$);
                var111 = var109.first();
                var109 = var109.rest();
                if (module0100.NIL == var109) {
                    if (module0100.NIL != var111) {
                        var103 = (SubLObject)ConsesLow.cons(var110, var103);
                        if (!var111.isCons()) {
                            ConsesLow.rplaca(var102, var111);
                            var111 = var102;
                        }
                        SubLObject var112 = var111;
                        SubLObject var113 = (SubLObject)module0100.NIL;
                        var113 = var112.first();
                        while (module0100.NIL != var112) {
                            module0077.f5326(var113, var100);
                            var112 = var112.rest();
                            var113 = var112.first();
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var108, (SubLObject)module0100.$ic41$);
                }
            }
        }
        module0078.f5376(var103, var100);
        return var100;
    }
    
    public static SubLObject f7271(final SubLObject var80, final SubLObject var103) {
        final SubLThread var104 = SubLProcess.currentSubLThread();
        final SubLObject var105 = module0084.f5781(var80, (SubLObject)module0100.UNPROVIDED);
        final SubLObject var106 = module0078.f5367(var103, (SubLObject)module0100.UNPROVIDED, (SubLObject)module0100.UNPROVIDED);
        final SubLObject var107 = f7270(var105, (SubLObject)module0100.UNPROVIDED);
        if (module0100.NIL == Errors.$ignore_mustsP$.getDynamicValue(var104) && !module0077.f5311(var106).numE(module0077.f5311(var107))) {
            Errors.error((SubLObject)module0100.$ic48$, module0077.f5311(var106), module0077.f5311(var107));
        }
        if (module0100.NIL == Errors.$ignore_mustsP$.getDynamicValue(var104) && module0100.NIL == module0078.f5359(var107, var106)) {
            Errors.error((SubLObject)module0100.$ic49$, module0077.f5312(var106), module0077.f5312(var107));
        }
        return (SubLObject)module0100.$ic39$;
    }
    
    public static SubLObject f7272(final SubLObject var65, final SubLObject var105) {
        final SubLObject var106 = module0077.f5313((SubLObject)module0100.UNPROVIDED, (SubLObject)module0100.UNPROVIDED);
        final SubLObject var107 = module0077.f5313((SubLObject)module0100.EQL, (SubLObject)module0100.UNPROVIDED);
        final SubLObject var108 = module0055.f4017();
        module0055.f4021(var105, var108);
        module0077.f5326(var105, var107);
        while (module0100.NIL == module0055.f4019(var108)) {
            SubLObject var109 = (SubLObject)module0100.NIL;
            SubLObject var110 = (SubLObject)module0100.NIL;
            var109 = module0055.f4023(var108);
            var110 = module0079.f5414(var65, var109, (SubLObject)module0100.UNPROVIDED);
            module0078.f5374(var110, var106);
            SubLObject var111 = var110;
            SubLObject var112 = (SubLObject)module0100.NIL;
            var112 = var111.first();
            while (module0100.NIL != var111) {
                if (module0100.NIL == module0077.f5320(var112, var107)) {
                    module0077.f5326(var112, var107);
                    module0055.f4021(var112, var108);
                }
                var111 = var111.rest();
                var112 = var111.first();
            }
        }
        return var106;
    }
    
    public static SubLObject f7273(final SubLObject var65, SubLObject var107, SubLObject var108, SubLObject var109) {
        if (var108 == module0100.UNPROVIDED) {
            var108 = (SubLObject)module0100.NIL;
        }
        if (var109 == module0100.UNPROVIDED) {
            var109 = (SubLObject)module0100.NIL;
        }
        if (module0100.NIL == module0079.f5404(var109)) {
            var109 = module0079.f5427(var65);
        }
        if (module0100.NIL == var107) {
            module0079.f5455(var65, var109, (SubLObject)module0100.UNPROVIDED);
            return var109;
        }
        if (module0100.NIL == module0077.f5302(var107)) {
            assert module0100.NIL != Types.consp(var107) : var107;
            var107 = module0078.f5367(var107, (SubLObject)module0100.UNPROVIDED, (SubLObject)module0100.UNPROVIDED);
        }
        return f7274(var65, var107, var109, var108);
    }
    
    public static SubLObject f7274(final SubLObject var65, final SubLObject var107, final SubLObject var109, final SubLObject var108) {
        final SubLThread var110 = SubLProcess.currentSubLThread();
        final SubLObject var111 = module0055.f4017();
        final SubLObject var112 = module0077.f5313((SubLObject)module0100.UNPROVIDED, (SubLObject)module0100.UNPROVIDED);
        final SubLObject var113 = module0077.f5313((SubLObject)module0100.UNPROVIDED, (SubLObject)module0100.UNPROVIDED);
        final SubLObject var114 = module0079.f5424(var65);
        SubLObject var117;
        for (SubLObject var115 = (SubLObject)module0100.NIL; module0100.NIL == var115; var115 = (SubLObject)SubLObjectFactory.makeBoolean(module0100.NIL == var117)) {
            var110.resetMultipleValues();
            final SubLObject var116 = module0052.f3693(var114);
            var117 = var110.secondMultipleValue();
            var110.resetMultipleValues();
            if (module0100.NIL != var117) {
                SubLObject var119;
                final SubLObject var118 = var119 = var116;
                SubLObject var120 = (SubLObject)module0100.NIL;
                SubLObject var121 = (SubLObject)module0100.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var119, var118, (SubLObject)module0100.$ic51$);
                var120 = var119.first();
                var119 = var119.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var119, var118, (SubLObject)module0100.$ic51$);
                var121 = var119.first();
                var119 = var119.rest();
                if (module0100.NIL == var119) {
                    if (module0100.NIL == module0077.f5320(var120, var107)) {
                        module0055.f4018(var111);
                        module0077.f5328(var112);
                        module0077.f5328(var113);
                        if (var121.isCons()) {
                            module0055.f4022(var121, var111);
                        }
                        else {
                            module0055.f4021(var121, var111);
                        }
                        while (module0100.NIL == module0055.f4019(var111)) {
                            final SubLObject var122 = module0055.f4023(var111);
                            module0077.f5326(var122, var113);
                            if (module0100.NIL == module0077.f5320(var122, var112)) {
                                if (module0100.NIL != module0077.f5320(var122, var107)) {
                                    var110.resetMultipleValues();
                                    final SubLObject var123 = module0079.f5414(var65, var122, (SubLObject)module0100.UNPROVIDED);
                                    final SubLObject var124 = var110.secondMultipleValue();
                                    var110.resetMultipleValues();
                                    if (module0100.NIL == var124) {
                                        continue;
                                    }
                                    if (module0100.NIL == var123) {
                                        continue;
                                    }
                                    if (var123.isCons()) {
                                        SubLObject var125 = var123;
                                        SubLObject var126 = (SubLObject)module0100.NIL;
                                        var126 = var125.first();
                                        while (module0100.NIL != var125) {
                                            if (module0100.NIL == module0077.f5320(var126, var113)) {
                                                module0055.f4021(var126, var111);
                                            }
                                            var125 = var125.rest();
                                            var126 = var125.first();
                                        }
                                    }
                                    else {
                                        if (module0100.NIL != module0077.f5320(var123, var113)) {
                                            continue;
                                        }
                                        module0055.f4021(var123, var111);
                                    }
                                }
                                else {
                                    module0077.f5326(var122, var112);
                                }
                            }
                        }
                        if (module0100.NIL == module0077.f5316(var112)) {
                            SubLObject var127 = module0077.f5312(var112);
                            if (module0100.NIL != module0035.f1997(var127) && module0100.NIL == var108) {
                                var127 = var127.first();
                            }
                            module0079.f5412(var109, var120, var127);
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var118, (SubLObject)module0100.$ic51$);
                }
            }
        }
        return var109;
    }
    
    public static SubLObject f7275(final SubLObject var80, final SubLObject var121, final SubLObject var122) {
        final SubLThread var123 = SubLProcess.currentSubLThread();
        final SubLObject var124 = module0084.f5781(var80, (SubLObject)module0100.UNPROVIDED);
        final SubLObject var125 = module0078.f5367(var121, (SubLObject)module0100.UNPROVIDED, (SubLObject)module0100.UNPROVIDED);
        final SubLObject var126 = module0084.f5781(var122, (SubLObject)module0100.UNPROVIDED);
        final SubLObject var127 = f7273(var124, var125, (SubLObject)module0100.UNPROVIDED, (SubLObject)module0100.UNPROVIDED);
        if (module0100.NIL == Errors.$ignore_mustsP$.getDynamicValue(var123) && !module0079.f5406(var127).numE(module0079.f5406(var126))) {
            Errors.error((SubLObject)module0100.$ic54$, module0084.f5780(var127), module0079.f5406(var126), module0084.f5780(var126));
        }
        final SubLObject var128 = module0079.f5424(var126);
        SubLObject var131;
        for (SubLObject var129 = (SubLObject)module0100.NIL; module0100.NIL == var129; var129 = (SubLObject)SubLObjectFactory.makeBoolean(module0100.NIL == var131)) {
            var123.resetMultipleValues();
            final SubLObject var130 = module0052.f3693(var128);
            var131 = var123.secondMultipleValue();
            var123.resetMultipleValues();
            if (module0100.NIL != var131) {
                SubLObject var133;
                final SubLObject var132 = var133 = var130;
                SubLObject var134 = (SubLObject)module0100.NIL;
                SubLObject var135 = (SubLObject)module0100.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var133, var132, (SubLObject)module0100.$ic55$);
                var134 = var133.first();
                var133 = var133.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var133, var132, (SubLObject)module0100.$ic55$);
                var135 = var133.first();
                var133 = var133.rest();
                if (module0100.NIL == var133) {
                    if (module0100.NIL == Errors.$ignore_mustsP$.getDynamicValue(var123) && module0100.NIL == module0079.f5437(var127, var134)) {
                        Errors.error((SubLObject)module0100.$ic56$, module0084.f5780(var127), var134, var135);
                    }
                    final SubLObject var136 = module0079.f5414(var127, var134, (SubLObject)module0100.UNPROVIDED);
                    if (var135.isCons()) {
                        if (module0100.NIL == Errors.$ignore_mustsP$.getDynamicValue(var123) && (!var136.isCons() || module0100.NIL == module0035.f1995(var136, Sequences.length(var135), (SubLObject)module0100.UNPROVIDED) || module0100.NIL == module0078.f5359(module0078.f5367(var135, (SubLObject)module0100.UNPROVIDED, (SubLObject)module0100.UNPROVIDED), module0078.f5367(var136, (SubLObject)module0100.UNPROVIDED, (SubLObject)module0100.UNPROVIDED)))) {
                            Errors.error((SubLObject)module0100.$ic57$, var134, var136, var135);
                        }
                    }
                    else if (module0100.NIL == Errors.$ignore_mustsP$.getDynamicValue(var123) && !var135.equal(var136)) {
                        Errors.error((SubLObject)module0100.$ic58$, var134, var136, var135);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var132, (SubLObject)module0100.$ic55$);
                }
            }
        }
        return (SubLObject)module0100.$ic39$;
    }
    
    public static SubLObject f7276() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0100", "f7254", "S#9151", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0100", "f7255", "S#9152", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0100", "f7261", "S#9149", 1, 0, false);
        new $f7261$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0100", "f7256", "S#9153", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0100", "f7262", "S#9154", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0100", "f7257", "S#9155", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0100", "f7258", "S#9156", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0100", "f7263", "S#9150", 1, 0, false);
        new $f7263$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0100", "f7259", "S#9157", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0100", "f7260", "S#9158", 2, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0100", "f7264", "S#9159");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0100", "f7265", "S#9160", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0100", "f7266", "S#9161", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0100", "f7267", "S#9162", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0100", "f7268", "S#9163", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0100", "f7269", "S#9164", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0100", "f7270", "S#9165", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0100", "f7271", "S#9166", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0100", "f7272", "S#9167", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0100", "f7273", "S#9168", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0100", "f7274", "S#9169", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0100", "f7275", "S#9170", 3, 0, false);
        return (SubLObject)module0100.NIL;
    }
    
    public static SubLObject f7277() {
        module0100.$g1335$ = SubLFiles.defparameter("S#9171", (SubLObject)module0100.NIL);
        module0100.$g1336$ = SubLFiles.defparameter("S#9172", (SubLObject)module0100.NIL);
        return (SubLObject)module0100.NIL;
    }
    
    public static SubLObject f7278() {
        module0027.f1449((SubLObject)module0100.$ic28$, (SubLObject)ConsesLow.list(new SubLObject[] { module0100.$ic29$, Symbols.symbol_function((SubLObject)module0100.EQUAL), module0100.$ic30$, module0100.NIL, module0100.$ic31$, module0100.NIL, module0100.$ic32$, module0100.$ic33$, module0100.$ic34$, module0100.T }), (SubLObject)module0100.$ic35$);
        module0027.f1449((SubLObject)module0100.$ic42$, (SubLObject)ConsesLow.list(new SubLObject[] { module0100.$ic29$, module0100.NIL, module0100.$ic30$, module0100.NIL, module0100.$ic31$, module0100.NIL, module0100.$ic32$, module0100.$ic33$, module0100.$ic34$, module0100.T }), (SubLObject)module0100.$ic43$);
        module0027.f1449((SubLObject)module0100.$ic46$, (SubLObject)ConsesLow.list(new SubLObject[] { module0100.$ic29$, module0100.NIL, module0100.$ic30$, module0100.NIL, module0100.$ic31$, module0100.NIL, module0100.$ic32$, module0100.$ic33$, module0100.$ic34$, module0100.T }), (SubLObject)module0100.$ic47$);
        module0027.f1449((SubLObject)module0100.$ic52$, (SubLObject)ConsesLow.list(new SubLObject[] { module0100.$ic29$, module0100.NIL, module0100.$ic30$, module0100.NIL, module0100.$ic31$, module0100.NIL, module0100.$ic32$, module0100.$ic33$, module0100.$ic34$, module0100.T }), (SubLObject)module0100.$ic53$);
        return (SubLObject)module0100.NIL;
    }
    
    public void declareFunctions() {
        f7276();
    }
    
    public void initializeVariables() {
        f7277();
    }
    
    public void runTopLevelForms() {
        f7278();
    }
    
    static {
        me = (SubLFile)new module0100();
        module0100.$g1335$ = null;
        module0100.$g1336$ = null;
        $ic0$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9173", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9174", "CYC"));
        $ic1$ = SubLObjectFactory.makeSymbol("S#9149", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2953", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9175", "CYC"));
        $ic3$ = SubLObjectFactory.makeSymbol("CAAR");
        $ic4$ = SubLObjectFactory.makeSymbol("<");
        $ic5$ = SubLObjectFactory.makeSymbol("S#9150", "CYC");
        $ic6$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#124", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5232", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9176", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#8565", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)module0100.EQL)))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic7$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TESTFN"));
        $ic8$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic9$ = SubLObjectFactory.makeKeyword("TESTFN");
        $ic10$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)module0100.EQL);
        $ic11$ = SubLObjectFactory.makeUninternedSymbol("US#31698DC");
        $ic12$ = SubLObjectFactory.makeUninternedSymbol("US#13EA0DD");
        $ic13$ = SubLObjectFactory.makeUninternedSymbol("US#3223ADD");
        $ic14$ = SubLObjectFactory.makeSymbol("CLET");
        $ic15$ = SubLObjectFactory.makeSymbol("NEW-SET");
        $ic16$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#4669", "CYC")));
        $ic17$ = SubLObjectFactory.makeSymbol("S#4670", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("SET-ADD");
        $ic19$ = SubLObjectFactory.makeSymbol("WHILE");
        $ic20$ = SubLObjectFactory.makeSymbol("CNOT");
        $ic21$ = SubLObjectFactory.makeSymbol("S#4672", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("CSETQ");
        $ic23$ = SubLObjectFactory.makeSymbol("S#4671", "CYC");
        $ic24$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic25$ = SubLObjectFactory.makeSymbol("CDOLIST");
        $ic26$ = SubLObjectFactory.makeSymbol("PUNLESS");
        $ic27$ = SubLObjectFactory.makeSymbol("S#3287", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("S#9161", "CYC");
        $ic29$ = SubLObjectFactory.makeKeyword("TEST");
        $ic30$ = SubLObjectFactory.makeKeyword("OWNER");
        $ic31$ = SubLObjectFactory.makeKeyword("CLASSES");
        $ic32$ = SubLObjectFactory.makeKeyword("KB");
        $ic33$ = SubLObjectFactory.makeKeyword("TINY");
        $ic34$ = SubLObjectFactory.makeKeyword("WORKING?");
        $ic35$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9177", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9179", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9180", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#174", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9181", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#174", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#173", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9181", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#173", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#173", "CYC"), (SubLObject)module0100.SEVEN_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#174", "CYC"), (SubLObject)module0100.FIVE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9181", "CYC"), (SubLObject)module0100.FIVE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC"), (SubLObject)module0100.FOUR_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9177", "CYC"), (SubLObject)module0100.ONE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9179", "CYC"), (SubLObject)module0100.ONE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9180", "CYC"), (SubLObject)module0100.ONE_INTEGER))), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9177", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9179", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9180", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#174", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9181", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#174", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#173", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9181", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#173", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#173", "CYC"), (SubLObject)module0100.TEN_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#174", "CYC"), (SubLObject)module0100.EIGHT_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9181", "CYC"), (SubLObject)module0100.EIGHT_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC"), (SubLObject)module0100.SEVEN_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9177", "CYC"), (SubLObject)module0100.THREE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9179", "CYC"), (SubLObject)module0100.TWO_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9180", "CYC"), (SubLObject)module0100.ONE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9177", "CYC"), (SubLObject)module0100.THREE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9179", "CYC"), (SubLObject)module0100.TWO_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9180", "CYC"), (SubLObject)module0100.ONE_INTEGER))), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9177", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9179", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9180", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9177", "CYC"), (SubLObject)module0100.ONE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9179", "CYC"), (SubLObject)module0100.ONE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9180", "CYC"), (SubLObject)module0100.ONE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC"), (SubLObject)module0100.FOUR_INTEGER))), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")));
        $ic36$ = SubLObjectFactory.makeString("The expected map size ~A differs from the generated size ~A.");
        $ic37$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9182", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9183", "CYC"));
        $ic38$ = SubLObjectFactory.makeString("Expected rank estimate ~A for ~A, got ~A.");
        $ic39$ = SubLObjectFactory.makeKeyword("SUCCESS");
        $ic40$ = SubLObjectFactory.makeSymbol("S#3046", "CYC");
        $ic41$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9182", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9184", "CYC"));
        $ic42$ = SubLObjectFactory.makeSymbol("S#9164", "CYC");
        $ic43$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9177", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9179", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9180", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#174", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9181", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#174", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#173", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9181", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#173", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9177", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9179", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9180", "CYC"))), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9177", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9179", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9180", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#174", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9181", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#174", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#173", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9181", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#173", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#173", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9180", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9177", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9179", "CYC"))), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")));
        $ic44$ = SubLObjectFactory.makeString("Expected ~A leafs, got ~A leafs instead.");
        $ic45$ = SubLObjectFactory.makeString("The expected leaf set ~A differs from the computed leaf set ~A.");
        $ic46$ = SubLObjectFactory.makeSymbol("S#9166", "CYC");
        $ic47$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9177", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9179", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9180", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#174", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9181", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#174", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#173", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9181", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#173", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#173", "CYC"))), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9177", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9179", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9180", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#174", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9181", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#174", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#173", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9181", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#173", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#173", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#173", "CYC"))), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9177", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9179", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9180", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#174", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9181", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#174", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#173", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9181", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#173", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#173", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9180", "CYC"))), (SubLObject)module0100.NIL), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")));
        $ic48$ = SubLObjectFactory.makeString("Expected ~A roots, got ~A roots instead.");
        $ic49$ = SubLObjectFactory.makeString("The expected roots set ~A differs from the computed roots set ~A.");
        $ic50$ = SubLObjectFactory.makeSymbol("CONSP");
        $ic51$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9182", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9185", "CYC"));
        $ic52$ = SubLObjectFactory.makeSymbol("S#9170", "CYC");
        $ic53$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9177", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9179", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9180", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#174", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9181", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#174", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#173", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9181", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#173", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9177", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#174", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9181", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9179", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#174", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9181", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9180", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#174", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9181", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#174", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#173", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9181", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#173", "CYC")))), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9177", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9179", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9180", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#174", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9181", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#174", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#173", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9181", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#173", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#173", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9180", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9180", "CYC")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9177", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#174", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9181", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9179", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#174", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9181", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#174", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#173", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9181", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#173", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#173", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#174", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9181", "CYC")))), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#173", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#174", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9181", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9181", "CYC")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#173", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#174", "CYC")))), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9177", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9179", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9180", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#174", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9181", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#174", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#173", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9181", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#173", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#173", "CYC")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9177", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9179", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9180", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#174", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9181", "CYC")))), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")));
        $ic54$ = SubLObjectFactory.makeString("~A is not of the expected size ~A, as ~A is.");
        $ic55$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9182", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9186", "CYC"));
        $ic56$ = SubLObjectFactory.makeString("~A does not contain the expected key ~A, whose value should be ~A.");
        $ic57$ = SubLObjectFactory.makeString("The superiors for node ~A are ~A, not ~A.");
        $ic58$ = SubLObjectFactory.makeString("The superior for node ~A is ~A, not ~A.");
    }
    
    public static final class $f7261$UnaryFunction extends UnaryFunction
    {
        public $f7261$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#9149"));
        }
        
        public SubLObject processItem(final SubLObject var27) {
            return module0100.f7261(var27);
        }
    }
    
    public static final class $f7263$UnaryFunction extends UnaryFunction
    {
        public $f7263$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#9150"));
        }
        
        public SubLObject processItem(final SubLObject var27) {
            return module0100.f7263(var27);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0100.class
	Total time: 282 ms
	
	Decompiled with Procyon 0.5.32.
*/