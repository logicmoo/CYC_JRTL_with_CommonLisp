package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0335 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0335";
    public static final String myFingerPrint = "e82d432d8f6f2c1e711c7057cd764a3a7ba7dea0bc9b1ce5d99c8a86bcb157e5";
    public static SubLSymbol $g2856$;
    private static final SubLList $ic0$;
    private static final SubLList $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLString $ic10$;
    private static final SubLString $ic11$;
    private static final SubLString $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLList $ic14$;
    private static final SubLList $ic15$;
    private static final SubLList $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLList $ic19$;
    private static final SubLList $ic20$;
    private static final SubLString $ic21$;
    private static final SubLString $ic22$;
    private static final SubLString $ic23$;
    private static final SubLString $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    private static final SubLString $ic28$;
    private static final SubLString $ic29$;
    private static final SubLString $ic30$;
    private static final SubLString $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLString $ic35$;
    private static final SubLString $ic36$;
    private static final SubLString $ic37$;
    private static final SubLList $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLList $ic40$;
    private static final SubLList $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLList $ic43$;
    private static final SubLList $ic44$;
    private static final SubLString $ic45$;
    
    public static SubLObject f22574(final SubLObject var1) {
        return f22575(f22576(var1));
    }
    
    public static SubLObject f22575(final SubLObject var2) {
        if (NIL == var2) {
            return (SubLObject)NIL;
        }
        if (NIL != module0035.f1997(var2)) {
            return var2.first();
        }
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic0$);
        var3 = var2.first();
        SubLObject var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)$ic0$);
        var4 = var5.first();
        final SubLObject var6;
        var5 = (var6 = var5.rest());
        final SubLObject var7 = f22577(var3, var4);
        return f22575((SubLObject)ConsesLow.cons(var7, var6));
    }
    
    public static SubLObject f22577(final SubLObject var5, final SubLObject var6) {
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var5, (SubLObject)$ic1$);
        var7 = var5.first();
        SubLObject var9 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var5, (SubLObject)$ic1$);
        var8 = var9.first();
        var9 = var9.rest();
        if (NIL == var9) {
            SubLObject var10 = (SubLObject)NIL;
            SubLObject var11 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var6, var6, (SubLObject)$ic2$);
            var10 = var6.first();
            SubLObject var15_16 = var6.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var15_16, var6, (SubLObject)$ic2$);
            var11 = var15_16.first();
            var15_16 = var15_16.rest();
            if (NIL == var15_16) {
                final SubLObject var12 = f22578(var8, var11);
                final SubLObject var13 = module0262.f17370((SubLObject)ConsesLow.list(var7, var10), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).first();
                if (NIL != var12 && NIL != var13) {
                    return (SubLObject)ConsesLow.list(var13, var12);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var6, (SubLObject)$ic2$);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic1$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22578(final SubLObject var12, final SubLObject var18) {
        final SubLObject var19 = module0232.f15306(var12);
        final SubLObject var20 = module0232.f15308(var12);
        final SubLObject var21 = module0232.f15306(var18);
        final SubLObject var22 = module0232.f15308(var18);
        final SubLObject var23 = module0234.f15444(var19, var22, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0235.f15495(module0235.f15492(var12, var23), module0235.f15493(var18));
        if (NIL != var23) {
            return module0232.f15326(var21, module0233.f15361(var23, var20));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22576(final SubLObject var1) {
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic3$), var1);
    }
    
    public static SubLObject f22579(final SubLObject var26) {
        assert NIL != assertion_handles_oc.f11035(var26) : var26;
        return (SubLObject)ConsesLow.list(module0178.f11287(var26), module0178.f11282(var26));
    }
    
    public static SubLObject f22580(final SubLObject var27) {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        SubLObject var29 = (SubLObject)NIL;
        SubLObject var30 = (SubLObject)NIL;
        SubLObject var31 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var27, var27, (SubLObject)$ic5$);
        var29 = var27.first();
        SubLObject var32 = var27.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var32, var27, (SubLObject)$ic5$);
        var30 = var32.first();
        var32 = var32.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var32, var27, (SubLObject)$ic5$);
        var31 = var32.first();
        var32 = var32.rest();
        if (NIL == var32) {
            SubLObject var33 = (SubLObject)NIL;
            final SubLObject var34 = Sequences.reverse(var31);
            final SubLObject var35 = var34.first();
            final SubLObject var36 = $g2856$.currentBinding(var28);
            try {
                $g2856$.bind(var34.rest(), var28);
                SubLObject var39_40;
                final SubLObject var37_38 = var39_40 = var35;
                SubLObject var37 = (SubLObject)NIL;
                SubLObject var38 = (SubLObject)NIL;
                SubLObject var39 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var39_40, var37_38, (SubLObject)$ic6$);
                var37 = var39_40.first();
                var39_40 = var39_40.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var39_40, var37_38, (SubLObject)$ic6$);
                var38 = var39_40.first();
                var39_40 = var39_40.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var39_40, var37_38, (SubLObject)$ic6$);
                var39 = var39_40.first();
                var39_40 = var39_40.rest();
                if (NIL == var39_40) {
                    var33 = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons(var37, (SubLObject)$ic7$), var38, Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic8$), var39));
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var37_38, (SubLObject)$ic6$);
                }
            }
            finally {
                $g2856$.rebind(var36, var28);
            }
            return var33;
        }
        cdestructuring_bind.cdestructuring_bind_error(var27, (SubLObject)$ic5$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22581(final SubLObject var41, SubLObject var34) {
        if (var34 == UNPROVIDED) {
            var34 = $g2856$.getDynamicValue();
        }
        final SubLThread var42 = SubLProcess.currentSubLThread();
        SubLObject var43 = (SubLObject)NIL;
        final SubLObject var44 = conses_high.assoc(var41.first(), var34, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        final SubLObject var45 = $g2856$.currentBinding(var42);
        try {
            $g2856$.bind(Sequences.remove(var44, var34, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var42);
            if (NIL != var44) {
                SubLObject var47;
                final SubLObject var46 = var47 = var44;
                SubLObject var48 = (SubLObject)NIL;
                SubLObject var49 = (SubLObject)NIL;
                SubLObject var50 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var47, var46, (SubLObject)$ic9$);
                var48 = var47.first();
                var47 = var47.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var47, var46, (SubLObject)$ic9$);
                var49 = var47.first();
                var47 = var47.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var47, var46, (SubLObject)$ic9$);
                var50 = var47.first();
                final SubLObject var51;
                var47 = (var51 = var47.rest());
                var43 = (SubLObject)ConsesLow.list(var41, var49, Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic8$), var50));
            }
        }
        finally {
            $g2856$.rebind(var45, var42);
        }
        if (NIL != var43) {
            return var43;
        }
        if (module0018.$g621$.getDynamicValue(var42).numGE((SubLObject)FOUR_INTEGER)) {
            Errors.sublisp_break((SubLObject)$ic10$, new SubLObject[] { var43 });
        }
        else if (module0018.$g621$.getDynamicValue(var42).numGE((SubLObject)THREE_INTEGER)) {
            Errors.warn((SubLObject)$ic10$, var43);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22582(final SubLObject var49) {
        SubLObject var50 = var49;
        SubLObject var51 = (SubLObject)NIL;
        var51 = var50.first();
        while (NIL != var50) {
            f22583(var51);
            var50 = var50.rest();
            var51 = var50.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22583(final SubLObject var27) {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        final SubLObject var29 = f22580(var27);
        final SubLObject var30 = f22584(var29);
        if (NIL != var30) {
            module0018.$g620$.setDynamicValue((SubLObject)ConsesLow.cons(var30, module0018.$g620$.getDynamicValue(var28)), var28);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22584(final SubLObject var51) {
        final SubLThread var52 = SubLProcess.currentSubLThread();
        final SubLObject var53 = Sequences.nreverse(f22585(var51));
        if (NIL != var53) {
            var52.resetMultipleValues();
            final SubLObject var54 = f22586(var53);
            final SubLObject var55 = var52.secondMultipleValue();
            var52.resetMultipleValues();
            if (module0018.$g621$.getDynamicValue(var52).numGE((SubLObject)FOUR_INTEGER)) {
                Errors.sublisp_break((SubLObject)$ic11$, new SubLObject[] { var54, var55 });
            }
            else if (module0018.$g621$.getDynamicValue(var52).numGE((SubLObject)ONE_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic12$, var54, var55);
            }
            return (SubLObject)ConsesLow.list(var54, var55);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22586(final SubLObject var53) {
        final SubLThread var54 = SubLProcess.currentSubLThread();
        final SubLObject var55 = f22587(Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic13$), module0035.f2257(var53, Symbols.symbol_function((SubLObject)$ic4$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
        SubLObject var56 = (SubLObject)NIL;
        SubLObject var57 = (SubLObject)NIL;
        SubLObject var58 = (SubLObject)NIL;
        SubLObject var59 = (SubLObject)NIL;
        if (NIL != var55) {
            SubLObject var60 = var53;
            SubLObject var61 = (SubLObject)NIL;
            var61 = var60.first();
            while (NIL != var60) {
                SubLObject var63;
                final SubLObject var62 = var63 = var61;
                SubLObject var64 = (SubLObject)NIL;
                SubLObject var65 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var63, var62, (SubLObject)$ic14$);
                var64 = var63.first();
                var63 = var63.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var63, var62, (SubLObject)$ic14$);
                var65 = var63.first();
                var63 = var63.rest();
                if (NIL == var63) {
                    SubLObject var66_67;
                    final SubLObject var64_65 = var66_67 = var64;
                    SubLObject var66 = (SubLObject)NIL;
                    SubLObject var67 = (SubLObject)NIL;
                    SubLObject var68 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var66_67, var64_65, (SubLObject)$ic15$);
                    var66 = var66_67.first();
                    var66_67 = var66_67.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var66_67, var64_65, (SubLObject)$ic15$);
                    var67 = var66_67.first();
                    var66_67 = var66_67.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var66_67, var64_65, (SubLObject)$ic15$);
                    var68 = var66_67.first();
                    var66_67 = var66_67.rest();
                    if (NIL == var66_67) {
                        SubLObject var73_74;
                        final SubLObject var71_72 = var73_74 = var65;
                        SubLObject var69 = (SubLObject)NIL;
                        SubLObject var70 = (SubLObject)NIL;
                        SubLObject var71 = (SubLObject)NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var73_74, var71_72, (SubLObject)$ic16$);
                        var69 = var73_74.first();
                        var73_74 = var73_74.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var73_74, var71_72, (SubLObject)$ic16$);
                        var70 = var73_74.first();
                        var73_74 = var73_74.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var73_74, var71_72, (SubLObject)$ic16$);
                        var71 = var73_74.first();
                        var73_74 = var73_74.rest();
                        if (NIL == var73_74) {
                            if (var67.eql((SubLObject)$ic17$) && var70.eql((SubLObject)$ic7$) && (NIL == var59 || var59.eql(var69))) {
                                var59 = var66;
                                final SubLObject var72 = conses_high.copy_tree(module0178.f11282(var66));
                                final SubLObject var73 = (NIL != var57) ? var57 : conses_high.copy_tree(module0178.f11282(var69));
                                final SubLObject var74 = conses_high.copy_list(module0178.f11294(var66));
                                final SubLObject var75 = (NIL != var58) ? var58 : conses_high.copy_list(module0178.f11294(var69));
                                var54.resetMultipleValues();
                                final SubLObject var76 = f22588((SubLObject)ConsesLow.listS(var72, var74, var67, var68), (SubLObject)ConsesLow.listS(var73, var75, var70, var71));
                                final SubLObject var77 = var54.secondMultipleValue();
                                var54.resetMultipleValues();
                                var57 = var76;
                                var58 = var77;
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var71_72, (SubLObject)$ic16$);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var64_65, (SubLObject)$ic15$);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var62, (SubLObject)$ic14$);
                }
                var60 = var60.rest();
                var61 = var60.first();
            }
        }
        if (NIL != var57) {
            var56 = module0538.f33479(module0232.f15328(var57, (SubLObject)UNPROVIDED), Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic18$), var58));
        }
        return Values.values(var56, var55);
    }
    
    public static SubLObject f22588(final SubLObject var81, final SubLObject var82) {
        final SubLThread var83 = SubLProcess.currentSubLThread();
        SubLObject var84 = (SubLObject)NIL;
        SubLObject var85 = (SubLObject)NIL;
        SubLObject var86 = (SubLObject)NIL;
        SubLObject var87 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var81, var81, (SubLObject)$ic19$);
        var84 = var81.first();
        SubLObject var88 = var81.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var88, var81, (SubLObject)$ic19$);
        var85 = var88.first();
        var88 = var88.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var88, var81, (SubLObject)$ic19$);
        var86 = var88.first();
        var88 = (var87 = var88.rest());
        SubLObject var89 = (SubLObject)NIL;
        SubLObject var90 = (SubLObject)NIL;
        SubLObject var91 = (SubLObject)NIL;
        SubLObject var92 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var82, var82, (SubLObject)$ic20$);
        var89 = var82.first();
        SubLObject var87_88 = var82.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var87_88, var82, (SubLObject)$ic20$);
        var90 = var87_88.first();
        var87_88 = var87_88.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var87_88, var82, (SubLObject)$ic20$);
        var91 = var87_88.first();
        var87_88 = (var92 = var87_88.rest());
        final SubLObject var93 = module0232.f15308(var84);
        final SubLObject var94 = module0232.f15306(var84);
        final SubLObject var95 = module0232.f15308(var89);
        final SubLObject var96 = module0232.f15306(var89);
        final SubLObject var97 = f22589(var84, var86, var87);
        final SubLObject var98 = f22589(var89, var91, var92);
        final SubLObject var99 = module0234.f15444(var97, var98, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var100 = module0235.f15492(var84, var99);
        final SubLObject var101 = conses_high.sublis(var100, Sequences.remove(var97, var94, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var102 = conses_high.sublis(var100, var93, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var103 = module0232.f15326(conses_high.union(var101, var96, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED), var102);
        final SubLObject var104 = module0235.f15493(var103);
        final SubLObject var105 = module0235.f15495(var100, var104);
        final SubLObject var106 = conses_high.sublis(var104, var103, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var107 = f22590(var85, var90, var105);
        if (module0018.$g621$.getDynamicValue(var83).numGE((SubLObject)FIVE_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic21$, var84);
        }
        if (module0018.$g621$.getDynamicValue(var83).numGE((SubLObject)FIVE_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic22$, var89);
        }
        if (module0018.$g621$.getDynamicValue(var83).numGE((SubLObject)FIVE_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic23$, var97);
        }
        if (module0018.$g621$.getDynamicValue(var83).numGE((SubLObject)FIVE_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic24$, var98);
        }
        if (module0018.$g621$.getDynamicValue(var83).numGE((SubLObject)FIVE_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic25$, var99);
        }
        if (module0018.$g621$.getDynamicValue(var83).numGE((SubLObject)FIVE_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic26$, var93);
        }
        if (module0018.$g621$.getDynamicValue(var83).numGE((SubLObject)FIVE_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic27$, var101);
        }
        if (module0018.$g621$.getDynamicValue(var83).numGE((SubLObject)FIVE_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic28$, var96);
        }
        if (module0018.$g621$.getDynamicValue(var83).numGE((SubLObject)FIVE_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic29$, var100);
        }
        if (module0018.$g621$.getDynamicValue(var83).numGE((SubLObject)FIVE_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic30$, var104);
        }
        if (module0018.$g621$.getDynamicValue(var83).numGE((SubLObject)FIVE_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic31$, var105);
        }
        if (module0018.$g621$.getDynamicValue(var83).numGE((SubLObject)FIVE_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic32$, var106);
        }
        if (module0018.$g621$.getDynamicValue(var83).numGE((SubLObject)FIVE_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic33$, var85);
        }
        if (module0018.$g621$.getDynamicValue(var83).numGE((SubLObject)FIVE_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic34$, var90);
        }
        if (module0018.$g621$.getDynamicValue(var83).numGE((SubLObject)FIVE_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic35$, var107);
        }
        if (module0018.$g621$.getDynamicValue(var83).numGE((SubLObject)THREE_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic36$, module0538.f33479(module0232.f15328(conses_high.copy_tree(var106), (SubLObject)UNPROVIDED), var107));
        }
        if (module0018.$g621$.getDynamicValue(var83).numGE((SubLObject)FIVE_INTEGER)) {
            Errors.sublisp_break((SubLObject)$ic37$, EMPTY_SUBL_OBJECT_ARRAY);
        }
        return Values.values(var106, var107);
    }
    
    public static SubLObject f22590(final SubLObject var78, final SubLObject var79, final SubLObject var25) {
        SubLObject var80 = (SubLObject)NIL;
        final SubLObject var81 = Sequences.length(var79);
        SubLObject var82 = var25;
        SubLObject var83 = (SubLObject)NIL;
        var83 = var82.first();
        while (NIL != var82) {
            SubLObject var85;
            final SubLObject var84 = var85 = var83;
            SubLObject var86 = (SubLObject)NIL;
            SubLObject var87 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)$ic38$);
            var86 = var85.first();
            var85 = (var87 = var85.rest());
            if (module0193.f12073(var87).numGE(var81)) {
                var80 = (SubLObject)ConsesLow.cons(ConsesLow.nth(module0193.f12073(var86), var78), var80);
            }
            var82 = var82.rest();
            var83 = var82.first();
        }
        return ConsesLow.nconc(var79, Sequences.nreverse(var80));
    }
    
    public static SubLObject f22587(final SubLObject var55) {
        return module0262.f17370(var55, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f22589(final SubLObject var56, final SubLObject var104, final SubLObject var105) {
        if (var104.eql((SubLObject)$ic7$)) {
            return ConsesLow.nth(var105, module0232.f15308(var56));
        }
        if (var104.eql((SubLObject)$ic17$)) {
            return ConsesLow.nth(var105, module0232.f15306(var56));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22591(final SubLObject var107) {
        return Sequences.remove((SubLObject)NIL, Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic39$), var107), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f22585(final SubLObject var51) {
        final SubLThread var52 = SubLProcess.currentSubLThread();
        SubLObject var53 = (SubLObject)NIL;
        if (THREE_INTEGER.numE(Sequences.length(var51))) {
            SubLObject var54 = (SubLObject)NIL;
            SubLObject var55 = (SubLObject)NIL;
            SubLObject var56 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var51, var51, (SubLObject)$ic40$);
            var54 = var51.first();
            SubLObject var57 = var51.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var57, var51, (SubLObject)$ic40$);
            var55 = var57.first();
            var57 = var57.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var57, var51, (SubLObject)$ic40$);
            var56 = var57.first();
            var57 = var57.rest();
            if (NIL == var57) {
                SubLObject var114_115;
                final SubLObject var112_113 = var114_115 = var54;
                SubLObject var58 = (SubLObject)NIL;
                SubLObject var59 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var114_115, var112_113, (SubLObject)$ic41$);
                var58 = var114_115.first();
                var114_115 = (var59 = var114_115.rest());
                if (NIL != assertion_handles_oc.f11035(var55)) {
                    var52.resetMultipleValues();
                    final SubLObject var60 = f22592(Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic42$), var56));
                    final SubLObject var61 = var52.secondMultipleValue();
                    var52.resetMultipleValues();
                    final SubLObject var62 = module0178.f11282(var55);
                    final SubLObject var63 = f22593(var62, var58, var60, var61);
                    final SubLObject var64 = module0232.f15308(var63);
                    final SubLObject var65 = module0232.f15306(var63);
                    SubLObject var66 = var56;
                    SubLObject var67 = (SubLObject)NIL;
                    var67 = var66.first();
                    while (NIL != var66) {
                        if (Sequences.length(var67).numGE((SubLObject)THREE_INTEGER)) {
                            SubLObject var126_127;
                            final SubLObject var124_125 = var126_127 = var67;
                            SubLObject var68 = (SubLObject)NIL;
                            SubLObject var69 = (SubLObject)NIL;
                            SubLObject var70 = (SubLObject)NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var126_127, var124_125, (SubLObject)$ic43$);
                            var68 = var126_127.first();
                            var126_127 = var126_127.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var126_127, var124_125, (SubLObject)$ic43$);
                            var69 = var126_127.first();
                            var126_127 = var126_127.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var126_127, var124_125, (SubLObject)$ic43$);
                            var70 = var126_127.first();
                            final SubLObject var71;
                            var126_127 = (var71 = var126_127.rest());
                            if (NIL != assertion_handles_oc.f11035(var69) && NIL == module0178.f11284(var69)) {
                                SubLObject var131_132;
                                final SubLObject var129_130 = var131_132 = var68;
                                SubLObject var72 = (SubLObject)NIL;
                                SubLObject var117_133 = (SubLObject)NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(var131_132, var129_130, (SubLObject)$ic44$);
                                var72 = var131_132.first();
                                var131_132 = (var117_133 = var131_132.rest());
                                SubLObject var73 = (SubLObject)NIL;
                                SubLObject var74 = (SubLObject)NIL;
                                final SubLObject var75 = var117_133;
                                if (var75.eql((SubLObject)$ic7$)) {
                                    var74 = (SubLObject)$ic17$;
                                    var73 = Sequences.position(var72, var65, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                }
                                else if (var75.eql((SubLObject)$ic17$)) {
                                    var74 = (SubLObject)$ic7$;
                                    var73 = Sequences.position(var72, var64, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                }
                                var53 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var55, var74, var73), (SubLObject)ConsesLow.list(var69, (SubLObject)$ic7$, (SubLObject)ZERO_INTEGER)), var53);
                                var53 = ConsesLow.append(var53, f22585(var67));
                            }
                        }
                        var66 = var66.rest();
                        var67 = var66.first();
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var51, (SubLObject)$ic40$);
            }
        }
        return var53;
    }
    
    public static SubLObject f22592(final SubLObject var135) {
        SubLObject var136 = (SubLObject)NIL;
        SubLObject var137 = (SubLObject)NIL;
        SubLObject var138 = var135;
        SubLObject var139 = (SubLObject)NIL;
        var139 = var138.first();
        while (NIL != var138) {
            final SubLObject var140 = var139.rest();
            if (var140.eql((SubLObject)$ic7$)) {
                var136 = (SubLObject)ConsesLow.cons(var139.first(), var136);
            }
            else if (var140.eql((SubLObject)$ic17$)) {
                var137 = (SubLObject)ConsesLow.cons(var139.first(), var137);
            }
            var138 = var138.rest();
            var139 = var138.first();
        }
        return Values.values(Sequences.nreverse(var136), Sequences.nreverse(var137));
    }
    
    public static SubLObject f22593(final SubLObject var56, final SubLObject var136, final SubLObject var137, SubLObject var138) {
        if (var138 == UNPROVIDED) {
            var138 = (SubLObject)NIL;
        }
        final SubLThread var139 = SubLProcess.currentSubLThread();
        final SubLObject var140 = module0232.f15308(var56);
        final SubLObject var141 = module0234.f15444(var140, (SubLObject)ConsesLow.cons(var136, var138), (SubLObject)T, (SubLObject)UNPROVIDED);
        final SubLObject var142 = module0233.f15361(var141, module0232.f15306(var56));
        final SubLObject var143 = module0234.f15444(var142, var137, (SubLObject)T, (SubLObject)UNPROVIDED);
        final SubLObject var144 = module0233.f15361(var143, module0233.f15361(var141, var56));
        if (NIL != var144 && NIL != module0193.f12105(var144)) {
            return var144;
        }
        if (module0018.$g621$.getDynamicValue(var139).numGE((SubLObject)FOUR_INTEGER)) {
            Errors.sublisp_break((SubLObject)$ic45$, new SubLObject[] { var144 });
        }
        else if (module0018.$g621$.getDynamicValue(var139).numGE((SubLObject)THREE_INTEGER)) {
            Errors.warn((SubLObject)$ic45$, var144);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22594() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0335", "f22574", "S#25143", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0335", "f22575", "S#25144", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0335", "f22577", "S#25145", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0335", "f22578", "S#25146", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0335", "f22576", "S#25147", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0335", "f22579", "S#25148", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0335", "f22580", "S#25149", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0335", "f22581", "S#25150", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0335", "f22582", "S#25151", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0335", "f22583", "S#25152", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0335", "f22584", "S#25153", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0335", "f22586", "S#25154", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0335", "f22588", "S#25155", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0335", "f22590", "S#25156", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0335", "f22587", "S#25157", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0335", "f22589", "S#25158", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0335", "f22591", "S#25159", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0335", "f22585", "S#25160", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0335", "f22592", "S#25161", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0335", "f22593", "S#25162", 3, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22595() {
        $g2856$ = SubLFiles.defparameter("S#25163", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22596() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f22594();
    }
    
    public void initializeVariables() {
        f22595();
    }
    
    public void runTopLevelForms() {
        f22596();
    }
    
    static {
        me = (SubLFile)new module0335();
        $g2856$ = null;
        $ic0$ = ConsesLow.list((SubLObject)makeSymbol("S#25164", "CYC"), (SubLObject)makeSymbol("S#25165", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#25166", "CYC"));
        $ic1$ = ConsesLow.list((SubLObject)makeSymbol("S#25167", "CYC"), (SubLObject)makeSymbol("S#25168", "CYC"));
        $ic2$ = ConsesLow.list((SubLObject)makeSymbol("S#25169", "CYC"), (SubLObject)makeSymbol("S#25170", "CYC"));
        $ic3$ = makeSymbol("S#25148", "CYC");
        $ic4$ = makeSymbol("ASSERTION-P");
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#713", "CYC"), (SubLObject)makeSymbol("S#25171", "CYC"), (SubLObject)makeSymbol("S#25172", "CYC"));
        $ic6$ = ConsesLow.list((SubLObject)makeSymbol("S#25173", "CYC"), (SubLObject)makeSymbol("S#14595", "CYC"), (SubLObject)makeSymbol("S#25174", "CYC"));
        $ic7$ = makeKeyword("POS");
        $ic8$ = makeSymbol("S#25150", "CYC");
        $ic9$ = ConsesLow.list((SubLObject)makeSymbol("S#12398", "CYC"), (SubLObject)makeSymbol("S#14595", "CYC"), (SubLObject)makeSymbol("S#25174", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#24422", "CYC"));
        $ic10$ = makeString("sub-justs = ~s");
        $ic11$ = makeString("ebl rule & mts: ~%~s ~%~s");
        $ic12$ = makeString("~%~%ebl rule & mts: ~%~s ~%~s");
        $ic13$ = makeSymbol("ASSERTION-MT");
        $ic14$ = ConsesLow.list((SubLObject)makeSymbol("S#25175", "CYC"), (SubLObject)makeSymbol("S#25176", "CYC"));
        $ic15$ = ConsesLow.list((SubLObject)makeSymbol("S#25177", "CYC"), (SubLObject)makeSymbol("S#25178", "CYC"), (SubLObject)makeSymbol("S#25179", "CYC"));
        $ic16$ = ConsesLow.list((SubLObject)makeSymbol("S#25180", "CYC"), (SubLObject)makeSymbol("S#25181", "CYC"), (SubLObject)makeSymbol("S#25182", "CYC"));
        $ic17$ = makeKeyword("NEG");
        $ic18$ = makeSymbol("INTERN");
        $ic19$ = ConsesLow.listS((SubLObject)makeSymbol("S#25168", "CYC"), (SubLObject)makeSymbol("S#25183", "CYC"), (SubLObject)makeSymbol("S#25178", "CYC"), (SubLObject)makeSymbol("S#25179", "CYC"));
        $ic20$ = ConsesLow.listS((SubLObject)makeSymbol("S#25170", "CYC"), (SubLObject)makeSymbol("S#25184", "CYC"), (SubLObject)makeSymbol("S#25181", "CYC"), (SubLObject)makeSymbol("S#25182", "CYC"));
        $ic21$ = makeString("~% cnf-1 : ~s");
        $ic22$ = makeString("~% cnf-2 : ~s");
        $ic23$ = makeString("~% lit-1 : ~s");
        $ic24$ = makeString("~% lit-2 : ~s");
        $ic25$ = makeString("~% blist : ~s");
        $ic26$ = makeString("~% pos-lits-1 : ~s");
        $ic27$ = makeString("~% new-neg-lits-1 : ~s");
        $ic28$ = makeString("~% neg-lits-2 : ~s");
        $ic29$ = makeString("~%~% parent-to-unify-bindings : ~s");
        $ic30$ = makeString("~% unify-to-child-bindings : ~s");
        $ic31$ = makeString("~% parent-to-child-bindings : ~s");
        $ic32$ = makeString("~% new-cnf : ~s");
        $ic33$ = makeString("~% vnames-1 : ~s");
        $ic34$ = makeString("~% vnames-2 : ~s");
        $ic35$ = makeString("~% new names : ~s");
        $ic36$ = makeString("~% new rule : ~s");
        $ic37$ = makeString("stop");
        $ic38$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#25185", "CYC"), (SubLObject)makeSymbol("S#25186", "CYC"));
        $ic39$ = makeSymbol("S#25160", "CYC");
        $ic40$ = ConsesLow.list((SubLObject)makeSymbol("S#25187", "CYC"), (SubLObject)makeSymbol("ASSERTION", "CYC"), (SubLObject)makeSymbol("S#25188", "CYC"));
        $ic41$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#25189", "CYC"), (SubLObject)makeSymbol("S#12576", "CYC"));
        $ic42$ = makeSymbol("CAR");
        $ic43$ = ConsesLow.list((SubLObject)makeSymbol("S#25190", "CYC"), (SubLObject)makeSymbol("S#14595", "CYC"), (SubLObject)makeSymbol("S#25174", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#24422", "CYC"));
        $ic44$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#12398", "CYC"), (SubLObject)makeSymbol("S#12576", "CYC"));
        $ic45$ = makeString("cnf not fully bound ~s");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 180 ms
	
	Decompiled with Procyon 0.5.32.
*/