package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0772 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0772";
    public static final String myFingerPrint = "086e5d5a051561f13fa3a6742070eeb1cf3a6fdf0f4eecebf198052df3c721a2";
    private static SubLSymbol $g6158$;
    private static SubLSymbol $g6159$;
    public static SubLSymbol $g6160$;
    private static SubLSymbol $g6161$;
    private static SubLSymbol $g6162$;
    private static SubLSymbol $g6163$;
    private static SubLSymbol $g6164$;
    private static SubLSymbol $g6165$;
    private static SubLSymbol $g6166$;
    private static SubLSymbol $g6167$;
    private static SubLSymbol $g6168$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLString $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLString $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLList $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLString $ic16$;
    private static final SubLString $ic17$;
    private static final SubLString $ic18$;
    private static final SubLString $ic19$;
    private static final SubLObject $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLString $ic26$;
    private static final SubLList $ic27$;
    private static final SubLObject $ic28$;
    private static final SubLList $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLObject $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLObject $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLString $ic37$;
    private static final SubLString $ic38$;
    private static final SubLString $ic39$;
    private static final SubLString $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLString $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLObject $ic46$;
    private static final SubLObject $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLString $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLList $ic57$;
    private static final SubLString $ic58$;
    private static final SubLString $ic59$;
    private static final SubLString $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLInteger $ic68$;
    private static final SubLString $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLString $ic72$;
    private static final SubLString $ic73$;
    private static final SubLString $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLString $ic76$;
    private static final SubLString $ic77$;
    private static final SubLString $ic78$;
    private static final SubLList $ic79$;
    private static final SubLString $ic80$;
    private static final SubLString $ic81$;
    private static final SubLString $ic82$;
    private static final SubLObject $ic83$;
    private static final SubLObject $ic84$;
    private static final SubLString $ic85$;
    private static final SubLInteger $ic86$;
    private static final SubLString $ic87$;
    private static final SubLString $ic88$;
    private static final SubLString $ic89$;
    private static final SubLString $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLList $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLObject $ic96$;
    private static final SubLString $ic97$;
    private static final SubLString $ic98$;
    private static final SubLString $ic99$;
    private static final SubLString $ic100$;
    private static final SubLString $ic101$;
    private static final SubLString $ic102$;
    private static final SubLString $ic103$;
    private static final SubLString $ic104$;
    private static final SubLString $ic105$;
    private static final SubLString $ic106$;
    private static final SubLList $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLString $ic109$;
    private static final SubLString $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLObject $ic114$;
    private static final SubLObject $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLObject $ic117$;
    private static final SubLObject $ic118$;
    private static final SubLObject $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLObject $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLString $ic123$;
    private static final SubLString $ic124$;
    private static final SubLString $ic125$;
    private static final SubLString $ic126$;
    private static final SubLString $ic127$;
    private static final SubLString $ic128$;
    private static final SubLString $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLObject $ic131$;
    private static final SubLString $ic132$;
    private static final SubLString $ic133$;
    private static final SubLString $ic134$;
    private static final SubLString $ic135$;
    private static final SubLString $ic136$;
    private static final SubLString $ic137$;
    private static final SubLString $ic138$;
    private static final SubLString $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLString $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLObject $ic146$;
    private static final SubLObject $ic147$;
    private static final SubLString $ic148$;
    private static final SubLString $ic149$;
    private static final SubLString $ic150$;
    private static final SubLObject $ic151$;
    private static final SubLObject $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLObject $ic154$;
    private static final SubLString $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLString $ic157$;
    private static final SubLString $ic158$;
    private static final SubLString $ic159$;
    private static final SubLString $ic160$;
    private static final SubLObject $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLSymbol $ic164$;
    private static final SubLSymbol $ic165$;
    private static final SubLObject $ic166$;
    private static final SubLSymbol $ic167$;
    private static final SubLString $ic168$;
    private static final SubLSymbol $ic169$;
    private static final SubLSymbol $ic170$;
    private static final SubLString $ic171$;
    private static final SubLSymbol $ic172$;
    private static final SubLString $ic173$;
    private static final SubLObject $ic174$;
    private static final SubLObject $ic175$;
    private static final SubLObject $ic176$;
    private static final SubLString $ic177$;
    private static final SubLString $ic178$;
    private static final SubLString $ic179$;
    private static final SubLSymbol $ic180$;
    private static final SubLObject $ic181$;
    private static final SubLObject $ic182$;
    private static final SubLSymbol $ic183$;
    private static final SubLSymbol $ic184$;
    private static final SubLSymbol $ic185$;
    
    public static SubLObject f49137(final SubLObject var1, SubLObject var2, SubLObject var3, SubLObject var4, SubLObject var5) {
        if (var2 == UNPROVIDED) {
            var2 = module0579.$g4260$.getDynamicValue();
        }
        if (var3 == UNPROVIDED) {
            var3 = module0579.$g4262$.getDynamicValue();
        }
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)$ic0$;
        }
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)$ic1$;
        }
        final SubLThread var6 = SubLProcess.currentSubLThread();
        assert NIL != module0751.f46980(var5) : var5;
        if ($ic3$ == var5) {
            var5 = module0751.f47142(var1, (SubLObject)$ic4$, var2, var3);
        }
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = module0579.$g4260$.currentBinding(var6);
        final SubLObject var13 = module0579.$g4262$.currentBinding(var6);
        final SubLObject var14 = module0579.$g4259$.currentBinding(var6);
        try {
            module0579.$g4260$.bind(var2, var6);
            module0579.$g4262$.bind(var3, var6);
            module0579.$g4259$.bind(var4, var6);
            SubLObject var15 = (SubLObject)NIL;
            final SubLObject var12_16 = module0579.$g4321$.currentBinding(var6);
            try {
                module0579.$g4321$.bind(module0755.f47380(), var6);
                module0580.f35572();
                try {
                    module0755.f47388();
                    final SubLObject var12_17 = Errors.$continue_cerrorP$.currentBinding(var6);
                    final SubLObject var13_18 = module0578.$g4234$.currentBinding(var6);
                    try {
                        Errors.$continue_cerrorP$.bind((SubLObject)NIL, var6);
                        module0578.$g4234$.bind((SubLObject)T, var6);
                        if (NIL != module0578.f35473()) {
                            final SubLObject var12_18 = module0580.$g4361$.currentBinding(var6);
                            try {
                                module0580.$g4361$.bind((SubLObject)NIL, var6);
                                var6.resetMultipleValues();
                                final SubLObject var12_19 = module0580.$g4362$.currentBinding(var6);
                                try {
                                    module0580.$g4362$.bind(module0580.f35560(), var6);
                                    final SubLObject var16 = var6.secondMultipleValue();
                                    var6.resetMultipleValues();
                                    try {
                                        var6.resetMultipleValues();
                                        final SubLObject var12_20 = module0580.$g4358$.currentBinding(var6);
                                        try {
                                            module0580.$g4358$.bind(module0580.f35544(), var6);
                                            final SubLObject var17 = var6.secondMultipleValue();
                                            var6.resetMultipleValues();
                                            final SubLObject var12_21 = module0580.$g4359$.currentBinding(var6);
                                            try {
                                                module0580.$g4359$.bind(module0580.f35545(), var6);
                                                final SubLObject var18 = module0580.$g4358$.getDynamicValue(var6);
                                                final SubLObject var12_22 = module0034.$g879$.currentBinding(var6);
                                                try {
                                                    module0034.$g879$.bind(var18, var6);
                                                    SubLObject var19 = (SubLObject)NIL;
                                                    if (NIL != var18 && NIL == module0034.f1842(var18)) {
                                                        var19 = module0034.f1869(var18);
                                                        final SubLObject var20 = Threads.current_process();
                                                        if (NIL == var19) {
                                                            module0034.f1873(var18, var20);
                                                        }
                                                        else if (!var19.eql(var20)) {
                                                            Errors.error((SubLObject)$ic5$);
                                                        }
                                                    }
                                                    try {
                                                        final SubLObject var12_23 = module0579.$g4320$.currentBinding(var6);
                                                        try {
                                                            module0579.$g4320$.bind((SubLObject)ConsesLow.cons(module0205.f13144(var1), module0579.$g4320$.getDynamicValue(var6)), var6);
                                                            var6.resetMultipleValues();
                                                            final SubLObject var30_31 = f49138(var1, module0751.f47099(var5, f49139(), (SubLObject)UNPROVIDED));
                                                            final SubLObject var32_33 = var6.secondMultipleValue();
                                                            final SubLObject var34_35 = var6.thirdMultipleValue();
                                                            final SubLObject var36_37 = var6.fourthMultipleValue();
                                                            final SubLObject var38_39 = var6.fifthMultipleValue();
                                                            var6.resetMultipleValues();
                                                            var7 = var30_31;
                                                            var8 = var32_33;
                                                            var9 = var34_35;
                                                            var10 = var36_37;
                                                            var11 = var38_39;
                                                            if (NIL != module0581.f35648(var7)) {
                                                                var10 = module0758.f47886(var10, (SubLObject)$ic4$);
                                                                var7 = module0756.f47713(var10, (SubLObject)T);
                                                            }
                                                        }
                                                        finally {
                                                            module0579.$g4320$.rebind(var12_23, var6);
                                                        }
                                                    }
                                                    finally {
                                                        final SubLObject var12_24 = Threads.$is_thread_performing_cleanupP$.currentBinding(var6);
                                                        try {
                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var6);
                                                            if (NIL != var18 && NIL == var19) {
                                                                module0034.f1873(var18, (SubLObject)NIL);
                                                            }
                                                        }
                                                        finally {
                                                            Threads.$is_thread_performing_cleanupP$.rebind(var12_24, var6);
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0034.$g879$.rebind(var12_22, var6);
                                                }
                                            }
                                            finally {
                                                module0580.$g4359$.rebind(var12_21, var6);
                                            }
                                            if (var17 == $ic6$ && NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var6))) {
                                                module0034.f1891(module0580.$g4358$.getDynamicValue(var6));
                                            }
                                        }
                                        finally {
                                            module0580.$g4358$.rebind(var12_20, var6);
                                        }
                                    }
                                    finally {
                                        final SubLObject var12_25 = Threads.$is_thread_performing_cleanupP$.currentBinding(var6);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var6);
                                            if (NIL == var16) {
                                                module0580.f35554(module0580.$g4362$.getDynamicValue(var6));
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var12_25, var6);
                                        }
                                    }
                                }
                                finally {
                                    module0580.$g4362$.rebind(var12_19, var6);
                                }
                            }
                            finally {
                                module0580.$g4361$.rebind(var12_18, var6);
                            }
                        }
                        else {
                            try {
                                var6.throwStack.push(module0003.$g3$.getGlobalValue());
                                final SubLObject var12_26 = Errors.$error_handler$.currentBinding(var6);
                                try {
                                    Errors.$error_handler$.bind((SubLObject)$ic7$, var6);
                                    try {
                                        final SubLObject var12_27 = module0580.$g4361$.currentBinding(var6);
                                        try {
                                            module0580.$g4361$.bind((SubLObject)NIL, var6);
                                            var6.resetMultipleValues();
                                            final SubLObject var12_28 = module0580.$g4362$.currentBinding(var6);
                                            try {
                                                module0580.$g4362$.bind(module0580.f35560(), var6);
                                                final SubLObject var21 = var6.secondMultipleValue();
                                                var6.resetMultipleValues();
                                                try {
                                                    var6.resetMultipleValues();
                                                    final SubLObject var12_29 = module0580.$g4358$.currentBinding(var6);
                                                    try {
                                                        module0580.$g4358$.bind(module0580.f35544(), var6);
                                                        final SubLObject var22 = var6.secondMultipleValue();
                                                        var6.resetMultipleValues();
                                                        final SubLObject var12_30 = module0580.$g4359$.currentBinding(var6);
                                                        try {
                                                            module0580.$g4359$.bind(module0580.f35545(), var6);
                                                            final SubLObject var23 = module0580.$g4358$.getDynamicValue(var6);
                                                            final SubLObject var12_31 = module0034.$g879$.currentBinding(var6);
                                                            try {
                                                                module0034.$g879$.bind(var23, var6);
                                                                SubLObject var24 = (SubLObject)NIL;
                                                                if (NIL != var23 && NIL == module0034.f1842(var23)) {
                                                                    var24 = module0034.f1869(var23);
                                                                    final SubLObject var25 = Threads.current_process();
                                                                    if (NIL == var24) {
                                                                        module0034.f1873(var23, var25);
                                                                    }
                                                                    else if (!var24.eql(var25)) {
                                                                        Errors.error((SubLObject)$ic5$);
                                                                    }
                                                                }
                                                                try {
                                                                    final SubLObject var12_32 = module0579.$g4320$.currentBinding(var6);
                                                                    try {
                                                                        module0579.$g4320$.bind((SubLObject)ConsesLow.cons(module0205.f13144(var1), module0579.$g4320$.getDynamicValue(var6)), var6);
                                                                        var6.resetMultipleValues();
                                                                        final SubLObject var49_50 = f49138(var1, module0751.f47099(var5, f49139(), (SubLObject)UNPROVIDED));
                                                                        final SubLObject var51_52 = var6.secondMultipleValue();
                                                                        final SubLObject var53_54 = var6.thirdMultipleValue();
                                                                        final SubLObject var55_56 = var6.fourthMultipleValue();
                                                                        final SubLObject var57_58 = var6.fifthMultipleValue();
                                                                        var6.resetMultipleValues();
                                                                        var7 = var49_50;
                                                                        var8 = var51_52;
                                                                        var9 = var53_54;
                                                                        var10 = var55_56;
                                                                        var11 = var57_58;
                                                                        if (NIL != module0581.f35648(var7)) {
                                                                            var10 = module0758.f47886(var10, (SubLObject)$ic4$);
                                                                            var7 = module0756.f47713(var10, (SubLObject)T);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        module0579.$g4320$.rebind(var12_32, var6);
                                                                    }
                                                                }
                                                                finally {
                                                                    final SubLObject var12_33 = Threads.$is_thread_performing_cleanupP$.currentBinding(var6);
                                                                    try {
                                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var6);
                                                                        if (NIL != var23 && NIL == var24) {
                                                                            module0034.f1873(var23, (SubLObject)NIL);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        Threads.$is_thread_performing_cleanupP$.rebind(var12_33, var6);
                                                                    }
                                                                }
                                                            }
                                                            finally {
                                                                module0034.$g879$.rebind(var12_31, var6);
                                                            }
                                                        }
                                                        finally {
                                                            module0580.$g4359$.rebind(var12_30, var6);
                                                        }
                                                        if (var22 == $ic6$ && NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var6))) {
                                                            module0034.f1891(module0580.$g4358$.getDynamicValue(var6));
                                                        }
                                                    }
                                                    finally {
                                                        module0580.$g4358$.rebind(var12_29, var6);
                                                    }
                                                }
                                                finally {
                                                    final SubLObject var12_34 = Threads.$is_thread_performing_cleanupP$.currentBinding(var6);
                                                    try {
                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var6);
                                                        if (NIL == var21) {
                                                            module0580.f35554(module0580.$g4362$.getDynamicValue(var6));
                                                        }
                                                    }
                                                    finally {
                                                        Threads.$is_thread_performing_cleanupP$.rebind(var12_34, var6);
                                                    }
                                                }
                                            }
                                            finally {
                                                module0580.$g4362$.rebind(var12_28, var6);
                                            }
                                        }
                                        finally {
                                            module0580.$g4361$.rebind(var12_27, var6);
                                        }
                                    }
                                    catch (Throwable var26) {
                                        Errors.handleThrowable(var26, (SubLObject)NIL);
                                    }
                                }
                                finally {
                                    Errors.$error_handler$.rebind(var12_26, var6);
                                }
                            }
                            catch (Throwable var27) {
                                var15 = Errors.handleThrowable(var27, module0003.$g3$.getGlobalValue());
                            }
                            finally {
                                var6.throwStack.pop();
                            }
                            if (var15.isString() && NIL == module0578.f35477()) {
                                Errors.warn(Sequences.cconcatenate(module0752.f47234(var15), (SubLObject)$ic8$), module0579.f35508());
                            }
                        }
                    }
                    finally {
                        module0578.$g4234$.rebind(var13_18, var6);
                        Errors.$continue_cerrorP$.rebind(var12_17, var6);
                    }
                }
                finally {
                    final SubLObject var12_35 = Threads.$is_thread_performing_cleanupP$.currentBinding(var6);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var6);
                        module0580.f35573();
                        module0580.f35575();
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var12_35, var6);
                    }
                }
            }
            finally {
                module0579.$g4321$.rebind(var12_16, var6);
            }
        }
        finally {
            module0579.$g4259$.rebind(var14, var6);
            module0579.$g4262$.rebind(var13, var6);
            module0579.$g4260$.rebind(var12, var6);
        }
        var12 = module0579.$g4305$.currentBinding(var6);
        try {
            module0579.$g4305$.bind((SubLObject)makeBoolean(NIL != module0579.f35497() && NIL == Sequences.find_if((SubLObject)$ic9$, var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)), var6);
            var10 = module0770.f49055(var10, var1);
        }
        finally {
            module0579.$g4305$.rebind(var12, var6);
        }
        return Values.values(module0581.f35681(var7, var4), var8, var9, var10, var11);
    }
    
    public static SubLObject f49139() {
        return conses_high.copy_list($g6158$.getGlobalValue());
    }
    
    public static SubLObject f49138(final SubLObject var1, final SubLObject var5) {
        return f49140(var1, var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49141(final SubLObject var1, final SubLObject var5, SubLObject var64, SubLObject var65, SubLObject var66) {
        if (var64 == UNPROVIDED) {
            var64 = module0579.$g4250$.getDynamicValue();
        }
        if (var65 == UNPROVIDED) {
            var65 = module0579.$g4287$.getDynamicValue();
        }
        if (var66 == UNPROVIDED) {
            var66 = module0579.$g4252$.getDynamicValue();
        }
        final SubLThread var67 = SubLProcess.currentSubLThread();
        final SubLObject var68 = module0579.$g4252$.currentBinding(var67);
        try {
            module0579.$g4252$.bind(var66, var67);
            SubLObject var69 = (SubLObject)$ic12$;
            SubLObject var70 = (SubLObject)NIL;
            final SubLObject var71 = module0751.f47200();
            SubLObject var72 = (SubLObject)NIL;
            SubLObject var73 = (SubLObject)NIL;
            SubLObject var74 = (SubLObject)NIL;
            SubLObject var75 = (SubLObject)NIL;
            SubLObject var76 = (SubLObject)NIL;
            final SubLObject var12_70 = module0579.$g4287$.currentBinding(var67);
            try {
                module0579.$g4287$.bind(var65, var67);
                final SubLObject var77 = module0205.f13132(var1);
                final SubLObject var12_71 = module0580.$g4364$.currentBinding(var67);
                final SubLObject var78 = module0579.$g4336$.currentBinding(var67);
                try {
                    module0580.$g4364$.bind((SubLObject)makeBoolean(NIL != module0580.$g4364$.getDynamicValue(var67) || NIL != module0107.f7628(module0579.$g4252$.getDynamicValue(var67))), var67);
                    module0579.$g4336$.bind((SubLObject)((NIL != module0580.f35536(var77)) ? var77 : $ic13$), var67);
                    final SubLObject var79 = module0580.$g4363$.getDynamicValue(var67);
                    final SubLObject var12_72 = module0580.$g4366$.currentBinding(var67);
                    final SubLObject var13_75 = module0580.$g4363$.currentBinding(var67);
                    try {
                        module0580.$g4366$.bind(module0580.f35568(), var67);
                        module0580.$g4363$.bind(module0054.f3968(), var67);
                        SubLObject var80 = (SubLObject)NIL;
                        try {
                            if (NIL != var64) {
                                var69 = (SubLObject)$ic14$;
                            }
                            else {
                                var67.resetMultipleValues();
                                final SubLObject var77_78 = f49142(var1, var5, var71);
                                final SubLObject var79_80 = var67.secondMultipleValue();
                                final SubLObject var81_82 = var67.thirdMultipleValue();
                                final SubLObject var83_84 = var67.fourthMultipleValue();
                                final SubLObject var85_86 = var67.fifthMultipleValue();
                                var67.resetMultipleValues();
                                var72 = var77_78;
                                var73 = var79_80;
                                var74 = var81_82;
                                var75 = var83_84;
                                var76 = var85_86;
                            }
                            if (NIL != module0581.f35648(var72)) {
                                var70 = (SubLObject)$ic15$;
                            }
                            else if (NIL == module0202.f12590(var1)) {
                                var67.resetMultipleValues();
                                final SubLObject var87_88 = f49143(var1, var5);
                                final SubLObject var89_90 = var67.secondMultipleValue();
                                final SubLObject var91_92 = var67.thirdMultipleValue();
                                final SubLObject var93_94 = var67.fourthMultipleValue();
                                final SubLObject var95_96 = var67.fifthMultipleValue();
                                var67.resetMultipleValues();
                                var72 = var87_88;
                                var73 = var89_90;
                                var74 = var91_92;
                                var75 = var93_94;
                                var76 = var95_96;
                            }
                            else {
                                final SubLObject var12_73 = module0579.$g4323$.currentBinding(var67);
                                try {
                                    module0579.$g4323$.bind((NIL != module0067.f4852(module0579.$g4323$.getDynamicValue(var67))) ? module0579.$g4323$.getDynamicValue(var67) : module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var67);
                                    final SubLObject var81 = module0754.f47307();
                                    final SubLObject var12_74 = module0754.$g6064$.currentBinding(var67);
                                    final SubLObject var13_76 = module0579.$g4324$.currentBinding(var67);
                                    final SubLObject var82 = module0579.$g4325$.currentBinding(var67);
                                    try {
                                        module0754.$g6064$.bind(module0754.$g6064$.getDynamicValue(var67), var67);
                                        module0579.$g4324$.bind((NIL != module0067.f4852(module0579.$g4324$.getDynamicValue(var67))) ? module0579.$g4324$.getDynamicValue(var67) : module0067.f4880(Symbols.symbol_function((SubLObject)EQL), (SubLObject)SIXTEEN_INTEGER), var67);
                                        module0579.$g4325$.bind(module0048.f_1X(module0579.$g4325$.getDynamicValue(var67)), var67);
                                        if (NIL != module0578.f35470((SubLObject)TWO_INTEGER)) {
                                            PrintLow.format((SubLObject)T, (SubLObject)$ic16$, module0579.$g4325$.getDynamicValue(var67), module0067.f4903(module0579.$g4323$.getDynamicValue(var67)));
                                        }
                                        try {
                                            module0754.f47323(var1);
                                            final SubLObject var12_75 = module0579.$g4334$.currentBinding(var67);
                                            try {
                                                module0579.$g4334$.bind(module0048.f_1X(module0579.f35487()), var67);
                                                SubLObject var83 = (SubLObject)NIL;
                                                SubLObject var84 = (SubLObject)NIL;
                                                SubLObject var85 = (SubLObject)NIL;
                                                SubLObject var86 = (SubLObject)NIL;
                                                SubLObject var87 = (SubLObject)NIL;
                                                var67.resetMultipleValues();
                                                final SubLObject var88 = f49144(var1, var71);
                                                SubLObject var89 = var67.secondMultipleValue();
                                                final SubLObject var90 = var67.thirdMultipleValue();
                                                final SubLObject var91 = var67.fourthMultipleValue();
                                                var67.resetMultipleValues();
                                                if (NIL != module0202.f12590(var90)) {
                                                    f49145(var90);
                                                    final SubLObject var12_76 = module0579.$g4279$.currentBinding(var67);
                                                    try {
                                                        module0579.$g4279$.bind((SubLObject)((NIL != module0579.$g4273$.getDynamicValue(var67)) ? NIL : module0579.$g4279$.getDynamicValue(var67)), var67);
                                                        var67.resetMultipleValues();
                                                        final SubLObject var112_113 = f49146(var90, (SubLObject)$ic1$, var91, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                        final SubLObject var114_115 = var67.secondMultipleValue();
                                                        final SubLObject var116_117 = var67.thirdMultipleValue();
                                                        final SubLObject var118_119 = var67.fourthMultipleValue();
                                                        var67.resetMultipleValues();
                                                        var83 = var112_113;
                                                        var84 = var114_115;
                                                        var85 = var116_117;
                                                        var86 = var118_119;
                                                        if (NIL == var83) {
                                                            if (NIL != module0578.f35470((SubLObject)ONE_INTEGER) && NIL == module0578.f35477()) {
                                                                Errors.warn((SubLObject)$ic17$, var90);
                                                            }
                                                            var87 = (SubLObject)T;
                                                        }
                                                    }
                                                    finally {
                                                        module0579.$g4279$.rebind(var12_76, var67);
                                                    }
                                                }
                                                if (NIL == var87) {
                                                    var67.resetMultipleValues();
                                                    final SubLObject var92 = module0751.f46734(var88);
                                                    final SubLObject var93 = var67.secondMultipleValue();
                                                    var67.resetMultipleValues();
                                                    var89 = module0751.f46693(var89, var93);
                                                    if (NIL == var72) {
                                                        SubLObject var94 = var69;
                                                        SubLObject var95 = (SubLObject)NIL;
                                                        var95 = var94.first();
                                                        while (NIL == var72 && NIL != var94) {
                                                            var67.resetMultipleValues();
                                                            final SubLObject var124_125 = Functions.funcall(var95, var92, var5, var89);
                                                            final SubLObject var126_127 = var67.secondMultipleValue();
                                                            final SubLObject var128_129 = var67.thirdMultipleValue();
                                                            final SubLObject var130_131 = var67.fourthMultipleValue();
                                                            final SubLObject var132_133 = var67.fifthMultipleValue();
                                                            var67.resetMultipleValues();
                                                            var72 = var124_125;
                                                            var73 = var126_127;
                                                            var74 = var128_129;
                                                            var75 = var130_131;
                                                            var76 = var132_133;
                                                            if (NIL != module0581.f35648(var72)) {
                                                                var70 = var95;
                                                                var67.resetMultipleValues();
                                                                final SubLObject var134_135 = f49147(var72, var73, var74, var75, var76, var85, var86);
                                                                final SubLObject var136_137 = var67.secondMultipleValue();
                                                                final SubLObject var138_139 = var67.thirdMultipleValue();
                                                                final SubLObject var140_141 = var67.fourthMultipleValue();
                                                                final SubLObject var142_143 = var67.fifthMultipleValue();
                                                                var67.resetMultipleValues();
                                                                var72 = var134_135;
                                                                var73 = var136_137;
                                                                var74 = var138_139;
                                                                var75 = var140_141;
                                                                var76 = var142_143;
                                                            }
                                                            var94 = var94.rest();
                                                            var95 = var94.first();
                                                        }
                                                    }
                                                }
                                            }
                                            finally {
                                                module0579.$g4334$.rebind(var12_75, var67);
                                            }
                                        }
                                        finally {
                                            final SubLObject var12_77 = Threads.$is_thread_performing_cleanupP$.currentBinding(var67);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var67);
                                                final SubLObject var96 = conses_high.set_difference(module0754.f47307(), var81, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                if (NIL != module0578.f35470((SubLObject)TWO_INTEGER)) {
                                                    PrintLow.format((SubLObject)T, (SubLObject)$ic18$, module0579.$g4325$.getDynamicValue(var67), module0754.f47307());
                                                }
                                                module0580.f35619(var96);
                                                if (NIL != module0578.f35470((SubLObject)TWO_INTEGER)) {
                                                    PrintLow.format((SubLObject)T, (SubLObject)$ic19$, module0754.f47307());
                                                }
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var12_77, var67);
                                            }
                                        }
                                    }
                                    finally {
                                        module0579.$g4325$.rebind(var82, var67);
                                        module0579.$g4324$.rebind(var13_76, var67);
                                        module0754.$g6064$.rebind(var12_74, var67);
                                    }
                                }
                                finally {
                                    module0579.$g4323$.rebind(var12_73, var67);
                                }
                            }
                            if (NIL != var70) {
                                var74 = (SubLObject)ConsesLow.cons(module0756.f47688(var70, (SubLObject)UNPROVIDED), var74);
                                if (NIL == var73) {
                                    var73 = $ic20$;
                                }
                                if (NIL == var75) {
                                    var75 = (SubLObject)ConsesLow.list(module0749.f46446(var72, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                                }
                            }
                            var80 = (SubLObject)makeBoolean(NIL != module0107.f7628(module0579.$g4252$.getDynamicValue(var67)) || NIL == var70);
                        }
                        finally {
                            final SubLObject var12_78 = Threads.$is_thread_performing_cleanupP$.currentBinding(var67);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var67);
                                if (NIL != var80) {
                                    module0580.f35566();
                                }
                                else {
                                    SubLObject var97 = module0054.f3978(module0580.$g4363$.getDynamicValue(var67));
                                    SubLObject var98 = (SubLObject)NIL;
                                    var98 = var97.first();
                                    while (NIL != var97) {
                                        module0054.f3973(var98, var79);
                                        var97 = var97.rest();
                                        var98 = var97.first();
                                    }
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var12_78, var67);
                            }
                        }
                    }
                    finally {
                        module0580.$g4363$.rebind(var13_75, var67);
                        module0580.$g4366$.rebind(var12_72, var67);
                    }
                }
                finally {
                    module0579.$g4336$.rebind(var78, var67);
                    module0580.$g4364$.rebind(var12_71, var67);
                }
            }
            finally {
                module0579.$g4287$.rebind(var12_70, var67);
            }
            return Values.values(var72, var73, var74, var75, var76);
        }
        finally {
            module0579.$g4252$.rebind(var68, var67);
        }
    }
    
    public static SubLObject f49140(final SubLObject var1, final SubLObject var5, SubLObject var64, SubLObject var65, SubLObject var66) {
        if (var64 == UNPROVIDED) {
            var64 = module0579.$g4250$.getDynamicValue();
        }
        if (var65 == UNPROVIDED) {
            var65 = module0579.$g4287$.getDynamicValue();
        }
        if (var66 == UNPROVIDED) {
            var66 = module0579.$g4252$.getDynamicValue();
        }
        final SubLThread var67 = SubLProcess.currentSubLThread();
        final SubLObject var68 = module0034.$g879$.getDynamicValue(var67);
        SubLObject var69 = (SubLObject)NIL;
        if (NIL == var68) {
            return f49141(var1, var5, var64, var65, var66);
        }
        var69 = module0034.f1857(var68, (SubLObject)$ic11$, (SubLObject)UNPROVIDED);
        if (NIL == var69) {
            var69 = module0034.f1807(module0034.f1842(var68), (SubLObject)$ic11$, (SubLObject)FIVE_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var68, (SubLObject)$ic11$, var69);
        }
        final SubLObject var70 = module0034.f1779(var1, var5, var64, var65, var66);
        final SubLObject var71 = module0034.f1814(var69, var70, (SubLObject)UNPROVIDED);
        if (var71 != $ic22$) {
            SubLObject var72 = var71;
            SubLObject var73 = (SubLObject)NIL;
            var73 = var72.first();
            while (NIL != var72) {
                SubLObject var74 = var73.first();
                final SubLObject var75 = conses_high.second(var73);
                if (var1.equal(var74.first())) {
                    var74 = var74.rest();
                    if (var5.equal(var74.first())) {
                        var74 = var74.rest();
                        if (var64.equal(var74.first())) {
                            var74 = var74.rest();
                            if (var65.equal(var74.first())) {
                                var74 = var74.rest();
                                if (NIL != var74 && NIL == var74.rest() && var66.equal(var74.first())) {
                                    return module0034.f1959(var75);
                                }
                            }
                        }
                    }
                }
                var72 = var72.rest();
                var73 = var72.first();
            }
        }
        final SubLObject var76 = Values.arg2(var67.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f49141(var1, var5, var64, var65, var66)));
        module0034.f1836(var69, var70, var71, var76, (SubLObject)ConsesLow.list(var1, var5, var64, var65, var66));
        return module0034.f1959(var76);
    }
    
    public static SubLObject f49144(final SubLObject var1, SubLObject var69) {
        if (var69 == UNPROVIDED) {
            var69 = module0751.f47200();
        }
        if (NIL != f49148(var1)) {
            final SubLObject var70 = (SubLObject)$ic23$;
            final SubLObject var71 = module0751.f46693(var69, var70);
            final SubLObject var72 = module0751.f46672(var70, var1);
            final SubLObject var73 = (SubLObject)$ic24$;
            final SubLObject var74 = module0751.f46693(var69, var73);
            final SubLObject var75 = module0751.f46672(var73, var1);
            return Values.values(var75, var74, var72, var71);
        }
        return Values.values(var1, var69);
    }
    
    public static SubLObject f49148(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL != module0579.$g4272$.getDynamicValue(var2) && NIL != module0202.f12597(var1));
    }
    
    public static SubLObject f49145(final SubLObject var109) {
        SubLObject var110 = (SubLObject)NIL;
        SubLObject var111 = module0751.f46787(var109);
        SubLObject var112 = (SubLObject)NIL;
        var112 = var111.first();
        while (NIL != var111) {
            module0754.f47320(var112, (SubLObject)$ic25$);
            var110 = (SubLObject)ConsesLow.cons(var112, var110);
            var111 = var111.rest();
            var112 = var111.first();
        }
        return var110;
    }
    
    public static SubLObject f49147(SubLObject var7, final SubLObject var8, SubLObject var9, SubLObject var10, final SubLObject var11, final SubLObject var104, SubLObject var105) {
        if (NIL != var105) {
            final SubLObject var106 = module0749.f46446((SubLObject)$ic26$, (SubLObject)$ic27$, $ic28$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0756.f47719(var106, $ic28$);
            var105 = (SubLObject)ConsesLow.cons(var106, var105);
            var105 = module0765.f48587(var105);
            var10 = ConsesLow.append(var105, var10);
            var9 = ConsesLow.append(var104, var9);
            var7 = module0756.f47713(var10, (SubLObject)T);
        }
        return Values.values(var7, var8, var9, var10, var11);
    }
    
    public static SubLObject f49143(final SubLObject var163, final SubLObject var5) {
        final SubLThread var164 = SubLProcess.currentSubLThread();
        var164.resetMultipleValues();
        final SubLObject var165 = f49146(var163, var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var166 = var164.secondMultipleValue();
        final SubLObject var167 = var164.thirdMultipleValue();
        final SubLObject var168 = var164.fourthMultipleValue();
        var164.resetMultipleValues();
        return Values.values(var165, var166, var167, var168);
    }
    
    public static SubLObject f49149(final SubLObject var1, SubLObject var2, SubLObject var3, SubLObject var5) {
        if (var2 == UNPROVIDED) {
            var2 = module0579.$g4260$.getDynamicValue();
        }
        if (var3 == UNPROVIDED) {
            var3 = module0579.$g4262$.getDynamicValue();
        }
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)$ic1$;
        }
        final SubLThread var6 = SubLProcess.currentSubLThread();
        final SubLObject var7 = (SubLObject)$ic29$;
        final SubLObject var8 = module0751.f46734(var1);
        SubLObject var9 = (SubLObject)NIL;
        final SubLObject var10 = module0579.$g4260$.currentBinding(var6);
        final SubLObject var11 = module0579.$g4262$.currentBinding(var6);
        try {
            module0579.$g4260$.bind(var2, var6);
            module0579.$g4262$.bind(var3, var6);
            if (NIL == var9) {
                SubLObject var12;
                SubLObject var13;
                for (var12 = var7, var13 = (SubLObject)NIL, var13 = var12.first(); NIL == var9 && NIL != var12; var9 = module0035.sublisp_boolean(Functions.funcall(var13, var8, var5)), var12 = var12.rest(), var13 = var12.first()) {}
            }
        }
        finally {
            module0579.$g4262$.rebind(var11, var6);
            module0579.$g4260$.rebind(var10, var6);
        }
        return var9;
    }
    
    public static SubLObject f49150() {
        final SubLObject var165 = $g6159$.getGlobalValue();
        if (NIL != var165) {
            module0034.f1818(var165);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49151(final SubLObject var8, SubLObject var166) {
        if (var166 == UNPROVIDED) {
            var166 = module0579.$g4260$.getDynamicValue();
        }
        return module0034.f1829($g6159$.getGlobalValue(), (SubLObject)ConsesLow.list(var8, var166), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49152(final SubLObject var8, final SubLObject var166) {
        return module0751.f46849(var8, $ic31$, var166);
    }
    
    public static SubLObject f49153(final SubLObject var8, SubLObject var166) {
        if (var166 == UNPROVIDED) {
            var166 = module0579.$g4260$.getDynamicValue();
        }
        SubLObject var167 = $g6159$.getGlobalValue();
        if (NIL == var167) {
            var167 = module0034.f1934((SubLObject)$ic30$, (SubLObject)$ic32$, (SubLObject)NIL, (SubLObject)EQ, (SubLObject)TWO_INTEGER, (SubLObject)SIXTEEN_INTEGER);
        }
        final SubLObject var168 = module0034.f1782(var8, var166);
        final SubLObject var169 = module0034.f1814(var167, var168, (SubLObject)UNPROVIDED);
        if (var169 != $ic22$) {
            SubLObject var170 = var169;
            SubLObject var171 = (SubLObject)NIL;
            var171 = var170.first();
            while (NIL != var170) {
                SubLObject var172 = var171.first();
                final SubLObject var173 = conses_high.second(var171);
                if (var8.eql(var172.first())) {
                    var172 = var172.rest();
                    if (NIL != var172 && NIL == var172.rest() && var166.eql(var172.first())) {
                        return module0034.f1959(var173);
                    }
                }
                var170 = var170.rest();
                var171 = var170.first();
            }
        }
        final SubLObject var174 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f49152(var8, var166)));
        module0034.f1836(var167, var168, var169, var174, (SubLObject)ConsesLow.list(var8, var166));
        return module0034.f1959(var174);
    }
    
    public static SubLObject f49154(final SubLObject var171) {
        if (var171 == $ic1$) {
            return (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(NIL != var171 && NIL == module0035.find_if_not((SubLObject)$ic30$, var171, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f49155(final SubLObject var1, SubLObject var5, SubLObject var69) {
        if (var5 == UNPROVIDED) {
            var5 = f49139();
        }
        if (var69 == UNPROVIDED) {
            var69 = module0751.f47200();
        }
        final SubLThread var70 = SubLProcess.currentSubLThread();
        SubLObject var71 = (SubLObject)NIL;
        SubLObject var72 = (SubLObject)NIL;
        SubLObject var73 = (SubLObject)NIL;
        SubLObject var74 = (SubLObject)NIL;
        final SubLObject var75 = (SubLObject)TWO_INTEGER;
        if (NIL != module0202.f12590(var1) && NIL == f49154(var5)) {
            final SubLObject var76 = module0205.f13136(var1);
            final SubLObject var77 = f49156(var1);
            final SubLObject var78 = f49157(var76, var77);
            if (NIL != var78) {
                var70.resetMultipleValues();
                final SubLObject var79 = module0765.f48557(var78);
                final SubLObject var80 = var70.secondMultipleValue();
                var70.resetMultipleValues();
                var74 = module0765.f48553(var1, var79, var80, var69, (SubLObject)UNPROVIDED);
                var72 = $ic20$;
                var73 = (SubLObject)NIL;
                var71 = module0756.f47713(var74, (SubLObject)T);
            }
        }
        return Values.values(var71, var72, var73, var74, var75);
    }
    
    public static SubLObject f49156(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        SubLObject var3 = (SubLObject)ZERO_INTEGER;
        final SubLObject var4 = module0205.f13207(var1, (SubLObject)$ic33$);
        SubLObject var5;
        SubLObject var6;
        for (var5 = (SubLObject)NIL, var5 = var4; NIL == var2 && NIL != var5; var5 = var5.rest()) {
            var6 = var5.first();
            var3 = Numbers.add(var3, (SubLObject)ONE_INTEGER);
            if (NIL != module0201.f12575(var6) && NIL != module0754.f47325(var6)) {
                var2 = var3;
            }
        }
        return var2;
    }
    
    public static SubLObject f49157(final SubLObject var182, final SubLObject var174) {
        final SubLThread var183 = SubLProcess.currentSubLThread();
        SubLObject var184 = (SubLObject)NIL;
        final SubLObject var185 = module0147.f9540(module0579.$g4260$.getDynamicValue(var183));
        final SubLObject var186 = module0147.$g2095$.currentBinding(var183);
        final SubLObject var187 = module0147.$g2094$.currentBinding(var183);
        final SubLObject var188 = module0147.$g2096$.currentBinding(var183);
        try {
            module0147.$g2095$.bind(module0147.f9545(var185), var183);
            module0147.$g2094$.bind(module0147.f9546(var185), var183);
            module0147.$g2096$.bind(module0147.f9549(var185), var183);
            final SubLObject var189 = $ic34$;
            if (NIL != module0158.f10010(var182, (SubLObject)NIL, var189)) {
                final SubLObject var190 = module0158.f10011(var182, (SubLObject)NIL, var189);
                SubLObject var191 = var184;
                final SubLObject var192 = (SubLObject)NIL;
                while (NIL == var191) {
                    final SubLObject var193 = module0052.f3695(var190, var192);
                    final SubLObject var194 = (SubLObject)makeBoolean(!var192.eql(var193));
                    if (NIL != var194) {
                        SubLObject var195 = (SubLObject)NIL;
                        try {
                            var195 = module0158.f10316(var193, (SubLObject)$ic35$, (SubLObject)$ic36$, (SubLObject)NIL);
                            SubLObject var187_192 = var184;
                            final SubLObject var188_193 = (SubLObject)NIL;
                            while (NIL == var187_192) {
                                final SubLObject var196 = module0052.f3695(var195, var188_193);
                                final SubLObject var190_195 = (SubLObject)makeBoolean(!var188_193.eql(var196));
                                if (NIL != var190_195 && module0178.f11335(var196).eql(var174)) {
                                    var184 = module0178.f11285(var196);
                                }
                                var187_192 = (SubLObject)makeBoolean(NIL == var190_195 || NIL != var184);
                            }
                        }
                        finally {
                            final SubLObject var12_196 = Threads.$is_thread_performing_cleanupP$.currentBinding(var183);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var183);
                                if (NIL != var195) {
                                    module0158.f10319(var195);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var12_196, var183);
                            }
                        }
                    }
                    var191 = (SubLObject)makeBoolean(NIL == var194 || NIL != var184);
                }
            }
        }
        finally {
            module0147.$g2096$.rebind(var188, var183);
            module0147.$g2094$.rebind(var187, var183);
            module0147.$g2095$.rebind(var186, var183);
        }
        return var184;
    }
    
    public static SubLObject f49158(final SubLObject var197) {
        final SubLObject var198 = (SubLObject)ConsesLow.list(module0233.f15369(module0193.f12075((SubLObject)ZERO_INTEGER), var197), module0233.f15369(module0193.f12075((SubLObject)ONE_INTEGER), var197));
        return (SubLObject)((NIL != var198.first()) ? var198 : NIL);
    }
    
    public static SubLObject f49159(final SubLObject var7) {
        return Sequences.length(module0038.f2689(module0579.$g4315$.getGlobalValue(), var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f49142(final SubLObject var199, SubLObject var5, SubLObject var69) {
        if (var5 == UNPROVIDED) {
            var5 = f49139();
        }
        if (var69 == UNPROVIDED) {
            var69 = module0751.f47200();
        }
        final SubLThread var200 = SubLProcess.currentSubLThread();
        SubLObject var201 = (SubLObject)NIL;
        SubLObject var202 = (SubLObject)NIL;
        SubLObject var203 = (SubLObject)NIL;
        SubLObject var204 = (SubLObject)NIL;
        SubLObject var205 = (SubLObject)NIL;
        if (NIL != $g6160$.getDynamicValue(var200) && NIL == var205) {
            SubLObject var206 = f49160(var199, var5);
            SubLObject var207 = (SubLObject)NIL;
            var207 = var206.first();
            while (NIL == var205 && NIL != var206) {
                SubLObject var208 = (SubLObject)NIL;
                final SubLObject var209 = Errors.$continue_cerrorP$.currentBinding(var200);
                final SubLObject var210 = module0578.$g4234$.currentBinding(var200);
                try {
                    Errors.$continue_cerrorP$.bind((SubLObject)NIL, var200);
                    module0578.$g4234$.bind((SubLObject)T, var200);
                    if (NIL != module0578.f35473()) {
                        final SubLObject var12_202 = module0579.$g4305$.currentBinding(var200);
                        try {
                            module0579.$g4305$.bind(module0202.f12925(var199), var200);
                            final SubLObject var211 = f49161(var207, var199, var69);
                            if (NIL != f49162(var211, var199)) {
                                if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                                    PrintLow.format((SubLObject)T, (SubLObject)$ic37$, var207);
                                }
                                module0770.f49065(var211, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                if (NIL != module0756.f47479(var211)) {
                                    module0756.f47569(var211, var207);
                                    var201 = module0756.f47480(var211, (SubLObject)T);
                                    var202 = module0756.f47691(var211);
                                    var203 = module0756.f47510(var211);
                                    var204 = module0756.f47467(var211);
                                    if (NIL == module0579.f35485()) {
                                        var205 = (SubLObject)T;
                                    }
                                    if (NIL != module0107.f7629(module0579.$g4252$.getDynamicValue(var200))) {
                                        module0759.f48067(var211);
                                        final SubLObject var212 = module0055.f4017();
                                        SubLObject var213 = (SubLObject)ZERO_INTEGER;
                                        module0055.f4021(var211, var212);
                                        while (NIL == module0055.f4019(var212)) {
                                            final SubLObject var214 = module0055.f4023(var212);
                                            SubLObject var215 = module0756.f47673(var214);
                                            SubLObject var216 = (SubLObject)NIL;
                                            var216 = var215.first();
                                            while (NIL != var215) {
                                                module0759.f48067(var216);
                                                var213 = Numbers.add(var213, (SubLObject)ONE_INTEGER);
                                                if (var213.numGE(module0756.$g6076$.getDynamicValue(var200))) {
                                                    final SubLObject var217 = Sequences.cconcatenate((SubLObject)$ic38$, new SubLObject[] { module0006.f205((SubLObject)ONE_INTEGER), $ic39$, module0006.f203((SubLObject)$ic40$) });
                                                    module0578.f35476(var217, (SubLObject)ConsesLow.list(var213, var211));
                                                }
                                                module0055.f4021(var216, var212);
                                                var215 = var215.rest();
                                                var216 = var215.first();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        finally {
                            module0579.$g4305$.rebind(var12_202, var200);
                        }
                    }
                    else {
                        try {
                            var200.throwStack.push(module0003.$g3$.getGlobalValue());
                            final SubLObject var12_203 = Errors.$error_handler$.currentBinding(var200);
                            try {
                                Errors.$error_handler$.bind((SubLObject)$ic7$, var200);
                                try {
                                    final SubLObject var12_204 = module0579.$g4305$.currentBinding(var200);
                                    try {
                                        module0579.$g4305$.bind(module0202.f12925(var199), var200);
                                        final SubLObject var218 = f49161(var207, var199, var69);
                                        if (NIL != f49162(var218, var199)) {
                                            if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                                                PrintLow.format((SubLObject)T, (SubLObject)$ic37$, var207);
                                            }
                                            module0770.f49065(var218, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                            if (NIL != module0756.f47479(var218)) {
                                                module0756.f47569(var218, var207);
                                                var201 = module0756.f47480(var218, (SubLObject)T);
                                                var202 = module0756.f47691(var218);
                                                var203 = module0756.f47510(var218);
                                                var204 = module0756.f47467(var218);
                                                if (NIL == module0579.f35485()) {
                                                    var205 = (SubLObject)T;
                                                }
                                                if (NIL != module0107.f7629(module0579.$g4252$.getDynamicValue(var200))) {
                                                    module0759.f48067(var218);
                                                    final SubLObject var219 = module0055.f4017();
                                                    SubLObject var220 = (SubLObject)ZERO_INTEGER;
                                                    module0055.f4021(var218, var219);
                                                    while (NIL == module0055.f4019(var219)) {
                                                        final SubLObject var221 = module0055.f4023(var219);
                                                        SubLObject var222 = module0756.f47673(var221);
                                                        SubLObject var223 = (SubLObject)NIL;
                                                        var223 = var222.first();
                                                        while (NIL != var222) {
                                                            module0759.f48067(var223);
                                                            var220 = Numbers.add(var220, (SubLObject)ONE_INTEGER);
                                                            if (var220.numGE(module0756.$g6076$.getDynamicValue(var200))) {
                                                                final SubLObject var224 = Sequences.cconcatenate((SubLObject)$ic38$, new SubLObject[] { module0006.f205((SubLObject)ONE_INTEGER), $ic39$, module0006.f203((SubLObject)$ic40$) });
                                                                module0578.f35476(var224, (SubLObject)ConsesLow.list(var220, var218));
                                                            }
                                                            module0055.f4021(var223, var219);
                                                            var222 = var222.rest();
                                                            var223 = var222.first();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    finally {
                                        module0579.$g4305$.rebind(var12_204, var200);
                                    }
                                }
                                catch (Throwable var225) {
                                    Errors.handleThrowable(var225, (SubLObject)NIL);
                                }
                            }
                            finally {
                                Errors.$error_handler$.rebind(var12_203, var200);
                            }
                        }
                        catch (Throwable var226) {
                            var208 = Errors.handleThrowable(var226, module0003.$g3$.getGlobalValue());
                        }
                        finally {
                            var200.throwStack.pop();
                        }
                        if (var208.isString() && NIL == module0578.f35477()) {
                            Errors.warn(Sequences.cconcatenate(module0752.f47234(var208), (SubLObject)$ic8$), module0579.f35508());
                        }
                    }
                }
                finally {
                    module0578.$g4234$.rebind(var210, var200);
                    Errors.$continue_cerrorP$.rebind(var209, var200);
                }
                if (NIL != var208) {
                    Errors.warn(var208);
                }
                var206 = var206.rest();
                var207 = var206.first();
            }
        }
        return Values.values(var201, var202, var203, var204);
    }
    
    public static SubLObject f49162(final SubLObject var203, final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0756.f47497(var203, (SubLObject)UNPROVIDED) && NIL != module0763.f48381(var203, var1));
    }
    
    public static SubLObject f49163() {
        if (NIL != module0067.f4852($g6161$.getGlobalValue())) {
            module0067.f4881($g6161$.getGlobalValue());
        }
        $g6161$.setGlobalValue((SubLObject)$ic41$);
        return $g6161$.getGlobalValue();
    }
    
    public static SubLObject f49164(final SubLObject var211, final SubLObject var212) {
        return f49163();
    }
    
    public static SubLObject f49165(final SubLObject var211, final SubLObject var212) {
        return f49163();
    }
    
    public static SubLObject f49166() {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        SubLObject var7 = (SubLObject)ZERO_INTEGER;
        final SubLObject var8 = $g6162$.getGlobalValue();
        SubLObject var9 = (SubLObject)NIL;
        try {
            var9 = Locks.seize_lock(var8);
            if (NIL != module0067.f4852($g6161$.getGlobalValue())) {
                module0067.f4881($g6161$.getGlobalValue());
            }
            else {
                $g6161$.setGlobalValue(module0067.f4880(Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED));
            }
            final SubLObject var10 = module0147.$g2094$.currentBinding(var6);
            final SubLObject var11 = module0147.$g2095$.currentBinding(var6);
            try {
                module0147.$g2094$.bind((SubLObject)$ic45$, var6);
                module0147.$g2095$.bind($ic46$, var6);
                final SubLObject var12 = $ic47$;
                if (NIL != module0158.f10038(var12)) {
                    final SubLObject var13 = (SubLObject)NIL;
                    final SubLObject var12_218 = module0012.$g73$.currentBinding(var6);
                    final SubLObject var13_219 = module0012.$g65$.currentBinding(var6);
                    final SubLObject var14 = module0012.$g67$.currentBinding(var6);
                    final SubLObject var15 = module0012.$g68$.currentBinding(var6);
                    final SubLObject var16 = module0012.$g66$.currentBinding(var6);
                    final SubLObject var17 = module0012.$g69$.currentBinding(var6);
                    final SubLObject var18 = module0012.$g70$.currentBinding(var6);
                    final SubLObject var19 = module0012.$silent_progressP$.currentBinding(var6);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var6);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var6), var6);
                        module0012.$g67$.bind((SubLObject)ONE_INTEGER, var6);
                        module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var6);
                        module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var6);
                        module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var6);
                        module0012.$g70$.bind((SubLObject)T, var6);
                        module0012.$silent_progressP$.bind((SubLObject)((NIL != var13) ? module0012.$silent_progressP$.getDynamicValue(var6) : T), var6);
                        module0012.f474(var13);
                        final SubLObject var20 = module0158.f10039(var12);
                        SubLObject var21 = (SubLObject)NIL;
                        final SubLObject var22 = (SubLObject)NIL;
                        while (NIL == var21) {
                            final SubLObject var23 = module0052.f3695(var20, var22);
                            final SubLObject var24 = (SubLObject)makeBoolean(!var22.eql(var23));
                            if (NIL != var24) {
                                module0012.f476();
                                SubLObject var25 = (SubLObject)NIL;
                                try {
                                    var25 = module0158.f10316(var23, (SubLObject)$ic35$, (SubLObject)NIL, (SubLObject)NIL);
                                    SubLObject var187_226 = (SubLObject)NIL;
                                    final SubLObject var188_227 = (SubLObject)NIL;
                                    while (NIL == var187_226) {
                                        final SubLObject var26 = module0052.f3695(var25, var188_227);
                                        final SubLObject var190_228 = (SubLObject)makeBoolean(!var188_227.eql(var26));
                                        if (NIL != var190_228) {
                                            var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                                            SubLObject var27 = module0205.f13183(module0178.f11334(var26), Symbols.symbol_function((SubLObject)$ic48$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                            SubLObject var28 = (SubLObject)NIL;
                                            var28 = var27.first();
                                            while (NIL != var27) {
                                                module0084.f5762($g6161$.getGlobalValue(), var28, var26);
                                                var27 = var27.rest();
                                                var28 = var27.first();
                                            }
                                        }
                                        var187_226 = (SubLObject)makeBoolean(NIL == var190_228);
                                    }
                                }
                                finally {
                                    final SubLObject var12_219 = Threads.$is_thread_performing_cleanupP$.currentBinding(var6);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var6);
                                        if (NIL != var25) {
                                            module0158.f10319(var25);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var12_219, var6);
                                    }
                                }
                            }
                            var21 = (SubLObject)makeBoolean(NIL == var24);
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var19, var6);
                        module0012.$g70$.rebind(var18, var6);
                        module0012.$g69$.rebind(var17, var6);
                        module0012.$g66$.rebind(var16, var6);
                        module0012.$g68$.rebind(var15, var6);
                        module0012.$g67$.rebind(var14, var6);
                        module0012.$g65$.rebind(var13_219, var6);
                        module0012.$g73$.rebind(var12_218, var6);
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var11, var6);
                module0147.$g2094$.rebind(var10, var6);
            }
            SubLObject var29 = (SubLObject)NIL;
            final SubLObject var30 = Numbers.integerDivide(var7, (SubLObject)THREE_INTEGER);
            SubLObject var31;
            for (var31 = module0066.f4838(module0067.f4891($g6161$.getGlobalValue())); NIL == module0066.f4841(var31); var31 = module0066.f4840(var31)) {
                var6.resetMultipleValues();
                final SubLObject var32 = module0066.f4839(var31);
                final SubLObject var33 = var6.secondMultipleValue();
                var6.resetMultipleValues();
                if (NIL != module0035.f2002(var33, var30, (SubLObject)UNPROVIDED)) {
                    var29 = (SubLObject)ConsesLow.cons(var32, var29);
                }
            }
            module0066.f4842(var31);
            SubLObject var34 = var29;
            SubLObject var35 = (SubLObject)NIL;
            var35 = var34.first();
            while (NIL != var34) {
                module0067.f4887($g6161$.getGlobalValue(), var35);
                var34 = var34.rest();
                var35 = var34.first();
            }
        }
        finally {
            if (NIL != var9) {
                Locks.release_lock(var8);
            }
        }
        return var7;
    }
    
    public static SubLObject f49167(final SubLObject var229) {
        SubLObject var230 = (SubLObject)NIL;
        final SubLObject var231 = $g6162$.getGlobalValue();
        SubLObject var232 = (SubLObject)NIL;
        try {
            var232 = Locks.seize_lock(var231);
            var230 = module0067.f4852($g6161$.getGlobalValue());
        }
        finally {
            if (NIL != var232) {
                Locks.release_lock(var231);
            }
        }
        if (NIL == var230) {
            f49166();
        }
        SubLObject var233 = (SubLObject)NIL;
        final SubLObject var234 = $g6162$.getGlobalValue();
        SubLObject var235 = (SubLObject)NIL;
        try {
            var235 = Locks.seize_lock(var234);
            var233 = module0067.f4884($g6161$.getGlobalValue(), var229, (SubLObject)UNPROVIDED);
        }
        finally {
            if (NIL != var235) {
                Locks.release_lock(var234);
            }
        }
        return module0035.remove_if_not((SubLObject)$ic49$, var233, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49168(final SubLObject var212) {
        final SubLThread var213 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL != assertion_handles_oc.f11041(var212, (SubLObject)UNPROVIDED) && NIL != module0751.f47007(module0579.$g4260$.getDynamicValue(var213), module0178.f11287(var212)));
    }
    
    public static SubLObject f49169(final SubLObject var199) {
        final SubLObject var200 = module0067.f4880(Symbols.symbol_function((SubLObject)EQ), (SubLObject)TWENTY_INTEGER);
        SubLObject var201 = module0205.f13183(var199, (SubLObject)$ic48$, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var202 = (SubLObject)NIL;
        var202 = var201.first();
        while (NIL != var201) {
            SubLObject var147_242 = f49167(var202);
            SubLObject var203 = (SubLObject)NIL;
            var203 = var147_242.first();
            while (NIL != var147_242) {
                module0084.f5775(var200, var203, (SubLObject)UNPROVIDED);
                var147_242 = var147_242.rest();
                var203 = var147_242.first();
            }
            var201 = var201.rest();
            var202 = var201.first();
        }
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic50$), module0084.f5795(var200, Symbols.symbol_function((SubLObject)$ic51$)));
    }
    
    public static SubLObject f49160(final SubLObject var199, final SubLObject var5) {
        SubLObject var200 = (SubLObject)NIL;
        SubLObject var201 = f49169(var199);
        SubLObject var202 = (SubLObject)NIL;
        var202 = var201.first();
        while (NIL != var201) {
            if (NIL != f49170(var202, var199, var5)) {
                var200 = (SubLObject)ConsesLow.cons(var202, var200);
            }
            var201 = var201.rest();
            var202 = var201.first();
        }
        return Sort.stable_sort(module0751.f47009(var200, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)$ic51$), (SubLObject)$ic52$);
    }
    
    public static SubLObject f49171(final SubLObject var201) {
        final SubLObject var202 = module0178.f11334(var201);
        return Sequences.length(module0205.f13183(var202, (SubLObject)$ic53$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f49170(final SubLObject var201, final SubLObject var199, SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)$ic1$;
        }
        return Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)ONE_INTEGER), f49172(var201, module0205.f13144(var199), var5));
    }
    
    public static SubLObject f49173(final SubLObject var201, final SubLObject var199, SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)$ic1$;
        }
        final SubLThread var202 = SubLProcess.currentSubLThread();
        final SubLObject var203 = module0178.f11334(var201);
        var202.resetMultipleValues();
        final SubLObject var204 = f49174(var203);
        final SubLObject var205 = var202.secondMultipleValue();
        var202.resetMultipleValues();
        final SubLObject var206 = f49175(var204, var199);
        if (NIL == var206) {
            return Values.values((SubLObject)NIL, (SubLObject)NIL);
        }
        if (NIL != module0233.f15393(var206)) {
            return Values.values((SubLObject)NIL, (SubLObject)T);
        }
        if (NIL != module0233.f15349(var206)) {
            return f49176(var206, var205, var201, var199);
        }
        if (NIL != module0077.f5302(var206)) {
            final SubLObject var207 = module0077.f5333(var206);
            SubLObject var208;
            SubLObject var209;
            SubLObject var210;
            SubLObject var211;
            SubLObject var212;
            for (var208 = module0032.f1741(var207), var209 = (SubLObject)NIL, var209 = module0032.f1742(var208, var207); NIL == module0032.f1744(var208, var209); var209 = module0032.f1743(var209)) {
                var210 = module0032.f1745(var208, var209);
                if (NIL != module0032.f1746(var209, var210)) {
                    var202.resetMultipleValues();
                    var211 = f49176(var210, var205, var201, var199);
                    var212 = var202.secondMultipleValue();
                    var202.resetMultipleValues();
                    if (NIL != var212) {
                        return Values.values(var211, var212);
                    }
                }
            }
            return Values.values((SubLObject)NIL, (SubLObject)NIL);
        }
        Errors.error((SubLObject)$ic55$, var204, var199, var206);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49172(final SubLObject var201, final SubLObject var199, SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)$ic1$;
        }
        final SubLThread var202 = SubLProcess.currentSubLThread();
        final SubLObject var203 = module0034.$g879$.getDynamicValue(var202);
        SubLObject var204 = (SubLObject)NIL;
        if (NIL == var203) {
            return f49173(var201, var199, var5);
        }
        var204 = module0034.f1857(var203, (SubLObject)$ic54$, (SubLObject)UNPROVIDED);
        if (NIL == var204) {
            var204 = module0034.f1807(module0034.f1842(var203), (SubLObject)$ic54$, (SubLObject)THREE_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var203, (SubLObject)$ic54$, var204);
        }
        final SubLObject var205 = module0034.f1781(var201, var199, var5);
        final SubLObject var206 = module0034.f1814(var204, var205, (SubLObject)UNPROVIDED);
        if (var206 != $ic22$) {
            SubLObject var207 = var206;
            SubLObject var208 = (SubLObject)NIL;
            var208 = var207.first();
            while (NIL != var207) {
                SubLObject var209 = var208.first();
                final SubLObject var210 = conses_high.second(var208);
                if (var201.equal(var209.first())) {
                    var209 = var209.rest();
                    if (var199.equal(var209.first())) {
                        var209 = var209.rest();
                        if (NIL != var209 && NIL == var209.rest() && var5.equal(var209.first())) {
                            return module0034.f1959(var210);
                        }
                    }
                }
                var207 = var207.rest();
                var208 = var207.first();
            }
        }
        final SubLObject var211 = Values.arg2(var202.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f49173(var201, var199, var5)));
        module0034.f1836(var204, var205, var206, var211, (SubLObject)ConsesLow.list(var201, var199, var5));
        return module0034.f1959(var211);
    }
    
    public static SubLObject f49174(final SubLObject var243) {
        final SubLObject var244 = f49177(var243);
        final SubLObject var245 = f49178(var243);
        SubLObject var246 = module0202.f12702(var243);
        SubLObject var247 = (SubLObject)NIL;
        SubLObject var248 = (SubLObject)NIL;
        SubLObject var249 = (SubLObject)NIL;
        SubLObject var250 = (SubLObject)NIL;
        var248 = ConsesLow.append(var244, var245);
        var249 = var248.first();
        for (var250 = (SubLObject)ZERO_INTEGER; NIL != var248; var248 = var248.rest(), var249 = var248.first(), var250 = Numbers.add((SubLObject)ONE_INTEGER, var250)) {
            final SubLObject var251 = module0193.f12075(var250);
            var246 = module0205.f13250(var251, var249, var246, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var247 = (SubLObject)ConsesLow.cons(module0233.f15340(var251, var249), var247);
        }
        return Values.values(var246, var247);
    }
    
    public static SubLObject f49176(SubLObject var246, final SubLObject var245, final SubLObject var201, final SubLObject var199) {
        var246 = f49179(var246);
        final SubLObject var247 = module0178.f11335(var201);
        final SubLObject var248 = module0178.f11334(var201);
        SubLObject var249 = module0233.f15362(var245, var246);
        final SubLObject var250 = module0205.f13183(var247, (SubLObject)$ic56$, (SubLObject)NIL, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY), (SubLObject)NIL);
        SubLObject var251 = var249;
        SubLObject var252 = (SubLObject)NIL;
        var252 = var251.first();
        while (NIL != var251) {
            SubLObject var254;
            final SubLObject var253 = var254 = var252;
            SubLObject var255 = (SubLObject)NIL;
            SubLObject var256 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var254, var253, (SubLObject)$ic57$);
            var255 = var254.first();
            var254 = (var256 = var254.rest());
            if (NIL != module0201.f12546(var255) && NIL == module0201.f12546(var256)) {
                if (NIL != module0578.f35470((SubLObject)ONE_INTEGER) && NIL == module0578.f35477()) {
                    Errors.warn((SubLObject)$ic58$, var255, var256);
                }
                return Values.values((SubLObject)NIL, (SubLObject)NIL);
            }
            var251 = var251.rest();
            var252 = var251.first();
        }
        var251 = var250;
        SubLObject var257 = (SubLObject)NIL;
        var257 = var251.first();
        while (NIL != var251) {
            final SubLObject var258 = module0751.f46672(var257, var199);
            if (NIL != f49180(var258, var257, var248, var249)) {
                var249 = module0035.f2063(var249, var257, var258, (SubLObject)UNPROVIDED);
            }
            var251 = var251.rest();
            var257 = var251.first();
        }
        SubLObject var259 = (SubLObject)NIL;
        final SubLObject var260 = module0205.f13154(var199);
        SubLObject var261;
        SubLObject var262;
        SubLObject var263;
        SubLObject var265;
        SubLObject var264;
        SubLObject var266;
        SubLObject var267;
        SubLObject var268;
        for (var261 = (SubLObject)NIL, var262 = (SubLObject)NIL, var262 = var249; NIL == var261 && NIL != var262; var262 = var262.rest()) {
            var263 = var262.first();
            var264 = (var265 = var263);
            var266 = (SubLObject)NIL;
            var267 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var265, var264, (SubLObject)$ic57$);
            var266 = var265.first();
            var265 = (var267 = var265.rest());
            var268 = f49181(var267, var260);
            if (NIL == module0751.f46924(var268)) {
                if (NIL != module0578.f35470((SubLObject)ONE_INTEGER) && NIL == module0578.f35477()) {
                    Errors.warn((SubLObject)$ic59$, var267, var199);
                }
                var261 = (SubLObject)T;
            }
            if (NIL != module0751.f46924(var268)) {
                var259 = module0035.f2063(var259, var266, var268, (SubLObject)UNPROVIDED);
            }
        }
        return Values.values(var259, (SubLObject)makeBoolean(NIL == var261));
    }
    
    public static SubLObject f49181(final SubLObject var265, final SubLObject var199) {
        final SubLObject var266 = module0205.f13397(module0205.f13144(var265), var199, Symbols.symbol_function((SubLObject)EQUAL));
        return (NIL != var266) ? var266.first() : module0751.f46705();
    }
    
    public static SubLObject f49180(final SubLObject var267, final SubLObject var266, final SubLObject var243, final SubLObject var275) {
        final SubLObject var276 = module0751.f46672(var266, var243);
        if (var276.equal(var267)) {
            return (SubLObject)T;
        }
        if (var267.equal(module0035.f2293(var275, var276, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED))) {
            return (SubLObject)T;
        }
        if (NIL != module0578.f35470((SubLObject)ONE_INTEGER) && NIL == module0578.f35477()) {
            Errors.warn((SubLObject)$ic60$, var267, var266, var243);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49177(final SubLObject var243) {
        return module0205.f13183(var243, Symbols.symbol_function((SubLObject)$ic61$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49178(final SubLObject var243) {
        return module0205.f13183(var243, (SubLObject)$ic62$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49175(final SubLObject var277, final SubLObject var199) {
        final SubLObject var278 = f49182(var199);
        final SubLObject var279 = f49183(var277, var278);
        return var279;
    }
    
    public static SubLObject f49182(final SubLObject var279) {
        return module0205.f13147(var279, (SubLObject)$ic62$, (SubLObject)$ic63$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49179(final SubLObject var279) {
        return module0036.f2531(var279, (SubLObject)$ic64$, (SubLObject)$ic65$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49184(final SubLObject var280, final SubLObject var281) {
        return (SubLObject)makeBoolean(NIL != module0234.f15434(module0205.f13132(var280), module0205.f13132(var281)) && NIL != f49185(module0205.f13207(var280, (SubLObject)UNPROVIDED), module0205.f13207(var281, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f49185(final SubLObject var282, final SubLObject var283) {
        if (var282.isAtom()) {
            return module0234.f15434(var282, var283);
        }
        if (NIL != module0035.f1996(var282)) {
            return module0234.f15434(var282, var283);
        }
        if (var282.isList() && var283.isList() && NIL != module0035.f2004(var282, var283)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49186() {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        if ($g6165$.getDynamicValue(var6).numG($g6164$.getGlobalValue())) {
            final SubLObject var7 = Sequences.cconcatenate((SubLObject)$ic38$, new SubLObject[] { module0006.f205((SubLObject)ONE_INTEGER), $ic39$, module0006.f203((SubLObject)$ic69$) });
            module0578.f35476(var7, (SubLObject)ConsesLow.list($g6164$.getGlobalValue()));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49187(final SubLObject var284) {
        return (SubLObject)makeBoolean(NIL != module0173.f10955(var284) && NIL != module0269.f17761(var284));
    }
    
    public static SubLObject f49183(final SubLObject var277, final SubLObject var1) {
        final SubLThread var278 = SubLProcess.currentSubLThread();
        SubLObject var279 = (SubLObject)NIL;
        SubLObject var280 = (SubLObject)NIL;
        final SubLObject var281 = module0234.$g2433$.currentBinding(var278);
        final SubLObject var282 = module0234.$g2432$.currentBinding(var278);
        final SubLObject var283 = module0234.$g2434$.currentBinding(var278);
        try {
            module0234.$g2433$.bind(Symbols.symbol_function((SubLObject)$ic70$), var278);
            module0234.$g2432$.bind(Symbols.symbol_function((SubLObject)$ic66$), var278);
            module0234.$g2434$.bind((SubLObject)T, var278);
            var278.resetMultipleValues();
            final SubLObject var284 = module0234.f15444(var277, var1, (SubLObject)T, (SubLObject)UNPROVIDED);
            final SubLObject var285 = var278.secondMultipleValue();
            var278.resetMultipleValues();
            if (NIL != var284) {
                var280 = (SubLObject)((NIL != module0233.f15393(var284)) ? NIL : var284);
                var279 = (SubLObject)T;
            }
        }
        finally {
            module0234.$g2434$.rebind(var283, var278);
            module0234.$g2432$.rebind(var282, var278);
            module0234.$g2433$.rebind(var281, var278);
        }
        return Values.values(var280, var279);
    }
    
    public static SubLObject f49188(final SubLObject var277, final SubLObject var1, SubLObject var197) {
        if (var197 == UNPROVIDED) {
            var197 = (SubLObject)NIL;
        }
        final SubLThread var278 = SubLProcess.currentSubLThread();
        SubLObject var279 = (SubLObject)NIL;
        f49186();
        final SubLObject var280 = $g6165$.currentBinding(var278);
        try {
            $g6165$.bind(module0048.f_1X($g6165$.getDynamicValue(var278)), var278);
            var279 = f49189(var277, var1, var197);
        }
        finally {
            $g6165$.rebind(var280, var278);
        }
        return (NIL != var279) ? var279 : module0234.f15449(var277, var1);
    }
    
    public static SubLObject f49190(final SubLObject var277, final SubLObject var1, final SubLObject var197) {
        final SubLThread var278 = SubLProcess.currentSubLThread();
        if (NIL == module0234.$g2434$.getDynamicValue(var278)) {
            final SubLObject var279 = Sequences.cconcatenate((SubLObject)$ic38$, new SubLObject[] { module0006.f205((SubLObject)ONE_INTEGER), $ic39$, module0006.f203((SubLObject)$ic72$) });
            module0578.f35476(var279, (SubLObject)ConsesLow.list(EMPTY_SUBL_OBJECT_ARRAY));
        }
        SubLObject var280 = (SubLObject)NIL;
        final SubLObject var281 = module0205.f13132(var277);
        final SubLObject var282 = module0205.f13132(var1);
        final SubLObject var283 = module0234.f15445(var281, var282, (SubLObject)T, var197, (SubLObject)UNPROVIDED);
        final SubLObject var284 = f49191(var283);
        final SubLObject var285 = (SubLObject)NIL;
        if (NIL != module0035.sublisp_boolean(var283)) {
            final SubLObject var286 = module0205.f13207(var277, (SubLObject)UNPROVIDED);
            final SubLObject var287 = module0205.f13207(var1, (SubLObject)UNPROVIDED);
            final SubLObject var288 = $g6163$.currentBinding(var278);
            final SubLObject var289 = module0234.$g2432$.currentBinding(var278);
            try {
                $g6163$.bind((SubLObject)makeBoolean(var286.isList() && var287.isList() && (NIL != f49187(var281) || NIL != f49187(var282))), var278);
                module0234.$g2432$.bind(Symbols.symbol_function((SubLObject)$ic66$), var278);
                var280 = f49192(var286, var287, var284);
            }
            finally {
                module0234.$g2432$.rebind(var289, var278);
                $g6163$.rebind(var288, var278);
            }
        }
        if (NIL != var285) {
            if (NIL == var280) {
                Errors.warn((SubLObject)$ic73$, var277, var1, var197);
            }
            if (NIL != module0077.f5302(var280)) {
                Errors.warn((SubLObject)$ic74$, new SubLObject[] { var277, var1, var197, module0077.f5312(var280) });
            }
        }
        return var280;
    }
    
    public static SubLObject f49189(final SubLObject var277, final SubLObject var1, final SubLObject var197) {
        final SubLThread var278 = SubLProcess.currentSubLThread();
        final SubLObject var279 = module0034.$g879$.getDynamicValue(var278);
        SubLObject var280 = (SubLObject)NIL;
        if (NIL == var279) {
            return f49190(var277, var1, var197);
        }
        var280 = module0034.f1857(var279, (SubLObject)$ic71$, (SubLObject)UNPROVIDED);
        if (NIL == var280) {
            var280 = module0034.f1807(module0034.f1842(var279), (SubLObject)$ic71$, (SubLObject)THREE_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var279, (SubLObject)$ic71$, var280);
        }
        final SubLObject var281 = module0034.f1781(var277, var1, var197);
        final SubLObject var282 = module0034.f1814(var280, var281, (SubLObject)UNPROVIDED);
        if (var282 != $ic22$) {
            SubLObject var283 = var282;
            SubLObject var284 = (SubLObject)NIL;
            var284 = var283.first();
            while (NIL != var283) {
                SubLObject var285 = var284.first();
                final SubLObject var286 = conses_high.second(var284);
                if (var277.equal(var285.first())) {
                    var285 = var285.rest();
                    if (var1.equal(var285.first())) {
                        var285 = var285.rest();
                        if (NIL != var285 && NIL == var285.rest() && var197.equal(var285.first())) {
                            return module0034.f1959(var286);
                        }
                    }
                }
                var283 = var283.rest();
                var284 = var283.first();
            }
        }
        final SubLObject var287 = Values.arg2(var278.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f49190(var277, var1, var197)));
        module0034.f1836(var280, var281, var282, var287, (SubLObject)ConsesLow.list(var277, var1, var197));
        return module0034.f1959(var287);
    }
    
    public static SubLObject f49191(final SubLObject var246) {
        return (SubLObject)((NIL != module0233.f15393(var246)) ? NIL : var246);
    }
    
    public static SubLObject f49192(final SubLObject var293, final SubLObject var294, final SubLObject var291) {
        final SubLThread var295 = SubLProcess.currentSubLThread();
        f49186();
        return f49193(var293, var294, var291, $g6163$.getDynamicValue(var295));
    }
    
    public static SubLObject f49194(final SubLObject var293, final SubLObject var294, final SubLObject var295, final SubLObject var296) {
        SubLObject var297 = (SubLObject)NIL;
        if (NIL == var293) {
            var297 = module0234.f15445(var293, var294, (SubLObject)T, var295, (SubLObject)UNPROVIDED);
        }
        else if (NIL != var296 && NIL != module0035.f1994(var293, $g6166$.getGlobalValue(), (SubLObject)UNPROVIDED)) {
            var297 = f49195(var293, var294, var295);
        }
        else {
            if (NIL != var296) {
                if (NIL != module0578.f35470((SubLObject)ONE_INTEGER) && NIL == module0578.f35477()) {
                    Errors.warn((SubLObject)$ic76$, Sequences.length(var293), var293, var294);
                }
                return f49193(var293, var294, var295, (SubLObject)NIL);
            }
            var297 = f49196(var293, var294, var295);
        }
        return var297;
    }
    
    public static SubLObject f49193(final SubLObject var293, final SubLObject var294, final SubLObject var295, final SubLObject var296) {
        final SubLThread var297 = SubLProcess.currentSubLThread();
        final SubLObject var298 = module0034.$g879$.getDynamicValue(var297);
        SubLObject var299 = (SubLObject)NIL;
        if (NIL == var298) {
            return f49194(var293, var294, var295, var296);
        }
        var299 = module0034.f1857(var298, (SubLObject)$ic75$, (SubLObject)UNPROVIDED);
        if (NIL == var299) {
            var299 = module0034.f1807(module0034.f1842(var298), (SubLObject)$ic75$, (SubLObject)FOUR_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var298, (SubLObject)$ic75$, var299);
        }
        final SubLObject var300 = module0034.f1780(var293, var294, var295, var296);
        final SubLObject var301 = module0034.f1814(var299, var300, (SubLObject)UNPROVIDED);
        if (var301 != $ic22$) {
            SubLObject var302 = var301;
            SubLObject var303 = (SubLObject)NIL;
            var303 = var302.first();
            while (NIL != var302) {
                SubLObject var304 = var303.first();
                final SubLObject var305 = conses_high.second(var303);
                if (var293.equal(var304.first())) {
                    var304 = var304.rest();
                    if (var294.equal(var304.first())) {
                        var304 = var304.rest();
                        if (var295.equal(var304.first())) {
                            var304 = var304.rest();
                            if (NIL != var304 && NIL == var304.rest() && var296.equal(var304.first())) {
                                return module0034.f1959(var305);
                            }
                        }
                    }
                }
                var302 = var302.rest();
                var303 = var302.first();
            }
        }
        final SubLObject var306 = Values.arg2(var297.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f49194(var293, var294, var295, var296)));
        module0034.f1836(var299, var300, var301, var306, (SubLObject)ConsesLow.list(var293, var294, var295, var296));
        return module0034.f1959(var306);
    }
    
    public static SubLObject f49196(final SubLObject var293, final SubLObject var294, final SubLObject var295) {
        final SubLThread var296 = SubLProcess.currentSubLThread();
        f49186();
        final SubLObject var297 = module0234.f15445(var293.first(), var294.first(), (SubLObject)T, var295, (SubLObject)UNPROVIDED);
        final SubLObject var298 = (NIL != module0233.f15393(var297)) ? var295 : var297;
        SubLObject var299 = (SubLObject)NIL;
        if (NIL != var295 && NIL != module0233.f15393(var297)) {
            final SubLObject var300 = Sequences.cconcatenate((SubLObject)$ic38$, new SubLObject[] { module0006.f205((SubLObject)ONE_INTEGER), $ic39$, module0006.f203((SubLObject)$ic77$) });
            module0578.f35476(var300, (SubLObject)ConsesLow.list((NIL != module0077.f5302(var295)) ? module0077.f5312(var295) : var295));
        }
        if (NIL != module0035.sublisp_boolean(var297)) {
            final SubLObject var301 = $g6163$.currentBinding(var296);
            final SubLObject var302 = $g6165$.currentBinding(var296);
            try {
                $g6163$.bind((SubLObject)NIL, var296);
                $g6165$.bind(module0048.f_1X($g6165$.getDynamicValue(var296)), var296);
                var299 = f49192(var293.rest(), var294.rest(), var298);
            }
            finally {
                $g6165$.rebind(var302, var296);
                $g6163$.rebind(var301, var296);
            }
        }
        return var299;
    }
    
    public static SubLObject f49195(final SubLObject var293, final SubLObject var294, final SubLObject var295) {
        final SubLThread var296 = SubLProcess.currentSubLThread();
        f49186();
        SubLObject var297 = (SubLObject)NIL;
        final SubLObject var298 = f49197(var293);
        SubLObject var299 = (SubLObject)ZERO_INTEGER;
        SubLObject var300 = (SubLObject)ZERO_INTEGER;
        final SubLObject var301 = $g6165$.currentBinding(var296);
        try {
            $g6165$.bind(module0048.f_1X($g6165$.getDynamicValue(var296)), var296);
            SubLObject var302 = var298;
            SubLObject var303 = (SubLObject)NIL;
            var303 = var302.first();
            while (NIL != var302) {
                final SubLObject var304 = module0234.f15434(var303, var294);
                final SubLObject var305 = (SubLObject)((NIL != var304) ? f49196(var303, var294, var295) : NIL);
                if (NIL == var304) {
                    var300 = Numbers.add(var300, (SubLObject)ONE_INTEGER);
                }
                else if (NIL != var305) {
                    if (NIL == var297) {
                        var297 = var305;
                    }
                    else if (NIL != module0077.f5302(var297)) {
                        module0077.f5326(var305, var297);
                    }
                    else {
                        var297 = module0078.f5369(var297, Symbols.symbol_function((SubLObject)EQUAL));
                        module0077.f5326(var305, var297);
                    }
                }
                var299 = Numbers.add(var299, (SubLObject)ONE_INTEGER);
                var302 = var302.rest();
                var303 = var302.first();
            }
        }
        finally {
            $g6165$.rebind(var301, var296);
        }
        return var297;
    }
    
    public static SubLObject f49197(final SubLObject var305) {
        final SubLObject var306 = module0035.f2160(Sequences.length(var305), (SubLObject)UNPROVIDED);
        final SubLObject var307 = module0035.f2475(var306, (SubLObject)NIL);
        SubLObject var308 = (SubLObject)NIL;
        SubLObject var309 = var307;
        SubLObject var310 = (SubLObject)NIL;
        var310 = var309.first();
        while (NIL != var309) {
            SubLObject var311 = (SubLObject)NIL;
            SubLObject var147_311 = var310;
            SubLObject var312 = (SubLObject)NIL;
            var312 = var147_311.first();
            while (NIL != var147_311) {
                var311 = (SubLObject)ConsesLow.cons(ConsesLow.nth(var312, var305), var311);
                var147_311 = var147_311.rest();
                var312 = var147_311.first();
            }
            var308 = (SubLObject)ConsesLow.cons(var311, var308);
            var309 = var309.rest();
            var310 = var309.first();
        }
        return var308;
    }
    
    public static SubLObject f49161(final SubLObject var201, final SubLObject var199, final SubLObject var69) {
        final SubLThread var202 = SubLProcess.currentSubLThread();
        final SubLObject var203 = module0178.f11335(var201);
        SubLObject var204 = (SubLObject)NIL;
        final SubLObject var205 = module0579.$g4331$.currentBinding(var202);
        try {
            module0579.$g4331$.bind((SubLObject)NIL, var202);
            var204 = module0763.f48248(var203, module0751.f46691());
        }
        finally {
            module0579.$g4331$.rebind(var205, var202);
        }
        final SubLObject var206 = f49172(var201, var199, (SubLObject)UNPROVIDED);
        if (NIL != var206 && NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic78$, var206, var69);
        }
        final SubLObject var207 = module0205.f13154(var199);
        SubLObject var208 = var206;
        SubLObject var209 = (SubLObject)NIL;
        var209 = var208.first();
        while (NIL != var208) {
            SubLObject var211;
            final SubLObject var210 = var211 = var209;
            SubLObject var212 = (SubLObject)NIL;
            SubLObject var213 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var211, var210, (SubLObject)$ic79$);
            var212 = var211.first();
            var211 = (var213 = var211.rest());
            var202.resetMultipleValues();
            final SubLObject var214 = module0751.f46621(var207, var213);
            final SubLObject var215 = var202.secondMultipleValue();
            var202.resetMultipleValues();
            if (NIL != var215) {
                final SubLObject var216 = Sequences.cconcatenate((SubLObject)$ic38$, new SubLObject[] { module0006.f205((SubLObject)ONE_INTEGER), $ic39$, module0006.f203((SubLObject)$ic80$) });
                module0578.f35476(var216, (SubLObject)ConsesLow.list(var213, var199));
            }
            if (!var212.equal(var214)) {
                if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic81$, new SubLObject[] { var212, var214, module0751.f46982(var213, var69) });
                }
                final SubLObject var217 = module0751.f46982(var213, var69);
                SubLObject var218 = module0756.f47754(var214, var212, var204, Symbols.symbol_function((SubLObject)EQUAL), var217);
                if (NIL != module0756.f47547(var204) && NIL != module0756.f47559(var204, var212, var214)) {
                    var218 = (SubLObject)T;
                }
                if (NIL == var218 && NIL != module0578.f35470((SubLObject)TWO_INTEGER) && NIL == module0578.f35477()) {
                    Errors.warn((SubLObject)$ic82$, var214, var212, var204);
                }
            }
            var208 = var208.rest();
            var209 = var208.first();
        }
        module0756.f47567(var204);
        return var204;
    }
    
    public static SubLObject f49198(final SubLObject var201) {
        final SubLThread var202 = SubLProcess.currentSubLThread();
        SubLObject var203 = module0202.f12702(module0178.f11334(var201));
        SubLObject var205;
        final SubLObject var204 = var205 = f49177(var203);
        SubLObject var206 = (SubLObject)NIL;
        var206 = var205.first();
        while (NIL != var205) {
            final SubLObject var207 = module0754.f47360(var206, var203, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).first();
            final SubLObject var208 = (NIL != var207) ? var207 : $ic83$;
            final SubLObject var209 = module0202.f12769($ic84$, (SubLObject)$ic85$, var208, Guids.guid_to_string(Guids.new_guid()));
            var203 = module0205.f13250(var209, var206, var203, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var205 = var205.rest();
            var206 = var205.first();
        }
        return module0172.f10930(module0285.f18875(var203, module0579.$g4260$.getDynamicValue(var202)));
    }
    
    public static SubLObject f49199(SubLObject var324) {
        if (var324 == UNPROVIDED) {
            var324 = (SubLObject)$ic86$;
        }
        final SubLThread var325 = SubLProcess.currentSubLThread();
        final SubLObject var326 = module0147.$g2094$.currentBinding(var325);
        final SubLObject var327 = module0147.$g2095$.currentBinding(var325);
        final SubLObject var328 = module0580.$g4361$.currentBinding(var325);
        try {
            module0147.$g2094$.bind((SubLObject)$ic45$, var325);
            module0147.$g2095$.bind($ic46$, var325);
            module0580.$g4361$.bind((SubLObject)NIL, var325);
            var325.resetMultipleValues();
            final SubLObject var12_325 = module0580.$g4362$.currentBinding(var325);
            try {
                module0580.$g4362$.bind(module0580.f35560(), var325);
                final SubLObject var329 = var325.secondMultipleValue();
                var325.resetMultipleValues();
                try {
                    var325.resetMultipleValues();
                    final SubLObject var12_326 = module0580.$g4358$.currentBinding(var325);
                    try {
                        module0580.$g4358$.bind(module0580.f35544(), var325);
                        final SubLObject var330 = var325.secondMultipleValue();
                        var325.resetMultipleValues();
                        final SubLObject var12_327 = module0580.$g4359$.currentBinding(var325);
                        try {
                            module0580.$g4359$.bind(module0580.f35545(), var325);
                            final SubLObject var331 = module0580.$g4358$.getDynamicValue(var325);
                            final SubLObject var12_328 = module0034.$g879$.currentBinding(var325);
                            try {
                                module0034.$g879$.bind(var331, var325);
                                SubLObject var332 = (SubLObject)NIL;
                                if (NIL != var331 && NIL == module0034.f1842(var331)) {
                                    var332 = module0034.f1869(var331);
                                    final SubLObject var333 = Threads.current_process();
                                    if (NIL == var332) {
                                        module0034.f1873(var331, var333);
                                    }
                                    else if (!var332.eql(var333)) {
                                        Errors.error((SubLObject)$ic5$);
                                    }
                                }
                                try {
                                    final SubLObject var334 = module0217.f14247($ic47$, (SubLObject)UNPROVIDED);
                                    SubLObject var335 = (SubLObject)ZERO_INTEGER;
                                    SubLObject var336 = (SubLObject)ZERO_INTEGER;
                                    SubLObject var337 = (SubLObject)NIL;
                                    final SubLObject var338 = Time.get_internal_real_time();
                                    final SubLObject var12_329 = module0012.$g75$.currentBinding(var325);
                                    final SubLObject var13_335 = module0012.$g76$.currentBinding(var325);
                                    final SubLObject var14_336 = module0012.$g77$.currentBinding(var325);
                                    final SubLObject var339 = module0012.$g78$.currentBinding(var325);
                                    try {
                                        module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var325);
                                        module0012.$g76$.bind((SubLObject)NIL, var325);
                                        module0012.$g77$.bind((SubLObject)T, var325);
                                        module0012.$g78$.bind(Time.get_universal_time(), var325);
                                        module0012.f478((SubLObject)$ic87$);
                                        final SubLObject var340 = $ic47$;
                                        if (NIL != module0158.f10038(var340)) {
                                            final SubLObject var341 = (SubLObject)NIL;
                                            final SubLObject var12_330 = module0012.$g73$.currentBinding(var325);
                                            final SubLObject var13_336 = module0012.$g65$.currentBinding(var325);
                                            final SubLObject var14_337 = module0012.$g67$.currentBinding(var325);
                                            final SubLObject var220_340 = module0012.$g68$.currentBinding(var325);
                                            final SubLObject var342 = module0012.$g66$.currentBinding(var325);
                                            final SubLObject var343 = module0012.$g69$.currentBinding(var325);
                                            final SubLObject var344 = module0012.$g70$.currentBinding(var325);
                                            final SubLObject var345 = module0012.$silent_progressP$.currentBinding(var325);
                                            try {
                                                module0012.$g73$.bind(Time.get_universal_time(), var325);
                                                module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var325), var325);
                                                module0012.$g67$.bind((SubLObject)ONE_INTEGER, var325);
                                                module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var325);
                                                module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var325);
                                                module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var325);
                                                module0012.$g70$.bind((SubLObject)T, var325);
                                                module0012.$silent_progressP$.bind((SubLObject)((NIL != var341) ? module0012.$silent_progressP$.getDynamicValue(var325) : T), var325);
                                                module0012.f474(var341);
                                                final SubLObject var346 = module0158.f10039(var340);
                                                SubLObject var347 = (SubLObject)NIL;
                                                final SubLObject var348 = (SubLObject)NIL;
                                                while (NIL == var347) {
                                                    final SubLObject var349 = module0052.f3695(var346, var348);
                                                    final SubLObject var350 = (SubLObject)makeBoolean(!var348.eql(var349));
                                                    if (NIL != var350) {
                                                        module0012.f476();
                                                        SubLObject var351 = (SubLObject)NIL;
                                                        try {
                                                            var351 = module0158.f10316(var349, (SubLObject)$ic35$, (SubLObject)NIL, (SubLObject)NIL);
                                                            SubLObject var187_341 = (SubLObject)NIL;
                                                            final SubLObject var188_342 = (SubLObject)NIL;
                                                            while (NIL == var187_341) {
                                                                final SubLObject var352 = module0052.f3695(var351, var188_342);
                                                                final SubLObject var190_343 = (SubLObject)makeBoolean(!var188_342.eql(var352));
                                                                if (NIL != var190_343) {
                                                                    final SubLObject var353 = f49200(var352, var324);
                                                                    var335 = Numbers.add(var335, (SubLObject)ONE_INTEGER);
                                                                    if (NIL != var353) {
                                                                        var336 = Numbers.add(var336, (SubLObject)ONE_INTEGER);
                                                                    }
                                                                    module0012.note_percent_progress(var335, var334);
                                                                }
                                                                var187_341 = (SubLObject)makeBoolean(NIL == var190_343);
                                                            }
                                                        }
                                                        finally {
                                                            final SubLObject var12_331 = Threads.$is_thread_performing_cleanupP$.currentBinding(var325);
                                                            try {
                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var325);
                                                                if (NIL != var351) {
                                                                    module0158.f10319(var351);
                                                                }
                                                            }
                                                            finally {
                                                                Threads.$is_thread_performing_cleanupP$.rebind(var12_331, var325);
                                                            }
                                                        }
                                                    }
                                                    var347 = (SubLObject)makeBoolean(NIL == var350);
                                                }
                                                module0012.f475();
                                            }
                                            finally {
                                                module0012.$silent_progressP$.rebind(var345, var325);
                                                module0012.$g70$.rebind(var344, var325);
                                                module0012.$g69$.rebind(var343, var325);
                                                module0012.$g66$.rebind(var342, var325);
                                                module0012.$g68$.rebind(var220_340, var325);
                                                module0012.$g67$.rebind(var14_337, var325);
                                                module0012.$g65$.rebind(var13_336, var325);
                                                module0012.$g73$.rebind(var12_330, var325);
                                            }
                                        }
                                        module0012.f479();
                                    }
                                    finally {
                                        module0012.$g78$.rebind(var339, var325);
                                        module0012.$g77$.rebind(var14_336, var325);
                                        module0012.$g76$.rebind(var13_335, var325);
                                        module0012.$g75$.rebind(var12_329, var325);
                                    }
                                    var337 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var338), time_high.$internal_time_units_per_second$.getGlobalValue());
                                    PrintLow.format((SubLObject)T, (SubLObject)$ic88$, new SubLObject[] { var336, var334, var337 });
                                }
                                finally {
                                    final SubLObject var12_332 = Threads.$is_thread_performing_cleanupP$.currentBinding(var325);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var325);
                                        if (NIL != var331 && NIL == var332) {
                                            module0034.f1873(var331, (SubLObject)NIL);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var12_332, var325);
                                    }
                                }
                            }
                            finally {
                                module0034.$g879$.rebind(var12_328, var325);
                            }
                        }
                        finally {
                            module0580.$g4359$.rebind(var12_327, var325);
                        }
                        if (var330 == $ic6$ && NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var325))) {
                            module0034.f1891(module0580.$g4358$.getDynamicValue(var325));
                        }
                    }
                    finally {
                        module0580.$g4358$.rebind(var12_326, var325);
                    }
                }
                finally {
                    final SubLObject var12_333 = Threads.$is_thread_performing_cleanupP$.currentBinding(var325);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var325);
                        if (NIL == var329) {
                            module0580.f35554(module0580.$g4362$.getDynamicValue(var325));
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var12_333, var325);
                    }
                }
            }
            finally {
                module0580.$g4362$.rebind(var12_325, var325);
            }
        }
        finally {
            module0580.$g4361$.rebind(var328, var325);
            module0147.$g2095$.rebind(var327, var325);
            module0147.$g2094$.rebind(var326, var325);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49200(final SubLObject var201, final SubLObject var324) {
        final SubLObject var325 = f49198(var201);
        return f49201(var201, var324, var325);
    }
    
    public static SubLObject f49201(final SubLObject var201, final SubLObject var324, final SubLObject var199) {
        final SubLThread var325 = SubLProcess.currentSubLThread();
        SubLObject var326 = (SubLObject)NIL;
        SubLObject var327 = (SubLObject)NIL;
        SubLObject var328 = (SubLObject)NIL;
        final SubLObject var329 = module0003.f61();
        try {
            var325.throwStack.push(var329);
            final SubLObject var330 = module0003.$g4$.currentBinding(var325);
            try {
                module0003.$g4$.bind((SubLObject)T, var325);
                SubLObject var331 = (SubLObject)NIL;
                try {
                    final SubLObject var12_352 = module0003.$g5$.currentBinding(var325);
                    try {
                        module0003.$g5$.bind(Numbers.add((SubLObject)ONE_INTEGER, module0003.$g5$.getDynamicValue(var325)), var325);
                        var331 = module0003.f62(var324, var329);
                        var327 = f49160(var199, (SubLObject)$ic1$);
                    }
                    finally {
                        module0003.$g5$.rebind(var12_352, var325);
                    }
                }
                finally {
                    final SubLObject var12_353 = Threads.$is_thread_performing_cleanupP$.currentBinding(var325);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var325);
                        module0003.f64(var331);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var12_353, var325);
                    }
                }
            }
            finally {
                module0003.$g4$.rebind(var330, var325);
            }
        }
        catch (Throwable var332) {
            var328 = Errors.handleThrowable(var332, var329);
        }
        finally {
            var325.throwStack.pop();
        }
        if (NIL != var328) {
            Errors.warn((SubLObject)$ic89$, var324, var201);
        }
        else if (NIL == module0004.f104(var201, var327, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            Errors.warn((SubLObject)$ic90$, var201);
        }
        else {
            var326 = (SubLObject)T;
        }
        return var326;
    }
    
    public static SubLObject f49202(SubLObject var1, SubLObject var5, SubLObject var69, SubLObject var354) {
        if (var5 == UNPROVIDED) {
            var5 = f49139();
        }
        if (var69 == UNPROVIDED) {
            var69 = module0751.f47200();
        }
        if (var354 == UNPROVIDED) {
            var354 = (SubLObject)NIL;
        }
        final SubLThread var355 = SubLProcess.currentSubLThread();
        final SubLObject var356 = module0751.f46804(module0035.remove_if_not((SubLObject)$ic91$, module0754.f47324(var1, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        SubLObject var357 = (SubLObject)NIL;
        SubLObject var358 = module0751.f46705();
        SubLObject var359 = (SubLObject)NIL;
        final SubLObject var360 = f49154(var5);
        SubLObject var361 = (SubLObject)NIL;
        SubLObject var362 = (SubLObject)NIL;
        SubLObject var363 = (SubLObject)NIL;
        SubLObject var364 = (SubLObject)NIL;
        SubLObject var365 = (SubLObject)NIL;
        if (NIL == var359) {
            SubLObject var366;
            SubLObject var367;
            for (var366 = var356, var367 = (SubLObject)NIL, var367 = var366.first(); NIL == var359 && NIL != var366; var359 = module0035.f2443(var367, var1, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var366 = var366.rest(), var367 = var366.first()) {}
        }
        if (NIL == module0004.f104(var354, (SubLObject)$ic92$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            var354 = (SubLObject)((NIL != module0579.$g4250$.getDynamicValue(var355)) ? $ic93$ : $ic94$);
        }
        if (NIL == var356 && var354 == $ic94$) {
            while (NIL != module0202.f12592(var1)) {
                var1 = module0205.f13203(var1, (SubLObject)UNPROVIDED);
                var358 = module0751.f46982((SubLObject)$ic27$, var69);
                var69 = module0751.f46693(var69, (SubLObject)$ic23$);
                var357 = (SubLObject)makeBoolean(NIL == var357);
            }
        }
        if (var354 == $ic93$) {
            SubLObject var368 = (SubLObject)NIL;
            SubLObject var369 = module0155.f9796(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var370 = (SubLObject)NIL;
            var370 = var369.first();
            while (NIL != var369) {
                var368 = module0035.f2063(var368, var370, module0579.$g4315$.getGlobalValue(), (SubLObject)UNPROVIDED);
                var369 = var369.rest();
                var370 = var369.first();
            }
            enforceType(var368, $ic95$);
            final SubLObject var371 = module0579.$g4263$.currentBinding(var355);
            try {
                module0579.$g4263$.bind(var368, var355);
                var355.resetMultipleValues();
                final SubLObject var360_361 = module0770.f49095(var1, var5, module0579.$g4260$.getDynamicValue(var355), module0579.$g4262$.getDynamicValue(var355), module0579.$g4259$.getDynamicValue(var355), (SubLObject)UNPROVIDED);
                final SubLObject var362_363 = var355.secondMultipleValue();
                final SubLObject var364_365 = var355.thirdMultipleValue();
                final SubLObject var366_367 = var355.fourthMultipleValue();
                var355.resetMultipleValues();
                var361 = var360_361;
                var362 = var362_363;
                var363 = var364_365;
                var364 = var366_367;
                if (NIL != module0209.f13550(var361)) {
                    var361 = module0581.f35652(var361);
                }
            }
            finally {
                module0579.$g4263$.rebind(var371, var355);
            }
        }
        else if (NIL != f49203(var1)) {
            final SubLObject var372 = module0579.$g4326$.currentBinding(var355);
            try {
                module0579.$g4326$.bind((SubLObject)NIL, var355);
                var355.resetMultipleValues();
                final SubLObject var368_369 = f49146(var1, var5, var69, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var370_371 = var355.secondMultipleValue();
                final SubLObject var372_373 = var355.thirdMultipleValue();
                final SubLObject var374_375 = var355.fourthMultipleValue();
                var355.resetMultipleValues();
                var361 = var368_369;
                var362 = var370_371;
                var363 = var372_373;
                var364 = var374_375;
            }
            finally {
                module0579.$g4326$.rebind(var372, var355);
            }
        }
        else if (NIL == var356) {
            final SubLObject var372 = module0579.$g4326$.currentBinding(var355);
            try {
                module0579.$g4326$.bind((SubLObject)NIL, var355);
                final SubLObject var373 = f49204(var357, var360);
                final SubLObject var374 = f49205(var373);
                if (NIL != var357) {
                    module0749.f46468(var374.first(), $ic96$);
                    module0749.f46464(var374.first(), var358);
                    module0756.f47719(var374.first(), $ic96$);
                }
                var355.resetMultipleValues();
                final SubLObject var375 = f49146(var1, var5, var69, (SubLObject)T, var356);
                final SubLObject var376 = var355.secondMultipleValue();
                final SubLObject var377 = var355.thirdMultipleValue();
                final SubLObject var378 = var355.fourthMultipleValue();
                final SubLObject var379 = var355.fifthMultipleValue();
                var355.resetMultipleValues();
                if (NIL != var375) {
                    var362 = var376;
                    var364 = var378;
                    var363 = var377;
                    var365 = var379;
                }
                if (NIL != module0035.f2013(var364)) {
                    SubLObject var380 = Sequences.reverse(var374);
                    SubLObject var381 = (SubLObject)NIL;
                    var381 = var380.first();
                    while (NIL != var380) {
                        var364 = (SubLObject)ConsesLow.cons(var381, var364);
                        var380 = var380.rest();
                        var381 = var380.first();
                    }
                    var361 = module0756.f47713(var364, (SubLObject)T);
                }
            }
            finally {
                module0579.$g4326$.rebind(var372, var355);
            }
        }
        else {
            SubLObject var382 = var356;
            SubLObject var383 = (SubLObject)NIL;
            var383 = var382.first();
            while (NIL != var382) {
                module0765.f48568(var383, var1);
                var382 = var382.rest();
                var383 = var382.first();
            }
            final SubLObject var385;
            final SubLObject var384 = var385 = f49206(var356, var1);
            final SubLObject var386 = f49207(var356, var360, var1, var69, var384);
            var355.resetMultipleValues();
            final SubLObject var375 = f49146(var1, var5, var69, var385, var356);
            final SubLObject var376 = var355.secondMultipleValue();
            final SubLObject var377 = var355.thirdMultipleValue();
            final SubLObject var378 = var355.fourthMultipleValue();
            final SubLObject var379 = var355.fifthMultipleValue();
            var355.resetMultipleValues();
            if (NIL != module0581.f35648(var375)) {
                var362 = var376;
                var363 = var377;
                var364 = ConsesLow.nconc(var386, var378);
                var361 = module0756.f47713(var364, (SubLObject)T);
                var365 = var379;
            }
        }
        return Values.values(var361, var362, var363, var364, var365);
    }
    
    public static SubLObject f49204(SubLObject var356, SubLObject var359) {
        if (var356 == UNPROVIDED) {
            var356 = (SubLObject)NIL;
        }
        if (var359 == UNPROVIDED) {
            var359 = (SubLObject)NIL;
        }
        final SubLObject var360 = (SubLObject)((NIL != var359) ? $ic97$ : $ic98$);
        final SubLObject var361 = f49208(var356);
        final SubLObject var362 = Sequences.cconcatenate(var360, Sequences.cconcatenate((SubLObject)$ic99$, module0006.f203(var361)));
        return (SubLObject)ConsesLow.list(var362, (SubLObject)$ic100$);
    }
    
    public static SubLObject f49208(final SubLObject var356) {
        return (SubLObject)((NIL != var356) ? f49209() : $ic101$);
    }
    
    public static SubLObject f49209() {
        return (SubLObject)((NIL != f49210()) ? $ic102$ : $ic103$);
    }
    
    public static SubLObject f49210() {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        return module0035.sublisp_boolean(module0579.$g4330$.getDynamicValue(var6));
    }
    
    public static SubLObject f49207(final SubLObject var391, final SubLObject var359, final SubLObject var1, final SubLObject var69, final SubLObject var385) {
        final SubLObject var392 = f49211(var391, var1, var69, var385);
        final SubLObject var393 = Sequences.cconcatenate((SubLObject)((NIL != var359) ? $ic104$ : $ic105$), (SubLObject)$ic106$);
        final SubLObject var394 = (SubLObject)ConsesLow.list(f49212(var393));
        return ConsesLow.nconc(var392, var394);
    }
    
    public static SubLObject f49211(final SubLObject var355, final SubLObject var1, final SubLObject var69, final SubLObject var385) {
        final SubLThread var386 = SubLProcess.currentSubLThread();
        SubLObject var387 = (SubLObject)NIL;
        if (NIL != var385) {
            final SubLObject var388 = module0579.$g4326$.currentBinding(var386);
            try {
                module0579.$g4326$.bind((SubLObject)T, var386);
                final SubLObject var389 = module0765.f48520(var355, (SubLObject)$ic107$, (SubLObject)$ic108$, (SubLObject)UNPROVIDED);
                var387 = f49213(var389, var1, var69);
            }
            finally {
                module0579.$g4326$.rebind(var388, var386);
            }
        }
        else {
            final SubLObject var388 = module0579.$g4326$.currentBinding(var386);
            final SubLObject var390 = module0579.$g4276$.currentBinding(var386);
            try {
                module0579.$g4326$.bind((SubLObject)NIL, var386);
                module0579.$g4276$.bind((SubLObject)NIL, var386);
                final SubLObject var391 = (SubLObject)$ic109$;
                final SubLObject var392 = module0765.f48520(var355, (SubLObject)NIL, (SubLObject)$ic108$, (SubLObject)UNPROVIDED);
                var387 = f49213(var392, var1, var69);
                var387 = (SubLObject)ConsesLow.cons(f49212(var391), var387);
            }
            finally {
                module0579.$g4276$.rebind(var390, var386);
                module0579.$g4326$.rebind(var388, var386);
            }
        }
        return var387;
    }
    
    public static SubLObject f49212(final SubLObject var7) {
        return module0749.f46446(var7, module0751.f46705(), module0756.f47748(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49205(final SubLObject var398) {
        SubLObject var399 = (SubLObject)NIL;
        SubLObject var400 = var398;
        SubLObject var401 = (SubLObject)NIL;
        var401 = var400.first();
        while (NIL != var400) {
            var399 = (SubLObject)ConsesLow.cons(module0749.f46446(var401, module0751.f46705(), module0756.f47748(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var399);
            var400 = var400.rest();
            var401 = var400.first();
        }
        return Sequences.reverse(var399);
    }
    
    public static SubLObject f49213(final SubLObject var395, final SubLObject var1, final SubLObject var69) {
        SubLObject var396 = (SubLObject)NIL;
        SubLObject var397 = Sequences.nreverse(var395);
        SubLObject var398 = (SubLObject)NIL;
        var398 = var397.first();
        while (NIL != var397) {
            final SubLObject var399 = module0749.f46466(var398);
            final SubLObject var400 = module0205.f13396(var399, var1, (SubLObject)UNPROVIDED);
            final SubLObject var401 = (NIL != var400) ? var400.first() : module0751.f46705();
            final SubLObject var402 = module0749.f46462(var398);
            final SubLObject var403 = module0751.f46982(var401, var69);
            if (!var403.equal(var402)) {
                if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic110$, new SubLObject[] { var399, var403, var402 });
                }
                module0749.f46464(var398, var403);
            }
            var396 = (SubLObject)ConsesLow.cons(var398, var396);
            var397 = var397.rest();
            var398 = var397.first();
        }
        return var396;
    }
    
    public static SubLObject f49206(final SubLObject var355, final SubLObject var107) {
        final SubLThread var356 = SubLProcess.currentSubLThread();
        final SubLObject var357 = (SubLObject)ONE_INTEGER;
        return (SubLObject)makeBoolean(NIL == Types.sublisp_true() && NIL == module0035.f2002(var355, var357, (SubLObject)UNPROVIDED) && NIL == module0579.f35498() && NIL != module0579.$g4279$.getDynamicValue(var356) && NIL == module0202.f12606(var107) && NIL == Sequences.find_if((SubLObject)$ic111$, var355, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL == Sequences.find_if((SubLObject)$ic112$, var355, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f49146(SubLObject var107, final SubLObject var5, SubLObject var69, SubLObject var404, SubLObject var355) {
        if (var69 == UNPROVIDED) {
            var69 = module0751.f47200();
        }
        if (var404 == UNPROVIDED) {
            var404 = (SubLObject)NIL;
        }
        if (var355 == UNPROVIDED) {
            var355 = (SubLObject)NIL;
        }
        final SubLThread var405 = SubLProcess.currentSubLThread();
        SubLObject var406 = (SubLObject)NIL;
        SubLObject var407 = (SubLObject)NIL;
        SubLObject var408 = (SubLObject)NIL;
        SubLObject var409 = (SubLObject)NIL;
        SubLObject var410 = (SubLObject)NIL;
        if (NIL != var404) {
            final SubLObject var411 = f49214(var107, var355, var69);
            if (NIL == module0751.f46703(var411)) {
                var107 = module0751.f46672(var411, var107);
                var69 = module0751.f46693(var69, var411);
            }
        }
        final SubLObject var412 = module0756.f47463(var107, var69, (SubLObject)UNPROVIDED);
        if (NIL != module0751.f47038(var5)) {
            module0756.f47784(var412, var5, (SubLObject)UNPROVIDED);
        }
        final SubLObject var413 = module0579.$g4277$.currentBinding(var405);
        try {
            module0579.$g4277$.bind((SubLObject)makeBoolean(NIL != module0579.$g4277$.getDynamicValue(var405) && NIL == module0579.f35498()), var405);
            final SubLObject var414 = module0580.f35634(var412);
            try {
                module0770.f49065(var412, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            finally {
                final SubLObject var12_406 = Threads.$is_thread_performing_cleanupP$.currentBinding(var405);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var405);
                    module0580.f35635(var412, var414, (SubLObject)UNPROVIDED);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var12_406, var405);
                }
            }
        }
        finally {
            module0579.$g4277$.rebind(var413, var405);
        }
        if (NIL != module0756.f47479(var412)) {
            var406 = module0756.f47480(var412, (SubLObject)UNPROVIDED);
            var407 = module0756.f47691(var412);
            var408 = module0756.f47510(var412);
            var409 = module0756.f47467(var412);
            var410 = module0756.f47627(var412);
        }
        return Values.values(var406, var407, var408, var409, var410);
    }
    
    public static SubLObject f49214(final SubLObject var107, final SubLObject var355, final SubLObject var69) {
        final SubLObject var356 = module0765.f48612(var107, var355, var69, (SubLObject)UNPROVIDED);
        return ($ic113$ == var356) ? module0751.f46678() : var356;
    }
    
    public static SubLObject f49203(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (NIL == module0202.f12590(var1)) {
            return (SubLObject)NIL;
        }
        if (NIL != f49215(var1)) {
            final SubLObject var3 = module0205.f13203(var1, (SubLObject)UNPROVIDED);
            SubLObject var4 = (SubLObject)NIL;
            final SubLObject var5 = module0584.$g4396$.currentBinding(var2);
            try {
                module0584.$g4396$.bind(module0579.$g4260$.getDynamicValue(var2), var2);
                final SubLObject var6 = module0580.f35545();
                final SubLObject var12_407 = module0034.$g879$.currentBinding(var2);
                try {
                    module0034.$g879$.bind(var6, var2);
                    SubLObject var7 = (SubLObject)NIL;
                    if (NIL != var6 && NIL == module0034.f1842(var6)) {
                        var7 = module0034.f1869(var6);
                        final SubLObject var8 = Threads.current_process();
                        if (NIL == var7) {
                            module0034.f1873(var6, var8);
                        }
                        else if (!var7.eql(var8)) {
                            Errors.error((SubLObject)$ic5$);
                        }
                    }
                    try {
                        if (NIL == var4) {
                            SubLObject var9;
                            SubLObject var10;
                            for (var9 = module0038.f2738(var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var10 = (SubLObject)NIL, var10 = var9.first(); NIL == var4 && NIL != var9; var4 = (SubLObject)makeBoolean(NIL != module0731.f44751(var10, (SubLObject)UNPROVIDED) && (NIL != module0731.f44746(var10, $ic114$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != module0731.f44746(var10, $ic115$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))), var9 = var9.rest(), var10 = var9.first()) {}
                        }
                    }
                    finally {
                        final SubLObject var12_408 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var2);
                            if (NIL != var6 && NIL == var7) {
                                module0034.f1873(var6, (SubLObject)NIL);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var12_408, var2);
                        }
                    }
                }
                finally {
                    module0034.$g879$.rebind(var12_407, var2);
                }
            }
            finally {
                module0584.$g4396$.rebind(var5, var2);
            }
            return var4;
        }
        if (NIL != module0202.f12714(var1)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0210.f13576(var1, (SubLObject)UNPROVIDED)) {
            return Sequences.find_if((SubLObject)$ic116$, module0205.f13207(var1, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49215(final SubLObject var410) {
        return module0202.f12589(var410, $ic117$);
    }
    
    public static SubLObject f49216(final SubLObject var203) {
        if (NIL == f49217(var203)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0201.f12546(module0756.f47487(var203, (SubLObject)UNPROVIDED))) {
            return module0754.f47325(module0756.f47487(var203, (SubLObject)UNPROVIDED));
        }
        if (NIL != f49218(var203)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49217(final SubLObject var203) {
        if (NIL != module0751.f47119(module0756.f47481(var203, (SubLObject)T))) {
            return (SubLObject)T;
        }
        if (NIL == module0756.f47804(var203)) {
            return (SubLObject)NIL;
        }
        final SubLObject var204 = module0756.f47691(var203);
        if (NIL != var204 && (NIL != module0751.f46658($ic118$, var204, (SubLObject)UNPROVIDED) || NIL != module0751.f46658(var204, $ic118$, (SubLObject)UNPROVIDED))) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49218(final SubLObject var203) {
        if (NIL == module0035.f1995(module0756.f47516(var203), (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        final SubLObject var204 = module0756.f47590(var203, (SubLObject)ZERO_INTEGER);
        final SubLObject var205 = module0756.f47590(var203, (SubLObject)ONE_INTEGER);
        if (NIL != module0201.f12546(module0756.f47487(var205, (SubLObject)UNPROVIDED)) && NIL != module0754.f47325(module0756.f47487(var205, (SubLObject)UNPROVIDED)) && (NIL != module0756.f47607(var204) || NIL != module0756.f47605(var204)) && NIL != module0751.f47126(module0756.f47481(var205, (SubLObject)UNPROVIDED))) {
            return (SubLObject)T;
        }
        if (NIL != module0201.f12546(module0756.f47487(var204, (SubLObject)UNPROVIDED)) && NIL != module0754.f47325(module0756.f47487(var204, (SubLObject)UNPROVIDED)) && NIL != module0751.f46640(module0756.f47481(var204, (SubLObject)UNPROVIDED), $ic119$, (SubLObject)UNPROVIDED)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49219(final SubLObject var203) {
        if (NIL != module0201.f12546(module0756.f47487(var203, (SubLObject)UNPROVIDED))) {
            return module0756.f47487(var203, (SubLObject)UNPROVIDED);
        }
        SubLObject var204 = (SubLObject)ZERO_INTEGER;
        if (module0743.f45996(var203).isVector()) {
            final SubLObject var205 = module0743.f45996(var203);
            final SubLObject var206 = (SubLObject)NIL;
            SubLObject var207;
            SubLObject var208;
            SubLObject var209;
            SubLObject var210;
            SubLObject var211;
            for (var207 = Sequences.length(var205), var208 = (SubLObject)NIL, var208 = (SubLObject)ZERO_INTEGER; var208.numL(var207); var208 = Numbers.add(var208, (SubLObject)ONE_INTEGER)) {
                var209 = ((NIL != var206) ? Numbers.subtract(var207, var208, (SubLObject)ONE_INTEGER) : var208);
                var210 = Vectors.aref(var205, var209);
                if (!var204.numG((SubLObject)ONE_INTEGER)) {
                    var211 = module0756.f47487(var210, (SubLObject)UNPROVIDED);
                    if (NIL != module0201.f12546(var211)) {
                        return var211;
                    }
                }
                var204 = Numbers.add(var204, (SubLObject)ONE_INTEGER);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49220(final SubLObject var161, final SubLObject var1) {
        final SubLThread var162 = SubLProcess.currentSubLThread();
        final SubLObject var163 = module0754.f47360(var161, var1, module0579.$g4262$.getDynamicValue(var162), (SubLObject)T, (SubLObject)T, Symbols.symbol_function((SubLObject)$ic120$));
        return module0035.sublisp_boolean(Sequences.find($ic121$, var163, (SubLObject)$ic122$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f49221(final SubLObject var160, final SubLObject var1) {
        SubLObject var161 = (SubLObject)NIL;
        if (NIL == var161) {
            SubLObject var162 = var160;
            SubLObject var163 = (SubLObject)NIL;
            var163 = var162.first();
            while (NIL == var161 && NIL != var162) {
                if (NIL != f49220(var163, var1)) {
                    if (NIL != module0578.f35470((SubLObject)TWO_INTEGER)) {
                        PrintLow.format((SubLObject)T, (SubLObject)$ic123$, var163, var1);
                    }
                    var161 = (SubLObject)T;
                }
                var162 = var162.rest();
                var163 = var162.first();
            }
        }
        if (NIL == var161 && NIL != module0578.f35470((SubLObject)TWO_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic124$, var1);
        }
        return (SubLObject)makeBoolean(NIL == var161);
    }
    
    public static SubLObject f49222(final SubLObject var1) {
        final SubLObject var2 = (SubLObject)T;
        final SubLObject var3 = module0155.f9796(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var4 = Sequences.find_if((SubLObject)$ic91$, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL == module0751.f46661((SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0579.f35498() && NIL != var4) {
            return (SubLObject)NIL;
        }
        if (NIL != var2 && NIL != module0035.f2000(var3, (SubLObject)THREE_INTEGER, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f49223(final SubLObject var1) {
        final SubLObject var2 = module0205.f13136(var1);
        SubLObject var3 = module0751.f46678();
        SubLObject var4 = (SubLObject)NIL;
        if (NIL != f49224(var2)) {
            var4 = module0765.f48700(var2);
            var3 = module0765.f48701(var1);
        }
        return Values.values(var3, var4);
    }
    
    public static SubLObject f49224(final SubLObject var424) {
        return (SubLObject)makeBoolean(NIL != module0212.f13762(var424) && NIL != module0765.f48649(var424));
    }
    
    public static SubLObject f49225(final SubLObject var203) {
        final SubLObject var204 = module0756.f47487(var203, (SubLObject)UNPROVIDED);
        final SubLObject var205 = module0756.f47511(var203);
        if (NIL != var204 && NIL == module0751.f46706(var204, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            final SubLObject var206 = module0765.f48612(var204, (SubLObject)NIL, var205, (SubLObject)UNPROVIDED);
            if (NIL != module0751.f46788(var206) && NIL == module0751.f46703(var206)) {
                module0756.f47745(var203, var206);
            }
        }
        return var203;
    }
    
    public static SubLObject f49226(final SubLObject var1, SubLObject var5, SubLObject var69) {
        if (var5 == UNPROVIDED) {
            var5 = f49139();
        }
        if (var69 == UNPROVIDED) {
            var69 = module0751.f47200();
        }
        final SubLThread var70 = SubLProcess.currentSubLThread();
        if (NIL == f49222(var1)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic125$, var1);
        }
        final SubLObject var71 = (NIL != module0762.f48210(var1)) ? module0763.f48248(var1, var69) : module0756.f47484(module0756.f47463(var1, var69, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var72 = (SubLObject)NIL;
        SubLObject var73 = (SubLObject)NIL;
        SubLObject var74 = (SubLObject)NIL;
        SubLObject var75 = (SubLObject)NIL;
        SubLObject var76 = (SubLObject)NIL;
        f49227(var71, var1, var5, var69, (SubLObject)UNPROVIDED);
        if (NIL != module0756.f47479(var71)) {
            var72 = module0756.f47480(var71, (SubLObject)UNPROVIDED);
            var73 = module0756.f47691(var71);
            var74 = module0756.f47510(var71);
            var75 = module0756.f47467(var71);
            var76 = module0756.f47627(var71);
            if (NIL != module0107.f7629(module0579.$g4252$.getDynamicValue(var70))) {
                final SubLObject var77 = module0055.f4017();
                SubLObject var78 = (SubLObject)ZERO_INTEGER;
                module0055.f4021(var71, var77);
                while (NIL == module0055.f4019(var77)) {
                    final SubLObject var79 = module0055.f4023(var77);
                    SubLObject var80 = module0756.f47673(var79);
                    SubLObject var81 = (SubLObject)NIL;
                    var81 = var80.first();
                    while (NIL != var80) {
                        module0759.f48067(var81);
                        var78 = Numbers.add(var78, (SubLObject)ONE_INTEGER);
                        if (var78.numGE(module0756.$g6076$.getDynamicValue(var70))) {
                            final SubLObject var82 = Sequences.cconcatenate((SubLObject)$ic38$, new SubLObject[] { module0006.f205((SubLObject)ONE_INTEGER), $ic39$, module0006.f203((SubLObject)$ic40$) });
                            module0578.f35476(var82, (SubLObject)ConsesLow.list(var78, var71));
                        }
                        module0055.f4021(var81, var77);
                        var80 = var80.rest();
                        var81 = var80.first();
                    }
                }
            }
        }
        return Values.values(var72, var73, var74, var75, var76);
    }
    
    public static SubLObject f49227(final SubLObject var203, final SubLObject var1, SubLObject var5, final SubLObject var69, SubLObject var428) {
        if (var428 == UNPROVIDED) {
            var428 = (SubLObject)T;
        }
        final SubLThread var429 = SubLProcess.currentSubLThread();
        final SubLObject var430 = module0756.f47484(var203, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var431 = module0579.$g4323$.currentBinding(var429);
        try {
            module0579.$g4323$.bind((NIL != module0067.f4852(module0579.$g4323$.getDynamicValue(var429))) ? module0579.$g4323$.getDynamicValue(var429) : module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var429);
            final SubLObject var432 = module0754.f47307();
            final SubLObject var12_432 = module0754.$g6064$.currentBinding(var429);
            final SubLObject var433 = module0579.$g4324$.currentBinding(var429);
            final SubLObject var434 = module0579.$g4325$.currentBinding(var429);
            try {
                module0754.$g6064$.bind(module0754.$g6064$.getDynamicValue(var429), var429);
                module0579.$g4324$.bind((NIL != module0067.f4852(module0579.$g4324$.getDynamicValue(var429))) ? module0579.$g4324$.getDynamicValue(var429) : module0067.f4880(Symbols.symbol_function((SubLObject)EQL), (SubLObject)SIXTEEN_INTEGER), var429);
                module0579.$g4325$.bind(module0048.f_1X(module0579.$g4325$.getDynamicValue(var429)), var429);
                if (NIL != module0578.f35470((SubLObject)TWO_INTEGER)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic16$, module0579.$g4325$.getDynamicValue(var429), module0067.f4903(module0579.$g4323$.getDynamicValue(var429)));
                }
                try {
                    final SubLObject var12_433 = module0579.$g4321$.currentBinding(var429);
                    try {
                        module0579.$g4321$.bind(module0755.f47380(), var429);
                        module0580.f35572();
                        try {
                            module0755.f47388();
                            if (NIL != module0202.f12606(var1)) {
                                final SubLObject var435 = module0765.f48750(var1, (SubLObject)UNPROVIDED);
                                if (NIL == module0751.f46822(var435)) {
                                    module0756.f47745(var203, var435);
                                }
                                var429.resetMultipleValues();
                                final SubLObject var436 = module0765.f48621(module0756.f47487(var203, (SubLObject)UNPROVIDED), var69);
                                final SubLObject var437 = var429.secondMultipleValue();
                                var429.resetMultipleValues();
                                module0756.f47745(var203, var436);
                                if (NIL != var437) {
                                    module0756.f47569(var203, var437);
                                }
                            }
                            var429.resetMultipleValues();
                            final SubLObject var435 = f49223(module0756.f47487(var203, (SubLObject)UNPROVIDED));
                            final SubLObject var438 = var429.secondMultipleValue();
                            var429.resetMultipleValues();
                            if (NIL == module0751.f46703(var435)) {
                                module0756.f47745(var203, var435);
                            }
                            final SubLObject var439 = module0580.f35634(var203);
                            try {
                                var5 = module0756.f47488(var203, (SubLObject)UNPROVIDED);
                                if (NIL != var428) {
                                    SubLObject var440 = module0155.f9795(module0756.f47487(var203, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    SubLObject var441 = (SubLObject)NIL;
                                    var441 = var440.first();
                                    while (NIL != var440) {
                                        final SubLObject var442 = module0751.f46830(var441, module0756.f47487(var203, (SubLObject)UNPROVIDED));
                                        final SubLObject var443 = module0765.f48751(module0756.f47487(var203, (SubLObject)UNPROVIDED), var441, module0751.f46678(), module0756.f47487(var203, (SubLObject)UNPROVIDED), var442, (SubLObject)NIL);
                                        if (NIL == module0035.f2428(var443, (SubLObject)$ic113$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL == module0751.f46822(var443) && NIL == module0751.f46703(var443)) {
                                            module0756.f47745(var203, var443);
                                        }
                                        var440 = var440.rest();
                                        var441 = var440.first();
                                    }
                                }
                                f49225(var203);
                                final SubLObject var444 = module0756.f47487(var203, (SubLObject)UNPROVIDED);
                                final SubLObject var445 = module0756.f47511(var203);
                                final SubLObject var446 = module0205.f13183(var444, (SubLObject)$ic91$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                final SubLObject var12_434 = module0579.$g4326$.currentBinding(var429);
                                try {
                                    module0579.$g4326$.bind((SubLObject)T, var429);
                                    SubLObject var447 = (SubLObject)NIL;
                                    final SubLObject var448 = module0749.f46552(var444, var438, module0205.f13132(var444), var5, (SubLObject)NIL, (SubLObject)UNPROVIDED);
                                    while (NIL == var447 && NIL == module0749.f46551(var448)) {
                                        var429.resetMultipleValues();
                                        final SubLObject var449 = module0763.f48349(var448);
                                        final SubLObject var450 = var429.secondMultipleValue();
                                        var429.resetMultipleValues();
                                        if (NIL != module0756.f47497(var449, (SubLObject)UNPROVIDED)) {
                                            if (NIL != module0756.f47519(var449)) {
                                                module0758.f47879(var449, var1, (SubLObject)NIL);
                                            }
                                            final SubLObject var12_435 = module0579.$g4336$.currentBinding(var429);
                                            try {
                                                module0579.$g4336$.bind((SubLObject)((NIL != module0580.f35536(module0205.f13132(var1))) ? module0205.f13132(var1) : $ic13$), var429);
                                                module0763.f48337(var449, var444, var445, (SubLObject)UNPROVIDED);
                                            }
                                            finally {
                                                module0579.$g4336$.rebind(var12_435, var429);
                                            }
                                            final SubLObject var451 = f49228(var449, var446, var5);
                                            if (NIL == module0756.f47497(var451, (SubLObject)UNPROVIDED)) {
                                                continue;
                                            }
                                            if (NIL != module0578.f35470((SubLObject)TWO_INTEGER)) {
                                                PrintLow.format((SubLObject)T, (SubLObject)$ic126$, var451);
                                            }
                                            if (NIL != module0751.f47038(var5)) {
                                                module0756.f47787(var451, var5, (SubLObject)UNPROVIDED);
                                            }
                                            module0770.f49065(var451, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                            if (NIL != module0756.f47479(var451) && NIL == module0756.f47479(var203)) {
                                                module0756.f47484(var451, var203, (SubLObject)UNPROVIDED);
                                                if (NIL != module0579.f35485()) {
                                                    continue;
                                                }
                                                var447 = (SubLObject)T;
                                            }
                                            else {
                                                if (NIL == module0756.f47479(var451)) {
                                                    continue;
                                                }
                                                module0756.f47675(var203, var451);
                                            }
                                        }
                                    }
                                    module0749.f46553(var448);
                                }
                                finally {
                                    module0579.$g4326$.rebind(var12_434, var429);
                                }
                            }
                            finally {
                                final SubLObject var12_436 = Threads.$is_thread_performing_cleanupP$.currentBinding(var429);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var429);
                                    module0580.f35635(var203, var439, (SubLObject)UNPROVIDED);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var12_436, var429);
                                }
                            }
                        }
                        finally {
                            final SubLObject var12_437 = Threads.$is_thread_performing_cleanupP$.currentBinding(var429);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var429);
                                module0580.f35573();
                                module0580.f35575();
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var12_437, var429);
                            }
                        }
                    }
                    finally {
                        module0579.$g4321$.rebind(var12_433, var429);
                    }
                }
                finally {
                    final SubLObject var12_438 = Threads.$is_thread_performing_cleanupP$.currentBinding(var429);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var429);
                        final SubLObject var452 = conses_high.set_difference(module0754.f47307(), var432, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        if (NIL != module0578.f35470((SubLObject)TWO_INTEGER)) {
                            PrintLow.format((SubLObject)T, (SubLObject)$ic18$, module0579.$g4325$.getDynamicValue(var429), module0754.f47307());
                        }
                        module0580.f35619(var452);
                        if (NIL != module0578.f35470((SubLObject)TWO_INTEGER)) {
                            PrintLow.format((SubLObject)T, (SubLObject)$ic19$, module0754.f47307());
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var12_438, var429);
                    }
                }
            }
            finally {
                module0579.$g4325$.rebind(var434, var429);
                module0579.$g4324$.rebind(var433, var429);
                module0754.$g6064$.rebind(var12_432, var429);
            }
        }
        finally {
            module0579.$g4323$.rebind(var431, var429);
        }
        if (NIL != module0756.f47479(var203) && NIL != module0038.f2668((SubLObject)$ic127$, module0756.f47480(var203, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic128$, module0756.f47480(var203, (SubLObject)UNPROVIDED));
            f49227(var430, var1, var69, (SubLObject)NIL, (SubLObject)UNPROVIDED);
            module0756.f47484(var430, var203, (SubLObject)UNPROVIDED);
        }
        return var203;
    }
    
    public static SubLObject f49228(final SubLObject var277, final SubLObject var355, SubLObject var446) {
        if (var446 == UNPROVIDED) {
            var446 = (SubLObject)NIL;
        }
        final SubLThread var447 = SubLProcess.currentSubLThread();
        if (NIL == module0756.f47497(var277, (SubLObject)UNPROVIDED) || NIL == f49229(var277)) {
            if (NIL != module0578.f35470((SubLObject)TWO_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic129$, var277);
            }
            return (SubLObject)NIL;
        }
        if (NIL != module0751.f47038(var446)) {
            final SubLObject var448 = module0756.f47648(var277);
            final SubLObject var449 = module0756.f47488(var448, (SubLObject)UNPROVIDED);
            final SubLObject var450 = (SubLObject)(var449.isList() ? module0035.f2110((SubLObject)$ic130$, var449, (SubLObject)UNPROVIDED) : NIL);
            if (NIL != module0751.f46669(module0756.f47481(var448, (SubLObject)UNPROVIDED), $ic131$, (SubLObject)UNPROVIDED)) {
                module0756.f47784(var448, module0751.f47099(var446, (SubLObject)((NIL != var450) ? var450 : $ic1$), (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
            }
        }
        var447.resetMultipleValues();
        SubLObject var451 = f49230(var277);
        final SubLObject var452 = var447.secondMultipleValue();
        var447.resetMultipleValues();
        SubLObject var453 = module0756.f47648(var277);
        SubLObject var454 = (SubLObject)ConsesLow.list(module0756.f47477(var277));
        final SubLObject var455 = module0756.f47487(var277, (SubLObject)UNPROVIDED);
        SubLObject var456 = (SubLObject)NIL;
        while (NIL != module0756.f47478(var453) && NIL != module0756.f47477(var453)) {
            var454 = module0035.f1973(module0756.f47477(var453), var454);
            var453 = module0756.f47648(var453);
        }
        if (NIL != var355 && NIL == f49231(var451)) {
            if (NIL != module0578.f35470((SubLObject)TWO_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic132$, var277);
            }
            return (SubLObject)NIL;
        }
        if (var452.eql(module0756.f47649(var277))) {
            if (NIL != module0578.f35470((SubLObject)TWO_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic133$, var277);
            }
            f49232(var452, var455);
            return var277;
        }
        if (NIL == var453) {
            if (NIL != module0578.f35470((SubLObject)THREE_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic134$, var277);
            }
            return (SubLObject)NIL;
        }
        if (NIL != module0756.f47732(var453)) {
            if (NIL != module0578.f35470((SubLObject)TWO_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic135$, var453);
            }
            if (NIL != module0756.f47497(var452, (SubLObject)UNPROVIDED)) {
                f49232(var452, var455);
            }
            module0756.f47839(var454, var453, var277);
            var456 = (SubLObject)T;
        }
        else if (NIL != module0756.f47733(var453)) {
            if (NIL != module0578.f35470((SubLObject)TWO_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic136$, var453);
            }
            if (NIL != module0756.f47497(var452, (SubLObject)UNPROVIDED)) {
                f49232(var452, var455);
            }
            module0756.f47839(var454, var453, var277);
            var456 = (SubLObject)T;
        }
        else {
            if (NIL != module0756.f47734(var453)) {
                if (NIL != module0578.f35470((SubLObject)TWO_INTEGER)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic137$, var453);
                }
                return (SubLObject)NIL;
            }
            if (NIL != module0578.f35470((SubLObject)TWO_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic138$, var277);
            }
            if (NIL != module0756.f47497(var452, (SubLObject)UNPROVIDED)) {
                f49232(var452, var455);
            }
            f49233(var277);
            var456 = (SubLObject)T;
        }
        if (NIL != f49231(var451)) {
            if (NIL != var456) {
                var451 = module0756.f47826(var277, var452, (SubLObject)UNPROVIDED);
            }
            if (NIL != module0578.f35470((SubLObject)TWO_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic139$, var452);
            }
            module0756.f47839(var451, var452, var277);
        }
        return var277;
    }
    
    public static SubLObject f49233(final SubLObject var203) {
        module0751.f46990(var203);
        module0756.f47838(var203);
        return var203;
    }
    
    public static SubLObject f49234(final SubLObject var203, final SubLObject var455, final SubLObject var456) {
        if (NIL != f49235(var203)) {
            return (SubLObject)T;
        }
        if (NIL != module0756.f47519(var203)) {
            module0758.f47879(var203, var455, var456);
        }
        return (SubLObject)makeBoolean(NIL != f49203(module0756.f47487(var203, (SubLObject)UNPROVIDED)) || NIL != f49216(var203));
    }
    
    public static SubLObject f49235(final SubLObject var203) {
        if ($ic36$ == module0749.f46418(var203, (SubLObject)$ic140$, (SubLObject)$ic141$) && NIL == module0756.f47749(var203, (SubLObject)$ic142$) && NIL != module0756.f47749(var203, (SubLObject)$ic62$)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49230(final SubLObject var203) {
        return f49236(var203, (SubLObject)NIL);
    }
    
    public static SubLObject f49236(final SubLObject var203, final SubLObject var457) {
        final SubLThread var458 = SubLProcess.currentSubLThread();
        final SubLObject var459 = module0756.f47487(var203, (SubLObject)UNPROVIDED);
        SubLObject var460 = (SubLObject)ZERO_INTEGER;
        if (module0743.f45996(var203).isVector()) {
            final SubLObject var461 = module0743.f45996(var203);
            final SubLObject var462 = (SubLObject)NIL;
            SubLObject var463;
            SubLObject var464;
            SubLObject var465;
            SubLObject var466;
            SubLObject var467;
            SubLObject var468;
            SubLObject var469;
            for (var463 = Sequences.length(var461), var464 = (SubLObject)NIL, var464 = (SubLObject)ZERO_INTEGER; var464.numL(var463); var464 = Numbers.add(var464, (SubLObject)ONE_INTEGER)) {
                var465 = ((NIL != var462) ? Numbers.subtract(var463, var464, (SubLObject)ONE_INTEGER) : var464);
                var466 = Vectors.aref(var461, var465);
                var467 = module0035.f1973(var460, var457);
                if (NIL != f49234(var466, var459, var203)) {
                    if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                        PrintLow.format((SubLObject)T, (SubLObject)$ic143$, var466);
                    }
                    return Values.values(var467, var466);
                }
                if (NIL != module0756.f47645(var466) || NIL != module0756.f47652(var466) || NIL != module0756.f47804(var466)) {
                    var458.resetMultipleValues();
                    var468 = f49236(var466, var467);
                    var469 = var458.secondMultipleValue();
                    var458.resetMultipleValues();
                    if (NIL != f49231(var468)) {
                        return Values.values(var468, var469);
                    }
                }
                var460 = Numbers.add(var460, (SubLObject)ONE_INTEGER);
            }
        }
        return Values.values((SubLObject)$ic144$, (SubLObject)NIL);
    }
    
    public static SubLObject f49231(final SubLObject var163) {
        return module0751.f46999(Symbols.symbol_function((SubLObject)$ic145$), var163);
    }
    
    public static SubLObject f49237(final SubLObject var161, final SubLObject var1) {
        final SubLThread var162 = SubLProcess.currentSubLThread();
        final SubLObject var163 = module0754.f47312(var161);
        module0765.f48568(var161, var1);
        final SubLObject var164 = (SubLObject)ConsesLow.cons(module0754.f47312(var161), module0754.f47360(var161, var1, module0579.$g4262$.getDynamicValue(var162), (SubLObject)T, (SubLObject)T, (SubLObject)UNPROVIDED));
        SubLObject var165 = (SubLObject)NIL;
        SubLObject var166 = (SubLObject)NIL;
        SubLObject var167 = (SubLObject)NIL;
        if (NIL != module0751.f46669(module0754.f47312(var161), $ic146$, (SubLObject)UNPROVIDED)) {
            final SubLObject var168 = module0147.f9540(module0579.$g4262$.getDynamicValue(var162));
            final SubLObject var169 = module0147.$g2095$.currentBinding(var162);
            final SubLObject var170 = module0147.$g2094$.currentBinding(var162);
            final SubLObject var171 = module0147.$g2096$.currentBinding(var162);
            try {
                module0147.$g2095$.bind(module0147.f9545(var168), var162);
                module0147.$g2094$.bind(module0147.f9546(var168), var162);
                module0147.$g2096$.bind(module0147.f9549(var168), var162);
                if (NIL == var167) {
                    SubLObject var172 = var164;
                    SubLObject var173 = (SubLObject)NIL;
                    var173 = var172.first();
                    while (NIL == var167 && NIL != var172) {
                        if (NIL == module0751.f46669($ic147$, var173, (SubLObject)UNPROVIDED)) {
                            var165 = (SubLObject)NIL;
                            var167 = (SubLObject)T;
                        }
                        else if (NIL != module0751.f46669(var173, $ic147$, (SubLObject)UNPROVIDED)) {
                            var165 = (SubLObject)T;
                        }
                        else {
                            var165 = (SubLObject)T;
                            var166 = (SubLObject)T;
                        }
                        var172 = var172.rest();
                        var173 = var172.first();
                    }
                }
            }
            finally {
                module0147.$g2096$.rebind(var171, var162);
                module0147.$g2094$.rebind(var170, var162);
                module0147.$g2095$.rebind(var169, var162);
            }
        }
        module0754.f47315(var161, var163);
        return Values.values(var165, var166);
    }
    
    public static SubLObject f49238(final SubLObject var203) {
        return f49235(var203);
    }
    
    public static SubLObject f49232(final SubLObject var203, final SubLObject var1) {
        final SubLThread var204 = SubLProcess.currentSubLThread();
        SubLObject var205 = (SubLObject)NIL;
        final SubLObject var206 = (SubLObject)NIL;
        if (NIL != f49216(var203)) {
            final SubLObject var207 = f49219(var203);
            final SubLObject var208 = (SubLObject)NIL;
            if (NIL != var208) {
                module0765.f48568(var207, var1);
            }
            if (NIL != module0578.f35470((SubLObject)TWO_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic148$, var207);
            }
            if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic149$, var207, module0754.f47312(var207));
            }
            var204.resetMultipleValues();
            final SubLObject var209 = f49237(var207, var1);
            final SubLObject var210 = var204.secondMultipleValue();
            var204.resetMultipleValues();
            if (NIL != var209) {
                f49239(var203, var210);
                var205 = module0756.f47467(var203);
            }
            else {
                if (NIL != f49220(var207, var1) && NIL != module0756.f47478(var203)) {
                    final SubLObject var211 = module0756.f47590(var203, (SubLObject)ZERO_INTEGER);
                    module0756.f47723(var211, (SubLObject)$ic150$);
                    return var203;
                }
                if (NIL != module0767.f48801(var207, (SubLObject)NIL) && NIL == module0754.f47311(var207)) {
                    final SubLObject var212 = f49240(var207, var1);
                    final SubLObject var213 = module0756.f47691(var203);
                    final SubLObject var214 = (NIL != var213 && (NIL != module0751.f46658(var213, $ic151$, (SubLObject)UNPROVIDED) || NIL != module0751.f46658(var213, $ic152$, (SubLObject)UNPROVIDED))) ? var213 : ((NIL != var212) ? $ic151$ : $ic152$);
                    module0756.f47484(module0767.f48812(var207, (SubLObject)$ic153$, $ic154$, var214, module0756.f47511(var203), (SubLObject)UNPROVIDED), var203, (SubLObject)UNPROVIDED);
                }
                else {
                    module0756.f47723(var203, (SubLObject)$ic155$);
                    var205 = module0756.f47467(var203);
                }
            }
            if (NIL != module0756.f47466(var205)) {
                module0756.f47501(var203, var205, (SubLObject)UNPROVIDED);
                module0756.f47608(var203);
            }
            module0756.f47785(var203, var206);
        }
        else if (NIL != f49238(var203)) {
            module0756.f47484(f49241(var203), var203, (SubLObject)UNPROVIDED);
            var205 = module0756.f47467(var203);
        }
        return Values.values(var205, var206);
    }
    
    public static SubLObject f49242() {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        return module0035.sublisp_boolean(module0579.$g4329$.getDynamicValue(var6));
    }
    
    public static SubLObject f49243(final SubLObject var203) {
        return (SubLObject)makeBoolean(NIL != f49242() && $ic156$ == module0756.f47635(var203));
    }
    
    public static SubLObject f49239(final SubLObject var203, SubLObject var464) {
        if (var464 == UNPROVIDED) {
            var464 = (SubLObject)NIL;
        }
        SubLObject var465 = (SubLObject)((NIL != f49243(var203)) ? $ic157$ : $ic158$);
        if (NIL != var464) {
            var465 = Sequences.cconcatenate(var465, (SubLObject)$ic159$);
        }
        module0756.f47723(var203, var465);
        return module0756.f47480(var203, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49241(final SubLObject var203) {
        final SubLObject var204 = f49244(var203);
        final SubLObject var205 = module0756.f47511(var204);
        final SubLObject var206 = module0756.f47487(var204, (SubLObject)UNPROVIDED);
        final SubLObject var207 = module0756.f47484(module0756.f47463(var206, var205, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0756.f47723(var207, (SubLObject)$ic160$);
        return var207;
    }
    
    public static SubLObject f49244(final SubLObject var203) {
        if (NIL != f49235(var203)) {
            SubLObject var204 = (SubLObject)ZERO_INTEGER;
            if (module0743.f45996(var203).isVector()) {
                final SubLObject var205 = module0743.f45996(var203);
                final SubLObject var206 = (SubLObject)NIL;
                SubLObject var207;
                SubLObject var208;
                SubLObject var209;
                SubLObject var210;
                SubLObject var211;
                for (var207 = Sequences.length(var205), var208 = (SubLObject)NIL, var208 = (SubLObject)ZERO_INTEGER; var208.numL(var207); var208 = Numbers.add(var208, (SubLObject)ONE_INTEGER)) {
                    var209 = ((NIL != var206) ? Numbers.subtract(var207, var208, (SubLObject)ONE_INTEGER) : var208);
                    var210 = Vectors.aref(var205, var209);
                    if (NIL != module0201.f12546(module0756.f47487(var210, (SubLObject)UNPROVIDED))) {
                        return var210;
                    }
                    if (NIL != module0756.f47478(var210)) {
                        var211 = f49244(var210);
                        if (NIL != var211) {
                            return var211;
                        }
                    }
                    var204 = Numbers.add(var204, (SubLObject)ONE_INTEGER);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49240(final SubLObject var161, final SubLObject var1) {
        final SubLThread var162 = SubLProcess.currentSubLThread();
        final SubLObject var163 = Sequences.position(var161, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var164 = module0205.f13132(var1);
        final SubLObject var165 = (SubLObject)makeBoolean(NIL != module0226.f15041(var164, var163, module0579.$g4262$.getDynamicValue(var162)) || NIL != f49245(var161, var1));
        return var165;
    }
    
    public static SubLObject f49245(final SubLObject var161, final SubLObject var1) {
        final SubLThread var162 = SubLProcess.currentSubLThread();
        SubLObject var163 = (SubLObject)NIL;
        if (NIL != module0337.f22630(var1, (SubLObject)ConsesLow.list($ic161$, (SubLObject)$ic162$, var161))) {
            final SubLObject var164 = module0754.f47312(var161);
            if (NIL != module0205.f13155(var164) && NIL == var163) {
                SubLObject var165 = var164;
                final SubLObject var166 = (SubLObject)$ic165$;
                final SubLObject var167 = module0056.f4145(var166);
                final SubLObject var168 = module0139.$g1635$.currentBinding(var162);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var162);
                    final SubLObject var169 = module0579.$g4262$.getDynamicValue(var162);
                    final SubLObject var12_479 = module0147.$g2095$.currentBinding(var162);
                    final SubLObject var170 = module0147.$g2094$.currentBinding(var162);
                    final SubLObject var171 = module0147.$g2096$.currentBinding(var162);
                    try {
                        module0147.$g2095$.bind(module0147.f9545(var169), var162);
                        module0147.$g2094$.bind(module0147.f9546(var169), var162);
                        module0147.$g2096$.bind(module0147.f9549(var169), var162);
                        final SubLObject var172 = $ic166$;
                        final SubLObject var12_480 = module0141.$g1714$.currentBinding(var162);
                        final SubLObject var13_482 = module0141.$g1715$.currentBinding(var162);
                        try {
                            module0141.$g1714$.bind((NIL != var172) ? var172 : module0141.f9283(), var162);
                            module0141.$g1715$.bind((SubLObject)((NIL != var172) ? $ic167$ : module0141.$g1715$.getDynamicValue(var162)), var162);
                            if (NIL != var172 && NIL != module0136.f8864() && NIL == module0141.f9279(var172)) {
                                final SubLObject var173 = module0136.$g1591$.getDynamicValue(var162);
                                if (var173.eql((SubLObject)$ic113$)) {
                                    module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic168$, var172, (SubLObject)$ic169$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                }
                                else if (var173.eql((SubLObject)$ic170$)) {
                                    module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic171$, (SubLObject)$ic168$, var172, (SubLObject)$ic169$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                }
                                else if (var173.eql((SubLObject)$ic172$)) {
                                    Errors.warn((SubLObject)$ic168$, var172, (SubLObject)$ic169$);
                                }
                                else {
                                    Errors.warn((SubLObject)$ic173$, module0136.$g1591$.getDynamicValue(var162));
                                    Errors.cerror((SubLObject)$ic171$, (SubLObject)$ic168$, var172, (SubLObject)$ic169$);
                                }
                            }
                            final SubLObject var12_481 = module0141.$g1670$.currentBinding(var162);
                            final SubLObject var13_483 = module0141.$g1671$.currentBinding(var162);
                            final SubLObject var14_486 = module0141.$g1672$.currentBinding(var162);
                            final SubLObject var174 = module0141.$g1674$.currentBinding(var162);
                            final SubLObject var175 = module0137.$g1605$.currentBinding(var162);
                            try {
                                module0141.$g1670$.bind(module0137.f8955($ic174$), var162);
                                module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic174$)), var162);
                                module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic174$)), var162);
                                module0141.$g1674$.bind((SubLObject)NIL, var162);
                                module0137.$g1605$.bind(module0137.f8955($ic174$), var162);
                                if (NIL != module0136.f8865() || NIL != module0244.f15795(var164, module0137.f8955((SubLObject)UNPROVIDED))) {
                                    final SubLObject var12_482 = module0141.$g1677$.currentBinding(var162);
                                    final SubLObject var13_484 = module0138.$g1619$.currentBinding(var162);
                                    final SubLObject var14_487 = module0141.$g1674$.currentBinding(var162);
                                    try {
                                        module0141.$g1677$.bind(module0141.f9208(), var162);
                                        module0138.$g1619$.bind(module0244.f15782(module0141.f9208(), module0137.f8955($ic174$)), var162);
                                        module0141.$g1674$.bind((SubLObject)NIL, var162);
                                        module0249.f16055(var165, (SubLObject)UNPROVIDED);
                                        while (NIL != var165 && NIL == var163) {
                                            final SubLObject var176 = var165;
                                            var163 = (SubLObject)makeBoolean(NIL != module0751.f46684(var176, $ic175$, (SubLObject)UNPROVIDED) || NIL != module0751.f46684(var176, $ic176$, (SubLObject)UNPROVIDED));
                                            final SubLObject var177 = module0200.f12443(module0137.f8955($ic174$));
                                            SubLObject var178;
                                            SubLObject var179;
                                            SubLObject var12_483;
                                            SubLObject var13_485;
                                            SubLObject var180;
                                            SubLObject var181;
                                            SubLObject var182;
                                            SubLObject var183;
                                            SubLObject var184;
                                            SubLObject var185;
                                            SubLObject var12_484;
                                            SubLObject var233_501;
                                            SubLObject var186;
                                            SubLObject var187;
                                            SubLObject var12_485;
                                            SubLObject var188;
                                            SubLObject var189;
                                            SubLObject var190;
                                            SubLObject var191;
                                            SubLObject var192;
                                            SubLObject var193;
                                            SubLObject var194;
                                            SubLObject var195;
                                            SubLObject var180_508;
                                            SubLObject var196;
                                            SubLObject var12_486;
                                            SubLObject var198;
                                            SubLObject var197;
                                            SubLObject var199;
                                            SubLObject var200;
                                            SubLObject var201;
                                            SubLObject var202;
                                            SubLObject var203;
                                            SubLObject var204;
                                            for (var178 = (SubLObject)NIL, var178 = var177; NIL == var163 && NIL != var178; var178 = var178.rest()) {
                                                var179 = var178.first();
                                                var12_483 = module0137.$g1605$.currentBinding(var162);
                                                var13_485 = module0141.$g1674$.currentBinding(var162);
                                                try {
                                                    module0137.$g1605$.bind(var179, var162);
                                                    module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var162)) : module0141.$g1674$.getDynamicValue(var162)), var162);
                                                    var180 = module0228.f15229(var165);
                                                    if (NIL != module0138.f8992(var180)) {
                                                        var181 = module0242.f15664(var180, module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var181) {
                                                            var182 = module0245.f15834(var181, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                            if (NIL != var182) {
                                                                for (var183 = module0066.f4838(module0067.f4891(var182)); NIL == var163 && NIL == module0066.f4841(var183); var183 = module0066.f4840(var183)) {
                                                                    var162.resetMultipleValues();
                                                                    var184 = module0066.f4839(var183);
                                                                    var185 = var162.secondMultipleValue();
                                                                    var162.resetMultipleValues();
                                                                    if (NIL != module0147.f9507(var184)) {
                                                                        var12_484 = module0138.$g1623$.currentBinding(var162);
                                                                        try {
                                                                            module0138.$g1623$.bind(var184, var162);
                                                                            for (var233_501 = module0066.f4838(module0067.f4891(var185)); NIL == var163 && NIL == module0066.f4841(var233_501); var233_501 = module0066.f4840(var233_501)) {
                                                                                var162.resetMultipleValues();
                                                                                var186 = module0066.f4839(var233_501);
                                                                                var187 = var162.secondMultipleValue();
                                                                                var162.resetMultipleValues();
                                                                                if (NIL != module0141.f9289(var186)) {
                                                                                    var12_485 = module0138.$g1624$.currentBinding(var162);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var186, var162);
                                                                                        var188 = var187;
                                                                                        if (NIL != module0077.f5302(var188)) {
                                                                                            var189 = module0077.f5333(var188);
                                                                                            for (var190 = module0032.f1741(var189), var191 = (SubLObject)NIL, var191 = module0032.f1742(var190, var189); NIL == var163 && NIL == module0032.f1744(var190, var191); var191 = module0032.f1743(var191)) {
                                                                                                var192 = module0032.f1745(var190, var191);
                                                                                                if (NIL != module0032.f1746(var191, var192) && NIL == module0249.f16059(var192, (SubLObject)UNPROVIDED)) {
                                                                                                    module0249.f16055(var192, (SubLObject)UNPROVIDED);
                                                                                                    module0056.f4149(var192, var167);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var188.isList()) {
                                                                                            if (NIL == var163) {
                                                                                                var193 = var188;
                                                                                                var194 = (SubLObject)NIL;
                                                                                                var194 = var193.first();
                                                                                                while (NIL == var163 && NIL != var193) {
                                                                                                    if (NIL == module0249.f16059(var194, (SubLObject)UNPROVIDED)) {
                                                                                                        module0249.f16055(var194, (SubLObject)UNPROVIDED);
                                                                                                        module0056.f4149(var194, var167);
                                                                                                    }
                                                                                                    var193 = var193.rest();
                                                                                                    var194 = var193.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)$ic177$, var188);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var12_485, var162);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var233_501);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var12_484, var162);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var183);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic178$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                        }
                                                    }
                                                    else if (NIL != module0155.f9785(var180, (SubLObject)UNPROVIDED)) {
                                                        var195 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var162), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var162), module0137.f8955((SubLObject)UNPROVIDED)));
                                                        for (var180_508 = (SubLObject)NIL, var180_508 = var195; NIL == var163 && NIL != var180_508; var180_508 = var180_508.rest()) {
                                                            var196 = var180_508.first();
                                                            var12_486 = module0138.$g1625$.currentBinding(var162);
                                                            try {
                                                                module0138.$g1625$.bind(var196, var162);
                                                                var197 = (var198 = Functions.funcall(var196, var180));
                                                                if (NIL != module0077.f5302(var198)) {
                                                                    var199 = module0077.f5333(var198);
                                                                    for (var200 = module0032.f1741(var199), var201 = (SubLObject)NIL, var201 = module0032.f1742(var200, var199); NIL == var163 && NIL == module0032.f1744(var200, var201); var201 = module0032.f1743(var201)) {
                                                                        var202 = module0032.f1745(var200, var201);
                                                                        if (NIL != module0032.f1746(var201, var202) && NIL == module0249.f16059(var202, (SubLObject)UNPROVIDED)) {
                                                                            module0249.f16055(var202, (SubLObject)UNPROVIDED);
                                                                            module0056.f4149(var202, var167);
                                                                        }
                                                                    }
                                                                }
                                                                else if (var198.isList()) {
                                                                    if (NIL == var163) {
                                                                        var203 = var198;
                                                                        var204 = (SubLObject)NIL;
                                                                        var204 = var203.first();
                                                                        while (NIL == var163 && NIL != var203) {
                                                                            if (NIL == module0249.f16059(var204, (SubLObject)UNPROVIDED)) {
                                                                                module0249.f16055(var204, (SubLObject)UNPROVIDED);
                                                                                module0056.f4149(var204, var167);
                                                                            }
                                                                            var203 = var203.rest();
                                                                            var204 = var203.first();
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)$ic177$, var198);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var12_486, var162);
                                                            }
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var13_485, var162);
                                                    module0137.$g1605$.rebind(var12_483, var162);
                                                }
                                            }
                                            var165 = module0056.f4150(var167);
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var14_487, var162);
                                        module0138.$g1619$.rebind(var13_484, var162);
                                        module0141.$g1677$.rebind(var12_482, var162);
                                    }
                                }
                                else {
                                    module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic179$, var164, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                }
                            }
                            finally {
                                module0137.$g1605$.rebind(var175, var162);
                                module0141.$g1674$.rebind(var174, var162);
                                module0141.$g1672$.rebind(var14_486, var162);
                                module0141.$g1671$.rebind(var13_483, var162);
                                module0141.$g1670$.rebind(var12_481, var162);
                            }
                        }
                        finally {
                            module0141.$g1715$.rebind(var13_482, var162);
                            module0141.$g1714$.rebind(var12_480, var162);
                        }
                    }
                    finally {
                        module0147.$g2096$.rebind(var171, var162);
                        module0147.$g2094$.rebind(var170, var162);
                        module0147.$g2095$.rebind(var12_479, var162);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var162));
                }
                finally {
                    module0139.$g1635$.rebind(var168, var162);
                }
            }
        }
        return var163;
    }
    
    public static SubLObject f49229(final SubLObject var203) {
        if (module0756.f47588(var203).numG((SubLObject)ONE_INTEGER) && module0756.f47477(var203).eql((SubLObject)ONE_INTEGER) && NIL != module0756.f47651(module0756.f47590(var203, (SubLObject)ONE_INTEGER))) {
            return (SubLObject)T;
        }
        if (NIL == module0756.f47478(var203)) {
            return (SubLObject)NIL;
        }
        if (NIL != f49229(module0756.f47590(var203, (SubLObject)ZERO_INTEGER))) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49246() {
        final SubLObject var165 = $g6167$.getGlobalValue();
        if (NIL != var165) {
            module0034.f1818(var165);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49247() {
        return module0034.f1829($g6167$.getGlobalValue(), (SubLObject)ConsesLow.list(EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49248() {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        SubLObject var7 = (SubLObject)NIL;
        final SubLObject var8 = module0147.f9540(module0579.$g4260$.getDynamicValue(var6));
        final SubLObject var9 = module0147.$g2095$.currentBinding(var6);
        final SubLObject var10 = module0147.$g2094$.currentBinding(var6);
        final SubLObject var11 = module0147.$g2096$.currentBinding(var6);
        try {
            module0147.$g2095$.bind(module0147.f9545(var8), var6);
            module0147.$g2094$.bind(module0147.f9546(var8), var6);
            module0147.$g2096$.bind(module0147.f9549(var8), var6);
            var7 = module0220.f14562($ic181$, $ic182$, (SubLObject)TWO_INTEGER, (SubLObject)THREE_INTEGER, (SubLObject)UNPROVIDED);
        }
        finally {
            module0147.$g2096$.rebind(var11, var6);
            module0147.$g2094$.rebind(var10, var6);
            module0147.$g2095$.rebind(var9, var6);
        }
        return var7;
    }
    
    public static SubLObject f49249() {
        SubLObject var511 = $g6167$.getGlobalValue();
        if (NIL == var511) {
            var511 = module0034.f1934((SubLObject)$ic180$, (SubLObject)$ic183$, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        SubLObject var512 = module0034.f1810(var511, (SubLObject)UNPROVIDED);
        if (var512 == $ic22$) {
            var512 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f49248()));
            module0034.f1812(var511, var512, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var512);
    }
    
    public static SubLObject f49250() {
        final SubLObject var165 = $g6168$.getGlobalValue();
        if (NIL != var165) {
            module0034.f1818(var165);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49251() {
        return module0034.f1829($g6168$.getGlobalValue(), (SubLObject)ConsesLow.list(EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49252() {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        SubLObject var7 = (SubLObject)NIL;
        final SubLObject var8 = module0147.f9540(module0579.$g4260$.getDynamicValue(var6));
        final SubLObject var9 = module0147.$g2095$.currentBinding(var6);
        final SubLObject var10 = module0147.$g2094$.currentBinding(var6);
        final SubLObject var11 = module0147.$g2096$.currentBinding(var6);
        try {
            module0147.$g2095$.bind(module0147.f9545(var8), var6);
            module0147.$g2094$.bind(module0147.f9546(var8), var6);
            module0147.$g2096$.bind(module0147.f9549(var8), var6);
            var7 = module0220.f14562($ic181$, $ic182$, (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
        }
        finally {
            module0147.$g2096$.rebind(var11, var6);
            module0147.$g2094$.rebind(var10, var6);
            module0147.$g2095$.rebind(var9, var6);
        }
        return var7;
    }
    
    public static SubLObject f49253() {
        SubLObject var511 = $g6168$.getGlobalValue();
        if (NIL == var511) {
            var511 = module0034.f1934((SubLObject)$ic184$, (SubLObject)$ic185$, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        SubLObject var512 = module0034.f1810(var511, (SubLObject)UNPROVIDED);
        if (var512 == $ic22$) {
            var512 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f49252()));
            module0034.f1812(var511, var512, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var512);
    }
    
    public static SubLObject f49254() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49137", "GENERATE-QUESTION", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49139", "S#51013", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49138", "S#53591", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49141", "S#53592", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49140", "S#53593", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49144", "S#53594", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49148", "S#51736", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49145", "S#53595", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49147", "S#53596", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49143", "S#53597", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49149", "S#53598", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49150", "S#53599", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49151", "S#53600", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49152", "S#53601", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49153", "S#53602", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49154", "S#53603", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49155", "S#53604", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49156", "S#53605", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49157", "S#53606", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49158", "S#53607", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49159", "S#53608", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49142", "S#53609", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49162", "S#53610", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49163", "S#53611", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49164", "ADD-GEN-TEMPLATE-QUERY-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49165", "REMOVE-GEN-TEMPLATE-QUERY-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49166", "S#53612", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49167", "S#53613", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49168", "S#53614", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49169", "S#53615", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49160", "S#53616", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49171", "S#53617", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49170", "S#53618", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49173", "S#53619", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49172", "S#53620", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49174", "S#53621", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49176", "S#53622", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49181", "S#53623", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49180", "S#53624", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49177", "S#53625", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49178", "S#53626", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49175", "S#53627", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49182", "S#53628", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49179", "S#53629", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49184", "S#53630", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49185", "S#53631", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49186", "S#53632", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49187", "S#53633", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49183", "S#53634", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49188", "S#53635", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49190", "S#53636", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49189", "S#53637", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49191", "S#53638", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49192", "S#53639", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49194", "S#53640", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49193", "S#53641", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49196", "S#53642", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49195", "S#53643", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49197", "S#53644", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49161", "S#53645", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49198", "S#53646", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49199", "S#53647", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49200", "S#53648", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49201", "S#53649", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49202", "S#53650", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49204", "S#53651", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49208", "S#53652", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49209", "S#53653", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49210", "S#53654", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49207", "S#53655", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49211", "S#53656", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49212", "S#39275", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49205", "S#53657", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49213", "S#53658", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49206", "S#53659", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49146", "S#53660", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49214", "S#53661", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49203", "S#53662", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49215", "S#53663", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49216", "S#53664", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49217", "S#53665", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49218", "S#53666", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49219", "S#53667", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49220", "S#53668", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49221", "S#53669", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49222", "S#53670", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49223", "S#53671", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49224", "S#53672", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49225", "S#53673", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49226", "S#53674", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49227", "S#53675", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49228", "S#53676", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49233", "S#53677", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49234", "S#53678", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49235", "S#53679", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49230", "S#53680", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49236", "S#53681", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49231", "S#53682", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49237", "S#53683", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49238", "S#53684", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49232", "S#53685", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49242", "S#53686", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49243", "S#53687", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49239", "S#52989", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49241", "S#53688", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49244", "S#53689", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49240", "S#53690", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49245", "S#53691", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49229", "S#53692", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49246", "S#53693", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49247", "S#53694", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49248", "S#53695", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49249", "S#51948", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49250", "S#53696", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49251", "S#53697", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49252", "S#53698", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0772", "f49253", "S#51947", 0, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49255() {
        $g6158$ = SubLFiles.deflexical("S#53699", (SubLObject)$ic10$);
        $g6159$ = SubLFiles.deflexical("S#53700", (SubLObject)NIL);
        $g6160$ = SubLFiles.defparameter("S#53701", (SubLObject)T);
        $g6161$ = SubLFiles.deflexical("S#53702", (SubLObject)$ic41$);
        $g6162$ = SubLFiles.deflexical("S#53703", Locks.make_lock((SubLObject)$ic42$));
        $g6163$ = SubLFiles.defparameter("S#53704", (SubLObject)NIL);
        $g6164$ = SubLFiles.deflexical("S#53705", (SubLObject)$ic68$);
        $g6165$ = SubLFiles.defparameter("S#53706", (SubLObject)ZERO_INTEGER);
        $g6166$ = SubLFiles.deflexical("S#53707", (SubLObject)SEVEN_INTEGER);
        $g6167$ = SubLFiles.deflexical("S#53708", (SubLObject)NIL);
        $g6168$ = SubLFiles.deflexical("S#53709", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49256() {
        module0034.f1895((SubLObject)$ic11$);
        module0034.f1909((SubLObject)$ic30$);
        module0012.f416((SubLObject)$ic43$);
        module0012.f416((SubLObject)$ic44$);
        module0034.f1895((SubLObject)$ic54$);
        module0012.f419((SubLObject)$ic66$);
        module0012.f419((SubLObject)$ic67$);
        module0012.f419((SubLObject)$ic70$);
        module0034.f1895((SubLObject)$ic71$);
        module0034.f1895((SubLObject)$ic75$);
        module0034.f1909((SubLObject)$ic180$);
        module0034.f1909((SubLObject)$ic184$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f49254();
    }
    
    public void initializeVariables() {
        f49255();
    }
    
    public void runTopLevelForms() {
        f49256();
    }
    
    static {
        me = (SubLFile)new module0772();
        $g6158$ = null;
        $g6159$ = null;
        $g6160$ = null;
        $g6161$ = null;
        $g6162$ = null;
        $g6163$ = null;
        $g6164$ = null;
        $g6165$ = null;
        $g6166$ = null;
        $g6167$ = null;
        $g6168$ = null;
        $ic0$ = makeKeyword("TEXT");
        $ic1$ = makeKeyword("ANY");
        $ic2$ = makeSymbol("S#39395", "CYC");
        $ic3$ = makeKeyword("DEFAULT");
        $ic4$ = makeKeyword("INTERROGATIVE");
        $ic5$ = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic6$ = makeKeyword("NEW");
        $ic7$ = makeSymbol("S#38", "CYC");
        $ic8$ = makeString("~% Top-level CycL: ~S");
        $ic9$ = makeSymbol("S#52542", "CYC");
        $ic10$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("tensed")));
        $ic11$ = makeSymbol("S#53593", "CYC");
        $ic12$ = ConsesLow.list((SubLObject)makeSymbol("S#53604", "CYC"), (SubLObject)makeSymbol("S#53674", "CYC"), (SubLObject)makeSymbol("S#53650", "CYC"));
        $ic13$ = makeKeyword("UNSPECIFIED");
        $ic14$ = ConsesLow.list((SubLObject)makeSymbol("S#53650", "CYC"));
        $ic15$ = makeSymbol("S#53609", "CYC");
        $ic16$ = makeString("~&Entering PPH-POSSIBLY-BINDING-VARIABLES(~S), *pph-var-types* are~% ~S~%");
        $ic17$ = makeString("Failed to paraphrase 'givens': ~S");
        $ic18$ = makeString("~&Leaving PPH-POSSIBLY-BINDING-VARIABLES(~S), vars in local *pph-var-types* were ~s ");
        $ic19$ = makeString("~&... and *pph-var-types* are now ~S~%");
        $ic20$ = constant_handles_oc.f8479((SubLObject)makeString("tensed"));
        $ic21$ = makeSymbol("S#5859", "CYC");
        $ic22$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic23$ = makeKeyword("ARG1");
        $ic24$ = makeKeyword("ARG2");
        $ic25$ = makeKeyword("EXISTENTIAL");
        $ic26$ = makeString("if");
        $ic27$ = ConsesLow.list((SubLObject)ZERO_INTEGER);
        $ic28$ = constant_handles_oc.f8479((SubLObject)makeString("implies"));
        $ic29$ = ConsesLow.list((SubLObject)makeSymbol("S#53604", "CYC"), (SubLObject)makeSymbol("S#53674", "CYC"));
        $ic30$ = makeSymbol("S#53602", "CYC");
        $ic31$ = constant_handles_oc.f8479((SubLObject)makeString("pastTense-Generic"));
        $ic32$ = makeSymbol("S#53700", "CYC");
        $ic33$ = makeKeyword("IGNORE");
        $ic34$ = constant_handles_oc.f8479((SubLObject)makeString("genQuestion"));
        $ic35$ = makeKeyword("GAF");
        $ic36$ = makeKeyword("TRUE");
        $ic37$ = makeString("~&Trying~% ~S");
        $ic38$ = makeString("(PPH error level ");
        $ic39$ = makeString(") ");
        $ic40$ = makeString("Done ~S alternatives of ~S");
        $ic41$ = makeKeyword("UNINITIALIZED");
        $ic42$ = makeString("genTemplate-QuerySentence index");
        $ic43$ = makeSymbol("ADD-GEN-TEMPLATE-QUERY-SENTENCE");
        $ic44$ = makeSymbol("REMOVE-GEN-TEMPLATE-QUERY-SENTENCE");
        $ic45$ = makeSymbol("S#12274", "CYC");
        $ic46$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic47$ = constant_handles_oc.f8479((SubLObject)makeString("genTemplate-QuerySentence"));
        $ic48$ = makeSymbol("INDEXED-TERM-P");
        $ic49$ = makeSymbol("S#53614", "CYC");
        $ic50$ = makeSymbol("CAR");
        $ic51$ = makeSymbol(">");
        $ic52$ = makeSymbol("S#53617", "CYC");
        $ic53$ = makeSymbol("CONSTANT-P");
        $ic54$ = makeSymbol("S#53620", "CYC");
        $ic55$ = makeString("unexpected result from (UNIFY ~S ~S):~% ~S~%");
        $ic56$ = makeSymbol("S#50969", "CYC");
        $ic57$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#53710", "CYC"), (SubLObject)makeSymbol("S#53711", "CYC"));
        $ic58$ = makeString("Failed to match ~S to var in sentence. Got ~S~%");
        $ic59$ = makeString("Couldn't get arg position for ~S in ~S");
        $ic60$ = makeString("~S doesn't match ~S of ~S");
        $ic61$ = makeSymbol("KEYWORDP");
        $ic62$ = makeSymbol("EL-VAR?");
        $ic63$ = makeSymbol("S#14106", "CYC");
        $ic64$ = makeSymbol("S#15442", "CYC");
        $ic65$ = makeSymbol("MAKE-EL-VAR");
        $ic66$ = makeSymbol("S#53630", "CYC");
        $ic67$ = makeSymbol("S#53631", "CYC");
        $ic68$ = makeInteger(40);
        $ic69$ = makeString("Exceeded PPH unify recursion depth of ~S.~%");
        $ic70$ = makeSymbol("S#53635", "CYC");
        $ic71$ = makeSymbol("S#53637", "CYC");
        $ic72$ = makeString("Not in unify-multiple mode.");
        $ic73$ = makeString("Couldn't unify~% ~S~% ~S~% ...given ~S~%");
        $ic74$ = makeString("Found multiple bindings for~% ~S~% ~S ...given ~S~% ~S~%");
        $ic75$ = makeSymbol("S#53641", "CYC");
        $ic76$ = makeString("Skipping permutations for template of length ~D ~% ~S~% ~S");
        $ic77$ = makeString("Lost assumed bindings(?).~% ~S~%");
        $ic78$ = makeString("~%GTQS Bindings: ~S~% Map: ~S");
        $ic79$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#53710", "CYC"), (SubLObject)makeSymbol("S#53225", "CYC"));
        $ic80$ = makeString("GTQS: Couldn't find ~S in~% ~S~%");
        $ic81$ = makeString("GTQS: Replacing ~S with ~S ~S");
        $ic82$ = makeString("GTQS: Couldn't replace ~S for ~S in ~S");
        $ic83$ = constant_handles_oc.f8479((SubLObject)makeString("Thing"));
        $ic84$ = constant_handles_oc.f8479((SubLObject)makeString("InstanceNamedFn-Ternary"));
        $ic85$ = makeString("example");
        $ic86$ = makeInteger(30);
        $ic87$ = makeString("Checking #$genTemplate-QuerySentence assertions...");
        $ic88$ = makeString("~&Matched ~S of ~S #$genTemplate-QuerySentence assertions.~% Time: ~S seconds.~%");
        $ic89$ = makeString("Timed out after ~S seconds on~% ~S");
        $ic90$ = makeString("Didn't find gtqs in matches:~% ~S~%");
        $ic91$ = makeSymbol("S#51770", "CYC");
        $ic92$ = ConsesLow.list((SubLObject)makeKeyword("BLANKS"), (SubLObject)makeKeyword("VARS"));
        $ic93$ = makeKeyword("BLANKS");
        $ic94$ = makeKeyword("VARS");
        $ic95$ = makeSymbol("S#3593", "CYC");
        $ic96$ = constant_handles_oc.f8479((SubLObject)makeString("not"));
        $ic97$ = makeString("was ");
        $ic98$ = makeString("is ");
        $ic99$ = makeString("it ");
        $ic100$ = makeString("that");
        $ic101$ = makeString("true");
        $ic102$ = makeString("FALSE");
        $ic103$ = makeString("false");
        $ic104$ = makeString("were");
        $ic105$ = makeString("are");
        $ic106$ = makeString(" there such that");
        $ic107$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("plural-Generic")));
        $ic108$ = makeKeyword("AND");
        $ic109$ = makeString("what values of");
        $ic110$ = makeString("~&Setting arg-position of ~S to ~S from ~S.~%");
        $ic111$ = makeSymbol("S#51694", "CYC");
        $ic112$ = makeSymbol("S#50950", "CYC");
        $ic113$ = makeKeyword("ERROR");
        $ic114$ = constant_handles_oc.f8479((SubLObject)makeString("WHWord"));
        $ic115$ = constant_handles_oc.f8479((SubLObject)makeString("AuxVerb"));
        $ic116$ = makeSymbol("S#53662", "CYC");
        $ic117$ = constant_handles_oc.f8479((SubLObject)makeString("TheResultOfParsing"));
        $ic118$ = constant_handles_oc.f8479((SubLObject)makeString("nounStrings"));
        $ic119$ = constant_handles_oc.f8479((SubLObject)makeString("Determiner"));
        $ic120$ = makeSymbol("TRUE");
        $ic121$ = constant_handles_oc.f8479((SubLObject)makeString("Integer"));
        $ic122$ = makeSymbol("S#51007", "CYC");
        $ic123$ = makeString("~&~S determined to be a number var in ~S~%");
        $ic124$ = makeString("No number vars in ~S~%");
        $ic125$ = makeString("~&Trying to generate ~S using subject-auxiliary inversion.~%");
        $ic126$ = makeString("~&Made question template ~S");
        $ic127$ = makeString("?X such that");
        $ic128$ = makeString("in generate-phrase-with-subj-aux-inversion string is ~S; trying again~%");
        $ic129$ = makeString("~&Not subject-head-verb-initial:~% ~S");
        $ic130$ = makeSymbol("S#51409", "CYC");
        $ic131$ = constant_handles_oc.f8479((SubLObject)makeString("Verb"));
        $ic132$ = makeString("~&Couldn't find question subphrase:~% ~S");
        $ic133$ = makeString("~&Subject dtr of ~S is a wh-phrase; returning template as is.~%");
        $ic134$ = makeString("~&~S has no head verb; MAKE-QUESTION-TEMPLATE returning NIL.~%");
        $ic135$ = makeString("~&Head dtr ~S is a copula; placing it in front of the subject.~%");
        $ic136$ = makeString("~&Head dtr ~S is an auxiliary; placing it in front of the subject.~%");
        $ic137$ = makeString("~&~S may be a modal verb; MAKE-QUESTION-TEMPLATE returning NIL~%");
        $ic138$ = makeString("~&Adding do support to template ~S");
        $ic139$ = makeString("Fronting ~S");
        $ic140$ = makeKeyword("TEMPORAL-LOCATION");
        $ic141$ = makeKeyword("FALSE");
        $ic142$ = makeSymbol("S#53663", "CYC");
        $ic143$ = makeString("Found question phrase: ~S");
        $ic144$ = makeKeyword("NOT-FOUND");
        $ic145$ = makeSymbol("INTEGERP");
        $ic146$ = constant_handles_oc.f8479((SubLObject)makeString("Agent-Generic"));
        $ic147$ = constant_handles_oc.f8479((SubLObject)makeString("Person"));
        $ic148$ = makeString("in STRING-FOR-VAR-IN-QUESTION-PHRASE: var is ~S~%");
        $ic149$ = makeString("pph-var-type for ~S: ~S~%");
        $ic150$ = makeString("how many");
        $ic151$ = constant_handles_oc.f8479((SubLObject)makeString("nonPlural-Generic"));
        $ic152$ = constant_handles_oc.f8479((SubLObject)makeString("nonSingular-Generic"));
        $ic153$ = makeKeyword("WHAT");
        $ic154$ = constant_handles_oc.f8479((SubLObject)makeString("NounPhrase"));
        $ic155$ = makeString("what");
        $ic156$ = makeKeyword("ACCUSATIVE");
        $ic157$ = makeString("whom");
        $ic158$ = makeString("who");
        $ic159$ = makeString(" or what");
        $ic160$ = makeString("when");
        $ic161$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic162$ = makeKeyword("ANYTHING");
        $ic163$ = makeKeyword("BREADTH");
        $ic164$ = makeKeyword("QUEUE");
        $ic165$ = makeKeyword("STACK");
        $ic166$ = constant_handles_oc.f8479((SubLObject)makeString("True-JustificationTruth"));
        $ic167$ = makeSymbol("S#11450", "CYC");
        $ic168$ = makeString("~A is not a ~A");
        $ic169$ = makeSymbol("S#11592", "CYC");
        $ic170$ = makeKeyword("CERROR");
        $ic171$ = makeString("continue anyway");
        $ic172$ = makeKeyword("WARN");
        $ic173$ = makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic174$ = constant_handles_oc.f8479((SubLObject)makeString("genls"));
        $ic175$ = constant_handles_oc.f8479((SubLObject)makeString("FacetingCollectionType"));
        $ic176$ = constant_handles_oc.f8479((SubLObject)makeString("DisjointCollectionType"));
        $ic177$ = makeString("~A is neither SET-P nor LISTP.");
        $ic178$ = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic179$ = makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic180$ = makeSymbol("S#51948", "CYC");
        $ic181$ = constant_handles_oc.f8479((SubLObject)makeString("Modal"));
        $ic182$ = constant_handles_oc.f8479((SubLObject)makeString("partOfSpeech"));
        $ic183$ = makeSymbol("S#53708", "CYC");
        $ic184$ = makeSymbol("S#51947", "CYC");
        $ic185$ = makeSymbol("S#53709", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 2486 ms
	
	Decompiled with Procyon 0.5.32.
*/