package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0573 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0573";
    public static final String myFingerPrint = "6722c7a9e64a77f43bd7ff4aa257540127154c317b1c4ad762b5e3621f386be5";
    private static SubLSymbol $g4166$;
    public static SubLSymbol $g4167$;
    private static SubLSymbol $g4168$;
    private static final SubLList $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLList $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLList $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLString $ic21$;
    private static final SubLList $ic22$;
    private static final SubLList $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLString $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLString $ic29$;
    private static final SubLString $ic30$;
    private static final SubLString $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLString $ic35$;
    private static final SubLString $ic36$;
    private static final SubLString $ic37$;
    private static final SubLString $ic38$;
    private static final SubLString $ic39$;
    private static final SubLString $ic40$;
    private static final SubLString $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLString $ic44$;
    private static final SubLString $ic45$;
    private static final SubLString $ic46$;
    private static final SubLString $ic47$;
    private static final SubLString $ic48$;
    private static final SubLString $ic49$;
    private static final SubLString $ic50$;
    private static final SubLString $ic51$;
    private static final SubLString $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLString $ic55$;
    private static final SubLString $ic56$;
    private static final SubLInteger $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLInteger $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    
    public static SubLObject f35083() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0110.$g1385$.getDynamicValue(var1);
    }
    
    public static SubLObject f35084(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0573.$ic0$);
        final SubLObject var6 = var5.rest();
        var5 = var5.first();
        SubLObject var7 = (SubLObject)module0573.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0573.$ic0$);
        var7 = var5.first();
        var5 = var5.rest();
        SubLObject var8 = (SubLObject)module0573.NIL;
        SubLObject var9 = var5;
        SubLObject var10 = (SubLObject)module0573.NIL;
        SubLObject var11_12 = (SubLObject)module0573.NIL;
        while (module0573.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var4, (SubLObject)module0573.$ic0$);
            var11_12 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var4, (SubLObject)module0573.$ic0$);
            if (module0573.NIL == conses_high.member(var11_12, (SubLObject)module0573.$ic1$, (SubLObject)module0573.UNPROVIDED, (SubLObject)module0573.UNPROVIDED)) {
                var10 = (SubLObject)module0573.T;
            }
            if (var11_12 == module0573.$ic2$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0573.NIL != var10 && module0573.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)module0573.$ic0$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0573.$ic3$, var5);
        final SubLObject var12 = (SubLObject)((module0573.NIL != var11) ? conses_high.cadr(var11) : module0573.NIL);
        final SubLObject var13;
        var5 = (var13 = var6);
        final SubLObject var14 = (SubLObject)module0573.$ic4$;
        final SubLObject var15 = (SubLObject)module0573.$ic5$;
        final SubLObject var16 = (SubLObject)module0573.$ic6$;
        return (SubLObject)ConsesLow.list((SubLObject)module0573.$ic7$, (SubLObject)ConsesLow.list(var14), (SubLObject)ConsesLow.list((SubLObject)module0573.$ic8$, (SubLObject)ConsesLow.list(var14), (SubLObject)ConsesLow.list((SubLObject)module0573.$ic7$, (SubLObject)ConsesLow.list(var15, var16), (SubLObject)ConsesLow.list((SubLObject)module0573.$ic9$, reader.bq_cons(var7, (SubLObject)module0573.$ic10$), (SubLObject)ConsesLow.listS((SubLObject)module0573.$ic11$, var15, (SubLObject)module0573.$ic12$), (SubLObject)((module0573.NIL != var12) ? ConsesLow.listS((SubLObject)module0573.$ic13$, (SubLObject)ConsesLow.list(var12, var16), ConsesLow.append(var13, (SubLObject)module0573.NIL)) : reader.bq_cons((SubLObject)module0573.$ic14$, ConsesLow.append(var13, (SubLObject)module0573.NIL)))), (SubLObject)ConsesLow.listS((SubLObject)module0573.$ic15$, var15, (SubLObject)module0573.$ic16$), (SubLObject)ConsesLow.listS((SubLObject)module0573.$ic17$, var16, (SubLObject)module0573.$ic18$))), (SubLObject)ConsesLow.list((SubLObject)module0573.$ic17$, (SubLObject)ConsesLow.list((SubLObject)module0573.$ic19$, var14), (SubLObject)ConsesLow.list((SubLObject)module0573.$ic20$, (SubLObject)module0573.$ic21$, (SubLObject)module0573.$ic22$, var14)));
    }
    
    public static SubLObject f35085(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        SubLObject var6 = (SubLObject)module0573.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0573.$ic23$);
        var6 = var5.first();
        final SubLObject var7;
        var5 = (var7 = var5.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0573.$ic17$, (SubLObject)ConsesLow.list((SubLObject)module0573.$ic24$, var6), ConsesLow.append(var7, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0573.$ic25$, var6))));
    }
    
    public static SubLObject f35086(final SubLObject var7) {
        if (module0573.NIL == f35087(var7)) {
            return (SubLObject)module0573.NIL;
        }
        if (module0573.NIL == f35088(var7)) {
            return (SubLObject)module0573.NIL;
        }
        if (module0573.NIL == f35089(var7)) {
            return (SubLObject)module0573.NIL;
        }
        if (module0573.NIL == f35090(var7)) {
            return (SubLObject)module0573.NIL;
        }
        return (SubLObject)module0573.T;
    }
    
    public static SubLObject f35091(final SubLObject var7) {
        if (module0573.NIL != f35092(var7)) {
            return (SubLObject)module0573.T;
        }
        Errors.warn((SubLObject)module0573.$ic26$);
        return (SubLObject)module0573.NIL;
    }
    
    public static SubLObject f35093(final SubLObject var7, SubLObject var21) {
        if (var21 == module0573.UNPROVIDED) {
            var21 = (SubLObject)module0573.T;
        }
        streams_high.write_char(Characters.code_char((SubLObject)module0573.TEN_INTEGER), var7);
        streams_high.write_char(Characters.code_char((SubLObject)module0573.THIRTEEN_INTEGER), var7);
        if (module0573.NIL != var21) {
            streams_high.force_output(var7);
        }
        return (SubLObject)module0573.NIL;
    }
    
    public static SubLObject f35094(final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        var8.resetMultipleValues();
        final SubLObject var9 = module0038.f2835(var7, (SubLObject)module0573.NIL, (SubLObject)module0573.$ic27$, (SubLObject)module0573.UNPROVIDED);
        final SubLObject var10 = var8.secondMultipleValue();
        var8.resetMultipleValues();
        if (module0573.$ic28$ == var10) {
            return (SubLObject)module0573.$ic29$;
        }
        return var9;
    }
    
    public static SubLObject f35095(final SubLObject var24, final SubLObject var22) {
        return module0035.sublisp_boolean(module0038.f2684(var22, var24));
    }
    
    public static SubLObject f35087(final SubLObject var7) {
        final SubLObject var8 = f35094(var7);
        return f35095((SubLObject)module0573.$ic30$, var8);
    }
    
    public static SubLObject f35088(final SubLObject var7) {
        PrintLow.format(var7, (SubLObject)module0573.$ic31$, module0018.f967());
        f35093(var7, (SubLObject)module0573.UNPROVIDED);
        final SubLObject var8 = f35094(var7);
        return f35095((SubLObject)module0573.$ic32$, var8);
    }
    
    public static SubLObject f35089(final SubLObject var7) {
        PrintLow.format(var7, (SubLObject)module0573.$ic33$, module0018.f971());
        f35093(var7, (SubLObject)module0573.UNPROVIDED);
        final SubLObject var8 = f35094(var7);
        return f35095((SubLObject)module0573.$ic34$, var8);
    }
    
    public static SubLObject f35090(final SubLObject var7) {
        PrintLow.format(var7, (SubLObject)module0573.$ic35$, module0574.f35163());
        f35093(var7, (SubLObject)module0573.UNPROVIDED);
        SubLObject var8 = f35094(var7);
        if (module0573.NIL == f35095((SubLObject)module0573.$ic36$, var8)) {
            return (SubLObject)module0573.NIL;
        }
        var8 = f35094(var7);
        if (module0573.NIL != f35095((SubLObject)module0573.$ic37$, var8) || module0573.NIL != f35095((SubLObject)module0573.$ic38$, var8)) {
            module0574.f35121((SubLObject)module0573.T);
            return (SubLObject)module0573.T;
        }
        if (module0573.NIL != f35095((SubLObject)module0573.$ic39$, var8)) {
            module0574.f35121((SubLObject)module0573.NIL);
            return (SubLObject)module0573.T;
        }
        return (SubLObject)module0573.NIL;
    }
    
    public static SubLObject f35096(final SubLObject var7, final SubLObject var25) {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        SubLObject var27 = (SubLObject)module0573.ZERO_INTEGER;
        PrintLow.format(var7, (SubLObject)module0573.$ic40$, var25);
        f35093(var7, (SubLObject)module0573.UNPROVIDED);
        final SubLObject var28 = f35094(var7);
        if (module0573.NIL != f35095((SubLObject)module0573.$ic41$, var28)) {
            SubLObject var29 = (SubLObject)module0573.NIL;
            try {
                var26.throwStack.push(module0573.$ic42$);
                final SubLObject var30 = Errors.$error_handler$.currentBinding(var26);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0573.$ic43$), var26);
                    try {
                        var27 = reader.read_from_string(var28, (SubLObject)module0573.T, (SubLObject)module0573.$ic27$, module0048.f_1X(Sequences.position((SubLObject)Characters.CHAR_period, var28, (SubLObject)module0573.UNPROVIDED, (SubLObject)module0573.UNPROVIDED, (SubLObject)module0573.UNPROVIDED, (SubLObject)module0573.UNPROVIDED)), (SubLObject)module0573.UNPROVIDED, (SubLObject)module0573.UNPROVIDED);
                    }
                    catch (Throwable var31) {
                        Errors.handleThrowable(var31, (SubLObject)module0573.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var30, var26);
                }
            }
            catch (Throwable var32) {
                var29 = Errors.handleThrowable(var32, (SubLObject)module0573.$ic42$);
            }
            finally {
                var26.throwStack.pop();
            }
        }
        return var27;
    }
    
    public static SubLObject f35097(final SubLObject var7, final SubLObject var31) {
        PrintLow.format(var7, (SubLObject)module0573.$ic44$, var31);
        f35093(var7, (SubLObject)module0573.UNPROVIDED);
        return (SubLObject)module0573.NIL;
    }
    
    public static SubLObject f35098(final SubLObject var7, final SubLObject var32) {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        final SubLObject var34 = print_high.$print_pretty$.currentBinding(var33);
        final SubLObject var35 = print_high.$print_length$.currentBinding(var33);
        final SubLObject var36 = print_high.$print_level$.currentBinding(var33);
        try {
            print_high.$print_pretty$.bind((SubLObject)module0573.NIL, var33);
            print_high.$print_length$.bind((SubLObject)module0573.NIL, var33);
            print_high.$print_level$.bind((SubLObject)module0573.NIL, var33);
            final SubLObject var37 = print_high.prin1_to_string(var32);
            if (module0573.ONE_INTEGER.numE(module0573.$g4167$.getDynamicValue(var33))) {
                PrintLow.format(var7, (SubLObject)module0573.$ic45$, Sequences.length(var37));
                f35093(var7, (SubLObject)module0573.NIL);
            }
            print_high.princ(var37, var7);
            f35093(var7, (SubLObject)module0573.NIL);
        }
        finally {
            print_high.$print_level$.rebind(var36, var33);
            print_high.$print_length$.rebind(var35, var33);
            print_high.$print_pretty$.rebind(var34, var33);
        }
        return (SubLObject)module0573.NIL;
    }
    
    public static SubLObject f35099(final SubLObject var7) {
        return streams_high.force_output(var7);
    }
    
    public static SubLObject f35100(final SubLObject var7) {
        final SubLObject var8 = f35094(var7);
        return f35095((SubLObject)module0573.$ic46$, var8);
    }
    
    public static SubLObject f35101(final SubLObject var7, final SubLObject var31, final SubLObject var36) {
        PrintLow.format(var7, (SubLObject)module0573.$ic47$, var31, var36);
        f35093(var7, (SubLObject)module0573.UNPROVIDED);
        return (SubLObject)module0573.NIL;
    }
    
    public static SubLObject f35102(final SubLObject var7, final SubLObject var32) {
        return f35098(var7, var32);
    }
    
    public static SubLObject f35103(final SubLObject var7) {
        return streams_high.force_output(var7);
    }
    
    public static SubLObject f35104(final SubLObject var7) {
        final SubLObject var8 = f35094(var7);
        return f35095((SubLObject)module0573.$ic48$, var8);
    }
    
    public static SubLObject f35105(final SubLObject var7) {
        PrintLow.format(var7, (SubLObject)module0573.$ic49$, module0574.f35128());
        f35093(var7, (SubLObject)module0573.UNPROVIDED);
        final SubLObject var8 = f35094(var7);
        return f35095((SubLObject)module0573.$ic50$, var8);
    }
    
    public static SubLObject f35092(final SubLObject var7) {
        PrintLow.format(var7, (SubLObject)module0573.$ic51$);
        f35093(var7, (SubLObject)module0573.UNPROVIDED);
        final SubLObject var8 = f35094(var7);
        return f35095((SubLObject)module0573.$ic52$, var8);
    }
    
    public static SubLObject f35106() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        SubLObject var2 = (SubLObject)module0573.NIL;
        SubLObject var3 = (SubLObject)module0573.NIL;
        try {
            var1.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var4 = Errors.$error_handler$.currentBinding(var1);
            try {
                Errors.$error_handler$.bind((SubLObject)module0573.$ic53$, var1);
                try {
                    SubLObject var5 = (SubLObject)module0573.NIL;
                    SubLObject var6 = (SubLObject)module0573.NIL;
                    SubLObject var7 = (SubLObject)module0573.NIL;
                    try {
                        var7 = module0004.f82(module0110.$g1386$.getDynamicValue(var1), module0110.$g1387$.getDynamicValue(var1), module0573.$g4166$.getGlobalValue(), (SubLObject)module0573.$ic54$);
                        if (module0573.NIL != module0003.f70(var7, module0110.$g1386$.getDynamicValue(var1), module0110.$g1387$.getDynamicValue(var1))) {
                            var5 = (SubLObject)module0573.T;
                            final SubLObject var8 = module0003.f61();
                            try {
                                var1.throwStack.push(var8);
                                final SubLObject var28_42 = module0003.$g4$.currentBinding(var1);
                                try {
                                    module0003.$g4$.bind((SubLObject)module0573.T, var1);
                                    SubLObject var9 = (SubLObject)module0573.NIL;
                                    try {
                                        final SubLObject var28_43 = module0003.$g5$.currentBinding(var1);
                                        try {
                                            module0003.$g5$.bind(Numbers.add((SubLObject)module0573.ONE_INTEGER, module0003.$g5$.getDynamicValue(var1)), var1);
                                            var9 = module0003.f62((SubLObject)module0573.THREE_INTEGER, var8);
                                            if (module0573.NIL != f35087(var7)) {
                                                var2 = f35091(var7);
                                            }
                                        }
                                        finally {
                                            module0003.$g5$.rebind(var28_43, var1);
                                        }
                                    }
                                    finally {
                                        final SubLObject var28_44 = Threads.$is_thread_performing_cleanupP$.currentBinding(var1);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0573.T, var1);
                                            module0003.f64(var9);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var28_44, var1);
                                        }
                                    }
                                }
                                finally {
                                    module0003.$g4$.rebind(var28_42, var1);
                                }
                            }
                            catch (Throwable var10) {
                                var6 = Errors.handleThrowable(var10, var8);
                            }
                            finally {
                                var1.throwStack.pop();
                            }
                        }
                    }
                    finally {
                        final SubLObject var28_45 = Threads.$is_thread_performing_cleanupP$.currentBinding(var1);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0573.T, var1);
                            if (module0573.NIL != var7) {
                                streams_high.close(var7, (SubLObject)module0573.UNPROVIDED);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var28_45, var1);
                        }
                    }
                    if (module0573.NIL == var5) {
                        Errors.error((SubLObject)module0573.$ic55$);
                    }
                    if (module0573.NIL != var6) {
                        Errors.error((SubLObject)module0573.$ic56$);
                    }
                }
                catch (Throwable var11) {
                    Errors.handleThrowable(var11, (SubLObject)module0573.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var4, var1);
            }
        }
        catch (Throwable var12) {
            var3 = Errors.handleThrowable(var12, module0003.$g3$.getGlobalValue());
        }
        finally {
            var1.throwStack.pop();
        }
        if (var3.isString()) {
            Errors.warn((SubLObject)module0573.$ic21$, module0051.f3552((SubLObject)module0573.UNPROVIDED), var3);
        }
        return var2;
    }
    
    public static SubLObject f35107() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        SubLObject var2 = (SubLObject)module0573.NIL;
        SubLObject var3 = (SubLObject)module0573.NIL;
        try {
            var1.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var4 = Errors.$error_handler$.currentBinding(var1);
            try {
                Errors.$error_handler$.bind((SubLObject)module0573.$ic53$, var1);
                try {
                    SubLObject var5 = (SubLObject)module0573.NIL;
                    SubLObject var6 = (SubLObject)module0573.NIL;
                    SubLObject var7 = (SubLObject)module0573.NIL;
                    try {
                        var7 = module0004.f82(module0110.$g1386$.getDynamicValue(var1), module0110.$g1387$.getDynamicValue(var1), module0573.$g4166$.getGlobalValue(), (SubLObject)module0573.$ic54$);
                        if (module0573.NIL != module0003.f70(var7, module0110.$g1386$.getDynamicValue(var1), module0110.$g1387$.getDynamicValue(var1))) {
                            var5 = (SubLObject)module0573.T;
                            final SubLObject var8 = module0003.f61();
                            try {
                                var1.throwStack.push(var8);
                                final SubLObject var28_47 = module0003.$g4$.currentBinding(var1);
                                try {
                                    module0003.$g4$.bind((SubLObject)module0573.T, var1);
                                    SubLObject var9 = (SubLObject)module0573.NIL;
                                    try {
                                        final SubLObject var28_48 = module0003.$g5$.currentBinding(var1);
                                        try {
                                            module0003.$g5$.bind(Numbers.add((SubLObject)module0573.ONE_INTEGER, module0003.$g5$.getDynamicValue(var1)), var1);
                                            var9 = module0003.f62((SubLObject)module0573.THREE_INTEGER, var8);
                                            if (module0573.NIL != f35086(var7)) {
                                                var2 = (SubLObject)module0573.T;
                                                f35091(var7);
                                            }
                                        }
                                        finally {
                                            module0003.$g5$.rebind(var28_48, var1);
                                        }
                                    }
                                    finally {
                                        final SubLObject var28_49 = Threads.$is_thread_performing_cleanupP$.currentBinding(var1);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0573.T, var1);
                                            module0003.f64(var9);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var28_49, var1);
                                        }
                                    }
                                }
                                finally {
                                    module0003.$g4$.rebind(var28_47, var1);
                                }
                            }
                            catch (Throwable var10) {
                                var6 = Errors.handleThrowable(var10, var8);
                            }
                            finally {
                                var1.throwStack.pop();
                            }
                        }
                    }
                    finally {
                        final SubLObject var28_50 = Threads.$is_thread_performing_cleanupP$.currentBinding(var1);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0573.T, var1);
                            if (module0573.NIL != var7) {
                                streams_high.close(var7, (SubLObject)module0573.UNPROVIDED);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var28_50, var1);
                        }
                    }
                    if (module0573.NIL == var5) {
                        Errors.error((SubLObject)module0573.$ic55$);
                    }
                    if (module0573.NIL != var6) {
                        Errors.error((SubLObject)module0573.$ic56$);
                    }
                }
                catch (Throwable var11) {
                    Errors.handleThrowable(var11, (SubLObject)module0573.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var4, var1);
            }
        }
        catch (Throwable var12) {
            var3 = Errors.handleThrowable(var12, module0003.$g3$.getGlobalValue());
        }
        finally {
            var1.throwStack.pop();
        }
        if (var3.isString()) {
            Errors.warn((SubLObject)module0573.$ic21$, module0051.f3552((SubLObject)module0573.UNPROVIDED), var3);
        }
        return var2;
    }
    
    public static SubLObject f35108(SubLObject var25) {
        if (var25 == module0573.UNPROVIDED) {
            var25 = module0018.f971();
        }
        final SubLThread var26 = SubLProcess.currentSubLThread();
        final SubLObject var27 = module0573.$g4168$.currentBinding(var26);
        try {
            module0573.$g4168$.bind((SubLObject)module0573.$ic57$, var26);
            return module0572.f35062(var25);
        }
        finally {
            module0573.$g4168$.rebind(var27, var26);
        }
    }
    
    public static SubLObject f35109(SubLObject var25) {
        if (var25 == module0573.UNPROVIDED) {
            var25 = module0018.f971();
        }
        final SubLThread var26 = SubLProcess.currentSubLThread();
        SubLObject var27 = (SubLObject)module0573.NIL;
        try {
            var26.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var28 = Errors.$error_handler$.currentBinding(var26);
            try {
                Errors.$error_handler$.bind((SubLObject)module0573.$ic53$, var26);
                try {
                    SubLObject var29 = (SubLObject)module0573.NIL;
                    SubLObject var30 = (SubLObject)module0573.NIL;
                    SubLObject var31 = (SubLObject)module0573.NIL;
                    try {
                        var31 = module0004.f82(module0110.$g1386$.getDynamicValue(var26), module0110.$g1387$.getDynamicValue(var26), module0573.$g4166$.getGlobalValue(), (SubLObject)module0573.$ic54$);
                        if (module0573.NIL != module0003.f70(var31, module0110.$g1386$.getDynamicValue(var26), module0110.$g1387$.getDynamicValue(var26))) {
                            var29 = (SubLObject)module0573.T;
                            final SubLObject var32 = module0003.f61();
                            try {
                                var26.throwStack.push(var32);
                                final SubLObject var28_51 = module0003.$g4$.currentBinding(var26);
                                try {
                                    module0003.$g4$.bind((SubLObject)module0573.T, var26);
                                    SubLObject var33 = (SubLObject)module0573.NIL;
                                    try {
                                        final SubLObject var28_52 = module0003.$g5$.currentBinding(var26);
                                        try {
                                            module0003.$g5$.bind(Numbers.add((SubLObject)module0573.ONE_INTEGER, module0003.$g5$.getDynamicValue(var26)), var26);
                                            var33 = module0003.f62(module0573.$g4168$.getDynamicValue(var26), var32);
                                            if (module0573.NIL != f35086(var31)) {
                                                return f35096(var31, var25);
                                            }
                                        }
                                        finally {
                                            module0003.$g5$.rebind(var28_52, var26);
                                        }
                                    }
                                    finally {
                                        final SubLObject var28_53 = Threads.$is_thread_performing_cleanupP$.currentBinding(var26);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0573.T, var26);
                                            module0003.f64(var33);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var28_53, var26);
                                        }
                                    }
                                }
                                finally {
                                    module0003.$g4$.rebind(var28_51, var26);
                                }
                            }
                            catch (Throwable var34) {
                                var30 = Errors.handleThrowable(var34, var32);
                            }
                            finally {
                                var26.throwStack.pop();
                            }
                        }
                    }
                    finally {
                        final SubLObject var28_54 = Threads.$is_thread_performing_cleanupP$.currentBinding(var26);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0573.T, var26);
                            if (module0573.NIL != var31) {
                                streams_high.close(var31, (SubLObject)module0573.UNPROVIDED);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var28_54, var26);
                        }
                    }
                    if (module0573.NIL == var29) {
                        Errors.error((SubLObject)module0573.$ic55$);
                    }
                    if (module0573.NIL != var30) {
                        Errors.error((SubLObject)module0573.$ic56$);
                    }
                }
                catch (Throwable var35) {
                    Errors.handleThrowable(var35, (SubLObject)module0573.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var28, var26);
            }
        }
        catch (Throwable var36) {
            var27 = Errors.handleThrowable(var36, module0003.$g3$.getGlobalValue());
        }
        finally {
            var26.throwStack.pop();
        }
        if (var27.isString()) {
            Errors.warn((SubLObject)module0573.$ic21$, module0051.f3552((SubLObject)module0573.UNPROVIDED), var27);
        }
        return (SubLObject)module0573.NIL;
    }
    
    public static SubLObject f35110() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        if (module0573.NIL == module0574.f35120()) {
            return (SubLObject)module0573.NIL;
        }
        SubLObject var2 = (SubLObject)module0573.NIL;
        SubLObject var3 = (SubLObject)module0573.NIL;
        try {
            var1.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var4 = Errors.$error_handler$.currentBinding(var1);
            try {
                Errors.$error_handler$.bind((SubLObject)module0573.$ic53$, var1);
                try {
                    SubLObject var5 = (SubLObject)module0573.NIL;
                    SubLObject var6 = (SubLObject)module0573.NIL;
                    SubLObject var7 = (SubLObject)module0573.NIL;
                    try {
                        var7 = module0004.f82(module0110.$g1386$.getDynamicValue(var1), module0110.$g1387$.getDynamicValue(var1), module0573.$g4166$.getGlobalValue(), (SubLObject)module0573.$ic54$);
                        if (module0573.NIL != module0003.f70(var7, module0110.$g1386$.getDynamicValue(var1), module0110.$g1387$.getDynamicValue(var1))) {
                            var5 = (SubLObject)module0573.T;
                            final SubLObject var8 = module0003.f61();
                            try {
                                var1.throwStack.push(var8);
                                final SubLObject var28_56 = module0003.$g4$.currentBinding(var1);
                                try {
                                    module0003.$g4$.bind((SubLObject)module0573.T, var1);
                                    SubLObject var9 = (SubLObject)module0573.NIL;
                                    try {
                                        final SubLObject var28_57 = module0003.$g5$.currentBinding(var1);
                                        try {
                                            module0003.$g5$.bind(Numbers.add((SubLObject)module0573.ONE_INTEGER, module0003.$g5$.getDynamicValue(var1)), var1);
                                            var9 = module0003.f62((SubLObject)module0573.$ic59$, var8);
                                            if (module0573.NIL != f35086(var7)) {
                                                var2 = f35111(var7);
                                                f35091(var7);
                                            }
                                        }
                                        finally {
                                            module0003.$g5$.rebind(var28_57, var1);
                                        }
                                    }
                                    finally {
                                        final SubLObject var28_58 = Threads.$is_thread_performing_cleanupP$.currentBinding(var1);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0573.T, var1);
                                            module0003.f64(var9);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var28_58, var1);
                                        }
                                    }
                                }
                                finally {
                                    module0003.$g4$.rebind(var28_56, var1);
                                }
                            }
                            catch (Throwable var10) {
                                var6 = Errors.handleThrowable(var10, var8);
                            }
                            finally {
                                var1.throwStack.pop();
                            }
                        }
                    }
                    finally {
                        final SubLObject var28_59 = Threads.$is_thread_performing_cleanupP$.currentBinding(var1);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0573.T, var1);
                            if (module0573.NIL != var7) {
                                streams_high.close(var7, (SubLObject)module0573.UNPROVIDED);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var28_59, var1);
                        }
                    }
                    if (module0573.NIL == var5) {
                        Errors.error((SubLObject)module0573.$ic55$);
                    }
                    if (module0573.NIL != var6) {
                        Errors.error((SubLObject)module0573.$ic56$);
                    }
                }
                catch (Throwable var11) {
                    Errors.handleThrowable(var11, (SubLObject)module0573.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var4, var1);
            }
        }
        catch (Throwable var12) {
            var3 = Errors.handleThrowable(var12, module0003.$g3$.getGlobalValue());
        }
        finally {
            var1.throwStack.pop();
        }
        if (var3.isString()) {
            Errors.warn((SubLObject)module0573.$ic21$, module0051.f3552((SubLObject)module0573.UNPROVIDED), var3);
        }
        if (module0573.NIL == var2) {
            Errors.warn((SubLObject)module0573.$ic60$);
        }
        return var2;
    }
    
    public static SubLObject f35111(final SubLObject var7) {
        final SubLObject var8 = module0575.f35272();
        f35097(var7, var8);
        while (module0573.NIL == module0575.f35273()) {
            final SubLObject var9 = module0575.f35276();
            f35098(var7, var9);
        }
        f35099(var7);
        return f35100(var7);
    }
    
    public static SubLObject f35112(final SubLObject var36) {
        final SubLThread var37 = SubLProcess.currentSubLThread();
        if (module0573.NIL == module0574.f35120()) {
            return (SubLObject)module0573.NIL;
        }
        SubLObject var38 = (SubLObject)module0573.NIL;
        SubLObject var39 = (SubLObject)module0573.NIL;
        try {
            var37.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var40 = Errors.$error_handler$.currentBinding(var37);
            try {
                Errors.$error_handler$.bind((SubLObject)module0573.$ic53$, var37);
                try {
                    SubLObject var41 = (SubLObject)module0573.NIL;
                    SubLObject var42 = (SubLObject)module0573.NIL;
                    SubLObject var43 = (SubLObject)module0573.NIL;
                    try {
                        var43 = module0004.f82(module0110.$g1386$.getDynamicValue(var37), module0110.$g1387$.getDynamicValue(var37), module0573.$g4166$.getGlobalValue(), (SubLObject)module0573.$ic54$);
                        if (module0573.NIL != module0003.f70(var43, module0110.$g1386$.getDynamicValue(var37), module0110.$g1387$.getDynamicValue(var37))) {
                            var41 = (SubLObject)module0573.T;
                            final SubLObject var44 = module0003.f61();
                            try {
                                var37.throwStack.push(var44);
                                final SubLObject var28_61 = module0003.$g4$.currentBinding(var37);
                                try {
                                    module0003.$g4$.bind((SubLObject)module0573.T, var37);
                                    SubLObject var45 = (SubLObject)module0573.NIL;
                                    try {
                                        final SubLObject var28_62 = module0003.$g5$.currentBinding(var37);
                                        try {
                                            module0003.$g5$.bind(Numbers.add((SubLObject)module0573.ONE_INTEGER, module0003.$g5$.getDynamicValue(var37)), var37);
                                            var45 = module0003.f62((SubLObject)module0573.$ic59$, var44);
                                            if (module0573.NIL != f35086(var43)) {
                                                var38 = f35113(var43, var36);
                                                f35091(var43);
                                            }
                                        }
                                        finally {
                                            module0003.$g5$.rebind(var28_62, var37);
                                        }
                                    }
                                    finally {
                                        final SubLObject var28_63 = Threads.$is_thread_performing_cleanupP$.currentBinding(var37);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0573.T, var37);
                                            module0003.f64(var45);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var28_63, var37);
                                        }
                                    }
                                }
                                finally {
                                    module0003.$g4$.rebind(var28_61, var37);
                                }
                            }
                            catch (Throwable var46) {
                                var42 = Errors.handleThrowable(var46, var44);
                            }
                            finally {
                                var37.throwStack.pop();
                            }
                        }
                    }
                    finally {
                        final SubLObject var28_64 = Threads.$is_thread_performing_cleanupP$.currentBinding(var37);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0573.T, var37);
                            if (module0573.NIL != var43) {
                                streams_high.close(var43, (SubLObject)module0573.UNPROVIDED);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var28_64, var37);
                        }
                    }
                    if (module0573.NIL == var41) {
                        Errors.error((SubLObject)module0573.$ic55$);
                    }
                    if (module0573.NIL != var42) {
                        Errors.error((SubLObject)module0573.$ic56$);
                    }
                }
                catch (Throwable var47) {
                    Errors.handleThrowable(var47, (SubLObject)module0573.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var40, var37);
            }
        }
        catch (Throwable var48) {
            var39 = Errors.handleThrowable(var48, module0003.$g3$.getGlobalValue());
        }
        finally {
            var37.throwStack.pop();
        }
        if (var39.isString()) {
            Errors.warn((SubLObject)module0573.$ic21$, module0051.f3552((SubLObject)module0573.UNPROVIDED), var39);
        }
        if (module0573.NIL == var38) {
            Errors.warn((SubLObject)module0573.$ic61$, var36);
        }
        return var38;
    }
    
    public static SubLObject f35113(final SubLObject var7, final SubLObject var36) {
        final SubLObject var37 = module0575.f35272();
        f35101(var7, var37, var36);
        while (module0573.NIL == module0575.f35273()) {
            final SubLObject var38 = module0575.f35276();
            f35102(var7, var38);
        }
        f35103(var7);
        return f35104(var7);
    }
    
    public static SubLObject f35114() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        SubLObject var2 = (SubLObject)module0573.NIL;
        SubLObject var3 = (SubLObject)module0573.NIL;
        SubLObject var4 = (SubLObject)module0573.NIL;
        try {
            var1.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var5 = Errors.$error_handler$.currentBinding(var1);
            try {
                Errors.$error_handler$.bind((SubLObject)module0573.$ic53$, var1);
                try {
                    SubLObject var6 = (SubLObject)module0573.NIL;
                    SubLObject var7 = (SubLObject)module0573.NIL;
                    SubLObject var8 = (SubLObject)module0573.NIL;
                    try {
                        var8 = module0004.f82(module0110.$g1386$.getDynamicValue(var1), module0110.$g1387$.getDynamicValue(var1), module0573.$g4166$.getGlobalValue(), (SubLObject)module0573.$ic54$);
                        if (module0573.NIL != module0003.f70(var8, module0110.$g1386$.getDynamicValue(var1), module0110.$g1387$.getDynamicValue(var1))) {
                            var6 = (SubLObject)module0573.T;
                            final SubLObject var9 = module0003.f61();
                            try {
                                var1.throwStack.push(var9);
                                final SubLObject var28_65 = module0003.$g4$.currentBinding(var1);
                                try {
                                    module0003.$g4$.bind((SubLObject)module0573.T, var1);
                                    SubLObject var10 = (SubLObject)module0573.NIL;
                                    try {
                                        final SubLObject var28_66 = module0003.$g5$.currentBinding(var1);
                                        try {
                                            module0003.$g5$.bind(Numbers.add((SubLObject)module0573.ONE_INTEGER, module0003.$g5$.getDynamicValue(var1)), var1);
                                            var10 = module0003.f62((SubLObject)module0573.TWENTY_INTEGER, var9);
                                            if (module0573.NIL != f35086(var8)) {
                                                var3 = f35115(var8);
                                                var2 = (SubLObject)module0573.T;
                                                f35091(var8);
                                            }
                                        }
                                        finally {
                                            module0003.$g5$.rebind(var28_66, var1);
                                        }
                                    }
                                    finally {
                                        final SubLObject var28_67 = Threads.$is_thread_performing_cleanupP$.currentBinding(var1);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0573.T, var1);
                                            module0003.f64(var10);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var28_67, var1);
                                        }
                                    }
                                }
                                finally {
                                    module0003.$g4$.rebind(var28_65, var1);
                                }
                            }
                            catch (Throwable var11) {
                                var7 = Errors.handleThrowable(var11, var9);
                            }
                            finally {
                                var1.throwStack.pop();
                            }
                        }
                    }
                    finally {
                        final SubLObject var28_68 = Threads.$is_thread_performing_cleanupP$.currentBinding(var1);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0573.T, var1);
                            if (module0573.NIL != var8) {
                                streams_high.close(var8, (SubLObject)module0573.UNPROVIDED);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var28_68, var1);
                        }
                    }
                    if (module0573.NIL == var6) {
                        Errors.error((SubLObject)module0573.$ic55$);
                    }
                    if (module0573.NIL != var7) {
                        Errors.error((SubLObject)module0573.$ic56$);
                    }
                }
                catch (Throwable var12) {
                    Errors.handleThrowable(var12, (SubLObject)module0573.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var5, var1);
            }
        }
        catch (Throwable var13) {
            var4 = Errors.handleThrowable(var13, module0003.$g3$.getGlobalValue());
        }
        finally {
            var1.throwStack.pop();
        }
        if (var4.isString()) {
            Errors.warn((SubLObject)module0573.$ic21$, module0051.f3552((SubLObject)module0573.UNPROVIDED), var4);
        }
        if (module0573.NIL != var2) {
            if (var3.numGE(module0574.f35128())) {
                module0018.f977((SubLObject)module0573.NIL);
            }
            else {
                module0018.f977((SubLObject)module0573.T);
            }
        }
        else {
            module0018.f977((SubLObject)module0573.T);
        }
        return var2;
    }
    
    public static SubLObject f35115(final SubLObject var7) {
        SubLObject var8 = (SubLObject)module0573.ZERO_INTEGER;
        SubLObject var9 = (SubLObject)module0573.NIL;
        if (module0573.NIL != f35105(var7)) {
            SubLObject var10;
            for (var10 = (SubLObject)module0573.NIL, var10 = f35116(var7); !var10.equal((SubLObject)module0573.NIL); var10 = f35116(var7)) {
                module0575.f35288(var10);
                var8 = Numbers.add(var8, (SubLObject)module0573.ONE_INTEGER);
            }
            var9 = (SubLObject)module0573.T;
        }
        if (module0573.NIL != var9) {
            return var8;
        }
        return (SubLObject)module0573.NIL;
    }
    
    public static SubLObject f35116(final SubLObject var70) {
        final SubLThread var71 = SubLProcess.currentSubLThread();
        final SubLObject var72 = streams_high.read_char(var70, (SubLObject)module0573.NIL, (SubLObject)module0573.$ic27$, (SubLObject)module0573.UNPROVIDED);
        if (var72.eql((SubLObject)Characters.CHAR_period)) {
            module0038.f2835(var70, (SubLObject)module0573.NIL, (SubLObject)module0573.$ic27$, (SubLObject)module0573.UNPROVIDED);
            return (SubLObject)module0573.NIL;
        }
        streams_high.unread_char(var72, var70);
        var71.resetMultipleValues();
        final SubLObject var73 = reader.read_ignoring_errors(var70, (SubLObject)module0573.NIL, (SubLObject)module0573.$ic27$);
        final SubLObject var74 = var71.secondMultipleValue();
        var71.resetMultipleValues();
        if (var73 == module0573.$ic27$) {
            return (SubLObject)module0573.NIL;
        }
        if (var74 == module0573.$ic28$) {
            return (SubLObject)module0573.NIL;
        }
        if (module0573.NIL != module0574.f35198(var73)) {
            return var73;
        }
        return (SubLObject)module0573.NIL;
    }
    
    public static SubLObject f35117() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0573", "f35083", "S#38383", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0573", "f35084", "S#38482");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0573", "f35085", "S#38483");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0573", "f35086", "S#38484", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0573", "f35091", "S#38485", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0573", "f35093", "S#38486", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0573", "f35094", "S#38487", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0573", "f35095", "S#38488", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0573", "f35087", "S#38489", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0573", "f35088", "S#38490", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0573", "f35089", "S#38491", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0573", "f35090", "S#38492", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0573", "f35096", "S#38493", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0573", "f35097", "S#38494", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0573", "f35098", "S#38495", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0573", "f35099", "S#38496", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0573", "f35100", "S#38497", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0573", "f35101", "S#38498", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0573", "f35102", "S#38499", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0573", "f35103", "S#38500", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0573", "f35104", "S#38501", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0573", "f35105", "S#38502", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0573", "f35092", "S#38503", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0573", "f35106", "S#38504", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0573", "f35107", "S#38505", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0573", "f35108", "S#38506", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0573", "f35109", "S#38387", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0573", "f35110", "S#38507", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0573", "f35111", "S#38508", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0573", "f35112", "S#38509", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0573", "f35113", "S#38510", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0573", "f35114", "S#38511", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0573", "f35115", "S#38512", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0573", "f35116", "S#38513", 1, 0, false);
        return (SubLObject)module0573.NIL;
    }
    
    public static SubLObject f35118() {
        module0573.$g4166$ = SubLFiles.deflexical("S#38514", (SubLObject)module0573.TEN_INTEGER);
        module0573.$g4167$ = SubLFiles.defvar("S#38515", (SubLObject)module0573.ONE_INTEGER);
        module0573.$g4168$ = SubLFiles.defparameter("S#38516", (SubLObject)module0573.THREE_INTEGER);
        return (SubLObject)module0573.NIL;
    }
    
    public static SubLObject f35119() {
        return (SubLObject)module0573.NIL;
    }
    
    public void declareFunctions() {
        f35117();
    }
    
    public void initializeVariables() {
        f35118();
    }
    
    public void runTopLevelForms() {
        f35119();
    }
    
    static {
        me = (SubLFile)new module0573();
        module0573.$g4166$ = null;
        module0573.$g4167$ = null;
        module0573.$g4168$ = null;
        $ic0$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9128", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#38517", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic1$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OPERATION-TIMEOUT"));
        $ic2$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic3$ = SubLObjectFactory.makeKeyword("OPERATION-TIMEOUT");
        $ic4$ = SubLObjectFactory.makeUninternedSymbol("US#36A0F49");
        $ic5$ = SubLObjectFactory.makeUninternedSymbol("US#7AEF83A");
        $ic6$ = SubLObjectFactory.makeUninternedSymbol("US#6AF78B8");
        $ic7$ = SubLObjectFactory.makeSymbol("CLET");
        $ic8$ = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE");
        $ic9$ = SubLObjectFactory.makeSymbol("S#47", "CYC");
        $ic10$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*MASTER-TRANSCRIPT-LOCK-HOST*"), (SubLObject)SubLObjectFactory.makeSymbol("*MASTER-TRANSCRIPT-SERVER-PORT*"), (SubLObject)SubLObjectFactory.makeKeyword("TIMEOUT"), (SubLObject)SubLObjectFactory.makeSymbol("S#38514", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("ACCESS-MODE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE"));
        $ic11$ = SubLObjectFactory.makeSymbol("CSETQ");
        $ic12$ = ConsesLow.list((SubLObject)module0573.T);
        $ic13$ = SubLObjectFactory.makeSymbol("WITH-TIMEOUT");
        $ic14$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic15$ = SubLObjectFactory.makeSymbol("PUNLESS");
        $ic16$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)SubLObjectFactory.makeString("Transcript server connection timeout")));
        $ic17$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic18$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)SubLObjectFactory.makeString("Transcript server operation timeout")));
        $ic19$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic20$ = SubLObjectFactory.makeSymbol("WARN");
        $ic21$ = SubLObjectFactory.makeString("~A: Error while connecting to transcript server!~%~A~%");
        $ic22$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#366", "CYC"));
        $ic23$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9128", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic24$ = SubLObjectFactory.makeSymbol("S#38484", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("S#38485", "CYC");
        $ic26$ = SubLObjectFactory.makeString("Connection to transcript server was not cleanly closed");
        $ic27$ = SubLObjectFactory.makeKeyword("EOF");
        $ic28$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic29$ = SubLObjectFactory.makeString("400");
        $ic30$ = SubLObjectFactory.makeString("200");
        $ic31$ = SubLObjectFactory.makeString("Set-Image ~A");
        $ic32$ = SubLObjectFactory.makeString("201");
        $ic33$ = SubLObjectFactory.makeString("Set-KB ~A");
        $ic34$ = SubLObjectFactory.makeString("202");
        $ic35$ = SubLObjectFactory.makeString("Set-Op ~A");
        $ic36$ = SubLObjectFactory.makeString("203");
        $ic37$ = SubLObjectFactory.makeString("210");
        $ic38$ = SubLObjectFactory.makeString("211");
        $ic39$ = SubLObjectFactory.makeString("212");
        $ic40$ = SubLObjectFactory.makeString("How-Many-Ops ~A");
        $ic41$ = SubLObjectFactory.makeString("207");
        $ic42$ = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $ic43$ = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic44$ = SubLObjectFactory.makeString("Send-Ops ~A");
        $ic45$ = SubLObjectFactory.makeString("~A");
        $ic46$ = SubLObjectFactory.makeString("204");
        $ic47$ = SubLObjectFactory.makeString("Submit-Ops ~A ~A");
        $ic48$ = SubLObjectFactory.makeString("208");
        $ic49$ = SubLObjectFactory.makeString("Get-Ops ~A");
        $ic50$ = SubLObjectFactory.makeString("205");
        $ic51$ = SubLObjectFactory.makeString("Quit");
        $ic52$ = SubLObjectFactory.makeString("206");
        $ic53$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic54$ = SubLObjectFactory.makeKeyword("PRIVATE");
        $ic55$ = SubLObjectFactory.makeString("Transcript server connection timeout");
        $ic56$ = SubLObjectFactory.makeString("Transcript server operation timeout");
        $ic57$ = SubLObjectFactory.makeInteger(600);
        $ic58$ = SubLObjectFactory.makeSymbol("S#5859", "CYC");
        $ic59$ = SubLObjectFactory.makeInteger(240);
        $ic60$ = SubLObjectFactory.makeString("Error sending operations to server");
        $ic61$ = SubLObjectFactory.makeString("Error submitting operations to server file ~A");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0573.class
	Total time: 477 ms
	
	Decompiled with Procyon 0.5.32.
*/