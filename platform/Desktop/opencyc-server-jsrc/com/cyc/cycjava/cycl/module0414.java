package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0414 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0414";
    public static final String myFingerPrint = "f6cc64af251e5704260805bd6d093b826afb3c69b93e3fff715f33118fa43b2c";
    private static SubLSymbol $g3376$;
    private static SubLSymbol $g3377$;
    private static SubLSymbol $g3378$;
    private static SubLSymbol $g3379$;
    public static SubLSymbol $g3380$;
    public static SubLSymbol $g3381$;
    private static SubLSymbol $g3382$;
    private static SubLSymbol $g3383$;
    private static SubLSymbol $g3384$;
    private static SubLSymbol $g3385$;
    private static SubLSymbol $g3386$;
    private static SubLSymbol $g3387$;
    public static SubLSymbol $g3388$;
    private static SubLSymbol $g3389$;
    private static SubLSymbol $g3390$;
    private static SubLSymbol $g3391$;
    private static SubLSymbol $g3392$;
    private static SubLSymbol $g3393$;
    private static final SubLSymbol $ic0$;
    private static final SubLInteger $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLString $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLList $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLList $ic19$;
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
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLString $ic38$;
    private static final SubLInteger $ic39$;
    private static final SubLInteger $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLString $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLString $ic46$;
    private static final SubLString $ic47$;
    private static final SubLString $ic48$;
    private static final SubLString $ic49$;
    private static final SubLString $ic50$;
    private static final SubLString $ic51$;
    private static final SubLString $ic52$;
    private static final SubLString $ic53$;
    private static final SubLString $ic54$;
    private static final SubLString $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLString $ic58$;
    private static final SubLString $ic59$;
    private static final SubLString $ic60$;
    private static final SubLFloat $ic61$;
    private static final SubLString $ic62$;
    private static final SubLString $ic63$;
    private static final SubLString $ic64$;
    private static final SubLString $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLList $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLInteger $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLString $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLString $ic73$;
    private static final SubLString $ic74$;
    private static final SubLString $ic75$;
    private static final SubLString $ic76$;
    private static final SubLString $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLList $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLList $ic81$;
    private static final SubLString $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLString $ic84$;
    private static final SubLInteger $ic85$;
    private static final SubLList $ic86$;
    private static final SubLString $ic87$;
    private static final SubLList $ic88$;
    private static final SubLString $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLString $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLString $ic96$;
    private static final SubLInteger $ic97$;
    private static final SubLString $ic98$;
    private static final SubLString $ic99$;
    private static final SubLString $ic100$;
    private static final SubLString $ic101$;
    private static final SubLString $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLObject $ic105$;
    
    
    public static SubLObject f28865(final SubLObject var1) {
        return Numbers.subtract(module0361.f24329(var1), module0361.f24228(var1));
    }
    
    public static SubLObject f28866(final SubLObject var1) {
        final SubLObject var2 = module0361.f24228(var1);
        return (SubLObject)(var2.isZero() ? ZERO_INTEGER : Numbers.divide(f28865(var1), var2));
    }
    
    public static SubLObject f28867() {
        $g3378$.setGlobalValue((SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28868() {
        $g3379$.setGlobalValue((SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28869(final SubLObject var3, final SubLObject var4) {
        if (NIL != var4) {
            final SubLObject var5 = (SubLObject)ConsesLow.cons(var3, (SubLObject)NIL);
            final SubLObject var6 = $g3379$.getGlobalValue();
            if (NIL != var6) {
                module0005.f188(var6, var5);
            }
            else {
                $g3379$.setGlobalValue(var5);
            }
        }
        else {
            final SubLObject var5 = (SubLObject)ConsesLow.cons(var3, (SubLObject)NIL);
            final SubLObject var6 = $g3378$.getGlobalValue();
            if (NIL != var6) {
                module0005.f188(var6, var5);
            }
            else {
                $g3378$.setGlobalValue(var5);
            }
        }
        return var3;
    }
    
    public static SubLObject f28870() {
        return $g3378$.getGlobalValue();
    }
    
    public static SubLObject f28871() {
        return $g3379$.getGlobalValue();
    }
    
    public static SubLObject f28872() {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        return $g3380$.getDynamicValue(var7);
    }
    
    public static SubLObject f28873() {
        $g3380$.setDynamicValue((SubLObject)T);
        return (SubLObject)T;
    }
    
    public static SubLObject f28874() {
        $g3380$.setDynamicValue((SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28875(final SubLObject var8, final SubLObject var9) {
        SubLObject var11;
        final SubLObject var10 = var11 = var8.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var11, var10, (SubLObject)$ic6$);
        final SubLObject var12 = var11.rest();
        var11 = var11.first();
        SubLObject var13 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var11, var10, (SubLObject)$ic6$);
        var13 = var11.first();
        var11 = var11.rest();
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = var11;
        SubLObject var16 = (SubLObject)NIL;
        SubLObject var17_18 = (SubLObject)NIL;
        while (NIL != var15) {
            cdestructuring_bind.destructuring_bind_must_consp(var15, var10, (SubLObject)$ic6$);
            var17_18 = var15.first();
            var15 = var15.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var15, var10, (SubLObject)$ic6$);
            if (NIL == conses_high.member(var17_18, (SubLObject)$ic7$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var16 = (SubLObject)T;
            }
            if (var17_18 == $ic8$) {
                var14 = var15.first();
            }
            var15 = var15.rest();
        }
        if (NIL != var16 && NIL == var14) {
            cdestructuring_bind.cdestructuring_bind_error(var10, (SubLObject)$ic6$);
        }
        final SubLObject var17 = cdestructuring_bind.property_list_member((SubLObject)$ic9$, var11);
        final SubLObject var18 = (SubLObject)((NIL != var17) ? conses_high.cadr(var17) : NIL);
        final SubLObject var19 = cdestructuring_bind.property_list_member((SubLObject)$ic10$, var11);
        final SubLObject var20 = (SubLObject)((NIL != var19) ? conses_high.cadr(var19) : NIL);
        final SubLObject var21 = cdestructuring_bind.property_list_member((SubLObject)$ic11$, var11);
        final SubLObject var22 = (SubLObject)((NIL != var21) ? conses_high.cadr(var21) : NIL);
        final SubLObject var23 = cdestructuring_bind.property_list_member((SubLObject)$ic12$, var11);
        final SubLObject var24 = (SubLObject)((NIL != var23) ? conses_high.cadr(var23) : NIL);
        final SubLObject var25;
        var11 = (var25 = var12);
        if (NIL != var22) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic13$, (SubLObject)ConsesLow.list(var13, (SubLObject)$ic14$, (SubLObject)$ic12$, var24), (SubLObject)ConsesLow.listS((SubLObject)$ic15$, (SubLObject)ConsesLow.list((SubLObject)$ic16$, var13, var18, var20), ConsesLow.append(var25, (SubLObject)NIL)));
        }
        final SubLObject var26 = (SubLObject)$ic17$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic18$, (SubLObject)ConsesLow.list(var13, var26, (SubLObject)$ic19$, (SubLObject)$ic12$, var24), (SubLObject)ConsesLow.list((SubLObject)$ic20$, var26), (SubLObject)ConsesLow.listS((SubLObject)$ic15$, (SubLObject)ConsesLow.list((SubLObject)$ic16$, var13, var18, var20), ConsesLow.append(var25, (SubLObject)NIL)));
    }
    
    public static SubLObject f28876() {
        return $g3376$.getGlobalValue();
    }
    
    public static SubLObject f28877() {
        SubLObject var28 = (SubLObject)NIL;
        final SubLObject var29 = $g3377$.getGlobalValue();
        SubLObject var30 = (SubLObject)NIL;
        try {
            var30 = Locks.seize_lock(var29);
            var28 = module0030.f1625(f28876());
        }
        finally {
            if (NIL != var30) {
                Locks.release_lock(var29);
            }
        }
        return var28;
    }
    
    public static SubLObject f28878(final SubLObject var31, final SubLObject var20, final SubLObject var4) {
        return (SubLObject)makeBoolean(NIL != assertion_handles_oc.f11041(var31, (SubLObject)UNPROVIDED) && (NIL == var20 || NIL != f28879(var31)) && (NIL == var4 || NIL != f28880(var31)));
    }
    
    public static SubLObject f28881() {
        return Vectors.make_vector((SubLObject)SIX_INTEGER, (SubLObject)ZERO_INTEGER);
    }
    
    public static SubLObject f28882() {
        final SubLObject var32 = $g3377$.getGlobalValue();
        SubLObject var33 = (SubLObject)NIL;
        try {
            var33 = Locks.seize_lock(var32);
            Hashtables.clrhash($g3376$.getGlobalValue());
            f28867();
        }
        finally {
            if (NIL != var33) {
                Locks.release_lock(var32);
            }
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f28883(final SubLObject var31) {
        SubLObject var32 = (SubLObject)NIL;
        final SubLObject var33 = $g3377$.getGlobalValue();
        SubLObject var34 = (SubLObject)NIL;
        try {
            var34 = Locks.seize_lock(var33);
            var32 = Hashtables.remhash(var31, $g3376$.getGlobalValue());
        }
        finally {
            if (NIL != var34) {
                Locks.release_lock(var33);
            }
        }
        return var32;
    }
    
    public static SubLObject f28884() {
        return Hashtables.hash_table_count($g3376$.getGlobalValue());
    }
    
    public static SubLObject f28885(final SubLObject var31) {
        return Hashtables.gethash_without_values(var31, $g3376$.getGlobalValue(), (SubLObject)$ic24$);
    }
    
    public static SubLObject f28886(final SubLObject var31) {
        SubLObject var32 = f28885(var31);
        if ($ic24$ == var32) {
            var32 = f28881();
            final SubLObject var33 = $g3377$.getGlobalValue();
            SubLObject var34 = (SubLObject)NIL;
            try {
                var34 = Locks.seize_lock(var33);
                Hashtables.sethash(var31, $g3376$.getGlobalValue(), var32);
            }
            finally {
                if (NIL != var34) {
                    Locks.release_lock(var33);
                }
            }
        }
        return var32;
    }
    
    public static SubLObject f28887(SubLObject var40, SubLObject var20, SubLObject var4) {
        if (var40 == UNPROVIDED) {
            var40 = (SubLObject)$ic25$;
        }
        if (var20 == UNPROVIDED) {
            var20 = (SubLObject)NIL;
        }
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        SubLObject var41 = (SubLObject)NIL;
        final SubLObject var42 = f28876();
        SubLObject var43 = (SubLObject)NIL;
        SubLObject var44 = (SubLObject)NIL;
        final Iterator var45 = Hashtables.getEntrySetIterator(var42);
        try {
            while (Hashtables.iteratorHasNext(var45)) {
                final Map.Entry var46 = Hashtables.iteratorNextEntry(var45);
                var43 = Hashtables.getEntryKey(var46);
                var44 = Hashtables.getEntryValue(var46);
                if (NIL != f28878(var43, var20, var4)) {
                    var41 = (SubLObject)ConsesLow.cons(var43, var41);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var45);
        }
        final SubLObject var47 = var40;
        if (var47.eql((SubLObject)$ic26$)) {
            var41 = Sort.sort(var41, Symbols.symbol_function((SubLObject)$ic27$), (SubLObject)$ic28$);
            var41 = Sort.stable_sort(var41, Symbols.symbol_function((SubLObject)$ic27$), (SubLObject)$ic29$);
        }
        else if (var47.eql((SubLObject)$ic30$)) {
            var41 = Sort.sort(var41, Symbols.symbol_function((SubLObject)$ic31$), (SubLObject)$ic29$);
            var41 = Sort.stable_sort(var41, Symbols.symbol_function((SubLObject)$ic27$), (SubLObject)$ic28$);
        }
        else if (var47.eql((SubLObject)$ic32$)) {
            var41 = Sort.sort(var41, Symbols.symbol_function((SubLObject)$ic27$), (SubLObject)$ic28$);
            var41 = Sort.stable_sort(var41, Symbols.symbol_function((SubLObject)$ic27$), (SubLObject)$ic33$);
        }
        else if (var47.eql((SubLObject)$ic34$)) {
            var41 = Sort.sort(var41, Symbols.symbol_function((SubLObject)$ic31$), (SubLObject)$ic29$);
            var41 = Sort.stable_sort(var41, Symbols.symbol_function((SubLObject)$ic27$), (SubLObject)$ic28$);
            var41 = Sort.stable_sort(var41, Symbols.symbol_function((SubLObject)$ic27$), (SubLObject)$ic35$);
        }
        return var41;
    }
    
    public static SubLObject f28888() {
        SubLObject var28 = (SubLObject)NIL;
        final SubLObject var29 = f28876();
        SubLObject var30 = (SubLObject)NIL;
        SubLObject var31 = (SubLObject)NIL;
        final Iterator var32 = Hashtables.getEntrySetIterator(var29);
        try {
            while (Hashtables.iteratorHasNext(var32)) {
                final Map.Entry var33 = Hashtables.iteratorNextEntry(var32);
                var30 = Hashtables.getEntryKey(var33);
                var31 = Hashtables.getEntryValue(var33);
                if (NIL != f28878(var30, (SubLObject)T, (SubLObject)NIL)) {
                    var28 = (SubLObject)ConsesLow.cons(var30, var28);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var32);
        }
        return Sequences.nreverse(var28);
    }
    
    public static SubLObject f28889() {
        SubLObject var28 = (SubLObject)NIL;
        final SubLObject var29 = f28876();
        SubLObject var30 = (SubLObject)NIL;
        SubLObject var31 = (SubLObject)NIL;
        final Iterator var32 = Hashtables.getEntrySetIterator(var29);
        try {
            while (Hashtables.iteratorHasNext(var32)) {
                final Map.Entry var33 = Hashtables.iteratorNextEntry(var32);
                var30 = Hashtables.getEntryKey(var33);
                var31 = Hashtables.getEntryValue(var33);
                if (NIL != f28878(var30, (SubLObject)NIL, (SubLObject)T)) {
                    var28 = (SubLObject)ConsesLow.cons(var30, var28);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var32);
        }
        return Sequences.nreverse(var28);
    }
    
    public static SubLObject f28890() {
        SubLObject var46 = (SubLObject)ZERO_INTEGER;
        final SubLObject var47 = f28876();
        SubLObject var48 = (SubLObject)NIL;
        SubLObject var49 = (SubLObject)NIL;
        final Iterator var50 = Hashtables.getEntrySetIterator(var47);
        try {
            while (Hashtables.iteratorHasNext(var50)) {
                final Map.Entry var51 = Hashtables.iteratorNextEntry(var50);
                var48 = Hashtables.getEntryKey(var51);
                var49 = Hashtables.getEntryValue(var51);
                if (NIL != f28878(var48, (SubLObject)T, (SubLObject)NIL)) {
                    var46 = Numbers.add(var46, (SubLObject)ONE_INTEGER);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var50);
        }
        return var46;
    }
    
    public static SubLObject f28891() {
        SubLObject var46 = (SubLObject)ZERO_INTEGER;
        final SubLObject var47 = f28876();
        SubLObject var48 = (SubLObject)NIL;
        SubLObject var49 = (SubLObject)NIL;
        final Iterator var50 = Hashtables.getEntrySetIterator(var47);
        try {
            while (Hashtables.iteratorHasNext(var50)) {
                final Map.Entry var51 = Hashtables.iteratorNextEntry(var50);
                var48 = Hashtables.getEntryKey(var51);
                var49 = Hashtables.getEntryValue(var51);
                if (NIL != f28878(var48, (SubLObject)NIL, (SubLObject)T)) {
                    var46 = Numbers.add(var46, (SubLObject)ONE_INTEGER);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var50);
        }
        return var46;
    }
    
    public static SubLObject f28892() {
        final SubLObject var41 = f28876();
        SubLObject var42 = (SubLObject)NIL;
        SubLObject var43 = (SubLObject)NIL;
        final Iterator var44 = Hashtables.getEntrySetIterator(var41);
        try {
            while (Hashtables.iteratorHasNext(var44)) {
                final Map.Entry var45 = Hashtables.iteratorNextEntry(var44);
                var42 = Hashtables.getEntryKey(var45);
                var43 = Hashtables.getEntryValue(var45);
                if (NIL != f28878(var42, (SubLObject)T, (SubLObject)NIL)) {
                    return (SubLObject)T;
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var44);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28893() {
        final SubLObject var41 = f28876();
        SubLObject var42 = (SubLObject)NIL;
        SubLObject var43 = (SubLObject)NIL;
        final Iterator var44 = Hashtables.getEntrySetIterator(var41);
        try {
            while (Hashtables.iteratorHasNext(var44)) {
                final Map.Entry var45 = Hashtables.iteratorNextEntry(var44);
                var42 = Hashtables.getEntryKey(var45);
                var43 = Hashtables.getEntryValue(var45);
                if (NIL != f28878(var42, (SubLObject)NIL, (SubLObject)T)) {
                    return (SubLObject)T;
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var44);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28894() {
        SubLObject var47 = (SubLObject)ZERO_INTEGER;
        final SubLObject var48 = f28876();
        SubLObject var49 = (SubLObject)NIL;
        SubLObject var50 = (SubLObject)NIL;
        final Iterator var51 = Hashtables.getEntrySetIterator(var48);
        try {
            while (Hashtables.iteratorHasNext(var51)) {
                final Map.Entry var52 = Hashtables.iteratorNextEntry(var51);
                var49 = Hashtables.getEntryKey(var52);
                var50 = Hashtables.getEntryValue(var52);
                if (NIL != f28878(var49, (SubLObject)NIL, (SubLObject)NIL)) {
                    var47 = Numbers.add(var47, f28895(var49));
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var51);
        }
        return var47;
    }
    
    public static SubLObject f28896() {
        SubLObject var47 = (SubLObject)ZERO_INTEGER;
        final SubLObject var48 = f28876();
        SubLObject var49 = (SubLObject)NIL;
        SubLObject var50 = (SubLObject)NIL;
        final Iterator var51 = Hashtables.getEntrySetIterator(var48);
        try {
            while (Hashtables.iteratorHasNext(var51)) {
                final Map.Entry var52 = Hashtables.iteratorNextEntry(var51);
                var49 = Hashtables.getEntryKey(var52);
                var50 = Hashtables.getEntryValue(var52);
                if (NIL != f28878(var49, (SubLObject)T, (SubLObject)NIL)) {
                    var47 = Numbers.add(var47, f28895(var49));
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var51);
        }
        return var47;
    }
    
    public static SubLObject f28897() {
        SubLObject var47 = (SubLObject)ZERO_INTEGER;
        final SubLObject var48 = f28876();
        SubLObject var49 = (SubLObject)NIL;
        SubLObject var50 = (SubLObject)NIL;
        final Iterator var51 = Hashtables.getEntrySetIterator(var48);
        try {
            while (Hashtables.iteratorHasNext(var51)) {
                final Map.Entry var52 = Hashtables.iteratorNextEntry(var51);
                var49 = Hashtables.getEntryKey(var52);
                var50 = Hashtables.getEntryValue(var52);
                if (NIL != f28878(var49, (SubLObject)NIL, (SubLObject)T)) {
                    var47 = Numbers.add(var47, f28895(var49));
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var51);
        }
        return var47;
    }
    
    public static SubLObject f28895(final SubLObject var31) {
        f28898();
        final SubLObject var32 = f28885(var31);
        return (SubLObject)(($ic24$ == var32) ? ZERO_INTEGER : Numbers.add(Vectors.aref(var32, (SubLObject)ZERO_INTEGER), Vectors.aref(var32, (SubLObject)FOUR_INTEGER)));
    }
    
    public static SubLObject f28899(final SubLObject var31) {
        final SubLObject var32 = f28885(var31);
        return (SubLObject)(($ic24$ == var32) ? ZERO_INTEGER : Vectors.aref(var32, (SubLObject)TWO_INTEGER));
    }
    
    public static SubLObject f28900(final SubLObject var31) {
        f28898();
        final SubLObject var32 = f28885(var31);
        return (SubLObject)(($ic24$ == var32) ? ZERO_INTEGER : Vectors.aref(var32, (SubLObject)FOUR_INTEGER));
    }
    
    public static SubLObject f28879(final SubLObject var31) {
        return Numbers.plusp(f28899(var31));
    }
    
    public static SubLObject f28880(final SubLObject var31) {
        return Numbers.plusp(f28900(var31));
    }
    
    public static SubLObject f28901() {
        SubLObject var47 = (SubLObject)ZERO_INTEGER;
        final SubLObject var48 = f28876();
        SubLObject var49 = (SubLObject)NIL;
        SubLObject var50 = (SubLObject)NIL;
        final Iterator var51 = Hashtables.getEntrySetIterator(var48);
        try {
            while (Hashtables.iteratorHasNext(var51)) {
                final Map.Entry var52 = Hashtables.iteratorNextEntry(var51);
                var49 = Hashtables.getEntryKey(var52);
                var50 = Hashtables.getEntryValue(var52);
                if (NIL != f28878(var49, (SubLObject)NIL, (SubLObject)NIL)) {
                    var47 = Numbers.add(var47, f28902(var49));
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var51);
        }
        return var47;
    }
    
    public static SubLObject f28903() {
        SubLObject var47 = (SubLObject)ZERO_INTEGER;
        final SubLObject var48 = f28876();
        SubLObject var49 = (SubLObject)NIL;
        SubLObject var50 = (SubLObject)NIL;
        final Iterator var51 = Hashtables.getEntrySetIterator(var48);
        try {
            while (Hashtables.iteratorHasNext(var51)) {
                final Map.Entry var52 = Hashtables.iteratorNextEntry(var51);
                var49 = Hashtables.getEntryKey(var52);
                var50 = Hashtables.getEntryValue(var52);
                if (NIL != f28878(var49, (SubLObject)T, (SubLObject)NIL)) {
                    var47 = Numbers.add(var47, f28902(var49));
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var51);
        }
        return var47;
    }
    
    public static SubLObject f28904() {
        SubLObject var47 = (SubLObject)ZERO_INTEGER;
        final SubLObject var48 = f28876();
        SubLObject var49 = (SubLObject)NIL;
        SubLObject var50 = (SubLObject)NIL;
        final Iterator var51 = Hashtables.getEntrySetIterator(var48);
        try {
            while (Hashtables.iteratorHasNext(var51)) {
                final Map.Entry var52 = Hashtables.iteratorNextEntry(var51);
                var49 = Hashtables.getEntryKey(var52);
                var50 = Hashtables.getEntryValue(var52);
                if (NIL != f28878(var49, (SubLObject)NIL, (SubLObject)T)) {
                    var47 = Numbers.add(var47, f28902(var49));
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var51);
        }
        return var47;
    }
    
    public static SubLObject f28902(final SubLObject var31) {
        f28898();
        final SubLObject var32 = f28885(var31);
        return (SubLObject)(($ic24$ == var32) ? ZERO_INTEGER : Numbers.add(Vectors.aref(var32, (SubLObject)ONE_INTEGER), Vectors.aref(var32, (SubLObject)FIVE_INTEGER)));
    }
    
    public static SubLObject f28905(final SubLObject var31) {
        final SubLObject var32 = f28885(var31);
        return (SubLObject)(($ic24$ == var32) ? ZERO_INTEGER : Vectors.aref(var32, (SubLObject)THREE_INTEGER));
    }
    
    public static SubLObject f28906(final SubLObject var31) {
        f28898();
        final SubLObject var32 = f28885(var31);
        return (SubLObject)(($ic24$ == var32) ? ZERO_INTEGER : Vectors.aref(var32, (SubLObject)FIVE_INTEGER));
    }
    
    public static SubLObject f28907(final SubLObject var31, SubLObject var48) {
        if (var48 == UNPROVIDED) {
            var48 = (SubLObject)ZERO_INTEGER;
        }
        final SubLObject var49 = f28895(var31);
        if (!var49.isPositive()) {
            return var48;
        }
        final SubLObject var50 = f28902(var31);
        return Numbers.divide(var50, var49);
    }
    
    public static SubLObject f28908(final SubLObject var31, final SubLObject var20, SubLObject var46, SubLObject var4) {
        if (var46 == UNPROVIDED) {
            var46 = (SubLObject)ONE_INTEGER;
        }
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        final SubLThread var47 = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles_oc.f11035(var31) : var31;
        assert NIL != Types.integerp(var46) : var46;
        if (NIL == module0004.f105(var46)) {
            Errors.warn((SubLObject)$ic38$);
        }
        final SubLObject var48 = f28886(var31);
        if (NIL != $g3380$.getDynamicValue(var47)) {
            if (NIL == var4) {
                Vectors.set_aref(var48, (SubLObject)ZERO_INTEGER, Numbers.add(Vectors.aref(var48, (SubLObject)ZERO_INTEGER), var46));
            }
            if (NIL != var20) {
                Vectors.set_aref(var48, (SubLObject)TWO_INTEGER, Numbers.add(Vectors.aref(var48, (SubLObject)TWO_INTEGER), var46));
            }
            if (NIL != var4) {
                Vectors.set_aref(var48, (SubLObject)FOUR_INTEGER, Numbers.add(Vectors.aref(var48, (SubLObject)FOUR_INTEGER), var46));
            }
        }
        return Vectors.aref(var48, (SubLObject)ZERO_INTEGER);
    }
    
    public static SubLObject f28909(final SubLObject var31, final SubLObject var20, SubLObject var46, SubLObject var4) {
        if (var46 == UNPROVIDED) {
            var46 = (SubLObject)ONE_INTEGER;
        }
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        final SubLThread var47 = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles_oc.f11035(var31) : var31;
        assert NIL != Types.integerp(var46) : var46;
        final SubLObject var48 = f28886(var31);
        if (NIL != $g3380$.getDynamicValue(var47)) {
            if (NIL == var4) {
                Vectors.set_aref(var48, (SubLObject)ONE_INTEGER, Numbers.add(Vectors.aref(var48, (SubLObject)ONE_INTEGER), var46));
            }
            if (NIL != var20) {
                Vectors.set_aref(var48, (SubLObject)THREE_INTEGER, Numbers.add(Vectors.aref(var48, (SubLObject)THREE_INTEGER), var46));
            }
            if (NIL != var4) {
                Vectors.set_aref(var48, (SubLObject)FIVE_INTEGER, Numbers.add(Vectors.aref(var48, (SubLObject)FIVE_INTEGER), var46));
            }
        }
        return Vectors.aref(var48, (SubLObject)ONE_INTEGER);
    }
    
    public static SubLObject f28910() {
        SubLObject var46 = (SubLObject)ZERO_INTEGER;
        final SubLObject var47 = f28876();
        SubLObject var48 = (SubLObject)NIL;
        SubLObject var49 = (SubLObject)NIL;
        final Iterator var50 = Hashtables.getEntrySetIterator(var47);
        try {
            while (Hashtables.iteratorHasNext(var50)) {
                final Map.Entry var51 = Hashtables.iteratorNextEntry(var50);
                var48 = Hashtables.getEntryKey(var51);
                var49 = Hashtables.getEntryValue(var51);
                if (NIL != f28878(var48, (SubLObject)T, (SubLObject)NIL)) {
                    f28911(var48);
                    var46 = Numbers.add(var46, (SubLObject)ONE_INTEGER);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var50);
        }
        return var46;
    }
    
    public static SubLObject f28912() {
        SubLObject var46 = (SubLObject)ZERO_INTEGER;
        f28868();
        final SubLObject var47 = f28876();
        SubLObject var48 = (SubLObject)NIL;
        SubLObject var49 = (SubLObject)NIL;
        final Iterator var50 = Hashtables.getEntrySetIterator(var47);
        try {
            while (Hashtables.iteratorHasNext(var50)) {
                final Map.Entry var51 = Hashtables.iteratorNextEntry(var50);
                var48 = Hashtables.getEntryKey(var51);
                var49 = Hashtables.getEntryValue(var51);
                if (NIL != f28878(var48, (SubLObject)NIL, (SubLObject)T)) {
                    f28913(var48);
                    var46 = Numbers.add(var46, (SubLObject)ONE_INTEGER);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var50);
        }
        return var46;
    }
    
    public static SubLObject f28911(final SubLObject var31) {
        assert NIL != assertion_handles_oc.f11035(var31) : var31;
        final SubLObject var32 = f28886(var31);
        Vectors.set_aref(var32, (SubLObject)TWO_INTEGER, (SubLObject)ZERO_INTEGER);
        Vectors.set_aref(var32, (SubLObject)THREE_INTEGER, (SubLObject)ZERO_INTEGER);
        return (SubLObject)ZERO_INTEGER;
    }
    
    public static SubLObject f28913(final SubLObject var31) {
        assert NIL != assertion_handles_oc.f11035(var31) : var31;
        f28898();
        final SubLObject var32 = f28886(var31);
        Vectors.set_aref(var32, (SubLObject)FOUR_INTEGER, (SubLObject)ZERO_INTEGER);
        Vectors.set_aref(var32, (SubLObject)FIVE_INTEGER, (SubLObject)ZERO_INTEGER);
        return (SubLObject)ZERO_INTEGER;
    }
    
    public static SubLObject f28914() {
        SubLObject var46 = (SubLObject)ZERO_INTEGER;
        SubLObject var47 = (SubLObject)NIL;
        final SubLObject var48 = $g3377$.getGlobalValue();
        SubLObject var49 = (SubLObject)NIL;
        try {
            var49 = Locks.seize_lock(var48);
            module0030.f1595($g3376$.getGlobalValue());
            SubLObject var50 = (SubLObject)NIL;
            SubLObject var51 = (SubLObject)NIL;
            final Iterator var52 = Hashtables.getEntrySetIterator($g3376$.getGlobalValue());
            try {
                while (Hashtables.iteratorHasNext(var52)) {
                    final Map.Entry var53 = Hashtables.iteratorNextEntry(var52);
                    var50 = Hashtables.getEntryKey(var53);
                    var51 = Hashtables.getEntryValue(var53);
                    if (NIL == assertion_handles_oc.f11041(var50, (SubLObject)UNPROVIDED) || NIL == module0178.f11290(var50) || Vectors.aref(var51, (SubLObject)ZERO_INTEGER).isZero()) {
                        var47 = (SubLObject)ConsesLow.cons(var50, var47);
                    }
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(var52);
            }
            SubLObject var54 = var47;
            SubLObject var55 = (SubLObject)NIL;
            var55 = var54.first();
            while (NIL != var54) {
                f28883(var55);
                var46 = Numbers.add(var46, (SubLObject)ONE_INTEGER);
                var54 = var54.rest();
                var55 = var54.first();
            }
        }
        finally {
            if (NIL != var49) {
                Locks.release_lock(var48);
            }
        }
        return var46;
    }
    
    public static SubLObject f28915(final SubLObject var55) {
        return (SubLObject)makeBoolean(var55.isInteger() && var55.numGE((SubLObject)$ic39$) && var55.numLE((SubLObject)$ic40$));
    }
    
    public static SubLObject f28916(final SubLObject var31, final SubLObject var56) {
        final SubLThread var57 = SubLProcess.currentSubLThread();
        final SubLObject var58 = inference_datastructures_inference_oc.f25524(var56);
        if (ZERO_INTEGER.numE($g3381$.getDynamicValue(var57)) && $ic39$.numE(var58)) {
            return (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(f28902(var31).numL($g3381$.getDynamicValue(var57)) || f28917(var31).numL(var58));
    }
    
    public static SubLObject f28918(SubLObject var58) {
        if (var58 == UNPROVIDED) {
            var58 = (SubLObject)ONE_INTEGER;
        }
        final SubLObject var59 = f28887((SubLObject)$ic34$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var60 = f28901();
        final SubLObject var61 = Numbers.ceiling(Numbers.multiply(var58, var60), (SubLObject)UNPROVIDED);
        SubLObject var62 = (SubLObject)ZERO_INTEGER;
        SubLObject var63 = var59;
        SubLObject var64 = (SubLObject)NIL;
        var64 = var63.first();
        while (NIL != var63) {
            final SubLObject var65 = f28902(var64);
            var62 = Numbers.add(var62, var65);
            if (var62.numGE(var61)) {
                return f28917(var64);
            }
            var63 = var63.rest();
            var64 = var63.first();
        }
        return (SubLObject)$ic39$;
    }
    
    public static SubLObject f28919(SubLObject var63) {
        if (var63 == UNPROVIDED) {
            var63 = (SubLObject)ZERO_INTEGER;
        }
        final SubLObject var64 = f28887((SubLObject)$ic34$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var65 = (SubLObject)ZERO_INTEGER;
        SubLObject var66 = (SubLObject)ZERO_INTEGER;
        SubLObject var67 = var64;
        SubLObject var68 = (SubLObject)NIL;
        var68 = var67.first();
        while (NIL != var67) {
            if (!f28917(var68).numGE(var63)) {
                final SubLObject var69 = f28895(var68);
                final SubLObject var70 = f28902(var68);
                var65 = Numbers.add(var65, var69);
                var66 = Numbers.add(var66, var70);
            }
            var67 = var67.rest();
            var68 = var67.first();
        }
        return Values.values(var65, var66);
    }
    
    public static SubLObject f28920(SubLObject var20, SubLObject var4) {
        if (var20 == UNPROVIDED) {
            var20 = (SubLObject)NIL;
        }
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        SubLObject var21 = (SubLObject)NIL;
        final SubLObject var22 = f28876();
        SubLObject var23 = (SubLObject)NIL;
        SubLObject var24 = (SubLObject)NIL;
        final Iterator var25 = Hashtables.getEntrySetIterator(var22);
        try {
            while (Hashtables.iteratorHasNext(var25)) {
                final Map.Entry var26 = Hashtables.iteratorNextEntry(var25);
                var23 = Hashtables.getEntryKey(var26);
                var24 = Hashtables.getEntryValue(var26);
                if (NIL != f28878(var23, var20, var4) && f28902(var23).isPositive()) {
                    var21 = (SubLObject)ConsesLow.cons(var23, var21);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var25);
        }
        return Sort.sort(var21, Symbols.symbol_function((SubLObject)$ic27$), Symbols.symbol_function((SubLObject)$ic28$));
    }
    
    public static SubLObject f28921() {
        SubLObject var28 = (SubLObject)NIL;
        final SubLObject var29 = f28876();
        SubLObject var30 = (SubLObject)NIL;
        SubLObject var31 = (SubLObject)NIL;
        final Iterator var32 = Hashtables.getEntrySetIterator(var29);
        try {
            while (Hashtables.iteratorHasNext(var32)) {
                final Map.Entry var33 = Hashtables.iteratorNextEntry(var32);
                var30 = Hashtables.getEntryKey(var33);
                var31 = Hashtables.getEntryValue(var33);
                if (NIL != f28878(var30, (SubLObject)NIL, (SubLObject)NIL) && !f28902(var30).isPositive()) {
                    var28 = (SubLObject)ConsesLow.cons(var30, var28);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var32);
        }
        return Sort.sort(var28, Symbols.symbol_function((SubLObject)$ic27$), Symbols.symbol_function((SubLObject)$ic29$));
    }
    
    public static SubLObject f28922(final SubLObject var68) {
        final SubLObject var69 = f28920((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var70 = (SubLObject)NIL;
        SubLObject var71 = var69;
        SubLObject var72 = (SubLObject)NIL;
        var72 = var71.first();
        while (NIL != var71) {
            if (NIL != module0161.f10513(var68, module0178.f11287(var72))) {
                var70 = (SubLObject)ConsesLow.cons(var72, var70);
            }
            var71 = var71.rest();
            var72 = var71.first();
        }
        return Sequences.nreverse(var70);
    }
    
    public static SubLObject f28923(final SubLObject var68) {
        final SubLObject var69 = f28921();
        SubLObject var70 = (SubLObject)NIL;
        SubLObject var71 = var69;
        SubLObject var72 = (SubLObject)NIL;
        var72 = var71.first();
        while (NIL != var71) {
            if (NIL != module0161.f10513(var68, module0178.f11287(var72))) {
                var70 = (SubLObject)ConsesLow.cons(var72, var70);
            }
            var71 = var71.rest();
            var72 = var71.first();
        }
        return Sequences.nreverse(var70);
    }
    
    public static SubLObject f28924(final SubLObject var70) {
        final SubLObject var71 = f28921();
        SubLObject var72 = (SubLObject)NIL;
        SubLObject var73 = var71;
        SubLObject var74 = (SubLObject)NIL;
        var74 = var73.first();
        while (NIL != var73) {
            if (NIL == module0004.f104(module0178.f11287(var74), var70, Symbols.symbol_function((SubLObject)$ic41$), (SubLObject)UNPROVIDED)) {
                var72 = (SubLObject)ConsesLow.cons(var74, var72);
            }
            var73 = var73.rest();
            var74 = var73.first();
        }
        return Sequences.nreverse(var72);
    }
    
    public static SubLObject f28925() {
        final SubLObject var71 = module0077.f5313((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var72 = f28876();
        SubLObject var73 = (SubLObject)NIL;
        SubLObject var74 = (SubLObject)NIL;
        final Iterator var75 = Hashtables.getEntrySetIterator(var72);
        try {
            while (Hashtables.iteratorHasNext(var75)) {
                final Map.Entry var76 = Hashtables.iteratorNextEntry(var75);
                var73 = Hashtables.getEntryKey(var76);
                var74 = Hashtables.getEntryValue(var76);
                if (NIL != f28878(var73, (SubLObject)NIL, (SubLObject)NIL) && f28902(var73).isPositive()) {
                    final SubLObject var77 = module0178.f11287(var73);
                    module0077.f5326(var77, var71);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var75);
        }
        return module0077.f5312(var71);
    }
    
    public static SubLObject f28926() {
        final SubLObject var71 = module0077.f5313((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var72 = module0077.f5313((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var73 = f28876();
        SubLObject var74 = (SubLObject)NIL;
        SubLObject var75 = (SubLObject)NIL;
        final Iterator var76 = Hashtables.getEntrySetIterator(var73);
        try {
            while (Hashtables.iteratorHasNext(var76)) {
                final Map.Entry var77 = Hashtables.iteratorNextEntry(var76);
                var74 = Hashtables.getEntryKey(var77);
                var75 = Hashtables.getEntryValue(var77);
                if (NIL != f28878(var74, (SubLObject)NIL, (SubLObject)NIL)) {
                    final SubLObject var78 = module0178.f11287(var74);
                    module0077.f5326(var78, var72);
                    if (!f28902(var74).isPositive()) {
                        continue;
                    }
                    module0077.f5326(var78, var71);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var76);
        }
        final SubLObject var79 = module0077.f5313((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var80 = module0077.f5333(var72);
        SubLObject var81;
        SubLObject var82;
        SubLObject var83;
        for (var81 = module0032.f1741(var80), var82 = (SubLObject)NIL, var82 = module0032.f1742(var81, var80); NIL == module0032.f1744(var81, var82); var82 = module0032.f1743(var82)) {
            var83 = module0032.f1745(var81, var82);
            if (NIL != module0032.f1746(var82, var83) && NIL == module0077.f5320(var83, var71)) {
                module0077.f5326(var83, var79);
            }
        }
        return module0077.f5312(var79);
    }
    
    public static SubLObject f28927(final SubLObject var77) {
        SubLObject var78 = (SubLObject)NIL;
        final SubLObject var79 = f28876();
        SubLObject var80 = (SubLObject)NIL;
        SubLObject var81 = (SubLObject)NIL;
        final Iterator var82 = Hashtables.getEntrySetIterator(var79);
        try {
            while (Hashtables.iteratorHasNext(var82)) {
                final Map.Entry var83 = Hashtables.iteratorNextEntry(var82);
                var80 = Hashtables.getEntryKey(var83);
                var81 = Hashtables.getEntryValue(var83);
                if (NIL != f28878(var80, (SubLObject)NIL, (SubLObject)NIL) && f28902(var80).isPositive()) {
                    SubLObject var84;
                    SubLObject var85;
                    SubLObject var86;
                    for (var84 = (SubLObject)NIL, var85 = (SubLObject)NIL, var85 = module0232.f15306(module0178.f11282(var80)); NIL == var84 && NIL != var85; var85 = var85.rest()) {
                        var86 = var85.first();
                        if (var77.equal(module0205.f13333(var86))) {
                            var84 = (SubLObject)T;
                        }
                    }
                    for (var85 = (SubLObject)NIL, var85 = module0232.f15308(module0178.f11282(var80)); NIL == var84 && NIL != var85; var85 = var85.rest()) {
                        var86 = var85.first();
                        if (var77.equal(module0205.f13333(var86))) {
                            var84 = (SubLObject)T;
                        }
                    }
                    if (NIL == var84) {
                        continue;
                    }
                    var78 = (SubLObject)ConsesLow.cons(var80, var78);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var82);
        }
        return Sort.sort(var78, Symbols.symbol_function((SubLObject)$ic27$), Symbols.symbol_function((SubLObject)$ic28$));
    }
    
    public static SubLObject f28928(final SubLObject var77) {
        SubLObject var78 = (SubLObject)NIL;
        final SubLObject var79 = f28876();
        SubLObject var80 = (SubLObject)NIL;
        SubLObject var81 = (SubLObject)NIL;
        final Iterator var82 = Hashtables.getEntrySetIterator(var79);
        try {
            while (Hashtables.iteratorHasNext(var82)) {
                final Map.Entry var83 = Hashtables.iteratorNextEntry(var82);
                var80 = Hashtables.getEntryKey(var83);
                var81 = Hashtables.getEntryValue(var83);
                if (NIL != f28878(var80, (SubLObject)NIL, (SubLObject)NIL) && !f28902(var80).isPositive()) {
                    SubLObject var84;
                    SubLObject var85;
                    SubLObject var86;
                    for (var84 = (SubLObject)NIL, var85 = (SubLObject)NIL, var85 = module0232.f15306(module0178.f11282(var80)); NIL == var84 && NIL != var85; var85 = var85.rest()) {
                        var86 = var85.first();
                        if (var77.equal(module0205.f13333(var86))) {
                            var84 = (SubLObject)T;
                        }
                    }
                    for (var85 = (SubLObject)NIL, var85 = module0232.f15308(module0178.f11282(var80)); NIL == var84 && NIL != var85; var85 = var85.rest()) {
                        var86 = var85.first();
                        if (var77.equal(module0205.f13333(var86))) {
                            var84 = (SubLObject)T;
                        }
                    }
                    if (NIL == var84) {
                        continue;
                    }
                    var78 = (SubLObject)ConsesLow.cons(var80, var78);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var82);
        }
        return Sort.sort(var78, Symbols.symbol_function((SubLObject)$ic27$), Symbols.symbol_function((SubLObject)$ic29$));
    }
    
    public static SubLObject f28929() {
        final SubLObject var83 = module0077.f5313((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var84 = f28876();
        SubLObject var85 = (SubLObject)NIL;
        SubLObject var86 = (SubLObject)NIL;
        final Iterator var87 = Hashtables.getEntrySetIterator(var84);
        try {
            while (Hashtables.iteratorHasNext(var87)) {
                final Map.Entry var88 = Hashtables.iteratorNextEntry(var87);
                var85 = Hashtables.getEntryKey(var88);
                var86 = Hashtables.getEntryValue(var88);
                if (NIL != f28878(var85, (SubLObject)NIL, (SubLObject)NIL)) {
                    final SubLObject var89 = Numbers.plusp(f28902(var85));
                    SubLObject var90 = module0232.f15306(module0178.f11282(var85));
                    SubLObject var91 = (SubLObject)NIL;
                    var91 = var90.first();
                    while (NIL != var90) {
                        final SubLObject var92 = module0205.f13333(var91);
                        if (NIL != module0173.f10955(var92) && NIL != var89) {
                            module0077.f5326(var92, var83);
                        }
                        var90 = var90.rest();
                        var91 = var90.first();
                    }
                    var90 = module0232.f15308(module0178.f11282(var85));
                    var91 = (SubLObject)NIL;
                    var91 = var90.first();
                    while (NIL != var90) {
                        final SubLObject var92 = module0205.f13333(var91);
                        if (NIL != module0173.f10955(var92) && NIL != var89) {
                            module0077.f5326(var92, var83);
                        }
                        var90 = var90.rest();
                        var91 = var90.first();
                    }
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var87);
        }
        return module0077.f5312(var83);
    }
    
    public static SubLObject f28930() {
        final SubLObject var83 = module0077.f5313((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var84 = module0077.f5313((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var85 = f28876();
        SubLObject var86 = (SubLObject)NIL;
        SubLObject var87 = (SubLObject)NIL;
        final Iterator var88 = Hashtables.getEntrySetIterator(var85);
        try {
            while (Hashtables.iteratorHasNext(var88)) {
                final Map.Entry var89 = Hashtables.iteratorNextEntry(var88);
                var86 = Hashtables.getEntryKey(var89);
                var87 = Hashtables.getEntryValue(var89);
                if (NIL != f28878(var86, (SubLObject)NIL, (SubLObject)NIL)) {
                    final SubLObject var90 = Numbers.plusp(f28902(var86));
                    SubLObject var91 = module0232.f15306(module0178.f11282(var86));
                    SubLObject var92 = (SubLObject)NIL;
                    var92 = var91.first();
                    while (NIL != var91) {
                        final SubLObject var93 = module0205.f13333(var92);
                        if (NIL != module0173.f10955(var93)) {
                            module0077.f5326(var93, var84);
                            if (NIL != var90) {
                                module0077.f5326(var93, var83);
                            }
                        }
                        var91 = var91.rest();
                        var92 = var91.first();
                    }
                    var91 = module0232.f15308(module0178.f11282(var86));
                    var92 = (SubLObject)NIL;
                    var92 = var91.first();
                    while (NIL != var91) {
                        final SubLObject var93 = module0205.f13333(var92);
                        if (NIL != module0173.f10955(var93)) {
                            module0077.f5326(var93, var84);
                            if (NIL != var90) {
                                module0077.f5326(var93, var83);
                            }
                        }
                        var91 = var91.rest();
                        var92 = var91.first();
                    }
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var88);
        }
        final SubLObject var94 = module0077.f5313((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var95 = module0077.f5333(var84);
        SubLObject var96;
        SubLObject var97;
        SubLObject var98;
        for (var96 = module0032.f1741(var95), var97 = (SubLObject)NIL, var97 = module0032.f1742(var96, var95); NIL == module0032.f1744(var96, var97); var97 = module0032.f1743(var97)) {
            var98 = module0032.f1745(var96, var97);
            if (NIL != module0032.f1746(var97, var98) && NIL == module0077.f5320(var98, var83)) {
                module0077.f5326(var98, var94);
            }
        }
        return module0077.f5312(var94);
    }
    
    public static SubLObject f28931(final SubLObject var31, SubLObject var86) {
        if (var86 == UNPROVIDED) {
            var86 = (SubLObject)$ic40$;
        }
        assert NIL != module0178.f11290(var31) : var31;
        f28908(var31, (SubLObject)T, var86, (SubLObject)UNPROVIDED);
        f28909(var31, (SubLObject)T, var86, (SubLObject)UNPROVIDED);
        return var31;
    }
    
    public static SubLObject f28932(final SubLObject var56, SubLObject var86) {
        if (var86 == UNPROVIDED) {
            var86 = (SubLObject)$ic40$;
        }
        SubLObject var88;
        final SubLObject var87 = var88 = inference_datastructures_inference_oc.f25807(var56);
        SubLObject var89 = (SubLObject)NIL;
        var89 = var88.first();
        while (NIL != var88) {
            f28931(var89, var86);
            var88 = var88.rest();
            var89 = var88.first();
        }
        return Sequences.length(var87);
    }
    
    public static SubLObject f28933(final SubLObject var56, SubLObject var86) {
        if (var86 == UNPROVIDED) {
            var86 = (SubLObject)$ic40$;
        }
        final SubLObject var87 = inference_datastructures_inference_oc.f25421(var56);
        final SubLObject var88 = module0361.f24331(var87);
        final SubLObject var89 = inference_datastructures_inference_oc.f25807(var56);
        SubLObject var90 = var88;
        SubLObject var91 = (SubLObject)NIL;
        var91 = var90.first();
        while (NIL != var90) {
            f28908(var91, (SubLObject)T, var86, (SubLObject)UNPROVIDED);
            var90 = var90.rest();
            var91 = var90.first();
        }
        var90 = var89;
        var91 = (SubLObject)NIL;
        var91 = var90.first();
        while (NIL != var90) {
            f28909(var91, (SubLObject)T, var86, (SubLObject)UNPROVIDED);
            var90 = var90.rest();
            var91 = var90.first();
        }
        return Values.values(Sequences.length(var89), Sequences.length(var88));
    }
    
    public static SubLObject f28934(final SubLObject var3, SubLObject var88) {
        if (var88 == UNPROVIDED) {
            var88 = (SubLObject)NIL;
        }
        final SubLThread var89 = SubLProcess.currentSubLThread();
        f28914();
        SubLObject var90 = (SubLObject)NIL;
        try {
            final SubLObject var91 = stream_macros.$stream_requires_locking$.currentBinding(var89);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var89);
                var90 = compatibility.open_binary(var3, (SubLObject)$ic43$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var91, var89);
            }
            if (!var90.isStream()) {
                Errors.error((SubLObject)$ic44$, var3);
            }
            final SubLObject var91_92 = var90;
            final SubLObject var92 = f28884();
            module0021.f1038(var92, var91_92);
            SubLObject var93 = f28877();
            SubLObject var94 = (SubLObject)NIL;
            var94 = var93.first();
            while (NIL != var93) {
                if (NIL != f28878(var94, (SubLObject)NIL, (SubLObject)NIL)) {
                    f28935(var91_92, var94, (SubLObject)NIL, (SubLObject)NIL, var88);
                }
                var93 = var93.rest();
                var94 = var93.first();
            }
        }
        finally {
            final SubLObject var95 = Threads.$is_thread_performing_cleanupP$.currentBinding(var89);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var89);
                if (var90.isStream()) {
                    streams_high.close(var90, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var95, var89);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28936(final SubLObject var3, SubLObject var93, SubLObject var4) {
        if (var93 == UNPROVIDED) {
            var93 = (SubLObject)T;
        }
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        return f28937(var3, var93, (SubLObject)NIL, var4);
    }
    
    public static SubLObject f28938(final SubLObject var3, final SubLObject var28, SubLObject var93, SubLObject var4) {
        if (var93 == UNPROVIDED) {
            var93 = (SubLObject)T;
        }
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        return f28937(var3, var93, var28, var4);
    }
    
    public static SubLObject f28937(final SubLObject var3, final SubLObject var93, final SubLObject var94, final SubLObject var4) {
        final SubLThread var95 = SubLProcess.currentSubLThread();
        final SubLObject var96 = (SubLObject)((NIL != var94) ? module0078.f5367(var94, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : NIL);
        f28939(var3, var93, var4);
        SubLObject var97 = (SubLObject)NIL;
        try {
            final SubLObject var98 = stream_macros.$stream_requires_locking$.currentBinding(var95);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var95);
                var97 = compatibility.open_binary(var3, (SubLObject)$ic45$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var98, var95);
            }
            if (!var97.isStream()) {
                Errors.error((SubLObject)$ic44$, var3);
            }
            final SubLObject var91_97 = var97;
            SubLObject var99;
            SubLObject var100;
            for (var99 = module0021.f1060(var91_97, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var100 = (SubLObject)NIL, var100 = (SubLObject)ZERO_INTEGER; var100.numL(var99); var100 = Numbers.add(var100, (SubLObject)ONE_INTEGER)) {
                f28940(var91_97, var96, var4);
            }
        }
        finally {
            final SubLObject var101 = Threads.$is_thread_performing_cleanupP$.currentBinding(var95);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var95);
                if (var97.isStream()) {
                    streams_high.close(var97, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var101, var95);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28939(final SubLObject var3, final SubLObject var93, final SubLObject var4) {
        final SubLThread var94 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var94) && NIL == $g3380$.getDynamicValue(var94)) {
            Errors.error((SubLObject)$ic46$);
        }
        if (NIL == var93) {
            f28882();
        }
        f28869(var3, var4);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28941(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)NIL;
        try {
            final SubLObject var6 = stream_macros.$stream_requires_locking$.currentBinding(var4);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var4);
                var5 = compatibility.open_binary(var3, (SubLObject)$ic43$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var6, var4);
            }
            if (!var5.isStream()) {
                Errors.error((SubLObject)$ic44$, var3);
            }
            final SubLObject var91_100 = var5;
            final SubLObject var7 = f28890();
            module0021.f1038(var7, var91_100);
            SubLObject var8 = f28877();
            SubLObject var9 = (SubLObject)NIL;
            var9 = var8.first();
            while (NIL != var8) {
                if (NIL != f28878(var9, (SubLObject)T, (SubLObject)NIL)) {
                    final SubLObject var10 = (SubLObject)NIL;
                    f28935(var91_100, var9, (SubLObject)T, (SubLObject)NIL, var10);
                }
                var8 = var8.rest();
                var9 = var8.first();
            }
        }
        finally {
            final SubLObject var11 = Threads.$is_thread_performing_cleanupP$.currentBinding(var4);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var4);
                if (var5.isStream()) {
                    streams_high.close(var5, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var11, var4);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28942(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)NIL;
        try {
            final SubLObject var6 = stream_macros.$stream_requires_locking$.currentBinding(var4);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var4);
                var5 = compatibility.open_binary(var3, (SubLObject)$ic43$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var6, var4);
            }
            if (!var5.isStream()) {
                Errors.error((SubLObject)$ic44$, var3);
            }
            final SubLObject var91_102 = var5;
            final SubLObject var7 = f28891();
            module0021.f1038(var7, var91_102);
            SubLObject var8 = f28877();
            SubLObject var9 = (SubLObject)NIL;
            var9 = var8.first();
            while (NIL != var8) {
                if (NIL != f28878(var9, (SubLObject)NIL, (SubLObject)T)) {
                    final SubLObject var10 = (SubLObject)NIL;
                    f28935(var91_102, var9, (SubLObject)NIL, (SubLObject)T, var10);
                }
                var8 = var8.rest();
                var9 = var8.first();
            }
        }
        finally {
            final SubLObject var11 = Threads.$is_thread_performing_cleanupP$.currentBinding(var4);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var4);
                if (var5.isStream()) {
                    streams_high.close(var5, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var11, var4);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28935(final SubLObject var91, final SubLObject var31, final SubLObject var20, final SubLObject var4, final SubLObject var88) {
        if (NIL != var88) {
            module0021.f1038(var31, var91);
        }
        else {
            module0021.f1040(var31, var91);
        }
        final SubLObject var92 = f28943(var31, var20, var4);
        final SubLObject var93 = f28944(var31, var20, var4);
        module0021.f1038(var92, var91);
        module0021.f1038(var93, var91);
        return var31;
    }
    
    public static SubLObject f28943(final SubLObject var31, final SubLObject var20, final SubLObject var4) {
        if (NIL != var20) {
            return f28899(var31);
        }
        if (NIL != var4) {
            return f28900(var31);
        }
        return f28895(var31);
    }
    
    public static SubLObject f28944(final SubLObject var31, final SubLObject var20, final SubLObject var4) {
        if (NIL != var20) {
            return f28905(var31);
        }
        if (NIL != var4) {
            return f28906(var31);
        }
        return f28902(var31);
    }
    
    public static SubLObject f28940(final SubLObject var91, final SubLObject var95, final SubLObject var4) {
        final SubLObject var96 = module0021.f1060(var91, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var97 = module0021.f1060(var91, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var98 = module0021.f1060(var91, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != module0004.f106(var97) && NIL != module0004.f106(var98) && NIL != assertion_handles_oc.f11041(var96, (SubLObject)UNPROVIDED) && (NIL == var95 || NIL == module0077.f5320(var96, var95))) {
            f28908(var96, (SubLObject)NIL, var97, var4);
            f28909(var96, (SubLObject)NIL, var98, var4);
        }
        return var96;
    }
    
    public static SubLObject f28945(SubLObject var91, SubLObject var40) {
        if (var91 == UNPROVIDED) {
            var91 = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (var40 == UNPROVIDED) {
            var40 = (SubLObject)$ic34$;
        }
        final SubLObject var92 = f28887(var40, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        PrintLow.format(var91, (SubLObject)$ic47$);
        PrintLow.format(var91, (SubLObject)$ic48$, Sequences.length(var92), var40);
        PrintLow.format(var91, (SubLObject)$ic47$);
        SubLObject var93 = var92;
        SubLObject var94 = (SubLObject)NIL;
        var94 = var93.first();
        while (NIL != var93) {
            final SubLObject var95 = f28895(var94);
            final SubLObject var96 = f28902(var94);
            final SubLObject var97 = f28907(var94, (SubLObject)UNPROVIDED);
            final SubLObject var98 = f28917(var94);
            PrintLow.format(var91, (SubLObject)$ic49$, new SubLObject[] { var96, var95, module0048.f3302(Numbers.multiply((SubLObject)$ic40$, var97), (SubLObject)FOUR_INTEGER), var98, var94 });
            var93 = var93.rest();
            var94 = var93.first();
        }
        return Sequences.length(var92);
    }
    
    public static SubLObject f28946() {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        if (NIL != Locks.lock_idle_p($g3382$.getDynamicValue(var7))) {
            return f28947();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28947() {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        if (NIL != f28892()) {
            final SubLObject var8 = $g3382$.getDynamicValue(var7);
            SubLObject var9 = (SubLObject)NIL;
            try {
                var9 = Locks.seize_lock(var8);
                f28948();
            }
            finally {
                if (NIL != var9) {
                    Locks.release_lock(var8);
                }
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28949() {
        return module0038.f2669(module0038.f2669(module0572.f35040(module0572.f35041((SubLObject)$ic51$)), (SubLObject)$ic52$, (SubLObject)$ic53$), (SubLObject)$ic54$, (SubLObject)$ic55$);
    }
    
    public static SubLObject f28948() {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        SubLObject var8 = (SubLObject)NIL;
        final SubLObject var9 = f28949();
        SubLObject var10 = (SubLObject)NIL;
        if (NIL != var9) {
            try {
                var7.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var11 = Errors.$error_handler$.currentBinding(var7);
                try {
                    Errors.$error_handler$.bind((SubLObject)$ic56$, var7);
                    try {
                        if (NIL != f28941(var9) && NIL == var10) {
                            var8 = (SubLObject)T;
                        }
                    }
                    catch (Throwable var12) {
                        Errors.handleThrowable(var12, (SubLObject)NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var11, var7);
                }
            }
            catch (Throwable var13) {
                var10 = Errors.handleThrowable(var13, module0003.$g3$.getGlobalValue());
            }
            finally {
                var7.throwStack.pop();
            }
        }
        return var8;
    }
    
    public static SubLObject f28950(final SubLObject var111, final SubLObject var112) {
        f28936(var111, (SubLObject)NIL, (SubLObject)UNPROVIDED);
        return f28951(var112);
    }
    
    public static SubLObject f28951(final SubLObject var112) {
        return f28952(var112, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f28953() {
        f28912();
        return f28952(module0572.f35051(), (SubLObject)T);
    }
    
    public static SubLObject f28954(final SubLObject var3) {
        f28912();
        return f28955(var3, (SubLObject)T);
    }
    
    public static SubLObject f28952(final SubLObject var113, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        final SubLThread var114 = SubLProcess.currentSubLThread();
        SubLObject var115 = (SubLObject)ZERO_INTEGER;
        assert NIL != Filesys.directory_p(var113) : var113;
        SubLObject var116 = Filesys.directory(var113, (SubLObject)T);
        final SubLObject var117 = (SubLObject)$ic58$;
        final SubLObject var118 = module0012.$silent_progressP$.currentBinding(var114);
        try {
            module0012.$silent_progressP$.bind((SubLObject)makeBoolean(!var117.isString()), var114);
            if (NIL.isFunctionSpec()) {
                var116 = Sort.sort(var116, (SubLObject)NIL, (SubLObject)UNPROVIDED);
            }
            final SubLObject var119 = var116;
            module0012.$g82$.setDynamicValue(var117, var114);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var114);
            module0012.$g83$.setDynamicValue(Sequences.length(var119), var114);
            module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var114);
            final SubLObject var90_117 = module0012.$g75$.currentBinding(var114);
            final SubLObject var120 = module0012.$g76$.currentBinding(var114);
            final SubLObject var121 = module0012.$g77$.currentBinding(var114);
            final SubLObject var122 = module0012.$g78$.currentBinding(var114);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var114);
                module0012.$g76$.bind((SubLObject)NIL, var114);
                module0012.$g77$.bind((SubLObject)T, var114);
                module0012.$g78$.bind(Time.get_universal_time(), var114);
                module0012.f478(module0012.$g82$.getDynamicValue(var114));
                SubLObject var123 = var119;
                SubLObject var124 = (SubLObject)NIL;
                var124 = var123.first();
                while (NIL != var123) {
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var114), module0012.$g83$.getDynamicValue(var114));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var114), (SubLObject)ONE_INTEGER), var114);
                    if (NIL != f28956(var124)) {
                        f28955(var124, var4);
                        var115 = Numbers.add(var115, (SubLObject)ONE_INTEGER);
                    }
                    var123 = var123.rest();
                    var124 = var123.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var122, var114);
                module0012.$g77$.rebind(var121, var114);
                module0012.$g76$.rebind(var120, var114);
                module0012.$g75$.rebind(var90_117, var114);
            }
        }
        finally {
            module0012.$silent_progressP$.rebind(var118, var114);
        }
        return var115;
    }
    
    public static SubLObject f28956(final SubLObject var55) {
        return (SubLObject)makeBoolean(var55.isString() && NIL != module0038.f2673(var55, (SubLObject)$ic59$, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f28955(final SubLObject var3, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        try {
            var5.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var8 = Errors.$error_handler$.currentBinding(var5);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic56$, var5);
                try {
                    var6 = f28936(var3, (SubLObject)T, var4);
                }
                catch (Throwable var9) {
                    Errors.handleThrowable(var9, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var8, var5);
            }
        }
        catch (Throwable var10) {
            var7 = Errors.handleThrowable(var10, module0003.$g3$.getGlobalValue());
        }
        finally {
            var5.throwStack.pop();
        }
        if (var7.isString()) {
            Errors.warn((SubLObject)$ic60$, var7);
        }
        return var6;
    }
    
    public static SubLObject f28917(final SubLObject var31) {
        assert NIL != module0178.f11290(var31) : var31;
        return f28957(f28902(var31), f28895(var31));
    }
    
    public static SubLObject f28958(final SubLObject var123, final SubLObject var124) {
        return Numbers.numG(f28917(var123), f28917(var124));
    }
    
    public static SubLObject f28959(SubLObject var48) {
        if (var48 == UNPROVIDED) {
            var48 = (SubLObject)ZERO_INTEGER;
        }
        SubLObject var49 = (SubLObject)ZERO_INTEGER;
        SubLObject var50 = (SubLObject)ZERO_INTEGER;
        final SubLObject var51 = f28876();
        SubLObject var52 = (SubLObject)NIL;
        SubLObject var53 = (SubLObject)NIL;
        final Iterator var54 = Hashtables.getEntrySetIterator(var51);
        try {
            while (Hashtables.iteratorHasNext(var54)) {
                final Map.Entry var55 = Hashtables.iteratorNextEntry(var54);
                var52 = Hashtables.getEntryKey(var55);
                var53 = Hashtables.getEntryValue(var55);
                if (NIL != f28878(var52, (SubLObject)NIL, (SubLObject)NIL)) {
                    var49 = Numbers.add(var49, f28902(var52));
                    var50 = Numbers.add(var50, f28895(var52));
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var54);
        }
        if (!var50.isPositive()) {
            return var48;
        }
        return Numbers.divide(var49, var50);
    }
    
    public static SubLObject f28957(final SubLObject var50, final SubLObject var49) {
        final SubLThread var51 = SubLProcess.currentSubLThread();
        return f28960(var50, var49, $g3383$.getDynamicValue(var51), $g3384$.getDynamicValue(var51));
    }
    
    public static SubLObject f28960(final SubLObject var50, final SubLObject var49, final SubLObject var125, final SubLObject var126) {
        if (!var49.isPositive()) {
            return (SubLObject)ZERO_INTEGER;
        }
        final SubLObject var127 = Numbers.divide(var50, var49);
        if (var127.numG(var125)) {
            final SubLObject var128 = Numbers.multiply(var126, Numbers.divide(Numbers.subtract(var127, var125), Numbers.subtract((SubLObject)ONE_INTEGER, var125)), Numbers.integer_length(var49));
            final SubLObject var129 = Numbers.truncate(Numbers.min((SubLObject)$ic40$, var128), (SubLObject)UNPROVIDED);
            return var129;
        }
        if (var127.numL(var125)) {
            final SubLObject var128 = Numbers.multiply(var126, Numbers.divide(Numbers.subtract(var127, var125), var125), Numbers.integer_length(var49));
            final SubLObject var129 = Numbers.truncate(Numbers.max((SubLObject)$ic39$, var128), (SubLObject)UNPROVIDED);
            return var129;
        }
        return (SubLObject)ZERO_INTEGER;
    }
    
    public static SubLObject f28961(final SubLObject var113) {
        final SubLThread var114 = SubLProcess.currentSubLThread();
        SubLObject var115 = (SubLObject)ZERO_INTEGER;
        assert NIL != Filesys.directory_p(var113) : var113;
        SubLObject var116 = Filesys.directory(var113, (SubLObject)T);
        final SubLObject var117 = (SubLObject)$ic62$;
        final SubLObject var118 = module0012.$silent_progressP$.currentBinding(var114);
        try {
            module0012.$silent_progressP$.bind((SubLObject)makeBoolean(!var117.isString()), var114);
            if (NIL.isFunctionSpec()) {
                var116 = Sort.sort(var116, (SubLObject)NIL, (SubLObject)UNPROVIDED);
            }
            final SubLObject var119 = var116;
            module0012.$g82$.setDynamicValue(var117, var114);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var114);
            module0012.$g83$.setDynamicValue(Sequences.length(var119), var114);
            module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var114);
            final SubLObject var90_128 = module0012.$g75$.currentBinding(var114);
            final SubLObject var120 = module0012.$g76$.currentBinding(var114);
            final SubLObject var121 = module0012.$g77$.currentBinding(var114);
            final SubLObject var122 = module0012.$g78$.currentBinding(var114);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var114);
                module0012.$g76$.bind((SubLObject)NIL, var114);
                module0012.$g77$.bind((SubLObject)T, var114);
                module0012.$g78$.bind(Time.get_universal_time(), var114);
                module0012.f478(module0012.$g82$.getDynamicValue(var114));
                SubLObject var123 = var119;
                SubLObject var124 = (SubLObject)NIL;
                var124 = var123.first();
                while (NIL != var123) {
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var114), module0012.$g83$.getDynamicValue(var114));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var114), (SubLObject)ONE_INTEGER), var114);
                    if (NIL != f28956(var124)) {
                        var115 = Numbers.add(var115, f28962(var124));
                    }
                    var123 = var123.rest();
                    var124 = var123.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var122, var114);
                module0012.$g77$.rebind(var121, var114);
                module0012.$g76$.rebind(var120, var114);
                module0012.$g75$.rebind(var90_128, var114);
            }
        }
        finally {
            module0012.$silent_progressP$.rebind(var118, var114);
        }
        return var115;
    }
    
    public static SubLObject f28962(final SubLObject var3) {
        SubLObject var4 = (SubLObject)ZERO_INTEGER;
        final SubLObject var5 = f28963(var3, (SubLObject)NIL);
        if (NIL != var5) {
            var4 = f28914();
            if (NIL != module0004.f105(var4)) {
                module0006.f218((SubLObject)T, (SubLObject)$ic63$, var4, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var6 = module0038.f2699((SubLObject)$ic64$, (SubLObject)$ic55$, var3, (SubLObject)UNPROVIDED);
                Filesys.rename_file(var3, var6);
                f28934(var3, (SubLObject)NIL);
            }
        }
        else {
            Errors.warn((SubLObject)$ic65$, var3);
        }
        return var4;
    }
    
    public static SubLObject f28963(final SubLObject var3, final SubLObject var93) {
        final SubLThread var94 = SubLProcess.currentSubLThread();
        SubLObject var95 = (SubLObject)NIL;
        SubLObject var96 = (SubLObject)NIL;
        try {
            var94.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var97 = Errors.$error_handler$.currentBinding(var94);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic56$, var94);
                try {
                    f28939(var3, var93, (SubLObject)NIL);
                    final SubLObject var90_132 = module0021.$g747$.currentBinding(var94);
                    final SubLObject var98 = module0021.$g748$.currentBinding(var94);
                    try {
                        module0021.$g747$.bind((SubLObject)T, var94);
                        module0021.$g748$.bind((SubLObject)NIL, var94);
                        SubLObject var99 = (SubLObject)NIL;
                        try {
                            final SubLObject var90_133 = stream_macros.$stream_requires_locking$.currentBinding(var94);
                            try {
                                stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var94);
                                var99 = compatibility.open_binary(var3, (SubLObject)$ic45$);
                            }
                            finally {
                                stream_macros.$stream_requires_locking$.rebind(var90_133, var94);
                            }
                            if (!var99.isStream()) {
                                Errors.error((SubLObject)$ic44$, var3);
                            }
                            final SubLObject var91_135 = var99;
                            final SubLObject var100 = module0021.f1060(var91_135, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            for (SubLObject var101 = Equality.eq((SubLObject)$ic66$, module0021.f1088(var91_135, (SubLObject)NIL, (SubLObject)$ic66$)); NIL == var101; var101 = Equality.eq((SubLObject)$ic66$, module0021.f1088(var91_135, (SubLObject)NIL, (SubLObject)$ic66$))) {
                                f28940(var91_135, (SubLObject)NIL, (SubLObject)NIL);
                            }
                        }
                        finally {
                            final SubLObject var90_134 = Threads.$is_thread_performing_cleanupP$.currentBinding(var94);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var94);
                                if (var99.isStream()) {
                                    streams_high.close(var99, (SubLObject)UNPROVIDED);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var90_134, var94);
                            }
                        }
                    }
                    finally {
                        module0021.$g748$.rebind(var98, var94);
                        module0021.$g747$.rebind(var90_132, var94);
                    }
                    var95 = (SubLObject)T;
                }
                catch (Throwable var102) {
                    Errors.handleThrowable(var102, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var97, var94);
            }
        }
        catch (Throwable var103) {
            var96 = Errors.handleThrowable(var103, module0003.$g3$.getGlobalValue());
        }
        finally {
            var94.throwStack.pop();
        }
        if (var96.isString()) {
            Errors.warn((SubLObject)$ic60$, var96);
        }
        return var95;
    }
    
    public static SubLObject f28898() {
        if (NIL != f28964()) {
            return (SubLObject)NIL;
        }
        SubLObject var54 = module0030.f1630($g3376$.getGlobalValue());
        SubLObject var55 = (SubLObject)NIL;
        var55 = var54.first();
        while (NIL != var54) {
            SubLObject var57;
            final SubLObject var56 = var57 = var55;
            SubLObject var58 = (SubLObject)NIL;
            SubLObject var59 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var57, var56, (SubLObject)$ic67$);
            var58 = var57.first();
            var57 = (var59 = var57.rest());
            final SubLObject var60 = module0037.f2563(var59, (SubLObject)TWO_INTEGER, (SubLObject)ZERO_INTEGER);
            Hashtables.sethash(var58, $g3376$.getGlobalValue(), var60);
            var54 = var54.rest();
            var55 = var54.first();
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f28964() {
        final SubLObject var141 = module0030.f1626($g3376$.getGlobalValue());
        return Numbers.numE((SubLObject)SIX_INTEGER, Sequences.length(var141));
    }
    
    public static SubLObject f28965(final SubLObject var31) {
        assert NIL != assertion_handles_oc.f11035(var31) : var31;
        return Hashtables.gethash_without_values(var31, $g3385$.getGlobalValue(), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f28966(final SubLObject var31, final SubLObject var143) {
        assert NIL != assertion_handles_oc.f11035(var31) : var31;
        assert NIL != module0032.f1724(var143) : var143;
        return Hashtables.sethash(var31, $g3385$.getGlobalValue(), var143);
    }
    
    public static SubLObject f28967(final SubLObject var123, final SubLObject var124) {
        return module0032.f1731(var124, f28965(var123), Symbols.symbol_function((SubLObject)EQL));
    }
    
    public static SubLObject f28968(final SubLObject var31) {
        return module0032.f1753(f28965(var31));
    }
    
    public static SubLObject f28969(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = Sequences.length(var28);
        if (var30.numL((SubLObject)TWO_INTEGER)) {
            return (SubLObject)ZERO_INTEGER;
        }
        final SubLObject var31 = module0048.f3457(var30, (SubLObject)TWO_INTEGER);
        SubLObject var32 = (SubLObject)ZERO_INTEGER;
        SubLObject var33 = var28;
        SubLObject var34 = (SubLObject)NIL;
        var34 = var33.first();
        while (NIL != var33) {
            SubLObject var54_145 = var28;
            SubLObject var35 = (SubLObject)NIL;
            var35 = var54_145.first();
            while (NIL != var54_145) {
                if (!var34.eql(var35) && NIL != f28967(var34, var35)) {
                    var32 = Numbers.add(var32, (SubLObject)ONE_INTEGER);
                }
                var54_145 = var54_145.rest();
                var35 = var54_145.first();
            }
            var33 = var33.rest();
            var34 = var33.first();
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var29) && NIL == Numbers.evenp(var32)) {
            Errors.error((SubLObject)$ic73$, var28);
        }
        var32 = Numbers.integerDivide(var32, (SubLObject)TWO_INTEGER);
        return Numbers.divide(var32, var31);
    }
    
    public static SubLObject f28970(final SubLObject var28) {
        return Numbers.round(Numbers.multiply((SubLObject)$ic40$, f28969(var28)), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f28971(final SubLObject var147, final SubLObject var148) {
        if (!var147.eql(var148)) {
            final SubLObject var149 = $g3386$.getGlobalValue();
            SubLObject var150 = (SubLObject)NIL;
            try {
                var150 = Locks.seize_lock(var149);
                SubLObject var151 = f28965(var147);
                var151 = module0032.f1736(var148, var151, Symbols.symbol_function((SubLObject)EQL));
                f28966(var147, var151);
            }
            finally {
                if (NIL != var150) {
                    Locks.release_lock(var149);
                }
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28972(final SubLObject var28) {
        if (NIL != module0035.f2000(var28, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED)) {
            SubLObject var29 = var28;
            SubLObject var30 = (SubLObject)NIL;
            var30 = var29.first();
            while (NIL != var29) {
                SubLObject var54_152 = var28;
                SubLObject var31 = (SubLObject)NIL;
                var31 = var54_152.first();
                while (NIL != var54_152) {
                    if (!var30.eql(var31)) {
                        f28971(var30, var31);
                    }
                    var54_152 = var54_152.rest();
                    var31 = var54_152.first();
                }
                var29 = var29.rest();
                var30 = var29.first();
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28973(SubLObject var91) {
        if (var91 == UNPROVIDED) {
            var91 = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject var92 = module0030.f1625($g3385$.getGlobalValue());
        SubLObject var93;
        var92 = (var93 = Sort.sort(var92, Symbols.symbol_function((SubLObject)$ic27$), Symbols.symbol_function((SubLObject)$ic35$)));
        SubLObject var94 = (SubLObject)NIL;
        var94 = var93.first();
        while (NIL != var93) {
            SubLObject var95 = f28968(var94);
            if (NIL != var95) {
                var95 = Sort.sort(var95, Symbols.symbol_function((SubLObject)$ic27$), Symbols.symbol_function((SubLObject)$ic35$));
                PrintLow.format(var91, (SubLObject)$ic74$, var94);
                SubLObject var54_155 = var95;
                SubLObject var96 = (SubLObject)NIL;
                var96 = var54_155.first();
                while (NIL != var54_155) {
                    PrintLow.format(var91, (SubLObject)$ic75$, var96);
                    var54_155 = var54_155.rest();
                    var96 = var54_155.first();
                }
            }
            var93 = var93.rest();
            var94 = var93.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28974() {
        SubLObject var28 = module0030.f1625($g3385$.getGlobalValue());
        SubLObject var29;
        var28 = (var29 = Sort.sort(var28, Symbols.symbol_function((SubLObject)$ic27$), Symbols.symbol_function((SubLObject)$ic35$)));
        SubLObject var30 = (SubLObject)NIL;
        var30 = var29.first();
        while (NIL != var29) {
            SubLObject var31 = f28968(var30);
            if (NIL != var31) {
                var31 = Sort.sort(var31, Symbols.symbol_function((SubLObject)$ic27$), Symbols.symbol_function((SubLObject)$ic35$));
                module0642.f39020(module0015.$g209$.getGlobalValue());
                module0642.f39019((SubLObject)$ic76$);
                module0642.f39020(module0015.$g210$.getGlobalValue());
                module0656.f39804(var30, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39026((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g209$.getGlobalValue());
                module0642.f39019((SubLObject)$ic77$);
                module0642.f39020(module0015.$g210$.getGlobalValue());
                module0642.f39026((SubLObject)UNPROVIDED);
                SubLObject var54_156 = var31;
                SubLObject var32 = (SubLObject)NIL;
                var32 = var54_156.first();
                while (NIL != var54_156) {
                    module0656.f39804(var32, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39026((SubLObject)UNPROVIDED);
                    var54_156 = var54_156.rest();
                    var32 = var54_156.first();
                }
                module0642.f39026((SubLObject)UNPROVIDED);
            }
            var29 = var29.rest();
            var30 = var29.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28975(final SubLObject var3, SubLObject var157) {
        if (var157 == UNPROVIDED) {
            var157 = (SubLObject)NIL;
        }
        if (NIL != var157) {
            return module0069.f4941($g3385$.getGlobalValue(), var3);
        }
        return module0069.f4937($g3385$.getGlobalValue(), var3);
    }
    
    public static SubLObject f28976(final SubLObject var3) {
        $g3385$.setGlobalValue(module0069.f4939(var3));
        return Hashtables.hash_table_size($g3385$.getGlobalValue());
    }
    
    public static SubLObject f28977() {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        module0067.f4881($g3388$.getDynamicValue(var7));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28978(final SubLObject var8, final SubLObject var9) {
        final SubLObject var10 = var8.rest();
        final SubLObject var12;
        final SubLObject var11 = var12 = var10;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic78$, (SubLObject)$ic79$, ConsesLow.append(var12, (SubLObject)NIL));
    }
    
    public static SubLObject f28979(final SubLObject var160) {
        final SubLThread var161 = SubLProcess.currentSubLThread();
        return module0067.f4884($g3388$.getDynamicValue(var161), var160, (SubLObject)ZERO_INTEGER);
    }
    
    public static SubLObject f28980() {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = module0084.f5780($g3388$.getDynamicValue(var7));
        return Sort.sort(var8, Symbols.symbol_function((SubLObject)$ic27$), Symbols.symbol_function((SubLObject)$ic80$));
    }
    
    public static SubLObject f28981(final SubLObject var160) {
        final SubLThread var161 = SubLProcess.currentSubLThread();
        if (NIL != $g3387$.getDynamicValue(var161)) {
            SubLObject var162 = module0067.f4884($g3388$.getDynamicValue(var161), var160, (SubLObject)ZERO_INTEGER);
            var162 = Numbers.add(var162, (SubLObject)ONE_INTEGER);
            module0067.f4886($g3388$.getDynamicValue(var161), var160, var162);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28982(SubLObject var162, SubLObject var91) {
        if (var162 == UNPROVIDED) {
            var162 = f28980();
        }
        if (var91 == UNPROVIDED) {
            var91 = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject var163 = var162;
        SubLObject var164 = (SubLObject)NIL;
        var164 = var163.first();
        while (NIL != var163) {
            SubLObject var166;
            final SubLObject var165 = var166 = var164;
            SubLObject var167 = (SubLObject)NIL;
            SubLObject var168 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var166, var165, (SubLObject)$ic81$);
            var167 = var166.first();
            var166 = (var168 = var166.rest());
            PrintLow.format(var91, (SubLObject)$ic82$, var168, var167);
            var163 = var163.rest();
            var164 = var163.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28983(final SubLObject var166) {
        final SubLObject var167 = module0340.f22786(var166);
        return f28981(var167);
    }
    
    public static SubLObject f28984() {
        module0055.f4018($g3389$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28985(final SubLObject var167, final SubLObject var168, final SubLObject var169) {
        SubLObject var170 = (SubLObject)NIL;
        if (NIL != module0018.f978() && NIL == module0575.f35289()) {
            var170 = f28986(var167, var168, var169);
        }
        return var170;
    }
    
    public static SubLObject f28986(final SubLObject var167, final SubLObject var168, final SubLObject var169) {
        final SubLThread var170 = SubLProcess.currentSubLThread();
        final SubLObject var171 = (SubLObject)ConsesLow.list(var167, var168, module0035.f2357(var169, (SubLObject)$ic86$));
        final SubLObject var172 = $g3390$.getDynamicValue(var170);
        SubLObject var173 = (SubLObject)NIL;
        try {
            var173 = Locks.seize_lock(var172);
            module0055.f4021(var171, $g3389$.getGlobalValue());
        }
        finally {
            if (NIL != var173) {
                Locks.release_lock(var172);
            }
        }
        if (module0055.f4016($g3389$.getGlobalValue()).numGE($g3391$.getGlobalValue())) {
            f28987();
        }
        return var171;
    }
    
    public static SubLObject f28988(final SubLObject var56) {
        SubLObject var57 = (SubLObject)NIL;
        if (NIL != module0018.f978() && NIL == module0575.f35289()) {
            var57 = f28989(var56);
        }
        return var57;
    }
    
    public static SubLObject f28989(final SubLObject var56) {
        final SubLObject var57 = inference_datastructures_inference_oc.f25485(var56);
        final SubLObject var58 = (NIL != var57) ? var57 : inference_datastructures_inference_oc.f25487(var56);
        final SubLObject var59 = inference_datastructures_inference_oc.f25484(var56);
        final SubLObject var60 = inference_datastructures_inference_oc.f25483(var56);
        return f28986(var58, var59, var60);
    }
    
    public static SubLObject f28990() {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        return (SubLObject)((NIL != Locks.lock_idle_p($g3390$.getDynamicValue(var7))) ? f28987() : NIL);
    }
    
    public static SubLObject f28991(final SubLObject var3, SubLObject var86) {
        if (var86 == UNPROVIDED) {
            var86 = (SubLObject)NIL;
        }
        final SubLThread var87 = SubLProcess.currentSubLThread();
        if (NIL == module0004.f105(var86)) {
            var86 = module0048.f3326();
        }
        SubLObject var88 = (SubLObject)NIL;
        SubLObject var89 = (SubLObject)NIL;
        SubLObject var90 = (SubLObject)NIL;
        SubLObject var91 = (SubLObject)ZERO_INTEGER;
        SubLObject var92 = (SubLObject)NIL;
        try {
            final SubLObject var93 = stream_macros.$stream_requires_locking$.currentBinding(var87);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var87);
                var92 = compatibility.open_binary(var3, (SubLObject)$ic45$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var93, var87);
            }
            if (!var92.isStream()) {
                Errors.error((SubLObject)$ic44$, var3);
            }
            final SubLObject var94 = var92;
            final SubLObject var95 = module0021.$g777$.currentBinding(var87);
            try {
                module0021.$g777$.bind((SubLObject)NIL, var87);
                module0021.f1149(f28992());
                while (NIL == var90) {
                    final SubLObject var96 = f28993(var94);
                    if ($ic66$ == var96) {
                        var90 = (SubLObject)T;
                    }
                    else if (var96.isString()) {
                        Errors.warn((SubLObject)$ic87$, var96);
                    }
                    else {
                        final SubLObject var98_180 = var91;
                        if (NIL != module0048.f3363(var98_180, var86)) {
                            var89 = (SubLObject)T;
                        }
                        if (NIL == var89) {
                            var88 = (SubLObject)ConsesLow.cons(var96, var88);
                        }
                        var91 = Numbers.add(var91, (SubLObject)ONE_INTEGER);
                    }
                    if (NIL != var89) {
                        var90 = var89;
                    }
                }
            }
            finally {
                module0021.$g777$.rebind(var95, var87);
            }
        }
        finally {
            final SubLObject var97 = Threads.$is_thread_performing_cleanupP$.currentBinding(var87);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var87);
                if (var92.isStream()) {
                    streams_high.close(var92, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var97, var87);
            }
        }
        return Sequences.nreverse(var88);
    }
    
    public static SubLObject f28994(final SubLObject var55) {
        if (NIL != module0035.f1999(var55)) {
            SubLObject var56 = (SubLObject)NIL;
            SubLObject var57 = (SubLObject)NIL;
            SubLObject var58 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var55, var55, (SubLObject)$ic88$);
            var56 = var55.first();
            SubLObject var59 = var55.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var59, var55, (SubLObject)$ic88$);
            var57 = var59.first();
            var59 = var59.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var59, var55, (SubLObject)$ic88$);
            var58 = var59.first();
            var59 = var59.rest();
            if (NIL == var59) {
                return (SubLObject)makeBoolean(NIL != module0202.f12661(var56) && (NIL == var57 || NIL != module0161.f10479(var57)) && NIL != module0035.f2327(var58));
            }
            cdestructuring_bind.cdestructuring_bind_error(var55, (SubLObject)$ic88$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28995(final SubLObject var55) {
        if (NIL != f28994(var55) && NIL == module0035.f2428(module0338.f22662(), var55, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL == module0035.f2428(module0338.f22673(), var55, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            SubLObject var56 = (SubLObject)NIL;
            SubLObject var57 = (SubLObject)NIL;
            SubLObject var58 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var55, var55, (SubLObject)$ic88$);
            var56 = var55.first();
            SubLObject var59 = var55.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var59, var55, (SubLObject)$ic88$);
            var57 = var59.first();
            var59 = var59.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var59, var55, (SubLObject)$ic88$);
            var58 = var59.first();
            var59 = var59.rest();
            if (NIL == var59) {
                if ((NIL != module0232.f15325(var56) || NIL != module0206.f13425(var56)) && (NIL == var57 || NIL != module0161.f10481(var57)) && NIL != module0360.f23784(var58)) {
                    return (SubLObject)T;
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var55, (SubLObject)$ic88$);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28996(final SubLObject var3) {
        return f28991(var3, (SubLObject)ONE_INTEGER).first();
    }
    
    public static SubLObject f28987() {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        SubLObject var8 = (SubLObject)NIL;
        if (NIL != f28997()) {
            final SubLObject var9 = $g3390$.getDynamicValue(var7);
            SubLObject var10 = (SubLObject)NIL;
            try {
                var10 = Locks.seize_lock(var9);
                var8 = f28998();
            }
            finally {
                if (NIL != var10) {
                    Locks.release_lock(var9);
                }
            }
        }
        return var8;
    }
    
    public static SubLObject f28997() {
        return (SubLObject)makeBoolean(NIL == module0055.f4019($g3389$.getGlobalValue()));
    }
    
    public static SubLObject f28999() {
        return module0038.f2669(module0038.f2669(module0572.f35040(module0572.f35041((SubLObject)$ic89$)), (SubLObject)$ic52$, (SubLObject)$ic53$), (SubLObject)$ic54$, (SubLObject)$ic55$);
    }
    
    public static SubLObject f28998() {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = f28999();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        if (NIL != var8) {
            try {
                var7.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var11 = Errors.$error_handler$.currentBinding(var7);
                try {
                    Errors.$error_handler$.bind((SubLObject)$ic56$, var7);
                    try {
                        var9 = f29000(var8);
                    }
                    catch (Throwable var12) {
                        Errors.handleThrowable(var12, (SubLObject)NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var11, var7);
                }
            }
            catch (Throwable var13) {
                var10 = Errors.handleThrowable(var13, module0003.$g3$.getGlobalValue());
            }
            finally {
                var7.throwStack.pop();
            }
        }
        return (SubLObject)makeBoolean(NIL != var9 && NIL == var10);
    }
    
    public static SubLObject f29000(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)NIL;
        try {
            final SubLObject var6 = stream_macros.$stream_requires_locking$.currentBinding(var4);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var4);
                var5 = compatibility.open_binary(var3, (SubLObject)$ic90$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var6, var4);
            }
            if (!var5.isStream()) {
                Errors.error((SubLObject)$ic44$, var3);
            }
            final SubLObject var91_191 = var5;
            for (SubLObject var7 = $g3389$.getGlobalValue(), var8 = module0055.f4019(var7); NIL == var8; var8 = module0055.f4019(var7)) {
                final SubLObject var9 = module0055.f4023(var7);
                f29001(var91_191, var9, (SubLObject)T);
            }
        }
        finally {
            final SubLObject var10 = Threads.$is_thread_performing_cleanupP$.currentBinding(var4);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var4);
                if (var5.isStream()) {
                    streams_high.close(var5, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var10, var4);
            }
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f29001(final SubLObject var91, final SubLObject var170, final SubLObject var157) {
        final SubLThread var171 = SubLProcess.currentSubLThread();
        final SubLObject var172 = module0021.$g777$.currentBinding(var171);
        try {
            module0021.$g777$.bind((SubLObject)NIL, var171);
            module0021.f1151(f29002());
            module0021.f1081(var170, var91, var157);
        }
        finally {
            module0021.$g777$.rebind(var172, var171);
        }
        return var170;
    }
    
    public static SubLObject f28993(final SubLObject var91) {
        final SubLThread var92 = SubLProcess.currentSubLThread();
        SubLObject var93 = (SubLObject)NIL;
        SubLObject var94 = (SubLObject)NIL;
        try {
            var92.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var95 = Errors.$error_handler$.currentBinding(var92);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic56$, var92);
                try {
                    var93 = module0021.f1060(var91, (SubLObject)NIL, (SubLObject)UNPROVIDED);
                    if ($ic66$ != var93 && !areAssertionsDisabledFor(me) && NIL == f28994(var93)) {
                        throw new AssertionError(var93);
                    }
                }
                catch (Throwable var96) {
                    Errors.handleThrowable(var96, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var95, var92);
            }
        }
        catch (Throwable var97) {
            var94 = Errors.handleThrowable(var97, module0003.$g3$.getGlobalValue());
        }
        finally {
            var92.throwStack.pop();
        }
        if (NIL != var94) {
            var93 = var94;
        }
        return var93;
    }
    
    public static SubLObject f29003(final SubLObject var55) {
        return (SubLObject)makeBoolean(var55.isString() && NIL != module0038.f2673(var55, (SubLObject)$ic92$, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f28992() {
        if (NIL == $g3392$.getGlobalValue()) {
            $g3392$.setGlobalValue(module0360.f23785());
        }
        return $g3392$.getGlobalValue();
    }
    
    public static SubLObject f29002() {
        if (!$g3393$.getGlobalValue().isVector()) {
            $g3393$.setGlobalValue(Functions.apply((SubLObject)$ic95$, f28992()));
        }
        return $g3393$.getGlobalValue();
    }
    
    public static SubLObject f29004(final SubLObject var195) {
        final SubLThread var196 = SubLProcess.currentSubLThread();
        final SubLObject var197 = module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        final SubLObject var198 = module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        final SubLObject var199 = module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        SubLObject var200 = (SubLObject)ZERO_INTEGER;
        SubLObject var201 = var195;
        SubLObject var202 = (SubLObject)NIL;
        var202 = var201.first();
        while (NIL != var201) {
            module0006.f218((SubLObject)T, (SubLObject)$ic96$, var202, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            assert NIL != Filesys.directory_p(var202) : var202;
            SubLObject var203 = Filesys.directory(var202, (SubLObject)T);
            final SubLObject var204 = (SubLObject)NIL;
            final SubLObject var205 = module0012.$silent_progressP$.currentBinding(var196);
            try {
                module0012.$silent_progressP$.bind((SubLObject)makeBoolean(!var204.isString()), var196);
                if (NIL.isFunctionSpec()) {
                    var203 = Sort.sort(var203, (SubLObject)NIL, (SubLObject)UNPROVIDED);
                }
                final SubLObject var206 = var203;
                module0012.$g82$.setDynamicValue(var204, var196);
                module0012.$g73$.setDynamicValue(Time.get_universal_time(), var196);
                module0012.$g83$.setDynamicValue(Sequences.length(var206), var196);
                module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var196);
                final SubLObject var90_200 = module0012.$g75$.currentBinding(var196);
                final SubLObject var207 = module0012.$g76$.currentBinding(var196);
                final SubLObject var208 = module0012.$g77$.currentBinding(var196);
                final SubLObject var209 = module0012.$g78$.currentBinding(var196);
                try {
                    module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var196);
                    module0012.$g76$.bind((SubLObject)NIL, var196);
                    module0012.$g77$.bind((SubLObject)T, var196);
                    module0012.$g78$.bind(Time.get_universal_time(), var196);
                    module0012.f478(module0012.$g82$.getDynamicValue(var196));
                    SubLObject var210 = var206;
                    SubLObject var211 = (SubLObject)NIL;
                    var211 = var210.first();
                    while (NIL != var210) {
                        module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var196), module0012.$g83$.getDynamicValue(var196));
                        module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var196), (SubLObject)ONE_INTEGER), var196);
                        if (NIL != f29003(var211)) {
                            SubLObject var212 = (SubLObject)NIL;
                            SubLObject var213 = (SubLObject)ZERO_INTEGER;
                            SubLObject var214 = (SubLObject)NIL;
                            try {
                                final SubLObject var90_201 = stream_macros.$stream_requires_locking$.currentBinding(var196);
                                try {
                                    stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var196);
                                    var214 = compatibility.open_binary(var211, (SubLObject)$ic45$);
                                }
                                finally {
                                    stream_macros.$stream_requires_locking$.rebind(var90_201, var196);
                                }
                                if (!var214.isStream()) {
                                    Errors.error((SubLObject)$ic44$, var211);
                                }
                                final SubLObject var215 = var214;
                                final SubLObject var90_202 = module0021.$g777$.currentBinding(var196);
                                try {
                                    module0021.$g777$.bind((SubLObject)NIL, var196);
                                    module0021.f1149(f28992());
                                    while (NIL == var212) {
                                        final SubLObject var216 = f28993(var215);
                                        if ($ic66$ == var216) {
                                            var212 = (SubLObject)T;
                                        }
                                        else if (var216.isString()) {
                                            Errors.warn((SubLObject)$ic87$, var216);
                                        }
                                        else {
                                            var200 = Numbers.add(var200, (SubLObject)ONE_INTEGER);
                                            if (var200.numE((SubLObject)$ic97$)) {
                                                module0006.f218((SubLObject)T, (SubLObject)$ic98$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                var200 = (SubLObject)ZERO_INTEGER;
                                            }
                                            module0084.f5775(var197, var202, (SubLObject)UNPROVIDED);
                                            module0084.f5775(var198, var211, (SubLObject)UNPROVIDED);
                                            module0084.f5775(var199, var216, (SubLObject)UNPROVIDED);
                                            var213 = Numbers.add(var213, (SubLObject)ONE_INTEGER);
                                        }
                                    }
                                }
                                finally {
                                    module0021.$g777$.rebind(var90_202, var196);
                                }
                            }
                            finally {
                                final SubLObject var90_203 = Threads.$is_thread_performing_cleanupP$.currentBinding(var196);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var196);
                                    if (var214.isStream()) {
                                        streams_high.close(var214, (SubLObject)UNPROVIDED);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var90_203, var196);
                                }
                            }
                        }
                        var210 = var210.rest();
                        var211 = var210.first();
                    }
                    module0012.f479();
                }
                finally {
                    module0012.$g78$.rebind(var209, var196);
                    module0012.$g77$.rebind(var208, var196);
                    module0012.$g76$.rebind(var207, var196);
                    module0012.$g75$.rebind(var90_200, var196);
                }
            }
            finally {
                module0012.$silent_progressP$.rebind(var205, var196);
            }
            f29005(var197, var198, var199);
            var201 = var201.rest();
            var202 = var201.first();
        }
        return (SubLObject)ConsesLow.list(var197, var198, var199);
    }
    
    public static SubLObject f29005(final SubLObject var196, final SubLObject var197, final SubLObject var198) {
        module0006.f218((SubLObject)T, (SubLObject)$ic99$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0084.f5789(var196, (SubLObject)UNPROVIDED);
        module0006.f218((SubLObject)T, (SubLObject)$ic100$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0035.f2517(module0035.f2515(module0067.f4903(var197), Symbols.symbol_function((SubLObject)$ic31$), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic31$)));
        module0006.f218((SubLObject)T, (SubLObject)$ic101$, module0048.f3385(module0067.f4903(var198)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0006.f218((SubLObject)T, (SubLObject)$ic102$, module0067.f4861(var198), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29006(final SubLObject var205) {
        SubLObject var206 = (SubLObject)NIL;
        SubLObject var207 = inference_datastructures_inference_oc.f25744(var205);
        SubLObject var208 = (SubLObject)NIL;
        var208 = var207.first();
        while (NIL != var207) {
            SubLObject var54_207 = f29007(var208);
            SubLObject var209 = (SubLObject)NIL;
            var209 = var54_207.first();
            while (NIL != var54_207) {
                final SubLObject var210 = var209;
                if (NIL == conses_high.member(var210, var206, (SubLObject)EQUAL, Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var206 = (SubLObject)ConsesLow.cons(var210, var206);
                }
                var54_207 = var54_207.rest();
                var209 = var54_207.first();
            }
            var207 = var207.rest();
            var208 = var207.first();
        }
        return Sort.sort(var206, (SubLObject)$ic103$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29007(final SubLObject var206) {
        final SubLObject var207 = inference_datastructures_inference_oc.f25775(var206);
        SubLObject var208 = (SubLObject)NIL;
        SubLObject var209 = Mapping.mapcar((SubLObject)$ic104$, var207);
        SubLObject var210 = (SubLObject)NIL;
        var210 = var209.first();
        while (NIL != var209) {
            final SubLObject var211 = var210;
            if (NIL == conses_high.member(var211, var208, (SubLObject)EQUAL, Symbols.symbol_function((SubLObject)IDENTITY))) {
                var208 = (SubLObject)ConsesLow.cons(var211, var208);
            }
            var209 = var209.rest();
            var210 = var209.first();
        }
        var208 = Sequences.remove($ic105$, var208, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var208;
    }
    
    public static SubLObject f29008() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28865", "S#32039", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28866", "S#32040", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28867", "S#32041", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28868", "S#32042", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28869", "S#32043", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28870", "S#32044", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28871", "S#32045", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28872", "S#32046", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28873", "S#32047", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28874", "S#32048", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0414", "f28875", "S#32049");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28876", "S#32050", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28877", "S#32051", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28878", "S#32052", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28881", "S#32053", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28882", "S#32054", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28883", "S#25819", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28884", "S#32055", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28885", "S#32056", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28886", "S#32057", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28887", "S#32058", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28888", "S#32059", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28889", "S#32060", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28890", "S#32061", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28891", "S#32062", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28892", "S#32063", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28893", "S#32064", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28894", "S#32065", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28896", "S#32066", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28897", "S#32067", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28895", "S#32068", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28899", "S#32069", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28900", "S#32070", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28879", "S#32071", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28880", "S#32072", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28901", "S#32073", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28903", "S#32074", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28904", "S#32075", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28902", "TRANSFORMATION-RULE-SUCCESS-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28905", "S#32076", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28906", "S#32077", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28907", "S#32078", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28908", "S#26818", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28909", "S#26819", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28910", "S#32079", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28912", "S#32080", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28911", "S#32081", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28913", "S#32082", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28914", "S#32083", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28915", "S#28200", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28916", "S#30357", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28918", "S#32084", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28919", "S#32085", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28920", "S#32086", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28921", "S#32087", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28922", "S#32088", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28923", "S#32089", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28924", "S#32090", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28925", "S#32091", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28926", "S#32092", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28927", "S#32093", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28928", "S#32094", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28929", "S#32095", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28930", "S#32096", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28931", "S#32097", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28932", "S#32098", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28933", "S#32099", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28934", "S#32100", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28936", "S#32101", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28938", "S#32102", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28937", "S#32103", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28939", "S#32104", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28941", "S#32105", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28942", "S#32106", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28935", "S#32107", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28943", "S#32108", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28944", "S#32109", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28940", "S#32110", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28945", "S#32111", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28946", "S#32112", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28947", "S#32113", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28949", "S#32114", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28948", "S#32115", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28950", "S#32116", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28951", "S#32117", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28953", "S#32118", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28954", "S#32119", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28952", "S#32120", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28956", "S#32121", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28955", "S#32122", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28917", "S#30697", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28958", "S#32123", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28959", "S#32124", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28957", "S#32125", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28960", "S#32126", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28961", "S#32127", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28962", "S#32128", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28963", "S#32129", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28898", "S#32130", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28964", "S#32131", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28965", "S#32132", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28966", "S#32133", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28967", "S#32134", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28968", "S#32135", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28969", "S#32136", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28970", "S#30700", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28971", "S#32137", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28972", "S#31513", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28973", "S#32138", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28974", "S#32139", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28975", "S#32140", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28976", "S#32141", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28977", "S#32142", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0414", "f28978", "S#32143");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28979", "S#32144", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28980", "S#32145", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28981", "S#32146", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28982", "S#32147", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28983", "S#25443", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28984", "S#9540", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28985", "S#31658", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28986", "S#32148", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28988", "S#31510", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28989", "S#32149", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28990", "S#32150", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28991", "S#32151", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28994", "S#32152", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28995", "S#32153", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28996", "S#32154", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28987", "S#32155", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28997", "S#32156", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28999", "S#32157", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28998", "S#32158", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f29000", "S#32159", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f29001", "S#32160", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28993", "S#25432", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f29003", "S#25434", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f28992", "S#25431", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f29002", "S#32161", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f29004", "S#32162", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f29005", "S#32163", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f29006", "S#32164", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0414", "f29007", "S#32165", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29009() {
        $g3376$ = SubLFiles.deflexical("S#32166", (NIL != Symbols.boundp((SubLObject)$ic0$)) ? $g3376$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)$ic1$, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED));
        $g3377$ = SubLFiles.deflexical("S#32167", (NIL != Symbols.boundp((SubLObject)$ic2$)) ? $g3377$.getGlobalValue() : Locks.make_lock((SubLObject)$ic3$));
        $g3378$ = SubLFiles.deflexical("S#32168", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic4$)) ? $g3378$.getGlobalValue() : NIL));
        $g3379$ = SubLFiles.deflexical("S#32169", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic5$)) ? $g3379$.getGlobalValue() : NIL));
        $g3380$ = SubLFiles.defvar("S#32170", (SubLObject)T);
        $g3381$ = SubLFiles.defvar("S#32171", (SubLObject)ZERO_INTEGER);
        $g3382$ = SubLFiles.defparameter("S#32172", Locks.make_lock((SubLObject)$ic50$));
        $g3383$ = SubLFiles.defparameter("S#32173", (SubLObject)$ic61$);
        $g3384$ = SubLFiles.defparameter("S#32174", (SubLObject)TEN_INTEGER);
        $g3385$ = SubLFiles.deflexical("S#32175", (NIL != Symbols.boundp((SubLObject)$ic68$)) ? $g3385$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)$ic69$, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED));
        $g3386$ = SubLFiles.deflexical("S#32176", (NIL != Symbols.boundp((SubLObject)$ic70$)) ? $g3386$.getGlobalValue() : Locks.make_lock((SubLObject)$ic71$));
        $g3387$ = SubLFiles.defvar("S#32177", (SubLObject)NIL);
        $g3388$ = SubLFiles.defvar("S#32178", module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g3389$ = SubLFiles.deflexical("S#32179", (NIL != Symbols.boundp((SubLObject)$ic83$)) ? $g3389$.getGlobalValue() : module0055.f4017());
        $g3390$ = SubLFiles.defparameter("S#32180", Locks.make_lock((SubLObject)$ic84$));
        $g3391$ = SubLFiles.deflexical("S#32181", (SubLObject)$ic85$);
        $g3392$ = SubLFiles.deflexical("S#32182", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic93$)) ? $g3392$.getGlobalValue() : NIL));
        $g3393$ = SubLFiles.deflexical("S#32183", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic94$)) ? $g3393$.getGlobalValue() : NIL));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29010() {
        module0003.f57((SubLObject)$ic0$);
        module0003.f57((SubLObject)$ic2$);
        module0003.f57((SubLObject)$ic4$);
        module0003.f57((SubLObject)$ic5$);
        module0002.f50((SubLObject)$ic21$, (SubLObject)$ic22$);
        module0002.f50((SubLObject)$ic23$, (SubLObject)$ic22$);
        module0002.f50((SubLObject)$ic16$, (SubLObject)$ic22$);
        module0003.f57((SubLObject)$ic68$);
        module0003.f57((SubLObject)$ic70$);
        module0012.f436((SubLObject)$ic70$, (SubLObject)$ic71$);
        module0003.f57((SubLObject)$ic83$);
        module0003.f57((SubLObject)$ic93$);
        module0003.f57((SubLObject)$ic94$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f29008();
    }
    
    public void initializeVariables() {
        f29009();
    }
    
    public void runTopLevelForms() {
        f29010();
    }
    
    static {
        me = (SubLFile)new module0414();
        $g3376$ = null;
        $g3377$ = null;
        $g3378$ = null;
        $g3379$ = null;
        $g3380$ = null;
        $g3381$ = null;
        $g3382$ = null;
        $g3383$ = null;
        $g3384$ = null;
        $g3385$ = null;
        $g3386$ = null;
        $g3387$ = null;
        $g3388$ = null;
        $g3389$ = null;
        $g3390$ = null;
        $g3391$ = null;
        $g3392$ = null;
        $g3393$ = null;
        $ic0$ = makeSymbol("S#32166", "CYC");
        $ic1$ = makeInteger(64);
        $ic2$ = makeSymbol("S#32167", "CYC");
        $ic3$ = makeString("Transformation Rule Statistics Lock");
        $ic4$ = makeSymbol("S#32168", "CYC");
        $ic5$ = makeSymbol("S#32169", "CYC");
        $ic6$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#16577", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#32184", "CYC"), (SubLObject)makeSymbol("S#32185", "CYC"), (SubLObject)makeSymbol("S#32186", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic7$ = ConsesLow.list((SubLObject)makeKeyword("RECENT?"), (SubLObject)makeKeyword("RECEIVED?"), (SubLObject)makeKeyword("COPY?"), (SubLObject)makeKeyword("DONE"));
        $ic8$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic9$ = makeKeyword("RECENT?");
        $ic10$ = makeKeyword("RECEIVED?");
        $ic11$ = makeKeyword("COPY?");
        $ic12$ = makeKeyword("DONE");
        $ic13$ = makeSymbol("DO-LIST");
        $ic14$ = ConsesLow.list((SubLObject)makeSymbol("S#32051", "CYC"));
        $ic15$ = makeSymbol("PWHEN");
        $ic16$ = makeSymbol("S#32052", "CYC");
        $ic17$ = makeUninternedSymbol("US#7DD26DC");
        $ic18$ = makeSymbol("DO-HASH-TABLE");
        $ic19$ = ConsesLow.list((SubLObject)makeSymbol("S#32050", "CYC"));
        $ic20$ = makeSymbol("IGNORE");
        $ic21$ = makeSymbol("S#32050", "CYC");
        $ic22$ = makeSymbol("S#32049", "CYC");
        $ic23$ = makeSymbol("S#32051", "CYC");
        $ic24$ = makeKeyword("UNINITIALIZED");
        $ic25$ = makeKeyword("NONE");
        $ic26$ = makeKeyword("CONSIDERED");
        $ic27$ = makeSymbol(">");
        $ic28$ = makeSymbol("TRANSFORMATION-RULE-SUCCESS-COUNT");
        $ic29$ = makeSymbol("S#32068", "CYC");
        $ic30$ = makeKeyword("SUCCESS");
        $ic31$ = makeSymbol("<");
        $ic32$ = makeKeyword("SUCCESS-PROBABILITY");
        $ic33$ = makeSymbol("S#32078", "CYC");
        $ic34$ = makeKeyword("HISTORICAL-UTILITY");
        $ic35$ = makeSymbol("S#30697", "CYC");
        $ic36$ = makeSymbol("ASSERTION-P");
        $ic37$ = makeSymbol("INTEGERP");
        $ic38$ = makeString("Incrementing transformation rule considered count by zero; this is is vacuous and suspicious");
        $ic39$ = makeInteger(-100);
        $ic40$ = makeInteger(100);
        $ic41$ = makeSymbol("HLMT-EQUAL");
        $ic42$ = makeSymbol("S#12732", "CYC");
        $ic43$ = makeKeyword("OUTPUT");
        $ic44$ = makeString("Unable to open ~S");
        $ic45$ = makeKeyword("INPUT");
        $ic46$ = makeString("Transformation rule statistics updating is not enabled.");
        $ic47$ = makeString("~%;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
        $ic48$ = makeString("~%;; ~S rules, sorted by ~A");
        $ic49$ = makeString("~%~%;; ~S/~S (~S %)  utility : ~S~%~S");
        $ic50$ = makeString("Save recent experience lock");
        $ic51$ = makeString("experience");
        $ic52$ = makeString(".TS");
        $ic53$ = makeString(".CFASL");
        $ic54$ = makeString(".ts");
        $ic55$ = makeString(".cfasl");
        $ic56$ = makeSymbol("S#38", "CYC");
        $ic57$ = makeSymbol("DIRECTORY-P");
        $ic58$ = makeString("Loading transformation rule statistics");
        $ic59$ = makeString("-experience.cfasl");
        $ic60$ = makeString("~A");
        $ic61$ = (SubLFloat)makeDouble(0.02939361143247565);
        $ic62$ = makeString("Repairing transformation rule statistics");
        $ic63$ = makeString("Repairing ~a spurious zeroes in ~a~%");
        $ic64$ = makeString("-bloated.cfasl");
        $ic65$ = makeString("Could not load ~a");
        $ic66$ = makeKeyword("EOF");
        $ic67$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#13097", "CYC"), (SubLObject)makeSymbol("VECTOR"));
        $ic68$ = makeSymbol("S#32175", "CYC");
        $ic69$ = makeInteger(256);
        $ic70$ = makeSymbol("S#32176", "CYC");
        $ic71$ = makeString("Rule Historical Connectivity Graph Lock");
        $ic72$ = makeSymbol("S#2986", "CYC");
        $ic73$ = makeString("Got a directed instead of undirected link in the rule historical connectedness graph while trying to compute the ratio for ~s");
        $ic74$ = makeString("~%~%Rule :~%~S~%Connected Rules :");
        $ic75$ = makeString("~%~S");
        $ic76$ = makeString("Rule :");
        $ic77$ = makeString("Connected Rules :");
        $ic78$ = makeSymbol("CLET");
        $ic79$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#32177", "CYC"), (SubLObject)T), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#32178", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("NEW-DICTIONARY"))));
        $ic80$ = makeSymbol("CDR");
        $ic81$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#14781", "CYC"), (SubLObject)makeSymbol("COUNT"));
        $ic82$ = makeString("~&~4,D ~S~%");
        $ic83$ = makeSymbol("S#32179", "CYC");
        $ic84$ = makeString("Query logging lock");
        $ic85$ = makeInteger(300);
        $ic86$ = ConsesLow.list((SubLObject)makeKeyword("PROBLEM-STORE"));
        $ic87$ = makeString("Read invalid query info ~s");
        $ic88$ = ConsesLow.list((SubLObject)makeSymbol("S#14349", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#32187", "CYC"));
        $ic89$ = makeString("asked-queries");
        $ic90$ = makeKeyword("APPEND");
        $ic91$ = makeSymbol("S#32152", "CYC");
        $ic92$ = makeString("local-asked-queries.cfasl");
        $ic93$ = makeSymbol("S#32182", "CYC");
        $ic94$ = makeSymbol("S#32183", "CYC");
        $ic95$ = makeSymbol("VECTOR");
        $ic96$ = makeString("Entering ~s~%");
        $ic97$ = makeInteger(1000);
        $ic98$ = makeString(".");
        $ic99$ = makeString("~%Number of saved queries per directory:~%");
        $ic100$ = makeString("~%Histogram of saved queries per file:~%");
        $ic101$ = makeString("~%Total number of saved queries: ~s~%");
        $ic102$ = makeString("~%Total number of unique saved queries: ~s~%~%");
        $ic103$ = makeSymbol("S#17515", "CYC");
        $ic104$ = makeSymbol("SUPPORT-MT");
        $ic105$ = constant_handles_oc.f8479((SubLObject)makeString("InferencePSC"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 896 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/