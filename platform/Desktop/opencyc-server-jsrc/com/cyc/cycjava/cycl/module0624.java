package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Tcp;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0624 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0624";
    public static final String myFingerPrint = "dbc7952dc2cd8edcd39edf3ed042d1c7b06f52c547520d0b8a711624943a8428";
    private static SubLSymbol $g4800$;
    private static SubLSymbol $g4801$;
    private static SubLSymbol $g4802$;
    private static SubLSymbol $g4803$;
    private static SubLSymbol $g4804$;
    private static SubLSymbol $g4805$;
    private static SubLSymbol $g4806$;
    private static SubLSymbol $g4807$;
    private static SubLSymbol $g4808$;
    private static SubLSymbol $g4809$;
    private static SubLSymbol $g4810$;
    private static SubLSymbol $g4811$;
    private static SubLSymbol $g4812$;
    private static SubLSymbol $g4813$;
    private static SubLSymbol $g4814$;
    private static SubLSymbol $g4815$;
    private static SubLSymbol $g4816$;
    private static SubLSymbol $g4817$;
    private static SubLSymbol $g4818$;
    private static final SubLSymbol $ic0$;
    private static final SubLString $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLString $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLString $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLInteger $ic10$;
    private static final SubLString $ic11$;
    private static final SubLString $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLList $ic14$;
    private static final SubLString $ic15$;
    private static final SubLList $ic16$;
    private static final SubLList $ic17$;
    private static final SubLInteger $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLString $ic20$;
    private static final SubLString $ic21$;
    private static final SubLString $ic22$;
    private static final SubLString $ic23$;
    private static final SubLString $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLList $ic29$;
    private static final SubLString $ic30$;
    private static final SubLList $ic31$;
    private static final SubLList $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLString $ic36$;
    private static final SubLString $ic37$;
    private static final SubLString $ic38$;
    private static final SubLString $ic39$;
    private static final SubLString $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLList $ic42$;
    private static final SubLString $ic43$;
    private static final SubLString $ic44$;
    private static final SubLString $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLString $ic47$;
    private static final SubLString $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLString $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLString $ic52$;
    private static final SubLString $ic53$;
    private static final SubLList $ic54$;
    private static final SubLString $ic55$;
    private static final SubLString $ic56$;
    private static final SubLString $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLString $ic62$;
    private static final SubLString $ic63$;
    private static final SubLString $ic64$;
    private static final SubLString $ic65$;
    private static final SubLString $ic66$;
    private static final SubLString $ic67$;
    private static final SubLList $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLString $ic70$;
    private static final SubLString $ic71$;
    private static final SubLString $ic72$;
    private static final SubLSymbol $ic73$;
    
    public static SubLObject f38471(final SubLObject var1) {
        assert NIL != Types.stringp(var1) : var1;
        return module0084.f5831($g4800$.getGlobalValue(), var1, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f38472() {
        f38473();
        $g4801$.setGlobalValue(Threads.make_process((SubLObject)$ic1$, Symbols.symbol_function((SubLObject)$ic2$)));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38473() {
        if (NIL != $g4801$.getGlobalValue()) {
            Threads.kill_process($g4801$.getGlobalValue());
            $g4801$.setGlobalValue((SubLObject)NIL);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38474() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        while (true) {
            SubLObject var5 = (SubLObject)NIL;
            try {
                var2.throwStack.push($ic7$);
                final SubLObject var6 = Errors.$error_handler$.currentBinding(var2);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic8$), var2);
                    try {
                        if (NIL == $g4800$.getGlobalValue()) {
                            continue;
                        }
                        var4 = (SubLObject)NIL;
                        var3 = module0051.f3644();
                        final SubLObject var7 = module0084.f5821($g4800$.getGlobalValue());
                        SubLObject var8 = (SubLObject)NIL;
                        try {
                            var8 = Locks.seize_lock(var7);
                            SubLObject var9;
                            for (var9 = module0066.f4838(module0067.f4891(module0084.f5820($g4800$.getGlobalValue()))); NIL == module0066.f4841(var9); var9 = module0066.f4840(var9)) {
                                var2.resetMultipleValues();
                                final SubLObject var10 = module0066.f4839(var9);
                                final SubLObject var11 = var2.secondMultipleValue();
                                var2.resetMultipleValues();
                                SubLObject var12 = (SubLObject)NIL;
                                SubLObject var13 = (SubLObject)NIL;
                                try {
                                    var2.throwStack.push(module0003.$g3$.getGlobalValue());
                                    final SubLObject var6_13 = Errors.$error_handler$.currentBinding(var2);
                                    try {
                                        Errors.$error_handler$.bind((SubLObject)$ic9$, var2);
                                        try {
                                            var13 = Numbers.divide(Numbers.subtract(var11, var3), (SubLObject)$ic10$);
                                            if (var13.numL((SubLObject)ZERO_INTEGER)) {
                                                var4 = (SubLObject)ConsesLow.cons(var10, var4);
                                                f38475(var10, (SubLObject)T);
                                            }
                                        }
                                        catch (Throwable var14) {
                                            Errors.handleThrowable(var14, (SubLObject)NIL);
                                        }
                                    }
                                    finally {
                                        Errors.$error_handler$.rebind(var6_13, var2);
                                    }
                                }
                                catch (Throwable var15) {
                                    var12 = Errors.handleThrowable(var15, module0003.$g3$.getGlobalValue());
                                }
                                finally {
                                    var2.throwStack.pop();
                                }
                                if (NIL != var12) {
                                    Errors.warn(var12);
                                }
                            }
                            module0066.f4842(var9);
                        }
                        finally {
                            if (NIL != var8) {
                                Locks.release_lock(var7);
                            }
                        }
                        SubLObject var16 = var4;
                        SubLObject var17 = (SubLObject)NIL;
                        var17 = var16.first();
                        while (NIL != var16) {
                            SubLObject var18 = (SubLObject)NIL;
                            try {
                                var2.throwStack.push(module0003.$g3$.getGlobalValue());
                                final SubLObject var6_14 = Errors.$error_handler$.currentBinding(var2);
                                try {
                                    Errors.$error_handler$.bind((SubLObject)$ic9$, var2);
                                    try {
                                        module0084.f5830($g4800$.getGlobalValue(), var17);
                                    }
                                    catch (Throwable var19) {
                                        Errors.handleThrowable(var19, (SubLObject)NIL);
                                    }
                                }
                                finally {
                                    Errors.$error_handler$.rebind(var6_14, var2);
                                }
                            }
                            catch (Throwable var20) {
                                var18 = Errors.handleThrowable(var20, module0003.$g3$.getGlobalValue());
                            }
                            finally {
                                var2.throwStack.pop();
                            }
                            if (NIL != var18) {
                                Errors.warn(var18);
                            }
                            var16 = var16.rest();
                            var17 = var16.first();
                        }
                        Threads.sleep($g4802$.getGlobalValue());
                    }
                    catch (Throwable var21) {
                        Errors.handleThrowable(var21, (SubLObject)NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var6, var2);
                }
            }
            catch (Throwable var22) {
                var5 = Errors.handleThrowable(var22, (SubLObject)$ic7$);
            }
            finally {
                var2.throwStack.pop();
            }
        }
    }
    
    public static SubLObject f38475(final SubLObject var1, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLThread var20 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var1) : var1;
        if (module0623.f38276().numG((SubLObject)ZERO_INTEGER)) {
            module0623.f38389(PrintLow.format((SubLObject)NIL, (SubLObject)$ic11$, var1), module0623.$g4791$.getGlobalValue());
        }
        if (NIL != var19) {
            Errors.warn((SubLObject)$ic12$, var1);
        }
        SubLObject var21 = (SubLObject)NIL;
        try {
            var20.throwStack.push($ic7$);
            final SubLObject var22 = Errors.$error_handler$.currentBinding(var20);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic8$), var20);
                try {
                    module0626.f38540(var1);
                }
                catch (Throwable var23) {
                    Errors.handleThrowable(var23, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var22, var20);
            }
        }
        catch (Throwable var24) {
            var21 = Errors.handleThrowable(var24, (SubLObject)$ic7$);
        }
        finally {
            var20.throwStack.pop();
        }
        SubLObject var21_22 = (SubLObject)NIL;
        try {
            var20.throwStack.push($ic7$);
            final SubLObject var25 = Errors.$error_handler$.currentBinding(var20);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic8$), var20);
                try {
                    f38476(var1);
                }
                catch (Throwable var26) {
                    Errors.handleThrowable(var26, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var25, var20);
            }
        }
        catch (Throwable var27) {
            var21_22 = Errors.handleThrowable(var27, (SubLObject)$ic7$);
        }
        finally {
            var20.throwStack.pop();
        }
        SubLObject var23_24 = (SubLObject)NIL;
        try {
            var20.throwStack.push($ic7$);
            final SubLObject var25 = Errors.$error_handler$.currentBinding(var20);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic8$), var20);
                try {
                    if (NIL == var19) {
                        module0084.f5830($g4800$.getGlobalValue(), var1);
                    }
                }
                catch (Throwable var26) {
                    Errors.handleThrowable(var26, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var25, var20);
            }
        }
        catch (Throwable var27) {
            var23_24 = Errors.handleThrowable(var27, (SubLObject)$ic7$);
        }
        finally {
            var20.throwStack.pop();
        }
        module0623.f38409(var1);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38477(final SubLObject var25, final SubLObject var1) {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        assert NIL != Types.integerp(var25) : var25;
        assert NIL != Types.stringp(var1) : var1;
        if (var25.numG($g4803$.getGlobalValue())) {
            module0084.f5830($g4800$.getGlobalValue(), var1);
            if (NIL != module0623.f38444()) {
                module0112.f7744((SubLObject)$ic20$, module0115.$g1451$.getDynamicValue(var26), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                PrintLow.format(module0115.$g1451$.getDynamicValue(var26), (SubLObject)$ic21$, var1);
                streams_high.force_output(module0115.$g1451$.getDynamicValue(var26));
            }
            return (SubLObject)$ic22$;
        }
        if (NIL == $g4801$.getGlobalValue()) {
            f38472();
        }
        final SubLObject var27 = Numbers.add(module0051.f3644(), Numbers.multiply(var25, $g4804$.getGlobalValue()));
        final SubLObject var28 = Sequences.cconcatenate((SubLObject)$ic23$, new SubLObject[] { module0018.f967(), $ic24$, var1, $ic25$, module0038.f2624(var25), $ic26$ });
        module0084.f5829($g4800$.getGlobalValue(), var1, var27);
        if (NIL != module0623.f38444()) {
            PrintLow.format(module0115.$g1451$.getDynamicValue(var26), (SubLObject)$ic27$, var28);
            streams_high.force_output(module0115.$g1451$.getDynamicValue(var26));
        }
        return var28;
    }
    
    public static SubLObject f38478() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (NIL == $g4800$.getGlobalValue()) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic33$);
            return (SubLObject)NIL;
        }
        final SubLObject var3 = module0051.f3644();
        final SubLObject var4 = module0084.f5821($g4800$.getGlobalValue());
        SubLObject var5 = (SubLObject)NIL;
        try {
            var5 = Locks.seize_lock(var4);
            SubLObject var6;
            for (var6 = module0066.f4838(module0067.f4891(module0084.f5820($g4800$.getGlobalValue()))); NIL == module0066.f4841(var6); var6 = module0066.f4840(var6)) {
                var2.resetMultipleValues();
                final SubLObject var7 = module0066.f4839(var6);
                final SubLObject var8 = var2.secondMultipleValue();
                var2.resetMultipleValues();
                PrintLow.format((SubLObject)T, (SubLObject)$ic34$, var7, Numbers.divide(Numbers.subtract(var8, var3), (SubLObject)$ic10$));
            }
            module0066.f4842(var6);
        }
        finally {
            if (NIL != var5) {
                Locks.release_lock(var4);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38479() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return (SubLObject)ConsesLow.list(module0114.$g1439$.getDynamicValue(var2), module0114.$g1440$.getDynamicValue(var2), Locks.make_lock((SubLObject)$ic37$));
    }
    
    public static SubLObject f38480(final SubLObject var29) {
        return var29.first();
    }
    
    public static SubLObject f38481(final SubLObject var29) {
        return conses_high.second(var29);
    }
    
    public static SubLObject f38482(final SubLObject var29) {
        return conses_high.third(var29);
    }
    
    public static SubLObject f38483(final SubLObject var1) {
        assert NIL != Types.stringp(var1) : var1;
        final SubLObject var2 = f38479();
        if (module0623.f38276().numG((SubLObject)ZERO_INTEGER)) {
            module0623.f38389(PrintLow.format((SubLObject)NIL, (SubLObject)$ic38$, var2, var1), module0623.$g4791$.getGlobalValue());
        }
        f38484();
        if (f38481(var2).isStream()) {
            module0084.f5829($g4805$.getGlobalValue(), var1, var2);
            final SubLObject var3 = f38482(var2);
            SubLObject var4 = (SubLObject)NIL;
            try {
                var4 = Locks.seize_lock(var3);
                module0115.f7985(f38481(var2), (SubLObject)NIL, (SubLObject)UNPROVIDED);
            }
            finally {
                if (NIL != var4) {
                    Locks.release_lock(var3);
                }
            }
            if (module0623.f38276().numG((SubLObject)ZERO_INTEGER)) {
                module0623.f38389(PrintLow.format((SubLObject)NIL, (SubLObject)$ic39$, var2, var1), module0623.$g4791$.getGlobalValue());
            }
        }
        else if (module0623.f38276().numG((SubLObject)ZERO_INTEGER)) {
            module0623.f38389(PrintLow.format((SubLObject)NIL, (SubLObject)$ic40$, var2), module0623.$g4791$.getGlobalValue());
        }
        module0084.f5829($g4800$.getGlobalValue(), var1, Numbers.add(module0051.f3644(), $g4803$.getGlobalValue()));
        Tcp.$retain_client_socketP$.setDynamicValue((SubLObject)T);
        module0115.f7981();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38485(final SubLObject var1) {
        assert NIL != Types.stringp(var1) : var1;
        SubLObject var2 = (SubLObject)NIL;
        var2 = module0084.f5831($g4805$.getGlobalValue(), var1, (SubLObject)UNPROVIDED);
        if (module0623.f38276().numG((SubLObject)ZERO_INTEGER)) {
            module0623.f38389(PrintLow.format((SubLObject)NIL, (SubLObject)$ic44$, var2, var1), module0623.$g4791$.getGlobalValue());
        }
        return var2;
    }
    
    public static SubLObject f38486(final SubLObject var1) {
        return f38481(f38485(var1));
    }
    
    public static SubLObject f38487(final SubLObject var1) {
        return f38482(f38485(var1));
    }
    
    public static SubLObject f38476(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var1) : var1;
        if (NIL == $g4805$.getGlobalValue()) {
            return (SubLObject)NIL;
        }
        final SubLObject var3 = f38485(var1);
        if (NIL != var3) {
            final SubLObject var4 = f38480(var3);
            final SubLObject var5 = f38481(var3);
            SubLObject var6 = (SubLObject)NIL;
            try {
                var2.throwStack.push($ic7$);
                final SubLObject var7 = Errors.$error_handler$.currentBinding(var2);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic8$), var2);
                    try {
                        try {
                            streams_high.close(var4, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            final SubLObject var6_35 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var2);
                                if (!var4.eql(var5)) {
                                    streams_high.close(var5, (SubLObject)UNPROVIDED);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var6_35, var2);
                            }
                        }
                    }
                    catch (Throwable var8) {
                        Errors.handleThrowable(var8, (SubLObject)NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var7, var2);
                }
            }
            catch (Throwable var9) {
                var6 = Errors.handleThrowable(var9, (SubLObject)$ic7$);
            }
            finally {
                var2.throwStack.pop();
            }
            module0084.f5830($g4805$.getGlobalValue(), var1);
            if (module0623.f38276().numG((SubLObject)ZERO_INTEGER)) {
                module0623.f38389(PrintLow.format((SubLObject)NIL, (SubLObject)$ic45$, var3, var1), module0623.$g4791$.getGlobalValue());
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38488() {
        if (NIL == $g4805$.getGlobalValue()) {
            return (SubLObject)NIL;
        }
        SubLObject var16 = module0084.f5835($g4805$.getGlobalValue());
        SubLObject var17 = (SubLObject)NIL;
        var17 = var16.first();
        while (NIL != var16) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic48$, var17, module0084.f5831($g4805$.getGlobalValue(), var17, (SubLObject)UNPROVIDED));
            var16 = var16.rest();
            var17 = var16.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38489() {
        module0623.f38437();
        module0084.f5828($g4800$.getGlobalValue());
        module0084.f5828($g4805$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38484() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        if (NIL != $g4805$.getGlobalValue()) {
            SubLObject var5;
            var4 = (var5 = module0084.f5835($g4805$.getGlobalValue()));
            SubLObject var6 = (SubLObject)NIL;
            var6 = var5.first();
            while (NIL != var5) {
                if (module0623.f38276().numG((SubLObject)ZERO_INTEGER)) {
                    module0623.f38389(PrintLow.format((SubLObject)NIL, (SubLObject)$ic53$, var6), module0623.$g4791$.getGlobalValue());
                }
                final SubLObject var7 = f38487(var6);
                final SubLObject var8 = f38486(var6);
                SubLObject var9 = (SubLObject)NIL;
                try {
                    var2.throwStack.push($ic7$);
                    final SubLObject var10 = Errors.$error_handler$.currentBinding(var2);
                    try {
                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic8$), var2);
                        try {
                            try {
                                var3 = (SubLObject)T;
                                final SubLObject var42_43 = var7;
                                SubLObject var11 = (SubLObject)NIL;
                                try {
                                    var11 = Locks.seize_lock(var42_43);
                                    module0115.f7985(var8, (SubLObject)$ic54$, (SubLObject)NIL);
                                }
                                finally {
                                    if (NIL != var11) {
                                        Locks.release_lock(var42_43);
                                    }
                                }
                                var3 = (SubLObject)NIL;
                            }
                            finally {
                                final SubLObject var6_45 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var2);
                                    if (NIL != var3) {
                                        if (module0623.f38276().numG((SubLObject)ZERO_INTEGER)) {
                                            module0623.f38389(PrintLow.format((SubLObject)NIL, (SubLObject)$ic55$, var8, var6), module0623.$g4791$.getGlobalValue());
                                        }
                                        f38476(var6);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var6_45, var2);
                                }
                            }
                        }
                        catch (Throwable var12) {
                            Errors.handleThrowable(var12, (SubLObject)NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(var10, var2);
                    }
                }
                catch (Throwable var13) {
                    var9 = Errors.handleThrowable(var13, (SubLObject)$ic7$);
                }
                finally {
                    var2.throwStack.pop();
                }
                var5 = var5.rest();
                var6 = var5.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38490(final SubLObject var46, SubLObject var47) {
        if (var47 == UNPROVIDED) {
            var47 = (SubLObject)NIL;
        }
        final SubLThread var48 = SubLProcess.currentSubLThread();
        final SubLObject var49 = f38491();
        SubLObject var50 = (SubLObject)NIL;
        var48.resetMultipleValues();
        final SubLObject var51 = f38492(var46);
        final SubLObject var52 = var48.secondMultipleValue();
        final SubLObject var53 = var48.thirdMultipleValue();
        var48.resetMultipleValues();
        final SubLObject var54 = (SubLObject)ConsesLow.list((SubLObject)$ic56$, var52, var51);
        final SubLObject var55 = Sequences.cconcatenate(var54, new SubLObject[] { var53, var47 });
        var50 = module0060.f4437(var49, var55, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var50;
    }
    
    public static SubLObject f38493(final SubLObject var46, SubLObject var47) {
        if (var47 == UNPROVIDED) {
            var47 = (SubLObject)NIL;
        }
        return module0004.f78(Sequences.cconcatenate((SubLObject)$ic57$, var46), (SubLObject)$ic58$, (SubLObject)ConsesLow.list(var46, var47));
    }
    
    public static SubLObject f38491() {
        SubLObject var55 = f38494();
        if (NIL == var55) {
            var55 = f38495();
        }
        return var55;
    }
    
    public static SubLObject f38494() {
        final SubLObject var56 = module0026.f1374(module0026.f1349((SubLObject)$ic59$), f38496());
        if (NIL != var56) {
            return module0026.f1371(var56);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38495() {
        final SubLObject var56 = module0026.f1374(module0026.f1349((SubLObject)$ic59$), f38497());
        if (NIL != var56) {
            return module0026.f1371(var56);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38498() {
        final SubLObject var56 = module0026.f1374(module0026.f1349((SubLObject)$ic59$), f38499());
        if (NIL != var56) {
            return module0026.f1371(var56);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38500() {
        final SubLObject var56 = module0026.f1374(module0026.f1349((SubLObject)$ic59$), f38501());
        if (NIL != var56) {
            return module0026.f1371(var56);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38502() {
        final SubLObject var56 = module0026.f1374(module0026.f1349((SubLObject)$ic59$), f38503());
        if (NIL != var56) {
            return module0026.f1371(var56);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38504() {
        final SubLObject var56 = module0026.f1374(module0026.f1349((SubLObject)$ic59$), f38505());
        if (NIL != var56) {
            return module0026.f1371(var56);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38506() {
        final SubLObject var56 = module0026.f1374(module0026.f1349((SubLObject)$ic59$), f38507());
        if (NIL != var56) {
            return module0026.f1371(var56);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38499() {
        return Sequences.cconcatenate(f38508(), new SubLObject[] { module0074.$g1129$.getGlobalValue(), $g4806$.getGlobalValue() });
    }
    
    public static SubLObject f38501() {
        return Sequences.cconcatenate(f38508(), new SubLObject[] { module0074.$g1129$.getGlobalValue(), $g4809$.getGlobalValue() });
    }
    
    public static SubLObject f38503() {
        return Sequences.cconcatenate(f38508(), new SubLObject[] { module0074.$g1129$.getGlobalValue(), $g4807$.getGlobalValue() });
    }
    
    public static SubLObject f38505() {
        return Sequences.cconcatenate(f38508(), new SubLObject[] { module0074.$g1129$.getGlobalValue(), $g4810$.getGlobalValue() });
    }
    
    public static SubLObject f38496() {
        return Sequences.cconcatenate(f38508(), new SubLObject[] { module0074.$g1129$.getGlobalValue(), $g4808$.getGlobalValue() });
    }
    
    public static SubLObject f38497() {
        return Sequences.cconcatenate(f38508(), new SubLObject[] { module0074.$g1129$.getGlobalValue(), $g4811$.getGlobalValue() });
    }
    
    public static SubLObject f38507() {
        return Sequences.cconcatenate(f38508(), new SubLObject[] { module0074.$g1129$.getGlobalValue(), $g4812$.getGlobalValue() });
    }
    
    public static SubLObject f38509() {
        return module0038.f2752(Environment.software_type(), (SubLObject)UNPROVIDED).first();
    }
    
    public static SubLObject f38510() {
        if (NIL == $g4814$.getGlobalValue()) {
            $g4814$.setGlobalValue(Sequences.cconcatenate(module0074.$g1130$.getGlobalValue(), new SubLObject[] { module0074.$g1129$.getGlobalValue(), f38509(), module0074.$g1129$.getGlobalValue(), $g4813$.getGlobalValue() }));
        }
        return $g4814$.getGlobalValue();
    }
    
    public static SubLObject f38511(final SubLObject var57) {
        assert NIL != Types.listp(var57) : var57;
        SubLObject var58 = (SubLObject)NIL;
        SubLObject var59 = (SubLObject)NIL;
        try {
            var59 = streams_high.make_private_string_output_stream();
            streams_high.write_string(f38510(), var59, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            streams_high.write_string(module0074.$g1129$.getGlobalValue(), var59, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var60 = (SubLObject)NIL;
            SubLObject var61 = (SubLObject)NIL;
            SubLObject var62 = (SubLObject)NIL;
            var60 = var57;
            var61 = var60.first();
            for (var62 = (SubLObject)ZERO_INTEGER; NIL != var60; var60 = var60.rest(), var61 = var60.first(), var62 = Numbers.add((SubLObject)ONE_INTEGER, var62)) {
                if (!var62.isZero()) {
                    streams_high.write_string(module0074.$g1129$.getGlobalValue(), var59, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                print_high.princ(var61, var59);
            }
            var58 = streams_high.get_output_stream_string(var59);
        }
        finally {
            final SubLObject var63 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                streams_high.close(var59, (SubLObject)UNPROVIDED);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var63);
            }
        }
        return var58;
    }
    
    public static SubLObject f38508() {
        return f38511($g4815$.getGlobalValue());
    }
    
    public static SubLObject f38492(final SubLObject var46) {
        final SubLObject var47 = module0074.f5152(var46);
        final SubLObject var48 = module0026.f1377(var47, $g4816$.getGlobalValue());
        final SubLObject var49 = module0026.f1377(var47, $g4817$.getGlobalValue());
        final SubLObject var50 = module0026.f1377(var47, $g4818$.getGlobalValue());
        final SubLObject var51 = f38506();
        final SubLObject var52 = module0074.f5158(var49);
        return Values.values(module0026.f1371(var48), f38512(var52, var51), module0074.f5158(var50));
    }
    
    public static SubLObject f38512(final SubLObject var66, final SubLObject var65) {
        SubLObject var67 = (SubLObject)NIL;
        SubLObject var68 = (SubLObject)NIL;
        SubLObject var69 = (SubLObject)NIL;
        SubLObject var70 = (SubLObject)NIL;
        var68 = var66;
        var69 = var68.first();
        for (var70 = (SubLObject)ZERO_INTEGER; NIL != var68; var68 = var68.rest(), var69 = var68.first(), var70 = Numbers.add((SubLObject)ONE_INTEGER, var70)) {
            if (!var70.isZero()) {
                var67 = (SubLObject)ConsesLow.cons(var65, var67);
            }
            var67 = (SubLObject)ConsesLow.cons(var69, var67);
        }
        return Functions.apply(Symbols.symbol_function((SubLObject)$ic73$), Sequences.nreverse(var67));
    }
    
    public static SubLObject f38513() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0624", "f38471", "S#42090", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0624", "f38472", "INITIALIZE-JAVA-API-LEASE-MONITOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0624", "f38473", "HALT-JAVA-API-LEASE-MONITOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0624", "f38474", "S#42091", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0624", "f38475", "RELEASE-RESOURCES-FOR-JAVA-API-CLIENT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0624", "f38477", "ACQUIRE-API-SERVICES-LEASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0624", "f38478", "SHOW-JAVA-API-SERVICE-LEASES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0624", "f38479", "S#42092", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0624", "f38480", "S#42093", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0624", "f38481", "S#42094", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0624", "f38482", "S#42095", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0624", "f38483", "INITIALIZE-JAVA-API-PASSIVE-SOCKET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0624", "f38485", "S#42096", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0624", "f38486", "S#41871", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0624", "f38487", "S#41872", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0624", "f38476", "CLOSE-JAVA-API-SOCKET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0624", "f38488", "SHOW-JAVA-API-SOCKETS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0624", "f38489", "RESET-JAVA-API-KERNEL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0624", "f38484", "S#42097", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0624", "f38490", "S#42098", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0624", "f38493", "S#42099", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0624", "f38491", "S#42100", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0624", "f38494", "S#42101", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0624", "f38495", "S#42102", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0624", "f38498", "S#42103", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0624", "f38500", "S#42104", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0624", "f38502", "S#42105", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0624", "f38504", "S#42106", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0624", "f38506", "S#42107", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0624", "f38499", "S#42108", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0624", "f38501", "S#42109", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0624", "f38503", "S#42110", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0624", "f38505", "S#42111", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0624", "f38496", "S#42112", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0624", "f38497", "S#42113", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0624", "f38507", "S#42114", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0624", "f38509", "S#42115", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0624", "f38510", "S#42116", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0624", "f38511", "S#42117", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0624", "f38508", "S#42118", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0624", "f38492", "S#42119", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0624", "f38512", "S#42120", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38514() {
        $g4800$ = SubLFiles.deflexical("S#42121", module0084.f5827(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
        $g4801$ = SubLFiles.deflexical("S#42122", (SubLObject)NIL);
        $g4802$ = SubLFiles.defconstant("S#42123", (SubLObject)TWO_INTEGER);
        $g4803$ = SubLFiles.defconstant("S#42124", (SubLObject)$ic18$);
        $g4804$ = SubLFiles.defconstant("S#42125", (SubLObject)THREE_INTEGER);
        $g4805$ = SubLFiles.deflexical("S#42126", module0084.f5827(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
        $g4806$ = SubLFiles.deflexical("S#42127", (SubLObject)$ic60$);
        $g4807$ = SubLFiles.deflexical("S#42128", (SubLObject)$ic61$);
        $g4808$ = SubLFiles.deflexical("S#42129", (SubLObject)$ic62$);
        $g4809$ = SubLFiles.deflexical("S#42130", (SubLObject)$ic63$);
        $g4810$ = SubLFiles.deflexical("S#42131", (SubLObject)$ic64$);
        $g4811$ = SubLFiles.deflexical("S#42132", (SubLObject)$ic65$);
        $g4812$ = SubLFiles.deflexical("S#42133", (SubLObject)$ic66$);
        $g4813$ = SubLFiles.deflexical("S#42134", (SubLObject)$ic67$);
        $g4814$ = SubLFiles.deflexical("S#42135", (SubLObject)NIL);
        $g4815$ = SubLFiles.deflexical("S#42136", (SubLObject)$ic68$);
        $g4816$ = SubLFiles.deflexical("S#42137", (SubLObject)$ic70$);
        $g4817$ = SubLFiles.deflexical("S#42138", (SubLObject)$ic71$);
        $g4818$ = SubLFiles.deflexical("S#42139", (SubLObject)$ic72$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38515() {
        module0012.f368((SubLObject)$ic3$, (SubLObject)NIL, (SubLObject)$ic4$, (SubLObject)NIL, (SubLObject)NIL);
        module0012.f368((SubLObject)$ic5$, (SubLObject)NIL, (SubLObject)$ic6$, (SubLObject)NIL, (SubLObject)NIL);
        module0012.f368((SubLObject)$ic13$, (SubLObject)$ic14$, (SubLObject)$ic15$, (SubLObject)$ic16$, (SubLObject)$ic17$);
        module0012.f368((SubLObject)$ic28$, (SubLObject)$ic29$, (SubLObject)$ic30$, (SubLObject)$ic31$, (SubLObject)$ic32$);
        module0012.f368((SubLObject)$ic35$, (SubLObject)NIL, (SubLObject)$ic36$, (SubLObject)NIL, (SubLObject)$ic17$);
        module0012.f368((SubLObject)$ic41$, (SubLObject)$ic42$, (SubLObject)$ic43$, (SubLObject)$ic16$, (SubLObject)$ic17$);
        module0012.f368((SubLObject)$ic46$, (SubLObject)$ic42$, (SubLObject)$ic47$, (SubLObject)$ic16$, (SubLObject)$ic17$);
        module0012.f368((SubLObject)$ic49$, (SubLObject)NIL, (SubLObject)$ic50$, (SubLObject)NIL, (SubLObject)$ic17$);
        module0012.f368((SubLObject)$ic51$, (SubLObject)NIL, (SubLObject)$ic52$, (SubLObject)NIL, (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f38513();
    }
    
    public void initializeVariables() {
        f38514();
    }
    
    public void runTopLevelForms() {
        f38515();
    }
    
    static {
        me = (SubLFile)new module0624();
        $g4800$ = null;
        $g4801$ = null;
        $g4802$ = null;
        $g4803$ = null;
        $g4804$ = null;
        $g4805$ = null;
        $g4806$ = null;
        $g4807$ = null;
        $g4808$ = null;
        $g4809$ = null;
        $g4810$ = null;
        $g4811$ = null;
        $g4812$ = null;
        $g4813$ = null;
        $g4814$ = null;
        $g4815$ = null;
        $g4816$ = null;
        $g4817$ = null;
        $g4818$ = null;
        $ic0$ = makeSymbol("STRINGP");
        $ic1$ = makeString("Java API lease monitor");
        $ic2$ = makeSymbol("S#42091", "CYC");
        $ic3$ = makeSymbol("INITIALIZE-JAVA-API-LEASE-MONITOR");
        $ic4$ = makeString("Initialize the process which monitors lease expirations for java api clients.");
        $ic5$ = makeSymbol("HALT-JAVA-API-LEASE-MONITOR");
        $ic6$ = makeString("Halt the the process which monitors lease expirations for java api clients.");
        $ic7$ = makeKeyword("IGNORE-ERRORS-TARGET");
        $ic8$ = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic9$ = makeSymbol("S#38", "CYC");
        $ic10$ = makeInteger(1000);
        $ic11$ = makeString("Releasing java API resources identified by ~A~%");
        $ic12$ = makeString("~%Releasing java API resources identified by ~A~%");
        $ic13$ = makeSymbol("RELEASE-RESOURCES-FOR-JAVA-API-CLIENT");
        $ic14$ = ConsesLow.list((SubLObject)makeSymbol("S#10033", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#42140", "CYC"));
        $ic15$ = makeString("Closes the outbound api socket and kills active api requests identified by the given uuid-string.\n   @param uuid-string ; stringp\n   @param abnormal?   ; boolean Whether or not the release was abnormal or expected");
        $ic16$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10033", "CYC"), (SubLObject)makeSymbol("STRINGP")));
        $ic17$ = ConsesLow.list((SubLObject)NIL);
        $ic18$ = makeInteger(3600000);
        $ic19$ = makeSymbol("INTEGERP");
        $ic20$ = makeString("*cfasl-kernel-standard-output*");
        $ic21$ = makeString("api services lease denied for ~A~%");
        $ic22$ = makeString("api services lease denied");
        $ic23$ = makeString("api services lease granted by ");
        $ic24$ = makeString(" to ");
        $ic25$ = makeString(" for ");
        $ic26$ = makeString(" milliseconds");
        $ic27$ = makeString("~A~%");
        $ic28$ = makeSymbol("ACQUIRE-API-SERVICES-LEASE");
        $ic29$ = ConsesLow.list((SubLObject)makeSymbol("S#42141", "CYC"), (SubLObject)makeSymbol("S#10033", "CYC"));
        $ic30$ = makeString("Requests an API services lease.  Typical leases are expected to be 10 minutes.  A lease request\n   for a duration longer than one hour is denied.\n   @param lease-duration-in-milliseconds ; integerp, the lease duration in milliseconds\n   @param uuid-string ; stringp, identifies the java api client");
        $ic31$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#42141", "CYC"), (SubLObject)makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10033", "CYC"), (SubLObject)makeSymbol("STRINGP")));
        $ic32$ = ConsesLow.list((SubLObject)makeSymbol("STRINGP"));
        $ic33$ = makeString("There are no Java API client leases.~%");
        $ic34$ = makeString("Java API client ~A lease expires in ~A seconds~%");
        $ic35$ = makeSymbol("SHOW-JAVA-API-SERVICE-LEASES");
        $ic36$ = makeString("Displays the current java api leases.");
        $ic37$ = makeString("Java API stream lock");
        $ic38$ = makeString("Initializing java client socket ~S~%identified by ~A~%");
        $ic39$ = makeString("Initialized java client socket ~S~%identified by ~A~%");
        $ic40$ = makeString("Invalid java client socket ~S~%");
        $ic41$ = makeSymbol("INITIALIZE-JAVA-API-PASSIVE-SOCKET");
        $ic42$ = ConsesLow.list((SubLObject)makeSymbol("S#10033", "CYC"));
        $ic43$ = makeString("Associates the current socket with the given UUID-STRING, then ends this server process\nthat currently uses the socket.");
        $ic44$ = makeString("Looked up socket ~S from dictionary~%identifed by ~A~%");
        $ic45$ = makeString("Removed socket ~S~ from dictionary%identifed by ~A~%");
        $ic46$ = makeSymbol("CLOSE-JAVA-API-SOCKET");
        $ic47$ = makeString("Closes the persistent cfasl socket that is associated with \nthe given UUID-STRING.");
        $ic48$ = makeString("~%~S ==> ~S");
        $ic49$ = makeSymbol("SHOW-JAVA-API-SOCKETS");
        $ic50$ = makeString("Displays the java api sockets.");
        $ic51$ = makeSymbol("RESET-JAVA-API-KERNEL");
        $ic52$ = makeString("Reset this subsystem to an un-initialized state.");
        $ic53$ = makeString("Verifying java api socket identified by ~A~%");
        $ic54$ = ConsesLow.list((SubLObject)makeSymbol("IGNORE"));
        $ic55$ = makeString("closing broken java api socket ~A~%identified by ~A~%");
        $ic56$ = makeString("-cp");
        $ic57$ = makeString("Java proxy for ");
        $ic58$ = makeSymbol("S#42098", "CYC");
        $ic59$ = makeKeyword("LEAST-PRIVILEGED");
        $ic60$ = makeString("JAVA_HOME");
        $ic61$ = makeString("JAVA_LIB");
        $ic62$ = makeString("JAVA_VM");
        $ic63$ = makeString("JAVA_RE_HOME");
        $ic64$ = makeString("JAVA_RE_LIB");
        $ic65$ = makeString("JAVA_RE_VM");
        $ic66$ = makeString("path_separator");
        $ic67$ = makeString("java");
        $ic68$ = ConsesLow.list((SubLObject)ONE_INTEGER, (SubLObject)FOUR_INTEGER, (SubLObject)TWO_INTEGER);
        $ic69$ = makeSymbol("LISTP");
        $ic70$ = makeString("java-main-class");
        $ic71$ = makeString("java-classpath");
        $ic72$ = makeString("java-arguments");
        $ic73$ = makeSymbol("CCONCATENATE");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 318 ms
	
	Decompiled with Procyon 0.5.32.
*/