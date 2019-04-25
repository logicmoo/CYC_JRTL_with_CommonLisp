package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0278 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0278";
    public static final String myFingerPrint = "5494697d7f55c937658f3080458c27bd9738b5bdc21dc167fc64117ab7d8cf49";
    private static SubLSymbol $g2603$;
    private static SubLSymbol $g2604$;
    private static SubLSymbol $g2605$;
    private static final SubLInteger $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLObject $ic12$;
    private static final SubLObject $ic13$;
    private static final SubLString $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    
    public static SubLObject f18388(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0278.UNPROVIDED) {
            var2 = (SubLObject)module0278.NIL;
        }
        if (var3 == module0278.UNPROVIDED) {
            var3 = (SubLObject)module0278.NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)module0278.NIL;
        final SubLObject var6 = var2;
        final SubLObject var7 = module0147.$g2094$.currentBinding(var4);
        final SubLObject var8 = module0147.$g2095$.currentBinding(var4);
        try {
            module0147.$g2094$.bind(module0147.f9531(var6), var4);
            module0147.$g2095$.bind(module0147.f9534(var6), var4);
            var5 = f18389(var1, module0147.$g2095$.getDynamicValue(var4));
        }
        finally {
            module0147.$g2095$.rebind(var8, var4);
            module0147.$g2094$.rebind(var7, var4);
        }
        return var5;
    }
    
    public static SubLObject f18389(final SubLObject var9, final SubLObject var2) {
        return f18390(conses_high.copy_tree(var9), module0161.f10519(var2));
    }
    
    public static SubLObject f18390(final SubLObject var9, final SubLObject var2) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        SubLObject var11 = (SubLObject)module0278.NIL;
        SubLObject var12 = (SubLObject)module0278.NIL;
        final SubLObject var13 = module0146.$g2031$.currentBinding(var10);
        final SubLObject var14 = module0146.$g2003$.currentBinding(var10);
        try {
            module0146.$g2031$.bind(Hashtables.make_hash_table((SubLObject)module0278.FOUR_INTEGER, Symbols.symbol_function((SubLObject)module0278.EQL), (SubLObject)module0278.UNPROVIDED), var10);
            module0146.$g2003$.bind((SubLObject)module0278.NIL, var10);
            var10.resetMultipleValues();
            final SubLObject var12_13 = f18391(var9, var2, module0278.$g2603$.getDynamicValue(var10), (SubLObject)module0278.ZERO_INTEGER);
            final SubLObject var14_15 = var10.secondMultipleValue();
            var10.resetMultipleValues();
            var11 = var12_13;
            var12 = var14_15;
        }
        finally {
            module0146.$g2003$.rebind(var14, var10);
            module0146.$g2031$.rebind(var13, var10);
        }
        return Values.values(var11, var12);
    }
    
    public static SubLObject f18392(final SubLObject var9, final SubLObject var2) {
        return f18393(conses_high.copy_tree(var9), module0161.f10519(var2));
    }
    
    public static SubLObject f18393(final SubLObject var9, final SubLObject var2) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        SubLObject var11 = var9;
        SubLObject var12 = var2;
        final SubLObject var13 = module0146.$g2031$.currentBinding(var10);
        final SubLObject var14 = module0146.$g2003$.currentBinding(var10);
        try {
            module0146.$g2031$.bind(Hashtables.make_hash_table((SubLObject)module0278.FOUR_INTEGER, Symbols.symbol_function((SubLObject)module0278.EQL), (SubLObject)module0278.UNPROVIDED), var10);
            module0146.$g2003$.bind((SubLObject)module0278.NIL, var10);
            if (module0278.NIL != module0202.f12590(var9) && module0278.NIL != f18394(var9)) {
                var10.resetMultipleValues();
                final SubLObject var16_17 = f18395(var9, var2);
                final SubLObject var18_19 = var10.secondMultipleValue();
                var10.resetMultipleValues();
                var11 = var16_17;
                var12 = var18_19;
            }
        }
        finally {
            module0146.$g2003$.rebind(var14, var10);
            module0146.$g2031$.rebind(var13, var10);
        }
        return Values.values(var11, var12);
    }
    
    public static SubLObject f18396(final SubLObject var9, final SubLObject var2) {
        return f18397(var9, var2, (SubLObject)module0278.$ic1$);
    }
    
    public static SubLObject f18398(final SubLObject var9, final SubLObject var2) {
        return f18397(var9, var2, (SubLObject)module0278.$ic2$);
    }
    
    public static SubLObject f18397(final SubLObject var9, SubLObject var2, final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var22 = (SubLObject)module0278.NIL;
        SubLObject var23 = (SubLObject)module0278.NIL;
        final SubLObject var24 = module0146.$g2031$.currentBinding(var21);
        final SubLObject var25 = module0146.$g2003$.currentBinding(var21);
        try {
            module0146.$g2031$.bind(Hashtables.make_hash_table((SubLObject)module0278.FOUR_INTEGER, Symbols.symbol_function((SubLObject)module0278.EQL), (SubLObject)module0278.UNPROVIDED), var21);
            module0146.$g2003$.bind((SubLObject)module0278.NIL, var21);
            try {
                var21.throwStack.push(module0278.$ic3$);
                final SubLObject var26 = module0147.f9540(var2);
                final SubLObject var7_23 = module0147.$g2095$.currentBinding(var21);
                final SubLObject var8_24 = module0147.$g2094$.currentBinding(var21);
                final SubLObject var27 = module0147.$g2096$.currentBinding(var21);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var26), var21);
                    module0147.$g2094$.bind(module0147.f9546(var26), var21);
                    module0147.$g2096$.bind(module0147.f9549(var26), var21);
                    var21.resetMultipleValues();
                    final SubLObject var26_27 = module0205.f13243(var9, var2, var20, (SubLObject)module0278.$ic4$, (SubLObject)module0278.NIL, module0278.$g2603$.getDynamicValue(var21));
                    final SubLObject var28_29 = var21.secondMultipleValue();
                    var21.resetMultipleValues();
                    var23 = var26_27;
                    var2 = var28_29;
                }
                finally {
                    module0147.$g2096$.rebind(var27, var21);
                    module0147.$g2094$.rebind(var8_24, var21);
                    module0147.$g2095$.rebind(var7_23, var21);
                }
            }
            catch (Throwable var28) {
                var22 = Errors.handleThrowable(var28, (SubLObject)module0278.$ic3$);
            }
            finally {
                var21.throwStack.pop();
            }
        }
        finally {
            module0146.$g2003$.rebind(var25, var21);
            module0146.$g2031$.rebind(var24, var21);
        }
        if (module0278.NIL != var22) {
            return (SubLObject)module0278.$ic5$;
        }
        return Values.values(var23, var2);
    }
    
    public static SubLObject f18399(final SubLObject var9, SubLObject var2) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        SubLObject var11 = (SubLObject)module0278.NIL;
        SubLObject var12 = (SubLObject)module0278.NIL;
        final SubLObject var13 = module0146.$g2031$.currentBinding(var10);
        final SubLObject var14 = module0146.$g2003$.currentBinding(var10);
        try {
            module0146.$g2031$.bind(Hashtables.make_hash_table((SubLObject)module0278.FOUR_INTEGER, Symbols.symbol_function((SubLObject)module0278.EQL), (SubLObject)module0278.UNPROVIDED), var10);
            module0146.$g2003$.bind((SubLObject)module0278.NIL, var10);
            try {
                var10.throwStack.push(module0278.$ic3$);
                final SubLObject var15 = module0147.f9540(var2);
                final SubLObject var7_31 = module0147.$g2095$.currentBinding(var10);
                final SubLObject var8_32 = module0147.$g2094$.currentBinding(var10);
                final SubLObject var16 = module0147.$g2096$.currentBinding(var10);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var15), var10);
                    module0147.$g2094$.bind(module0147.f9546(var15), var10);
                    module0147.$g2096$.bind(module0147.f9549(var15), var10);
                    var10.resetMultipleValues();
                    final SubLObject var33_34 = module0205.f13244(var9, (SubLObject)module0278.$ic1$, (SubLObject)module0278.$ic4$, (SubLObject)module0278.NIL, module0278.$g2603$.getDynamicValue(var10), (SubLObject)module0278.UNPROVIDED);
                    final SubLObject var35_36 = var10.secondMultipleValue();
                    var10.resetMultipleValues();
                    var12 = var33_34;
                    var2 = var35_36;
                }
                finally {
                    module0147.$g2096$.rebind(var16, var10);
                    module0147.$g2094$.rebind(var8_32, var10);
                    module0147.$g2095$.rebind(var7_31, var10);
                }
            }
            catch (Throwable var17) {
                var11 = Errors.handleThrowable(var17, (SubLObject)module0278.$ic3$);
            }
            finally {
                var10.throwStack.pop();
            }
        }
        finally {
            module0146.$g2003$.rebind(var14, var10);
            module0146.$g2031$.rebind(var13, var10);
        }
        if (module0278.NIL != var11) {
            return (SubLObject)module0278.$ic5$;
        }
        return Values.values(var12, var2);
    }
    
    public static SubLObject f18400(final SubLObject var37, SubLObject var2) {
        if (var2 == module0278.UNPROVIDED) {
            var2 = (SubLObject)module0278.NIL;
        }
        final SubLThread var38 = SubLProcess.currentSubLThread();
        SubLObject var39 = (SubLObject)module0278.NIL;
        final SubLObject var40 = var2;
        final SubLObject var41 = module0147.$g2094$.currentBinding(var38);
        final SubLObject var42 = module0147.$g2095$.currentBinding(var38);
        try {
            module0147.$g2094$.bind(module0147.f9531(var40), var38);
            module0147.$g2095$.bind(module0147.f9534(var40), var38);
            var39 = (SubLObject)SubLObjectFactory.makeBoolean(module0278.NIL != module0202.f12590(var37) && module0278.NIL != module0205.f13215((SubLObject)module0278.$ic6$, var37, (SubLObject)module0278.NIL, (SubLObject)module0278.UNPROVIDED));
        }
        finally {
            module0147.$g2095$.rebind(var42, var38);
            module0147.$g2094$.rebind(var41, var38);
        }
        return var39;
    }
    
    public static SubLObject f18401() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return module0278.$g2604$.getDynamicValue(var4);
    }
    
    public static SubLObject f18402(final SubLObject var39) {
        if (module0278.NIL != f18401()) {
            f18403(var39);
        }
        return var39;
    }
    
    public static SubLObject f18403(final SubLObject var39) {
        final SubLThread var40 = SubLProcess.currentSubLThread();
        module0278.$g2605$.setDynamicValue((SubLObject)ConsesLow.cons(var39, module0278.$g2605$.getDynamicValue(var40)), var40);
        return var39;
    }
    
    public static SubLObject f18404() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return module0035.f2269(Sequences.nreverse(conses_high.copy_list(module0278.$g2605$.getDynamicValue(var4))), (SubLObject)module0278.UNPROVIDED, (SubLObject)module0278.UNPROVIDED, (SubLObject)module0278.UNPROVIDED, (SubLObject)module0278.UNPROVIDED, (SubLObject)module0278.UNPROVIDED);
    }
    
    public static SubLObject f18405(final SubLObject var40, final SubLObject var41) {
        final SubLObject var42 = var40.rest();
        final SubLObject var44;
        final SubLObject var43 = var44 = var42;
        return (SubLObject)ConsesLow.listS((SubLObject)module0278.$ic7$, (SubLObject)module0278.$ic8$, ConsesLow.append(var44, (SubLObject)module0278.NIL));
    }
    
    public static SubLObject f18406(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0278.UNPROVIDED) {
            var2 = (SubLObject)module0278.NIL;
        }
        if (var3 == module0278.UNPROVIDED) {
            var3 = (SubLObject)module0278.NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)module0278.NIL;
        SubLObject var6 = (SubLObject)module0278.NIL;
        final SubLObject var7 = module0278.$g2604$.currentBinding(var4);
        final SubLObject var8 = module0278.$g2605$.currentBinding(var4);
        try {
            module0278.$g2604$.bind((SubLObject)module0278.T, var4);
            module0278.$g2605$.bind((SubLObject)module0278.NIL, var4);
            var5 = f18388(var1, var2, var3);
            var6 = f18404();
        }
        finally {
            module0278.$g2605$.rebind(var8, var4);
            module0278.$g2604$.rebind(var7, var4);
        }
        return Values.values(var5, var6);
    }
    
    public static SubLObject f18407(final SubLObject var9, SubLObject var2) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        SubLObject var11 = (SubLObject)module0278.NIL;
        SubLObject var12 = (SubLObject)module0278.NIL;
        final SubLObject var13 = module0278.$g2604$.currentBinding(var10);
        final SubLObject var14 = module0278.$g2605$.currentBinding(var10);
        try {
            module0278.$g2604$.bind((SubLObject)module0278.T, var10);
            module0278.$g2605$.bind((SubLObject)module0278.NIL, var10);
            var10.resetMultipleValues();
            final SubLObject var46_47 = f18389(var9, var2);
            final SubLObject var48_49 = var10.secondMultipleValue();
            var10.resetMultipleValues();
            var11 = var46_47;
            var2 = var48_49;
            var12 = f18404();
        }
        finally {
            module0278.$g2605$.rebind(var14, var10);
            module0278.$g2604$.rebind(var13, var10);
        }
        return Values.values(var11, var2, var12);
    }
    
    public static SubLObject f18408(final SubLObject var9, SubLObject var2) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        SubLObject var11 = (SubLObject)module0278.NIL;
        SubLObject var12 = (SubLObject)module0278.NIL;
        final SubLObject var13 = module0278.$g2604$.currentBinding(var10);
        final SubLObject var14 = module0278.$g2605$.currentBinding(var10);
        try {
            module0278.$g2604$.bind((SubLObject)module0278.T, var10);
            module0278.$g2605$.bind((SubLObject)module0278.NIL, var10);
            var10.resetMultipleValues();
            final SubLObject var50_51 = f18390(var9, var2);
            final SubLObject var52_53 = var10.secondMultipleValue();
            var10.resetMultipleValues();
            var11 = var50_51;
            var2 = var52_53;
            var12 = f18404();
        }
        finally {
            module0278.$g2605$.rebind(var14, var10);
            module0278.$g2604$.rebind(var13, var10);
        }
        return Values.values(var11, var2, var12);
    }
    
    public static SubLObject f18409(final SubLObject var9, SubLObject var2) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        SubLObject var11 = (SubLObject)module0278.NIL;
        SubLObject var12 = (SubLObject)module0278.NIL;
        final SubLObject var13 = module0278.$g2604$.currentBinding(var10);
        final SubLObject var14 = module0278.$g2605$.currentBinding(var10);
        try {
            module0278.$g2604$.bind((SubLObject)module0278.T, var10);
            module0278.$g2605$.bind((SubLObject)module0278.NIL, var10);
            var10.resetMultipleValues();
            final SubLObject var54_55 = f18392(var9, module0147.$g2095$.getDynamicValue(var10));
            final SubLObject var56_57 = var10.secondMultipleValue();
            var10.resetMultipleValues();
            var11 = var54_55;
            var2 = var56_57;
            var12 = f18404();
        }
        finally {
            module0278.$g2605$.rebind(var14, var10);
            module0278.$g2604$.rebind(var13, var10);
        }
        return Values.values(var11, var2, var12);
    }
    
    public static SubLObject f18410(final SubLObject var9, SubLObject var2) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        SubLObject var11 = (SubLObject)module0278.NIL;
        SubLObject var12 = (SubLObject)module0278.NIL;
        final SubLObject var13 = module0278.$g2604$.currentBinding(var10);
        final SubLObject var14 = module0278.$g2605$.currentBinding(var10);
        try {
            module0278.$g2604$.bind((SubLObject)module0278.T, var10);
            module0278.$g2605$.bind((SubLObject)module0278.NIL, var10);
            var10.resetMultipleValues();
            final SubLObject var58_59 = f18393(var9, module0147.$g2095$.getDynamicValue(var10));
            final SubLObject var60_61 = var10.secondMultipleValue();
            var10.resetMultipleValues();
            var11 = var58_59;
            var2 = var60_61;
            var12 = f18404();
        }
        finally {
            module0278.$g2605$.rebind(var14, var10);
            module0278.$g2604$.rebind(var13, var10);
        }
        return Values.values(var11, var2, var12);
    }
    
    public static SubLObject f18411(final SubLObject var9, SubLObject var2) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        SubLObject var11 = (SubLObject)module0278.NIL;
        SubLObject var12 = (SubLObject)module0278.NIL;
        final SubLObject var13 = module0278.$g2604$.currentBinding(var10);
        final SubLObject var14 = module0278.$g2605$.currentBinding(var10);
        try {
            module0278.$g2604$.bind((SubLObject)module0278.T, var10);
            module0278.$g2605$.bind((SubLObject)module0278.NIL, var10);
            var10.resetMultipleValues();
            final SubLObject var62_63 = f18396(var9, module0147.$g2095$.getDynamicValue(var10));
            final SubLObject var64_65 = var10.secondMultipleValue();
            var10.resetMultipleValues();
            var11 = var62_63;
            var2 = var64_65;
            var12 = f18404();
        }
        finally {
            module0278.$g2605$.rebind(var14, var10);
            module0278.$g2604$.rebind(var13, var10);
        }
        return Values.values(var11, var2, var12);
    }
    
    public static SubLObject f18412(final SubLObject var9, SubLObject var2) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        SubLObject var11 = (SubLObject)module0278.NIL;
        SubLObject var12 = (SubLObject)module0278.NIL;
        final SubLObject var13 = module0278.$g2604$.currentBinding(var10);
        final SubLObject var14 = module0278.$g2605$.currentBinding(var10);
        try {
            module0278.$g2604$.bind((SubLObject)module0278.T, var10);
            module0278.$g2605$.bind((SubLObject)module0278.NIL, var10);
            var10.resetMultipleValues();
            final SubLObject var66_67 = f18398(var9, module0147.$g2095$.getDynamicValue(var10));
            final SubLObject var68_69 = var10.secondMultipleValue();
            var10.resetMultipleValues();
            var11 = var66_67;
            var2 = var68_69;
            var12 = f18404();
        }
        finally {
            module0278.$g2605$.rebind(var14, var10);
            module0278.$g2604$.rebind(var13, var10);
        }
        return Values.values(var11, var2, var12);
    }
    
    public static SubLObject f18413(final SubLObject var9, SubLObject var2) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        SubLObject var11 = (SubLObject)module0278.NIL;
        SubLObject var12 = (SubLObject)module0278.NIL;
        final SubLObject var13 = module0278.$g2604$.currentBinding(var10);
        final SubLObject var14 = module0278.$g2605$.currentBinding(var10);
        try {
            module0278.$g2604$.bind((SubLObject)module0278.T, var10);
            module0278.$g2605$.bind((SubLObject)module0278.NIL, var10);
            var10.resetMultipleValues();
            final SubLObject var70_71 = f18399(var9, module0147.$g2095$.getDynamicValue(var10));
            final SubLObject var72_73 = var10.secondMultipleValue();
            var10.resetMultipleValues();
            var11 = var70_71;
            var2 = var72_73;
            var12 = f18404();
        }
        finally {
            module0278.$g2605$.rebind(var14, var10);
            module0278.$g2604$.rebind(var13, var10);
        }
        return Values.values(var11, var2, var12);
    }
    
    public static SubLObject f18414(final SubLObject var9, final SubLObject var2, SubLObject var74, SubLObject var75) {
        if (var74 == module0278.UNPROVIDED) {
            var74 = module0278.$g2603$.getDynamicValue();
        }
        if (var75 == module0278.UNPROVIDED) {
            var75 = (SubLObject)module0278.ZERO_INTEGER;
        }
        final SubLThread var76 = SubLProcess.currentSubLThread();
        if (var75.numG(var74)) {
            Dynamic.sublisp_throw((SubLObject)module0278.$ic5$, (SubLObject)ConsesLow.list((SubLObject)module0278.$ic5$, var75, var74));
        }
        if (module0278.NIL == module0202.f12590(var9)) {
            return Values.values(var9, var2);
        }
        if (module0278.NIL != f18415(var9)) {
            var76.resetMultipleValues();
            final SubLObject var77 = f18395(var9, var2);
            final SubLObject var78 = var76.secondMultipleValue();
            var76.resetMultipleValues();
            if (var9.equal(var77) && var2.equal(var78)) {
                return Values.values(var9, var2);
            }
            return f18414(var77, var78, var74, Numbers.add((SubLObject)module0278.ONE_INTEGER, var75));
        }
        else if (module0278.NIL != module0202.f12903(var9)) {
            final SubLObject var79 = module0202.f12887(var9);
            final SubLObject var80 = module0202.f12906(var9);
            if (module0278.NIL != module0161.f10485(var80)) {
                var76.resetMultipleValues();
                final SubLObject var81 = f18414(var79, var80, (SubLObject)module0278.UNPROVIDED, (SubLObject)module0278.UNPROVIDED);
                final SubLObject var82 = var76.secondMultipleValue();
                var76.resetMultipleValues();
                return Values.values(var81, var82);
            }
            return Values.values(var9, var2);
        }
        else {
            if (module0278.NIL != module0205.f13215(Symbols.symbol_function((SubLObject)module0278.$ic9$), var9, (SubLObject)module0278.NIL, (SubLObject)module0278.UNPROVIDED)) {
                SubLObject var83 = (SubLObject)module0278.NIL;
                SubLObject var84 = (SubLObject)module0278.NIL;
                final SubLObject var85 = module0205.f13180(var9, (SubLObject)module0278.$ic10$);
                SubLObject var86 = (SubLObject)module0278.NIL;
                SubLObject var87 = (SubLObject)module0278.NIL;
                SubLObject var88 = (SubLObject)module0278.NIL;
                var86 = var85;
                var87 = var86.first();
                for (var88 = (SubLObject)module0278.ZERO_INTEGER; module0278.NIL != var86; var86 = var86.rest(), var87 = var86.first(), var88 = module0048.f_1X(var88)) {
                    SubLObject var89 = var87;
                    SubLObject var90 = (SubLObject)module0278.NIL;
                    final SubLObject var91 = module0205.f13136(var9);
                    if (module0278.NIL == module0279.f18485(var91, var88, var2) && module0278.NIL == module0206.f13472(var87)) {
                        var76.resetMultipleValues();
                        final SubLObject var88_89 = f18414(var87, var2, var74, Numbers.add((SubLObject)module0278.ONE_INTEGER, var75));
                        final SubLObject var90_91 = var76.secondMultipleValue();
                        var76.resetMultipleValues();
                        var89 = var88_89;
                        var90 = var90_91;
                    }
                    if (module0278.NIL != var90 && module0278.NIL == module0161.f10513(var2, var90)) {
                        var83 = (SubLObject)ConsesLow.cons(module0202.f12782(var90, var89), var83);
                    }
                    else {
                        var83 = (SubLObject)ConsesLow.cons(var89, var83);
                    }
                }
                var83 = Sequences.nreverse(var83);
                var84 = module0202.f12720(var83.first(), var83.rest(), module0202.f12707(var9, (SubLObject)module0278.UNPROVIDED));
                return Values.values(var84, var2);
            }
            return Values.values(var9, var2);
        }
    }
    
    public static SubLObject f18416(final SubLObject var37, SubLObject var2) {
        if (var2 == module0278.UNPROVIDED) {
            var2 = (SubLObject)module0278.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0278.NIL != module0202.f12590(var37) && module0278.NIL != module0269.f17769(module0205.f13132(var37), var2));
    }
    
    public static SubLObject f18417(final SubLObject var9) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0278.NIL != module0202.f12590(var9) && module0278.NIL != f18418(module0205.f13132(var9)));
    }
    
    public static SubLObject f18394(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        if (module0278.NIL == f18417(var9)) {
            return (SubLObject)module0278.NIL;
        }
        if (module0278.NIL != f18419(var9) || module0278.NIL != f18420(var9)) {
            return (SubLObject)module0278.T;
        }
        if (module0278.NIL != module0146.$g1986$.getDynamicValue(var10) || module0278.NIL != module0152.$g2101$.getDynamicValue(var10)) {
            Dynamic.sublisp_throw((SubLObject)module0278.$ic11$, (SubLObject)ConsesLow.list((SubLObject)module0278.$ic11$, var9, module0205.f13136(var9), module0220.f14557(module0205.f13136(var9), module0278.$ic12$, (SubLObject)module0278.UNPROVIDED, (SubLObject)module0278.UNPROVIDED, (SubLObject)module0278.UNPROVIDED, (SubLObject)module0278.UNPROVIDED)));
        }
        return (SubLObject)module0278.NIL;
    }
    
    public static SubLObject f18421(final SubLObject var9) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0278.NIL != f18394(var9) && module0278.NIL != module0229.f15238(var9));
    }
    
    public static SubLObject f18418(final SubLObject var37) {
        final SubLObject var38 = module0205.f13328(var37);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0278.NIL != module0173.f10955(var38) && module0278.NIL != f18422(var38));
    }
    
    public static SubLObject f18423(final SubLObject var37) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0278.NIL != module0202.f12590(var37) && module0278.NIL != module0269.f17768(module0205.f13132(var37)) && module0278.NIL != f18417(var37));
    }
    
    public static SubLObject f18424(final SubLObject var37) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0278.NIL != module0202.f12590(var37) && module0278.NIL != f18417(var37));
    }
    
    public static SubLObject f18415(final SubLObject var37) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0278.NIL != module0202.f12590(var37) && module0278.NIL != module0269.f17768(module0205.f13132(var37)) && module0278.NIL != f18394(var37));
    }
    
    public static SubLObject f18422(final SubLObject var37) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0278.NIL != module0220.f14557(var37, module0278.$ic12$, (SubLObject)module0278.UNPROVIDED, (SubLObject)module0278.UNPROVIDED, (SubLObject)module0278.UNPROVIDED, (SubLObject)module0278.UNPROVIDED) || module0278.NIL != module0220.f14557(var37, module0278.$ic13$, (SubLObject)module0278.UNPROVIDED, (SubLObject)module0278.UNPROVIDED, (SubLObject)module0278.UNPROVIDED, (SubLObject)module0278.UNPROVIDED));
    }
    
    public static SubLObject f18395(final SubLObject var95, SubLObject var2) {
        final SubLThread var96 = SubLProcess.currentSubLThread();
        if (module0278.NIL == module0161.f10481(var2)) {
            return Values.values(var95, var2);
        }
        final SubLObject var97 = module0205.f13328(module0205.f13132(var95));
        SubLObject var98 = (SubLObject)module0278.NIL;
        SubLObject var99 = (SubLObject)module0278.NIL;
        SubLObject var100 = (SubLObject)module0278.NIL;
        final SubLObject var101 = module0147.f9540(var2);
        final SubLObject var102 = module0147.$g2095$.currentBinding(var96);
        final SubLObject var103 = module0147.$g2094$.currentBinding(var96);
        final SubLObject var104 = module0147.$g2096$.currentBinding(var96);
        try {
            module0147.$g2095$.bind(module0147.f9545(var101), var96);
            module0147.$g2094$.bind(module0147.f9546(var101), var96);
            module0147.$g2096$.bind(module0147.f9549(var101), var96);
            final SubLObject var105 = module0220.f14550(var97, module0278.$ic12$, (SubLObject)module0278.UNPROVIDED, (SubLObject)module0278.UNPROVIDED);
            if (module0278.NIL != var105) {
                final SubLObject var106 = module0202.f12763(module0178.f11335(var105));
                var98 = f18425(var106, var95);
                f18402(var105);
            }
            else {
                final SubLObject var107 = module0220.f14550(var97, module0278.$ic13$, (SubLObject)module0278.UNPROVIDED, (SubLObject)module0278.UNPROVIDED);
                if (module0278.NIL != var107) {
                    final SubLObject var108 = module0202.f12757(module0178.f11335(var107));
                    if (module0278.NIL != module0305.f20359(var108, (SubLObject)module0278.UNPROVIDED)) {
                        var99 = var108;
                        f18402(var107);
                    }
                }
            }
            if (module0278.NIL != var98) {
                SubLObject var109 = (SubLObject)module0278.NIL;
                SubLObject var110 = (SubLObject)module0278.ZERO_INTEGER;
                SubLObject var112;
                final SubLObject var111 = var112 = module0205.f13207(var95, (SubLObject)module0278.$ic10$);
                SubLObject var113 = (SubLObject)module0278.NIL;
                var113 = var112.first();
                while (module0278.NIL != var112) {
                    var110 = Numbers.add(var110, (SubLObject)module0278.ONE_INTEGER);
                    final SubLObject var114 = module0303.f20123(var110);
                    var109 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var114, var113), var109);
                    var112 = var112.rest();
                    var113 = var112.first();
                }
                var98 = (var100 = conses_high.sublis(var109, var98, (SubLObject)module0278.UNPROVIDED, (SubLObject)module0278.UNPROVIDED));
            }
            else if (module0278.NIL != var99) {
                var96.resetMultipleValues();
                final SubLObject var108_109 = Functions.funcall(var99, var95);
                final SubLObject var110_111 = var96.secondMultipleValue();
                var96.resetMultipleValues();
                var100 = var108_109;
                var2 = var110_111;
            }
            else {
                var100 = var95;
            }
        }
        finally {
            module0147.$g2096$.rebind(var104, var96);
            module0147.$g2094$.rebind(var103, var96);
            module0147.$g2095$.rebind(var102, var96);
        }
        return Values.values(var100, var2);
    }
    
    public static SubLObject f18426(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        return f18395(var9, module0147.$g2095$.getDynamicValue(var10));
    }
    
    public static SubLObject f18391(final SubLObject var9, final SubLObject var2, final SubLObject var74, final SubLObject var75) {
        final SubLThread var76 = SubLProcess.currentSubLThread();
        if (var75.numG(var74)) {
            module0202.f12747((SubLObject)module0278.TWO_INTEGER, (SubLObject)module0278.$ic14$, var74, var9, (SubLObject)module0278.UNPROVIDED);
            return (SubLObject)module0278.NIL;
        }
        if (module0278.NIL != module0202.f12590(var9) && module0278.NIL != f18394(var9)) {
            var76.resetMultipleValues();
            final SubLObject var77 = f18395(var9, var2);
            final SubLObject var78 = var76.secondMultipleValue();
            var76.resetMultipleValues();
            return f18391(var77, var78, var74, Numbers.add((SubLObject)module0278.ONE_INTEGER, var75));
        }
        return Values.values(var9, var2);
    }
    
    public static SubLObject f18419(final SubLObject var95) {
        final SubLObject var96 = module0220.f14557(module0205.f13328(module0205.f13136(var95)), module0278.$ic12$, (SubLObject)module0278.UNPROVIDED, (SubLObject)module0278.UNPROVIDED, (SubLObject)module0278.UNPROVIDED, (SubLObject)module0278.UNPROVIDED);
        final SubLObject var97 = (SubLObject)(var96.isCons() ? module0035.f2399(module0036.f2532(module0036.f2531(var96, Symbols.symbol_function((SubLObject)module0278.$ic15$), Symbols.symbol_function((SubLObject)module0278.$ic16$), (SubLObject)module0278.UNPROVIDED), Symbols.symbol_function((SubLObject)module0278.$ic17$), Symbols.symbol_function((SubLObject)module0278.$ic18$), (SubLObject)module0278.UNPROVIDED, (SubLObject)module0278.UNPROVIDED, (SubLObject)module0278.UNPROVIDED), Symbols.symbol_function((SubLObject)module0278.$ic15$), (SubLObject)module0278.UNPROVIDED, (SubLObject)module0278.UNPROVIDED, (SubLObject)module0278.UNPROVIDED) : module0278.NIL);
        if (var97.isCons()) {
            return module0202.f12732(var95, Functions.apply(Symbols.symbol_function((SubLObject)module0278.$ic19$), var97), (SubLObject)module0278.UNPROVIDED);
        }
        return module0202.f12734(var95, (SubLObject)module0278.ZERO_INTEGER, (SubLObject)module0278.UNPROVIDED);
    }
    
    public static SubLObject f18420(final SubLObject var95) {
        final SubLObject var96 = module0202.f12757(module0220.f14557(module0205.f13136(var95), module0278.$ic13$, (SubLObject)module0278.UNPROVIDED, (SubLObject)module0278.UNPROVIDED, (SubLObject)module0278.UNPROVIDED, (SubLObject)module0278.UNPROVIDED));
        return module0305.f20359(var96, (SubLObject)module0278.UNPROVIDED);
    }
    
    public static SubLObject f18427(final SubLObject var113, final SubLObject var9) {
        return (module0278.NIL != module0035.f2428(var113, var9, (SubLObject)module0278.UNPROVIDED, (SubLObject)module0278.UNPROVIDED)) ? module0282.f18697(var113) : var113;
    }
    
    public static SubLObject f18425(final SubLObject var114, final SubLObject var115) {
        return f18428(var114, var115, (SubLObject)module0278.NIL);
    }
    
    public static SubLObject f18429(final SubLObject var114, final SubLObject var115) {
        return f18428(var114, var115, (SubLObject)module0278.T);
    }
    
    public static SubLObject f18428(final SubLObject var114, final SubLObject var115, final SubLObject var116) {
        if (module0278.NIL == module0202.f12590(var114)) {
            return var114;
        }
        final SubLObject var117 = module0205.f13188(var114, Symbols.symbol_function((SubLObject)module0278.$ic20$), (SubLObject)module0278.NIL, (SubLObject)module0278.UNPROVIDED, (SubLObject)module0278.UNPROVIDED, (SubLObject)module0278.UNPROVIDED);
        final SubLObject var118 = (SubLObject)((module0278.NIL != var117) ? module0205.f13188(var115, Symbols.symbol_function((SubLObject)module0278.$ic20$), (SubLObject)module0278.NIL, (SubLObject)module0278.UNPROVIDED, (SubLObject)module0278.UNPROVIDED, (SubLObject)module0278.UNPROVIDED) : module0278.NIL);
        final SubLObject var119 = (SubLObject)((module0278.NIL != var117 && module0278.NIL != var118) ? conses_high.nintersection(var117, var118, (SubLObject)module0278.UNPROVIDED, (SubLObject)module0278.UNPROVIDED) : module0278.NIL);
        if (module0278.NIL != var119) {
            SubLObject var120 = (SubLObject)module0278.NIL;
            SubLObject var121 = var119;
            SubLObject var122 = (SubLObject)module0278.NIL;
            var122 = var121.first();
            while (module0278.NIL != var121) {
                var120 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var122, module0282.f18697(var122)), var120);
                var121 = var121.rest();
                var122 = var121.first();
            }
            return (module0278.NIL != var116) ? conses_high.nsublis(var120, var114, (SubLObject)module0278.UNPROVIDED, (SubLObject)module0278.UNPROVIDED) : conses_high.sublis(var120, var114, (SubLObject)module0278.UNPROVIDED, (SubLObject)module0278.UNPROVIDED);
        }
        return var114;
    }
    
    public static SubLObject f18430(final SubLObject var37, SubLObject var2) {
        if (var2 == module0278.UNPROVIDED) {
            var2 = (SubLObject)module0278.NIL;
        }
        final SubLThread var38 = SubLProcess.currentSubLThread();
        SubLObject var39 = (SubLObject)module0278.NIL;
        final SubLObject var40 = var2;
        final SubLObject var41 = module0147.$g2094$.currentBinding(var38);
        final SubLObject var42 = module0147.$g2095$.currentBinding(var38);
        try {
            module0147.$g2094$.bind(module0147.f9531(var40), var38);
            module0147.$g2095$.bind(module0147.f9534(var40), var38);
            if (module0278.NIL != module0210.f13598(var37)) {
                final SubLObject var43 = module0205.f13365(var37);
                var39 = f18431(var43);
            }
        }
        finally {
            module0147.$g2095$.rebind(var42, var38);
            module0147.$g2094$.rebind(var41, var38);
        }
        return var39;
    }
    
    public static SubLObject f18431(final SubLObject var87) {
        final SubLThread var88 = SubLProcess.currentSubLThread();
        if (module0278.NIL != module0173.f10955(var87)) {
            SubLObject var89 = (SubLObject)module0278.NIL;
            final SubLObject var90 = module0018.$g586$.currentBinding(var88);
            final SubLObject var91 = module0018.$g584$.currentBinding(var88);
            try {
                module0018.$g586$.bind(var87, var88);
                module0018.$g584$.bind((SubLObject)module0278.NIL, var88);
                module0219.f14502((SubLObject)module0278.$ic21$, var87, (SubLObject)module0278.$ic22$, (SubLObject)module0278.T);
                var89 = module0018.$g584$.getDynamicValue(var88);
            }
            finally {
                module0018.$g584$.rebind(var91, var88);
                module0018.$g586$.rebind(var90, var88);
            }
            return var89;
        }
        if (module0278.NIL != module0210.f13598(var87)) {
            return f18431(module0172.f10921(var87));
        }
        return (SubLObject)module0278.NIL;
    }
    
    public static SubLObject f18432(final SubLObject var123) {
        final SubLThread var124 = SubLProcess.currentSubLThread();
        if (module0278.NIL != module0178.f11284(var123) && module0278.$ic12$.eql(module0178.f11333(var123)) && module0018.$g586$.getDynamicValue(var124).eql(module0205.f13132(module0178.f11335(var123)))) {
            module0018.$g584$.setDynamicValue((SubLObject)module0278.T, var124);
            module0012.f425();
        }
        return (SubLObject)module0278.NIL;
    }
    
    public static SubLObject f18433() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0278", "f18388", "S#20998", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0278", "f18389", "S#20639", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0278", "f18390", "S#20999", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0278", "f18392", "S#21000", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0278", "f18393", "S#21001", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0278", "f18396", "EL-EXPAND-ALL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0278", "f18398", "S#17990", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0278", "f18397", "S#21002", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0278", "f18399", "S#21003", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0278", "f18400", "S#20646", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0278", "f18401", "S#21004", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0278", "f18402", "S#21005", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0278", "f18403", "S#21006", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0278", "f18404", "S#21007", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0278", "f18405", "S#21008");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0278", "f18406", "S#21009", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0278", "f18407", "S#21010", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0278", "f18408", "S#21011", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0278", "f18409", "S#21012", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0278", "f18410", "S#21013", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0278", "f18411", "S#21014", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0278", "f18412", "S#17986", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0278", "f18413", "S#21015", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0278", "f18414", "S#21016", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0278", "f18416", "S#20996", 1, 1, false);
        new $f18416$UnaryFunction();
        new $f18416$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0278", "f18417", "S#21017", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0278", "f18394", "S#21018", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0278", "f18421", "S#21019", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0278", "f18418", "S#21020", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0278", "f18423", "S#21021", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0278", "f18424", "S#21022", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0278", "f18415", "S#21023", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0278", "f18422", "S#21024", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0278", "f18395", "S#21025", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0278", "f18426", "S#21026", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0278", "f18391", "S#21027", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0278", "f18419", "S#21028", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0278", "f18420", "S#21029", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0278", "f18427", "S#21030", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0278", "f18425", "S#21031", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0278", "f18429", "S#21032", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0278", "f18428", "S#21033", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0278", "f18430", "S#21034", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0278", "f18431", "S#21035", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0278", "f18432", "S#21036", 1, 0, false);
        return (SubLObject)module0278.NIL;
    }
    
    public static SubLObject f18434() {
        module0278.$g2603$ = SubLFiles.defparameter("S#21037", (SubLObject)module0278.$ic0$);
        module0278.$g2604$ = SubLFiles.defparameter("S#21038", (SubLObject)module0278.NIL);
        module0278.$g2605$ = SubLFiles.defparameter("S#21039", (SubLObject)module0278.NIL);
        return (SubLObject)module0278.NIL;
    }
    
    public static SubLObject f18435() {
        return (SubLObject)module0278.NIL;
    }
    
    public void declareFunctions() {
        f18433();
    }
    
    public void initializeVariables() {
        f18434();
    }
    
    public void runTopLevelForms() {
        f18435();
    }
    
    static {
        me = (SubLFile)new module0278();
        module0278.$g2603$ = null;
        module0278.$g2604$ = null;
        module0278.$g2605$ = null;
        $ic0$ = SubLObjectFactory.makeInteger(212);
        $ic1$ = SubLObjectFactory.makeSymbol("S#21018", "CYC");
        $ic2$ = SubLObjectFactory.makeSymbol("S#21019", "CYC");
        $ic3$ = SubLObjectFactory.makeKeyword("TRANSFORMATION-LIMIT-EXCEEDED");
        $ic4$ = SubLObjectFactory.makeSymbol("S#21026", "CYC");
        $ic5$ = SubLObjectFactory.makeKeyword("RECURSION-LIMIT-EXCEEDED");
        $ic6$ = SubLObjectFactory.makeSymbol("S#21022", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("CLET");
        $ic8$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#21038", "CYC"), (SubLObject)module0278.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#21039", "CYC"), (SubLObject)module0278.NIL));
        $ic9$ = SubLObjectFactory.makeSymbol("S#20996", "CYC");
        $ic10$ = SubLObjectFactory.makeKeyword("IGNORE");
        $ic11$ = SubLObjectFactory.makeKeyword("INVALID-EXPANSION");
        $ic12$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("expansion"));
        $ic13$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("expansionDefn"));
        $ic14$ = SubLObjectFactory.makeString("Trying to expand a recursive EL relation, hit the recursion limit ~D while expanding ~A~%");
        $ic15$ = SubLObjectFactory.makeSymbol("INTEGERP");
        $ic16$ = SubLObjectFactory.makeSymbol("NULL");
        $ic17$ = SubLObjectFactory.makeSymbol("S#15431", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#20632", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("MAX");
        $ic20$ = SubLObjectFactory.makeSymbol("EL-VAR?");
        $ic21$ = SubLObjectFactory.makeSymbol("S#21036", "CYC");
        $ic22$ = SubLObjectFactory.makeKeyword("TRUE");
    }
    
    public static final class $f18416$UnaryFunction extends UnaryFunction
    {
        public $f18416$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#20996"));
        }
        
        public SubLObject processItem(final SubLObject var92) {
            return module0278.f18416(var92, (SubLObject)$f18416$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f18416$BinaryFunction extends BinaryFunction
    {
        public $f18416$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#20996"));
        }
        
        public SubLObject processItem(final SubLObject var92, final SubLObject var93) {
            return module0278.f18416(var92, var93);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0278.class
	Total time: 279 ms
	
	Decompiled with Procyon 0.5.32.
*/