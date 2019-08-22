package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic0$);
        final SubLObject var6 = var5.rest();
        var5 = var5.first();
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic0$);
        var7 = var5.first();
        var5 = var5.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var5;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11_12 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var4, (SubLObject)$ic0$);
            var11_12 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var4, (SubLObject)$ic0$);
            if (NIL == conses_high.member(var11_12, (SubLObject)$ic1$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var11_12 == $ic2$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic0$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic3$, var5);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13;
        var5 = (var13 = var6);
        final SubLObject var14 = (SubLObject)$ic4$;
        final SubLObject var15 = (SubLObject)$ic5$;
        final SubLObject var16 = (SubLObject)$ic6$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic7$, (SubLObject)ConsesLow.list(var14), (SubLObject)ConsesLow.list((SubLObject)$ic8$, (SubLObject)ConsesLow.list(var14), (SubLObject)ConsesLow.list((SubLObject)$ic7$, (SubLObject)ConsesLow.list(var15, var16), (SubLObject)ConsesLow.list((SubLObject)$ic9$, reader.bq_cons(var7, (SubLObject)$ic10$), (SubLObject)ConsesLow.listS((SubLObject)$ic11$, var15, (SubLObject)$ic12$), (SubLObject)((NIL != var12) ? ConsesLow.listS((SubLObject)$ic13$, (SubLObject)ConsesLow.list(var12, var16), ConsesLow.append(var13, (SubLObject)NIL)) : reader.bq_cons((SubLObject)$ic14$, ConsesLow.append(var13, (SubLObject)NIL)))), (SubLObject)ConsesLow.listS((SubLObject)$ic15$, var15, (SubLObject)$ic16$), (SubLObject)ConsesLow.listS((SubLObject)$ic17$, var16, (SubLObject)$ic18$))), (SubLObject)ConsesLow.list((SubLObject)$ic17$, (SubLObject)ConsesLow.list((SubLObject)$ic19$, var14), (SubLObject)ConsesLow.list((SubLObject)$ic20$, (SubLObject)$ic21$, (SubLObject)$ic22$, var14)));
    }
    
    public static SubLObject f35085(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic23$);
        var6 = var5.first();
        final SubLObject var7;
        var5 = (var7 = var5.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic17$, (SubLObject)ConsesLow.list((SubLObject)$ic24$, var6), ConsesLow.append(var7, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic25$, var6))));
    }
    
    public static SubLObject f35086(final SubLObject var7) {
        if (NIL == f35087(var7)) {
            return (SubLObject)NIL;
        }
        if (NIL == f35088(var7)) {
            return (SubLObject)NIL;
        }
        if (NIL == f35089(var7)) {
            return (SubLObject)NIL;
        }
        if (NIL == f35090(var7)) {
            return (SubLObject)NIL;
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f35091(final SubLObject var7) {
        if (NIL != f35092(var7)) {
            return (SubLObject)T;
        }
        Errors.warn((SubLObject)$ic26$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35093(final SubLObject var7, SubLObject var21) {
        if (var21 == UNPROVIDED) {
            var21 = (SubLObject)T;
        }
        streams_high.write_char(Characters.code_char((SubLObject)TEN_INTEGER), var7);
        streams_high.write_char(Characters.code_char((SubLObject)THIRTEEN_INTEGER), var7);
        if (NIL != var21) {
            streams_high.force_output(var7);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35094(final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        var8.resetMultipleValues();
        final SubLObject var9 = module0038.f2835(var7, (SubLObject)NIL, (SubLObject)$ic27$, (SubLObject)UNPROVIDED);
        final SubLObject var10 = var8.secondMultipleValue();
        var8.resetMultipleValues();
        if ($ic28$ == var10) {
            return (SubLObject)$ic29$;
        }
        return var9;
    }
    
    public static SubLObject f35095(final SubLObject var24, final SubLObject var22) {
        return module0035.sublisp_boolean(module0038.f2684(var22, var24));
    }
    
    public static SubLObject f35087(final SubLObject var7) {
        final SubLObject var8 = f35094(var7);
        return f35095((SubLObject)$ic30$, var8);
    }
    
    public static SubLObject f35088(final SubLObject var7) {
        PrintLow.format(var7, (SubLObject)$ic31$, module0018.f967());
        f35093(var7, (SubLObject)UNPROVIDED);
        final SubLObject var8 = f35094(var7);
        return f35095((SubLObject)$ic32$, var8);
    }
    
    public static SubLObject f35089(final SubLObject var7) {
        PrintLow.format(var7, (SubLObject)$ic33$, module0018.f971());
        f35093(var7, (SubLObject)UNPROVIDED);
        final SubLObject var8 = f35094(var7);
        return f35095((SubLObject)$ic34$, var8);
    }
    
    public static SubLObject f35090(final SubLObject var7) {
        PrintLow.format(var7, (SubLObject)$ic35$, module0574.f35163());
        f35093(var7, (SubLObject)UNPROVIDED);
        SubLObject var8 = f35094(var7);
        if (NIL == f35095((SubLObject)$ic36$, var8)) {
            return (SubLObject)NIL;
        }
        var8 = f35094(var7);
        if (NIL != f35095((SubLObject)$ic37$, var8) || NIL != f35095((SubLObject)$ic38$, var8)) {
            module0574.f35121((SubLObject)T);
            return (SubLObject)T;
        }
        if (NIL != f35095((SubLObject)$ic39$, var8)) {
            module0574.f35121((SubLObject)NIL);
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35096(final SubLObject var7, final SubLObject var25) {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        SubLObject var27 = (SubLObject)ZERO_INTEGER;
        PrintLow.format(var7, (SubLObject)$ic40$, var25);
        f35093(var7, (SubLObject)UNPROVIDED);
        final SubLObject var28 = f35094(var7);
        if (NIL != f35095((SubLObject)$ic41$, var28)) {
            SubLObject var29 = (SubLObject)NIL;
            try {
                var26.throwStack.push($ic42$);
                final SubLObject var30 = Errors.$error_handler$.currentBinding(var26);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic43$), var26);
                    try {
                        var27 = reader.read_from_string(var28, (SubLObject)T, (SubLObject)$ic27$, module0048.f_1X(Sequences.position((SubLObject)Characters.CHAR_period, var28, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    catch (Throwable var31) {
                        Errors.handleThrowable(var31, (SubLObject)NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var30, var26);
                }
            }
            catch (Throwable var32) {
                var29 = Errors.handleThrowable(var32, (SubLObject)$ic42$);
            }
            finally {
                var26.throwStack.pop();
            }
        }
        return var27;
    }
    
    public static SubLObject f35097(final SubLObject var7, final SubLObject var31) {
        PrintLow.format(var7, (SubLObject)$ic44$, var31);
        f35093(var7, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35098(final SubLObject var7, final SubLObject var32) {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        final SubLObject var34 = print_high.$print_pretty$.currentBinding(var33);
        final SubLObject var35 = print_high.$print_length$.currentBinding(var33);
        final SubLObject var36 = print_high.$print_level$.currentBinding(var33);
        try {
            print_high.$print_pretty$.bind((SubLObject)NIL, var33);
            print_high.$print_length$.bind((SubLObject)NIL, var33);
            print_high.$print_level$.bind((SubLObject)NIL, var33);
            final SubLObject var37 = print_high.prin1_to_string(var32);
            if (ONE_INTEGER.numE($g4167$.getDynamicValue(var33))) {
                PrintLow.format(var7, (SubLObject)$ic45$, Sequences.length(var37));
                f35093(var7, (SubLObject)NIL);
            }
            print_high.princ(var37, var7);
            f35093(var7, (SubLObject)NIL);
        }
        finally {
            print_high.$print_level$.rebind(var36, var33);
            print_high.$print_length$.rebind(var35, var33);
            print_high.$print_pretty$.rebind(var34, var33);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35099(final SubLObject var7) {
        return streams_high.force_output(var7);
    }
    
    public static SubLObject f35100(final SubLObject var7) {
        final SubLObject var8 = f35094(var7);
        return f35095((SubLObject)$ic46$, var8);
    }
    
    public static SubLObject f35101(final SubLObject var7, final SubLObject var31, final SubLObject var36) {
        PrintLow.format(var7, (SubLObject)$ic47$, var31, var36);
        f35093(var7, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35102(final SubLObject var7, final SubLObject var32) {
        return f35098(var7, var32);
    }
    
    public static SubLObject f35103(final SubLObject var7) {
        return streams_high.force_output(var7);
    }
    
    public static SubLObject f35104(final SubLObject var7) {
        final SubLObject var8 = f35094(var7);
        return f35095((SubLObject)$ic48$, var8);
    }
    
    public static SubLObject f35105(final SubLObject var7) {
        PrintLow.format(var7, (SubLObject)$ic49$, module0574.f35128());
        f35093(var7, (SubLObject)UNPROVIDED);
        final SubLObject var8 = f35094(var7);
        return f35095((SubLObject)$ic50$, var8);
    }
    
    public static SubLObject f35092(final SubLObject var7) {
        PrintLow.format(var7, (SubLObject)$ic51$);
        f35093(var7, (SubLObject)UNPROVIDED);
        final SubLObject var8 = f35094(var7);
        return f35095((SubLObject)$ic52$, var8);
    }
    
    public static SubLObject f35106() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        SubLObject var2 = (SubLObject)NIL;
        SubLObject var3 = (SubLObject)NIL;
        try {
            var1.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var4 = Errors.$error_handler$.currentBinding(var1);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic53$, var1);
                try {
                    SubLObject var5 = (SubLObject)NIL;
                    SubLObject var6 = (SubLObject)NIL;
                    SubLObject var7 = (SubLObject)NIL;
                    try {
                        var7 = module0004.f82(module0110.$g1386$.getDynamicValue(var1), module0110.$g1387$.getDynamicValue(var1), $g4166$.getGlobalValue(), (SubLObject)$ic54$);
                        if (NIL != module0003.f70(var7, module0110.$g1386$.getDynamicValue(var1), module0110.$g1387$.getDynamicValue(var1))) {
                            var5 = (SubLObject)T;
                            final SubLObject var8 = module0003.f61();
                            try {
                                var1.throwStack.push(var8);
                                final SubLObject var28_42 = module0003.$g4$.currentBinding(var1);
                                try {
                                    module0003.$g4$.bind((SubLObject)T, var1);
                                    SubLObject var9 = (SubLObject)NIL;
                                    try {
                                        final SubLObject var28_43 = module0003.$g5$.currentBinding(var1);
                                        try {
                                            module0003.$g5$.bind(Numbers.add((SubLObject)ONE_INTEGER, module0003.$g5$.getDynamicValue(var1)), var1);
                                            var9 = module0003.f62((SubLObject)THREE_INTEGER, var8);
                                            if (NIL != f35087(var7)) {
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
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var1);
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
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var1);
                            if (NIL != var7) {
                                streams_high.close(var7, (SubLObject)UNPROVIDED);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var28_45, var1);
                        }
                    }
                    if (NIL == var5) {
                        Errors.error((SubLObject)$ic55$);
                    }
                    if (NIL != var6) {
                        Errors.error((SubLObject)$ic56$);
                    }
                }
                catch (Throwable var11) {
                    Errors.handleThrowable(var11, (SubLObject)NIL);
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
            Errors.warn((SubLObject)$ic21$, module0051.f3552((SubLObject)UNPROVIDED), var3);
        }
        return var2;
    }
    
    public static SubLObject f35107() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        SubLObject var2 = (SubLObject)NIL;
        SubLObject var3 = (SubLObject)NIL;
        try {
            var1.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var4 = Errors.$error_handler$.currentBinding(var1);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic53$, var1);
                try {
                    SubLObject var5 = (SubLObject)NIL;
                    SubLObject var6 = (SubLObject)NIL;
                    SubLObject var7 = (SubLObject)NIL;
                    try {
                        var7 = module0004.f82(module0110.$g1386$.getDynamicValue(var1), module0110.$g1387$.getDynamicValue(var1), $g4166$.getGlobalValue(), (SubLObject)$ic54$);
                        if (NIL != module0003.f70(var7, module0110.$g1386$.getDynamicValue(var1), module0110.$g1387$.getDynamicValue(var1))) {
                            var5 = (SubLObject)T;
                            final SubLObject var8 = module0003.f61();
                            try {
                                var1.throwStack.push(var8);
                                final SubLObject var28_47 = module0003.$g4$.currentBinding(var1);
                                try {
                                    module0003.$g4$.bind((SubLObject)T, var1);
                                    SubLObject var9 = (SubLObject)NIL;
                                    try {
                                        final SubLObject var28_48 = module0003.$g5$.currentBinding(var1);
                                        try {
                                            module0003.$g5$.bind(Numbers.add((SubLObject)ONE_INTEGER, module0003.$g5$.getDynamicValue(var1)), var1);
                                            var9 = module0003.f62((SubLObject)THREE_INTEGER, var8);
                                            if (NIL != f35086(var7)) {
                                                var2 = (SubLObject)T;
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
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var1);
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
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var1);
                            if (NIL != var7) {
                                streams_high.close(var7, (SubLObject)UNPROVIDED);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var28_50, var1);
                        }
                    }
                    if (NIL == var5) {
                        Errors.error((SubLObject)$ic55$);
                    }
                    if (NIL != var6) {
                        Errors.error((SubLObject)$ic56$);
                    }
                }
                catch (Throwable var11) {
                    Errors.handleThrowable(var11, (SubLObject)NIL);
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
            Errors.warn((SubLObject)$ic21$, module0051.f3552((SubLObject)UNPROVIDED), var3);
        }
        return var2;
    }
    
    public static SubLObject f35108(SubLObject var25) {
        if (var25 == UNPROVIDED) {
            var25 = module0018.f971();
        }
        final SubLThread var26 = SubLProcess.currentSubLThread();
        final SubLObject var27 = $g4168$.currentBinding(var26);
        try {
            $g4168$.bind((SubLObject)$ic57$, var26);
            return module0572.f35062(var25);
        }
        finally {
            $g4168$.rebind(var27, var26);
        }
    }
    
    public static SubLObject f35109(SubLObject var25) {
        if (var25 == UNPROVIDED) {
            var25 = module0018.f971();
        }
        final SubLThread var26 = SubLProcess.currentSubLThread();
        SubLObject var27 = (SubLObject)NIL;
        try {
            var26.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var28 = Errors.$error_handler$.currentBinding(var26);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic53$, var26);
                try {
                    SubLObject var29 = (SubLObject)NIL;
                    SubLObject var30 = (SubLObject)NIL;
                    SubLObject var31 = (SubLObject)NIL;
                    try {
                        var31 = module0004.f82(module0110.$g1386$.getDynamicValue(var26), module0110.$g1387$.getDynamicValue(var26), $g4166$.getGlobalValue(), (SubLObject)$ic54$);
                        if (NIL != module0003.f70(var31, module0110.$g1386$.getDynamicValue(var26), module0110.$g1387$.getDynamicValue(var26))) {
                            var29 = (SubLObject)T;
                            final SubLObject var32 = module0003.f61();
                            try {
                                var26.throwStack.push(var32);
                                final SubLObject var28_51 = module0003.$g4$.currentBinding(var26);
                                try {
                                    module0003.$g4$.bind((SubLObject)T, var26);
                                    SubLObject var33 = (SubLObject)NIL;
                                    try {
                                        final SubLObject var28_52 = module0003.$g5$.currentBinding(var26);
                                        try {
                                            module0003.$g5$.bind(Numbers.add((SubLObject)ONE_INTEGER, module0003.$g5$.getDynamicValue(var26)), var26);
                                            var33 = module0003.f62($g4168$.getDynamicValue(var26), var32);
                                            if (NIL != f35086(var31)) {
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
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var26);
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
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var26);
                            if (NIL != var31) {
                                streams_high.close(var31, (SubLObject)UNPROVIDED);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var28_54, var26);
                        }
                    }
                    if (NIL == var29) {
                        Errors.error((SubLObject)$ic55$);
                    }
                    if (NIL != var30) {
                        Errors.error((SubLObject)$ic56$);
                    }
                }
                catch (Throwable var35) {
                    Errors.handleThrowable(var35, (SubLObject)NIL);
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
            Errors.warn((SubLObject)$ic21$, module0051.f3552((SubLObject)UNPROVIDED), var27);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35110() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        if (NIL == module0574.f35120()) {
            return (SubLObject)NIL;
        }
        SubLObject var2 = (SubLObject)NIL;
        SubLObject var3 = (SubLObject)NIL;
        try {
            var1.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var4 = Errors.$error_handler$.currentBinding(var1);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic53$, var1);
                try {
                    SubLObject var5 = (SubLObject)NIL;
                    SubLObject var6 = (SubLObject)NIL;
                    SubLObject var7 = (SubLObject)NIL;
                    try {
                        var7 = module0004.f82(module0110.$g1386$.getDynamicValue(var1), module0110.$g1387$.getDynamicValue(var1), $g4166$.getGlobalValue(), (SubLObject)$ic54$);
                        if (NIL != module0003.f70(var7, module0110.$g1386$.getDynamicValue(var1), module0110.$g1387$.getDynamicValue(var1))) {
                            var5 = (SubLObject)T;
                            final SubLObject var8 = module0003.f61();
                            try {
                                var1.throwStack.push(var8);
                                final SubLObject var28_56 = module0003.$g4$.currentBinding(var1);
                                try {
                                    module0003.$g4$.bind((SubLObject)T, var1);
                                    SubLObject var9 = (SubLObject)NIL;
                                    try {
                                        final SubLObject var28_57 = module0003.$g5$.currentBinding(var1);
                                        try {
                                            module0003.$g5$.bind(Numbers.add((SubLObject)ONE_INTEGER, module0003.$g5$.getDynamicValue(var1)), var1);
                                            var9 = module0003.f62((SubLObject)$ic59$, var8);
                                            if (NIL != f35086(var7)) {
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
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var1);
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
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var1);
                            if (NIL != var7) {
                                streams_high.close(var7, (SubLObject)UNPROVIDED);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var28_59, var1);
                        }
                    }
                    if (NIL == var5) {
                        Errors.error((SubLObject)$ic55$);
                    }
                    if (NIL != var6) {
                        Errors.error((SubLObject)$ic56$);
                    }
                }
                catch (Throwable var11) {
                    Errors.handleThrowable(var11, (SubLObject)NIL);
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
            Errors.warn((SubLObject)$ic21$, module0051.f3552((SubLObject)UNPROVIDED), var3);
        }
        if (NIL == var2) {
            Errors.warn((SubLObject)$ic60$);
        }
        return var2;
    }
    
    public static SubLObject f35111(final SubLObject var7) {
        final SubLObject var8 = module0575.f35272();
        f35097(var7, var8);
        while (NIL == module0575.f35273()) {
            final SubLObject var9 = module0575.f35276();
            f35098(var7, var9);
        }
        f35099(var7);
        return f35100(var7);
    }
    
    public static SubLObject f35112(final SubLObject var36) {
        final SubLThread var37 = SubLProcess.currentSubLThread();
        if (NIL == module0574.f35120()) {
            return (SubLObject)NIL;
        }
        SubLObject var38 = (SubLObject)NIL;
        SubLObject var39 = (SubLObject)NIL;
        try {
            var37.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var40 = Errors.$error_handler$.currentBinding(var37);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic53$, var37);
                try {
                    SubLObject var41 = (SubLObject)NIL;
                    SubLObject var42 = (SubLObject)NIL;
                    SubLObject var43 = (SubLObject)NIL;
                    try {
                        var43 = module0004.f82(module0110.$g1386$.getDynamicValue(var37), module0110.$g1387$.getDynamicValue(var37), $g4166$.getGlobalValue(), (SubLObject)$ic54$);
                        if (NIL != module0003.f70(var43, module0110.$g1386$.getDynamicValue(var37), module0110.$g1387$.getDynamicValue(var37))) {
                            var41 = (SubLObject)T;
                            final SubLObject var44 = module0003.f61();
                            try {
                                var37.throwStack.push(var44);
                                final SubLObject var28_61 = module0003.$g4$.currentBinding(var37);
                                try {
                                    module0003.$g4$.bind((SubLObject)T, var37);
                                    SubLObject var45 = (SubLObject)NIL;
                                    try {
                                        final SubLObject var28_62 = module0003.$g5$.currentBinding(var37);
                                        try {
                                            module0003.$g5$.bind(Numbers.add((SubLObject)ONE_INTEGER, module0003.$g5$.getDynamicValue(var37)), var37);
                                            var45 = module0003.f62((SubLObject)$ic59$, var44);
                                            if (NIL != f35086(var43)) {
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
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var37);
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
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var37);
                            if (NIL != var43) {
                                streams_high.close(var43, (SubLObject)UNPROVIDED);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var28_64, var37);
                        }
                    }
                    if (NIL == var41) {
                        Errors.error((SubLObject)$ic55$);
                    }
                    if (NIL != var42) {
                        Errors.error((SubLObject)$ic56$);
                    }
                }
                catch (Throwable var47) {
                    Errors.handleThrowable(var47, (SubLObject)NIL);
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
            Errors.warn((SubLObject)$ic21$, module0051.f3552((SubLObject)UNPROVIDED), var39);
        }
        if (NIL == var38) {
            Errors.warn((SubLObject)$ic61$, var36);
        }
        return var38;
    }
    
    public static SubLObject f35113(final SubLObject var7, final SubLObject var36) {
        final SubLObject var37 = module0575.f35272();
        f35101(var7, var37, var36);
        while (NIL == module0575.f35273()) {
            final SubLObject var38 = module0575.f35276();
            f35102(var7, var38);
        }
        f35103(var7);
        return f35104(var7);
    }
    
    public static SubLObject f35114() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        SubLObject var2 = (SubLObject)NIL;
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        try {
            var1.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var5 = Errors.$error_handler$.currentBinding(var1);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic53$, var1);
                try {
                    SubLObject var6 = (SubLObject)NIL;
                    SubLObject var7 = (SubLObject)NIL;
                    SubLObject var8 = (SubLObject)NIL;
                    try {
                        var8 = module0004.f82(module0110.$g1386$.getDynamicValue(var1), module0110.$g1387$.getDynamicValue(var1), $g4166$.getGlobalValue(), (SubLObject)$ic54$);
                        if (NIL != module0003.f70(var8, module0110.$g1386$.getDynamicValue(var1), module0110.$g1387$.getDynamicValue(var1))) {
                            var6 = (SubLObject)T;
                            final SubLObject var9 = module0003.f61();
                            try {
                                var1.throwStack.push(var9);
                                final SubLObject var28_65 = module0003.$g4$.currentBinding(var1);
                                try {
                                    module0003.$g4$.bind((SubLObject)T, var1);
                                    SubLObject var10 = (SubLObject)NIL;
                                    try {
                                        final SubLObject var28_66 = module0003.$g5$.currentBinding(var1);
                                        try {
                                            module0003.$g5$.bind(Numbers.add((SubLObject)ONE_INTEGER, module0003.$g5$.getDynamicValue(var1)), var1);
                                            var10 = module0003.f62((SubLObject)TWENTY_INTEGER, var9);
                                            if (NIL != f35086(var8)) {
                                                var3 = f35115(var8);
                                                var2 = (SubLObject)T;
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
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var1);
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
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var1);
                            if (NIL != var8) {
                                streams_high.close(var8, (SubLObject)UNPROVIDED);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var28_68, var1);
                        }
                    }
                    if (NIL == var6) {
                        Errors.error((SubLObject)$ic55$);
                    }
                    if (NIL != var7) {
                        Errors.error((SubLObject)$ic56$);
                    }
                }
                catch (Throwable var12) {
                    Errors.handleThrowable(var12, (SubLObject)NIL);
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
            Errors.warn((SubLObject)$ic21$, module0051.f3552((SubLObject)UNPROVIDED), var4);
        }
        if (NIL != var2) {
            if (var3.numGE(module0574.f35128())) {
                module0018.f977((SubLObject)NIL);
            }
            else {
                module0018.f977((SubLObject)T);
            }
        }
        else {
            module0018.f977((SubLObject)T);
        }
        return var2;
    }
    
    public static SubLObject f35115(final SubLObject var7) {
        SubLObject var8 = (SubLObject)ZERO_INTEGER;
        SubLObject var9 = (SubLObject)NIL;
        if (NIL != f35105(var7)) {
            SubLObject var10;
            for (var10 = (SubLObject)NIL, var10 = f35116(var7); !var10.equal((SubLObject)NIL); var10 = f35116(var7)) {
                module0575.f35288(var10);
                var8 = Numbers.add(var8, (SubLObject)ONE_INTEGER);
            }
            var9 = (SubLObject)T;
        }
        if (NIL != var9) {
            return var8;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35116(final SubLObject var70) {
        final SubLThread var71 = SubLProcess.currentSubLThread();
        final SubLObject var72 = streams_high.read_char(var70, (SubLObject)NIL, (SubLObject)$ic27$, (SubLObject)UNPROVIDED);
        if (var72.eql((SubLObject)Characters.CHAR_period)) {
            module0038.f2835(var70, (SubLObject)NIL, (SubLObject)$ic27$, (SubLObject)UNPROVIDED);
            return (SubLObject)NIL;
        }
        streams_high.unread_char(var72, var70);
        var71.resetMultipleValues();
        final SubLObject var73 = reader.read_ignoring_errors(var70, (SubLObject)NIL, (SubLObject)$ic27$);
        final SubLObject var74 = var71.secondMultipleValue();
        var71.resetMultipleValues();
        if (var73 == $ic27$) {
            return (SubLObject)NIL;
        }
        if (var74 == $ic28$) {
            return (SubLObject)NIL;
        }
        if (NIL != module0574.f35198(var73)) {
            return var73;
        }
        return (SubLObject)NIL;
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35118() {
        $g4166$ = SubLFiles.deflexical("S#38514", (SubLObject)TEN_INTEGER);
        $g4167$ = SubLFiles.defvar("S#38515", (SubLObject)ONE_INTEGER);
        $g4168$ = SubLFiles.defparameter("S#38516", (SubLObject)THREE_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35119() {
        return (SubLObject)NIL;
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
        $g4166$ = null;
        $g4167$ = null;
        $g4168$ = null;
        $ic0$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#9128", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#38517", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic1$ = ConsesLow.list((SubLObject)makeKeyword("OPERATION-TIMEOUT"));
        $ic2$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic3$ = makeKeyword("OPERATION-TIMEOUT");
        $ic4$ = makeUninternedSymbol("US#36A0F49");
        $ic5$ = makeUninternedSymbol("US#7AEF83A");
        $ic6$ = makeUninternedSymbol("US#6AF78B8");
        $ic7$ = makeSymbol("CLET");
        $ic8$ = makeSymbol("CATCH-ERROR-MESSAGE");
        $ic9$ = makeSymbol("S#47", "CYC");
        $ic10$ = ConsesLow.list((SubLObject)makeSymbol("*MASTER-TRANSCRIPT-LOCK-HOST*"), (SubLObject)makeSymbol("*MASTER-TRANSCRIPT-SERVER-PORT*"), (SubLObject)makeKeyword("TIMEOUT"), (SubLObject)makeSymbol("S#38514", "CYC"), (SubLObject)makeKeyword("ACCESS-MODE"), (SubLObject)makeKeyword("PRIVATE"));
        $ic11$ = makeSymbol("CSETQ");
        $ic12$ = ConsesLow.list((SubLObject)T);
        $ic13$ = makeSymbol("WITH-TIMEOUT");
        $ic14$ = makeSymbol("PROGN");
        $ic15$ = makeSymbol("PUNLESS");
        $ic16$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("ERROR"), (SubLObject)makeString("Transcript server connection timeout")));
        $ic17$ = makeSymbol("PWHEN");
        $ic18$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("ERROR"), (SubLObject)makeString("Transcript server operation timeout")));
        $ic19$ = makeSymbol("STRINGP");
        $ic20$ = makeSymbol("WARN");
        $ic21$ = makeString("~A: Error while connecting to transcript server!~%~A~%");
        $ic22$ = ConsesLow.list((SubLObject)makeSymbol("S#366", "CYC"));
        $ic23$ = ConsesLow.list((SubLObject)makeSymbol("S#9128", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic24$ = makeSymbol("S#38484", "CYC");
        $ic25$ = makeSymbol("S#38485", "CYC");
        $ic26$ = makeString("Connection to transcript server was not cleanly closed");
        $ic27$ = makeKeyword("EOF");
        $ic28$ = makeKeyword("ERROR");
        $ic29$ = makeString("400");
        $ic30$ = makeString("200");
        $ic31$ = makeString("Set-Image ~A");
        $ic32$ = makeString("201");
        $ic33$ = makeString("Set-KB ~A");
        $ic34$ = makeString("202");
        $ic35$ = makeString("Set-Op ~A");
        $ic36$ = makeString("203");
        $ic37$ = makeString("210");
        $ic38$ = makeString("211");
        $ic39$ = makeString("212");
        $ic40$ = makeString("How-Many-Ops ~A");
        $ic41$ = makeString("207");
        $ic42$ = makeKeyword("IGNORE-ERRORS-TARGET");
        $ic43$ = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic44$ = makeString("Send-Ops ~A");
        $ic45$ = makeString("~A");
        $ic46$ = makeString("204");
        $ic47$ = makeString("Submit-Ops ~A ~A");
        $ic48$ = makeString("208");
        $ic49$ = makeString("Get-Ops ~A");
        $ic50$ = makeString("205");
        $ic51$ = makeString("Quit");
        $ic52$ = makeString("206");
        $ic53$ = makeSymbol("S#38", "CYC");
        $ic54$ = makeKeyword("PRIVATE");
        $ic55$ = makeString("Transcript server connection timeout");
        $ic56$ = makeString("Transcript server operation timeout");
        $ic57$ = makeInteger(600);
        $ic58$ = makeSymbol("S#5859", "CYC");
        $ic59$ = makeInteger(240);
        $ic60$ = makeString("Error sending operations to server");
        $ic61$ = makeString("Error submitting operations to server file ~A");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 477 ms
	
	Decompiled with Procyon 0.5.32.
*/