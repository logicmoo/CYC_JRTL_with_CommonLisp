package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Processes;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0046 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0046";
    public static final String myFingerPrint = "f478b368cf8f06e47ce17094e074ff370ef4f7a93684bcc2193e0ee735dcf07c";
    public static SubLSymbol $g971$;
    public static SubLSymbol $g972$;
    private static SubLSymbol $g973$;
    private static SubLSymbol $g974$;
    private static final SubLInteger $ic0$;
    private static final SubLString $ic1$;
    private static final SubLList $ic2$;
    private static final SubLList $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLString $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLString $ic23$;
    private static final SubLString $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    private static final SubLString $ic28$;
    private static final SubLString $ic29$;
    private static final SubLString $ic30$;
    private static final SubLString $ic31$;
    private static final SubLList $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLString $ic34$;
    private static final SubLString $ic35$;
    private static final SubLString $ic36$;
    private static final SubLString $ic37$;
    private static final SubLFloat $ic38$;
    private static final SubLString $ic39$;
    private static final SubLList $ic40$;
    private static final SubLList $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLString $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLString $ic49$;
    private static final SubLString $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLString $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLString $ic55$;
    private static final SubLString $ic56$;
    private static final SubLString $ic57$;
    private static final SubLString $ic58$;
    private static final SubLString $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLString $ic62$;
    private static final SubLString $ic63$;
    private static final SubLList $ic64$;
    private static final SubLString $ic65$;
    
    public static SubLObject f3162(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0046.$ic2$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0046.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0046.$ic2$);
        var6 = var4.first();
        var4 = var4.rest();
        SubLObject var7 = (SubLObject)module0046.NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)module0046.NIL;
        SubLObject var10_11 = (SubLObject)module0046.NIL;
        while (module0046.NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0046.$ic2$);
            var10_11 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0046.$ic2$);
            if (module0046.NIL == conses_high.member(var10_11, (SubLObject)module0046.$ic3$, (SubLObject)module0046.UNPROVIDED, (SubLObject)module0046.UNPROVIDED)) {
                var9 = (SubLObject)module0046.T;
            }
            if (var10_11 == module0046.$ic4$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (module0046.NIL != var9 && module0046.NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0046.$ic2$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)module0046.$ic5$, var4);
        final SubLObject var11 = (SubLObject)((module0046.NIL != var10) ? conses_high.cadr(var10) : module0046.NIL);
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0046.$ic6$, var4);
        final SubLObject var13 = (SubLObject)((module0046.NIL != var12) ? conses_high.cadr(var12) : module0046.NIL);
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)module0046.$ic7$, var4);
        final SubLObject var15 = (SubLObject)((module0046.NIL != var14) ? conses_high.cadr(var14) : module0046.NIL);
        final SubLObject var16 = cdestructuring_bind.property_list_member((SubLObject)module0046.$ic8$, var4);
        final SubLObject var17 = (SubLObject)((module0046.NIL != var16) ? conses_high.cadr(var16) : module0046.NIL);
        final SubLObject var18 = cdestructuring_bind.property_list_member((SubLObject)module0046.$ic9$, var4);
        final SubLObject var19 = (SubLObject)((module0046.NIL != var18) ? conses_high.cadr(var18) : module0046.$ic10$);
        final SubLObject var20 = cdestructuring_bind.property_list_member((SubLObject)module0046.$ic11$, var4);
        final SubLObject var21 = (SubLObject)((module0046.NIL != var20) ? conses_high.cadr(var20) : module0046.$ic12$);
        final SubLObject var22 = cdestructuring_bind.property_list_member((SubLObject)module0046.$ic13$, var4);
        final SubLObject var23 = (SubLObject)((module0046.NIL != var22) ? conses_high.cadr(var22) : module0046.NIL);
        final SubLObject var24;
        var4 = (var24 = var5);
        return (SubLObject)ConsesLow.list((SubLObject)module0046.$ic14$, (SubLObject)ConsesLow.listS(var6, var19, var21, (SubLObject)module0046.$ic13$, var23, (SubLObject)module0046.$ic15$), (SubLObject)ConsesLow.list((SubLObject)module0046.$ic16$, (SubLObject)ConsesLow.list((SubLObject)module0046.$ic17$, (SubLObject)ConsesLow.list((SubLObject)module0046.$ic18$, var6, var11, var13, var15, var17), (SubLObject)ConsesLow.list((SubLObject)module0046.$ic16$, reader.bq_cons((SubLObject)module0046.$ic17$, ConsesLow.append(var24, (SubLObject)module0046.NIL)), (SubLObject)ConsesLow.list((SubLObject)module0046.$ic19$, var6))), (SubLObject)ConsesLow.list((SubLObject)module0046.$ic20$, var6)));
    }
    
    public static SubLObject f3163(final SubLObject var6, final SubLObject var13, SubLObject var27, SubLObject var28, SubLObject var29) {
        if (var28 == module0046.UNPROVIDED) {
            var28 = (SubLObject)module0046.NIL;
        }
        if (var29 == module0046.UNPROVIDED) {
            var29 = (SubLObject)module0046.NIL;
        }
        assert module0046.NIL != Types.stringp(var13) : var13;
        var27 = f3164(var27);
        var28 = f3164(var28);
        var29 = f3164(var29);
        PrintLow.format(var6, (SubLObject)module0046.$ic23$, Environment.machine_instance());
        module0038.f2833(var6);
        f3165(var6);
        PrintLow.format(var6, (SubLObject)module0046.$ic24$, var13);
        module0038.f2833(var6);
        f3165(var6);
        SubLObject var30 = (SubLObject)ConsesLow.list(var27, var28, var29);
        SubLObject var31 = (SubLObject)module0046.NIL;
        var31 = var30.first();
        while (module0046.NIL != var30) {
            SubLObject var30_32 = var31;
            SubLObject var32 = (SubLObject)module0046.NIL;
            var32 = var30_32.first();
            while (module0046.NIL != var30_32) {
                PrintLow.format(var6, (SubLObject)module0046.$ic25$, var32);
                module0038.f2833(var6);
                f3165(var6);
                var30_32 = var30_32.rest();
                var32 = var30_32.first();
            }
            var30 = var30.rest();
            var31 = var30.first();
        }
        PrintLow.format(var6, (SubLObject)module0046.$ic26$);
        module0038.f2833(var6);
        f3165(var6);
        PrintLow.format(var6, (SubLObject)module0046.$ic27$, f3166((SubLObject)module0046.UNPROVIDED));
        module0038.f2833(var6);
        PrintLow.format(var6, (SubLObject)module0046.$ic28$, var13);
        module0038.f2833(var6);
        f3167(var27, (SubLObject)module0046.$ic29$, var6);
        f3167(var28, (SubLObject)module0046.$ic30$, var6);
        f3167(var29, (SubLObject)module0046.$ic31$, var6);
        return (SubLObject)module0046.NIL;
    }
    
    public static SubLObject f3164(SubLObject var27) {
        if (var27.isString()) {
            var27 = module0038.f2738(var27, (SubLObject)module0046.$ic32$, (SubLObject)module0046.UNPROVIDED, (SubLObject)module0046.UNPROVIDED, (SubLObject)module0046.UNPROVIDED, (SubLObject)module0046.UNPROVIDED, (SubLObject)module0046.UNPROVIDED);
        }
        else {
            assert module0046.NIL != Types.listp(var27) : var27;
            SubLObject var28 = var27;
            SubLObject var29 = (SubLObject)module0046.NIL;
            var29 = var28.first();
            while (module0046.NIL != var28) {
                assert module0046.NIL != Types.stringp(var29) : var29;
                var28 = var28.rest();
                var29 = var28.first();
            }
        }
        return var27;
    }
    
    public static SubLObject f3167(final SubLObject var31, final SubLObject var33, final SubLObject var6) {
        if (module0046.NIL != module0035.f2013(var31)) {
            PrintLow.format(var6, var33);
            SubLObject var34 = var31;
            SubLObject var35 = (SubLObject)module0046.NIL;
            var35 = var34.first();
            while (module0046.NIL != var34) {
                if (!var35.eql(var31.first())) {
                    PrintLow.format(var6, (SubLObject)module0046.$ic34$);
                }
                PrintLow.format(var6, (SubLObject)module0046.$ic35$, var35);
                var34 = var34.rest();
                var35 = var34.first();
            }
            module0038.f2833(var6);
        }
        return (SubLObject)module0046.NIL;
    }
    
    public static SubLObject f3168(final SubLObject var6) {
        module0038.f2833(var6);
        PrintLow.format(var6, (SubLObject)module0046.$ic36$);
        module0038.f2833(var6);
        f3165(var6);
        return (SubLObject)module0046.NIL;
    }
    
    public static SubLObject f3169(final SubLObject var6) {
        PrintLow.format(var6, (SubLObject)module0046.$ic37$);
        module0038.f2833(var6);
        f3165(var6);
        return (SubLObject)module0046.NIL;
    }
    
    public static SubLObject f3165(final SubLObject var6) {
        streams_high.force_output(var6);
        Threads.sleep(module0046.$g973$.getGlobalValue());
        f3170(var6);
        return (SubLObject)module0046.NIL;
    }
    
    public static SubLObject f3170(final SubLObject var6) {
        final SubLObject var7 = module0038.f2835(var6, (SubLObject)module0046.UNPROVIDED, (SubLObject)module0046.UNPROVIDED, (SubLObject)module0046.UNPROVIDED);
        if (module0046.NIL == f3171(var7)) {
            Errors.error(PrintLow.format((SubLObject)module0046.NIL, (SubLObject)module0046.$ic39$, var7));
        }
        return (SubLObject)module0046.NIL;
    }
    
    public static SubLObject f3171(final SubLObject var36) {
        if (var36.isString() && Sequences.length(var36).numG((SubLObject)module0046.ZERO_INTEGER)) {
            final SubLObject var37 = Strings.sublisp_char(var36, (SubLObject)module0046.ZERO_INTEGER);
            return (SubLObject)SubLObjectFactory.makeBoolean(module0046.NIL != Characters.charE(var37, (SubLObject)Characters.CHAR_2) || module0046.NIL != Characters.charE(var37, (SubLObject)Characters.CHAR_3));
        }
        return (SubLObject)module0046.NIL;
    }
    
    public static SubLObject f3172(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0046.NIL;
        SubLObject var6 = (SubLObject)module0046.NIL;
        SubLObject var7 = (SubLObject)module0046.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0046.$ic40$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0046.$ic40$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0046.$ic40$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)module0046.NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)module0046.NIL;
        SubLObject var44_45 = (SubLObject)module0046.NIL;
        while (module0046.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0046.$ic40$);
            var44_45 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0046.$ic40$);
            if (module0046.NIL == conses_high.member(var44_45, (SubLObject)module0046.$ic41$, (SubLObject)module0046.UNPROVIDED, (SubLObject)module0046.UNPROVIDED)) {
                var10 = (SubLObject)module0046.T;
            }
            if (var44_45 == module0046.$ic4$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0046.NIL != var10 && module0046.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0046.$ic40$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0046.$ic42$, var4);
        final SubLObject var12 = (SubLObject)((module0046.NIL != var11) ? conses_high.cadr(var11) : module0046.NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)module0046.$ic9$, var4);
        final SubLObject var14 = (SubLObject)((module0046.NIL != var13) ? conses_high.cadr(var13) : module0046.$ic10$);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)module0046.$ic43$, var4);
        final SubLObject var16 = (SubLObject)((module0046.NIL != var15) ? conses_high.cadr(var15) : module0046.NIL);
        final SubLObject var17 = cdestructuring_bind.property_list_member((SubLObject)module0046.$ic11$, var4);
        final SubLObject var18 = (module0046.NIL != var17) ? conses_high.cadr(var17) : module0046.$g971$.getGlobalValue();
        final SubLObject var19 = cdestructuring_bind.property_list_member((SubLObject)module0046.$ic13$, var4);
        final SubLObject var20 = (SubLObject)((module0046.NIL != var19) ? conses_high.cadr(var19) : module0046.TEN_INTEGER);
        final SubLObject var21 = cdestructuring_bind.property_list_member((SubLObject)module0046.$ic7$, var4);
        final SubLObject var22 = (SubLObject)((module0046.NIL != var21) ? conses_high.cadr(var21) : module0046.NIL);
        final SubLObject var23 = cdestructuring_bind.property_list_member((SubLObject)module0046.$ic8$, var4);
        final SubLObject var24 = (SubLObject)((module0046.NIL != var23) ? conses_high.cadr(var23) : module0046.NIL);
        return (SubLObject)ConsesLow.list(new SubLObject[] { module0046.$ic44$, var5, var6, var7, var12, var14, var16, var18, var20, var22, var24 });
    }
    
    public static SubLObject f3173(final SubLObject var13, final SubLObject var15, final SubLObject var40, SubLObject var47, SubLObject var21, SubLObject var50, SubLObject var23, SubLObject var25, SubLObject var17, SubLObject var19) {
        if (var47 == module0046.UNPROVIDED) {
            var47 = (SubLObject)module0046.NIL;
        }
        if (var21 == module0046.UNPROVIDED) {
            var21 = (SubLObject)module0046.$ic10$;
        }
        if (var50 == module0046.UNPROVIDED) {
            var50 = (SubLObject)module0046.NIL;
        }
        if (var23 == module0046.UNPROVIDED) {
            var23 = module0046.$g971$.getGlobalValue();
        }
        if (var25 == module0046.UNPROVIDED) {
            var25 = (SubLObject)module0046.TEN_INTEGER;
        }
        if (var17 == module0046.UNPROVIDED) {
            var17 = (SubLObject)module0046.NIL;
        }
        if (var19 == module0046.UNPROVIDED) {
            var19 = (SubLObject)module0046.NIL;
        }
        final SubLThread var51 = SubLProcess.currentSubLThread();
        SubLObject var52 = (SubLObject)module0046.NIL;
        SubLObject var53 = (SubLObject)module0046.NIL;
        final SubLObject var54 = (SubLObject)module0046.T;
        if (module0046.NIL != var54) {
            try {
                var51.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var55 = Errors.$error_handler$.currentBinding(var51);
                try {
                    Errors.$error_handler$.bind((SubLObject)module0046.$ic45$, var51);
                    try {
                        SubLObject var56 = (SubLObject)module0046.NIL;
                        try {
                            var56 = module0004.f82(var21, var23, var25, (SubLObject)module0046.$ic46$);
                            if (module0046.NIL != module0003.f70(var56, var21, var23)) {
                                try {
                                    f3163(var56, var13, var15, var17, var19);
                                    try {
                                        if (module0046.NIL != var47) {
                                            PrintLow.format(var56, (SubLObject)module0046.$ic47$, var47);
                                            module0038.f2833(var56);
                                        }
                                        if (module0046.NIL != var50) {
                                            PrintLow.format(var56, (SubLObject)module0046.$ic35$, var50);
                                            module0038.f2833(var56);
                                        }
                                        if (var40.isString()) {
                                            module0038.f2833(var56);
                                            PrintLow.format(var56, (SubLObject)module0046.$ic35$, var40);
                                        }
                                        else if (module0046.NIL != module0035.f2192((SubLObject)module0046.$ic48$, var40)) {
                                            module0047.f3231(var40, var56);
                                        }
                                        else {
                                            Errors.error((SubLObject)module0046.$ic49$, var40);
                                        }
                                        var52 = (SubLObject)module0046.T;
                                    }
                                    finally {
                                        final SubLObject var59_60 = Threads.$is_thread_performing_cleanupP$.currentBinding(var51);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0046.T, var51);
                                            f3168(var56);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var59_60, var51);
                                        }
                                    }
                                }
                                finally {
                                    final SubLObject var59_61 = Threads.$is_thread_performing_cleanupP$.currentBinding(var51);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0046.T, var51);
                                        f3169(var56);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var59_61, var51);
                                    }
                                }
                            }
                        }
                        finally {
                            final SubLObject var59_62 = Threads.$is_thread_performing_cleanupP$.currentBinding(var51);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0046.T, var51);
                                if (module0046.NIL != var56) {
                                    streams_high.close(var56, (SubLObject)module0046.UNPROVIDED);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var59_62, var51);
                            }
                        }
                    }
                    catch (Throwable var57) {
                        Errors.handleThrowable(var57, (SubLObject)module0046.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var55, var51);
                }
            }
            catch (Throwable var58) {
                var53 = Errors.handleThrowable(var58, module0003.$g3$.getGlobalValue());
            }
            finally {
                var51.throwStack.pop();
            }
        }
        else {
            SubLObject var59 = (SubLObject)module0046.NIL;
            try {
                var59 = module0004.f82(var21, var23, var25, (SubLObject)module0046.$ic46$);
                if (module0046.NIL != module0003.f70(var59, var21, var23)) {
                    try {
                        f3163(var59, var13, var15, var17, var19);
                        try {
                            if (module0046.NIL != var47) {
                                PrintLow.format(var59, (SubLObject)module0046.$ic47$, var47);
                                module0038.f2833(var59);
                            }
                            if (module0046.NIL != var50) {
                                PrintLow.format(var59, (SubLObject)module0046.$ic35$, var50);
                                module0038.f2833(var59);
                            }
                            if (var40.isString()) {
                                module0038.f2833(var59);
                                PrintLow.format(var59, (SubLObject)module0046.$ic35$, var40);
                            }
                            else if (module0046.NIL != module0035.f2192((SubLObject)module0046.$ic48$, var40)) {
                                module0047.f3231(var40, var59);
                            }
                            else {
                                Errors.error((SubLObject)module0046.$ic49$, var40);
                            }
                            var52 = (SubLObject)module0046.T;
                        }
                        finally {
                            final SubLObject var60 = Threads.$is_thread_performing_cleanupP$.currentBinding(var51);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0046.T, var51);
                                f3168(var59);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var60, var51);
                            }
                        }
                    }
                    finally {
                        final SubLObject var61 = Threads.$is_thread_performing_cleanupP$.currentBinding(var51);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0046.T, var51);
                            f3169(var59);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var61, var51);
                        }
                    }
                }
            }
            finally {
                final SubLObject var62 = Threads.$is_thread_performing_cleanupP$.currentBinding(var51);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0046.T, var51);
                    if (module0046.NIL != var59) {
                        streams_high.close(var59, (SubLObject)module0046.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var62, var51);
                }
            }
        }
        if (var53.isString()) {
            f3174(var13, var15, var40, var47, var21, var23, var53);
        }
        else if (module0046.NIL == var52) {
            var53 = PrintLow.format((SubLObject)module0046.NIL, (SubLObject)module0046.$ic50$, var25);
        }
        return Values.values(var52, var53);
    }
    
    public static SubLObject f3174(final SubLObject var13, final SubLObject var15, final SubLObject var40, SubLObject var47, SubLObject var21, SubLObject var23, SubLObject var57) {
        if (var47 == module0046.UNPROVIDED) {
            var47 = (SubLObject)module0046.NIL;
        }
        if (var21 == module0046.UNPROVIDED) {
            var21 = (SubLObject)module0046.NIL;
        }
        if (var23 == module0046.UNPROVIDED) {
            var23 = (SubLObject)module0046.NIL;
        }
        if (var57 == module0046.UNPROVIDED) {
            var57 = (SubLObject)module0046.NIL;
        }
        SubLObject var58 = (SubLObject)module0046.$ic51$;
        if (module0046.$g974$.getGlobalValue().isString()) {
            SubLObject var59 = (SubLObject)module0046.NIL;
            try {
                var59 = compatibility.open_text(module0046.$g974$.getGlobalValue(), (SubLObject)module0046.$ic52$);
                if (!var59.isStream()) {
                    Errors.error((SubLObject)module0046.$ic53$, module0046.$g974$.getGlobalValue());
                }
                final SubLObject var67_68 = var59;
                if (var67_68.isStream()) {
                    f3175(var67_68, var13, var15, var40, var47, var21, var23, var57);
                    var58 = (SubLObject)module0046.$ic54$;
                }
            }
            finally {
                final SubLObject var60 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0046.T);
                    if (var59.isStream()) {
                        streams_high.close(var59, (SubLObject)module0046.UNPROVIDED);
                    }
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var60);
                }
            }
        }
        return var58;
    }
    
    public static SubLObject f3175(final SubLObject var67, final SubLObject var13, final SubLObject var15, final SubLObject var40, final SubLObject var47, final SubLObject var21, final SubLObject var23, final SubLObject var57) {
        PrintLow.format(var67, (SubLObject)module0046.$ic55$, new SubLObject[] { var21, var23, var57 });
        PrintLow.format(var67, (SubLObject)module0046.$ic56$, f3166((SubLObject)module0046.UNPROVIDED));
        if (module0046.NIL != var13) {
            PrintLow.format(var67, (SubLObject)module0046.$ic57$, var13);
        }
        if (module0046.NIL != var15) {
            PrintLow.format(var67, (SubLObject)module0046.$ic58$, var15);
        }
        if (module0046.NIL != var47) {
            PrintLow.format(var67, (SubLObject)module0046.$ic59$, var47);
        }
        streams_high.terpri(var67);
        if (var40.isString()) {
            print_high.princ(var40, var67);
        }
        else {
            print_high.princ((SubLObject)module0046.$ic60$, var67);
        }
        streams_high.terpri(var67);
        streams_high.terpri(var67);
        return (SubLObject)module0046.$ic54$;
    }
    
    public static SubLObject f3176(final SubLObject var69) {
        final SubLThread var70 = SubLProcess.currentSubLThread();
        PrintLow.format(StreamsLow.$standard_output$.getDynamicValue(var70), (SubLObject)module0046.$ic61$, var69);
        streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue(var70));
        return var69;
    }
    
    public static SubLObject f3177() {
        final SubLObject var70 = Environment.get_machine_name((SubLObject)module0046.UNPROVIDED);
        SubLObject var71 = (SubLObject)module0046.$ic62$;
        final SubLObject var72 = module0038.f2702((SubLObject)Characters.CHAR_period, var70, (SubLObject)module0046.UNPROVIDED);
        if (module0046.NIL != var72) {
            var71 = Sequences.subseq(var71, module0048.f_1X(var72), (SubLObject)module0046.UNPROVIDED);
        }
        if (module0046.NIL == module0038.f2653(var71) && module0046.NIL != Processes.external_processes_supportedP()) {
            var71 = module0035.f2114(module0060.f4439((SubLObject)module0046.$ic63$, (SubLObject)module0046.UNPROVIDED, (SubLObject)module0046.UNPROVIDED, (SubLObject)module0046.UNPROVIDED));
            if (module0046.NIL == module0038.f2653(var71)) {
                var71 = module0035.f2114(module0060.f4439((SubLObject)module0046.$ic63$, (SubLObject)module0046.$ic64$, (SubLObject)module0046.UNPROVIDED, (SubLObject)module0046.UNPROVIDED));
            }
        }
        return var71;
    }
    
    public static SubLObject f3178(SubLObject var73) {
        if (var73 == module0046.UNPROVIDED) {
            var73 = (SubLObject)module0046.NIL;
        }
        final SubLObject var74 = var73.isString() ? var73 : Environment.get_user_name((SubLObject)module0046.UNPROVIDED);
        final SubLObject var75 = f3177();
        if (module0046.NIL != module0038.f2653(var75)) {
            return Sequences.cconcatenate(var74, new SubLObject[] { module0046.$ic65$, var75 });
        }
        return (SubLObject)module0046.NIL;
    }
    
    public static SubLObject f3179(final SubLObject var67, SubLObject var75) {
        if (var75 == module0046.UNPROVIDED) {
            var75 = Time.get_universal_time();
        }
        final SubLThread var76 = SubLProcess.currentSubLThread();
        var76.resetMultipleValues();
        final SubLObject var77 = Time.decode_universal_time(var75, (SubLObject)module0046.UNPROVIDED);
        final SubLObject var78 = var76.secondMultipleValue();
        final SubLObject var79 = var76.thirdMultipleValue();
        final SubLObject var80 = var76.fourthMultipleValue();
        final SubLObject var81 = var76.fifthMultipleValue();
        final SubLObject var82 = var76.sixthMultipleValue();
        final SubLObject var83 = var76.seventhMultipleValue();
        final SubLObject var84 = var76.eighthMultipleValue();
        final SubLObject var85 = SubLProcess.nthMultipleValue((SubLObject)module0046.EIGHT_INTEGER);
        var76.resetMultipleValues();
        final SubLObject var86 = (module0046.NIL != var84) ? Numbers.subtract((SubLObject)module0046.ONE_INTEGER, var85) : Numbers.minus(var85);
        streams_high.write_string(module0051.f3658(var83), var67, (SubLObject)module0046.UNPROVIDED, (SubLObject)module0046.UNPROVIDED);
        streams_high.write_string((SubLObject)module0046.$ic34$, var67, (SubLObject)module0046.UNPROVIDED, (SubLObject)module0046.UNPROVIDED);
        streams_high.write_string(print_high.princ_to_string(var80), var67, (SubLObject)module0046.UNPROVIDED, (SubLObject)module0046.UNPROVIDED);
        streams_high.write_char((SubLObject)Characters.CHAR_space, var67);
        streams_high.write_string(module0051.f3659(var81), var67, (SubLObject)module0046.UNPROVIDED, (SubLObject)module0046.UNPROVIDED);
        streams_high.write_char((SubLObject)Characters.CHAR_space, var67);
        print_high.princ(var82, var67);
        streams_high.write_char((SubLObject)Characters.CHAR_space, var67);
        module0012.f483(var79, var67);
        streams_high.write_char((SubLObject)Characters.CHAR_colon, var67);
        module0012.f483(var78, var67);
        streams_high.write_char((SubLObject)Characters.CHAR_colon, var67);
        module0012.f483(var77, var67);
        streams_high.write_char((SubLObject)Characters.CHAR_space, var67);
        if (var86.numL((SubLObject)module0046.ZERO_INTEGER)) {
            streams_high.write_char((SubLObject)Characters.CHAR_hyphen, var67);
            module0012.f483(Numbers.minus(var86), var67);
        }
        else {
            module0012.f483(var86, var67);
        }
        module0012.f483((SubLObject)module0046.ZERO_INTEGER, var67);
        return (SubLObject)module0046.NIL;
    }
    
    public static SubLObject f3166(SubLObject var75) {
        if (var75 == module0046.UNPROVIDED) {
            var75 = Time.get_universal_time();
        }
        SubLObject var76 = (SubLObject)module0046.NIL;
        SubLObject var77 = (SubLObject)module0046.NIL;
        try {
            var77 = streams_high.make_private_string_output_stream();
            f3179(var77, var75);
            var76 = streams_high.get_output_stream_string(var77);
        }
        finally {
            final SubLObject var78 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0046.T);
                streams_high.close(var77, (SubLObject)module0046.UNPROVIDED);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var78);
            }
        }
        return var76;
    }
    
    public static SubLObject f3180() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0046", "f3162", "S#4539");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0046", "f3163", "S#4540", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0046", "f3164", "S#4541", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0046", "f3167", "S#4542", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0046", "f3168", "S#4543", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0046", "f3169", "S#4544", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0046", "f3165", "S#4545", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0046", "f3170", "S#4546", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0046", "f3171", "S#4547", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0046", "f3172", "S#4548");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0046", "f3173", "S#4549", 3, 7, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0046", "f3174", "S#4550", 3, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0046", "f3175", "S#4551", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0046", "f3176", "S#4552", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0046", "f3177", "S#4553", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0046", "f3178", "S#4554", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0046", "f3179", "S#4555", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0046", "f3166", "S#4556", 0, 1, false);
        return (SubLObject)module0046.NIL;
    }
    
    public static SubLObject f3181() {
        module0046.$g971$ = SubLFiles.deflexical("S#4557", (SubLObject)module0046.$ic0$);
        module0046.$g972$ = SubLFiles.deflexical("S#4558", (SubLObject)module0046.$ic1$);
        module0046.$g973$ = SubLFiles.deflexical("S#4559", (SubLObject)module0046.$ic38$);
        module0046.$g974$ = SubLFiles.deflexical("S#4560", (SubLObject)module0046.NIL);
        return (SubLObject)module0046.NIL;
    }
    
    public static SubLObject f3182() {
        module0002.f50((SubLObject)module0046.$ic18$, (SubLObject)module0046.$ic21$);
        module0002.f50((SubLObject)module0046.$ic19$, (SubLObject)module0046.$ic21$);
        module0002.f50((SubLObject)module0046.$ic20$, (SubLObject)module0046.$ic21$);
        return (SubLObject)module0046.NIL;
    }
    
    public void declareFunctions() {
        f3180();
    }
    
    public void initializeVariables() {
        f3181();
    }
    
    public void runTopLevelForms() {
        f3182();
    }
    
    static {
        me = (SubLFile)new module0046();
        module0046.$g971$ = null;
        module0046.$g972$ = null;
        module0046.$g973$ = null;
        module0046.$g974$ = null;
        $ic0$ = SubLObjectFactory.makeInteger(25);
        $ic1$ = SubLObjectFactory.makeString("smtp.unknown.com");
        $ic2$ = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#4561", "CYC"), SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("S#4562", "CYC"), SubLObjectFactory.makeSymbol("S#4563", "CYC"), SubLObjectFactory.makeSymbol("S#4564", "CYC"), SubLObjectFactory.makeSymbol("S#4565", "CYC"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#57", "CYC"), (SubLObject)SubLObjectFactory.makeString("localhost")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#58", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#4557", "CYC"))), SubLObjectFactory.makeSymbol("S#59", "CYC") }), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FROM"), (SubLObject)SubLObjectFactory.makeKeyword("TO"), (SubLObject)SubLObjectFactory.makeKeyword("CC"), (SubLObject)SubLObjectFactory.makeKeyword("BCC"), (SubLObject)SubLObjectFactory.makeKeyword("HOST"), (SubLObject)SubLObjectFactory.makeKeyword("PORT"), (SubLObject)SubLObjectFactory.makeKeyword("TIMEOUT"));
        $ic4$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic5$ = SubLObjectFactory.makeKeyword("FROM");
        $ic6$ = SubLObjectFactory.makeKeyword("TO");
        $ic7$ = SubLObjectFactory.makeKeyword("CC");
        $ic8$ = SubLObjectFactory.makeKeyword("BCC");
        $ic9$ = SubLObjectFactory.makeKeyword("HOST");
        $ic10$ = SubLObjectFactory.makeString("localhost");
        $ic11$ = SubLObjectFactory.makeKeyword("PORT");
        $ic12$ = SubLObjectFactory.makeSymbol("S#4557", "CYC");
        $ic13$ = SubLObjectFactory.makeKeyword("TIMEOUT");
        $ic14$ = SubLObjectFactory.makeSymbol("S#47", "CYC");
        $ic15$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ACCESS-MODE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE"));
        $ic16$ = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $ic17$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic18$ = SubLObjectFactory.makeSymbol("S#4540", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#4543", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#4544", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#4539", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic23$ = SubLObjectFactory.makeString("HELO ~A");
        $ic24$ = SubLObjectFactory.makeString("MAIL FROM: <~A>");
        $ic25$ = SubLObjectFactory.makeString("RCPT TO: <~A>");
        $ic26$ = SubLObjectFactory.makeString("DATA");
        $ic27$ = SubLObjectFactory.makeString("Date: ~A");
        $ic28$ = SubLObjectFactory.makeString("From: ~A");
        $ic29$ = SubLObjectFactory.makeString("To: ");
        $ic30$ = SubLObjectFactory.makeString("Cc: ");
        $ic31$ = SubLObjectFactory.makeString("Bcc: ");
        $ic32$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString(", "), (SubLObject)SubLObjectFactory.makeString(","));
        $ic33$ = SubLObjectFactory.makeSymbol("LISTP");
        $ic34$ = SubLObjectFactory.makeString(", ");
        $ic35$ = SubLObjectFactory.makeString("~A");
        $ic36$ = SubLObjectFactory.makeString(".");
        $ic37$ = SubLObjectFactory.makeString("QUIT");
        $ic38$ = (SubLFloat)SubLObjectFactory.makeDouble(0.005);
        $ic39$ = SubLObjectFactory.makeString("SMTP error: ~A");
        $ic40$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#4562", "CYC"), SubLObjectFactory.makeSymbol("S#4563", "CYC"), SubLObjectFactory.makeSymbol("S#295", "CYC"), SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("S#4566", "CYC"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#57", "CYC"), (SubLObject)SubLObjectFactory.makeString("localhost")), SubLObjectFactory.makeSymbol("S#4567", "CYC"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#58", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#4557", "CYC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#59", "CYC"), (SubLObject)module0046.TEN_INTEGER), SubLObjectFactory.makeSymbol("S#4564", "CYC"), SubLObjectFactory.makeSymbol("S#4565", "CYC") });
        $ic41$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUBJECT"), (SubLObject)SubLObjectFactory.makeKeyword("HOST"), (SubLObject)SubLObjectFactory.makeKeyword("ADDITIONAL-HEADERS"), (SubLObject)SubLObjectFactory.makeKeyword("PORT"), (SubLObject)SubLObjectFactory.makeKeyword("TIMEOUT"), (SubLObject)SubLObjectFactory.makeKeyword("CC"), (SubLObject)SubLObjectFactory.makeKeyword("BCC"));
        $ic42$ = SubLObjectFactory.makeKeyword("SUBJECT");
        $ic43$ = SubLObjectFactory.makeKeyword("ADDITIONAL-HEADERS");
        $ic44$ = SubLObjectFactory.makeSymbol("S#4549", "CYC");
        $ic45$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic46$ = SubLObjectFactory.makeKeyword("PRIVATE");
        $ic47$ = SubLObjectFactory.makeString("Subject: ~A");
        $ic48$ = SubLObjectFactory.makeSymbol("S#4568", "CYC");
        $ic49$ = SubLObjectFactory.makeString("Message must be a string or a list of message parts, not ~S");
        $ic50$ = SubLObjectFactory.makeString("SMTP connection apparently timed out after ~S seconds.");
        $ic51$ = SubLObjectFactory.makeKeyword("NOT-LOGGED");
        $ic52$ = SubLObjectFactory.makeKeyword("APPEND");
        $ic53$ = SubLObjectFactory.makeString("Unable to open ~S");
        $ic54$ = SubLObjectFactory.makeKeyword("LOGGED");
        $ic55$ = SubLObjectFactory.makeString("~&The following message with host ~S (port ~S) failed with the error:~% ~S.~%");
        $ic56$ = SubLObjectFactory.makeString("Date: ~A~%");
        $ic57$ = SubLObjectFactory.makeString("From: ~A~%");
        $ic58$ = SubLObjectFactory.makeString("To: ~A~%");
        $ic59$ = SubLObjectFactory.makeString("Subject: ~A~%");
        $ic60$ = SubLObjectFactory.makeString("--no message--");
        $ic61$ = SubLObjectFactory.makeString("~&~A~&");
        $ic62$ = SubLObjectFactory.makeString("");
        $ic63$ = SubLObjectFactory.makeString("domainname");
        $ic64$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("-d"));
        $ic65$ = SubLObjectFactory.makeString("@");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0046.class
	Total time: 352 ms
	
	Decompiled with Procyon 0.5.32.
*/