package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0528 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0528";
    public static final String myFingerPrint = "7846b7b507eaece45c0b5011330e2f2f7e58b703ce4110f2ac8b538bcdce20bc";
    public static SubLSymbol $g3873$;
    public static SubLSymbol $g3874$;
    public static SubLSymbol $g3875$;
    private static SubLSymbol $g3876$;
    public static SubLSymbol $g3877$;
    public static SubLSymbol $g2982$;
    public static SubLSymbol $g3878$;
    private static SubLSymbol $g3879$;
    private static SubLSymbol $g3880$;
    private static SubLSymbol $g3881$;
    private static SubLSymbol $g3882$;
    private static SubLSymbol $g3883$;
    public static SubLSymbol $g3884$;
    private static SubLSymbol $g3885$;
    private static SubLSymbol $g3886$;
    private static SubLSymbol $g3887$;
    private static SubLSymbol $g3888$;
    public static SubLSymbol $g3889$;
    private static SubLSymbol $g3890$;
    public static SubLSymbol $g3891$;
    public static SubLSymbol $g3892$;
    public static SubLSymbol $g3893$;
    private static SubLSymbol $g3894$;
    private static SubLSymbol $g3895$;
    private static SubLSymbol $g3896$;
    public static SubLSymbol $g3897$;
    private static final SubLSymbol $ic0$;
    private static final SubLString $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLString $ic10$;
    private static final SubLString $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLObject $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLString $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLString $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLString $ic23$;
    private static final SubLString $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLList $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLObject $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLObject $ic32$;
    private static final SubLList $ic33$;
    private static final SubLObject $ic34$;
    private static final SubLObject $ic35$;
    private static final SubLObject $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLString $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLString $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLList $ic65$;
    private static final SubLList $ic66$;
    private static final SubLList $ic67$;
    private static final SubLList $ic68$;
    private static final SubLString $ic69$;
    private static final SubLList $ic70$;
    private static final SubLList $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLObject $ic76$;
    private static final SubLObject $ic77$;
    private static final SubLObject $ic78$;
    private static final SubLObject $ic79$;
    private static final SubLObject $ic80$;
    private static final SubLObject $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLList $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLList $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    
    public static SubLObject f32897() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0131.$g1538$.getDynamicValue(var1);
    }
    
    public static SubLObject f32898() {
        return f32899();
    }
    
    public static SubLObject f32900(final SubLObject var2) {
        return (SubLObject)module0528.NIL;
    }
    
    public static SubLObject f32901(final SubLObject var2) {
        return module0055.f4018(var2);
    }
    
    public static SubLObject f32899() {
        return module0055.f4017();
    }
    
    public static SubLObject f32902(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = module0528.$g3879$.getGlobalValue();
        SubLObject var6 = (SubLObject)module0528.NIL;
        try {
            var6 = Locks.seize_lock(var5);
            return module0055.f4021(var3, module0528.$g3880$.getDynamicValue(var4));
        }
        finally {
            if (module0528.NIL != var6) {
                Locks.release_lock(var5);
            }
        }
    }
    
    public static SubLObject f32903() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = module0528.$g3879$.getGlobalValue();
        SubLObject var3 = (SubLObject)module0528.NIL;
        try {
            var3 = Locks.seize_lock(var2);
            return module0055.f4023(module0528.$g3880$.getDynamicValue(var1));
        }
        finally {
            if (module0528.NIL != var3) {
                Locks.release_lock(var2);
            }
        }
    }
    
    public static SubLObject f32904() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = module0528.$g3879$.getGlobalValue();
        SubLObject var3 = (SubLObject)module0528.NIL;
        try {
            var3 = Locks.seize_lock(var2);
            return module0055.f4019(module0528.$g3880$.getDynamicValue(var1));
        }
        finally {
            if (module0528.NIL != var3) {
                Locks.release_lock(var2);
            }
        }
    }
    
    public static SubLObject f32905() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        SubLObject var2 = (SubLObject)module0528.NIL;
        final SubLObject var3 = module0528.$g3879$.getGlobalValue();
        SubLObject var4 = (SubLObject)module0528.NIL;
        try {
            var4 = Locks.seize_lock(var3);
            var2 = module0055.f4016(module0528.$g3880$.getDynamicValue(var1));
            module0055.f4018(module0528.$g3880$.getDynamicValue(var1));
        }
        finally {
            if (module0528.NIL != var4) {
                Locks.release_lock(var3);
            }
        }
        return var2;
    }
    
    public static SubLObject f32906(final SubLObject var13, final SubLObject var2) {
        SubLObject var15;
        final SubLObject var14 = var15 = var13.rest();
        SubLObject var16 = (SubLObject)module0528.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)module0528.$ic3$);
        var16 = var15.first();
        final SubLObject var17;
        var15 = (var17 = var15.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0528.$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0528.$ic5$, var16)), ConsesLow.append(var17, (SubLObject)module0528.NIL));
    }
    
    public static SubLObject f32907(final SubLObject var13, final SubLObject var2) {
        SubLObject var15;
        final SubLObject var14 = var15 = var13.rest();
        SubLObject var16 = (SubLObject)module0528.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)module0528.$ic6$);
        var16 = var15.first();
        final SubLObject var17;
        var15 = (var17 = var15.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0528.$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0528.$ic7$, var16)), ConsesLow.append(var17, (SubLObject)module0528.NIL));
    }
    
    public static SubLObject f32908() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0528.$g3881$.getDynamicValue(var1);
    }
    
    public static SubLObject f32909() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0528.$g3882$.getDynamicValue(var1);
    }
    
    public static SubLObject f32910() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return (module0528.NIL != module0528.$g3881$.getDynamicValue(var1)) ? module0528.$g3881$.getDynamicValue(var1) : module0528.$g3882$.getDynamicValue(var1);
    }
    
    public static SubLObject f32911() {
        module0413.f28751();
        return module0361.f24136(module0528.$g3883$.getGlobalValue());
    }
    
    public static SubLObject f32912(final SubLObject var21) {
        module0413.f28766(var21);
        module0413.f28757(var21);
        return module0361.f24005(var21);
    }
    
    public static SubLObject f32913() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0528.$g3884$.getDynamicValue(var1);
    }
    
    public static SubLObject f32914() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        SubLObject var2 = (SubLObject)((module0528.NIL != f32913()) ? module0012.$g59$.getDynamicValue(var1) : module0528.NIL);
        if (module0528.NIL == var2) {
            var2 = f32911();
            if (module0528.NIL != f32913()) {
                module0012.$g59$.setDynamicValue(var2, var1);
            }
        }
        return var2;
    }
    
    public static SubLObject f32915() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        if (module0528.NIL != module0012.$g59$.getDynamicValue(var1)) {
            try {
                if (module0528.NIL == module0018.f957()) {
                    f32912(module0012.$g59$.getDynamicValue(var1));
                }
            }
            finally {
                final SubLObject var2 = Threads.$is_thread_performing_cleanupP$.currentBinding(var1);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0528.T, var1);
                    module0012.$g59$.setDynamicValue((SubLObject)module0528.NIL, var1);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var2, var1);
                }
            }
        }
        return (SubLObject)module0528.NIL;
    }
    
    public static SubLObject f32916() {
        return f32901(f32897());
    }
    
    public static SubLObject f32917(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        assert module0528.NIL != module0174.f11035(var3) : var3;
        if (module0528.NIL != module0131.$g1531$.getDynamicValue(var4)) {
            final SubLObject var5 = f32897();
            if (module0528.NIL != module0107.f7629(var5)) {
                module0055.f4021(var3, var5);
            }
            else {
                f32902(var3);
            }
            if (module0528.NIL != module0528.$g3877$.getDynamicValue(var4)) {
                PrintLow.format((SubLObject)module0528.T, (SubLObject)module0528.$ic10$, var3);
            }
        }
        return var3;
    }
    
    public static SubLObject f32918(final SubLObject var3) {
        assert module0528.NIL != module0174.f11035(var3) : var3;
        final SubLObject var4 = f32897();
        if (module0528.NIL != module0107.f7629(var4)) {
            return module0055.f4026(var3, var4, (SubLObject)module0528.UNPROVIDED);
        }
        return (SubLObject)module0528.NIL;
    }
    
    public static SubLObject f32919(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0528.NIL != module0055.f4006(var2) && var2.eql(module0528.$g3886$.getDynamicValue(var3)));
    }
    
    public static SubLObject f32920() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = module0528.$g3886$.currentBinding(var1);
        try {
            module0528.$g3886$.bind((SubLObject)module0528.NIL, var1);
            return f32921();
        }
        finally {
            module0528.$g3886$.rebind(var2, var1);
        }
    }
    
    public static SubLObject f32921() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        SubLObject var2 = (SubLObject)module0528.NIL;
        if (module0528.NIL != module0131.$g1531$.getDynamicValue(var1)) {
            final SubLObject var3 = module0012.$g59$.currentBinding(var1);
            try {
                module0012.$g59$.bind((SubLObject)module0528.NIL, var1);
                try {
                    final SubLObject var22_23 = module0528.$g3885$.currentBinding(var1);
                    try {
                        module0528.$g3885$.bind(module0048.f_1X(module0528.$g3885$.getDynamicValue(var1)), var1);
                        if (module0528.NIL != module0018.$g629$.getDynamicValue(var1) && module0528.$g3885$.getDynamicValue(var1).numGE((SubLObject)module0528.TWENTY_INTEGER)) {
                            Errors.sublisp_break((SubLObject)module0528.$ic11$, new SubLObject[] { module0528.$g3885$.getDynamicValue(var1) });
                        }
                        SubLObject var5;
                        for (SubLObject var4 = (SubLObject)module0528.NIL; module0528.NIL == var4; var4 = (SubLObject)SubLObjectFactory.makeBoolean(module0528.NIL == f32925(var5))) {
                            var5 = f32897();
                            if (module0528.NIL != f32922(var5)) {
                                final SubLObject var22_24 = module0528.$g3886$.currentBinding(var1);
                                try {
                                    module0528.$g3886$.bind(var5, var1);
                                    if (module0528.NIL != module0107.f7629(var5)) {
                                        while (module0528.NIL == module0055.f4019(var5)) {
                                            final SubLObject var6 = module0055.f4023(var5);
                                            final SubLObject var7 = f32923(var6, (SubLObject)module0528.UNPROVIDED);
                                            var2 = ConsesLow.nconc(Sequences.nreverse(var7), var2);
                                        }
                                    }
                                }
                                finally {
                                    module0528.$g3886$.rebind(var22_24, var1);
                                }
                            }
                            if (module0528.NIL != f32924()) {
                                final SubLObject var22_25 = module0528.$g3887$.currentBinding(var1);
                                try {
                                    module0528.$g3887$.bind((SubLObject)module0528.T, var1);
                                    for (SubLObject var8 = f32903(); module0528.NIL != var8; var8 = f32903()) {
                                        final SubLObject var7 = f32923(var8, (SubLObject)module0528.UNPROVIDED);
                                        var2 = ConsesLow.nconc(Sequences.nreverse(var7), var2);
                                    }
                                }
                                finally {
                                    module0528.$g3887$.rebind(var22_25, var1);
                                }
                            }
                        }
                    }
                    finally {
                        module0528.$g3885$.rebind(var22_23, var1);
                    }
                }
                finally {
                    final SubLObject var22_26 = Threads.$is_thread_performing_cleanupP$.currentBinding(var1);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0528.T, var1);
                        f32915();
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var22_26, var1);
                    }
                }
            }
            finally {
                module0012.$g59$.rebind(var3, var1);
            }
        }
        return Sequences.nreverse(var2);
    }
    
    public static SubLObject f32922(final SubLObject var2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0528.NIL != module0107.f7629(var2) && module0528.NIL == f32919(var2) && module0528.NIL == module0055.f4019(var2));
    }
    
    public static SubLObject f32924() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0528.NIL != module0107.f7629(module0528.$g3880$.getDynamicValue(var1)) && module0528.NIL == module0528.$g3887$.getDynamicValue(var1) && module0528.NIL == f32904());
    }
    
    public static SubLObject f32925(final SubLObject var2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0528.NIL != f32922(var2) || module0528.NIL != f32924());
    }
    
    public static SubLObject f32926(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        assert module0528.NIL != module0174.f11035(var3) : var3;
        if (module0528.NIL != module0131.$g1531$.getDynamicValue(var4) && module0528.NIL != module0178.f11314(var3)) {
            final SubLObject var5 = module0012.f460();
            assert module0528.NIL != module0055.f4006(var5) : var5;
            final SubLObject var6 = module0131.$g1538$.currentBinding(var4);
            try {
                module0131.$g1538$.bind(var5, var4);
                f32917(var3);
                return f32921();
            }
            finally {
                module0131.$g1538$.rebind(var6, var4);
            }
        }
        return (SubLObject)module0528.NIL;
    }
    
    public static SubLObject f32927(final SubLObject var31, final SubLObject var20) {
        final SubLThread var32 = SubLProcess.currentSubLThread();
        assert module0528.NIL != module0178.f11284(var31) : var31;
        assert module0528.NIL != module0178.f11290(var20) : var20;
        SubLObject var33 = (SubLObject)module0528.NIL;
        final SubLObject var34 = module0131.$g1537$.currentBinding(var32);
        try {
            module0131.$g1537$.bind((SubLObject)ConsesLow.list(var20), var32);
            var33 = f32926(var31);
        }
        finally {
            module0131.$g1537$.rebind(var34, var32);
        }
        return var33;
    }
    
    public static SubLObject f32928() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0528.$g3888$.getDynamicValue(var1);
    }
    
    public static SubLObject f32929(final SubLObject var32) {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        module0055.f4021(var32, module0528.$g3888$.getDynamicValue(var33));
        return (SubLObject)module0528.NIL;
    }
    
    public static SubLObject f32923(final SubLObject var3, SubLObject var33) {
        if (var33 == module0528.UNPROVIDED) {
            var33 = module0528.$ic15$;
        }
        if (module0528.NIL == module0342.f23104(var3)) {
            return f32930(var3, var33, (SubLObject)module0528.T);
        }
        return (SubLObject)module0528.NIL;
    }
    
    public static SubLObject f32930(final SubLObject var3, final SubLObject var33, final SubLObject var34) {
        if (module0528.NIL != f32931(var3, var33)) {
            return f32932(var3, var33, var34);
        }
        return (SubLObject)module0528.NIL;
    }
    
    public static SubLObject f32931(final SubLObject var3, final SubLObject var33) {
        final SubLThread var34 = SubLProcess.currentSubLThread();
        if (module0528.NIL != module0131.$g1531$.getDynamicValue(var34) && module0528.NIL != module0178.f11361(var3, (SubLObject)module0528.UNPROVIDED) && (!module0528.$ic15$.equal(var33) || module0528.NIL != module0178.f11314(var3))) {
            return (SubLObject)module0528.T;
        }
        return (SubLObject)module0528.NIL;
    }
    
    public static SubLObject f32932(final SubLObject var16, SubLObject var33, SubLObject var34) {
        if (var33 == module0528.UNPROVIDED) {
            var33 = module0528.$ic15$;
        }
        if (var34 == module0528.UNPROVIDED) {
            var34 = (SubLObject)module0528.T;
        }
        final SubLObject var35 = f32933(var16, var33);
        final SubLObject var36 = f32934(var35, var16, var34);
        return var36;
    }
    
    public static SubLObject f32935(final SubLObject var16, SubLObject var33) {
        if (var33 == module0528.UNPROVIDED) {
            var33 = module0528.$ic15$;
        }
        final SubLThread var34 = SubLProcess.currentSubLThread();
        assert module0528.NIL != module0191.f11950(var16) : var16;
        SubLObject var35 = (SubLObject)module0528.NIL;
        final SubLObject var36 = f32898();
        assert module0528.NIL != module0055.f4006(var36) : var36;
        final SubLObject var37 = module0131.$g1538$.currentBinding(var34);
        try {
            module0131.$g1538$.bind(var36, var34);
            var35 = f32933(var16, var33);
        }
        finally {
            module0131.$g1538$.rebind(var37, var34);
        }
        return var35;
    }
    
    public static SubLObject f32936(final SubLObject var39, SubLObject var33) {
        if (var33 == module0528.UNPROVIDED) {
            var33 = module0528.$ic15$;
        }
        final SubLThread var40 = SubLProcess.currentSubLThread();
        assert module0528.NIL != module0035.f2015(var39) : var39;
        SubLObject var41 = var39;
        SubLObject var42 = (SubLObject)module0528.NIL;
        var42 = var41.first();
        while (module0528.NIL != var41) {
            assert module0528.NIL != module0191.f11950(var42) : var42;
            var41 = var41.rest();
            var42 = var41.first();
        }
        final SubLObject var43 = module0055.f4017();
        final SubLObject var44 = f32898();
        assert module0528.NIL != module0055.f4006(var44) : var44;
        final SubLObject var45 = module0131.$g1538$.currentBinding(var40);
        try {
            module0131.$g1538$.bind(var44, var40);
            SubLObject var46 = var39;
            SubLObject var47 = (SubLObject)module0528.NIL;
            var47 = var46.first();
            while (module0528.NIL != var46) {
                final SubLObject var48 = f32933(var47, var33);
                SubLObject var41_44 = module0055.f4034(var48);
                SubLObject var49 = (SubLObject)module0528.NIL;
                var49 = var41_44.first();
                while (module0528.NIL != var41_44) {
                    module0055.f4021(var49, var43);
                    var41_44 = var41_44.rest();
                    var49 = var41_44.first();
                }
                var46 = var46.rest();
                var47 = var46.first();
            }
        }
        finally {
            module0131.$g1538$.rebind(var45, var40);
        }
        return var43;
    }
    
    public static SubLObject f32933(final SubLObject var16, final SubLObject var33) {
        final SubLThread var34 = SubLProcess.currentSubLThread();
        SubLObject var35 = (SubLObject)module0528.NIL;
        final SubLObject var36 = f32914();
        final SubLObject var37 = module0361.f24117(var36);
        final SubLObject var38 = module0034.$g879$.currentBinding(var34);
        try {
            module0034.$g879$.bind(var37, var34);
            SubLObject var39 = (SubLObject)module0528.NIL;
            if (module0528.NIL != var37 && module0528.NIL == module0034.f1842(var37)) {
                var39 = module0034.f1869(var37);
                final SubLObject var40 = Threads.current_process();
                if (module0528.NIL == var39) {
                    module0034.f1873(var37, var40);
                }
                else if (!var39.eql(var40)) {
                    Errors.error((SubLObject)module0528.$ic18$);
                }
            }
            try {
                SubLObject var41 = module0361.f24119(var36);
                final SubLObject var22_51 = module0139.$g1632$.currentBinding(var34);
                final SubLObject var42 = module0139.$g1630$.currentBinding(var34);
                final SubLObject var43 = module0139.$g1631$.currentBinding(var34);
                try {
                    module0139.$g1632$.bind(var41, var34);
                    module0139.$g1630$.bind((SubLObject)module0528.T, var34);
                    module0139.$g1631$.bind(module0139.f9023(module0139.$g1632$.getDynamicValue(var34)), var34);
                    final SubLObject var22_52 = module0131.$g1534$.currentBinding(var34);
                    final SubLObject var52_55 = module0131.$g1539$.currentBinding(var34);
                    final SubLObject var53_56 = module0528.$g3888$.currentBinding(var34);
                    try {
                        module0131.$g1534$.bind((SubLObject)module0528.T, var34);
                        module0131.$g1539$.bind((SubLObject)module0528.NIL, var34);
                        module0528.$g3888$.bind(module0055.f4017(), var34);
                        if (module0528.NIL != module0178.f11290(var16)) {
                            f32937(var16, var33);
                        }
                        else {
                            f32938(var16, var33);
                        }
                        if (module0528.NIL == module0055.f4019(f32928()) && module0528.NIL == module0131.$g60$.getDynamicValue(var34) && module0528.NIL == module0018.$g61$.getDynamicValue(var34)) {
                            f32915();
                        }
                        var35 = module0528.$g3888$.getDynamicValue(var34);
                    }
                    finally {
                        module0528.$g3888$.rebind(var53_56, var34);
                        module0131.$g1539$.rebind(var52_55, var34);
                        module0131.$g1534$.rebind(var22_52, var34);
                    }
                    var41 = module0139.$g1632$.getDynamicValue(var34);
                }
                finally {
                    module0139.$g1631$.rebind(var43, var34);
                    module0139.$g1630$.rebind(var42, var34);
                    module0139.$g1632$.rebind(var22_51, var34);
                }
                module0361.f24120(var36, var41);
            }
            finally {
                final SubLObject var22_53 = Threads.$is_thread_performing_cleanupP$.currentBinding(var34);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0528.T, var34);
                    if (module0528.NIL != var37 && module0528.NIL == var39) {
                        module0034.f1873(var37, (SubLObject)module0528.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var22_53, var34);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var38, var34);
        }
        return var35;
    }
    
    public static SubLObject f32939(final SubLObject var37, SubLObject var58) {
        if (var58 == module0528.UNPROVIDED) {
            var58 = (SubLObject)module0528.NIL;
        }
        final SubLThread var59 = SubLProcess.currentSubLThread();
        final SubLObject var60 = module0174.f11021();
        final SubLObject var61 = module0077.f5313(Symbols.symbol_function((SubLObject)module0528.EQ), (SubLObject)module0528.UNPROVIDED);
        SubLObject var62 = (SubLObject)module0528.NIL;
        final SubLObject var63 = f32898();
        assert module0528.NIL != module0055.f4006(var63) : var63;
        final SubLObject var64 = module0131.$g1538$.currentBinding(var59);
        try {
            module0131.$g1538$.bind(var63, var59);
            var62 = f32934(var37, (SubLObject)module0528.NIL, (SubLObject)module0528.T);
        }
        finally {
            module0131.$g1538$.rebind(var64, var59);
        }
        SubLObject var65 = var62;
        SubLObject var66 = (SubLObject)module0528.NIL;
        var66 = var65.first();
        while (module0528.NIL != var65) {
            final SubLObject var67 = module0188.f11781(var66);
            if (module0528.NIL != module0174.f11035(var67) && (module0528.NIL == var58 || module0174.f11025(var67).numGE(var60))) {
                module0077.f5326(var67, var61);
            }
            var65 = var65.rest();
            var66 = var65.first();
        }
        return Sort.sort(module0077.f5312(var61), Symbols.symbol_function((SubLObject)module0528.$ic19$), Symbols.symbol_function((SubLObject)module0528.$ic20$));
    }
    
    public static SubLObject f32934(final SubLObject var37, SubLObject var16, SubLObject var34) {
        if (var16 == module0528.UNPROVIDED) {
            var16 = (SubLObject)module0528.NIL;
        }
        if (var34 == module0528.UNPROVIDED) {
            var34 = (SubLObject)module0528.T;
        }
        final SubLThread var38 = SubLProcess.currentSubLThread();
        SubLObject var39 = (SubLObject)module0528.NIL;
        final SubLObject var40 = f32914();
        final SubLObject var41 = module0361.f24117(var40);
        final SubLObject var42 = module0034.$g879$.currentBinding(var38);
        try {
            module0034.$g879$.bind(var41, var38);
            SubLObject var43 = (SubLObject)module0528.NIL;
            if (module0528.NIL != var41 && module0528.NIL == module0034.f1842(var41)) {
                var43 = module0034.f1869(var41);
                final SubLObject var44 = Threads.current_process();
                if (module0528.NIL == var43) {
                    module0034.f1873(var41, var44);
                }
                else if (!var43.eql(var44)) {
                    Errors.error((SubLObject)module0528.$ic18$);
                }
            }
            try {
                SubLObject var45 = module0361.f24119(var40);
                final SubLObject var22_63 = module0139.$g1632$.currentBinding(var38);
                final SubLObject var46 = module0139.$g1630$.currentBinding(var38);
                final SubLObject var47 = module0139.$g1631$.currentBinding(var38);
                try {
                    module0139.$g1632$.bind(var45, var38);
                    module0139.$g1630$.bind((SubLObject)module0528.T, var38);
                    module0139.$g1631$.bind(module0139.f9023(module0139.$g1632$.getDynamicValue(var38)), var38);
                    final SubLObject var22_64 = module0131.$g1534$.currentBinding(var38);
                    final SubLObject var52_65 = module0131.$g1539$.currentBinding(var38);
                    final SubLObject var53_66 = module0528.$g3888$.currentBinding(var38);
                    final SubLObject var48 = module0012.$g59$.currentBinding(var38);
                    try {
                        module0131.$g1534$.bind((SubLObject)module0528.T, var38);
                        module0131.$g1539$.bind((SubLObject)module0528.NIL, var38);
                        module0528.$g3888$.bind(var37, var38);
                        module0012.$g59$.bind((SubLObject)module0528.NIL, var38);
                        try {
                            final SubLObject var22_65 = module0131.$g60$.currentBinding(var38);
                            final SubLObject var52_66 = module0018.$g61$.currentBinding(var38);
                            try {
                                module0131.$g60$.bind((SubLObject)module0528.NIL, var38);
                                module0018.$g61$.bind((SubLObject)module0528.NIL, var38);
                                SubLObject var49;
                                SubLObject var50;
                                SubLObject var51;
                                SubLObject var52;
                                SubLObject var53;
                                SubLObject var74_75;
                                SubLObject var54;
                                SubLObject var55;
                                SubLObject var56;
                                SubLObject var57;
                                SubLObject var58;
                                SubLObject var22_66;
                                SubLObject var59;
                                for (var49 = (SubLObject)module0528.NIL, var50 = (SubLObject)module0528.NIL, var50 = module0055.f4034(f32928()); module0528.NIL == var49 && module0528.NIL != var50; var50 = var50.rest()) {
                                    var51 = var50.first();
                                    if (module0528.NIL != module0178.f11359(var16, (SubLObject)module0528.UNPROVIDED)) {
                                        Errors.warn((SubLObject)module0528.$ic21$, var16);
                                        var49 = (SubLObject)module0528.T;
                                    }
                                    else {
                                        var52 = var51;
                                        var53 = module0195.f12212(var52);
                                        var54 = (var74_75 = module0195.f12211(var52));
                                        var55 = module0195.f12203(var74_75);
                                        var56 = module0195.f12204(var74_75);
                                        var57 = module0195.f12205(var74_75);
                                        var58 = module0195.f12206(var74_75);
                                        if (module0528.NIL != module0035.f2439((SubLObject)module0528.$ic22$, var53, (SubLObject)module0528.UNPROVIDED)) {
                                            Errors.warn((SubLObject)module0528.$ic23$);
                                        }
                                        else {
                                            var22_66 = module0131.$g1534$.currentBinding(var38);
                                            try {
                                                module0131.$g1534$.bind((SubLObject)module0528.NIL, var38);
                                                if (module0528.NIL != var34) {
                                                    var59 = module0195.f12213(var51);
                                                    if (module0528.NIL != var59) {
                                                        var39 = (SubLObject)ConsesLow.cons(var59, var39);
                                                    }
                                                }
                                                else {
                                                    var39 = (SubLObject)ConsesLow.cons(var51, var39);
                                                }
                                            }
                                            finally {
                                                module0131.$g1534$.rebind(var22_66, var38);
                                            }
                                        }
                                    }
                                }
                            }
                            finally {
                                module0018.$g61$.rebind(var52_66, var38);
                                module0131.$g60$.rebind(var22_65, var38);
                            }
                        }
                        finally {
                            final SubLObject var22_67 = Threads.$is_thread_performing_cleanupP$.currentBinding(var38);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0528.T, var38);
                                f32915();
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var22_67, var38);
                            }
                        }
                    }
                    finally {
                        module0012.$g59$.rebind(var48, var38);
                        module0528.$g3888$.rebind(var53_66, var38);
                        module0131.$g1539$.rebind(var52_65, var38);
                        module0131.$g1534$.rebind(var22_64, var38);
                    }
                    var45 = module0139.$g1632$.getDynamicValue(var38);
                }
                finally {
                    module0139.$g1631$.rebind(var47, var38);
                    module0139.$g1630$.rebind(var46, var38);
                    module0139.$g1632$.rebind(var22_63, var38);
                }
                module0361.f24120(var40, var45);
            }
            finally {
                final SubLObject var22_68 = Threads.$is_thread_performing_cleanupP$.currentBinding(var38);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0528.T, var38);
                    if (module0528.NIL != var41 && module0528.NIL == var43) {
                        module0034.f1873(var41, (SubLObject)module0528.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var22_68, var38);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var42, var38);
        }
        return Sequences.nreverse(var39);
    }
    
    public static SubLObject f32937(final SubLObject var20, final SubLObject var33) {
        final SubLThread var34 = SubLProcess.currentSubLThread();
        final SubLObject var35 = module0528.$g3882$.currentBinding(var34);
        try {
            module0528.$g3882$.bind(var20, var34);
            final SubLObject var36 = module0178.f11282(var20);
            final SubLObject var37 = module0377.f26839(var20, var33);
            f32940(var36, var37, var33, (SubLObject)module0528.NIL, var20, (SubLObject)module0528.NIL);
        }
        finally {
            module0528.$g3882$.rebind(var35, var34);
        }
        return (SubLObject)module0528.NIL;
    }
    
    public static SubLObject f32941(final SubLObject var16) {
        return module0130.f8513(module0191.f11978(var16));
    }
    
    public static SubLObject f32942(final SubLObject var16) {
        if (module0528.NIL != module0191.f11952(var16)) {
            return module0191.f11961(var16);
        }
        if (module0528.NIL != module0178.f11284(var16)) {
            return module0178.f11285(var16);
        }
        return Errors.error((SubLObject)module0528.$ic24$, var16);
    }
    
    public static SubLObject f32938(final SubLObject var86, final SubLObject var33) {
        final SubLThread var87 = SubLProcess.currentSubLThread();
        final SubLObject var88 = module0528.$g3881$.currentBinding(var87);
        try {
            module0528.$g3881$.bind(var86, var87);
            final SubLObject var89 = f32941(var86);
            if (module0528.$ic25$ == var89 || module0528.NIL != module0131.$g1532$.getDynamicValue(var87)) {
                final SubLObject var90 = conses_high.copy_tree(f32942(var86));
                final SubLObject var22_89 = module0131.$g1535$.currentBinding(var87);
                try {
                    module0131.$g1535$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0528.NIL != module0131.$g1535$.getDynamicValue(var87) || module0528.NIL != module0202.f12872(var90)), var87);
                    f32943(var90, var89, var33, var86);
                }
                finally {
                    module0131.$g1535$.rebind(var22_89, var87);
                }
            }
        }
        finally {
            module0528.$g3881$.rebind(var88, var87);
        }
        return (SubLObject)module0528.NIL;
    }
    
    public static SubLObject f32943(final SubLObject var88, final SubLObject var87, final SubLObject var33, final SubLObject var90) {
        final SubLThread var91 = SubLProcess.currentSubLThread();
        SubLObject var92 = module0530.f33022(var88, var87, var33);
        SubLObject var93 = (SubLObject)module0528.NIL;
        var93 = var92.first();
        while (module0528.NIL != var92) {
            SubLObject var95;
            final SubLObject var94 = var95 = var93;
            SubLObject var96 = (SubLObject)module0528.NIL;
            SubLObject var97 = (SubLObject)module0528.NIL;
            SubLObject var98 = (SubLObject)module0528.NIL;
            SubLObject var99 = (SubLObject)module0528.NIL;
            SubLObject var100 = (SubLObject)module0528.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var95, var94, (SubLObject)module0528.$ic26$);
            var96 = var95.first();
            var95 = var95.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var95, var94, (SubLObject)module0528.$ic26$);
            var97 = var95.first();
            var95 = var95.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var95, var94, (SubLObject)module0528.$ic26$);
            var98 = var95.first();
            var95 = var95.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var95, var94, (SubLObject)module0528.$ic26$);
            var99 = var95.first();
            var95 = var95.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var95, var94, (SubLObject)module0528.$ic26$);
            var100 = var95.first();
            var95 = var95.rest();
            final SubLObject var101 = (SubLObject)(var95.isCons() ? var95.first() : module0528.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(var95, var94, (SubLObject)module0528.$ic26$);
            var95 = var95.rest();
            if (module0528.NIL == var95) {
                if (module0528.$ic27$ == var99 || module0528.NIL != module0131.$g1532$.getDynamicValue(var91)) {
                    final SubLObject var102 = f32944(var90, var101);
                    f32945(var96, var98, var99, var33, var100, var102);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var94, (SubLObject)module0528.$ic26$);
            }
            var92 = var92.rest();
            var93 = var92.first();
        }
        return (SubLObject)module0528.NIL;
    }
    
    public static SubLObject f32944(final SubLObject var90, final SubLObject var98) {
        SubLObject var99 = conses_high.copy_list(var98);
        if (module0528.NIL != var90) {
            var99 = (SubLObject)ConsesLow.cons(var90, var99);
        }
        return var99;
    }
    
    public static SubLObject f32946() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0131.$g1537$.getDynamicValue(var1);
    }
    
    public static SubLObject f32947() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return Equality.eq(module0131.$g1537$.getDynamicValue(var1), (SubLObject)module0528.$ic28$);
    }
    
    public static SubLObject f32948(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0528.NIL != f32947() || module0528.NIL != module0004.f104(var20, module0131.$g1537$.getDynamicValue(var21), (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED));
    }
    
    public static SubLObject f32945(final SubLObject var94, final SubLObject var96, final SubLObject var97, final SubLObject var33, final SubLObject var20, final SubLObject var99) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        if (module0528.NIL == f32948(var20)) {
            return (SubLObject)module0528.NIL;
        }
        final SubLObject var101 = module0528.$g3882$.currentBinding(var100);
        try {
            module0528.$g3882$.bind(var20, var100);
            final SubLObject var102 = module0178.f11282(var20);
            final SubLObject var103 = module0232.f15308(var102);
            final SubLObject var104 = module0232.f15306(var102);
            final SubLObject var105 = (module0528.$ic25$ == var97) ? var103 : var104;
            final SubLObject var106 = (module0528.$ic25$ == var97) ? var104 : var103;
            final SubLObject var107 = module0377.f26839(var20, var33);
            if (module0205.f13333(var94).equal(module0205.f13333(var96)) || (module0528.NIL != module0223.f14689(var96) && module0528.NIL != module0202.f12740(var96, var94))) {
                var100.resetMultipleValues();
                final SubLObject var108 = module0235.f15476(var94, var96, (SubLObject)module0528.T, (SubLObject)module0528.T);
                final SubLObject var109 = var100.secondMultipleValue();
                final SubLObject var110 = var100.thirdMultipleValue();
                var100.resetMultipleValues();
                if (module0528.NIL != var108) {
                    SubLObject var111 = (SubLObject)module0528.NIL;
                    SubLObject var112 = (SubLObject)module0528.NIL;
                    if (module0528.$ic25$ == var97) {
                        var111 = var106;
                        var112 = Sequences.remove(var96, var105, (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED);
                    }
                    else {
                        var111 = Sequences.remove(var96, var105, (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED);
                        var112 = var106;
                    }
                    f32949(var96, var111, var112, var107, var33, var108, var20, ConsesLow.append(var99, var110));
                }
            }
        }
        finally {
            module0528.$g3882$.rebind(var101, var100);
        }
        return (SubLObject)module0528.NIL;
    }
    
    public static SubLObject f32949(final SubLObject var96, final SubLObject var107, final SubLObject var108, final SubLObject var85, final SubLObject var33, final SubLObject var104, final SubLObject var20, final SubLObject var99) {
        final SubLThread var109 = SubLProcess.currentSubLThread();
        final SubLObject var110 = module0233.f15362(var104, var107);
        final SubLObject var111 = module0233.f15362(var104, var108);
        final SubLObject var112 = module0232.f15326(var110, var111);
        final SubLObject var113 = module0233.f15362(var104, var85);
        final SubLObject var114 = module0528.$g3890$.currentBinding(var109);
        try {
            module0528.$g3890$.bind(module0233.f15362(var104, var96), var109);
            f32940(var112, var113, var33, var104, var20, var99);
        }
        finally {
            module0528.$g3890$.rebind(var114, var109);
        }
        return (SubLObject)module0528.NIL;
    }
    
    public static SubLObject f32950(final SubLObject var113) {
        final SubLObject var114 = f32951(var113);
        return module0211.f13723(var114);
    }
    
    public static SubLObject f32951(final SubLObject var113) {
        return module0220.f14565(var113, module0528.$ic29$, (SubLObject)module0528.ONE_INTEGER, (SubLObject)module0528.TWO_INTEGER, (SubLObject)module0528.$ic30$);
    }
    
    public static SubLObject f32952(final SubLObject var113) {
        SubLObject var114 = (SubLObject)module0528.NIL;
        SubLObject var115 = f32953(var113);
        SubLObject var116 = (SubLObject)module0528.NIL;
        var116 = var115.first();
        while (module0528.NIL != var115) {
            var114 = ConsesLow.append(var114, f32954(var116));
            var115 = var115.rest();
            var116 = var115.first();
        }
        return var114;
    }
    
    public static SubLObject f32953(final SubLObject var113) {
        return module0347.f23344((SubLObject)module0528.$ic31$, (SubLObject)ConsesLow.listS(module0528.$ic32$, var113, (SubLObject)module0528.$ic33$), module0528.$ic34$, (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED);
    }
    
    public static SubLObject f32954(final SubLObject var113) {
        final SubLThread var114 = SubLProcess.currentSubLThread();
        SubLObject var115 = module0220.f14565(var113, module0528.$ic35$, (SubLObject)module0528.ONE_INTEGER, (SubLObject)module0528.TWO_INTEGER, (SubLObject)module0528.$ic30$);
        SubLObject var117;
        final SubLObject var116 = var117 = module0220.f14565(var113, module0528.$ic36$, (SubLObject)module0528.ONE_INTEGER, (SubLObject)module0528.TWO_INTEGER, (SubLObject)module0528.$ic30$);
        SubLObject var118 = (SubLObject)module0528.NIL;
        var118 = var117.first();
        while (module0528.NIL != var117) {
            final SubLObject var119 = module0158.f10289(var118);
            if (var119.eql((SubLObject)module0528.$ic37$)) {
                if (module0528.NIL != module0158.f10270(var118, (SubLObject)module0528.$ic38$)) {
                    final SubLObject var120 = module0158.f10271(var118);
                    SubLObject var121 = (SubLObject)module0528.NIL;
                    try {
                        var121 = module0158.f10316(var120, (SubLObject)module0528.$ic38$, (SubLObject)module0528.$ic30$, (SubLObject)module0528.NIL);
                        SubLObject var122 = (SubLObject)module0528.NIL;
                        final SubLObject var123 = (SubLObject)module0528.NIL;
                        while (module0528.NIL == var122) {
                            final SubLObject var124 = module0052.f3695(var121, var123);
                            final SubLObject var125 = (SubLObject)SubLObjectFactory.makeBoolean(!var123.eql(var124));
                            if (module0528.NIL != var125 && module0528.NIL != module0178.f11314(var124)) {
                                final SubLObject var126 = var124;
                                if (module0528.NIL == conses_high.member(var126, var115, Symbols.symbol_function((SubLObject)module0528.EQL), Symbols.symbol_function((SubLObject)module0528.IDENTITY))) {
                                    var115 = (SubLObject)ConsesLow.cons(var126, var115);
                                }
                            }
                            var122 = (SubLObject)SubLObjectFactory.makeBoolean(module0528.NIL == var125);
                        }
                    }
                    finally {
                        final SubLObject var127 = Threads.$is_thread_performing_cleanupP$.currentBinding(var114);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0528.T, var114);
                            if (module0528.NIL != var121) {
                                module0158.f10319(var121);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var127, var114);
                        }
                    }
                }
            }
            else if (var119.eql((SubLObject)module0528.$ic39$) && module0528.NIL != module0158.f10286(var118, (SubLObject)module0528.$ic38$)) {
                final SubLObject var128 = module0174.f11010();
                final SubLObject var129 = (SubLObject)module0528.$ic40$;
                final SubLObject var130 = module0065.f4733(var128);
                SubLObject var131 = (SubLObject)module0528.ZERO_INTEGER;
                assert module0528.NIL != Types.stringp(var129) : var129;
                final SubLObject var132 = module0012.$g75$.currentBinding(var114);
                final SubLObject var133 = module0012.$g76$.currentBinding(var114);
                final SubLObject var134 = module0012.$g77$.currentBinding(var114);
                final SubLObject var135 = module0012.$g78$.currentBinding(var114);
                try {
                    module0012.$g75$.bind((SubLObject)module0528.ZERO_INTEGER, var114);
                    module0012.$g76$.bind((SubLObject)module0528.NIL, var114);
                    module0012.$g77$.bind((SubLObject)module0528.T, var114);
                    module0012.$g78$.bind(Time.get_universal_time(), var114);
                    module0012.f478(var129);
                    final SubLObject var129_130 = var128;
                    if (module0528.NIL == module0065.f4772(var129_130, (SubLObject)module0528.$ic42$)) {
                        final SubLObject var131_132 = var129_130;
                        if (module0528.NIL == module0065.f4775(var131_132, (SubLObject)module0528.$ic42$)) {
                            final SubLObject var136 = module0065.f4740(var131_132);
                            final SubLObject var137 = (SubLObject)module0528.NIL;
                            SubLObject var138;
                            SubLObject var139;
                            SubLObject var140;
                            SubLObject var141;
                            SubLObject var142;
                            for (var138 = Sequences.length(var136), var139 = (SubLObject)module0528.NIL, var139 = (SubLObject)module0528.ZERO_INTEGER; var139.numL(var138); var139 = Numbers.add(var139, (SubLObject)module0528.ONE_INTEGER)) {
                                var140 = ((module0528.NIL != var137) ? Numbers.subtract(var138, var139, (SubLObject)module0528.ONE_INTEGER) : var139);
                                var141 = Vectors.aref(var136, var140);
                                if (module0528.NIL == module0065.f4749(var141) || module0528.NIL == module0065.f4773((SubLObject)module0528.$ic42$)) {
                                    if (module0528.NIL != module0065.f4749(var141)) {
                                        var141 = (SubLObject)module0528.$ic42$;
                                    }
                                    module0012.note_percent_progress(var131, var130);
                                    var131 = Numbers.add(var131, (SubLObject)module0528.ONE_INTEGER);
                                    if (module0528.NIL != module0158.f10287(var141, var118, (SubLObject)module0528.$ic38$, (SubLObject)module0528.$ic30$) && module0528.NIL != module0178.f11314(var141)) {
                                        var142 = var141;
                                        if (module0528.NIL == conses_high.member(var142, var115, Symbols.symbol_function((SubLObject)module0528.EQL), Symbols.symbol_function((SubLObject)module0528.IDENTITY))) {
                                            var115 = (SubLObject)ConsesLow.cons(var142, var115);
                                        }
                                    }
                                }
                            }
                        }
                        final SubLObject var138_139 = var129_130;
                        if (module0528.NIL == module0065.f4777(var138_139) || module0528.NIL == module0065.f4773((SubLObject)module0528.$ic42$)) {
                            final SubLObject var143 = module0065.f4738(var138_139);
                            SubLObject var144 = module0065.f4739(var138_139);
                            final SubLObject var145 = module0065.f4734(var138_139);
                            final SubLObject var146 = (SubLObject)((module0528.NIL != module0065.f4773((SubLObject)module0528.$ic42$)) ? module0528.NIL : module0528.$ic42$);
                            while (var144.numL(var145)) {
                                final SubLObject var147 = Hashtables.gethash_without_values(var144, var143, var146);
                                if (module0528.NIL == module0065.f4773((SubLObject)module0528.$ic42$) || module0528.NIL == module0065.f4749(var147)) {
                                    module0012.note_percent_progress(var131, var130);
                                    var131 = Numbers.add(var131, (SubLObject)module0528.ONE_INTEGER);
                                    if (module0528.NIL != module0158.f10287(var147, var118, (SubLObject)module0528.$ic38$, (SubLObject)module0528.$ic30$) && module0528.NIL != module0178.f11314(var147)) {
                                        final SubLObject var148 = var147;
                                        if (module0528.NIL == conses_high.member(var148, var115, Symbols.symbol_function((SubLObject)module0528.EQL), Symbols.symbol_function((SubLObject)module0528.IDENTITY))) {
                                            var115 = (SubLObject)ConsesLow.cons(var148, var115);
                                        }
                                    }
                                }
                                var144 = Numbers.add(var144, (SubLObject)module0528.ONE_INTEGER);
                            }
                        }
                    }
                    module0012.f479();
                }
                finally {
                    module0012.$g78$.rebind(var135, var114);
                    module0012.$g77$.rebind(var134, var114);
                    module0012.$g76$.rebind(var133, var114);
                    module0012.$g75$.rebind(var132, var114);
                }
            }
            var117 = var117.rest();
            var118 = var117.first();
        }
        return var115;
    }
    
    public static SubLObject f32940(final SubLObject var143, final SubLObject var85, final SubLObject var33, final SubLObject var104, final SubLObject var20, final SubLObject var99) {
        final SubLThread var144 = SubLProcess.currentSubLThread();
        if (module0528.NIL != f32955(var20, var99)) {
            return (SubLObject)module0528.NIL;
        }
        final SubLObject var145 = module0232.f15306(var143);
        SubLObject var147;
        final SubLObject var146 = var147 = module0232.f15308(var143);
        SubLObject var148 = (SubLObject)module0528.NIL;
        var148 = var147.first();
        while (module0528.NIL != var147) {
            final SubLObject var149 = Sequences.remove(var148, var146, (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED);
            final SubLObject var150 = module0232.f15330(var149, var145);
            f32956(var150, var85, var33, var148, (SubLObject)module0528.$ic30$, var104, var20, var99);
            var147 = var147.rest();
            var148 = var147.first();
        }
        if (module0528.NIL != module0131.$g1533$.getDynamicValue(var144)) {
            var147 = var145;
            var148 = (SubLObject)module0528.NIL;
            var148 = var147.first();
            while (module0528.NIL != var147) {
                final SubLObject var151 = Sequences.remove(var148, var145, (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED);
                final SubLObject var150 = module0232.f15330(var146, var151);
                f32956(var150, var85, var33, var148, (SubLObject)module0528.$ic43$, var104, var20, var99);
                var147 = var147.rest();
                var148 = var147.first();
            }
        }
        return (SubLObject)module0528.NIL;
    }
    
    public static SubLObject f32956(final SubLObject var148, final SubLObject var85, final SubLObject var33, final SubLObject var146, final SubLObject var150, final SubLObject var104, final SubLObject var20, final SubLObject var99) {
        final SubLThread var151 = SubLProcess.currentSubLThread();
        SubLObject var152 = (SubLObject)module0528.NIL;
        try {
            var151.throwStack.push(module0528.$ic44$);
            if (module0528.NIL != module0232.f15316(var148) && module0528.NIL != module0232.f15316(var85)) {
                f32957(var146, var150, var33, var104, var20, var99);
            }
            else if (module0528.NIL != f32958(var148, var33)) {
                if (module0528.NIL != f32958(var85, var33)) {
                    final SubLObject var153 = f32959(var85);
                    f32960(var148, var153, var33, var146, var150, var104, var20, var99);
                }
            }
        }
        catch (Throwable var154) {
            var152 = Errors.handleThrowable(var154, (SubLObject)module0528.$ic44$);
        }
        finally {
            var151.throwStack.pop();
        }
        return (SubLObject)module0528.NIL;
    }
    
    public static SubLObject f32959(final SubLObject var85) {
        final SubLObject var86 = module0232.f15308(var85);
        if (module0528.NIL == Sequences.find_if((SubLObject)module0528.$ic45$, var86, (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED)) {
            return var85;
        }
        final SubLObject var87 = Sequences.remove_if((SubLObject)module0528.$ic45$, var86, (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED);
        return module0232.f15330(module0232.f15306(var85), var87);
    }
    
    public static SubLObject f32960(final SubLObject var148, final SubLObject var85, final SubLObject var33, final SubLObject var146, final SubLObject var150, final SubLObject var104, final SubLObject var20, final SubLObject var99) {
        final SubLThread var151 = SubLProcess.currentSubLThread();
        var151.resetMultipleValues();
        final SubLObject var152 = f32961(var148, var85, var33, (SubLObject)module0528.UNPROVIDED);
        final SubLObject var153 = var151.secondMultipleValue();
        final SubLObject var154 = var151.thirdMultipleValue();
        var151.resetMultipleValues();
        if (module0528.NIL != module0528.$g3874$.getDynamicValue(var151)) {
            if (module0528.NIL != module0528.$g3875$.getDynamicValue(var151)) {
                Functions.funcall(module0528.$g3874$.getDynamicValue(var151), var153, var20, module0035.f2333((SubLObject)ConsesLow.list((SubLObject)module0528.$ic46$, (SubLObject)module0528.$ic47$, (SubLObject)module0528.$ic48$, (SubLObject)module0528.$ic49$, (SubLObject)module0528.$ic50$), (SubLObject)ConsesLow.list(var146, var150, var104, var99, var152)));
            }
            else {
                Functions.funcall(module0528.$g3874$.getDynamicValue(var151), var153, var20);
            }
        }
        module0413.f28815();
        module0413.f28850(var20, var154, var153);
        if (module0528.NIL != var152) {
            module0413.f28818();
        }
        SubLObject var155 = var152;
        SubLObject var156 = (SubLObject)module0528.NIL;
        var156 = var155.first();
        while (module0528.NIL != var155) {
            f32962(var146, var150, var33, var104, var20, var99, var156);
            var155 = var155.rest();
            var156 = var155.first();
        }
        return (SubLObject)module0528.NIL;
    }
    
    public static SubLObject f32961(final SubLObject var148, final SubLObject var85, final SubLObject var33, SubLObject var159) {
        if (var159 == module0528.UNPROVIDED) {
            var159 = module0528.$g3891$.getDynamicValue();
        }
        final SubLThread var160 = SubLProcess.currentSubLThread();
        final SubLObject var161 = f32963(var85, var159);
        SubLObject var162 = (SubLObject)module0528.NIL;
        SubLObject var163 = (SubLObject)module0528.NIL;
        SubLObject var164 = (SubLObject)module0528.NIL;
        SubLObject var165 = (SubLObject)module0528.NIL;
        final SubLObject var166 = Time.get_internal_real_time();
        var160.resetMultipleValues();
        final SubLObject var163_164 = module0409.f28508(var148, var33, (SubLObject)module0528.NIL, var161);
        final SubLObject var165_166 = var160.secondMultipleValue();
        final SubLObject var167_168 = var160.thirdMultipleValue();
        var160.resetMultipleValues();
        var162 = var163_164;
        var163 = var165_166;
        var164 = var167_168;
        var165 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var166), time_high.$internal_time_units_per_second$.getGlobalValue());
        return Values.values(var162, var164, var165);
    }
    
    public static SubLObject f32964(final SubLObject var169, final SubLObject var77, SubLObject var170, SubLObject var159) {
        if (var170 == module0528.UNPROVIDED) {
            var170 = (SubLObject)module0528.NIL;
        }
        if (var159 == module0528.UNPROVIDED) {
            var159 = (SubLObject)module0528.NIL;
        }
        final SubLObject var171 = f32965(module0232.f15315(), var159);
        return module0410.f28546(var169, var77, var170, var171);
    }
    
    public static SubLObject f32966(final SubLObject var171, SubLObject var85, SubLObject var33) {
        if (var85 == module0528.UNPROVIDED) {
            var85 = module0232.f15315();
        }
        if (var33 == module0528.UNPROVIDED) {
            var33 = module0528.$ic15$;
        }
        final SubLThread var172 = SubLProcess.currentSubLThread();
        final SubLObject var173 = f32963(var85, (SubLObject)module0528.UNPROVIDED);
        SubLObject var174 = (SubLObject)module0528.NIL;
        SubLObject var175 = (SubLObject)module0528.NIL;
        SubLObject var176 = (SubLObject)module0528.NIL;
        SubLObject var177 = (SubLObject)module0528.NIL;
        final SubLObject var178 = Time.get_internal_real_time();
        var172.resetMultipleValues();
        final SubLObject var172_173 = module0409.f28506(var171, var33, var173);
        final SubLObject var174_175 = var172.secondMultipleValue();
        final SubLObject var176_177 = var172.thirdMultipleValue();
        var172.resetMultipleValues();
        var174 = var172_173;
        var175 = var174_175;
        var176 = var176_177;
        var177 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var178), time_high.$internal_time_units_per_second$.getGlobalValue());
        return Values.values(var174, var176, var177);
    }
    
    public static SubLObject f32963(final SubLObject var85, SubLObject var159) {
        if (var159 == module0528.UNPROVIDED) {
            var159 = (SubLObject)module0528.NIL;
        }
        final SubLThread var160 = SubLProcess.currentSubLThread();
        final SubLObject var161 = f32914();
        final SubLObject var162 = (SubLObject)((module0528.NIL != module0232.f15316(var85)) ? module0528.NIL : module0232.f15332(var85));
        final SubLObject var163 = module0035.sublisp_boolean(module0018.f957());
        final SubLObject var164 = module0035.sublisp_boolean(module0528.$g3876$.getDynamicValue(var160));
        final SubLObject var165 = module0131.$g1536$.getDynamicValue(var160);
        final SubLObject var166 = module0434.f30571(module0018.$g651$.getDynamicValue(var160));
        final SubLObject var167 = module0018.$g61$.getDynamicValue(var160);
        if (module0528.NIL == Errors.$ignore_mustsP$.getDynamicValue(var160) && module0528.NIL == module0361.f24009(var161)) {
            Errors.error((SubLObject)module0528.$ic51$);
        }
        SubLObject var168 = (SubLObject)ConsesLow.list(new SubLObject[] { module0528.$ic52$, var161, module0528.$ic53$, var162, module0528.$ic54$, module0528.T, module0528.$ic55$, var163, module0528.$ic56$, var164, module0528.$ic57$, var166, module0528.$ic58$, module0528.ONE_INTEGER, module0528.$ic59$, var165, module0528.$ic60$, module0528.$ic61$, module0528.$ic62$, module0528.$ic63$, module0528.$ic64$, var167 });
        if (module0528.NIL != var159) {
            var168 = module0035.f2341(var168, var159);
        }
        return var168;
    }
    
    public static SubLObject f32965(final SubLObject var85, SubLObject var159) {
        if (var159 == module0528.UNPROVIDED) {
            var159 = (SubLObject)module0528.NIL;
        }
        final SubLObject var160 = f32963(var85, var159);
        SubLObject var161 = (SubLObject)module0528.NIL;
        SubLObject var162;
        SubLObject var163;
        SubLObject var164;
        for (var162 = (SubLObject)module0528.NIL, var162 = var160; module0528.NIL != var162; var162 = conses_high.cddr(var162)) {
            var163 = var162.first();
            var164 = conses_high.cadr(var162);
            if (module0528.NIL != module0410.f28556(var163, var164)) {
                var161 = conses_high.putf(var161, var163, var164);
            }
        }
        return var161;
    }
    
    public static SubLObject f32962(final SubLObject var146, final SubLObject var150, final SubLObject var33, final SubLObject var104, final SubLObject var20, final SubLObject var99, final SubLObject var158) {
        SubLObject var159 = (SubLObject)module0528.NIL;
        SubLObject var160 = (SubLObject)module0528.NIL;
        SubLObject var161 = (SubLObject)module0528.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var158, var158, (SubLObject)module0528.$ic65$);
        var159 = var158.first();
        SubLObject var162 = var158.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var162, var158, (SubLObject)module0528.$ic65$);
        var160 = var162.first();
        var162 = var162.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var162, var158, (SubLObject)module0528.$ic65$);
        var161 = var162.first();
        var162 = var162.rest();
        if (module0528.NIL == var162) {
            final SubLObject var163 = module0233.f15362(var159, var146);
            if (module0528.NIL != module0202.f12690(var163) && module0528.NIL == module0532.f33196(var33, var20, var104, var159)) {
                final SubLObject var164 = f32967(var20, var99, var160);
                f32968(var33, var163, var150, var164, var161);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var158, (SubLObject)module0528.$ic65$);
        }
        return (SubLObject)module0528.NIL;
    }
    
    public static SubLObject f32957(final SubLObject var146, final SubLObject var150, final SubLObject var33, final SubLObject var104, final SubLObject var20, final SubLObject var99) {
        return f32962(var146, var150, var33, var104, var20, var99, (SubLObject)module0528.$ic66$);
    }
    
    public static SubLObject f32967(final SubLObject var20, final SubLObject var99, SubLObject var191) {
        if (var191 == module0528.UNPROVIDED) {
            var191 = (SubLObject)module0528.NIL;
        }
        return reader.bq_cons(var20, ConsesLow.append((SubLObject)((module0528.NIL != var99) ? conses_high.copy_list(var99) : module0528.NIL), (SubLObject)((module0528.NIL != var191) ? conses_high.copy_list(var191) : module0528.NIL), (SubLObject)module0528.NIL));
    }
    
    public static SubLObject f32968(final SubLObject var33, final SubLObject var193, final SubLObject var195, final SubLObject var194, final SubLObject var196) {
        final SubLThread var197 = SubLProcess.currentSubLThread();
        if (module0528.NIL != module0226.f14824(var193)) {
            final SubLObject var198 = module0226.f14826(var193);
            if (module0528.$ic15$.equal(var33) && module0528.NIL != module0528.$g3892$.getDynamicValue(var197)) {
                SubLObject var200;
                final SubLObject var199 = var200 = f32969(var194);
                SubLObject var201 = (SubLObject)module0528.NIL;
                var201 = var200.first();
                while (module0528.NIL != var200) {
                    f32970(var193, var195, var198, var201, var196);
                    var200 = var200.rest();
                    var201 = var200.first();
                }
            }
            else {
                f32970(var193, var195, var198, var194, var196);
            }
        }
        else if (module0528.$ic15$.equal(var33)) {
            SubLObject var203;
            final SubLObject var202 = var203 = f32971(var194);
            SubLObject var204 = (SubLObject)module0528.NIL;
            var204 = var203.first();
            while (module0528.NIL != var203) {
                SubLObject var206;
                final SubLObject var205 = var206 = var204;
                SubLObject var207 = (SubLObject)module0528.NIL;
                SubLObject var208 = (SubLObject)module0528.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var206, var205, (SubLObject)module0528.$ic67$);
                var207 = var206.first();
                var206 = var206.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var206, var205, (SubLObject)module0528.$ic67$);
                var208 = var206.first();
                var206 = var206.rest();
                if (module0528.NIL == var206) {
                    SubLObject var41_205 = var207;
                    SubLObject var209 = (SubLObject)module0528.NIL;
                    var209 = var41_205.first();
                    while (module0528.NIL != var41_205) {
                        f32970(var193, var195, var209, var208, var196);
                        var41_205 = var41_205.rest();
                        var209 = var41_205.first();
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var205, (SubLObject)module0528.$ic67$);
                }
                var203 = var203.rest();
                var204 = var203.first();
            }
        }
        else {
            f32970(var193, var195, var33, var194, var196);
        }
        return (SubLObject)module0528.NIL;
    }
    
    public static SubLObject f32970(final SubLObject var207, final SubLObject var208, final SubLObject var77, final SubLObject var39, final SubLObject var196) {
        if (module0528.NIL != ((module0528.NIL != module0532.f33186()) ? module0377.f26849(var39, var77) : module0528.NIL)) {
            return (SubLObject)module0528.NIL;
        }
        SubLObject var209 = (SubLObject)module0528.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var39, var39, (SubLObject)module0528.$ic68$);
        var209 = var39.first();
        final SubLObject var211;
        final SubLObject var210 = var211 = var39.rest();
        if (module0528.NIL != f32972(var209, var77)) {
            return f32973(var207, var208, var77, var39, var196);
        }
        return f32974(var207, var208, var77, var39, var196);
    }
    
    public static SubLObject f32974(final SubLObject var207, final SubLObject var208, SubLObject var77, final SubLObject var39, final SubLObject var196) {
        final SubLThread var209 = SubLProcess.currentSubLThread();
        if (module0528.NIL == f32975(var207, var208, var77, var39, var196)) {
            final SubLObject var210 = module0205.f13339(var207, var208);
            SubLObject var211 = (SubLObject)module0528.NIL;
            final SubLObject var212 = module0146.$g2046$.currentBinding(var209);
            try {
                module0146.$g2046$.bind((SubLObject)module0528.T, var209);
                if (module0528.NIL != module0528.$g3893$.getDynamicValue(var209)) {
                    var209.resetMultipleValues();
                    final SubLObject var214_215 = module0285.f18886(var210, var77);
                    final SubLObject var216_217 = var209.secondMultipleValue();
                    var209.resetMultipleValues();
                    var211 = var214_215;
                    var77 = var216_217;
                }
                else {
                    var209.resetMultipleValues();
                    final SubLObject var218_219 = module0285.f18884(var210, var77);
                    final SubLObject var220_221 = var209.secondMultipleValue();
                    var209.resetMultipleValues();
                    var211 = var218_219;
                    var77 = var220_221;
                }
            }
            finally {
                module0146.$g2046$.rebind(var212, var209);
            }
            if (module0528.NIL == module0206.f13427(var211)) {
                if (module0528.NIL != Sequences.find_if((SubLObject)module0528.$ic22$, var39, (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED)) {
                    Errors.warn((SubLObject)module0528.$ic69$, var210, var77, var39);
                    var211 = (SubLObject)module0528.NIL;
                }
                else if (module0528.NIL == var211) {
                    module0334.f22566(var207, var208, var77);
                    return (SubLObject)module0528.NIL;
                }
                SubLObject var213 = (SubLObject)module0528.NIL;
                if (module0528.NIL == var213) {
                    SubLObject var214 = var196;
                    SubLObject var215 = (SubLObject)module0528.NIL;
                    var215 = var214.first();
                    while (module0528.NIL == var213 && module0528.NIL != var214) {
                        if (module0528.NIL != module0004.f104(module0191.f11976(var215), (SubLObject)module0528.$ic70$, (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED)) {
                            final SubLObject var216 = module0191.f11984(var215, var77);
                            if (module0528.NIL == module0333.f22427(var216)) {
                                var213 = (SubLObject)module0528.T;
                            }
                        }
                        var214 = var214.rest();
                        var215 = var214.first();
                    }
                }
                if (module0528.NIL == var213) {
                    SubLObject var217 = var211;
                    SubLObject var218 = (SubLObject)module0528.NIL;
                    var218 = var217.first();
                    while (module0528.NIL != var217) {
                        SubLObject var220;
                        final SubLObject var219 = var220 = var218;
                        SubLObject var221 = (SubLObject)module0528.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var220, var219, (SubLObject)module0528.$ic71$);
                        var221 = var220.first();
                        var220 = var220.rest();
                        final SubLObject var222 = (SubLObject)(var220.isCons() ? var220.first() : module0528.NIL);
                        cdestructuring_bind.destructuring_bind_must_listp(var220, var219, (SubLObject)module0528.$ic71$);
                        var220 = var220.rest();
                        if (module0528.NIL == var220) {
                            assert module0528.NIL != module0232.f15320(var221) : var221;
                            if (module0528.NIL == module0018.$g628$.getDynamicValue(var209) || module0528.NIL == module0232.f15312(var221) || module0528.NIL == module0342.f23148(var221, var77)) {
                                f32976(var221, var77, var39, var222);
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var219, (SubLObject)module0528.$ic71$);
                        }
                        var217 = var217.rest();
                        var218 = var217.first();
                    }
                }
            }
        }
        return (SubLObject)module0528.NIL;
    }
    
    public static SubLObject f32976(final SubLObject var76, final SubLObject var77, final SubLObject var39, SubLObject var79) {
        if (var79 == module0528.UNPROVIDED) {
            var79 = (SubLObject)module0528.NIL;
        }
        final SubLObject var80 = module0188.f11768(var39);
        final SubLObject var81 = module0195.f12200(var76, var77, (SubLObject)module0528.$ic73$, var79);
        final SubLObject var82 = module0195.f12208(var81, var80);
        f32929(var82);
        return (SubLObject)module0528.NIL;
    }
    
    public static SubLObject f32975(final SubLObject var207, final SubLObject var208, final SubLObject var77, final SubLObject var39, final SubLObject var196) {
        if (module0528.NIL != Sequences.find_if((SubLObject)module0528.$ic74$, var39, (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0528.NIL != f32977(var77) || module0528.NIL != module0035.f2369((SubLObject)module0528.$ic75$, var39, (SubLObject)module0528.UNPROVIDED));
        }
        return (SubLObject)module0528.NIL;
    }
    
    public static SubLObject f32978(final SubLObject var16) {
        if (module0528.NIL != f32977(module0191.f11976(var16))) {
            final SubLObject var17 = module0205.f13378(module0191.f11967(var16));
            if (module0528.NIL != module0259.f16891(var17, module0528.$ic76$)) {
                return (SubLObject)module0528.T;
            }
        }
        return (SubLObject)module0528.NIL;
    }
    
    public static SubLObject f32977(final SubLObject var77) {
        final SubLObject var78 = module0161.f10557(var77);
        return module0222.f14635(module0528.$ic77$, var78, (SubLObject)module0528.ONE_INTEGER, (SubLObject)module0528.UNPROVIDED);
    }
    
    public static SubLObject f32972(final SubLObject var20, SubLObject var77) {
        if (var77 == module0528.UNPROVIDED) {
            var77 = (SubLObject)module0528.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0528.NIL != module0178.f11290(var20) && module0528.NIL != module0220.f14548(var20, module0528.$ic78$, var77, (SubLObject)module0528.ONE_INTEGER, (SubLObject)module0528.$ic30$));
    }
    
    public static SubLObject f32973(final SubLObject var207, final SubLObject var208, SubLObject var77, final SubLObject var39, final SubLObject var235) {
        final SubLThread var236 = SubLProcess.currentSubLThread();
        if (module0528.NIL == module0528.$g3894$.getDynamicValue(var236) || module0528.NIL == module0018.$g675$.getDynamicValue(var236)) {
            return f32974(var207, var208, var77, var39, var235);
        }
        final SubLObject var237 = module0205.f13338(module0205.f13339(var207, var208));
        SubLObject var238 = (SubLObject)module0528.NIL;
        final SubLObject var239 = module0146.$g2046$.currentBinding(var236);
        try {
            module0146.$g2046$.bind((SubLObject)module0528.T, var236);
            var236.resetMultipleValues();
            final SubLObject var236_237 = module0285.f18884(var237, var77);
            final SubLObject var238_239 = var236.secondMultipleValue();
            var236.resetMultipleValues();
            var238 = var236_237;
            var77 = var238_239;
        }
        finally {
            module0146.$g2046$.rebind(var239, var236);
        }
        if (module0528.NIL == var238 || module0528.$ic79$.eql(var238)) {
            module0334.f22566(var207, var208, var77);
            return (SubLObject)module0528.NIL;
        }
        if (!module0528.$ic80$.eql(var238)) {
            SubLObject var240 = var238;
            SubLObject var241 = (SubLObject)module0528.NIL;
            var241 = var240.first();
            while (module0528.NIL != var240) {
                SubLObject var243;
                final SubLObject var242 = var243 = var241;
                SubLObject var244 = (SubLObject)module0528.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var243, var242, (SubLObject)module0528.$ic71$);
                var244 = var243.first();
                var243 = var243.rest();
                final SubLObject var245 = (SubLObject)(var243.isCons() ? var243.first() : module0528.NIL);
                cdestructuring_bind.destructuring_bind_must_listp(var243, var242, (SubLObject)module0528.$ic71$);
                var243 = var243.rest();
                if (module0528.NIL == var243) {
                    assert module0528.NIL != module0232.f15320(var244) : var244;
                    if (module0528.NIL != f32979(var244, var77)) {
                        module0334.f22566(var207, var208, var77);
                        return (SubLObject)module0528.NIL;
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var242, (SubLObject)module0528.$ic71$);
                }
                var240 = var240.rest();
                var241 = var240.first();
            }
        }
        return (SubLObject)module0528.T;
    }
    
    public static SubLObject f32979(final SubLObject var242, final SubLObject var77) {
        return module0035.sublisp_boolean(module0409.f28508(var242, var77, (SubLObject)module0528.NIL, f32963(module0232.f15315(), (SubLObject)module0528.UNPROVIDED)));
    }
    
    public static SubLObject f32980(final SubLObject var169) {
        final SubLThread var170 = SubLProcess.currentSubLThread();
        SubLObject var171 = (SubLObject)module0528.NIL;
        if (module0528.NIL != module0528.$g3895$.getDynamicValue(var170)) {
            final SubLObject var172 = module0232.f15308(var169);
            if (module0528.NIL != Sequences.find_if((SubLObject)module0528.$ic45$, var172, (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED) && module0528.NIL == var171) {
                SubLObject var173 = var172;
                SubLObject var174 = (SubLObject)module0528.NIL;
                var174 = var173.first();
                while (module0528.NIL == var171 && module0528.NIL != var173) {
                    if (module0528.$ic81$.eql(module0205.f13333(var174)) && module0528.NIL != module0193.f12105(var174) && module0205.f13387(var174, (SubLObject)module0528.UNPROVIDED).equal(module0528.$g3890$.getDynamicValue(var170))) {
                        var171 = (SubLObject)module0528.T;
                    }
                    var173 = var173.rest();
                    var174 = var173.first();
                }
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0528.NIL == var171);
    }
    
    public static SubLObject f32958(final SubLObject var169, final SubLObject var33) {
        final SubLThread var170 = SubLProcess.currentSubLThread();
        if (module0528.NIL == f32980(var169)) {
            return (SubLObject)module0528.NIL;
        }
        if (module0528.NIL == module0528.$g3889$.getDynamicValue(var170)) {
            return (SubLObject)module0528.T;
        }
        return module0347.f23356(var169, var33);
    }
    
    public static SubLObject f32981(final SubLObject var244) {
        final SubLThread var245 = SubLProcess.currentSubLThread();
        return f32982(var244, module0528.$g3896$.getDynamicValue(var245));
    }
    
    public static SubLObject f32955(final SubLObject var20, final SubLObject var99) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        if (module0528.$g3896$.getDynamicValue(var100).isNegative()) {
            return (SubLObject)module0528.NIL;
        }
        SubLObject var101 = (SubLObject)ConsesLow.cons(module0178.f11287(var20), Mapping.mapcar(Symbols.symbol_function((SubLObject)module0528.$ic82$), var99));
        var101 = Sequences.delete(module0528.$ic15$, var101, (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED);
        var101 = Sequences.delete_duplicates(var101, Symbols.symbol_function((SubLObject)module0528.$ic83$), (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED);
        if (module0528.NIL != module0035.f2000(var101, (SubLObject)module0528.TWO_INTEGER, (SubLObject)module0528.UNPROVIDED)) {
            var101 = module0262.f17364(var101, (SubLObject)module0528.UNPROVIDED);
            if (module0528.NIL != module0035.f2000(var101, (SubLObject)module0528.TWO_INTEGER, (SubLObject)module0528.UNPROVIDED)) {
                final SubLObject var102 = f32983(var101);
                return var102;
            }
        }
        return (SubLObject)module0528.NIL;
    }
    
    public static SubLObject f32983(final SubLObject var117) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0528.NIL != Sequences.find_if(Symbols.symbol_function((SubLObject)module0528.$ic84$), var117, (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED) && module0528.NIL == f32984(var117));
    }
    
    public static SubLObject f32985(final SubLObject var117) {
        final SubLThread var118 = SubLProcess.currentSubLThread();
        var118.resetMultipleValues();
        final SubLObject var119 = module0035.f2092(var117, (SubLObject)module0528.$ic84$);
        final SubLObject var120 = var118.secondMultipleValue();
        var118.resetMultipleValues();
        if (module0528.NIL != var119) {
            SubLObject var122;
            final SubLObject var121 = var122 = var119;
            SubLObject var123 = (SubLObject)module0528.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var122, var121, (SubLObject)module0528.$ic86$);
            var123 = var122.first();
            final SubLObject var124;
            var122 = (var124 = var122.rest());
            final SubLObject var125 = module0262.f17312(var123, (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED);
            if (module0528.NIL != module0035.f1994(var125, module0528.$g3896$.getDynamicValue(var118), (SubLObject)module0528.UNPROVIDED)) {
                SubLObject var126 = ConsesLow.append(var124, var120);
                SubLObject var127 = (SubLObject)module0528.NIL;
                var127 = var126.first();
                while (module0528.NIL != var126) {
                    if (module0528.NIL == module0262.f17344(var125, var127, (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED)) {
                        return (SubLObject)module0528.NIL;
                    }
                    var126 = var126.rest();
                    var127 = var126.first();
                }
            }
        }
        return (SubLObject)module0528.T;
    }
    
    public static SubLObject f32984(final SubLObject var117) {
        final SubLThread var118 = SubLProcess.currentSubLThread();
        final SubLObject var119 = module0034.$g879$.getDynamicValue(var118);
        SubLObject var120 = (SubLObject)module0528.NIL;
        if (module0528.NIL == var119) {
            return f32985(var117);
        }
        var120 = module0034.f1857(var119, (SubLObject)module0528.$ic85$, (SubLObject)module0528.UNPROVIDED);
        if (module0528.NIL == var120) {
            var120 = module0034.f1807(module0034.f1842(var119), (SubLObject)module0528.$ic85$, (SubLObject)module0528.ONE_INTEGER, (SubLObject)module0528.NIL, (SubLObject)module0528.EQUAL, (SubLObject)module0528.UNPROVIDED);
            module0034.f1860(var119, (SubLObject)module0528.$ic85$, var120);
        }
        SubLObject var121 = module0034.f1814(var120, var117, (SubLObject)module0528.$ic87$);
        if (var121 == module0528.$ic87$) {
            var121 = Values.arg2(var118.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f32985(var117)));
            module0034.f1816(var120, var117, var121, (SubLObject)module0528.UNPROVIDED);
        }
        return module0034.f1959(var121);
    }
    
    public static SubLObject f32982(final SubLObject var244, SubLObject var256) {
        if (var256 == module0528.UNPROVIDED) {
            var256 = (SubLObject)module0528.ZERO_INTEGER;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0528.NIL != module0173.f10955(var244) && module0528.NIL != module0269.f17731(var244) && module0549.f33901(var244).numLE(var256));
    }
    
    public static SubLObject f32971(final SubLObject var39) {
        if (module0528.NIL != f32986(var39)) {
            final SubLObject var40 = f32987(var39);
            SubLObject var41 = (SubLObject)module0528.NIL;
            SubLObject var42 = var40;
            SubLObject var43 = (SubLObject)module0528.NIL;
            var43 = var42.first();
            while (module0528.NIL != var42) {
                var43 = Sequences.delete_duplicates(var43, Symbols.symbol_function((SubLObject)module0528.EQUAL), (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED);
                final SubLObject var44 = f32988(var43, (SubLObject)module0528.UNPROVIDED);
                var41 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var44, var43), var41);
                var42 = var42.rest();
                var43 = var42.first();
            }
            return Sequences.nreverse(var41);
        }
        return (SubLObject)module0528.NIL;
    }
    
    public static SubLObject f32969(final SubLObject var39) {
        if (module0528.NIL != f32989(var39)) {
            final SubLObject var40 = f32987(var39);
            SubLObject var41 = (SubLObject)module0528.NIL;
            SubLObject var42 = var40;
            SubLObject var43 = (SubLObject)module0528.NIL;
            var43 = var42.first();
            while (module0528.NIL != var42) {
                var43 = Sequences.delete_duplicates(var43, Symbols.symbol_function((SubLObject)module0528.EQUAL), (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED);
                if (module0528.NIL != f32986(var43)) {
                    var41 = (SubLObject)ConsesLow.cons(var43, var41);
                }
                var42 = var42.rest();
                var43 = var42.first();
            }
            return Sequences.nreverse(var41);
        }
        return (SubLObject)module0528.NIL;
    }
    
    public static SubLObject f32989(final SubLObject var39) {
        return (SubLObject)module0528.T;
    }
    
    public static SubLObject f32986(SubLObject var39) {
        final SubLThread var40 = SubLProcess.currentSubLThread();
        if (module0528.NIL == module0528.$g3897$.getDynamicValue(var40)) {
            return (SubLObject)module0528.T;
        }
        var39 = module0035.remove_if_not(Symbols.symbol_function((SubLObject)module0528.$ic9$), var39, (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED);
        if (module0528.NIL == var39) {
            return (SubLObject)module0528.T;
        }
        final SubLObject var41 = Mapping.mapcar(Symbols.symbol_function((SubLObject)module0528.$ic88$), var39);
        return module0349.f23431(var41);
    }
    
    public static SubLObject f32987(final SubLObject var39) {
        if (module0528.NIL == var39) {
            return (SubLObject)ConsesLow.list((SubLObject)module0528.NIL);
        }
        SubLObject var40 = (SubLObject)module0528.NIL;
        SubLObject var41 = (SubLObject)module0528.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var39, var39, (SubLObject)module0528.$ic89$);
        var40 = var39.first();
        final SubLObject var42 = var41 = var39.rest();
        final SubLObject var43 = f32990(var40);
        if (module0528.NIL != var43) {
            final SubLObject var44 = f32987(var41);
            return module0035.f2080(Symbols.symbol_function((SubLObject)module0528.$ic90$), var43, var44);
        }
        return (SubLObject)module0528.NIL;
    }
    
    public static SubLObject f32990(final SubLObject var16) {
        if (module0528.NIL != module0174.f11035(var16)) {
            return (SubLObject)ConsesLow.list(var16);
        }
        return module0333.f22438(var16);
    }
    
    public static SubLObject f32988(final SubLObject var39, SubLObject var264) {
        if (var264 == module0528.UNPROVIDED) {
            var264 = module0528.$g3873$.getDynamicValue();
        }
        final SubLThread var265 = SubLProcess.currentSubLThread();
        var265.resetMultipleValues();
        final SubLObject var266 = f32991(var39);
        final SubLObject var267 = var265.secondMultipleValue();
        var265.resetMultipleValues();
        final SubLObject var268 = Mapping.mapcar(Symbols.symbol_function((SubLObject)module0528.$ic82$), var266);
        if (module0528.NIL == var267) {
            return f32992(var268, var264);
        }
        final SubLObject var269 = f32993(var267);
        SubLObject var270 = (SubLObject)module0528.NIL;
        SubLObject var271 = var269;
        SubLObject var272 = (SubLObject)module0528.NIL;
        var272 = var271.first();
        while (module0528.NIL != var271) {
            var270 = conses_high.union(var270, f32992(ConsesLow.append(var272, var268), var264), (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED);
            var271 = var271.rest();
            var272 = var271.first();
        }
        if (module0528.NIL != var270) {
            var270 = module0035.f2462(var270, Symbols.symbol_function((SubLObject)module0528.$ic91$), (SubLObject)module0528.UNPROVIDED);
            return var270;
        }
        return (SubLObject)module0528.NIL;
    }
    
    public static SubLObject f32991(final SubLObject var39) {
        SubLObject var40 = (SubLObject)module0528.NIL;
        SubLObject var41 = (SubLObject)module0528.NIL;
        SubLObject var42 = var39;
        SubLObject var43 = (SubLObject)module0528.NIL;
        var43 = var42.first();
        while (module0528.NIL != var42) {
            if (module0528.NIL != f32994(module0191.f11969(var43))) {
                var41 = (SubLObject)ConsesLow.cons(var43, var41);
            }
            if (module0528.NIL != f32995(module0191.f11969(var43))) {
                var40 = (SubLObject)ConsesLow.cons(var43, var40);
            }
            var42 = var42.rest();
            var43 = var42.first();
        }
        return Values.values(Sequences.nreverse(var40), Sequences.nreverse(var41));
    }
    
    public static SubLObject f32994(final SubLObject var271) {
        final SubLThread var272 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0528.NIL != module0202.f12871(var271) || (module0528.NIL != module0528.$g3878$.getDynamicValue(var272) && module0528.NIL != module0205.f13145((SubLObject)module0528.$ic92$, var271, (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED)));
    }
    
    public static SubLObject f32995(final SubLObject var271) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0528.NIL == module0202.f12871(var271));
    }
    
    public static SubLObject f32992(SubLObject var117, SubLObject var264) {
        if (var264 == module0528.UNPROVIDED) {
            var264 = (SubLObject)module0528.NIL;
        }
        if (module0528.NIL != module0131.f8587()) {
            var117 = Sequences.remove(module0528.$ic15$, var117, (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED);
        }
        return module0349.f23437(var117, (SubLObject)((module0528.NIL != var264) ? var117 : module0528.NIL));
    }
    
    public static SubLObject f32993(final SubLObject var39) {
        if (module0528.NIL == var39) {
            return (SubLObject)ConsesLow.list((SubLObject)module0528.NIL);
        }
        SubLObject var40 = (SubLObject)module0528.NIL;
        SubLObject var41 = (SubLObject)module0528.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var39, var39, (SubLObject)module0528.$ic89$);
        var40 = var39.first();
        final SubLObject var42 = var41 = var39.rest();
        final SubLObject var43 = f32996(var40);
        final SubLObject var44 = f32993(var41);
        return module0035.f2080(Symbols.symbol_function((SubLObject)module0528.$ic90$), var43, var44);
    }
    
    public static SubLObject f32996(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        final SubLObject var18 = module0191.f11969(var16);
        return ConsesLow.append(f32997(var18), (SubLObject)((module0528.NIL != module0528.$g3878$.getDynamicValue(var17)) ? f32998(var18) : module0528.NIL));
    }
    
    public static SubLObject f32997(final SubLObject var271) {
        if (module0528.NIL != module0202.f12871(var271)) {
            final SubLObject var272 = module0202.f12835(var271, (SubLObject)module0528.UNPROVIDED);
            return conses_high.copy_list(module0349.f23443(var272));
        }
        return (SubLObject)module0528.NIL;
    }
    
    public static SubLObject f32998(final SubLObject var271) {
        SubLObject var272 = (SubLObject)module0528.NIL;
        SubLObject var273 = module0205.f13183(var271, (SubLObject)module0528.$ic92$, (SubLObject)module0528.NIL, (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED, (SubLObject)module0528.UNPROVIDED);
        SubLObject var274 = (SubLObject)module0528.NIL;
        var274 = var273.first();
        while (module0528.NIL != var273) {
            SubLObject var275 = module0226.f15152(var274);
            if (module0528.NIL == var275) {
                var275 = module0132.$g1547$.getGlobalValue();
            }
            var272 = (SubLObject)ConsesLow.cons(var275, var272);
            var273 = var273.rest();
            var274 = var273.first();
        }
        return Sequences.nreverse(var272);
    }
    
    public static SubLObject f32999() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32897", "S#360", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32898", "S#362", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32900", "S#36344", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32901", "S#36345", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32899", "S#36346", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32902", "S#36347", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32903", "S#36348", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32904", "S#36349", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32905", "S#36350", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0528", "f32906", "S#36351");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0528", "f32907", "S#36352");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32908", "S#31873", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32909", "S#21482", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32910", "S#35261", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32911", "S#36353", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32912", "S#36354", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32913", "S#36355", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32914", "S#36356", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32915", "S#692", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32916", "S#36357", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32917", "S#13966", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32918", "S#25818", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32919", "S#36358", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32920", "S#36359", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32921", "S#22113", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32922", "S#36360", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32924", "S#36361", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32925", "S#36362", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32926", "S#36363", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32927", "S#36364", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32928", "S#36365", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32929", "S#36366", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32923", "S#25962", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32930", "S#36367", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32931", "S#36368", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32932", "S#36369", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32935", "S#36370", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32936", "S#36371", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32933", "S#36372", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32939", "S#36373", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32934", "S#36374", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32937", "S#36375", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32941", "S#36376", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32942", "S#36377", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32938", "S#36378", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32943", "S#36379", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32944", "S#36380", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32946", "S#36381", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32947", "S#36382", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32948", "S#36383", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32945", "S#36384", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32949", "S#36385", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32950", "S#36386", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32951", "S#36387", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32952", "S#36388", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32953", "S#36389", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32954", "S#36390", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32940", "S#36391", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32956", "S#36392", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32959", "S#29938", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32960", "S#36393", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32961", "S#26002", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32964", "S#26003", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32966", "S#36394", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32963", "S#36395", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32965", "S#36396", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32962", "S#36397", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32957", "S#36398", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32967", "S#36399", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32968", "S#36400", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32970", "S#36401", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32974", "S#36402", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32976", "S#36403", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32975", "S#36404", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32978", "S#36405", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32977", "S#36406", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32972", "S#36407", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32973", "S#36408", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32979", "S#36409", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32980", "S#36410", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32958", "S#36411", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32981", "S#36412", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32955", "S#36413", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32983", "S#36414", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32985", "S#36415", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32984", "S#36416", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32982", "S#36417", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32971", "S#24971", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32969", "S#36418", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32989", "S#36419", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32986", "S#36420", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32987", "S#36421", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32990", "S#36422", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32988", "S#36423", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32991", "S#36424", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32994", "S#36425", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32995", "S#36426", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32992", "S#36427", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32993", "S#36428", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32996", "S#36429", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32997", "S#36430", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0528", "f32998", "S#36431", 1, 0, false);
        return (SubLObject)module0528.NIL;
    }
    
    public static SubLObject f33000() {
        module0528.$g3873$ = SubLFiles.defparameter("S#36432", (SubLObject)module0528.NIL);
        module0528.$g3874$ = SubLFiles.defvar("S#36433", (SubLObject)module0528.NIL);
        module0528.$g3875$ = SubLFiles.defparameter("S#36434", (SubLObject)module0528.NIL);
        module0528.$g3876$ = SubLFiles.defvar("S#36435", (SubLObject)module0528.NIL);
        module0528.$g3877$ = SubLFiles.defparameter("S#36436", (SubLObject)module0528.NIL);
        module0528.$g2982$ = SubLFiles.deflexical("S#36437", (SubLObject)module0528.ONE_INTEGER);
        module0528.$g3878$ = SubLFiles.defparameter("S#36438", (SubLObject)module0528.T);
        module0528.$g3879$ = SubLFiles.deflexical("S#36439", (module0528.NIL != Symbols.boundp((SubLObject)module0528.$ic0$)) ? module0528.$g3879$.getGlobalValue() : Locks.make_lock((SubLObject)module0528.$ic1$));
        module0528.$g3880$ = SubLFiles.defparameter("S#36440", module0055.f4017());
        module0528.$g3881$ = SubLFiles.defparameter("S#36441", (SubLObject)module0528.NIL);
        module0528.$g3882$ = SubLFiles.defparameter("S#36442", (SubLObject)module0528.NIL);
        module0528.$g3883$ = SubLFiles.deflexical("S#36443", (SubLObject)module0528.$ic8$);
        module0528.$g3884$ = SubLFiles.defparameter("S#36444", (SubLObject)module0528.T);
        module0528.$g3885$ = SubLFiles.defparameter("S#36445", (SubLObject)module0528.ZERO_INTEGER);
        module0528.$g3886$ = SubLFiles.defparameter("S#36446", (SubLObject)module0528.NIL);
        module0528.$g3887$ = SubLFiles.defparameter("S#36447", (SubLObject)module0528.NIL);
        module0528.$g3888$ = SubLFiles.defparameter("S#36448", (SubLObject)module0528.NIL);
        module0528.$g3889$ = SubLFiles.defparameter("S#25424", (SubLObject)module0528.T);
        module0528.$g3890$ = SubLFiles.defparameter("S#36449", (SubLObject)module0528.NIL);
        module0528.$g3891$ = SubLFiles.defparameter("S#36450", (SubLObject)module0528.NIL);
        module0528.$g3892$ = SubLFiles.defvar("S#36451", (SubLObject)module0528.T);
        module0528.$g3893$ = SubLFiles.defvar("S#36452", (SubLObject)module0528.NIL);
        module0528.$g3894$ = SubLFiles.defvar("S#36453", (SubLObject)module0528.NIL);
        module0528.$g3895$ = SubLFiles.defvar("S#36454", (SubLObject)module0528.T);
        module0528.$g3896$ = SubLFiles.defparameter("S#36455", (SubLObject)module0528.MINUS_ONE_INTEGER);
        module0528.$g3897$ = SubLFiles.defparameter("S#36456", (SubLObject)module0528.T);
        return (SubLObject)module0528.NIL;
    }
    
    public static SubLObject f33001() {
        module0003.f57((SubLObject)module0528.$ic0$);
        module0012.f419((SubLObject)module0528.$ic75$);
        module0034.f1895((SubLObject)module0528.$ic85$);
        return (SubLObject)module0528.NIL;
    }
    
    public void declareFunctions() {
        f32999();
    }
    
    public void initializeVariables() {
        f33000();
    }
    
    public void runTopLevelForms() {
        f33001();
    }
    
    static {
        me = (SubLFile)new module0528();
        module0528.$g3873$ = null;
        module0528.$g3874$ = null;
        module0528.$g3875$ = null;
        module0528.$g3876$ = null;
        module0528.$g3877$ = null;
        module0528.$g2982$ = null;
        module0528.$g3878$ = null;
        module0528.$g3879$ = null;
        module0528.$g3880$ = null;
        module0528.$g3881$ = null;
        module0528.$g3882$ = null;
        module0528.$g3883$ = null;
        module0528.$g3884$ = null;
        module0528.$g3885$ = null;
        module0528.$g3886$ = null;
        module0528.$g3887$ = null;
        module0528.$g3888$ = null;
        module0528.$g3889$ = null;
        module0528.$g3890$ = null;
        module0528.$g3891$ = null;
        module0528.$g3892$ = null;
        module0528.$g3893$ = null;
        module0528.$g3894$ = null;
        module0528.$g3895$ = null;
        module0528.$g3896$ = null;
        module0528.$g3897$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#36439", "CYC");
        $ic1$ = SubLObjectFactory.makeString("Global forward inference environment lock");
        $ic2$ = SubLObjectFactory.makeSymbol("S#5859", "CYC");
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14595", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic4$ = SubLObjectFactory.makeSymbol("CLET");
        $ic5$ = SubLObjectFactory.makeSymbol("S#36441", "CYC");
        $ic6$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13097", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic7$ = SubLObjectFactory.makeSymbol("S#36442", "CYC");
        $ic8$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TRANSFORMATION-ALLOWED?"), module0528.NIL, SubLObjectFactory.makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), SubLObjectFactory.makeKeyword("NONE"), SubLObjectFactory.makeKeyword("NEGATION-BY-FAILURE?"), module0528.NIL, SubLObjectFactory.makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), module0528.T, SubLObjectFactory.makeKeyword("DIRECTION"), SubLObjectFactory.makeKeyword("FORWARD") });
        $ic9$ = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $ic10$ = SubLObjectFactory.makeString("~%~S");
        $ic11$ = SubLObjectFactory.makeString("Forward inference recursion problem? depth = ~S");
        $ic12$ = SubLObjectFactory.makeSymbol("S#690", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#11995", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#12732", "CYC");
        $ic15$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $ic16$ = SubLObjectFactory.makeSymbol("SUPPORT-P");
        $ic17$ = SubLObjectFactory.makeSymbol("S#747", "CYC");
        $ic18$ = SubLObjectFactory.makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic19$ = SubLObjectFactory.makeSymbol("<");
        $ic20$ = SubLObjectFactory.makeSymbol("ASSERTION-ID");
        $ic21$ = SubLObjectFactory.makeString("~s was removed by its own forward propagation");
        $ic22$ = SubLObjectFactory.makeSymbol("S#14109", "CYC");
        $ic23$ = SubLObjectFactory.makeString("invalid hl-assertible ~s encountered during forward inference");
        $ic24$ = SubLObjectFactory.makeString("~S does not have an atomic sentence.");
        $ic25$ = SubLObjectFactory.makeKeyword("POS");
        $ic26$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#36457", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#36458", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#36459", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#36460", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13097", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#36461", "CYC"));
        $ic27$ = SubLObjectFactory.makeKeyword("NEG");
        $ic28$ = SubLObjectFactory.makeKeyword("ALL");
        $ic29$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("creationTemplateFORTs"));
        $ic30$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic31$ = SubLObjectFactory.makeSymbol("?TEMPLATE");
        $ic32$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlCreationTemplate"));
        $ic33$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?TEMPLATE"));
        $ic34$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic35$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("creationTemplateAllowableRules"));
        $ic36$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("creationTemplateAllowsAllRulesFromMt"));
        $ic37$ = SubLObjectFactory.makeKeyword("MT");
        $ic38$ = SubLObjectFactory.makeKeyword("RULE");
        $ic39$ = SubLObjectFactory.makeKeyword("BROAD-MT");
        $ic40$ = SubLObjectFactory.makeString("do-broad-mt-index");
        $ic41$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic42$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic43$ = SubLObjectFactory.makeKeyword("FALSE");
        $ic44$ = SubLObjectFactory.makeKeyword("INFERENCE-REJECTED");
        $ic45$ = SubLObjectFactory.makeSymbol("S#15515", "CYC");
        $ic46$ = SubLObjectFactory.makeKeyword("TARGET-ASENT");
        $ic47$ = SubLObjectFactory.makeKeyword("TARGET-TRUTH");
        $ic48$ = SubLObjectFactory.makeKeyword("TRIGGER-BINDINGS");
        $ic49$ = SubLObjectFactory.makeKeyword("TRIGGER-SUPPORTS");
        $ic50$ = SubLObjectFactory.makeKeyword("FORWARD-RESULTS");
        $ic51$ = SubLObjectFactory.makeString("Tried to do forward inference outside of a problem store");
        $ic52$ = SubLObjectFactory.makeKeyword("PROBLEM-STORE");
        $ic53$ = SubLObjectFactory.makeKeyword("NON-EXPLANATORY-SENTENCE");
        $ic54$ = SubLObjectFactory.makeKeyword("ALLOW-INDETERMINATE-RESULTS?");
        $ic55$ = SubLObjectFactory.makeKeyword("BROWSABLE?");
        $ic56$ = SubLObjectFactory.makeKeyword("BLOCK?");
        $ic57$ = SubLObjectFactory.makeKeyword("PRODUCTIVITY-LIMIT");
        $ic58$ = SubLObjectFactory.makeKeyword("PROBABLY-APPROXIMATELY-DONE");
        $ic59$ = SubLObjectFactory.makeKeyword("MAX-TIME");
        $ic60$ = SubLObjectFactory.makeKeyword("RESULT-UNIQUENESS");
        $ic61$ = SubLObjectFactory.makeKeyword("PROOF");
        $ic62$ = SubLObjectFactory.makeKeyword("RETURN");
        $ic63$ = SubLObjectFactory.makeKeyword("BINDINGS-AND-SUPPORTS-AND-PRAGMATIC-SUPPORTS");
        $ic64$ = SubLObjectFactory.makeKeyword("NEW-TERMS-ALLOWED?");
        $ic65$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#36462", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#36463", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#36464", "CYC"));
        $ic66$ = ConsesLow.list((SubLObject)module0528.NIL, (SubLObject)module0528.NIL, (SubLObject)module0528.NIL);
        $ic67$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#36465", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#26201", "CYC"));
        $ic68$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13097", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#36466", "CYC"));
        $ic69$ = SubLObjectFactory.makeString("Canonicalization of ~s in ~s invalidated the forward supports ~s");
        $ic70$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("InferencePSC")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC")));
        $ic71$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#15050", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#15051", "CYC"));
        $ic72$ = SubLObjectFactory.makeSymbol("CNF-P");
        $ic73$ = SubLObjectFactory.makeKeyword("FORWARD");
        $ic74$ = SubLObjectFactory.makeSymbol("S#20809", "CYC");
        $ic75$ = SubLObjectFactory.makeSymbol("S#36405", "CYC");
        $ic76$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("WFFConstraintPredicate"));
        $ic77$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("wffConstraintMt"));
        $ic78$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("constraint"));
        $ic79$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("False"));
        $ic80$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("True"));
        $ic81$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("forwardNonTriggerLiteral"));
        $ic82$ = SubLObjectFactory.makeSymbol("SUPPORT-MT");
        $ic83$ = SubLObjectFactory.makeSymbol("HLMT-EQUAL");
        $ic84$ = SubLObjectFactory.makeSymbol("S#36412", "CYC");
        $ic85$ = SubLObjectFactory.makeSymbol("S#36416", "CYC");
        $ic86$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#36467", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#36468", "CYC"));
        $ic87$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic88$ = SubLObjectFactory.makeSymbol("ASSERTION-MT");
        $ic89$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("REST"));
        $ic90$ = SubLObjectFactory.makeSymbol("CONS");
        $ic91$ = SubLObjectFactory.makeSymbol("S#19882", "CYC");
        $ic92$ = SubLObjectFactory.makeSymbol("S#17907", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0528.class
	Total time: 770 ms
	
	Decompiled with Procyon 0.5.32.
*/