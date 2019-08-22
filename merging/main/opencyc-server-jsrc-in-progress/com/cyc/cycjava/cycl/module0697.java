package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0697 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0697";
    public static final String myFingerPrint = "44eef388647cb7349a3dca02bdfe9c7a59ca574ac839275864555246870e1abd";
    public static SubLSymbol $g5477$;
    private static final SubLInteger $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLInteger $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLObject $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
    private static final SubLObject $ic13$;
    private static final SubLObject $ic14$;
    private static final SubLObject $ic15$;
    private static final SubLObject $ic16$;
    private static final SubLSymbol $ic17$;
    
    public static SubLObject f42483(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        module0030.f1600(var1, var2, $g5477$.getDynamicValue(var3), (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42484(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return Hashtables.gethash(var1, $g5477$.getDynamicValue(var2), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f42485(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = Hashtables.gethash(var1, $g5477$.getDynamicValue(var3), (SubLObject)UNPROVIDED);
        return module0004.f104(var2, var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f42486(final SubLObject var5, final SubLObject var6, final SubLObject var7) {
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var5;
        SubLObject var10 = (SubLObject)NIL;
        var10 = var9.first();
        while (NIL != var9) {
            SubLObject var9_12;
            final SubLObject var11 = var9_12 = f42487(var10, var6, var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var12 = (SubLObject)NIL;
            var12 = var9_12.first();
            while (NIL != var9_12) {
                final SubLObject var13 = module0178.f11335(var12);
                if (NIL == conses_high.member(var13, var8, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var8 = (SubLObject)ConsesLow.cons(var13, var8);
                }
                var9_12 = var9_12.rest();
                var12 = var9_12.first();
            }
            SubLObject var9_13 = module0035.remove_if_not(Symbols.symbol_function((SubLObject)$ic2$), var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var12 = (SubLObject)NIL;
            var12 = var9_13.first();
            while (NIL != var9_13) {
                f42483((SubLObject)ConsesLow.list(var10, module0178.f11335(var12)), (SubLObject)$ic1$);
                var9_13 = var9_13.rest();
                var12 = var9_13.first();
            }
            SubLObject var9_14 = f42488(var10, var6, var7);
            SubLObject var14 = (SubLObject)NIL;
            var14 = var9_14.first();
            while (NIL != var9_14) {
                f42483((SubLObject)ConsesLow.list(var10, var14), (SubLObject)$ic3$);
                var9_14 = var9_14.rest();
                var14 = var9_14.first();
            }
            var9 = var9.rest();
            var10 = var9.first();
        }
        final SubLObject var15 = Sequences.nreverse(f42489(Sort.sort(var8, Symbols.symbol_function((SubLObject)$ic4$), (SubLObject)UNPROVIDED), var7, (SubLObject)UNPROVIDED));
        SubLObject var16 = f42490(var15);
        SubLObject var17 = (SubLObject)NIL;
        var17 = var16.first();
        while (NIL != var16) {
            SubLObject var9_15 = var5;
            SubLObject var18 = (SubLObject)NIL;
            var18 = var9_15.first();
            while (NIL != var9_15) {
                if (NIL != f42491(var18, var17, var6, var7)) {
                    f42483((SubLObject)ConsesLow.list(var18, var17), (SubLObject)$ic5$);
                }
                var9_15 = var9_15.rest();
                var18 = var9_15.first();
            }
            var16 = var16.rest();
            var17 = var16.first();
        }
        return var15;
    }
    
    public static SubLObject f42489(final SubLObject var5, SubLObject var7, SubLObject var21) {
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)NIL;
        }
        if (var21 == UNPROVIDED) {
            var21 = (SubLObject)NIL;
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        if (NIL == var5) {
            return (SubLObject)NIL;
        }
        SubLObject var23 = (SubLObject)NIL;
        SubLObject var24 = (SubLObject)NIL;
        final SubLObject var25 = Hashtables.make_hash_table((SubLObject)$ic6$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var26 = var5.first();
        final SubLObject var27 = var5.rest();
        SubLObject var28 = (SubLObject)ZERO_INTEGER;
        SubLObject var29 = (SubLObject)NIL;
        if (NIL == var21 && ONE_INTEGER.equal(Sequences.length(var5))) {
            var23 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var26, var26), var23);
        }
        SubLObject var30 = var27;
        SubLObject var31 = (SubLObject)NIL;
        var31 = var30.first();
        while (NIL != var30) {
            Hashtables.sethash(var28, var25, var31);
            var28 = Numbers.add(var28, (SubLObject)ONE_INTEGER);
            var24 = (SubLObject)ConsesLow.cons(var31, var24);
            var30 = var30.rest();
            var31 = var30.first();
        }
        SubLObject var32 = (SubLObject)NIL;
        var32 = (SubLObject)ZERO_INTEGER;
        while (NIL == var29) {
            var31 = Hashtables.gethash(var32, var25, (SubLObject)UNPROVIDED);
            if (NIL == var31) {
                var29 = (SubLObject)T;
            }
            else {
                SubLObject var33 = (SubLObject)NIL;
                if (NIL == var7) {
                    final SubLObject var34 = module0147.$g2094$.currentBinding(var22);
                    final SubLObject var35 = module0147.$g2095$.currentBinding(var22);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic7$, var22);
                        module0147.$g2095$.bind($ic8$, var22);
                        var33 = module0256.f16637((SubLObject)ConsesLow.list(var26, var31), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0147.$g2095$.rebind(var35, var22);
                        module0147.$g2094$.rebind(var34, var22);
                    }
                }
                else {
                    var33 = module0256.f16637((SubLObject)ConsesLow.list(var26, var31), (SubLObject)NIL, var7, (SubLObject)UNPROVIDED);
                }
                SubLObject var36 = var33;
                SubLObject var37 = (SubLObject)NIL;
                var37 = var36.first();
                while (NIL != var36) {
                    if (var37.equal(var26)) {
                        var23 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var26, var31), var23);
                    }
                    else if (var37.equal(var31)) {
                        var23 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var31, var26), var23);
                    }
                    else if (NIL == module0004.f104(var37, var24, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        var23 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var37, var26), var23);
                        var23 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var37, var31), var23);
                        Hashtables.sethash(var28, var25, var37);
                        var28 = Numbers.add(var28, (SubLObject)ONE_INTEGER);
                        var24 = (SubLObject)ConsesLow.cons(var37, var24);
                    }
                    var36 = var36.rest();
                    var37 = var36.first();
                }
            }
            var32 = Numbers.add(var32, (SubLObject)ONE_INTEGER);
        }
        return f42492(conses_high.union(var23, f42489(Sequences.nreverse(var24), var7, (SubLObject)T), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f42487(final SubLObject var35, final SubLObject var6, final SubLObject var7, SubLObject var36, SubLObject var37) {
        if (var36 == UNPROVIDED) {
            var36 = (SubLObject)ONE_INTEGER;
        }
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)$ic9$;
        }
        final SubLThread var38 = SubLProcess.currentSubLThread();
        SubLObject var39 = (SubLObject)NIL;
        final SubLObject var40 = module0147.$g2094$.currentBinding(var38);
        final SubLObject var41 = module0147.$g2095$.currentBinding(var38);
        try {
            module0147.$g2094$.bind((SubLObject)$ic10$, var38);
            module0147.$g2095$.bind(var7, var38);
            if (NIL != module0158.f10010(var35, var36, var6)) {
                final SubLObject var42 = module0158.f10011(var35, var36, var6);
                SubLObject var43 = (SubLObject)NIL;
                final SubLObject var44 = (SubLObject)NIL;
                while (NIL == var43) {
                    final SubLObject var45 = module0052.f3695(var42, var44);
                    final SubLObject var46 = (SubLObject)makeBoolean(!var44.eql(var45));
                    if (NIL != var46) {
                        SubLObject var47 = (SubLObject)NIL;
                        try {
                            var47 = module0158.f10316(var45, (SubLObject)$ic11$, var37, (SubLObject)NIL);
                            SubLObject var40_45 = (SubLObject)NIL;
                            final SubLObject var41_46 = (SubLObject)NIL;
                            while (NIL == var40_45) {
                                final SubLObject var48 = module0052.f3695(var47, var41_46);
                                final SubLObject var43_47 = (SubLObject)makeBoolean(!var41_46.eql(var48));
                                if (NIL != var43_47) {
                                    final SubLObject var49 = var48;
                                    if (NIL == conses_high.member(var49, var39, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                        var39 = (SubLObject)ConsesLow.cons(var49, var39);
                                    }
                                }
                                var40_45 = (SubLObject)makeBoolean(NIL == var43_47);
                            }
                        }
                        finally {
                            final SubLObject var32_48 = Threads.$is_thread_performing_cleanupP$.currentBinding(var38);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var38);
                                if (NIL != var47) {
                                    module0158.f10319(var47);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var32_48, var38);
                            }
                        }
                    }
                    var43 = (SubLObject)makeBoolean(NIL == var46);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var41, var38);
            module0147.$g2094$.rebind(var40, var38);
        }
        return var39;
    }
    
    public static SubLObject f42493(final SubLObject var49, final SubLObject var6) {
        SubLObject var50 = (SubLObject)NIL;
        SubLObject var51 = var49;
        SubLObject var52 = (SubLObject)NIL;
        var52 = var51.first();
        while (NIL != var51) {
            var50 = ConsesLow.append(var50, module0226.f15062(var52, var6, (SubLObject)$ic12$));
            var51 = var51.rest();
            var52 = var51.first();
        }
        return Sequences.nreverse(Sort.sort(Sequences.remove_duplicates(var50, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)$ic4$), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f42488(final SubLObject var35, final SubLObject var6, final SubLObject var7) {
        if (var6.equal($ic13$) || NIL != module0260.f17089(var6, $ic13$, var7, (SubLObject)UNPROVIDED)) {
            return module0259.f16822(var35, var7, (SubLObject)UNPROVIDED);
        }
        if (var6.equal($ic14$) || NIL != module0260.f17089(var6, $ic14$, var7, (SubLObject)UNPROVIDED)) {
            return module0256.f16529(module0256.f16525(var35, var7, (SubLObject)UNPROVIDED), var7, (SubLObject)UNPROVIDED);
        }
        if (var6.equal($ic15$) || NIL != module0260.f17089(var6, $ic15$, var7, (SubLObject)UNPROVIDED)) {
            return module0260.f17007(var35, var7, (SubLObject)UNPROVIDED);
        }
        if (var6.equal($ic16$) || NIL != module0260.f17089(var6, $ic16$, var7, (SubLObject)UNPROVIDED)) {
            return module0262.f17301(var35, var7, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42491(final SubLObject var35, final SubLObject var17, final SubLObject var6, final SubLObject var7) {
        if (var6.equal($ic13$) || NIL != module0260.f17089(var6, $ic13$, var7, (SubLObject)UNPROVIDED)) {
            return module0259.f16854(var35, var17, var7, (SubLObject)UNPROVIDED);
        }
        if (var6.equal($ic14$) || NIL != module0260.f17089(var6, $ic14$, var7, (SubLObject)UNPROVIDED)) {
            return module0256.f16596(var35, var17, var7, (SubLObject)UNPROVIDED);
        }
        if (var6.equal($ic15$) || NIL != module0260.f17089(var6, $ic15$, var7, (SubLObject)UNPROVIDED)) {
            return module0260.f17091(var35, var17, var7, (SubLObject)UNPROVIDED);
        }
        if (var6.equal($ic16$) || NIL != module0260.f17089(var6, $ic16$, var7, (SubLObject)UNPROVIDED)) {
            return module0262.f17336(var35, var17, var7, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42494(final SubLObject var22, SubLObject var51, SubLObject var52, SubLObject var53, SubLObject var54) {
        if (var51 == UNPROVIDED) {
            var51 = (SubLObject)NIL;
        }
        if (var52 == UNPROVIDED) {
            var52 = (SubLObject)ZERO_INTEGER;
        }
        if (var53 == UNPROVIDED) {
            var53 = (SubLObject)NIL;
        }
        if (var54 == UNPROVIDED) {
            var54 = (SubLObject)NIL;
        }
        final SubLThread var55 = SubLProcess.currentSubLThread();
        if (NIL == var51) {
            var51 = f42495(var22).first();
        }
        if (NIL == var53) {
            var53 = f42496(var22, var51);
        }
        SubLObject var56 = (SubLObject)NIL;
        final SubLObject var57 = f42497(f42498(var22, var51), var53);
        var56 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var51, var52), var56);
        SubLObject var58 = var57;
        SubLObject var59 = (SubLObject)NIL;
        var59 = var58.first();
        while (NIL != var58) {
            if (!var51.equal(var59)) {
                if (NIL != f42499(var22, var51, var59, var54)) {
                    var54 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var51, var59), var54);
                }
                else {
                    var55.resetMultipleValues();
                    final SubLObject var60 = f42494(var22, var59, Numbers.add((SubLObject)ONE_INTEGER, var52), var53, var54);
                    final SubLObject var61 = var55.secondMultipleValue();
                    var55.resetMultipleValues();
                    var54 = conses_high.union(var54, var61, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
                    var56 = ConsesLow.append(var56, var60);
                }
            }
            var58 = var58.rest();
            var59 = var58.first();
        }
        return Values.values(var56, var54);
    }
    
    public static SubLObject f42500(final SubLObject var60, final SubLObject var51) {
        SubLObject var61 = var60;
        SubLObject var62 = (SubLObject)NIL;
        var62 = var61.first();
        while (NIL != var61) {
            final SubLObject var63 = var62.first();
            final SubLObject var64 = conses_high.second(var62);
            if (var63.equal(var51)) {
                return var64;
            }
            var61 = var61.rest();
            var62 = var61.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42496(final SubLObject var22, SubLObject var51) {
        if (var51 == UNPROVIDED) {
            var51 = (SubLObject)NIL;
        }
        if (NIL == var51) {
            var51 = f42495(var22).first();
        }
        SubLObject var52 = (SubLObject)NIL;
        SubLObject var53 = (SubLObject)ZERO_INTEGER;
        final SubLObject var54 = f42498(var22, var51);
        if (NIL != var54) {
            SubLObject var55 = var54;
            SubLObject var56 = (SubLObject)NIL;
            var56 = var55.first();
            while (NIL != var55) {
                SubLObject var57 = f42500(var52, var56);
                if (NIL == var57) {
                    final SubLObject var58 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f42496(var22, var56)));
                    final SubLObject var59 = var58.first();
                    var52 = conses_high.union(var52, var59, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
                    var57 = conses_high.second(var58);
                }
                var53 = Numbers.add(var53, Numbers.add((SubLObject)ONE_INTEGER, var57));
                var55 = var55.rest();
                var56 = var55.first();
            }
        }
        var52 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var51, var53), var52);
        return Values.values(var52, var53);
    }
    
    public static SubLObject f42499(final SubLObject var22, final SubLObject var68, final SubLObject var57, SubLObject var54) {
        if (var54 == UNPROVIDED) {
            var54 = (SubLObject)NIL;
        }
        return conses_high.set_difference(f42501(var22, var57), conses_high.union((SubLObject)ConsesLow.list(var68), f42501(var54, var57), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f42502(final SubLObject var69, final SubLObject var70) {
        final SubLObject var71 = var69.first();
        final SubLObject var72 = var70.first();
        final SubLObject var73 = conses_high.second(var69);
        final SubLObject var74 = conses_high.second(var70);
        if (var73.numE(var74)) {
            if (NIL != Strings.stringL(module0038.f2638(var71), module0038.f2638(var72), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                return (SubLObject)T;
            }
            return (SubLObject)NIL;
        }
        else {
            if (var73.numL(var74)) {
                return (SubLObject)T;
            }
            return (SubLObject)NIL;
        }
    }
    
    public static SubLObject f42497(final SubLObject var75, final SubLObject var53) {
        SubLObject var76 = (SubLObject)NIL;
        SubLObject var77 = (SubLObject)NIL;
        SubLObject var78 = var75;
        SubLObject var79 = (SubLObject)NIL;
        var79 = var78.first();
        while (NIL != var78) {
            final SubLObject var80 = f42500(var53, var79);
            var76 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var79, var80), var76);
            var78 = var78.rest();
            var79 = var78.first();
        }
        var78 = Sort.sort(var76, Symbols.symbol_function((SubLObject)$ic17$), (SubLObject)UNPROVIDED);
        SubLObject var81 = (SubLObject)NIL;
        var81 = var78.first();
        while (NIL != var78) {
            var77 = (SubLObject)ConsesLow.cons(var81.first(), var77);
            var78 = var78.rest();
            var81 = var78.first();
        }
        return Sequences.nreverse(var77);
    }
    
    public static SubLObject f42490(final SubLObject var22) {
        SubLObject var23 = (SubLObject)NIL;
        SubLObject var24 = var22;
        SubLObject var25 = (SubLObject)NIL;
        var25 = var24.first();
        while (NIL != var24) {
            final SubLObject var26 = var25.first();
            SubLObject var28;
            final SubLObject var27 = var28 = conses_high.second(var25);
            if (NIL == conses_high.member(var28, var23, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                var23 = (SubLObject)ConsesLow.cons(var28, var23);
            }
            var28 = var26;
            if (NIL == conses_high.member(var28, var23, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                var23 = (SubLObject)ConsesLow.cons(var28, var23);
            }
            var24 = var24.rest();
            var25 = var24.first();
        }
        return Sequences.nreverse(var23);
    }
    
    public static SubLObject f42495(final SubLObject var22) {
        SubLObject var23 = (SubLObject)NIL;
        SubLObject var24 = (SubLObject)NIL;
        SubLObject var25 = var22;
        SubLObject var26 = (SubLObject)NIL;
        var26 = var25.first();
        while (NIL != var25) {
            final SubLObject var27 = var26.first();
            final SubLObject var28 = conses_high.second(var26);
            var23 = (SubLObject)ConsesLow.cons(var27, var23);
            if (!var27.equal(var28)) {
                var24 = (SubLObject)ConsesLow.cons(var28, var24);
            }
            var25 = var25.rest();
            var26 = var25.first();
        }
        return Sequences.remove_duplicates(conses_high.set_difference(var23, var24, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f42503(final SubLObject var22) {
        SubLObject var23 = (SubLObject)NIL;
        SubLObject var24 = (SubLObject)NIL;
        SubLObject var25 = var22;
        SubLObject var26 = (SubLObject)NIL;
        var26 = var25.first();
        while (NIL != var25) {
            final SubLObject var27 = var26.first();
            final SubLObject var28 = conses_high.second(var26);
            var23 = (SubLObject)ConsesLow.cons(var28, var23);
            if (!var27.equal(var28)) {
                var24 = (SubLObject)ConsesLow.cons(var27, var24);
            }
            var25 = var25.rest();
            var26 = var25.first();
        }
        return Sequences.remove_duplicates(conses_high.set_difference(var23, var24, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f42498(final SubLObject var22, final SubLObject var51) {
        SubLObject var52 = (SubLObject)NIL;
        SubLObject var53 = var22;
        SubLObject var54 = (SubLObject)NIL;
        var54 = var53.first();
        while (NIL != var53) {
            final SubLObject var55 = var54.first();
            final SubLObject var56 = conses_high.second(var54);
            if (var51.equal(var55) && !var56.equal(var55)) {
                var52 = (SubLObject)ConsesLow.cons(var56, var52);
            }
            var53 = var53.rest();
            var54 = var53.first();
        }
        return var52;
    }
    
    public static SubLObject f42501(final SubLObject var22, final SubLObject var51) {
        SubLObject var52 = (SubLObject)NIL;
        SubLObject var53 = var22;
        SubLObject var54 = (SubLObject)NIL;
        var54 = var53.first();
        while (NIL != var53) {
            final SubLObject var55 = var54.first();
            final SubLObject var56 = conses_high.second(var54);
            if (var51.equal(var56) && !var56.equal(var55)) {
                var52 = (SubLObject)ConsesLow.cons(var55, var52);
            }
            var53 = var53.rest();
            var54 = var53.first();
        }
        return var52;
    }
    
    public static SubLObject f42504(final SubLObject var22) {
        SubLObject var23 = (SubLObject)NIL;
        SubLObject var24 = var22;
        SubLObject var25 = (SubLObject)NIL;
        var25 = var24.first();
        while (NIL != var24) {
            final SubLObject var26 = var25.first();
            final SubLObject var27 = conses_high.second(var25);
            if (!var26.equal(var27)) {
                var23 = (SubLObject)ConsesLow.cons(var25, var23);
            }
            var24 = var24.rest();
            var25 = var24.first();
        }
        return Sequences.nreverse(var23);
    }
    
    public static SubLObject f42492(final SubLObject var22) {
        SubLObject var23 = (SubLObject)NIL;
        SubLObject var24 = var22;
        SubLObject var25 = (SubLObject)NIL;
        var25 = var24.first();
        while (NIL != var24) {
            SubLObject var9_89 = var22;
            SubLObject var26 = (SubLObject)NIL;
            var26 = var9_89.first();
            while (NIL != var9_89) {
                final SubLObject var27 = var25.first();
                final SubLObject var28 = conses_high.second(var25);
                final SubLObject var29 = var26.first();
                final SubLObject var30 = conses_high.second(var26);
                if (!var27.equal(var28) && !var29.equal(var30)) {
                    if (var29.equal(var28) && !var27.equal(var30)) {
                        var23 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var27, var30), var23);
                    }
                    if (var27.equal(var30) && !var29.equal(var28)) {
                        var23 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var29, var28), var23);
                    }
                }
                var9_89 = var9_89.rest();
                var26 = var9_89.first();
            }
            var24 = var24.rest();
            var25 = var24.first();
        }
        return Sequences.nreverse(Sequences.remove_duplicates(conses_high.set_difference(var22, var23, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f42505() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0697", "f42483", "S#46471", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0697", "f42484", "S#46472", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0697", "f42485", "S#46473", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0697", "f42486", "S#46474", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0697", "f42489", "S#46475", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0697", "f42487", "S#46476", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0697", "f42493", "S#46477", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0697", "f42488", "S#46478", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0697", "f42491", "S#46479", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0697", "f42494", "S#46480", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0697", "f42500", "S#46481", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0697", "f42496", "S#46482", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0697", "f42499", "S#46483", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0697", "f42502", "S#46484", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0697", "f42497", "S#46485", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0697", "f42490", "S#46486", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0697", "f42495", "S#46487", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0697", "f42503", "S#46488", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0697", "f42498", "S#46489", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0697", "f42501", "S#46490", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0697", "f42504", "S#46491", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0697", "f42492", "S#46492", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42506() {
        $g5477$ = SubLFiles.defparameter("S#46493", Hashtables.make_hash_table((SubLObject)$ic0$, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42507() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f42505();
    }
    
    public void initializeVariables() {
        f42506();
    }
    
    public void runTopLevelForms() {
        f42507();
    }
    
    static {
        me = (SubLFile)new module0697();
        $g5477$ = null;
        $ic0$ = makeInteger(512);
        $ic1$ = makeKeyword("ASSERTED");
        $ic2$ = makeSymbol("ASSERTED-ASSERTION?");
        $ic3$ = makeKeyword("BASIS");
        $ic4$ = makeSymbol("S#17515", "CYC");
        $ic5$ = makeKeyword("IMPLIED");
        $ic6$ = makeInteger(64);
        $ic7$ = makeSymbol("S#12274", "CYC");
        $ic8$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic9$ = makeKeyword("TRUE");
        $ic10$ = makeSymbol("S#12276", "CYC");
        $ic11$ = makeKeyword("GAF");
        $ic12$ = ConsesLow.list((SubLObject)ONE_INTEGER);
        $ic13$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic14$ = constant_handles_oc.f8479((SubLObject)makeString("genls"));
        $ic15$ = constant_handles_oc.f8479((SubLObject)makeString("genlPreds"));
        $ic16$ = constant_handles_oc.f8479((SubLObject)makeString("genlMt"));
        $ic17$ = makeSymbol("S#46484", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 218 ms
	
	Decompiled with Procyon 0.5.32.
*/