package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0388 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0388";
    public static final String myFingerPrint = "7087c7ac02014f3ae1bb14249160a88e703dde1e060691bca3ea84d3581bd367";
    private static SubLSymbol $g3242$;
    private static SubLSymbol $g3243$;
    private static SubLSymbol $g3244$;
    private static SubLSymbol $g3245$;
    private static final SubLString $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLString $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLString $ic8$;
    private static final SubLString $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLString $ic12$;
    private static final SubLString $ic13$;
    private static final SubLString $ic14$;
    private static final SubLString $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLString $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLString $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLList $ic23$;
    private static final SubLList $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    
    public static SubLObject f27577(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)module0388.NIL;
        SubLObject var6 = (SubLObject)module0388.NIL;
        final SubLObject var7 = module0363.f24514(var1);
        final SubLObject var8 = module0034.$g879$.currentBinding(var4);
        try {
            module0034.$g879$.bind(var7, var4);
            SubLObject var9 = (SubLObject)module0388.NIL;
            if (module0388.NIL != var7 && module0388.NIL == module0034.f1842(var7)) {
                var9 = module0034.f1869(var7);
                final SubLObject var10 = Threads.current_process();
                if (module0388.NIL == var9) {
                    module0034.f1873(var7, var10);
                }
                else if (!var9.eql(var10)) {
                    Errors.error((SubLObject)module0388.$ic0$);
                }
            }
            try {
                var4.resetMultipleValues();
                final SubLObject var11_12 = f27578(var1, var2, var3);
                final SubLObject var13_14 = var4.secondMultipleValue();
                var4.resetMultipleValues();
                var5 = var11_12;
                var6 = var13_14;
            }
            finally {
                final SubLObject var8_15 = Threads.$is_thread_performing_cleanupP$.currentBinding(var4);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0388.T, var4);
                    if (module0388.NIL != var7 && module0388.NIL == var9) {
                        module0034.f1873(var7, (SubLObject)module0388.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var8_15, var4);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var8, var4);
        }
        return Values.values(var5, var6);
    }
    
    public static SubLObject f27579(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = module0361.f24117(module0363.f24507(var1));
        final SubLObject var6 = module0034.$g879$.currentBinding(var4);
        try {
            module0034.$g879$.bind(var5, var4);
            SubLObject var7 = (SubLObject)module0388.NIL;
            if (module0388.NIL != var5 && module0388.NIL == module0034.f1842(var5)) {
                var7 = module0034.f1869(var5);
                final SubLObject var8 = Threads.current_process();
                if (module0388.NIL == var7) {
                    module0034.f1873(var5, var8);
                }
                else if (!var7.eql(var8)) {
                    Errors.error((SubLObject)module0388.$ic0$);
                }
            }
            try {
                return f27580(var1, var2, var3);
            }
            finally {
                final SubLObject var8_16 = Threads.$is_thread_performing_cleanupP$.currentBinding(var4);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0388.T, var4);
                    if (module0388.NIL != var5 && module0388.NIL == var7) {
                        module0034.f1873(var5, (SubLObject)module0388.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var8_16, var4);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var6, var4);
        }
    }
    
    public static SubLObject f27578(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = module0034.$g879$.getDynamicValue(var4);
        SubLObject var6 = (SubLObject)module0388.NIL;
        if (module0388.NIL == var5) {
            return f27579(var1, var2, var3);
        }
        var6 = module0034.f1857(var5, (SubLObject)module0388.$ic1$, (SubLObject)module0388.UNPROVIDED);
        if (module0388.NIL == var6) {
            var6 = module0034.f1807(module0034.f1842(var5), (SubLObject)module0388.$ic1$, (SubLObject)module0388.THREE_INTEGER, (SubLObject)module0388.NIL, (SubLObject)module0388.EQUAL, (SubLObject)module0388.UNPROVIDED);
            module0034.f1860(var5, (SubLObject)module0388.$ic1$, var6);
        }
        final SubLObject var7 = module0034.f1781(var1, var2, var3);
        final SubLObject var8 = module0034.f1814(var6, var7, (SubLObject)module0388.UNPROVIDED);
        if (var8 != module0388.$ic3$) {
            SubLObject var9 = var8;
            SubLObject var10 = (SubLObject)module0388.NIL;
            var10 = var9.first();
            while (module0388.NIL != var9) {
                SubLObject var11 = var10.first();
                final SubLObject var12 = conses_high.second(var10);
                if (var1.equal(var11.first())) {
                    var11 = var11.rest();
                    if (var2.equal(var11.first())) {
                        var11 = var11.rest();
                        if (module0388.NIL != var11 && module0388.NIL == var11.rest() && var3.equal(var11.first())) {
                            return module0034.f1959(var12);
                        }
                    }
                }
                var9 = var9.rest();
                var10 = var9.first();
            }
        }
        final SubLObject var13 = Values.arg2(var4.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f27579(var1, var2, var3)));
        module0034.f1836(var6, var7, var8, var13, (SubLObject)ConsesLow.list(var1, var2, var3));
        return module0034.f1959(var13);
    }
    
    public static SubLObject f27580(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        assert module0388.NIL != module0373.f26190(var2) : var2;
        SubLObject var5 = (SubLObject)module0388.NIL;
        SubLObject var6 = (SubLObject)module0388.NIL;
        if (module0388.NIL == module0361.f24163(module0363.f24507(var1))) {
            var5 = (SubLObject)module0388.$ic5$;
            var6 = (SubLObject)module0388.$ic6$;
        }
        else if (module0388.NIL != module0363.f24553(var1)) {
            var5 = (SubLObject)module0388.$ic7$;
            var6 = (SubLObject)module0388.$ic8$;
        }
        else if (module0388.NIL == var3) {
            var5 = (SubLObject)module0388.$ic7$;
            var6 = (SubLObject)module0388.$ic9$;
        }
        else {
            module0373.f26191(var1, var2);
            var4.resetMultipleValues();
            final SubLObject var26_27 = f27581(var1, var2, var3);
            final SubLObject var28_29 = var4.secondMultipleValue();
            var4.resetMultipleValues();
            var5 = var26_27;
            var6 = var28_29;
            if (module0388.$ic10$ != var5) {
                if (module0388.NIL != f27582(var1, var2)) {
                    var5 = (SubLObject)module0388.$ic11$;
                    var6 = (SubLObject)module0388.$ic12$;
                }
                else if (module0388.NIL != f27583(var1)) {
                    var5 = (SubLObject)((module0388.NIL != var3) ? module0388.$ic11$ : module0388.$ic5$);
                    var6 = (SubLObject)module0388.$ic13$;
                }
                else if (module0388.NIL != f27584(var1, var2)) {
                    var5 = (SubLObject)module0388.$ic7$;
                    var6 = (SubLObject)module0388.$ic14$;
                }
                else if (module0388.NIL != module0384.f27297(var1, var2)) {
                    var5 = (SubLObject)module0388.$ic7$;
                    var6 = (SubLObject)module0388.$ic15$;
                }
            }
        }
        return Values.values(var5, var6);
    }
    
    public static SubLObject f27581(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)module0388.NIL;
        SubLObject var6 = (SubLObject)module0388.NIL;
        if (module0388.NIL != module0363.f24573(var1)) {
            var4.resetMultipleValues();
            final SubLObject var30_31 = f27585(var1, (SubLObject)module0388.$ic16$);
            final SubLObject var32_33 = var4.secondMultipleValue();
            var4.resetMultipleValues();
            var5 = var30_31;
            var6 = var32_33;
        }
        else {
            if (module0388.NIL != module0363.f24578(var1)) {
                return module0383.$g3224$.getGlobalValue();
            }
            var4.resetMultipleValues();
            final SubLObject var34_35 = module0358.f23659(var1, var2, var3);
            final SubLObject var36_37 = var4.secondMultipleValue();
            var4.resetMultipleValues();
            var5 = var34_35;
            var6 = var36_37;
        }
        return Values.values(var5, var6);
    }
    
    public static SubLObject f27583(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0388.NIL != module0363.f24562(var1) && module0388.$ic17$ == module0363.f24568(var1));
    }
    
    public static SubLObject f27585(final SubLObject var1, final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0388.$ic11$;
        SubLObject var4 = (SubLObject)module0388.$ic18$;
        SubLObject var6;
        final SubLObject var5 = var6 = f27586(var1, var2);
        SubLObject var7 = (SubLObject)module0388.NIL;
        var7 = var6.first();
        while (module0388.NIL != var6) {
            final SubLObject var8 = module0367.f25201(var7, var2);
            if (module0388.NIL != var8 && module0388.NIL != module0358.f23676(var8, var3)) {
                var3 = var8;
                var4 = module0367.f25202(var7, var2);
            }
            var6 = var6.rest();
            var7 = var6.first();
        }
        return Values.values(var3, var4);
    }
    
    public static SubLObject f27586(final SubLObject var1, final SubLObject var2) {
        if (module0388.$ic16$ == var2) {
            return Sequences.remove_if(Symbols.symbol_function((SubLObject)module0388.$ic19$), module0363.f24517(var1), (SubLObject)module0388.UNPROVIDED, (SubLObject)module0388.UNPROVIDED, (SubLObject)module0388.UNPROVIDED, (SubLObject)module0388.UNPROVIDED);
        }
        return Errors.error((SubLObject)module0388.$ic20$, var2);
    }
    
    public static SubLObject f27584(final SubLObject var1, final SubLObject var2) {
        SubLObject var3 = module0363.f24517(var1);
        SubLObject var4 = (SubLObject)module0388.NIL;
        var4 = var3.first();
        while (module0388.NIL != var3) {
            if (module0388.NIL != module0363.f24524(var4, (SubLObject)module0388.$ic21$) && module0388.NIL != module0384.f27359(var4, var2) && (module0388.NIL == module0367.f24997(var2) || module0388.NIL == module0384.f27276(var2, var4, (SubLObject)module0388.$ic22$))) {
                return (SubLObject)module0388.T;
            }
            var3 = var3.rest();
            var4 = var3.first();
        }
        return (SubLObject)module0388.NIL;
    }
    
    public static SubLObject f27582(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = module0363.f24517(var1);
        SubLObject var5 = (SubLObject)module0388.NIL;
        var5 = var4.first();
        while (module0388.NIL != var4) {
            if (module0388.NIL == module0367.f24997(var2) || module0388.NIL == module0365.f24882(var5) || module0388.NIL == ((module0388.NIL != module0388.$g3242$.getDynamicValue(var3)) ? module0384.f27278(var2, var5, (SubLObject)module0388.$ic22$) : module0384.f27276(var2, var5, (SubLObject)module0388.$ic22$))) {
                if (module0388.NIL != module0365.f24885(var5)) {
                    return (SubLObject)module0388.NIL;
                }
                if (module0388.NIL != module0373.f26176(var5)) {
                    if (module0388.NIL == module0384.f27361(var5, var2)) {
                        return (SubLObject)module0388.NIL;
                    }
                }
                else if (module0388.NIL == module0384.f27366(var5, var2)) {
                    return (SubLObject)module0388.NIL;
                }
            }
            var4 = var4.rest();
            var5 = var4.first();
        }
        return (SubLObject)module0388.T;
    }
    
    public static SubLObject f27587(final SubLObject var42, final SubLObject var43, final SubLObject var5, final SubLObject var44) {
        SubLObject var45 = f27588(var42, f27589(var43));
        var45 = f27588(var45, f27590(var5));
        var45 = f27588(var45, f27591(var44));
        return var45;
    }
    
    public static SubLObject f27588(final SubLObject var45, final SubLObject var46) {
        return module0048.f3367(var45, var46);
    }
    
    public static SubLObject f27589(final SubLObject var43) {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        final SubLObject var45 = module0035.f2294(module0388.$g3243$.getDynamicValue(var44), var43, (SubLObject)module0388.UNPROVIDED, (SubLObject)module0388.UNPROVIDED);
        if (module0388.NIL != var45) {
            SubLObject var47;
            final SubLObject var46 = var47 = var45;
            SubLObject var48 = (SubLObject)module0388.NIL;
            SubLObject var49 = (SubLObject)module0388.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var47, var46, (SubLObject)module0388.$ic24$);
            var48 = var47.first();
            var47 = var47.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var47, var46, (SubLObject)module0388.$ic24$);
            var49 = var47.first();
            var47 = var47.rest();
            if (module0388.NIL == var47) {
                return var48;
            }
            cdestructuring_bind.cdestructuring_bind_error(var46, (SubLObject)module0388.$ic24$);
        }
        return (SubLObject)module0388.ONE_INTEGER;
    }
    
    public static SubLObject f27590(final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        final SubLObject var7 = module0035.f2294(module0388.$g3243$.getDynamicValue(var6), var5, (SubLObject)module0388.UNPROVIDED, (SubLObject)module0388.UNPROVIDED);
        if (module0388.NIL != var7) {
            SubLObject var9;
            final SubLObject var8 = var9 = var7;
            SubLObject var10 = (SubLObject)module0388.NIL;
            SubLObject var11 = (SubLObject)module0388.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)module0388.$ic24$);
            var10 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)module0388.$ic24$);
            var11 = var9.first();
            var9 = var9.rest();
            if (module0388.NIL == var9) {
                return var10;
            }
            cdestructuring_bind.cdestructuring_bind_error(var8, (SubLObject)module0388.$ic24$);
        }
        return (SubLObject)module0388.ONE_INTEGER;
    }
    
    public static SubLObject f27591(final SubLObject var44) {
        final SubLThread var45 = SubLProcess.currentSubLThread();
        if (module0388.NIL != module0388.$g3244$.getDynamicValue(var45) && var44.numG((SubLObject)module0388.ONE_INTEGER)) {
            return Numbers.invert(var44);
        }
        return (SubLObject)module0388.ONE_INTEGER;
    }
    
    public static SubLObject f27592(final SubLObject var54, final SubLObject var55, final SubLObject var56, final SubLObject var57, final SubLObject var58, final SubLObject var59, final SubLObject var60, final SubLObject var61) {
        if (module0388.NIL != module0358.f23683(var55)) {
            return (SubLObject)module0388.NIL;
        }
        if (module0388.NIL != module0358.f23683(var59)) {
            return (SubLObject)module0388.T;
        }
        final SubLObject var62 = f27587(var54, var55, var56, var57);
        final SubLObject var63 = f27587(var58, var59, var60, var61);
        return module0048.f3360(var62, var63);
    }
    
    public static SubLObject f27593(final SubLObject var41, final SubLObject var2) {
        final SubLThread var42 = SubLProcess.currentSubLThread();
        if (module0388.NIL != module0392.f27957(var2) && module0388.NIL != f27594(var41, var2)) {
            return (SubLObject)module0388.T;
        }
        if (module0388.NIL != module0373.f26163(var41)) {
            if (module0388.NIL != module0373.f26165(var41)) {
                if (module0388.ZERO_INTEGER.eql(module0367.f25203(var41, var2))) {
                    final SubLObject var43 = module0367.f25198(var41, var2);
                    if (module0388.NIL != f27595(var43) && module0388.NIL != f27596(var41, var2)) {
                        return (SubLObject)module0388.T;
                    }
                }
            }
            else if (module0388.NIL != module0382.f27206(var41) && module0388.NIL != f27596(var41, var2)) {
                var42.resetMultipleValues();
                final SubLObject var44 = module0382.f27212(var41);
                final SubLObject var45 = var42.secondMultipleValue();
                var42.resetMultipleValues();
                final SubLObject var46 = module0364.f24736(var44);
                final SubLObject var47 = module0364.f24736(var45);
                final SubLObject var48 = module0385.f27404(var46, var2);
                final SubLObject var49 = module0385.f27404(var47, var2);
                final SubLObject var50 = module0382.f27204(var44, var45);
                final SubLObject var51 = module0382.f27205(var44, var45);
                if ((module0388.ZERO_INTEGER.eql(var48) && module0388.NIL != f27595(f27577(var46, var2, var50))) || (module0388.ZERO_INTEGER.eql(var49) && module0388.NIL != f27595(f27577(var47, var2, var51)))) {
                    return (SubLObject)module0388.T;
                }
            }
        }
        return (SubLObject)module0388.NIL;
    }
    
    public static SubLObject f27595(final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        return module0358.f23684(var5, module0388.$g3245$.getDynamicValue(var6));
    }
    
    public static SubLObject f27596(final SubLObject var41, final SubLObject var2) {
        final SubLObject var42 = module0367.f25198(var41, var2);
        SubLObject var43 = module0363.f24517(module0365.f24850(var41));
        SubLObject var44 = (SubLObject)module0388.NIL;
        var44 = var43.first();
        while (module0388.NIL != var43) {
            if (module0388.NIL != module0363.f24524(var44, (SubLObject)module0388.$ic26$) && !var44.eql(var41)) {
                final SubLObject var45 = module0367.f25198(var44, var2);
                if (module0388.NIL != module0358.f23663(var42, var45)) {
                    return (SubLObject)module0388.T;
                }
            }
            var43 = var43.rest();
            var44 = var43.first();
        }
        return (SubLObject)module0388.NIL;
    }
    
    public static SubLObject f27594(final SubLObject var41, final SubLObject var2) {
        final SubLThread var42 = SubLProcess.currentSubLThread();
        if (module0388.NIL != module0373.f26163(var41)) {
            if (module0388.NIL != module0373.f26165(var41)) {
                final SubLObject var43 = module0373.f26168(var41);
                if (module0388.NIL != f27597(var43, var2) && module0388.NIL != f27596(var41, var2)) {
                    return (SubLObject)module0388.T;
                }
            }
            else if (module0388.NIL != module0382.f27206(var41)) {
                var42.resetMultipleValues();
                final SubLObject var44 = module0382.f27211(var41);
                final SubLObject var45 = var42.secondMultipleValue();
                var42.resetMultipleValues();
                if (module0388.NIL != f27597(var44, var2) && module0388.NIL != f27597(var45, var2) && module0388.NIL != f27596(var41, var2)) {
                    return (SubLObject)module0388.T;
                }
            }
        }
        return (SubLObject)module0388.NIL;
    }
    
    public static SubLObject f27597(final SubLObject var1, final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0388.NIL;
        SubLObject var4 = module0363.f24517(var1);
        SubLObject var5 = (SubLObject)module0388.NIL;
        var5 = var4.first();
        while (module0388.NIL != var4) {
            if (module0388.NIL != module0365.f24882(var5) && module0388.NIL == module0384.f27284(var2, var5, (SubLObject)module0388.$ic22$) && module0388.NIL == module0384.f27276(var2, var5, (SubLObject)module0388.$ic22$)) {
                var3 = (SubLObject)ConsesLow.cons(var5, var3);
            }
            var4 = var4.rest();
            var5 = var4.first();
        }
        if (module0388.NIL != module0035.f1997(var3) && module0388.NIL != module0365.f24888(var3.first())) {
            return (SubLObject)module0388.T;
        }
        return (SubLObject)module0388.NIL;
    }
    
    public static SubLObject f27598() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0388", "f27577", "S#29308", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0388", "f27579", "S#30663", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0388", "f27578", "S#30664", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0388", "f27580", "S#30665", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0388", "f27581", "S#30666", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0388", "f27583", "S#30667", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0388", "f27585", "S#30668", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0388", "f27586", "S#30669", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0388", "f27584", "S#30670", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0388", "f27582", "S#30671", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0388", "f27587", "S#30672", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0388", "f27588", "S#30673", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0388", "f27589", "S#30674", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0388", "f27590", "S#30675", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0388", "f27591", "S#30676", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0388", "f27592", "S#30677", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0388", "f27593", "S#30678", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0388", "f27595", "S#30679", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0388", "f27596", "S#30680", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0388", "f27594", "S#30681", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0388", "f27597", "S#30682", 2, 0, false);
        return (SubLObject)module0388.NIL;
    }
    
    public static SubLObject f27599() {
        module0388.$g3242$ = SubLFiles.defparameter("S#30683", (SubLObject)module0388.NIL);
        module0388.$g3243$ = SubLFiles.defparameter("S#30684", (SubLObject)module0388.$ic23$);
        module0388.$g3244$ = SubLFiles.defparameter("S#30685", (SubLObject)module0388.T);
        module0388.$g3245$ = SubLFiles.defparameter("S#30686", (SubLObject)module0388.$ic25$);
        return (SubLObject)module0388.NIL;
    }
    
    public static SubLObject f27600() {
        module0034.f1895((SubLObject)module0388.$ic1$);
        return (SubLObject)module0388.NIL;
    }
    
    public void declareFunctions() {
        f27598();
    }
    
    public void initializeVariables() {
        f27599();
    }
    
    public void runTopLevelForms() {
        f27600();
    }
    
    static {
        me = (SubLFile)new module0388();
        module0388.$g3242$ = null;
        module0388.$g3243$ = null;
        module0388.$g3244$ = null;
        module0388.$g3245$ = null;
        $ic0$ = SubLObjectFactory.makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic1$ = SubLObjectFactory.makeSymbol("S#30664", "CYC");
        $ic2$ = SubLObjectFactory.makeSymbol("S#5859", "CYC");
        $ic3$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic4$ = SubLObjectFactory.makeSymbol("S#27373", "CYC");
        $ic5$ = SubLObjectFactory.makeKeyword("GROSSLY-DISPREFERRED");
        $ic6$ = SubLObjectFactory.makeString("removal is not allowed in the problem store");
        $ic7$ = SubLObjectFactory.makeKeyword("PREFERRED");
        $ic8$ = SubLObjectFactory.makeString("problem is closed");
        $ic9$ = SubLObjectFactory.makeString("no variables have any hope of getting bound");
        $ic10$ = SubLObjectFactory.makeKeyword("DOOMED");
        $ic11$ = SubLObjectFactory.makeKeyword("DISALLOWED");
        $ic12$ = SubLObjectFactory.makeString("problem has no removal-allowed or executed tactics");
        $ic13$ = SubLObjectFactory.makeString("single negative literal");
        $ic14$ = SubLObjectFactory.makeString("problem has a complete non-thrown-away removal tactic");
        $ic15$ = SubLObjectFactory.makeString("problem has executed a complete removal tactic");
        $ic16$ = SubLObjectFactory.makeKeyword("TACTICAL");
        $ic17$ = SubLObjectFactory.makeKeyword("NEG");
        $ic18$ = SubLObjectFactory.makeString("unknown");
        $ic19$ = SubLObjectFactory.makeSymbol("S#27340", "CYC");
        $ic20$ = SubLObjectFactory.makeString("Unexpected strategy type ~s");
        $ic21$ = SubLObjectFactory.makeKeyword("GENERALIZED-REMOVAL");
        $ic22$ = SubLObjectFactory.makeKeyword("REMOVAL");
        $ic23$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DISPREFERRED"), (SubLObject)module0388.TWO_INTEGER, (SubLObject)module0388.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GROSSLY-DISPREFERRED"), (SubLObject)module0388.TWENTY_INTEGER, (SubLObject)module0388.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("JOIN-ORDERED"), (SubLObject)module0388.FIVE_INTEGER, (SubLObject)module0388.ZERO_INTEGER));
        $ic24$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13112", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#174", "CYC"));
        $ic25$ = SubLObjectFactory.makeKeyword("DISPREFERRED");
        $ic26$ = SubLObjectFactory.makeKeyword("LOGICAL");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0388.class
	Total time: 176 ms
	
	Decompiled with Procyon 0.5.32.
*/