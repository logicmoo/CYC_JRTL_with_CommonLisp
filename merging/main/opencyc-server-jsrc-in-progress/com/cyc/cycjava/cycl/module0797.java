package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0797 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0797";
    public static final String myFingerPrint = "af5165c052f103b4dcd8708471bf4f5fb394f62fe021ca10b189007ed16015b2";
    public static SubLSymbol $g6369$;
    private static SubLSymbol $g6370$;
    private static SubLSymbol $g6371$;
    private static final SubLList $ic0$;
    private static final SubLString $ic1$;
    private static final SubLString $ic2$;
    private static final SubLString $ic3$;
    private static final SubLString $ic4$;
    private static final SubLString $ic5$;
    private static final SubLString $ic6$;
    private static final SubLString $ic7$;
    private static final SubLString $ic8$;
    private static final SubLString $ic9$;
    private static final SubLString $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLString $ic17$;
    private static final SubLString $ic18$;
    private static final SubLString $ic19$;
    private static final SubLString $ic20$;
    private static final SubLString $ic21$;
    private static final SubLString $ic22$;
    private static final SubLString $ic23$;
    private static final SubLString $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    private static final SubLString $ic28$;
    private static final SubLObject $ic29$;
    private static final SubLString $ic30$;
    private static final SubLObject $ic31$;
    private static final SubLString $ic32$;
    private static final SubLObject $ic33$;
    private static final SubLString $ic34$;
    private static final SubLObject $ic35$;
    private static final SubLString $ic36$;
    private static final SubLObject $ic37$;
    private static final SubLString $ic38$;
    private static final SubLObject $ic39$;
    private static final SubLString $ic40$;
    private static final SubLObject $ic41$;
    private static final SubLString $ic42$;
    private static final SubLObject $ic43$;
    private static final SubLString $ic44$;
    private static final SubLObject $ic45$;
    private static final SubLString $ic46$;
    private static final SubLObject $ic47$;
    private static final SubLString $ic48$;
    private static final SubLObject $ic49$;
    private static final SubLString $ic50$;
    private static final SubLObject $ic51$;
    private static final SubLObject $ic52$;
    private static final SubLString $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLList $ic55$;
    private static final SubLString $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLList $ic58$;
    private static final SubLString $ic59$;
    private static final SubLObject $ic60$;
    private static final SubLObject $ic61$;
    private static final SubLObject $ic62$;
    private static final SubLString $ic63$;
    private static final SubLString $ic64$;
    private static final SubLInteger $ic65$;
    private static final SubLString $ic66$;
    private static final SubLString $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLList $ic69$;
    private static final SubLObject $ic70$;
    private static final SubLList $ic71$;
    private static final SubLObject $ic72$;
    private static final SubLList $ic73$;
    private static final SubLObject $ic74$;
    private static final SubLString $ic75$;
    private static final SubLString $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLString $ic79$;
    private static final SubLString $ic80$;
    private static final SubLString $ic81$;
    private static final SubLString $ic82$;
    private static final SubLString $ic83$;
    private static final SubLString $ic84$;
    private static final SubLString $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLString $ic87$;
    private static final SubLString $ic88$;
    private static final SubLString $ic89$;
    private static final SubLString $ic90$;
    private static final SubLString $ic91$;
    private static final SubLSymbol $ic92$;
    
    public static SubLObject f50937() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0038.f2648(module0587.$g4457$.getDynamicValue(var1), module0601.$g4654$.getDynamicValue(var1));
    }
    
    public static SubLObject f50938(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        f50939((SubLObject)$ic1$, var2, var3);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50940(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        f50939((SubLObject)$ic2$, var2, var3);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50941(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        f50939((SubLObject)$ic3$, var2, var3);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50942(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        f50939((SubLObject)$ic4$, var2, var3);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50943(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        f50939((SubLObject)$ic5$, var2, var3);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50944(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        f50939((SubLObject)$ic6$, var2, var3);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50945(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        f50939((SubLObject)$ic7$, var2, var3);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50946(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        f50939((SubLObject)$ic8$, var2, var3);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50947(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        f50939((SubLObject)$ic9$, var2, var3);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50948(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        f50939((SubLObject)$ic10$, var2, var3);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50949(final SubLObject var4, final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        final SubLObject var7 = module0601.$g4654$.currentBinding(var6);
        final SubLObject var8 = $g6369$.currentBinding(var6);
        try {
            module0601.$g4654$.bind((SubLObject)ZERO_INTEGER, var6);
            $g6369$.bind((SubLObject)T, var6);
            SubLObject var9 = (SubLObject)NIL;
            try {
                var9 = StreamsLow.open(var5, new SubLObject[] { $ic11$, $ic12$, $ic13$, $ic14$, $ic15$, $ic16$ });
                final SubLObject var6_9 = module0587.$g4457$.currentBinding(var6);
                try {
                    module0587.$g4457$.bind(var9, var6);
                    f50950((SubLObject)UNPROVIDED);
                    f50951(var4);
                }
                finally {
                    module0587.$g4457$.rebind(var6_9, var6);
                }
            }
            finally {
                final SubLObject var6_10 = Threads.$is_thread_performing_cleanupP$.currentBinding(var6);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var6);
                    if (NIL != var9) {
                        streams_high.close(var9, (SubLObject)UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var6_10, var6);
                }
            }
        }
        finally {
            $g6369$.rebind(var8, var6);
            module0601.$g4654$.rebind(var7, var6);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50951(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        if (NIL == var4) {
            return (SubLObject)NIL;
        }
        final SubLObject var6 = var4.first();
        final SubLObject var7 = var4.rest();
        if (NIL == var7) {
            f50939(var6, (SubLObject)$ic17$, (SubLObject)UNPROVIDED);
        }
        else if (var7.first().isString()) {
            f50939(var6, var7.first(), (SubLObject)UNPROVIDED);
        }
        else if (NIL != $g6369$.getDynamicValue(var5)) {
            PrintLow.format(module0587.$g4457$.getDynamicValue(var5), (SubLObject)$ic18$);
            f50937();
            final SubLObject var8 = var6;
            module0601.f36758(var8, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED);
            final SubLObject var9 = module0601.$g4654$.currentBinding(var5);
            try {
                module0601.$g4654$.bind(module0048.f_1X(module0601.$g4654$.getDynamicValue(var5)), var5);
                f50952(var7);
            }
            finally {
                module0601.$g4654$.rebind(var9, var5);
            }
            if (NIL != $g6369$.getDynamicValue(var5)) {
                PrintLow.format(module0587.$g4457$.getDynamicValue(var5), (SubLObject)$ic18$);
                f50937();
            }
            module0601.f36760(var8);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50952(final SubLObject var12) {
        SubLObject var13 = var12;
        SubLObject var14 = (SubLObject)NIL;
        var14 = var13.first();
        while (NIL != var13) {
            f50951(var14);
            var13 = var13.rest();
            var14 = var13.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50953(SubLObject var16) {
        if (var16 == UNPROVIDED) {
            var16 = module0587.$g4457$.getDynamicValue();
        }
        print_high.princ((SubLObject)$ic19$, var16);
        streams_high.terpri(var16);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50950(SubLObject var16) {
        if (var16 == UNPROVIDED) {
            var16 = module0587.$g4457$.getDynamicValue();
        }
        print_high.princ((SubLObject)$ic20$, var16);
        streams_high.terpri(var16);
        print_high.princ((SubLObject)$ic21$, var16);
        streams_high.terpri(var16);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50954(final SubLObject var17, SubLObject var16) {
        if (var16 == UNPROVIDED) {
            var16 = module0587.$g4457$.getDynamicValue();
        }
        final SubLObject var18 = f50955(var17);
        return f50956(var18, var17, var16);
    }
    
    public static SubLObject f50956(final SubLObject var18, final SubLObject var17, SubLObject var16) {
        if (var16 == UNPROVIDED) {
            var16 = module0587.$g4457$.getDynamicValue();
        }
        final SubLThread var19 = SubLProcess.currentSubLThread();
        f50953(var16);
        final SubLObject var20 = module0587.$g4457$.currentBinding(var19);
        final SubLObject var21 = module0601.$g4654$.currentBinding(var19);
        try {
            module0587.$g4457$.bind(var16, var19);
            module0601.$g4654$.bind((SubLObject)ZERO_INTEGER, var19);
            if (NIL != $g6369$.getDynamicValue(var19)) {
                PrintLow.format(module0587.$g4457$.getDynamicValue(var19), (SubLObject)$ic18$);
                f50937();
                final SubLObject var22 = (SubLObject)$ic22$;
                module0601.f36758(var22, $g6370$.getDynamicValue(var19), (SubLObject)NIL, (SubLObject)UNPROVIDED);
                final SubLObject var6_19 = module0601.$g4654$.currentBinding(var19);
                try {
                    module0601.$g4654$.bind(module0048.f_1X(module0601.$g4654$.getDynamicValue(var19)), var19);
                    if (NIL != $g6369$.getDynamicValue(var19)) {
                        PrintLow.format(module0587.$g4457$.getDynamicValue(var19), (SubLObject)$ic18$);
                        f50937();
                        final SubLObject var13_20 = (SubLObject)$ic23$;
                        module0601.f36758(var13_20, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED);
                        final SubLObject var6_20 = module0601.$g4654$.currentBinding(var19);
                        try {
                            module0601.$g4654$.bind(module0048.f_1X(module0601.$g4654$.getDynamicValue(var19)), var19);
                            SubLObject var23 = var18;
                            SubLObject var24 = (SubLObject)NIL;
                            var24 = var23.first();
                            while (NIL != var23) {
                                f50957(var24, (SubLObject)T);
                                var23 = var23.rest();
                                var24 = var23.first();
                            }
                        }
                        finally {
                            module0601.$g4654$.rebind(var6_20, var19);
                        }
                        if (NIL != $g6369$.getDynamicValue(var19)) {
                            PrintLow.format(module0587.$g4457$.getDynamicValue(var19), (SubLObject)$ic18$);
                            f50937();
                        }
                        module0601.f36760(var13_20);
                    }
                    if (NIL != $g6369$.getDynamicValue(var19)) {
                        PrintLow.format(module0587.$g4457$.getDynamicValue(var19), (SubLObject)$ic18$);
                        f50937();
                        final SubLObject var13_21 = (SubLObject)$ic24$;
                        module0601.f36758(var13_21, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED);
                        final SubLObject var6_21 = module0601.$g4654$.currentBinding(var19);
                        try {
                            module0601.$g4654$.bind(module0048.f_1X(module0601.$g4654$.getDynamicValue(var19)), var19);
                            SubLObject var23 = var17;
                            SubLObject var25 = (SubLObject)NIL;
                            var25 = var23.first();
                            while (NIL != var23) {
                                final SubLObject var26 = module0770.f49049(var25, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                f50958(module0289.f19396(var25), assertion_handles_oc.f11025(var25), var26, module0178.f11287(var25), module0178.f11293(var25), module0178.f11291(var25));
                                var23 = var23.rest();
                                var25 = var23.first();
                            }
                        }
                        finally {
                            module0601.$g4654$.rebind(var6_21, var19);
                        }
                        if (NIL != $g6369$.getDynamicValue(var19)) {
                            PrintLow.format(module0587.$g4457$.getDynamicValue(var19), (SubLObject)$ic18$);
                            f50937();
                        }
                        module0601.f36760(var13_21);
                    }
                }
                finally {
                    module0601.$g4654$.rebind(var6_19, var19);
                }
                if (NIL != $g6369$.getDynamicValue(var19)) {
                    PrintLow.format(module0587.$g4457$.getDynamicValue(var19), (SubLObject)$ic18$);
                    f50937();
                }
                module0601.f36760(var22);
            }
        }
        finally {
            module0601.$g4654$.rebind(var21, var19);
            module0587.$g4457$.rebind(var20, var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50958(final SubLObject var27, final SubLObject var28, final SubLObject var26, final SubLObject var29, final SubLObject var30, final SubLObject var31) {
        final SubLThread var32 = SubLProcess.currentSubLThread();
        if (NIL != $g6369$.getDynamicValue(var32)) {
            PrintLow.format(module0587.$g4457$.getDynamicValue(var32), (SubLObject)$ic18$);
            f50937();
            final SubLObject var33 = (SubLObject)$ic25$;
            module0601.f36758(var33, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED);
            final SubLObject var34 = module0601.$g4654$.currentBinding(var32);
            try {
                module0601.$g4654$.bind(module0048.f_1X(module0601.$g4654$.getDynamicValue(var32)), var32);
                f50942(var28, (SubLObject)UNPROVIDED);
                f50959(var26, (SubLObject)UNPROVIDED);
                f50960(var27);
                f50961(var29);
                f50962(var30);
                f50963(var31);
            }
            finally {
                module0601.$g4654$.rebind(var34, var32);
            }
            if (NIL != $g6369$.getDynamicValue(var32)) {
                PrintLow.format(module0587.$g4457$.getDynamicValue(var32), (SubLObject)$ic18$);
                f50937();
            }
            module0601.f36760(var33);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50964(final SubLObject var32) {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        SubLObject var34 = (SubLObject)NIL;
        SubLObject var35 = (SubLObject)NIL;
        try {
            var35 = streams_high.make_private_string_output_stream();
            final SubLObject var36 = module0587.$g4457$.currentBinding(var33);
            try {
                module0587.$g4457$.bind(var35, var33);
                f50965(var32);
            }
            finally {
                module0587.$g4457$.rebind(var36, var33);
            }
            var34 = streams_high.get_output_stream_string(var35);
        }
        finally {
            final SubLObject var37 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var33);
                streams_high.close(var35, (SubLObject)UNPROVIDED);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var37, var33);
            }
        }
        return var34;
    }
    
    public static SubLObject f50965(final SubLObject var32) {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        if (NIL != constant_handles_oc.f8449(var32)) {
            f50957(var32, (SubLObject)UNPROVIDED);
        }
        else if (NIL != module0206.f13497(var32)) {
            f50947(var32, (SubLObject)UNPROVIDED);
        }
        else if (var32.isDouble()) {
            f50966(var32);
        }
        else if (var32.isNumber()) {
            f50948(var32, (SubLObject)UNPROVIDED);
        }
        else if (var32.isString()) {
            f50945(var32, (SubLObject)UNPROVIDED);
        }
        else if (NIL != module0039.f2992(var32)) {
            f50945(module0039.f3037(var32), (SubLObject)UNPROVIDED);
        }
        else if (var32.isChar()) {
            f50944(var32, (SubLObject)UNPROVIDED);
        }
        else if (var32.isSymbol()) {
            f50967(var32);
        }
        else if (NIL != Guids.guid_p(var32)) {
            f50941(Guids.guid_to_string(var32), (SubLObject)UNPROVIDED);
        }
        else if (NIL != module0206.f13425(var32)) {
            if (NIL != $g6371$.getDynamicValue(var33)) {
                f50968(var32);
            }
            else {
                f50960(var32);
            }
        }
        else if (NIL != f50969(var32)) {
            f50970(var32);
        }
        else if (var32.isList()) {
            f50971(var32);
        }
        else if (NIL != module0037.f2581(var32)) {
            f50972(var32);
        }
        else {
            Errors.error((SubLObject)$ic26$, var32);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50959(final SubLObject var33, SubLObject var34) {
        if (var34 == UNPROVIDED) {
            var34 = (SubLObject)NIL;
        }
        final SubLThread var35 = SubLProcess.currentSubLThread();
        if (NIL == var33) {
            if (NIL != $g6369$.getDynamicValue(var35)) {
                PrintLow.format(module0587.$g4457$.getDynamicValue(var35), (SubLObject)$ic18$);
                f50937();
                final SubLObject var36 = (SubLObject)$ic27$;
                module0601.f36758(var36, var34, (SubLObject)NIL, (SubLObject)UNPROVIDED);
                f50967(var33);
                module0601.f36760(var36);
            }
        }
        else {
            f50973((SubLObject)$ic27$, var33, var34);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50960(final SubLObject var27) {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        final SubLObject var29 = module0205.f13132(var27);
        if (NIL != var29) {
            if (NIL != $g6369$.getDynamicValue(var28)) {
                PrintLow.format(module0587.$g4457$.getDynamicValue(var28), (SubLObject)$ic18$);
                f50937();
                final SubLObject var30 = (SubLObject)$ic28$;
                module0601.f36758(var30, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED);
                final SubLObject var31 = module0601.$g4654$.currentBinding(var28);
                try {
                    module0601.$g4654$.bind(module0048.f_1X(module0601.$g4654$.getDynamicValue(var28)), var28);
                    if (var29.eql($ic29$)) {
                        if (NIL != $g6369$.getDynamicValue(var28)) {
                            PrintLow.format(module0587.$g4457$.getDynamicValue(var28), (SubLObject)$ic18$);
                            f50937();
                            final SubLObject var13_36 = (SubLObject)$ic30$;
                            module0601.f36758(var13_36, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED);
                            final SubLObject var6_37 = module0601.$g4654$.currentBinding(var28);
                            try {
                                module0601.$g4654$.bind(module0048.f_1X(module0601.$g4654$.getDynamicValue(var28)), var28);
                                f50957(var29, (SubLObject)UNPROVIDED);
                                f50960(module0205.f13203(var27, (SubLObject)UNPROVIDED));
                            }
                            finally {
                                module0601.$g4654$.rebind(var6_37, var28);
                            }
                            if (NIL != $g6369$.getDynamicValue(var28)) {
                                PrintLow.format(module0587.$g4457$.getDynamicValue(var28), (SubLObject)$ic18$);
                                f50937();
                            }
                            module0601.f36760(var13_36);
                        }
                    }
                    else if (var29.eql($ic31$)) {
                        if (NIL != $g6369$.getDynamicValue(var28)) {
                            PrintLow.format(module0587.$g4457$.getDynamicValue(var28), (SubLObject)$ic18$);
                            f50937();
                            final SubLObject var13_37 = (SubLObject)$ic32$;
                            module0601.f36758(var13_37, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED);
                            final SubLObject var6_38 = module0601.$g4654$.currentBinding(var28);
                            try {
                                module0601.$g4654$.bind(module0048.f_1X(module0601.$g4654$.getDynamicValue(var28)), var28);
                                f50957(var29, (SubLObject)UNPROVIDED);
                                SubLObject var32 = module0205.f13207(var27, (SubLObject)UNPROVIDED);
                                SubLObject var33 = (SubLObject)NIL;
                                var33 = var32.first();
                                while (NIL != var32) {
                                    f50960(var33);
                                    var32 = var32.rest();
                                    var33 = var32.first();
                                }
                            }
                            finally {
                                module0601.$g4654$.rebind(var6_38, var28);
                            }
                            if (NIL != $g6369$.getDynamicValue(var28)) {
                                PrintLow.format(module0587.$g4457$.getDynamicValue(var28), (SubLObject)$ic18$);
                                f50937();
                            }
                            module0601.f36760(var13_37);
                        }
                    }
                    else if (var29.eql($ic33$)) {
                        if (NIL != $g6369$.getDynamicValue(var28)) {
                            PrintLow.format(module0587.$g4457$.getDynamicValue(var28), (SubLObject)$ic18$);
                            f50937();
                            final SubLObject var13_38 = (SubLObject)$ic34$;
                            module0601.f36758(var13_38, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED);
                            final SubLObject var6_39 = module0601.$g4654$.currentBinding(var28);
                            try {
                                module0601.$g4654$.bind(module0048.f_1X(module0601.$g4654$.getDynamicValue(var28)), var28);
                                f50957(var29, (SubLObject)UNPROVIDED);
                                SubLObject var32 = module0205.f13207(var27, (SubLObject)UNPROVIDED);
                                SubLObject var33 = (SubLObject)NIL;
                                var33 = var32.first();
                                while (NIL != var32) {
                                    f50960(var33);
                                    var32 = var32.rest();
                                    var33 = var32.first();
                                }
                            }
                            finally {
                                module0601.$g4654$.rebind(var6_39, var28);
                            }
                            if (NIL != $g6369$.getDynamicValue(var28)) {
                                PrintLow.format(module0587.$g4457$.getDynamicValue(var28), (SubLObject)$ic18$);
                                f50937();
                            }
                            module0601.f36760(var13_38);
                        }
                    }
                    else if (var29.eql($ic35$)) {
                        if (NIL != $g6369$.getDynamicValue(var28)) {
                            PrintLow.format(module0587.$g4457$.getDynamicValue(var28), (SubLObject)$ic18$);
                            f50937();
                            final SubLObject var13_39 = (SubLObject)$ic36$;
                            module0601.f36758(var13_39, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED);
                            final SubLObject var6_40 = module0601.$g4654$.currentBinding(var28);
                            try {
                                module0601.$g4654$.bind(module0048.f_1X(module0601.$g4654$.getDynamicValue(var28)), var28);
                                f50957(var29, (SubLObject)UNPROVIDED);
                                f50960(module0205.f13203(var27, (SubLObject)UNPROVIDED));
                                f50960(module0205.f13204(var27, (SubLObject)UNPROVIDED));
                            }
                            finally {
                                module0601.$g4654$.rebind(var6_40, var28);
                            }
                            if (NIL != $g6369$.getDynamicValue(var28)) {
                                PrintLow.format(module0587.$g4457$.getDynamicValue(var28), (SubLObject)$ic18$);
                                f50937();
                            }
                            module0601.f36760(var13_39);
                        }
                    }
                    else if (var29.eql($ic37$)) {
                        if (NIL != $g6369$.getDynamicValue(var28)) {
                            PrintLow.format(module0587.$g4457$.getDynamicValue(var28), (SubLObject)$ic18$);
                            f50937();
                            final SubLObject var13_40 = (SubLObject)$ic38$;
                            module0601.f36758(var13_40, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED);
                            final SubLObject var6_41 = module0601.$g4654$.currentBinding(var28);
                            try {
                                module0601.$g4654$.bind(module0048.f_1X(module0601.$g4654$.getDynamicValue(var28)), var28);
                                f50957(var29, (SubLObject)UNPROVIDED);
                                f50960(module0205.f13203(var27, (SubLObject)UNPROVIDED));
                                f50960(module0205.f13204(var27, (SubLObject)UNPROVIDED));
                            }
                            finally {
                                module0601.$g4654$.rebind(var6_41, var28);
                            }
                            if (NIL != $g6369$.getDynamicValue(var28)) {
                                PrintLow.format(module0587.$g4457$.getDynamicValue(var28), (SubLObject)$ic18$);
                                f50937();
                            }
                            module0601.f36760(var13_40);
                        }
                    }
                    else if (var29.eql($ic39$)) {
                        if (NIL != $g6369$.getDynamicValue(var28)) {
                            PrintLow.format(module0587.$g4457$.getDynamicValue(var28), (SubLObject)$ic18$);
                            f50937();
                            final SubLObject var13_41 = (SubLObject)$ic40$;
                            module0601.f36758(var13_41, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED);
                            final SubLObject var6_42 = module0601.$g4654$.currentBinding(var28);
                            try {
                                module0601.$g4654$.bind(module0048.f_1X(module0601.$g4654$.getDynamicValue(var28)), var28);
                                f50957(var29, (SubLObject)UNPROVIDED);
                                f50960(module0205.f13203(var27, (SubLObject)UNPROVIDED));
                                f50960(module0205.f13204(var27, (SubLObject)UNPROVIDED));
                            }
                            finally {
                                module0601.$g4654$.rebind(var6_42, var28);
                            }
                            if (NIL != $g6369$.getDynamicValue(var28)) {
                                PrintLow.format(module0587.$g4457$.getDynamicValue(var28), (SubLObject)$ic18$);
                                f50937();
                            }
                            module0601.f36760(var13_41);
                        }
                    }
                    else if (var29.eql($ic41$)) {
                        if (NIL != $g6369$.getDynamicValue(var28)) {
                            PrintLow.format(module0587.$g4457$.getDynamicValue(var28), (SubLObject)$ic18$);
                            f50937();
                            final SubLObject var13_42 = (SubLObject)$ic42$;
                            module0601.f36758(var13_42, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED);
                            final SubLObject var6_43 = module0601.$g4654$.currentBinding(var28);
                            try {
                                module0601.$g4654$.bind(module0048.f_1X(module0601.$g4654$.getDynamicValue(var28)), var28);
                                f50957(var29, (SubLObject)UNPROVIDED);
                                f50947(module0205.f13203(var27, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
                                f50960(module0205.f13204(var27, (SubLObject)UNPROVIDED));
                            }
                            finally {
                                module0601.$g4654$.rebind(var6_43, var28);
                            }
                            if (NIL != $g6369$.getDynamicValue(var28)) {
                                PrintLow.format(module0587.$g4457$.getDynamicValue(var28), (SubLObject)$ic18$);
                                f50937();
                            }
                            module0601.f36760(var13_42);
                        }
                    }
                    else if (var29.eql($ic43$)) {
                        if (NIL != $g6369$.getDynamicValue(var28)) {
                            PrintLow.format(module0587.$g4457$.getDynamicValue(var28), (SubLObject)$ic18$);
                            f50937();
                            final SubLObject var13_43 = (SubLObject)$ic44$;
                            module0601.f36758(var13_43, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED);
                            final SubLObject var6_44 = module0601.$g4654$.currentBinding(var28);
                            try {
                                module0601.$g4654$.bind(module0048.f_1X(module0601.$g4654$.getDynamicValue(var28)), var28);
                                f50957(var29, (SubLObject)UNPROVIDED);
                                f50947(module0205.f13203(var27, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
                                f50960(module0205.f13204(var27, (SubLObject)UNPROVIDED));
                            }
                            finally {
                                module0601.$g4654$.rebind(var6_44, var28);
                            }
                            if (NIL != $g6369$.getDynamicValue(var28)) {
                                PrintLow.format(module0587.$g4457$.getDynamicValue(var28), (SubLObject)$ic18$);
                                f50937();
                            }
                            module0601.f36760(var13_43);
                        }
                    }
                    else if (var29.eql($ic45$)) {
                        if (NIL != $g6369$.getDynamicValue(var28)) {
                            PrintLow.format(module0587.$g4457$.getDynamicValue(var28), (SubLObject)$ic18$);
                            f50937();
                            final SubLObject var13_44 = (SubLObject)$ic46$;
                            module0601.f36758(var13_44, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED);
                            final SubLObject var6_45 = module0601.$g4654$.currentBinding(var28);
                            try {
                                module0601.$g4654$.bind(module0048.f_1X(module0601.$g4654$.getDynamicValue(var28)), var28);
                                f50957(var29, (SubLObject)UNPROVIDED);
                                f50965(module0205.f13203(var27, (SubLObject)UNPROVIDED));
                                f50947(module0205.f13204(var27, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
                                f50960(module0205.f13205(var27, (SubLObject)UNPROVIDED));
                            }
                            finally {
                                module0601.$g4654$.rebind(var6_45, var28);
                            }
                            if (NIL != $g6369$.getDynamicValue(var28)) {
                                PrintLow.format(module0587.$g4457$.getDynamicValue(var28), (SubLObject)$ic18$);
                                f50937();
                            }
                            module0601.f36760(var13_44);
                        }
                    }
                    else if (var29.eql($ic47$)) {
                        if (NIL != $g6369$.getDynamicValue(var28)) {
                            PrintLow.format(module0587.$g4457$.getDynamicValue(var28), (SubLObject)$ic18$);
                            f50937();
                            final SubLObject var13_45 = (SubLObject)$ic48$;
                            module0601.f36758(var13_45, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED);
                            final SubLObject var6_46 = module0601.$g4654$.currentBinding(var28);
                            try {
                                module0601.$g4654$.bind(module0048.f_1X(module0601.$g4654$.getDynamicValue(var28)), var28);
                                f50957(var29, (SubLObject)UNPROVIDED);
                                f50965(module0205.f13203(var27, (SubLObject)UNPROVIDED));
                                f50947(module0205.f13204(var27, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
                                f50960(module0205.f13205(var27, (SubLObject)UNPROVIDED));
                            }
                            finally {
                                module0601.$g4654$.rebind(var6_46, var28);
                            }
                            if (NIL != $g6369$.getDynamicValue(var28)) {
                                PrintLow.format(module0587.$g4457$.getDynamicValue(var28), (SubLObject)$ic18$);
                                f50937();
                            }
                            module0601.f36760(var13_45);
                        }
                    }
                    else if (var29.eql($ic49$)) {
                        if (NIL != $g6369$.getDynamicValue(var28)) {
                            PrintLow.format(module0587.$g4457$.getDynamicValue(var28), (SubLObject)$ic18$);
                            f50937();
                            final SubLObject var13_46 = (SubLObject)$ic50$;
                            module0601.f36758(var13_46, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED);
                            final SubLObject var6_47 = module0601.$g4654$.currentBinding(var28);
                            try {
                                module0601.$g4654$.bind(module0048.f_1X(module0601.$g4654$.getDynamicValue(var28)), var28);
                                f50957(var29, (SubLObject)UNPROVIDED);
                                f50965(module0205.f13203(var27, (SubLObject)UNPROVIDED));
                                f50947(module0205.f13204(var27, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
                                f50960(module0205.f13205(var27, (SubLObject)UNPROVIDED));
                            }
                            finally {
                                module0601.$g4654$.rebind(var6_47, var28);
                            }
                            if (NIL != $g6369$.getDynamicValue(var28)) {
                                PrintLow.format(module0587.$g4457$.getDynamicValue(var28), (SubLObject)$ic18$);
                                f50937();
                            }
                            module0601.f36760(var13_46);
                        }
                    }
                    else {
                        f50974(module0205.f13132(var27));
                        SubLObject var34 = module0205.f13207(var27, (SubLObject)UNPROVIDED);
                        SubLObject var35 = (SubLObject)NIL;
                        var35 = var34.first();
                        while (NIL != var34) {
                            f50965(var35);
                            var34 = var34.rest();
                            var35 = var34.first();
                        }
                    }
                }
                finally {
                    module0601.$g4654$.rebind(var31, var28);
                }
                if (NIL != $g6369$.getDynamicValue(var28)) {
                    PrintLow.format(module0587.$g4457$.getDynamicValue(var28), (SubLObject)$ic18$);
                    f50937();
                }
                module0601.f36760(var30);
            }
        }
        else if ((var27.eql($ic51$) || var27.eql($ic52$)) && NIL != $g6369$.getDynamicValue(var28)) {
            PrintLow.format(module0587.$g4457$.getDynamicValue(var28), (SubLObject)$ic18$);
            f50937();
            final SubLObject var30 = (SubLObject)$ic28$;
            module0601.f36758(var30, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED);
            final SubLObject var31 = module0601.$g4654$.currentBinding(var28);
            try {
                module0601.$g4654$.bind(module0048.f_1X(module0601.$g4654$.getDynamicValue(var28)), var28);
                f50957(var27, (SubLObject)UNPROVIDED);
            }
            finally {
                module0601.$g4654$.rebind(var31, var28);
            }
            if (NIL != $g6369$.getDynamicValue(var28)) {
                PrintLow.format(module0587.$g4457$.getDynamicValue(var28), (SubLObject)$ic18$);
                f50937();
            }
            module0601.f36760(var30);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50975(final SubLObject var60) {
        final SubLThread var61 = SubLProcess.currentSubLThread();
        if (NIL != $g6369$.getDynamicValue(var61)) {
            PrintLow.format(module0587.$g4457$.getDynamicValue(var61), (SubLObject)$ic18$);
            f50937();
            final SubLObject var62 = (SubLObject)$ic28$;
            module0601.f36758(var62, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED);
            final SubLObject var63 = module0601.$g4654$.currentBinding(var61);
            try {
                module0601.$g4654$.bind(module0048.f_1X(module0601.$g4654$.getDynamicValue(var61)), var61);
                f50976(var60.first());
                SubLObject var64 = var60.rest();
                SubLObject var65 = (SubLObject)NIL;
                var65 = var64.first();
                while (NIL != var64) {
                    f50977(var65);
                    var64 = var64.rest();
                    var65 = var64.first();
                }
            }
            finally {
                module0601.$g4654$.rebind(var63, var61);
            }
            if (NIL != $g6369$.getDynamicValue(var61)) {
                PrintLow.format(module0587.$g4457$.getDynamicValue(var61), (SubLObject)$ic18$);
                f50937();
            }
            module0601.f36760(var62);
        }
        return var60;
    }
    
    public static SubLObject f50976(final SubLObject var60) {
        final SubLThread var61 = SubLProcess.currentSubLThread();
        if (NIL != $g6369$.getDynamicValue(var61)) {
            PrintLow.format(module0587.$g4457$.getDynamicValue(var61), (SubLObject)$ic18$);
            f50937();
            final SubLObject var62 = (SubLObject)$ic53$;
            module0601.f36758(var62, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED);
            final SubLObject var63 = module0601.$g4654$.currentBinding(var61);
            try {
                module0601.$g4654$.bind(module0048.f_1X(module0601.$g4654$.getDynamicValue(var61)), var61);
                f50977(var60);
            }
            finally {
                module0601.$g4654$.rebind(var63, var61);
            }
            if (NIL != $g6369$.getDynamicValue(var61)) {
                PrintLow.format(module0587.$g4457$.getDynamicValue(var61), (SubLObject)$ic18$);
                f50937();
            }
            module0601.f36760(var62);
        }
        return var60;
    }
    
    public static SubLObject f50977(final SubLObject var60) {
        final SubLThread var61 = SubLProcess.currentSubLThread();
        if (var60.isCons()) {
            final SubLObject var63;
            final SubLObject var62 = var63 = var60.first();
            if (var63.eql((SubLObject)$ic54$)) {
                SubLObject var64 = (SubLObject)NIL;
                SubLObject var65 = (SubLObject)NIL;
                SubLObject var66 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var60, var60, (SubLObject)$ic55$);
                var64 = var60.first();
                SubLObject var67 = var60.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var67, var60, (SubLObject)$ic55$);
                var65 = var67.first();
                var67 = var67.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var67, var60, (SubLObject)$ic55$);
                var66 = var67.first();
                var67 = var67.rest();
                if (NIL == var67) {
                    if (NIL != $g6369$.getDynamicValue(var61)) {
                        PrintLow.format(module0587.$g4457$.getDynamicValue(var61), (SubLObject)$ic18$);
                        f50937();
                        final SubLObject var68 = (SubLObject)$ic56$;
                        module0601.f36758(var68, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED);
                        final SubLObject var69 = module0601.$g4654$.currentBinding(var61);
                        try {
                            module0601.$g4654$.bind(module0048.f_1X(module0601.$g4654$.getDynamicValue(var61)), var61);
                            f50941(Guids.guid_to_string(var66), (SubLObject)UNPROVIDED);
                            f50943(var65, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0601.$g4654$.rebind(var69, var61);
                        }
                        if (NIL != $g6369$.getDynamicValue(var61)) {
                            PrintLow.format(module0587.$g4457$.getDynamicValue(var61), (SubLObject)$ic18$);
                            f50937();
                        }
                        module0601.f36760(var68);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var60, (SubLObject)$ic55$);
                }
            }
            else if (var63.eql((SubLObject)$ic57$)) {
                SubLObject var70 = (SubLObject)NIL;
                SubLObject var71 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var60, var60, (SubLObject)$ic58$);
                var70 = var60.first();
                SubLObject var72 = var60.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var72, var60, (SubLObject)$ic58$);
                var71 = var72.first();
                var72 = var72.rest();
                if (NIL == var72) {
                    f50978(var71);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var60, (SubLObject)$ic58$);
                }
            }
            else {
                f50978(var60);
            }
        }
        else {
            f50965(var60);
        }
        return var60;
    }
    
    public static SubLObject f50978(final SubLObject var72) {
        final SubLThread var73 = SubLProcess.currentSubLThread();
        if (NIL != $g6369$.getDynamicValue(var73)) {
            PrintLow.format(module0587.$g4457$.getDynamicValue(var73), (SubLObject)$ic18$);
            f50937();
            final SubLObject var74 = (SubLObject)$ic59$;
            module0601.f36758(var74, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED);
            final SubLObject var75 = module0601.$g4654$.currentBinding(var73);
            try {
                module0601.$g4654$.bind(module0048.f_1X(module0601.$g4654$.getDynamicValue(var73)), var73);
                SubLObject var76 = var72;
                SubLObject var77 = (SubLObject)NIL;
                var77 = var76.first();
                while (NIL != var76) {
                    f50977(var77);
                    var76 = var76.rest();
                    var77 = var76.first();
                }
            }
            finally {
                module0601.$g4654$.rebind(var75, var73);
            }
            if (NIL != $g6369$.getDynamicValue(var73)) {
                PrintLow.format(module0587.$g4457$.getDynamicValue(var73), (SubLObject)$ic18$);
                f50937();
            }
            module0601.f36760(var74);
        }
        return var72;
    }
    
    public static SubLObject f50968(final SubLObject var27) {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        final SubLObject var29 = $g6371$.currentBinding(var28);
        try {
            $g6371$.bind((SubLObject)T, var28);
            if (NIL != $g6369$.getDynamicValue(var28)) {
                PrintLow.format(module0587.$g4457$.getDynamicValue(var28), (SubLObject)$ic18$);
                f50937();
                final SubLObject var30 = (SubLObject)$ic28$;
                module0601.f36758(var30, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED);
                final SubLObject var6_74 = module0601.$g4654$.currentBinding(var28);
                try {
                    module0601.$g4654$.bind(module0048.f_1X(module0601.$g4654$.getDynamicValue(var28)), var28);
                    f50974(module0205.f13132(var27));
                    SubLObject var31 = module0205.f13207(var27, (SubLObject)UNPROVIDED);
                    SubLObject var32 = (SubLObject)NIL;
                    var32 = var31.first();
                    while (NIL != var31) {
                        f50965(var32);
                        var31 = var31.rest();
                        var32 = var31.first();
                    }
                }
                finally {
                    module0601.$g4654$.rebind(var6_74, var28);
                }
                if (NIL != $g6369$.getDynamicValue(var28)) {
                    PrintLow.format(module0587.$g4457$.getDynamicValue(var28), (SubLObject)$ic18$);
                    f50937();
                }
                module0601.f36760(var30);
            }
        }
        finally {
            $g6371$.rebind(var29, var28);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50969(final SubLObject var60) {
        return (SubLObject)makeBoolean(NIL != module0206.f13453(var60) || $ic60$.eql(module0205.f13132(var60)) || $ic61$.eql(module0205.f13132(var60)) || $ic62$.eql(module0205.f13132(var60)));
    }
    
    public static SubLObject f50972(final SubLObject var75) {
        final SubLThread var76 = SubLProcess.currentSubLThread();
        if (NIL != $g6369$.getDynamicValue(var76)) {
            PrintLow.format(module0587.$g4457$.getDynamicValue(var76), (SubLObject)$ic18$);
            f50937();
            final SubLObject var77 = (SubLObject)$ic63$;
            module0601.f36758(var77, (SubLObject)ConsesLow.list((SubLObject)$ic64$, Sequences.length(var75)), (SubLObject)NIL, (SubLObject)UNPROVIDED);
            final SubLObject var78 = module0601.$g4654$.currentBinding(var76);
            try {
                module0601.$g4654$.bind(module0048.f_1X(module0601.$g4654$.getDynamicValue(var76)), var76);
                SubLObject var79;
                SubLObject var80;
                for (var79 = Sequences.length(var75), var80 = (SubLObject)NIL, var80 = (SubLObject)ZERO_INTEGER; var80.numL(var79); var80 = Numbers.add(var80, (SubLObject)ONE_INTEGER)) {
                    if (Numbers.mod(var80, (SubLObject)$ic65$).isZero()) {
                        streams_high.terpri(module0587.$g4457$.getDynamicValue(var76));
                        f50937();
                    }
                    else if (Numbers.mod(var80, (SubLObject)FOUR_INTEGER).isZero()) {
                        streams_high.write_string((SubLObject)$ic66$, module0587.$g4457$.getDynamicValue(var76), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    f50979(Vectors.aref(var75, var80));
                }
            }
            finally {
                module0601.$g4654$.rebind(var78, var76);
            }
            if (NIL != $g6369$.getDynamicValue(var76)) {
                PrintLow.format(module0587.$g4457$.getDynamicValue(var76), (SubLObject)$ic18$);
                f50937();
            }
            module0601.f36760(var77);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50979(final SubLObject var78) {
        final SubLThread var79 = SubLProcess.currentSubLThread();
        PrintLow.format(module0587.$g4457$.getDynamicValue(var79), (SubLObject)$ic67$, var78);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50957(final SubLObject var22, SubLObject var79) {
        if (var79 == UNPROVIDED) {
            var79 = (SubLObject)NIL;
        }
        final SubLThread var80 = SubLProcess.currentSubLThread();
        if (NIL != var79) {
            if (NIL != $g6369$.getDynamicValue(var80)) {
                PrintLow.format(module0587.$g4457$.getDynamicValue(var80), (SubLObject)$ic18$);
                f50937();
                final SubLObject var81 = (SubLObject)$ic56$;
                module0601.f36758(var81, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED);
                final SubLObject var82 = module0601.$g4654$.currentBinding(var80);
                try {
                    module0601.$g4654$.bind(module0048.f_1X(module0601.$g4654$.getDynamicValue(var80)), var80);
                    f50941(Guids.guid_to_string(constants_high_oc.f10744(var22)), (SubLObject)UNPROVIDED);
                    f50943(constants_high_oc.f10743(var22), (SubLObject)UNPROVIDED);
                    f50940(module0226.f15076(var22, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
                    f50980(var22);
                }
                finally {
                    module0601.$g4654$.rebind(var82, var80);
                }
                if (NIL != $g6369$.getDynamicValue(var80)) {
                    PrintLow.format(module0587.$g4457$.getDynamicValue(var80), (SubLObject)$ic18$);
                    f50937();
                }
                module0601.f36760(var81);
            }
        }
        else if (NIL != $g6369$.getDynamicValue(var80)) {
            PrintLow.format(module0587.$g4457$.getDynamicValue(var80), (SubLObject)$ic18$);
            f50937();
            final SubLObject var81 = (SubLObject)$ic56$;
            module0601.f36758(var81, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED);
            final SubLObject var82 = module0601.$g4654$.currentBinding(var80);
            try {
                module0601.$g4654$.bind(module0048.f_1X(module0601.$g4654$.getDynamicValue(var80)), var80);
                f50941(Guids.guid_to_string(constants_high_oc.f10744(var22)), (SubLObject)UNPROVIDED);
                f50943(constants_high_oc.f10743(var22), (SubLObject)UNPROVIDED);
            }
            finally {
                module0601.$g4654$.rebind(var82, var80);
            }
            if (NIL != $g6369$.getDynamicValue(var80)) {
                PrintLow.format(module0587.$g4457$.getDynamicValue(var80), (SubLObject)$ic18$);
                f50937();
            }
            module0601.f36760(var81);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50980(final SubLObject var22) {
        SubLObject var23 = (SubLObject)NIL;
        var23 = module0434.f30577((SubLObject)$ic68$, (SubLObject)ConsesLow.listS($ic31$, (SubLObject)$ic69$, (SubLObject)ConsesLow.list($ic33$, (SubLObject)ConsesLow.listS($ic70$, var22, (SubLObject)$ic71$), (SubLObject)ConsesLow.listS($ic72$, var22, (SubLObject)$ic71$)), (SubLObject)$ic73$), $ic74$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != var23) {
            f50946(Sequences.cconcatenate((SubLObject)$ic75$, new SubLObject[] { var23.first(), $ic76$, constants_high_oc.f10743(var22) }), (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50955(final SubLObject var17) {
        SubLObject var18 = (SubLObject)NIL;
        SubLObject var19 = (SubLObject)NIL;
        SubLObject var20 = var17;
        SubLObject var21 = (SubLObject)NIL;
        var21 = var20.first();
        while (NIL != var20) {
            final SubLObject var22 = module0178.f11287(var21);
            if (NIL != module0167.f10813(var22)) {
                var18 = ConsesLow.append(var18, module0035.f2399(module0172.f10920(var22), (SubLObject)$ic77$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            }
            else {
                var18 = (SubLObject)ConsesLow.cons(var22, var18);
            }
            var18 = ConsesLow.append(var18, module0035.f2399(module0289.f19396(var21), (SubLObject)$ic77$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            var20 = var20.rest();
            var21 = var20.first();
        }
        var18 = Sequences.remove_duplicates(var18, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        var19 = Sort.sort(var18, (SubLObject)$ic78$, (SubLObject)UNPROVIDED);
        return var19;
    }
    
    public static SubLObject f50981(final SubLObject var83, final SubLObject var84) {
        return Strings.stringL(constants_high_oc.f10743(var83), constants_high_oc.f10743(var84), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f50971(final SubLObject var85) {
        final SubLThread var86 = SubLProcess.currentSubLThread();
        if (NIL != $g6369$.getDynamicValue(var86)) {
            PrintLow.format(module0587.$g4457$.getDynamicValue(var86), (SubLObject)$ic18$);
            f50937();
            final SubLObject var87 = (SubLObject)$ic79$;
            module0601.f36758(var87, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED);
            final SubLObject var88 = module0601.$g4654$.currentBinding(var86);
            try {
                module0601.$g4654$.bind(module0048.f_1X(module0601.$g4654$.getDynamicValue(var86)), var86);
                SubLObject var89;
                for (var89 = (SubLObject)NIL, var89 = var85; var89.isCons(); var89 = var89.rest()) {
                    f50982(var89.first());
                }
                if (NIL != var89) {
                    f50983(var89);
                }
            }
            finally {
                module0601.$g4654$.rebind(var88, var86);
            }
            if (NIL != $g6369$.getDynamicValue(var86)) {
                PrintLow.format(module0587.$g4457$.getDynamicValue(var86), (SubLObject)$ic18$);
                f50937();
            }
            module0601.f36760(var87);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50983(final SubLObject var87) {
        final SubLThread var88 = SubLProcess.currentSubLThread();
        if (NIL != $g6369$.getDynamicValue(var88)) {
            PrintLow.format(module0587.$g4457$.getDynamicValue(var88), (SubLObject)$ic18$);
            f50937();
            final SubLObject var89 = (SubLObject)$ic80$;
            module0601.f36758(var89, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED);
            final SubLObject var90 = module0601.$g4654$.currentBinding(var88);
            try {
                module0601.$g4654$.bind(module0048.f_1X(module0601.$g4654$.getDynamicValue(var88)), var88);
                f50965(var87);
            }
            finally {
                module0601.$g4654$.rebind(var90, var88);
            }
            if (NIL != $g6369$.getDynamicValue(var88)) {
                PrintLow.format(module0587.$g4457$.getDynamicValue(var88), (SubLObject)$ic18$);
                f50937();
            }
            module0601.f36760(var89);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50982(final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        if (NIL != $g6369$.getDynamicValue(var16)) {
            PrintLow.format(module0587.$g4457$.getDynamicValue(var16), (SubLObject)$ic18$);
            f50937();
            final SubLObject var17 = (SubLObject)$ic81$;
            module0601.f36758(var17, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED);
            final SubLObject var18 = module0601.$g4654$.currentBinding(var16);
            try {
                module0601.$g4654$.bind(module0048.f_1X(module0601.$g4654$.getDynamicValue(var16)), var16);
                f50965(var15);
            }
            finally {
                module0601.$g4654$.rebind(var18, var16);
            }
            if (NIL != $g6369$.getDynamicValue(var16)) {
                PrintLow.format(module0587.$g4457$.getDynamicValue(var16), (SubLObject)$ic18$);
                f50937();
            }
            module0601.f36760(var17);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50967(final SubLObject var88) {
        final SubLThread var89 = SubLProcess.currentSubLThread();
        if (NIL != $g6369$.getDynamicValue(var89)) {
            PrintLow.format(module0587.$g4457$.getDynamicValue(var89), (SubLObject)$ic18$);
            f50937();
            final SubLObject var90 = (SubLObject)$ic82$;
            module0601.f36758(var90, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED);
            final SubLObject var91 = module0601.$g4654$.currentBinding(var89);
            try {
                module0601.$g4654$.bind(module0048.f_1X(module0601.$g4654$.getDynamicValue(var89)), var89);
                f50938(Packages.package_name(Symbols.symbol_package(var88)), (SubLObject)UNPROVIDED);
                f50943(Symbols.symbol_name(var88), (SubLObject)UNPROVIDED);
            }
            finally {
                module0601.$g4654$.rebind(var91, var89);
            }
            if (NIL != $g6369$.getDynamicValue(var89)) {
                PrintLow.format(module0587.$g4457$.getDynamicValue(var89), (SubLObject)$ic18$);
                f50937();
            }
            module0601.f36760(var90);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50961(final SubLObject var29) {
        final SubLThread var30 = SubLProcess.currentSubLThread();
        if (NIL != $g6369$.getDynamicValue(var30)) {
            PrintLow.format(module0587.$g4457$.getDynamicValue(var30), (SubLObject)$ic18$);
            f50937();
            final SubLObject var31 = (SubLObject)$ic83$;
            module0601.f36758(var31, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED);
            final SubLObject var32 = module0601.$g4654$.currentBinding(var30);
            try {
                module0601.$g4654$.bind(module0048.f_1X(module0601.$g4654$.getDynamicValue(var30)), var30);
                f50965(var29);
            }
            finally {
                module0601.$g4654$.rebind(var32, var30);
            }
            if (NIL != $g6369$.getDynamicValue(var30)) {
                PrintLow.format(module0587.$g4457$.getDynamicValue(var30), (SubLObject)$ic18$);
                f50937();
            }
            module0601.f36760(var31);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50962(final SubLObject var30) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        if (NIL != $g6369$.getDynamicValue(var31)) {
            PrintLow.format(module0587.$g4457$.getDynamicValue(var31), (SubLObject)$ic18$);
            f50937();
            final SubLObject var32 = (SubLObject)$ic84$;
            module0601.f36758(var32, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED);
            final SubLObject var33 = module0601.$g4654$.currentBinding(var31);
            try {
                module0601.$g4654$.bind(module0048.f_1X(module0601.$g4654$.getDynamicValue(var31)), var31);
                f50965(var30);
            }
            finally {
                module0601.$g4654$.rebind(var33, var31);
            }
            if (NIL != $g6369$.getDynamicValue(var31)) {
                PrintLow.format(module0587.$g4457$.getDynamicValue(var31), (SubLObject)$ic18$);
                f50937();
            }
            module0601.f36760(var32);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50963(final SubLObject var31) {
        final SubLThread var32 = SubLProcess.currentSubLThread();
        if (NIL != $g6369$.getDynamicValue(var32)) {
            PrintLow.format(module0587.$g4457$.getDynamicValue(var32), (SubLObject)$ic18$);
            f50937();
            final SubLObject var33 = (SubLObject)$ic85$;
            module0601.f36758(var33, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED);
            final SubLObject var34 = module0601.$g4654$.currentBinding(var32);
            try {
                module0601.$g4654$.bind(module0048.f_1X(module0601.$g4654$.getDynamicValue(var32)), var32);
                f50965(var31);
            }
            finally {
                module0601.$g4654$.rebind(var34, var32);
            }
            if (NIL != $g6369$.getDynamicValue(var32)) {
                PrintLow.format(module0587.$g4457$.getDynamicValue(var32), (SubLObject)$ic18$);
                f50937();
            }
            module0601.f36760(var33);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50966(final SubLObject var89) {
        final SubLThread var90 = SubLProcess.currentSubLThread();
        assert NIL != Types.floatp(var89) : var89;
        if (NIL != $g6369$.getDynamicValue(var90)) {
            PrintLow.format(module0587.$g4457$.getDynamicValue(var90), (SubLObject)$ic18$);
            f50937();
            final SubLObject var91 = (SubLObject)$ic10$;
            module0601.f36758(var91, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED);
            module0601.f36762(module0038.f2659((SubLObject)$ic87$, (SubLObject)$ic88$, print_high.princ_to_string(var89), (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
            module0601.f36760(var91);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50974(final SubLObject var90) {
        final SubLThread var91 = SubLProcess.currentSubLThread();
        if (NIL != $g6369$.getDynamicValue(var91)) {
            PrintLow.format(module0587.$g4457$.getDynamicValue(var91), (SubLObject)$ic18$);
            f50937();
            final SubLObject var92 = (SubLObject)$ic53$;
            module0601.f36758(var92, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED);
            final SubLObject var93 = module0601.$g4654$.currentBinding(var91);
            try {
                module0601.$g4654$.bind(module0048.f_1X(module0601.$g4654$.getDynamicValue(var91)), var91);
                f50965(var90);
            }
            finally {
                module0601.$g4654$.rebind(var93, var91);
            }
            if (NIL != $g6369$.getDynamicValue(var91)) {
                PrintLow.format(module0587.$g4457$.getDynamicValue(var91), (SubLObject)$ic18$);
                f50937();
            }
            module0601.f36760(var92);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50970(final SubLObject var91) {
        final SubLThread var92 = SubLProcess.currentSubLThread();
        if (NIL != $g6369$.getDynamicValue(var92)) {
            PrintLow.format(module0587.$g4457$.getDynamicValue(var92), (SubLObject)$ic18$);
            f50937();
            final SubLObject var93 = (SubLObject)$ic59$;
            module0601.f36758(var93, (SubLObject)ConsesLow.list((SubLObject)$ic89$, (SubLObject)((NIL != module0167.f10813(var91)) ? $ic90$ : $ic91$)), (SubLObject)NIL, (SubLObject)UNPROVIDED);
            final SubLObject var94 = module0601.$g4654$.currentBinding(var92);
            try {
                module0601.$g4654$.bind(module0048.f_1X(module0601.$g4654$.getDynamicValue(var92)), var92);
                f50965(module0205.f13132(var91));
                SubLObject var95 = module0205.f13207(var91, (SubLObject)UNPROVIDED);
                SubLObject var96 = (SubLObject)NIL;
                var96 = var95.first();
                while (NIL != var95) {
                    f50965(var96);
                    var95 = var95.rest();
                    var96 = var95.first();
                }
            }
            finally {
                module0601.$g4654$.rebind(var94, var92);
            }
            if (NIL != $g6369$.getDynamicValue(var92)) {
                PrintLow.format(module0587.$g4457$.getDynamicValue(var92), (SubLObject)$ic18$);
                f50937();
            }
            module0601.f36760(var93);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50973(final SubLObject var11, final SubLObject var33, SubLObject var34) {
        if (var34 == UNPROVIDED) {
            var34 = (SubLObject)NIL;
        }
        final SubLThread var35 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var33) : var33;
        if (NIL != $g6369$.getDynamicValue(var35)) {
            PrintLow.format(module0587.$g4457$.getDynamicValue(var35), (SubLObject)$ic18$);
            f50937();
            module0601.f36758(var11, var34, (SubLObject)NIL, (SubLObject)UNPROVIDED);
            module0601.f36754(var33);
            module0601.f36760(var11);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50939(final SubLObject var11, final SubLObject var92, SubLObject var34) {
        if (var34 == UNPROVIDED) {
            var34 = (SubLObject)NIL;
        }
        final SubLThread var93 = SubLProcess.currentSubLThread();
        if (NIL != $g6369$.getDynamicValue(var93)) {
            PrintLow.format(module0587.$g4457$.getDynamicValue(var93), (SubLObject)$ic18$);
            f50937();
            module0601.f36758(var11, var34, (SubLObject)NIL, (SubLObject)UNPROVIDED);
            module0601.f36761(var92, (SubLObject)UNPROVIDED);
            module0601.f36760(var11);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50984() {
        final SubLObject var17 = (SubLObject)ConsesLow.list(module0178.f11383((SubLObject)UNPROVIDED), module0178.f11383((SubLObject)UNPROVIDED), module0178.f11383((SubLObject)UNPROVIDED), module0178.f11383((SubLObject)UNPROVIDED), module0178.f11383((SubLObject)UNPROVIDED));
        f50954(var17, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50985() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0797", "f50937", "S#1765", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0797", "f50938", "S#55551", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0797", "f50940", "S#55552", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0797", "f50941", "S#55553", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0797", "f50942", "S#43024", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0797", "f50943", "S#55554", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0797", "f50944", "S#55555", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0797", "f50945", "S#55556", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0797", "f50946", "S#55557", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0797", "f50947", "S#55558", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0797", "f50948", "S#43021", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0797", "f50949", "S#55559", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0797", "f50951", "S#55560", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0797", "f50952", "S#55561", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0797", "f50953", "S#55562", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0797", "f50950", "S#55563", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0797", "f50954", "S#55564", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0797", "f50956", "S#55565", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0797", "f50958", "S#55566", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0797", "f50964", "S#55567", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0797", "f50965", "S#40771", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0797", "f50959", "S#53722", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0797", "f50960", "S#42593", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0797", "f50975", "S#40770", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0797", "f50976", "S#55568", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0797", "f50977", "S#55569", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0797", "f50978", "S#55570", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0797", "f50968", "S#43023", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0797", "f50969", "S#55571", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0797", "f50972", "S#55572", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0797", "f50979", "S#55573", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0797", "f50957", "S#55574", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0797", "f50980", "S#55575", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0797", "f50955", "S#55576", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0797", "f50981", "S#55577", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0797", "f50971", "S#55578", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0797", "f50983", "S#55579", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0797", "f50982", "S#55580", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0797", "f50967", "S#55581", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0797", "f50961", "S#45149", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0797", "f50962", "S#55582", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0797", "f50963", "S#55583", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0797", "f50966", "S#55584", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0797", "f50974", "S#55585", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0797", "f50970", "S#55586", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0797", "f50973", "S#55587", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0797", "f50939", "S#1761", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0797", "f50984", "S#55588", 0, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50986() {
        $g6369$ = SubLFiles.defparameter("S#1763", (SubLObject)T);
        $g6370$ = SubLFiles.defparameter("S#55589", (SubLObject)$ic0$);
        $g6371$ = SubLFiles.defparameter("S#55590", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50987() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f50985();
    }
    
    public void initializeVariables() {
        f50986();
    }
    
    public void runTopLevelForms() {
        f50987();
    }
    
    static {
        me = (SubLFile)new module0797();
        $g6369$ = null;
        $g6370$ = null;
        $g6371$ = null;
        $ic0$ = ConsesLow.list((SubLObject)makeString("xmlns:xsi"), (SubLObject)makeString("http://www.w3c.org/2001/XMLSchema-instance"), (SubLObject)makeString("xsi:noNamespaceSchemaLocation"), (SubLObject)makeString("http://opencyc.sourceforge.net/cycml.xsd"));
        $ic1$ = makeString("package");
        $ic2$ = makeString("comment");
        $ic3$ = makeString("guid");
        $ic4$ = makeString("assertion-id");
        $ic5$ = makeString("name");
        $ic6$ = makeString("character");
        $ic7$ = makeString("string");
        $ic8$ = makeString("url");
        $ic9$ = makeString("variable");
        $ic10$ = makeString("number");
        $ic11$ = makeKeyword("DIRECTION");
        $ic12$ = makeKeyword("OUTPUT");
        $ic13$ = makeKeyword("IF-DOES-NOT-EXIST");
        $ic14$ = makeKeyword("CREATE");
        $ic15$ = makeKeyword("IF-EXISTS");
        $ic16$ = makeKeyword("OVERWRITE");
        $ic17$ = makeString("");
        $ic18$ = makeString("~&");
        $ic19$ = makeString("<?xml version=\"1.0\" ?>");
        $ic20$ = makeString("<?xml version=\"1.0\" encoding=\"ISO-8859-1\" standalone=\"no\"?>");
        $ic21$ = makeString("<!DOCTYPE case SYSTEM \"PartiallySpecifiedCase.dtd\">");
        $ic22$ = makeString("cycml");
        $ic23$ = makeString("constants");
        $ic24$ = makeString("assertions");
        $ic25$ = makeString("assertion");
        $ic26$ = makeString("don't know how to serialize ~S");
        $ic27$ = makeString("paraphrase");
        $ic28$ = makeString("sentence");
        $ic29$ = constant_handles_oc.f8479((SubLObject)makeString("not"));
        $ic30$ = makeString("not");
        $ic31$ = constant_handles_oc.f8479((SubLObject)makeString("and"));
        $ic32$ = makeString("and");
        $ic33$ = constant_handles_oc.f8479((SubLObject)makeString("or"));
        $ic34$ = makeString("or");
        $ic35$ = constant_handles_oc.f8479((SubLObject)makeString("xor"));
        $ic36$ = makeString("xor");
        $ic37$ = constant_handles_oc.f8479((SubLObject)makeString("implies"));
        $ic38$ = makeString("implies");
        $ic39$ = constant_handles_oc.f8479((SubLObject)makeString("equiv"));
        $ic40$ = makeString("equiv");
        $ic41$ = constant_handles_oc.f8479((SubLObject)makeString("forAll"));
        $ic42$ = makeString("forAll");
        $ic43$ = constant_handles_oc.f8479((SubLObject)makeString("thereExists"));
        $ic44$ = makeString("thereExists");
        $ic45$ = constant_handles_oc.f8479((SubLObject)makeString("thereExistExactly"));
        $ic46$ = makeString("thereExistExactly");
        $ic47$ = constant_handles_oc.f8479((SubLObject)makeString("thereExistAtMost"));
        $ic48$ = makeString("thereExistAtMost");
        $ic49$ = constant_handles_oc.f8479((SubLObject)makeString("thereExistAtLeast"));
        $ic50$ = makeString("thereExistAtLeast");
        $ic51$ = constant_handles_oc.f8479((SubLObject)makeString("True"));
        $ic52$ = constant_handles_oc.f8479((SubLObject)makeString("False"));
        $ic53$ = makeString("predicate");
        $ic54$ = makeKeyword("HP");
        $ic55$ = ConsesLow.list((SubLObject)makeSymbol("S#38835", "CYC"), (SubLObject)makeSymbol("CONSTANT-NAME"), (SubLObject)makeSymbol("CONSTANT-GUID"));
        $ic56$ = makeString("constant");
        $ic57$ = makeKeyword("NAT");
        $ic58$ = ConsesLow.list((SubLObject)makeSymbol("S#55591", "CYC"), (SubLObject)makeSymbol("S#15204", "CYC"));
        $ic59$ = makeString("function");
        $ic60$ = constant_handles_oc.f8479((SubLObject)makeString("Quote"));
        $ic61$ = constant_handles_oc.f8479((SubLObject)makeString("QuasiQuote"));
        $ic62$ = constant_handles_oc.f8479((SubLObject)makeString("EscapeQuote"));
        $ic63$ = makeString("byteVector");
        $ic64$ = makeString("length");
        $ic65$ = makeInteger(32);
        $ic66$ = makeString(" ");
        $ic67$ = makeString("~2,'0X");
        $ic68$ = makeSymbol("?FILENAME");
        $ic69$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?SUBJECTCLUMP"), constant_handles_oc.f8479((SubLObject)makeString("CycSubjectClump")));
        $ic70$ = constant_handles_oc.f8479((SubLObject)makeString("cycSubjectClumps"));
        $ic71$ = ConsesLow.list((SubLObject)makeSymbol("?SUBJECTCLUMP"));
        $ic72$ = constant_handles_oc.f8479((SubLObject)makeString("mainSubjectClump"));
        $ic73$ = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("or")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("vocabFilename")), (SubLObject)makeSymbol("?SUBJECTCLUMP"), (SubLObject)makeSymbol("?FILENAME")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("and")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("superSubjectClump")), (SubLObject)makeSymbol("?SUBJECTCLUMP"), (SubLObject)makeSymbol("?SUPER")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("vocabFilename")), (SubLObject)makeSymbol("?SUPER"), (SubLObject)makeSymbol("?FILENAME")))));
        $ic74$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic75$ = makeString("http://www.cyc.com/cyc-2-1/vocab/");
        $ic76$ = makeString("#");
        $ic77$ = makeSymbol("CONSTANT-P");
        $ic78$ = makeSymbol("S#55577", "CYC");
        $ic79$ = makeString("list");
        $ic80$ = makeString("dotted-item");
        $ic81$ = makeString("item");
        $ic82$ = makeString("symbol");
        $ic83$ = makeString("microtheory");
        $ic84$ = makeString("strength");
        $ic85$ = makeString("direction");
        $ic86$ = makeSymbol("FLOATP");
        $ic87$ = makeString("E");
        $ic88$ = makeString("d");
        $ic89$ = makeString("reified");
        $ic90$ = makeString("true");
        $ic91$ = makeString("false");
        $ic92$ = makeSymbol("STRINGP");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 471 ms
	
	Decompiled with Procyon 0.5.32.
*/