package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0243 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0243";
    public static final String myFingerPrint = "e3f12b7b415b4e498c681a504284dac05a4aaea626360b9f55e48cdb0903fd7b";
    public static SubLSymbol $g2458$;
    public static SubLSymbol $g2459$;
    public static SubLSymbol $g2460$;
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLString $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLString $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLString $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLString $ic18$;
    private static final SubLString $ic19$;
    private static final SubLString $ic20$;
    private static final SubLString $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLString $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLString $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLString $ic30$;
    private static final SubLString $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLInteger $ic33$;
    private static final SubLList $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLList $ic37$;
    private static final SubLList $ic38$;
    private static final SubLObject $ic39$;
    private static final SubLObject $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLObject $ic43$;
    private static final SubLObject $ic44$;
    private static final SubLList $ic45$;
    
    public static SubLObject f15683(final SubLObject var1) {
        return (SubLObject)makeBoolean(var1.isKeyword() && NIL != module0004.f104(var1, $g2459$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f15684(final SubLObject var2) {
        return (SubLObject)makeBoolean(var2.isKeyword() && NIL != module0004.f104(var2, $g2460$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f15685(final SubLObject var3, final SubLObject var2, SubLObject var4, SubLObject var5, SubLObject var6) {
        if (var4 == UNPROVIDED) {
            var4 = module0242.$g2452$.getDynamicValue();
        }
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        assert NIL != f15684(var2) : var2;
        SubLObject var7 = (SubLObject)NIL;
        var7 = conses_high.putf(var7, (SubLObject)$ic4$, var3);
        var7 = conses_high.putf(var7, (SubLObject)$ic5$, var2);
        var7 = f15686(var7, var4, var5, var6);
        return var7;
    }
    
    public static SubLObject f15686(SubLObject var7, SubLObject var4, SubLObject var5, final SubLObject var6) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        final SubLObject var10;
        final SubLObject var9 = var10 = conses_high.getf(var7, (SubLObject)$ic5$, (SubLObject)$ic6$);
        if (var10.eql((SubLObject)$ic7$)) {
            if (NIL == var4) {
                var4 = (SubLObject)$ic8$;
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var8) && $ic8$ != var4) {
                Errors.error((SubLObject)$ic9$, var4);
            }
            var7 = conses_high.putf(var7, (SubLObject)$ic10$, var4);
            if (NIL == var5) {
                var5 = (SubLObject)$ic11$;
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var8) && $ic11$ != var5) {
                Errors.error((SubLObject)$ic12$, var5);
            }
            var7 = conses_high.putf(var7, (SubLObject)$ic13$, var5);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var8) && $ic11$ != var6 && NIL == module0035.f2192((SubLObject)$ic14$, var6)) {
                Errors.error((SubLObject)$ic15$, var6);
            }
            var7 = conses_high.putf(var7, (SubLObject)$ic16$, var6);
        }
        else if (var10.eql((SubLObject)$ic17$)) {
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var8) && NIL == module0004.f105(var4)) {
                Errors.error((SubLObject)$ic18$, var4);
            }
            var7 = conses_high.putf(var7, (SubLObject)$ic10$, var4);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var8) && $ic11$ != var5 && NIL == module0035.f2192((SubLObject)$ic14$, var5)) {
                Errors.error((SubLObject)$ic19$, var5);
            }
            var7 = conses_high.putf(var7, (SubLObject)$ic13$, var5);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var8) && NIL == module0035.f2192((SubLObject)$ic14$, var6)) {
                Errors.error((SubLObject)$ic20$, var6);
            }
            var7 = conses_high.putf(var7, (SubLObject)$ic16$, var6);
        }
        else {
            Errors.error((SubLObject)$ic21$, var7);
        }
        return var7;
    }
    
    public static SubLObject f15687(final SubLObject var7) {
        return conses_high.copy_list(var7);
    }
    
    public static SubLObject f15688(final SubLObject var7) {
        return conses_high.getf(var7, (SubLObject)$ic4$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f15689(final SubLObject var7) {
        return conses_high.getf(var7, (SubLObject)$ic5$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f15690(final SubLObject var7) {
        return conses_high.getf(var7, (SubLObject)$ic10$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f15691(final SubLObject var7) {
        return conses_high.getf(var7, (SubLObject)$ic13$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f15692(final SubLObject var7, final SubLObject var10) {
        return conses_high.putf(var7, (SubLObject)$ic16$, var10);
    }
    
    public static SubLObject f15693(final SubLObject var7) {
        return conses_high.getf(var7, (SubLObject)$ic16$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f15694(final SubLObject var7, final SubLObject var11) {
        return conses_high.putf(var7, (SubLObject)$ic16$, var11);
    }
    
    public static SubLObject f15695(final SubLObject var7) {
        final SubLObject var8 = f15688(var7);
        if (NIL != module0173.f10969(var8)) {
            final SubLObject var9 = module0137.f8955(var8);
            if (NIL != module0137.f8885(var9)) {
                module0242.f15670(var9);
                return f15696(var7);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15696(final SubLObject var7) {
        final SubLObject var8 = module0138.$g1626$.getGlobalValue();
        SubLObject var9 = (SubLObject)NIL;
        try {
            var9 = ReadWriteLocks.rw_lock_seize_write_lock(var8);
            final SubLObject var10 = f15688(var7);
            final SubLObject var11 = module0137.f8955(var10);
            final SubLObject var13;
            final SubLObject var12 = var13 = f15689(var7);
            if (var13.eql((SubLObject)$ic7$)) {
                module0242.f15655(var11, (SubLObject)$ic22$);
            }
            else if (var13.eql((SubLObject)$ic17$)) {
                final SubLObject var14 = f15690(var7);
                final SubLObject var15 = module0242.f15652(var11, var14);
                module0242.f15655(var11, var15);
                f15697(var11, f15691(var7), (SubLObject)$ic23$);
            }
            else {
                Errors.error((SubLObject)$ic24$, var12);
            }
            f15697(var11, f15693(var7), (SubLObject)UNPROVIDED);
            module0067.f4886($g2458$.getGlobalValue(), var10, var7);
        }
        finally {
            if (NIL != var9) {
                ReadWriteLocks.rw_lock_release_write_lock(var8);
            }
        }
        return var7;
    }
    
    public static SubLObject f15697(final SubLObject var13, final SubLObject var17, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        if (NIL == var17) {
            return Values.values(var13, (SubLObject)ZERO_INTEGER, var18);
        }
        SubLObject var19 = (SubLObject)ZERO_INTEGER;
        SubLObject var20 = var17;
        if ($ic11$ == var20) {
            var20 = f15698(var13);
        }
        SubLObject var21 = var20;
        SubLObject var22 = (SubLObject)NIL;
        var22 = var21.first();
        while (NIL != var21) {
            if (NIL != module0173.f10969(var22)) {
                module0242.f15664(var22, var13);
                var19 = Numbers.add(var19, (SubLObject)ONE_INTEGER);
                if (NIL != var18) {
                    module0242.f15666(var22, module0242.f15664(var22, var13), var13);
                }
            }
            var21 = var21.rest();
            var22 = var21.first();
        }
        return Values.values(var13, var19, var18);
    }
    
    public static SubLObject f15698(final SubLObject var13) {
        return module0079.f5433(module0244.f15766(var13));
    }
    
    public static SubLObject f15699(final SubLObject var3, final SubLObject var2, final SubLObject var4, final SubLObject var20, SubLObject var10, SubLObject var6) {
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)ZERO_INTEGER;
        }
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)ZERO_INTEGER;
        }
        assert NIL != module0173.f10957(var20) : var20;
        assert NIL != module0173.f10955(var3) : var3;
        SubLObject var21 = (SubLObject)NIL;
        SubLObject var22 = (SubLObject)NIL;
        if (var10 == $ic11$) {
            var21 = (SubLObject)$ic11$;
            if (var6 == $ic11$) {
                var22 = (SubLObject)$ic11$;
            }
            else {
                var22 = (SubLObject)(var6.isFixnum() ? module0035.f2124(var6, var20) : NIL);
            }
        }
        else {
            var21 = (SubLObject)(var10.isFixnum() ? module0035.f2124(var10, var20) : NIL);
            var22 = (SubLObject)((var10.isFixnum() && var6.isFixnum()) ? module0035.f2129(var6, module0035.f2124(Numbers.add(var10, var6), var20)) : NIL);
        }
        return f15685(var3, var2, var4, var21, var22);
    }
    
    public static SubLObject f15700(final SubLObject var24, final SubLObject var25, SubLObject var26) {
        if (var26 == UNPROVIDED) {
            var26 = (SubLObject)T;
        }
        if (NIL != var26) {
            module0069.f4941(var24, var25);
        }
        else {
            module0069.f4937(var24, var25);
        }
        return var25;
    }
    
    public static SubLObject f15701(final SubLObject var25) {
        return module0069.f4939(var25);
    }
    
    public static SubLObject f15702(final SubLObject var25) {
        f15703(f15701(var25));
        return var25;
    }
    
    public static SubLObject f15703(final SubLObject var24) {
        module0242.$g2450$.setGlobalValue((SubLObject)NIL);
        module0067.f4881($g2458$.getGlobalValue());
        SubLObject var25 = var24;
        SubLObject var26 = (SubLObject)NIL;
        var26 = var25.first();
        while (NIL != var25) {
            f15695(var26);
            var25 = var25.rest();
            var26 = var25.first();
        }
        return (SubLObject)$ic26$;
    }
    
    public static SubLObject f15704() {
        final SubLObject var24 = module0619.f38228((SubLObject)UNPROVIDED);
        f15703(var24);
        return (SubLObject)$ic27$;
    }
    
    public static SubLObject f15705(final SubLObject var27) {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        final SubLObject var29 = (SubLObject)$ic28$;
        final SubLObject var30 = module0012.$g73$.currentBinding(var28);
        final SubLObject var31 = module0012.$g65$.currentBinding(var28);
        final SubLObject var32 = module0012.$g67$.currentBinding(var28);
        final SubLObject var33 = module0012.$g68$.currentBinding(var28);
        final SubLObject var34 = module0012.$g66$.currentBinding(var28);
        final SubLObject var35 = module0012.$g69$.currentBinding(var28);
        final SubLObject var36 = module0012.$g70$.currentBinding(var28);
        final SubLObject var37 = module0012.$silent_progressP$.currentBinding(var28);
        try {
            module0012.$g73$.bind(Time.get_universal_time(), var28);
            module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var28), var28);
            module0012.$g67$.bind((SubLObject)ONE_INTEGER, var28);
            module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var28);
            module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var28);
            module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var28);
            module0012.$g70$.bind((SubLObject)T, var28);
            module0012.$silent_progressP$.bind((SubLObject)((NIL != var29) ? module0012.$silent_progressP$.getDynamicValue(var28) : T), var28);
            module0012.f474(var29);
            final SubLObject var38 = f15706(var27);
            SubLObject var39 = (SubLObject)NIL;
            if (NIL != Filesys.probe_file(var38)) {
                SubLObject var40 = (SubLObject)NIL;
                try {
                    var28.throwStack.push(module0003.$g3$.getGlobalValue());
                    final SubLObject var29_38 = Errors.$error_handler$.currentBinding(var28);
                    try {
                        Errors.$error_handler$.bind((SubLObject)$ic29$, var28);
                        try {
                            var39 = f15701(var38);
                        }
                        catch (Throwable var41) {
                            Errors.handleThrowable(var41, (SubLObject)NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(var29_38, var28);
                    }
                }
                catch (Throwable var42) {
                    var40 = Errors.handleThrowable(var42, module0003.$g3$.getGlobalValue());
                }
                finally {
                    var28.throwStack.pop();
                }
                if (var40.isString()) {
                    Errors.warn((SubLObject)$ic30$, var38, var40);
                }
            }
            if (NIL == module0035.sublisp_boolean(var39)) {
                var39 = module0619.f38226((SubLObject)UNPROVIDED);
            }
            f15703(var39);
            module0012.f475();
        }
        finally {
            module0012.$silent_progressP$.rebind(var37, var28);
            module0012.$g70$.rebind(var36, var28);
            module0012.$g69$.rebind(var35, var28);
            module0012.$g66$.rebind(var34, var28);
            module0012.$g68$.rebind(var33, var28);
            module0012.$g67$.rebind(var32, var28);
            module0012.$g65$.rebind(var31, var28);
            module0012.$g73$.rebind(var30, var28);
        }
        return (SubLObject)$ic27$;
    }
    
    public static SubLObject f15707(final SubLObject var27, SubLObject var26) {
        if (var26 == UNPROVIDED) {
            var26 = (SubLObject)NIL;
        }
        final SubLObject var28 = f15706(var27);
        final SubLObject var29 = f15708();
        f15700(var29, var28, var26);
        return var28;
    }
    
    public static SubLObject f15706(final SubLObject var27) {
        return dumper_oc.f37916((SubLObject)$ic31$, var27, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f15708() {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10;
        for (var10 = module0066.f4838(module0067.f4891($g2458$.getGlobalValue())); NIL == module0066.f4841(var10); var10 = module0066.f4840(var10)) {
            var8.resetMultipleValues();
            final SubLObject var11 = module0066.f4839(var10);
            final SubLObject var12 = var8.secondMultipleValue();
            var8.resetMultipleValues();
            final SubLObject var13 = f15709(var11);
            var9 = (SubLObject)ConsesLow.cons(var13, var9);
        }
        module0066.f4842(var10);
        return var9;
    }
    
    public static SubLObject f15709(final SubLObject var12) {
        SubLObject var13 = module0067.f4884($g2458$.getGlobalValue(), var12, (SubLObject)UNPROVIDED);
        final SubLObject var14 = f15691(var13);
        final SubLObject var15 = f15710(var14);
        final SubLObject var16 = f15693(var13);
        final SubLObject var17 = f15710(var16);
        if (!var14.eql(var15) || !var16.eql(var17)) {
            var13 = f15687(var13);
            var13 = f15692(var13, var15);
            var13 = f15694(var13, var17);
        }
        return var13;
    }
    
    public static SubLObject f15710(final SubLObject var20) {
        if (var20.isList() && NIL != module0035.sublisp_boolean(module0035.find_if_not((SubLObject)$ic32$, var20, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))) {
            return module0035.f2110((SubLObject)$ic32$, var20, (SubLObject)UNPROVIDED);
        }
        return var20;
    }
    
    public static SubLObject f15711() {
        module0242.f15671();
        module0242.$g2450$.setGlobalValue((SubLObject)NIL);
        module0242.$g2451$.setDynamicValue((SubLObject)$ic33$);
        SubLObject var21 = module0137.f8931();
        SubLObject var22 = (SubLObject)NIL;
        var22 = var21.first();
        while (NIL != var21) {
            SubLObject var24;
            final SubLObject var23 = var24 = var22;
            SubLObject var25 = (SubLObject)NIL;
            SubLObject var26 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)$ic34$);
            var25 = var24.first();
            var24 = (var26 = var24.rest());
            module0242.f15654(var26);
            var21 = var21.rest();
            var22 = var21.first();
        }
        module0242.$g2450$.setGlobalValue(f15712((SubLObject)UNPROVIDED));
        return (SubLObject)$ic35$;
    }
    
    public static SubLObject f15713() {
        return (SubLObject)$ic35$;
    }
    
    public static SubLObject f15714(final SubLObject var49) {
        SubLObject var50 = module0137.f8931();
        SubLObject var51 = (SubLObject)NIL;
        var51 = var50.first();
        while (NIL != var50) {
            SubLObject var53;
            final SubLObject var52 = var53 = var51;
            SubLObject var54 = (SubLObject)NIL;
            SubLObject var55 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var53, var52, (SubLObject)$ic34$);
            var54 = var53.first();
            var53 = (var55 = var53.rest());
            final SubLObject var56 = module0242.f15654(var55);
            final SubLObject var57 = module0090.f6268(var56);
            final SubLObject var58 = module0079.f5414(var49, var55, (SubLObject)UNPROVIDED);
            final SubLObject var59 = f15715(var57, var58);
            module0079.f5412(var49, var55, var59);
            var50 = var50.rest();
            var51 = var50.first();
        }
        return (SubLObject)$ic36$;
    }
    
    public static SubLObject f15716(final SubLObject var55, final SubLObject var49) {
        final SubLThread var56 = SubLProcess.currentSubLThread();
        final SubLObject var57 = module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var58 = module0079.f5424(var49);
        SubLObject var61;
        for (SubLObject var59 = (SubLObject)NIL; NIL == var59; var59 = (SubLObject)makeBoolean(NIL == var61)) {
            var56.resetMultipleValues();
            final SubLObject var60 = module0052.f3693(var58);
            var61 = var56.secondMultipleValue();
            var56.resetMultipleValues();
            if (NIL != var61) {
                SubLObject var63;
                final SubLObject var62 = var63 = var60;
                SubLObject var64 = (SubLObject)NIL;
                SubLObject var65 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var63, var62, (SubLObject)$ic37$);
                var64 = var63.first();
                var63 = var63.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var63, var62, (SubLObject)$ic37$);
                var65 = var63.first();
                var63 = var63.rest();
                if (NIL == var63) {
                    module0079.f5412(var57, module0137.f8917(var64), var65);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var62, (SubLObject)$ic37$);
                }
            }
        }
        module0021.f1038(var57, var55);
        return (SubLObject)$ic36$;
    }
    
    public static SubLObject f15717() {
        module0242.$g2450$.setGlobalValue(f15718((SubLObject)UNPROVIDED));
        return (SubLObject)$ic36$;
    }
    
    public static SubLObject f15712(SubLObject var63) {
        if (var63 == UNPROVIDED) {
            var63 = module0242.$g2450$.getGlobalValue();
        }
        final SubLObject var64 = module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var65 = (SubLObject)NIL;
        SubLObject var66 = var63;
        SubLObject var67 = (SubLObject)NIL;
        var67 = var66.first();
        while (NIL != var66) {
            SubLObject var68 = (SubLObject)NIL;
            SubLObject var70;
            final SubLObject var69 = var70 = var67;
            SubLObject var71 = (SubLObject)NIL;
            SubLObject var72 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var70, var69, (SubLObject)$ic38$);
            var71 = var70.first();
            var70 = (var72 = var70.rest());
            if (NIL != module0090.f6257(var72)) {
                var68 = var72;
            }
            else {
                var68 = module0090.f6267(var72, var64);
            }
            var65 = module0035.f2063(var65, var71, var68, (SubLObject)UNPROVIDED);
            var66 = var66.rest();
            var67 = var66.first();
        }
        return var65;
    }
    
    public static SubLObject f15718(SubLObject var63) {
        if (var63 == UNPROVIDED) {
            var63 = module0242.$g2450$.getGlobalValue();
        }
        SubLObject var64 = (SubLObject)NIL;
        SubLObject var65 = var63;
        SubLObject var66 = (SubLObject)NIL;
        var66 = var65.first();
        while (NIL != var65) {
            SubLObject var67 = (SubLObject)NIL;
            SubLObject var69;
            final SubLObject var68 = var69 = var66;
            SubLObject var70 = (SubLObject)NIL;
            SubLObject var71 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic38$);
            var70 = var69.first();
            var69 = (var71 = var69.rest());
            if (NIL != module0090.f6257(var71)) {
                var67 = module0090.f6269(var71);
            }
            else {
                var67 = var71;
            }
            var64 = module0035.f2063(var64, var70, var67, (SubLObject)UNPROVIDED);
            var65 = var65.rest();
            var66 = var65.first();
        }
        return var64;
    }
    
    public static SubLObject f15719(final SubLObject var73, final SubLObject var70) {
        final SubLObject var74 = f15715(var73, (SubLObject)UNPROVIDED);
        return f15720(var74, var70);
    }
    
    public static SubLObject f15720(final SubLObject var53, final SubLObject var70) {
        final SubLObject var71 = module0137.f8917(var70);
        if (var71.eql($ic39$) || var71.eql($ic40$)) {
            final SubLObject var72 = module0084.f5796(var53, Symbols.symbol_function((SubLObject)$ic41$), (SubLObject)UNPROVIDED);
            final SubLObject var73 = Sort.sort(conses_high.copy_list(var72), (SubLObject)$ic42$, (SubLObject)UNPROVIDED);
            return module0035.f2381(var73, var72, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (var71.eql($ic43$)) {
            final SubLObject var72 = module0084.f5796(var53, Symbols.symbol_function((SubLObject)$ic41$), (SubLObject)UNPROVIDED);
            final SubLObject var73 = Sort.sort(conses_high.copy_list(var72), (SubLObject)$ic42$, (SubLObject)UNPROVIDED);
            return module0035.f2381(var73, var72, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (var71.eql($ic44$)) {
            final SubLObject var72 = module0084.f5796(var53, Symbols.symbol_function((SubLObject)$ic41$), (SubLObject)UNPROVIDED);
            final SubLObject var73 = Sort.sort(conses_high.copy_list(var72), (SubLObject)$ic42$, (SubLObject)UNPROVIDED);
            return module0035.f2381(var73, var72, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        final SubLObject var72 = module0084.f5796(var53, Symbols.symbol_function((SubLObject)$ic41$), (SubLObject)UNPROVIDED);
        return var72;
    }
    
    public static SubLObject f15715(final SubLObject var73, SubLObject var53) {
        if (var53 == UNPROVIDED) {
            var53 = (SubLObject)NIL;
        }
        final SubLObject var74 = (NIL != module0067.f4852(var53)) ? var53 : module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var75 = var73;
        SubLObject var76 = (SubLObject)NIL;
        var76 = var75.first();
        while (NIL != var75) {
            SubLObject var78;
            final SubLObject var77 = var78 = var76;
            SubLObject var79 = (SubLObject)NIL;
            SubLObject var80 = (SubLObject)NIL;
            SubLObject var81 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var78, var77, (SubLObject)$ic45$);
            var79 = var78.first();
            var78 = var78.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var78, var77, (SubLObject)$ic45$);
            var80 = var78.first();
            var78 = var78.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var78, var77, (SubLObject)$ic45$);
            var81 = var78.first();
            var78 = var78.rest();
            if (NIL == var78) {
                if (NIL != module0173.f10969(var81)) {
                    module0084.f5775(var74, var81, (SubLObject)UNPROVIDED);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var77, (SubLObject)$ic45$);
            }
            var75 = var75.rest();
            var76 = var75.first();
        }
        return var74;
    }
    
    public static SubLObject f15721() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0243", "f15683", "S#18454", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0243", "f15684", "S#18455", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0243", "f15685", "S#18456", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0243", "f15686", "S#18457", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0243", "f15687", "S#18458", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0243", "f15688", "S#18459", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0243", "f15689", "S#18460", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0243", "f15690", "S#18461", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0243", "f15691", "S#18462", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0243", "f15692", "S#18463", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0243", "f15693", "S#18464", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0243", "f15694", "S#18465", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0243", "f15695", "S#18466", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0243", "f15696", "S#18467", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0243", "f15697", "S#18468", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0243", "f15698", "S#18469", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0243", "f15699", "S#18470", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0243", "f15700", "S#18471", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0243", "f15701", "S#18472", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0243", "f15702", "S#18473", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0243", "f15703", "S#18474", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0243", "f15704", "S#18475", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0243", "f15705", "S#18476", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0243", "f15707", "S#18477", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0243", "f15706", "S#18478", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0243", "f15708", "S#18479", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0243", "f15709", "S#18480", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0243", "f15710", "S#18481", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0243", "f15711", "S#18482", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0243", "f15713", "S#18483", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0243", "f15714", "S#18484", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0243", "f15716", "S#18485", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0243", "f15717", "S#18486", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0243", "f15712", "S#18487", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0243", "f15718", "S#18488", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0243", "f15719", "S#18489", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0243", "f15720", "S#18490", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0243", "f15715", "S#18491", 1, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15722() {
        $g2458$ = SubLFiles.deflexical("S#18492", (NIL != Symbols.boundp((SubLObject)$ic0$)) ? $g2458$.getGlobalValue() : module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g2459$ = SubLFiles.deflexical("S#18493", (SubLObject)$ic1$);
        $g2460$ = SubLFiles.deflexical("S#18494", (SubLObject)$ic2$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15723() {
        module0003.f57((SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f15721();
    }
    
    public void initializeVariables() {
        f15722();
    }
    
    public void runTopLevelForms() {
        f15723();
    }
    
    static {
        me = (SubLFile)new module0243();
        $g2458$ = null;
        $g2459$ = null;
        $g2460$ = null;
        $ic0$ = makeSymbol("S#18492", "CYC");
        $ic1$ = ConsesLow.list((SubLObject)makeKeyword("LINK-PREDICATE"), (SubLObject)makeKeyword("POLICY"), (SubLObject)makeKeyword("CAPACITY"), (SubLObject)makeKeyword("EXEMPT"), (SubLObject)makeKeyword("PREFETCH"));
        $ic2$ = ConsesLow.list((SubLObject)makeKeyword("STICKY"), (SubLObject)makeKeyword("SWAPOUT"));
        $ic3$ = makeSymbol("S#18455", "CYC");
        $ic4$ = makeKeyword("LINK-PREDICATE");
        $ic5$ = makeKeyword("POLICY");
        $ic6$ = makeKeyword("UNKNOWN");
        $ic7$ = makeKeyword("STICKY");
        $ic8$ = makeKeyword("UNDEFINED");
        $ic9$ = makeString("Sticky policy does not support capacity ~A, only :undefined.");
        $ic10$ = makeKeyword("CAPACITY");
        $ic11$ = makeKeyword("ALL");
        $ic12$ = makeString("Invalid exemption specification ~A. Only :all is permitted for sticky policy.");
        $ic13$ = makeKeyword("EXEMPT");
        $ic14$ = makeSymbol("FORT-P");
        $ic15$ = makeString("Invalid prefetch specification ~A. Only :ALL or lists of FORT-P (incl NIL) are permitted.");
        $ic16$ = makeKeyword("PREFETCH");
        $ic17$ = makeKeyword("SWAPOUT");
        $ic18$ = makeString("Swapout policy does not support capacity ~A, only positive integer capacities are supported.");
        $ic19$ = makeString("Invalid exemption specification ~A. Only lists of FORT-P (incl NIL) or :all are permitted.");
        $ic20$ = makeString("Invalid prefetch specification ~A. Only lists of FORT-P (incl NIL) are permitted.");
        $ic21$ = makeString("Unknown policy type ~A ... dont know what to do.");
        $ic22$ = makeKeyword("DONT-CACHE");
        $ic23$ = makeKeyword("TOUCH");
        $ic24$ = makeString("Caching policy of type ~A not yet implemented.");
        $ic25$ = makeSymbol("S#13759", "CYC");
        $ic26$ = makeKeyword("RESET");
        $ic27$ = makeKeyword("ENFORCED");
        $ic28$ = makeString("Enforcing SBHL caching policies");
        $ic29$ = makeSymbol("S#38", "CYC");
        $ic30$ = makeString("~&Skipping invalid SBHL caching policies file ~A.~%Load attempt caused error: ~A.~%");
        $ic31$ = makeString("standard-kb-sbhl-caching-policies");
        $ic32$ = makeSymbol("S#11103", "CYC");
        $ic33$ = makeInteger(30);
        $ic34$ = (SubLList)ConsesLow.cons((SubLObject)makeUninternedSymbol("US#3165895"), (SubLObject)makeSymbol("S#205", "CYC"));
        $ic35$ = makeKeyword("READY");
        $ic36$ = makeKeyword("DONE");
        $ic37$ = ConsesLow.list((SubLObject)makeSymbol("S#205", "CYC"), (SubLObject)makeSymbol("S#18495", "CYC"));
        $ic38$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#11098", "CYC"), (SubLObject)makeSymbol("S#7999", "CYC"));
        $ic39$ = constant_handles_oc.f8479((SubLObject)makeString("genls"));
        $ic40$ = constant_handles_oc.f8479((SubLObject)makeString("genlInverse"));
        $ic41$ = makeSymbol(">");
        $ic42$ = makeSymbol("S#18496", "CYC");
        $ic43$ = constant_handles_oc.f8479((SubLObject)makeString("genlPreds"));
        $ic44$ = constant_handles_oc.f8479((SubLObject)makeString("genlMt"));
        $ic45$ = ConsesLow.list((SubLObject)makeSymbol("S#18497", "CYC"), (SubLObject)makeSymbol("S#18498", "CYC"), (SubLObject)makeSymbol("S#12141", "CYC"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 220 ms
	
	Decompiled with Procyon 0.5.32.
*/