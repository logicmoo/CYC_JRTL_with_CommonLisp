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
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic2$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic2$);
        var6 = var4.first();
        var4 = var4.rest();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10_11 = (SubLObject)NIL;
        while (NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)$ic2$);
            var10_11 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)$ic2$);
            if (NIL == conses_high.member(var10_11, (SubLObject)$ic3$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var9 = (SubLObject)T;
            }
            if (var10_11 == $ic4$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (NIL != var9 && NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic2$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)$ic5$, var4);
        final SubLObject var11 = (SubLObject)((NIL != var10) ? conses_high.cadr(var10) : NIL);
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic6$, var4);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : NIL);
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)$ic7$, var4);
        final SubLObject var15 = (SubLObject)((NIL != var14) ? conses_high.cadr(var14) : NIL);
        final SubLObject var16 = cdestructuring_bind.property_list_member((SubLObject)$ic8$, var4);
        final SubLObject var17 = (SubLObject)((NIL != var16) ? conses_high.cadr(var16) : NIL);
        final SubLObject var18 = cdestructuring_bind.property_list_member((SubLObject)$ic9$, var4);
        final SubLObject var19 = (SubLObject)((NIL != var18) ? conses_high.cadr(var18) : $ic10$);
        final SubLObject var20 = cdestructuring_bind.property_list_member((SubLObject)$ic11$, var4);
        final SubLObject var21 = (SubLObject)((NIL != var20) ? conses_high.cadr(var20) : $ic12$);
        final SubLObject var22 = cdestructuring_bind.property_list_member((SubLObject)$ic13$, var4);
        final SubLObject var23 = (SubLObject)((NIL != var22) ? conses_high.cadr(var22) : NIL);
        final SubLObject var24;
        var4 = (var24 = var5);
        return (SubLObject)ConsesLow.list((SubLObject)$ic14$, (SubLObject)ConsesLow.listS(var6, var19, var21, (SubLObject)$ic13$, var23, (SubLObject)$ic15$), (SubLObject)ConsesLow.list((SubLObject)$ic16$, (SubLObject)ConsesLow.list((SubLObject)$ic17$, (SubLObject)ConsesLow.list((SubLObject)$ic18$, var6, var11, var13, var15, var17), (SubLObject)ConsesLow.list((SubLObject)$ic16$, reader.bq_cons((SubLObject)$ic17$, ConsesLow.append(var24, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic19$, var6))), (SubLObject)ConsesLow.list((SubLObject)$ic20$, var6)));
    }
    
    public static SubLObject f3163(final SubLObject var6, final SubLObject var13, SubLObject var27, SubLObject var28, SubLObject var29) {
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)NIL;
        }
        if (var29 == UNPROVIDED) {
            var29 = (SubLObject)NIL;
        }
        assert NIL != Types.stringp(var13) : var13;
        var27 = f3164(var27);
        var28 = f3164(var28);
        var29 = f3164(var29);
        PrintLow.format(var6, (SubLObject)$ic23$, Environment.machine_instance());
        module0038.f2833(var6);
        f3165(var6);
        PrintLow.format(var6, (SubLObject)$ic24$, var13);
        module0038.f2833(var6);
        f3165(var6);
        SubLObject var30 = (SubLObject)ConsesLow.list(var27, var28, var29);
        SubLObject var31 = (SubLObject)NIL;
        var31 = var30.first();
        while (NIL != var30) {
            SubLObject var30_32 = var31;
            SubLObject var32 = (SubLObject)NIL;
            var32 = var30_32.first();
            while (NIL != var30_32) {
                PrintLow.format(var6, (SubLObject)$ic25$, var32);
                module0038.f2833(var6);
                f3165(var6);
                var30_32 = var30_32.rest();
                var32 = var30_32.first();
            }
            var30 = var30.rest();
            var31 = var30.first();
        }
        PrintLow.format(var6, (SubLObject)$ic26$);
        module0038.f2833(var6);
        f3165(var6);
        PrintLow.format(var6, (SubLObject)$ic27$, f3166((SubLObject)UNPROVIDED));
        module0038.f2833(var6);
        PrintLow.format(var6, (SubLObject)$ic28$, var13);
        module0038.f2833(var6);
        f3167(var27, (SubLObject)$ic29$, var6);
        f3167(var28, (SubLObject)$ic30$, var6);
        f3167(var29, (SubLObject)$ic31$, var6);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3164(SubLObject var27) {
        if (var27.isString()) {
            var27 = module0038.f2738(var27, (SubLObject)$ic32$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else {
            assert NIL != Types.listp(var27) : var27;
            SubLObject var28 = var27;
            SubLObject var29 = (SubLObject)NIL;
            var29 = var28.first();
            while (NIL != var28) {
                assert NIL != Types.stringp(var29) : var29;
                var28 = var28.rest();
                var29 = var28.first();
            }
        }
        return var27;
    }
    
    public static SubLObject f3167(final SubLObject var31, final SubLObject var33, final SubLObject var6) {
        if (NIL != module0035.f2013(var31)) {
            PrintLow.format(var6, var33);
            SubLObject var34 = var31;
            SubLObject var35 = (SubLObject)NIL;
            var35 = var34.first();
            while (NIL != var34) {
                if (!var35.eql(var31.first())) {
                    PrintLow.format(var6, (SubLObject)$ic34$);
                }
                PrintLow.format(var6, (SubLObject)$ic35$, var35);
                var34 = var34.rest();
                var35 = var34.first();
            }
            module0038.f2833(var6);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3168(final SubLObject var6) {
        module0038.f2833(var6);
        PrintLow.format(var6, (SubLObject)$ic36$);
        module0038.f2833(var6);
        f3165(var6);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3169(final SubLObject var6) {
        PrintLow.format(var6, (SubLObject)$ic37$);
        module0038.f2833(var6);
        f3165(var6);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3165(final SubLObject var6) {
        streams_high.force_output(var6);
        Threads.sleep($g973$.getGlobalValue());
        f3170(var6);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3170(final SubLObject var6) {
        final SubLObject var7 = module0038.f2835(var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL == f3171(var7)) {
            Errors.error(PrintLow.format((SubLObject)NIL, (SubLObject)$ic39$, var7));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3171(final SubLObject var36) {
        if (var36.isString() && Sequences.length(var36).numG((SubLObject)ZERO_INTEGER)) {
            final SubLObject var37 = Strings.sublisp_char(var36, (SubLObject)ZERO_INTEGER);
            return (SubLObject)makeBoolean(NIL != Characters.charE(var37, (SubLObject)Characters.CHAR_2) || NIL != Characters.charE(var37, (SubLObject)Characters.CHAR_3));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3172(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic40$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic40$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic40$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var44_45 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic40$);
            var44_45 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic40$);
            if (NIL == conses_high.member(var44_45, (SubLObject)$ic41$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var44_45 == $ic4$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic40$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic42$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic9$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : $ic10$);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)$ic43$, var4);
        final SubLObject var16 = (SubLObject)((NIL != var15) ? conses_high.cadr(var15) : NIL);
        final SubLObject var17 = cdestructuring_bind.property_list_member((SubLObject)$ic11$, var4);
        final SubLObject var18 = (NIL != var17) ? conses_high.cadr(var17) : $g971$.getGlobalValue();
        final SubLObject var19 = cdestructuring_bind.property_list_member((SubLObject)$ic13$, var4);
        final SubLObject var20 = (SubLObject)((NIL != var19) ? conses_high.cadr(var19) : TEN_INTEGER);
        final SubLObject var21 = cdestructuring_bind.property_list_member((SubLObject)$ic7$, var4);
        final SubLObject var22 = (SubLObject)((NIL != var21) ? conses_high.cadr(var21) : NIL);
        final SubLObject var23 = cdestructuring_bind.property_list_member((SubLObject)$ic8$, var4);
        final SubLObject var24 = (SubLObject)((NIL != var23) ? conses_high.cadr(var23) : NIL);
        return (SubLObject)ConsesLow.list(new SubLObject[] { $ic44$, var5, var6, var7, var12, var14, var16, var18, var20, var22, var24 });
    }
    
    public static SubLObject f3173(final SubLObject var13, final SubLObject var15, final SubLObject var40, SubLObject var47, SubLObject var21, SubLObject var50, SubLObject var23, SubLObject var25, SubLObject var17, SubLObject var19) {
        if (var47 == UNPROVIDED) {
            var47 = (SubLObject)NIL;
        }
        if (var21 == UNPROVIDED) {
            var21 = (SubLObject)$ic10$;
        }
        if (var50 == UNPROVIDED) {
            var50 = (SubLObject)NIL;
        }
        if (var23 == UNPROVIDED) {
            var23 = $g971$.getGlobalValue();
        }
        if (var25 == UNPROVIDED) {
            var25 = (SubLObject)TEN_INTEGER;
        }
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLThread var51 = SubLProcess.currentSubLThread();
        SubLObject var52 = (SubLObject)NIL;
        SubLObject var53 = (SubLObject)NIL;
        final SubLObject var54 = (SubLObject)T;
        if (NIL != var54) {
            try {
                var51.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var55 = Errors.$error_handler$.currentBinding(var51);
                try {
                    Errors.$error_handler$.bind((SubLObject)$ic45$, var51);
                    try {
                        SubLObject var56 = (SubLObject)NIL;
                        try {
                            var56 = module0004.f82(var21, var23, var25, (SubLObject)$ic46$);
                            if (NIL != module0003.f70(var56, var21, var23)) {
                                try {
                                    f3163(var56, var13, var15, var17, var19);
                                    try {
                                        if (NIL != var47) {
                                            PrintLow.format(var56, (SubLObject)$ic47$, var47);
                                            module0038.f2833(var56);
                                        }
                                        if (NIL != var50) {
                                            PrintLow.format(var56, (SubLObject)$ic35$, var50);
                                            module0038.f2833(var56);
                                        }
                                        if (var40.isString()) {
                                            module0038.f2833(var56);
                                            PrintLow.format(var56, (SubLObject)$ic35$, var40);
                                        }
                                        else if (NIL != module0035.f2192((SubLObject)$ic48$, var40)) {
                                            module0047.f3231(var40, var56);
                                        }
                                        else {
                                            Errors.error((SubLObject)$ic49$, var40);
                                        }
                                        var52 = (SubLObject)T;
                                    }
                                    finally {
                                        final SubLObject var59_60 = Threads.$is_thread_performing_cleanupP$.currentBinding(var51);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var51);
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
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var51);
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
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var51);
                                if (NIL != var56) {
                                    streams_high.close(var56, (SubLObject)UNPROVIDED);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var59_62, var51);
                            }
                        }
                    }
                    catch (Throwable var57) {
                        Errors.handleThrowable(var57, (SubLObject)NIL);
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
            SubLObject var59 = (SubLObject)NIL;
            try {
                var59 = module0004.f82(var21, var23, var25, (SubLObject)$ic46$);
                if (NIL != module0003.f70(var59, var21, var23)) {
                    try {
                        f3163(var59, var13, var15, var17, var19);
                        try {
                            if (NIL != var47) {
                                PrintLow.format(var59, (SubLObject)$ic47$, var47);
                                module0038.f2833(var59);
                            }
                            if (NIL != var50) {
                                PrintLow.format(var59, (SubLObject)$ic35$, var50);
                                module0038.f2833(var59);
                            }
                            if (var40.isString()) {
                                module0038.f2833(var59);
                                PrintLow.format(var59, (SubLObject)$ic35$, var40);
                            }
                            else if (NIL != module0035.f2192((SubLObject)$ic48$, var40)) {
                                module0047.f3231(var40, var59);
                            }
                            else {
                                Errors.error((SubLObject)$ic49$, var40);
                            }
                            var52 = (SubLObject)T;
                        }
                        finally {
                            final SubLObject var60 = Threads.$is_thread_performing_cleanupP$.currentBinding(var51);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var51);
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
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var51);
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
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var51);
                    if (NIL != var59) {
                        streams_high.close(var59, (SubLObject)UNPROVIDED);
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
        else if (NIL == var52) {
            var53 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic50$, var25);
        }
        return Values.values(var52, var53);
    }
    
    public static SubLObject f3174(final SubLObject var13, final SubLObject var15, final SubLObject var40, SubLObject var47, SubLObject var21, SubLObject var23, SubLObject var57) {
        if (var47 == UNPROVIDED) {
            var47 = (SubLObject)NIL;
        }
        if (var21 == UNPROVIDED) {
            var21 = (SubLObject)NIL;
        }
        if (var23 == UNPROVIDED) {
            var23 = (SubLObject)NIL;
        }
        if (var57 == UNPROVIDED) {
            var57 = (SubLObject)NIL;
        }
        SubLObject var58 = (SubLObject)$ic51$;
        if ($g974$.getGlobalValue().isString()) {
            SubLObject var59 = (SubLObject)NIL;
            try {
                var59 = compatibility.open_text($g974$.getGlobalValue(), (SubLObject)$ic52$);
                if (!var59.isStream()) {
                    Errors.error((SubLObject)$ic53$, $g974$.getGlobalValue());
                }
                final SubLObject var67_68 = var59;
                if (var67_68.isStream()) {
                    f3175(var67_68, var13, var15, var40, var47, var21, var23, var57);
                    var58 = (SubLObject)$ic54$;
                }
            }
            finally {
                final SubLObject var60 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                    if (var59.isStream()) {
                        streams_high.close(var59, (SubLObject)UNPROVIDED);
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
        PrintLow.format(var67, (SubLObject)$ic55$, new SubLObject[] { var21, var23, var57 });
        PrintLow.format(var67, (SubLObject)$ic56$, f3166((SubLObject)UNPROVIDED));
        if (NIL != var13) {
            PrintLow.format(var67, (SubLObject)$ic57$, var13);
        }
        if (NIL != var15) {
            PrintLow.format(var67, (SubLObject)$ic58$, var15);
        }
        if (NIL != var47) {
            PrintLow.format(var67, (SubLObject)$ic59$, var47);
        }
        streams_high.terpri(var67);
        if (var40.isString()) {
            print_high.princ(var40, var67);
        }
        else {
            print_high.princ((SubLObject)$ic60$, var67);
        }
        streams_high.terpri(var67);
        streams_high.terpri(var67);
        return (SubLObject)$ic54$;
    }
    
    public static SubLObject f3176(final SubLObject var69) {
        final SubLThread var70 = SubLProcess.currentSubLThread();
        PrintLow.format(StreamsLow.$standard_output$.getDynamicValue(var70), (SubLObject)$ic61$, var69);
        streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue(var70));
        return var69;
    }
    
    public static SubLObject f3177() {
        final SubLObject var70 = Environment.get_machine_name((SubLObject)UNPROVIDED);
        SubLObject var71 = (SubLObject)$ic62$;
        final SubLObject var72 = module0038.f2702((SubLObject)Characters.CHAR_period, var70, (SubLObject)UNPROVIDED);
        if (NIL != var72) {
            var71 = Sequences.subseq(var71, module0048.f_1X(var72), (SubLObject)UNPROVIDED);
        }
        if (NIL == module0038.f2653(var71) && NIL != Processes.external_processes_supportedP()) {
            var71 = module0035.f2114(module0060.f4439((SubLObject)$ic63$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            if (NIL == module0038.f2653(var71)) {
                var71 = module0035.f2114(module0060.f4439((SubLObject)$ic63$, (SubLObject)$ic64$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            }
        }
        return var71;
    }
    
    public static SubLObject f3178(SubLObject var73) {
        if (var73 == UNPROVIDED) {
            var73 = (SubLObject)NIL;
        }
        final SubLObject var74 = var73.isString() ? var73 : Environment.get_user_name((SubLObject)UNPROVIDED);
        final SubLObject var75 = f3177();
        if (NIL != module0038.f2653(var75)) {
            return Sequences.cconcatenate(var74, new SubLObject[] { $ic65$, var75 });
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3179(final SubLObject var67, SubLObject var75) {
        if (var75 == UNPROVIDED) {
            var75 = Time.get_universal_time();
        }
        final SubLThread var76 = SubLProcess.currentSubLThread();
        var76.resetMultipleValues();
        final SubLObject var77 = Time.decode_universal_time(var75, (SubLObject)UNPROVIDED);
        final SubLObject var78 = var76.secondMultipleValue();
        final SubLObject var79 = var76.thirdMultipleValue();
        final SubLObject var80 = var76.fourthMultipleValue();
        final SubLObject var81 = var76.fifthMultipleValue();
        final SubLObject var82 = var76.sixthMultipleValue();
        final SubLObject var83 = var76.seventhMultipleValue();
        final SubLObject var84 = var76.eighthMultipleValue();
        final SubLObject var85 = SubLProcess.nthMultipleValue((SubLObject)EIGHT_INTEGER);
        var76.resetMultipleValues();
        final SubLObject var86 = (NIL != var84) ? Numbers.subtract((SubLObject)ONE_INTEGER, var85) : Numbers.minus(var85);
        streams_high.write_string(module0051.f3658(var83), var67, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        streams_high.write_string((SubLObject)$ic34$, var67, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        streams_high.write_string(print_high.princ_to_string(var80), var67, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        streams_high.write_char((SubLObject)Characters.CHAR_space, var67);
        streams_high.write_string(module0051.f3659(var81), var67, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        streams_high.write_char((SubLObject)Characters.CHAR_space, var67);
        print_high.princ(var82, var67);
        streams_high.write_char((SubLObject)Characters.CHAR_space, var67);
        module0012.f483(var79, var67);
        streams_high.write_char((SubLObject)Characters.CHAR_colon, var67);
        module0012.f483(var78, var67);
        streams_high.write_char((SubLObject)Characters.CHAR_colon, var67);
        module0012.f483(var77, var67);
        streams_high.write_char((SubLObject)Characters.CHAR_space, var67);
        if (var86.numL((SubLObject)ZERO_INTEGER)) {
            streams_high.write_char((SubLObject)Characters.CHAR_hyphen, var67);
            module0012.f483(Numbers.minus(var86), var67);
        }
        else {
            module0012.f483(var86, var67);
        }
        module0012.f483((SubLObject)ZERO_INTEGER, var67);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3166(SubLObject var75) {
        if (var75 == UNPROVIDED) {
            var75 = Time.get_universal_time();
        }
        SubLObject var76 = (SubLObject)NIL;
        SubLObject var77 = (SubLObject)NIL;
        try {
            var77 = streams_high.make_private_string_output_stream();
            f3179(var77, var75);
            var76 = streams_high.get_output_stream_string(var77);
        }
        finally {
            final SubLObject var78 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                streams_high.close(var77, (SubLObject)UNPROVIDED);
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3181() {
        $g971$ = SubLFiles.deflexical("S#4557", (SubLObject)$ic0$);
        $g972$ = SubLFiles.deflexical("S#4558", (SubLObject)$ic1$);
        $g973$ = SubLFiles.deflexical("S#4559", (SubLObject)$ic38$);
        $g974$ = SubLFiles.deflexical("S#4560", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3182() {
        module0002.f50((SubLObject)$ic18$, (SubLObject)$ic21$);
        module0002.f50((SubLObject)$ic19$, (SubLObject)$ic21$);
        module0002.f50((SubLObject)$ic20$, (SubLObject)$ic21$);
        return (SubLObject)NIL;
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
        $g971$ = null;
        $g972$ = null;
        $g973$ = null;
        $g974$ = null;
        $ic0$ = makeInteger(25);
        $ic1$ = makeString("smtp.unknown.com");
        $ic2$ = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { makeSymbol("S#4561", "CYC"), makeSymbol("&KEY"), makeSymbol("S#4562", "CYC"), makeSymbol("S#4563", "CYC"), makeSymbol("S#4564", "CYC"), makeSymbol("S#4565", "CYC"), ConsesLow.list((SubLObject)makeSymbol("S#57", "CYC"), (SubLObject)makeString("localhost")), ConsesLow.list((SubLObject)makeSymbol("S#58", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#4557", "CYC"))), makeSymbol("S#59", "CYC") }), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)makeKeyword("FROM"), (SubLObject)makeKeyword("TO"), (SubLObject)makeKeyword("CC"), (SubLObject)makeKeyword("BCC"), (SubLObject)makeKeyword("HOST"), (SubLObject)makeKeyword("PORT"), (SubLObject)makeKeyword("TIMEOUT"));
        $ic4$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic5$ = makeKeyword("FROM");
        $ic6$ = makeKeyword("TO");
        $ic7$ = makeKeyword("CC");
        $ic8$ = makeKeyword("BCC");
        $ic9$ = makeKeyword("HOST");
        $ic10$ = makeString("localhost");
        $ic11$ = makeKeyword("PORT");
        $ic12$ = makeSymbol("S#4557", "CYC");
        $ic13$ = makeKeyword("TIMEOUT");
        $ic14$ = makeSymbol("S#47", "CYC");
        $ic15$ = ConsesLow.list((SubLObject)makeKeyword("ACCESS-MODE"), (SubLObject)makeKeyword("PRIVATE"));
        $ic16$ = makeSymbol("CUNWIND-PROTECT");
        $ic17$ = makeSymbol("PROGN");
        $ic18$ = makeSymbol("S#4540", "CYC");
        $ic19$ = makeSymbol("S#4543", "CYC");
        $ic20$ = makeSymbol("S#4544", "CYC");
        $ic21$ = makeSymbol("S#4539", "CYC");
        $ic22$ = makeSymbol("STRINGP");
        $ic23$ = makeString("HELO ~A");
        $ic24$ = makeString("MAIL FROM: <~A>");
        $ic25$ = makeString("RCPT TO: <~A>");
        $ic26$ = makeString("DATA");
        $ic27$ = makeString("Date: ~A");
        $ic28$ = makeString("From: ~A");
        $ic29$ = makeString("To: ");
        $ic30$ = makeString("Cc: ");
        $ic31$ = makeString("Bcc: ");
        $ic32$ = ConsesLow.list((SubLObject)makeString(", "), (SubLObject)makeString(","));
        $ic33$ = makeSymbol("LISTP");
        $ic34$ = makeString(", ");
        $ic35$ = makeString("~A");
        $ic36$ = makeString(".");
        $ic37$ = makeString("QUIT");
        $ic38$ = (SubLFloat)makeDouble(0.005);
        $ic39$ = makeString("SMTP error: ~A");
        $ic40$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#4562", "CYC"), makeSymbol("S#4563", "CYC"), makeSymbol("S#295", "CYC"), makeSymbol("&KEY"), makeSymbol("S#4566", "CYC"), ConsesLow.list((SubLObject)makeSymbol("S#57", "CYC"), (SubLObject)makeString("localhost")), makeSymbol("S#4567", "CYC"), ConsesLow.list((SubLObject)makeSymbol("S#58", "CYC"), (SubLObject)makeSymbol("S#4557", "CYC")), ConsesLow.list((SubLObject)makeSymbol("S#59", "CYC"), (SubLObject)TEN_INTEGER), makeSymbol("S#4564", "CYC"), makeSymbol("S#4565", "CYC") });
        $ic41$ = ConsesLow.list((SubLObject)makeKeyword("SUBJECT"), (SubLObject)makeKeyword("HOST"), (SubLObject)makeKeyword("ADDITIONAL-HEADERS"), (SubLObject)makeKeyword("PORT"), (SubLObject)makeKeyword("TIMEOUT"), (SubLObject)makeKeyword("CC"), (SubLObject)makeKeyword("BCC"));
        $ic42$ = makeKeyword("SUBJECT");
        $ic43$ = makeKeyword("ADDITIONAL-HEADERS");
        $ic44$ = makeSymbol("S#4549", "CYC");
        $ic45$ = makeSymbol("S#38", "CYC");
        $ic46$ = makeKeyword("PRIVATE");
        $ic47$ = makeString("Subject: ~A");
        $ic48$ = makeSymbol("S#4568", "CYC");
        $ic49$ = makeString("Message must be a string or a list of message parts, not ~S");
        $ic50$ = makeString("SMTP connection apparently timed out after ~S seconds.");
        $ic51$ = makeKeyword("NOT-LOGGED");
        $ic52$ = makeKeyword("APPEND");
        $ic53$ = makeString("Unable to open ~S");
        $ic54$ = makeKeyword("LOGGED");
        $ic55$ = makeString("~&The following message with host ~S (port ~S) failed with the error:~% ~S.~%");
        $ic56$ = makeString("Date: ~A~%");
        $ic57$ = makeString("From: ~A~%");
        $ic58$ = makeString("To: ~A~%");
        $ic59$ = makeString("Subject: ~A~%");
        $ic60$ = makeString("--no message--");
        $ic61$ = makeString("~&~A~&");
        $ic62$ = makeString("");
        $ic63$ = makeString("domainname");
        $ic64$ = ConsesLow.list((SubLObject)makeString("-d"));
        $ic65$ = makeString("@");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 352 ms
	
	Decompiled with Procyon 0.5.32.
*/