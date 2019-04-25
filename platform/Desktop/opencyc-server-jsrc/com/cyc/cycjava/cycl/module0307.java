package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0307 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0307";
    public static final String myFingerPrint = "8ef5f79954f9fe98654828aeb543a50677cc81599666c6fd0b7f8557649299bf";
    private static SubLSymbol $g2785$;
    private static SubLSymbol $g2786$;
    private static SubLSymbol $g2787$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLInteger $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLObject $ic12$;
    private static final SubLObject $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLObject $ic17$;
    private static final SubLObject $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLObject $ic21$;
    private static final SubLObject $ic22$;
    private static final SubLObject $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLList $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLList $ic33$;
    private static final SubLList $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLObject $ic36$;
    private static final SubLObject $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLObject $ic39$;
    private static final SubLObject $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLObject $ic42$;
    private static final SubLObject $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLObject $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLString $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLList $ic64$;
    private static final SubLString $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLObject $ic70$;
    
    public static SubLObject f20733(final SubLObject var1, final SubLObject var2) {
        return f20734(module0202.f12643((SubLObject)module0307.$ic0$, var1), var2);
    }
    
    public static SubLObject f20734(final SubLObject var3, final SubLObject var2) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        var4.resetMultipleValues();
        final SubLObject var5 = f20735(var3, var2, (SubLObject)module0307.T, (SubLObject)module0307.T);
        final SubLObject var6 = var4.secondMultipleValue();
        var4.resetMultipleValues();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0307.NIL != var5 && module0307.NIL != f20736(var5, var6, (SubLObject)module0307.$ic1$));
    }
    
    public static SubLObject f20737(final SubLObject var3, final SubLObject var2) {
        return f20738(var3, var2, (SubLObject)module0307.NIL, (SubLObject)module0307.NIL);
    }
    
    public static SubLObject f20738(final SubLObject var3, final SubLObject var2, final SubLObject var7, final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        var9.resetMultipleValues();
        final SubLObject var10 = f20735(var3, var2, var7, var8);
        final SubLObject var11 = var9.secondMultipleValue();
        var9.resetMultipleValues();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0307.NIL != var10 && module0307.NIL != f20739(var10, var11, (SubLObject)module0307.$ic1$));
    }
    
    public static SubLObject f20736(final SubLObject var5, final SubLObject var2, SubLObject var9) {
        if (var9 == module0307.UNPROVIDED) {
            var9 = (SubLObject)module0307.$ic2$;
        }
        final SubLThread var10 = SubLProcess.currentSubLThread();
        SubLObject var11 = (SubLObject)module0307.NIL;
        final SubLObject var12 = module0152.f9728();
        if (module0307.NIL != module0152.$g2133$.getDynamicValue(var10) && module0307.NIL != module0202.f12865(var12) && module0307.NIL != module0258.f16777(module0205.f13203(var12, (SubLObject)module0307.UNPROVIDED), module0205.f13204(var12, (SubLObject)module0307.UNPROVIDED), (SubLObject)module0307.UNPROVIDED)) {
            final SubLObject var13 = module0258.$g2489$.currentBinding(var10);
            try {
                module0258.$g2489$.bind((SubLObject)module0307.T, var10);
                var11 = f20740(var5, var2, var9);
            }
            finally {
                module0258.$g2489$.rebind(var13, var10);
            }
        }
        else {
            var11 = f20740(var5, var2, var9);
        }
        return var11;
    }
    
    public static SubLObject f20740(final SubLObject var5, final SubLObject var2, SubLObject var9) {
        if (var9 == module0307.UNPROVIDED) {
            var9 = (SubLObject)module0307.$ic2$;
        }
        SubLObject var10 = (SubLObject)module0307.T;
        SubLObject var11 = (SubLObject)module0307.NIL;
        SubLObject var12 = (SubLObject)module0307.NIL;
        if (module0307.NIL == var12) {
            SubLObject var13 = var5;
            SubLObject var14 = (SubLObject)module0307.NIL;
            var14 = var13.first();
            while (module0307.NIL == var12 && module0307.NIL != var13) {
                if (module0307.NIL != module0035.f2439((SubLObject)module0307.$ic3$, var14, (SubLObject)module0307.UNPROVIDED)) {
                    var11 = (SubLObject)ConsesLow.cons(var14, var11);
                }
                else {
                    var10 = (SubLObject)SubLObjectFactory.makeBoolean(module0307.NIL != f20741(var14, var2, var9) && module0307.NIL != var10);
                    var12 = module0303.f20199((SubLObject)SubLObjectFactory.makeBoolean(module0307.NIL == var10));
                }
                var13 = var13.rest();
                var14 = var13.first();
            }
        }
        if (module0307.NIL == var12 && module0307.NIL == var12) {
            SubLObject var13 = module0035.f2399(var11, (SubLObject)module0307.$ic3$, (SubLObject)module0307.EQUAL, (SubLObject)module0307.IDENTITY, (SubLObject)module0307.NIL);
            SubLObject var15 = (SubLObject)module0307.NIL;
            var15 = var13.first();
            while (module0307.NIL == var12 && module0307.NIL != var13) {
                SubLObject var16 = (SubLObject)module0307.NIL;
                SubLObject var17 = var11;
                SubLObject var18 = (SubLObject)module0307.NIL;
                var18 = var17.first();
                while (module0307.NIL != var17) {
                    if (module0307.NIL != module0035.f2428(var15, var18, (SubLObject)module0307.EQUAL, (SubLObject)module0307.UNPROVIDED)) {
                        var16 = (SubLObject)ConsesLow.cons(var18, var16);
                    }
                    var17 = var17.rest();
                    var18 = var17.first();
                }
                if (module0307.NIL == var12) {
                    SubLObject var15_20 = module0204.f13064(var16, (SubLObject)module0307.UNPROVIDED);
                    SubLObject var19 = (SubLObject)module0307.NIL;
                    var19 = var15_20.first();
                    while (module0307.NIL == var12 && module0307.NIL != var15_20) {
                        var10 = (SubLObject)SubLObjectFactory.makeBoolean(module0307.NIL != f20742(var19, var2, var9) && module0307.NIL != var10);
                        var12 = module0303.f20199((SubLObject)SubLObjectFactory.makeBoolean(module0307.NIL == var10));
                        var15_20 = var15_20.rest();
                        var19 = var15_20.first();
                    }
                }
                var13 = var13.rest();
                var15 = var13.first();
            }
        }
        return var10;
    }
    
    public static SubLObject f20743(final SubLObject var22, SubLObject var2, final SubLObject var8) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        SubLObject var24 = (SubLObject)module0307.NIL;
        final SubLObject var25 = var2;
        final SubLObject var26 = module0147.$g2094$.currentBinding(var23);
        final SubLObject var27 = module0147.$g2095$.currentBinding(var23);
        final SubLObject var28 = module0146.$g2055$.currentBinding(var23);
        final SubLObject var29 = module0146.$g2013$.currentBinding(var23);
        final SubLObject var30 = module0146.$g2027$.currentBinding(var23);
        final SubLObject var31 = module0146.$g2028$.currentBinding(var23);
        try {
            module0147.$g2094$.bind(module0147.f9531(var25), var23);
            module0147.$g2095$.bind(module0147.f9534(var25), var23);
            module0146.$g2055$.bind((SubLObject)module0307.NIL, var23);
            module0146.$g2013$.bind((SubLObject)module0307.NIL, var23);
            module0146.$g2027$.bind((SubLObject)module0307.NIL, var23);
            module0146.$g2028$.bind((SubLObject)module0307.NIL, var23);
            SubLObject var32 = (SubLObject)module0307.NIL;
            if (module0307.NIL != var8) {
                try {
                    var23.throwStack.push(module0307.$ic4$);
                    final SubLObject var11_31 = module0146.$g2031$.currentBinding(var23);
                    final SubLObject var25_32 = module0146.$g2003$.currentBinding(var23);
                    try {
                        module0146.$g2031$.bind(Hashtables.make_hash_table((SubLObject)module0307.FOUR_INTEGER, Symbols.symbol_function((SubLObject)module0307.EQL), (SubLObject)module0307.UNPROVIDED), var23);
                        module0146.$g2003$.bind((SubLObject)module0307.NIL, var23);
                        var23.resetMultipleValues();
                        final SubLObject var33_34 = f20744(var22, var2);
                        final SubLObject var35_36 = var23.secondMultipleValue();
                        var23.resetMultipleValues();
                        var24 = var33_34;
                        var2 = var35_36;
                    }
                    finally {
                        module0146.$g2003$.rebind(var25_32, var23);
                        module0146.$g2031$.rebind(var11_31, var23);
                    }
                }
                catch (Throwable var33) {
                    var32 = Errors.handleThrowable(var33, (SubLObject)module0307.$ic4$);
                }
                finally {
                    var23.throwStack.pop();
                }
            }
            else {
                final SubLObject var11_32 = module0146.$g2031$.currentBinding(var23);
                final SubLObject var25_33 = module0146.$g2003$.currentBinding(var23);
                try {
                    module0146.$g2031$.bind(Hashtables.make_hash_table((SubLObject)module0307.FOUR_INTEGER, Symbols.symbol_function((SubLObject)module0307.EQL), (SubLObject)module0307.UNPROVIDED), var23);
                    module0146.$g2003$.bind((SubLObject)module0307.NIL, var23);
                    var23.resetMultipleValues();
                    final SubLObject var40_41 = f20744(var22, var2);
                    final SubLObject var42_43 = var23.secondMultipleValue();
                    var23.resetMultipleValues();
                    var24 = var40_41;
                    var2 = var42_43;
                }
                finally {
                    module0146.$g2003$.rebind(var25_33, var23);
                    module0146.$g2031$.rebind(var11_32, var23);
                }
            }
            if (module0307.NIL != var32) {
                module0303.f20203((SubLObject)ConsesLow.list((SubLObject)module0307.$ic4$, var22));
                var24 = (SubLObject)module0307.NIL;
            }
        }
        finally {
            module0146.$g2028$.rebind(var31, var23);
            module0146.$g2027$.rebind(var30, var23);
            module0146.$g2013$.rebind(var29, var23);
            module0146.$g2055$.rebind(var28, var23);
            module0147.$g2095$.rebind(var27, var23);
            module0147.$g2094$.rebind(var26, var23);
        }
        return Values.values(var24, var2);
    }
    
    public static SubLObject f20745() {
        final SubLObject var44 = module0307.$g2785$.getGlobalValue();
        if (module0307.NIL != var44) {
            module0034.f1818(var44);
        }
        return (SubLObject)module0307.NIL;
    }
    
    public static SubLObject f20746(final SubLObject var22, final SubLObject var2) {
        return module0034.f1829(module0307.$g2785$.getGlobalValue(), (SubLObject)ConsesLow.list(var22, var2), (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED);
    }
    
    public static SubLObject f20747(final SubLObject var22, final SubLObject var2) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (module0307.NIL != module0274.f18101(var22, (SubLObject)module0307.UNPROVIDED)) {
            var23.resetMultipleValues();
            final SubLObject var24 = module0282.f18747(var22, var2);
            final SubLObject var25 = var23.secondMultipleValue();
            var23.resetMultipleValues();
            return Values.values(module0036.f2531(var24, (SubLObject)module0307.$ic3$, (SubLObject)module0307.$ic6$, (SubLObject)module0307.UNPROVIDED), var25);
        }
        return (SubLObject)module0307.NIL;
    }
    
    public static SubLObject f20744(final SubLObject var22, final SubLObject var2) {
        SubLObject var23 = module0307.$g2785$.getGlobalValue();
        if (module0307.NIL == var23) {
            var23 = module0034.f1934((SubLObject)module0307.$ic5$, (SubLObject)module0307.$ic7$, (SubLObject)module0307.NIL, (SubLObject)module0307.EQUAL, (SubLObject)module0307.TWO_INTEGER, (SubLObject)module0307.$ic8$);
        }
        final SubLObject var24 = module0034.f1782(var22, var2);
        final SubLObject var25 = module0034.f1814(var23, var24, (SubLObject)module0307.UNPROVIDED);
        if (var25 != module0307.$ic9$) {
            SubLObject var26 = var25;
            SubLObject var27 = (SubLObject)module0307.NIL;
            var27 = var26.first();
            while (module0307.NIL != var26) {
                SubLObject var28 = var27.first();
                final SubLObject var29 = conses_high.second(var27);
                if (var22.equal(var28.first())) {
                    var28 = var28.rest();
                    if (module0307.NIL != var28 && module0307.NIL == var28.rest() && var2.equal(var28.first())) {
                        return module0034.f1959(var29);
                    }
                }
                var26 = var26.rest();
                var27 = var26.first();
            }
        }
        final SubLObject var30 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f20747(var22, var2)));
        module0034.f1836(var23, var24, var25, var30, (SubLObject)ConsesLow.list(var22, var2));
        return module0034.f1959(var30);
    }
    
    public static SubLObject f20748(final SubLObject var22, final SubLObject var2) {
        return f20735(var22, var2, (SubLObject)module0307.NIL, (SubLObject)module0307.NIL);
    }
    
    public static SubLObject f20735(final SubLObject var22, SubLObject var2, final SubLObject var7, final SubLObject var8) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        SubLObject var24 = (SubLObject)module0307.NIL;
        final SubLObject var25 = module0146.$g2055$.currentBinding(var23);
        final SubLObject var26 = module0146.$g2013$.currentBinding(var23);
        final SubLObject var27 = module0146.$g2027$.currentBinding(var23);
        final SubLObject var28 = module0146.$g2028$.currentBinding(var23);
        try {
            module0146.$g2055$.bind((SubLObject)module0307.NIL, var23);
            module0146.$g2013$.bind((SubLObject)module0307.NIL, var23);
            module0146.$g2027$.bind((SubLObject)module0307.NIL, var23);
            module0146.$g2028$.bind((SubLObject)module0307.NIL, var23);
            if (module0307.NIL != var7 || module0307.NIL != module0274.f18101(var22, (SubLObject)module0307.UNPROVIDED)) {
                final SubLObject var11_52 = module0147.$g2095$.currentBinding(var23);
                final SubLObject var25_53 = module0282.$g2616$.currentBinding(var23);
                try {
                    module0147.$g2095$.bind((module0307.NIL != module0269.f17707(var2)) ? var2 : module0147.$g2095$.getDynamicValue(var23), var23);
                    module0282.$g2616$.bind((SubLObject)module0307.NIL, var23);
                    SubLObject var29 = (SubLObject)module0307.NIL;
                    if (module0307.NIL != var8) {
                        try {
                            var23.throwStack.push(module0307.$ic10$);
                            var23.resetMultipleValues();
                            final SubLObject var54_55 = f20749(var22);
                            final SubLObject var56_57 = var23.secondMultipleValue();
                            var23.resetMultipleValues();
                            var24 = var54_55;
                            var2 = var56_57;
                        }
                        catch (Throwable var30) {
                            var29 = Errors.handleThrowable(var30, (SubLObject)module0307.$ic10$);
                        }
                        finally {
                            var23.throwStack.pop();
                        }
                    }
                    else {
                        var23.resetMultipleValues();
                        final SubLObject var58_59 = f20749(var22);
                        final SubLObject var60_61 = var23.secondMultipleValue();
                        var23.resetMultipleValues();
                        var24 = var58_59;
                        var2 = var60_61;
                    }
                    if (module0307.NIL != var29) {
                        module0303.f20203((SubLObject)ConsesLow.list((SubLObject)module0307.$ic10$, var22));
                        var24 = (SubLObject)module0307.NIL;
                    }
                }
                finally {
                    module0282.$g2616$.rebind(var25_53, var23);
                    module0147.$g2095$.rebind(var11_52, var23);
                }
            }
        }
        finally {
            module0146.$g2028$.rebind(var28, var23);
            module0146.$g2027$.rebind(var27, var23);
            module0146.$g2013$.rebind(var26, var23);
            module0146.$g2055$.rebind(var25, var23);
        }
        var24 = f20750(var24);
        return Values.values(var24, var2);
    }
    
    public static SubLObject f20749(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        SubLObject var24 = (SubLObject)module0307.NIL;
        SubLObject var25 = (SubLObject)module0307.NIL;
        final SubLObject var26 = module0146.$g2031$.currentBinding(var23);
        final SubLObject var27 = module0146.$g2003$.currentBinding(var23);
        try {
            module0146.$g2031$.bind(Hashtables.make_hash_table((SubLObject)module0307.FOUR_INTEGER, Symbols.symbol_function((SubLObject)module0307.EQL), (SubLObject)module0307.UNPROVIDED), var23);
            module0146.$g2003$.bind((SubLObject)module0307.NIL, var23);
            var23.resetMultipleValues();
            final SubLObject var62_63 = module0282.f18746(module0276.f18293(module0276.f18344(f20751(var22, module0147.$g2095$.getDynamicValue(var23))), (SubLObject)module0307.UNPROVIDED), module0147.$g2095$.getDynamicValue(var23));
            final SubLObject var64_65 = var23.secondMultipleValue();
            var23.resetMultipleValues();
            var24 = var62_63;
            var25 = var64_65;
        }
        finally {
            module0146.$g2003$.rebind(var27, var23);
            module0146.$g2031$.rebind(var26, var23);
        }
        return Values.values(var24, var25);
    }
    
    public static SubLObject f20752(final SubLObject var3, final SubLObject var66) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0307.NIL != module0205.f13128(var3, var66) || (module0307.ONE_INTEGER.numE(var66) && module0307.NIL != module0202.f12589(var3, module0307.$ic12$)));
    }
    
    public static SubLObject f20751(final SubLObject var22, final SubLObject var2) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        SubLObject var24 = (SubLObject)module0307.NIL;
        final SubLObject var25 = module0307.$g2786$.currentBinding(var23);
        try {
            module0307.$g2786$.bind(module0077.f5313(Symbols.symbol_function((SubLObject)module0307.EQL), (SubLObject)module0307.UNPROVIDED), var23);
            SubLObject var26 = module0261.f17222(module0307.$ic13$, var2, (SubLObject)module0307.NIL);
            SubLObject var27 = (SubLObject)module0307.NIL;
            var27 = var26.first();
            while (module0307.NIL != var26) {
                module0077.f5326(var27, module0307.$g2786$.getDynamicValue(var23));
                var26 = var26.rest();
                var27 = var26.first();
            }
            final SubLObject var11_69 = module0205.$g2314$.currentBinding(var23);
            try {
                module0205.$g2314$.bind((SubLObject)module0307.$ic14$, var23);
                var24 = module0205.f13147(var22, (SubLObject)module0307.$ic15$, (SubLObject)module0307.$ic16$, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED);
            }
            finally {
                module0205.$g2314$.rebind(var11_69, var23);
            }
        }
        finally {
            module0307.$g2786$.rebind(var25, var23);
        }
        return var24;
    }
    
    public static SubLObject f20753(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = module0205.f13132(var3);
        if (module0307.NIL != module0173.f10955(var5)) {
            return module0077.f5320(var5, module0307.$g2786$.getDynamicValue(var4));
        }
        return (SubLObject)module0307.NIL;
    }
    
    public static SubLObject f20754(final SubLObject var3) {
        return module0276.f18323(module0205.f13203(var3, (SubLObject)module0307.UNPROVIDED));
    }
    
    public static SubLObject f20750(final SubLObject var5) {
        SubLObject var6 = (SubLObject)module0307.NIL;
        if (var5.isCons()) {
            SubLObject var7 = var5;
            SubLObject var8 = (SubLObject)module0307.NIL;
            var8 = var7.first();
            while (module0307.NIL != var7) {
                final SubLObject var9 = module0232.f15306(var8);
                final SubLObject var10 = module0232.f15308(var8);
                if (module0307.NIL != module0035.f1997(var10)) {
                    final SubLObject var11 = var8;
                    if (module0307.NIL == conses_high.member(var11, var6, (SubLObject)module0307.EQUAL, Symbols.symbol_function((SubLObject)module0307.IDENTITY))) {
                        var6 = (SubLObject)ConsesLow.cons(var11, var6);
                    }
                }
                else if (module0307.NIL != var10) {
                    SubLObject var19_74 = var10;
                    SubLObject var12 = (SubLObject)module0307.NIL;
                    var12 = var19_74.first();
                    while (module0307.NIL != var19_74) {
                        final SubLObject var13 = module0232.f15326(var9, (SubLObject)ConsesLow.list(module0036.f2531(var12, (SubLObject)module0307.$ic3$, (SubLObject)module0307.$ic6$, (SubLObject)module0307.UNPROVIDED)));
                        if (module0307.NIL == conses_high.member(var13, var6, (SubLObject)module0307.EQUAL, Symbols.symbol_function((SubLObject)module0307.IDENTITY))) {
                            var6 = (SubLObject)ConsesLow.cons(var13, var6);
                        }
                        var19_74 = var19_74.rest();
                        var12 = var19_74.first();
                    }
                }
                else {
                    final SubLObject var11 = module0232.f15326(var9, (SubLObject)module0307.NIL);
                    if (module0307.NIL == conses_high.member(var11, var6, (SubLObject)module0307.EQUAL, Symbols.symbol_function((SubLObject)module0307.IDENTITY))) {
                        var6 = (SubLObject)ConsesLow.cons(var11, var6);
                    }
                }
                var7 = var7.rest();
                var8 = var7.first();
            }
        }
        return var6;
    }
    
    public static SubLObject f20755(final SubLObject var16, final SubLObject var2, SubLObject var9) {
        if (var9 == module0307.UNPROVIDED) {
            var9 = (SubLObject)module0307.$ic2$;
        }
        final SubLObject var17 = module0232.f15306(var16);
        final SubLObject var18 = module0232.f15308(var16);
        SubLObject var19 = (SubLObject)module0307.T;
        SubLObject var20 = (SubLObject)module0307.NIL;
        if (module0307.NIL != var18) {
            if (module0307.NIL == var20) {
                SubLObject var21 = var18;
                SubLObject var22 = (SubLObject)module0307.NIL;
                var22 = var21.first();
                while (module0307.NIL == var20 && module0307.NIL != var21) {
                    var19 = (SubLObject)SubLObjectFactory.makeBoolean(module0307.NIL != f20742((SubLObject)ConsesLow.list(module0232.f15326(var17, (SubLObject)ConsesLow.list(var22))), var2, var9) && module0307.NIL != var19);
                    var20 = module0303.f20199((SubLObject)SubLObjectFactory.makeBoolean(module0307.NIL == var19));
                    var21 = var21.rest();
                    var22 = var21.first();
                }
            }
        }
        else {
            var19 = (SubLObject)SubLObjectFactory.makeBoolean(module0307.NIL != f20742((SubLObject)ConsesLow.list(module0232.f15326(var17, (SubLObject)ConsesLow.list((SubLObject)module0307.NIL))), var2, var9) && module0307.NIL != var19);
        }
        return var19;
    }
    
    public static SubLObject f20756(final SubLObject var16, final SubLObject var2, SubLObject var9) {
        if (var9 == module0307.UNPROVIDED) {
            var9 = (SubLObject)module0307.$ic2$;
        }
        final SubLObject var17 = module0232.f15306(var16);
        final SubLObject var18 = module0232.f15308(var16);
        SubLObject var19 = (SubLObject)module0307.T;
        SubLObject var20 = (SubLObject)module0307.NIL;
        if (module0307.NIL != var18) {
            if (module0307.NIL == var20) {
                SubLObject var21 = var18;
                SubLObject var22 = (SubLObject)module0307.NIL;
                var22 = var21.first();
                while (module0307.NIL == var20 && module0307.NIL != var21) {
                    var19 = (SubLObject)SubLObjectFactory.makeBoolean(module0307.NIL != f20739((SubLObject)ConsesLow.list(module0232.f15326(var17, (SubLObject)ConsesLow.list(var22))), var2, var9) && module0307.NIL != var19);
                    var20 = module0303.f20199((SubLObject)SubLObjectFactory.makeBoolean(module0307.NIL == var19));
                    var21 = var21.rest();
                    var22 = var21.first();
                }
            }
        }
        else {
            var19 = (SubLObject)SubLObjectFactory.makeBoolean(module0307.NIL != f20739((SubLObject)ConsesLow.list(module0232.f15326(var17, (SubLObject)ConsesLow.list((SubLObject)module0307.NIL))), var2, var9) && module0307.NIL != var19);
        }
        return var19;
    }
    
    public static SubLObject f20757(final SubLObject var76, SubLObject var2, SubLObject var9) {
        if (var9 == module0307.UNPROVIDED) {
            var9 = (SubLObject)module0307.$ic2$;
        }
        final SubLThread var77 = SubLProcess.currentSubLThread();
        SubLObject var78 = (SubLObject)module0307.T;
        SubLObject var79 = (SubLObject)module0307.NIL;
        final SubLObject var80 = module0147.$g2095$.currentBinding(var77);
        final SubLObject var81 = module0146.$g2055$.currentBinding(var77);
        final SubLObject var82 = module0146.$g2013$.currentBinding(var77);
        try {
            module0147.$g2095$.bind((module0307.NIL != module0269.f17707(var2)) ? var2 : module0147.$g2095$.getDynamicValue(var77), var77);
            module0146.$g2055$.bind((SubLObject)module0307.NIL, var77);
            module0146.$g2013$.bind((SubLObject)module0307.NIL, var77);
            SubLObject var83 = (SubLObject)module0307.NIL;
            if (module0307.NIL != module0274.f18101(var76, (SubLObject)module0307.UNPROVIDED)) {
                try {
                    var77.throwStack.push(module0307.$ic4$);
                    var77.resetMultipleValues();
                    final SubLObject var77_78 = module0282.f18747(var76, var2);
                    final SubLObject var79_80 = var77.secondMultipleValue();
                    var77.resetMultipleValues();
                    var79 = var77_78;
                    var2 = var79_80;
                }
                catch (Throwable var84) {
                    var83 = Errors.handleThrowable(var84, (SubLObject)module0307.$ic4$);
                }
                finally {
                    var77.throwStack.pop();
                }
                if (module0307.NIL != var83) {
                    var78 = (SubLObject)module0307.NIL;
                    module0303.f20203((SubLObject)ConsesLow.list((SubLObject)module0307.$ic4$, var76));
                }
            }
        }
        finally {
            module0146.$g2013$.rebind(var82, var77);
            module0146.$g2055$.rebind(var81, var77);
            module0147.$g2095$.rebind(var80, var77);
        }
        if (module0307.NIL == module0152.$g2129$.getDynamicValue(var77)) {
            if (var79.isCons()) {
                SubLObject var85 = var79;
                SubLObject var86 = (SubLObject)module0307.NIL;
                var86 = var85.first();
                while (module0307.NIL != var85) {
                    var78 = (SubLObject)SubLObjectFactory.makeBoolean(module0307.NIL != f20758((SubLObject)ConsesLow.list(var86), var2, var9) && module0307.NIL != var78);
                    var85 = var85.rest();
                    var86 = var85.first();
                }
            }
            return var78;
        }
        return (SubLObject)module0307.NIL;
    }
    
    public static SubLObject f20759(final SubLObject var1, final SubLObject var2, SubLObject var9) {
        if (var9 == module0307.UNPROVIDED) {
            var9 = (SubLObject)module0307.$ic2$;
        }
        return f20760(module0202.f12643(module0307.$ic17$, var1), var2, var9);
    }
    
    public static SubLObject f20760(final SubLObject var3, final SubLObject var2, SubLObject var9) {
        if (var9 == module0307.UNPROVIDED) {
            var9 = (SubLObject)module0307.$ic2$;
        }
        final SubLThread var10 = SubLProcess.currentSubLThread();
        if (module0307.NIL == module0274.f18099(var3)) {
            return f20762(f20748(var3, var2), var2, var9);
        }
        var10.resetMultipleValues();
        final SubLObject var11 = f20761(var3, var2);
        final SubLObject var2_83 = var10.secondMultipleValue();
        var10.resetMultipleValues();
        if (module0307.NIL == var11 || var3.equal(var11)) {
            return f20762(f20748(var3, var2_83), var2_83, var9);
        }
        SubLObject var12 = (SubLObject)module0307.NIL;
        final SubLObject var13 = module0152.$g2134$.currentBinding(var10);
        final SubLObject var14 = module0152.$g2122$.currentBinding(var10);
        final SubLObject var15 = module0152.$g2133$.currentBinding(var10);
        try {
            module0152.$g2134$.bind(var3, var10);
            module0152.$g2122$.bind((SubLObject)module0307.NIL, var10);
            module0152.$g2133$.bind((SubLObject)module0307.T, var10);
            var10.resetMultipleValues();
            final SubLObject var16 = f20748(module0202.f12768(module0307.$ic18$, var3, var11), var2_83);
            final SubLObject var17 = var10.secondMultipleValue();
            var10.resetMultipleValues();
            var12 = f20763(var16, var17, (SubLObject)module0307.UNPROVIDED);
        }
        finally {
            module0152.$g2133$.rebind(var15, var10);
            module0152.$g2122$.rebind(var14, var10);
            module0152.$g2134$.rebind(var13, var10);
        }
        return var12;
    }
    
    public static SubLObject f20761(final SubLObject var3, final SubLObject var2) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)module0307.NIL;
        SubLObject var6 = (SubLObject)module0307.NIL;
        SubLObject var7 = (SubLObject)module0307.NIL;
        try {
            var4.throwStack.push(module0307.$ic19$);
            try {
                var4.throwStack.push(module0307.$ic20$);
                var4.resetMultipleValues();
                final SubLObject var84_85 = module0278.f18396(var3, var2);
                final SubLObject var86_87 = var4.secondMultipleValue();
                var4.resetMultipleValues();
                var5 = var84_85;
                var6 = var86_87;
            }
            catch (Throwable var8) {
                var7 = Errors.handleThrowable(var8, (SubLObject)module0307.$ic20$);
            }
            finally {
                var4.throwStack.pop();
            }
        }
        catch (Throwable var8) {
            var7 = Errors.handleThrowable(var8, (SubLObject)module0307.$ic19$);
        }
        finally {
            var4.throwStack.pop();
        }
        if (module0307.NIL != var7) {
            return (SubLObject)module0307.NIL;
        }
        return Values.values(var5, var6);
    }
    
    public static SubLObject f20764(final SubLObject var88, final SubLObject var89) {
        SubLObject var90 = (SubLObject)module0307.NIL;
        SubLObject var91 = (SubLObject)module0307.NIL;
        SubLObject var92 = (SubLObject)module0307.NIL;
        if (module0307.NIL != var88) {
            var90 = var88.first();
            var91 = conses_high.cadr(var88);
            var92 = conses_high.cddr(var88).first();
        }
        final SubLObject var93 = var89.first();
        if (var93.eql(module0307.$ic21$)) {
            return (SubLObject)ConsesLow.list(module0549.f33908(conses_high.union((SubLObject)ConsesLow.list(module0205.f13204(var89, (SubLObject)module0307.UNPROVIDED)), var90, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED), (SubLObject)module0307.UNPROVIDED), var91, var92);
        }
        if (var93.eql(module0307.$ic22$)) {
            return (SubLObject)ConsesLow.list(var90, module0549.f33908(conses_high.union((SubLObject)ConsesLow.list(conses_high.third(var89)), var91, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED), (SubLObject)module0307.UNPROVIDED), var92);
        }
        if (var93.eql(module0307.$ic23$)) {
            return (SubLObject)ConsesLow.list(var90, var91, module0549.f33908(conses_high.union((SubLObject)ConsesLow.list(module0205.f13204(var89, (SubLObject)module0307.UNPROVIDED)), var92, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED), (SubLObject)module0307.UNPROVIDED));
        }
        return var88;
    }
    
    public static SubLObject f20765(final SubLObject var3, final SubLObject var2, SubLObject var9, SubLObject var95) {
        if (var9 == module0307.UNPROVIDED) {
            var9 = (SubLObject)module0307.$ic2$;
        }
        if (var95 == module0307.UNPROVIDED) {
            var95 = (SubLObject)module0307.T;
        }
        final SubLObject var96 = module0202.f12693(var3, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED);
        SubLObject var97 = (SubLObject)module0307.NIL;
        SubLObject var98 = (SubLObject)module0307.NIL;
        final SubLObject var99 = f20760(var3, var2, var9);
        final SubLObject var100 = module0067.f4880((SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED);
        if (var99.first().eql(module0307.$ic18$)) {
            SubLObject var101 = var99;
            SubLObject var102 = (SubLObject)module0307.NIL;
            var102 = var101.first();
            while (module0307.NIL != var101) {
                if (var102.isList()) {
                    var97 = module0205.f13203(var102, (SubLObject)module0307.UNPROVIDED);
                    if (module0307.NIL == var95 || (module0307.NIL != var95 && module0307.NIL != module0004.f104(var97, var96, (SubLObject)module0307.EQUAL, (SubLObject)module0307.UNPROVIDED))) {
                        var98 = module0067.f4884(var100, var97, (SubLObject)module0307.UNPROVIDED);
                        var98 = f20764(var98, var102);
                        module0067.f4886(var100, var97, var98);
                    }
                }
                var101 = var101.rest();
                var102 = var101.first();
            }
        }
        else if (module0307.NIL != var99) {
            var97 = conses_high.second(var99);
            var98 = module0067.f4884(var100, var97, (SubLObject)module0307.UNPROVIDED);
            var98 = f20764(var98, var99);
            module0067.f4886(var100, var97, var98);
        }
        return var100;
    }
    
    public static SubLObject f20766(final SubLObject var3, final SubLObject var2, SubLObject var9) {
        if (var9 == module0307.UNPROVIDED) {
            var9 = (SubLObject)module0307.$ic2$;
        }
        final SubLThread var10 = SubLProcess.currentSubLThread();
        var10.resetMultipleValues();
        final SubLObject var11 = f20748(var3, var2);
        final SubLObject var12 = var10.secondMultipleValue();
        var10.resetMultipleValues();
        return f20763(var11, var12, var9);
    }
    
    public static SubLObject f20767(final SubLObject var3, final SubLObject var2, SubLObject var9) {
        if (var9 == module0307.UNPROVIDED) {
            var9 = (SubLObject)module0307.$ic2$;
        }
        final SubLThread var10 = SubLProcess.currentSubLThread();
        var10.resetMultipleValues();
        final SubLObject var11 = f20748(var3, var2);
        final SubLObject var12 = var10.secondMultipleValue();
        var10.resetMultipleValues();
        return f20768(var11, var12, var9);
    }
    
    public static SubLObject f20769(final SubLObject var3, SubLObject var2, SubLObject var9) {
        if (var9 == module0307.UNPROVIDED) {
            var9 = (SubLObject)module0307.$ic2$;
        }
        final SubLThread var10 = SubLProcess.currentSubLThread();
        SubLObject var11 = (SubLObject)module0307.NIL;
        final SubLObject var12 = module0147.$g2095$.currentBinding(var10);
        final SubLObject var13 = module0146.$g2055$.currentBinding(var10);
        final SubLObject var14 = module0146.$g2013$.currentBinding(var10);
        try {
            module0147.$g2095$.bind((module0307.NIL != module0269.f17707(var2)) ? var2 : module0147.$g2095$.getDynamicValue(var10), var10);
            module0146.$g2055$.bind((SubLObject)module0307.NIL, var10);
            module0146.$g2013$.bind((SubLObject)module0307.NIL, var10);
            if (module0307.NIL != module0274.f18101(var3, (SubLObject)module0307.UNPROVIDED)) {
                var10.resetMultipleValues();
                final SubLObject var101_102 = module0282.f18746(var3, module0147.$g2095$.getDynamicValue(var10));
                final SubLObject var103_104 = var10.secondMultipleValue();
                var10.resetMultipleValues();
                var11 = var101_102;
                var2 = var103_104;
            }
        }
        finally {
            module0146.$g2013$.rebind(var14, var10);
            module0146.$g2055$.rebind(var13, var10);
            module0147.$g2095$.rebind(var12, var10);
        }
        return f20762(var11, var2, var9);
    }
    
    public static SubLObject f20770(final SubLObject var76, SubLObject var2, SubLObject var9) {
        if (var9 == module0307.UNPROVIDED) {
            var9 = (SubLObject)module0307.$ic2$;
        }
        final SubLThread var77 = SubLProcess.currentSubLThread();
        SubLObject var78 = (SubLObject)module0307.NIL;
        final SubLObject var79 = module0147.$g2095$.currentBinding(var77);
        final SubLObject var80 = module0146.$g2055$.currentBinding(var77);
        final SubLObject var81 = module0146.$g2013$.currentBinding(var77);
        try {
            module0147.$g2095$.bind((module0307.NIL != module0269.f17707(var2)) ? var2 : module0147.$g2095$.getDynamicValue(var77), var77);
            module0146.$g2055$.bind((SubLObject)module0307.NIL, var77);
            module0146.$g2013$.bind((SubLObject)module0307.NIL, var77);
            if (module0307.NIL != module0274.f18101(var76, (SubLObject)module0307.UNPROVIDED)) {
                var77.resetMultipleValues();
                final SubLObject var105_106 = module0282.f18747(var76, module0147.$g2095$.getDynamicValue(var77));
                final SubLObject var107_108 = var77.secondMultipleValue();
                var77.resetMultipleValues();
                var78 = var105_106;
                var2 = var107_108;
            }
        }
        finally {
            module0146.$g2013$.rebind(var81, var77);
            module0146.$g2055$.rebind(var80, var77);
            module0147.$g2095$.rebind(var79, var77);
        }
        return f20771(var78, var2, var9);
    }
    
    public static SubLObject f20772(final SubLObject var76, final SubLObject var2, SubLObject var9) {
        if (var9 == module0307.UNPROVIDED) {
            var9 = (SubLObject)module0307.$ic2$;
        }
        final SubLThread var77 = SubLProcess.currentSubLThread();
        var77.resetMultipleValues();
        final SubLObject var78 = f20743(var76, var2, (SubLObject)module0307.NIL);
        final SubLObject var79 = var77.secondMultipleValue();
        var77.resetMultipleValues();
        return f20773(var78, var79, var9);
    }
    
    public static SubLObject f20762(final SubLObject var5, final SubLObject var2, SubLObject var9) {
        if (var9 == module0307.UNPROVIDED) {
            var9 = (SubLObject)module0307.$ic2$;
        }
        SubLObject var10 = (SubLObject)module0307.NIL;
        SubLObject var11 = var5;
        SubLObject var12 = (SubLObject)module0307.NIL;
        var12 = var11.first();
        while (module0307.NIL != var11) {
            final SubLObject var13 = f20774(var12, var2, var9);
            if (module0307.NIL != var13) {
                var10 = (SubLObject)ConsesLow.cons(var13, var10);
            }
            var11 = var11.rest();
            var12 = var11.first();
        }
        if (module0307.NIL == var10) {
            return (SubLObject)module0307.NIL;
        }
        if (module0307.NIL != module0035.f1997(var10)) {
            return var10.first();
        }
        return module0276.f18304(module0276.f18287(Sequences.nreverse(var10), (SubLObject)module0307.UNPROVIDED), var9);
    }
    
    public static SubLObject f20768(final SubLObject var5, final SubLObject var2, SubLObject var9) {
        if (var9 == module0307.UNPROVIDED) {
            var9 = (SubLObject)module0307.$ic2$;
        }
        SubLObject var10 = (SubLObject)module0307.NIL;
        SubLObject var11 = (SubLObject)module0307.NIL;
        SubLObject var12 = var5;
        SubLObject var13 = (SubLObject)module0307.NIL;
        var13 = var12.first();
        while (module0307.NIL != var12) {
            if (module0307.NIL != module0035.f2439((SubLObject)module0307.$ic3$, var13, (SubLObject)module0307.UNPROVIDED)) {
                var11 = (SubLObject)ConsesLow.cons(var13, var11);
            }
            else {
                final SubLObject var14 = f20774(var13, var2, var9);
                if (module0307.NIL != var14) {
                    var10 = (SubLObject)ConsesLow.cons(var14, var10);
                }
            }
            var12 = var12.rest();
            var13 = var12.first();
        }
        var12 = module0035.f2399(var11, (SubLObject)module0307.$ic3$, (SubLObject)module0307.EQUAL, (SubLObject)module0307.IDENTITY, (SubLObject)module0307.NIL);
        SubLObject var15 = (SubLObject)module0307.NIL;
        var15 = var12.first();
        while (module0307.NIL != var12) {
            SubLObject var16 = (SubLObject)module0307.NIL;
            SubLObject var19_110 = var11;
            SubLObject var17 = (SubLObject)module0307.NIL;
            var17 = var19_110.first();
            while (module0307.NIL != var19_110) {
                if (module0307.NIL != module0035.f2428(var15, var17, (SubLObject)module0307.EQUAL, (SubLObject)module0307.UNPROVIDED)) {
                    var16 = (SubLObject)ConsesLow.cons(var17, var16);
                }
                var19_110 = var19_110.rest();
                var17 = var19_110.first();
            }
            SubLObject var19_111 = module0204.f13064(var16, (SubLObject)module0307.UNPROVIDED);
            SubLObject var18 = (SubLObject)module0307.NIL;
            var18 = var19_111.first();
            while (module0307.NIL != var19_111) {
                final SubLObject var19 = f20762(var18, var2, var9);
                if (module0307.NIL != var19) {
                    var10 = (SubLObject)ConsesLow.cons(var19, var10);
                }
                var19_111 = var19_111.rest();
                var18 = var19_111.first();
            }
            var12 = var12.rest();
            var15 = var12.first();
        }
        if (module0307.NIL == var10) {
            return (SubLObject)module0307.NIL;
        }
        if (module0307.NIL != module0035.f1997(var10)) {
            return var10.first();
        }
        return module0276.f18305(module0276.f18280(Sequences.nreverse(var10), (SubLObject)module0307.UNPROVIDED), var9);
    }
    
    public static SubLObject f20763(final SubLObject var5, final SubLObject var2, SubLObject var9) {
        if (var9 == module0307.UNPROVIDED) {
            var9 = (SubLObject)module0307.$ic2$;
        }
        final SubLObject var10 = Sequences.nreverse(module0035.f2399(var5, var9, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED));
        final SubLObject var11 = Hashtables.make_hash_table(Sequences.length(var10), (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED);
        final SubLObject var12 = Hashtables.make_hash_table(Sequences.length(var10), (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED);
        SubLObject var13 = (SubLObject)module0307.NIL;
        SubLObject var14 = var5;
        SubLObject var15 = (SubLObject)module0307.NIL;
        var15 = var14.first();
        while (module0307.NIL != var14) {
            SubLObject var19_115 = f20775(var15, var2, var9);
            SubLObject var16 = (SubLObject)module0307.NIL;
            var16 = var19_115.first();
            while (module0307.NIL != var19_115) {
                final SubLObject var17 = var16.first();
                final SubLObject var18 = var16.rest();
                Hashtables.sethash(var17, var11, ConsesLow.append(var18, Hashtables.gethash(var17, var11, (SubLObject)module0307.UNPROVIDED)));
                var19_115 = var19_115.rest();
                var16 = var19_115.first();
            }
            SubLObject var19_116 = f20776(var15, var2, var9);
            SubLObject var19 = (SubLObject)module0307.NIL;
            var19 = var19_116.first();
            while (module0307.NIL != var19_116) {
                final SubLObject var17 = var19.first();
                final SubLObject var20 = var19.rest();
                Hashtables.sethash(var17, var12, ConsesLow.append(var20, Hashtables.gethash(var17, var12, (SubLObject)module0307.UNPROVIDED)));
                var19_116 = var19_116.rest();
                var19 = var19_116.first();
            }
            var14 = var14.rest();
            var15 = var14.first();
        }
        SubLObject var21 = (SubLObject)module0307.NIL;
        SubLObject var22 = (SubLObject)module0307.NIL;
        Iterator var23 = Hashtables.getEntrySetIterator(var11);
        try {
            while (Hashtables.iteratorHasNext(var23)) {
                final Map.Entry var24 = Hashtables.iteratorNextEntry(var23);
                var21 = Hashtables.getEntryKey(var24);
                var22 = Hashtables.getEntryValue(var24);
                SubLObject var25 = f20777(Sequences.remove_duplicates(var22, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED), var2);
                SubLObject var26 = (SubLObject)module0307.NIL;
                var26 = var25.first();
                while (module0307.NIL != var25) {
                    var13 = (SubLObject)ConsesLow.cons(module0202.f12768(module0307.$ic21$, var21, var26), var13);
                    var25 = var25.rest();
                    var26 = var25.first();
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var23);
        }
        var21 = (SubLObject)module0307.NIL;
        SubLObject var27 = (SubLObject)module0307.NIL;
        var23 = Hashtables.getEntrySetIterator(var12);
        try {
            while (Hashtables.iteratorHasNext(var23)) {
                final Map.Entry var24 = Hashtables.iteratorNextEntry(var23);
                var21 = Hashtables.getEntryKey(var24);
                var27 = Hashtables.getEntryValue(var24);
                SubLObject var25 = f20777(Sequences.remove_duplicates(var27, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED), var2);
                SubLObject var28 = (SubLObject)module0307.NIL;
                var28 = var25.first();
                while (module0307.NIL != var25) {
                    var13 = (SubLObject)ConsesLow.cons(module0202.f12768(module0307.$ic22$, var21, var28), var13);
                    var25 = var25.rest();
                    var28 = var25.first();
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var23);
        }
        if (module0307.NIL == var13) {
            return (SubLObject)module0307.NIL;
        }
        if (module0307.NIL != module0035.f1997(var13)) {
            return var13.first();
        }
        return module0276.f18304(module0276.f18287(Sequences.nreverse(var13), (SubLObject)module0307.UNPROVIDED), var9);
    }
    
    public static SubLObject f20778(final SubLObject var5, final SubLObject var2, SubLObject var9) {
        if (var9 == module0307.UNPROVIDED) {
            var9 = (SubLObject)module0307.$ic2$;
        }
        final SubLThread var10 = SubLProcess.currentSubLThread();
        final SubLObject var11 = Sequences.nreverse(module0035.f2399(var5, var9, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED));
        final SubLObject var12 = module0067.f4880(Symbols.symbol_function((SubLObject)module0307.EQL), Sequences.length(var11));
        SubLObject var13 = (SubLObject)module0307.NIL;
        SubLObject var14 = var5;
        SubLObject var15 = (SubLObject)module0307.NIL;
        var15 = var14.first();
        while (module0307.NIL != var14) {
            SubLObject var19_124 = f20775(var15, var2, var9);
            SubLObject var16 = (SubLObject)module0307.NIL;
            var16 = var19_124.first();
            while (module0307.NIL != var19_124) {
                final SubLObject var17 = var16.first();
                final SubLObject var18 = var16.rest();
                module0084.f5767(var12, var17, var18);
                var19_124 = var19_124.rest();
                var16 = var19_124.first();
            }
            var14 = var14.rest();
            var15 = var14.first();
        }
        SubLObject var19;
        for (var19 = module0066.f4838(module0067.f4891(var12)); module0307.NIL == module0066.f4841(var19); var19 = module0066.f4840(var19)) {
            var10.resetMultipleValues();
            final SubLObject var20 = module0066.f4839(var19);
            final SubLObject var21 = var10.secondMultipleValue();
            var10.resetMultipleValues();
            SubLObject var22 = (SubLObject)module0307.NIL;
            SubLObject var23 = f20777(var21, var2);
            SubLObject var24 = (SubLObject)module0307.NIL;
            var24 = var23.first();
            while (module0307.NIL != var23) {
                var22 = (SubLObject)ConsesLow.cons(var24, var22);
                var23 = var23.rest();
                var24 = var23.first();
            }
            var22 = (SubLObject)ConsesLow.cons(var20, var22);
            var13 = (SubLObject)ConsesLow.cons(var22, var13);
        }
        module0066.f4842(var19);
        return var13;
    }
    
    public static SubLObject f20779(final SubLObject var5, final SubLObject var2, SubLObject var9) {
        if (var9 == module0307.UNPROVIDED) {
            var9 = (SubLObject)module0307.$ic2$;
        }
        final SubLThread var10 = SubLProcess.currentSubLThread();
        final SubLObject var11 = Sequences.nreverse(module0035.f2399(var5, var9, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED));
        final SubLObject var12 = module0067.f4880(Symbols.symbol_function((SubLObject)module0307.EQL), Sequences.length(var11));
        SubLObject var13 = (SubLObject)module0307.NIL;
        SubLObject var14 = var5;
        SubLObject var15 = (SubLObject)module0307.NIL;
        var15 = var14.first();
        while (module0307.NIL != var14) {
            SubLObject var19_128 = f20780(var15, var2, var9);
            SubLObject var16 = (SubLObject)module0307.NIL;
            var16 = var19_128.first();
            while (module0307.NIL != var19_128) {
                final SubLObject var17 = var16.first();
                final SubLObject var18 = var16.rest();
                module0084.f5767(var12, var17, var18);
                var19_128 = var19_128.rest();
                var16 = var19_128.first();
            }
            var14 = var14.rest();
            var15 = var14.first();
        }
        SubLObject var19;
        for (var19 = module0066.f4838(module0067.f4891(var12)); module0307.NIL == module0066.f4841(var19); var19 = module0066.f4840(var19)) {
            var10.resetMultipleValues();
            final SubLObject var20 = module0066.f4839(var19);
            final SubLObject var21 = var10.secondMultipleValue();
            var10.resetMultipleValues();
            SubLObject var22 = (SubLObject)module0307.NIL;
            SubLObject var23 = f20777(var21, var2);
            SubLObject var24 = (SubLObject)module0307.NIL;
            var24 = var23.first();
            while (module0307.NIL != var23) {
                var22 = (SubLObject)ConsesLow.cons(var24, var22);
                var23 = var23.rest();
                var24 = var23.first();
            }
            var22 = (SubLObject)ConsesLow.cons(var20, var22);
            var13 = (SubLObject)ConsesLow.cons(var22, var13);
        }
        module0066.f4842(var19);
        return var13;
    }
    
    public static SubLObject f20781(final SubLObject var5, final SubLObject var2, SubLObject var9) {
        if (var9 == module0307.UNPROVIDED) {
            var9 = (SubLObject)module0307.$ic2$;
        }
        final SubLThread var10 = SubLProcess.currentSubLThread();
        final SubLObject var11 = Sequences.nreverse(module0035.f2399(var5, var9, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED));
        final SubLObject var12 = module0067.f4880(Symbols.symbol_function((SubLObject)module0307.EQL), Sequences.length(var11));
        SubLObject var13 = (SubLObject)module0307.NIL;
        SubLObject var14 = var5;
        SubLObject var15 = (SubLObject)module0307.NIL;
        var15 = var14.first();
        while (module0307.NIL != var14) {
            SubLObject var19_132 = f20776(var15, var2, var9);
            SubLObject var16 = (SubLObject)module0307.NIL;
            var16 = var19_132.first();
            while (module0307.NIL != var19_132) {
                final SubLObject var17 = var16.first();
                final SubLObject var18 = var16.rest();
                module0084.f5767(var12, var17, var18);
                var19_132 = var19_132.rest();
                var16 = var19_132.first();
            }
            var14 = var14.rest();
            var15 = var14.first();
        }
        SubLObject var19;
        for (var19 = module0066.f4838(module0067.f4891(var12)); module0307.NIL == module0066.f4841(var19); var19 = module0066.f4840(var19)) {
            var10.resetMultipleValues();
            final SubLObject var20 = module0066.f4839(var19);
            final SubLObject var21 = var10.secondMultipleValue();
            var10.resetMultipleValues();
            SubLObject var22 = (SubLObject)module0307.NIL;
            SubLObject var23 = f20777(var21, var2);
            SubLObject var24 = (SubLObject)module0307.NIL;
            var24 = var23.first();
            while (module0307.NIL != var23) {
                var22 = (SubLObject)ConsesLow.cons(var24, var22);
                var23 = var23.rest();
                var24 = var23.first();
            }
            var22 = (SubLObject)ConsesLow.cons(var20, var22);
            var13 = (SubLObject)ConsesLow.cons(var22, var13);
        }
        module0066.f4842(var19);
        return var13;
    }
    
    public static SubLObject f20782(final SubLObject var16, final SubLObject var2) {
        return f20774(var16, var2, (SubLObject)module0307.$ic24$);
    }
    
    public static SubLObject f20774(final SubLObject var16, final SubLObject var2, SubLObject var9) {
        if (var9 == module0307.UNPROVIDED) {
            var9 = (SubLObject)module0307.$ic2$;
        }
        SubLObject var17 = (SubLObject)module0307.NIL;
        SubLObject var18 = f20775(var16, var2, var9);
        SubLObject var19 = (SubLObject)module0307.NIL;
        var19 = var18.first();
        while (module0307.NIL != var18) {
            final SubLObject var20 = var19.first();
            final SubLObject var21 = var19.rest();
            SubLObject var19_134 = Sequences.reverse(var21);
            SubLObject var22 = (SubLObject)module0307.NIL;
            var22 = var19_134.first();
            while (module0307.NIL != var19_134) {
                var17 = (SubLObject)ConsesLow.cons(module0202.f12768(module0307.$ic21$, var20, var22), var17);
                var19_134 = var19_134.rest();
                var22 = var19_134.first();
            }
            var18 = var18.rest();
            var19 = var18.first();
        }
        var18 = f20780(var16, var2, var9);
        SubLObject var23 = (SubLObject)module0307.NIL;
        var23 = var18.first();
        while (module0307.NIL != var18) {
            final SubLObject var20 = var23.first();
            final SubLObject var24 = var23.rest();
            SubLObject var19_135 = Sequences.reverse(var24);
            SubLObject var25 = (SubLObject)module0307.NIL;
            var25 = var19_135.first();
            while (module0307.NIL != var19_135) {
                var17 = (SubLObject)ConsesLow.cons(module0202.f12768(module0307.$ic23$, var20, var25), var17);
                var19_135 = var19_135.rest();
                var25 = var19_135.first();
            }
            var18 = var18.rest();
            var23 = var18.first();
        }
        var18 = f20776(var16, var2, var9);
        SubLObject var26 = (SubLObject)module0307.NIL;
        var26 = var18.first();
        while (module0307.NIL != var18) {
            final SubLObject var20 = var26.first();
            final SubLObject var27 = var26.rest();
            SubLObject var19_136 = Sequences.reverse(var27);
            SubLObject var28 = (SubLObject)module0307.NIL;
            var28 = var19_136.first();
            while (module0307.NIL != var19_136) {
                var17 = (SubLObject)ConsesLow.cons(module0202.f12768(module0307.$ic22$, var20, var28), var17);
                var19_136 = var19_136.rest();
                var28 = var19_136.first();
            }
            var18 = var18.rest();
            var26 = var18.first();
        }
        if (module0307.NIL == var17) {
            return (SubLObject)module0307.NIL;
        }
        if (module0307.NIL != module0035.f1997(var17)) {
            return var17.first();
        }
        return module0276.f18287(Sequences.nreverse(var17), (SubLObject)module0307.UNPROVIDED);
    }
    
    public static SubLObject f20739(final SubLObject var5, final SubLObject var2, SubLObject var9) {
        if (var9 == module0307.UNPROVIDED) {
            var9 = (SubLObject)module0307.$ic2$;
        }
        final SubLThread var10 = SubLProcess.currentSubLThread();
        SubLObject var11 = (SubLObject)module0307.NIL;
        final SubLObject var12 = module0152.f9728();
        if (module0307.NIL != module0152.$g2133$.getDynamicValue(var10) && module0307.NIL != module0202.f12865(var12) && module0307.NIL != module0258.f16777(module0205.f13203(var12, (SubLObject)module0307.UNPROVIDED), module0205.f13204(var12, (SubLObject)module0307.UNPROVIDED), (SubLObject)module0307.UNPROVIDED)) {
            final SubLObject var13 = module0258.$g2489$.currentBinding(var10);
            try {
                module0258.$g2489$.bind((SubLObject)module0307.T, var10);
                var11 = f20783(var5, var2, var9);
            }
            finally {
                module0258.$g2489$.rebind(var13, var10);
            }
        }
        else {
            var11 = f20783(var5, var2, var9);
        }
        return var11;
    }
    
    public static SubLObject f20783(final SubLObject var5, final SubLObject var2, SubLObject var9) {
        if (var9 == module0307.UNPROVIDED) {
            var9 = (SubLObject)module0307.$ic2$;
        }
        final SubLObject var10 = f20778(var5, var2, var9);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0307.NIL != f20784(var10, (SubLObject)module0307.$ic25$, var2) && module0307.NIL != f20784(f20779(var5, var2, var9), (SubLObject)module0307.$ic26$, var2) && module0307.NIL != f20784(f20781(var5, var2, var9), (SubLObject)module0307.$ic27$, var2) && module0307.NIL != f20785(var5, var10, var2, var9));
    }
    
    public static SubLObject f20742(final SubLObject var5, final SubLObject var2, SubLObject var9) {
        if (var9 == module0307.UNPROVIDED) {
            var9 = (SubLObject)module0307.$ic2$;
        }
        final SubLObject var10 = f20786(var5, var2, var9);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0307.NIL != f20784(var10, (SubLObject)module0307.$ic25$, var2) && module0307.NIL != f20784(f20787(var5, var2, var9), (SubLObject)module0307.$ic26$, var2) && module0307.NIL != f20784(f20788(var5, var2, var9), (SubLObject)module0307.$ic27$, var2) && module0307.NIL != f20785(var5, var10, var2, var9));
    }
    
    public static SubLObject f20741(final SubLObject var16, final SubLObject var2, SubLObject var9) {
        if (var9 == module0307.UNPROVIDED) {
            var9 = (SubLObject)module0307.$ic2$;
        }
        final SubLObject var17 = f20775(var16, var2, var9);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0307.NIL != f20784(var17, (SubLObject)module0307.$ic25$, var2) && module0307.NIL != f20784(f20780(var16, var2, var9), (SubLObject)module0307.$ic26$, var2) && module0307.NIL != f20784(f20776(var16, var2, var9), (SubLObject)module0307.$ic27$, var2) && module0307.NIL != f20789(var16, var17, var2, var9));
    }
    
    public static SubLObject f20790(final SubLObject var117, final SubLObject var5, final SubLObject var2, SubLObject var9) {
        if (var9 == module0307.UNPROVIDED) {
            var9 = (SubLObject)module0307.$ic2$;
        }
        return conses_high.assoc(var117, f20786(var5, var2, var9), (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED).rest();
    }
    
    public static SubLObject f20791(final SubLObject var117, final SubLObject var5, final SubLObject var2, SubLObject var9) {
        if (var9 == module0307.UNPROVIDED) {
            var9 = (SubLObject)module0307.$ic2$;
        }
        return conses_high.assoc(var117, f20788(var5, var2, var9), (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED).rest();
    }
    
    public static SubLObject f20786(final SubLObject var5, final SubLObject var2, SubLObject var9) {
        if (var9 == module0307.UNPROVIDED) {
            var9 = (SubLObject)module0307.$ic24$;
        }
        final SubLThread var10 = SubLProcess.currentSubLThread();
        SubLObject var11 = (SubLObject)module0307.NIL;
        SubLObject var12 = (SubLObject)module0307.NIL;
        SubLObject var14;
        final SubLObject var13 = var14 = Sequences.nreverse(module0035.f2399(var5, var9, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED));
        SubLObject var15 = (SubLObject)module0307.NIL;
        var15 = var14.first();
        while (module0307.NIL != var14) {
            final SubLObject var16 = f20777(f20792(var15, var5, var2), var2);
            var12 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var15, var16), var12);
            var14 = var14.rest();
            var15 = var14.first();
        }
        if (module0307.NIL != var12 && module0307.NIL != module0144.$g1755$.getDynamicValue(var10)) {
            var14 = var13;
            var15 = (SubLObject)module0307.NIL;
            var15 = var14.first();
            while (module0307.NIL != var14) {
                final SubLObject var16 = f20777(f20793(var15, var5, var12, var2), var2);
                var11 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var15, var16), var11);
                var14 = var14.rest();
                var15 = var14.first();
            }
        }
        else {
            var11 = var12;
        }
        return var11;
    }
    
    public static SubLObject f20787(final SubLObject var5, final SubLObject var2, SubLObject var9) {
        if (var9 == module0307.UNPROVIDED) {
            var9 = (SubLObject)module0307.$ic24$;
        }
        SubLObject var10 = (SubLObject)module0307.NIL;
        SubLObject var11 = (SubLObject)module0307.NIL;
        SubLObject var13;
        final SubLObject var12 = var13 = Sequences.nreverse(module0035.f2399(var5, var9, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED));
        SubLObject var14 = (SubLObject)module0307.NIL;
        var14 = var13.first();
        while (module0307.NIL != var13) {
            final SubLObject var15 = f20777(f20794(var14, var5, var2), var2);
            var11 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var14, var15), var11);
            var13 = var13.rest();
            var14 = var13.first();
        }
        var10 = var11;
        return var10;
    }
    
    public static SubLObject f20788(final SubLObject var5, final SubLObject var2, SubLObject var9) {
        if (var9 == module0307.UNPROVIDED) {
            var9 = (SubLObject)module0307.$ic24$;
        }
        final SubLThread var10 = SubLProcess.currentSubLThread();
        SubLObject var11 = (SubLObject)module0307.NIL;
        SubLObject var12 = (SubLObject)module0307.NIL;
        SubLObject var14;
        final SubLObject var13 = var14 = Sequences.nreverse(module0035.f2399(var5, var9, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED));
        SubLObject var15 = (SubLObject)module0307.NIL;
        var15 = var14.first();
        while (module0307.NIL != var14) {
            final SubLObject var16 = f20777(f20795(var15, var5, var2), var2);
            var12 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var15, var16), var12);
            var14 = var14.rest();
            var15 = var14.first();
        }
        if (module0307.NIL != var12 && module0307.NIL != module0144.$g1757$.getDynamicValue(var10)) {
            var14 = var13;
            var15 = (SubLObject)module0307.NIL;
            var15 = var14.first();
            while (module0307.NIL != var14) {
                final SubLObject var16 = f20777(f20796(var15, var5, var12, var2), var2);
                var11 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var15, var16), var11);
                var14 = var14.rest();
                var15 = var14.first();
            }
        }
        else {
            var11 = var12;
        }
        return var11;
    }
    
    public static SubLObject f20792(final SubLObject var117, final SubLObject var5, final SubLObject var2) {
        SubLObject var118 = (SubLObject)module0307.NIL;
        SubLObject var119 = var5;
        SubLObject var120 = (SubLObject)module0307.NIL;
        var120 = var119.first();
        while (module0307.NIL != var119) {
            var118 = ConsesLow.nconc(var118, f20797(var117, var120, var2));
            var119 = var119.rest();
            var120 = var119.first();
        }
        var118 = module0035.f2273(var118);
        return var118;
    }
    
    public static SubLObject f20794(final SubLObject var117, final SubLObject var5, final SubLObject var2) {
        SubLObject var118 = (SubLObject)module0307.NIL;
        SubLObject var119 = var5;
        SubLObject var120 = (SubLObject)module0307.NIL;
        var120 = var119.first();
        while (module0307.NIL != var119) {
            var118 = ConsesLow.nconc(var118, f20798(var117, var120, var2));
            var119 = var119.rest();
            var120 = var119.first();
        }
        var118 = module0035.f2273(var118);
        return var118;
    }
    
    public static SubLObject f20795(final SubLObject var117, final SubLObject var5, final SubLObject var2) {
        SubLObject var118 = (SubLObject)module0307.NIL;
        SubLObject var119 = var5;
        SubLObject var120 = (SubLObject)module0307.NIL;
        var120 = var119.first();
        while (module0307.NIL != var119) {
            var118 = ConsesLow.nconc(var118, f20799(var117, var120, var2));
            var119 = var119.rest();
            var120 = var119.first();
        }
        var118 = module0035.f2273(var118);
        return var118;
    }
    
    public static SubLObject f20775(final SubLObject var16, final SubLObject var2, SubLObject var9) {
        if (var9 == module0307.UNPROVIDED) {
            var9 = (SubLObject)module0307.$ic24$;
        }
        final SubLThread var17 = SubLProcess.currentSubLThread();
        final SubLObject var18 = module0232.f15308(var16);
        if (module0307.NIL != var18) {
            final SubLObject var19 = Sequences.nreverse(module0035.f2399(var16, var9, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED));
            SubLObject var20 = (SubLObject)module0307.NIL;
            SubLObject var21 = (SubLObject)module0307.NIL;
            SubLObject var22 = var19;
            SubLObject var23 = (SubLObject)module0307.NIL;
            var23 = var22.first();
            while (module0307.NIL != var22) {
                if (module0307.NIL != module0144.$g1755$.getDynamicValue(var17) || module0307.NIL != module0035.f2428(var23, var18, Symbols.symbol_function((SubLObject)module0307.EQUAL), (SubLObject)module0307.UNPROVIDED)) {
                    final SubLObject var24 = f20777(f20797(var23, var16, var2), var2);
                    var21 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var23, var24), var21);
                }
                var22 = var22.rest();
                var23 = var22.first();
            }
            if (module0307.NIL != var21 && module0307.NIL != module0144.$g1755$.getDynamicValue(var17)) {
                var22 = var19;
                var23 = (SubLObject)module0307.NIL;
                var23 = var22.first();
                while (module0307.NIL != var22) {
                    final SubLObject var24 = f20777(f20800(var23, var16, var21, var2), var2);
                    var20 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var23, var24), var20);
                    var22 = var22.rest();
                    var23 = var22.first();
                }
            }
            else {
                var20 = var21;
            }
            return var20;
        }
        return (SubLObject)module0307.NIL;
    }
    
    public static SubLObject f20780(final SubLObject var16, final SubLObject var2, SubLObject var9) {
        if (var9 == module0307.UNPROVIDED) {
            var9 = (SubLObject)module0307.$ic24$;
        }
        final SubLObject var17 = module0232.f15308(var16);
        if (module0307.NIL != var17) {
            final SubLObject var18 = Sequences.nreverse(module0035.f2399(var16, var9, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED));
            SubLObject var19 = (SubLObject)module0307.NIL;
            SubLObject var20 = (SubLObject)module0307.NIL;
            SubLObject var21 = var18;
            SubLObject var22 = (SubLObject)module0307.NIL;
            var22 = var21.first();
            while (module0307.NIL != var21) {
                if (module0307.NIL != module0035.f2428(var22, var17, Symbols.symbol_function((SubLObject)module0307.EQUAL), (SubLObject)module0307.UNPROVIDED)) {}
                final SubLObject var23 = f20777(f20798(var22, var16, var2), var2);
                var20 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var22, var23), var20);
                var21 = var21.rest();
                var22 = var21.first();
            }
            var19 = var20;
            return var19;
        }
        return (SubLObject)module0307.NIL;
    }
    
    public static SubLObject f20776(final SubLObject var16, final SubLObject var2, SubLObject var9) {
        if (var9 == module0307.UNPROVIDED) {
            var9 = (SubLObject)module0307.$ic24$;
        }
        final SubLThread var17 = SubLProcess.currentSubLThread();
        final SubLObject var18 = module0232.f15308(var16);
        if (module0307.NIL != var18) {
            final SubLObject var19 = Sequences.nreverse(module0035.f2399(var16, var9, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED));
            SubLObject var20 = (SubLObject)module0307.NIL;
            SubLObject var21 = (SubLObject)module0307.NIL;
            SubLObject var22 = var19;
            SubLObject var23 = (SubLObject)module0307.NIL;
            var23 = var22.first();
            while (module0307.NIL != var22) {
                if (module0307.NIL != module0144.$g1755$.getDynamicValue(var17) || module0307.NIL != module0035.f2428(var23, var18, Symbols.symbol_function((SubLObject)module0307.EQUAL), (SubLObject)module0307.UNPROVIDED)) {
                    final SubLObject var24 = f20777(f20799(var23, var16, var2), var2);
                    var21 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var23, var24), var21);
                }
                var22 = var22.rest();
                var23 = var22.first();
            }
            if (module0307.NIL != var21 && module0307.NIL != module0144.$g1757$.getDynamicValue(var17)) {
                var22 = var19;
                var23 = (SubLObject)module0307.NIL;
                var23 = var22.first();
                while (module0307.NIL != var22) {
                    final SubLObject var24 = f20777(f20801(var23, var16, var21, var2), var2);
                    var20 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var23, var24), var20);
                    var22 = var22.rest();
                    var23 = var22.first();
                }
            }
            else {
                var20 = var21;
            }
            return var20;
        }
        return (SubLObject)module0307.NIL;
    }
    
    public static SubLObject f20797(final SubLObject var117, final SubLObject var16, final SubLObject var2) {
        final SubLThread var118 = SubLProcess.currentSubLThread();
        final SubLObject var119 = module0232.f15308(var16);
        SubLObject var120 = (SubLObject)module0307.NIL;
        if (module0307.NIL != var119) {
            final SubLObject var121 = module0144.$g1832$.currentBinding(var118);
            try {
                module0144.$g1832$.bind(var117, var118);
                final SubLObject var122 = module0232.f15306(var16);
                final SubLObject var123 = module0204.f13087(var16, module0201.f12583(var117), (SubLObject)module0307.UNPROVIDED);
                final SubLObject var11_140 = module0144.$g1801$.currentBinding(var118);
                try {
                    module0144.$g1801$.bind((SubLObject)SubLObjectFactory.makeBoolean((module0307.NIL != var122 && module0307.NIL != var119) || module0307.NIL != conses_high.second(var122)), var118);
                    if (module0307.NIL != module0035.f2428(var117, var119, Symbols.symbol_function((SubLObject)module0307.EQUAL), (SubLObject)module0307.UNPROVIDED) || module0307.NIL == module0004.f104(var117, var123, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED)) {
                        SubLObject var124 = var122;
                        SubLObject var125 = (SubLObject)module0307.NIL;
                        var125 = var124.first();
                        while (module0307.NIL != var124) {
                            var120 = ConsesLow.nconc(var120, f20802(var117, var125, var2));
                            var124 = var124.rest();
                            var125 = var124.first();
                        }
                        var124 = var119;
                        var125 = (SubLObject)module0307.NIL;
                        var125 = var124.first();
                        while (module0307.NIL != var124) {
                            if (module0307.NIL != module0202.f12903(var125)) {
                                final SubLObject var126 = module0202.f12832(var125, (SubLObject)module0307.UNPROVIDED);
                                final SubLObject var127 = module0202.f12906(var125);
                                final SubLObject var128 = module0202.f12887(var125);
                                final SubLObject var129 = (module0307.NIL != module0269.f17707(var127)) ? var127 : var2;
                                if (module0307.NIL == module0018.f979() || module0307.NIL != module0269.f17707(var127)) {
                                    var120 = ConsesLow.nconc(var120, f20803(var117, var128, var129, f20804(var126, (SubLObject)module0307.TWO_INTEGER, var129)));
                                }
                            }
                            var120 = ConsesLow.nconc(var120, f20805(var117, var125, var2));
                            var124 = var124.rest();
                            var125 = var124.first();
                        }
                        var120 = module0035.f2273(var120);
                    }
                }
                finally {
                    module0144.$g1801$.rebind(var11_140, var118);
                }
            }
            finally {
                module0144.$g1832$.rebind(var121, var118);
            }
        }
        return var120;
    }
    
    public static SubLObject f20798(final SubLObject var117, final SubLObject var16, final SubLObject var2) {
        final SubLThread var118 = SubLProcess.currentSubLThread();
        final SubLObject var119 = module0232.f15308(var16);
        SubLObject var120 = (SubLObject)module0307.NIL;
        if (module0307.NIL != var119) {
            final SubLObject var121 = module0144.$g1832$.currentBinding(var118);
            try {
                module0144.$g1832$.bind(var117, var118);
                final SubLObject var122 = module0232.f15306(var16);
                final SubLObject var123 = module0204.f13087(var16, module0201.f12583(var117), (SubLObject)module0307.UNPROVIDED);
                final SubLObject var11_146 = module0144.$g1801$.currentBinding(var118);
                try {
                    module0144.$g1801$.bind((SubLObject)SubLObjectFactory.makeBoolean((module0307.NIL != var122 && module0307.NIL != var119) || module0307.NIL != conses_high.second(var122)), var118);
                    if (module0307.NIL != module0035.f2428(var117, var119, Symbols.symbol_function((SubLObject)module0307.EQUAL), (SubLObject)module0307.UNPROVIDED) || module0307.NIL == module0004.f104(var117, var123, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED)) {
                        SubLObject var124 = var122;
                        SubLObject var125 = (SubLObject)module0307.NIL;
                        var125 = var124.first();
                        while (module0307.NIL != var124) {
                            var120 = ConsesLow.nconc(var120, f20806(var117, var125, var2));
                            var124 = var124.rest();
                            var125 = var124.first();
                        }
                        var124 = var119;
                        var125 = (SubLObject)module0307.NIL;
                        var125 = var124.first();
                        while (module0307.NIL != var124) {
                            if (module0307.NIL != module0202.f12903(var125)) {
                                final SubLObject var126 = module0202.f12832(var125, (SubLObject)module0307.UNPROVIDED);
                                final SubLObject var127 = module0202.f12906(var125);
                                final SubLObject var128 = module0202.f12887(var125);
                                final SubLObject var129 = (module0307.NIL != module0269.f17707(var127)) ? var127 : var2;
                                if (module0307.NIL == module0018.f979() || module0307.NIL != module0269.f17707(var127)) {
                                    var120 = ConsesLow.nconc(var120, f20807(var117, var128, var129, f20804(var126, (SubLObject)module0307.TWO_INTEGER, var129)));
                                }
                            }
                            var120 = ConsesLow.nconc(var120, f20808(var117, var125, var2));
                            var124 = var124.rest();
                            var125 = var124.first();
                        }
                        var120 = module0035.f2273(var120);
                    }
                }
                finally {
                    module0144.$g1801$.rebind(var11_146, var118);
                }
            }
            finally {
                module0144.$g1832$.rebind(var121, var118);
            }
        }
        return var120;
    }
    
    public static SubLObject f20799(final SubLObject var117, final SubLObject var16, final SubLObject var2) {
        final SubLThread var118 = SubLProcess.currentSubLThread();
        final SubLObject var119 = module0232.f15308(var16);
        SubLObject var120 = (SubLObject)module0307.NIL;
        if (module0307.NIL != var119) {
            final SubLObject var121 = module0144.$g1832$.currentBinding(var118);
            try {
                module0144.$g1832$.bind(var117, var118);
                final SubLObject var122 = module0232.f15306(var16);
                final SubLObject var123 = module0204.f13087(var16, module0201.f12583(var117), (SubLObject)module0307.UNPROVIDED);
                final SubLObject var11_147 = module0144.$g1801$.currentBinding(var118);
                try {
                    module0144.$g1801$.bind((SubLObject)SubLObjectFactory.makeBoolean((module0307.NIL != var122 && module0307.NIL != var119) || module0307.NIL != conses_high.second(var122)), var118);
                    if (module0307.NIL != module0035.f2428(var117, var119, Symbols.symbol_function((SubLObject)module0307.EQUAL), (SubLObject)module0307.UNPROVIDED) || module0307.NIL == module0004.f104(var117, var123, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED)) {
                        SubLObject var124 = var122;
                        SubLObject var125 = (SubLObject)module0307.NIL;
                        var125 = var124.first();
                        while (module0307.NIL != var124) {
                            var120 = ConsesLow.nconc(var120, f20809(var117, var125, var2));
                            var124 = var124.rest();
                            var125 = var124.first();
                        }
                        var124 = var119;
                        var125 = (SubLObject)module0307.NIL;
                        var125 = var124.first();
                        while (module0307.NIL != var124) {
                            if (module0307.NIL != module0202.f12903(var125)) {
                                final SubLObject var126 = module0202.f12832(var125, (SubLObject)module0307.UNPROVIDED);
                                final SubLObject var127 = module0202.f12906(var125);
                                final SubLObject var128 = module0202.f12887(var125);
                                final SubLObject var129 = (module0307.NIL != module0269.f17707(var127)) ? var127 : var2;
                                if (module0307.NIL == module0018.f979() || module0307.NIL != module0269.f17707(var127)) {
                                    var120 = ConsesLow.nconc(var120, f20810(var117, var128, var129, f20804(var126, (SubLObject)module0307.TWO_INTEGER, var2)));
                                }
                            }
                            var120 = ConsesLow.nconc(var120, f20811(var117, var125, var2));
                            var124 = var124.rest();
                            var125 = var124.first();
                        }
                        var120 = module0035.f2273(var120);
                    }
                }
                finally {
                    module0144.$g1801$.rebind(var11_147, var118);
                }
            }
            finally {
                module0144.$g1832$.rebind(var121, var118);
            }
        }
        return var120;
    }
    
    public static SubLObject f20793(final SubLObject var117, final SubLObject var5, final SubLObject var137, final SubLObject var2) {
        final SubLThread var138 = SubLProcess.currentSubLThread();
        if (module0307.NIL == var137 && module0307.NIL != module0035.f1997(var5) && module0307.NIL != module0204.f13051(var5.first())) {
            return (SubLObject)module0307.NIL;
        }
        SubLObject var139 = conses_high.assoc(var117, var137, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED).rest();
        final SubLObject var140 = module0144.$g1832$.currentBinding(var138);
        final SubLObject var141 = module0144.$g1848$.currentBinding(var138);
        try {
            module0144.$g1832$.bind(var117, var138);
            module0144.$g1848$.bind(var137, var138);
            SubLObject var142 = var5;
            SubLObject var143 = (SubLObject)module0307.NIL;
            var143 = var142.first();
            while (module0307.NIL != var142) {
                var139 = ConsesLow.nconc(var139, f20812(var117, var143, var2));
                var142 = var142.rest();
                var143 = var142.first();
            }
        }
        finally {
            module0144.$g1848$.rebind(var141, var138);
            module0144.$g1832$.rebind(var140, var138);
        }
        var139 = module0035.f2273(var139);
        return var139;
    }
    
    public static SubLObject f20796(final SubLObject var117, final SubLObject var5, final SubLObject var137, final SubLObject var2) {
        final SubLThread var138 = SubLProcess.currentSubLThread();
        if (module0307.NIL == var137 && module0307.NIL != module0035.f1997(var5) && module0307.NIL != module0204.f13051(var5.first())) {
            return (SubLObject)module0307.NIL;
        }
        SubLObject var139 = conses_high.assoc(var117, var137, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED).rest();
        final SubLObject var140 = module0144.$g1832$.currentBinding(var138);
        final SubLObject var141 = module0144.$g1849$.currentBinding(var138);
        try {
            module0144.$g1832$.bind(var117, var138);
            module0144.$g1849$.bind(var137, var138);
            SubLObject var142 = var5;
            SubLObject var143 = (SubLObject)module0307.NIL;
            var143 = var142.first();
            while (module0307.NIL != var142) {
                var139 = ConsesLow.nconc(var139, f20813(var117, var143, var2));
                var142 = var142.rest();
                var143 = var142.first();
            }
        }
        finally {
            module0144.$g1849$.rebind(var141, var138);
            module0144.$g1832$.rebind(var140, var138);
        }
        var139 = module0035.f2273(var139);
        return var139;
    }
    
    public static SubLObject f20800(final SubLObject var117, final SubLObject var16, final SubLObject var137, final SubLObject var2) {
        final SubLThread var138 = SubLProcess.currentSubLThread();
        SubLObject var139 = conses_high.assoc(var117, var137, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED).rest();
        final SubLObject var140 = module0144.$g1832$.currentBinding(var138);
        final SubLObject var141 = module0144.$g1848$.currentBinding(var138);
        try {
            module0144.$g1832$.bind(var117, var138);
            module0144.$g1848$.bind(var137, var138);
            var139 = ConsesLow.nconc(var139, f20812(var117, var16, var2));
        }
        finally {
            module0144.$g1848$.rebind(var141, var138);
            module0144.$g1832$.rebind(var140, var138);
        }
        var139 = module0035.f2273(var139);
        return var139;
    }
    
    public static SubLObject f20801(final SubLObject var117, final SubLObject var16, final SubLObject var137, final SubLObject var2) {
        final SubLThread var138 = SubLProcess.currentSubLThread();
        SubLObject var139 = conses_high.assoc(var117, var137, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED).rest();
        final SubLObject var140 = module0144.$g1832$.currentBinding(var138);
        final SubLObject var141 = module0144.$g1849$.currentBinding(var138);
        try {
            module0144.$g1832$.bind(var117, var138);
            module0144.$g1849$.bind(var137, var138);
            var139 = ConsesLow.nconc(var139, f20813(var117, var16, var2));
        }
        finally {
            module0144.$g1849$.rebind(var141, var138);
            module0144.$g1832$.rebind(var140, var138);
        }
        var139 = module0035.f2273(var139);
        return var139;
    }
    
    public static SubLObject f20812(final SubLObject var117, final SubLObject var16, final SubLObject var2) {
        final SubLThread var118 = SubLProcess.currentSubLThread();
        if (module0307.NIL != module0204.f13051(var16) && module0307.NIL == module0144.$g1848$.getDynamicValue(var118)) {
            return (SubLObject)module0307.NIL;
        }
        final SubLObject var119 = module0232.f15308(var16);
        SubLObject var120 = (SubLObject)module0307.NIL;
        if (module0307.NIL != var119) {
            final SubLObject var121 = module0232.f15306(var16);
            final SubLObject var122 = module0204.f13087(var16, module0201.f12583(var117), (SubLObject)module0307.UNPROVIDED);
            final SubLObject var123 = module0144.$g1801$.currentBinding(var118);
            try {
                module0144.$g1801$.bind((SubLObject)SubLObjectFactory.makeBoolean((module0307.NIL != var121 && module0307.NIL != var119) || module0307.NIL != conses_high.second(var121)), var118);
                if (module0307.NIL != module0035.f2428(var117, var119, Symbols.symbol_function((SubLObject)module0307.EQUAL), (SubLObject)module0307.UNPROVIDED) || module0307.NIL == module0004.f104(var117, var122, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED)) {
                    SubLObject var124 = var121;
                    SubLObject var125 = (SubLObject)module0307.NIL;
                    var125 = var124.first();
                    while (module0307.NIL != var124) {
                        var120 = ConsesLow.nconc(var120, f20814(var117, var125, var2));
                        var124 = var124.rest();
                        var125 = var124.first();
                    }
                    var124 = var119;
                    var125 = (SubLObject)module0307.NIL;
                    var125 = var124.first();
                    while (module0307.NIL != var124) {
                        if (module0307.NIL != module0202.f12903(var125)) {
                            final SubLObject var126 = module0202.f12832(var125, (SubLObject)module0307.UNPROVIDED);
                            final SubLObject var127 = module0202.f12906(var125);
                            final SubLObject var128 = module0202.f12887(var125);
                            final SubLObject var129 = (module0307.NIL != module0269.f17707(var127)) ? var127 : var2;
                            if (module0307.NIL == module0018.f979() || module0307.NIL != module0269.f17707(var127)) {
                                var120 = ConsesLow.nconc(var120, f20815(var117, var128, var129, f20804(var126, (SubLObject)module0307.TWO_INTEGER, var129)));
                            }
                        }
                        var120 = ConsesLow.nconc(var120, f20816(var117, var125, var2));
                        var124 = var124.rest();
                        var125 = var124.first();
                    }
                    var120 = module0035.f2273(var120);
                }
            }
            finally {
                module0144.$g1801$.rebind(var123, var118);
            }
        }
        return var120;
    }
    
    public static SubLObject f20813(final SubLObject var117, final SubLObject var16, final SubLObject var2) {
        final SubLThread var118 = SubLProcess.currentSubLThread();
        if (module0307.NIL != module0204.f13051(var16) && module0307.NIL == module0144.$g1849$.getDynamicValue(var118)) {
            return (SubLObject)module0307.NIL;
        }
        final SubLObject var119 = module0232.f15308(var16);
        SubLObject var120 = (SubLObject)module0307.NIL;
        if (module0307.NIL != var119) {
            final SubLObject var121 = module0232.f15306(var16);
            final SubLObject var122 = module0204.f13087(var16, module0201.f12583(var117), (SubLObject)module0307.UNPROVIDED);
            final SubLObject var123 = module0144.$g1801$.currentBinding(var118);
            try {
                module0144.$g1801$.bind((SubLObject)SubLObjectFactory.makeBoolean((module0307.NIL != var121 && module0307.NIL != var119) || module0307.NIL != conses_high.second(var121)), var118);
                if (module0307.NIL != module0035.f2428(var117, var119, Symbols.symbol_function((SubLObject)module0307.EQUAL), (SubLObject)module0307.UNPROVIDED) || module0307.NIL == module0004.f104(var117, var122, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED)) {
                    SubLObject var124 = var121;
                    SubLObject var125 = (SubLObject)module0307.NIL;
                    var125 = var124.first();
                    while (module0307.NIL != var124) {
                        var120 = ConsesLow.nconc(var120, f20817(var117, var125, var2));
                        var124 = var124.rest();
                        var125 = var124.first();
                    }
                    var124 = var119;
                    var125 = (SubLObject)module0307.NIL;
                    var125 = var124.first();
                    while (module0307.NIL != var124) {
                        if (module0307.NIL != module0202.f12903(var125)) {
                            final SubLObject var126 = module0202.f12832(var125, (SubLObject)module0307.UNPROVIDED);
                            final SubLObject var127 = module0202.f12906(var125);
                            final SubLObject var128 = module0202.f12887(var125);
                            final SubLObject var129 = (module0307.NIL != module0269.f17707(var127)) ? var127 : var2;
                            if (module0307.NIL == module0018.f979() || module0307.NIL != module0269.f17707(var127)) {
                                var120 = ConsesLow.nconc(var120, f20818(var117, var128, var129, f20804(var126, (SubLObject)module0307.TWO_INTEGER, var129)));
                            }
                        }
                        var120 = ConsesLow.nconc(var120, f20819(var117, var125, var2));
                        var124 = var124.rest();
                        var125 = var124.first();
                    }
                    var120 = module0035.f2273(var120);
                }
            }
            finally {
                module0144.$g1801$.rebind(var123, var118);
            }
        }
        return var120;
    }
    
    public static SubLObject f20785(final SubLObject var5, final SubLObject var90, final SubLObject var2, SubLObject var9) {
        if (var9 == module0307.UNPROVIDED) {
            var9 = (SubLObject)module0307.$ic2$;
        }
        SubLObject var91 = var5;
        SubLObject var92 = (SubLObject)module0307.NIL;
        var92 = var91.first();
        while (module0307.NIL != var91) {
            if (module0307.NIL == f20789(var92, var90, var2, var9)) {
                return (SubLObject)module0307.NIL;
            }
            var91 = var91.rest();
            var92 = var91.first();
        }
        return (SubLObject)module0307.T;
    }
    
    public static SubLObject f20789(final SubLObject var16, final SubLObject var90, final SubLObject var2, SubLObject var9) {
        if (var9 == module0307.UNPROVIDED) {
            var9 = (SubLObject)module0307.$ic2$;
        }
        final SubLThread var91 = SubLProcess.currentSubLThread();
        SubLObject var92 = (SubLObject)module0307.NIL;
        if (module0307.NIL != var90 && module0307.NIL != module0144.$g1755$.getDynamicValue(var91) && module0307.NIL == module0204.f13051(var16)) {
            final SubLObject var93 = module0147.f9540(var2);
            final SubLObject var94 = module0147.$g2095$.currentBinding(var91);
            final SubLObject var95 = module0147.$g2094$.currentBinding(var91);
            final SubLObject var96 = module0147.$g2096$.currentBinding(var91);
            try {
                module0147.$g2095$.bind(module0147.f9545(var93), var91);
                module0147.$g2094$.bind(module0147.f9546(var93), var91);
                module0147.$g2096$.bind(module0147.f9549(var93), var91);
                SubLObject var97;
                SubLObject var98;
                SubLObject var99;
                SubLObject var100;
                SubLObject var11_154;
                SubLObject var25_155;
                SubLObject var26_156;
                SubLObject var101;
                SubLObject var102;
                SubLObject var150_159;
                SubLObject var103;
                SubLObject var104;
                SubLObject var105;
                SubLObject var158_163;
                SubLObject var150_160;
                SubLObject var106;
                SubLObject var107;
                SubLObject var108;
                SubLObject var109;
                SubLObject var110;
                SubLObject var111;
                SubLObject var112;
                SubLObject var113;
                SubLObject var114;
                SubLObject var115;
                SubLObject var116;
                SubLObject var117;
                SubLObject var118;
                for (var97 = (SubLObject)module0307.NIL, var97 = module0232.f15308(var16); module0307.NIL == var92 && module0307.NIL != var97; var97 = var97.rest()) {
                    var98 = var97.first();
                    var99 = module0205.f13333(var98);
                    var100 = (SubLObject)((module0307.NIL != module0173.f10955(var99)) ? SubLObjectFactory.makeBoolean(module0307.NIL != module0260.f17006(var99, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED) || module0307.NIL != module0260.f17008(var99, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED)) : module0307.NIL);
                    var11_154 = module0144.$g1831$.currentBinding(var91);
                    var25_155 = module0144.$g1843$.currentBinding(var91);
                    var26_156 = module0144.$g1844$.currentBinding(var91);
                    try {
                        module0144.$g1831$.bind(var99, var91);
                        module0144.$g1843$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0307.NIL != module0144.$g1781$.getDynamicValue(var91) && module0307.NIL != var100), var91);
                        module0144.$g1844$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0307.NIL != module0144.$g1782$.getDynamicValue(var91) && module0307.NIL != var100), var91);
                        var101 = (SubLObject)module0307.ZERO_INTEGER;
                        var102 = module0205.f13207(var98, (SubLObject)module0307.$ic28$);
                        for (var150_159 = (SubLObject)module0307.NIL, var150_159 = var102; module0307.NIL == var92 && module0307.NIL != var150_159; var150_159 = var150_159.rest()) {
                            var103 = var150_159.first();
                            var101 = Numbers.add(var101, (SubLObject)module0307.ONE_INTEGER);
                            var104 = module0035.f2293(var90, var103, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED);
                            if (module0307.NIL != var104) {
                                var105 = (SubLObject)module0307.ZERO_INTEGER;
                                var158_163 = module0205.f13207(var98, (SubLObject)module0307.$ic28$);
                                for (var150_160 = (SubLObject)module0307.NIL, var150_160 = var158_163; module0307.NIL == var92 && module0307.NIL != var150_160; var150_160 = var150_160.rest()) {
                                    var106 = var150_160.first();
                                    var105 = Numbers.add(var105, (SubLObject)module0307.ONE_INTEGER);
                                    if (!var101.numE(var105) && module0307.NIL != module0202.f12689(var106, var9)) {
                                        var107 = (SubLObject)module0307.NIL;
                                        if (module0307.NIL == var92) {
                                            var108 = var104;
                                            var109 = (SubLObject)module0307.NIL;
                                            var109 = var108.first();
                                            while (module0307.NIL == var92 && module0307.NIL != var108) {
                                                var110 = f20820(var99, var105, var109, var101);
                                                if (var110.isVector()) {
                                                    var111 = var110;
                                                    var112 = (SubLObject)module0307.NIL;
                                                    for (var113 = Sequences.length(var111), var114 = (SubLObject)module0307.NIL, var114 = (SubLObject)module0307.ZERO_INTEGER; var114.numL(var113); var114 = Numbers.add(var114, (SubLObject)module0307.ONE_INTEGER)) {
                                                        var115 = ((module0307.NIL != var112) ? Numbers.subtract(var113, var114, (SubLObject)module0307.ONE_INTEGER) : var114);
                                                        var116 = Vectors.aref(var111, var115);
                                                        var107 = (SubLObject)ConsesLow.cons(var116, var107);
                                                    }
                                                }
                                                else {
                                                    var117 = var110;
                                                    var118 = (SubLObject)module0307.NIL;
                                                    var118 = var117.first();
                                                    while (module0307.NIL != var117) {
                                                        var107 = (SubLObject)ConsesLow.cons(var118, var107);
                                                        var117 = var117.rest();
                                                        var118 = var117.first();
                                                    }
                                                }
                                                var108 = var108.rest();
                                                var109 = var108.first();
                                            }
                                        }
                                        if (module0307.NIL != module0259.f16910(var106, var107, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED)) {
                                            module0303.f20203((SubLObject)ConsesLow.list((SubLObject)module0307.$ic29$, var106, ConsesLow.append(var107, module0259.f16821(var106, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED)), var2));
                                            var92 = (SubLObject)module0307.T;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    finally {
                        module0144.$g1844$.rebind(var26_156, var91);
                        module0144.$g1843$.rebind(var25_155, var91);
                        module0144.$g1831$.rebind(var11_154, var91);
                    }
                }
            }
            finally {
                module0147.$g2096$.rebind(var96, var91);
                module0147.$g2094$.rebind(var95, var91);
                module0147.$g2095$.rebind(var94, var91);
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0307.NIL == var92);
    }
    
    public static SubLObject f20771(final SubLObject var23, final SubLObject var2, SubLObject var9) {
        if (var9 == module0307.UNPROVIDED) {
            var9 = (SubLObject)module0307.$ic2$;
        }
        SubLObject var24 = (SubLObject)module0307.NIL;
        SubLObject var25 = var23;
        SubLObject var26 = (SubLObject)module0307.NIL;
        var26 = var25.first();
        while (module0307.NIL != var25) {
            final SubLObject var27 = f20821(var26, var2, var9);
            if (module0307.NIL != var27) {
                var24 = (SubLObject)ConsesLow.cons(var27, var24);
            }
            var25 = var25.rest();
            var26 = var25.first();
        }
        if (module0307.NIL == var24) {
            return (SubLObject)module0307.NIL;
        }
        if (module0307.NIL != module0035.f1997(var24)) {
            return var24.first();
        }
        return module0276.f18305(module0276.f18280(Sequences.nreverse(var24), (SubLObject)module0307.UNPROVIDED), var9);
    }
    
    public static SubLObject f20773(final SubLObject var23, final SubLObject var2, SubLObject var9) {
        if (var9 == module0307.UNPROVIDED) {
            var9 = (SubLObject)module0307.$ic2$;
        }
        final SubLObject var24 = Sequences.nreverse(module0035.f2399(var23, var9, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED));
        final SubLObject var25 = Hashtables.make_hash_table(Sequences.length(var24), (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED);
        final SubLObject var26 = Hashtables.make_hash_table(Sequences.length(var24), (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED);
        SubLObject var27 = (SubLObject)module0307.NIL;
        SubLObject var28 = var23;
        SubLObject var29 = (SubLObject)module0307.NIL;
        var29 = var28.first();
        while (module0307.NIL != var28) {
            SubLObject var19_175 = f20822(var29, var2, var9);
            SubLObject var30 = (SubLObject)module0307.NIL;
            var30 = var19_175.first();
            while (module0307.NIL != var19_175) {
                final SubLObject var31 = var30.first();
                final SubLObject var32 = var30.rest();
                Hashtables.sethash(var31, var25, ConsesLow.append(var32, Hashtables.gethash(var31, var25, (SubLObject)module0307.UNPROVIDED)));
                var19_175 = var19_175.rest();
                var30 = var19_175.first();
            }
            SubLObject var19_176 = f20823(var29, var2, var9);
            SubLObject var33 = (SubLObject)module0307.NIL;
            var33 = var19_176.first();
            while (module0307.NIL != var19_176) {
                final SubLObject var31 = var33.first();
                final SubLObject var34 = var33.rest();
                Hashtables.sethash(var31, var26, ConsesLow.append(var34, Hashtables.gethash(var31, var26, (SubLObject)module0307.UNPROVIDED)));
                var19_176 = var19_176.rest();
                var33 = var19_176.first();
            }
            var28 = var28.rest();
            var29 = var28.first();
        }
        SubLObject var35 = (SubLObject)module0307.NIL;
        SubLObject var36 = (SubLObject)module0307.NIL;
        Iterator var37 = Hashtables.getEntrySetIterator(var25);
        try {
            while (Hashtables.iteratorHasNext(var37)) {
                final Map.Entry var38 = Hashtables.iteratorNextEntry(var37);
                var35 = Hashtables.getEntryKey(var38);
                var36 = Hashtables.getEntryValue(var38);
                SubLObject var39 = module0256.f16538(Sequences.remove_duplicates(var36, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED), var2, (SubLObject)module0307.UNPROVIDED);
                SubLObject var40 = (SubLObject)module0307.NIL;
                var40 = var39.first();
                while (module0307.NIL != var39) {
                    var27 = (SubLObject)ConsesLow.cons(module0202.f12768(module0307.$ic21$, var35, var40), var27);
                    var39 = var39.rest();
                    var40 = var39.first();
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var37);
        }
        var35 = (SubLObject)module0307.NIL;
        SubLObject var41 = (SubLObject)module0307.NIL;
        var37 = Hashtables.getEntrySetIterator(var26);
        try {
            while (Hashtables.iteratorHasNext(var37)) {
                final Map.Entry var38 = Hashtables.iteratorNextEntry(var37);
                var35 = Hashtables.getEntryKey(var38);
                var41 = Hashtables.getEntryValue(var38);
                SubLObject var39 = module0256.f16538(Sequences.remove_duplicates(var41, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED), var2, (SubLObject)module0307.UNPROVIDED);
                SubLObject var42 = (SubLObject)module0307.NIL;
                var42 = var39.first();
                while (module0307.NIL != var39) {
                    var27 = (SubLObject)ConsesLow.cons(module0202.f12768(module0307.$ic22$, var35, var42), var27);
                    var39 = var39.rest();
                    var42 = var39.first();
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var37);
        }
        if (module0307.NIL == var27) {
            return (SubLObject)module0307.NIL;
        }
        if (module0307.NIL != module0035.f1997(var27)) {
            return var27.first();
        }
        return module0276.f18304(module0276.f18287(Sequences.nreverse(var27), (SubLObject)module0307.UNPROVIDED), var9);
    }
    
    public static SubLObject f20821(final SubLObject var81, final SubLObject var2, SubLObject var9) {
        if (var9 == module0307.UNPROVIDED) {
            var9 = (SubLObject)module0307.$ic2$;
        }
        SubLObject var82 = (SubLObject)module0307.NIL;
        SubLObject var83 = f20822(var81, var2, var9);
        SubLObject var84 = (SubLObject)module0307.NIL;
        var84 = var83.first();
        while (module0307.NIL != var83) {
            final SubLObject var85 = var84.first();
            final SubLObject var86 = var84.rest();
            SubLObject var19_177 = Sequences.reverse(var86);
            SubLObject var87 = (SubLObject)module0307.NIL;
            var87 = var19_177.first();
            while (module0307.NIL != var19_177) {
                var82 = (SubLObject)ConsesLow.cons(module0202.f12768(module0307.$ic21$, var85, var87), var82);
                var19_177 = var19_177.rest();
                var87 = var19_177.first();
            }
            var83 = var83.rest();
            var84 = var83.first();
        }
        var83 = f20823(var81, var2, var9);
        SubLObject var88 = (SubLObject)module0307.NIL;
        var88 = var83.first();
        while (module0307.NIL != var83) {
            final SubLObject var85 = var88.first();
            final SubLObject var89 = var88.rest();
            SubLObject var19_178 = Sequences.reverse(var89);
            SubLObject var90 = (SubLObject)module0307.NIL;
            var90 = var19_178.first();
            while (module0307.NIL != var19_178) {
                var82 = (SubLObject)ConsesLow.cons(module0202.f12768(module0307.$ic22$, var85, var90), var82);
                var19_178 = var19_178.rest();
                var90 = var19_178.first();
            }
            var83 = var83.rest();
            var88 = var83.first();
        }
        if (module0307.NIL == var82) {
            return (SubLObject)module0307.NIL;
        }
        if (module0307.NIL != module0035.f1997(var82)) {
            return var82.first();
        }
        return module0276.f18287(Sequences.nreverse(var82), (SubLObject)module0307.UNPROVIDED);
    }
    
    public static SubLObject f20758(final SubLObject var23, final SubLObject var2, SubLObject var9) {
        if (var9 == module0307.UNPROVIDED) {
            var9 = (SubLObject)module0307.$ic2$;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0307.NIL != f20784(f20824(var23, var2, var9), (SubLObject)module0307.$ic25$, var2) && module0307.NIL != f20784(f20825(var23, var2, var9), (SubLObject)module0307.$ic27$, var2));
    }
    
    public static SubLObject f20824(final SubLObject var23, final SubLObject var2, SubLObject var9) {
        if (var9 == module0307.UNPROVIDED) {
            var9 = (SubLObject)module0307.$ic24$;
        }
        final SubLThread var24 = SubLProcess.currentSubLThread();
        SubLObject var25 = (SubLObject)module0307.NIL;
        SubLObject var26 = (SubLObject)module0307.NIL;
        SubLObject var28;
        final SubLObject var27 = var28 = Sequences.nreverse(module0035.f2399(var23, var9, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED));
        SubLObject var29 = (SubLObject)module0307.NIL;
        var29 = var28.first();
        while (module0307.NIL != var28) {
            final SubLObject var30 = f20777(f20826(var29, var23, var2), var2);
            var26 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var29, var30), var26);
            var28 = var28.rest();
            var29 = var28.first();
        }
        if (module0307.NIL != var26 && module0307.NIL != module0144.$g1755$.getDynamicValue(var24)) {
            var28 = var27;
            var29 = (SubLObject)module0307.NIL;
            var29 = var28.first();
            while (module0307.NIL != var28) {
                final SubLObject var30 = f20777(f20827(var29, var23, var26, var2), var2);
                var25 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var29, var30), var25);
                var28 = var28.rest();
                var29 = var28.first();
            }
        }
        else {
            var25 = var26;
        }
        return var25;
    }
    
    public static SubLObject f20825(final SubLObject var23, final SubLObject var2, SubLObject var9) {
        if (var9 == module0307.UNPROVIDED) {
            var9 = (SubLObject)module0307.$ic24$;
        }
        final SubLThread var24 = SubLProcess.currentSubLThread();
        SubLObject var25 = (SubLObject)module0307.NIL;
        SubLObject var26 = (SubLObject)module0307.NIL;
        SubLObject var28;
        final SubLObject var27 = var28 = Sequences.nreverse(module0035.f2399(var23, var9, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED));
        SubLObject var29 = (SubLObject)module0307.NIL;
        var29 = var28.first();
        while (module0307.NIL != var28) {
            final SubLObject var30 = f20777(f20828(var29, var23, var2), var2);
            var26 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var29, var30), var26);
            var28 = var28.rest();
            var29 = var28.first();
        }
        if (module0307.NIL != var26 && module0307.NIL != module0144.$g1757$.getDynamicValue(var24)) {
            var28 = var27;
            var29 = (SubLObject)module0307.NIL;
            var29 = var28.first();
            while (module0307.NIL != var28) {
                final SubLObject var30 = f20777(f20829(var29, var23, var26, var2), var2);
                var25 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var29, var30), var25);
                var28 = var28.rest();
                var29 = var28.first();
            }
        }
        else {
            var25 = var26;
        }
        return var25;
    }
    
    public static SubLObject f20830(final SubLObject var81, SubLObject var9) {
        if (var9 == module0307.UNPROVIDED) {
            var9 = (SubLObject)module0307.$ic2$;
        }
        SubLObject var82 = (SubLObject)module0307.NIL;
        SubLObject var83 = (SubLObject)module0307.NIL;
        SubLObject var85;
        final SubLObject var84 = var85 = Sequences.nreverse(module0035.f2399(var81, var9, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED));
        SubLObject var86 = (SubLObject)module0307.NIL;
        var86 = var85.first();
        while (module0307.NIL != var85) {
            final SubLObject var88;
            final SubLObject var87 = var88 = f20831(var86, var81);
            if (var88.isVector()) {
                final SubLObject var89 = var88;
                final SubLObject var90 = (SubLObject)module0307.NIL;
                SubLObject var91;
                SubLObject var92;
                SubLObject var93;
                SubLObject var94;
                for (var91 = Sequences.length(var89), var92 = (SubLObject)module0307.NIL, var92 = (SubLObject)module0307.ZERO_INTEGER; var92.numL(var91); var92 = Numbers.add(var92, (SubLObject)module0307.ONE_INTEGER)) {
                    var93 = ((module0307.NIL != var90) ? Numbers.subtract(var91, var92, (SubLObject)module0307.ONE_INTEGER) : var92);
                    var94 = Vectors.aref(var89, var93);
                    var83 = (SubLObject)ConsesLow.cons(var94, var83);
                }
            }
            else {
                SubLObject var19_180 = var88;
                SubLObject var95 = (SubLObject)module0307.NIL;
                var95 = var19_180.first();
                while (module0307.NIL != var19_180) {
                    var83 = (SubLObject)ConsesLow.cons(var95, var83);
                    var19_180 = var19_180.rest();
                    var95 = var19_180.first();
                }
            }
            var85 = var85.rest();
            var86 = var85.first();
        }
        var82 = var83;
        return var82;
    }
    
    public static SubLObject f20832(final SubLObject var117, final SubLObject var23, final SubLObject var2, SubLObject var9) {
        if (var9 == module0307.UNPROVIDED) {
            var9 = (SubLObject)module0307.$ic2$;
        }
        return conses_high.assoc(var117, f20824(var23, var2, var9), (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED).rest();
    }
    
    public static SubLObject f20833(final SubLObject var117, final SubLObject var23, final SubLObject var2, SubLObject var9) {
        if (var9 == module0307.UNPROVIDED) {
            var9 = (SubLObject)module0307.$ic2$;
        }
        return conses_high.assoc(var117, f20825(var23, var2, var9), (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED).rest();
    }
    
    public static SubLObject f20826(final SubLObject var117, final SubLObject var23, final SubLObject var2) {
        SubLObject var118 = (SubLObject)module0307.NIL;
        SubLObject var119 = var23;
        SubLObject var120 = (SubLObject)module0307.NIL;
        var120 = var119.first();
        while (module0307.NIL != var119) {
            var118 = ConsesLow.nconc(var118, f20834(var117, var120, var2));
            var119 = var119.rest();
            var120 = var119.first();
        }
        var118 = module0035.f2273(var118);
        return var118;
    }
    
    public static SubLObject f20835(final SubLObject var117, final SubLObject var23, final SubLObject var2) {
        SubLObject var118 = (SubLObject)module0307.NIL;
        SubLObject var119 = var23;
        SubLObject var120 = (SubLObject)module0307.NIL;
        var120 = var119.first();
        while (module0307.NIL != var119) {
            var118 = ConsesLow.nconc(var118, f20836(var117, var120, var2));
            var119 = var119.rest();
            var120 = var119.first();
        }
        var118 = module0035.f2273(var118);
        return var118;
    }
    
    public static SubLObject f20828(final SubLObject var117, final SubLObject var23, final SubLObject var2) {
        SubLObject var118 = (SubLObject)module0307.NIL;
        SubLObject var119 = var23;
        SubLObject var120 = (SubLObject)module0307.NIL;
        var120 = var119.first();
        while (module0307.NIL != var119) {
            var118 = ConsesLow.nconc(var118, f20837(var117, var120, var2));
            var119 = var119.rest();
            var120 = var119.first();
        }
        var118 = module0035.f2273(var118);
        return var118;
    }
    
    public static SubLObject f20822(final SubLObject var81, final SubLObject var2, SubLObject var9) {
        if (var9 == module0307.UNPROVIDED) {
            var9 = (SubLObject)module0307.$ic24$;
        }
        final SubLThread var82 = SubLProcess.currentSubLThread();
        SubLObject var83 = (SubLObject)module0307.NIL;
        SubLObject var84 = (SubLObject)module0307.NIL;
        SubLObject var86;
        final SubLObject var85 = var86 = Sequences.nreverse(module0035.f2399(var81, var9, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED));
        SubLObject var87 = (SubLObject)module0307.NIL;
        var87 = var86.first();
        while (module0307.NIL != var86) {
            final SubLObject var88 = f20777(f20834(var87, var81, var2), var2);
            var84 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var87, var88), var84);
            var86 = var86.rest();
            var87 = var86.first();
        }
        if (module0307.NIL != var84 && module0307.NIL != module0144.$g1755$.getDynamicValue(var82)) {
            var86 = var85;
            var87 = (SubLObject)module0307.NIL;
            var87 = var86.first();
            while (module0307.NIL != var86) {
                final SubLObject var88 = f20777(f20838(var87, var81, var84, var2), var2);
                var83 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var87, var88), var83);
                var86 = var86.rest();
                var87 = var86.first();
            }
        }
        else {
            var83 = var84;
        }
        return var83;
    }
    
    public static SubLObject f20839(final SubLObject var81, final SubLObject var2, SubLObject var9) {
        if (var9 == module0307.UNPROVIDED) {
            var9 = (SubLObject)module0307.$ic24$;
        }
        SubLObject var82 = (SubLObject)module0307.NIL;
        SubLObject var83 = (SubLObject)module0307.NIL;
        SubLObject var85;
        final SubLObject var84 = var85 = Sequences.nreverse(module0035.f2399(var81, var9, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED));
        SubLObject var86 = (SubLObject)module0307.NIL;
        var86 = var85.first();
        while (module0307.NIL != var85) {
            final SubLObject var87 = f20777(f20836(var86, var81, var2), var2);
            var83 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var86, var87), var83);
            var85 = var85.rest();
            var86 = var85.first();
        }
        var82 = var83;
        return var82;
    }
    
    public static SubLObject f20823(final SubLObject var81, final SubLObject var2, SubLObject var9) {
        if (var9 == module0307.UNPROVIDED) {
            var9 = (SubLObject)module0307.$ic24$;
        }
        final SubLThread var82 = SubLProcess.currentSubLThread();
        SubLObject var83 = (SubLObject)module0307.NIL;
        SubLObject var84 = (SubLObject)module0307.NIL;
        SubLObject var86;
        final SubLObject var85 = var86 = Sequences.nreverse(module0035.f2399(var81, var9, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED));
        SubLObject var87 = (SubLObject)module0307.NIL;
        var87 = var86.first();
        while (module0307.NIL != var86) {
            final SubLObject var88 = f20777(f20837(var87, var81, var2), var2);
            var84 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var87, var88), var84);
            var86 = var86.rest();
            var87 = var86.first();
        }
        if (module0307.NIL != var84 && module0307.NIL != module0144.$g1757$.getDynamicValue(var82)) {
            var86 = var85;
            var87 = (SubLObject)module0307.NIL;
            var87 = var86.first();
            while (module0307.NIL != var86) {
                final SubLObject var88 = f20777(f20840(var87, var81, var84, var2), var2);
                var83 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var87, var88), var83);
                var86 = var86.rest();
                var87 = var86.first();
            }
        }
        else {
            var83 = var84;
        }
        return var83;
    }
    
    public static SubLObject f20834(final SubLObject var117, final SubLObject var81, final SubLObject var2) {
        final SubLThread var118 = SubLProcess.currentSubLThread();
        final SubLObject var119 = module0232.f15308(var81);
        SubLObject var120 = (SubLObject)module0307.NIL;
        if (module0307.NIL != var119) {
            final SubLObject var121 = module0144.$g1832$.currentBinding(var118);
            try {
                module0144.$g1832$.bind(var117, var118);
                final SubLObject var122 = module0232.f15306(var81);
                final SubLObject var123 = module0204.f13087(var81, module0201.f12583(var117), (SubLObject)module0307.UNPROVIDED);
                final SubLObject var11_181 = module0144.$g1801$.currentBinding(var118);
                try {
                    module0144.$g1801$.bind((SubLObject)SubLObjectFactory.makeBoolean((module0307.NIL != var122 && module0307.NIL != var119) || module0307.NIL != conses_high.second(var122) || module0307.NIL != conses_high.second(var119)), var118);
                    if (module0307.NIL != module0035.f2428(var117, var119, Symbols.symbol_function((SubLObject)module0307.EQUAL), (SubLObject)module0307.UNPROVIDED) || module0307.NIL == module0004.f104(var117, var123, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED)) {
                        SubLObject var124 = var122;
                        SubLObject var125 = (SubLObject)module0307.NIL;
                        var125 = var124.first();
                        while (module0307.NIL != var124) {
                            var120 = ConsesLow.nconc(var120, f20841(var117, var125, var2));
                            var124 = var124.rest();
                            var125 = var124.first();
                        }
                        var124 = var119;
                        var125 = (SubLObject)module0307.NIL;
                        var125 = var124.first();
                        while (module0307.NIL != var124) {
                            if (module0307.NIL != module0202.f12903(var125)) {
                                final SubLObject var126 = module0202.f12832(var125, (SubLObject)module0307.UNPROVIDED);
                                final SubLObject var127 = module0202.f12906(var125);
                                final SubLObject var128 = module0202.f12887(var125);
                                final SubLObject var129 = (module0307.NIL != module0269.f17707(var127)) ? var127 : var2;
                                if (module0307.NIL == module0018.f979() || module0307.NIL != module0269.f17707(var127)) {
                                    var120 = ConsesLow.nconc(var120, f20803(var117, var128, var129, f20804(var126, (SubLObject)module0307.TWO_INTEGER, var129)));
                                }
                            }
                            var120 = ConsesLow.nconc(var120, f20842(var117, var125, var2));
                            var124 = var124.rest();
                            var125 = var124.first();
                        }
                        if (module0307.NIL != Sequences.find_if((SubLObject)module0307.$ic30$, var119, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED)) {
                            var124 = module0035.remove_if_not((SubLObject)module0307.$ic30$, var119, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED);
                            SubLObject var130 = (SubLObject)module0307.NIL;
                            var130 = var124.first();
                            while (module0307.NIL != var124) {
                                final SubLObject var131 = module0205.f13387(var130, (SubLObject)module0307.UNPROVIDED);
                                if (var117.eql(var131)) {
                                    final SubLObject var132 = module0205.f13388(var130, (SubLObject)module0307.UNPROVIDED);
                                    SubLObject var19_185 = var119;
                                    SubLObject var133 = (SubLObject)module0307.NIL;
                                    var133 = var19_185.first();
                                    while (module0307.NIL != var19_185) {
                                        if (module0307.NIL != module0202.f12865(var133)) {
                                            final SubLObject var134 = module0205.f13387(var133, (SubLObject)module0307.UNPROVIDED);
                                            if (var132.eql(var134)) {
                                                final SubLObject var135 = module0205.f13388(var133, (SubLObject)module0307.UNPROVIDED);
                                                if (module0307.NIL != module0173.f10955(var135)) {
                                                    var120 = (SubLObject)ConsesLow.cons(var135, var120);
                                                }
                                            }
                                        }
                                        var19_185 = var19_185.rest();
                                        var133 = var19_185.first();
                                    }
                                }
                                var124 = var124.rest();
                                var130 = var124.first();
                            }
                        }
                        var120 = module0035.f2273(var120);
                    }
                }
                finally {
                    module0144.$g1801$.rebind(var11_181, var118);
                }
            }
            finally {
                module0144.$g1832$.rebind(var121, var118);
            }
        }
        return var120;
    }
    
    public static SubLObject f20831(final SubLObject var117, final SubLObject var189) {
        final SubLThread var190 = SubLProcess.currentSubLThread();
        final SubLObject var191 = module0232.f15308(var189);
        final SubLObject var192 = module0067.f4880(Symbols.symbol_function((SubLObject)module0307.EQUAL), (SubLObject)module0307.UNPROVIDED);
        if (module0307.NIL != var191) {
            final SubLObject var193 = module0144.$g1832$.currentBinding(var190);
            try {
                module0144.$g1832$.bind(var117, var190);
                final SubLObject var194 = module0232.f15306(var189);
                final SubLObject var195 = module0204.f13087(var189, module0201.f12583(var117), (SubLObject)module0307.UNPROVIDED);
                final SubLObject var11_191 = module0144.$g1801$.currentBinding(var190);
                try {
                    module0144.$g1801$.bind((SubLObject)SubLObjectFactory.makeBoolean((module0307.NIL != var194 && module0307.NIL != var191) || module0307.NIL != conses_high.second(var194) || module0307.NIL != conses_high.second(var191)), var190);
                    if (module0307.NIL != module0035.f2428(var117, var191, Symbols.symbol_function((SubLObject)module0307.EQUAL), (SubLObject)module0307.UNPROVIDED) || module0307.NIL == module0004.f104(var117, var195, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED)) {
                        SubLObject var196 = var194;
                        SubLObject var197 = (SubLObject)module0307.NIL;
                        var197 = var196.first();
                        while (module0307.NIL != var196) {
                            SubLObject var199;
                            final SubLObject var198 = var199 = var197;
                            SubLObject var200 = (SubLObject)module0307.NIL;
                            SubLObject var201 = (SubLObject)module0307.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var199, var198, (SubLObject)module0307.$ic31$);
                            var200 = var199.first();
                            var199 = var199.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var199, var198, (SubLObject)module0307.$ic31$);
                            var201 = var199.first();
                            var199 = var199.rest();
                            if (module0307.NIL == var199) {
                                SubLObject var19_195 = f20841(var117, var201, var200);
                                SubLObject var202 = (SubLObject)module0307.NIL;
                                var202 = var19_195.first();
                                while (module0307.NIL != var19_195) {
                                    module0084.f5762(var192, var200, var202);
                                    var19_195 = var19_195.rest();
                                    var202 = var19_195.first();
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var198, (SubLObject)module0307.$ic31$);
                            }
                            var196 = var196.rest();
                            var197 = var196.first();
                        }
                        var196 = var191;
                        var197 = (SubLObject)module0307.NIL;
                        var197 = var196.first();
                        while (module0307.NIL != var196) {
                            SubLObject var204;
                            final SubLObject var203 = var204 = var197;
                            SubLObject var200 = (SubLObject)module0307.NIL;
                            SubLObject var201 = (SubLObject)module0307.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var204, var203, (SubLObject)module0307.$ic31$);
                            var200 = var204.first();
                            var204 = var204.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var204, var203, (SubLObject)module0307.$ic31$);
                            var201 = var204.first();
                            var204 = var204.rest();
                            if (module0307.NIL == var204) {
                                SubLObject var19_196 = f20842(var117, var201, var200);
                                SubLObject var202 = (SubLObject)module0307.NIL;
                                var202 = var19_196.first();
                                while (module0307.NIL != var19_196) {
                                    module0084.f5762(var192, var200, var202);
                                    var19_196 = var19_196.rest();
                                    var202 = var19_196.first();
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var203, (SubLObject)module0307.$ic31$);
                            }
                            var196 = var196.rest();
                            var197 = var196.first();
                        }
                        if (module0307.NIL != Sequences.find_if((SubLObject)module0307.$ic32$, var191, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED)) {
                            var196 = module0035.remove_if_not((SubLObject)module0307.$ic32$, var191, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED);
                            SubLObject var205 = (SubLObject)module0307.NIL;
                            var205 = var196.first();
                            while (module0307.NIL != var196) {
                                SubLObject var207;
                                final SubLObject var206 = var207 = var205;
                                SubLObject var208 = (SubLObject)module0307.NIL;
                                SubLObject var209 = (SubLObject)module0307.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(var207, var206, (SubLObject)module0307.$ic33$);
                                var208 = var207.first();
                                var207 = var207.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(var207, var206, (SubLObject)module0307.$ic33$);
                                var209 = var207.first();
                                var207 = var207.rest();
                                if (module0307.NIL == var207) {
                                    final SubLObject var210 = module0205.f13387(var209, (SubLObject)module0307.UNPROVIDED);
                                    if (var117.eql(var210)) {
                                        final SubLObject var211 = module0205.f13388(var209, (SubLObject)module0307.UNPROVIDED);
                                        SubLObject var19_197 = var191;
                                        SubLObject var212 = (SubLObject)module0307.NIL;
                                        var212 = var19_197.first();
                                        while (module0307.NIL != var19_197) {
                                            SubLObject var206_207;
                                            final SubLObject var204_205 = var206_207 = var212;
                                            SubLObject var213 = (SubLObject)module0307.NIL;
                                            SubLObject var214 = (SubLObject)module0307.NIL;
                                            cdestructuring_bind.destructuring_bind_must_consp(var206_207, var204_205, (SubLObject)module0307.$ic34$);
                                            var213 = var206_207.first();
                                            var206_207 = var206_207.rest();
                                            cdestructuring_bind.destructuring_bind_must_consp(var206_207, var204_205, (SubLObject)module0307.$ic34$);
                                            var214 = var206_207.first();
                                            var206_207 = var206_207.rest();
                                            if (module0307.NIL == var206_207) {
                                                if (module0307.NIL != module0202.f12865(var214)) {
                                                    final SubLObject var215 = module0205.f13387(var214, (SubLObject)module0307.UNPROVIDED);
                                                    if (var211.eql(var215) && module0307.NIL != module0161.f10514(var208, var213)) {
                                                        final SubLObject var216 = module0205.f13388(var214, (SubLObject)module0307.UNPROVIDED);
                                                        if (module0307.NIL != module0173.f10955(var216)) {
                                                            module0084.f5762(var192, var208, var216);
                                                        }
                                                    }
                                                }
                                            }
                                            else {
                                                cdestructuring_bind.cdestructuring_bind_error(var204_205, (SubLObject)module0307.$ic34$);
                                            }
                                            var19_197 = var19_197.rest();
                                            var212 = var19_197.first();
                                        }
                                    }
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(var206, (SubLObject)module0307.$ic33$);
                                }
                                var196 = var196.rest();
                                var205 = var196.first();
                            }
                        }
                    }
                }
                finally {
                    module0144.$g1801$.rebind(var11_191, var190);
                }
            }
            finally {
                module0144.$g1832$.rebind(var193, var190);
            }
        }
        SubLObject var217 = (SubLObject)module0307.NIL;
        SubLObject var218;
        for (var218 = module0066.f4838(module0067.f4891(var192)); module0307.NIL == module0066.f4841(var218); var218 = module0066.f4840(var218)) {
            var190.resetMultipleValues();
            final SubLObject var219 = module0066.f4839(var218);
            final SubLObject var220 = var190.secondMultipleValue();
            var190.resetMultipleValues();
            final SubLObject var221 = f20777(var220, var219);
            var217 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var117, var219, var221), var217);
        }
        module0066.f4842(var218);
        return var217;
    }
    
    public static SubLObject f20843(final SubLObject var210) {
        if (module0307.NIL != module0362.f24432(var210)) {
            final SubLObject var211 = module0362.f24436(var210);
            return module0202.f12862(var211);
        }
        return (SubLObject)module0307.NIL;
    }
    
    public static SubLObject f20836(final SubLObject var117, final SubLObject var81, final SubLObject var2) {
        final SubLThread var118 = SubLProcess.currentSubLThread();
        final SubLObject var119 = module0232.f15308(var81);
        SubLObject var120 = (SubLObject)module0307.NIL;
        if (module0307.NIL != var119) {
            final SubLObject var121 = module0144.$g1832$.currentBinding(var118);
            try {
                module0144.$g1832$.bind(var117, var118);
                final SubLObject var122 = module0232.f15306(var81);
                final SubLObject var123 = module0204.f13087(var81, module0201.f12583(var117), (SubLObject)module0307.UNPROVIDED);
                final SubLObject var11_212 = module0144.$g1801$.currentBinding(var118);
                try {
                    module0144.$g1801$.bind((SubLObject)SubLObjectFactory.makeBoolean((module0307.NIL != var122 && module0307.NIL != var119) || module0307.NIL != conses_high.second(var122) || module0307.NIL != conses_high.second(var119)), var118);
                    if (module0307.NIL != module0035.f2428(var117, var119, Symbols.symbol_function((SubLObject)module0307.EQUAL), (SubLObject)module0307.UNPROVIDED) || module0307.NIL == module0004.f104(var117, var123, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED)) {
                        SubLObject var124 = var122;
                        SubLObject var125 = (SubLObject)module0307.NIL;
                        var125 = var124.first();
                        while (module0307.NIL != var124) {
                            var120 = ConsesLow.nconc(var120, f20844(var117, var125, var2));
                            var124 = var124.rest();
                            var125 = var124.first();
                        }
                        var124 = var119;
                        var125 = (SubLObject)module0307.NIL;
                        var125 = var124.first();
                        while (module0307.NIL != var124) {
                            if (module0307.NIL != module0202.f12903(var125)) {
                                final SubLObject var126 = module0202.f12832(var125, (SubLObject)module0307.UNPROVIDED);
                                final SubLObject var127 = module0202.f12906(var125);
                                final SubLObject var128 = module0202.f12887(var125);
                                final SubLObject var129 = (module0307.NIL != module0269.f17707(var127)) ? var127 : var2;
                                if (module0307.NIL == module0018.f979() || module0307.NIL != module0269.f17707(var127)) {
                                    var120 = ConsesLow.nconc(var120, f20807(var117, var128, var129, f20804(var126, (SubLObject)module0307.TWO_INTEGER, var129)));
                                }
                            }
                            var120 = ConsesLow.nconc(var120, f20845(var117, var125, var2));
                            var124 = var124.rest();
                            var125 = var124.first();
                        }
                        var120 = module0035.f2273(var120);
                    }
                }
                finally {
                    module0144.$g1801$.rebind(var11_212, var118);
                }
            }
            finally {
                module0144.$g1832$.rebind(var121, var118);
            }
        }
        return var120;
    }
    
    public static SubLObject f20837(final SubLObject var117, final SubLObject var81, final SubLObject var2) {
        final SubLThread var118 = SubLProcess.currentSubLThread();
        final SubLObject var119 = module0232.f15308(var81);
        SubLObject var120 = (SubLObject)module0307.NIL;
        if (module0307.NIL != var119) {
            final SubLObject var121 = module0144.$g1832$.currentBinding(var118);
            try {
                module0144.$g1832$.bind(var117, var118);
                final SubLObject var122 = module0232.f15306(var81);
                final SubLObject var123 = module0204.f13087(var81, module0201.f12583(var117), (SubLObject)module0307.UNPROVIDED);
                final SubLObject var11_213 = module0144.$g1801$.currentBinding(var118);
                try {
                    module0144.$g1801$.bind((SubLObject)SubLObjectFactory.makeBoolean((module0307.NIL != var122 && module0307.NIL != var119) || module0307.NIL != conses_high.second(var122) || module0307.NIL != conses_high.second(var119)), var118);
                    if (module0307.NIL != module0035.f2428(var117, var119, Symbols.symbol_function((SubLObject)module0307.EQUAL), (SubLObject)module0307.UNPROVIDED) || module0307.NIL == module0004.f104(var117, var123, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED)) {
                        SubLObject var124 = var122;
                        SubLObject var125 = (SubLObject)module0307.NIL;
                        var125 = var124.first();
                        while (module0307.NIL != var124) {
                            var120 = ConsesLow.nconc(var120, f20846(var117, var125, var2));
                            var124 = var124.rest();
                            var125 = var124.first();
                        }
                        var124 = var119;
                        var125 = (SubLObject)module0307.NIL;
                        var125 = var124.first();
                        while (module0307.NIL != var124) {
                            if (module0307.NIL != module0202.f12903(var125)) {
                                final SubLObject var126 = module0202.f12832(var125, (SubLObject)module0307.UNPROVIDED);
                                final SubLObject var127 = module0202.f12906(var125);
                                final SubLObject var128 = module0202.f12887(var125);
                                final SubLObject var129 = (module0307.NIL != module0269.f17707(var127)) ? var127 : var2;
                                if (module0307.NIL == module0018.f979() || module0307.NIL != module0269.f17707(var127)) {
                                    var120 = ConsesLow.nconc(var120, f20810(var117, var128, var129, f20804(var126, (SubLObject)module0307.TWO_INTEGER, var2)));
                                }
                            }
                            var120 = ConsesLow.nconc(var120, f20847(var117, var125, var2));
                            var124 = var124.rest();
                            var125 = var124.first();
                        }
                        var120 = module0035.f2273(var120);
                    }
                }
                finally {
                    module0144.$g1801$.rebind(var11_213, var118);
                }
            }
            finally {
                module0144.$g1832$.rebind(var121, var118);
            }
        }
        return var120;
    }
    
    public static SubLObject f20827(final SubLObject var117, final SubLObject var23, final SubLObject var137, final SubLObject var2) {
        final SubLThread var138 = SubLProcess.currentSubLThread();
        SubLObject var139 = conses_high.assoc(var117, var137, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED).rest();
        final SubLObject var140 = module0144.$g1832$.currentBinding(var138);
        final SubLObject var141 = module0144.$g1848$.currentBinding(var138);
        try {
            module0144.$g1832$.bind(var117, var138);
            module0144.$g1848$.bind(var137, var138);
            SubLObject var142 = var23;
            SubLObject var143 = (SubLObject)module0307.NIL;
            var143 = var142.first();
            while (module0307.NIL != var142) {
                var139 = ConsesLow.nconc(var139, f20848(var117, var143, var2));
                var142 = var142.rest();
                var143 = var142.first();
            }
        }
        finally {
            module0144.$g1848$.rebind(var141, var138);
            module0144.$g1832$.rebind(var140, var138);
        }
        var139 = module0035.f2273(var139);
        return var139;
    }
    
    public static SubLObject f20829(final SubLObject var117, final SubLObject var23, final SubLObject var137, final SubLObject var2) {
        final SubLThread var138 = SubLProcess.currentSubLThread();
        SubLObject var139 = conses_high.assoc(var117, var137, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED).rest();
        final SubLObject var140 = module0144.$g1832$.currentBinding(var138);
        final SubLObject var141 = module0144.$g1849$.currentBinding(var138);
        try {
            module0144.$g1832$.bind(var117, var138);
            module0144.$g1849$.bind(var137, var138);
            SubLObject var142 = var23;
            SubLObject var143 = (SubLObject)module0307.NIL;
            var143 = var142.first();
            while (module0307.NIL != var142) {
                var139 = ConsesLow.nconc(var139, f20849(var117, var143, var2));
                var142 = var142.rest();
                var143 = var142.first();
            }
        }
        finally {
            module0144.$g1849$.rebind(var141, var138);
            module0144.$g1832$.rebind(var140, var138);
        }
        var139 = module0035.f2273(var139);
        return var139;
    }
    
    public static SubLObject f20838(final SubLObject var117, final SubLObject var81, final SubLObject var137, final SubLObject var2) {
        final SubLThread var138 = SubLProcess.currentSubLThread();
        SubLObject var139 = conses_high.assoc(var117, var137, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED).rest();
        final SubLObject var140 = module0144.$g1832$.currentBinding(var138);
        final SubLObject var141 = module0144.$g1848$.currentBinding(var138);
        try {
            module0144.$g1832$.bind(var117, var138);
            module0144.$g1848$.bind(var137, var138);
            var139 = ConsesLow.nconc(var139, f20848(var117, var81, var2));
        }
        finally {
            module0144.$g1848$.rebind(var141, var138);
            module0144.$g1832$.rebind(var140, var138);
        }
        var139 = module0035.f2273(var139);
        return var139;
    }
    
    public static SubLObject f20840(final SubLObject var117, final SubLObject var81, final SubLObject var137, final SubLObject var2) {
        final SubLThread var138 = SubLProcess.currentSubLThread();
        SubLObject var139 = conses_high.assoc(var117, var137, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED).rest();
        final SubLObject var140 = module0144.$g1832$.currentBinding(var138);
        final SubLObject var141 = module0144.$g1849$.currentBinding(var138);
        try {
            module0144.$g1832$.bind(var117, var138);
            module0144.$g1849$.bind(var137, var138);
            var139 = ConsesLow.nconc(var139, f20849(var117, var81, var2));
        }
        finally {
            module0144.$g1849$.rebind(var141, var138);
            module0144.$g1832$.rebind(var140, var138);
        }
        var139 = module0035.f2273(var139);
        return var139;
    }
    
    public static SubLObject f20848(final SubLObject var117, final SubLObject var81, final SubLObject var2) {
        final SubLThread var118 = SubLProcess.currentSubLThread();
        final SubLObject var119 = module0232.f15308(var81);
        SubLObject var120 = (SubLObject)module0307.NIL;
        if (module0307.NIL != var119) {
            final SubLObject var121 = module0232.f15306(var81);
            final SubLObject var122 = module0204.f13087(var81, module0201.f12583(var117), (SubLObject)module0307.UNPROVIDED);
            final SubLObject var123 = module0144.$g1801$.currentBinding(var118);
            try {
                module0144.$g1801$.bind((SubLObject)SubLObjectFactory.makeBoolean((module0307.NIL != var121 && module0307.NIL != var119) || module0307.NIL != conses_high.second(var121) || module0307.NIL != conses_high.second(var119) || module0307.NIL != module0144.$g1801$.getDynamicValue(var118)), var118);
                if (module0307.NIL != module0035.f2428(var117, var119, Symbols.symbol_function((SubLObject)module0307.EQUAL), (SubLObject)module0307.UNPROVIDED) || module0307.NIL == module0004.f104(var117, var122, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED)) {
                    SubLObject var124 = var121;
                    SubLObject var125 = (SubLObject)module0307.NIL;
                    var125 = var124.first();
                    while (module0307.NIL != var124) {
                        var120 = ConsesLow.nconc(var120, f20814(var117, var125, var2));
                        var124 = var124.rest();
                        var125 = var124.first();
                    }
                    var124 = var119;
                    var125 = (SubLObject)module0307.NIL;
                    var125 = var124.first();
                    while (module0307.NIL != var124) {
                        if (module0307.NIL != module0202.f12903(var125)) {
                            final SubLObject var126 = module0202.f12832(var125, (SubLObject)module0307.UNPROVIDED);
                            final SubLObject var127 = module0202.f12906(var125);
                            final SubLObject var128 = module0202.f12887(var125);
                            final SubLObject var129 = (module0307.NIL != module0269.f17707(var127)) ? var127 : var2;
                            if (module0307.NIL == module0018.f979() || module0307.NIL != module0269.f17707(var127)) {
                                var120 = ConsesLow.nconc(var120, f20815(var117, var128, var129, f20804(var126, (SubLObject)module0307.TWO_INTEGER, var129)));
                            }
                        }
                        var120 = ConsesLow.nconc(var120, f20814(var117, var125, var2));
                        var124 = var124.rest();
                        var125 = var124.first();
                    }
                    var120 = module0035.f2273(var120);
                }
            }
            finally {
                module0144.$g1801$.rebind(var123, var118);
            }
        }
        return var120;
    }
    
    public static SubLObject f20849(final SubLObject var117, final SubLObject var81, final SubLObject var2) {
        final SubLThread var118 = SubLProcess.currentSubLThread();
        final SubLObject var119 = module0232.f15308(var81);
        SubLObject var120 = (SubLObject)module0307.NIL;
        if (module0307.NIL != var119) {
            final SubLObject var121 = module0232.f15306(var81);
            final SubLObject var122 = module0204.f13087(var81, module0201.f12583(var117), (SubLObject)module0307.UNPROVIDED);
            final SubLObject var123 = module0144.$g1801$.currentBinding(var118);
            try {
                module0144.$g1801$.bind((SubLObject)SubLObjectFactory.makeBoolean((module0307.NIL != var121 && module0307.NIL != var119) || module0307.NIL != conses_high.second(var121) || module0307.NIL != conses_high.second(var119)), var118);
                if (module0307.NIL != module0035.f2428(var117, var119, Symbols.symbol_function((SubLObject)module0307.EQUAL), (SubLObject)module0307.UNPROVIDED) || module0307.NIL == module0004.f104(var117, var122, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED)) {
                    SubLObject var124 = var121;
                    SubLObject var125 = (SubLObject)module0307.NIL;
                    var125 = var124.first();
                    while (module0307.NIL != var124) {
                        var120 = ConsesLow.nconc(var120, f20817(var117, var125, var2));
                        var124 = var124.rest();
                        var125 = var124.first();
                    }
                    var124 = var119;
                    var125 = (SubLObject)module0307.NIL;
                    var125 = var124.first();
                    while (module0307.NIL != var124) {
                        if (module0307.NIL != module0202.f12903(var125)) {
                            final SubLObject var126 = module0202.f12832(var125, (SubLObject)module0307.UNPROVIDED);
                            final SubLObject var127 = module0202.f12906(var125);
                            final SubLObject var128 = module0202.f12887(var125);
                            final SubLObject var129 = (module0307.NIL != module0269.f17707(var127)) ? var127 : var2;
                            if (module0307.NIL == module0018.f979() || module0307.NIL != module0269.f17707(var127)) {
                                var120 = ConsesLow.nconc(var120, f20818(var117, var128, var129, f20804(var126, (SubLObject)module0307.TWO_INTEGER, var129)));
                            }
                        }
                        var120 = ConsesLow.nconc(var120, f20817(var117, var125, var2));
                        var124 = var124.rest();
                        var125 = var124.first();
                    }
                    var120 = module0035.f2273(var120);
                }
            }
            finally {
                module0144.$g1801$.rebind(var123, var118);
            }
        }
        return var120;
    }
    
    public static SubLObject f20802(final SubLObject var117, final SubLObject var141, final SubLObject var2) {
        if (module0307.NIL != module0279.f18525()) {
            return f20850(var117, var141, var2);
        }
        return (SubLObject)module0307.NIL;
    }
    
    public static SubLObject f20806(final SubLObject var117, final SubLObject var141, final SubLObject var2) {
        if (module0307.NIL != module0279.f18525()) {
            return f20851(var117, var141, var2);
        }
        return (SubLObject)module0307.NIL;
    }
    
    public static SubLObject f20809(final SubLObject var117, final SubLObject var141, final SubLObject var2) {
        if (module0307.NIL != module0279.f18525()) {
            return f20852(var117, var141, var2);
        }
        return (SubLObject)module0307.NIL;
    }
    
    public static SubLObject f20805(final SubLObject var117, final SubLObject var141, final SubLObject var2) {
        return f20850(var117, var141, var2);
    }
    
    public static SubLObject f20808(final SubLObject var117, final SubLObject var141, final SubLObject var2) {
        return f20851(var117, var141, var2);
    }
    
    public static SubLObject f20811(final SubLObject var117, final SubLObject var141, final SubLObject var2) {
        return f20852(var117, var141, var2);
    }
    
    public static SubLObject f20841(final SubLObject var117, final SubLObject var141, final SubLObject var2) {
        if (module0307.NIL != module0279.f18525()) {
            return f20853(var117, var141, var2);
        }
        return (SubLObject)module0307.NIL;
    }
    
    public static SubLObject f20844(final SubLObject var117, final SubLObject var141, final SubLObject var2) {
        if (module0307.NIL != module0279.f18525()) {
            return f20854(var117, var141, var2);
        }
        return (SubLObject)module0307.NIL;
    }
    
    public static SubLObject f20846(final SubLObject var117, final SubLObject var141, final SubLObject var2) {
        if (module0307.NIL != module0279.f18525()) {
            return f20855(var117, var141, var2);
        }
        return (SubLObject)module0307.NIL;
    }
    
    public static SubLObject f20842(final SubLObject var117, final SubLObject var141, final SubLObject var2) {
        return f20850(var117, var141, var2);
    }
    
    public static SubLObject f20845(final SubLObject var117, final SubLObject var141, final SubLObject var2) {
        return f20851(var117, var141, var2);
    }
    
    public static SubLObject f20847(final SubLObject var117, final SubLObject var141, final SubLObject var2) {
        return f20852(var117, var141, var2);
    }
    
    public static SubLObject f20856(final SubLObject var1) {
        if (module0307.NIL != module0210.f13589(var1)) {
            return module0287.f19154(var1);
        }
        return var1;
    }
    
    public static SubLObject f20850(final SubLObject var117, final SubLObject var141, final SubLObject var2) {
        final SubLThread var142 = SubLProcess.currentSubLThread();
        SubLObject var143 = f20853(var117, var141, var2);
        if (module0307.NIL != module0144.$g1783$.getDynamicValue(var142) && module0307.NIL != module0202.f12859(var141)) {
            final SubLObject var144 = f20856(module0202.f12834(var141, (SubLObject)module0307.UNPROVIDED));
            final SubLObject var145 = module0205.f13327(module0202.f12835(var141, (SubLObject)module0307.UNPROVIDED));
            if (var117.eql(var144)) {
                if (module0307.NIL != module0269.f17705(var145)) {
                    var143 = (SubLObject)ConsesLow.cons(var145, var143);
                }
                else if (module0307.NIL != module0210.f13598(var145)) {
                    if (module0307.NIL != module0202.f12689(var145, (SubLObject)module0307.UNPROVIDED)) {
                        var143 = ConsesLow.nconc(var143, module0226.f15016(var145, var2));
                    }
                    else {
                        var143 = ConsesLow.nconc(var143, module0226.f15018(var145, var2));
                    }
                }
            }
        }
        else if (module0307.NIL != module0202.f12871(var141) || module0307.NIL != module0202.f12877(var141, (SubLObject)module0307.UNPROVIDED)) {
            final SubLObject var144 = f20856(module0202.f12834(var141, (SubLObject)module0307.UNPROVIDED));
            if (var117.eql(var144)) {
                var143 = ConsesLow.nconc(var143, module0226.f14990(module0205.f13276(module0202.f12835(var141, (SubLObject)module0307.UNPROVIDED)), var2));
            }
        }
        var143 = module0035.f2273(var143);
        return var143;
    }
    
    public static SubLObject f20851(final SubLObject var117, final SubLObject var141, final SubLObject var2) {
        final SubLThread var142 = SubLProcess.currentSubLThread();
        SubLObject var143 = f20854(var117, var141, var2);
        if (module0307.NIL != module0144.$g1783$.getDynamicValue(var142) && module0307.NIL != module0202.f12864(var141)) {
            final SubLObject var144 = f20856(module0202.f12834(var141, (SubLObject)module0307.UNPROVIDED));
            final SubLObject var145 = module0205.f13327(module0202.f12835(var141, (SubLObject)module0307.UNPROVIDED));
            if (var117.eql(var144)) {
                if (module0307.NIL != module0269.f17705(var145)) {
                    var143 = (SubLObject)ConsesLow.cons(var145, var143);
                }
            }
        }
        else if (module0307.NIL != module0202.f12871(var141) || module0307.NIL != module0202.f12877(var141, (SubLObject)module0307.UNPROVIDED)) {
            final SubLObject var144 = f20856(module0202.f12834(var141, (SubLObject)module0307.UNPROVIDED));
            if (var117.eql(var144)) {
                final SubLObject var146 = module0205.f13276(module0202.f12835(var141, (SubLObject)module0307.UNPROVIDED));
                final SubLObject var147 = module0226.f14993(var146, var2);
                final SubLObject var148 = module0226.f14996(var146, var2);
                var143 = ConsesLow.nconc(var143, var147, var148);
            }
        }
        var143 = module0035.f2273(var143);
        return var143;
    }
    
    public static SubLObject f20852(final SubLObject var117, final SubLObject var141, final SubLObject var2) {
        final SubLThread var142 = SubLProcess.currentSubLThread();
        SubLObject var143 = f20855(var117, var141, var2);
        if (module0307.NIL != module0144.$g1784$.getDynamicValue(var142) && module0307.NIL != module0202.f12865(var141)) {
            final SubLObject var144 = f20856(module0202.f12834(var141, (SubLObject)module0307.UNPROVIDED));
            final SubLObject var145 = module0205.f13327(module0202.f12835(var141, (SubLObject)module0307.UNPROVIDED));
            if (var117.eql(var144)) {
                if (module0307.NIL != module0269.f17705(var145)) {
                    var143 = (SubLObject)ConsesLow.cons(var145, var143);
                }
                else if (module0307.NIL != module0210.f13598(var145)) {
                    var143 = ConsesLow.nconc(var143, module0226.f15014(module0205.f13276(var145), var2, (SubLObject)module0307.UNPROVIDED));
                }
            }
        }
        else if (module0307.NIL != module0202.f12871(var141) || module0307.NIL != module0202.f12877(var141, (SubLObject)module0307.UNPROVIDED)) {
            final SubLObject var144 = f20856(module0202.f12834(var141, (SubLObject)module0307.UNPROVIDED));
            if (var117.eql(var144)) {
                var143 = ConsesLow.nconc(var143, module0226.f15014(module0205.f13276(module0202.f12835(var141, (SubLObject)module0307.UNPROVIDED)), var2, (SubLObject)module0307.UNPROVIDED));
            }
        }
        var143 = module0035.f2273(var143);
        return var143;
    }
    
    public static SubLObject f20853(final SubLObject var117, final SubLObject var141, final SubLObject var2) {
        if (module0307.NIL != module0035.f2428(var117, var141, Symbols.symbol_function((SubLObject)module0307.EQUAL), (SubLObject)module0307.UNPROVIDED)) {
            return conses_high.copy_list(f20857(var117, var141, var2));
        }
        return (SubLObject)module0307.NIL;
    }
    
    public static SubLObject f20858(final SubLObject var117, final SubLObject var141, final SubLObject var2) {
        final SubLThread var142 = SubLProcess.currentSubLThread();
        SubLObject var143 = module0202.f12832(var141, (SubLObject)module0307.UNPROVIDED);
        SubLObject var144 = (SubLObject)module0307.NIL;
        if (module0307.NIL == module0173.f10955(var143)) {
            var143 = module0205.f13328(var143);
        }
        final SubLObject var145 = (SubLObject)((module0307.NIL != module0173.f10955(var143)) ? module0226.f15099(var143, var2) : module0307.NIL);
        SubLObject var146 = (SubLObject)module0307.ZERO_INTEGER;
        final SubLObject var147 = module0147.$g2094$.currentBinding(var142);
        final SubLObject var148 = module0147.$g2095$.currentBinding(var142);
        try {
            module0147.$g2094$.bind(module0147.f9531(var2), var142);
            module0147.$g2095$.bind(module0147.f9534(var2), var142);
            final SubLObject var149 = (SubLObject)((module0307.NIL != module0173.f10955(var143)) ? SubLObjectFactory.makeBoolean(module0307.NIL != module0260.f17006(var143, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED) || module0307.NIL != module0260.f17008(var143, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED)) : module0307.NIL);
            final SubLObject var11_219 = module0144.$g1831$.currentBinding(var142);
            final SubLObject var25_220 = module0144.$g1843$.currentBinding(var142);
            final SubLObject var150 = module0144.$g1844$.currentBinding(var142);
            try {
                module0144.$g1831$.bind(var143, var142);
                module0144.$g1843$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0307.NIL != module0144.$g1781$.getDynamicValue(var142) && module0307.NIL != var149), var142);
                module0144.$g1844$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0307.NIL != module0144.$g1782$.getDynamicValue(var142) && module0307.NIL != var149), var142);
                if (var117.eql(f20856(var143))) {
                    SubLObject var151 = (SubLObject)module0307.NIL;
                    SubLObject var152 = (SubLObject)module0307.NIL;
                    final SubLObject var153 = module0205.f13207(var141, (SubLObject)module0307.$ic28$);
                    SubLObject var154;
                    SubLObject var155;
                    for (var154 = (SubLObject)module0307.NIL, var154 = var153; module0307.NIL == var151 && module0307.NIL != var154; var154 = var154.rest()) {
                        var155 = var154.first();
                        if (module0307.NIL != module0210.f13606(var155, (SubLObject)module0307.UNPROVIDED)) {
                            var151 = (SubLObject)module0307.T;
                            var152 = (SubLObject)module0307.T;
                        }
                    }
                    if (module0307.NIL != var152) {
                        var144 = (SubLObject)ConsesLow.cons(module0307.$ic36$, var144);
                    }
                    else {
                        var144 = (SubLObject)ConsesLow.cons(module0307.$ic37$, var144);
                    }
                }
                SubLObject var156 = module0202.f12829(var141, (SubLObject)module0307.$ic41$);
                SubLObject var157 = (SubLObject)module0307.NIL;
                var157 = var156.first();
                while (module0307.NIL != var156) {
                    var146 = Numbers.add(var146, (SubLObject)module0307.ONE_INTEGER);
                    if (module0307.NIL == module0004.f104(var146, var145, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED)) {
                        if (module0307.NIL == module0206.f13470(var157)) {
                            if (module0307.NIL == module0279.f18445(var143, var146, var2)) {
                                if (var117.equal(var157)) {
                                    var144 = ConsesLow.nconc(var144, f20859(var143, var146));
                                }
                                else if (module0307.NIL == f20860(var143, var146, var2)) {
                                    if (module0307.NIL != module0210.f13589(var157)) {
                                        if (var117.eql(module0205.f13368(var157, (SubLObject)module0307.UNPROVIDED))) {
                                            var144 = f20859(var143, var146);
                                        }
                                        final SubLObject var158 = module0287.f19158(var157);
                                        if (module0307.NIL != module0035.f2428(var117, var158, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED)) {
                                            var144 = ConsesLow.nconc(var144, f20861(var117, var158, var2));
                                        }
                                    }
                                    else if (module0307.NIL != module0279.f18462(var143, var146, var2)) {
                                        if (module0307.NIL != module0279.f18483(var143, var146, var2)) {
                                            if (module0307.NIL != module0202.f12903(var141)) {
                                                final SubLObject var159 = module0202.f12906(var141);
                                                final SubLObject var160 = module0202.f12887(var141);
                                                final SubLObject var161 = (module0307.NIL != module0269.f17707(var159)) ? var159 : var2;
                                                if (module0307.NIL == module0018.f979() || module0307.NIL != module0269.f17707(var159)) {
                                                    var144 = ConsesLow.nconc(var144, f20803(var117, var160, var161, f20804(var143, (SubLObject)module0307.TWO_INTEGER, var161)));
                                                }
                                            }
                                            else {
                                                var144 = ConsesLow.nconc(var144, f20803(var117, var157, var2, f20804(var143, var146, var2)));
                                            }
                                        }
                                    }
                                    else if (module0307.NIL == module0202.f12982(var143, var146)) {
                                        if (module0307.NIL != module0202.f12674(var157) && module0307.NIL != module0202.f12715(var157) && module0307.NIL != module0035.f2169(var117, var157)) {
                                            final SubLObject var162 = Sequences.substitute((SubLObject)module0307.$ic38$, var157, var141, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED);
                                            SubLObject var19_226;
                                            final SubLObject var163 = var19_226 = f20803((SubLObject)module0307.$ic38$, var162, var2, (SubLObject)module0307.UNPROVIDED);
                                            SubLObject var164 = (SubLObject)module0307.NIL;
                                            var164 = var19_226.first();
                                            while (module0307.NIL != var19_226) {
                                                if (module0307.NIL != module0206.f13453(var164)) {
                                                    final SubLObject var165 = module0205.f13276(var164);
                                                    final SubLObject var166 = module0205.f13277(var164, (SubLObject)module0307.UNPROVIDED);
                                                    if (module0307.$ic39$.eql(var165) && module0307.NIL != module0173.f10955(var166)) {
                                                        var144 = (SubLObject)ConsesLow.cons(var166, var144);
                                                    }
                                                }
                                                var19_226 = var19_226.rest();
                                                var164 = var19_226.first();
                                            }
                                            if (module0307.NIL == var144) {
                                                var144 = (SubLObject)ConsesLow.list(module0307.$ic40$);
                                            }
                                        }
                                        else if (module0307.NIL != module0035.f2428(var117, var157, (SubLObject)module0307.EQUAL, (SubLObject)module0307.UNPROVIDED)) {
                                            final SubLObject var167 = f20861(var117, var157, var2);
                                            if (var167.isVector()) {
                                                final SubLObject var168 = var167;
                                                final SubLObject var169 = (SubLObject)module0307.NIL;
                                                SubLObject var170;
                                                SubLObject var171;
                                                SubLObject var172;
                                                SubLObject var173;
                                                for (var170 = Sequences.length(var168), var171 = (SubLObject)module0307.NIL, var171 = (SubLObject)module0307.ZERO_INTEGER; var171.numL(var170); var171 = Numbers.add(var171, (SubLObject)module0307.ONE_INTEGER)) {
                                                    var172 = ((module0307.NIL != var169) ? Numbers.subtract(var170, var171, (SubLObject)module0307.ONE_INTEGER) : var171);
                                                    var173 = Vectors.aref(var168, var172);
                                                    var144 = (SubLObject)ConsesLow.cons(var173, var144);
                                                }
                                            }
                                            else {
                                                SubLObject var19_227 = var167;
                                                SubLObject var174 = (SubLObject)module0307.NIL;
                                                var174 = var19_227.first();
                                                while (module0307.NIL != var19_227) {
                                                    var144 = (SubLObject)ConsesLow.cons(var174, var144);
                                                    var19_227 = var19_227.rest();
                                                    var174 = var19_227.first();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    var156 = var156.rest();
                    var157 = var156.first();
                }
                var144 = module0035.f2273(var144);
            }
            finally {
                module0144.$g1844$.rebind(var150, var142);
                module0144.$g1843$.rebind(var25_220, var142);
                module0144.$g1831$.rebind(var11_219, var142);
            }
        }
        finally {
            module0147.$g2095$.rebind(var148, var142);
            module0147.$g2094$.rebind(var147, var142);
        }
        return var144;
    }
    
    public static SubLObject f20857(final SubLObject var117, final SubLObject var141, final SubLObject var2) {
        final SubLThread var142 = SubLProcess.currentSubLThread();
        final SubLObject var143 = module0034.$g879$.getDynamicValue(var142);
        SubLObject var144 = (SubLObject)module0307.NIL;
        if (module0307.NIL == var143) {
            return f20858(var117, var141, var2);
        }
        var144 = module0034.f1857(var143, (SubLObject)module0307.$ic35$, (SubLObject)module0307.UNPROVIDED);
        if (module0307.NIL == var144) {
            var144 = module0034.f1807(module0034.f1842(var143), (SubLObject)module0307.$ic35$, (SubLObject)module0307.THREE_INTEGER, (SubLObject)module0307.NIL, (SubLObject)module0307.EQUAL, (SubLObject)module0307.UNPROVIDED);
            module0034.f1860(var143, (SubLObject)module0307.$ic35$, var144);
        }
        final SubLObject var145 = module0034.f1781(var117, var141, var2);
        final SubLObject var146 = module0034.f1814(var144, var145, (SubLObject)module0307.UNPROVIDED);
        if (var146 != module0307.$ic9$) {
            SubLObject var147 = var146;
            SubLObject var148 = (SubLObject)module0307.NIL;
            var148 = var147.first();
            while (module0307.NIL != var147) {
                SubLObject var149 = var148.first();
                final SubLObject var150 = conses_high.second(var148);
                if (var117.equal(var149.first())) {
                    var149 = var149.rest();
                    if (var141.equal(var149.first())) {
                        var149 = var149.rest();
                        if (module0307.NIL != var149 && module0307.NIL == var149.rest() && var2.equal(var149.first())) {
                            return module0034.f1959(var150);
                        }
                    }
                }
                var147 = var147.rest();
                var148 = var147.first();
            }
        }
        final SubLObject var151 = Values.arg2(var142.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f20858(var117, var141, var2)));
        module0034.f1836(var144, var145, var146, var151, (SubLObject)ConsesLow.list(var117, var141, var2));
        return module0034.f1959(var151);
    }
    
    public static SubLObject f20854(final SubLObject var117, final SubLObject var141, final SubLObject var2) {
        final SubLThread var142 = SubLProcess.currentSubLThread();
        SubLObject var143 = module0202.f12832(var141, (SubLObject)module0307.UNPROVIDED);
        SubLObject var144 = (SubLObject)module0307.NIL;
        if (module0307.NIL == module0173.f10955(var143)) {
            var143 = module0205.f13328(var143);
        }
        final SubLObject var145 = (SubLObject)((module0307.NIL != module0173.f10955(var143)) ? module0226.f15099(var143, var2) : module0307.NIL);
        SubLObject var146 = (SubLObject)module0307.ZERO_INTEGER;
        final SubLObject var147 = module0147.$g2094$.currentBinding(var142);
        final SubLObject var148 = module0147.$g2095$.currentBinding(var142);
        try {
            module0147.$g2094$.bind(module0147.f9531(var2), var142);
            module0147.$g2095$.bind(module0147.f9534(var2), var142);
            final SubLObject var149 = (SubLObject)((module0307.NIL != module0173.f10955(var143)) ? SubLObjectFactory.makeBoolean(module0307.NIL != module0260.f17006(var143, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED) || module0307.NIL != module0260.f17008(var143, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED)) : module0307.NIL);
            final SubLObject var11_235 = module0144.$g1831$.currentBinding(var142);
            final SubLObject var25_236 = module0144.$g1843$.currentBinding(var142);
            final SubLObject var150 = module0144.$g1844$.currentBinding(var142);
            try {
                module0144.$g1831$.bind(var143, var142);
                module0144.$g1843$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0307.NIL != module0144.$g1781$.getDynamicValue(var142) && module0307.NIL != var149), var142);
                module0144.$g1844$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0307.NIL != module0144.$g1782$.getDynamicValue(var142) && module0307.NIL != var149), var142);
                SubLObject var151 = module0202.f12829(var141, (SubLObject)module0307.$ic41$);
                SubLObject var152 = (SubLObject)module0307.NIL;
                var152 = var151.first();
                while (module0307.NIL != var151) {
                    var146 = Numbers.add(var146, (SubLObject)module0307.ONE_INTEGER);
                    if (module0307.NIL == module0004.f104(var146, var145, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED)) {
                        if (module0307.NIL == module0206.f13470(var152)) {
                            if (module0307.NIL == module0279.f18445(var143, var146, var2)) {
                                if (var117.equal(var152)) {
                                    var144 = ConsesLow.nconc(var144, f20862(var143, var146));
                                }
                                else if (module0307.NIL == f20860(var143, var146, var2)) {
                                    if (module0307.NIL != module0210.f13589(var152)) {
                                        if (var117.eql(module0205.f13368(var152, (SubLObject)module0307.UNPROVIDED))) {
                                            var144 = f20862(var143, var146);
                                        }
                                        final SubLObject var153 = module0287.f19158(var152);
                                        if (module0307.NIL != module0035.f2428(var117, var153, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED)) {
                                            var144 = ConsesLow.nconc(var144, f20863(var117, var153, var2));
                                        }
                                    }
                                    else if (module0307.NIL != module0279.f18462(var143, var146, var2)) {
                                        if (module0307.NIL != module0279.f18483(var143, var146, var2)) {
                                            if (module0307.NIL != module0202.f12903(var141)) {
                                                final SubLObject var154 = module0202.f12906(var141);
                                                final SubLObject var155 = module0202.f12887(var141);
                                                final SubLObject var156 = (module0307.NIL != module0269.f17707(var154)) ? var154 : var2;
                                                if (module0307.NIL == module0018.f979() || module0307.NIL != module0269.f17707(var154)) {
                                                    var144 = ConsesLow.nconc(var144, f20807(var117, var155, var156, f20804(var143, (SubLObject)module0307.TWO_INTEGER, var156)));
                                                }
                                            }
                                            else {
                                                var144 = ConsesLow.nconc(var144, f20807(var117, var152, var2, f20804(var143, var146, var2)));
                                            }
                                        }
                                    }
                                    else if (module0307.NIL == module0202.f12982(var143, var146)) {
                                        if (module0307.NIL != module0035.f2428(var117, var152, (SubLObject)module0307.EQUAL, (SubLObject)module0307.UNPROVIDED)) {
                                            var144 = ConsesLow.nconc(var144, f20863(var117, var152, var2));
                                        }
                                    }
                                }
                            }
                        }
                    }
                    var151 = var151.rest();
                    var152 = var151.first();
                }
                var144 = module0035.f2273(var144);
            }
            finally {
                module0144.$g1844$.rebind(var150, var142);
                module0144.$g1843$.rebind(var25_236, var142);
                module0144.$g1831$.rebind(var11_235, var142);
            }
        }
        finally {
            module0147.$g2095$.rebind(var148, var142);
            module0147.$g2094$.rebind(var147, var142);
        }
        return var144;
    }
    
    public static SubLObject f20855(final SubLObject var117, final SubLObject var141, final SubLObject var2) {
        final SubLThread var142 = SubLProcess.currentSubLThread();
        SubLObject var143 = module0202.f12832(var141, (SubLObject)module0307.UNPROVIDED);
        SubLObject var144 = (SubLObject)module0307.NIL;
        if (module0307.NIL == module0173.f10955(var143) && module0307.NIL != module0210.f13595(var143, (SubLObject)module0307.UNPROVIDED)) {
            var143 = module0205.f13329(var143);
        }
        final SubLObject var145 = (SubLObject)((module0307.NIL != module0173.f10955(var143)) ? module0226.f15099(var143, var2) : module0307.NIL);
        SubLObject var146 = (SubLObject)module0307.ZERO_INTEGER;
        final SubLObject var147 = module0147.$g2094$.currentBinding(var142);
        final SubLObject var148 = module0147.$g2095$.currentBinding(var142);
        try {
            module0147.$g2094$.bind(module0147.f9531(var2), var142);
            module0147.$g2095$.bind(module0147.f9534(var2), var142);
            final SubLObject var149 = (SubLObject)((module0307.NIL != module0173.f10955(var143)) ? SubLObjectFactory.makeBoolean(module0307.NIL != module0260.f17006(var143, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED) || module0307.NIL != module0260.f17008(var143, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED)) : module0307.NIL);
            final SubLObject var11_237 = module0144.$g1831$.currentBinding(var142);
            final SubLObject var25_238 = module0144.$g1843$.currentBinding(var142);
            final SubLObject var150 = module0144.$g1844$.currentBinding(var142);
            try {
                module0144.$g1831$.bind(var143, var142);
                module0144.$g1843$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0307.NIL != module0144.$g1781$.getDynamicValue(var142) && module0307.NIL != var149), var142);
                module0144.$g1844$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0307.NIL != module0144.$g1782$.getDynamicValue(var142) && module0307.NIL != var149), var142);
                SubLObject var151 = module0202.f12829(var141, (SubLObject)module0307.$ic41$);
                SubLObject var152 = (SubLObject)module0307.NIL;
                var152 = var151.first();
                while (module0307.NIL != var151) {
                    var146 = Numbers.add(var146, (SubLObject)module0307.ONE_INTEGER);
                    if (module0307.NIL == module0004.f104(var146, var145, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED)) {
                        if (module0307.NIL == module0206.f13470(var152)) {
                            if (module0307.NIL == module0279.f18445(var143, var146, var2)) {
                                if (var117.equal(var152)) {
                                    var144 = ConsesLow.nconc(var144, f20864(var143, var146));
                                }
                                else if (module0307.NIL == f20860(var143, var146, var2)) {
                                    if (module0307.NIL != module0210.f13589(var152)) {
                                        if (var117.eql(module0205.f13368(var152, (SubLObject)module0307.UNPROVIDED))) {
                                            var144 = f20864(var143, var146);
                                        }
                                        final SubLObject var153 = module0287.f19158(var152);
                                        if (module0307.NIL != module0035.f2428(var117, var153, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED)) {
                                            var144 = ConsesLow.nconc(var144, f20865(var117, var153, var2));
                                        }
                                    }
                                    else if (module0307.NIL != module0279.f18462(var143, var146, var2)) {
                                        if (module0307.NIL != module0279.f18483(var143, var146, var2)) {
                                            if (module0307.NIL != module0202.f12903(var141)) {
                                                final SubLObject var154 = module0202.f12906(var141);
                                                final SubLObject var155 = module0202.f12887(var141);
                                                final SubLObject var156 = (module0307.NIL != module0269.f17707(var154)) ? var154 : var2;
                                                if (module0307.NIL == module0018.f979() || module0307.NIL != module0269.f17707(var154)) {
                                                    var144 = ConsesLow.nconc(var144, f20810(var117, var155, var156, f20804(var143, var146, var2)));
                                                }
                                            }
                                            else {
                                                var144 = ConsesLow.nconc(var144, f20810(var117, var152, var2, f20804(var143, var146, var2)));
                                            }
                                        }
                                    }
                                    else if (module0307.NIL == module0202.f12982(var143, var146)) {
                                        if (module0307.NIL != module0202.f12674(var152) && module0307.NIL != module0202.f12715(var152) && module0307.NIL != module0035.f2169(var117, var152)) {
                                            final SubLObject var157 = Sequences.substitute((SubLObject)module0307.$ic38$, var152, var141, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED);
                                            SubLObject var19_239;
                                            final SubLObject var158 = var19_239 = f20803((SubLObject)module0307.$ic38$, var157, var2, (SubLObject)module0307.UNPROVIDED);
                                            SubLObject var159 = (SubLObject)module0307.NIL;
                                            var159 = var19_239.first();
                                            while (module0307.NIL != var19_239) {
                                                if (module0307.NIL != module0206.f13453(var159)) {
                                                    final SubLObject var160 = module0205.f13276(var159);
                                                    final SubLObject var161 = module0205.f13277(var159, (SubLObject)module0307.UNPROVIDED);
                                                    if (module0307.$ic42$.eql(var160) && module0307.NIL != module0173.f10955(var161)) {
                                                        var144 = (SubLObject)ConsesLow.cons(var161, var144);
                                                    }
                                                    else if (module0307.$ic39$.eql(var160) && module0307.$ic43$.eql(module0205.f13276(var161)) && module0307.NIL != module0173.f10955(module0205.f13277(var161, (SubLObject)module0307.UNPROVIDED))) {
                                                        var144 = (SubLObject)ConsesLow.cons(module0205.f13277(var161, (SubLObject)module0307.UNPROVIDED), var144);
                                                    }
                                                }
                                                var19_239 = var19_239.rest();
                                                var159 = var19_239.first();
                                            }
                                        }
                                        else if (module0307.NIL != module0035.f2428(var117, var152, (SubLObject)module0307.EQUAL, (SubLObject)module0307.UNPROVIDED)) {
                                            var144 = ConsesLow.nconc(var144, f20865(var117, var152, var2));
                                        }
                                    }
                                }
                            }
                        }
                    }
                    var151 = var151.rest();
                    var152 = var151.first();
                }
                var144 = module0035.f2273(var144);
            }
            finally {
                module0144.$g1844$.rebind(var150, var142);
                module0144.$g1843$.rebind(var25_238, var142);
                module0144.$g1831$.rebind(var11_237, var142);
            }
        }
        finally {
            module0147.$g2095$.rebind(var148, var142);
            module0147.$g2094$.rebind(var147, var142);
        }
        return var144;
    }
    
    public static SubLObject f20814(final SubLObject var117, final SubLObject var141, final SubLObject var2) {
        if (module0307.NIL != module0279.f18525()) {
            return f20816(var117, var141, var2);
        }
        return (SubLObject)module0307.NIL;
    }
    
    public static SubLObject f20817(final SubLObject var117, final SubLObject var141, final SubLObject var2) {
        if (module0307.NIL != module0279.f18525()) {
            return f20819(var117, var141, var2);
        }
        return (SubLObject)module0307.NIL;
    }
    
    public static SubLObject f20816(final SubLObject var117, final SubLObject var141, final SubLObject var2) {
        final SubLThread var142 = SubLProcess.currentSubLThread();
        SubLObject var143 = module0202.f12832(var141, (SubLObject)module0307.UNPROVIDED);
        SubLObject var144 = (SubLObject)module0307.NIL;
        if (module0307.NIL == module0173.f10955(var143)) {
            var143 = module0205.f13328(var143);
        }
        final SubLObject var145 = module0202.f12839(var141, (SubLObject)module0307.UNPROVIDED);
        SubLObject var146 = (SubLObject)module0307.ZERO_INTEGER;
        final SubLObject var147 = (SubLObject)((module0307.NIL != module0173.f10955(var143)) ? module0226.f15099(var143, var2) : module0307.NIL);
        final SubLObject var148 = module0147.$g2094$.currentBinding(var142);
        final SubLObject var149 = module0147.$g2095$.currentBinding(var142);
        try {
            module0147.$g2094$.bind(module0147.f9531(var2), var142);
            module0147.$g2095$.bind(module0147.f9534(var2), var142);
            final SubLObject var150 = (SubLObject)((module0307.NIL != module0173.f10955(var143)) ? SubLObjectFactory.makeBoolean(module0307.NIL != module0260.f17006(var143, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED) || module0307.NIL != module0260.f17008(var143, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED)) : module0307.NIL);
            final SubLObject var11_241 = module0144.$g1831$.currentBinding(var142);
            final SubLObject var25_242 = module0144.$g1843$.currentBinding(var142);
            final SubLObject var151 = module0144.$g1844$.currentBinding(var142);
            try {
                module0144.$g1831$.bind(var143, var142);
                module0144.$g1843$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0307.NIL != module0144.$g1781$.getDynamicValue(var142) && module0307.NIL != var150), var142);
                module0144.$g1844$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0307.NIL != module0144.$g1782$.getDynamicValue(var142) && module0307.NIL != var150), var142);
                SubLObject var152 = module0202.f12829(var141, (SubLObject)module0307.$ic41$);
                SubLObject var153 = (SubLObject)module0307.NIL;
                var153 = var152.first();
                while (module0307.NIL != var152) {
                    var146 = Numbers.add(var146, (SubLObject)module0307.ONE_INTEGER);
                    if (module0307.NIL == module0004.f104(var146, var147, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED)) {
                        if (module0307.NIL == module0206.f13470(var153)) {
                            if (module0307.NIL == module0279.f18445(var143, var146, var2)) {
                                if (var117.equal(f20856(var153))) {
                                    final SubLObject var11_242 = module0144.$g1845$.currentBinding(var142);
                                    try {
                                        module0144.$g1845$.bind((SubLObject)(var117.equal(module0144.$g1845$.getDynamicValue(var142)) ? module0144.$g1845$.getDynamicValue(var142) : module0307.NIL), var142);
                                        SubLObject var154;
                                        SubLObject var155;
                                        SubLObject var156;
                                        SubLObject var19_245;
                                        SubLObject var157;
                                        for (var154 = (SubLObject)module0307.NIL, var154 = (SubLObject)module0307.ZERO_INTEGER; var154.numL(var145); var154 = Numbers.add(var154, (SubLObject)module0307.ONE_INTEGER)) {
                                            var155 = Numbers.add(var154, (SubLObject)module0307.ONE_INTEGER);
                                            if (!var146.numE(var155)) {
                                                var156 = module0202.f12831(var141, var155, (SubLObject)module0307.UNPROVIDED);
                                                if (module0307.NIL != var156) {
                                                    if (module0307.NIL != f20866(var156)) {
                                                        var144 = ConsesLow.nconc(var144, f20867(var143, var146, var156, var155));
                                                    }
                                                    else {
                                                        var19_245 = module0035.f2293(module0144.$g1848$.getDynamicValue(var142), var156, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED);
                                                        var157 = (SubLObject)module0307.NIL;
                                                        var157 = var19_245.first();
                                                        while (module0307.NIL != var19_245) {
                                                            var144 = ConsesLow.nconc(var144, f20820(var143, var146, var157, var155));
                                                            var19_245 = var19_245.rest();
                                                            var157 = var19_245.first();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    finally {
                                        module0144.$g1845$.rebind(var11_242, var142);
                                    }
                                }
                                else if (module0307.NIL == f20860(var143, var146, var2)) {
                                    if (module0307.NIL == module0210.f13589(var153)) {
                                        if (module0307.NIL != module0279.f18462(var143, var146, var2)) {
                                            if (module0307.NIL != module0279.f18483(var143, var146, var2)) {
                                                if (module0307.NIL != module0202.f12903(var141)) {
                                                    final SubLObject var158 = module0202.f12906(var141);
                                                    final SubLObject var159 = module0202.f12887(var141);
                                                    final SubLObject var160 = (module0307.NIL != module0269.f17707(var158)) ? var158 : var2;
                                                    if (module0307.NIL == module0018.f979() || module0307.NIL != module0269.f17707(var158)) {
                                                        var144 = ConsesLow.nconc(var144, f20815(var117, var159, var160, f20804(var143, (SubLObject)module0307.TWO_INTEGER, var160)));
                                                    }
                                                }
                                                else {
                                                    var144 = ConsesLow.nconc(var144, f20815(var117, var153, var2, f20804(var143, var146, var2)));
                                                }
                                            }
                                        }
                                        else if (module0307.NIL == module0202.f12982(var143, var146)) {
                                            if (module0307.NIL != module0035.f2428(var117, var153, (SubLObject)module0307.EQUAL, (SubLObject)module0307.UNPROVIDED)) {
                                                var144 = ConsesLow.nconc(var144, f20868(var117, var153, var2));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    var152 = var152.rest();
                    var153 = var152.first();
                }
            }
            finally {
                module0144.$g1844$.rebind(var151, var142);
                module0144.$g1843$.rebind(var25_242, var142);
                module0144.$g1831$.rebind(var11_241, var142);
            }
            var144 = module0035.f2273(var144);
        }
        finally {
            module0147.$g2095$.rebind(var149, var142);
            module0147.$g2094$.rebind(var148, var142);
        }
        return var144;
    }
    
    public static SubLObject f20866(final SubLObject var210) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0307.NIL != module0173.f10955(var210) || module0307.NIL != module0210.f13598(var210));
    }
    
    public static SubLObject f20819(final SubLObject var117, final SubLObject var141, final SubLObject var2) {
        final SubLThread var142 = SubLProcess.currentSubLThread();
        SubLObject var143 = module0202.f12832(var141, (SubLObject)module0307.UNPROVIDED);
        final SubLObject var144 = module0202.f12839(var141, (SubLObject)module0307.UNPROVIDED);
        SubLObject var145 = (SubLObject)module0307.ZERO_INTEGER;
        SubLObject var146 = (SubLObject)module0307.NIL;
        SubLObject var147 = (SubLObject)module0307.NIL;
        if (module0307.NIL == module0173.f10955(var143)) {
            var143 = module0205.f13328(var143);
        }
        var146 = (SubLObject)((module0307.NIL != module0173.f10955(var143)) ? module0226.f15099(var143, var2) : module0307.NIL);
        final SubLObject var148 = module0147.$g2094$.currentBinding(var142);
        final SubLObject var149 = module0147.$g2095$.currentBinding(var142);
        try {
            module0147.$g2094$.bind(module0147.f9531(var2), var142);
            module0147.$g2095$.bind(module0147.f9534(var2), var142);
            final SubLObject var150 = (SubLObject)((module0307.NIL != module0173.f10955(var143)) ? SubLObjectFactory.makeBoolean(module0307.NIL != module0260.f17006(var143, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED) || module0307.NIL != module0260.f17008(var143, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED)) : module0307.NIL);
            final SubLObject var11_247 = module0144.$g1831$.currentBinding(var142);
            final SubLObject var25_248 = module0144.$g1843$.currentBinding(var142);
            final SubLObject var151 = module0144.$g1844$.currentBinding(var142);
            try {
                module0144.$g1831$.bind(var143, var142);
                module0144.$g1843$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0307.NIL != module0144.$g1781$.getDynamicValue(var142) && module0307.NIL != var150), var142);
                module0144.$g1844$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0307.NIL != module0144.$g1782$.getDynamicValue(var142) && module0307.NIL != var150), var142);
                SubLObject var152 = module0202.f12829(var141, (SubLObject)module0307.$ic41$);
                SubLObject var153 = (SubLObject)module0307.NIL;
                var153 = var152.first();
                while (module0307.NIL != var152) {
                    var145 = Numbers.add(var145, (SubLObject)module0307.ONE_INTEGER);
                    if (module0307.NIL == module0004.f104(var145, var146, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED)) {
                        if (module0307.NIL == module0206.f13470(var153)) {
                            if (module0307.NIL == module0279.f18445(var143, var145, var2)) {
                                if (var117.equal(f20856(var153))) {
                                    final SubLObject var11_248 = module0144.$g1845$.currentBinding(var142);
                                    try {
                                        module0144.$g1845$.bind((SubLObject)(var117.equal(module0144.$g1845$.getDynamicValue(var142)) ? module0144.$g1845$.getDynamicValue(var142) : module0307.NIL), var142);
                                        SubLObject var154;
                                        SubLObject var155;
                                        SubLObject var156;
                                        SubLObject var19_250;
                                        SubLObject var157;
                                        for (var154 = (SubLObject)module0307.NIL, var154 = (SubLObject)module0307.ZERO_INTEGER; var154.numL(var144); var154 = Numbers.add(var154, (SubLObject)module0307.ONE_INTEGER)) {
                                            var155 = Numbers.add(var154, (SubLObject)module0307.ONE_INTEGER);
                                            if (!var145.numE(var155)) {
                                                var156 = module0202.f12831(var141, var155, (SubLObject)module0307.UNPROVIDED);
                                                if (module0307.NIL != var156) {
                                                    if (module0307.NIL != module0173.f10955(var156) || module0307.NIL != module0210.f13598(var156)) {
                                                        var147 = ConsesLow.nconc(var147, f20869(var143, var145, var156, var155));
                                                    }
                                                    else {
                                                        var19_250 = conses_high.assoc(var156, module0144.$g1849$.getDynamicValue(var142), (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED);
                                                        var157 = (SubLObject)module0307.NIL;
                                                        var157 = var19_250.first();
                                                        while (module0307.NIL != var19_250) {
                                                            var147 = ConsesLow.nconc(var147, f20870(var143, var145, var157, var155));
                                                            var19_250 = var19_250.rest();
                                                            var157 = var19_250.first();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    finally {
                                        module0144.$g1845$.rebind(var11_248, var142);
                                    }
                                }
                                else if (module0307.NIL == f20860(var143, var145, var2)) {
                                    if (module0307.NIL == module0210.f13589(var153)) {
                                        if (module0307.NIL != module0279.f18462(var143, var145, var2)) {
                                            if (module0307.NIL != module0279.f18483(var143, var145, var2)) {
                                                if (module0307.NIL != module0202.f12903(var141)) {
                                                    final SubLObject var158 = module0202.f12906(var141);
                                                    final SubLObject var159 = module0202.f12887(var141);
                                                    final SubLObject var160 = (module0307.NIL != module0269.f17707(var158)) ? var158 : var2;
                                                    if (module0307.NIL == module0018.f979() || module0307.NIL != module0269.f17707(var158)) {
                                                        var147 = ConsesLow.nconc(var147, f20818(var117, var159, var160, f20804(var143, (SubLObject)module0307.TWO_INTEGER, var160)));
                                                    }
                                                }
                                                else {
                                                    var147 = ConsesLow.nconc(var147, f20818(var117, var153, var2, f20804(var143, var145, var2)));
                                                }
                                            }
                                        }
                                        else if (module0307.NIL == module0202.f12982(var143, var145)) {
                                            if (module0307.NIL != module0035.f2428(var117, var153, (SubLObject)module0307.EQUAL, (SubLObject)module0307.UNPROVIDED)) {
                                                var147 = ConsesLow.nconc(var147, f20871(var117, var153, var2));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    var152 = var152.rest();
                    var153 = var152.first();
                }
                var147 = module0035.f2273(var147);
            }
            finally {
                module0144.$g1844$.rebind(var151, var142);
                module0144.$g1843$.rebind(var25_248, var142);
                module0144.$g1831$.rebind(var11_247, var142);
            }
        }
        finally {
            module0147.$g2095$.rebind(var149, var142);
            module0147.$g2094$.rebind(var148, var142);
        }
        return var147;
    }
    
    public static SubLObject f20803(final SubLObject var117, final SubLObject var3, final SubLObject var2, SubLObject var251) {
        if (var251 == module0307.UNPROVIDED) {
            var251 = (SubLObject)module0307.$ic44$;
        }
        return f20872(var117, var3, (SubLObject)module0307.$ic25$, var2, var251);
    }
    
    public static SubLObject f20807(final SubLObject var117, final SubLObject var3, final SubLObject var2, SubLObject var251) {
        if (var251 == module0307.UNPROVIDED) {
            var251 = (SubLObject)module0307.$ic44$;
        }
        return f20872(var117, var3, (SubLObject)module0307.$ic26$, var2, var251);
    }
    
    public static SubLObject f20810(final SubLObject var117, final SubLObject var3, final SubLObject var2, SubLObject var251) {
        if (var251 == module0307.UNPROVIDED) {
            var251 = (SubLObject)module0307.$ic44$;
        }
        return f20872(var117, var3, (SubLObject)module0307.$ic27$, var2, var251);
    }
    
    public static SubLObject f20872(final SubLObject var117, final SubLObject var3, final SubLObject var252, final SubLObject var2, SubLObject var251) {
        if (var251 == module0307.UNPROVIDED) {
            var251 = (SubLObject)module0307.$ic44$;
        }
        final SubLObject var253 = var251;
        if (var253.eql((SubLObject)module0307.$ic45$)) {
            return f20873(var117, var3, var252, var2);
        }
        if (var253.eql((SubLObject)module0307.$ic44$)) {
            return f20874(var117, var3, var252, var2);
        }
        return (SubLObject)module0307.NIL;
    }
    
    public static SubLObject f20873(final SubLObject var117, final SubLObject var3, final SubLObject var253, final SubLObject var2) {
        final SubLThread var254 = SubLProcess.currentSubLThread();
        if (!var3.isAtom()) {
            var254.resetMultipleValues();
            final SubLObject var255 = f20748(var3, var2);
            final SubLObject var256 = var254.secondMultipleValue();
            var254.resetMultipleValues();
            SubLObject var257 = (SubLObject)module0307.NIL;
            if (var253.eql((SubLObject)module0307.$ic25$)) {
                var257 = f20777(f20792(var117, var255, var256), var256);
            }
            else if (var253.eql((SubLObject)module0307.$ic26$)) {
                var257 = f20777(f20794(var117, var255, var256), var256);
            }
            else if (var253.eql((SubLObject)module0307.$ic27$)) {
                var257 = f20777(f20795(var117, var255, var256), var256);
            }
            return var257;
        }
        return (SubLObject)module0307.NIL;
    }
    
    public static SubLObject f20874(final SubLObject var117, final SubLObject var3, final SubLObject var253, final SubLObject var2) {
        final SubLThread var254 = SubLProcess.currentSubLThread();
        if (!var3.isAtom()) {
            var254.resetMultipleValues();
            final SubLObject var255 = f20743(var3, var2, (SubLObject)module0307.NIL);
            final SubLObject var256 = var254.secondMultipleValue();
            var254.resetMultipleValues();
            SubLObject var257 = (SubLObject)module0307.NIL;
            if (var255.isCons()) {
                if (var253.eql((SubLObject)module0307.$ic25$)) {
                    var257 = f20777(f20826(var117, var255, var256), var256);
                }
                else if (var253.eql((SubLObject)module0307.$ic26$)) {
                    var257 = f20777(f20835(var117, var255, var256), var256);
                }
                else if (var253.eql((SubLObject)module0307.$ic27$)) {
                    var257 = f20777(f20828(var117, var255, var256), var256);
                }
                if (module0307.NIL != var257) {
                    if (module0307.NIL != module0035.f1997(var255)) {
                        return var257;
                    }
                    return module0256.f16637(var257, (SubLObject)module0307.NIL, var2, (SubLObject)module0307.UNPROVIDED);
                }
            }
        }
        return (SubLObject)module0307.NIL;
    }
    
    public static SubLObject f20815(final SubLObject var117, final SubLObject var3, final SubLObject var2, SubLObject var251) {
        if (var251 == module0307.UNPROVIDED) {
            var251 = (SubLObject)module0307.$ic44$;
        }
        return f20875(var117, var3, (SubLObject)module0307.$ic25$, var2, var251);
    }
    
    public static SubLObject f20818(final SubLObject var117, final SubLObject var3, final SubLObject var2, SubLObject var251) {
        if (var251 == module0307.UNPROVIDED) {
            var251 = (SubLObject)module0307.$ic44$;
        }
        return f20875(var117, var3, (SubLObject)module0307.$ic27$, var2, var251);
    }
    
    public static SubLObject f20875(final SubLObject var117, final SubLObject var3, final SubLObject var252, final SubLObject var2, SubLObject var251) {
        if (var251 == module0307.UNPROVIDED) {
            var251 = (SubLObject)module0307.$ic44$;
        }
        final SubLObject var253 = var251;
        if (var253.eql((SubLObject)module0307.$ic45$)) {
            return f20876(var117, var3, var252, var2);
        }
        if (var253.eql((SubLObject)module0307.$ic44$)) {
            return f20877(var117, var3, var252, var2);
        }
        return (SubLObject)module0307.NIL;
    }
    
    public static SubLObject f20876(final SubLObject var117, final SubLObject var3, final SubLObject var253, final SubLObject var254) {
        final SubLThread var255 = SubLProcess.currentSubLThread();
        if (!var3.isAtom()) {
            var255.resetMultipleValues();
            final SubLObject var256 = f20748(var3, var254);
            final SubLObject var257 = var255.secondMultipleValue();
            var255.resetMultipleValues();
            SubLObject var258 = (SubLObject)module0307.NIL;
            SubLObject var259 = (SubLObject)module0307.NIL;
            if (var253.eql((SubLObject)module0307.$ic25$)) {
                final SubLObject var260 = module0144.$g1755$.currentBinding(var255);
                try {
                    module0144.$g1755$.bind((SubLObject)module0307.NIL, var255);
                    var258 = f20786(var256, var257, (SubLObject)module0307.$ic2$);
                    var259 = f20777(f20793(var117, var256, var258, var257), var257);
                }
                finally {
                    module0144.$g1755$.rebind(var260, var255);
                }
            }
            else if (var253.eql((SubLObject)module0307.$ic27$)) {
                final SubLObject var260 = module0144.$g1757$.currentBinding(var255);
                try {
                    module0144.$g1757$.bind((SubLObject)module0307.NIL, var255);
                    var258 = f20788(var256, var257, (SubLObject)module0307.$ic2$);
                    var259 = f20777(f20796(var117, var256, var258, var257), var257);
                }
                finally {
                    module0144.$g1757$.rebind(var260, var255);
                }
            }
            return var259;
        }
        return (SubLObject)module0307.NIL;
    }
    
    public static SubLObject f20877(final SubLObject var117, final SubLObject var3, final SubLObject var253, final SubLObject var254) {
        final SubLThread var255 = SubLProcess.currentSubLThread();
        if (!var3.isAtom()) {
            var255.resetMultipleValues();
            final SubLObject var256 = f20743(var3, var254, (SubLObject)module0307.NIL);
            final SubLObject var257 = var255.secondMultipleValue();
            var255.resetMultipleValues();
            SubLObject var258 = (SubLObject)module0307.NIL;
            SubLObject var259 = (SubLObject)module0307.NIL;
            if (var256.isCons()) {
                if (var253.eql((SubLObject)module0307.$ic25$)) {
                    final SubLObject var260 = module0144.$g1755$.currentBinding(var255);
                    try {
                        module0144.$g1755$.bind((SubLObject)module0307.NIL, var255);
                        var258 = f20824(var256, var257, (SubLObject)module0307.$ic2$);
                        var259 = f20777(f20827(var117, var256, var258, var257), var257);
                    }
                    finally {
                        module0144.$g1755$.rebind(var260, var255);
                    }
                }
                else if (var253.eql((SubLObject)module0307.$ic27$)) {
                    final SubLObject var260 = module0144.$g1757$.currentBinding(var255);
                    try {
                        module0144.$g1757$.bind((SubLObject)module0307.NIL, var255);
                        var258 = f20825(var256, var257, (SubLObject)module0307.$ic2$);
                        var259 = f20777(f20829(var117, var256, var258, var257), var257);
                    }
                    finally {
                        module0144.$g1757$.rebind(var260, var255);
                    }
                }
                if (module0307.NIL != var259) {
                    if (module0307.NIL != module0035.f1997(var256)) {
                        return var259;
                    }
                    return module0256.f16637(var259, (SubLObject)module0307.NIL, var257, (SubLObject)module0307.UNPROVIDED);
                }
            }
        }
        return (SubLObject)module0307.NIL;
    }
    
    public static SubLObject f20861(final SubLObject var117, final SubLObject var3, final SubLObject var2) {
        final SubLThread var118 = SubLProcess.currentSubLThread();
        if (module0307.NIL != module0202.f12932(var3)) {
            SubLObject var119 = module0205.f13136(var3);
            SubLObject var120 = (SubLObject)module0307.NIL;
            SubLObject var121 = (SubLObject)module0307.NIL;
            if (var117.eql(var119)) {
                var121 = (SubLObject)ConsesLow.cons(module0307.$ic46$, var121);
            }
            else if (!var119.isAtom()) {
                var119 = module0172.f10922(var119);
            }
            var120 = (SubLObject)((module0307.NIL != module0173.f10955(var119)) ? module0226.f15099(var119, var2) : module0307.NIL);
            final SubLObject var122 = module0147.$g2094$.currentBinding(var118);
            final SubLObject var123 = module0147.$g2095$.currentBinding(var118);
            try {
                module0147.$g2094$.bind(module0147.f9531(var2), var118);
                module0147.$g2095$.bind(module0147.f9534(var2), var118);
                final SubLObject var124 = (SubLObject)((module0307.NIL != module0173.f10955(var119)) ? SubLObjectFactory.makeBoolean(module0307.NIL != module0260.f17006(var119, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED) || module0307.NIL != module0260.f17008(var119, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED)) : module0307.NIL);
                final SubLObject var11_258 = module0144.$g1831$.currentBinding(var118);
                final SubLObject var25_259 = module0144.$g1843$.currentBinding(var118);
                final SubLObject var125 = module0144.$g1844$.currentBinding(var118);
                try {
                    module0144.$g1831$.bind(var119, var118);
                    module0144.$g1843$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0307.NIL != module0144.$g1781$.getDynamicValue(var118) && module0307.NIL != var124), var118);
                    module0144.$g1844$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0307.NIL != module0144.$g1782$.getDynamicValue(var118) && module0307.NIL != var124), var118);
                    SubLObject var126 = (SubLObject)module0307.ZERO_INTEGER;
                    SubLObject var128;
                    final SubLObject var127 = var128 = module0205.f13207(var3, (SubLObject)module0307.$ic41$);
                    SubLObject var129 = (SubLObject)module0307.NIL;
                    var129 = var128.first();
                    while (module0307.NIL != var128) {
                        var126 = Numbers.add(var126, (SubLObject)module0307.ONE_INTEGER);
                        if (module0307.NIL == module0004.f104(var126, var120, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED)) {
                            if (module0307.NIL == module0279.f18445(var119, var126, var2)) {
                                if (var117.equal(var129)) {
                                    var121 = ConsesLow.nconc(var121, f20859(var119, var126));
                                }
                                else if (module0307.NIL == f20860(var119, var126, var2)) {
                                    if (module0307.NIL != module0279.f18462(var119, var126, var2)) {
                                        if (module0307.NIL != module0279.f18483(var119, var126, var2)) {
                                            var121 = ConsesLow.nconc(var121, f20803(var117, var129, var2, f20804(var119, var126, var2)));
                                        }
                                    }
                                    else if (module0307.NIL == module0210.f13589(var129)) {
                                        if (module0307.NIL == module0202.f12982(var119, var126)) {
                                            if (module0307.NIL != module0035.f2428(var117, var129, (SubLObject)module0307.EQUAL, (SubLObject)module0307.UNPROVIDED)) {
                                                var121 = ConsesLow.nconc(var121, f20861(var117, var129, var2));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        var128 = var128.rest();
                        var129 = var128.first();
                    }
                    var121 = f20777(module0035.f2273(var121), var2);
                }
                finally {
                    module0144.$g1844$.rebind(var125, var118);
                    module0144.$g1843$.rebind(var25_259, var118);
                    module0144.$g1831$.rebind(var11_258, var118);
                }
            }
            finally {
                module0147.$g2095$.rebind(var123, var118);
                module0147.$g2094$.rebind(var122, var118);
            }
            return var121;
        }
        return (SubLObject)module0307.NIL;
    }
    
    public static SubLObject f20863(final SubLObject var117, final SubLObject var3, final SubLObject var2) {
        final SubLThread var118 = SubLProcess.currentSubLThread();
        if (module0307.NIL != module0202.f12932(var3)) {
            SubLObject var119 = module0205.f13136(var3);
            SubLObject var120 = (SubLObject)module0307.NIL;
            SubLObject var121 = (SubLObject)module0307.NIL;
            if (!var119.isAtom()) {
                var119 = module0172.f10922(var119);
            }
            var120 = (SubLObject)((module0307.NIL != module0173.f10955(var119)) ? module0226.f15099(var119, var2) : module0307.NIL);
            final SubLObject var122 = module0147.$g2094$.currentBinding(var118);
            final SubLObject var123 = module0147.$g2095$.currentBinding(var118);
            try {
                module0147.$g2094$.bind(module0147.f9531(var2), var118);
                module0147.$g2095$.bind(module0147.f9534(var2), var118);
                final SubLObject var124 = (SubLObject)((module0307.NIL != module0173.f10955(var119)) ? SubLObjectFactory.makeBoolean(module0307.NIL != module0260.f17006(var119, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED) || module0307.NIL != module0260.f17008(var119, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED)) : module0307.NIL);
                final SubLObject var11_260 = module0144.$g1831$.currentBinding(var118);
                final SubLObject var25_261 = module0144.$g1843$.currentBinding(var118);
                final SubLObject var125 = module0144.$g1844$.currentBinding(var118);
                try {
                    module0144.$g1831$.bind(var119, var118);
                    module0144.$g1843$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0307.NIL != module0144.$g1781$.getDynamicValue(var118) && module0307.NIL != var124), var118);
                    module0144.$g1844$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0307.NIL != module0144.$g1782$.getDynamicValue(var118) && module0307.NIL != var124), var118);
                    SubLObject var126 = (SubLObject)module0307.ZERO_INTEGER;
                    SubLObject var128;
                    final SubLObject var127 = var128 = module0205.f13207(var3, (SubLObject)module0307.$ic41$);
                    SubLObject var129 = (SubLObject)module0307.NIL;
                    var129 = var128.first();
                    while (module0307.NIL != var128) {
                        var126 = Numbers.add(var126, (SubLObject)module0307.ONE_INTEGER);
                        if (module0307.NIL == module0004.f104(var126, var120, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED)) {
                            if (module0307.NIL == module0279.f18445(var119, var126, var2)) {
                                if (var117.equal(var129)) {
                                    var121 = ConsesLow.nconc(var121, f20862(var119, var126));
                                }
                                else if (module0307.NIL == f20860(var119, var126, var2)) {
                                    if (module0307.NIL != module0279.f18462(var119, var126, var2)) {
                                        if (module0307.NIL != module0279.f18483(var119, var126, var2)) {
                                            var121 = ConsesLow.nconc(var121, f20807(var117, var129, var2, f20804(var119, var126, var2)));
                                        }
                                    }
                                    else if (module0307.NIL == module0210.f13589(var129)) {
                                        if (module0307.NIL == module0202.f12982(var119, var126)) {
                                            if (module0307.NIL != module0035.f2428(var117, var129, (SubLObject)module0307.EQUAL, (SubLObject)module0307.UNPROVIDED)) {
                                                var121 = ConsesLow.nconc(var121, f20863(var117, var129, var2));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        var128 = var128.rest();
                        var129 = var128.first();
                    }
                    var121 = f20777(module0035.f2273(var121), var2);
                }
                finally {
                    module0144.$g1844$.rebind(var125, var118);
                    module0144.$g1843$.rebind(var25_261, var118);
                    module0144.$g1831$.rebind(var11_260, var118);
                }
            }
            finally {
                module0147.$g2095$.rebind(var123, var118);
                module0147.$g2094$.rebind(var122, var118);
            }
            return var121;
        }
        return (SubLObject)module0307.NIL;
    }
    
    public static SubLObject f20865(final SubLObject var117, final SubLObject var3, final SubLObject var2) {
        final SubLThread var118 = SubLProcess.currentSubLThread();
        if (module0307.NIL != module0202.f12932(var3)) {
            SubLObject var119 = module0205.f13136(var3);
            SubLObject var120 = (SubLObject)module0307.ZERO_INTEGER;
            SubLObject var121 = (SubLObject)module0307.NIL;
            SubLObject var122 = (SubLObject)module0307.NIL;
            if (!var119.isAtom()) {
                var119 = module0172.f10922(var119);
            }
            var121 = (SubLObject)((module0307.NIL != module0173.f10955(var119)) ? module0226.f15099(var119, var2) : module0307.NIL);
            final SubLObject var123 = module0147.$g2094$.currentBinding(var118);
            final SubLObject var124 = module0147.$g2095$.currentBinding(var118);
            try {
                module0147.$g2094$.bind(module0147.f9531(var2), var118);
                module0147.$g2095$.bind(module0147.f9534(var2), var118);
                final SubLObject var125 = (SubLObject)((module0307.NIL != module0173.f10955(var119)) ? SubLObjectFactory.makeBoolean(module0307.NIL != module0260.f17006(var119, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED) || module0307.NIL != module0260.f17008(var119, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED)) : module0307.NIL);
                final SubLObject var11_262 = module0144.$g1831$.currentBinding(var118);
                final SubLObject var25_263 = module0144.$g1843$.currentBinding(var118);
                final SubLObject var126 = module0144.$g1844$.currentBinding(var118);
                try {
                    module0144.$g1831$.bind(var119, var118);
                    module0144.$g1843$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0307.NIL != module0144.$g1781$.getDynamicValue(var118) && module0307.NIL != var125), var118);
                    module0144.$g1844$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0307.NIL != module0144.$g1782$.getDynamicValue(var118) && module0307.NIL != var125), var118);
                    SubLObject var128;
                    final SubLObject var127 = var128 = module0205.f13207(var3, (SubLObject)module0307.$ic41$);
                    SubLObject var129 = (SubLObject)module0307.NIL;
                    var129 = var128.first();
                    while (module0307.NIL != var128) {
                        var120 = Numbers.add(var120, (SubLObject)module0307.ONE_INTEGER);
                        if (module0307.NIL == module0004.f104(var120, var121, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED)) {
                            if (module0307.NIL == module0279.f18445(var119, var120, var2)) {
                                if (var117.equal(var129)) {
                                    var122 = ConsesLow.nconc(var122, f20864(var119, var120));
                                }
                                else if (module0307.NIL == f20860(var119, var120, var2)) {
                                    if (module0307.NIL != module0279.f18462(var119, var120, var2)) {
                                        if (module0307.NIL != module0279.f18483(var119, var120, var2)) {
                                            var122 = ConsesLow.nconc(var122, f20810(var117, var129, var2, f20804(var119, var120, var2)));
                                        }
                                    }
                                    else if (module0307.NIL == module0210.f13589(var129)) {
                                        if (module0307.NIL == module0202.f12982(var119, var120)) {
                                            if (module0307.NIL != module0035.f2428(var117, var129, (SubLObject)module0307.EQUAL, (SubLObject)module0307.UNPROVIDED)) {
                                                var122 = ConsesLow.nconc(var122, f20865(var117, var129, var2));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        var128 = var128.rest();
                        var129 = var128.first();
                    }
                    var122 = f20777(module0035.f2273(var122), var2);
                }
                finally {
                    module0144.$g1844$.rebind(var126, var118);
                    module0144.$g1843$.rebind(var25_263, var118);
                    module0144.$g1831$.rebind(var11_262, var118);
                }
            }
            finally {
                module0147.$g2095$.rebind(var124, var118);
                module0147.$g2094$.rebind(var123, var118);
            }
            return var122;
        }
        return (SubLObject)module0307.NIL;
    }
    
    public static SubLObject f20868(final SubLObject var117, final SubLObject var3, final SubLObject var2) {
        final SubLThread var118 = SubLProcess.currentSubLThread();
        if (module0307.NIL != module0210.f13571(var3)) {
            SubLObject var119 = module0205.f13136(var3);
            final SubLObject var120 = module0202.f12725(var3, (SubLObject)module0307.UNPROVIDED);
            SubLObject var121 = (SubLObject)module0307.ZERO_INTEGER;
            SubLObject var122 = (SubLObject)module0307.NIL;
            SubLObject var123 = (SubLObject)module0307.NIL;
            if (!var119.isAtom()) {
                var119 = module0172.f10922(var119);
            }
            var122 = (SubLObject)((module0307.NIL != module0173.f10955(var119)) ? module0226.f15099(var119, var2) : module0307.NIL);
            final SubLObject var124 = module0147.$g2094$.currentBinding(var118);
            final SubLObject var125 = module0147.$g2095$.currentBinding(var118);
            try {
                module0147.$g2094$.bind(module0147.f9531(var2), var118);
                module0147.$g2095$.bind(module0147.f9534(var2), var118);
                final SubLObject var126 = (SubLObject)((module0307.NIL != module0173.f10955(var119)) ? SubLObjectFactory.makeBoolean(module0307.NIL != module0260.f17006(var119, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED) || module0307.NIL != module0260.f17008(var119, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED)) : module0307.NIL);
                final SubLObject var11_264 = module0144.$g1831$.currentBinding(var118);
                final SubLObject var25_265 = module0144.$g1843$.currentBinding(var118);
                final SubLObject var127 = module0144.$g1844$.currentBinding(var118);
                try {
                    module0144.$g1831$.bind(var119, var118);
                    module0144.$g1843$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0307.NIL != module0144.$g1781$.getDynamicValue(var118) && module0307.NIL != var126), var118);
                    module0144.$g1844$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0307.NIL != module0144.$g1782$.getDynamicValue(var118) && module0307.NIL != var126), var118);
                    SubLObject var129;
                    final SubLObject var128 = var129 = module0205.f13207(var3, (SubLObject)module0307.$ic41$);
                    SubLObject var130 = (SubLObject)module0307.NIL;
                    var130 = var129.first();
                    while (module0307.NIL != var129) {
                        var121 = Numbers.add(var121, (SubLObject)module0307.ONE_INTEGER);
                        if (module0307.NIL == module0004.f104(var121, var122, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED)) {
                            if (module0307.NIL == module0279.f18445(var119, var121, var2)) {
                                if (var117.equal(var130)) {
                                    SubLObject var131;
                                    SubLObject var132;
                                    SubLObject var133;
                                    SubLObject var19_266;
                                    SubLObject var134;
                                    for (var131 = (SubLObject)module0307.NIL, var131 = (SubLObject)module0307.ZERO_INTEGER; var131.numL(var120); var131 = Numbers.add(var131, (SubLObject)module0307.ONE_INTEGER)) {
                                        var132 = Numbers.add(var131, (SubLObject)module0307.ONE_INTEGER);
                                        if (!var121.numE(var132)) {
                                            var133 = module0205.f13134(var3, var132, (SubLObject)module0307.UNPROVIDED);
                                            if (module0307.NIL != var133) {
                                                if (module0307.NIL != module0173.f10955(var133) || module0307.NIL != module0210.f13598(var133)) {
                                                    var123 = ConsesLow.nconc(var123, f20867(var119, var121, var133, var132));
                                                }
                                                else {
                                                    var19_266 = conses_high.assoc(var133, module0144.$g1848$.getDynamicValue(var118), (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED);
                                                    var134 = (SubLObject)module0307.NIL;
                                                    var134 = var19_266.first();
                                                    while (module0307.NIL != var19_266) {
                                                        var123 = ConsesLow.nconc(var123, f20820(var119, var121, var134, var132));
                                                        var19_266 = var19_266.rest();
                                                        var134 = var19_266.first();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                else if (module0307.NIL == f20860(var119, var121, var2)) {
                                    if (module0307.NIL != module0279.f18462(var119, var121, var2)) {
                                        if (module0307.NIL != module0279.f18483(var119, var121, var2)) {
                                            var123 = ConsesLow.nconc(var123, f20815(var117, var130, var2, f20804(var119, var121, var2)));
                                        }
                                    }
                                    else if (module0307.NIL == module0210.f13589(var130)) {
                                        if (module0307.NIL == module0202.f12982(var119, var121)) {
                                            if (module0307.NIL != module0035.f2428(var117, var130, (SubLObject)module0307.EQUAL, (SubLObject)module0307.UNPROVIDED)) {
                                                var123 = ConsesLow.nconc(var123, f20868(var117, var130, var2));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        var129 = var129.rest();
                        var130 = var129.first();
                    }
                    var123 = f20777(module0035.f2273(var123), var2);
                }
                finally {
                    module0144.$g1844$.rebind(var127, var118);
                    module0144.$g1843$.rebind(var25_265, var118);
                    module0144.$g1831$.rebind(var11_264, var118);
                }
            }
            finally {
                module0147.$g2095$.rebind(var125, var118);
                module0147.$g2094$.rebind(var124, var118);
            }
            return var123;
        }
        return (SubLObject)module0307.NIL;
    }
    
    public static SubLObject f20871(final SubLObject var117, final SubLObject var3, final SubLObject var2) {
        final SubLThread var118 = SubLProcess.currentSubLThread();
        if (module0307.NIL != module0210.f13571(var3)) {
            SubLObject var119 = module0205.f13136(var3);
            final SubLObject var120 = module0202.f12725(var3, (SubLObject)module0307.UNPROVIDED);
            SubLObject var121 = (SubLObject)module0307.ZERO_INTEGER;
            SubLObject var122 = (SubLObject)module0307.NIL;
            SubLObject var123 = (SubLObject)module0307.NIL;
            if (!var119.isAtom()) {
                var119 = module0172.f10922(var119);
            }
            var122 = (SubLObject)((module0307.NIL != module0173.f10955(var119)) ? module0226.f15099(var119, var2) : module0307.NIL);
            final SubLObject var124 = module0147.$g2094$.currentBinding(var118);
            final SubLObject var125 = module0147.$g2095$.currentBinding(var118);
            try {
                module0147.$g2094$.bind(module0147.f9531(var2), var118);
                module0147.$g2095$.bind(module0147.f9534(var2), var118);
                final SubLObject var126 = (SubLObject)((module0307.NIL != module0173.f10955(var119)) ? SubLObjectFactory.makeBoolean(module0307.NIL != module0260.f17006(var119, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED) || module0307.NIL != module0260.f17008(var119, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED)) : module0307.NIL);
                final SubLObject var11_267 = module0144.$g1831$.currentBinding(var118);
                final SubLObject var25_268 = module0144.$g1843$.currentBinding(var118);
                final SubLObject var127 = module0144.$g1844$.currentBinding(var118);
                try {
                    module0144.$g1831$.bind(var119, var118);
                    module0144.$g1843$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0307.NIL != module0144.$g1781$.getDynamicValue(var118) && module0307.NIL != var126), var118);
                    module0144.$g1844$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0307.NIL != module0144.$g1782$.getDynamicValue(var118) && module0307.NIL != var126), var118);
                    SubLObject var129;
                    final SubLObject var128 = var129 = module0205.f13207(var3, (SubLObject)module0307.$ic41$);
                    SubLObject var130 = (SubLObject)module0307.NIL;
                    var130 = var129.first();
                    while (module0307.NIL != var129) {
                        var121 = Numbers.add(var121, (SubLObject)module0307.ONE_INTEGER);
                        if (module0307.NIL == module0004.f104(var121, var122, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED)) {
                            if (module0307.NIL == module0279.f18445(var119, var121, var2)) {
                                if (var117.equal(var130)) {
                                    SubLObject var131;
                                    SubLObject var132;
                                    SubLObject var133;
                                    SubLObject var19_269;
                                    SubLObject var134;
                                    for (var131 = (SubLObject)module0307.NIL, var131 = (SubLObject)module0307.ZERO_INTEGER; var131.numL(var120); var131 = Numbers.add(var131, (SubLObject)module0307.ONE_INTEGER)) {
                                        var132 = Numbers.add(var131, (SubLObject)module0307.ONE_INTEGER);
                                        if (!var121.numE(var132)) {
                                            var133 = module0205.f13134(var3, var132, (SubLObject)module0307.UNPROVIDED);
                                            if (module0307.NIL != var133) {
                                                if (module0307.NIL != module0173.f10955(var133) || module0307.NIL != module0210.f13598(var133)) {
                                                    var123 = ConsesLow.nconc(var123, f20869(var119, var121, var133, var132));
                                                }
                                                else {
                                                    var19_269 = conses_high.assoc(var133, module0144.$g1849$.getDynamicValue(var118), (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED);
                                                    var134 = (SubLObject)module0307.NIL;
                                                    var134 = var19_269.first();
                                                    while (module0307.NIL != var19_269) {
                                                        var123 = ConsesLow.nconc(var123, f20870(var119, var121, var134, var132));
                                                        var19_269 = var19_269.rest();
                                                        var134 = var19_269.first();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                else if (module0307.NIL == f20860(var119, var121, var2)) {
                                    if (module0307.NIL != module0279.f18462(var119, var121, var2)) {
                                        if (module0307.NIL != module0279.f18483(var119, var121, var2)) {
                                            var123 = ConsesLow.nconc(var123, f20818(var117, var130, var2, f20804(var119, var121, var2)));
                                        }
                                    }
                                    else if (module0307.NIL == module0210.f13589(var130)) {
                                        if (module0307.NIL == module0202.f12982(var119, var121)) {
                                            if (module0307.NIL != module0035.f2428(var117, var130, (SubLObject)module0307.EQUAL, (SubLObject)module0307.UNPROVIDED)) {
                                                var123 = ConsesLow.nconc(var123, f20871(var117, var130, var2));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        var129 = var129.rest();
                        var130 = var129.first();
                    }
                    var123 = f20777(module0035.f2273(var123), var2);
                }
                finally {
                    module0144.$g1844$.rebind(var127, var118);
                    module0144.$g1843$.rebind(var25_268, var118);
                    module0144.$g1831$.rebind(var11_267, var118);
                }
            }
            finally {
                module0147.$g2095$.rebind(var125, var118);
                module0147.$g2094$.rebind(var124, var118);
            }
            return var123;
        }
        return (SubLObject)module0307.NIL;
    }
    
    public static SubLObject f20777(final SubLObject var138, final SubLObject var2) {
        if (module0307.NIL == var138) {
            return (SubLObject)module0307.NIL;
        }
        return conses_high.copy_list(f20878(module0213.f13926(var138, (SubLObject)module0307.T, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED), var2));
    }
    
    public static SubLObject f20879(final SubLObject var138, final SubLObject var2) {
        return module0256.f16529(var138, var2, (SubLObject)module0307.UNPROVIDED);
    }
    
    public static SubLObject f20878(final SubLObject var138, final SubLObject var2) {
        final SubLThread var139 = SubLProcess.currentSubLThread();
        final SubLObject var140 = module0034.$g879$.getDynamicValue(var139);
        SubLObject var141 = (SubLObject)module0307.NIL;
        if (module0307.NIL == var140) {
            return f20879(var138, var2);
        }
        var141 = module0034.f1857(var140, (SubLObject)module0307.$ic47$, (SubLObject)module0307.UNPROVIDED);
        if (module0307.NIL == var141) {
            var141 = module0034.f1807(module0034.f1842(var140), (SubLObject)module0307.$ic47$, (SubLObject)module0307.TWO_INTEGER, (SubLObject)module0307.NIL, (SubLObject)module0307.EQUAL, (SubLObject)module0307.UNPROVIDED);
            module0034.f1860(var140, (SubLObject)module0307.$ic47$, var141);
        }
        final SubLObject var142 = module0034.f1782(var138, var2);
        final SubLObject var143 = module0034.f1814(var141, var142, (SubLObject)module0307.UNPROVIDED);
        if (var143 != module0307.$ic9$) {
            SubLObject var144 = var143;
            SubLObject var145 = (SubLObject)module0307.NIL;
            var145 = var144.first();
            while (module0307.NIL != var144) {
                SubLObject var146 = var145.first();
                final SubLObject var147 = conses_high.second(var145);
                if (var138.equal(var146.first())) {
                    var146 = var146.rest();
                    if (module0307.NIL != var146 && module0307.NIL == var146.rest() && var2.equal(var146.first())) {
                        return module0034.f1959(var147);
                    }
                }
                var144 = var144.rest();
                var145 = var144.first();
            }
        }
        final SubLObject var148 = Values.arg2(var139.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f20879(var138, var2)));
        module0034.f1836(var141, var142, var143, var148, (SubLObject)ConsesLow.list(var138, var2));
        return module0034.f1959(var148);
    }
    
    public static SubLObject f20880(final SubLObject var270, final SubLObject var66, final SubLObject var2) {
        if (var66.isInteger() && var66.numG((SubLObject)module0307.ZERO_INTEGER)) {
            SubLObject var271 = (SubLObject)module0307.NIL;
            if (module0307.NIL == var271) {
                SubLObject var272;
                SubLObject var273;
                for (var272 = module0226.f14882(var270, var66, var2), var273 = (SubLObject)module0307.NIL, var273 = var272.first(); module0307.NIL == var271 && module0307.NIL != var272; var271 = f20881(var273, var2), var272 = var272.rest(), var273 = var272.first()) {}
            }
            if (module0307.NIL == var271) {
                SubLObject var272;
                SubLObject var273;
                for (var272 = module0226.f14895(var270, var66, var2), var273 = (SubLObject)module0307.NIL, var273 = var272.first(); module0307.NIL == var271 && module0307.NIL != var272; var271 = f20881(var273, var2), var272 = var272.rest(), var273 = var272.first()) {}
            }
            return var271;
        }
        return (SubLObject)module0307.NIL;
    }
    
    public static SubLObject f20881(final SubLObject var272, final SubLObject var2) {
        return module0004.f104((SubLObject)module0307.$ic48$, module0226.f14977(var272, var2), (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED);
    }
    
    public static SubLObject f20804(final SubLObject var270, final SubLObject var66, final SubLObject var2) {
        if (module0307.NIL != f20880(var270, var66, var2)) {
            return (SubLObject)module0307.$ic44$;
        }
        if (module0307.NIL != module0210.f13570(var270)) {
            return (SubLObject)module0307.$ic45$;
        }
        if (module0307.NIL != module0279.f18462(var270, var66, var2)) {
            return (SubLObject)module0307.$ic44$;
        }
        return (SubLObject)module0307.NIL;
    }
    
    public static SubLObject f20859(final SubLObject var257, final SubLObject var66) {
        final SubLThread var258 = SubLProcess.currentSubLThread();
        SubLObject var259 = (SubLObject)module0307.NIL;
        final SubLObject var260 = module0144.$g1825$.currentBinding(var258);
        final SubLObject var261 = module0018.$g604$.currentBinding(var258);
        try {
            module0144.$g1825$.bind((SubLObject)module0307.$ic25$, var258);
            module0018.$g604$.bind((SubLObject)module0307.$ic49$, var258);
            var259 = f20882(var257, var66, (SubLObject)module0307.NIL, (SubLObject)module0307.NIL, (SubLObject)module0307.$ic50$, (SubLObject)module0307.TWO_INTEGER);
        }
        finally {
            module0018.$g604$.rebind(var261, var258);
            module0144.$g1825$.rebind(var260, var258);
        }
        return var259;
    }
    
    public static SubLObject f20862(final SubLObject var257, final SubLObject var66) {
        final SubLThread var258 = SubLProcess.currentSubLThread();
        SubLObject var259 = (SubLObject)module0307.NIL;
        final SubLObject var260 = module0144.$g1825$.currentBinding(var258);
        final SubLObject var261 = module0018.$g604$.currentBinding(var258);
        try {
            module0144.$g1825$.bind((SubLObject)module0307.$ic25$, var258);
            module0018.$g604$.bind((SubLObject)module0307.$ic49$, var258);
            var259 = f20882(var257, var66, (SubLObject)module0307.NIL, (SubLObject)module0307.NIL, (SubLObject)module0307.$ic51$, (SubLObject)module0307.TWO_INTEGER);
        }
        finally {
            module0018.$g604$.rebind(var261, var258);
            module0144.$g1825$.rebind(var260, var258);
        }
        return var259;
    }
    
    public static SubLObject f20864(final SubLObject var257, final SubLObject var66) {
        final SubLThread var258 = SubLProcess.currentSubLThread();
        SubLObject var259 = (SubLObject)module0307.NIL;
        final SubLObject var260 = module0144.$g1825$.currentBinding(var258);
        final SubLObject var261 = module0018.$g604$.currentBinding(var258);
        try {
            module0144.$g1825$.bind((SubLObject)module0307.$ic27$, var258);
            module0018.$g604$.bind((SubLObject)module0307.$ic49$, var258);
            var259 = f20882(var257, var66, (SubLObject)module0307.NIL, (SubLObject)module0307.NIL, (SubLObject)module0307.$ic52$, (SubLObject)module0307.TWO_INTEGER);
        }
        finally {
            module0018.$g604$.rebind(var261, var258);
            module0144.$g1825$.rebind(var260, var258);
        }
        return var259;
    }
    
    public static SubLObject f20867(final SubLObject var257, final SubLObject var66, final SubLObject var160, final SubLObject var157) {
        return f20882(var257, var66, var160, var157, (SubLObject)module0307.$ic53$, (SubLObject)module0307.FOUR_INTEGER);
    }
    
    public static SubLObject f20869(final SubLObject var257, final SubLObject var66, final SubLObject var160, final SubLObject var157) {
        return f20882(var257, var66, var160, var157, (SubLObject)module0307.$ic54$, (SubLObject)module0307.FOUR_INTEGER);
    }
    
    public static SubLObject f20820(final SubLObject var257, final SubLObject var66, final SubLObject var246, final SubLObject var157) {
        SubLObject var258 = (SubLObject)module0307.NIL;
        if (module0307.NIL != module0210.f13565(var246)) {
            var258 = f20882(var257, var66, var246, var157, (SubLObject)module0307.$ic55$, (SubLObject)module0307.FOUR_INTEGER);
        }
        else {
            var258 = (SubLObject)module0307.NIL;
        }
        return var258;
    }
    
    public static SubLObject f20870(final SubLObject var257, final SubLObject var66, final SubLObject var246, final SubLObject var157) {
        SubLObject var258 = (SubLObject)module0307.NIL;
        if (module0307.NIL != module0210.f13565(var246)) {
            var258 = f20882(var257, var66, var246, var157, (SubLObject)module0307.$ic56$, (SubLObject)module0307.FOUR_INTEGER);
        }
        else {
            var258 = (SubLObject)module0307.NIL;
        }
        return var258;
    }
    
    public static SubLObject f20882(final SubLObject var257, final SubLObject var66, final SubLObject var160, final SubLObject var157, final SubLObject var273, final SubLObject var274) {
        return conses_high.copy_list(f20883(var257, var66, var160, var157, var273, var274, module0147.f9552((SubLObject)module0307.UNPROVIDED)));
    }
    
    public static SubLObject f20884() {
        final SubLObject var44 = module0307.$g2787$.getGlobalValue();
        if (module0307.NIL != var44) {
            module0034.f1818(var44);
        }
        return (SubLObject)module0307.NIL;
    }
    
    public static SubLObject f20885(final SubLObject var257, final SubLObject var66, final SubLObject var160, final SubLObject var157, final SubLObject var273, final SubLObject var274, final SubLObject var275) {
        return module0034.f1829(module0307.$g2787$.getGlobalValue(), (SubLObject)ConsesLow.list(var257, var66, var160, var157, var273, var274, var275), (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED);
    }
    
    public static SubLObject f20886(final SubLObject var257, final SubLObject var66, final SubLObject var160, final SubLObject var157, final SubLObject var273, final SubLObject var274, final SubLObject var275) {
        SubLObject var276 = (SubLObject)module0307.NIL;
        if (module0307.NIL != module0144.f9458() || module0307.NIL != module0144.f9459()) {
            var276 = f20887(var273, var274, var257, var66, var160, var157);
            if (module0307.NIL != module0144.f9458()) {
                SubLObject var277 = module0260.f17037(var257, (SubLObject)module0307.NIL, (SubLObject)module0307.NIL);
                SubLObject var278 = (SubLObject)module0307.NIL;
                var278 = var277.first();
                while (module0307.NIL != var277) {
                    var276 = ConsesLow.nconc(var276, f20887(var273, var274, var278, var66, var160, var157));
                    var277 = var277.rest();
                    var278 = var277.first();
                }
            }
            if (module0307.NIL != module0144.f9459()) {
                SubLObject var277 = module0260.f17038(var257, (SubLObject)module0307.NIL, (SubLObject)module0307.NIL);
                SubLObject var279 = (SubLObject)module0307.NIL;
                var279 = var277.first();
                while (module0307.NIL != var277) {
                    var276 = ConsesLow.nconc(var276, f20887(var273, var274, var279, module0226.f14913(var66), var160, var157));
                    var277 = var277.rest();
                    var279 = var277.first();
                }
            }
            var276 = module0035.f2273(var276);
        }
        else if (module0307.NIL != module0210.f13575(var257)) {
            var276 = f20887(var273, var274, var257, var66, var160, var157);
        }
        return var276;
    }
    
    public static SubLObject f20883(final SubLObject var257, final SubLObject var66, final SubLObject var160, final SubLObject var157, final SubLObject var273, final SubLObject var274, final SubLObject var275) {
        SubLObject var276 = module0307.$g2787$.getGlobalValue();
        if (module0307.NIL == var276) {
            var276 = module0034.f1934((SubLObject)module0307.$ic57$, (SubLObject)module0307.$ic58$, (SubLObject)module0307.$ic8$, (SubLObject)module0307.EQL, (SubLObject)module0307.SEVEN_INTEGER, (SubLObject)module0307.ZERO_INTEGER);
            module0034.f1940((SubLObject)module0307.$ic59$);
        }
        final SubLObject var277 = module0034.f1777(var257, var66, var160, var157, var273, var274, var275);
        final SubLObject var278 = module0034.f1814(var276, var277, (SubLObject)module0307.UNPROVIDED);
        if (var278 != module0307.$ic9$) {
            SubLObject var279 = var278;
            SubLObject var280 = (SubLObject)module0307.NIL;
            var280 = var279.first();
            while (module0307.NIL != var279) {
                SubLObject var281 = var280.first();
                final SubLObject var282 = conses_high.second(var280);
                if (var257.eql(var281.first())) {
                    var281 = var281.rest();
                    if (var66.eql(var281.first())) {
                        var281 = var281.rest();
                        if (var160.eql(var281.first())) {
                            var281 = var281.rest();
                            if (var157.eql(var281.first())) {
                                var281 = var281.rest();
                                if (var273.eql(var281.first())) {
                                    var281 = var281.rest();
                                    if (var274.eql(var281.first())) {
                                        var281 = var281.rest();
                                        if (module0307.NIL != var281 && module0307.NIL == var281.rest() && var275.eql(var281.first())) {
                                            return module0034.f1959(var282);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var279 = var279.rest();
                var280 = var279.first();
            }
        }
        final SubLObject var283 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f20886(var257, var66, var160, var157, var273, var274, var275)));
        module0034.f1836(var276, var277, var278, var283, (SubLObject)ConsesLow.list(var257, var66, var160, var157, var273, var274, var275));
        return module0034.f1959(var283);
    }
    
    public static SubLObject f20887(final SubLObject var273, final SubLObject var274, final SubLObject var257, final SubLObject var222, final SubLObject var160, final SubLObject var157) {
        SubLObject var275 = (SubLObject)module0307.NIL;
        if (var274.eql((SubLObject)module0307.TWO_INTEGER)) {
            if (var273.eql((SubLObject)module0307.$ic50$)) {
                var275 = module0226.f14882(var257, var222, (SubLObject)module0307.UNPROVIDED);
            }
            else if (var273.eql((SubLObject)module0307.$ic52$)) {
                var275 = module0226.f14935(var257, var222, (SubLObject)module0307.UNPROVIDED);
            }
            else {
                var275 = Functions.funcall(var273, var257, var222);
            }
        }
        else if (var274.eql((SubLObject)module0307.FOUR_INTEGER)) {
            if (var273.eql((SubLObject)module0307.$ic53$)) {
                var275 = f20888(var257, var222, var160, var157);
            }
            else if (var273.eql((SubLObject)module0307.$ic54$)) {
                var275 = f20889(var257, var222, var160, var157);
            }
            else if (var273.eql((SubLObject)module0307.$ic55$)) {
                var275 = f20890(var257, var222, var160, var157);
            }
            else if (var273.eql((SubLObject)module0307.$ic56$)) {
                var275 = f20891(var257, var222, var160, var157);
            }
            else {
                var275 = Functions.funcall(var273, var257, var222, var160, var157);
            }
        }
        else {
            module0303.f20193((SubLObject)module0307.$ic60$, var273, var274, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED);
        }
        return var275;
    }
    
    public static SubLObject f20888(final SubLObject var257, final SubLObject var66, final SubLObject var160, final SubLObject var157) {
        final SubLObject var258 = module0303.f20126(var157, var66);
        if (module0307.NIL != var258) {
            return f20892((SubLObject)module0307.$ic25$, var257, var66, var160, var258);
        }
        return (SubLObject)module0307.NIL;
    }
    
    public static SubLObject f20889(final SubLObject var257, final SubLObject var66, final SubLObject var160, final SubLObject var157) {
        final SubLObject var258 = module0303.f20130(var157, var66);
        if (module0307.NIL != var258) {
            return f20892((SubLObject)module0307.$ic27$, var257, var66, var160, var258);
        }
        return (SubLObject)module0307.NIL;
    }
    
    public static SubLObject f20892(final SubLObject var253, final SubLObject var257, final SubLObject var66, final SubLObject var160, final SubLObject var279) {
        SubLObject var280 = (SubLObject)module0307.NIL;
        if (module0307.NIL != module0158.f10010(var257, (SubLObject)module0307.ONE_INTEGER, var279)) {
            final SubLObject var281 = module0158.f10011(var257, (SubLObject)module0307.ONE_INTEGER, var279);
            SubLObject var282 = (SubLObject)module0307.NIL;
            final SubLObject var283 = (SubLObject)module0307.NIL;
            while (module0307.NIL == var282) {
                final SubLObject var284 = module0052.f3695(var281, var283);
                final SubLObject var285 = (SubLObject)SubLObjectFactory.makeBoolean(!var283.eql(var284));
                if (module0307.NIL != var285) {
                    SubLObject var286 = (SubLObject)module0307.NIL;
                    try {
                        var286 = module0158.f10316(var284, (SubLObject)module0307.$ic61$, (SubLObject)module0307.$ic62$, (SubLObject)module0307.NIL);
                        SubLObject var283_288 = (SubLObject)module0307.NIL;
                        final SubLObject var284_289 = (SubLObject)module0307.NIL;
                        while (module0307.NIL == var283_288) {
                            final SubLObject var287 = module0052.f3695(var286, var284_289);
                            final SubLObject var286_291 = (SubLObject)SubLObjectFactory.makeBoolean(!var284_289.eql(var287));
                            if (module0307.NIL != var286_291) {
                                final SubLObject var288 = module0178.f11335(var287);
                                final SubLObject var289 = module0178.f11336(var287);
                                var280 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var288, var289, var287), var280);
                            }
                            var283_288 = (SubLObject)SubLObjectFactory.makeBoolean(module0307.NIL == var286_291);
                        }
                    }
                    finally {
                        final SubLObject var290 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0307.T);
                            if (module0307.NIL != var286) {
                                module0158.f10319(var286);
                            }
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var290);
                        }
                    }
                }
                var282 = (SubLObject)SubLObjectFactory.makeBoolean(module0307.NIL == var285);
            }
        }
        if (module0307.NIL != var280) {
            return f20893(var280, var160, var66, var253);
        }
        return (SubLObject)module0307.NIL;
    }
    
    public static SubLObject f20893(final SubLObject var280, final SubLObject var160, final SubLObject var66, final SubLObject var253) {
        final SubLThread var281 = SubLProcess.currentSubLThread();
        SubLObject var282 = (SubLObject)module0307.NIL;
        final SubLObject var283 = Mapping.mapcar(Symbols.symbol_function((SubLObject)module0307.$ic63$), var280);
        final SubLObject var284 = (var253 == module0307.$ic25$) ? module0259.f16857(var160, var283, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED) : module0256.f16575(var160, var283, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED);
        if (module0307.NIL != var284) {
            SubLObject var285 = var280;
            SubLObject var286 = (SubLObject)module0307.NIL;
            var286 = var285.first();
            while (module0307.NIL != var285) {
                SubLObject var288;
                final SubLObject var287 = var288 = var286;
                SubLObject var289 = (SubLObject)module0307.NIL;
                SubLObject var290 = (SubLObject)module0307.NIL;
                SubLObject var291 = (SubLObject)module0307.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var288, var287, (SubLObject)module0307.$ic64$);
                var289 = var288.first();
                var288 = var288.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var288, var287, (SubLObject)module0307.$ic64$);
                var290 = var288.first();
                var288 = var288.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var288, var287, (SubLObject)module0307.$ic64$);
                var291 = var288.first();
                var288 = var288.rest();
                if (module0307.NIL == var288) {
                    if (module0307.NIL != module0004.f104(var289, var284, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED)) {
                        module0303.f20257((SubLObject)module0307.FIVE_INTEGER, (SubLObject)module0307.$ic65$, var253, var66, module0144.$g1832$.getDynamicValue(var281), var291, (SubLObject)module0307.UNPROVIDED);
                        final SubLObject var292 = module0144.$g1846$.currentBinding(var281);
                        try {
                            module0144.$g1846$.bind(var291, var281);
                            module0303.f20195(var291, var290, var253, module0144.$g1845$.getDynamicValue(var281));
                            var282 = (SubLObject)ConsesLow.cons(var290, var282);
                        }
                        finally {
                            module0144.$g1846$.rebind(var292, var281);
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var287, (SubLObject)module0307.$ic64$);
                }
                var285 = var285.rest();
                var286 = var285.first();
            }
        }
        return var282;
    }
    
    public static SubLObject f20890(final SubLObject var257, final SubLObject var66, final SubLObject var246, final SubLObject var157) {
        final SubLObject var258 = module0303.f20126(var157, var66);
        if (module0307.NIL != var258) {
            return f20892((SubLObject)module0307.$ic27$, var257, var66, var246, var258);
        }
        return (SubLObject)module0307.NIL;
    }
    
    public static SubLObject f20891(final SubLObject var257, final SubLObject var66, final SubLObject var246, final SubLObject var157) {
        return f20889(var257, var66, var246, var157);
    }
    
    public static SubLObject f20894(final SubLObject var299, SubLObject var253, SubLObject var2) {
        if (var253 == module0307.UNPROVIDED) {
            var253 = (SubLObject)module0307.$ic25$;
        }
        if (var2 == module0307.UNPROVIDED) {
            var2 = (SubLObject)module0307.NIL;
        }
        return f20784(var299, var253, var2);
    }
    
    public static SubLObject f20784(final SubLObject var299, SubLObject var253, SubLObject var2) {
        if (var253 == module0307.UNPROVIDED) {
            var253 = (SubLObject)module0307.$ic25$;
        }
        if (var2 == module0307.UNPROVIDED) {
            var2 = (SubLObject)module0307.NIL;
        }
        final SubLThread var300 = SubLProcess.currentSubLThread();
        final SubLObject var301 = module0144.$g1850$.getDynamicValue(var300);
        if (var301.eql((SubLObject)module0307.$ic66$)) {
            return f20895(var299, var253, var2);
        }
        if (var301.eql((SubLObject)module0307.$ic67$)) {
            return f20896(var299, var253, var2);
        }
        return (SubLObject)module0307.NIL;
    }
    
    public static SubLObject f20895(final SubLObject var299, SubLObject var253, SubLObject var2) {
        if (var253 == module0307.UNPROVIDED) {
            var253 = (SubLObject)module0307.$ic25$;
        }
        if (var2 == module0307.UNPROVIDED) {
            var2 = (SubLObject)module0307.NIL;
        }
        SubLObject var300 = (SubLObject)module0307.NIL;
        SubLObject var301 = (SubLObject)module0307.NIL;
        SubLObject var302 = (SubLObject)module0307.NIL;
        if (module0307.NIL == var300) {
            SubLObject var303 = var299;
            SubLObject var304 = (SubLObject)module0307.NIL;
            var304 = var303.first();
            while (module0307.NIL == var300 && module0307.NIL != var303) {
                var302 = module0257.f16688(var304.rest(), var2);
                if (module0307.NIL != var302) {
                    var301 = (SubLObject)module0307.T;
                    var300 = module0303.f20199((SubLObject)module0307.T);
                    module0303.f20203(f20897(var253, var304.first(), var302, var2));
                }
                var303 = var303.rest();
                var304 = var303.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0307.NIL == var301);
    }
    
    public static SubLObject f20897(final SubLObject var253, final SubLObject var303, final SubLObject var304, final SubLObject var2) {
        SubLObject var305 = (SubLObject)module0307.NIL;
        SubLObject var306 = (SubLObject)module0307.NIL;
        if (var253.eql((SubLObject)module0307.$ic25$)) {
            var306 = (SubLObject)module0307.$ic29$;
        }
        else if (var253.eql((SubLObject)module0307.$ic26$)) {
            var306 = (SubLObject)module0307.$ic68$;
        }
        else if (var253.eql((SubLObject)module0307.$ic27$)) {
            var306 = (SubLObject)module0307.$ic69$;
        }
        if (module0307.NIL == module0152.f9715()) {
            var305 = module0302.f20041();
        }
        return (SubLObject)ConsesLow.listS(var306, var303, var304, var2, ConsesLow.append(var305, (SubLObject)module0307.NIL));
    }
    
    public static SubLObject f20896(final SubLObject var299, SubLObject var253, SubLObject var2) {
        if (var253 == module0307.UNPROVIDED) {
            var253 = (SubLObject)module0307.$ic25$;
        }
        if (var2 == module0307.UNPROVIDED) {
            var2 = (SubLObject)module0307.NIL;
        }
        SubLObject var300 = (SubLObject)module0307.NIL;
        SubLObject var301 = (SubLObject)module0307.NIL;
        SubLObject var302 = (SubLObject)module0307.NIL;
        if (module0307.NIL == var300) {
            SubLObject var303 = var299;
            SubLObject var304 = (SubLObject)module0307.NIL;
            var304 = var303.first();
            while (module0307.NIL == var300 && module0307.NIL != var303) {
                var302 = module0257.f16688(var304.rest(), var2);
                if (module0307.NIL != var302) {
                    var301 = (SubLObject)module0307.T;
                    var300 = module0303.f20199((SubLObject)module0307.T);
                    final SubLObject var305 = var253;
                    if (var305.eql((SubLObject)module0307.$ic25$)) {
                        module0303.f20203((SubLObject)ConsesLow.list((SubLObject)module0307.$ic29$, var304.first(), var302, var2));
                    }
                    else if (var305.eql((SubLObject)module0307.$ic26$)) {
                        module0303.f20203((SubLObject)ConsesLow.list((SubLObject)module0307.$ic68$, var304.first(), var302, var2));
                    }
                    else if (var305.eql((SubLObject)module0307.$ic27$)) {
                        module0303.f20203((SubLObject)ConsesLow.list((SubLObject)module0307.$ic69$, var304.first(), var302, var2));
                    }
                }
                var303 = var303.rest();
                var304 = var303.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0307.NIL == var301);
    }
    
    public static SubLObject f20860(final SubLObject var257, final SubLObject var244, SubLObject var2) {
        if (var2 == module0307.UNPROVIDED) {
            var2 = (SubLObject)module0307.NIL;
        }
        if (module0307.NIL != module0173.f10955(var257)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0307.NIL != module0222.f14635(module0307.$ic70$, var257, (SubLObject)module0307.ONE_INTEGER, (SubLObject)module0307.UNPROVIDED) && module0307.NIL != module0220.f14582(module0307.$ic70$, var257, var244, var2, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED, (SubLObject)module0307.UNPROVIDED));
        }
        return (SubLObject)module0307.NIL;
    }
    
    public static SubLObject f20898() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20733", "S#20663", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20734", "S#20636", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20737", "S#23383", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20738", "S#20637", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20736", "S#23384", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20740", "S#23385", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20743", "S#23386", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20745", "S#23387", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20746", "S#23388", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20747", "S#23389", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20744", "S#23390", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20748", "S#23391", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20735", "S#23392", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20749", "S#23393", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20752", "S#23394", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20751", "S#23395", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20753", "S#23396", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20754", "S#23397", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20750", "S#23398", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20755", "S#20640", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20756", "S#20641", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20757", "S#20662", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20759", "S#23399", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20760", "FORMULA-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20761", "S#23400", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20764", "S#23401", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20765", "S#22785", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20766", "S#23402", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20767", "S#23403", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20769", "S#23404", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20770", "S#23405", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20772", "S#20888", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20762", "S#23406", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20768", "S#23407", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20763", "S#23408", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20778", "S#23409", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20779", "S#23410", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20781", "S#23411", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20782", "S#16452", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20774", "S#23412", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20739", "S#23413", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20783", "S#23414", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20742", "S#23415", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20741", "S#23416", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20790", "S#21741", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20791", "S#21742", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20786", "S#23417", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20787", "S#23418", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20788", "S#23419", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20792", "S#21743", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20794", "S#23420", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20795", "S#23421", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20775", "S#23422", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20780", "S#23423", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20776", "S#23424", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20797", "S#21474", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20798", "S#23425", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20799", "S#23426", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20793", "S#23427", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20796", "S#23428", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20800", "S#23429", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20801", "S#23430", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20812", "S#23431", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20813", "S#23432", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20785", "S#23433", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20789", "S#23434", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20771", "S#23435", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20773", "S#23436", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20821", "S#23437", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20758", "S#23438", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20824", "S#23439", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20825", "S#23440", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20830", "S#23441", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20832", "S#23442", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20833", "S#23443", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20826", "S#23444", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20835", "S#23445", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20828", "S#23446", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20822", "S#23447", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20839", "S#23448", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20823", "S#23449", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20834", "S#23450", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20831", "S#23451", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20843", "S#23381", 1, 0, false);
        new $f20843$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20836", "S#23452", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20837", "S#23453", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20827", "S#23454", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20829", "S#23455", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20838", "S#23456", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20840", "S#23457", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20848", "S#23458", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20849", "S#23459", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20802", "S#23460", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20806", "S#23461", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20809", "S#23462", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20805", "S#23463", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20808", "S#23464", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20811", "S#23465", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20841", "S#23466", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20844", "S#23467", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20846", "S#23468", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20842", "S#23469", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20845", "S#23470", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20847", "S#23471", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20856", "S#23472", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20850", "S#23473", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20851", "S#23474", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20852", "S#23475", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20853", "POS-LIT-VARIABLE-ISA-CONSTRAINTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20858", "S#23476", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20857", "S#23477", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20854", "S#23478", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20855", "POS-LIT-VARIABLE-GENL-CONSTRAINTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20814", "S#23479", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20817", "S#23480", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20816", "POS-LIT-VARIABLE-INTER-ARG-ISA-CONSTRAINTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20866", "S#23481", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20819", "POS-LIT-VARIABLE-INTER-ARG-GENL-CONSTRAINTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20803", "S#16707", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20807", "S#23482", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20810", "S#23483", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20872", "S#23484", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20873", "S#23485", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20874", "S#23486", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20815", "S#23487", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20818", "S#23488", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20875", "S#23489", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20876", "S#23490", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20877", "S#23491", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20861", "RELATION-VARIABLE-ISA-CONSTRAINTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20863", "S#23492", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20865", "RELATION-VARIABLE-GENL-CONSTRAINTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20868", "RELATION-VARIABLE-INTER-ARG-ISA-CONSTRAINTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20871", "RELATION-VARIABLE-INTER-ARG-GENL-CONSTRAINTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20777", "S#23493", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20879", "S#23494", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20878", "S#23495", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20880", "S#23496", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20881", "S#23497", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20804", "S#23498", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20859", "S#23499", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20862", "S#23500", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20864", "S#23501", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20867", "S#23502", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20869", "S#23503", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20820", "S#23504", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20870", "S#23505", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20882", "S#23506", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20884", "S#23382", 0, 0, false);
        new $f20884$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20885", "S#23507", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20886", "S#23508", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20883", "S#23509", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20887", "S#23510", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20888", "S#23511", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20889", "S#23512", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20892", "S#23513", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20893", "S#23514", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20890", "S#23515", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20891", "S#23516", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20894", "S#23517", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20784", "S#23518", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20895", "S#23519", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20897", "S#23520", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20896", "S#23521", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0307", "f20860", "S#23522", 2, 1, false);
        return (SubLObject)module0307.NIL;
    }
    
    public static SubLObject f20899() {
        module0307.$g2785$ = SubLFiles.deflexical("S#23523", (SubLObject)module0307.NIL);
        module0307.$g2786$ = SubLFiles.defparameter("S#23524", (SubLObject)module0307.$ic11$);
        module0307.$g2787$ = SubLFiles.deflexical("S#23525", (SubLObject)module0307.NIL);
        return (SubLObject)module0307.NIL;
    }
    
    public static SubLObject f20900() {
        module0034.f1909((SubLObject)module0307.$ic5$);
        module0034.f1895((SubLObject)module0307.$ic35$);
        module0034.f1895((SubLObject)module0307.$ic47$);
        module0034.f1909((SubLObject)module0307.$ic57$);
        return (SubLObject)module0307.NIL;
    }
    
    public void declareFunctions() {
        f20898();
    }
    
    public void initializeVariables() {
        f20899();
    }
    
    public void runTopLevelForms() {
        f20900();
    }
    
    static {
        me = (SubLFile)new module0307();
        module0307.$g2785$ = null;
        module0307.$g2786$ = null;
        module0307.$g2787$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("??PRED-MUFFET-212");
        $ic1$ = SubLObjectFactory.makeSymbol("EL-VAR?");
        $ic2$ = SubLObjectFactory.makeSymbol("S#12629", "CYC");
        $ic3$ = SubLObjectFactory.makeSymbol("S#15529", "CYC");
        $ic4$ = SubLObjectFactory.makeKeyword("BAD-EXPONENTIAL-CONJUNCTION");
        $ic5$ = SubLObjectFactory.makeSymbol("S#23390", "CYC");
        $ic6$ = SubLObjectFactory.makeSymbol("S#21748", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#23523", "CYC");
        $ic8$ = SubLObjectFactory.makeInteger(1024);
        $ic9$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic10$ = SubLObjectFactory.makeKeyword("BAD-EXPONENTIAL-DISJUNCTION");
        $ic11$ = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $ic12$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("pragmaticRequirement"));
        $ic13$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("trueSentence"));
        $ic14$ = SubLObjectFactory.makeSymbol("S#23394", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#23396", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#23397", "CYC");
        $ic17$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("termChosen"));
        $ic18$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("and"));
        $ic19$ = SubLObjectFactory.makeKeyword("RECURSION-LIMIT-EXCEEDED");
        $ic20$ = SubLObjectFactory.makeKeyword("INVALID-EXPANSION");
        $ic21$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic22$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls"));
        $ic23$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("quotedIsa"));
        $ic24$ = SubLObjectFactory.makeSymbol("VARIABLE-P");
        $ic25$ = SubLObjectFactory.makeKeyword("ISA");
        $ic26$ = SubLObjectFactory.makeKeyword("QUOTED-ISA");
        $ic27$ = SubLObjectFactory.makeKeyword("GENLS");
        $ic28$ = SubLObjectFactory.makeKeyword("IGNORE");
        $ic29$ = SubLObjectFactory.makeKeyword("DISJOINT-ARG-ISA");
        $ic30$ = SubLObjectFactory.makeSymbol("S#15755", "CYC");
        $ic31$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"));
        $ic32$ = SubLObjectFactory.makeSymbol("S#23381", "CYC");
        $ic33$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#18763", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#23526", "CYC"));
        $ic34$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#23527", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#23528", "CYC"));
        $ic35$ = SubLObjectFactory.makeSymbol("S#23477", "CYC");
        $ic36$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TruthFunction"));
        $ic37$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Predicate"));
        $ic38$ = SubLObjectFactory.makeSymbol("?DUMMY");
        $ic39$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ListOfTypeFn"));
        $ic40$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Thing"));
        $ic41$ = SubLObjectFactory.makeKeyword("REGULARIZE");
        $ic42$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ListOfSpecsFn"));
        $ic43$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SpecsFn"));
        $ic44$ = SubLObjectFactory.makeKeyword("DNF");
        $ic45$ = SubLObjectFactory.makeKeyword("CNF");
        $ic46$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Relation"));
        $ic47$ = SubLObjectFactory.makeSymbol("S#23495", "CYC");
        $ic48$ = SubLObjectFactory.makeSymbol("CYC-QUERY?");
        $ic49$ = SubLObjectFactory.makeSymbol("S#22840", "CYC");
        $ic50$ = SubLObjectFactory.makeSymbol("ARGN-ISA");
        $ic51$ = SubLObjectFactory.makeSymbol("ARGN-QUOTED-ISA");
        $ic52$ = SubLObjectFactory.makeSymbol("ARGN-GENL");
        $ic53$ = SubLObjectFactory.makeSymbol("S#23511", "CYC");
        $ic54$ = SubLObjectFactory.makeSymbol("S#23512", "CYC");
        $ic55$ = SubLObjectFactory.makeSymbol("S#23515", "CYC");
        $ic56$ = SubLObjectFactory.makeSymbol("S#23516", "CYC");
        $ic57$ = SubLObjectFactory.makeSymbol("S#23509", "CYC");
        $ic58$ = SubLObjectFactory.makeSymbol("S#23525", "CYC");
        $ic59$ = SubLObjectFactory.makeSymbol("S#23382", "CYC");
        $ic60$ = SubLObjectFactory.makeString("got an unexpected function ~s with arity ~s~%");
        $ic61$ = SubLObjectFactory.makeKeyword("GAF");
        $ic62$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic63$ = SubLObjectFactory.makeSymbol("FIRST");
        $ic64$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#23529", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#23530", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION", "CYC"));
        $ic65$ = SubLObjectFactory.makeString("~%at var ~a test: arg ~s ~s; constraint ~s");
        $ic66$ = SubLObjectFactory.makeKeyword("NOT-DISJOINT");
        $ic67$ = SubLObjectFactory.makeKeyword("NEGLITS-SUBSUME-POSLITS");
        $ic68$ = SubLObjectFactory.makeKeyword("DISJOINT-ARG-QUOTED-ISA");
        $ic69$ = SubLObjectFactory.makeKeyword("DISJOINT-ARG-GENL");
        $ic70$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("modalInArg"));
    }
    
    public static final class $f20843$UnaryFunction extends UnaryFunction
    {
        public $f20843$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#23381"));
        }
        
        public SubLObject processItem(final SubLObject var211) {
            return module0307.f20843(var211);
        }
    }
    
    public static final class $f20884$ZeroArityFunction extends ZeroArityFunction
    {
        public $f20884$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#23382"));
        }
        
        public SubLObject processItem() {
            return module0307.f20884();
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0307.class
	Total time: 1808 ms
	
	Decompiled with Procyon 0.5.32.
*/