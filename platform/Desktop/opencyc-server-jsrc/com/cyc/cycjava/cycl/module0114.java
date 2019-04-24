package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0114 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0114";
    public static final String myFingerPrint = "d7596de12333e990cadcdd1eb594593b0ecb63df3f5dd6178874dcb92ce392bb";
    private static SubLSymbol $g1430$;
    public static SubLSymbol $g1431$;
    private static SubLSymbol $g1432$;
    public static SubLSymbol $g1433$;
    public static SubLSymbol $g1434$;
    private static SubLSymbol $g1435$;
    public static SubLSymbol $g1436$;
    public static SubLSymbol $g1437$;
    private static SubLSymbol $g1438$;
    public static SubLSymbol $g1439$;
    public static SubLSymbol $g1440$;
    private static SubLSymbol $g1442$;
    public static SubLSymbol $g1443$;
    public static SubLSymbol $g1444$;
    private static SubLSymbol $g1445$;
    private static SubLSymbol $g1446$;
    private static SubLSymbol $g1447$;
    private static SubLSymbol $g1448$;
    private static SubLSymbol $g1449$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLString $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLString $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
    private static final SubLString $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLList $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLString $ic18$;
    private static final SubLString $ic19$;
    private static final SubLString $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLString $ic22$;
    private static final SubLString $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLInteger $ic26$;
    private static final SubLInteger $ic27$;
    private static final SubLString $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLString $ic34$;
    private static final SubLString $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLList $ic37$;
    private static final SubLString $ic38$;
    private static final SubLList $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLString $ic42$;
    
    public static SubLObject f7939(final SubLObject var1, final SubLObject var2) {
        return f7940(var1, var2);
    }
    
    public static SubLObject f7940(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = Packages.$package$.currentBinding(var3);
        final SubLObject var5 = reader.$read_default_float_format$.currentBinding(var3);
        final SubLObject var6 = print_high.$print_readably$.currentBinding(var3);
        final SubLObject var7 = reader.$read_eval$.currentBinding(var3);
        try {
            Packages.$package$.bind(Packages.find_package((SubLObject)module0114.$ic3$), var3);
            reader.$read_default_float_format$.bind((SubLObject)module0114.$ic4$, var3);
            print_high.$print_readably$.bind((SubLObject)module0114.NIL, var3);
            reader.$read_eval$.bind((SubLObject)module0114.NIL, var3);
            final SubLObject var8 = Threads.process_priority(Threads.current_process());
            try {
                Threads.set_process_priority(Threads.current_process(), Threads.$process_normal_priority$.getGlobalValue());
                SubLObject var9 = (SubLObject)module0114.NIL;
                try {
                    var3.throwStack.push(module0114.$ic5$);
                    final SubLObject var4_10 = module0114.$g1430$.currentBinding(var3);
                    try {
                        module0114.$g1430$.bind((SubLObject)module0114.T, var3);
                        f7941(var1, var2);
                    }
                    finally {
                        module0114.$g1430$.rebind(var4_10, var3);
                    }
                }
                catch (Throwable var10) {
                    var9 = Errors.handleThrowable(var10, (SubLObject)module0114.$ic5$);
                }
                finally {
                    var3.throwStack.pop();
                }
            }
            finally {
                final SubLObject var4_11 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0114.T, var3);
                    Threads.set_process_priority(Threads.current_process(), var8);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var4_11, var3);
                }
            }
        }
        finally {
            reader.$read_eval$.rebind(var7, var3);
            print_high.$print_readably$.rebind(var6, var3);
            reader.$read_default_float_format$.rebind(var5, var3);
            Packages.$package$.rebind(var4, var3);
        }
        return (SubLObject)module0114.NIL;
    }
    
    public static SubLObject f7942() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0114.NIL != module0114.$g1430$.getDynamicValue(var3)) {
            Dynamic.sublisp_throw((SubLObject)module0114.$ic5$, (SubLObject)module0114.NIL);
        }
        return (SubLObject)module0114.NIL;
    }
    
    public static SubLObject f7943(final SubLObject var13) {
        return Threads.interrupt_process(var13, Symbols.symbol_function((SubLObject)module0114.$ic6$));
    }
    
    public static SubLObject f7944(final SubLObject var14, final SubLObject var15) {
        final SubLObject var16 = var14.rest();
        final SubLObject var18;
        final SubLObject var17 = var18 = var16;
        return (SubLObject)ConsesLow.listS((SubLObject)module0114.$ic11$, (SubLObject)module0114.$ic12$, ConsesLow.append(var18, (SubLObject)module0114.NIL));
    }
    
    public static SubLObject f7941(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0111.$g1406$.currentBinding(var3);
        final SubLObject var5 = module0111.$g1405$.currentBinding(var3);
        final SubLObject var6 = module0111.$g1408$.currentBinding(var3);
        final SubLObject var7 = module0114.$g1439$.currentBinding(var3);
        final SubLObject var8 = module0114.$g1440$.currentBinding(var3);
        final SubLObject var9 = module0114.$g1432$.currentBinding(var3);
        final SubLObject var10 = module0114.$g1434$.currentBinding(var3);
        final SubLObject var11 = module0114.$g1436$.currentBinding(var3);
        final SubLObject var12 = module0114.$g1438$.currentBinding(var3);
        final SubLObject var13 = module0112.$g1413$.currentBinding(var3);
        final SubLObject var14 = module0112.$g1418$.currentBinding(var3);
        final SubLObject var15 = module0112.$g1419$.currentBinding(var3);
        final SubLObject var16 = Errors.$ignore_warnsP$.currentBinding(var3);
        final SubLObject var17 = Errors.$ignore_breaksP$.currentBinding(var3);
        final SubLObject var18 = module0012.$silent_progressP$.currentBinding(var3);
        final SubLObject var19 = Errors.$continue_cerrorP$.currentBinding(var3);
        final SubLObject var20 = StreamsLow.$standard_output$.currentBinding(var3);
        final SubLObject var21 = StreamsLow.$error_output$.currentBinding(var3);
        try {
            module0111.$g1406$.bind((SubLObject)module0114.NIL, var3);
            module0111.$g1405$.bind(module0574.f35152(), var3);
            module0111.$g1408$.bind(module0111.$g1407$.getDynamicValue(var3), var3);
            module0114.$g1439$.bind(var1, var3);
            module0114.$g1440$.bind(var2, var3);
            module0114.$g1432$.bind(module0114.$g1431$.getDynamicValue(var3), var3);
            module0114.$g1434$.bind(module0114.$g1433$.getDynamicValue(var3), var3);
            module0114.$g1436$.bind(module0114.$g1435$.getGlobalValue(), var3);
            module0114.$g1438$.bind(module0114.$g1437$.getDynamicValue(var3), var3);
            module0112.$g1413$.bind(module0112.f7719(), var3);
            module0112.$g1418$.bind((SubLObject)module0114.NIL, var3);
            module0112.$g1419$.bind((SubLObject)module0114.$ic13$, var3);
            Errors.$ignore_warnsP$.bind((SubLObject)module0114.T, var3);
            Errors.$ignore_breaksP$.bind((SubLObject)module0114.T, var3);
            module0012.$silent_progressP$.bind((SubLObject)module0114.T, var3);
            Errors.$continue_cerrorP$.bind((SubLObject)module0114.T, var3);
            StreamsLow.$standard_output$.bind(StreamsLow.$null_output$.getDynamicValue(var3), var3);
            StreamsLow.$error_output$.bind(StreamsLow.$null_output$.getDynamicValue(var3), var3);
            while (true) {
                f7945(var1, var2);
            }
        }
        finally {
            StreamsLow.$error_output$.rebind(var21, var3);
            StreamsLow.$standard_output$.rebind(var20, var3);
            Errors.$continue_cerrorP$.rebind(var19, var3);
            module0012.$silent_progressP$.rebind(var18, var3);
            Errors.$ignore_breaksP$.rebind(var17, var3);
            Errors.$ignore_warnsP$.rebind(var16, var3);
            module0112.$g1419$.rebind(var15, var3);
            module0112.$g1418$.rebind(var14, var3);
            module0112.$g1413$.rebind(var13, var3);
            module0114.$g1438$.rebind(var12, var3);
            module0114.$g1436$.rebind(var11, var3);
            module0114.$g1434$.rebind(var10, var3);
            module0114.$g1432$.rebind(var9, var3);
            module0114.$g1440$.rebind(var8, var3);
            module0114.$g1439$.rebind(var7, var3);
            module0111.$g1408$.rebind(var6, var3);
            module0111.$g1405$.rebind(var5, var3);
            module0111.$g1406$.rebind(var4, var3);
        }
    }
    
    public static SubLObject f7945(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)module0114.NIL;
        SubLObject var5 = (SubLObject)module0114.NIL;
        SubLObject var6 = (SubLObject)module0114.NIL;
        try {
            var3.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var7 = Errors.$error_handler$.currentBinding(var3);
            try {
                Errors.$error_handler$.bind((SubLObject)module0114.$ic14$, var3);
                try {
                    var5 = f7946(var1);
                }
                catch (Throwable var8) {
                    Errors.handleThrowable(var8, (SubLObject)module0114.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var7, var3);
            }
        }
        catch (Throwable var9) {
            var4 = Errors.handleThrowable(var9, module0003.$g3$.getGlobalValue());
        }
        finally {
            var3.throwStack.pop();
        }
        if (module0114.NIL == var4) {
            try {
                var3.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var7 = Errors.$error_handler$.currentBinding(var3);
                try {
                    Errors.$error_handler$.bind((SubLObject)module0114.$ic14$, var3);
                    try {
                        f7947(var5);
                    }
                    catch (Throwable var8) {
                        Errors.handleThrowable(var8, (SubLObject)module0114.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var7, var3);
                }
            }
            catch (Throwable var9) {
                var4 = Errors.handleThrowable(var9, module0003.$g3$.getGlobalValue());
            }
            finally {
                var3.throwStack.pop();
            }
        }
        if (module0114.NIL == var4) {
            try {
                var3.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var7 = Errors.$error_handler$.currentBinding(var3);
                try {
                    Errors.$error_handler$.bind((SubLObject)module0114.$ic14$, var3);
                    try {
                        f7948(var5);
                    }
                    catch (Throwable var8) {
                        Errors.handleThrowable(var8, (SubLObject)module0114.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var7, var3);
                }
            }
            catch (Throwable var9) {
                var4 = Errors.handleThrowable(var9, module0003.$g3$.getGlobalValue());
            }
            finally {
                var3.throwStack.pop();
            }
        }
        if (var5.first() == module0114.$ic15$) {
            final SubLObject var10 = module0623.$g1441$.getGlobalValue();
            SubLObject var11 = (SubLObject)module0114.NIL;
            try {
                var11 = Locks.seize_lock(var10);
                if (module0114.NIL == module0623.f38435()) {
                    module0623.f38436();
                }
            }
            finally {
                if (module0114.NIL != var11) {
                    Locks.release_lock(var10);
                }
            }
            SubLObject var13;
            final SubLObject var12 = var13 = var5;
            SubLObject var14 = (SubLObject)module0114.NIL;
            SubLObject var15 = (SubLObject)module0114.NIL;
            SubLObject var16 = (SubLObject)module0114.NIL;
            SubLObject var17 = (SubLObject)module0114.NIL;
            SubLObject var18 = (SubLObject)module0114.NIL;
            SubLObject var19 = (SubLObject)module0114.NIL;
            SubLObject var20 = (SubLObject)module0114.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0114.$ic16$);
            var14 = var13.first();
            var13 = var13.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0114.$ic16$);
            var15 = var13.first();
            var13 = var13.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0114.$ic16$);
            var16 = var13.first();
            var13 = var13.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0114.$ic16$);
            var17 = var13.first();
            var13 = var13.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0114.$ic16$);
            var18 = var13.first();
            var13 = var13.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0114.$ic16$);
            var19 = var13.first();
            var13 = var13.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0114.$ic16$);
            var20 = var13.first();
            var13 = var13.rest();
            if (module0114.NIL == var13) {
                module0115.f7994(var15, var16, var17, var18, var19, var20);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)module0114.$ic16$);
            }
            return (SubLObject)module0114.NIL;
        }
        if (module0114.NIL == var4) {
            try {
                var3.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var7 = Errors.$error_handler$.currentBinding(var3);
                try {
                    Errors.$error_handler$.bind((SubLObject)module0114.$ic14$, var3);
                    try {
                        var6 = f7949(var5);
                    }
                    catch (Throwable var8) {
                        Errors.handleThrowable(var8, (SubLObject)module0114.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var7, var3);
                }
            }
            catch (Throwable var9) {
                var4 = Errors.handleThrowable(var9, module0003.$g3$.getGlobalValue());
            }
            finally {
                var3.throwStack.pop();
            }
        }
        if (module0114.NIL != var4) {
            f7950(var2, var4, (SubLObject)module0114.T);
        }
        else {
            f7950(var2, var6, (SubLObject)module0114.NIL);
        }
        if (module0114.NIL != var4) {
            f7951(var4, (SubLObject)module0114.T);
        }
        else {
            f7951(var6, (SubLObject)module0114.NIL);
        }
        f7952();
        return (SubLObject)module0114.NIL;
    }
    
    public static SubLObject f7946(final SubLObject var1) {
        final SubLObject var2 = Functions.funcall(f7953(), var1, (SubLObject)module0114.NIL, module0114.$g1442$.getGlobalValue());
        if (var2.eql(module0114.$g1442$.getGlobalValue())) {
            f7942();
        }
        return var2;
    }
    
    public static SubLObject f7947(final SubLObject var34) {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        if (module0114.NIL != module0114.$g1434$.getDynamicValue(var35)) {
            return Functions.funcall(module0114.$g1434$.getDynamicValue(var35), var34);
        }
        return (SubLObject)module0114.T;
    }
    
    public static SubLObject f7954(final SubLObject var34) {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        if (module0114.NIL == module0035.f2014(var34)) {
            Errors.error((SubLObject)module0114.$ic19$, var34);
        }
        if (module0114.NIL == module0112.$g1410$.getDynamicValue(var35) && module0114.NIL == f7955(var34.first())) {
            Errors.error((SubLObject)module0114.$ic20$, var34.first());
        }
        final SubLObject var36 = module0035.f2439(Symbols.symbol_function((SubLObject)module0114.$ic21$), var34, (SubLObject)module0114.UNPROVIDED);
        if (module0114.NIL != var36) {
            final SubLObject var37 = module0166.f10743(var36);
            if (var37.isString()) {
                Errors.error((SubLObject)module0114.$ic22$, var37);
            }
            else {
                Errors.error((SubLObject)module0114.$ic23$);
            }
        }
        return (SubLObject)module0114.T;
    }
    
    public static SubLObject f7955(final SubLObject var50) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var50.isSymbol() && module0114.NIL != Symbols.fboundp(var50));
    }
    
    public static SubLObject f7948(final SubLObject var34) {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        if (module0114.NIL != module0114.$g1443$.getDynamicValue(var35)) {
            if (module0114.$g1444$.getDynamicValue(var35).isStream()) {
                print_high.prin1(var34, module0114.$g1444$.getDynamicValue(var35));
                streams_high.terpri(module0114.$g1444$.getDynamicValue(var35));
                streams_high.force_output(module0114.$g1444$.getDynamicValue(var35));
            }
            else if (module0114.$g1444$.getDynamicValue(var35).isList()) {
                module0114.$g1444$.setDynamicValue((SubLObject)ConsesLow.cons(var34, module0114.$g1444$.getDynamicValue(var35)), var35);
            }
        }
        return (SubLObject)module0114.NIL;
    }
    
    public static SubLObject f7951(final SubLObject var51, final SubLObject var52) {
        final SubLThread var53 = SubLProcess.currentSubLThread();
        if (module0114.NIL != module0114.$g1443$.getDynamicValue(var53)) {
            if (module0114.$g1444$.getDynamicValue(var53).isStream()) {
                f7956(module0114.$g1444$.getDynamicValue(var53), var51, var52);
            }
            else if (module0114.$g1444$.getDynamicValue(var53).isList()) {
                module0114.$g1444$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var52, var51), module0114.$g1444$.getDynamicValue(var53)), var53);
            }
        }
        return (SubLObject)module0114.NIL;
    }
    
    public static SubLObject f7949(final SubLObject var34) {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        module0538.f33316();
        SubLObject var36 = module0112.f7688(var34);
        if (module0114.NIL != module0538.f33324()) {
            Errors.error(module0538.f33327());
        }
        if (module0114.NIL != module0114.$g1436$.getDynamicValue(var35)) {
            var36 = Functions.funcall(module0114.$g1436$.getDynamicValue(var35), var36);
        }
        return var36;
    }
    
    public static SubLObject f7957(SubLObject var51) {
        var51 = module0205.f13154(var51);
        var51 = module0036.f2531(var51, (SubLObject)module0114.$ic24$, (SubLObject)module0114.$ic25$, (SubLObject)module0114.UNPROVIDED);
        return var51;
    }
    
    public static SubLObject f7950(final SubLObject var2, final SubLObject var35, final SubLObject var52) {
        final SubLThread var53 = SubLProcess.currentSubLThread();
        SubLObject var54 = (SubLObject)module0114.NIL;
        SubLObject var55 = (SubLObject)module0114.NIL;
        try {
            var53.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var56 = Errors.$error_handler$.currentBinding(var53);
            try {
                Errors.$error_handler$.bind((SubLObject)module0114.$ic14$, var53);
                try {
                    try {
                        Numbers.add((SubLObject)module0114.ONE_INTEGER, (SubLObject)module0114.TWO_INTEGER);
                    }
                    finally {
                        final SubLObject var4_55 = Threads.$is_thread_performing_cleanupP$.currentBinding(var53);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0114.T, var53);
                            var55 = Functions.funcall(f7958(), var2, var35, var52);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var4_55, var53);
                        }
                    }
                }
                catch (Throwable var57) {
                    Errors.handleThrowable(var57, (SubLObject)module0114.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var56, var53);
            }
        }
        catch (Throwable var58) {
            var54 = Errors.handleThrowable(var58, module0003.$g3$.getGlobalValue());
        }
        finally {
            var53.throwStack.pop();
        }
        if (module0114.NIL != var54) {
            f7942();
        }
        return var55;
    }
    
    public static SubLObject f7959(final SubLObject var1, SubLObject var56, SubLObject var57) {
        if (var56 == module0114.UNPROVIDED) {
            var56 = (SubLObject)module0114.T;
        }
        if (var57 == module0114.UNPROVIDED) {
            var57 = (SubLObject)module0114.NIL;
        }
        final SubLThread var58 = SubLProcess.currentSubLThread();
        SubLObject var59 = (SubLObject)module0114.NIL;
        final SubLObject var60 = module0018.$g571$.currentBinding(var58);
        try {
            module0018.$g571$.bind((SubLObject)module0114.NIL, var58);
            var59 = reader.read(var1, var56, var57, (SubLObject)module0114.UNPROVIDED);
        }
        finally {
            module0018.$g571$.rebind(var60, var58);
        }
        module0038.f2827(var1, (SubLObject)module0114.NIL, (SubLObject)module0114.UNPROVIDED);
        return var59;
    }
    
    public static SubLObject f7956(final SubLObject var2, final SubLObject var35, SubLObject var52) {
        if (var52 == module0114.UNPROVIDED) {
            var52 = (SubLObject)module0114.NIL;
        }
        final SubLThread var53 = SubLProcess.currentSubLThread();
        final SubLObject var54 = (module0114.NIL != var52) ? module0114.$g1446$.getDynamicValue(var53) : module0114.$g1445$.getDynamicValue(var53);
        PrintLow.format(var2, (SubLObject)module0114.$ic28$, var54, var35);
        module0038.f2833(var2);
        streams_high.force_output(var2);
        return var35;
    }
    
    public static SubLObject f7960(final SubLObject var60, final SubLObject var61) {
        if (var60.isFunctionSpec() && var61.isFunctionSpec()) {
            module0114.$g1447$.setDynamicValue(var60);
            module0114.$g1448$.setDynamicValue(var61);
            return (SubLObject)module0114.T;
        }
        return (SubLObject)module0114.NIL;
    }
    
    public static SubLObject f7961(final SubLObject var41) {
        assert module0114.NIL != Types.function_spec_p(var41) : var41;
        module0114.$g1436$.setDynamicValue(var41);
        return var41;
    }
    
    public static SubLObject f7952() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0114.NIL != module0114.$g1447$.getDynamicValue(var3) && module0114.NIL != module0114.$g1448$.getDynamicValue(var3)) {
            f7962(module0114.$g1447$.getDynamicValue(var3));
            f7963(module0114.$g1448$.getDynamicValue(var3));
            module0114.$g1447$.setDynamicValue((SubLObject)module0114.NIL, var3);
            module0114.$g1448$.setDynamicValue((SubLObject)module0114.NIL, var3);
        }
        return (SubLObject)module0114.NIL;
    }
    
    public static SubLObject f7953() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        return module0114.$g1432$.getDynamicValue(var3);
    }
    
    public static SubLObject f7958() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        return module0114.$g1438$.getDynamicValue(var3);
    }
    
    public static SubLObject f7962(final SubLObject var62) {
        assert module0114.NIL != Types.function_spec_p(var62) : var62;
        module0114.$g1432$.setDynamicValue(var62);
        return (SubLObject)module0114.T;
    }
    
    public static SubLObject f7963(final SubLObject var63) {
        assert module0114.NIL != Types.function_spec_p(var63) : var63;
        module0114.$g1438$.setDynamicValue(var63);
        return (SubLObject)module0114.T;
    }
    
    public static SubLObject f7964() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        return Numbers.add(module0110.$g1378$.getDynamicValue(var3), module0110.$g1380$.getDynamicValue(var3));
    }
    
    public static SubLObject f7965(final SubLObject var34, final SubLObject var64, final SubLObject var65) {
        final SubLThread var66 = SubLProcess.currentSubLThread();
        assert module0114.NIL != Types.consp(var34) : var34;
        assert module0114.NIL != Types.stringp(var64) : var64;
        assert module0114.NIL != Types.integerp(var65) : var65;
        SubLObject var67 = (SubLObject)module0114.NIL;
        SubLObject var68 = (SubLObject)module0114.NIL;
        SubLObject var69 = (SubLObject)module0114.NIL;
        try {
            var69 = module0004.f82(var64, var65, (SubLObject)module0114.NIL, (SubLObject)module0114.$ic33$);
            if (module0114.NIL != module0003.f70(var69, var64, var65)) {
                var66.resetMultipleValues();
                final SubLObject var68_69 = f7966(var34, var69);
                final SubLObject var70_71 = var66.secondMultipleValue();
                var66.resetMultipleValues();
                var67 = var68_69;
                var68 = var70_71;
                print_high.princ((SubLObject)module0114.$ic34$, var69);
                streams_high.force_output(var69);
            }
        }
        finally {
            final SubLObject var70 = Threads.$is_thread_performing_cleanupP$.currentBinding(var66);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0114.T, var66);
                if (module0114.NIL != var69) {
                    streams_high.close(var69, (SubLObject)module0114.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var70, var66);
            }
        }
        if (module0114.NIL == var68) {
            return Errors.error((SubLObject)module0114.$ic35$, var67);
        }
        return var67;
    }
    
    public static SubLObject f7967(final SubLObject var34, final SubLObject var67) {
        final SubLThread var68 = SubLProcess.currentSubLThread();
        assert module0114.NIL != Types.streamp(var67) : var67;
        var68.resetMultipleValues();
        final SubLObject var69 = f7966(var34, var67);
        final SubLObject var70 = var68.secondMultipleValue();
        var68.resetMultipleValues();
        if (module0114.NIL == var70) {
            return Errors.error((SubLObject)module0114.$ic35$, var69);
        }
        return var69;
    }
    
    public static SubLObject f7966(final SubLObject var34, final SubLObject var67) {
        final SubLThread var68 = SubLProcess.currentSubLThread();
        f7968(var34, var67);
        streams_high.force_output(var67);
        final SubLObject var69 = f7969(var67, module0114.$g1445$.getDynamicValue(var68));
        final SubLObject var70 = f7969(var67, module0114.$g1449$.getGlobalValue());
        return Values.values(var70, (SubLObject)SubLObjectFactory.makeBoolean(!var69.eql(module0114.$g1446$.getDynamicValue(var68))));
    }
    
    public static SubLObject f7968(final SubLObject var72, final SubLObject var67) {
        return PrintLow.format(var67, (SubLObject)module0114.$ic42$, var72);
    }
    
    public static SubLObject f7969(final SubLObject var67, final SubLObject var73) {
        return reader.read_ignoring_errors(var67, (SubLObject)module0114.NIL, var73);
    }
    
    public static SubLObject f7970(final SubLObject var1, final SubLObject var2) {
        return f7940(var1, var2);
    }
    
    public static SubLObject f7971() {
        return f7942();
    }
    
    public static SubLObject f7972() {
        return f7964();
    }
    
    public static SubLObject f7973() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0114", "f7939", "S#9985", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0114", "f7940", "API-SERVER-TOP-LEVEL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0114", "f7942", "API-QUIT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0114", "f7943", "S#9986", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0114", "f7944", "S#9987");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0114", "f7941", "S#9988", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0114", "f7945", "S#9989", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0114", "f7946", "S#9990", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0114", "f7947", "S#9991", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0114", "f7954", "S#9992", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0114", "f7955", "S#9993", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0114", "f7948", "S#9994", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0114", "f7951", "S#9995", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0114", "f7949", "S#9996", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0114", "f7957", "S#9997", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0114", "f7950", "S#9998", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0114", "f7959", "S#9999", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0114", "f7956", "S#10000", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0114", "f7960", "S#10001", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0114", "f7961", "S#10002", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0114", "f7952", "S#10003", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0114", "f7953", "S#10004", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0114", "f7958", "S#10005", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0114", "f7962", "S#10006", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0114", "f7963", "S#10007", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0114", "f7964", "API-PORT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0114", "f7965", "CYC-API-REMOTE-EVAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0114", "f7967", "S#9279", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0114", "f7966", "S#10008", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0114", "f7968", "S#10009", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0114", "f7969", "S#10010", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0114", "f7970", "S#10011", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0114", "f7971", "S#10012", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0114", "f7972", "S#10013", 0, 0, false);
        return (SubLObject)module0114.NIL;
    }
    
    public static SubLObject f7974() {
        module0114.$g1430$ = SubLFiles.defparameter("S#10014", (SubLObject)module0114.NIL);
        module0114.$g1431$ = SubLFiles.defparameter("S#10015", (SubLObject)module0114.$ic8$);
        module0114.$g1432$ = SubLFiles.defparameter("S#9972", module0114.$g1431$.getDynamicValue());
        module0114.$g1433$ = SubLFiles.defparameter("S#10016", (SubLObject)module0114.$ic9$);
        module0114.$g1434$ = SubLFiles.defparameter("S#10017", module0114.$g1433$.getDynamicValue());
        module0114.$g1435$ = SubLFiles.deflexical("S#10018", (SubLObject)module0114.NIL);
        module0114.$g1436$ = SubLFiles.defparameter("S#9971", module0114.$g1435$.getGlobalValue());
        module0114.$g1437$ = SubLFiles.defparameter("S#10019", (SubLObject)module0114.$ic10$);
        module0114.$g1438$ = SubLFiles.defparameter("S#9970", module0114.$g1437$.getDynamicValue());
        module0114.$g1439$ = SubLFiles.defparameter("S#10020", (SubLObject)module0114.NIL);
        module0114.$g1440$ = SubLFiles.defparameter("S#10021", (SubLObject)module0114.NIL);
        module0114.$g1442$ = SubLFiles.deflexical("S#10022", (module0114.NIL != Symbols.boundp((SubLObject)module0114.$ic17$)) ? module0114.$g1442$.getGlobalValue() : Symbols.make_symbol((SubLObject)module0114.$ic18$));
        module0114.$g1443$ = SubLFiles.defparameter("S#10023", (SubLObject)module0114.NIL);
        module0114.$g1444$ = SubLFiles.defparameter("S#10024", (SubLObject)module0114.NIL);
        module0114.$g1445$ = SubLFiles.defparameter("S#10025", (SubLObject)module0114.$ic26$);
        module0114.$g1446$ = SubLFiles.defparameter("S#10026", (SubLObject)module0114.$ic27$);
        module0114.$g1447$ = SubLFiles.defparameter("S#10027", (SubLObject)module0114.NIL);
        module0114.$g1448$ = SubLFiles.defparameter("S#10028", (SubLObject)module0114.NIL);
        module0114.$g1449$ = SubLFiles.deflexical("S#10029", (SubLObject)module0114.$ic41$);
        return (SubLObject)module0114.NIL;
    }
    
    public static SubLObject f7975() {
        module0061.f4481((SubLObject)module0114.$ic0$, (SubLObject)module0114.$ic1$, (SubLObject)module0114.$ic2$);
        module0012.f368((SubLObject)module0114.$ic6$, (SubLObject)module0114.NIL, (SubLObject)module0114.$ic7$, (SubLObject)module0114.NIL, (SubLObject)module0114.NIL);
        module0003.f57((SubLObject)module0114.$ic17$);
        module0012.f368((SubLObject)module0114.$ic36$, (SubLObject)module0114.$ic37$, (SubLObject)module0114.$ic38$, (SubLObject)module0114.$ic39$, (SubLObject)module0114.NIL);
        return (SubLObject)module0114.NIL;
    }
    
    public void declareFunctions() {
        f7973();
    }
    
    public void initializeVariables() {
        f7974();
    }
    
    public void runTopLevelForms() {
        f7975();
    }
    
    static {
        me = (SubLFile)new module0114();
        module0114.$g1430$ = null;
        module0114.$g1431$ = null;
        module0114.$g1432$ = null;
        module0114.$g1433$ = null;
        module0114.$g1434$ = null;
        module0114.$g1435$ = null;
        module0114.$g1436$ = null;
        module0114.$g1437$ = null;
        module0114.$g1438$ = null;
        module0114.$g1439$ = null;
        module0114.$g1440$ = null;
        module0114.$g1442$ = null;
        module0114.$g1443$ = null;
        module0114.$g1444$ = null;
        module0114.$g1445$ = null;
        module0114.$g1446$ = null;
        module0114.$g1447$ = null;
        module0114.$g1448$ = null;
        module0114.$g1449$ = null;
        $ic0$ = SubLObjectFactory.makeKeyword("CYC-API");
        $ic1$ = SubLObjectFactory.makeSymbol("S#9985", "CYC");
        $ic2$ = SubLObjectFactory.makeKeyword("TEXT");
        $ic3$ = SubLObjectFactory.makeString("CYC");
        $ic4$ = SubLObjectFactory.makeSymbol("DOUBLE-FLOAT");
        $ic5$ = SubLObjectFactory.makeKeyword("API-QUIT");
        $ic6$ = SubLObjectFactory.makeSymbol("API-QUIT");
        $ic7$ = SubLObjectFactory.makeString("Explicitly quit this api connection.");
        $ic8$ = SubLObjectFactory.makeSymbol("S#9999", "CYC");
        $ic9$ = SubLObjectFactory.makeSymbol("S#9992", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#10000", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("CLET");
        $ic12$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9972", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10015", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10017", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10016", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9971", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10018", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9970", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10019", "CYC")));
        $ic13$ = SubLObjectFactory.makeString("");
        $ic14$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("TASK-PROCESSOR-REQUEST");
        $ic16$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("S#10030", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1519", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9485", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10031", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10032", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10033", "CYC"));
        $ic17$ = SubLObjectFactory.makeSymbol("S#10022", "CYC");
        $ic18$ = SubLObjectFactory.makeString("API Input EOF Marker");
        $ic19$ = SubLObjectFactory.makeString("Invalid API Request: ~S is not a proper list");
        $ic20$ = SubLObjectFactory.makeString("Invalid API Request: ~S is not a valid API function symbol");
        $ic21$ = SubLObjectFactory.makeSymbol("S#2609", "CYC");
        $ic22$ = SubLObjectFactory.makeString("#$~A is not an existing constant");
        $ic23$ = SubLObjectFactory.makeString("API request references an invalid constant");
        $ic24$ = SubLObjectFactory.makeSymbol("GUID-P");
        $ic25$ = SubLObjectFactory.makeSymbol("GUID-TO-STRING");
        $ic26$ = SubLObjectFactory.makeInteger(200);
        $ic27$ = SubLObjectFactory.makeInteger(500);
        $ic28$ = SubLObjectFactory.makeString("~D ~S");
        $ic29$ = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $ic30$ = SubLObjectFactory.makeSymbol("CONSP");
        $ic31$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic32$ = SubLObjectFactory.makeSymbol("INTEGERP");
        $ic33$ = SubLObjectFactory.makeKeyword("PRIVATE");
        $ic34$ = SubLObjectFactory.makeString("(api-quit) ");
        $ic35$ = SubLObjectFactory.makeString("~A");
        $ic36$ = SubLObjectFactory.makeSymbol("CYC-API-REMOTE-EVAL");
        $ic37$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10034", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#688", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#58", "CYC"));
        $ic38$ = SubLObjectFactory.makeString("Evaluate API-REQUEST on MACHINE using the CYC-API server at TCP PORT");
        $ic39$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10034", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("CONSP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#688", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#58", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")));
        $ic40$ = SubLObjectFactory.makeSymbol("STREAMP");
        $ic41$ = SubLObjectFactory.makeKeyword("EOF");
        $ic42$ = SubLObjectFactory.makeString("~S ");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0114.class
	Total time: 264 ms
	
	Decompiled with Procyon 0.5.32.
*/