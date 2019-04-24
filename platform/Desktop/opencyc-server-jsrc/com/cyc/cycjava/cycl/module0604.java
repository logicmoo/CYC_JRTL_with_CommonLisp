package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0604 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0604";
    public static final String myFingerPrint = "8a633f7fc1f744f97c3487a29ecd721fce19eee1662d42050efbbf3ec06cc557";
    private static SubLSymbol $g4667$;
    private static SubLSymbol $g4668$;
    public static SubLSymbol $g4669$;
    public static SubLSymbol $g4670$;
    public static SubLSymbol $g4671$;
    private static SubLSymbol $g4672$;
    private static SubLSymbol $g4673$;
    public static SubLSymbol $g4674$;
    public static SubLSymbol $g4095$;
    private static final SubLString $ic0$;
    private static final SubLInteger $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLString $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLString $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLString $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLString $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLString $ic17$;
    private static final SubLString $ic18$;
    private static final SubLString $ic19$;
    private static final SubLList $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLList $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    private static final SubLString $ic28$;
    private static final SubLString $ic29$;
    private static final SubLString $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLString $ic34$;
    private static final SubLString $ic35$;
    private static final SubLString $ic36$;
    private static final SubLString $ic37$;
    private static final SubLString $ic38$;
    private static final SubLString $ic39$;
    private static final SubLString $ic40$;
    private static final SubLString $ic41$;
    private static final SubLString $ic42$;
    private static final SubLString $ic43$;
    private static final SubLString $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLList $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLList $ic53$;
    private static final SubLString $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLList $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLList $ic61$;
    private static final SubLList $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLInteger $ic66$;
    private static final SubLInteger $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLList $ic73$;
    private static final SubLString $ic74$;
    private static final SubLString $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLList $ic79$;
    private static final SubLInteger $ic80$;
    private static final SubLString $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLString $ic83$;
    private static final SubLString $ic84$;
    private static final SubLList $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLString $ic89$;
    private static final SubLSymbol $ic90$;
    
    public static SubLObject f36885(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0604.NIL != f36886(var1) && module0604.$ic2$ == var1.first());
    }
    
    public static SubLObject f36886(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var1.isCons() && var1.first().isKeyword() && module0604.NIL != module0035.f1995(var1, (SubLObject)module0604.TWO_INTEGER, (SubLObject)module0604.UNPROVIDED));
    }
    
    public static SubLObject f36887(final SubLObject var1) {
        if (module0604.NIL != f36886(var1)) {
            return var1.first();
        }
        return (SubLObject)module0604.$ic3$;
    }
    
    public static SubLObject f36888(final SubLObject var1) {
        if (module0604.NIL != f36886(var1)) {
            return conses_high.second(var1);
        }
        return (SubLObject)module0604.NIL;
    }
    
    public static SubLObject f36889(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0604.NIL != f36885(var1) && module0604.NIL == f36888(var1));
    }
    
    public static SubLObject f36890(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0604.NIL != f36886(var1)) {
            final SubLObject var3 = conses_high.second(var1);
            final SubLObject var4 = conses_high.third(var1);
            final SubLObject var5 = module0604.$g4671$.getDynamicValue(var2);
            if (var5.eql((SubLObject)module0604.$ic4$)) {
                Errors.warn((SubLObject)module0604.$ic5$, var3, var4);
            }
            else if (var5.eql((SubLObject)module0604.$ic6$)) {
                Errors.error((SubLObject)module0604.$ic5$, var3, var4);
            }
        }
        return (SubLObject)module0604.NIL;
    }
    
    public static SubLObject f36891() {
        return f36892(f36893());
    }
    
    public static SubLObject f36894() {
        return f36885(f36891());
    }
    
    public static SubLObject f36895() {
        final SubLObject var6 = f36892(f36896());
        if (module0604.NIL != f36885(var6)) {
            return f36888(var6);
        }
        return f36890(var6);
    }
    
    public static SubLObject f36897(final SubLObject var7) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var7.isString() && f36898(var7).isNumber());
    }
    
    public static SubLObject f36899(final SubLObject var7, SubLObject var8, SubLObject var9) {
        if (var8 == module0604.UNPROVIDED) {
            var8 = module0604.$g4669$.getGlobalValue();
        }
        if (var9 == module0604.UNPROVIDED) {
            var9 = module0604.$g4670$.getGlobalValue();
        }
        final SubLObject var10 = f36892(f36900(var7, var8, var9));
        if (module0604.NIL != f36885(var10)) {
            return f36888(var10);
        }
        return f36890(var10);
    }
    
    public static SubLObject f36901(final SubLObject var7, SubLObject var8, SubLObject var9) {
        if (var8 == module0604.UNPROVIDED) {
            var8 = module0604.$g4669$.getGlobalValue();
        }
        if (var9 == module0604.UNPROVIDED) {
            var9 = module0604.$g4670$.getGlobalValue();
        }
        final SubLObject var10 = f36892(f36902(var7, var8, var9));
        if (module0604.NIL != f36885(var10)) {
            return f36888(var10);
        }
        return f36890(var10);
    }
    
    public static SubLObject f36903(final SubLObject var7, final SubLObject var10) {
        final SubLObject var11 = f36892(f36904(var7, var10));
        if (module0604.NIL != f36885(var11)) {
            return f36888(var11);
        }
        return f36890(var11);
    }
    
    public static SubLObject f36905(final SubLObject var7, final SubLObject var11) {
        SubLObject var13;
        final SubLObject var12 = var13 = f36906(var7);
        SubLObject var14 = (SubLObject)module0604.NIL;
        SubLObject var15 = (SubLObject)module0604.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0604.$ic7$);
        var14 = var13.first();
        var13 = var13.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0604.$ic7$);
        var15 = var13.first();
        var13 = var13.rest();
        if (module0604.NIL != var13) {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)module0604.$ic7$);
            return (SubLObject)module0604.NIL;
        }
        final SubLObject var16 = module0035.f2119((SubLObject)ConsesLow.list(var14, var11, var15));
        final SubLObject var17 = f36892(var16);
        if (module0604.NIL != f36885(var17)) {
            return f36888(var17);
        }
        return f36890(var17);
    }
    
    public static SubLObject f36907(final SubLObject var7, SubLObject var8, SubLObject var9) {
        if (var8 == module0604.UNPROVIDED) {
            var8 = module0604.$g4669$.getGlobalValue();
        }
        if (var9 == module0604.UNPROVIDED) {
            var9 = module0604.$g4670$.getGlobalValue();
        }
        final SubLObject var10 = f36892(f36908(var7, var8, var9));
        if (module0604.NIL != f36885(var10)) {
            return f36888(var10);
        }
        return f36890(var10);
    }
    
    public static SubLObject f36909(final SubLObject var10, SubLObject var17) {
        if (var17 == module0604.UNPROVIDED) {
            var17 = (SubLObject)module0604.$ic8$;
        }
        return conses_high.getf(var10, (SubLObject)module0604.$ic9$, var17);
    }
    
    public static SubLObject f36910(final SubLObject var7, SubLObject var8, SubLObject var9) {
        if (var8 == module0604.UNPROVIDED) {
            var8 = module0604.$g4669$.getGlobalValue();
        }
        if (var9 == module0604.UNPROVIDED) {
            var9 = module0604.$g4670$.getGlobalValue();
        }
        return f36909(f36907(var7, var8, var9), (SubLObject)module0604.UNPROVIDED);
    }
    
    public static SubLObject f36898(final SubLObject var7) {
        final SubLObject var8 = f36892(f36911(var7));
        if (module0604.NIL != f36885(var8)) {
            return f36888(var8);
        }
        return f36890(var8);
    }
    
    public static SubLObject f36912(final SubLObject var18, final SubLObject var19, final SubLObject var20) {
        final SubLObject var21 = f36892(f36913(var18, var19, var20));
        if (module0604.NIL != f36885(var21)) {
            return f36888(var21);
        }
        return f36890(var21);
    }
    
    public static SubLObject f36914(final SubLObject var18, final SubLObject var19) {
        final SubLObject var20 = f36892(f36915(var18, var19));
        if (module0604.NIL != f36885(var20)) {
            return f36888(var20);
        }
        return f36890(var20);
    }
    
    public static SubLObject f36916(final SubLObject var18, final SubLObject var19, final SubLObject var20) {
        final SubLObject var21 = f36892(f36915(var18, var19));
        if (module0604.NIL != f36885(var21)) {
            final SubLObject var22 = f36888(var21);
            final SubLObject var23 = module0075.f5277(var22, var20);
            return var23;
        }
        f36890(var21);
        return (SubLObject)module0604.NIL;
    }
    
    public static SubLObject f36892(final SubLObject var23) {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        SubLObject var25 = (SubLObject)module0604.NIL;
        SubLObject var26 = (SubLObject)module0604.NIL;
        try {
            var24.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var27 = Errors.$error_handler$.currentBinding(var24);
            try {
                Errors.$error_handler$.bind((SubLObject)module0604.$ic10$, var24);
                try {
                    SubLObject var28 = (SubLObject)module0604.NIL;
                    try {
                        var28 = module0004.f82(module0604.$g4667$.getDynamicValue(var24), module0604.$g4668$.getDynamicValue(var24), (SubLObject)module0604.NIL, (SubLObject)module0604.$ic11$);
                        if (module0604.NIL != module0003.f70(var28, module0604.$g4667$.getDynamicValue(var24), module0604.$g4668$.getDynamicValue(var24))) {
                            if (var23.isString()) {
                                streams_high.write_string(var23, var28, (SubLObject)module0604.UNPROVIDED, (SubLObject)module0604.UNPROVIDED);
                            }
                            else if (module0604.NIL != module0035.f2192((SubLObject)module0604.$ic12$, var23)) {
                                SubLObject var29 = var23;
                                SubLObject var30 = (SubLObject)module0604.NIL;
                                var30 = var29.first();
                                while (module0604.NIL != var29) {
                                    streams_high.write_string(var30, var28, (SubLObject)module0604.UNPROVIDED, (SubLObject)module0604.UNPROVIDED);
                                    var29 = var29.rest();
                                    var30 = var29.first();
                                }
                            }
                            else {
                                Errors.error((SubLObject)module0604.$ic13$);
                            }
                            module0038.f2833(var28);
                            streams_high.force_output(var28);
                            var25 = reader.read(var28, (SubLObject)module0604.NIL, (SubLObject)module0604.$ic14$, (SubLObject)module0604.UNPROVIDED);
                            if (var25.isCons()) {
                                var25 = Eval.eval(var25);
                            }
                        }
                    }
                    finally {
                        final SubLObject var25_29 = Threads.$is_thread_performing_cleanupP$.currentBinding(var24);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0604.T, var24);
                            if (module0604.NIL != var28) {
                                streams_high.close(var28, (SubLObject)module0604.UNPROVIDED);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var25_29, var24);
                        }
                    }
                }
                catch (Throwable var31) {
                    Errors.handleThrowable(var31, (SubLObject)module0604.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var27, var24);
            }
        }
        catch (Throwable var32) {
            var26 = Errors.handleThrowable(var32, module0003.$g3$.getGlobalValue());
        }
        finally {
            var24.throwStack.pop();
        }
        if (module0604.NIL == var25 || var25 == module0604.$ic14$) {
            var26 = (SubLObject)module0604.$ic15$;
        }
        if (var26.isString()) {
            return (SubLObject)ConsesLow.list((SubLObject)module0604.$ic16$, (SubLObject)module0604.$ic17$, var26);
        }
        return var25;
    }
    
    public static SubLObject f36917(final SubLObject var32, final SubLObject var33) {
        SubLObject var35;
        final SubLObject var34 = var35 = var32.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var35, var34, (SubLObject)module0604.$ic20$);
        final SubLObject var36 = var35.rest();
        var35 = var35.first();
        SubLObject var37 = (SubLObject)module0604.NIL;
        SubLObject var38 = (SubLObject)module0604.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var35, var34, (SubLObject)module0604.$ic20$);
        var37 = var35.first();
        var35 = var35.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var35, var34, (SubLObject)module0604.$ic20$);
        var38 = var35.first();
        var35 = var35.rest();
        if (module0604.NIL == var35) {
            final SubLObject var39;
            var35 = (var39 = var36);
            return (SubLObject)ConsesLow.list((SubLObject)module0604.$ic21$, (SubLObject)ConsesLow.list(var37, var38), (SubLObject)ConsesLow.list((SubLObject)module0604.$ic22$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0604.$ic23$, var37)), (SubLObject)ConsesLow.listS((SubLObject)module0604.$ic24$, (SubLObject)module0604.$ic25$, ConsesLow.append(var39, (SubLObject)module0604.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var34, (SubLObject)module0604.$ic20$);
        return (SubLObject)module0604.NIL;
    }
    
    public static SubLObject f36893() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0604.NIL;
        SubLObject var4 = (SubLObject)module0604.NIL;
        try {
            var4 = streams_high.make_private_string_output_stream();
            final SubLObject var5 = module0587.$g4457$.currentBinding(var2);
            try {
                module0587.$g4457$.bind(var4, var2);
                try {
                    final SubLObject var25_40 = module0601.$g4652$.currentBinding(var2);
                    final SubLObject var6 = module0601.$g4654$.currentBinding(var2);
                    try {
                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                        module0601.f36758((SubLObject)module0604.$ic26$, module0604.$g4672$.getGlobalValue(), (SubLObject)module0604.NIL, (SubLObject)module0604.NIL);
                        final SubLObject var25_41 = module0601.$g4652$.currentBinding(var2);
                        final SubLObject var41_43 = module0601.$g4654$.currentBinding(var2);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                            module0601.f36758((SubLObject)module0604.$ic27$, (SubLObject)module0604.NIL, (SubLObject)module0604.T, (SubLObject)module0604.NIL);
                        }
                        finally {
                            module0601.$g4654$.rebind(var41_43, var2);
                            module0601.$g4652$.rebind(var25_41, var2);
                        }
                    }
                    finally {
                        module0601.$g4654$.rebind(var6, var2);
                        module0601.$g4652$.rebind(var25_40, var2);
                    }
                }
                finally {
                    final SubLObject var25_42 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0604.T, var2);
                        module0601.f36746();
                        module0601.f36760((SubLObject)module0604.$ic26$);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var25_42, var2);
                    }
                }
            }
            finally {
                module0587.$g4457$.rebind(var5, var2);
            }
            var3 = streams_high.get_output_stream_string(var4);
        }
        finally {
            final SubLObject var7 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0604.T, var2);
                streams_high.close(var4, (SubLObject)module0604.UNPROVIDED);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var7, var2);
            }
        }
        return var3;
    }
    
    public static SubLObject f36900(final SubLObject var7, SubLObject var8, SubLObject var9) {
        if (var8 == module0604.UNPROVIDED) {
            var8 = module0604.$g4669$.getGlobalValue();
        }
        if (var9 == module0604.UNPROVIDED) {
            var9 = module0604.$g4670$.getGlobalValue();
        }
        final SubLThread var10 = SubLProcess.currentSubLThread();
        final SubLObject var11 = f36918(var7, var8, var9);
        SubLObject var12 = (SubLObject)module0604.NIL;
        SubLObject var13 = (SubLObject)module0604.NIL;
        try {
            var13 = streams_high.make_private_string_output_stream();
            final SubLObject var14 = module0587.$g4457$.currentBinding(var10);
            try {
                module0587.$g4457$.bind(var13, var10);
                try {
                    final SubLObject var25_46 = module0601.$g4652$.currentBinding(var10);
                    final SubLObject var15 = module0601.$g4654$.currentBinding(var10);
                    try {
                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var10), module0601.$g4652$.getDynamicValue(var10)), var10);
                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var10), var10);
                        module0601.f36758((SubLObject)module0604.$ic26$, module0604.$g4672$.getGlobalValue(), (SubLObject)module0604.NIL, (SubLObject)module0604.NIL);
                        final SubLObject var25_47 = module0601.$g4652$.currentBinding(var10);
                        final SubLObject var41_48 = module0601.$g4654$.currentBinding(var10);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var10), module0601.$g4652$.getDynamicValue(var10)), var10);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var10), var10);
                            module0601.f36758((SubLObject)module0604.$ic28$, var11, (SubLObject)module0604.T, (SubLObject)module0604.NIL);
                        }
                        finally {
                            module0601.$g4654$.rebind(var41_48, var10);
                            module0601.$g4652$.rebind(var25_47, var10);
                        }
                    }
                    finally {
                        module0601.$g4654$.rebind(var15, var10);
                        module0601.$g4652$.rebind(var25_46, var10);
                    }
                }
                finally {
                    final SubLObject var25_48 = Threads.$is_thread_performing_cleanupP$.currentBinding(var10);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0604.T, var10);
                        module0601.f36746();
                        module0601.f36760((SubLObject)module0604.$ic26$);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var25_48, var10);
                    }
                }
            }
            finally {
                module0587.$g4457$.rebind(var14, var10);
            }
            var12 = streams_high.get_output_stream_string(var13);
        }
        finally {
            final SubLObject var16 = Threads.$is_thread_performing_cleanupP$.currentBinding(var10);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0604.T, var10);
                streams_high.close(var13, (SubLObject)module0604.UNPROVIDED);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var16, var10);
            }
        }
        return var12;
    }
    
    public static SubLObject f36902(final SubLObject var7, SubLObject var8, SubLObject var9) {
        if (var8 == module0604.UNPROVIDED) {
            var8 = module0604.$g4669$.getGlobalValue();
        }
        if (var9 == module0604.UNPROVIDED) {
            var9 = module0604.$g4670$.getGlobalValue();
        }
        final SubLThread var10 = SubLProcess.currentSubLThread();
        final SubLObject var11 = f36918(var7, var8, var9);
        SubLObject var12 = (SubLObject)module0604.NIL;
        SubLObject var13 = (SubLObject)module0604.NIL;
        try {
            var13 = streams_high.make_private_string_output_stream();
            final SubLObject var14 = module0587.$g4457$.currentBinding(var10);
            try {
                module0587.$g4457$.bind(var13, var10);
                try {
                    final SubLObject var25_50 = module0601.$g4652$.currentBinding(var10);
                    final SubLObject var15 = module0601.$g4654$.currentBinding(var10);
                    try {
                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var10), module0601.$g4652$.getDynamicValue(var10)), var10);
                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var10), var10);
                        module0601.f36758((SubLObject)module0604.$ic26$, module0604.$g4672$.getGlobalValue(), (SubLObject)module0604.NIL, (SubLObject)module0604.NIL);
                        final SubLObject var25_51 = module0601.$g4652$.currentBinding(var10);
                        final SubLObject var41_52 = module0601.$g4654$.currentBinding(var10);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var10), module0601.$g4652$.getDynamicValue(var10)), var10);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var10), var10);
                            module0601.f36758((SubLObject)module0604.$ic29$, var11, (SubLObject)module0604.T, (SubLObject)module0604.NIL);
                        }
                        finally {
                            module0601.$g4654$.rebind(var41_52, var10);
                            module0601.$g4652$.rebind(var25_51, var10);
                        }
                    }
                    finally {
                        module0601.$g4654$.rebind(var15, var10);
                        module0601.$g4652$.rebind(var25_50, var10);
                    }
                }
                finally {
                    final SubLObject var25_52 = Threads.$is_thread_performing_cleanupP$.currentBinding(var10);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0604.T, var10);
                        module0601.f36746();
                        module0601.f36760((SubLObject)module0604.$ic26$);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var25_52, var10);
                    }
                }
            }
            finally {
                module0587.$g4457$.rebind(var14, var10);
            }
            var12 = streams_high.get_output_stream_string(var13);
        }
        finally {
            final SubLObject var16 = Threads.$is_thread_performing_cleanupP$.currentBinding(var10);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0604.T, var10);
                streams_high.close(var13, (SubLObject)module0604.UNPROVIDED);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var16, var10);
            }
        }
        return var12;
    }
    
    public static SubLObject f36904(final SubLObject var7, final SubLObject var38) {
        final SubLThread var39 = SubLProcess.currentSubLThread();
        final SubLObject var40 = f36919(var7);
        SubLObject var41 = (SubLObject)module0604.NIL;
        SubLObject var42 = (SubLObject)module0604.NIL;
        try {
            var42 = streams_high.make_private_string_output_stream();
            final SubLObject var43 = module0587.$g4457$.currentBinding(var39);
            try {
                module0587.$g4457$.bind(var42, var39);
                try {
                    final SubLObject var25_54 = module0601.$g4652$.currentBinding(var39);
                    final SubLObject var44 = module0601.$g4654$.currentBinding(var39);
                    try {
                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var39), module0601.$g4652$.getDynamicValue(var39)), var39);
                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var39), var39);
                        module0601.f36758((SubLObject)module0604.$ic26$, module0604.$g4672$.getGlobalValue(), (SubLObject)module0604.NIL, (SubLObject)module0604.NIL);
                        try {
                            final SubLObject var25_55 = module0601.$g4652$.currentBinding(var39);
                            final SubLObject var41_56 = module0601.$g4654$.currentBinding(var39);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var39), module0601.$g4652$.getDynamicValue(var39)), var39);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var39), var39);
                                module0601.f36758((SubLObject)module0604.$ic30$, var40, (SubLObject)module0604.NIL, (SubLObject)module0604.NIL);
                                module0601.f36762(var38, (SubLObject)module0604.UNPROVIDED);
                            }
                            finally {
                                module0601.$g4654$.rebind(var41_56, var39);
                                module0601.$g4652$.rebind(var25_55, var39);
                            }
                        }
                        finally {
                            final SubLObject var25_56 = Threads.$is_thread_performing_cleanupP$.currentBinding(var39);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0604.T, var39);
                                module0601.f36760((SubLObject)module0604.$ic30$);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var25_56, var39);
                            }
                        }
                    }
                    finally {
                        module0601.$g4654$.rebind(var44, var39);
                        module0601.$g4652$.rebind(var25_54, var39);
                    }
                }
                finally {
                    final SubLObject var25_57 = Threads.$is_thread_performing_cleanupP$.currentBinding(var39);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0604.T, var39);
                        module0601.f36746();
                        module0601.f36760((SubLObject)module0604.$ic26$);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var25_57, var39);
                    }
                }
            }
            finally {
                module0587.$g4457$.rebind(var43, var39);
            }
            var41 = streams_high.get_output_stream_string(var42);
        }
        finally {
            final SubLObject var45 = Threads.$is_thread_performing_cleanupP$.currentBinding(var39);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0604.T, var39);
                streams_high.close(var42, (SubLObject)module0604.UNPROVIDED);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var45, var39);
            }
        }
        return var41;
    }
    
    public static SubLObject f36920() {
        final SubLObject var59 = module0604.$g4673$.getGlobalValue();
        if (module0604.NIL != var59) {
            module0034.f1818(var59);
        }
        return (SubLObject)module0604.NIL;
    }
    
    public static SubLObject f36921(final SubLObject var7) {
        return module0034.f1829(module0604.$g4673$.getGlobalValue(), (SubLObject)ConsesLow.list(var7), (SubLObject)module0604.UNPROVIDED, (SubLObject)module0604.UNPROVIDED);
    }
    
    public static SubLObject f36922(final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        final SubLObject var9 = f36919(var7);
        SubLObject var10 = (SubLObject)module0604.NIL;
        SubLObject var11 = (SubLObject)module0604.NIL;
        SubLObject var12 = (SubLObject)module0604.NIL;
        try {
            var12 = streams_high.make_private_string_output_stream();
            final SubLObject var13 = module0587.$g4457$.currentBinding(var8);
            try {
                module0587.$g4457$.bind(var12, var8);
                try {
                    final SubLObject var25_61 = module0601.$g4652$.currentBinding(var8);
                    final SubLObject var14 = module0601.$g4654$.currentBinding(var8);
                    try {
                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var8), module0601.$g4652$.getDynamicValue(var8)), var8);
                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var8), var8);
                        module0601.f36758((SubLObject)module0604.$ic26$, module0604.$g4672$.getGlobalValue(), (SubLObject)module0604.NIL, (SubLObject)module0604.NIL);
                        try {
                            final SubLObject var25_62 = module0601.$g4652$.currentBinding(var8);
                            final SubLObject var41_63 = module0601.$g4654$.currentBinding(var8);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var8), module0601.$g4652$.getDynamicValue(var8)), var8);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var8), var8);
                                module0601.f36758((SubLObject)module0604.$ic30$, var9, (SubLObject)module0604.NIL, (SubLObject)module0604.NIL);
                                var10 = streams_high.file_position(module0587.$g4457$.getDynamicValue(var8), (SubLObject)module0604.UNPROVIDED);
                            }
                            finally {
                                module0601.$g4654$.rebind(var41_63, var8);
                                module0601.$g4652$.rebind(var25_62, var8);
                            }
                        }
                        finally {
                            final SubLObject var25_63 = Threads.$is_thread_performing_cleanupP$.currentBinding(var8);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0604.T, var8);
                                module0601.f36760((SubLObject)module0604.$ic30$);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var25_63, var8);
                            }
                        }
                    }
                    finally {
                        module0601.$g4654$.rebind(var14, var8);
                        module0601.$g4652$.rebind(var25_61, var8);
                    }
                }
                finally {
                    final SubLObject var25_64 = Threads.$is_thread_performing_cleanupP$.currentBinding(var8);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0604.T, var8);
                        module0601.f36746();
                        module0601.f36760((SubLObject)module0604.$ic26$);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var25_64, var8);
                    }
                }
            }
            finally {
                module0587.$g4457$.rebind(var13, var8);
            }
            var11 = streams_high.get_output_stream_string(var12);
        }
        finally {
            final SubLObject var15 = Threads.$is_thread_performing_cleanupP$.currentBinding(var8);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0604.T, var8);
                streams_high.close(var12, (SubLObject)module0604.UNPROVIDED);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var15, var8);
            }
        }
        return (SubLObject)ConsesLow.list(module0038.f2623(var11, (SubLObject)module0604.ZERO_INTEGER, var10), module0038.f2623(var11, var10, (SubLObject)module0604.UNPROVIDED));
    }
    
    public static SubLObject f36906(final SubLObject var7) {
        SubLObject var8 = module0604.$g4673$.getGlobalValue();
        if (module0604.NIL == var8) {
            var8 = module0034.f1934((SubLObject)module0604.$ic31$, (SubLObject)module0604.$ic32$, (SubLObject)module0604.TWENTY_INTEGER, (SubLObject)module0604.EQUAL, (SubLObject)module0604.ONE_INTEGER, (SubLObject)module0604.ZERO_INTEGER);
        }
        SubLObject var9 = module0034.f1814(var8, var7, (SubLObject)module0604.$ic33$);
        if (var9 == module0604.$ic33$) {
            var9 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f36922(var7)));
            module0034.f1816(var8, var7, var9, (SubLObject)module0604.UNPROVIDED);
        }
        return module0034.f1959(var9);
    }
    
    public static SubLObject f36908(final SubLObject var7, SubLObject var8, SubLObject var9) {
        if (var8 == module0604.UNPROVIDED) {
            var8 = module0604.$g4669$.getGlobalValue();
        }
        if (var9 == module0604.UNPROVIDED) {
            var9 = module0604.$g4670$.getGlobalValue();
        }
        final SubLThread var10 = SubLProcess.currentSubLThread();
        final SubLObject var11 = f36918(var7, var8, var9);
        SubLObject var12 = (SubLObject)module0604.NIL;
        SubLObject var13 = (SubLObject)module0604.NIL;
        try {
            var13 = streams_high.make_private_string_output_stream();
            final SubLObject var14 = module0587.$g4457$.currentBinding(var10);
            try {
                module0587.$g4457$.bind(var13, var10);
                try {
                    final SubLObject var25_68 = module0601.$g4652$.currentBinding(var10);
                    final SubLObject var15 = module0601.$g4654$.currentBinding(var10);
                    try {
                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var10), module0601.$g4652$.getDynamicValue(var10)), var10);
                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var10), var10);
                        module0601.f36758((SubLObject)module0604.$ic26$, module0604.$g4672$.getGlobalValue(), (SubLObject)module0604.NIL, (SubLObject)module0604.NIL);
                        final SubLObject var25_69 = module0601.$g4652$.currentBinding(var10);
                        final SubLObject var41_70 = module0601.$g4654$.currentBinding(var10);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var10), module0601.$g4652$.getDynamicValue(var10)), var10);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var10), var10);
                            module0601.f36758((SubLObject)module0604.$ic34$, var11, (SubLObject)module0604.T, (SubLObject)module0604.NIL);
                        }
                        finally {
                            module0601.$g4654$.rebind(var41_70, var10);
                            module0601.$g4652$.rebind(var25_69, var10);
                        }
                    }
                    finally {
                        module0601.$g4654$.rebind(var15, var10);
                        module0601.$g4652$.rebind(var25_68, var10);
                    }
                }
                finally {
                    final SubLObject var25_70 = Threads.$is_thread_performing_cleanupP$.currentBinding(var10);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0604.T, var10);
                        module0601.f36746();
                        module0601.f36760((SubLObject)module0604.$ic26$);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var25_70, var10);
                    }
                }
            }
            finally {
                module0587.$g4457$.rebind(var14, var10);
            }
            var12 = streams_high.get_output_stream_string(var13);
        }
        finally {
            final SubLObject var16 = Threads.$is_thread_performing_cleanupP$.currentBinding(var10);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0604.T, var10);
                streams_high.close(var13, (SubLObject)module0604.UNPROVIDED);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var16, var10);
            }
        }
        return var12;
    }
    
    public static SubLObject f36911(final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        final SubLObject var9 = f36919(var7);
        SubLObject var10 = (SubLObject)module0604.NIL;
        SubLObject var11 = (SubLObject)module0604.NIL;
        try {
            var11 = streams_high.make_private_string_output_stream();
            final SubLObject var12 = module0587.$g4457$.currentBinding(var8);
            try {
                module0587.$g4457$.bind(var11, var8);
                try {
                    final SubLObject var25_72 = module0601.$g4652$.currentBinding(var8);
                    final SubLObject var13 = module0601.$g4654$.currentBinding(var8);
                    try {
                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var8), module0601.$g4652$.getDynamicValue(var8)), var8);
                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var8), var8);
                        module0601.f36758((SubLObject)module0604.$ic26$, module0604.$g4672$.getGlobalValue(), (SubLObject)module0604.NIL, (SubLObject)module0604.NIL);
                        final SubLObject var25_73 = module0601.$g4652$.currentBinding(var8);
                        final SubLObject var41_74 = module0601.$g4654$.currentBinding(var8);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var8), module0601.$g4652$.getDynamicValue(var8)), var8);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var8), var8);
                            module0601.f36758((SubLObject)module0604.$ic35$, var9, (SubLObject)module0604.T, (SubLObject)module0604.NIL);
                        }
                        finally {
                            module0601.$g4654$.rebind(var41_74, var8);
                            module0601.$g4652$.rebind(var25_73, var8);
                        }
                    }
                    finally {
                        module0601.$g4654$.rebind(var13, var8);
                        module0601.$g4652$.rebind(var25_72, var8);
                    }
                }
                finally {
                    final SubLObject var25_74 = Threads.$is_thread_performing_cleanupP$.currentBinding(var8);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0604.T, var8);
                        module0601.f36746();
                        module0601.f36760((SubLObject)module0604.$ic26$);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var25_74, var8);
                    }
                }
            }
            finally {
                module0587.$g4457$.rebind(var12, var8);
            }
            var10 = streams_high.get_output_stream_string(var11);
        }
        finally {
            final SubLObject var14 = Threads.$is_thread_performing_cleanupP$.currentBinding(var8);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0604.T, var8);
                streams_high.close(var11, (SubLObject)module0604.UNPROVIDED);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var14, var8);
            }
        }
        return var10;
    }
    
    public static SubLObject f36896() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0604.NIL;
        SubLObject var4 = (SubLObject)module0604.NIL;
        try {
            var4 = streams_high.make_private_string_output_stream();
            final SubLObject var5 = module0587.$g4457$.currentBinding(var2);
            try {
                module0587.$g4457$.bind(var4, var2);
                try {
                    final SubLObject var25_76 = module0601.$g4652$.currentBinding(var2);
                    final SubLObject var6 = module0601.$g4654$.currentBinding(var2);
                    try {
                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                        module0601.f36758((SubLObject)module0604.$ic26$, module0604.$g4672$.getGlobalValue(), (SubLObject)module0604.NIL, (SubLObject)module0604.NIL);
                        final SubLObject var25_77 = module0601.$g4652$.currentBinding(var2);
                        final SubLObject var41_78 = module0601.$g4654$.currentBinding(var2);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                            module0601.f36758((SubLObject)module0604.$ic36$, (SubLObject)module0604.NIL, (SubLObject)module0604.T, (SubLObject)module0604.NIL);
                        }
                        finally {
                            module0601.$g4654$.rebind(var41_78, var2);
                            module0601.$g4652$.rebind(var25_77, var2);
                        }
                    }
                    finally {
                        module0601.$g4654$.rebind(var6, var2);
                        module0601.$g4652$.rebind(var25_76, var2);
                    }
                }
                finally {
                    final SubLObject var25_78 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0604.T, var2);
                        module0601.f36746();
                        module0601.f36760((SubLObject)module0604.$ic26$);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var25_78, var2);
                    }
                }
            }
            finally {
                module0587.$g4457$.rebind(var5, var2);
            }
            var3 = streams_high.get_output_stream_string(var4);
        }
        finally {
            final SubLObject var7 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0604.T, var2);
                streams_high.close(var4, (SubLObject)module0604.UNPROVIDED);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var7, var2);
            }
        }
        return var3;
    }
    
    public static SubLObject f36913(final SubLObject var18, final SubLObject var19, final SubLObject var80) {
        final SubLThread var81 = SubLProcess.currentSubLThread();
        final SubLObject var82 = module0075.f5276(var80);
        final SubLObject var83 = f36923(var18, var19);
        SubLObject var84 = (SubLObject)module0604.NIL;
        SubLObject var85 = (SubLObject)module0604.NIL;
        try {
            var85 = streams_high.make_private_string_output_stream();
            final SubLObject var86 = module0587.$g4457$.currentBinding(var81);
            try {
                module0587.$g4457$.bind(var85, var81);
                try {
                    final SubLObject var25_81 = module0601.$g4652$.currentBinding(var81);
                    final SubLObject var87 = module0601.$g4654$.currentBinding(var81);
                    try {
                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var81), module0601.$g4652$.getDynamicValue(var81)), var81);
                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var81), var81);
                        module0601.f36758((SubLObject)module0604.$ic26$, module0604.$g4672$.getGlobalValue(), (SubLObject)module0604.NIL, (SubLObject)module0604.NIL);
                        try {
                            final SubLObject var25_82 = module0601.$g4652$.currentBinding(var81);
                            final SubLObject var41_83 = module0601.$g4654$.currentBinding(var81);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var81), module0601.$g4652$.getDynamicValue(var81)), var81);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var81), var81);
                                module0601.f36758((SubLObject)module0604.$ic37$, var83, (SubLObject)module0604.NIL, (SubLObject)module0604.NIL);
                                try {
                                    final SubLObject var25_83 = module0601.$g4652$.currentBinding(var81);
                                    final SubLObject var41_84 = module0601.$g4654$.currentBinding(var81);
                                    try {
                                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var81), module0601.$g4652$.getDynamicValue(var81)), var81);
                                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var81), var81);
                                        module0601.f36758((SubLObject)module0604.$ic38$, (SubLObject)module0604.NIL, (SubLObject)module0604.NIL, (SubLObject)module0604.NIL);
                                        streams_high.write_string(var82, module0587.$g4457$.getDynamicValue(var81), (SubLObject)module0604.UNPROVIDED, (SubLObject)module0604.UNPROVIDED);
                                    }
                                    finally {
                                        module0601.$g4654$.rebind(var41_84, var81);
                                        module0601.$g4652$.rebind(var25_83, var81);
                                    }
                                }
                                finally {
                                    final SubLObject var25_84 = Threads.$is_thread_performing_cleanupP$.currentBinding(var81);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0604.T, var81);
                                        module0601.f36760((SubLObject)module0604.$ic38$);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var25_84, var81);
                                    }
                                }
                            }
                            finally {
                                module0601.$g4654$.rebind(var41_83, var81);
                                module0601.$g4652$.rebind(var25_82, var81);
                            }
                        }
                        finally {
                            final SubLObject var25_85 = Threads.$is_thread_performing_cleanupP$.currentBinding(var81);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0604.T, var81);
                                module0601.f36746();
                                module0601.f36760((SubLObject)module0604.$ic37$);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var25_85, var81);
                            }
                        }
                    }
                    finally {
                        module0601.$g4654$.rebind(var87, var81);
                        module0601.$g4652$.rebind(var25_81, var81);
                    }
                }
                finally {
                    final SubLObject var25_86 = Threads.$is_thread_performing_cleanupP$.currentBinding(var81);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0604.T, var81);
                        module0601.f36746();
                        module0601.f36760((SubLObject)module0604.$ic26$);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var25_86, var81);
                    }
                }
            }
            finally {
                module0587.$g4457$.rebind(var86, var81);
            }
            var84 = streams_high.get_output_stream_string(var85);
        }
        finally {
            final SubLObject var88 = Threads.$is_thread_performing_cleanupP$.currentBinding(var81);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0604.T, var81);
                streams_high.close(var85, (SubLObject)module0604.UNPROVIDED);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var88, var81);
            }
        }
        return var84;
    }
    
    public static SubLObject f36915(final SubLObject var18, final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        final SubLObject var21 = f36923(var18, var19);
        SubLObject var22 = (SubLObject)module0604.NIL;
        SubLObject var23 = (SubLObject)module0604.NIL;
        try {
            var23 = streams_high.make_private_string_output_stream();
            final SubLObject var24 = module0587.$g4457$.currentBinding(var20);
            try {
                module0587.$g4457$.bind(var23, var20);
                try {
                    final SubLObject var25_89 = module0601.$g4652$.currentBinding(var20);
                    final SubLObject var25 = module0601.$g4654$.currentBinding(var20);
                    try {
                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var20), module0601.$g4652$.getDynamicValue(var20)), var20);
                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var20), var20);
                        module0601.f36758((SubLObject)module0604.$ic26$, module0604.$g4672$.getGlobalValue(), (SubLObject)module0604.NIL, (SubLObject)module0604.NIL);
                        final SubLObject var25_90 = module0601.$g4652$.currentBinding(var20);
                        final SubLObject var41_91 = module0601.$g4654$.currentBinding(var20);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var20), module0601.$g4652$.getDynamicValue(var20)), var20);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var20), var20);
                            module0601.f36758((SubLObject)module0604.$ic39$, var21, (SubLObject)module0604.T, (SubLObject)module0604.NIL);
                        }
                        finally {
                            module0601.$g4654$.rebind(var41_91, var20);
                            module0601.$g4652$.rebind(var25_90, var20);
                        }
                    }
                    finally {
                        module0601.$g4654$.rebind(var25, var20);
                        module0601.$g4652$.rebind(var25_89, var20);
                    }
                }
                finally {
                    final SubLObject var25_91 = Threads.$is_thread_performing_cleanupP$.currentBinding(var20);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0604.T, var20);
                        module0601.f36746();
                        module0601.f36760((SubLObject)module0604.$ic26$);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var25_91, var20);
                    }
                }
            }
            finally {
                module0587.$g4457$.rebind(var24, var20);
            }
            var22 = streams_high.get_output_stream_string(var23);
        }
        finally {
            final SubLObject var26 = Threads.$is_thread_performing_cleanupP$.currentBinding(var20);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0604.T, var20);
                streams_high.close(var23, (SubLObject)module0604.UNPROVIDED);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var26, var20);
            }
        }
        return var22;
    }
    
    public static SubLObject f36918(final SubLObject var7, SubLObject var8, SubLObject var9) {
        if (var8 == module0604.UNPROVIDED) {
            var8 = module0604.$g4669$.getGlobalValue();
        }
        if (var9 == module0604.UNPROVIDED) {
            var9 = module0604.$g4670$.getGlobalValue();
        }
        return ConsesLow.append(f36919(var7), f36924(var8, var9));
    }
    
    public static SubLObject f36919(final SubLObject var7) {
        return (SubLObject)ConsesLow.list((SubLObject)module0604.$ic40$, var7);
    }
    
    public static SubLObject f36924(SubLObject var8, SubLObject var9) {
        if (var8 == module0604.UNPROVIDED) {
            var8 = module0604.$g4669$.getGlobalValue();
        }
        if (var9 == module0604.UNPROVIDED) {
            var9 = module0604.$g4670$.getGlobalValue();
        }
        return (SubLObject)ConsesLow.list((SubLObject)module0604.$ic41$, var8, (SubLObject)module0604.$ic42$, var9);
    }
    
    public static SubLObject f36923(final SubLObject var18, final SubLObject var19) {
        return (SubLObject)ConsesLow.list((SubLObject)module0604.$ic43$, var18, (SubLObject)module0604.$ic44$, var19);
    }
    
    public static SubLObject f36925(final SubLObject var7, SubLObject var8, SubLObject var9) {
        if (var8 == module0604.UNPROVIDED) {
            var8 = module0604.$g4669$.getGlobalValue();
        }
        if (var9 == module0604.UNPROVIDED) {
            var9 = module0604.$g4670$.getGlobalValue();
        }
        return module0052.f3689(f36926(var7, var8, var9), (SubLObject)module0604.$ic45$, (SubLObject)module0604.$ic46$, (SubLObject)module0604.UNPROVIDED);
    }
    
    public static SubLObject f36926(final SubLObject var7, final SubLObject var8, final SubLObject var9) {
        final SubLObject var10 = (SubLObject)module0604.NIL;
        return (SubLObject)ConsesLow.list(var7, var8, var9, var10);
    }
    
    public static SubLObject f36927(final SubLObject var94) {
        final SubLObject var95 = ConsesLow.nth((SubLObject)module0604.THREE_INTEGER, var94);
        return var95;
    }
    
    public static SubLObject f36928(final SubLObject var94) {
        SubLObject var95 = (SubLObject)module0604.NIL;
        SubLObject var96 = (SubLObject)module0604.NIL;
        SubLObject var97 = (SubLObject)module0604.NIL;
        SubLObject var98 = (SubLObject)module0604.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var94, var94, (SubLObject)module0604.$ic47$);
        var95 = var94.first();
        SubLObject var99 = var94.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var99, var94, (SubLObject)module0604.$ic47$);
        var96 = var99.first();
        var99 = var99.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var99, var94, (SubLObject)module0604.$ic47$);
        var97 = var99.first();
        var99 = var99.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var99, var94, (SubLObject)module0604.$ic47$);
        var98 = var99.first();
        var99 = var99.rest();
        if (module0604.NIL != var99) {
            cdestructuring_bind.cdestructuring_bind_error(var94, (SubLObject)module0604.$ic47$);
            return (SubLObject)module0604.NIL;
        }
        final SubLObject var100 = f36907(var95, var96, var97);
        if (module0604.NIL == var100 || module0604.NIL != f36889(var100)) {
            var98 = (SubLObject)module0604.T;
            ConsesLow.set_nth((SubLObject)module0604.THREE_INTEGER, var94, var98);
            return Values.values((SubLObject)module0604.NIL, var94, (SubLObject)module0604.T);
        }
        return Values.values(f36909(var100, (SubLObject)module0604.UNPROVIDED), var94, (SubLObject)module0604.NIL);
    }
    
    public static SubLObject f36929(final SubLObject var7, SubLObject var8, SubLObject var9) {
        if (var8 == module0604.UNPROVIDED) {
            var8 = module0604.$g4669$.getGlobalValue();
        }
        if (var9 == module0604.UNPROVIDED) {
            var9 = module0604.$g4670$.getGlobalValue();
        }
        return module0083.f5696(f36930(var7, var8, var9), (SubLObject)module0604.$ic48$, (SubLObject)module0604.$ic49$, (SubLObject)module0604.$ic50$, (SubLObject)module0604.$ic51$, (SubLObject)module0604.$ic52$, (SubLObject)module0604.UNPROVIDED);
    }
    
    public static SubLObject f36930(final SubLObject var7, final SubLObject var8, final SubLObject var9) {
        return (SubLObject)ConsesLow.list(var7, var8, var9, (SubLObject)module0604.ZERO_INTEGER);
    }
    
    public static SubLObject f36931(final SubLObject var94) {
        SubLObject var95 = (SubLObject)module0604.NIL;
        SubLObject var96 = (SubLObject)module0604.NIL;
        SubLObject var97 = (SubLObject)module0604.NIL;
        SubLObject var98 = (SubLObject)module0604.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var94, var94, (SubLObject)module0604.$ic53$);
        var95 = var94.first();
        SubLObject var99 = var94.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var99, var94, (SubLObject)module0604.$ic53$);
        var96 = var99.first();
        var99 = var99.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var99, var94, (SubLObject)module0604.$ic53$);
        var97 = var99.first();
        var99 = var99.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var99, var94, (SubLObject)module0604.$ic53$);
        var98 = var99.first();
        var99 = var99.rest();
        if (module0604.NIL == var99) {
            return f36930(var95, var96, var97);
        }
        cdestructuring_bind.cdestructuring_bind_error(var94, (SubLObject)module0604.$ic53$);
        return (SubLObject)module0604.NIL;
    }
    
    public static SubLObject f36932(final SubLObject var94, final SubLObject var10) {
        enforceType(var10, module0604.$ic12$);
        SubLObject var95 = (SubLObject)module0604.NIL;
        SubLObject var96 = (SubLObject)module0604.NIL;
        SubLObject var97 = (SubLObject)module0604.NIL;
        SubLObject var98 = (SubLObject)module0604.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var94, var94, (SubLObject)module0604.$ic53$);
        var95 = var94.first();
        SubLObject var99 = var94.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var99, var94, (SubLObject)module0604.$ic53$);
        var96 = var99.first();
        var99 = var99.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var99, var94, (SubLObject)module0604.$ic53$);
        var97 = var99.first();
        var99 = var99.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var99, var94, (SubLObject)module0604.$ic53$);
        var98 = var99.first();
        var99 = var99.rest();
        if (module0604.NIL == var99) {
            final SubLObject var100 = f36903(var95, var10);
            if (module0604.NIL != module0035.sublisp_boolean(var100)) {
                var98 = Numbers.add(var98, (SubLObject)module0604.ONE_INTEGER);
                ConsesLow.set_nth((SubLObject)module0604.THREE_INTEGER, var94, var98);
            }
            else {
                Errors.error((SubLObject)module0604.$ic54$, var10, var95);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var94, (SubLObject)module0604.$ic53$);
        }
        return var94;
    }
    
    public static SubLObject f36933(final SubLObject var94) {
        return ConsesLow.nth((SubLObject)module0604.THREE_INTEGER, var94);
    }
    
    public static SubLObject f36934(final SubLObject var94) {
        return (SubLObject)(f36933(var94).isZero() ? module0604.ZERO_INTEGER : module0604.ONE_INTEGER);
    }
    
    public static SubLObject f36935(final SubLObject var94, SubLObject var103) {
        if (var103 == module0604.UNPROVIDED) {
            var103 = (SubLObject)module0604.NIL;
        }
        SubLObject var104 = (SubLObject)module0604.NIL;
        SubLObject var105 = (SubLObject)module0604.NIL;
        SubLObject var106 = (SubLObject)module0604.NIL;
        SubLObject var107 = (SubLObject)module0604.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var94, var94, (SubLObject)module0604.$ic53$);
        var104 = var94.first();
        SubLObject var108 = var94.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var108, var94, (SubLObject)module0604.$ic53$);
        var105 = var108.first();
        var108 = var108.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var108, var94, (SubLObject)module0604.$ic53$);
        var106 = var108.first();
        var108 = var108.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var108, var94, (SubLObject)module0604.$ic53$);
        var107 = var108.first();
        var108 = var108.rest();
        if (module0604.NIL == var108) {
            return Values.values(var107, (module0604.NIL != var103) ? f36930(var104, var105, var106) : var94);
        }
        cdestructuring_bind.cdestructuring_bind_error(var94, (SubLObject)module0604.$ic53$);
        return (SubLObject)module0604.NIL;
    }
    
    public static SubLObject f36936(final SubLObject var94) {
        final SubLObject var95 = f36933(var94);
        return var95.isZero() ? module0052.f3708() : module0052.f3709((SubLObject)ConsesLow.list(var95));
    }
    
    public static SubLObject f36937(final SubLObject var106, final SubLObject var107, final SubLObject var108, SubLObject var109) {
        if (var109 == module0604.UNPROVIDED) {
            var109 = (SubLObject)module0604.NIL;
        }
        assert module0604.NIL != module0083.f5676(var106) : var106;
        module0083.f5698(var106, f36938(var107, var108, var109));
        return var106;
    }
    
    public static SubLObject f36938(final SubLObject var107, final SubLObject var108, final SubLObject var109) {
        return (SubLObject)ConsesLow.list((SubLObject)module0604.$ic56$, var107, (SubLObject)module0604.$ic57$, var108, (SubLObject)module0604.$ic58$, var109);
    }
    
    public static SubLObject f36939(final SubLObject var32, final SubLObject var33) {
        SubLObject var35;
        final SubLObject var34 = var35 = var32.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var35, var34, (SubLObject)module0604.$ic59$);
        final SubLObject var36 = var35.rest();
        var35 = var35.first();
        SubLObject var37 = (SubLObject)module0604.NIL;
        SubLObject var38 = (SubLObject)module0604.NIL;
        SubLObject var39 = (SubLObject)module0604.NIL;
        SubLObject var40 = (SubLObject)module0604.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var35, var34, (SubLObject)module0604.$ic59$);
        var37 = var35.first();
        var35 = var35.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var35, var34, (SubLObject)module0604.$ic59$);
        var38 = var35.first();
        var35 = var35.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var35, var34, (SubLObject)module0604.$ic59$);
        var39 = var35.first();
        var35 = var35.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var35, var34, (SubLObject)module0604.$ic59$);
        var40 = var35.first();
        var35 = var35.rest();
        final SubLObject var41 = (SubLObject)(var35.isCons() ? var35.first() : module0604.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var35, var34, (SubLObject)module0604.$ic59$);
        var35 = var35.rest();
        if (module0604.NIL == var35) {
            final SubLObject var42;
            var35 = (var42 = var36);
            return (SubLObject)ConsesLow.listS((SubLObject)module0604.$ic22$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var37, (SubLObject)ConsesLow.listS((SubLObject)module0604.$ic60$, var40, (SubLObject)module0604.$ic61$)), (SubLObject)ConsesLow.list(var38, (SubLObject)ConsesLow.listS((SubLObject)module0604.$ic60$, var40, (SubLObject)module0604.$ic62$)), (SubLObject)ConsesLow.list(var39, (SubLObject)ConsesLow.list((SubLObject)module0604.$ic60$, var40, (SubLObject)module0604.$ic58$, var41))), ConsesLow.append(var42, (SubLObject)module0604.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var34, (SubLObject)module0604.$ic59$);
        return (SubLObject)module0604.NIL;
    }
    
    public static SubLObject f36940(final SubLObject var115, SubLObject var116) {
        if (var116 == module0604.UNPROVIDED) {
            var116 = (SubLObject)module0604.NIL;
        }
        final SubLThread var117 = SubLProcess.currentSubLThread();
        SubLObject var120;
        for (SubLObject var118 = (SubLObject)module0604.NIL; module0604.NIL == var118; var118 = (SubLObject)SubLObjectFactory.makeBoolean(module0604.NIL == var120)) {
            var117.resetMultipleValues();
            final SubLObject var119 = module0052.f3693(var115);
            var120 = var117.secondMultipleValue();
            var117.resetMultipleValues();
            if (module0604.NIL != var120) {
                f36941(var119, var116);
            }
        }
        return (SubLObject)module0604.$ic63$;
    }
    
    public static SubLObject f36941(final SubLObject var113, SubLObject var116) {
        if (var116 == module0604.UNPROVIDED) {
            var116 = (SubLObject)module0604.NIL;
        }
        final SubLObject var117 = conses_high.getf(var113, (SubLObject)module0604.$ic56$, (SubLObject)module0604.UNPROVIDED);
        final SubLObject var118 = conses_high.getf(var113, (SubLObject)module0604.$ic57$, (SubLObject)module0604.UNPROVIDED);
        final SubLObject var119 = conses_high.getf(var113, (SubLObject)module0604.$ic58$, var116);
        return module0540.f33516(var117, var118, var119);
    }
    
    public static SubLObject f36942(final SubLObject var119) {
        return module0083.f5749(var119, (SubLObject)module0604.$ic64$, (SubLObject)module0604.UNPROVIDED);
    }
    
    public static SubLObject f36943(final SubLObject var115) {
        return module0052.f3791(var115, (SubLObject)module0604.$ic65$, (SubLObject)module0604.UNPROVIDED);
    }
    
    public static SubLObject f36944(final SubLObject var119, SubLObject var120, SubLObject var121) {
        if (var120 == module0604.UNPROVIDED) {
            var120 = module0604.$g4095$.getGlobalValue();
        }
        if (var121 == module0604.UNPROVIDED) {
            var121 = (SubLObject)module0604.NIL;
        }
        return module0083.f5696(f36945(var119, var120, var121), (SubLObject)module0604.$ic68$, (SubLObject)module0604.$ic69$, (SubLObject)module0604.$ic70$, (SubLObject)module0604.$ic71$, (SubLObject)module0604.$ic72$, (SubLObject)module0604.UNPROVIDED);
    }
    
    public static SubLObject f36945(final SubLObject var106, final SubLObject var120, final SubLObject var121) {
        final SubLObject var122 = module0021.f1031();
        final SubLObject var123 = (SubLObject)module0604.ZERO_INTEGER;
        return (SubLObject)ConsesLow.list(var106, var122, var123, var120, var121);
    }
    
    public static SubLObject f36946(final SubLObject var94) {
        return ConsesLow.nth((SubLObject)module0604.TWO_INTEGER, var94);
    }
    
    public static SubLObject f36947(final SubLObject var94) {
        SubLObject var95 = (SubLObject)module0604.NIL;
        SubLObject var96 = (SubLObject)module0604.NIL;
        SubLObject var97 = (SubLObject)module0604.NIL;
        SubLObject var98 = (SubLObject)module0604.NIL;
        SubLObject var99 = (SubLObject)module0604.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var94, var94, (SubLObject)module0604.$ic73$);
        var95 = var94.first();
        SubLObject var100 = var94.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var100, var94, (SubLObject)module0604.$ic73$);
        var96 = var100.first();
        var100 = var100.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var100, var94, (SubLObject)module0604.$ic73$);
        var97 = var100.first();
        var100 = var100.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var100, var94, (SubLObject)module0604.$ic73$);
        var98 = var100.first();
        var100 = var100.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var100, var94, (SubLObject)module0604.$ic73$);
        var99 = var100.first();
        var100 = var100.rest();
        if (module0604.NIL == var100) {
            module0083.f5697(var95);
            return f36945(var95, var98, var99);
        }
        cdestructuring_bind.cdestructuring_bind_error(var94, (SubLObject)module0604.$ic73$);
        return (SubLObject)module0604.NIL;
    }
    
    public static SubLObject f36948(final SubLObject var94, final SubLObject var1) {
        return f36949(var94, var1, (SubLObject)module0604.UNPROVIDED);
    }
    
    public static SubLObject f36949(final SubLObject var94, final SubLObject var1, SubLObject var125) {
        if (var125 == module0604.UNPROVIDED) {
            var125 = (SubLObject)module0604.NIL;
        }
        SubLObject var126 = (SubLObject)module0604.NIL;
        SubLObject var127 = (SubLObject)module0604.NIL;
        SubLObject var128 = (SubLObject)module0604.NIL;
        SubLObject var129 = (SubLObject)module0604.NIL;
        SubLObject var130 = (SubLObject)module0604.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var94, var94, (SubLObject)module0604.$ic73$);
        var126 = var94.first();
        SubLObject var131 = var94.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var131, var94, (SubLObject)module0604.$ic73$);
        var127 = var131.first();
        var131 = var131.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var131, var94, (SubLObject)module0604.$ic73$);
        var128 = var131.first();
        var131 = var131.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var131, var94, (SubLObject)module0604.$ic73$);
        var129 = var131.first();
        var131 = var131.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var131, var94, (SubLObject)module0604.$ic73$);
        var130 = var131.first();
        var131 = var131.rest();
        if (module0604.NIL == var131) {
            final SubLObject var132 = module0021.f1035(var127);
            final SubLObject var133 = module0021.f1036(var127);
            SubLObject var134 = (SubLObject)module0604.NIL;
            if (module0604.NIL != var130) {
                module0021.f1040(var1, var127);
            }
            else {
                module0021.f1038(var1, var127);
            }
            var134 = module0021.f1036(var127);
            if (var134.numL(var129)) {
                ConsesLow.set_nth((SubLObject)module0604.TWO_INTEGER, var94, Numbers.add((SubLObject)module0604.ONE_INTEGER, var128));
            }
            else {
                if (!var134.numE(var129)) {
                    if (module0604.NIL != var125) {
                        final SubLObject var135 = Numbers.subtract(var134, var133);
                        if (var129.numL(var135)) {
                            Errors.error((SubLObject)module0604.$ic74$, var1, var135, var129);
                        }
                        else {
                            Errors.error((SubLObject)module0604.$ic75$, var1, var135, var129);
                        }
                    }
                    f36951(var126, var127, var132);
                    ConsesLow.set_nth((SubLObject)module0604.ONE_INTEGER, var94, module0021.f1031());
                    var125 = (SubLObject)module0604.T;
                    return f36949(var94, var1, var125);
                }
                f36950(var126, var127);
                ConsesLow.set_nth((SubLObject)module0604.ONE_INTEGER, var94, module0021.f1031());
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var94, (SubLObject)module0604.$ic73$);
        }
        return var94;
    }
    
    public static SubLObject f36952(final SubLObject var94, SubLObject var103) {
        if (var103 == module0604.UNPROVIDED) {
            var103 = (SubLObject)module0604.NIL;
        }
        f36953(var94);
        final SubLObject var104 = var94.first();
        final SubLObject var105 = module0083.f5700(var104, var103);
        return Values.values(var105, (module0604.NIL != var103) ? f36947(var94) : var94);
    }
    
    public static SubLObject f36954(final SubLObject var94) {
        final SubLObject var95 = var94.first();
        return module0083.f5702(var95);
    }
    
    public static SubLObject f36953(final SubLObject var94) {
        final SubLObject var95 = var94.first();
        final SubLObject var96 = conses_high.second(var94);
        if (!module0021.f1036(var96).isZero()) {
            f36950(var95, var96);
        }
        return var94;
    }
    
    public static SubLObject f36950(final SubLObject var106, final SubLObject var37) {
        final SubLObject var107 = module0021.f1035(var37);
        return f36951(var106, var37, var107);
    }
    
    public static SubLObject f36951(final SubLObject var106, final SubLObject var37, final SubLObject var133) {
        SubLObject var134 = module0021.f1029(var37);
        module0021.f1034(var37);
        if (var133.numL(Sequences.length(var134))) {
            var134 = module0038.f2623(var134, (SubLObject)module0604.ZERO_INTEGER, var133);
        }
        module0083.f5698(var106, var134);
        return var106;
    }
    
    public static SubLObject f36955(final SubLObject var135) {
        enforceType(var135, module0604.$ic76$);
        return module0052.f3689(f36956(var135), (SubLObject)module0604.$ic77$, (SubLObject)module0604.$ic78$, (SubLObject)module0604.UNPROVIDED);
    }
    
    public static SubLObject f36956(final SubLObject var136) {
        return (SubLObject)ConsesLow.list(var136, module0052.f3708());
    }
    
    public static SubLObject f36957(final SubLObject var94) {
        SubLObject var95 = (SubLObject)module0604.NIL;
        SubLObject var96 = (SubLObject)module0604.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var94, var94, (SubLObject)module0604.$ic79$);
        var95 = var94.first();
        SubLObject var97 = var94.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var97, var94, (SubLObject)module0604.$ic79$);
        var96 = var97.first();
        var97 = var97.rest();
        if (module0604.NIL == var97) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0604.NIL != module0052.f3687(var96) && module0604.NIL != module0052.f3687(var95));
        }
        cdestructuring_bind.cdestructuring_bind_error(var94, (SubLObject)module0604.$ic79$);
        return (SubLObject)module0604.NIL;
    }
    
    public static SubLObject f36958(final SubLObject var94) {
        final SubLThread var95 = SubLProcess.currentSubLThread();
        SubLObject var96 = (SubLObject)module0604.NIL;
        SubLObject var97 = (SubLObject)module0604.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var94, var94, (SubLObject)module0604.$ic79$);
        var96 = var94.first();
        SubLObject var98 = var94.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var98, var94, (SubLObject)module0604.$ic79$);
        var97 = var98.first();
        var98 = var98.rest();
        if (module0604.NIL != var98) {
            cdestructuring_bind.cdestructuring_bind_error(var94, (SubLObject)module0604.$ic79$);
            return (SubLObject)module0604.NIL;
        }
        var95.resetMultipleValues();
        final SubLObject var99 = module0052.f3693(var97);
        SubLObject var100 = var95.secondMultipleValue();
        var95.resetMultipleValues();
        if (module0604.NIL != var100) {
            return Values.values(var99, var94, (SubLObject)module0604.NIL);
        }
        var95.resetMultipleValues();
        final SubLObject var101 = module0052.f3693(var96);
        var100 = var95.secondMultipleValue();
        var95.resetMultipleValues();
        if (module0604.NIL == var100) {
            return Values.values((SubLObject)module0604.NIL, var94, (SubLObject)module0604.T);
        }
        final SubLObject var102 = f36959(var101);
        ConsesLow.set_nth((SubLObject)module0604.ONE_INTEGER, var94, var102);
        var95.resetMultipleValues();
        final SubLObject var103 = module0052.f3693(var102);
        final SubLObject var143_145 = var95.secondMultipleValue();
        var95.resetMultipleValues();
        return Values.values(var103, var94, (SubLObject)SubLObjectFactory.makeBoolean(module0604.NIL == var143_145));
    }
    
    public static SubLObject f36959(final SubLObject var134) {
        return module0052.f3709(Sequences.nreverse(module0069.f4943(var134)));
    }
    
    public static SubLObject f36960(SubLObject var146) {
        if (var146 == module0604.UNPROVIDED) {
            var146 = (SubLObject)module0604.$ic80$;
        }
        SubLObject var147 = (SubLObject)module0604.NIL;
        SubLObject var148 = (SubLObject)module0604.NIL;
        while (module0604.NIL == var148) {
            var147 = (SubLObject)module0604.T;
            SubLObject var149 = f36895();
            SubLObject var150 = (SubLObject)module0604.NIL;
            var150 = var149.first();
            while (module0604.NIL != var149) {
                final SubLObject var151 = f36898(var150);
                if (!var151.isZero()) {
                    PrintLow.format((SubLObject)module0604.T, (SubLObject)module0604.$ic81$, new SubLObject[] { module0051.f3552((SubLObject)module0604.UNPROVIDED), var150, var151 });
                    var147 = (SubLObject)module0604.NIL;
                }
                var149 = var149.rest();
                var150 = var149.first();
            }
            if (module0604.NIL != var147) {
                var148 = (SubLObject)module0604.T;
            }
            else {
                Threads.sleep(var146);
            }
        }
        return (SubLObject)module0604.$ic82$;
    }
    
    public static SubLObject f36961(SubLObject var150) {
        if (var150 == module0604.UNPROVIDED) {
            var150 = f36895();
        }
        final SubLThread var151 = SubLProcess.currentSubLThread();
        SubLObject var152 = (SubLObject)module0604.NIL;
        SubLObject var153 = var150;
        SubLObject var154 = (SubLObject)module0604.NIL;
        var154 = var153.first();
        while (module0604.NIL != var153) {
            if (module0604.NIL != f36897(var154)) {
                var152 = (SubLObject)ConsesLow.cons(var154, var152);
                SubLObject var155 = (SubLObject)module0604.ZERO_INTEGER;
                final SubLObject var156 = f36925(var154, (SubLObject)module0604.UNPROVIDED, (SubLObject)module0604.UNPROVIDED);
                module0006.f218((SubLObject)module0604.T, (SubLObject)module0604.$ic83$, module0051.f3552((SubLObject)module0604.UNPROVIDED), f36898(var154), var154, (SubLObject)module0604.UNPROVIDED, (SubLObject)module0604.UNPROVIDED, (SubLObject)module0604.UNPROVIDED, (SubLObject)module0604.UNPROVIDED, (SubLObject)module0604.UNPROVIDED);
                SubLObject var159;
                for (SubLObject var157 = (SubLObject)module0604.NIL; module0604.NIL == var157; var157 = (SubLObject)SubLObjectFactory.makeBoolean(module0604.NIL == var159)) {
                    var151.resetMultipleValues();
                    final SubLObject var158 = module0052.f3693(var156);
                    var159 = var151.secondMultipleValue();
                    var151.resetMultipleValues();
                    if (module0604.NIL != var159) {
                        var155 = Numbers.add(var155, (SubLObject)module0604.ONE_INTEGER);
                    }
                }
                module0006.f218((SubLObject)module0604.T, (SubLObject)module0604.$ic84$, module0051.f3552((SubLObject)module0604.UNPROVIDED), var155, var154, (SubLObject)module0604.UNPROVIDED, (SubLObject)module0604.UNPROVIDED, (SubLObject)module0604.UNPROVIDED, (SubLObject)module0604.UNPROVIDED, (SubLObject)module0604.UNPROVIDED);
            }
            var153 = var153.rest();
            var154 = var153.first();
        }
        return Sequences.nreverse(var152);
    }
    
    public static SubLObject f36962(final SubLObject var32, final SubLObject var33) {
        SubLObject var35;
        final SubLObject var34 = var35 = var32.rest();
        SubLObject var36 = (SubLObject)module0604.NIL;
        SubLObject var37 = (SubLObject)module0604.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var35, var34, (SubLObject)module0604.$ic85$);
        var36 = var35.first();
        var35 = var35.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var35, var34, (SubLObject)module0604.$ic85$);
        var37 = var35.first();
        var35 = var35.rest();
        if (module0604.NIL == var35) {
            return (SubLObject)ConsesLow.list((SubLObject)module0604.$ic86$, (SubLObject)ConsesLow.list((SubLObject)module0604.$ic87$, (SubLObject)ConsesLow.list((SubLObject)module0604.$ic88$, var37), (SubLObject)module0604.$ic89$, var37), (SubLObject)ConsesLow.list((SubLObject)module0604.$ic90$, var36, var37));
        }
        cdestructuring_bind.cdestructuring_bind_error(var34, (SubLObject)module0604.$ic85$);
        return (SubLObject)module0604.NIL;
    }
    
    public static SubLObject f36963() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36885", "S#40675", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36886", "S#40676", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36887", "S#40677", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36888", "S#40678", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36889", "S#40679", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36890", "S#40680", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36891", "S#40681", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36894", "S#40682", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36895", "S#40683", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36897", "S#37962", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36899", "S#40684", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36901", "S#40685", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36903", "S#40686", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36905", "S#40687", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36907", "S#40688", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36909", "S#40689", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36910", "S#40690", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36898", "S#37968", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36912", "S#40691", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36914", "S#40692", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36916", "S#40693", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36892", "S#40694", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0604", "f36917", "S#40695");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36893", "S#40696", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36900", "S#40697", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36902", "S#40698", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36904", "S#40699", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36920", "S#40700", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36921", "S#40701", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36922", "S#40702", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36906", "S#40703", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36908", "S#40704", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36911", "S#40705", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36896", "S#40706", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36913", "S#40707", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36915", "S#40708", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36918", "S#40709", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36919", "S#40710", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36924", "S#40711", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36923", "S#40712", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36925", "S#37964", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36926", "S#40713", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36927", "S#40714", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36928", "S#40715", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36929", "S#37966", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36930", "S#40716", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36931", "S#40717", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36932", "S#40718", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36933", "S#40719", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36934", "S#40720", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36935", "S#40721", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36936", "S#40722", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36937", "S#40723", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36938", "S#40724", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0604", "f36939", "S#40725");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36940", "S#40726", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36941", "S#40727", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36942", "S#40728", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36943", "S#40729", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36944", "S#37967", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36945", "S#40730", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36946", "S#40731", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36947", "S#40732", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36948", "S#40733", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36949", "S#40734", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36952", "S#40735", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36954", "S#40736", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36953", "S#40737", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36950", "S#40738", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36951", "S#40739", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36955", "S#37963", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36956", "S#40740", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36957", "S#40741", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36958", "S#40742", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36959", "S#40743", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36960", "S#40744", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0604", "f36961", "S#40745", 0, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0604", "f36962", "S#40746");
        return (SubLObject)module0604.NIL;
    }
    
    public static SubLObject f36964() {
        module0604.$g4667$ = SubLFiles.defparameter("S#40747", (SubLObject)module0604.$ic0$);
        module0604.$g4668$ = SubLFiles.defparameter("S#40748", (SubLObject)module0604.$ic1$);
        module0604.$g4669$ = SubLFiles.defconstant("S#40749", (SubLObject)module0604.TEN_INTEGER);
        module0604.$g4670$ = SubLFiles.defconstant("S#40750", (SubLObject)module0604.TEN_INTEGER);
        module0604.$g4671$ = SubLFiles.defparameter("S#40751", (SubLObject)module0604.$ic4$);
        module0604.$g4672$ = SubLFiles.deflexical("S#40752", (SubLObject)ConsesLow.list((SubLObject)module0604.$ic18$, (SubLObject)module0604.$ic19$));
        module0604.$g4673$ = SubLFiles.deflexical("S#40753", (SubLObject)module0604.NIL);
        module0604.$g4674$ = SubLFiles.deflexical("S#40754", Numbers.subtract((SubLObject)module0604.$ic66$, (SubLObject)module0604.$ic67$));
        module0604.$g4095$ = SubLFiles.deflexical("S#40755", Numbers.integerDivide(module0604.$g4674$.getGlobalValue(), (SubLObject)module0604.TWO_INTEGER));
        return (SubLObject)module0604.NIL;
    }
    
    public static SubLObject f36965() {
        module0034.f1909((SubLObject)module0604.$ic31$);
        module0012.f419((SubLObject)module0604.$ic45$);
        module0012.f419((SubLObject)module0604.$ic46$);
        module0012.f419((SubLObject)module0604.$ic48$);
        module0012.f419((SubLObject)module0604.$ic49$);
        module0012.f419((SubLObject)module0604.$ic50$);
        module0012.f419((SubLObject)module0604.$ic51$);
        module0012.f419((SubLObject)module0604.$ic52$);
        return (SubLObject)module0604.NIL;
    }
    
    public void declareFunctions() {
        f36963();
    }
    
    public void initializeVariables() {
        f36964();
    }
    
    public void runTopLevelForms() {
        f36965();
    }
    
    static {
        me = (SubLFile)new module0604();
        module0604.$g4667$ = null;
        module0604.$g4668$ = null;
        module0604.$g4669$ = null;
        module0604.$g4670$ = null;
        module0604.$g4671$ = null;
        module0604.$g4672$ = null;
        module0604.$g4673$ = null;
        module0604.$g4674$ = null;
        module0604.$g4095$ = null;
        $ic0$ = SubLObjectFactory.makeString("localhost");
        $ic1$ = SubLObjectFactory.makeInteger(19219);
        $ic2$ = SubLObjectFactory.makeKeyword("OK");
        $ic3$ = SubLObjectFactory.makeKeyword("NOT-AN-SQS-RESPONSE");
        $ic4$ = SubLObjectFactory.makeKeyword("WARN-ON-ERROR");
        $ic5$ = SubLObjectFactory.makeString("Received error ~A (~A).~%");
        $ic6$ = SubLObjectFactory.makeKeyword("ERROR-ON-ERROR");
        $ic7$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#40756", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#40757", "CYC"));
        $ic8$ = SubLObjectFactory.makeString("");
        $ic9$ = SubLObjectFactory.makeKeyword("MESSAGE");
        $ic10$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic11$ = SubLObjectFactory.makeKeyword("PUBLIC");
        $ic12$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic13$ = SubLObjectFactory.makeString("Only support STRINGP or LIST-OF-TYPE-P 'STRINGP.");
        $ic14$ = SubLObjectFactory.makeKeyword("EOF");
        $ic15$ = SubLObjectFactory.makeString("Empty result ... suspicious.");
        $ic16$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic17$ = SubLObjectFactory.makeString("Bogus result returned by server.");
        $ic18$ = SubLObjectFactory.makeString("format");
        $ic19$ = SubLObjectFactory.makeString("subl");
        $ic20$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic21$ = SubLObjectFactory.makeSymbol("CWITH-OUTPUT-TO-STRING");
        $ic22$ = SubLObjectFactory.makeSymbol("CLET");
        $ic23$ = SubLObjectFactory.makeSymbol("S#1764", "CYC");
        $ic24$ = SubLObjectFactory.makeSymbol("S#40551", "CYC");
        $ic25$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("request"), (SubLObject)SubLObjectFactory.makeSymbol("S#40752", "CYC"));
        $ic26$ = SubLObjectFactory.makeString("request");
        $ic27$ = SubLObjectFactory.makeString("version");
        $ic28$ = SubLObjectFactory.makeString("createq");
        $ic29$ = SubLObjectFactory.makeString("deleteq");
        $ic30$ = SubLObjectFactory.makeString("enqueue");
        $ic31$ = SubLObjectFactory.makeSymbol("S#40703", "CYC");
        $ic32$ = SubLObjectFactory.makeSymbol("S#40753", "CYC");
        $ic33$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic34$ = SubLObjectFactory.makeString("dequeue");
        $ic35$ = SubLObjectFactory.makeString("pending");
        $ic36$ = SubLObjectFactory.makeString("listqs");
        $ic37$ = SubLObjectFactory.makeString("putfile");
        $ic38$ = SubLObjectFactory.makeString("data");
        $ic39$ = SubLObjectFactory.makeString("getfile");
        $ic40$ = SubLObjectFactory.makeString("name");
        $ic41$ = SubLObjectFactory.makeString("maxTries");
        $ic42$ = SubLObjectFactory.makeString("maxWaitSecs");
        $ic43$ = SubLObjectFactory.makeString("bucket");
        $ic44$ = SubLObjectFactory.makeString("key");
        $ic45$ = SubLObjectFactory.makeSymbol("S#40714", "CYC");
        $ic46$ = SubLObjectFactory.makeSymbol("S#40715", "CYC");
        $ic47$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#40758", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#40759", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#40760", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#15403", "CYC"));
        $ic48$ = SubLObjectFactory.makeSymbol("S#40717", "CYC");
        $ic49$ = SubLObjectFactory.makeSymbol("S#40718", "CYC");
        $ic50$ = SubLObjectFactory.makeSymbol("S#40720", "CYC");
        $ic51$ = SubLObjectFactory.makeSymbol("S#40721", "CYC");
        $ic52$ = SubLObjectFactory.makeSymbol("S#40722", "CYC");
        $ic53$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#40758", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#40759", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#40760", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#40761", "CYC"));
        $ic54$ = SubLObjectFactory.makeString("Could not post ~A to ~A.");
        $ic55$ = SubLObjectFactory.makeSymbol("S#7310", "CYC");
        $ic56$ = SubLObjectFactory.makeKeyword("SENTENCE");
        $ic57$ = SubLObjectFactory.makeKeyword("ELMT");
        $ic58$ = SubLObjectFactory.makeKeyword("PROPERTIES");
        $ic59$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14349", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12327", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5852", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#40762", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#40763", "CYC"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic60$ = SubLObjectFactory.makeSymbol("GETF");
        $ic61$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENTENCE"));
        $ic62$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ELMT"));
        $ic63$ = SubLObjectFactory.makeKeyword("EXHAUSTED");
        $ic64$ = SubLObjectFactory.makeSymbol("COMPACT-HL-EXTERNAL-ID-STRING");
        $ic65$ = SubLObjectFactory.makeSymbol("FIND-OBJECT-BY-COMPACT-HL-EXTERNAL-ID-STRING");
        $ic66$ = SubLObjectFactory.makeInteger(8192);
        $ic67$ = SubLObjectFactory.makeInteger(256);
        $ic68$ = SubLObjectFactory.makeSymbol("S#40732", "CYC");
        $ic69$ = SubLObjectFactory.makeSymbol("S#40733", "CYC");
        $ic70$ = SubLObjectFactory.makeSymbol("S#40731", "CYC");
        $ic71$ = SubLObjectFactory.makeSymbol("S#40735", "CYC");
        $ic72$ = SubLObjectFactory.makeSymbol("S#40736", "CYC");
        $ic73$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#7400", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("S#702", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#40764", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#40765", "CYC"));
        $ic74$ = SubLObjectFactory.makeString("Object ~A encodes as ~A bytes, more than the maximum number of bytes ~A.~%");
        $ic75$ = SubLObjectFactory.makeString("Implementation error: serializing ~A encodes as ~A bytes, less than the maximum number of bytes ~A, and STILL causes buffer overflow.~%");
        $ic76$ = SubLObjectFactory.makeSymbol("S#5091", "CYC");
        $ic77$ = SubLObjectFactory.makeSymbol("S#40741", "CYC");
        $ic78$ = SubLObjectFactory.makeSymbol("S#40742", "CYC");
        $ic79$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#40766", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#40767", "CYC"));
        $ic80$ = SubLObjectFactory.makeInteger(30);
        $ic81$ = SubLObjectFactory.makeString("~&~A ~A: ~A msgs~%");
        $ic82$ = SubLObjectFactory.makeKeyword("ALL-EMPTY");
        $ic83$ = SubLObjectFactory.makeString("~&~A: Cleaning up ca ~A msgs from ~A ....~%");
        $ic84$ = SubLObjectFactory.makeString("~&~A: Removed ~A msgs from ~A.~%");
        $ic85$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#169", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"));
        $ic86$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic87$ = SubLObjectFactory.makeSymbol("MUST");
        $ic88$ = SubLObjectFactory.makeSymbol("S#37962", "CYC");
        $ic89$ = SubLObjectFactory.makeString("~A is not a known SQS queue ....~%");
        $ic90$ = SubLObjectFactory.makeSymbol("CSETQ");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0604.class
	Total time: 622 ms
	
	Decompiled with Procyon 0.5.32.
*/