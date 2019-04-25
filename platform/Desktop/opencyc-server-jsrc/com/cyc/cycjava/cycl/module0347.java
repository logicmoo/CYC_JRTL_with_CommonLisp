package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0347 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0347";
    public static final String myFingerPrint = "4a0ddda19d825882cbdf722fbc2492e8078f9168b5245b11a3f0689275c9f6dc";
    public static SubLSymbol $g2965$;
    public static SubLSymbol $g2966$;
    public static SubLSymbol $g2967$;
    private static SubLSymbol $g2968$;
    public static SubLSymbol $g2969$;
    public static SubLSymbol $g2970$;
    private static SubLSymbol $g2971$;
    private static SubLSymbol $g2972$;
    private static SubLSymbol $g2973$;
    private static SubLSymbol $g2974$;
    private static SubLSymbol $g2975$;
    private static SubLSymbol $g2976$;
    private static SubLSymbol $g2977$;
    public static SubLSymbol $g2978$;
    private static SubLSymbol $g2979$;
    private static SubLSymbol $g2980$;
    private static SubLSymbol $g2981$;
    private static SubLSymbol $g2983$;
    private static final SubLString $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLList $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLList $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLString $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLString $ic39$;
    private static final SubLString $ic40$;
    private static final SubLList $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLString $ic46$;
    private static final SubLList $ic47$;
    private static final SubLObject $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLList $ic50$;
    private static final SubLObject $ic51$;
    private static final SubLObject $ic52$;
    private static final SubLObject $ic53$;
    private static final SubLList $ic54$;
    
    public static SubLObject f23324() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0347.$g2968$.getDynamicValue(var1);
    }
    
    public static SubLObject f23325(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        module0347.$g2968$.setDynamicValue((SubLObject)ConsesLow.cons(var2, module0347.$g2968$.getDynamicValue(var3)), var3);
        return (SubLObject)module0347.NIL;
    }
    
    public static SubLObject f23326() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0347.$g2969$.getDynamicValue(var1);
    }
    
    public static SubLObject f23327() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0347.$g2970$.getDynamicValue(var1);
    }
    
    public static SubLObject f23328(final SubLObject var3, final SubLObject var4, final SubLObject var5, SubLObject var6, SubLObject var7) {
        if (var7 == module0347.UNPROVIDED) {
            var7 = (SubLObject)module0347.NIL;
        }
        final SubLThread var8 = SubLProcess.currentSubLThread();
        if (module0347.NIL == var6) {
            var6 = module0233.f15403();
        }
        final SubLObject var9 = (SubLObject)module0347.NIL;
        final SubLObject var10 = (SubLObject)module0347.NIL;
        var8.resetMultipleValues();
        final SubLObject var11 = f23329(var3, var4, var5);
        final SubLObject var12 = var8.secondMultipleValue();
        var8.resetMultipleValues();
        if (module0347.NIL != module0347.$g2966$.getDynamicValue(var8)) {
            final SubLObject var13 = module0232.f15305(ConsesLow.append(var12, var10), ConsesLow.append(var11, var9));
            return Functions.funcall(module0347.$g2966$.getDynamicValue(var8), var3, var4, var5, var6, var13, var7);
        }
        return Errors.error((SubLObject)module0347.$ic0$);
    }
    
    public static SubLObject f23329(final SubLObject var13, final SubLObject var14, final SubLObject var15) {
        final SubLObject var16 = module0178.f11282(var13);
        if (module0347.$ic1$ == var15) {
            return Values.values(module0232.f15306(var16), Sequences.remove(var14, module0232.f15308(var16), (SubLObject)module0347.UNPROVIDED, (SubLObject)module0347.UNPROVIDED, (SubLObject)module0347.UNPROVIDED, (SubLObject)module0347.UNPROVIDED, (SubLObject)module0347.UNPROVIDED));
        }
        return Values.values(Sequences.remove(var14, module0232.f15306(var16), (SubLObject)module0347.UNPROVIDED, (SubLObject)module0347.UNPROVIDED, (SubLObject)module0347.UNPROVIDED, (SubLObject)module0347.UNPROVIDED, (SubLObject)module0347.UNPROVIDED), module0232.f15308(var16));
    }
    
    public static SubLObject f23330(final SubLObject var17, SubLObject var6, SubLObject var7) {
        if (var6 == module0347.UNPROVIDED) {
            var6 = (SubLObject)module0347.NIL;
        }
        if (var7 == module0347.UNPROVIDED) {
            var7 = (SubLObject)module0347.NIL;
        }
        final SubLThread var18 = SubLProcess.currentSubLThread();
        if (module0347.NIL == var6) {
            var6 = module0233.f15403();
        }
        if (module0347.NIL == module0347.$g2965$.getDynamicValue(var18)) {
            Errors.error((SubLObject)module0347.$ic0$);
        }
        return f23331(module0347.$g2965$.getDynamicValue(var18), var6, (SubLObject)ConsesLow.cons(var17, var7));
    }
    
    public static SubLObject f23331(final SubLObject var18, final SubLObject var6, final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        if (var18.eql((SubLObject)module0347.$ic2$)) {
            return module0376.f26696(var6, var19);
        }
        if (var18.eql((SubLObject)module0347.$ic3$)) {
            return module0376.f26700(var6, var19);
        }
        if (var18.eql((SubLObject)module0347.$ic4$)) {
            return f23332(var6, var19);
        }
        return Functions.funcall(module0347.$g2965$.getDynamicValue(var20), var6, var19);
    }
    
    public static SubLObject f23333(final SubLObject var21) {
        return module0035.f2169(var21, module0347.$g2971$.getGlobalValue());
    }
    
    public static SubLObject f23334(final SubLObject var22, SubLObject var23, SubLObject var24, SubLObject var25) {
        if (var23 == module0347.UNPROVIDED) {
            var23 = (SubLObject)module0347.NIL;
        }
        if (var24 == module0347.UNPROVIDED) {
            var24 = (SubLObject)module0347.$ic7$;
        }
        if (var25 == module0347.UNPROVIDED) {
            var25 = (SubLObject)module0347.NIL;
        }
        final SubLThread var26 = SubLProcess.currentSubLThread();
        assert module0347.NIL != module0206.f13433(var22) : var22;
        final SubLObject var27 = var25;
        assert module0347.NIL != module0035.f2327(var27) : var27;
        SubLObject var28;
        SubLObject var29;
        SubLObject var30;
        for (var28 = (SubLObject)module0347.NIL, var28 = var27; module0347.NIL != var28; var28 = conses_high.cddr(var28)) {
            var29 = var28.first();
            var30 = conses_high.cadr(var28);
            assert module0347.NIL != f23333(var29) : var29;
        }
        if (module0347.NIL == var23) {
            var23 = module0132.$g1568$.getGlobalValue();
        }
        SubLObject var31 = (SubLObject)module0347.NIL;
        SubLObject var32 = (SubLObject)module0347.NIL;
        SubLObject var33 = (SubLObject)module0347.NIL;
        final SubLObject var34 = module0347.$g2965$.currentBinding(var26);
        final SubLObject var35 = module0339.$g2901$.currentBinding(var26);
        final SubLObject var36 = module0339.$g2902$.currentBinding(var26);
        try {
            module0347.$g2965$.bind((SubLObject)module0347.$ic4$, var26);
            module0339.$g2901$.bind((SubLObject)ConsesLow.cons((SubLObject)module0347.NIL, module0339.$g2901$.getDynamicValue(var26)), var26);
            module0339.$g2902$.bind((SubLObject)module0347.NIL, var26);
            final SubLObject var37 = module0147.f9540(var23);
            final SubLObject var33_37 = module0147.$g2095$.currentBinding(var26);
            final SubLObject var34_38 = module0147.$g2094$.currentBinding(var26);
            final SubLObject var35_39 = module0147.$g2096$.currentBinding(var26);
            try {
                module0147.$g2095$.bind(module0147.f9545(var37), var26);
                module0147.$g2094$.bind(module0147.f9546(var37), var26);
                module0147.$g2096$.bind(module0147.f9549(var37), var26);
                var26.resetMultipleValues();
                final SubLObject var40_41 = f23335(var22, var24, var25);
                final SubLObject var42_43 = var26.secondMultipleValue();
                final SubLObject var44_45 = var26.thirdMultipleValue();
                var26.resetMultipleValues();
                var31 = var40_41;
                var32 = var42_43;
                var33 = var44_45;
            }
            finally {
                module0147.$g2096$.rebind(var35_39, var26);
                module0147.$g2094$.rebind(var34_38, var26);
                module0147.$g2095$.rebind(var33_37, var26);
            }
        }
        finally {
            module0339.$g2902$.rebind(var36, var26);
            module0339.$g2901$.rebind(var35, var26);
            module0347.$g2965$.rebind(var34, var26);
        }
        return Values.values(var31, var32, var33);
    }
    
    public static SubLObject f23336(final SubLObject var22, SubLObject var23, SubLObject var24, SubLObject var25) {
        if (var23 == module0347.UNPROVIDED) {
            var23 = (SubLObject)module0347.NIL;
        }
        if (var24 == module0347.UNPROVIDED) {
            var24 = (SubLObject)module0347.$ic7$;
        }
        if (var25 == module0347.UNPROVIDED) {
            var25 = (SubLObject)module0347.NIL;
        }
        final SubLObject var26 = module0193.f12095(var22);
        return f23334(var26, var23, var24, var25);
    }
    
    public static SubLObject f23337(final SubLObject var22, SubLObject var23, SubLObject var24, SubLObject var25) {
        if (var23 == module0347.UNPROVIDED) {
            var23 = (SubLObject)module0347.NIL;
        }
        if (var24 == module0347.UNPROVIDED) {
            var24 = (SubLObject)module0347.$ic7$;
        }
        if (var25 == module0347.UNPROVIDED) {
            var25 = (SubLObject)module0347.NIL;
        }
        final SubLThread var26 = SubLProcess.currentSubLThread();
        var26.resetMultipleValues();
        final SubLObject var27 = f23334(var22, var23, var24, var25);
        final SubLObject var28 = var26.secondMultipleValue();
        final SubLObject var29 = var26.thirdMultipleValue();
        var26.resetMultipleValues();
        final SubLObject var30 = module0035.f2081(Symbols.symbol_function((SubLObject)module0347.$ic11$), var27, Symbols.symbol_function((SubLObject)module0347.EQUAL));
        return Values.values(var30, var28, var29);
    }
    
    public static SubLObject f23338(final SubLObject var22, SubLObject var23, SubLObject var24, SubLObject var25) {
        if (var23 == module0347.UNPROVIDED) {
            var23 = (SubLObject)module0347.NIL;
        }
        if (var24 == module0347.UNPROVIDED) {
            var24 = (SubLObject)module0347.$ic7$;
        }
        if (var25 == module0347.UNPROVIDED) {
            var25 = (SubLObject)module0347.NIL;
        }
        final SubLObject var26 = module0193.f12095(var22);
        return f23337(var26, var23, var24, var25);
    }
    
    public static SubLObject f23339(final SubLObject var22, SubLObject var23, SubLObject var24, SubLObject var25) {
        if (var23 == module0347.UNPROVIDED) {
            var23 = (SubLObject)module0347.NIL;
        }
        if (var24 == module0347.UNPROVIDED) {
            var24 = (SubLObject)module0347.$ic7$;
        }
        if (var25 == module0347.UNPROVIDED) {
            var25 = (SubLObject)module0347.NIL;
        }
        final SubLThread var26 = SubLProcess.currentSubLThread();
        var26.resetMultipleValues();
        final SubLObject var27 = f23334(var22, var23, var24, var25);
        final SubLObject var28 = var26.secondMultipleValue();
        final SubLObject var29 = var26.thirdMultipleValue();
        var26.resetMultipleValues();
        final SubLObject var30 = Mapping.mapcar(Symbols.symbol_function((SubLObject)module0347.$ic12$), var27);
        return Values.values(var30, var28, var29);
    }
    
    public static SubLObject f23340(final SubLObject var22, SubLObject var23, SubLObject var24, SubLObject var25) {
        if (var23 == module0347.UNPROVIDED) {
            var23 = (SubLObject)module0347.NIL;
        }
        if (var24 == module0347.UNPROVIDED) {
            var24 = (SubLObject)module0347.$ic7$;
        }
        if (var25 == module0347.UNPROVIDED) {
            var25 = (SubLObject)module0347.NIL;
        }
        final SubLObject var26 = module0193.f12095(var22);
        return f23339(var26, var23, var24, var25);
    }
    
    public static SubLObject f23341(final SubLObject var50, final SubLObject var22, SubLObject var23, SubLObject var24, SubLObject var25) {
        if (var23 == module0347.UNPROVIDED) {
            var23 = (SubLObject)module0347.NIL;
        }
        if (var24 == module0347.UNPROVIDED) {
            var24 = (SubLObject)module0347.$ic7$;
        }
        if (var25 == module0347.UNPROVIDED) {
            var25 = (SubLObject)module0347.NIL;
        }
        final SubLObject var51 = f23334(var22, var23, var24, var25);
        SubLObject var52 = (SubLObject)module0347.NIL;
        SubLObject var53 = var51;
        SubLObject var54 = (SubLObject)module0347.NIL;
        var54 = var53.first();
        while (module0347.NIL != var53) {
            SubLObject var56;
            final SubLObject var55 = var56 = var54;
            SubLObject var57 = (SubLObject)module0347.NIL;
            SubLObject var58 = (SubLObject)module0347.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var56, var55, (SubLObject)module0347.$ic13$);
            var57 = var56.first();
            var56 = var56.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var56, var55, (SubLObject)module0347.$ic13$);
            var58 = var56.first();
            var56 = var56.rest();
            if (module0347.NIL == var56) {
                var52 = (SubLObject)ConsesLow.cons(module0233.f15361(var57, var50), var52);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var55, (SubLObject)module0347.$ic13$);
            }
            var53 = var53.rest();
            var54 = var53.first();
        }
        return Sequences.nreverse(var52);
    }
    
    public static SubLObject f23342(final SubLObject var50, final SubLObject var22, SubLObject var23, SubLObject var24, SubLObject var25) {
        if (var23 == module0347.UNPROVIDED) {
            var23 = (SubLObject)module0347.NIL;
        }
        if (var24 == module0347.UNPROVIDED) {
            var24 = (SubLObject)module0347.$ic7$;
        }
        if (var25 == module0347.UNPROVIDED) {
            var25 = (SubLObject)module0347.NIL;
        }
        final SubLObject var51 = module0193.f12095(var50);
        final SubLObject var52 = module0193.f12095(var22);
        return f23341(var51, var52, var23, var24, var25);
    }
    
    public static SubLObject f23343(final SubLObject var57, final SubLObject var22, SubLObject var23, SubLObject var24, SubLObject var25) {
        if (var23 == module0347.UNPROVIDED) {
            var23 = (SubLObject)module0347.NIL;
        }
        if (var24 == module0347.UNPROVIDED) {
            var24 = (SubLObject)module0347.$ic7$;
        }
        if (var25 == module0347.UNPROVIDED) {
            var25 = (SubLObject)module0347.NIL;
        }
        SubLObject var58 = f23342(var57, var22, var23, var24, var25);
        var58 = module0035.f2269(var58, Symbols.symbol_function((SubLObject)module0347.EQUAL), (SubLObject)module0347.UNPROVIDED, (SubLObject)module0347.UNPROVIDED, (SubLObject)module0347.UNPROVIDED, (SubLObject)module0347.UNPROVIDED);
        return var58;
    }
    
    public static SubLObject f23344(final SubLObject var58, final SubLObject var22, SubLObject var23, SubLObject var24, SubLObject var25) {
        if (var23 == module0347.UNPROVIDED) {
            var23 = (SubLObject)module0347.NIL;
        }
        if (var24 == module0347.UNPROVIDED) {
            var24 = (SubLObject)module0347.$ic7$;
        }
        if (var25 == module0347.UNPROVIDED) {
            var25 = (SubLObject)module0347.NIL;
        }
        final SubLObject var59 = module0193.f12075((SubLObject)module0347.ZERO_INTEGER);
        final SubLObject var60 = module0205.f13250(var59, var58, var22, (SubLObject)module0347.UNPROVIDED, (SubLObject)module0347.UNPROVIDED);
        final SubLObject var61 = f23345(var59, var60, var23, var24, var25);
        return var61;
    }
    
    public static SubLObject f23345(final SubLObject var61, final SubLObject var22, SubLObject var23, SubLObject var24, SubLObject var25) {
        if (var23 == module0347.UNPROVIDED) {
            var23 = (SubLObject)module0347.NIL;
        }
        if (var24 == module0347.UNPROVIDED) {
            var24 = (SubLObject)module0347.$ic7$;
        }
        if (var25 == module0347.UNPROVIDED) {
            var25 = (SubLObject)module0347.NIL;
        }
        SubLObject var62 = f23341(var61, var22, var23, var24, var25);
        var62 = module0035.f2269(var62, Symbols.symbol_function((SubLObject)module0347.EQUAL), (SubLObject)module0347.UNPROVIDED, (SubLObject)module0347.UNPROVIDED, (SubLObject)module0347.UNPROVIDED, (SubLObject)module0347.UNPROVIDED);
        return var62;
    }
    
    public static SubLObject f23346() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0066.f4826(module0347.$g2972$.getDynamicValue(var1));
    }
    
    public static SubLObject f23332(final SubLObject var6, final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        if (module0347.NIL != module0347.$g2974$.getDynamicValue(var20) && module0347.NIL != module0408.f28482(var6)) {
            return (SubLObject)module0347.NIL;
        }
        if (module0347.NIL != module0066.f4827(module0347.$g2972$.getDynamicValue(var20)) && module0347.NIL != module0347.$g2977$.getDynamicValue(var20)) {
            module0347.$g2975$.setDynamicValue(module0051.f3571(module0347.$g2977$.getDynamicValue(var20), (SubLObject)module0347.UNPROVIDED), var20);
        }
        if (module0347.NIL != module0347.$g2977$.getDynamicValue(var20)) {
            module0347.$g2976$.setDynamicValue(module0051.f3571(module0347.$g2977$.getDynamicValue(var20), (SubLObject)module0347.UNPROVIDED), var20);
        }
        module0347.$g2972$.setDynamicValue(module0084.f5763(module0347.$g2972$.getDynamicValue(var20), conses_high.copy_tree(var6), conses_high.copy_tree(var19), Symbols.symbol_function((SubLObject)module0347.EQUAL)), var20);
        if (module0347.NIL != module0347.$g2973$.getDynamicValue(var20) && f23346().numGE(module0347.$g2973$.getDynamicValue(var20))) {
            return f23347((SubLObject)module0347.$ic14$);
        }
        return (SubLObject)module0347.NIL;
    }
    
    public static SubLObject f23335(final SubLObject var22, final SubLObject var24, SubLObject var25) {
        if (var25 == module0347.UNPROVIDED) {
            var25 = (SubLObject)module0347.NIL;
        }
        final SubLObject var26 = var25;
        assert module0347.NIL != module0035.f2327(var26) : var26;
        SubLObject var27;
        SubLObject var28;
        SubLObject var29;
        for (var27 = (SubLObject)module0347.NIL, var27 = var26; module0347.NIL != var27; var27 = conses_high.cddr(var27)) {
            var28 = var27.first();
            var29 = conses_high.cadr(var27);
            assert module0347.NIL != f23333(var28) : var28;
        }
        final SubLObject var30 = module0130.f8513(var24);
        final SubLObject var31 = conses_high.getf(var25, (SubLObject)module0347.$ic15$, (SubLObject)module0347.$ic16$);
        final SubLObject var32 = f23348(var22, var30, var31);
        if (module0347.NIL != var32) {
            return f23349(var22, var30, var32, var25);
        }
        return Values.values((SubLObject)module0347.NIL, (SubLObject)module0347.$ic17$, (SubLObject)module0347.NIL);
    }
    
    public static SubLObject f23348(final SubLObject var22, final SubLObject var62, final SubLObject var63) {
        return module0376.f26666(var22, var62, var63);
    }
    
    public static SubLObject f23349(final SubLObject var22, final SubLObject var62, SubLObject var65, final SubLObject var25) {
        final SubLThread var66 = SubLProcess.currentSubLThread();
        SubLObject var67 = (SubLObject)module0347.NIL;
        SubLObject var68 = (SubLObject)module0347.NIL;
        SubLObject var69 = (SubLObject)module0347.NIL;
        var65 = Sort.sort(conses_high.copy_list(var65), Symbols.symbol_function((SubLObject)module0347.$ic18$), Symbols.symbol_function((SubLObject)module0347.$ic12$));
        final SubLObject var70 = conses_high.getf(var25, (SubLObject)module0347.$ic19$, (SubLObject)module0347.NIL);
        final SubLObject var71 = module0347.$g2972$.currentBinding(var66);
        final SubLObject var72 = module0347.$g2973$.currentBinding(var66);
        final SubLObject var73 = module0347.$g2974$.currentBinding(var66);
        final SubLObject var74 = module0347.$g2977$.currentBinding(var66);
        final SubLObject var75 = module0347.$g2975$.currentBinding(var66);
        final SubLObject var76 = module0347.$g2976$.currentBinding(var66);
        try {
            module0347.$g2972$.bind(module0066.f4824((SubLObject)module0347.ZERO_INTEGER, Symbols.symbol_function((SubLObject)module0347.EQUAL)), var66);
            module0347.$g2973$.bind(conses_high.getf(var25, (SubLObject)module0347.$ic14$, (SubLObject)module0347.NIL), var66);
            module0347.$g2974$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0347.NIL == conses_high.getf(var25, (SubLObject)module0347.$ic20$, (SubLObject)module0347.T)), var66);
            module0347.$g2977$.bind((SubLObject)((module0347.NIL != var70) ? Time.get_internal_real_time() : module0347.NIL), var66);
            module0347.$g2975$.bind((SubLObject)module0347.NIL, var66);
            module0347.$g2976$.bind((SubLObject)module0347.NIL, var66);
            if (module0347.NIL == var68) {
                SubLObject var77 = var65;
                SubLObject var78 = (SubLObject)module0347.NIL;
                var78 = var77.first();
                while (module0347.NIL == var68 && module0347.NIL != var77) {
                    try {
                        var66.throwStack.push(module0347.$ic21$);
                        SubLObject var80;
                        final SubLObject var79 = var80 = var78;
                        SubLObject var81 = (SubLObject)module0347.NIL;
                        SubLObject var82 = (SubLObject)module0347.NIL;
                        SubLObject var83 = (SubLObject)module0347.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0347.$ic22$);
                        var81 = var80.first();
                        var80 = var80.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0347.$ic22$);
                        var82 = var80.first();
                        var80 = var80.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0347.$ic22$);
                        var83 = var80.first();
                        var80 = var80.rest();
                        if (module0347.NIL == var80) {
                            final SubLObject var84 = module0360.f23937(var82);
                            final SubLObject var33_78 = module0347.$g2969$.currentBinding(var66);
                            try {
                                module0347.$g2969$.bind(var81, var66);
                                final SubLObject var85 = module0340.f22875(var81);
                                final SubLObject var86 = (SubLObject)((module0347.NIL != var85) ? module0347.NIL : module0340.f22873(var81));
                                if (module0347.NIL == f23350(var81, var84)) {
                                    final SubLObject var33_79 = module0347.$g2970$.currentBinding(var66);
                                    try {
                                        module0347.$g2970$.bind(var62, var66);
                                        if (module0347.NIL != var85) {
                                            module0337.f22649(var85, var22, (SubLObject)module0347.UNPROVIDED);
                                        }
                                        else {
                                            Functions.funcall(var86, var22, var62);
                                        }
                                    }
                                    finally {
                                        module0347.$g2970$.rebind(var33_79, var66);
                                    }
                                }
                            }
                            finally {
                                module0347.$g2969$.rebind(var33_78, var66);
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)module0347.$ic22$);
                        }
                    }
                    catch (Throwable var87) {
                        var68 = Errors.handleThrowable(var87, (SubLObject)module0347.$ic21$);
                    }
                    finally {
                        var66.throwStack.pop();
                    }
                    var77 = var77.rest();
                    var78 = var77.first();
                }
            }
            final SubLObject var88 = module0360.f23830(var25);
            SubLObject var89;
            for (var89 = module0066.f4838(module0347.$g2972$.getDynamicValue(var66)); module0347.NIL == module0066.f4841(var89); var89 = module0066.f4840(var89)) {
                var66.resetMultipleValues();
                final SubLObject var90 = module0066.f4839(var89);
                final SubLObject var91 = var66.secondMultipleValue();
                var66.resetMultipleValues();
                SubLObject var92 = var91;
                SubLObject var93 = (SubLObject)module0347.NIL;
                var93 = var92.first();
                while (module0347.NIL != var92) {
                    if (module0347.NIL == var88 || module0347.NIL == module0532.f33186() || module0347.NIL == module0377.f26848(var93)) {
                        var67 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var90, var93), var67);
                    }
                    var92 = var92.rest();
                    var93 = var92.first();
                }
            }
            module0066.f4842(var89);
            if (module0347.NIL == var68) {
                var68 = (SubLObject)module0347.$ic17$;
            }
            if (module0347.NIL != var70) {
                var69 = f23351(var70);
            }
        }
        finally {
            module0347.$g2976$.rebind(var76, var66);
            module0347.$g2975$.rebind(var75, var66);
            module0347.$g2977$.rebind(var74, var66);
            module0347.$g2974$.rebind(var73, var66);
            module0347.$g2973$.rebind(var72, var66);
            module0347.$g2972$.rebind(var71, var66);
        }
        return Values.values(Sequences.nreverse(var67), var68, var69);
    }
    
    public static SubLObject f23351(final SubLObject var32) {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        SubLObject var34 = conses_high.copy_list(var32);
        final SubLObject var35 = (SubLObject)((module0347.NIL != module0347.$g2975$.getDynamicValue(var33)) ? module0051.f3572(module0347.$g2975$.getDynamicValue(var33)) : module0347.NIL);
        final SubLObject var36 = (SubLObject)((module0347.NIL != module0347.$g2976$.getDynamicValue(var33)) ? module0051.f3572(module0347.$g2976$.getDynamicValue(var33)) : module0347.NIL);
        final SubLObject var37 = module0051.f3572(module0051.f3571(module0347.$g2977$.getDynamicValue(var33), (SubLObject)module0347.UNPROVIDED));
        SubLObject var38 = var32;
        SubLObject var39 = (SubLObject)module0347.NIL;
        var39 = var38.first();
        while (module0347.NIL != var38) {
            final SubLObject var40 = var39;
            if (var40.eql((SubLObject)module0347.$ic23$)) {
                final SubLObject var41 = f23346();
                var34 = Sequences.nsubstitute(var41, (SubLObject)module0347.$ic23$, var34, Symbols.symbol_function((SubLObject)module0347.EQ), (SubLObject)module0347.UNPROVIDED, (SubLObject)module0347.UNPROVIDED, (SubLObject)module0347.UNPROVIDED, (SubLObject)module0347.UNPROVIDED);
            }
            else if (var40.eql((SubLObject)module0347.$ic24$)) {
                var34 = Sequences.nsubstitute(var35, (SubLObject)module0347.$ic24$, var34, Symbols.symbol_function((SubLObject)module0347.EQ), (SubLObject)module0347.UNPROVIDED, (SubLObject)module0347.UNPROVIDED, (SubLObject)module0347.UNPROVIDED, (SubLObject)module0347.UNPROVIDED);
            }
            else if (var40.eql((SubLObject)module0347.$ic25$)) {
                var34 = Sequences.nsubstitute(var36, (SubLObject)module0347.$ic25$, var34, Symbols.symbol_function((SubLObject)module0347.EQ), (SubLObject)module0347.UNPROVIDED, (SubLObject)module0347.UNPROVIDED, (SubLObject)module0347.UNPROVIDED, (SubLObject)module0347.UNPROVIDED);
            }
            else if (var40.eql((SubLObject)module0347.$ic26$)) {
                var34 = Sequences.nsubstitute(var37, (SubLObject)module0347.$ic26$, var34, (SubLObject)module0347.UNPROVIDED, (SubLObject)module0347.UNPROVIDED, (SubLObject)module0347.UNPROVIDED, (SubLObject)module0347.UNPROVIDED, (SubLObject)module0347.UNPROVIDED);
            }
            else if (var40.eql((SubLObject)module0347.$ic27$)) {
                final SubLObject var41 = f23346();
                SubLObject var42 = (SubLObject)module0347.NIL;
                if (var37.isNumber() && module0347.NIL != module0004.f105(var41)) {
                    var42 = Numbers.divide(var37, var41);
                }
                var34 = Sequences.nsubstitute(var42, (SubLObject)module0347.$ic27$, var34, Symbols.symbol_function((SubLObject)module0347.EQ), (SubLObject)module0347.UNPROVIDED, (SubLObject)module0347.UNPROVIDED, (SubLObject)module0347.UNPROVIDED, (SubLObject)module0347.UNPROVIDED);
            }
            else if (var40.eql((SubLObject)module0347.$ic28$)) {
                final SubLObject var43 = module0035.f2410(var37, var35);
                var34 = Sequences.nsubstitute(var43, (SubLObject)module0347.$ic28$, var34, Symbols.symbol_function((SubLObject)module0347.EQ), (SubLObject)module0347.UNPROVIDED, (SubLObject)module0347.UNPROVIDED, (SubLObject)module0347.UNPROVIDED, (SubLObject)module0347.UNPROVIDED);
            }
            else if (!var40.eql((SubLObject)module0347.$ic29$) && !var40.eql((SubLObject)module0347.$ic30$)) {
                if (!var40.eql((SubLObject)module0347.$ic31$)) {
                    Errors.warn((SubLObject)module0347.$ic32$, var39);
                    var34 = Sequences.nsubstitute((SubLObject)module0347.NIL, var39, var34, Symbols.symbol_function((SubLObject)module0347.EQ), (SubLObject)module0347.UNPROVIDED, (SubLObject)module0347.UNPROVIDED, (SubLObject)module0347.UNPROVIDED, (SubLObject)module0347.UNPROVIDED);
                }
            }
            var38 = var38.rest();
            var39 = var38.first();
        }
        return var34;
    }
    
    public static SubLObject f23347(final SubLObject var31) {
        return Dynamic.sublisp_throw((SubLObject)module0347.$ic21$, var31);
    }
    
    public static SubLObject f23350(final SubLObject var74, final SubLObject var77) {
        final SubLThread var78 = SubLProcess.currentSubLThread();
        final SubLObject var79 = module0340.f22791(var74);
        if (var79.eql((SubLObject)module0347.$ic33$)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0347.NIL != module0018.$g650$.getDynamicValue(var78) && var77.numG(module0018.$g650$.getDynamicValue(var78)));
        }
        return (SubLObject)module0347.NIL;
    }
    
    public static SubLObject f23352(final SubLObject var21) {
        if (module0347.NIL == module0202.f12689(var21, (SubLObject)module0347.UNPROVIDED)) {
            return (SubLObject)module0347.NIL;
        }
        return f23353(var21);
    }
    
    public static SubLObject f23353(final SubLObject var21) {
        if (module0347.NIL != module0206.f13487(var21)) {
            return (SubLObject)module0347.T;
        }
        if (module0347.NIL != module0202.f12595(var21)) {
            SubLObject var23;
            final SubLObject var22 = var23 = module0205.f13207(var21, (SubLObject)module0347.$ic34$);
            SubLObject var24 = (SubLObject)module0347.NIL;
            var24 = var23.first();
            while (module0347.NIL != var23) {
                if (module0347.NIL == module0206.f13487(var24)) {
                    return (SubLObject)module0347.NIL;
                }
                var23 = var23.rest();
                var24 = var23.first();
            }
            return (SubLObject)module0347.T;
        }
        return (SubLObject)module0347.NIL;
    }
    
    public static SubLObject f23354(final SubLObject var95, SubLObject var23, SubLObject var25) {
        if (var23 == module0347.UNPROVIDED) {
            var23 = (SubLObject)module0347.NIL;
        }
        if (var25 == module0347.UNPROVIDED) {
            var25 = (SubLObject)module0347.NIL;
        }
        assert module0347.NIL != f23352(var95) : var95;
        if (module0347.NIL == var23) {
            var23 = module0132.$g1568$.getGlobalValue();
        }
        if (module0347.NIL != module0202.f12595(var95)) {
            SubLObject var96 = (SubLObject)module0347.NIL;
            final SubLObject var97 = module0205.f13207(var95, (SubLObject)module0347.$ic34$);
            SubLObject var98;
            SubLObject var99;
            for (var98 = (SubLObject)module0347.NIL, var98 = var97; module0347.NIL == var96 && module0347.NIL != var98; var98 = var98.rest()) {
                var99 = var98.first();
                if (module0347.NIL == f23355(var99, var23, var25)) {
                    var96 = (SubLObject)module0347.T;
                }
            }
            return (SubLObject)SubLObjectFactory.makeBoolean(module0347.NIL == var96);
        }
        return module0035.sublisp_boolean(f23355(var95, var23, var25));
    }
    
    public static SubLObject f23355(final SubLObject var98, final SubLObject var23, final SubLObject var25) {
        assert module0347.NIL != module0206.f13487(var98) : var98;
        final SubLObject var99 = (SubLObject)((module0347.NIL != module0202.f12592(var98)) ? module0347.$ic37$ : module0347.$ic7$);
        final SubLObject var100 = module0202.f12826(var98);
        return f23334(var100, var23, var99, var25);
    }
    
    public static SubLObject f23356(final SubLObject var99, SubLObject var23) {
        if (var23 == module0347.UNPROVIDED) {
            var23 = (SubLObject)module0347.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0347.NIL != f23357(var99, var23) && module0347.NIL != f23358(var99, var23));
    }
    
    public static SubLObject f23358(final SubLObject var99, SubLObject var23) {
        if (var23 == module0347.UNPROVIDED) {
            var23 = (SubLObject)module0347.NIL;
        }
        final SubLThread var100 = SubLProcess.currentSubLThread();
        final SubLObject var101 = module0347.$g2979$.getDynamicValue(var100);
        if (var101.eql((SubLObject)module0347.$ic43$)) {
            return (SubLObject)module0347.T;
        }
        if (var101.eql((SubLObject)module0347.$ic42$)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0347.NIL != f23359(var99, var23) && module0347.NIL != f23360(var99, var23) && module0347.NIL != f23361(var99, var23) && module0347.NIL != f23362(var99, var23));
        }
        if (var101.eql((SubLObject)module0347.$ic44$)) {
            return f23363(var99, var23, (SubLObject)module0347.NIL);
        }
        if (var101.eql((SubLObject)module0347.$ic45$)) {
            return f23363(var99, var23, (SubLObject)module0347.T);
        }
        return Errors.error((SubLObject)module0347.$ic46$, module0347.$g2979$.getDynamicValue(var100));
    }
    
    public static SubLObject f23363(final SubLObject var99, final SubLObject var23, final SubLObject var100) {
        final SubLObject var101 = module0232.f15308(var99);
        SubLObject var102 = (SubLObject)module0347.NIL;
        if (module0347.NIL == var102) {
            SubLObject var103 = var101;
            SubLObject var104 = (SubLObject)module0347.NIL;
            var104 = var103.first();
            while (module0347.NIL == var102 && module0347.NIL != var103) {
                if (module0347.NIL != module0193.f12105(var104)) {
                    final SubLObject var105 = module0204.f13035(var104);
                    final SubLObject var106 = (SubLObject)module0347.$ic47$;
                    if (module0347.NIL != var100) {
                        var102 = (SubLObject)SubLObjectFactory.makeBoolean(module0347.NIL == module0528.f32961(var105, module0232.f15315(), var23, var106));
                    }
                    else {
                        var102 = (SubLObject)SubLObjectFactory.makeBoolean(module0347.NIL == module0528.f32964(var105, var23, (SubLObject)module0347.NIL, var106));
                    }
                }
                var103 = var103.rest();
                var104 = var103.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0347.NIL == var102);
    }
    
    public static SubLObject f23359(final SubLObject var99, SubLObject var23) {
        if (var23 == module0347.UNPROVIDED) {
            var23 = (SubLObject)module0347.NIL;
        }
        final SubLThread var100 = SubLProcess.currentSubLThread();
        SubLObject var101 = (SubLObject)module0347.NIL;
        if (module0347.NIL != module0347.$g2980$.getDynamicValue(var100)) {
            final SubLObject var102 = module0232.f15308(var99);
            if (module0347.NIL != Sequences.find(module0347.$ic48$, var102, Symbols.symbol_function((SubLObject)module0347.EQL), Symbols.symbol_function((SubLObject)module0347.$ic49$), (SubLObject)module0347.UNPROVIDED, (SubLObject)module0347.UNPROVIDED)) {
                final SubLObject var103 = var23;
                final SubLObject var104 = module0147.$g2095$.currentBinding(var100);
                final SubLObject var105 = module0147.$g2094$.currentBinding(var100);
                final SubLObject var106 = module0147.$g2096$.currentBinding(var100);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var103), var100);
                    module0147.$g2094$.bind(module0147.f9546(var103), var100);
                    module0147.$g2096$.bind(module0147.f9549(var103), var100);
                    if (module0347.NIL == var101) {
                        SubLObject var107 = var102;
                        SubLObject var108 = (SubLObject)module0347.NIL;
                        var108 = var107.first();
                        while (module0347.NIL == var101 && module0347.NIL != var107) {
                            if (module0347.$ic48$.eql(module0205.f13333(var108)) && module0347.NIL != f23364(var108)) {
                                var101 = (SubLObject)module0347.T;
                            }
                            var107 = var107.rest();
                            var108 = var107.first();
                        }
                    }
                }
                finally {
                    module0147.$g2096$.rebind(var106, var100);
                    module0147.$g2094$.rebind(var105, var100);
                    module0147.$g2095$.rebind(var104, var100);
                }
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0347.NIL == var101);
    }
    
    public static SubLObject f23360(final SubLObject var99, SubLObject var23) {
        if (var23 == module0347.UNPROVIDED) {
            var23 = (SubLObject)module0347.NIL;
        }
        final SubLThread var100 = SubLProcess.currentSubLThread();
        SubLObject var101 = (SubLObject)module0347.NIL;
        final SubLObject var102 = module0232.f15308(var99);
        final SubLObject var103 = var23;
        final SubLObject var104 = module0147.$g2095$.currentBinding(var100);
        final SubLObject var105 = module0147.$g2094$.currentBinding(var100);
        final SubLObject var106 = module0147.$g2096$.currentBinding(var100);
        try {
            module0147.$g2095$.bind(module0147.f9545(var103), var100);
            module0147.$g2094$.bind(module0147.f9546(var103), var100);
            module0147.$g2096$.bind(module0147.f9549(var103), var100);
            if (module0347.NIL == var101) {
                SubLObject var107 = var102;
                SubLObject var108 = (SubLObject)module0347.NIL;
                var108 = var107.first();
                while (module0347.NIL == var101 && module0347.NIL != var107) {
                    final SubLObject var109 = module0205.f13333(var108);
                    if (module0347.NIL != module0173.f10955(var109) && module0347.NIL != module0226.f14843(var109, (SubLObject)module0347.UNPROVIDED) && module0347.NIL != f23365(var108)) {
                        var101 = (SubLObject)module0347.T;
                    }
                    var107 = var107.rest();
                    var108 = var107.first();
                }
            }
        }
        finally {
            module0147.$g2096$.rebind(var106, var100);
            module0147.$g2094$.rebind(var105, var100);
            module0147.$g2095$.rebind(var104, var100);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0347.NIL == var101);
    }
    
    public static SubLObject f23364(final SubLObject var22) {
        final SubLObject var23 = module0205.f13387(var22, (SubLObject)module0347.UNPROVIDED);
        return f23365(var23);
    }
    
    public static SubLObject f23366(final SubLObject var107) {
        if (module0347.NIL != module0193.f12067(var107.first())) {
            return (SubLObject)module0347.NIL;
        }
        SubLObject var109;
        final SubLObject var108 = var109 = module0205.f13207(var107, (SubLObject)module0347.$ic34$);
        SubLObject var110 = (SubLObject)module0347.NIL;
        var110 = var109.first();
        while (module0347.NIL != var109) {
            if (module0347.NIL == module0193.f12067(var110)) {
                return (SubLObject)module0347.NIL;
            }
            var109 = var109.rest();
            var110 = var109.first();
        }
        return (SubLObject)module0347.T;
    }
    
    public static SubLObject f23365(final SubLObject var107) {
        if (module0347.NIL != module0202.f12590(var107)) {
            if (module0347.NIL != f23367(var107)) {
                return (SubLObject)module0347.T;
            }
            if (module0347.NIL != f23368(var107)) {
                return (SubLObject)module0347.T;
            }
        }
        return (SubLObject)module0347.NIL;
    }
    
    public static SubLObject f23367(final SubLObject var107) {
        final SubLObject var108 = module0205.f13333(var107);
        if (module0347.NIL != module0173.f10955(var108) && module0347.NIL != module0269.f17706(var108) && module0347.NIL != module0222.f14636(var108)) {
            final SubLObject var109 = module0222.f14650(var108);
            final SubLObject var110 = module0205.f13134(var107, var109, (SubLObject)module0347.UNPROVIDED);
            if (module0347.NIL != module0173.f10955(var110) && module0347.NIL == module0222.f14635(var108, var110, var109, (SubLObject)module0347.UNPROVIDED)) {
                return (SubLObject)module0347.T;
            }
        }
        return (SubLObject)module0347.NIL;
    }
    
    public static SubLObject f23368(final SubLObject var107) {
        return Types.sublisp_null(module0217.f14437(var107, module0528.$g2982$.getGlobalValue()));
    }
    
    public static SubLObject f23361(final SubLObject var99, SubLObject var23) {
        if (var23 == module0347.UNPROVIDED) {
            var23 = (SubLObject)module0347.NIL;
        }
        final SubLObject var100 = module0232.f15308(var99);
        if (module0347.NIL != Sequences.find(module0347.$ic51$, var100, Symbols.symbol_function((SubLObject)module0347.EQL), Symbols.symbol_function((SubLObject)module0347.$ic49$), (SubLObject)module0347.UNPROVIDED, (SubLObject)module0347.UNPROVIDED)) {
            SubLObject var101 = var100;
            SubLObject var102 = (SubLObject)module0347.NIL;
            var102 = var101.first();
            while (module0347.NIL != var101) {
                if (module0347.$ic51$.eql(module0205.f13333(var102))) {
                    final SubLObject var103 = module0205.f13387(var102, (SubLObject)module0347.UNPROVIDED);
                    final SubLObject var104 = module0205.f13388(var102, (SubLObject)module0347.UNPROVIDED);
                    if (module0347.NIL != module0173.f10955(var103) && module0347.NIL != module0173.f10955(var104) && module0347.NIL == module0305.f20441(var103, var104, var23, (SubLObject)module0347.UNPROVIDED)) {
                        return (SubLObject)module0347.NIL;
                    }
                }
                var101 = var101.rest();
                var102 = var101.first();
            }
        }
        return (SubLObject)module0347.T;
    }
    
    public static SubLObject f23362(final SubLObject var99, SubLObject var23) {
        if (var23 == module0347.UNPROVIDED) {
            var23 = (SubLObject)module0347.NIL;
        }
        final SubLObject var100 = module0232.f15308(var99);
        if (module0347.NIL != Sequences.find(module0347.$ic52$, var100, Symbols.symbol_function((SubLObject)module0347.EQL), Symbols.symbol_function((SubLObject)module0347.$ic49$), (SubLObject)module0347.UNPROVIDED, (SubLObject)module0347.UNPROVIDED)) {
            SubLObject var101 = var100;
            SubLObject var102 = (SubLObject)module0347.NIL;
            var102 = var101.first();
            while (module0347.NIL != var101) {
                if (module0347.$ic52$.eql(module0205.f13333(var102))) {
                    final SubLObject var103 = module0205.f13387(var102, (SubLObject)module0347.UNPROVIDED);
                    final SubLObject var104 = module0205.f13388(var102, (SubLObject)module0347.UNPROVIDED);
                    if (module0347.NIL != module0173.f10955(var103) && module0347.NIL != module0173.f10955(var104) && module0347.NIL == module0256.f16596(var103, var104, var23, (SubLObject)module0347.UNPROVIDED)) {
                        return (SubLObject)module0347.NIL;
                    }
                }
                var101 = var101.rest();
                var102 = var101.first();
            }
        }
        return (SubLObject)module0347.T;
    }
    
    public static SubLObject f23357(final SubLObject var99, SubLObject var23) {
        if (var23 == module0347.UNPROVIDED) {
            var23 = (SubLObject)module0347.NIL;
        }
        return f23369(var99);
    }
    
    public static SubLObject f23369(final SubLObject var99) {
        SubLObject var100 = module0232.f15308(var99);
        SubLObject var101 = (SubLObject)module0347.NIL;
        var101 = var100.first();
        while (module0347.NIL != var100) {
            if (module0347.NIL != module0205.f13332(var101, module0347.$ic53$) && module0347.NIL == f23370(var101)) {
                return (SubLObject)module0347.NIL;
            }
            var100 = var100.rest();
            var101 = var100.first();
        }
        return (SubLObject)module0347.T;
    }
    
    public static SubLObject f23371(final SubLObject var21) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0347.NIL != module0193.f12067(var21) || module0347.NIL != module0206.f13453(var21));
    }
    
    public static SubLObject f23372(final SubLObject var21) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0347.NIL != module0193.f12067(var21) || module0347.NIL != module0172.f10917(var21));
    }
    
    public static SubLObject f23373(final SubLObject var112, final SubLObject var113) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0347.NIL != f23371(var112) && module0347.NIL != f23372(var113));
    }
    
    public static SubLObject f23374(final SubLObject var112, final SubLObject var113) {
        if (module0347.NIL != module0202.f12658(var112) && module0347.NIL != module0202.f12658(var113)) {
            final SubLObject var114 = module0205.f13276(var112);
            final SubLObject var115 = module0205.f13276(var113);
            if (module0347.NIL != module0173.f10955(var114) && module0347.NIL != module0173.f10955(var115) && !var114.eql(var115)) {
                return (SubLObject)module0347.NIL;
            }
        }
        return (SubLObject)module0347.T;
    }
    
    public static SubLObject f23370(final SubLObject var116) {
        if (module0347.NIL != module0202.f12734(var116, (SubLObject)module0347.TWO_INTEGER, (SubLObject)module0347.UNPROVIDED)) {
            final SubLObject var117 = module0205.f13387(var116, (SubLObject)module0347.UNPROVIDED);
            final SubLObject var118 = module0205.f13388(var116, (SubLObject)module0347.UNPROVIDED);
            return (SubLObject)SubLObjectFactory.makeBoolean(module0347.NIL != f23373(var117, var118) && module0347.NIL != f23374(var117, var118));
        }
        return (SubLObject)module0347.NIL;
    }
    
    public static SubLObject f23375(final SubLObject var117) {
        return conses_high.assoc(var117, module0347.$g2983$.getGlobalValue(), (SubLObject)module0347.UNPROVIDED, (SubLObject)module0347.UNPROVIDED).rest();
    }
    
    public static SubLObject f23376(final SubLObject var118, final SubLObject var119) {
        return module0035.f2131(var119, var118);
    }
    
    public static SubLObject f23377() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0347", "f23324", "S#26004", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0347", "f23325", "S#26005", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0347", "f23326", "S#26006", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0347", "f23327", "S#26007", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0347", "f23328", "S#26008", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0347", "f23329", "S#26009", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0347", "f23330", "S#26010", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0347", "f23331", "S#26011", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0347", "f23333", "S#26012", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0347", "f23334", "REMOVAL-ASK", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0347", "f23336", "S#26013", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0347", "f23337", "S#26014", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0347", "f23338", "S#26015", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0347", "f23339", "S#26016", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0347", "f23340", "S#26017", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0347", "f23341", "S#26018", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0347", "f23342", "S#26019", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0347", "f23343", "S#26020", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0347", "f23344", "S#22415", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0347", "f23345", "S#26021", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0347", "f23346", "S#26022", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0347", "f23332", "S#26023", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0347", "f23335", "S#26024", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0347", "f23348", "S#26025", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0347", "f23349", "S#26026", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0347", "f23351", "S#26027", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0347", "f23347", "S#26028", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0347", "f23350", "S#26029", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0347", "f23352", "S#22564", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0347", "f23353", "S#26030", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0347", "f23354", "S#22565", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0347", "f23355", "S#26031", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0347", "f23356", "S#26032", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0347", "f23358", "S#26033", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0347", "f23363", "S#26034", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0347", "f23359", "S#26035", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0347", "f23360", "S#26036", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0347", "f23364", "S#26037", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0347", "f23366", "S#26038", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0347", "f23365", "S#26039", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0347", "f23367", "S#26040", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0347", "f23368", "S#26041", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0347", "f23361", "S#26042", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0347", "f23362", "S#26043", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0347", "f23357", "S#26044", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0347", "f23369", "S#26045", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0347", "f23371", "S#26046", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0347", "f23372", "S#26047", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0347", "f23373", "S#26048", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0347", "f23374", "S#26049", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0347", "f23370", "S#26050", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0347", "f23375", "S#26051", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0347", "f23376", "S#26052", 2, 0, false);
        return (SubLObject)module0347.NIL;
    }
    
    public static SubLObject f23378() {
        module0347.$g2965$ = SubLFiles.defparameter("S#26053", (SubLObject)module0347.NIL);
        module0347.$g2966$ = SubLFiles.defparameter("S#26054", (SubLObject)module0347.NIL);
        module0347.$g2967$ = SubLFiles.defparameter("S#26055", (SubLObject)module0347.EIGHT_INTEGER);
        module0347.$g2968$ = SubLFiles.defparameter("S#26056", (SubLObject)module0347.NIL);
        module0347.$g2969$ = SubLFiles.defparameter("S#26057", (SubLObject)module0347.NIL);
        module0347.$g2970$ = SubLFiles.defparameter("S#26058", (SubLObject)module0347.NIL);
        module0347.$g2971$ = SubLFiles.deflexical("S#26059", (SubLObject)module0347.$ic5$);
        module0347.$g2972$ = SubLFiles.defparameter("S#26060", (SubLObject)module0347.NIL);
        module0347.$g2973$ = SubLFiles.defparameter("S#26061", (SubLObject)module0347.NIL);
        module0347.$g2974$ = SubLFiles.defparameter("S#26062", (SubLObject)module0347.NIL);
        module0347.$g2975$ = SubLFiles.defparameter("S#26063", (SubLObject)module0347.NIL);
        module0347.$g2976$ = SubLFiles.defparameter("S#26064", (SubLObject)module0347.NIL);
        module0347.$g2977$ = SubLFiles.defparameter("S#26065", (SubLObject)module0347.NIL);
        module0347.$g2978$ = SubLFiles.defparameter("S#26066", (SubLObject)module0347.NIL);
        module0347.$g2979$ = SubLFiles.defvar("S#26067", (SubLObject)module0347.$ic42$);
        module0347.$g2980$ = SubLFiles.defvar("S#26068", (SubLObject)module0347.T);
        module0347.$g2981$ = SubLFiles.defconstant("S#26069", (SubLObject)module0347.$ic50$);
        module0347.$g2983$ = SubLFiles.deflexical("S#26070", (SubLObject)module0347.$ic54$);
        return (SubLObject)module0347.NIL;
    }
    
    public static SubLObject f23379() {
        module0002.f38((SubLObject)module0347.$ic6$);
        module0012.f423((SubLObject)module0347.$ic38$, (SubLObject)module0347.$ic39$, (SubLObject)module0347.$ic40$, (SubLObject)module0347.$ic41$);
        return (SubLObject)module0347.NIL;
    }
    
    public void declareFunctions() {
        f23377();
    }
    
    public void initializeVariables() {
        f23378();
    }
    
    public void runTopLevelForms() {
        f23379();
    }
    
    static {
        me = (SubLFile)new module0347();
        module0347.$g2965$ = null;
        module0347.$g2966$ = null;
        module0347.$g2967$ = null;
        module0347.$g2968$ = null;
        module0347.$g2969$ = null;
        module0347.$g2970$ = null;
        module0347.$g2971$ = null;
        module0347.$g2972$ = null;
        module0347.$g2973$ = null;
        module0347.$g2974$ = null;
        module0347.$g2975$ = null;
        module0347.$g2976$ = null;
        module0347.$g2977$ = null;
        module0347.$g2978$ = null;
        module0347.$g2979$ = null;
        module0347.$g2980$ = null;
        module0347.$g2981$ = null;
        module0347.$g2983$ = null;
        $ic0$ = SubLObjectFactory.makeString("The legacy harness is no longer supported.");
        $ic1$ = SubLObjectFactory.makeKeyword("POS");
        $ic2$ = SubLObjectFactory.makeSymbol("S#25994", "CYC");
        $ic3$ = SubLObjectFactory.makeSymbol("S#25995", "CYC");
        $ic4$ = SubLObjectFactory.makeSymbol("S#26023", "CYC");
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)SubLObjectFactory.makeKeyword("ALLOWED-MODULES"), (SubLObject)SubLObjectFactory.makeKeyword("METRICS"), (SubLObject)SubLObjectFactory.makeKeyword("ALLOW-ABNORMALITY-CHECKING?"), (SubLObject)SubLObjectFactory.makeKeyword("ALLOW-INDETERMINATE-RESULTS?"));
        $ic6$ = SubLObjectFactory.makeSymbol("REMOVAL-ASK");
        $ic7$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic8$ = SubLObjectFactory.makeSymbol("S#15527", "CYC");
        $ic9$ = SubLObjectFactory.makeSymbol("S#748", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#26012", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("FIRST");
        $ic12$ = SubLObjectFactory.makeSymbol("SECOND");
        $ic13$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#14510", "CYC"));
        $ic14$ = SubLObjectFactory.makeKeyword("MAX-NUMBER");
        $ic15$ = SubLObjectFactory.makeKeyword("ALLOWED-MODULES");
        $ic16$ = SubLObjectFactory.makeKeyword("ALL");
        $ic17$ = SubLObjectFactory.makeKeyword("EXHAUST-TOTAL");
        $ic18$ = SubLObjectFactory.makeSymbol("<");
        $ic19$ = SubLObjectFactory.makeKeyword("METRICS");
        $ic20$ = SubLObjectFactory.makeKeyword("ALLOW-INDETERMINATE-RESULTS?");
        $ic21$ = SubLObjectFactory.makeKeyword("REMOVAL-ASK-DONE");
        $ic22$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14781", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#26071", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25691", "CYC"));
        $ic23$ = SubLObjectFactory.makeKeyword("ANSWER-COUNT");
        $ic24$ = SubLObjectFactory.makeKeyword("TIME-TO-FIRST-ANSWER");
        $ic25$ = SubLObjectFactory.makeKeyword("TIME-TO-LAST-ANSWER");
        $ic26$ = SubLObjectFactory.makeKeyword("TOTAL-TIME");
        $ic27$ = SubLObjectFactory.makeKeyword("TIME-PER-ANSWER");
        $ic28$ = SubLObjectFactory.makeKeyword("LATENCY-IMPROVEMENT-FROM-ITERATIVITY");
        $ic29$ = SubLObjectFactory.makeKeyword("COMPLETE-USER-TIME");
        $ic30$ = SubLObjectFactory.makeKeyword("COMPLETE-SYSTEM-TIME");
        $ic31$ = SubLObjectFactory.makeKeyword("COMPLETE-TOTAL-TIME");
        $ic32$ = SubLObjectFactory.makeString("removal-ask cannot handle metric ~s, using NIL instead");
        $ic33$ = SubLObjectFactory.makeKeyword("REMOVAL");
        $ic34$ = SubLObjectFactory.makeKeyword("IGNORE");
        $ic35$ = SubLObjectFactory.makeSymbol("S#22564", "CYC");
        $ic36$ = SubLObjectFactory.makeSymbol("S#15916", "CYC");
        $ic37$ = SubLObjectFactory.makeKeyword("FALSE");
        $ic38$ = SubLObjectFactory.makeSymbol("S#26066", "CYC");
        $ic39$ = SubLObjectFactory.makeString("Semantic pruning of results of backchaining");
        $ic40$ = SubLObjectFactory.makeString("This controls whether or not the intermediate results of backchaining\nare examined to see if they are provably unsatisfiable.  If so, these\nresults are pruned from the search.  This test takes time, but usually\nprovides substantial pruning of the search tree when backchaining.");
        $ic41$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)module0347.T, (SubLObject)SubLObjectFactory.makeString("Yes")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)module0347.NIL, (SubLObject)SubLObjectFactory.makeString("No")));
        $ic42$ = SubLObjectFactory.makeKeyword("LEGACY");
        $ic43$ = SubLObjectFactory.makeKeyword("NONE");
        $ic44$ = SubLObjectFactory.makeKeyword("TRIVIAL");
        $ic45$ = SubLObjectFactory.makeKeyword("INFERENCE");
        $ic46$ = SubLObjectFactory.makeString("Unexpected pruning mode : ~S");
        $ic47$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)module0347.ONE_INTEGER);
        $ic48$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("assertedSentence"));
        $ic49$ = SubLObjectFactory.makeSymbol("ATOMIC-SENTENCE-PREDICATE");
        $ic50$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls")));
        $ic51$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic52$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls"));
        $ic53$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("termOfUnit"));
        $ic54$ = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("NO-POS"), (SubLObject)SubLObjectFactory.makeKeyword("POS")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("NO-NEG"), (SubLObject)SubLObjectFactory.makeKeyword("NEG")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("YES-POS"), (SubLObject)SubLObjectFactory.makeKeyword("POS")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("YES-NEG"), (SubLObject)SubLObjectFactory.makeKeyword("NEG")));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0347.class
	Total time: 388 ms
	
	Decompiled with Procyon 0.5.32.
*/