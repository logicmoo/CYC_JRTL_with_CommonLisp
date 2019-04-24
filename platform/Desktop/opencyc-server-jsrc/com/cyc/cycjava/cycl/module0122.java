package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0122 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0122";
    public static final String myFingerPrint = "8fd14a0cdc2ed1f3dde6fda6af7af06c786ec84d63b67cfb0b5dbafe63ca50c9";
    public static SubLSymbol $g1482$;
    public static SubLSymbol $g1483$;
    private static SubLSymbol $g1484$;
    private static SubLSymbol $g1485$;
    private static SubLSymbol $g1486$;
    private static SubLSymbol $g1487$;
    public static SubLSymbol $g1488$;
    private static SubLSymbol $g1489$;
    private static SubLSymbol $g1490$;
    private static SubLSymbol $g1491$;
    public static SubLSymbol $g1492$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLString $ic10$;
    private static final SubLString $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLList $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLList $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLList $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLList $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLList $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLList $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLList $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLList $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLList $ic37$;
    private static final SubLList $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLList $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLList $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLList $ic48$;
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
    private static final SubLList $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLList $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLString $ic71$;
    private static final SubLSymbol $ic72$;
    
    public static SubLObject f8287() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0122.$ic0$ == module0122.$g1482$.getDynamicValue(var1) || module0122.$ic1$ == module0122.$g1482$.getDynamicValue(var1) || module0122.$ic2$ == module0122.$g1482$.getDynamicValue(var1));
    }
    
    public static SubLObject f8288() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0122.$ic3$ == module0122.$g1482$.getDynamicValue(var1) || module0122.$ic1$ == module0122.$g1482$.getDynamicValue(var1) || module0122.$ic2$ == module0122.$g1482$.getDynamicValue(var1));
    }
    
    public static SubLObject f8289() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0122.$ic0$ == module0122.$g1482$.getDynamicValue(var1) || module0122.$ic3$ == module0122.$g1482$.getDynamicValue(var1) || module0122.$ic1$ == module0122.$g1482$.getDynamicValue(var1) || module0122.$ic2$ == module0122.$g1482$.getDynamicValue(var1));
    }
    
    public static SubLObject f8290() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0122.NIL != module0122.$g1483$.getDynamicValue(var1) || module0122.$ic0$ == module0122.$g1482$.getDynamicValue(var1) || module0122.$ic1$ == module0122.$g1482$.getDynamicValue(var1) || module0122.$ic4$ == module0122.$g1482$.getDynamicValue(var1));
    }
    
    public static SubLObject f8291() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0122.NIL == module0122.$g1483$.getDynamicValue(var1) && (module0122.$ic3$ == module0122.$g1482$.getDynamicValue(var1) || module0122.$ic2$ == module0122.$g1482$.getDynamicValue(var1)));
    }
    
    public static SubLObject f8292(final SubLObject var2, final SubLObject var3) {
        final SubLObject var4 = var2.rest();
        final SubLObject var6;
        final SubLObject var5 = var6 = var4;
        return (SubLObject)ConsesLow.listS((SubLObject)module0122.$ic5$, (SubLObject)module0122.$ic6$, ConsesLow.append(var6, (SubLObject)module0122.NIL));
    }
    
    public static SubLObject f8293(final SubLObject var2, final SubLObject var3) {
        final SubLObject var4 = var2.rest();
        final SubLObject var6;
        final SubLObject var5 = var6 = var4;
        return (SubLObject)ConsesLow.listS((SubLObject)module0122.$ic5$, (SubLObject)module0122.$ic7$, ConsesLow.append(var6, (SubLObject)module0122.NIL));
    }
    
    public static SubLObject f8294(final SubLObject var9, final SubLObject var10, final SubLObject var11) {
        module0122.$g1484$.setGlobalValue(module0103.f7380(var9, var10, var11));
        return module0103.f7367(module0122.$g1484$.getGlobalValue());
    }
    
    public static SubLObject f8295() {
        module0122.$g1484$.setGlobalValue((SubLObject)module0122.NIL);
        return (SubLObject)module0122.T;
    }
    
    public static SubLObject f8296() {
        for (SubLObject var12 = module0122.$g1485$.getGlobalValue(), var13 = module0055.f4019(var12); module0122.NIL == var13; var13 = module0055.f4019(var12)) {
            final SubLObject var14 = module0055.f4023(var12);
            module0103.f7397(var14);
        }
        return (SubLObject)module0122.T;
    }
    
    public static SubLObject f8297() {
        final SubLObject var14 = module0103.f7393(module0122.$g1484$.getGlobalValue());
        if (module0122.NIL != module0103.f7383(var14)) {
            module0103.f7394(var14);
            return var14;
        }
        return Errors.error((SubLObject)module0122.$ic11$, module0122.$g1484$.getGlobalValue());
    }
    
    public static SubLObject f8298(final SubLObject var14) {
        final SubLObject var15 = module0122.$g1486$.getGlobalValue();
        SubLObject var16 = (SubLObject)module0122.NIL;
        try {
            var16 = Locks.seize_lock(var15);
            if (module0055.f4016(module0122.$g1485$.getGlobalValue()).numGE(module0122.$g1487$.getGlobalValue())) {
                module0103.f7397(var14);
            }
            else {
                module0055.f4021(var14, module0122.$g1485$.getGlobalValue());
            }
        }
        finally {
            if (module0122.NIL != var16) {
                Locks.release_lock(var15);
            }
        }
        return (SubLObject)module0122.T;
    }
    
    public static SubLObject f8299(final SubLObject var17) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0122.NIL != module0103.f7383(var17) && module0122.NIL != module0103.f7399(var17));
    }
    
    public static SubLObject f8300() {
        SubLObject var14 = (SubLObject)module0122.NIL;
        final SubLObject var15 = module0122.$g1486$.getGlobalValue();
        SubLObject var16 = (SubLObject)module0122.NIL;
        try {
            var16 = Locks.seize_lock(var15);
            for (SubLObject var17 = module0122.$g1485$.getGlobalValue(), var18 = (SubLObject)SubLObjectFactory.makeBoolean(module0122.NIL != var14 || module0122.NIL != module0055.f4019(var17)); module0122.NIL == var18; var18 = (SubLObject)SubLObjectFactory.makeBoolean(module0122.NIL != var14 || module0122.NIL != module0055.f4019(var17))) {
                final SubLObject var19 = module0055.f4023(var17);
                if (module0122.NIL != f8299(var19)) {
                    var14 = var19;
                }
            }
            if (module0122.NIL == var14) {
                var14 = f8297();
            }
        }
        finally {
            if (module0122.NIL != var16) {
                Locks.release_lock(var15);
            }
        }
        return var14;
    }
    
    public static SubLObject f8301() {
        return f8296();
    }
    
    public static SubLObject f8302(final SubLObject var9, final SubLObject var10, SubLObject var11) {
        if (var11 == module0122.UNPROVIDED) {
            var11 = (SubLObject)module0122.$ic12$;
        }
        f8294(var9, var10, var11);
        f8296();
        return (SubLObject)module0122.T;
    }
    
    public static SubLObject f8303() {
        f8295();
        f8296();
        return (SubLObject)module0122.T;
    }
    
    public static SubLObject f8304(final SubLObject var21) {
        final SubLThread var22 = SubLProcess.currentSubLThread();
        SubLObject var23 = (SubLObject)module0122.NIL;
        SubLObject var24 = (SubLObject)module0122.NIL;
        try {
            var22.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var25 = Errors.$error_handler$.currentBinding(var22);
            try {
                Errors.$error_handler$.bind((SubLObject)module0122.$ic13$, var22);
                try {
                    final SubLObject var26 = f8300();
                    final SubLObject var24_25 = module0021.$g777$.currentBinding(var22);
                    try {
                        module0021.$g777$.bind((SubLObject)module0122.NIL, var22);
                        module0021.f1149((SubLObject)module0122.NIL);
                        final SubLObject var24_26 = module0111.$g1394$.currentBinding(var22);
                        final SubLObject var27 = module0111.$g1396$.currentBinding(var22);
                        final SubLObject var28 = module0111.$g1398$.currentBinding(var22);
                        final SubLObject var29 = module0021.$g754$.currentBinding(var22);
                        try {
                            module0111.$g1394$.bind((SubLObject)module0122.NIL, var22);
                            module0111.$g1396$.bind((SubLObject)module0122.NIL, var22);
                            module0111.$g1398$.bind((SubLObject)module0122.NIL, var22);
                            module0021.$g754$.bind((SubLObject)module0122.NIL, var22);
                            SubLObject var30 = (SubLObject)module0122.NIL;
                            try {
                                var23 = module0103.f7398(var26, var21);
                                f8298(var26);
                                var30 = (SubLObject)module0122.T;
                            }
                            finally {
                                final SubLObject var24_27 = Threads.$is_thread_performing_cleanupP$.currentBinding(var22);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0122.T, var22);
                                    if (module0122.NIL == var30) {
                                        module0103.f7397(var26);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var24_27, var22);
                                }
                            }
                        }
                        finally {
                            module0021.$g754$.rebind(var29, var22);
                            module0111.$g1398$.rebind(var28, var22);
                            module0111.$g1396$.rebind(var27, var22);
                            module0111.$g1394$.rebind(var24_26, var22);
                        }
                    }
                    finally {
                        module0021.$g777$.rebind(var24_25, var22);
                    }
                }
                catch (Throwable var31) {
                    Errors.handleThrowable(var31, (SubLObject)module0122.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var25, var22);
            }
        }
        catch (Throwable var32) {
            var24 = Errors.handleThrowable(var32, module0003.$g3$.getGlobalValue());
        }
        finally {
            var22.throwStack.pop();
        }
        if (module0122.NIL != var24) {
            f8305(var24);
        }
        return var23;
    }
    
    public static SubLObject f8306(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        SubLObject var6 = (SubLObject)module0122.NIL;
        SubLObject var7 = (SubLObject)module0122.NIL;
        SubLObject var8 = (SubLObject)module0122.NIL;
        SubLObject var9 = (SubLObject)module0122.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0122.$ic14$);
        var6 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0122.$ic14$);
        var7 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0122.$ic14$);
        var8 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0122.$ic14$);
        var9 = var5.first();
        final SubLObject var10;
        var5 = (var10 = var5.rest());
        final SubLObject var11 = module0034.f1900(var7);
        return (SubLObject)ConsesLow.list((SubLObject)module0122.$ic15$, var6, var7, var8, var9, (SubLObject)ConsesLow.list((SubLObject)module0122.$ic16$, (SubLObject)module0122.$ic17$, (SubLObject)ConsesLow.listS((SubLObject)module0122.$ic18$, (SubLObject)ConsesLow.list((SubLObject)module0122.$ic19$, var6), ConsesLow.append(var11, (SubLObject)module0122.NIL)), (SubLObject)ConsesLow.listS((SubLObject)module0122.$ic20$, (SubLObject)module0122.$ic21$, reader.bq_cons((SubLObject)module0122.$ic22$, ConsesLow.append(var10, (SubLObject)module0122.NIL)), (SubLObject)module0122.$ic23$)));
    }
    
    public static SubLObject f8307(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        SubLObject var6 = (SubLObject)module0122.NIL;
        SubLObject var7 = (SubLObject)module0122.NIL;
        SubLObject var8 = (SubLObject)module0122.NIL;
        SubLObject var9 = (SubLObject)module0122.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0122.$ic14$);
        var6 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0122.$ic14$);
        var7 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0122.$ic14$);
        var8 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0122.$ic14$);
        var9 = var5.first();
        final SubLObject var10;
        var5 = (var10 = var5.rest());
        final SubLObject var11 = module0034.f1900(var7);
        SubLObject var12 = (SubLObject)module0122.NIL;
        SubLObject var13 = var11;
        SubLObject var14 = (SubLObject)module0122.NIL;
        var14 = var13.first();
        while (module0122.NIL != var13) {
            final SubLObject var15 = (SubLObject)ConsesLow.list((SubLObject)module0122.$ic24$, (SubLObject)module0122.$ic25$, var14);
            var12 = (SubLObject)ConsesLow.cons(var15, var12);
            var13 = var13.rest();
            var14 = var13.first();
        }
        var12 = Sequences.nreverse(var12);
        final SubLObject var16 = (SubLObject)module0122.$ic26$;
        return (SubLObject)ConsesLow.list((SubLObject)module0122.$ic15$, var6, var7, var8, var9, (SubLObject)ConsesLow.list((SubLObject)module0122.$ic5$, (SubLObject)ConsesLow.list(var16), (SubLObject)module0122.$ic17$, (SubLObject)ConsesLow.listS((SubLObject)module0122.$ic18$, (SubLObject)ConsesLow.list((SubLObject)module0122.$ic19$, var6), ConsesLow.append(var11, (SubLObject)module0122.NIL)), (SubLObject)ConsesLow.list((SubLObject)module0122.$ic27$, (SubLObject)module0122.$ic28$, (SubLObject)ConsesLow.list((SubLObject)module0122.$ic29$, var16, (SubLObject)ConsesLow.list((SubLObject)module0122.$ic30$, (SubLObject)ConsesLow.listS((SubLObject)module0122.$ic24$, (SubLObject)ConsesLow.list((SubLObject)module0122.$ic19$, var6), ConsesLow.append(var12, (SubLObject)module0122.NIL))))), (SubLObject)ConsesLow.list((SubLObject)module0122.$ic20$, (SubLObject)module0122.$ic31$, (SubLObject)ConsesLow.list((SubLObject)module0122.$ic32$, reader.bq_cons((SubLObject)module0122.$ic22$, ConsesLow.append(var10, (SubLObject)module0122.NIL))), (SubLObject)ConsesLow.list((SubLObject)module0122.$ic33$, var16))));
    }
    
    public static SubLObject f8308() {
        module0034.f1942();
        return (SubLObject)module0122.NIL;
    }
    
    public static SubLObject f8309() {
        module0034.f1942();
        return (SubLObject)module0122.NIL;
    }
    
    public static SubLObject f8310(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        SubLObject var6 = (SubLObject)module0122.NIL;
        SubLObject var7 = (SubLObject)module0122.NIL;
        SubLObject var8 = (SubLObject)module0122.NIL;
        SubLObject var9 = (SubLObject)module0122.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0122.$ic14$);
        var6 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0122.$ic14$);
        var7 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0122.$ic14$);
        var8 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0122.$ic14$);
        var9 = var5.first();
        final SubLObject var10;
        var5 = (var10 = var5.rest());
        final SubLObject var11 = module0034.f1900(var7);
        SubLObject var12 = (SubLObject)module0122.NIL;
        SubLObject var13 = var11;
        SubLObject var14 = (SubLObject)module0122.NIL;
        var14 = var13.first();
        while (module0122.NIL != var13) {
            final SubLObject var15 = (SubLObject)ConsesLow.list((SubLObject)module0122.$ic24$, (SubLObject)module0122.$ic25$, var14);
            var12 = (SubLObject)ConsesLow.cons(var15, var12);
            var13 = var13.rest();
            var14 = var13.first();
        }
        var12 = Sequences.nreverse(var12);
        return (SubLObject)ConsesLow.list((SubLObject)module0122.$ic15$, var6, var7, var8, var9, (SubLObject)ConsesLow.list((SubLObject)module0122.$ic20$, (SubLObject)module0122.$ic37$, (SubLObject)ConsesLow.list((SubLObject)module0122.$ic33$, (SubLObject)ConsesLow.list((SubLObject)module0122.$ic30$, (SubLObject)ConsesLow.listS((SubLObject)module0122.$ic24$, (SubLObject)ConsesLow.list((SubLObject)module0122.$ic19$, var6), ConsesLow.append(var12, (SubLObject)module0122.NIL)))), reader.bq_cons((SubLObject)module0122.$ic16$, ConsesLow.append(var10, (SubLObject)module0122.NIL))));
    }
    
    public static SubLObject f8311(final SubLObject var49) {
        return module0004.f104(var49, (SubLObject)module0122.$ic38$, Symbols.symbol_function((SubLObject)module0122.EQ), (SubLObject)module0122.UNPROVIDED);
    }
    
    public static SubLObject f8312() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return (SubLObject)((module0122.NIL != module0122.$g1488$.getDynamicValue(var1)) ? module0122.$g1488$.getDynamicValue(var1) : module0122.$ic39$);
    }
    
    public static SubLObject f8305(final SubLObject var23) {
        assert module0122.NIL != Types.stringp(var23) : var23;
        final SubLObject var24 = f8312();
        if (var24.eql((SubLObject)module0122.$ic41$)) {
            return (SubLObject)module0122.NIL;
        }
        if (var24.eql((SubLObject)module0122.$ic42$)) {
            return Errors.warn(var23);
        }
        if (var24.eql((SubLObject)module0122.$ic39$)) {
            return Errors.error(var23);
        }
        return (SubLObject)module0122.NIL;
    }
    
    public static SubLObject f8313(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        SubLObject var6 = (SubLObject)module0122.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0122.$ic43$);
        var6 = var5.first();
        final SubLObject var7;
        var5 = (var7 = var5.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0122.$ic16$, (SubLObject)ConsesLow.listS((SubLObject)module0122.$ic44$, var6, (SubLObject)module0122.$ic45$), (SubLObject)ConsesLow.listS((SubLObject)module0122.$ic5$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0122.$ic46$, var6)), ConsesLow.append(var7, (SubLObject)module0122.NIL)));
    }
    
    public static SubLObject f8314(final SubLObject var2, final SubLObject var3) {
        final SubLObject var4 = var2.rest();
        final SubLObject var6;
        final SubLObject var5 = var6 = var4;
        return (SubLObject)ConsesLow.listS((SubLObject)module0122.$ic47$, (SubLObject)module0122.$ic41$, ConsesLow.append(var6, (SubLObject)module0122.NIL));
    }
    
    public static SubLObject f8315(final SubLObject var2, final SubLObject var3) {
        final SubLObject var4 = var2.rest();
        final SubLObject var6;
        final SubLObject var5 = var6 = var4;
        return (SubLObject)ConsesLow.listS((SubLObject)module0122.$ic47$, (SubLObject)module0122.$ic42$, ConsesLow.append(var6, (SubLObject)module0122.NIL));
    }
    
    public static SubLObject f8316(final SubLObject var2, final SubLObject var3) {
        final SubLObject var4 = var2.rest();
        final SubLObject var6;
        final SubLObject var5 = var6 = var4;
        return (SubLObject)ConsesLow.list((SubLObject)module0122.$ic5$, (SubLObject)module0122.$ic48$, (SubLObject)ConsesLow.listS((SubLObject)module0122.$ic47$, (SubLObject)module0122.$ic39$, ConsesLow.append(var6, (SubLObject)module0122.NIL)));
    }
    
    public static SubLObject f8317() {
        module0122.$g1490$.setGlobalValue((SubLObject)module0122.ZERO_INTEGER);
        return module0122.$g1490$.getGlobalValue();
    }
    
    public static SubLObject f8318() {
        final SubLObject var59 = module0122.$g1490$.getGlobalValue();
        module0122.$g1490$.setGlobalValue(Numbers.add(module0122.$g1490$.getGlobalValue(), (SubLObject)module0122.ONE_INTEGER));
        if (module0122.$g1490$.getGlobalValue().numE(Numbers.$most_positive_fixnum$.getGlobalValue())) {
            module0122.$g1490$.setGlobalValue((SubLObject)module0122.ZERO_INTEGER);
        }
        return var59;
    }
    
    public static SubLObject f8319() {
        SubLObject var59;
        for (var59 = f8318(); module0122.NIL != f8320(var59); var59 = f8318()) {}
        return var59;
    }
    
    public static SubLObject f8321(final SubLObject var60) {
        SubLObject var61 = (SubLObject)module0122.NIL;
        final SubLObject var62 = module0122.$g1491$.getGlobalValue();
        SubLObject var63 = (SubLObject)module0122.NIL;
        try {
            var63 = Locks.seize_lock(var62);
            var61 = f8319();
            module0067.f4886(module0122.$g1489$.getGlobalValue(), var61, var60);
        }
        finally {
            if (module0122.NIL != var63) {
                Locks.release_lock(var62);
            }
        }
        return var61;
    }
    
    public static SubLObject f8320(final SubLObject var61) {
        return module0067.f4885(module0122.$g1489$.getGlobalValue(), var61, (SubLObject)module0122.UNPROVIDED);
    }
    
    public static SubLObject f8322(final SubLObject var61) {
        SubLObject var62 = (SubLObject)module0122.NIL;
        final SubLObject var63 = module0122.$g1491$.getGlobalValue();
        SubLObject var64 = (SubLObject)module0122.NIL;
        try {
            var64 = Locks.seize_lock(var63);
            var62 = module0067.f4887(module0122.$g1489$.getGlobalValue(), var61);
        }
        finally {
            if (module0122.NIL != var64) {
                Locks.release_lock(var63);
            }
        }
        return var62;
    }
    
    public static SubLObject f8323(final SubLObject var21) {
        final SubLObject var22 = Eval.eval(var21);
        return (SubLObject)((module0122.NIL != module0052.f3674(var22)) ? f8321(var22) : module0122.NIL);
    }
    
    public static SubLObject f8324(final SubLObject var61) {
        final SubLThread var62 = SubLProcess.currentSubLThread();
        final SubLObject var63 = f8320(var61);
        if (module0122.NIL != var63) {
            var62.resetMultipleValues();
            final SubLObject var64 = module0052.f3693(var63);
            final SubLObject var65 = var62.secondMultipleValue();
            var62.resetMultipleValues();
            return (SubLObject)ConsesLow.list(var64, var65);
        }
        return (SubLObject)ConsesLow.list((SubLObject)module0122.NIL, (SubLObject)module0122.NIL);
    }
    
    public static SubLObject f8325(final SubLObject var61, final SubLObject var68) {
        final SubLThread var69 = SubLProcess.currentSubLThread();
        final SubLObject var70 = f8320(var61);
        SubLObject var71 = (SubLObject)module0122.NIL;
        if (module0122.NIL != var70) {
            SubLObject var72;
            SubLObject var73;
            SubLObject var74;
            SubLObject var75;
            for (var72 = (SubLObject)module0122.NIL, var73 = (SubLObject)module0122.NIL, var73 = (SubLObject)module0122.ZERO_INTEGER; !var73.numG(var68) && module0122.NIL == var72; var73 = Numbers.add(var73, (SubLObject)module0122.ONE_INTEGER)) {
                var69.resetMultipleValues();
                var74 = module0052.f3693(var70);
                var75 = var69.secondMultipleValue();
                var69.resetMultipleValues();
                if (module0122.NIL != var75) {
                    var71 = (SubLObject)ConsesLow.cons(var74, var71);
                }
                else {
                    var72 = (SubLObject)module0122.T;
                }
            }
            var71 = Sequences.nreverse(var71);
        }
        return var71;
    }
    
    public static SubLObject f8326(final SubLObject var61) {
        final SubLObject var62 = f8320(var61);
        if (module0122.NIL != var62) {
            return module0052.f3687(var62);
        }
        return (SubLObject)module0122.T;
    }
    
    public static SubLObject f8327(final SubLObject var61) {
        final SubLObject var62 = f8320(var61);
        if (module0122.NIL != var62) {
            f8322(var61);
            return module0052.f3696(var62);
        }
        return (SubLObject)module0122.T;
    }
    
    public static SubLObject f8328(final SubLObject var21, SubLObject var71) {
        if (var71 == module0122.UNPROVIDED) {
            var71 = (SubLObject)module0122.ONE_INTEGER;
        }
        assert module0122.NIL != Types.listp(var21) : var21;
        assert module0122.NIL != module0004.f105(var71) : var71;
        final SubLObject var72 = (module0122.NIL != f8291()) ? f8304((SubLObject)ConsesLow.list((SubLObject)module0122.$ic54$, (SubLObject)ConsesLow.list((SubLObject)module0122.$ic19$, var21))) : f8323(var21);
        return var71.numE((SubLObject)module0122.ONE_INTEGER) ? f8329(var72) : f8330(var72, var71);
    }
    
    public static SubLObject f8331(final SubLObject var60) {
        return module0052.f3696(var60);
    }
    
    public static SubLObject f8329(final SubLObject var61) {
        return module0052.f3689(var61, (SubLObject)module0122.$ic55$, (SubLObject)module0122.$ic56$, (SubLObject)module0122.$ic57$);
    }
    
    public static SubLObject f8332(final SubLObject var61) {
        return (module0122.NIL != f8291()) ? f8304((SubLObject)ConsesLow.list((SubLObject)module0122.$ic58$, var61)) : f8326(var61);
    }
    
    public static SubLObject f8333(final SubLObject var61) {
        SubLObject var63;
        final SubLObject var62 = var63 = ((module0122.NIL != f8291()) ? f8304((SubLObject)ConsesLow.list((SubLObject)module0122.$ic59$, var61)) : f8324(var61));
        SubLObject var64 = (SubLObject)module0122.NIL;
        SubLObject var65 = (SubLObject)module0122.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var63, var62, (SubLObject)module0122.$ic60$);
        var64 = var63.first();
        var63 = var63.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var63, var62, (SubLObject)module0122.$ic60$);
        var65 = var63.first();
        var63 = var63.rest();
        if (module0122.NIL == var63) {
            return Values.values(var64, var61, Types.sublisp_null(var65));
        }
        cdestructuring_bind.cdestructuring_bind_error(var62, (SubLObject)module0122.$ic60$);
        return (SubLObject)module0122.NIL;
    }
    
    public static SubLObject f8334(final SubLObject var61) {
        return (module0122.NIL != f8291()) ? f8304((SubLObject)ConsesLow.list((SubLObject)module0122.$ic61$, var61)) : f8327(var61);
    }
    
    public static SubLObject f8330(final SubLObject var61, final SubLObject var71) {
        final SubLObject var72 = (SubLObject)ConsesLow.list((SubLObject)module0122.NIL, var61, var71);
        return module0052.f3689(var72, (SubLObject)module0122.$ic62$, (SubLObject)module0122.$ic63$, (SubLObject)module0122.$ic64$);
    }
    
    public static SubLObject f8335(final SubLObject var75) {
        SubLObject var76 = (SubLObject)module0122.NIL;
        SubLObject var77 = (SubLObject)module0122.NIL;
        SubLObject var78 = (SubLObject)module0122.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var75, var75, (SubLObject)module0122.$ic65$);
        var76 = var75.first();
        SubLObject var79 = var75.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var79, var75, (SubLObject)module0122.$ic65$);
        var77 = var79.first();
        var79 = var79.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var79, var75, (SubLObject)module0122.$ic65$);
        var78 = var79.first();
        var79 = var79.rest();
        if (module0122.NIL == var79) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0122.NIL == var76 && module0122.NIL != f8332(var77));
        }
        cdestructuring_bind.cdestructuring_bind_error(var75, (SubLObject)module0122.$ic65$);
        return (SubLObject)module0122.NIL;
    }
    
    public static SubLObject f8336(final SubLObject var75) {
        SubLObject var76 = (SubLObject)module0122.NIL;
        SubLObject var77 = (SubLObject)module0122.NIL;
        SubLObject var78 = (SubLObject)module0122.NIL;
        SubLObject var79 = (SubLObject)module0122.NIL;
        SubLObject var80 = (SubLObject)module0122.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var75, var75, (SubLObject)module0122.$ic65$);
        var78 = var75.first();
        SubLObject var81 = var75.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var81, var75, (SubLObject)module0122.$ic65$);
        var79 = var81.first();
        var81 = var81.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var81, var75, (SubLObject)module0122.$ic65$);
        var80 = var81.first();
        var81 = var81.rest();
        if (module0122.NIL == var81) {
            if (module0122.NIL == var78) {
                final SubLObject var82 = (module0122.NIL != f8291()) ? f8304((SubLObject)ConsesLow.list((SubLObject)module0122.$ic66$, var79, var80)) : f8325(var79, var80);
                if (module0122.NIL != var82) {
                    var76 = var82.first();
                    ConsesLow.set_nth((SubLObject)module0122.ZERO_INTEGER, var75, var82.rest());
                }
                else {
                    var77 = (SubLObject)module0122.T;
                }
            }
            else {
                var76 = var78.first();
                ConsesLow.set_nth((SubLObject)module0122.ZERO_INTEGER, var75, var78.rest());
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var75, (SubLObject)module0122.$ic65$);
        }
        return Values.values(var76, var75, var77);
    }
    
    public static SubLObject f8337(final SubLObject var75) {
        SubLObject var76 = (SubLObject)module0122.NIL;
        SubLObject var77 = (SubLObject)module0122.NIL;
        SubLObject var78 = (SubLObject)module0122.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var75, var75, (SubLObject)module0122.$ic65$);
        var76 = var75.first();
        SubLObject var79 = var75.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var79, var75, (SubLObject)module0122.$ic65$);
        var77 = var79.first();
        var79 = var79.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var79, var75, (SubLObject)module0122.$ic65$);
        var78 = var79.first();
        var79 = var79.rest();
        if (module0122.NIL == var79) {
            return f8334(var77);
        }
        cdestructuring_bind.cdestructuring_bind_error(var75, (SubLObject)module0122.$ic65$);
        return (SubLObject)module0122.NIL;
    }
    
    public static SubLObject f8338(final SubLObject var85) {
        final SubLObject var86 = compatibility.open_binary(var85, (SubLObject)module0122.$ic68$);
        if (var86.isStream()) {
            module0122.$g1492$.setGlobalValue(var86);
            return (SubLObject)module0122.T;
        }
        return (SubLObject)module0122.NIL;
    }
    
    public static SubLObject f8339() {
        if (module0122.$g1492$.getGlobalValue().isStream()) {
            streams_high.close(module0122.$g1492$.getGlobalValue(), (SubLObject)module0122.UNPROVIDED);
            module0122.$g1492$.setGlobalValue((SubLObject)module0122.NIL);
            return (SubLObject)module0122.T;
        }
        return (SubLObject)module0122.NIL;
    }
    
    public static SubLObject f8340(final SubLObject var87, final SubLObject var72, final SubLObject var88, final SubLObject var89, final SubLObject var90, final SubLObject var91, final SubLObject var92, final SubLObject var93) {
        final SubLObject var94 = Sequences.remove((SubLObject)module0122.$ic69$, (SubLObject)ConsesLow.list(var72, var88, var89, var90, var91, var92, var93), (SubLObject)module0122.UNPROVIDED, (SubLObject)module0122.UNPROVIDED, (SubLObject)module0122.UNPROVIDED, (SubLObject)module0122.UNPROVIDED, (SubLObject)module0122.UNPROVIDED);
        return (SubLObject)ConsesLow.listS(var87, var94);
    }
    
    public static SubLObject f8341(final SubLObject var36, SubLObject var72, SubLObject var88, SubLObject var89, SubLObject var90, SubLObject var91, SubLObject var92, SubLObject var93) {
        if (var72 == module0122.UNPROVIDED) {
            var72 = (SubLObject)module0122.$ic69$;
        }
        if (var88 == module0122.UNPROVIDED) {
            var88 = (SubLObject)module0122.$ic69$;
        }
        if (var89 == module0122.UNPROVIDED) {
            var89 = (SubLObject)module0122.$ic69$;
        }
        if (var90 == module0122.UNPROVIDED) {
            var90 = (SubLObject)module0122.$ic69$;
        }
        if (var91 == module0122.UNPROVIDED) {
            var91 = (SubLObject)module0122.$ic69$;
        }
        if (var92 == module0122.UNPROVIDED) {
            var92 = (SubLObject)module0122.$ic69$;
        }
        if (var93 == module0122.UNPROVIDED) {
            var93 = (SubLObject)module0122.$ic69$;
        }
        if (module0122.$g1492$.getGlobalValue().isStream()) {
            final SubLObject var94 = f8340(var36, var72, var88, var89, var90, var91, var92, var93);
            module0021.f1040(var94, module0122.$g1492$.getGlobalValue());
        }
        return (SubLObject)module0122.NIL;
    }
    
    public static SubLObject f8342(final SubLObject var85) {
        final SubLThread var86 = SubLProcess.currentSubLThread();
        SubLObject var87 = (SubLObject)module0122.ZERO_INTEGER;
        SubLObject var88 = (SubLObject)module0122.NIL;
        try {
            final SubLObject var89 = stream_macros.$stream_requires_locking$.currentBinding(var86);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0122.NIL, var86);
                var88 = compatibility.open_binary(var85, (SubLObject)module0122.$ic70$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var89, var86);
            }
            if (!var88.isStream()) {
                Errors.error((SubLObject)module0122.$ic71$, var85);
            }
            final SubLObject var86_97 = var88;
            SubLObject var90 = (SubLObject)module0122.NIL;
            while (module0122.$ic72$ != var90) {
                var90 = f8343(var86_97);
                if (module0122.$ic72$ != var90) {
                    var87 = Numbers.add(var87, (SubLObject)module0122.ONE_INTEGER);
                }
            }
        }
        finally {
            final SubLObject var91 = Threads.$is_thread_performing_cleanupP$.currentBinding(var86);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0122.T, var86);
                if (var88.isStream()) {
                    streams_high.close(var88, (SubLObject)module0122.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var91, var86);
            }
        }
        return var87;
    }
    
    public static SubLObject f8343(final SubLObject var86) {
        final SubLObject var87 = module0021.f1060(var86, (SubLObject)module0122.NIL, (SubLObject)module0122.UNPROVIDED);
        if (module0122.$ic72$ == var87) {
            return (SubLObject)module0122.$ic72$;
        }
        return f8344(var87);
    }
    
    public static SubLObject f8344(final SubLObject var95) {
        final SubLObject var96 = var95.first();
        final SubLObject var97 = conses_high.second(var95);
        final SubLObject var98 = conses_high.nthcdr((SubLObject)module0122.TWO_INTEGER, var95);
        return Functions.apply(var96, var97, var98);
    }
    
    public static SubLObject f8345() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0122", "f8287", "S#10391", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0122", "f8288", "S#10392", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0122", "f8289", "S#10393", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0122", "f8290", "S#10394", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0122", "f8291", "S#10395", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0122", "f8292", "S#10396");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0122", "f8293", "S#10397");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0122", "f8294", "S#10398", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0122", "f8295", "S#10399", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0122", "f8296", "S#10400", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0122", "f8297", "S#10401", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0122", "f8298", "S#10402", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0122", "f8299", "S#10403", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0122", "f8300", "S#10404", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0122", "f8301", "S#10405", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0122", "f8302", "S#10406", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0122", "f8303", "S#10407", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0122", "f8304", "S#10408", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0122", "f8306", "S#10409");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0122", "f8307", "S#10410");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0122", "f8308", "S#10411", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0122", "f8309", "S#10412", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0122", "f8310", "S#10413");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0122", "f8311", "S#10414", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0122", "f8312", "S#10415", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0122", "f8305", "S#10416", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0122", "f8313", "S#10417");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0122", "f8314", "S#10418");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0122", "f8315", "S#10419");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0122", "f8316", "S#10420");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0122", "f8317", "S#10421", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0122", "f8318", "S#10422", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0122", "f8319", "S#10423", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0122", "f8321", "S#10424", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0122", "f8320", "S#10425", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0122", "f8322", "S#10426", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0122", "f8323", "S#10427", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0122", "f8324", "S#10428", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0122", "f8325", "S#10429", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0122", "f8326", "S#10430", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0122", "f8327", "S#10431", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0122", "f8328", "S#10432", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0122", "f8331", "S#10433", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0122", "f8329", "S#10434", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0122", "f8332", "S#10389", 1, 0, false);
        new $f8332$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0122", "f8333", "S#5092", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0122", "f8334", "S#10390", 1, 0, false);
        new $f8334$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0122", "f8330", "S#10435", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0122", "f8335", "S#10436", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0122", "f8336", "S#10437", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0122", "f8337", "S#10438", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0122", "f8338", "S#10439", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0122", "f8339", "S#10440", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0122", "f8340", "S#10441", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0122", "f8341", "S#10442", 1, 7, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0122", "f8342", "S#10443", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0122", "f8343", "S#10444", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0122", "f8344", "S#10445", 1, 0, false);
        return (SubLObject)module0122.NIL;
    }
    
    public static SubLObject f8346() {
        module0122.$g1482$ = SubLFiles.defvar("S#10446", (SubLObject)module0122.$ic0$);
        module0122.$g1483$ = SubLFiles.defvar("S#10447", (SubLObject)module0122.NIL);
        module0122.$g1484$ = SubLFiles.deflexical("S#10448", (SubLObject)((module0122.NIL != Symbols.boundp((SubLObject)module0122.$ic8$)) ? module0122.$g1484$.getGlobalValue() : module0122.NIL));
        module0122.$g1485$ = SubLFiles.deflexical("S#10449", (module0122.NIL != Symbols.boundp((SubLObject)module0122.$ic9$)) ? module0122.$g1485$.getGlobalValue() : module0055.f4017());
        module0122.$g1486$ = SubLFiles.deflexical("S#10450", Locks.make_lock((SubLObject)module0122.$ic10$));
        module0122.$g1487$ = SubLFiles.deflexical("S#10451", (SubLObject)module0122.NINE_INTEGER);
        module0122.$g1488$ = SubLFiles.defparameter("S#10452", (SubLObject)module0122.NIL);
        module0122.$g1489$ = SubLFiles.deflexical("S#10453", (module0122.NIL != Symbols.boundp((SubLObject)module0122.$ic49$)) ? module0122.$g1489$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)module0122.EQL), (SubLObject)module0122.UNPROVIDED));
        module0122.$g1490$ = SubLFiles.deflexical("S#10454", (SubLObject)((module0122.NIL != Symbols.boundp((SubLObject)module0122.$ic50$)) ? module0122.$g1490$.getGlobalValue() : module0122.ZERO_INTEGER));
        module0122.$g1491$ = SubLFiles.deflexical("S#10455", Locks.make_lock((SubLObject)module0122.$ic51$));
        module0122.$g1492$ = SubLFiles.deflexical("S#10456", (SubLObject)((module0122.NIL != Symbols.boundp((SubLObject)module0122.$ic67$)) ? module0122.$g1492$.getGlobalValue() : module0122.NIL));
        return (SubLObject)module0122.NIL;
    }
    
    public static SubLObject f8347() {
        module0003.f57((SubLObject)module0122.$ic8$);
        module0003.f57((SubLObject)module0122.$ic9$);
        module0002.f50((SubLObject)module0122.$ic34$, (SubLObject)module0122.$ic35$);
        module0002.f50((SubLObject)module0122.$ic36$, (SubLObject)module0122.$ic35$);
        module0003.f57((SubLObject)module0122.$ic49$);
        module0003.f57((SubLObject)module0122.$ic50$);
        module0003.f57((SubLObject)module0122.$ic67$);
        return (SubLObject)module0122.NIL;
    }
    
    public void declareFunctions() {
        f8345();
    }
    
    public void initializeVariables() {
        f8346();
    }
    
    public void runTopLevelForms() {
        f8347();
    }
    
    static {
        me = (SubLFile)new module0122();
        module0122.$g1482$ = null;
        module0122.$g1483$ = null;
        module0122.$g1484$ = null;
        module0122.$g1485$ = null;
        module0122.$g1486$ = null;
        module0122.$g1487$ = null;
        module0122.$g1488$ = null;
        module0122.$g1489$ = null;
        module0122.$g1490$ = null;
        module0122.$g1491$ = null;
        module0122.$g1492$ = null;
        $ic0$ = SubLObjectFactory.makeKeyword("LOCAL-LOCAL");
        $ic1$ = SubLObjectFactory.makeKeyword("BOTH-LOCAL");
        $ic2$ = SubLObjectFactory.makeKeyword("BOTH-REMOTE");
        $ic3$ = SubLObjectFactory.makeKeyword("REMOTE-REMOTE");
        $ic4$ = SubLObjectFactory.makeKeyword("NONE-LOCAL");
        $ic5$ = SubLObjectFactory.makeSymbol("CLET");
        $ic6$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10447", "CYC"), (SubLObject)module0122.T));
        $ic7$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10447", "CYC"), (SubLObject)module0122.NIL));
        $ic8$ = SubLObjectFactory.makeSymbol("S#10448", "CYC");
        $ic9$ = SubLObjectFactory.makeSymbol("S#10449", "CYC");
        $ic10$ = SubLObjectFactory.makeString("Remote HL Store Connection Pool Lock");
        $ic11$ = SubLObjectFactory.makeString("Could not open a connection to ~s");
        $ic12$ = SubLObjectFactory.makeKeyword("CFASL");
        $ic13$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic14$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#30", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#662", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#663", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic15$ = SubLObjectFactory.makeSymbol("S#369", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic17$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10411", "CYC"));
        $ic18$ = SubLObjectFactory.makeSymbol("S#10442", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("QUOTE");
        $ic20$ = SubLObjectFactory.makeSymbol("PIF");
        $ic21$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10393", "CYC"));
        $ic22$ = SubLObjectFactory.makeSymbol("S#1770", "CYC");
        $ic23$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)module0122.NIL));
        $ic24$ = SubLObjectFactory.makeSymbol("LIST");
        $ic25$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("QUOTE"));
        $ic26$ = SubLObjectFactory.makeUninternedSymbol("US#703B6C2");
        $ic27$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic28$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10392", "CYC"));
        $ic29$ = SubLObjectFactory.makeSymbol("CSETQ");
        $ic30$ = SubLObjectFactory.makeSymbol("S#10408", "CYC");
        $ic31$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10391", "CYC"));
        $ic32$ = SubLObjectFactory.makeSymbol("S#10396", "CYC");
        $ic33$ = SubLObjectFactory.makeSymbol("RET");
        $ic34$ = SubLObjectFactory.makeSymbol("S#10411", "CYC");
        $ic35$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10410", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10409", "CYC"));
        $ic36$ = SubLObjectFactory.makeSymbol("S#10412", "CYC");
        $ic37$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10395", "CYC"));
        $ic38$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("IGNORE"), (SubLObject)SubLObjectFactory.makeKeyword("WARN"), (SubLObject)SubLObjectFactory.makeKeyword("BREAK"));
        $ic39$ = SubLObjectFactory.makeKeyword("BREAK");
        $ic40$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic41$ = SubLObjectFactory.makeKeyword("IGNORE");
        $ic42$ = SubLObjectFactory.makeKeyword("WARN");
        $ic43$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#4785", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic44$ = SubLObjectFactory.makeSymbol("CHECK-TYPE");
        $ic45$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10414", "CYC"));
        $ic46$ = SubLObjectFactory.makeSymbol("S#10452", "CYC");
        $ic47$ = SubLObjectFactory.makeSymbol("S#10417", "CYC");
        $ic48$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1860", "CYC"), (SubLObject)module0122.T));
        $ic49$ = SubLObjectFactory.makeSymbol("S#10453", "CYC");
        $ic50$ = SubLObjectFactory.makeSymbol("S#10454", "CYC");
        $ic51$ = SubLObjectFactory.makeString("HL Store Iterator Lock");
        $ic52$ = SubLObjectFactory.makeSymbol("LISTP");
        $ic53$ = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $ic54$ = SubLObjectFactory.makeSymbol("S#10427", "CYC");
        $ic55$ = SubLObjectFactory.makeSymbol("S#10389", "CYC");
        $ic56$ = SubLObjectFactory.makeSymbol("S#5092", "CYC");
        $ic57$ = SubLObjectFactory.makeSymbol("S#10390", "CYC");
        $ic58$ = SubLObjectFactory.makeSymbol("S#10430", "CYC");
        $ic59$ = SubLObjectFactory.makeSymbol("S#10428", "CYC");
        $ic60$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5217", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10457", "CYC"));
        $ic61$ = SubLObjectFactory.makeSymbol("S#10431", "CYC");
        $ic62$ = SubLObjectFactory.makeSymbol("S#10436", "CYC");
        $ic63$ = SubLObjectFactory.makeSymbol("S#10437", "CYC");
        $ic64$ = SubLObjectFactory.makeSymbol("S#10438", "CYC");
        $ic65$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#7542", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1519", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#770", "CYC"));
        $ic66$ = SubLObjectFactory.makeSymbol("S#10429", "CYC");
        $ic67$ = SubLObjectFactory.makeSymbol("S#10456", "CYC");
        $ic68$ = SubLObjectFactory.makeKeyword("OUTPUT");
        $ic69$ = SubLObjectFactory.makeKeyword("UNPROVIDED");
        $ic70$ = SubLObjectFactory.makeKeyword("INPUT");
        $ic71$ = SubLObjectFactory.makeString("Unable to open ~S");
        $ic72$ = SubLObjectFactory.makeKeyword("EOF");
    }
    
    public static final class $f8332$UnaryFunction extends UnaryFunction
    {
        public $f8332$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#10389"));
        }
        
        public SubLObject processItem(final SubLObject var72) {
            return module0122.f8332(var72);
        }
    }
    
    public static final class $f8334$UnaryFunction extends UnaryFunction
    {
        public $f8334$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#10390"));
        }
        
        public SubLObject processItem(final SubLObject var72) {
            return module0122.f8334(var72);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0122.class
	Total time: 234 ms
	
	Decompiled with Procyon 0.5.32.
*/