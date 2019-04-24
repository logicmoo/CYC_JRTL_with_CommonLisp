package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0045 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0045";
    public static final String myFingerPrint = "dfe694b3956f0c2f1ed9b7e33a7a01e2c8f7ff2d44879299be7d35cb365df460";
    private static SubLSymbol $g968$;
    private static SubLSymbol $g969$;
    private static SubLSymbol $g970$;
    private static final SubLString $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLString $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLList $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLList $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLList $ic19$;
    private static final SubLString $ic20$;
    private static final SubLString $ic21$;
    private static final SubLString $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLString $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLString $ic29$;
    private static final SubLString $ic30$;
    private static final SubLString $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLList $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLList $ic35$;
    
    public static SubLObject f3135(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var1.isChar() && module0045.NIL != Sequences.find(var1, module0045.$g968$.getGlobalValue(), (SubLObject)module0045.UNPROVIDED, (SubLObject)module0045.UNPROVIDED, (SubLObject)module0045.UNPROVIDED, (SubLObject)module0045.UNPROVIDED));
    }
    
    public static SubLObject f3136(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var1.isString() && module0045.NIL != Sequences.find_if((SubLObject)module0045.$ic1$, var1, (SubLObject)module0045.UNPROVIDED, (SubLObject)module0045.UNPROVIDED, (SubLObject)module0045.UNPROVIDED));
    }
    
    public static SubLObject f3137(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var1.isString() && module0045.NIL == Sequences.find_if((SubLObject)module0045.$ic1$, var1, (SubLObject)module0045.UNPROVIDED, (SubLObject)module0045.UNPROVIDED, (SubLObject)module0045.UNPROVIDED));
    }
    
    public static SubLObject f3138(final SubLObject var2, final SubLObject var3, SubLObject var4, SubLObject var5) {
        if (var4 == module0045.UNPROVIDED) {
            var4 = (SubLObject)module0045.NIL;
        }
        if (var5 == module0045.UNPROVIDED) {
            var5 = (SubLObject)module0045.NIL;
        }
        final SubLThread var6 = SubLProcess.currentSubLThread();
        assert module0045.NIL != module0024.f1249(var2) : var2;
        assert module0045.NIL != Types.stringp(var3) : var3;
        if (module0045.NIL != module0038.f2608(var2)) {
            return (SubLObject)module0045.NIL;
        }
        if (module0045.NIL == module0024.f1250()) {
            return Values.values((SubLObject)module0045.NIL, (SubLObject)module0045.$ic4$);
        }
        SubLObject var7 = (SubLObject)module0045.NIL;
        var6.resetMultipleValues();
        final SubLObject var8 = module0024.f1251(var2, var4);
        final SubLObject var9 = var6.secondMultipleValue();
        final SubLObject var10 = var6.thirdMultipleValue();
        final SubLObject var11 = var6.fourthMultipleValue();
        var6.resetMultipleValues();
        try {
            if (module0045.NIL == module0024.f1253(var8)) {
                Errors.error((SubLObject)module0045.$ic5$, new SubLObject[] { var9, var11, var2, var10 });
            }
            var7 = f3139(var8, var3, var5, (SubLObject)module0045.UNPROVIDED, (SubLObject)module0045.UNPROVIDED, (SubLObject)module0045.UNPROVIDED);
        }
        finally {
            final SubLObject var12 = Threads.$is_thread_performing_cleanupP$.currentBinding(var6);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0045.T, var6);
                if (module0045.NIL != module0024.f1253(var8)) {
                    module0024.f1257(var8);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var12, var6);
            }
        }
        return var7;
    }
    
    public static SubLObject f3140(final SubLObject var13, final SubLObject var3, SubLObject var4, SubLObject var5) {
        if (var4 == module0045.UNPROVIDED) {
            var4 = (SubLObject)module0045.NIL;
        }
        if (var5 == module0045.UNPROVIDED) {
            var5 = (SubLObject)module0045.NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        assert module0045.NIL != module0024.f1249(var13) : var13;
        assert module0045.NIL != Types.stringp(var3) : var3;
        if (module0045.NIL != module0038.f2608(var13)) {
            return (SubLObject)module0045.NIL;
        }
        if (module0045.NIL == module0024.f1250()) {
            return Values.values((SubLObject)module0045.NIL, (SubLObject)module0045.$ic4$);
        }
        SubLObject var15 = (SubLObject)module0045.NIL;
        var14.resetMultipleValues();
        final SubLObject var16 = module0024.f1251(var13, var4);
        final SubLObject var17 = var14.secondMultipleValue();
        final SubLObject var18 = var14.thirdMultipleValue();
        final SubLObject var19 = var14.fourthMultipleValue();
        var14.resetMultipleValues();
        try {
            if (module0045.NIL == module0024.f1253(var16)) {
                Errors.error((SubLObject)module0045.$ic5$, new SubLObject[] { var17, var19, var13, var18 });
            }
            var15 = f3139(var16, var3, var5, (SubLObject)module0045.NIL, (SubLObject)module0045.UNPROVIDED, (SubLObject)module0045.UNPROVIDED);
        }
        finally {
            final SubLObject var20 = Threads.$is_thread_performing_cleanupP$.currentBinding(var14);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0045.T, var14);
                if (module0045.NIL != module0024.f1253(var16)) {
                    module0024.f1257(var16);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var20, var14);
            }
        }
        return var15;
    }
    
    public static SubLObject f3141(final SubLObject var8, final SubLObject var3, SubLObject var5) {
        if (var5 == module0045.UNPROVIDED) {
            var5 = (SubLObject)module0045.NIL;
        }
        assert module0045.NIL != module0024.f1253(var8) : var8;
        assert module0045.NIL != Types.stringp(var3) : var3;
        if (module0045.NIL == module0024.f1250()) {
            return Values.values((SubLObject)module0045.NIL, (SubLObject)module0045.$ic4$);
        }
        return f3139(var8, var3, var5, (SubLObject)module0045.UNPROVIDED, (SubLObject)module0045.UNPROVIDED, (SubLObject)module0045.UNPROVIDED);
    }
    
    public static SubLObject f3139(final SubLObject var8, final SubLObject var3, SubLObject var5, SubLObject var15, SubLObject var16, SubLObject var17) {
        if (var5 == module0045.UNPROVIDED) {
            var5 = (SubLObject)module0045.NIL;
        }
        if (var15 == module0045.UNPROVIDED) {
            var15 = (SubLObject)module0045.T;
        }
        if (var16 == module0045.UNPROVIDED) {
            var16 = (SubLObject)module0045.ZERO_INTEGER;
        }
        if (var17 == module0045.UNPROVIDED) {
            var17 = Sequences.length(var3);
        }
        SubLObject var18 = (SubLObject)module0045.NIL;
        while (!var16.isNegative()) {
            SubLObject var20;
            final SubLObject var19 = var20 = module0024.f1255(var8, var3, (SubLObject)module0045.ONE_INTEGER, var5, var16, var17);
            SubLObject var21 = (SubLObject)module0045.NIL;
            var21 = var20.first();
            while (module0045.NIL != var20) {
                SubLObject var23;
                final SubLObject var22 = var23 = var21;
                SubLObject var24 = (SubLObject)module0045.NIL;
                SubLObject var25 = (SubLObject)module0045.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0045.$ic15$);
                var24 = var23.first();
                var23 = (var25 = var23.rest());
                if (!var24.isNegative()) {
                    if (module0045.NIL != var15) {
                        final SubLObject var26 = Sequences.subseq(var3, var24, var25);
                        var18 = (SubLObject)ConsesLow.cons(var26, var18);
                    }
                    else {
                        var18 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var24, var25), var18);
                    }
                }
                var16 = var25;
                var20 = var20.rest();
                var21 = var20.first();
            }
        }
        return Sequences.nreverse(var18);
    }
    
    public static SubLObject f3142(final SubLObject var2, final SubLObject var3, SubLObject var4, SubLObject var5) {
        if (var4 == module0045.UNPROVIDED) {
            var4 = (SubLObject)module0045.NIL;
        }
        if (var5 == module0045.UNPROVIDED) {
            var5 = (SubLObject)module0045.NIL;
        }
        final SubLThread var6 = SubLProcess.currentSubLThread();
        assert module0045.NIL != module0024.f1249(var2) : var2;
        assert module0045.NIL != Types.stringp(var3) : var3;
        if (module0045.NIL == module0024.f1250()) {
            return Values.values((SubLObject)module0045.NIL, (SubLObject)module0045.$ic4$);
        }
        SubLObject var7 = (SubLObject)module0045.NIL;
        var6.resetMultipleValues();
        final SubLObject var8 = module0024.f1251(var2, var4);
        final SubLObject var9 = var6.secondMultipleValue();
        final SubLObject var10 = var6.thirdMultipleValue();
        final SubLObject var11 = var6.fourthMultipleValue();
        var6.resetMultipleValues();
        try {
            if (module0045.NIL == module0024.f1253(var8)) {
                Errors.error((SubLObject)module0045.$ic5$, new SubLObject[] { var9, var11, var2, var10 });
            }
            var7 = f3143(var8, var3, var5);
        }
        finally {
            final SubLObject var12 = Threads.$is_thread_performing_cleanupP$.currentBinding(var6);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0045.T, var6);
                if (module0045.NIL != module0024.f1253(var8)) {
                    module0024.f1257(var8);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var12, var6);
            }
        }
        return var7;
    }
    
    public static SubLObject f3144(final SubLObject var13, final SubLObject var3, SubLObject var4, SubLObject var5) {
        if (var4 == module0045.UNPROVIDED) {
            var4 = (SubLObject)module0045.NIL;
        }
        if (var5 == module0045.UNPROVIDED) {
            var5 = (SubLObject)module0045.NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        assert module0045.NIL != module0024.f1249(var13) : var13;
        assert module0045.NIL != Types.stringp(var3) : var3;
        if (module0045.NIL != module0038.f2608(var13)) {
            return (SubLObject)module0045.NIL;
        }
        if (module0045.NIL == module0024.f1250()) {
            return Values.values((SubLObject)module0045.NIL, (SubLObject)module0045.$ic4$);
        }
        SubLObject var15 = (SubLObject)module0045.NIL;
        var14.resetMultipleValues();
        final SubLObject var16 = module0024.f1251(var13, var4);
        final SubLObject var17 = var14.secondMultipleValue();
        final SubLObject var18 = var14.thirdMultipleValue();
        final SubLObject var19 = var14.fourthMultipleValue();
        var14.resetMultipleValues();
        try {
            if (module0045.NIL == module0024.f1253(var16)) {
                Errors.error((SubLObject)module0045.$ic5$, new SubLObject[] { var17, var19, var13, var18 });
            }
            var15 = f3145(var16, var3, var5, (SubLObject)module0045.NIL, (SubLObject)module0045.UNPROVIDED, (SubLObject)module0045.UNPROVIDED);
        }
        finally {
            final SubLObject var20 = Threads.$is_thread_performing_cleanupP$.currentBinding(var14);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0045.T, var14);
                if (module0045.NIL != module0024.f1253(var16)) {
                    module0024.f1257(var16);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var20, var14);
            }
        }
        return var15;
    }
    
    public static SubLObject f3146(final SubLObject var8, final SubLObject var3, SubLObject var5) {
        if (var5 == module0045.UNPROVIDED) {
            var5 = (SubLObject)module0045.NIL;
        }
        assert module0045.NIL != module0024.f1253(var8) : var8;
        assert module0045.NIL != Types.stringp(var3) : var3;
        if (module0045.NIL == module0024.f1250()) {
            return Values.values((SubLObject)module0045.NIL, (SubLObject)module0045.$ic4$);
        }
        return f3145(var8, var3, var5, (SubLObject)module0045.UNPROVIDED, (SubLObject)module0045.UNPROVIDED, (SubLObject)module0045.UNPROVIDED);
    }
    
    public static SubLObject f3145(final SubLObject var8, final SubLObject var3, SubLObject var5, SubLObject var15, SubLObject var16, SubLObject var17) {
        if (var5 == module0045.UNPROVIDED) {
            var5 = (SubLObject)module0045.NIL;
        }
        if (var15 == module0045.UNPROVIDED) {
            var15 = (SubLObject)module0045.T;
        }
        if (var16 == module0045.UNPROVIDED) {
            var16 = (SubLObject)module0045.ZERO_INTEGER;
        }
        if (var17 == module0045.UNPROVIDED) {
            var17 = Sequences.length(var3);
        }
        SubLObject var18 = (SubLObject)module0045.NIL;
        while (!var16.isNegative()) {
            final SubLObject var19 = module0024.f1255(var8, var3, (SubLObject)module0045.TEN_INTEGER, var5, var16, var17);
            final SubLObject var20 = (SubLObject)module0045.NIL;
            SubLObject var21 = (SubLObject)module0045.NIL;
            if (!var19.first().first().isNegative()) {
                SubLObject var22 = (SubLObject)module0045.NIL;
                SubLObject var19_27 = (SubLObject)module0045.NIL;
                SubLObject var23 = (SubLObject)module0045.NIL;
                var22 = var19.rest();
                var19_27 = var22.first();
                for (var23 = (SubLObject)module0045.ZERO_INTEGER; module0045.NIL != var22; var22 = var22.rest(), var19_27 = var22.first(), var23 = Numbers.add((SubLObject)module0045.ONE_INTEGER, var23)) {
                    SubLObject var25;
                    final SubLObject var24 = var25 = var19_27;
                    SubLObject var26 = (SubLObject)module0045.NIL;
                    SubLObject var27 = (SubLObject)module0045.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)module0045.$ic15$);
                    var26 = var25.first();
                    var25 = (var27 = var25.rest());
                    if (module0045.NIL != var15) {
                        final SubLObject var28 = Sequences.subseq(var3, var26, var27);
                        var21 = (SubLObject)ConsesLow.cons(var28, var21);
                    }
                    else {
                        var21 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var26, var27), var21);
                    }
                }
                var18 = (SubLObject)ConsesLow.cons(Sequences.nreverse(var21), var18);
            }
            var16 = conses_high.cdar(var19);
        }
        return Sequences.nreverse(var18);
    }
    
    public static SubLObject f3147(final SubLObject var31, final SubLObject var3, SubLObject var5) {
        if (var5 == module0045.UNPROVIDED) {
            var5 = (SubLObject)module0045.NIL;
        }
        return f3145(module0024.f1251(var31, (SubLObject)module0045.UNPROVIDED), var3, var5, (SubLObject)module0045.UNPROVIDED, (SubLObject)module0045.UNPROVIDED, (SubLObject)module0045.UNPROVIDED);
    }
    
    public static SubLObject f3143(final SubLObject var8, final SubLObject var3, SubLObject var5) {
        if (var5 == module0045.UNPROVIDED) {
            var5 = (SubLObject)module0045.NIL;
        }
        final SubLObject var9 = module0024.f1255(var8, var3, (SubLObject)module0045.TEN_INTEGER, var5, (SubLObject)module0045.UNPROVIDED, (SubLObject)module0045.UNPROVIDED);
        SubLObject var10 = (SubLObject)module0045.NIL;
        SubLObject var11 = var9;
        SubLObject var12 = (SubLObject)module0045.NIL;
        var12 = var11.first();
        while (module0045.NIL != var11) {
            SubLObject var14;
            final SubLObject var13 = var14 = var12;
            SubLObject var15 = (SubLObject)module0045.NIL;
            SubLObject var16 = (SubLObject)module0045.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0045.$ic15$);
            var15 = var14.first();
            var14 = (var16 = var14.rest());
            if (var15.isNegative()) {
                var10 = (SubLObject)ConsesLow.cons((SubLObject)module0045.$ic20$, var10);
            }
            else {
                final SubLObject var17 = Sequences.subseq(var3, var15, var16);
                var10 = (SubLObject)ConsesLow.cons(var17, var10);
            }
            var11 = var11.rest();
            var12 = var11.first();
        }
        if (module0045.NIL != module0035.f1997(var10) && module0045.NIL != module0038.f2610(var10.first())) {
            return (SubLObject)module0045.NIL;
        }
        return Sequences.nreverse(var10);
    }
    
    public static SubLObject f3148(final SubLObject var8, final SubLObject var3) {
        return module0004.f106(module0024.f1255(var8, var3, (SubLObject)module0045.ONE_INTEGER, (SubLObject)module0045.UNPROVIDED, (SubLObject)module0045.UNPROVIDED, (SubLObject)module0045.UNPROVIDED).first().first());
    }
    
    public static SubLObject f3149(final SubLObject var34) {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        if (module0045.NIL == Errors.$ignore_mustsP$.getDynamicValue(var35) && (!var34.numG((SubLObject)module0045.ZERO_INTEGER) || !var34.numL((SubLObject)module0045.TEN_INTEGER))) {
            Errors.error((SubLObject)module0045.$ic21$);
        }
        SubLObject var36 = Vectors.aref(module0045.$g969$.getDynamicValue(var35), module0048.f_1_(var34));
        if (module0045.NIL == var36) {
            var36 = module0024.f1251(Sequences.cconcatenate((SubLObject)module0045.$ic22$, module0006.f207(var34)), (SubLObject)module0045.UNPROVIDED);
            Vectors.set_aref(module0045.$g969$.getDynamicValue(var35), module0048.f_1_(var34), var36);
        }
        return var36;
    }
    
    public static SubLObject f3150(final SubLObject var8, final SubLObject var35, final SubLObject var3, SubLObject var36) {
        if (var36 == module0045.UNPROVIDED) {
            var36 = (SubLObject)module0045.NIL;
        }
        assert module0045.NIL != module0024.f1253(var8) : var8;
        assert module0045.NIL != Types.stringp(var35) : var35;
        assert module0045.NIL != Types.stringp(var3) : var3;
        assert module0045.NIL != Types.listp(var36) : var36;
        SubLObject var37 = (SubLObject)module0045.ZERO_INTEGER;
        final SubLObject var38 = Sequences.length(var3);
        SubLObject var39 = (SubLObject)module0045.NIL;
        SubLObject var40 = (SubLObject)module0045.NIL;
        try {
            var40 = streams_high.make_private_string_output_stream();
            while (!var37.isNegative()) {
                final SubLObject var41 = module0024.f1255(var8, var3, (SubLObject)module0045.TEN_INTEGER, var36, var37, var38);
                final SubLObject var42 = var41.first();
                final SubLObject var43 = var42.first();
                final SubLObject var44 = var42.rest();
                final SubLObject var45 = var41.rest();
                SubLObject var46 = var35;
                SubLObject var47 = (SubLObject)module0045.ZERO_INTEGER;
                SubLObject var48 = var45;
                SubLObject var49 = (SubLObject)module0045.NIL;
                var49 = var48.first();
                while (module0045.NIL != var48) {
                    var47 = Numbers.add(var47, (SubLObject)module0045.ONE_INTEGER);
                    var46 = f3150(f3149(var47), Sequences.subseq(var3, var49.first(), var49.rest()), var46, var36);
                    var48 = var48.rest();
                    var49 = var48.first();
                }
                if (var43.isNegative()) {
                    streams_high.write_string(Sequences.subseq(var3, var37, var38), var40, (SubLObject)module0045.UNPROVIDED, (SubLObject)module0045.UNPROVIDED);
                }
                else {
                    streams_high.write_string(Sequences.subseq(var3, var37, var43), var40, (SubLObject)module0045.UNPROVIDED, (SubLObject)module0045.UNPROVIDED);
                    streams_high.write_string(var46, var40, (SubLObject)module0045.UNPROVIDED, (SubLObject)module0045.UNPROVIDED);
                }
                var37 = var44;
            }
            var39 = streams_high.get_output_stream_string(var40);
        }
        finally {
            final SubLObject var50 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0045.T);
                streams_high.close(var40, (SubLObject)module0045.UNPROVIDED);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var50);
            }
        }
        return var39;
    }
    
    public static SubLObject f3151(final SubLObject var2, final SubLObject var43, SubLObject var4, SubLObject var5) {
        if (var4 == module0045.UNPROVIDED) {
            var4 = (SubLObject)module0045.NIL;
        }
        if (var5 == module0045.UNPROVIDED) {
            var5 = (SubLObject)module0045.NIL;
        }
        final SubLThread var44 = SubLProcess.currentSubLThread();
        assert module0045.NIL != module0024.f1254(var2) : var2;
        assert module0045.NIL != Types.stringp(var43) : var43;
        if (module0045.NIL == module0024.f1250()) {
            return Values.values((SubLObject)module0045.NIL, (SubLObject)module0045.$ic4$);
        }
        SubLObject var45 = (SubLObject)module0045.NIL;
        var44.resetMultipleValues();
        final SubLObject var46 = module0024.f1251(var2, var4);
        final SubLObject var47 = var44.secondMultipleValue();
        final SubLObject var48 = var44.thirdMultipleValue();
        final SubLObject var49 = var44.fourthMultipleValue();
        var44.resetMultipleValues();
        try {
            if (module0045.NIL == module0024.f1253(var46)) {
                Errors.error((SubLObject)module0045.$ic5$, new SubLObject[] { var47, var49, var2, var48 });
            }
            var45 = f3152(var46, var43, var5);
        }
        finally {
            final SubLObject var50 = Threads.$is_thread_performing_cleanupP$.currentBinding(var44);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0045.T, var44);
                if (module0045.NIL != module0024.f1253(var46)) {
                    module0024.f1257(var46);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var50, var44);
            }
        }
        return var45;
    }
    
    public static SubLObject f3152(final SubLObject var8, final SubLObject var43, SubLObject var5) {
        if (var5 == module0045.UNPROVIDED) {
            var5 = (SubLObject)module0045.NIL;
        }
        final SubLThread var44 = SubLProcess.currentSubLThread();
        assert module0045.NIL != module0024.f1253(var8) : var8;
        assert module0045.NIL != Types.stringp(var43) : var43;
        if (module0045.NIL == module0024.f1250()) {
            return Values.values((SubLObject)module0045.NIL, (SubLObject)module0045.$ic4$);
        }
        SubLObject var45 = (SubLObject)module0045.NIL;
        SubLObject var46 = (SubLObject)module0045.NIL;
        try {
            final SubLObject var47 = stream_macros.$stream_requires_locking$.currentBinding(var44);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0045.NIL, var44);
                var46 = compatibility.open_text(var43, (SubLObject)module0045.$ic25$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var47, var44);
            }
            if (!var46.isStream()) {
                Errors.error((SubLObject)module0045.$ic26$, var43);
            }
            final SubLObject var38_45 = var46;
            var45 = f3153(var8, var38_45, var5);
        }
        finally {
            final SubLObject var48 = Threads.$is_thread_performing_cleanupP$.currentBinding(var44);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0045.T, var44);
                if (var46.isStream()) {
                    streams_high.close(var46, (SubLObject)module0045.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var48, var44);
            }
        }
        return var45;
    }
    
    public static SubLObject f3153(final SubLObject var8, final SubLObject var38, SubLObject var5) {
        if (var5 == module0045.UNPROVIDED) {
            var5 = (SubLObject)module0045.NIL;
        }
        SubLObject var39 = (SubLObject)module0045.NIL;
        SubLObject var40 = (SubLObject)module0045.NIL;
        SubLObject var41 = (SubLObject)module0045.NIL;
        var40 = (SubLObject)module0045.ONE_INTEGER;
        for (var41 = module0038.f2835(var38, (SubLObject)module0045.NIL, (SubLObject)module0045.NIL, (SubLObject)module0045.UNPROVIDED); module0045.NIL != var41; var41 = streams_high.read_line(var38, (SubLObject)module0045.NIL, (SubLObject)module0045.NIL, (SubLObject)module0045.UNPROVIDED)) {
            final SubLObject var42 = f3139(var8, var41, var5, (SubLObject)module0045.NIL, (SubLObject)module0045.UNPROVIDED, (SubLObject)module0045.UNPROVIDED);
            if (module0045.NIL != var42) {
                var39 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var40, var41, var42), var39);
            }
            var40 = Numbers.add(var40, (SubLObject)module0045.ONE_INTEGER);
        }
        return Sequences.nreverse(var39);
    }
    
    public static SubLObject f3154(final SubLObject var2, final SubLObject var49, SubLObject var4, SubLObject var5) {
        if (var4 == module0045.UNPROVIDED) {
            var4 = (SubLObject)module0045.NIL;
        }
        if (var5 == module0045.UNPROVIDED) {
            var5 = (SubLObject)module0045.NIL;
        }
        final SubLThread var50 = SubLProcess.currentSubLThread();
        assert module0045.NIL != module0024.f1254(var2) : var2;
        assert module0045.NIL != Types.vectorp(var49) : var49;
        if (module0045.NIL == module0024.f1250()) {
            return Values.values((SubLObject)module0045.NIL, (SubLObject)module0045.$ic4$);
        }
        SubLObject var51 = (SubLObject)module0045.NIL;
        var50.resetMultipleValues();
        final SubLObject var52 = module0024.f1251(var2, var4);
        final SubLObject var53 = var50.secondMultipleValue();
        final SubLObject var54 = var50.thirdMultipleValue();
        final SubLObject var55 = var50.fourthMultipleValue();
        var50.resetMultipleValues();
        try {
            if (module0045.NIL == module0024.f1253(var52)) {
                Errors.error((SubLObject)module0045.$ic5$, new SubLObject[] { var53, var55, var2, var54 });
            }
            var51 = f3155(var52, var49, var5);
        }
        finally {
            final SubLObject var56 = Threads.$is_thread_performing_cleanupP$.currentBinding(var50);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0045.T, var50);
                if (module0045.NIL != module0024.f1253(var52)) {
                    module0024.f1257(var52);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var56, var50);
            }
        }
        return var51;
    }
    
    public static SubLObject f3155(final SubLObject var8, final SubLObject var49, SubLObject var5) {
        if (var5 == module0045.UNPROVIDED) {
            var5 = (SubLObject)module0045.NIL;
        }
        assert module0045.NIL != Types.vectorp(var49) : var49;
        return f3156(var8, var49, var5);
    }
    
    public static SubLObject f3157(final SubLObject var2, final SubLObject var50, SubLObject var4, SubLObject var5) {
        if (var4 == module0045.UNPROVIDED) {
            var4 = (SubLObject)module0045.NIL;
        }
        if (var5 == module0045.UNPROVIDED) {
            var5 = (SubLObject)module0045.NIL;
        }
        final SubLThread var51 = SubLProcess.currentSubLThread();
        assert module0045.NIL != module0024.f1254(var2) : var2;
        assert module0045.NIL != Types.listp(var50) : var50;
        if (module0045.NIL == module0024.f1250()) {
            return Values.values((SubLObject)module0045.NIL, (SubLObject)module0045.$ic4$);
        }
        SubLObject var52 = (SubLObject)module0045.NIL;
        var51.resetMultipleValues();
        final SubLObject var53 = module0024.f1251(var2, var4);
        final SubLObject var54 = var51.secondMultipleValue();
        final SubLObject var55 = var51.thirdMultipleValue();
        final SubLObject var56 = var51.fourthMultipleValue();
        var51.resetMultipleValues();
        try {
            if (module0045.NIL == module0024.f1253(var53)) {
                Errors.error((SubLObject)module0045.$ic5$, new SubLObject[] { var54, var56, var2, var55 });
            }
            var52 = f3156(var53, var50, var5);
        }
        finally {
            final SubLObject var57 = Threads.$is_thread_performing_cleanupP$.currentBinding(var51);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0045.T, var51);
                if (module0045.NIL != module0024.f1253(var53)) {
                    module0024.f1257(var53);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var57, var51);
            }
        }
        return var52;
    }
    
    public static SubLObject f3156(final SubLObject var8, final SubLObject var51, SubLObject var5) {
        if (var5 == module0045.UNPROVIDED) {
            var5 = (SubLObject)module0045.NIL;
        }
        assert module0045.NIL != module0024.f1253(var8) : var8;
        assert module0045.NIL != Types.sequencep(var51) : var51;
        SubLObject var52 = (SubLObject)module0045.NIL;
        for (SubLObject var53 = var51, var54 = (SubLObject)(var53.isList() ? module0045.NIL : Sequences.length(var53)), var55 = (SubLObject)module0045.ZERO_INTEGER, var56 = module0005.f149(var55, var54, var53); module0045.NIL == var56; var56 = module0005.f149(var55, var54, var53)) {
            final SubLObject var57 = module0005.f150(var55, var53);
            if (var57.isString()) {
                final SubLObject var58 = f3139(var8, var57, var5, (SubLObject)module0045.NIL, (SubLObject)module0045.UNPROVIDED, (SubLObject)module0045.UNPROVIDED);
                if (module0045.NIL != var58) {
                    var52 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var55, var57, var58), var52);
                }
            }
            var53 = module0005.f151(var53);
            var55 = Numbers.add(var55, (SubLObject)module0045.ONE_INTEGER);
        }
        return Sequences.nreverse(var52);
    }
    
    public static SubLObject f3158(final SubLObject var3) {
        SubLObject var4 = (SubLObject)module0045.NIL;
        SubLObject var5 = (SubLObject)module0045.NIL;
        SubLObject var62_63;
        SubLObject var6;
        SubLObject var7;
        SubLObject var8;
        for (var6 = (var62_63 = Sequences.length(var3)), var7 = (SubLObject)module0045.NIL, var7 = (SubLObject)module0045.ZERO_INTEGER; !var7.numGE(var62_63); var7 = module0048.f_1X(var7)) {
            var8 = Strings.sublisp_char(var3, var7);
            if (module0045.NIL != Sequences.find(var8, module0045.$g970$.getGlobalValue(), (SubLObject)module0045.UNPROVIDED, (SubLObject)module0045.UNPROVIDED, (SubLObject)module0045.UNPROVIDED, (SubLObject)module0045.UNPROVIDED)) {
                var5 = (SubLObject)module0045.T;
            }
        }
        if (module0045.NIL == var5) {
            return var3;
        }
        SubLObject var9 = (SubLObject)module0045.NIL;
        try {
            var9 = streams_high.make_private_string_output_stream();
            SubLObject var62_64;
            SubLObject var10;
            SubLObject var11;
            SubLObject var12;
            for (var10 = (var62_64 = Sequences.length(var3)), var11 = (SubLObject)module0045.NIL, var11 = (SubLObject)module0045.ZERO_INTEGER; !var11.numGE(var62_64); var11 = module0048.f_1X(var11)) {
                var12 = Strings.sublisp_char(var3, var11);
                if (module0045.NIL != Sequences.find(var12, module0045.$g970$.getGlobalValue(), (SubLObject)module0045.UNPROVIDED, (SubLObject)module0045.UNPROVIDED, (SubLObject)module0045.UNPROVIDED, (SubLObject)module0045.UNPROVIDED)) {
                    PrintLow.format(var9, (SubLObject)module0045.$ic30$, var12);
                }
                else {
                    PrintLow.format(var9, (SubLObject)module0045.$ic31$, var12);
                }
            }
            var4 = streams_high.get_output_stream_string(var9);
        }
        finally {
            final SubLObject var13 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0045.T);
                streams_high.close(var9, (SubLObject)module0045.UNPROVIDED);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var13);
            }
        }
        return var4;
    }
    
    public static SubLObject f3159() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0045", "f3135", "S#4511", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0045", "f3136", "S#4512", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0045", "f3137", "S#4513", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0045", "f3138", "FIND-ALL-MATCHES-FOR-REGULAR-EXPRESSION", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0045", "f3140", "S#3942", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0045", "f3141", "S#4514", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0045", "f3139", "S#4515", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0045", "f3142", "S#4516", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0045", "f3144", "S#4517", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0045", "f3146", "S#4518", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0045", "f3145", "S#4519", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0045", "f3147", "S#4520", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0045", "f3143", "S#4521", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0045", "f3148", "S#4522", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0045", "f3149", "S#4523", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0045", "f3150", "S#4524", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0045", "f3151", "S#4525", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0045", "f3152", "S#4526", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0045", "f3153", "S#4527", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0045", "f3154", "S#4528", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0045", "f3155", "S#4529", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0045", "f3157", "S#4530", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0045", "f3156", "S#4531", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0045", "f3158", "S#3941", 1, 0, false);
        return (SubLObject)module0045.NIL;
    }
    
    public static SubLObject f3160() {
        module0045.$g968$ = SubLFiles.defconstant("S#4532", (SubLObject)module0045.$ic0$);
        module0045.$g969$ = SubLFiles.defvar("S#4533", Vectors.make_vector((SubLObject)module0045.TEN_INTEGER, (SubLObject)module0045.UNPROVIDED));
        module0045.$g970$ = SubLFiles.deflexical("S#4534", (SubLObject)module0045.$ic29$);
        return (SubLObject)module0045.NIL;
    }
    
    public static SubLObject f3161() {
        module0027.f1449((SubLObject)module0045.$ic6$, (SubLObject)ConsesLow.list(new SubLObject[] { module0045.$ic7$, Symbols.symbol_function((SubLObject)module0045.EQUAL), module0045.$ic8$, module0045.NIL, module0045.$ic9$, module0045.NIL, module0045.$ic10$, module0045.$ic11$, module0045.$ic12$, module0045.T }), (SubLObject)module0045.$ic13$);
        module0027.f1449((SubLObject)module0045.$ic16$, (SubLObject)ConsesLow.list(new SubLObject[] { module0045.$ic7$, module0045.EQUAL, module0045.$ic8$, module0045.NIL, module0045.$ic9$, module0045.NIL, module0045.$ic10$, module0045.$ic11$, module0045.$ic12$, module0045.T }), (SubLObject)module0045.$ic17$);
        module0027.f1449((SubLObject)module0045.$ic18$, (SubLObject)ConsesLow.list(new SubLObject[] { module0045.$ic7$, module0045.EQUAL, module0045.$ic8$, module0045.NIL, module0045.$ic9$, module0045.NIL, module0045.$ic10$, module0045.$ic11$, module0045.$ic12$, module0045.T }), (SubLObject)module0045.$ic19$);
        module0027.f1449((SubLObject)module0045.$ic32$, (SubLObject)ConsesLow.list(new SubLObject[] { module0045.$ic7$, Symbols.symbol_function((SubLObject)module0045.EQUAL), module0045.$ic8$, module0045.NIL, module0045.$ic9$, module0045.NIL, module0045.$ic10$, module0045.$ic11$, module0045.$ic12$, module0045.T }), (SubLObject)module0045.$ic33$);
        module0027.f1449((SubLObject)module0045.$ic34$, (SubLObject)ConsesLow.list(new SubLObject[] { module0045.$ic7$, Symbols.symbol_function((SubLObject)module0045.EQUAL), module0045.$ic8$, module0045.NIL, module0045.$ic9$, module0045.NIL, module0045.$ic10$, module0045.$ic11$, module0045.$ic12$, module0045.T }), (SubLObject)module0045.$ic35$);
        return (SubLObject)module0045.NIL;
    }
    
    public void declareFunctions() {
        f3159();
    }
    
    public void initializeVariables() {
        f3160();
    }
    
    public void runTopLevelForms() {
        f3161();
    }
    
    static {
        me = (SubLFile)new module0045();
        module0045.$g968$ = null;
        module0045.$g969$ = null;
        module0045.$g970$ = null;
        $ic0$ = SubLObjectFactory.makeString(".*?[]^()|+");
        $ic1$ = SubLObjectFactory.makeSymbol("S#4511", "CYC");
        $ic2$ = SubLObjectFactory.makeSymbol("S#2318", "CYC");
        $ic3$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic4$ = SubLObjectFactory.makeKeyword("REGULAR-EXPRESSION-SUPPORT-UNAVAILABLE");
        $ic5$ = SubLObjectFactory.makeString("Error ~A (~A) compiling regular expression ~S at offset ~A.");
        $ic6$ = SubLObjectFactory.makeSymbol("FIND-ALL-MATCHES-FOR-REGULAR-EXPRESSION");
        $ic7$ = SubLObjectFactory.makeKeyword("TEST");
        $ic8$ = SubLObjectFactory.makeKeyword("OWNER");
        $ic9$ = SubLObjectFactory.makeKeyword("CLASSES");
        $ic10$ = SubLObjectFactory.makeKeyword("KB");
        $ic11$ = SubLObjectFactory.makeKeyword("TINY");
        $ic12$ = SubLObjectFactory.makeKeyword("WORKING?");
        $ic13$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("[a-z]+"), (SubLObject)SubLObjectFactory.makeString("UPPER lower CASING matters")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("lower"), (SubLObject)SubLObjectFactory.makeString("matters"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("[0-9]+"), (SubLObject)SubLObjectFactory.makeString("Call me after 9 on my cell -- 342-4099")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("9"), (SubLObject)SubLObjectFactory.makeString("342"), (SubLObject)SubLObjectFactory.makeString("4099"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("[0-9.]+"), (SubLObject)SubLObjectFactory.makeString("The IP address of my machine is 127.0.0.1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("127.0.0.1"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("[0-9a-z.]+@[0-9a-z.]+"), (SubLObject)SubLObjectFactory.makeString("You can email me at poohbear@hundredacrewoods.org, if you want.")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("poohbear@hundredacrewoods.org"))));
        $ic14$ = SubLObjectFactory.makeSymbol("S#2321", "CYC");
        $ic15$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#2344", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2345", "CYC"));
        $ic16$ = SubLObjectFactory.makeSymbol("S#4520", "CYC");
        $ic17$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("(the[a-z]+) "), (SubLObject)SubLObjectFactory.makeString("their cats and these horses and them zebras and then he slept")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("their")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("these")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("them")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("then")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("([0-9]+)([a-zA-Z]+)"), (SubLObject)SubLObjectFactory.makeString("asd23asj2r;234234a")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("23"), (SubLObject)SubLObjectFactory.makeString("asj")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("2"), (SubLObject)SubLObjectFactory.makeString("r")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("234234"), (SubLObject)SubLObjectFactory.makeString("a")))));
        $ic18$ = SubLObjectFactory.makeSymbol("S#4516", "CYC");
        $ic19$ = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString(""), (SubLObject)SubLObjectFactory.makeString("")), (SubLObject)module0045.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the ((red|white) (king|queen))"), (SubLObject)SubLObjectFactory.makeString("the red queen")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the red queen"), (SubLObject)SubLObjectFactory.makeString("red queen"), (SubLObject)SubLObjectFactory.makeString("red"), (SubLObject)SubLObjectFactory.makeString("queen"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("(a|(z))(bc)"), (SubLObject)SubLObjectFactory.makeString("abc")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("abc"), (SubLObject)SubLObjectFactory.makeString("a"), (SubLObject)SubLObjectFactory.makeString(""), (SubLObject)SubLObjectFactory.makeString("bc"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("(a|(z))(bc)"), (SubLObject)SubLObjectFactory.makeString("azbca")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("zbc"), (SubLObject)SubLObjectFactory.makeString("z"), (SubLObject)SubLObjectFactory.makeString("z"), (SubLObject)SubLObjectFactory.makeString("bc"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("(a)+"), (SubLObject)SubLObjectFactory.makeString("aaaaa")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("aaaaa"), (SubLObject)SubLObjectFactory.makeString("a"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("(a+)"), (SubLObject)SubLObjectFactory.makeString("aaaaa")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("aaaaa"), (SubLObject)SubLObjectFactory.makeString("aaaaa"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("(.*)(ab)+\\1"), (SubLObject)SubLObjectFactory.makeString("xyzababxyz")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("xyzababxyz"), (SubLObject)SubLObjectFactory.makeString("xyz"), (SubLObject)SubLObjectFactory.makeString("ab"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("^(\\d+)\\s+\\d+\\s+\\1$"), (SubLObject)SubLObjectFactory.makeString("212 37337 212")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("212 37337 212"), (SubLObject)SubLObjectFactory.makeString("212"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("^(a(b)?)+$"), (SubLObject)SubLObjectFactory.makeString("aba")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("aba"), (SubLObject)SubLObjectFactory.makeString("a"), (SubLObject)SubLObjectFactory.makeString("b"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("^(aa(bb)?)+$"), (SubLObject)SubLObjectFactory.makeString("aabbaa")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("aabbaa"), (SubLObject)SubLObjectFactory.makeString("aa"), (SubLObject)SubLObjectFactory.makeString("bb"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("^(aa(b(b))?)+$"), (SubLObject)SubLObjectFactory.makeString("aabbaa")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("aabbaa"), (SubLObject)SubLObjectFactory.makeString("aa"), (SubLObject)SubLObjectFactory.makeString("bb"), (SubLObject)SubLObjectFactory.makeString("b"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("^(a)?a"), (SubLObject)SubLObjectFactory.makeString("a")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("a"), (SubLObject)SubLObjectFactory.makeString(""))) });
        $ic20$ = SubLObjectFactory.makeString("");
        $ic21$ = SubLObjectFactory.makeString("Invalid backreference \\~a");
        $ic22$ = SubLObjectFactory.makeString("\\\\");
        $ic23$ = SubLObjectFactory.makeSymbol("LISTP");
        $ic24$ = SubLObjectFactory.makeSymbol("S#2322", "CYC");
        $ic25$ = SubLObjectFactory.makeKeyword("INPUT");
        $ic26$ = SubLObjectFactory.makeString("Unable to open ~S");
        $ic27$ = SubLObjectFactory.makeSymbol("VECTORP");
        $ic28$ = SubLObjectFactory.makeSymbol("SEQUENCEP");
        $ic29$ = SubLObjectFactory.makeString("[]?.*^$()");
        $ic30$ = SubLObjectFactory.makeString("[\\~A]");
        $ic31$ = SubLObjectFactory.makeString("[~A]");
        $ic32$ = SubLObjectFactory.makeSymbol("S#4528", "CYC");
        $ic33$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("[a-z]+"), Vectors.vector(new SubLObject[] { SubLObjectFactory.makeString("UPPER"), SubLObjectFactory.makeString("lower"), SubLObjectFactory.makeString("CASING"), SubLObjectFactory.makeString("matters") })), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0045.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("lower"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)module0045.ZERO_INTEGER, (SubLObject)module0045.FIVE_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)module0045.THREE_INTEGER, (SubLObject)SubLObjectFactory.makeString("matters"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)module0045.ZERO_INTEGER, (SubLObject)module0045.SEVEN_INTEGER))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("[0-9]+"), Vectors.vector(new SubLObject[] { SubLObjectFactory.makeString("Call"), SubLObjectFactory.makeString("me"), SubLObjectFactory.makeString("after"), SubLObjectFactory.makeString("9"), SubLObjectFactory.makeString("on"), SubLObjectFactory.makeString("my"), SubLObjectFactory.makeString("cell"), SubLObjectFactory.makeString("--"), SubLObjectFactory.makeString("342-4099") })), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0045.THREE_INTEGER, (SubLObject)SubLObjectFactory.makeString("9"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)module0045.ZERO_INTEGER, (SubLObject)module0045.ONE_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)module0045.EIGHT_INTEGER, (SubLObject)SubLObjectFactory.makeString("342-4099"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)module0045.ZERO_INTEGER, (SubLObject)module0045.THREE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)module0045.FOUR_INTEGER, (SubLObject)module0045.EIGHT_INTEGER))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("[0-9.]+"), Vectors.vector(new SubLObject[] { SubLObjectFactory.makeString("The"), SubLObjectFactory.makeString("IP"), SubLObjectFactory.makeString("address"), SubLObjectFactory.makeString("of"), SubLObjectFactory.makeString("my"), SubLObjectFactory.makeString("machine"), SubLObjectFactory.makeString("is"), SubLObjectFactory.makeString("127.0.0.1") })), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0045.SEVEN_INTEGER, (SubLObject)SubLObjectFactory.makeString("127.0.0.1"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)module0045.ZERO_INTEGER, (SubLObject)module0045.NINE_INTEGER))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("[0-9a-z.]+@[0-9a-z.]+"), Vectors.vector(new SubLObject[] { SubLObjectFactory.makeString("You"), SubLObjectFactory.makeString("can"), SubLObjectFactory.makeString("email"), SubLObjectFactory.makeString("me"), SubLObjectFactory.makeString("at"), SubLObjectFactory.makeString("poohbear@hundredacrewoods.org,"), SubLObjectFactory.makeString("if"), SubLObjectFactory.makeString("you"), SubLObjectFactory.makeString("want.") })), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0045.FIVE_INTEGER, (SubLObject)SubLObjectFactory.makeString("poohbear@hundredacrewoods.org,"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)module0045.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(29)))))));
        $ic34$ = SubLObjectFactory.makeSymbol("S#4530", "CYC");
        $ic35$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("[a-z]+"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("UPPER"), (SubLObject)SubLObjectFactory.makeString("lower"), (SubLObject)SubLObjectFactory.makeString("CASING"), (SubLObject)SubLObjectFactory.makeString("matters"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0045.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("lower"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)module0045.ZERO_INTEGER, (SubLObject)module0045.FIVE_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)module0045.THREE_INTEGER, (SubLObject)SubLObjectFactory.makeString("matters"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)module0045.ZERO_INTEGER, (SubLObject)module0045.SEVEN_INTEGER))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("[0-9]+"), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("Call"), SubLObjectFactory.makeString("me"), SubLObjectFactory.makeString("after"), SubLObjectFactory.makeString("9"), SubLObjectFactory.makeString("on"), SubLObjectFactory.makeString("my"), SubLObjectFactory.makeString("cell"), SubLObjectFactory.makeString("--"), SubLObjectFactory.makeString("342-4099") })), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0045.THREE_INTEGER, (SubLObject)SubLObjectFactory.makeString("9"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)module0045.ZERO_INTEGER, (SubLObject)module0045.ONE_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)module0045.EIGHT_INTEGER, (SubLObject)SubLObjectFactory.makeString("342-4099"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)module0045.ZERO_INTEGER, (SubLObject)module0045.THREE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)module0045.FOUR_INTEGER, (SubLObject)module0045.EIGHT_INTEGER))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("[0-9.]+"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("The"), (SubLObject)SubLObjectFactory.makeString("IP"), (SubLObject)SubLObjectFactory.makeString("address"), (SubLObject)SubLObjectFactory.makeString("of"), (SubLObject)SubLObjectFactory.makeString("my"), (SubLObject)SubLObjectFactory.makeString("machine"), (SubLObject)SubLObjectFactory.makeString("is"), (SubLObject)SubLObjectFactory.makeString("127.0.0.1"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0045.SEVEN_INTEGER, (SubLObject)SubLObjectFactory.makeString("127.0.0.1"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)module0045.ZERO_INTEGER, (SubLObject)module0045.NINE_INTEGER))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("[0-9a-z.]+@[0-9a-z.]+"), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("You"), SubLObjectFactory.makeString("can"), SubLObjectFactory.makeString("email"), SubLObjectFactory.makeString("me"), SubLObjectFactory.makeString("at"), SubLObjectFactory.makeString("poohbear@hundredacrewoods.org,"), SubLObjectFactory.makeString("if"), SubLObjectFactory.makeString("you"), SubLObjectFactory.makeString("want.") })), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0045.FIVE_INTEGER, (SubLObject)SubLObjectFactory.makeString("poohbear@hundredacrewoods.org,"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)module0045.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(29)))))));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0045.class
	Total time: 281 ms
	
	Decompiled with Procyon 0.5.32.
*/