package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0276 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0276";
    public static final String myFingerPrint = "a2a8ad8e3f11435a6ee144e5958a106165ca451590dac58d1abece76953c20b3";
    private static SubLSymbol $g2595$;
    private static SubLSymbol $g2596$;
    private static SubLSymbol $g2597$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLObject $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLObject $ic11$;
    private static final SubLObject $ic12$;
    private static final SubLString $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLObject $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLString $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLList $ic24$;
    private static final SubLObject $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLObject $ic29$;
    private static final SubLObject $ic30$;
    private static final SubLObject $ic31$;
    private static final SubLObject $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLObject $ic34$;
    private static final SubLList $ic35$;
    private static final SubLInteger $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLString $ic39$;
    private static final SubLList $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLList $ic44$;
    private static final SubLList $ic45$;
    private static final SubLList $ic46$;
    private static final SubLList $ic47$;
    
    public static SubLObject f18278(final SubLObject var1) {
        return f18279(conses_high.copy_tree(var1));
    }
    
    public static SubLObject f18279(SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        var3 = var1;
        var4 = module0202.f12741(var3);
        while (NIL != var3) {
            if (NIL != module0202.f12594(var4)) {
                final SubLObject var5 = module0205.f13377(var4, (SubLObject)UNPROVIDED);
                final SubLObject var6 = module0202.f12742(var3);
                final SubLObject var7 = f18279(var5);
                final SubLObject var8 = conses_high.last(var7, (SubLObject)UNPROVIDED);
                if (NIL == var7) {
                    if (NIL == var2) {
                        var1 = var6;
                    }
                    else {
                        ConsesLow.rplacd(var2, var6);
                    }
                }
                else {
                    if (var7.eql(var8)) {
                        ConsesLow.rplaca(var3, module0202.f12741(var7));
                    }
                    else {
                        ConsesLow.rplacd(var8, var6);
                        ConsesLow.rplaca(var3, module0202.f12741(var7));
                        ConsesLow.rplacd(var3, module0202.f12742(var7));
                        var3 = var8;
                    }
                    var2 = var3;
                }
            }
            else {
                var2 = var3;
            }
            var3 = module0202.f12742(var3);
            var4 = module0202.f12741(var3);
        }
        return var1;
    }
    
    public static SubLObject f18280(final SubLObject var9, SubLObject var10) {
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        return f18281((NIL != var10) ? conses_high.copy_tree(var9) : var9, var10);
    }
    
    public static SubLObject f18281(final SubLObject var9, SubLObject var10) {
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)T;
        }
        assert NIL != Types.listp(var9) : var9;
        final SubLObject var11 = (NIL != var10) ? f18279(var9) : var9;
        return module0202.f12772(var11);
    }
    
    public static SubLObject f18282(final SubLObject var11) {
        if (NIL != module0207.f13513(var11) && (NIL != module0202.f12594(var11) || NIL != module0202.f12595(var11))) {
            return module0205.f13379(var11, (SubLObject)UNPROVIDED);
        }
        return var11;
    }
    
    public static SubLObject f18283(final SubLObject var11) {
        if (NIL == module0202.f12594(var11) && NIL == module0202.f12595(var11)) {
            return var11;
        }
        if (NIL != module0207.f13513(var11)) {
            return f18283(module0205.f13379(var11, (SubLObject)UNPROVIDED));
        }
        return module0202.f12799(Symbols.symbol_function((SubLObject)$ic1$), var11, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f18284(final SubLObject var11) {
        if (NIL != module0202.f12594(var11) || NIL != module0202.f12595(var11)) {
            return Sequences.remove_duplicates(module0202.f12799(Symbols.symbol_function((SubLObject)$ic2$), var11, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return var11;
    }
    
    public static SubLObject f18285(final SubLObject var12) {
        return f18286(conses_high.copy_tree(var12));
    }
    
    public static SubLObject f18286(SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        var14 = var12;
        var15 = module0202.f12741(var14);
        while (NIL != var14) {
            if (NIL != module0202.f12595(var15)) {
                final SubLObject var16 = module0205.f13377(var15, (SubLObject)UNPROVIDED);
                final SubLObject var17 = module0202.f12742(var14);
                final SubLObject var18 = f18286(var16);
                final SubLObject var19 = conses_high.last(var18, (SubLObject)UNPROVIDED);
                if (NIL == var18) {
                    if (NIL == var13) {
                        var12 = var17;
                    }
                    else {
                        ConsesLow.rplacd(var13, var17);
                    }
                }
                else {
                    if (var18.eql(var19)) {
                        ConsesLow.rplaca(var14, module0202.f12741(var18));
                    }
                    else {
                        ConsesLow.rplacd(var19, var17);
                        ConsesLow.rplaca(var14, module0202.f12741(var18));
                        ConsesLow.rplacd(var14, module0202.f12742(var18));
                        var14 = var19;
                    }
                    var13 = var14;
                }
            }
            else {
                var13 = var14;
            }
            var14 = module0202.f12742(var14);
            var15 = module0202.f12741(var14);
        }
        return var12;
    }
    
    public static SubLObject f18287(final SubLObject var9, SubLObject var10) {
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        return f18288((NIL != var10) ? conses_high.copy_tree(var9) : var9, var10);
    }
    
    public static SubLObject f18288(final SubLObject var9, SubLObject var10) {
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)T;
        }
        assert NIL != Types.listp(var9) : var9;
        return module0202.f12773((NIL != var10) ? f18286(var9) : var9);
    }
    
    public static SubLObject f18289(final SubLObject var9, SubLObject var10) {
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)T;
        }
        if (NIL == var9) {
            return (SubLObject)NIL;
        }
        if (NIL != module0035.f1997(var9)) {
            return module0035.f2113(var9);
        }
        return f18287(var9, var10);
    }
    
    public static SubLObject f18290(final SubLObject var12) {
        return module0205.f13147(var12, (SubLObject)$ic3$, (SubLObject)$ic4$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f18291(final SubLObject var12) {
        return (SubLObject)makeBoolean(var12.isList() && NIL != module0035.f2369((SubLObject)$ic5$, var12, (SubLObject)UNPROVIDED) && !var12.equal(f18285(var12)));
    }
    
    public static SubLObject f18292(final SubLObject var11, SubLObject var15) {
        if (var15 == UNPROVIDED) {
            var15 = Symbols.symbol_function((SubLObject)$ic6$);
        }
        final SubLThread var16 = SubLProcess.currentSubLThread();
        SubLObject var17 = (SubLObject)NIL;
        final SubLObject var18 = module0146.$g2057$.currentBinding(var16);
        try {
            module0146.$g2057$.bind((SubLObject)NIL, var16);
            var17 = f18293(var11, var15);
        }
        finally {
            module0146.$g2057$.rebind(var18, var16);
        }
        return var17;
    }
    
    public static SubLObject f18294(final SubLObject var19, SubLObject var20, SubLObject var21) {
        if (var20 == UNPROVIDED) {
            var20 = Symbols.symbol_function((SubLObject)$ic7$);
        }
        if (var21 == UNPROVIDED) {
            var21 = (SubLObject)NIL;
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        if (NIL != module0146.$g2058$.getDynamicValue(var22)) {
            SubLObject var23 = (SubLObject)NIL;
            SubLObject var24 = (SubLObject)NIL;
            final SubLObject var25 = module0146.$g2059$.currentBinding(var22);
            try {
                module0146.$g2059$.bind((SubLObject)T, var22);
                var23 = f18295(var19, (SubLObject)UNPROVIDED);
                var24 = (SubLObject)makeBoolean(!var19.equal(var23) && NIL != ((NIL != var21) ? Functions.funcall(var20, var23, var21) : Functions.funcall(var20, var23)));
            }
            finally {
                module0146.$g2059$.rebind(var25, var22);
            }
            return Values.values(var23, var24);
        }
        return Values.values(var19, (SubLObject)NIL);
    }
    
    public static SubLObject f18295(SubLObject var11, SubLObject var15) {
        if (var15 == UNPROVIDED) {
            var15 = Symbols.symbol_function((SubLObject)$ic6$);
        }
        var11 = f18296(var11);
        var11 = f18293(var11, var15);
        return var11;
    }
    
    public static SubLObject f18297(final SubLObject var11, SubLObject var24) {
        if (var24 == UNPROVIDED) {
            var24 = $ic9$;
        }
        final SubLThread var25 = SubLProcess.currentSubLThread();
        final SubLObject var26 = module0147.f9540(var24);
        final SubLObject var27 = module0147.$g2095$.currentBinding(var25);
        final SubLObject var28 = module0147.$g2094$.currentBinding(var25);
        final SubLObject var29 = module0147.$g2096$.currentBinding(var25);
        try {
            module0147.$g2095$.bind(module0147.f9545(var26), var25);
            module0147.$g2094$.bind(module0147.f9546(var26), var25);
            module0147.$g2096$.bind(module0147.f9549(var26), var25);
            return f18293(var11, (SubLObject)UNPROVIDED);
        }
        finally {
            module0147.$g2096$.rebind(var29, var25);
            module0147.$g2094$.rebind(var28, var25);
            module0147.$g2095$.rebind(var27, var25);
        }
    }
    
    public static SubLObject f18293(SubLObject var11, SubLObject var15) {
        if (var15 == UNPROVIDED) {
            var15 = Symbols.symbol_function((SubLObject)$ic6$);
        }
        var11 = f18298(var11);
        var11 = f18299(var11, var15);
        if (NIL != f18300()) {
            var11 = f18301(var11, (SubLObject)UNPROVIDED);
        }
        return var11;
    }
    
    public static SubLObject f18302(final SubLObject var11, SubLObject var15) {
        if (var15 == UNPROVIDED) {
            var15 = Symbols.symbol_function((SubLObject)$ic6$);
        }
        final SubLThread var16 = SubLProcess.currentSubLThread();
        SubLObject var17 = (SubLObject)NIL;
        final SubLObject var18 = module0146.$g2060$.currentBinding(var16);
        try {
            module0146.$g2060$.bind((SubLObject)NIL, var16);
            var17 = f18293(var11, var15);
        }
        finally {
            module0146.$g2060$.rebind(var18, var16);
        }
        return var17;
    }
    
    public static SubLObject f18299(final SubLObject var11, SubLObject var15) {
        if (var15 == UNPROVIDED) {
            var15 = Symbols.symbol_function((SubLObject)$ic6$);
        }
        final SubLThread var16 = SubLProcess.currentSubLThread();
        SubLObject var17 = var11;
        if (NIL != module0146.$g2054$.getDynamicValue(var16)) {
            if (!$ic11$.eql(var11)) {
                if (!$ic12$.eql(var11)) {
                    if (NIL == module0202.f12639(var11)) {
                        if (NIL == module0206.f13470(var11)) {
                            if (NIL == Functions.funcall(var15, var11)) {
                                if (NIL == assertion_handles_oc.f11035(var11)) {
                                    if (var11.isAtom()) {
                                        module0202.f12747((SubLObject)FOUR_INTEGER, (SubLObject)$ic13$, var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                        module0274.f18082((SubLObject)ConsesLow.list((SubLObject)$ic14$, var11, module0147.$g2095$.getDynamicValue(var16)));
                                    }
                                    else if (NIL != module0202.f12592(var11)) {
                                        final SubLObject var18 = module0202.f12707(var11, (SubLObject)UNPROVIDED);
                                        SubLObject var19 = (SubLObject)NIL;
                                        final SubLObject var20 = module0146.$g2032$.currentBinding(var16);
                                        try {
                                            module0146.$g2032$.bind((SubLObject)makeBoolean(NIL == module0146.$g2032$.getDynamicValue(var16)), var16);
                                            var19 = f18299(module0205.f13379(var11, (SubLObject)UNPROVIDED), var15);
                                        }
                                        finally {
                                            module0146.$g2032$.rebind(var20, var16);
                                        }
                                        var17 = module0202.f12709(var18, f18303(module0202.f12643(module0205.f13378(var11), var19), var15));
                                    }
                                    else if (NIL != module0202.f12595(var11)) {
                                        if (NIL != module0202.f12734(var11, (SubLObject)ZERO_INTEGER, (SubLObject)$ic15$) && NIL != module0202.f12734(var11, (SubLObject)ONE_INTEGER, (SubLObject)$ic16$)) {
                                            var17 = var11;
                                        }
                                        else {
                                            final SubLObject var21 = module0144.$g1802$.currentBinding(var16);
                                            final SubLObject var22 = module0144.$g1804$.currentBinding(var16);
                                            try {
                                                module0144.$g1802$.bind((SubLObject)T, var16);
                                                module0144.$g1804$.bind(module0146.$g2032$.getDynamicValue(var16), var16);
                                                var17 = f18304(module0202.f12799(Symbols.symbol_function((SubLObject)$ic17$), var11, (SubLObject)UNPROVIDED), var15);
                                            }
                                            finally {
                                                module0144.$g1804$.rebind(var22, var16);
                                                module0144.$g1802$.rebind(var21, var16);
                                            }
                                        }
                                    }
                                    else if (NIL != module0202.f12594(var11)) {
                                        if (NIL != module0202.f12734(var11, (SubLObject)ZERO_INTEGER, (SubLObject)$ic15$) && NIL != module0202.f12734(var11, (SubLObject)ONE_INTEGER, (SubLObject)$ic16$)) {
                                            var17 = var11;
                                        }
                                        else {
                                            final SubLObject var21 = module0144.$g1801$.currentBinding(var16);
                                            final SubLObject var22 = module0144.$g1803$.currentBinding(var16);
                                            try {
                                                module0144.$g1801$.bind((SubLObject)T, var16);
                                                module0144.$g1803$.bind(module0146.$g2032$.getDynamicValue(var16), var16);
                                                var17 = f18305(module0202.f12799(Symbols.symbol_function((SubLObject)$ic17$), var11, (SubLObject)UNPROVIDED), var15);
                                            }
                                            finally {
                                                module0144.$g1803$.rebind(var22, var16);
                                                module0144.$g1801$.rebind(var21, var16);
                                            }
                                        }
                                    }
                                    else if (NIL != module0202.f12597(var11)) {
                                        final SubLObject var18 = module0202.f12707(var11, (SubLObject)UNPROVIDED);
                                        SubLObject var23 = (SubLObject)NIL;
                                        SubLObject var24 = (SubLObject)NIL;
                                        final SubLObject var25 = module0144.$g1801$.currentBinding(var16);
                                        final SubLObject var26 = module0144.$g1803$.currentBinding(var16);
                                        try {
                                            module0144.$g1801$.bind((SubLObject)T, var16);
                                            module0144.$g1803$.bind(module0146.$g2032$.getDynamicValue(var16), var16);
                                            final SubLObject var18_33 = module0146.$g2032$.currentBinding(var16);
                                            try {
                                                module0146.$g2032$.bind((SubLObject)makeBoolean(NIL == module0146.$g2032$.getDynamicValue(var16)), var16);
                                                var23 = f18299(module0205.f13379(var11, (SubLObject)UNPROVIDED), var15);
                                            }
                                            finally {
                                                module0146.$g2032$.rebind(var18_33, var16);
                                            }
                                            var24 = f18299(module0205.f13380(var11, (SubLObject)UNPROVIDED), var15);
                                        }
                                        finally {
                                            module0144.$g1803$.rebind(var26, var16);
                                            module0144.$g1801$.rebind(var25, var16);
                                        }
                                        var17 = module0202.f12709(var18, f18306(module0202.f12768(module0205.f13378(var11), var23, var24), var15));
                                    }
                                    else if (NIL != module0202.f12648(var11)) {
                                        var17 = f18307(var11, var15);
                                    }
                                    else if (NIL != module0202.f12604(var11)) {
                                        var17 = f18308(module0202.f12777(module0202.f12743(var11), module0202.f12744(var11), f18299(module0202.f12668(var11), var15)));
                                    }
                                    else if (NIL != module0202.f12606(var11)) {
                                        var17 = f18309(module0202.f12777(module0202.f12743(var11), module0202.f12744(var11), f18299(module0202.f12668(var11), (SubLObject)UNPROVIDED)));
                                    }
                                    else if (NIL != module0202.f12623(var11)) {
                                        var17 = module0202.f12778(module0202.f12743(var11), module0202.f12748(var11), module0202.f12744(var11), f18299(module0202.f12668(var11), var15));
                                    }
                                    else if (NIL != module0202.f12925(var11)) {
                                        var17 = f18310(var11, var15);
                                    }
                                    else if (NIL != module0146.$g2060$.getDynamicValue(var16)) {
                                        if (NIL != module0303.f20150(var11, (SubLObject)UNPROVIDED)) {
                                            var17 = f18311(var11);
                                        }
                                        else if (NIL != module0210.f13589(var11)) {
                                            var17 = f18311(var11);
                                        }
                                        else if (NIL != module0202.f12932(var11)) {
                                            if (NIL != module0152.$g2101$.getDynamicValue(var16)) {
                                                module0274.f18082((SubLObject)ConsesLow.list((SubLObject)$ic14$, var11, module0147.$g2095$.getDynamicValue(var16)));
                                            }
                                            var16.resetMultipleValues();
                                            final SubLObject var27 = f18311(var11);
                                            final SubLObject var28 = var16.secondMultipleValue();
                                            var16.resetMultipleValues();
                                            if (NIL != var28) {
                                                var17 = f18299(var27, (SubLObject)UNPROVIDED);
                                            }
                                            else {
                                                var17 = var27;
                                            }
                                        }
                                        else if (NIL != module0152.$g2101$.getDynamicValue(var16)) {
                                            module0274.f18082((SubLObject)ConsesLow.list((SubLObject)$ic14$, var11, module0147.$g2095$.getDynamicValue(var16)));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return var17;
    }
    
    public static SubLObject f18312(final SubLObject var11, SubLObject var15) {
        if (var15 == UNPROVIDED) {
            var15 = Symbols.symbol_function((SubLObject)$ic6$);
        }
        final SubLThread var16 = SubLProcess.currentSubLThread();
        final SubLObject var17 = module0205.f13379(var11, (SubLObject)UNPROVIDED);
        if (NIL != module0202.f12639(var11)) {
            return var11;
        }
        if (NIL != module0206.f13470(var11)) {
            return var11;
        }
        if (NIL != Functions.funcall(var15, var17)) {
            return var11;
        }
        if (NIL != module0202.f12660(var17) && NIL != Functions.funcall(var15, module0205.f13378(var17))) {
            return module0202.f12643(module0205.f13378(var11), f18299(var17, var15));
        }
        if (NIL != module0202.f12660(var17) && NIL != module0279.f18516(var17)) {
            return f18299(var17, var15);
        }
        if (NIL != module0146.$g2066$.getDynamicValue(var16)) {
            return f18299(var17, var15);
        }
        if (NIL != module0279.f18525() || (NIL != module0018.f979() && NIL != module0279.f18531())) {
            return module0202.f12643(module0205.f13378(var11), f18299(var17, var15));
        }
        if (NIL != module0018.f979() && NIL != module0279.f18527() && NIL != module0202.f12625(var17)) {
            return module0202.f12643(module0205.f13378(var11), f18299(var17, var15));
        }
        if (NIL != module0018.f979() && NIL != module0202.f12604(var17) && NIL == module0279.f18527()) {
            return module0202.f12643(module0205.f13378(var11), f18299(var17, var15));
        }
        if (NIL != module0018.f979() && NIL != module0202.f12669(var17)) {
            return module0202.f12643(module0205.f13378(var11), f18299(var17, var15));
        }
        if (NIL != var17) {
            return f18299(var17, var15);
        }
        return var11;
    }
    
    public static SubLObject f18307(final SubLObject var11, SubLObject var15) {
        if (var15 == UNPROVIDED) {
            var15 = Symbols.symbol_function((SubLObject)$ic6$);
        }
        final SubLObject var16 = module0205.f13378(var11);
        final SubLObject var17 = module0205.f13379(var11, (SubLObject)UNPROVIDED);
        final SubLObject var18 = f18299(module0205.f13380(var11, (SubLObject)UNPROVIDED), var15);
        return module0202.f12768(var16, var17, var18);
    }
    
    public static SubLObject f18313(final SubLObject var39, SubLObject var15) {
        if (var15 == UNPROVIDED) {
            var15 = Symbols.symbol_function((SubLObject)$ic6$);
        }
        final SubLThread var40 = SubLProcess.currentSubLThread();
        SubLObject var41 = (SubLObject)NIL;
        final SubLObject var42 = module0146.$g2060$.currentBinding(var40);
        try {
            module0146.$g2060$.bind((SubLObject)NIL, var40);
            var41 = f18310(var39, var15);
        }
        finally {
            module0146.$g2060$.rebind(var42, var40);
        }
        return var41;
    }
    
    public static SubLObject f18310(final SubLObject var39, SubLObject var40) {
        if (var40 == UNPROVIDED) {
            var40 = Symbols.symbol_function((SubLObject)$ic6$);
        }
        final SubLThread var41 = SubLProcess.currentSubLThread();
        if (NIL != module0202.f12639(var39)) {
            return var39;
        }
        if (NIL != module0206.f13470(var39)) {
            return var39;
        }
        if (NIL != module0279.f18516(var39)) {
            return f18312(var39, var40);
        }
        if (NIL != module0146.$g2050$.getDynamicValue(var41)) {
            return var39;
        }
        if (NIL != module0202.f12883(var39, (SubLObject)UNPROVIDED)) {
            final SubLObject var42 = f18314(var39);
            if (!var42.equal(var39)) {
                return f18293(var42, (SubLObject)UNPROVIDED);
            }
        }
        if (NIL == module0146.$g2055$.getDynamicValue(var41)) {
            return var39;
        }
        if (NIL != module0202.f12894(var39)) {
            final SubLObject var42 = f18315(var39);
            if (!var42.equal(var39)) {
                return f18293(var42, (SubLObject)UNPROVIDED);
            }
        }
        return f18316(var39, var40);
    }
    
    public static SubLObject f18316(final SubLObject var39, SubLObject var40) {
        if (var40 == UNPROVIDED) {
            var40 = Symbols.symbol_function((SubLObject)$ic6$);
        }
        final SubLThread var41 = SubLProcess.currentSubLThread();
        SubLObject var42 = (SubLObject)NIL;
        if (NIL != module0146.$g2060$.getDynamicValue(var41)) {
            final SubLObject var43 = module0271.$g2560$.currentBinding(var41);
            final SubLObject var44 = module0271.$g2563$.currentBinding(var41);
            final SubLObject var45 = module0271.$g2561$.currentBinding(var41);
            try {
                module0271.$g2560$.bind((SubLObject)T, var41);
                module0271.$g2563$.bind((SubLObject)NIL, var41);
                module0271.$g2561$.bind((SubLObject)NIL, var41);
                if (NIL != module0018.f981() || NIL != module0146.$g2059$.getDynamicValue(var41) || NIL == module0146.$g2057$.getDynamicValue(var41) || NIL != module0274.f18104(var39, module0147.$g2095$.getDynamicValue(var41))) {
                    var42 = f18317(f18318(var39, var40));
                }
                else if (NIL != module0146.$g2058$.getDynamicValue(var41)) {
                    final SubLObject var46 = f18317(f18318(var39, var40));
                    if (NIL != module0274.f18104(var46, module0147.$g2095$.getDynamicValue(var41))) {
                        var42 = var46;
                    }
                    else {
                        var42 = $ic12$;
                    }
                }
                else {
                    var42 = $ic12$;
                }
            }
            finally {
                module0271.$g2561$.rebind(var45, var41);
                module0271.$g2563$.rebind(var44, var41);
                module0271.$g2560$.rebind(var43, var41);
            }
        }
        else {
            var42 = f18318(var39, (SubLObject)UNPROVIDED);
        }
        return var42;
    }
    
    public static SubLObject f18319(final SubLObject var42, final SubLObject var43, final SubLObject var44, SubLObject var24) {
        if (var24 == UNPROVIDED) {
            var24 = (SubLObject)NIL;
        }
        if (NIL != module0173.f10955(var43)) {
            return module0220.f14587(module0202.f12769($ic18$, var42, var43, var44), var24, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18317(final SubLObject var39) {
        final SubLObject var40 = module0202.f12833(var39, (SubLObject)UNPROVIDED);
        SubLObject var41 = (SubLObject)ZERO_INTEGER;
        SubLObject var42 = (SubLObject)NIL;
        if (NIL == var42) {
            SubLObject var43 = module0202.f12829(var39, (SubLObject)UNPROVIDED);
            SubLObject var44 = (SubLObject)NIL;
            var44 = var43.first();
            while (NIL == var42 && NIL != var43) {
                var41 = Numbers.add(var41, (SubLObject)ONE_INTEGER);
                if (NIL != module0202.f12929(var44)) {
                    final SubLObject var45 = module0205.f13132(var44);
                    if (NIL != f18319(var45, var40, var41, (SubLObject)UNPROVIDED)) {
                        SubLObject var46 = (SubLObject)NIL;
                        SubLObject var47 = (SubLObject)NIL;
                        SubLObject var48 = module0205.f13207(var44, (SubLObject)UNPROVIDED);
                        SubLObject var49 = (SubLObject)NIL;
                        var49 = var48.first();
                        while (NIL != var48) {
                            var46 = (SubLObject)ConsesLow.cons(module0035.f2151(var41, var49, var39), var46);
                            var48 = var48.rest();
                            var49 = var48.first();
                        }
                        var47 = module0202.f12683(var45, Sequences.reverse(var46), (SubLObject)UNPROVIDED);
                        if (NIL != module0285.f18892(var47, (SubLObject)UNPROVIDED)) {
                            var42 = var47;
                        }
                    }
                }
                var43 = var43.rest();
                var44 = var43.first();
            }
        }
        if (NIL != var42) {
            return f18299(var42, (SubLObject)UNPROVIDED);
        }
        return var39;
    }
    
    public static SubLObject f18318(final SubLObject var39, SubLObject var15) {
        if (var15 == UNPROVIDED) {
            var15 = Symbols.symbol_function((SubLObject)$ic6$);
        }
        if (NIL != module0202.f12903(var39)) {
            return f18320(var39, var15);
        }
        return f18321(var39, var15);
    }
    
    public static SubLObject f18320(final SubLObject var39, final SubLObject var15) {
        final SubLThread var40 = SubLProcess.currentSubLThread();
        final SubLObject var41 = module0202.f12906(var39);
        SubLObject var42 = (SubLObject)NIL;
        if (NIL != module0269.f17707(var41)) {
            final SubLObject var43 = module0147.$g2094$.currentBinding(var40);
            final SubLObject var44 = module0147.$g2095$.currentBinding(var40);
            try {
                module0147.$g2094$.bind((SubLObject)$ic19$, var40);
                module0147.$g2095$.bind(var41, var40);
                var42 = f18321(var39, var15);
            }
            finally {
                module0147.$g2095$.rebind(var44, var40);
                module0147.$g2094$.rebind(var43, var40);
            }
        }
        else if (NIL != module0201.f12580(var41)) {
            if (NIL != module0018.f979() || (NIL != module0279.f18527() && NIL != module0279.f18525())) {
                final SubLObject var43 = module0146.$g2055$.currentBinding(var40);
                try {
                    module0146.$g2055$.bind((SubLObject)NIL, var40);
                    var42 = f18321(var39, var15);
                }
                finally {
                    module0146.$g2055$.rebind(var43, var40);
                }
            }
            else if (NIL != module0018.f981()) {
                final SubLObject var45 = module0147.f9540(module0132.$g1546$.getGlobalValue());
                final SubLObject var46 = module0147.$g2095$.currentBinding(var40);
                final SubLObject var47 = module0147.$g2094$.currentBinding(var40);
                final SubLObject var48 = module0147.$g2096$.currentBinding(var40);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var45), var40);
                    module0147.$g2094$.bind(module0147.f9546(var45), var40);
                    module0147.$g2096$.bind(module0147.f9549(var45), var40);
                    var42 = f18321(var39, var15);
                }
                finally {
                    module0147.$g2096$.rebind(var48, var40);
                    module0147.$g2094$.rebind(var47, var40);
                    module0147.$g2095$.rebind(var46, var40);
                }
            }
            else {
                final SubLObject var43 = module0146.$g2055$.currentBinding(var40);
                try {
                    module0146.$g2055$.bind((SubLObject)NIL, var40);
                    var42 = f18321(var39, var15);
                }
                finally {
                    module0146.$g2055$.rebind(var43, var40);
                }
            }
        }
        else {
            var42 = var39;
        }
        return var42;
    }
    
    public static SubLObject f18321(final SubLObject var39, SubLObject var15) {
        if (var15 == UNPROVIDED) {
            var15 = Symbols.symbol_function((SubLObject)$ic6$);
        }
        final SubLThread var40 = SubLProcess.currentSubLThread();
        final SubLObject var41 = module0147.$g2095$.getDynamicValue(var40);
        final SubLObject var42 = module0202.f12833(var39, (SubLObject)UNPROVIDED);
        final SubLObject var43 = module0202.f12707(var39, (SubLObject)UNPROVIDED);
        SubLObject var44 = (SubLObject)NIL;
        final SubLObject var45 = module0205.f13180(var39, (SubLObject)$ic15$);
        SubLObject var46 = (SubLObject)NIL;
        SubLObject var47 = (SubLObject)NIL;
        SubLObject var48 = (SubLObject)NIL;
        var46 = var45;
        var47 = var46.first();
        for (var48 = (SubLObject)ZERO_INTEGER; NIL != var46; var46 = var46.rest(), var47 = var46.first(), var48 = module0048.f_1X(var48)) {
            final SubLObject var49 = module0152.$g2120$.currentBinding(var40);
            final SubLObject var50 = module0152.$g2121$.currentBinding(var40);
            try {
                module0152.$g2120$.bind((SubLObject)makeBoolean(NIL != module0152.$g2120$.getDynamicValue(var40) || NIL != module0279.f18444(var42, var48, var41)), var40);
                module0152.$g2121$.bind((SubLObject)makeBoolean(NIL != module0152.$g2121$.getDynamicValue(var40) || NIL != module0279.f18443(var42, var48, var41)), var40);
                final SubLObject var51 = module0279.f18462(var42, var48, var41);
                final SubLObject var52 = (SubLObject)((NIL != var51) ? ((NIL != module0279.f18449(var42, var48)) ? NIL : module0279.f18516(var47)) : NIL);
                if (NIL != var52) {
                    var44 = (SubLObject)ConsesLow.cons(f18299(module0205.f13203(var47, (SubLObject)UNPROVIDED), var15), var44);
                }
                else if (NIL != var51) {
                    var44 = (SubLObject)ConsesLow.cons(f18299(var47, var15), var44);
                }
                else {
                    var44 = (SubLObject)ConsesLow.cons(f18322(var47, var15), var44);
                }
            }
            finally {
                module0152.$g2121$.rebind(var50, var40);
                module0152.$g2120$.rebind(var49, var40);
            }
        }
        var44 = Sequences.nreverse(var44);
        if (NIL != var43) {
            var44 = module0202.f12711(var43, var44);
        }
        return var44;
    }
    
    public static SubLObject f18322(final SubLObject var46, SubLObject var15) {
        if (var15 == UNPROVIDED) {
            var15 = Symbols.symbol_function((SubLObject)$ic6$);
        }
        final SubLThread var47 = SubLProcess.currentSubLThread();
        if (NIL != module0202.f12639(var46)) {
            return var46;
        }
        if (NIL != module0206.f13470(var46)) {
            return var46;
        }
        if (NIL != module0210.f13576(var46, var15)) {
            final SubLObject var48 = module0205.f13276(var46);
            final SubLObject var49 = module0202.f12707(var46, (SubLObject)UNPROVIDED);
            final SubLObject var50 = module0279.f18471(var48, module0147.$g2095$.getDynamicValue(var47));
            SubLObject var51 = (SubLObject)ZERO_INTEGER;
            SubLObject var52 = (SubLObject)NIL;
            SubLObject var54;
            final SubLObject var53 = var54 = module0205.f13180(var46, (SubLObject)$ic15$);
            SubLObject var55 = (SubLObject)NIL;
            var55 = var54.first();
            while (NIL != var54) {
                final SubLObject var56 = (SubLObject)makeBoolean(NIL != var50 && NIL != module0279.f18462(var48, var51, module0147.$g2095$.getDynamicValue(var47)));
                final SubLObject var57 = (SubLObject)((NIL != var56) ? ((NIL != module0279.f18449(var48, var51)) ? NIL : module0279.f18516(var55)) : NIL);
                if (NIL != var57) {
                    var52 = (SubLObject)ConsesLow.cons(f18299(module0205.f13203(var55, (SubLObject)UNPROVIDED), var15), var52);
                }
                else if (NIL != var56) {
                    var52 = (SubLObject)ConsesLow.cons(f18299(var55, var15), var52);
                }
                else {
                    var52 = (SubLObject)ConsesLow.cons(f18322(var55, var15), var52);
                }
                var51 = Numbers.add(var51, (SubLObject)ONE_INTEGER);
                var54 = var54.rest();
                var55 = var54.first();
            }
            var52 = Sequences.nreverse(var52);
            if (NIL != var49) {
                var52 = module0202.f12711(var49, var52);
            }
            return var52;
        }
        if (NIL == module0202.f12932(var46)) {
            return var46;
        }
        var47.resetMultipleValues();
        final SubLObject var58 = f18311(var46);
        final SubLObject var59 = var47.secondMultipleValue();
        var47.resetMultipleValues();
        if (NIL != var59) {
            return f18322(var58, (SubLObject)UNPROVIDED);
        }
        return var58;
    }
    
    public static SubLObject f18323(final SubLObject var11) {
        if (NIL != module0202.f12592(var11)) {
            return module0205.f13379(var11, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0202.f12660(var11) || $ic11$.eql(var11) || $ic12$.eql(var11) || NIL != module0201.f12546(var11)) {
            return module0202.f12771(var11);
        }
        module0202.f12747((SubLObject)FOUR_INTEGER, (SubLObject)$ic20$, var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18303(final SubLObject var63, SubLObject var15) {
        if (var15 == UNPROVIDED) {
            var15 = Symbols.symbol_function((SubLObject)$ic6$);
        }
        if (NIL == module0202.f12592(var63)) {
            return (SubLObject)NIL;
        }
        if ($ic12$.eql(module0205.f13379(var63, (SubLObject)UNPROVIDED))) {
            return $ic11$;
        }
        if ($ic11$.eql(module0205.f13379(var63, (SubLObject)UNPROVIDED))) {
            return $ic12$;
        }
        if (NIL != module0202.f12592(module0205.f13379(var63, (SubLObject)UNPROVIDED))) {
            return f18299(module0205.f13379(module0205.f13379(var63, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED), var15);
        }
        return var63;
    }
    
    public static SubLObject f18304(SubLObject var64, SubLObject var15) {
        if (var15 == UNPROVIDED) {
            var15 = Symbols.symbol_function((SubLObject)$ic6$);
        }
        final SubLThread var65 = SubLProcess.currentSubLThread();
        if (NIL != module0202.f12595(var64)) {
            if (NIL == module0205.f13377(var64, (SubLObject)$ic16$)) {
                return $ic11$;
            }
            if (NIL == module0202.f12707(var64, (SubLObject)UNPROVIDED) && NIL != module0035.f1997(module0205.f13377(var64, (SubLObject)$ic15$))) {
                return module0205.f13379(var64, (SubLObject)$ic15$);
            }
            if (NIL != module0004.f104($ic12$, module0205.f13377(var64, (SubLObject)$ic15$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                return $ic12$;
            }
            if (NIL != module0004.f104($ic11$, module0205.f13377(var64, (SubLObject)$ic15$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                return f18304(Sequences.remove($ic11$, var64, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var15);
            }
            if (NIL != module0035.f2194(module0205.f13377(var64, (SubLObject)$ic15$), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
                final SubLObject var66 = module0202.f12707(var64, (SubLObject)UNPROVIDED);
                final SubLObject var67 = Sequences.remove_duplicates(module0205.f13377(var64, (SubLObject)$ic15$), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                return f18304(module0202.f12683(module0205.f13378(var64), var67, var66), var15);
            }
            if (NIL != Sequences.find_if(Symbols.symbol_function((SubLObject)$ic5$), module0205.f13377(var64, (SubLObject)$ic15$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                final SubLObject var66 = module0202.f12707(var64, (SubLObject)UNPROVIDED);
                if (NIL != var66) {
                    return f18304(ConsesLow.append(f18288(module0205.f13377(var64, (SubLObject)$ic15$), (SubLObject)T), var66), (SubLObject)UNPROVIDED);
                }
                return f18304(f18287(module0205.f13377(var64, (SubLObject)UNPROVIDED), (SubLObject)T), (SubLObject)UNPROVIDED);
            }
        }
        final SubLObject var68 = module0202.f12842(module0205.f13377(var64, (SubLObject)$ic15$));
        final SubLObject var69 = (SubLObject)((NIL != var68 || NIL != f18324()) ? module0202.f12843(module0205.f13377(var64, (SubLObject)$ic15$)) : NIL);
        final SubLObject var70 = (SubLObject)((NIL != f18324()) ? module0035.remove_if_not(Symbols.symbol_function((SubLObject)$ic21$), var69, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : NIL);
        SubLObject var71 = (SubLObject)NIL;
        if (NIL == var71) {
            SubLObject var72;
            SubLObject var73;
            for (var72 = var68, var73 = (SubLObject)NIL, var73 = var72.first(); NIL == var71 && NIL != var72; var71 = module0004.f104(module0205.f13379(var73, (SubLObject)$ic15$), var69, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED), var72 = var72.rest(), var73 = var72.first()) {}
        }
        if (NIL != var71) {
            return $ic12$;
        }
        if (NIL != var70) {
            final SubLObject var74 = Sequences.delete_if(Symbols.symbol_function((SubLObject)$ic21$), var69, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var75 = (SubLObject)NIL;
            SubLObject var76 = var70;
            SubLObject var77 = (SubLObject)NIL;
            var77 = var76.first();
            while (NIL != var76) {
                final SubLObject var78 = module0205.f13377(var64, (SubLObject)UNPROVIDED);
                final SubLObject var79 = module0205.f13377(var77, (SubLObject)UNPROVIDED);
                if (NIL == module0035.f2180(var78, var79, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
                    var75 = (SubLObject)ConsesLow.cons(var77, var75);
                }
                var76 = var76.rest();
                var77 = var76.first();
            }
            return f18288(ConsesLow.append(var74, Sequences.nreverse(var75)), (SubLObject)UNPROVIDED);
        }
        if (NIL != module0146.$g2065$.getDynamicValue(var65) && (NIL == module0279.f18527() || NIL != module0279.f18525())) {
            var64 = f18325(var64, var15);
        }
        if (NIL != f18300()) {
            var64 = f18301(var64, (SubLObject)UNPROVIDED);
        }
        return var64;
    }
    
    public static SubLObject f18325(SubLObject var64, final SubLObject var15) {
        final SubLThread var65 = SubLProcess.currentSubLThread();
        SubLObject var66 = (SubLObject)NIL;
        var65.resetMultipleValues();
        final SubLObject var74_75 = f18326(var64, var15);
        final SubLObject var76_77 = var65.secondMultipleValue();
        var65.resetMultipleValues();
        var64 = var74_75;
        var66 = var76_77;
        if (NIL != var66) {
            return f18304(var64, var15);
        }
        var65.resetMultipleValues();
        final SubLObject var78_79 = f18327(var64);
        final SubLObject var80_81 = var65.secondMultipleValue();
        var65.resetMultipleValues();
        var64 = var78_79;
        var66 = var80_81;
        if (NIL != var66) {
            return f18304(var64, var15);
        }
        var65.resetMultipleValues();
        final SubLObject var82_83 = f18328(var64, var15);
        final SubLObject var84_85 = var65.secondMultipleValue();
        var65.resetMultipleValues();
        var64 = var82_83;
        var66 = var84_85;
        if (NIL != var66) {
            return f18304(var64, var15);
        }
        var65.resetMultipleValues();
        final SubLObject var86_87 = f18329(var64, var15);
        final SubLObject var88_89 = var65.secondMultipleValue();
        var65.resetMultipleValues();
        var64 = var86_87;
        var66 = var88_89;
        if (NIL != var66) {
            return f18304(var64, var15);
        }
        return var64;
    }
    
    public static SubLObject f18329(final SubLObject var64, final SubLObject var15) {
        return f18330(var64, var15, (SubLObject)NIL);
    }
    
    public static SubLObject f18326(final SubLObject var64, final SubLObject var15) {
        return f18330(var64, var15, (SubLObject)T);
    }
    
    public static SubLObject f18330(SubLObject var64, final SubLObject var15, final SubLObject var90) {
        SubLObject var91 = (SubLObject)NIL;
        SubLObject var92 = (SubLObject)NIL;
        SubLObject var93 = (SubLObject)NIL;
        SubLObject var94 = (SubLObject)ZERO_INTEGER;
        SubLObject var96;
        final SubLObject var95 = var96 = module0205.f13207(var64, (SubLObject)$ic15$);
        SubLObject var97 = (SubLObject)NIL;
        var97 = var96.first();
        while (NIL != var96) {
            var94 = Numbers.add(var94, (SubLObject)ONE_INTEGER);
            if (NIL != f18331(var97, var15, (SubLObject)T, var90)) {
                final SubLObject var98 = module0235.f15506(module0205.f13203(var97, (SubLObject)UNPROVIDED), module0205.f13204(var97, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
                if (NIL != var98) {
                    var93 = var98;
                    var92 = var94;
                }
            }
            var96 = var96.rest();
            var97 = var96.first();
        }
        if (NIL != var92) {
            var64 = module0202.f12819(var92, var64);
            var64 = module0233.f15362(var93, var64);
            var91 = (SubLObject)T;
        }
        return Values.values(var64, var91);
    }
    
    public static SubLObject f18327(SubLObject var64) {
        SubLObject var65 = (SubLObject)NIL;
        SubLObject var66 = (SubLObject)NIL;
        SubLObject var67 = (SubLObject)ZERO_INTEGER;
        SubLObject var69;
        final SubLObject var68 = var69 = module0205.f13207(var64, (SubLObject)$ic15$);
        SubLObject var70 = (SubLObject)NIL;
        var70 = var69.first();
        while (NIL != var69) {
            var67 = Numbers.add(var67, (SubLObject)ONE_INTEGER);
            if (NIL != f18332(var70, (SubLObject)T)) {
                var66 = var67;
            }
            var69 = var69.rest();
            var70 = var69.first();
        }
        if (NIL != var66) {
            var64 = module0202.f12819(var66, var64);
            var65 = (SubLObject)T;
        }
        return Values.values(var64, var65);
    }
    
    public static SubLObject f18328(SubLObject var64, final SubLObject var15) {
        final SubLThread var65 = SubLProcess.currentSubLThread();
        SubLObject var66 = (SubLObject)NIL;
        final SubLObject var67 = module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var68 = (SubLObject)NIL;
        final SubLObject var69 = module0004.f104(var15, (SubLObject)ConsesLow.list((SubLObject)$ic6$, Symbols.symbol_function((SubLObject)$ic6$), (SubLObject)$ic22$, Symbols.symbol_function((SubLObject)$ic22$)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var70 = (SubLObject)ZERO_INTEGER;
        SubLObject var72;
        final SubLObject var71 = var72 = module0205.f13207(var64, (SubLObject)$ic15$);
        SubLObject var73 = (SubLObject)NIL;
        var73 = var72.first();
        while (NIL != var72) {
            var70 = Numbers.add(var70, (SubLObject)ONE_INTEGER);
            final SubLObject var74 = module0067.f4861(var67);
            final SubLObject var75 = f18333(var73, var67, var69, (SubLObject)T, module0202.f12819(var70, var64));
            if (var75.isVector()) {
                final SubLObject var76 = var75;
                final SubLObject var77 = (SubLObject)NIL;
                SubLObject var78;
                SubLObject var79;
                SubLObject var80;
                SubLObject var81;
                for (var78 = Sequences.length(var76), var79 = (SubLObject)NIL, var79 = (SubLObject)ZERO_INTEGER; var79.numL(var78); var79 = Numbers.add(var79, (SubLObject)ONE_INTEGER)) {
                    var80 = ((NIL != var77) ? Numbers.subtract(var78, var79, (SubLObject)ONE_INTEGER) : var79);
                    var81 = Vectors.aref(var76, var80);
                    var68 = (SubLObject)ConsesLow.cons(var81, var68);
                }
            }
            else {
                SubLObject var48_107 = var75;
                SubLObject var82 = (SubLObject)NIL;
                var82 = var48_107.first();
                while (NIL != var48_107) {
                    var68 = (SubLObject)ConsesLow.cons(var82, var68);
                    var48_107 = var48_107.rest();
                    var82 = var48_107.first();
                }
            }
            final SubLObject var83 = module0035.f1966(var74, module0067.f4861(var67));
            if (NIL != var83) {
                var66 = (SubLObject)ConsesLow.cons(var70, var66);
            }
            var72 = var72.rest();
            var73 = var72.first();
        }
        if (NIL != var68) {
            return Values.values($ic12$, (SubLObject)T);
        }
        if (NIL == module0067.f4882(var67)) {
            SubLObject var84 = Sort.sort(var66, Symbols.symbol_function((SubLObject)$ic23$), (SubLObject)UNPROVIDED);
            SubLObject var85 = (SubLObject)NIL;
            var85 = var84.first();
            while (NIL != var84) {
                var64 = module0202.f12819(var85, var64);
                var84 = var84.rest();
                var85 = var84.first();
            }
            SubLObject var86;
            for (var86 = module0066.f4838(module0067.f4891(var67)); NIL == module0066.f4841(var86); var86 = module0066.f4840(var86)) {
                var65.resetMultipleValues();
                final SubLObject var87 = module0066.f4839(var86);
                final SubLObject var88 = var65.secondMultipleValue();
                var65.resetMultipleValues();
                var64 = module0205.f13250(var88, var87, var64, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            module0066.f4842(var86);
            return Values.values(var64, (SubLObject)T);
        }
        return Values.values(var64, (SubLObject)NIL);
    }
    
    public static SubLObject f18334(final SubLObject var113, final SubLObject var114) {
        return (SubLObject)makeBoolean(NIL != module0205.f13334(var113, (SubLObject)$ic24$) || (NIL != var114 && NIL != module0205.f13332(var113, $ic25$)));
    }
    
    public static SubLObject f18331(final SubLObject var113, final SubLObject var15, final SubLObject var114, final SubLObject var90) {
        final SubLThread var115 = SubLProcess.currentSubLThread();
        if (NIL != f18334(var113, var114)) {
            var115.resetMultipleValues();
            final SubLObject var116 = module0202.f12796(var113);
            final SubLObject var117 = var115.secondMultipleValue();
            final SubLObject var118 = var115.thirdMultipleValue();
            var115.resetMultipleValues();
            if (NIL != var90) {
                if (NIL != Functions.funcall(var15, var117) && NIL != Functions.funcall(var15, var118)) {
                    return (SubLObject)T;
                }
            }
            else if (NIL == module0202.f12689(var117, var15) && NIL == module0202.f12689(var118, var15)) {
                return (SubLObject)T;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18332(final SubLObject var113, final SubLObject var114) {
        final SubLThread var115 = SubLProcess.currentSubLThread();
        if (NIL != f18334(var113, var114)) {
            var115.resetMultipleValues();
            final SubLObject var116 = module0202.f12796(var113);
            final SubLObject var117 = var115.secondMultipleValue();
            final SubLObject var118 = var115.thirdMultipleValue();
            var115.resetMultipleValues();
            if (var117.equal(var118)) {
                return (SubLObject)T;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18305(SubLObject var72, SubLObject var15) {
        if (var15 == UNPROVIDED) {
            var15 = Symbols.symbol_function((SubLObject)$ic6$);
        }
        final SubLThread var73 = SubLProcess.currentSubLThread();
        SubLObject var74 = (SubLObject)NIL;
        final SubLObject var75 = module0144.$g1801$.currentBinding(var73);
        final SubLObject var76 = module0144.$g1803$.currentBinding(var73);
        try {
            module0144.$g1801$.bind((SubLObject)T, var73);
            module0144.$g1803$.bind(module0146.$g2032$.getDynamicValue(var73), var73);
            var74 = f18335(var72, var15);
        }
        finally {
            module0144.$g1803$.rebind(var76, var73);
            module0144.$g1801$.rebind(var75, var73);
        }
        if (NIL != f18300()) {
            var72 = f18336(var72, (SubLObject)UNPROVIDED);
        }
        return var74;
    }
    
    public static SubLObject f18335(final SubLObject var72, SubLObject var15) {
        if (var15 == UNPROVIDED) {
            var15 = Symbols.symbol_function((SubLObject)$ic6$);
        }
        if (NIL == module0202.f12594(var72)) {
            return (SubLObject)NIL;
        }
        if (NIL == module0205.f13377(var72, (SubLObject)$ic16$)) {
            return $ic12$;
        }
        if (NIL == module0202.f12707(var72, (SubLObject)UNPROVIDED) && NIL != module0035.f1997(module0205.f13377(var72, (SubLObject)$ic15$))) {
            return module0205.f13379(var72, (SubLObject)$ic15$);
        }
        if (NIL != module0004.f104($ic11$, module0205.f13377(var72, (SubLObject)$ic15$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return $ic11$;
        }
        if (NIL != module0004.f104($ic12$, module0205.f13377(var72, (SubLObject)$ic15$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return f18335(Sequences.remove($ic12$, var72, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var15);
        }
        if (NIL != module0035.f2194(module0205.f13377(var72, (SubLObject)$ic15$), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
            final SubLObject var73 = module0202.f12707(var72, (SubLObject)UNPROVIDED);
            final SubLObject var74 = Sequences.remove_duplicates(module0205.f13377(var72, (SubLObject)$ic15$), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return f18335(module0202.f12683(module0205.f13378(var72), var74, var73), var15);
        }
        if (NIL != Sequences.find_if(Symbols.symbol_function((SubLObject)$ic21$), module0205.f13377(var72, (SubLObject)$ic15$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            final SubLObject var73 = module0202.f12707(var72, (SubLObject)UNPROVIDED);
            if (NIL != var73) {
                return f18335(ConsesLow.append(f18281(module0205.f13377(var72, (SubLObject)$ic15$), (SubLObject)T), var73), (SubLObject)UNPROVIDED);
            }
            return f18335(f18280(module0205.f13377(var72, (SubLObject)UNPROVIDED), (SubLObject)T), (SubLObject)UNPROVIDED);
        }
        else {
            final SubLObject var75 = module0202.f12842(module0205.f13377(var72, (SubLObject)$ic15$));
            final SubLObject var76 = (SubLObject)((NIL != var75) ? module0202.f12843(module0205.f13377(var72, (SubLObject)$ic15$)) : NIL);
            SubLObject var77 = (SubLObject)NIL;
            if (NIL == var77) {
                SubLObject var78 = var75;
                SubLObject var79 = (SubLObject)NIL;
                var79 = var78.first();
                while (NIL == var77 && NIL != var78) {
                    var77 = module0004.f104(module0205.f13379(var79, (SubLObject)$ic15$), var76, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
                    if (NIL != var77) {
                        module0274.f18082((SubLObject)ConsesLow.list((SubLObject)$ic26$, module0205.f13379(var79, (SubLObject)$ic15$)));
                    }
                    var78 = var78.rest();
                    var79 = var78.first();
                }
            }
            if (NIL != var77) {
                return $ic11$;
            }
            return var72;
        }
    }
    
    public static SubLObject f18306(final SubLObject var116, SubLObject var15) {
        if (var15 == UNPROVIDED) {
            var15 = Symbols.symbol_function((SubLObject)$ic6$);
        }
        final SubLThread var117 = SubLProcess.currentSubLThread();
        if (NIL == module0202.f12597(var116)) {
            return (SubLObject)NIL;
        }
        if (NIL == module0146.$g2056$.getDynamicValue(var117)) {
            return var116;
        }
        if (NIL != module0035.f1997(module0205.f13377(var116, (SubLObject)UNPROVIDED))) {
            return f18299(module0205.f13338(module0205.f13379(var116, (SubLObject)UNPROVIDED)), var15);
        }
        if ($ic11$.eql(module0205.f13380(var116, (SubLObject)UNPROVIDED))) {
            return $ic11$;
        }
        if ($ic12$.eql(module0205.f13379(var116, (SubLObject)UNPROVIDED))) {
            return $ic11$;
        }
        if ($ic11$.eql(module0205.f13379(var116, (SubLObject)UNPROVIDED))) {
            return module0205.f13380(var116, (SubLObject)UNPROVIDED);
        }
        if ($ic12$.eql(module0205.f13380(var116, (SubLObject)UNPROVIDED))) {
            return module0205.f13338(module0205.f13379(var116, (SubLObject)UNPROVIDED));
        }
        if (NIL != module0018.$g697$.getDynamicValue(var117)) {
            return var116;
        }
        if (NIL != module0146.$g2050$.getDynamicValue(var117)) {
            return var116;
        }
        if (module0205.f13379(var116, (SubLObject)UNPROVIDED).equal(module0205.f13380(var116, (SubLObject)UNPROVIDED))) {
            return $ic11$;
        }
        return var116;
    }
    
    public static SubLObject f18337(final SubLObject var116, SubLObject var15) {
        if (var15 == UNPROVIDED) {
            var15 = Symbols.symbol_function((SubLObject)$ic6$);
        }
        final SubLThread var117 = SubLProcess.currentSubLThread();
        SubLObject var118 = (SubLObject)NIL;
        SubLObject var119 = (SubLObject)NIL;
        final SubLObject var120 = module0144.$g1801$.currentBinding(var117);
        final SubLObject var121 = module0144.$g1803$.currentBinding(var117);
        try {
            module0144.$g1801$.bind((SubLObject)T, var117);
            module0144.$g1803$.bind(module0146.$g2032$.getDynamicValue(var117), var117);
            final SubLObject var18_117 = module0146.$g2032$.currentBinding(var117);
            try {
                module0146.$g2032$.bind((SubLObject)makeBoolean(NIL == module0146.$g2032$.getDynamicValue(var117)), var117);
                var118 = f18299(module0205.f13379(var116, (SubLObject)UNPROVIDED), var15);
            }
            finally {
                module0146.$g2032$.rebind(var18_117, var117);
            }
            var119 = f18299(module0205.f13380(var116, (SubLObject)UNPROVIDED), var15);
        }
        finally {
            module0144.$g1803$.rebind(var121, var117);
            module0144.$g1801$.rebind(var120, var117);
        }
        return Equality.equal(var118, var119);
    }
    
    public static SubLObject f18308(final SubLObject var118) {
        final SubLObject var119 = module0202.f12744(var118);
        final SubLObject var120 = module0202.f12668(var118);
        if (NIL != module0205.f13220(var119, var120, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return var118;
        }
        return var120;
    }
    
    public static SubLObject f18309(final SubLObject var120) {
        final SubLObject var121 = module0202.f12744(var120);
        final SubLObject var122 = module0202.f12668(var120);
        if (NIL != module0205.f13220(var121, var122, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return var120;
        }
        return var122;
    }
    
    public static SubLObject f18311(final SubLObject var121) {
        return var121;
    }
    
    public static SubLObject f18298(SubLObject var122) {
        final SubLThread var123 = SubLProcess.currentSubLThread();
        if (NIL != module0146.$g2060$.getDynamicValue(var123)) {
            var122 = f18338(var122);
        }
        return var122;
    }
    
    public static SubLObject f18338(final SubLObject var122) {
        return module0036.f2531(var122, Symbols.symbol_function((SubLObject)$ic27$), Symbols.symbol_function((SubLObject)$ic28$), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f18339(final SubLObject var123) {
        final SubLObject var124 = module0205.f13203(var123, (SubLObject)UNPROVIDED);
        final SubLObject var125 = module0205.f13203(var124, (SubLObject)UNPROVIDED);
        final SubLObject var126 = module0205.f13204(var124, (SubLObject)UNPROVIDED);
        final SubLObject var127 = module0205.f13203(var126, (SubLObject)UNPROVIDED);
        final SubLObject var128 = module0205.f13204(var126, (SubLObject)UNPROVIDED);
        final SubLObject var129 = module0205.f13204(var123, (SubLObject)UNPROVIDED);
        final SubLObject var130 = module0205.f13203(var129, (SubLObject)UNPROVIDED);
        final SubLObject var131 = module0205.f13204(var129, (SubLObject)UNPROVIDED);
        if (!var130.equal(var127) && NIL != module0035.f2428(var127, var131, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            SubLObject var132 = (SubLObject)NIL;
            SubLObject var133 = (SubLObject)NIL;
            var133 = module0201.f12550(Symbols.symbol_name(module0201.f12560(Symbols.symbol_name(var127))));
            while (NIL == var132) {
                if (NIL == module0035.f2428(var133, var131, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    conses_high.nsubst(var133, var127, var131, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    var132 = (SubLObject)T;
                }
                var133 = module0201.f12550(Symbols.symbol_name(module0201.f12560(Symbols.symbol_name(var127))));
            }
        }
        return module0202.f12768($ic29$, var125, module0202.f12768($ic30$, var127, f18287((SubLObject)ConsesLow.list(var128, conses_high.nsubst(var127, var130, var131, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)), (SubLObject)T)));
    }
    
    public static SubLObject f18340(final SubLObject var123) {
        return (SubLObject)makeBoolean(NIL != module0202.f12590(var123) && $ic29$.eql(module0205.f13132(var123)) && NIL != module0202.f12590(module0205.f13203(var123, (SubLObject)UNPROVIDED)) && $ic29$.eql(module0205.f13132(module0205.f13203(var123, (SubLObject)UNPROVIDED))) && NIL != module0202.f12590(module0205.f13204(var123, (SubLObject)UNPROVIDED)) && $ic30$.eql(module0205.f13132(module0205.f13204(var123, (SubLObject)UNPROVIDED))) && NIL != module0202.f12590(module0205.f13204(module0205.f13203(var123, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED)) && $ic30$.eql(module0205.f13132(module0205.f13204(module0205.f13203(var123, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED))));
    }
    
    public static SubLObject f18324() {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        return module0146.$g2061$.getDynamicValue(var16);
    }
    
    public static SubLObject f18315(SubLObject var113) {
        final SubLObject var114 = module0205.f13136(var113);
        if (module0202.f12725(var113, (SubLObject)UNPROVIDED).numE(module0202.f12897(var114))) {
            final SubLObject var115 = module0205.f13207(var113, (SubLObject)UNPROVIDED);
            final SubLObject var116 = module0202.f12896(var114);
            SubLObject var117 = module0202.f12898(var114);
            SubLObject var118 = (SubLObject)NIL;
            SubLObject var139_140 = (SubLObject)NIL;
            SubLObject var119 = (SubLObject)NIL;
            SubLObject var142_143 = (SubLObject)NIL;
            var118 = var115;
            var139_140 = var118.first();
            var119 = var116;
            var142_143 = var119.first();
            while (NIL != var119 || NIL != var118) {
                var117 = module0205.f13252(var139_140, var142_143, var117, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var118 = var118.rest();
                var139_140 = var118.first();
                var119 = var119.rest();
                var142_143 = var119.first();
            }
            var113 = module0202.f12643($ic31$, var117);
        }
        return var113;
    }
    
    public static SubLObject f18314(final SubLObject var144) {
        final SubLObject var145 = module0202.f12906(var144);
        final SubLObject var146 = module0202.f12887(var144);
        if (NIL != module0202.f12595(var146)) {
            SubLObject var147 = (SubLObject)NIL;
            SubLObject var149;
            final SubLObject var148 = var149 = module0205.f13207(var146, (SubLObject)$ic15$);
            SubLObject var150 = (SubLObject)NIL;
            var150 = var149.first();
            while (NIL != var149) {
                final SubLObject var151 = (SubLObject)ConsesLow.list($ic32$, var145, var150);
                var147 = (SubLObject)ConsesLow.cons(var151, var147);
                var149 = var149.rest();
                var150 = var149.first();
            }
            return module0202.f12773(Sequences.nreverse(var147));
        }
        if (NIL != module0202.f12883(var146, (SubLObject)UNPROVIDED)) {
            return f18314(var146);
        }
        return var144;
    }
    
    public static SubLObject f18341(SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        var11 = f18302(var11, (SubLObject)UNPROVIDED);
        final SubLObject var13 = module0146.$g2065$.currentBinding(var12);
        try {
            module0146.$g2065$.bind((SubLObject)T, var12);
            return f18293(var11, (SubLObject)UNPROVIDED);
        }
        finally {
            module0146.$g2065$.rebind(var13, var12);
        }
    }
    
    public static SubLObject f18333(final SubLObject var113, final SubLObject var96, SubLObject var98, SubLObject var114, SubLObject var147) {
        if (var98 == UNPROVIDED) {
            var98 = (SubLObject)NIL;
        }
        if (var114 == UNPROVIDED) {
            var114 = (SubLObject)NIL;
        }
        if (var147 == UNPROVIDED) {
            var147 = (SubLObject)NIL;
        }
        if (NIL != f18334(var113, var114)) {
            return f18342(var113, var96, var98, var147);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18342(final SubLObject var113, final SubLObject var96, final SubLObject var98, final SubLObject var147) {
        final SubLThread var148 = SubLProcess.currentSubLThread();
        SubLObject var149 = (SubLObject)NIL;
        final SubLObject var150 = (SubLObject)((NIL != var98) ? $ic6$ : $ic33$);
        var148.resetMultipleValues();
        final SubLObject var151 = module0202.f12796(var113);
        final SubLObject var152 = var148.secondMultipleValue();
        final SubLObject var153 = var148.thirdMultipleValue();
        var148.resetMultipleValues();
        SubLObject var154 = (SubLObject)NIL;
        SubLObject var155 = (SubLObject)NIL;
        if (NIL == module0202.f12689(var152, var150) && NIL != module0202.f12691(var153, (SubLObject)UNPROVIDED)) {
            var154 = var152;
            var155 = var153;
        }
        else if (NIL == module0202.f12689(var153, var150) && NIL != module0202.f12691(var152, (SubLObject)UNPROVIDED)) {
            var154 = var153;
            var155 = var152;
        }
        if (NIL != var154 && NIL != var155) {
            final SubLObject var156 = (SubLObject)((NIL != var147) ? module0205.f13183(var154, var150, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : NIL);
            if (NIL == var147 || NIL != module0205.f13226(var156, var147, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                final SubLObject var157 = var151.eql($ic34$) ? module0489.f31994(var155) : var155;
                var148.resetMultipleValues();
                final SubLObject var158 = (NIL != var98) ? module0235.f15504(var154, var157, (SubLObject)UNPROVIDED) : module0234.f15444(var154, var157, (SubLObject)T, (SubLObject)UNPROVIDED);
                final SubLObject var159 = var148.secondMultipleValue();
                var148.resetMultipleValues();
                SubLObject var160 = var158;
                SubLObject var161 = (SubLObject)NIL;
                var161 = var160.first();
                while (NIL != var160) {
                    SubLObject var163;
                    final SubLObject var162 = var163 = var161;
                    SubLObject var164 = (SubLObject)NIL;
                    SubLObject var165 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var163, var162, (SubLObject)$ic35$);
                    var164 = var163.first();
                    var163 = (var165 = var163.rest());
                    final SubLObject var166 = module0067.f4884(var96, var164, (SubLObject)UNPROVIDED);
                    if (NIL != var166 && !var165.equal(var166)) {
                        var149 = (SubLObject)ConsesLow.cons(var164, var149);
                    }
                    else {
                        f18343(var96, var164, var165);
                    }
                    var160 = var160.rest();
                    var161 = var160.first();
                }
            }
        }
        return Sequences.nreverse(var149);
    }
    
    public static SubLObject f18343(final SubLObject var96, final SubLObject var119, final SubLObject var155) {
        return module0067.f4886(var96, var119, var155);
    }
    
    public static SubLObject f18344(final SubLObject var122) {
        final SubLThread var123 = SubLProcess.currentSubLThread();
        SubLObject var124 = (SubLObject)NIL;
        final SubLObject var125 = module0146.$g2031$.currentBinding(var123);
        final SubLObject var126 = module0146.$g2003$.currentBinding(var123);
        try {
            module0146.$g2031$.bind((NIL != module0146.$g2031$.getDynamicValue(var123)) ? module0146.$g2031$.getDynamicValue(var123) : Hashtables.make_hash_table((SubLObject)$ic36$, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED), var123);
            module0146.$g2003$.bind((SubLObject)((NIL != module0146.$g2003$.getDynamicValue(var123)) ? module0146.$g2003$.getDynamicValue(var123) : NIL), var123);
            var124 = f18296(var122);
        }
        finally {
            module0146.$g2003$.rebind(var126, var123);
            module0146.$g2031$.rebind(var125, var123);
        }
        return var124;
    }
    
    public static SubLObject f18296(final SubLObject var122) {
        final SubLThread var123 = SubLProcess.currentSubLThread();
        if (NIL == module0202.f12660(var122)) {
            return var122;
        }
        SubLObject var124 = (SubLObject)NIL;
        if (NIL != $g2595$.getDynamicValue(var123)) {
            var124 = var122;
        }
        else if (NIL != module0205.f13215(Symbols.symbol_function((SubLObject)$ic37$), var122, (SubLObject)NIL, (SubLObject)UNPROVIDED)) {
            if (NIL != module0202.f12965(var122)) {
                final SubLObject var125 = $g2595$.currentBinding(var123);
                try {
                    $g2595$.bind((SubLObject)T, var123);
                    var124 = f18345(var122, (SubLObject)NIL, (SubLObject)NIL);
                }
                finally {
                    $g2595$.rebind(var125, var123);
                }
            }
            else {
                var124 = (SubLObject)NIL;
            }
        }
        else {
            var124 = var122;
        }
        return var124;
    }
    
    public static SubLObject f18345(SubLObject var122, SubLObject var157, SubLObject var158) {
        final SubLThread var159 = SubLProcess.currentSubLThread();
        if (NIL == module0202.f12932(var122) || NIL != module0202.f12639(var122) || NIL != module0206.f13470(var122)) {
            return Values.values(var122, (SubLObject)NIL);
        }
        final SubLObject var160 = module0202.f12911(var122, var158, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var161 = module0202.f12947(var122, (SubLObject)UNPROVIDED);
        final SubLObject var162 = module0202.f12707(var122, (SubLObject)UNPROVIDED);
        final SubLObject var163 = f18346(var122, var162);
        SubLObject var164 = (SubLObject)NIL;
        SubLObject var165 = (SubLObject)NIL;
        var158 = module0035.f2269(ConsesLow.append(var158, var161), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var166 = module0205.f13180(var122, (SubLObject)$ic15$);
        SubLObject var167 = (SubLObject)NIL;
        var167 = var166.first();
        while (NIL != var166) {
            final SubLObject var168 = module0202.f12911(var167, var158, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var169 = module0035.f2269(ConsesLow.append(var157, conses_high.set_difference(conses_high.intersection(var168, var160, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var161, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var159.resetMultipleValues();
            final SubLObject var170 = f18345(var167, var169, var158);
            final SubLObject var171 = var159.secondMultipleValue();
            var159.resetMultipleValues();
            var164 = ConsesLow.append(var164, var171);
            var165 = (SubLObject)ConsesLow.cons(var170, var165);
            var166 = var166.rest();
            var167 = var166.first();
        }
        var165 = Sequences.nreverse(var165);
        var122 = module0202.f12720(var165.first(), var165.rest(), var162);
        var157 = ConsesLow.append(module0202.f12963(var122), var157);
        if (NIL != var163) {
            var164 = (SubLObject)ConsesLow.cons(var163, var164);
        }
        var164 = module0035.f2269(var164, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var172 = (SubLObject)NIL;
        SubLObject var173 = var164;
        SubLObject var174 = (SubLObject)NIL;
        var174 = var173.first();
        while (NIL != var173) {
            final SubLObject var175 = var174.first();
            final SubLObject var176 = var174.rest();
            final SubLObject var177 = (var175 == $ic38$) ? conses_high.fourth(var176) : var176;
            if (NIL == module0004.f104(var177, var157, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                final SubLObject var178 = var175;
                if (var178.eql((SubLObject)$ic15$)) {
                    var159.resetMultipleValues();
                    final SubLObject var179 = f18347(var122, var177, (SubLObject)UNPROVIDED);
                    final SubLObject var180 = var159.secondMultipleValue();
                    var159.resetMultipleValues();
                    if (NIL != var180) {
                        var122 = var179;
                        var172 = (SubLObject)ConsesLow.cons(var174, var172);
                    }
                }
                else if (var178.eql((SubLObject)$ic16$)) {
                    var159.resetMultipleValues();
                    final SubLObject var179 = f18348(var122, var177, (SubLObject)UNPROVIDED);
                    final SubLObject var180 = var159.secondMultipleValue();
                    var159.resetMultipleValues();
                    if (NIL != var180) {
                        var122 = var179;
                        var172 = (SubLObject)ConsesLow.cons(var174, var172);
                    }
                }
                else if (var178.eql((SubLObject)$ic38$) && NIL == module0004.f104(var177, var158, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var159.resetMultipleValues();
                    final SubLObject var179 = f18349(var122, var176.first(), conses_high.second(var176), conses_high.third(var176), conses_high.fourth(var176), (SubLObject)UNPROVIDED);
                    final SubLObject var180 = var159.secondMultipleValue();
                    var159.resetMultipleValues();
                    if (NIL != var180) {
                        var122 = var179;
                        var172 = (SubLObject)ConsesLow.cons(var174, var172);
                    }
                }
            }
            var173 = var173.rest();
            var174 = var173.first();
        }
        var173 = var172;
        var174 = (SubLObject)NIL;
        var174 = var173.first();
        while (NIL != var173) {
            var164 = Sequences.delete(var174, var164, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var173 = var173.rest();
            var174 = var173.first();
        }
        var166 = var161;
        SubLObject var181 = (SubLObject)NIL;
        var181 = var166.first();
        while (NIL != var166) {
            SubLObject var48_178 = var164;
            SubLObject var182 = (SubLObject)NIL;
            var182 = var48_178.first();
            while (NIL != var48_178) {
                if (var181.eql(var182.rest())) {
                    var164 = Sequences.delete(var182, var164, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                var48_178 = var48_178.rest();
                var182 = var48_178.first();
            }
            var166 = var166.rest();
            var181 = var166.first();
        }
        return Values.values(var122, var164);
    }
    
    public static SubLObject f18346(final SubLObject var122, final SubLObject var29) {
        if (NIL == var29) {
            return (SubLObject)NIL;
        }
        if (NIL == f18350() && NIL == module0202.f12628(module0205.f13132(var122))) {
            return (SubLObject)NIL;
        }
        final SubLObject var123 = (NIL != module0202.f12628(module0205.f13132(var122))) ? module0225.f14783(module0205.f13132(var122)) : module0225.f14773(module0205.f13132(var122));
        final SubLObject var124 = (NIL != module0202.f12628(module0205.f13132(var122))) ? module0225.f14783(module0205.f13132(var122)) : module0225.f14762(module0205.f13132(var122));
        final SubLObject var125 = module0202.f12725(var122, (SubLObject)$ic15$);
        if (!var123.isInteger()) {
            return (SubLObject)NIL;
        }
        if (var125.numE(Numbers.subtract(var123, (SubLObject)ONE_INTEGER))) {
            return (SubLObject)ConsesLow.cons((SubLObject)$ic16$, var29);
        }
        if (var125.numE(var123)) {
            return (SubLObject)ConsesLow.cons((SubLObject)$ic15$, var29);
        }
        if (!var124.isInteger()) {
            return (SubLObject)NIL;
        }
        if (var125.numL(Numbers.subtract(var124, (SubLObject)ONE_INTEGER)) && var124.numE(var123)) {
            return (SubLObject)ConsesLow.cons((SubLObject)$ic38$, (SubLObject)ConsesLow.list(module0225.f14775(var122), var124, var125, var29));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18350() {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL != module0146.$g2063$.getDynamicValue(var16) && NIL != module0146.$g2060$.getDynamicValue(var16));
    }
    
    public static SubLObject f18347(final SubLObject var122, final SubLObject var29, SubLObject var24) {
        if (var24 == UNPROVIDED) {
            var24 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var123 = SubLProcess.currentSubLThread();
        if (NIL == var29) {
            return Values.values(var122, (SubLObject)NIL);
        }
        final SubLObject var124 = module0202.f12976((SubLObject)NIL, var29, var122);
        SubLObject var125 = (SubLObject)NIL;
        final SubLObject var126 = module0144.$g1796$.currentBinding(var123);
        final SubLObject var127 = module0144.$g1795$.currentBinding(var123);
        final SubLObject var128 = module0152.$g2116$.currentBinding(var123);
        final SubLObject var129 = module0152.$g2115$.currentBinding(var123);
        try {
            module0144.$g1796$.bind((SubLObject)NIL, var123);
            module0144.$g1795$.bind((SubLObject)NIL, var123);
            module0152.$g2116$.bind((SubLObject)NIL, var123);
            module0152.$g2115$.bind((SubLObject)NIL, var123);
            var125 = module0274.f18060(var124, var24, (SubLObject)UNPROVIDED);
        }
        finally {
            module0152.$g2115$.rebind(var129, var123);
            module0152.$g2116$.rebind(var128, var123);
            module0144.$g1795$.rebind(var127, var123);
            module0144.$g1796$.rebind(var126, var123);
        }
        return (NIL != var125) ? Values.values(var124, (SubLObject)T) : Values.values(var122, (SubLObject)NIL);
    }
    
    public static SubLObject f18348(final SubLObject var122, final SubLObject var29, SubLObject var24) {
        if (var24 == UNPROVIDED) {
            var24 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var123 = SubLProcess.currentSubLThread();
        if (NIL == var29) {
            return Values.values(var122, (SubLObject)NIL);
        }
        final SubLObject var124 = module0202.f12976((SubLObject)ConsesLow.list(var29), var29, var122);
        SubLObject var125 = (SubLObject)NIL;
        final SubLObject var126 = module0144.$g1796$.currentBinding(var123);
        final SubLObject var127 = module0144.$g1795$.currentBinding(var123);
        final SubLObject var128 = module0152.$g2116$.currentBinding(var123);
        final SubLObject var129 = module0152.$g2115$.currentBinding(var123);
        try {
            module0144.$g1796$.bind((SubLObject)NIL, var123);
            module0144.$g1795$.bind((SubLObject)NIL, var123);
            module0152.$g2116$.bind((SubLObject)NIL, var123);
            module0152.$g2115$.bind((SubLObject)NIL, var123);
            var125 = module0274.f18060(var124, var24, (SubLObject)UNPROVIDED);
        }
        finally {
            module0152.$g2115$.rebind(var129, var123);
            module0152.$g2116$.rebind(var128, var123);
            module0144.$g1795$.rebind(var127, var123);
            module0144.$g1796$.rebind(var126, var123);
        }
        return (NIL != var125) ? Values.values(var124, (SubLObject)T) : Values.values(var122, (SubLObject)NIL);
    }
    
    public static SubLObject f18349(final SubLObject var122, SubLObject var183, SubLObject var184, SubLObject var181, SubLObject var29, SubLObject var24) {
        if (var183 == UNPROVIDED) {
            var183 = (SubLObject)NIL;
        }
        if (var184 == UNPROVIDED) {
            var184 = (SubLObject)NIL;
        }
        if (var181 == UNPROVIDED) {
            var181 = (SubLObject)NIL;
        }
        if (var29 == UNPROVIDED) {
            var29 = (SubLObject)NIL;
        }
        if (var24 == UNPROVIDED) {
            var24 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var185 = SubLProcess.currentSubLThread();
        if (NIL != var183) {
            module0202.f12747((SubLObject)TWO_INTEGER, (SubLObject)$ic39$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (!var184.isInteger()) {
            var184 = module0225.f14762(module0205.f13132(var122));
            if (!var184.isInteger()) {
                return var122;
            }
        }
        if (!var181.isInteger()) {
            var181 = module0202.f12725(var122, (SubLObject)$ic15$);
            if (!var181.isInteger()) {
                return var122;
            }
        }
        if (NIL == module0201.f12546(var29)) {
            var29 = module0202.f12707(var122, (SubLObject)UNPROVIDED);
            if (NIL == module0201.f12546(var29)) {
                return var122;
            }
        }
        SubLObject var186 = (SubLObject)NIL;
        SubLObject var187;
        SubLObject var188;
        for (var187 = Numbers.subtract(var184, var181), var188 = (SubLObject)NIL, var188 = (SubLObject)ZERO_INTEGER; var188.numL(var187); var188 = Numbers.add(var188, (SubLObject)ONE_INTEGER)) {
            var186 = (SubLObject)ConsesLow.cons(module0282.f18697(var29), var186);
        }
        final SubLObject var189 = module0202.f12976(Sequences.nreverse(var186), var29, var122);
        SubLObject var190 = (SubLObject)NIL;
        final SubLObject var191 = module0144.$g1796$.currentBinding(var185);
        final SubLObject var192 = module0144.$g1795$.currentBinding(var185);
        final SubLObject var193 = module0152.$g2116$.currentBinding(var185);
        final SubLObject var194 = module0152.$g2115$.currentBinding(var185);
        try {
            module0144.$g1796$.bind((SubLObject)NIL, var185);
            module0144.$g1795$.bind((SubLObject)NIL, var185);
            module0152.$g2116$.bind((SubLObject)NIL, var185);
            module0152.$g2115$.bind((SubLObject)NIL, var185);
            var190 = module0274.f18060(var189, var24, (SubLObject)UNPROVIDED);
        }
        finally {
            module0152.$g2115$.rebind(var194, var185);
            module0152.$g2116$.rebind(var193, var185);
            module0144.$g1795$.rebind(var192, var185);
            module0144.$g1796$.rebind(var191, var185);
        }
        return (NIL != var190) ? Values.values(var189, (SubLObject)T) : Values.values(var122, (SubLObject)NIL);
    }
    
    public static SubLObject f18351(final SubLObject var122) {
        return (SubLObject)makeBoolean(!var122.equal(f18344(var122)));
    }
    
    public static SubLObject f18301(final SubLObject var11, SubLObject var24) {
        if (var24 == UNPROVIDED) {
            var24 = (SubLObject)NIL;
        }
        final SubLThread var25 = SubLProcess.currentSubLThread();
        if (NIL == module0202.f12660(var11)) {
            return var11;
        }
        SubLObject var26 = (SubLObject)NIL;
        final SubLObject var27 = var24;
        final SubLObject var28 = module0147.$g2094$.currentBinding(var25);
        final SubLObject var29 = module0147.$g2095$.currentBinding(var25);
        final SubLObject var30 = $g2596$.currentBinding(var25);
        try {
            module0147.$g2094$.bind(module0147.f9531(var27), var25);
            module0147.$g2095$.bind(module0147.f9534(var27), var25);
            $g2596$.bind((SubLObject)T, var25);
            SubLObject var31 = (SubLObject)NIL;
            var25.resetMultipleValues();
            SubLObject var32 = module0282.f18735(var11, module0147.$g2095$.getDynamicValue(var25));
            final SubLObject var33 = var25.secondMultipleValue();
            var25.resetMultipleValues();
            final SubLObject var188_191 = var33;
            final SubLObject var18_192 = module0147.$g2094$.currentBinding(var25);
            final SubLObject var26_193 = module0147.$g2095$.currentBinding(var25);
            try {
                module0147.$g2094$.bind(module0147.f9531(var188_191), var25);
                module0147.$g2095$.bind(module0147.f9534(var188_191), var25);
                var32 = module0282.f18715(var32);
                if (NIL == module0202.f12595(var32)) {
                    var32 = module0202.f12773((SubLObject)ConsesLow.list(var32));
                }
                SubLObject var34 = module0205.f13377(var32, (SubLObject)$ic15$);
                SubLObject var36;
                final SubLObject var35 = var36 = module0205.f13207(var32, (SubLObject)$ic15$);
                SubLObject var37 = (SubLObject)NIL;
                var37 = var36.first();
                while (NIL != var36) {
                    if (NIL != f18352(var37, Sequences.remove(var37, var34, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))) {
                        var34 = Sequences.remove(var37, var34, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    else {
                        var31 = (SubLObject)ConsesLow.cons(f18353(var37), var31);
                    }
                    var36 = var36.rest();
                    var37 = var36.first();
                }
                var26 = f18299(f18287(Sequences.nreverse(var31), (SubLObject)T), (SubLObject)UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var26_193, var25);
                module0147.$g2094$.rebind(var18_192, var25);
            }
        }
        finally {
            $g2596$.rebind(var30, var25);
            module0147.$g2095$.rebind(var29, var25);
            module0147.$g2094$.rebind(var28, var25);
        }
        return var26;
    }
    
    public static SubLObject f18336(final SubLObject var11, SubLObject var24) {
        if (var24 == UNPROVIDED) {
            var24 = (SubLObject)NIL;
        }
        final SubLThread var25 = SubLProcess.currentSubLThread();
        SubLObject var26 = (SubLObject)NIL;
        final SubLObject var27 = var24;
        final SubLObject var28 = module0147.$g2094$.currentBinding(var25);
        final SubLObject var29 = module0147.$g2095$.currentBinding(var25);
        try {
            module0147.$g2094$.bind(module0147.f9531(var27), var25);
            module0147.$g2095$.bind(module0147.f9534(var27), var25);
            var26 = f18299(f18353(var11), (SubLObject)UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var29, var25);
            module0147.$g2094$.rebind(var28, var25);
        }
        return var26;
    }
    
    public static SubLObject f18352(final SubLObject var13, final SubLObject var194) {
        SubLObject var195 = (SubLObject)NIL;
        if (NIL == var195) {
            SubLObject var196 = var194;
            SubLObject var197 = (SubLObject)NIL;
            var197 = var196.first();
            while (NIL == var195 && NIL != var196) {
                if (NIL != module0202.f12594(var197) && NIL != f18354(var13, var197) && NIL == f18354(var197, var13)) {
                    var195 = (SubLObject)T;
                }
                var196 = var196.rest();
                var197 = var196.first();
            }
        }
        return var195;
    }
    
    public static SubLObject f18354(final SubLObject var197, final SubLObject var198) {
        SubLObject var199 = (SubLObject)T;
        final SubLObject var200 = module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        final SubLObject var201 = module0205.f13377(var198, (SubLObject)$ic15$);
        SubLObject var203;
        final SubLObject var202 = var203 = module0205.f13207(var197, (SubLObject)$ic15$);
        SubLObject var204 = (SubLObject)NIL;
        var204 = var203.first();
        while (NIL != var203) {
            final SubLObject var205 = module0205.f13378(var204);
            final SubLObject var206 = module0205.f13377(var204, (SubLObject)$ic15$);
            module0084.f5762(var200, var205, var206);
            var203 = var203.rest();
            var204 = var203.first();
        }
        SubLObject var207;
        SubLObject var208;
        SubLObject var209;
        SubLObject var210;
        SubLObject var211;
        for (var207 = (SubLObject)NIL, var207 = var201; NIL != var207 && NIL != var199; var207 = var207.rest()) {
            var208 = var207.first();
            var209 = module0205.f13378(var208);
            var210 = module0205.f13377(var208, (SubLObject)$ic15$);
            var211 = module0067.f4884(var200, var209, (SubLObject)UNPROVIDED);
            if (NIL != var211) {
                var199 = f18355(var209, var210, var211);
            }
            else {
                var199 = (SubLObject)NIL;
            }
        }
        return var199;
    }
    
    public static SubLObject f18355(final SubLObject var43, final SubLObject var204, final SubLObject var203) {
        SubLObject var205 = (SubLObject)NIL;
        if (NIL == var205) {
            SubLObject var206 = var203;
            SubLObject var207 = (SubLObject)NIL;
            var207 = var206.first();
            while (NIL == var205 && NIL != var206) {
                if (NIL != f18356(var43, var204, var207)) {
                    var205 = (SubLObject)T;
                }
                var206 = var206.rest();
                var207 = var206.first();
            }
        }
        return var205;
    }
    
    public static SubLObject f18356(final SubLObject var43, final SubLObject var204, final SubLObject var205) {
        if (NIL == module0035.f2004(var204, var205)) {
            return (SubLObject)NIL;
        }
        SubLObject var206;
        SubLObject var207;
        SubLObject var208;
        for (var206 = (SubLObject)T, var207 = conses_high.list_length(var204), var208 = (SubLObject)NIL, var208 = (SubLObject)ZERO_INTEGER; !var208.numE(var207) && NIL != var206; var208 = Numbers.add(var208, (SubLObject)ONE_INTEGER)) {
            if (NIL == module0599.f36729(var43, Numbers.add(var208, (SubLObject)ONE_INTEGER), (SubLObject)ConsesLow.list(ConsesLow.nth(var208, var205)), (SubLObject)ConsesLow.list(ConsesLow.nth(var208, var204)), (SubLObject)UNPROVIDED)) {
                var206 = (SubLObject)NIL;
            }
        }
        return var206;
    }
    
    public static SubLObject f18353(final SubLObject var72) {
        final SubLThread var73 = SubLProcess.currentSubLThread();
        assert NIL != module0202.f12594(var72) : var72;
        final SubLObject var74 = f18357(var72, Symbols.symbol_function((SubLObject)$ic41$));
        SubLObject var75 = (SubLObject)NIL;
        SubLObject var77;
        final SubLObject var76 = var77 = module0205.f13207(var72, (SubLObject)$ic15$);
        SubLObject var78 = (SubLObject)NIL;
        var78 = var77.first();
        while (NIL != var77) {
            final SubLObject var79 = module0205.f13378(var78);
            final SubLObject var80 = module0205.f13379(var78, (SubLObject)UNPROVIDED);
            final SubLObject var81 = (SubLObject)ConsesLow.list(module0205.f13380(var78, (SubLObject)UNPROVIDED));
            if (NIL != module0004.f104(var79, $g2597$.getDynamicValue(var73), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                final SubLObject var82 = (SubLObject)ConsesLow.list(var79, var80);
                final SubLObject var83 = module0067.f4884(var74, var82, (SubLObject)UNPROVIDED);
                if (NIL == module0599.f36729(var79, (SubLObject)TWO_INTEGER, var83, var81, (SubLObject)UNPROVIDED)) {
                    var75 = (SubLObject)ConsesLow.cons(var78, var75);
                }
            }
            else {
                var75 = (SubLObject)ConsesLow.cons(var78, var75);
            }
            var77 = var77.rest();
            var78 = var77.first();
        }
        SubLObject var84;
        for (var84 = module0066.f4838(module0067.f4891(var74)); NIL == module0066.f4841(var84); var84 = module0066.f4840(var84)) {
            var73.resetMultipleValues();
            final SubLObject var85 = module0066.f4839(var84);
            final SubLObject var86 = var73.secondMultipleValue();
            var73.resetMultipleValues();
            final SubLObject var87 = var85.first();
            final SubLObject var88 = conses_high.second(var85);
            SubLObject var89 = var86;
            SubLObject var90 = (SubLObject)NIL;
            var90 = var89.first();
            while (NIL != var89) {
                if (NIL != var90) {
                    var75 = (SubLObject)ConsesLow.cons(module0202.f12768(var87, var88, var90), var75);
                }
                var89 = var89.rest();
                var90 = var89.first();
            }
        }
        module0066.f4842(var84);
        return f18281(Sequences.nreverse(var75), (SubLObject)T);
    }
    
    public static SubLObject f18358(final SubLObject var216, final SubLObject var217) {
        final SubLThread var218 = SubLProcess.currentSubLThread();
        final SubLObject var219 = module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        SubLObject var220;
        for (var220 = module0066.f4838(module0067.f4891(var216)); NIL == module0066.f4841(var220); var220 = module0066.f4840(var220)) {
            var218.resetMultipleValues();
            final SubLObject var221 = module0066.f4839(var220);
            final SubLObject var222 = var218.secondMultipleValue();
            var218.resetMultipleValues();
            final SubLObject var223 = var221.first();
            final SubLObject var224 = module0067.f4884(var217, var221, (SubLObject)UNPROVIDED);
            final SubLObject var225 = module0599.f36728(var223, (SubLObject)TWO_INTEGER, ConsesLow.append(var222, var224), (SubLObject)UNPROVIDED);
            final SubLObject var226 = module0035.f2220(module0076.f5290(var222, var225, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var224, (SubLObject)UNPROVIDED);
            module0067.f4886(var219, var221, var226);
        }
        module0066.f4842(var220);
        return var219;
    }
    
    public static SubLObject f18357(final SubLObject var122, final SubLObject var223) {
        final SubLThread var224 = SubLProcess.currentSubLThread();
        final SubLObject var225 = module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        var224.resetMultipleValues();
        final SubLObject var226 = f18359(var122);
        final SubLObject var227 = var224.secondMultipleValue();
        var224.resetMultipleValues();
        module0067.f4881(var225);
        SubLObject var228 = var227;
        SubLObject var229 = (SubLObject)NIL;
        var229 = var228.first();
        while (NIL != var228) {
            SubLObject var48_226 = $g2597$.getDynamicValue(var224);
            SubLObject var230 = (SubLObject)NIL;
            var230 = var48_226.first();
            while (NIL != var48_226) {
                module0067.f4886(var225, (SubLObject)ConsesLow.list(var230, var229), Functions.funcall(var223, var230, (SubLObject)TWO_INTEGER, Hashtables.gethash((SubLObject)ConsesLow.list(var230, var229), var226, (SubLObject)UNPROVIDED)));
                var48_226 = var48_226.rest();
                var230 = var48_226.first();
            }
            var228 = var228.rest();
            var229 = var228.first();
        }
        return var225;
    }
    
    public static SubLObject f18359(final SubLObject var227) {
        final SubLThread var228 = SubLProcess.currentSubLThread();
        final SubLObject var229 = Hashtables.make_hash_table((SubLObject)FOUR_INTEGER, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        SubLObject var230 = (SubLObject)NIL;
        SubLObject var232;
        final SubLObject var231 = var232 = module0205.f13207(var227, (SubLObject)$ic15$);
        SubLObject var233 = (SubLObject)NIL;
        var233 = var232.first();
        while (NIL != var232) {
            final SubLObject var234 = module0205.f13378(var233);
            if (NIL != module0004.f104(var234, $g2597$.getDynamicValue(var228), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED)) {
                final SubLObject var235 = module0205.f13379(var233, (SubLObject)UNPROVIDED);
                if (NIL == conses_high.member(var235, var230, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var230 = (SubLObject)ConsesLow.cons(var235, var230);
                }
                module0030.f1600((SubLObject)ConsesLow.list(var234, module0205.f13379(var233, (SubLObject)UNPROVIDED)), module0205.f13380(var233, (SubLObject)UNPROVIDED), var229, (SubLObject)UNPROVIDED);
            }
            var232 = var232.rest();
            var233 = var232.first();
        }
        return Values.values(var229, var230);
    }
    
    public static SubLObject f18300() {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL != f18324() && NIL != module0146.$g2062$.getDynamicValue(var16) && NIL == $g2596$.getDynamicValue(var16));
    }
    
    public static SubLObject f18360(final SubLObject var11, final SubLObject var24) {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        if (NIL == module0202.f12660(var11)) {
            return var11;
        }
        SubLObject var26 = (SubLObject)NIL;
        final SubLObject var27 = module0147.$g2094$.currentBinding(var25);
        final SubLObject var28 = module0147.$g2095$.currentBinding(var25);
        final SubLObject var29 = $g2596$.currentBinding(var25);
        try {
            module0147.$g2094$.bind(module0147.f9531(var24), var25);
            module0147.$g2095$.bind(module0147.f9534(var24), var25);
            $g2596$.bind((SubLObject)T, var25);
            SubLObject var30 = (SubLObject)NIL;
            var25.resetMultipleValues();
            SubLObject var31 = module0282.f18735(var11, var24);
            final SubLObject var24_231 = var25.secondMultipleValue();
            var25.resetMultipleValues();
            module0282.f18715(var31);
            if (NIL == module0202.f12595(var31)) {
                var31 = module0202.f12773((SubLObject)ConsesLow.list(var31));
            }
            final SubLObject var32 = module0307.f20772(var11, var24_231, (SubLObject)UNPROVIDED);
            SubLObject var33 = (SubLObject)NIL;
            if (NIL != var32) {
                var33 = module0205.f13377(var31, (SubLObject)$ic15$);
                if (NIL != module0202.f12595(var32)) {
                    SubLObject var34;
                    final SubLObject var93_233 = var34 = module0205.f13207(var32, (SubLObject)$ic15$);
                    SubLObject var35 = (SubLObject)NIL;
                    var35 = var34.first();
                    while (NIL != var34) {
                        var33 = (SubLObject)ConsesLow.cons(var35, var33);
                        var34 = var34.rest();
                        var35 = var34.first();
                    }
                    var31 = f18287(var33, (SubLObject)UNPROVIDED);
                }
                else {
                    var31 = f18287(conses_high.adjoin(var32, var33, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
                }
            }
            final SubLObject var36 = f18357(var31, Symbols.symbol_function((SubLObject)$ic42$));
            SubLObject var38;
            final SubLObject var37 = var38 = module0205.f13207(var31, (SubLObject)$ic15$);
            SubLObject var39 = (SubLObject)NIL;
            var39 = var38.first();
            while (NIL != var38) {
                if (NIL != module0202.f12594(var39)) {
                    var30 = (SubLObject)ConsesLow.cons(f18361(var39, var36), var30);
                }
                else {
                    var30 = (SubLObject)ConsesLow.cons(var39, var30);
                }
                var38 = var38.rest();
                var39 = var38.first();
            }
            SubLObject var40;
            for (var40 = module0066.f4838(module0067.f4891(var36)); NIL == module0066.f4841(var40); var40 = module0066.f4840(var40)) {
                var25.resetMultipleValues();
                final SubLObject var41 = module0066.f4839(var40);
                final SubLObject var42 = var25.secondMultipleValue();
                var25.resetMultipleValues();
                final SubLObject var43 = var41.first();
                final SubLObject var44 = conses_high.second(var41);
                SubLObject var45 = var42;
                SubLObject var46 = (SubLObject)NIL;
                var46 = var45.first();
                while (NIL != var45) {
                    if (NIL != var46) {
                        var30 = (SubLObject)ConsesLow.cons(module0202.f12768(var43, var44, var46), var30);
                    }
                    var45 = var45.rest();
                    var46 = var45.first();
                }
            }
            module0066.f4842(var40);
            var26 = f18299(f18287(Sequences.nreverse(var30), (SubLObject)T), (SubLObject)UNPROVIDED);
        }
        finally {
            $g2596$.rebind(var29, var25);
            module0147.$g2095$.rebind(var28, var25);
            module0147.$g2094$.rebind(var27, var25);
        }
        return var26;
    }
    
    public static SubLObject f18361(final SubLObject var72, final SubLObject var235) {
        final SubLThread var236 = SubLProcess.currentSubLThread();
        assert NIL != module0202.f12594(var72) : var72;
        final SubLObject var237 = f18357(var72, Symbols.symbol_function((SubLObject)$ic41$));
        SubLObject var238 = (SubLObject)NIL;
        SubLObject var239 = (SubLObject)NIL;
        final SubLObject var240 = module0205.f13207(var72, (SubLObject)$ic15$);
        SubLObject var241;
        SubLObject var242;
        SubLObject var243;
        SubLObject var244;
        SubLObject var245;
        SubLObject var246;
        SubLObject var247;
        SubLObject var248;
        for (var241 = (SubLObject)NIL, var241 = var240; NIL == var239 && NIL != var241; var241 = var241.rest()) {
            var242 = var241.first();
            var243 = module0205.f13378(var242);
            var244 = module0205.f13379(var242, (SubLObject)UNPROVIDED);
            var245 = (SubLObject)ConsesLow.list(module0205.f13380(var242, (SubLObject)UNPROVIDED));
            if (NIL != module0004.f104(var243, $g2597$.getDynamicValue(var236), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL != module0201.f12546(var244)) {
                var246 = (SubLObject)ConsesLow.list(var243, var244);
                var247 = module0067.f4884(var235, var246, (SubLObject)UNPROVIDED);
                var248 = module0067.f4884(var237, var246, (SubLObject)UNPROVIDED);
                if (NIL != module0599.f36729(var243, (SubLObject)TWO_INTEGER, var245, var247, (SubLObject)UNPROVIDED)) {
                    var239 = (SubLObject)T;
                }
                else if (NIL == module0599.f36729(var243, (SubLObject)TWO_INTEGER, var245, var248, (SubLObject)UNPROVIDED)) {
                    var238 = (SubLObject)ConsesLow.cons(var242, var238);
                }
            }
            else {
                var238 = (SubLObject)ConsesLow.cons(var242, var238);
            }
        }
        if (NIL != var239) {
            return module0202.f12772((SubLObject)ConsesLow.list($ic11$));
        }
        SubLObject var249;
        for (var249 = module0066.f4838(module0067.f4891(var237)); NIL == module0066.f4841(var249); var249 = module0066.f4840(var249)) {
            var236.resetMultipleValues();
            final SubLObject var250 = module0066.f4839(var249);
            final SubLObject var251 = var236.secondMultipleValue();
            var236.resetMultipleValues();
            final SubLObject var252 = var250.first();
            final SubLObject var253 = conses_high.second(var250);
            SubLObject var254 = var251;
            SubLObject var255 = (SubLObject)NIL;
            var255 = var254.first();
            while (NIL != var254) {
                if (NIL != var255) {
                    var238 = (SubLObject)ConsesLow.cons(module0202.f12768(var252, var253, var255), var238);
                }
                var254 = var254.rest();
                var255 = var254.first();
            }
        }
        module0066.f4842(var249);
        return f18281(Sequences.nreverse(var238), (SubLObject)T);
    }
    
    public static SubLObject f18362(final SubLObject var123) {
        if (NIL != module0202.f12590(var123)) {
            return module0279.f18575(var123);
        }
        return var123;
    }
    
    public static SubLObject f18363(SubLObject var11, SubLObject var24, SubLObject var239) {
        if (var24 == UNPROVIDED) {
            var24 = (SubLObject)NIL;
        }
        if (var239 == UNPROVIDED) {
            var239 = (SubLObject)$ic43$;
        }
        final SubLThread var240 = SubLProcess.currentSubLThread();
        SubLObject var241 = (SubLObject)NIL;
        SubLObject var242 = (SubLObject)NIL;
        final SubLObject var243 = var24;
        final SubLObject var244 = module0147.$g2095$.currentBinding(var240);
        final SubLObject var245 = module0147.$g2094$.currentBinding(var240);
        final SubLObject var246 = module0147.$g2096$.currentBinding(var240);
        try {
            module0147.$g2095$.bind(module0147.f9545(var243), var240);
            module0147.$g2094$.bind(module0147.f9546(var243), var240);
            module0147.$g2096$.bind(module0147.f9549(var243), var240);
            final SubLObject var247 = module0304.f20293(var11, (SubLObject)UNPROVIDED);
            SubLObject var248 = (SubLObject)NIL;
            SubLObject var249 = var247;
            SubLObject var250 = (SubLObject)NIL;
            var250 = var249.first();
            while (NIL != var249) {
                if (NIL != module0035.f1995(var250, (SubLObject)EIGHT_INTEGER, (SubLObject)UNPROVIDED)) {
                    SubLObject var252;
                    final SubLObject var251 = var252 = var250;
                    SubLObject var253 = (SubLObject)NIL;
                    SubLObject var254 = (SubLObject)NIL;
                    SubLObject var255 = (SubLObject)NIL;
                    SubLObject var256 = (SubLObject)NIL;
                    SubLObject var257 = (SubLObject)NIL;
                    SubLObject var258 = (SubLObject)NIL;
                    SubLObject var24_250 = (SubLObject)NIL;
                    SubLObject var259 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var252, var251, (SubLObject)$ic44$);
                    var253 = var252.first();
                    var252 = var252.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var252, var251, (SubLObject)$ic44$);
                    var254 = var252.first();
                    var252 = var252.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var252, var251, (SubLObject)$ic44$);
                    var255 = var252.first();
                    var252 = var252.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var252, var251, (SubLObject)$ic44$);
                    var256 = var252.first();
                    var252 = var252.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var252, var251, (SubLObject)$ic44$);
                    var257 = var252.first();
                    var252 = var252.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var252, var251, (SubLObject)$ic44$);
                    var258 = var252.first();
                    var252 = var252.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var252, var251, (SubLObject)$ic44$);
                    var24_250 = var252.first();
                    var252 = var252.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var252, var251, (SubLObject)$ic44$);
                    var259 = var252.first();
                    var252 = var252.rest();
                    if (NIL == var252) {
                        if (NIL != module0035.f2169(var253, (SubLObject)$ic45$)) {
                            if (NIL != module0256.f16606(var257, (SubLObject)$ic46$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && var254.isString()) {
                                final SubLObject var260 = reader.read_from_string_ignoring_errors(var254, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                if (var260.isInteger()) {
                                    var11 = module0202.f12825(var11, var255, var256, var254, var260);
                                    var248 = (SubLObject)T;
                                }
                            }
                            if (NIL != module0256.f16606(var257, (SubLObject)$ic47$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && !var254.isString()) {
                                final SubLObject var260 = module0038.f2638(var254);
                                var11 = module0202.f12825(var11, var255, var256, var254, var260);
                                var248 = (SubLObject)T;
                            }
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var251, (SubLObject)$ic44$);
                    }
                }
                var249 = var249.rest();
                var250 = var249.first();
            }
            if (NIL != var248) {
                var242 = Functions.funcall(var239, var11);
                if (NIL == var242) {
                    var241 = var11;
                }
            }
        }
        finally {
            module0147.$g2096$.rebind(var246, var240);
            module0147.$g2094$.rebind(var245, var240);
            module0147.$g2095$.rebind(var244, var240);
        }
        return Values.values(var241, var242);
    }
    
    public static SubLObject f18364() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18278", "S#20891", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18279", "S#20892", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18280", "DISJOIN", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18281", "S#20893", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18282", "S#20894", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18283", "S#20895", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18284", "S#20896", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18285", "S#20897", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18286", "S#20898", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18287", "S#15524", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18288", "S#20899", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18289", "S#20900", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18290", "S#20901", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18291", "S#20902", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18292", "S#20903", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18294", "S#20904", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18295", "S#20905", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18297", "GET-SIMPLIFIED-CYCL-SENTENCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18293", "S#16451", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18302", "S#20906", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18299", "S#20872", 1, 1, false);
        new $f18299$UnaryFunction();
        new $f18299$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18312", "S#20907", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18307", "S#20908", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18313", "S#20909", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18310", "S#20910", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18316", "S#20911", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18319", "S#20912", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18317", "S#20913", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18318", "S#20914", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18320", "S#20915", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18321", "S#20916", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18322", "S#20666", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18323", "EL-NEGATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18303", "S#20917", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18304", "S#20667", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18325", "S#20918", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18329", "S#20919", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18326", "S#20920", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18330", "S#20921", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18327", "S#20922", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18328", "S#20923", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18334", "S#20924", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18331", "S#20925", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18332", "S#20926", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18305", "S#20927", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18335", "S#20928", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18306", "S#20929", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18337", "S#20930", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18308", "S#20931", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18309", "S#20932", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18311", "S#20933", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18298", "S#20934", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18338", "S#20935", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18339", "S#20936", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18340", "S#20882", 1, 0, false);
        new $f18340$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18324", "S#20937", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18315", "S#20938", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18314", "S#20939", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18341", "S#20940", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18333", "S#20941", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18342", "S#20942", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18343", "S#20943", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18344", "S#20944", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18296", "S#20945", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18345", "S#20946", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18346", "S#20947", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18350", "S#20948", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18347", "S#20949", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18348", "S#20950", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18349", "S#20951", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18351", "S#20952", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18301", "SIMPLIFY-TRANSITIVE-REDUNDANCIES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18336", "S#20953", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18352", "S#20954", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18354", "S#20955", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18355", "S#20956", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18356", "S#20957", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18353", "S#20958", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18358", "S#20959", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18357", "S#20960", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18359", "S#20961", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18300", "S#20962", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18360", "S#20963", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18361", "S#20964", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18362", "S#20965", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0276", "f18363", "S#20966", 1, 2, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18365() {
        $g2595$ = SubLFiles.defparameter("S#20967", (SubLObject)NIL);
        $g2596$ = SubLFiles.defparameter("S#20968", (SubLObject)NIL);
        $g2597$ = SubLFiles.defparameter("S#20969", (SubLObject)$ic40$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18366() {
        module0002.f38((SubLObject)$ic8$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f18364();
    }
    
    public void initializeVariables() {
        f18365();
    }
    
    public void runTopLevelForms() {
        f18366();
    }
    
    static {
        me = (SubLFile)new module0276();
        $g2595$ = null;
        $g2596$ = null;
        $g2597$ = null;
        $ic0$ = makeSymbol("LISTP");
        $ic1$ = makeSymbol("S#20895", "CYC");
        $ic2$ = makeSymbol("S#20896", "CYC");
        $ic3$ = makeSymbol("S#20902", "CYC");
        $ic4$ = makeSymbol("S#20898", "CYC");
        $ic5$ = makeSymbol("S#13276", "CYC");
        $ic6$ = makeSymbol("S#12629", "CYC");
        $ic7$ = makeSymbol("EL-WFF?");
        $ic8$ = makeSymbol("GET-SIMPLIFIED-CYCL-SENTENCE");
        $ic9$ = constant_handles_oc.f8479((SubLObject)makeString("InferencePSC"));
        $ic10$ = makeSymbol("S#5859", "CYC");
        $ic11$ = constant_handles_oc.f8479((SubLObject)makeString("True"));
        $ic12$ = constant_handles_oc.f8479((SubLObject)makeString("False"));
        $ic13$ = makeString("~S is not well formed.");
        $ic14$ = makeKeyword("INVALID-SENTENCE");
        $ic15$ = makeKeyword("IGNORE");
        $ic16$ = makeKeyword("REGULARIZE");
        $ic17$ = makeSymbol("S#20872", "CYC");
        $ic18$ = constant_handles_oc.f8479((SubLObject)makeString("distributesOutOfArg"));
        $ic19$ = makeSymbol("S#12278", "CYC");
        $ic20$ = makeString("You tried to negate ~S.  That was a bad idea, because it's neither a sentence nor a sentence.");
        $ic21$ = makeSymbol("S#15477", "CYC");
        $ic22$ = makeSymbol("EL-VAR?");
        $ic23$ = makeSymbol(">");
        $ic24$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("equalSymbols")), constant_handles_oc.f8479((SubLObject)makeString("indexicalReferent")));
        $ic25$ = constant_handles_oc.f8479((SubLObject)makeString("equals"));
        $ic26$ = makeKeyword("SIMPLIFICATION-TO-TAUTOLOGY-DUE-TO-POS-AND-NEG-LITERAL");
        $ic27$ = makeSymbol("S#20882", "CYC");
        $ic28$ = makeSymbol("S#20936", "CYC");
        $ic29$ = constant_handles_oc.f8479((SubLObject)makeString("CollectionSubsetFn"));
        $ic30$ = constant_handles_oc.f8479((SubLObject)makeString("TheSetOf"));
        $ic31$ = constant_handles_oc.f8479((SubLObject)makeString("trueSentence"));
        $ic32$ = constant_handles_oc.f8479((SubLObject)makeString("ist"));
        $ic33$ = makeSymbol("HL-VARIABLE-P");
        $ic34$ = constant_handles_oc.f8479((SubLObject)makeString("indexicalReferent"));
        $ic35$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#9955", "CYC"));
        $ic36$ = makeInteger(32);
        $ic37$ = makeSymbol("S#15497", "CYC");
        $ic38$ = makeKeyword("SPLIT");
        $ic39$ = makeString("Splitting sequence variables into other sequence variables is currently not supported. -ECA");
        $ic40$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), constant_handles_oc.f8479((SubLObject)makeString("genls")));
        $ic41$ = makeSymbol("S#20970", "CYC");
        $ic42$ = makeSymbol("S#20887", "CYC");
        $ic43$ = makeSymbol("EXPLANATION-OF-WHY-NOT-WFF");
        $ic44$ = ConsesLow.list((SubLObject)makeSymbol("S#20971", "CYC"), (SubLObject)makeSymbol("S#20972", "CYC"), (SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#15200", "CYC"), (SubLObject)makeSymbol("S#12455", "CYC"), (SubLObject)makeSymbol("S#12453", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#20973", "CYC"));
        $ic45$ = ConsesLow.list((SubLObject)makeKeyword("MAL-ARG-WRT-IFF-DEFN"), (SubLObject)makeKeyword("MAL-ARG-WRT-QUOTED-IFF-DEFN"));
        $ic46$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("RealNumber")), constant_handles_oc.f8479((SubLObject)makeString("SubLRealNumber")));
        $ic47$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("CharacterString")), constant_handles_oc.f8479((SubLObject)makeString("SubLString")));
    }
    
    public static final class $f18299$UnaryFunction extends UnaryFunction
    {
        public $f18299$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#20872"));
        }
        
        public SubLObject processItem(final SubLObject var36) {
            return f18299(var36, (SubLObject)$f18299$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f18299$BinaryFunction extends BinaryFunction
    {
        public $f18299$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#20872"));
        }
        
        public SubLObject processItem(final SubLObject var36, final SubLObject var37) {
            return f18299(var36, var37);
        }
    }
    
    public static final class $f18340$UnaryFunction extends UnaryFunction
    {
        public $f18340$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#20882"));
        }
        
        public SubLObject processItem(final SubLObject var36) {
            return f18340(var36);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 742 ms
	
	Decompiled with Procyon 0.5.32.
*/