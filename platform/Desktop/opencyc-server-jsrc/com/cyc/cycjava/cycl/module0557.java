package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Semaphores;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import java.util.ArrayList;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0557 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0557";
    public static final String myFingerPrint = "cfa3c1b702cd92e784c22445da651aea17600497095eed9fdf972cd525951bce";
    private static SubLSymbol $g4018$;
    private static SubLSymbol $g4019$;
    private static SubLSymbol $g4020$;
    private static SubLSymbol $g4021$;
    private static SubLSymbol $g4022$;
    public static SubLSymbol $g4023$;
    private static SubLSymbol $g4024$;
    private static SubLSymbol $g4025$;
    private static final SubLObject $ic0$;
    private static final SubLInteger $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLString $ic7$;
    private static final SubLString $ic8$;
    private static final SubLObject $ic9$;
    private static final SubLList $ic10$;
    private static final SubLObject $ic11$;
    private static final SubLList $ic12$;
    private static final SubLObject $ic13$;
    private static final SubLString $ic14$;
    private static final SubLInteger $ic15$;
    private static final SubLString $ic16$;
    private static final SubLList $ic17$;
    private static final SubLObject $ic18$;
    private static final SubLString $ic19$;
    private static final SubLList $ic20$;
    private static final SubLList $ic21$;
    private static final SubLObject $ic22$;
    private static final SubLObject $ic23$;
    private static final SubLString $ic24$;
    private static final SubLList $ic25$;
    private static final SubLList $ic26$;
    private static final SubLList $ic27$;
    private static final SubLString $ic28$;
    private static final SubLList $ic29$;
    private static final SubLString $ic30$;
    private static final SubLList $ic31$;
    private static final SubLList $ic32$;
    private static final SubLObject $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLObject $ic38$;
    private static final SubLObject $ic39$;
    private static final SubLList $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLList $ic42$;
    private static final SubLList $ic43$;
    private static final SubLList $ic44$;
    private static final SubLObject $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLString $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLList $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLString $ic55$;
    private static final SubLList $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLString $ic58$;
    private static final SubLString $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLString $ic64$;
    private static final SubLList $ic65$;
    private static final SubLString $ic66$;
    private static final SubLString $ic67$;
    private static final SubLList $ic68$;
    private static final SubLString $ic69$;
    private static final SubLString $ic70$;
    private static final SubLList $ic71$;
    private static final SubLList $ic72$;
    private static final SubLString $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLString $ic75$;
    private static final SubLString $ic76$;
    private static final SubLString $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLString $ic79$;
    private static final SubLString $ic80$;
    private static final SubLString $ic81$;
    private static final SubLString $ic82$;
    private static final SubLString $ic83$;
    private static final SubLString $ic84$;
    private static final SubLString $ic85$;
    private static final SubLString $ic86$;
    private static final SubLString $ic87$;
    private static final SubLString $ic88$;
    private static final SubLString $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLString $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLString $ic93$;
    private static final SubLString $ic94$;
    private static final SubLString $ic95$;
    private static final SubLString $ic96$;
    private static final SubLString $ic97$;
    private static final SubLString $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLString $ic105$;
    private static final SubLString $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLString $ic108$;
    private static final SubLString $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLString $ic111$;
    private static final SubLString $ic112$;
    private static final SubLString $ic113$;
    private static final SubLString $ic114$;
    private static final SubLString $ic115$;
    private static final SubLString $ic116$;
    private static final SubLString $ic117$;
    private static final SubLObject $ic118$;
    private static final SubLString $ic119$;
    private static final SubLString $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLList $ic124$;
    
    public static SubLObject f34254(SubLObject var1, SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var1 == UNPROVIDED) {
            var1 = $g4022$.getGlobalValue();
        }
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)SEVEN_INTEGER;
        }
        if (var3 == UNPROVIDED) {
            var3 = $g4020$.getDynamicValue();
        }
        if (var4 == UNPROVIDED) {
            var4 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject var5 = Numbers.add(var1, var2);
        return f34255(var5, var3, var4, var1);
    }
    
    public static SubLObject f34256(final SubLObject var6, SubLObject var3, SubLObject var4, SubLObject var7) {
        if (var3 == UNPROVIDED) {
            var3 = $g4020$.getDynamicValue();
        }
        if (var4 == UNPROVIDED) {
            var4 = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)ZERO_INTEGER;
        }
        final SubLThread var8 = SubLProcess.currentSubLThread();
        assert NIL != module0004.f106(var6) : var6;
        assert NIL != module0004.f106(var3) : var3;
        SubLObject var9 = (SubLObject)NIL;
        final SubLObject var10 = module0152.$g2105$.currentBinding(var8);
        try {
            module0152.$g2105$.bind((SubLObject)$ic4$, var8);
            var8.resetMultipleValues();
            final SubLObject var11 = f34257();
            final SubLObject var12 = var8.secondMultipleValue();
            final SubLObject var13 = var8.thirdMultipleValue();
            final SubLObject var14 = var8.fourthMultipleValue();
            final SubLObject var15 = var8.fifthMultipleValue();
            final SubLObject var16 = var8.sixthMultipleValue();
            final SubLObject var17 = var8.seventhMultipleValue();
            final SubLObject var18 = var8.eighthMultipleValue();
            var8.resetMultipleValues();
            try {
                SubLObject var19;
                SubLObject var20;
                SubLObject var21;
                for (var19 = (SubLObject)NIL, var19 = (SubLObject)ZERO_INTEGER; var19.numL(var6); var19 = Numbers.add(var19, (SubLObject)ONE_INTEGER)) {
                    var20 = f34258(var3, var11, var12, var14, var15, var16, var17, var18);
                    var21 = f34259(var4, var3, var20);
                    if (var19.numGE(var7)) {
                        var9 = (SubLObject)ConsesLow.cons(var21, var9);
                    }
                }
            }
            finally {
                final SubLObject var10_22 = Threads.$is_thread_performing_cleanupP$.currentBinding(var8);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var8);
                    f34260(var11, var12, var13, var15, var16, var17, var18);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var10_22, var8);
                }
            }
        }
        finally {
            module0152.$g2105$.rebind(var10, var8);
        }
        var9 = Sequences.nreverse(var9);
        if (var6.numG((SubLObject)ONE_INTEGER)) {
            f34261(var4, var9);
        }
        return var9;
    }
    
    public static SubLObject f34262(SubLObject var3, SubLObject var4) {
        if (var3 == UNPROVIDED) {
            var3 = $g4020$.getDynamicValue();
        }
        if (var4 == UNPROVIDED) {
            var4 = StreamsLow.$standard_output$.getDynamicValue();
        }
        assert NIL != module0004.f106(var3) : var3;
        final SubLObject var5 = f34256((SubLObject)ONE_INTEGER, var3, var4, (SubLObject)ZERO_INTEGER).first();
        final SubLObject var6 = module0107.f7624();
        if (NIL != var6) {
            return Values.values(var5, Numbers.divide(var6, var5));
        }
        return var5;
    }
    
    public static SubLObject f34255(final SubLObject var6, SubLObject var3, SubLObject var4, SubLObject var7) {
        if (var3 == UNPROVIDED) {
            var3 = $g4020$.getDynamicValue();
        }
        if (var4 == UNPROVIDED) {
            var4 = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)ZERO_INTEGER;
        }
        final SubLObject var8 = module0048.f3387(f34256(var6, var3, var4, var7), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var9 = module0107.f7624();
        if (NIL != var9) {
            return Values.values(var8, Numbers.divide(var9, var8));
        }
        return var8;
    }
    
    public static SubLObject f34263(final SubLObject var6, SubLObject var3, SubLObject var4, SubLObject var7) {
        if (var3 == UNPROVIDED) {
            var3 = $g4020$.getDynamicValue();
        }
        if (var4 == UNPROVIDED) {
            var4 = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)ZERO_INTEGER;
        }
        final SubLObject var8 = module0048.f3381(f34256(var6, var3, var4, var7), (SubLObject)UNPROVIDED);
        final SubLObject var9 = module0107.f7624();
        if (NIL != var9) {
            return Values.values(var8, Numbers.divide(var9, var8));
        }
        return var8;
    }
    
    public static SubLObject f34264() {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        try {
            var8.resetMultipleValues();
            final SubLObject var24_25 = f34257();
            final SubLObject var26_27 = var8.secondMultipleValue();
            final SubLObject var28_29 = var8.thirdMultipleValue();
            final SubLObject var30_31 = var8.fourthMultipleValue();
            final SubLObject var32_33 = var8.fifthMultipleValue();
            final SubLObject var34_35 = var8.sixthMultipleValue();
            final SubLObject var36_37 = var8.seventhMultipleValue();
            final SubLObject var38_39 = var8.eighthMultipleValue();
            var8.resetMultipleValues();
            var9 = var24_25;
            var10 = var26_27;
            var11 = var28_29;
            var12 = var30_31;
            var13 = var32_33;
            var14 = var34_35;
            var15 = var36_37;
            var16 = var38_39;
        }
        finally {
            final SubLObject var17 = Threads.$is_thread_performing_cleanupP$.currentBinding(var8);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var8);
                f34260(var9, var10, var11, var13, var14, var15, var16);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var17, var8);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34257() {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        SubLObject var17 = (SubLObject)NIL;
        final SubLObject var18 = module0012.$silent_progressP$.currentBinding(var8);
        final SubLObject var19 = StreamsLow.$standard_output$.currentBinding(var8);
        try {
            module0012.$silent_progressP$.bind((SubLObject)T, var8);
            StreamsLow.$standard_output$.bind(StreamsLow.$null_output$.getDynamicValue(var8), var8);
            var8.resetMultipleValues();
            final SubLObject var42_43 = f34265();
            final SubLObject var44_45 = var8.secondMultipleValue();
            var8.resetMultipleValues();
            var9 = var42_43;
            var10 = var44_45;
            var8.resetMultipleValues();
            final SubLObject var46_47 = f34266();
            final SubLObject var48_49 = var8.secondMultipleValue();
            final SubLObject var50_51 = var8.thirdMultipleValue();
            var8.resetMultipleValues();
            var11 = var46_47;
            var12 = var48_49;
            var13 = var50_51;
            var14 = f34267(var12);
            var15 = f34268(var12);
            var16 = f34269(var12);
            var17 = f34270(var12);
            f34271(var14, var15, var16, var17);
        }
        finally {
            StreamsLow.$standard_output$.rebind(var19, var8);
            module0012.$silent_progressP$.rebind(var18, var8);
        }
        return Values.values(var9, var10, var11, var13, var14, var15, var16, var17);
    }
    
    public static SubLObject f34258(final SubLObject var3, final SubLObject var11, final SubLObject var12, final SubLObject var14, final SubLObject var15, final SubLObject var16, final SubLObject var17, final SubLObject var18) {
        Storage.gc_ephemeral();
        SubLObject var19 = (SubLObject)NIL;
        final SubLObject var20 = Time.get_internal_real_time();
        f34272((SubLObject)ZERO_INTEGER, var3, var11, var12, var14, var15, var16, var17, var18);
        var19 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var20), time_high.$internal_time_units_per_second$.getGlobalValue());
        return var19;
    }
    
    public static SubLObject f34272(final SubLObject var54, final SubLObject var3, final SubLObject var11, final SubLObject var12, final SubLObject var14, final SubLObject var15, final SubLObject var16, final SubLObject var17, final SubLObject var18) {
        final SubLThread var55 = SubLProcess.currentSubLThread();
        final SubLObject var56 = module0012.$silent_progressP$.currentBinding(var55);
        final SubLObject var57 = StreamsLow.$standard_output$.currentBinding(var55);
        final SubLObject var58 = module0352.$g2992$.currentBinding(var55);
        final SubLObject var59 = Types.$suspend_type_checkingP$.currentBinding(var55);
        try {
            module0012.$silent_progressP$.bind((SubLObject)T, var55);
            StreamsLow.$standard_output$.bind(StreamsLow.$null_output$.getDynamicValue(var55), var55);
            module0352.$g2992$.bind((SubLObject)$ic5$, var55);
            Types.$suspend_type_checkingP$.bind((SubLObject)T, var55);
            final SubLObject var60 = module0012.$g52$.getGlobalValue();
            final ArrayList var61 = Dynamic.extract_dynamic_values(var60);
            try {
                Dynamic.bind_dynamic_vars(var60, (SubLObject)ConsesLow.make_list(Sequences.length(module0012.$g52$.getGlobalValue()), (SubLObject)NIL));
                final SubLObject var10_59 = module0131.$g60$.currentBinding(var55);
                final SubLObject var41_60 = module0018.$g61$.currentBinding(var55);
                try {
                    module0131.$g60$.bind((SubLObject)NIL, var55);
                    module0018.$g61$.bind((SubLObject)NIL, var55);
                    final SubLObject var62 = module0528.f32898();
                    assert NIL != module0055.f4006(var62) : var62;
                    final SubLObject var10_60 = module0131.$g1538$.currentBinding(var55);
                    final SubLObject var41_61 = module0012.$g59$.currentBinding(var55);
                    try {
                        module0131.$g1538$.bind(var62, var55);
                        module0012.$g59$.bind((SubLObject)NIL, var55);
                        try {
                            SubLObject var63 = module0139.f9019((SubLObject)TEN_INTEGER);
                            final SubLObject var10_61 = module0139.$g1632$.currentBinding(var55);
                            final SubLObject var41_62 = module0139.$g1630$.currentBinding(var55);
                            final SubLObject var55_67 = module0139.$g1631$.currentBinding(var55);
                            try {
                                module0139.$g1632$.bind(var63, var55);
                                module0139.$g1630$.bind((SubLObject)T, var55);
                                module0139.$g1631$.bind(module0139.f9023(module0139.$g1632$.getDynamicValue(var55)), var55);
                                final SubLObject var64 = Numbers.subtract(Numbers.expt((SubLObject)TWO_INTEGER, var3), (SubLObject)ONE_INTEGER);
                                SubLObject var65 = (SubLObject)NIL;
                                try {
                                    var65 = f34273(var54, var64, var14, var11);
                                    f34274(var54, var64, var65, var18, var11);
                                    f34275(var64, var65, var15, var11);
                                    f34276(var64, var65, var15, var12);
                                    f34277(var64, var65, var16, var11);
                                    f34278(var64, var65, var17, var12);
                                    f34279(var54, var15, var17, var18);
                                    f34280(var54, var15, var17, var18);
                                    f34281(var64, var65, var17, var12);
                                }
                                finally {
                                    final SubLObject var10_62 = Threads.$is_thread_performing_cleanupP$.currentBinding(var55);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var55);
                                        f34282(var64, var65);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var10_62, var55);
                                    }
                                }
                                var63 = module0139.$g1632$.getDynamicValue(var55);
                            }
                            finally {
                                module0139.$g1631$.rebind(var55_67, var55);
                                module0139.$g1630$.rebind(var41_62, var55);
                                module0139.$g1632$.rebind(var10_61, var55);
                            }
                        }
                        finally {
                            final SubLObject var10_63 = Threads.$is_thread_performing_cleanupP$.currentBinding(var55);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var55);
                                module0528.f32915();
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var10_63, var55);
                            }
                        }
                    }
                    finally {
                        module0012.$g59$.rebind(var41_61, var55);
                        module0131.$g1538$.rebind(var10_60, var55);
                    }
                }
                finally {
                    module0018.$g61$.rebind(var41_60, var55);
                    module0131.$g60$.rebind(var10_59, var55);
                }
            }
            finally {
                Dynamic.rebind_dynamic_vars(var60, var61);
            }
        }
        finally {
            Types.$suspend_type_checkingP$.rebind(var59, var55);
            module0352.$g2992$.rebind(var58, var55);
            StreamsLow.$standard_output$.rebind(var57, var55);
            module0012.$silent_progressP$.rebind(var56, var55);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34260(final SubLObject var11, final SubLObject var12, final SubLObject var13, final SubLObject var15, final SubLObject var16, final SubLObject var17, final SubLObject var18) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        final SubLObject var20 = module0012.$silent_progressP$.currentBinding(var19);
        final SubLObject var21 = StreamsLow.$standard_output$.currentBinding(var19);
        try {
            module0012.$silent_progressP$.bind((SubLObject)T, var19);
            StreamsLow.$standard_output$.bind(StreamsLow.$null_output$.getDynamicValue(var19), var19);
            f34283(var11, var12, var13, var15, var16, var17, var18);
        }
        finally {
            StreamsLow.$standard_output$.rebind(var21, var19);
            module0012.$silent_progressP$.rebind(var20, var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34259(final SubLObject var4, final SubLObject var3, final SubLObject var20) {
        final SubLObject var21 = Numbers.subtract(Numbers.expt((SubLObject)TWO_INTEGER, var3), (SubLObject)ONE_INTEGER);
        final SubLObject var22 = Numbers.divide(var20, var21);
        final SubLObject var23 = Numbers.invert(var22);
        final SubLObject var24 = module0107.f7624();
        f34284(var4, var24, var21, var20, var22, var23);
        return var23;
    }
    
    public static SubLObject f34265() {
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        var11 = module0540.f33504((SubLObject)$ic7$);
        var12 = module0540.f33504((SubLObject)$ic8$);
        module0540.f33517((SubLObject)ConsesLow.listS($ic9$, var11, (SubLObject)$ic10$), $ic11$, (SubLObject)$ic12$);
        module0540.f33517((SubLObject)ConsesLow.listS($ic9$, var12, (SubLObject)$ic10$), $ic11$, (SubLObject)$ic12$);
        module0540.f33517((SubLObject)ConsesLow.list($ic13$, var12, var11), $ic11$, (SubLObject)$ic12$);
        return Values.values(var11, var12);
    }
    
    public static SubLObject f34266() {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = (SubLObject)NIL;
        module0012.$g82$.setDynamicValue((SubLObject)$ic14$, var8);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var8);
        module0012.$g83$.setDynamicValue((SubLObject)$ic15$, var8);
        module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var8);
        final SubLObject var12 = module0012.$g75$.currentBinding(var8);
        final SubLObject var13 = module0012.$g76$.currentBinding(var8);
        final SubLObject var14 = module0012.$g77$.currentBinding(var8);
        final SubLObject var15 = module0012.$g78$.currentBinding(var8);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var8);
            module0012.$g76$.bind((SubLObject)NIL, var8);
            module0012.$g77$.bind((SubLObject)T, var8);
            module0012.$g78$.bind(Time.get_universal_time(), var8);
            module0012.f478(module0012.$g82$.getDynamicValue(var8));
            SubLObject var16;
            SubLObject var17;
            for (var16 = (SubLObject)NIL, var16 = (SubLObject)ZERO_INTEGER; var16.numL(module0012.$g83$.getDynamicValue(var8)); var16 = Numbers.add(var16, (SubLObject)ONE_INTEGER)) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var8), module0012.$g83$.getDynamicValue(var8));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var8), (SubLObject)ONE_INTEGER), var8);
                var17 = module0540.f33504(Sequences.cconcatenate((SubLObject)$ic16$, module0006.f203(var16)));
                var9 = (SubLObject)ConsesLow.cons(var17, var9);
                module0540.f33517((SubLObject)ConsesLow.listS($ic9$, var17, (SubLObject)$ic17$), $ic11$, (SubLObject)$ic12$);
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var15, var8);
            module0012.$g77$.rebind(var14, var8);
            module0012.$g76$.rebind(var13, var8);
            module0012.$g75$.rebind(var12, var8);
        }
        SubLObject var18 = $g4021$.getDynamicValue(var8);
        SubLObject var19 = var9;
        SubLObject var20 = (SubLObject)NIL;
        var20 = var19.first();
        while (NIL != var19) {
            module0540.f33517((SubLObject)ConsesLow.list($ic18$, var20, var18), $ic11$, (SubLObject)$ic12$);
            var18 = var20;
            var19 = var19.rest();
            var20 = var19.first();
        }
        var10 = var9.first();
        var11 = conses_high.last(var9, (SubLObject)UNPROVIDED).first();
        return Values.values(var9, var10, var11);
    }
    
    public static SubLObject f34267(final SubLObject var40) {
        final SubLObject var41 = module0540.f33504((SubLObject)$ic19$);
        module0540.f33517((SubLObject)ConsesLow.listS($ic9$, var41, (SubLObject)$ic20$), $ic11$, (SubLObject)$ic12$);
        module0540.f33517((SubLObject)ConsesLow.listS($ic9$, var41, (SubLObject)$ic21$), $ic11$, (SubLObject)$ic12$);
        module0540.f33517((SubLObject)ConsesLow.list($ic22$, var41, var40), $ic11$, (SubLObject)$ic12$);
        module0540.f33517((SubLObject)ConsesLow.list($ic23$, var41, var40), $ic11$, (SubLObject)$ic12$);
        return var41;
    }
    
    public static SubLObject f34268(final SubLObject var40) {
        final SubLObject var41 = module0540.f33504((SubLObject)$ic24$);
        module0540.f33517((SubLObject)ConsesLow.listS($ic9$, var41, (SubLObject)$ic25$), $ic11$, (SubLObject)$ic12$);
        module0540.f33517((SubLObject)ConsesLow.listS($ic9$, var41, (SubLObject)$ic26$), $ic11$, (SubLObject)$ic12$);
        module0540.f33517((SubLObject)ConsesLow.listS($ic9$, var41, (SubLObject)$ic27$), $ic11$, (SubLObject)$ic12$);
        module0540.f33517((SubLObject)ConsesLow.list($ic22$, var41, var40), $ic11$, (SubLObject)$ic12$);
        module0540.f33517((SubLObject)ConsesLow.list($ic23$, var41, var40), $ic11$, (SubLObject)$ic12$);
        return var41;
    }
    
    public static SubLObject f34269(final SubLObject var40) {
        final SubLObject var41 = module0540.f33504((SubLObject)$ic28$);
        module0540.f33517((SubLObject)ConsesLow.listS($ic9$, var41, (SubLObject)$ic20$), $ic11$, (SubLObject)$ic12$);
        module0540.f33517((SubLObject)ConsesLow.listS($ic9$, var41, (SubLObject)$ic29$), $ic11$, (SubLObject)$ic12$);
        module0540.f33517((SubLObject)ConsesLow.list($ic22$, var41, var40), $ic11$, (SubLObject)$ic12$);
        module0540.f33517((SubLObject)ConsesLow.list($ic23$, var41, var40), $ic11$, (SubLObject)$ic12$);
        return var41;
    }
    
    public static SubLObject f34270(final SubLObject var40) {
        final SubLObject var41 = module0540.f33504((SubLObject)$ic30$);
        module0540.f33517((SubLObject)ConsesLow.listS($ic9$, var41, (SubLObject)$ic31$), $ic11$, (SubLObject)$ic12$);
        module0540.f33517((SubLObject)ConsesLow.list($ic22$, var41, var40), $ic11$, (SubLObject)$ic12$);
        module0540.f33517((SubLObject)ConsesLow.listS($ic23$, var41, (SubLObject)$ic32$), $ic11$, (SubLObject)$ic12$);
        return var41;
    }
    
    public static SubLObject f34271(final SubLObject var15, final SubLObject var16, final SubLObject var17, final SubLObject var18) {
        module0540.f33517((SubLObject)ConsesLow.list($ic33$, var15, var16), $ic11$, (SubLObject)$ic12$);
        f34285((SubLObject)MINUS_ONE_INTEGER, var15, var17, var18, (SubLObject)$ic34$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34285(final SubLObject var54, final SubLObject var15, final SubLObject var17, final SubLObject var18, final SubLObject var76) {
        final SubLThread var77 = SubLProcess.currentSubLThread();
        final SubLObject var78 = (SubLObject)ConsesLow.list((SubLObject)$ic35$, (SubLObject)$ic36$, (SubLObject)$ic37$, var76);
        SubLObject var79 = (SubLObject)NIL;
        if (NIL != $g4018$.getDynamicValue(var77) && !var54.isNegative()) {
            var79 = (SubLObject)ConsesLow.list($ic38$, (SubLObject)ConsesLow.list($ic39$, (SubLObject)$ic40$, (SubLObject)ConsesLow.list(var18, (SubLObject)$ic41$, var54), reader.bq_cons(var15, (SubLObject)$ic42$), reader.bq_cons(var15, (SubLObject)$ic43$)), reader.bq_cons(var17, (SubLObject)$ic44$));
        }
        else {
            var79 = (SubLObject)ConsesLow.list($ic38$, (SubLObject)ConsesLow.list($ic39$, (SubLObject)ConsesLow.list($ic45$, (SubLObject)$ic46$, (SubLObject)$ic47$, var54), reader.bq_cons(var15, (SubLObject)$ic42$), reader.bq_cons(var15, (SubLObject)$ic43$)), reader.bq_cons(var17, (SubLObject)$ic44$));
        }
        return module0540.f33517(var79, $ic11$, var78);
    }
    
    public static SubLObject f34286(final SubLObject var79, final SubLObject var80) {
        final SubLObject var81 = var79.rest();
        final SubLObject var83;
        final SubLObject var82 = var83 = var81;
        return (SubLObject)ConsesLow.list((SubLObject)$ic51$, (SubLObject)$ic48$, (SubLObject)ConsesLow.listS((SubLObject)$ic52$, (SubLObject)$ic53$, ConsesLow.append(var83, (SubLObject)NIL)), reader.bq_cons((SubLObject)$ic54$, ConsesLow.append(var83, (SubLObject)NIL)));
    }
    
    public static SubLObject f34273(final SubLObject var54, final SubLObject var68, final SubLObject var14, SubLObject var11) {
        final SubLThread var69 = SubLProcess.currentSubLThread();
        if (NIL == $g4019$.getDynamicValue(var69)) {
            var11 = $ic11$;
        }
        SubLObject var70 = (SubLObject)NIL;
        module0012.$g82$.setDynamicValue((SubLObject)$ic55$, var69);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var69);
        module0012.$g83$.setDynamicValue(var68, var69);
        module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var69);
        final SubLObject var71 = module0012.$g75$.currentBinding(var69);
        final SubLObject var72 = module0012.$g76$.currentBinding(var69);
        final SubLObject var73 = module0012.$g77$.currentBinding(var69);
        final SubLObject var74 = module0012.$g78$.currentBinding(var69);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var69);
            module0012.$g76$.bind((SubLObject)NIL, var69);
            module0012.$g77$.bind((SubLObject)T, var69);
            module0012.$g78$.bind(Time.get_universal_time(), var69);
            module0012.f478(module0012.$g82$.getDynamicValue(var69));
            SubLObject var75;
            SubLObject var76;
            SubLObject var77;
            SubLObject var78;
            SubLObject var79;
            SubLObject var80;
            for (var75 = (SubLObject)NIL, var75 = (SubLObject)ZERO_INTEGER; var75.numL(module0012.$g83$.getDynamicValue(var69)); var75 = Numbers.add(var75, (SubLObject)ONE_INTEGER)) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var69), module0012.$g83$.getDynamicValue(var69));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var69), (SubLObject)ONE_INTEGER), var69);
                var76 = f34287(var54, var75);
                var70 = (SubLObject)ConsesLow.cons(var76, var70);
                if (NIL != $g4019$.getDynamicValue(var69)) {
                    if (NIL != $g4023$.getDynamicValue(var69)) {
                        var77 = $g4024$.getGlobalValue();
                        var78 = (SubLObject)NIL;
                        try {
                            var78 = Locks.seize_lock(var77);
                            module0540.f33517((SubLObject)ConsesLow.listS($ic9$, var76, (SubLObject)$ic56$), $ic11$, (SubLObject)$ic12$);
                        }
                        finally {
                            if (NIL != var78) {
                                Locks.release_lock(var77);
                            }
                        }
                    }
                    else {
                        module0540.f33517((SubLObject)ConsesLow.listS($ic9$, var76, (SubLObject)$ic56$), $ic11$, (SubLObject)$ic12$);
                    }
                }
                if (NIL != $g4023$.getDynamicValue(var69)) {
                    var79 = $g4024$.getGlobalValue();
                    var80 = (SubLObject)NIL;
                    try {
                        var80 = Locks.seize_lock(var79);
                        module0540.f33517((SubLObject)ConsesLow.list($ic9$, var76, var14), var11, (SubLObject)$ic12$);
                    }
                    finally {
                        if (NIL != var80) {
                            Locks.release_lock(var79);
                        }
                    }
                }
                else {
                    module0540.f33517((SubLObject)ConsesLow.list($ic9$, var76, var14), var11, (SubLObject)$ic12$);
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var74, var69);
            module0012.$g77$.rebind(var73, var69);
            module0012.$g76$.rebind(var72, var69);
            module0012.$g75$.rebind(var71, var69);
        }
        var70 = Functions.apply(Symbols.symbol_function((SubLObject)$ic57$), Sequences.nreverse(var70));
        return var70;
    }
    
    public static SubLObject f34287(final SubLObject var54, final SubLObject var89) {
        final SubLThread var90 = SubLProcess.currentSubLThread();
        SubLObject var91 = (SubLObject)NIL;
        if (NIL != $g4023$.getDynamicValue(var90)) {
            final SubLObject var92 = $g4024$.getGlobalValue();
            SubLObject var93 = (SubLObject)NIL;
            try {
                var93 = Locks.seize_lock(var92);
                var91 = module0540.f33504(Sequences.cconcatenate((SubLObject)$ic58$, new SubLObject[] { module0006.f203(var54), $ic59$, module0006.f203(var89) }));
            }
            finally {
                if (NIL != var93) {
                    Locks.release_lock(var92);
                }
            }
        }
        else {
            var91 = module0540.f33504(Sequences.cconcatenate((SubLObject)$ic58$, new SubLObject[] { module0006.f203(var54), $ic59$, module0006.f203(var89) }));
        }
        return var91;
    }
    
    public static SubLObject f34274(final SubLObject var54, final SubLObject var68, final SubLObject var69, final SubLObject var18, final SubLObject var11) {
        final SubLThread var70 = SubLProcess.currentSubLThread();
        module0012.$g82$.setDynamicValue((SubLObject)$ic60$, var70);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var70);
        module0012.$g83$.setDynamicValue(var68, var70);
        module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var70);
        final SubLObject var71 = module0012.$g75$.currentBinding(var70);
        final SubLObject var72 = module0012.$g76$.currentBinding(var70);
        final SubLObject var73 = module0012.$g77$.currentBinding(var70);
        final SubLObject var74 = module0012.$g78$.currentBinding(var70);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var70);
            module0012.$g76$.bind((SubLObject)NIL, var70);
            module0012.$g77$.bind((SubLObject)T, var70);
            module0012.$g78$.bind(Time.get_universal_time(), var70);
            module0012.f478(module0012.$g82$.getDynamicValue(var70));
            SubLObject var75;
            SubLObject var76;
            SubLObject var77;
            for (var75 = (SubLObject)NIL, var75 = (SubLObject)ZERO_INTEGER; var75.numL(module0012.$g83$.getDynamicValue(var70)); var75 = Numbers.add(var75, (SubLObject)ONE_INTEGER)) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var70), module0012.$g83$.getDynamicValue(var70));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var70), (SubLObject)ONE_INTEGER), var70);
                if (NIL != $g4023$.getDynamicValue(var70)) {
                    var76 = $g4024$.getGlobalValue();
                    var77 = (SubLObject)NIL;
                    try {
                        var77 = Locks.seize_lock(var76);
                        module0540.f33517((SubLObject)ConsesLow.list(var18, Vectors.aref(var69, var75), var54), var11, (SubLObject)$ic12$);
                    }
                    finally {
                        if (NIL != var77) {
                            Locks.release_lock(var76);
                        }
                    }
                }
                else {
                    module0540.f33517((SubLObject)ConsesLow.list(var18, Vectors.aref(var69, var75), var54), var11, (SubLObject)$ic12$);
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var74, var70);
            module0012.$g77$.rebind(var73, var70);
            module0012.$g76$.rebind(var72, var70);
            module0012.$g75$.rebind(var71, var70);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34275(final SubLObject var68, final SubLObject var69, final SubLObject var15, final SubLObject var11) {
        final SubLThread var70 = SubLProcess.currentSubLThread();
        module0012.$g82$.setDynamicValue((SubLObject)$ic61$, var70);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var70);
        module0012.$g83$.setDynamicValue(var68, var70);
        module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var70);
        final SubLObject var71 = module0012.$g75$.currentBinding(var70);
        final SubLObject var72 = module0012.$g76$.currentBinding(var70);
        final SubLObject var73 = module0012.$g77$.currentBinding(var70);
        final SubLObject var74 = module0012.$g78$.currentBinding(var70);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var70);
            module0012.$g76$.bind((SubLObject)NIL, var70);
            module0012.$g77$.bind((SubLObject)T, var70);
            module0012.$g78$.bind(Time.get_universal_time(), var70);
            module0012.f478(module0012.$g82$.getDynamicValue(var70));
            SubLObject var75;
            SubLObject var76;
            SubLObject var77;
            for (var75 = (SubLObject)NIL, var75 = (SubLObject)ZERO_INTEGER; var75.numL(module0012.$g83$.getDynamicValue(var70)); var75 = Numbers.add(var75, (SubLObject)ONE_INTEGER)) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var70), module0012.$g83$.getDynamicValue(var70));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var70), (SubLObject)ONE_INTEGER), var70);
                if (!var75.numE((SubLObject)ZERO_INTEGER)) {
                    if (NIL != $g4023$.getDynamicValue(var70)) {
                        var76 = $g4024$.getGlobalValue();
                        var77 = (SubLObject)NIL;
                        try {
                            var77 = Locks.seize_lock(var76);
                            module0540.f33517((SubLObject)ConsesLow.list(var15, Vectors.aref(var69, var75), Vectors.aref(var69, Numbers.integerDivide(Numbers.subtract(var75, (SubLObject)ONE_INTEGER), (SubLObject)TWO_INTEGER))), var11, (SubLObject)$ic12$);
                        }
                        finally {
                            if (NIL != var77) {
                                Locks.release_lock(var76);
                            }
                        }
                    }
                    else {
                        module0540.f33517((SubLObject)ConsesLow.list(var15, Vectors.aref(var69, var75), Vectors.aref(var69, Numbers.integerDivide(Numbers.subtract(var75, (SubLObject)ONE_INTEGER), (SubLObject)TWO_INTEGER))), var11, (SubLObject)$ic12$);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var74, var70);
            module0012.$g77$.rebind(var73, var70);
            module0012.$g76$.rebind(var72, var70);
            module0012.$g75$.rebind(var71, var70);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34288(final SubLObject var78, final SubLObject var96, final SubLObject var77, final SubLObject var97) {
        SubLObject var98 = module0409.f28506(var78, var96, var77);
        if (NIL != var98) {
            return var98;
        }
        Functions.apply(Symbols.symbol_function((SubLObject)$ic62$), var97);
        var98 = module0409.f28506(var78, var96, var77);
        if (NIL != var98) {
            return var98;
        }
        Functions.apply(Symbols.symbol_function((SubLObject)$ic63$), var97);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34276(final SubLObject var68, final SubLObject var69, final SubLObject var15, final SubLObject var12) {
        final SubLThread var70 = SubLProcess.currentSubLThread();
        module0012.$g82$.setDynamicValue((SubLObject)$ic64$, var70);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var70);
        module0012.$g83$.setDynamicValue(var68, var70);
        module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var70);
        final SubLObject var71 = module0012.$g75$.currentBinding(var70);
        final SubLObject var72 = module0012.$g76$.currentBinding(var70);
        final SubLObject var73 = module0012.$g77$.currentBinding(var70);
        final SubLObject var74 = module0012.$g78$.currentBinding(var70);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var70);
            module0012.$g76$.bind((SubLObject)NIL, var70);
            module0012.$g77$.bind((SubLObject)T, var70);
            module0012.$g78$.bind(Time.get_universal_time(), var70);
            module0012.f478(module0012.$g82$.getDynamicValue(var70));
            SubLObject var75;
            SubLObject var76;
            for (var75 = (SubLObject)NIL, var75 = (SubLObject)ZERO_INTEGER; var75.numL(module0012.$g83$.getDynamicValue(var70)); var75 = Numbers.add(var75, (SubLObject)ONE_INTEGER)) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var70), module0012.$g83$.getDynamicValue(var70));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var70), (SubLObject)ONE_INTEGER), var70);
                if (!var75.numE((SubLObject)ZERO_INTEGER)) {
                    var76 = (SubLObject)ConsesLow.listS(var15, Vectors.aref(var69, var75), (SubLObject)$ic65$);
                    f34288(var76, var12, (SubLObject)NIL, (SubLObject)ConsesLow.list((SubLObject)$ic66$, var75));
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var74, var70);
            module0012.$g77$.rebind(var73, var70);
            module0012.$g76$.rebind(var72, var70);
            module0012.$g75$.rebind(var71, var70);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34277(final SubLObject var68, final SubLObject var69, final SubLObject var16, final SubLObject var11) {
        final SubLThread var70 = SubLProcess.currentSubLThread();
        module0012.$g82$.setDynamicValue((SubLObject)$ic67$, var70);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var70);
        module0012.$g83$.setDynamicValue(var68, var70);
        module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var70);
        final SubLObject var71 = module0012.$g75$.currentBinding(var70);
        final SubLObject var72 = module0012.$g76$.currentBinding(var70);
        final SubLObject var73 = module0012.$g77$.currentBinding(var70);
        final SubLObject var74 = module0012.$g78$.currentBinding(var70);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var70);
            module0012.$g76$.bind((SubLObject)NIL, var70);
            module0012.$g77$.bind((SubLObject)T, var70);
            module0012.$g78$.bind(Time.get_universal_time(), var70);
            module0012.f478(module0012.$g82$.getDynamicValue(var70));
            SubLObject var75;
            SubLObject var76;
            for (var75 = (SubLObject)NIL, var75 = (SubLObject)ZERO_INTEGER; var75.numL(module0012.$g83$.getDynamicValue(var70)); var75 = Numbers.add(var75, (SubLObject)ONE_INTEGER)) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var70), module0012.$g83$.getDynamicValue(var70));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var70), (SubLObject)ONE_INTEGER), var70);
                if (!var75.numE((SubLObject)ZERO_INTEGER)) {
                    var76 = (SubLObject)ConsesLow.list($ic39$, (SubLObject)ConsesLow.listS(var16, Vectors.aref(var69, var75), (SubLObject)$ic68$), (SubLObject)ConsesLow.listS($ic45$, Vectors.aref(var69, var75), (SubLObject)$ic68$));
                    f34288(var76, var11, (SubLObject)NIL, (SubLObject)ConsesLow.list((SubLObject)$ic69$, var75));
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var74, var70);
            module0012.$g77$.rebind(var73, var70);
            module0012.$g76$.rebind(var72, var70);
            module0012.$g75$.rebind(var71, var70);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34278(final SubLObject var68, final SubLObject var69, final SubLObject var17, final SubLObject var12) {
        final SubLThread var70 = SubLProcess.currentSubLThread();
        module0012.$g82$.setDynamicValue((SubLObject)$ic70$, var70);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var70);
        module0012.$g83$.setDynamicValue(var68, var70);
        module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var70);
        final SubLObject var71 = module0012.$g75$.currentBinding(var70);
        final SubLObject var72 = module0012.$g76$.currentBinding(var70);
        final SubLObject var73 = module0012.$g77$.currentBinding(var70);
        final SubLObject var74 = module0012.$g78$.currentBinding(var70);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var70);
            module0012.$g76$.bind((SubLObject)NIL, var70);
            module0012.$g77$.bind((SubLObject)T, var70);
            module0012.$g78$.bind(Time.get_universal_time(), var70);
            module0012.f478(module0012.$g82$.getDynamicValue(var70));
            SubLObject var75;
            SubLObject var76;
            SubLObject var77;
            for (var75 = (SubLObject)NIL, var75 = (SubLObject)ZERO_INTEGER; var75.numL(module0012.$g83$.getDynamicValue(var70)); var75 = Numbers.add(var75, (SubLObject)ONE_INTEGER)) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var70), module0012.$g83$.getDynamicValue(var70));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var70), (SubLObject)ONE_INTEGER), var70);
                if (!var75.numE((SubLObject)ZERO_INTEGER)) {
                    var76 = (SubLObject)ConsesLow.listS(var17, Vectors.aref(var69, var75), (SubLObject)$ic71$);
                    var77 = (SubLObject)$ic72$;
                    f34288(var76, var12, var77, (SubLObject)ConsesLow.list((SubLObject)$ic73$, var75));
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var74, var70);
            module0012.$g77$.rebind(var73, var70);
            module0012.$g76$.rebind(var72, var70);
            module0012.$g75$.rebind(var71, var70);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34279(final SubLObject var54, final SubLObject var15, final SubLObject var17, final SubLObject var18) {
        final SubLThread var55 = SubLProcess.currentSubLThread();
        if (NIL != $g4023$.getDynamicValue(var55)) {
            final SubLObject var56 = $g4024$.getGlobalValue();
            SubLObject var57 = (SubLObject)NIL;
            try {
                var57 = Locks.seize_lock(var56);
                f34285(var54, var15, var17, var18, (SubLObject)$ic74$);
            }
            finally {
                if (NIL != var57) {
                    Locks.release_lock(var56);
                }
            }
        }
        else {
            f34285(var54, var15, var17, var18, (SubLObject)$ic74$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34280(final SubLObject var54, final SubLObject var15, final SubLObject var17, final SubLObject var18) {
        final SubLThread var55 = SubLProcess.currentSubLThread();
        if (NIL != $g4023$.getDynamicValue(var55)) {
            final SubLObject var56 = $g4024$.getGlobalValue();
            SubLObject var57 = (SubLObject)NIL;
            try {
                var57 = Locks.seize_lock(var56);
                f34285(var54, var15, var17, var18, (SubLObject)$ic34$);
            }
            finally {
                if (NIL != var57) {
                    Locks.release_lock(var56);
                }
            }
        }
        else {
            f34285(var54, var15, var17, var18, (SubLObject)$ic34$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34281(final SubLObject var68, final SubLObject var69, final SubLObject var17, final SubLObject var12) {
        final SubLThread var70 = SubLProcess.currentSubLThread();
        module0012.$g82$.setDynamicValue((SubLObject)$ic70$, var70);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var70);
        module0012.$g83$.setDynamicValue(var68, var70);
        module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var70);
        final SubLObject var71 = module0012.$g75$.currentBinding(var70);
        final SubLObject var72 = module0012.$g76$.currentBinding(var70);
        final SubLObject var73 = module0012.$g77$.currentBinding(var70);
        final SubLObject var74 = module0012.$g78$.currentBinding(var70);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var70);
            module0012.$g76$.bind((SubLObject)NIL, var70);
            module0012.$g77$.bind((SubLObject)T, var70);
            module0012.$g78$.bind(Time.get_universal_time(), var70);
            module0012.f478(module0012.$g82$.getDynamicValue(var70));
            SubLObject var75;
            SubLObject var76;
            for (var75 = (SubLObject)NIL, var75 = (SubLObject)ZERO_INTEGER; var75.numL(module0012.$g83$.getDynamicValue(var70)); var75 = Numbers.add(var75, (SubLObject)ONE_INTEGER)) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var70), module0012.$g83$.getDynamicValue(var70));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var70), (SubLObject)ONE_INTEGER), var70);
                if (!var75.numE((SubLObject)ZERO_INTEGER)) {
                    var76 = (SubLObject)ConsesLow.listS(var17, Vectors.aref(var69, var75), (SubLObject)$ic71$);
                    f34288(var76, var12, (SubLObject)NIL, (SubLObject)ConsesLow.list((SubLObject)$ic75$, var75));
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var74, var70);
            module0012.$g77$.rebind(var73, var70);
            module0012.$g76$.rebind(var72, var70);
            module0012.$g75$.rebind(var71, var70);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34282(final SubLObject var68, final SubLObject var69) {
        final SubLThread var70 = SubLProcess.currentSubLThread();
        module0012.$g82$.setDynamicValue((SubLObject)$ic76$, var70);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var70);
        module0012.$g83$.setDynamicValue(var68, var70);
        module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var70);
        final SubLObject var71 = module0012.$g75$.currentBinding(var70);
        final SubLObject var72 = module0012.$g76$.currentBinding(var70);
        final SubLObject var73 = module0012.$g77$.currentBinding(var70);
        final SubLObject var74 = module0012.$g78$.currentBinding(var70);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var70);
            module0012.$g76$.bind((SubLObject)NIL, var70);
            module0012.$g77$.bind((SubLObject)T, var70);
            module0012.$g78$.bind(Time.get_universal_time(), var70);
            module0012.f478(module0012.$g82$.getDynamicValue(var70));
            SubLObject var75;
            SubLObject var76;
            SubLObject var77;
            for (var75 = (SubLObject)NIL, var75 = (SubLObject)ZERO_INTEGER; var75.numL(module0012.$g83$.getDynamicValue(var70)); var75 = Numbers.add(var75, (SubLObject)ONE_INTEGER)) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var70), module0012.$g83$.getDynamicValue(var70));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var70), (SubLObject)ONE_INTEGER), var70);
                if (NIL != $g4023$.getDynamicValue(var70)) {
                    var76 = $g4024$.getGlobalValue();
                    var77 = (SubLObject)NIL;
                    try {
                        var77 = Locks.seize_lock(var76);
                        module0540.f33510(Vectors.aref(var69, var75));
                    }
                    finally {
                        if (NIL != var77) {
                            Locks.release_lock(var76);
                        }
                    }
                }
                else {
                    module0540.f33510(Vectors.aref(var69, var75));
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var74, var70);
            module0012.$g77$.rebind(var73, var70);
            module0012.$g76$.rebind(var72, var70);
            module0012.$g75$.rebind(var71, var70);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34283(final SubLObject var11, final SubLObject var12, final SubLObject var13, final SubLObject var15, final SubLObject var16, final SubLObject var17, final SubLObject var18) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        module0012.$g82$.setDynamicValue((SubLObject)$ic77$, var19);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var19);
        module0012.$g83$.setDynamicValue(Sequences.length(var13), var19);
        module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var19);
        final SubLObject var20 = module0012.$g75$.currentBinding(var19);
        final SubLObject var21 = module0012.$g76$.currentBinding(var19);
        final SubLObject var22 = module0012.$g77$.currentBinding(var19);
        final SubLObject var23 = module0012.$g78$.currentBinding(var19);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var19);
            module0012.$g76$.bind((SubLObject)NIL, var19);
            module0012.$g77$.bind((SubLObject)T, var19);
            module0012.$g78$.bind(Time.get_universal_time(), var19);
            module0012.f478(module0012.$g82$.getDynamicValue(var19));
            SubLObject var24 = var13;
            SubLObject var25 = (SubLObject)NIL;
            var25 = var24.first();
            while (NIL != var24) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var19), module0012.$g83$.getDynamicValue(var19));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var19), (SubLObject)ONE_INTEGER), var19);
                module0540.f33510(var25);
                var24 = var24.rest();
                var25 = var24.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var23, var19);
            module0012.$g77$.rebind(var22, var19);
            module0012.$g76$.rebind(var21, var19);
            module0012.$g75$.rebind(var20, var19);
        }
        module0540.f33510(var18);
        module0540.f33510(var17);
        module0540.f33510(var16);
        module0540.f33510(var15);
        module0540.f33510(var12);
        module0540.f33510(var11);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34284(final SubLObject var4, final SubLObject var23, final SubLObject var68, final SubLObject var20, final SubLObject var72, final SubLObject var21) {
        final SubLThread var73 = SubLProcess.currentSubLThread();
        final SubLObject var74 = reader.$read_default_float_format$.currentBinding(var73);
        try {
            reader.$read_default_float_format$.bind((SubLObject)$ic78$, var73);
            PrintLow.format(var4, (SubLObject)$ic79$);
            PrintLow.format(var4, (SubLObject)$ic80$);
            PrintLow.format(var4, (SubLObject)$ic81$, new SubLObject[] { module0155.f9773(), module0155.f9774(), module0018.f971() });
            if (NIL != var23) {
                PrintLow.format(var4, (SubLObject)$ic82$, var23);
            }
            PrintLow.format(var4, (SubLObject)$ic83$, var68);
            PrintLow.format(var4, (SubLObject)$ic84$, module0048.f3302(var20, (SubLObject)FOUR_INTEGER));
            PrintLow.format(var4, (SubLObject)$ic85$, module0048.f3302(var72, (SubLObject)FOUR_INTEGER));
            PrintLow.format(var4, (SubLObject)$ic86$, module0048.f3302(var21, (SubLObject)FOUR_INTEGER));
            if (NIL != var23) {
                PrintLow.format(var4, (SubLObject)$ic87$, module0048.f3302(Numbers.divide(var23, var21), (SubLObject)FOUR_INTEGER));
            }
            streams_high.terpri(var4);
            streams_high.force_output(var4);
        }
        finally {
            reader.$read_default_float_format$.rebind(var74, var73);
        }
        return var4;
    }
    
    public static SubLObject f34261(final SubLObject var4, final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        final SubLObject var11 = reader.$read_default_float_format$.currentBinding(var10);
        try {
            reader.$read_default_float_format$.bind((SubLObject)$ic78$, var10);
            PrintLow.format(var4, (SubLObject)$ic88$);
            PrintLow.format(var4, (SubLObject)$ic80$);
            PrintLow.format(var4, (SubLObject)$ic81$, new SubLObject[] { module0155.f9773(), module0155.f9774(), module0018.f971() });
            PrintLow.format(var4, (SubLObject)$ic89$, Mapping.mapcar((SubLObject)$ic90$, var9));
            PrintLow.format(var4, (SubLObject)$ic91$, Mapping.mapcar((SubLObject)$ic90$, Sort.sort(conses_high.copy_list(var9), Symbols.symbol_function((SubLObject)$ic92$), (SubLObject)UNPROVIDED)));
            PrintLow.format(var4, (SubLObject)$ic93$, Sequences.length(var9));
            PrintLow.format(var4, (SubLObject)$ic94$, module0048.f3306(module0048.f3382(var9, (SubLObject)UNPROVIDED)));
            PrintLow.format(var4, (SubLObject)$ic95$, module0048.f3306(module0048.f3381(var9, (SubLObject)UNPROVIDED)));
            PrintLow.format(var4, (SubLObject)$ic96$, module0048.f3306(module0048.f3387(var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
            PrintLow.format(var4, (SubLObject)$ic97$, module0048.f3306(module0048.f3384(var9)));
            PrintLow.format(var4, (SubLObject)$ic98$, module0048.f3306(module0048.f3401(var9)));
            streams_high.terpri(var4);
            streams_high.force_output(var4);
        }
        finally {
            reader.$read_default_float_format$.rebind(var11, var10);
        }
        return var4;
    }
    
    public static SubLObject f34289(SubLObject var108) {
        if (var108 == UNPROVIDED) {
            var108 = (SubLObject)NIL;
        }
        final SubLThread var109 = SubLProcess.currentSubLThread();
        f34254((SubLObject)THREE_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var110 = f34290(var108, $g4025$.getDynamicValue(var109));
        final SubLObject var111 = f34290(var108, $g4025$.getDynamicValue(var109));
        return module0076.f5290(var110, var111, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f34290(final SubLObject var108, final SubLObject var111) {
        final SubLThread var112 = SubLProcess.currentSubLThread();
        SubLObject var113 = (SubLObject)NIL;
        module0413.f28849();
        final SubLObject var114 = module0413.$g3371$.currentBinding(var112);
        final SubLObject var115 = module0018.$g631$.currentBinding(var112);
        try {
            module0413.$g3371$.bind((SubLObject)T, var112);
            module0018.$g631$.bind((SubLObject)NIL, var112);
            f34254((SubLObject)ZERO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0413.f28847();
        }
        finally {
            module0018.$g631$.rebind(var115, var112);
            module0413.$g3371$.rebind(var114, var112);
        }
        final SubLObject var116 = module0413.f28851(var108);
        final SubLObject var117 = module0413.f28856(var116);
        final SubLObject var119;
        final SubLObject var118 = var119 = var117;
        final SubLObject var120 = cdestructuring_bind.property_list_member((SubLObject)$ic99$, var119);
        final SubLObject var121 = (SubLObject)((NIL != var120) ? conses_high.cadr(var120) : NIL);
        final SubLObject var122 = cdestructuring_bind.property_list_member((SubLObject)$ic100$, var119);
        final SubLObject var123 = (SubLObject)((NIL != var122) ? conses_high.cadr(var122) : NIL);
        SubLObject var124 = var116;
        SubLObject var125 = (SubLObject)NIL;
        var125 = var124.first();
        while (NIL != var124) {
            final SubLObject var123_124;
            final SubLObject var121_122 = var123_124 = var125;
            final SubLObject var126 = cdestructuring_bind.property_list_member((SubLObject)$ic101$, var123_124);
            final SubLObject var127 = (SubLObject)((NIL != var126) ? conses_high.cadr(var126) : NIL);
            final SubLObject var128 = cdestructuring_bind.property_list_member((SubLObject)$ic102$, var123_124);
            final SubLObject var129 = (SubLObject)((NIL != var128) ? conses_high.cadr(var128) : NIL);
            final SubLObject var130 = cdestructuring_bind.property_list_member((SubLObject)$ic103$, var123_124);
            final SubLObject var131 = (SubLObject)((NIL != var130) ? conses_high.cadr(var130) : NIL);
            if (var131.isPositive()) {
                final SubLObject var132 = module0048.f3402(var129, var121, var123);
                if (var132.numG(var111)) {
                    var113 = (SubLObject)ConsesLow.cons(var127, var113);
                }
            }
            var124 = var124.rest();
            var125 = var124.first();
        }
        return Sequences.nreverse(var113);
    }
    
    public static SubLObject f34291(SubLObject var131, SubLObject var1, SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var131 == UNPROVIDED) {
            var131 = (SubLObject)TWO_INTEGER;
        }
        if (var1 == UNPROVIDED) {
            var1 = $g4022$.getGlobalValue();
        }
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)SEVEN_INTEGER;
        }
        if (var3 == UNPROVIDED) {
            var3 = $g4020$.getDynamicValue();
        }
        if (var4 == UNPROVIDED) {
            var4 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject var132 = Numbers.add(var1, var2);
        return f34292(var131, var132, var3, var4, var1);
    }
    
    public static SubLObject f34293(final SubLObject var132, SubLObject var1, SubLObject var2, SubLObject var4) {
        if (var1 == UNPROVIDED) {
            var1 = $g4022$.getGlobalValue();
        }
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)SEVEN_INTEGER;
        }
        if (var4 == UNPROVIDED) {
            var4 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread var133 = SubLProcess.currentSubLThread();
        SubLObject var134 = (SubLObject)NIL;
        SubLObject var135;
        SubLObject var136;
        SubLObject var137;
        SubLObject var138;
        for (var135 = module0048.f_1X(var132), var136 = (SubLObject)NIL, var136 = (SubLObject)ONE_INTEGER; !var136.numGE(var135); var136 = module0048.f_1X(var136)) {
            var137 = f34291(var136, var1, var2, $g4020$.getDynamicValue(var133), StreamsLow.$null_output$.getDynamicValue(var133));
            PrintLow.format(var4, (SubLObject)$ic105$, var136, module0048.f3306(var137));
            var134 = (SubLObject)ConsesLow.cons(var137, var134);
            var138 = Numbers.divide(var137, Numbers.divide(conses_high.last(var134, (SubLObject)UNPROVIDED).first(), var136));
            PrintLow.format(var4, (SubLObject)$ic106$, module0048.f3306(var138));
            streams_high.force_output(var4);
        }
        streams_high.terpri(var4);
        return Sequences.nreverse(var134);
    }
    
    public static SubLObject f34292(final SubLObject var136, final SubLObject var6, SubLObject var3, SubLObject var4, SubLObject var7) {
        if (var3 == UNPROVIDED) {
            var3 = $g4020$.getDynamicValue();
        }
        if (var4 == UNPROVIDED) {
            var4 = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)ZERO_INTEGER;
        }
        final SubLObject var137 = module0048.f3387(f34294(var136, var6, var3, var4, var7), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var138 = module0107.f7624();
        if (NIL != var138) {
            return Values.values(var137, Numbers.divide(var138, var137));
        }
        return var137;
    }
    
    public static SubLObject f34294(final SubLObject var136, final SubLObject var6, SubLObject var3, SubLObject var4, SubLObject var7) {
        if (var3 == UNPROVIDED) {
            var3 = $g4020$.getDynamicValue();
        }
        if (var4 == UNPROVIDED) {
            var4 = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)ZERO_INTEGER;
        }
        final SubLThread var137 = SubLProcess.currentSubLThread();
        assert NIL != module0004.f105(var136) : var136;
        assert NIL != module0004.f106(var6) : var6;
        assert NIL != module0004.f106(var3) : var3;
        SubLObject var138 = (SubLObject)NIL;
        var137.resetMultipleValues();
        final SubLObject var139 = f34257();
        final SubLObject var140 = var137.secondMultipleValue();
        final SubLObject var141 = var137.thirdMultipleValue();
        final SubLObject var142 = var137.fourthMultipleValue();
        final SubLObject var143 = var137.fifthMultipleValue();
        final SubLObject var144 = var137.sixthMultipleValue();
        final SubLObject var145 = var137.seventhMultipleValue();
        final SubLObject var146 = var137.eighthMultipleValue();
        var137.resetMultipleValues();
        try {
            SubLObject var147;
            SubLObject var148;
            SubLObject var149;
            for (var147 = (SubLObject)NIL, var147 = (SubLObject)ZERO_INTEGER; var147.numL(var6); var147 = Numbers.add(var147, (SubLObject)ONE_INTEGER)) {
                var148 = f34295(var136, var3, var139, var140, var142, var143, var144, var145, var146);
                var149 = f34296(var4, var136, var3, var148);
                if (var147.numGE(var7)) {
                    var138 = (SubLObject)ConsesLow.cons(var149, var138);
                }
            }
        }
        finally {
            final SubLObject var150 = Threads.$is_thread_performing_cleanupP$.currentBinding(var137);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var137);
                f34260(var139, var140, var141, var143, var144, var145, var146);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var150, var137);
            }
        }
        var138 = Sequences.nreverse(var138);
        if (var6.numG((SubLObject)ONE_INTEGER)) {
            f34297(var4, var136, var138);
        }
        return var138;
    }
    
    public static SubLObject f34295(final SubLObject var136, final SubLObject var3, final SubLObject var11, final SubLObject var12, final SubLObject var14, final SubLObject var15, final SubLObject var16, final SubLObject var17, final SubLObject var18) {
        Storage.gc_ephemeral();
        SubLObject var137 = (SubLObject)NIL;
        final SubLObject var138 = Time.get_internal_real_time();
        final SubLObject var139 = Semaphores.new_semaphore((SubLObject)$ic108$, (SubLObject)ZERO_INTEGER);
        SubLObject var140;
        SubLObject var141;
        for (var140 = (SubLObject)NIL, var140 = (SubLObject)ZERO_INTEGER; var140.numL(var136); var140 = Numbers.add(var140, (SubLObject)ONE_INTEGER)) {
            var141 = Sequences.cconcatenate((SubLObject)$ic109$, module0006.f203(var140));
            module0004.f78(var141, (SubLObject)$ic110$, (SubLObject)ConsesLow.list(new SubLObject[] { var140, var139, var3, var11, var12, var14, var15, var16, var17, var18 }));
        }
        for (var140 = (SubLObject)NIL, var140 = (SubLObject)ZERO_INTEGER; var140.numL(var136); var140 = Numbers.add(var140, (SubLObject)ONE_INTEGER)) {
            Semaphores.semaphore_wait(var139);
        }
        var137 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var138), time_high.$internal_time_units_per_second$.getGlobalValue());
        return var137;
    }
    
    public static SubLObject f34298(final SubLObject var139, final SubLObject var137, final SubLObject var3, final SubLObject var11, final SubLObject var12, final SubLObject var14, final SubLObject var15, final SubLObject var16, final SubLObject var17, final SubLObject var18) {
        try {
            f34272(var139, var3, var11, var12, var14, var15, var16, var17, var18);
        }
        finally {
            final SubLObject var140 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                Semaphores.semaphore_signal(var137);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var140);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34296(final SubLObject var4, final SubLObject var136, final SubLObject var3, final SubLObject var20) {
        final SubLObject var137 = Numbers.subtract(Numbers.expt((SubLObject)TWO_INTEGER, var3), (SubLObject)ONE_INTEGER);
        final SubLObject var138 = Numbers.divide(var20, var137);
        final SubLObject var139 = Numbers.invert(var138);
        final SubLObject var140 = module0107.f7624();
        f34299(var4, var136, var140, var137, var20, var138, var139);
        return var139;
    }
    
    public static SubLObject f34299(final SubLObject var4, final SubLObject var136, final SubLObject var23, final SubLObject var68, final SubLObject var20, final SubLObject var72, final SubLObject var21) {
        final SubLThread var137 = SubLProcess.currentSubLThread();
        final SubLObject var138 = reader.$read_default_float_format$.currentBinding(var137);
        try {
            reader.$read_default_float_format$.bind((SubLObject)$ic78$, var137);
            PrintLow.format(var4, (SubLObject)$ic111$);
            PrintLow.format(var4, (SubLObject)$ic80$);
            PrintLow.format(var4, (SubLObject)$ic81$, new SubLObject[] { module0155.f9773(), module0155.f9774(), module0018.f971() });
            PrintLow.format(var4, (SubLObject)$ic112$, var136);
            if (NIL != var23) {
                PrintLow.format(var4, (SubLObject)$ic82$, var23);
            }
            PrintLow.format(var4, (SubLObject)$ic83$, var68);
            PrintLow.format(var4, (SubLObject)$ic84$, module0048.f3302(var20, (SubLObject)FOUR_INTEGER));
            PrintLow.format(var4, (SubLObject)$ic85$, module0048.f3302(var72, (SubLObject)FOUR_INTEGER));
            PrintLow.format(var4, (SubLObject)$ic86$, module0048.f3302(var21, (SubLObject)FOUR_INTEGER));
            if (NIL != var23) {
                PrintLow.format(var4, (SubLObject)$ic87$, module0048.f3302(Numbers.divide(var23, var21), (SubLObject)FOUR_INTEGER));
            }
            streams_high.terpri(var4);
            streams_high.force_output(var4);
        }
        finally {
            reader.$read_default_float_format$.rebind(var138, var137);
        }
        return var4;
    }
    
    public static SubLObject f34297(final SubLObject var4, final SubLObject var136, final SubLObject var9) {
        final SubLThread var137 = SubLProcess.currentSubLThread();
        final SubLObject var138 = reader.$read_default_float_format$.currentBinding(var137);
        try {
            reader.$read_default_float_format$.bind((SubLObject)$ic78$, var137);
            PrintLow.format(var4, (SubLObject)$ic113$);
            PrintLow.format(var4, (SubLObject)$ic80$);
            PrintLow.format(var4, (SubLObject)$ic81$, new SubLObject[] { module0155.f9773(), module0155.f9774(), module0018.f971() });
            PrintLow.format(var4, (SubLObject)$ic112$, var136);
            PrintLow.format(var4, (SubLObject)$ic89$, Mapping.mapcar((SubLObject)$ic90$, var9));
            PrintLow.format(var4, (SubLObject)$ic91$, Mapping.mapcar((SubLObject)$ic90$, Sort.sort(conses_high.copy_list(var9), Symbols.symbol_function((SubLObject)$ic92$), (SubLObject)UNPROVIDED)));
            PrintLow.format(var4, (SubLObject)$ic93$, Sequences.length(var9));
            PrintLow.format(var4, (SubLObject)$ic94$, module0048.f3306(module0048.f3382(var9, (SubLObject)UNPROVIDED)));
            PrintLow.format(var4, (SubLObject)$ic95$, module0048.f3306(module0048.f3381(var9, (SubLObject)UNPROVIDED)));
            PrintLow.format(var4, (SubLObject)$ic96$, module0048.f3306(module0048.f3387(var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
            PrintLow.format(var4, (SubLObject)$ic97$, module0048.f3306(module0048.f3384(var9)));
            PrintLow.format(var4, (SubLObject)$ic98$, module0048.f3306(module0048.f3401(var9)));
            streams_high.terpri(var4);
            streams_high.force_output(var4);
        }
        finally {
            reader.$read_default_float_format$.rebind(var138, var137);
        }
        return var4;
    }
    
    public static SubLObject f34300(final SubLObject var140, final SubLObject var141, final SubLObject var142, final SubLObject var143, SubLObject var77) {
        if (var77 == UNPROVIDED) {
            var77 = (SubLObject)NIL;
        }
        final SubLThread var144 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var144) && !Numbers.multiply(var141, var141).numGE(var140)) {
            Errors.error((SubLObject)$ic114$);
        }
        SubLObject var145 = (SubLObject)NIL;
        var144.resetMultipleValues();
        final SubLObject var146 = f34301(var142, var141, var143);
        final SubLObject var147 = var144.secondMultipleValue();
        final SubLObject var148 = var144.thirdMultipleValue();
        var144.resetMultipleValues();
        try {
            final SubLObject var149 = Sequences.cconcatenate((SubLObject)$ic115$, new SubLObject[] { module0006.f205(var140), $ic116$ });
            final SubLObject var150 = Time.get_internal_real_time();
            module0012.$g82$.setDynamicValue(var149, var144);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var144);
            module0012.$g83$.setDynamicValue(var140, var144);
            module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var144);
            final SubLObject var151 = module0012.$g75$.currentBinding(var144);
            final SubLObject var152 = module0012.$g76$.currentBinding(var144);
            final SubLObject var153 = module0012.$g77$.currentBinding(var144);
            final SubLObject var154 = module0012.$g78$.currentBinding(var144);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var144);
                module0012.$g76$.bind((SubLObject)NIL, var144);
                module0012.$g77$.bind((SubLObject)T, var144);
                module0012.$g78$.bind(Time.get_universal_time(), var144);
                module0012.f478(module0012.$g82$.getDynamicValue(var144));
                SubLObject var155;
                SubLObject var156;
                SubLObject var157;
                SubLObject var158;
                SubLObject var159;
                SubLObject var160;
                SubLObject var161;
                SubLObject var162;
                SubLObject var163;
                for (var155 = (SubLObject)NIL, var155 = (SubLObject)ZERO_INTEGER; var155.numL(module0012.$g83$.getDynamicValue(var144)); var155 = Numbers.add(var155, (SubLObject)ONE_INTEGER)) {
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var144), module0012.$g83$.getDynamicValue(var144));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var144), (SubLObject)ONE_INTEGER), var144);
                    var156 = Numbers.mod(var155, var142);
                    var157 = Numbers.integerDivide(var155, var141);
                    var158 = Numbers.mod(var155, var141);
                    var159 = Numbers.mod(var155, var143);
                    var160 = Vectors.aref(var146, var156);
                    var161 = Vectors.aref(var147, var157);
                    var162 = Vectors.aref(var147, var158);
                    var163 = Vectors.aref(var148, var159);
                    f34302(var160, var161, var162, var163, var77);
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var154, var144);
                module0012.$g77$.rebind(var153, var144);
                module0012.$g76$.rebind(var152, var144);
                module0012.$g75$.rebind(var151, var144);
            }
            var145 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var150), time_high.$internal_time_units_per_second$.getGlobalValue());
        }
        finally {
            final SubLObject var164 = Threads.$is_thread_performing_cleanupP$.currentBinding(var144);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var144);
                f34303(var146, var147, var148);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var164, var144);
            }
        }
        return var145;
    }
    
    public static SubLObject f34301(final SubLObject var142, final SubLObject var141, final SubLObject var143) {
        final SubLObject var144 = Vectors.make_vector(var142, (SubLObject)UNPROVIDED);
        final SubLObject var145 = Vectors.make_vector(var141, (SubLObject)UNPROVIDED);
        final SubLObject var146 = Vectors.make_vector(var143, (SubLObject)UNPROVIDED);
        SubLObject var147;
        SubLObject var148;
        SubLObject var149;
        for (var147 = (SubLObject)NIL, var147 = (SubLObject)ZERO_INTEGER; var147.numL(var142); var147 = Numbers.add(var147, (SubLObject)ONE_INTEGER)) {
            var148 = Sequences.cconcatenate((SubLObject)$ic117$, module0006.f203(var147));
            var149 = module0540.f33504(var148);
            module0540.f33517((SubLObject)ConsesLow.listS($ic9$, var149, (SubLObject)$ic31$), $ic118$, (SubLObject)UNPROVIDED);
            Vectors.set_aref(var144, var147, var149);
        }
        SubLObject var150;
        for (var147 = (SubLObject)NIL, var147 = (SubLObject)ZERO_INTEGER; var147.numL(var141); var147 = Numbers.add(var147, (SubLObject)ONE_INTEGER)) {
            var148 = Sequences.cconcatenate((SubLObject)$ic119$, module0006.f203(var147));
            var150 = module0540.f33504(var148);
            module0540.f33517((SubLObject)ConsesLow.listS($ic9$, var150, (SubLObject)$ic56$), $ic118$, (SubLObject)UNPROVIDED);
            Vectors.set_aref(var145, var147, var150);
        }
        SubLObject var151;
        for (var147 = (SubLObject)NIL, var147 = (SubLObject)ZERO_INTEGER; var147.numL(var143); var147 = Numbers.add(var147, (SubLObject)ONE_INTEGER)) {
            var148 = Sequences.cconcatenate((SubLObject)$ic120$, module0006.f203(var147));
            var151 = module0540.f33504(var148);
            module0540.f33517((SubLObject)ConsesLow.listS($ic9$, var151, (SubLObject)$ic10$), $ic118$, (SubLObject)UNPROVIDED);
            Vectors.set_aref(var146, var147, var151);
        }
        return Values.values(var144, var145, var146);
    }
    
    public static SubLObject f34303(final SubLObject var144, final SubLObject var69, final SubLObject var145) {
        SubLObject var146 = (SubLObject)NIL;
        SubLObject var147;
        SubLObject var148;
        SubLObject var149;
        SubLObject var150;
        for (var147 = Sequences.length(var69), var148 = (SubLObject)NIL, var148 = (SubLObject)ZERO_INTEGER; var148.numL(var147); var148 = Numbers.add(var148, (SubLObject)ONE_INTEGER)) {
            var149 = ((NIL != var146) ? Numbers.subtract(var147, var148, (SubLObject)ONE_INTEGER) : var148);
            var150 = Vectors.aref(var69, var149);
            module0540.f33510(var150);
        }
        var146 = (SubLObject)NIL;
        SubLObject var151;
        for (var147 = Sequences.length(var144), var148 = (SubLObject)NIL, var148 = (SubLObject)ZERO_INTEGER; var148.numL(var147); var148 = Numbers.add(var148, (SubLObject)ONE_INTEGER)) {
            var149 = ((NIL != var146) ? Numbers.subtract(var147, var148, (SubLObject)ONE_INTEGER) : var148);
            var151 = Vectors.aref(var144, var149);
            module0540.f33510(var151);
        }
        var146 = (SubLObject)NIL;
        SubLObject var152;
        for (var147 = Sequences.length(var145), var148 = (SubLObject)NIL, var148 = (SubLObject)ZERO_INTEGER; var148.numL(var147); var148 = Numbers.add(var148, (SubLObject)ONE_INTEGER)) {
            var149 = ((NIL != var146) ? Numbers.subtract(var147, var148, (SubLObject)ONE_INTEGER) : var148);
            var152 = Vectors.aref(var145, var149);
            module0540.f33510(var152);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34302(final SubLObject var151, final SubLObject var152, final SubLObject var153, final SubLObject var96, final SubLObject var77) {
        final SubLThread var154 = SubLProcess.currentSubLThread();
        final SubLObject var155 = cdestructuring_bind.property_list_member((SubLObject)$ic121$, var77);
        final SubLObject var156 = (SubLObject)((NIL != var155) ? conses_high.cadr(var155) : NIL);
        final SubLObject var157 = cdestructuring_bind.property_list_member((SubLObject)$ic122$, var77);
        final SubLObject var158 = (SubLObject)((NIL != var157) ? conses_high.cadr(var157) : NIL);
        final SubLObject var159 = (SubLObject)ConsesLow.list(var151, var152, var153);
        final SubLObject var160 = module0131.$g1531$.currentBinding(var154);
        try {
            module0131.$g1531$.bind((SubLObject)makeBoolean(NIL == var158), var154);
            if (NIL != var156) {
                module0540.f33517(var159, var96, (SubLObject)UNPROVIDED);
            }
            else {
                module0540.f33516(var159, var96, (SubLObject)UNPROVIDED);
            }
        }
        finally {
            module0131.$g1531$.rebind(var160, var154);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34304(final SubLObject var3, SubLObject var166) {
        if (var166 == UNPROVIDED) {
            var166 = (SubLObject)FIVE_INTEGER;
        }
        SubLObject var167 = (SubLObject)NIL;
        SubLObject var168;
        for (var168 = (SubLObject)NIL, var168 = (SubLObject)ZERO_INTEGER; var168.numL(var166); var168 = Numbers.add(var168, (SubLObject)ONE_INTEGER)) {
            var167 = (SubLObject)ConsesLow.cons(f34262(var3, (SubLObject)UNPROVIDED), var167);
        }
        var167 = Sort.sort(var167, Symbols.symbol_function((SubLObject)$ic92$), (SubLObject)UNPROVIDED);
        var167 = conses_high.ldiff(var167.rest(), conses_high.last(var167, (SubLObject)UNPROVIDED));
        return module0048.f3384(var167);
    }
    
    public static SubLObject f34305() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0557", "f34254", "BENCHMARK-CYCLOPS-COMPENSATING-FOR-PAGING", 0, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0557", "f34256", "S#37506", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0557", "f34262", "S#37507", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0557", "f34255", "S#37508", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0557", "f34263", "S#37509", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0557", "f34264", "S#37510", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0557", "f34257", "S#37511", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0557", "f34258", "S#37512", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0557", "f34272", "S#37513", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0557", "f34260", "S#37514", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0557", "f34259", "S#37515", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0557", "f34265", "S#37516", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0557", "f34266", "S#37517", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0557", "f34267", "S#37518", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0557", "f34268", "S#37519", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0557", "f34269", "S#37520", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0557", "f34270", "S#37521", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0557", "f34271", "S#37522", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0557", "f34285", "S#37523", 5, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0557", "f34286", "S#37524");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0557", "f34273", "S#37525", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0557", "f34287", "S#37526", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0557", "f34274", "S#37527", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0557", "f34275", "S#37528", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0557", "f34288", "S#37529", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0557", "f34276", "S#37530", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0557", "f34277", "S#37531", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0557", "f34278", "S#37532", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0557", "f34279", "S#37533", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0557", "f34280", "S#37534", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0557", "f34281", "S#37535", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0557", "f34282", "S#37536", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0557", "f34283", "S#37537", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0557", "f34284", "S#37538", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0557", "f34261", "S#37539", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0557", "f34289", "S#37540", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0557", "f34290", "S#37541", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0557", "f34291", "BENCHMARK-PARALLEL-CYCLOPS-COMPENSATING-FOR-PAGING", 0, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0557", "f34293", "S#37542", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0557", "f34292", "S#37543", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0557", "f34294", "S#37544", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0557", "f34295", "S#37545", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0557", "f34298", "S#37546", 10, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0557", "f34296", "S#37547", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0557", "f34299", "S#37548", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0557", "f34297", "S#37549", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0557", "f34300", "S#37550", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0557", "f34301", "S#37551", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0557", "f34303", "S#37552", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0557", "f34302", "S#37553", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0557", "f34304", "S#37554", 1, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34306() {
        $g4018$ = SubLFiles.defvar("S#37555", (SubLObject)NIL);
        $g4019$ = SubLFiles.defparameter("S#37556", (SubLObject)T);
        $g4020$ = SubLFiles.defvar("S#37557", (SubLObject)SIX_INTEGER);
        $g4021$ = SubLFiles.defvar("S#37558", $ic0$);
        $g4022$ = SubLFiles.deflexical("S#37559", (SubLObject)$ic1$);
        $g4023$ = SubLFiles.defparameter("*CYCLOPS-LOCKED?*", (SubLObject)NIL);
        $g4024$ = SubLFiles.deflexical("S#37560", (NIL != Symbols.boundp((SubLObject)$ic49$)) ? $g4024$.getGlobalValue() : Locks.make_lock((SubLObject)$ic50$));
        $g4025$ = SubLFiles.defparameter("S#37561", (SubLObject)TWO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34307() {
        module0002.f38((SubLObject)$ic2$);
        module0002.f38((SubLObject)$ic48$);
        module0003.f57((SubLObject)$ic49$);
        module0002.f38((SubLObject)$ic104$);
        module0002.f35((SubLObject)$ic123$, (SubLObject)$ic124$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f34305();
    }
    
    public void initializeVariables() {
        f34306();
    }
    
    public void runTopLevelForms() {
        f34307();
    }
    
    static {
        me = (SubLFile)new module0557();
        $g4018$ = null;
        $g4019$ = null;
        $g4020$ = null;
        $g4021$ = null;
        $g4022$ = null;
        $g4023$ = null;
        $g4024$ = null;
        $g4025$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("Individual"));
        $ic1$ = makeInteger(33);
        $ic2$ = makeSymbol("BENCHMARK-CYCLOPS-COMPENSATING-FOR-PAGING");
        $ic3$ = makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic4$ = makeKeyword("LENIENT");
        $ic5$ = makeKeyword("NONE");
        $ic6$ = makeSymbol("S#690", "CYC");
        $ic7$ = makeString("Mt-1");
        $ic8$ = makeString("Mt-2");
        $ic9$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic10$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Microtheory")));
        $ic11$ = constant_handles_oc.f8479((SubLObject)makeString("BaseKB"));
        $ic12$ = ConsesLow.list((SubLObject)makeKeyword("STRENGTH"), (SubLObject)makeKeyword("MONOTONIC"), (SubLObject)makeKeyword("DIRECTION"), (SubLObject)makeKeyword("FORWARD"));
        $ic13$ = constant_handles_oc.f8479((SubLObject)makeString("genlMt"));
        $ic14$ = makeString("Creating collection ontology");
        $ic15$ = makeInteger(25);
        $ic16$ = makeString("Col-");
        $ic17$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Collection")));
        $ic18$ = constant_handles_oc.f8479((SubLObject)makeString("genls"));
        $ic19$ = makeString("parent");
        $ic20$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("IrreflexiveBinaryPredicate")));
        $ic21$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("AsymmetricBinaryPredicate")));
        $ic22$ = constant_handles_oc.f8479((SubLObject)makeString("arg1Isa"));
        $ic23$ = constant_handles_oc.f8479((SubLObject)makeString("arg2Isa"));
        $ic24$ = makeString("ancestor");
        $ic25$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ReflexiveBinaryPredicate")));
        $ic26$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("AntiSymmetricBinaryPredicate")));
        $ic27$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TransitiveBinaryPredicate")));
        $ic28$ = makeString("sibling");
        $ic29$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("SymmetricBinaryPredicate")));
        $ic30$ = makeString("family");
        $ic31$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("BinaryPredicate")));
        $ic32$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Integer")));
        $ic33$ = constant_handles_oc.f8479((SubLObject)makeString("genlPreds"));
        $ic34$ = makeKeyword("BACKWARD");
        $ic35$ = makeKeyword("STRENGTH");
        $ic36$ = makeKeyword("MONOTONIC");
        $ic37$ = makeKeyword("DIRECTION");
        $ic38$ = constant_handles_oc.f8479((SubLObject)makeString("implies"));
        $ic39$ = constant_handles_oc.f8479((SubLObject)makeString("and"));
        $ic40$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("different")), (SubLObject)makeSymbol("?CHILD-1"), (SubLObject)makeSymbol("?CHILD-2"));
        $ic41$ = makeSymbol("?PARENT");
        $ic42$ = ConsesLow.list((SubLObject)makeSymbol("?CHILD-1"), (SubLObject)makeSymbol("?PARENT"));
        $ic43$ = ConsesLow.list((SubLObject)makeSymbol("?CHILD-2"), (SubLObject)makeSymbol("?PARENT"));
        $ic44$ = ConsesLow.list((SubLObject)makeSymbol("?CHILD-1"), (SubLObject)makeSymbol("?CHILD-2"));
        $ic45$ = constant_handles_oc.f8479((SubLObject)makeString("different"));
        $ic46$ = makeSymbol("?CHILD-1");
        $ic47$ = makeSymbol("?CHILD-2");
        $ic48$ = makeSymbol("*CYCLOPS-LOCKED?*");
        $ic49$ = makeSymbol("S#37560", "CYC");
        $ic50$ = makeString("CycLOPs lock");
        $ic51$ = makeSymbol("PIF");
        $ic52$ = makeSymbol("WITH-LOCK-HELD");
        $ic53$ = ConsesLow.list((SubLObject)makeSymbol("S#37560", "CYC"));
        $ic54$ = makeSymbol("PROGN");
        $ic55$ = makeString("Creating terms");
        $ic56$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Individual")));
        $ic57$ = makeSymbol("VECTOR");
        $ic58$ = makeString("Term-");
        $ic59$ = makeString("-");
        $ic60$ = makeString("Asserting family links");
        $ic61$ = makeString("Asserting parent links");
        $ic62$ = makeSymbol("WARN");
        $ic63$ = makeSymbol("ERROR");
        $ic64$ = makeString("Asking parent links");
        $ic65$ = ConsesLow.list((SubLObject)makeSymbol("?PARENT"));
        $ic66$ = makeString("CycLOPs error asking parent ~S");
        $ic67$ = makeString("Asking ancestor links");
        $ic68$ = ConsesLow.list((SubLObject)makeSymbol("?ANCEST"));
        $ic69$ = makeString("CycLOPs error: asking ancestor ~S");
        $ic70$ = makeString("Asking sibling links");
        $ic71$ = ConsesLow.list((SubLObject)makeSymbol("?SIBLING"));
        $ic72$ = ConsesLow.list((SubLObject)makeKeyword("MAX-TRANSFORMATION-DEPTH"), (SubLObject)ONE_INTEGER);
        $ic73$ = makeString("CycLOPs error: asking sibling ~S via rule");
        $ic74$ = makeKeyword("FORWARD");
        $ic75$ = makeString("CycLOPs error: asking sibling ~S");
        $ic76$ = makeString("Killing terms");
        $ic77$ = makeString("Killing collections");
        $ic78$ = makeSymbol("DOUBLE-FLOAT");
        $ic79$ = makeString("~%CycLOPs Benchmark Results");
        $ic80$ = makeString("~%========================================");
        $ic81$ = makeString("~%System ~S.~S KB ~S");
        $ic82$ = makeString("~%Bogomips :~% ~S");
        $ic83$ = makeString("~%Scaling factor :~% ~S");
        $ic84$ = makeString("~%Elapsed time (seconds) :~% ~S");
        $ic85$ = makeString("~%Efficiency (seconds/op) :~% ~S");
        $ic86$ = makeString("~%CycLOPs :~% ~S");
        $ic87$ = makeString("~%Bogomips/CycLOPs : ~% ~S");
        $ic88$ = makeString("~%CycLOPs Benchmark Statistical Summary");
        $ic89$ = makeString("~%Raw Data :~% ~S");
        $ic90$ = makeSymbol("S#4698", "CYC");
        $ic91$ = makeString("~%Sorted Data :~% ~S");
        $ic92$ = makeSymbol("<");
        $ic93$ = makeString("~%N :~% ~S");
        $ic94$ = makeString("~%Min :~% ~S");
        $ic95$ = makeString("~%Max :~% ~S");
        $ic96$ = makeString("~%Median :~% ~S");
        $ic97$ = makeString("~%Mean :~% ~S");
        $ic98$ = makeString("~%Standard Deviation :~% ~S");
        $ic99$ = makeKeyword("AVERAGE-TIME-PER-RULE");
        $ic100$ = makeKeyword("STDEV-TIME-PER-RULE");
        $ic101$ = makeKeyword("RULE");
        $ic102$ = makeKeyword("TIME");
        $ic103$ = makeKeyword("INFERENCE-COUNT");
        $ic104$ = makeSymbol("BENCHMARK-PARALLEL-CYCLOPS-COMPENSATING-FOR-PAGING");
        $ic105$ = makeString("~%~S = ~S");
        $ic106$ = makeString("  eff = ~S");
        $ic107$ = makeSymbol("POSITIVE-INTEGER-P");
        $ic108$ = makeString("Parallel CycLOPs");
        $ic109$ = makeString("Parallel CycLOPs thread ");
        $ic110$ = makeSymbol("S#37546", "CYC");
        $ic111$ = makeString("~%Parallel CycLOPs Benchmark Results");
        $ic112$ = makeString("~%Parallelism    :~% ~S");
        $ic113$ = makeString("~%Parallel CycLOPs Benchmark Statistical Summary");
        $ic114$ = makeString("Not enough terms provided");
        $ic115$ = makeString("Asserting ");
        $ic116$ = makeString(" GAFs");
        $ic117$ = makeString("mAB-P-");
        $ic118$ = constant_handles_oc.f8479((SubLObject)makeString("UniversalVocabularyMt"));
        $ic119$ = makeString("MAB-T-");
        $ic120$ = makeString("MAB-M-");
        $ic121$ = makeKeyword("ASSUME-WFF?");
        $ic122$ = makeKeyword("DISABLE-FORWARD?");
        $ic123$ = makeSymbol("S#37554", "CYC");
        $ic124$ = ConsesLow.list((SubLObject)makeSymbol("BENCHMARK-CYCLOPS-COMPENSATING-FOR-PAGING"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 494 ms
	
	Decompiled with Procyon 0.5.32.
*/