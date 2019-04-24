package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0786 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0786";
    public static final String myFingerPrint = "cf08c921bae47e5556ffec9aa39bb962b0ced5d6d21b3a99220c54f20e7d4539";
    private static SubLSymbol $g6295$;
    private static SubLSymbol $g6296$;
    private static SubLSymbol $g6297$;
    private static SubLSymbol $g6298$;
    private static SubLSymbol $g6299$;
    private static SubLSymbol $g6300$;
    private static SubLSymbol $g6301$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLInteger $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLObject $ic12$;
    private static final SubLString $ic13$;
    private static final SubLObject $ic14$;
    private static final SubLObject $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLObject $ic20$;
    private static final SubLList $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLList $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLString $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLObject $ic30$;
    private static final SubLList $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLObject $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLList $ic36$;
    
    public static SubLObject f50433(final SubLObject var1) {
        return module0128.f8449(var1);
    }
    
    public static SubLObject f50434(final SubLObject var2) {
        return var2;
    }
    
    public static SubLObject f50435(final SubLObject var3, final SubLObject var4) {
        return module0067.f4884(f50436(var4), var3, (SubLObject)module0786.UNPROVIDED);
    }
    
    public static SubLObject f50437(final SubLObject var3, final SubLObject var4) {
        return module0067.f4884(f50438(var4), var3, (SubLObject)module0786.UNPROVIDED);
    }
    
    public static SubLObject f50439() {
        SubLObject var5 = module0584.$g4440$.getGlobalValue();
        SubLObject var6 = (SubLObject)module0786.NIL;
        var6 = var5.first();
        while (module0786.NIL != var5) {
            f50440(var6);
            var5 = var5.rest();
            var6 = var5.first();
        }
        return (SubLObject)module0786.NIL;
    }
    
    public static SubLObject f50441() {
        SubLObject var5 = module0584.$g4440$.getGlobalValue();
        SubLObject var6 = (SubLObject)module0786.NIL;
        var6 = var5.first();
        while (module0786.NIL != var5) {
            f50442(var6);
            var5 = var5.rest();
            var6 = var5.first();
        }
        return (SubLObject)module0786.NIL;
    }
    
    public static SubLObject f50443(final SubLObject var6, final SubLObject var3, final SubLObject var4, final SubLObject var7) {
        SubLObject var8 = (SubLObject)module0786.NIL;
        SubLObject var9 = (SubLObject)module0786.NIL;
        SubLObject var10 = (SubLObject)module0786.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var6, (SubLObject)module0786.$ic0$);
        var8 = var6.first();
        SubLObject var11 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var11, var6, (SubLObject)module0786.$ic0$);
        var9 = var11.first();
        var11 = var11.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var11, var6, (SubLObject)module0786.$ic0$);
        var10 = var11.first();
        var11 = var11.rest();
        if (module0786.NIL == var11) {
            SubLObject var12 = (SubLObject)module0786.NIL;
            SubLObject var13 = (SubLObject)module0786.NIL;
            final SubLObject var14 = (var4 == module0786.$ic1$) ? module0732.f45133(var10, var3, var7) : var10;
            SubLObject var15 = f50437(var3, var4);
            SubLObject var16 = (SubLObject)module0786.NIL;
            var16 = var15.first();
            while (module0786.NIL != var15) {
                SubLObject var19_20;
                final SubLObject var17_18 = var19_20 = var16;
                SubLObject var17 = (SubLObject)module0786.NIL;
                SubLObject var18 = (SubLObject)module0786.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var19_20, var17_18, (SubLObject)module0786.$ic2$);
                var17 = var19_20.first();
                var19_20 = var19_20.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var19_20, var17_18, (SubLObject)module0786.$ic2$);
                var18 = var19_20.first();
                var19_20 = var19_20.rest();
                if (module0786.NIL == var19_20) {
                    final SubLObject var19 = var17;
                    if (var19.eql((SubLObject)module0786.$ic3$)) {
                        var13 = var18;
                    }
                    else if (var19.eql((SubLObject)module0786.$ic4$)) {
                        if (module0786.NIL == f50444(var8, var18)) {
                            return (SubLObject)module0786.$ic6$;
                        }
                        var12 = conses_high.subst(var8, (SubLObject)module0786.$ic5$, var18, (SubLObject)module0786.UNPROVIDED, (SubLObject)module0786.UNPROVIDED);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var17_18, (SubLObject)module0786.$ic2$);
                }
                var15 = var15.rest();
                var16 = var15.first();
            }
            if (module0786.NIL == var13) {
                var13 = var9;
            }
            if (module0786.NIL == var12) {
                var12 = (SubLObject)((var4 == module0786.$ic1$) ? ConsesLow.list((SubLObject)module0786.$ic7$, var3, var8) : var8);
                f50445(var3, var10, module0574.f35152(), module0051.f3557((SubLObject)module0786.UNPROVIDED, (SubLObject)module0786.UNPROVIDED));
            }
            return (SubLObject)ConsesLow.list(var12, var13, var14);
        }
        cdestructuring_bind.cdestructuring_bind_error(var6, (SubLObject)module0786.$ic0$);
        return (SubLObject)module0786.NIL;
    }
    
    public static SubLObject f50444(final SubLObject var10, final SubLObject var22) {
        return (SubLObject)module0786.T;
    }
    
    public static SubLObject f50445(final SubLObject var24, final SubLObject var25, final SubLObject var26, final SubLObject var27) {
        return (SubLObject)module0786.NIL;
    }
    
    public static SubLObject f50436(final SubLObject var4) {
        if (var4.eql((SubLObject)module0786.$ic1$)) {
            return module0786.$g6295$.getGlobalValue();
        }
        if (var4.eql((SubLObject)module0786.$ic11$)) {
            return module0786.$g6296$.getGlobalValue();
        }
        return (SubLObject)module0786.NIL;
    }
    
    public static SubLObject f50446(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        if (var4.eql((SubLObject)module0786.$ic1$)) {
            SubLObject var6 = (SubLObject)module0786.NIL;
            final SubLObject var7 = module0147.f9540(module0584.$g4437$.getDynamicValue(var5));
            final SubLObject var8 = module0147.$g2095$.currentBinding(var5);
            final SubLObject var9 = module0147.$g2094$.currentBinding(var5);
            final SubLObject var10 = module0147.$g2096$.currentBinding(var5);
            try {
                module0147.$g2095$.bind(module0147.f9545(var7), var5);
                module0147.$g2094$.bind(module0147.f9546(var7), var5);
                module0147.$g2096$.bind(module0147.f9549(var7), var5);
                final SubLObject var11 = module0259.f16848(module0786.$ic12$, (SubLObject)module0786.UNPROVIDED, (SubLObject)module0786.UNPROVIDED);
                final SubLObject var12 = Sequences.length(var11);
                SubLObject var13 = (SubLObject)module0786.ZERO_INTEGER;
                final SubLObject var31_37 = module0012.$g75$.currentBinding(var5);
                final SubLObject var32_38 = module0012.$g76$.currentBinding(var5);
                final SubLObject var33_39 = module0012.$g77$.currentBinding(var5);
                final SubLObject var14 = module0012.$g78$.currentBinding(var5);
                try {
                    module0012.$g75$.bind((SubLObject)module0786.ZERO_INTEGER, var5);
                    module0012.$g76$.bind((SubLObject)module0786.NIL, var5);
                    module0012.$g77$.bind((SubLObject)module0786.T, var5);
                    module0012.$g78$.bind(Time.get_universal_time(), var5);
                    module0012.f478((SubLObject)module0786.$ic13$);
                    SubLObject var15 = var11;
                    SubLObject var16 = (SubLObject)module0786.NIL;
                    var16 = var15.first();
                    while (module0786.NIL != var15) {
                        if (module0786.NIL == module0259.f16854(var16, module0786.$ic14$, (SubLObject)module0786.UNPROVIDED, (SubLObject)module0786.UNPROVIDED)) {
                            var6 = (SubLObject)ConsesLow.cons(f50447(var16), var6);
                        }
                        var13 = Numbers.add(var13, (SubLObject)module0786.ONE_INTEGER);
                        module0012.note_percent_progress(var13, var12);
                        var15 = var15.rest();
                        var16 = var15.first();
                    }
                    module0012.f479();
                }
                finally {
                    module0012.$g78$.rebind(var14, var5);
                    module0012.$g77$.rebind(var33_39, var5);
                    module0012.$g76$.rebind(var32_38, var5);
                    module0012.$g75$.rebind(var31_37, var5);
                }
            }
            finally {
                module0147.$g2096$.rebind(var10, var5);
                module0147.$g2094$.rebind(var9, var5);
                module0147.$g2095$.rebind(var8, var5);
            }
            return var6;
        }
        if (var4.eql((SubLObject)module0786.$ic11$)) {
            SubLObject var6 = (SubLObject)module0786.NIL;
            final SubLObject var7 = module0147.f9540(module0584.$g4437$.getDynamicValue(var5));
            final SubLObject var8 = module0147.$g2095$.currentBinding(var5);
            final SubLObject var9 = module0147.$g2094$.currentBinding(var5);
            final SubLObject var10 = module0147.$g2096$.currentBinding(var5);
            try {
                module0147.$g2095$.bind(module0147.f9545(var7), var5);
                module0147.$g2094$.bind(module0147.f9546(var7), var5);
                module0147.$g2096$.bind(module0147.f9549(var7), var5);
                final SubLObject var17 = module0786.$ic15$;
                if (module0786.NIL != module0158.f10038(var17)) {
                    final SubLObject var18 = (SubLObject)module0786.NIL;
                    final SubLObject var31_38 = module0012.$g73$.currentBinding(var5);
                    final SubLObject var32_39 = module0012.$g65$.currentBinding(var5);
                    final SubLObject var33_40 = module0012.$g67$.currentBinding(var5);
                    final SubLObject var19 = module0012.$g68$.currentBinding(var5);
                    final SubLObject var20 = module0012.$g66$.currentBinding(var5);
                    final SubLObject var21 = module0012.$g69$.currentBinding(var5);
                    final SubLObject var22 = module0012.$g70$.currentBinding(var5);
                    final SubLObject var23 = module0012.$silent_progressP$.currentBinding(var5);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var5);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var5), var5);
                        module0012.$g67$.bind((SubLObject)module0786.ONE_INTEGER, var5);
                        module0012.$g68$.bind((SubLObject)module0786.ZERO_INTEGER, var5);
                        module0012.$g66$.bind((SubLObject)module0786.ZERO_INTEGER, var5);
                        module0012.$g69$.bind((SubLObject)module0786.ZERO_INTEGER, var5);
                        module0012.$g70$.bind((SubLObject)module0786.T, var5);
                        module0012.$silent_progressP$.bind((SubLObject)((module0786.NIL != var18) ? module0012.$silent_progressP$.getDynamicValue(var5) : module0786.T), var5);
                        module0012.f474(var18);
                        final SubLObject var24 = module0158.f10039(var17);
                        SubLObject var25 = (SubLObject)module0786.NIL;
                        final SubLObject var26 = (SubLObject)module0786.NIL;
                        while (module0786.NIL == var25) {
                            final SubLObject var27 = module0052.f3695(var24, var26);
                            final SubLObject var28 = (SubLObject)SubLObjectFactory.makeBoolean(!var26.eql(var27));
                            if (module0786.NIL != var28) {
                                module0012.f476();
                                SubLObject var29 = (SubLObject)module0786.NIL;
                                try {
                                    var29 = module0158.f10316(var27, (SubLObject)module0786.$ic16$, (SubLObject)module0786.NIL, (SubLObject)module0786.NIL);
                                    SubLObject var52_57 = (SubLObject)module0786.NIL;
                                    final SubLObject var53_58 = (SubLObject)module0786.NIL;
                                    while (module0786.NIL == var52_57) {
                                        final SubLObject var30 = module0052.f3695(var29, var53_58);
                                        final SubLObject var55_60 = (SubLObject)SubLObjectFactory.makeBoolean(!var53_58.eql(var30));
                                        if (module0786.NIL != var55_60) {
                                            final SubLObject var31 = f50434(module0178.f11334(var30));
                                            final SubLObject var32 = module0178.f11335(var30);
                                            var6 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var31, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0786.$ic3$, var32))), var6);
                                        }
                                        var52_57 = (SubLObject)SubLObjectFactory.makeBoolean(module0786.NIL == var55_60);
                                    }
                                }
                                finally {
                                    final SubLObject var31_39 = Threads.$is_thread_performing_cleanupP$.currentBinding(var5);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0786.T, var5);
                                        if (module0786.NIL != var29) {
                                            module0158.f10319(var29);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var31_39, var5);
                                    }
                                }
                            }
                            var25 = (SubLObject)SubLObjectFactory.makeBoolean(module0786.NIL == var28);
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var23, var5);
                        module0012.$g70$.rebind(var22, var5);
                        module0012.$g69$.rebind(var21, var5);
                        module0012.$g66$.rebind(var20, var5);
                        module0012.$g68$.rebind(var19, var5);
                        module0012.$g67$.rebind(var33_40, var5);
                        module0012.$g65$.rebind(var32_39, var5);
                        module0012.$g73$.rebind(var31_38, var5);
                    }
                }
            }
            finally {
                module0147.$g2096$.rebind(var10, var5);
                module0147.$g2094$.rebind(var9, var5);
                module0147.$g2095$.rebind(var8, var5);
            }
            return var6;
        }
        return (SubLObject)module0786.NIL;
    }
    
    public static SubLObject f50447(final SubLObject var41) {
        final SubLObject var42 = f50434(var41);
        final SubLObject var43 = f50448(var41, (SubLObject)module0786.UNPROVIDED);
        SubLObject var44 = (SubLObject)module0786.NIL;
        SubLObject var45 = var43;
        SubLObject var46 = (SubLObject)module0786.NIL;
        var46 = var45.first();
        while (module0786.NIL != var45) {
            var44 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0786.$ic17$, var46), var44);
            var45 = var45.rest();
            var46 = var45.first();
        }
        return (SubLObject)ConsesLow.list(var42, var44);
    }
    
    public static SubLObject f50449() {
        final SubLObject var66 = module0786.$g6297$.getGlobalValue();
        if (module0786.NIL != var66) {
            module0034.f1818(var66);
        }
        return (SubLObject)module0786.NIL;
    }
    
    public static SubLObject f50450(final SubLObject var41, SubLObject var67) {
        if (var67 == module0786.UNPROVIDED) {
            var67 = module0584.$g4437$.getDynamicValue();
        }
        return module0034.f1829(module0786.$g6297$.getGlobalValue(), (SubLObject)ConsesLow.list(var41, var67), (SubLObject)module0786.UNPROVIDED, (SubLObject)module0786.UNPROVIDED);
    }
    
    public static SubLObject f50451(final SubLObject var41, final SubLObject var67) {
        return module0434.f30579((SubLObject)module0786.$ic19$, (SubLObject)ConsesLow.listS(module0786.$ic20$, var41, (SubLObject)module0786.$ic21$), var67, (SubLObject)module0786.UNPROVIDED, (SubLObject)module0786.UNPROVIDED, (SubLObject)module0786.UNPROVIDED, (SubLObject)module0786.UNPROVIDED);
    }
    
    public static SubLObject f50448(final SubLObject var41, SubLObject var67) {
        if (var67 == module0786.UNPROVIDED) {
            var67 = module0584.$g4437$.getDynamicValue();
        }
        SubLObject var68 = module0786.$g6297$.getGlobalValue();
        if (module0786.NIL == var68) {
            var68 = module0034.f1934((SubLObject)module0786.$ic18$, (SubLObject)module0786.$ic22$, (SubLObject)module0786.NIL, (SubLObject)module0786.EQL, (SubLObject)module0786.TWO_INTEGER, (SubLObject)module0786.ZERO_INTEGER);
        }
        final SubLObject var69 = module0034.f1782(var41, var67);
        final SubLObject var70 = module0034.f1814(var68, var69, (SubLObject)module0786.UNPROVIDED);
        if (var70 != module0786.$ic23$) {
            SubLObject var71 = var70;
            SubLObject var72 = (SubLObject)module0786.NIL;
            var72 = var71.first();
            while (module0786.NIL != var71) {
                SubLObject var73 = var72.first();
                final SubLObject var74 = conses_high.second(var72);
                if (var41.eql(var73.first())) {
                    var73 = var73.rest();
                    if (module0786.NIL != var73 && module0786.NIL == var73.rest() && var67.eql(var73.first())) {
                        return module0034.f1959(var74);
                    }
                }
                var71 = var71.rest();
                var72 = var71.first();
            }
        }
        final SubLObject var75 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f50451(var41, var67)));
        module0034.f1836(var68, var69, var70, var75, (SubLObject)ConsesLow.list(var41, var67));
        return module0034.f1959(var75);
    }
    
    public static SubLObject f50440(final SubLObject var4) {
        final SubLObject var5 = f50436(var4);
        module0067.f4881(var5);
        SubLObject var6 = f50446(var4);
        SubLObject var7 = (SubLObject)module0786.NIL;
        var7 = var6.first();
        while (module0786.NIL != var6) {
            SubLObject var9;
            final SubLObject var8 = var9 = var7;
            SubLObject var10 = (SubLObject)module0786.NIL;
            SubLObject var11 = (SubLObject)module0786.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)module0786.$ic24$);
            var10 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)module0786.$ic24$);
            var11 = var9.first();
            var9 = var9.rest();
            if (module0786.NIL == var9) {
                if (module0786.NIL != var11) {
                    module0084.f5767(var5, var10, var11);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var8, (SubLObject)module0786.$ic24$);
            }
            var6 = var6.rest();
            var7 = var6.first();
        }
        return var5;
    }
    
    public static SubLObject f50438(final SubLObject var4) {
        if (var4.eql((SubLObject)module0786.$ic1$)) {
            return module0786.$g6298$.getGlobalValue();
        }
        if (var4.eql((SubLObject)module0786.$ic11$)) {
            return module0786.$g6299$.getGlobalValue();
        }
        return (SubLObject)module0786.NIL;
    }
    
    public static SubLObject f50452(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)module0786.NIL;
        final SubLObject var7 = module0147.f9540(module0584.$g4437$.getDynamicValue(var5));
        final SubLObject var8 = module0147.$g2095$.currentBinding(var5);
        final SubLObject var9 = module0147.$g2094$.currentBinding(var5);
        final SubLObject var10 = module0147.$g2096$.currentBinding(var5);
        try {
            module0147.$g2095$.bind(module0147.f9545(var7), var5);
            module0147.$g2094$.bind(module0147.f9546(var7), var5);
            module0147.$g2096$.bind(module0147.f9549(var7), var5);
            if (var4.eql((SubLObject)module0786.$ic1$)) {
                final SubLObject var11 = module0259.f16848(module0786.$ic12$, (SubLObject)module0786.UNPROVIDED, (SubLObject)module0786.UNPROVIDED);
                final SubLObject var12 = Sequences.length(var11);
                SubLObject var13 = (SubLObject)module0786.ZERO_INTEGER;
                final SubLObject var31_80 = module0012.$g75$.currentBinding(var5);
                final SubLObject var32_81 = module0012.$g76$.currentBinding(var5);
                final SubLObject var33_82 = module0012.$g77$.currentBinding(var5);
                final SubLObject var14 = module0012.$g78$.currentBinding(var5);
                try {
                    module0012.$g75$.bind((SubLObject)module0786.ZERO_INTEGER, var5);
                    module0012.$g76$.bind((SubLObject)module0786.NIL, var5);
                    module0012.$g77$.bind((SubLObject)module0786.T, var5);
                    module0012.$g78$.bind(Time.get_universal_time(), var5);
                    module0012.f478((SubLObject)module0786.$ic27$);
                    SubLObject var15 = var11;
                    SubLObject var16 = (SubLObject)module0786.NIL;
                    var16 = var15.first();
                    while (module0786.NIL != var15) {
                        if (module0786.NIL == module0259.f16854(var16, module0786.$ic14$, (SubLObject)module0786.UNPROVIDED, (SubLObject)module0786.UNPROVIDED)) {
                            var6 = (SubLObject)ConsesLow.cons(f50453(var16), var6);
                        }
                        var13 = Numbers.add(var13, (SubLObject)module0786.ONE_INTEGER);
                        module0012.note_percent_progress(var13, var12);
                        var15 = var15.rest();
                        var16 = var15.first();
                    }
                    module0012.f479();
                }
                finally {
                    module0012.$g78$.rebind(var14, var5);
                    module0012.$g77$.rebind(var33_82, var5);
                    module0012.$g76$.rebind(var32_81, var5);
                    module0012.$g75$.rebind(var31_80, var5);
                }
            }
            else if (var4.eql((SubLObject)module0786.$ic11$)) {
                final SubLObject var17 = module0786.$ic15$;
                if (module0786.NIL != module0158.f10038(var17)) {
                    final SubLObject var18 = (SubLObject)module0786.NIL;
                    final SubLObject var31_81 = module0012.$g73$.currentBinding(var5);
                    final SubLObject var32_82 = module0012.$g65$.currentBinding(var5);
                    final SubLObject var33_83 = module0012.$g67$.currentBinding(var5);
                    final SubLObject var19 = module0012.$g68$.currentBinding(var5);
                    final SubLObject var20 = module0012.$g66$.currentBinding(var5);
                    final SubLObject var21 = module0012.$g69$.currentBinding(var5);
                    final SubLObject var22 = module0012.$g70$.currentBinding(var5);
                    final SubLObject var23 = module0012.$silent_progressP$.currentBinding(var5);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var5);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var5), var5);
                        module0012.$g67$.bind((SubLObject)module0786.ONE_INTEGER, var5);
                        module0012.$g68$.bind((SubLObject)module0786.ZERO_INTEGER, var5);
                        module0012.$g66$.bind((SubLObject)module0786.ZERO_INTEGER, var5);
                        module0012.$g69$.bind((SubLObject)module0786.ZERO_INTEGER, var5);
                        module0012.$g70$.bind((SubLObject)module0786.T, var5);
                        module0012.$silent_progressP$.bind((SubLObject)((module0786.NIL != var18) ? module0012.$silent_progressP$.getDynamicValue(var5) : module0786.T), var5);
                        module0012.f474(var18);
                        final SubLObject var24 = module0158.f10039(var17);
                        SubLObject var25 = (SubLObject)module0786.NIL;
                        final SubLObject var26 = (SubLObject)module0786.NIL;
                        while (module0786.NIL == var25) {
                            final SubLObject var27 = module0052.f3695(var24, var26);
                            final SubLObject var28 = (SubLObject)SubLObjectFactory.makeBoolean(!var26.eql(var27));
                            if (module0786.NIL != var28) {
                                module0012.f476();
                                SubLObject var29 = (SubLObject)module0786.NIL;
                                try {
                                    var29 = module0158.f10316(var27, (SubLObject)module0786.$ic16$, (SubLObject)module0786.NIL, (SubLObject)module0786.NIL);
                                    SubLObject var52_86 = (SubLObject)module0786.NIL;
                                    final SubLObject var53_87 = (SubLObject)module0786.NIL;
                                    while (module0786.NIL == var52_86) {
                                        final SubLObject var30 = module0052.f3695(var29, var53_87);
                                        final SubLObject var55_88 = (SubLObject)SubLObjectFactory.makeBoolean(!var53_87.eql(var30));
                                        if (module0786.NIL != var55_88) {
                                            final SubLObject var31 = f50434(module0178.f11334(var30));
                                            final SubLObject var32 = module0178.f11334(var30);
                                            var6 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var31, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0786.$ic3$, var32))), var6);
                                        }
                                        var52_86 = (SubLObject)SubLObjectFactory.makeBoolean(module0786.NIL == var55_88);
                                    }
                                }
                                finally {
                                    final SubLObject var31_82 = Threads.$is_thread_performing_cleanupP$.currentBinding(var5);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0786.T, var5);
                                        if (module0786.NIL != var29) {
                                            module0158.f10319(var29);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var31_82, var5);
                                    }
                                }
                            }
                            var25 = (SubLObject)SubLObjectFactory.makeBoolean(module0786.NIL == var28);
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var23, var5);
                        module0012.$g70$.rebind(var22, var5);
                        module0012.$g69$.rebind(var21, var5);
                        module0012.$g66$.rebind(var20, var5);
                        module0012.$g68$.rebind(var19, var5);
                        module0012.$g67$.rebind(var33_83, var5);
                        module0012.$g65$.rebind(var32_82, var5);
                        module0012.$g73$.rebind(var31_81, var5);
                    }
                }
            }
        }
        finally {
            module0147.$g2096$.rebind(var10, var5);
            module0147.$g2094$.rebind(var9, var5);
            module0147.$g2095$.rebind(var8, var5);
        }
        return var6;
    }
    
    public static SubLObject f50453(final SubLObject var41) {
        final SubLObject var42 = f50434(var41);
        final SubLObject var43 = f50454(var41, (SubLObject)module0786.UNPROVIDED);
        final SubLObject var44 = f50455(var41);
        SubLObject var45 = (SubLObject)module0786.NIL;
        SubLObject var46 = var43;
        SubLObject var47 = (SubLObject)module0786.NIL;
        var47 = var46.first();
        while (module0786.NIL != var46) {
            var45 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0786.$ic4$, var47), var45);
            var46 = var46.rest();
            var47 = var46.first();
        }
        if (module0786.NIL != var44) {
            var45 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0786.$ic3$, var44), var45);
        }
        return (SubLObject)ConsesLow.list(var42, var45);
    }
    
    public static SubLObject f50456() {
        final SubLObject var66 = module0786.$g6300$.getGlobalValue();
        if (module0786.NIL != var66) {
            module0034.f1818(var66);
        }
        return (SubLObject)module0786.NIL;
    }
    
    public static SubLObject f50457(final SubLObject var41, SubLObject var67) {
        if (var67 == module0786.UNPROVIDED) {
            var67 = module0584.$g4437$.getDynamicValue();
        }
        return module0034.f1829(module0786.$g6300$.getGlobalValue(), (SubLObject)ConsesLow.list(var41, var67), (SubLObject)module0786.UNPROVIDED, (SubLObject)module0786.UNPROVIDED);
    }
    
    public static SubLObject f50458(final SubLObject var41, final SubLObject var67) {
        return module0434.f30579((SubLObject)module0786.$ic29$, (SubLObject)ConsesLow.listS(module0786.$ic30$, var41, (SubLObject)module0786.$ic31$), var67, (SubLObject)module0786.UNPROVIDED, (SubLObject)module0786.UNPROVIDED, (SubLObject)module0786.UNPROVIDED, (SubLObject)module0786.UNPROVIDED);
    }
    
    public static SubLObject f50454(final SubLObject var41, SubLObject var67) {
        if (var67 == module0786.UNPROVIDED) {
            var67 = module0584.$g4437$.getDynamicValue();
        }
        SubLObject var68 = module0786.$g6300$.getGlobalValue();
        if (module0786.NIL == var68) {
            var68 = module0034.f1934((SubLObject)module0786.$ic28$, (SubLObject)module0786.$ic32$, (SubLObject)module0786.NIL, (SubLObject)module0786.EQL, (SubLObject)module0786.TWO_INTEGER, (SubLObject)module0786.ZERO_INTEGER);
        }
        final SubLObject var69 = module0034.f1782(var41, var67);
        final SubLObject var70 = module0034.f1814(var68, var69, (SubLObject)module0786.UNPROVIDED);
        if (var70 != module0786.$ic23$) {
            SubLObject var71 = var70;
            SubLObject var72 = (SubLObject)module0786.NIL;
            var72 = var71.first();
            while (module0786.NIL != var71) {
                SubLObject var73 = var72.first();
                final SubLObject var74 = conses_high.second(var72);
                if (var41.eql(var73.first())) {
                    var73 = var73.rest();
                    if (module0786.NIL != var73 && module0786.NIL == var73.rest() && var67.eql(var73.first())) {
                        return module0034.f1959(var74);
                    }
                }
                var71 = var71.rest();
                var72 = var71.first();
            }
        }
        final SubLObject var75 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f50458(var41, var67)));
        module0034.f1836(var68, var69, var70, var75, (SubLObject)ConsesLow.list(var41, var67));
        return module0034.f1959(var75);
    }
    
    public static SubLObject f50455(final SubLObject var41) {
        SubLObject var42 = f50459(var41, (SubLObject)module0786.UNPROVIDED);
        SubLObject var43 = (SubLObject)module0786.NIL;
        var43 = var42.first();
        while (module0786.NIL != var42) {
            final SubLObject var44 = module0785.f50429(var43, (SubLObject)module0786.UNPROVIDED);
            if (module0786.NIL != var44) {
                return var44;
            }
            var42 = var42.rest();
            var43 = var42.first();
        }
        return (SubLObject)module0786.NIL;
    }
    
    public static SubLObject f50460() {
        final SubLObject var66 = module0786.$g6301$.getGlobalValue();
        if (module0786.NIL != var66) {
            module0034.f1818(var66);
        }
        return (SubLObject)module0786.NIL;
    }
    
    public static SubLObject f50461(final SubLObject var41, SubLObject var67) {
        if (var67 == module0786.UNPROVIDED) {
            var67 = module0584.$g4437$.getDynamicValue();
        }
        return module0034.f1829(module0786.$g6301$.getGlobalValue(), (SubLObject)ConsesLow.list(var41, var67), (SubLObject)module0786.UNPROVIDED, (SubLObject)module0786.UNPROVIDED);
    }
    
    public static SubLObject f50462(final SubLObject var41, final SubLObject var67) {
        return module0434.f30579((SubLObject)module0786.$ic19$, (SubLObject)ConsesLow.listS(module0786.$ic34$, var41, (SubLObject)module0786.$ic21$), var67, (SubLObject)module0786.UNPROVIDED, (SubLObject)module0786.UNPROVIDED, (SubLObject)module0786.UNPROVIDED, (SubLObject)module0786.UNPROVIDED);
    }
    
    public static SubLObject f50459(final SubLObject var41, SubLObject var67) {
        if (var67 == module0786.UNPROVIDED) {
            var67 = module0584.$g4437$.getDynamicValue();
        }
        SubLObject var68 = module0786.$g6301$.getGlobalValue();
        if (module0786.NIL == var68) {
            var68 = module0034.f1934((SubLObject)module0786.$ic33$, (SubLObject)module0786.$ic35$, (SubLObject)module0786.NIL, (SubLObject)module0786.EQL, (SubLObject)module0786.TWO_INTEGER, (SubLObject)module0786.ZERO_INTEGER);
        }
        final SubLObject var69 = module0034.f1782(var41, var67);
        final SubLObject var70 = module0034.f1814(var68, var69, (SubLObject)module0786.UNPROVIDED);
        if (var70 != module0786.$ic23$) {
            SubLObject var71 = var70;
            SubLObject var72 = (SubLObject)module0786.NIL;
            var72 = var71.first();
            while (module0786.NIL != var71) {
                SubLObject var73 = var72.first();
                final SubLObject var74 = conses_high.second(var72);
                if (var41.eql(var73.first())) {
                    var73 = var73.rest();
                    if (module0786.NIL != var73 && module0786.NIL == var73.rest() && var67.eql(var73.first())) {
                        return module0034.f1959(var74);
                    }
                }
                var71 = var71.rest();
                var72 = var71.first();
            }
        }
        final SubLObject var75 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f50462(var41, var67)));
        module0034.f1836(var68, var69, var70, var75, (SubLObject)ConsesLow.list(var41, var67));
        return module0034.f1959(var75);
    }
    
    public static SubLObject f50442(final SubLObject var4) {
        final SubLObject var5 = f50438(var4);
        module0067.f4881(var5);
        SubLObject var6 = f50452(var4);
        SubLObject var7 = (SubLObject)module0786.NIL;
        var7 = var6.first();
        while (module0786.NIL != var6) {
            SubLObject var9;
            final SubLObject var8 = var9 = var7;
            SubLObject var10 = (SubLObject)module0786.NIL;
            SubLObject var11 = (SubLObject)module0786.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)module0786.$ic36$);
            var10 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)module0786.$ic36$);
            var11 = var9.first();
            var9 = var9.rest();
            if (module0786.NIL == var9) {
                if (module0786.NIL != var11) {
                    module0084.f5767(var5, var10, var11);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var8, (SubLObject)module0786.$ic36$);
            }
            var6 = var6.rest();
            var7 = var6.first();
        }
        return var5;
    }
    
    public static SubLObject f50463() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0786", "f50433", "S#54989", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0786", "f50434", "S#54990", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0786", "f50435", "S#54931", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0786", "f50437", "S#54991", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0786", "f50439", "S#54992", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0786", "f50441", "S#54993", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0786", "f50443", "S#54933", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0786", "f50444", "S#54994", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0786", "f50445", "S#54995", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0786", "f50436", "S#54996", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0786", "f50446", "S#54997", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0786", "f50447", "S#54998", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0786", "f50449", "S#49406", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0786", "f50450", "S#54999", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0786", "f50451", "S#55000", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0786", "f50448", "S#55001", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0786", "f50440", "S#55002", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0786", "f50438", "S#55003", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0786", "f50452", "S#55004", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0786", "f50453", "S#55005", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0786", "f50456", "S#49408", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0786", "f50457", "S#55006", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0786", "f50458", "S#55007", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0786", "f50454", "S#55008", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0786", "f50455", "S#55009", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0786", "f50460", "S#49407", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0786", "f50461", "S#55010", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0786", "f50462", "S#55011", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0786", "f50459", "S#48871", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0786", "f50442", "S#55012", 1, 0, false);
        return (SubLObject)module0786.NIL;
    }
    
    public static SubLObject f50464() {
        module0786.$g6295$ = SubLFiles.deflexical("S#55013", (module0786.NIL != Symbols.boundp((SubLObject)module0786.$ic8$)) ? module0786.$g6295$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)module0786.EQL), (SubLObject)module0786.$ic9$));
        module0786.$g6296$ = SubLFiles.deflexical("S#55014", (module0786.NIL != Symbols.boundp((SubLObject)module0786.$ic10$)) ? module0786.$g6296$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)module0786.EQL), (SubLObject)module0786.$ic9$));
        module0786.$g6297$ = SubLFiles.deflexical("S#55015", (SubLObject)module0786.NIL);
        module0786.$g6298$ = SubLFiles.deflexical("S#55016", (module0786.NIL != Symbols.boundp((SubLObject)module0786.$ic25$)) ? module0786.$g6298$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)module0786.EQL), (SubLObject)module0786.$ic9$));
        module0786.$g6299$ = SubLFiles.deflexical("S#55017", (module0786.NIL != Symbols.boundp((SubLObject)module0786.$ic26$)) ? module0786.$g6299$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)module0786.EQL), (SubLObject)module0786.$ic9$));
        module0786.$g6300$ = SubLFiles.deflexical("S#55018", (SubLObject)module0786.NIL);
        module0786.$g6301$ = SubLFiles.deflexical("S#55019", (SubLObject)module0786.NIL);
        return (SubLObject)module0786.NIL;
    }
    
    public static SubLObject f50465() {
        module0003.f57((SubLObject)module0786.$ic8$);
        module0003.f57((SubLObject)module0786.$ic10$);
        module0034.f1909((SubLObject)module0786.$ic18$);
        module0003.f57((SubLObject)module0786.$ic25$);
        module0003.f57((SubLObject)module0786.$ic26$);
        module0034.f1909((SubLObject)module0786.$ic28$);
        module0034.f1909((SubLObject)module0786.$ic33$);
        return (SubLObject)module0786.NIL;
    }
    
    public void declareFunctions() {
        f50463();
    }
    
    public void initializeVariables() {
        f50464();
    }
    
    public void runTopLevelForms() {
        f50465();
    }
    
    static {
        me = (SubLFile)new module0786();
        module0786.$g6295$ = null;
        module0786.$g6296$ = null;
        module0786.$g6297$ = null;
        module0786.$g6298$ = null;
        module0786.$g6299$ = null;
        module0786.$g6300$ = null;
        module0786.$g6301$ = null;
        $ic0$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#49536", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#49996", "CYC"));
        $ic1$ = SubLObjectFactory.makeKeyword("DERIV");
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#55020", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1553", "CYC"));
        $ic3$ = SubLObjectFactory.makeKeyword("PRED");
        $ic4$ = SubLObjectFactory.makeKeyword("SEMX");
        $ic5$ = SubLObjectFactory.makeKeyword("BASE-WORD-DENOT");
        $ic6$ = SubLObjectFactory.makeKeyword("NON-WFF");
        $ic7$ = SubLObjectFactory.makeKeyword("APPLY-AFFIX");
        $ic8$ = SubLObjectFactory.makeSymbol("S#55013", "CYC");
        $ic9$ = SubLObjectFactory.makeInteger(256);
        $ic10$ = SubLObjectFactory.makeSymbol("S#55014", "CYC");
        $ic11$ = SubLObjectFactory.makeKeyword("INFL");
        $ic12$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("DerivationalAffix"));
        $ic13$ = SubLObjectFactory.makeString("Getting rule constraints...");
        $ic14$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("UnproductiveLexicalAffix"));
        $ic15$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("regularSuffix"));
        $ic16$ = SubLObjectFactory.makeKeyword("GAF");
        $ic17$ = SubLObjectFactory.makeKeyword("POS");
        $ic18$ = SubLObjectFactory.makeSymbol("S#55001", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("?POS");
        $ic20$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("derivationalAffixBasePOS"));
        $ic21$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?POS"));
        $ic22$ = SubLObjectFactory.makeSymbol("S#55015", "CYC");
        $ic23$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic24$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13097", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#51680", "CYC"));
        $ic25$ = SubLObjectFactory.makeSymbol("S#55016", "CYC");
        $ic26$ = SubLObjectFactory.makeSymbol("S#55017", "CYC");
        $ic27$ = SubLObjectFactory.makeString("Getting rule result specs...");
        $ic28$ = SubLObjectFactory.makeSymbol("S#55008", "CYC");
        $ic29$ = SubLObjectFactory.makeSymbol("?SEMX");
        $ic30$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("affixSemantics"));
        $ic31$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?SEMX"));
        $ic32$ = SubLObjectFactory.makeSymbol("S#55018", "CYC");
        $ic33$ = SubLObjectFactory.makeSymbol("S#48871", "CYC");
        $ic34$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("derivationalAffixResultPOS"));
        $ic35$ = SubLObjectFactory.makeSymbol("S#55019", "CYC");
        $ic36$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13097", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("SPECS"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0786.class
	Total time: 307 ms
	
	Decompiled with Procyon 0.5.32.
*/