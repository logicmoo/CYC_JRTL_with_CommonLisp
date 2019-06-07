package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0410 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0410";
    public static final String myFingerPrint = "5e361b285750aa9df2652c50d6faec48fbb9ecfb73652b2b852805424af1137a";
    private static SubLSymbol $g3313$;
    private static SubLSymbol $g3314$;
    private static SubLSymbol $g3315$;
    private static SubLSymbol $g3316$;
    private static SubLSymbol $g3317$;
    private static SubLSymbol $g3318$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLList $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLString $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLList $ic19$;
    private static final SubLList $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLString $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLList $ic33$;
    private static final SubLList $ic34$;
    private static final SubLList $ic35$;
    private static final SubLList $ic36$;
    private static final SubLList $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLList $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLList $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLList $ic60$;
    
    
    public static SubLObject f28544(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        assert NIL != module0202.f12663(var1) : var1;
        final SubLObject var5 = var3;
        assert NIL != module0035.f2327(var5) : var5;
        SubLObject var6;
        SubLObject var7;
        SubLObject var8;
        for (var6 = (SubLObject)NIL, var6 = var5; NIL != var6; var6 = conses_high.cddr(var6)) {
            var7 = var6.first();
            var8 = conses_high.cadr(var6);
            assert NIL != module0360.f23781(var7) : var7;
        }
        if (NIL != var2 && !areAssertionsDisabledFor(me) && NIL == module0161.f10479(var2)) {
            throw new AssertionError(var2);
        }
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13_14 = (SubLObject)NIL;
        SubLObject var13 = (SubLObject)NIL;
        final SubLObject var14 = Time.get_internal_real_time();
        final SubLObject var15 = Time.get_internal_real_time();
        SubLObject var16 = (SubLObject)NIL;
        try {
            var4.throwStack.push($ic4$);
            final SubLObject var17 = module0408.$g3302$.currentBinding(var4);
            try {
                module0408.$g3302$.bind((SubLObject)T, var4);
                var4.resetMultipleValues();
                final SubLObject var20_21 = f28545(var1, var2, var3);
                final SubLObject var22_23 = var4.secondMultipleValue();
                final SubLObject var24_25 = var4.thirdMultipleValue();
                var4.resetMultipleValues();
                var9 = var20_21;
                var10 = var22_23;
                var11 = var24_25;
            }
            finally {
                module0408.$g3302$.rebind(var17, var4);
            }
        }
        catch (Throwable var18) {
            var16 = Errors.handleThrowable(var18, (SubLObject)$ic4$);
        }
        finally {
            var4.throwStack.pop();
        }
        if (NIL != var16) {
            var10 = (SubLObject)$ic5$;
            module0408.f28396();
        }
        var13_14 = Time.compute_with_process_resource_tracking_results(var15);
        var13 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var14), time_high.$internal_time_units_per_second$.getGlobalValue());
        var12 = module0012.f559(module0012.f560(var13, var13_14));
        var11 = module0409.f28511(var11, var12);
        return Values.values(var9, var10, var11);
    }
    
    public static SubLObject f28546(final SubLObject var27, final SubLObject var2, SubLObject var28, SubLObject var3) {
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var29 = SubLProcess.currentSubLThread();
        assert NIL != module0232.f15304(var27) : var27;
        assert NIL != module0161.f10479(var2) : var2;
        assert NIL != Types.listp(var28) : var28;
        final SubLObject var30 = var3;
        assert NIL != module0035.f2327(var30) : var30;
        SubLObject var31;
        SubLObject var32;
        SubLObject var33;
        for (var31 = (SubLObject)NIL, var31 = var30; NIL != var31; var31 = conses_high.cddr(var31)) {
            var32 = var31.first();
            var33 = conses_high.cadr(var31);
            assert NIL != module0360.f23781(var32) : var32;
        }
        SubLObject var34 = (SubLObject)NIL;
        SubLObject var35 = (SubLObject)NIL;
        SubLObject var36 = (SubLObject)NIL;
        SubLObject var37 = (SubLObject)NIL;
        SubLObject var13_29 = (SubLObject)NIL;
        SubLObject var38 = (SubLObject)NIL;
        final SubLObject var39 = Time.get_internal_real_time();
        final SubLObject var40 = Time.get_internal_real_time();
        SubLObject var41 = (SubLObject)NIL;
        try {
            var29.throwStack.push($ic4$);
            final SubLObject var42 = module0408.$g3302$.currentBinding(var29);
            try {
                module0408.$g3302$.bind((SubLObject)T, var29);
                var29.resetMultipleValues();
                final SubLObject var30_31 = f28547(var27, var2, var28, var3);
                final SubLObject var32_33 = var29.secondMultipleValue();
                final SubLObject var34_35 = var29.thirdMultipleValue();
                var29.resetMultipleValues();
                var34 = var30_31;
                var35 = var32_33;
                var36 = var34_35;
            }
            finally {
                module0408.$g3302$.rebind(var42, var29);
            }
        }
        catch (Throwable var43) {
            var41 = Errors.handleThrowable(var43, (SubLObject)$ic4$);
        }
        finally {
            var29.throwStack.pop();
        }
        if (NIL != var41) {
            var35 = (SubLObject)$ic5$;
            module0408.f28396();
        }
        var13_29 = Time.compute_with_process_resource_tracking_results(var40);
        var38 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var39), time_high.$internal_time_units_per_second$.getGlobalValue());
        var37 = module0012.f559(module0012.f560(var38, var13_29));
        var36 = module0409.f28511(var36, var37);
        return Values.values(var34, var35, var36);
    }
    
    public static SubLObject f28545(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        var3 = f28548(var3);
        if (NIL != f28549(var3)) {
            final SubLObject var5 = module0035.f2329(var3, (SubLObject)$ic8$);
            var4.resetMultipleValues();
            final SubLObject var6 = module0370.f25893(var1, var2, module0360.$g3101$.getGlobalValue());
            final SubLObject var7 = var4.secondMultipleValue();
            final SubLObject var8 = var4.thirdMultipleValue();
            var4.resetMultipleValues();
            if (NIL != module0204.f13059(var6)) {
                final SubLObject var9 = var6.first();
                final SubLObject var10 = module0233.f15362(var7, var8);
                module0414.f28985(var1, var2, var3);
                return f28550(var9, var7, var10, var5);
            }
        }
        return Values.values((SubLObject)NIL, (SubLObject)$ic9$, (SubLObject)NIL);
    }
    
    public static SubLObject f28547(final SubLObject var27, final SubLObject var2, final SubLObject var28, SubLObject var3) {
        var3 = f28548(var3);
        if (NIL != f28549(var3)) {
            final SubLObject var29 = module0035.f2329(var3, (SubLObject)$ic8$);
            final SubLObject var30 = module0370.f25906(var27, var2);
            if (NIL != module0204.f13059(var30)) {
                final SubLObject var31 = var30.first();
                final SubLObject var32 = conses_high.set_difference(module0035.f2399(var31, (SubLObject)$ic10$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var28, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0414.f28985(var27, var2, var3);
                return f28550(var31, (SubLObject)NIL, var32, var29);
            }
        }
        return Values.values((SubLObject)NIL, (SubLObject)$ic9$, (SubLObject)NIL);
    }
    
    public static SubLObject f28551(final SubLObject var42) {
        final SubLThread var43 = SubLProcess.currentSubLThread();
        return module0360.f23984($g3313$.getDynamicValue(var43), var42);
    }
    
    public static SubLObject f28552() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return conses_high.copy_list($g3313$.getDynamicValue(var4));
    }
    
    public static SubLObject f28550(final SubLObject var40, final SubLObject var38, final SubLObject var41, final SubLObject var36) {
        final SubLThread var42 = SubLProcess.currentSubLThread();
        final SubLObject var43 = (SubLObject)((NIL != module0204.f13045(var40)) ? $ic11$ : $ic12$);
        SubLObject var45;
        final SubLObject var44 = var45 = module0204.f13052(var40);
        SubLObject var46 = (SubLObject)NIL;
        SubLObject var47 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var45, var44, (SubLObject)$ic13$);
        var46 = var45.first();
        var45 = var45.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var45, var44, (SubLObject)$ic13$);
        var47 = var45.first();
        var45 = var45.rest();
        if (NIL == var45) {
            final SubLObject var48 = module0360.f23835(var36);
            final SubLObject var49 = module0360.f23960(var36);
            final SubLObject var50 = module0360.f23965(var36);
            final SubLObject var51 = module0360.f23854(var36);
            final SubLObject var52 = module0035.f2329(var36, (SubLObject)$ic14$);
            SubLObject var53 = (SubLObject)NIL;
            SubLObject var54 = (SubLObject)NIL;
            SubLObject var55 = (SubLObject)NIL;
            final SubLObject var56 = $g3313$.currentBinding(var42);
            final SubLObject var57 = module0373.$g3169$.currentBinding(var42);
            final SubLObject var58 = module0373.$g3168$.currentBinding(var42);
            try {
                $g3313$.bind(var36, var42);
                module0373.$g3169$.bind((SubLObject)NIL, var42);
                module0373.$g3168$.bind((SubLObject)NIL, var42);
                SubLObject var59 = (SubLObject)NIL;
                try {
                    var42.throwStack.push($ic4$);
                    final SubLObject var19_55 = module0408.$g3302$.currentBinding(var42);
                    try {
                        module0408.$g3302$.bind((SubLObject)T, var42);
                        SubLObject var60 = (SubLObject)NIL;
                        if (NIL != module0018.$g629$.getDynamicValue(var42)) {
                            final SubLObject var61 = var48;
                            if (NIL != var61) {
                                SubLObject var62 = (SubLObject)NIL;
                                final SubLObject var63 = module0003.f61();
                                try {
                                    var42.throwStack.push(var63);
                                    final SubLObject var19_56 = module0003.$g4$.currentBinding(var42);
                                    try {
                                        module0003.$g4$.bind((SubLObject)T, var42);
                                        SubLObject var64 = (SubLObject)NIL;
                                        try {
                                            final SubLObject var19_57 = module0003.$g5$.currentBinding(var42);
                                            try {
                                                module0003.$g5$.bind(Numbers.add((SubLObject)ONE_INTEGER, module0003.$g5$.getDynamicValue(var42)), var42);
                                                var64 = module0003.f62(var61, var63);
                                                final SubLObject var66;
                                                final SubLObject var65 = var66 = module0034.f1888();
                                                final SubLObject var19_58 = module0034.$g879$.currentBinding(var42);
                                                try {
                                                    module0034.$g879$.bind(var66, var42);
                                                    SubLObject var67 = (SubLObject)NIL;
                                                    if (NIL != var66 && NIL == module0034.f1842(var66)) {
                                                        var67 = module0034.f1869(var66);
                                                        final SubLObject var68 = Threads.current_process();
                                                        if (NIL == var67) {
                                                            module0034.f1873(var66, var68);
                                                        }
                                                        else if (!var67.eql(var68)) {
                                                            Errors.error((SubLObject)$ic15$);
                                                        }
                                                    }
                                                    try {
                                                        final SubLObject var19_59 = module0018.$g650$.currentBinding(var42);
                                                        try {
                                                            module0018.$g650$.bind(module0360.f23938(var51), var42);
                                                            var42.resetMultipleValues();
                                                            final SubLObject var69_70 = module0347.f23334(var47, var46, var43, var52);
                                                            final SubLObject var71_72 = var42.secondMultipleValue();
                                                            final SubLObject var73_74 = var42.thirdMultipleValue();
                                                            var42.resetMultipleValues();
                                                            var53 = var69_70;
                                                            var54 = var71_72;
                                                            var55 = var73_74;
                                                        }
                                                        finally {
                                                            module0018.$g650$.rebind(var19_59, var42);
                                                        }
                                                    }
                                                    finally {
                                                        final SubLObject var19_60 = Threads.$is_thread_performing_cleanupP$.currentBinding(var42);
                                                        try {
                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var42);
                                                            if (NIL != var66 && NIL == var67) {
                                                                module0034.f1873(var66, (SubLObject)NIL);
                                                            }
                                                        }
                                                        finally {
                                                            Threads.$is_thread_performing_cleanupP$.rebind(var19_60, var42);
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0034.$g879$.rebind(var19_58, var42);
                                                }
                                            }
                                            finally {
                                                module0003.$g5$.rebind(var19_57, var42);
                                            }
                                        }
                                        finally {
                                            final SubLObject var19_61 = Threads.$is_thread_performing_cleanupP$.currentBinding(var42);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var42);
                                                module0003.f64(var64);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var19_61, var42);
                                            }
                                        }
                                    }
                                    finally {
                                        module0003.$g4$.rebind(var19_56, var42);
                                    }
                                }
                                catch (Throwable var69) {
                                    var62 = Errors.handleThrowable(var69, var63);
                                }
                                finally {
                                    var42.throwStack.pop();
                                }
                                if (NIL != var62) {
                                    var54 = (SubLObject)$ic16$;
                                }
                            }
                            else {
                                final SubLObject var71;
                                final SubLObject var70 = var71 = module0034.f1888();
                                final SubLObject var19_62 = module0034.$g879$.currentBinding(var42);
                                try {
                                    module0034.$g879$.bind(var71, var42);
                                    SubLObject var72 = (SubLObject)NIL;
                                    if (NIL != var71 && NIL == module0034.f1842(var71)) {
                                        var72 = module0034.f1869(var71);
                                        final SubLObject var73 = Threads.current_process();
                                        if (NIL == var72) {
                                            module0034.f1873(var71, var73);
                                        }
                                        else if (!var72.eql(var73)) {
                                            Errors.error((SubLObject)$ic15$);
                                        }
                                    }
                                    try {
                                        final SubLObject var19_63 = module0018.$g650$.currentBinding(var42);
                                        try {
                                            module0018.$g650$.bind(module0360.f23938(var51), var42);
                                            var42.resetMultipleValues();
                                            final SubLObject var79_80 = module0347.f23334(var47, var46, var43, var52);
                                            final SubLObject var81_82 = var42.secondMultipleValue();
                                            final SubLObject var83_84 = var42.thirdMultipleValue();
                                            var42.resetMultipleValues();
                                            var53 = var79_80;
                                            var54 = var81_82;
                                            var55 = var83_84;
                                        }
                                        finally {
                                            module0018.$g650$.rebind(var19_63, var42);
                                        }
                                    }
                                    finally {
                                        final SubLObject var19_64 = Threads.$is_thread_performing_cleanupP$.currentBinding(var42);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var42);
                                            if (NIL != var71 && NIL == var72) {
                                                module0034.f1873(var71, (SubLObject)NIL);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var19_64, var42);
                                        }
                                    }
                                }
                                finally {
                                    module0034.$g879$.rebind(var19_62, var42);
                                }
                            }
                        }
                        else {
                            try {
                                var42.throwStack.push($ic17$);
                                final SubLObject var19_65 = Errors.$error_handler$.currentBinding(var42);
                                try {
                                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic18$), var42);
                                    try {
                                        final SubLObject var74 = var48;
                                        if (NIL != var74) {
                                            SubLObject var75 = (SubLObject)NIL;
                                            final SubLObject var76 = module0003.f61();
                                            try {
                                                var42.throwStack.push(var76);
                                                final SubLObject var19_66 = module0003.$g4$.currentBinding(var42);
                                                try {
                                                    module0003.$g4$.bind((SubLObject)T, var42);
                                                    SubLObject var77 = (SubLObject)NIL;
                                                    try {
                                                        final SubLObject var19_67 = module0003.$g5$.currentBinding(var42);
                                                        try {
                                                            module0003.$g5$.bind(Numbers.add((SubLObject)ONE_INTEGER, module0003.$g5$.getDynamicValue(var42)), var42);
                                                            var77 = module0003.f62(var74, var76);
                                                            final SubLObject var79;
                                                            final SubLObject var78 = var79 = module0034.f1888();
                                                            final SubLObject var19_68 = module0034.$g879$.currentBinding(var42);
                                                            try {
                                                                module0034.$g879$.bind(var79, var42);
                                                                SubLObject var80 = (SubLObject)NIL;
                                                                if (NIL != var79 && NIL == module0034.f1842(var79)) {
                                                                    var80 = module0034.f1869(var79);
                                                                    final SubLObject var81 = Threads.current_process();
                                                                    if (NIL == var80) {
                                                                        module0034.f1873(var79, var81);
                                                                    }
                                                                    else if (!var80.eql(var81)) {
                                                                        Errors.error((SubLObject)$ic15$);
                                                                    }
                                                                }
                                                                try {
                                                                    final SubLObject var19_69 = module0018.$g650$.currentBinding(var42);
                                                                    try {
                                                                        module0018.$g650$.bind(module0360.f23938(var51), var42);
                                                                        var42.resetMultipleValues();
                                                                        final SubLObject var91_92 = module0347.f23334(var47, var46, var43, var52);
                                                                        final SubLObject var93_94 = var42.secondMultipleValue();
                                                                        final SubLObject var95_96 = var42.thirdMultipleValue();
                                                                        var42.resetMultipleValues();
                                                                        var53 = var91_92;
                                                                        var54 = var93_94;
                                                                        var55 = var95_96;
                                                                    }
                                                                    finally {
                                                                        module0018.$g650$.rebind(var19_69, var42);
                                                                    }
                                                                }
                                                                finally {
                                                                    final SubLObject var19_70 = Threads.$is_thread_performing_cleanupP$.currentBinding(var42);
                                                                    try {
                                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var42);
                                                                        if (NIL != var79 && NIL == var80) {
                                                                            module0034.f1873(var79, (SubLObject)NIL);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        Threads.$is_thread_performing_cleanupP$.rebind(var19_70, var42);
                                                                    }
                                                                }
                                                            }
                                                            finally {
                                                                module0034.$g879$.rebind(var19_68, var42);
                                                            }
                                                        }
                                                        finally {
                                                            module0003.$g5$.rebind(var19_67, var42);
                                                        }
                                                    }
                                                    finally {
                                                        final SubLObject var19_71 = Threads.$is_thread_performing_cleanupP$.currentBinding(var42);
                                                        try {
                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var42);
                                                            module0003.f64(var77);
                                                        }
                                                        finally {
                                                            Threads.$is_thread_performing_cleanupP$.rebind(var19_71, var42);
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0003.$g4$.rebind(var19_66, var42);
                                                }
                                            }
                                            catch (Throwable var82) {
                                                var75 = Errors.handleThrowable(var82, var76);
                                            }
                                            finally {
                                                var42.throwStack.pop();
                                            }
                                            if (NIL != var75) {
                                                var54 = (SubLObject)$ic16$;
                                            }
                                        }
                                        else {
                                            final SubLObject var84;
                                            final SubLObject var83 = var84 = module0034.f1888();
                                            final SubLObject var19_72 = module0034.$g879$.currentBinding(var42);
                                            try {
                                                module0034.$g879$.bind(var84, var42);
                                                SubLObject var85 = (SubLObject)NIL;
                                                if (NIL != var84 && NIL == module0034.f1842(var84)) {
                                                    var85 = module0034.f1869(var84);
                                                    final SubLObject var86 = Threads.current_process();
                                                    if (NIL == var85) {
                                                        module0034.f1873(var84, var86);
                                                    }
                                                    else if (!var85.eql(var86)) {
                                                        Errors.error((SubLObject)$ic15$);
                                                    }
                                                }
                                                try {
                                                    final SubLObject var19_73 = module0018.$g650$.currentBinding(var42);
                                                    try {
                                                        module0018.$g650$.bind(module0360.f23938(var51), var42);
                                                        var42.resetMultipleValues();
                                                        final SubLObject var101_102 = module0347.f23334(var47, var46, var43, var52);
                                                        final SubLObject var103_104 = var42.secondMultipleValue();
                                                        final SubLObject var105_106 = var42.thirdMultipleValue();
                                                        var42.resetMultipleValues();
                                                        var53 = var101_102;
                                                        var54 = var103_104;
                                                        var55 = var105_106;
                                                    }
                                                    finally {
                                                        module0018.$g650$.rebind(var19_73, var42);
                                                    }
                                                }
                                                finally {
                                                    final SubLObject var19_74 = Threads.$is_thread_performing_cleanupP$.currentBinding(var42);
                                                    try {
                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var42);
                                                        if (NIL != var84 && NIL == var85) {
                                                            module0034.f1873(var84, (SubLObject)NIL);
                                                        }
                                                    }
                                                    finally {
                                                        Threads.$is_thread_performing_cleanupP$.rebind(var19_74, var42);
                                                    }
                                                }
                                            }
                                            finally {
                                                module0034.$g879$.rebind(var19_72, var42);
                                            }
                                        }
                                    }
                                    catch (Throwable var87) {
                                        Errors.handleThrowable(var87, (SubLObject)NIL);
                                    }
                                }
                                finally {
                                    Errors.$error_handler$.rebind(var19_65, var42);
                                }
                            }
                            catch (Throwable var88) {
                                var60 = Errors.handleThrowable(var88, (SubLObject)$ic17$);
                            }
                            finally {
                                var42.throwStack.pop();
                            }
                        }
                        if (NIL != var60) {
                            var54 = module0360.f23875(var60);
                        }
                    }
                    finally {
                        module0408.$g3302$.rebind(var19_55, var42);
                    }
                }
                catch (Throwable var89) {
                    var59 = Errors.handleThrowable(var89, (SubLObject)$ic4$);
                }
                finally {
                    var42.throwStack.pop();
                }
                if (NIL != var59) {
                    var54 = (SubLObject)$ic5$;
                    module0408.f28396();
                }
            }
            finally {
                module0373.$g3168$.rebind(var58, var42);
                module0373.$g3169$.rebind(var57, var42);
                $g3313$.rebind(var56, var42);
            }
            if (NIL != var53) {
                var53 = f28553(var53, var41);
                var53 = f28554(var53);
                var53 = f28555(var53, var38, var49, var50);
            }
            return Values.values(var53, var54, var55);
        }
        cdestructuring_bind.cdestructuring_bind_error(var44, (SubLObject)$ic13$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28553(final SubLObject var9, final SubLObject var109) {
        SubLObject var110 = (SubLObject)NIL;
        SubLObject var111 = var9;
        SubLObject var112 = (SubLObject)NIL;
        var112 = var111.first();
        while (NIL != var111) {
            SubLObject var114;
            final SubLObject var113 = var114 = var112;
            SubLObject var115 = (SubLObject)NIL;
            SubLObject var116 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var114, var113, (SubLObject)$ic19$);
            var115 = var114.first();
            var114 = var114.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var114, var113, (SubLObject)$ic19$);
            var116 = var114.first();
            var114 = var114.rest();
            if (NIL == var114) {
                final SubLObject var117 = module0408.f28487(var115, var109);
                var110 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var117, var116), var110);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var113, (SubLObject)$ic19$);
            }
            var111 = var111.rest();
            var112 = var111.first();
        }
        return Sequences.nreverse(var110);
    }
    
    public static SubLObject f28554(final SubLObject var9) {
        final SubLObject var10 = var9.first();
        SubLObject var12;
        final SubLObject var11 = var12 = var10;
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var11, (SubLObject)$ic20$);
        var13 = var12.first();
        var12 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var12, var11, (SubLObject)$ic20$);
        var14 = var12.first();
        var12 = var12.rest();
        if (NIL == var12) {
            if (NIL != module0233.f15393(var13)) {
                SubLObject var15 = var9;
                SubLObject var16 = (SubLObject)NIL;
                var16 = var15.first();
                while (NIL != var15) {
                    ConsesLow.rplaca(var16, (SubLObject)NIL);
                    var15 = var15.rest();
                    var16 = var15.first();
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var11, (SubLObject)$ic20$);
        }
        return var9;
    }
    
    public static SubLObject f28555(SubLObject var9, final SubLObject var38, final SubLObject var49, final SubLObject var50) {
        if (var49.eql((SubLObject)$ic21$)) {
            var9 = module0035.f2076(Symbols.symbol_function((SubLObject)$ic22$), var9);
            var9 = module0233.f15381(var38, var9);
            if ($ic23$ == var50) {
                var9 = module0035.f2076(Symbols.symbol_function((SubLObject)$ic24$), var9);
            }
            var9 = module0035.f2269(var9, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (var49.eql((SubLObject)$ic25$)) {
            var9 = module0035.f2076(Symbols.symbol_function((SubLObject)$ic26$), var9);
        }
        else if (var49.eql((SubLObject)$ic27$)) {
            var9 = module0233.f15381(var38, var9);
            if ($ic23$ == var50) {
                SubLObject var51 = var9;
                SubLObject var52 = (SubLObject)NIL;
                var52 = var51.first();
                while (NIL != var51) {
                    final SubLObject var38_126 = var52.first();
                    ConsesLow.rplaca(var52, module0409.f28536(var38_126));
                    var51 = var51.rest();
                    var52 = var51.first();
                }
            }
        }
        else if (NIL != module0360.f23961(var49)) {
            final SubLObject var53 = conses_high.second(var49);
            var9 = f28555(var9, var38, (SubLObject)$ic21$, var50);
            var9 = module0409.f28532(var9, var53);
        }
        else {
            Errors.error((SubLObject)$ic28$, var49);
        }
        return var9;
    }
    
    public static SubLObject f28549(final SubLObject var3) {
        SubLObject var4;
        SubLObject var5;
        SubLObject var6;
        for (var4 = (SubLObject)NIL, var4 = var3; NIL != var4; var4 = conses_high.cddr(var4)) {
            var5 = var4.first();
            var6 = conses_high.cadr(var4);
            if (NIL == f28556(var5, var6)) {
                return (SubLObject)NIL;
            }
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f28548(SubLObject var3) {
        if (NIL == module0360.f23918(var3)) {
            var3 = conses_high.remf(conses_high.copy_list(var3), (SubLObject)$ic29$);
            var3 = conses_high.remf(conses_high.copy_list(var3), (SubLObject)$ic30$);
        }
        final SubLObject var4 = module0360.f23960(var3);
        if (var4.eql((SubLObject)$ic25$) || var4.eql((SubLObject)$ic27$)) {
            var3 = conses_high.putf(conses_high.copy_list(var3), (SubLObject)$ic31$, (SubLObject)$ic32$);
        }
        return var3;
    }
    
    public static SubLObject f28557(final SubLObject var129) {
        return module0035.f2169(var129, $g3318$.getGlobalValue());
    }
    
    public static SubLObject f28558(final SubLObject var129) {
        return (SubLObject)makeBoolean(NIL != f28557(var129) || NIL != module0035.f2169(var129, $g3317$.getGlobalValue()));
    }
    
    public static SubLObject f28556(final SubLObject var42, final SubLObject var128) {
        if (NIL != module0035.f2169(var42, $g3314$.getGlobalValue())) {
            return (SubLObject)T;
        }
        if (NIL != f28557(var42)) {
            return (SubLObject)T;
        }
        return (SubLObject)makeBoolean(NIL == f28559(var42, var128));
    }
    
    public static SubLObject f28559(final SubLObject var42, final SubLObject var128) {
        if (NIL != module0035.f2169(var42, $g3315$.getGlobalValue())) {
            if (NIL != var128) {
                return var42;
            }
            return (SubLObject)NIL;
        }
        else if (NIL != module0035.f2169(var42, $g3316$.getGlobalValue())) {
            if (NIL != module0360.f23986(var42, var128)) {
                return (SubLObject)NIL;
            }
            return var42;
        }
        else {
            if (var42.eql((SubLObject)$ic29$)) {
                return (SubLObject)(ZERO_INTEGER.eql(var128) ? NIL : $ic38$);
            }
            if (var42.eql((SubLObject)$ic39$)) {
                return (SubLObject)((NIL == var128) ? NIL : $ic40$);
            }
            if (var42.eql((SubLObject)$ic41$)) {
                return (SubLObject)(ZERO_INTEGER.eql(var128) ? NIL : $ic42$);
            }
            if (var42.eql((SubLObject)$ic43$)) {
                return (SubLObject)((NIL != f28560(var128)) ? NIL : $ic44$);
            }
            if (var42.eql((SubLObject)$ic45$)) {
                return (SubLObject)(($ic46$ == var128) ? NIL : $ic45$);
            }
            if (var42.eql((SubLObject)$ic47$)) {
                return (SubLObject)((NIL != module0035.f2169(var128, (SubLObject)$ic48$)) ? NIL : $ic49$);
            }
            if (var42.eql((SubLObject)$ic50$)) {
                return (SubLObject)((NIL != module0035.f2169((SubLObject)$ic51$, var128) || NIL != module0035.f2169((SubLObject)$ic52$, var128) || NIL != module0035.f2169((SubLObject)$ic53$, var128) || NIL != module0035.f2169((SubLObject)$ic54$, var128) || NIL != module0035.f2169((SubLObject)$ic55$, var128)) ? $ic56$ : NIL);
            }
            return (SubLObject)$ic57$;
        }
    }
    
    public static SubLObject f28560(final SubLObject var128) {
        return (SubLObject)makeBoolean(NIL != module0035.f2169(var128, (SubLObject)$ic58$) || (NIL != module0360.f23961(var128) && NIL == module0035.f2439(Symbols.symbol_function((SubLObject)$ic59$), var128, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f28561(final SubLObject var129) {
        return module0035.f2169(var129, (SubLObject)$ic60$);
    }
    
    public static SubLObject f28562() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0410", "f28544", "S#20098", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0410", "f28546", "S#31659", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0410", "f28545", "S#31618", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0410", "f28547", "S#31621", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0410", "f28551", "S#31660", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0410", "f28552", "S#31661", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0410", "f28550", "S#31662", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0410", "f28553", "S#31663", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0410", "f28554", "S#31664", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0410", "f28555", "S#31665", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0410", "f28549", "S#31666", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0410", "f28548", "S#31667", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0410", "f28557", "S#31668", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0410", "f28558", "S#31669", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0410", "f28556", "S#31670", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0410", "f28559", "S#31671", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0410", "f28560", "S#31672", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0410", "f28561", "S#31673", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28563() {
        $g3313$ = SubLFiles.defparameter("S#31674", (SubLObject)NIL);
        $g3314$ = SubLFiles.deflexical("S#31675", (SubLObject)$ic33$);
        $g3315$ = SubLFiles.deflexical("S#31676", (SubLObject)$ic34$);
        $g3316$ = SubLFiles.deflexical("S#31677", (SubLObject)$ic35$);
        $g3317$ = SubLFiles.deflexical("S#31678", (SubLObject)$ic36$);
        $g3318$ = SubLFiles.deflexical("S#31679", (SubLObject)$ic37$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28564() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f28562();
    }
    
    public void initializeVariables() {
        f28563();
    }
    
    public void runTopLevelForms() {
        f28564();
    }
    
    static {
        me = (SubLFile)new module0410();
        $g3313$ = null;
        $g3314$ = null;
        $g3315$ = null;
        $g3316$ = null;
        $g3317$ = null;
        $g3318$ = null;
        $ic0$ = makeSymbol("S#15591", "CYC");
        $ic1$ = makeSymbol("S#748", "CYC");
        $ic2$ = makeSymbol("QUERY-PROPERTY-P");
        $ic3$ = makeSymbol("S#12264", "CYC");
        $ic4$ = makeKeyword("INFERENCE-ABORT-TARGET");
        $ic5$ = makeKeyword("ABORT");
        $ic6$ = makeSymbol("CLAUSE-P");
        $ic7$ = makeSymbol("LISTP");
        $ic8$ = makeSymbol("S#31669", "CYC");
        $ic9$ = makeKeyword("NON-TRIVIAL");
        $ic10$ = makeSymbol("HL-VARIABLE-P");
        $ic11$ = makeKeyword("TRUE");
        $ic12$ = makeKeyword("FALSE");
        $ic13$ = ConsesLow.list((SubLObject)makeSymbol("S#28817", "CYC"), (SubLObject)makeSymbol("S#31680", "CYC"));
        $ic14$ = makeSymbol("S#26012", "CYC");
        $ic15$ = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic16$ = makeKeyword("MAX-TIME");
        $ic17$ = makeKeyword("INFERENCE-ERROR");
        $ic18$ = makeSymbol("S#31519", "CYC");
        $ic19$ = ConsesLow.list((SubLObject)makeSymbol("S#31681", "CYC"), (SubLObject)makeSymbol("S#31682", "CYC"));
        $ic20$ = ConsesLow.list((SubLObject)makeSymbol("S#31683", "CYC"), (SubLObject)makeSymbol("S#31684", "CYC"));
        $ic21$ = makeKeyword("BINDINGS");
        $ic22$ = makeSymbol("FIRST");
        $ic23$ = makeKeyword("EL");
        $ic24$ = makeSymbol("S#31625", "CYC");
        $ic25$ = makeKeyword("SUPPORTS");
        $ic26$ = makeSymbol("SECOND");
        $ic27$ = makeKeyword("BINDINGS-AND-SUPPORTS");
        $ic28$ = makeString("unexpected return type ~S");
        $ic29$ = makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $ic30$ = makeKeyword("MIN-RULE-UTILITY");
        $ic31$ = makeKeyword("ANSWER-LANGUAGE");
        $ic32$ = makeKeyword("HL");
        $ic33$ = ConsesLow.list(new SubLObject[] { makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY"), makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), makeKeyword("ALLOWED-RULES"), makeKeyword("FORBIDDEN-RULES"), makeKeyword("MAX-PROOF-DEPTH"), makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), makeKeyword("MAX-PROBLEM-COUNT"), makeKeyword("TRANSFORMATION-ALLOWED?"), makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), makeKeyword("RESULT-UNIQUENESS") });
        $ic34$ = ConsesLow.list(new SubLObject[] { makeKeyword("CONDITIONAL-SENTENCE?"), makeKeyword("NON-EXPLANATORY-SENTENCE"), makeKeyword("MAINTAIN-TERM-WORKING-SET?"), makeKeyword("CACHE-INFERENCE-RESULTS?"), makeKeyword("BROWSABLE?"), makeKeyword("CONTINUABLE?"), makeKeyword("BLOCK?"), makeKeyword("PROBLEM-STORE-NAME"), makeKeyword("REWRITE-ALLOWED?"), makeKeyword("ABDUCTION-ALLOWED?"), makeKeyword("FORGET-EXTRA-RESULTS?") });
        $ic35$ = ConsesLow.list((SubLObject)makeKeyword("TRANSITIVE-CLOSURE-MODE"), (SubLObject)makeKeyword("EQUALITY-REASONING-METHOD"), (SubLObject)makeKeyword("EQUALITY-REASONING-DOMAIN"), (SubLObject)makeKeyword("NEGATION-BY-FAILURE?"), (SubLObject)makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?"), (SubLObject)makeKeyword("DIRECTION"), (SubLObject)makeKeyword("EVALUATE-SUBL-ALLOWED?"), (SubLObject)makeKeyword("REMOVAL-ALLOWED?"));
        $ic36$ = ConsesLow.list((SubLObject)makeKeyword("RETURN"), (SubLObject)makeKeyword("INFERENCE-MODE"), (SubLObject)makeKeyword("METRICS"));
        $ic37$ = ConsesLow.list((SubLObject)makeKeyword("MAX-TIME"), (SubLObject)makeKeyword("MAX-NUMBER"), (SubLObject)makeKeyword("ALLOWED-MODULES"), (SubLObject)makeKeyword("ANSWER-LANGUAGE"), (SubLObject)makeKeyword("PRODUCTIVITY-LIMIT"), (SubLObject)makeKeyword("NEW-TERMS-ALLOWED?"), (SubLObject)makeKeyword("ALLOW-ABNORMALITY-CHECKING?"), (SubLObject)makeKeyword("ALLOW-INDETERMINATE-RESULTS?"));
        $ic38$ = makeKeyword("NONZERO-MAX-TRANSFORMATION-DEPTH");
        $ic39$ = makeKeyword("PROBLEM-STORE");
        $ic40$ = makeKeyword("PROBLEM-STORE-PASSED-IN");
        $ic41$ = makeKeyword("FORWARD-MAX-TIME");
        $ic42$ = makeKeyword("NONZERO-FORWARD-MAX-TIME");
        $ic43$ = makeKeyword("RETURN");
        $ic44$ = makeKeyword("UNHANDLED-RETURN-VALUE");
        $ic45$ = makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL");
        $ic46$ = makeKeyword("NONE");
        $ic47$ = makeKeyword("INFERENCE-MODE");
        $ic48$ = ConsesLow.list((SubLObject)makeKeyword("MINIMAL"), (SubLObject)makeKeyword("CUSTOM"));
        $ic49$ = makeKeyword("NON-TRIVIAL-INFERENCE-MODE");
        $ic50$ = makeKeyword("METRICS");
        $ic51$ = makeKeyword("INFERENCE-PROOF-SPEC");
        $ic52$ = makeKeyword("ANSWER-PROOF-SPECS");
        $ic53$ = makeKeyword("TOTAL-STEPS");
        $ic54$ = makeKeyword("STEP-INDEXED-PROGRESS-DATA");
        $ic55$ = makeKeyword("TICK-INDEXED-PROGRESS-DATA");
        $ic56$ = makeKeyword("UNHANDLED-METRIC");
        $ic57$ = makeKeyword("UNEXPECTED");
        $ic58$ = ConsesLow.list((SubLObject)makeKeyword("BINDINGS"), (SubLObject)makeKeyword("SUPPORTS"), (SubLObject)makeKeyword("BINDINGS-AND-SUPPORTS"));
        $ic59$ = makeSymbol("S#31673", "CYC");
        $ic60$ = ConsesLow.list((SubLObject)makeKeyword("SUPPORTS"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 719 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/