package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0649 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0649";
    public static final String myFingerPrint = "afae5de018904beba3a485122de818d5f1e5f8dd69382ced87a797a79c3bc0f0";
    public static SubLSymbol $g5055$;
    public static SubLSymbol $g5056$;
    public static SubLSymbol $g5057$;
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
    private static final SubLString $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLString $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    private static final SubLString $ic28$;
    private static final SubLString $ic29$;
    private static final SubLString $ic30$;
    private static final SubLString $ic31$;
    private static final SubLList $ic32$;
    private static final SubLList $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLObject $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLList $ic38$;
    private static final SubLList $ic39$;
    private static final SubLList $ic40$;
    private static final SubLList $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLList $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLString $ic61$;
    private static final SubLString $ic62$;
    private static final SubLString $ic63$;
    private static final SubLString $ic64$;
    private static final SubLString $ic65$;
    private static final SubLString $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLString $ic69$;
    private static final SubLString $ic70$;
    private static final SubLString $ic71$;
    private static final SubLString $ic72$;
    private static final SubLString $ic73$;
    private static final SubLString $ic74$;
    private static final SubLList $ic75$;
    private static final SubLString $ic76$;
    private static final SubLString $ic77$;
    private static final SubLList $ic78$;
    private static final SubLString $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLObject $ic81$;
    private static final SubLList $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLObject $ic84$;
    private static final SubLList $ic85$;
    private static final SubLList $ic86$;
    private static final SubLObject $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLList $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLList $ic94$;
    private static final SubLList $ic95$;
    private static final SubLList $ic96$;
    private static final SubLList $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLList $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLString $ic122$;
    private static final SubLString $ic123$;
    private static final SubLString $ic124$;
    private static final SubLString $ic125$;
    private static final SubLString $ic126$;
    private static final SubLString $ic127$;
    private static final SubLString $ic128$;
    private static final SubLString $ic129$;
    private static final SubLString $ic130$;
    private static final SubLString $ic131$;
    private static final SubLString $ic132$;
    private static final SubLString $ic133$;
    private static final SubLString $ic134$;
    private static final SubLString $ic135$;
    private static final SubLString $ic136$;
    private static final SubLString $ic137$;
    private static final SubLString $ic138$;
    private static final SubLString $ic139$;
    private static final SubLString $ic140$;
    private static final SubLString $ic141$;
    private static final SubLString $ic142$;
    private static final SubLList $ic143$;
    private static final SubLString $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLObject $ic147$;
    private static final SubLList $ic148$;
    private static final SubLSymbol $ic149$;
    private static final SubLObject $ic150$;
    private static final SubLList $ic151$;
    private static final SubLString $ic152$;
    private static final SubLList $ic153$;
    private static final SubLList $ic154$;
    private static final SubLList $ic155$;
    private static final SubLObject $ic156$;
    private static final SubLList $ic157$;
    private static final SubLList $ic158$;
    private static final SubLObject $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLSymbol $ic163$;
    
    public static SubLObject f39611(final SubLObject var1, final SubLObject var2) {
        f39612(var1, var2, (SubLObject)module0649.ZERO_INTEGER);
        return (SubLObject)module0649.NIL;
    }
    
    public static SubLObject f39613(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX43479_native.class) ? module0649.T : module0649.NIL);
    }
    
    public static SubLObject f39614(final SubLObject var1) {
        assert module0649.NIL != f39613(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f39615(final SubLObject var1) {
        assert module0649.NIL != f39613(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f39616(final SubLObject var1) {
        assert module0649.NIL != f39613(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f39617(final SubLObject var1, final SubLObject var4) {
        assert module0649.NIL != f39613(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f39618(final SubLObject var1, final SubLObject var4) {
        assert module0649.NIL != f39613(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f39619(final SubLObject var1, final SubLObject var4) {
        assert module0649.NIL != f39613(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f39620(SubLObject var5) {
        if (var5 == module0649.UNPROVIDED) {
            var5 = (SubLObject)module0649.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX43479_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0649.NIL, var7 = var5; module0649.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0649.$ic15$)) {
                f39617(var6, var9);
            }
            else if (var10.eql((SubLObject)module0649.$ic16$)) {
                f39618(var6, var9);
            }
            else if (var10.eql((SubLObject)module0649.$ic17$)) {
                f39619(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0649.$ic18$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f39621(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0649.$ic19$, (SubLObject)module0649.$ic20$, (SubLObject)module0649.THREE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0649.$ic21$, (SubLObject)module0649.$ic15$, f39614(var11));
        Functions.funcall(var12, var11, (SubLObject)module0649.$ic21$, (SubLObject)module0649.$ic16$, f39615(var11));
        Functions.funcall(var12, var11, (SubLObject)module0649.$ic21$, (SubLObject)module0649.$ic17$, f39616(var11));
        Functions.funcall(var12, var11, (SubLObject)module0649.$ic22$, (SubLObject)module0649.$ic20$, (SubLObject)module0649.THREE_INTEGER);
        return var11;
    }
    
    public static SubLObject f39622(final SubLObject var11, final SubLObject var12) {
        return f39621(var11, var12);
    }
    
    public static SubLObject f39612(final SubLObject var13, final SubLObject var2, final SubLObject var14) {
        streams_high.write_string((SubLObject)module0649.$ic24$, var2, (SubLObject)module0649.UNPROVIDED, (SubLObject)module0649.UNPROVIDED);
        PrintLow.format(var2, (SubLObject)module0649.$ic25$, new SubLObject[] { f39614(var13), f39615(var13), f39616(var13) });
        streams_high.write_string((SubLObject)module0649.$ic26$, var2, (SubLObject)module0649.UNPROVIDED, (SubLObject)module0649.UNPROVIDED);
        return var13;
    }
    
    public static SubLObject f39623(final SubLObject var15) {
        final SubLObject var16 = f39620((SubLObject)module0649.UNPROVIDED);
        f39617(var16, var15);
        return var16;
    }
    
    public static SubLObject f39624(final SubLObject var17, final SubLObject var15, final SubLObject var18) {
        final SubLObject var19 = f39623(var15);
        final SubLObject var20 = f39625(var17, var15, var18);
        f39619(var19, var20);
        f39618(var19, module0770.f49049(var15, (SubLObject)module0649.UNPROVIDED, (SubLObject)module0649.UNPROVIDED, (SubLObject)module0649.UNPROVIDED, (SubLObject)module0649.UNPROVIDED, (SubLObject)module0649.UNPROVIDED, (SubLObject)module0649.UNPROVIDED, (SubLObject)module0649.UNPROVIDED));
        return var19;
    }
    
    public static SubLObject f39626(final SubLObject var16, SubLObject var2) {
        if (var2 == module0649.UNPROVIDED) {
            var2 = module0587.$g4457$.getDynamicValue();
        }
        final SubLThread var17 = SubLProcess.currentSubLThread();
        assert module0649.NIL != f39613(var16) : var16;
        final SubLObject var18 = module0587.$g4457$.currentBinding(var17);
        try {
            module0587.$g4457$.bind(var2, var17);
            try {
                final SubLObject var21_22 = module0601.$g4652$.currentBinding(var17);
                final SubLObject var19 = module0601.$g4654$.currentBinding(var17);
                try {
                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var17), module0601.$g4652$.getDynamicValue(var17)), var17);
                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var17), var17);
                    module0601.f36758((SubLObject)module0649.$ic27$, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL);
                    try {
                        final SubLObject var21_23 = module0601.$g4652$.currentBinding(var17);
                        final SubLObject var23_25 = module0601.$g4654$.currentBinding(var17);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var17), module0601.$g4652$.getDynamicValue(var17)), var17);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var17), var17);
                            module0601.f36758((SubLObject)module0649.$ic28$, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL);
                            module0797.f50965(f39614(var16));
                        }
                        finally {
                            module0601.$g4654$.rebind(var23_25, var17);
                            module0601.$g4652$.rebind(var21_23, var17);
                        }
                    }
                    finally {
                        final SubLObject var21_24 = Threads.$is_thread_performing_cleanupP$.currentBinding(var17);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0649.T, var17);
                            module0601.f36746();
                            module0601.f36760((SubLObject)module0649.$ic28$);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var21_24, var17);
                        }
                    }
                    try {
                        final SubLObject var21_25 = module0601.$g4652$.currentBinding(var17);
                        final SubLObject var23_26 = module0601.$g4654$.currentBinding(var17);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var17), module0601.$g4652$.getDynamicValue(var17)), var17);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var17), var17);
                            module0601.f36758((SubLObject)module0649.$ic29$, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL);
                            module0797.f50965(f39615(var16));
                        }
                        finally {
                            module0601.$g4654$.rebind(var23_26, var17);
                            module0601.$g4652$.rebind(var21_25, var17);
                        }
                    }
                    finally {
                        final SubLObject var21_26 = Threads.$is_thread_performing_cleanupP$.currentBinding(var17);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0649.T, var17);
                            module0601.f36746();
                            module0601.f36760((SubLObject)module0649.$ic29$);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var21_26, var17);
                        }
                    }
                    if (module0649.NIL != f39616(var16)) {
                        try {
                            final SubLObject var21_27 = module0601.$g4652$.currentBinding(var17);
                            final SubLObject var23_27 = module0601.$g4654$.currentBinding(var17);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var17), module0601.$g4652$.getDynamicValue(var17)), var17);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var17), var17);
                                module0601.f36758((SubLObject)module0649.$ic30$, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL);
                                SubLObject var20 = f39616(var16);
                                SubLObject var21 = (SubLObject)module0649.NIL;
                                var21 = var20.first();
                                while (module0649.NIL != var20) {
                                    try {
                                        final SubLObject var21_28 = module0601.$g4652$.currentBinding(var17);
                                        final SubLObject var23_28 = module0601.$g4654$.currentBinding(var17);
                                        try {
                                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var17), module0601.$g4652$.getDynamicValue(var17)), var17);
                                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var17), var17);
                                            module0601.f36758((SubLObject)module0649.$ic31$, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL);
                                            module0797.f50965(var21);
                                        }
                                        finally {
                                            module0601.$g4654$.rebind(var23_28, var17);
                                            module0601.$g4652$.rebind(var21_28, var17);
                                        }
                                    }
                                    finally {
                                        final SubLObject var21_29 = Threads.$is_thread_performing_cleanupP$.currentBinding(var17);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0649.T, var17);
                                            module0601.f36746();
                                            module0601.f36760((SubLObject)module0649.$ic31$);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var21_29, var17);
                                        }
                                    }
                                    var20 = var20.rest();
                                    var21 = var20.first();
                                }
                            }
                            finally {
                                module0601.$g4654$.rebind(var23_27, var17);
                                module0601.$g4652$.rebind(var21_27, var17);
                            }
                        }
                        finally {
                            final SubLObject var21_30 = Threads.$is_thread_performing_cleanupP$.currentBinding(var17);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0649.T, var17);
                                module0601.f36746();
                                module0601.f36760((SubLObject)module0649.$ic30$);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var21_30, var17);
                            }
                        }
                    }
                }
                finally {
                    module0601.$g4654$.rebind(var19, var17);
                    module0601.$g4652$.rebind(var21_22, var17);
                }
            }
            finally {
                final SubLObject var21_31 = Threads.$is_thread_performing_cleanupP$.currentBinding(var17);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0649.T, var17);
                    module0601.f36746();
                    module0601.f36760((SubLObject)module0649.$ic27$);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var21_31, var17);
                }
            }
        }
        finally {
            module0587.$g4457$.rebind(var18, var17);
        }
        return var16;
    }
    
    public static SubLObject f39625(final SubLObject var17, final SubLObject var39, final SubLObject var18) {
        SubLObject var40 = (SubLObject)module0649.NIL;
        SubLObject var41 = f39627(var17, var39, var18);
        SubLObject var42 = (SubLObject)module0649.NIL;
        var42 = var41.first();
        while (module0649.NIL != var41) {
            SubLObject var44;
            final SubLObject var43 = var44 = var42;
            SubLObject var45 = (SubLObject)module0649.NIL;
            SubLObject var46 = (SubLObject)module0649.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var44, var43, (SubLObject)module0649.$ic32$);
            var45 = var44.first();
            var44 = var44.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var44, var43, (SubLObject)module0649.$ic32$);
            var46 = var44.first();
            var44 = var44.rest();
            if (module0649.NIL == var44) {
                SubLObject var47_48;
                final SubLObject var45_46 = var47_48 = var46;
                SubLObject var47 = (SubLObject)module0649.NIL;
                SubLObject var48 = (SubLObject)module0649.NIL;
                SubLObject var49 = (SubLObject)module0649.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var47_48, var45_46, (SubLObject)module0649.$ic33$);
                var47 = var47_48.first();
                var47_48 = var47_48.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var47_48, var45_46, (SubLObject)module0649.$ic33$);
                var48 = var47_48.first();
                var47_48 = var47_48.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var47_48, var45_46, (SubLObject)module0649.$ic33$);
                var49 = var47_48.first();
                var47_48 = var47_48.rest();
                if (module0649.NIL == var47_48) {
                    var40 = (SubLObject)ConsesLow.cons(var49, var40);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var45_46, (SubLObject)module0649.$ic33$);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var43, (SubLObject)module0649.$ic32$);
            }
            var41 = var41.rest();
            var42 = var41.first();
        }
        return var40;
    }
    
    public static SubLObject f39627(final SubLObject var17, final SubLObject var39, final SubLObject var18) {
        return module0434.f30579((SubLObject)module0649.$ic34$, (SubLObject)ConsesLow.list(module0649.$ic35$, var39, (SubLObject)module0649.$ic34$, var17), var18, (SubLObject)module0649.UNPROVIDED, (SubLObject)module0649.UNPROVIDED, (SubLObject)module0649.UNPROVIDED, (SubLObject)module0649.UNPROVIDED);
    }
    
    public static SubLObject f39628(final SubLObject var1, final SubLObject var2) {
        f39629(var1, var2, (SubLObject)module0649.ZERO_INTEGER);
        return (SubLObject)module0649.NIL;
    }
    
    public static SubLObject f39630(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX43481_native.class) ? module0649.T : module0649.NIL);
    }
    
    public static SubLObject f39631(final SubLObject var1) {
        assert module0649.NIL != f39630(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f39632(final SubLObject var1) {
        assert module0649.NIL != f39630(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f39633(final SubLObject var1) {
        assert module0649.NIL != f39630(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f39634(final SubLObject var1) {
        assert module0649.NIL != f39630(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f39635(final SubLObject var1) {
        assert module0649.NIL != f39630(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f39636(final SubLObject var1, final SubLObject var4) {
        assert module0649.NIL != f39630(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f39637(final SubLObject var1, final SubLObject var4) {
        assert module0649.NIL != f39630(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f39638(final SubLObject var1, final SubLObject var4) {
        assert module0649.NIL != f39630(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f39639(final SubLObject var1, final SubLObject var4) {
        assert module0649.NIL != f39630(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f39640(final SubLObject var1, final SubLObject var4) {
        assert module0649.NIL != f39630(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f39641(SubLObject var5) {
        if (var5 == module0649.UNPROVIDED) {
            var5 = (SubLObject)module0649.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX43481_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0649.NIL, var7 = var5; module0649.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0649.$ic55$)) {
                f39636(var6, var9);
            }
            else if (var10.eql((SubLObject)module0649.$ic16$)) {
                f39637(var6, var9);
            }
            else if (var10.eql((SubLObject)module0649.$ic56$)) {
                f39638(var6, var9);
            }
            else if (var10.eql((SubLObject)module0649.$ic57$)) {
                f39639(var6, var9);
            }
            else if (var10.eql((SubLObject)module0649.$ic58$)) {
                f39640(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0649.$ic18$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f39642(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0649.$ic19$, (SubLObject)module0649.$ic59$, (SubLObject)module0649.FIVE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0649.$ic21$, (SubLObject)module0649.$ic55$, f39631(var11));
        Functions.funcall(var12, var11, (SubLObject)module0649.$ic21$, (SubLObject)module0649.$ic16$, f39632(var11));
        Functions.funcall(var12, var11, (SubLObject)module0649.$ic21$, (SubLObject)module0649.$ic56$, f39633(var11));
        Functions.funcall(var12, var11, (SubLObject)module0649.$ic21$, (SubLObject)module0649.$ic57$, f39634(var11));
        Functions.funcall(var12, var11, (SubLObject)module0649.$ic21$, (SubLObject)module0649.$ic58$, f39635(var11));
        Functions.funcall(var12, var11, (SubLObject)module0649.$ic22$, (SubLObject)module0649.$ic59$, (SubLObject)module0649.FIVE_INTEGER);
        return var11;
    }
    
    public static SubLObject f39643(final SubLObject var11, final SubLObject var12) {
        return f39642(var11, var12);
    }
    
    public static SubLObject f39629(final SubLObject var13, final SubLObject var2, final SubLObject var14) {
        streams_high.write_string((SubLObject)module0649.$ic61$, var2, (SubLObject)module0649.UNPROVIDED, (SubLObject)module0649.UNPROVIDED);
        PrintLow.format(var2, (SubLObject)module0649.$ic62$, f39631(var13), f39632(var13));
        streams_high.write_string((SubLObject)module0649.$ic63$, var2, (SubLObject)module0649.UNPROVIDED, (SubLObject)module0649.UNPROVIDED);
        streams_high.terpri(var2);
        SubLObject var15 = f39633(var13);
        SubLObject var16 = (SubLObject)module0649.NIL;
        var16 = var15.first();
        while (module0649.NIL != var15) {
            PrintLow.format(var2, (SubLObject)module0649.$ic64$, var16);
            var15 = var15.rest();
            var16 = var15.first();
        }
        streams_high.write_string((SubLObject)module0649.$ic65$, var2, (SubLObject)module0649.UNPROVIDED, (SubLObject)module0649.UNPROVIDED);
        streams_high.terpri(var2);
        final SubLObject var17 = f39634(var13);
        PrintLow.format(var2, (SubLObject)module0649.$ic64$, var17);
        if (module0649.NIL != f39635(var13)) {
            streams_high.write_string((SubLObject)module0649.$ic66$, var2, (SubLObject)module0649.UNPROVIDED, (SubLObject)module0649.UNPROVIDED);
            streams_high.terpri(var2);
            PrintLow.format(var2, (SubLObject)module0649.$ic64$, f39635(var13));
        }
        streams_high.write_string((SubLObject)module0649.$ic26$, var2, (SubLObject)module0649.UNPROVIDED, (SubLObject)module0649.UNPROVIDED);
        return var13;
    }
    
    public static SubLObject f39644(final SubLObject var57) {
        final SubLObject var58 = f39641((SubLObject)module0649.UNPROVIDED);
        f39636(var58, var57);
        return var58;
    }
    
    public static SubLObject f39645(final SubLObject var17, final SubLObject var18) {
        assert module0649.NIL != module0173.f10955(var17) : var17;
        assert module0649.NIL != module0161.f10481(var18) : var18;
        final SubLObject var19 = f39644(var17);
        final SubLObject var20 = f39646(var17, var18);
        final SubLObject var21 = f39647(var17, var18);
        SubLObject var22 = var20;
        SubLObject var23 = (SubLObject)module0649.NIL;
        var23 = var22.first();
        while (module0649.NIL != var22) {
            final SubLObject var24 = f39624(var17, var23, var18);
            f39638(var19, (SubLObject)ConsesLow.cons(var24, f39633(var19)));
            var22 = var22.rest();
            var23 = var22.first();
        }
        f39639(var19, f39624(var17, var21, var18));
        f39640(var19, f39648(var17, var18));
        f39637(var19, module0770.f49049(var17, (SubLObject)module0649.UNPROVIDED, (SubLObject)module0649.UNPROVIDED, (SubLObject)module0649.UNPROVIDED, (SubLObject)module0649.UNPROVIDED, (SubLObject)module0649.UNPROVIDED, (SubLObject)module0649.UNPROVIDED, (SubLObject)module0649.UNPROVIDED));
        return var19;
    }
    
    public static SubLObject f39649(final SubLObject var58, SubLObject var2) {
        if (var2 == module0649.UNPROVIDED) {
            var2 = module0587.$g4457$.getDynamicValue();
        }
        final SubLThread var59 = SubLProcess.currentSubLThread();
        assert module0649.NIL != f39630(var58) : var58;
        final SubLObject var60 = module0587.$g4457$.currentBinding(var59);
        try {
            module0587.$g4457$.bind(var2, var59);
            try {
                final SubLObject var21_62 = module0601.$g4652$.currentBinding(var59);
                final SubLObject var61 = module0601.$g4654$.currentBinding(var59);
                try {
                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var59), module0601.$g4652$.getDynamicValue(var59)), var59);
                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var59), var59);
                    module0601.f36758((SubLObject)module0649.$ic69$, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL);
                    try {
                        final SubLObject var21_63 = module0601.$g4652$.currentBinding(var59);
                        final SubLObject var23_64 = module0601.$g4654$.currentBinding(var59);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var59), module0601.$g4652$.getDynamicValue(var59)), var59);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var59), var59);
                            module0601.f36758((SubLObject)module0649.$ic70$, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL);
                            module0797.f50965(f39631(var58));
                        }
                        finally {
                            module0601.$g4654$.rebind(var23_64, var59);
                            module0601.$g4652$.rebind(var21_63, var59);
                        }
                    }
                    finally {
                        final SubLObject var21_64 = Threads.$is_thread_performing_cleanupP$.currentBinding(var59);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0649.T, var59);
                            module0601.f36746();
                            module0601.f36760((SubLObject)module0649.$ic70$);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var21_64, var59);
                        }
                    }
                    try {
                        final SubLObject var21_65 = module0601.$g4652$.currentBinding(var59);
                        final SubLObject var23_65 = module0601.$g4654$.currentBinding(var59);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var59), module0601.$g4652$.getDynamicValue(var59)), var59);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var59), var59);
                            module0601.f36758((SubLObject)module0649.$ic29$, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL);
                            module0797.f50965(f39632(var58));
                        }
                        finally {
                            module0601.$g4654$.rebind(var23_65, var59);
                            module0601.$g4652$.rebind(var21_65, var59);
                        }
                    }
                    finally {
                        final SubLObject var21_66 = Threads.$is_thread_performing_cleanupP$.currentBinding(var59);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0649.T, var59);
                            module0601.f36746();
                            module0601.f36760((SubLObject)module0649.$ic29$);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var21_66, var59);
                        }
                    }
                    if (module0649.NIL != f39633(var58)) {
                        try {
                            final SubLObject var21_67 = module0601.$g4652$.currentBinding(var59);
                            final SubLObject var23_66 = module0601.$g4654$.currentBinding(var59);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var59), module0601.$g4652$.getDynamicValue(var59)), var59);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var59), var59);
                                module0601.f36758((SubLObject)module0649.$ic71$, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL);
                                SubLObject var62 = f39633(var58);
                                SubLObject var63 = (SubLObject)module0649.NIL;
                                var63 = var62.first();
                                while (module0649.NIL != var62) {
                                    f39626(var63, var2);
                                    var62 = var62.rest();
                                    var63 = var62.first();
                                }
                            }
                            finally {
                                module0601.$g4654$.rebind(var23_66, var59);
                                module0601.$g4652$.rebind(var21_67, var59);
                            }
                        }
                        finally {
                            final SubLObject var21_68 = Threads.$is_thread_performing_cleanupP$.currentBinding(var59);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0649.T, var59);
                                module0601.f36746();
                                module0601.f36760((SubLObject)module0649.$ic71$);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var21_68, var59);
                            }
                        }
                    }
                    if (module0649.NIL != f39634(var58)) {
                        try {
                            final SubLObject var21_69 = module0601.$g4652$.currentBinding(var59);
                            final SubLObject var23_67 = module0601.$g4654$.currentBinding(var59);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var59), module0601.$g4652$.getDynamicValue(var59)), var59);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var59), var59);
                                module0601.f36758((SubLObject)module0649.$ic72$, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL);
                                f39626(f39634(var58), var2);
                            }
                            finally {
                                module0601.$g4654$.rebind(var23_67, var59);
                                module0601.$g4652$.rebind(var21_69, var59);
                            }
                        }
                        finally {
                            final SubLObject var21_70 = Threads.$is_thread_performing_cleanupP$.currentBinding(var59);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0649.T, var59);
                                module0601.f36746();
                                module0601.f36760((SubLObject)module0649.$ic72$);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var21_70, var59);
                            }
                        }
                    }
                    if (module0649.NIL != f39635(var58)) {
                        try {
                            final SubLObject var21_71 = module0601.$g4652$.currentBinding(var59);
                            final SubLObject var23_68 = module0601.$g4654$.currentBinding(var59);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var59), module0601.$g4652$.getDynamicValue(var59)), var59);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var59), var59);
                                module0601.f36758((SubLObject)module0649.$ic73$, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL);
                                SubLObject var62 = f39635(var58);
                                SubLObject var64 = (SubLObject)module0649.NIL;
                                var64 = var62.first();
                                while (module0649.NIL != var62) {
                                    try {
                                        final SubLObject var21_72 = module0601.$g4652$.currentBinding(var59);
                                        final SubLObject var23_69 = module0601.$g4654$.currentBinding(var59);
                                        try {
                                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var59), module0601.$g4652$.getDynamicValue(var59)), var59);
                                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var59), var59);
                                            module0601.f36758((SubLObject)module0649.$ic74$, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL);
                                            SubLObject var66;
                                            final SubLObject var65 = var66 = var64;
                                            SubLObject var67 = (SubLObject)module0649.NIL;
                                            SubLObject var68 = (SubLObject)module0649.NIL;
                                            cdestructuring_bind.destructuring_bind_must_consp(var66, var65, (SubLObject)module0649.$ic75$);
                                            var67 = var66.first();
                                            var66 = (var68 = var66.rest());
                                            try {
                                                final SubLObject var21_73 = module0601.$g4652$.currentBinding(var59);
                                                final SubLObject var23_70 = module0601.$g4654$.currentBinding(var59);
                                                try {
                                                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var59), module0601.$g4652$.getDynamicValue(var59)), var59);
                                                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var59), var59);
                                                    module0601.f36758((SubLObject)module0649.$ic76$, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL);
                                                    SubLObject var32_86 = var67;
                                                    SubLObject var69 = (SubLObject)module0649.NIL;
                                                    var69 = var32_86.first();
                                                    while (module0649.NIL != var32_86) {
                                                        try {
                                                            final SubLObject var21_74 = module0601.$g4652$.currentBinding(var59);
                                                            final SubLObject var23_71 = module0601.$g4654$.currentBinding(var59);
                                                            try {
                                                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var59), module0601.$g4652$.getDynamicValue(var59)), var59);
                                                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var59), var59);
                                                                module0601.f36758((SubLObject)module0649.$ic77$, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL);
                                                                SubLObject var92_93;
                                                                final SubLObject var90_91 = var92_93 = var69;
                                                                SubLObject var70 = (SubLObject)module0649.NIL;
                                                                SubLObject var71 = (SubLObject)module0649.NIL;
                                                                cdestructuring_bind.destructuring_bind_must_consp(var92_93, var90_91, (SubLObject)module0649.$ic78$);
                                                                var70 = var92_93.first();
                                                                var92_93 = var92_93.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(var92_93, var90_91, (SubLObject)module0649.$ic78$);
                                                                var71 = var92_93.first();
                                                                var92_93 = var92_93.rest();
                                                                if (module0649.NIL == var92_93) {
                                                                    try {
                                                                        final SubLObject var21_75 = module0601.$g4652$.currentBinding(var59);
                                                                        final SubLObject var23_72 = module0601.$g4654$.currentBinding(var59);
                                                                        try {
                                                                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var59), module0601.$g4652$.getDynamicValue(var59)), var59);
                                                                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var59), var59);
                                                                            module0601.f36758((SubLObject)module0649.$ic28$, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL);
                                                                            module0797.f50965(var70);
                                                                        }
                                                                        finally {
                                                                            module0601.$g4654$.rebind(var23_72, var59);
                                                                            module0601.$g4652$.rebind(var21_75, var59);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        final SubLObject var21_76 = Threads.$is_thread_performing_cleanupP$.currentBinding(var59);
                                                                        try {
                                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0649.T, var59);
                                                                            module0601.f36746();
                                                                            module0601.f36760((SubLObject)module0649.$ic28$);
                                                                        }
                                                                        finally {
                                                                            Threads.$is_thread_performing_cleanupP$.rebind(var21_76, var59);
                                                                        }
                                                                    }
                                                                    try {
                                                                        final SubLObject var21_77 = module0601.$g4652$.currentBinding(var59);
                                                                        final SubLObject var23_73 = module0601.$g4654$.currentBinding(var59);
                                                                        try {
                                                                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var59), module0601.$g4652$.getDynamicValue(var59)), var59);
                                                                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var59), var59);
                                                                            module0601.f36758((SubLObject)module0649.$ic31$, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL);
                                                                            module0797.f50965(var71);
                                                                        }
                                                                        finally {
                                                                            module0601.$g4654$.rebind(var23_73, var59);
                                                                            module0601.$g4652$.rebind(var21_77, var59);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        final SubLObject var21_78 = Threads.$is_thread_performing_cleanupP$.currentBinding(var59);
                                                                        try {
                                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0649.T, var59);
                                                                            module0601.f36746();
                                                                            module0601.f36760((SubLObject)module0649.$ic31$);
                                                                        }
                                                                        finally {
                                                                            Threads.$is_thread_performing_cleanupP$.rebind(var21_78, var59);
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    cdestructuring_bind.cdestructuring_bind_error(var90_91, (SubLObject)module0649.$ic78$);
                                                                }
                                                            }
                                                            finally {
                                                                module0601.$g4654$.rebind(var23_71, var59);
                                                                module0601.$g4652$.rebind(var21_74, var59);
                                                            }
                                                        }
                                                        finally {
                                                            final SubLObject var21_79 = Threads.$is_thread_performing_cleanupP$.currentBinding(var59);
                                                            try {
                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0649.T, var59);
                                                                module0601.f36746();
                                                                module0601.f36760((SubLObject)module0649.$ic77$);
                                                            }
                                                            finally {
                                                                Threads.$is_thread_performing_cleanupP$.rebind(var21_79, var59);
                                                            }
                                                        }
                                                        var32_86 = var32_86.rest();
                                                        var69 = var32_86.first();
                                                    }
                                                }
                                                finally {
                                                    module0601.$g4654$.rebind(var23_70, var59);
                                                    module0601.$g4652$.rebind(var21_73, var59);
                                                }
                                            }
                                            finally {
                                                final SubLObject var21_80 = Threads.$is_thread_performing_cleanupP$.currentBinding(var59);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0649.T, var59);
                                                    module0601.f36746();
                                                    module0601.f36760((SubLObject)module0649.$ic76$);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var21_80, var59);
                                                }
                                            }
                                            try {
                                                final SubLObject var21_81 = module0601.$g4652$.currentBinding(var59);
                                                final SubLObject var23_74 = module0601.$g4654$.currentBinding(var59);
                                                try {
                                                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var59), module0601.$g4652$.getDynamicValue(var59)), var59);
                                                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var59), var59);
                                                    module0601.f36758((SubLObject)module0649.$ic79$, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL);
                                                    SubLObject var32_87 = var68;
                                                    SubLObject var72 = (SubLObject)module0649.NIL;
                                                    var72 = var32_87.first();
                                                    while (module0649.NIL != var32_87) {
                                                        try {
                                                            final SubLObject var21_82 = module0601.$g4652$.currentBinding(var59);
                                                            final SubLObject var23_75 = module0601.$g4654$.currentBinding(var59);
                                                            try {
                                                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var59), module0601.$g4652$.getDynamicValue(var59)), var59);
                                                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var59), var59);
                                                                module0601.f36758((SubLObject)module0649.$ic77$, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL);
                                                                SubLObject var110_111;
                                                                final SubLObject var108_109 = var110_111 = var72;
                                                                SubLObject var70 = (SubLObject)module0649.NIL;
                                                                SubLObject var71 = (SubLObject)module0649.NIL;
                                                                cdestructuring_bind.destructuring_bind_must_consp(var110_111, var108_109, (SubLObject)module0649.$ic78$);
                                                                var70 = var110_111.first();
                                                                var110_111 = var110_111.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(var110_111, var108_109, (SubLObject)module0649.$ic78$);
                                                                var71 = var110_111.first();
                                                                var110_111 = var110_111.rest();
                                                                if (module0649.NIL == var110_111) {
                                                                    try {
                                                                        final SubLObject var21_83 = module0601.$g4652$.currentBinding(var59);
                                                                        final SubLObject var23_76 = module0601.$g4654$.currentBinding(var59);
                                                                        try {
                                                                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var59), module0601.$g4652$.getDynamicValue(var59)), var59);
                                                                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var59), var59);
                                                                            module0601.f36758((SubLObject)module0649.$ic28$, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL);
                                                                            module0797.f50965(var70);
                                                                        }
                                                                        finally {
                                                                            module0601.$g4654$.rebind(var23_76, var59);
                                                                            module0601.$g4652$.rebind(var21_83, var59);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        final SubLObject var21_84 = Threads.$is_thread_performing_cleanupP$.currentBinding(var59);
                                                                        try {
                                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0649.T, var59);
                                                                            module0601.f36746();
                                                                            module0601.f36760((SubLObject)module0649.$ic28$);
                                                                        }
                                                                        finally {
                                                                            Threads.$is_thread_performing_cleanupP$.rebind(var21_84, var59);
                                                                        }
                                                                    }
                                                                    try {
                                                                        final SubLObject var21_85 = module0601.$g4652$.currentBinding(var59);
                                                                        final SubLObject var23_77 = module0601.$g4654$.currentBinding(var59);
                                                                        try {
                                                                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var59), module0601.$g4652$.getDynamicValue(var59)), var59);
                                                                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var59), var59);
                                                                            module0601.f36758((SubLObject)module0649.$ic31$, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL);
                                                                            module0797.f50965(var71);
                                                                        }
                                                                        finally {
                                                                            module0601.$g4654$.rebind(var23_77, var59);
                                                                            module0601.$g4652$.rebind(var21_85, var59);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        final SubLObject var21_86 = Threads.$is_thread_performing_cleanupP$.currentBinding(var59);
                                                                        try {
                                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0649.T, var59);
                                                                            module0601.f36746();
                                                                            module0601.f36760((SubLObject)module0649.$ic31$);
                                                                        }
                                                                        finally {
                                                                            Threads.$is_thread_performing_cleanupP$.rebind(var21_86, var59);
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    cdestructuring_bind.cdestructuring_bind_error(var108_109, (SubLObject)module0649.$ic78$);
                                                                }
                                                            }
                                                            finally {
                                                                module0601.$g4654$.rebind(var23_75, var59);
                                                                module0601.$g4652$.rebind(var21_82, var59);
                                                            }
                                                        }
                                                        finally {
                                                            final SubLObject var21_87 = Threads.$is_thread_performing_cleanupP$.currentBinding(var59);
                                                            try {
                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0649.T, var59);
                                                                module0601.f36746();
                                                                module0601.f36760((SubLObject)module0649.$ic77$);
                                                            }
                                                            finally {
                                                                Threads.$is_thread_performing_cleanupP$.rebind(var21_87, var59);
                                                            }
                                                        }
                                                        var32_87 = var32_87.rest();
                                                        var72 = var32_87.first();
                                                    }
                                                }
                                                finally {
                                                    module0601.$g4654$.rebind(var23_74, var59);
                                                    module0601.$g4652$.rebind(var21_81, var59);
                                                }
                                            }
                                            finally {
                                                final SubLObject var21_88 = Threads.$is_thread_performing_cleanupP$.currentBinding(var59);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0649.T, var59);
                                                    module0601.f36746();
                                                    module0601.f36760((SubLObject)module0649.$ic79$);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var21_88, var59);
                                                }
                                            }
                                        }
                                        finally {
                                            module0601.$g4654$.rebind(var23_69, var59);
                                            module0601.$g4652$.rebind(var21_72, var59);
                                        }
                                    }
                                    finally {
                                        final SubLObject var21_89 = Threads.$is_thread_performing_cleanupP$.currentBinding(var59);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0649.T, var59);
                                            module0601.f36746();
                                            module0601.f36760((SubLObject)module0649.$ic74$);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var21_89, var59);
                                        }
                                    }
                                    var62 = var62.rest();
                                    var64 = var62.first();
                                }
                            }
                            finally {
                                module0601.$g4654$.rebind(var23_68, var59);
                                module0601.$g4652$.rebind(var21_71, var59);
                            }
                        }
                        finally {
                            final SubLObject var21_90 = Threads.$is_thread_performing_cleanupP$.currentBinding(var59);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0649.T, var59);
                                module0601.f36746();
                                module0601.f36760((SubLObject)module0649.$ic73$);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var21_90, var59);
                            }
                        }
                    }
                }
                finally {
                    module0601.$g4654$.rebind(var61, var59);
                    module0601.$g4652$.rebind(var21_62, var59);
                }
            }
            finally {
                final SubLObject var21_91 = Threads.$is_thread_performing_cleanupP$.currentBinding(var59);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0649.T, var59);
                    module0601.f36746();
                    module0601.f36760((SubLObject)module0649.$ic69$);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var21_91, var59);
                }
            }
        }
        finally {
            module0587.$g4457$.rebind(var60, var59);
        }
        return var58;
    }
    
    public static SubLObject f39646(final SubLObject var17, final SubLObject var18) {
        return module0434.f30579((SubLObject)module0649.$ic80$, (SubLObject)ConsesLow.listS(module0649.$ic81$, var17, (SubLObject)module0649.$ic82$), var18, (SubLObject)module0649.UNPROVIDED, (SubLObject)module0649.UNPROVIDED, (SubLObject)module0649.UNPROVIDED, (SubLObject)module0649.UNPROVIDED);
    }
    
    public static SubLObject f39647(final SubLObject var17, final SubLObject var18) {
        return module0434.f30579((SubLObject)module0649.$ic83$, (SubLObject)ConsesLow.listS(module0649.$ic84$, var17, (SubLObject)module0649.$ic85$), var18, (SubLObject)module0649.ZERO_INTEGER, (SubLObject)module0649.ONE_INTEGER, (SubLObject)module0649.UNPROVIDED, (SubLObject)module0649.UNPROVIDED).first();
    }
    
    public static SubLObject f39648(final SubLObject var17, final SubLObject var18) {
        final SubLObject var19 = module0434.f30577((SubLObject)module0649.$ic86$, (SubLObject)ConsesLow.list(module0649.$ic87$, (SubLObject)module0649.$ic88$, (SubLObject)module0649.$ic89$, var17), var18, (SubLObject)module0649.UNPROVIDED, (SubLObject)module0649.UNPROVIDED, (SubLObject)module0649.UNPROVIDED, (SubLObject)module0649.UNPROVIDED);
        SubLObject var20 = (SubLObject)module0649.NIL;
        SubLObject var21 = var19;
        SubLObject var22 = (SubLObject)module0649.NIL;
        var22 = var21.first();
        while (module0649.NIL != var21) {
            SubLObject var24;
            final SubLObject var23 = var24 = var22;
            SubLObject var25 = (SubLObject)module0649.NIL;
            SubLObject var26 = (SubLObject)module0649.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)module0649.$ic90$);
            var25 = var24.first();
            var24 = var24.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)module0649.$ic90$);
            var26 = var24.first();
            var24 = var24.rest();
            if (module0649.NIL == var24) {
                final SubLObject var27 = (SubLObject)ConsesLow.cons(Mapping.mapcar((SubLObject)module0649.$ic91$, var25.rest()), Mapping.mapcar((SubLObject)module0649.$ic91$, var26.rest()));
                var20 = (SubLObject)ConsesLow.cons(var27, var20);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var23, (SubLObject)module0649.$ic90$);
            }
            var21 = var21.rest();
            var22 = var21.first();
        }
        return var20;
    }
    
    public static SubLObject f39650(final SubLObject var1, final SubLObject var2) {
        f39651(var1, var2, (SubLObject)module0649.ZERO_INTEGER);
        return (SubLObject)module0649.NIL;
    }
    
    public static SubLObject f39652(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX43483_native.class) ? module0649.T : module0649.NIL);
    }
    
    public static SubLObject f39653(final SubLObject var1) {
        assert module0649.NIL != f39652(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f39654(final SubLObject var1) {
        assert module0649.NIL != f39652(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f39655(final SubLObject var1) {
        assert module0649.NIL != f39652(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f39656(final SubLObject var1) {
        assert module0649.NIL != f39652(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f39657(final SubLObject var1) {
        assert module0649.NIL != f39652(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f39658(final SubLObject var1) {
        assert module0649.NIL != f39652(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f39659(final SubLObject var1) {
        assert module0649.NIL != f39652(var1) : var1;
        return var1.getField8();
    }
    
    public static SubLObject f39660(final SubLObject var1, final SubLObject var4) {
        assert module0649.NIL != f39652(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f39661(final SubLObject var1, final SubLObject var4) {
        assert module0649.NIL != f39652(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f39662(final SubLObject var1, final SubLObject var4) {
        assert module0649.NIL != f39652(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f39663(final SubLObject var1, final SubLObject var4) {
        assert module0649.NIL != f39652(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f39664(final SubLObject var1, final SubLObject var4) {
        assert module0649.NIL != f39652(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f39665(final SubLObject var1, final SubLObject var4) {
        assert module0649.NIL != f39652(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f39666(final SubLObject var1, final SubLObject var4) {
        assert module0649.NIL != f39652(var1) : var1;
        return var1.setField8(var4);
    }
    
    public static SubLObject f39667(SubLObject var5) {
        if (var5 == module0649.UNPROVIDED) {
            var5 = (SubLObject)module0649.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX43483_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0649.NIL, var7 = var5; module0649.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0649.$ic55$)) {
                f39660(var6, var9);
            }
            else if (var10.eql((SubLObject)module0649.$ic115$)) {
                f39661(var6, var9);
            }
            else if (var10.eql((SubLObject)module0649.$ic116$)) {
                f39662(var6, var9);
            }
            else if (var10.eql((SubLObject)module0649.$ic117$)) {
                f39663(var6, var9);
            }
            else if (var10.eql((SubLObject)module0649.$ic118$)) {
                f39664(var6, var9);
            }
            else if (var10.eql((SubLObject)module0649.$ic119$)) {
                f39665(var6, var9);
            }
            else if (var10.eql((SubLObject)module0649.$ic58$)) {
                f39666(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0649.$ic18$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f39668(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0649.$ic19$, (SubLObject)module0649.$ic120$, (SubLObject)module0649.SEVEN_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0649.$ic21$, (SubLObject)module0649.$ic55$, f39653(var11));
        Functions.funcall(var12, var11, (SubLObject)module0649.$ic21$, (SubLObject)module0649.$ic115$, f39654(var11));
        Functions.funcall(var12, var11, (SubLObject)module0649.$ic21$, (SubLObject)module0649.$ic116$, f39655(var11));
        Functions.funcall(var12, var11, (SubLObject)module0649.$ic21$, (SubLObject)module0649.$ic117$, f39656(var11));
        Functions.funcall(var12, var11, (SubLObject)module0649.$ic21$, (SubLObject)module0649.$ic118$, f39657(var11));
        Functions.funcall(var12, var11, (SubLObject)module0649.$ic21$, (SubLObject)module0649.$ic119$, f39658(var11));
        Functions.funcall(var12, var11, (SubLObject)module0649.$ic21$, (SubLObject)module0649.$ic58$, f39659(var11));
        Functions.funcall(var12, var11, (SubLObject)module0649.$ic22$, (SubLObject)module0649.$ic120$, (SubLObject)module0649.SEVEN_INTEGER);
        return var11;
    }
    
    public static SubLObject f39669(final SubLObject var11, final SubLObject var12) {
        return f39668(var11, var12);
    }
    
    public static SubLObject f39651(final SubLObject var13, final SubLObject var2, final SubLObject var14) {
        streams_high.write_string((SubLObject)module0649.$ic122$, var2, (SubLObject)module0649.UNPROVIDED, (SubLObject)module0649.UNPROVIDED);
        PrintLow.format(var2, (SubLObject)module0649.$ic123$, new SubLObject[] { (module0649.NIL != f39653(var13)) ? f39653(var13) : module0649.$ic124$, (module0649.NIL != f39654(var13)) ? f39654(var13) : module0649.$ic125$, (module0649.NIL != f39655(var13)) ? f39655(var13) : module0649.$ic126$ });
        PrintLow.format(var2, (SubLObject)module0649.$ic127$, f39656(var13));
        PrintLow.format(var2, (SubLObject)module0649.$ic128$, f39657(var13));
        PrintLow.format(var2, (SubLObject)module0649.$ic129$);
        if (module0649.NIL != module0067.f4852(f39658(var13))) {
            module0084.f5789(f39658(var13), var2);
        }
        else {
            PrintLow.format(var2, (SubLObject)module0649.$ic130$);
        }
        PrintLow.format(var2, (SubLObject)module0649.$ic131$, f39659(var13));
        streams_high.write_string((SubLObject)module0649.$ic26$, var2, (SubLObject)module0649.UNPROVIDED, (SubLObject)module0649.UNPROVIDED);
        return var13;
    }
    
    public static SubLObject f39670(final SubLObject var131, SubLObject var2) {
        if (var2 == module0649.UNPROVIDED) {
            var2 = module0587.$g4457$.getDynamicValue();
        }
        final SubLThread var132 = SubLProcess.currentSubLThread();
        final SubLObject var133 = module0587.$g4457$.currentBinding(var132);
        try {
            module0587.$g4457$.bind(var2, var132);
            try {
                final SubLObject var21_132 = module0601.$g4652$.currentBinding(var132);
                final SubLObject var134 = module0601.$g4654$.currentBinding(var132);
                try {
                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var132), module0601.$g4652$.getDynamicValue(var132)), var132);
                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var132), var132);
                    module0601.f36758((SubLObject)module0649.$ic132$, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL);
                    if (module0649.NIL != f39653(var131)) {
                        try {
                            final SubLObject var21_133 = module0601.$g4652$.currentBinding(var132);
                            final SubLObject var23_134 = module0601.$g4654$.currentBinding(var132);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var132), module0601.$g4652$.getDynamicValue(var132)), var132);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var132), var132);
                                module0601.f36758((SubLObject)module0649.$ic133$, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL);
                                module0797.f50965(f39653(var131));
                            }
                            finally {
                                module0601.$g4654$.rebind(var23_134, var132);
                                module0601.$g4652$.rebind(var21_133, var132);
                            }
                        }
                        finally {
                            final SubLObject var21_134 = Threads.$is_thread_performing_cleanupP$.currentBinding(var132);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0649.T, var132);
                                module0601.f36746();
                                module0601.f36760((SubLObject)module0649.$ic133$);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var21_134, var132);
                            }
                        }
                    }
                    if (module0649.NIL != f39654(var131)) {
                        try {
                            final SubLObject var21_135 = module0601.$g4652$.currentBinding(var132);
                            final SubLObject var23_135 = module0601.$g4654$.currentBinding(var132);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var132), module0601.$g4652$.getDynamicValue(var132)), var132);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var132), var132);
                                module0601.f36758((SubLObject)module0649.$ic134$, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL);
                                module0797.f50965(f39654(var131));
                            }
                            finally {
                                module0601.$g4654$.rebind(var23_135, var132);
                                module0601.$g4652$.rebind(var21_135, var132);
                            }
                        }
                        finally {
                            final SubLObject var21_136 = Threads.$is_thread_performing_cleanupP$.currentBinding(var132);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0649.T, var132);
                                module0601.f36746();
                                module0601.f36760((SubLObject)module0649.$ic134$);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var21_136, var132);
                            }
                        }
                    }
                    if (module0649.NIL != f39655(var131)) {
                        try {
                            final SubLObject var21_137 = module0601.$g4652$.currentBinding(var132);
                            final SubLObject var23_136 = module0601.$g4654$.currentBinding(var132);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var132), module0601.$g4652$.getDynamicValue(var132)), var132);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var132), var132);
                                module0601.f36758((SubLObject)module0649.$ic135$, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL);
                                module0797.f50965(f39655(var131));
                            }
                            finally {
                                module0601.$g4654$.rebind(var23_136, var132);
                                module0601.$g4652$.rebind(var21_137, var132);
                            }
                        }
                        finally {
                            final SubLObject var21_138 = Threads.$is_thread_performing_cleanupP$.currentBinding(var132);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0649.T, var132);
                                module0601.f36746();
                                module0601.f36760((SubLObject)module0649.$ic135$);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var21_138, var132);
                            }
                        }
                    }
                    if (module0649.NIL != f39656(var131)) {
                        try {
                            final SubLObject var21_139 = module0601.$g4652$.currentBinding(var132);
                            final SubLObject var23_137 = module0601.$g4654$.currentBinding(var132);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var132), module0601.$g4652$.getDynamicValue(var132)), var132);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var132), var132);
                                module0601.f36758((SubLObject)module0649.$ic136$, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL);
                                SubLObject var135 = f39656(var131);
                                SubLObject var136 = (SubLObject)module0649.NIL;
                                var136 = var135.first();
                                while (module0649.NIL != var135) {
                                    module0797.f50965(var136);
                                    var135 = var135.rest();
                                    var136 = var135.first();
                                }
                            }
                            finally {
                                module0601.$g4654$.rebind(var23_137, var132);
                                module0601.$g4652$.rebind(var21_139, var132);
                            }
                        }
                        finally {
                            final SubLObject var21_140 = Threads.$is_thread_performing_cleanupP$.currentBinding(var132);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0649.T, var132);
                                module0601.f36746();
                                module0601.f36760((SubLObject)module0649.$ic136$);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var21_140, var132);
                            }
                        }
                    }
                    if (module0649.NIL != f39657(var131)) {
                        try {
                            final SubLObject var21_141 = module0601.$g4652$.currentBinding(var132);
                            final SubLObject var23_138 = module0601.$g4654$.currentBinding(var132);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var132), module0601.$g4652$.getDynamicValue(var132)), var132);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var132), var132);
                                module0601.f36758((SubLObject)module0649.$ic137$, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL);
                                SubLObject var135 = f39657(var131);
                                SubLObject var136 = (SubLObject)module0649.NIL;
                                var136 = var135.first();
                                while (module0649.NIL != var135) {
                                    module0797.f50965(var136);
                                    var135 = var135.rest();
                                    var136 = var135.first();
                                }
                            }
                            finally {
                                module0601.$g4654$.rebind(var23_138, var132);
                                module0601.$g4652$.rebind(var21_141, var132);
                            }
                        }
                        finally {
                            final SubLObject var21_142 = Threads.$is_thread_performing_cleanupP$.currentBinding(var132);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0649.T, var132);
                                module0601.f36746();
                                module0601.f36760((SubLObject)module0649.$ic137$);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var21_142, var132);
                            }
                        }
                    }
                    if (module0649.NIL != f39658(var131)) {
                        try {
                            final SubLObject var21_143 = module0601.$g4652$.currentBinding(var132);
                            final SubLObject var23_139 = module0601.$g4654$.currentBinding(var132);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var132), module0601.$g4652$.getDynamicValue(var132)), var132);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var132), var132);
                                module0601.f36758((SubLObject)module0649.$ic138$, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL);
                                SubLObject var137;
                                for (var137 = module0066.f4838(module0067.f4891(f39658(var131))); module0649.NIL == module0066.f4841(var137); var137 = module0066.f4840(var137)) {
                                    var132.resetMultipleValues();
                                    final SubLObject var138 = module0066.f4839(var137);
                                    final SubLObject var139 = var132.secondMultipleValue();
                                    var132.resetMultipleValues();
                                    try {
                                        final SubLObject var21_144 = module0601.$g4652$.currentBinding(var132);
                                        final SubLObject var23_140 = module0601.$g4654$.currentBinding(var132);
                                        try {
                                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var132), module0601.$g4652$.getDynamicValue(var132)), var132);
                                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var132), var132);
                                            module0601.f36758((SubLObject)module0649.$ic139$, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL);
                                            try {
                                                final SubLObject var21_145 = module0601.$g4652$.currentBinding(var132);
                                                final SubLObject var23_141 = module0601.$g4654$.currentBinding(var132);
                                                try {
                                                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var132), module0601.$g4652$.getDynamicValue(var132)), var132);
                                                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var132), var132);
                                                    module0601.f36758((SubLObject)module0649.$ic140$, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL);
                                                    module0797.f50965(var138);
                                                }
                                                finally {
                                                    module0601.$g4654$.rebind(var23_141, var132);
                                                    module0601.$g4652$.rebind(var21_145, var132);
                                                }
                                            }
                                            finally {
                                                final SubLObject var21_146 = Threads.$is_thread_performing_cleanupP$.currentBinding(var132);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0649.T, var132);
                                                    module0601.f36746();
                                                    module0601.f36760((SubLObject)module0649.$ic140$);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var21_146, var132);
                                                }
                                            }
                                            try {
                                                final SubLObject var21_147 = module0601.$g4652$.currentBinding(var132);
                                                final SubLObject var23_142 = module0601.$g4654$.currentBinding(var132);
                                                try {
                                                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var132), module0601.$g4652$.getDynamicValue(var132)), var132);
                                                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var132), var132);
                                                    module0601.f36758((SubLObject)module0649.$ic137$, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL);
                                                    SubLObject var140 = var139;
                                                    SubLObject var141 = (SubLObject)module0649.NIL;
                                                    var141 = var140.first();
                                                    while (module0649.NIL != var140) {
                                                        module0797.f50965(var141);
                                                        var140 = var140.rest();
                                                        var141 = var140.first();
                                                    }
                                                }
                                                finally {
                                                    module0601.$g4654$.rebind(var23_142, var132);
                                                    module0601.$g4652$.rebind(var21_147, var132);
                                                }
                                            }
                                            finally {
                                                final SubLObject var21_148 = Threads.$is_thread_performing_cleanupP$.currentBinding(var132);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0649.T, var132);
                                                    module0601.f36746();
                                                    module0601.f36760((SubLObject)module0649.$ic137$);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var21_148, var132);
                                                }
                                            }
                                        }
                                        finally {
                                            module0601.$g4654$.rebind(var23_140, var132);
                                            module0601.$g4652$.rebind(var21_144, var132);
                                        }
                                    }
                                    finally {
                                        final SubLObject var21_149 = Threads.$is_thread_performing_cleanupP$.currentBinding(var132);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0649.T, var132);
                                            module0601.f36746();
                                            module0601.f36760((SubLObject)module0649.$ic139$);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var21_149, var132);
                                        }
                                    }
                                }
                                module0066.f4842(var137);
                            }
                            finally {
                                module0601.$g4654$.rebind(var23_139, var132);
                                module0601.$g4652$.rebind(var21_143, var132);
                            }
                        }
                        finally {
                            final SubLObject var21_150 = Threads.$is_thread_performing_cleanupP$.currentBinding(var132);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0649.T, var132);
                                module0601.f36746();
                                module0601.f36760((SubLObject)module0649.$ic138$);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var21_150, var132);
                            }
                        }
                    }
                    if (module0649.NIL != f39659(var131)) {
                        try {
                            final SubLObject var21_151 = module0601.$g4652$.currentBinding(var132);
                            final SubLObject var23_143 = module0601.$g4654$.currentBinding(var132);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var132), module0601.$g4652$.getDynamicValue(var132)), var132);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var132), var132);
                                module0601.f36758((SubLObject)module0649.$ic141$, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL);
                                SubLObject var135 = f39659(var131);
                                SubLObject var142 = (SubLObject)module0649.NIL;
                                var142 = var135.first();
                                while (module0649.NIL != var135) {
                                    try {
                                        final SubLObject var21_152 = module0601.$g4652$.currentBinding(var132);
                                        final SubLObject var23_144 = module0601.$g4654$.currentBinding(var132);
                                        try {
                                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var132), module0601.$g4652$.getDynamicValue(var132)), var132);
                                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var132), var132);
                                            module0601.f36758((SubLObject)module0649.$ic142$, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL);
                                            SubLObject var144;
                                            final SubLObject var143 = var144 = var142;
                                            SubLObject var145 = (SubLObject)module0649.NIL;
                                            SubLObject var146 = (SubLObject)module0649.NIL;
                                            cdestructuring_bind.destructuring_bind_must_consp(var144, var143, (SubLObject)module0649.$ic143$);
                                            var145 = var144.first();
                                            var144 = var144.rest();
                                            cdestructuring_bind.destructuring_bind_must_consp(var144, var143, (SubLObject)module0649.$ic143$);
                                            var146 = var144.first();
                                            var144 = var144.rest();
                                            if (module0649.NIL == var144) {
                                                try {
                                                    final SubLObject var21_153 = module0601.$g4652$.currentBinding(var132);
                                                    final SubLObject var23_145 = module0601.$g4654$.currentBinding(var132);
                                                    try {
                                                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var132), module0601.$g4652$.getDynamicValue(var132)), var132);
                                                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var132), var132);
                                                        module0601.f36758((SubLObject)module0649.$ic140$, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL);
                                                        module0797.f50965(var145);
                                                    }
                                                    finally {
                                                        module0601.$g4654$.rebind(var23_145, var132);
                                                        module0601.$g4652$.rebind(var21_153, var132);
                                                    }
                                                }
                                                finally {
                                                    final SubLObject var21_154 = Threads.$is_thread_performing_cleanupP$.currentBinding(var132);
                                                    try {
                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0649.T, var132);
                                                        module0601.f36746();
                                                        module0601.f36760((SubLObject)module0649.$ic140$);
                                                    }
                                                    finally {
                                                        Threads.$is_thread_performing_cleanupP$.rebind(var21_154, var132);
                                                    }
                                                }
                                                try {
                                                    final SubLObject var21_155 = module0601.$g4652$.currentBinding(var132);
                                                    final SubLObject var23_146 = module0601.$g4654$.currentBinding(var132);
                                                    try {
                                                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var132), module0601.$g4652$.getDynamicValue(var132)), var132);
                                                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var132), var132);
                                                        module0601.f36758((SubLObject)module0649.$ic144$, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL, (SubLObject)module0649.NIL);
                                                        module0797.f50965(var146);
                                                    }
                                                    finally {
                                                        module0601.$g4654$.rebind(var23_146, var132);
                                                        module0601.$g4652$.rebind(var21_155, var132);
                                                    }
                                                }
                                                finally {
                                                    final SubLObject var21_156 = Threads.$is_thread_performing_cleanupP$.currentBinding(var132);
                                                    try {
                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0649.T, var132);
                                                        module0601.f36746();
                                                        module0601.f36760((SubLObject)module0649.$ic144$);
                                                    }
                                                    finally {
                                                        Threads.$is_thread_performing_cleanupP$.rebind(var21_156, var132);
                                                    }
                                                }
                                            }
                                            else {
                                                cdestructuring_bind.cdestructuring_bind_error(var143, (SubLObject)module0649.$ic143$);
                                            }
                                        }
                                        finally {
                                            module0601.$g4654$.rebind(var23_144, var132);
                                            module0601.$g4652$.rebind(var21_152, var132);
                                        }
                                    }
                                    finally {
                                        final SubLObject var21_157 = Threads.$is_thread_performing_cleanupP$.currentBinding(var132);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0649.T, var132);
                                            module0601.f36746();
                                            module0601.f36760((SubLObject)module0649.$ic142$);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var21_157, var132);
                                        }
                                    }
                                    var135 = var135.rest();
                                    var142 = var135.first();
                                }
                            }
                            finally {
                                module0601.$g4654$.rebind(var23_143, var132);
                                module0601.$g4652$.rebind(var21_151, var132);
                            }
                        }
                        finally {
                            final SubLObject var21_158 = Threads.$is_thread_performing_cleanupP$.currentBinding(var132);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0649.T, var132);
                                module0601.f36746();
                                module0601.f36760((SubLObject)module0649.$ic141$);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var21_158, var132);
                            }
                        }
                    }
                }
                finally {
                    module0601.$g4654$.rebind(var134, var132);
                    module0601.$g4652$.rebind(var21_132, var132);
                }
            }
            finally {
                final SubLObject var21_159 = Threads.$is_thread_performing_cleanupP$.currentBinding(var132);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0649.T, var132);
                    module0601.f36746();
                    module0601.f36760((SubLObject)module0649.$ic132$);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var21_159, var132);
                }
            }
        }
        finally {
            module0587.$g4457$.rebind(var133, var132);
        }
        return var131;
    }
    
    public static SubLObject f39671(final SubLObject var179) {
        final SubLObject var180 = f39667((SubLObject)module0649.UNPROVIDED);
        f39660(var180, var179);
        return var180;
    }
    
    public static SubLObject f39672(final SubLObject var179, final SubLObject var18, SubLObject var180, SubLObject var181) {
        if (var180 == module0649.UNPROVIDED) {
            var180 = (SubLObject)module0649.NIL;
        }
        if (var181 == module0649.UNPROVIDED) {
            var181 = (SubLObject)module0649.NIL;
        }
        final SubLObject var182 = f39671(var179);
        f39673(var182, var180, var181, var18);
        f39674(var182, var18);
        f39675(var182, var18);
        return var182;
    }
    
    public static SubLObject f39676(final SubLObject var182, final SubLObject var183, final SubLObject var18, SubLObject var184, SubLObject var185) {
        if (var184 == module0649.UNPROVIDED) {
            var184 = (SubLObject)module0649.$ic145$;
        }
        if (var185 == module0649.UNPROVIDED) {
            var185 = (SubLObject)module0649.T;
        }
        final SubLObject var186 = f39671((SubLObject)module0649.NIL);
        f39677(var186, var18, var182, var183, var184, var185);
        return var186;
    }
    
    public static SubLObject f39673(final SubLObject var131, SubLObject var180, SubLObject var181, final SubLObject var18) {
        final SubLObject var182 = f39653(var131);
        if (module0649.NIL == var180) {
            var180 = f39678(var182, var18);
        }
        if (module0649.NIL == var181) {
            var181 = f39679(var182, var18);
        }
        f39661(var131, var180);
        f39662(var131, var181);
        return var131;
    }
    
    public static SubLObject f39678(final SubLObject var179, final SubLObject var18) {
        return module0434.f30579((SubLObject)module0649.$ic146$, (SubLObject)ConsesLow.listS(module0649.$ic147$, var179, (SubLObject)module0649.$ic148$), var18, (SubLObject)module0649.ZERO_INTEGER, (SubLObject)module0649.ONE_INTEGER, (SubLObject)module0649.UNPROVIDED, (SubLObject)module0649.UNPROVIDED).first();
    }
    
    public static SubLObject f39679(final SubLObject var179, final SubLObject var18) {
        return module0434.f30579((SubLObject)module0649.$ic149$, (SubLObject)ConsesLow.listS(module0649.$ic150$, var179, (SubLObject)module0649.$ic151$), var18, (SubLObject)module0649.ZERO_INTEGER, (SubLObject)module0649.ONE_INTEGER, (SubLObject)module0649.UNPROVIDED, (SubLObject)module0649.UNPROVIDED).first();
    }
    
    public static SubLObject f39674(final SubLObject var131, final SubLObject var18) {
        final SubLObject var132 = f39680(f39654(var131), var18);
        final SubLObject var133 = f39680(f39655(var131), var18);
        f39681(var131, var18, var132, var133);
        return var131;
    }
    
    public static SubLObject f39677(final SubLObject var131, final SubLObject var18, final SubLObject var182, final SubLObject var183, SubLObject var184, SubLObject var185) {
        if (var184 == module0649.UNPROVIDED) {
            var184 = (SubLObject)module0649.$ic145$;
        }
        if (var185 == module0649.UNPROVIDED) {
            var185 = (SubLObject)module0649.T;
        }
        final SubLObject var186 = module0307.f20765(var182, var18, var184, var185);
        final SubLObject var187 = module0307.f20765(var183, var18, var184, var185);
        return f39681(var131, var18, var186, var187);
    }
    
    public static SubLObject f39681(final SubLObject var131, final SubLObject var18, final SubLObject var186, final SubLObject var187) {
        final SubLThread var188 = SubLProcess.currentSubLThread();
        f39663(var131, module0067.f4902(var186));
        f39664(var131, module0067.f4902(var187));
        final SubLObject var189 = module0067.f4880((SubLObject)module0649.UNPROVIDED, (SubLObject)module0649.UNPROVIDED);
        final SubLObject var191;
        final SubLObject var190 = var191 = module0034.f1888();
        final SubLObject var192 = module0034.$g879$.currentBinding(var188);
        try {
            module0034.$g879$.bind(var191, var188);
            SubLObject var193 = (SubLObject)module0649.NIL;
            if (module0649.NIL != var191 && module0649.NIL == module0034.f1842(var191)) {
                var193 = module0034.f1869(var191);
                final SubLObject var194 = Threads.current_process();
                if (module0649.NIL == var193) {
                    module0034.f1873(var191, var194);
                }
                else if (!var193.eql(var194)) {
                    Errors.error((SubLObject)module0649.$ic152$);
                }
            }
            try {
                SubLObject var195;
                for (var195 = module0066.f4838(module0067.f4891(var186)); module0649.NIL == module0066.f4841(var195); var195 = module0066.f4840(var195)) {
                    var188.resetMultipleValues();
                    final SubLObject var196 = module0066.f4839(var195);
                    final SubLObject var197 = var188.secondMultipleValue();
                    var188.resetMultipleValues();
                    SubLObject var199;
                    final SubLObject var198 = var199 = var197;
                    SubLObject var200 = (SubLObject)module0649.NIL;
                    SubLObject var201 = (SubLObject)module0649.NIL;
                    SubLObject var202 = (SubLObject)module0649.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var199, var198, (SubLObject)module0649.$ic153$);
                    var200 = var199.first();
                    var199 = var199.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var199, var198, (SubLObject)module0649.$ic153$);
                    var201 = var199.first();
                    var199 = var199.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var199, var198, (SubLObject)module0649.$ic153$);
                    var202 = var199.first();
                    var199 = var199.rest();
                    if (module0649.NIL == var199) {
                        SubLObject var203 = (SubLObject)module0649.NIL;
                        SubLObject var150_201;
                        for (var150_201 = module0066.f4838(module0067.f4891(var187)); module0649.NIL == module0066.f4841(var150_201); var150_201 = module0066.f4840(var150_201)) {
                            var188.resetMultipleValues();
                            final SubLObject var204 = module0066.f4839(var150_201);
                            final SubLObject var205 = var188.secondMultipleValue();
                            var188.resetMultipleValues();
                            SubLObject var206_207;
                            final SubLObject var204_205 = var206_207 = var205;
                            SubLObject var206 = (SubLObject)module0649.NIL;
                            SubLObject var207 = (SubLObject)module0649.NIL;
                            SubLObject var208 = (SubLObject)module0649.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var206_207, var204_205, (SubLObject)module0649.$ic154$);
                            var206 = var206_207.first();
                            var206_207 = var206_207.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var206_207, var204_205, (SubLObject)module0649.$ic154$);
                            var207 = var206_207.first();
                            var206_207 = var206_207.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var206_207, var204_205, (SubLObject)module0649.$ic154$);
                            var208 = var206_207.first();
                            var206_207 = var206_207.rest();
                            if (module0649.NIL == var206_207) {
                                if (module0649.NIL != module0257.f16698(var200, var206, var18, (SubLObject)module0649.T)) {
                                    var203 = (SubLObject)ConsesLow.cons(var204, var203);
                                }
                                else if (module0649.NIL != module0257.f16698(var201, var207, var18, (SubLObject)module0649.T)) {
                                    var203 = (SubLObject)ConsesLow.cons(var204, var203);
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var204_205, (SubLObject)module0649.$ic154$);
                            }
                        }
                        module0066.f4842(var150_201);
                        if (module0649.NIL != var203) {
                            module0067.f4886(var189, var196, var203);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var198, (SubLObject)module0649.$ic153$);
                    }
                }
                module0066.f4842(var195);
            }
            finally {
                final SubLObject var21_211 = Threads.$is_thread_performing_cleanupP$.currentBinding(var188);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0649.T, var188);
                    if (module0649.NIL != var191 && module0649.NIL == var193) {
                        module0034.f1873(var191, (SubLObject)module0649.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var21_211, var188);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var192, var188);
        }
        f39665(var131, var189);
        return var131;
    }
    
    public static SubLObject f39680(final SubLObject var15, final SubLObject var18) {
        if (module0649.NIL == var15) {
            return module0067.f4880((SubLObject)module0649.UNPROVIDED, (SubLObject)module0649.UNPROVIDED);
        }
        final SubLObject var19 = module0637.f38922(var15, (SubLObject)module0649.UNPROVIDED);
        final SubLObject var20 = module0637.f38899(var19);
        return module0307.f20765(var20, var18, (SubLObject)module0649.UNPROVIDED, (SubLObject)module0649.UNPROVIDED);
    }
    
    public static SubLObject f39675(final SubLObject var131, final SubLObject var18) {
        f39666(var131, f39682(f39653(var131), f39654(var131), f39655(var131), var18));
        return var131;
    }
    
    public static SubLObject f39682(final SubLObject var179, final SubLObject var180, final SubLObject var181, final SubLObject var18) {
        if (module0649.NIL == var179 || module0649.NIL == var181 || module0649.NIL == var180) {
            return (SubLObject)module0649.NIL;
        }
        SubLObject var182 = (SubLObject)module0649.NIL;
        final SubLObject var183 = var182 = module0434.f30577((SubLObject)module0649.$ic155$, (SubLObject)ConsesLow.list(module0649.$ic156$, var180, (SubLObject)module0649.$ic157$, var181, (SubLObject)module0649.$ic158$, var179), var18, (SubLObject)module0649.UNPROVIDED, (SubLObject)module0649.UNPROVIDED, (SubLObject)module0649.UNPROVIDED, (SubLObject)module0649.UNPROVIDED);
        if (module0649.NIL == var182) {
            var182 = module0434.f30577((SubLObject)module0649.$ic155$, (SubLObject)ConsesLow.list(module0649.$ic159$, var180, (SubLObject)module0649.$ic160$, var181, (SubLObject)module0649.$ic161$, var179), var18, (SubLObject)module0649.UNPROVIDED, (SubLObject)module0649.UNPROVIDED, (SubLObject)module0649.UNPROVIDED, (SubLObject)module0649.UNPROVIDED);
        }
        return var182;
    }
    
    public static SubLObject f39683(final SubLObject var216, SubLObject var18, SubLObject var184, SubLObject var185) {
        if (var18 == module0649.UNPROVIDED) {
            var18 = (SubLObject)module0649.NIL;
        }
        if (var184 == module0649.UNPROVIDED) {
            var184 = (SubLObject)module0649.$ic145$;
        }
        if (var185 == module0649.UNPROVIDED) {
            var185 = (SubLObject)module0649.T;
        }
        final SubLObject var217 = var216.first();
        SubLObject var218 = var216.rest();
        SubLObject var219 = (SubLObject)module0649.NIL;
        var219 = var218.first();
        while (module0649.NIL != var218) {
            var219 = f39684(var219, var217);
            final SubLObject var220 = f39685(var219, var217, var18, var184, var185);
            var218 = var218.rest();
            var219 = var218.first();
        }
        return var217;
    }
    
    public static SubLObject f39684(SubLObject var182, final SubLObject var183) {
        final SubLObject var184 = module0035.f2259((SubLObject)module0649.$ic145$, var182, (SubLObject)module0649.UNPROVIDED);
        SubLObject var186;
        final SubLObject var185 = var186 = module0035.f2259((SubLObject)module0649.$ic145$, var183, (SubLObject)module0649.UNPROVIDED);
        SubLObject var187 = (SubLObject)module0649.NIL;
        SubLObject var188 = var184;
        SubLObject var189 = (SubLObject)module0649.NIL;
        var189 = var188.first();
        while (module0649.NIL != var188) {
            if (module0649.NIL != module0004.f104(var189, var186, (SubLObject)module0649.UNPROVIDED, (SubLObject)module0649.UNPROVIDED)) {
                final SubLObject var190 = module0035.f2259((SubLObject)module0649.$ic145$, var182, (SubLObject)module0649.UNPROVIDED);
                final SubLObject var191 = f39686(var189, Sequences.cconcatenate(var190, var186));
                var182 = module0035.f2457(var182, var189, var191);
                var187 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var189, var191), var187);
                var186 = (SubLObject)ConsesLow.cons(var191, var186);
            }
            var188 = var188.rest();
            var189 = var188.first();
        }
        return Values.values(var182, var187);
    }
    
    public static SubLObject f39686(final SubLObject var224, final SubLObject var225) {
        SubLObject var226 = var224;
        while (module0649.NIL != module0004.f104(var226, var225, (SubLObject)module0649.UNPROVIDED, (SubLObject)module0649.UNPROVIDED)) {
            final SubLObject var227 = module0038.f2624(var226);
            if (module0649.NIL != module0038.f2682(var227)) {
                final SubLObject var228 = module0038.f2683(var227);
                final SubLObject var229 = module0048.f_1X(var228);
                var226 = module0201.f12550(module0038.f2699(module0038.f2638(var229), module0038.f2638(var228), var227, (SubLObject)module0649.UNPROVIDED));
            }
            else {
                var226 = module0202.f12703(var225, var224);
            }
        }
        return var226;
    }
    
    public static SubLObject f39685(final SubLObject var182, final SubLObject var183, final SubLObject var18, SubLObject var184, SubLObject var185) {
        if (var184 == module0649.UNPROVIDED) {
            var184 = (SubLObject)module0649.$ic145$;
        }
        if (var185 == module0649.UNPROVIDED) {
            var185 = (SubLObject)module0649.T;
        }
        assert module0649.NIL != Types.function_spec_p(var184) : var184;
        final SubLObject var186 = f39676(var182, var183, var18, var184, var185);
        final SubLObject var187 = f39658(var186);
        final SubLObject var188 = f39656(var186);
        final SubLObject var189 = f39657(var186);
        final SubLObject var190 = Hashtables.make_hash_table((SubLObject)module0649.TEN_INTEGER, (SubLObject)module0649.UNPROVIDED, (SubLObject)module0649.UNPROVIDED);
        SubLObject var191 = (SubLObject)module0649.NIL;
        SubLObject var192 = (SubLObject)module0649.NIL;
        SubLObject var193 = var188;
        SubLObject var194 = (SubLObject)module0649.NIL;
        var194 = var193.first();
        while (module0649.NIL != var193) {
            SubLObject var32_233 = var189;
            SubLObject var195 = (SubLObject)module0649.NIL;
            var195 = var32_233.first();
            while (module0649.NIL != var32_233) {
                final SubLObject var196 = module0067.f4884(var187, var194, (SubLObject)module0649.UNPROVIDED);
                if (module0649.NIL != Functions.funcall(var184, var194) && module0649.NIL != Functions.funcall(var184, var195)) {
                    SubLObject var197 = (SubLObject)module0649.T;
                    if (module0649.NIL != var196 && module0649.NIL != module0004.f104(var195, var196, (SubLObject)module0649.UNPROVIDED, (SubLObject)module0649.UNPROVIDED)) {
                        var197 = (SubLObject)module0649.NIL;
                    }
                    if (module0649.NIL != var197) {
                        var191 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var194, var195), var191);
                        module0030.f1615(var194, var190, (SubLObject)module0649.UNPROVIDED, (SubLObject)module0649.UNPROVIDED);
                        module0030.f1615(var195, var190, (SubLObject)module0649.UNPROVIDED, (SubLObject)module0649.UNPROVIDED);
                    }
                }
                var32_233 = var32_233.rest();
                var195 = var32_233.first();
            }
            var193 = var193.rest();
            var194 = var193.first();
        }
        var193 = var191;
        SubLObject var198 = (SubLObject)module0649.NIL;
        var198 = var193.first();
        while (module0649.NIL != var193) {
            final SubLObject var199 = var198.first();
            final SubLObject var200 = conses_high.second(var198);
            final SubLObject var201 = Hashtables.gethash(var199, var190, (SubLObject)module0649.UNPROVIDED);
            final SubLObject var202 = Hashtables.gethash(var200, var190, (SubLObject)module0649.UNPROVIDED);
            if (var201.isInteger() && var202.isInteger() && var201.numE((SubLObject)module0649.ONE_INTEGER) && var202.numE((SubLObject)module0649.ONE_INTEGER)) {
                var192 = (SubLObject)ConsesLow.cons(var198, var192);
            }
            var193 = var193.rest();
            var198 = var193.first();
        }
        return var192;
    }
    
    public static SubLObject f39687() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39611", "S#43485", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39613", "S#43480", 1, 0, false);
        new $f39613$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39614", "S#43486", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39615", "S#43487", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39616", "S#43488", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39617", "S#43489", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39618", "S#43490", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39619", "S#43491", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39620", "S#43492", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39621", "S#43493", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39622", "S#43494", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39612", "S#43495", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39623", "S#43496", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39624", "S#43497", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39626", "S#43498", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39625", "S#43499", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39627", "S#43500", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39628", "S#43501", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39630", "S#43482", 1, 0, false);
        new $f39630$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39631", "S#43502", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39632", "S#43503", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39633", "S#43504", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39634", "S#43505", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39635", "S#43506", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39636", "S#43507", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39637", "S#43508", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39638", "S#43509", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39639", "S#43510", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39640", "S#43511", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39641", "S#43512", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39642", "S#43513", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39643", "S#43514", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39629", "S#43515", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39644", "S#43516", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39645", "S#43517", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39649", "S#43518", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39646", "S#43519", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39647", "S#43520", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39648", "S#43521", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39650", "S#43522", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39652", "S#43484", 1, 0, false);
        new $f39652$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39653", "S#43523", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39654", "S#43524", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39655", "S#43525", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39656", "S#43526", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39657", "S#43527", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39658", "S#43528", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39659", "S#43529", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39660", "S#43530", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39661", "S#43531", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39662", "S#43532", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39663", "S#43533", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39664", "S#43534", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39665", "S#43535", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39666", "S#43536", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39667", "S#43537", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39668", "S#43538", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39669", "S#43539", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39651", "S#43540", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39670", "S#43541", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39671", "S#43542", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39672", "S#43543", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39676", "S#43544", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39673", "S#43545", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39678", "S#43546", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39679", "S#43547", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39674", "S#43548", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39677", "S#43549", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39681", "S#43550", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39680", "S#43551", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39675", "S#43552", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39682", "S#43553", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39683", "S#43554", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39684", "S#43555", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39686", "VARMAP-UNIQUE-EL-VAR-WRT-VARS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0649", "f39685", "S#43556", 3, 2, false);
        return (SubLObject)module0649.NIL;
    }
    
    public static SubLObject f39688() {
        module0649.$g5055$ = SubLFiles.defconstant("S#43557", (SubLObject)module0649.$ic0$);
        module0649.$g5056$ = SubLFiles.defconstant("S#43558", (SubLObject)module0649.$ic36$);
        module0649.$g5057$ = SubLFiles.defconstant("S#43559", (SubLObject)module0649.$ic92$);
        return (SubLObject)module0649.NIL;
    }
    
    public static SubLObject f39689() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0649.$g5055$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0649.$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0649.$ic8$);
        Structures.def_csetf((SubLObject)module0649.$ic9$, (SubLObject)module0649.$ic10$);
        Structures.def_csetf((SubLObject)module0649.$ic11$, (SubLObject)module0649.$ic12$);
        Structures.def_csetf((SubLObject)module0649.$ic13$, (SubLObject)module0649.$ic14$);
        Equality.identity((SubLObject)module0649.$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0649.$g5055$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0649.$ic23$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0649.$g5056$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0649.$ic43$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0649.$ic44$);
        Structures.def_csetf((SubLObject)module0649.$ic45$, (SubLObject)module0649.$ic46$);
        Structures.def_csetf((SubLObject)module0649.$ic47$, (SubLObject)module0649.$ic48$);
        Structures.def_csetf((SubLObject)module0649.$ic49$, (SubLObject)module0649.$ic50$);
        Structures.def_csetf((SubLObject)module0649.$ic51$, (SubLObject)module0649.$ic52$);
        Structures.def_csetf((SubLObject)module0649.$ic53$, (SubLObject)module0649.$ic54$);
        Equality.identity((SubLObject)module0649.$ic36$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0649.$g5056$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0649.$ic60$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0649.$g5057$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0649.$ic99$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0649.$ic100$);
        Structures.def_csetf((SubLObject)module0649.$ic101$, (SubLObject)module0649.$ic102$);
        Structures.def_csetf((SubLObject)module0649.$ic103$, (SubLObject)module0649.$ic104$);
        Structures.def_csetf((SubLObject)module0649.$ic105$, (SubLObject)module0649.$ic106$);
        Structures.def_csetf((SubLObject)module0649.$ic107$, (SubLObject)module0649.$ic108$);
        Structures.def_csetf((SubLObject)module0649.$ic109$, (SubLObject)module0649.$ic110$);
        Structures.def_csetf((SubLObject)module0649.$ic111$, (SubLObject)module0649.$ic112$);
        Structures.def_csetf((SubLObject)module0649.$ic113$, (SubLObject)module0649.$ic114$);
        Equality.identity((SubLObject)module0649.$ic92$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0649.$g5057$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0649.$ic121$));
        module0002.f38((SubLObject)module0649.$ic162$);
        return (SubLObject)module0649.NIL;
    }
    
    public void declareFunctions() {
        f39687();
    }
    
    public void initializeVariables() {
        f39688();
    }
    
    public void runTopLevelForms() {
        f39689();
    }
    
    static {
        me = (SubLFile)new module0649();
        module0649.$g5055$ = null;
        module0649.$g5056$ = null;
        module0649.$g5057$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#43479", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#43480", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9148", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1572", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("VALUES"));
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("QUERY"), (SubLObject)SubLObjectFactory.makeKeyword("LABEL"), (SubLObject)SubLObjectFactory.makeKeyword("VALUES"));
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#43486", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43487", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43488", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#43489", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43490", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43491", "CYC"));
        $ic6$ = SubLObjectFactory.makeSymbol("S#43495", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#43485", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#43480", "CYC"));
        $ic9$ = SubLObjectFactory.makeSymbol("S#43486", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#43489", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#43487", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#43490", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#43488", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#43491", "CYC");
        $ic15$ = SubLObjectFactory.makeKeyword("QUERY");
        $ic16$ = SubLObjectFactory.makeKeyword("LABEL");
        $ic17$ = SubLObjectFactory.makeKeyword("VALUES");
        $ic18$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic19$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic20$ = SubLObjectFactory.makeSymbol("S#43492", "CYC");
        $ic21$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic22$ = SubLObjectFactory.makeKeyword("END");
        $ic23$ = SubLObjectFactory.makeSymbol("S#43494", "CYC");
        $ic24$ = SubLObjectFactory.makeString("#<ValueTableColumn ");
        $ic25$ = SubLObjectFactory.makeString("~A (~S)~% supported values: ~S");
        $ic26$ = SubLObjectFactory.makeString(">");
        $ic27$ = SubLObjectFactory.makeString("valueTableColumn");
        $ic28$ = SubLObjectFactory.makeString("valueTableQuery");
        $ic29$ = SubLObjectFactory.makeString("valueTableLabel");
        $ic30$ = SubLObjectFactory.makeString("valueTableValues");
        $ic31$ = SubLObjectFactory.makeString("valueTableValue");
        $ic32$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#43560", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43561", "CYC"));
        $ic33$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#43562", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("S#43563", "CYC"));
        $ic34$ = SubLObjectFactory.makeKeyword("RESULT-SET");
        $ic35$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("validQueryResultForTable"));
        $ic36$ = SubLObjectFactory.makeSymbol("S#43481", "CYC");
        $ic37$ = SubLObjectFactory.makeSymbol("S#43482", "CYC");
        $ic38$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1519", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1572", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43564", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43565", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43566", "CYC"));
        $ic39$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ID"), (SubLObject)SubLObjectFactory.makeKeyword("LABEL"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT-COLUMNS"), (SubLObject)SubLObjectFactory.makeKeyword("OUTPUT-COLUMN"), (SubLObject)SubLObjectFactory.makeKeyword("ASSIGNMENTS"));
        $ic40$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#43502", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43503", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43504", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43505", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43506", "CYC"));
        $ic41$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#43507", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43508", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43509", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43510", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43511", "CYC"));
        $ic42$ = SubLObjectFactory.makeSymbol("S#43515", "CYC");
        $ic43$ = SubLObjectFactory.makeSymbol("S#43501", "CYC");
        $ic44$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#43482", "CYC"));
        $ic45$ = SubLObjectFactory.makeSymbol("S#43502", "CYC");
        $ic46$ = SubLObjectFactory.makeSymbol("S#43507", "CYC");
        $ic47$ = SubLObjectFactory.makeSymbol("S#43503", "CYC");
        $ic48$ = SubLObjectFactory.makeSymbol("S#43508", "CYC");
        $ic49$ = SubLObjectFactory.makeSymbol("S#43504", "CYC");
        $ic50$ = SubLObjectFactory.makeSymbol("S#43509", "CYC");
        $ic51$ = SubLObjectFactory.makeSymbol("S#43505", "CYC");
        $ic52$ = SubLObjectFactory.makeSymbol("S#43510", "CYC");
        $ic53$ = SubLObjectFactory.makeSymbol("S#43506", "CYC");
        $ic54$ = SubLObjectFactory.makeSymbol("S#43511", "CYC");
        $ic55$ = SubLObjectFactory.makeKeyword("ID");
        $ic56$ = SubLObjectFactory.makeKeyword("INPUT-COLUMNS");
        $ic57$ = SubLObjectFactory.makeKeyword("OUTPUT-COLUMN");
        $ic58$ = SubLObjectFactory.makeKeyword("ASSIGNMENTS");
        $ic59$ = SubLObjectFactory.makeSymbol("S#43512", "CYC");
        $ic60$ = SubLObjectFactory.makeSymbol("S#43514", "CYC");
        $ic61$ = SubLObjectFactory.makeString("#<ValueTable ");
        $ic62$ = SubLObjectFactory.makeString("~S (~A)~%");
        $ic63$ = SubLObjectFactory.makeString(" Input Columns: ");
        $ic64$ = SubLObjectFactory.makeString("    ~S~%");
        $ic65$ = SubLObjectFactory.makeString(" Output Column: ");
        $ic66$ = SubLObjectFactory.makeString(" Existing Assignments: ");
        $ic67$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic68$ = SubLObjectFactory.makeSymbol("S#12263", "CYC");
        $ic69$ = SubLObjectFactory.makeString("valueTable");
        $ic70$ = SubLObjectFactory.makeString("valueTableId");
        $ic71$ = SubLObjectFactory.makeString("valueTableInputColumns");
        $ic72$ = SubLObjectFactory.makeString("valueTableOutputColumns");
        $ic73$ = SubLObjectFactory.makeString("valueTableAssignments");
        $ic74$ = SubLObjectFactory.makeString("valueTableAssignment");
        $ic75$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#43567", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43568", "CYC"));
        $ic76$ = SubLObjectFactory.makeString("valueTableAssignmentSources");
        $ic77$ = SubLObjectFactory.makeString("valueTableAssignmentTuple");
        $ic78$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9148", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"));
        $ic79$ = SubLObjectFactory.makeString("valueTableAssignmentTargets");
        $ic80$ = SubLObjectFactory.makeKeyword("INPUT-QUERIES");
        $ic81$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("valueTableSourceQueries"));
        $ic82$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INPUT-QUERIES"));
        $ic83$ = SubLObjectFactory.makeKeyword("OUTPUT-QUERY");
        $ic84$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("valueTableTargetQuery"));
        $ic85$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OUTPUT-QUERY"));
        $ic86$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?SOURCES"), (SubLObject)SubLObjectFactory.makeSymbol("?TARGETS"));
        $ic87$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("queryResultsCombineInTable"));
        $ic88$ = SubLObjectFactory.makeSymbol("?SOURCES");
        $ic89$ = SubLObjectFactory.makeSymbol("?TARGETS");
        $ic90$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#43567", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43568", "CYC"));
        $ic91$ = SubLObjectFactory.makeSymbol("REST");
        $ic92$ = SubLObjectFactory.makeSymbol("S#43483", "CYC");
        $ic93$ = SubLObjectFactory.makeSymbol("S#43484", "CYC");
        $ic94$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1519", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43569", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43570", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43571", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43572", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43573", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43566", "CYC"));
        $ic95$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ID"), (SubLObject)SubLObjectFactory.makeKeyword("SOURCE-QUERY"), (SubLObject)SubLObjectFactory.makeKeyword("TARGET-QUERY"), (SubLObject)SubLObjectFactory.makeKeyword("SOURCE-VARIABLES"), (SubLObject)SubLObjectFactory.makeKeyword("TARGET-VARIABLES"), (SubLObject)SubLObjectFactory.makeKeyword("INCOMPATIBLES"), (SubLObject)SubLObjectFactory.makeKeyword("ASSIGNMENTS"));
        $ic96$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#43523", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43524", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43525", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43526", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43527", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43528", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43529", "CYC"));
        $ic97$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#43530", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43531", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43532", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43533", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43534", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43535", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43536", "CYC"));
        $ic98$ = SubLObjectFactory.makeSymbol("S#43540", "CYC");
        $ic99$ = SubLObjectFactory.makeSymbol("S#43522", "CYC");
        $ic100$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#43484", "CYC"));
        $ic101$ = SubLObjectFactory.makeSymbol("S#43523", "CYC");
        $ic102$ = SubLObjectFactory.makeSymbol("S#43530", "CYC");
        $ic103$ = SubLObjectFactory.makeSymbol("S#43524", "CYC");
        $ic104$ = SubLObjectFactory.makeSymbol("S#43531", "CYC");
        $ic105$ = SubLObjectFactory.makeSymbol("S#43525", "CYC");
        $ic106$ = SubLObjectFactory.makeSymbol("S#43532", "CYC");
        $ic107$ = SubLObjectFactory.makeSymbol("S#43526", "CYC");
        $ic108$ = SubLObjectFactory.makeSymbol("S#43533", "CYC");
        $ic109$ = SubLObjectFactory.makeSymbol("S#43527", "CYC");
        $ic110$ = SubLObjectFactory.makeSymbol("S#43534", "CYC");
        $ic111$ = SubLObjectFactory.makeSymbol("S#43528", "CYC");
        $ic112$ = SubLObjectFactory.makeSymbol("S#43535", "CYC");
        $ic113$ = SubLObjectFactory.makeSymbol("S#43529", "CYC");
        $ic114$ = SubLObjectFactory.makeSymbol("S#43536", "CYC");
        $ic115$ = SubLObjectFactory.makeKeyword("SOURCE-QUERY");
        $ic116$ = SubLObjectFactory.makeKeyword("TARGET-QUERY");
        $ic117$ = SubLObjectFactory.makeKeyword("SOURCE-VARIABLES");
        $ic118$ = SubLObjectFactory.makeKeyword("TARGET-VARIABLES");
        $ic119$ = SubLObjectFactory.makeKeyword("INCOMPATIBLES");
        $ic120$ = SubLObjectFactory.makeSymbol("S#43537", "CYC");
        $ic121$ = SubLObjectFactory.makeSymbol("S#43539", "CYC");
        $ic122$ = SubLObjectFactory.makeString("#<VariableMappingTable ");
        $ic123$ = SubLObjectFactory.makeString("~A for ~A -> ~A~%");
        $ic124$ = SubLObjectFactory.makeString("anonymous");
        $ic125$ = SubLObjectFactory.makeString("no source");
        $ic126$ = SubLObjectFactory.makeString("no target");
        $ic127$ = SubLObjectFactory.makeString(" Source Variables: ~A~%");
        $ic128$ = SubLObjectFactory.makeString(" Target Variables: ~A~%");
        $ic129$ = SubLObjectFactory.makeString(" Incompatibilities (source view): ~%");
        $ic130$ = SubLObjectFactory.makeString("null dictionary~%");
        $ic131$ = SubLObjectFactory.makeString(" Current Assignments: ~A~%");
        $ic132$ = SubLObjectFactory.makeString("varMapTable");
        $ic133$ = SubLObjectFactory.makeString("varMapTableId");
        $ic134$ = SubLObjectFactory.makeString("varMapSourceQuery");
        $ic135$ = SubLObjectFactory.makeString("varMapTargetQuery");
        $ic136$ = SubLObjectFactory.makeString("varMapSourceVariables");
        $ic137$ = SubLObjectFactory.makeString("varMapTargetVariables");
        $ic138$ = SubLObjectFactory.makeString("varMapIncompatibles");
        $ic139$ = SubLObjectFactory.makeString("varMapIncompatible");
        $ic140$ = SubLObjectFactory.makeString("varMapSourceVariable");
        $ic141$ = SubLObjectFactory.makeString("varMapAssignments");
        $ic142$ = SubLObjectFactory.makeString("varMapAssignment");
        $ic143$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#43574", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43575", "CYC"));
        $ic144$ = SubLObjectFactory.makeString("varMapTargetVariable");
        $ic145$ = SubLObjectFactory.makeSymbol("S#12629", "CYC");
        $ic146$ = SubLObjectFactory.makeKeyword("SOURCE");
        $ic147$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("variableMappingTableSourceFormula-QuerySpec"));
        $ic148$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SOURCE"));
        $ic149$ = SubLObjectFactory.makeKeyword("TARGET");
        $ic150$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("variableMappingTableTargetFormula-QuerySpec"));
        $ic151$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TARGET"));
        $ic152$ = SubLObjectFactory.makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic153$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#43576", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43577", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43578", "CYC"));
        $ic154$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#43579", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43580", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43581", "CYC"));
        $ic155$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?SOURCE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("?TARGET-VAR"));
        $ic156$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("querySpecVariablesUnifyInTable-WorkaroundPred"));
        $ic157$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("AnalysisOutputBindingsForVarFn")), (SubLObject)SubLObjectFactory.makeSymbol("?SOURCE-VAR"));
        $ic158$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("AnalysisInputBindingsForVarFn")), (SubLObject)SubLObjectFactory.makeSymbol("?TARGET-VAR"));
        $ic159$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("querySpecVariablesUnifyInTable"));
        $ic160$ = SubLObjectFactory.makeSymbol("?SOURCE-VAR");
        $ic161$ = SubLObjectFactory.makeSymbol("?TARGET-VAR");
        $ic162$ = SubLObjectFactory.makeSymbol("VARMAP-UNIQUE-EL-VAR-WRT-VARS");
        $ic163$ = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
    }
    
    public static final class $sX43479_native extends SubLStructNative
    {
        public SubLObject $query;
        public SubLObject $label;
        public SubLObject $values;
        private static final SubLStructDeclNative structDecl;
        
        public $sX43479_native() {
            this.$query = (SubLObject)CommonSymbols.NIL;
            this.$label = (SubLObject)CommonSymbols.NIL;
            this.$values = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX43479_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$query;
        }
        
        public SubLObject getField3() {
            return this.$label;
        }
        
        public SubLObject getField4() {
            return this.$values;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$query = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$label = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$values = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX43479_native.class, module0649.$ic0$, module0649.$ic1$, module0649.$ic2$, module0649.$ic3$, new String[] { "$query", "$label", "$values" }, module0649.$ic4$, module0649.$ic5$, module0649.$ic6$);
        }
    }
    
    public static final class $f39613$UnaryFunction extends UnaryFunction
    {
        public $f39613$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#43480"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0649.f39613(var3);
        }
    }
    
    public static final class $sX43481_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $label;
        public SubLObject $input_columns;
        public SubLObject $output_column;
        public SubLObject $assignments;
        private static final SubLStructDeclNative structDecl;
        
        public $sX43481_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$label = (SubLObject)CommonSymbols.NIL;
            this.$input_columns = (SubLObject)CommonSymbols.NIL;
            this.$output_column = (SubLObject)CommonSymbols.NIL;
            this.$assignments = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX43481_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$id;
        }
        
        public SubLObject getField3() {
            return this.$label;
        }
        
        public SubLObject getField4() {
            return this.$input_columns;
        }
        
        public SubLObject getField5() {
            return this.$output_column;
        }
        
        public SubLObject getField6() {
            return this.$assignments;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$label = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$input_columns = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$output_column = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$assignments = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX43481_native.class, module0649.$ic36$, module0649.$ic37$, module0649.$ic38$, module0649.$ic39$, new String[] { "$id", "$label", "$input_columns", "$output_column", "$assignments" }, module0649.$ic40$, module0649.$ic41$, module0649.$ic42$);
        }
    }
    
    public static final class $f39630$UnaryFunction extends UnaryFunction
    {
        public $f39630$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#43482"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0649.f39630(var3);
        }
    }
    
    public static final class $sX43483_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $source_query;
        public SubLObject $target_query;
        public SubLObject $source_variables;
        public SubLObject $target_variables;
        public SubLObject $incompatibles;
        public SubLObject $assignments;
        private static final SubLStructDeclNative structDecl;
        
        public $sX43483_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$source_query = (SubLObject)CommonSymbols.NIL;
            this.$target_query = (SubLObject)CommonSymbols.NIL;
            this.$source_variables = (SubLObject)CommonSymbols.NIL;
            this.$target_variables = (SubLObject)CommonSymbols.NIL;
            this.$incompatibles = (SubLObject)CommonSymbols.NIL;
            this.$assignments = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX43483_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$id;
        }
        
        public SubLObject getField3() {
            return this.$source_query;
        }
        
        public SubLObject getField4() {
            return this.$target_query;
        }
        
        public SubLObject getField5() {
            return this.$source_variables;
        }
        
        public SubLObject getField6() {
            return this.$target_variables;
        }
        
        public SubLObject getField7() {
            return this.$incompatibles;
        }
        
        public SubLObject getField8() {
            return this.$assignments;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$source_query = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$target_query = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$source_variables = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$target_variables = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$incompatibles = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$assignments = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX43483_native.class, module0649.$ic92$, module0649.$ic93$, module0649.$ic94$, module0649.$ic95$, new String[] { "$id", "$source_query", "$target_query", "$source_variables", "$target_variables", "$incompatibles", "$assignments" }, module0649.$ic96$, module0649.$ic97$, module0649.$ic98$);
        }
    }
    
    public static final class $f39652$UnaryFunction extends UnaryFunction
    {
        public $f39652$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#43484"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0649.f39652(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0649.class
	Total time: 2902 ms
	
	Decompiled with Procyon 0.5.32.
*/