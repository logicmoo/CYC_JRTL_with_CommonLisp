package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0415 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0415";
    public static final String myFingerPrint = "e3d43c67b8102cd3452013ce71088a13beca603cdfba6ba0ca5bb7e388f9d598";
    private static SubLSymbol $g3394$;
    public static SubLSymbol $g3395$;
    public static SubLSymbol $g3396$;
    public static SubLSymbol $g3397$;
    public static SubLSymbol $g3398$;
    private static SubLSymbol $g3399$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLString $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLString $ic6$;
    private static final SubLString $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLString $ic9$;
    private static final SubLString $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLString $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLList $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLList $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLList $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLString $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLString $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLInteger $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLString $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    
    public static SubLObject f29011(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)$ic0$;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        assert NIL != module0361.f24009(var1) : var1;
        assert NIL != Types.stringp(var2) : var2;
        SubLObject var5 = (SubLObject)NIL;
        final SubLObject var6 = var3;
        if (var6.eql((SubLObject)$ic0$)) {
            SubLObject var7 = (SubLObject)NIL;
            try {
                final SubLObject var8 = stream_macros.$stream_requires_locking$.currentBinding(var4);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var4);
                    var7 = compatibility.open_binary(var2, (SubLObject)$ic3$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var8, var4);
                }
                if (!var7.isStream()) {
                    Errors.error((SubLObject)$ic4$, var2);
                }
                final SubLObject var9_10 = var7;
                var5 = f29012(var1, var9_10);
            }
            finally {
                final SubLObject var9 = Threads.$is_thread_performing_cleanupP$.currentBinding(var4);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var4);
                    if (var7.isStream()) {
                        streams_high.close(var7, (SubLObject)UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var9, var4);
                }
            }
        }
        else if (var6.eql((SubLObject)$ic5$)) {
            Errors.error((SubLObject)$ic6$);
        }
        else {
            Errors.error((SubLObject)$ic7$, var3);
        }
        return var5;
    }
    
    public static SubLObject f29013(final SubLObject var2, SubLObject var3, SubLObject var11) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)$ic0$;
        }
        if (var11 == UNPROVIDED) {
            var11 = (SubLObject)T;
        }
        final SubLThread var12 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var2) : var2;
        SubLObject var13 = (SubLObject)NIL;
        final SubLObject var14 = var3;
        if (var14.eql((SubLObject)$ic0$)) {
            SubLObject var15 = (SubLObject)NIL;
            try {
                final SubLObject var16 = stream_macros.$stream_requires_locking$.currentBinding(var12);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var12);
                    var15 = compatibility.open_binary(var2, (SubLObject)$ic8$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var16, var12);
                }
                if (!var15.isStream()) {
                    Errors.error((SubLObject)$ic4$, var2);
                }
                final SubLObject var9_13 = var15;
                final SubLObject var17 = module0338.$g2887$.currentBinding(var12);
                try {
                    module0338.$g2887$.bind(var11, var12);
                    var13 = f29014(var9_13);
                }
                finally {
                    module0338.$g2887$.rebind(var17, var12);
                }
            }
            finally {
                final SubLObject var18 = Threads.$is_thread_performing_cleanupP$.currentBinding(var12);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var12);
                    if (var15.isStream()) {
                        streams_high.close(var15, (SubLObject)UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var18, var12);
                }
            }
        }
        else if (var14.eql((SubLObject)$ic5$)) {
            Errors.error((SubLObject)$ic9$);
        }
        else {
            Errors.error((SubLObject)$ic7$, var3);
        }
        return var13;
    }
    
    public static SubLObject f29012(final SubLObject var1, final SubLObject var9) {
        assert NIL != module0361.f24009(var1) : var1;
        assert NIL != Types.streamp(var9) : var9;
        final SubLObject var10 = $g3394$.getGlobalValue();
        module0021.f1038(var10, var9);
        if (var10.equal((SubLObject)$ic10$)) {
            return f29015(var1, var9);
        }
        return Errors.error((SubLObject)$ic12$, var10);
    }
    
    public static SubLObject f29014(final SubLObject var9) {
        assert NIL != Types.streamp(var9) : var9;
        final SubLObject var10 = module0021.f1060(var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (var10.equal((SubLObject)$ic10$)) {
            return f29016(var9);
        }
        return Errors.error((SubLObject)$ic12$, var10);
    }
    
    public static SubLObject f29017(final SubLObject var15, final SubLObject var16) {
        final SubLObject var17 = var15.rest();
        final SubLObject var19;
        final SubLObject var18 = var19 = var17;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic13$, (SubLObject)$ic14$, ConsesLow.append(var19, (SubLObject)NIL));
    }
    
    public static SubLObject f29018(final SubLObject var20) {
        $g3395$.setDynamicValue(Hashtables.make_hash_table(var20, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        return var20;
    }
    
    public static SubLObject f29019(final SubLObject var20) {
        $g3396$.setDynamicValue(Hashtables.make_hash_table(var20, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        return var20;
    }
    
    public static SubLObject f29020(final SubLObject var20) {
        $g3397$.setDynamicValue(Hashtables.make_hash_table(var20, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        return var20;
    }
    
    public static SubLObject f29021(final SubLObject var21, final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        return Hashtables.sethash(var22, $g3395$.getDynamicValue(var23), var21);
    }
    
    public static SubLObject f29022(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        return Hashtables.gethash_without_values(var22, $g3395$.getDynamicValue(var23), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29023(final SubLObject var23, final SubLObject var22) {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        return Hashtables.sethash(var22, $g3396$.getDynamicValue(var24), var23);
    }
    
    public static SubLObject f29024(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        return Hashtables.gethash_without_values(var22, $g3396$.getDynamicValue(var23), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29025(final SubLObject var24, final SubLObject var22) {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        return Hashtables.sethash(var22, $g3397$.getDynamicValue(var25), var24);
    }
    
    public static SubLObject f29026(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        return Hashtables.gethash_without_values(var22, $g3397$.getDynamicValue(var23), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29027(final SubLObject var15, final SubLObject var16) {
        SubLObject var18;
        final SubLObject var17 = var18 = var15.rest();
        SubLObject var19 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var18, var17, (SubLObject)$ic26$);
        var19 = var18.first();
        final SubLObject var20;
        var18 = (var20 = var18.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic13$, reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)$ic27$, var19), (SubLObject)$ic28$), ConsesLow.append(var20, (SubLObject)NIL));
    }
    
    public static SubLObject f29028(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        final SubLObject var24 = Hashtables.gethash_without_values(var22, $g3398$.getDynamicValue(var23), (SubLObject)UNPROVIDED);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var23) && NIL == constant_handles_oc.f8449(var24)) {
            Errors.error((SubLObject)$ic31$, var22);
        }
        return var24;
    }
    
    public static SubLObject f29015(final SubLObject var1, final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        assert NIL != module0361.f24009(var1) : var1;
        assert NIL != Types.streamp(var9) : var9;
        final SubLObject var11 = f29029(var1);
        final SubLObject var12 = f29030(var1);
        final SubLObject var13 = f29031(var12);
        SubLObject var14 = module0021.$g777$.currentBinding(var10);
        try {
            module0021.$g777$.bind((SubLObject)NIL, var10);
            module0021.f1149((SubLObject)NIL);
            module0021.f1038(var11, var9);
        }
        finally {
            module0021.$g777$.rebind(var14, var10);
        }
        var14 = module0021.$g777$.currentBinding(var10);
        try {
            module0021.$g777$.bind((SubLObject)NIL, var10);
            module0021.f1149(var11);
            final SubLObject var8_31 = module0338.$g2880$.currentBinding(var10);
            try {
                module0338.$g2880$.bind((SubLObject)NIL, var10);
                module0021.f1040(var13, var9);
            }
            finally {
                module0338.$g2880$.rebind(var8_31, var10);
            }
            final SubLObject var8_32 = module0338.$g2880$.currentBinding(var10);
            try {
                module0338.$g2880$.bind(var12, var10);
                f29032(var1, var9);
                module0021.f1038((SubLObject)$ic32$, var9);
                f29033(var1, var9);
                module0021.f1038((SubLObject)$ic33$, var9);
                f29034(var1, var9);
                module0021.f1038((SubLObject)$ic34$, var9);
                f29035(var1, var9);
                module0021.f1038((SubLObject)$ic35$, var9);
            }
            finally {
                module0338.$g2880$.rebind(var8_32, var10);
            }
        }
        finally {
            module0021.$g777$.rebind(var14, var10);
        }
        return var1;
    }
    
    public static SubLObject f29016(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        assert NIL != Types.streamp(var9) : var9;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = module0021.$g777$.currentBinding(var10);
        try {
            module0021.$g777$.bind((SubLObject)NIL, var10);
            module0021.f1149((SubLObject)NIL);
            var11 = module0021.f1060(var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0021.$g777$.rebind(var15, var10);
        }
        var15 = module0021.$g777$.currentBinding(var10);
        try {
            module0021.$g777$.bind((SubLObject)NIL, var10);
            module0021.f1149(var11);
            var12 = module0021.f1060(var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var8_34 = $g3398$.currentBinding(var10);
            final SubLObject var16 = module0111.$g1394$.currentBinding(var10);
            final SubLObject var17 = module0021.$g789$.currentBinding(var10);
            final SubLObject var18 = $g3395$.currentBinding(var10);
            final SubLObject var19 = $g3396$.currentBinding(var10);
            final SubLObject var20 = $g3397$.currentBinding(var10);
            try {
                $g3398$.bind(var12, var10);
                module0111.$g1394$.bind((SubLObject)$ic29$, var10);
                module0021.$g789$.bind(Guids.guid_to_string(Guids.new_guid()), var10);
                $g3395$.bind((SubLObject)$ic15$, var10);
                $g3396$.bind((SubLObject)$ic15$, var10);
                $g3397$.bind((SubLObject)$ic15$, var10);
                var13 = f29036(var9);
                var14 = module0361.f24136(var13);
                for (SubLObject var21 = module0021.f1060(var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED); $ic35$ != var21; var21 = module0021.f1060(var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    final SubLObject var22 = var21;
                    if (var22.eql((SubLObject)$ic32$)) {
                        f29037(var14, var9);
                    }
                    else if (var22.eql((SubLObject)$ic33$)) {
                        f29038(var14, var9);
                    }
                    else if (var22.eql((SubLObject)$ic34$)) {
                        f29039(var14, var9);
                    }
                    else {
                        Errors.error((SubLObject)$ic36$, var21);
                    }
                }
            }
            finally {
                $g3397$.rebind(var20, var10);
                $g3396$.rebind(var19, var10);
                $g3395$.rebind(var18, var10);
                module0021.$g789$.rebind(var17, var10);
                module0111.$g1394$.rebind(var16, var10);
                $g3398$.rebind(var8_34, var10);
            }
        }
        finally {
            module0021.$g777$.rebind(var15, var10);
        }
        return var14;
    }
    
    public static SubLObject f29029(final SubLObject var1) {
        assert NIL != module0361.f24009(var1) : var1;
        final SubLObject var2 = module0077.f5313(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
        final SubLObject var3 = module0361.f24130(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic37$)) {
            final SubLObject var42_43 = var3;
            if (NIL == module0065.f4775(var42_43, (SubLObject)$ic37$)) {
                final SubLObject var4 = module0065.f4740(var42_43);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                SubLObject var10;
                SubLObject var11;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic37$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic37$;
                        }
                        var10 = module0364.f24721(var9);
                        module0077.f5326(var10, var2);
                        if (NIL != module0373.f26175(var9)) {
                            var11 = module0340.f22825(module0373.f26180(var9));
                            if (var11.isSymbol()) {
                                module0077.f5326(var11, var2);
                            }
                        }
                    }
                }
            }
            final SubLObject var51_52 = var3;
            if (NIL == module0065.f4777(var51_52)) {
                final SubLObject var12 = module0065.f4738(var51_52);
                SubLObject var13 = (SubLObject)NIL;
                SubLObject var14 = (SubLObject)NIL;
                final Iterator var15 = Hashtables.getEntrySetIterator(var12);
                try {
                    while (Hashtables.iteratorHasNext(var15)) {
                        final Map.Entry var16 = Hashtables.iteratorNextEntry(var15);
                        var13 = Hashtables.getEntryKey(var16);
                        var14 = Hashtables.getEntryValue(var16);
                        final SubLObject var17 = module0364.f24721(var14);
                        module0077.f5326(var17, var2);
                        if (NIL != module0373.f26175(var14)) {
                            final SubLObject var18 = module0340.f22825(module0373.f26180(var14));
                            if (!var18.isSymbol()) {
                                continue;
                            }
                            module0077.f5326(var18, var2);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var15);
                }
            }
        }
        SubLObject var19 = module0360.f23857();
        SubLObject var20 = (SubLObject)NIL;
        var20 = var19.first();
        while (NIL != var19) {
            module0077.f5326(var20, var2);
            var19 = var19.rest();
            var20 = var19.first();
        }
        return Sort.sort(module0077.f5312(var2), Symbols.symbol_function((SubLObject)$ic38$), Symbols.symbol_function((SubLObject)$ic39$));
    }
    
    public static SubLObject f29040(final SubLObject var58) {
        final SubLThread var59 = SubLProcess.currentSubLThread();
        if (NIL != constant_handles_oc.f8449(var58)) {
            module0077.f5326(var58, $g3399$.getDynamicValue(var59));
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29030(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        assert NIL != module0361.f24009(var1) : var1;
        final SubLObject var3 = module0077.f5313(Symbols.symbol_function((SubLObject)EQ), (SubLObject)$ic41$);
        final SubLObject var4 = $g3399$.currentBinding(var2);
        try {
            $g3399$.bind(var3, var2);
            final SubLObject var5 = module0361.f24128(var1);
            if (NIL == module0065.f4772(var5, (SubLObject)$ic37$)) {
                final SubLObject var42_59 = var5;
                if (NIL == module0065.f4775(var42_59, (SubLObject)$ic37$)) {
                    final SubLObject var6 = module0065.f4740(var42_59);
                    final SubLObject var7 = (SubLObject)NIL;
                    SubLObject var8;
                    SubLObject var9;
                    SubLObject var10;
                    SubLObject var11;
                    SubLObject var12;
                    for (var8 = Sequences.length(var6), var9 = (SubLObject)NIL, var9 = (SubLObject)ZERO_INTEGER; var9.numL(var8); var9 = Numbers.add(var9, (SubLObject)ONE_INTEGER)) {
                        var10 = ((NIL != var7) ? Numbers.subtract(var8, var9, (SubLObject)ONE_INTEGER) : var9);
                        var11 = Vectors.aref(var6, var10);
                        if (NIL == module0065.f4749(var11) || NIL == module0065.f4773((SubLObject)$ic37$)) {
                            if (NIL != module0065.f4749(var11)) {
                                var11 = (SubLObject)$ic37$;
                            }
                            var12 = module0363.f24509(var11);
                            module0035.f2424((SubLObject)$ic40$, var12, (SubLObject)UNPROVIDED);
                        }
                    }
                }
                final SubLObject var51_62 = var5;
                if (NIL == module0065.f4777(var51_62)) {
                    final SubLObject var13 = module0065.f4738(var51_62);
                    SubLObject var14 = (SubLObject)NIL;
                    SubLObject var15 = (SubLObject)NIL;
                    final Iterator var16 = Hashtables.getEntrySetIterator(var13);
                    try {
                        while (Hashtables.iteratorHasNext(var16)) {
                            final Map.Entry var17 = Hashtables.iteratorNextEntry(var16);
                            var14 = Hashtables.getEntryKey(var17);
                            var15 = Hashtables.getEntryValue(var17);
                            final SubLObject var18 = module0363.f24509(var15);
                            module0035.f2424((SubLObject)$ic40$, var18, (SubLObject)UNPROVIDED);
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(var16);
                    }
                }
            }
        }
        finally {
            $g3399$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f29031(final SubLObject var63) {
        return f29041(var63, Symbols.symbol_function((SubLObject)IDENTITY), Symbols.symbol_function((SubLObject)$ic42$), Symbols.symbol_function((SubLObject)EQL));
    }
    
    public static SubLObject f29041(final SubLObject var64, SubLObject var65, SubLObject var66, SubLObject var67) {
        if (var65 == UNPROVIDED) {
            var65 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        if (var66 == UNPROVIDED) {
            var66 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        if (var67 == UNPROVIDED) {
            var67 = module0077.f5315(var64);
        }
        assert NIL != module0077.f5302(var64) : var64;
        assert NIL != Types.function_spec_p(var65) : var65;
        assert NIL != Types.function_spec_p(var66) : var66;
        assert NIL != Types.function_spec_p(var67) : var67;
        final SubLObject var68 = Hashtables.make_hash_table(module0077.f5311(var64), var67, (SubLObject)UNPROVIDED);
        final SubLObject var69 = module0077.f5333(var64);
        SubLObject var70;
        SubLObject var71;
        SubLObject var72;
        SubLObject var73;
        SubLObject var74;
        for (var70 = module0032.f1741(var69), var71 = (SubLObject)NIL, var71 = module0032.f1742(var70, var69); NIL == module0032.f1744(var70, var71); var71 = module0032.f1743(var71)) {
            var72 = module0032.f1745(var70, var71);
            if (NIL != module0032.f1746(var71, var72)) {
                var73 = Functions.funcall(var66, var72);
                var74 = Functions.funcall(var65, var72);
                Hashtables.sethash(var73, var68, var74);
            }
        }
        return var68;
    }
    
    public static SubLObject f29032(final SubLObject var1, final SubLObject var9) {
        assert NIL != module0361.f24009(var1) : var1;
        final SubLObject var10 = module0361.f24424(var1);
        module0021.f1038(var10, var9);
        return var10;
    }
    
    public static SubLObject f29036(final SubLObject var9) {
        final SubLObject var10 = module0021.f1060(var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        assert NIL != module0360.f23856(var10) : var10;
        return var10;
    }
    
    public static SubLObject f29033(final SubLObject var1, final SubLObject var9) {
        assert NIL != module0361.f24009(var1) : var1;
        final SubLObject var10 = module0361.f24228(var1);
        module0021.f1038(var10, var9);
        final SubLObject var11 = module0361.f24128(var1);
        if (NIL == module0065.f4772(var11, (SubLObject)$ic37$)) {
            final SubLObject var42_77 = var11;
            if (NIL == module0065.f4775(var42_77, (SubLObject)$ic37$)) {
                final SubLObject var12 = module0065.f4740(var42_77);
                final SubLObject var13 = (SubLObject)NIL;
                SubLObject var14;
                SubLObject var15;
                SubLObject var16;
                SubLObject var17;
                for (var14 = Sequences.length(var12), var15 = (SubLObject)NIL, var15 = (SubLObject)ZERO_INTEGER; var15.numL(var14); var15 = Numbers.add(var15, (SubLObject)ONE_INTEGER)) {
                    var16 = ((NIL != var13) ? Numbers.subtract(var14, var15, (SubLObject)ONE_INTEGER) : var15);
                    var17 = Vectors.aref(var12, var16);
                    if (NIL == module0065.f4749(var17) || NIL == module0065.f4773((SubLObject)$ic37$)) {
                        if (NIL != module0065.f4749(var17)) {
                            var17 = (SubLObject)$ic37$;
                        }
                        f29042(var17, var9);
                    }
                }
            }
            final SubLObject var78_79 = var11;
            if (NIL == module0065.f4777(var78_79) || NIL == module0065.f4773((SubLObject)$ic37$)) {
                final SubLObject var18 = module0065.f4738(var78_79);
                SubLObject var19 = module0065.f4739(var78_79);
                final SubLObject var20 = module0065.f4734(var78_79);
                final SubLObject var21 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic37$)) ? NIL : $ic37$);
                while (var19.numL(var20)) {
                    final SubLObject var22 = Hashtables.gethash_without_values(var19, var18, var21);
                    if (NIL == module0065.f4773((SubLObject)$ic37$) || NIL == module0065.f4749(var22)) {
                        f29042(var22, var9);
                    }
                    var19 = Numbers.add(var19, (SubLObject)ONE_INTEGER);
                }
            }
        }
        return var10;
    }
    
    public static SubLObject f29037(final SubLObject var1, final SubLObject var9) {
        assert NIL != module0361.f24009(var1) : var1;
        final SubLObject var10 = module0021.f1060(var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f29018(var10);
        module0361.f24353(var1, var10);
        SubLObject var11;
        for (var11 = (SubLObject)NIL, var11 = (SubLObject)ZERO_INTEGER; var11.numL(var10); var11 = Numbers.add(var11, (SubLObject)ONE_INTEGER)) {
            f29043(var1, var9);
        }
        return var10;
    }
    
    public static SubLObject f29042(final SubLObject var21, final SubLObject var9) {
        final SubLObject var22 = module0363.f24508(var21);
        final SubLObject var23 = module0363.f24509(var21);
        module0021.f1038(var22, var9);
        module0021.f1040(var23, var9);
        return var22;
    }
    
    public static SubLObject f29043(final SubLObject var1, final SubLObject var9) {
        final SubLObject var10 = module0021.f1060(var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var11 = module0021.f1060(var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var12 = module0363.f24511(var1, var11);
        f29021(var12, var10);
        return var12;
    }
    
    public static SubLObject f29035(final SubLObject var1, final SubLObject var9) {
        assert NIL != module0361.f24009(var1) : var1;
        final SubLObject var10 = module0361.f24233(var1);
        module0021.f1038(var10, var9);
        final SubLObject var11 = module0361.f24132(var1);
        if (NIL == module0065.f4772(var11, (SubLObject)$ic37$)) {
            final SubLObject var42_85 = var11;
            if (NIL == module0065.f4775(var42_85, (SubLObject)$ic37$)) {
                final SubLObject var12 = module0065.f4740(var42_85);
                final SubLObject var13 = (SubLObject)NIL;
                SubLObject var14;
                SubLObject var15;
                SubLObject var16;
                SubLObject var17;
                for (var14 = Sequences.length(var12), var15 = (SubLObject)NIL, var15 = (SubLObject)ZERO_INTEGER; var15.numL(var14); var15 = Numbers.add(var15, (SubLObject)ONE_INTEGER)) {
                    var16 = ((NIL != var13) ? Numbers.subtract(var14, var15, (SubLObject)ONE_INTEGER) : var15);
                    var17 = Vectors.aref(var12, var16);
                    if (NIL == module0065.f4749(var17) || NIL == module0065.f4773((SubLObject)$ic37$)) {
                        if (NIL != module0065.f4749(var17)) {
                            var17 = (SubLObject)$ic37$;
                        }
                        f29044(var17, var9);
                    }
                }
            }
            final SubLObject var78_87 = var11;
            if (NIL == module0065.f4777(var78_87) || NIL == module0065.f4773((SubLObject)$ic37$)) {
                final SubLObject var18 = module0065.f4738(var78_87);
                SubLObject var19 = module0065.f4739(var78_87);
                final SubLObject var20 = module0065.f4734(var78_87);
                final SubLObject var21 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic37$)) ? NIL : $ic37$);
                while (var19.numL(var20)) {
                    final SubLObject var22 = Hashtables.gethash_without_values(var19, var18, var21);
                    if (NIL == module0065.f4773((SubLObject)$ic37$) || NIL == module0065.f4749(var22)) {
                        f29044(var22, var9);
                    }
                    var19 = Numbers.add(var19, (SubLObject)ONE_INTEGER);
                }
            }
        }
        return var10;
    }
    
    public static SubLObject f29039(final SubLObject var1, final SubLObject var9) {
        assert NIL != module0361.f24009(var1) : var1;
        final SubLObject var10 = module0021.f1060(var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f29020(var10);
        module0361.f24355(var1, var10);
        SubLObject var11;
        for (var11 = (SubLObject)NIL, var11 = (SubLObject)ZERO_INTEGER; var11.numL(var10); var11 = Numbers.add(var11, (SubLObject)ONE_INTEGER)) {
            f29045(var1, var9);
        }
        final SubLObject var12 = module0361.f24128(var1);
        if (NIL == module0065.f4772(var12, (SubLObject)$ic37$)) {
            final SubLObject var42_88 = var12;
            if (NIL == module0065.f4775(var42_88, (SubLObject)$ic37$)) {
                final SubLObject var13 = module0065.f4740(var42_88);
                final SubLObject var14 = (SubLObject)NIL;
                SubLObject var15;
                SubLObject var16;
                SubLObject var17;
                SubLObject var18;
                for (var15 = Sequences.length(var13), var16 = (SubLObject)NIL, var16 = (SubLObject)ZERO_INTEGER; var16.numL(var15); var16 = Numbers.add(var16, (SubLObject)ONE_INTEGER)) {
                    var17 = ((NIL != var14) ? Numbers.subtract(var15, var16, (SubLObject)ONE_INTEGER) : var16);
                    var18 = Vectors.aref(var13, var17);
                    if (NIL == module0065.f4749(var18) || NIL == module0065.f4773((SubLObject)$ic37$)) {
                        if (NIL != module0065.f4749(var18)) {
                            var18 = (SubLObject)$ic37$;
                        }
                        module0373.f26229(var18);
                    }
                }
            }
            final SubLObject var51_89 = var12;
            if (NIL == module0065.f4777(var51_89)) {
                final SubLObject var19 = module0065.f4738(var51_89);
                SubLObject var20 = (SubLObject)NIL;
                SubLObject var21 = (SubLObject)NIL;
                final Iterator var22 = Hashtables.getEntrySetIterator(var19);
                try {
                    while (Hashtables.iteratorHasNext(var22)) {
                        final Map.Entry var23 = Hashtables.iteratorNextEntry(var22);
                        var20 = Hashtables.getEntryKey(var23);
                        var21 = Hashtables.getEntryValue(var23);
                        module0373.f26229(var21);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var22);
                }
            }
        }
        return var10;
    }
    
    public static SubLObject f29044(final SubLObject var24, final SubLObject var9) {
        module0021.f1038(module0366.f24935(var24), var9);
        module0021.f1040(module0366.f24934(var24), var9);
        f29046(module0366.f24937(var24), var9);
        final SubLObject var25 = module0366.f24938(var24);
        module0021.f1038(Sequences.length(var25), var9);
        SubLObject var26 = var25;
        SubLObject var27 = (SubLObject)NIL;
        var27 = var26.first();
        while (NIL != var26) {
            f29047(var27, var9);
            var26 = var26.rest();
            var27 = var26.first();
        }
        return var24;
    }
    
    public static SubLObject f29045(final SubLObject var1, final SubLObject var9) {
        final SubLObject var10 = module0021.f1060(var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var11 = module0021.f1060(var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var12 = f29048(var1, var9);
        final SubLObject var13 = f29049(var1, var9);
        final SubLObject var14 = module0366.f24947(var12, var11, var13);
        f29025(var14, var10);
        return var14;
    }
    
    public static SubLObject f29049(final SubLObject var1, final SubLObject var9) {
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11;
        SubLObject var12;
        SubLObject var13;
        for (var11 = module0021.f1060(var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var12 = (SubLObject)NIL, var12 = (SubLObject)ZERO_INTEGER; var12.numL(var11); var12 = Numbers.add(var12, (SubLObject)ONE_INTEGER)) {
            var13 = f29050(var1, var9);
            var10 = (SubLObject)ConsesLow.cons(var13, var10);
        }
        return Sequences.nreverse(var10);
    }
    
    public static SubLObject f29034(final SubLObject var1, final SubLObject var9) {
        assert NIL != module0361.f24009(var1) : var1;
        final SubLObject var10 = Numbers.subtract(module0361.f24208(var1), module0361.f24215(var1));
        module0021.f1038(var10, var9);
        final SubLObject var11 = module0361.f24130(var1);
        if (NIL == module0065.f4772(var11, (SubLObject)$ic37$)) {
            final SubLObject var42_94 = var11;
            if (NIL == module0065.f4775(var42_94, (SubLObject)$ic37$)) {
                final SubLObject var12 = module0065.f4740(var42_94);
                final SubLObject var13 = (SubLObject)NIL;
                SubLObject var14;
                SubLObject var15;
                SubLObject var16;
                SubLObject var17;
                for (var14 = Sequences.length(var12), var15 = (SubLObject)NIL, var15 = (SubLObject)ZERO_INTEGER; var15.numL(var14); var15 = Numbers.add(var15, (SubLObject)ONE_INTEGER)) {
                    var16 = ((NIL != var13) ? Numbers.subtract(var14, var15, (SubLObject)ONE_INTEGER) : var15);
                    var17 = Vectors.aref(var12, var16);
                    if (NIL == module0065.f4749(var17) || NIL == module0065.f4773((SubLObject)$ic37$)) {
                        if (NIL != module0065.f4749(var17)) {
                            var17 = (SubLObject)$ic37$;
                        }
                        if (NIL == module0374.f26529(var17)) {
                            f29051(var17, var9);
                        }
                    }
                }
            }
            final SubLObject var78_95 = var11;
            if (NIL == module0065.f4777(var78_95) || NIL == module0065.f4773((SubLObject)$ic37$)) {
                final SubLObject var18 = module0065.f4738(var78_95);
                SubLObject var19 = module0065.f4739(var78_95);
                final SubLObject var20 = module0065.f4734(var78_95);
                final SubLObject var21 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic37$)) ? NIL : $ic37$);
                while (var19.numL(var20)) {
                    final SubLObject var22 = Hashtables.gethash_without_values(var19, var18, var21);
                    if ((NIL == module0065.f4773((SubLObject)$ic37$) || NIL == module0065.f4749(var22)) && NIL == module0374.f26529(var22)) {
                        f29051(var22, var9);
                    }
                    var19 = Numbers.add(var19, (SubLObject)ONE_INTEGER);
                }
            }
        }
        return var10;
    }
    
    public static SubLObject f29038(final SubLObject var1, final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        assert NIL != module0361.f24009(var1) : var1;
        final SubLObject var11 = module0021.f1060(var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f29019(var11);
        module0361.f24354(var1, var11);
        final SubLObject var12 = module0373.$g3179$.currentBinding(var10);
        try {
            module0373.$g3179$.bind((SubLObject)T, var10);
            SubLObject var13;
            for (var13 = (SubLObject)NIL, var13 = (SubLObject)ZERO_INTEGER; var13.numL(var11); var13 = Numbers.add(var13, (SubLObject)ONE_INTEGER)) {
                f29052(var1, var9);
            }
        }
        finally {
            module0373.$g3179$.rebind(var12, var10);
        }
        return var11;
    }
    
    public static SubLObject f29051(final SubLObject var23, final SubLObject var9) {
        assert NIL != module0364.f24699(var23) : var23;
        final SubLObject var24 = module0364.f24723(var23);
        final SubLObject var25 = module0364.f24721(var23);
        module0021.f1038(var24, var9);
        module0021.f1038(var25, var9);
        final SubLObject var26 = var25;
        if (var26.eql((SubLObject)$ic47$)) {
            f29053(var23, var9);
        }
        else if (var26.eql((SubLObject)$ic48$)) {
            f29054(var23, var9);
        }
        else if (var26.eql((SubLObject)$ic49$)) {
            f29055(var23, var9);
        }
        else if (var26.eql((SubLObject)$ic50$)) {
            f29056(var23, var9);
        }
        else if (var26.eql((SubLObject)$ic51$)) {
            f29057(var23, var9);
        }
        else if (var26.eql((SubLObject)$ic52$)) {
            f29058(var23, var9);
        }
        else if (var26.eql((SubLObject)$ic53$)) {
            f29059(var23, var9);
        }
        else if (var26.eql((SubLObject)$ic54$)) {
            f29060(var23, var9);
        }
        else if (var26.eql((SubLObject)$ic55$)) {
            f29061(var23, var9);
        }
        else {
            Errors.error((SubLObject)$ic56$, var25);
        }
        return var23;
    }
    
    public static SubLObject f29052(final SubLObject var1, final SubLObject var9) {
        assert NIL != module0361.f24009(var1) : var1;
        final SubLObject var10 = module0021.f1060(var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var11 = module0021.f1060(var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var12 = (SubLObject)NIL;
        final SubLObject var13 = var11;
        if (var13.eql((SubLObject)$ic47$)) {
            var12 = f29062(var1, var9);
        }
        else if (var13.eql((SubLObject)$ic48$)) {
            var12 = f29063(var1, var9);
        }
        else if (var13.eql((SubLObject)$ic49$)) {
            var12 = f29064(var1, var9);
        }
        else if (var13.eql((SubLObject)$ic50$)) {
            var12 = f29065(var1, var9);
        }
        else if (var13.eql((SubLObject)$ic51$)) {
            var12 = f29066(var1, var9);
        }
        else if (var13.eql((SubLObject)$ic52$)) {
            var12 = f29067(var1, var9);
        }
        else if (var13.eql((SubLObject)$ic53$)) {
            var12 = f29068(var1, var9);
        }
        else if (var13.eql((SubLObject)$ic54$)) {
            var12 = f29069(var1, var9);
        }
        else if (var13.eql((SubLObject)$ic55$)) {
            var12 = f29070(var1, var9);
        }
        else {
            Errors.error((SubLObject)$ic56$, var11);
        }
        f29023(var12, var10);
        return var12;
    }
    
    public static SubLObject f29053(final SubLObject var97, final SubLObject var9) {
        f29071(module0364.f24725(var97), var9);
        f29072(module0376.f26612(var97), var9);
        module0021.f1040(module0376.f26614(var97), var9);
        module0021.f1040(module0376.f26615(var97), var9);
        return var97;
    }
    
    public static SubLObject f29062(final SubLObject var1, final SubLObject var9) {
        final SubLObject var10 = f29073(var1, var9);
        final SubLObject var11 = f29074(var9);
        final SubLObject var12 = module0021.f1060(var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var13 = module0021.f1060(var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var14 = module0376.f26605(var10, var11, var12, var13);
        return var14;
    }
    
    public static SubLObject f29054(final SubLObject var101, final SubLObject var9) {
        f29071(module0364.f24725(var101), var9);
        f29075(module0364.f24754(var101), var9);
        f29072(module0379.f26925(var101), var9);
        module0021.f1040(module0379.f26929(var101), var9);
        return var101;
    }
    
    public static SubLObject f29063(final SubLObject var1, final SubLObject var9) {
        final SubLObject var10 = f29073(var1, var9);
        final SubLObject var11 = f29076(var1, var9);
        final SubLObject var12 = f29074(var9);
        final SubLObject var13 = module0021.f1060(var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var14 = module0379.f26918(var10, var11, var12, var13);
        return var14;
    }
    
    public static SubLObject f29055(final SubLObject var104, final SubLObject var9) {
        f29071(module0364.f24725(var104), var9);
        f29077(module0377.f26757(var104), var9);
        f29072(module0377.f26745(var104), var9);
        module0021.f1040(module0377.f26747(var104), var9);
        module0021.f1040(module0377.f26749(var104), var9);
        module0021.f1040(module0377.f26750(var104), var9);
        module0021.f1040(module0377.f26751(var104), var9);
        return var104;
    }
    
    public static SubLObject f29064(final SubLObject var1, final SubLObject var9) {
        final SubLObject var10 = f29073(var1, var9);
        final SubLObject var11 = f29076(var1, var9);
        final SubLObject var12 = f29074(var9);
        final SubLObject var13 = module0021.f1060(var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var14 = module0021.f1060(var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var15 = module0021.f1060(var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var16 = module0021.f1060(var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var17 = module0377.f26737(var10, var11, var12, var13, var14, var15, var16);
        return var17;
    }
    
    public static SubLObject f29056(final SubLObject var110, final SubLObject var9) {
        f29046(module0378.f26872(var110), var9);
        f29046(module0378.f26873(var110), var9);
        f29075(module0378.f26869(var110), var9);
        module0021.f1038(module0378.f26874(var110), var9);
        module0021.f1038(module0378.f26875(var110), var9);
        return var110;
    }
    
    public static SubLObject f29065(final SubLObject var1, final SubLObject var9) {
        final SubLObject var10 = f29048(var1, var9);
        final SubLObject var11 = f29048(var1, var9);
        final SubLObject var12 = f29076(var1, var9);
        final SubLObject var13 = module0021.f1060(var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var14 = module0021.f1060(var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var15 = module0378.f26862(var12, var10, var11, var13, var14);
        return var15;
    }
    
    public static SubLObject f29057(final SubLObject var115, final SubLObject var9) {
        f29071(module0364.f24725(var115), var9);
        f29075(module0364.f24754(var115), var9);
        module0021.f1040(module0375.f26570(var115), var9);
        module0021.f1038(module0375.f26576(var115), var9);
        f29078(module0375.f26572(var115), var9);
        return var115;
    }
    
    public static SubLObject f29066(final SubLObject var1, final SubLObject var9) {
        final SubLObject var10 = f29073(var1, var9);
        final SubLObject var11 = f29076(var1, var9);
        final SubLObject var12 = module0021.f1060(var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var13 = module0021.f1060(var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var14 = f29079(var9);
        final SubLObject var15 = module0375.f26563(var10, var11, var12, var13, var14);
        return var15;
    }
    
    public static SubLObject f29058(final SubLObject var118, final SubLObject var9) {
        assert NIL != module0380.f26955(var118) : var118;
        f29071(module0364.f24725(var118), var9);
        final SubLObject var119 = module0364.f24735(var118);
        module0021.f1038(Sequences.length(var119), var9);
        SubLObject var120 = Sequences.reverse(var119);
        SubLObject var121 = (SubLObject)NIL;
        var121 = var120.first();
        while (NIL != var120) {
            f29075(var121, var9);
            var120 = var120.rest();
            var121 = var120.first();
        }
        return var118;
    }
    
    public static SubLObject f29067(final SubLObject var1, final SubLObject var9) {
        final SubLObject var10 = f29073(var1, var9);
        final SubLObject var11 = f29080(var1, var9);
        final SubLObject var12 = module0380.f26959(var10, var11);
        return var12;
    }
    
    public static SubLObject f29080(final SubLObject var1, final SubLObject var9) {
        final SubLObject var10 = module0021.f1060(var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12;
        SubLObject var13;
        for (var12 = (SubLObject)NIL, var12 = (SubLObject)ZERO_INTEGER; var12.numL(var10); var12 = Numbers.add(var12, (SubLObject)ONE_INTEGER)) {
            var13 = f29076(var1, var9);
            var11 = (SubLObject)ConsesLow.cons(var13, var11);
        }
        return Sequences.nreverse(var11);
    }
    
    public static SubLObject f29059(final SubLObject var123, final SubLObject var9) {
        f29071(module0364.f24725(var123), var9);
        f29075(module0381.f27031(var123), var9);
        if (NIL != module0381.f27046(var123)) {
            f29075(module0381.f27047(var123), var9);
        }
        else {
            module0021.f1038((SubLObject)NIL, var9);
        }
        return var123;
    }
    
    public static SubLObject f29068(final SubLObject var1, final SubLObject var9) {
        final SubLObject var10 = f29073(var1, var9);
        final SubLObject var11 = f29076(var1, var9);
        final SubLObject var12 = f29081(var1, var9);
        final SubLObject var13 = module0381.f27032(var10, var11, var12);
        return var13;
    }
    
    public static SubLObject f29060(final SubLObject var126, final SubLObject var9) {
        assert NIL != module0382.f27173(var126) : var126;
        f29071(module0364.f24725(var126), var9);
        f29075(module0382.f27175(var126), var9);
        f29075(module0382.f27176(var126), var9);
        return var126;
    }
    
    public static SubLObject f29069(final SubLObject var1, final SubLObject var9) {
        final SubLObject var10 = f29073(var1, var9);
        final SubLObject var11 = f29076(var1, var9);
        final SubLObject var12 = f29076(var1, var9);
        final SubLObject var13 = module0382.f27177(var10, var11, var12);
        return var13;
    }
    
    public static SubLObject f29061(final SubLObject var129, final SubLObject var9) {
        assert NIL != module0383.f27227(var129) : var129;
        f29071(module0364.f24725(var129), var9);
        f29075(module0364.f24754(var129), var9);
        return var129;
    }
    
    public static SubLObject f29070(final SubLObject var1, final SubLObject var9) {
        final SubLObject var10 = f29073(var1, var9);
        final SubLObject var11 = f29076(var1, var9);
        final SubLObject var12 = module0383.f27229(var10, var11);
        return var12;
    }
    
    public static SubLObject f29071(final SubLObject var21, final SubLObject var9) {
        assert NIL != module0363.f24478(var21) : var21;
        return module0021.f1038(module0363.f24508(var21), var9);
    }
    
    public static SubLObject f29073(final SubLObject var1, final SubLObject var9) {
        return f29022(module0021.f1060(var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f29075(final SubLObject var120, final SubLObject var9) {
        return f29082(var120, var9, (SubLObject)T);
    }
    
    public static SubLObject f29076(final SubLObject var1, final SubLObject var9) {
        return f29083(var1, var9, (SubLObject)T);
    }
    
    public static SubLObject f29077(final SubLObject var120, final SubLObject var9) {
        return f29082(var120, var9, (SubLObject)NIL);
    }
    
    public static SubLObject f29081(final SubLObject var1, final SubLObject var9) {
        return f29083(var1, var9, (SubLObject)NIL);
    }
    
    public static SubLObject f29082(final SubLObject var120, final SubLObject var9, final SubLObject var130) {
        if (NIL == var120 && NIL == var130) {
            return module0021.f1038((SubLObject)NIL, var9);
        }
        assert NIL != module0364.f24774(var120) : var120;
        final SubLObject var131 = module0364.f24736(var120);
        final SubLObject var132 = module0364.f24737(var120);
        final SubLObject var133 = module0363.f24508(var131);
        module0021.f1038(var133, var9);
        module0021.f1040(var132, var9);
        return var133;
    }
    
    public static SubLObject f29083(final SubLObject var1, final SubLObject var9, final SubLObject var130) {
        final SubLObject var131 = module0021.f1060(var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != var131 || NIL != var130) {
            final SubLObject var132 = module0021.f1060(var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var133 = f29022(var131);
            final SubLObject var134 = module0364.f24804(var133, var132);
            return var134;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29046(final SubLObject var23, final SubLObject var9) {
        assert NIL != module0364.f24699(var23) : var23;
        return module0021.f1038(module0364.f24723(var23), var9);
    }
    
    public static SubLObject f29048(final SubLObject var1, final SubLObject var9) {
        return f29024(module0021.f1060(var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f29047(final SubLObject var24, final SubLObject var9) {
        assert NIL != module0366.f24916(var24) : var24;
        return module0021.f1038(module0366.f24935(var24), var9);
    }
    
    public static SubLObject f29050(final SubLObject var1, final SubLObject var9) {
        return f29026(module0021.f1060(var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f29072(final SubLObject var98, final SubLObject var9) {
        return f29084(var98, var9, (SubLObject)T);
    }
    
    public static SubLObject f29074(final SubLObject var9) {
        return f29085(var9, (SubLObject)T);
    }
    
    public static SubLObject f29078(final SubLObject var98, final SubLObject var9) {
        return f29084(var98, var9, (SubLObject)NIL);
    }
    
    public static SubLObject f29079(final SubLObject var9) {
        return f29085(var9, (SubLObject)NIL);
    }
    
    public static SubLObject f29084(final SubLObject var98, final SubLObject var9, final SubLObject var130) {
        if (NIL == var98 && NIL == var130) {
            return module0021.f1038((SubLObject)NIL, var9);
        }
        assert NIL != module0340.f22789(var98) : var98;
        final SubLObject var131 = module0340.f22825(var98);
        module0021.f1038(var131, var9);
        return var131;
    }
    
    public static SubLObject f29085(final SubLObject var9, final SubLObject var130) {
        final SubLObject var131 = module0021.f1060(var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL == var131 && NIL == var130) {
            return (SubLObject)NIL;
        }
        final SubLObject var132 = module0340.f22786(var131);
        if (NIL != var132) {
            return var132;
        }
        return module0340.f22835(var131);
    }
    
    public static SubLObject f29086() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29011", "S#32188", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29013", "S#32189", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29012", "S#32190", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29014", "S#32191", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0415", "f29017", "S#32192");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29018", "S#32193", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29019", "S#32194", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29020", "S#32195", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29021", "S#32196", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29022", "S#32197", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29023", "S#32198", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29024", "S#32199", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29025", "S#32200", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29026", "S#32201", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0415", "f29027", "S#32202");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29028", "S#32203", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29015", "S#32204", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29016", "S#32205", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29029", "S#32206", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29040", "S#32207", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29030", "S#32208", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29031", "S#32209", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29041", "S#32210", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29032", "S#32211", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29036", "S#32212", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29033", "S#32213", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29037", "S#32214", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29042", "S#32215", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29043", "S#32216", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29035", "S#32217", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29039", "S#32218", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29044", "S#32219", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29045", "S#32220", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29049", "S#32221", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29034", "S#32222", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29038", "S#32223", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29051", "S#32224", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29052", "S#32225", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29053", "S#32226", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29062", "S#32227", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29054", "S#32228", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29063", "S#32229", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29055", "S#32230", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29064", "S#32231", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29056", "S#32232", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29065", "S#32233", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29057", "S#32234", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29066", "S#32235", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29058", "S#32236", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29067", "S#32237", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29080", "S#32238", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29059", "S#32239", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29068", "S#32240", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29060", "S#32241", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29069", "S#32242", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29061", "S#32243", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29070", "S#32244", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29071", "S#32245", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29073", "S#32246", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29075", "S#32247", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29076", "S#32248", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29077", "S#32249", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29081", "S#32250", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29082", "S#32251", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29083", "S#32252", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29046", "S#32253", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29048", "S#32254", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29047", "S#32255", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29050", "S#32256", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29072", "S#32257", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29074", "S#32258", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29078", "S#32259", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29079", "S#32260", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29084", "S#32261", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0415", "f29085", "S#32262", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29087() {
        $g3394$ = SubLFiles.deflexical("S#32263", (SubLObject)$ic10$);
        $g3395$ = SubLFiles.defparameter("S#32264", (SubLObject)$ic15$);
        $g3396$ = SubLFiles.defparameter("S#32265", (SubLObject)$ic15$);
        $g3397$ = SubLFiles.defparameter("S#32266", (SubLObject)$ic15$);
        $g3398$ = SubLFiles.defparameter("S#32267", (SubLObject)$ic15$);
        $g3399$ = SubLFiles.defparameter("S#32268", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29088() {
        module0002.f50((SubLObject)$ic16$, (SubLObject)$ic17$);
        module0002.f50((SubLObject)$ic18$, (SubLObject)$ic17$);
        module0002.f50((SubLObject)$ic19$, (SubLObject)$ic17$);
        module0002.f50((SubLObject)$ic20$, (SubLObject)$ic17$);
        module0002.f50((SubLObject)$ic21$, (SubLObject)$ic17$);
        module0002.f50((SubLObject)$ic22$, (SubLObject)$ic17$);
        module0002.f50((SubLObject)$ic23$, (SubLObject)$ic17$);
        module0002.f50((SubLObject)$ic24$, (SubLObject)$ic17$);
        module0002.f50((SubLObject)$ic25$, (SubLObject)$ic17$);
        module0002.f50((SubLObject)$ic29$, (SubLObject)$ic30$);
        module0012.f419((SubLObject)$ic40$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f29086();
    }
    
    public void initializeVariables() {
        f29087();
    }
    
    public void runTopLevelForms() {
        f29088();
    }
    
    static {
        me = (SubLFile)new module0415();
        $g3394$ = null;
        $g3395$ = null;
        $g3396$ = null;
        $g3397$ = null;
        $g3398$ = null;
        $g3399$ = null;
        $ic0$ = makeKeyword("CFASL");
        $ic1$ = makeSymbol("S#26782", "CYC");
        $ic2$ = makeSymbol("STRINGP");
        $ic3$ = makeKeyword("OUTPUT");
        $ic4$ = makeString("Unable to open ~S");
        $ic5$ = makeKeyword("XML");
        $ic6$ = makeString("Time to implement XML problem-store output serialization.");
        $ic7$ = makeString("Unexpected protocol ~S");
        $ic8$ = makeKeyword("INPUT");
        $ic9$ = makeString("Time to implement XML problem-store input serialization.");
        $ic10$ = makeString("1.0");
        $ic11$ = makeSymbol("STREAMP");
        $ic12$ = makeString("Unsupported serialization version ~A");
        $ic13$ = makeSymbol("CLET");
        $ic14$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#32264", "CYC"), (SubLObject)makeKeyword("UNINITIALIZED")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#32265", "CYC"), (SubLObject)makeKeyword("UNINITIALIZED")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#32266", "CYC"), (SubLObject)makeKeyword("UNINITIALIZED")));
        $ic15$ = makeKeyword("UNINITIALIZED");
        $ic16$ = makeSymbol("S#32193", "CYC");
        $ic17$ = makeSymbol("S#32192", "CYC");
        $ic18$ = makeSymbol("S#32194", "CYC");
        $ic19$ = makeSymbol("S#32195", "CYC");
        $ic20$ = makeSymbol("S#32196", "CYC");
        $ic21$ = makeSymbol("S#32197", "CYC");
        $ic22$ = makeSymbol("S#32198", "CYC");
        $ic23$ = makeSymbol("S#32199", "CYC");
        $ic24$ = makeSymbol("S#32200", "CYC");
        $ic25$ = makeSymbol("S#32201", "CYC");
        $ic26$ = ConsesLow.list((SubLObject)makeSymbol("S#32269", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic27$ = makeSymbol("S#32267", "CYC");
        $ic28$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#9676", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#32203", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#2252", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("GUID-TO-STRING"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("NEW-GUID")))));
        $ic29$ = makeSymbol("S#32203", "CYC");
        $ic30$ = makeSymbol("S#32202", "CYC");
        $ic31$ = makeString("Unable to lookup a constant from ~S");
        $ic32$ = makeKeyword("PROBLEM");
        $ic33$ = makeKeyword("PROBLEM-LINK");
        $ic34$ = makeKeyword("PROOF");
        $ic35$ = makeKeyword("DONE");
        $ic36$ = makeString("Unexpected section ~S");
        $ic37$ = makeKeyword("SKIP");
        $ic38$ = makeSymbol("STRING-LESSP");
        $ic39$ = makeSymbol("SYMBOL-NAME");
        $ic40$ = makeSymbol("S#32207", "CYC");
        $ic41$ = makeInteger(100);
        $ic42$ = makeSymbol("CONSTANT-INTERNAL-ID");
        $ic43$ = makeSymbol("S#6920", "CYC");
        $ic44$ = makeSymbol("FUNCTION-SPEC-P");
        $ic45$ = makeSymbol("S#26546", "CYC");
        $ic46$ = makeSymbol("S#27381", "CYC");
        $ic47$ = makeKeyword("REMOVAL");
        $ic48$ = makeKeyword("REWRITE");
        $ic49$ = makeKeyword("TRANSFORMATION");
        $ic50$ = makeKeyword("RESIDUAL-TRANSFORMATION");
        $ic51$ = makeKeyword("RESTRICTION");
        $ic52$ = makeKeyword("SPLIT");
        $ic53$ = makeKeyword("JOIN-ORDERED");
        $ic54$ = makeKeyword("JOIN");
        $ic55$ = makeKeyword("UNION");
        $ic56$ = makeString("Unexpected link type ~S");
        $ic57$ = makeSymbol("S#27604", "CYC");
        $ic58$ = makeSymbol("S#29225", "CYC");
        $ic59$ = makeSymbol("S#27818", "CYC");
        $ic60$ = makeSymbol("S#26082", "CYC");
        $ic61$ = makeSymbol("S#27608", "CYC");
        $ic62$ = makeSymbol("S#26816", "CYC");
        $ic63$ = makeSymbol("S#14902", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 384 ms
	
	Decompiled with Procyon 0.5.32.
*/