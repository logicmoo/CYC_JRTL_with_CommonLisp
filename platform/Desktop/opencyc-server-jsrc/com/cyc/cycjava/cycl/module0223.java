package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0223 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0223";
    public static final String myFingerPrint = "bf34013a5f3ff53b79c614602c576768726d1a5a8983b0b1a673e577d2512479";
    private static SubLSymbol $g2406$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLString $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLString $ic17$;
    private static final SubLSymbol $ic18$;
    
    public static SubLObject f14665() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return conses_high.copy_list(module0223.$g2406$.getDynamicValue(var1));
    }
    
    public static SubLObject f14666(final SubLObject var2, final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        assert module0223.NIL != Types.symbolp(var2) : var2;
        assert module0223.NIL != Types.stringp(var3) : var3;
        if (module0223.NIL == conses_high.member(var2, module0223.$g2406$.getDynamicValue(var4), Symbols.symbol_function((SubLObject)module0223.EQL), Symbols.symbol_function((SubLObject)module0223.IDENTITY))) {
            module0223.$g2406$.setDynamicValue((SubLObject)ConsesLow.cons(var2, module0223.$g2406$.getDynamicValue(var4)), var4);
        }
        Symbols.put(var2, (SubLObject)module0223.$ic2$, var3);
        return var2;
    }
    
    public static SubLObject f14667(final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        return module0004.f104(var5, module0223.$g2406$.getDynamicValue(var6), (SubLObject)module0223.UNPROVIDED, (SubLObject)module0223.UNPROVIDED);
    }
    
    public static SubLObject f14668(final SubLObject var2) {
        return Symbols.get(var2, (SubLObject)module0223.$ic3$, (SubLObject)module0223.NIL);
    }
    
    public static SubLObject f14669(final SubLObject var2) {
        return (SubLObject)module0223.T;
    }
    
    public static SubLObject f14670(final SubLObject var2, final SubLObject var6) {
        if (module0223.NIL != var6) {
            Symbols.put(var2, (SubLObject)module0223.$ic3$, var6);
        }
        else {
            Symbols.remprop(var2, (SubLObject)module0223.$ic3$);
        }
        return var2;
    }
    
    public static SubLObject f14671(final SubLObject var2) {
        return f14670(var2, module0212.f13757());
    }
    
    public static SubLObject f14672(final SubLObject var2) {
        return Symbols.get(var2, (SubLObject)module0223.$ic2$, (SubLObject)module0223.UNPROVIDED);
    }
    
    public static SubLObject f14673(SubLObject var7, SubLObject var8, SubLObject var9) {
        if (var7 == module0223.UNPROVIDED) {
            var7 = (SubLObject)module0223.NIL;
        }
        if (var8 == module0223.UNPROVIDED) {
            var8 = (SubLObject)module0223.NIL;
        }
        if (var9 == module0223.UNPROVIDED) {
            var9 = (SubLObject)module0223.NIL;
        }
        if (module0223.NIL != module0212.f13795(f14674())) {
            SubLObject var10 = (SubLObject)module0223.ZERO_INTEGER;
            SubLObject var11 = module0212.f13799(f14674());
            SubLObject var12 = (SubLObject)module0223.NIL;
            var12 = var11.first();
            while (module0223.NIL != var11) {
                if (module0223.NIL != module0214.f14131(var12, var7, var8, var9)) {
                    var10 = Numbers.add(var10, (SubLObject)module0223.ONE_INTEGER);
                }
                var11 = var11.rest();
                var12 = var11.first();
            }
            return var10;
        }
        if (module0223.NIL == var7) {
            SubLObject var10 = (SubLObject)module0223.ZERO_INTEGER;
            SubLObject var11 = module0130.$g1509$.getGlobalValue();
            SubLObject var7_13 = (SubLObject)module0223.NIL;
            var7_13 = var11.first();
            while (module0223.NIL != var11) {
                var10 = Numbers.add(var10, f14673(var7_13, (SubLObject)module0223.UNPROVIDED, (SubLObject)module0223.UNPROVIDED));
                var11 = var11.rest();
                var7_13 = var11.first();
            }
            return var10;
        }
        final SubLObject var13 = f14675(var7, var8, var9);
        return (SubLObject)((module0223.NIL != var13) ? module0212.f13808(var13) : module0223.ZERO_INTEGER);
    }
    
    public static SubLObject f14676(SubLObject var7) {
        if (var7 == module0223.UNPROVIDED) {
            var7 = (SubLObject)module0223.NIL;
        }
        SubLObject var8 = (SubLObject)module0223.ZERO_INTEGER;
        if (module0223.NIL != module0212.f13795(f14674())) {
            SubLObject var9 = module0212.f13799(f14674());
            SubLObject var10 = (SubLObject)module0223.NIL;
            var10 = var9.first();
            while (module0223.NIL != var9) {
                if (module0223.NIL != module0214.f14131(var10, var7, (SubLObject)module0223.UNPROVIDED, (SubLObject)module0223.UNPROVIDED) && module0223.NIL != module0147.f9507(module0178.f11287(var10))) {
                    var8 = Numbers.add(var8, (SubLObject)module0223.ONE_INTEGER);
                }
                var9 = var9.rest();
                var10 = var9.first();
            }
        }
        else if (module0223.NIL == var7) {
            SubLObject var9 = module0130.$g1509$.getGlobalValue();
            SubLObject var7_15 = (SubLObject)module0223.NIL;
            var7_15 = var9.first();
            while (module0223.NIL != var9) {
                var8 = Numbers.add(var8, f14676(var7_15));
                var9 = var9.rest();
                var7_15 = var9.first();
            }
        }
        else {
            SubLObject var12;
            final SubLObject var11 = var12 = f14677(var7, (SubLObject)module0223.UNPROVIDED);
            SubLObject var13 = (SubLObject)module0223.NIL;
            var13 = var12.first();
            while (module0223.NIL != var12) {
                if (module0223.NIL != module0147.f9507(var13)) {
                    var8 = Numbers.add(var8, f14673(var7, var13, (SubLObject)module0223.UNPROVIDED));
                }
                var12 = var12.rest();
                var13 = var12.first();
            }
        }
        return var8;
    }
    
    public static SubLObject f14677(SubLObject var7, SubLObject var8) {
        if (var7 == module0223.UNPROVIDED) {
            var7 = (SubLObject)module0223.NIL;
        }
        if (var8 == module0223.UNPROVIDED) {
            var8 = (SubLObject)module0223.NIL;
        }
        if (module0223.NIL != module0212.f13795(f14674())) {
            SubLObject var9 = (SubLObject)module0223.NIL;
            SubLObject var10 = module0212.f13799(f14674());
            SubLObject var11 = (SubLObject)module0223.NIL;
            var11 = var10.first();
            while (module0223.NIL != var10) {
                var9 = module0214.f14132(var11, var9, var7, var8);
                var10 = var10.rest();
                var11 = var10.first();
            }
            return var9;
        }
        if (module0223.NIL == var7) {
            SubLObject var12 = (SubLObject)module0223.NIL;
            SubLObject var10 = module0130.$g1509$.getGlobalValue();
            SubLObject var7_19 = (SubLObject)module0223.NIL;
            var7_19 = var10.first();
            while (module0223.NIL != var10) {
                if (f14673(var7_19, (SubLObject)module0223.UNPROVIDED, (SubLObject)module0223.UNPROVIDED).isPositive()) {
                    var12 = (SubLObject)ConsesLow.cons(var7_19, var12);
                }
                var10 = var10.rest();
                var7_19 = var10.first();
            }
            return var12;
        }
        final SubLObject var13 = f14675(var7, var8, (SubLObject)module0223.UNPROVIDED);
        return (SubLObject)((module0223.NIL != module0212.f13815(var13)) ? module0212.f13838(var13) : module0223.NIL);
    }
    
    public static SubLObject f14678(SubLObject var7) {
        if (var7 == module0223.UNPROVIDED) {
            var7 = (SubLObject)module0223.NIL;
        }
        if (module0223.NIL != module0212.f13795(f14674())) {
            SubLObject var8 = (SubLObject)module0223.NIL;
            SubLObject var9 = module0212.f13799(f14674());
            SubLObject var10 = (SubLObject)module0223.NIL;
            var10 = var9.first();
            while (module0223.NIL != var9) {
                if (module0223.NIL != module0214.f14131(var10, var7, (SubLObject)module0223.UNPROVIDED, (SubLObject)module0223.UNPROVIDED) && module0223.NIL != module0147.f9507(module0178.f11287(var10))) {
                    var8 = module0214.f14132(var10, var8, var7, (SubLObject)module0223.UNPROVIDED);
                }
                var9 = var9.rest();
                var10 = var9.first();
            }
            return var8;
        }
        if (module0223.NIL == var7) {
            SubLObject var8 = (SubLObject)module0223.NIL;
            SubLObject var9 = module0130.$g1509$.getGlobalValue();
            SubLObject var7_21 = (SubLObject)module0223.NIL;
            var7_21 = var9.first();
            while (module0223.NIL != var9) {
                if (f14676(var7_21).isPositive()) {
                    var8 = (SubLObject)ConsesLow.cons(var7_21, var8);
                }
                var9 = var9.rest();
                var7_21 = var9.first();
            }
            return var8;
        }
        return module0035.delete_if_not(Symbols.symbol_function((SubLObject)module0223.$ic10$), f14677(var7, (SubLObject)module0223.UNPROVIDED), (SubLObject)module0223.UNPROVIDED, (SubLObject)module0223.UNPROVIDED, (SubLObject)module0223.UNPROVIDED, (SubLObject)module0223.UNPROVIDED);
    }
    
    public static SubLObject f14679(final SubLObject var7, final SubLObject var8, final SubLObject var9, final SubLObject var22) {
        return module0217.f14214(f14674(), (SubLObject)ConsesLow.list(var7, var8, var9), var22);
    }
    
    public static SubLObject f14680(final SubLObject var7, final SubLObject var8, final SubLObject var9, final SubLObject var22) {
        return module0217.f14216(f14674(), (SubLObject)ConsesLow.list(var7, var8, var9), var22);
    }
    
    public static SubLObject f14675(final SubLObject var7, SubLObject var8, SubLObject var9) {
        if (var8 == module0223.UNPROVIDED) {
            var8 = (SubLObject)module0223.NIL;
        }
        if (var9 == module0223.UNPROVIDED) {
            var9 = (SubLObject)module0223.NIL;
        }
        return module0217.f14213(f14674(), (SubLObject)ConsesLow.list(var7, var8, var9));
    }
    
    public static SubLObject f14681(final SubLObject var23, final SubLObject var7, SubLObject var9) {
        if (var9 == module0223.UNPROVIDED) {
            var9 = (SubLObject)module0223.NIL;
        }
        final SubLThread var24 = SubLProcess.currentSubLThread();
        assert module0223.NIL != Types.function_spec_p(var23) : var23;
        assert module0223.NIL != module0130.f8516(var7) : var7;
        SubLObject var25 = (SubLObject)module0223.NIL;
        try {
            var24.throwStack.push(module0223.$ic13$);
            if (module0223.NIL != module0212.f13795(f14674())) {
                SubLObject var26 = module0212.f13799(f14674());
                SubLObject var27 = (SubLObject)module0223.NIL;
                var27 = var26.first();
                while (module0223.NIL != var26) {
                    if (module0223.NIL != module0214.f14131(var27, var7, var9, (SubLObject)module0223.UNPROVIDED)) {
                        Functions.funcall(var23, var27);
                    }
                    var26 = var26.rest();
                    var27 = var26.first();
                }
            }
            else {
                final SubLObject var28 = f14675(var7, (SubLObject)module0223.UNPROVIDED, (SubLObject)module0223.UNPROVIDED);
                if (module0223.NIL != var28) {
                    final SubLObject var29 = var28;
                    if (module0223.NIL != module0212.f13836(var29)) {
                        SubLObject var30;
                        for (var30 = module0066.f4838(module0067.f4891(module0212.f13837(var29))); module0223.NIL == module0066.f4841(var30); var30 = module0066.f4840(var30)) {
                            var24.resetMultipleValues();
                            final SubLObject var31 = module0066.f4839(var30);
                            final SubLObject var32 = var24.secondMultipleValue();
                            var24.resetMultipleValues();
                            if (module0223.NIL == var9 || var31.eql(var9)) {
                                final SubLObject var30_31 = var32;
                                if (module0223.NIL != module0212.f13852(var30_31)) {
                                    final SubLObject var33 = module0077.f5333(module0212.f13853(var30_31));
                                    SubLObject var34;
                                    SubLObject var35;
                                    SubLObject var36;
                                    for (var34 = module0032.f1741(var33), var35 = (SubLObject)module0223.NIL, var35 = module0032.f1742(var34, var33); module0223.NIL == module0032.f1744(var34, var35); var35 = module0032.f1743(var35)) {
                                        var36 = module0032.f1745(var34, var35);
                                        if (module0223.NIL != module0032.f1746(var35, var36)) {
                                            Functions.funcall(var23, var36);
                                        }
                                    }
                                }
                            }
                        }
                        module0066.f4842(var30);
                    }
                }
            }
        }
        catch (Throwable var37) {
            var25 = Errors.handleThrowable(var37, (SubLObject)module0223.$ic13$);
        }
        finally {
            var24.throwStack.pop();
        }
        return (SubLObject)module0223.NIL;
    }
    
    public static SubLObject f14682(final SubLObject var23, final SubLObject var7, final SubLObject var8, SubLObject var9) {
        if (var9 == module0223.UNPROVIDED) {
            var9 = (SubLObject)module0223.NIL;
        }
        final SubLThread var24 = SubLProcess.currentSubLThread();
        assert module0223.NIL != Types.function_spec_p(var23) : var23;
        assert module0223.NIL != module0130.f8516(var7) : var7;
        assert module0223.NIL != module0161.f10481(var8) : var8;
        SubLObject var25 = (SubLObject)module0223.NIL;
        try {
            var24.throwStack.push(module0223.$ic13$);
            if (module0223.NIL != module0212.f13795(f14674())) {
                SubLObject var26 = module0212.f13799(f14674());
                SubLObject var27 = (SubLObject)module0223.NIL;
                var27 = var26.first();
                while (module0223.NIL != var26) {
                    if (module0223.NIL != module0214.f14131(var27, var7, var8, var9)) {
                        Functions.funcall(var23, var27);
                    }
                    var26 = var26.rest();
                    var27 = var26.first();
                }
            }
            else {
                final SubLObject var28 = f14675(var7, var8, (SubLObject)module0223.UNPROVIDED);
                if (module0223.NIL != var28) {
                    final SubLObject var29 = var28;
                    if (module0223.NIL != module0212.f13836(var29)) {
                        SubLObject var30;
                        for (var30 = module0066.f4838(module0067.f4891(module0212.f13837(var29))); module0223.NIL == module0066.f4841(var30); var30 = module0066.f4840(var30)) {
                            var24.resetMultipleValues();
                            final SubLObject var31 = module0066.f4839(var30);
                            final SubLObject var32 = var24.secondMultipleValue();
                            var24.resetMultipleValues();
                            if (module0223.NIL == var9 || var31.eql(var9)) {
                                final SubLObject var30_36 = var32;
                                if (module0223.NIL != module0212.f13852(var30_36)) {
                                    final SubLObject var33 = module0077.f5333(module0212.f13853(var30_36));
                                    SubLObject var34;
                                    SubLObject var35;
                                    SubLObject var36;
                                    for (var34 = module0032.f1741(var33), var35 = (SubLObject)module0223.NIL, var35 = module0032.f1742(var34, var33); module0223.NIL == module0032.f1744(var34, var35); var35 = module0032.f1743(var35)) {
                                        var36 = module0032.f1745(var34, var35);
                                        if (module0223.NIL != module0032.f1746(var35, var36)) {
                                            Functions.funcall(var23, var36);
                                        }
                                    }
                                }
                            }
                        }
                        module0066.f4842(var30);
                    }
                }
            }
        }
        catch (Throwable var37) {
            var25 = Errors.handleThrowable(var37, (SubLObject)module0223.$ic13$);
        }
        finally {
            var24.throwStack.pop();
        }
        return (SubLObject)module0223.NIL;
    }
    
    public static SubLObject f14674() {
        return (SubLObject)module0223.$ic4$;
    }
    
    public static SubLObject f14683(final SubLObject var22) {
        final SubLObject var23 = module0178.f11282(var22);
        final SubLObject var24 = module0178.f11287(var22);
        final SubLObject var25 = module0178.f11291(var22);
        SubLObject var26 = module0130.$g1509$.getGlobalValue();
        SubLObject var27 = (SubLObject)module0223.NIL;
        var27 = var26.first();
        while (module0223.NIL != var26) {
            if (module0223.NIL != f14684(var23, var27)) {
                f14679(var27, var24, var25, var22);
            }
            var26 = var26.rest();
            var27 = var26.first();
        }
        return var22;
    }
    
    public static SubLObject f14685(final SubLObject var22) {
        final SubLObject var23 = module0178.f11282(var22);
        final SubLObject var24 = module0178.f11287(var22);
        final SubLObject var25 = module0178.f11291(var22);
        SubLObject var26 = module0130.$g1509$.getGlobalValue();
        SubLObject var27 = (SubLObject)module0223.NIL;
        var27 = var26.first();
        while (module0223.NIL != var26) {
            if (module0223.NIL != f14684(var23, var27)) {
                f14680(var27, var24, var25, var22);
            }
            var26 = var26.rest();
            var27 = var26.first();
        }
        return var22;
    }
    
    public static SubLObject f14686(final SubLObject var5) {
        return f14687(var5);
    }
    
    public static SubLObject f14688() {
        f14671(f14674());
        return (SubLObject)module0223.NIL;
    }
    
    public static SubLObject f14687(final SubLObject var22) {
        if (module0223.NIL != module0178.f11290(var22)) {
            final SubLObject var23 = module0178.f11282(var22);
            SubLObject var24 = module0130.$g1509$.getGlobalValue();
            SubLObject var25 = (SubLObject)module0223.NIL;
            var25 = var24.first();
            while (module0223.NIL != var24) {
                if (module0223.NIL != f14684(var23, var25)) {
                    return (SubLObject)module0223.T;
                }
                var24 = var24.rest();
                var25 = var24.first();
            }
        }
        return (SubLObject)module0223.NIL;
    }
    
    public static SubLObject f14689(final SubLObject var38) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var38.isCons() && module0223.NIL != module0193.f12067(module0202.f12832(var38, (SubLObject)module0223.UNPROVIDED)));
    }
    
    public static SubLObject f14684(final SubLObject var39, final SubLObject var7) {
        final SubLObject var40 = (var7 == module0223.$ic15$) ? module0232.f15308(var39) : module0232.f15306(var39);
        return module0035.sublisp_boolean(Sequences.find_if(Symbols.symbol_function((SubLObject)module0223.$ic16$), var40, (SubLObject)module0223.UNPROVIDED, (SubLObject)module0223.UNPROVIDED, (SubLObject)module0223.UNPROVIDED));
    }
    
    public static SubLObject f14690() {
        f14691();
        return (SubLObject)module0223.NIL;
    }
    
    public static SubLObject f14691() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        f14688();
        final SubLObject var2 = module0174.f11010();
        final SubLObject var3 = (SubLObject)module0223.$ic17$;
        final SubLObject var4 = module0065.f4733(var2);
        SubLObject var5 = (SubLObject)module0223.ZERO_INTEGER;
        assert module0223.NIL != Types.stringp(var3) : var3;
        final SubLObject var6 = module0012.$g75$.currentBinding(var1);
        final SubLObject var7 = module0012.$g76$.currentBinding(var1);
        final SubLObject var8 = module0012.$g77$.currentBinding(var1);
        final SubLObject var9 = module0012.$g78$.currentBinding(var1);
        try {
            module0012.$g75$.bind((SubLObject)module0223.ZERO_INTEGER, var1);
            module0012.$g76$.bind((SubLObject)module0223.NIL, var1);
            module0012.$g77$.bind((SubLObject)module0223.T, var1);
            module0012.$g78$.bind(Time.get_universal_time(), var1);
            module0012.f478(var3);
            final SubLObject var49_50 = var2;
            if (module0223.NIL == module0065.f4772(var49_50, (SubLObject)module0223.$ic18$)) {
                final SubLObject var51_52 = var49_50;
                if (module0223.NIL == module0065.f4775(var51_52, (SubLObject)module0223.$ic18$)) {
                    final SubLObject var10 = module0065.f4740(var51_52);
                    final SubLObject var11 = (SubLObject)module0223.NIL;
                    SubLObject var12;
                    SubLObject var13;
                    SubLObject var14;
                    SubLObject var15;
                    SubLObject var45_58;
                    SubLObject var46_59;
                    for (var12 = Sequences.length(var10), var13 = (SubLObject)module0223.NIL, var13 = (SubLObject)module0223.ZERO_INTEGER; var13.numL(var12); var13 = Numbers.add(var13, (SubLObject)module0223.ONE_INTEGER)) {
                        var14 = ((module0223.NIL != var11) ? Numbers.subtract(var12, var13, (SubLObject)module0223.ONE_INTEGER) : var13);
                        var15 = Vectors.aref(var10, var14);
                        if (module0223.NIL == module0065.f4749(var15) || module0223.NIL == module0065.f4773((SubLObject)module0223.$ic18$)) {
                            if (module0223.NIL != module0065.f4749(var15)) {
                                var15 = (SubLObject)module0223.$ic18$;
                            }
                            module0012.note_percent_progress(var5, var4);
                            var5 = Numbers.add(var5, (SubLObject)module0223.ONE_INTEGER);
                            if (module0223.NIL != f14687(var15)) {
                                var45_58 = module0214.$g2378$.currentBinding(var1);
                                var46_59 = module0214.$g2379$.currentBinding(var1);
                                try {
                                    module0214.$g2378$.bind((SubLObject)module0223.T, var1);
                                    module0214.$g2379$.bind((SubLObject)module0223.NIL, var1);
                                    f14683(var15);
                                    if (module0223.NIL != module0214.$g2379$.getDynamicValue(var1)) {
                                        module0214.f14142();
                                    }
                                }
                                finally {
                                    module0214.$g2379$.rebind(var46_59, var1);
                                    module0214.$g2378$.rebind(var45_58, var1);
                                }
                            }
                        }
                    }
                }
                final SubLObject var60_61 = var49_50;
                if (module0223.NIL == module0065.f4777(var60_61) || module0223.NIL == module0065.f4773((SubLObject)module0223.$ic18$)) {
                    final SubLObject var16 = module0065.f4738(var60_61);
                    SubLObject var17 = module0065.f4739(var60_61);
                    final SubLObject var18 = module0065.f4734(var60_61);
                    final SubLObject var19 = (SubLObject)((module0223.NIL != module0065.f4773((SubLObject)module0223.$ic18$)) ? module0223.NIL : module0223.$ic18$);
                    while (var17.numL(var18)) {
                        final SubLObject var20 = Hashtables.gethash_without_values(var17, var16, var19);
                        if (module0223.NIL == module0065.f4773((SubLObject)module0223.$ic18$) || module0223.NIL == module0065.f4749(var20)) {
                            module0012.note_percent_progress(var5, var4);
                            var5 = Numbers.add(var5, (SubLObject)module0223.ONE_INTEGER);
                            if (module0223.NIL != f14687(var20)) {
                                final SubLObject var45_59 = module0214.$g2378$.currentBinding(var1);
                                final SubLObject var46_60 = module0214.$g2379$.currentBinding(var1);
                                try {
                                    module0214.$g2378$.bind((SubLObject)module0223.T, var1);
                                    module0214.$g2379$.bind((SubLObject)module0223.NIL, var1);
                                    f14683(var20);
                                    if (module0223.NIL != module0214.$g2379$.getDynamicValue(var1)) {
                                        module0214.f14142();
                                    }
                                }
                                finally {
                                    module0214.$g2379$.rebind(var46_60, var1);
                                    module0214.$g2378$.rebind(var45_59, var1);
                                }
                            }
                        }
                        var17 = Numbers.add(var17, (SubLObject)module0223.ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var9, var1);
            module0012.$g77$.rebind(var8, var1);
            module0012.$g76$.rebind(var7, var1);
            module0012.$g75$.rebind(var6, var1);
        }
        return f14673((SubLObject)module0223.UNPROVIDED, (SubLObject)module0223.UNPROVIDED, (SubLObject)module0223.UNPROVIDED);
    }
    
    public static SubLObject f14692(final SubLObject var67) {
        f14693(var67);
        module0021.f1038((SubLObject)module0223.NIL, var67);
        return (SubLObject)module0223.NIL;
    }
    
    public static SubLObject f14694(final SubLObject var67) {
        f14695(var67);
        module0021.f1060(var67, (SubLObject)module0223.UNPROVIDED, (SubLObject)module0223.UNPROVIDED);
        return (SubLObject)module0223.NIL;
    }
    
    public static SubLObject f14693(final SubLObject var67) {
        module0021.f1038(f14668(f14674()), var67);
        return (SubLObject)module0223.NIL;
    }
    
    public static SubLObject f14695(final SubLObject var67) {
        f14670(f14674(), module0021.f1060(var67, (SubLObject)module0223.UNPROVIDED, (SubLObject)module0223.UNPROVIDED));
        return (SubLObject)module0223.NIL;
    }
    
    public static SubLObject f14696() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0223", "f14665", "S#17151", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0223", "f14666", "S#17451", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0223", "f14667", "S#16582", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0223", "f14668", "S#16583", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0223", "f14669", "S#16584", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0223", "f14670", "S#16585", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0223", "f14671", "S#16586", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0223", "f14672", "S#17452", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0223", "f14673", "S#17453", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0223", "f14676", "S#17454", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0223", "f14677", "S#12734", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0223", "f14678", "S#17455", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0223", "f14679", "S#17456", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0223", "f14680", "S#17457", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0223", "f14675", "S#17458", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0223", "f14681", "S#17459", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0223", "f14682", "S#17460", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0223", "f14674", "S#12733", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0223", "f14683", "S#17145", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0223", "f14685", "S#17146", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0223", "f14686", "S#17461", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0223", "f14688", "S#17462", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0223", "f14687", "S#17463", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0223", "f14689", "S#17464", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0223", "f14684", "S#17465", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0223", "f14690", "S#17466", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0223", "f14691", "S#17467", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0223", "f14692", "S#17468", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0223", "f14694", "S#17469", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0223", "f14693", "S#17470", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0223", "f14695", "S#17471", 1, 0, false);
        return (SubLObject)module0223.NIL;
    }
    
    public static SubLObject f14697() {
        module0223.$g2406$ = SubLFiles.defparameter("S#17472", (SubLObject)module0223.NIL);
        return (SubLObject)module0223.NIL;
    }
    
    public static SubLObject f14698() {
        f14666((SubLObject)module0223.$ic4$, (SubLObject)module0223.$ic5$);
        module0215.f14162((SubLObject)module0223.$ic6$, (SubLObject)module0223.$ic7$);
        module0215.f14162((SubLObject)module0223.$ic8$, (SubLObject)module0223.$ic9$);
        return (SubLObject)module0223.NIL;
    }
    
    public void declareFunctions() {
        f14696();
    }
    
    public void initializeVariables() {
        f14697();
    }
    
    public void runTopLevelForms() {
        f14698();
    }
    
    static {
        me = (SubLFile)new module0223();
        module0223.$g2406$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("SYMBOLP");
        $ic1$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic2$ = SubLObjectFactory.makeKeyword("INDEX-NAME");
        $ic3$ = SubLObjectFactory.makeKeyword("INDEX");
        $ic4$ = SubLObjectFactory.makeKeyword("UNBOUND-RULE-INDEX");
        $ic5$ = SubLObjectFactory.makeString("Unbound Rule Index");
        $ic6$ = SubLObjectFactory.makeKeyword("UNBOUND-RULE-INDEX-POS");
        $ic7$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("Unbound positive rule index"), SubLObjectFactory.makeKeyword("DOMAIN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("term"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#16582", "CYC")), SubLObjectFactory.makeKeyword("TOP-LEVEL-KEY"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("KEYS"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("sense"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("SENSE-P"), (SubLObject)SubLObjectFactory.makeKeyword("EQUAL-TEST"), (SubLObject)module0223.EQ), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("mt"), SubLObjectFactory.makeKeyword("MT?"), module0223.T, SubLObjectFactory.makeKeyword("VALIDITY-TEST"), SubLObjectFactory.makeSymbol("S#12263", "CYC"), SubLObjectFactory.makeKeyword("RELEVANCE-TEST"), SubLObjectFactory.makeSymbol("RELEVANT-MT?"), SubLObjectFactory.makeKeyword("EQUAL-TEST"), module0223.EQUAL }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("direction"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION-P"), (SubLObject)SubLObjectFactory.makeKeyword("EQUAL-TEST"), (SubLObject)module0223.EQ)), SubLObjectFactory.makeKeyword("RANGE"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("rule"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#12732", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("A rule assertion in mt MT with direction DIRECTION,\nwhich contains a pos-lit with a variable in the predicate position.")) });
        $ic8$ = SubLObjectFactory.makeKeyword("UNBOUND-RULE-INDEX-NEG");
        $ic9$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("Unbound negative rule index"), SubLObjectFactory.makeKeyword("DOMAIN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("term"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#16582", "CYC")), SubLObjectFactory.makeKeyword("TOP-LEVEL-KEY"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("KEYS"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("sense"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("SENSE-P"), (SubLObject)SubLObjectFactory.makeKeyword("EQUAL-TEST"), (SubLObject)module0223.EQ), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("mt"), SubLObjectFactory.makeKeyword("MT?"), module0223.T, SubLObjectFactory.makeKeyword("VALIDITY-TEST"), SubLObjectFactory.makeSymbol("S#12263", "CYC"), SubLObjectFactory.makeKeyword("RELEVANCE-TEST"), SubLObjectFactory.makeSymbol("RELEVANT-MT?"), SubLObjectFactory.makeKeyword("EQUAL-TEST"), module0223.EQUAL }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("direction"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION-P"), (SubLObject)SubLObjectFactory.makeKeyword("EQUAL-TEST"), (SubLObject)module0223.EQ)), SubLObjectFactory.makeKeyword("RANGE"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("rule"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#12732", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("A rule assertion in mt MT with direction DIRECTION,\nwhich contains a neg-lit with a variable in the predicate position.")) });
        $ic10$ = SubLObjectFactory.makeSymbol("RELEVANT-MT?");
        $ic11$ = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $ic12$ = SubLObjectFactory.makeSymbol("SENSE-P");
        $ic13$ = SubLObjectFactory.makeKeyword("MAPPING-DONE");
        $ic14$ = SubLObjectFactory.makeSymbol("S#12263", "CYC");
        $ic15$ = SubLObjectFactory.makeKeyword("POS");
        $ic16$ = SubLObjectFactory.makeSymbol("S#17464", "CYC");
        $ic17$ = SubLObjectFactory.makeString("Rebuilding unbound rule index structure");
        $ic18$ = SubLObjectFactory.makeKeyword("SKIP");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0223.class
	Total time: 241 ms
	
	Decompiled with Procyon 0.5.32.
*/