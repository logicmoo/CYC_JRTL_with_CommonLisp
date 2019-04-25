package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0800 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0800";
    public static final String myFingerPrint = "de6746b87d9bec76bf6ee30ec270fa1c70eec12d89748e4e553c83d949edf16a";
    private static SubLSymbol $g6376$;
    private static SubLSymbol $g6377$;
    private static SubLSymbol $g6378$;
    private static SubLSymbol $g6379$;
    private static final SubLSymbol $ic0$;
    private static final SubLString $ic1$;
    private static final SubLList $ic2$;
    private static final SubLObject $ic3$;
    private static final SubLList $ic4$;
    private static final SubLString $ic5$;
    private static final SubLString $ic6$;
    private static final SubLList $ic7$;
    private static final SubLString $ic8$;
    private static final SubLString $ic9$;
    private static final SubLString $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLString $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLString $ic14$;
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
    private static final SubLSymbol $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLString $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLString $ic37$;
    private static final SubLString $ic38$;
    private static final SubLString $ic39$;
    private static final SubLString $ic40$;
    private static final SubLString $ic41$;
    private static final SubLString $ic42$;
    private static final SubLString $ic43$;
    private static final SubLString $ic44$;
    private static final SubLString $ic45$;
    private static final SubLString $ic46$;
    private static final SubLString $ic47$;
    private static final SubLString $ic48$;
    private static final SubLString $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLList $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLString $ic55$;
    private static final SubLString $ic56$;
    private static final SubLString $ic57$;
    private static final SubLString $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLString $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLString $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLString $ic71$;
    private static final SubLString $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLObject $ic77$;
    private static final SubLString $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLInteger $ic80$;
    private static final SubLInteger $ic81$;
    private static final SubLInteger $ic82$;
    private static final SubLInteger $ic83$;
    private static final SubLInteger $ic84$;
    private static final SubLInteger $ic85$;
    private static final SubLInteger $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLInteger $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLString $ic91$;
    private static final SubLString $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLString $ic94$;
    private static final SubLString $ic95$;
    private static final SubLString $ic96$;
    private static final SubLString $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLString $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLString $ic101$;
    private static final SubLString $ic102$;
    private static final SubLString $ic103$;
    private static final SubLInteger $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLString $ic106$;
    private static final SubLString $ic107$;
    private static final SubLString $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLString $ic110$;
    private static final SubLString $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLString $ic114$;
    private static final SubLString $ic115$;
    private static final SubLString $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLInteger $ic120$;
    private static final SubLString $ic121$;
    private static final SubLString $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLString $ic124$;
    private static final SubLString $ic125$;
    private static final SubLString $ic126$;
    private static final SubLList $ic127$;
    private static final SubLList $ic128$;
    private static final SubLString $ic129$;
    private static final SubLString $ic130$;
    private static final SubLString $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLList $ic134$;
    private static final SubLList $ic135$;
    private static final SubLString $ic136$;
    private static final SubLList $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLString $ic139$;
    private static final SubLString $ic140$;
    private static final SubLString $ic141$;
    private static final SubLString $ic142$;
    private static final SubLString $ic143$;
    private static final SubLString $ic144$;
    private static final SubLString $ic145$;
    
    public static SubLObject f51080(SubLObject var1) {
        if (var1 == module0800.UNPROVIDED) {
            var1 = (SubLObject)module0800.NIL;
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0587.$g4457$.currentBinding(var2);
        try {
            module0587.$g4457$.bind(module0015.$g131$.getDynamicValue(var2), var2);
            final SubLObject var4 = module0657.f40022(var1, (SubLObject)module0800.$ic2$);
            final SubLObject var5 = module0657.f40003(var1, module0800.$ic3$, (SubLObject)module0800.$ic4$);
            SubLObject var6 = module0642.f39113((SubLObject)module0800.$ic5$, var1, (SubLObject)module0800.UNPROVIDED);
            final SubLObject var7 = (SubLObject)((module0800.NIL != var6) ? module0800.NIL : module0155.f9795(var4, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED));
            SubLObject var8 = (SubLObject)module0800.NIL;
            if (module0800.NIL == var6) {
                var6 = var7.first();
            }
            var8 = module0434.f30578(var6, var4, var5, (SubLObject)module0800.UNPROVIDED);
            module0601.f36755((SubLObject)module0800.$ic6$);
            module0601.f36746();
            final SubLObject var9 = (SubLObject)module0800.$ic7$;
            try {
                final SubLObject var3_10 = module0601.$g4652$.currentBinding(var2);
                final SubLObject var10 = module0601.$g4654$.currentBinding(var2);
                try {
                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                    module0601.f36758((SubLObject)module0800.$ic8$, var9, (SubLObject)module0800.NIL, (SubLObject)module0800.T);
                    SubLObject var11 = var8;
                    SubLObject var12 = (SubLObject)module0800.NIL;
                    var12 = var11.first();
                    while (module0800.NIL != var11) {
                        final SubLObject var3_11 = module0601.$g4652$.currentBinding(var2);
                        final SubLObject var11_15 = module0601.$g4654$.currentBinding(var2);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                            module0601.f36758((SubLObject)module0800.$ic9$, (SubLObject)ConsesLow.list((SubLObject)module0800.$ic10$, var12), (SubLObject)module0800.T, (SubLObject)module0800.NIL);
                        }
                        finally {
                            module0601.$g4654$.rebind(var11_15, var2);
                            module0601.$g4652$.rebind(var3_11, var2);
                        }
                        var11 = var11.rest();
                        var12 = var11.first();
                    }
                }
                finally {
                    module0601.$g4654$.rebind(var10, var2);
                    module0601.$g4652$.rebind(var3_10, var2);
                }
            }
            finally {
                final SubLObject var3_12 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0800.T, var2);
                    module0601.f36746();
                    module0601.f36760((SubLObject)module0800.$ic8$);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var3_12, var2);
                }
            }
            return (SubLObject)module0800.NIL;
        }
        finally {
            module0587.$g4457$.rebind(var3, var2);
        }
    }
    
    public static SubLObject f51081(SubLObject var1) {
        if (var1 == module0800.UNPROVIDED) {
            var1 = (SubLObject)module0800.NIL;
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0587.$g4457$.currentBinding(var2);
        try {
            module0587.$g4457$.bind(module0015.$g131$.getDynamicValue(var2), var2);
            try {
                final SubLObject var3_17 = module0601.$g4652$.currentBinding(var2);
                final SubLObject var4 = module0601.$g4654$.currentBinding(var2);
                try {
                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                    module0601.f36758((SubLObject)module0800.$ic12$, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL);
                    f51082(var1);
                }
                finally {
                    module0601.$g4654$.rebind(var4, var2);
                    module0601.$g4652$.rebind(var3_17, var2);
                }
            }
            finally {
                final SubLObject var3_18 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0800.T, var2);
                    module0601.f36746();
                    module0601.f36760((SubLObject)module0800.$ic12$);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var3_18, var2);
                }
            }
        }
        finally {
            module0587.$g4457$.rebind(var3, var2);
        }
        return (SubLObject)module0800.NIL;
    }
    
    public static SubLObject f51082(SubLObject var1) {
        if (var1 == module0800.UNPROVIDED) {
            var1 = (SubLObject)module0800.NIL;
        }
        final SubLObject var2 = module0589.f35872(module0642.f39104((SubLObject)module0800.$ic14$, var1));
        SubLObject var4;
        final SubLObject var3 = var4 = (SubLObject)module0800.NIL;
        SubLObject var5 = (SubLObject)module0800.NIL;
        var5 = var4.first();
        while (module0800.NIL != var4) {
            final SubLObject var6 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0800.$ic14$, f51083(var5)), Sequences.remove((SubLObject)ConsesLow.list((SubLObject)module0800.$ic14$, module0589.f35898(var2, (SubLObject)module0800.UNPROVIDED)), var1, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED));
            f51084(var6);
            var4 = var4.rest();
            var5 = var4.first();
        }
        return (SubLObject)module0800.NIL;
    }
    
    public static SubLObject f51085(SubLObject var1) {
        if (var1 == module0800.UNPROVIDED) {
            var1 = (SubLObject)module0800.NIL;
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0587.$g4457$.currentBinding(var2);
        try {
            module0587.$g4457$.bind(module0015.$g131$.getDynamicValue(var2), var2);
            try {
                final SubLObject var3_23 = module0601.$g4652$.currentBinding(var2);
                final SubLObject var4 = module0601.$g4654$.currentBinding(var2);
                try {
                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                    module0601.f36758((SubLObject)module0800.$ic12$, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL);
                    f51084(var1);
                }
                finally {
                    module0601.$g4654$.rebind(var4, var2);
                    module0601.$g4652$.rebind(var3_23, var2);
                }
            }
            finally {
                final SubLObject var3_24 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0800.T, var2);
                    module0601.f36746();
                    module0601.f36760((SubLObject)module0800.$ic12$);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var3_24, var2);
                }
            }
        }
        finally {
            module0587.$g4457$.rebind(var3, var2);
        }
        return (SubLObject)module0800.NIL;
    }
    
    public static SubLObject f51084(SubLObject var1) {
        if (var1 == module0800.UNPROVIDED) {
            var1 = (SubLObject)module0800.NIL;
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0589.f35872(module0642.f39104((SubLObject)module0800.$ic14$, var1));
        final SubLObject var4 = module0656.f39945(var3);
        final SubLObject var5 = module0642.f39110((SubLObject)module0800.$ic17$, var1, (SubLObject)module0800.$ic18$);
        final SubLObject var6 = module0656.f39945(var5);
        final SubLObject var7 = module0549.f33908(module0256.f16531(var4, var6, (SubLObject)module0800.UNPROVIDED), (SubLObject)module0800.UNPROVIDED);
        final SubLObject var8 = reader.read_from_string_ignoring_errors(module0642.f39110((SubLObject)module0800.$ic19$, var1, (SubLObject)module0800.$ic20$), (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED);
        final SubLObject var9 = reader.read_from_string_ignoring_errors(module0642.f39110((SubLObject)module0800.$ic21$, var1, (SubLObject)module0800.$ic20$), (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED);
        final SubLObject var10 = f51086(var1);
        final SubLObject var11 = module0587.$g4457$.currentBinding(var2);
        try {
            module0587.$g4457$.bind(module0015.$g131$.getDynamicValue(var2), var2);
            final SubLObject var12 = (SubLObject)ConsesLow.list((SubLObject)module0800.$ic22$, f51083(var4));
            final SubLObject var13 = (SubLObject)module0800.ZERO_INTEGER;
            try {
                final SubLObject var3_32 = module0601.$g4652$.currentBinding(var2);
                final SubLObject var14 = module0601.$g4654$.currentBinding(var2);
                try {
                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                    module0601.f36758((SubLObject)module0800.$ic14$, var12, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL);
                    try {
                        final SubLObject var3_33 = module0601.$g4652$.currentBinding(var2);
                        final SubLObject var11_34 = module0601.$g4654$.currentBinding(var2);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                            module0601.f36758((SubLObject)module0800.$ic23$, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL);
                            module0797.f50965(var4);
                            f51087(var4, var10, var9);
                        }
                        finally {
                            module0601.$g4654$.rebind(var11_34, var2);
                            module0601.$g4652$.rebind(var3_33, var2);
                        }
                    }
                    finally {
                        final SubLObject var3_34 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0800.T, var2);
                            module0601.f36746();
                            module0601.f36760((SubLObject)module0800.$ic23$);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var3_34, var2);
                        }
                    }
                    SubLObject var15 = var7;
                    SubLObject var16 = (SubLObject)module0800.NIL;
                    var16 = var15.first();
                    while (module0800.NIL != var15) {
                        if (module0800.NIL == var8 || var13.numL(var8)) {
                            final SubLObject var17 = f51083(var16);
                            final SubLObject var18 = (SubLObject)ConsesLow.list((SubLObject)module0800.$ic22$, var17);
                            try {
                                final SubLObject var3_35 = module0601.$g4652$.currentBinding(var2);
                                final SubLObject var11_35 = module0601.$g4654$.currentBinding(var2);
                                try {
                                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                                    module0601.f36758((SubLObject)module0800.$ic24$, var18, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL);
                                    try {
                                        final SubLObject var3_36 = module0601.$g4652$.currentBinding(var2);
                                        final SubLObject var11_36 = module0601.$g4654$.currentBinding(var2);
                                        try {
                                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                                            module0601.f36758((SubLObject)module0800.$ic23$, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL);
                                            module0797.f50965(var16);
                                            f51087(var16, var10, var9);
                                        }
                                        finally {
                                            module0601.$g4654$.rebind(var11_36, var2);
                                            module0601.$g4652$.rebind(var3_36, var2);
                                        }
                                    }
                                    finally {
                                        final SubLObject var3_37 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0800.T, var2);
                                            module0601.f36746();
                                            module0601.f36760((SubLObject)module0800.$ic23$);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var3_37, var2);
                                        }
                                    }
                                }
                                finally {
                                    module0601.$g4654$.rebind(var11_35, var2);
                                    module0601.$g4652$.rebind(var3_35, var2);
                                }
                            }
                            finally {
                                final SubLObject var3_38 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0800.T, var2);
                                    module0601.f36746();
                                    module0601.f36760((SubLObject)module0800.$ic24$);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var3_38, var2);
                                }
                            }
                        }
                        var15 = var15.rest();
                        var16 = var15.first();
                    }
                }
                finally {
                    module0601.$g4654$.rebind(var14, var2);
                    module0601.$g4652$.rebind(var3_32, var2);
                }
            }
            finally {
                final SubLObject var3_39 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0800.T, var2);
                    module0601.f36746();
                    module0601.f36760((SubLObject)module0800.$ic14$);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var3_39, var2);
                }
            }
        }
        finally {
            module0587.$g4457$.rebind(var11, var2);
        }
        return (SubLObject)module0800.NIL;
    }
    
    public static SubLObject f51087(final SubLObject var21, final SubLObject var29, final SubLObject var45) {
        final SubLThread var46 = SubLProcess.currentSubLThread();
        if (module0800.NIL != var45) {
            SubLObject var47 = module0747.f46317(var21, var29);
            SubLObject var48 = (SubLObject)module0800.NIL;
            var48 = var47.first();
            while (module0800.NIL != var47) {
                try {
                    final SubLObject var49 = module0601.$g4652$.currentBinding(var46);
                    final SubLObject var50 = module0601.$g4654$.currentBinding(var46);
                    try {
                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var46), module0601.$g4652$.getDynamicValue(var46)), var46);
                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var46), var46);
                        module0601.f36758((SubLObject)module0800.$ic26$, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL);
                        PrintLow.format(module0587.$g4457$.getDynamicValue(var46), (SubLObject)module0800.$ic27$, module0747.f46318(var48, (SubLObject)module0800.NIL, (SubLObject)module0800.ZERO_INTEGER, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL));
                    }
                    finally {
                        module0601.$g4654$.rebind(var50, var46);
                        module0601.$g4652$.rebind(var49, var46);
                    }
                }
                finally {
                    final SubLObject var51 = Threads.$is_thread_performing_cleanupP$.currentBinding(var46);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0800.T, var46);
                        module0601.f36746();
                        module0601.f36760((SubLObject)module0800.$ic26$);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var51, var46);
                    }
                }
                var47 = var47.rest();
                var48 = var47.first();
            }
        }
        return (SubLObject)module0800.NIL;
    }
    
    public static SubLObject f51088(SubLObject var1) {
        if (var1 == module0800.UNPROVIDED) {
            var1 = (SubLObject)module0800.NIL;
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0587.$g4457$.currentBinding(var2);
        try {
            module0587.$g4457$.bind(module0015.$g131$.getDynamicValue(var2), var2);
            try {
                final SubLObject var3_47 = module0601.$g4652$.currentBinding(var2);
                final SubLObject var4 = module0601.$g4654$.currentBinding(var2);
                try {
                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                    module0601.f36758((SubLObject)module0800.$ic12$, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL);
                    f51082(var1);
                    f51089(var1);
                }
                finally {
                    module0601.$g4654$.rebind(var4, var2);
                    module0601.$g4652$.rebind(var3_47, var2);
                }
            }
            finally {
                final SubLObject var3_48 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0800.T, var2);
                    module0601.f36746();
                    module0601.f36760((SubLObject)module0800.$ic12$);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var3_48, var2);
                }
            }
        }
        finally {
            module0587.$g4457$.rebind(var3, var2);
        }
        return (SubLObject)module0800.NIL;
    }
    
    public static SubLObject f51090(SubLObject var1) {
        if (var1 == module0800.UNPROVIDED) {
            var1 = (SubLObject)module0800.NIL;
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0587.$g4457$.currentBinding(var2);
        try {
            module0587.$g4457$.bind(module0015.$g131$.getDynamicValue(var2), var2);
            try {
                final SubLObject var3_49 = module0601.$g4652$.currentBinding(var2);
                final SubLObject var4 = module0601.$g4654$.currentBinding(var2);
                try {
                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                    module0601.f36758((SubLObject)module0800.$ic12$, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL);
                    f51084(var1);
                    f51091(var1);
                }
                finally {
                    module0601.$g4654$.rebind(var4, var2);
                    module0601.$g4652$.rebind(var3_49, var2);
                }
            }
            finally {
                final SubLObject var3_50 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0800.T, var2);
                    module0601.f36746();
                    module0601.f36760((SubLObject)module0800.$ic12$);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var3_50, var2);
                }
            }
        }
        finally {
            module0587.$g4457$.rebind(var3, var2);
        }
        return (SubLObject)module0800.NIL;
    }
    
    public static SubLObject f51092(SubLObject var1) {
        if (var1 == module0800.UNPROVIDED) {
            var1 = (SubLObject)module0800.NIL;
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0587.$g4457$.currentBinding(var2);
        try {
            module0587.$g4457$.bind(module0015.$g131$.getDynamicValue(var2), var2);
            try {
                final SubLObject var3_51 = module0601.$g4652$.currentBinding(var2);
                final SubLObject var4 = module0601.$g4654$.currentBinding(var2);
                try {
                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                    module0601.f36758((SubLObject)module0800.$ic12$, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL);
                    f51089(var1);
                }
                finally {
                    module0601.$g4654$.rebind(var4, var2);
                    module0601.$g4652$.rebind(var3_51, var2);
                }
            }
            finally {
                final SubLObject var3_52 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0800.T, var2);
                    module0601.f36746();
                    module0601.f36760((SubLObject)module0800.$ic12$);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var3_52, var2);
                }
            }
        }
        finally {
            module0587.$g4457$.rebind(var3, var2);
        }
        return (SubLObject)module0800.NIL;
    }
    
    public static SubLObject f51089(SubLObject var1) {
        if (var1 == module0800.UNPROVIDED) {
            var1 = (SubLObject)module0800.NIL;
        }
        final SubLObject var2 = module0589.f35872(module0642.f39104((SubLObject)module0800.$ic14$, var1));
        SubLObject var4;
        final SubLObject var3 = var4 = (SubLObject)module0800.NIL;
        SubLObject var5 = (SubLObject)module0800.NIL;
        var5 = var4.first();
        while (module0800.NIL != var4) {
            final SubLObject var6 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0800.$ic14$, f51083(var5)), Sequences.remove((SubLObject)ConsesLow.list((SubLObject)module0800.$ic14$, module0589.f35898(var2, (SubLObject)module0800.UNPROVIDED)), var1, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED));
            f51091(var6);
            var4 = var4.rest();
            var5 = var4.first();
        }
        return (SubLObject)module0800.NIL;
    }
    
    public static SubLObject f51093(SubLObject var1) {
        if (var1 == module0800.UNPROVIDED) {
            var1 = (SubLObject)module0800.NIL;
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0587.$g4457$.currentBinding(var2);
        try {
            module0587.$g4457$.bind(module0015.$g131$.getDynamicValue(var2), var2);
            try {
                final SubLObject var3_53 = module0601.$g4652$.currentBinding(var2);
                final SubLObject var4 = module0601.$g4654$.currentBinding(var2);
                try {
                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                    module0601.f36758((SubLObject)module0800.$ic12$, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL);
                    f51091(var1);
                }
                finally {
                    module0601.$g4654$.rebind(var4, var2);
                    module0601.$g4652$.rebind(var3_53, var2);
                }
            }
            finally {
                final SubLObject var3_54 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0800.T, var2);
                    module0601.f36746();
                    module0601.f36760((SubLObject)module0800.$ic12$);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var3_54, var2);
                }
            }
        }
        finally {
            module0587.$g4457$.rebind(var3, var2);
        }
        return (SubLObject)module0800.NIL;
    }
    
    public static SubLObject f51091(SubLObject var1) {
        if (var1 == module0800.UNPROVIDED) {
            var1 = (SubLObject)module0800.NIL;
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0589.f35872(module0642.f39104((SubLObject)module0800.$ic14$, var1));
        final SubLObject var4 = module0656.f39945(var3);
        final SubLObject var5 = module0642.f39110((SubLObject)module0800.$ic17$, var1, (SubLObject)module0800.$ic18$);
        final SubLObject var6 = module0656.f39945(var5);
        final SubLObject var7 = module0549.f33908(module0259.f16840(module0285.f18875(var4, (SubLObject)module0800.UNPROVIDED), var6, (SubLObject)module0800.UNPROVIDED), (SubLObject)module0800.UNPROVIDED);
        final SubLObject var8 = reader.read_from_string_ignoring_errors(module0642.f39110((SubLObject)module0800.$ic19$, var1, (SubLObject)module0800.$ic20$), (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED);
        final SubLObject var9 = reader.read_from_string_ignoring_errors(module0642.f39110((SubLObject)module0800.$ic21$, var1, (SubLObject)module0800.$ic20$), (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED);
        final SubLObject var10 = f51086(var1);
        final SubLObject var11 = module0587.$g4457$.currentBinding(var2);
        try {
            module0587.$g4457$.bind(module0015.$g131$.getDynamicValue(var2), var2);
            final SubLObject var12 = (SubLObject)ConsesLow.list((SubLObject)module0800.$ic22$, f51083(var4));
            SubLObject var13 = (SubLObject)module0800.ZERO_INTEGER;
            try {
                final SubLObject var3_57 = module0601.$g4652$.currentBinding(var2);
                final SubLObject var14 = module0601.$g4654$.currentBinding(var2);
                try {
                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                    module0601.f36758((SubLObject)module0800.$ic14$, var12, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL);
                    try {
                        final SubLObject var3_58 = module0601.$g4652$.currentBinding(var2);
                        final SubLObject var11_59 = module0601.$g4654$.currentBinding(var2);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                            module0601.f36758((SubLObject)module0800.$ic23$, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL);
                            module0797.f50965(var4);
                            f51087(var4, var10, var9);
                        }
                        finally {
                            module0601.$g4654$.rebind(var11_59, var2);
                            module0601.$g4652$.rebind(var3_58, var2);
                        }
                    }
                    finally {
                        final SubLObject var3_59 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0800.T, var2);
                            module0601.f36746();
                            module0601.f36760((SubLObject)module0800.$ic23$);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var3_59, var2);
                        }
                    }
                    SubLObject var15 = var7;
                    SubLObject var16 = (SubLObject)module0800.NIL;
                    var16 = var15.first();
                    while (module0800.NIL != var15) {
                        if (module0800.NIL == var8 || var13.numL(var8)) {
                            final SubLObject var17 = f51083(var16);
                            final SubLObject var18 = (SubLObject)ConsesLow.list((SubLObject)module0800.$ic22$, var17);
                            try {
                                final SubLObject var3_60 = module0601.$g4652$.currentBinding(var2);
                                final SubLObject var11_60 = module0601.$g4654$.currentBinding(var2);
                                try {
                                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                                    module0601.f36758((SubLObject)module0800.$ic33$, var18, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL);
                                    try {
                                        final SubLObject var3_61 = module0601.$g4652$.currentBinding(var2);
                                        final SubLObject var11_61 = module0601.$g4654$.currentBinding(var2);
                                        try {
                                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                                            module0601.f36758((SubLObject)module0800.$ic23$, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL);
                                            module0797.f50965(var16);
                                            f51087(var16, var10, var9);
                                        }
                                        finally {
                                            module0601.$g4654$.rebind(var11_61, var2);
                                            module0601.$g4652$.rebind(var3_61, var2);
                                        }
                                    }
                                    finally {
                                        final SubLObject var3_62 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0800.T, var2);
                                            module0601.f36746();
                                            module0601.f36760((SubLObject)module0800.$ic23$);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var3_62, var2);
                                        }
                                    }
                                }
                                finally {
                                    module0601.$g4654$.rebind(var11_60, var2);
                                    module0601.$g4652$.rebind(var3_60, var2);
                                }
                            }
                            finally {
                                final SubLObject var3_63 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0800.T, var2);
                                    module0601.f36746();
                                    module0601.f36760((SubLObject)module0800.$ic33$);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var3_63, var2);
                                }
                            }
                            var13 = Numbers.add(var13, (SubLObject)module0800.ONE_INTEGER);
                        }
                        var15 = var15.rest();
                        var16 = var15.first();
                    }
                }
                finally {
                    module0601.$g4654$.rebind(var14, var2);
                    module0601.$g4652$.rebind(var3_57, var2);
                }
            }
            finally {
                final SubLObject var3_64 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0800.T, var2);
                    module0601.f36746();
                    module0601.f36760((SubLObject)module0800.$ic14$);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var3_64, var2);
                }
            }
        }
        finally {
            module0587.$g4457$.rebind(var11, var2);
        }
        return (SubLObject)module0800.NIL;
    }
    
    public static SubLObject f51094(SubLObject var1) {
        if (var1 == module0800.UNPROVIDED) {
            var1 = (SubLObject)module0800.NIL;
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0587.$g4457$.currentBinding(var2);
        try {
            module0587.$g4457$.bind(module0015.$g131$.getDynamicValue(var2), var2);
            final SubLObject var4 = module0589.f35872(module0642.f39104((SubLObject)module0800.$ic14$, var1));
            final SubLObject var5 = module0656.f39945(var4);
            final SubLObject var6 = f51086(var1);
            final SubLObject var7 = module0747.f46317(var5, var6);
            final SubLObject var8 = f51083(var5);
            final SubLObject var9 = (SubLObject)ConsesLow.list((SubLObject)module0800.$ic22$, var8);
            try {
                final SubLObject var3_73 = module0601.$g4652$.currentBinding(var2);
                final SubLObject var10 = module0601.$g4654$.currentBinding(var2);
                try {
                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                    module0601.f36758((SubLObject)module0800.$ic14$, var9, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL);
                    try {
                        final SubLObject var3_74 = module0601.$g4652$.currentBinding(var2);
                        final SubLObject var11_75 = module0601.$g4654$.currentBinding(var2);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                            module0601.f36758((SubLObject)module0800.$ic23$, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL);
                            module0797.f50965(var5);
                            SubLObject var11 = var7;
                            SubLObject var12 = (SubLObject)module0800.NIL;
                            var12 = var11.first();
                            while (module0800.NIL != var11) {
                                try {
                                    final SubLObject var3_75 = module0601.$g4652$.currentBinding(var2);
                                    final SubLObject var11_76 = module0601.$g4654$.currentBinding(var2);
                                    try {
                                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                                        module0601.f36758((SubLObject)module0800.$ic26$, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL);
                                        PrintLow.format(module0587.$g4457$.getDynamicValue(var2), (SubLObject)module0800.$ic27$, module0747.f46318(var12, (SubLObject)module0800.NIL, (SubLObject)module0800.ZERO_INTEGER, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL));
                                    }
                                    finally {
                                        module0601.$g4654$.rebind(var11_76, var2);
                                        module0601.$g4652$.rebind(var3_75, var2);
                                    }
                                }
                                finally {
                                    final SubLObject var3_76 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0800.T, var2);
                                        module0601.f36746();
                                        module0601.f36760((SubLObject)module0800.$ic26$);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var3_76, var2);
                                    }
                                }
                                var11 = var11.rest();
                                var12 = var11.first();
                            }
                        }
                        finally {
                            module0601.$g4654$.rebind(var11_75, var2);
                            module0601.$g4652$.rebind(var3_74, var2);
                        }
                    }
                    finally {
                        final SubLObject var3_77 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0800.T, var2);
                            module0601.f36746();
                            module0601.f36760((SubLObject)module0800.$ic23$);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var3_77, var2);
                        }
                    }
                }
                finally {
                    module0601.$g4654$.rebind(var10, var2);
                    module0601.$g4652$.rebind(var3_73, var2);
                }
            }
            finally {
                final SubLObject var3_78 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0800.T, var2);
                    module0601.f36746();
                    module0601.f36760((SubLObject)module0800.$ic14$);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var3_78, var2);
                }
            }
        }
        finally {
            module0587.$g4457$.rebind(var3, var2);
        }
        return (SubLObject)module0800.NIL;
    }
    
    public static SubLObject f51086(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0800.NIL;
        SubLObject var4 = (SubLObject)module0800.NIL;
        SubLObject var5;
        for (var5 = module0066.f4838(module0067.f4891(module0582.f35694())); module0800.NIL == module0066.f4841(var5); var5 = module0066.f4840(var5)) {
            var2.resetMultipleValues();
            final SubLObject var6 = module0066.f4839(var5);
            final SubLObject var7 = var2.secondMultipleValue();
            var2.resetMultipleValues();
            final SubLObject var8 = module0642.f39104(module0038.f2638(var6), var1);
            if (module0800.NIL != var8) {
                final SubLObject var9 = module0589.f35872(var8);
                final SubLObject var10 = module0656.f39945(var9);
                final SubLObject var11 = (module0800.NIL != var10) ? var10 : reader.read_from_string_ignoring_errors(var9, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED);
                if (module0800.NIL != var11) {
                    var4 = (SubLObject)ConsesLow.cons(var11, var4);
                    var4 = (SubLObject)ConsesLow.cons(var6, var4);
                }
            }
        }
        module0066.f4842(var5);
        var3 = module0747.f46308(var4);
        return var3;
    }
    
    public static SubLObject f51083(final SubLObject var21) {
        final SubLObject var22 = (module0800.NIL != module0173.f10955(var21)) ? module0205.f13144(var21) : var21;
        return module0038.f2698(module0038.f2626(module0205.f13144(var22)));
    }
    
    public static SubLObject f51095(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0642.f39104((SubLObject)module0800.$ic37$, var1);
        final SubLObject var4 = reader.read_from_string_ignoring_errors(var3, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED);
        final SubLObject var5 = module0642.f39104((SubLObject)module0800.$ic38$, var1);
        final SubLObject var6 = reader.read_from_string_ignoring_errors(var5, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED);
        final SubLObject var7 = module0642.f39104((SubLObject)module0800.$ic39$, var1);
        SubLObject var8 = (SubLObject)(var7.isString() ? reader.read_from_string_ignoring_errors(var7, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED) : module0800.NIL);
        final SubLObject var9 = (SubLObject)((var4.isInteger() && var6.isInteger()) ? module0361.f24195(var4, var6) : module0800.NIL);
        final SubLObject var10 = module0587.$g4457$.currentBinding(var2);
        try {
            module0587.$g4457$.bind(module0015.$g131$.getDynamicValue(var2), var2);
            module0601.f36755((SubLObject)module0800.$ic6$);
            module0601.f36746();
            if (module0800.NIL == oc_inference_datastructures_inference.f25275(var9)) {
                PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)module0800.$ic40$, var3, var5);
            }
            if (!var8.isInteger()) {
                var8 = oc_inference_datastructures_inference.f25533(var9);
            }
            final SubLObject var11 = Hashtables.gethash(var8, module0413.f28826(var9), (SubLObject)module0800.UNPROVIDED);
            PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)module0800.$ic41$, ConsesLow.nth((SubLObject)module0800.SIX_INTEGER, var11));
            PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)module0800.$ic42$, ConsesLow.nth((SubLObject)module0800.ZERO_INTEGER, var11));
            PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)module0800.$ic43$, ConsesLow.nth((SubLObject)module0800.ONE_INTEGER, var11));
            PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)module0800.$ic44$, ConsesLow.nth((SubLObject)module0800.TWO_INTEGER, var11));
            PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)module0800.$ic45$, ConsesLow.nth((SubLObject)module0800.THREE_INTEGER, var11));
            PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)module0800.$ic46$, (SubLObject)((module0800.NIL != assertion_handles_oc.f11035(ConsesLow.nth((SubLObject)module0800.FOUR_INTEGER, var11))) ? module0289.f19402(ConsesLow.nth((SubLObject)module0800.FOUR_INTEGER, var11)) : module0800.$ic47$));
            PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)module0800.$ic48$, module0173.f10958(ConsesLow.nth((SubLObject)module0800.FIVE_INTEGER, var11)));
            module0601.f36746();
        }
        finally {
            module0587.$g4457$.rebind(var10, var2);
        }
        return (SubLObject)module0800.NIL;
    }
    
    public static SubLObject f51096(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0642.f39104((SubLObject)module0800.$ic37$, var1);
        final SubLObject var4 = reader.read_from_string_ignoring_errors(var3, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED);
        final SubLObject var5 = module0642.f39104((SubLObject)module0800.$ic38$, var1);
        final SubLObject var6 = reader.read_from_string_ignoring_errors(var5, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED);
        final SubLObject var7 = module0642.f39104((SubLObject)module0800.$ic39$, var1);
        SubLObject var8 = (SubLObject)(var7.isString() ? reader.read_from_string_ignoring_errors(var7, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED) : module0800.NIL);
        final SubLObject var9 = (SubLObject)((var4.isInteger() && var6.isInteger()) ? module0361.f24195(var4, var6) : module0800.NIL);
        module0642.f39020((SubLObject)module0800.$ic49$);
        module0642.f39029((SubLObject)module0800.UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39028((SubLObject)module0800.UNPROVIDED);
        if (module0800.NIL == oc_inference_datastructures_inference.f25275(var9)) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)module0800.$ic40$, var3, var5);
        }
        if (!var8.isInteger()) {
            var8 = oc_inference_datastructures_inference.f25532(var9);
        }
        final SubLObject var10 = Hashtables.gethash(var8, module0413.f28826(var9), (SubLObject)module0800.UNPROVIDED);
        PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)module0800.$ic41$, ConsesLow.nth((SubLObject)module0800.SIX_INTEGER, var10));
        PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)module0800.$ic42$, ConsesLow.nth((SubLObject)module0800.ZERO_INTEGER, var10));
        PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)module0800.$ic43$, ConsesLow.nth((SubLObject)module0800.ONE_INTEGER, var10));
        PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)module0800.$ic44$, ConsesLow.nth((SubLObject)module0800.TWO_INTEGER, var10));
        PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)module0800.$ic45$, ConsesLow.nth((SubLObject)module0800.THREE_INTEGER, var10));
        PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)module0800.$ic46$, (SubLObject)((module0800.NIL != assertion_handles_oc.f11035(ConsesLow.nth((SubLObject)module0800.FOUR_INTEGER, var10))) ? module0289.f19402(ConsesLow.nth((SubLObject)module0800.FOUR_INTEGER, var10)) : module0800.$ic47$));
        PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)module0800.$ic48$, (SubLObject)((module0800.NIL != module0173.f10955(ConsesLow.nth((SubLObject)module0800.FIVE_INTEGER, var10))) ? module0173.f10958(ConsesLow.nth((SubLObject)module0800.FIVE_INTEGER, var10)) : module0800.$ic47$));
        module0642.f39028((SubLObject)module0800.UNPROVIDED);
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)module0800.UNPROVIDED);
        module0642.f39028((SubLObject)module0800.UNPROVIDED);
        return (SubLObject)module0800.NIL;
    }
    
    public static SubLObject f51097(final SubLObject var98, final SubLObject var99) {
        SubLObject var101;
        final SubLObject var100 = var101 = var98.rest();
        SubLObject var102 = (SubLObject)module0800.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var101, var100, (SubLObject)module0800.$ic51$);
        var102 = var101.first();
        final SubLObject var103;
        var101 = (var103 = var101.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0800.$ic52$, (SubLObject)ConsesLow.listS((SubLObject)module0800.$ic53$, (SubLObject)module0800.$ic54$, var102, ConsesLow.append(var103, (SubLObject)module0800.NIL)));
    }
    
    public static SubLObject f51098(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0642.f39104((SubLObject)module0800.$ic37$, var1);
        final SubLObject var4 = (SubLObject)(var3.isString() ? reader.read_from_string_ignoring_errors(var3, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED) : module0800.NIL);
        final SubLObject var5 = module0642.f39104((SubLObject)module0800.$ic38$, var1);
        final SubLObject var6 = (SubLObject)(var5.isString() ? reader.read_from_string_ignoring_errors(var5, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED) : module0800.NIL);
        final SubLObject var7 = module0642.f39104((SubLObject)module0800.$ic55$, var1);
        SubLObject var8 = (SubLObject)(var7.isString() ? reader.read_from_string_ignoring_errors(var7, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED) : module0800.NIL);
        final SubLObject var9 = module0642.f39104((SubLObject)module0800.$ic56$, var1);
        final SubLObject var10 = module0642.f39104((SubLObject)module0800.$ic57$, var1);
        final SubLObject var11 = (SubLObject)((var4.isInteger() && var6.isInteger()) ? module0361.f24195(var4, var6) : module0800.NIL);
        module0642.f39020((SubLObject)module0800.$ic49$);
        module0642.f39029((SubLObject)module0800.UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39028((SubLObject)module0800.UNPROVIDED);
        if (module0800.NIL == oc_inference_datastructures_inference.f25275(var11)) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)module0800.$ic40$, var3, var5);
        }
        final SubLObject var12 = module0413.f28831(var11);
        final SubLObject var13 = module0413.f28833(var11);
        if (!var8.isInteger()) {
            var8 = var13;
        }
        final SubLObject var14 = Hashtables.gethash(var8, var12, (SubLObject)module0800.UNPROVIDED);
        PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)module0800.$ic58$, conses_high.getf(var14, (SubLObject)module0800.$ic59$, (SubLObject)module0800.UNPROVIDED));
        PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)module0800.$ic60$, var13);
        PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)module0800.$ic61$, oc_inference_datastructures_inference.f25420(var11));
        PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)module0800.$ic41$, conses_high.getf(var14, (SubLObject)module0800.$ic62$, (SubLObject)module0800.UNPROVIDED));
        PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)module0800.$ic42$, conses_high.getf(var14, (SubLObject)module0800.$ic63$, (SubLObject)module0800.UNPROVIDED));
        PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)module0800.$ic43$, conses_high.getf(var14, (SubLObject)module0800.$ic64$, (SubLObject)module0800.UNPROVIDED));
        PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)module0800.$ic44$, conses_high.getf(var14, (SubLObject)module0800.$ic65$, (SubLObject)module0800.UNPROVIDED));
        if (var9.equalp((SubLObject)module0800.$ic66$)) {
            final SubLObject var15 = conses_high.getf(var14, (SubLObject)module0800.$ic67$, (SubLObject)module0800.UNPROVIDED);
            SubLObject var16 = (SubLObject)module0800.$ic47$;
            if (module0800.NIL != module0363.f24478(var15)) {
                for (var16 = module0363.f24552(var15); module0800.NIL != module0202.f12883(var16, (SubLObject)module0800.UNPROVIDED); var16 = module0205.f13204(var16, (SubLObject)module0800.UNPROVIDED)) {}
            }
            PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)module0800.$ic45$, var16);
        }
        else if (var9.equalp((SubLObject)module0800.$ic68$)) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)module0800.$ic46$, (SubLObject)((module0800.NIL != assertion_handles_oc.f11035(conses_high.getf(var14, (SubLObject)module0800.$ic69$, (SubLObject)module0800.UNPROVIDED))) ? module0289.f19396(conses_high.getf(var14, (SubLObject)module0800.$ic69$, (SubLObject)module0800.UNPROVIDED)) : module0800.$ic47$));
        }
        else if (var9.equalp((SubLObject)module0800.$ic14$)) {
            final SubLObject var17 = conses_high.getf(var14, (SubLObject)module0800.$ic70$, (SubLObject)module0800.UNPROVIDED);
            if (module0800.NIL != f51099(var17)) {
                PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)module0800.$ic48$, (SubLObject)((module0800.NIL != module0167.f10813(var17)) ? module0172.f10920(var17) : ((module0800.NIL != constant_handles_oc.f8449(var17)) ? var17 : module0800.$ic47$)));
            }
        }
        SubLObject var18 = f51100(var12, var8);
        SubLObject var19 = (SubLObject)module0800.NIL;
        SubLObject var20 = conses_high.set_difference(var18, var19, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED);
        if (module0800.NIL != var20) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)module0800.$ic71$, f51101(var20, var10));
        }
        var18 = f51102(var12, var8);
        var19 = (SubLObject)module0800.NIL;
        var20 = conses_high.set_difference(var18, var19, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED);
        if (module0800.NIL != var20) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)module0800.$ic72$, f51101(var20, var10));
        }
        module0642.f39028((SubLObject)module0800.UNPROVIDED);
        module0642.f39028((SubLObject)module0800.UNPROVIDED);
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)module0800.UNPROVIDED);
        return (SubLObject)module0800.NIL;
    }
    
    public static SubLObject f51100(final SubLObject var107, final SubLObject var104) {
        SubLObject var108 = (SubLObject)module0800.NIL;
        final SubLObject var109 = Hashtables.gethash(var104, var107, (SubLObject)module0800.UNPROVIDED);
        final SubLObject var110 = conses_high.getf(var109, (SubLObject)module0800.$ic67$, (SubLObject)module0800.UNPROVIDED);
        if (module0800.NIL != var110) {
            var108 = f51103(var110);
        }
        return var108;
    }
    
    public static SubLObject f51103(final SubLObject var109) {
        SubLObject var110 = (SubLObject)module0800.NIL;
        if (module0800.NIL != var109) {
            SubLObject var111 = module0205.f13183(f51104(var109), (SubLObject)module0800.$ic74$, (SubLObject)module0800.T, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED);
            SubLObject var112 = (SubLObject)module0800.NIL;
            var112 = var111.first();
            while (module0800.NIL != var111) {
                if (module0800.NIL != f51099(var112)) {
                    final SubLObject var113 = var112;
                    if (module0800.NIL == conses_high.member(var113, var110, Symbols.symbol_function((SubLObject)module0800.EQUAL), Symbols.symbol_function((SubLObject)module0800.IDENTITY))) {
                        var110 = (SubLObject)ConsesLow.cons(var113, var110);
                    }
                }
                var111 = var111.rest();
                var112 = var111.first();
            }
        }
        return var110;
    }
    
    public static SubLObject f51104(final SubLObject var109) {
        return module0205.f13147(module0363.f24552(var109), (SubLObject)module0800.$ic75$, (SubLObject)module0800.$ic76$, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED);
    }
    
    public static SubLObject f51102(final SubLObject var107, final SubLObject var104) {
        SubLObject var108 = (SubLObject)module0800.NIL;
        final SubLObject var109 = Hashtables.gethash(var104, var107, (SubLObject)module0800.UNPROVIDED);
        final SubLObject var110 = conses_high.getf(var109, (SubLObject)module0800.$ic69$, (SubLObject)module0800.UNPROVIDED);
        if (module0800.NIL != var110) {
            SubLObject var111 = module0205.f13183(var110, (SubLObject)module0800.$ic74$, (SubLObject)module0800.T, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED);
            SubLObject var112 = (SubLObject)module0800.NIL;
            var112 = var111.first();
            while (module0800.NIL != var111) {
                if (module0800.NIL != f51099(var112)) {
                    final SubLObject var113 = var112;
                    if (module0800.NIL == conses_high.member(var113, var108, Symbols.symbol_function((SubLObject)module0800.EQUAL), Symbols.symbol_function((SubLObject)module0800.IDENTITY))) {
                        var108 = (SubLObject)ConsesLow.cons(var113, var108);
                    }
                }
                var111 = var111.rest();
                var112 = var111.first();
            }
        }
        return var108;
    }
    
    public static SubLObject f51099(final SubLObject var21) {
        final SubLThread var22 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(var21.isNumber() || (module0800.NIL != constant_handles_oc.f8449(var21) && (module0800.NIL == module0800.$g6376$.getDynamicValue(var22) || module0800.NIL != module0794.f50804(var21, (SubLObject)module0800.UNPROVIDED))));
    }
    
    public static SubLObject f51101(final SubLObject var20, final SubLObject var106) {
        final SubLObject var107 = Numbers.log(module0549.f33906(module0800.$ic77$), (SubLObject)module0800.UNPROVIDED);
        SubLObject var108 = (SubLObject)module0800.NIL;
        SubLObject var109 = var20;
        SubLObject var110 = (SubLObject)module0800.NIL;
        var110 = var109.first();
        while (module0800.NIL != var109) {
            SubLObject var111 = (SubLObject)((var106.equalp((SubLObject)module0800.$ic78$) && module0800.NIL != module0173.f10955(var110)) ? module0745.f46259(var110, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED) : module0800.NIL);
            if (module0800.NIL != var111) {
                var111 = module0589.f35898(var111, (SubLObject)module0800.UNPROVIDED);
            }
            var108 = (SubLObject)ConsesLow.cons((module0800.NIL != var111) ? var111 : var110, var108);
            var108 = (SubLObject)ConsesLow.cons(f51105(var110, var107), var108);
            var109 = var109.rest();
            var110 = var109.first();
        }
        return Sequences.nreverse(var108);
    }
    
    public static SubLObject f51106() {
        final SubLObject var119 = module0800.$g6377$.getGlobalValue();
        if (module0800.NIL != var119) {
            module0034.f1818(var119);
        }
        return (SubLObject)module0800.NIL;
    }
    
    public static SubLObject f51107(final SubLObject var21, SubLObject var116) {
        if (var116 == module0800.UNPROVIDED) {
            var116 = module0549.f33906(module0800.$ic77$);
        }
        return module0034.f1829(module0800.$g6377$.getGlobalValue(), (SubLObject)ConsesLow.list(var21, var116), (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED);
    }
    
    public static SubLObject f51108(final SubLObject var21, final SubLObject var116) {
        final SubLThread var117 = SubLProcess.currentSubLThread();
        SubLObject var119;
        final SubLObject var118 = var119 = Numbers.add(random.random((SubLObject)module0800.$ic80$), Numbers.floor(Numbers.divide(Numbers.multiply((SubLObject)module0800.$ic81$, Numbers.log(module0048.f_1X(module0549.f33906(var21)), (SubLObject)module0800.UNPROVIDED)), var116), (SubLObject)module0800.UNPROVIDED));
        if (module0800.NIL != module0269.f17737(var21)) {
            var119 = Numbers.add(var119, (SubLObject)module0800.$ic82$);
        }
        else if (module0800.NIL != module0269.f17726(var21)) {
            var119 = Numbers.add(var119, (SubLObject)module0800.$ic83$);
        }
        else if (module0800.NIL != module0269.f17716(var21)) {
            var119 = Numbers.add(var119, (SubLObject)module0800.$ic84$);
        }
        else if (module0800.NIL == module0800.$g6376$.getDynamicValue(var117)) {
            final SubLObject var120 = module0800.$g6376$.currentBinding(var117);
            try {
                module0800.$g6376$.bind((SubLObject)module0800.T, var117);
                if (module0800.NIL == f51099(var21)) {
                    var119 = Numbers.add(var119, (SubLObject)module0800.$ic85$);
                }
            }
            finally {
                module0800.$g6376$.rebind(var120, var117);
            }
        }
        return Numbers.min((SubLObject)module0800.$ic86$, var119);
    }
    
    public static SubLObject f51105(final SubLObject var21, SubLObject var116) {
        if (var116 == module0800.UNPROVIDED) {
            var116 = module0549.f33906(module0800.$ic77$);
        }
        SubLObject var117 = module0800.$g6377$.getGlobalValue();
        if (module0800.NIL == var117) {
            var117 = module0034.f1934((SubLObject)module0800.$ic79$, (SubLObject)module0800.$ic87$, (SubLObject)module0800.$ic88$, (SubLObject)module0800.EQUAL, (SubLObject)module0800.TWO_INTEGER, (SubLObject)module0800.ZERO_INTEGER);
        }
        final SubLObject var118 = module0034.f1782(var21, var116);
        final SubLObject var119 = module0034.f1814(var117, var118, (SubLObject)module0800.UNPROVIDED);
        if (var119 != module0800.$ic89$) {
            SubLObject var120 = var119;
            SubLObject var121 = (SubLObject)module0800.NIL;
            var121 = var120.first();
            while (module0800.NIL != var120) {
                SubLObject var122 = var121.first();
                final SubLObject var123 = conses_high.second(var121);
                if (var21.equal(var122.first())) {
                    var122 = var122.rest();
                    if (module0800.NIL != var122 && module0800.NIL == var122.rest() && var116.equal(var122.first())) {
                        return module0034.f1959(var123);
                    }
                }
                var120 = var120.rest();
                var121 = var120.first();
            }
        }
        final SubLObject var124 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f51108(var21, var116)));
        module0034.f1836(var117, var118, var119, var124, (SubLObject)ConsesLow.list(var21, var116));
        return module0034.f1959(var124);
    }
    
    public static SubLObject f51109(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0642.f39104((SubLObject)module0800.$ic37$, var1);
        final SubLObject var4 = (SubLObject)(var3.isString() ? reader.read_from_string_ignoring_errors(var3, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED) : module0800.NIL);
        final SubLObject var5 = module0642.f39104((SubLObject)module0800.$ic38$, var1);
        final SubLObject var6 = (SubLObject)(var5.isString() ? reader.read_from_string_ignoring_errors(var5, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED) : module0800.NIL);
        final SubLObject var7 = (SubLObject)((var4.isInteger() && var6.isInteger()) ? module0361.f24195(var4, var6) : module0800.NIL);
        final SubLObject var8 = module0587.$g4457$.currentBinding(var2);
        try {
            module0587.$g4457$.bind(module0015.$g131$.getDynamicValue(var2), var2);
            module0601.f36755((SubLObject)module0800.$ic6$);
            module0601.f36746();
            if (module0800.NIL == oc_inference_datastructures_inference.f25275(var7)) {
                try {
                    final SubLObject var3_129 = module0601.$g4652$.currentBinding(var2);
                    final SubLObject var9 = module0601.$g4654$.currentBinding(var2);
                    try {
                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                        module0601.f36758((SubLObject)module0800.$ic91$, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL);
                        PrintLow.format(module0587.$g4457$.getDynamicValue(var2), (SubLObject)module0800.$ic40$, var3, var5);
                    }
                    finally {
                        module0601.$g4654$.rebind(var9, var2);
                        module0601.$g4652$.rebind(var3_129, var2);
                    }
                }
                finally {
                    final SubLObject var3_130 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0800.T, var2);
                        module0601.f36746();
                        module0601.f36760((SubLObject)module0800.$ic91$);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var3_130, var2);
                    }
                }
                return (SubLObject)module0800.NIL;
            }
            final SubLObject var10 = module0030.f1611(module0413.f28834(var7), (SubLObject)module0800.UNPROVIDED);
            if (!var10.isHashtable()) {
                try {
                    final SubLObject var3_131 = module0601.$g4652$.currentBinding(var2);
                    final SubLObject var11 = module0601.$g4654$.currentBinding(var2);
                    try {
                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                        module0601.f36758((SubLObject)module0800.$ic91$, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL);
                        PrintLow.format(module0587.$g4457$.getDynamicValue(var2), (SubLObject)module0800.$ic92$, var3, var5);
                    }
                    finally {
                        module0601.$g4654$.rebind(var11, var2);
                        module0601.$g4652$.rebind(var3_131, var2);
                    }
                }
                finally {
                    final SubLObject var3_132 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0800.T, var2);
                        module0601.f36746();
                        module0601.f36760((SubLObject)module0800.$ic91$);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var3_132, var2);
                    }
                }
                return (SubLObject)module0800.NIL;
            }
            SubLObject var12 = oc_inference_datastructures_inference.f25706(var7, (SubLObject)module0800.NIL);
            SubLObject var13 = (SubLObject)module0800.NIL;
            SubLObject var14 = (SubLObject)module0800.NIL;
            SubLObject var15 = (SubLObject)module0800.NIL;
            final Iterator var16 = Hashtables.getEntrySetIterator(var10);
            try {
                while (Hashtables.iteratorHasNext(var16)) {
                    final Map.Entry var17 = Hashtables.iteratorNextEntry(var16);
                    var14 = Hashtables.getEntryKey(var17);
                    var15 = Hashtables.getEntryValue(var17);
                    var13 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var14, Functions.apply((SubLObject)module0800.$ic93$, var15)), var13);
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(var16);
            }
            SubLObject var18 = (SubLObject)module0800.ZERO_INTEGER;
            SubLObject var19 = var13;
            SubLObject var20 = (SubLObject)module0800.NIL;
            var20 = var19.first();
            while (module0800.NIL != var19) {
                var18 = Numbers.add(var18, conses_high.second(var20));
                var19 = var19.rest();
                var20 = var19.first();
            }
            try {
                final SubLObject var3_133 = module0601.$g4652$.currentBinding(var2);
                final SubLObject var21 = module0601.$g4654$.currentBinding(var2);
                try {
                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                    module0601.f36758((SubLObject)module0800.$ic94$, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL);
                    try {
                        final SubLObject var3_134 = module0601.$g4652$.currentBinding(var2);
                        final SubLObject var11_144 = module0601.$g4654$.currentBinding(var2);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                            module0601.f36758((SubLObject)module0800.$ic95$, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL);
                            PrintLow.format(module0587.$g4457$.getDynamicValue(var2), (SubLObject)module0800.$ic96$, Numbers.truncate(Numbers.multiply((SubLObject)module0800.$ic86$, var12), (SubLObject)module0800.UNPROVIDED));
                        }
                        finally {
                            module0601.$g4654$.rebind(var11_144, var2);
                            module0601.$g4652$.rebind(var3_134, var2);
                        }
                    }
                    finally {
                        final SubLObject var3_135 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0800.T, var2);
                            module0601.f36746();
                            module0601.f36760((SubLObject)module0800.$ic95$);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var3_135, var2);
                        }
                    }
                    try {
                        final SubLObject var3_136 = module0601.$g4652$.currentBinding(var2);
                        final SubLObject var11_145 = module0601.$g4654$.currentBinding(var2);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                            module0601.f36758((SubLObject)module0800.$ic97$, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL);
                            PrintLow.format(module0587.$g4457$.getDynamicValue(var2), (SubLObject)module0800.$ic96$, Numbers.truncate(Numbers.multiply((SubLObject)module0800.$ic86$, var18), (SubLObject)module0800.UNPROVIDED));
                        }
                        finally {
                            module0601.$g4654$.rebind(var11_145, var2);
                            module0601.$g4652$.rebind(var3_136, var2);
                        }
                    }
                    finally {
                        final SubLObject var3_137 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0800.T, var2);
                            module0601.f36746();
                            module0601.f36760((SubLObject)module0800.$ic97$);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var3_137, var2);
                        }
                    }
                    final SubLObject var22 = Numbers.subtract(var12, var18);
                    if (var22.numG((SubLObject)module0800.ZERO_INTEGER)) {
                        var13 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0800.$ic98$, Numbers.subtract(var12, var18)), var13);
                        Hashtables.sethash((SubLObject)module0800.$ic98$, var10, (SubLObject)ConsesLow.list(Numbers.subtract(var12, var18)));
                    }
                    else {
                        var12 = var18;
                    }
                    try {
                        final SubLObject var3_138 = module0601.$g4652$.currentBinding(var2);
                        final SubLObject var11_146 = module0601.$g4654$.currentBinding(var2);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                            module0601.f36758((SubLObject)module0800.$ic99$, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL);
                            SubLObject var23 = Sort.sort(conses_high.copy_list(var13), (SubLObject)module0800.$ic112$, (SubLObject)module0800.$ic113$);
                            SubLObject var24 = (SubLObject)module0800.NIL;
                            var24 = var23.first();
                            while (module0800.NIL != var23) {
                                final SubLObject var25 = var24.first();
                                final SubLObject var26 = conses_high.second(var24);
                                final SubLObject var27 = Sequences.nreverse(conses_high.copy_list(Hashtables.gethash(var25, var10, (SubLObject)module0800.UNPROVIDED)));
                                SubLObject var28 = module0035.f2110((SubLObject)module0800.$ic100$, var27, (SubLObject)module0800.UNPROVIDED);
                                if (module0800.NIL == var28) {
                                    var28 = (SubLObject)ConsesLow.list((SubLObject)module0800.ZERO_INTEGER);
                                }
                                try {
                                    final SubLObject var3_139 = module0601.$g4652$.currentBinding(var2);
                                    final SubLObject var11_147 = module0601.$g4654$.currentBinding(var2);
                                    try {
                                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                                        module0601.f36758((SubLObject)module0800.$ic101$, (SubLObject)ConsesLow.list((SubLObject)module0800.$ic22$, (module0800.NIL != module0340.f22789(var25)) ? module0340.f22825(var25) : var25), (SubLObject)module0800.NIL, (SubLObject)module0800.NIL);
                                        try {
                                            final SubLObject var3_140 = module0601.$g4652$.currentBinding(var2);
                                            final SubLObject var11_148 = module0601.$g4654$.currentBinding(var2);
                                            try {
                                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                                                module0601.f36758((SubLObject)module0800.$ic95$, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL);
                                                PrintLow.format(module0587.$g4457$.getDynamicValue(var2), (SubLObject)module0800.$ic96$, Numbers.truncate(Numbers.multiply((SubLObject)module0800.$ic86$, var26), (SubLObject)module0800.UNPROVIDED));
                                            }
                                            finally {
                                                module0601.$g4654$.rebind(var11_148, var2);
                                                module0601.$g4652$.rebind(var3_140, var2);
                                            }
                                        }
                                        finally {
                                            final SubLObject var3_141 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0800.T, var2);
                                                module0601.f36746();
                                                module0601.f36760((SubLObject)module0800.$ic95$);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var3_141, var2);
                                            }
                                        }
                                        try {
                                            final SubLObject var3_142 = module0601.$g4652$.currentBinding(var2);
                                            final SubLObject var11_149 = module0601.$g4654$.currentBinding(var2);
                                            try {
                                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                                                module0601.f36758((SubLObject)module0800.$ic102$, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL);
                                                PrintLow.format(module0587.$g4457$.getDynamicValue(var2), (SubLObject)module0800.$ic103$, Numbers.multiply((SubLObject)module0800.$ic104$, Numbers.divide(var26, var12)));
                                            }
                                            finally {
                                                module0601.$g4654$.rebind(var11_149, var2);
                                                module0601.$g4652$.rebind(var3_142, var2);
                                            }
                                        }
                                        finally {
                                            final SubLObject var3_143 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0800.T, var2);
                                                module0601.f36746();
                                                module0601.f36760((SubLObject)module0800.$ic102$);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var3_143, var2);
                                            }
                                        }
                                        final SubLObject var29 = Numbers.subtract((SubLObject)module0800.ZERO_INTEGER, Functions.apply((SubLObject)module0800.$ic93$, module0035.f2110((SubLObject)module0800.$ic105$, var27, (SubLObject)module0800.UNPROVIDED)));
                                        if (module0800.NIL != module0048.f3293(var29)) {
                                            try {
                                                final SubLObject var3_144 = module0601.$g4652$.currentBinding(var2);
                                                final SubLObject var11_150 = module0601.$g4654$.currentBinding(var2);
                                                try {
                                                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                                                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                                                    module0601.f36758((SubLObject)module0800.$ic106$, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL);
                                                    PrintLow.format(module0587.$g4457$.getDynamicValue(var2), (SubLObject)module0800.$ic96$, Numbers.truncate(Numbers.multiply((SubLObject)module0800.$ic86$, Numbers.subtract((SubLObject)module0800.ZERO_INTEGER, Functions.apply((SubLObject)module0800.$ic93$, module0035.f2110((SubLObject)module0800.$ic105$, var27, (SubLObject)module0800.UNPROVIDED)))), (SubLObject)module0800.UNPROVIDED));
                                                }
                                                finally {
                                                    module0601.$g4654$.rebind(var11_150, var2);
                                                    module0601.$g4652$.rebind(var3_144, var2);
                                                }
                                            }
                                            finally {
                                                final SubLObject var3_145 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0800.T, var2);
                                                    module0601.f36746();
                                                    module0601.f36760((SubLObject)module0800.$ic106$);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var3_145, var2);
                                                }
                                            }
                                        }
                                        try {
                                            final SubLObject var3_146 = module0601.$g4652$.currentBinding(var2);
                                            final SubLObject var11_151 = module0601.$g4654$.currentBinding(var2);
                                            try {
                                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                                                module0601.f36758((SubLObject)module0800.$ic107$, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL);
                                                PrintLow.format(module0587.$g4457$.getDynamicValue(var2), (SubLObject)module0800.$ic96$, Sequences.length(var28));
                                            }
                                            finally {
                                                module0601.$g4654$.rebind(var11_151, var2);
                                                module0601.$g4652$.rebind(var3_146, var2);
                                            }
                                        }
                                        finally {
                                            final SubLObject var3_147 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0800.T, var2);
                                                module0601.f36746();
                                                module0601.f36760((SubLObject)module0800.$ic107$);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var3_147, var2);
                                            }
                                        }
                                        try {
                                            final SubLObject var3_148 = module0601.$g4652$.currentBinding(var2);
                                            final SubLObject var11_152 = module0601.$g4654$.currentBinding(var2);
                                            try {
                                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                                                module0601.f36758((SubLObject)module0800.$ic108$, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL);
                                                PrintLow.format(module0587.$g4457$.getDynamicValue(var2), (SubLObject)module0800.$ic96$, Numbers.truncate(Numbers.multiply((SubLObject)module0800.$ic86$, Functions.apply((SubLObject)module0800.$ic109$, var27)), (SubLObject)module0800.UNPROVIDED));
                                            }
                                            finally {
                                                module0601.$g4654$.rebind(var11_152, var2);
                                                module0601.$g4652$.rebind(var3_148, var2);
                                            }
                                        }
                                        finally {
                                            final SubLObject var3_149 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0800.T, var2);
                                                module0601.f36746();
                                                module0601.f36760((SubLObject)module0800.$ic108$);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var3_149, var2);
                                            }
                                        }
                                        try {
                                            final SubLObject var3_150 = module0601.$g4652$.currentBinding(var2);
                                            final SubLObject var11_153 = module0601.$g4654$.currentBinding(var2);
                                            try {
                                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                                                module0601.f36758((SubLObject)module0800.$ic110$, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL);
                                                PrintLow.format(module0587.$g4457$.getDynamicValue(var2), (SubLObject)module0800.$ic96$, Numbers.truncate(Numbers.multiply((SubLObject)module0800.$ic86$, module0048.f3387(var28, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED)), (SubLObject)module0800.UNPROVIDED));
                                            }
                                            finally {
                                                module0601.$g4654$.rebind(var11_153, var2);
                                                module0601.$g4652$.rebind(var3_150, var2);
                                            }
                                        }
                                        finally {
                                            final SubLObject var3_151 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0800.T, var2);
                                                module0601.f36746();
                                                module0601.f36760((SubLObject)module0800.$ic110$);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var3_151, var2);
                                            }
                                        }
                                        try {
                                            final SubLObject var3_152 = module0601.$g4652$.currentBinding(var2);
                                            final SubLObject var11_154 = module0601.$g4654$.currentBinding(var2);
                                            try {
                                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                                                module0601.f36758((SubLObject)module0800.$ic111$, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL, (SubLObject)module0800.NIL);
                                                PrintLow.format(module0587.$g4457$.getDynamicValue(var2), (SubLObject)module0800.$ic96$, Numbers.truncate(Numbers.multiply((SubLObject)module0800.$ic86$, module0048.f3384(var28)), (SubLObject)module0800.UNPROVIDED));
                                            }
                                            finally {
                                                module0601.$g4654$.rebind(var11_154, var2);
                                                module0601.$g4652$.rebind(var3_152, var2);
                                            }
                                        }
                                        finally {
                                            final SubLObject var3_153 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0800.T, var2);
                                                module0601.f36746();
                                                module0601.f36760((SubLObject)module0800.$ic111$);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var3_153, var2);
                                            }
                                        }
                                    }
                                    finally {
                                        module0601.$g4654$.rebind(var11_147, var2);
                                        module0601.$g4652$.rebind(var3_139, var2);
                                    }
                                }
                                finally {
                                    final SubLObject var3_154 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0800.T, var2);
                                        module0601.f36746();
                                        module0601.f36760((SubLObject)module0800.$ic101$);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var3_154, var2);
                                    }
                                }
                                var23 = var23.rest();
                                var24 = var23.first();
                            }
                        }
                        finally {
                            module0601.$g4654$.rebind(var11_146, var2);
                            module0601.$g4652$.rebind(var3_138, var2);
                        }
                    }
                    finally {
                        final SubLObject var3_155 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0800.T, var2);
                            module0601.f36746();
                            module0601.f36760((SubLObject)module0800.$ic99$);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var3_155, var2);
                        }
                    }
                }
                finally {
                    module0601.$g4654$.rebind(var21, var2);
                    module0601.$g4652$.rebind(var3_133, var2);
                }
            }
            finally {
                final SubLObject var3_156 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0800.T, var2);
                    module0601.f36746();
                    module0601.f36760((SubLObject)module0800.$ic94$);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var3_156, var2);
                }
            }
        }
        finally {
            module0587.$g4457$.rebind(var8, var2);
        }
        return (SubLObject)module0800.NIL;
    }
    
    public static SubLObject f51110(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0642.f39104((SubLObject)module0800.$ic37$, var1);
        final SubLObject var4 = reader.read_from_string_ignoring_errors(var3, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED);
        final SubLObject var5 = module0361.f23997(var4);
        final SubLObject var6 = module0642.f39104((SubLObject)module0800.$ic38$, var1);
        final SubLObject var7 = reader.read_from_string_ignoring_errors(var6, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED);
        final SubLObject var8 = (SubLObject)((var4.isInteger() && var7.isInteger()) ? module0361.f24195(var4, var7) : module0800.NIL);
        final SubLObject var9 = module0642.f39104((SubLObject)module0800.$ic114$, var1);
        final SubLObject var10 = (SubLObject)(var9.isString() ? reader.read_from_string_ignoring_errors(var9, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED) : module0800.NIL);
        final SubLObject var11 = module0642.f39104((SubLObject)module0800.$ic115$, var1);
        final SubLObject var12 = (SubLObject)(var11.isString() ? reader.read_from_string_ignoring_errors(var11, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED) : module0800.NIL);
        module0642.f39020((SubLObject)module0800.$ic49$);
        module0642.f39029((SubLObject)module0800.UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39028((SubLObject)module0800.UNPROVIDED);
        if (module0800.NIL != oc_inference_datastructures_inference.f25275(var8)) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)module0800.$ic116$, f51111(var5, var8, var10, var12));
        }
        else {
            PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)module0800.$ic40$, var3, var6);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)module0800.UNPROVIDED);
        return (SubLObject)module0800.NIL;
    }
    
    public static SubLObject f51112() {
        final SubLObject var119 = module0800.$g6378$.getGlobalValue();
        if (module0800.NIL != var119) {
            module0034.f1818(var119);
        }
        return (SubLObject)module0800.NIL;
    }
    
    public static SubLObject f51113(final SubLObject var182, SubLObject var96, SubLObject var187, SubLObject var188) {
        if (var96 == module0800.UNPROVIDED) {
            var96 = module0361.f24194(var182, (SubLObject)module0800.ZERO_INTEGER);
        }
        if (var187 == module0800.UNPROVIDED) {
            var187 = (SubLObject)module0800.ZERO_INTEGER;
        }
        if (var188 == module0800.UNPROVIDED) {
            var188 = module0413.f28833(var96);
        }
        return module0034.f1829(module0800.$g6378$.getGlobalValue(), (SubLObject)ConsesLow.list(var182, var96, var187, var188), (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED);
    }
    
    public static SubLObject f51114(final SubLObject var182, final SubLObject var96, final SubLObject var187, final SubLObject var188) {
        final SubLThread var189 = SubLProcess.currentSubLThread();
        SubLObject var190 = (SubLObject)module0800.NIL;
        final SubLObject var191 = module0643.$g4986$.currentBinding(var189);
        try {
            module0643.$g4986$.bind((SubLObject)module0800.NIL, var189);
            try {
                module0643.$g4986$.setDynamicValue(streams_high.make_private_string_output_stream(), var189);
                f51115(var182, var96, var187, var188);
                var190 = streams_high.get_output_stream_string(module0643.$g4986$.getDynamicValue(var189));
            }
            finally {
                final SubLObject var3_190 = Threads.$is_thread_performing_cleanupP$.currentBinding(var189);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0800.T, var189);
                    streams_high.close(module0643.$g4986$.getDynamicValue(var189), (SubLObject)module0800.UNPROVIDED);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var3_190, var189);
                }
            }
        }
        finally {
            module0643.$g4986$.rebind(var191, var189);
        }
        return var190;
    }
    
    public static SubLObject f51111(final SubLObject var182, SubLObject var96, SubLObject var187, SubLObject var188) {
        if (var96 == module0800.UNPROVIDED) {
            var96 = module0361.f24194(var182, (SubLObject)module0800.ZERO_INTEGER);
        }
        if (var187 == module0800.UNPROVIDED) {
            var187 = (SubLObject)module0800.ZERO_INTEGER;
        }
        if (var188 == module0800.UNPROVIDED) {
            var188 = module0413.f28833(var96);
        }
        SubLObject var189 = module0800.$g6378$.getGlobalValue();
        if (module0800.NIL == var189) {
            var189 = module0034.f1934((SubLObject)module0800.$ic118$, (SubLObject)module0800.$ic119$, (SubLObject)module0800.$ic120$, (SubLObject)module0800.EQUAL, (SubLObject)module0800.FOUR_INTEGER, (SubLObject)module0800.ZERO_INTEGER);
        }
        final SubLObject var190 = module0034.f1780(var182, var96, var187, var188);
        final SubLObject var191 = module0034.f1814(var189, var190, (SubLObject)module0800.UNPROVIDED);
        if (var191 != module0800.$ic89$) {
            SubLObject var192 = var191;
            SubLObject var193 = (SubLObject)module0800.NIL;
            var193 = var192.first();
            while (module0800.NIL != var192) {
                SubLObject var194 = var193.first();
                final SubLObject var195 = conses_high.second(var193);
                if (var182.equal(var194.first())) {
                    var194 = var194.rest();
                    if (var96.equal(var194.first())) {
                        var194 = var194.rest();
                        if (var187.equal(var194.first())) {
                            var194 = var194.rest();
                            if (module0800.NIL != var194 && module0800.NIL == var194.rest() && var188.equal(var194.first())) {
                                return module0034.f1959(var195);
                            }
                        }
                    }
                }
                var192 = var192.rest();
                var193 = var192.first();
            }
        }
        final SubLObject var196 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f51114(var182, var96, var187, var188)));
        module0034.f1836(var189, var190, var191, var196, (SubLObject)ConsesLow.list(var182, var96, var187, var188));
        return module0034.f1959(var196);
    }
    
    public static SubLObject f51115(final SubLObject var182, SubLObject var96, SubLObject var187, SubLObject var188) {
        if (var96 == module0800.UNPROVIDED) {
            var96 = module0361.f24194(var182, (SubLObject)module0800.ZERO_INTEGER);
        }
        if (var187 == module0800.UNPROVIDED) {
            var187 = (SubLObject)module0800.ZERO_INTEGER;
        }
        if (var188 == module0800.UNPROVIDED) {
            var188 = module0413.f28833(var96);
        }
        final SubLThread var189 = SubLProcess.currentSubLThread();
        final SubLObject var190 = f51116(var182, var96, var187, var188);
        final SubLObject var191 = module0077.f5313(Symbols.symbol_function((SubLObject)module0800.EQL), (SubLObject)module0800.UNPROVIDED);
        final SubLObject var192 = module0643.$g4989$.currentBinding(var189);
        try {
            module0643.$g4989$.bind((SubLObject)module0800.NIL, var189);
            module0643.f39161((SubLObject)module0800.$ic121$);
            final SubLObject var3_192 = module0643.$g4988$.currentBinding(var189);
            try {
                module0643.$g4988$.bind(module0048.f_1X(module0643.$g4988$.getDynamicValue(var189)), var189);
                assert module0800.NIL != Types.stringp((SubLObject)module0800.$ic122$) : module0800.$ic122$;
                if (module0800.NIL != module0643.$g4989$.getDynamicValue(var189)) {
                    module0643.f39161((SubLObject)module0800.$ic124$);
                }
                module0643.f39169();
                module0643.f39162((SubLObject)module0800.$ic122$);
                module0643.f39161((SubLObject)module0800.$ic125$);
                final SubLObject var3_193 = module0643.$g4987$.currentBinding(var189);
                try {
                    module0643.$g4987$.bind((SubLObject)module0800.NIL, var189);
                    module0643.f39161((SubLObject)module0800.$ic126$);
                    final SubLObject var3_194 = module0643.$g4988$.currentBinding(var189);
                    try {
                        module0643.$g4988$.bind(module0048.f_1X(module0643.$g4988$.getDynamicValue(var189)), var189);
                        SubLObject var193 = var190;
                        SubLObject var194 = (SubLObject)module0800.NIL;
                        var194 = var193.first();
                        while (module0800.NIL != var193) {
                            SubLObject var196;
                            final SubLObject var195 = var196 = var194;
                            SubLObject var197 = (SubLObject)module0800.NIL;
                            SubLObject var198 = (SubLObject)module0800.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var196, var195, (SubLObject)module0800.$ic127$);
                            var197 = var196.first();
                            var196 = (var198 = var196.rest());
                            SubLObject var201_202;
                            final SubLObject var199_200 = var201_202 = var198;
                            SubLObject var199 = (SubLObject)module0800.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var201_202, var199_200, (SubLObject)module0800.$ic128$);
                            var199 = var201_202.first();
                            final SubLObject var200;
                            var201_202 = (var200 = var201_202.rest());
                            f51117(var182, var199, var200, var191);
                            var193 = var193.rest();
                            var194 = var193.first();
                        }
                        module0643.f39161((SubLObject)module0800.$ic129$);
                    }
                    finally {
                        module0643.$g4988$.rebind(var3_194, var189);
                    }
                }
                finally {
                    module0643.$g4987$.rebind(var3_193, var189);
                }
                module0643.$g4989$.setDynamicValue((SubLObject)module0800.T, var189);
                assert module0800.NIL != Types.stringp((SubLObject)module0800.$ic130$) : module0800.$ic130$;
                if (module0800.NIL != module0643.$g4989$.getDynamicValue(var189)) {
                    module0643.f39161((SubLObject)module0800.$ic124$);
                }
                module0643.f39169();
                module0643.f39162((SubLObject)module0800.$ic130$);
                module0643.f39161((SubLObject)module0800.$ic125$);
                final SubLObject var3_195 = module0643.$g4987$.currentBinding(var189);
                try {
                    module0643.$g4987$.bind((SubLObject)module0800.NIL, var189);
                    module0643.f39161((SubLObject)module0800.$ic126$);
                    final SubLObject var3_196 = module0643.$g4988$.currentBinding(var189);
                    try {
                        module0643.$g4988$.bind(module0048.f_1X(module0643.$g4988$.getDynamicValue(var189)), var189);
                        final SubLObject var201 = module0077.f5333(var191);
                        SubLObject var202;
                        SubLObject var203;
                        SubLObject var204;
                        for (var202 = module0032.f1741(var201), var203 = (SubLObject)module0800.NIL, var203 = module0032.f1742(var202, var201); module0800.NIL == module0032.f1744(var202, var203); var203 = module0032.f1743(var203)) {
                            var204 = module0032.f1745(var202, var203);
                            if (module0800.NIL != module0032.f1746(var203, var204)) {
                                f51118(var204);
                            }
                        }
                        module0643.f39161((SubLObject)module0800.$ic129$);
                    }
                    finally {
                        module0643.$g4988$.rebind(var3_196, var189);
                    }
                }
                finally {
                    module0643.$g4987$.rebind(var3_195, var189);
                }
                module0643.$g4989$.setDynamicValue((SubLObject)module0800.T, var189);
                module0643.f39161((SubLObject)module0800.$ic131$);
            }
            finally {
                module0643.$g4988$.rebind(var3_192, var189);
            }
        }
        finally {
            module0643.$g4989$.rebind(var192, var189);
        }
        return var182;
    }
    
    public static SubLObject f51119(final SubLObject var46) {
        final SubLObject var47 = Sequences.find((SubLObject)module0800.$ic132$, var46, Symbols.symbol_function((SubLObject)module0800.EQL), Symbols.symbol_function((SubLObject)module0800.$ic113$), (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED);
        final SubLObject var48 = Sort.sort(conses_high.copy_list(Sequences.remove(var47, var46, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED)), Symbols.symbol_function((SubLObject)module0800.$ic133$), Symbols.symbol_function((SubLObject)module0800.$ic113$));
        return (SubLObject)((module0800.NIL != var47) ? ConsesLow.cons(var47, var48) : var48);
    }
    
    public static SubLObject f51120(final SubLObject var182, SubLObject var96, SubLObject var187, SubLObject var188) {
        if (var96 == module0800.UNPROVIDED) {
            var96 = module0361.f24194(var182, (SubLObject)module0800.ZERO_INTEGER);
        }
        if (var187 == module0800.UNPROVIDED) {
            var187 = (SubLObject)module0800.ZERO_INTEGER;
        }
        if (var188 == module0800.UNPROVIDED) {
            var188 = module0413.f28833(var96);
        }
        final SubLObject var189 = conses_high.set_difference(f51121(var182, var188, var96), f51121(var182, var187, var96), Symbols.symbol_function((SubLObject)module0800.EQUAL), (SubLObject)module0800.UNPROVIDED);
        return f51119(var189);
    }
    
    public static SubLObject f51116(final SubLObject var182, SubLObject var96, SubLObject var187, SubLObject var188) {
        if (var96 == module0800.UNPROVIDED) {
            var96 = module0361.f24194(var182, (SubLObject)module0800.ZERO_INTEGER);
        }
        if (var187 == module0800.UNPROVIDED) {
            var187 = (SubLObject)module0800.ZERO_INTEGER;
        }
        if (var188 == module0800.UNPROVIDED) {
            var188 = module0413.f28833(var96);
        }
        final SubLObject var189 = f51122(var182, var188, var96);
        final SubLObject var190 = f51122(var182, var187, var96);
        final SubLObject var191 = conses_high.set_difference(var189, var190, Symbols.symbol_function((SubLObject)module0800.EQUAL), (SubLObject)module0800.UNPROVIDED);
        return f51119(var191);
    }
    
    public static SubLObject f51123(final SubLObject var182, SubLObject var96) {
        if (var96 == module0800.UNPROVIDED) {
            var96 = module0361.f24194(var182, (SubLObject)module0800.ZERO_INTEGER);
        }
        final SubLObject var183 = module0078.f5369((SubLObject)module0800.ZERO_INTEGER, (SubLObject)module0800.UNPROVIDED);
        SubLObject var184 = (SubLObject)module0800.T;
        SubLObject var185;
        SubLObject var186;
        SubLObject var187;
        SubLObject var188;
        SubLObject var189;
        SubLObject var191;
        SubLObject var190;
        SubLObject var192;
        SubLObject var193;
        SubLObject var223_224;
        SubLObject var221_222;
        SubLObject var194;
        SubLObject var195;
        for (var185 = Numbers.subtract(module0413.f28833(var96), (SubLObject)module0800.TEN_INTEGER), var186 = (SubLObject)module0800.NIL, var186 = (SubLObject)module0800.ZERO_INTEGER; !var186.numGE(var185); var186 = Numbers.add(var186, (SubLObject)module0800.TEN_INTEGER)) {
            var187 = Numbers.add(var186, (SubLObject)module0800.TEN_INTEGER);
            var188 = f51116(var182, var96, var186, var187);
            var189 = (SubLObject)module0800.NIL;
            var189 = var188.first();
            while (module0800.NIL != var188) {
                var190 = (var191 = var189);
                var192 = (SubLObject)module0800.NIL;
                var193 = (SubLObject)module0800.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var191, var190, (SubLObject)module0800.$ic134$);
                var192 = var191.first();
                var191 = (var193 = var191.rest());
                var221_222 = (var223_224 = var193);
                var194 = (SubLObject)module0800.NIL;
                var195 = (SubLObject)module0800.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var223_224, var221_222, (SubLObject)module0800.$ic135$);
                var194 = var223_224.first();
                var223_224 = (var195 = var223_224.rest());
                if (module0800.NIL == module0077.f5320(var194, var183)) {
                    Errors.sublisp_break((SubLObject)module0800.$ic136$, new SubLObject[] { var194, var193, var186, var187 });
                    var184 = (SubLObject)module0800.NIL;
                }
                module0078.f5374(var195, var183);
                var188 = var188.rest();
                var189 = var188.first();
            }
        }
        return var184;
    }
    
    public static SubLObject f51121(final SubLObject var182, SubLObject var188, SubLObject var96) {
        if (var96 == module0800.UNPROVIDED) {
            var96 = module0361.f24194(var182, (SubLObject)module0800.ZERO_INTEGER);
        }
        if (var188.numG(module0413.f28833(var96))) {
            var188 = module0413.f28833(var96);
        }
        final SubLObject var189 = module0413.f28831(var96);
        SubLObject var190 = f51124(var189, var188);
        final SubLObject var191 = module0411.f28664(var182, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED);
        SubLObject var192 = (SubLObject)module0800.NIL;
        SubLObject var193 = (SubLObject)module0800.NIL;
        while (!var190.isInteger() && module0800.NIL == var193) {
            if (!var190.isInteger()) {
                var188 = Numbers.add(var188, (SubLObject)module0800.ONE_INTEGER);
                if (var188.numG(module0413.f28833(var96))) {
                    var193 = (SubLObject)module0800.T;
                }
                else {
                    var190 = f51124(var189, var188);
                }
            }
        }
        if (module0800.NIL == var193) {
            SubLObject var194 = var191;
            SubLObject var195 = (SubLObject)module0800.NIL;
            var195 = var194.first();
            while (module0800.NIL != var194) {
                SubLObject var197;
                final SubLObject var196 = var197 = var195;
                SubLObject var198 = (SubLObject)module0800.NIL;
                SubLObject var199 = (SubLObject)module0800.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var197, var196, (SubLObject)module0800.$ic137$);
                var198 = var197.first();
                var197 = (var199 = var197.rest());
                if (module0800.$ic132$ == var199.first()) {
                    var192 = module0035.f2063(var192, var198, var199, (SubLObject)module0800.UNPROVIDED);
                }
                else if (module0800.NIL == Sequences.find(var190, var199, Symbols.symbol_function((SubLObject)module0800.$ic133$), (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED)) {
                    var192 = module0035.f2063(var192, var198, var199, (SubLObject)module0800.UNPROVIDED);
                }
                var194 = var194.rest();
                var195 = var194.first();
            }
        }
        return module0035.f2325(var192, Symbols.symbol_function((SubLObject)module0800.$ic133$));
    }
    
    public static SubLObject f51122(final SubLObject var182, SubLObject var188, SubLObject var96) {
        if (var96 == module0800.UNPROVIDED) {
            var96 = module0361.f24194(var182, (SubLObject)module0800.ZERO_INTEGER);
        }
        if (var188.numG(module0413.f28833(var96))) {
            var188 = module0413.f28833(var96);
        }
        final SubLObject var189 = module0413.f28831(var96);
        SubLObject var190 = f51124(var189, var188);
        final SubLObject var191 = module0411.f28664(var182, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED);
        SubLObject var192 = (SubLObject)module0800.NIL;
        SubLObject var193 = (SubLObject)module0800.NIL;
        while (!var190.isInteger() && module0800.NIL == var193) {
            if (!var190.isInteger()) {
                var188 = Numbers.add(var188, (SubLObject)module0800.ONE_INTEGER);
                if (var188.numG(module0413.f28833(var96))) {
                    var193 = (SubLObject)module0800.T;
                }
                else {
                    var190 = f51124(var189, var188);
                }
            }
        }
        if (module0800.NIL == var193) {
            SubLObject var194 = var191;
            SubLObject var195 = (SubLObject)module0800.NIL;
            var195 = var194.first();
            while (module0800.NIL != var194) {
                SubLObject var197;
                final SubLObject var196 = var197 = var195;
                SubLObject var198 = (SubLObject)module0800.NIL;
                SubLObject var199 = (SubLObject)module0800.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var197, var196, (SubLObject)module0800.$ic137$);
                var198 = var197.first();
                var197 = (var199 = var197.rest());
                if (module0800.$ic132$ != var199.first()) {
                    if (module0800.NIL != Sequences.find(var190, var199, Symbols.symbol_function((SubLObject)module0800.$ic138$), (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED)) {
                        var199 = Sequences.delete(var190, var199, Symbols.symbol_function((SubLObject)module0800.$ic133$), (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED, (SubLObject)module0800.UNPROVIDED);
                    }
                    else {
                        var199 = (SubLObject)module0800.NIL;
                    }
                }
                if (module0800.NIL != var199) {
                    var192 = module0035.f2063(var192, var198, var199, (SubLObject)module0800.UNPROVIDED);
                }
                var194 = var194.rest();
                var195 = var194.first();
            }
        }
        return f51119(var192);
    }
    
    public static SubLObject f51124(final SubLObject var226, final SubLObject var236) {
        final SubLObject var237 = Hashtables.gethash(var236, var226, (SubLObject)module0800.UNPROVIDED);
        final SubLObject var238 = module0035.f2335(var237, (SubLObject)module0800.$ic67$, (SubLObject)module0800.UNPROVIDED);
        return (SubLObject)((module0800.NIL != module0363.f24478(var238)) ? module0363.f24508(var238) : module0800.NIL);
    }
    
    public static SubLObject f51117(final SubLObject var182, final SubLObject var203, final SubLObject var204, final SubLObject var191) {
        final SubLThread var205 = SubLProcess.currentSubLThread();
        if (module0800.NIL != module0643.$g4987$.getDynamicValue(var205)) {
            module0643.f39161((SubLObject)module0800.$ic124$);
        }
        module0643.f39169();
        final SubLObject var206 = module0643.$g4989$.currentBinding(var205);
        try {
            module0643.$g4989$.bind((SubLObject)module0800.NIL, var205);
            module0643.f39161((SubLObject)module0800.$ic121$);
            final SubLObject var3_237 = module0643.$g4988$.currentBinding(var205);
            try {
                module0643.$g4988$.bind(module0048.f_1X(module0643.$g4988$.getDynamicValue(var205)), var205);
                assert module0800.NIL != Types.stringp((SubLObject)module0800.$ic139$) : module0800.$ic139$;
                if (module0800.NIL != module0643.$g4989$.getDynamicValue(var205)) {
                    module0643.f39161((SubLObject)module0800.$ic124$);
                }
                module0643.f39169();
                module0643.f39162((SubLObject)module0800.$ic139$);
                module0643.f39161((SubLObject)module0800.$ic125$);
                module0643.f39160(var203, (SubLObject)module0800.UNPROVIDED);
                module0643.$g4989$.setDynamicValue((SubLObject)module0800.T, var205);
                assert module0800.NIL != Types.stringp((SubLObject)module0800.$ic140$) : module0800.$ic140$;
                if (module0800.NIL != module0643.$g4989$.getDynamicValue(var205)) {
                    module0643.f39161((SubLObject)module0800.$ic124$);
                }
                module0643.f39169();
                module0643.f39162((SubLObject)module0800.$ic140$);
                module0643.f39161((SubLObject)module0800.$ic125$);
                module0643.f39168(var204, (SubLObject)module0800.UNPROVIDED);
                module0643.$g4989$.setDynamicValue((SubLObject)module0800.T, var205);
                module0643.f39161((SubLObject)module0800.$ic131$);
            }
            finally {
                module0643.$g4988$.rebind(var3_237, var205);
            }
        }
        finally {
            module0643.$g4989$.rebind(var206, var205);
        }
        module0643.$g4987$.setDynamicValue((SubLObject)module0800.T, var205);
        SubLObject var207 = (SubLObject)ConsesLow.cons(var203, var204);
        SubLObject var208 = (SubLObject)module0800.NIL;
        var208 = var207.first();
        while (module0800.NIL != var207) {
            module0077.f5326(module0361.f24237(var182, var208), var191);
            var207 = var207.rest();
            var208 = var207.first();
        }
        return var191;
    }
    
    public static SubLObject f51118(final SubLObject var109) {
        final SubLThread var110 = SubLProcess.currentSubLThread();
        if (module0800.NIL != module0643.$g4987$.getDynamicValue(var110)) {
            module0643.f39161((SubLObject)module0800.$ic124$);
        }
        module0643.f39169();
        final SubLObject var111 = module0643.$g4989$.currentBinding(var110);
        try {
            module0643.$g4989$.bind((SubLObject)module0800.NIL, var110);
            module0643.f39161((SubLObject)module0800.$ic121$);
            final SubLObject var3_239 = module0643.$g4988$.currentBinding(var110);
            try {
                module0643.$g4988$.bind(module0048.f_1X(module0643.$g4988$.getDynamicValue(var110)), var110);
                assert module0800.NIL != Types.stringp((SubLObject)module0800.$ic141$) : module0800.$ic141$;
                if (module0800.NIL != module0643.$g4989$.getDynamicValue(var110)) {
                    module0643.f39161((SubLObject)module0800.$ic124$);
                }
                module0643.f39169();
                module0643.f39162((SubLObject)module0800.$ic141$);
                module0643.f39161((SubLObject)module0800.$ic125$);
                module0643.f39160(module0363.f24508(var109), (SubLObject)module0800.UNPROVIDED);
                module0643.$g4989$.setDynamicValue((SubLObject)module0800.T, var110);
                assert module0800.NIL != Types.stringp((SubLObject)module0800.$ic142$) : module0800.$ic142$;
                if (module0800.NIL != module0643.$g4989$.getDynamicValue(var110)) {
                    module0643.f39161((SubLObject)module0800.$ic124$);
                }
                module0643.f39169();
                module0643.f39162((SubLObject)module0800.$ic142$);
                module0643.f39161((SubLObject)module0800.$ic125$);
                module0643.f39160(print_high.princ_to_string(module0363.f24506(var109)), (SubLObject)module0800.UNPROVIDED);
                module0643.$g4989$.setDynamicValue((SubLObject)module0800.T, var110);
                assert module0800.NIL != Types.stringp((SubLObject)module0800.$ic143$) : module0800.$ic143$;
                if (module0800.NIL != module0643.$g4989$.getDynamicValue(var110)) {
                    module0643.f39161((SubLObject)module0800.$ic124$);
                }
                module0643.f39169();
                module0643.f39162((SubLObject)module0800.$ic143$);
                module0643.f39161((SubLObject)module0800.$ic125$);
                module0643.f39160(f51125(var109, (SubLObject)module0800.$ic78$), (SubLObject)module0800.UNPROVIDED);
                module0643.$g4989$.setDynamicValue((SubLObject)module0800.T, var110);
                assert module0800.NIL != Types.stringp((SubLObject)module0800.$ic10$) : module0800.$ic10$;
                if (module0800.NIL != module0643.$g4989$.getDynamicValue(var110)) {
                    module0643.f39161((SubLObject)module0800.$ic124$);
                }
                module0643.f39169();
                module0643.f39162((SubLObject)module0800.$ic10$);
                module0643.f39161((SubLObject)module0800.$ic125$);
                module0643.f39160(f51125(var109, (SubLObject)module0800.$ic10$), (SubLObject)module0800.UNPROVIDED);
                module0643.$g4989$.setDynamicValue((SubLObject)module0800.T, var110);
                module0643.f39161((SubLObject)module0800.$ic131$);
            }
            finally {
                module0643.$g4988$.rebind(var3_239, var110);
            }
        }
        finally {
            module0643.$g4989$.rebind(var111, var110);
        }
        module0643.$g4987$.setDynamicValue((SubLObject)module0800.T, var110);
        return var109;
    }
    
    public static SubLObject f51125(final SubLObject var109, final SubLObject var106) {
        final SubLThread var110 = SubLProcess.currentSubLThread();
        if (var106.equalp((SubLObject)module0800.$ic10$)) {
            return module0589.f35898(module0194.f12112(f51104(var109), (SubLObject)module0800.NIL, (SubLObject)module0800.T), (SubLObject)module0800.UNPROVIDED);
        }
        SubLObject var111 = (SubLObject)module0800.$ic144$;
        SubLObject var112 = (SubLObject)module0800.$ic144$;
        final SubLObject var113 = f51101(f51103(var109), var106);
        final SubLObject var114 = module0035.f2062(module0035.f2326(module0035.f2339(var113), Symbols.symbol_function((SubLObject)module0800.$ic133$)));
        SubLObject var115 = (SubLObject)module0800.NIL;
        final SubLObject var116 = module0800.$g6379$.getDynamicValue(var110);
        if (module0800.NIL == var115) {
            SubLObject var117 = var114;
            SubLObject var118 = (SubLObject)module0800.NIL;
            var118 = var117.first();
            while (module0800.NIL == var115 && module0800.NIL != var117) {
                var112 = var111;
                var111 = ((module0800.NIL != module0038.f2608(var111)) ? module0006.f202(var118) : Sequences.cconcatenate(var111, new SubLObject[] { module0589.f35898((SubLObject)module0800.$ic145$, (SubLObject)module0800.UNPROVIDED), module0006.f202(var118) }));
                var115 = module0035.f2002(var111, var116, (SubLObject)module0800.UNPROVIDED);
                var117 = var117.rest();
                var118 = var117.first();
            }
        }
        return (module0800.NIL != module0035.f2002(var111, var116, (SubLObject)module0800.UNPROVIDED)) ? var112 : var111;
    }
    
    public static SubLObject f51126() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0800", "f51080", "XML-QUERY-VARIABLE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0800", "f51081", "XML-GET-GENLS-FROM-STRING", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0800", "f51082", "XML-GET-GENLS-FROM-STRING-INT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0800", "f51085", "XML-GET-GENLS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0800", "f51084", "XML-GET-GENLS-INT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0800", "f51087", "S#55679", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0800", "f51088", "XML-GET-UPWARDS-CLOSURE-FROM-STRING", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0800", "f51090", "XML-GET-UPWARDS-CLOSURE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0800", "f51092", "XML-GET-ISAS-FROM-STRING", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0800", "f51089", "XML-GET-ISAS-FROM-STRING-INT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0800", "f51093", "XML-GET-ISAS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0800", "f51091", "XML-GET-ISAS-INT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0800", "f51094", "XML-GET-GENERATION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0800", "f51086", "S#55680", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0800", "f51083", "S#55681", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0800", "f51095", "XML-GET-INFERENCE-PROGRESS-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0800", "f51096", "CB-GET-INFERENCE-PROGRESS-INFO", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0800", "f51097", "S#55682");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0800", "f51098", "CB-INFERENCE-TICK-DATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0800", "f51100", "S#55683", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0800", "f51103", "S#55684", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0800", "f51104", "S#55685", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0800", "f51102", "S#55686", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0800", "f51099", "S#55687", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0800", "f51101", "S#55688", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0800", "f51106", "S#55689", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0800", "f51107", "S#55690", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0800", "f51108", "S#55691", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0800", "f51105", "S#55692", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0800", "f51109", "XML-GET-INFERENCE-HL-MODULE-TIMES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0800", "f51110", "CB-INFERENCE-LINK-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0800", "f51112", "S#55693", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0800", "f51113", "S#55694", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0800", "f51114", "S#55695", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0800", "f51111", "S#55696", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0800", "f51115", "S#55697", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0800", "f51119", "S#55698", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0800", "f51120", "S#55699", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0800", "f51116", "S#55700", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0800", "f51123", "S#55701", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0800", "f51121", "S#55702", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0800", "f51122", "S#55703", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0800", "f51124", "S#55704", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0800", "f51117", "S#55705", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0800", "f51118", "S#55706", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0800", "f51125", "S#55707", 2, 0, false);
        return (SubLObject)module0800.NIL;
    }
    
    public static SubLObject f51127() {
        module0800.$g6376$ = SubLFiles.defparameter("S#55708", (SubLObject)module0800.NIL);
        module0800.$g6377$ = SubLFiles.deflexical("S#55709", (SubLObject)module0800.NIL);
        module0800.$g6378$ = SubLFiles.deflexical("S#55710", (SubLObject)module0800.NIL);
        module0800.$g6379$ = SubLFiles.defparameter("S#55711", (SubLObject)module0800.$ic104$);
        return (SubLObject)module0800.NIL;
    }
    
    public static SubLObject f51128() {
        module0015.f877((SubLObject)module0800.$ic0$, (SubLObject)module0800.$ic1$);
        module0015.f873((SubLObject)module0800.$ic0$);
        module0015.f873((SubLObject)module0800.$ic13$);
        module0015.f873((SubLObject)module0800.$ic15$);
        module0015.f873((SubLObject)module0800.$ic16$);
        module0015.f873((SubLObject)module0800.$ic25$);
        module0015.f873((SubLObject)module0800.$ic28$);
        module0015.f873((SubLObject)module0800.$ic29$);
        module0015.f873((SubLObject)module0800.$ic30$);
        module0015.f873((SubLObject)module0800.$ic31$);
        module0015.f873((SubLObject)module0800.$ic32$);
        module0015.f873((SubLObject)module0800.$ic34$);
        module0015.f873((SubLObject)module0800.$ic35$);
        module0015.f877((SubLObject)module0800.$ic36$, (SubLObject)module0800.$ic1$);
        module0015.f873((SubLObject)module0800.$ic36$);
        module0015.f873((SubLObject)module0800.$ic50$);
        module0015.f873((SubLObject)module0800.$ic73$);
        module0034.f1909((SubLObject)module0800.$ic79$);
        module0015.f877((SubLObject)module0800.$ic90$, (SubLObject)module0800.$ic1$);
        module0015.f873((SubLObject)module0800.$ic90$);
        module0015.f873((SubLObject)module0800.$ic117$);
        module0034.f1909((SubLObject)module0800.$ic118$);
        return (SubLObject)module0800.NIL;
    }
    
    public void declareFunctions() {
        f51126();
    }
    
    public void initializeVariables() {
        f51127();
    }
    
    public void runTopLevelForms() {
        f51128();
    }
    
    static {
        me = (SubLFile)new module0800();
        module0800.$g6376$ = null;
        module0800.$g6377$ = null;
        module0800.$g6378$ = null;
        module0800.$g6379$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("XML-QUERY-VARIABLE");
        $ic1$ = SubLObjectFactory.makeString("text/xml");
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INPUT-NAME"), (SubLObject)SubLObjectFactory.makeString("query"));
        $ic3$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INPUT-NAME"), (SubLObject)SubLObjectFactory.makeString("mt"));
        $ic5$ = SubLObjectFactory.makeString("var");
        $ic6$ = SubLObjectFactory.makeString("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        $ic7$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("xmlns:xsi"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2001/XMLSchema-instance"), (SubLObject)SubLObjectFactory.makeString("xsi:schemaLocation"), (SubLObject)SubLObjectFactory.makeString("http://ws.opencyc.org/xsd/LightWeightResultSet http://ws.opencyc.org/xsd/LightWeightResultSet.xsd"), (SubLObject)SubLObjectFactory.makeString("xmlns:concepts"), (SubLObject)SubLObjectFactory.makeString("http://ws.opencyc.org/xsd/CycConcepts"), (SubLObject)SubLObjectFactory.makeString("xmlns"), (SubLObject)SubLObjectFactory.makeString("http://ws.opencyc.org/xsd/LightWeightResultSet"));
        $ic8$ = SubLObjectFactory.makeString("ResultSet");
        $ic9$ = SubLObjectFactory.makeString("Term");
        $ic10$ = SubLObjectFactory.makeString("cycl");
        $ic11$ = SubLObjectFactory.makeSymbol("S#5859", "CYC");
        $ic12$ = SubLObjectFactory.makeString("root");
        $ic13$ = SubLObjectFactory.makeSymbol("XML-GET-GENLS-FROM-STRING");
        $ic14$ = SubLObjectFactory.makeString("term");
        $ic15$ = SubLObjectFactory.makeSymbol("XML-GET-GENLS-FROM-STRING-INT");
        $ic16$ = SubLObjectFactory.makeSymbol("XML-GET-GENLS");
        $ic17$ = SubLObjectFactory.makeString("mt");
        $ic18$ = SubLObjectFactory.makeString("#$InferencePSC");
        $ic19$ = SubLObjectFactory.makeString("limit");
        $ic20$ = SubLObjectFactory.makeString("nil");
        $ic21$ = SubLObjectFactory.makeString("nl-generation");
        $ic22$ = SubLObjectFactory.makeString("name");
        $ic23$ = SubLObjectFactory.makeString("cycml");
        $ic24$ = SubLObjectFactory.makeString("genl");
        $ic25$ = SubLObjectFactory.makeSymbol("XML-GET-GENLS-INT");
        $ic26$ = SubLObjectFactory.makeString("generation");
        $ic27$ = SubLObjectFactory.makeString("~S");
        $ic28$ = SubLObjectFactory.makeSymbol("XML-GET-UPWARDS-CLOSURE-FROM-STRING");
        $ic29$ = SubLObjectFactory.makeSymbol("XML-GET-UPWARDS-CLOSURE");
        $ic30$ = SubLObjectFactory.makeSymbol("XML-GET-ISAS-FROM-STRING");
        $ic31$ = SubLObjectFactory.makeSymbol("XML-GET-ISAS-FROM-STRING-INT");
        $ic32$ = SubLObjectFactory.makeSymbol("XML-GET-ISAS");
        $ic33$ = SubLObjectFactory.makeString("isa");
        $ic34$ = SubLObjectFactory.makeSymbol("XML-GET-ISAS-INT");
        $ic35$ = SubLObjectFactory.makeSymbol("XML-GET-GENERATION");
        $ic36$ = SubLObjectFactory.makeSymbol("XML-GET-INFERENCE-PROGRESS-INFO");
        $ic37$ = SubLObjectFactory.makeString("problemStoreId");
        $ic38$ = SubLObjectFactory.makeString("inferenceId");
        $ic39$ = SubLObjectFactory.makeString("stepNumber");
        $ic40$ = SubLObjectFactory.makeString("ERROR: Could not find inference for problemStoreId ~S inferenceId ~S");
        $ic41$ = SubLObjectFactory.makeString("stepCount=~A~%");
        $ic42$ = SubLObjectFactory.makeString("problemCount=~A~%");
        $ic43$ = SubLObjectFactory.makeString("assertionTouchCount=~A~%");
        $ic44$ = SubLObjectFactory.makeString("termTouchCount=~A~%");
        $ic45$ = SubLObjectFactory.makeString("problemQueryFormula=\"~A\"~%");
        $ic46$ = SubLObjectFactory.makeString("lastAssertionTouched=\"~A\"~%");
        $ic47$ = SubLObjectFactory.makeString("NIL");
        $ic48$ = SubLObjectFactory.makeString("lastTermTouched=\"~A\"~%");
        $ic49$ = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic50$ = SubLObjectFactory.makeSymbol("CB-GET-INFERENCE-PROGRESS-INFO");
        $ic51$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1502", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#105", "CYC"));
        $ic52$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic53$ = SubLObjectFactory.makeSymbol("FORMAT");
        $ic54$ = SubLObjectFactory.makeSymbol("S#1089", "CYC");
        $ic55$ = SubLObjectFactory.makeString("tickNumber");
        $ic56$ = SubLObjectFactory.makeString("dataType");
        $ic57$ = SubLObjectFactory.makeString("language");
        $ic58$ = SubLObjectFactory.makeString("tickCount=~A~%");
        $ic59$ = SubLObjectFactory.makeKeyword("TICK-COUNT");
        $ic60$ = SubLObjectFactory.makeString("maxTick=~A~%");
        $ic61$ = SubLObjectFactory.makeString("inferenceStatus=~A~%");
        $ic62$ = SubLObjectFactory.makeKeyword("STEP-COUNT");
        $ic63$ = SubLObjectFactory.makeKeyword("PROBLEM-COUNT");
        $ic64$ = SubLObjectFactory.makeKeyword("ASSERTION-TOUCH-COUNT");
        $ic65$ = SubLObjectFactory.makeKeyword("TERM-TOUCH-COUNT");
        $ic66$ = SubLObjectFactory.makeString("problem");
        $ic67$ = SubLObjectFactory.makeKeyword("PROBLEM");
        $ic68$ = SubLObjectFactory.makeString("assertion");
        $ic69$ = SubLObjectFactory.makeKeyword("LAST-ASSERTION-TOUCHED");
        $ic70$ = SubLObjectFactory.makeKeyword("LAST-TERM-TOUCHED");
        $ic71$ = SubLObjectFactory.makeString("newProblemTerms=\"~A\"~%");
        $ic72$ = SubLObjectFactory.makeString("newAssertionTerms=\"~A\"~%");
        $ic73$ = SubLObjectFactory.makeSymbol("CB-INFERENCE-TICK-DATA");
        $ic74$ = SubLObjectFactory.makeSymbol("S#55687", "CYC");
        $ic75$ = SubLObjectFactory.makeSymbol("S#13483", "CYC");
        $ic76$ = SubLObjectFactory.makeSymbol("S#15505", "CYC");
        $ic77$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Thing"));
        $ic78$ = SubLObjectFactory.makeString("english");
        $ic79$ = SubLObjectFactory.makeSymbol("S#55692", "CYC");
        $ic80$ = SubLObjectFactory.makeInteger(50);
        $ic81$ = SubLObjectFactory.makeInteger(950);
        $ic82$ = SubLObjectFactory.makeInteger(900);
        $ic83$ = SubLObjectFactory.makeInteger(800);
        $ic84$ = SubLObjectFactory.makeInteger(600);
        $ic85$ = SubLObjectFactory.makeInteger(500);
        $ic86$ = SubLObjectFactory.makeInteger(1000);
        $ic87$ = SubLObjectFactory.makeSymbol("S#55709", "CYC");
        $ic88$ = SubLObjectFactory.makeInteger(128);
        $ic89$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic90$ = SubLObjectFactory.makeSymbol("XML-GET-INFERENCE-HL-MODULE-TIMES");
        $ic91$ = SubLObjectFactory.makeString("error");
        $ic92$ = SubLObjectFactory.makeString("ERROR: Could not find inference HL module times for problemStoreId ~S inferenceId ~S");
        $ic93$ = SubLObjectFactory.makeSymbol("+");
        $ic94$ = SubLObjectFactory.makeString("summary");
        $ic95$ = SubLObjectFactory.makeString("totalTime");
        $ic96$ = SubLObjectFactory.makeString("~d");
        $ic97$ = SubLObjectFactory.makeString("modulesTime");
        $ic98$ = SubLObjectFactory.makeSymbol("S#55712", "CYC");
        $ic99$ = SubLObjectFactory.makeString("modulesData");
        $ic100$ = SubLObjectFactory.makeSymbol("S#4689", "CYC");
        $ic101$ = SubLObjectFactory.makeString("module");
        $ic102$ = SubLObjectFactory.makeString("percentTime");
        $ic103$ = SubLObjectFactory.makeString("~,4f%");
        $ic104$ = SubLObjectFactory.makeInteger(100);
        $ic105$ = SubLObjectFactory.makeSymbol("S#4691", "CYC");
        $ic106$ = SubLObjectFactory.makeString("recursiveTime");
        $ic107$ = SubLObjectFactory.makeString("count");
        $ic108$ = SubLObjectFactory.makeString("maxTime");
        $ic109$ = SubLObjectFactory.makeSymbol("MAX");
        $ic110$ = SubLObjectFactory.makeString("medianTime");
        $ic111$ = SubLObjectFactory.makeString("meanTime");
        $ic112$ = SubLObjectFactory.makeSymbol(">");
        $ic113$ = SubLObjectFactory.makeSymbol("SECOND");
        $ic114$ = SubLObjectFactory.makeString("startTickNumber");
        $ic115$ = SubLObjectFactory.makeString("endTickNumber");
        $ic116$ = SubLObjectFactory.makeString("~A");
        $ic117$ = SubLObjectFactory.makeSymbol("CB-INFERENCE-LINK-INFO");
        $ic118$ = SubLObjectFactory.makeSymbol("S#55696", "CYC");
        $ic119$ = SubLObjectFactory.makeSymbol("S#55710", "CYC");
        $ic120$ = SubLObjectFactory.makeInteger(256);
        $ic121$ = SubLObjectFactory.makeString("{");
        $ic122$ = SubLObjectFactory.makeString("links");
        $ic123$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic124$ = SubLObjectFactory.makeString(",");
        $ic125$ = SubLObjectFactory.makeString(": ");
        $ic126$ = SubLObjectFactory.makeString("[");
        $ic127$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeUninternedSymbol("US#3165895"), (SubLObject)SubLObjectFactory.makeSymbol("S#1625", "CYC"));
        $ic128$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#54128", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#55713", "CYC"));
        $ic129$ = SubLObjectFactory.makeString("]");
        $ic130$ = SubLObjectFactory.makeString("problems");
        $ic131$ = SubLObjectFactory.makeString("}");
        $ic132$ = SubLObjectFactory.makeKeyword("ROOT");
        $ic133$ = SubLObjectFactory.makeSymbol("<");
        $ic134$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeUninternedSymbol("US#3165895"), (SubLObject)SubLObjectFactory.makeSymbol("S#143", "CYC"));
        $ic135$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#54128", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#55714", "CYC"));
        $ic136$ = SubLObjectFactory.makeString("Unseen parent ~D in ~S for ~S to ~S");
        $ic137$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#35839", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#55715", "CYC"));
        $ic138$ = SubLObjectFactory.makeSymbol(">=");
        $ic139$ = SubLObjectFactory.makeString("pp");
        $ic140$ = SubLObjectFactory.makeString("cp");
        $ic141$ = SubLObjectFactory.makeString("id");
        $ic142$ = SubLObjectFactory.makeString("status");
        $ic143$ = SubLObjectFactory.makeString("label");
        $ic144$ = SubLObjectFactory.makeString("");
        $ic145$ = SubLObjectFactory.makeString(" ");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0800.class
	Total time: 2174 ms
	
	Decompiled with Procyon 0.5.32.
*/