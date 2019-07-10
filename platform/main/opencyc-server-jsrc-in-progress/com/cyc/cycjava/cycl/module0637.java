package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0637 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0637";
    public static final String myFingerPrint = "6e4cb6516b5bbb7f9c1d14050556d0201ba8662f28efd15e8842332e0795b62b";
    public static SubLSymbol $g4949$;
    private static SubLSymbol $g4950$;
    private static SubLSymbol $g4951$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLList $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLString $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLString $ic36$;
    private static final SubLString $ic37$;
    private static final SubLString $ic38$;
    private static final SubLString $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLString $ic41$;
    private static final SubLString $ic42$;
    private static final SubLString $ic43$;
    private static final SubLString $ic44$;
    private static final SubLString $ic45$;
    private static final SubLString $ic46$;
    private static final SubLString $ic47$;
    private static final SubLString $ic48$;
    private static final SubLString $ic49$;
    private static final SubLString $ic50$;
    private static final SubLString $ic51$;
    private static final SubLString $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLObject $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLList $ic62$;
    private static final SubLString $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLObject $ic65$;
    private static final SubLObject $ic66$;
    private static final SubLObject $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLObject $ic69$;
    
    public static SubLObject f38876(final SubLObject var1, final SubLObject var2) {
        f38877(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38878(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX42591_native.class) ? T : NIL);
    }
    
    public static SubLObject f38879(final SubLObject var1) {
        assert NIL != f38878(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f38880(final SubLObject var1) {
        assert NIL != f38878(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f38881(final SubLObject var1) {
        assert NIL != f38878(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f38882(final SubLObject var1) {
        assert NIL != f38878(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f38883(final SubLObject var1) {
        assert NIL != f38878(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f38884(final SubLObject var1) {
        assert NIL != f38878(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f38885(final SubLObject var1) {
        assert NIL != f38878(var1) : var1;
        return var1.getField8();
    }
    
    public static SubLObject f38886(final SubLObject var1, final SubLObject var4) {
        assert NIL != f38878(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f38887(final SubLObject var1, final SubLObject var4) {
        assert NIL != f38878(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f38888(final SubLObject var1, final SubLObject var4) {
        assert NIL != f38878(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f38889(final SubLObject var1, final SubLObject var4) {
        assert NIL != f38878(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f38890(final SubLObject var1, final SubLObject var4) {
        assert NIL != f38878(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f38891(final SubLObject var1, final SubLObject var4) {
        assert NIL != f38878(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f38892(final SubLObject var1, final SubLObject var4) {
        assert NIL != f38878(var1) : var1;
        return var1.setField8(var4);
    }
    
    public static SubLObject f38893(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX42591_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic23$)) {
                f38886(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic24$)) {
                f38887(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic25$)) {
                f38888(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic26$)) {
                f38889(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic27$)) {
                f38890(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic28$)) {
                f38891(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic29$)) {
                f38892(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic30$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f38894(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic31$, (SubLObject)$ic32$, (SubLObject)SEVEN_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic33$, (SubLObject)$ic23$, f38879(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic33$, (SubLObject)$ic24$, f38880(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic33$, (SubLObject)$ic25$, f38881(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic33$, (SubLObject)$ic26$, f38882(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic33$, (SubLObject)$ic27$, f38883(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic33$, (SubLObject)$ic28$, f38884(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic33$, (SubLObject)$ic29$, f38885(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic34$, (SubLObject)$ic32$, (SubLObject)SEVEN_INTEGER);
        return var11;
    }
    
    public static SubLObject f38895(final SubLObject var11, final SubLObject var12) {
        return f38894(var11, var12);
    }
    
    public static SubLObject f38877(final SubLObject var13, final SubLObject var2, final SubLObject var14) {
        PrintLow.format(var2, (SubLObject)$ic36$, new SubLObject[] { f38879(var13), f38880(var13), f38881(var13), f38882(var13) });
        module0038.f2648(var2, var14);
        PrintLow.format(var2, (SubLObject)$ic37$, f38883(var13));
        if (NIL != f38884(var13)) {
            PrintLow.format(var2, (SubLObject)$ic38$, f38884(var13));
        }
        if (NIL != f38885(var13)) {
            streams_high.write_string((SubLObject)$ic39$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        streams_high.write_char((SubLObject)Characters.CHAR_greater, var2);
        return var13;
    }
    
    public static SubLObject f38896(final SubLObject var15, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0587.$g4457$.getDynamicValue();
        }
        final SubLThread var16 = SubLProcess.currentSubLThread();
        assert NIL != f38878(var15) : var15;
        SubLObject var17 = (SubLObject)NIL;
        SubLObject var18 = (SubLObject)NIL;
        try {
            var16.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var19 = Errors.$error_handler$.currentBinding(var16);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic40$, var16);
                try {
                    SubLObject var20_21 = (SubLObject)NIL;
                    try {
                        var20_21 = streams_high.make_private_string_output_stream();
                        final SubLObject var19_22 = module0587.$g4457$.currentBinding(var16);
                        try {
                            module0587.$g4457$.bind(var20_21, var16);
                            try {
                                final SubLObject var19_23 = module0601.$g4652$.currentBinding(var16);
                                final SubLObject var20 = module0601.$g4654$.currentBinding(var16);
                                try {
                                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var16), module0601.$g4652$.getDynamicValue(var16)), var16);
                                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var16), var16);
                                    module0601.f36758((SubLObject)$ic41$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                    try {
                                        final SubLObject var19_24 = module0601.$g4652$.currentBinding(var16);
                                        final SubLObject var24_26 = module0601.$g4654$.currentBinding(var16);
                                        try {
                                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var16), module0601.$g4652$.getDynamicValue(var16)), var16);
                                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var16), var16);
                                            module0601.f36758((SubLObject)$ic42$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                            module0797.f50965(f38879(var15));
                                        }
                                        finally {
                                            module0601.$g4654$.rebind(var24_26, var16);
                                            module0601.$g4652$.rebind(var19_24, var16);
                                        }
                                    }
                                    finally {
                                        final SubLObject var19_25 = Threads.$is_thread_performing_cleanupP$.currentBinding(var16);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var16);
                                            module0601.f36746();
                                            module0601.f36760((SubLObject)$ic42$);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var19_25, var16);
                                        }
                                    }
                                    try {
                                        final SubLObject var19_26 = module0601.$g4652$.currentBinding(var16);
                                        final SubLObject var24_27 = module0601.$g4654$.currentBinding(var16);
                                        try {
                                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var16), module0601.$g4652$.getDynamicValue(var16)), var16);
                                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var16), var16);
                                            module0601.f36758((SubLObject)$ic43$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                            final SubLObject var21 = f38880(var15);
                                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var16) && NIL == module0206.f13425(var21)) {
                                                Errors.error((SubLObject)$ic44$, f38879(var15), var21);
                                            }
                                            module0797.f50960(var21);
                                        }
                                        finally {
                                            module0601.$g4654$.rebind(var24_27, var16);
                                            module0601.$g4652$.rebind(var19_26, var16);
                                        }
                                    }
                                    finally {
                                        final SubLObject var19_27 = Threads.$is_thread_performing_cleanupP$.currentBinding(var16);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var16);
                                            module0601.f36746();
                                            module0601.f36760((SubLObject)$ic43$);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var19_27, var16);
                                        }
                                    }
                                    try {
                                        final SubLObject var19_28 = module0601.$g4652$.currentBinding(var16);
                                        final SubLObject var24_28 = module0601.$g4654$.currentBinding(var16);
                                        try {
                                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var16), module0601.$g4652$.getDynamicValue(var16)), var16);
                                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var16), var16);
                                            module0601.f36758((SubLObject)$ic45$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                            module0797.f50965(f38881(var15));
                                        }
                                        finally {
                                            module0601.$g4654$.rebind(var24_28, var16);
                                            module0601.$g4652$.rebind(var19_28, var16);
                                        }
                                    }
                                    finally {
                                        final SubLObject var19_29 = Threads.$is_thread_performing_cleanupP$.currentBinding(var16);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var16);
                                            module0601.f36746();
                                            module0601.f36760((SubLObject)$ic45$);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var19_29, var16);
                                        }
                                    }
                                    if (NIL != f38882(var15)) {
                                        try {
                                            final SubLObject var19_30 = module0601.$g4652$.currentBinding(var16);
                                            final SubLObject var24_29 = module0601.$g4654$.currentBinding(var16);
                                            try {
                                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var16), module0601.$g4652$.getDynamicValue(var16)), var16);
                                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var16), var16);
                                                module0601.f36758((SubLObject)$ic46$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                                module0797.f50965(f38882(var15));
                                            }
                                            finally {
                                                module0601.$g4654$.rebind(var24_29, var16);
                                                module0601.$g4652$.rebind(var19_30, var16);
                                            }
                                        }
                                        finally {
                                            final SubLObject var19_31 = Threads.$is_thread_performing_cleanupP$.currentBinding(var16);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var16);
                                                module0601.f36746();
                                                module0601.f36760((SubLObject)$ic46$);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var19_31, var16);
                                            }
                                        }
                                    }
                                    if (NIL != f38883(var15)) {
                                        try {
                                            final SubLObject var19_32 = module0601.$g4652$.currentBinding(var16);
                                            final SubLObject var24_30 = module0601.$g4654$.currentBinding(var16);
                                            try {
                                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var16), module0601.$g4652$.getDynamicValue(var16)), var16);
                                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var16), var16);
                                                module0601.f36758((SubLObject)$ic47$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                                SubLObject var22;
                                                SubLObject var23;
                                                SubLObject var24;
                                                for (var22 = (SubLObject)NIL, var22 = f38883(var15); NIL != var22; var22 = conses_high.cddr(var22)) {
                                                    var23 = var22.first();
                                                    var24 = conses_high.cadr(var22);
                                                    f38897(var23, var24);
                                                }
                                            }
                                            finally {
                                                module0601.$g4654$.rebind(var24_30, var16);
                                                module0601.$g4652$.rebind(var19_32, var16);
                                            }
                                        }
                                        finally {
                                            final SubLObject var19_33 = Threads.$is_thread_performing_cleanupP$.currentBinding(var16);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var16);
                                                module0601.f36746();
                                                module0601.f36760((SubLObject)$ic47$);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var19_33, var16);
                                            }
                                        }
                                    }
                                    if (NIL != f38884(var15)) {
                                        try {
                                            final SubLObject var19_34 = module0601.$g4652$.currentBinding(var16);
                                            final SubLObject var24_31 = module0601.$g4654$.currentBinding(var16);
                                            try {
                                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var16), module0601.$g4652$.getDynamicValue(var16)), var16);
                                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var16), var16);
                                                module0601.f36758((SubLObject)$ic48$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                                SubLObject var25 = f38884(var15);
                                                SubLObject var26 = (SubLObject)NIL;
                                                var26 = var25.first();
                                                while (NIL != var25) {
                                                    try {
                                                        final SubLObject var19_35 = module0601.$g4652$.currentBinding(var16);
                                                        final SubLObject var24_32 = module0601.$g4654$.currentBinding(var16);
                                                        try {
                                                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var16), module0601.$g4652$.getDynamicValue(var16)), var16);
                                                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var16), var16);
                                                            module0601.f36758((SubLObject)$ic49$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                                            module0797.f50965(var26);
                                                        }
                                                        finally {
                                                            module0601.$g4654$.rebind(var24_32, var16);
                                                            module0601.$g4652$.rebind(var19_35, var16);
                                                        }
                                                    }
                                                    finally {
                                                        final SubLObject var19_36 = Threads.$is_thread_performing_cleanupP$.currentBinding(var16);
                                                        try {
                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var16);
                                                            module0601.f36746();
                                                            module0601.f36760((SubLObject)$ic49$);
                                                        }
                                                        finally {
                                                            Threads.$is_thread_performing_cleanupP$.rebind(var19_36, var16);
                                                        }
                                                    }
                                                    var25 = var25.rest();
                                                    var26 = var25.first();
                                                }
                                            }
                                            finally {
                                                module0601.$g4654$.rebind(var24_31, var16);
                                                module0601.$g4652$.rebind(var19_34, var16);
                                            }
                                        }
                                        finally {
                                            final SubLObject var19_37 = Threads.$is_thread_performing_cleanupP$.currentBinding(var16);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var16);
                                                module0601.f36746();
                                                module0601.f36760((SubLObject)$ic48$);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var19_37, var16);
                                            }
                                        }
                                    }
                                }
                                finally {
                                    module0601.$g4654$.rebind(var20, var16);
                                    module0601.$g4652$.rebind(var19_23, var16);
                                }
                            }
                            finally {
                                final SubLObject var19_38 = Threads.$is_thread_performing_cleanupP$.currentBinding(var16);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var16);
                                    module0601.f36746();
                                    module0601.f36760((SubLObject)$ic41$);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var19_38, var16);
                                }
                            }
                        }
                        finally {
                            module0587.$g4457$.rebind(var19_22, var16);
                        }
                        var18 = streams_high.get_output_stream_string(var20_21);
                    }
                    finally {
                        final SubLObject var19_39 = Threads.$is_thread_performing_cleanupP$.currentBinding(var16);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var16);
                            streams_high.close(var20_21, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var19_39, var16);
                        }
                    }
                }
                catch (Throwable var27) {
                    Errors.handleThrowable(var27, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var19, var16);
            }
        }
        catch (Throwable var28) {
            var17 = Errors.handleThrowable(var28, module0003.$g3$.getGlobalValue());
        }
        finally {
            var16.throwStack.pop();
        }
        if (NIL != var17) {
            Errors.error(var17);
        }
        else {
            print_high.princ(var18, var2);
        }
        return var15;
    }
    
    public static SubLObject f38897(final SubLObject var41, final SubLObject var42) {
        final SubLThread var43 = SubLProcess.currentSubLThread();
        try {
            final SubLObject var44 = module0601.$g4652$.currentBinding(var43);
            final SubLObject var45 = module0601.$g4654$.currentBinding(var43);
            try {
                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var43), module0601.$g4652$.getDynamicValue(var43)), var43);
                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var43), var43);
                module0601.f36758((SubLObject)$ic50$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                try {
                    final SubLObject var19_56 = module0601.$g4652$.currentBinding(var43);
                    final SubLObject var24_57 = module0601.$g4654$.currentBinding(var43);
                    try {
                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var43), module0601.$g4652$.getDynamicValue(var43)), var43);
                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var43), var43);
                        module0601.f36758((SubLObject)$ic51$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                        streams_high.write_string(Symbols.symbol_name(var41), module0587.$g4457$.getDynamicValue(var43), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0601.$g4654$.rebind(var24_57, var43);
                        module0601.$g4652$.rebind(var19_56, var43);
                    }
                }
                finally {
                    final SubLObject var19_57 = Threads.$is_thread_performing_cleanupP$.currentBinding(var43);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var43);
                        module0601.f36746();
                        module0601.f36760((SubLObject)$ic51$);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var19_57, var43);
                    }
                }
                try {
                    final SubLObject var19_58 = module0601.$g4652$.currentBinding(var43);
                    final SubLObject var24_58 = module0601.$g4654$.currentBinding(var43);
                    try {
                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var43), module0601.$g4652$.getDynamicValue(var43)), var43);
                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var43), var43);
                        module0601.f36758((SubLObject)$ic52$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                        module0797.f50965(var42);
                    }
                    finally {
                        module0601.$g4654$.rebind(var24_58, var43);
                        module0601.$g4652$.rebind(var19_58, var43);
                    }
                }
                finally {
                    final SubLObject var19_59 = Threads.$is_thread_performing_cleanupP$.currentBinding(var43);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var43);
                        module0601.f36746();
                        module0601.f36760((SubLObject)$ic52$);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var19_59, var43);
                    }
                }
            }
            finally {
                module0601.$g4654$.rebind(var45, var43);
                module0601.$g4652$.rebind(var44, var43);
            }
        }
        finally {
            final SubLObject var46 = Threads.$is_thread_performing_cleanupP$.currentBinding(var43);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var43);
                module0601.f36746();
                module0601.f36760((SubLObject)$ic50$);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var46, var43);
            }
        }
        return var42;
    }
    
    public static SubLObject f38898(final SubLObject var15) {
        assert NIL != f38878(var15) : var15;
        return f38879(var15);
    }
    
    public static SubLObject f38899(final SubLObject var15) {
        assert NIL != f38878(var15) : var15;
        return f38880(var15);
    }
    
    public static SubLObject f38900(final SubLObject var15) {
        assert NIL != f38878(var15) : var15;
        return f38881(var15);
    }
    
    public static SubLObject f38901(final SubLObject var15) {
        assert NIL != f38878(var15) : var15;
        return f38882(var15);
    }
    
    public static SubLObject f38902(final SubLObject var15) {
        assert NIL != f38878(var15) : var15;
        return f38883(var15);
    }
    
    public static SubLObject f38903(final SubLObject var15) {
        assert NIL != f38878(var15) : var15;
        return f38884(var15);
    }
    
    public static SubLObject f38904(final SubLObject var15) {
        assert NIL != f38878(var15) : var15;
        return f38885(var15);
    }
    
    public static SubLObject f38905(final SubLObject var15, final SubLObject var62) {
        assert NIL != f38878(var15) : var15;
        f38886(var15, var62);
        return var15;
    }
    
    public static SubLObject f38906(final SubLObject var15, final SubLObject var63) {
        assert NIL != f38878(var15) : var15;
        f38887(var15, var63);
        return var15;
    }
    
    public static SubLObject f38907(final SubLObject var15, final SubLObject var64) {
        assert NIL != f38878(var15) : var15;
        f38888(var15, var64);
        return var15;
    }
    
    public static SubLObject f38908(final SubLObject var15, final SubLObject var65) {
        assert NIL != f38878(var15) : var15;
        f38889(var15, var65);
        return var15;
    }
    
    public static SubLObject f38909(final SubLObject var15, final SubLObject var66) {
        assert NIL != f38878(var15) : var15;
        f38890(var15, var66);
        return var15;
    }
    
    public static SubLObject f38910(final SubLObject var15, final SubLObject var66) {
        return f38909(var15, module0412.f28670(var66));
    }
    
    public static SubLObject f38911(final SubLObject var15, final SubLObject var67) {
        assert NIL != f38878(var15) : var15;
        f38891(var15, var67);
        return var15;
    }
    
    public static SubLObject f38912(final SubLObject var15) {
        assert NIL != f38878(var15) : var15;
        f38892(var15, var15);
        return var15;
    }
    
    public static SubLObject f38913(final SubLObject var15) {
        return (SubLObject)makeBoolean(NIL != f38903(var15));
    }
    
    public static SubLObject f38914(final SubLObject var15) {
        return f38904(var15);
    }
    
    public static SubLObject f38915(final SubLObject var15) {
        f38892(var15, (SubLObject)$ic53$);
        return var15;
    }
    
    public static SubLObject f38916(final SubLObject var13, final SubLObject var68) {
        SubLObject var69 = f38902(var13);
        SubLObject var70 = conses_high.copy_list(var69);
        final SubLObject var71 = conses_high.getf(var69, (SubLObject)$ic54$, (SubLObject)NIL);
        if (NIL != var71) {
            var69 = module0035.f2350(conses_high.copy_list(var69), module0412.f28715(var71));
        }
        SubLObject var72 = (SubLObject)NIL;
        SubLObject var73;
        SubLObject var74;
        SubLObject var75;
        for (var73 = (SubLObject)NIL, var73 = var68; NIL != var73; var73 = conses_high.cddr(var73)) {
            var74 = var73.first();
            var75 = conses_high.cadr(var73);
            if (NIL == module0035.f2346(var69, var74)) {
                var72 = (SubLObject)T;
                var70 = conses_high.putf(var70, var74, var75);
            }
        }
        if (NIL != var72) {
            f38909(var13, var70);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38917(final SubLObject var15, final SubLObject var63) {
        assert NIL != f38878(var15) : var15;
        assert NIL != module0202.f12590(var63) : var63;
        f38887(var15, var63);
        f38915(var15);
        return f38880(var15);
    }
    
    public static SubLObject f38918(final SubLObject var15, final SubLObject var64) {
        assert NIL != f38878(var15) : var15;
        assert NIL != module0269.f17731(var64) : var64;
        f38888(var15, var64);
        f38915(var15);
        return f38881(var15);
    }
    
    public static SubLObject f38919(final SubLObject var74) {
        return (SubLObject)makeBoolean((NIL != module0172.f10917(var74) && NIL != f38920(var74)) || (NIL != module0167.f10813(var74) && NIL != f38920(module0172.f10920(var74))));
    }
    
    public static SubLObject f38920(final SubLObject var74) {
        return (SubLObject)makeBoolean(NIL != module0202.f12608(var74) && module0205.f13132(var74).eql($ic57$));
    }
    
    public static SubLObject f38921() {
        final SubLObject var15 = f38893((SubLObject)UNPROVIDED);
        return var15;
    }
    
    public static SubLObject f38922(SubLObject var75, SubLObject var64) {
        if (var64 == UNPROVIDED) {
            var64 = (SubLObject)NIL;
        }
        assert NIL != module0206.f13444(var75) : var75;
        final SubLObject var76 = f38921();
        if (NIL != module0228.f15225(var75)) {
            final SubLObject var77 = module0172.f10921(var75);
            if (NIL != var77) {
                var75 = var77;
            }
        }
        f38886(var76, var75);
        f38923(var75, var76);
        f38924(var75, var76);
        f38925(var75, var76);
        f38926(var76);
        return var76;
    }
    
    public static SubLObject f38926(final SubLObject var15) {
        final SubLObject var16 = f38880(var15);
        final SubLObject var17 = module0035.f2399(var16, Symbols.symbol_function((SubLObject)$ic59$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL == module0035.f2012(var17)) {
            final SubLObject var18 = module0077.f5313(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
            SubLObject var19 = var17;
            SubLObject var20 = (SubLObject)NIL;
            var20 = var19.first();
            while (NIL != var19) {
                module0077.f5326(var20, var18);
                var19 = var19.rest();
                var20 = var19.first();
            }
            f38891(var15, var18);
        }
        return var15;
    }
    
    public static SubLObject f38923(final SubLObject var75, final SubLObject var15) {
        final SubLObject var76 = module0423.f29563(var75);
        f38887(var15, module0285.f18933(var76, (SubLObject)UNPROVIDED));
        return var15;
    }
    
    public static SubLObject f38924(final SubLObject var75, final SubLObject var15) {
        final SubLObject var76 = module0423.f29569(var75);
        f38888(var15, module0172.f10922(var76));
        return var15;
    }
    
    public static SubLObject f38925(final SubLObject var75, final SubLObject var15) {
        final SubLObject var76 = module0035.f2329(module0423.f29573(var75), (SubLObject)$ic60$);
        f38890(var15, var76);
        return var15;
    }
    
    public static SubLObject f38927(final SubLObject var13) {
        assert NIL != f38878(var13) : var13;
        final SubLObject var14 = f38921();
        f38886(var14, f38879(var13));
        f38887(var14, module0202.f12763(f38880(var13)));
        f38888(var14, f38881(var13));
        f38890(var14, conses_high.copy_list(f38883(var13)));
        if (NIL != f38913(var13)) {
            f38891(var14, module0077.f5314(f38884(var13)));
        }
        f38915(var14);
        return var14;
    }
    
    public static SubLObject f38928(final SubLObject var13, final SubLObject var82, SubLObject var83) {
        if (var83 == UNPROVIDED) {
            var83 = (SubLObject)T;
        }
        assert NIL != f38878(var13) : var13;
        assert NIL != Types.listp(var82) : var82;
        final SubLObject var84 = f38927(var13);
        final SubLObject var85 = f38903(var84);
        final SubLObject var86 = f38899(var84);
        SubLObject var87 = var82;
        SubLObject var88 = (SubLObject)NIL;
        var88 = var87.first();
        while (NIL != var87) {
            SubLObject var90;
            final SubLObject var89 = var90 = var88;
            SubLObject var91 = (SubLObject)NIL;
            SubLObject var92 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var90, var89, (SubLObject)$ic62$);
            var91 = var90.first();
            var90 = (var92 = var90.rest());
            conses_high.nsubst(var92, var91, var86, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
            module0077.f5327(var91, var85);
            var87 = var87.rest();
            var88 = var87.first();
        }
        if (NIL != module0077.f5316(var85)) {
            f38891(var84, (SubLObject)NIL);
        }
        else if (NIL != var83) {
            Errors.error((SubLObject)$ic63$, module0077.f5312(var85));
        }
        return var84;
    }
    
    public static SubLObject f38929(SubLObject var13, SubLObject var64, SubLObject var82, SubLObject var90) {
        if (var64 == UNPROVIDED) {
            var64 = (SubLObject)NIL;
        }
        if (var82 == UNPROVIDED) {
            var82 = (SubLObject)NIL;
        }
        if (var90 == UNPROVIDED) {
            var90 = (SubLObject)NIL;
        }
        assert NIL != f38878(var13) : var13;
        if (NIL != var82) {
            var13 = f38928(var13, var82, (SubLObject)UNPROVIDED);
        }
        if (NIL == module0269.f17731(var64)) {
            var64 = f38881(var13);
        }
        SubLObject var91 = f38883(var13);
        var91 = module0035.f2341(var91, var90);
        return module0409.f28506(f38880(var13), var64, var91);
    }
    
    public static SubLObject f38930() {
        f38931();
        return f38932();
    }
    
    public static SubLObject f38931() {
        if (NIL == f38933()) {
            f38934();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38933() {
        return (SubLObject)makeBoolean(NIL != $g4950$.getGlobalValue());
    }
    
    public static SubLObject f38932() {
        return $g4950$.getGlobalValue();
    }
    
    public static SubLObject f38935(final SubLObject var74) {
        return module0077.f5320(var74, f38930());
    }
    
    public static SubLObject f38934() {
        $g4950$.setGlobalValue(f38936());
        return f38932();
    }
    
    public static SubLObject f38936() {
        final SubLObject var92 = f38937();
        final SubLObject var93 = module0077.f5313(Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
        SubLObject var94 = var92;
        SubLObject var95 = (SubLObject)NIL;
        var95 = var94.first();
        while (NIL != var94) {
            final SubLObject var96 = f38938(var95);
            module0077.f5326(var96, var93);
            var94 = var94.rest();
            var95 = var94.first();
        }
        return var93;
    }
    
    public static SubLObject f38937() {
        return module0259.f16848($ic65$, $ic66$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f38938(final SubLObject var94) {
        final SubLThread var95 = SubLProcess.currentSubLThread();
        SubLObject var96 = (SubLObject)NIL;
        final SubLObject var97 = module0147.f9540($g4951$.getGlobalValue());
        final SubLObject var98 = module0147.$g2095$.currentBinding(var95);
        final SubLObject var99 = module0147.$g2094$.currentBinding(var95);
        final SubLObject var100 = module0147.$g2096$.currentBinding(var95);
        try {
            module0147.$g2095$.bind(module0147.f9545(var97), var95);
            module0147.$g2094$.bind(module0147.f9546(var97), var95);
            module0147.$g2096$.bind(module0147.f9549(var97), var95);
            final SubLObject var101 = module0220.f14553(var94, $ic67$, (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)$ic68$);
            if (NIL != module0202.f12589(var101, $ic69$)) {
                var96 = module0205.f13203(var101, (SubLObject)UNPROVIDED);
            }
        }
        finally {
            module0147.$g2096$.rebind(var100, var95);
            module0147.$g2094$.rebind(var99, var95);
            module0147.$g2095$.rebind(var98, var95);
        }
        return var96;
    }
    
    public static SubLObject f38939() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38876", "S#42594", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38878", "S#42592", 1, 0, false);
        new $f38878$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38879", "S#42595", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38880", "S#42596", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38881", "S#42597", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38882", "S#42598", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38883", "S#42599", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38884", "S#42600", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38885", "S#42601", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38886", "S#42602", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38887", "S#42603", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38888", "S#42604", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38889", "S#42605", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38890", "S#42606", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38891", "S#42607", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38892", "S#42608", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38893", "S#42609", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38894", "S#42610", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38895", "S#42611", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38877", "S#42612", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38896", "S#42613", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38897", "S#42614", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38898", "S#42615", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38899", "S#42616", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38900", "S#42617", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38901", "S#42618", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38902", "S#42619", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38903", "S#42620", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38904", "S#42621", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38905", "S#42622", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38906", "S#42623", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38907", "S#42624", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38908", "S#42625", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38909", "S#42626", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38910", "S#42627", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38911", "S#42628", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38912", "S#42629", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38913", "S#42630", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38914", "S#42631", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38915", "S#42632", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38916", "S#42633", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38917", "S#42634", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38918", "S#42635", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38919", "S#42636", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38920", "S#42637", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38921", "S#42638", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38922", "S#42639", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38926", "S#42640", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38923", "S#42641", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38924", "S#42642", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38925", "S#42643", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38927", "S#42644", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38928", "S#42645", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38929", "S#42646", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38930", "S#42647", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38931", "S#42648", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38933", "S#42649", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38932", "S#42650", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38935", "S#42651", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38934", "S#42652", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38936", "S#42653", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38937", "S#42654", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0637", "f38938", "S#42655", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38940() {
        $g4949$ = SubLFiles.defconstant("S#42656", (SubLObject)$ic0$);
        $g4950$ = SubLFiles.deflexical("S#42657", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic64$)) ? $g4950$.getGlobalValue() : NIL));
        $g4951$ = SubLFiles.deflexical("S#42658", $ic66$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38941() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g4949$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic8$);
        Structures.def_csetf((SubLObject)$ic9$, (SubLObject)$ic10$);
        Structures.def_csetf((SubLObject)$ic11$, (SubLObject)$ic12$);
        Structures.def_csetf((SubLObject)$ic13$, (SubLObject)$ic14$);
        Structures.def_csetf((SubLObject)$ic15$, (SubLObject)$ic16$);
        Structures.def_csetf((SubLObject)$ic17$, (SubLObject)$ic18$);
        Structures.def_csetf((SubLObject)$ic19$, (SubLObject)$ic20$);
        Structures.def_csetf((SubLObject)$ic21$, (SubLObject)$ic22$);
        Equality.identity((SubLObject)$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g4949$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic35$));
        module0003.f57((SubLObject)$ic64$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f38939();
    }
    
    public void initializeVariables() {
        f38940();
    }
    
    public void runTopLevelForms() {
        f38941();
    }
    
    static {
        me = (SubLFile)new module0637();
        $g4949$ = null;
        $g4950$ = null;
        $g4951$ = null;
        $ic0$ = makeSymbol("S#42591", "CYC");
        $ic1$ = makeSymbol("S#42592", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)makeSymbol("S#42579", "CYC"), (SubLObject)makeSymbol("S#6061", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("COMMENT"), (SubLObject)makeSymbol("S#5852", "CYC"), (SubLObject)makeSymbol("S#42659", "CYC"), (SubLObject)makeSymbol("S#42660", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)makeKeyword("CYCL-ID"), (SubLObject)makeKeyword("FORMULA"), (SubLObject)makeKeyword("MT"), (SubLObject)makeKeyword("COMMENT"), (SubLObject)makeKeyword("PROPERTIES"), (SubLObject)makeKeyword("INDEXICALS"), (SubLObject)makeKeyword("EDITED"));
        $ic4$ = ConsesLow.list((SubLObject)makeSymbol("S#42595", "CYC"), (SubLObject)makeSymbol("S#42596", "CYC"), (SubLObject)makeSymbol("S#42597", "CYC"), (SubLObject)makeSymbol("S#42598", "CYC"), (SubLObject)makeSymbol("S#42599", "CYC"), (SubLObject)makeSymbol("S#42600", "CYC"), (SubLObject)makeSymbol("S#42601", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#42602", "CYC"), (SubLObject)makeSymbol("S#42603", "CYC"), (SubLObject)makeSymbol("S#42604", "CYC"), (SubLObject)makeSymbol("S#42605", "CYC"), (SubLObject)makeSymbol("S#42606", "CYC"), (SubLObject)makeSymbol("S#42607", "CYC"), (SubLObject)makeSymbol("S#42608", "CYC"));
        $ic6$ = makeSymbol("S#42612", "CYC");
        $ic7$ = makeSymbol("S#42594", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#42592", "CYC"));
        $ic9$ = makeSymbol("S#42595", "CYC");
        $ic10$ = makeSymbol("S#42602", "CYC");
        $ic11$ = makeSymbol("S#42596", "CYC");
        $ic12$ = makeSymbol("S#42603", "CYC");
        $ic13$ = makeSymbol("S#42597", "CYC");
        $ic14$ = makeSymbol("S#42604", "CYC");
        $ic15$ = makeSymbol("S#42598", "CYC");
        $ic16$ = makeSymbol("S#42605", "CYC");
        $ic17$ = makeSymbol("S#42599", "CYC");
        $ic18$ = makeSymbol("S#42606", "CYC");
        $ic19$ = makeSymbol("S#42600", "CYC");
        $ic20$ = makeSymbol("S#42607", "CYC");
        $ic21$ = makeSymbol("S#42601", "CYC");
        $ic22$ = makeSymbol("S#42608", "CYC");
        $ic23$ = makeKeyword("CYCL-ID");
        $ic24$ = makeKeyword("FORMULA");
        $ic25$ = makeKeyword("MT");
        $ic26$ = makeKeyword("COMMENT");
        $ic27$ = makeKeyword("PROPERTIES");
        $ic28$ = makeKeyword("INDEXICALS");
        $ic29$ = makeKeyword("EDITED");
        $ic30$ = makeString("Invalid slot ~S for construction function");
        $ic31$ = makeKeyword("BEGIN");
        $ic32$ = makeSymbol("S#42609", "CYC");
        $ic33$ = makeKeyword("SLOT");
        $ic34$ = makeKeyword("END");
        $ic35$ = makeSymbol("S#42611", "CYC");
        $ic36$ = makeString("<NEW-CYCL-QUERY-SPECIFICATION ~S ~S in ~S ;; ~A~% ");
        $ic37$ = makeString(" Properties: ~S ");
        $ic38$ = makeString(" Template Slots: ~S ");
        $ic39$ = makeString(" (changed) ");
        $ic40$ = makeSymbol("S#38", "CYC");
        $ic41$ = makeString("cyclQuery");
        $ic42$ = makeString("queryID");
        $ic43$ = makeString("queryFormula");
        $ic44$ = makeString("Can't serialize ~S.~% Its query formula is not a valid CycL sentence:~% ~S");
        $ic45$ = makeString("queryMt");
        $ic46$ = makeString("queryComment");
        $ic47$ = makeString("queryInferenceProperties");
        $ic48$ = makeString("queryIndexicals");
        $ic49$ = makeString("queryIndexical");
        $ic50$ = makeString("queryInferenceProperty");
        $ic51$ = makeString("propertySymbol");
        $ic52$ = makeString("propertyValue");
        $ic53$ = makeKeyword("CHANGED");
        $ic54$ = makeKeyword("INFERENCE-MODE");
        $ic55$ = makeSymbol("S#12753", "CYC");
        $ic56$ = makeSymbol("S#16717", "CYC");
        $ic57$ = constant_handles_oc.f8479((SubLObject)makeString("TheNthFn"));
        $ic58$ = makeSymbol("CYCL-DENOTATIONAL-TERM-P");
        $ic59$ = makeSymbol("S#42636", "CYC");
        $ic60$ = makeSymbol("S#42651", "CYC");
        $ic61$ = makeSymbol("LISTP");
        $ic62$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("S#42661", "CYC"));
        $ic63$ = makeString("Insufficient number of substitutions -- indexicals ~A unaccounted for.");
        $ic64$ = makeSymbol("S#42657", "CYC");
        $ic65$ = constant_handles_oc.f8479((SubLObject)makeString("InferenceParameter"));
        $ic66$ = constant_handles_oc.f8479((SubLObject)makeString("CycAPIMt"));
        $ic67$ = constant_handles_oc.f8479((SubLObject)makeString("subLIdentifier"));
        $ic68$ = makeKeyword("TRUE");
        $ic69$ = constant_handles_oc.f8479((SubLObject)makeString("SubLQuoteFn"));
    }
    
    public static final class $sX42591_native extends SubLStructNative
    {
        public SubLObject $cycl_id;
        public SubLObject $formula;
        public SubLObject $mt;
        public SubLObject $comment;
        public SubLObject $properties;
        public SubLObject $indexicals;
        public SubLObject $edited;
        public static final SubLStructDeclNative structDecl;
        
        public $sX42591_native() {
            this.$cycl_id = (SubLObject)CommonSymbols.NIL;
            this.$formula = (SubLObject)CommonSymbols.NIL;
            this.$mt = (SubLObject)CommonSymbols.NIL;
            this.$comment = (SubLObject)CommonSymbols.NIL;
            this.$properties = (SubLObject)CommonSymbols.NIL;
            this.$indexicals = (SubLObject)CommonSymbols.NIL;
            this.$edited = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX42591_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$cycl_id;
        }
        
        public SubLObject getField3() {
            return this.$formula;
        }
        
        public SubLObject getField4() {
            return this.$mt;
        }
        
        public SubLObject getField5() {
            return this.$comment;
        }
        
        public SubLObject getField6() {
            return this.$properties;
        }
        
        public SubLObject getField7() {
            return this.$indexicals;
        }
        
        public SubLObject getField8() {
            return this.$edited;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$cycl_id = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$formula = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$mt = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$comment = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$properties = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$indexicals = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$edited = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX42591_native.class, $ic0$, $ic1$, $ic2$, $ic3$, new String[] { "$cycl_id", "$formula", "$mt", "$comment", "$properties", "$indexicals", "$edited" }, $ic4$, $ic5$, $ic6$);
        }
    }
    
    public static final class $f38878$UnaryFunction extends UnaryFunction
    {
        public $f38878$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#42592"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f38878(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 721 ms
	
	Decompiled with Procyon 0.5.32.
*/