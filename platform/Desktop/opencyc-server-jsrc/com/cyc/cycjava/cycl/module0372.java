package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0372 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0372";
    public static final String myFingerPrint = "8e34e9995de1906ff0095b83deac3484e7cbd9e51bfd2e4f707598e367ef98ce";
    public static SubLSymbol $g3164$;
    public static SubLSymbol $g3165$;
    public static SubLSymbol $g3166$;
    public static SubLSymbol $g3167$;
    private static final SubLSymbol $ic0$;
    private static final SubLObject $ic1$;
    private static final SubLString $ic2$;
    private static final SubLInteger $ic3$;
    private static final SubLList $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLString $ic13$;
    private static final SubLString $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLList $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLString $ic19$;
    private static final SubLString $ic20$;
    private static final SubLString $ic21$;
    private static final SubLList $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLList $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    private static final SubLString $ic28$;
    private static final SubLString $ic29$;
    private static final SubLString $ic30$;
    private static final SubLString $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLString $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    
    public static SubLObject f26077(SubLObject var1, SubLObject var2) {
        if (var2 == module0372.UNPROVIDED) {
            var2 = (SubLObject)module0372.$ic0$;
        }
        if (module0372.$ic0$ != var2) {
            var1 = module0202.f12768(module0372.$ic1$, var2, var1);
        }
        final SubLObject var3 = f26078(var1);
        return f26079(var3);
    }
    
    public static SubLObject f26079(final SubLObject var3) {
        final SubLObject var4 = module0371.f26041(var3);
        final SubLObject var5 = f26080(var4);
        return var5;
    }
    
    public static SubLObject f26081(final SubLObject var6) {
        SubLObject var7 = (SubLObject)module0372.NIL;
        SubLObject var8 = var6;
        SubLObject var9 = (SubLObject)module0372.NIL;
        var9 = var8.first();
        while (module0372.NIL != var8) {
            if (!var9.isFixnum()) {
                if (module0372.NIL != constant_handles_oc.f8449(var9)) {
                    var9 = Guids.guid_to_string(constants_high_oc.f10757(var9));
                }
                else if (var9.isSymbol()) {
                    var9 = module0038.f2624(var9);
                }
                else {
                    var9 = module0213.f13920(var9);
                }
            }
            var7 = (SubLObject)ConsesLow.cons(var9, var7);
            var8 = var8.rest();
            var9 = var8.first();
        }
        return Sequences.nreverse(var7);
    }
    
    public static SubLObject f26080(final SubLObject var3) {
        final SubLObject var4 = module0362.f24470(var3);
        return var4;
    }
    
    public static SubLObject f26078(final SubLObject var1) {
        final SubLObject var2 = module0409.f28515(var1, (SubLObject)module0372.UNPROVIDED, (SubLObject)module0372.UNPROVIDED);
        final SubLObject var3 = oc_inference_datastructures_inference.f25487(var2);
        return var3;
    }
    
    public static SubLObject f26082(final SubLObject var11) {
        final SubLObject var12 = module0371.f26032(var11);
        return f26083(var12);
    }
    
    public static SubLObject f26083(final SubLObject var12) {
        return module0213.f13920(var12);
    }
    
    public static SubLObject f26084(final SubLObject var13) {
        return module0213.f13921(var13);
    }
    
    public static SubLObject f26085(final SubLObject var14, final SubLObject var15) {
        SubLObject var17;
        final SubLObject var16 = var17 = var14.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0372.$ic4$);
        final SubLObject var18 = var17.rest();
        var17 = var17.first();
        SubLObject var19 = (SubLObject)module0372.NIL;
        SubLObject var20 = (SubLObject)module0372.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0372.$ic4$);
        var19 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0372.$ic4$);
        var20 = var17.first();
        var17 = var17.rest();
        if (module0372.NIL == var17) {
            final SubLObject var21;
            var17 = (var21 = var18);
            return (SubLObject)ConsesLow.listS((SubLObject)module0372.$ic5$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0372.$ic6$, var19), (SubLObject)ConsesLow.list((SubLObject)module0372.$ic7$, var20)), ConsesLow.append(var21, (SubLObject)module0372.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var16, (SubLObject)module0372.$ic4$);
        return (SubLObject)module0372.NIL;
    }
    
    public static SubLObject f26086() {
        return module0035.sublisp_boolean(f26087());
    }
    
    public static SubLObject f26088(final SubLObject var3) {
        final SubLObject var4 = f26081(f26079(var3));
        final SubLObject var5 = f26089(var4);
        final SubLObject var6 = f26090(var5);
        if (module0372.NIL != f26091(var6)) {
            SubLObject var8;
            final SubLObject var7 = var8 = f26092((SubLObject)module0372.ZERO_INTEGER, var6);
            SubLObject var9 = (SubLObject)module0372.NIL;
            var9 = var8.first();
            while (module0372.NIL != var8) {
                final SubLObject var10 = conses_high.getf(var9, (SubLObject)module0372.$ic8$, (SubLObject)module0372.UNPROVIDED);
                final SubLObject var11 = f26084(var10);
                conses_high.putf(var9, (SubLObject)module0372.$ic8$, var11);
                var8 = var8.rest();
                var9 = var8.first();
            }
            return var7;
        }
        return (SubLObject)module0372.NIL;
    }
    
    public static SubLObject f26087() {
        final SubLObject var22 = f26093();
        final SubLObject var23 = f26090(var22);
        if (module0372.NIL != f26091(var23)) {
            return f26094(var23);
        }
        return (SubLObject)module0372.NIL;
    }
    
    public static SubLObject f26090(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        SubLObject var24 = (SubLObject)module0372.NIL;
        SubLObject var25 = (SubLObject)module0372.NIL;
        try {
            var23.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var26 = Errors.$error_handler$.currentBinding(var23);
            try {
                Errors.$error_handler$.bind((SubLObject)module0372.$ic9$, var23);
                try {
                    SubLObject var27 = (SubLObject)module0372.NIL;
                    try {
                        var27 = module0004.f82(module0372.$g3166$.getDynamicValue(var23), module0372.$g3167$.getDynamicValue(var23), (SubLObject)module0372.NIL, (SubLObject)module0372.$ic10$);
                        if (module0372.NIL != module0003.f70(var27, module0372.$g3166$.getDynamicValue(var23), module0372.$g3167$.getDynamicValue(var23))) {
                            streams_high.write_string(var22, var27, (SubLObject)module0372.UNPROVIDED, (SubLObject)module0372.UNPROVIDED);
                            module0038.f2833(var27);
                            streams_high.force_output(var27);
                            final SubLObject var28 = reader.read(var27, (SubLObject)module0372.NIL, (SubLObject)module0372.$ic11$, (SubLObject)module0372.UNPROVIDED);
                            if (var28.isCons()) {
                                var24 = Eval.eval(var28);
                            }
                            else {
                                var24 = (SubLObject)ConsesLow.list((SubLObject)module0372.$ic12$, Sequences.cconcatenate((SubLObject)module0372.$ic13$, new SubLObject[] { module0006.f203(var28), module0372.$ic14$ }));
                            }
                        }
                    }
                    finally {
                        final SubLObject var29_32 = Threads.$is_thread_performing_cleanupP$.currentBinding(var23);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0372.T, var23);
                            if (module0372.NIL != var27) {
                                streams_high.close(var27, (SubLObject)module0372.UNPROVIDED);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var29_32, var23);
                        }
                    }
                }
                catch (Throwable var29) {
                    Errors.handleThrowable(var29, (SubLObject)module0372.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var26, var23);
            }
        }
        catch (Throwable var30) {
            var25 = Errors.handleThrowable(var30, module0003.$g3$.getGlobalValue());
        }
        finally {
            var23.throwStack.pop();
        }
        if (module0372.NIL == var24) {
            var24 = (SubLObject)ConsesLow.list((SubLObject)module0372.$ic12$, var25);
        }
        return var24;
    }
    
    public static SubLObject f26095(final SubLObject var23) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var23.isCons() && var23.first().isKeyword());
    }
    
    public static SubLObject f26096(final SubLObject var23) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0372.NIL != f26095(var23) && module0372.$ic12$ == var23.first());
    }
    
    public static SubLObject f26091(final SubLObject var23) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0372.NIL != f26095(var23) && module0372.$ic15$ == var23.first());
    }
    
    public static SubLObject f26094(final SubLObject var23) {
        return (SubLObject)((module0372.NIL != f26095(var23)) ? var23.rest() : module0372.NIL);
    }
    
    public static SubLObject f26092(final SubLObject var35, final SubLObject var23) {
        final SubLObject var36 = f26094(var23);
        return ConsesLow.nth(var35, var36);
    }
    
    public static SubLObject f26097(final SubLObject var14, final SubLObject var15) {
        SubLObject var17;
        final SubLObject var16 = var17 = var14.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0372.$ic16$);
        final SubLObject var18 = var17.rest();
        var17 = var17.first();
        SubLObject var19 = (SubLObject)module0372.NIL;
        SubLObject var20 = (SubLObject)module0372.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0372.$ic16$);
        var19 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0372.$ic16$);
        var20 = var17.first();
        var17 = var17.rest();
        if (module0372.NIL == var17) {
            final SubLObject var21;
            var17 = (var21 = var18);
            return (SubLObject)ConsesLow.listS((SubLObject)module0372.$ic17$, (SubLObject)ConsesLow.list((SubLObject)module0372.$ic18$, (SubLObject)module0372.$ic19$, var19), (SubLObject)ConsesLow.list((SubLObject)module0372.$ic18$, var20, var19), (SubLObject)ConsesLow.list((SubLObject)module0372.$ic18$, (SubLObject)module0372.$ic20$, var19), ConsesLow.append(var21, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0372.$ic18$, (SubLObject)module0372.$ic21$, var19), (SubLObject)ConsesLow.list((SubLObject)module0372.$ic18$, var20, var19), (SubLObject)ConsesLow.list((SubLObject)module0372.$ic18$, (SubLObject)module0372.$ic20$, var19))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var16, (SubLObject)module0372.$ic16$);
        return (SubLObject)module0372.NIL;
    }
    
    public static SubLObject f26098(final SubLObject var14, final SubLObject var15) {
        SubLObject var17;
        final SubLObject var16 = var17 = var14.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0372.$ic22$);
        final SubLObject var18 = var17.rest();
        var17 = var17.first();
        SubLObject var19 = (SubLObject)module0372.NIL;
        SubLObject var20 = (SubLObject)module0372.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0372.$ic22$);
        var19 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0372.$ic22$);
        var20 = var17.first();
        var17 = var17.rest();
        if (module0372.NIL == var17) {
            final SubLObject var21;
            var17 = (var21 = var18);
            return (SubLObject)ConsesLow.list((SubLObject)module0372.$ic23$, (SubLObject)ConsesLow.list(var19, var20), (SubLObject)ConsesLow.listS((SubLObject)module0372.$ic24$, reader.bq_cons(var19, (SubLObject)module0372.$ic25$), ConsesLow.append(var21, (SubLObject)module0372.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var16, (SubLObject)module0372.$ic22$);
        return (SubLObject)module0372.NIL;
    }
    
    public static SubLObject f26089(final SubLObject var7) {
        SubLObject var8 = (SubLObject)module0372.NIL;
        SubLObject var9 = (SubLObject)module0372.NIL;
        try {
            var9 = streams_high.make_private_string_output_stream();
            streams_high.write_string((SubLObject)module0372.$ic19$, var9, (SubLObject)module0372.UNPROVIDED, (SubLObject)module0372.UNPROVIDED);
            streams_high.write_string((SubLObject)module0372.$ic26$, var9, (SubLObject)module0372.UNPROVIDED, (SubLObject)module0372.UNPROVIDED);
            streams_high.write_string((SubLObject)module0372.$ic20$, var9, (SubLObject)module0372.UNPROVIDED, (SubLObject)module0372.UNPROVIDED);
            streams_high.write_string((SubLObject)module0372.$ic19$, var9, (SubLObject)module0372.UNPROVIDED, (SubLObject)module0372.UNPROVIDED);
            streams_high.write_string((SubLObject)module0372.$ic27$, var9, (SubLObject)module0372.UNPROVIDED, (SubLObject)module0372.UNPROVIDED);
            streams_high.write_string((SubLObject)module0372.$ic20$, var9, (SubLObject)module0372.UNPROVIDED, (SubLObject)module0372.UNPROVIDED);
            f26099(var7, var9);
            streams_high.write_string((SubLObject)module0372.$ic21$, var9, (SubLObject)module0372.UNPROVIDED, (SubLObject)module0372.UNPROVIDED);
            streams_high.write_string((SubLObject)module0372.$ic27$, var9, (SubLObject)module0372.UNPROVIDED, (SubLObject)module0372.UNPROVIDED);
            streams_high.write_string((SubLObject)module0372.$ic20$, var9, (SubLObject)module0372.UNPROVIDED, (SubLObject)module0372.UNPROVIDED);
            streams_high.write_string((SubLObject)module0372.$ic21$, var9, (SubLObject)module0372.UNPROVIDED, (SubLObject)module0372.UNPROVIDED);
            streams_high.write_string((SubLObject)module0372.$ic26$, var9, (SubLObject)module0372.UNPROVIDED, (SubLObject)module0372.UNPROVIDED);
            streams_high.write_string((SubLObject)module0372.$ic20$, var9, (SubLObject)module0372.UNPROVIDED, (SubLObject)module0372.UNPROVIDED);
            var8 = streams_high.get_output_stream_string(var9);
        }
        finally {
            final SubLObject var10 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0372.T);
                streams_high.close(var9, (SubLObject)module0372.UNPROVIDED);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var10);
            }
        }
        return var8;
    }
    
    public static SubLObject f26093() {
        SubLObject var23 = (SubLObject)module0372.NIL;
        SubLObject var24 = (SubLObject)module0372.NIL;
        try {
            var24 = streams_high.make_private_string_output_stream();
            streams_high.write_string((SubLObject)module0372.$ic19$, var24, (SubLObject)module0372.UNPROVIDED, (SubLObject)module0372.UNPROVIDED);
            streams_high.write_string((SubLObject)module0372.$ic26$, var24, (SubLObject)module0372.UNPROVIDED, (SubLObject)module0372.UNPROVIDED);
            streams_high.write_string((SubLObject)module0372.$ic20$, var24, (SubLObject)module0372.UNPROVIDED, (SubLObject)module0372.UNPROVIDED);
            streams_high.write_string((SubLObject)module0372.$ic19$, var24, (SubLObject)module0372.UNPROVIDED, (SubLObject)module0372.UNPROVIDED);
            streams_high.write_string((SubLObject)module0372.$ic28$, var24, (SubLObject)module0372.UNPROVIDED, (SubLObject)module0372.UNPROVIDED);
            streams_high.write_string((SubLObject)module0372.$ic20$, var24, (SubLObject)module0372.UNPROVIDED, (SubLObject)module0372.UNPROVIDED);
            streams_high.write_string((SubLObject)module0372.$ic21$, var24, (SubLObject)module0372.UNPROVIDED, (SubLObject)module0372.UNPROVIDED);
            streams_high.write_string((SubLObject)module0372.$ic28$, var24, (SubLObject)module0372.UNPROVIDED, (SubLObject)module0372.UNPROVIDED);
            streams_high.write_string((SubLObject)module0372.$ic20$, var24, (SubLObject)module0372.UNPROVIDED, (SubLObject)module0372.UNPROVIDED);
            streams_high.write_string((SubLObject)module0372.$ic21$, var24, (SubLObject)module0372.UNPROVIDED, (SubLObject)module0372.UNPROVIDED);
            streams_high.write_string((SubLObject)module0372.$ic26$, var24, (SubLObject)module0372.UNPROVIDED, (SubLObject)module0372.UNPROVIDED);
            streams_high.write_string((SubLObject)module0372.$ic20$, var24, (SubLObject)module0372.UNPROVIDED, (SubLObject)module0372.UNPROVIDED);
            var23 = streams_high.get_output_stream_string(var24);
        }
        finally {
            final SubLObject var25 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0372.T);
                streams_high.close(var24, (SubLObject)module0372.UNPROVIDED);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var25);
            }
        }
        return var23;
    }
    
    public static SubLObject f26099(final SubLObject var7, final SubLObject var30) {
        streams_high.write_string((SubLObject)module0372.$ic19$, var30, (SubLObject)module0372.UNPROVIDED, (SubLObject)module0372.UNPROVIDED);
        streams_high.write_string((SubLObject)module0372.$ic29$, var30, (SubLObject)module0372.UNPROVIDED, (SubLObject)module0372.UNPROVIDED);
        streams_high.write_string((SubLObject)module0372.$ic20$, var30, (SubLObject)module0372.UNPROVIDED, (SubLObject)module0372.UNPROVIDED);
        streams_high.write_string((SubLObject)module0372.$ic19$, var30, (SubLObject)module0372.UNPROVIDED, (SubLObject)module0372.UNPROVIDED);
        streams_high.write_string((SubLObject)module0372.$ic30$, var30, (SubLObject)module0372.UNPROVIDED, (SubLObject)module0372.UNPROVIDED);
        streams_high.write_string((SubLObject)module0372.$ic20$, var30, (SubLObject)module0372.UNPROVIDED, (SubLObject)module0372.UNPROVIDED);
        SubLObject var31 = var7;
        SubLObject var32 = (SubLObject)module0372.NIL;
        var32 = var31.first();
        while (module0372.NIL != var31) {
            streams_high.write_string((SubLObject)module0372.$ic19$, var30, (SubLObject)module0372.UNPROVIDED, (SubLObject)module0372.UNPROVIDED);
            streams_high.write_string((SubLObject)module0372.$ic31$, var30, (SubLObject)module0372.UNPROVIDED, (SubLObject)module0372.UNPROVIDED);
            streams_high.write_string((SubLObject)module0372.$ic20$, var30, (SubLObject)module0372.UNPROVIDED, (SubLObject)module0372.UNPROVIDED);
            if (var32.isFixnum()) {
                streams_high.write_string((SubLObject)module0372.$ic32$, var30, (SubLObject)module0372.UNPROVIDED, (SubLObject)module0372.UNPROVIDED);
                print_high.princ(var32, var30);
                streams_high.write_string((SubLObject)module0372.$ic33$, var30, (SubLObject)module0372.UNPROVIDED, (SubLObject)module0372.UNPROVIDED);
            }
            else if (var32.isString()) {
                streams_high.write_string((SubLObject)module0372.$ic34$, var30, (SubLObject)module0372.UNPROVIDED, (SubLObject)module0372.UNPROVIDED);
                print_high.princ(var32, var30);
                streams_high.write_string((SubLObject)module0372.$ic33$, var30, (SubLObject)module0372.UNPROVIDED, (SubLObject)module0372.UNPROVIDED);
            }
            else {
                Errors.error((SubLObject)module0372.$ic35$, var32);
            }
            streams_high.write_string((SubLObject)module0372.$ic21$, var30, (SubLObject)module0372.UNPROVIDED, (SubLObject)module0372.UNPROVIDED);
            streams_high.write_string((SubLObject)module0372.$ic31$, var30, (SubLObject)module0372.UNPROVIDED, (SubLObject)module0372.UNPROVIDED);
            streams_high.write_string((SubLObject)module0372.$ic20$, var30, (SubLObject)module0372.UNPROVIDED, (SubLObject)module0372.UNPROVIDED);
            var31 = var31.rest();
            var32 = var31.first();
        }
        streams_high.write_string((SubLObject)module0372.$ic21$, var30, (SubLObject)module0372.UNPROVIDED, (SubLObject)module0372.UNPROVIDED);
        streams_high.write_string((SubLObject)module0372.$ic30$, var30, (SubLObject)module0372.UNPROVIDED, (SubLObject)module0372.UNPROVIDED);
        streams_high.write_string((SubLObject)module0372.$ic20$, var30, (SubLObject)module0372.UNPROVIDED, (SubLObject)module0372.UNPROVIDED);
        streams_high.write_string((SubLObject)module0372.$ic21$, var30, (SubLObject)module0372.UNPROVIDED, (SubLObject)module0372.UNPROVIDED);
        streams_high.write_string((SubLObject)module0372.$ic29$, var30, (SubLObject)module0372.UNPROVIDED, (SubLObject)module0372.UNPROVIDED);
        streams_high.write_string((SubLObject)module0372.$ic20$, var30, (SubLObject)module0372.UNPROVIDED, (SubLObject)module0372.UNPROVIDED);
        return var7;
    }
    
    public static SubLObject f26100(final SubLObject var47, final SubLObject var11) {
        final SubLThread var48 = SubLProcess.currentSubLThread();
        SubLObject var49 = (SubLObject)module0372.NIL;
        try {
            var48.throwStack.push(module0372.$ic36$);
            final SubLObject var50 = Errors.$error_handler$.currentBinding(var48);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0372.$ic37$), var48);
                try {
                    final SubLObject var51 = module0423.f29563(var47);
                    final SubLObject var52 = module0423.f29569(var47);
                    final SubLObject var53 = f26077(var51, var52);
                    final SubLObject var54 = f26081(var53);
                    final SubLObject var55 = f26082(var11);
                    return Values.values(var54, var55);
                }
                catch (Throwable var56) {
                    Errors.handleThrowable(var56, (SubLObject)module0372.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var50, var48);
            }
        }
        catch (Throwable var57) {
            var49 = Errors.handleThrowable(var57, (SubLObject)module0372.$ic36$);
        }
        finally {
            var48.throwStack.pop();
        }
        return Values.values((SubLObject)module0372.NIL, (SubLObject)module0372.NIL);
    }
    
    public static SubLObject f26101(final SubLObject var47) {
        final SubLThread var48 = SubLProcess.currentSubLThread();
        SubLObject var49 = (SubLObject)module0372.NIL;
        try {
            var48.throwStack.push(module0372.$ic36$);
            final SubLObject var50 = Errors.$error_handler$.currentBinding(var48);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0372.$ic37$), var48);
                try {
                    final SubLObject var51 = module0423.f29563(var47);
                    final SubLObject var52 = module0423.f29569(var47);
                    final SubLObject var53 = f26077(var51, var52);
                    final SubLObject var54 = f26081(var53);
                    return var54;
                }
                catch (Throwable var55) {
                    Errors.handleThrowable(var55, (SubLObject)module0372.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var50, var48);
            }
        }
        catch (Throwable var56) {
            var49 = Errors.handleThrowable(var56, (SubLObject)module0372.$ic36$);
        }
        finally {
            var48.throwStack.pop();
        }
        return (SubLObject)module0372.NIL;
    }
    
    public static SubLObject f26102() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0372", "f26077", "S#29151", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0372", "f26079", "S#29152", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0372", "f26081", "S#29153", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0372", "f26080", "S#29154", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0372", "f26078", "S#29155", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0372", "f26082", "S#29156", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0372", "f26083", "S#29157", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0372", "f26084", "S#29158", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0372", "f26085", "S#29159");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0372", "f26086", "S#29160", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0372", "f26088", "S#29161", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0372", "f26087", "S#29162", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0372", "f26090", "S#29163", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0372", "f26095", "S#29164", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0372", "f26096", "S#29165", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0372", "f26091", "S#29166", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0372", "f26094", "S#29167", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0372", "f26092", "S#29168", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0372", "f26097", "S#29169");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0372", "f26098", "S#29170");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0372", "f26089", "S#29171", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0372", "f26093", "S#29172", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0372", "f26099", "S#29173", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0372", "f26100", "S#29174", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0372", "f26101", "S#29175", 1, 0, false);
        return (SubLObject)module0372.NIL;
    }
    
    public static SubLObject f26103() {
        module0372.$g3164$ = SubLFiles.deflexical("S#29176", (SubLObject)module0372.$ic2$);
        module0372.$g3165$ = SubLFiles.deflexical("S#29177", (SubLObject)module0372.$ic3$);
        module0372.$g3166$ = SubLFiles.defparameter("S#29178", module0372.$g3164$.getGlobalValue());
        module0372.$g3167$ = SubLFiles.defparameter("S#29179", module0372.$g3165$.getGlobalValue());
        return (SubLObject)module0372.NIL;
    }
    
    public static SubLObject f26104() {
        return (SubLObject)module0372.NIL;
    }
    
    public void declareFunctions() {
        f26102();
    }
    
    public void initializeVariables() {
        f26103();
    }
    
    public void runTopLevelForms() {
        f26104();
    }
    
    static {
        me = (SubLFile)new module0372();
        module0372.$g3164$ = null;
        module0372.$g3165$ = null;
        module0372.$g3166$ = null;
        module0372.$g3167$ = null;
        $ic0$ = SubLObjectFactory.makeKeyword("NON-PROVIDED");
        $ic1$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ist"));
        $ic2$ = SubLObjectFactory.makeString("localhost");
        $ic3$ = SubLObjectFactory.makeInteger(2112);
        $ic4$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#57", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#58", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic5$ = SubLObjectFactory.makeSymbol("CLET");
        $ic6$ = SubLObjectFactory.makeSymbol("S#29178", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#29179", "CYC");
        $ic8$ = SubLObjectFactory.makeKeyword("PROOF-SPEC");
        $ic9$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic10$ = SubLObjectFactory.makeKeyword("PUBLIC");
        $ic11$ = SubLObjectFactory.makeKeyword("EOF");
        $ic12$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic13$ = SubLObjectFactory.makeString("Unexpected reply ");
        $ic14$ = SubLObjectFactory.makeString(" from TCP/IP layer.");
        $ic15$ = SubLObjectFactory.makeKeyword("OK");
        $ic16$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("S#150", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic17$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic18$ = SubLObjectFactory.makeSymbol("WRITE-STRING");
        $ic19$ = SubLObjectFactory.makeString("<");
        $ic20$ = SubLObjectFactory.makeString(">");
        $ic21$ = SubLObjectFactory.makeString("</");
        $ic22$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("S#29180", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic23$ = SubLObjectFactory.makeSymbol("CWITH-OUTPUT-TO-STRING");
        $ic24$ = SubLObjectFactory.makeSymbol("S#29169", "CYC");
        $ic25$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("request"));
        $ic26$ = SubLObjectFactory.makeString("request");
        $ic27$ = SubLObjectFactory.makeString("suggest");
        $ic28$ = SubLObjectFactory.makeString("version");
        $ic29$ = SubLObjectFactory.makeString("queryKey");
        $ic30$ = SubLObjectFactory.makeString("keyItems");
        $ic31$ = SubLObjectFactory.makeString("keyItem");
        $ic32$ = SubLObjectFactory.makeString("<fixnum value=\"");
        $ic33$ = SubLObjectFactory.makeString("\"/>");
        $ic34$ = SubLObjectFactory.makeString("<string value=\"");
        $ic35$ = SubLObjectFactory.makeString("Invalid key item ~A -- neither string nor fixnum.");
        $ic36$ = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $ic37$ = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic38$ = SubLObjectFactory.makeSymbol("S#5859", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0372.class
	Total time: 184 ms
	
	Decompiled with Procyon 0.5.32.
*/