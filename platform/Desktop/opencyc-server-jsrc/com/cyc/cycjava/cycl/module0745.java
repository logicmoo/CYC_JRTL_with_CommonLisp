package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0745 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0745";
    public static final String myFingerPrint = "630cec18f28cfbd334cab866da1f617d195c75b85fe9ad03b27028b49bb76dbd";
    private static SubLSymbol $g5931$;
    public static SubLSymbol $g5932$;
    public static SubLSymbol $g5933$;
    public static SubLSymbol $g5934$;
    private static SubLSymbol $g5935$;
    private static SubLSymbol $g5936$;
    private static SubLSymbol $g5937$;
    private static SubLSymbol $g5938$;
    private static SubLSymbol $g5939$;
    private static SubLSymbol $g5940$;
    public static SubLSymbol $g5941$;
    public static SubLSymbol $g5942$;
    public static SubLSymbol $g5943$;
    public static SubLSymbol $g5944$;
    private static SubLSymbol $g5945$;
    private static SubLSymbol $g5946$;
    private static SubLSymbol $g5947$;
    private static SubLSymbol $g5948$;
    private static SubLSymbol $g5949$;
    private static SubLSymbol $g5950$;
    private static SubLSymbol $g5951$;
    private static SubLSymbol $g5952$;
    private static SubLSymbol $g5953$;
    private static SubLSymbol $g5954$;
    private static SubLSymbol $g5955$;
    private static SubLSymbol $g5956$;
    public static SubLSymbol $g5957$;
    private static SubLSymbol $g5958$;
    private static SubLSymbol $g5959$;
    private static SubLSymbol $g5960$;
    private static SubLSymbol $g5961$;
    private static SubLSymbol $g5962$;
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLString $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLString $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLList $ic11$;
    private static final SubLList $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLString $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLInteger $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLList $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLInteger $ic27$;
    private static final SubLInteger $ic28$;
    private static final SubLString $ic29$;
    private static final SubLInteger $ic30$;
    private static final SubLString $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLString $ic35$;
    private static final SubLString $ic36$;
    private static final SubLString $ic37$;
    private static final SubLString $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLString $ic40$;
    private static final SubLString $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLString $ic44$;
    private static final SubLString $ic45$;
    private static final SubLString $ic46$;
    private static final SubLString $ic47$;
    private static final SubLString $ic48$;
    private static final SubLString $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLString $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLString $ic53$;
    private static final SubLString $ic54$;
    private static final SubLString $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLString $ic57$;
    private static final SubLString $ic58$;
    private static final SubLString $ic59$;
    private static final SubLString $ic60$;
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
    private static final SubLString $ic75$;
    private static final SubLList $ic76$;
    private static final SubLString $ic77$;
    private static final SubLString $ic78$;
    private static final SubLString $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLString $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLList $ic84$;
    private static final SubLString $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLString $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLString $ic89$;
    private static final SubLString $ic90$;
    private static final SubLString $ic91$;
    private static final SubLString $ic92$;
    private static final SubLString $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLList $ic95$;
    private static final SubLString $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLString $ic99$;
    private static final SubLString $ic100$;
    private static final SubLString $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLInteger $ic103$;
    private static final SubLString $ic104$;
    private static final SubLString $ic105$;
    private static final SubLString $ic106$;
    private static final SubLString $ic107$;
    private static final SubLString $ic108$;
    private static final SubLString $ic109$;
    private static final SubLString $ic110$;
    private static final SubLString $ic111$;
    private static final SubLInteger $ic112$;
    private static final SubLString $ic113$;
    private static final SubLString $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLString $ic116$;
    private static final SubLString $ic117$;
    private static final SubLString $ic118$;
    private static final SubLString $ic119$;
    private static final SubLList $ic120$;
    private static final SubLList $ic121$;
    private static final SubLList $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLString $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLString $ic128$;
    private static final SubLList $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLInteger $ic132$;
    private static final SubLList $ic133$;
    private static final SubLObject $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLString $ic136$;
    private static final SubLFloat $ic137$;
    private static final SubLString $ic138$;
    private static final SubLString $ic139$;
    private static final SubLString $ic140$;
    private static final SubLString $ic141$;
    private static final SubLString $ic142$;
    private static final SubLString $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLString $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLObject $ic147$;
    private static final SubLString $ic148$;
    private static final SubLString $ic149$;
    private static final SubLObject $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLObject $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLSymbol $ic156$;
    
    
    public static SubLObject f46215(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0745.$ic6$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0745.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0745.$ic6$);
        var6 = var4.first();
        var4 = var4.rest();
        if (module0745.NIL == var4) {
            final SubLObject var7;
            var4 = (var7 = var5);
            final SubLObject var8 = (SubLObject)module0745.$ic7$;
            final SubLObject var9 = (SubLObject)module0745.$ic8$;
            return (SubLObject)ConsesLow.list((SubLObject)module0745.$ic9$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0745.$ic10$, var6), reader.bq_cons(var8, (SubLObject)module0745.$ic11$), reader.bq_cons(var9, (SubLObject)module0745.$ic12$)), (SubLObject)ConsesLow.list((SubLObject)module0745.$ic13$, (SubLObject)ConsesLow.listS((SubLObject)module0745.$ic14$, (SubLObject)ConsesLow.list((SubLObject)module0745.$ic15$, var6), ConsesLow.append(var7, (SubLObject)module0745.NIL)), (SubLObject)ConsesLow.list((SubLObject)module0745.$ic16$, var8, var9)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0745.$ic6$);
        return (SubLObject)module0745.NIL;
    }
    
    public static SubLObject f46216() {
        return module0745.$g5931$.getGlobalValue();
    }
    
    public static SubLObject f46217(final SubLObject var6) {
        module0745.$g5931$.setGlobalValue((SubLObject)module0745.NIL);
        module0745.$g5934$.setGlobalValue(Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)module0745.ONE_INTEGER), module0075.f5195(var6)));
        f46218();
        return module0745.$g5931$.getGlobalValue();
    }
    
    public static SubLObject f46219(final SubLObject var10, final SubLObject var9) {
        module0745.$g5931$.setGlobalValue(var10);
        module0745.$g5934$.setGlobalValue(var9);
        return module0745.$g5931$.getGlobalValue();
    }
    
    public static SubLObject f46220(SubLObject var11) {
        if (var11 == module0745.UNPROVIDED) {
            var11 = module0018.f971();
        }
        final SubLThread var12 = SubLProcess.currentSubLThread();
        if (module0745.NIL != module0004.f105(var11) && (!module0745.$g5932$.getDynamicValue(var12).isString() || module0745.NIL == Filesys.probe_file(module0745.$g5932$.getDynamicValue(var12)))) {
            module0745.$g5932$.setDynamicValue(f46221(var11), var12);
        }
        return module0745.$g5932$.getDynamicValue(var12);
    }
    
    public static SubLObject f46222() {
        SubLObject var11;
        SubLObject var12;
        for (var11 = module0018.f971(), var12 = (SubLObject)module0745.NIL; module0745.NIL != module0004.f105(var11) && Numbers.subtract(module0018.f971(), var11).numLE(module0745.$g5936$.getGlobalValue()) && (!var12.isString() || module0745.NIL == Filesys.probe_file(var12)); var12 = f46221(var11), var11 = Numbers.subtract(var11, (SubLObject)module0745.ONE_INTEGER)) {}
        return var12;
    }
    
    public static SubLObject f46221(final SubLObject var11) {
        final SubLObject var12 = Sequences.cconcatenate(module0236.$g2442$.getGlobalValue(), new SubLObject[] { module0574.f35166(var11), module0745.$ic19$, module0745.$g5934$.getGlobalValue() });
        return var12;
    }
    
    public static SubLObject f46223() {
        module0236.f15556(module0745.$g5931$.getGlobalValue());
        return (SubLObject)module0745.NIL;
    }
    
    public static SubLObject f46224() {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        module0745.$g5931$.setGlobalValue(module0236.f15555(module0745.$g5931$.getGlobalValue(), StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(var12)));
        return (SubLObject)module0745.NIL;
    }
    
    public static SubLObject f46225() {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0745.NIL != module0745.$g5931$.getGlobalValue() && module0745.NIL != module0236.f15557(module0745.$g5931$.getGlobalValue()));
    }
    
    public static SubLObject f46226() {
        if (module0745.NIL == module0018.f971()) {
            f46227();
        }
        else if (module0745.NIL != module0236.f15526(module0745.$g5931$.getGlobalValue()) && module0574.f35163().isPositive()) {
            f46227();
        }
        else {
            f46218();
        }
        return (SubLObject)module0745.NIL;
    }
    
    public static SubLObject f46218() {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        if (module0745.NIL != module0236.f15526(module0745.$g5931$.getGlobalValue()) && module0745.NIL != Filesys.probe_file(module0236.f15560(module0745.$g5931$.getGlobalValue())) && module0745.NIL != f46228()) {
            f46227();
        }
        else if (module0745.NIL != module0236.f15526(module0745.$g5931$.getGlobalValue()) && module0745.NIL != Filesys.probe_file(module0236.f15560(module0745.$g5931$.getGlobalValue())) && module0745.NIL != f46229()) {
            f46227();
        }
        else {
            final SubLObject var13 = module0745.$g5931$.getGlobalValue();
            final SubLObject var14 = module0745.$g5935$.getGlobalValue();
            SubLObject var15 = (SubLObject)module0745.NIL;
            try {
                var15 = Locks.seize_lock(var14);
                if (module0745.$g5931$.getGlobalValue().eql(var13)) {
                    final SubLObject var16 = module0093.$g1217$.currentBinding(var12);
                    try {
                        module0093.$g1217$.bind((SubLObject)module0745.$ic21$, var12);
                        final SubLObject var17 = f46222();
                        module0745.$g5931$.setGlobalValue((SubLObject)((module0745.NIL != Filesys.probe_file(var17)) ? module0236.f15548(var17, module0745.$g5937$.getGlobalValue(), (SubLObject)module0745.T, module0093.$g1217$.getDynamicValue(var12), Symbols.symbol_function((SubLObject)module0745.EQUAL), (SubLObject)module0745.$ic22$) : module0745.NIL));
                    }
                    finally {
                        module0093.$g1217$.rebind(var16, var12);
                    }
                    if (module0745.NIL != f46228() && module0574.f35163().isZero()) {
                        f46230();
                    }
                }
            }
            finally {
                if (module0745.NIL != var15) {
                    Locks.release_lock(var14);
                }
            }
        }
        return (SubLObject)module0745.NIL;
    }
    
    public static SubLObject f46227() {
        if (module0745.NIL != module0745.$g5931$.getGlobalValue()) {
            final SubLObject var18 = module0236.f15560(module0745.$g5931$.getGlobalValue());
            final SubLObject var19 = (module0745.NIL != Filesys.probe_file(var18)) ? var18 : f46220((SubLObject)module0745.UNPROVIDED);
            module0236.f15552(module0745.$g5931$.getGlobalValue(), var19);
        }
        return module0745.$g5931$.getGlobalValue();
    }
    
    public static SubLObject f46228() {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0745.NIL != module0745.$g5931$.getGlobalValue() && conses_high.last(module0075.f5195(module0236.f15560(module0745.$g5931$.getGlobalValue())), (SubLObject)module0745.UNPROVIDED).equal(conses_high.last(module0075.f5195(f46220(module0018.f971())), (SubLObject)module0745.UNPROVIDED)));
    }
    
    public static SubLObject f46229() {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0745.NIL != module0745.$g5931$.getGlobalValue() && conses_high.last(module0075.f5195(module0236.f15560(module0745.$g5931$.getGlobalValue())), (SubLObject)module0745.UNPROVIDED).equal(conses_high.last(module0075.f5195(f46222()), (SubLObject)module0745.UNPROVIDED)));
    }
    
    public static SubLObject f46231() {
        final SubLObject var19 = module0745.$g5935$.getGlobalValue();
        SubLObject var20 = (SubLObject)module0745.NIL;
        try {
            var20 = Locks.seize_lock(var19);
            if (module0745.NIL != module0745.$g5931$.getGlobalValue()) {
                module0745.$g5932$.setDynamicValue((SubLObject)module0745.NIL);
                module0236.f15553(module0745.$g5931$.getGlobalValue(), (SubLObject)module0745.UNPROVIDED);
            }
        }
        finally {
            if (module0745.NIL != var20) {
                Locks.release_lock(var19);
            }
        }
        return (SubLObject)module0745.NIL;
    }
    
    public static SubLObject f46232(SubLObject var8) {
        if (var8 == module0745.UNPROVIDED) {
            var8 = module0745.$g5931$.getGlobalValue();
        }
        final SubLObject var9 = (SubLObject)((module0745.NIL != module0236.f15526(var8)) ? module0236.f15558((SubLObject)module0745.$ic23$, var8, (SubLObject)module0745.NIL, (SubLObject)module0745.UNPROVIDED) : module0745.NIL);
        return (SubLObject)((module0745.NIL != var9) ? var9 : module0745.$ic24$);
    }
    
    public static SubLObject f46233(SubLObject var8) {
        if (var8 == module0745.UNPROVIDED) {
            var8 = module0745.$g5931$.getGlobalValue();
        }
        final SubLObject var9 = (SubLObject)((module0745.NIL != module0236.f15526(var8)) ? module0236.f15558((SubLObject)module0745.$ic25$, var8, (SubLObject)module0745.NIL, (SubLObject)module0745.UNPROVIDED) : module0745.NIL);
        return (module0745.NIL != var9) ? var9 : f46234();
    }
    
    public static SubLObject f46234() {
        return module0579.f35515((SubLObject)module0745.UNPROVIDED);
    }
    
    public static SubLObject f46235() {
        return (SubLObject)module0745.ONE_INTEGER;
    }
    
    public static SubLObject f46236() {
        return (SubLObject)module0745.$ic30$;
    }
    
    public static SubLObject f46237(SubLObject var6, SubLObject var22, SubLObject var23, SubLObject var24) {
        if (var6 == module0745.UNPROVIDED) {
            var6 = f46220((SubLObject)module0745.UNPROVIDED);
        }
        if (var22 == module0745.UNPROVIDED) {
            var22 = (SubLObject)module0745.$ic31$;
        }
        if (var23 == module0745.UNPROVIDED) {
            var23 = f46234();
        }
        if (var24 == module0745.UNPROVIDED) {
            var24 = module0745.$g5940$.getDynamicValue();
        }
        final SubLThread var25 = SubLProcess.currentSubLThread();
        if (module0745.NIL == Errors.$ignore_mustsP$.getDynamicValue(var25) && module0745.NIL == module0750.f46576() && module0745.NIL != module0750.f46577()) {
            Errors.error((SubLObject)module0745.$ic32$);
        }
        PrintLow.format((SubLObject)module0745.T, (SubLObject)module0745.$ic33$, var6);
        assert module0745.NIL != module0161.f10481(var23) : var23;
        final SubLObject var26 = module0745.$g5939$.currentBinding(var25);
        final SubLObject var27 = module0745.$g5940$.currentBinding(var25);
        final SubLObject var28 = module0745.$g5951$.currentBinding(var25);
        try {
            module0745.$g5939$.bind(var23, var25);
            module0745.$g5940$.bind(var24, var25);
            module0745.$g5951$.bind(f46238(var22), var25);
            module0569.f34932();
            final SubLObject var29 = module0069.f4939(Sequences.cconcatenate(module0745.$g5951$.getDynamicValue(var25), (SubLObject)module0745.$ic35$));
            final SubLObject var30 = Sequences.cconcatenate((SubLObject)module0745.$ic36$, new SubLObject[] { module0006.f203(module0745.$g5938$.getGlobalValue()), module0745.$ic37$ });
            final SubLObject var17_29 = module0012.$g75$.currentBinding(var25);
            final SubLObject var25_30 = module0012.$g76$.currentBinding(var25);
            final SubLObject var26_31 = module0012.$g77$.currentBinding(var25);
            final SubLObject var31 = module0012.$g78$.currentBinding(var25);
            try {
                module0012.$g75$.bind((SubLObject)module0745.ZERO_INTEGER, var25);
                module0012.$g76$.bind((SubLObject)module0745.NIL, var25);
                module0012.$g77$.bind((SubLObject)module0745.T, var25);
                module0012.$g78$.bind(Time.get_universal_time(), var25);
                module0012.f478(var30);
                while (module0745.NIL == f46239()) {
                    final SubLObject var32 = f46240();
                    if (module0745.NIL != module0745.$g5944$.getDynamicValue(var25)) {
                        f46241();
                    }
                    if (var32.isInteger()) {
                        module0012.note_percent_progress(var32, var29);
                    }
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var31, var25);
                module0012.$g77$.rebind(var26_31, var25);
                module0012.$g76$.rebind(var25_30, var25);
                module0012.$g75$.rebind(var17_29, var25);
            }
            if (module0745.NIL != Filesys.probe_file(var6)) {
                Errors.warn((SubLObject)module0745.$ic38$, var6);
            }
            else {
                f46242(var6, var24, var22, module0745.$g5951$.getDynamicValue(var25));
            }
        }
        finally {
            module0745.$g5951$.rebind(var28, var25);
            module0745.$g5940$.rebind(var27, var25);
            module0745.$g5939$.rebind(var26, var25);
        }
        return var6;
    }
    
    public static SubLObject f46242(SubLObject var6, SubLObject var24, SubLObject var22, SubLObject var34) {
        if (var6 == module0745.UNPROVIDED) {
            var6 = f46220((SubLObject)module0745.UNPROVIDED);
        }
        if (var24 == module0745.UNPROVIDED) {
            var24 = module0745.$g5940$.getDynamicValue();
        }
        if (var22 == module0745.UNPROVIDED) {
            var22 = (SubLObject)module0745.$ic31$;
        }
        if (var34 == module0745.UNPROVIDED) {
            var34 = f46238(var22);
        }
        f46243(module0077.f5313((SubLObject)module0745.UNPROVIDED, (SubLObject)module0745.UNPROVIDED), var6, var24, var22, var34);
        return var6;
    }
    
    public static SubLObject f46243(final SubLObject var35, SubLObject var6, SubLObject var24, SubLObject var22, SubLObject var34) {
        if (var6 == module0745.UNPROVIDED) {
            var6 = f46220((SubLObject)module0745.UNPROVIDED);
        }
        if (var24 == module0745.UNPROVIDED) {
            var24 = module0745.$g5940$.getDynamicValue();
        }
        if (var22 == module0745.UNPROVIDED) {
            var22 = (SubLObject)module0745.$ic31$;
        }
        if (var34 == module0745.UNPROVIDED) {
            var34 = f46238(var22);
        }
        final SubLThread var36 = SubLProcess.currentSubLThread();
        if (module0745.NIL == Errors.$ignore_mustsP$.getDynamicValue(var36) && module0745.NIL == module0077.f5302(var35)) {
            Errors.error((SubLObject)module0745.$ic40$, var35);
        }
        final SubLObject var37 = module0093.f6656(var6, var22, Symbols.symbol_function((SubLObject)module0745.EQUAL), (SubLObject)module0745.$ic22$);
        final SubLObject var38 = (SubLObject)module0745.$ic41$;
        assert module0745.NIL != Filesys.directory_p(var34) : var34;
        SubLObject var39 = Filesys.directory(var34, (SubLObject)module0745.T);
        final SubLObject var40 = var38;
        final SubLObject var41 = module0012.$silent_progressP$.currentBinding(var36);
        try {
            module0012.$silent_progressP$.bind((SubLObject)SubLObjectFactory.makeBoolean(!var40.isString()), var36);
            if (module0745.$ic43$.isFunctionSpec()) {
                var39 = Sort.sort(var39, (SubLObject)module0745.$ic43$, (SubLObject)module0745.UNPROVIDED);
            }
            final SubLObject var42 = var39;
            module0012.$g82$.setDynamicValue(var40, var36);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var36);
            module0012.$g83$.setDynamicValue(Sequences.length(var42), var36);
            module0012.$g84$.setDynamicValue((SubLObject)module0745.ZERO_INTEGER, var36);
            final SubLObject var17_40 = module0012.$g75$.currentBinding(var36);
            final SubLObject var43 = module0012.$g76$.currentBinding(var36);
            final SubLObject var44 = module0012.$g77$.currentBinding(var36);
            final SubLObject var45 = module0012.$g78$.currentBinding(var36);
            try {
                module0012.$g75$.bind((SubLObject)module0745.ZERO_INTEGER, var36);
                module0012.$g76$.bind((SubLObject)module0745.NIL, var36);
                module0012.$g77$.bind((SubLObject)module0745.T, var36);
                module0012.$g78$.bind(Time.get_universal_time(), var36);
                module0012.f478(module0012.$g82$.getDynamicValue(var36));
                SubLObject var46 = var42;
                SubLObject var47 = (SubLObject)module0745.NIL;
                var47 = var46.first();
                while (module0745.NIL != var46) {
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var36), module0012.$g83$.getDynamicValue(var36));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var36), (SubLObject)module0745.ONE_INTEGER), var36);
                    if (module0745.NIL != Filesys.directory_p(var47)) {
                        if (module0745.NIL == Filesys.probe_file(Sequences.cconcatenate(var47, (SubLObject)module0745.$ic44$))) {
                            Errors.warn((SubLObject)module0745.$ic45$, var47);
                        }
                        else {
                            final SubLObject var48 = Equality.eql(module0018.f968(), module0069.f4939(Sequences.cconcatenate(var34, (SubLObject)module0745.$ic46$)));
                            final SubLObject var49 = Sequences.cconcatenate(var47, (SubLObject)module0745.$ic47$);
                            final SubLObject var50 = Sequences.cconcatenate(var47, (SubLObject)module0745.$ic48$);
                            final SubLObject var51 = (module0745.NIL != var48 && module0745.NIL != Filesys.probe_file(var50)) ? var50 : var49;
                            SubLObject var52 = (SubLObject)module0745.NIL;
                            SubLObject var53 = (SubLObject)module0745.NIL;
                            SubLObject var54 = (SubLObject)module0745.NIL;
                            Errors.warn((SubLObject)module0745.$ic49$, var51);
                            SubLObject var55 = (SubLObject)module0745.NIL;
                            try {
                                final SubLObject var17_41 = stream_macros.$stream_requires_locking$.currentBinding(var36);
                                try {
                                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0745.NIL, var36);
                                    var55 = compatibility.open_binary(var51, (SubLObject)module0745.$ic50$);
                                }
                                finally {
                                    stream_macros.$stream_requires_locking$.rebind(var17_41, var36);
                                }
                                if (!var55.isStream()) {
                                    Errors.error((SubLObject)module0745.$ic51$, var51);
                                }
                                final SubLObject var52_53 = var55;
                                while (module0745.NIL == var54) {
                                    var52 = module0021.f1060(var52_53, (SubLObject)module0745.NIL, (SubLObject)module0745.$ic52$);
                                    var53 = module0021.f1060(var52_53, (SubLObject)module0745.NIL, (SubLObject)module0745.UNPROVIDED);
                                    if (module0745.$ic52$ == var52) {
                                        var54 = (SubLObject)module0745.T;
                                    }
                                    else if (module0745.NIL == module0173.f10955(var52)) {
                                        Errors.warn((SubLObject)module0745.$ic53$, var52, var51);
                                    }
                                    else if (!var53.isList() || module0745.NIL == module0035.f1995(var53, (SubLObject)module0745.FOUR_INTEGER, (SubLObject)module0745.UNPROVIDED)) {
                                        Errors.warn((SubLObject)module0745.$ic54$, var52, var51, var53);
                                    }
                                    else if (module0745.NIL != module0077.f5320(var52, var35)) {
                                        Errors.warn((SubLObject)module0745.$ic55$, var52);
                                    }
                                    else {
                                        final SubLObject var56 = (SubLObject)((module0745.NIL != module0745.$g5956$.getDynamicValue(var36)) ? var53 : ConsesLow.cons(var53.first(), conses_high.second(var53)));
                                        module0093.f6657(var52, var37, var56);
                                    }
                                }
                            }
                            finally {
                                final SubLObject var17_42 = Threads.$is_thread_performing_cleanupP$.currentBinding(var36);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0745.T, var36);
                                    if (var55.isStream()) {
                                        streams_high.close(var55, (SubLObject)module0745.UNPROVIDED);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var17_42, var36);
                                }
                            }
                        }
                    }
                    var46 = var46.rest();
                    var47 = var46.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var45, var36);
                module0012.$g77$.rebind(var44, var36);
                module0012.$g76$.rebind(var43, var36);
                module0012.$g75$.rebind(var17_40, var36);
            }
        }
        finally {
            module0012.$silent_progressP$.rebind(var41, var36);
        }
        module0093.f6657((SubLObject)module0745.$ic23$, var37, var24);
        module0093.f6657((SubLObject)module0745.$ic25$, var37, module0745.$g5939$.getDynamicValue(var36));
        module0093.f6658(var37, (SubLObject)module0745.$ic56$, (SubLObject)module0745.UNPROVIDED);
        return var6;
    }
    
    public static SubLObject f46238(final SubLObject var56) {
        final SubLThread var57 = SubLProcess.currentSubLThread();
        final SubLObject var58 = Sequences.cconcatenate(module0006.f203(var56), new SubLObject[] { module0745.$ic57$, module0006.f203(module0574.f35166(module0018.f968())), module0745.$ic19$ });
        if (module0745.NIL == Filesys.directory_p(var58)) {
            module0075.f5241(var58, (SubLObject)module0745.NIL, (SubLObject)module0745.$ic58$);
            module0069.f4937(module0745.$g5953$.getGlobalValue(), Sequences.cconcatenate(var58, (SubLObject)module0745.$ic59$));
            module0069.f4937(module0173.f10962(), Sequences.cconcatenate(var58, (SubLObject)module0745.$ic35$));
            module0069.f4937(module0018.f968(), Sequences.cconcatenate(var58, (SubLObject)module0745.$ic46$));
            module0069.f4941(module0745.$g5939$.getDynamicValue(var57), Sequences.cconcatenate(var58, (SubLObject)module0745.$ic60$));
        }
        return var58;
    }
    
    public static SubLObject f46244(final SubLObject var34, final SubLObject var57, SubLObject var27, SubLObject var58) {
        if (var27 == module0745.UNPROVIDED) {
            var27 = (SubLObject)module0745.NIL;
        }
        if (var58 == module0745.UNPROVIDED) {
            var58 = (SubLObject)module0745.NIL;
        }
        if (module0745.NIL == var27) {
            var27 = module0069.f4939(Sequences.cconcatenate(var34, (SubLObject)module0745.$ic35$));
        }
        if (module0745.NIL == var58) {
            var58 = module0069.f4939(Sequences.cconcatenate(var34, (SubLObject)module0745.$ic59$));
        }
        if (!Numbers.mod(var58, module0745.$g5952$.getGlobalValue()).isZero()) {
            Errors.error((SubLObject)module0745.$ic61$, module0745.$g5952$.getGlobalValue());
        }
        final SubLObject var59 = module0048.f_1X(Numbers.floor(Numbers.log(var27, (SubLObject)module0745.TEN_INTEGER), (SubLObject)module0745.UNPROVIDED));
        final SubLObject var60 = Sequences.cconcatenate((SubLObject)module0745.$ic62$, new SubLObject[] { print_high.princ_to_string(var59), module0745.$ic63$, print_high.princ_to_string(var59), module0745.$ic64$ });
        SubLObject var61 = Numbers.add(var57, module0048.f_1_(var58));
        final SubLObject var62 = Numbers.numGE(var61, var27);
        if (module0745.NIL != var62) {
            var61 = var27;
        }
        final SubLObject var63 = Sequences.cconcatenate(var34, PrintLow.format((SubLObject)module0745.NIL, var60, var57, var61));
        return Values.values(var63, var62, var61);
    }
    
    public static SubLObject f46240() {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        var12.resetMultipleValues();
        final SubLObject var13 = f46245();
        final SubLObject var14 = var12.secondMultipleValue();
        final SubLObject var15 = var12.thirdMultipleValue();
        final SubLObject var16 = var12.fourthMultipleValue();
        var12.resetMultipleValues();
        if (module0745.NIL != Filesys.directory_p(var13)) {
            final SubLObject var17 = (SubLObject)ConsesLow.list(var16, var13, var14, var15);
            final SubLObject var18 = Sequences.cconcatenate(var13, (SubLObject)module0745.$ic65$);
            final SubLObject var19 = module0745.$g5954$.currentBinding(var12);
            try {
                module0745.$g5954$.bind(var17, var12);
                PrintLow.format((SubLObject)module0745.T, (SubLObject)module0745.$ic66$, var17);
                streams_high.force_output((SubLObject)module0745.T);
                if (module0745.NIL != module0745.$g5957$.getDynamicValue(var12)) {
                    module0060.f4442((SubLObject)module0745.$ic67$, (SubLObject)module0745.$ic68$, var18);
                }
                else {
                    final SubLObject var20 = f46246();
                    f46247(var20);
                }
                final SubLObject var20 = module0059.f4285(module0745.$g5955$.getGlobalValue());
                PrintLow.format((SubLObject)module0745.T, (SubLObject)module0745.$ic69$, var20, var17);
                if (var16.eql(var20)) {
                    PrintLow.format((SubLObject)module0745.T, (SubLObject)module0745.$ic70$, var17);
                }
                else if (f46236().eql(var20)) {
                    f46248(var17);
                    Errors.sublisp_break((SubLObject)module0745.$ic71$, new SubLObject[] { var17 });
                }
                else {
                    Errors.sublisp_break((SubLObject)module0745.$ic72$, new SubLObject[] { var20 });
                }
            }
            finally {
                module0745.$g5954$.rebind(var19, var12);
            }
        }
        return var15;
    }
    
    public static SubLObject f46248(final SubLObject var69) {
        final SubLObject var70 = var69.first();
        Errors.warn((SubLObject)module0745.$ic73$, var69);
        module0077.f5326(var70, module0745.$g5958$.getGlobalValue());
        return module0745.$g5958$.getGlobalValue();
    }
    
    public static SubLObject f46249(final SubLObject var69) {
        final SubLObject var70 = var69.first();
        return module0077.f5320(var70, module0745.$g5958$.getGlobalValue());
    }
    
    public static SubLObject f46247(final SubLObject var68) {
        PrintLow.format((SubLObject)module0745.T, (SubLObject)module0745.$ic74$, var68);
        return module0059.f4284(var68, module0745.$g5955$.getGlobalValue());
    }
    
    public static SubLObject f46246() {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        final SubLObject var13 = module0745.$g5954$.getDynamicValue(var12);
        SubLObject var14 = f46236();
        Errors.warn((SubLObject)module0745.$ic75$, var13);
        if (var13.isList() && module0745.NIL != module0035.f1995(var13, (SubLObject)module0745.FOUR_INTEGER, (SubLObject)module0745.UNPROVIDED)) {
            SubLObject var16;
            final SubLObject var15 = var16 = var13;
            SubLObject var17 = (SubLObject)module0745.NIL;
            SubLObject var18 = (SubLObject)module0745.NIL;
            SubLObject var19 = (SubLObject)module0745.NIL;
            SubLObject var20 = (SubLObject)module0745.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var16, var15, (SubLObject)module0745.$ic76$);
            var17 = var16.first();
            var16 = var16.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var16, var15, (SubLObject)module0745.$ic76$);
            var18 = var16.first();
            var16 = var16.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var16, var15, (SubLObject)module0745.$ic76$);
            var19 = var16.first();
            var16 = var16.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var16, var15, (SubLObject)module0745.$ic76$);
            var20 = var16.first();
            var16 = var16.rest();
            if (module0745.NIL == var16) {
                if (module0745.NIL != Filesys.directory_p(var18)) {
                    f46250(var18, var19, var20);
                }
                var14 = var17;
                Errors.warn((SubLObject)module0745.$ic77$, var14);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var15, (SubLObject)module0745.$ic76$);
            }
        }
        return var14;
    }
    
    public static SubLObject f46250(final SubLObject var64, final SubLObject var57, final SubLObject var61) {
        final SubLObject var65 = Sequences.cconcatenate(var64, (SubLObject)module0745.$ic78$);
        final SubLObject var66 = Sequences.cconcatenate(var64, (SubLObject)module0745.$ic79$);
        final SubLObject var67 = module0077.f5313((SubLObject)module0745.UNPROVIDED, (SubLObject)module0745.UNPROVIDED);
        if (module0745.NIL != Filesys.probe_file(var65)) {
            f46251(var64, var67);
        }
        f46252(var64, var57, var61, var65, var66, var67);
        return var64;
    }
    
    public static SubLObject f46245() {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        SubLObject var13 = (SubLObject)module0745.ONE_INTEGER;
        SubLObject var14 = (SubLObject)module0745.NIL;
        SubLObject var15 = (SubLObject)module0745.NIL;
        SubLObject var16 = (SubLObject)module0745.NIL;
        final SubLObject var17 = module0745.$g5951$.getDynamicValue(var12);
        final SubLObject var18 = module0069.f4939(Sequences.cconcatenate(var17, (SubLObject)module0745.$ic35$));
        final SubLObject var19 = module0069.f4939(Sequences.cconcatenate(var17, (SubLObject)module0745.$ic59$));
        SubLObject var20 = (SubLObject)module0745.NIL;
        while (module0745.NIL == var20) {
            var12.resetMultipleValues();
            final SubLObject var21 = f46244(var17, var13, var18, var19);
            final SubLObject var22 = var12.secondMultipleValue();
            final SubLObject var23 = var12.thirdMultipleValue();
            var12.resetMultipleValues();
            final SubLObject var24 = module0035.sublisp_boolean(Filesys.make_directory(var21, (SubLObject)module0745.UNPROVIDED, (SubLObject)module0745.UNPROVIDED));
            if (module0745.NIL != var24) {
                var14 = var21;
                var20 = (SubLObject)module0745.T;
            }
            else if (module0745.NIL == Filesys.probe_file(Sequences.cconcatenate(var21, (SubLObject)module0745.$ic81$))) {
                if (module0745.NIL != module0745.$g5959$.getDynamicValue(var12)) {
                    SubLObject var25 = (SubLObject)module0745.NIL;
                    SubLObject var26 = (SubLObject)module0745.NIL;
                    try {
                        var12.throwStack.push(module0745.$ic82$);
                        final SubLObject var27 = Errors.$error_handler$.currentBinding(var12);
                        try {
                            Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0745.$ic83$), var12);
                            try {
                                var25 = module0115.f7989((SubLObject)module0745.$ic84$, Environment.get_machine_name((SubLObject)module0745.UNPROVIDED), module0115.f7982());
                            }
                            catch (Throwable var28) {
                                Errors.handleThrowable(var28, (SubLObject)module0745.NIL);
                            }
                        }
                        finally {
                            Errors.$error_handler$.rebind(var27, var12);
                        }
                    }
                    catch (Throwable var29) {
                        var26 = Errors.handleThrowable(var29, (SubLObject)module0745.$ic82$);
                    }
                    finally {
                        var12.throwStack.pop();
                    }
                    if (module0745.NIL != var25) {
                        var14 = var21;
                        var20 = (SubLObject)module0745.T;
                    }
                }
            }
            if (module0745.NIL != Filesys.directory_p(var14)) {
                var15 = var23;
                var16 = Numbers.mod(Numbers.integerDivide(var15, var19), (SubLObject)module0745.$ic30$);
            }
            if (module0745.NIL != var22) {
                var20 = (SubLObject)module0745.T;
            }
            if (module0745.NIL == var20) {
                var13 = Numbers.add(var13, var19);
            }
        }
        return Values.values(var14, var13, var15, var16);
    }
    
    public static SubLObject f46251(final SubLObject var64, final SubLObject var73) {
        final SubLThread var74 = SubLProcess.currentSubLThread();
        final SubLObject var75 = Sequences.cconcatenate(var64, (SubLObject)module0745.$ic78$);
        final SubLObject var76 = Sequences.cconcatenate(var64, (SubLObject)module0745.$ic79$);
        final SubLObject var77 = Sequences.cconcatenate(var64, (SubLObject)module0745.$ic85$);
        SubLObject var78 = (SubLObject)module0745.NIL;
        module0075.f5248(var75, var77);
        SubLObject var79 = (SubLObject)module0745.NIL;
        try {
            final SubLObject var80 = stream_macros.$stream_requires_locking$.currentBinding(var74);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0745.NIL, var74);
                var79 = compatibility.open_binary(var77, (SubLObject)module0745.$ic50$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var80, var74);
            }
            if (!var79.isStream()) {
                Errors.error((SubLObject)module0745.$ic51$, var77);
            }
            final SubLObject var52_82 = var79;
            SubLObject var83_84 = (SubLObject)module0745.NIL;
            try {
                final SubLObject var81 = stream_macros.$stream_requires_locking$.currentBinding(var74);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0745.NIL, var74);
                    var83_84 = compatibility.open_binary(var75, (SubLObject)module0745.$ic86$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var81, var74);
                }
                if (!var83_84.isStream()) {
                    Errors.error((SubLObject)module0745.$ic51$, var75);
                }
                final SubLObject var82 = var83_84;
                SubLObject var86_87 = (SubLObject)module0745.NIL;
                try {
                    final SubLObject var83 = stream_macros.$stream_requires_locking$.currentBinding(var74);
                    try {
                        stream_macros.$stream_requires_locking$.bind((SubLObject)module0745.NIL, var74);
                        var86_87 = compatibility.open_binary(var76, (SubLObject)module0745.$ic86$);
                    }
                    finally {
                        stream_macros.$stream_requires_locking$.rebind(var83, var74);
                    }
                    if (!var86_87.isStream()) {
                        Errors.error((SubLObject)module0745.$ic51$, var76);
                    }
                    final SubLObject var84 = var86_87;
                    while (module0745.NIL == var78) {
                        final SubLObject var85 = module0021.f1060(var52_82, (SubLObject)module0745.NIL, (SubLObject)module0745.$ic52$);
                        final SubLObject var86 = module0021.f1060(var52_82, (SubLObject)module0745.NIL, (SubLObject)module0745.UNPROVIDED);
                        if (module0745.NIL != module0173.f10955(var85)) {
                            module0021.f1040(var85, var82);
                            module0021.f1040(var86, var82);
                            module0021.f1038(var85, var84);
                            module0021.f1038(var86, var84);
                            module0077.f5326(var85, var73);
                        }
                        else {
                            var78 = (SubLObject)module0745.T;
                        }
                    }
                }
                finally {
                    final SubLObject var87 = Threads.$is_thread_performing_cleanupP$.currentBinding(var74);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0745.T, var74);
                        if (var86_87.isStream()) {
                            streams_high.close(var86_87, (SubLObject)module0745.UNPROVIDED);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var87, var74);
                    }
                }
            }
            finally {
                final SubLObject var88 = Threads.$is_thread_performing_cleanupP$.currentBinding(var74);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0745.T, var74);
                    if (var83_84.isStream()) {
                        streams_high.close(var83_84, (SubLObject)module0745.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var88, var74);
                }
            }
        }
        finally {
            final SubLObject var89 = Threads.$is_thread_performing_cleanupP$.currentBinding(var74);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0745.T, var74);
                if (var79.isStream()) {
                    streams_high.close(var79, (SubLObject)module0745.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var89, var74);
            }
        }
        Filesys.delete_file(var77);
        return var64;
    }
    
    public static SubLObject f46252(final SubLObject var64, final SubLObject var57, final SubLObject var61, final SubLObject var46, final SubLObject var45, final SubLObject var73) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore          var12
        //     5: aload_0         
        //     6: getstatic       com/cyc/cycjava/cycl/module0745.$ic87$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        //     9: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Sequences.cconcatenate:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //    12: astore          var89
        //    14: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //    17: astore          var49
        //    19: getstatic       com/cyc/cycjava/cycl/module0745.ZERO_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        //    22: astore          var90
        //    24: getstatic       com/cyc/cycjava/cycl/module0745.$g5952$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //    27: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.getGlobalValue:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //    32: astore          var91
        //    34: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //    37: astore          var92
        //    39: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //    42: astore          var93
        //    44: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Time.get_universal_time:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //    47: astore          var94
        //    49: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //    52: astore          var95
        //    54: getstatic       com/cyc/cycjava/cycl/module0745.$g5939$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //    57: aload           var12
        //    59: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.getDynamicValue:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //    64: astore          var23
        //    66: getstatic       com/cyc/cycjava/cycl/module0745.$g5940$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //    69: aload           var12
        //    71: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.getDynamicValue:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //    76: astore          var24
        //    78: getstatic       com/cyc/cycjava/cycl/module0745.$g5945$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //    81: aload           var12
        //    83: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //    88: astore          var17
        //    90: getstatic       com/cyc/cycjava/cycl/module0745.$g5946$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //    93: aload           var12
        //    95: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   100: astore          var25
        //   102: getstatic       com/cyc/cycjava/cycl/module0745.$g5947$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   105: aload           var12
        //   107: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   112: astore          var26
        //   114: getstatic       com/cyc/cycjava/cycl/module0745.$g5948$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   117: aload           var12
        //   119: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   124: astore          var32
        //   126: getstatic       com/cyc/cycjava/cycl/module0745.$g5949$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   129: aload           var12
        //   131: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   136: astore          var96
        //   138: getstatic       com/cyc/cycjava/cycl/module0745.$g5950$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   141: aload           var12
        //   143: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   148: astore          var97
        //   150: getstatic       com/cyc/cycjava/cycl/module0745.$g5945$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   153: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //   156: aload           var12
        //   158: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //   163: getstatic       com/cyc/cycjava/cycl/module0745.$g5946$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   166: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //   169: aload           var12
        //   171: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //   176: getstatic       com/cyc/cycjava/cycl/module0745.$g5947$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   179: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //   182: aload           var12
        //   184: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //   189: getstatic       com/cyc/cycjava/cycl/module0745.$g5948$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   192: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //   195: aload           var12
        //   197: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //   202: getstatic       com/cyc/cycjava/cycl/module0745.$g5949$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   205: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //   208: aload           var12
        //   210: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //   215: getstatic       com/cyc/cycjava/cycl/module0745.$g5950$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   218: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //   221: aload           var12
        //   223: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //   228: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //   231: astore          var98
        //   233: aload           var89
        //   235: getstatic       com/cyc/cycjava/cycl/module0745.$ic88$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   238: invokestatic    com/cyc/tool/subl/jrtl/translatedCode/sublisp/compatibility.open_text:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   241: astore          var98
        //   243: aload           var98
        //   245: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject.isStream:()Z
        //   250: ifne            262
        //   253: getstatic       com/cyc/cycjava/cycl/module0745.$ic51$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        //   256: aload           var89
        //   258: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Errors.error:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   261: pop            
        //   262: aload           var98
        //   264: astore          var99
        //   266: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //   269: astore          var100_101
        //   271: getstatic       com/cyc/tool/subl/jrtl/translatedCode/sublisp/stream_macros.$stream_requires_locking$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   274: aload           var12
        //   276: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   281: astore          var17_102
        //   283: getstatic       com/cyc/tool/subl/jrtl/translatedCode/sublisp/stream_macros.$stream_requires_locking$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   286: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //   289: aload           var12
        //   291: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //   296: aload_3         
        //   297: getstatic       com/cyc/cycjava/cycl/module0745.$ic88$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   300: invokestatic    com/cyc/tool/subl/jrtl/translatedCode/sublisp/compatibility.open_binary:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   303: astore          var100_101
        //   305: getstatic       com/cyc/tool/subl/jrtl/translatedCode/sublisp/stream_macros.$stream_requires_locking$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   308: aload           var17_102
        //   310: aload           var12
        //   312: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //   317: goto            337
        //   320: astore          27
        //   322: getstatic       com/cyc/tool/subl/jrtl/translatedCode/sublisp/stream_macros.$stream_requires_locking$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   325: aload           var17_102
        //   327: aload           var12
        //   329: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //   334: aload           27
        //   336: athrow         
        //   337: aload           var100_101
        //   339: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject.isStream:()Z
        //   344: ifne            355
        //   347: getstatic       com/cyc/cycjava/cycl/module0745.$ic51$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        //   350: aload_3         
        //   351: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Errors.error:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   354: pop            
        //   355: aload           var100_101
        //   357: astore          var85
        //   359: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //   362: astore          var103_104
        //   364: getstatic       com/cyc/tool/subl/jrtl/translatedCode/sublisp/stream_macros.$stream_requires_locking$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   367: aload           var12
        //   369: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   374: astore          var17_105
        //   376: getstatic       com/cyc/tool/subl/jrtl/translatedCode/sublisp/stream_macros.$stream_requires_locking$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   379: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //   382: aload           var12
        //   384: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //   389: aload           var45
        //   391: getstatic       com/cyc/cycjava/cycl/module0745.$ic88$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   394: invokestatic    com/cyc/tool/subl/jrtl/translatedCode/sublisp/compatibility.open_binary:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   397: astore          var103_104
        //   399: getstatic       com/cyc/tool/subl/jrtl/translatedCode/sublisp/stream_macros.$stream_requires_locking$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   402: aload           var17_105
        //   404: aload           var12
        //   406: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //   411: goto            431
        //   414: astore          29
        //   416: getstatic       com/cyc/tool/subl/jrtl/translatedCode/sublisp/stream_macros.$stream_requires_locking$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   419: aload           var17_105
        //   421: aload           var12
        //   423: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //   428: aload           29
        //   430: athrow         
        //   431: aload           var103_104
        //   433: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject.isStream:()Z
        //   438: ifne            450
        //   441: getstatic       com/cyc/cycjava/cycl/module0745.$ic51$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        //   444: aload           var45
        //   446: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Errors.error:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   449: pop            
        //   450: aload           var103_104
        //   452: astore          var88
        //   454: getstatic       com/cyc/cycjava/cycl/module0580.$g4361$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   457: aload           var12
        //   459: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   464: astore          var17_106
        //   466: getstatic       com/cyc/cycjava/cycl/module0580.$g4361$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   469: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //   472: aload           var12
        //   474: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //   479: aload           var12
        //   481: invokevirtual   com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.resetMultipleValues:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   484: pop            
        //   485: getstatic       com/cyc/cycjava/cycl/module0580.$g4362$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   488: aload           var12
        //   490: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   495: astore          var17_107
        //   497: getstatic       com/cyc/cycjava/cycl/module0580.$g4362$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   500: invokestatic    com/cyc/cycjava/cycl/module0580.f35560:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   503: aload           var12
        //   505: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //   510: aload           var12
        //   512: invokevirtual   com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.secondMultipleValue:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   515: astore          var108
        //   517: aload           var12
        //   519: invokevirtual   com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.resetMultipleValues:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   522: pop            
        //   523: aload           var12
        //   525: invokevirtual   com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.resetMultipleValues:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   528: pop            
        //   529: getstatic       com/cyc/cycjava/cycl/module0580.$g4358$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   532: aload           var12
        //   534: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   539: astore          var17_109
        //   541: getstatic       com/cyc/cycjava/cycl/module0580.$g4358$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   544: invokestatic    com/cyc/cycjava/cycl/module0580.f35544:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   547: aload           var12
        //   549: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //   554: aload           var12
        //   556: invokevirtual   com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.secondMultipleValue:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   559: astore          var110
        //   561: aload           var12
        //   563: invokevirtual   com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.resetMultipleValues:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   566: pop            
        //   567: getstatic       com/cyc/cycjava/cycl/module0580.$g4359$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   570: aload           var12
        //   572: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   577: astore          var17_111
        //   579: getstatic       com/cyc/cycjava/cycl/module0580.$g4359$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   582: invokestatic    com/cyc/cycjava/cycl/module0580.f35545:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   585: aload           var12
        //   587: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //   592: getstatic       com/cyc/cycjava/cycl/module0580.$g4358$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   595: aload           var12
        //   597: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.getDynamicValue:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   602: astore          var112
        //   604: getstatic       com/cyc/cycjava/cycl/module0034.$g879$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   607: aload           var12
        //   609: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   614: astore          var17_113
        //   616: getstatic       com/cyc/cycjava/cycl/module0034.$g879$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   619: aload           var112
        //   621: aload           var12
        //   623: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //   628: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //   631: astore          var114
        //   633: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //   636: aload           var112
        //   638: if_acmpeq       702
        //   641: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //   644: aload           var112
        //   646: invokestatic    com/cyc/cycjava/cycl/module0034.f1842:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   649: if_acmpne       702
        //   652: aload           var112
        //   654: invokestatic    com/cyc/cycjava/cycl/module0034.f1869:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   657: astore          var114
        //   659: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.current_process:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   662: astore          var115
        //   664: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //   667: aload           var114
        //   669: if_acmpne       683
        //   672: aload           var112
        //   674: aload           var115
        //   676: invokestatic    com/cyc/cycjava/cycl/module0034.f1873:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   679: pop            
        //   680: goto            702
        //   683: aload           var114
        //   685: aload           var115
        //   687: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject.eql:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Z
        //   692: ifne            702
        //   695: getstatic       com/cyc/cycjava/cycl/module0745.$ic89$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        //   698: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Errors.error:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   701: pop            
        //   702: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   705: aload           var12
        //   707: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   712: astore          var17_116
        //   714: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   717: getstatic       com/cyc/cycjava/cycl/module0745.T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        //   720: aload           var12
        //   722: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //   727: invokestatic    com/cyc/cycjava/cycl/module0176.f11128:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   730: pop            
        //   731: invokestatic    com/cyc/cycjava/cycl/module0176.f11126:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   734: pop            
        //   735: getstatic       com/cyc/cycjava/cycl/module0012.$g75$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   738: aload           var12
        //   740: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   745: astore          var17_117
        //   747: getstatic       com/cyc/cycjava/cycl/module0012.$g76$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   750: aload           var12
        //   752: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   757: astore          var25_118
        //   759: getstatic       com/cyc/cycjava/cycl/module0012.$g77$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   762: aload           var12
        //   764: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   769: astore          var26_119
        //   771: getstatic       com/cyc/cycjava/cycl/module0012.$g78$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   774: aload           var12
        //   776: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   781: astore          var32_120
        //   783: getstatic       com/cyc/cycjava/cycl/module0012.$g75$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   786: getstatic       com/cyc/cycjava/cycl/module0745.ZERO_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        //   789: aload           var12
        //   791: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //   796: getstatic       com/cyc/cycjava/cycl/module0012.$g76$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   799: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //   802: aload           var12
        //   804: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //   809: getstatic       com/cyc/cycjava/cycl/module0012.$g77$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   812: getstatic       com/cyc/cycjava/cycl/module0745.T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        //   815: aload           var12
        //   817: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //   822: getstatic       com/cyc/cycjava/cycl/module0012.$g78$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   825: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Time.get_universal_time:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   828: aload           var12
        //   830: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //   835: getstatic       com/cyc/cycjava/cycl/module0745.$ic90$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        //   838: iconst_4       
        //   839: anewarray       Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   842: dup            
        //   843: iconst_0       
        //   844: aload_1         
        //   845: invokestatic    com/cyc/cycjava/cycl/module0006.f205:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   848: aastore        
        //   849: dup            
        //   850: iconst_1       
        //   851: getstatic       com/cyc/cycjava/cycl/module0745.$ic91$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        //   854: aastore        
        //   855: dup            
        //   856: iconst_2       
        //   857: aload_2         
        //   858: invokestatic    com/cyc/cycjava/cycl/module0006.f205:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   861: aastore        
        //   862: dup            
        //   863: iconst_3       
        //   864: getstatic       com/cyc/cycjava/cycl/module0745.$ic92$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        //   867: aastore        
        //   868: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Sequences.cconcatenate:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;[Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   871: invokestatic    com/cyc/cycjava/cycl/module0012.f478:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   874: pop            
        //   875: getstatic       com/cyc/cycjava/cycl/module0012.$silent_progressP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   878: aload           var12
        //   880: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   885: astore          var17_121
        //   887: getstatic       com/cyc/cycjava/cycl/module0012.$silent_progressP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   890: getstatic       com/cyc/cycjava/cycl/module0745.T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        //   893: aload           var12
        //   895: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //   900: getstatic       com/cyc/cycjava/cycl/module0745.$ic93$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        //   903: astore          var122
        //   905: invokestatic    com/cyc/cycjava/cycl/module0173.f10962:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   908: astore          var123
        //   910: getstatic       com/cyc/cycjava/cycl/module0745.ZERO_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        //   913: astore          var124
        //   915: getstatic       com/cyc/cycjava/cycl/module0012.$g75$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   918: aload           var12
        //   920: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   925: astore          var17_125
        //   927: getstatic       com/cyc/cycjava/cycl/module0012.$g76$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   930: aload           var12
        //   932: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   937: astore          var25_126
        //   939: getstatic       com/cyc/cycjava/cycl/module0012.$g77$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   942: aload           var12
        //   944: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   949: astore          var26_127
        //   951: getstatic       com/cyc/cycjava/cycl/module0012.$g78$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   954: aload           var12
        //   956: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   961: astore          var32_128
        //   963: getstatic       com/cyc/cycjava/cycl/module0012.$g75$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   966: getstatic       com/cyc/cycjava/cycl/module0745.ZERO_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        //   969: aload           var12
        //   971: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //   976: getstatic       com/cyc/cycjava/cycl/module0012.$g76$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   979: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //   982: aload           var12
        //   984: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //   989: getstatic       com/cyc/cycjava/cycl/module0012.$g77$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   992: getstatic       com/cyc/cycjava/cycl/module0745.T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        //   995: aload           var12
        //   997: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  1002: getstatic       com/cyc/cycjava/cycl/module0012.$g78$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  1005: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Time.get_universal_time:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1008: aload           var12
        //  1010: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  1015: aload           var122
        //  1017: invokestatic    com/cyc/cycjava/cycl/module0012.f478:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1020: pop            
        //  1021: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  1024: astore          var129
        //  1026: invokestatic    com/cyc/cycjava/cycl/module0173.f10961:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1029: astore          var129
        //  1031: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  1034: aload           var49
        //  1036: if_acmpne       4318
        //  1039: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  1042: aload           var129
        //  1044: if_acmpeq       4318
        //  1047: aload           var129
        //  1049: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject.first:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1054: astore          var130
        //  1056: aload           var130
        //  1058: astore          var131
        //  1060: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  1063: aload           var131
        //  1065: getstatic       com/cyc/cycjava/cycl/module0745.$ic94$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  1068: invokestatic    com/cyc/cycjava/cycl/module0065.f4772:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1071: if_acmpne       4306
        //  1074: aload           var131
        //  1076: astore          var132_133
        //  1078: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  1081: aload           var132_133
        //  1083: getstatic       com/cyc/cycjava/cycl/module0745.$ic94$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  1086: invokestatic    com/cyc/cycjava/cycl/module0065.f4775:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1089: if_acmpne       2775
        //  1092: aload           var132_133
        //  1094: invokestatic    com/cyc/cycjava/cycl/module0065.f4740:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1097: astore          var134
        //  1099: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  1102: astore          var135
        //  1104: aload           var134
        //  1106: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Sequences.length:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1109: astore          var136
        //  1111: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  1114: aload           var135
        //  1116: if_acmpeq       1139
        //  1119: aload           var136
        //  1121: getstatic       com/cyc/cycjava/cycl/module0745.ONE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        //  1124: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Numbers.subtract:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1127: getstatic       com/cyc/cycjava/cycl/module0745.MINUS_ONE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        //  1130: getstatic       com/cyc/cycjava/cycl/module0745.MINUS_ONE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        //  1133: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        //  1136: goto            1150
        //  1139: getstatic       com/cyc/cycjava/cycl/module0745.ZERO_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        //  1142: aload           var136
        //  1144: getstatic       com/cyc/cycjava/cycl/module0745.ONE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        //  1147: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        //  1150: astore          var137
        //  1152: aload           var137
        //  1154: astore          var138
        //  1156: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  1159: astore          var139
        //  1161: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  1164: astore          var140
        //  1166: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  1169: astore          var141
        //  1171: aload           var138
        //  1173: aload           var137
        //  1175: getstatic       com/cyc/cycjava/cycl/module0745.$ic95$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        //  1178: invokestatic    com/cyc/tool/subl/jrtl/translatedCode/sublisp/cdestructuring_bind.destructuring_bind_must_consp:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1181: pop            
        //  1182: aload           var138
        //  1184: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject.first:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1189: astore          var139
        //  1191: aload           var138
        //  1193: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject.rest:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1198: astore          var138
        //  1200: aload           var138
        //  1202: aload           var137
        //  1204: getstatic       com/cyc/cycjava/cycl/module0745.$ic95$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        //  1207: invokestatic    com/cyc/tool/subl/jrtl/translatedCode/sublisp/cdestructuring_bind.destructuring_bind_must_consp:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1210: pop            
        //  1211: aload           var138
        //  1213: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject.first:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1218: astore          var140
        //  1220: aload           var138
        //  1222: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject.rest:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1227: astore          var138
        //  1229: aload           var138
        //  1231: aload           var137
        //  1233: getstatic       com/cyc/cycjava/cycl/module0745.$ic95$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        //  1236: invokestatic    com/cyc/tool/subl/jrtl/translatedCode/sublisp/cdestructuring_bind.destructuring_bind_must_consp:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1239: pop            
        //  1240: aload           var138
        //  1242: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject.first:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1247: astore          var141
        //  1249: aload           var138
        //  1251: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject.rest:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1256: astore          var138
        //  1258: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  1261: aload           var138
        //  1263: if_acmpne       2766
        //  1266: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  1269: aload           var49
        //  1271: if_acmpne       2775
        //  1274: aload           var140
        //  1276: astore          var142
        //  1278: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  1281: astore          var143
        //  1283: aload           var139
        //  1285: astore          var143
        //  1287: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  1290: aload           var49
        //  1292: if_acmpne       2763
        //  1295: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  1298: aload           var143
        //  1300: aload           var141
        //  1302: aload           var142
        //  1304: invokestatic    com/cyc/cycjava/cycl/module0005.f124:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1307: if_acmpne       2763
        //  1310: aload           var134
        //  1312: aload           var143
        //  1314: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Vectors.aref:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1317: astore          var47
        //  1319: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  1322: aload           var47
        //  1324: invokestatic    com/cyc/cycjava/cycl/module0065.f4749:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1327: if_acmpeq       1342
        //  1330: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  1333: getstatic       com/cyc/cycjava/cycl/module0745.$ic94$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  1336: invokestatic    com/cyc/cycjava/cycl/module0065.f4773:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1339: if_acmpne       2751
        //  1342: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  1345: aload           var47
        //  1347: invokestatic    com/cyc/cycjava/cycl/module0065.f4749:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1350: if_acmpeq       1358
        //  1353: getstatic       com/cyc/cycjava/cycl/module0745.$ic94$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  1356: astore          var47
        //  1358: aload           var124
        //  1360: getstatic       com/cyc/cycjava/cycl/module0745.ONE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        //  1363: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Numbers.add:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1366: astore          var124
        //  1368: aload           var124
        //  1370: aload           var123
        //  1372: invokestatic    com/cyc/cycjava/cycl/module0012.note_percent_progress:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1375: pop            
        //  1376: aload           var90
        //  1378: getstatic       com/cyc/cycjava/cycl/module0745.ONE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        //  1381: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Numbers.add:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1384: astore          var90
        //  1386: getstatic       com/cyc/cycjava/cycl/module0012.$silent_progressP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  1389: aload           var12
        //  1391: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1396: astore          var17_144
        //  1398: getstatic       com/cyc/cycjava/cycl/module0012.$silent_progressP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  1401: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  1404: aload           var12
        //  1406: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  1411: aload           var90
        //  1413: aload_1         
        //  1414: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Numbers.subtract:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1417: aload_2         
        //  1418: aload_1         
        //  1419: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Numbers.subtract:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1422: invokestatic    com/cyc/cycjava/cycl/module0048.f_1X:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1425: invokestatic    com/cyc/cycjava/cycl/module0012.note_percent_progress:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1428: pop            
        //  1429: getstatic       com/cyc/cycjava/cycl/module0012.$silent_progressP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  1432: aload           var17_144
        //  1434: aload           var12
        //  1436: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  1441: goto            1461
        //  1444: astore          67
        //  1446: getstatic       com/cyc/cycjava/cycl/module0012.$silent_progressP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  1449: aload           var17_144
        //  1451: aload           var12
        //  1453: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  1458: aload           67
        //  1460: athrow         
        //  1461: aload           var90
        //  1463: aload_1         
        //  1464: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject.numL:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Z
        //  1469: ifne            2628
        //  1472: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  1475: aload           var47
        //  1477: aload           var73
        //  1479: invokestatic    com/cyc/cycjava/cycl/module0077.f5320:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1482: if_acmpne       2628
        //  1485: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  1488: aload           var47
        //  1490: invokestatic    com/cyc/cycjava/cycl/module0745.f46253:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1493: if_acmpne       2628
        //  1496: getstatic       com/cyc/cycjava/cycl/module0745.$g5943$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  1499: aload           var12
        //  1501: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.getDynamicValue:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1506: astore          var145
        //  1508: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  1511: astore          var146
        //  1513: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  1516: astore          var147
        //  1518: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  1521: astore          var148
        //  1523: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  1526: astore          var149
        //  1528: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  1531: astore          var150
        //  1533: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  1536: astore          var151
        //  1538: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Time.get_internal_real_time:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1541: astore          var152
        //  1543: invokestatic    com/cyc/cycjava/cycl/module0003.f61:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1546: astore          var153
        //  1548: aload           var12
        //  1550: getfield        com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.throwStack:Ljava/util/Deque;
        //  1553: aload           var153
        //  1555: invokeinterface java/util/Deque.push:(Ljava/lang/Object;)V
        //  1560: getstatic       com/cyc/cycjava/cycl/module0003.$g4$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  1563: aload           var12
        //  1565: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1570: astore          var17_154
        //  1572: getstatic       com/cyc/cycjava/cycl/module0003.$g4$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  1575: getstatic       com/cyc/cycjava/cycl/module0745.T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        //  1578: aload           var12
        //  1580: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  1585: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  1588: astore          var155
        //  1590: getstatic       com/cyc/cycjava/cycl/module0003.$g5$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  1593: aload           var12
        //  1595: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1600: astore          var17_156
        //  1602: getstatic       com/cyc/cycjava/cycl/module0003.$g5$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  1605: getstatic       com/cyc/cycjava/cycl/module0745.ONE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        //  1608: getstatic       com/cyc/cycjava/cycl/module0003.$g5$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  1611: aload           var12
        //  1613: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.getDynamicValue:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1618: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Numbers.add:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1621: aload           var12
        //  1623: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  1628: aload           var145
        //  1630: aload           var153
        //  1632: invokestatic    com/cyc/cycjava/cycl/module0003.f62:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1635: astore          var155
        //  1637: aload           var12
        //  1639: invokevirtual   com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.resetMultipleValues:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1642: pop            
        //  1643: aload           var47
        //  1645: aload           var23
        //  1647: aload           var24
        //  1649: invokestatic    com/cyc/cycjava/cycl/module0745.f46254:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1652: astore          var157_158
        //  1654: aload           var12
        //  1656: invokevirtual   com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.secondMultipleValue:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1659: astore          var159_160
        //  1661: aload           var12
        //  1663: invokevirtual   com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.thirdMultipleValue:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1666: astore          var161_162
        //  1668: aload           var12
        //  1670: invokevirtual   com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.fourthMultipleValue:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1673: astore          var163_164
        //  1675: aload           var12
        //  1677: invokevirtual   com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.resetMultipleValues:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1680: pop            
        //  1681: aload           var157_158
        //  1683: astore          var148
        //  1685: aload           var159_160
        //  1687: astore          var149
        //  1689: aload           var161_162
        //  1691: astore          var151
        //  1693: aload           var163_164
        //  1695: astore          var150
        //  1697: getstatic       com/cyc/cycjava/cycl/module0003.$g5$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  1700: aload           var17_156
        //  1702: aload           var12
        //  1704: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  1709: goto            1729
        //  1712: astore          82
        //  1714: getstatic       com/cyc/cycjava/cycl/module0003.$g5$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  1717: aload           var17_156
        //  1719: aload           var12
        //  1721: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  1726: aload           82
        //  1728: athrow         
        //  1729: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  1732: aload           var12
        //  1734: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1739: astore          var17_165
        //  1741: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  1744: getstatic       com/cyc/cycjava/cycl/module0745.T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        //  1747: aload           var12
        //  1749: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  1754: aload           var155
        //  1756: invokestatic    com/cyc/cycjava/cycl/module0003.f64:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1759: pop            
        //  1760: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  1763: aload           var17_165
        //  1765: aload           var12
        //  1767: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  1772: goto            1792
        //  1775: astore          83
        //  1777: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  1780: aload           var17_165
        //  1782: aload           var12
        //  1784: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  1789: aload           83
        //  1791: athrow         
        //  1792: goto            1863
        //  1795: astore          84
        //  1797: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  1800: aload           var12
        //  1802: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1807: astore          var17_165
        //  1809: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  1812: getstatic       com/cyc/cycjava/cycl/module0745.T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        //  1815: aload           var12
        //  1817: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  1822: aload           var155
        //  1824: invokestatic    com/cyc/cycjava/cycl/module0003.f64:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1827: pop            
        //  1828: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  1831: aload           var17_165
        //  1833: aload           var12
        //  1835: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  1840: goto            1860
        //  1843: astore          86
        //  1845: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  1848: aload           var17_165
        //  1850: aload           var12
        //  1852: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  1857: aload           86
        //  1859: athrow         
        //  1860: aload           84
        //  1862: athrow         
        //  1863: getstatic       com/cyc/cycjava/cycl/module0003.$g4$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  1866: aload           var17_154
        //  1868: aload           var12
        //  1870: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  1875: goto            1895
        //  1878: astore          87
        //  1880: getstatic       com/cyc/cycjava/cycl/module0003.$g4$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  1883: aload           var17_154
        //  1885: aload           var12
        //  1887: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  1892: aload           87
        //  1894: athrow         
        //  1895: aload           var12
        //  1897: getfield        com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.throwStack:Ljava/util/Deque;
        //  1900: invokeinterface java/util/Deque.pop:()Ljava/lang/Object;
        //  1905: pop            
        //  1906: goto            1950
        //  1909: astore          var79
        //  1911: aload           var79
        //  1913: aload           var153
        //  1915: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Errors.handleThrowable:(Ljava/lang/Throwable;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1918: astore          var146
        //  1920: aload           var12
        //  1922: getfield        com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.throwStack:Ljava/util/Deque;
        //  1925: invokeinterface java/util/Deque.pop:()Ljava/lang/Object;
        //  1930: pop            
        //  1931: goto            1950
        //  1934: astore          88
        //  1936: aload           var12
        //  1938: getfield        com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.throwStack:Ljava/util/Deque;
        //  1941: invokeinterface java/util/Deque.pop:()Ljava/lang/Object;
        //  1946: pop            
        //  1947: aload           88
        //  1949: athrow         
        //  1950: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Time.get_internal_real_time:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1953: aload           var152
        //  1955: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Numbers.subtract:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1958: getstatic       com/cyc/tool/subl/jrtl/translatedCode/sublisp/time_high.$internal_time_units_per_second$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  1961: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.getGlobalValue:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1966: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Numbers.divide:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1969: astore          var147
        //  1971: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  1974: aload           var146
        //  1976: if_acmpeq       2445
        //  1979: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  1982: getstatic       com/cyc/cycjava/cycl/module0745.$g5942$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  1985: aload           var12
        //  1987: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.getDynamicValue:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  1992: if_acmpeq       2445
        //  1995: getstatic       com/cyc/cycjava/cycl/module0745.$ic96$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        //  1998: aload           var145
        //  2000: getstatic       com/cyc/cycjava/cycl/module0745.UNPROVIDED:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  2003: invokestatic    com/cyc/cycjava/cycl/module0051.f3574:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2006: aload           var47
        //  2008: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Errors.warn:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2011: pop            
        //  2012: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Time.get_internal_real_time:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2015: astore          var152
        //  2017: invokestatic    com/cyc/cycjava/cycl/module0003.f61:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2020: astore          var153
        //  2022: aload           var12
        //  2024: getfield        com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.throwStack:Ljava/util/Deque;
        //  2027: aload           var153
        //  2029: invokeinterface java/util/Deque.push:(Ljava/lang/Object;)V
        //  2034: getstatic       com/cyc/cycjava/cycl/module0003.$g4$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  2037: aload           var12
        //  2039: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2044: astore          var17_166
        //  2046: getstatic       com/cyc/cycjava/cycl/module0003.$g4$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  2049: getstatic       com/cyc/cycjava/cycl/module0745.T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        //  2052: aload           var12
        //  2054: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  2059: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  2062: astore          var155
        //  2064: getstatic       com/cyc/cycjava/cycl/module0003.$g5$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  2067: aload           var12
        //  2069: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2074: astore          var17_167
        //  2076: getstatic       com/cyc/cycjava/cycl/module0003.$g5$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  2079: getstatic       com/cyc/cycjava/cycl/module0745.ONE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        //  2082: getstatic       com/cyc/cycjava/cycl/module0003.$g5$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  2085: aload           var12
        //  2087: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.getDynamicValue:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2092: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Numbers.add:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2095: aload           var12
        //  2097: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  2102: aload           var145
        //  2104: aload           var153
        //  2106: invokestatic    com/cyc/cycjava/cycl/module0003.f62:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2109: astore          var155
        //  2111: aload           var12
        //  2113: invokevirtual   com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.resetMultipleValues:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2116: pop            
        //  2117: aload           var47
        //  2119: aload           var23
        //  2121: aload           var24
        //  2123: invokestatic    com/cyc/cycjava/cycl/module0745.f46254:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2126: astore          var168_169
        //  2128: aload           var12
        //  2130: invokevirtual   com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.secondMultipleValue:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2133: astore          var170_171
        //  2135: aload           var12
        //  2137: invokevirtual   com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.thirdMultipleValue:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2140: astore          var172_173
        //  2142: aload           var12
        //  2144: invokevirtual   com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.fourthMultipleValue:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2147: astore          var174_175
        //  2149: aload           var12
        //  2151: invokevirtual   com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.resetMultipleValues:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2154: pop            
        //  2155: aload           var168_169
        //  2157: astore          var148
        //  2159: aload           var170_171
        //  2161: astore          var149
        //  2163: aload           var172_173
        //  2165: astore          var151
        //  2167: aload           var174_175
        //  2169: astore          var150
        //  2171: getstatic       com/cyc/cycjava/cycl/module0003.$g5$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  2174: aload           var17_167
        //  2176: aload           var12
        //  2178: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  2183: goto            2203
        //  2186: astore          89
        //  2188: getstatic       com/cyc/cycjava/cycl/module0003.$g5$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  2191: aload           var17_167
        //  2193: aload           var12
        //  2195: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  2200: aload           89
        //  2202: athrow         
        //  2203: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  2206: aload           var12
        //  2208: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2213: astore          var17_176
        //  2215: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  2218: getstatic       com/cyc/cycjava/cycl/module0745.T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        //  2221: aload           var12
        //  2223: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  2228: aload           var155
        //  2230: invokestatic    com/cyc/cycjava/cycl/module0003.f64:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2233: pop            
        //  2234: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  2237: aload           var17_176
        //  2239: aload           var12
        //  2241: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  2246: goto            2266
        //  2249: astore          90
        //  2251: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  2254: aload           var17_176
        //  2256: aload           var12
        //  2258: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  2263: aload           90
        //  2265: athrow         
        //  2266: goto            2337
        //  2269: astore          91
        //  2271: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  2274: aload           var12
        //  2276: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2281: astore          var17_176
        //  2283: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  2286: getstatic       com/cyc/cycjava/cycl/module0745.T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        //  2289: aload           var12
        //  2291: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  2296: aload           var155
        //  2298: invokestatic    com/cyc/cycjava/cycl/module0003.f64:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2301: pop            
        //  2302: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  2305: aload           var17_176
        //  2307: aload           var12
        //  2309: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  2314: goto            2334
        //  2317: astore          93
        //  2319: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  2322: aload           var17_176
        //  2324: aload           var12
        //  2326: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  2331: aload           93
        //  2333: athrow         
        //  2334: aload           91
        //  2336: athrow         
        //  2337: getstatic       com/cyc/cycjava/cycl/module0003.$g4$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  2340: aload           var17_166
        //  2342: aload           var12
        //  2344: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  2349: goto            2369
        //  2352: astore          94
        //  2354: getstatic       com/cyc/cycjava/cycl/module0003.$g4$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  2357: aload           var17_166
        //  2359: aload           var12
        //  2361: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  2366: aload           94
        //  2368: athrow         
        //  2369: aload           var12
        //  2371: getfield        com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.throwStack:Ljava/util/Deque;
        //  2374: invokeinterface java/util/Deque.pop:()Ljava/lang/Object;
        //  2379: pop            
        //  2380: goto            2424
        //  2383: astore          var79
        //  2385: aload           var79
        //  2387: aload           var153
        //  2389: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Errors.handleThrowable:(Ljava/lang/Throwable;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2392: astore          var146
        //  2394: aload           var12
        //  2396: getfield        com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.throwStack:Ljava/util/Deque;
        //  2399: invokeinterface java/util/Deque.pop:()Ljava/lang/Object;
        //  2404: pop            
        //  2405: goto            2424
        //  2408: astore          95
        //  2410: aload           var12
        //  2412: getfield        com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.throwStack:Ljava/util/Deque;
        //  2415: invokeinterface java/util/Deque.pop:()Ljava/lang/Object;
        //  2420: pop            
        //  2421: aload           95
        //  2423: athrow         
        //  2424: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Time.get_internal_real_time:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2427: aload           var152
        //  2429: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Numbers.subtract:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2432: getstatic       com/cyc/tool/subl/jrtl/translatedCode/sublisp/time_high.$internal_time_units_per_second$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  2435: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.getGlobalValue:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2440: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Numbers.divide:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2443: astore          var147
        //  2445: aload           var147
        //  2447: aload           var92
        //  2449: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.cons:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLCons;
        //  2452: astore          var92
        //  2454: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  2457: aload           var146
        //  2459: if_acmpeq       2516
        //  2462: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  2465: getstatic       com/cyc/cycjava/cycl/module0745.$g5941$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  2468: aload           var12
        //  2470: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.getDynamicValue:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2475: if_acmpeq       2484
        //  2478: getstatic       com/cyc/cycjava/cycl/module0745.$ic97$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  2481: goto            2487
        //  2484: getstatic       com/cyc/cycjava/cycl/module0745.$ic98$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  2487: getstatic       com/cyc/cycjava/cycl/module0745.$ic99$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        //  2490: aload           var145
        //  2492: getstatic       com/cyc/cycjava/cycl/module0745.UNPROVIDED:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  2495: invokestatic    com/cyc/cycjava/cycl/module0051.f3574:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2498: aload           var47
        //  2500: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Functions.funcall:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2503: pop            
        //  2504: aload           var47
        //  2506: aload           var93
        //  2508: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.cons:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLCons;
        //  2511: astore          var93
        //  2513: goto            2628
        //  2516: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  2519: aload           var148
        //  2521: invokestatic    com/cyc/cycjava/cycl/module0209.f13550:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2524: if_acmpne       2548
        //  2527: getstatic       com/cyc/cycjava/cycl/module0745.$ic100$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        //  2530: aload           var47
        //  2532: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Errors.warn:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2535: pop            
        //  2536: aload           var47
        //  2538: aload           var93
        //  2540: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.cons:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLCons;
        //  2543: astore          var93
        //  2545: goto            2628
        //  2548: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  2551: aload           var148
        //  2553: getstatic       com/cyc/cycjava/cycl/module0745.$ic93$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        //  2556: invokestatic    com/cyc/cycjava/cycl/module0209.f13557:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2559: if_acmpeq       2583
        //  2562: getstatic       com/cyc/cycjava/cycl/module0745.$ic101$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        //  2565: aload           var47
        //  2567: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Errors.warn:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2570: pop            
        //  2571: aload           var47
        //  2573: aload           var93
        //  2575: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.cons:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLCons;
        //  2578: astore          var93
        //  2580: goto            2628
        //  2583: aload           var148
        //  2585: aload           var149
        //  2587: aload           var151
        //  2589: aload           var150
        //  2591: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        //  2594: astore          var48
        //  2596: aload           var47
        //  2598: aload           var85
        //  2600: invokestatic    com/cyc/cycjava/cycl/module0021.f1040:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2603: pop            
        //  2604: aload           var48
        //  2606: aload           var85
        //  2608: invokestatic    com/cyc/cycjava/cycl/module0021.f1040:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2611: pop            
        //  2612: aload           var47
        //  2614: aload           var88
        //  2616: invokestatic    com/cyc/cycjava/cycl/module0021.f1038:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2619: pop            
        //  2620: aload           var48
        //  2622: aload           var88
        //  2624: invokestatic    com/cyc/cycjava/cycl/module0021.f1038:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2627: pop            
        //  2628: aload           var90
        //  2630: aload           var91
        //  2632: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Numbers.mod:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2635: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject.isZero:()Z
        //  2640: ifeq            2735
        //  2643: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  2646: aload           var92
        //  2648: invokestatic    com/cyc/cycjava/cycl/module0035.f2013:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2651: if_acmpeq       2735
        //  2654: getstatic       com/cyc/cycjava/cycl/module0745.UNPROVIDED:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  2657: invokestatic    com/cyc/cycjava/cycl/module0745.f46255:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2660: pop            
        //  2661: aload           var90
        //  2663: aload           var91
        //  2665: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Numbers.integerDivide:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2668: astore          var177
        //  2670: getstatic       com/cyc/cycjava/cycl/module0745.$g5949$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  2673: aload           var177
        //  2675: aload           var93
        //  2677: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Sequences.length:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2680: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        //  2683: getstatic       com/cyc/cycjava/cycl/module0745.$g5949$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  2686: aload           var12
        //  2688: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.getDynamicValue:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2693: invokestatic    com/cyc/cycjava/cycl/module0035.f2083:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2696: aload           var12
        //  2698: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.setDynamicValue:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  2703: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  2706: astore          var93
        //  2708: aload           var90
        //  2710: aload           var91
        //  2712: aload           var94
        //  2714: aload           var95
        //  2716: aload           var92
        //  2718: aload_0         
        //  2719: aload           var99
        //  2721: invokestatic    com/cyc/cycjava/cycl/module0745.f46256:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2724: pop            
        //  2725: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Time.get_universal_time:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2728: astore          var94
        //  2730: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  2733: astore          var92
        //  2735: aload           var90
        //  2737: aload_2         
        //  2738: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject.numGE:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Z
        //  2743: ifeq            2751
        //  2746: getstatic       com/cyc/cycjava/cycl/module0745.T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        //  2749: astore          var49
        //  2751: aload           var143
        //  2753: aload           var141
        //  2755: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Numbers.add:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2758: astore          var143
        //  2760: goto            1287
        //  2763: goto            2775
        //  2766: aload           var137
        //  2768: getstatic       com/cyc/cycjava/cycl/module0745.$ic95$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        //  2771: invokestatic    com/cyc/tool/subl/jrtl/translatedCode/sublisp/cdestructuring_bind.cdestructuring_bind_error:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2774: pop            
        //  2775: aload           var131
        //  2777: astore          var178_179
        //  2779: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  2782: aload           var178_179
        //  2784: invokestatic    com/cyc/cycjava/cycl/module0065.f4777:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2787: if_acmpeq       2802
        //  2790: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  2793: getstatic       com/cyc/cycjava/cycl/module0745.$ic94$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  2796: invokestatic    com/cyc/cycjava/cycl/module0065.f4773:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2799: if_acmpne       4306
        //  2802: aload           var178_179
        //  2804: invokestatic    com/cyc/cycjava/cycl/module0065.f4738:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2807: astore          var180
        //  2809: aload           var178_179
        //  2811: invokestatic    com/cyc/cycjava/cycl/module0065.f4739:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2814: astore          var143
        //  2816: aload           var178_179
        //  2818: invokestatic    com/cyc/cycjava/cycl/module0065.f4734:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2821: astore          var181
        //  2823: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  2826: getstatic       com/cyc/cycjava/cycl/module0745.$ic94$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  2829: invokestatic    com/cyc/cycjava/cycl/module0065.f4773:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2832: if_acmpeq       2841
        //  2835: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  2838: goto            2844
        //  2841: getstatic       com/cyc/cycjava/cycl/module0745.$ic94$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  2844: astore          var182
        //  2846: aload           var143
        //  2848: aload           var181
        //  2850: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject.numL:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Z
        //  2855: ifeq            4306
        //  2858: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  2861: aload           var49
        //  2863: if_acmpne       4306
        //  2866: aload           var143
        //  2868: aload           var180
        //  2870: aload           var182
        //  2872: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Hashtables.gethash_without_values:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2875: astore          var47
        //  2877: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  2880: getstatic       com/cyc/cycjava/cycl/module0745.$ic94$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  2883: invokestatic    com/cyc/cycjava/cycl/module0065.f4773:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2886: if_acmpeq       2900
        //  2889: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  2892: aload           var47
        //  2894: invokestatic    com/cyc/cycjava/cycl/module0065.f4749:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2897: if_acmpne       4293
        //  2900: aload           var124
        //  2902: getstatic       com/cyc/cycjava/cycl/module0745.ONE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        //  2905: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Numbers.add:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2908: astore          var124
        //  2910: aload           var124
        //  2912: aload           var123
        //  2914: invokestatic    com/cyc/cycjava/cycl/module0012.note_percent_progress:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2917: pop            
        //  2918: aload           var90
        //  2920: getstatic       com/cyc/cycjava/cycl/module0745.ONE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        //  2923: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Numbers.add:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2926: astore          var90
        //  2928: getstatic       com/cyc/cycjava/cycl/module0012.$silent_progressP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  2931: aload           var12
        //  2933: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2938: astore          var17_183
        //  2940: getstatic       com/cyc/cycjava/cycl/module0012.$silent_progressP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  2943: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  2946: aload           var12
        //  2948: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  2953: aload           var90
        //  2955: aload_1         
        //  2956: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Numbers.subtract:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2959: aload_2         
        //  2960: aload_1         
        //  2961: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Numbers.subtract:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2964: invokestatic    com/cyc/cycjava/cycl/module0048.f_1X:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2967: invokestatic    com/cyc/cycjava/cycl/module0012.note_percent_progress:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  2970: pop            
        //  2971: getstatic       com/cyc/cycjava/cycl/module0012.$silent_progressP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  2974: aload           var17_183
        //  2976: aload           var12
        //  2978: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  2983: goto            3003
        //  2986: astore          96
        //  2988: getstatic       com/cyc/cycjava/cycl/module0012.$silent_progressP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  2991: aload           var17_183
        //  2993: aload           var12
        //  2995: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  3000: aload           96
        //  3002: athrow         
        //  3003: aload           var90
        //  3005: aload_1         
        //  3006: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject.numL:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Z
        //  3011: ifne            4170
        //  3014: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  3017: aload           var47
        //  3019: aload           var73
        //  3021: invokestatic    com/cyc/cycjava/cycl/module0077.f5320:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  3024: if_acmpne       4170
        //  3027: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  3030: aload           var47
        //  3032: invokestatic    com/cyc/cycjava/cycl/module0745.f46253:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  3035: if_acmpne       4170
        //  3038: getstatic       com/cyc/cycjava/cycl/module0745.$g5943$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  3041: aload           var12
        //  3043: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.getDynamicValue:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  3048: astore          var145
        //  3050: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  3053: astore          var146
        //  3055: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  3058: astore          var147
        //  3060: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  3063: astore          var148
        //  3065: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  3068: astore          var149
        //  3070: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  3073: astore          var150
        //  3075: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  3078: astore          var151
        //  3080: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Time.get_internal_real_time:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  3083: astore          var152
        //  3085: invokestatic    com/cyc/cycjava/cycl/module0003.f61:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  3088: astore          var153
        //  3090: aload           var12
        //  3092: getfield        com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.throwStack:Ljava/util/Deque;
        //  3095: aload           var153
        //  3097: invokeinterface java/util/Deque.push:(Ljava/lang/Object;)V
        //  3102: getstatic       com/cyc/cycjava/cycl/module0003.$g4$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  3105: aload           var12
        //  3107: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  3112: astore          var17_184
        //  3114: getstatic       com/cyc/cycjava/cycl/module0003.$g4$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  3117: getstatic       com/cyc/cycjava/cycl/module0745.T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        //  3120: aload           var12
        //  3122: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  3127: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  3130: astore          var155
        //  3132: getstatic       com/cyc/cycjava/cycl/module0003.$g5$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  3135: aload           var12
        //  3137: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  3142: astore          var17_185
        //  3144: getstatic       com/cyc/cycjava/cycl/module0003.$g5$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  3147: getstatic       com/cyc/cycjava/cycl/module0745.ONE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        //  3150: getstatic       com/cyc/cycjava/cycl/module0003.$g5$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  3153: aload           var12
        //  3155: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.getDynamicValue:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  3160: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Numbers.add:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  3163: aload           var12
        //  3165: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  3170: aload           var145
        //  3172: aload           var153
        //  3174: invokestatic    com/cyc/cycjava/cycl/module0003.f62:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  3177: astore          var155
        //  3179: aload           var12
        //  3181: invokevirtual   com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.resetMultipleValues:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  3184: pop            
        //  3185: aload           var47
        //  3187: aload           var23
        //  3189: aload           var24
        //  3191: invokestatic    com/cyc/cycjava/cycl/module0745.f46254:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  3194: astore          var186_187
        //  3196: aload           var12
        //  3198: invokevirtual   com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.secondMultipleValue:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  3201: astore          var188_189
        //  3203: aload           var12
        //  3205: invokevirtual   com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.thirdMultipleValue:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  3208: astore          var190_191
        //  3210: aload           var12
        //  3212: invokevirtual   com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.fourthMultipleValue:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  3215: astore          var192_193
        //  3217: aload           var12
        //  3219: invokevirtual   com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.resetMultipleValues:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  3222: pop            
        //  3223: aload           var186_187
        //  3225: astore          var148
        //  3227: aload           var188_189
        //  3229: astore          var149
        //  3231: aload           var190_191
        //  3233: astore          var151
        //  3235: aload           var192_193
        //  3237: astore          var150
        //  3239: getstatic       com/cyc/cycjava/cycl/module0003.$g5$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  3242: aload           var17_185
        //  3244: aload           var12
        //  3246: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  3251: goto            3271
        //  3254: astore          97
        //  3256: getstatic       com/cyc/cycjava/cycl/module0003.$g5$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  3259: aload           var17_185
        //  3261: aload           var12
        //  3263: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  3268: aload           97
        //  3270: athrow         
        //  3271: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  3274: aload           var12
        //  3276: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  3281: astore          var17_194
        //  3283: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  3286: getstatic       com/cyc/cycjava/cycl/module0745.T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        //  3289: aload           var12
        //  3291: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  3296: aload           var155
        //  3298: invokestatic    com/cyc/cycjava/cycl/module0003.f64:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  3301: pop            
        //  3302: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  3305: aload           var17_194
        //  3307: aload           var12
        //  3309: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  3314: goto            3334
        //  3317: astore          98
        //  3319: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  3322: aload           var17_194
        //  3324: aload           var12
        //  3326: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  3331: aload           98
        //  3333: athrow         
        //  3334: goto            3405
        //  3337: astore          99
        //  3339: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  3342: aload           var12
        //  3344: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  3349: astore          var17_194
        //  3351: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  3354: getstatic       com/cyc/cycjava/cycl/module0745.T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        //  3357: aload           var12
        //  3359: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  3364: aload           var155
        //  3366: invokestatic    com/cyc/cycjava/cycl/module0003.f64:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  3369: pop            
        //  3370: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  3373: aload           var17_194
        //  3375: aload           var12
        //  3377: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  3382: goto            3402
        //  3385: astore          101
        //  3387: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  3390: aload           var17_194
        //  3392: aload           var12
        //  3394: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  3399: aload           101
        //  3401: athrow         
        //  3402: aload           99
        //  3404: athrow         
        //  3405: getstatic       com/cyc/cycjava/cycl/module0003.$g4$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  3408: aload           var17_184
        //  3410: aload           var12
        //  3412: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  3417: goto            3437
        //  3420: astore          102
        //  3422: getstatic       com/cyc/cycjava/cycl/module0003.$g4$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  3425: aload           var17_184
        //  3427: aload           var12
        //  3429: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  3434: aload           102
        //  3436: athrow         
        //  3437: aload           var12
        //  3439: getfield        com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.throwStack:Ljava/util/Deque;
        //  3442: invokeinterface java/util/Deque.pop:()Ljava/lang/Object;
        //  3447: pop            
        //  3448: goto            3492
        //  3451: astore          var79
        //  3453: aload           var79
        //  3455: aload           var153
        //  3457: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Errors.handleThrowable:(Ljava/lang/Throwable;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  3460: astore          var146
        //  3462: aload           var12
        //  3464: getfield        com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.throwStack:Ljava/util/Deque;
        //  3467: invokeinterface java/util/Deque.pop:()Ljava/lang/Object;
        //  3472: pop            
        //  3473: goto            3492
        //  3476: astore          103
        //  3478: aload           var12
        //  3480: getfield        com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.throwStack:Ljava/util/Deque;
        //  3483: invokeinterface java/util/Deque.pop:()Ljava/lang/Object;
        //  3488: pop            
        //  3489: aload           103
        //  3491: athrow         
        //  3492: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Time.get_internal_real_time:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  3495: aload           var152
        //  3497: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Numbers.subtract:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  3500: getstatic       com/cyc/tool/subl/jrtl/translatedCode/sublisp/time_high.$internal_time_units_per_second$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  3503: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.getGlobalValue:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  3508: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Numbers.divide:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  3511: astore          var147
        //  3513: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  3516: aload           var146
        //  3518: if_acmpeq       3987
        //  3521: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  3524: getstatic       com/cyc/cycjava/cycl/module0745.$g5942$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  3527: aload           var12
        //  3529: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.getDynamicValue:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  3534: if_acmpeq       3987
        //  3537: getstatic       com/cyc/cycjava/cycl/module0745.$ic96$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        //  3540: aload           var145
        //  3542: getstatic       com/cyc/cycjava/cycl/module0745.UNPROVIDED:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  3545: invokestatic    com/cyc/cycjava/cycl/module0051.f3574:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  3548: aload           var47
        //  3550: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Errors.warn:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  3553: pop            
        //  3554: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Time.get_internal_real_time:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  3557: astore          var152
        //  3559: invokestatic    com/cyc/cycjava/cycl/module0003.f61:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  3562: astore          var153
        //  3564: aload           var12
        //  3566: getfield        com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.throwStack:Ljava/util/Deque;
        //  3569: aload           var153
        //  3571: invokeinterface java/util/Deque.push:(Ljava/lang/Object;)V
        //  3576: getstatic       com/cyc/cycjava/cycl/module0003.$g4$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  3579: aload           var12
        //  3581: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  3586: astore          var17_195
        //  3588: getstatic       com/cyc/cycjava/cycl/module0003.$g4$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  3591: getstatic       com/cyc/cycjava/cycl/module0745.T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        //  3594: aload           var12
        //  3596: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  3601: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  3604: astore          var155
        //  3606: getstatic       com/cyc/cycjava/cycl/module0003.$g5$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  3609: aload           var12
        //  3611: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  3616: astore          var17_196
        //  3618: getstatic       com/cyc/cycjava/cycl/module0003.$g5$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  3621: getstatic       com/cyc/cycjava/cycl/module0745.ONE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        //  3624: getstatic       com/cyc/cycjava/cycl/module0003.$g5$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  3627: aload           var12
        //  3629: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.getDynamicValue:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  3634: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Numbers.add:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  3637: aload           var12
        //  3639: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  3644: aload           var145
        //  3646: aload           var153
        //  3648: invokestatic    com/cyc/cycjava/cycl/module0003.f62:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  3651: astore          var155
        //  3653: aload           var12
        //  3655: invokevirtual   com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.resetMultipleValues:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  3658: pop            
        //  3659: aload           var47
        //  3661: aload           var23
        //  3663: aload           var24
        //  3665: invokestatic    com/cyc/cycjava/cycl/module0745.f46254:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  3668: astore          var197_198
        //  3670: aload           var12
        //  3672: invokevirtual   com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.secondMultipleValue:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  3675: astore          var199_200
        //  3677: aload           var12
        //  3679: invokevirtual   com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.thirdMultipleValue:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  3682: astore          var201_202
        //  3684: aload           var12
        //  3686: invokevirtual   com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.fourthMultipleValue:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  3689: astore          var203_204
        //  3691: aload           var12
        //  3693: invokevirtual   com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.resetMultipleValues:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  3696: pop            
        //  3697: aload           var197_198
        //  3699: astore          var148
        //  3701: aload           var199_200
        //  3703: astore          var149
        //  3705: aload           var201_202
        //  3707: astore          var151
        //  3709: aload           var203_204
        //  3711: astore          var150
        //  3713: getstatic       com/cyc/cycjava/cycl/module0003.$g5$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  3716: aload           var17_196
        //  3718: aload           var12
        //  3720: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  3725: goto            3745
        //  3728: astore          104
        //  3730: getstatic       com/cyc/cycjava/cycl/module0003.$g5$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  3733: aload           var17_196
        //  3735: aload           var12
        //  3737: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  3742: aload           104
        //  3744: athrow         
        //  3745: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  3748: aload           var12
        //  3750: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  3755: astore          var17_205
        //  3757: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  3760: getstatic       com/cyc/cycjava/cycl/module0745.T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        //  3763: aload           var12
        //  3765: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  3770: aload           var155
        //  3772: invokestatic    com/cyc/cycjava/cycl/module0003.f64:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  3775: pop            
        //  3776: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  3779: aload           var17_205
        //  3781: aload           var12
        //  3783: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  3788: goto            3808
        //  3791: astore          105
        //  3793: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  3796: aload           var17_205
        //  3798: aload           var12
        //  3800: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  3805: aload           105
        //  3807: athrow         
        //  3808: goto            3879
        //  3811: astore          106
        //  3813: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  3816: aload           var12
        //  3818: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  3823: astore          var17_205
        //  3825: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  3828: getstatic       com/cyc/cycjava/cycl/module0745.T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        //  3831: aload           var12
        //  3833: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  3838: aload           var155
        //  3840: invokestatic    com/cyc/cycjava/cycl/module0003.f64:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  3843: pop            
        //  3844: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  3847: aload           var17_205
        //  3849: aload           var12
        //  3851: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  3856: goto            3876
        //  3859: astore          108
        //  3861: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  3864: aload           var17_205
        //  3866: aload           var12
        //  3868: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  3873: aload           108
        //  3875: athrow         
        //  3876: aload           106
        //  3878: athrow         
        //  3879: getstatic       com/cyc/cycjava/cycl/module0003.$g4$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  3882: aload           var17_195
        //  3884: aload           var12
        //  3886: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  3891: goto            3911
        //  3894: astore          109
        //  3896: getstatic       com/cyc/cycjava/cycl/module0003.$g4$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  3899: aload           var17_195
        //  3901: aload           var12
        //  3903: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  3908: aload           109
        //  3910: athrow         
        //  3911: aload           var12
        //  3913: getfield        com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.throwStack:Ljava/util/Deque;
        //  3916: invokeinterface java/util/Deque.pop:()Ljava/lang/Object;
        //  3921: pop            
        //  3922: goto            3966
        //  3925: astore          var79
        //  3927: aload           var79
        //  3929: aload           var153
        //  3931: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Errors.handleThrowable:(Ljava/lang/Throwable;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  3934: astore          var146
        //  3936: aload           var12
        //  3938: getfield        com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.throwStack:Ljava/util/Deque;
        //  3941: invokeinterface java/util/Deque.pop:()Ljava/lang/Object;
        //  3946: pop            
        //  3947: goto            3966
        //  3950: astore          110
        //  3952: aload           var12
        //  3954: getfield        com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.throwStack:Ljava/util/Deque;
        //  3957: invokeinterface java/util/Deque.pop:()Ljava/lang/Object;
        //  3962: pop            
        //  3963: aload           110
        //  3965: athrow         
        //  3966: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Time.get_internal_real_time:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  3969: aload           var152
        //  3971: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Numbers.subtract:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  3974: getstatic       com/cyc/tool/subl/jrtl/translatedCode/sublisp/time_high.$internal_time_units_per_second$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  3977: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.getGlobalValue:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  3982: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Numbers.divide:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  3985: astore          var147
        //  3987: aload           var147
        //  3989: aload           var92
        //  3991: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.cons:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLCons;
        //  3994: astore          var92
        //  3996: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  3999: aload           var146
        //  4001: if_acmpeq       4058
        //  4004: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  4007: getstatic       com/cyc/cycjava/cycl/module0745.$g5941$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  4010: aload           var12
        //  4012: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.getDynamicValue:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  4017: if_acmpeq       4026
        //  4020: getstatic       com/cyc/cycjava/cycl/module0745.$ic97$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  4023: goto            4029
        //  4026: getstatic       com/cyc/cycjava/cycl/module0745.$ic98$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  4029: getstatic       com/cyc/cycjava/cycl/module0745.$ic99$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        //  4032: aload           var145
        //  4034: getstatic       com/cyc/cycjava/cycl/module0745.UNPROVIDED:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  4037: invokestatic    com/cyc/cycjava/cycl/module0051.f3574:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  4040: aload           var47
        //  4042: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Functions.funcall:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  4045: pop            
        //  4046: aload           var47
        //  4048: aload           var93
        //  4050: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.cons:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLCons;
        //  4053: astore          var93
        //  4055: goto            4170
        //  4058: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  4061: aload           var148
        //  4063: invokestatic    com/cyc/cycjava/cycl/module0209.f13550:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  4066: if_acmpne       4090
        //  4069: getstatic       com/cyc/cycjava/cycl/module0745.$ic100$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        //  4072: aload           var47
        //  4074: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Errors.warn:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  4077: pop            
        //  4078: aload           var47
        //  4080: aload           var93
        //  4082: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.cons:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLCons;
        //  4085: astore          var93
        //  4087: goto            4170
        //  4090: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  4093: aload           var148
        //  4095: getstatic       com/cyc/cycjava/cycl/module0745.$ic93$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        //  4098: invokestatic    com/cyc/cycjava/cycl/module0209.f13557:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  4101: if_acmpeq       4125
        //  4104: getstatic       com/cyc/cycjava/cycl/module0745.$ic101$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        //  4107: aload           var47
        //  4109: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Errors.warn:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  4112: pop            
        //  4113: aload           var47
        //  4115: aload           var93
        //  4117: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.cons:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLCons;
        //  4120: astore          var93
        //  4122: goto            4170
        //  4125: aload           var148
        //  4127: aload           var149
        //  4129: aload           var151
        //  4131: aload           var150
        //  4133: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        //  4136: astore          var48
        //  4138: aload           var47
        //  4140: aload           var85
        //  4142: invokestatic    com/cyc/cycjava/cycl/module0021.f1040:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  4145: pop            
        //  4146: aload           var48
        //  4148: aload           var85
        //  4150: invokestatic    com/cyc/cycjava/cycl/module0021.f1040:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  4153: pop            
        //  4154: aload           var47
        //  4156: aload           var88
        //  4158: invokestatic    com/cyc/cycjava/cycl/module0021.f1038:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  4161: pop            
        //  4162: aload           var48
        //  4164: aload           var88
        //  4166: invokestatic    com/cyc/cycjava/cycl/module0021.f1038:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  4169: pop            
        //  4170: aload           var90
        //  4172: aload           var91
        //  4174: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Numbers.mod:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  4177: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject.isZero:()Z
        //  4182: ifeq            4277
        //  4185: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  4188: aload           var92
        //  4190: invokestatic    com/cyc/cycjava/cycl/module0035.f2013:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  4193: if_acmpeq       4277
        //  4196: getstatic       com/cyc/cycjava/cycl/module0745.UNPROVIDED:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  4199: invokestatic    com/cyc/cycjava/cycl/module0745.f46255:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  4202: pop            
        //  4203: aload           var90
        //  4205: aload           var91
        //  4207: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Numbers.integerDivide:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  4210: astore          var177
        //  4212: getstatic       com/cyc/cycjava/cycl/module0745.$g5949$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  4215: aload           var177
        //  4217: aload           var93
        //  4219: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Sequences.length:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  4222: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        //  4225: getstatic       com/cyc/cycjava/cycl/module0745.$g5949$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  4228: aload           var12
        //  4230: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.getDynamicValue:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  4235: invokestatic    com/cyc/cycjava/cycl/module0035.f2083:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  4238: aload           var12
        //  4240: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.setDynamicValue:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  4245: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  4248: astore          var93
        //  4250: aload           var90
        //  4252: aload           var91
        //  4254: aload           var94
        //  4256: aload           var95
        //  4258: aload           var92
        //  4260: aload_0         
        //  4261: aload           var99
        //  4263: invokestatic    com/cyc/cycjava/cycl/module0745.f46256:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  4266: pop            
        //  4267: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Time.get_universal_time:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  4270: astore          var94
        //  4272: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  4275: astore          var92
        //  4277: aload           var90
        //  4279: aload_2         
        //  4280: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject.numGE:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Z
        //  4285: ifeq            4293
        //  4288: getstatic       com/cyc/cycjava/cycl/module0745.T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        //  4291: astore          var49
        //  4293: aload           var143
        //  4295: getstatic       com/cyc/cycjava/cycl/module0745.ONE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        //  4298: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Numbers.add:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  4301: astore          var143
        //  4303: goto            2846
        //  4306: aload           var129
        //  4308: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject.rest:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  4313: astore          var129
        //  4315: goto            1031
        //  4318: invokestatic    com/cyc/cycjava/cycl/module0012.f479:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  4321: pop            
        //  4322: getstatic       com/cyc/cycjava/cycl/module0012.$g78$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  4325: aload           var32_128
        //  4327: aload           var12
        //  4329: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  4334: getstatic       com/cyc/cycjava/cycl/module0012.$g77$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  4337: aload           var26_127
        //  4339: aload           var12
        //  4341: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  4346: getstatic       com/cyc/cycjava/cycl/module0012.$g76$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  4349: aload           var25_126
        //  4351: aload           var12
        //  4353: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  4358: getstatic       com/cyc/cycjava/cycl/module0012.$g75$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  4361: aload           var17_125
        //  4363: aload           var12
        //  4365: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  4370: goto            4426
        //  4373: astore          111
        //  4375: getstatic       com/cyc/cycjava/cycl/module0012.$g78$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  4378: aload           var32_128
        //  4380: aload           var12
        //  4382: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  4387: getstatic       com/cyc/cycjava/cycl/module0012.$g77$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  4390: aload           var26_127
        //  4392: aload           var12
        //  4394: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  4399: getstatic       com/cyc/cycjava/cycl/module0012.$g76$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  4402: aload           var25_126
        //  4404: aload           var12
        //  4406: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  4411: getstatic       com/cyc/cycjava/cycl/module0012.$g75$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  4414: aload           var17_125
        //  4416: aload           var12
        //  4418: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  4423: aload           111
        //  4425: athrow         
        //  4426: getstatic       com/cyc/cycjava/cycl/module0012.$silent_progressP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  4429: aload           var17_121
        //  4431: aload           var12
        //  4433: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  4438: goto            4458
        //  4441: astore          112
        //  4443: getstatic       com/cyc/cycjava/cycl/module0012.$silent_progressP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  4446: aload           var17_121
        //  4448: aload           var12
        //  4450: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  4455: aload           112
        //  4457: athrow         
        //  4458: invokestatic    com/cyc/cycjava/cycl/module0012.f479:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  4461: pop            
        //  4462: getstatic       com/cyc/cycjava/cycl/module0012.$g78$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  4465: aload           var32_120
        //  4467: aload           var12
        //  4469: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  4474: getstatic       com/cyc/cycjava/cycl/module0012.$g77$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  4477: aload           var26_119
        //  4479: aload           var12
        //  4481: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  4486: getstatic       com/cyc/cycjava/cycl/module0012.$g76$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  4489: aload           var25_118
        //  4491: aload           var12
        //  4493: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  4498: getstatic       com/cyc/cycjava/cycl/module0012.$g75$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  4501: aload           var17_117
        //  4503: aload           var12
        //  4505: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  4510: goto            4566
        //  4513: astore          113
        //  4515: getstatic       com/cyc/cycjava/cycl/module0012.$g78$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  4518: aload           var32_120
        //  4520: aload           var12
        //  4522: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  4527: getstatic       com/cyc/cycjava/cycl/module0012.$g77$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  4530: aload           var26_119
        //  4532: aload           var12
        //  4534: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  4539: getstatic       com/cyc/cycjava/cycl/module0012.$g76$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  4542: aload           var25_118
        //  4544: aload           var12
        //  4546: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  4551: getstatic       com/cyc/cycjava/cycl/module0012.$g75$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  4554: aload           var17_117
        //  4556: aload           var12
        //  4558: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  4563: aload           113
        //  4565: athrow         
        //  4566: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  4569: aload           var49
        //  4571: if_acmpeq       4588
        //  4574: aload_0         
        //  4575: getstatic       com/cyc/cycjava/cycl/module0745.$ic81$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        //  4578: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Sequences.cconcatenate:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  4581: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  4584: invokestatic    com/cyc/cycjava/cycl/module0075.f5237:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  4587: pop            
        //  4588: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  4591: aload           var112
        //  4593: if_acmpeq       4613
        //  4596: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  4599: aload           var114
        //  4601: if_acmpne       4613
        //  4604: aload           var112
        //  4606: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  4609: invokestatic    com/cyc/cycjava/cycl/module0034.f1873:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  4612: pop            
        //  4613: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  4616: aload           var17_116
        //  4618: aload           var12
        //  4620: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  4625: goto            4645
        //  4628: astore          114
        //  4630: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  4633: aload           var17_116
        //  4635: aload           var12
        //  4637: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  4642: aload           114
        //  4644: athrow         
        //  4645: goto            8596
        //  4648: astore          115
        //  4650: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  4653: aload           var12
        //  4655: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  4660: astore          var17_116
        //  4662: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  4665: getstatic       com/cyc/cycjava/cycl/module0745.T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        //  4668: aload           var12
        //  4670: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  4675: invokestatic    com/cyc/cycjava/cycl/module0176.f11128:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  4678: pop            
        //  4679: invokestatic    com/cyc/cycjava/cycl/module0176.f11126:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  4682: pop            
        //  4683: getstatic       com/cyc/cycjava/cycl/module0012.$g75$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  4686: aload           var12
        //  4688: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  4693: astore          var17_117
        //  4695: getstatic       com/cyc/cycjava/cycl/module0012.$g76$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  4698: aload           var12
        //  4700: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  4705: astore          var25_118
        //  4707: getstatic       com/cyc/cycjava/cycl/module0012.$g77$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  4710: aload           var12
        //  4712: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  4717: astore          var26_119
        //  4719: getstatic       com/cyc/cycjava/cycl/module0012.$g78$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  4722: aload           var12
        //  4724: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  4729: astore          var32_120
        //  4731: getstatic       com/cyc/cycjava/cycl/module0012.$g75$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  4734: getstatic       com/cyc/cycjava/cycl/module0745.ZERO_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        //  4737: aload           var12
        //  4739: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  4744: getstatic       com/cyc/cycjava/cycl/module0012.$g76$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  4747: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  4750: aload           var12
        //  4752: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  4757: getstatic       com/cyc/cycjava/cycl/module0012.$g77$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  4760: getstatic       com/cyc/cycjava/cycl/module0745.T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        //  4763: aload           var12
        //  4765: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  4770: getstatic       com/cyc/cycjava/cycl/module0012.$g78$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  4773: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Time.get_universal_time:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  4776: aload           var12
        //  4778: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  4783: getstatic       com/cyc/cycjava/cycl/module0745.$ic90$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        //  4786: iconst_4       
        //  4787: anewarray       Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  4790: dup            
        //  4791: iconst_0       
        //  4792: aload_1         
        //  4793: invokestatic    com/cyc/cycjava/cycl/module0006.f205:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  4796: aastore        
        //  4797: dup            
        //  4798: iconst_1       
        //  4799: getstatic       com/cyc/cycjava/cycl/module0745.$ic91$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        //  4802: aastore        
        //  4803: dup            
        //  4804: iconst_2       
        //  4805: aload_2         
        //  4806: invokestatic    com/cyc/cycjava/cycl/module0006.f205:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  4809: aastore        
        //  4810: dup            
        //  4811: iconst_3       
        //  4812: getstatic       com/cyc/cycjava/cycl/module0745.$ic92$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        //  4815: aastore        
        //  4816: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Sequences.cconcatenate:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;[Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  4819: invokestatic    com/cyc/cycjava/cycl/module0012.f478:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  4822: pop            
        //  4823: getstatic       com/cyc/cycjava/cycl/module0012.$silent_progressP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  4826: aload           var12
        //  4828: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  4833: astore          var17_121
        //  4835: getstatic       com/cyc/cycjava/cycl/module0012.$silent_progressP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  4838: getstatic       com/cyc/cycjava/cycl/module0745.T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        //  4841: aload           var12
        //  4843: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  4848: getstatic       com/cyc/cycjava/cycl/module0745.$ic93$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        //  4851: astore          var122
        //  4853: invokestatic    com/cyc/cycjava/cycl/module0173.f10962:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  4856: astore          var123
        //  4858: getstatic       com/cyc/cycjava/cycl/module0745.ZERO_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        //  4861: astore          var124
        //  4863: getstatic       com/cyc/cycjava/cycl/module0012.$g75$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  4866: aload           var12
        //  4868: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  4873: astore          var17_125
        //  4875: getstatic       com/cyc/cycjava/cycl/module0012.$g76$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  4878: aload           var12
        //  4880: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  4885: astore          var25_126
        //  4887: getstatic       com/cyc/cycjava/cycl/module0012.$g77$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  4890: aload           var12
        //  4892: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  4897: astore          var26_127
        //  4899: getstatic       com/cyc/cycjava/cycl/module0012.$g78$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  4902: aload           var12
        //  4904: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  4909: astore          var32_128
        //  4911: getstatic       com/cyc/cycjava/cycl/module0012.$g75$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  4914: getstatic       com/cyc/cycjava/cycl/module0745.ZERO_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        //  4917: aload           var12
        //  4919: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  4924: getstatic       com/cyc/cycjava/cycl/module0012.$g76$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  4927: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  4930: aload           var12
        //  4932: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  4937: getstatic       com/cyc/cycjava/cycl/module0012.$g77$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  4940: getstatic       com/cyc/cycjava/cycl/module0745.T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        //  4943: aload           var12
        //  4945: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  4950: getstatic       com/cyc/cycjava/cycl/module0012.$g78$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  4953: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Time.get_universal_time:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  4956: aload           var12
        //  4958: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  4963: aload           var122
        //  4965: invokestatic    com/cyc/cycjava/cycl/module0012.f478:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  4968: pop            
        //  4969: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  4972: astore          var129
        //  4974: invokestatic    com/cyc/cycjava/cycl/module0173.f10961:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  4977: astore          var129
        //  4979: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  4982: aload           var49
        //  4984: if_acmpne       8266
        //  4987: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  4990: aload           var129
        //  4992: if_acmpeq       8266
        //  4995: aload           var129
        //  4997: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject.first:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5002: astore          var130
        //  5004: aload           var130
        //  5006: astore          var131
        //  5008: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  5011: aload           var131
        //  5013: getstatic       com/cyc/cycjava/cycl/module0745.$ic94$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  5016: invokestatic    com/cyc/cycjava/cycl/module0065.f4772:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5019: if_acmpne       8254
        //  5022: aload           var131
        //  5024: astore          var132_133
        //  5026: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  5029: aload           var132_133
        //  5031: getstatic       com/cyc/cycjava/cycl/module0745.$ic94$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  5034: invokestatic    com/cyc/cycjava/cycl/module0065.f4775:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5037: if_acmpne       6723
        //  5040: aload           var132_133
        //  5042: invokestatic    com/cyc/cycjava/cycl/module0065.f4740:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5045: astore          var134
        //  5047: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  5050: astore          var135
        //  5052: aload           var134
        //  5054: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Sequences.length:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5057: astore          var136
        //  5059: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  5062: aload           var135
        //  5064: if_acmpeq       5087
        //  5067: aload           var136
        //  5069: getstatic       com/cyc/cycjava/cycl/module0745.ONE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        //  5072: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Numbers.subtract:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5075: getstatic       com/cyc/cycjava/cycl/module0745.MINUS_ONE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        //  5078: getstatic       com/cyc/cycjava/cycl/module0745.MINUS_ONE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        //  5081: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        //  5084: goto            5098
        //  5087: getstatic       com/cyc/cycjava/cycl/module0745.ZERO_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        //  5090: aload           var136
        //  5092: getstatic       com/cyc/cycjava/cycl/module0745.ONE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        //  5095: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        //  5098: astore          var137
        //  5100: aload           var137
        //  5102: astore          var138
        //  5104: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  5107: astore          var139
        //  5109: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  5112: astore          var140
        //  5114: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  5117: astore          var141
        //  5119: aload           var138
        //  5121: aload           var137
        //  5123: getstatic       com/cyc/cycjava/cycl/module0745.$ic95$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        //  5126: invokestatic    com/cyc/tool/subl/jrtl/translatedCode/sublisp/cdestructuring_bind.destructuring_bind_must_consp:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5129: pop            
        //  5130: aload           var138
        //  5132: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject.first:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5137: astore          var139
        //  5139: aload           var138
        //  5141: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject.rest:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5146: astore          var138
        //  5148: aload           var138
        //  5150: aload           var137
        //  5152: getstatic       com/cyc/cycjava/cycl/module0745.$ic95$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        //  5155: invokestatic    com/cyc/tool/subl/jrtl/translatedCode/sublisp/cdestructuring_bind.destructuring_bind_must_consp:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5158: pop            
        //  5159: aload           var138
        //  5161: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject.first:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5166: astore          var140
        //  5168: aload           var138
        //  5170: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject.rest:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5175: astore          var138
        //  5177: aload           var138
        //  5179: aload           var137
        //  5181: getstatic       com/cyc/cycjava/cycl/module0745.$ic95$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        //  5184: invokestatic    com/cyc/tool/subl/jrtl/translatedCode/sublisp/cdestructuring_bind.destructuring_bind_must_consp:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5187: pop            
        //  5188: aload           var138
        //  5190: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject.first:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5195: astore          var141
        //  5197: aload           var138
        //  5199: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject.rest:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5204: astore          var138
        //  5206: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  5209: aload           var138
        //  5211: if_acmpne       6714
        //  5214: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  5217: aload           var49
        //  5219: if_acmpne       6723
        //  5222: aload           var140
        //  5224: astore          var142
        //  5226: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  5229: astore          var143
        //  5231: aload           var139
        //  5233: astore          var143
        //  5235: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  5238: aload           var49
        //  5240: if_acmpne       6711
        //  5243: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  5246: aload           var143
        //  5248: aload           var141
        //  5250: aload           var142
        //  5252: invokestatic    com/cyc/cycjava/cycl/module0005.f124:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5255: if_acmpne       6711
        //  5258: aload           var134
        //  5260: aload           var143
        //  5262: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Vectors.aref:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5265: astore          var47
        //  5267: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  5270: aload           var47
        //  5272: invokestatic    com/cyc/cycjava/cycl/module0065.f4749:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5275: if_acmpeq       5290
        //  5278: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  5281: getstatic       com/cyc/cycjava/cycl/module0745.$ic94$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  5284: invokestatic    com/cyc/cycjava/cycl/module0065.f4773:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5287: if_acmpne       6699
        //  5290: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  5293: aload           var47
        //  5295: invokestatic    com/cyc/cycjava/cycl/module0065.f4749:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5298: if_acmpeq       5306
        //  5301: getstatic       com/cyc/cycjava/cycl/module0745.$ic94$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  5304: astore          var47
        //  5306: aload           var124
        //  5308: getstatic       com/cyc/cycjava/cycl/module0745.ONE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        //  5311: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Numbers.add:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5314: astore          var124
        //  5316: aload           var124
        //  5318: aload           var123
        //  5320: invokestatic    com/cyc/cycjava/cycl/module0012.note_percent_progress:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5323: pop            
        //  5324: aload           var90
        //  5326: getstatic       com/cyc/cycjava/cycl/module0745.ONE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        //  5329: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Numbers.add:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5332: astore          var90
        //  5334: getstatic       com/cyc/cycjava/cycl/module0012.$silent_progressP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  5337: aload           var12
        //  5339: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5344: astore          var17_144
        //  5346: getstatic       com/cyc/cycjava/cycl/module0012.$silent_progressP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  5349: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  5352: aload           var12
        //  5354: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  5359: aload           var90
        //  5361: aload_1         
        //  5362: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Numbers.subtract:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5365: aload_2         
        //  5366: aload_1         
        //  5367: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Numbers.subtract:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5370: invokestatic    com/cyc/cycjava/cycl/module0048.f_1X:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5373: invokestatic    com/cyc/cycjava/cycl/module0012.note_percent_progress:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5376: pop            
        //  5377: getstatic       com/cyc/cycjava/cycl/module0012.$silent_progressP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  5380: aload           var17_144
        //  5382: aload           var12
        //  5384: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  5389: goto            5409
        //  5392: astore          145
        //  5394: getstatic       com/cyc/cycjava/cycl/module0012.$silent_progressP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  5397: aload           var17_144
        //  5399: aload           var12
        //  5401: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  5406: aload           145
        //  5408: athrow         
        //  5409: aload           var90
        //  5411: aload_1         
        //  5412: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject.numL:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Z
        //  5417: ifne            6576
        //  5420: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  5423: aload           var47
        //  5425: aload           var73
        //  5427: invokestatic    com/cyc/cycjava/cycl/module0077.f5320:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5430: if_acmpne       6576
        //  5433: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  5436: aload           var47
        //  5438: invokestatic    com/cyc/cycjava/cycl/module0745.f46253:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5441: if_acmpne       6576
        //  5444: getstatic       com/cyc/cycjava/cycl/module0745.$g5943$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  5447: aload           var12
        //  5449: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.getDynamicValue:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5454: astore          var145
        //  5456: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  5459: astore          var146
        //  5461: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  5464: astore          var147
        //  5466: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  5469: astore          var148
        //  5471: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  5474: astore          var149
        //  5476: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  5479: astore          var150
        //  5481: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  5484: astore          var151
        //  5486: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Time.get_internal_real_time:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5489: astore          var152
        //  5491: invokestatic    com/cyc/cycjava/cycl/module0003.f61:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5494: astore          var153
        //  5496: aload           var12
        //  5498: getfield        com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.throwStack:Ljava/util/Deque;
        //  5501: aload           var153
        //  5503: invokeinterface java/util/Deque.push:(Ljava/lang/Object;)V
        //  5508: getstatic       com/cyc/cycjava/cycl/module0003.$g4$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  5511: aload           var12
        //  5513: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5518: astore          var17_154
        //  5520: getstatic       com/cyc/cycjava/cycl/module0003.$g4$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  5523: getstatic       com/cyc/cycjava/cycl/module0745.T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        //  5526: aload           var12
        //  5528: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  5533: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  5536: astore          var155
        //  5538: getstatic       com/cyc/cycjava/cycl/module0003.$g5$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  5541: aload           var12
        //  5543: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5548: astore          var17_156
        //  5550: getstatic       com/cyc/cycjava/cycl/module0003.$g5$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  5553: getstatic       com/cyc/cycjava/cycl/module0745.ONE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        //  5556: getstatic       com/cyc/cycjava/cycl/module0003.$g5$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  5559: aload           var12
        //  5561: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.getDynamicValue:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5566: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Numbers.add:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5569: aload           var12
        //  5571: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  5576: aload           var145
        //  5578: aload           var153
        //  5580: invokestatic    com/cyc/cycjava/cycl/module0003.f62:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5583: astore          var155
        //  5585: aload           var12
        //  5587: invokevirtual   com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.resetMultipleValues:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5590: pop            
        //  5591: aload           var47
        //  5593: aload           var23
        //  5595: aload           var24
        //  5597: invokestatic    com/cyc/cycjava/cycl/module0745.f46254:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5600: astore          var157_158
        //  5602: aload           var12
        //  5604: invokevirtual   com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.secondMultipleValue:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5607: astore          var159_160
        //  5609: aload           var12
        //  5611: invokevirtual   com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.thirdMultipleValue:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5614: astore          var161_162
        //  5616: aload           var12
        //  5618: invokevirtual   com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.fourthMultipleValue:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5621: astore          var163_164
        //  5623: aload           var12
        //  5625: invokevirtual   com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.resetMultipleValues:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5628: pop            
        //  5629: aload           var157_158
        //  5631: astore          var148
        //  5633: aload           var159_160
        //  5635: astore          var149
        //  5637: aload           var161_162
        //  5639: astore          var151
        //  5641: aload           var163_164
        //  5643: astore          var150
        //  5645: getstatic       com/cyc/cycjava/cycl/module0003.$g5$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  5648: aload           var17_156
        //  5650: aload           var12
        //  5652: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  5657: goto            5677
        //  5660: astore          160
        //  5662: getstatic       com/cyc/cycjava/cycl/module0003.$g5$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  5665: aload           var17_156
        //  5667: aload           var12
        //  5669: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  5674: aload           160
        //  5676: athrow         
        //  5677: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  5680: aload           var12
        //  5682: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5687: astore          var17_165
        //  5689: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  5692: getstatic       com/cyc/cycjava/cycl/module0745.T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        //  5695: aload           var12
        //  5697: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  5702: aload           var155
        //  5704: invokestatic    com/cyc/cycjava/cycl/module0003.f64:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5707: pop            
        //  5708: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  5711: aload           var17_165
        //  5713: aload           var12
        //  5715: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  5720: goto            5740
        //  5723: astore          161
        //  5725: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  5728: aload           var17_165
        //  5730: aload           var12
        //  5732: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  5737: aload           161
        //  5739: athrow         
        //  5740: goto            5811
        //  5743: astore          162
        //  5745: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  5748: aload           var12
        //  5750: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5755: astore          var17_165
        //  5757: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  5760: getstatic       com/cyc/cycjava/cycl/module0745.T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        //  5763: aload           var12
        //  5765: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  5770: aload           var155
        //  5772: invokestatic    com/cyc/cycjava/cycl/module0003.f64:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5775: pop            
        //  5776: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  5779: aload           var17_165
        //  5781: aload           var12
        //  5783: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  5788: goto            5808
        //  5791: astore          164
        //  5793: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  5796: aload           var17_165
        //  5798: aload           var12
        //  5800: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  5805: aload           164
        //  5807: athrow         
        //  5808: aload           162
        //  5810: athrow         
        //  5811: getstatic       com/cyc/cycjava/cycl/module0003.$g4$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  5814: aload           var17_154
        //  5816: aload           var12
        //  5818: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  5823: goto            5843
        //  5826: astore          165
        //  5828: getstatic       com/cyc/cycjava/cycl/module0003.$g4$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  5831: aload           var17_154
        //  5833: aload           var12
        //  5835: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  5840: aload           165
        //  5842: athrow         
        //  5843: aload           var12
        //  5845: getfield        com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.throwStack:Ljava/util/Deque;
        //  5848: invokeinterface java/util/Deque.pop:()Ljava/lang/Object;
        //  5853: pop            
        //  5854: goto            5898
        //  5857: astore          var79
        //  5859: aload           var79
        //  5861: aload           var153
        //  5863: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Errors.handleThrowable:(Ljava/lang/Throwable;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5866: astore          var146
        //  5868: aload           var12
        //  5870: getfield        com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.throwStack:Ljava/util/Deque;
        //  5873: invokeinterface java/util/Deque.pop:()Ljava/lang/Object;
        //  5878: pop            
        //  5879: goto            5898
        //  5882: astore          166
        //  5884: aload           var12
        //  5886: getfield        com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.throwStack:Ljava/util/Deque;
        //  5889: invokeinterface java/util/Deque.pop:()Ljava/lang/Object;
        //  5894: pop            
        //  5895: aload           166
        //  5897: athrow         
        //  5898: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Time.get_internal_real_time:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5901: aload           var152
        //  5903: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Numbers.subtract:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5906: getstatic       com/cyc/tool/subl/jrtl/translatedCode/sublisp/time_high.$internal_time_units_per_second$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  5909: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.getGlobalValue:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5914: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Numbers.divide:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5917: astore          var147
        //  5919: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  5922: aload           var146
        //  5924: if_acmpeq       6393
        //  5927: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  5930: getstatic       com/cyc/cycjava/cycl/module0745.$g5942$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  5933: aload           var12
        //  5935: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.getDynamicValue:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5940: if_acmpeq       6393
        //  5943: getstatic       com/cyc/cycjava/cycl/module0745.$ic96$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        //  5946: aload           var145
        //  5948: getstatic       com/cyc/cycjava/cycl/module0745.UNPROVIDED:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  5951: invokestatic    com/cyc/cycjava/cycl/module0051.f3574:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5954: aload           var47
        //  5956: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Errors.warn:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5959: pop            
        //  5960: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Time.get_internal_real_time:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5963: astore          var152
        //  5965: invokestatic    com/cyc/cycjava/cycl/module0003.f61:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5968: astore          var153
        //  5970: aload           var12
        //  5972: getfield        com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.throwStack:Ljava/util/Deque;
        //  5975: aload           var153
        //  5977: invokeinterface java/util/Deque.push:(Ljava/lang/Object;)V
        //  5982: getstatic       com/cyc/cycjava/cycl/module0003.$g4$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  5985: aload           var12
        //  5987: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  5992: astore          var17_166
        //  5994: getstatic       com/cyc/cycjava/cycl/module0003.$g4$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  5997: getstatic       com/cyc/cycjava/cycl/module0745.T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        //  6000: aload           var12
        //  6002: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  6007: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  6010: astore          var155
        //  6012: getstatic       com/cyc/cycjava/cycl/module0003.$g5$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  6015: aload           var12
        //  6017: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6022: astore          var17_167
        //  6024: getstatic       com/cyc/cycjava/cycl/module0003.$g5$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  6027: getstatic       com/cyc/cycjava/cycl/module0745.ONE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        //  6030: getstatic       com/cyc/cycjava/cycl/module0003.$g5$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  6033: aload           var12
        //  6035: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.getDynamicValue:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6040: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Numbers.add:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6043: aload           var12
        //  6045: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  6050: aload           var145
        //  6052: aload           var153
        //  6054: invokestatic    com/cyc/cycjava/cycl/module0003.f62:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6057: astore          var155
        //  6059: aload           var12
        //  6061: invokevirtual   com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.resetMultipleValues:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6064: pop            
        //  6065: aload           var47
        //  6067: aload           var23
        //  6069: aload           var24
        //  6071: invokestatic    com/cyc/cycjava/cycl/module0745.f46254:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6074: astore          var168_169
        //  6076: aload           var12
        //  6078: invokevirtual   com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.secondMultipleValue:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6081: astore          var170_171
        //  6083: aload           var12
        //  6085: invokevirtual   com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.thirdMultipleValue:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6088: astore          var172_173
        //  6090: aload           var12
        //  6092: invokevirtual   com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.fourthMultipleValue:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6095: astore          var174_175
        //  6097: aload           var12
        //  6099: invokevirtual   com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.resetMultipleValues:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6102: pop            
        //  6103: aload           var168_169
        //  6105: astore          var148
        //  6107: aload           var170_171
        //  6109: astore          var149
        //  6111: aload           var172_173
        //  6113: astore          var151
        //  6115: aload           var174_175
        //  6117: astore          var150
        //  6119: getstatic       com/cyc/cycjava/cycl/module0003.$g5$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  6122: aload           var17_167
        //  6124: aload           var12
        //  6126: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  6131: goto            6151
        //  6134: astore          167
        //  6136: getstatic       com/cyc/cycjava/cycl/module0003.$g5$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  6139: aload           var17_167
        //  6141: aload           var12
        //  6143: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  6148: aload           167
        //  6150: athrow         
        //  6151: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  6154: aload           var12
        //  6156: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6161: astore          var17_176
        //  6163: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  6166: getstatic       com/cyc/cycjava/cycl/module0745.T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        //  6169: aload           var12
        //  6171: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  6176: aload           var155
        //  6178: invokestatic    com/cyc/cycjava/cycl/module0003.f64:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6181: pop            
        //  6182: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  6185: aload           var17_176
        //  6187: aload           var12
        //  6189: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  6194: goto            6214
        //  6197: astore          168
        //  6199: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  6202: aload           var17_176
        //  6204: aload           var12
        //  6206: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  6211: aload           168
        //  6213: athrow         
        //  6214: goto            6285
        //  6217: astore          169
        //  6219: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  6222: aload           var12
        //  6224: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6229: astore          var17_176
        //  6231: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  6234: getstatic       com/cyc/cycjava/cycl/module0745.T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        //  6237: aload           var12
        //  6239: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  6244: aload           var155
        //  6246: invokestatic    com/cyc/cycjava/cycl/module0003.f64:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6249: pop            
        //  6250: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  6253: aload           var17_176
        //  6255: aload           var12
        //  6257: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  6262: goto            6282
        //  6265: astore          171
        //  6267: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  6270: aload           var17_176
        //  6272: aload           var12
        //  6274: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  6279: aload           171
        //  6281: athrow         
        //  6282: aload           169
        //  6284: athrow         
        //  6285: getstatic       com/cyc/cycjava/cycl/module0003.$g4$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  6288: aload           var17_166
        //  6290: aload           var12
        //  6292: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  6297: goto            6317
        //  6300: astore          172
        //  6302: getstatic       com/cyc/cycjava/cycl/module0003.$g4$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  6305: aload           var17_166
        //  6307: aload           var12
        //  6309: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  6314: aload           172
        //  6316: athrow         
        //  6317: aload           var12
        //  6319: getfield        com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.throwStack:Ljava/util/Deque;
        //  6322: invokeinterface java/util/Deque.pop:()Ljava/lang/Object;
        //  6327: pop            
        //  6328: goto            6372
        //  6331: astore          var79
        //  6333: aload           var79
        //  6335: aload           var153
        //  6337: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Errors.handleThrowable:(Ljava/lang/Throwable;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6340: astore          var146
        //  6342: aload           var12
        //  6344: getfield        com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.throwStack:Ljava/util/Deque;
        //  6347: invokeinterface java/util/Deque.pop:()Ljava/lang/Object;
        //  6352: pop            
        //  6353: goto            6372
        //  6356: astore          173
        //  6358: aload           var12
        //  6360: getfield        com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.throwStack:Ljava/util/Deque;
        //  6363: invokeinterface java/util/Deque.pop:()Ljava/lang/Object;
        //  6368: pop            
        //  6369: aload           173
        //  6371: athrow         
        //  6372: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Time.get_internal_real_time:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6375: aload           var152
        //  6377: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Numbers.subtract:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6380: getstatic       com/cyc/tool/subl/jrtl/translatedCode/sublisp/time_high.$internal_time_units_per_second$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  6383: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.getGlobalValue:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6388: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Numbers.divide:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6391: astore          var147
        //  6393: aload           var147
        //  6395: aload           var92
        //  6397: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.cons:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLCons;
        //  6400: astore          var92
        //  6402: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  6405: aload           var146
        //  6407: if_acmpeq       6464
        //  6410: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  6413: getstatic       com/cyc/cycjava/cycl/module0745.$g5941$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  6416: aload           var12
        //  6418: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.getDynamicValue:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6423: if_acmpeq       6432
        //  6426: getstatic       com/cyc/cycjava/cycl/module0745.$ic97$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  6429: goto            6435
        //  6432: getstatic       com/cyc/cycjava/cycl/module0745.$ic98$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  6435: getstatic       com/cyc/cycjava/cycl/module0745.$ic99$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        //  6438: aload           var145
        //  6440: getstatic       com/cyc/cycjava/cycl/module0745.UNPROVIDED:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  6443: invokestatic    com/cyc/cycjava/cycl/module0051.f3574:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6446: aload           var47
        //  6448: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Functions.funcall:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6451: pop            
        //  6452: aload           var47
        //  6454: aload           var93
        //  6456: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.cons:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLCons;
        //  6459: astore          var93
        //  6461: goto            6576
        //  6464: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  6467: aload           var148
        //  6469: invokestatic    com/cyc/cycjava/cycl/module0209.f13550:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6472: if_acmpne       6496
        //  6475: getstatic       com/cyc/cycjava/cycl/module0745.$ic100$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        //  6478: aload           var47
        //  6480: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Errors.warn:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6483: pop            
        //  6484: aload           var47
        //  6486: aload           var93
        //  6488: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.cons:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLCons;
        //  6491: astore          var93
        //  6493: goto            6576
        //  6496: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  6499: aload           var148
        //  6501: getstatic       com/cyc/cycjava/cycl/module0745.$ic93$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        //  6504: invokestatic    com/cyc/cycjava/cycl/module0209.f13557:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6507: if_acmpeq       6531
        //  6510: getstatic       com/cyc/cycjava/cycl/module0745.$ic101$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        //  6513: aload           var47
        //  6515: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Errors.warn:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6518: pop            
        //  6519: aload           var47
        //  6521: aload           var93
        //  6523: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.cons:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLCons;
        //  6526: astore          var93
        //  6528: goto            6576
        //  6531: aload           var148
        //  6533: aload           var149
        //  6535: aload           var151
        //  6537: aload           var150
        //  6539: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        //  6542: astore          var48
        //  6544: aload           var47
        //  6546: aload           var85
        //  6548: invokestatic    com/cyc/cycjava/cycl/module0021.f1040:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6551: pop            
        //  6552: aload           var48
        //  6554: aload           var85
        //  6556: invokestatic    com/cyc/cycjava/cycl/module0021.f1040:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6559: pop            
        //  6560: aload           var47
        //  6562: aload           var88
        //  6564: invokestatic    com/cyc/cycjava/cycl/module0021.f1038:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6567: pop            
        //  6568: aload           var48
        //  6570: aload           var88
        //  6572: invokestatic    com/cyc/cycjava/cycl/module0021.f1038:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6575: pop            
        //  6576: aload           var90
        //  6578: aload           var91
        //  6580: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Numbers.mod:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6583: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject.isZero:()Z
        //  6588: ifeq            6683
        //  6591: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  6594: aload           var92
        //  6596: invokestatic    com/cyc/cycjava/cycl/module0035.f2013:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6599: if_acmpeq       6683
        //  6602: getstatic       com/cyc/cycjava/cycl/module0745.UNPROVIDED:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  6605: invokestatic    com/cyc/cycjava/cycl/module0745.f46255:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6608: pop            
        //  6609: aload           var90
        //  6611: aload           var91
        //  6613: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Numbers.integerDivide:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6616: astore          var177
        //  6618: getstatic       com/cyc/cycjava/cycl/module0745.$g5949$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  6621: aload           var177
        //  6623: aload           var93
        //  6625: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Sequences.length:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6628: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        //  6631: getstatic       com/cyc/cycjava/cycl/module0745.$g5949$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  6634: aload           var12
        //  6636: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.getDynamicValue:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6641: invokestatic    com/cyc/cycjava/cycl/module0035.f2083:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6644: aload           var12
        //  6646: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.setDynamicValue:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  6651: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  6654: astore          var93
        //  6656: aload           var90
        //  6658: aload           var91
        //  6660: aload           var94
        //  6662: aload           var95
        //  6664: aload           var92
        //  6666: aload_0         
        //  6667: aload           var99
        //  6669: invokestatic    com/cyc/cycjava/cycl/module0745.f46256:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6672: pop            
        //  6673: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Time.get_universal_time:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6676: astore          var94
        //  6678: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  6681: astore          var92
        //  6683: aload           var90
        //  6685: aload_2         
        //  6686: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject.numGE:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Z
        //  6691: ifeq            6699
        //  6694: getstatic       com/cyc/cycjava/cycl/module0745.T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        //  6697: astore          var49
        //  6699: aload           var143
        //  6701: aload           var141
        //  6703: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Numbers.add:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6706: astore          var143
        //  6708: goto            5235
        //  6711: goto            6723
        //  6714: aload           var137
        //  6716: getstatic       com/cyc/cycjava/cycl/module0745.$ic95$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        //  6719: invokestatic    com/cyc/tool/subl/jrtl/translatedCode/sublisp/cdestructuring_bind.cdestructuring_bind_error:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6722: pop            
        //  6723: aload           var131
        //  6725: astore          var178_179
        //  6727: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  6730: aload           var178_179
        //  6732: invokestatic    com/cyc/cycjava/cycl/module0065.f4777:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6735: if_acmpeq       6750
        //  6738: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  6741: getstatic       com/cyc/cycjava/cycl/module0745.$ic94$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  6744: invokestatic    com/cyc/cycjava/cycl/module0065.f4773:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6747: if_acmpne       8254
        //  6750: aload           var178_179
        //  6752: invokestatic    com/cyc/cycjava/cycl/module0065.f4738:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6755: astore          var180
        //  6757: aload           var178_179
        //  6759: invokestatic    com/cyc/cycjava/cycl/module0065.f4739:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6762: astore          var143
        //  6764: aload           var178_179
        //  6766: invokestatic    com/cyc/cycjava/cycl/module0065.f4734:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6769: astore          var181
        //  6771: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  6774: getstatic       com/cyc/cycjava/cycl/module0745.$ic94$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  6777: invokestatic    com/cyc/cycjava/cycl/module0065.f4773:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6780: if_acmpeq       6789
        //  6783: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  6786: goto            6792
        //  6789: getstatic       com/cyc/cycjava/cycl/module0745.$ic94$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  6792: astore          var182
        //  6794: aload           var143
        //  6796: aload           var181
        //  6798: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject.numL:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Z
        //  6803: ifeq            8254
        //  6806: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  6809: aload           var49
        //  6811: if_acmpne       8254
        //  6814: aload           var143
        //  6816: aload           var180
        //  6818: aload           var182
        //  6820: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Hashtables.gethash_without_values:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6823: astore          var47
        //  6825: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  6828: getstatic       com/cyc/cycjava/cycl/module0745.$ic94$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  6831: invokestatic    com/cyc/cycjava/cycl/module0065.f4773:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6834: if_acmpeq       6848
        //  6837: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  6840: aload           var47
        //  6842: invokestatic    com/cyc/cycjava/cycl/module0065.f4749:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6845: if_acmpne       8241
        //  6848: aload           var124
        //  6850: getstatic       com/cyc/cycjava/cycl/module0745.ONE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        //  6853: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Numbers.add:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6856: astore          var124
        //  6858: aload           var124
        //  6860: aload           var123
        //  6862: invokestatic    com/cyc/cycjava/cycl/module0012.note_percent_progress:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6865: pop            
        //  6866: aload           var90
        //  6868: getstatic       com/cyc/cycjava/cycl/module0745.ONE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        //  6871: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Numbers.add:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6874: astore          var90
        //  6876: getstatic       com/cyc/cycjava/cycl/module0012.$silent_progressP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  6879: aload           var12
        //  6881: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6886: astore          var17_183
        //  6888: getstatic       com/cyc/cycjava/cycl/module0012.$silent_progressP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  6891: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  6894: aload           var12
        //  6896: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  6901: aload           var90
        //  6903: aload_1         
        //  6904: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Numbers.subtract:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6907: aload_2         
        //  6908: aload_1         
        //  6909: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Numbers.subtract:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6912: invokestatic    com/cyc/cycjava/cycl/module0048.f_1X:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6915: invokestatic    com/cyc/cycjava/cycl/module0012.note_percent_progress:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6918: pop            
        //  6919: getstatic       com/cyc/cycjava/cycl/module0012.$silent_progressP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  6922: aload           var17_183
        //  6924: aload           var12
        //  6926: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  6931: goto            6951
        //  6934: astore          174
        //  6936: getstatic       com/cyc/cycjava/cycl/module0012.$silent_progressP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  6939: aload           var17_183
        //  6941: aload           var12
        //  6943: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  6948: aload           174
        //  6950: athrow         
        //  6951: aload           var90
        //  6953: aload_1         
        //  6954: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject.numL:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Z
        //  6959: ifne            8118
        //  6962: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  6965: aload           var47
        //  6967: aload           var73
        //  6969: invokestatic    com/cyc/cycjava/cycl/module0077.f5320:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6972: if_acmpne       8118
        //  6975: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  6978: aload           var47
        //  6980: invokestatic    com/cyc/cycjava/cycl/module0745.f46253:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6983: if_acmpne       8118
        //  6986: getstatic       com/cyc/cycjava/cycl/module0745.$g5943$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  6989: aload           var12
        //  6991: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.getDynamicValue:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  6996: astore          var145
        //  6998: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  7001: astore          var146
        //  7003: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  7006: astore          var147
        //  7008: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  7011: astore          var148
        //  7013: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  7016: astore          var149
        //  7018: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  7021: astore          var150
        //  7023: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  7026: astore          var151
        //  7028: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Time.get_internal_real_time:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  7031: astore          var152
        //  7033: invokestatic    com/cyc/cycjava/cycl/module0003.f61:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  7036: astore          var153
        //  7038: aload           var12
        //  7040: getfield        com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.throwStack:Ljava/util/Deque;
        //  7043: aload           var153
        //  7045: invokeinterface java/util/Deque.push:(Ljava/lang/Object;)V
        //  7050: getstatic       com/cyc/cycjava/cycl/module0003.$g4$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  7053: aload           var12
        //  7055: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  7060: astore          var17_184
        //  7062: getstatic       com/cyc/cycjava/cycl/module0003.$g4$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  7065: getstatic       com/cyc/cycjava/cycl/module0745.T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        //  7068: aload           var12
        //  7070: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  7075: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  7078: astore          var155
        //  7080: getstatic       com/cyc/cycjava/cycl/module0003.$g5$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  7083: aload           var12
        //  7085: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  7090: astore          var17_185
        //  7092: getstatic       com/cyc/cycjava/cycl/module0003.$g5$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  7095: getstatic       com/cyc/cycjava/cycl/module0745.ONE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        //  7098: getstatic       com/cyc/cycjava/cycl/module0003.$g5$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  7101: aload           var12
        //  7103: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.getDynamicValue:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  7108: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Numbers.add:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  7111: aload           var12
        //  7113: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  7118: aload           var145
        //  7120: aload           var153
        //  7122: invokestatic    com/cyc/cycjava/cycl/module0003.f62:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  7125: astore          var155
        //  7127: aload           var12
        //  7129: invokevirtual   com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.resetMultipleValues:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  7132: pop            
        //  7133: aload           var47
        //  7135: aload           var23
        //  7137: aload           var24
        //  7139: invokestatic    com/cyc/cycjava/cycl/module0745.f46254:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  7142: astore          var186_187
        //  7144: aload           var12
        //  7146: invokevirtual   com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.secondMultipleValue:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  7149: astore          var188_189
        //  7151: aload           var12
        //  7153: invokevirtual   com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.thirdMultipleValue:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  7156: astore          var190_191
        //  7158: aload           var12
        //  7160: invokevirtual   com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.fourthMultipleValue:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  7163: astore          var192_193
        //  7165: aload           var12
        //  7167: invokevirtual   com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.resetMultipleValues:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  7170: pop            
        //  7171: aload           var186_187
        //  7173: astore          var148
        //  7175: aload           var188_189
        //  7177: astore          var149
        //  7179: aload           var190_191
        //  7181: astore          var151
        //  7183: aload           var192_193
        //  7185: astore          var150
        //  7187: getstatic       com/cyc/cycjava/cycl/module0003.$g5$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  7190: aload           var17_185
        //  7192: aload           var12
        //  7194: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  7199: goto            7219
        //  7202: astore          175
        //  7204: getstatic       com/cyc/cycjava/cycl/module0003.$g5$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  7207: aload           var17_185
        //  7209: aload           var12
        //  7211: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  7216: aload           175
        //  7218: athrow         
        //  7219: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  7222: aload           var12
        //  7224: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  7229: astore          var17_194
        //  7231: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  7234: getstatic       com/cyc/cycjava/cycl/module0745.T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        //  7237: aload           var12
        //  7239: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  7244: aload           var155
        //  7246: invokestatic    com/cyc/cycjava/cycl/module0003.f64:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  7249: pop            
        //  7250: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  7253: aload           var17_194
        //  7255: aload           var12
        //  7257: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  7262: goto            7282
        //  7265: astore          176
        //  7267: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  7270: aload           var17_194
        //  7272: aload           var12
        //  7274: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  7279: aload           176
        //  7281: athrow         
        //  7282: goto            7353
        //  7285: astore          177
        //  7287: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  7290: aload           var12
        //  7292: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  7297: astore          var17_194
        //  7299: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  7302: getstatic       com/cyc/cycjava/cycl/module0745.T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        //  7305: aload           var12
        //  7307: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  7312: aload           var155
        //  7314: invokestatic    com/cyc/cycjava/cycl/module0003.f64:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  7317: pop            
        //  7318: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  7321: aload           var17_194
        //  7323: aload           var12
        //  7325: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  7330: goto            7350
        //  7333: astore          179
        //  7335: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  7338: aload           var17_194
        //  7340: aload           var12
        //  7342: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  7347: aload           179
        //  7349: athrow         
        //  7350: aload           177
        //  7352: athrow         
        //  7353: getstatic       com/cyc/cycjava/cycl/module0003.$g4$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  7356: aload           var17_184
        //  7358: aload           var12
        //  7360: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  7365: goto            7385
        //  7368: astore          180
        //  7370: getstatic       com/cyc/cycjava/cycl/module0003.$g4$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  7373: aload           var17_184
        //  7375: aload           var12
        //  7377: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  7382: aload           180
        //  7384: athrow         
        //  7385: aload           var12
        //  7387: getfield        com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.throwStack:Ljava/util/Deque;
        //  7390: invokeinterface java/util/Deque.pop:()Ljava/lang/Object;
        //  7395: pop            
        //  7396: goto            7440
        //  7399: astore          var79
        //  7401: aload           var79
        //  7403: aload           var153
        //  7405: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Errors.handleThrowable:(Ljava/lang/Throwable;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  7408: astore          var146
        //  7410: aload           var12
        //  7412: getfield        com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.throwStack:Ljava/util/Deque;
        //  7415: invokeinterface java/util/Deque.pop:()Ljava/lang/Object;
        //  7420: pop            
        //  7421: goto            7440
        //  7424: astore          181
        //  7426: aload           var12
        //  7428: getfield        com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.throwStack:Ljava/util/Deque;
        //  7431: invokeinterface java/util/Deque.pop:()Ljava/lang/Object;
        //  7436: pop            
        //  7437: aload           181
        //  7439: athrow         
        //  7440: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Time.get_internal_real_time:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  7443: aload           var152
        //  7445: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Numbers.subtract:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  7448: getstatic       com/cyc/tool/subl/jrtl/translatedCode/sublisp/time_high.$internal_time_units_per_second$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  7451: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.getGlobalValue:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  7456: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Numbers.divide:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  7459: astore          var147
        //  7461: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  7464: aload           var146
        //  7466: if_acmpeq       7935
        //  7469: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  7472: getstatic       com/cyc/cycjava/cycl/module0745.$g5942$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  7475: aload           var12
        //  7477: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.getDynamicValue:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  7482: if_acmpeq       7935
        //  7485: getstatic       com/cyc/cycjava/cycl/module0745.$ic96$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        //  7488: aload           var145
        //  7490: getstatic       com/cyc/cycjava/cycl/module0745.UNPROVIDED:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  7493: invokestatic    com/cyc/cycjava/cycl/module0051.f3574:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  7496: aload           var47
        //  7498: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Errors.warn:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  7501: pop            
        //  7502: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Time.get_internal_real_time:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  7505: astore          var152
        //  7507: invokestatic    com/cyc/cycjava/cycl/module0003.f61:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  7510: astore          var153
        //  7512: aload           var12
        //  7514: getfield        com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.throwStack:Ljava/util/Deque;
        //  7517: aload           var153
        //  7519: invokeinterface java/util/Deque.push:(Ljava/lang/Object;)V
        //  7524: getstatic       com/cyc/cycjava/cycl/module0003.$g4$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  7527: aload           var12
        //  7529: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  7534: astore          var17_195
        //  7536: getstatic       com/cyc/cycjava/cycl/module0003.$g4$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  7539: getstatic       com/cyc/cycjava/cycl/module0745.T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        //  7542: aload           var12
        //  7544: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  7549: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  7552: astore          var155
        //  7554: getstatic       com/cyc/cycjava/cycl/module0003.$g5$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  7557: aload           var12
        //  7559: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  7564: astore          var17_196
        //  7566: getstatic       com/cyc/cycjava/cycl/module0003.$g5$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  7569: getstatic       com/cyc/cycjava/cycl/module0745.ONE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        //  7572: getstatic       com/cyc/cycjava/cycl/module0003.$g5$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  7575: aload           var12
        //  7577: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.getDynamicValue:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  7582: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Numbers.add:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  7585: aload           var12
        //  7587: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  7592: aload           var145
        //  7594: aload           var153
        //  7596: invokestatic    com/cyc/cycjava/cycl/module0003.f62:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  7599: astore          var155
        //  7601: aload           var12
        //  7603: invokevirtual   com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.resetMultipleValues:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  7606: pop            
        //  7607: aload           var47
        //  7609: aload           var23
        //  7611: aload           var24
        //  7613: invokestatic    com/cyc/cycjava/cycl/module0745.f46254:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  7616: astore          var197_198
        //  7618: aload           var12
        //  7620: invokevirtual   com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.secondMultipleValue:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  7623: astore          var199_200
        //  7625: aload           var12
        //  7627: invokevirtual   com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.thirdMultipleValue:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  7630: astore          var201_202
        //  7632: aload           var12
        //  7634: invokevirtual   com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.fourthMultipleValue:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  7637: astore          var203_204
        //  7639: aload           var12
        //  7641: invokevirtual   com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.resetMultipleValues:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  7644: pop            
        //  7645: aload           var197_198
        //  7647: astore          var148
        //  7649: aload           var199_200
        //  7651: astore          var149
        //  7653: aload           var201_202
        //  7655: astore          var151
        //  7657: aload           var203_204
        //  7659: astore          var150
        //  7661: getstatic       com/cyc/cycjava/cycl/module0003.$g5$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  7664: aload           var17_196
        //  7666: aload           var12
        //  7668: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  7673: goto            7693
        //  7676: astore          182
        //  7678: getstatic       com/cyc/cycjava/cycl/module0003.$g5$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  7681: aload           var17_196
        //  7683: aload           var12
        //  7685: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  7690: aload           182
        //  7692: athrow         
        //  7693: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  7696: aload           var12
        //  7698: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  7703: astore          var17_205
        //  7705: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  7708: getstatic       com/cyc/cycjava/cycl/module0745.T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        //  7711: aload           var12
        //  7713: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  7718: aload           var155
        //  7720: invokestatic    com/cyc/cycjava/cycl/module0003.f64:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  7723: pop            
        //  7724: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  7727: aload           var17_205
        //  7729: aload           var12
        //  7731: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  7736: goto            7756
        //  7739: astore          183
        //  7741: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  7744: aload           var17_205
        //  7746: aload           var12
        //  7748: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  7753: aload           183
        //  7755: athrow         
        //  7756: goto            7827
        //  7759: astore          184
        //  7761: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  7764: aload           var12
        //  7766: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  7771: astore          var17_205
        //  7773: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  7776: getstatic       com/cyc/cycjava/cycl/module0745.T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        //  7779: aload           var12
        //  7781: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  7786: aload           var155
        //  7788: invokestatic    com/cyc/cycjava/cycl/module0003.f64:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  7791: pop            
        //  7792: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  7795: aload           var17_205
        //  7797: aload           var12
        //  7799: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  7804: goto            7824
        //  7807: astore          186
        //  7809: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  7812: aload           var17_205
        //  7814: aload           var12
        //  7816: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  7821: aload           186
        //  7823: athrow         
        //  7824: aload           184
        //  7826: athrow         
        //  7827: getstatic       com/cyc/cycjava/cycl/module0003.$g4$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  7830: aload           var17_195
        //  7832: aload           var12
        //  7834: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  7839: goto            7859
        //  7842: astore          187
        //  7844: getstatic       com/cyc/cycjava/cycl/module0003.$g4$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  7847: aload           var17_195
        //  7849: aload           var12
        //  7851: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  7856: aload           187
        //  7858: athrow         
        //  7859: aload           var12
        //  7861: getfield        com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.throwStack:Ljava/util/Deque;
        //  7864: invokeinterface java/util/Deque.pop:()Ljava/lang/Object;
        //  7869: pop            
        //  7870: goto            7914
        //  7873: astore          var79
        //  7875: aload           var79
        //  7877: aload           var153
        //  7879: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Errors.handleThrowable:(Ljava/lang/Throwable;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  7882: astore          var146
        //  7884: aload           var12
        //  7886: getfield        com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.throwStack:Ljava/util/Deque;
        //  7889: invokeinterface java/util/Deque.pop:()Ljava/lang/Object;
        //  7894: pop            
        //  7895: goto            7914
        //  7898: astore          188
        //  7900: aload           var12
        //  7902: getfield        com/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread.throwStack:Ljava/util/Deque;
        //  7905: invokeinterface java/util/Deque.pop:()Ljava/lang/Object;
        //  7910: pop            
        //  7911: aload           188
        //  7913: athrow         
        //  7914: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Time.get_internal_real_time:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  7917: aload           var152
        //  7919: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Numbers.subtract:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  7922: getstatic       com/cyc/tool/subl/jrtl/translatedCode/sublisp/time_high.$internal_time_units_per_second$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  7925: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.getGlobalValue:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  7930: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Numbers.divide:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  7933: astore          var147
        //  7935: aload           var147
        //  7937: aload           var92
        //  7939: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.cons:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLCons;
        //  7942: astore          var92
        //  7944: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  7947: aload           var146
        //  7949: if_acmpeq       8006
        //  7952: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  7955: getstatic       com/cyc/cycjava/cycl/module0745.$g5941$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  7958: aload           var12
        //  7960: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.getDynamicValue:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  7965: if_acmpeq       7974
        //  7968: getstatic       com/cyc/cycjava/cycl/module0745.$ic97$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  7971: goto            7977
        //  7974: getstatic       com/cyc/cycjava/cycl/module0745.$ic98$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  7977: getstatic       com/cyc/cycjava/cycl/module0745.$ic99$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        //  7980: aload           var145
        //  7982: getstatic       com/cyc/cycjava/cycl/module0745.UNPROVIDED:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  7985: invokestatic    com/cyc/cycjava/cycl/module0051.f3574:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  7988: aload           var47
        //  7990: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Functions.funcall:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  7993: pop            
        //  7994: aload           var47
        //  7996: aload           var93
        //  7998: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.cons:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLCons;
        //  8001: astore          var93
        //  8003: goto            8118
        //  8006: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  8009: aload           var148
        //  8011: invokestatic    com/cyc/cycjava/cycl/module0209.f13550:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  8014: if_acmpne       8038
        //  8017: getstatic       com/cyc/cycjava/cycl/module0745.$ic100$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        //  8020: aload           var47
        //  8022: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Errors.warn:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  8025: pop            
        //  8026: aload           var47
        //  8028: aload           var93
        //  8030: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.cons:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLCons;
        //  8033: astore          var93
        //  8035: goto            8118
        //  8038: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  8041: aload           var148
        //  8043: getstatic       com/cyc/cycjava/cycl/module0745.$ic93$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        //  8046: invokestatic    com/cyc/cycjava/cycl/module0209.f13557:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  8049: if_acmpeq       8073
        //  8052: getstatic       com/cyc/cycjava/cycl/module0745.$ic101$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        //  8055: aload           var47
        //  8057: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Errors.warn:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  8060: pop            
        //  8061: aload           var47
        //  8063: aload           var93
        //  8065: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.cons:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLCons;
        //  8068: astore          var93
        //  8070: goto            8118
        //  8073: aload           var148
        //  8075: aload           var149
        //  8077: aload           var151
        //  8079: aload           var150
        //  8081: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        //  8084: astore          var48
        //  8086: aload           var47
        //  8088: aload           var85
        //  8090: invokestatic    com/cyc/cycjava/cycl/module0021.f1040:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  8093: pop            
        //  8094: aload           var48
        //  8096: aload           var85
        //  8098: invokestatic    com/cyc/cycjava/cycl/module0021.f1040:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  8101: pop            
        //  8102: aload           var47
        //  8104: aload           var88
        //  8106: invokestatic    com/cyc/cycjava/cycl/module0021.f1038:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  8109: pop            
        //  8110: aload           var48
        //  8112: aload           var88
        //  8114: invokestatic    com/cyc/cycjava/cycl/module0021.f1038:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  8117: pop            
        //  8118: aload           var90
        //  8120: aload           var91
        //  8122: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Numbers.mod:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  8125: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject.isZero:()Z
        //  8130: ifeq            8225
        //  8133: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  8136: aload           var92
        //  8138: invokestatic    com/cyc/cycjava/cycl/module0035.f2013:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  8141: if_acmpeq       8225
        //  8144: getstatic       com/cyc/cycjava/cycl/module0745.UNPROVIDED:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  8147: invokestatic    com/cyc/cycjava/cycl/module0745.f46255:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  8150: pop            
        //  8151: aload           var90
        //  8153: aload           var91
        //  8155: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Numbers.integerDivide:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  8158: astore          var177
        //  8160: getstatic       com/cyc/cycjava/cycl/module0745.$g5949$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  8163: aload           var177
        //  8165: aload           var93
        //  8167: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Sequences.length:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  8170: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        //  8173: getstatic       com/cyc/cycjava/cycl/module0745.$g5949$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  8176: aload           var12
        //  8178: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.getDynamicValue:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  8183: invokestatic    com/cyc/cycjava/cycl/module0035.f2083:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  8186: aload           var12
        //  8188: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.setDynamicValue:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  8193: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  8196: astore          var93
        //  8198: aload           var90
        //  8200: aload           var91
        //  8202: aload           var94
        //  8204: aload           var95
        //  8206: aload           var92
        //  8208: aload_0         
        //  8209: aload           var99
        //  8211: invokestatic    com/cyc/cycjava/cycl/module0745.f46256:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  8214: pop            
        //  8215: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Time.get_universal_time:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  8218: astore          var94
        //  8220: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  8223: astore          var92
        //  8225: aload           var90
        //  8227: aload_2         
        //  8228: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject.numGE:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Z
        //  8233: ifeq            8241
        //  8236: getstatic       com/cyc/cycjava/cycl/module0745.T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        //  8239: astore          var49
        //  8241: aload           var143
        //  8243: getstatic       com/cyc/cycjava/cycl/module0745.ONE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        //  8246: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Numbers.add:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  8249: astore          var143
        //  8251: goto            6794
        //  8254: aload           var129
        //  8256: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject.rest:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  8261: astore          var129
        //  8263: goto            4979
        //  8266: invokestatic    com/cyc/cycjava/cycl/module0012.f479:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  8269: pop            
        //  8270: getstatic       com/cyc/cycjava/cycl/module0012.$g78$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  8273: aload           var32_128
        //  8275: aload           var12
        //  8277: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  8282: getstatic       com/cyc/cycjava/cycl/module0012.$g77$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  8285: aload           var26_127
        //  8287: aload           var12
        //  8289: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  8294: getstatic       com/cyc/cycjava/cycl/module0012.$g76$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  8297: aload           var25_126
        //  8299: aload           var12
        //  8301: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  8306: getstatic       com/cyc/cycjava/cycl/module0012.$g75$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  8309: aload           var17_125
        //  8311: aload           var12
        //  8313: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  8318: goto            8374
        //  8321: astore          189
        //  8323: getstatic       com/cyc/cycjava/cycl/module0012.$g78$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  8326: aload           var32_128
        //  8328: aload           var12
        //  8330: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  8335: getstatic       com/cyc/cycjava/cycl/module0012.$g77$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  8338: aload           var26_127
        //  8340: aload           var12
        //  8342: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  8347: getstatic       com/cyc/cycjava/cycl/module0012.$g76$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  8350: aload           var25_126
        //  8352: aload           var12
        //  8354: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  8359: getstatic       com/cyc/cycjava/cycl/module0012.$g75$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  8362: aload           var17_125
        //  8364: aload           var12
        //  8366: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  8371: aload           189
        //  8373: athrow         
        //  8374: getstatic       com/cyc/cycjava/cycl/module0012.$silent_progressP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  8377: aload           var17_121
        //  8379: aload           var12
        //  8381: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  8386: goto            8406
        //  8389: astore          190
        //  8391: getstatic       com/cyc/cycjava/cycl/module0012.$silent_progressP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  8394: aload           var17_121
        //  8396: aload           var12
        //  8398: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  8403: aload           190
        //  8405: athrow         
        //  8406: invokestatic    com/cyc/cycjava/cycl/module0012.f479:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  8409: pop            
        //  8410: getstatic       com/cyc/cycjava/cycl/module0012.$g78$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  8413: aload           var32_120
        //  8415: aload           var12
        //  8417: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  8422: getstatic       com/cyc/cycjava/cycl/module0012.$g77$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  8425: aload           var26_119
        //  8427: aload           var12
        //  8429: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  8434: getstatic       com/cyc/cycjava/cycl/module0012.$g76$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  8437: aload           var25_118
        //  8439: aload           var12
        //  8441: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  8446: getstatic       com/cyc/cycjava/cycl/module0012.$g75$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  8449: aload           var17_117
        //  8451: aload           var12
        //  8453: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  8458: goto            8514
        //  8461: astore          191
        //  8463: getstatic       com/cyc/cycjava/cycl/module0012.$g78$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  8466: aload           var32_120
        //  8468: aload           var12
        //  8470: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  8475: getstatic       com/cyc/cycjava/cycl/module0012.$g77$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  8478: aload           var26_119
        //  8480: aload           var12
        //  8482: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  8487: getstatic       com/cyc/cycjava/cycl/module0012.$g76$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  8490: aload           var25_118
        //  8492: aload           var12
        //  8494: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  8499: getstatic       com/cyc/cycjava/cycl/module0012.$g75$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  8502: aload           var17_117
        //  8504: aload           var12
        //  8506: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  8511: aload           191
        //  8513: athrow         
        //  8514: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  8517: aload           var49
        //  8519: if_acmpeq       8536
        //  8522: aload_0         
        //  8523: getstatic       com/cyc/cycjava/cycl/module0745.$ic81$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        //  8526: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Sequences.cconcatenate:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  8529: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  8532: invokestatic    com/cyc/cycjava/cycl/module0075.f5237:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  8535: pop            
        //  8536: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  8539: aload           var112
        //  8541: if_acmpeq       8561
        //  8544: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  8547: aload           var114
        //  8549: if_acmpne       8561
        //  8552: aload           var112
        //  8554: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  8557: invokestatic    com/cyc/cycjava/cycl/module0034.f1873:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  8560: pop            
        //  8561: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  8564: aload           var17_116
        //  8566: aload           var12
        //  8568: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  8573: goto            8593
        //  8576: astore          192
        //  8578: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  8581: aload           var17_116
        //  8583: aload           var12
        //  8585: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  8590: aload           192
        //  8592: athrow         
        //  8593: aload           115
        //  8595: athrow         
        //  8596: getstatic       com/cyc/cycjava/cycl/module0034.$g879$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  8599: aload           var17_113
        //  8601: aload           var12
        //  8603: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  8608: goto            8628
        //  8611: astore          193
        //  8613: getstatic       com/cyc/cycjava/cycl/module0034.$g879$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  8616: aload           var17_113
        //  8618: aload           var12
        //  8620: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  8625: aload           193
        //  8627: athrow         
        //  8628: getstatic       com/cyc/cycjava/cycl/module0580.$g4359$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  8631: aload           var17_111
        //  8633: aload           var12
        //  8635: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  8640: goto            8660
        //  8643: astore          194
        //  8645: getstatic       com/cyc/cycjava/cycl/module0580.$g4359$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  8648: aload           var17_111
        //  8650: aload           var12
        //  8652: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  8657: aload           194
        //  8659: athrow         
        //  8660: aload           var110
        //  8662: getstatic       com/cyc/cycjava/cycl/module0745.$ic102$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  8665: if_acmpne       8701
        //  8668: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  8671: getstatic       com/cyc/cycjava/cycl/module0580.$g4358$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  8674: aload           var12
        //  8676: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.getDynamicValue:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  8681: invokestatic    com/cyc/cycjava/cycl/module0034.f1839:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  8684: if_acmpeq       8701
        //  8687: getstatic       com/cyc/cycjava/cycl/module0580.$g4358$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  8690: aload           var12
        //  8692: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.getDynamicValue:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  8697: invokestatic    com/cyc/cycjava/cycl/module0034.f1891:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  8700: pop            
        //  8701: getstatic       com/cyc/cycjava/cycl/module0580.$g4358$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  8704: aload           var17_109
        //  8706: aload           var12
        //  8708: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  8713: goto            8733
        //  8716: astore          195
        //  8718: getstatic       com/cyc/cycjava/cycl/module0580.$g4358$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  8721: aload           var17_109
        //  8723: aload           var12
        //  8725: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  8730: aload           195
        //  8732: athrow         
        //  8733: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  8736: aload           var12
        //  8738: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  8743: astore          var17_206
        //  8745: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  8748: getstatic       com/cyc/cycjava/cycl/module0745.T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        //  8751: aload           var12
        //  8753: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  8758: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  8761: aload           var108
        //  8763: if_acmpne       8780
        //  8766: getstatic       com/cyc/cycjava/cycl/module0580.$g4362$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  8769: aload           var12
        //  8771: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.getDynamicValue:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  8776: invokestatic    com/cyc/cycjava/cycl/module0580.f35554:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  8779: pop            
        //  8780: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  8783: aload           var17_206
        //  8785: aload           var12
        //  8787: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  8792: goto            8812
        //  8795: astore          196
        //  8797: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  8800: aload           var17_206
        //  8802: aload           var12
        //  8804: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  8809: aload           196
        //  8811: athrow         
        //  8812: goto            8899
        //  8815: astore          197
        //  8817: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  8820: aload           var12
        //  8822: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  8827: astore          var17_206
        //  8829: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  8832: getstatic       com/cyc/cycjava/cycl/module0745.T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        //  8835: aload           var12
        //  8837: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  8842: getstatic       com/cyc/cycjava/cycl/module0745.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //  8845: aload           var108
        //  8847: if_acmpne       8864
        //  8850: getstatic       com/cyc/cycjava/cycl/module0580.$g4362$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  8853: aload           var12
        //  8855: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.getDynamicValue:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  8860: invokestatic    com/cyc/cycjava/cycl/module0580.f35554:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  8863: pop            
        //  8864: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  8867: aload           var17_206
        //  8869: aload           var12
        //  8871: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  8876: goto            8896
        //  8879: astore          199
        //  8881: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  8884: aload           var17_206
        //  8886: aload           var12
        //  8888: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  8893: aload           199
        //  8895: athrow         
        //  8896: aload           197
        //  8898: athrow         
        //  8899: getstatic       com/cyc/cycjava/cycl/module0580.$g4362$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  8902: aload           var17_107
        //  8904: aload           var12
        //  8906: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  8911: goto            8931
        //  8914: astore          200
        //  8916: getstatic       com/cyc/cycjava/cycl/module0580.$g4362$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  8919: aload           var17_107
        //  8921: aload           var12
        //  8923: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  8928: aload           200
        //  8930: athrow         
        //  8931: getstatic       com/cyc/cycjava/cycl/module0580.$g4361$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  8934: aload           var17_106
        //  8936: aload           var12
        //  8938: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  8943: goto            8963
        //  8946: astore          201
        //  8948: getstatic       com/cyc/cycjava/cycl/module0580.$g4361$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  8951: aload           var17_106
        //  8953: aload           var12
        //  8955: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  8960: aload           201
        //  8962: athrow         
        //  8963: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  8966: aload           var12
        //  8968: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  8973: astore          var17_207
        //  8975: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  8978: getstatic       com/cyc/cycjava/cycl/module0745.T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        //  8981: aload           var12
        //  8983: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  8988: aload           var103_104
        //  8990: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject.isStream:()Z
        //  8995: ifeq            9007
        //  8998: aload           var103_104
        //  9000: getstatic       com/cyc/cycjava/cycl/module0745.UNPROVIDED:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  9003: invokestatic    com/cyc/tool/subl/jrtl/translatedCode/sublisp/streams_high.close:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  9006: pop            
        //  9007: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  9010: aload           var17_207
        //  9012: aload           var12
        //  9014: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  9019: goto            9039
        //  9022: astore          202
        //  9024: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  9027: aload           var17_207
        //  9029: aload           var12
        //  9031: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  9036: aload           202
        //  9038: athrow         
        //  9039: goto            9123
        //  9042: astore          203
        //  9044: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  9047: aload           var12
        //  9049: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  9054: astore          var17_207
        //  9056: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  9059: getstatic       com/cyc/cycjava/cycl/module0745.T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        //  9062: aload           var12
        //  9064: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  9069: aload           var103_104
        //  9071: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject.isStream:()Z
        //  9076: ifeq            9088
        //  9079: aload           var103_104
        //  9081: getstatic       com/cyc/cycjava/cycl/module0745.UNPROVIDED:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  9084: invokestatic    com/cyc/tool/subl/jrtl/translatedCode/sublisp/streams_high.close:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  9087: pop            
        //  9088: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  9091: aload           var17_207
        //  9093: aload           var12
        //  9095: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  9100: goto            9120
        //  9103: astore          205
        //  9105: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  9108: aload           var17_207
        //  9110: aload           var12
        //  9112: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  9117: aload           205
        //  9119: athrow         
        //  9120: aload           203
        //  9122: athrow         
        //  9123: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  9126: aload           var12
        //  9128: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  9133: astore          var17_208
        //  9135: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  9138: getstatic       com/cyc/cycjava/cycl/module0745.T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        //  9141: aload           var12
        //  9143: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  9148: aload           var100_101
        //  9150: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject.isStream:()Z
        //  9155: ifeq            9167
        //  9158: aload           var100_101
        //  9160: getstatic       com/cyc/cycjava/cycl/module0745.UNPROVIDED:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  9163: invokestatic    com/cyc/tool/subl/jrtl/translatedCode/sublisp/streams_high.close:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  9166: pop            
        //  9167: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  9170: aload           var17_208
        //  9172: aload           var12
        //  9174: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  9179: goto            9199
        //  9182: astore          206
        //  9184: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  9187: aload           var17_208
        //  9189: aload           var12
        //  9191: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  9196: aload           206
        //  9198: athrow         
        //  9199: goto            9283
        //  9202: astore          207
        //  9204: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  9207: aload           var12
        //  9209: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  9214: astore          var17_208
        //  9216: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  9219: getstatic       com/cyc/cycjava/cycl/module0745.T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        //  9222: aload           var12
        //  9224: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  9229: aload           var100_101
        //  9231: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject.isStream:()Z
        //  9236: ifeq            9248
        //  9239: aload           var100_101
        //  9241: getstatic       com/cyc/cycjava/cycl/module0745.UNPROVIDED:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  9244: invokestatic    com/cyc/tool/subl/jrtl/translatedCode/sublisp/streams_high.close:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  9247: pop            
        //  9248: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  9251: aload           var17_208
        //  9253: aload           var12
        //  9255: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  9260: goto            9280
        //  9263: astore          209
        //  9265: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  9268: aload           var17_208
        //  9270: aload           var12
        //  9272: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  9277: aload           209
        //  9279: athrow         
        //  9280: aload           207
        //  9282: athrow         
        //  9283: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  9286: aload           var12
        //  9288: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  9293: astore          var17_209
        //  9295: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  9298: getstatic       com/cyc/cycjava/cycl/module0745.T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        //  9301: aload           var12
        //  9303: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  9308: aload           var98
        //  9310: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject.isStream:()Z
        //  9315: ifeq            9327
        //  9318: aload           var98
        //  9320: getstatic       com/cyc/cycjava/cycl/module0745.UNPROVIDED:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  9323: invokestatic    com/cyc/tool/subl/jrtl/translatedCode/sublisp/streams_high.close:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  9326: pop            
        //  9327: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  9330: aload           var17_209
        //  9332: aload           var12
        //  9334: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  9339: goto            9359
        //  9342: astore          210
        //  9344: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  9347: aload           var17_209
        //  9349: aload           var12
        //  9351: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  9356: aload           210
        //  9358: athrow         
        //  9359: goto            9443
        //  9362: astore          211
        //  9364: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  9367: aload           var12
        //  9369: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  9374: astore          var17_209
        //  9376: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  9379: getstatic       com/cyc/cycjava/cycl/module0745.T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        //  9382: aload           var12
        //  9384: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  9389: aload           var98
        //  9391: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject.isStream:()Z
        //  9396: ifeq            9408
        //  9399: aload           var98
        //  9401: getstatic       com/cyc/cycjava/cycl/module0745.UNPROVIDED:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  9404: invokestatic    com/cyc/tool/subl/jrtl/translatedCode/sublisp/streams_high.close:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //  9407: pop            
        //  9408: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  9411: aload           var17_209
        //  9413: aload           var12
        //  9415: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  9420: goto            9440
        //  9423: astore          213
        //  9425: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  9428: aload           var17_209
        //  9430: aload           var12
        //  9432: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  9437: aload           213
        //  9439: athrow         
        //  9440: aload           211
        //  9442: athrow         
        //  9443: getstatic       com/cyc/cycjava/cycl/module0745.$g5950$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  9446: aload           var97
        //  9448: aload           var12
        //  9450: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  9455: getstatic       com/cyc/cycjava/cycl/module0745.$g5949$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  9458: aload           var96
        //  9460: aload           var12
        //  9462: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  9467: getstatic       com/cyc/cycjava/cycl/module0745.$g5948$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  9470: aload           var32
        //  9472: aload           var12
        //  9474: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  9479: getstatic       com/cyc/cycjava/cycl/module0745.$g5947$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  9482: aload           var26
        //  9484: aload           var12
        //  9486: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  9491: getstatic       com/cyc/cycjava/cycl/module0745.$g5946$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  9494: aload           var25
        //  9496: aload           var12
        //  9498: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  9503: getstatic       com/cyc/cycjava/cycl/module0745.$g5945$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  9506: aload           var17
        //  9508: aload           var12
        //  9510: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  9515: goto            9595
        //  9518: astore          214
        //  9520: getstatic       com/cyc/cycjava/cycl/module0745.$g5950$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  9523: aload           var97
        //  9525: aload           var12
        //  9527: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  9532: getstatic       com/cyc/cycjava/cycl/module0745.$g5949$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  9535: aload           var96
        //  9537: aload           var12
        //  9539: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  9544: getstatic       com/cyc/cycjava/cycl/module0745.$g5948$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  9547: aload           var32
        //  9549: aload           var12
        //  9551: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  9556: getstatic       com/cyc/cycjava/cycl/module0745.$g5947$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  9559: aload           var26
        //  9561: aload           var12
        //  9563: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  9568: getstatic       com/cyc/cycjava/cycl/module0745.$g5946$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  9571: aload           var25
        //  9573: aload           var12
        //  9575: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  9580: getstatic       com/cyc/cycjava/cycl/module0745.$g5945$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //  9583: aload           var17
        //  9585: aload           var12
        //  9587: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //  9592: aload           214
        //  9594: athrow         
        //  9595: aload_0         
        //  9596: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  283    305    320    337    Any
        //  320    322    320    337    Any
        //  376    399    414    431    Any
        //  414    416    414    431    Any
        //  1398   1429   1444   1461   Any
        //  1444   1446   1444   1461   Any
        //  1602   1697   1712   1729   Any
        //  1712   1714   1712   1729   Any
        //  1741   1760   1775   1792   Any
        //  1775   1777   1775   1792   Any
        //  1590   1729   1795   1863   Any
        //  1809   1828   1843   1860   Any
        //  1843   1845   1843   1860   Any
        //  1795   1797   1795   1863   Any
        //  1572   1863   1878   1895   Any
        //  1878   1880   1878   1895   Any
        //  1548   1895   1909   1934   Ljava/lang/Throwable;
        //  1548   1895   1934   1950   Any
        //  1909   1920   1934   1950   Any
        //  1934   1936   1934   1950   Any
        //  2076   2171   2186   2203   Any
        //  2186   2188   2186   2203   Any
        //  2215   2234   2249   2266   Any
        //  2249   2251   2249   2266   Any
        //  2064   2203   2269   2337   Any
        //  2283   2302   2317   2334   Any
        //  2317   2319   2317   2334   Any
        //  2269   2271   2269   2337   Any
        //  2046   2337   2352   2369   Any
        //  2352   2354   2352   2369   Any
        //  2022   2369   2383   2408   Ljava/lang/Throwable;
        //  2022   2369   2408   2424   Any
        //  2383   2394   2408   2424   Any
        //  2408   2410   2408   2424   Any
        //  2940   2971   2986   3003   Any
        //  2986   2988   2986   3003   Any
        //  3144   3239   3254   3271   Any
        //  3254   3256   3254   3271   Any
        //  3283   3302   3317   3334   Any
        //  3317   3319   3317   3334   Any
        //  3132   3271   3337   3405   Any
        //  3351   3370   3385   3402   Any
        //  3385   3387   3385   3402   Any
        //  3337   3339   3337   3405   Any
        //  3114   3405   3420   3437   Any
        //  3420   3422   3420   3437   Any
        //  3090   3437   3451   3476   Ljava/lang/Throwable;
        //  3090   3437   3476   3492   Any
        //  3451   3462   3476   3492   Any
        //  3476   3478   3476   3492   Any
        //  3618   3713   3728   3745   Any
        //  3728   3730   3728   3745   Any
        //  3757   3776   3791   3808   Any
        //  3791   3793   3791   3808   Any
        //  3606   3745   3811   3879   Any
        //  3825   3844   3859   3876   Any
        //  3859   3861   3859   3876   Any
        //  3811   3813   3811   3879   Any
        //  3588   3879   3894   3911   Any
        //  3894   3896   3894   3911   Any
        //  3564   3911   3925   3950   Ljava/lang/Throwable;
        //  3564   3911   3950   3966   Any
        //  3925   3936   3950   3966   Any
        //  3950   3952   3950   3966   Any
        //  963    4322   4373   4426   Any
        //  4373   4375   4373   4426   Any
        //  887    4426   4441   4458   Any
        //  4441   4443   4441   4458   Any
        //  783    4462   4513   4566   Any
        //  4513   4515   4513   4566   Any
        //  714    4613   4628   4645   Any
        //  4628   4630   4628   4645   Any
        //  5346   5377   5392   5394   Any
        //  5392   5394   5392   5394   Any
        //  5550   5645   5660   5662   Any
        //  5660   5662   5660   5662   Any
        //  5689   5708   5723   5725   Any
        //  5723   5725   5723   5725   Any
        //  5538   5677   5743   5745   Any
        //  5757   5776   5791   5793   Any
        //  5791   5793   5791   5793   Any
        //  5743   5745   5743   5745   Any
        //  5520   5811   5826   5828   Any
        //  5826   5828   5826   5828   Any
        //  5496   5843   5857   5868   Ljava/lang/Throwable;
        //  5496   5843   5882   5884   Any
        //  5857   5868   5882   5884   Any
        //  5882   5884   5882   5884   Any
        //  6024   6119   6134   6136   Any
        //  6134   6136   6134   6136   Any
        //  6163   6182   6197   6199   Any
        //  6197   6199   6197   6199   Any
        //  6012   6151   6217   6219   Any
        //  6231   6250   6265   6267   Any
        //  6265   6267   6265   6267   Any
        //  6217   6219   6217   6219   Any
        //  5994   6285   6300   6302   Any
        //  6300   6302   6300   6302   Any
        //  5970   6317   6331   6342   Ljava/lang/Throwable;
        //  5970   6317   6356   6358   Any
        //  6331   6342   6356   6358   Any
        //  6356   6358   6356   6358   Any
        //  6888   6919   6934   6936   Any
        //  6934   6936   6934   6936   Any
        //  7092   7187   7202   7204   Any
        //  7202   7204   7202   7204   Any
        //  7231   7250   7265   7267   Any
        //  7265   7267   7265   7267   Any
        //  7080   7219   7285   7287   Any
        //  7299   7318   7333   7335   Any
        //  7333   7335   7333   7335   Any
        //  7285   7287   7285   7287   Any
        //  7062   7353   7368   7370   Any
        //  7368   7370   7368   7370   Any
        //  7038   7385   7399   7410   Ljava/lang/Throwable;
        //  7038   7385   7424   7426   Any
        //  7399   7410   7424   7426   Any
        //  7424   7426   7424   7426   Any
        //  7566   7661   7676   7678   Any
        //  7676   7678   7676   7678   Any
        //  7705   7724   7739   7741   Any
        //  7739   7741   7739   7741   Any
        //  7554   7693   7759   7761   Any
        //  7773   7792   7807   7809   Any
        //  7807   7809   7807   7809   Any
        //  7759   7761   7759   7761   Any
        //  7536   7827   7842   7844   Any
        //  7842   7844   7842   7844   Any
        //  7512   7859   7873   7884   Ljava/lang/Throwable;
        //  7512   7859   7898   7900   Any
        //  7873   7884   7898   7900   Any
        //  7898   7900   7898   7900   Any
        //  4911   8270   8321   8323   Any
        //  8321   8323   8321   8323   Any
        //  4835   8374   8389   8391   Any
        //  8389   8391   8389   8391   Any
        //  4731   8410   8461   8463   Any
        //  8461   8463   8461   8463   Any
        //  4662   8561   8576   8578   Any
        //  8576   8578   8576   8578   Any
        //  4648   4650   4648   4650   Any
        //  616    8596   8611   8628   Any
        //  8611   8613   8611   8628   Any
        //  579    8628   8643   8660   Any
        //  8643   8645   8643   8660   Any
        //  541    8701   8716   8733   Any
        //  8716   8718   8716   8733   Any
        //  8745   8780   8795   8812   Any
        //  8795   8797   8795   8812   Any
        //  523    8733   8815   8899   Any
        //  8829   8864   8879   8896   Any
        //  8879   8881   8879   8896   Any
        //  8815   8817   8815   8899   Any
        //  497    8899   8914   8931   Any
        //  8914   8916   8914   8931   Any
        //  466    8931   8946   8963   Any
        //  8946   8948   8946   8963   Any
        //  8975   9007   9022   9039   Any
        //  9022   9024   9022   9039   Any
        //  364    8963   9042   9123   Any
        //  9056   9088   9103   9120   Any
        //  9103   9105   9103   9120   Any
        //  9042   9044   9042   9123   Any
        //  9135   9167   9182   9199   Any
        //  9182   9184   9182   9199   Any
        //  271    9123   9202   9283   Any
        //  9216   9248   9263   9280   Any
        //  9263   9265   9263   9280   Any
        //  9202   9204   9202   9283   Any
        //  9295   9327   9342   9359   Any
        //  9342   9344   9342   9359   Any
        //  233    9283   9362   9443   Any
        //  9376   9408   9423   9440   Any
        //  9423   9425   9423   9440   Any
        //  9362   9364   9362   9443   Any
        //  150    9443   9518   9595   Any
        //  9518   9520   9518   9595   Any
        // 
        // The error that occurred was:
        // 
        // java.util.ConcurrentModificationException
        //     at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:909)
        //     at java.util.ArrayList$Itr.next(ArrayList.java:859)
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:2863)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2445)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at org.sf.feeling.decompiler.procyon.decompiler.ProcyonDecompiler.decompile(ProcyonDecompiler.java:113)
        //     at org.sf.feeling.decompiler.editor.BaseDecompilerSourceMapper.decompile(BaseDecompilerSourceMapper.java:353)
        //     at org.sf.feeling.decompiler.editor.BaseDecompilerSourceMapper.findSource(BaseDecompilerSourceMapper.java:168)
        //     at org.sf.feeling.decompiler.editor.DecompilerSourceMapper.findSource(DecompilerSourceMapper.java:72)
        //     at org.sf.feeling.decompiler.util.DecompileUtil.decompile(DecompileUtil.java:47)
        //     at org.sf.feeling.decompiler.actions.ExportSourceAction.exportPackageSources(ExportSourceAction.java:324)
        //     at org.sf.feeling.decompiler.actions.ExportSourceAction.access$0(ExportSourceAction.java:257)
        //     at org.sf.feeling.decompiler.actions.ExportSourceAction$1.run(ExportSourceAction.java:171)
        //     at org.eclipse.jface.operation.ModalContext$ModalContextThread.run(ModalContext.java:119)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static SubLObject f46257(SubLObject var210, SubLObject var211) {
        if (var210 == module0745.UNPROVIDED) {
            var210 = (SubLObject)module0745.$ic103$;
        }
        if (var211 == module0745.UNPROVIDED) {
            var211 = (SubLObject)module0745.$ic103$;
        }
        final SubLThread var212 = SubLProcess.currentSubLThread();
        SubLObject var213 = (SubLObject)module0745.ZERO_INTEGER;
        SubLObject var214 = (SubLObject)module0745.ZERO_INTEGER;
        module0012.$g82$.setDynamicValue(Sequences.cconcatenate((SubLObject)module0745.$ic104$, new SubLObject[] { module0006.f207(var210), module0745.$ic105$ }), var212);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var212);
        module0012.$g83$.setDynamicValue(var210, var212);
        module0012.$g84$.setDynamicValue((SubLObject)module0745.ZERO_INTEGER, var212);
        SubLObject var215 = module0012.$g75$.currentBinding(var212);
        SubLObject var216 = module0012.$g76$.currentBinding(var212);
        SubLObject var217 = module0012.$g77$.currentBinding(var212);
        SubLObject var218 = module0012.$g78$.currentBinding(var212);
        try {
            module0012.$g75$.bind((SubLObject)module0745.ZERO_INTEGER, var212);
            module0012.$g76$.bind((SubLObject)module0745.NIL, var212);
            module0012.$g77$.bind((SubLObject)module0745.T, var212);
            module0012.$g78$.bind(Time.get_universal_time(), var212);
            module0012.f478(module0012.$g82$.getDynamicValue(var212));
            SubLObject var219;
            SubLObject var220;
            for (var219 = (SubLObject)module0745.NIL, var219 = (SubLObject)module0745.ZERO_INTEGER; var219.numL(module0012.$g83$.getDynamicValue(var212)); var219 = Numbers.add(var219, (SubLObject)module0745.ONE_INTEGER)) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var212), module0012.$g83$.getDynamicValue(var212));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var212), (SubLObject)module0745.ONE_INTEGER), var212);
                var220 = module0166.f10773((SubLObject)module0745.UNPROVIDED);
                if (module0745.NIL != f46258(var220)) {
                    var213 = Numbers.add(var213, (SubLObject)module0745.ONE_INTEGER);
                }
                else {
                    Errors.warn((SubLObject)module0745.$ic106$, var220, Values.arg2(var212.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f46259(var220, (SubLObject)module0745.UNPROVIDED, (SubLObject)module0745.UNPROVIDED))), Values.arg2(var212.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f46254(var220, (SubLObject)module0745.UNPROVIDED, (SubLObject)module0745.UNPROVIDED))));
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var218, var212);
            module0012.$g77$.rebind(var217, var212);
            module0012.$g76$.rebind(var216, var212);
            module0012.$g75$.rebind(var215, var212);
        }
        module0012.$g82$.setDynamicValue(Sequences.cconcatenate((SubLObject)module0745.$ic104$, new SubLObject[] { module0006.f207(var211), module0745.$ic107$ }), var212);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var212);
        module0012.$g83$.setDynamicValue(var211, var212);
        module0012.$g84$.setDynamicValue((SubLObject)module0745.ZERO_INTEGER, var212);
        var215 = module0012.$g75$.currentBinding(var212);
        var216 = module0012.$g76$.currentBinding(var212);
        var217 = module0012.$g77$.currentBinding(var212);
        var218 = module0012.$g78$.currentBinding(var212);
        try {
            module0012.$g75$.bind((SubLObject)module0745.ZERO_INTEGER, var212);
            module0012.$g76$.bind((SubLObject)module0745.NIL, var212);
            module0012.$g77$.bind((SubLObject)module0745.T, var212);
            module0012.$g78$.bind(Time.get_universal_time(), var212);
            module0012.f478(module0012.$g82$.getDynamicValue(var212));
            SubLObject var219;
            SubLObject var221;
            for (var219 = (SubLObject)module0745.NIL, var219 = (SubLObject)module0745.ZERO_INTEGER; var219.numL(module0012.$g83$.getDynamicValue(var212)); var219 = Numbers.add(var219, (SubLObject)module0745.ONE_INTEGER)) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var212), module0012.$g83$.getDynamicValue(var212));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var212), (SubLObject)module0745.ONE_INTEGER), var212);
                var221 = module0172.f10923((SubLObject)module0745.UNPROVIDED);
                if (module0745.NIL != f46258(var221)) {
                    var214 = Numbers.add(var214, (SubLObject)module0745.ONE_INTEGER);
                }
                else {
                    Errors.warn((SubLObject)module0745.$ic106$, var221, Values.arg2(var212.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f46259(var221, (SubLObject)module0745.UNPROVIDED, (SubLObject)module0745.UNPROVIDED))), Values.arg2(var212.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f46254(var221, (SubLObject)module0745.UNPROVIDED, (SubLObject)module0745.UNPROVIDED))));
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var218, var212);
            module0012.$g77$.rebind(var217, var212);
            module0012.$g76$.rebind(var216, var212);
            module0012.$g75$.rebind(var215, var212);
        }
        PrintLow.format((SubLObject)module0745.T, (SubLObject)module0745.$ic108$, new SubLObject[] { var213, var210, module0048.f3314(var213, var210, (SubLObject)module0745.THREE_INTEGER) });
        PrintLow.format((SubLObject)module0745.T, (SubLObject)module0745.$ic109$, new SubLObject[] { var214, var211, module0048.f3314(var214, var211, (SubLObject)module0745.THREE_INTEGER) });
        return (SubLObject)SubLObjectFactory.makeBoolean(var210.eql(var213) && var211.eql(var214));
    }
    
    public static SubLObject f46258(final SubLObject var47) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0745.NIL != f46253(var47) || Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f46254(var47, (SubLObject)module0745.UNPROVIDED, (SubLObject)module0745.UNPROVIDED))).equal(Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f46259(var47, (SubLObject)module0745.UNPROVIDED, (SubLObject)module0745.UNPROVIDED)))));
    }
    
    public static SubLObject f46239() {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        SubLObject var13 = (SubLObject)module0745.ONE_INTEGER;
        SubLObject var14 = (SubLObject)module0745.NIL;
        final SubLObject var15 = module0745.$g5951$.getDynamicValue(var12);
        final SubLObject var16 = module0069.f4939(Sequences.cconcatenate(var15, (SubLObject)module0745.$ic35$));
        final SubLObject var17 = module0069.f4939(Sequences.cconcatenate(var15, (SubLObject)module0745.$ic59$));
        SubLObject var18 = (SubLObject)module0745.NIL;
        while (module0745.NIL == var18) {
            var12.resetMultipleValues();
            final SubLObject var19 = f46244(var15, var13, var16, var17);
            final SubLObject var20 = var12.secondMultipleValue();
            var12.resetMultipleValues();
            final SubLObject var21 = (SubLObject)SubLObjectFactory.makeBoolean(module0745.NIL == Filesys.directory_p(var19));
            if (module0745.NIL != var21) {
                var14 = var19;
                PrintLow.format((SubLObject)module0745.T, (SubLObject)module0745.$ic110$, var19);
                var18 = (SubLObject)module0745.T;
            }
            else if (module0745.NIL == Filesys.probe_file(Sequences.cconcatenate(var19, (SubLObject)module0745.$ic81$))) {
                if (module0745.NIL != f46249((SubLObject)ConsesLow.list(var19))) {
                    PrintLow.format((SubLObject)module0745.T, (SubLObject)module0745.$ic111$, var19);
                    var14 = var19;
                    var18 = (SubLObject)module0745.T;
                }
            }
            if (module0745.NIL != var20) {
                var18 = (SubLObject)module0745.T;
            }
            if (module0745.NIL == var18) {
                var13 = Numbers.add(var13, var17);
            }
        }
        return Types.sublisp_null(var14);
    }
    
    public static SubLObject f46255(SubLObject var218) {
        if (var218 == module0745.UNPROVIDED) {
            var218 = (SubLObject)module0745.$ic112$;
        }
        final SubLThread var219 = SubLProcess.currentSubLThread();
        if (module0745.NIL != module0067.f4852(module0580.$g4358$.getDynamicValue(var219))) {
            SubLObject var220;
            for (var220 = module0066.f4838(module0067.f4891(module0580.$g4358$.getDynamicValue(var219))); module0745.NIL == module0066.f4841(var220); var220 = module0066.f4840(var220)) {
                var219.resetMultipleValues();
                final SubLObject var221 = module0066.f4839(var220);
                final SubLObject var222 = var219.secondMultipleValue();
                var219.resetMultipleValues();
                if (module0745.NIL != module0067.f4852(var222) && module0067.f4861(var222).numG(var218)) {
                    Errors.warn((SubLObject)module0745.$ic113$, var221);
                    module0067.f4881(var222);
                }
            }
            module0066.f4842(var220);
        }
        else if (module0745.NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var219))) {}
        return module0580.$g4358$.getDynamicValue(var219);
    }
    
    public static SubLObject f46256(final SubLObject var90, final SubLObject var91, final SubLObject var94, final SubLObject var95, final SubLObject var92, final SubLObject var34, final SubLObject var52) {
        final SubLThread var96 = SubLProcess.currentSubLThread();
        final SubLObject var97 = Numbers.integerDivide(var90, var91);
        final SubLObject var98 = Numbers.subtract(Time.get_universal_time(), var94);
        PrintLow.format(var52, (SubLObject)module0745.$ic114$, new SubLObject[] { var97, var91, module0051.f3574(var98, (SubLObject)module0745.ZERO_INTEGER) });
        final SubLObject var99 = Functions.apply(Symbols.symbol_function((SubLObject)module0745.$ic115$), var92);
        PrintLow.format(var52, (SubLObject)module0745.$ic116$, var99);
        module0745.$g5946$.setDynamicValue(module0035.f2083((SubLObject)ConsesLow.list(var97, var99), module0745.$g5946$.getDynamicValue(var96)), var96);
        final SubLObject var100 = module0048.f3387(var92, (SubLObject)module0745.UNPROVIDED, (SubLObject)module0745.UNPROVIDED);
        PrintLow.format(var52, (SubLObject)module0745.$ic117$, var100);
        module0745.$g5945$.setDynamicValue(module0035.f2083((SubLObject)ConsesLow.list(var97, var100), module0745.$g5945$.getDynamicValue(var96)), var96);
        SubLObject var101 = (SubLObject)module0745.NIL;
        if (module0745.NIL == var101) {
            SubLObject var102 = (SubLObject)module0745.NIL;
            var102 = (SubLObject)module0745.ONE_INTEGER;
            while (module0745.NIL == var101) {
                if (var91.numGE(Numbers.divide(Numbers.expt((SubLObject)module0745.TEN_INTEGER, var102), (SubLObject)module0745.TWO_INTEGER))) {
                    final SubLObject var103 = Numbers.subtract((SubLObject)module0745.ONE_INTEGER, Numbers.expt((SubLObject)module0745.TEN_INTEGER, Numbers.minus(var102)));
                    PrintLow.format(var52, (SubLObject)module0745.$ic118$, Numbers.multiply(var103, (SubLObject)module0745.$ic21$), module0048.f3389(var92, var103, (SubLObject)module0745.UNPROVIDED, (SubLObject)module0745.UNPROVIDED));
                }
                else {
                    var101 = (SubLObject)module0745.T;
                }
                var102 = module0048.f_1X(var102);
            }
        }
        final SubLObject var104 = module0176.f11129();
        PrintLow.format(var52, (SubLObject)module0745.$ic119$, module0051.f3574(var104, (SubLObject)module0745.UNPROVIDED));
        module0745.$g5948$.setDynamicValue(module0035.f2083((SubLObject)ConsesLow.list(var97, var104), module0745.$g5948$.getDynamicValue(var96)), var96);
        module0176.f11128();
        if (module0745.NIL != module0745.$g5944$.getDynamicValue(var96)) {
            f46260(var91, var34);
        }
        streams_high.force_output(var52);
        return (SubLObject)module0745.NIL;
    }
    
    public static SubLObject f46260(final SubLObject var91, final SubLObject var70) {
        final SubLThread var92 = SubLProcess.currentSubLThread();
        SubLObject var93 = (SubLObject)module0745.NIL;
        SubLObject var229_230 = (SubLObject)module0745.NIL;
        SubLObject var94 = (SubLObject)module0745.NIL;
        SubLObject var232_233 = (SubLObject)module0745.NIL;
        SubLObject var95 = (SubLObject)module0745.NIL;
        SubLObject var235_236 = (SubLObject)module0745.NIL;
        SubLObject var96 = (SubLObject)module0745.NIL;
        SubLObject var238_239 = (SubLObject)module0745.NIL;
        var93 = (SubLObject)ConsesLow.list(module0745.$g5946$.getDynamicValue(var92), module0745.$g5945$.getDynamicValue(var92), module0745.$g5947$.getDynamicValue(var92), module0745.$g5950$.getDynamicValue(var92), module0745.$g5948$.getDynamicValue(var92), module0745.$g5949$.getDynamicValue(var92));
        var229_230 = var93.first();
        var94 = (SubLObject)module0745.$ic120$;
        var232_233 = var94.first();
        var95 = (SubLObject)module0745.$ic121$;
        var235_236 = var95.first();
        var96 = (SubLObject)module0745.$ic122$;
        var238_239 = var96.first();
        while (module0745.NIL != var96 || module0745.NIL != var95 || module0745.NIL != var94 || module0745.NIL != var93) {
            if (module0745.NIL != module0035.f2002(var229_230, (SubLObject)module0745.ONE_INTEGER, (SubLObject)module0745.UNPROVIDED)) {
                final SubLObject var97 = PrintLow.format((SubLObject)module0745.NIL, var232_233, var91);
                final SubLObject var98 = Sequences.cconcatenate(var70, var235_236);
                module0548.f33818((SubLObject)ConsesLow.list(var229_230), (SubLObject)ConsesLow.list((SubLObject)module0745.$ic123$, (SubLObject)module0745.$ic124$, (SubLObject)module0745.$ic125$, var238_239, (SubLObject)module0745.$ic126$, var97, (SubLObject)module0745.$ic127$, var98));
                module0069.f4937(var229_230, Sequences.cconcatenate(var98, (SubLObject)module0745.$ic128$));
            }
            var93 = var93.rest();
            var229_230 = var93.first();
            var94 = var94.rest();
            var232_233 = var94.first();
            var95 = var95.rest();
            var235_236 = var95.first();
            var96 = var96.rest();
            var238_239 = var96.first();
        }
        return (SubLObject)module0745.NIL;
    }
    
    public static SubLObject f46241() {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        SubLObject var13 = (SubLObject)module0745.NIL;
        SubLObject var240_243 = (SubLObject)module0745.NIL;
        SubLObject var14 = (SubLObject)module0745.NIL;
        SubLObject var235_245 = (SubLObject)module0745.NIL;
        SubLObject var15 = (SubLObject)module0745.NIL;
        SubLObject var238_247 = (SubLObject)module0745.NIL;
        var13 = (SubLObject)module0745.$ic129$;
        var240_243 = var13.first();
        var14 = (SubLObject)module0745.$ic121$;
        var235_245 = var14.first();
        var15 = (SubLObject)module0745.$ic122$;
        var238_247 = var15.first();
        while (module0745.NIL != var15 || module0745.NIL != var14 || module0745.NIL != var13) {
            final SubLObject var16 = (SubLObject)module0745.NIL;
            final SubLObject var17 = module0745.$g5951$.getDynamicValue(var12);
            SubLObject var18 = (SubLObject)module0745.NIL;
            assert module0745.NIL != Filesys.directory_p(var17) : var17;
            SubLObject var19 = Filesys.directory(var17, (SubLObject)module0745.T);
            final SubLObject var20 = var16;
            final SubLObject var21 = module0012.$silent_progressP$.currentBinding(var12);
            try {
                module0012.$silent_progressP$.bind((SubLObject)SubLObjectFactory.makeBoolean(!var20.isString()), var12);
                if (module0745.NIL.isFunctionSpec()) {
                    var19 = Sort.sort(var19, (SubLObject)module0745.NIL, (SubLObject)module0745.UNPROVIDED);
                }
                final SubLObject var22 = var19;
                module0012.$g82$.setDynamicValue(var20, var12);
                module0012.$g73$.setDynamicValue(Time.get_universal_time(), var12);
                module0012.$g83$.setDynamicValue(Sequences.length(var22), var12);
                module0012.$g84$.setDynamicValue((SubLObject)module0745.ZERO_INTEGER, var12);
                final SubLObject var17_249 = module0012.$g75$.currentBinding(var12);
                final SubLObject var23 = module0012.$g76$.currentBinding(var12);
                final SubLObject var24 = module0012.$g77$.currentBinding(var12);
                final SubLObject var25 = module0012.$g78$.currentBinding(var12);
                try {
                    module0012.$g75$.bind((SubLObject)module0745.ZERO_INTEGER, var12);
                    module0012.$g76$.bind((SubLObject)module0745.NIL, var12);
                    module0012.$g77$.bind((SubLObject)module0745.T, var12);
                    module0012.$g78$.bind(Time.get_universal_time(), var12);
                    module0012.f478(module0012.$g82$.getDynamicValue(var12));
                    SubLObject var26 = var22;
                    SubLObject var27 = (SubLObject)module0745.NIL;
                    var27 = var26.first();
                    while (module0745.NIL != var26) {
                        module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var12), module0012.$g83$.getDynamicValue(var12));
                        module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var12), (SubLObject)module0745.ONE_INTEGER), var12);
                        if (module0745.NIL != Filesys.directory_p(var27) && module0745.NIL != Filesys.probe_file(Sequences.cconcatenate(var27, new SubLObject[] { module0745.$ic19$, var235_245, module0745.$ic128$ }))) {
                            final SubLObject var28 = module0069.f4939(Sequences.cconcatenate(var27, new SubLObject[] { module0745.$ic19$, var235_245, module0745.$ic128$ }));
                            var18 = ConsesLow.append(var28, var18);
                        }
                        var26 = var26.rest();
                        var27 = var26.first();
                    }
                    module0012.f479();
                }
                finally {
                    module0012.$g78$.rebind(var25, var12);
                    module0012.$g77$.rebind(var24, var12);
                    module0012.$g76$.rebind(var23, var12);
                    module0012.$g75$.rebind(var17_249, var12);
                }
            }
            finally {
                module0012.$silent_progressP$.rebind(var21, var12);
            }
            var18 = Sort.sort(var18, Symbols.symbol_function((SubLObject)module0745.$ic130$), Symbols.symbol_function((SubLObject)module0745.$ic131$));
            final SubLObject var29 = Sequences.cconcatenate(var17, var235_245);
            module0548.f33818((SubLObject)ConsesLow.list(var18), (SubLObject)ConsesLow.list((SubLObject)module0745.$ic123$, (SubLObject)module0745.$ic124$, (SubLObject)module0745.$ic125$, var238_247, (SubLObject)module0745.$ic126$, var240_243, (SubLObject)module0745.$ic127$, var29));
            module0069.f4937(var18, Sequences.cconcatenate(var29, (SubLObject)module0745.$ic128$));
            var13 = var13.rest();
            var240_243 = var13.first();
            var14 = var14.rest();
            var235_245 = var14.first();
            var15 = var15.rest();
            var238_247 = var15.first();
        }
        return (SubLObject)module0745.NIL;
    }
    
    public static SubLObject f46261() {
        return module0745.$g5960$.getGlobalValue();
    }
    
    public static SubLObject f46254(final SubLObject var47, SubLObject var23, SubLObject var24) {
        if (var23 == module0745.UNPROVIDED) {
            var23 = f46234();
        }
        if (var24 == module0745.UNPROVIDED) {
            var24 = module0745.$g5940$.getDynamicValue();
        }
        final SubLThread var48 = SubLProcess.currentSubLThread();
        SubLObject var49 = (SubLObject)module0745.NIL;
        SubLObject var50 = (SubLObject)module0745.NIL;
        SubLObject var51 = (SubLObject)module0745.NIL;
        SubLObject var52 = (SubLObject)module0745.NIL;
        final SubLObject var53 = module0745.$g5933$.currentBinding(var48);
        final SubLObject var54 = module0579.$g4246$.currentBinding(var48);
        final SubLObject var55 = module0579.$g4322$.currentBinding(var48);
        try {
            module0745.$g5933$.bind((SubLObject)module0745.NIL, var48);
            module0579.$g4246$.bind((SubLObject)module0745.$ic133$, var48);
            module0579.$g4322$.bind((SubLObject)module0745.NIL, var48);
            SubLObject var56 = (SubLObject)module0745.NIL;
            var48.resetMultipleValues();
            final SubLObject var252_253 = module0770.f49050(var47, var24, (SubLObject)module0745.NIL, var23, module0745.$ic134$, (SubLObject)module0745.$ic135$, (SubLObject)module0745.UNPROVIDED, (SubLObject)module0745.UNPROVIDED);
            final SubLObject var254_255 = var48.secondMultipleValue();
            final SubLObject var256_257 = var48.thirdMultipleValue();
            final SubLObject var258_259 = var48.fourthMultipleValue();
            final SubLObject var260_261 = var48.fifthMultipleValue();
            var48.resetMultipleValues();
            var49 = var252_253;
            var50 = var254_255;
            var51 = var256_257;
            var56 = var258_259;
            var52 = var260_261;
        }
        finally {
            module0579.$g4322$.rebind(var55, var48);
            module0579.$g4246$.rebind(var54, var48);
            module0745.$g5933$.rebind(var53, var48);
        }
        return Values.values(var49, var50, var52, var51);
    }
    
    public static SubLObject f46262(final SubLObject var47) {
        SubLObject var48 = (SubLObject)module0745.NIL;
        final SubLObject var49 = (SubLObject)module0745.NIL;
        if (module0745.NIL == f46253(var47)) {
            final SubLObject var50 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f46259(var47, (SubLObject)module0745.UNPROVIDED, (SubLObject)module0745.UNPROVIDED)));
            if (module0745.NIL != module0209.f13550(var50.first())) {
                final SubLObject var51 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f46254(var47, (SubLObject)module0745.UNPROVIDED, (SubLObject)module0745.UNPROVIDED)));
                if (!module0035.f2124((SubLObject)module0745.THREE_INTEGER, var51).equal(module0035.f2124((SubLObject)module0745.THREE_INTEGER, var50)) || (module0745.NIL != var49 && module0745.NIL == module0035.f2201(module0035.f2114(var51), module0035.f2114(var50), Symbols.symbol_function((SubLObject)module0745.EQUAL)))) {
                    Errors.warn((SubLObject)module0745.$ic136$, var47, var50, var51);
                    var48 = (SubLObject)module0745.T;
                }
            }
        }
        return var48;
    }
    
    public static SubLObject f46263(SubLObject var266, SubLObject var267, SubLObject var268) {
        if (var266 == module0745.UNPROVIDED) {
            var266 = (SubLObject)module0745.$ic21$;
        }
        if (var267 == module0745.UNPROVIDED) {
            var267 = (SubLObject)module0745.$ic137$;
        }
        if (var268 == module0745.UNPROVIDED) {
            var268 = Numbers.multiply((SubLObject)module0745.TWO_INTEGER, var266);
        }
        PrintLow.format((SubLObject)module0745.T, (SubLObject)module0745.$ic138$, new SubLObject[] { module0236.f15560(module0745.$g5931$.getGlobalValue()), module0236.f15561(module0745.$g5931$.getGlobalValue()), module0574.f35164(), module0018.f968() });
        final SubLObject var269 = module0077.f5313((SubLObject)module0745.UNPROVIDED, (SubLObject)module0745.UNPROVIDED);
        SubLObject var270 = (SubLObject)module0745.ZERO_INTEGER;
        SubLObject var271 = (SubLObject)module0745.NIL;
        SubLObject var272 = (SubLObject)module0745.ZERO_INTEGER;
        SubLObject var273 = (SubLObject)module0745.NIL;
        SubLObject var274 = (SubLObject)module0745.NIL;
        final SubLObject var275 = Numbers.ceiling(Numbers.minus(Numbers.log(var267, (SubLObject)module0745.TEN_INTEGER)), (SubLObject)module0745.UNPROVIDED);
        SubLObject var276 = var266;
        while (!var276.isZero()) {
            final SubLObject var277 = module0173.f10963();
            if (module0745.NIL == module0077.f5320(var277, var269)) {
                if (module0745.NIL != f46262(var277)) {
                    var271 = (SubLObject)ConsesLow.cons(var277, var271);
                    var272 = Numbers.add(var272, (SubLObject)module0745.ONE_INTEGER);
                }
                if (var270.numGE(Numbers.subtract(var268, var266))) {
                    final SubLObject var278 = Numbers.divide(var272, var270);
                    if (Numbers.mod(var270, Numbers.integerDivide(var268, (SubLObject)module0745.TEN_INTEGER)).isZero()) {
                        PrintLow.format((SubLObject)module0745.T, (SubLObject)module0745.$ic139$, var270, module0048.f3314(var278, (SubLObject)module0745.ONE_INTEGER, (SubLObject)module0745.FOUR_INTEGER));
                    }
                    if (module0745.NIL == var273 || var278.numL(var273)) {
                        var273 = var278;
                    }
                    if (module0745.NIL == var274 || var278.numG(var274)) {
                        var274 = var278;
                    }
                    if (Numbers.subtract(var274, var273).numG(var267)) {
                        Errors.warn((SubLObject)module0745.$ic140$, new SubLObject[] { var270, module0048.f3302(Numbers.subtract(var274, var273), var275), var267, var266 });
                        var276 = var266;
                        var273 = (SubLObject)module0745.NIL;
                        var274 = (SubLObject)module0745.NIL;
                    }
                    else {
                        var276 = Numbers.subtract(var276, (SubLObject)module0745.ONE_INTEGER);
                    }
                }
                module0077.f5326(var277, var269);
                var270 = Numbers.add(var270, (SubLObject)module0745.ONE_INTEGER);
            }
        }
        final SubLObject var279 = print_high.princ_to_string(var275);
        final SubLObject var280 = Sequences.cconcatenate((SubLObject)module0745.$ic141$, new SubLObject[] { var279, module0745.$ic142$, var279, module0745.$ic143$ });
        PrintLow.format((SubLObject)module0745.T, var280, new SubLObject[] { var270, module0048.f3314(var273, (SubLObject)module0745.UNPROVIDED, (SubLObject)module0745.UNPROVIDED), module0048.f3314(var274, (SubLObject)module0745.UNPROVIDED, (SubLObject)module0745.UNPROVIDED) });
        return Values.values(var273, var274, var270);
    }
    
    public static SubLObject f46264(SubLObject var278) {
        if (var278 == module0745.UNPROVIDED) {
            var278 = module0745.$g5931$.getGlobalValue();
        }
        final SubLThread var279 = SubLProcess.currentSubLThread();
        assert module0745.NIL != module0236.f15526(var278) : var278;
        SubLObject var280 = (SubLObject)module0745.NIL;
        final SubLObject var281 = (SubLObject)module0745.$ic145$;
        final SubLObject var282 = module0173.f10962();
        SubLObject var283 = (SubLObject)module0745.ZERO_INTEGER;
        final SubLObject var284 = module0012.$g75$.currentBinding(var279);
        final SubLObject var285 = module0012.$g76$.currentBinding(var279);
        final SubLObject var286 = module0012.$g77$.currentBinding(var279);
        final SubLObject var287 = module0012.$g78$.currentBinding(var279);
        try {
            module0012.$g75$.bind((SubLObject)module0745.ZERO_INTEGER, var279);
            module0012.$g76$.bind((SubLObject)module0745.NIL, var279);
            module0012.$g77$.bind((SubLObject)module0745.T, var279);
            module0012.$g78$.bind(Time.get_universal_time(), var279);
            module0012.f478(var281);
            SubLObject var288 = module0173.f10961();
            SubLObject var289 = (SubLObject)module0745.NIL;
            var289 = var288.first();
            while (module0745.NIL != var288) {
                final SubLObject var290 = var289;
                if (module0745.NIL == module0065.f4772(var290, (SubLObject)module0745.$ic94$)) {
                    final SubLObject var132_281 = var290;
                    if (module0745.NIL == module0065.f4775(var132_281, (SubLObject)module0745.$ic94$)) {
                        final SubLObject var291 = module0065.f4740(var132_281);
                        final SubLObject var292 = (SubLObject)module0745.NIL;
                        SubLObject var293;
                        SubLObject var294;
                        SubLObject var295;
                        SubLObject var296;
                        SubLObject var297;
                        for (var293 = Sequences.length(var291), var294 = (SubLObject)module0745.NIL, var294 = (SubLObject)module0745.ZERO_INTEGER; var294.numL(var293); var294 = Numbers.add(var294, (SubLObject)module0745.ONE_INTEGER)) {
                            var295 = ((module0745.NIL != var292) ? Numbers.subtract(var293, var294, (SubLObject)module0745.ONE_INTEGER) : var294);
                            var296 = Vectors.aref(var291, var295);
                            if (module0745.NIL == module0065.f4749(var296) || module0745.NIL == module0065.f4773((SubLObject)module0745.$ic94$)) {
                                if (module0745.NIL != module0065.f4749(var296)) {
                                    var296 = (SubLObject)module0745.$ic94$;
                                }
                                var283 = Numbers.add(var283, (SubLObject)module0745.ONE_INTEGER);
                                module0012.note_percent_progress(var283, var282);
                                var297 = module0236.f15558(var296, var278, (SubLObject)module0745.$ic146$, (SubLObject)module0745.UNPROVIDED);
                                if (var297 == module0745.$ic146$ && module0745.NIL == f46253(var296)) {
                                    var280 = (SubLObject)ConsesLow.cons(var296, var280);
                                }
                            }
                        }
                    }
                    final SubLObject var178_284 = var290;
                    if (module0745.NIL == module0065.f4777(var178_284) || module0745.NIL == module0065.f4773((SubLObject)module0745.$ic94$)) {
                        final SubLObject var298 = module0065.f4738(var178_284);
                        SubLObject var299 = module0065.f4739(var178_284);
                        final SubLObject var300 = module0065.f4734(var178_284);
                        final SubLObject var301 = (SubLObject)((module0745.NIL != module0065.f4773((SubLObject)module0745.$ic94$)) ? module0745.NIL : module0745.$ic94$);
                        while (var299.numL(var300)) {
                            final SubLObject var302 = Hashtables.gethash_without_values(var299, var298, var301);
                            if (module0745.NIL == module0065.f4773((SubLObject)module0745.$ic94$) || module0745.NIL == module0065.f4749(var302)) {
                                var283 = Numbers.add(var283, (SubLObject)module0745.ONE_INTEGER);
                                module0012.note_percent_progress(var283, var282);
                                final SubLObject var303 = module0236.f15558(var302, var278, (SubLObject)module0745.$ic146$, (SubLObject)module0745.UNPROVIDED);
                                if (var303 == module0745.$ic146$ && module0745.NIL == f46253(var302)) {
                                    var280 = (SubLObject)ConsesLow.cons(var302, var280);
                                }
                            }
                            var299 = Numbers.add(var299, (SubLObject)module0745.ONE_INTEGER);
                        }
                    }
                }
                var288 = var288.rest();
                var289 = var288.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var287, var279);
            module0012.$g77$.rebind(var286, var279);
            module0012.$g76$.rebind(var285, var279);
            module0012.$g75$.rebind(var284, var279);
        }
        return var280;
    }
    
    public static SubLObject f46265(final SubLObject var285, SubLObject var23, SubLObject var24) {
        if (var23 == module0745.UNPROVIDED) {
            var23 = module0745.$ic147$;
        }
        if (var24 == module0745.UNPROVIDED) {
            var24 = (SubLObject)module0745.$ic24$;
        }
        final SubLThread var286 = SubLProcess.currentSubLThread();
        final SubLObject var287 = module0093.f6610(var285, Symbols.symbol_function((SubLObject)module0745.EQUAL), (SubLObject)module0745.$ic22$);
        final SubLObject var288 = module0236.f15548(var285, module0745.$g5937$.getGlobalValue(), (SubLObject)module0745.T, (SubLObject)module0745.$ic21$, Symbols.symbol_function((SubLObject)module0745.EQUAL), (SubLObject)module0745.$ic22$);
        final SubLObject var290;
        final SubLObject var289 = var290 = f46264(var288);
        module0012.$g82$.setDynamicValue((SubLObject)module0745.$ic148$, var286);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var286);
        module0012.$g83$.setDynamicValue(Sequences.length(var290), var286);
        module0012.$g84$.setDynamicValue((SubLObject)module0745.ZERO_INTEGER, var286);
        final SubLObject var291 = module0012.$g75$.currentBinding(var286);
        final SubLObject var292 = module0012.$g76$.currentBinding(var286);
        final SubLObject var293 = module0012.$g77$.currentBinding(var286);
        final SubLObject var294 = module0012.$g78$.currentBinding(var286);
        try {
            module0012.$g75$.bind((SubLObject)module0745.ZERO_INTEGER, var286);
            module0012.$g76$.bind((SubLObject)module0745.NIL, var286);
            module0012.$g77$.bind((SubLObject)module0745.T, var286);
            module0012.$g78$.bind(Time.get_universal_time(), var286);
            module0012.f478(module0012.$g82$.getDynamicValue(var286));
            SubLObject var295 = var290;
            SubLObject var296 = (SubLObject)module0745.NIL;
            var296 = var295.first();
            while (module0745.NIL != var295) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var286), module0012.$g83$.getDynamicValue(var286));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var286), (SubLObject)module0745.ONE_INTEGER), var286);
                if (module0745.NIL == f46253(var296)) {
                    final SubLObject var297 = (SubLObject)module0745.$ic27$;
                    SubLObject var298 = (SubLObject)module0745.NIL;
                    SubLObject var299 = (SubLObject)module0745.NIL;
                    SubLObject var300 = (SubLObject)module0745.NIL;
                    final SubLObject var301 = module0003.f61();
                    try {
                        var286.throwStack.push(var301);
                        final SubLObject var17_287 = module0003.$g4$.currentBinding(var286);
                        try {
                            module0003.$g4$.bind((SubLObject)module0745.T, var286);
                            SubLObject var302 = (SubLObject)module0745.NIL;
                            try {
                                final SubLObject var17_288 = module0003.$g5$.currentBinding(var286);
                                try {
                                    module0003.$g5$.bind(Numbers.add((SubLObject)module0745.ONE_INTEGER, module0003.$g5$.getDynamicValue(var286)), var286);
                                    var302 = module0003.f62(var297, var301);
                                    var286.resetMultipleValues();
                                    final SubLObject var289_290 = module0770.f49049(var296, var24, (SubLObject)module0745.NIL, var23, module0745.$ic134$, (SubLObject)module0745.UNPROVIDED, (SubLObject)module0745.UNPROVIDED, (SubLObject)module0745.UNPROVIDED);
                                    final SubLObject var291_292 = var286.secondMultipleValue();
                                    var286.resetMultipleValues();
                                    var299 = var289_290;
                                    var300 = var291_292;
                                }
                                finally {
                                    module0003.$g5$.rebind(var17_288, var286);
                                }
                            }
                            finally {
                                final SubLObject var17_289 = Threads.$is_thread_performing_cleanupP$.currentBinding(var286);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0745.T, var286);
                                    module0003.f64(var302);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var17_289, var286);
                                }
                            }
                        }
                        finally {
                            module0003.$g4$.rebind(var17_287, var286);
                        }
                    }
                    catch (Throwable var303) {
                        var298 = Errors.handleThrowable(var303, var301);
                    }
                    finally {
                        var286.throwStack.pop();
                    }
                    if (module0745.NIL != var298) {
                        Errors.warn((SubLObject)module0745.$ic149$, var297, var296);
                    }
                    else if (module0745.NIL != module0038.f2653(var299)) {
                        module0093.f6618(var296, var287, (SubLObject)ConsesLow.cons(var299, var300));
                    }
                    else if (module0745.NIL != module0038.f2608(var299)) {
                        Errors.warn((SubLObject)module0745.$ic101$, var296);
                    }
                }
                var295 = var295.rest();
                var296 = var295.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var294, var286);
            module0012.$g77$.rebind(var293, var286);
            module0012.$g76$.rebind(var292, var286);
            module0012.$g75$.rebind(var291, var286);
        }
        module0093.f6615(var287);
        return var285;
    }
    
    public static SubLObject f46266(final SubLObject var215) {
        return Numbers.integerDivide(module0217.f14257(module0205.f13276(var215)), module0217.f14221(var215, (SubLObject)module0745.UNPROVIDED, (SubLObject)module0745.UNPROVIDED, (SubLObject)module0745.UNPROVIDED));
    }
    
    public static SubLObject f46253(final SubLObject var47) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0745.NIL != module0210.f13578(var47) || module0745.NIL != module0259.f16891(var47, module0745.$ic150$) || (module0745.NIL != module0167.f10813(var47) && (module0745.NIL != module0210.f13585(var47) || module0745.NIL != f46267(var47))));
    }
    
    public static SubLObject f46267(final SubLObject var215) {
        final SubLThread var216 = SubLProcess.currentSubLThread();
        SubLObject var217 = (SubLObject)module0745.NIL;
        final SubLObject var218 = module0147.$g2094$.currentBinding(var216);
        final SubLObject var219 = module0147.$g2095$.currentBinding(var216);
        try {
            module0147.$g2094$.bind((SubLObject)module0745.$ic151$, var216);
            module0147.$g2095$.bind(module0745.$ic152$, var216);
            var217 = module0274.f18171(module0172.f10920(var215), (SubLObject)module0745.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var219, var216);
            module0147.$g2094$.rebind(var218, var216);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0745.NIL == var217);
    }
    
    public static SubLObject f46259(final SubLObject var47, SubLObject var278, SubLObject var295) {
        if (var278 == module0745.UNPROVIDED) {
            var278 = module0745.$g5931$.getGlobalValue();
        }
        if (var295 == module0745.UNPROVIDED) {
            var295 = (SubLObject)module0745.NIL;
        }
        final SubLThread var296 = SubLProcess.currentSubLThread();
        SubLObject var297 = (SubLObject)module0745.NIL;
        SubLObject var298 = (SubLObject)module0745.NIL;
        if (module0745.NIL == f46268(var47) && module0745.NIL != module0745.$g5933$.getDynamicValue(var296)) {
            try {
                var296.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var299 = Errors.$error_handler$.currentBinding(var296);
                try {
                    Errors.$error_handler$.bind((SubLObject)module0745.$ic153$, var296);
                    try {
                        assert module0745.NIL != module0173.f10955(var47) : var47;
                        if (var278.eql(module0745.$g5931$.getGlobalValue()) && module0745.NIL == module0236.f15526(var278)) {
                            f46226();
                            var278 = module0745.$g5931$.getGlobalValue();
                        }
                        assert module0745.NIL != module0236.f15526(var278) : var278;
                    }
                    catch (Throwable var300) {
                        Errors.handleThrowable(var300, (SubLObject)module0745.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var299, var296);
                }
            }
            catch (Throwable var301) {
                var297 = Errors.handleThrowable(var301, module0003.$g3$.getGlobalValue());
            }
            finally {
                var296.throwStack.pop();
            }
            if (module0745.NIL != var297) {
                if (module0745.NIL != var295) {
                    Errors.warn(var297);
                }
                return Values.values((SubLObject)module0745.NIL, (SubLObject)module0745.NIL);
            }
            try {
                var296.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var299 = Errors.$error_handler$.currentBinding(var296);
                try {
                    Errors.$error_handler$.bind((SubLObject)module0745.$ic153$, var296);
                    try {
                        var298 = module0236.f15558(var47, var278, var298, (SubLObject)module0745.T);
                    }
                    catch (Throwable var300) {
                        Errors.handleThrowable(var300, (SubLObject)module0745.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var299, var296);
                }
            }
            catch (Throwable var301) {
                var297 = Errors.handleThrowable(var301, module0003.$g3$.getGlobalValue());
            }
            finally {
                var296.throwStack.pop();
            }
            if (module0745.NIL != var297 && module0745.NIL != var295) {
                Errors.warn(var297);
            }
        }
        if (module0745.NIL != module0035.f2014(var298) && module0745.NIL != module0035.f1995(var298, (SubLObject)module0745.FOUR_INTEGER, (SubLObject)module0745.UNPROVIDED) && module0745.NIL != module0209.f13550(var298.first()) && module0745.NIL == module0209.f13557((SubLObject)module0745.$ic93$, var298.first())) {
            return module0004.values_list(var298);
        }
        if (var298.isCons() && module0745.NIL != module0209.f13550(var298.first()) && module0745.NIL == module0209.f13557((SubLObject)module0745.$ic93$, var298.first())) {
            return Values.values(var298.first(), var298.rest(), (SubLObject)module0745.NIL, (SubLObject)module0745.NIL);
        }
        return Values.values((SubLObject)module0745.NIL, (SubLObject)module0745.NIL, (SubLObject)module0745.NIL, (SubLObject)module0745.NIL);
    }
    
    public static SubLObject f46269(final SubLObject var47, final SubLObject var298, final SubLObject var299, SubLObject var151, SubLObject var300) {
        if (var151 == module0745.UNPROVIDED) {
            var151 = (SubLObject)module0745.NIL;
        }
        if (var300 == module0745.UNPROVIDED) {
            var300 = (SubLObject)module0745.NIL;
        }
        final SubLThread var301 = SubLProcess.currentSubLThread();
        assert module0745.NIL != module0173.f10955(var47) : var47;
        assert module0745.NIL != module0209.f13550(var298) : var298;
        if (module0745.NIL != var299 && !module0745.areAssertionsDisabledFor(me) && module0745.NIL == module0173.f10955(var299)) {
            throw new AssertionError(var299);
        }
        if (module0745.NIL == module0745.$g5931$.getGlobalValue()) {
            SubLObject var302 = (SubLObject)module0745.NIL;
            try {
                var301.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var303 = Errors.$error_handler$.currentBinding(var301);
                try {
                    Errors.$error_handler$.bind((SubLObject)module0745.$ic153$, var301);
                    try {
                        f46226();
                    }
                    catch (Throwable var304) {
                        Errors.handleThrowable(var304, (SubLObject)module0745.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var303, var301);
                }
            }
            catch (Throwable var305) {
                var302 = Errors.handleThrowable(var305, module0003.$g3$.getGlobalValue());
            }
            finally {
                var301.throwStack.pop();
            }
            if (module0745.NIL != var302) {
                return Values.values((SubLObject)module0745.NIL, (SubLObject)module0745.NIL);
            }
        }
        return f46270(var47, var298, var299, var151, var300, module0745.$g5931$.getGlobalValue());
    }
    
    public static SubLObject f46271(final SubLObject var47) {
        module0077.f5326(var47, module0745.$g5962$.getGlobalValue());
        return var47;
    }
    
    public static SubLObject f46268(final SubLObject var47) {
        return module0077.f5320(var47, module0745.$g5962$.getGlobalValue());
    }
    
    public static SubLObject f46230() {
        return module0077.f5328(module0745.$g5962$.getGlobalValue());
    }
    
    public static SubLObject f46272(final SubLObject var47) {
        final SubLThread var48 = SubLProcess.currentSubLThread();
        assert module0745.NIL != module0173.f10955(var47) : var47;
        SubLObject var49 = module0745.$g5931$.getGlobalValue();
        if (module0745.NIL == module0745.$g5931$.getGlobalValue()) {
            SubLObject var50 = (SubLObject)module0745.NIL;
            try {
                var48.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var51 = Errors.$error_handler$.currentBinding(var48);
                try {
                    Errors.$error_handler$.bind((SubLObject)module0745.$ic153$, var48);
                    try {
                        f46226();
                        var49 = module0745.$g5931$.getGlobalValue();
                    }
                    catch (Throwable var52) {
                        Errors.handleThrowable(var52, (SubLObject)module0745.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var51, var48);
                }
            }
            catch (Throwable var53) {
                var50 = Errors.handleThrowable(var53, module0003.$g3$.getGlobalValue());
            }
            finally {
                var48.throwStack.pop();
            }
            if (module0745.NIL != var50) {
                return Values.values((SubLObject)module0745.NIL, (SubLObject)module0745.NIL);
            }
        }
        f46271(var47);
        return f46270(var47, (SubLObject)module0745.NIL, (SubLObject)module0745.NIL, (SubLObject)module0745.NIL, (SubLObject)module0745.NIL, var49);
    }
    
    public static SubLObject f46270(final SubLObject var47, final SubLObject var298, final SubLObject var299, final SubLObject var151, final SubLObject var300, final SubLObject var278) {
        final SubLThread var301 = SubLProcess.currentSubLThread();
        final SubLObject var302 = (SubLObject)((module0745.NIL != module0745.$g5956$.getDynamicValue(var301)) ? ConsesLow.list(var298, var299, var151, var300) : ConsesLow.cons(var298, var299));
        return module0236.f15559(var47, var302, var278);
    }
    
    public static SubLObject f46273() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0745", "f46215", "S#50518");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46216", "S#50519", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46217", "S#50520", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46219", "S#50521", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46220", "S#50522", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46222", "S#50523", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46221", "S#50524", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46223", "S#39325", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46224", "S#39326", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46225", "S#39324", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46226", "S#50525", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46218", "S#38526", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46227", "S#50526", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46228", "S#50527", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46229", "S#50528", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46231", "S#50529", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46232", "S#50530", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46233", "S#50531", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46234", "S#50532", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46235", "S#50533", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46236", "S#50534", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46237", "S#50535", 0, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46242", "S#50536", 0, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46243", "CREATE-FILTERED-NL-GENERATION-FHT-FROM-DATA", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46238", "S#50537", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46244", "S#50538", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46240", "S#50539", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46248", "S#50540", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46249", "S#50541", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46247", "S#50542", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46246", "S#50543", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46250", "S#50544", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46245", "S#50545", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46251", "S#50546", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46252", "S#50547", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46257", "S#50548", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46258", "S#50549", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46239", "S#50550", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46255", "S#50551", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46256", "S#50552", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46260", "S#50553", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46241", "S#50554", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46261", "S#50555", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46254", "S#50556", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46262", "S#50557", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46263", "S#50558", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46264", "S#50559", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46265", "S#50560", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46266", "S#50561", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46253", "S#50562", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46267", "S#50563", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46259", "S#50564", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46269", "S#50565", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46271", "S#50566", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46268", "S#50567", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46230", "S#50568", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46272", "S#37021", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0745", "f46270", "S#50569", 6, 0, false);
        return (SubLObject)module0745.NIL;
    }
    
    public static SubLObject f46274() {
        module0745.$g5931$ = SubLFiles.deflexical("S#50570", (SubLObject)((module0745.NIL != Symbols.boundp((SubLObject)module0745.$ic0$)) ? module0745.$g5931$.getGlobalValue() : module0745.NIL));
        module0745.$g5932$ = SubLFiles.defparameter("S#50571", (SubLObject)module0745.NIL);
        module0745.$g5933$ = SubLFiles.defparameter("S#50572", (SubLObject)module0745.T);
        module0745.$g5934$ = SubLFiles.deflexical("S#50573", module0073.f5143((SubLObject)(module0745.$ic1$.isSymbol() ? Symbols.symbol_value((SubLObject)module0745.$ic1$) : module0745.$ic1$), (SubLObject)module0745.$ic2$, (SubLObject)(module0745.$ic3$.isSymbol() ? Symbols.symbol_value((SubLObject)module0745.$ic3$) : module0745.$ic3$), (SubLObject)module0745.$ic4$, (SubLObject)module0745.UNPROVIDED));
        module0745.$g5935$ = SubLFiles.deflexical("S#50574", Locks.make_lock((SubLObject)module0745.$ic5$));
        module0745.$g5936$ = SubLFiles.deflexical("S#50575", (SubLObject)module0745.FIVE_INTEGER);
        module0745.$g5937$ = SubLFiles.deflexical("S#50576", (SubLObject)module0745.NIL);
        module0745.$g5938$ = SubLFiles.deflexical("S#50577", module0051.f3556((SubLObject)module0745.UNPROVIDED, (SubLObject)module0745.UNPROVIDED));
        module0745.$g5939$ = SubLFiles.defparameter("S#50578", (SubLObject)module0745.$ic26$);
        module0745.$g5940$ = SubLFiles.defparameter("S#50579", (SubLObject)module0745.$ic24$);
        module0745.$g5941$ = SubLFiles.defparameter("S#50580", (SubLObject)module0745.NIL);
        module0745.$g5942$ = SubLFiles.defparameter("S#50581", (SubLObject)module0745.T);
        module0745.$g5943$ = SubLFiles.defparameter("S#50582", (SubLObject)module0745.$ic27$);
        module0745.$g5944$ = SubLFiles.defparameter("S#50583", (SubLObject)module0745.NIL);
        module0745.$g5945$ = SubLFiles.defparameter("S#50584", (SubLObject)module0745.NIL);
        module0745.$g5946$ = SubLFiles.defparameter("S#50585", (SubLObject)module0745.NIL);
        module0745.$g5947$ = SubLFiles.defparameter("S#50586", (SubLObject)module0745.NIL);
        module0745.$g5948$ = SubLFiles.defparameter("S#50587", (SubLObject)module0745.NIL);
        module0745.$g5949$ = SubLFiles.defparameter("S#50588", (SubLObject)module0745.NIL);
        module0745.$g5950$ = SubLFiles.defparameter("S#50589", (SubLObject)module0745.NIL);
        module0745.$g5951$ = SubLFiles.defparameter("S#50590", (SubLObject)module0745.NIL);
        module0745.$g5952$ = SubLFiles.deflexical("S#50591", (SubLObject)module0745.$ic21$);
        module0745.$g5953$ = SubLFiles.deflexical("S#50592", (SubLObject)module0745.$ic28$);
        module0745.$g5954$ = SubLFiles.defparameter("S#50593", (SubLObject)module0745.NIL);
        module0745.$g5955$ = SubLFiles.deflexical("S#50594", module0059.f4283((SubLObject)module0745.$ic29$));
        module0745.$g5956$ = SubLFiles.defparameter("S#50595", (SubLObject)module0745.T);
        module0745.$g5957$ = SubLFiles.defparameter("S#50596", (SubLObject)module0745.NIL);
        module0745.$g5958$ = SubLFiles.deflexical("S#50597", module0077.f5313(Symbols.symbol_function((SubLObject)module0745.EQUAL), (SubLObject)module0745.UNPROVIDED));
        module0745.$g5959$ = SubLFiles.defparameter("S#50598", (SubLObject)module0745.NIL);
        module0745.$g5960$ = SubLFiles.defconstant("S#50599", (SubLObject)module0745.$ic132$);
        module0745.$g5961$ = SubLFiles.defparameter("S#50600", module0048.f3326());
        module0745.$g5962$ = SubLFiles.deflexical("S#50601", (module0745.NIL != Symbols.boundp((SubLObject)module0745.$ic156$)) ? module0745.$g5962$.getGlobalValue() : module0077.f5313(Symbols.symbol_function((SubLObject)module0745.EQL), (SubLObject)module0745.UNPROVIDED));
        return (SubLObject)module0745.NIL;
    }
    
    public static SubLObject f46275() {
        module0003.f57((SubLObject)module0745.$ic0$);
        module0002.f50((SubLObject)module0745.$ic17$, (SubLObject)module0745.$ic18$);
        module0002.f50((SubLObject)module0745.$ic15$, (SubLObject)module0745.$ic18$);
        module0002.f50((SubLObject)module0745.$ic16$, (SubLObject)module0745.$ic18$);
        module0012.f419((SubLObject)module0745.$ic20$);
        module0002.f38((SubLObject)module0745.$ic39$);
        module0012.f419((SubLObject)module0745.$ic68$);
        module0012.f419((SubLObject)module0745.$ic67$);
        module0012.f419((SubLObject)module0745.$ic80$);
        module0003.f57((SubLObject)module0745.$ic156$);
        return (SubLObject)module0745.NIL;
    }
    
    public void declareFunctions() {
        f46273();
    }
    
    public void initializeVariables() {
        f46274();
    }
    
    public void runTopLevelForms() {
        f46275();
    }
    
    static {
        me = (SubLFile)new module0745();
        module0745.$g5931$ = null;
        module0745.$g5932$ = null;
        module0745.$g5933$ = null;
        module0745.$g5934$ = null;
        module0745.$g5935$ = null;
        module0745.$g5936$ = null;
        module0745.$g5937$ = null;
        module0745.$g5938$ = null;
        module0745.$g5939$ = null;
        module0745.$g5940$ = null;
        module0745.$g5941$ = null;
        module0745.$g5942$ = null;
        module0745.$g5943$ = null;
        module0745.$g5944$ = null;
        module0745.$g5945$ = null;
        module0745.$g5946$ = null;
        module0745.$g5947$ = null;
        module0745.$g5948$ = null;
        module0745.$g5949$ = null;
        module0745.$g5950$ = null;
        module0745.$g5951$ = null;
        module0745.$g5952$ = null;
        module0745.$g5953$ = null;
        module0745.$g5954$ = null;
        module0745.$g5955$ = null;
        module0745.$g5956$ = null;
        module0745.$g5957$ = null;
        module0745.$g5958$ = null;
        module0745.$g5959$ = null;
        module0745.$g5960$ = null;
        module0745.$g5961$ = null;
        module0745.$g5962$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#50570", "CYC");
        $ic1$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("application.file-backed-cache.generic-singular-nl-generation-fort-cache-file-name"));
        $ic2$ = SubLObjectFactory.makeSymbol("S#50573", "CYC");
        $ic3$ = SubLObjectFactory.makeString("generic-singular-nl-generation-fort-cache.fht");
        $ic4$ = SubLObjectFactory.makeKeyword("LEXICAL");
        $ic5$ = SubLObjectFactory.makeString("nl-generation-fht-lock");
        $ic6$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#885", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic7$ = SubLObjectFactory.makeUninternedSymbol("US#7063A5B");
        $ic8$ = SubLObjectFactory.makeUninternedSymbol("US#7ABB132");
        $ic9$ = SubLObjectFactory.makeSymbol("CLET");
        $ic10$ = SubLObjectFactory.makeSymbol("S#50571", "CYC");
        $ic11$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#50519", "CYC")));
        $ic12$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#50573", "CYC"));
        $ic13$ = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $ic14$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic15$ = SubLObjectFactory.makeSymbol("S#50520", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#50521", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#50519", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#50518", "CYC");
        $ic19$ = SubLObjectFactory.makeString("/");
        $ic20$ = SubLObjectFactory.makeSymbol("S#50525", "CYC");
        $ic21$ = SubLObjectFactory.makeInteger(100);
        $ic22$ = SubLObjectFactory.makeKeyword("HL-EXTERNALIZED-KEYS");
        $ic23$ = SubLObjectFactory.makeKeyword("NL-PREDS");
        $ic24$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic")));
        $ic25$ = SubLObjectFactory.makeKeyword("LANGUAGE-MT");
        $ic26$ = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $ic27$ = SubLObjectFactory.makeInteger(60);
        $ic28$ = SubLObjectFactory.makeInteger(10000);
        $ic29$ = SubLObjectFactory.makeString("NL FORT Generation Results Queue");
        $ic30$ = SubLObjectFactory.makeInteger(255);
        $ic31$ = SubLObjectFactory.makeString("tmp/");
        $ic32$ = SubLObjectFactory.makeString("Gen-template store is stale.");
        $ic33$ = SubLObjectFactory.makeString("Generating nl cache to file: ~A");
        $ic34$ = SubLObjectFactory.makeSymbol("S#12263", "CYC");
        $ic35$ = SubLObjectFactory.makeString("fort-count.cfasl");
        $ic36$ = SubLObjectFactory.makeString("Generating FORT paraphrases (");
        $ic37$ = SubLObjectFactory.makeString(")...");
        $ic38$ = SubLObjectFactory.makeString("~S already exists.");
        $ic39$ = SubLObjectFactory.makeSymbol("CREATE-FILTERED-NL-GENERATION-FHT-FROM-DATA");
        $ic40$ = SubLObjectFactory.makeString("Cannot filter without a set, got ~A.");
        $ic41$ = SubLObjectFactory.makeString("Compiling file hashtable from paraphrase data...");
        $ic42$ = SubLObjectFactory.makeSymbol("DIRECTORY-P");
        $ic43$ = SubLObjectFactory.makeSymbol("STRING<");
        $ic44$ = SubLObjectFactory.makeString("/done");
        $ic45$ = SubLObjectFactory.makeString("Skipping assignment directory with no \"done\" file: ~S");
        $ic46$ = SubLObjectFactory.makeString("build-kb-loaded.cfasl");
        $ic47$ = SubLObjectFactory.makeString("/results.cfasl");
        $ic48$ = SubLObjectFactory.makeString("/fast-results.cfasl");
        $ic49$ = SubLObjectFactory.makeString("Using results file ~S");
        $ic50$ = SubLObjectFactory.makeKeyword("INPUT");
        $ic51$ = SubLObjectFactory.makeString("Unable to open ~S");
        $ic52$ = SubLObjectFactory.makeKeyword("EOF");
        $ic53$ = SubLObjectFactory.makeString("Non-FORT ~S in paraphrase data: ~S");
        $ic54$ = SubLObjectFactory.makeString("Bad paraphrase data for ~S in ~S:~% ~S");
        $ic55$ = SubLObjectFactory.makeString("Skipping black-listed term ~A.~%");
        $ic56$ = SubLObjectFactory.makeKeyword("USE-FIRST");
        $ic57$ = SubLObjectFactory.makeString("nl-generation-cache-work/");
        $ic58$ = SubLObjectFactory.makeString("777");
        $ic59$ = SubLObjectFactory.makeString("assignment-size.cfasl");
        $ic60$ = SubLObjectFactory.makeString("paraphrase-mt.cfasl");
        $ic61$ = SubLObjectFactory.makeString("Assignment size is ~S. Must be a multiple of ~D.");
        $ic62$ = SubLObjectFactory.makeString("~");
        $ic63$ = SubLObjectFactory.makeString(",'0D-~");
        $ic64$ = SubLObjectFactory.makeString(",'0D/");
        $ic65$ = SubLObjectFactory.makeString("error-output.log");
        $ic66$ = SubLObjectFactory.makeString("~&Assigning task ~S~%");
        $ic67$ = SubLObjectFactory.makeSymbol("S#50543", "CYC");
        $ic68$ = SubLObjectFactory.makeSymbol("S#50542", "CYC");
        $ic69$ = SubLObjectFactory.makeString("~&Just dequeued ~S after enqueueing ~S~%");
        $ic70$ = SubLObjectFactory.makeString("~&Successfully completed ~S~%");
        $ic71$ = SubLObjectFactory.makeString("Received failure code on task ~S");
        $ic72$ = SubLObjectFactory.makeString("Didn't recognize exit code ~S");
        $ic73$ = SubLObjectFactory.makeString("NL FORT Generation subtask reported failure:~% ~S");
        $ic74$ = SubLObjectFactory.makeString("~&About to enqueue new exit code ~S~%");
        $ic75$ = SubLObjectFactory.makeString("Just received task specification ~S");
        $ic76$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#50602", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50603", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50604", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50605", "CYC"));
        $ic77$ = SubLObjectFactory.makeString("Returning ~S");
        $ic78$ = SubLObjectFactory.makeString("results.cfasl");
        $ic79$ = SubLObjectFactory.makeString("fast-results.cfasl");
        $ic80$ = SubLObjectFactory.makeSymbol("S#50544", "CYC");
        $ic81$ = SubLObjectFactory.makeString("done");
        $ic82$ = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $ic83$ = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic84$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#50541", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("S#6908", "CYC")));
        $ic85$ = SubLObjectFactory.makeString("prior-results.cfasl");
        $ic86$ = SubLObjectFactory.makeKeyword("OUTPUT");
        $ic87$ = SubLObjectFactory.makeString("stats.log");
        $ic88$ = SubLObjectFactory.makeKeyword("APPEND");
        $ic89$ = SubLObjectFactory.makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic90$ = SubLObjectFactory.makeString("Generating nl for forts ");
        $ic91$ = SubLObjectFactory.makeString(" through ");
        $ic92$ = SubLObjectFactory.makeString(" ....");
        $ic93$ = SubLObjectFactory.makeString("");
        $ic94$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic95$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("US#352B2C1"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#13A2892"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#1160044"));
        $ic96$ = SubLObjectFactory.makeString("Timed out on first try after ~A generating paraphrase of ~S.~% Trying again...");
        $ic97$ = SubLObjectFactory.makeSymbol("BREAK");
        $ic98$ = SubLObjectFactory.makeSymbol("WARN");
        $ic99$ = SubLObjectFactory.makeString("Timed out after ~A generating paraphrase of ~S");
        $ic100$ = SubLObjectFactory.makeString("Failed to generate a string for ~S");
        $ic101$ = SubLObjectFactory.makeString("Generated empty string for ~S");
        $ic102$ = SubLObjectFactory.makeKeyword("NEW");
        $ic103$ = SubLObjectFactory.makeInteger(500);
        $ic104$ = SubLObjectFactory.makeString("Verifying ");
        $ic105$ = SubLObjectFactory.makeString(" constants...");
        $ic106$ = SubLObjectFactory.makeString("~S:~% Cached: ~S~% Generated: ~S~%");
        $ic107$ = SubLObjectFactory.makeString(" NARTs...");
        $ic108$ = SubLObjectFactory.makeString("~D of ~D constants verified (~F%)~%");
        $ic109$ = SubLObjectFactory.makeString("~D of ~D narts verified (~F%)~%");
        $ic110$ = SubLObjectFactory.makeString("~&First non-finished (missing) directory: ~S");
        $ic111$ = SubLObjectFactory.makeString("~&First non-finished (failed) directory: ~S");
        $ic112$ = SubLObjectFactory.makeInteger(128);
        $ic113$ = SubLObjectFactory.makeString("Clearing PPH memoization for ~S");
        $ic114$ = SubLObjectFactory.makeString("~&Paraphrased batch #~D of ~S FORTs in ~A~%");
        $ic115$ = SubLObjectFactory.makeSymbol("+");
        $ic116$ = SubLObjectFactory.makeString("~&Total paraphrase time: ~S~%");
        $ic117$ = SubLObjectFactory.makeString("~&Median paraphrase time: ~S~%");
        $ic118$ = SubLObjectFactory.makeString("~&~Sth percentile paraphrase time: ~S~%");
        $ic119$ = SubLObjectFactory.makeString("~& (SWAP time: ~A)~%");
        $ic120$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Total FORT Paraphrase Time in ~D-FORT Batches"), (SubLObject)SubLObjectFactory.makeString("Median FORT Paraphrase Time in ~D-FORT Batches"), (SubLObject)SubLObjectFactory.makeString("Total CPU Time per ~D-FORT Batch"), (SubLObject)SubLObjectFactory.makeString("Total GC Time per ~D-FORT Batch"), (SubLObject)SubLObjectFactory.makeString("Total Swap Time per ~D-FORT Batch"), (SubLObject)SubLObjectFactory.makeString("Failed FORT count per ~D-FORT Batch"));
        $ic121$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("total"), (SubLObject)SubLObjectFactory.makeString("median"), (SubLObject)SubLObjectFactory.makeString("cpu"), (SubLObject)SubLObjectFactory.makeString("gc"), (SubLObject)SubLObjectFactory.makeString("swap"), (SubLObject)SubLObjectFactory.makeString("failed-fort-count"));
        $ic122$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Seconds"), (SubLObject)SubLObjectFactory.makeString("Seconds"), (SubLObject)SubLObjectFactory.makeString("Seconds"), (SubLObject)SubLObjectFactory.makeString("Seconds"), (SubLObject)SubLObjectFactory.makeString("Seconds"), (SubLObject)SubLObjectFactory.makeString("FORTs"));
        $ic123$ = SubLObjectFactory.makeKeyword("XLABEL");
        $ic124$ = SubLObjectFactory.makeString("Batch #");
        $ic125$ = SubLObjectFactory.makeKeyword("YLABEL");
        $ic126$ = SubLObjectFactory.makeKeyword("PLOT-TITLE");
        $ic127$ = SubLObjectFactory.makeKeyword("OUTPUT-FILE");
        $ic128$ = SubLObjectFactory.makeString(".cfasl");
        $ic129$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Total FORT Paraphrase Time per Batch"), (SubLObject)SubLObjectFactory.makeString("Median FORT Paraphrase Time by Batch"), (SubLObject)SubLObjectFactory.makeString("Total CPU Time per Batch"), (SubLObject)SubLObjectFactory.makeString("Total GC Time per Batch"), (SubLObject)SubLObjectFactory.makeString("Total Swap Time per Batch"), (SubLObject)SubLObjectFactory.makeString("Failed FORT Count per Batch"));
        $ic130$ = SubLObjectFactory.makeSymbol("<");
        $ic131$ = SubLObjectFactory.makeSymbol("FIRST");
        $ic132$ = SubLObjectFactory.makeInteger(1000000000);
        $ic133$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#50606", "CYC"));
        $ic134$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $ic135$ = SubLObjectFactory.makeKeyword("TEXT");
        $ic136$ = SubLObjectFactory.makeString("Cached paraphrase for ~S~% is ~S.~% Should be ~S.");
        $ic137$ = (SubLFloat)SubLObjectFactory.makeDouble(0.001);
        $ic138$ = SubLObjectFactory.makeString("~%Checking NL Generation cache based on~% ~S~% with ~S local cache entries~% against KB ~A started from KB ~S~%");
        $ic139$ = SubLObjectFactory.makeString("~&Done ~D. Current estimate: ~,3F%~%");
        $ic140$ = SubLObjectFactory.makeString("Done ~S, but variance of approximately ~S exceeds ~S. Doing at least ~S more.");
        $ic141$ = SubLObjectFactory.makeString("~&The estimated staleness percentage of the NL generation FORT cache~% (based on ~D FORTs) is between ~,");
        $ic142$ = SubLObjectFactory.makeString("F% and ~,");
        $ic143$ = SubLObjectFactory.makeString("F%.~%");
        $ic144$ = SubLObjectFactory.makeSymbol("S#18284", "CYC");
        $ic145$ = SubLObjectFactory.makeString("Looking up nl generation for all forts ....");
        $ic146$ = SubLObjectFactory.makeKeyword("NOT-FOUND");
        $ic147$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EnglishParaphraseMt"));
        $ic148$ = SubLObjectFactory.makeString("cdolist");
        $ic149$ = SubLObjectFactory.makeString("Timed out after ~S seconds generating paraphrase of ~S");
        $ic150$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("LogicalFieldAttribute"));
        $ic151$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic152$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic153$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic154$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic155$ = SubLObjectFactory.makeSymbol("S#3935", "CYC");
        $ic156$ = SubLObjectFactory.makeSymbol("S#50601", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0745.class
	Total time: 3700 ms
	 synthetic 
	var64 
	var46 
	var46 
	var57 
	var61 
	var57 
	var61 
	var57 
	var57 
	var64 
	var61 
	var57 
	var61 
	var57 
	var57 
	var64 
	var61 
	var64 
	var57 
	var61 
	var57 
	var61 
	var57 
	var57 
	var64 
	var61 
	var57 
	var61 
	var57 
	var57 
	var64 
	var61 
	var64 
	var64 
	Decompiled with Procyon 0.5.32.
*/