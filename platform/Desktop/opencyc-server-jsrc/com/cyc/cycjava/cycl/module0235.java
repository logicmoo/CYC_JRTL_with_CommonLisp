package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0235 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0235";
    public static final String myFingerPrint = "698049e767b618641c51bf6a6eed1fb5314d97331aba852e332731148d244d26";
    private static SubLSymbol $g2439$;
    private static SubLSymbol $g2440$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLInteger $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLObject $ic21$;
    private static final SubLList $ic22$;
    private static final SubLList $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLObject $ic25$;
    private static final SubLObject $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLInteger $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLObject $ic31$;
    private static final SubLList $ic32$;
    private static final SubLObject $ic33$;
    private static final SubLObject $ic34$;
    private static final SubLList $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLObject $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLObject $ic39$;
    private static final SubLObject $ic40$;
    private static final SubLObject $ic41$;
    
    public static SubLObject f15474(final SubLObject var1, final SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var3 == module0235.UNPROVIDED) {
            var3 = (SubLObject)module0235.T;
        }
        if (var4 == module0235.UNPROVIDED) {
            var4 = module0234.$g2436$.getDynamicValue();
        }
        if (module0235.NIL != module0193.f12067(var1) && module0235.NIL != module0173.f10955(var2)) {
            return Values.values((SubLObject)ConsesLow.list(module0233.f15340(var1, var2)), (SubLObject)module0235.NIL);
        }
        return module0234.f15444(var1, var2, var3, var4);
    }
    
    public static SubLObject f15475(final SubLObject var5, final SubLObject var6, SubLObject var3, SubLObject var7) {
        if (var3 == module0235.UNPROVIDED) {
            var3 = (SubLObject)module0235.NIL;
        }
        if (var7 == module0235.UNPROVIDED) {
            var7 = module0234.$g2436$.getDynamicValue();
        }
        return module0234.f15444(var5, var6, var3, var7);
    }
    
    public static SubLObject f15476(final SubLObject var8, final SubLObject var9, SubLObject var3, SubLObject var7) {
        if (var3 == module0235.UNPROVIDED) {
            var3 = (SubLObject)module0235.T;
        }
        if (var7 == module0235.UNPROVIDED) {
            var7 = module0234.$g2436$.getDynamicValue();
        }
        final SubLThread var10 = SubLProcess.currentSubLThread();
        var10.resetMultipleValues();
        final SubLObject var11 = module0234.f15444(var8, var9, var3, var7);
        final SubLObject var12 = var10.secondMultipleValue();
        var10.resetMultipleValues();
        return Values.values(var11, (SubLObject)((module0235.NIL != var11) ? var9 : module0235.NIL), var12);
    }
    
    public static SubLObject f15477(final SubLObject var8, final SubLObject var9, SubLObject var3, SubLObject var7) {
        if (var3 == module0235.UNPROVIDED) {
            var3 = (SubLObject)module0235.T;
        }
        if (var7 == module0235.UNPROVIDED) {
            var7 = module0234.$g2436$.getDynamicValue();
        }
        final SubLThread var10 = SubLProcess.currentSubLThread();
        final SubLObject var11 = module0205.f13385(var8, (SubLObject)module0235.UNPROVIDED);
        final SubLObject var12 = module0205.f13385(var9, (SubLObject)module0235.UNPROVIDED);
        var10.resetMultipleValues();
        final SubLObject var13 = module0234.f15444(var11, var12, var3, var7);
        final SubLObject var14 = var10.secondMultipleValue();
        var10.resetMultipleValues();
        if (module0235.NIL != var13) {
            return Values.values(var13, module0233.f15361(var13, var8), var14);
        }
        return Values.values((SubLObject)module0235.NIL, (SubLObject)module0235.NIL, (SubLObject)module0235.NIL);
    }
    
    public static SubLObject f15478(final SubLObject var8, final SubLObject var9, SubLObject var3, SubLObject var7) {
        if (var3 == module0235.UNPROVIDED) {
            var3 = (SubLObject)module0235.T;
        }
        if (var7 == module0235.UNPROVIDED) {
            var7 = module0234.$g2436$.getDynamicValue();
        }
        final SubLThread var10 = SubLProcess.currentSubLThread();
        final SubLObject var11 = Sequences.reverse(module0205.f13385(var8, (SubLObject)module0235.UNPROVIDED));
        final SubLObject var12 = module0205.f13385(var9, (SubLObject)module0235.UNPROVIDED);
        var10.resetMultipleValues();
        final SubLObject var13 = module0234.f15444(var11, var12, var3, var7);
        final SubLObject var14 = var10.secondMultipleValue();
        var10.resetMultipleValues();
        if (module0235.NIL != var13) {
            return Values.values(var13, module0233.f15361(var13, var8), var14);
        }
        return Values.values((SubLObject)module0235.NIL, (SubLObject)module0235.NIL, (SubLObject)module0235.NIL);
    }
    
    public static SubLObject f15479(final SubLObject var8, final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        var16.resetMultipleValues();
        final SubLObject var17 = f15475(var8, var15, (SubLObject)module0235.NIL, (SubLObject)module0235.NIL);
        final SubLObject var18 = var16.secondMultipleValue();
        var16.resetMultipleValues();
        return Values.values(var17, (SubLObject)module0235.NIL);
    }
    
    public static SubLObject f15480(final SubLObject var16, final SubLObject var17) {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        var18.resetMultipleValues();
        final SubLObject var19 = f15475(var16, var17, (SubLObject)module0235.T, (SubLObject)module0235.NIL);
        final SubLObject var20 = var18.secondMultipleValue();
        var18.resetMultipleValues();
        return Values.values(var19, (SubLObject)module0235.NIL);
    }
    
    public static SubLObject f15481(final SubLObject var18, final SubLObject var19, SubLObject var20, SubLObject var21) {
        if (var20 == module0235.UNPROVIDED) {
            var20 = (SubLObject)module0235.NIL;
        }
        if (var21 == module0235.UNPROVIDED) {
            var21 = (SubLObject)module0235.NIL;
        }
        assert module0235.NIL != Types.listp(var18) : var18;
        assert module0235.NIL != Types.listp(var19) : var19;
        if (!Sequences.length(var18).numE(Sequences.length(var19))) {
            return (SubLObject)module0235.NIL;
        }
        return f15482(f15483(var18, var19, Symbols.symbol_function((SubLObject)module0235.$ic1$), var20, var21));
    }
    
    public static SubLObject f15482(final SubLObject var22) {
        if (module0235.NIL == var22 || module0235.NIL == module0233.f15402(var22)) {
            return var22;
        }
        SubLObject var23 = (SubLObject)module0235.NIL;
        SubLObject var24 = var22;
        SubLObject var25 = (SubLObject)module0235.NIL;
        var25 = var24.first();
        while (module0235.NIL != var24) {
            final SubLObject var26 = module0233.f15400(var25);
            if (module0235.NIL == module0233.f15393(var26)) {
                var23 = (SubLObject)ConsesLow.cons(var26, var23);
            }
            var24 = var24.rest();
            var25 = var24.first();
        }
        if (module0235.NIL != var23) {
            return Sequences.nreverse(var23);
        }
        return (SubLObject)ConsesLow.list(module0233.f15403());
    }
    
    public static SubLObject f15484(final SubLObject var27, final SubLObject var28, SubLObject var20, SubLObject var21) {
        if (var20 == module0235.UNPROVIDED) {
            var20 = (SubLObject)module0235.NIL;
        }
        if (var21 == module0235.UNPROVIDED) {
            var21 = (SubLObject)module0235.NIL;
        }
        assert module0235.NIL != module0232.f15304(var27) : var27;
        assert module0235.NIL != module0232.f15304(var28) : var28;
        if (!Sequences.length(module0232.f15306(var27)).numE(Sequences.length(module0232.f15306(var28)))) {
            return (SubLObject)module0235.NIL;
        }
        if (!Sequences.length(module0232.f15308(var27)).numE(Sequences.length(module0232.f15308(var28)))) {
            return (SubLObject)module0235.NIL;
        }
        final SubLObject var29 = f15483(module0232.f15306(var27), module0232.f15306(var28), Symbols.symbol_function((SubLObject)module0235.$ic3$), var20, var21);
        if (module0235.NIL == var29) {
            return (SubLObject)module0235.NIL;
        }
        SubLObject var30 = (SubLObject)module0235.NIL;
        SubLObject var31 = var29;
        SubLObject var32 = (SubLObject)module0235.NIL;
        var32 = var31.first();
        while (module0235.NIL != var31) {
            final SubLObject var33 = f15483(module0232.f15308(var27), module0232.f15308(var28), Symbols.symbol_function((SubLObject)module0235.$ic3$), var20, var32);
            if (module0235.NIL != var33) {
                SubLObject var24_33 = var33;
                SubLObject var34 = (SubLObject)module0235.NIL;
                var34 = var24_33.first();
                while (module0235.NIL != var24_33) {
                    var30 = (SubLObject)ConsesLow.cons(var34, var30);
                    var24_33 = var24_33.rest();
                    var34 = var24_33.first();
                }
            }
            var31 = var31.rest();
            var32 = var31.first();
        }
        return Sequences.nreverse(var30);
    }
    
    public static SubLObject f15485(final SubLObject var37, final SubLObject var38, final SubLObject var20, final SubLObject var21) {
        return f15486(var37, var38, var20, var21);
    }
    
    public static SubLObject f15487(final SubLObject var18, SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        assert module0235.NIL != module0232.f15323(var18) : var18;
        assert module0235.NIL != module0232.f15323(var19) : var19;
        if (var18.equal(var19)) {
            return module0370.f25887(module0193.f12104(var18));
        }
        final SubLObject var21 = module0205.f13183(var19, (SubLObject)module0235.$ic5$, (SubLObject)module0235.UNPROVIDED, (SubLObject)module0235.UNPROVIDED, (SubLObject)module0235.UNPROVIDED, (SubLObject)module0235.UNPROVIDED);
        final SubLObject var22 = Mapping.mapcar((SubLObject)module0235.$ic6$, var21);
        var19 = module0233.f15362(var22, var19);
        SubLObject var23 = (SubLObject)module0235.NIL;
        final SubLObject var24 = module0234.$g2435$.currentBinding(var20);
        try {
            module0234.$g2435$.bind((SubLObject)module0235.T, var20);
            var23 = f15481(var18, var19, (SubLObject)module0235.NIL, (SubLObject)module0235.UNPROVIDED).first();
        }
        finally {
            module0234.$g2435$.rebind(var24, var20);
        }
        SubLObject var25 = (SubLObject)module0235.NIL;
        SubLObject var26 = var23;
        SubLObject var27 = (SubLObject)module0235.NIL;
        var27 = var26.first();
        while (module0235.NIL != var26) {
            SubLObject var29;
            final SubLObject var28 = var29 = var27;
            SubLObject var30 = (SubLObject)module0235.NIL;
            SubLObject var31 = (SubLObject)module0235.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)module0235.$ic7$);
            var30 = var29.first();
            var29 = (var31 = var29.rest());
            final SubLObject var32 = module0234.f15465(var30);
            final SubLObject var33 = module0233.f15376(var22, var31);
            var25 = (SubLObject)ConsesLow.cons(module0233.f15340(var32, var33), var25);
            var26 = var26.rest();
            var27 = var26.first();
        }
        return Sequences.nreverse(var25);
    }
    
    public static SubLObject f15488(final SubLObject var51) {
        return module0233.f15340(var51, module0234.f15467(var51));
    }
    
    public static SubLObject f15489(final SubLObject var52, final SubLObject var53, SubLObject var20, SubLObject var21) {
        if (var20 == module0235.UNPROVIDED) {
            var20 = (SubLObject)module0235.NIL;
        }
        if (var21 == module0235.UNPROVIDED) {
            var21 = (SubLObject)module0235.NIL;
        }
        assert module0235.NIL != Types.listp(var52) : var52;
        assert module0235.NIL != Types.listp(var53) : var53;
        if (!Sequences.length(var52).numE(Sequences.length(var53))) {
            return (SubLObject)module0235.NIL;
        }
        return f15483(var52, var53, Symbols.symbol_function((SubLObject)module0235.$ic8$), var20, var21);
    }
    
    public static SubLObject f15490(final SubLObject var54, final SubLObject var55, SubLObject var20, SubLObject var21) {
        if (var20 == module0235.UNPROVIDED) {
            var20 = (SubLObject)module0235.NIL;
        }
        if (var21 == module0235.UNPROVIDED) {
            var21 = (SubLObject)module0235.NIL;
        }
        assert module0235.NIL != Types.listp(var54) : var54;
        assert module0235.NIL != Types.listp(var55) : var55;
        if (!Sequences.length(var54).numE(Sequences.length(var55))) {
            return (SubLObject)module0235.NIL;
        }
        return f15483(var54, var55, Symbols.symbol_function((SubLObject)module0235.$ic9$), var20, var21);
    }
    
    public static SubLObject f15491(final SubLObject var56, final SubLObject var57, SubLObject var20, SubLObject var21) {
        if (var20 == module0235.UNPROVIDED) {
            var20 = (SubLObject)module0235.NIL;
        }
        if (var21 == module0235.UNPROVIDED) {
            var21 = (SubLObject)module0235.NIL;
        }
        assert module0235.NIL != Types.listp(var56) : var56;
        assert module0235.NIL != Types.listp(var57) : var57;
        if (!Sequences.length(var56).numE(Sequences.length(var57))) {
            return (SubLObject)module0235.NIL;
        }
        return f15483(var56, var57, Symbols.symbol_function((SubLObject)module0235.$ic10$), var20, var21);
    }
    
    public static SubLObject f15483(final SubLObject var52, final SubLObject var53, final SubLObject var58, final SubLObject var20, final SubLObject var21) {
        if (module0235.NIL == var52) {
            return (SubLObject)ConsesLow.list(var21);
        }
        final SubLObject var59 = var52.first();
        SubLObject var60 = (SubLObject)module0235.NIL;
        SubLObject var61 = var53;
        SubLObject var62 = (SubLObject)module0235.NIL;
        var62 = var61.first();
        while (module0235.NIL != var61) {
            final SubLObject var63 = Functions.funcall(var58, var59, var62, var20, var21);
            if (module0235.NIL != var63) {
                SubLObject var24_62 = var63;
                SubLObject var64 = (SubLObject)module0235.NIL;
                var64 = var24_62.first();
                while (module0235.NIL != var24_62) {
                    final SubLObject var65 = f15483(var52.rest(), Sequences.remove(var62, var53, (SubLObject)module0235.UNPROVIDED, (SubLObject)module0235.UNPROVIDED, (SubLObject)module0235.UNPROVIDED, (SubLObject)module0235.UNPROVIDED, (SubLObject)module0235.UNPROVIDED), var58, var20, module0035.f2269(ConsesLow.append(var21, var64), Symbols.symbol_function((SubLObject)module0235.EQUAL), (SubLObject)module0235.UNPROVIDED, (SubLObject)module0235.UNPROVIDED, (SubLObject)module0235.UNPROVIDED, (SubLObject)module0235.UNPROVIDED));
                    if (module0235.NIL != var65) {
                        SubLObject var24_63 = var65;
                        SubLObject var66 = (SubLObject)module0235.NIL;
                        var66 = var24_63.first();
                        while (module0235.NIL != var24_63) {
                            final SubLObject var67 = var66;
                            if (module0235.NIL == conses_high.member(var67, var60, Symbols.symbol_function((SubLObject)module0235.EQUAL), Symbols.symbol_function((SubLObject)module0235.IDENTITY))) {
                                var60 = (SubLObject)ConsesLow.cons(var67, var60);
                            }
                            var24_63 = var24_63.rest();
                            var66 = var24_63.first();
                        }
                    }
                    var24_62 = var24_62.rest();
                    var64 = var24_62.first();
                }
            }
            var61 = var61.rest();
            var62 = var61.first();
        }
        return Sequences.nreverse(var60);
    }
    
    public static SubLObject f15486(final SubLObject var59, final SubLObject var60, final SubLObject var20, final SubLObject var21) {
        final SubLThread var61 = SubLProcess.currentSubLThread();
        var61.resetMultipleValues();
        final SubLObject var62 = module0234.f15445(var59, var60, var20, var21, (SubLObject)module0235.UNPROVIDED);
        final SubLObject var63 = var61.secondMultipleValue();
        var61.resetMultipleValues();
        if (module0235.NIL != var62) {
            return (SubLObject)ConsesLow.list(var62);
        }
        return (SubLObject)module0235.NIL;
    }
    
    public static SubLObject f15492(final SubLObject var68, final SubLObject var69) {
        final SubLObject var70 = module0035.f2399(var68, Symbols.symbol_function((SubLObject)module0235.$ic11$), (SubLObject)module0235.UNPROVIDED, (SubLObject)module0235.UNPROVIDED, (SubLObject)module0235.UNPROVIDED);
        SubLObject var71 = (SubLObject)module0235.NIL;
        SubLObject var72 = var70;
        SubLObject var73 = (SubLObject)module0235.NIL;
        var73 = var72.first();
        while (module0235.NIL != var72) {
            SubLObject var74 = (SubLObject)module0235.NIL;
            assert module0235.NIL != module0234.f15458(var73) : var73;
            final SubLObject var75 = module0234.f15466(var73);
            var74 = module0233.f15361(var69, var75);
            var71 = (SubLObject)ConsesLow.cons(module0233.f15340(var73, var74), var71);
            var72 = var72.rest();
            var73 = var72.first();
        }
        return Sequences.nreverse(var71);
    }
    
    public static SubLObject f15493(final SubLObject var74) {
        SubLObject var75 = module0035.f2399(var74, Symbols.symbol_function((SubLObject)module0235.$ic11$), (SubLObject)module0235.UNPROVIDED, (SubLObject)module0235.UNPROVIDED, (SubLObject)module0235.UNPROVIDED);
        SubLObject var76 = (SubLObject)module0235.NIL;
        var75 = Sort.sort(var75, Symbols.symbol_function((SubLObject)module0235.$ic13$), (SubLObject)module0235.UNPROVIDED);
        SubLObject var77 = (SubLObject)module0235.ZERO_INTEGER;
        SubLObject var78 = var75;
        SubLObject var79 = (SubLObject)module0235.NIL;
        var79 = var78.first();
        while (module0235.NIL != var78) {
            SubLObject var80 = var79;
            var80 = module0193.f12079(var77);
            var77 = Numbers.add(var77, (SubLObject)module0235.ONE_INTEGER);
            var76 = (SubLObject)ConsesLow.cons(module0233.f15340(var79, var80), var76);
            var78 = var78.rest();
            var79 = var78.first();
        }
        return Sequences.nreverse(var76);
    }
    
    public static SubLObject f15494(final SubLObject var69, final SubLObject var78) {
        final SubLObject var79 = Sequences.remove_if(Symbols.symbol_function((SubLObject)module0235.$ic5$), var69, Symbols.symbol_function((SubLObject)module0235.$ic14$), (SubLObject)module0235.UNPROVIDED, (SubLObject)module0235.UNPROVIDED, (SubLObject)module0235.UNPROVIDED);
        final SubLObject var80 = Sequences.remove_if(Symbols.symbol_function((SubLObject)module0235.$ic5$), var78, Symbols.symbol_function((SubLObject)module0235.$ic14$), (SubLObject)module0235.UNPROVIDED, (SubLObject)module0235.UNPROVIDED, (SubLObject)module0235.UNPROVIDED);
        final SubLObject var81 = conses_high.nunion(var79, var80, Symbols.symbol_function((SubLObject)module0235.EQL), Symbols.symbol_function((SubLObject)module0235.$ic14$));
        return var81;
    }
    
    public static SubLObject f15495(final SubLObject var82, final SubLObject var78) {
        SubLObject var83 = (SubLObject)module0235.NIL;
        SubLObject var84 = var82;
        SubLObject var85 = (SubLObject)module0235.NIL;
        var85 = var84.first();
        while (module0235.NIL != var84) {
            SubLObject var87;
            final SubLObject var86 = var87 = var85;
            SubLObject var88 = (SubLObject)module0235.NIL;
            SubLObject var89 = (SubLObject)module0235.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var87, var86, (SubLObject)module0235.$ic15$);
            var88 = var87.first();
            var87 = (var89 = var87.rest());
            var83 = (SubLObject)ConsesLow.cons(module0233.f15340(module0234.f15465(var88), conses_high.sublis(var78, var89, (SubLObject)module0235.UNPROVIDED, (SubLObject)module0235.UNPROVIDED)), var83);
            var84 = var84.rest();
            var85 = var84.first();
        }
        return Sequences.nreverse(var83);
    }
    
    public static SubLObject f15496() {
        final SubLObject var89 = module0235.$g2439$.getGlobalValue();
        if (module0235.NIL != var89) {
            module0034.f1818(var89);
        }
        return (SubLObject)module0235.NIL;
    }
    
    public static SubLObject f15497(final SubLObject var90) {
        return module0034.f1829(module0235.$g2439$.getGlobalValue(), (SubLObject)ConsesLow.list(var90), (SubLObject)module0235.UNPROVIDED, (SubLObject)module0235.UNPROVIDED);
    }
    
    public static SubLObject f15498(final SubLObject var90) {
        final SubLThread var91 = SubLProcess.currentSubLThread();
        SubLObject var92 = (SubLObject)module0235.NIL;
        final SubLObject var93 = module0146.$g2057$.currentBinding(var91);
        try {
            module0146.$g2057$.bind((SubLObject)module0235.NIL, var91);
            var92 = Mapping.mapcar(Symbols.symbol_function((SubLObject)module0235.$ic14$), module0285.f18870(var90, (SubLObject)module0235.UNPROVIDED, (SubLObject)module0235.UNPROVIDED, (SubLObject)module0235.UNPROVIDED));
        }
        finally {
            module0146.$g2057$.rebind(var93, var91);
        }
        return var92;
    }
    
    public static SubLObject f15499(final SubLObject var90) {
        SubLObject var91 = module0235.$g2439$.getGlobalValue();
        if (module0235.NIL == var91) {
            var91 = module0034.f1934((SubLObject)module0235.$ic16$, (SubLObject)module0235.$ic17$, (SubLObject)module0235.$ic18$, (SubLObject)module0235.EQL, (SubLObject)module0235.ONE_INTEGER, (SubLObject)module0235.TEN_INTEGER);
        }
        SubLObject var92 = module0034.f1814(var91, var90, (SubLObject)module0235.$ic19$);
        if (var92 == module0235.$ic19$) {
            var92 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f15498(var90)));
            module0034.f1816(var91, var90, var92, (SubLObject)module0235.UNPROVIDED);
        }
        return module0034.f1959(var92);
    }
    
    public static SubLObject f15500(final SubLObject var94, SubLObject var95) {
        if (var95 == module0235.UNPROVIDED) {
            var95 = (SubLObject)module0235.NIL;
        }
        if (module0235.NIL != var95) {
            return f15501(var94);
        }
        f15496();
        return Sequences.remove_duplicates(var94, Symbols.symbol_function((SubLObject)module0235.EQUAL), Symbols.symbol_function((SubLObject)module0235.$ic16$), (SubLObject)module0235.UNPROVIDED, (SubLObject)module0235.UNPROVIDED);
    }
    
    public static SubLObject f15501(final SubLObject var94) {
        final SubLThread var95 = SubLProcess.currentSubLThread();
        f15496();
        SubLObject var96 = (SubLObject)module0235.NIL;
        final SubLObject var97 = module0146.$g1988$.currentBinding(var95);
        try {
            module0146.$g1988$.bind((SubLObject)module0235.T, var95);
            var96 = module0035.f2158(var94, (SubLObject)module0235.NIL, Symbols.symbol_function((SubLObject)module0235.EQUAL), Symbols.symbol_function((SubLObject)module0235.$ic16$), (SubLObject)module0235.UNPROVIDED, (SubLObject)module0235.UNPROVIDED);
        }
        finally {
            module0146.$g1988$.rebind(var97, var95);
        }
        return var96;
    }
    
    public static SubLObject f15502(final SubLObject var96, final SubLObject var97, SubLObject var4) {
        if (var4 == module0235.UNPROVIDED) {
            var4 = module0234.$g2436$.getDynamicValue();
        }
        final SubLThread var98 = SubLProcess.currentSubLThread();
        SubLObject var99 = (SubLObject)module0235.NIL;
        SubLObject var100 = (SubLObject)module0235.NIL;
        final SubLObject var101 = module0146.$g1981$.currentBinding(var98);
        try {
            module0146.$g1981$.bind((SubLObject)module0235.T, var98);
            if (module0235.NIL != module0204.f13066(var96) && module0235.NIL != module0204.f13066(var97)) {
                var98.resetMultipleValues();
                final SubLObject var98_99 = f15503(var96, var97, var4);
                final SubLObject var100_101 = var98.secondMultipleValue();
                var98.resetMultipleValues();
                var99 = var98_99;
                var100 = var100_101;
            }
            else if (module0235.NIL != module0206.f13444(var96) && module0235.NIL != module0206.f13444(var97)) {
                return f15504(var96, var97, (SubLObject)module0235.UNPROVIDED);
            }
        }
        finally {
            module0146.$g1981$.rebind(var101, var98);
        }
        return Values.values(var99, var100);
    }
    
    public static SubLObject f15503(final SubLObject var102, final SubLObject var103, SubLObject var4) {
        if (var4 == module0235.UNPROVIDED) {
            var4 = module0234.$g2436$.getDynamicValue();
        }
        final SubLThread var104 = SubLProcess.currentSubLThread();
        final SubLObject var105 = module0285.f18932(var102, (SubLObject)module0235.UNPROVIDED).first();
        final SubLObject var106 = (SubLObject)((module0235.NIL != var105) ? module0285.f18932(var103, (SubLObject)module0235.UNPROVIDED).first() : module0235.NIL);
        SubLObject var107 = (SubLObject)module0235.NIL;
        SubLObject var108 = (SubLObject)module0235.NIL;
        if (module0235.NIL != var106) {
            var104.resetMultipleValues();
            final SubLObject var106_107 = module0234.f15444(var105, var106, (SubLObject)module0235.NIL, var4);
            final SubLObject var108_109 = var104.secondMultipleValue();
            var104.resetMultipleValues();
            var107 = var106_107;
            var108 = var108_109;
        }
        return Values.values(var107, var108);
    }
    
    public static SubLObject f15504(final SubLObject var110, final SubLObject var111, SubLObject var4) {
        if (var4 == module0235.UNPROVIDED) {
            var4 = module0234.$g2436$.getDynamicValue();
        }
        return f15505(var110, var111, var4, (SubLObject)module0235.T);
    }
    
    public static SubLObject f15506(final SubLObject var110, final SubLObject var111, SubLObject var4) {
        if (var4 == module0235.UNPROVIDED) {
            var4 = module0234.$g2436$.getDynamicValue();
        }
        return f15505(var110, var111, var4, (SubLObject)module0235.NIL);
    }
    
    public static SubLObject f15505(final SubLObject var110, final SubLObject var111, final SubLObject var4, final SubLObject var20) {
        final SubLThread var112 = SubLProcess.currentSubLThread();
        SubLObject var114;
        final SubLObject var113 = var114 = module0285.f18932((SubLObject)ConsesLow.list(module0235.$ic21$, var110), (SubLObject)module0235.UNPROVIDED);
        SubLObject var115 = (SubLObject)module0235.NIL;
        SubLObject var116 = (SubLObject)module0235.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var114, var113, (SubLObject)module0235.$ic22$);
        var115 = var114.first();
        var114 = var114.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var114, var113, (SubLObject)module0235.$ic22$);
        var116 = var114.first();
        var114 = var114.rest();
        if (module0235.NIL == var114) {
            SubLObject var117_118;
            final SubLObject var115_116 = var117_118 = module0285.f18932((SubLObject)ConsesLow.list(module0235.$ic21$, var111), (SubLObject)module0235.UNPROVIDED);
            SubLObject var117 = (SubLObject)module0235.NIL;
            SubLObject var118 = (SubLObject)module0235.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var117_118, var115_116, (SubLObject)module0235.$ic23$);
            var117 = var117_118.first();
            var117_118 = var117_118.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var117_118, var115_116, (SubLObject)module0235.$ic23$);
            var118 = var117_118.first();
            var117_118 = var117_118.rest();
            if (module0235.NIL == var117_118) {
                var112.resetMultipleValues();
                final SubLObject var119 = module0234.f15444(var115, var117, var20, var4);
                final SubLObject var120 = var112.secondMultipleValue();
                var112.resetMultipleValues();
                final SubLObject var121 = (module0235.NIL != var20) ? var116 : module0234.f15468(var116);
                final SubLObject var122 = module0233.f15376(var118, module0233.f15376(var121, var119));
                return Values.values(var122, var120);
            }
            cdestructuring_bind.cdestructuring_bind_error(var115_116, (SubLObject)module0235.$ic23$);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var113, (SubLObject)module0235.$ic22$);
        }
        return (SubLObject)module0235.NIL;
    }
    
    public static SubLObject f15507(final SubLObject var123, final SubLObject var124) {
        final SubLObject var125 = module0036.f2531(var124, (SubLObject)module0235.$ic11$, (SubLObject)module0235.$ic24$, (SubLObject)module0235.UNPROVIDED);
        return module0234.f15444(var123, var125, (SubLObject)module0235.T, (SubLObject)module0235.UNPROVIDED);
    }
    
    public static SubLObject f15508(SubLObject var126, SubLObject var127, SubLObject var4) {
        if (var4 == module0235.UNPROVIDED) {
            var4 = module0234.$g2436$.getDynamicValue();
        }
        final SubLThread var128 = SubLProcess.currentSubLThread();
        var127 = module0612.f37519(var127);
        var126 = module0612.f37519(var126);
        SubLObject var129 = (SubLObject)module0235.NIL;
        SubLObject var130 = (SubLObject)module0235.NIL;
        final SubLObject var131 = module0234.$g2436$.currentBinding(var128);
        try {
            module0234.$g2436$.bind(var4, var128);
            var128.resetMultipleValues();
            final SubLObject var128_129 = f15474(var126, var127, (SubLObject)module0235.UNPROVIDED, (SubLObject)module0235.UNPROVIDED);
            final SubLObject var130_131 = var128.secondMultipleValue();
            var128.resetMultipleValues();
            var129 = var128_129;
            var130 = var130_131;
            if (module0235.NIL == var129) {
                if (module0235.NIL != module0193.f12105(var126)) {
                    if (module0235.NIL != module0262.f17336(var126, var127, (SubLObject)module0235.UNPROVIDED, (SubLObject)module0235.UNPROVIDED)) {
                        var129 = module0233.f15403();
                        var130 = f15509(var126, var127);
                    }
                }
                else {
                    var128.resetMultipleValues();
                    final SubLObject var132_133 = (module0235.NIL != module0161.f10503(var127)) ? f15510(var126, module0161.f10518((SubLObject)ConsesLow.list(var127, module0161.f10543(module0235.$ic25$, module0235.$ic26$)))) : f15510(var126, var127);
                    final SubLObject var134_135 = var128.secondMultipleValue();
                    var128.resetMultipleValues();
                    var129 = var132_133;
                    var130 = var134_135;
                    if (module0235.NIL != var129) {
                        var129 = module0233.f15401(var129);
                        if (module0235.NIL != var129) {
                            var129 = module0035.f2269(var129, Symbols.symbol_function((SubLObject)module0235.EQUAL), (SubLObject)module0235.UNPROVIDED, (SubLObject)module0235.UNPROVIDED, (SubLObject)module0235.UNPROVIDED, (SubLObject)module0235.UNPROVIDED);
                        }
                        else {
                            var129 = module0233.f15403();
                        }
                    }
                }
            }
        }
        finally {
            module0234.$g2436$.rebind(var131, var128);
        }
        return Values.values(var129, var130);
    }
    
    public static SubLObject f15510(final SubLObject var126, final SubLObject var127) {
        final SubLThread var128 = SubLProcess.currentSubLThread();
        var128.resetMultipleValues();
        SubLObject var129 = f15474(var126, var127, (SubLObject)module0235.UNPROVIDED, (SubLObject)module0235.UNPROVIDED);
        SubLObject var130 = var128.secondMultipleValue();
        var128.resetMultipleValues();
        if (module0235.NIL == var129) {
            if (module0235.NIL != module0173.f10955(var126)) {
                if (module0235.NIL != module0161.f10503(var127) && module0235.NIL != f15511(var126, var127)) {
                    var129 = module0233.f15403();
                    var130 = f15509(var126, var127);
                }
            }
            else if (module0235.NIL == module0173.f10955(var127)) {
                if (module0235.NIL != module0161.f10532(var127)) {
                    if (module0235.NIL != module0193.f12105(var126)) {
                        var128.resetMultipleValues();
                        final SubLObject var136_137 = f15512(var126, var127);
                        final SubLObject var138_139 = var128.secondMultipleValue();
                        var128.resetMultipleValues();
                        var129 = var136_137;
                        var130 = var138_139;
                    }
                    else if (module0235.NIL != module0035.f1996(var126)) {
                        var128.resetMultipleValues();
                        final SubLObject var140_141 = f15513(var126, var127);
                        final SubLObject var142_143 = var128.secondMultipleValue();
                        var128.resetMultipleValues();
                        var129 = var140_141;
                        var130 = var142_143;
                    }
                    else {
                        var128.resetMultipleValues();
                        final SubLObject var144_145 = f15514(var126, var127);
                        final SubLObject var146_147 = var128.secondMultipleValue();
                        var128.resetMultipleValues();
                        var129 = var144_145;
                        var130 = var146_147;
                    }
                }
                else {
                    var128.resetMultipleValues();
                    final SubLObject var131 = f15510(var126.first(), var127.first());
                    final SubLObject var132 = var128.secondMultipleValue();
                    var128.resetMultipleValues();
                    if (module0235.NIL != var131) {
                        var128.resetMultipleValues();
                        final SubLObject var133 = f15510(var126.rest(), var127.rest());
                        final SubLObject var134 = var128.secondMultipleValue();
                        var128.resetMultipleValues();
                        if (module0235.NIL != var133 && module0235.NIL == module0233.f15405(var131, var133)) {
                            var129 = ConsesLow.append(var131, var133);
                            var130 = ConsesLow.append(var132, var134);
                        }
                    }
                }
            }
        }
        return Values.values(var129, var130);
    }
    
    public static SubLObject f15515() {
        final SubLObject var89 = module0235.$g2440$.getGlobalValue();
        if (module0235.NIL != var89) {
            module0034.f1818(var89);
        }
        return (SubLObject)module0235.NIL;
    }
    
    public static SubLObject f15516(final SubLObject var152, final SubLObject var153) {
        return module0034.f1829(module0235.$g2440$.getGlobalValue(), (SubLObject)ConsesLow.list(var152, var153), (SubLObject)module0235.UNPROVIDED, (SubLObject)module0235.UNPROVIDED);
    }
    
    public static SubLObject f15517(final SubLObject var152, final SubLObject var153) {
        return module0262.f17337(var152, var153, (SubLObject)module0235.UNPROVIDED, (SubLObject)module0235.UNPROVIDED);
    }
    
    public static SubLObject f15511(final SubLObject var152, final SubLObject var153) {
        SubLObject var154 = module0235.$g2440$.getGlobalValue();
        if (module0235.NIL == var154) {
            var154 = module0034.f1934((SubLObject)module0235.$ic27$, (SubLObject)module0235.$ic28$, (SubLObject)module0235.$ic29$, (SubLObject)module0235.EQL, (SubLObject)module0235.TWO_INTEGER, (SubLObject)module0235.ZERO_INTEGER);
            module0034.f1940((SubLObject)module0235.$ic30$);
        }
        final SubLObject var155 = module0034.f1782(var152, var153);
        final SubLObject var156 = module0034.f1814(var154, var155, (SubLObject)module0235.UNPROVIDED);
        if (var156 != module0235.$ic19$) {
            SubLObject var157 = var156;
            SubLObject var158 = (SubLObject)module0235.NIL;
            var158 = var157.first();
            while (module0235.NIL != var157) {
                SubLObject var159 = var158.first();
                final SubLObject var160 = conses_high.second(var158);
                if (var152.eql(var159.first())) {
                    var159 = var159.rest();
                    if (module0235.NIL != var159 && module0235.NIL == var159.rest() && var153.eql(var159.first())) {
                        return module0034.f1959(var160);
                    }
                }
                var157 = var157.rest();
                var158 = var157.first();
            }
        }
        final SubLObject var161 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f15517(var152, var153)));
        module0034.f1836(var154, var155, var156, var161, (SubLObject)ConsesLow.list(var152, var153));
        return module0034.f1959(var161);
    }
    
    public static SubLObject f15512(final SubLObject var126, final SubLObject var127) {
        final SubLThread var128 = SubLProcess.currentSubLThread();
        SubLObject var129 = (SubLObject)module0235.NIL;
        SubLObject var130 = (SubLObject)module0235.NIL;
        SubLObject var131 = (SubLObject)module0235.NIL;
        SubLObject var132 = (SubLObject)module0235.NIL;
        var128.resetMultipleValues();
        final SubLObject var163_164 = module0161.f10598(var127);
        final SubLObject var165_166 = var128.secondMultipleValue();
        var128.resetMultipleValues();
        var131 = var163_164;
        var132 = var165_166;
        SubLObject var133 = (SubLObject)module0235.NIL;
        SubLObject var134 = (SubLObject)module0235.NIL;
        var128.resetMultipleValues();
        final SubLObject var169_170 = module0161.f10598(var126);
        final SubLObject var171_172 = var128.secondMultipleValue();
        var128.resetMultipleValues();
        var133 = var169_170;
        var134 = var171_172;
        if (module0235.NIL != module0267.f17561(var133, var131, var134, var132)) {
            var129 = module0233.f15403();
            var130 = f15509(var126, var127);
        }
        return Values.values(var129, var130);
    }
    
    public static SubLObject f15513(final SubLObject var126, final SubLObject var127) {
        final SubLThread var128 = SubLProcess.currentSubLThread();
        SubLObject var129 = (SubLObject)module0235.NIL;
        SubLObject var130 = (SubLObject)module0235.NIL;
        SubLObject var131 = (SubLObject)module0235.NIL;
        SubLObject var132 = (SubLObject)module0235.NIL;
        var128.resetMultipleValues();
        final SubLObject var173_174 = module0161.f10598(var127);
        final SubLObject var175_176 = var128.secondMultipleValue();
        var128.resetMultipleValues();
        var131 = var173_174;
        var132 = var175_176;
        final SubLObject var133 = var126.first();
        if (var133.eql(module0235.$ic31$)) {
            final SubLObject var177_178 = module0035.f2016(var126);
            if (var177_178.eql((SubLObject)module0235.ONE_INTEGER)) {
                if (module0235.NIL != module0193.f12067(var126.rest())) {
                    var129 = (SubLObject)ConsesLow.list(module0233.f15340(var126.rest(), (SubLObject)ConsesLow.list(var131, var132)));
                }
            }
            else if (var177_178.eql((SubLObject)module0235.TWO_INTEGER)) {
                SubLObject var135;
                final SubLObject var134 = var135 = var126.rest();
                SubLObject var136 = (SubLObject)module0235.NIL;
                SubLObject var137 = (SubLObject)module0235.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var135, var134, (SubLObject)module0235.$ic32$);
                var136 = var135.first();
                var135 = var135.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var135, var134, (SubLObject)module0235.$ic32$);
                var137 = var135.first();
                var135 = var135.rest();
                if (module0235.NIL == var135) {
                    if (module0235.NIL != module0193.f12067(var137)) {
                        final SubLObject var138 = module0233.f15340(var137, var132);
                        if (module0235.NIL != module0193.f12105(var136)) {
                            if (module0235.NIL != module0267.f17564(var136, var131) && module0235.NIL != module0267.f17566(var136, var132)) {
                                var129 = (SubLObject)ConsesLow.list(var138);
                            }
                        }
                        else {
                            var128.resetMultipleValues();
                            final SubLObject var139 = f15474(var136, var131, (SubLObject)module0235.UNPROVIDED, (SubLObject)module0235.UNPROVIDED);
                            final SubLObject var140 = var128.secondMultipleValue();
                            var128.resetMultipleValues();
                            if (module0235.NIL != var139 && module0235.NIL == module0233.f15405(var139, (SubLObject)ConsesLow.list(var138))) {
                                var129 = (SubLObject)ConsesLow.cons(var138, var139);
                                var130 = var140;
                            }
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var134, (SubLObject)module0235.$ic32$);
                }
            }
        }
        else if (var133.eql(module0235.$ic33$)) {
            final SubLObject var177_179 = module0035.f2016(var126);
            if (var177_179.eql((SubLObject)module0235.ONE_INTEGER) && module0235.NIL != module0193.f12067(var126.rest()) && module0235.$ic34$.eql(var132)) {
                var129 = (SubLObject)ConsesLow.list(module0233.f15340(var126.rest(), (SubLObject)ConsesLow.list(var131)));
            }
        }
        return Values.values(var129, var130);
    }
    
    public static SubLObject f15514(final SubLObject var126, final SubLObject var127) {
        final SubLThread var128 = SubLProcess.currentSubLThread();
        SubLObject var129 = (SubLObject)module0235.NIL;
        SubLObject var130 = (SubLObject)module0235.NIL;
        SubLObject var131 = (SubLObject)module0235.NIL;
        SubLObject var132 = (SubLObject)module0235.NIL;
        var128.resetMultipleValues();
        final SubLObject var185_186 = module0161.f10598(var127);
        final SubLObject var187_188 = var128.secondMultipleValue();
        var128.resetMultipleValues();
        var131 = var185_186;
        var132 = var187_188;
        final SubLObject var133 = var126.first();
        if (var133.eql(module0235.$ic31$)) {
            final SubLObject var177_189 = Sequences.length(var126.rest());
            if (var177_189.eql((SubLObject)module0235.TWO_INTEGER)) {
                SubLObject var135;
                final SubLObject var134 = var135 = var126.rest();
                SubLObject var136 = (SubLObject)module0235.NIL;
                SubLObject var137 = (SubLObject)module0235.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var135, var134, (SubLObject)module0235.$ic32$);
                var136 = var135.first();
                var135 = var135.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var135, var134, (SubLObject)module0235.$ic32$);
                var137 = var135.first();
                var135 = var135.rest();
                if (module0235.NIL == var135) {
                    SubLObject var138 = (SubLObject)module0235.NIL;
                    SubLObject var139 = (SubLObject)module0235.NIL;
                    SubLObject var140 = (SubLObject)module0235.NIL;
                    SubLObject var141 = (SubLObject)module0235.NIL;
                    if (module0235.NIL != module0193.f12105(var136)) {
                        if (module0235.NIL != module0267.f17564(var136, var131) && module0235.NIL != module0267.f17566(var136, var132)) {
                            var138 = module0233.f15403();
                            var139 = ConsesLow.append(f15518(var131, var136), f15519(var136, var132));
                        }
                    }
                    else {
                        var128.resetMultipleValues();
                        final SubLObject var194_195 = f15474(var136, var131, (SubLObject)module0235.UNPROVIDED, (SubLObject)module0235.UNPROVIDED);
                        final SubLObject var196_197 = var128.secondMultipleValue();
                        var128.resetMultipleValues();
                        var138 = var194_195;
                        var139 = var196_197;
                    }
                    if (module0235.NIL != module0193.f12105(var137)) {
                        if (module0235.NIL != module0267.f17565(var137, var132)) {
                            var140 = module0233.f15403();
                            var141 = f15520(var137, var132);
                        }
                    }
                    else {
                        var128.resetMultipleValues();
                        final SubLObject var198_199 = f15474(var137, var132, (SubLObject)module0235.UNPROVIDED, (SubLObject)module0235.UNPROVIDED);
                        final SubLObject var200_201 = var128.secondMultipleValue();
                        var128.resetMultipleValues();
                        var140 = var198_199;
                        var141 = var200_201;
                    }
                    if (module0235.NIL != var138 && module0235.NIL != var140 && module0235.NIL == module0233.f15405(var138, var140)) {
                        var129 = ConsesLow.append(var138, var140);
                        var130 = ConsesLow.append(var139, var141);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var134, (SubLObject)module0235.$ic32$);
                }
            }
        }
        else if (var133.eql(module0235.$ic33$)) {
            final SubLObject var177_190 = Sequences.length(var126.rest());
            if (var177_190.eql((SubLObject)module0235.ONE_INTEGER)) {
                SubLObject var143;
                final SubLObject var142 = var143 = var126.rest();
                SubLObject var136 = (SubLObject)module0235.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var143, var142, (SubLObject)module0235.$ic35$);
                var136 = var143.first();
                var143 = var143.rest();
                if (module0235.NIL == var143) {
                    if (module0235.$ic34$.eql(var132)) {
                        if (module0235.NIL != module0193.f12105(var136)) {
                            if (module0235.NIL != module0267.f17564(var136, var131)) {
                                var129 = module0233.f15403();
                                var130 = f15518(var131, var136);
                            }
                        }
                        else {
                            var128.resetMultipleValues();
                            final SubLObject var205_206 = f15474(var136, var131, (SubLObject)module0235.UNPROVIDED, (SubLObject)module0235.UNPROVIDED);
                            final SubLObject var207_208 = var128.secondMultipleValue();
                            var128.resetMultipleValues();
                            var129 = var205_206;
                            var130 = var207_208;
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var142, (SubLObject)module0235.$ic35$);
                }
            }
        }
        return Values.values(var129, var130);
    }
    
    public static SubLObject f15509(final SubLObject var209, final SubLObject var210) {
        final SubLThread var211 = SubLProcess.currentSubLThread();
        return (SubLObject)((module0235.NIL != module0234.$g2436$.getDynamicValue(var211)) ? ConsesLow.list(module0191.f11990((SubLObject)module0235.$ic36$, module0202.f12768(module0235.$ic37$, var209, var210), (SubLObject)module0235.UNPROVIDED, (SubLObject)module0235.UNPROVIDED)) : module0235.NIL);
    }
    
    public static SubLObject f15518(final SubLObject var211, final SubLObject var212) {
        final SubLThread var213 = SubLProcess.currentSubLThread();
        return (SubLObject)((module0235.NIL != module0234.$g2436$.getDynamicValue(var213)) ? ConsesLow.list(module0191.f11990((SubLObject)module0235.$ic38$, module0202.f12768(module0235.$ic39$, var211, var212), (SubLObject)module0235.UNPROVIDED, (SubLObject)module0235.UNPROVIDED)) : module0235.NIL);
    }
    
    public static SubLObject f15519(final SubLObject var213, final SubLObject var214) {
        final SubLThread var215 = SubLProcess.currentSubLThread();
        return (SubLObject)((module0235.NIL != module0234.$g2436$.getDynamicValue(var215)) ? ConsesLow.list(module0191.f11990((SubLObject)module0235.$ic38$, module0202.f12768(module0235.$ic40$, var213, var214), (SubLObject)module0235.UNPROVIDED, (SubLObject)module0235.UNPROVIDED)) : module0235.NIL);
    }
    
    public static SubLObject f15520(final SubLObject var215, final SubLObject var216) {
        final SubLThread var217 = SubLProcess.currentSubLThread();
        return (SubLObject)((module0235.NIL != module0234.$g2436$.getDynamicValue(var217)) ? ConsesLow.list(module0191.f11990((SubLObject)module0235.$ic38$, module0202.f12768(module0235.$ic41$, var215, var216), (SubLObject)module0235.UNPROVIDED, (SubLObject)module0235.UNPROVIDED)) : module0235.NIL);
    }
    
    public static SubLObject f15521() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0235", "f15474", "TERM-UNIFY", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0235", "f15475", "S#17161", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0235", "f15476", "S#18230", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0235", "f15477", "S#18231", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0235", "f15478", "S#18232", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0235", "f15479", "S#18233", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0235", "f15480", "S#18234", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0235", "f15481", "S#18235", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0235", "f15482", "S#18236", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0235", "f15484", "S#18220", 2, 2, false);
        new $f15484$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0235", "f15485", "S#18237", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0235", "f15487", "S#18238", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0235", "f15488", "S#18239", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0235", "f15489", "S#18240", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0235", "f15490", "S#18241", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0235", "f15491", "S#18242", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0235", "f15483", "S#18243", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0235", "f15486", "S#18244", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0235", "f15492", "S#18245", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0235", "f15493", "S#18246", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0235", "f15494", "S#18247", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0235", "f15495", "S#18248", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0235", "f15496", "S#18249", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0235", "f15497", "S#18250", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0235", "f15498", "S#18251", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0235", "f15499", "S#18252", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0235", "f15500", "S#18253", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0235", "f15501", "S#18254", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0235", "f15502", "S#18255", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0235", "f15503", "S#18256", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0235", "f15504", "S#18257", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0235", "f15506", "S#18258", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0235", "f15505", "S#18259", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0235", "f15507", "S#18260", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0235", "f15508", "S#18261", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0235", "f15510", "S#18262", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0235", "f15515", "S#18224", 0, 0, false);
        new $f15515$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0235", "f15516", "S#18263", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0235", "f15517", "S#18264", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0235", "f15511", "S#18265", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0235", "f15512", "S#18266", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0235", "f15513", "S#18267", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0235", "f15514", "S#18268", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0235", "f15509", "S#18269", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0235", "f15518", "S#18270", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0235", "f15519", "S#18271", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0235", "f15520", "S#18272", 2, 0, false);
        return (SubLObject)module0235.NIL;
    }
    
    public static SubLObject f15522() {
        module0235.$g2439$ = SubLFiles.deflexical("S#18273", (SubLObject)module0235.NIL);
        module0235.$g2440$ = SubLFiles.deflexical("S#18274", (SubLObject)module0235.NIL);
        return (SubLObject)module0235.NIL;
    }
    
    public static SubLObject f15523() {
        module0034.f1909((SubLObject)module0235.$ic16$);
        module0034.f1909((SubLObject)module0235.$ic27$);
        return (SubLObject)module0235.NIL;
    }
    
    public void declareFunctions() {
        f15521();
    }
    
    public void initializeVariables() {
        f15522();
    }
    
    public void runTopLevelForms() {
        f15523();
    }
    
    static {
        me = (SubLFile)new module0235();
        module0235.$g2439$ = null;
        module0235.$g2440$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("LISTP");
        $ic1$ = SubLObjectFactory.makeSymbol("S#18220", "CYC");
        $ic2$ = SubLObjectFactory.makeSymbol("CLAUSE-P");
        $ic3$ = SubLObjectFactory.makeSymbol("S#18237", "CYC");
        $ic4$ = SubLObjectFactory.makeSymbol("S#18062", "CYC");
        $ic5$ = SubLObjectFactory.makeSymbol("S#18204", "CYC");
        $ic6$ = SubLObjectFactory.makeSymbol("S#18239", "CYC");
        $ic7$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#142", "CYC"));
        $ic8$ = SubLObjectFactory.makeSymbol("S#18244", "CYC");
        $ic9$ = SubLObjectFactory.makeSymbol("S#18240", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#18241", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("VARIABLE-P");
        $ic12$ = SubLObjectFactory.makeSymbol("S#18077", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#3846", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("CAR");
        $ic15$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#18275", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#18276", "CYC"));
        $ic16$ = SubLObjectFactory.makeSymbol("S#18252", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#18273", "CYC");
        $ic18$ = SubLObjectFactory.makeInteger(512);
        $ic19$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic20$ = SubLObjectFactory.makeSymbol("S#5859", "CYC");
        $ic21$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("retainTerm"));
        $ic22$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#18277", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#18278", "CYC"));
        $ic23$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#18279", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#18280", "CYC"));
        $ic24$ = SubLObjectFactory.makeSymbol("OBJECT-TO-STRING");
        $ic25$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Always-TimeInterval"));
        $ic26$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TimePoint"));
        $ic27$ = SubLObjectFactory.makeSymbol("S#18265", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("S#18274", "CYC");
        $ic29$ = SubLObjectFactory.makeInteger(256);
        $ic30$ = SubLObjectFactory.makeSymbol("S#18224", "CYC");
        $ic31$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("MtTimeWithGranularityDimFn"));
        $ic32$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#18281", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#18282", "CYC"));
        $ic33$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("MtTimeDimFn"));
        $ic34$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Null-TimeParameter"));
        $ic35$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#18281", "CYC"));
        $ic36$ = SubLObjectFactory.makeKeyword("GENLMT");
        $ic37$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genlMt"));
        $ic38$ = SubLObjectFactory.makeKeyword("TIME");
        $ic39$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("temporallySubsumes"));
        $ic40$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("temporallySubsumes-InsType"));
        $ic41$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("temporallySubsumes-TypeType"));
    }
    
    public static final class $f15484$BinaryFunction extends BinaryFunction
    {
        public $f15484$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#18220"));
        }
        
        public SubLObject processItem(final SubLObject var35, final SubLObject var36) {
            return module0235.f15484(var35, var36, (SubLObject)$f15484$BinaryFunction.UNPROVIDED, (SubLObject)$f15484$BinaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f15515$ZeroArityFunction extends ZeroArityFunction
    {
        public $f15515$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#18224"));
        }
        
        public SubLObject processItem() {
            return module0235.f15515();
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0235.class
	Total time: 278 ms
	
	Decompiled with Procyon 0.5.32.
*/