package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0727 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0727";
    public static final String myFingerPrint = "9709e7d3d966034d339936172e000cdbf8ef64753a616dfa4807a41dc263a8e4";
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLString $ic9$;
    private static final SubLList $ic10$;
    private static final SubLList $ic11$;
    private static final SubLString $ic12$;
    private static final SubLList $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    private static final SubLList $ic16$;
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
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLList $ic34$;
    private static final SubLList $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLString $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLList $ic40$;
    private static final SubLString $ic41$;
    private static final SubLList $ic42$;
    private static final SubLList $ic43$;
    private static final SubLList $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLString $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLString $ic48$;
    private static final SubLList $ic49$;
    private static final SubLList $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLString $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLString $ic54$;
    private static final SubLList $ic55$;
    private static final SubLList $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLString $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLString $ic60$;
    private static final SubLList $ic61$;
    private static final SubLList $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLString $ic64$;
    private static final SubLList $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLString $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLString $ic70$;
    private static final SubLList $ic71$;
    private static final SubLList $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLString $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLString $ic76$;
    private static final SubLString $ic77$;
    private static final SubLString $ic78$;
    private static final SubLString $ic79$;
    private static final SubLString $ic80$;
    private static final SubLString $ic81$;
    private static final SubLString $ic82$;
    private static final SubLString $ic83$;
    private static final SubLString $ic84$;
    
    public static SubLObject f44386(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        assert NIL != Types.keywordp(var1) : var1;
        assert NIL != f44387(var2) : var2;
        final SubLObject var3 = (NIL != var2) ? var2 : f44388((SubLObject)UNPROVIDED);
        final SubLObject var4 = (SubLObject)ConsesLow.list(var1, var3);
        return var4;
    }
    
    public static SubLObject f44389(final SubLObject var5) {
        return conses_high.second(var5);
    }
    
    public static SubLObject f44390(final SubLObject var5) {
        return Equality.eq(var5.first(), (SubLObject)$ic3$);
    }
    
    public static SubLObject f44391(final SubLObject var5) {
        return Equality.eq(var5.first(), (SubLObject)$ic4$);
    }
    
    public static SubLObject f44388(SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        if (NIL != module0035.f2013(var6)) {
            return var6;
        }
        return f44392((SubLObject)ConsesLow.list((SubLObject)$ic5$, (SubLObject)T, (SubLObject)$ic6$, (SubLObject)T));
    }
    
    public static SubLObject f44387(final SubLObject var5) {
        return f44393(var5);
    }
    
    public static SubLObject f44394(SubLObject var2) {
        assert NIL != f44387(var2) : var2;
        var2 = conses_high.putf(var2, (SubLObject)$ic5$, (SubLObject)T);
        return var2;
    }
    
    public static SubLObject f44395(final SubLObject var2) {
        return conses_high.getf(var2, (SubLObject)$ic5$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f44396(SubLObject var2) {
        assert NIL != f44387(var2) : var2;
        var2 = conses_high.putf(var2, (SubLObject)$ic18$, (SubLObject)T);
        return var2;
    }
    
    public static SubLObject f44397(final SubLObject var2) {
        return conses_high.getf(var2, (SubLObject)$ic18$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f44398(SubLObject var2) {
        assert NIL != f44387(var2) : var2;
        var2 = conses_high.putf(var2, (SubLObject)$ic21$, (SubLObject)T);
        return var2;
    }
    
    public static SubLObject f44399(final SubLObject var2) {
        return conses_high.getf(var2, (SubLObject)$ic21$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f44400(SubLObject var2) {
        assert NIL != f44387(var2) : var2;
        var2 = conses_high.putf(var2, (SubLObject)$ic24$, (SubLObject)T);
        return var2;
    }
    
    public static SubLObject f44401(final SubLObject var2) {
        return conses_high.getf(var2, (SubLObject)$ic24$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f44402(SubLObject var2) {
        assert NIL != f44387(var2) : var2;
        var2 = conses_high.putf(var2, (SubLObject)$ic27$, (SubLObject)T);
        return var2;
    }
    
    public static SubLObject f44403(final SubLObject var2) {
        return conses_high.getf(var2, (SubLObject)$ic27$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f44404(SubLObject var2) {
        assert NIL != f44387(var2) : var2;
        var2 = conses_high.putf(var2, (SubLObject)$ic6$, (SubLObject)T);
        return var2;
    }
    
    public static SubLObject f44405(final SubLObject var2) {
        return conses_high.getf(var2, (SubLObject)$ic6$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f44392(SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        if (NIL != f44393(var6)) {
            return var6;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44393(final SubLObject var7) {
        return module0035.f2327(var7);
    }
    
    public static SubLObject f44406(final SubLObject var8, final SubLObject var9) {
        SubLObject var11;
        final SubLObject var10 = var11 = var8.rest();
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var11, var10, (SubLObject)$ic35$);
        var12 = var11.first();
        var11 = var11.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var11, var10, (SubLObject)$ic35$);
        var13 = var11.first();
        var11 = var11.rest();
        if (NIL == var11) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic36$, var12, (SubLObject)$ic5$, var13);
        }
        cdestructuring_bind.cdestructuring_bind_error(var10, (SubLObject)$ic35$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44407(final SubLObject var12) {
        assert NIL != f44393(var12) : var12;
        return conses_high.getf(var12, (SubLObject)$ic5$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f44408(final SubLObject var8, final SubLObject var9) {
        SubLObject var11;
        final SubLObject var10 = var11 = var8.rest();
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var11, var10, (SubLObject)$ic44$);
        var12 = var11.first();
        var11 = var11.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var11, var10, (SubLObject)$ic44$);
        var13 = var11.first();
        var11 = var11.rest();
        if (NIL == var11) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic36$, var12, (SubLObject)$ic6$, var13);
        }
        cdestructuring_bind.cdestructuring_bind_error(var10, (SubLObject)$ic44$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44409(final SubLObject var12) {
        assert NIL != f44393(var12) : var12;
        return conses_high.getf(var12, (SubLObject)$ic6$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f44410(final SubLObject var8, final SubLObject var9) {
        SubLObject var11;
        final SubLObject var10 = var11 = var8.rest();
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var11, var10, (SubLObject)$ic50$);
        var12 = var11.first();
        var11 = var11.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var11, var10, (SubLObject)$ic50$);
        var13 = var11.first();
        var11 = var11.rest();
        if (NIL == var11) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic36$, var12, (SubLObject)$ic18$, var13);
        }
        cdestructuring_bind.cdestructuring_bind_error(var10, (SubLObject)$ic50$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44411(final SubLObject var12) {
        assert NIL != f44393(var12) : var12;
        return conses_high.getf(var12, (SubLObject)$ic18$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f44412(final SubLObject var8, final SubLObject var9) {
        SubLObject var11;
        final SubLObject var10 = var11 = var8.rest();
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var11, var10, (SubLObject)$ic56$);
        var12 = var11.first();
        var11 = var11.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var11, var10, (SubLObject)$ic56$);
        var13 = var11.first();
        var11 = var11.rest();
        if (NIL == var11) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic36$, var12, (SubLObject)$ic21$, var13);
        }
        cdestructuring_bind.cdestructuring_bind_error(var10, (SubLObject)$ic56$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44413(final SubLObject var12) {
        assert NIL != f44393(var12) : var12;
        return conses_high.getf(var12, (SubLObject)$ic21$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f44414(final SubLObject var8, final SubLObject var9) {
        SubLObject var11;
        final SubLObject var10 = var11 = var8.rest();
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var11, var10, (SubLObject)$ic62$);
        var12 = var11.first();
        var11 = var11.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var11, var10, (SubLObject)$ic62$);
        var13 = var11.first();
        var11 = var11.rest();
        if (NIL == var11) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic36$, var12, (SubLObject)$ic24$, var13);
        }
        cdestructuring_bind.cdestructuring_bind_error(var10, (SubLObject)$ic62$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44415(final SubLObject var8, final SubLObject var9) {
        SubLObject var11;
        final SubLObject var10 = var11 = var8.rest();
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var11, var10, (SubLObject)$ic65$);
        var12 = var11.first();
        var11 = var11.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var11, var10, (SubLObject)$ic65$);
        var13 = var11.first();
        var11 = var11.rest();
        if (NIL == var11) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic66$, var12, (SubLObject)$ic24$, reader.bq_cons(var13, conses_high.getf(var12, (SubLObject)$ic24$, (SubLObject)UNPROVIDED)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var10, (SubLObject)$ic65$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44416(final SubLObject var12) {
        assert NIL != f44393(var12) : var12;
        return conses_high.getf(var12, (SubLObject)$ic24$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f44417(final SubLObject var8, final SubLObject var9) {
        SubLObject var11;
        final SubLObject var10 = var11 = var8.rest();
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var11, var10, (SubLObject)$ic72$);
        var12 = var11.first();
        var11 = var11.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var11, var10, (SubLObject)$ic72$);
        var13 = var11.first();
        var11 = var11.rest();
        if (NIL == var11) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic36$, var12, (SubLObject)$ic27$, var13);
        }
        cdestructuring_bind.cdestructuring_bind_error(var10, (SubLObject)$ic72$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44418(final SubLObject var12) {
        assert NIL != f44393(var12) : var12;
        return conses_high.getf(var12, (SubLObject)$ic27$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f44419(final SubLObject var32) {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        SubLObject var34 = (SubLObject)NIL;
        final SubLObject var35 = (SubLObject)NIL;
        SubLObject var36 = (SubLObject)NIL;
        try {
            var36 = streams_high.make_private_string_output_stream();
            final SubLObject var37 = module0587.$g4457$.currentBinding(var33);
            try {
                module0587.$g4457$.bind(var36, var33);
                try {
                    final SubLObject var37_38 = module0601.$g4652$.currentBinding(var33);
                    final SubLObject var38 = module0601.$g4654$.currentBinding(var33);
                    try {
                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var33), module0601.$g4652$.getDynamicValue(var33)), var33);
                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var33), var33);
                        module0601.f36758((SubLObject)$ic77$, var35, (SubLObject)NIL, (SubLObject)NIL);
                        try {
                            final SubLObject var37_39 = module0601.$g4652$.currentBinding(var33);
                            final SubLObject var39_41 = module0601.$g4654$.currentBinding(var33);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var33), module0601.$g4652$.getDynamicValue(var33)), var33);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var33), var33);
                                module0601.f36758((SubLObject)$ic78$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                cycml_generator_oc.f51056(f44407(var32));
                            }
                            finally {
                                module0601.$g4654$.rebind(var39_41, var33);
                                module0601.$g4652$.rebind(var37_39, var33);
                            }
                        }
                        finally {
                            final SubLObject var37_40 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var33);
                                module0601.f36746();
                                module0601.f36760((SubLObject)$ic78$);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var37_40, var33);
                            }
                        }
                        if (NIL != f44411(var32)) {
                            try {
                                final SubLObject var37_41 = module0601.$g4652$.currentBinding(var33);
                                final SubLObject var39_42 = module0601.$g4654$.currentBinding(var33);
                                try {
                                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var33), module0601.$g4652$.getDynamicValue(var33)), var33);
                                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var33), var33);
                                    module0601.f36758((SubLObject)$ic79$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                    module0601.f36761(f44411(var32), (SubLObject)UNPROVIDED);
                                }
                                finally {
                                    module0601.$g4654$.rebind(var39_42, var33);
                                    module0601.$g4652$.rebind(var37_41, var33);
                                }
                            }
                            finally {
                                final SubLObject var37_42 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var33);
                                    module0601.f36746();
                                    module0601.f36760((SubLObject)$ic79$);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var37_42, var33);
                                }
                            }
                        }
                        if (NIL != f44413(var32)) {
                            f44420(f44413(var32));
                        }
                        if (NIL != f44416(var32)) {
                            try {
                                final SubLObject var37_43 = module0601.$g4652$.currentBinding(var33);
                                final SubLObject var39_43 = module0601.$g4654$.currentBinding(var33);
                                try {
                                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var33), module0601.$g4652$.getDynamicValue(var33)), var33);
                                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var33), var33);
                                    module0601.f36758((SubLObject)$ic80$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                    SubLObject var39 = f44416(var32);
                                    SubLObject var40 = (SubLObject)NIL;
                                    var40 = var39.first();
                                    while (NIL != var39) {
                                        cycml_generator_oc.f51056(var40);
                                        var39 = var39.rest();
                                        var40 = var39.first();
                                    }
                                }
                                finally {
                                    module0601.$g4654$.rebind(var39_43, var33);
                                    module0601.$g4652$.rebind(var37_43, var33);
                                }
                            }
                            finally {
                                final SubLObject var37_44 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var33);
                                    module0601.f36746();
                                    module0601.f36760((SubLObject)$ic80$);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var37_44, var33);
                                }
                            }
                        }
                        if (NIL != f44418(var32)) {
                            try {
                                final SubLObject var37_45 = module0601.$g4652$.currentBinding(var33);
                                final SubLObject var39_44 = module0601.$g4654$.currentBinding(var33);
                                try {
                                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var33), module0601.$g4652$.getDynamicValue(var33)), var33);
                                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var33), var33);
                                    module0601.f36758((SubLObject)$ic81$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                    SubLObject var39 = f44418(var32);
                                    SubLObject var41 = (SubLObject)NIL;
                                    var41 = var39.first();
                                    while (NIL != var39) {
                                        cycml_generator_oc.f51056(var41);
                                        var39 = var39.rest();
                                        var41 = var39.first();
                                    }
                                }
                                finally {
                                    module0601.$g4654$.rebind(var39_44, var33);
                                    module0601.$g4652$.rebind(var37_45, var33);
                                }
                            }
                            finally {
                                final SubLObject var37_46 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var33);
                                    module0601.f36746();
                                    module0601.f36760((SubLObject)$ic81$);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var37_46, var33);
                                }
                            }
                        }
                    }
                    finally {
                        module0601.$g4654$.rebind(var38, var33);
                        module0601.$g4652$.rebind(var37_38, var33);
                    }
                }
                finally {
                    final SubLObject var37_47 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var33);
                        module0601.f36746();
                        module0601.f36760((SubLObject)$ic77$);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var37_47, var33);
                    }
                }
            }
            finally {
                module0587.$g4457$.rebind(var37, var33);
            }
            var34 = streams_high.get_output_stream_string(var36);
        }
        finally {
            final SubLObject var42 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var33);
                streams_high.close(var36, (SubLObject)UNPROVIDED);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var42, var33);
            }
        }
        return var34;
    }
    
    public static SubLObject f44420(final SubLObject var55) {
        final SubLThread var56 = SubLProcess.currentSubLThread();
        final SubLObject var57 = module0601.$g4652$.currentBinding(var56);
        final SubLObject var58 = module0601.$g4654$.currentBinding(var56);
        try {
            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var56), module0601.$g4652$.getDynamicValue(var56)), var56);
            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var56), var56);
            module0601.f36758((SubLObject)$ic82$, (SubLObject)ConsesLow.list((SubLObject)$ic83$, (SubLObject)$ic84$), (SubLObject)T, (SubLObject)NIL);
        }
        finally {
            module0601.$g4654$.rebind(var58, var56);
            module0601.$g4652$.rebind(var57, var56);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44421(final SubLObject var56) {
        return Sequences.remove_duplicates(Mapping.mapcar((SubLObject)$ic39$, var56), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f44422(final SubLObject var5) {
        return Types.listp(var5);
    }
    
    public static SubLObject f44423() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0727", "f44386", "NEW-NL-OUTPUT-SPEC", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0727", "f44389", "S#48561", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0727", "f44390", "S#48562", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0727", "f44391", "S#48563", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0727", "f44388", "NEW-NL-INTERPRETATION-SPEC", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0727", "f44387", "NL-INTERPRETATION-SPEC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0727", "f44394", "NL-INTERP-SPEC-REQUEST-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0727", "f44395", "NL-INTERP-SPEC-RETURN-CYCL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0727", "f44396", "NL-INTERP-SPEC-REQUEST-WEIGHT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0727", "f44397", "NL-INTERP-SPEC-RETURN-WEIGHT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0727", "f44398", "NL-INTERP-SPEC-REQUEST-JUSTIFICATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0727", "f44399", "NL-INTERP-SPEC-RETURN-JUSTIFICATION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0727", "f44400", "NL-INTERP-SPEC-REQUEST-PHRASE-TYPES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0727", "f44401", "NL-INTERP-SPEC-RETURN-PHRASE-TYPES?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0727", "f44402", "NL-INTERP-SPEC-REQUEST-HEAD-INFLECTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0727", "f44403", "NL-INTERP-SPEC-RETURN-HEAD-INFLECTIONS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0727", "f44404", "NL-INTERP-SPEC-REQUEST-PRAGMATICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0727", "f44405", "NL-INTERP-SPEC-RETURN-PRAGMATICS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0727", "f44392", "NEW-NL-INTERPRETATION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0727", "f44393", "NL-INTERPRETATION-P", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0727", "f44406", "SET-NL-INTERP-CYCL");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0727", "f44407", "GET-NL-INTERP-CYCL", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0727", "f44408", "SET-NL-INTERP-PRAGMATICS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0727", "f44409", "GET-NL-INTERP-PRAGMATICS", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0727", "f44410", "SET-NL-INTERP-WEIGHT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0727", "f44411", "GET-NL-INTERP-WEIGHT", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0727", "f44412", "SET-NL-INTERP-JUSTIFICATION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0727", "f44413", "GET-NL-INTERP-JUSTIFICATION", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0727", "f44414", "SET-NL-INTERP-PHRASE-TYPES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0727", "f44415", "ADD-NL-INTERP-PHRASE-TYPE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0727", "f44416", "GET-NL-INTERP-PHRASE-TYPES", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0727", "f44417", "SET-NL-INTERP-HEAD-INFLECTIONS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0727", "f44418", "GET-NL-INTERP-HEAD-INFLECTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0727", "f44419", "S#48564", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0727", "f44420", "S#48565", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0727", "f44421", "S#48566", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0727", "f44422", "S#48567", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44424() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44425() {
        module0002.f38((SubLObject)$ic0$);
        module0012.f368((SubLObject)$ic7$, (SubLObject)$ic8$, (SubLObject)$ic9$, (SubLObject)NIL, (SubLObject)$ic10$);
        module0012.f368((SubLObject)$ic2$, (SubLObject)$ic11$, (SubLObject)$ic12$, (SubLObject)NIL, (SubLObject)$ic13$);
        module0012.f368((SubLObject)$ic14$, (SubLObject)$ic15$, (SubLObject)$ic12$, (SubLObject)$ic16$, (SubLObject)NIL);
        module0012.f368((SubLObject)$ic17$, (SubLObject)$ic15$, (SubLObject)$ic12$, (SubLObject)NIL, (SubLObject)NIL);
        module0012.f368((SubLObject)$ic19$, (SubLObject)$ic15$, (SubLObject)$ic12$, (SubLObject)$ic16$, (SubLObject)NIL);
        module0012.f368((SubLObject)$ic20$, (SubLObject)$ic15$, (SubLObject)$ic12$, (SubLObject)NIL, (SubLObject)NIL);
        module0012.f368((SubLObject)$ic22$, (SubLObject)$ic15$, (SubLObject)$ic12$, (SubLObject)$ic16$, (SubLObject)NIL);
        module0012.f368((SubLObject)$ic23$, (SubLObject)$ic15$, (SubLObject)$ic12$, (SubLObject)NIL, (SubLObject)NIL);
        module0012.f368((SubLObject)$ic25$, (SubLObject)$ic15$, (SubLObject)$ic12$, (SubLObject)$ic16$, (SubLObject)NIL);
        module0012.f368((SubLObject)$ic26$, (SubLObject)$ic15$, (SubLObject)$ic12$, (SubLObject)NIL, (SubLObject)NIL);
        module0012.f368((SubLObject)$ic28$, (SubLObject)$ic15$, (SubLObject)$ic12$, (SubLObject)$ic16$, (SubLObject)NIL);
        module0012.f368((SubLObject)$ic29$, (SubLObject)$ic15$, (SubLObject)$ic12$, (SubLObject)NIL, (SubLObject)NIL);
        module0012.f368((SubLObject)$ic30$, (SubLObject)$ic15$, (SubLObject)$ic12$, (SubLObject)$ic16$, (SubLObject)NIL);
        module0012.f368((SubLObject)$ic31$, (SubLObject)$ic15$, (SubLObject)$ic12$, (SubLObject)NIL, (SubLObject)NIL);
        module0002.f38((SubLObject)$ic32$);
        module0012.f368((SubLObject)$ic33$, (SubLObject)$ic34$, (SubLObject)$ic12$, (SubLObject)NIL, (SubLObject)$ic13$);
        module0012.f375((SubLObject)$ic37$, (SubLObject)$ic35$, (SubLObject)$ic38$);
        module0012.f368((SubLObject)$ic39$, (SubLObject)$ic40$, (SubLObject)$ic41$, (SubLObject)$ic42$, (SubLObject)$ic43$);
        module0012.f375((SubLObject)$ic45$, (SubLObject)$ic44$, (SubLObject)$ic46$);
        module0012.f368((SubLObject)$ic47$, (SubLObject)$ic40$, (SubLObject)$ic48$, (SubLObject)$ic42$, (SubLObject)$ic49$);
        module0012.f375((SubLObject)$ic51$, (SubLObject)$ic50$, (SubLObject)$ic52$);
        module0012.f368((SubLObject)$ic53$, (SubLObject)$ic40$, (SubLObject)$ic54$, (SubLObject)$ic42$, (SubLObject)$ic55$);
        module0012.f375((SubLObject)$ic57$, (SubLObject)$ic56$, (SubLObject)$ic58$);
        module0012.f368((SubLObject)$ic59$, (SubLObject)$ic40$, (SubLObject)$ic60$, (SubLObject)$ic42$, (SubLObject)$ic61$);
        module0012.f375((SubLObject)$ic63$, (SubLObject)$ic62$, (SubLObject)$ic64$);
        module0012.f375((SubLObject)$ic67$, (SubLObject)$ic65$, (SubLObject)$ic68$);
        module0012.f368((SubLObject)$ic69$, (SubLObject)$ic40$, (SubLObject)$ic70$, (SubLObject)$ic42$, (SubLObject)$ic71$);
        module0012.f375((SubLObject)$ic73$, (SubLObject)$ic72$, (SubLObject)$ic74$);
        module0012.f368((SubLObject)$ic75$, (SubLObject)$ic40$, (SubLObject)$ic76$, (SubLObject)$ic42$, (SubLObject)$ic71$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f44423();
    }
    
    public void initializeVariables() {
        f44424();
    }
    
    public void runTopLevelForms() {
        f44425();
    }
    
    static {
        me = (SubLFile)new module0727();
        $ic0$ = makeSymbol("NEW-NL-OUTPUT-SPEC");
        $ic1$ = makeSymbol("KEYWORDP");
        $ic2$ = makeSymbol("NL-INTERPRETATION-SPEC-P");
        $ic3$ = makeKeyword("SUBL");
        $ic4$ = makeKeyword("XML");
        $ic5$ = makeKeyword("CYCL");
        $ic6$ = makeKeyword("PRAGMATICS");
        $ic7$ = makeSymbol("NEW-NL-INTERPRETATION-SPEC");
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#138", "CYC"));
        $ic9$ = makeString("construct a new default NL interpretation specification.  By default, the interpretation-spec will direct\n   the parsers to return only the CycL of the interpretation");
        $ic10$ = ConsesLow.list((SubLObject)makeSymbol("NL-INTERPRETATION-SPEC-P"));
        $ic11$ = ConsesLow.list((SubLObject)makeSymbol("S#671", "CYC"));
        $ic12$ = makeString("");
        $ic13$ = ConsesLow.list((SubLObject)makeSymbol("BOOLEAN"));
        $ic14$ = makeSymbol("NL-INTERP-SPEC-REQUEST-CYCL");
        $ic15$ = ConsesLow.list((SubLObject)makeSymbol("S#48568", "CYC"));
        $ic16$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#48568", "CYC"), (SubLObject)makeSymbol("NL-INTERPRETATION-SPEC-P")));
        $ic17$ = makeSymbol("NL-INTERP-SPEC-RETURN-CYCL?");
        $ic18$ = makeKeyword("WEIGHT");
        $ic19$ = makeSymbol("NL-INTERP-SPEC-REQUEST-WEIGHT");
        $ic20$ = makeSymbol("NL-INTERP-SPEC-RETURN-WEIGHT?");
        $ic21$ = makeKeyword("JUSTIFICATION");
        $ic22$ = makeSymbol("NL-INTERP-SPEC-REQUEST-JUSTIFICATION");
        $ic23$ = makeSymbol("NL-INTERP-SPEC-RETURN-JUSTIFICATION?");
        $ic24$ = makeKeyword("PHRASE-TYPES");
        $ic25$ = makeSymbol("NL-INTERP-SPEC-REQUEST-PHRASE-TYPES");
        $ic26$ = makeSymbol("NL-INTERP-SPEC-RETURN-PHRASE-TYPES?");
        $ic27$ = makeKeyword("INFLECTIONS");
        $ic28$ = makeSymbol("NL-INTERP-SPEC-REQUEST-HEAD-INFLECTIONS");
        $ic29$ = makeSymbol("NL-INTERP-SPEC-RETURN-HEAD-INFLECTIONS?");
        $ic30$ = makeSymbol("NL-INTERP-SPEC-REQUEST-PRAGMATICS");
        $ic31$ = makeSymbol("NL-INTERP-SPEC-RETURN-PRAGMATICS?");
        $ic32$ = makeSymbol("NEW-NL-INTERPRETATION");
        $ic33$ = makeSymbol("NL-INTERPRETATION-P");
        $ic34$ = ConsesLow.list((SubLObject)makeSymbol("S#143", "CYC"));
        $ic35$ = ConsesLow.list((SubLObject)makeSymbol("S#48569", "CYC"), (SubLObject)makeSymbol("S#42702", "CYC"));
        $ic36$ = makeSymbol("S#3634", "CYC");
        $ic37$ = makeSymbol("SET-NL-INTERP-CYCL");
        $ic38$ = makeString("set the CycL value for INTERP to CYCL");
        $ic39$ = makeSymbol("GET-NL-INTERP-CYCL");
        $ic40$ = ConsesLow.list((SubLObject)makeSymbol("S#48569", "CYC"));
        $ic41$ = makeString("Returns the CycL currently specified on INTERP");
        $ic42$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#48569", "CYC"), (SubLObject)makeSymbol("NL-INTERPRETATION-P")));
        $ic43$ = ConsesLow.list((SubLObject)makeSymbol("S#16331", "CYC"));
        $ic44$ = ConsesLow.list((SubLObject)makeSymbol("S#48569", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"));
        $ic45$ = makeSymbol("SET-NL-INTERP-PRAGMATICS");
        $ic46$ = makeString("set the pragmatic features for INTERP to VALUE");
        $ic47$ = makeSymbol("GET-NL-INTERP-PRAGMATICS");
        $ic48$ = makeString("Returns the pragmatic features specified for INTERP, which are each of the form\n   (PRAGMATIC-FEATURE MT)");
        $ic49$ = ConsesLow.list((SubLObject)makeSymbol("LISTP"));
        $ic50$ = ConsesLow.list((SubLObject)makeSymbol("S#48569", "CYC"), (SubLObject)makeSymbol("S#48570", "CYC"));
        $ic51$ = makeSymbol("SET-NL-INTERP-WEIGHT");
        $ic52$ = makeString("set the weight for INTERP to WEIGHT");
        $ic53$ = makeSymbol("GET-NL-INTERP-WEIGHT");
        $ic54$ = makeString("Returns the weight currently specified on INTERP");
        $ic55$ = ConsesLow.list((SubLObject)makeSymbol("S#48571", "CYC"));
        $ic56$ = ConsesLow.list((SubLObject)makeSymbol("S#48569", "CYC"), (SubLObject)makeSymbol("S#14271", "CYC"));
        $ic57$ = makeSymbol("SET-NL-INTERP-JUSTIFICATION");
        $ic58$ = makeString("set the justification for INTERP to JUSTIFICATION");
        $ic59$ = makeSymbol("GET-NL-INTERP-JUSTIFICATION");
        $ic60$ = makeString("Returns the justification currently specified on INTERP");
        $ic61$ = ConsesLow.list((SubLObject)makeSymbol("S#48567", "CYC"));
        $ic62$ = ConsesLow.list((SubLObject)makeSymbol("S#48569", "CYC"), (SubLObject)makeSymbol("S#48572", "CYC"));
        $ic63$ = makeSymbol("SET-NL-INTERP-PHRASE-TYPES");
        $ic64$ = makeString("set the phrase-types for INTERP to PHRASE-TYPES");
        $ic65$ = ConsesLow.list((SubLObject)makeSymbol("S#48569", "CYC"), (SubLObject)makeSymbol("S#48573", "CYC"));
        $ic66$ = makeSymbol("PUTF");
        $ic67$ = makeSymbol("ADD-NL-INTERP-PHRASE-TYPE");
        $ic68$ = makeString("add PHRASE-TYPES to the phrase-types for INTERP");
        $ic69$ = makeSymbol("GET-NL-INTERP-PHRASE-TYPES");
        $ic70$ = makeString("Returns the phrase-types currently specified on INTERP");
        $ic71$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("LIST"), (SubLObject)makeSymbol("CYCL-TERM-P")));
        $ic72$ = ConsesLow.list((SubLObject)makeSymbol("S#48569", "CYC"), (SubLObject)makeSymbol("S#48574", "CYC"));
        $ic73$ = makeSymbol("SET-NL-INTERP-HEAD-INFLECTIONS");
        $ic74$ = makeString("set the inflections (speech-part-predicates) for INTERP to INFLECTIONS");
        $ic75$ = makeSymbol("GET-NL-INTERP-HEAD-INFLECTIONS");
        $ic76$ = makeString("returns the inflections predicates that are used in the head word for this interpretation");
        $ic77$ = makeString("NLInterpretation");
        $ic78$ = makeString("Cycl");
        $ic79$ = makeString("Weight");
        $ic80$ = makeString("PhraseType");
        $ic81$ = makeString("HeadInflection");
        $ic82$ = makeString("justification");
        $ic83$ = makeString("status");
        $ic84$ = makeString("unimplemented");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 288 ms
	
	Decompiled with Procyon 0.5.32.
*/