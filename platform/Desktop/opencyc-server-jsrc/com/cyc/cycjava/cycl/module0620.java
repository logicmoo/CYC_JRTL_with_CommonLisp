package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0620 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0620";
    public static final String myFingerPrint = "c7e99ddb7744656f20457b5cd959197428ed2944e77824c79b8f84949e7fa08c";
    public static SubLSymbol $g4767$;
    public static SubLSymbol $g4768$;
    private static SubLSymbol $g4769$;
    private static final SubLSymbol $ic0$;
    private static final SubLString $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLString $ic3$;
    private static final SubLString $ic4$;
    private static final SubLList $ic5$;
    private static final SubLString $ic6$;
    private static final SubLList $ic7$;
    private static final SubLString $ic8$;
    private static final SubLString $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLString $ic11$;
    private static final SubLString $ic12$;
    private static final SubLString $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLString $ic16$;
    private static final SubLString $ic17$;
    private static final SubLList $ic18$;
    private static final SubLString $ic19$;
    private static final SubLString $ic20$;
    private static final SubLList $ic21$;
    private static final SubLList $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    private static final SubLString $ic28$;
    private static final SubLString $ic29$;
    private static final SubLString $ic30$;
    private static final SubLString $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLList $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLList $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLString $ic41$;
    private static final SubLList $ic42$;
    private static final SubLList $ic43$;
    private static final SubLString $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLString $ic46$;
    private static final SubLString $ic47$;
    private static final SubLString $ic48$;
    private static final SubLString $ic49$;
    private static final SubLString $ic50$;
    private static final SubLList $ic51$;
    private static final SubLString $ic52$;
    private static final SubLString $ic53$;
    private static final SubLString $ic54$;
    private static final SubLString $ic55$;
    
    public static SubLObject f38251(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0620.NIL;
        try {
            final SubLObject var4 = stream_macros.$stream_requires_locking$.currentBinding(var2);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0620.NIL, var2);
                var3 = compatibility.open_text(var1, (SubLObject)module0620.$ic0$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var4, var2);
            }
            if (!var3.isStream()) {
                Errors.error((SubLObject)module0620.$ic1$, var1);
            }
            final SubLObject var5 = var3;
            final SubLObject var6 = module0587.$g4457$.currentBinding(var2);
            try {
                module0587.$g4457$.bind(var5, var2);
                f38252((SubLObject)module0620.$ic2$);
                try {
                    final SubLObject var4_6 = module0601.$g4652$.currentBinding(var2);
                    final SubLObject var7 = module0601.$g4654$.currentBinding(var2);
                    try {
                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                        module0601.f36758((SubLObject)module0620.$ic3$, (SubLObject)ConsesLow.list((SubLObject)module0620.$ic4$, module0620.$g4767$.getGlobalValue()), (SubLObject)module0620.NIL, (SubLObject)module0620.NIL);
                        final SubLObject var8 = (SubLObject)module0620.$ic5$;
                        SubLObject var9 = module0110.f7670();
                        SubLObject var10 = (SubLObject)module0620.NIL;
                        var10 = var9.first();
                        while (module0620.NIL != var9) {
                            f38253(var10, var8);
                            var9 = var9.rest();
                            var10 = var9.first();
                        }
                    }
                    finally {
                        module0601.$g4654$.rebind(var7, var2);
                        module0601.$g4652$.rebind(var4_6, var2);
                    }
                }
                finally {
                    final SubLObject var4_7 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0620.T, var2);
                        module0601.f36746();
                        module0601.f36760((SubLObject)module0620.$ic3$);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var4_7, var2);
                    }
                }
            }
            finally {
                module0587.$g4457$.rebind(var6, var2);
            }
        }
        finally {
            final SubLObject var11 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0620.T, var2);
                if (var3.isStream()) {
                    streams_high.close(var3, (SubLObject)module0620.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var11, var2);
            }
        }
        return var1;
    }
    
    public static SubLObject f38253(final SubLObject var10, final SubLObject var8) {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        module0601.f36746();
        try {
            final SubLObject var12 = module0601.$g4652$.currentBinding(var11);
            final SubLObject var13 = module0601.$g4654$.currentBinding(var11);
            try {
                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var11), module0601.$g4652$.getDynamicValue(var11)), var11);
                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var11), var11);
                module0601.f36758((SubLObject)module0620.$ic6$, (SubLObject)module0620.NIL, (SubLObject)module0620.NIL, (SubLObject)module0620.NIL);
                SubLObject var14 = (SubLObject)module0620.NIL;
                SubLObject var15 = (SubLObject)module0620.NIL;
                SubLObject var16 = (SubLObject)module0620.NIL;
                SubLObject var17 = (SubLObject)module0620.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var10, var10, (SubLObject)module0620.$ic7$);
                var14 = var10.first();
                SubLObject var18 = var10.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var18, var10, (SubLObject)module0620.$ic7$);
                var15 = var18.first();
                var18 = var18.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var18, var10, (SubLObject)module0620.$ic7$);
                var16 = var18.first();
                var18 = var18.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var18, var10, (SubLObject)module0620.$ic7$);
                var17 = var18.first();
                var18 = var18.rest();
                if (module0620.NIL == var18) {
                    module0601.f36746();
                    try {
                        final SubLObject var4_18 = module0601.$g4652$.currentBinding(var11);
                        final SubLObject var7_19 = module0601.$g4654$.currentBinding(var11);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var11), module0601.$g4652$.getDynamicValue(var11)), var11);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var11), var11);
                            module0601.f36758((SubLObject)module0620.$ic8$, (SubLObject)module0620.NIL, (SubLObject)module0620.NIL, (SubLObject)module0620.NIL);
                            module0601.f36747((SubLObject)module0620.$ic9$, (SubLObject)module0620.UNPROVIDED, (SubLObject)module0620.UNPROVIDED);
                            final SubLObject var19 = module0109.f7661(var16, (SubLObject)module0620.$ic10$);
                            final SubLObject var20 = module0110.f7676((SubLObject)ConsesLow.list(var19), var8, (SubLObject)module0620.UNPROVIDED).first();
                            module0601.f36747(var20, (SubLObject)module0620.UNPROVIDED, (SubLObject)module0620.UNPROVIDED);
                            SubLObject var21 = module0110.f7675(var17, var8, (SubLObject)module0620.UNPROVIDED);
                            SubLObject var22 = (SubLObject)module0620.NIL;
                            var22 = var21.first();
                            while (module0620.NIL != var21) {
                                module0601.f36746();
                                module0601.f36747(var22, (SubLObject)module0620.UNPROVIDED, (SubLObject)module0620.UNPROVIDED);
                                var21 = var21.rest();
                                var22 = var21.first();
                            }
                        }
                        finally {
                            module0601.$g4654$.rebind(var7_19, var11);
                            module0601.$g4652$.rebind(var4_18, var11);
                        }
                    }
                    finally {
                        final SubLObject var4_19 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0620.T, var11);
                            module0601.f36760((SubLObject)module0620.$ic8$);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var4_19, var11);
                        }
                    }
                    final SubLObject var23 = Symbols.symbol_name(var14);
                    final SubLObject var24 = (SubLObject)ConsesLow.list((SubLObject)module0620.$ic11$, var23);
                    final SubLObject var25 = f38254(var23, (SubLObject)module0620.UNPROVIDED);
                    module0601.f36746();
                    try {
                        final SubLObject var4_20 = module0601.$g4652$.currentBinding(var11);
                        final SubLObject var7_20 = module0601.$g4654$.currentBinding(var11);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var11), module0601.$g4652$.getDynamicValue(var11)), var11);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var11), var11);
                            module0601.f36758((SubLObject)module0620.$ic12$, var24, (SubLObject)module0620.NIL, (SubLObject)module0620.NIL);
                            module0601.f36747(var25, (SubLObject)module0620.UNPROVIDED, (SubLObject)module0620.UNPROVIDED);
                        }
                        finally {
                            module0601.$g4654$.rebind(var7_20, var11);
                            module0601.$g4652$.rebind(var4_20, var11);
                        }
                    }
                    finally {
                        final SubLObject var4_21 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0620.T, var11);
                            module0601.f36760((SubLObject)module0620.$ic12$);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var4_21, var11);
                        }
                    }
                    module0601.f36746();
                    try {
                        final SubLObject var4_22 = module0601.$g4652$.currentBinding(var11);
                        final SubLObject var7_21 = module0601.$g4654$.currentBinding(var11);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var11), module0601.$g4652$.getDynamicValue(var11)), var11);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var11), var11);
                            module0601.f36758((SubLObject)module0620.$ic13$, (SubLObject)module0620.NIL, (SubLObject)module0620.NIL, (SubLObject)module0620.NIL);
                            final SubLObject var26 = f38255(var16);
                            final SubLObject var27 = f38256(var16);
                            try {
                                final SubLObject var4_23 = module0601.$g4652$.currentBinding(var11);
                                final SubLObject var7_22 = module0601.$g4654$.currentBinding(var11);
                                try {
                                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var11), module0601.$g4652$.getDynamicValue(var11)), var11);
                                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var11), var11);
                                    module0601.f36758(var26, (SubLObject)module0620.NIL, (SubLObject)module0620.NIL, (SubLObject)module0620.NIL);
                                    if (module0620.$ic14$ != var16) {
                                        if (module0620.$ic15$ == var16) {
                                            module0601.f36747((SubLObject)((module0620.NIL != var15) ? module0620.$ic16$ : module0620.$ic17$), (SubLObject)module0620.UNPROVIDED, (SubLObject)module0620.UNPROVIDED);
                                        }
                                        else if (module0620.$ic18$.equal(var16)) {
                                            if (var15.isString()) {
                                                try {
                                                    final SubLObject var4_24 = module0601.$g4652$.currentBinding(var11);
                                                    final SubLObject var7_23 = module0601.$g4654$.currentBinding(var11);
                                                    try {
                                                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var11), module0601.$g4652$.getDynamicValue(var11)), var11);
                                                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var11), var11);
                                                        module0601.f36758((SubLObject)module0620.$ic19$, (SubLObject)module0620.NIL, (SubLObject)module0620.NIL, (SubLObject)module0620.NIL);
                                                        module0601.f36747(var15, (SubLObject)module0620.UNPROVIDED, (SubLObject)module0620.UNPROVIDED);
                                                    }
                                                    finally {
                                                        module0601.$g4654$.rebind(var7_23, var11);
                                                        module0601.$g4652$.rebind(var4_24, var11);
                                                    }
                                                }
                                                finally {
                                                    final SubLObject var4_25 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                                                    try {
                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0620.T, var11);
                                                        module0601.f36760((SubLObject)module0620.$ic19$);
                                                    }
                                                    finally {
                                                        Threads.$is_thread_performing_cleanupP$.rebind(var4_25, var11);
                                                    }
                                                }
                                            }
                                            else {
                                                final SubLObject var4_26 = module0601.$g4652$.currentBinding(var11);
                                                final SubLObject var7_24 = module0601.$g4654$.currentBinding(var11);
                                                try {
                                                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var11), module0601.$g4652$.getDynamicValue(var11)), var11);
                                                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var11), var11);
                                                    module0601.f36758((SubLObject)module0620.$ic20$, (SubLObject)module0620.NIL, (SubLObject)module0620.T, (SubLObject)module0620.NIL);
                                                }
                                                finally {
                                                    module0601.$g4654$.rebind(var7_24, var11);
                                                    module0601.$g4652$.rebind(var4_26, var11);
                                                }
                                            }
                                        }
                                        else {
                                            module0601.f36747(module0038.f2624(var15), (SubLObject)module0620.UNPROVIDED, (SubLObject)module0620.UNPROVIDED);
                                        }
                                    }
                                }
                                finally {
                                    module0601.$g4654$.rebind(var7_22, var11);
                                    module0601.$g4652$.rebind(var4_23, var11);
                                }
                            }
                            finally {
                                final SubLObject var4_27 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0620.T, var11);
                                    if (module0620.NIL != var27) {
                                        module0601.f36746();
                                    }
                                    module0601.f36760(var26);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var4_27, var11);
                                }
                            }
                        }
                        finally {
                            module0601.$g4654$.rebind(var7_21, var11);
                            module0601.$g4652$.rebind(var4_22, var11);
                        }
                    }
                    finally {
                        final SubLObject var4_28 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0620.T, var11);
                            module0601.f36746();
                            module0601.f36760((SubLObject)module0620.$ic13$);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var4_28, var11);
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var10, (SubLObject)module0620.$ic7$);
                }
            }
            finally {
                module0601.$g4654$.rebind(var13, var11);
                module0601.$g4652$.rebind(var12, var11);
            }
        }
        finally {
            final SubLObject var28 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0620.T, var11);
                module0601.f36746();
                module0601.f36760((SubLObject)module0620.$ic6$);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var28, var11);
            }
        }
        return var10;
    }
    
    public static SubLObject f38256(final SubLObject var16) {
        if (var16.isCons()) {
            return module0004.f104(var16.first(), (SubLObject)module0620.$ic21$, (SubLObject)module0620.UNPROVIDED, (SubLObject)module0620.UNPROVIDED);
        }
        return (SubLObject)module0620.NIL;
    }
    
    public static SubLObject f38254(final SubLObject var24, SubLObject var43) {
        if (var43 == module0620.UNPROVIDED) {
            var43 = (SubLObject)module0620.NIL;
        }
        SubLObject var44 = (SubLObject)module0620.NIL;
        SubLObject var45 = (SubLObject)module0620.NIL;
        try {
            var45 = streams_high.make_private_string_output_stream();
            SubLObject var46 = var43;
            SubLObject var47;
            SubLObject var48;
            SubLObject var49;
            SubLObject var50;
            for (var47 = Sequences.length(var24), var48 = (SubLObject)module0620.NIL, var48 = (SubLObject)module0620.ZERO_INTEGER; var48.numL(var47); var48 = Numbers.add(var48, (SubLObject)module0620.ONE_INTEGER)) {
                var49 = Strings.sublisp_char(var24, var48);
                if (module0620.NIL != Characters.alphanumericp(var49)) {
                    var50 = ((module0620.NIL != var46) ? Characters.char_downcase(var49) : Characters.char_upcase(var49));
                    streams_high.write_char(var50, var45);
                    var46 = (SubLObject)module0620.T;
                }
                else {
                    var46 = (SubLObject)module0620.NIL;
                }
            }
            var44 = streams_high.get_output_stream_string(var45);
        }
        finally {
            final SubLObject var51 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0620.T);
                streams_high.close(var45, (SubLObject)module0620.UNPROVIDED);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var51);
            }
        }
        return var44;
    }
    
    public static SubLObject f38255(final SubLObject var16) {
        final SubLObject var17 = f38257(var16);
        return module0038.f2771(var17);
    }
    
    public static SubLObject f38257(final SubLObject var16) {
        SubLObject var17 = (SubLObject)module0620.NIL;
        if (var16.isCons()) {
            SubLObject var18 = (SubLObject)module0620.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var16, var16, (SubLObject)module0620.$ic22$);
            var18 = var16.first();
            final SubLObject var20;
            final SubLObject var19 = var20 = var16.rest();
            if (module0620.$ic23$ == var18 || module0620.$ic24$ == var18) {
                final SubLObject var21 = f38254(Symbols.symbol_name(var18), (SubLObject)module0620.UNPROVIDED);
                SubLObject var22 = (SubLObject)module0620.NIL;
                try {
                    var22 = streams_high.make_private_string_output_stream();
                    SubLObject var23 = (SubLObject)module0620.NIL;
                    SubLObject var24 = (SubLObject)module0620.NIL;
                    SubLObject var25 = (SubLObject)module0620.NIL;
                    var23 = var20;
                    var24 = var23.first();
                    for (var25 = (SubLObject)module0620.ZERO_INTEGER; module0620.NIL != var23; var23 = var23.rest(), var24 = var23.first(), var25 = Numbers.add((SubLObject)module0620.ONE_INTEGER, var25)) {
                        if (!var25.isZero()) {
                            streams_high.write_string(var21, var22, (SubLObject)module0620.UNPROVIDED, (SubLObject)module0620.UNPROVIDED);
                        }
                        streams_high.write_string(f38257(var24), var22, (SubLObject)module0620.UNPROVIDED, (SubLObject)module0620.UNPROVIDED);
                    }
                    var17 = streams_high.get_output_stream_string(var22);
                }
                finally {
                    final SubLObject var26 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                    try {
                        Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0620.T);
                        streams_high.close(var22, (SubLObject)module0620.UNPROVIDED);
                    }
                    finally {
                        Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var26);
                    }
                }
            }
            else if (module0620.$ic25$ == var18) {
                var17 = (SubLObject)module0620.$ic26$;
            }
            else {
                Errors.error((SubLObject)module0620.$ic27$, var18, var16);
            }
        }
        else if (var16.isSymbol()) {
            var17 = f38254(Symbols.symbol_name(var16), (SubLObject)module0620.UNPROVIDED);
        }
        else {
            Errors.error((SubLObject)module0620.$ic28$, var16);
        }
        return var17;
    }
    
    public static SubLObject f38252(SubLObject var58) {
        if (var58 == module0620.UNPROVIDED) {
            var58 = (SubLObject)module0620.T;
        }
        final SubLThread var59 = SubLProcess.currentSubLThread();
        module0601.f36751(module0601.$g4651$.getDynamicValue(var59), (SubLObject)module0620.$ic29$, (SubLObject)module0620.NIL);
        SubLObject var60 = (SubLObject)module0620.NIL;
        SubLObject var61 = (SubLObject)module0620.NIL;
        try {
            var61 = streams_high.make_private_string_output_stream();
            PrintLow.format(var61, (SubLObject)module0620.$ic30$, module0011.f351(), Environment.lisp_implementation_type());
            PrintLow.format(var61, (SubLObject)module0620.$ic31$, module0051.f3552((SubLObject)module0620.UNPROVIDED));
            streams_high.terpri(var61);
            if (module0620.NIL != var58) {
                PrintLow.format(var61, (SubLObject)module0620.$ic32$);
                SubLObject var62 = reader.$features$.getDynamicValue(var59);
                SubLObject var63 = (SubLObject)module0620.NIL;
                var63 = var62.first();
                while (module0620.NIL != var62) {
                    module0038.f2648(var61, (SubLObject)module0620.FOUR_INTEGER);
                    print_high.prin1(var63, var61);
                    streams_high.terpri(var61);
                    var62 = var62.rest();
                    var63 = var62.first();
                }
                streams_high.terpri(var61);
            }
            var60 = streams_high.get_output_stream_string(var61);
        }
        finally {
            final SubLObject var64 = Threads.$is_thread_performing_cleanupP$.currentBinding(var59);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0620.T, var59);
                streams_high.close(var61, (SubLObject)module0620.UNPROVIDED);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var64, var59);
            }
        }
        module0601.f36756(var60);
        return module0601.f36746();
    }
    
    public static SubLObject f38258(final SubLObject var61, final SubLObject var62) {
        SubLObject var64;
        final SubLObject var63 = var64 = var61.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var64, var63, (SubLObject)module0620.$ic34$);
        final SubLObject var65 = var64.rest();
        var64 = var64.first();
        SubLObject var66 = (SubLObject)module0620.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var64, var63, (SubLObject)module0620.$ic34$);
        var66 = var64.first();
        var64 = var64.rest();
        if (module0620.NIL == var64) {
            final SubLObject var67;
            var64 = (var67 = var65);
            final SubLObject var68 = (SubLObject)module0620.$ic35$;
            return (SubLObject)ConsesLow.list((SubLObject)module0620.$ic36$, (SubLObject)ConsesLow.list(reader.bq_cons(var68, (SubLObject)module0620.$ic37$)), (SubLObject)ConsesLow.list((SubLObject)module0620.$ic38$, var68, (SubLObject)ConsesLow.list((SubLObject)module0620.$ic39$, var68, var66)), (SubLObject)ConsesLow.listS((SubLObject)module0620.$ic40$, (SubLObject)ConsesLow.list((SubLObject)module0620.$ic41$, var68), (SubLObject)module0620.$ic42$, (SubLObject)module0620.$ic43$, (SubLObject)module0620.$ic42$, ConsesLow.append(var67, (SubLObject)module0620.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var63, (SubLObject)module0620.$ic34$);
        return (SubLObject)module0620.NIL;
    }
    
    public static SubLObject f38259(final SubLObject var68, final SubLObject var69) {
        final SubLThread var70 = SubLProcess.currentSubLThread();
        SubLObject var71 = (SubLObject)module0620.NIL;
        try {
            final SubLObject var72 = stream_macros.$stream_requires_locking$.currentBinding(var70);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0620.NIL, var70);
                var71 = compatibility.open_text(var68, (SubLObject)module0620.$ic0$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var72, var70);
            }
            if (!var71.isStream()) {
                Errors.error((SubLObject)module0620.$ic1$, var68);
            }
            final SubLObject var73 = var71;
            final SubLObject var74 = module0587.$g4457$.currentBinding(var70);
            try {
                module0587.$g4457$.bind(var73, var70);
                f38260((SubLObject)module0620.UNPROVIDED);
                SubLObject var75 = f38261();
                var75 = f38262(var75, module0620.$g4768$.getDynamicValue(var70));
                try {
                    final SubLObject var4_72 = module0601.$g4652$.currentBinding(var70);
                    final SubLObject var76 = module0601.$g4654$.currentBinding(var70);
                    try {
                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var70), module0601.$g4652$.getDynamicValue(var70)), var70);
                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var70), var70);
                        module0601.f36758((SubLObject)module0620.$ic41$, var75, (SubLObject)module0620.NIL, (SubLObject)module0620.NIL);
                        module0601.f36746();
                        final SubLObject var4_73 = module0601.$g4652$.currentBinding(var70);
                        final SubLObject var7_74 = module0601.$g4654$.currentBinding(var70);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var70), module0601.$g4652$.getDynamicValue(var70)), var70);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var70), var70);
                            module0601.f36758((SubLObject)module0620.$ic46$, (SubLObject)ConsesLow.list((SubLObject)module0620.$ic47$, (SubLObject)module0620.$ic48$, (SubLObject)module0620.$ic49$, (SubLObject)module0620.$ic50$), (SubLObject)module0620.T, (SubLObject)module0620.NIL);
                        }
                        finally {
                            module0601.$g4654$.rebind(var7_74, var70);
                            module0601.$g4652$.rebind(var4_73, var70);
                        }
                        module0601.f36746();
                        final SubLObject var77 = module0077.f5333(var69);
                        SubLObject var78;
                        SubLObject var79;
                        SubLObject var80;
                        for (var78 = module0032.f1741(var77), var79 = (SubLObject)module0620.NIL, var79 = module0032.f1742(var78, var77); module0620.NIL == module0032.f1744(var78, var79); var79 = module0032.f1743(var79)) {
                            var80 = module0032.f1745(var78, var79);
                            if (module0620.NIL != module0032.f1746(var79, var80)) {
                                f38263(var80);
                            }
                        }
                        f38264();
                    }
                    finally {
                        module0601.$g4654$.rebind(var76, var70);
                        module0601.$g4652$.rebind(var4_72, var70);
                    }
                }
                finally {
                    final SubLObject var4_74 = Threads.$is_thread_performing_cleanupP$.currentBinding(var70);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0620.T, var70);
                        module0601.f36746();
                        module0601.f36760((SubLObject)module0620.$ic41$);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var4_74, var70);
                    }
                }
            }
            finally {
                module0587.$g4457$.rebind(var74, var70);
            }
        }
        finally {
            final SubLObject var81 = Threads.$is_thread_performing_cleanupP$.currentBinding(var70);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0620.T, var70);
                if (var71.isStream()) {
                    streams_high.close(var71, (SubLObject)module0620.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var81, var70);
            }
        }
        return var68;
    }
    
    public static SubLObject f38261() {
        return conses_high.copy_list(module0620.$g4769$.getGlobalValue());
    }
    
    public static SubLObject f38262(final SubLObject var25, final SubLObject var66) {
        return ConsesLow.append(var25, (SubLObject)ConsesLow.list((SubLObject)module0620.$ic52$, var66, (SubLObject)module0620.$ic53$, var66));
    }
    
    public static SubLObject f38260(SubLObject var58) {
        if (var58 == module0620.UNPROVIDED) {
            var58 = (SubLObject)module0620.T;
        }
        return f38252(var58);
    }
    
    public static SubLObject f38264() {
        return module0601.f36746();
    }
    
    public static SubLObject f38263(final SubLObject var16) {
        module0601.f36756(Sequences.cconcatenate((SubLObject)module0620.$ic54$, module0006.f203(var16)));
        if (var16.isCons()) {
            Errors.error((SubLObject)module0620.$ic55$);
        }
        else if (var16.isSymbol()) {}
        return module0601.f36746();
    }
    
    public static SubLObject f38265() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0620", "f38251", "S#41846", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0620", "f38253", "S#41847", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0620", "f38256", "S#41848", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0620", "f38254", "S#41849", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0620", "f38255", "S#41850", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0620", "f38257", "S#41851", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0620", "f38252", "S#41852", 0, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0620", "f38258", "S#41853");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0620", "f38259", "GENERATE-SYSTEM-PARAMETER-TYPES-XSD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0620", "f38261", "S#41854", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0620", "f38262", "S#41855", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0620", "f38260", "S#41856", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0620", "f38264", "S#41857", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0620", "f38263", "S#41858", 1, 0, false);
        return (SubLObject)module0620.NIL;
    }
    
    public static SubLObject f38266() {
        module0620.$g4767$ = SubLFiles.deflexical("S#41859", (SubLObject)module0620.$ic33$);
        module0620.$g4768$ = SubLFiles.defparameter("S#41860", (SubLObject)module0620.$ic44$);
        module0620.$g4769$ = SubLFiles.deflexical("S#41861", (SubLObject)module0620.$ic51$);
        return (SubLObject)module0620.NIL;
    }
    
    public static SubLObject f38267() {
        module0002.f38((SubLObject)module0620.$ic45$);
        return (SubLObject)module0620.NIL;
    }
    
    public void declareFunctions() {
        f38265();
    }
    
    public void initializeVariables() {
        f38266();
    }
    
    public void runTopLevelForms() {
        f38267();
    }
    
    static {
        me = (SubLFile)new module0620();
        module0620.$g4767$ = null;
        module0620.$g4768$ = null;
        module0620.$g4769$ = null;
        $ic0$ = SubLObjectFactory.makeKeyword("OUTPUT");
        $ic1$ = SubLObjectFactory.makeString("Unable to open ~S");
        $ic2$ = SubLObjectFactory.makeKeyword("INCLUDE-FEATURES");
        $ic3$ = SubLObjectFactory.makeString("params");
        $ic4$ = SubLObjectFactory.makeString("xmlns");
        $ic5$ = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("true"), (SubLObject)SubLObjectFactory.makeString("::TRUE::")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("false"), (SubLObject)SubLObjectFactory.makeString("::FALSE::")));
        $ic6$ = SubLObjectFactory.makeString("param");
        $ic7$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOL"), (SubLObject)SubLObjectFactory.makeSymbol("S#9672", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("S#669", "CYC"));
        $ic8$ = SubLObjectFactory.makeString("doc");
        $ic9$ = SubLObjectFactory.makeString("Possible Values: ");
        $ic10$ = SubLObjectFactory.makeKeyword("XML");
        $ic11$ = SubLObjectFactory.makeString("equiv");
        $ic12$ = SubLObjectFactory.makeString("name");
        $ic13$ = SubLObjectFactory.makeString("value");
        $ic14$ = SubLObjectFactory.makeSymbol("S#4764", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("BOOLEAN");
        $ic16$ = SubLObjectFactory.makeString("true");
        $ic17$ = SubLObjectFactory.makeString("false");
        $ic18$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OR"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("S#4764", "CYC"));
        $ic19$ = SubLObjectFactory.makeString("string");
        $ic20$ = SubLObjectFactory.makeString("undefined");
        $ic21$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AND"), (SubLObject)SubLObjectFactory.makeSymbol("OR"));
        $ic22$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#41862", "CYC"));
        $ic23$ = SubLObjectFactory.makeSymbol("OR");
        $ic24$ = SubLObjectFactory.makeSymbol("AND");
        $ic25$ = SubLObjectFactory.makeSymbol("MEMBER");
        $ic26$ = SubLObjectFactory.makeString("keyword");
        $ic27$ = SubLObjectFactory.makeString("Unsupported operator ~A in type ~A.");
        $ic28$ = SubLObjectFactory.makeString("Unsupported type descriptor ~A.");
        $ic29$ = SubLObjectFactory.makeString("UTF-8");
        $ic30$ = SubLObjectFactory.makeString("  generated by Cyc ~A  (~A)~%");
        $ic31$ = SubLObjectFactory.makeString("            at ~A~%");
        $ic32$ = SubLObjectFactory.makeString("  Features of generating code:~%");
        $ic33$ = SubLObjectFactory.makeString("http://ws.opencyc.org/xsd/sysParam/0.9");
        $ic34$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#41863", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic35$ = SubLObjectFactory.makeUninternedSymbol("US#3206ECE");
        $ic36$ = SubLObjectFactory.makeSymbol("CLET");
        $ic37$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#41854", "CYC")));
        $ic38$ = SubLObjectFactory.makeSymbol("CSETQ");
        $ic39$ = SubLObjectFactory.makeSymbol("S#41855", "CYC");
        $ic40$ = SubLObjectFactory.makeSymbol("S#40551", "CYC");
        $ic41$ = SubLObjectFactory.makeString("xsd:schema");
        $ic42$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#40545", "CYC"));
        $ic43$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#40551", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("xsd:import"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeString("namespace"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/XML/1998/namespace"), (SubLObject)SubLObjectFactory.makeString("schemaLocation"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2001/xml.xsd")), (SubLObject)module0620.T, (SubLObject)module0620.T));
        $ic44$ = SubLObjectFactory.makeString("http://ws.opencyc.org/SystemParameterType/0.9/");
        $ic45$ = SubLObjectFactory.makeSymbol("GENERATE-SYSTEM-PARAMETER-TYPES-XSD");
        $ic46$ = SubLObjectFactory.makeString("xsd:import");
        $ic47$ = SubLObjectFactory.makeString("namespace");
        $ic48$ = SubLObjectFactory.makeString("http://www.w3.org/XML/1998/namespace");
        $ic49$ = SubLObjectFactory.makeString("schemaLocation");
        $ic50$ = SubLObjectFactory.makeString("http://www.w3.org/2001/xml.xsd");
        $ic51$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("xmlns:xsd"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2001/XMLSchema"), (SubLObject)SubLObjectFactory.makeString("xmlns:xsi"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2001/XMLSchema-instance"), (SubLObject)SubLObjectFactory.makeString("xsi:schemaLocation"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2001/XMLSchema http://www.w3.org/2001/XMLSchema.xsd"), (SubLObject)SubLObjectFactory.makeString("xmlns:xml"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/XML/1998/namespace"));
        $ic52$ = SubLObjectFactory.makeString("targetNameSpace");
        $ic53$ = SubLObjectFactory.makeString("xmlns:tns");
        $ic54$ = SubLObjectFactory.makeString(" definition for SYSTEM-PARAMETER type ");
        $ic55$ = SubLObjectFactory.makeString("Dont handle recursive types yet.");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0620.class
	Total time: 381 ms
	
	Decompiled with Procyon 0.5.32.
*/