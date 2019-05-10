package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import java.util.ArrayList;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0723 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0723";
    public static final String myFingerPrint = "2eef04e72955425cd10493943838b0fe69dcad54da9b348c9aa72619bcfa85df";
    private static SubLSymbol $g5695$;
    private static SubLSymbol $g5696$;
    private static SubLSymbol $g5697$;
    public static SubLSymbol $g5698$;
    public static SubLSymbol $g5699$;
    public static SubLSymbol $g5700$;
    public static SubLSymbol $g5701$;
    public static SubLSymbol $g5702$;
    public static SubLSymbol $g4466$;
    private static SubLSymbol $g5703$;
    private static SubLSymbol $g5704$;
    private static SubLSymbol $g5705$;
    private static SubLSymbol $g5706$;
    private static SubLSymbol $g5707$;
    private static SubLSymbol $g5708$;
    public static SubLSymbol $g5709$;
    private static SubLSymbol $g5710$;
    private static SubLSymbol $g5711$;
    private static SubLSymbol $g5712$;
    private static SubLSymbol $g5713$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLString $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLString $ic7$;
    private static final SubLString $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLInteger $ic11$;
    private static final SubLString $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLString $ic14$;
    private static final SubLString $ic15$;
    private static final SubLString $ic16$;
    private static final SubLString $ic17$;
    private static final SubLString $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLString $ic20$;
    private static final SubLString $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLString $ic23$;
    private static final SubLString $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLString $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLString $ic29$;
    private static final SubLString $ic30$;
    private static final SubLString $ic31$;
    private static final SubLString $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLString $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLString $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLString $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLString $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLString $ic46$;
    private static final SubLString $ic47$;
    private static final SubLString $ic48$;
    private static final SubLString $ic49$;
    private static final SubLList $ic50$;
    private static final SubLString $ic51$;
    private static final SubLString $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLString $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLString $ic57$;
    private static final SubLString $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLString $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLString $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLString $ic69$;
    private static final SubLString $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLString $ic73$;
    private static final SubLString $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLString $ic76$;
    private static final SubLString $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLString $ic79$;
    private static final SubLString $ic80$;
    private static final SubLString $ic81$;
    private static final SubLFloat $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLList $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLString $ic89$;
    private static final SubLString $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLString $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    
    public static SubLObject f44246(final SubLObject var1, final SubLObject var2) {
        return f44247(var1, var2);
    }
    
    public static SubLObject f44247(final SubLObject var1, final SubLObject var2) {
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
                    final SubLObject var4_10 = $g5695$.currentBinding(var3);
                    try {
                        $g5695$.bind((SubLObject)T, var3);
                        f44248(var1, var2);
                    }
                    finally {
                        $g5695$.rebind(var4_10, var3);
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
    
    public static SubLObject f44249() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL != $g5695$.getDynamicValue(var3)) {
            Dynamic.sublisp_throw((SubLObject)$ic5$, (SubLObject)NIL);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44250(final SubLObject var13) {
        return Threads.interrupt_process(var13, Symbols.symbol_function((SubLObject)$ic6$));
    }
    
    public static SubLObject f44251(final SubLObject var13) {
        return f44250(var13);
    }
    
    public static SubLObject f44252() {
        SubLObject var14 = (SubLObject)ZERO_INTEGER;
        SubLObject var15 = Threads.all_processes();
        SubLObject var16 = (SubLObject)NIL;
        var16 = var15.first();
        while (NIL != var15) {
            if (!var16.eql(Threads.current_process()) && NIL != f44253(var16)) {
                f44250(var16);
                var14 = Numbers.add(var14, (SubLObject)ONE_INTEGER);
            }
            var15 = var15.rest();
            var16 = var15.first();
        }
        return var14;
    }
    
    public static SubLObject f44253(final SubLObject var13) {
        if (NIL != Types.processp(var13)) {
            final SubLObject var14 = Threads.process_name(var13);
            if (NIL == Sequences.search((SubLObject)$ic7$, var14, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL != Sequences.search(PrintLow.format((SubLObject)NIL, (SubLObject)$ic8$, f44254()), var14, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                return (SubLObject)T;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44254() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        return Numbers.add(module0110.$g1378$.getDynamicValue(var3), module0110.$g1379$.getDynamicValue(var3));
    }
    
    public static SubLObject f44248(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        try {
            final SubLObject var4 = f44255(var1);
            f44256(var4, var2);
        }
        finally {
            final SubLObject var5 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var3);
                SubLObject var6 = (SubLObject)NIL;
                try {
                    var3.throwStack.push($ic9$);
                    final SubLObject var4_19 = Errors.$error_handler$.currentBinding(var3);
                    try {
                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic10$), var3);
                        try {
                            streams_high.force_output(var2);
                        }
                        catch (Throwable var7) {
                            Errors.handleThrowable(var7, (SubLObject)NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(var4_19, var3);
                    }
                }
                catch (Throwable var8) {
                    var6 = Errors.handleThrowable(var8, (SubLObject)$ic9$);
                    var3.throwStack.pop();
                }
                finally {
                    var3.throwStack.pop();
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var5, var3);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44256(final SubLObject var17, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread var18 = SubLProcess.currentSubLThread();
        SubLObject var19 = (SubLObject)NIL;
        final SubLObject var20 = module0015.$g131$.currentBinding(var18);
        final SubLObject var21 = Errors.$continue_cerrorP$.currentBinding(var18);
        final SubLObject var22 = $g5696$.currentBinding(var18);
        try {
            module0015.$g131$.bind(var2, var18);
            Errors.$continue_cerrorP$.bind((SubLObject)T, var18);
            $g5696$.bind((SubLObject)T, var18);
            var19 = f44257(var17);
        }
        finally {
            $g5696$.rebind(var22, var18);
            Errors.$continue_cerrorP$.rebind(var21, var18);
            module0015.$g131$.rebind(var20, var18);
        }
        return var19;
    }
    
    public static SubLObject f44255(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        SubLObject var24 = (SubLObject)$ic12$;
        final SubLObject var25 = Strings.make_string($g5697$.getDynamicValue(var23), (SubLObject)Characters.CHAR_space);
        SubLObject var26 = (SubLObject)ZERO_INTEGER;
        SubLObject var27;
        for (var27 = (SubLObject)NIL, var27 = streams_high.read_char(var22, (SubLObject)NIL, (SubLObject)Characters.CHAR_hash, (SubLObject)UNPROVIDED); !var27.eql((SubLObject)Characters.CHAR_hash); var27 = streams_high.read_char(var22, (SubLObject)NIL, (SubLObject)Characters.CHAR_hash, (SubLObject)UNPROVIDED)) {
            if (var26.numE($g5697$.getDynamicValue(var23))) {
                var24 = Sequences.cconcatenate(var24, var25);
                var26 = (SubLObject)ZERO_INTEGER;
            }
            Strings.set_char(var25, var26, var27);
            var26 = Numbers.add(var26, (SubLObject)ONE_INTEGER);
        }
        var24 = Sequences.cconcatenate(var24, module0038.f2623(var25, (SubLObject)ZERO_INTEGER, var26));
        return var24;
    }
    
    public static SubLObject f44258() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        return f44257($g5698$.getDynamicValue(var3));
    }
    
    public static SubLObject f44257(final SubLObject var26) {
        final SubLThread var27 = SubLProcess.currentSubLThread();
        $g5698$.setDynamicValue(var26, var27);
        if (NIL != $g5700$.getDynamicValue(var27)) {
            $g5701$.setDynamicValue((SubLObject)ConsesLow.cons(Sequences.copy_seq(var26), $g5701$.getDynamicValue(var27)), var27);
        }
        var27.resetMultipleValues();
        final SubLObject var28 = f44259(var26);
        final SubLObject var29 = var27.secondMultipleValue();
        final SubLObject var30 = var27.thirdMultipleValue();
        final SubLObject var31 = var27.fourthMultipleValue();
        var27.resetMultipleValues();
        SubLObject var32 = (SubLObject)NIL;
        final SubLObject var33 = $g5702$.currentBinding(var27);
        final SubLObject var34 = $g4466$.currentBinding(var27);
        try {
            $g5702$.bind(var28, var27);
            $g4466$.bind(var29, var27);
            final SubLObject var35 = f44260(f44261());
            final SubLObject var36 = f44262(var35);
            SubLObject var37 = (SubLObject)NIL;
            SubLObject var38 = (SubLObject)NIL;
            final SubLObject var39 = var36;
            SubLObject var40 = (SubLObject)NIL;
            try {
                var40 = Locks.seize_lock(var39);
                var37 = f44263(var35);
                var38 = f44264(var35);
            }
            finally {
                if (NIL != var40) {
                    Locks.release_lock(var39);
                }
            }
            final SubLObject var41 = var37;
            final ArrayList var42 = Dynamic.extract_dynamic_values(var41);
            try {
                Dynamic.bind_dynamic_vars(var41, var38);
                SubLObject var43 = (NIL != var30) ? Packages.find_symbol(var30, (SubLObject)UNPROVIDED) : $g5703$.getGlobalValue();
                if (NIL == f44265(var43)) {
                    var43 = (SubLObject)NIL;
                }
                if (NIL == var30 && NIL == var43) {
                    f44266((SubLObject)$ic14$);
                }
                else if (NIL == var43) {
                    f44266(PrintLow.format((SubLObject)NIL, (SubLObject)$ic15$, var30));
                }
                else if (NIL == Symbols.fboundp(var43)) {
                    f44266(PrintLow.format((SubLObject)NIL, (SubLObject)$ic15$, var30));
                }
                else if (NIL == module0015.f874(var43)) {
                    f44266(PrintLow.format((SubLObject)NIL, (SubLObject)$ic16$, var43));
                }
                else {
                    f44267(var28, var29, var43, var26, var31);
                    var32 = (SubLObject)T;
                }
                f44268(var35);
            }
            finally {
                Dynamic.rebind_dynamic_vars(var41, var42);
            }
        }
        finally {
            $g4466$.rebind(var34, var27);
            $g5702$.rebind(var33, var27);
        }
        if (NIL == var32 && NIL != $g5699$.getDynamicValue(var27)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic17$, var29, var26);
            streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue(var27));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44267(final SubLObject var27, final SubLObject var28, final SubLObject var40, final SubLObject var26, final SubLObject var30) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        try {
            final SubLObject var42 = f44269(var40, var26, var30);
            if (NIL != $g5699$.getDynamicValue(var41)) {
                module0006.f218((SubLObject)T, (SubLObject)$ic18$, module0051.f3552((SubLObject)UNPROVIDED), var28, var40, var42, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            if (NIL != $g5696$.getDynamicValue(var41)) {
                SubLObject var43 = (SubLObject)NIL;
                try {
                    var41.throwStack.push(module0003.$g3$.getGlobalValue());
                    final SubLObject var44 = Errors.$error_handler$.currentBinding(var41);
                    try {
                        Errors.$error_handler$.bind((SubLObject)$ic19$, var41);
                        try {
                            Functions.funcall(Symbols.symbol_function(var40), var42);
                        }
                        catch (Throwable var45) {
                            Errors.handleThrowable(var45, (SubLObject)NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(var44, var41);
                    }
                }
                catch (Throwable var46) {
                    var43 = Errors.handleThrowable(var46, module0003.$g3$.getGlobalValue());
                }
                finally {
                    var41.throwStack.pop();
                }
                if (NIL != var43) {
                    f44266(var43);
                }
            }
            else {
                Functions.funcall(Symbols.symbol_function(var40), var42);
            }
            if (NIL != $g5699$.getDynamicValue(var41)) {
                module0006.f218((SubLObject)T, (SubLObject)$ic20$, module0051.f3552((SubLObject)UNPROVIDED), var40, var28, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        finally {
            final SubLObject var47 = Threads.$is_thread_performing_cleanupP$.currentBinding(var41);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var41);
                SubLObject var48 = (SubLObject)NIL;
                try {
                    var41.throwStack.push($ic9$);
                    final SubLObject var4_44 = Errors.$error_handler$.currentBinding(var41);
                    try {
                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic10$), var41);
                        try {
                            streams_high.force_output(module0015.$g131$.getDynamicValue(var41));
                        }
                        catch (Throwable var49) {
                            Errors.handleThrowable(var49, (SubLObject)NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(var4_44, var41);
                    }
                }
                catch (Throwable var50) {
                    var48 = Errors.handleThrowable(var50, (SubLObject)$ic9$);
                    var41.throwStack.pop();
                }
                finally {
                    var41.throwStack.pop();
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var47, var41);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44266(final SubLObject var42) {
        final SubLThread var43 = SubLProcess.currentSubLThread();
        SubLObject var44 = (SubLObject)NIL;
        try {
            var43.throwStack.push($ic9$);
            final SubLObject var45 = Errors.$error_handler$.currentBinding(var43);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic10$), var43);
                try {
                    if (NIL != streams_high.open_stream_p(module0015.$g131$.getDynamicValue(var43))) {
                        module0642.f39020((SubLObject)$ic21$);
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g155$.getGlobalValue());
                        final SubLObject var4_46 = module0015.$g535$.currentBinding(var43);
                        try {
                            module0015.$g535$.bind((SubLObject)T, var43);
                            module0642.f39020(module0015.$g133$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var4_47 = module0015.$g533$.currentBinding(var43);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var43);
                                module0642.f39067();
                                module0642.f39028((SubLObject)TWO_INTEGER);
                                module0642.f39020(module0015.$g207$.getGlobalValue());
                                final SubLObject var46 = (SubLObject)$ic22$;
                                module0642.f39020(module0015.$g219$.getGlobalValue());
                                if (NIL != var46) {
                                    module0642.f39020(module0015.$g222$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(module0642.f39042(var46));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                }
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var4_48 = module0015.$g533$.currentBinding(var43);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var43);
                                    module0642.f39019((SubLObject)$ic23$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_48, var43);
                                }
                                module0642.f39020(module0015.$g220$.getGlobalValue());
                                module0642.f39020(module0015.$g208$.getGlobalValue());
                                module0015.f741();
                                module0642.f39020(module0015.$g203$.getGlobalValue());
                                final SubLObject var4_49 = module0015.$g537$.currentBinding(var43);
                                try {
                                    module0015.$g537$.bind((SubLObject)T, var43);
                                    module0642.f39019(var42);
                                }
                                finally {
                                    module0015.$g537$.rebind(var4_49, var43);
                                }
                                module0642.f39020(module0015.$g204$.getGlobalValue());
                                module0642.f39029((SubLObject)UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var4_47, var43);
                            }
                            module0642.f39020(module0015.$g134$.getGlobalValue());
                            module0642.f39029((SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g535$.rebind(var4_46, var43);
                        }
                        module0642.f39020(module0015.$g156$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                    }
                    else {
                        module0006.f218(StreamsLow.$standard_output$.getDynamicValue(var43), (SubLObject)$ic24$, var42, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                }
                catch (Throwable var47) {
                    Errors.handleThrowable(var47, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var45, var43);
            }
        }
        catch (Throwable var48) {
            var44 = Errors.handleThrowable(var48, (SubLObject)$ic9$);
        }
        finally {
            var43.throwStack.pop();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44270() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL == module0077.f5302($g5704$.getDynamicValue(var3))) {
            $g5704$.setDynamicValue(module0077.f5313((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44271(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        f44270();
        module0077.f5326(var40, $g5704$.getDynamicValue(var41));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44272(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        if (NIL == module0077.f5302($g5704$.getDynamicValue(var41))) {
            module0077.f5327(var40, $g5704$.getDynamicValue(var41));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44273() {
        $g5704$.setDynamicValue((SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44265(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL == $g5704$.getDynamicValue(var41) || NIL != module0077.f5320(var40, $g5704$.getDynamicValue(var41)));
    }
    
    public static SubLObject f44259(final SubLObject var26) {
        assert NIL != Types.stringp(var26) : var26;
        final SubLObject var27 = f44274(var26, (SubLObject)UNPROVIDED);
        final SubLObject var28 = Sequences.position((SubLObject)Characters.CHAR_at, var26, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY), (SubLObject)ZERO_INTEGER, var27);
        SubLObject var29 = (SubLObject)NIL;
        if (NIL != var28) {
            var29 = Sequences.subseq(var26, (SubLObject)ZERO_INTEGER, var28);
        }
        if (NIL != var27) {
            final SubLObject var30 = Strings.nstring_downcase(module0038.f2623(var26, (SubLObject)((NIL != var28) ? Numbers.add(var28, (SubLObject)ONE_INTEGER) : ZERO_INTEGER), var27), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var31 = Numbers.add(var27, (SubLObject)ONE_INTEGER);
            final SubLObject var32 = Sequences.position_if(Symbols.symbol_function((SubLObject)$ic26$), var26, Symbols.symbol_function((SubLObject)IDENTITY), var31, (SubLObject)UNPROVIDED);
            SubLObject var33 = (SubLObject)NIL;
            SubLObject var34 = (SubLObject)NIL;
            if (NIL != var32) {
                var33 = module0038.f2623(var26, var31, var32);
                var34 = Numbers.add(var32, (SubLObject)ONE_INTEGER);
            }
            else {
                var33 = module0038.f2623(var26, var31, (SubLObject)NIL);
            }
            if (var33.isString()) {
                if (Sequences.length(var33).numE((SubLObject)ZERO_INTEGER)) {
                    var33 = (SubLObject)NIL;
                }
                else {
                    var33 = Strings.nstring_upcase(var33, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
            }
            return Values.values(var29, var30, var33, var34);
        }
        return Values.values(var29, Strings.nstring_downcase(var26, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)NIL, (SubLObject)NIL);
    }
    
    public static SubLObject f44275(final SubLObject var17) {
        final SubLObject var18 = Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)TWO_INTEGER), f44259(var17));
        final SubLObject var19 = (SubLObject)((NIL != var18) ? Packages.find_symbol(var18, (SubLObject)UNPROVIDED) : NIL);
        return var19;
    }
    
    public static SubLObject f44269(final SubLObject var40, final SubLObject var26, final SubLObject var30) {
        return f44276(var26, var30);
    }
    
    public static SubLObject f44277(final SubLObject var25) {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        return Sequences.find(var25, $g5705$.getDynamicValue(var26), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f44274(final SubLObject var57, SubLObject var58) {
        if (var58 == UNPROVIDED) {
            var58 = (SubLObject)ZERO_INTEGER;
        }
        return Sequences.position_if(Symbols.symbol_function((SubLObject)$ic28$), var57, Symbols.symbol_function((SubLObject)IDENTITY), var58, (SubLObject)NIL);
    }
    
    public static SubLObject f44278(final SubLObject var25) {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        return Sequences.find(var25, $g5706$.getDynamicValue(var26), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f44276(final SubLObject var59, final SubLObject var60) {
        if (NIL == var60 || var60.numE(Sequences.length(var59))) {
            return (SubLObject)NIL;
        }
        SubLObject var61 = (SubLObject)NIL;
        SubLObject var62;
        SubLObject var63;
        for (var62 = (SubLObject)NIL, var63 = (SubLObject)NIL, var62 = var60, var63 = f44274(var59, var62); NIL != var63; var63 = f44274(var59, var62)) {
            var61 = (SubLObject)ConsesLow.cons(f44279(var59, var62, var63), var61);
            var62 = Numbers.add(var63, (SubLObject)ONE_INTEGER);
        }
        var61 = (SubLObject)ConsesLow.cons(f44279(var59, var62, var63), var61);
        return Sequences.nreverse(var61);
    }
    
    public static SubLObject f44279(final SubLObject var59, final SubLObject var63, final SubLObject var64) {
        final SubLObject var65 = f44280(var59, var63, var64);
        if (NIL != var65) {
            return (SubLObject)ConsesLow.list(f44281(var59, var63, var65), f44281(var59, Numbers.add(var65, (SubLObject)ONE_INTEGER), var64));
        }
        return f44281(var59, var63, var64);
    }
    
    public static SubLObject f44280(final SubLObject var59, final SubLObject var63, final SubLObject var64) {
        return Sequences.position((SubLObject)Characters.CHAR_equal, var59, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY), var63, var64);
    }
    
    public static SubLObject f44281(final SubLObject var57, SubLObject var66, SubLObject var67) {
        if (var66 == UNPROVIDED) {
            var66 = (SubLObject)ZERO_INTEGER;
        }
        if (var67 == UNPROVIDED) {
            var67 = (SubLObject)NIL;
        }
        final SubLThread var68 = SubLProcess.currentSubLThread();
        if (NIL == var67) {
            var67 = Sequences.length(var57);
        }
        SubLObject var69 = (SubLObject)ZERO_INTEGER;
        SubLObject var72;
        for (SubLObject var70 = var66; var70.numL(var67); var70 = var72, var69 = Numbers.add(var69, (SubLObject)ONE_INTEGER)) {
            var68.resetMultipleValues();
            final SubLObject var71 = f44282(var57, var70, var67);
            var72 = var68.secondMultipleValue();
            var68.resetMultipleValues();
        }
        SubLObject var73 = Strings.make_string(var69, (SubLObject)UNPROVIDED);
        SubLObject var74 = (SubLObject)ZERO_INTEGER;
        SubLObject var75;
        SubLObject var76;
        SubLObject var77;
        SubLObject var78;
        for (var75 = var66, var76 = (SubLObject)NIL; var75.numL(var67); var75 = var78, var76 = (SubLObject)makeBoolean(NIL != var76 || NIL != module0039.f3010(var77))) {
            var68.resetMultipleValues();
            var77 = f44282(var57, var75, var67);
            var78 = var68.secondMultipleValue();
            var68.resetMultipleValues();
            Strings.set_char(var73, var74, var77);
            var74 = Numbers.add(var74, (SubLObject)ONE_INTEGER);
        }
        if (NIL != var76) {
            final SubLObject var79 = module0039.f3050(var73);
            if (NIL == module0039.f3004(var79)) {
                var73 = module0039.f3048(module0039.f3018(var79, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            }
        }
        return var73;
    }
    
    public static SubLObject f44282(final SubLObject var57, final SubLObject var66, final SubLObject var67) {
        final SubLObject var68 = Strings.sublisp_char(var57, var66);
        if (NIL != Characters.charE(var68, (SubLObject)Characters.CHAR_plus)) {
            return Values.values((SubLObject)Characters.CHAR_space, Numbers.add(var66, (SubLObject)ONE_INTEGER));
        }
        if (NIL == Characters.charE(var68, (SubLObject)Characters.CHAR_percent) || Numbers.subtract(var67, var66).numL((SubLObject)THREE_INTEGER)) {
            return Values.values(var68, Numbers.add(var66, (SubLObject)ONE_INTEGER));
        }
        final SubLObject var69 = Characters.digit_char_p(Strings.sublisp_char(var57, Numbers.add(var66, (SubLObject)ONE_INTEGER)), (SubLObject)SIXTEEN_INTEGER);
        final SubLObject var70 = Characters.digit_char_p(Strings.sublisp_char(var57, Numbers.add(var66, (SubLObject)TWO_INTEGER)), (SubLObject)SIXTEEN_INTEGER);
        if (NIL != var69 && NIL != var70) {
            return Values.values(Characters.code_char(Numbers.add(Numbers.multiply(var69, (SubLObject)SIXTEEN_INTEGER), var70)), Numbers.add(var66, (SubLObject)THREE_INTEGER));
        }
        return Values.values(var68, Numbers.add(var66, (SubLObject)ONE_INTEGER));
    }
    
    public static SubLObject f44283(SubLObject var41) {
        if (var41 == UNPROVIDED) {
            var41 = (SubLObject)NIL;
        }
        final SubLThread var42 = SubLProcess.currentSubLThread();
        module0642.f39020((SubLObject)$ic21$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019((SubLObject)$ic30$);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        if (NIL != module0015.f713()) {
            Errors.error((SubLObject)$ic31$);
        }
        module0642.f39020(module0015.$g415$.getGlobalValue());
        module0642.f39020(module0015.$g418$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic32$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g419$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var43 = module0015.$g533$.currentBinding(var42);
        try {
            module0015.$g533$.bind((SubLObject)T, var42);
            module0656.f39836((SubLObject)$ic33$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0656.f39836((SubLObject)$ic34$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var43, var42);
        }
        module0642.f39020(module0015.$g416$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g461$.getGlobalValue());
        module0642.f39020(module0015.$g189$.getGlobalValue());
        module0642.f39020((SubLObject)ONE_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        module0642.f39019((SubLObject)$ic35$);
        module0642.f39020(module0015.$g190$.getGlobalValue());
        module0642.f39020((SubLObject)ONE_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        f44284();
        module0642.f39050();
        module0642.f39020(module0015.$g462$.getGlobalValue());
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44285(SubLObject var41) {
        if (var41 == UNPROVIDED) {
            var41 = (SubLObject)NIL;
        }
        final SubLThread var42 = SubLProcess.currentSubLThread();
        module0642.f39020((SubLObject)$ic21$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        f44286();
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019((SubLObject)$ic30$);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        final SubLObject var43 = module0015.$g132$.getDynamicValue(var42);
        final SubLObject var44 = module0015.$g535$.currentBinding(var42);
        try {
            module0015.$g535$.bind((SubLObject)T, var42);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            if (NIL != var43) {
                module0642.f39020(module0015.$g135$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39042(var43));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_79 = module0015.$g533$.currentBinding(var42);
            try {
                module0015.$g533$.bind((SubLObject)T, var42);
                module0642.f39020(module0015.$g189$.getGlobalValue());
                module0642.f39020((SubLObject)ONE_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                module0642.f39019((SubLObject)$ic37$);
                module0642.f39020(module0015.$g190$.getGlobalValue());
                module0642.f39020((SubLObject)ONE_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                f44284();
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39050();
            }
            finally {
                module0015.$g533$.rebind(var4_79, var42);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var44, var42);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44287(SubLObject var41) {
        if (var41 == UNPROVIDED) {
            var41 = (SubLObject)NIL;
        }
        final SubLThread var42 = SubLProcess.currentSubLThread();
        module0642.f39020((SubLObject)$ic21$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019((SubLObject)$ic30$);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        final SubLObject var43 = module0015.$g132$.getDynamicValue(var42);
        final SubLObject var44 = module0015.$g535$.currentBinding(var42);
        try {
            module0015.$g535$.bind((SubLObject)T, var42);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            if (NIL != var43) {
                module0642.f39020(module0015.$g135$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39042(var43));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_80 = module0015.$g533$.currentBinding(var42);
            try {
                module0015.$g533$.bind((SubLObject)T, var42);
                module0642.f39020(module0015.$g189$.getGlobalValue());
                module0642.f39020((SubLObject)ONE_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                module0642.f39019((SubLObject)$ic39$);
                module0642.f39020(module0015.$g190$.getGlobalValue());
                module0642.f39020((SubLObject)ONE_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                f44284();
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39050();
            }
            finally {
                module0015.$g533$.rebind(var4_80, var42);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var44, var42);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44288(SubLObject var41) {
        if (var41 == UNPROVIDED) {
            var41 = (SubLObject)NIL;
        }
        f44289();
        return f44290(var41);
    }
    
    public static SubLObject f44291(final SubLObject var81) {
        final SubLThread var82 = SubLProcess.currentSubLThread();
        final SubLObject var83 = module0656.f39832((SubLObject)$ic42$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic43$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var83) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var83);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var84 = module0015.$g533$.currentBinding(var82);
        try {
            module0015.$g533$.bind((SubLObject)T, var82);
            module0642.f39019(var81);
        }
        finally {
            module0015.$g533$.rebind(var84, var82);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44286() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g481$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g484$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var4 = module0015.$g533$.currentBinding(var3);
        try {
            module0015.$g533$.bind((SubLObject)T, var3);
            module0642.f39020(module0015.$g405$.getGlobalValue());
            final SubLObject var4_83 = module0015.$g533$.currentBinding(var3);
            try {
                module0015.$g533$.bind((SubLObject)T, var3);
                module0642.f39028((SubLObject)UNPROVIDED);
                module0642.f39020($g5707$.getDynamicValue(var3));
                module0642.f39019((SubLObject)$ic47$);
            }
            finally {
                module0015.$g533$.rebind(var4_83, var3);
            }
            module0642.f39020(module0015.$g406$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var4, var3);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44284() {
        module0656.f39837((SubLObject)$ic44$, (SubLObject)$ic48$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39019((SubLObject)$ic49$);
        module0642.f39026((SubLObject)TWO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44289() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44290(SubLObject var41) {
        if (var41 == UNPROVIDED) {
            var41 = (SubLObject)NIL;
        }
        final SubLThread var42 = SubLProcess.currentSubLThread();
        module0642.f39020((SubLObject)$ic21$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019((SubLObject)$ic51$);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        final SubLObject var43 = module0015.$g132$.getDynamicValue(var42);
        final SubLObject var44 = module0015.$g535$.currentBinding(var42);
        try {
            module0015.$g535$.bind((SubLObject)T, var42);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            if (NIL != var43) {
                module0642.f39020(module0015.$g135$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39042(var43));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_84 = module0015.$g533$.currentBinding(var42);
            try {
                module0015.$g533$.bind((SubLObject)T, var42);
                module0642.f39020(module0015.$g189$.getGlobalValue());
                module0642.f39020((SubLObject)TWO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                module0642.f39019((SubLObject)$ic51$);
                module0642.f39020(module0015.$g190$.getGlobalValue());
                module0642.f39020((SubLObject)TWO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g264$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_85 = module0015.$g533$.currentBinding(var42);
                try {
                    module0015.$g533$.bind((SubLObject)T, var42);
                    SubLObject var45 = conses_high.copy_list($g5708$.getDynamicValue(var42));
                    SubLObject var46 = (SubLObject)NIL;
                    if (module0110.$g127$.getDynamicValue(var42).isString()) {
                        final SubLObject var47 = reader.bq_cons(module0656.f39811(), (SubLObject)$ic52$);
                        if (NIL == conses_high.member(var47, var45, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                            var45 = (SubLObject)ConsesLow.cons(var47, var45);
                        }
                    }
                    SubLObject var48;
                    var46 = (var48 = Sort.sort(var45, Symbols.symbol_function((SubLObject)$ic53$), Symbols.symbol_function((SubLObject)$ic54$)));
                    SubLObject var49 = (SubLObject)NIL;
                    var49 = var48.first();
                    while (NIL != var48) {
                        if (var49.rest().equalp((SubLObject)$ic52$)) {
                            module0642.f39020(module0015.$g275$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var4_86 = module0015.$g533$.currentBinding(var42);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var42);
                                module0642.f39020(module0015.$g381$.getGlobalValue());
                                module0642.f39020(module0015.$g383$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39019(module0656.f39811());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var4_87 = module0015.$g533$.currentBinding(var42);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var42);
                                    module0642.f39019((SubLObject)$ic52$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_87, var42);
                                }
                                module0642.f39020(module0015.$g382$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var4_86, var42);
                            }
                            module0642.f39020(module0015.$g276$.getGlobalValue());
                        }
                        else {
                            module0642.f39020(module0015.$g275$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var4_88 = module0015.$g533$.currentBinding(var42);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var42);
                                module0642.f39020(module0015.$g381$.getGlobalValue());
                                module0642.f39020(module0015.$g383$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                PrintLow.format(module0015.$g131$.getDynamicValue(var42), (SubLObject)$ic55$, module0110.$g570$.getDynamicValue(var42));
                                module0642.f39019(var49.first());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var4_89 = module0015.$g533$.currentBinding(var42);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var42);
                                    module0642.f39019(var49.rest());
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_89, var42);
                                }
                                module0642.f39020(module0015.$g382$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var4_88, var42);
                            }
                            module0642.f39020(module0015.$g276$.getGlobalValue());
                        }
                        var48 = var48.rest();
                        var49 = var48.first();
                    }
                }
                finally {
                    module0015.$g533$.rebind(var4_85, var42);
                }
                module0642.f39020(module0015.$g265$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39050();
            }
            finally {
                module0015.$g533$.rebind(var4_84, var42);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var44, var42);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44292(SubLObject var81) {
        if (var81 == UNPROVIDED) {
            var81 = (SubLObject)NIL;
        }
        final SubLThread var82 = SubLProcess.currentSubLThread();
        if (NIL == var81) {
            var81 = (SubLObject)$ic57$;
        }
        final SubLObject var83 = module0656.f39832((SubLObject)$ic42$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic58$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var83) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var83);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var84 = module0015.$g533$.currentBinding(var82);
        try {
            module0015.$g533$.bind((SubLObject)T, var82);
            module0642.f39019(var81);
        }
        finally {
            module0015.$g533$.rebind(var84, var82);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44293(SubLObject var41) {
        if (var41 == UNPROVIDED) {
            var41 = (SubLObject)NIL;
        }
        return f44290(var41);
    }
    
    public static SubLObject f44294(SubLObject var41) {
        if (var41 == UNPROVIDED) {
            var41 = (SubLObject)NIL;
        }
        return f44290(var41);
    }
    
    public static SubLObject f44295(final SubLObject var94, final SubLObject var95) {
        return (SubLObject)ConsesLow.list(var94, var95);
    }
    
    public static SubLObject f44296(final SubLObject var96) {
        return var96.first();
    }
    
    public static SubLObject f44297(final SubLObject var96) {
        return conses_high.second(var96);
    }
    
    public static SubLObject f44298(final SubLObject var96, final SubLObject var97) {
        ConsesLow.set_nth((SubLObject)ONE_INTEGER, var96, var97);
        return var97;
    }
    
    public static SubLObject f44262(final SubLObject var98) {
        return f44297(Sequences.find((SubLObject)$ic63$, var98, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic64$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f44299(final SubLObject var99) {
        final SubLObject var100 = Sequences.find((SubLObject)$ic63$, var99, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic64$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f44298(var100, Locks.make_lock((SubLObject)$ic65$));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44260(final SubLObject var101) {
        final SubLThread var102 = SubLProcess.currentSubLThread();
        var102.resetMultipleValues();
        SubLObject var103 = Hashtables.gethash(var101, $g5710$.getGlobalValue(), (SubLObject)UNPROVIDED);
        final SubLObject var104 = var102.secondMultipleValue();
        var102.resetMultipleValues();
        if (NIL != var104) {
            return var103;
        }
        var103 = f44300();
        final SubLObject var105 = $g5711$.getGlobalValue();
        SubLObject var106 = (SubLObject)NIL;
        try {
            var106 = Locks.seize_lock(var105);
            Hashtables.sethash(var101, $g5710$.getGlobalValue(), var103);
        }
        finally {
            if (NIL != var106) {
                Locks.release_lock(var105);
            }
        }
        return var103;
    }
    
    public static SubLObject f44301() {
        SubLObject var21 = (SubLObject)NIL;
        var21 = module0030.f1625($g5710$.getGlobalValue());
        var21 = Sort.sort(var21, Symbols.symbol_function((SubLObject)$ic68$), (SubLObject)UNPROVIDED);
        return var21;
    }
    
    public static SubLObject f44302(final SubLObject var101) {
        SubLObject var102 = (SubLObject)NIL;
        final SubLObject var103 = $g5711$.getGlobalValue();
        SubLObject var104 = (SubLObject)NIL;
        try {
            var104 = Locks.seize_lock(var103);
            var102 = Hashtables.remhash(var101, $g5710$.getGlobalValue());
        }
        finally {
            if (NIL != var104) {
                Locks.release_lock(var103);
            }
        }
        return var102;
    }
    
    public static SubLObject f44303() {
        final SubLObject var107 = $g5711$.getGlobalValue();
        SubLObject var108 = (SubLObject)NIL;
        try {
            var108 = Locks.seize_lock(var107);
            Hashtables.clrhash($g5710$.getGlobalValue());
        }
        finally {
            if (NIL != var108) {
                Locks.release_lock(var107);
            }
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f44304(final SubLObject var101) {
        return Hashtables.gethash(var101, $g5710$.getGlobalValue(), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f44261() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL != $g5702$.getDynamicValue(var3)) {
            return $g5702$.getDynamicValue(var3);
        }
        if (NIL != $g4466$.getDynamicValue(var3)) {
            return $g4466$.getDynamicValue(var3);
        }
        return (SubLObject)$ic69$;
    }
    
    public static SubLObject f44305(SubLObject var101) {
        if (var101 == UNPROVIDED) {
            var101 = f44261();
        }
        SubLObject var103;
        final SubLObject var102 = var103 = f44260(var101);
        SubLObject var104 = (SubLObject)NIL;
        var104 = var103.first();
        while (NIL != var103) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic70$, f44296(var104), f44297(var104));
            var103 = var103.rest();
            var104 = var103.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44300() {
        SubLObject var99 = (SubLObject)NIL;
        SubLObject var100 = module0012.$g53$.getGlobalValue();
        SubLObject var101 = (SubLObject)NIL;
        var101 = var100.first();
        while (NIL != var100) {
            final SubLObject var102 = Symbols.symbol_value(var101);
            var99 = (SubLObject)ConsesLow.cons(f44295(var101, var102), var99);
            var100 = var100.rest();
            var101 = var100.first();
        }
        var99 = Sequences.nreverse(var99);
        f44299(var99);
        return var99;
    }
    
    public static SubLObject f44263(final SubLObject var98) {
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic64$), var98);
    }
    
    public static SubLObject f44264(final SubLObject var98) {
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic71$), var98);
    }
    
    public static SubLObject f44306(final SubLObject var94) {
        SubLObject var95 = (SubLObject)NIL;
        SubLObject var96 = (SubLObject)NIL;
        final Iterator var97 = Hashtables.getEntrySetIterator($g5710$.getGlobalValue());
        try {
            while (Hashtables.iteratorHasNext(var97)) {
                final Map.Entry var98 = Hashtables.iteratorNextEntry(var97);
                var95 = Hashtables.getEntryKey(var98);
                var96 = Hashtables.getEntryValue(var98);
                if (NIL == Sequences.find(var94, var96, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic64$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    Hashtables.sethash(var95, $g5710$.getGlobalValue(), (SubLObject)ConsesLow.cons(f44295(var94, (SubLObject)NIL), var96));
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var97);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44307(final SubLObject var94, final SubLObject var101) {
        assert NIL != Types.symbolp(var94) : var94;
        assert NIL != Types.stringp(var101) : var101;
        final SubLObject var102 = f44260(var101);
        if (NIL != var102) {
            final SubLObject var103 = Sequences.find(var94, var102, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic64$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL != var103) {
                return f44297(var103);
            }
            Errors.warn((SubLObject)$ic73$, var94, var101);
        }
        else {
            Errors.warn((SubLObject)$ic74$, var101);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44308(final SubLObject var94, final SubLObject var101, SubLObject var95) {
        if (var95 == UNPROVIDED) {
            var95 = Eval.eval(var94);
        }
        assert NIL != Types.symbolp(var94) : var94;
        assert NIL != Types.stringp(var101) : var101;
        final SubLObject var102 = f44260(var101);
        if (NIL != var102) {
            final SubLObject var103 = Sequences.find(var94, var102, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic64$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL != var103) {
                f44298(var103, var95);
            }
            else {
                Errors.warn((SubLObject)$ic73$, var94, var101);
            }
        }
        else {
            Errors.warn((SubLObject)$ic74$, var101);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44309(final SubLObject var94, SubLObject var95) {
        if (var95 == UNPROVIDED) {
            var95 = Eval.eval(var94);
        }
        assert NIL != Types.symbolp(var94) : var94;
        SubLObject var96 = (SubLObject)NIL;
        SubLObject var97 = (SubLObject)NIL;
        final Iterator var98 = Hashtables.getEntrySetIterator($g5710$.getGlobalValue());
        try {
            while (Hashtables.iteratorHasNext(var98)) {
                final Map.Entry var99 = Hashtables.iteratorNextEntry(var98);
                var96 = Hashtables.getEntryKey(var99);
                var97 = Hashtables.getEntryValue(var99);
                if (NIL != var97) {
                    final SubLObject var100 = Sequences.find(var94, var97, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic64$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    if (NIL == var100) {
                        continue;
                    }
                    f44298(var100, var95);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var98);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44268(final SubLObject var98) {
        final SubLObject var112_113;
        final SubLObject var99 = var112_113 = f44262(var98);
        SubLObject var100 = (SubLObject)NIL;
        try {
            var100 = Locks.seize_lock(var112_113);
            SubLObject var101 = var98;
            SubLObject var102 = (SubLObject)NIL;
            var102 = var101.first();
            while (NIL != var101) {
                final SubLObject var103 = f44296(var102);
                f44298(var102, Symbols.symbol_value(var103));
                var101 = var101.rest();
                var102 = var101.first();
            }
        }
        finally {
            if (NIL != var100) {
                Locks.release_lock(var112_113);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44310() {
        final SubLObject var116 = f44301();
        SubLObject var117 = (SubLObject)NIL;
        SubLObject var118 = var116;
        SubLObject var119 = (SubLObject)NIL;
        var119 = var118.first();
        while (NIL != var118) {
            final SubLObject var120 = f44307((SubLObject)$ic75$, var119);
            var117 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var119, var120), var117);
            var118 = var118.rest();
            var119 = var118.first();
        }
        return Sequences.nreverse(var117);
    }
    
    public static SubLObject f44311(final SubLObject var41) {
        final SubLThread var42 = SubLProcess.currentSubLThread();
        module0642.f39020((SubLObject)$ic21$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019((SubLObject)$ic76$);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        final SubLObject var43 = module0015.$g132$.getDynamicValue(var42);
        final SubLObject var44 = module0015.$g535$.currentBinding(var42);
        try {
            module0015.$g535$.bind((SubLObject)T, var42);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            if (NIL != var43) {
                module0642.f39020(module0015.$g135$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39042(var43));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_117 = module0015.$g533$.currentBinding(var42);
            try {
                module0015.$g533$.bind((SubLObject)T, var42);
                module0642.f39020(module0015.$g189$.getGlobalValue());
                module0642.f39020((SubLObject)TWO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                module0642.f39019((SubLObject)$ic76$);
                module0642.f39020(module0015.$g190$.getGlobalValue());
                module0642.f39020((SubLObject)TWO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g199$.getGlobalValue());
                PrintLow.format(module0015.$g131$.getDynamicValue(var42), (SubLObject)$ic77$, $g5702$.getDynamicValue(var42), $g4466$.getDynamicValue(var42));
                module0642.f39020(module0015.$g200$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39050();
            }
            finally {
                module0015.$g533$.rebind(var4_117, var42);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var44, var42);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44312(final SubLObject var101) {
        if (NIL != f44313(var101)) {
            final SubLObject var102 = module0226.f15171((SubLObject)UNPROVIDED);
            if (NIL != module0173.f10955(var102)) {
                final SubLObject var103 = f44260(var101);
                final SubLObject var104 = f44262(var103);
                SubLObject var105 = (SubLObject)NIL;
                SubLObject var106 = (SubLObject)NIL;
                final SubLObject var107 = var104;
                SubLObject var108 = (SubLObject)NIL;
                try {
                    var108 = Locks.seize_lock(var107);
                    var105 = f44263(var103);
                    var106 = f44264(var103);
                }
                finally {
                    if (NIL != var108) {
                        Locks.release_lock(var107);
                    }
                }
                final SubLObject var109 = var105;
                final ArrayList var110 = Dynamic.extract_dynamic_values(var109);
                try {
                    Dynamic.bind_dynamic_vars(var109, var106);
                    module0678.f41455(var102);
                    f44268(var103);
                }
                finally {
                    Dynamic.rebind_dynamic_vars(var109, var110);
                }
                return var102;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44313(final SubLObject var101) {
        return (SubLObject)makeBoolean(var101.isString() && (var101.equal((SubLObject)$ic79$) || var101.equal((SubLObject)$ic80$) || var101.equal((SubLObject)$ic81$) || var101.equal(Environment.get_network_name((SubLObject)UNPROVIDED)) || var101.equal(Environment.get_machine_name((SubLObject)UNPROVIDED)) || NIL != f44314(var101)));
    }
    
    public static SubLObject f44315() {
        final SubLObject var121 = $g5713$.getGlobalValue();
        if (NIL != var121) {
            module0034.f1818(var121);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44316(final SubLObject var122) {
        return module0034.f1829($g5713$.getGlobalValue(), (SubLObject)ConsesLow.list(var122), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f44317(final SubLObject var122) {
        final SubLThread var123 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var122) : var122;
        SubLObject var124 = (SubLObject)NIL;
        if (NIL == var124) {
            SubLObject var125 = module0061.f4460();
            SubLObject var126 = (SubLObject)NIL;
            var126 = var125.first();
            while (NIL == var124 && NIL != var125) {
                SubLObject var127 = (SubLObject)NIL;
                SubLObject var128 = (SubLObject)NIL;
                try {
                    var123.throwStack.push($ic9$);
                    final SubLObject var129 = Errors.$error_handler$.currentBinding(var123);
                    try {
                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic10$), var123);
                        try {
                            final SubLObject var130 = module0003.f61();
                            try {
                                var123.throwStack.push(var130);
                                final SubLObject var4_129 = module0003.$g4$.currentBinding(var123);
                                try {
                                    module0003.$g4$.bind((SubLObject)T, var123);
                                    SubLObject var131 = (SubLObject)NIL;
                                    try {
                                        final SubLObject var4_130 = module0003.$g5$.currentBinding(var123);
                                        try {
                                            module0003.$g5$.bind(Numbers.add((SubLObject)ONE_INTEGER, module0003.$g5$.getDynamicValue(var123)), var123);
                                            var131 = module0003.f62($g5712$.getGlobalValue(), var130);
                                            if ($ic84$ == module0061.f4461(var126)) {
                                                final SubLObject var132 = module0061.f4466(var126);
                                                final SubLObject var133 = module0018.f967();
                                                var124 = module0114.f7965((SubLObject)ConsesLow.listS((SubLObject)EQUAL, var133, (SubLObject)$ic85$), var122, var132);
                                            }
                                        }
                                        finally {
                                            module0003.$g5$.rebind(var4_130, var123);
                                        }
                                    }
                                    finally {
                                        final SubLObject var4_131 = Threads.$is_thread_performing_cleanupP$.currentBinding(var123);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var123);
                                            module0003.f64(var131);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var4_131, var123);
                                        }
                                    }
                                }
                                finally {
                                    module0003.$g4$.rebind(var4_129, var123);
                                }
                            }
                            catch (Throwable var134) {
                                var127 = Errors.handleThrowable(var134, var130);
                            }
                            finally {
                                var123.throwStack.pop();
                            }
                        }
                        catch (Throwable var135) {
                            Errors.handleThrowable(var135, (SubLObject)NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(var129, var123);
                    }
                }
                catch (Throwable var136) {
                    var128 = Errors.handleThrowable(var136, (SubLObject)$ic9$);
                }
                finally {
                    var123.throwStack.pop();
                }
                var125 = var125.rest();
                var126 = var125.first();
            }
        }
        return var124;
    }
    
    public static SubLObject f44314(final SubLObject var122) {
        SubLObject var123 = $g5713$.getGlobalValue();
        if (NIL == var123) {
            var123 = module0034.f1934((SubLObject)$ic83$, (SubLObject)$ic86$, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)ONE_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        SubLObject var124 = module0034.f1814(var123, var122, (SubLObject)$ic87$);
        if (var124 == $ic87$) {
            var124 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f44317(var122)));
            module0034.f1816(var123, var122, var124, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var124);
    }
    
    public static SubLObject f44318(final SubLObject var137, final SubLObject var138) {
        final SubLThread var139 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var137) : var137;
        SubLObject var140 = (SubLObject)NIL;
        SubLObject var141 = (SubLObject)NIL;
        try {
            var141 = compatibility.open_text(var137, (SubLObject)$ic88$);
            if (!var141.isStream()) {
                Errors.error((SubLObject)$ic89$, var137);
            }
            final SubLObject var22_141 = var141;
            SubLObject var142 = var138;
            SubLObject var143 = (SubLObject)NIL;
            var143 = var142.first();
            while (NIL != var142) {
                if (var143.isSymbol()) {
                    final SubLObject var144 = Eval.eval(var143);
                    final SubLObject var145 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic90$, var144);
                    var139.resetMultipleValues();
                    final SubLObject var146 = reader.read_from_string_ignoring_errors(var145, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    final SubLObject var147 = var139.secondMultipleValue();
                    var139.resetMultipleValues();
                    if (!var147.eql((SubLObject)$ic91$) && var146.equal(var144)) {
                        PrintLow.format(var22_141, (SubLObject)$ic92$, var143, var145);
                    }
                }
                var142 = var142.rest();
                var143 = var142.first();
            }
            var140 = (SubLObject)T;
        }
        finally {
            final SubLObject var148 = Threads.$is_thread_performing_cleanupP$.currentBinding(var139);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var139);
                if (var141.isStream()) {
                    streams_high.close(var141, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var148, var139);
            }
        }
        return var140;
    }
    
    public static SubLObject f44319(final SubLObject var137) {
        final SubLThread var138 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var137) : var137;
        if (NIL == Filesys.probe_file(var137)) {
            return Values.values((SubLObject)NIL, module0075.f5219(var137));
        }
        SubLObject var139 = (SubLObject)NIL;
        SubLObject var140 = (SubLObject)NIL;
        SubLObject var141 = (SubLObject)NIL;
        try {
            var141 = compatibility.open_text(var137, (SubLObject)$ic93$);
            if (!var141.isStream()) {
                Errors.error((SubLObject)$ic89$, var137);
            }
            final SubLObject var22_148 = var141;
            SubLObject var142 = (SubLObject)NIL;
            SubLObject var143 = (SubLObject)NIL;
            SubLObject var144 = (SubLObject)NIL;
            try {
                var138.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var145 = Errors.$error_handler$.currentBinding(var138);
                try {
                    Errors.$error_handler$.bind((SubLObject)$ic19$, var138);
                    try {
                        while (NIL == var144) {
                            var142 = reader.read(var22_148, (SubLObject)NIL, (SubLObject)$ic94$, (SubLObject)UNPROVIDED);
                            var144 = Equality.eq(var142, (SubLObject)$ic94$);
                            if (NIL == var144) {
                                var143 = reader.read(var22_148, (SubLObject)NIL, (SubLObject)$ic94$, (SubLObject)UNPROVIDED);
                                var144 = Equality.eq(var143, (SubLObject)$ic94$);
                                if (NIL != var144 || !var142.isSymbol() || NIL == conses_high.member(var142, module0012.$g53$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                    continue;
                                }
                                Eval.eval((SubLObject)ConsesLow.list((SubLObject)$ic95$, var142, (SubLObject)ConsesLow.list((SubLObject)$ic96$, var143)));
                            }
                        }
                    }
                    catch (Throwable var146) {
                        Errors.handleThrowable(var146, (SubLObject)NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var145, var138);
                }
            }
            catch (Throwable var147) {
                var140 = Errors.handleThrowable(var147, module0003.$g3$.getGlobalValue());
            }
            finally {
                var138.throwStack.pop();
            }
            if (NIL == var140) {
                var139 = (SubLObject)T;
            }
        }
        finally {
            final SubLObject var148 = Threads.$is_thread_performing_cleanupP$.currentBinding(var138);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var138);
                if (var141.isStream()) {
                    streams_high.close(var141, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var148, var138);
            }
        }
        return Values.values(var139, var140);
    }
    
    public static SubLObject f44320() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44246", "S#48424", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44247", "HTML-SERVER-TOP-LEVEL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44249", "S#48425", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44250", "S#48426", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44251", "S#48427", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44252", "S#48428", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44253", "S#48429", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44254", "HTML-PORT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44248", "S#48430", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44256", "S#48431", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44255", "S#48432", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44258", "S#48433", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44257", "S#48434", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44267", "S#48435", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44266", "S#48436", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44270", "S#48437", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44271", "S#48438", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44272", "S#48439", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44273", "S#48440", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44265", "S#48441", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44259", "S#48442", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44275", "S#48443", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44269", "S#48444", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44277", "S#48445", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44274", "S#48446", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44278", "S#48447", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44276", "S#48448", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44279", "S#48449", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44280", "S#48450", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44281", "S#48451", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44282", "S#48452", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44283", "CB-SETUP", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44285", "CB-SETUP-FRAME", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44287", "CB-SETUP-FRAME-SCRIPT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44288", "CB-HANDLE-SETUP", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44291", "S#48453", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44286", "S#48454", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44284", "S#48455", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44289", "S#48456", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44290", "MAIN-MENU", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44292", "S#48457", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44293", "MOSAIC-MAIN-MENU", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44294", "MENU", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44295", "S#48458", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44296", "S#48459", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44297", "S#48460", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44298", "S#48461", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44262", "S#1638", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44299", "S#48462", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44260", "S#1637", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44301", "S#43767", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44302", "S#45410", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44303", "S#9539", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44304", "S#48463", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44261", "S#39598", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44305", "S#48464", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44300", "S#48465", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44263", "S#1639", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44264", "S#1640", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44306", "S#48466", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44307", "HTML-VAR-VALUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44308", "S#48467", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44309", "S#48468", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44268", "S#1641", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44310", "S#45409", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44311", "SHOW-REMOTE-USER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44312", "S#48469", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44313", "S#48470", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44315", "S#48471", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44316", "S#48472", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44317", "S#48473", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44314", "S#48474", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44318", "S#45296", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0723", "f44319", "S#45297", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44321() {
        $g5695$ = SubLFiles.defparameter("S#48475", (SubLObject)NIL);
        $g5696$ = SubLFiles.defparameter("S#48476", (SubLObject)NIL);
        $g5697$ = SubLFiles.defparameter("S#48477", (SubLObject)$ic11$);
        $g5698$ = SubLFiles.defparameter("S#48478", (SubLObject)$ic12$);
        $g5699$ = SubLFiles.defparameter("S#48479", (SubLObject)NIL);
        $g5700$ = SubLFiles.defparameter("S#48480", (SubLObject)NIL);
        $g5701$ = SubLFiles.defparameter("S#48481", (SubLObject)NIL);
        $g5702$ = SubLFiles.defparameter("S#48482", (SubLObject)NIL);
        $g4466$ = SubLFiles.defparameter("S#48483", (SubLObject)NIL);
        $g5703$ = SubLFiles.deflexical("S#48484", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic13$)) ? $g5703$.getGlobalValue() : NIL));
        $g5704$ = SubLFiles.defparameter("S#48485", (SubLObject)NIL);
        $g5705$ = SubLFiles.defparameter("S#48486", (SubLObject)$ic27$);
        $g5706$ = SubLFiles.defparameter("S#48487", Sequences.cconcatenate((SubLObject)$ic29$, $g5705$.getDynamicValue()));
        $g5707$ = SubLFiles.defparameter("S#48488", (SubLObject)$ic46$);
        $g5708$ = SubLFiles.defparameter("S#48489", (SubLObject)$ic50$);
        $g5709$ = SubLFiles.defparameter("S#48490", (SubLObject)NIL);
        $g5710$ = SubLFiles.deflexical("S#48491", (NIL != Symbols.boundp((SubLObject)$ic66$)) ? $g5710$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)TEN_INTEGER, Symbols.symbol_function((SubLObject)EQUALP), (SubLObject)UNPROVIDED));
        $g5711$ = SubLFiles.deflexical("S#48492", Locks.make_lock((SubLObject)$ic67$));
        $g5712$ = SubLFiles.deflexical("S#48493", (SubLObject)$ic82$);
        $g5713$ = SubLFiles.deflexical("S#48494", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44322() {
        module0061.f4481((SubLObject)$ic0$, (SubLObject)$ic1$, (SubLObject)$ic2$);
        module0003.f57((SubLObject)$ic13$);
        module0015.f873((SubLObject)$ic36$);
        module0015.f873((SubLObject)$ic38$);
        module0015.f873((SubLObject)$ic40$);
        module0015.f873((SubLObject)$ic41$);
        module0656.f39840((SubLObject)$ic44$, (SubLObject)$ic45$, (SubLObject)ONE_INTEGER);
        module0015.f873((SubLObject)$ic56$);
        module0656.f39840((SubLObject)$ic59$, (SubLObject)$ic60$, (SubLObject)ONE_INTEGER);
        module0015.f873((SubLObject)$ic61$);
        module0015.f873((SubLObject)$ic62$);
        module0012.f441((SubLObject)$ic63$);
        module0003.f57((SubLObject)$ic66$);
        module0015.f873((SubLObject)$ic78$);
        module0034.f1909((SubLObject)$ic83$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f44320();
    }
    
    public void initializeVariables() {
        f44321();
    }
    
    public void runTopLevelForms() {
        f44322();
    }
    
    static {
        me = (SubLFile)new module0723();
        $g5695$ = null;
        $g5696$ = null;
        $g5697$ = null;
        $g5698$ = null;
        $g5699$ = null;
        $g5700$ = null;
        $g5701$ = null;
        $g5702$ = null;
        $g4466$ = null;
        $g5703$ = null;
        $g5704$ = null;
        $g5705$ = null;
        $g5706$ = null;
        $g5707$ = null;
        $g5708$ = null;
        $g5709$ = null;
        $g5710$ = null;
        $g5711$ = null;
        $g5712$ = null;
        $g5713$ = null;
        $ic0$ = makeKeyword("HTML");
        $ic1$ = makeSymbol("S#48424", "CYC");
        $ic2$ = makeKeyword("TEXT");
        $ic3$ = makeString("CYC");
        $ic4$ = makeSymbol("DOUBLE-FLOAT");
        $ic5$ = makeKeyword("HTML-QUIT");
        $ic6$ = makeSymbol("S#48425", "CYC");
        $ic7$ = makeString("dispatcher");
        $ic8$ = makeString("~S server");
        $ic9$ = makeKeyword("IGNORE-ERRORS-TARGET");
        $ic10$ = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic11$ = makeInteger(100);
        $ic12$ = makeString("");
        $ic13$ = makeSymbol("S#48484", "CYC");
        $ic14$ = makeString("No handler function was specified");
        $ic15$ = makeString("No handler for function ~A is defined");
        $ic16$ = makeString("~S is not an HTML handler function");
        $ic17$ = makeString("~%~A called a bogus function.  Message: ~S");
        $ic18$ = makeString("~&~A ~A calls ~A on args ~A ...~%");
        $ic19$ = makeSymbol("S#38", "CYC");
        $ic20$ = makeString("~&~A Finished call to ~A for ~A.~%");
        $ic21$ = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic22$ = makeKeyword("RED");
        $ic23$ = makeString("HTML Transfer halted due to script error:");
        $ic24$ = makeString("~A.~%");
        $ic25$ = makeSymbol("STRINGP");
        $ic26$ = makeSymbol("S#48447", "CYC");
        $ic27$ = makeString("&|");
        $ic28$ = makeSymbol("S#48445", "CYC");
        $ic29$ = makeString("=");
        $ic30$ = makeString("Browser Setup");
        $ic31$ = makeString("Cannot have a FRAMESET tag inside a BODY tag.");
        $ic32$ = makeString("0,*");
        $ic33$ = makeKeyword("EMPTY");
        $ic34$ = makeKeyword("SETUP");
        $ic35$ = makeString("Frames and JavaScript are not Supported");
        $ic36$ = makeSymbol("CB-SETUP");
        $ic37$ = makeString("Frames Supported, JavaScript either not Supported or Disabled");
        $ic38$ = makeSymbol("CB-SETUP-FRAME");
        $ic39$ = makeString("Frames Supported and JavaScript Enabled");
        $ic40$ = makeSymbol("CB-SETUP-FRAME-SCRIPT");
        $ic41$ = makeSymbol("CB-HANDLE-SETUP");
        $ic42$ = makeKeyword("TOP");
        $ic43$ = makeString("cb-handle-setup");
        $ic44$ = makeKeyword("HANDLE-SETUP");
        $ic45$ = makeSymbol("S#48453", "CYC");
        $ic46$ = makeString("\nvar path = location.href;\nvar new_path = path.substring(path.lastIndexOf('/') + 1, path.length) + '-script';\nlocation = new_path;\n");
        $ic47$ = makeString("// ");
        $ic48$ = makeString("Click here now");
        $ic49$ = makeString(" now to optimally configure the interface for your browser's capabilities.");
        $ic50$ = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)makeString("cb-setup"), (SubLObject)makeString("Browser Setup")), (SubLObject)ConsesLow.cons((SubLObject)makeString("cb-start"), (SubLObject)makeString("KB Browser")), (SubLObject)ConsesLow.cons((SubLObject)makeString("cb-start|hb-start"), (SubLObject)makeString("Hierarchy Browser")), (SubLObject)ConsesLow.cons((SubLObject)makeString("cb-start|cyc-navigator"), (SubLObject)makeString("Cyc Navigator")), (SubLObject)ConsesLow.cons((SubLObject)makeString("cb-start|cb-login"), (SubLObject)makeString("User Login")));
        $ic51$ = makeString("Cyc Main Menu");
        $ic52$ = makeString("Cyc Documentation");
        $ic53$ = makeSymbol("STRING<");
        $ic54$ = makeSymbol("CDR");
        $ic55$ = makeString("~A?");
        $ic56$ = makeSymbol("MAIN-MENU");
        $ic57$ = makeString("Main Menu");
        $ic58$ = makeString("main-menu");
        $ic59$ = makeKeyword("MAIN-MENU");
        $ic60$ = makeSymbol("S#48457", "CYC");
        $ic61$ = makeSymbol("MOSAIC-MAIN-MENU");
        $ic62$ = makeSymbol("MENU");
        $ic63$ = makeSymbol("S#48490", "CYC");
        $ic64$ = makeSymbol("S#48459", "CYC");
        $ic65$ = makeString("HTML State");
        $ic66$ = makeSymbol("S#48491", "CYC");
        $ic67$ = makeString("HTML Machine State");
        $ic68$ = makeSymbol("STRING-LESSP");
        $ic69$ = makeString("unknown");
        $ic70$ = makeString("~%~S = ~S");
        $ic71$ = makeSymbol("S#48460", "CYC");
        $ic72$ = makeSymbol("SYMBOLP");
        $ic73$ = makeString("Could not find state variable ~S for ~S");
        $ic74$ = makeString("Could not find state for machine ~S");
        $ic75$ = makeSymbol("*THE-CYCLIST*");
        $ic76$ = makeString("Remote User");
        $ic77$ = makeString("The remote user is ~A at ~A.");
        $ic78$ = makeSymbol("SHOW-REMOTE-USER");
        $ic79$ = makeString("127.0.0.1");
        $ic80$ = makeString("localhost");
        $ic81$ = makeString("localhost.localdomain");
        $ic82$ = (SubLFloat)makeDouble(0.1);
        $ic83$ = makeSymbol("S#48474", "CYC");
        $ic84$ = makeKeyword("CYC-API");
        $ic85$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("CYC-IMAGE-ID")));
        $ic86$ = makeSymbol("S#48494", "CYC");
        $ic87$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic88$ = makeKeyword("OUTPUT");
        $ic89$ = makeString("Unable to open ~S");
        $ic90$ = makeString("~S");
        $ic91$ = makeKeyword("ERROR");
        $ic92$ = makeString("~S ~%    ~A~%");
        $ic93$ = makeKeyword("INPUT");
        $ic94$ = makeKeyword("EOF");
        $ic95$ = makeSymbol("CSETQ");
        $ic96$ = makeSymbol("QUOTE");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 634 ms
	
	Decompiled with Procyon 0.5.32.
*/