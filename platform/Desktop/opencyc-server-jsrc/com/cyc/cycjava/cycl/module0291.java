package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0291 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0291";
    public static final String myFingerPrint = "978520eb13c7aa9f31b5c5c9a6af61d706b2306d6e7a8417fd07cdc4953d6760";
    private static SubLSymbol $g2658$;
    private static SubLSymbol $g2659$;
    private static SubLSymbol $g2660$;
    private static SubLSymbol $g2661$;
    private static SubLSymbol $g2662$;
    private static SubLSymbol $g2663$;
    private static SubLSymbol $g2664$;
    private static SubLSymbol $g2665$;
    private static SubLSymbol $g2666$;
    private static SubLSymbol $g2667$;
    public static SubLSymbol $g2668$;
    public static SubLSymbol $g2669$;
    private static SubLSymbol $g2670$;
    private static SubLSymbol $g2671$;
    private static final SubLFloat $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLString $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLInteger $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLString $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    private static final SubLList $ic16$;
    private static final SubLList $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLList $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLList $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLList $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLObject $ic31$;
    private static final SubLObject $ic32$;
    private static final SubLObject $ic33$;
    private static final SubLObject $ic34$;
    private static final SubLObject $ic35$;
    private static final SubLList $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLList $ic39$;
    private static final SubLList $ic40$;
    private static final SubLList $ic41$;
    private static final SubLString $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLList $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLObject $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLString $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLList $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLString $ic56$;
    private static final SubLString $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLObject $ic63$;
    private static final SubLString $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLList $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLList $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLString $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLString $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLString $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLList $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLString $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLString $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLObject $ic89$;
    private static final SubLObject $ic90$;
    private static final SubLObject $ic91$;
    private static final SubLObject $ic92$;
    private static final SubLObject $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    
    public static SubLObject f19545() {
        if (module0291.NIL != f19546()) {
            return (SubLObject)module0291.ZERO_INTEGER;
        }
        return f19547();
    }
    
    public static SubLObject f19546() {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0291.NIL != f19548() && module0291.NIL != f19549());
    }
    
    public static SubLObject f19548() {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0291.NIL != module0131.f8536() && module0291.NIL != module0295.f19835());
    }
    
    public static SubLObject f19549() {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0291.NIL != module0131.f8536() && module0291.NIL != f19550() && module0291.NIL != f19551() && module0291.NIL != f19552() && module0291.NIL != f19553());
    }
    
    public static SubLObject f19554() {
        if (module0291.NIL != f19546()) {
            final SubLObject var1 = module0295.f19866();
            final SubLObject var2 = f19555();
            final SubLObject var3 = Numbers.divide(var2, var1);
            if (var3.numGE(module0291.$g2658$.getGlobalValue())) {
                return (SubLObject)module0291.T;
            }
        }
        return (SubLObject)module0291.NIL;
    }
    
    public static SubLObject f19556() {
        if (module0291.NIL != module0035.f2370((SubLObject)module0291.$ic2$, module0291.$g2659$.getGlobalValue(), (SubLObject)module0291.UNPROVIDED)) {
            module0131.f8537();
        }
        else {
            module0131.f8538();
        }
        return module0131.f8536();
    }
    
    public static SubLObject f19547() {
        if (module0291.NIL == module0131.f8536()) {
            Errors.error((SubLObject)module0291.$ic3$);
        }
        f19557();
        return f19558();
    }
    
    public static SubLObject f19555() {
        if (module0291.NIL != module0131.f8536()) {
            return Hashtables.hash_table_count(module0295.f19835());
        }
        return (SubLObject)module0291.ZERO_INTEGER;
    }
    
    public static SubLObject f19559() {
        if (module0291.NIL != module0131.f8536()) {
            return Sequences.length(module0295.f19839());
        }
        return (SubLObject)module0291.ZERO_INTEGER;
    }
    
    public static SubLObject f19560(final SubLObject var4) {
        if (module0291.NIL != module0131.f8536()) {
            return module0035.sublisp_boolean(f19561(var4));
        }
        return (SubLObject)module0291.NIL;
    }
    
    public static SubLObject f19562(final SubLObject var4) {
        return f19563(var4, f19564());
    }
    
    public static SubLObject f19565(final SubLObject var4) {
        if (module0291.NIL != module0178.f11341(var4)) {
            return (SubLObject)module0291.NIL;
        }
        assert module0291.NIL != f19562(var4) : var4;
        f19545();
        f19557();
        return f19566(var4);
    }
    
    public static SubLObject f19567(final SubLObject var4) {
        assert module0291.NIL != f19562(var4) : var4;
        f19545();
        f19557();
        return f19568(var4);
    }
    
    public static SubLObject f19569(final SubLObject var5, final SubLObject var6) {
        final SubLObject var7 = var5.rest();
        final SubLObject var9;
        final SubLObject var8 = var9 = var7;
        return (SubLObject)ConsesLow.listS((SubLObject)module0291.$ic14$, (SubLObject)module0291.$ic15$, ConsesLow.append(var9, (SubLObject)module0291.NIL));
    }
    
    public static SubLObject f19570(final SubLObject var5, final SubLObject var6) {
        final SubLObject var7 = var5.rest();
        final SubLObject var9;
        final SubLObject var8 = var9 = var7;
        return (SubLObject)ConsesLow.listS((SubLObject)module0291.$ic14$, (SubLObject)module0291.$ic16$, ConsesLow.append(var9, (SubLObject)module0291.NIL));
    }
    
    public static SubLObject f19571(final SubLObject var5, final SubLObject var6) {
        SubLObject var8;
        final SubLObject var7 = var8 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)module0291.$ic17$);
        final SubLObject var9 = var8.rest();
        var8 = var8.first();
        SubLObject var10 = (SubLObject)module0291.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)module0291.$ic17$);
        var10 = var8.first();
        var8 = var8.rest();
        if (module0291.NIL == var8) {
            final SubLObject var11;
            var8 = (var11 = var9);
            final SubLObject var12 = (SubLObject)module0291.$ic18$;
            return (SubLObject)ConsesLow.list((SubLObject)module0291.$ic19$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var12, var10)), (SubLObject)ConsesLow.listS((SubLObject)module0291.$ic20$, var12, (SubLObject)module0291.$ic21$), (SubLObject)ConsesLow.listS((SubLObject)module0291.$ic22$, (SubLObject)ConsesLow.list(var12), ConsesLow.append(var11, (SubLObject)module0291.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var7, (SubLObject)module0291.$ic17$);
        return (SubLObject)module0291.NIL;
    }
    
    public static SubLObject f19572(final SubLObject var5, final SubLObject var6) {
        SubLObject var8;
        final SubLObject var7 = var8 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)module0291.$ic23$);
        final SubLObject var9 = var8.rest();
        var8 = var8.first();
        SubLObject var10 = (SubLObject)module0291.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)module0291.$ic23$);
        var10 = var8.first();
        var8 = var8.rest();
        if (module0291.NIL == var8) {
            final SubLObject var11;
            var8 = (var11 = var9);
            return (SubLObject)ConsesLow.list((SubLObject)module0291.$ic19$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0291.$ic24$, var10)), (SubLObject)ConsesLow.listS((SubLObject)module0291.$ic25$, (SubLObject)module0291.$ic26$, ConsesLow.append(var11, (SubLObject)module0291.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var7, (SubLObject)module0291.$ic23$);
        return (SubLObject)module0291.NIL;
    }
    
    public static SubLObject f19573() {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        return (module0291.NIL != module0034.f1839(module0291.$g2669$.getDynamicValue(var20))) ? Values.values(module0291.$g2669$.getDynamicValue(var20), (SubLObject)module0291.$ic29$) : Values.values(module0034.f1854((SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED), (SubLObject)module0291.$ic30$);
    }
    
    public static SubLObject f19566(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)module0291.NIL;
        if (module0291.NIL != f19574(var4)) {
            var6 = module0295.f19840(var4, module0291.$g2668$.getDynamicValue(var5));
        }
        else if (module0291.NIL != f19575(var4)) {
            var6 = module0295.f19843(var4);
        }
        else if (module0291.NIL != f19576(var4)) {
            var6 = module0295.f19846(var4);
        }
        else if (module0291.NIL != f19577(var4)) {
            var6 = f19578(var4);
        }
        else if (module0291.NIL != f19579(var4)) {
            var6 = module0295.f19852(var4);
        }
        else if (module0291.NIL != f19580(var4)) {
            var6 = f19581(var4);
        }
        return var6;
    }
    
    public static SubLObject f19578(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        final SubLObject var6 = f19582(var4);
        final SubLObject var7 = f19583(var4);
        final SubLObject var8 = f19584(var4);
        final SubLObject var9 = module0178.f11287(var4);
        final SubLObject var10 = module0295.f19850(var6, var9);
        final SubLObject var11 = module0291.$g2668$.getDynamicValue(var5);
        SubLObject var12 = (SubLObject)module0291.NIL;
        try {
            var12 = Locks.seize_lock(var11);
            module0291.$g2661$.setGlobalValue(f19585(var8, var7, var10, module0291.$g2661$.getGlobalValue()));
        }
        finally {
            if (module0291.NIL != var12) {
                Locks.release_lock(var11);
            }
        }
        return (SubLObject)module0291.T;
    }
    
    public static SubLObject f19581(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        final SubLObject var6 = f19586(var4);
        final SubLObject var7 = module0178.f11287(var4);
        final SubLObject var8 = f19587(var6, var7);
        final SubLObject var9 = module0291.$g2668$.getDynamicValue(var5);
        SubLObject var10 = (SubLObject)module0291.NIL;
        try {
            var10 = Locks.seize_lock(var9);
            module0291.$g2660$.setGlobalValue(f19588(var8, module0291.$g2660$.getGlobalValue()));
        }
        finally {
            if (module0291.NIL != var10) {
                Locks.release_lock(var9);
            }
        }
        return (SubLObject)module0291.T;
    }
    
    public static SubLObject f19568(final SubLObject var4) {
        SubLObject var5 = (SubLObject)module0291.NIL;
        if (module0291.NIL != f19574(var4)) {
            var5 = module0295.f19856(var4);
        }
        else if (module0291.NIL != f19575(var4)) {
            var5 = module0295.f19858(var4);
        }
        else if (module0291.NIL != f19576(var4)) {
            var5 = module0295.f19859(var4);
        }
        else if (module0291.NIL != f19577(var4)) {
            var5 = f19589(var4);
        }
        else if (module0291.NIL != f19579(var4)) {
            var5 = module0295.f19861(var4);
        }
        else if (module0291.NIL != f19580(var4)) {
            var5 = f19590(var4);
        }
        return var5;
    }
    
    public static SubLObject f19589(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        final SubLObject var6 = f19582(var4);
        final SubLObject var7 = f19583(var4);
        final SubLObject var8 = f19584(var4);
        final SubLObject var9 = module0178.f11287(var4);
        final SubLObject var10 = module0295.f19850(var6, var9);
        final SubLObject var11 = module0291.$g2668$.getDynamicValue(var5);
        SubLObject var12 = (SubLObject)module0291.NIL;
        try {
            var12 = Locks.seize_lock(var11);
            module0291.$g2661$.setGlobalValue(f19591(var8, var7, var10, module0291.$g2661$.getGlobalValue()));
        }
        finally {
            if (module0291.NIL != var12) {
                Locks.release_lock(var11);
            }
        }
        return (SubLObject)module0291.T;
    }
    
    public static SubLObject f19590(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        final SubLObject var6 = f19586(var4);
        final SubLObject var7 = module0178.f11287(var4);
        final SubLObject var8 = f19587(var6, var7);
        final SubLObject var9 = module0291.$g2668$.getDynamicValue(var5);
        SubLObject var10 = (SubLObject)module0291.NIL;
        try {
            var10 = Locks.seize_lock(var9);
            module0291.$g2660$.setGlobalValue(f19592(var8, module0291.$g2660$.getGlobalValue()));
        }
        finally {
            if (module0291.NIL != var10) {
                Locks.release_lock(var9);
            }
        }
        return (SubLObject)module0291.T;
    }
    
    public static SubLObject f19574(final SubLObject var4) {
        return f19563(var4, f19552());
    }
    
    public static SubLObject f19575(final SubLObject var4) {
        return f19593(var4, module0291.$ic31$);
    }
    
    public static SubLObject f19576(final SubLObject var4) {
        return f19593(var4, module0291.$ic32$);
    }
    
    public static SubLObject f19577(final SubLObject var4) {
        return f19593(var4, module0291.$ic33$);
    }
    
    public static SubLObject f19579(final SubLObject var4) {
        return f19593(var4, module0291.$ic34$);
    }
    
    public static SubLObject f19580(final SubLObject var4) {
        return f19593(var4, module0291.$ic35$);
    }
    
    public static SubLObject f19563(final SubLObject var4, final SubLObject var37) {
        return module0211.f13651(var4, var37);
    }
    
    public static SubLObject f19593(final SubLObject var4, final SubLObject var38) {
        return module0211.f13649(var4, var38);
    }
    
    public static SubLObject f19594() {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        return module0291.$g2662$.getDynamicValue(var20);
    }
    
    public static SubLObject f19595(final SubLObject var25) {
        SubLObject var26 = (SubLObject)module0291.NIL;
        if (module0291.NIL == var26) {
            SubLObject var27 = module0291.$g2660$.getGlobalValue();
            SubLObject var28 = (SubLObject)module0291.NIL;
            var28 = var27.first();
            while (module0291.NIL == var26 && module0291.NIL != var27) {
                if (module0291.NIL != f19596(var28, var25)) {
                    var26 = f19597(var28);
                }
                var27 = var27.rest();
                var28 = var27.first();
            }
        }
        return var26;
    }
    
    public static SubLObject f19596(final SubLObject var30, final SubLObject var25) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        SubLObject var32 = (SubLObject)module0291.NIL;
        final SubLObject var33 = module0147.$g2094$.currentBinding(var31);
        final SubLObject var34 = module0147.$g2095$.currentBinding(var31);
        try {
            module0147.$g2094$.bind(module0147.f9531(var25), var31);
            module0147.$g2095$.bind(module0147.f9534(var25), var31);
            var32 = module0147.f9507(f19598(var30));
        }
        finally {
            module0147.$g2095$.rebind(var34, var31);
            module0147.$g2094$.rebind(var33, var31);
        }
        return var32;
    }
    
    public static SubLObject f19551() {
        return module0291.$g2661$.getGlobalValue();
    }
    
    public static SubLObject f19550() {
        return module0291.$g2663$.getGlobalValue();
    }
    
    public static SubLObject f19564() {
        return module0291.$g2664$.getGlobalValue();
    }
    
    public static SubLObject f19552() {
        return module0291.$g2665$.getGlobalValue();
    }
    
    public static SubLObject f19553() {
        return module0291.$g2666$.getGlobalValue();
    }
    
    public static SubLObject f19599() {
        return module0291.$g2667$.getGlobalValue();
    }
    
    public static SubLObject f19600(final SubLObject var5, final SubLObject var6) {
        SubLObject var8;
        final SubLObject var7 = var8 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)module0291.$ic36$);
        final SubLObject var9 = var8.rest();
        var8 = var8.first();
        SubLObject var10 = (SubLObject)module0291.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)module0291.$ic36$);
        var10 = var8.first();
        var8 = var8.rest();
        if (module0291.NIL == var8) {
            final SubLObject var11;
            var8 = (var11 = var9);
            return (SubLObject)ConsesLow.listS((SubLObject)module0291.$ic37$, (SubLObject)ConsesLow.listS((SubLObject)module0291.$ic38$, var10, (SubLObject)module0291.$ic39$), (SubLObject)module0291.$ic40$, ConsesLow.append(var11, (SubLObject)module0291.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var7, (SubLObject)module0291.$ic36$);
        return (SubLObject)module0291.NIL;
    }
    
    public static SubLObject f19561(final SubLObject var4) {
        if (module0291.NIL != f19546()) {
            return Hashtables.gethash(var4, module0295.f19835(), (SubLObject)module0291.UNPROVIDED);
        }
        return (SubLObject)module0291.NIL;
    }
    
    public static SubLObject f19601(final SubLObject var47) {
        final SubLThread var48 = SubLProcess.currentSubLThread();
        return conses_high.member(var47, module0291.$g2670$.getDynamicValue(var48), (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED);
    }
    
    public static SubLObject f19602(final SubLObject var48, final SubLObject var25) {
        final SubLThread var49 = SubLProcess.currentSubLThread();
        SubLObject var50 = conses_high.copy_list(var48);
        SubLObject var51 = (SubLObject)module0291.NIL;
        SubLObject var52 = (SubLObject)module0291.NIL;
        SubLObject var53 = (SubLObject)module0291.NIL;
        var51 = var48;
        var52 = var51.first();
        for (var53 = (SubLObject)module0291.ZERO_INTEGER; module0291.NIL != var51; var51 = var51.rest(), var52 = var51.first(), var53 = Numbers.add((SubLObject)module0291.ONE_INTEGER, var53)) {
            if (module0291.NIL != Numbers.evenp(var53) && module0291.NIL == module0004.f104(var52, module0291.$g2670$.getDynamicValue(var49), (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED)) {
                module0293.f19714((SubLObject)module0291.ZERO_INTEGER, (SubLObject)module0291.$ic42$, var52, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED);
                var50 = conses_high.remf(var50, var52);
            }
        }
        var50 = f19603(var50);
        var50 = f19604(var50);
        var50 = f19605(var50, var25);
        var50 = f19606(var50);
        var50 = f19607(var50);
        var50 = f19608(var50);
        var50 = f19609(var50, var25);
        var50 = f19610(var50, var25);
        var50 = f19611(var50);
        var50 = f19612(var50);
        var50 = f19613(var50);
        var50 = f19614(var50);
        var50 = f19615(var50);
        var50 = f19616(var50);
        var50 = f19617(var50);
        var50 = f19618(var50);
        return var50;
    }
    
    public static SubLObject f19619(final SubLObject var48) {
        return f19620((SubLObject)module0291.$ic43$, var48, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED);
    }
    
    public static SubLObject f19603(SubLObject var48) {
        final SubLObject var49 = f19619(var48);
        if (module0291.NIL == module0004.f104(var49, (SubLObject)module0291.$ic44$, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED)) {
            f19621((SubLObject)module0291.$ic43$, var49);
            var48 = conses_high.remf(var48, (SubLObject)module0291.$ic43$);
        }
        return var48;
    }
    
    public static SubLObject f19622(final SubLObject var48) {
        return f19620((SubLObject)module0291.$ic45$, var48, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED);
    }
    
    public static SubLObject f19604(SubLObject var48) {
        final SubLObject var49 = f19622(var48);
        if (!var49.isInteger() && !var49.numGE((SubLObject)module0291.ZERO_INTEGER)) {
            f19621((SubLObject)module0291.$ic45$, var49);
            var48 = conses_high.remf(var48, (SubLObject)module0291.$ic45$);
        }
        return var48;
    }
    
    public static SubLObject f19623(final SubLObject var48, final SubLObject var25) {
        return f19620((SubLObject)module0291.$ic46$, var48, var25, (SubLObject)module0291.UNPROVIDED);
    }
    
    public static SubLObject f19624() {
        final SubLObject var53 = module0291.$g2671$.getGlobalValue();
        if (module0291.NIL != var53) {
            module0034.f1818(var53);
        }
        return (SubLObject)module0291.NIL;
    }
    
    public static SubLObject f19625() {
        return module0034.f1829(module0291.$g2671$.getGlobalValue(), (SubLObject)ConsesLow.list(module0291.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED);
    }
    
    public static SubLObject f19626() {
        return module0259.f16850(module0291.$ic48$);
    }
    
    public static SubLObject f19627() {
        SubLObject var54 = module0291.$g2671$.getGlobalValue();
        if (module0291.NIL == var54) {
            var54 = module0034.f1934((SubLObject)module0291.$ic47$, (SubLObject)module0291.$ic49$, (SubLObject)module0291.NIL, (SubLObject)module0291.EQ, (SubLObject)module0291.ZERO_INTEGER, (SubLObject)module0291.ZERO_INTEGER);
        }
        SubLObject var55 = module0034.f1810(var54, (SubLObject)module0291.UNPROVIDED);
        if (var55 == module0291.$ic50$) {
            var55 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f19626()));
            module0034.f1812(var54, var55, (SubLObject)module0291.UNPROVIDED);
        }
        return module0034.f1959(var55);
    }
    
    public static SubLObject f19605(SubLObject var48, final SubLObject var25) {
        final SubLObject var49 = f19623(var48, var25);
        SubLObject var50 = (SubLObject)module0291.NIL;
        SubLObject var51 = var49;
        SubLObject var52 = (SubLObject)module0291.NIL;
        var52 = var51.first();
        while (module0291.NIL != var51) {
            if (module0291.NIL != module0004.f104(var52, f19627(), (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED)) {
                var50 = (SubLObject)ConsesLow.cons(var52, var50);
            }
            else {
                module0293.f19714((SubLObject)module0291.ZERO_INTEGER, (SubLObject)module0291.$ic51$, var52, var49, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED);
            }
            var51 = var51.rest();
            var52 = var51.first();
        }
        if (module0291.NIL != var50) {
            var48 = conses_high.putf(var48, (SubLObject)module0291.$ic46$, Sequences.nreverse(var50));
        }
        else {
            var48 = conses_high.remf(var48, (SubLObject)module0291.$ic46$);
        }
        return var48;
    }
    
    public static SubLObject f19628(final SubLObject var58) {
        return var58.first();
    }
    
    public static SubLObject f19629(final SubLObject var58) {
        return conses_high.second(var58);
    }
    
    public static SubLObject f19630(final SubLObject var58) {
        return conses_high.third(var58);
    }
    
    public static SubLObject f19631(final SubLObject var48) {
        return f19620((SubLObject)module0291.$ic52$, var48, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED);
    }
    
    public static SubLObject f19606(SubLObject var48) {
        final SubLObject var49 = f19631(var48);
        if (module0291.NIL == module0004.f104(var49, (SubLObject)module0291.$ic53$, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED)) {
            f19621((SubLObject)module0291.$ic52$, var49);
            var48 = conses_high.remf(var48, (SubLObject)module0291.$ic52$);
        }
        return var48;
    }
    
    public static SubLObject f19632(final SubLObject var48) {
        return f19620((SubLObject)module0291.$ic54$, var48, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED);
    }
    
    public static SubLObject f19607(SubLObject var48) {
        final SubLObject var49 = f19632(var48);
        if (module0291.NIL == module0004.f104(var49, (SubLObject)module0291.$ic44$, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED)) {
            f19621((SubLObject)module0291.$ic54$, var49);
            var48 = conses_high.remf(var48, (SubLObject)module0291.$ic54$);
        }
        return var48;
    }
    
    public static SubLObject f19633(final SubLObject var48) {
        return f19620((SubLObject)module0291.$ic55$, var48, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED);
    }
    
    public static SubLObject f19608(SubLObject var48) {
        final SubLObject var49 = f19633(var48);
        if (module0291.NIL != var49) {
            final SubLObject var50 = f19634(var49);
            var48 = conses_high.putf(var48, (SubLObject)module0291.$ic55$, var50);
        }
        return var48;
    }
    
    public static SubLObject f19634(final SubLObject var61) {
        if (var61.isList()) {
            SubLObject var62 = (SubLObject)module0291.NIL;
            SubLObject var63 = var61;
            SubLObject var64 = (SubLObject)module0291.NIL;
            var64 = var63.first();
            while (module0291.NIL != var63) {
                if (module0291.NIL != module0295.f19791(var64)) {
                    var62 = (SubLObject)ConsesLow.cons(var64, var62);
                }
                else {
                    module0293.f19714((SubLObject)module0291.ZERO_INTEGER, (SubLObject)module0291.$ic56$, var64, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED);
                }
                var63 = var63.rest();
                var64 = var63.first();
            }
            return Sequences.nreverse(var62);
        }
        module0293.f19714((SubLObject)module0291.ZERO_INTEGER, (SubLObject)module0291.$ic57$, var61, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED);
        return (SubLObject)module0291.NIL;
    }
    
    public static SubLObject f19635(final SubLObject var48) {
        return f19620((SubLObject)module0291.$ic58$, var48, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED);
    }
    
    public static SubLObject f19609(SubLObject var48, final SubLObject var25) {
        SubLObject var49 = f19635(var48);
        final SubLObject var50 = f19620((SubLObject)module0291.$ic59$, var48, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED);
        if (module0291.NIL != var50) {
            var49 = ConsesLow.append(var49, f19636(var50, var25));
        }
        if (module0291.NIL != var49) {
            var49 = f19637(var49);
            var48 = conses_high.putf(var48, (SubLObject)module0291.$ic58$, var49);
        }
        return var48;
    }
    
    public static SubLObject f19637(final SubLObject var64) {
        SubLObject var65 = (SubLObject)module0291.NIL;
        SubLObject var66 = var64;
        SubLObject var67 = (SubLObject)module0291.NIL;
        var67 = var66.first();
        while (module0291.NIL != var66) {
            if (module0291.NIL != f19574(var67)) {
                var65 = (SubLObject)ConsesLow.cons(var67, var65);
            }
            else {
                module0293.f19714((SubLObject)module0291.ZERO_INTEGER, (SubLObject)module0291.$ic60$, var67, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED);
            }
            var66 = var66.rest();
            var67 = var66.first();
        }
        return var65;
    }
    
    public static SubLObject f19636(final SubLObject var65, final SubLObject var25) {
        SubLObject var66 = (SubLObject)module0291.NIL;
        SubLObject var67 = var65;
        SubLObject var68 = (SubLObject)module0291.NIL;
        var68 = var67.first();
        while (module0291.NIL != var67) {
            final SubLObject var69 = module0288.f19340(var68, var25);
            if (module0291.NIL != var69) {
                var66 = (SubLObject)ConsesLow.cons(var69, var66);
            }
            else {
                module0293.f19714((SubLObject)module0291.ZERO_INTEGER, (SubLObject)module0291.$ic61$, var68, var25, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED);
            }
            var67 = var67.rest();
            var68 = var67.first();
        }
        return var66;
    }
    
    public static SubLObject f19638(final SubLObject var48) {
        return f19620((SubLObject)module0291.$ic62$, var48, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED);
    }
    
    public static SubLObject f19610(SubLObject var48, final SubLObject var25) {
        final SubLObject var49 = f19638(var48);
        SubLObject var50 = (SubLObject)module0291.NIL;
        SubLObject var51 = var49;
        SubLObject var52 = (SubLObject)module0291.NIL;
        var52 = var51.first();
        while (module0291.NIL != var51) {
            if (module0291.NIL != module0259.f16854(var52, module0291.$ic63$, var25, (SubLObject)module0291.UNPROVIDED)) {
                var50 = (SubLObject)ConsesLow.cons(var52, var50);
            }
            else {
                module0293.f19714((SubLObject)module0291.ZERO_INTEGER, (SubLObject)module0291.$ic64$, var52, var25, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED);
            }
            var51 = var51.rest();
            var52 = var51.first();
        }
        if (module0291.NIL != var50) {
            var48 = conses_high.putf(var48, (SubLObject)module0291.$ic62$, Sequences.nreverse(var50));
        }
        else {
            var48 = conses_high.remf(var48, (SubLObject)module0291.$ic62$);
        }
        return var48;
    }
    
    public static SubLObject f19639(final SubLObject var48) {
        return f19620((SubLObject)module0291.$ic65$, var48, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED);
    }
    
    public static SubLObject f19611(SubLObject var48) {
        final SubLObject var49 = f19639(var48);
        if (module0291.NIL == module0004.f104(var49, (SubLObject)module0291.$ic66$, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED)) {
            f19621((SubLObject)module0291.$ic65$, var49);
            var48 = conses_high.remf(var48, (SubLObject)module0291.$ic65$);
        }
        return var48;
    }
    
    public static SubLObject f19640(final SubLObject var48) {
        return f19620((SubLObject)module0291.$ic67$, var48, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED);
    }
    
    public static SubLObject f19612(SubLObject var48) {
        final SubLObject var49 = f19640(var48);
        if (module0291.NIL == module0004.f104(var49, (SubLObject)module0291.$ic68$, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED)) {
            f19621((SubLObject)module0291.$ic67$, var49);
            var48 = conses_high.remf(var48, (SubLObject)module0291.$ic67$);
        }
        return var48;
    }
    
    public static SubLObject f19641(final SubLObject var48) {
        return f19620((SubLObject)module0291.$ic69$, var48, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED);
    }
    
    public static SubLObject f19613(SubLObject var48) {
        final SubLObject var49 = f19641(var48);
        if (module0291.NIL != var49 && module0291.NIL == module0004.f104(var49, module0292.f19702(), (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED)) {
            module0293.f19714((SubLObject)module0291.ZERO_INTEGER, (SubLObject)module0291.$ic70$, var49, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED);
            var48 = conses_high.remf(var48, (SubLObject)module0291.$ic69$);
        }
        return var48;
    }
    
    public static SubLObject f19642(final SubLObject var48) {
        return f19620((SubLObject)module0291.$ic71$, var48, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED);
    }
    
    public static SubLObject f19614(SubLObject var48) {
        final SubLObject var49 = f19642(var48);
        SubLObject var50 = (SubLObject)module0291.NIL;
        if (var49.isList()) {
            if (module0291.NIL == var50) {
                SubLObject var51 = var49;
                SubLObject var52 = (SubLObject)module0291.NIL;
                var52 = var51.first();
                while (module0291.NIL == var50 && module0291.NIL != var51) {
                    if (module0291.NIL == module0004.f104(var52, module0292.f19702(), (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED)) {
                        var50 = (SubLObject)module0291.T;
                    }
                    var51 = var51.rest();
                    var52 = var51.first();
                }
            }
        }
        else {
            var50 = (SubLObject)module0291.T;
        }
        if (module0291.NIL != var50) {
            module0293.f19714((SubLObject)module0291.ZERO_INTEGER, (SubLObject)module0291.$ic72$, var49, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED);
            var48 = conses_high.remf(var48, (SubLObject)module0291.$ic71$);
        }
        return var48;
    }
    
    public static SubLObject f19643(final SubLObject var48) {
        return f19620((SubLObject)module0291.$ic73$, var48, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED);
    }
    
    public static SubLObject f19615(SubLObject var48) {
        final SubLObject var49 = f19643(var48);
        SubLObject var50 = (SubLObject)module0291.NIL;
        if (var49.isList()) {
            if (module0291.NIL == var50) {
                SubLObject var51 = var49;
                SubLObject var52 = (SubLObject)module0291.NIL;
                var52 = var51.first();
                while (module0291.NIL == var50 && module0291.NIL != var51) {
                    if (module0291.NIL == module0004.f104(var52, module0292.f19702(), (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED)) {
                        var50 = (SubLObject)module0291.T;
                    }
                    var51 = var51.rest();
                    var52 = var51.first();
                }
            }
        }
        else {
            var50 = (SubLObject)module0291.T;
        }
        if (module0291.NIL != var50) {
            module0293.f19714((SubLObject)module0291.ZERO_INTEGER, (SubLObject)module0291.$ic74$, var49, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED);
            var48 = conses_high.remf(var48, (SubLObject)module0291.$ic73$);
        }
        return var48;
    }
    
    public static SubLObject f19644(final SubLObject var48) {
        return f19620((SubLObject)module0291.$ic75$, var48, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED);
    }
    
    public static SubLObject f19616(SubLObject var48) {
        final SubLObject var49 = f19644(var48);
        if (module0291.NIL == module0004.f104(var49, (SubLObject)module0291.$ic44$, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED)) {
            f19621((SubLObject)module0291.$ic75$, var49);
            var48 = conses_high.remf(var48, (SubLObject)module0291.$ic75$);
        }
        return var48;
    }
    
    public static SubLObject f19645(final SubLObject var48) {
        return f19620((SubLObject)module0291.$ic76$, var48, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED);
    }
    
    public static SubLObject f19617(SubLObject var48) {
        final SubLObject var49 = f19645(var48);
        if (module0291.NIL == module0004.f104(var49, (SubLObject)module0291.$ic44$, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED)) {
            f19621((SubLObject)module0291.$ic76$, var49);
            var48 = conses_high.remf(var48, (SubLObject)module0291.$ic76$);
        }
        return var48;
    }
    
    public static SubLObject f19646(final SubLObject var48) {
        return f19620((SubLObject)module0291.$ic77$, var48, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED);
    }
    
    public static SubLObject f19618(SubLObject var48) {
        final SubLObject var49 = f19620((SubLObject)module0291.$ic77$, var48, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED);
        if (module0291.NIL == module0004.f104(var49, (SubLObject)module0291.$ic78$, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED)) {
            f19621((SubLObject)module0291.$ic77$, var49);
            var48 = conses_high.remf(var48, (SubLObject)module0291.$ic77$);
        }
        return var48;
    }
    
    public static SubLObject f19647(final SubLObject var48) {
        return f19620((SubLObject)module0291.$ic79$, var48, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED);
    }
    
    public static SubLObject f19648(SubLObject var48) {
        final SubLObject var49 = f19647(var48);
        if (module0291.NIL != var49 && (!var49.isInteger() || !var49.numGE((SubLObject)module0291.ZERO_INTEGER))) {
            f19621((SubLObject)module0291.$ic79$, var49);
            var48 = conses_high.remf(var48, (SubLObject)module0291.$ic79$);
        }
        return var48;
    }
    
    public static SubLObject f19620(final SubLObject var70, final SubLObject var48, SubLObject var25, SubLObject var71) {
        if (var25 == module0291.UNPROVIDED) {
            var25 = (SubLObject)module0291.NIL;
        }
        if (var71 == module0291.UNPROVIDED) {
            var71 = (SubLObject)module0291.$ic80$;
        }
        return conses_high.getf(var48, var70, var71.eql((SubLObject)module0291.$ic80$) ? f19649(var70, var25) : var71);
    }
    
    public static SubLObject f19621(final SubLObject var72, final SubLObject var73) {
        module0293.f19714((SubLObject)module0291.ZERO_INTEGER, (SubLObject)module0291.$ic81$, var73, var72, f19649(var72, (SubLObject)module0291.UNPROVIDED), (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED);
        return (SubLObject)module0291.NIL;
    }
    
    public static SubLObject f19649(final SubLObject var70, SubLObject var25) {
        if (var25 == module0291.UNPROVIDED) {
            var25 = (SubLObject)module0291.NIL;
        }
        if (var70.eql((SubLObject)module0291.$ic45$)) {
            return f19594();
        }
        if (var70.eql((SubLObject)module0291.$ic43$)) {
            return (SubLObject)module0291.$ic82$;
        }
        if (var70.eql((SubLObject)module0291.$ic46$)) {
            return f19595(var25);
        }
        if (var70.eql((SubLObject)module0291.$ic52$)) {
            return (SubLObject)module0291.$ic83$;
        }
        if (var70.eql((SubLObject)module0291.$ic54$)) {
            return (SubLObject)module0291.$ic82$;
        }
        if (var70.eql((SubLObject)module0291.$ic55$)) {
            return (SubLObject)module0291.NIL;
        }
        if (var70.eql((SubLObject)module0291.$ic58$)) {
            return (SubLObject)module0291.NIL;
        }
        if (var70.eql((SubLObject)module0291.$ic59$)) {
            return (SubLObject)module0291.NIL;
        }
        if (var70.eql((SubLObject)module0291.$ic62$)) {
            return (SubLObject)module0291.NIL;
        }
        if (var70.eql((SubLObject)module0291.$ic65$)) {
            return (SubLObject)module0291.$ic84$;
        }
        if (var70.eql((SubLObject)module0291.$ic67$)) {
            return (SubLObject)module0291.$ic85$;
        }
        if (var70.eql((SubLObject)module0291.$ic69$)) {
            return (SubLObject)module0291.NIL;
        }
        if (var70.eql((SubLObject)module0291.$ic71$)) {
            return (SubLObject)module0291.NIL;
        }
        if (var70.eql((SubLObject)module0291.$ic73$)) {
            return (SubLObject)module0291.NIL;
        }
        if (var70.eql((SubLObject)module0291.$ic75$)) {
            return (SubLObject)module0291.$ic86$;
        }
        if (var70.eql((SubLObject)module0291.$ic76$)) {
            return (SubLObject)module0291.$ic86$;
        }
        if (var70.eql((SubLObject)module0291.$ic77$)) {
            return (SubLObject)module0291.$ic82$;
        }
        if (var70.eql((SubLObject)module0291.$ic79$)) {
            return (SubLObject)module0291.NIL;
        }
        module0293.f19714((SubLObject)module0291.TWO_INTEGER, (SubLObject)module0291.$ic87$, var70, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED);
        return (SubLObject)module0291.NIL;
    }
    
    public static SubLObject f19558() {
        f19650();
        return module0295.f19865();
    }
    
    public static SubLObject f19557() {
        f19624();
        module0293.f19731();
        return (SubLObject)module0291.T;
    }
    
    public static SubLObject f19650() {
        f19651();
        f19652();
        f19653();
        f19654();
        f19655();
        f19656();
        return (SubLObject)module0291.NIL;
    }
    
    public static SubLObject f19651() {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        final SubLObject var21 = module0147.$g2094$.currentBinding(var20);
        final SubLObject var22 = module0147.$g2095$.currentBinding(var20);
        try {
            module0147.$g2094$.bind((SubLObject)module0291.$ic88$, var20);
            module0147.$g2095$.bind(module0291.$ic89$, var20);
            final SubLObject var23 = module0291.$g2668$.getDynamicValue(var20);
            SubLObject var24 = (SubLObject)module0291.NIL;
            try {
                var24 = Locks.seize_lock(var23);
                module0291.$g2663$.setGlobalValue(module0259.f16848(module0291.$ic90$, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED));
            }
            finally {
                if (module0291.NIL != var24) {
                    Locks.release_lock(var23);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var22, var20);
            module0147.$g2094$.rebind(var21, var20);
        }
        return (SubLObject)module0291.T;
    }
    
    public static SubLObject f19652() {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        final SubLObject var21 = module0147.$g2094$.currentBinding(var20);
        final SubLObject var22 = module0147.$g2095$.currentBinding(var20);
        try {
            module0147.$g2094$.bind((SubLObject)module0291.$ic88$, var20);
            module0147.$g2095$.bind(module0291.$ic89$, var20);
            final SubLObject var23 = module0291.$g2668$.getDynamicValue(var20);
            SubLObject var24 = (SubLObject)module0291.NIL;
            try {
                var24 = Locks.seize_lock(var23);
                module0291.$g2664$.setGlobalValue(module0259.f16848(module0291.$ic91$, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED));
            }
            finally {
                if (module0291.NIL != var24) {
                    Locks.release_lock(var23);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var22, var20);
            module0147.$g2094$.rebind(var21, var20);
        }
        return (SubLObject)module0291.T;
    }
    
    public static SubLObject f19653() {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        final SubLObject var21 = module0147.$g2094$.currentBinding(var20);
        final SubLObject var22 = module0147.$g2095$.currentBinding(var20);
        try {
            module0147.$g2094$.bind((SubLObject)module0291.$ic88$, var20);
            module0147.$g2095$.bind(module0291.$ic89$, var20);
            final SubLObject var23 = module0291.$g2668$.getDynamicValue(var20);
            SubLObject var24 = (SubLObject)module0291.NIL;
            try {
                var24 = Locks.seize_lock(var23);
                module0291.$g2665$.setGlobalValue(module0259.f16848(module0291.$ic92$, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED));
            }
            finally {
                if (module0291.NIL != var24) {
                    Locks.release_lock(var23);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var22, var20);
            module0147.$g2094$.rebind(var21, var20);
        }
        return (SubLObject)module0291.T;
    }
    
    public static SubLObject f19654() {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        final SubLObject var21 = module0147.$g2094$.currentBinding(var20);
        final SubLObject var22 = module0147.$g2095$.currentBinding(var20);
        try {
            module0147.$g2094$.bind((SubLObject)module0291.$ic88$, var20);
            module0147.$g2095$.bind(module0291.$ic89$, var20);
            final SubLObject var23 = module0291.$g2668$.getDynamicValue(var20);
            SubLObject var24 = (SubLObject)module0291.NIL;
            try {
                var24 = Locks.seize_lock(var23);
                module0291.$g2666$.setGlobalValue(module0260.f17034(module0291.$ic93$, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED));
            }
            finally {
                if (module0291.NIL != var24) {
                    Locks.release_lock(var23);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var22, var20);
            module0147.$g2094$.rebind(var21, var20);
        }
        return (SubLObject)module0291.T;
    }
    
    public static SubLObject f19655() {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        module0291.$g2660$.setGlobalValue((SubLObject)module0291.NIL);
        final SubLObject var21 = module0147.$g2094$.currentBinding(var20);
        final SubLObject var22 = module0147.$g2095$.currentBinding(var20);
        try {
            module0147.$g2094$.bind((SubLObject)module0291.$ic88$, var20);
            module0147.$g2095$.bind(module0291.$ic89$, var20);
            SubLObject var24;
            final SubLObject var23 = var24 = module0219.f14512(module0291.$ic35$, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED);
            SubLObject var25 = (SubLObject)module0291.NIL;
            var25 = var24.first();
            while (module0291.NIL != var24) {
                if (module0291.NIL != module0178.f11284(var25) && module0291.NIL == module0178.f11341(var25)) {
                    final SubLObject var26 = f19586(var25);
                    final SubLObject var27 = module0178.f11287(var25);
                    final SubLObject var28 = f19587(var26, var27);
                    final SubLObject var29 = module0291.$g2668$.getDynamicValue(var20);
                    SubLObject var30 = (SubLObject)module0291.NIL;
                    try {
                        var30 = Locks.seize_lock(var29);
                        module0291.$g2660$.setGlobalValue(f19588(var28, module0291.$g2660$.getGlobalValue()));
                    }
                    finally {
                        if (module0291.NIL != var30) {
                            Locks.release_lock(var29);
                        }
                    }
                }
                var24 = var24.rest();
                var25 = var24.first();
            }
        }
        finally {
            module0147.$g2095$.rebind(var22, var20);
            module0147.$g2094$.rebind(var21, var20);
        }
        return (SubLObject)module0291.T;
    }
    
    public static SubLObject f19587(final SubLObject var29, final SubLObject var25) {
        return (SubLObject)ConsesLow.list(var29, var25);
    }
    
    public static SubLObject f19586(final SubLObject var4) {
        return module0178.f11330(var4);
    }
    
    public static SubLObject f19597(final SubLObject var30) {
        return var30.first();
    }
    
    public static SubLObject f19598(final SubLObject var30) {
        return conses_high.second(var30);
    }
    
    public static SubLObject f19656() {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        module0291.$g2661$.setGlobalValue((SubLObject)module0291.NIL);
        SubLObject var21 = f19552();
        SubLObject var22 = (SubLObject)module0291.NIL;
        var22 = var21.first();
        while (module0291.NIL != var21) {
            final SubLObject var23 = module0147.$g2094$.currentBinding(var20);
            final SubLObject var24 = module0147.$g2095$.currentBinding(var20);
            try {
                module0147.$g2094$.bind((SubLObject)module0291.$ic88$, var20);
                module0147.$g2095$.bind(module0291.$ic89$, var20);
                final SubLObject var25 = module0219.f14509(var22, (SubLObject)module0291.THREE_INTEGER, module0291.$ic33$, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED);
                SubLObject var26 = (SubLObject)module0291.NIL;
                SubLObject var57_88 = var25;
                SubLObject var27 = (SubLObject)module0291.NIL;
                var27 = var57_88.first();
                while (module0291.NIL != var57_88) {
                    if (module0291.NIL != module0178.f11284(var27) && module0291.NIL == module0178.f11341(var27)) {
                        final SubLObject var28 = f19582(var27);
                        final SubLObject var29 = f19583(var27);
                        final SubLObject var30 = module0178.f11287(var27);
                        final SubLObject var31 = module0295.f19850(var28, var30);
                        var26 = module0295.f19851(var29, var31, var26);
                    }
                    var57_88 = var57_88.rest();
                    var27 = var57_88.first();
                }
                final SubLObject var32 = module0291.$g2668$.getDynamicValue(var20);
                SubLObject var33 = (SubLObject)module0291.NIL;
                try {
                    var33 = Locks.seize_lock(var32);
                    module0291.$g2661$.setGlobalValue(conses_high.putf(module0291.$g2661$.getGlobalValue(), var22, var26));
                }
                finally {
                    if (module0291.NIL != var33) {
                        Locks.release_lock(var32);
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var24, var20);
                module0147.$g2094$.rebind(var23, var20);
            }
            var21 = var21.rest();
            var22 = var21.first();
        }
        return (SubLObject)module0291.T;
    }
    
    public static SubLObject f19582(final SubLObject var4) {
        return module0178.f11334(var4);
    }
    
    public static SubLObject f19583(final SubLObject var4) {
        return module0178.f11335(var4);
    }
    
    public static SubLObject f19584(final SubLObject var4) {
        return module0178.f11336(var4);
    }
    
    public static SubLObject f19585(final SubLObject var38, final SubLObject var23, final SubLObject var26, SubLObject var91) {
        SubLObject var92 = f19657(var38, var23, var91);
        var92 = f19588(var26, var92);
        var91 = f19658(var38, var23, var92, var91);
        return var91;
    }
    
    public static SubLObject f19591(final SubLObject var38, final SubLObject var23, final SubLObject var26, SubLObject var91) {
        SubLObject var92 = f19657(var38, var23, var91);
        if (module0291.NIL != var92) {
            var92 = f19592(var26, var92);
            var91 = f19658(var38, var23, var92, var91);
        }
        return var91;
    }
    
    public static SubLObject f19658(final SubLObject var38, final SubLObject var23, final SubLObject var93, final SubLObject var94) {
        SubLObject var95 = f19659(var38, var94);
        var95 = module0295.f19897(var23, var93, var95);
        return conses_high.putf(conses_high.remf(var94, var38), var38, var95);
    }
    
    public static SubLObject f19657(final SubLObject var38, final SubLObject var23, final SubLObject var96) {
        return module0295.f19896(var23, f19659(var38, var96));
    }
    
    public static SubLObject f19659(final SubLObject var38, final SubLObject var96) {
        return conses_high.getf(var96, var38, (SubLObject)module0291.UNPROVIDED);
    }
    
    public static SubLObject f19588(final SubLObject var97, final SubLObject var98) {
        return module0035.f2243(var97, var98, Symbols.symbol_function((SubLObject)module0291.EQL), (SubLObject)module0291.$ic94$, Symbols.symbol_function((SubLObject)module0291.$ic95$));
    }
    
    public static SubLObject f19592(final SubLObject var97, final SubLObject var98) {
        return Sequences.delete(var97, var98, Symbols.symbol_function((SubLObject)module0291.EQUAL), (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED, (SubLObject)module0291.UNPROVIDED);
    }
    
    public static SubLObject f19660() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19545", "S#22171", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19546", "S#22172", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19548", "S#22173", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19549", "S#22174", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19554", "S#22175", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19556", "S#22176", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19547", "S#22177", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19555", "S#22178", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19559", "S#22179", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19560", "S#22180", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19562", "S#22181", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19565", "S#22182", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19567", "S#22183", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0291", "f19569", "S#22184");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0291", "f19570", "S#22185");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0291", "f19571", "S#22186");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0291", "f19572", "S#22187");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19573", "S#22188", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19566", "S#22189", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19578", "S#22190", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19581", "S#22191", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19568", "S#22192", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19589", "S#22193", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19590", "S#22194", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19574", "S#22195", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19575", "S#22196", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19576", "S#22197", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19577", "S#22198", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19579", "S#22199", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19580", "S#22200", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19563", "S#22201", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19593", "S#22202", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19594", "S#22203", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19595", "DEFAULT-REFORMULATOR-MODE-PRECEDENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19596", "S#22204", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19551", "S#22205", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19550", "S#22206", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19564", "S#22207", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19552", "S#22208", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19553", "S#22209", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19599", "S#22210", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0291", "f19600", "S#22211");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19561", "FIND-REFORMULATOR-RULE-FOR-RULE-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19601", "S#22212", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19602", "S#22213", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19619", "S#22214", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19603", "S#22215", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19622", "S#22216", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19604", "S#22217", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19623", "S#22218", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19624", "S#22219", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19625", "S#22220", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19626", "S#22221", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19627", "S#22222", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19605", "S#22223", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19628", "S#22224", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19629", "S#22225", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19630", "S#22226", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19631", "S#22227", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19606", "S#22228", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19632", "S#22229", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19607", "S#22230", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19633", "S#22231", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19608", "S#22232", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19634", "S#22233", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19635", "S#22234", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19609", "S#22235", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19637", "S#22236", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19636", "S#22237", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19638", "S#22238", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19610", "S#22239", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19639", "S#22240", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19611", "S#22241", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19640", "S#22242", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19612", "S#22243", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19641", "S#22244", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19613", "S#22245", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19642", "S#22246", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19614", "S#22247", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19643", "S#22248", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19615", "S#22249", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19644", "S#22250", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19616", "S#22251", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19645", "S#22252", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19617", "S#22253", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19646", "S#22254", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19618", "S#22255", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19647", "S#22256", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19648", "S#22257", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19620", "S#22258", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19621", "S#22259", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19649", "S#22260", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19558", "S#22261", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19557", "S#22262", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19650", "S#22263", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19651", "S#22264", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19652", "S#22265", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19653", "S#22266", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19654", "S#22267", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19655", "S#22268", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19587", "S#22269", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19586", "S#22270", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19597", "S#22271", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19598", "S#22272", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19656", "S#22273", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19582", "S#22274", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19583", "S#22275", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19584", "S#22276", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19585", "S#22277", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19591", "S#22278", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19658", "S#22279", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19657", "S#22280", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19659", "S#22281", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19588", "S#22282", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0291", "f19592", "S#22283", 2, 0, false);
        return (SubLObject)module0291.NIL;
    }
    
    public static SubLObject f19661() {
        module0291.$g2658$ = SubLFiles.deflexical("S#22284", (SubLObject)module0291.$ic0$);
        module0291.$g2659$ = SubLFiles.deflexical("S#22285", (SubLObject)module0291.$ic1$);
        module0291.$g2660$ = SubLFiles.deflexical("S#22286", (SubLObject)((module0291.NIL != Symbols.boundp((SubLObject)module0291.$ic5$)) ? module0291.$g2660$.getGlobalValue() : module0291.NIL));
        module0291.$g2661$ = SubLFiles.deflexical("S#22287", (SubLObject)((module0291.NIL != Symbols.boundp((SubLObject)module0291.$ic6$)) ? module0291.$g2661$.getGlobalValue() : module0291.NIL));
        module0291.$g2662$ = SubLFiles.defparameter("S#22288", (SubLObject)module0291.$ic7$);
        module0291.$g2663$ = SubLFiles.deflexical("S#22289", (SubLObject)((module0291.NIL != Symbols.boundp((SubLObject)module0291.$ic8$)) ? module0291.$g2663$.getGlobalValue() : module0291.NIL));
        module0291.$g2664$ = SubLFiles.deflexical("S#22290", (SubLObject)((module0291.NIL != Symbols.boundp((SubLObject)module0291.$ic9$)) ? module0291.$g2664$.getGlobalValue() : module0291.NIL));
        module0291.$g2665$ = SubLFiles.deflexical("S#22291", (SubLObject)((module0291.NIL != Symbols.boundp((SubLObject)module0291.$ic10$)) ? module0291.$g2665$.getGlobalValue() : module0291.NIL));
        module0291.$g2666$ = SubLFiles.deflexical("S#22292", (SubLObject)((module0291.NIL != Symbols.boundp((SubLObject)module0291.$ic11$)) ? module0291.$g2666$.getGlobalValue() : module0291.NIL));
        module0291.$g2667$ = SubLFiles.deflexical("S#22293", (SubLObject)module0291.ONE_INTEGER);
        module0291.$g2668$ = SubLFiles.defparameter("S#22294", Locks.make_lock((SubLObject)module0291.$ic12$));
        module0291.$g2669$ = SubLFiles.defparameter("S#22295", (SubLObject)module0291.$ic13$);
        module0291.$g2670$ = SubLFiles.defparameter("S#22296", (SubLObject)module0291.$ic41$);
        module0291.$g2671$ = SubLFiles.deflexical("S#22297", (SubLObject)module0291.NIL);
        return (SubLObject)module0291.NIL;
    }
    
    public static SubLObject f19662() {
        module0003.f57((SubLObject)module0291.$ic5$);
        module0003.f57((SubLObject)module0291.$ic6$);
        module0003.f57((SubLObject)module0291.$ic8$);
        module0003.f57((SubLObject)module0291.$ic9$);
        module0003.f57((SubLObject)module0291.$ic10$);
        module0003.f57((SubLObject)module0291.$ic11$);
        module0002.f50((SubLObject)module0291.$ic27$, (SubLObject)module0291.$ic28$);
        module0034.f1909((SubLObject)module0291.$ic47$);
        return (SubLObject)module0291.NIL;
    }
    
    public void declareFunctions() {
        f19660();
    }
    
    public void initializeVariables() {
        f19661();
    }
    
    public void runTopLevelForms() {
        f19662();
    }
    
    static {
        me = (SubLFile)new module0291();
        module0291.$g2658$ = null;
        module0291.$g2659$ = null;
        module0291.$g2660$ = null;
        module0291.$g2661$ = null;
        module0291.$g2662$ = null;
        module0291.$g2663$ = null;
        module0291.$g2664$ = null;
        module0291.$g2665$ = null;
        module0291.$g2666$ = null;
        module0291.$g2667$ = null;
        module0291.$g2668$ = null;
        module0291.$g2669$ = null;
        module0291.$g2670$ = null;
        module0291.$g2671$ = null;
        $ic0$ = (SubLFloat)SubLObjectFactory.makeDouble(0.9);
        $ic1$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("reformulatorRule")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("reformulatorEquals")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("reformulatorEquiv")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("reformulationPrecondition")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("reformulatorRuleProperties")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("ReformulatorDirectivePredicate")));
        $ic2$ = SubLObjectFactory.makeSymbol("VALID-CONSTANT?");
        $ic3$ = SubLObjectFactory.makeString("A KB-dependent reformulator function was called, but the current Cyc KB does not contain knowledge necessary for reformulation.");
        $ic4$ = SubLObjectFactory.makeSymbol("S#22181", "CYC");
        $ic5$ = SubLObjectFactory.makeSymbol("S#22286", "CYC");
        $ic6$ = SubLObjectFactory.makeSymbol("S#22287", "CYC");
        $ic7$ = SubLObjectFactory.makeInteger(35);
        $ic8$ = SubLObjectFactory.makeSymbol("S#22289", "CYC");
        $ic9$ = SubLObjectFactory.makeSymbol("S#22290", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#22291", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#22292", "CYC");
        $ic12$ = SubLObjectFactory.makeString("Reformulator Initialization/Update");
        $ic13$ = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $ic14$ = SubLObjectFactory.makeSymbol("S#22186", "CYC");
        $ic15$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#22188", "CYC")));
        $ic16$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3136", "CYC")));
        $ic17$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#22298", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic18$ = SubLObjectFactory.makeUninternedSymbol("US#3F5C755");
        $ic19$ = SubLObjectFactory.makeSymbol("CLET");
        $ic20$ = SubLObjectFactory.makeSymbol("CHECK-TYPE");
        $ic21$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3044", "CYC"));
        $ic22$ = SubLObjectFactory.makeSymbol("S#22187", "CYC");
        $ic23$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3043", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic24$ = SubLObjectFactory.makeSymbol("S#22295", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("S#3165", "CYC");
        $ic26$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#22295", "CYC"));
        $ic27$ = SubLObjectFactory.makeSymbol("S#22188", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("S#22184", "CYC");
        $ic29$ = SubLObjectFactory.makeKeyword("REUSED");
        $ic30$ = SubLObjectFactory.makeKeyword("NEW");
        $ic31$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("reformulationPrecondition"));
        $ic32$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("reformulationDirectionInMode"));
        $ic33$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("defaultReformulationDirectionInModeForPred"));
        $ic34$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("reformulatorRuleProperties"));
        $ic35$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("defaultReformulatorModePrecedence"));
        $ic36$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#22299", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic37$ = SubLObjectFactory.makeSymbol("CDOHASH");
        $ic38$ = SubLObjectFactory.makeSymbol("S#131", "CYC");
        $ic39$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#22151", "CYC")));
        $ic40$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"));
        $ic41$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("REFORMULATE-SUBFORMULAS?"), SubLObjectFactory.makeKeyword("RECURSION-LIMIT"), SubLObjectFactory.makeKeyword("MODES"), SubLObjectFactory.makeKeyword("WFF-ENFORCEMENT"), SubLObjectFactory.makeKeyword("USE-KB-REFORMULATOR-RULES?"), SubLObjectFactory.makeKeyword("REFORMULATOR-RULES"), SubLObjectFactory.makeKeyword("SKIP-ASSERTIONS"), SubLObjectFactory.makeKeyword("SKIP-SENTENCES"), SubLObjectFactory.makeKeyword("META-PREDICATES"), SubLObjectFactory.makeKeyword("PRECONDITION-CHECKING"), SubLObjectFactory.makeKeyword("SEARCH-STRATEGY"), SubLObjectFactory.makeKeyword("FOCUS"), SubLObjectFactory.makeKeyword("IGNORE-RL-MODULES"), SubLObjectFactory.makeKeyword("APPLY-FIRST-RECURSIVELY"), SubLObjectFactory.makeKeyword("ELIMINATE-TRANSITIVITY-IN-REFORMULATION-HISTORY?"), SubLObjectFactory.makeKeyword("CLEAR-CACHES?"), SubLObjectFactory.makeKeyword("REFORMULATE-ATOMS?"), SubLObjectFactory.makeKeyword("MAX-TIME") });
        $ic42$ = SubLObjectFactory.makeString("Found an invalid setting: ~s - ignoring it~%");
        $ic43$ = SubLObjectFactory.makeKeyword("REFORMULATE-SUBFORMULAS?");
        $ic44$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TRUE"), (SubLObject)SubLObjectFactory.makeKeyword("FALSE"));
        $ic45$ = SubLObjectFactory.makeKeyword("RECURSION-LIMIT");
        $ic46$ = SubLObjectFactory.makeKeyword("MODES");
        $ic47$ = SubLObjectFactory.makeSymbol("S#22222", "CYC");
        $ic48$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ReformulatorMode"));
        $ic49$ = SubLObjectFactory.makeSymbol("S#22297", "CYC");
        $ic50$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic51$ = SubLObjectFactory.makeString("Found invalid reformulation mode ~s within reformulation mode precedence list ~s - ignoring the invalid mode");
        $ic52$ = SubLObjectFactory.makeKeyword("WFF-ENFORCEMENT");
        $ic53$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALL"), (SubLObject)SubLObjectFactory.makeKeyword("ARITY"), (SubLObject)SubLObjectFactory.makeKeyword("KB"), (SubLObject)SubLObjectFactory.makeKeyword("NONE"));
        $ic54$ = SubLObjectFactory.makeKeyword("USE-KB-REFORMULATOR-RULES?");
        $ic55$ = SubLObjectFactory.makeKeyword("REFORMULATOR-RULES");
        $ic56$ = SubLObjectFactory.makeString("Found invalid reformulator rule ~s among the rules explicitly specified - ignoring it");
        $ic57$ = SubLObjectFactory.makeString("Expected a list of reformulator rules, got ~s");
        $ic58$ = SubLObjectFactory.makeKeyword("SKIP-ASSERTIONS");
        $ic59$ = SubLObjectFactory.makeKeyword("SKIP-SENTENCES");
        $ic60$ = SubLObjectFactory.makeString("Found invalid reformulator rule assertion ~s among the assertions explicitly specified to be skipped -- ignoring it");
        $ic61$ = SubLObjectFactory.makeString("Found sentence to skip ~s which did not correspond to a CycL assertion visible in mt ~s -- ignoring it~%");
        $ic62$ = SubLObjectFactory.makeKeyword("META-PREDICATES");
        $ic63$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("UnaryPredicate"));
        $ic64$ = SubLObjectFactory.makeString("Found a reformulator meta-predicate ~s which is not a unary predicate in mt ~s -- ignoring it~%");
        $ic65$ = SubLObjectFactory.makeKeyword("PRECONDITION-CHECKING");
        $ic66$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-ONLY-ASK"));
        $ic67$ = SubLObjectFactory.makeKeyword("SEARCH-STRATEGY");
        $ic68$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NO-SEARCH"));
        $ic69$ = SubLObjectFactory.makeKeyword("FOCUS");
        $ic70$ = SubLObjectFactory.makeString("Found invalid reformulation focus ~s - ignoring it");
        $ic71$ = SubLObjectFactory.makeKeyword("IGNORE-RL-MODULES");
        $ic72$ = SubLObjectFactory.makeString("Found invalid :ignore-rl-modules setting ~s - ignoring it");
        $ic73$ = SubLObjectFactory.makeKeyword("APPLY-FIRST-RECURSIVELY");
        $ic74$ = SubLObjectFactory.makeString("Found invalid :apply-first-recursively setting ~s - ignoring it");
        $ic75$ = SubLObjectFactory.makeKeyword("ELIMINATE-TRANSITIVITY-IN-REFORMULATION-HISTORY?");
        $ic76$ = SubLObjectFactory.makeKeyword("CLEAR-CACHES?");
        $ic77$ = SubLObjectFactory.makeKeyword("REFORMULATE-ATOMS?");
        $ic78$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TRUE"), (SubLObject)SubLObjectFactory.makeKeyword("FALSE"), (SubLObject)SubLObjectFactory.makeKeyword("UNLESS-REWRITE-OF"));
        $ic79$ = SubLObjectFactory.makeKeyword("MAX-TIME");
        $ic80$ = SubLObjectFactory.makeKeyword("COMPUTE-DEFAULT");
        $ic81$ = SubLObjectFactory.makeString("Found invalid value ~s for setting ~s - using the default value ~s instead~%");
        $ic82$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic83$ = SubLObjectFactory.makeKeyword("KB");
        $ic84$ = SubLObjectFactory.makeKeyword("REMOVAL-ONLY-ASK");
        $ic85$ = SubLObjectFactory.makeKeyword("NO-SEARCH");
        $ic86$ = SubLObjectFactory.makeKeyword("FALSE");
        $ic87$ = SubLObjectFactory.makeString("Tried to get an undefined default for setting ~s");
        $ic88$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic89$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic90$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ReformulatorIrrelevantFORT"));
        $ic91$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ReformulatorDirectivePredicate"));
        $ic92$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CycLReformulationRulePredicate"));
        $ic93$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("reformulatorRule"));
        $ic94$ = SubLObjectFactory.makeSymbol("GENL-MT?");
        $ic95$ = SubLObjectFactory.makeSymbol("SECOND");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0291.class
	Total time: 332 ms
	
	Decompiled with Procyon 0.5.32.
*/