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
        f38877(var1, var2, (SubLObject)module0637.ZERO_INTEGER);
        return (SubLObject)module0637.NIL;
    }
    
    public static SubLObject f38878(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX42591_native.class) ? module0637.T : module0637.NIL);
    }
    
    public static SubLObject f38879(final SubLObject var1) {
        assert module0637.NIL != f38878(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f38880(final SubLObject var1) {
        assert module0637.NIL != f38878(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f38881(final SubLObject var1) {
        assert module0637.NIL != f38878(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f38882(final SubLObject var1) {
        assert module0637.NIL != f38878(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f38883(final SubLObject var1) {
        assert module0637.NIL != f38878(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f38884(final SubLObject var1) {
        assert module0637.NIL != f38878(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f38885(final SubLObject var1) {
        assert module0637.NIL != f38878(var1) : var1;
        return var1.getField8();
    }
    
    public static SubLObject f38886(final SubLObject var1, final SubLObject var4) {
        assert module0637.NIL != f38878(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f38887(final SubLObject var1, final SubLObject var4) {
        assert module0637.NIL != f38878(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f38888(final SubLObject var1, final SubLObject var4) {
        assert module0637.NIL != f38878(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f38889(final SubLObject var1, final SubLObject var4) {
        assert module0637.NIL != f38878(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f38890(final SubLObject var1, final SubLObject var4) {
        assert module0637.NIL != f38878(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f38891(final SubLObject var1, final SubLObject var4) {
        assert module0637.NIL != f38878(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f38892(final SubLObject var1, final SubLObject var4) {
        assert module0637.NIL != f38878(var1) : var1;
        return var1.setField8(var4);
    }
    
    public static SubLObject f38893(SubLObject var5) {
        if (var5 == module0637.UNPROVIDED) {
            var5 = (SubLObject)module0637.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX42591_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0637.NIL, var7 = var5; module0637.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0637.$ic23$)) {
                f38886(var6, var9);
            }
            else if (var10.eql((SubLObject)module0637.$ic24$)) {
                f38887(var6, var9);
            }
            else if (var10.eql((SubLObject)module0637.$ic25$)) {
                f38888(var6, var9);
            }
            else if (var10.eql((SubLObject)module0637.$ic26$)) {
                f38889(var6, var9);
            }
            else if (var10.eql((SubLObject)module0637.$ic27$)) {
                f38890(var6, var9);
            }
            else if (var10.eql((SubLObject)module0637.$ic28$)) {
                f38891(var6, var9);
            }
            else if (var10.eql((SubLObject)module0637.$ic29$)) {
                f38892(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0637.$ic30$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f38894(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0637.$ic31$, (SubLObject)module0637.$ic32$, (SubLObject)module0637.SEVEN_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0637.$ic33$, (SubLObject)module0637.$ic23$, f38879(var11));
        Functions.funcall(var12, var11, (SubLObject)module0637.$ic33$, (SubLObject)module0637.$ic24$, f38880(var11));
        Functions.funcall(var12, var11, (SubLObject)module0637.$ic33$, (SubLObject)module0637.$ic25$, f38881(var11));
        Functions.funcall(var12, var11, (SubLObject)module0637.$ic33$, (SubLObject)module0637.$ic26$, f38882(var11));
        Functions.funcall(var12, var11, (SubLObject)module0637.$ic33$, (SubLObject)module0637.$ic27$, f38883(var11));
        Functions.funcall(var12, var11, (SubLObject)module0637.$ic33$, (SubLObject)module0637.$ic28$, f38884(var11));
        Functions.funcall(var12, var11, (SubLObject)module0637.$ic33$, (SubLObject)module0637.$ic29$, f38885(var11));
        Functions.funcall(var12, var11, (SubLObject)module0637.$ic34$, (SubLObject)module0637.$ic32$, (SubLObject)module0637.SEVEN_INTEGER);
        return var11;
    }
    
    public static SubLObject f38895(final SubLObject var11, final SubLObject var12) {
        return f38894(var11, var12);
    }
    
    public static SubLObject f38877(final SubLObject var13, final SubLObject var2, final SubLObject var14) {
        PrintLow.format(var2, (SubLObject)module0637.$ic36$, new SubLObject[] { f38879(var13), f38880(var13), f38881(var13), f38882(var13) });
        module0038.f2648(var2, var14);
        PrintLow.format(var2, (SubLObject)module0637.$ic37$, f38883(var13));
        if (module0637.NIL != f38884(var13)) {
            PrintLow.format(var2, (SubLObject)module0637.$ic38$, f38884(var13));
        }
        if (module0637.NIL != f38885(var13)) {
            streams_high.write_string((SubLObject)module0637.$ic39$, var2, (SubLObject)module0637.UNPROVIDED, (SubLObject)module0637.UNPROVIDED);
        }
        streams_high.write_char((SubLObject)Characters.CHAR_greater, var2);
        return var13;
    }
    
    public static SubLObject f38896(final SubLObject var15, SubLObject var2) {
        if (var2 == module0637.UNPROVIDED) {
            var2 = module0587.$g4457$.getDynamicValue();
        }
        final SubLThread var16 = SubLProcess.currentSubLThread();
        assert module0637.NIL != f38878(var15) : var15;
        SubLObject var17 = (SubLObject)module0637.NIL;
        SubLObject var18 = (SubLObject)module0637.NIL;
        try {
            var16.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var19 = Errors.$error_handler$.currentBinding(var16);
            try {
                Errors.$error_handler$.bind((SubLObject)module0637.$ic40$, var16);
                try {
                    SubLObject var20_21 = (SubLObject)module0637.NIL;
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
                                    module0601.f36758((SubLObject)module0637.$ic41$, (SubLObject)module0637.NIL, (SubLObject)module0637.NIL, (SubLObject)module0637.NIL);
                                    try {
                                        final SubLObject var19_24 = module0601.$g4652$.currentBinding(var16);
                                        final SubLObject var24_26 = module0601.$g4654$.currentBinding(var16);
                                        try {
                                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var16), module0601.$g4652$.getDynamicValue(var16)), var16);
                                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var16), var16);
                                            module0601.f36758((SubLObject)module0637.$ic42$, (SubLObject)module0637.NIL, (SubLObject)module0637.NIL, (SubLObject)module0637.NIL);
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
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0637.T, var16);
                                            module0601.f36746();
                                            module0601.f36760((SubLObject)module0637.$ic42$);
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
                                            module0601.f36758((SubLObject)module0637.$ic43$, (SubLObject)module0637.NIL, (SubLObject)module0637.NIL, (SubLObject)module0637.NIL);
                                            final SubLObject var21 = f38880(var15);
                                            if (module0637.NIL == Errors.$ignore_mustsP$.getDynamicValue(var16) && module0637.NIL == module0206.f13425(var21)) {
                                                Errors.error((SubLObject)module0637.$ic44$, f38879(var15), var21);
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
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0637.T, var16);
                                            module0601.f36746();
                                            module0601.f36760((SubLObject)module0637.$ic43$);
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
                                            module0601.f36758((SubLObject)module0637.$ic45$, (SubLObject)module0637.NIL, (SubLObject)module0637.NIL, (SubLObject)module0637.NIL);
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
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0637.T, var16);
                                            module0601.f36746();
                                            module0601.f36760((SubLObject)module0637.$ic45$);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var19_29, var16);
                                        }
                                    }
                                    if (module0637.NIL != f38882(var15)) {
                                        try {
                                            final SubLObject var19_30 = module0601.$g4652$.currentBinding(var16);
                                            final SubLObject var24_29 = module0601.$g4654$.currentBinding(var16);
                                            try {
                                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var16), module0601.$g4652$.getDynamicValue(var16)), var16);
                                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var16), var16);
                                                module0601.f36758((SubLObject)module0637.$ic46$, (SubLObject)module0637.NIL, (SubLObject)module0637.NIL, (SubLObject)module0637.NIL);
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
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0637.T, var16);
                                                module0601.f36746();
                                                module0601.f36760((SubLObject)module0637.$ic46$);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var19_31, var16);
                                            }
                                        }
                                    }
                                    if (module0637.NIL != f38883(var15)) {
                                        try {
                                            final SubLObject var19_32 = module0601.$g4652$.currentBinding(var16);
                                            final SubLObject var24_30 = module0601.$g4654$.currentBinding(var16);
                                            try {
                                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var16), module0601.$g4652$.getDynamicValue(var16)), var16);
                                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var16), var16);
                                                module0601.f36758((SubLObject)module0637.$ic47$, (SubLObject)module0637.NIL, (SubLObject)module0637.NIL, (SubLObject)module0637.NIL);
                                                SubLObject var22;
                                                SubLObject var23;
                                                SubLObject var24;
                                                for (var22 = (SubLObject)module0637.NIL, var22 = f38883(var15); module0637.NIL != var22; var22 = conses_high.cddr(var22)) {
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
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0637.T, var16);
                                                module0601.f36746();
                                                module0601.f36760((SubLObject)module0637.$ic47$);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var19_33, var16);
                                            }
                                        }
                                    }
                                    if (module0637.NIL != f38884(var15)) {
                                        try {
                                            final SubLObject var19_34 = module0601.$g4652$.currentBinding(var16);
                                            final SubLObject var24_31 = module0601.$g4654$.currentBinding(var16);
                                            try {
                                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var16), module0601.$g4652$.getDynamicValue(var16)), var16);
                                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var16), var16);
                                                module0601.f36758((SubLObject)module0637.$ic48$, (SubLObject)module0637.NIL, (SubLObject)module0637.NIL, (SubLObject)module0637.NIL);
                                                SubLObject var25 = f38884(var15);
                                                SubLObject var26 = (SubLObject)module0637.NIL;
                                                var26 = var25.first();
                                                while (module0637.NIL != var25) {
                                                    try {
                                                        final SubLObject var19_35 = module0601.$g4652$.currentBinding(var16);
                                                        final SubLObject var24_32 = module0601.$g4654$.currentBinding(var16);
                                                        try {
                                                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var16), module0601.$g4652$.getDynamicValue(var16)), var16);
                                                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var16), var16);
                                                            module0601.f36758((SubLObject)module0637.$ic49$, (SubLObject)module0637.NIL, (SubLObject)module0637.NIL, (SubLObject)module0637.NIL);
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
                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0637.T, var16);
                                                            module0601.f36746();
                                                            module0601.f36760((SubLObject)module0637.$ic49$);
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
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0637.T, var16);
                                                module0601.f36746();
                                                module0601.f36760((SubLObject)module0637.$ic48$);
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
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0637.T, var16);
                                    module0601.f36746();
                                    module0601.f36760((SubLObject)module0637.$ic41$);
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
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0637.T, var16);
                            streams_high.close(var20_21, (SubLObject)module0637.UNPROVIDED);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var19_39, var16);
                        }
                    }
                }
                catch (Throwable var27) {
                    Errors.handleThrowable(var27, (SubLObject)module0637.NIL);
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
        if (module0637.NIL != var17) {
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
                module0601.f36758((SubLObject)module0637.$ic50$, (SubLObject)module0637.NIL, (SubLObject)module0637.NIL, (SubLObject)module0637.NIL);
                try {
                    final SubLObject var19_56 = module0601.$g4652$.currentBinding(var43);
                    final SubLObject var24_57 = module0601.$g4654$.currentBinding(var43);
                    try {
                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var43), module0601.$g4652$.getDynamicValue(var43)), var43);
                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var43), var43);
                        module0601.f36758((SubLObject)module0637.$ic51$, (SubLObject)module0637.NIL, (SubLObject)module0637.NIL, (SubLObject)module0637.NIL);
                        streams_high.write_string(Symbols.symbol_name(var41), module0587.$g4457$.getDynamicValue(var43), (SubLObject)module0637.UNPROVIDED, (SubLObject)module0637.UNPROVIDED);
                    }
                    finally {
                        module0601.$g4654$.rebind(var24_57, var43);
                        module0601.$g4652$.rebind(var19_56, var43);
                    }
                }
                finally {
                    final SubLObject var19_57 = Threads.$is_thread_performing_cleanupP$.currentBinding(var43);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0637.T, var43);
                        module0601.f36746();
                        module0601.f36760((SubLObject)module0637.$ic51$);
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
                        module0601.f36758((SubLObject)module0637.$ic52$, (SubLObject)module0637.NIL, (SubLObject)module0637.NIL, (SubLObject)module0637.NIL);
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
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0637.T, var43);
                        module0601.f36746();
                        module0601.f36760((SubLObject)module0637.$ic52$);
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
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0637.T, var43);
                module0601.f36746();
                module0601.f36760((SubLObject)module0637.$ic50$);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var46, var43);
            }
        }
        return var42;
    }
    
    public static SubLObject f38898(final SubLObject var15) {
        assert module0637.NIL != f38878(var15) : var15;
        return f38879(var15);
    }
    
    public static SubLObject f38899(final SubLObject var15) {
        assert module0637.NIL != f38878(var15) : var15;
        return f38880(var15);
    }
    
    public static SubLObject f38900(final SubLObject var15) {
        assert module0637.NIL != f38878(var15) : var15;
        return f38881(var15);
    }
    
    public static SubLObject f38901(final SubLObject var15) {
        assert module0637.NIL != f38878(var15) : var15;
        return f38882(var15);
    }
    
    public static SubLObject f38902(final SubLObject var15) {
        assert module0637.NIL != f38878(var15) : var15;
        return f38883(var15);
    }
    
    public static SubLObject f38903(final SubLObject var15) {
        assert module0637.NIL != f38878(var15) : var15;
        return f38884(var15);
    }
    
    public static SubLObject f38904(final SubLObject var15) {
        assert module0637.NIL != f38878(var15) : var15;
        return f38885(var15);
    }
    
    public static SubLObject f38905(final SubLObject var15, final SubLObject var62) {
        assert module0637.NIL != f38878(var15) : var15;
        f38886(var15, var62);
        return var15;
    }
    
    public static SubLObject f38906(final SubLObject var15, final SubLObject var63) {
        assert module0637.NIL != f38878(var15) : var15;
        f38887(var15, var63);
        return var15;
    }
    
    public static SubLObject f38907(final SubLObject var15, final SubLObject var64) {
        assert module0637.NIL != f38878(var15) : var15;
        f38888(var15, var64);
        return var15;
    }
    
    public static SubLObject f38908(final SubLObject var15, final SubLObject var65) {
        assert module0637.NIL != f38878(var15) : var15;
        f38889(var15, var65);
        return var15;
    }
    
    public static SubLObject f38909(final SubLObject var15, final SubLObject var66) {
        assert module0637.NIL != f38878(var15) : var15;
        f38890(var15, var66);
        return var15;
    }
    
    public static SubLObject f38910(final SubLObject var15, final SubLObject var66) {
        return f38909(var15, module0412.f28670(var66));
    }
    
    public static SubLObject f38911(final SubLObject var15, final SubLObject var67) {
        assert module0637.NIL != f38878(var15) : var15;
        f38891(var15, var67);
        return var15;
    }
    
    public static SubLObject f38912(final SubLObject var15) {
        assert module0637.NIL != f38878(var15) : var15;
        f38892(var15, var15);
        return var15;
    }
    
    public static SubLObject f38913(final SubLObject var15) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0637.NIL != f38903(var15));
    }
    
    public static SubLObject f38914(final SubLObject var15) {
        return f38904(var15);
    }
    
    public static SubLObject f38915(final SubLObject var15) {
        f38892(var15, (SubLObject)module0637.$ic53$);
        return var15;
    }
    
    public static SubLObject f38916(final SubLObject var13, final SubLObject var68) {
        SubLObject var69 = f38902(var13);
        SubLObject var70 = conses_high.copy_list(var69);
        final SubLObject var71 = conses_high.getf(var69, (SubLObject)module0637.$ic54$, (SubLObject)module0637.NIL);
        if (module0637.NIL != var71) {
            var69 = module0035.f2350(conses_high.copy_list(var69), module0412.f28715(var71));
        }
        SubLObject var72 = (SubLObject)module0637.NIL;
        SubLObject var73;
        SubLObject var74;
        SubLObject var75;
        for (var73 = (SubLObject)module0637.NIL, var73 = var68; module0637.NIL != var73; var73 = conses_high.cddr(var73)) {
            var74 = var73.first();
            var75 = conses_high.cadr(var73);
            if (module0637.NIL == module0035.f2346(var69, var74)) {
                var72 = (SubLObject)module0637.T;
                var70 = conses_high.putf(var70, var74, var75);
            }
        }
        if (module0637.NIL != var72) {
            f38909(var13, var70);
        }
        return (SubLObject)module0637.NIL;
    }
    
    public static SubLObject f38917(final SubLObject var15, final SubLObject var63) {
        assert module0637.NIL != f38878(var15) : var15;
        assert module0637.NIL != module0202.f12590(var63) : var63;
        f38887(var15, var63);
        f38915(var15);
        return f38880(var15);
    }
    
    public static SubLObject f38918(final SubLObject var15, final SubLObject var64) {
        assert module0637.NIL != f38878(var15) : var15;
        assert module0637.NIL != module0269.f17731(var64) : var64;
        f38888(var15, var64);
        f38915(var15);
        return f38881(var15);
    }
    
    public static SubLObject f38919(final SubLObject var74) {
        return (SubLObject)SubLObjectFactory.makeBoolean((module0637.NIL != module0172.f10917(var74) && module0637.NIL != f38920(var74)) || (module0637.NIL != module0167.f10813(var74) && module0637.NIL != f38920(module0172.f10920(var74))));
    }
    
    public static SubLObject f38920(final SubLObject var74) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0637.NIL != module0202.f12608(var74) && module0205.f13132(var74).eql(module0637.$ic57$));
    }
    
    public static SubLObject f38921() {
        final SubLObject var15 = f38893((SubLObject)module0637.UNPROVIDED);
        return var15;
    }
    
    public static SubLObject f38922(SubLObject var75, SubLObject var64) {
        if (var64 == module0637.UNPROVIDED) {
            var64 = (SubLObject)module0637.NIL;
        }
        assert module0637.NIL != module0206.f13444(var75) : var75;
        final SubLObject var76 = f38921();
        if (module0637.NIL != module0228.f15225(var75)) {
            final SubLObject var77 = module0172.f10921(var75);
            if (module0637.NIL != var77) {
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
        final SubLObject var17 = module0035.f2399(var16, Symbols.symbol_function((SubLObject)module0637.$ic59$), (SubLObject)module0637.UNPROVIDED, (SubLObject)module0637.UNPROVIDED, (SubLObject)module0637.UNPROVIDED);
        if (module0637.NIL == module0035.f2012(var17)) {
            final SubLObject var18 = module0077.f5313(Symbols.symbol_function((SubLObject)module0637.EQUAL), (SubLObject)module0637.UNPROVIDED);
            SubLObject var19 = var17;
            SubLObject var20 = (SubLObject)module0637.NIL;
            var20 = var19.first();
            while (module0637.NIL != var19) {
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
        f38887(var15, module0285.f18933(var76, (SubLObject)module0637.UNPROVIDED));
        return var15;
    }
    
    public static SubLObject f38924(final SubLObject var75, final SubLObject var15) {
        final SubLObject var76 = module0423.f29569(var75);
        f38888(var15, module0172.f10922(var76));
        return var15;
    }
    
    public static SubLObject f38925(final SubLObject var75, final SubLObject var15) {
        final SubLObject var76 = module0035.f2329(module0423.f29573(var75), (SubLObject)module0637.$ic60$);
        f38890(var15, var76);
        return var15;
    }
    
    public static SubLObject f38927(final SubLObject var13) {
        assert module0637.NIL != f38878(var13) : var13;
        final SubLObject var14 = f38921();
        f38886(var14, f38879(var13));
        f38887(var14, module0202.f12763(f38880(var13)));
        f38888(var14, f38881(var13));
        f38890(var14, conses_high.copy_list(f38883(var13)));
        if (module0637.NIL != f38913(var13)) {
            f38891(var14, module0077.f5314(f38884(var13)));
        }
        f38915(var14);
        return var14;
    }
    
    public static SubLObject f38928(final SubLObject var13, final SubLObject var82, SubLObject var83) {
        if (var83 == module0637.UNPROVIDED) {
            var83 = (SubLObject)module0637.T;
        }
        assert module0637.NIL != f38878(var13) : var13;
        assert module0637.NIL != Types.listp(var82) : var82;
        final SubLObject var84 = f38927(var13);
        final SubLObject var85 = f38903(var84);
        final SubLObject var86 = f38899(var84);
        SubLObject var87 = var82;
        SubLObject var88 = (SubLObject)module0637.NIL;
        var88 = var87.first();
        while (module0637.NIL != var87) {
            SubLObject var90;
            final SubLObject var89 = var90 = var88;
            SubLObject var91 = (SubLObject)module0637.NIL;
            SubLObject var92 = (SubLObject)module0637.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var90, var89, (SubLObject)module0637.$ic62$);
            var91 = var90.first();
            var90 = (var92 = var90.rest());
            conses_high.nsubst(var92, var91, var86, Symbols.symbol_function((SubLObject)module0637.EQUAL), (SubLObject)module0637.UNPROVIDED);
            module0077.f5327(var91, var85);
            var87 = var87.rest();
            var88 = var87.first();
        }
        if (module0637.NIL != module0077.f5316(var85)) {
            f38891(var84, (SubLObject)module0637.NIL);
        }
        else if (module0637.NIL != var83) {
            Errors.error((SubLObject)module0637.$ic63$, module0077.f5312(var85));
        }
        return var84;
    }
    
    public static SubLObject f38929(SubLObject var13, SubLObject var64, SubLObject var82, SubLObject var90) {
        if (var64 == module0637.UNPROVIDED) {
            var64 = (SubLObject)module0637.NIL;
        }
        if (var82 == module0637.UNPROVIDED) {
            var82 = (SubLObject)module0637.NIL;
        }
        if (var90 == module0637.UNPROVIDED) {
            var90 = (SubLObject)module0637.NIL;
        }
        assert module0637.NIL != f38878(var13) : var13;
        if (module0637.NIL != var82) {
            var13 = f38928(var13, var82, (SubLObject)module0637.UNPROVIDED);
        }
        if (module0637.NIL == module0269.f17731(var64)) {
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
        if (module0637.NIL == f38933()) {
            f38934();
        }
        return (SubLObject)module0637.NIL;
    }
    
    public static SubLObject f38933() {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0637.NIL != module0637.$g4950$.getGlobalValue());
    }
    
    public static SubLObject f38932() {
        return module0637.$g4950$.getGlobalValue();
    }
    
    public static SubLObject f38935(final SubLObject var74) {
        return module0077.f5320(var74, f38930());
    }
    
    public static SubLObject f38934() {
        module0637.$g4950$.setGlobalValue(f38936());
        return f38932();
    }
    
    public static SubLObject f38936() {
        final SubLObject var92 = f38937();
        final SubLObject var93 = module0077.f5313(Symbols.symbol_function((SubLObject)module0637.EQL), (SubLObject)module0637.UNPROVIDED);
        SubLObject var94 = var92;
        SubLObject var95 = (SubLObject)module0637.NIL;
        var95 = var94.first();
        while (module0637.NIL != var94) {
            final SubLObject var96 = f38938(var95);
            module0077.f5326(var96, var93);
            var94 = var94.rest();
            var95 = var94.first();
        }
        return var93;
    }
    
    public static SubLObject f38937() {
        return module0259.f16848(module0637.$ic65$, module0637.$ic66$, (SubLObject)module0637.UNPROVIDED);
    }
    
    public static SubLObject f38938(final SubLObject var94) {
        final SubLThread var95 = SubLProcess.currentSubLThread();
        SubLObject var96 = (SubLObject)module0637.NIL;
        final SubLObject var97 = module0147.f9540(module0637.$g4951$.getGlobalValue());
        final SubLObject var98 = module0147.$g2095$.currentBinding(var95);
        final SubLObject var99 = module0147.$g2094$.currentBinding(var95);
        final SubLObject var100 = module0147.$g2096$.currentBinding(var95);
        try {
            module0147.$g2095$.bind(module0147.f9545(var97), var95);
            module0147.$g2094$.bind(module0147.f9546(var97), var95);
            module0147.$g2096$.bind(module0147.f9549(var97), var95);
            final SubLObject var101 = module0220.f14553(var94, module0637.$ic67$, (SubLObject)module0637.ONE_INTEGER, (SubLObject)module0637.TWO_INTEGER, (SubLObject)module0637.$ic68$);
            if (module0637.NIL != module0202.f12589(var101, module0637.$ic69$)) {
                var96 = module0205.f13203(var101, (SubLObject)module0637.UNPROVIDED);
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
        return (SubLObject)module0637.NIL;
    }
    
    public static SubLObject f38940() {
        module0637.$g4949$ = SubLFiles.defconstant("S#42656", (SubLObject)module0637.$ic0$);
        module0637.$g4950$ = SubLFiles.deflexical("S#42657", (SubLObject)((module0637.NIL != Symbols.boundp((SubLObject)module0637.$ic64$)) ? module0637.$g4950$.getGlobalValue() : module0637.NIL));
        module0637.$g4951$ = SubLFiles.deflexical("S#42658", module0637.$ic66$);
        return (SubLObject)module0637.NIL;
    }
    
    public static SubLObject f38941() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0637.$g4949$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0637.$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0637.$ic8$);
        Structures.def_csetf((SubLObject)module0637.$ic9$, (SubLObject)module0637.$ic10$);
        Structures.def_csetf((SubLObject)module0637.$ic11$, (SubLObject)module0637.$ic12$);
        Structures.def_csetf((SubLObject)module0637.$ic13$, (SubLObject)module0637.$ic14$);
        Structures.def_csetf((SubLObject)module0637.$ic15$, (SubLObject)module0637.$ic16$);
        Structures.def_csetf((SubLObject)module0637.$ic17$, (SubLObject)module0637.$ic18$);
        Structures.def_csetf((SubLObject)module0637.$ic19$, (SubLObject)module0637.$ic20$);
        Structures.def_csetf((SubLObject)module0637.$ic21$, (SubLObject)module0637.$ic22$);
        Equality.identity((SubLObject)module0637.$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0637.$g4949$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0637.$ic35$));
        module0003.f57((SubLObject)module0637.$ic64$);
        return (SubLObject)module0637.NIL;
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
        module0637.$g4949$ = null;
        module0637.$g4950$ = null;
        module0637.$g4951$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#42591", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#42592", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#42579", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6061", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("COMMENT"), (SubLObject)SubLObjectFactory.makeSymbol("S#5852", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#42659", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#42660", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CYCL-ID"), (SubLObject)SubLObjectFactory.makeKeyword("FORMULA"), (SubLObject)SubLObjectFactory.makeKeyword("MT"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeKeyword("PROPERTIES"), (SubLObject)SubLObjectFactory.makeKeyword("INDEXICALS"), (SubLObject)SubLObjectFactory.makeKeyword("EDITED"));
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#42595", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#42596", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#42597", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#42598", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#42599", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#42600", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#42601", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#42602", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#42603", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#42604", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#42605", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#42606", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#42607", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#42608", "CYC"));
        $ic6$ = SubLObjectFactory.makeSymbol("S#42612", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#42594", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#42592", "CYC"));
        $ic9$ = SubLObjectFactory.makeSymbol("S#42595", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#42602", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#42596", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#42603", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#42597", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#42604", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#42598", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#42605", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#42599", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#42606", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#42600", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#42607", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#42601", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("S#42608", "CYC");
        $ic23$ = SubLObjectFactory.makeKeyword("CYCL-ID");
        $ic24$ = SubLObjectFactory.makeKeyword("FORMULA");
        $ic25$ = SubLObjectFactory.makeKeyword("MT");
        $ic26$ = SubLObjectFactory.makeKeyword("COMMENT");
        $ic27$ = SubLObjectFactory.makeKeyword("PROPERTIES");
        $ic28$ = SubLObjectFactory.makeKeyword("INDEXICALS");
        $ic29$ = SubLObjectFactory.makeKeyword("EDITED");
        $ic30$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic31$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic32$ = SubLObjectFactory.makeSymbol("S#42609", "CYC");
        $ic33$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic34$ = SubLObjectFactory.makeKeyword("END");
        $ic35$ = SubLObjectFactory.makeSymbol("S#42611", "CYC");
        $ic36$ = SubLObjectFactory.makeString("<NEW-CYCL-QUERY-SPECIFICATION ~S ~S in ~S ;; ~A~% ");
        $ic37$ = SubLObjectFactory.makeString(" Properties: ~S ");
        $ic38$ = SubLObjectFactory.makeString(" Template Slots: ~S ");
        $ic39$ = SubLObjectFactory.makeString(" (changed) ");
        $ic40$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic41$ = SubLObjectFactory.makeString("cyclQuery");
        $ic42$ = SubLObjectFactory.makeString("queryID");
        $ic43$ = SubLObjectFactory.makeString("queryFormula");
        $ic44$ = SubLObjectFactory.makeString("Can't serialize ~S.~% Its query formula is not a valid CycL sentence:~% ~S");
        $ic45$ = SubLObjectFactory.makeString("queryMt");
        $ic46$ = SubLObjectFactory.makeString("queryComment");
        $ic47$ = SubLObjectFactory.makeString("queryInferenceProperties");
        $ic48$ = SubLObjectFactory.makeString("queryIndexicals");
        $ic49$ = SubLObjectFactory.makeString("queryIndexical");
        $ic50$ = SubLObjectFactory.makeString("queryInferenceProperty");
        $ic51$ = SubLObjectFactory.makeString("propertySymbol");
        $ic52$ = SubLObjectFactory.makeString("propertyValue");
        $ic53$ = SubLObjectFactory.makeKeyword("CHANGED");
        $ic54$ = SubLObjectFactory.makeKeyword("INFERENCE-MODE");
        $ic55$ = SubLObjectFactory.makeSymbol("S#12753", "CYC");
        $ic56$ = SubLObjectFactory.makeSymbol("S#16717", "CYC");
        $ic57$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheNthFn"));
        $ic58$ = SubLObjectFactory.makeSymbol("CYCL-DENOTATIONAL-TERM-P");
        $ic59$ = SubLObjectFactory.makeSymbol("S#42636", "CYC");
        $ic60$ = SubLObjectFactory.makeSymbol("S#42651", "CYC");
        $ic61$ = SubLObjectFactory.makeSymbol("LISTP");
        $ic62$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#42661", "CYC"));
        $ic63$ = SubLObjectFactory.makeString("Insufficient number of substitutions -- indexicals ~A unaccounted for.");
        $ic64$ = SubLObjectFactory.makeSymbol("S#42657", "CYC");
        $ic65$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("InferenceParameter"));
        $ic66$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CycAPIMt"));
        $ic67$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("subLIdentifier"));
        $ic68$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic69$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("SubLQuoteFn"));
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
        private static final SubLStructDeclNative structDecl;
        
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
            structDecl = Structures.makeStructDeclNative((Class)$sX42591_native.class, module0637.$ic0$, module0637.$ic1$, module0637.$ic2$, module0637.$ic3$, new String[] { "$cycl_id", "$formula", "$mt", "$comment", "$properties", "$indexicals", "$edited" }, module0637.$ic4$, module0637.$ic5$, module0637.$ic6$);
        }
    }
    
    public static final class $f38878$UnaryFunction extends UnaryFunction
    {
        public $f38878$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#42592"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0637.f38878(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0637.class
	Total time: 721 ms
	
	Decompiled with Procyon 0.5.32.
*/