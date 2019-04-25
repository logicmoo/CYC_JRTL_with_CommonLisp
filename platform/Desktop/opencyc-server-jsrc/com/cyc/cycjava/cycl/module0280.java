package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0280 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0280";
    public static final String myFingerPrint = "ca719c99ef4bb082fe683b4b1aa63892517ad939b01f489b3b01da0a5c3c8d53";
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLInteger $ic4$;
    private static final SubLString $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLObject $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLObject $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLObject $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLString $ic21$;
    private static final SubLObject $ic22$;
    private static final SubLObject $ic23$;
    private static final SubLObject $ic24$;
    private static final SubLObject $ic25$;
    private static final SubLObject $ic26$;
    private static final SubLObject $ic27$;
    private static final SubLObject $ic28$;
    private static final SubLString $ic29$;
    
    public static SubLObject f18630(final SubLObject var1) {
        return module0035.f2439((SubLObject)$ic0$, var1, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f18631(final SubLObject var1) {
        if (NIL != f18630(var1)) {
            return f18632(var1);
        }
        return var1;
    }
    
    public static SubLObject f18633(final SubLObject var2, final SubLObject var3, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        final SubLThread var5 = SubLProcess.currentSubLThread();
        if (NIL == module0161.f10481(var3)) {
            return (SubLObject)NIL;
        }
        SubLObject var6 = (SubLObject)NIL;
        final SubLObject var7 = module0147.f9540(var3);
        final SubLObject var8 = module0147.$g2095$.currentBinding(var5);
        final SubLObject var9 = module0147.$g2094$.currentBinding(var5);
        final SubLObject var10 = module0147.$g2096$.currentBinding(var5);
        try {
            module0147.$g2095$.bind(module0147.f9545(var7), var5);
            module0147.$g2094$.bind(module0147.f9546(var7), var5);
            module0147.$g2096$.bind(module0147.f9549(var7), var5);
            if (NIL != module0202.f12590(var2)) {
                if (NIL != ((NIL != var4) ? module0278.f18416(var2, (SubLObject)UNPROVIDED) : module0205.f13215(Symbols.symbol_function((SubLObject)$ic1$), var2, (SubLObject)NIL, (SubLObject)UNPROVIDED))) {
                    var6 = (SubLObject)T;
                }
                else if (NIL == var4 && NIL != module0205.f13215(Symbols.symbol_function((SubLObject)$ic2$), var2, (SubLObject)NIL, (SubLObject)UNPROVIDED)) {
                    var6 = (SubLObject)T;
                }
                else if (NIL != ((NIL != var4) ? module0202.f12654(var2) : module0205.f13215(Symbols.symbol_function((SubLObject)$ic3$), var2, (SubLObject)NIL, (SubLObject)UNPROVIDED))) {
                    var6 = (SubLObject)T;
                }
            }
        }
        finally {
            module0147.$g2096$.rebind(var10, var5);
            module0147.$g2094$.rebind(var9, var5);
            module0147.$g2095$.rebind(var8, var5);
        }
        return var6;
    }
    
    public static SubLObject f18634(final SubLObject var2, final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = var2;
        SubLObject var6 = var3;
        if (NIL != f18633(var2, var3, (SubLObject)UNPROVIDED)) {
            final SubLObject var7 = module0146.$g2031$.currentBinding(var4);
            final SubLObject var8 = module0146.$g2003$.currentBinding(var4);
            try {
                module0146.$g2031$.bind((NIL != module0146.$g2031$.getDynamicValue(var4)) ? module0146.$g2031$.getDynamicValue(var4) : Hashtables.make_hash_table((SubLObject)$ic4$, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED), var4);
                module0146.$g2003$.bind((SubLObject)((NIL != module0146.$g2003$.getDynamicValue(var4)) ? module0146.$g2003$.getDynamicValue(var4) : NIL), var4);
                final SubLObject var9 = module0146.$g2042$.getDynamicValue(var4);
                final SubLObject var8_14 = module0034.$g879$.currentBinding(var4);
                try {
                    module0034.$g879$.bind(var9, var4);
                    SubLObject var10 = (SubLObject)NIL;
                    if (NIL != var9 && NIL == module0034.f1842(var9)) {
                        var10 = module0034.f1869(var9);
                        final SubLObject var11 = Threads.current_process();
                        if (NIL == var10) {
                            module0034.f1873(var9, var11);
                        }
                        else if (!var10.eql(var11)) {
                            Errors.error((SubLObject)$ic5$);
                        }
                    }
                    try {
                        var4.resetMultipleValues();
                        final SubLObject var17_18 = f18635(var2, var3);
                        final SubLObject var19_20 = var4.secondMultipleValue();
                        var4.resetMultipleValues();
                        var5 = var17_18;
                        var6 = var19_20;
                    }
                    finally {
                        final SubLObject var8_15 = Threads.$is_thread_performing_cleanupP$.currentBinding(var4);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var4);
                            if (NIL != var9 && NIL == var10) {
                                module0034.f1873(var9, (SubLObject)NIL);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var8_15, var4);
                        }
                    }
                }
                finally {
                    module0034.$g879$.rebind(var8_14, var4);
                }
            }
            finally {
                module0146.$g2003$.rebind(var8, var4);
                module0146.$g2031$.rebind(var7, var4);
            }
        }
        return Values.values(var5, var6);
    }
    
    public static SubLObject f18636(final SubLObject var2, final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = var2;
        SubLObject var6 = var3;
        if (NIL != f18633(var2, var3, (SubLObject)UNPROVIDED)) {
            final SubLObject var7 = module0146.$g2042$.getDynamicValue(var4);
            final SubLObject var8 = module0034.$g879$.currentBinding(var4);
            try {
                module0034.$g879$.bind(var7, var4);
                SubLObject var9 = (SubLObject)NIL;
                if (NIL != var7 && NIL == module0034.f1842(var7)) {
                    var9 = module0034.f1869(var7);
                    final SubLObject var10 = Threads.current_process();
                    if (NIL == var9) {
                        module0034.f1873(var7, var10);
                    }
                    else if (!var9.eql(var10)) {
                        Errors.error((SubLObject)$ic5$);
                    }
                }
                try {
                    var4.resetMultipleValues();
                    final SubLObject var24_25 = f18635(var2, var3);
                    final SubLObject var26_27 = var4.secondMultipleValue();
                    var4.resetMultipleValues();
                    var5 = var24_25;
                    var6 = var26_27;
                }
                finally {
                    final SubLObject var8_28 = Threads.$is_thread_performing_cleanupP$.currentBinding(var4);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var4);
                        if (NIL != var7 && NIL == var9) {
                            module0034.f1873(var7, (SubLObject)NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var8_28, var4);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var8, var4);
            }
        }
        return Values.values(var5, var6);
    }
    
    public static SubLObject f18637(SubLObject var2, SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        var2 = module0202.f12763(var2);
        var3 = module0161.f10519(var3);
        var2 = module0276.f18296(var2);
        if (NIL != module0146.$g2013$.getDynamicValue(var4)) {
            SubLObject var5 = (SubLObject)NIL;
            try {
                var4.throwStack.push($ic7$);
                try {
                    var4.throwStack.push($ic8$);
                    var4.resetMultipleValues();
                    final SubLObject var30_31 = module0278.f18414(var2, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    final SubLObject var32_33 = var4.secondMultipleValue();
                    var4.resetMultipleValues();
                    var2 = var30_31;
                    var3 = var32_33;
                }
                catch (Throwable var6) {
                    var5 = Errors.handleThrowable(var6, (SubLObject)$ic8$);
                }
                finally {
                    var4.throwStack.pop();
                }
            }
            catch (Throwable var6) {
                var5 = Errors.handleThrowable(var6, (SubLObject)$ic7$);
            }
            finally {
                var4.throwStack.pop();
            }
            if (NIL != var5) {
                if (NIL != module0152.$g2115$.getDynamicValue(var4)) {
                    module0274.f18082(var5);
                }
                return Values.values((SubLObject)NIL, var3);
            }
            var2 = f18638(var2);
            var3 = f18638(var3);
        }
        if (NIL != var2 && NIL != var3) {
            var2 = f18639(var2);
            final SubLObject var7 = module0146.$g2057$.currentBinding(var4);
            try {
                module0146.$g2057$.bind((SubLObject)NIL, var4);
                var2 = module0276.f18293(var2, (SubLObject)UNPROVIDED);
            }
            finally {
                module0146.$g2057$.rebind(var7, var4);
            }
        }
        return Values.values(var2, var3);
    }
    
    public static SubLObject f18635(final SubLObject var2, final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = module0034.$g879$.getDynamicValue(var4);
        SubLObject var6 = (SubLObject)NIL;
        if (NIL == var5) {
            return f18637(var2, var3);
        }
        var6 = module0034.f1857(var5, (SubLObject)$ic6$, (SubLObject)UNPROVIDED);
        if (NIL == var6) {
            var6 = module0034.f1807(module0034.f1842(var5), (SubLObject)$ic6$, (SubLObject)TWO_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var5, (SubLObject)$ic6$, var6);
        }
        final SubLObject var7 = module0034.f1782(var2, var3);
        final SubLObject var8 = module0034.f1814(var6, var7, (SubLObject)UNPROVIDED);
        if (var8 != $ic9$) {
            SubLObject var9 = var8;
            SubLObject var10 = (SubLObject)NIL;
            var10 = var9.first();
            while (NIL != var9) {
                SubLObject var11 = var10.first();
                final SubLObject var12 = conses_high.second(var10);
                if (var2.equal(var11.first())) {
                    var11 = var11.rest();
                    if (NIL != var11 && NIL == var11.rest() && var3.equal(var11.first())) {
                        return module0034.f1959(var12);
                    }
                }
                var9 = var9.rest();
                var10 = var9.first();
            }
        }
        final SubLObject var13 = Values.arg2(var4.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f18637(var2, var3)));
        module0034.f1836(var6, var7, var8, var13, (SubLObject)ConsesLow.list(var2, var3));
        return module0034.f1959(var13);
    }
    
    public static SubLObject f18638(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        try {
            var3.throwStack.push($ic10$);
            final SubLObject var6 = module0205.$g2314$.currentBinding(var3);
            try {
                module0205.$g2314$.bind((SubLObject)$ic11$, var3);
                var5 = module0205.f13151(var2, Symbols.symbol_function((SubLObject)$ic2$), Symbols.symbol_function((SubLObject)$ic12$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            finally {
                module0205.$g2314$.rebind(var6, var3);
            }
        }
        catch (Throwable var7) {
            var4 = Errors.handleThrowable(var7, (SubLObject)$ic10$);
        }
        finally {
            var3.throwStack.pop();
        }
        if (NIL != var4) {
            if (NIL != module0152.$g2115$.getDynamicValue(var3)) {
                module0274.f18082(var4);
            }
            return (SubLObject)NIL;
        }
        return var5;
    }
    
    public static SubLObject f18640(final SubLObject var44) {
        final SubLThread var45 = SubLProcess.currentSubLThread();
        var45.resetMultipleValues();
        final SubLObject var46 = module0229.f15243(var44);
        final SubLObject var47 = var45.secondMultipleValue();
        var45.resetMultipleValues();
        if (NIL != var47) {
            return var46;
        }
        return Dynamic.sublisp_throw((SubLObject)$ic10$, (SubLObject)ConsesLow.list((SubLObject)$ic10$, var44));
    }
    
    public static SubLObject f18641(final SubLObject var44) {
        final SubLThread var45 = SubLProcess.currentSubLThread();
        var45.resetMultipleValues();
        final SubLObject var46 = module0229.f15243(var44);
        final SubLObject var47 = var45.secondMultipleValue();
        var45.resetMultipleValues();
        if (NIL != var47) {
            return var46;
        }
        return var44;
    }
    
    public static SubLObject f18642(final SubLObject var47, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(NIL != f18643(module0205.f13132(var47), var3) && NIL != module0202.f12880(var47) && NIL != f18644(var47, var3));
    }
    
    public static SubLObject f18643(final SubLObject var47, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (NIL != module0173.f10955(var47)) {
            return (SubLObject)makeBoolean(NIL != f18645(var47) && NIL != module0220.f14548(var47, $ic13$, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18645(final SubLObject var47) {
        return module0222.f14635($ic13$, var47, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f18644(final SubLObject var47, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var48 = SubLProcess.currentSubLThread();
        SubLObject var49 = (SubLObject)NIL;
        final SubLObject var50 = var3;
        final SubLObject var51 = module0147.$g2094$.currentBinding(var48);
        final SubLObject var52 = module0147.$g2095$.currentBinding(var48);
        try {
            module0147.$g2094$.bind(module0147.f9531(var50), var48);
            module0147.$g2095$.bind(module0147.f9534(var50), var48);
            var49 = (SubLObject)makeBoolean(NIL == module0205.f13145((SubLObject)$ic14$, var47, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        finally {
            module0147.$g2095$.rebind(var52, var48);
            module0147.$g2094$.rebind(var51, var48);
        }
        return var49;
    }
    
    public static SubLObject f18646(final SubLObject var47, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(NIL != module0202.f12590(var47) && NIL != module0229.f15238(var47) && NIL == f18643(module0205.f13132(var47), var3));
    }
    
    public static SubLObject f18632(final SubLObject var2) {
        return module0205.f13147(var2, (SubLObject)$ic0$, (SubLObject)$ic15$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f18647(final SubLObject var47) {
        return (SubLObject)makeBoolean(NIL != f18648(module0205.f13132(var47)) && NIL != module0202.f12880(var47) && NIL != f18649(var47));
    }
    
    public static SubLObject f18648(final SubLObject var47) {
        if (NIL != module0173.f10955(var47)) {
            return f18650(var47);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18650(final SubLObject var47) {
        return module0222.f14635($ic16$, var47, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f18649(final SubLObject var47) {
        final SubLThread var48 = SubLProcess.currentSubLThread();
        SubLObject var49 = (SubLObject)NIL;
        final SubLObject var50 = module0147.$g2094$.currentBinding(var48);
        final SubLObject var51 = module0147.$g2095$.currentBinding(var48);
        try {
            module0147.$g2094$.bind((SubLObject)$ic17$, var48);
            module0147.$g2095$.bind($ic18$, var48);
            var49 = (SubLObject)makeBoolean(NIL == module0205.f13145((SubLObject)$ic19$, var47, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        finally {
            module0147.$g2095$.rebind(var51, var48);
            module0147.$g2094$.rebind(var50, var48);
        }
        return var49;
    }
    
    public static SubLObject f18651(final SubLObject var47) {
        return (SubLObject)makeBoolean(NIL != module0202.f12590(var47) && NIL != module0229.f15238(var47) && NIL == f18648(module0205.f13132(var47)));
    }
    
    public static SubLObject f18639(final SubLObject var53) {
        if (NIL == module0205.f13215(Symbols.symbol_function((SubLObject)$ic3$), var53, (SubLObject)NIL, (SubLObject)UNPROVIDED)) {
            return var53;
        }
        final SubLObject var54 = module0202.f12707(var53, (SubLObject)UNPROVIDED);
        final SubLObject var53_56 = (NIL != var54) ? module0202.f12712(var53) : var53;
        SubLObject var55 = (SubLObject)NIL;
        var55 = f18652(var53_56);
        if (NIL != var54) {
            return module0202.f12711(var54, var55);
        }
        return var55;
    }
    
    public static SubLObject f18652(final SubLObject var53) {
        final SubLThread var54 = SubLProcess.currentSubLThread();
        SubLObject var55 = (SubLObject)NIL;
        final SubLObject var56 = module0144.$g1796$.currentBinding(var54);
        final SubLObject var57 = module0144.$g1795$.currentBinding(var54);
        final SubLObject var58 = module0152.$g2116$.currentBinding(var54);
        final SubLObject var59 = module0152.$g2115$.currentBinding(var54);
        try {
            module0144.$g1796$.bind((SubLObject)NIL, var54);
            module0144.$g1795$.bind((SubLObject)NIL, var54);
            module0152.$g2116$.bind((SubLObject)NIL, var54);
            module0152.$g2115$.bind((SubLObject)NIL, var54);
            if (NIL != module0202.f12592(var53)) {
                var55 = module0202.f12771(f18652(module0205.f13379(var53, (SubLObject)UNPROVIDED)));
            }
            else if (NIL != module0202.f12595(var53)) {
                var55 = module0276.f18287(Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic20$), module0205.f13377(var53, (SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED);
            }
            else if (NIL != module0202.f12594(var53)) {
                var55 = module0276.f18280(Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic20$), module0205.f13377(var53, (SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED);
            }
            else if (NIL != module0202.f12597(var53)) {
                var55 = module0202.f12774(f18652(module0205.f13379(var53, (SubLObject)UNPROVIDED)), f18652(module0205.f13380(var53, (SubLObject)UNPROVIDED)));
            }
            else if (NIL != module0202.f12654(var53)) {
                var55 = f18653(var53);
            }
            else if (NIL != module0207.f13519(var53)) {
                var55 = module0202.f12777(module0202.f12743(var53), module0202.f12744(var53), f18652(module0202.f12668(var53)));
            }
            else if (NIL != module0202.f12623(var53)) {
                var55 = module0202.f12778(module0202.f12743(var53), module0202.f12748(var53), module0202.f12744(var53), f18652(module0202.f12668(var53)));
            }
            else if (NIL != module0202.f12639(var53)) {
                var55 = var53;
            }
            else if (NIL != module0207.f13523(var53)) {
                var55 = var53;
            }
            else if (NIL != module0207.f13511(var53)) {
                var55 = var53;
            }
            else {
                module0202.f12747((SubLObject)FOUR_INTEGER, (SubLObject)$ic21$, var53, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var55 = var53;
            }
        }
        finally {
            module0152.$g2115$.rebind(var59, var54);
            module0152.$g2116$.rebind(var58, var54);
            module0144.$g1795$.rebind(var57, var54);
            module0144.$g1796$.rebind(var56, var54);
        }
        return var55;
    }
    
    public static SubLObject f18653(final SubLObject var53) {
        final SubLObject var54 = module0205.f13380(var53, (SubLObject)UNPROVIDED);
        final SubLObject var55 = module0288.f19342(var54, (SubLObject)UNPROVIDED);
        SubLObject var56 = (SubLObject)NIL;
        SubLObject var57 = var55;
        SubLObject var58 = (SubLObject)NIL;
        var58 = var57.first();
        while (NIL != var57) {
            if (NIL == module0210.f13566(var58)) {
                module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic29$, var54, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                return var53;
            }
            final SubLObject var59 = module0205.f13333(var53);
            if (var59.eql($ic22$)) {
                var56 = (SubLObject)ConsesLow.cons(module0202.f12774(f18652(module0205.f13379(var53, (SubLObject)UNPROVIDED)), module0202.f12768($ic23$, module0202.f12683($ic24$, module0178.f11348(var58), (SubLObject)UNPROVIDED), var58)), var56);
            }
            else if (var59.eql($ic25$)) {
                var56 = (SubLObject)ConsesLow.cons(module0202.f12768($ic23$, module0202.f12643($ic24$, module0205.f13379(var53, (SubLObject)UNPROVIDED)), var58), var56);
            }
            else if (var59.eql($ic26$)) {
                var56 = (SubLObject)ConsesLow.cons(module0202.f12774(module0202.f12643($ic27$, f18652(module0205.f13379(var53, (SubLObject)UNPROVIDED))), module0202.f12768($ic28$, module0202.f12683($ic24$, module0178.f11348(var58), (SubLObject)UNPROVIDED), var58)), var56);
            }
            var57 = var57.rest();
            var58 = var57.first();
        }
        if (NIL == var56) {
            return var53;
        }
        if (NIL != module0035.f1997(var56)) {
            return var56.first();
        }
        return module0276.f18287(var56, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f18654() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0280", "f18630", "S#21213", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0280", "f18631", "S#21214", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0280", "f18633", "S#21215", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0280", "f18634", "S#13435", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0280", "f18636", "S#21216", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0280", "f18637", "S#21217", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0280", "f18635", "S#21218", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0280", "f18638", "S#21219", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0280", "f18640", "S#21220", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0280", "f18641", "S#21211", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0280", "f18642", "S#21212", 1, 1, false);
        new $f18642$UnaryFunction();
        new $f18642$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0280", "f18643", "S#21221", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0280", "f18645", "S#21222", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0280", "f18644", "S#21223", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0280", "f18646", "S#21224", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0280", "f18632", "S#21225", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0280", "f18647", "S#21226", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0280", "f18648", "S#21227", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0280", "f18650", "S#21228", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0280", "f18649", "S#21229", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0280", "f18651", "S#21230", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0280", "f18639", "S#21231", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0280", "f18652", "S#21232", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0280", "f18653", "S#21233", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18655() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18656() {
        module0034.f1895((SubLObject)$ic6$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f18654();
    }
    
    public void initializeVariables() {
        f18655();
    }
    
    public void runTopLevelForms() {
        f18656();
    }
    
    static {
        me = (SubLFile)new module0280();
        $ic0$ = makeSymbol("S#21226", "CYC");
        $ic1$ = makeSymbol("S#20996", "CYC");
        $ic2$ = makeSymbol("S#21212", "CYC");
        $ic3$ = makeSymbol("S#15485", "CYC");
        $ic4$ = makeInteger(32);
        $ic5$ = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic6$ = makeSymbol("S#21218", "CYC");
        $ic7$ = makeKeyword("RECURSION-LIMIT-EXCEEDED");
        $ic8$ = makeKeyword("INVALID-EXPANSION");
        $ic9$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic10$ = makeKeyword("EL-UNEVALUATABLE-EXPRESSION");
        $ic11$ = makeSymbol("S#16052", "CYC");
        $ic12$ = makeSymbol("S#21220", "CYC");
        $ic13$ = constant_handles_oc.f8479((SubLObject)makeString("evaluateAtEL"));
        $ic14$ = makeSymbol("S#21224", "CYC");
        $ic15$ = makeSymbol("S#21211", "CYC");
        $ic16$ = constant_handles_oc.f8479((SubLObject)makeString("evaluateImmediately"));
        $ic17$ = makeSymbol("S#12274", "CYC");
        $ic18$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic19$ = makeSymbol("S#21230", "CYC");
        $ic20$ = makeSymbol("S#21232", "CYC");
        $ic21$ = makeString("~s is not a well-formed sentence");
        $ic22$ = constant_handles_oc.f8479((SubLObject)makeString("exceptWhen"));
        $ic23$ = constant_handles_oc.f8479((SubLObject)makeString("abnormal"));
        $ic24$ = constant_handles_oc.f8479((SubLObject)makeString("TheList"));
        $ic25$ = constant_handles_oc.f8479((SubLObject)makeString("exceptFor"));
        $ic26$ = constant_handles_oc.f8479((SubLObject)makeString("pragmaticRequirement"));
        $ic27$ = constant_handles_oc.f8479((SubLObject)makeString("querySentence"));
        $ic28$ = constant_handles_oc.f8479((SubLObject)makeString("meetsPragmaticRequirement"));
        $ic29$ = makeString("no assertion for meta-arg: ~s");
    }
    
    public static final class $f18642$UnaryFunction extends UnaryFunction
    {
        public $f18642$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#21212"));
        }
        
        public SubLObject processItem(final SubLObject var48) {
            return f18642(var48, (SubLObject)$f18642$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f18642$BinaryFunction extends BinaryFunction
    {
        public $f18642$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#21212"));
        }
        
        public SubLObject processItem(final SubLObject var48, final SubLObject var49) {
            return f18642(var48, var49);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 218 ms
	
	Decompiled with Procyon 0.5.32.
*/