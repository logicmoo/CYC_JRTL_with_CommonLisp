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
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0587.$g4457$.currentBinding(var2);
        try {
            module0587.$g4457$.bind(module0015.$g131$.getDynamicValue(var2), var2);
            final SubLObject var4 = module0657.f40022(var1, (SubLObject)$ic2$);
            final SubLObject var5 = module0657.f40003(var1, $ic3$, (SubLObject)$ic4$);
            SubLObject var6 = module0642.f39113((SubLObject)$ic5$, var1, (SubLObject)UNPROVIDED);
            final SubLObject var7 = (SubLObject)((NIL != var6) ? NIL : module0155.f9795(var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            SubLObject var8 = (SubLObject)NIL;
            if (NIL == var6) {
                var6 = var7.first();
            }
            var8 = module0434.f30578(var6, var4, var5, (SubLObject)UNPROVIDED);
            module0601.f36755((SubLObject)$ic6$);
            module0601.f36746();
            final SubLObject var9 = (SubLObject)$ic7$;
            try {
                final SubLObject var3_10 = module0601.$g4652$.currentBinding(var2);
                final SubLObject var10 = module0601.$g4654$.currentBinding(var2);
                try {
                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                    module0601.f36758((SubLObject)$ic8$, var9, (SubLObject)NIL, (SubLObject)T);
                    SubLObject var11 = var8;
                    SubLObject var12 = (SubLObject)NIL;
                    var12 = var11.first();
                    while (NIL != var11) {
                        final SubLObject var3_11 = module0601.$g4652$.currentBinding(var2);
                        final SubLObject var11_15 = module0601.$g4654$.currentBinding(var2);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                            module0601.f36758((SubLObject)$ic9$, (SubLObject)ConsesLow.list((SubLObject)$ic10$, var12), (SubLObject)T, (SubLObject)NIL);
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
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var2);
                    module0601.f36746();
                    module0601.f36760((SubLObject)$ic8$);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var3_12, var2);
                }
            }
            return (SubLObject)NIL;
        }
        finally {
            module0587.$g4457$.rebind(var3, var2);
        }
    }
    
    public static SubLObject f51081(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
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
                    module0601.f36758((SubLObject)$ic12$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
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
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var2);
                    module0601.f36746();
                    module0601.f36760((SubLObject)$ic12$);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var3_18, var2);
                }
            }
        }
        finally {
            module0587.$g4457$.rebind(var3, var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51082(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        final SubLObject var2 = module0589.f35872(module0642.f39104((SubLObject)$ic14$, var1));
        SubLObject var4;
        final SubLObject var3 = var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        var5 = var4.first();
        while (NIL != var4) {
            final SubLObject var6 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic14$, f51083(var5)), Sequences.remove((SubLObject)ConsesLow.list((SubLObject)$ic14$, module0589.f35898(var2, (SubLObject)UNPROVIDED)), var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            f51084(var6);
            var4 = var4.rest();
            var5 = var4.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51085(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
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
                    module0601.f36758((SubLObject)$ic12$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
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
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var2);
                    module0601.f36746();
                    module0601.f36760((SubLObject)$ic12$);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var3_24, var2);
                }
            }
        }
        finally {
            module0587.$g4457$.rebind(var3, var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51084(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0589.f35872(module0642.f39104((SubLObject)$ic14$, var1));
        final SubLObject var4 = module0656.f39945(var3);
        final SubLObject var5 = module0642.f39110((SubLObject)$ic17$, var1, (SubLObject)$ic18$);
        final SubLObject var6 = module0656.f39945(var5);
        final SubLObject var7 = module0549.f33908(module0256.f16531(var4, var6, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
        final SubLObject var8 = reader.read_from_string_ignoring_errors(module0642.f39110((SubLObject)$ic19$, var1, (SubLObject)$ic20$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var9 = reader.read_from_string_ignoring_errors(module0642.f39110((SubLObject)$ic21$, var1, (SubLObject)$ic20$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var10 = f51086(var1);
        final SubLObject var11 = module0587.$g4457$.currentBinding(var2);
        try {
            module0587.$g4457$.bind(module0015.$g131$.getDynamicValue(var2), var2);
            final SubLObject var12 = (SubLObject)ConsesLow.list((SubLObject)$ic22$, f51083(var4));
            final SubLObject var13 = (SubLObject)ZERO_INTEGER;
            try {
                final SubLObject var3_32 = module0601.$g4652$.currentBinding(var2);
                final SubLObject var14 = module0601.$g4654$.currentBinding(var2);
                try {
                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                    module0601.f36758((SubLObject)$ic14$, var12, (SubLObject)NIL, (SubLObject)NIL);
                    try {
                        final SubLObject var3_33 = module0601.$g4652$.currentBinding(var2);
                        final SubLObject var11_34 = module0601.$g4654$.currentBinding(var2);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                            module0601.f36758((SubLObject)$ic23$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
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
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var2);
                            module0601.f36746();
                            module0601.f36760((SubLObject)$ic23$);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var3_34, var2);
                        }
                    }
                    SubLObject var15 = var7;
                    SubLObject var16 = (SubLObject)NIL;
                    var16 = var15.first();
                    while (NIL != var15) {
                        if (NIL == var8 || var13.numL(var8)) {
                            final SubLObject var17 = f51083(var16);
                            final SubLObject var18 = (SubLObject)ConsesLow.list((SubLObject)$ic22$, var17);
                            try {
                                final SubLObject var3_35 = module0601.$g4652$.currentBinding(var2);
                                final SubLObject var11_35 = module0601.$g4654$.currentBinding(var2);
                                try {
                                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                                    module0601.f36758((SubLObject)$ic24$, var18, (SubLObject)NIL, (SubLObject)NIL);
                                    try {
                                        final SubLObject var3_36 = module0601.$g4652$.currentBinding(var2);
                                        final SubLObject var11_36 = module0601.$g4654$.currentBinding(var2);
                                        try {
                                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                                            module0601.f36758((SubLObject)$ic23$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
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
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var2);
                                            module0601.f36746();
                                            module0601.f36760((SubLObject)$ic23$);
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
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var2);
                                    module0601.f36746();
                                    module0601.f36760((SubLObject)$ic24$);
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
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var2);
                    module0601.f36746();
                    module0601.f36760((SubLObject)$ic14$);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var3_39, var2);
                }
            }
        }
        finally {
            module0587.$g4457$.rebind(var11, var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51087(final SubLObject var21, final SubLObject var29, final SubLObject var45) {
        final SubLThread var46 = SubLProcess.currentSubLThread();
        if (NIL != var45) {
            SubLObject var47 = module0747.f46317(var21, var29);
            SubLObject var48 = (SubLObject)NIL;
            var48 = var47.first();
            while (NIL != var47) {
                try {
                    final SubLObject var49 = module0601.$g4652$.currentBinding(var46);
                    final SubLObject var50 = module0601.$g4654$.currentBinding(var46);
                    try {
                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var46), module0601.$g4652$.getDynamicValue(var46)), var46);
                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var46), var46);
                        module0601.f36758((SubLObject)$ic26$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                        PrintLow.format(module0587.$g4457$.getDynamicValue(var46), (SubLObject)$ic27$, module0747.f46318(var48, (SubLObject)NIL, (SubLObject)ZERO_INTEGER, (SubLObject)NIL, (SubLObject)NIL));
                    }
                    finally {
                        module0601.$g4654$.rebind(var50, var46);
                        module0601.$g4652$.rebind(var49, var46);
                    }
                }
                finally {
                    final SubLObject var51 = Threads.$is_thread_performing_cleanupP$.currentBinding(var46);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var46);
                        module0601.f36746();
                        module0601.f36760((SubLObject)$ic26$);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var51, var46);
                    }
                }
                var47 = var47.rest();
                var48 = var47.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51088(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
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
                    module0601.f36758((SubLObject)$ic12$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
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
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var2);
                    module0601.f36746();
                    module0601.f36760((SubLObject)$ic12$);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var3_48, var2);
                }
            }
        }
        finally {
            module0587.$g4457$.rebind(var3, var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51090(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
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
                    module0601.f36758((SubLObject)$ic12$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
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
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var2);
                    module0601.f36746();
                    module0601.f36760((SubLObject)$ic12$);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var3_50, var2);
                }
            }
        }
        finally {
            module0587.$g4457$.rebind(var3, var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51092(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
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
                    module0601.f36758((SubLObject)$ic12$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
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
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var2);
                    module0601.f36746();
                    module0601.f36760((SubLObject)$ic12$);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var3_52, var2);
                }
            }
        }
        finally {
            module0587.$g4457$.rebind(var3, var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51089(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        final SubLObject var2 = module0589.f35872(module0642.f39104((SubLObject)$ic14$, var1));
        SubLObject var4;
        final SubLObject var3 = var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        var5 = var4.first();
        while (NIL != var4) {
            final SubLObject var6 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic14$, f51083(var5)), Sequences.remove((SubLObject)ConsesLow.list((SubLObject)$ic14$, module0589.f35898(var2, (SubLObject)UNPROVIDED)), var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            f51091(var6);
            var4 = var4.rest();
            var5 = var4.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51093(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
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
                    module0601.f36758((SubLObject)$ic12$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
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
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var2);
                    module0601.f36746();
                    module0601.f36760((SubLObject)$ic12$);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var3_54, var2);
                }
            }
        }
        finally {
            module0587.$g4457$.rebind(var3, var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51091(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0589.f35872(module0642.f39104((SubLObject)$ic14$, var1));
        final SubLObject var4 = module0656.f39945(var3);
        final SubLObject var5 = module0642.f39110((SubLObject)$ic17$, var1, (SubLObject)$ic18$);
        final SubLObject var6 = module0656.f39945(var5);
        final SubLObject var7 = module0549.f33908(module0259.f16840(module0285.f18875(var4, (SubLObject)UNPROVIDED), var6, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
        final SubLObject var8 = reader.read_from_string_ignoring_errors(module0642.f39110((SubLObject)$ic19$, var1, (SubLObject)$ic20$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var9 = reader.read_from_string_ignoring_errors(module0642.f39110((SubLObject)$ic21$, var1, (SubLObject)$ic20$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var10 = f51086(var1);
        final SubLObject var11 = module0587.$g4457$.currentBinding(var2);
        try {
            module0587.$g4457$.bind(module0015.$g131$.getDynamicValue(var2), var2);
            final SubLObject var12 = (SubLObject)ConsesLow.list((SubLObject)$ic22$, f51083(var4));
            SubLObject var13 = (SubLObject)ZERO_INTEGER;
            try {
                final SubLObject var3_57 = module0601.$g4652$.currentBinding(var2);
                final SubLObject var14 = module0601.$g4654$.currentBinding(var2);
                try {
                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                    module0601.f36758((SubLObject)$ic14$, var12, (SubLObject)NIL, (SubLObject)NIL);
                    try {
                        final SubLObject var3_58 = module0601.$g4652$.currentBinding(var2);
                        final SubLObject var11_59 = module0601.$g4654$.currentBinding(var2);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                            module0601.f36758((SubLObject)$ic23$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
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
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var2);
                            module0601.f36746();
                            module0601.f36760((SubLObject)$ic23$);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var3_59, var2);
                        }
                    }
                    SubLObject var15 = var7;
                    SubLObject var16 = (SubLObject)NIL;
                    var16 = var15.first();
                    while (NIL != var15) {
                        if (NIL == var8 || var13.numL(var8)) {
                            final SubLObject var17 = f51083(var16);
                            final SubLObject var18 = (SubLObject)ConsesLow.list((SubLObject)$ic22$, var17);
                            try {
                                final SubLObject var3_60 = module0601.$g4652$.currentBinding(var2);
                                final SubLObject var11_60 = module0601.$g4654$.currentBinding(var2);
                                try {
                                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                                    module0601.f36758((SubLObject)$ic33$, var18, (SubLObject)NIL, (SubLObject)NIL);
                                    try {
                                        final SubLObject var3_61 = module0601.$g4652$.currentBinding(var2);
                                        final SubLObject var11_61 = module0601.$g4654$.currentBinding(var2);
                                        try {
                                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                                            module0601.f36758((SubLObject)$ic23$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
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
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var2);
                                            module0601.f36746();
                                            module0601.f36760((SubLObject)$ic23$);
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
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var2);
                                    module0601.f36746();
                                    module0601.f36760((SubLObject)$ic33$);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var3_63, var2);
                                }
                            }
                            var13 = Numbers.add(var13, (SubLObject)ONE_INTEGER);
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
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var2);
                    module0601.f36746();
                    module0601.f36760((SubLObject)$ic14$);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var3_64, var2);
                }
            }
        }
        finally {
            module0587.$g4457$.rebind(var11, var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51094(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0587.$g4457$.currentBinding(var2);
        try {
            module0587.$g4457$.bind(module0015.$g131$.getDynamicValue(var2), var2);
            final SubLObject var4 = module0589.f35872(module0642.f39104((SubLObject)$ic14$, var1));
            final SubLObject var5 = module0656.f39945(var4);
            final SubLObject var6 = f51086(var1);
            final SubLObject var7 = module0747.f46317(var5, var6);
            final SubLObject var8 = f51083(var5);
            final SubLObject var9 = (SubLObject)ConsesLow.list((SubLObject)$ic22$, var8);
            try {
                final SubLObject var3_73 = module0601.$g4652$.currentBinding(var2);
                final SubLObject var10 = module0601.$g4654$.currentBinding(var2);
                try {
                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                    module0601.f36758((SubLObject)$ic14$, var9, (SubLObject)NIL, (SubLObject)NIL);
                    try {
                        final SubLObject var3_74 = module0601.$g4652$.currentBinding(var2);
                        final SubLObject var11_75 = module0601.$g4654$.currentBinding(var2);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                            module0601.f36758((SubLObject)$ic23$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                            module0797.f50965(var5);
                            SubLObject var11 = var7;
                            SubLObject var12 = (SubLObject)NIL;
                            var12 = var11.first();
                            while (NIL != var11) {
                                try {
                                    final SubLObject var3_75 = module0601.$g4652$.currentBinding(var2);
                                    final SubLObject var11_76 = module0601.$g4654$.currentBinding(var2);
                                    try {
                                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                                        module0601.f36758((SubLObject)$ic26$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                        PrintLow.format(module0587.$g4457$.getDynamicValue(var2), (SubLObject)$ic27$, module0747.f46318(var12, (SubLObject)NIL, (SubLObject)ZERO_INTEGER, (SubLObject)NIL, (SubLObject)NIL));
                                    }
                                    finally {
                                        module0601.$g4654$.rebind(var11_76, var2);
                                        module0601.$g4652$.rebind(var3_75, var2);
                                    }
                                }
                                finally {
                                    final SubLObject var3_76 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var2);
                                        module0601.f36746();
                                        module0601.f36760((SubLObject)$ic26$);
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
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var2);
                            module0601.f36746();
                            module0601.f36760((SubLObject)$ic23$);
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
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var2);
                    module0601.f36746();
                    module0601.f36760((SubLObject)$ic14$);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var3_78, var2);
                }
            }
        }
        finally {
            module0587.$g4457$.rebind(var3, var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51086(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5;
        for (var5 = module0066.f4838(module0067.f4891(module0582.f35694())); NIL == module0066.f4841(var5); var5 = module0066.f4840(var5)) {
            var2.resetMultipleValues();
            final SubLObject var6 = module0066.f4839(var5);
            final SubLObject var7 = var2.secondMultipleValue();
            var2.resetMultipleValues();
            final SubLObject var8 = module0642.f39104(module0038.f2638(var6), var1);
            if (NIL != var8) {
                final SubLObject var9 = module0589.f35872(var8);
                final SubLObject var10 = module0656.f39945(var9);
                final SubLObject var11 = (NIL != var10) ? var10 : reader.read_from_string_ignoring_errors(var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL != var11) {
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
        final SubLObject var22 = (NIL != module0173.f10955(var21)) ? module0205.f13144(var21) : var21;
        return module0038.f2698(module0038.f2626(module0205.f13144(var22)));
    }
    
    public static SubLObject f51095(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0642.f39104((SubLObject)$ic37$, var1);
        final SubLObject var4 = reader.read_from_string_ignoring_errors(var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0642.f39104((SubLObject)$ic38$, var1);
        final SubLObject var6 = reader.read_from_string_ignoring_errors(var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var7 = module0642.f39104((SubLObject)$ic39$, var1);
        SubLObject var8 = (SubLObject)(var7.isString() ? reader.read_from_string_ignoring_errors(var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : NIL);
        final SubLObject var9 = (SubLObject)((var4.isInteger() && var6.isInteger()) ? module0361.f24195(var4, var6) : NIL);
        final SubLObject var10 = module0587.$g4457$.currentBinding(var2);
        try {
            module0587.$g4457$.bind(module0015.$g131$.getDynamicValue(var2), var2);
            module0601.f36755((SubLObject)$ic6$);
            module0601.f36746();
            if (NIL == inference_datastructures_inference_oc.f25275(var9)) {
                PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)$ic40$, var3, var5);
            }
            if (!var8.isInteger()) {
                var8 = inference_datastructures_inference_oc.f25533(var9);
            }
            final SubLObject var11 = Hashtables.gethash(var8, module0413.f28826(var9), (SubLObject)UNPROVIDED);
            PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)$ic41$, ConsesLow.nth((SubLObject)SIX_INTEGER, var11));
            PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)$ic42$, ConsesLow.nth((SubLObject)ZERO_INTEGER, var11));
            PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)$ic43$, ConsesLow.nth((SubLObject)ONE_INTEGER, var11));
            PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)$ic44$, ConsesLow.nth((SubLObject)TWO_INTEGER, var11));
            PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)$ic45$, ConsesLow.nth((SubLObject)THREE_INTEGER, var11));
            PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)$ic46$, (SubLObject)((NIL != assertion_handles_oc.f11035(ConsesLow.nth((SubLObject)FOUR_INTEGER, var11))) ? module0289.f19402(ConsesLow.nth((SubLObject)FOUR_INTEGER, var11)) : $ic47$));
            PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)$ic48$, module0173.f10958(ConsesLow.nth((SubLObject)FIVE_INTEGER, var11)));
            module0601.f36746();
        }
        finally {
            module0587.$g4457$.rebind(var10, var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51096(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0642.f39104((SubLObject)$ic37$, var1);
        final SubLObject var4 = reader.read_from_string_ignoring_errors(var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0642.f39104((SubLObject)$ic38$, var1);
        final SubLObject var6 = reader.read_from_string_ignoring_errors(var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var7 = module0642.f39104((SubLObject)$ic39$, var1);
        SubLObject var8 = (SubLObject)(var7.isString() ? reader.read_from_string_ignoring_errors(var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : NIL);
        final SubLObject var9 = (SubLObject)((var4.isInteger() && var6.isInteger()) ? module0361.f24195(var4, var6) : NIL);
        module0642.f39020((SubLObject)$ic49$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39028((SubLObject)UNPROVIDED);
        if (NIL == inference_datastructures_inference_oc.f25275(var9)) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)$ic40$, var3, var5);
        }
        if (!var8.isInteger()) {
            var8 = inference_datastructures_inference_oc.f25532(var9);
        }
        final SubLObject var10 = Hashtables.gethash(var8, module0413.f28826(var9), (SubLObject)UNPROVIDED);
        PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)$ic41$, ConsesLow.nth((SubLObject)SIX_INTEGER, var10));
        PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)$ic42$, ConsesLow.nth((SubLObject)ZERO_INTEGER, var10));
        PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)$ic43$, ConsesLow.nth((SubLObject)ONE_INTEGER, var10));
        PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)$ic44$, ConsesLow.nth((SubLObject)TWO_INTEGER, var10));
        PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)$ic45$, ConsesLow.nth((SubLObject)THREE_INTEGER, var10));
        PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)$ic46$, (SubLObject)((NIL != assertion_handles_oc.f11035(ConsesLow.nth((SubLObject)FOUR_INTEGER, var10))) ? module0289.f19402(ConsesLow.nth((SubLObject)FOUR_INTEGER, var10)) : $ic47$));
        PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)$ic48$, (SubLObject)((NIL != module0173.f10955(ConsesLow.nth((SubLObject)FIVE_INTEGER, var10))) ? module0173.f10958(ConsesLow.nth((SubLObject)FIVE_INTEGER, var10)) : $ic47$));
        module0642.f39028((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39028((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51097(final SubLObject var98, final SubLObject var99) {
        SubLObject var101;
        final SubLObject var100 = var101 = var98.rest();
        SubLObject var102 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var101, var100, (SubLObject)$ic51$);
        var102 = var101.first();
        final SubLObject var103;
        var101 = (var103 = var101.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic52$, (SubLObject)ConsesLow.listS((SubLObject)$ic53$, (SubLObject)$ic54$, var102, ConsesLow.append(var103, (SubLObject)NIL)));
    }
    
    public static SubLObject f51098(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0642.f39104((SubLObject)$ic37$, var1);
        final SubLObject var4 = (SubLObject)(var3.isString() ? reader.read_from_string_ignoring_errors(var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : NIL);
        final SubLObject var5 = module0642.f39104((SubLObject)$ic38$, var1);
        final SubLObject var6 = (SubLObject)(var5.isString() ? reader.read_from_string_ignoring_errors(var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : NIL);
        final SubLObject var7 = module0642.f39104((SubLObject)$ic55$, var1);
        SubLObject var8 = (SubLObject)(var7.isString() ? reader.read_from_string_ignoring_errors(var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : NIL);
        final SubLObject var9 = module0642.f39104((SubLObject)$ic56$, var1);
        final SubLObject var10 = module0642.f39104((SubLObject)$ic57$, var1);
        final SubLObject var11 = (SubLObject)((var4.isInteger() && var6.isInteger()) ? module0361.f24195(var4, var6) : NIL);
        module0642.f39020((SubLObject)$ic49$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39028((SubLObject)UNPROVIDED);
        if (NIL == inference_datastructures_inference_oc.f25275(var11)) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)$ic40$, var3, var5);
        }
        final SubLObject var12 = module0413.f28831(var11);
        final SubLObject var13 = module0413.f28833(var11);
        if (!var8.isInteger()) {
            var8 = var13;
        }
        final SubLObject var14 = Hashtables.gethash(var8, var12, (SubLObject)UNPROVIDED);
        PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)$ic58$, conses_high.getf(var14, (SubLObject)$ic59$, (SubLObject)UNPROVIDED));
        PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)$ic60$, var13);
        PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)$ic61$, inference_datastructures_inference_oc.f25420(var11));
        PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)$ic41$, conses_high.getf(var14, (SubLObject)$ic62$, (SubLObject)UNPROVIDED));
        PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)$ic42$, conses_high.getf(var14, (SubLObject)$ic63$, (SubLObject)UNPROVIDED));
        PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)$ic43$, conses_high.getf(var14, (SubLObject)$ic64$, (SubLObject)UNPROVIDED));
        PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)$ic44$, conses_high.getf(var14, (SubLObject)$ic65$, (SubLObject)UNPROVIDED));
        if (var9.equalp((SubLObject)$ic66$)) {
            final SubLObject var15 = conses_high.getf(var14, (SubLObject)$ic67$, (SubLObject)UNPROVIDED);
            SubLObject var16 = (SubLObject)$ic47$;
            if (NIL != module0363.f24478(var15)) {
                for (var16 = module0363.f24552(var15); NIL != module0202.f12883(var16, (SubLObject)UNPROVIDED); var16 = module0205.f13204(var16, (SubLObject)UNPROVIDED)) {}
            }
            PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)$ic45$, var16);
        }
        else if (var9.equalp((SubLObject)$ic68$)) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)$ic46$, (SubLObject)((NIL != assertion_handles_oc.f11035(conses_high.getf(var14, (SubLObject)$ic69$, (SubLObject)UNPROVIDED))) ? module0289.f19396(conses_high.getf(var14, (SubLObject)$ic69$, (SubLObject)UNPROVIDED)) : $ic47$));
        }
        else if (var9.equalp((SubLObject)$ic14$)) {
            final SubLObject var17 = conses_high.getf(var14, (SubLObject)$ic70$, (SubLObject)UNPROVIDED);
            if (NIL != f51099(var17)) {
                PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)$ic48$, (SubLObject)((NIL != module0167.f10813(var17)) ? module0172.f10920(var17) : ((NIL != constant_handles_oc.f8449(var17)) ? var17 : $ic47$)));
            }
        }
        SubLObject var18 = f51100(var12, var8);
        SubLObject var19 = (SubLObject)NIL;
        SubLObject var20 = conses_high.set_difference(var18, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != var20) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)$ic71$, f51101(var20, var10));
        }
        var18 = f51102(var12, var8);
        var19 = (SubLObject)NIL;
        var20 = conses_high.set_difference(var18, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != var20) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)$ic72$, f51101(var20, var10));
        }
        module0642.f39028((SubLObject)UNPROVIDED);
        module0642.f39028((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51100(final SubLObject var107, final SubLObject var104) {
        SubLObject var108 = (SubLObject)NIL;
        final SubLObject var109 = Hashtables.gethash(var104, var107, (SubLObject)UNPROVIDED);
        final SubLObject var110 = conses_high.getf(var109, (SubLObject)$ic67$, (SubLObject)UNPROVIDED);
        if (NIL != var110) {
            var108 = f51103(var110);
        }
        return var108;
    }
    
    public static SubLObject f51103(final SubLObject var109) {
        SubLObject var110 = (SubLObject)NIL;
        if (NIL != var109) {
            SubLObject var111 = module0205.f13183(f51104(var109), (SubLObject)$ic74$, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var112 = (SubLObject)NIL;
            var112 = var111.first();
            while (NIL != var111) {
                if (NIL != f51099(var112)) {
                    final SubLObject var113 = var112;
                    if (NIL == conses_high.member(var113, var110, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
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
        return module0205.f13147(module0363.f24552(var109), (SubLObject)$ic75$, (SubLObject)$ic76$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f51102(final SubLObject var107, final SubLObject var104) {
        SubLObject var108 = (SubLObject)NIL;
        final SubLObject var109 = Hashtables.gethash(var104, var107, (SubLObject)UNPROVIDED);
        final SubLObject var110 = conses_high.getf(var109, (SubLObject)$ic69$, (SubLObject)UNPROVIDED);
        if (NIL != var110) {
            SubLObject var111 = module0205.f13183(var110, (SubLObject)$ic74$, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var112 = (SubLObject)NIL;
            var112 = var111.first();
            while (NIL != var111) {
                if (NIL != f51099(var112)) {
                    final SubLObject var113 = var112;
                    if (NIL == conses_high.member(var113, var108, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
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
        return (SubLObject)makeBoolean(var21.isNumber() || (NIL != constant_handles_oc.f8449(var21) && (NIL == $g6376$.getDynamicValue(var22) || NIL != module0794.f50804(var21, (SubLObject)UNPROVIDED))));
    }
    
    public static SubLObject f51101(final SubLObject var20, final SubLObject var106) {
        final SubLObject var107 = Numbers.log(module0549.f33906($ic77$), (SubLObject)UNPROVIDED);
        SubLObject var108 = (SubLObject)NIL;
        SubLObject var109 = var20;
        SubLObject var110 = (SubLObject)NIL;
        var110 = var109.first();
        while (NIL != var109) {
            SubLObject var111 = (SubLObject)((var106.equalp((SubLObject)$ic78$) && NIL != module0173.f10955(var110)) ? module0745.f46259(var110, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : NIL);
            if (NIL != var111) {
                var111 = module0589.f35898(var111, (SubLObject)UNPROVIDED);
            }
            var108 = (SubLObject)ConsesLow.cons((NIL != var111) ? var111 : var110, var108);
            var108 = (SubLObject)ConsesLow.cons(f51105(var110, var107), var108);
            var109 = var109.rest();
            var110 = var109.first();
        }
        return Sequences.nreverse(var108);
    }
    
    public static SubLObject f51106() {
        final SubLObject var119 = $g6377$.getGlobalValue();
        if (NIL != var119) {
            module0034.f1818(var119);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51107(final SubLObject var21, SubLObject var116) {
        if (var116 == UNPROVIDED) {
            var116 = module0549.f33906($ic77$);
        }
        return module0034.f1829($g6377$.getGlobalValue(), (SubLObject)ConsesLow.list(var21, var116), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f51108(final SubLObject var21, final SubLObject var116) {
        final SubLThread var117 = SubLProcess.currentSubLThread();
        SubLObject var119;
        final SubLObject var118 = var119 = Numbers.add(random.random((SubLObject)$ic80$), Numbers.floor(Numbers.divide(Numbers.multiply((SubLObject)$ic81$, Numbers.log(module0048.f_1X(module0549.f33906(var21)), (SubLObject)UNPROVIDED)), var116), (SubLObject)UNPROVIDED));
        if (NIL != module0269.f17737(var21)) {
            var119 = Numbers.add(var119, (SubLObject)$ic82$);
        }
        else if (NIL != module0269.f17726(var21)) {
            var119 = Numbers.add(var119, (SubLObject)$ic83$);
        }
        else if (NIL != module0269.f17716(var21)) {
            var119 = Numbers.add(var119, (SubLObject)$ic84$);
        }
        else if (NIL == $g6376$.getDynamicValue(var117)) {
            final SubLObject var120 = $g6376$.currentBinding(var117);
            try {
                $g6376$.bind((SubLObject)T, var117);
                if (NIL == f51099(var21)) {
                    var119 = Numbers.add(var119, (SubLObject)$ic85$);
                }
            }
            finally {
                $g6376$.rebind(var120, var117);
            }
        }
        return Numbers.min((SubLObject)$ic86$, var119);
    }
    
    public static SubLObject f51105(final SubLObject var21, SubLObject var116) {
        if (var116 == UNPROVIDED) {
            var116 = module0549.f33906($ic77$);
        }
        SubLObject var117 = $g6377$.getGlobalValue();
        if (NIL == var117) {
            var117 = module0034.f1934((SubLObject)$ic79$, (SubLObject)$ic87$, (SubLObject)$ic88$, (SubLObject)EQUAL, (SubLObject)TWO_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        final SubLObject var118 = module0034.f1782(var21, var116);
        final SubLObject var119 = module0034.f1814(var117, var118, (SubLObject)UNPROVIDED);
        if (var119 != $ic89$) {
            SubLObject var120 = var119;
            SubLObject var121 = (SubLObject)NIL;
            var121 = var120.first();
            while (NIL != var120) {
                SubLObject var122 = var121.first();
                final SubLObject var123 = conses_high.second(var121);
                if (var21.equal(var122.first())) {
                    var122 = var122.rest();
                    if (NIL != var122 && NIL == var122.rest() && var116.equal(var122.first())) {
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
        final SubLObject var3 = module0642.f39104((SubLObject)$ic37$, var1);
        final SubLObject var4 = (SubLObject)(var3.isString() ? reader.read_from_string_ignoring_errors(var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : NIL);
        final SubLObject var5 = module0642.f39104((SubLObject)$ic38$, var1);
        final SubLObject var6 = (SubLObject)(var5.isString() ? reader.read_from_string_ignoring_errors(var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : NIL);
        final SubLObject var7 = (SubLObject)((var4.isInteger() && var6.isInteger()) ? module0361.f24195(var4, var6) : NIL);
        final SubLObject var8 = module0587.$g4457$.currentBinding(var2);
        try {
            module0587.$g4457$.bind(module0015.$g131$.getDynamicValue(var2), var2);
            module0601.f36755((SubLObject)$ic6$);
            module0601.f36746();
            if (NIL == inference_datastructures_inference_oc.f25275(var7)) {
                try {
                    final SubLObject var3_129 = module0601.$g4652$.currentBinding(var2);
                    final SubLObject var9 = module0601.$g4654$.currentBinding(var2);
                    try {
                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                        module0601.f36758((SubLObject)$ic91$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                        PrintLow.format(module0587.$g4457$.getDynamicValue(var2), (SubLObject)$ic40$, var3, var5);
                    }
                    finally {
                        module0601.$g4654$.rebind(var9, var2);
                        module0601.$g4652$.rebind(var3_129, var2);
                    }
                }
                finally {
                    final SubLObject var3_130 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var2);
                        module0601.f36746();
                        module0601.f36760((SubLObject)$ic91$);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var3_130, var2);
                    }
                }
                return (SubLObject)NIL;
            }
            final SubLObject var10 = module0030.f1611(module0413.f28834(var7), (SubLObject)UNPROVIDED);
            if (!var10.isHashtable()) {
                try {
                    final SubLObject var3_131 = module0601.$g4652$.currentBinding(var2);
                    final SubLObject var11 = module0601.$g4654$.currentBinding(var2);
                    try {
                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                        module0601.f36758((SubLObject)$ic91$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                        PrintLow.format(module0587.$g4457$.getDynamicValue(var2), (SubLObject)$ic92$, var3, var5);
                    }
                    finally {
                        module0601.$g4654$.rebind(var11, var2);
                        module0601.$g4652$.rebind(var3_131, var2);
                    }
                }
                finally {
                    final SubLObject var3_132 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var2);
                        module0601.f36746();
                        module0601.f36760((SubLObject)$ic91$);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var3_132, var2);
                    }
                }
                return (SubLObject)NIL;
            }
            SubLObject var12 = inference_datastructures_inference_oc.f25706(var7, (SubLObject)NIL);
            SubLObject var13 = (SubLObject)NIL;
            SubLObject var14 = (SubLObject)NIL;
            SubLObject var15 = (SubLObject)NIL;
            final Iterator var16 = Hashtables.getEntrySetIterator(var10);
            try {
                while (Hashtables.iteratorHasNext(var16)) {
                    final Map.Entry var17 = Hashtables.iteratorNextEntry(var16);
                    var14 = Hashtables.getEntryKey(var17);
                    var15 = Hashtables.getEntryValue(var17);
                    var13 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var14, Functions.apply((SubLObject)$ic93$, var15)), var13);
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(var16);
            }
            SubLObject var18 = (SubLObject)ZERO_INTEGER;
            SubLObject var19 = var13;
            SubLObject var20 = (SubLObject)NIL;
            var20 = var19.first();
            while (NIL != var19) {
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
                    module0601.f36758((SubLObject)$ic94$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                    try {
                        final SubLObject var3_134 = module0601.$g4652$.currentBinding(var2);
                        final SubLObject var11_144 = module0601.$g4654$.currentBinding(var2);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                            module0601.f36758((SubLObject)$ic95$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                            PrintLow.format(module0587.$g4457$.getDynamicValue(var2), (SubLObject)$ic96$, Numbers.truncate(Numbers.multiply((SubLObject)$ic86$, var12), (SubLObject)UNPROVIDED));
                        }
                        finally {
                            module0601.$g4654$.rebind(var11_144, var2);
                            module0601.$g4652$.rebind(var3_134, var2);
                        }
                    }
                    finally {
                        final SubLObject var3_135 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var2);
                            module0601.f36746();
                            module0601.f36760((SubLObject)$ic95$);
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
                            module0601.f36758((SubLObject)$ic97$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                            PrintLow.format(module0587.$g4457$.getDynamicValue(var2), (SubLObject)$ic96$, Numbers.truncate(Numbers.multiply((SubLObject)$ic86$, var18), (SubLObject)UNPROVIDED));
                        }
                        finally {
                            module0601.$g4654$.rebind(var11_145, var2);
                            module0601.$g4652$.rebind(var3_136, var2);
                        }
                    }
                    finally {
                        final SubLObject var3_137 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var2);
                            module0601.f36746();
                            module0601.f36760((SubLObject)$ic97$);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var3_137, var2);
                        }
                    }
                    final SubLObject var22 = Numbers.subtract(var12, var18);
                    if (var22.numG((SubLObject)ZERO_INTEGER)) {
                        var13 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic98$, Numbers.subtract(var12, var18)), var13);
                        Hashtables.sethash((SubLObject)$ic98$, var10, (SubLObject)ConsesLow.list(Numbers.subtract(var12, var18)));
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
                            module0601.f36758((SubLObject)$ic99$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                            SubLObject var23 = Sort.sort(conses_high.copy_list(var13), (SubLObject)$ic112$, (SubLObject)$ic113$);
                            SubLObject var24 = (SubLObject)NIL;
                            var24 = var23.first();
                            while (NIL != var23) {
                                final SubLObject var25 = var24.first();
                                final SubLObject var26 = conses_high.second(var24);
                                final SubLObject var27 = Sequences.nreverse(conses_high.copy_list(Hashtables.gethash(var25, var10, (SubLObject)UNPROVIDED)));
                                SubLObject var28 = module0035.f2110((SubLObject)$ic100$, var27, (SubLObject)UNPROVIDED);
                                if (NIL == var28) {
                                    var28 = (SubLObject)ConsesLow.list((SubLObject)ZERO_INTEGER);
                                }
                                try {
                                    final SubLObject var3_139 = module0601.$g4652$.currentBinding(var2);
                                    final SubLObject var11_147 = module0601.$g4654$.currentBinding(var2);
                                    try {
                                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                                        module0601.f36758((SubLObject)$ic101$, (SubLObject)ConsesLow.list((SubLObject)$ic22$, (NIL != module0340.f22789(var25)) ? module0340.f22825(var25) : var25), (SubLObject)NIL, (SubLObject)NIL);
                                        try {
                                            final SubLObject var3_140 = module0601.$g4652$.currentBinding(var2);
                                            final SubLObject var11_148 = module0601.$g4654$.currentBinding(var2);
                                            try {
                                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                                                module0601.f36758((SubLObject)$ic95$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                                PrintLow.format(module0587.$g4457$.getDynamicValue(var2), (SubLObject)$ic96$, Numbers.truncate(Numbers.multiply((SubLObject)$ic86$, var26), (SubLObject)UNPROVIDED));
                                            }
                                            finally {
                                                module0601.$g4654$.rebind(var11_148, var2);
                                                module0601.$g4652$.rebind(var3_140, var2);
                                            }
                                        }
                                        finally {
                                            final SubLObject var3_141 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var2);
                                                module0601.f36746();
                                                module0601.f36760((SubLObject)$ic95$);
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
                                                module0601.f36758((SubLObject)$ic102$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                                PrintLow.format(module0587.$g4457$.getDynamicValue(var2), (SubLObject)$ic103$, Numbers.multiply((SubLObject)$ic104$, Numbers.divide(var26, var12)));
                                            }
                                            finally {
                                                module0601.$g4654$.rebind(var11_149, var2);
                                                module0601.$g4652$.rebind(var3_142, var2);
                                            }
                                        }
                                        finally {
                                            final SubLObject var3_143 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var2);
                                                module0601.f36746();
                                                module0601.f36760((SubLObject)$ic102$);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var3_143, var2);
                                            }
                                        }
                                        final SubLObject var29 = Numbers.subtract((SubLObject)ZERO_INTEGER, Functions.apply((SubLObject)$ic93$, module0035.f2110((SubLObject)$ic105$, var27, (SubLObject)UNPROVIDED)));
                                        if (NIL != module0048.f3293(var29)) {
                                            try {
                                                final SubLObject var3_144 = module0601.$g4652$.currentBinding(var2);
                                                final SubLObject var11_150 = module0601.$g4654$.currentBinding(var2);
                                                try {
                                                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var2), module0601.$g4652$.getDynamicValue(var2)), var2);
                                                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var2), var2);
                                                    module0601.f36758((SubLObject)$ic106$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                                    PrintLow.format(module0587.$g4457$.getDynamicValue(var2), (SubLObject)$ic96$, Numbers.truncate(Numbers.multiply((SubLObject)$ic86$, Numbers.subtract((SubLObject)ZERO_INTEGER, Functions.apply((SubLObject)$ic93$, module0035.f2110((SubLObject)$ic105$, var27, (SubLObject)UNPROVIDED)))), (SubLObject)UNPROVIDED));
                                                }
                                                finally {
                                                    module0601.$g4654$.rebind(var11_150, var2);
                                                    module0601.$g4652$.rebind(var3_144, var2);
                                                }
                                            }
                                            finally {
                                                final SubLObject var3_145 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var2);
                                                    module0601.f36746();
                                                    module0601.f36760((SubLObject)$ic106$);
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
                                                module0601.f36758((SubLObject)$ic107$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                                PrintLow.format(module0587.$g4457$.getDynamicValue(var2), (SubLObject)$ic96$, Sequences.length(var28));
                                            }
                                            finally {
                                                module0601.$g4654$.rebind(var11_151, var2);
                                                module0601.$g4652$.rebind(var3_146, var2);
                                            }
                                        }
                                        finally {
                                            final SubLObject var3_147 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var2);
                                                module0601.f36746();
                                                module0601.f36760((SubLObject)$ic107$);
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
                                                module0601.f36758((SubLObject)$ic108$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                                PrintLow.format(module0587.$g4457$.getDynamicValue(var2), (SubLObject)$ic96$, Numbers.truncate(Numbers.multiply((SubLObject)$ic86$, Functions.apply((SubLObject)$ic109$, var27)), (SubLObject)UNPROVIDED));
                                            }
                                            finally {
                                                module0601.$g4654$.rebind(var11_152, var2);
                                                module0601.$g4652$.rebind(var3_148, var2);
                                            }
                                        }
                                        finally {
                                            final SubLObject var3_149 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var2);
                                                module0601.f36746();
                                                module0601.f36760((SubLObject)$ic108$);
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
                                                module0601.f36758((SubLObject)$ic110$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                                PrintLow.format(module0587.$g4457$.getDynamicValue(var2), (SubLObject)$ic96$, Numbers.truncate(Numbers.multiply((SubLObject)$ic86$, module0048.f3387(var28, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED));
                                            }
                                            finally {
                                                module0601.$g4654$.rebind(var11_153, var2);
                                                module0601.$g4652$.rebind(var3_150, var2);
                                            }
                                        }
                                        finally {
                                            final SubLObject var3_151 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var2);
                                                module0601.f36746();
                                                module0601.f36760((SubLObject)$ic110$);
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
                                                module0601.f36758((SubLObject)$ic111$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                                PrintLow.format(module0587.$g4457$.getDynamicValue(var2), (SubLObject)$ic96$, Numbers.truncate(Numbers.multiply((SubLObject)$ic86$, module0048.f3384(var28)), (SubLObject)UNPROVIDED));
                                            }
                                            finally {
                                                module0601.$g4654$.rebind(var11_154, var2);
                                                module0601.$g4652$.rebind(var3_152, var2);
                                            }
                                        }
                                        finally {
                                            final SubLObject var3_153 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var2);
                                                module0601.f36746();
                                                module0601.f36760((SubLObject)$ic111$);
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
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var2);
                                        module0601.f36746();
                                        module0601.f36760((SubLObject)$ic101$);
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
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var2);
                            module0601.f36746();
                            module0601.f36760((SubLObject)$ic99$);
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
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var2);
                    module0601.f36746();
                    module0601.f36760((SubLObject)$ic94$);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var3_156, var2);
                }
            }
        }
        finally {
            module0587.$g4457$.rebind(var8, var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51110(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0642.f39104((SubLObject)$ic37$, var1);
        final SubLObject var4 = reader.read_from_string_ignoring_errors(var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0361.f23997(var4);
        final SubLObject var6 = module0642.f39104((SubLObject)$ic38$, var1);
        final SubLObject var7 = reader.read_from_string_ignoring_errors(var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var8 = (SubLObject)((var4.isInteger() && var7.isInteger()) ? module0361.f24195(var4, var7) : NIL);
        final SubLObject var9 = module0642.f39104((SubLObject)$ic114$, var1);
        final SubLObject var10 = (SubLObject)(var9.isString() ? reader.read_from_string_ignoring_errors(var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : NIL);
        final SubLObject var11 = module0642.f39104((SubLObject)$ic115$, var1);
        final SubLObject var12 = (SubLObject)(var11.isString() ? reader.read_from_string_ignoring_errors(var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : NIL);
        module0642.f39020((SubLObject)$ic49$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39028((SubLObject)UNPROVIDED);
        if (NIL != inference_datastructures_inference_oc.f25275(var8)) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)$ic116$, f51111(var5, var8, var10, var12));
        }
        else {
            PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)$ic40$, var3, var6);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51112() {
        final SubLObject var119 = $g6378$.getGlobalValue();
        if (NIL != var119) {
            module0034.f1818(var119);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51113(final SubLObject var182, SubLObject var96, SubLObject var187, SubLObject var188) {
        if (var96 == UNPROVIDED) {
            var96 = module0361.f24194(var182, (SubLObject)ZERO_INTEGER);
        }
        if (var187 == UNPROVIDED) {
            var187 = (SubLObject)ZERO_INTEGER;
        }
        if (var188 == UNPROVIDED) {
            var188 = module0413.f28833(var96);
        }
        return module0034.f1829($g6378$.getGlobalValue(), (SubLObject)ConsesLow.list(var182, var96, var187, var188), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f51114(final SubLObject var182, final SubLObject var96, final SubLObject var187, final SubLObject var188) {
        final SubLThread var189 = SubLProcess.currentSubLThread();
        SubLObject var190 = (SubLObject)NIL;
        final SubLObject var191 = module0643.$g4986$.currentBinding(var189);
        try {
            module0643.$g4986$.bind((SubLObject)NIL, var189);
            try {
                module0643.$g4986$.setDynamicValue(streams_high.make_private_string_output_stream(), var189);
                f51115(var182, var96, var187, var188);
                var190 = streams_high.get_output_stream_string(module0643.$g4986$.getDynamicValue(var189));
            }
            finally {
                final SubLObject var3_190 = Threads.$is_thread_performing_cleanupP$.currentBinding(var189);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var189);
                    streams_high.close(module0643.$g4986$.getDynamicValue(var189), (SubLObject)UNPROVIDED);
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
        if (var96 == UNPROVIDED) {
            var96 = module0361.f24194(var182, (SubLObject)ZERO_INTEGER);
        }
        if (var187 == UNPROVIDED) {
            var187 = (SubLObject)ZERO_INTEGER;
        }
        if (var188 == UNPROVIDED) {
            var188 = module0413.f28833(var96);
        }
        SubLObject var189 = $g6378$.getGlobalValue();
        if (NIL == var189) {
            var189 = module0034.f1934((SubLObject)$ic118$, (SubLObject)$ic119$, (SubLObject)$ic120$, (SubLObject)EQUAL, (SubLObject)FOUR_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        final SubLObject var190 = module0034.f1780(var182, var96, var187, var188);
        final SubLObject var191 = module0034.f1814(var189, var190, (SubLObject)UNPROVIDED);
        if (var191 != $ic89$) {
            SubLObject var192 = var191;
            SubLObject var193 = (SubLObject)NIL;
            var193 = var192.first();
            while (NIL != var192) {
                SubLObject var194 = var193.first();
                final SubLObject var195 = conses_high.second(var193);
                if (var182.equal(var194.first())) {
                    var194 = var194.rest();
                    if (var96.equal(var194.first())) {
                        var194 = var194.rest();
                        if (var187.equal(var194.first())) {
                            var194 = var194.rest();
                            if (NIL != var194 && NIL == var194.rest() && var188.equal(var194.first())) {
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
        if (var96 == UNPROVIDED) {
            var96 = module0361.f24194(var182, (SubLObject)ZERO_INTEGER);
        }
        if (var187 == UNPROVIDED) {
            var187 = (SubLObject)ZERO_INTEGER;
        }
        if (var188 == UNPROVIDED) {
            var188 = module0413.f28833(var96);
        }
        final SubLThread var189 = SubLProcess.currentSubLThread();
        final SubLObject var190 = f51116(var182, var96, var187, var188);
        final SubLObject var191 = module0077.f5313(Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
        final SubLObject var192 = module0643.$g4989$.currentBinding(var189);
        try {
            module0643.$g4989$.bind((SubLObject)NIL, var189);
            module0643.f39161((SubLObject)$ic121$);
            final SubLObject var3_192 = module0643.$g4988$.currentBinding(var189);
            try {
                module0643.$g4988$.bind(module0048.f_1X(module0643.$g4988$.getDynamicValue(var189)), var189);
                assert NIL != Types.stringp((SubLObject)$ic122$) : $ic122$;
                if (NIL != module0643.$g4989$.getDynamicValue(var189)) {
                    module0643.f39161((SubLObject)$ic124$);
                }
                module0643.f39169();
                module0643.f39162((SubLObject)$ic122$);
                module0643.f39161((SubLObject)$ic125$);
                final SubLObject var3_193 = module0643.$g4987$.currentBinding(var189);
                try {
                    module0643.$g4987$.bind((SubLObject)NIL, var189);
                    module0643.f39161((SubLObject)$ic126$);
                    final SubLObject var3_194 = module0643.$g4988$.currentBinding(var189);
                    try {
                        module0643.$g4988$.bind(module0048.f_1X(module0643.$g4988$.getDynamicValue(var189)), var189);
                        SubLObject var193 = var190;
                        SubLObject var194 = (SubLObject)NIL;
                        var194 = var193.first();
                        while (NIL != var193) {
                            SubLObject var196;
                            final SubLObject var195 = var196 = var194;
                            SubLObject var197 = (SubLObject)NIL;
                            SubLObject var198 = (SubLObject)NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var196, var195, (SubLObject)$ic127$);
                            var197 = var196.first();
                            var196 = (var198 = var196.rest());
                            SubLObject var201_202;
                            final SubLObject var199_200 = var201_202 = var198;
                            SubLObject var199 = (SubLObject)NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var201_202, var199_200, (SubLObject)$ic128$);
                            var199 = var201_202.first();
                            final SubLObject var200;
                            var201_202 = (var200 = var201_202.rest());
                            f51117(var182, var199, var200, var191);
                            var193 = var193.rest();
                            var194 = var193.first();
                        }
                        module0643.f39161((SubLObject)$ic129$);
                    }
                    finally {
                        module0643.$g4988$.rebind(var3_194, var189);
                    }
                }
                finally {
                    module0643.$g4987$.rebind(var3_193, var189);
                }
                module0643.$g4989$.setDynamicValue((SubLObject)T, var189);
                assert NIL != Types.stringp((SubLObject)$ic130$) : $ic130$;
                if (NIL != module0643.$g4989$.getDynamicValue(var189)) {
                    module0643.f39161((SubLObject)$ic124$);
                }
                module0643.f39169();
                module0643.f39162((SubLObject)$ic130$);
                module0643.f39161((SubLObject)$ic125$);
                final SubLObject var3_195 = module0643.$g4987$.currentBinding(var189);
                try {
                    module0643.$g4987$.bind((SubLObject)NIL, var189);
                    module0643.f39161((SubLObject)$ic126$);
                    final SubLObject var3_196 = module0643.$g4988$.currentBinding(var189);
                    try {
                        module0643.$g4988$.bind(module0048.f_1X(module0643.$g4988$.getDynamicValue(var189)), var189);
                        final SubLObject var201 = module0077.f5333(var191);
                        SubLObject var202;
                        SubLObject var203;
                        SubLObject var204;
                        for (var202 = module0032.f1741(var201), var203 = (SubLObject)NIL, var203 = module0032.f1742(var202, var201); NIL == module0032.f1744(var202, var203); var203 = module0032.f1743(var203)) {
                            var204 = module0032.f1745(var202, var203);
                            if (NIL != module0032.f1746(var203, var204)) {
                                f51118(var204);
                            }
                        }
                        module0643.f39161((SubLObject)$ic129$);
                    }
                    finally {
                        module0643.$g4988$.rebind(var3_196, var189);
                    }
                }
                finally {
                    module0643.$g4987$.rebind(var3_195, var189);
                }
                module0643.$g4989$.setDynamicValue((SubLObject)T, var189);
                module0643.f39161((SubLObject)$ic131$);
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
        final SubLObject var47 = Sequences.find((SubLObject)$ic132$, var46, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic113$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var48 = Sort.sort(conses_high.copy_list(Sequences.remove(var47, var46, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)), Symbols.symbol_function((SubLObject)$ic133$), Symbols.symbol_function((SubLObject)$ic113$));
        return (SubLObject)((NIL != var47) ? ConsesLow.cons(var47, var48) : var48);
    }
    
    public static SubLObject f51120(final SubLObject var182, SubLObject var96, SubLObject var187, SubLObject var188) {
        if (var96 == UNPROVIDED) {
            var96 = module0361.f24194(var182, (SubLObject)ZERO_INTEGER);
        }
        if (var187 == UNPROVIDED) {
            var187 = (SubLObject)ZERO_INTEGER;
        }
        if (var188 == UNPROVIDED) {
            var188 = module0413.f28833(var96);
        }
        final SubLObject var189 = conses_high.set_difference(f51121(var182, var188, var96), f51121(var182, var187, var96), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        return f51119(var189);
    }
    
    public static SubLObject f51116(final SubLObject var182, SubLObject var96, SubLObject var187, SubLObject var188) {
        if (var96 == UNPROVIDED) {
            var96 = module0361.f24194(var182, (SubLObject)ZERO_INTEGER);
        }
        if (var187 == UNPROVIDED) {
            var187 = (SubLObject)ZERO_INTEGER;
        }
        if (var188 == UNPROVIDED) {
            var188 = module0413.f28833(var96);
        }
        final SubLObject var189 = f51122(var182, var188, var96);
        final SubLObject var190 = f51122(var182, var187, var96);
        final SubLObject var191 = conses_high.set_difference(var189, var190, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        return f51119(var191);
    }
    
    public static SubLObject f51123(final SubLObject var182, SubLObject var96) {
        if (var96 == UNPROVIDED) {
            var96 = module0361.f24194(var182, (SubLObject)ZERO_INTEGER);
        }
        final SubLObject var183 = module0078.f5369((SubLObject)ZERO_INTEGER, (SubLObject)UNPROVIDED);
        SubLObject var184 = (SubLObject)T;
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
        for (var185 = Numbers.subtract(module0413.f28833(var96), (SubLObject)TEN_INTEGER), var186 = (SubLObject)NIL, var186 = (SubLObject)ZERO_INTEGER; !var186.numGE(var185); var186 = Numbers.add(var186, (SubLObject)TEN_INTEGER)) {
            var187 = Numbers.add(var186, (SubLObject)TEN_INTEGER);
            var188 = f51116(var182, var96, var186, var187);
            var189 = (SubLObject)NIL;
            var189 = var188.first();
            while (NIL != var188) {
                var190 = (var191 = var189);
                var192 = (SubLObject)NIL;
                var193 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var191, var190, (SubLObject)$ic134$);
                var192 = var191.first();
                var191 = (var193 = var191.rest());
                var221_222 = (var223_224 = var193);
                var194 = (SubLObject)NIL;
                var195 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var223_224, var221_222, (SubLObject)$ic135$);
                var194 = var223_224.first();
                var223_224 = (var195 = var223_224.rest());
                if (NIL == module0077.f5320(var194, var183)) {
                    Errors.sublisp_break((SubLObject)$ic136$, new SubLObject[] { var194, var193, var186, var187 });
                    var184 = (SubLObject)NIL;
                }
                module0078.f5374(var195, var183);
                var188 = var188.rest();
                var189 = var188.first();
            }
        }
        return var184;
    }
    
    public static SubLObject f51121(final SubLObject var182, SubLObject var188, SubLObject var96) {
        if (var96 == UNPROVIDED) {
            var96 = module0361.f24194(var182, (SubLObject)ZERO_INTEGER);
        }
        if (var188.numG(module0413.f28833(var96))) {
            var188 = module0413.f28833(var96);
        }
        final SubLObject var189 = module0413.f28831(var96);
        SubLObject var190 = f51124(var189, var188);
        final SubLObject var191 = module0411.f28664(var182, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var192 = (SubLObject)NIL;
        SubLObject var193 = (SubLObject)NIL;
        while (!var190.isInteger() && NIL == var193) {
            if (!var190.isInteger()) {
                var188 = Numbers.add(var188, (SubLObject)ONE_INTEGER);
                if (var188.numG(module0413.f28833(var96))) {
                    var193 = (SubLObject)T;
                }
                else {
                    var190 = f51124(var189, var188);
                }
            }
        }
        if (NIL == var193) {
            SubLObject var194 = var191;
            SubLObject var195 = (SubLObject)NIL;
            var195 = var194.first();
            while (NIL != var194) {
                SubLObject var197;
                final SubLObject var196 = var197 = var195;
                SubLObject var198 = (SubLObject)NIL;
                SubLObject var199 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var197, var196, (SubLObject)$ic137$);
                var198 = var197.first();
                var197 = (var199 = var197.rest());
                if ($ic132$ == var199.first()) {
                    var192 = module0035.f2063(var192, var198, var199, (SubLObject)UNPROVIDED);
                }
                else if (NIL == Sequences.find(var190, var199, Symbols.symbol_function((SubLObject)$ic133$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var192 = module0035.f2063(var192, var198, var199, (SubLObject)UNPROVIDED);
                }
                var194 = var194.rest();
                var195 = var194.first();
            }
        }
        return module0035.f2325(var192, Symbols.symbol_function((SubLObject)$ic133$));
    }
    
    public static SubLObject f51122(final SubLObject var182, SubLObject var188, SubLObject var96) {
        if (var96 == UNPROVIDED) {
            var96 = module0361.f24194(var182, (SubLObject)ZERO_INTEGER);
        }
        if (var188.numG(module0413.f28833(var96))) {
            var188 = module0413.f28833(var96);
        }
        final SubLObject var189 = module0413.f28831(var96);
        SubLObject var190 = f51124(var189, var188);
        final SubLObject var191 = module0411.f28664(var182, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var192 = (SubLObject)NIL;
        SubLObject var193 = (SubLObject)NIL;
        while (!var190.isInteger() && NIL == var193) {
            if (!var190.isInteger()) {
                var188 = Numbers.add(var188, (SubLObject)ONE_INTEGER);
                if (var188.numG(module0413.f28833(var96))) {
                    var193 = (SubLObject)T;
                }
                else {
                    var190 = f51124(var189, var188);
                }
            }
        }
        if (NIL == var193) {
            SubLObject var194 = var191;
            SubLObject var195 = (SubLObject)NIL;
            var195 = var194.first();
            while (NIL != var194) {
                SubLObject var197;
                final SubLObject var196 = var197 = var195;
                SubLObject var198 = (SubLObject)NIL;
                SubLObject var199 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var197, var196, (SubLObject)$ic137$);
                var198 = var197.first();
                var197 = (var199 = var197.rest());
                if ($ic132$ != var199.first()) {
                    if (NIL != Sequences.find(var190, var199, Symbols.symbol_function((SubLObject)$ic138$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        var199 = Sequences.delete(var190, var199, Symbols.symbol_function((SubLObject)$ic133$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    else {
                        var199 = (SubLObject)NIL;
                    }
                }
                if (NIL != var199) {
                    var192 = module0035.f2063(var192, var198, var199, (SubLObject)UNPROVIDED);
                }
                var194 = var194.rest();
                var195 = var194.first();
            }
        }
        return f51119(var192);
    }
    
    public static SubLObject f51124(final SubLObject var226, final SubLObject var236) {
        final SubLObject var237 = Hashtables.gethash(var236, var226, (SubLObject)UNPROVIDED);
        final SubLObject var238 = module0035.f2335(var237, (SubLObject)$ic67$, (SubLObject)UNPROVIDED);
        return (SubLObject)((NIL != module0363.f24478(var238)) ? module0363.f24508(var238) : NIL);
    }
    
    public static SubLObject f51117(final SubLObject var182, final SubLObject var203, final SubLObject var204, final SubLObject var191) {
        final SubLThread var205 = SubLProcess.currentSubLThread();
        if (NIL != module0643.$g4987$.getDynamicValue(var205)) {
            module0643.f39161((SubLObject)$ic124$);
        }
        module0643.f39169();
        final SubLObject var206 = module0643.$g4989$.currentBinding(var205);
        try {
            module0643.$g4989$.bind((SubLObject)NIL, var205);
            module0643.f39161((SubLObject)$ic121$);
            final SubLObject var3_237 = module0643.$g4988$.currentBinding(var205);
            try {
                module0643.$g4988$.bind(module0048.f_1X(module0643.$g4988$.getDynamicValue(var205)), var205);
                assert NIL != Types.stringp((SubLObject)$ic139$) : $ic139$;
                if (NIL != module0643.$g4989$.getDynamicValue(var205)) {
                    module0643.f39161((SubLObject)$ic124$);
                }
                module0643.f39169();
                module0643.f39162((SubLObject)$ic139$);
                module0643.f39161((SubLObject)$ic125$);
                module0643.f39160(var203, (SubLObject)UNPROVIDED);
                module0643.$g4989$.setDynamicValue((SubLObject)T, var205);
                assert NIL != Types.stringp((SubLObject)$ic140$) : $ic140$;
                if (NIL != module0643.$g4989$.getDynamicValue(var205)) {
                    module0643.f39161((SubLObject)$ic124$);
                }
                module0643.f39169();
                module0643.f39162((SubLObject)$ic140$);
                module0643.f39161((SubLObject)$ic125$);
                module0643.f39168(var204, (SubLObject)UNPROVIDED);
                module0643.$g4989$.setDynamicValue((SubLObject)T, var205);
                module0643.f39161((SubLObject)$ic131$);
            }
            finally {
                module0643.$g4988$.rebind(var3_237, var205);
            }
        }
        finally {
            module0643.$g4989$.rebind(var206, var205);
        }
        module0643.$g4987$.setDynamicValue((SubLObject)T, var205);
        SubLObject var207 = (SubLObject)ConsesLow.cons(var203, var204);
        SubLObject var208 = (SubLObject)NIL;
        var208 = var207.first();
        while (NIL != var207) {
            module0077.f5326(module0361.f24237(var182, var208), var191);
            var207 = var207.rest();
            var208 = var207.first();
        }
        return var191;
    }
    
    public static SubLObject f51118(final SubLObject var109) {
        final SubLThread var110 = SubLProcess.currentSubLThread();
        if (NIL != module0643.$g4987$.getDynamicValue(var110)) {
            module0643.f39161((SubLObject)$ic124$);
        }
        module0643.f39169();
        final SubLObject var111 = module0643.$g4989$.currentBinding(var110);
        try {
            module0643.$g4989$.bind((SubLObject)NIL, var110);
            module0643.f39161((SubLObject)$ic121$);
            final SubLObject var3_239 = module0643.$g4988$.currentBinding(var110);
            try {
                module0643.$g4988$.bind(module0048.f_1X(module0643.$g4988$.getDynamicValue(var110)), var110);
                assert NIL != Types.stringp((SubLObject)$ic141$) : $ic141$;
                if (NIL != module0643.$g4989$.getDynamicValue(var110)) {
                    module0643.f39161((SubLObject)$ic124$);
                }
                module0643.f39169();
                module0643.f39162((SubLObject)$ic141$);
                module0643.f39161((SubLObject)$ic125$);
                module0643.f39160(module0363.f24508(var109), (SubLObject)UNPROVIDED);
                module0643.$g4989$.setDynamicValue((SubLObject)T, var110);
                assert NIL != Types.stringp((SubLObject)$ic142$) : $ic142$;
                if (NIL != module0643.$g4989$.getDynamicValue(var110)) {
                    module0643.f39161((SubLObject)$ic124$);
                }
                module0643.f39169();
                module0643.f39162((SubLObject)$ic142$);
                module0643.f39161((SubLObject)$ic125$);
                module0643.f39160(print_high.princ_to_string(module0363.f24506(var109)), (SubLObject)UNPROVIDED);
                module0643.$g4989$.setDynamicValue((SubLObject)T, var110);
                assert NIL != Types.stringp((SubLObject)$ic143$) : $ic143$;
                if (NIL != module0643.$g4989$.getDynamicValue(var110)) {
                    module0643.f39161((SubLObject)$ic124$);
                }
                module0643.f39169();
                module0643.f39162((SubLObject)$ic143$);
                module0643.f39161((SubLObject)$ic125$);
                module0643.f39160(f51125(var109, (SubLObject)$ic78$), (SubLObject)UNPROVIDED);
                module0643.$g4989$.setDynamicValue((SubLObject)T, var110);
                assert NIL != Types.stringp((SubLObject)$ic10$) : $ic10$;
                if (NIL != module0643.$g4989$.getDynamicValue(var110)) {
                    module0643.f39161((SubLObject)$ic124$);
                }
                module0643.f39169();
                module0643.f39162((SubLObject)$ic10$);
                module0643.f39161((SubLObject)$ic125$);
                module0643.f39160(f51125(var109, (SubLObject)$ic10$), (SubLObject)UNPROVIDED);
                module0643.$g4989$.setDynamicValue((SubLObject)T, var110);
                module0643.f39161((SubLObject)$ic131$);
            }
            finally {
                module0643.$g4988$.rebind(var3_239, var110);
            }
        }
        finally {
            module0643.$g4989$.rebind(var111, var110);
        }
        module0643.$g4987$.setDynamicValue((SubLObject)T, var110);
        return var109;
    }
    
    public static SubLObject f51125(final SubLObject var109, final SubLObject var106) {
        final SubLThread var110 = SubLProcess.currentSubLThread();
        if (var106.equalp((SubLObject)$ic10$)) {
            return module0589.f35898(module0194.f12112(f51104(var109), (SubLObject)NIL, (SubLObject)T), (SubLObject)UNPROVIDED);
        }
        SubLObject var111 = (SubLObject)$ic144$;
        SubLObject var112 = (SubLObject)$ic144$;
        final SubLObject var113 = f51101(f51103(var109), var106);
        final SubLObject var114 = module0035.f2062(module0035.f2326(module0035.f2339(var113), Symbols.symbol_function((SubLObject)$ic133$)));
        SubLObject var115 = (SubLObject)NIL;
        final SubLObject var116 = $g6379$.getDynamicValue(var110);
        if (NIL == var115) {
            SubLObject var117 = var114;
            SubLObject var118 = (SubLObject)NIL;
            var118 = var117.first();
            while (NIL == var115 && NIL != var117) {
                var112 = var111;
                var111 = ((NIL != module0038.f2608(var111)) ? module0006.f202(var118) : Sequences.cconcatenate(var111, new SubLObject[] { module0589.f35898((SubLObject)$ic145$, (SubLObject)UNPROVIDED), module0006.f202(var118) }));
                var115 = module0035.f2002(var111, var116, (SubLObject)UNPROVIDED);
                var117 = var117.rest();
                var118 = var117.first();
            }
        }
        return (NIL != module0035.f2002(var111, var116, (SubLObject)UNPROVIDED)) ? var112 : var111;
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51127() {
        $g6376$ = SubLFiles.defparameter("S#55708", (SubLObject)NIL);
        $g6377$ = SubLFiles.deflexical("S#55709", (SubLObject)NIL);
        $g6378$ = SubLFiles.deflexical("S#55710", (SubLObject)NIL);
        $g6379$ = SubLFiles.defparameter("S#55711", (SubLObject)$ic104$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51128() {
        module0015.f877((SubLObject)$ic0$, (SubLObject)$ic1$);
        module0015.f873((SubLObject)$ic0$);
        module0015.f873((SubLObject)$ic13$);
        module0015.f873((SubLObject)$ic15$);
        module0015.f873((SubLObject)$ic16$);
        module0015.f873((SubLObject)$ic25$);
        module0015.f873((SubLObject)$ic28$);
        module0015.f873((SubLObject)$ic29$);
        module0015.f873((SubLObject)$ic30$);
        module0015.f873((SubLObject)$ic31$);
        module0015.f873((SubLObject)$ic32$);
        module0015.f873((SubLObject)$ic34$);
        module0015.f873((SubLObject)$ic35$);
        module0015.f877((SubLObject)$ic36$, (SubLObject)$ic1$);
        module0015.f873((SubLObject)$ic36$);
        module0015.f873((SubLObject)$ic50$);
        module0015.f873((SubLObject)$ic73$);
        module0034.f1909((SubLObject)$ic79$);
        module0015.f877((SubLObject)$ic90$, (SubLObject)$ic1$);
        module0015.f873((SubLObject)$ic90$);
        module0015.f873((SubLObject)$ic117$);
        module0034.f1909((SubLObject)$ic118$);
        return (SubLObject)NIL;
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
        $g6376$ = null;
        $g6377$ = null;
        $g6378$ = null;
        $g6379$ = null;
        $ic0$ = makeSymbol("XML-QUERY-VARIABLE");
        $ic1$ = makeString("text/xml");
        $ic2$ = ConsesLow.list((SubLObject)makeKeyword("INPUT-NAME"), (SubLObject)makeString("query"));
        $ic3$ = constant_handles_oc.f8479((SubLObject)makeString("InferencePSC"));
        $ic4$ = ConsesLow.list((SubLObject)makeKeyword("INPUT-NAME"), (SubLObject)makeString("mt"));
        $ic5$ = makeString("var");
        $ic6$ = makeString("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        $ic7$ = ConsesLow.list((SubLObject)makeString("xmlns:xsi"), (SubLObject)makeString("http://www.w3.org/2001/XMLSchema-instance"), (SubLObject)makeString("xsi:schemaLocation"), (SubLObject)makeString("http://ws.opencyc.org/xsd/LightWeightResultSet http://ws.opencyc.org/xsd/LightWeightResultSet.xsd"), (SubLObject)makeString("xmlns:concepts"), (SubLObject)makeString("http://ws.opencyc.org/xsd/CycConcepts"), (SubLObject)makeString("xmlns"), (SubLObject)makeString("http://ws.opencyc.org/xsd/LightWeightResultSet"));
        $ic8$ = makeString("ResultSet");
        $ic9$ = makeString("Term");
        $ic10$ = makeString("cycl");
        $ic11$ = makeSymbol("S#5859", "CYC");
        $ic12$ = makeString("root");
        $ic13$ = makeSymbol("XML-GET-GENLS-FROM-STRING");
        $ic14$ = makeString("term");
        $ic15$ = makeSymbol("XML-GET-GENLS-FROM-STRING-INT");
        $ic16$ = makeSymbol("XML-GET-GENLS");
        $ic17$ = makeString("mt");
        $ic18$ = makeString("#$InferencePSC");
        $ic19$ = makeString("limit");
        $ic20$ = makeString("nil");
        $ic21$ = makeString("nl-generation");
        $ic22$ = makeString("name");
        $ic23$ = makeString("cycml");
        $ic24$ = makeString("genl");
        $ic25$ = makeSymbol("XML-GET-GENLS-INT");
        $ic26$ = makeString("generation");
        $ic27$ = makeString("~S");
        $ic28$ = makeSymbol("XML-GET-UPWARDS-CLOSURE-FROM-STRING");
        $ic29$ = makeSymbol("XML-GET-UPWARDS-CLOSURE");
        $ic30$ = makeSymbol("XML-GET-ISAS-FROM-STRING");
        $ic31$ = makeSymbol("XML-GET-ISAS-FROM-STRING-INT");
        $ic32$ = makeSymbol("XML-GET-ISAS");
        $ic33$ = makeString("isa");
        $ic34$ = makeSymbol("XML-GET-ISAS-INT");
        $ic35$ = makeSymbol("XML-GET-GENERATION");
        $ic36$ = makeSymbol("XML-GET-INFERENCE-PROGRESS-INFO");
        $ic37$ = makeString("problemStoreId");
        $ic38$ = makeString("inferenceId");
        $ic39$ = makeString("stepNumber");
        $ic40$ = makeString("ERROR: Could not find inference for problemStoreId ~S inferenceId ~S");
        $ic41$ = makeString("stepCount=~A~%");
        $ic42$ = makeString("problemCount=~A~%");
        $ic43$ = makeString("assertionTouchCount=~A~%");
        $ic44$ = makeString("termTouchCount=~A~%");
        $ic45$ = makeString("problemQueryFormula=\"~A\"~%");
        $ic46$ = makeString("lastAssertionTouched=\"~A\"~%");
        $ic47$ = makeString("NIL");
        $ic48$ = makeString("lastTermTouched=\"~A\"~%");
        $ic49$ = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic50$ = makeSymbol("CB-GET-INFERENCE-PROGRESS-INFO");
        $ic51$ = ConsesLow.list((SubLObject)makeSymbol("S#1502", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#105", "CYC"));
        $ic52$ = makeSymbol("PROGN");
        $ic53$ = makeSymbol("FORMAT");
        $ic54$ = makeSymbol("S#1089", "CYC");
        $ic55$ = makeString("tickNumber");
        $ic56$ = makeString("dataType");
        $ic57$ = makeString("language");
        $ic58$ = makeString("tickCount=~A~%");
        $ic59$ = makeKeyword("TICK-COUNT");
        $ic60$ = makeString("maxTick=~A~%");
        $ic61$ = makeString("inferenceStatus=~A~%");
        $ic62$ = makeKeyword("STEP-COUNT");
        $ic63$ = makeKeyword("PROBLEM-COUNT");
        $ic64$ = makeKeyword("ASSERTION-TOUCH-COUNT");
        $ic65$ = makeKeyword("TERM-TOUCH-COUNT");
        $ic66$ = makeString("problem");
        $ic67$ = makeKeyword("PROBLEM");
        $ic68$ = makeString("assertion");
        $ic69$ = makeKeyword("LAST-ASSERTION-TOUCHED");
        $ic70$ = makeKeyword("LAST-TERM-TOUCHED");
        $ic71$ = makeString("newProblemTerms=\"~A\"~%");
        $ic72$ = makeString("newAssertionTerms=\"~A\"~%");
        $ic73$ = makeSymbol("CB-INFERENCE-TICK-DATA");
        $ic74$ = makeSymbol("S#55687", "CYC");
        $ic75$ = makeSymbol("S#13483", "CYC");
        $ic76$ = makeSymbol("S#15505", "CYC");
        $ic77$ = constant_handles_oc.f8479((SubLObject)makeString("Thing"));
        $ic78$ = makeString("english");
        $ic79$ = makeSymbol("S#55692", "CYC");
        $ic80$ = makeInteger(50);
        $ic81$ = makeInteger(950);
        $ic82$ = makeInteger(900);
        $ic83$ = makeInteger(800);
        $ic84$ = makeInteger(600);
        $ic85$ = makeInteger(500);
        $ic86$ = makeInteger(1000);
        $ic87$ = makeSymbol("S#55709", "CYC");
        $ic88$ = makeInteger(128);
        $ic89$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic90$ = makeSymbol("XML-GET-INFERENCE-HL-MODULE-TIMES");
        $ic91$ = makeString("error");
        $ic92$ = makeString("ERROR: Could not find inference HL module times for problemStoreId ~S inferenceId ~S");
        $ic93$ = makeSymbol("+");
        $ic94$ = makeString("summary");
        $ic95$ = makeString("totalTime");
        $ic96$ = makeString("~d");
        $ic97$ = makeString("modulesTime");
        $ic98$ = makeSymbol("S#55712", "CYC");
        $ic99$ = makeString("modulesData");
        $ic100$ = makeSymbol("S#4689", "CYC");
        $ic101$ = makeString("module");
        $ic102$ = makeString("percentTime");
        $ic103$ = makeString("~,4f%");
        $ic104$ = makeInteger(100);
        $ic105$ = makeSymbol("S#4691", "CYC");
        $ic106$ = makeString("recursiveTime");
        $ic107$ = makeString("count");
        $ic108$ = makeString("maxTime");
        $ic109$ = makeSymbol("MAX");
        $ic110$ = makeString("medianTime");
        $ic111$ = makeString("meanTime");
        $ic112$ = makeSymbol(">");
        $ic113$ = makeSymbol("SECOND");
        $ic114$ = makeString("startTickNumber");
        $ic115$ = makeString("endTickNumber");
        $ic116$ = makeString("~A");
        $ic117$ = makeSymbol("CB-INFERENCE-LINK-INFO");
        $ic118$ = makeSymbol("S#55696", "CYC");
        $ic119$ = makeSymbol("S#55710", "CYC");
        $ic120$ = makeInteger(256);
        $ic121$ = makeString("{");
        $ic122$ = makeString("links");
        $ic123$ = makeSymbol("STRINGP");
        $ic124$ = makeString(",");
        $ic125$ = makeString(": ");
        $ic126$ = makeString("[");
        $ic127$ = (SubLList)ConsesLow.cons((SubLObject)makeUninternedSymbol("US#3165895"), (SubLObject)makeSymbol("S#1625", "CYC"));
        $ic128$ = ConsesLow.list((SubLObject)makeSymbol("S#54128", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#55713", "CYC"));
        $ic129$ = makeString("]");
        $ic130$ = makeString("problems");
        $ic131$ = makeString("}");
        $ic132$ = makeKeyword("ROOT");
        $ic133$ = makeSymbol("<");
        $ic134$ = (SubLList)ConsesLow.cons((SubLObject)makeUninternedSymbol("US#3165895"), (SubLObject)makeSymbol("S#143", "CYC"));
        $ic135$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#54128", "CYC"), (SubLObject)makeSymbol("S#55714", "CYC"));
        $ic136$ = makeString("Unseen parent ~D in ~S for ~S to ~S");
        $ic137$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#35839", "CYC"), (SubLObject)makeSymbol("S#55715", "CYC"));
        $ic138$ = makeSymbol(">=");
        $ic139$ = makeString("pp");
        $ic140$ = makeString("cp");
        $ic141$ = makeString("id");
        $ic142$ = makeString("status");
        $ic143$ = makeString("label");
        $ic144$ = makeString("");
        $ic145$ = makeString(" ");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 2174 ms
	
	Decompiled with Procyon 0.5.32.
*/