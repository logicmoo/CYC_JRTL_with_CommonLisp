package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
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

public final class module0724 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0724";
    public static final String myFingerPrint = "d63baf9b6508f2cfb5c2afdde8e0e30fdb9b884027a4b3eaea3cfbcc570b7120";
    public static SubLSymbol $g4467$;
    public static SubLSymbol $g5331$;
    public static SubLSymbol $g5714$;
    public static SubLSymbol $g5715$;
    public static SubLSymbol $g5716$;
    public static SubLSymbol $g5717$;
    public static SubLSymbol $g5718$;
    private static SubLSymbol $g5719$;
    private static SubLSymbol $g5720$;
    private static SubLSymbol $g5721$;
    private static final SubLString $ic0$;
    private static final SubLString $ic1$;
    private static final SubLString $ic2$;
    private static final SubLString $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLString $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLString $ic16$;
    private static final SubLString $ic17$;
    private static final SubLString $ic18$;
    private static final SubLString $ic19$;
    private static final SubLString $ic20$;
    private static final SubLString $ic21$;
    private static final SubLString $ic22$;
    private static final SubLString $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    private static final SubLString $ic28$;
    private static final SubLList $ic29$;
    private static final SubLString $ic30$;
    private static final SubLString $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLInteger $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLList $ic48$;
    private static final SubLString $ic49$;
    private static final SubLList $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLString $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLInteger $ic54$;
    private static final SubLInteger $ic55$;
    private static final SubLInteger $ic56$;
    private static final SubLInteger $ic57$;
    private static final SubLInteger $ic58$;
    private static final SubLInteger $ic59$;
    private static final SubLString $ic60$;
    private static final SubLInteger $ic61$;
    private static final SubLString $ic62$;
    private static final SubLString $ic63$;
    private static final SubLString $ic64$;
    private static final SubLString $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLString $ic67$;
    private static final SubLList $ic68$;
    private static final SubLString $ic69$;
    private static final SubLString $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLInteger $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLString $ic74$;
    private static final SubLString $ic75$;
    private static final SubLString $ic76$;
    private static final SubLString $ic77$;
    private static final SubLList $ic78$;
    private static final SubLList $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLString $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLString $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLString $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLString $ic88$;
    private static final SubLString $ic89$;
    private static final SubLString $ic90$;
    private static final SubLSymbol $ic91$;
    
    public static SubLObject f44323(final SubLObject var1, final SubLObject var2) {
        return f44324(var1, var2);
    }
    
    public static SubLObject f44324(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = Packages.$package$.currentBinding(var3);
        final SubLObject var5 = reader.$read_default_float_format$.currentBinding(var3);
        final SubLObject var6 = print_high.$print_readably$.currentBinding(var3);
        final SubLObject var7 = reader.$read_eval$.currentBinding(var3);
        try {
            Packages.$package$.bind(Packages.find_package((SubLObject)module0724.$ic9$), var3);
            reader.$read_default_float_format$.bind((SubLObject)module0724.$ic10$, var3);
            print_high.$print_readably$.bind((SubLObject)module0724.NIL, var3);
            reader.$read_eval$.bind((SubLObject)module0724.NIL, var3);
            final SubLObject var8 = Threads.process_priority(Threads.current_process());
            try {
                Threads.set_process_priority(Threads.current_process(), Threads.$process_normal_priority$.getGlobalValue());
                var3.resetMultipleValues();
                final SubLObject var9 = f44325(var1);
                final SubLObject var10 = var3.secondMultipleValue();
                final SubLObject var11 = var3.thirdMultipleValue();
                final SubLObject var12 = var3.fourthMultipleValue();
                final SubLObject var13 = var3.fifthMultipleValue();
                var3.resetMultipleValues();
                try {
                    final SubLObject var14 = var9;
                    if (var14.eql((SubLObject)module0724.$ic11$)) {
                        f44326(var2, var11, var10);
                    }
                    else if (var14.eql((SubLObject)module0724.$ic12$)) {
                        f44327(var2, var11, var10);
                    }
                    else if (var14.eql((SubLObject)module0724.$ic13$)) {
                        f44328(var2, var11, var10, var12, var13);
                    }
                }
                finally {
                    final SubLObject var4_15 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0724.T, var3);
                        SubLObject var15 = (SubLObject)module0724.NIL;
                        try {
                            var3.throwStack.push(module0724.$ic14$);
                            final SubLObject var4_16 = Errors.$error_handler$.currentBinding(var3);
                            try {
                                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0724.$ic15$), var3);
                                try {
                                    streams_high.force_output(var2);
                                }
                                catch (Throwable var16) {
                                    Errors.handleThrowable(var16, (SubLObject)module0724.NIL);
                                }
                            }
                            finally {
                                Errors.$error_handler$.rebind(var4_16, var3);
                            }
                        }
                        catch (Throwable var17) {
                            var15 = Errors.handleThrowable(var17, (SubLObject)module0724.$ic14$);
                            var3.throwStack.pop();
                        }
                        finally {
                            var3.throwStack.pop();
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var4_15, var3);
                    }
                }
            }
            finally {
                final SubLObject var4_17 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0724.T, var3);
                    Threads.set_process_priority(Threads.current_process(), var8);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var4_17, var3);
                }
            }
        }
        finally {
            reader.$read_eval$.rebind(var7, var3);
            print_high.$print_readably$.rebind(var6, var3);
            reader.$read_default_float_format$.rebind(var5, var3);
            Packages.$package$.rebind(var4, var3);
        }
        return (SubLObject)module0724.NIL;
    }
    
    public static SubLObject f44329() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        return Numbers.add(module0110.$g1378$.getDynamicValue(var3), module0110.$g1381$.getDynamicValue(var3));
    }
    
    public static SubLObject f44325(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0724.NIL;
        SubLObject var4 = (SubLObject)module0724.NIL;
        SubLObject var5 = (SubLObject)module0724.NIL;
        var2.resetMultipleValues();
        final SubLObject var6 = module0589.f35871(var1, (SubLObject)module0724.T);
        final SubLObject var7 = var2.secondMultipleValue();
        final SubLObject var8 = var2.thirdMultipleValue();
        final SubLObject var9 = var2.fourthMultipleValue();
        var2.resetMultipleValues();
        if (module0724.NIL == var6) {
            return (SubLObject)module0724.NIL;
        }
        var5 = f44330(var9, var1);
        if (module0724.NIL != module0038.f2684(var7, module0724.$g4467$.getGlobalValue())) {
            var3 = (SubLObject)module0724.$ic11$;
        }
        else if (module0724.NIL != module0038.f2684(var7, module0724.$g5715$.getGlobalValue())) {
            var3 = (SubLObject)module0724.$ic13$;
        }
        else {
            var3 = (SubLObject)module0724.$ic12$;
        }
        if (var6.equal((SubLObject)module0724.$ic16$)) {
            var4 = var7;
        }
        else {
            SubLObject var10 = (SubLObject)module0724.NIL;
            try {
                var10 = streams_high.make_private_string_output_stream();
                streams_high.write_string(var7, var10, (SubLObject)module0724.UNPROVIDED, (SubLObject)module0724.UNPROVIDED);
                streams_high.write_char((SubLObject)Characters.CHAR_question, var10);
                final SubLObject var11 = conses_high.assoc((SubLObject)module0724.$ic17$, var9, Symbols.symbol_function((SubLObject)module0724.EQUALP), (SubLObject)module0724.UNPROVIDED).rest();
                if (module0724.NIL != var11) {
                    SubLObject var12;
                    SubLObject var13;
                    for (var12 = reader.parse_integer(var11, (SubLObject)module0724.UNPROVIDED, (SubLObject)module0724.UNPROVIDED, (SubLObject)module0724.UNPROVIDED, (SubLObject)module0724.UNPROVIDED), var13 = (SubLObject)module0724.NIL, var13 = (SubLObject)module0724.ZERO_INTEGER; var13.numL(var12); var13 = Numbers.add(var13, (SubLObject)module0724.ONE_INTEGER)) {
                        streams_high.write_char(streams_high.read_char(var1, (SubLObject)module0724.UNPROVIDED, (SubLObject)module0724.UNPROVIDED, (SubLObject)module0724.UNPROVIDED), var10);
                    }
                }
                var4 = streams_high.get_output_stream_string(var10);
            }
            finally {
                final SubLObject var14 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0724.T, var2);
                    streams_high.close(var10, (SubLObject)module0724.UNPROVIDED);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var14, var2);
                }
            }
        }
        return Values.values(var3, var4, var5, var6, var9);
    }
    
    public static SubLObject f44330(final SubLObject var13, final SubLObject var27) {
        final SubLObject var28 = conses_high.assoc((SubLObject)module0724.$ic18$, var13, Symbols.symbol_function((SubLObject)module0724.EQUALP), (SubLObject)module0724.UNPROVIDED).rest();
        if (var28.isString()) {
            return var28;
        }
        final SubLObject var29 = module0004.f112(var27);
        if (var29.isString()) {
            return var29;
        }
        final SubLObject var30 = module0004.f113(var27);
        if (var30.isString()) {
            return var30;
        }
        return (SubLObject)module0724.$ic19$;
    }
    
    public static SubLObject f44326(final SubLObject var2, final SubLObject var11, final SubLObject var10) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        SubLObject var13 = (SubLObject)module0724.NIL;
        SubLObject var14 = (SubLObject)module0724.NIL;
        try {
            var12.throwStack.push(module0724.$ic14$);
            final SubLObject var15 = Errors.$error_handler$.currentBinding(var12);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0724.$ic15$), var12);
                try {
                    SubLObject var16 = f44331(var10, (SubLObject)module0724.UNPROVIDED);
                    if (module0724.NIL != module0642.f39147(var16)) {
                        final SubLObject var17 = module0642.f39142(var16);
                        var16 = module0642.f39146(var17);
                    }
                    final SubLObject var18 = Sequences.cconcatenate(var11, new SubLObject[] { module0724.$ic20$, var16 });
                    final SubLObject var19 = module0723.f44275(var18);
                    final SubLObject var20 = f44332(var10, var19);
                    module0589.f35881(var2, var20);
                    module0723.f44256(var18, var2);
                    var13 = (SubLObject)module0724.T;
                }
                catch (Throwable var21) {
                    Errors.handleThrowable(var21, (SubLObject)module0724.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var15, var12);
            }
        }
        catch (Throwable var22) {
            var14 = Errors.handleThrowable(var22, (SubLObject)module0724.$ic14$);
        }
        finally {
            var12.throwStack.pop();
        }
        return var13;
    }
    
    public static SubLObject f44331(final SubLObject var10, SubLObject var38) {
        if (var38 == module0724.UNPROVIDED) {
            var38 = (SubLObject)module0724.ZERO_INTEGER;
        }
        final SubLObject var39 = module0038.f2684(var10, module0724.$g5714$.getGlobalValue());
        final SubLObject var40 = Sequences.search(module0724.$g5331$.getGlobalValue(), var10, Symbols.symbol_function((SubLObject)module0724.EQUAL), Symbols.symbol_function((SubLObject)module0724.IDENTITY), (SubLObject)module0724.ZERO_INTEGER, (SubLObject)module0724.NIL, var38, (SubLObject)module0724.NIL);
        if (module0724.NIL != var39) {
            SubLObject var41 = module0038.f2623(var10, Sequences.length(module0724.$g5714$.getGlobalValue()), (SubLObject)module0724.UNPROVIDED);
            final SubLObject var42 = Sequences.search((SubLObject)module0724.$ic22$, var41, (SubLObject)module0724.UNPROVIDED, (SubLObject)module0724.UNPROVIDED, (SubLObject)module0724.UNPROVIDED, (SubLObject)module0724.UNPROVIDED, (SubLObject)module0724.UNPROVIDED, (SubLObject)module0724.UNPROVIDED);
            final SubLObject var43 = Sequences.search((SubLObject)module0724.$ic20$, var41, (SubLObject)module0724.UNPROVIDED, (SubLObject)module0724.UNPROVIDED, (SubLObject)module0724.UNPROVIDED, (SubLObject)module0724.UNPROVIDED, (SubLObject)module0724.UNPROVIDED, (SubLObject)module0724.UNPROVIDED);
            final SubLObject var44 = Sequences.search((SubLObject)module0724.$ic23$, var41, (SubLObject)module0724.UNPROVIDED, (SubLObject)module0724.UNPROVIDED, (SubLObject)module0724.UNPROVIDED, (SubLObject)module0724.UNPROVIDED, (SubLObject)module0724.UNPROVIDED, (SubLObject)module0724.UNPROVIDED);
            final SubLObject var45 = module0035.f2378(Sequences.remove((SubLObject)module0724.NIL, (SubLObject)ConsesLow.list(var43, var44), (SubLObject)module0724.UNPROVIDED, (SubLObject)module0724.UNPROVIDED, (SubLObject)module0724.UNPROVIDED, (SubLObject)module0724.UNPROVIDED, (SubLObject)module0724.UNPROVIDED), (SubLObject)module0724.$ic24$, (SubLObject)module0724.UNPROVIDED);
            if (module0724.NIL != var42 && module0724.NIL != var45 && var42.numL(var45)) {
                var41 = module0038.f2670(var41, (SubLObject)module0724.$ic22$, (SubLObject)module0724.$ic20$, var38);
            }
            return var41;
        }
        if (module0724.NIL != module0004.f105(var40)) {
            return module0038.f2623(var10, Numbers.add(Sequences.length(module0724.$g5331$.getGlobalValue()), var40), (SubLObject)module0724.UNPROVIDED);
        }
        return module0038.f2623(var10, module0048.f_1X(Sequences.length(module0724.$g4467$.getGlobalValue())), (SubLObject)module0724.UNPROVIDED);
    }
    
    public static SubLObject f44333(final SubLObject var46, final SubLObject var36) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        final SubLObject var48 = module0589.f35872(var46);
        final SubLObject var49 = Sequences.search((SubLObject)module0724.$ic25$, var48, (SubLObject)module0724.UNPROVIDED, (SubLObject)module0724.UNPROVIDED, (SubLObject)module0724.UNPROVIDED, (SubLObject)module0724.UNPROVIDED, (SubLObject)module0724.UNPROVIDED, (SubLObject)module0724.UNPROVIDED);
        if (module0724.NIL != var49) {
            final SubLObject var50 = Numbers.add((SubLObject)module0724.SEVENTEEN_INTEGER, var49);
            final SubLObject var51 = Sequences.search((SubLObject)module0724.$ic26$, var48, (SubLObject)module0724.EQUAL, (SubLObject)module0724.IDENTITY, (SubLObject)module0724.ZERO_INTEGER, (SubLObject)module0724.NIL, var50, (SubLObject)module0724.UNPROVIDED);
            final SubLObject var52 = module0038.f2623(var48, var50, var51);
            return var52;
        }
        if (module0724.NIL != f44334(var36)) {
            return f44334(var36);
        }
        if (module0724.NIL != module0110.$g536$.getDynamicValue(var47)) {
            return (SubLObject)module0724.$ic27$;
        }
        return (SubLObject)module0724.$ic28$;
    }
    
    public static SubLObject f44332(final SubLObject var10, SubLObject var36) {
        if (var36 == module0724.UNPROVIDED) {
            var36 = (SubLObject)module0724.NIL;
        }
        final SubLObject var37 = f44333(var10, var36);
        return (SubLObject)ConsesLow.list((SubLObject)module0724.$ic29$, reader.bq_cons((SubLObject)module0724.$ic30$, var37));
    }
    
    public static SubLObject f44334(final SubLObject var52) {
        return module0067.f4884(module0015.$g544$.getGlobalValue(), var52, (SubLObject)module0724.UNPROVIDED);
    }
    
    public static SubLObject f44328(final SubLObject var2, final SubLObject var11, final SubLObject var10, SubLObject var12, final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        var12 = (SubLObject)(var12.equalp((SubLObject)module0724.$ic31$) ? module0724.$ic32$ : module0724.$ic33$);
        final SubLObject var15 = module0038.f2623(var10, (SubLObject)module0724.SEVEN_INTEGER, (SubLObject)module0724.UNPROVIDED);
        final SubLObject var16 = f44335(var13);
        SubLObject var17 = (SubLObject)module0724.ZERO_INTEGER;
        var14.resetMultipleValues();
        final SubLObject var18 = f44336(var15);
        final SubLObject var19 = var14.secondMultipleValue();
        var14.resetMultipleValues();
        final SubLObject var21;
        final SubLObject var20 = var21 = var16;
        final SubLObject var22 = cdestructuring_bind.property_list_member((SubLObject)module0724.$ic34$, var21);
        final SubLObject var23 = (SubLObject)((module0724.NIL != var22) ? conses_high.cadr(var22) : module0724.T);
        final SubLObject var24 = cdestructuring_bind.property_list_member((SubLObject)module0724.$ic35$, var21);
        final SubLObject var25 = (SubLObject)((module0724.NIL != var24) ? conses_high.cadr(var24) : module0724.NIL);
        final SubLObject var26 = cdestructuring_bind.property_list_member((SubLObject)module0724.$ic36$, var21);
        final SubLObject var27 = (SubLObject)((module0724.NIL != var26) ? conses_high.cadr(var26) : module0724.$ic37$);
        final SubLObject var28 = cdestructuring_bind.property_list_member((SubLObject)module0724.$ic38$, var21);
        final SubLObject var29 = (SubLObject)((module0724.NIL != var28) ? conses_high.cadr(var28) : module0724.$ic37$);
        final SubLObject var30 = (SubLObject)(module0724.$g5717$.getGlobalValue().eql((SubLObject)module0724.$ic37$) ? module0724.$ic39$ : module0724.$g5717$.getGlobalValue());
        SubLObject var31 = (SubLObject)module0724.NIL;
        try {
            var31 = module0004.f82(module0724.$g5716$.getGlobalValue(), var30, (SubLObject)module0724.NIL, (SubLObject)module0724.$ic40$);
            if (module0724.NIL != module0003.f70(var31, module0724.$g5716$.getGlobalValue(), var30)) {
                module0589.f35885(var31, (SubLObject)ConsesLow.list(new SubLObject[] { module0724.$ic41$, module0724.$g5716$.getGlobalValue(), module0724.$ic42$, module0724.$g5717$.getGlobalValue(), module0724.$ic43$, var12, module0724.$ic44$, var18, module0724.$ic45$, var19, module0724.$ic34$, module0724.NIL, module0724.$ic35$, var25, module0724.$ic36$, var27, module0724.$ic38$, var29, module0724.$ic46$, module0724.NIL }));
                for (SubLObject var32 = streams_high.read_char(var31, (SubLObject)module0724.NIL, (SubLObject)module0724.NIL, (SubLObject)module0724.UNPROVIDED); module0724.NIL != var32; var32 = streams_high.read_char(var31, (SubLObject)module0724.NIL, (SubLObject)module0724.NIL, (SubLObject)module0724.UNPROVIDED)) {
                    streams_high.write_char(var32, var2);
                    var17 = Numbers.add(var17, (SubLObject)module0724.ONE_INTEGER);
                }
            }
        }
        finally {
            final SubLObject var33 = Threads.$is_thread_performing_cleanupP$.currentBinding(var14);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0724.T, var14);
                if (module0724.NIL != var31) {
                    streams_high.close(var31, (SubLObject)module0724.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var33, var14);
            }
        }
        SubLObject var34 = (SubLObject)module0724.NIL;
        try {
            var14.throwStack.push(module0724.$ic14$);
            final SubLObject var35 = Errors.$error_handler$.currentBinding(var14);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0724.$ic15$), var14);
                try {
                    streams_high.force_output(var2);
                }
                catch (Throwable var36) {
                    Errors.handleThrowable(var36, (SubLObject)module0724.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var35, var14);
            }
        }
        catch (Throwable var37) {
            var34 = Errors.handleThrowable(var37, (SubLObject)module0724.$ic14$);
        }
        finally {
            var14.throwStack.pop();
        }
        return var17;
    }
    
    public static SubLObject f44336(final SubLObject var71) {
        assert module0724.NIL != Types.stringp(var71) : var71;
        final SubLObject var72 = Sequences.position((SubLObject)Characters.CHAR_question, var71, (SubLObject)module0724.UNPROVIDED, (SubLObject)module0724.UNPROVIDED, (SubLObject)module0724.UNPROVIDED, (SubLObject)module0724.UNPROVIDED);
        SubLObject var73 = var71;
        SubLObject var74 = (SubLObject)module0724.NIL;
        if (module0724.NIL != var72) {
            var73 = module0038.f2623(var71, (SubLObject)module0724.ZERO_INTEGER, var72);
            var74 = module0038.f2623(var71, module0048.f_1X(var72), (SubLObject)module0724.UNPROVIDED);
        }
        return Values.values(var73, var74);
    }
    
    public static SubLObject f44335(final SubLObject var13) {
        SubLObject var14 = (SubLObject)module0724.NIL;
        SubLObject var15 = var13;
        SubLObject var16 = (SubLObject)module0724.NIL;
        var16 = var15.first();
        while (module0724.NIL != var15) {
            SubLObject var18;
            final SubLObject var17 = var18 = var16;
            SubLObject var19 = (SubLObject)module0724.NIL;
            SubLObject var20 = (SubLObject)module0724.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var18, var17, (SubLObject)module0724.$ic48$);
            var19 = var18.first();
            var18 = (var20 = var18.rest());
            if (var19.equalp((SubLObject)module0724.$ic30$)) {
                var14 = conses_high.putf(var14, (SubLObject)module0724.$ic38$, var20);
            }
            else if (var19.equalp((SubLObject)module0724.$ic49$)) {
                var14 = conses_high.putf(var14, (SubLObject)module0724.$ic36$, (SubLObject)ConsesLow.list(var20));
            }
            else if (module0724.NIL != module0035.f2172(var19, (SubLObject)module0724.$ic50$)) {}
            var15 = var15.rest();
            var16 = var15.first();
        }
        return var14;
    }
    
    public static SubLObject f44327(final SubLObject var2, final SubLObject var11, final SubLObject var10) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        final SubLObject var13 = f44337(var10);
        SubLObject var14 = (SubLObject)module0724.NIL;
        var12.resetMultipleValues();
        final SubLObject var15 = f44338(var13);
        final SubLObject var16 = var12.secondMultipleValue();
        final SubLObject var17 = var12.thirdMultipleValue();
        var12.resetMultipleValues();
        SubLObject var18 = (SubLObject)module0724.NIL;
        try {
            var12.throwStack.push(module0724.$ic14$);
            final SubLObject var19 = Errors.$error_handler$.currentBinding(var12);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0724.$ic15$), var12);
                try {
                    if (module0724.NIL != Filesys.probe_file(var15) && module0724.NIL == Filesys.directory_p(var15)) {
                        final SubLObject var20 = f44339(var15);
                        final SubLObject var21 = f44340(var15);
                        module0589.f35881(var2, var20);
                        SubLObject var22 = (SubLObject)module0724.NIL;
                        try {
                            final SubLObject var4_87 = stream_macros.$stream_requires_locking$.currentBinding(var12);
                            try {
                                stream_macros.$stream_requires_locking$.bind((SubLObject)module0724.NIL, var12);
                                var22 = compatibility.open_binary(var15, (SubLObject)module0724.$ic51$);
                            }
                            finally {
                                stream_macros.$stream_requires_locking$.rebind(var4_87, var12);
                            }
                            if (!var22.isStream()) {
                                Errors.error((SubLObject)module0724.$ic52$, var15);
                            }
                            SubLObject var23;
                            SubLObject var24;
                            for (var23 = var22, var24 = (SubLObject)module0724.NIL, var24 = streams_high.read_byte(var23, (SubLObject)module0724.NIL, (SubLObject)module0724.$ic53$); module0724.$ic53$ != var24; var24 = streams_high.read_byte(var23, (SubLObject)module0724.NIL, (SubLObject)module0724.$ic53$)) {
                                if (module0724.NIL != var21 && var24.eql((SubLObject)module0724.$ic54$)) {
                                    var24 = streams_high.read_byte(var23, (SubLObject)module0724.NIL, (SubLObject)module0724.$ic53$);
                                    if (var24.eql((SubLObject)module0724.$ic55$)) {
                                        print_high.princ(Environment.get_machine_name((SubLObject)module0724.$ic19$), var2);
                                        streams_high.write_char(Characters.code_char((SubLObject)module0724.$ic55$), var2);
                                    }
                                    else if (var24.eql((SubLObject)module0724.$ic56$)) {
                                        print_high.princ(Environment.get_machine_name((SubLObject)module0724.$ic19$), var2);
                                    }
                                    else if (var24.eql((SubLObject)module0724.$ic57$)) {
                                        print_high.princ(module0110.$g1378$.getDynamicValue(var12), var2);
                                    }
                                    else if (var24.eql((SubLObject)module0724.$ic58$)) {
                                        print_high.princ(var16, var2);
                                    }
                                    else if (var24.eql((SubLObject)module0724.$ic59$)) {
                                        print_high.princ(var17, var2);
                                    }
                                    else {
                                        streams_high.write_char(Characters.code_char((SubLObject)module0724.$ic54$), var2);
                                        streams_high.write_char(Characters.code_char(var24), var2);
                                    }
                                }
                                else {
                                    streams_high.write_char(Characters.code_char(var24), var2);
                                }
                            }
                        }
                        finally {
                            final SubLObject var4_88 = Threads.$is_thread_performing_cleanupP$.currentBinding(var12);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0724.T, var12);
                                if (var22.isStream()) {
                                    streams_high.close(var22, (SubLObject)module0724.UNPROVIDED);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var4_88, var12);
                            }
                        }
                        var14 = (SubLObject)module0724.T;
                    }
                    else {
                        final SubLObject var20 = f44332((SubLObject)module0724.$ic60$, (SubLObject)module0724.UNPROVIDED);
                        module0589.f35884(var2, (SubLObject)module0724.$ic61$, var20);
                        final SubLObject var4_89 = module0015.$g131$.currentBinding(var12);
                        try {
                            module0015.$g131$.bind(var2, var12);
                            module0656.f39789((SubLObject)module0724.$ic62$, (SubLObject)module0724.UNPROVIDED, (SubLObject)module0724.UNPROVIDED, (SubLObject)module0724.UNPROVIDED, (SubLObject)module0724.UNPROVIDED, (SubLObject)module0724.UNPROVIDED);
                        }
                        finally {
                            module0015.$g131$.rebind(var4_89, var12);
                        }
                    }
                }
                catch (Throwable var25) {
                    Errors.handleThrowable(var25, (SubLObject)module0724.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var19, var12);
            }
        }
        catch (Throwable var26) {
            var18 = Errors.handleThrowable(var26, (SubLObject)module0724.$ic14$);
        }
        finally {
            var12.throwStack.pop();
        }
        return var14;
    }
    
    public static SubLObject f44338(final SubLObject var81) {
        final SubLObject var82 = module0038.f2702((SubLObject)Characters.CHAR_question, var81, (SubLObject)module0724.UNPROVIDED);
        if (module0724.NIL == var82) {
            return Values.values(var81, (SubLObject)module0724.NIL, (SubLObject)module0724.NIL);
        }
        if (module0724.$ic60$.equalp(Sequences.subseq(var81, Numbers.add(var82, (SubLObject)module0724.ONE_INTEGER), (SubLObject)module0724.UNPROVIDED))) {
            return Values.values(Sequences.subseq(var81, (SubLObject)module0724.ZERO_INTEGER, var82), (SubLObject)module0724.NIL, (SubLObject)module0724.NIL);
        }
        final SubLObject var83 = Sequences.subseq(var81, (SubLObject)module0724.ZERO_INTEGER, var82);
        final SubLObject var84 = Sequences.subseq(var81, Numbers.add(var82, (SubLObject)module0724.ONE_INTEGER), (SubLObject)module0724.UNPROVIDED);
        final SubLObject var85 = module0723.f44276(var84, (SubLObject)module0724.ZERO_INTEGER);
        final SubLObject var86 = module0642.f39104((SubLObject)module0724.$ic63$, var85);
        final SubLObject var87 = module0642.f39104((SubLObject)module0724.$ic64$, var85);
        final SubLObject var88 = module0285.f18875(reader.read_from_string(module0589.f35872(var86), (SubLObject)module0724.UNPROVIDED, (SubLObject)module0724.UNPROVIDED, (SubLObject)module0724.UNPROVIDED, (SubLObject)module0724.UNPROVIDED, (SubLObject)module0724.UNPROVIDED), (SubLObject)module0724.UNPROVIDED);
        final SubLObject var89 = (SubLObject)((module0724.NIL != var87) ? module0285.f18875(reader.read_from_string(module0589.f35872(var87), (SubLObject)module0724.UNPROVIDED, (SubLObject)module0724.UNPROVIDED, (SubLObject)module0724.UNPROVIDED, (SubLObject)module0724.UNPROVIDED, (SubLObject)module0724.UNPROVIDED), (SubLObject)module0724.UNPROVIDED) : module0724.NIL);
        return Values.values(var83, var88, var89);
    }
    
    public static SubLObject f44340(final SubLObject var81) {
        return module0038.f2673(var81, (SubLObject)module0724.$ic65$, (SubLObject)module0724.UNPROVIDED);
    }
    
    public static SubLObject f44337(final SubLObject var10) {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        return module0075.f5176(module0110.$g120$.getDynamicValue(var11), var10, (SubLObject)module0724.UNPROVIDED);
    }
    
    public static SubLObject f44339(final SubLObject var81) {
        return f44341(var81, Filesys.file_write_date(var81));
    }
    
    public static SubLObject f44342() {
        final SubLObject var96 = module0724.$g5719$.getGlobalValue();
        if (module0724.NIL != var96) {
            module0034.f1818(var96);
        }
        return (SubLObject)module0724.NIL;
    }
    
    public static SubLObject f44343(final SubLObject var81, final SubLObject var97) {
        return module0034.f1829(module0724.$g5719$.getGlobalValue(), (SubLObject)ConsesLow.list(var81, var97), (SubLObject)module0724.UNPROVIDED, (SubLObject)module0724.UNPROVIDED);
    }
    
    public static SubLObject f44344(final SubLObject var81, final SubLObject var97) {
        final SubLObject var98 = module0589.f35948(var97);
        SubLObject var99 = module0075.f5249(var81);
        final SubLObject var100 = f44345(var81);
        final SubLObject var101 = (SubLObject)((module0724.NIL != var97) ? module0724.NIL : f44346(var100));
        if (module0724.NIL != f44340(var81)) {
            var99 = Numbers.add(var99, module0048.f_1_(Sequences.length(Environment.get_machine_name((SubLObject)module0724.$ic19$))));
        }
        return (SubLObject)ConsesLow.listS(reader.bq_cons((SubLObject)module0724.$ic67$, var98), (SubLObject)module0724.$ic68$, reader.bq_cons((SubLObject)module0724.$ic69$, var99), reader.bq_cons((SubLObject)module0724.$ic30$, var100), ConsesLow.append((SubLObject)((module0724.NIL != var101) ? ConsesLow.list(reader.bq_cons((SubLObject)module0724.$ic70$, var101)) : module0724.NIL), (SubLObject)module0724.NIL));
    }
    
    public static SubLObject f44341(final SubLObject var81, final SubLObject var97) {
        SubLObject var98 = module0724.$g5719$.getGlobalValue();
        if (module0724.NIL == var98) {
            var98 = module0034.f1934((SubLObject)module0724.$ic66$, (SubLObject)module0724.$ic71$, (SubLObject)module0724.$ic72$, (SubLObject)module0724.EQUAL, (SubLObject)module0724.TWO_INTEGER, (SubLObject)module0724.ZERO_INTEGER);
        }
        final SubLObject var99 = module0034.f1782(var81, var97);
        final SubLObject var100 = module0034.f1814(var98, var99, (SubLObject)module0724.UNPROVIDED);
        if (var100 != module0724.$ic73$) {
            SubLObject var101 = var100;
            SubLObject var102 = (SubLObject)module0724.NIL;
            var102 = var101.first();
            while (module0724.NIL != var101) {
                SubLObject var103 = var102.first();
                final SubLObject var104 = conses_high.second(var102);
                if (var81.equal(var103.first())) {
                    var103 = var103.rest();
                    if (module0724.NIL != var103 && module0724.NIL == var103.rest() && var97.equal(var103.first())) {
                        return module0034.f1959(var104);
                    }
                }
                var101 = var101.rest();
                var102 = var101.first();
            }
        }
        final SubLObject var105 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f44344(var81, var97)));
        module0034.f1836(var98, var99, var100, var105, (SubLObject)ConsesLow.list(var81, var97));
        return module0034.f1959(var105);
    }
    
    public static SubLObject f44346(final SubLObject var66) {
        final SubLThread var67 = SubLProcess.currentSubLThread();
        if (module0724.NIL != module0038.f2684(var66, (SubLObject)module0724.$ic74$)) {
            return module0589.f35948(module0051.f3612(module0051.f3604((SubLObject)module0724.ONE_INTEGER, (SubLObject)module0724.ONE_INTEGER, Numbers.add((SubLObject)module0724.TWO_INTEGER, module0051.f3610())), (SubLObject)module0724.UNPROVIDED));
        }
        if (module0724.NIL != module0724.$g5720$.getDynamicValue(var67) && module0724.NIL != module0038.f2684(var66, (SubLObject)module0724.$ic75$) && (module0724.NIL != module0038.f2673(var66, (SubLObject)module0724.$ic76$, (SubLObject)module0724.UNPROVIDED) || module0724.NIL != module0038.f2673(var66, (SubLObject)module0724.$ic77$, (SubLObject)module0724.UNPROVIDED))) {
            return module0589.f35948(module0051.f3612(module0051.f3609(module0051.f3605(), (SubLObject)module0724.THREE_INTEGER), (SubLObject)module0724.UNPROVIDED));
        }
        return (SubLObject)module0724.NIL;
    }
    
    public static SubLObject f44345(final SubLObject var81) {
        SubLObject var82 = module0724.$g5721$.getGlobalValue();
        SubLObject var83 = (SubLObject)module0724.NIL;
        var83 = var82.first();
        while (module0724.NIL != var82) {
            SubLObject var85;
            final SubLObject var84 = var85 = var83;
            SubLObject var86 = (SubLObject)module0724.NIL;
            SubLObject var87 = (SubLObject)module0724.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)module0724.$ic79$);
            var86 = var85.first();
            var85 = var85.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)module0724.$ic79$);
            var87 = var85.first();
            var85 = var85.rest();
            if (module0724.NIL == var85) {
                SubLObject var74_111 = var87;
                SubLObject var88 = (SubLObject)module0724.NIL;
                var88 = var74_111.first();
                while (module0724.NIL != var74_111) {
                    if (module0724.NIL != module0038.f2673(var81, var88, Symbols.symbol_function((SubLObject)module0724.EQUALP))) {
                        return var86;
                    }
                    var74_111 = var74_111.rest();
                    var88 = var74_111.first();
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var84, (SubLObject)module0724.$ic79$);
            }
            var82 = var82.rest();
            var83 = var82.first();
        }
        return module0724.$g5721$.getGlobalValue().first().first();
    }
    
    public static SubLObject f44347(final SubLObject var81, SubLObject var113) {
        if (var113 == module0724.UNPROVIDED) {
            var113 = (SubLObject)module0724.NIL;
        }
        final SubLObject var114 = var113;
        if (var114.eql((SubLObject)module0724.$ic80$)) {
            return (SubLObject)module0724.$ic81$;
        }
        if (var114.eql((SubLObject)module0724.$ic82$)) {
            return (SubLObject)module0724.$ic83$;
        }
        if (var114.eql((SubLObject)module0724.$ic84$)) {
            return (SubLObject)module0724.$ic85$;
        }
        if (var114.eql((SubLObject)module0724.$ic86$) || var114.eql((SubLObject)module0724.NIL)) {
            return f44345(var81);
        }
        return f44347(var81, (SubLObject)module0724.NIL);
    }
    
    public static SubLObject f44348(SubLObject var114) {
        if (var114 == module0724.UNPROVIDED) {
            var114 = (SubLObject)module0724.NIL;
        }
        final SubLThread var115 = SubLProcess.currentSubLThread();
        SubLObject var116 = (SubLObject)module0724.NIL;
        if (module0724.NIL == var116) {
            SubLObject var117 = module0061.f4460();
            SubLObject var118 = (SubLObject)module0724.NIL;
            var118 = var117.first();
            while (module0724.NIL == var116 && module0724.NIL != var117) {
                if (module0724.$ic6$ == module0061.f4461(var118)) {
                    var116 = module0061.f4466(var118);
                }
                var117 = var117.rest();
                var118 = var117.first();
            }
        }
        if (module0724.NIL == var116 && module0724.NIL != var114) {
            var116 = f44329();
            final SubLObject var119 = module0061.f4452((SubLObject)module0724.$ic6$, var116);
            if (module0724.NIL == Threads.valid_process_p(module0061.f4464(var119))) {
                var116 = (SubLObject)module0724.NIL;
            }
        }
        final SubLObject var120 = module0689.f42250();
        final SubLObject var121 = Numbers.add(module0689.f42251(), module0110.$g1381$.getDynamicValue(var115));
        return Sequences.cconcatenate((SubLObject)module0724.$ic88$, new SubLObject[] { module0006.f203(var120), module0006.f203((SubLObject)((module0724.NIL != var116) ? Sequences.cconcatenate((SubLObject)module0724.$ic89$, module0006.f203(var121)) : module0724.$ic60$)), module0724.$ic90$ });
    }
    
    public static SubLObject f44349() {
        final SubLObject var120 = f44348((SubLObject)module0724.UNPROVIDED);
        if (module0724.NIL != var120) {
            return Sequences.cconcatenate(module0006.f203(var120), new SubLObject[] { module0006.f203(module0038.f2623(module0724.$g4467$.getGlobalValue(), (SubLObject)module0724.ONE_INTEGER, (SubLObject)module0724.UNPROVIDED)), module0724.$ic90$ });
        }
        return (SubLObject)module0724.NIL;
    }
    
    public static SubLObject f44350(final SubLObject var21, SubLObject var114) {
        if (var114 == module0724.UNPROVIDED) {
            var114 = (SubLObject)module0724.NIL;
        }
        final SubLObject var115 = f44348(var114);
        return module0589.f35913(var21, var115);
    }
    
    public static SubLObject f44351() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0724", "f44323", "S#48495", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0724", "f44324", "HTTP-SERVER-TOP-LEVEL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0724", "f44329", "HTTP-PORT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0724", "f44325", "S#48496", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0724", "f44330", "S#48497", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0724", "f44326", "S#48498", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0724", "f44331", "S#48499", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0724", "f44333", "S#48500", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0724", "f44332", "S#48501", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0724", "f44334", "S#48502", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0724", "f44328", "S#48503", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0724", "f44336", "S#48504", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0724", "f44335", "S#48505", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0724", "f44327", "S#48506", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0724", "f44338", "S#48507", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0724", "f44340", "S#48508", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0724", "f44337", "S#48509", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0724", "f44339", "S#48510", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0724", "f44342", "S#48511", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0724", "f44343", "S#48512", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0724", "f44344", "S#48513", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0724", "f44341", "S#48514", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0724", "f44346", "S#48515", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0724", "f44345", "S#48516", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0724", "f44347", "S#914", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0724", "f44348", "HTTP-SERVER-BASE-URL", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0724", "f44349", "HTTP-SERVER-CGI-BASE-URL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0724", "f44350", "S#48517", 1, 1, false);
        return (SubLObject)module0724.NIL;
    }
    
    public static SubLObject f44352() {
        module0724.$g4467$ = SubLFiles.deflexical("S#48518", (SubLObject)module0724.$ic0$);
        module0724.$g5331$ = SubLFiles.deflexical("S#48519", (SubLObject)module0724.$ic1$);
        module0724.$g5714$ = SubLFiles.deflexical("S#48520", (SubLObject)module0724.$ic2$);
        module0724.$g5715$ = SubLFiles.deflexical("S#48521", (SubLObject)module0724.$ic3$);
        module0724.$g5716$ = SubLFiles.deflexical("S#48522", (SubLObject)((module0724.NIL != Symbols.boundp((SubLObject)module0724.$ic4$)) ? module0724.$g5716$.getGlobalValue() : module0724.NIL));
        module0724.$g5717$ = SubLFiles.deflexical("S#48523", (SubLObject)((module0724.NIL != Symbols.boundp((SubLObject)module0724.$ic5$)) ? module0724.$g5717$.getGlobalValue() : module0724.NIL));
        module0724.$g5718$ = SubLFiles.defconstant("S#48524", (SubLObject)module0724.$ic21$);
        module0724.$g5719$ = SubLFiles.deflexical("S#48525", (SubLObject)module0724.NIL);
        module0724.$g5720$ = SubLFiles.defvar("S#48526", (SubLObject)module0724.T);
        module0724.$g5721$ = SubLFiles.deflexical("S#48527", (SubLObject)module0724.$ic78$);
        return (SubLObject)module0724.NIL;
    }
    
    public static SubLObject f44353() {
        module0003.f57((SubLObject)module0724.$ic4$);
        module0003.f57((SubLObject)module0724.$ic5$);
        module0061.f4481((SubLObject)module0724.$ic6$, (SubLObject)module0724.$ic7$, (SubLObject)module0724.$ic8$);
        module0034.f1909((SubLObject)module0724.$ic66$);
        module0002.f38((SubLObject)module0724.$ic87$);
        module0002.f38((SubLObject)module0724.$ic91$);
        return (SubLObject)module0724.NIL;
    }
    
    public void declareFunctions() {
        f44351();
    }
    
    public void initializeVariables() {
        f44352();
    }
    
    public void runTopLevelForms() {
        f44353();
    }
    
    static {
        me = (SubLFile)new module0724();
        module0724.$g4467$ = null;
        module0724.$g5331$ = null;
        module0724.$g5714$ = null;
        module0724.$g5715$ = null;
        module0724.$g5716$ = null;
        module0724.$g5717$ = null;
        module0724.$g5718$ = null;
        module0724.$g5719$ = null;
        module0724.$g5720$ = null;
        module0724.$g5721$ = null;
        $ic0$ = SubLObjectFactory.makeString("/cgi-bin");
        $ic1$ = SubLObjectFactory.makeString("/cg?");
        $ic2$ = SubLObjectFactory.makeString("/cgi-bin/ws/");
        $ic3$ = SubLObjectFactory.makeString("/cyc-ws");
        $ic4$ = SubLObjectFactory.makeSymbol("S#48522", "CYC");
        $ic5$ = SubLObjectFactory.makeSymbol("S#48523", "CYC");
        $ic6$ = SubLObjectFactory.makeKeyword("HTTP");
        $ic7$ = SubLObjectFactory.makeSymbol("S#48495", "CYC");
        $ic8$ = SubLObjectFactory.makeKeyword("TEXT");
        $ic9$ = SubLObjectFactory.makeString("CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("DOUBLE-FLOAT");
        $ic11$ = SubLObjectFactory.makeKeyword("CGI");
        $ic12$ = SubLObjectFactory.makeKeyword("FILE");
        $ic13$ = SubLObjectFactory.makeKeyword("WS");
        $ic14$ = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $ic15$ = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic16$ = SubLObjectFactory.makeString("GET");
        $ic17$ = SubLObjectFactory.makeString("Content-length");
        $ic18$ = SubLObjectFactory.makeString("Remote-Host");
        $ic19$ = SubLObjectFactory.makeString("unknown");
        $ic20$ = SubLObjectFactory.makeString("&");
        $ic21$ = SubLObjectFactory.makeString("return-mime-type:");
        $ic22$ = SubLObjectFactory.makeString("?");
        $ic23$ = SubLObjectFactory.makeString("|");
        $ic24$ = SubLObjectFactory.makeSymbol("<");
        $ic25$ = SubLObjectFactory.makeString("return-mime-type");
        $ic26$ = SubLObjectFactory.makeString("=");
        $ic27$ = SubLObjectFactory.makeString("text/html; charset=utf-8");
        $ic28$ = SubLObjectFactory.makeString("text/html");
        $ic29$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Connection"), (SubLObject)SubLObjectFactory.makeString("close"));
        $ic30$ = SubLObjectFactory.makeString("Content-Type");
        $ic31$ = SubLObjectFactory.makeString("POST");
        $ic32$ = SubLObjectFactory.makeKeyword("POST");
        $ic33$ = SubLObjectFactory.makeKeyword("GET");
        $ic34$ = SubLObjectFactory.makeKeyword("KEEP-ALIVE?");
        $ic35$ = SubLObjectFactory.makeKeyword("WIDE-NEWLINES?");
        $ic36$ = SubLObjectFactory.makeKeyword("ACCEPT-TYPES");
        $ic37$ = SubLObjectFactory.makeKeyword("DEFAULT");
        $ic38$ = SubLObjectFactory.makeKeyword("CONTENT-TYPE");
        $ic39$ = SubLObjectFactory.makeInteger(80);
        $ic40$ = SubLObjectFactory.makeKeyword("PRIVATE");
        $ic41$ = SubLObjectFactory.makeKeyword("MACHINE");
        $ic42$ = SubLObjectFactory.makeKeyword("PORT");
        $ic43$ = SubLObjectFactory.makeKeyword("METHOD");
        $ic44$ = SubLObjectFactory.makeKeyword("URL");
        $ic45$ = SubLObjectFactory.makeKeyword("QUERY");
        $ic46$ = SubLObjectFactory.makeKeyword("SOAP-ACTION-URI");
        $ic47$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic48$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#48528", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"));
        $ic49$ = SubLObjectFactory.makeString("Accept");
        $ic50$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("User-Agent"), SubLObjectFactory.makeString("Host"), SubLObjectFactory.makeString("Content-Length"), SubLObjectFactory.makeString("Connection"), SubLObjectFactory.makeString("Keep-Alive"), SubLObjectFactory.makeString("Referer"), SubLObjectFactory.makeString("Accept-Charset"), SubLObjectFactory.makeString("Accept-Encoding"), SubLObjectFactory.makeString("Accept-Language"), SubLObjectFactory.makeString("Cache-Control"), SubLObjectFactory.makeString("Pragma") });
        $ic51$ = SubLObjectFactory.makeKeyword("INPUT");
        $ic52$ = SubLObjectFactory.makeString("Unable to open ~S");
        $ic53$ = SubLObjectFactory.makeKeyword("EOF");
        $ic54$ = SubLObjectFactory.makeInteger(35);
        $ic55$ = SubLObjectFactory.makeInteger(47);
        $ic56$ = SubLObjectFactory.makeInteger(49);
        $ic57$ = SubLObjectFactory.makeInteger(50);
        $ic58$ = SubLObjectFactory.makeInteger(51);
        $ic59$ = SubLObjectFactory.makeInteger(52);
        $ic60$ = SubLObjectFactory.makeString("");
        $ic61$ = SubLObjectFactory.makeInteger(404);
        $ic62$ = SubLObjectFactory.makeString("File not found");
        $ic63$ = SubLObjectFactory.makeString("user");
        $ic64$ = SubLObjectFactory.makeString("project");
        $ic65$ = SubLObjectFactory.makeString(".jnlp");
        $ic66$ = SubLObjectFactory.makeSymbol("S#48514", "CYC");
        $ic67$ = SubLObjectFactory.makeString("Last-Modified");
        $ic68$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Accept-Ranges"), (SubLObject)SubLObjectFactory.makeString("bytes"));
        $ic69$ = SubLObjectFactory.makeString("Content-Length");
        $ic70$ = SubLObjectFactory.makeString("Expires");
        $ic71$ = SubLObjectFactory.makeSymbol("S#48525", "CYC");
        $ic72$ = SubLObjectFactory.makeInteger(200);
        $ic73$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic74$ = SubLObjectFactory.makeString("image/");
        $ic75$ = SubLObjectFactory.makeString("text/");
        $ic76$ = SubLObjectFactory.makeString("css");
        $ic77$ = SubLObjectFactory.makeString("javascript");
        $ic78$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("text/html"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("html"), (SubLObject)SubLObjectFactory.makeString("htm"), (SubLObject)SubLObjectFactory.makeString("shtml"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("text/plain"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("txt"), (SubLObject)SubLObjectFactory.makeString("text"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("image/gif"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("gif"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("image/jpeg"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("jpeg"), (SubLObject)SubLObjectFactory.makeString("jpg"), (SubLObject)SubLObjectFactory.makeString("jpe"), (SubLObject)SubLObjectFactory.makeString("jfif"), (SubLObject)SubLObjectFactory.makeString("pjpeg"), (SubLObject)SubLObjectFactory.makeString("pjp"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("image/png"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("png"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("application/x-java-jnlp-file"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("jnlp"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("text/css"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("css"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("text/javascript"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("js"))));
        $ic79$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#4660", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#48529", "CYC"));
        $ic80$ = SubLObjectFactory.makeKeyword("PNG");
        $ic81$ = SubLObjectFactory.makeString("image/png");
        $ic82$ = SubLObjectFactory.makeKeyword("JPEG");
        $ic83$ = SubLObjectFactory.makeString("image/jpeg");
        $ic84$ = SubLObjectFactory.makeKeyword("GIF");
        $ic85$ = SubLObjectFactory.makeString("image/gif");
        $ic86$ = SubLObjectFactory.makeSymbol("QUOTE");
        $ic87$ = SubLObjectFactory.makeSymbol("HTTP-SERVER-BASE-URL");
        $ic88$ = SubLObjectFactory.makeString("http://");
        $ic89$ = SubLObjectFactory.makeString(":");
        $ic90$ = SubLObjectFactory.makeString("/");
        $ic91$ = SubLObjectFactory.makeSymbol("HTTP-SERVER-CGI-BASE-URL");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0724.class
	Total time: 362 ms
	
	Decompiled with Procyon 0.5.32.
*/