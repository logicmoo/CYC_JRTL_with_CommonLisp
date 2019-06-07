package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0242 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0242";
    public static final String myFingerPrint = "ee01308443179883a1d598f00f8bbbb4063e855b21a1979a30301297db75f27d";
    private static SubLSymbol $g2448$;
    public static SubLSymbol $g2449$;
    public static SubLSymbol $g2450$;
    public static SubLSymbol $g2451$;
    public static SubLSymbol $g2452$;
    public static SubLSymbol $g2453$;
    public static SubLSymbol $g2454$;
    public static SubLSymbol $g2455$;
    public static SubLSymbol $g2456$;
    public static SubLSymbol $g2457$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLInteger $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLString $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLString $ic6$;
    private static final SubLString $ic7$;
    private static final SubLString $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLString $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLString $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLString $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLList $ic21$;
    private static final SubLList $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLList $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLList $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLList $ic34$;
    private static final SubLString $ic35$;
    private static final SubLString $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLString $ic38$;
    private static final SubLList $ic39$;
    private static final SubLString $ic40$;
    private static final SubLString $ic41$;
    private static final SubLString $ic42$;
    private static final SubLString $ic43$;
    private static final SubLString $ic44$;
    private static final SubLInteger $ic45$;
    private static final SubLString $ic46$;
    private static final SubLString $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLFloat $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLObject $ic52$;
    private static final SubLString $ic53$;
    private static final SubLList $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLObject $ic56$;
    
    public static SubLObject f15644() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15645(final SubLObject var1) {
        return Types.hash_table_p(var1);
    }
    
    public static SubLObject f15646() {
        return Hashtables.make_hash_table((SubLObject)ZERO_INTEGER, $g2448$.getGlobalValue(), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f15647(final SubLObject var2) {
        Hashtables.clrhash(var2);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15648() {
        final SubLObject var3 = module0107.f7597((SubLObject)$ic6$, (SubLObject)$ic7$);
        final SubLObject var4 = module0107.f7597((SubLObject)$ic8$, (SubLObject)$ic7$);
        if (NIL != Filesys.probe_file(var3) && NIL != Filesys.probe_file(var4)) {
            f15649(var3, var4);
            return (SubLObject)$ic9$;
        }
        return (SubLObject)$ic10$;
    }
    
    public static SubLObject f15649(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = $g2454$.getGlobalValue();
        SubLObject var6 = (SubLObject)NIL;
        try {
            var6 = Locks.seize_lock(var5);
            if (NIL != module0095.f6844($g2449$.getGlobalValue())) {
                module0095.f6849($g2449$.getGlobalValue());
            }
            $g2449$.setGlobalValue(module0095.f6845(var3, var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            f15650();
        }
        finally {
            if (NIL != var6) {
                Locks.release_lock(var5);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15651(final SubLObject var7, final SubLObject var8) {
        SubLObject var9 = (SubLObject)NIL;
        final SubLObject var10 = $g2454$.getGlobalValue();
        SubLObject var11 = (SubLObject)NIL;
        try {
            var11 = Locks.seize_lock(var10);
            var9 = module0095.f6850($g2449$.getGlobalValue(), var7, var8);
        }
        finally {
            if (NIL != var11) {
                Locks.release_lock(var10);
            }
        }
        return var9;
    }
    
    public static SubLObject f15650() {
        SubLObject var9 = (SubLObject)NIL;
        final SubLObject var10 = $g2454$.getGlobalValue();
        SubLObject var11 = (SubLObject)NIL;
        try {
            var11 = Locks.seize_lock(var10);
            var9 = module0095.f6847($g2449$.getGlobalValue());
        }
        finally {
            if (NIL != var11) {
                Locks.release_lock(var10);
            }
        }
        return var9;
    }
    
    public static SubLObject f15652(final SubLObject var14, SubLObject var15) {
        if (var15 == UNPROVIDED) {
            var15 = (SubLObject)NIL;
        }
        final SubLThread var16 = SubLProcess.currentSubLThread();
        final SubLObject var17 = (NIL != module0004.f106(var15)) ? var15 : f15653(var14);
        final SubLObject var18 = Functions.funcall($g2455$.getGlobalValue(), var17);
        if (NIL != $g2453$.getDynamicValue(var16)) {
            module0090.f6165(var18);
        }
        return var18;
    }
    
    public static SubLObject f15654(final SubLObject var14) {
        SubLObject var15 = module0035.f2294($g2450$.getGlobalValue(), var14, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL == var15) {
            var15 = f15652(var14, (SubLObject)UNPROVIDED);
            f15655(var14, var15);
        }
        return var15;
    }
    
    public static SubLObject f15655(final SubLObject var14, final SubLObject var18) {
        assert NIL != module0090.f6129(var18) : var18;
        $g2450$.setGlobalValue(module0035.f2063($g2450$.getGlobalValue(), var14, var18, (SubLObject)UNPROVIDED));
        return var14;
    }
    
    public static SubLObject f15653(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        final SubLObject var16 = module0137.f8919(var14);
        final SubLObject var17 = module0079.f5406(var16);
        final SubLObject var18 = Numbers.integerDivide(Numbers.multiply(var17, $g2451$.getDynamicValue(var15)), (SubLObject)$ic2$);
        return Numbers.max($g2452$.getDynamicValue(var15), var18);
    }
    
    public static SubLObject f15656(final SubLObject var3, final SubLObject var4) {
        return f15649(var3, var4);
    }
    
    public static SubLObject f15657() {
        return (SubLObject)T;
    }
    
    public static SubLObject f15658(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        assert NIL != module0137.f8885(var22) : var22;
        final SubLObject var24 = module0244.f15766(var22);
        var23.resetMultipleValues();
        final SubLObject var25 = module0096.f6941(var24);
        final SubLObject var26 = var23.secondMultipleValue();
        var23.resetMultipleValues();
        return Values.values(var25, Numbers.add(var25, var26));
    }
    
    public static SubLObject f15659() {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        SubLObject var17 = (SubLObject)ZERO_INTEGER;
        SubLObject var18 = (SubLObject)ZERO_INTEGER;
        SubLObject var19 = (SubLObject)NIL;
        SubLObject var20 = module0137.f8937();
        SubLObject var21 = (SubLObject)NIL;
        var21 = var20.first();
        while (NIL != var20) {
            final SubLObject var22 = module0137.f8917(var21);
            var16.resetMultipleValues();
            final SubLObject var23 = f15658(var21);
            final SubLObject var24 = var16.secondMultipleValue();
            var16.resetMultipleValues();
            var17 = Numbers.add(var17, var23);
            var18 = Numbers.add(var18, var24);
            var19 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var22, var23, var24), var19);
            var20 = var20.rest();
            var21 = var20.first();
        }
        return Values.values(Sequences.nreverse(var19), var17, var18);
    }
    
    public static SubLObject f15660(final SubLObject var31, final SubLObject var2, final SubLObject var19) {
        final SubLThread var32 = SubLProcess.currentSubLThread();
        SubLObject var33 = (SubLObject)NIL;
        final SubLObject var34 = module0096.$g1262$.currentBinding(var32);
        final SubLObject var35 = module0021.$g777$.currentBinding(var32);
        try {
            module0096.$g1262$.bind($g2454$.getGlobalValue(), var32);
            module0021.$g777$.bind((SubLObject)NIL, var32);
            module0021.f1151(module0107.f7590());
            var33 = module0096.f6925(var2, $g2449$.getGlobalValue(), var19, var31, (SubLObject)UNPROVIDED);
        }
        finally {
            module0021.$g777$.rebind(var35, var32);
            module0096.$g1262$.rebind(var34, var32);
        }
        return var33;
    }
    
    public static SubLObject f15661(final SubLObject var31, final SubLObject var2, final SubLObject var19, final SubLObject var34) {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        SubLObject var36 = (SubLObject)NIL;
        final SubLObject var37 = module0096.$g1262$.currentBinding(var35);
        final SubLObject var38 = module0021.$g777$.currentBinding(var35);
        try {
            module0096.$g1262$.bind($g2454$.getGlobalValue(), var35);
            module0021.$g777$.bind((SubLObject)NIL, var35);
            module0021.f1151(module0107.f7590());
            var36 = module0096.f6929(var2, var19, var31, var34);
        }
        finally {
            module0021.$g777$.rebind(var38, var35);
            module0096.$g1262$.rebind(var37, var35);
        }
        return var36;
    }
    
    public static SubLObject f15662(final SubLObject var31, final SubLObject var2, final SubLObject var19) {
        final SubLThread var32 = SubLProcess.currentSubLThread();
        SubLObject var33 = (SubLObject)NIL;
        final SubLObject var34 = module0096.$g1262$.currentBinding(var32);
        final SubLObject var35 = module0021.$g777$.currentBinding(var32);
        try {
            module0096.$g1262$.bind($g2454$.getGlobalValue(), var32);
            module0021.$g777$.bind((SubLObject)NIL, var32);
            module0021.f1151(module0107.f7590());
            var33 = module0096.f6931(var2, var19, var31, (SubLObject)UNPROVIDED);
        }
        finally {
            module0021.$g777$.rebind(var35, var32);
            module0096.$g1262$.rebind(var34, var32);
        }
        return var33;
    }
    
    public static SubLObject f15663(final SubLObject var31, final SubLObject var2, final SubLObject var19) {
        final SubLThread var32 = SubLProcess.currentSubLThread();
        SubLObject var33 = (SubLObject)NIL;
        final SubLObject var34 = module0096.$g1262$.currentBinding(var32);
        final SubLObject var35 = module0021.$g777$.currentBinding(var32);
        try {
            module0096.$g1262$.bind($g2454$.getGlobalValue(), var32);
            module0021.$g777$.bind((SubLObject)NIL, var32);
            module0021.f1151(module0107.f7590());
            var33 = module0096.f6933(var2, var19, var31, $g2449$.getGlobalValue());
        }
        finally {
            module0021.$g777$.rebind(var35, var32);
            module0096.$g1262$.rebind(var34, var32);
        }
        return var33;
    }
    
    public static SubLObject f15664(final SubLObject var31, final SubLObject var22) {
        assert NIL != module0137.f8885(var22) : var22;
        SubLObject var32 = (SubLObject)NIL;
        final SubLObject var33 = module0138.$g1626$.getGlobalValue();
        SubLObject var34 = (SubLObject)NIL;
        try {
            var34 = ReadWriteLocks.rw_lock_seize_read_lock(var33);
            var32 = f15660(var31, module0244.f15766(var22), f15654(var22));
        }
        finally {
            if (NIL != var34) {
                ReadWriteLocks.rw_lock_release_read_lock(var33);
            }
        }
        return var32;
    }
    
    public static SubLObject f15665(final SubLObject var31, final SubLObject var37, final SubLObject var22) {
        final SubLThread var38 = SubLProcess.currentSubLThread();
        if (NIL != module0136.f8864() && NIL == module0245.f15829(var37)) {
            final SubLObject var39 = module0136.$g1591$.getDynamicValue(var38);
            if (var39.eql((SubLObject)$ic13$)) {
                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic14$, var37, (SubLObject)$ic15$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else if (var39.eql((SubLObject)$ic16$)) {
                module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic17$, (SubLObject)$ic14$, var37, (SubLObject)$ic15$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else if (var39.eql((SubLObject)$ic18$)) {
                Errors.warn((SubLObject)$ic14$, var37, (SubLObject)$ic15$);
            }
            else {
                Errors.warn((SubLObject)$ic19$, module0136.$g1591$.getDynamicValue(var38));
                Errors.cerror((SubLObject)$ic17$, (SubLObject)$ic14$, var37, (SubLObject)$ic15$);
            }
        }
        if (NIL != module0136.f8864() && NIL == module0138.f8992(var31)) {
            final SubLObject var39 = module0136.$g1591$.getDynamicValue(var38);
            if (var39.eql((SubLObject)$ic13$)) {
                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic14$, var31, (SubLObject)$ic20$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else if (var39.eql((SubLObject)$ic16$)) {
                module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic17$, (SubLObject)$ic14$, var31, (SubLObject)$ic20$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else if (var39.eql((SubLObject)$ic18$)) {
                Errors.warn((SubLObject)$ic14$, var31, (SubLObject)$ic20$);
            }
            else {
                Errors.warn((SubLObject)$ic19$, module0136.$g1591$.getDynamicValue(var38));
                Errors.cerror((SubLObject)$ic17$, (SubLObject)$ic14$, var31, (SubLObject)$ic20$);
            }
        }
        assert NIL != module0137.f8885(var22) : var22;
        final SubLObject var40 = module0138.$g1626$.getGlobalValue();
        SubLObject var41 = (SubLObject)NIL;
        try {
            var41 = ReadWriteLocks.rw_lock_seize_write_lock(var40);
            f15661(var31, module0244.f15766(var22), f15654(var22), var37);
        }
        finally {
            if (NIL != var41) {
                ReadWriteLocks.rw_lock_release_write_lock(var40);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15666(final SubLObject var31, final SubLObject var37, final SubLObject var22) {
        final SubLThread var38 = SubLProcess.currentSubLThread();
        if (NIL != module0136.f8864() && NIL == module0138.f8992(var31)) {
            final SubLObject var39 = module0136.$g1591$.getDynamicValue(var38);
            if (var39.eql((SubLObject)$ic13$)) {
                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic14$, var31, (SubLObject)$ic20$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else if (var39.eql((SubLObject)$ic16$)) {
                module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic17$, (SubLObject)$ic14$, var31, (SubLObject)$ic20$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else if (var39.eql((SubLObject)$ic18$)) {
                Errors.warn((SubLObject)$ic14$, var31, (SubLObject)$ic20$);
            }
            else {
                Errors.warn((SubLObject)$ic19$, module0136.$g1591$.getDynamicValue(var38));
                Errors.cerror((SubLObject)$ic17$, (SubLObject)$ic14$, var31, (SubLObject)$ic20$);
            }
        }
        assert NIL != module0137.f8885(var22) : var22;
        final SubLObject var40 = module0138.$g1626$.getGlobalValue();
        SubLObject var41 = (SubLObject)NIL;
        try {
            var41 = ReadWriteLocks.rw_lock_seize_write_lock(var40);
            f15663(var31, module0244.f15766(var22), f15654(var22));
        }
        finally {
            if (NIL != var41) {
                ReadWriteLocks.rw_lock_release_write_lock(var40);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15667(final SubLObject var31, final SubLObject var22) {
        assert NIL != module0137.f8885(var22) : var22;
        final SubLObject var32 = module0138.$g1626$.getGlobalValue();
        SubLObject var33 = (SubLObject)NIL;
        try {
            var33 = ReadWriteLocks.rw_lock_seize_write_lock(var32);
            f15662(var31, module0244.f15766(var22), f15654(var22));
        }
        finally {
            if (NIL != var33) {
                ReadWriteLocks.rw_lock_release_write_lock(var32);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15668(final SubLObject var41, final SubLObject var42) {
        SubLObject var44;
        final SubLObject var43 = var44 = var41.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var44, var43, (SubLObject)$ic21$);
        final SubLObject var45 = var44.rest();
        var44 = var44.first();
        SubLObject var46 = (SubLObject)NIL;
        SubLObject var47 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var44, var43, (SubLObject)$ic21$);
        var46 = var44.first();
        var44 = var44.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var44, var43, (SubLObject)$ic21$);
        var47 = var44.first();
        var44 = var44.rest();
        SubLObject var48 = (SubLObject)NIL;
        SubLObject var49 = var44;
        SubLObject var50 = (SubLObject)NIL;
        SubLObject var51_52 = (SubLObject)NIL;
        while (NIL != var49) {
            cdestructuring_bind.destructuring_bind_must_consp(var49, var43, (SubLObject)$ic21$);
            var51_52 = var49.first();
            var49 = var49.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var49, var43, (SubLObject)$ic21$);
            if (NIL == conses_high.member(var51_52, (SubLObject)$ic22$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var50 = (SubLObject)T;
            }
            if (var51_52 == $ic23$) {
                var48 = var49.first();
            }
            var49 = var49.rest();
        }
        if (NIL != var50 && NIL == var48) {
            cdestructuring_bind.cdestructuring_bind_error(var43, (SubLObject)$ic21$);
        }
        final SubLObject var51 = cdestructuring_bind.property_list_member((SubLObject)$ic24$, var44);
        final SubLObject var52 = (SubLObject)((NIL != var51) ? conses_high.cadr(var51) : NIL);
        final SubLObject var53 = cdestructuring_bind.property_list_member((SubLObject)$ic25$, var44);
        final SubLObject var54 = (SubLObject)((NIL != var53) ? conses_high.cadr(var53) : NIL);
        final SubLObject var55;
        var44 = (var55 = var45);
        final SubLObject var56 = (SubLObject)$ic26$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic27$, (SubLObject)$ic28$, (SubLObject)ConsesLow.list((SubLObject)$ic29$, (SubLObject)$ic30$, (SubLObject)ConsesLow.list((SubLObject)$ic31$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var56, (SubLObject)ConsesLow.list((SubLObject)$ic32$, var52))), (SubLObject)ConsesLow.listS((SubLObject)$ic33$, (SubLObject)ConsesLow.list(var46, var47, var56, (SubLObject)$ic0$, (SubLObject)$ic25$, var54), ConsesLow.append(var55, (SubLObject)NIL)))));
    }
    
    public static SubLObject f15669(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        final SubLObject var24 = module0096.$g1262$.currentBinding(var23);
        final SubLObject var25 = module0021.$g777$.currentBinding(var23);
        try {
            module0096.$g1262$.bind($g2454$.getGlobalValue(), var23);
            module0021.$g777$.bind((SubLObject)NIL, var23);
            module0021.f1151(module0107.f7590());
            final SubLObject var26 = module0244.f15766(var22);
            SubLObject var27 = (SubLObject)NIL;
            final SubLObject var28 = module0079.f5424(var26);
            SubLObject var31;
            for (SubLObject var29 = (SubLObject)NIL; NIL == var29; var29 = (SubLObject)makeBoolean(NIL == var31)) {
                var23.resetMultipleValues();
                final SubLObject var30 = module0052.f3693(var28);
                var31 = var23.secondMultipleValue();
                var23.resetMultipleValues();
                if (NIL != var31) {
                    SubLObject var33;
                    final SubLObject var32 = var33 = var30;
                    SubLObject var34 = (SubLObject)NIL;
                    SubLObject var35 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var33, var32, (SubLObject)$ic34$);
                    var34 = var33.first();
                    var33 = var33.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var33, var32, (SubLObject)$ic34$);
                    var35 = var33.first();
                    var33 = var33.rest();
                    if (NIL == var33) {
                        if (NIL == module0096.f6883(var35) || NIL == module0096.f6910(var35)) {
                            var27 = module0096.f6925(var26, $g2449$.getGlobalValue(), (SubLObject)NIL, var34, (SubLObject)UNPROVIDED);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var32, (SubLObject)$ic34$);
                    }
                }
            }
        }
        finally {
            module0021.$g777$.rebind(var25, var23);
            module0096.$g1262$.rebind(var24, var23);
        }
        return var22;
    }
    
    public static SubLObject f15670(final SubLObject var22) {
        module0096.f6942(module0244.f15766(var22));
        return var22;
    }
    
    public static SubLObject f15671() {
        SubLObject var28 = module0137.f8937();
        SubLObject var29 = (SubLObject)NIL;
        var29 = var28.first();
        while (NIL != var28) {
            final SubLObject var30 = module0138.$g1626$.getGlobalValue();
            SubLObject var31 = (SubLObject)NIL;
            try {
                var31 = ReadWriteLocks.rw_lock_seize_write_lock(var30);
                f15670(var29);
            }
            finally {
                if (NIL != var31) {
                    ReadWriteLocks.rw_lock_release_write_lock(var30);
                }
            }
            var28 = var28.rest();
            var29 = var28.first();
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f15672(final SubLObject var22) {
        final SubLObject var23 = f15654(var22);
        if (NIL != module0090.f6146(var23)) {
            return module0090.f6148(var23);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15673() {
        SubLObject var67 = (SubLObject)NIL;
        SubLObject var68 = module0137.f8937();
        SubLObject var69 = (SubLObject)NIL;
        var69 = var68.first();
        while (NIL != var68) {
            final SubLObject var70 = f15672(var69);
            if (NIL != module0090.f6183(var70)) {
                var67 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(module0137.f8917(var69), var70), var67);
            }
            var68 = var68.rest();
            var69 = var68.first();
        }
        return Sequences.nreverse(var67);
    }
    
    public static SubLObject f15674(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        final SubLObject var24 = module0137.f8917(var22);
        final SubLObject var25 = f15654(var22);
        if (NIL == module0090.f6127(var25)) {
            return Values.values(var24, (SubLObject)MINUS_ONE_INTEGER, (SubLObject)MINUS_ONE_INTEGER, (SubLObject)MINUS_ONE_INTEGER, (SubLObject)NIL);
        }
        var23.resetMultipleValues();
        final SubLObject var26 = module0090.f6199(var25);
        final SubLObject var27 = var23.secondMultipleValue();
        final SubLObject var28 = var23.thirdMultipleValue();
        final SubLObject var29 = var23.fourthMultipleValue();
        var23.resetMultipleValues();
        return Values.values(var24, var26, var27, var28, var29);
    }
    
    public static SubLObject f15675() {
        final SubLObject var72 = module0137.f8937();
        final SubLObject var73 = module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var74 = (SubLObject)NIL;
        SubLObject var75 = (SubLObject)ZERO_INTEGER;
        SubLObject var76 = var72;
        SubLObject var77 = (SubLObject)NIL;
        var77 = var76.first();
        while (NIL != var76) {
            final SubLObject var78 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f15674(var77)));
            final SubLObject var79 = var78.first();
            module0079.f5412(var73, var79, var78);
            var74 = (SubLObject)ConsesLow.cons(var79, var74);
            var75 = Numbers.max(var75, Sequences.length(module0597.f36628(var79)));
            var76 = var76.rest();
            var77 = var76.first();
        }
        module0038.f2648((SubLObject)T, var75);
        PrintLow.format((SubLObject)T, (SubLObject)$ic35$);
        module0038.f2648((SubLObject)T, var75);
        PrintLow.format((SubLObject)T, (SubLObject)$ic36$);
        var74 = (var76 = Sort.sort(var74, (SubLObject)$ic37$, (SubLObject)UNPROVIDED));
        SubLObject var80 = (SubLObject)NIL;
        var80 = var76.first();
        while (NIL != var76) {
            final SubLObject var78 = module0079.f5414(var73, var80, (SubLObject)UNPROVIDED);
            PrintLow.format((SubLObject)T, (SubLObject)$ic38$, var80);
            module0038.f2648((SubLObject)T, Numbers.subtract(var75, Sequences.length(module0597.f36628(var80))));
            SubLObject var82;
            final SubLObject var81 = var82 = var78;
            SubLObject var83 = (SubLObject)NIL;
            SubLObject var84 = (SubLObject)NIL;
            SubLObject var85 = (SubLObject)NIL;
            SubLObject var86 = (SubLObject)NIL;
            SubLObject var87 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var82, var81, (SubLObject)$ic39$);
            var83 = var82.first();
            var82 = var82.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var82, var81, (SubLObject)$ic39$);
            var84 = var82.first();
            var82 = var82.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var82, var81, (SubLObject)$ic39$);
            var85 = var82.first();
            var82 = var82.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var82, var81, (SubLObject)$ic39$);
            var86 = var82.first();
            var82 = var82.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var82, var81, (SubLObject)$ic39$);
            var87 = var82.first();
            var82 = var82.rest();
            if (NIL == var82) {
                if (var84.isNegative()) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic40$, new SubLObject[] { $ic41$, $ic41$, $ic41$ });
                }
                else {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic42$, new SubLObject[] { var84, var85, var86, (NIL != var87) ? $ic43$ : $ic44$ });
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var81, (SubLObject)$ic39$);
            }
            var76 = var76.rest();
            var80 = var76.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15676(SubLObject var81, SubLObject var82) {
        if (var81 == UNPROVIDED) {
            var81 = $g2456$.getGlobalValue();
        }
        if (var82 == UNPROVIDED) {
            var82 = $g2457$.getGlobalValue();
        }
        final SubLObject var83 = module0059.f4283((SubLObject)$ic46$);
        SubLObject var84 = (SubLObject)NIL;
        SubLObject var85 = (SubLObject)NIL;
        SubLObject var86;
        SubLObject var87;
        SubLObject var88;
        for (var86 = (SubLObject)NIL, var86 = (SubLObject)ZERO_INTEGER; var86.numL(var81); var86 = Numbers.add(var86, (SubLObject)ONE_INTEGER)) {
            var87 = Sequences.cconcatenate((SubLObject)$ic47$, module0006.f203(Numbers.add((SubLObject)ONE_INTEGER, var86)));
            var88 = module0004.f78(var87, (SubLObject)$ic48$, (SubLObject)ConsesLow.list(var82, var83));
            Threads.sleep((SubLObject)$ic49$);
            var84 = (SubLObject)ConsesLow.cons(var88, var84);
        }
        while (Sequences.position_if((SubLObject)$ic50$, var84, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).isNumber()) {
            Threads.sleep((SubLObject)ONE_INTEGER);
        }
        while (module0059.f4288(var83).isPositive()) {
            var85 = (SubLObject)ConsesLow.cons(module0059.f4285(var83), var85);
        }
        if (NIL != module0035.sublisp_boolean(var85)) {
            f15671();
        }
        return var85;
    }
    
    public static SubLObject f15677(final SubLObject var82, final SubLObject var83) {
        final SubLThread var84 = SubLProcess.currentSubLThread();
        SubLObject var85;
        SubLObject var86;
        SubLObject var87;
        SubLObject var88;
        for (var85 = (SubLObject)NIL, var85 = (SubLObject)ZERO_INTEGER; var85.numL(var82); var85 = Numbers.add(var85, (SubLObject)ONE_INTEGER)) {
            var86 = constants_high_oc.f10773((SubLObject)UNPROVIDED);
            var87 = (SubLObject)NIL;
            try {
                var84.throwStack.push(module0003.$g3$.getGlobalValue());
                var88 = Errors.$error_handler$.currentBinding(var84);
                try {
                    Errors.$error_handler$.bind((SubLObject)$ic51$, var84);
                    try {
                        module0259.f16891(var86, $ic52$);
                    }
                    catch (Throwable var89) {
                        Errors.handleThrowable(var89, (SubLObject)NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var88, var84);
                }
            }
            catch (Throwable var90) {
                var87 = Errors.handleThrowable(var90, module0003.$g3$.getGlobalValue());
            }
            finally {
                var84.throwStack.pop();
            }
            if (var87.isString()) {
                module0059.f4284((SubLObject)ConsesLow.cons(var86, var87), var83);
            }
        }
        return (SubLObject)$ic25$;
    }
    
    public static SubLObject f15678(SubLObject var81) {
        if (var81 == UNPROVIDED) {
            var81 = $g2456$.getGlobalValue();
        }
        final SubLObject var82 = module0059.f4283((SubLObject)$ic53$);
        SubLObject var83 = (SubLObject)NIL;
        SubLObject var84 = (SubLObject)NIL;
        final SubLObject var85 = (SubLObject)$ic54$;
        final SubLObject var86 = (SubLObject)ConsesLow.list(var81, var85, var82);
        SubLObject var87;
        SubLObject var88;
        SubLObject var89;
        for (var87 = (SubLObject)NIL, var87 = (SubLObject)ZERO_INTEGER; var87.numL(var81); var87 = Numbers.add(var87, (SubLObject)ONE_INTEGER)) {
            var88 = Sequences.cconcatenate((SubLObject)$ic47$, module0006.f203(Numbers.add((SubLObject)ONE_INTEGER, var87)));
            var89 = module0004.f78(var88, (SubLObject)$ic55$, var86);
            Threads.sleep((SubLObject)$ic49$);
            var83 = (SubLObject)ConsesLow.cons(var89, var83);
        }
        while (Sequences.position_if((SubLObject)$ic50$, var83, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).isNumber()) {
            Threads.sleep((SubLObject)ONE_INTEGER);
        }
        while (module0059.f4288(var82).isPositive()) {
            var84 = (SubLObject)ConsesLow.cons(module0059.f4285(var82), var84);
        }
        if (NIL != module0035.sublisp_boolean(var84)) {
            f15671();
        }
        return var84;
    }
    
    public static SubLObject f15679(final SubLObject var95, final SubLObject var93, final SubLObject var83) {
        final SubLThread var96 = SubLProcess.currentSubLThread();
        SubLObject var97 = (SubLObject)NIL;
        SubLObject var98 = var93;
        SubLObject var99 = (SubLObject)NIL;
        var99 = var98.first();
        while (NIL != var98) {
            SubLObject var100;
            SubLObject var101;
            SubLObject var102;
            for (var100 = (SubLObject)NIL, var100 = (SubLObject)ZERO_INTEGER; var100.numL(var95); var100 = Numbers.add(var100, (SubLObject)ONE_INTEGER)) {
                var101 = (SubLObject)NIL;
                try {
                    var96.throwStack.push(module0003.$g3$.getGlobalValue());
                    var102 = Errors.$error_handler$.currentBinding(var96);
                    try {
                        Errors.$error_handler$.bind((SubLObject)$ic51$, var96);
                        try {
                            module0256.f16552(var99, $ic56$, (SubLObject)UNPROVIDED);
                        }
                        catch (Throwable var103) {
                            Errors.handleThrowable(var103, (SubLObject)NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(var102, var96);
                    }
                }
                catch (Throwable var104) {
                    var101 = Errors.handleThrowable(var104, module0003.$g3$.getGlobalValue());
                }
                finally {
                    var96.throwStack.pop();
                }
                if (var101.isString()) {
                    var97 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var99, var100, var101), var97);
                }
            }
            var98 = var98.rest();
            var99 = var98.first();
        }
        var98 = Sequences.nreverse(var97);
        SubLObject var105 = (SubLObject)NIL;
        var105 = var98.first();
        while (NIL != var98) {
            module0059.f4284(var105, var83);
            var98 = var98.rest();
            var105 = var98.first();
        }
        return (SubLObject)$ic25$;
    }
    
    public static SubLObject f15680() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0242", "f15644", "S#18406", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0242", "f15645", "S#18407", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0242", "f15646", "S#18408", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0242", "f15647", "S#18409", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0242", "f15648", "S#9551", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0242", "f15649", "S#18410", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0242", "f15651", "S#18411", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0242", "f15650", "S#18412", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0242", "f15652", "S#18413", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0242", "f15654", "S#18414", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0242", "f15655", "S#18415", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0242", "f15653", "S#18416", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0242", "f15656", "S#18417", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0242", "f15657", "S#9559", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0242", "f15658", "S#18418", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0242", "f15659", "S#18419", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0242", "f15660", "S#18420", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0242", "f15661", "S#18421", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0242", "f15662", "S#18422", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0242", "f15663", "S#18423", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0242", "f15664", "S#11723", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0242", "f15665", "S#18424", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0242", "f15666", "S#18425", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0242", "f15667", "S#18426", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0242", "f15668", "S#15377");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0242", "f15669", "S#18427", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0242", "f15670", "S#18428", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0242", "f15671", "S#16699", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0242", "f15672", "S#18429", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0242", "f15673", "S#18430", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0242", "f15674", "S#18431", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0242", "f15675", "S#18432", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0242", "f15676", "S#18433", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0242", "f15677", "S#18434", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0242", "f15678", "S#18435", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0242", "f15679", "S#18436", 3, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15681() {
        $g2448$ = SubLFiles.deflexical("S#18437", Symbols.symbol_function((SubLObject)EQL));
        $g2449$ = SubLFiles.deflexical("S#18438", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic0$)) ? $g2449$.getGlobalValue() : NIL));
        $g2450$ = SubLFiles.deflexical("S#18439", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic1$)) ? $g2450$.getGlobalValue() : NIL));
        $g2451$ = SubLFiles.defparameter("S#18440", (SubLObject)TWO_INTEGER);
        $g2452$ = SubLFiles.defparameter("S#18441", (SubLObject)$ic2$);
        $g2453$ = SubLFiles.defparameter("S#18442", (SubLObject)T);
        $g2454$ = SubLFiles.deflexical("S#18443", (NIL != Symbols.boundp((SubLObject)$ic3$)) ? $g2454$.getGlobalValue() : Locks.make_lock((SubLObject)$ic4$));
        $g2455$ = SubLFiles.deflexical("S#18444", (SubLObject)$ic5$);
        $g2456$ = SubLFiles.deflexical("S#18445", (SubLObject)TWENTY_INTEGER);
        $g2457$ = SubLFiles.deflexical("S#18446", (SubLObject)$ic45$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15682() {
        module0003.f57((SubLObject)$ic0$);
        module0003.f57((SubLObject)$ic1$);
        module0003.f57((SubLObject)$ic3$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f15680();
    }
    
    public void initializeVariables() {
        f15681();
    }
    
    public void runTopLevelForms() {
        f15682();
    }
    
    static {
        me = (SubLFile)new module0242();
        $g2448$ = null;
        $g2449$ = null;
        $g2450$ = null;
        $g2451$ = null;
        $g2452$ = null;
        $g2453$ = null;
        $g2454$ = null;
        $g2455$ = null;
        $g2456$ = null;
        $g2457$ = null;
        $ic0$ = makeSymbol("S#18438", "CYC");
        $ic1$ = makeSymbol("S#18439", "CYC");
        $ic2$ = makeInteger(100);
        $ic3$ = makeSymbol("S#18443", "CYC");
        $ic4$ = makeString("SBHL File Vector Data Stream lock");
        $ic5$ = makeSymbol("S#7871", "CYC");
        $ic6$ = makeString("sbhl-module-graphs");
        $ic7$ = makeString("cfasl");
        $ic8$ = makeString("sbhl-module-graphs-index");
        $ic9$ = makeKeyword("INITIALIZED");
        $ic10$ = makeKeyword("UNINITIALIZED");
        $ic11$ = makeSymbol("S#7787", "CYC");
        $ic12$ = makeSymbol("S#11099", "CYC");
        $ic13$ = makeKeyword("ERROR");
        $ic14$ = makeString("~A is not a ~A");
        $ic15$ = makeSymbol("S#18404", "CYC");
        $ic16$ = makeKeyword("CERROR");
        $ic17$ = makeString("continue anyway");
        $ic18$ = makeKeyword("WARN");
        $ic19$ = makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic20$ = makeSymbol("S#11210", "CYC");
        $ic21$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11392", "CYC"), (SubLObject)makeSymbol("S#15376", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#205", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic22$ = ConsesLow.list((SubLObject)makeKeyword("MODULE"), (SubLObject)makeKeyword("DONE"));
        $ic23$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic24$ = makeKeyword("MODULE");
        $ic25$ = makeKeyword("DONE");
        $ic26$ = makeUninternedSymbol("US#1066897");
        $ic27$ = makeSymbol("S#8715", "CYC");
        $ic28$ = ConsesLow.list((SubLObject)makeSymbol("S#18443", "CYC"));
        $ic29$ = makeSymbol("S#2154", "CYC");
        $ic30$ = ConsesLow.list((SubLObject)makeSymbol("S#9571", "CYC"));
        $ic31$ = makeSymbol("CLET");
        $ic32$ = makeSymbol("S#11104", "CYC");
        $ic33$ = makeSymbol("S#8730", "CYC");
        $ic34$ = ConsesLow.list((SubLObject)makeSymbol("S#9182", "CYC"), (SubLObject)makeUninternedSymbol("US#102D8BE"));
        $ic35$ = makeString("Capacity      Hits    Misses  Small?~%");
        $ic36$ = makeString("------------------------------------~%");
        $ic37$ = makeSymbol("S#16704", "CYC");
        $ic38$ = makeString("~&~A");
        $ic39$ = ConsesLow.list((SubLObject)makeSymbol("S#18447", "CYC"), (SubLObject)makeSymbol("S#2959", "CYC"), (SubLObject)makeSymbol("S#18448", "CYC"), (SubLObject)makeSymbol("S#18449", "CYC"), (SubLObject)makeSymbol("S#18450", "CYC"));
        $ic40$ = makeString("~6,A ~9,A ~9,A~%");
        $ic41$ = makeString("---");
        $ic42$ = makeString("~6,d ~9,d ~9,d    ~A~%");
        $ic43$ = makeString("!!!");
        $ic44$ = makeString("");
        $ic45$ = makeInteger(500);
        $ic46$ = makeString("Concurrent Reads Stress Test Problems");
        $ic47$ = makeString("Concurrent SBHL Reader ");
        $ic48$ = makeSymbol("S#18434", "CYC");
        $ic49$ = (SubLFloat)makeDouble(0.1);
        $ic50$ = makeSymbol("VALID-PROCESS-P");
        $ic51$ = makeSymbol("S#38", "CYC");
        $ic52$ = constant_handles_oc.f8479((SubLObject)makeString("Individual"));
        $ic53$ = makeString("Concurrent Cache Strategy Stress Test Problems");
        $ic54$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Organism")));
        $ic55$ = makeSymbol("S#18436", "CYC");
        $ic56$ = constant_handles_oc.f8479((SubLObject)makeString("InferencePSC"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 271 ms
	
	Decompiled with Procyon 0.5.32.
*/