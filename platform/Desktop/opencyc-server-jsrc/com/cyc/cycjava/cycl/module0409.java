package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0409 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0409";
    public static final String myFingerPrint = "b11d2a16f95accbb4c90f2e395828b3fe36ef9d4d32a4a3919cd111cc0445df4";
    public static SubLSymbol $g3312$;
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
    private static final SubLSymbol $ic13$;
    private static final SubLString $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLString $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLList $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLList $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLList $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLString $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLList $ic47$;
    private static final SubLSymbol $ic48$;
    
    
    public static SubLObject f28505(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0409.UNPROVIDED) {
            var2 = (SubLObject)module0409.NIL;
        }
        if (var3 == module0409.UNPROVIDED) {
            var3 = (SubLObject)module0409.NIL;
        }
        SubLObject var4 = conses_high.copy_list(var3);
        var4 = conses_high.putf(var3, (SubLObject)module0409.$ic0$, (SubLObject)module0409.T);
        return f28506(var1, var2, var4);
    }
    
    public static SubLObject f28507(final SubLObject var5, final SubLObject var2, SubLObject var6, SubLObject var3) {
        if (var6 == module0409.UNPROVIDED) {
            var6 = (SubLObject)module0409.NIL;
        }
        if (var3 == module0409.UNPROVIDED) {
            var3 = (SubLObject)module0409.NIL;
        }
        SubLObject var7 = conses_high.copy_list(var3);
        var7 = conses_high.putf(var3, (SubLObject)module0409.$ic0$, (SubLObject)module0409.T);
        return f28508(var5, var2, var6, var7);
    }
    
    public static SubLObject f28506(final SubLObject var1, SubLObject var2, SubLObject var7) {
        if (var2 == module0409.UNPROVIDED) {
            var2 = (SubLObject)module0409.NIL;
        }
        if (var7 == module0409.UNPROVIDED) {
            var7 = (SubLObject)module0409.NIL;
        }
        final SubLThread var8 = SubLProcess.currentSubLThread();
        enforceType(var1, module0409.$ic1$);
        final SubLObject var9 = var7;
        enforceType(var9, module0409.$ic2$);
        SubLObject var10;
        SubLObject var11;
        SubLObject var12;
        for (var10 = (SubLObject)module0409.NIL, var10 = var9; module0409.NIL != var10; var10 = conses_high.cddr(var10)) {
            var11 = var10.first();
            var12 = conses_high.cadr(var10);
            enforceType(var11, module0409.$ic3$);
        }
        if (module0409.NIL != var2) {
            enforceType(var2, module0409.$ic4$);
        }
        SubLObject var13 = (SubLObject)module0409.NIL;
        SubLObject var14 = (SubLObject)module0409.NIL;
        SubLObject var15 = (SubLObject)module0409.NIL;
        SubLObject var16 = (SubLObject)module0409.NIL;
        SubLObject var17 = (SubLObject)module0409.NIL;
        SubLObject var18_19 = (SubLObject)module0409.NIL;
        SubLObject var18 = (SubLObject)module0409.NIL;
        final SubLObject var19 = Time.get_internal_real_time();
        final SubLObject var20 = Time.get_internal_real_time();
        final SubLObject var21 = module0018.$g734$.currentBinding(var8);
        try {
            module0018.$g734$.bind((SubLObject)module0409.T, var8);
            SubLObject var22 = (SubLObject)module0409.NIL;
            try {
                var8.throwStack.push(module0409.$ic5$);
                final SubLObject var23_25 = module0408.$g3302$.currentBinding(var8);
                try {
                    module0408.$g3302$.bind((SubLObject)module0409.T, var8);
                    if (module0409.NIL != module0409.$g3312$.getDynamicValue(var8)) {
                        var8.resetMultipleValues();
                        final SubLObject var26_27 = module0410.f28545(var1, var2, var7);
                        final SubLObject var28_29 = var8.secondMultipleValue();
                        final SubLObject var30_31 = var8.thirdMultipleValue();
                        var8.resetMultipleValues();
                        var13 = var26_27;
                        var14 = var28_29;
                        var16 = var30_31;
                    }
                    if (module0409.NIL == module0409.$g3312$.getDynamicValue(var8) || module0409.$ic6$ == var14) {
                        final SubLObject var23 = conses_high.copy_list(var7);
                        final SubLObject var24 = module0360.f23793(var23);
                        final SubLObject var25 = module0360.f23805(var23);
                        final SubLObject var26 = module0408.f28406(var7);
                        final SubLObject var27 = module0360.f23793(var26);
                        final SubLObject var28 = module0360.f23805(var26);
                        final SubLObject var29 = Types.sublisp_null(module0360.f23822(var27));
                        var15 = f28509(var1, var2, var24, var27);
                        module0369.f25544(var15, var23);
                        module0424.f29827(var15);
                        var8.resetMultipleValues();
                        final SubLObject var39_40 = f28510(var15, var25, var28, var29);
                        final SubLObject var41_42 = var8.secondMultipleValue();
                        final SubLObject var43_44 = var8.thirdMultipleValue();
                        final SubLObject var45_46 = var8.fourthMultipleValue();
                        var8.resetMultipleValues();
                        var13 = var39_40;
                        var14 = var41_42;
                        var15 = var43_44;
                        var16 = var45_46;
                    }
                }
                finally {
                    module0408.$g3302$.rebind(var23_25, var8);
                }
            }
            catch (Throwable var30) {
                var22 = Errors.handleThrowable(var30, (SubLObject)module0409.$ic5$);
            }
            finally {
                var8.throwStack.pop();
            }
            if (module0409.NIL != var22) {
                var14 = (SubLObject)module0409.$ic7$;
                module0408.f28396();
            }
        }
        finally {
            module0018.$g734$.rebind(var21, var8);
        }
        module0426.f30152(var1, var2, var7, var13, var14);
        var18_19 = Time.compute_with_process_resource_tracking_results(var20);
        var18 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var19), time_high.$internal_time_units_per_second$.getGlobalValue());
        var17 = module0012.f559(module0012.f560(var18, var18_19));
        var16 = f28511(var16, var17);
        return Values.values(var13, var14, var15, var16);
    }
    
    public static SubLObject f28511(SubLObject var16, final SubLObject var17) {
        if (module0409.NIL != var16) {
            final SubLObject var18 = module0012.f561(var17);
            final SubLObject var19 = module0012.f562(var17);
            final SubLObject var20 = module0012.f563(var17);
            var16 = Sequences.nsubstitute(var18, (SubLObject)module0409.$ic8$, var16, (SubLObject)module0409.UNPROVIDED, (SubLObject)module0409.UNPROVIDED, (SubLObject)module0409.UNPROVIDED, (SubLObject)module0409.UNPROVIDED, (SubLObject)module0409.UNPROVIDED);
            var16 = Sequences.nsubstitute(var19, (SubLObject)module0409.$ic9$, var16, (SubLObject)module0409.UNPROVIDED, (SubLObject)module0409.UNPROVIDED, (SubLObject)module0409.UNPROVIDED, (SubLObject)module0409.UNPROVIDED, (SubLObject)module0409.UNPROVIDED);
            var16 = Sequences.nsubstitute(var20, (SubLObject)module0409.$ic10$, var16, (SubLObject)module0409.UNPROVIDED, (SubLObject)module0409.UNPROVIDED, (SubLObject)module0409.UNPROVIDED, (SubLObject)module0409.UNPROVIDED, (SubLObject)module0409.UNPROVIDED);
        }
        return var16;
    }
    
    public static SubLObject f28508(final SubLObject var5, final SubLObject var2, SubLObject var6, SubLObject var7) {
        if (var6 == module0409.UNPROVIDED) {
            var6 = (SubLObject)module0409.NIL;
        }
        if (var7 == module0409.UNPROVIDED) {
            var7 = (SubLObject)module0409.NIL;
        }
        final SubLThread var8 = SubLProcess.currentSubLThread();
        if (module0409.NIL != var2 && !module0409.areAssertionsDisabledFor(me) && module0409.NIL == module0161.f10479(var2)) {
            throw new AssertionError(var2);
        }
        assert module0409.NIL != Types.listp(var6) : var6;
        final SubLObject var9 = var7;
        assert module0409.NIL != module0035.f2327(var9) : var9;
        SubLObject var10;
        SubLObject var11;
        SubLObject var12;
        for (var10 = (SubLObject)module0409.NIL, var10 = var9; module0409.NIL != var10; var10 = conses_high.cddr(var10)) {
            var11 = var10.first();
            var12 = conses_high.cadr(var10);
            assert module0409.NIL != module0360.f23781(var11) : var11;
        }
        SubLObject var13 = (SubLObject)module0409.NIL;
        SubLObject var14 = (SubLObject)module0409.NIL;
        SubLObject var15 = (SubLObject)module0409.NIL;
        SubLObject var16 = (SubLObject)module0409.NIL;
        SubLObject var17 = (SubLObject)module0409.NIL;
        SubLObject var18_54 = (SubLObject)module0409.NIL;
        SubLObject var18 = (SubLObject)module0409.NIL;
        final SubLObject var19 = Time.get_internal_real_time();
        final SubLObject var20 = Time.get_internal_real_time();
        SubLObject var21 = (SubLObject)module0409.NIL;
        try {
            var8.throwStack.push(module0409.$ic5$);
            final SubLObject var22 = module0408.$g3302$.currentBinding(var8);
            try {
                module0408.$g3302$.bind((SubLObject)module0409.T, var8);
                if (module0409.NIL != module0409.$g3312$.getDynamicValue(var8)) {
                    var8.resetMultipleValues();
                    final SubLObject var55_56 = module0410.f28547(var5, var2, var6, var7);
                    final SubLObject var57_58 = var8.secondMultipleValue();
                    final SubLObject var59_60 = var8.thirdMultipleValue();
                    var8.resetMultipleValues();
                    var13 = var55_56;
                    var14 = var57_58;
                    var16 = var59_60;
                }
                if (module0409.NIL == module0409.$g3312$.getDynamicValue(var8) || module0409.$ic6$ == var14) {
                    final SubLObject var23 = conses_high.copy_list(var7);
                    final SubLObject var24 = module0360.f23793(var23);
                    final SubLObject var25 = module0360.f23805(var23);
                    final SubLObject var26 = module0408.f28406(var7);
                    final SubLObject var27 = module0360.f23793(var26);
                    final SubLObject var28 = module0360.f23805(var26);
                    final SubLObject var29 = Types.sublisp_null(module0360.f23822(var27));
                    var15 = f28512(var5, var2, var6, var24, var27);
                    module0369.f25544(var15, var23);
                    var8.resetMultipleValues();
                    final SubLObject var61_62 = f28510(var15, var25, var28, var29);
                    final SubLObject var63_64 = var8.secondMultipleValue();
                    final SubLObject var65_66 = var8.thirdMultipleValue();
                    final SubLObject var67_68 = var8.fourthMultipleValue();
                    var8.resetMultipleValues();
                    var13 = var61_62;
                    var14 = var63_64;
                    var15 = var65_66;
                    var16 = var67_68;
                }
            }
            finally {
                module0408.$g3302$.rebind(var22, var8);
            }
        }
        catch (Throwable var30) {
            var21 = Errors.handleThrowable(var30, (SubLObject)module0409.$ic5$);
        }
        finally {
            var8.throwStack.pop();
        }
        if (module0409.NIL != var21) {
            var14 = (SubLObject)module0409.$ic7$;
            module0408.f28396();
        }
        var18_54 = Time.compute_with_process_resource_tracking_results(var20);
        var18 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var19), time_high.$internal_time_units_per_second$.getGlobalValue());
        var17 = module0012.f559(module0012.f560(var18, var18_54));
        var16 = f28511(var16, var17);
        return Values.values(var13, var14, var15, var16);
    }
    
    public static SubLObject f28510(final SubLObject var15, final SubLObject var34, final SubLObject var37, final SubLObject var38) {
        final SubLThread var39 = SubLProcess.currentSubLThread();
        final SubLObject var40 = module0360.f23844(var37);
        final SubLObject var41 = (SubLObject)SubLObjectFactory.makeBoolean(module0409.NIL != var38 && module0409.NIL == module0360.f23981(var40));
        final SubLObject var42 = module0360.f23981(var40);
        if (module0409.NIL != var41) {
            final SubLObject var43 = module0369.f25421(var15);
            module0361.f24188(var43);
        }
        SubLObject var44 = (SubLObject)module0409.NIL;
        SubLObject var45 = (SubLObject)module0409.NIL;
        SubLObject var46 = (SubLObject)module0409.NIL;
        SubLObject var47 = (SubLObject)module0409.NIL;
        if (module0409.NIL != module0369.f25431(var15)) {
            var39.resetMultipleValues();
            final SubLObject var75_76 = f28513(var15, var34, var37);
            final SubLObject var77_78 = var39.secondMultipleValue();
            final SubLObject var79_80 = var39.thirdMultipleValue();
            final SubLObject var81_82 = var39.fourthMultipleValue();
            var39.resetMultipleValues();
            var44 = var75_76;
            var45 = var77_78;
            var46 = var79_80;
            var47 = var81_82;
        }
        else {
            var39.resetMultipleValues();
            final SubLObject var83_84 = f28514(var15);
            final SubLObject var85_86 = var39.secondMultipleValue();
            final SubLObject var87_88 = var39.thirdMultipleValue();
            var39.resetMultipleValues();
            var44 = var83_84;
            var45 = var85_86;
            var47 = var87_88;
        }
        final SubLObject var48 = module0369.f25421(var15);
        final SubLObject var49 = (SubLObject)SubLObjectFactory.makeBoolean(module0409.NIL == var42);
        if (module0409.NIL != var49) {
            module0369.f25471(var15);
        }
        if (module0409.NIL != var41) {
            module0361.f24005(var48);
        }
        if (module0409.NIL != var42) {
            return Values.values(var44, var45, var15, var47);
        }
        return Values.values(var44, var45, (SubLObject)module0409.NIL, var47);
    }
    
    public static SubLObject f28515(final SubLObject var1, SubLObject var2, SubLObject var36) {
        if (var2 == module0409.UNPROVIDED) {
            var2 = (SubLObject)module0409.NIL;
        }
        if (var36 == module0409.UNPROVIDED) {
            var36 = (SubLObject)module0409.NIL;
        }
        assert module0409.NIL != module0202.f12663(var1) : var1;
        if (module0409.NIL != var2 && !module0409.areAssertionsDisabledFor(me) && module0409.NIL == module0161.f10479(var2)) {
            throw new AssertionError(var2);
        }
        assert module0409.NIL != module0360.f23799(var36) : var36;
        module0426.f30153(var1, var2, var36);
        final SubLObject var37 = conses_high.copy_list(var36);
        final SubLObject var38 = module0360.f23793(module0408.f28406(var36));
        return f28509(var1, var2, var37, var38);
    }
    
    public static SubLObject f28509(final SubLObject var1, SubLObject var2, SubLObject var33, SubLObject var36) {
        if (var2 == module0409.UNPROVIDED) {
            var2 = (SubLObject)module0409.NIL;
        }
        if (var33 == module0409.UNPROVIDED) {
            var33 = (SubLObject)module0409.NIL;
        }
        if (var36 == module0409.UNPROVIDED) {
            var36 = (SubLObject)module0409.NIL;
        }
        final SubLThread var37 = SubLProcess.currentSubLThread();
        SubLObject var38 = (SubLObject)module0409.NIL;
        SubLObject var39 = (SubLObject)module0409.NIL;
        try {
            var37.resetMultipleValues();
            final SubLObject var40 = f28516(var36);
            final SubLObject var41 = var37.secondMultipleValue();
            final SubLObject var42 = var37.thirdMultipleValue();
            final SubLObject var43 = var37.fourthMultipleValue();
            var37.resetMultipleValues();
            final SubLObject var44 = conses_high.getf(var40, (SubLObject)module0409.$ic13$, (SubLObject)module0409.UNPROVIDED);
            final SubLObject var45 = module0360.f23969(var40);
            final SubLObject var46 = module0408.f28457(var1, var2, var36);
            var39 = module0408.f28416(var43, var1, var2, var46, var45, var44, var41, var42);
            f28517(var39, var33, var40, var36);
            var38 = (SubLObject)module0409.T;
        }
        finally {
            final SubLObject var47 = Threads.$is_thread_performing_cleanupP$.currentBinding(var37);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0409.T, var37);
                if (module0409.NIL == var38 && module0409.NIL != module0369.f25417(var39)) {
                    module0369.f25554(var39, module0360.f23875((SubLObject)module0409.$ic14$));
                    module0369.f25447(var39, (SubLObject)module0409.$ic15$);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var47, var37);
            }
        }
        return var39;
    }
    
    public static SubLObject f28518(final SubLObject var5, final SubLObject var2, SubLObject var6, SubLObject var36) {
        if (var6 == module0409.UNPROVIDED) {
            var6 = (SubLObject)module0409.NIL;
        }
        if (var36 == module0409.UNPROVIDED) {
            var36 = (SubLObject)module0409.NIL;
        }
        assert module0409.NIL != module0232.f15321(var5) : var5;
        assert module0409.NIL != module0161.f10479(var2) : var2;
        assert module0409.NIL != Types.listp(var6) : var6;
        assert module0409.NIL != module0360.f23799(var36) : var36;
        final SubLObject var37 = conses_high.copy_list(var36);
        final SubLObject var38 = module0360.f23793(module0408.f28406(var36));
        return f28512(var5, var2, var6, var37, var38);
    }
    
    public static SubLObject f28512(final SubLObject var5, final SubLObject var2, final SubLObject var6, final SubLObject var33, final SubLObject var36) {
        final SubLThread var37 = SubLProcess.currentSubLThread();
        var37.resetMultipleValues();
        final SubLObject var38 = f28516(var36);
        final SubLObject var39 = var37.secondMultipleValue();
        final SubLObject var40 = var37.thirdMultipleValue();
        final SubLObject var41 = var37.fourthMultipleValue();
        var37.resetMultipleValues();
        final SubLObject var42 = module0408.f28459(var5, var2, var36);
        final SubLObject var43 = module0408.f28417(var41, var5, var2, var42, var6, var39, var40);
        f28517(var43, var33, var38, var36);
        return var43;
    }
    
    public static SubLObject f28516(final SubLObject var36) {
        final SubLObject var37 = module0360.f23818(var36);
        final SubLObject var38 = conses_high.getf(var37, (SubLObject)module0409.$ic17$, (SubLObject)module0409.UNPROVIDED);
        final SubLObject var39 = Types.sublisp_null(module0360.f23822(var36));
        final SubLObject var40 = f28519(var36);
        return Values.values(var37, var38, var39, var40);
    }
    
    public static SubLObject f28517(final SubLObject var15, final SubLObject var33, final SubLObject var93, final SubLObject var36) {
        module0369.f25544(var15, var33);
        module0369.f25675(var15, var93);
        final SubLObject var94 = module0369.f25606(var15);
        final SubLObject var95 = module0360.f23849(var36);
        module0387.f27553(var94, var95);
        return var15;
    }
    
    public static SubLObject f28519(final SubLObject var100) {
        final SubLObject var101 = module0360.f23822(var100);
        if (module0409.NIL != var101) {
            return var101;
        }
        final SubLObject var102 = f28520(var100);
        return module0361.f24136(var102);
    }
    
    public static SubLObject f28520(final SubLObject var36) {
        return module0035.f2329(var36, (SubLObject)module0409.$ic18$);
    }
    
    public static SubLObject f28521(final SubLObject var15, SubLObject var37) {
        if (var37 == module0409.UNPROVIDED) {
            var37 = (SubLObject)module0409.NIL;
        }
        enforceType(var15, module0409.$ic19$);
        assert module0409.NIL != module0360.f23804(var37) : var37;
        final SubLObject var38 = conses_high.copy_list(var37);
        final SubLObject var39 = module0360.f23805(module0408.f28406(var37));
        return f28513(var15, var38, var39);
    }
    
    public static SubLObject f28513(final SubLObject var15, final SubLObject var34, final SubLObject var103) {
        final SubLThread var104 = SubLProcess.currentSubLThread();
        f28522(var15, var34, var103);
        module0408.f28463(var15);
        module0369.f25446(var15);
        final SubLObject var105 = module0339.$g2901$.currentBinding(var104);
        try {
            module0339.$g2901$.bind((SubLObject)ConsesLow.cons(var15, module0339.$g2901$.getDynamicValue(var104)), var104);
            module0408.f28430(var15);
        }
        finally {
            module0339.$g2901$.rebind(var105, var104);
        }
        return f28523(var15);
    }
    
    public static SubLObject f28522(final SubLObject var15, final SubLObject var34, final SubLObject var37) {
        final SubLObject var38 = module0360.f23844(var37);
        if (module0409.NIL != module0369.f25427(var15)) {
            module0408.f28425(var15, var38);
            module0408.f28409(var15);
        }
        else {
            module0408.f28425(var15, var38);
        }
        module0369.f25677(var15, var34);
        final SubLObject var39 = module0360.f23853(var37);
        final SubLObject var40 = module0369.f25606(var15);
        module0387.f27555(var40, var39);
        module0361.f24387(module0369.f25421(var15));
        return var15;
    }
    
    public static SubLObject f28523(final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        assert module0409.NIL != module0369.f25275(var15) : var15;
        SubLObject var17 = (SubLObject)module0409.NIL;
        SubLObject var18 = (SubLObject)module0409.NIL;
        SubLObject var19 = (SubLObject)module0409.NIL;
        SubLObject var20 = (SubLObject)module0409.NIL;
        SubLObject var21 = (SubLObject)module0409.NIL;
        if (module0409.NIL != module0018.$g629$.getDynamicValue(var16)) {
            if (module0409.NIL == module0369.f25417(var15)) {
                Errors.error((SubLObject)module0409.$ic22$);
            }
            final SubLObject var22 = module0369.f25657(var15);
            var18 = module0369.f25433(var15);
            if (module0409.NIL != module0369.f25515(var15)) {
                var19 = var15;
            }
            var20 = module0369.f25804(var15);
            var17 = f28524(var15, var22);
            if (module0409.NIL != module0369.f25614(var15)) {
                var17 = f28525(var17, var15);
            }
            if (module0409.NIL != module0369.f25501(var15)) {
                SubLObject var23 = var22;
                SubLObject var24 = (SubLObject)module0409.NIL;
                var24 = var23.first();
                while (module0409.NIL != var23) {
                    module0408.f28493(var24);
                    var23 = var23.rest();
                    var24 = var23.first();
                }
            }
        }
        else {
            try {
                var16.throwStack.push(module0409.$ic23$);
                final SubLObject var25 = Errors.$error_handler$.currentBinding(var16);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0409.$ic24$), var16);
                    try {
                        if (module0409.NIL == module0369.f25417(var15)) {
                            Errors.error((SubLObject)module0409.$ic22$);
                        }
                        final SubLObject var26 = module0369.f25657(var15);
                        var18 = module0369.f25433(var15);
                        if (module0409.NIL != module0369.f25515(var15)) {
                            var19 = var15;
                        }
                        var20 = module0369.f25804(var15);
                        var17 = f28524(var15, var26);
                        if (module0409.NIL != module0369.f25614(var15)) {
                            var17 = f28525(var17, var15);
                        }
                        if (module0409.NIL != module0369.f25501(var15)) {
                            SubLObject var27 = var26;
                            SubLObject var28 = (SubLObject)module0409.NIL;
                            var28 = var27.first();
                            while (module0409.NIL != var27) {
                                module0408.f28493(var28);
                                var27 = var27.rest();
                                var28 = var27.first();
                            }
                        }
                    }
                    catch (Throwable var29) {
                        Errors.handleThrowable(var29, (SubLObject)module0409.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var25, var16);
                }
            }
            catch (Throwable var30) {
                var21 = Errors.handleThrowable(var30, (SubLObject)module0409.$ic23$);
            }
            finally {
                var16.throwStack.pop();
            }
        }
        if (module0409.NIL != var21) {
            var18 = module0360.f23875(var21);
        }
        return Values.values(var17, var18, var19, var20);
    }
    
    public static SubLObject f28524(final SubLObject var15, final SubLObject var107) {
        final SubLObject var108 = module0369.f25500(var15);
        final SubLObject var109 = module0369.f25516(var15);
        SubLObject var110 = (SubLObject)module0409.NIL;
        final SubLObject var111 = var109;
        if (var111.eql((SubLObject)module0409.$ic25$)) {
            var110 = var107;
        }
        else if (var111.eql((SubLObject)module0409.$ic26$)) {
            var110 = f28526(var107, (SubLObject)module0409.$ic26$);
        }
        else if (var111.eql((SubLObject)module0409.$ic27$)) {
            var110 = f28526(var107, (SubLObject)module0409.$ic27$);
        }
        else if (var111.eql((SubLObject)module0409.$ic28$)) {
            var110 = f28526(var107, (SubLObject)module0409.$ic29$);
        }
        else if (var111.eql((SubLObject)module0409.$ic30$)) {
            var110 = f28526(var107, (SubLObject)module0409.$ic31$);
        }
        else if (var111.eql((SubLObject)module0409.$ic32$)) {
            final SubLObject var112 = module0369.f25491(var15);
            var110 = (SubLObject)ConsesLow.list(f28527(var107, var108), var112);
        }
        else if (module0409.NIL != module0360.f23961(var109)) {
            final SubLObject var113 = f28528(var109);
            var110 = f28526(var107, var113);
        }
        else if (module0409.NIL != module0360.f23962(var109)) {
            var110 = f28529(var107, var109);
        }
        else {
            Errors.error((SubLObject)module0409.$ic33$, var109);
        }
        return var110;
    }
    
    public static SubLObject f28530(final SubLObject var15) {
        final SubLObject var16 = module0369.f25656(var15);
        return f28524(var15, var16);
    }
    
    public static SubLObject f28528(final SubLObject var112) {
        final SubLThread var113 = SubLProcess.currentSubLThread();
        if (module0409.NIL == Errors.$ignore_mustsP$.getDynamicValue(var113) && module0409.NIL == module0035.f1995(var112, (SubLObject)module0409.TWO_INTEGER, (SubLObject)module0409.UNPROVIDED)) {
            Errors.error((SubLObject)module0409.$ic34$, var112);
        }
        return conses_high.second(var112);
    }
    
    public static SubLObject f28526(final SubLObject var107, final SubLObject var115) {
        final SubLObject var116 = module0035.f2434((SubLObject)module0409.$ic27$, var115);
        final SubLObject var117 = module0035.f2434((SubLObject)module0409.$ic35$, var115);
        SubLObject var118 = (SubLObject)module0409.NIL;
        SubLObject var119 = var107;
        SubLObject var120 = (SubLObject)module0409.NIL;
        var120 = var119.first();
        while (module0409.NIL != var119) {
            final SubLObject var121 = module0369.f25752(var120);
            final SubLObject var122 = f28531(var121, var115);
            if (module0409.NIL == var116 && module0409.NIL == var117) {
                var118 = (SubLObject)ConsesLow.cons(var122, var118);
            }
            else if (module0369.f25757(var120).isZero()) {
                final SubLObject var123 = (SubLObject)module0409.NIL;
                final SubLObject var124 = (SubLObject)module0409.NIL;
                SubLObject var125 = var122;
                var125 = conses_high.subst(var123, (SubLObject)module0409.$ic27$, var125, (SubLObject)module0409.UNPROVIDED, (SubLObject)module0409.UNPROVIDED);
                var125 = conses_high.subst(var124, (SubLObject)module0409.$ic35$, var125, (SubLObject)module0409.UNPROVIDED, (SubLObject)module0409.UNPROVIDED);
                var118 = (SubLObject)ConsesLow.cons(var125, var118);
            }
            else {
                SubLObject var108_122 = module0369.f25744(var120);
                SubLObject var126 = (SubLObject)module0409.NIL;
                var126 = var108_122.first();
                while (module0409.NIL != var108_122) {
                    final SubLObject var127 = module0369.f25775(var126);
                    final SubLObject var128 = module0369.f25784(var126);
                    SubLObject var129 = var122;
                    var129 = conses_high.subst(var127, (SubLObject)module0409.$ic27$, var129, (SubLObject)module0409.UNPROVIDED, (SubLObject)module0409.UNPROVIDED);
                    var129 = conses_high.subst(var128, (SubLObject)module0409.$ic35$, var129, (SubLObject)module0409.UNPROVIDED, (SubLObject)module0409.UNPROVIDED);
                    var118 = (SubLObject)ConsesLow.cons(var129, var118);
                    var108_122 = var108_122.rest();
                    var126 = var108_122.first();
                }
            }
            var119 = var119.rest();
            var120 = var119.first();
        }
        return Sequences.nreverse(var118);
    }
    
    public static SubLObject f28532(final SubLObject var124, final SubLObject var115) {
        SubLObject var125 = (SubLObject)module0409.NIL;
        SubLObject var126 = var124;
        SubLObject var127 = (SubLObject)module0409.NIL;
        var127 = var126.first();
        while (module0409.NIL != var126) {
            final SubLObject var128 = f28531(var127, var115);
            var125 = (SubLObject)ConsesLow.cons(var128, var125);
            var126 = var126.rest();
            var127 = var126.first();
        }
        return Sequences.nreverse(var125);
    }
    
    public static SubLObject f28531(final SubLObject var118, final SubLObject var115) {
        final SubLObject var119 = module0035.f2434((SubLObject)module0409.$ic26$, var115);
        SubLObject var120 = module0233.f15362(var118, var115);
        if (module0409.NIL != var119) {
            var120 = conses_high.subst(var118, (SubLObject)module0409.$ic26$, var120, (SubLObject)module0409.UNPROVIDED, (SubLObject)module0409.UNPROVIDED);
        }
        return var120;
    }
    
    public static SubLObject f28529(final SubLObject var107, final SubLObject var112) {
        SubLObject var113 = (SubLObject)module0409.NIL;
        SubLObject var114 = (SubLObject)module0409.NIL;
        SubLObject var115 = (SubLObject)module0409.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var112, var112, (SubLObject)module0409.$ic36$);
        var114 = var112.first();
        SubLObject var116 = var112.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var116, var112, (SubLObject)module0409.$ic36$);
        var115 = var116.first();
        final SubLObject var117;
        var116 = (var117 = var116.rest());
        SubLObject var118 = var107;
        SubLObject var119 = (SubLObject)module0409.NIL;
        var119 = var118.first();
        while (module0409.NIL != var118) {
            SubLObject var120 = var117;
            final SubLObject var121 = module0369.f25752(var119);
            var120 = module0233.f15362(var121, var120);
            final SubLObject var122 = Functions.apply(Symbols.symbol_function((SubLObject)module0409.$ic37$), (SubLObject)module0409.NIL, new SubLObject[] { var115, var120 });
            var113 = (SubLObject)ConsesLow.cons(var122, var113);
            var118 = var118.rest();
            var119 = var118.first();
        }
        return Sequences.nreverse(var113);
    }
    
    public static SubLObject f28533(final SubLObject var15) {
        SubLObject var16 = (SubLObject)module0409.NIL;
        final SubLObject var17 = module0369.f25492(var15);
        if (module0409.NIL == module0065.f4772(var17, (SubLObject)module0409.$ic38$)) {
            final SubLObject var133_134 = var17;
            if (module0409.NIL == module0065.f4775(var133_134, (SubLObject)module0409.$ic38$)) {
                final SubLObject var18 = module0065.f4740(var133_134);
                final SubLObject var19 = (SubLObject)module0409.NIL;
                SubLObject var20;
                SubLObject var21;
                SubLObject var22;
                SubLObject var23;
                for (var20 = Sequences.length(var18), var21 = (SubLObject)module0409.NIL, var21 = (SubLObject)module0409.ZERO_INTEGER; var21.numL(var20); var21 = Numbers.add(var21, (SubLObject)module0409.ONE_INTEGER)) {
                    var22 = ((module0409.NIL != var19) ? Numbers.subtract(var20, var21, (SubLObject)module0409.ONE_INTEGER) : var21);
                    var23 = Vectors.aref(var18, var22);
                    if (module0409.NIL == module0065.f4749(var23) || module0409.NIL == module0065.f4773((SubLObject)module0409.$ic38$)) {
                        if (module0409.NIL != module0065.f4749(var23)) {
                            var23 = (SubLObject)module0409.$ic38$;
                        }
                        var16 = (SubLObject)ConsesLow.cons(module0369.f25752(var23), var16);
                    }
                }
            }
            final SubLObject var140_141 = var17;
            if (module0409.NIL == module0065.f4777(var140_141) || module0409.NIL == module0065.f4773((SubLObject)module0409.$ic38$)) {
                final SubLObject var24 = module0065.f4738(var140_141);
                SubLObject var25 = module0065.f4739(var140_141);
                final SubLObject var26 = module0065.f4734(var140_141);
                final SubLObject var27 = (SubLObject)((module0409.NIL != module0065.f4773((SubLObject)module0409.$ic38$)) ? module0409.NIL : module0409.$ic38$);
                while (var25.numL(var26)) {
                    final SubLObject var28 = Hashtables.gethash_without_values(var25, var24, var27);
                    if (module0409.NIL == module0065.f4773((SubLObject)module0409.$ic38$) || module0409.NIL == module0065.f4749(var28)) {
                        var16 = (SubLObject)ConsesLow.cons(module0369.f25752(var28), var16);
                    }
                    var25 = Numbers.add(var25, (SubLObject)module0409.ONE_INTEGER);
                }
            }
        }
        return Sequences.nreverse(var16);
    }
    
    public static SubLObject f28525(final SubLObject var73, final SubLObject var15) {
        final SubLObject var74 = module0369.f25521(var15);
        if (module0409.NIL != var74) {
            return module0035.f2124(var74, var73);
        }
        return var73;
    }
    
    public static SubLObject f28514(final SubLObject var15) {
        SubLObject var16 = (SubLObject)module0409.NIL;
        SubLObject var17 = (SubLObject)module0409.NIL;
        final SubLObject var18 = (SubLObject)module0409.NIL;
        final SubLObject var19 = module0369.f25420(var15);
        if (var19.eql((SubLObject)module0409.$ic39$)) {
            final SubLObject var20 = module0369.f25485(var15);
            final SubLObject var21 = module0369.f25484(var15);
            module0538.f33323(module0538.f33383(var20, var21));
            var16 = (SubLObject)module0409.NIL;
            var17 = (SubLObject)module0409.$ic39$;
        }
        else if (var19.eql((SubLObject)module0409.$ic40$)) {
            var16 = module0540.f33527();
            var17 = (SubLObject)module0409.$ic40$;
        }
        else if (var19.eql((SubLObject)module0409.$ic41$)) {
            var16 = (SubLObject)module0409.NIL;
            var17 = (SubLObject)module0409.$ic41$;
        }
        else {
            Errors.error((SubLObject)module0409.$ic42$, module0369.f25420(var15));
        }
        return Values.values(var16, var17, var18);
    }
    
    public static SubLObject f28527(final SubLObject var107, final SubLObject var111) {
        assert module0409.NIL != module0360.f23964(var111) : var111;
        if (module0409.$ic44$ == var111) {
            return Mapping.mapcar((SubLObject)module0409.$ic45$, var107);
        }
        return Mapping.mapcar((SubLObject)module0409.$ic46$, var107);
    }
    
    public static SubLObject f28534(final SubLObject var109, final SubLObject var111) {
        assert module0409.NIL != module0360.f23964(var111) : var111;
        if (module0409.$ic44$ == var111) {
            return module0369.f25687(var109);
        }
        return f28535(var109);
    }
    
    public static SubLObject f28535(final SubLObject var109) {
        final SubLObject var110 = module0369.f25687(var109);
        return f28536(var110);
    }
    
    public static SubLObject f28536(final SubLObject var149) {
        SubLObject var150 = (SubLObject)module0409.NIL;
        SubLObject var151 = var149;
        SubLObject var152 = (SubLObject)module0409.NIL;
        var152 = var151.first();
        while (module0409.NIL != var151) {
            SubLObject var154;
            final SubLObject var153 = var154 = var152;
            SubLObject var155 = (SubLObject)module0409.NIL;
            SubLObject var156 = (SubLObject)module0409.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var154, var153, (SubLObject)module0409.$ic47$);
            var155 = var154.first();
            var154 = (var156 = var154.rest());
            final SubLObject var157 = f28537(var156);
            var150 = (SubLObject)ConsesLow.cons(module0233.f15340(var155, var157), var150);
            var151 = var151.rest();
            var152 = var151.first();
        }
        var150 = Sequences.nreverse(var150);
        return var150;
    }
    
    public static SubLObject f28537(SubLObject var158) {
        var158 = module0538.f33483(var158);
        var158 = module0172.f10930(var158);
        return var158;
    }
    
    public static SubLObject f28538(final SubLObject var109) {
        SubLObject var110 = (SubLObject)module0409.NIL;
        SubLObject var111 = module0369.f25744(var109);
        SubLObject var112 = (SubLObject)module0409.NIL;
        var112 = var111.first();
        while (module0409.NIL != var111) {
            final SubLObject var113 = module0369.f25775(var112);
            var110 = (SubLObject)ConsesLow.cons(var113, var110);
            var111 = var111.rest();
            var112 = var111.first();
        }
        return Sequences.nreverse(var110);
    }
    
    public static SubLObject f28539(final SubLObject var109) {
        SubLObject var110 = (SubLObject)module0409.NIL;
        final SubLObject var111 = module0369.f25687(var109);
        SubLObject var112 = module0369.f25744(var109);
        SubLObject var113 = (SubLObject)module0409.NIL;
        var113 = var112.first();
        while (module0409.NIL != var112) {
            final SubLObject var114 = module0369.f25775(var113);
            var110 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var111, var114), var110);
            var112 = var112.rest();
            var113 = var112.first();
        }
        return Sequences.nreverse(var110);
    }
    
    public static SubLObject f28540(final SubLObject var109) {
        SubLObject var110 = (SubLObject)module0409.NIL;
        final SubLObject var111 = f28535(var109);
        SubLObject var112 = module0369.f25744(var109);
        SubLObject var113 = (SubLObject)module0409.NIL;
        var113 = var112.first();
        while (module0409.NIL != var112) {
            final SubLObject var114 = module0369.f25775(var113);
            final SubLObject var115 = Mapping.mapcar((SubLObject)module0409.$ic48$, var114);
            var110 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var111, var115), var110);
            var112 = var112.rest();
            var113 = var112.first();
        }
        return Sequences.nreverse(var110);
    }
    
    public static SubLObject f28541() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0409", "f28505", "S#31626", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0409", "f28507", "S#31627", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0409", "f28506", "NEW-CYC-QUERY", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0409", "f28511", "S#31628", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0409", "f28508", "S#31629", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0409", "f28510", "S#31630", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0409", "f28515", "NEW-CONTINUABLE-INFERENCE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0409", "f28509", "S#31631", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0409", "f28518", "S#31632", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0409", "f28512", "S#31633", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0409", "f28516", "S#31634", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0409", "f28517", "S#31635", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0409", "f28519", "S#31636", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0409", "f28520", "S#31637", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0409", "f28521", "CONTINUE-INFERENCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0409", "f28513", "S#31638", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0409", "f28522", "S#31639", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0409", "f28523", "S#31640", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0409", "f28524", "S#31641", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0409", "f28530", "S#31642", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0409", "f28528", "S#31643", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0409", "f28526", "S#31644", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0409", "f28532", "S#31645", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0409", "f28531", "S#31646", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0409", "f28529", "S#31647", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0409", "f28533", "S#31648", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0409", "f28525", "S#31649", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0409", "f28514", "S#31650", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0409", "f28527", "INFERENCE-ANSWERS-TO-BINDINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0409", "f28534", "S#31651", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0409", "f28535", "S#28213", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0409", "f28536", "S#31625", 1, 0, false);
        new $f28536$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0409", "f28537", "S#31652", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0409", "f28538", "S#31653", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0409", "f28539", "S#31654", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0409", "f28540", "S#31655", 1, 0, false);
        return (SubLObject)module0409.NIL;
    }
    
    public static SubLObject f28542() {
        module0409.$g3312$ = SubLFiles.defvar("S#31656", (SubLObject)module0409.T);
        return (SubLObject)module0409.NIL;
    }
    
    public static SubLObject f28543() {
        return (SubLObject)module0409.NIL;
    }
    
    public void declareFunctions() {
        f28541();
    }
    
    public void initializeVariables() {
        f28542();
    }
    
    public void runTopLevelForms() {
        f28543();
    }
    
    static {
        me = (SubLFile)new module0409();
        module0409.$g3312$ = null;
        $ic0$ = SubLObjectFactory.makeKeyword("BROWSABLE?");
        $ic1$ = SubLObjectFactory.makeSymbol("S#15591", "CYC");
        $ic2$ = SubLObjectFactory.makeSymbol("S#748", "CYC");
        $ic3$ = SubLObjectFactory.makeSymbol("QUERY-PROPERTY-P");
        $ic4$ = SubLObjectFactory.makeSymbol("S#12264", "CYC");
        $ic5$ = SubLObjectFactory.makeKeyword("INFERENCE-ABORT-TARGET");
        $ic6$ = SubLObjectFactory.makeKeyword("NON-TRIVIAL");
        $ic7$ = SubLObjectFactory.makeKeyword("ABORT");
        $ic8$ = SubLObjectFactory.makeKeyword("COMPLETE-USER-TIME");
        $ic9$ = SubLObjectFactory.makeKeyword("COMPLETE-SYSTEM-TIME");
        $ic10$ = SubLObjectFactory.makeKeyword("COMPLETE-TOTAL-TIME");
        $ic11$ = SubLObjectFactory.makeSymbol("LISTP");
        $ic12$ = SubLObjectFactory.makeSymbol("S#26493", "CYC");
        $ic13$ = SubLObjectFactory.makeKeyword("CONDITIONAL-SENTENCE?");
        $ic14$ = SubLObjectFactory.makeString("Unhandled inference error during setup");
        $ic15$ = SubLObjectFactory.makeKeyword("SUSPENDED");
        $ic16$ = SubLObjectFactory.makeSymbol("S#18061", "CYC");
        $ic17$ = SubLObjectFactory.makeKeyword("NON-EXPLANATORY-SENTENCE");
        $ic18$ = SubLObjectFactory.makeSymbol("PROBLEM-STORE-PROPERTY-P");
        $ic19$ = SubLObjectFactory.makeSymbol("S#28375", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#26495", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("INFERENCE-P");
        $ic22$ = SubLObjectFactory.makeString("Inference was destroyed while running.");
        $ic23$ = SubLObjectFactory.makeKeyword("INFERENCE-ERROR");
        $ic24$ = SubLObjectFactory.makeSymbol("S#31519", "CYC");
        $ic25$ = SubLObjectFactory.makeKeyword("ANSWER");
        $ic26$ = SubLObjectFactory.makeKeyword("BINDINGS");
        $ic27$ = SubLObjectFactory.makeKeyword("SUPPORTS");
        $ic28$ = SubLObjectFactory.makeKeyword("BINDINGS-AND-SUPPORTS");
        $ic29$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BINDINGS"), (SubLObject)SubLObjectFactory.makeKeyword("SUPPORTS"));
        $ic30$ = SubLObjectFactory.makeKeyword("BINDINGS-AND-SUPPORTS-AND-PRAGMATIC-SUPPORTS");
        $ic31$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BINDINGS"), (SubLObject)SubLObjectFactory.makeKeyword("SUPPORTS"), (SubLObject)SubLObjectFactory.makeKeyword("PRAGMATIC-SUPPORTS"));
        $ic32$ = SubLObjectFactory.makeKeyword("BINDINGS-AND-HYPOTHETICAL-BINDINGS");
        $ic33$ = SubLObjectFactory.makeString("Unexpected return type specified: ~a");
        $ic34$ = SubLObjectFactory.makeString("Ill-formed :template return type ~a");
        $ic35$ = SubLObjectFactory.makeKeyword("PRAGMATIC-SUPPORTS");
        $ic36$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("S#1502", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#62", "CYC"));
        $ic37$ = SubLObjectFactory.makeSymbol("FORMAT");
        $ic38$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic39$ = SubLObjectFactory.makeKeyword("ILL-FORMED");
        $ic40$ = SubLObjectFactory.makeKeyword("TAUTOLOGY");
        $ic41$ = SubLObjectFactory.makeKeyword("CONTRADICTION");
        $ic42$ = SubLObjectFactory.makeString("Unexpected inference status ~s");
        $ic43$ = SubLObjectFactory.makeSymbol("S#26655", "CYC");
        $ic44$ = SubLObjectFactory.makeKeyword("HL");
        $ic45$ = SubLObjectFactory.makeSymbol("S#28655", "CYC");
        $ic46$ = SubLObjectFactory.makeSymbol("S#28213", "CYC");
        $ic47$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"));
        $ic48$ = SubLObjectFactory.makeSymbol("S#31657", "CYC");
    }
    
    public static final class $f28536$UnaryFunction extends UnaryFunction
    {
        public $f28536$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#31625"));
        }
        
        public SubLObject processItem(final SubLObject var157) {
            return module0409.f28536(var157);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0409.class
	Total time: 309 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/