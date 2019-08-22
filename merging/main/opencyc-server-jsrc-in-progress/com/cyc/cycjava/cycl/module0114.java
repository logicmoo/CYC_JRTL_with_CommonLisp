package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
            Packages.$package$.bind(Packages.find_package((SubLObject)$ic3$), var3);
            reader.$read_default_float_format$.bind((SubLObject)$ic4$, var3);
            print_high.$print_readably$.bind((SubLObject)NIL, var3);
            reader.$read_eval$.bind((SubLObject)NIL, var3);
            final SubLObject var8 = Threads.process_priority(Threads.current_process());
            try {
                Threads.set_process_priority(Threads.current_process(), Threads.$process_normal_priority$.getGlobalValue());
                SubLObject var9 = (SubLObject)NIL;
                try {
                    var3.throwStack.push($ic5$);
                    final SubLObject var4_10 = $g1430$.currentBinding(var3);
                    try {
                        $g1430$.bind((SubLObject)T, var3);
                        f7941(var1, var2);
                    }
                    finally {
                        $g1430$.rebind(var4_10, var3);
                    }
                }
                catch (Throwable var10) {
                    var9 = Errors.handleThrowable(var10, (SubLObject)$ic5$);
                }
                finally {
                    var3.throwStack.pop();
                }
            }
            finally {
                final SubLObject var4_11 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var3);
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7942() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL != $g1430$.getDynamicValue(var3)) {
            Dynamic.sublisp_throw((SubLObject)$ic5$, (SubLObject)NIL);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7943(final SubLObject var13) {
        return Threads.interrupt_process(var13, Symbols.symbol_function((SubLObject)$ic6$));
    }
    
    public static SubLObject f7944(final SubLObject var14, final SubLObject var15) {
        final SubLObject var16 = var14.rest();
        final SubLObject var18;
        final SubLObject var17 = var18 = var16;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic11$, (SubLObject)$ic12$, ConsesLow.append(var18, (SubLObject)NIL));
    }
    
    public static SubLObject f7941(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0111.$g1406$.currentBinding(var3);
        final SubLObject var5 = module0111.$g1405$.currentBinding(var3);
        final SubLObject var6 = module0111.$g1408$.currentBinding(var3);
        final SubLObject var7 = $g1439$.currentBinding(var3);
        final SubLObject var8 = $g1440$.currentBinding(var3);
        final SubLObject var9 = $g1432$.currentBinding(var3);
        final SubLObject var10 = $g1434$.currentBinding(var3);
        final SubLObject var11 = $g1436$.currentBinding(var3);
        final SubLObject var12 = $g1438$.currentBinding(var3);
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
            module0111.$g1406$.bind((SubLObject)NIL, var3);
            module0111.$g1405$.bind(module0574.f35152(), var3);
            module0111.$g1408$.bind(module0111.$g1407$.getDynamicValue(var3), var3);
            $g1439$.bind(var1, var3);
            $g1440$.bind(var2, var3);
            $g1432$.bind($g1431$.getDynamicValue(var3), var3);
            $g1434$.bind($g1433$.getDynamicValue(var3), var3);
            $g1436$.bind($g1435$.getGlobalValue(), var3);
            $g1438$.bind($g1437$.getDynamicValue(var3), var3);
            module0112.$g1413$.bind(module0112.f7719(), var3);
            module0112.$g1418$.bind((SubLObject)NIL, var3);
            module0112.$g1419$.bind((SubLObject)$ic13$, var3);
            Errors.$ignore_warnsP$.bind((SubLObject)T, var3);
            Errors.$ignore_breaksP$.bind((SubLObject)T, var3);
            module0012.$silent_progressP$.bind((SubLObject)T, var3);
            Errors.$continue_cerrorP$.bind((SubLObject)T, var3);
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
            $g1438$.rebind(var12, var3);
            $g1436$.rebind(var11, var3);
            $g1434$.rebind(var10, var3);
            $g1432$.rebind(var9, var3);
            $g1440$.rebind(var8, var3);
            $g1439$.rebind(var7, var3);
            module0111.$g1408$.rebind(var6, var3);
            module0111.$g1405$.rebind(var5, var3);
            module0111.$g1406$.rebind(var4, var3);
        }
    }
    
    public static SubLObject f7945(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        try {
            var3.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var7 = Errors.$error_handler$.currentBinding(var3);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic14$, var3);
                try {
                    var5 = f7946(var1);
                }
                catch (Throwable var8) {
                    Errors.handleThrowable(var8, (SubLObject)NIL);
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
        if (NIL == var4) {
            try {
                var3.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var7 = Errors.$error_handler$.currentBinding(var3);
                try {
                    Errors.$error_handler$.bind((SubLObject)$ic14$, var3);
                    try {
                        f7947(var5);
                    }
                    catch (Throwable var8) {
                        Errors.handleThrowable(var8, (SubLObject)NIL);
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
        if (NIL == var4) {
            try {
                var3.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var7 = Errors.$error_handler$.currentBinding(var3);
                try {
                    Errors.$error_handler$.bind((SubLObject)$ic14$, var3);
                    try {
                        f7948(var5);
                    }
                    catch (Throwable var8) {
                        Errors.handleThrowable(var8, (SubLObject)NIL);
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
        if (var5.first() == $ic15$) {
            final SubLObject var10 = module0623.$g1441$.getGlobalValue();
            SubLObject var11 = (SubLObject)NIL;
            try {
                var11 = Locks.seize_lock(var10);
                if (NIL == module0623.f38435()) {
                    module0623.f38436();
                }
            }
            finally {
                if (NIL != var11) {
                    Locks.release_lock(var10);
                }
            }
            SubLObject var13;
            final SubLObject var12 = var13 = var5;
            SubLObject var14 = (SubLObject)NIL;
            SubLObject var15 = (SubLObject)NIL;
            SubLObject var16 = (SubLObject)NIL;
            SubLObject var17 = (SubLObject)NIL;
            SubLObject var18 = (SubLObject)NIL;
            SubLObject var19 = (SubLObject)NIL;
            SubLObject var20 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic16$);
            var14 = var13.first();
            var13 = var13.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic16$);
            var15 = var13.first();
            var13 = var13.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic16$);
            var16 = var13.first();
            var13 = var13.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic16$);
            var17 = var13.first();
            var13 = var13.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic16$);
            var18 = var13.first();
            var13 = var13.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic16$);
            var19 = var13.first();
            var13 = var13.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic16$);
            var20 = var13.first();
            var13 = var13.rest();
            if (NIL == var13) {
                module0115.f7994(var15, var16, var17, var18, var19, var20);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic16$);
            }
            return (SubLObject)NIL;
        }
        if (NIL == var4) {
            try {
                var3.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var7 = Errors.$error_handler$.currentBinding(var3);
                try {
                    Errors.$error_handler$.bind((SubLObject)$ic14$, var3);
                    try {
                        var6 = f7949(var5);
                    }
                    catch (Throwable var8) {
                        Errors.handleThrowable(var8, (SubLObject)NIL);
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
        if (NIL != var4) {
            f7950(var2, var4, (SubLObject)T);
        }
        else {
            f7950(var2, var6, (SubLObject)NIL);
        }
        if (NIL != var4) {
            f7951(var4, (SubLObject)T);
        }
        else {
            f7951(var6, (SubLObject)NIL);
        }
        f7952();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7946(final SubLObject var1) {
        final SubLObject var2 = Functions.funcall(f7953(), var1, (SubLObject)NIL, $g1442$.getGlobalValue());
        if (var2.eql($g1442$.getGlobalValue())) {
            f7942();
        }
        return var2;
    }
    
    public static SubLObject f7947(final SubLObject var34) {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        if (NIL != $g1434$.getDynamicValue(var35)) {
            return Functions.funcall($g1434$.getDynamicValue(var35), var34);
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f7954(final SubLObject var34) {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        if (NIL == module0035.f2014(var34)) {
            Errors.error((SubLObject)$ic19$, var34);
        }
        if (NIL == module0112.$g1410$.getDynamicValue(var35) && NIL == f7955(var34.first())) {
            Errors.error((SubLObject)$ic20$, var34.first());
        }
        final SubLObject var36 = module0035.f2439(Symbols.symbol_function((SubLObject)$ic21$), var34, (SubLObject)UNPROVIDED);
        if (NIL != var36) {
            final SubLObject var37 = constants_high_oc.f10743(var36);
            if (var37.isString()) {
                Errors.error((SubLObject)$ic22$, var37);
            }
            else {
                Errors.error((SubLObject)$ic23$);
            }
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f7955(final SubLObject var50) {
        return (SubLObject)makeBoolean(var50.isSymbol() && NIL != Symbols.fboundp(var50));
    }
    
    public static SubLObject f7948(final SubLObject var34) {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        if (NIL != $g1443$.getDynamicValue(var35)) {
            if ($g1444$.getDynamicValue(var35).isStream()) {
                print_high.prin1(var34, $g1444$.getDynamicValue(var35));
                streams_high.terpri($g1444$.getDynamicValue(var35));
                streams_high.force_output($g1444$.getDynamicValue(var35));
            }
            else if ($g1444$.getDynamicValue(var35).isList()) {
                $g1444$.setDynamicValue((SubLObject)ConsesLow.cons(var34, $g1444$.getDynamicValue(var35)), var35);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7951(final SubLObject var51, final SubLObject var52) {
        final SubLThread var53 = SubLProcess.currentSubLThread();
        if (NIL != $g1443$.getDynamicValue(var53)) {
            if ($g1444$.getDynamicValue(var53).isStream()) {
                f7956($g1444$.getDynamicValue(var53), var51, var52);
            }
            else if ($g1444$.getDynamicValue(var53).isList()) {
                $g1444$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var52, var51), $g1444$.getDynamicValue(var53)), var53);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7949(final SubLObject var34) {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        module0538.f33316();
        SubLObject var36 = module0112.f7688(var34);
        if (NIL != module0538.f33324()) {
            Errors.error(module0538.f33327());
        }
        if (NIL != $g1436$.getDynamicValue(var35)) {
            var36 = Functions.funcall($g1436$.getDynamicValue(var35), var36);
        }
        return var36;
    }
    
    public static SubLObject f7957(SubLObject var51) {
        var51 = module0205.f13154(var51);
        var51 = module0036.f2531(var51, (SubLObject)$ic24$, (SubLObject)$ic25$, (SubLObject)UNPROVIDED);
        return var51;
    }
    
    public static SubLObject f7950(final SubLObject var2, final SubLObject var35, final SubLObject var52) {
        final SubLThread var53 = SubLProcess.currentSubLThread();
        SubLObject var54 = (SubLObject)NIL;
        SubLObject var55 = (SubLObject)NIL;
        try {
            var53.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var56 = Errors.$error_handler$.currentBinding(var53);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic14$, var53);
                try {
                    try {
                        Numbers.add((SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER);
                    }
                    finally {
                        final SubLObject var4_55 = Threads.$is_thread_performing_cleanupP$.currentBinding(var53);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var53);
                            var55 = Functions.funcall(f7958(), var2, var35, var52);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var4_55, var53);
                        }
                    }
                }
                catch (Throwable var57) {
                    Errors.handleThrowable(var57, (SubLObject)NIL);
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
        if (NIL != var54) {
            f7942();
        }
        return var55;
    }
    
    public static SubLObject f7959(final SubLObject var1, SubLObject var56, SubLObject var57) {
        if (var56 == UNPROVIDED) {
            var56 = (SubLObject)T;
        }
        if (var57 == UNPROVIDED) {
            var57 = (SubLObject)NIL;
        }
        final SubLThread var58 = SubLProcess.currentSubLThread();
        SubLObject var59 = (SubLObject)NIL;
        final SubLObject var60 = module0018.$g571$.currentBinding(var58);
        try {
            module0018.$g571$.bind((SubLObject)NIL, var58);
            var59 = reader.read(var1, var56, var57, (SubLObject)UNPROVIDED);
        }
        finally {
            module0018.$g571$.rebind(var60, var58);
        }
        module0038.f2827(var1, (SubLObject)NIL, (SubLObject)UNPROVIDED);
        return var59;
    }
    
    public static SubLObject f7956(final SubLObject var2, final SubLObject var35, SubLObject var52) {
        if (var52 == UNPROVIDED) {
            var52 = (SubLObject)NIL;
        }
        final SubLThread var53 = SubLProcess.currentSubLThread();
        final SubLObject var54 = (NIL != var52) ? $g1446$.getDynamicValue(var53) : $g1445$.getDynamicValue(var53);
        PrintLow.format(var2, (SubLObject)$ic28$, var54, var35);
        module0038.f2833(var2);
        streams_high.force_output(var2);
        return var35;
    }
    
    public static SubLObject f7960(final SubLObject var60, final SubLObject var61) {
        if (var60.isFunctionSpec() && var61.isFunctionSpec()) {
            $g1447$.setDynamicValue(var60);
            $g1448$.setDynamicValue(var61);
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7961(final SubLObject var41) {
        assert NIL != Types.function_spec_p(var41) : var41;
        $g1436$.setDynamicValue(var41);
        return var41;
    }
    
    public static SubLObject f7952() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL != $g1447$.getDynamicValue(var3) && NIL != $g1448$.getDynamicValue(var3)) {
            f7962($g1447$.getDynamicValue(var3));
            f7963($g1448$.getDynamicValue(var3));
            $g1447$.setDynamicValue((SubLObject)NIL, var3);
            $g1448$.setDynamicValue((SubLObject)NIL, var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7953() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        return $g1432$.getDynamicValue(var3);
    }
    
    public static SubLObject f7958() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        return $g1438$.getDynamicValue(var3);
    }
    
    public static SubLObject f7962(final SubLObject var62) {
        assert NIL != Types.function_spec_p(var62) : var62;
        $g1432$.setDynamicValue(var62);
        return (SubLObject)T;
    }
    
    public static SubLObject f7963(final SubLObject var63) {
        assert NIL != Types.function_spec_p(var63) : var63;
        $g1438$.setDynamicValue(var63);
        return (SubLObject)T;
    }
    
    public static SubLObject f7964() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        return Numbers.add(module0110.$g1378$.getDynamicValue(var3), module0110.$g1380$.getDynamicValue(var3));
    }
    
    public static SubLObject f7965(final SubLObject var34, final SubLObject var64, final SubLObject var65) {
        final SubLThread var66 = SubLProcess.currentSubLThread();
        assert NIL != Types.consp(var34) : var34;
        assert NIL != Types.stringp(var64) : var64;
        assert NIL != Types.integerp(var65) : var65;
        SubLObject var67 = (SubLObject)NIL;
        SubLObject var68 = (SubLObject)NIL;
        SubLObject var69 = (SubLObject)NIL;
        try {
            var69 = module0004.f82(var64, var65, (SubLObject)NIL, (SubLObject)$ic33$);
            if (NIL != module0003.f70(var69, var64, var65)) {
                var66.resetMultipleValues();
                final SubLObject var68_69 = f7966(var34, var69);
                final SubLObject var70_71 = var66.secondMultipleValue();
                var66.resetMultipleValues();
                var67 = var68_69;
                var68 = var70_71;
                print_high.princ((SubLObject)$ic34$, var69);
                streams_high.force_output(var69);
            }
        }
        finally {
            final SubLObject var70 = Threads.$is_thread_performing_cleanupP$.currentBinding(var66);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var66);
                if (NIL != var69) {
                    streams_high.close(var69, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var70, var66);
            }
        }
        if (NIL == var68) {
            return Errors.error((SubLObject)$ic35$, var67);
        }
        return var67;
    }
    
    public static SubLObject f7967(final SubLObject var34, final SubLObject var67) {
        final SubLThread var68 = SubLProcess.currentSubLThread();
        assert NIL != Types.streamp(var67) : var67;
        var68.resetMultipleValues();
        final SubLObject var69 = f7966(var34, var67);
        final SubLObject var70 = var68.secondMultipleValue();
        var68.resetMultipleValues();
        if (NIL == var70) {
            return Errors.error((SubLObject)$ic35$, var69);
        }
        return var69;
    }
    
    public static SubLObject f7966(final SubLObject var34, final SubLObject var67) {
        final SubLThread var68 = SubLProcess.currentSubLThread();
        f7968(var34, var67);
        streams_high.force_output(var67);
        final SubLObject var69 = f7969(var67, $g1445$.getDynamicValue(var68));
        final SubLObject var70 = f7969(var67, $g1449$.getGlobalValue());
        return Values.values(var70, (SubLObject)makeBoolean(!var69.eql($g1446$.getDynamicValue(var68))));
    }
    
    public static SubLObject f7968(final SubLObject var72, final SubLObject var67) {
        return PrintLow.format(var67, (SubLObject)$ic42$, var72);
    }
    
    public static SubLObject f7969(final SubLObject var67, final SubLObject var73) {
        return reader.read_ignoring_errors(var67, (SubLObject)NIL, var73);
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7974() {
        $g1430$ = SubLFiles.defparameter("S#10014", (SubLObject)NIL);
        $g1431$ = SubLFiles.defparameter("S#10015", (SubLObject)$ic8$);
        $g1432$ = SubLFiles.defparameter("S#9972", $g1431$.getDynamicValue());
        $g1433$ = SubLFiles.defparameter("S#10016", (SubLObject)$ic9$);
        $g1434$ = SubLFiles.defparameter("S#10017", $g1433$.getDynamicValue());
        $g1435$ = SubLFiles.deflexical("S#10018", (SubLObject)NIL);
        $g1436$ = SubLFiles.defparameter("S#9971", $g1435$.getGlobalValue());
        $g1437$ = SubLFiles.defparameter("S#10019", (SubLObject)$ic10$);
        $g1438$ = SubLFiles.defparameter("S#9970", $g1437$.getDynamicValue());
        $g1439$ = SubLFiles.defparameter("S#10020", (SubLObject)NIL);
        $g1440$ = SubLFiles.defparameter("S#10021", (SubLObject)NIL);
        $g1442$ = SubLFiles.deflexical("S#10022", (NIL != Symbols.boundp((SubLObject)$ic17$)) ? $g1442$.getGlobalValue() : Symbols.make_symbol((SubLObject)$ic18$));
        $g1443$ = SubLFiles.defparameter("S#10023", (SubLObject)NIL);
        $g1444$ = SubLFiles.defparameter("S#10024", (SubLObject)NIL);
        $g1445$ = SubLFiles.defparameter("S#10025", (SubLObject)$ic26$);
        $g1446$ = SubLFiles.defparameter("S#10026", (SubLObject)$ic27$);
        $g1447$ = SubLFiles.defparameter("S#10027", (SubLObject)NIL);
        $g1448$ = SubLFiles.defparameter("S#10028", (SubLObject)NIL);
        $g1449$ = SubLFiles.deflexical("S#10029", (SubLObject)$ic41$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7975() {
        module0061.f4481((SubLObject)$ic0$, (SubLObject)$ic1$, (SubLObject)$ic2$);
        module0012.f368((SubLObject)$ic6$, (SubLObject)NIL, (SubLObject)$ic7$, (SubLObject)NIL, (SubLObject)NIL);
        module0003.f57((SubLObject)$ic17$);
        module0012.f368((SubLObject)$ic36$, (SubLObject)$ic37$, (SubLObject)$ic38$, (SubLObject)$ic39$, (SubLObject)NIL);
        return (SubLObject)NIL;
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
        $g1430$ = null;
        $g1431$ = null;
        $g1432$ = null;
        $g1433$ = null;
        $g1434$ = null;
        $g1435$ = null;
        $g1436$ = null;
        $g1437$ = null;
        $g1438$ = null;
        $g1439$ = null;
        $g1440$ = null;
        $g1442$ = null;
        $g1443$ = null;
        $g1444$ = null;
        $g1445$ = null;
        $g1446$ = null;
        $g1447$ = null;
        $g1448$ = null;
        $g1449$ = null;
        $ic0$ = makeKeyword("CYC-API");
        $ic1$ = makeSymbol("S#9985", "CYC");
        $ic2$ = makeKeyword("TEXT");
        $ic3$ = makeString("CYC");
        $ic4$ = makeSymbol("DOUBLE-FLOAT");
        $ic5$ = makeKeyword("API-QUIT");
        $ic6$ = makeSymbol("API-QUIT");
        $ic7$ = makeString("Explicitly quit this api connection.");
        $ic8$ = makeSymbol("S#9999", "CYC");
        $ic9$ = makeSymbol("S#9992", "CYC");
        $ic10$ = makeSymbol("S#10000", "CYC");
        $ic11$ = makeSymbol("CLET");
        $ic12$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#9972", "CYC"), (SubLObject)makeSymbol("S#10015", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10017", "CYC"), (SubLObject)makeSymbol("S#10016", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#9971", "CYC"), (SubLObject)makeSymbol("S#10018", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#9970", "CYC"), (SubLObject)makeSymbol("S#10019", "CYC")));
        $ic13$ = makeString("");
        $ic14$ = makeSymbol("S#38", "CYC");
        $ic15$ = makeSymbol("TASK-PROCESSOR-REQUEST");
        $ic16$ = ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("S#10030", "CYC"), (SubLObject)makeSymbol("S#1519", "CYC"), (SubLObject)makeSymbol("S#9485", "CYC"), (SubLObject)makeSymbol("S#10031", "CYC"), (SubLObject)makeSymbol("S#10032", "CYC"), (SubLObject)makeSymbol("S#10033", "CYC"));
        $ic17$ = makeSymbol("S#10022", "CYC");
        $ic18$ = makeString("API Input EOF Marker");
        $ic19$ = makeString("Invalid API Request: ~S is not a proper list");
        $ic20$ = makeString("Invalid API Request: ~S is not a valid API function symbol");
        $ic21$ = makeSymbol("S#2609", "CYC");
        $ic22$ = makeString("#$~A is not an existing constant");
        $ic23$ = makeString("API request references an invalid constant");
        $ic24$ = makeSymbol("GUID-P");
        $ic25$ = makeSymbol("GUID-TO-STRING");
        $ic26$ = makeInteger(200);
        $ic27$ = makeInteger(500);
        $ic28$ = makeString("~D ~S");
        $ic29$ = makeSymbol("FUNCTION-SPEC-P");
        $ic30$ = makeSymbol("CONSP");
        $ic31$ = makeSymbol("STRINGP");
        $ic32$ = makeSymbol("INTEGERP");
        $ic33$ = makeKeyword("PRIVATE");
        $ic34$ = makeString("(api-quit) ");
        $ic35$ = makeString("~A");
        $ic36$ = makeSymbol("CYC-API-REMOTE-EVAL");
        $ic37$ = ConsesLow.list((SubLObject)makeSymbol("S#10034", "CYC"), (SubLObject)makeSymbol("S#688", "CYC"), (SubLObject)makeSymbol("S#58", "CYC"));
        $ic38$ = makeString("Evaluate API-REQUEST on MACHINE using the CYC-API server at TCP PORT");
        $ic39$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10034", "CYC"), (SubLObject)makeSymbol("CONSP")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#688", "CYC"), (SubLObject)makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#58", "CYC"), (SubLObject)makeSymbol("INTEGERP")));
        $ic40$ = makeSymbol("STREAMP");
        $ic41$ = makeKeyword("EOF");
        $ic42$ = makeString("~S ");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 264 ms
	
	Decompiled with Procyon 0.5.32.
*/