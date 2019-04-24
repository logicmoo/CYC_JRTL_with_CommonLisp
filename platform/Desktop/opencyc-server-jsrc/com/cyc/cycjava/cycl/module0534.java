package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0534 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0534";
    public static final String myFingerPrint = "357e0711f6c3c866c9bfc3e226db032de8321cfbd6344df58e3937acbed89dfa";
    private static SubLSymbol $g3914$;
    private static SubLSymbol $g3915$;
    private static SubLSymbol $g3916$;
    private static SubLSymbol $g3917$;
    private static SubLSymbol $g3918$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLObject $ic2$;
    private static final SubLList $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLObject $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLString $ic9$;
    private static final SubLObject $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLString $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLObject $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLString $ic17$;
    private static final SubLObject $ic18$;
    private static final SubLList $ic19$;
    private static final SubLString $ic20$;
    private static final SubLObject $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLObject $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLString $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLList $ic29$;
    private static final SubLList $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLObject $ic32$;
    private static final SubLSymbol $ic33$;
    
    public static SubLObject f33229(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0534.NIL != module0534.$g3914$.getDynamicValue(var3)) {
            final SubLObject var4 = module0178.f11334(var2);
            return f33230(var4);
        }
        return (SubLObject)module0534.NIL;
    }
    
    public static SubLObject f33231(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0534.NIL != module0534.$g3914$.getDynamicValue(var3)) {
            final SubLObject var4 = module0178.f11334(var2);
            return f33230(var4);
        }
        return (SubLObject)module0534.NIL;
    }
    
    public static SubLObject f33230(final SubLObject var4) {
        if (module0534.NIL != f33232(var4)) {
            return f33233(var4);
        }
        return (SubLObject)module0534.NIL;
    }
    
    public static SubLObject f33233(final SubLObject var4) {
        f33234(var4);
        f33235(var4);
        return (SubLObject)module0534.NIL;
    }
    
    public static SubLObject f33234(final SubLObject var5) {
        final SubLObject var6 = f33236(var5);
        final SubLObject var7 = f33237(var5, var6, module0534.$ic2$);
        return f33238(var7);
    }
    
    public static SubLObject f33235(final SubLObject var8) {
        SubLObject var9 = f33239(var8);
        var9 = module0035.f2220(var9, module0256.f16552(var8, (SubLObject)module0534.UNPROVIDED, (SubLObject)module0534.UNPROVIDED), (SubLObject)module0534.UNPROVIDED);
        final SubLObject var10 = f33240(var9, var8, module0534.$ic2$);
        return f33238(var10);
    }
    
    public static SubLObject f33238(final SubLObject var7) {
        SubLObject var9;
        final SubLObject var8 = var9 = f33241(var7);
        SubLObject var10 = (SubLObject)module0534.NIL;
        var10 = var9.first();
        while (module0534.NIL != var9) {
            SubLObject var12;
            final SubLObject var11 = var12 = var10;
            SubLObject var13 = (SubLObject)module0534.NIL;
            SubLObject var14 = (SubLObject)module0534.NIL;
            SubLObject var15 = (SubLObject)module0534.NIL;
            SubLObject var16 = (SubLObject)module0534.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var12, var11, (SubLObject)module0534.$ic3$);
            var13 = var12.first();
            var12 = var12.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var12, var11, (SubLObject)module0534.$ic3$);
            var14 = var12.first();
            var12 = var12.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var12, var11, (SubLObject)module0534.$ic3$);
            var15 = var12.first();
            var12 = var12.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var12, var11, (SubLObject)module0534.$ic3$);
            var16 = var12.first();
            var12 = var12.rest();
            if (module0534.NIL == var12) {
                final SubLObject var17 = f33242(var14, var15);
                f33243(var14, var15, var17);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var11, (SubLObject)module0534.$ic3$);
            }
            var9 = var9.rest();
            var10 = var9.first();
        }
        return (SubLObject)module0534.NIL;
    }
    
    public static SubLObject f33242(final SubLObject var16, final SubLObject var17) {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        SubLObject var19 = (SubLObject)module0534.NIL;
        final SubLObject var20 = module0147.f9540(var17);
        final SubLObject var21 = module0147.$g2095$.currentBinding(var18);
        final SubLObject var22 = module0147.$g2094$.currentBinding(var18);
        final SubLObject var23 = module0147.$g2096$.currentBinding(var18);
        try {
            module0147.$g2095$.bind(module0147.f9545(var20), var18);
            module0147.$g2094$.bind(module0147.f9546(var20), var18);
            module0147.$g2096$.bind(module0147.f9549(var20), var18);
            final SubLObject var24 = f33244(var16);
            var19 = var24.rest();
        }
        finally {
            module0147.$g2096$.rebind(var23, var18);
            module0147.$g2094$.rebind(var22, var18);
            module0147.$g2095$.rebind(var21, var18);
        }
        final SubLObject var25 = f33245(var16);
        if (var25.isVector()) {
            final SubLObject var26 = var25;
            final SubLObject var27 = (SubLObject)module0534.NIL;
            SubLObject var28;
            SubLObject var29;
            SubLObject var30;
            SubLObject var31;
            for (var28 = Sequences.length(var26), var29 = (SubLObject)module0534.NIL, var29 = (SubLObject)module0534.ZERO_INTEGER; var29.numL(var28); var29 = Numbers.add(var29, (SubLObject)module0534.ONE_INTEGER)) {
                var30 = ((module0534.NIL != var27) ? Numbers.subtract(var28, var29, (SubLObject)module0534.ONE_INTEGER) : var29);
                var31 = Vectors.aref(var26, var30);
                var19 = (SubLObject)ConsesLow.cons(var31, var19);
            }
        }
        else {
            SubLObject var32 = var25;
            SubLObject var33 = (SubLObject)module0534.NIL;
            var33 = var32.first();
            while (module0534.NIL != var32) {
                var19 = (SubLObject)ConsesLow.cons(var33, var19);
                var32 = var32.rest();
                var33 = var32.first();
            }
        }
        return Sequences.nreverse(var19);
    }
    
    public static SubLObject f33245(final SubLObject var16) {
        final SubLObject var17 = module0205.f13387(var16, (SubLObject)module0534.UNPROVIDED);
        final SubLObject var18 = module0205.f13388(var16, (SubLObject)module0534.UNPROVIDED);
        final SubLObject var19 = f33246(var18);
        final SubLObject var20 = module0202.f12791(var19, (SubLObject)module0534.UNPROVIDED);
        final SubLObject var21 = module0191.f11990((SubLObject)module0534.$ic4$, (SubLObject)ConsesLow.list(module0534.$ic5$, var18, var20), module0534.$g3916$.getGlobalValue(), (SubLObject)module0534.UNPROVIDED);
        if (module0534.NIL != f33247(var17)) {
            final SubLObject var22 = f33246(var17);
            final SubLObject var23 = module0202.f12791(var22, (SubLObject)module0534.UNPROVIDED);
            return (SubLObject)ConsesLow.list(var21, module0191.f11990((SubLObject)module0534.$ic4$, (SubLObject)ConsesLow.list(module0534.$ic5$, var17, var23), module0534.$g3916$.getGlobalValue(), (SubLObject)module0534.UNPROVIDED), f33248());
        }
        return (SubLObject)ConsesLow.list(var21, f33249());
    }
    
    public static SubLObject f33241(final SubLObject var7) {
        SubLObject var8 = (SubLObject)module0534.NIL;
        SubLObject var9 = var7;
        SubLObject var10 = (SubLObject)module0534.NIL;
        var10 = var9.first();
        while (module0534.NIL != var9) {
            SubLObject var12;
            final SubLObject var11 = var12 = var10;
            SubLObject var13 = (SubLObject)module0534.NIL;
            SubLObject var14 = (SubLObject)module0534.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var12, var11, (SubLObject)module0534.$ic6$);
            var13 = var12.first();
            var12 = (var14 = var12.rest());
            SubLObject var11_44;
            final SubLObject var15 = var11_44 = f33250(var14);
            SubLObject var16 = (SubLObject)module0534.NIL;
            var16 = var11_44.first();
            while (module0534.NIL != var11_44) {
                var8 = (SubLObject)ConsesLow.cons(module0191.f11990((SubLObject)module0534.$ic7$, var13, var16, (SubLObject)module0534.UNPROVIDED), var8);
                var11_44 = var11_44.rest();
                var16 = var11_44.first();
            }
            var9 = var9.rest();
            var10 = var9.first();
        }
        return f33251(var8);
    }
    
    public static SubLObject f33251(final SubLObject var10) {
        return var10;
    }
    
    public static SubLObject f33250(final SubLObject var42) {
        SubLObject var43 = (SubLObject)module0534.NIL;
        SubLObject var44 = var42;
        SubLObject var45 = (SubLObject)module0534.NIL;
        var45 = var44.first();
        while (module0534.NIL != var44) {
            SubLObject var47;
            final SubLObject var46 = var47 = var45;
            SubLObject var48 = (SubLObject)module0534.NIL;
            SubLObject var49 = (SubLObject)module0534.NIL;
            SubLObject var50 = (SubLObject)module0534.NIL;
            SubLObject var51 = (SubLObject)module0534.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var47, var46, (SubLObject)module0534.$ic3$);
            var48 = var47.first();
            var47 = var47.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var47, var46, (SubLObject)module0534.$ic3$);
            var49 = var47.first();
            var47 = var47.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var47, var46, (SubLObject)module0534.$ic3$);
            var50 = var47.first();
            var47 = var47.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var47, var46, (SubLObject)module0534.$ic3$);
            var51 = var47.first();
            var47 = var47.rest();
            if (module0534.NIL == var47) {
                final SubLObject var52 = module0205.f13387(var49, (SubLObject)module0534.UNPROVIDED);
                final SubLObject var53 = module0205.f13388(var49, (SubLObject)module0534.UNPROVIDED);
                final SubLObject var54 = module0256.f16650(var52, var53, (SubLObject)module0534.UNPROVIDED);
                if (var54.isVector()) {
                    final SubLObject var55 = var54;
                    final SubLObject var56 = (SubLObject)module0534.NIL;
                    SubLObject var57;
                    SubLObject var58;
                    SubLObject var59;
                    SubLObject var60;
                    for (var57 = Sequences.length(var55), var58 = (SubLObject)module0534.NIL, var58 = (SubLObject)module0534.ZERO_INTEGER; var58.numL(var57); var58 = Numbers.add(var58, (SubLObject)module0534.ONE_INTEGER)) {
                        var59 = ((module0534.NIL != var56) ? Numbers.subtract(var57, var58, (SubLObject)module0534.ONE_INTEGER) : var58);
                        var60 = Vectors.aref(var55, var59);
                        var43 = (SubLObject)ConsesLow.cons(var60, var43);
                    }
                }
                else {
                    SubLObject var11_47 = var54;
                    SubLObject var61 = (SubLObject)module0534.NIL;
                    var61 = var11_47.first();
                    while (module0534.NIL != var11_47) {
                        var43 = (SubLObject)ConsesLow.cons(var61, var43);
                        var11_47 = var11_47.rest();
                        var61 = var11_47.first();
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var46, (SubLObject)module0534.$ic3$);
            }
            var44 = var44.rest();
            var45 = var44.first();
        }
        return module0262.f17364(var43, (SubLObject)module0534.UNPROVIDED);
    }
    
    public static SubLObject f33243(final SubLObject var16, final SubLObject var17, final SubLObject var48) {
        return module0195.f12226(module0204.f13033(var16), var17, var48, (SubLObject)module0534.$ic8$, (SubLObject)module0534.UNPROVIDED);
    }
    
    public static SubLObject f33252(final SubLObject var49) {
        final SubLThread var50 = SubLProcess.currentSubLThread();
        if (module0534.NIL != module0534.$g3914$.getDynamicValue(var50)) {
            final SubLObject var51 = module0147.f9540(module0178.f11287(var49));
            final SubLObject var52 = module0147.$g2095$.currentBinding(var50);
            final SubLObject var53 = module0147.$g2094$.currentBinding(var50);
            final SubLObject var54 = module0147.$g2096$.currentBinding(var50);
            try {
                module0147.$g2095$.bind(module0147.f9545(var51), var50);
                module0147.$g2094$.bind(module0147.f9546(var51), var50);
                module0147.$g2096$.bind(module0147.f9549(var51), var50);
                final SubLObject var55 = module0178.f11334(var49);
                final SubLObject var56 = module0178.f11335(var49);
                final SubLObject var57 = module0256.f16552(var55, (SubLObject)module0534.UNPROVIDED, (SubLObject)module0534.UNPROVIDED);
                final SubLObject var58 = module0256.f16531(var56, (SubLObject)module0534.UNPROVIDED, (SubLObject)module0534.UNPROVIDED);
                final SubLObject var59 = module0077.f5313(Symbols.symbol_function((SubLObject)module0534.EQL), (SubLObject)module0534.UNPROVIDED);
                final SubLObject var60 = module0077.f5313(Symbols.symbol_function((SubLObject)module0534.EQL), (SubLObject)module0534.UNPROVIDED);
                SubLObject var61 = var57;
                SubLObject var62 = (SubLObject)module0534.NIL;
                var62 = var61.first();
                while (module0534.NIL != var61) {
                    module0078.f5374(f33253(var62), var59);
                    var61 = var61.rest();
                    var62 = var61.first();
                }
                var61 = var58;
                SubLObject var63 = (SubLObject)module0534.NIL;
                var63 = var61.first();
                while (module0534.NIL != var61) {
                    module0078.f5374(f33253(var63), var60);
                    var61 = var61.rest();
                    var63 = var61.first();
                }
                f33254(module0077.f5312(var59), module0077.f5312(var60), (SubLObject)module0534.UNPROVIDED, (SubLObject)module0534.UNPROVIDED, (SubLObject)module0534.UNPROVIDED);
                final SubLObject var64 = module0077.f5333(var60);
                SubLObject var65;
                SubLObject var66;
                SubLObject var67;
                for (var65 = module0032.f1741(var64), var66 = (SubLObject)module0534.NIL, var66 = module0032.f1742(var65, var64); module0534.NIL == module0032.f1744(var65, var66); var66 = module0032.f1743(var66)) {
                    var67 = module0032.f1745(var65, var66);
                    if (module0534.NIL != module0032.f1746(var66, var67)) {
                        f33235(var67);
                    }
                }
            }
            finally {
                module0147.$g2096$.rebind(var54, var50);
                module0147.$g2094$.rebind(var53, var50);
                module0147.$g2095$.rebind(var52, var50);
            }
        }
        return (SubLObject)module0534.NIL;
    }
    
    public static SubLObject f33254(final SubLObject var51, final SubLObject var52, SubLObject var59, SubLObject var60, SubLObject var61) {
        if (var59 == module0534.UNPROVIDED) {
            var59 = (SubLObject)module0534.NIL;
        }
        if (var60 == module0534.UNPROVIDED) {
            var60 = (SubLObject)module0534.NIL;
        }
        if (var61 == module0534.UNPROVIDED) {
            var61 = (SubLObject)module0534.NIL;
        }
        final SubLThread var62 = SubLProcess.currentSubLThread();
        SubLObject var63 = (SubLObject)module0534.ZERO_INTEGER;
        if (module0534.NIL != var59) {
            module0012.$g82$.setDynamicValue((SubLObject)module0534.$ic9$, var62);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var62);
            module0012.$g83$.setDynamicValue(Sequences.length(var51), var62);
            module0012.$g84$.setDynamicValue((SubLObject)module0534.ZERO_INTEGER, var62);
            final SubLObject var64 = module0012.$g75$.currentBinding(var62);
            final SubLObject var65 = module0012.$g76$.currentBinding(var62);
            final SubLObject var66 = module0012.$g77$.currentBinding(var62);
            final SubLObject var67 = module0012.$g78$.currentBinding(var62);
            try {
                module0012.$g75$.bind((SubLObject)module0534.ZERO_INTEGER, var62);
                module0012.$g76$.bind((SubLObject)module0534.NIL, var62);
                module0012.$g77$.bind((SubLObject)module0534.T, var62);
                module0012.$g78$.bind(Time.get_universal_time(), var62);
                module0012.f478(module0012.$g82$.getDynamicValue(var62));
                SubLObject var68 = var51;
                SubLObject var69 = (SubLObject)module0534.NIL;
                var69 = var68.first();
                while (module0534.NIL != var68) {
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var62), module0012.$g83$.getDynamicValue(var62));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var62), (SubLObject)module0534.ONE_INTEGER), var62);
                    var63 = Numbers.add(var63, f33255(var69, var52, var60, var61));
                    var68 = var68.rest();
                    var69 = var68.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var67, var62);
                module0012.$g77$.rebind(var66, var62);
                module0012.$g76$.rebind(var65, var62);
                module0012.$g75$.rebind(var64, var62);
            }
        }
        else {
            SubLObject var70 = var51;
            SubLObject var71 = (SubLObject)module0534.NIL;
            var71 = var70.first();
            while (module0534.NIL != var70) {
                var63 = Numbers.add(var63, f33255(var71, var52, var60, var61));
                var70 = var70.rest();
                var71 = var70.first();
            }
        }
        return var63;
    }
    
    public static SubLObject f33255(final SubLObject var66, final SubLObject var52, final SubLObject var60, final SubLObject var61) {
        final SubLThread var67 = SubLProcess.currentSubLThread();
        SubLObject var68 = (SubLObject)module0534.ZERO_INTEGER;
        final SubLObject var69 = module0078.f5367(module0256.f16531(var66, (SubLObject)module0534.UNPROVIDED, (SubLObject)module0534.UNPROVIDED), Symbols.symbol_function((SubLObject)module0534.EQL), (SubLObject)module0534.UNPROVIDED);
        SubLObject var70 = var52;
        SubLObject var71 = (SubLObject)module0534.NIL;
        var71 = var70.first();
        while (module0534.NIL != var70) {
            if (!var66.eql(var71) && module0534.NIL == module0077.f5320(var71, var69) && (module0534.NIL == var61 || module0534.NIL == module0172.f10933(module0534.$ic10$, var66) || module0534.NIL == module0172.f10933(module0534.$ic10$, var71))) {
                SubLObject var72 = (SubLObject)module0534.NIL;
                if (module0534.NIL != var60) {
                    SubLObject var73 = (SubLObject)module0534.NIL;
                    try {
                        var67.throwStack.push(module0003.$g3$.getGlobalValue());
                        final SubLObject var74 = Errors.$error_handler$.currentBinding(var67);
                        try {
                            Errors.$error_handler$.bind((SubLObject)module0534.$ic11$, var67);
                            try {
                                var72 = f33256(var66, var71);
                            }
                            catch (Throwable var75) {
                                Errors.handleThrowable(var75, (SubLObject)module0534.NIL);
                            }
                        }
                        finally {
                            Errors.$error_handler$.rebind(var74, var67);
                        }
                    }
                    catch (Throwable var76) {
                        var73 = Errors.handleThrowable(var76, module0003.$g3$.getGlobalValue());
                    }
                    finally {
                        var67.throwStack.pop();
                    }
                    if (var73.isString()) {
                        Errors.warn((SubLObject)module0534.$ic12$, var73);
                    }
                }
                else {
                    var72 = f33256(var66, var71);
                }
                if (module0534.NIL != var72) {
                    var68 = Numbers.add(var68, (SubLObject)module0534.ONE_INTEGER);
                    SubLObject var77 = (SubLObject)module0534.NIL;
                    if (module0534.NIL != var60) {
                        SubLObject var78 = (SubLObject)module0534.NIL;
                        try {
                            var67.throwStack.push(module0003.$g3$.getGlobalValue());
                            final SubLObject var79 = Errors.$error_handler$.currentBinding(var67);
                            try {
                                Errors.$error_handler$.bind((SubLObject)module0534.$ic11$, var67);
                                try {
                                    var77 = f33257(var66, var71);
                                }
                                catch (Throwable var80) {
                                    Errors.handleThrowable(var80, (SubLObject)module0534.NIL);
                                }
                            }
                            finally {
                                Errors.$error_handler$.rebind(var79, var67);
                            }
                        }
                        catch (Throwable var81) {
                            var78 = Errors.handleThrowable(var81, module0003.$g3$.getGlobalValue());
                        }
                        finally {
                            var67.throwStack.pop();
                        }
                        if (var78.isString()) {
                            Errors.warn((SubLObject)module0534.$ic12$, var78);
                        }
                    }
                    else {
                        var77 = f33257(var66, var71);
                    }
                    if (module0534.NIL != var60) {
                        SubLObject var78 = (SubLObject)module0534.NIL;
                        try {
                            var67.throwStack.push(module0003.$g3$.getGlobalValue());
                            final SubLObject var79 = Errors.$error_handler$.currentBinding(var67);
                            try {
                                Errors.$error_handler$.bind((SubLObject)module0534.$ic11$, var67);
                                try {
                                    f33238(var77);
                                }
                                catch (Throwable var80) {
                                    Errors.handleThrowable(var80, (SubLObject)module0534.NIL);
                                }
                            }
                            finally {
                                Errors.$error_handler$.rebind(var79, var67);
                            }
                        }
                        catch (Throwable var81) {
                            var78 = Errors.handleThrowable(var81, module0003.$g3$.getGlobalValue());
                        }
                        finally {
                            var67.throwStack.pop();
                        }
                        if (var78.isString()) {
                            Errors.warn((SubLObject)module0534.$ic12$, var78);
                        }
                    }
                    else {
                        f33238(var77);
                    }
                }
            }
            var70 = var70.rest();
            var71 = var70.first();
        }
        return var68;
    }
    
    public static SubLObject f33258(SubLObject var60) {
        if (var60 == module0534.UNPROVIDED) {
            var60 = (SubLObject)module0534.T;
        }
        final SubLObject var61 = module0035.remove_if_not((SubLObject)module0534.$ic13$, Mapping.mapcar(Symbols.symbol_function((SubLObject)module0534.$ic14$), module0219.f14513(module0534.$ic10$)), (SubLObject)module0534.UNPROVIDED, (SubLObject)module0534.UNPROVIDED, (SubLObject)module0534.UNPROVIDED, (SubLObject)module0534.UNPROVIDED);
        return f33254(var61, var61, (SubLObject)module0534.T, var60, (SubLObject)module0534.NIL);
    }
    
    public static SubLObject f33259(SubLObject var60) {
        if (var60 == module0534.UNPROVIDED) {
            var60 = (SubLObject)module0534.T;
        }
        final SubLObject var61 = module0035.remove_if_not((SubLObject)module0534.$ic13$, Mapping.mapcar(Symbols.symbol_function((SubLObject)module0534.$ic14$), ConsesLow.append(module0219.f14513(module0534.$ic10$), module0219.f14513(module0534.$ic15$))), (SubLObject)module0534.UNPROVIDED, (SubLObject)module0534.UNPROVIDED, (SubLObject)module0534.UNPROVIDED, (SubLObject)module0534.UNPROVIDED);
        return f33254(var61, var61, (SubLObject)module0534.T, var60, (SubLObject)module0534.T);
    }
    
    public static SubLObject f33260(final SubLObject var73, SubLObject var60) {
        if (var60 == module0534.UNPROVIDED) {
            var60 = (SubLObject)module0534.T;
        }
        final SubLThread var74 = SubLProcess.currentSubLThread();
        if (module0534.NIL == Errors.$ignore_mustsP$.getDynamicValue(var74) && module0534.NIL == module0035.f2428((SubLObject)module0534.$ic16$, var73, (SubLObject)module0534.UNPROVIDED, (SubLObject)module0534.UNPROVIDED)) {
            Errors.error((SubLObject)module0534.$ic17$, var73);
        }
        final SubLObject var75 = module0035.remove_if_not((SubLObject)module0534.$ic13$, module0434.f30578((SubLObject)module0534.$ic16$, var73, module0534.$ic18$, (SubLObject)module0534.$ic19$), (SubLObject)module0534.UNPROVIDED, (SubLObject)module0534.UNPROVIDED, (SubLObject)module0534.UNPROVIDED, (SubLObject)module0534.UNPROVIDED);
        final SubLObject var76 = Sequences.length(var75);
        module0006.f218((SubLObject)module0534.T, (SubLObject)module0534.$ic20$, var76, Numbers.expt(var76, (SubLObject)module0534.TWO_INTEGER), (SubLObject)module0534.UNPROVIDED, (SubLObject)module0534.UNPROVIDED, (SubLObject)module0534.UNPROVIDED, (SubLObject)module0534.UNPROVIDED, (SubLObject)module0534.UNPROVIDED, (SubLObject)module0534.UNPROVIDED);
        return f33254(var75, var75, (SubLObject)module0534.T, var60, (SubLObject)module0534.NIL);
    }
    
    public static SubLObject f33236(final SubLObject var74) {
        return module0256.f16529(f33261(var74, module0534.$ic2$), module0534.$ic21$, (SubLObject)module0534.UNPROVIDED);
    }
    
    public static SubLObject f33261(final SubLObject var74, SubLObject var17) {
        if (var17 == module0534.UNPROVIDED) {
            var17 = (SubLObject)module0534.NIL;
        }
        final SubLThread var75 = SubLProcess.currentSubLThread();
        SubLObject var76 = (SubLObject)module0534.NIL;
        final SubLObject var77 = var17;
        final SubLObject var78 = module0147.$g2095$.currentBinding(var75);
        final SubLObject var79 = module0147.$g2094$.currentBinding(var75);
        final SubLObject var80 = module0147.$g2096$.currentBinding(var75);
        try {
            module0147.$g2095$.bind(module0147.f9545(var77), var75);
            module0147.$g2094$.bind(module0147.f9546(var77), var75);
            module0147.$g2096$.bind(module0147.f9549(var77), var75);
            final SubLObject var81 = f33246(var74);
            final SubLObject var82 = module0256.f16550(var81, (SubLObject)module0534.UNPROVIDED, (SubLObject)module0534.UNPROVIDED);
            final SubLObject var83 = module0077.f5313(Symbols.symbol_function((SubLObject)module0534.EQL), (SubLObject)module0534.UNPROVIDED);
            SubLObject var84 = var82;
            SubLObject var85 = (SubLObject)module0534.NIL;
            var85 = var84.first();
            while (module0534.NIL != var84) {
                module0078.f5374(f33253(var85), var83);
                var84 = var84.rest();
                var85 = var84.first();
            }
            final SubLObject var86 = module0077.f5333(var83);
            SubLObject var87;
            SubLObject var88;
            SubLObject var89;
            SubLObject var90;
            for (var87 = module0032.f1741(var86), var88 = (SubLObject)module0534.NIL, var88 = module0032.f1742(var87, var86); module0534.NIL == module0032.f1744(var87, var88); var88 = module0032.f1743(var88)) {
                var89 = module0032.f1745(var87, var88);
                if (module0534.NIL != module0032.f1746(var88, var89)) {
                    var90 = ((module0534.NIL != module0167.f10813(var74)) ? var89 : module0172.f10915(var89));
                    if (!var90.equal(var74) && module0534.NIL != f33262(var74, var89)) {
                        var76 = (SubLObject)ConsesLow.cons(var89, var76);
                    }
                }
            }
        }
        finally {
            module0147.$g2096$.rebind(var80, var75);
            module0147.$g2094$.rebind(var79, var75);
            module0147.$g2095$.rebind(var78, var75);
        }
        return var76;
    }
    
    public static SubLObject f33239(final SubLObject var82) {
        return module0256.f16538(f33263(var82, module0534.$ic2$), module0534.$ic21$, (SubLObject)module0534.UNPROVIDED);
    }
    
    public static SubLObject f33263(final SubLObject var82, SubLObject var17) {
        if (var17 == module0534.UNPROVIDED) {
            var17 = (SubLObject)module0534.NIL;
        }
        final SubLThread var83 = SubLProcess.currentSubLThread();
        SubLObject var84 = (SubLObject)module0534.NIL;
        final SubLObject var85 = var17;
        final SubLObject var86 = module0147.$g2095$.currentBinding(var83);
        final SubLObject var87 = module0147.$g2094$.currentBinding(var83);
        final SubLObject var88 = module0147.$g2096$.currentBinding(var83);
        try {
            module0147.$g2095$.bind(module0147.f9545(var85), var83);
            module0147.$g2094$.bind(module0147.f9546(var85), var83);
            module0147.$g2096$.bind(module0147.f9549(var85), var83);
            final SubLObject var89 = f33246(var82);
            final SubLObject var90 = module0256.f16642(var89, (SubLObject)module0534.UNPROVIDED, (SubLObject)module0534.UNPROVIDED);
            var84 = Sequences.delete(var82, var90, Symbols.symbol_function((SubLObject)module0534.EQUAL), (SubLObject)module0534.UNPROVIDED, (SubLObject)module0534.UNPROVIDED, (SubLObject)module0534.UNPROVIDED, (SubLObject)module0534.UNPROVIDED);
        }
        finally {
            module0147.$g2096$.rebind(var88, var83);
            module0147.$g2094$.rebind(var87, var83);
            module0147.$g2095$.rebind(var86, var83);
        }
        return var84;
    }
    
    public static SubLObject f33253(final SubLObject var83) {
        return ConsesLow.nconc(f33264(var83), f33265(var83));
    }
    
    public static SubLObject f33264(final SubLObject var83) {
        SubLObject var84 = (SubLObject)module0534.NIL;
        if (module0534.NIL != module0534.$g3915$.getGlobalValue()) {
            if (module0534.NIL != module0158.f10054(var83, (SubLObject)module0534.ONE_INTEGER, module0534.$ic15$)) {
                final SubLObject var85 = module0158.f10055(var83, (SubLObject)module0534.ONE_INTEGER, module0534.$ic15$);
                SubLObject var86 = (SubLObject)module0534.NIL;
                final SubLObject var87 = (SubLObject)module0534.NIL;
                while (module0534.NIL == var86) {
                    final SubLObject var88 = module0052.f3695(var85, var87);
                    final SubLObject var89 = (SubLObject)SubLObjectFactory.makeBoolean(!var87.eql(var88));
                    if (module0534.NIL != var89) {
                        SubLObject var90 = (SubLObject)module0534.NIL;
                        try {
                            var90 = module0158.f10316(var88, (SubLObject)module0534.$ic22$, (SubLObject)module0534.NIL, (SubLObject)module0534.NIL);
                            SubLObject var85_90 = (SubLObject)module0534.NIL;
                            final SubLObject var86_91 = (SubLObject)module0534.NIL;
                            while (module0534.NIL == var85_90) {
                                final SubLObject var91 = module0052.f3695(var90, var86_91);
                                final SubLObject var88_93 = (SubLObject)SubLObjectFactory.makeBoolean(!var86_91.eql(var91));
                                if (module0534.NIL != var88_93) {
                                    var84 = (SubLObject)ConsesLow.cons(module0178.f11334(var91), var84);
                                }
                                var85_90 = (SubLObject)SubLObjectFactory.makeBoolean(module0534.NIL == var88_93);
                            }
                        }
                        finally {
                            final SubLObject var92 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0534.T);
                                if (module0534.NIL != var90) {
                                    module0158.f10319(var90);
                                }
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var92);
                            }
                        }
                    }
                    var86 = (SubLObject)SubLObjectFactory.makeBoolean(module0534.NIL == var89);
                }
            }
            if (module0534.NIL != module0158.f10054(var83, (SubLObject)module0534.TWO_INTEGER, module0534.$ic15$)) {
                final SubLObject var85 = module0158.f10055(var83, (SubLObject)module0534.TWO_INTEGER, module0534.$ic15$);
                SubLObject var86 = (SubLObject)module0534.NIL;
                final SubLObject var87 = (SubLObject)module0534.NIL;
                while (module0534.NIL == var86) {
                    final SubLObject var88 = module0052.f3695(var85, var87);
                    final SubLObject var89 = (SubLObject)SubLObjectFactory.makeBoolean(!var87.eql(var88));
                    if (module0534.NIL != var89) {
                        SubLObject var90 = (SubLObject)module0534.NIL;
                        try {
                            var90 = module0158.f10316(var88, (SubLObject)module0534.$ic22$, (SubLObject)module0534.NIL, (SubLObject)module0534.NIL);
                            SubLObject var85_91 = (SubLObject)module0534.NIL;
                            final SubLObject var86_92 = (SubLObject)module0534.NIL;
                            while (module0534.NIL == var85_91) {
                                final SubLObject var91 = module0052.f3695(var90, var86_92);
                                final SubLObject var88_94 = (SubLObject)SubLObjectFactory.makeBoolean(!var86_92.eql(var91));
                                if (module0534.NIL != var88_94) {
                                    var84 = (SubLObject)ConsesLow.cons(module0178.f11334(var91), var84);
                                }
                                var85_91 = (SubLObject)SubLObjectFactory.makeBoolean(module0534.NIL == var88_94);
                            }
                        }
                        finally {
                            final SubLObject var93 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0534.T);
                                if (module0534.NIL != var90) {
                                    module0158.f10319(var90);
                                }
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var93);
                            }
                        }
                    }
                    var86 = (SubLObject)SubLObjectFactory.makeBoolean(module0534.NIL == var89);
                }
            }
        }
        else if (module0534.NIL != module0158.f10054(var83, (SubLObject)module0534.NIL, module0534.$ic15$)) {
            final SubLObject var85 = module0158.f10055(var83, (SubLObject)module0534.NIL, module0534.$ic15$);
            SubLObject var86 = (SubLObject)module0534.NIL;
            final SubLObject var87 = (SubLObject)module0534.NIL;
            while (module0534.NIL == var86) {
                final SubLObject var88 = module0052.f3695(var85, var87);
                final SubLObject var89 = (SubLObject)SubLObjectFactory.makeBoolean(!var87.eql(var88));
                if (module0534.NIL != var89) {
                    SubLObject var90 = (SubLObject)module0534.NIL;
                    try {
                        var90 = module0158.f10316(var88, (SubLObject)module0534.$ic22$, (SubLObject)module0534.NIL, (SubLObject)module0534.NIL);
                        SubLObject var85_92 = (SubLObject)module0534.NIL;
                        final SubLObject var86_93 = (SubLObject)module0534.NIL;
                        while (module0534.NIL == var85_92) {
                            final SubLObject var91 = module0052.f3695(var90, var86_93);
                            final SubLObject var88_95 = (SubLObject)SubLObjectFactory.makeBoolean(!var86_93.eql(var91));
                            if (module0534.NIL != var88_95) {
                                var84 = (SubLObject)ConsesLow.cons(module0178.f11334(var91), var84);
                            }
                            var85_92 = (SubLObject)SubLObjectFactory.makeBoolean(module0534.NIL == var88_95);
                        }
                    }
                    finally {
                        final SubLObject var94 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0534.T);
                            if (module0534.NIL != var90) {
                                module0158.f10319(var90);
                            }
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var94);
                        }
                    }
                }
                var86 = (SubLObject)SubLObjectFactory.makeBoolean(module0534.NIL == var89);
            }
        }
        return Sequences.nreverse(module0035.remove_if_not((SubLObject)module0534.$ic13$, var84, (SubLObject)module0534.UNPROVIDED, (SubLObject)module0534.UNPROVIDED, (SubLObject)module0534.UNPROVIDED, (SubLObject)module0534.UNPROVIDED));
    }
    
    public static SubLObject f33265(final SubLObject var83) {
        SubLObject var84 = (SubLObject)module0534.NIL;
        if (module0534.NIL != module0158.f10274(var83, (SubLObject)module0534.$ic22$)) {
            final SubLObject var85 = module0158.f10275(var83);
            SubLObject var86 = (SubLObject)module0534.NIL;
            try {
                var86 = module0158.f10316(var85, (SubLObject)module0534.$ic22$, (SubLObject)module0534.$ic23$, (SubLObject)module0534.NIL);
                SubLObject var87 = (SubLObject)module0534.NIL;
                final SubLObject var88 = (SubLObject)module0534.NIL;
                while (module0534.NIL == var87) {
                    final SubLObject var89 = module0052.f3695(var86, var88);
                    final SubLObject var90 = (SubLObject)SubLObjectFactory.makeBoolean(!var88.eql(var89));
                    if (module0534.NIL != var90 && module0534.NIL != module0158.f10280(var89) && module0534.NIL != module0211.f13649(var89, module0534.$ic24$)) {
                        final SubLObject var91 = module0178.f11334(var89);
                        if (module0534.NIL != f33232(var91)) {
                            var84 = (SubLObject)ConsesLow.cons(var91, var84);
                        }
                    }
                    var87 = (SubLObject)SubLObjectFactory.makeBoolean(module0534.NIL == var90);
                }
            }
            finally {
                final SubLObject var92 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0534.T);
                    if (module0534.NIL != var86) {
                        module0158.f10319(var86);
                    }
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var92);
                }
            }
        }
        return Sequences.nreverse(var84);
    }
    
    public static SubLObject f33247(final SubLObject var101) {
        if (module0534.NIL != module0167.f10813(var101)) {
            return f33266(module0172.f10915(var101));
        }
        if (module0534.NIL != module0202.f12659(var101) && module0534.NIL != module0193.f12105(var101)) {
            return f33266(var101);
        }
        return (SubLObject)module0534.NIL;
    }
    
    public static SubLObject f33232(final SubLObject var101) {
        if (module0534.NIL != module0167.f10824(var101, (SubLObject)module0534.UNPROVIDED)) {
            final SubLObject var102 = module0172.f10915(var101);
            return f33266(var102);
        }
        return (SubLObject)module0534.NIL;
    }
    
    public static SubLObject f33266(final SubLObject var102) {
        final SubLObject var104;
        final SubLObject var103 = var104 = module0205.f13136(var102);
        if (var104.eql(module0534.$ic10$)) {
            return module0202.f12677(module0205.f13203(var102, (SubLObject)module0534.UNPROVIDED));
        }
        if (var104.eql(module0534.$ic15$)) {
            return (SubLObject)module0534.T;
        }
        return (SubLObject)module0534.NIL;
    }
    
    public static SubLObject f33246(final SubLObject var105) {
        final SubLObject var107;
        final SubLObject var106 = var107 = module0205.f13276(var105);
        if (var107.eql(module0534.$ic10$)) {
            return module0202.f12684(module0205.f13277(var105, (SubLObject)module0534.UNPROVIDED));
        }
        if (var107.eql(module0534.$ic15$)) {
            return module0205.f13304(var105, (SubLObject)module0534.UNPROVIDED);
        }
        return Errors.error((SubLObject)module0534.$ic27$, var105);
    }
    
    public static SubLObject f33267(final SubLObject var106) {
        return (SubLObject)((module0534.NIL != f33266(var106)) ? f33246(var106) : ConsesLow.list(var106));
    }
    
    public static SubLObject f33256(final SubLObject var74, final SubLObject var82) {
        final SubLThread var83 = SubLProcess.currentSubLThread();
        SubLObject var84 = (SubLObject)module0534.NIL;
        final SubLObject var85 = module0147.$g2094$.currentBinding(var83);
        final SubLObject var86 = module0147.$g2095$.currentBinding(var83);
        try {
            module0147.$g2094$.bind((SubLObject)module0534.$ic28$, var83);
            module0147.$g2095$.bind(module0534.$ic2$, var83);
            var84 = f33262(var74, var82);
        }
        finally {
            module0147.$g2095$.rebind(var86, var83);
            module0147.$g2094$.rebind(var85, var83);
        }
        return var84;
    }
    
    public static SubLObject f33262(final SubLObject var74, final SubLObject var82) {
        final SubLObject var83 = f33246(var74);
        final SubLObject var84 = f33246(var82);
        return f33268(var83, var84);
    }
    
    public static SubLObject f33268(final SubLObject var37, final SubLObject var34) {
        return module0035.f2206(var34, module0256.f16550(var37, (SubLObject)module0534.UNPROVIDED, (SubLObject)module0534.UNPROVIDED), Symbols.symbol_function((SubLObject)module0534.EQUAL));
    }
    
    public static SubLObject f33248() {
        return module0191.f11990((SubLObject)module0534.$ic4$, module0534.$g3917$.getGlobalValue(), module0534.$g3916$.getGlobalValue(), (SubLObject)module0534.$ic31$);
    }
    
    public static SubLObject f33249() {
        return module0191.f11990((SubLObject)module0534.$ic4$, module0534.$g3918$.getGlobalValue(), module0534.$g3916$.getGlobalValue(), (SubLObject)module0534.$ic31$);
    }
    
    public static SubLObject f33237(final SubLObject var32, final SubLObject var50, SubLObject var17) {
        if (var17 == module0534.UNPROVIDED) {
            var17 = (SubLObject)module0534.NIL;
        }
        final SubLThread var51 = SubLProcess.currentSubLThread();
        SubLObject var52 = (SubLObject)module0534.NIL;
        final SubLObject var53 = var17;
        final SubLObject var54 = module0147.$g2095$.currentBinding(var51);
        final SubLObject var55 = module0147.$g2094$.currentBinding(var51);
        final SubLObject var56 = module0147.$g2096$.currentBinding(var51);
        try {
            module0147.$g2095$.bind(module0147.f9545(var53), var51);
            module0147.$g2094$.bind(module0147.f9546(var53), var51);
            module0147.$g2096$.bind(module0147.f9549(var53), var51);
            SubLObject var57 = (SubLObject)module0534.NIL;
            SubLObject var58 = var50;
            SubLObject var59 = (SubLObject)module0534.NIL;
            var59 = var58.first();
            while (module0534.NIL != var58) {
                var57 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module0534.$ic32$, var32, var59), var57);
                var58 = var58.rest();
                var59 = var58.first();
            }
            var52 = Mapping.mapcar((SubLObject)module0534.$ic33$, Sequences.nreverse(var57));
        }
        finally {
            module0147.$g2096$.rebind(var56, var51);
            module0147.$g2094$.rebind(var55, var51);
            module0147.$g2095$.rebind(var54, var51);
        }
        return var52;
    }
    
    public static SubLObject f33240(final SubLObject var9, final SubLObject var33, SubLObject var17) {
        if (var17 == module0534.UNPROVIDED) {
            var17 = (SubLObject)module0534.NIL;
        }
        final SubLThread var34 = SubLProcess.currentSubLThread();
        SubLObject var35 = (SubLObject)module0534.NIL;
        final SubLObject var36 = var17;
        final SubLObject var37 = module0147.$g2095$.currentBinding(var34);
        final SubLObject var38 = module0147.$g2094$.currentBinding(var34);
        final SubLObject var39 = module0147.$g2096$.currentBinding(var34);
        try {
            module0147.$g2095$.bind(module0147.f9545(var36), var34);
            module0147.$g2094$.bind(module0147.f9546(var36), var34);
            module0147.$g2096$.bind(module0147.f9549(var36), var34);
            SubLObject var40 = (SubLObject)module0534.NIL;
            SubLObject var41 = var9;
            SubLObject var42 = (SubLObject)module0534.NIL;
            var42 = var41.first();
            while (module0534.NIL != var41) {
                var40 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module0534.$ic32$, var42, var33), var40);
                var41 = var41.rest();
                var42 = var41.first();
            }
            var35 = Mapping.mapcar((SubLObject)module0534.$ic33$, Sequences.nreverse(var40));
        }
        finally {
            module0147.$g2096$.rebind(var39, var34);
            module0147.$g2094$.rebind(var38, var34);
            module0147.$g2095$.rebind(var37, var34);
        }
        return var35;
    }
    
    public static SubLObject f33257(final SubLObject var5, final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        SubLObject var10 = (SubLObject)module0534.NIL;
        final SubLObject var11 = module0147.$g2094$.currentBinding(var9);
        final SubLObject var12 = module0147.$g2095$.currentBinding(var9);
        try {
            module0147.$g2094$.bind((SubLObject)module0534.$ic28$, var9);
            module0147.$g2095$.bind(module0534.$ic2$, var9);
            var10 = (SubLObject)ConsesLow.list(f33244((SubLObject)ConsesLow.list(module0534.$ic32$, var5, var8)));
        }
        finally {
            module0147.$g2095$.rebind(var12, var9);
            module0147.$g2094$.rebind(var11, var9);
        }
        return var10;
    }
    
    public static SubLObject f33244(final SubLObject var109) {
        final SubLThread var110 = SubLProcess.currentSubLThread();
        final SubLObject var111 = module0205.f13203(var109, (SubLObject)module0534.UNPROVIDED);
        final SubLObject var112 = module0205.f13204(var109, (SubLObject)module0534.UNPROVIDED);
        final SubLObject var113 = f33267(var111);
        final SubLObject var114 = f33267(var112);
        final SubLObject var115 = f33269(var113, var114);
        SubLObject var116 = (SubLObject)module0534.NIL;
        SubLObject var117 = var115;
        SubLObject var118 = (SubLObject)module0534.NIL;
        var118 = var117.first();
        while (module0534.NIL != var117) {
            var116 = (SubLObject)ConsesLow.cons(module0191.f11990((SubLObject)module0534.$ic7$, var118, module0147.$g2095$.getDynamicValue(var110), (SubLObject)module0534.UNPROVIDED), var116);
            var117 = var117.rest();
            var118 = var117.first();
        }
        final SubLObject var119 = (SubLObject)ConsesLow.cons(var109, Sequences.nreverse(var116));
        return var119;
    }
    
    public static SubLObject f33269(final SubLObject var37, final SubLObject var34) {
        SubLObject var38 = (SubLObject)module0534.NIL;
        SubLObject var39 = var34;
        SubLObject var40 = (SubLObject)module0534.NIL;
        var40 = var39.first();
        while (module0534.NIL != var39) {
            SubLObject var41 = (SubLObject)module0534.NIL;
            SubLObject var42 = (SubLObject)module0534.NIL;
            if (module0534.NIL == var41) {
                SubLObject var43 = var37;
                SubLObject var44 = (SubLObject)module0534.NIL;
                var44 = var43.first();
                while (module0534.NIL == var41 && module0534.NIL != var43) {
                    if (module0534.NIL != module0256.f16596(var44, var40, (SubLObject)module0534.UNPROVIDED, (SubLObject)module0534.UNPROVIDED)) {
                        if (module0534.NIL != module0147.f9512() && module0534.NIL == module0256.f16596(var44, var40, module0534.$ic21$, (SubLObject)module0534.UNPROVIDED)) {
                            var42 = (SubLObject)ConsesLow.list(module0534.$ic32$, var44, var40);
                        }
                        else {
                            var38 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module0534.$ic32$, var44, var40), var38);
                            var41 = (SubLObject)module0534.T;
                        }
                    }
                    var43 = var43.rest();
                    var44 = var43.first();
                }
            }
            if (module0534.NIL != var42 && module0534.NIL == var41) {
                var38 = (SubLObject)ConsesLow.cons(var42, var38);
            }
            var39 = var39.rest();
            var40 = var39.first();
        }
        return Sequences.nreverse(var38);
    }
    
    public static SubLObject f33270() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0534", "f33229", "CYC-COLLECTION-INTERSECTION-AFTER-ADDING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0534", "f33231", "CYC-COLLECTION-INTERSECTION-2-AFTER-ADDING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0534", "f33230", "S#36687", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0534", "f33233", "S#36688", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0534", "f33234", "S#36689", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0534", "f33235", "S#36690", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0534", "f33238", "S#36691", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0534", "f33242", "S#36692", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0534", "f33245", "S#36693", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0534", "f33241", "S#36694", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0534", "f33251", "S#36695", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0534", "f33250", "S#36696", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0534", "f33243", "S#36697", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0534", "f33252", "S#19277", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0534", "f33254", "S#36698", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0534", "f33255", "S#36699", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0534", "f33258", "S#36700", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0534", "f33259", "S#36701", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0534", "f33260", "S#36702", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0534", "f33236", "S#36703", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0534", "f33261", "S#36704", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0534", "f33239", "S#36705", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0534", "f33263", "S#36706", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0534", "f33253", "S#36707", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0534", "f33264", "S#36708", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0534", "f33265", "S#36709", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0534", "f33247", "S#36710", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0534", "f33232", "S#36711", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0534", "f33266", "S#36712", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0534", "f33246", "S#36713", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0534", "f33267", "S#36714", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0534", "f33256", "S#36715", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0534", "f33262", "S#36716", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0534", "f33268", "S#36717", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0534", "f33248", "S#36718", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0534", "f33249", "S#36719", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0534", "f33237", "S#36720", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0534", "f33240", "S#36721", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0534", "f33257", "S#36722", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0534", "f33244", "S#36723", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0534", "f33269", "S#36724", 2, 0, false);
        return (SubLObject)module0534.NIL;
    }
    
    public static SubLObject f33271() {
        module0534.$g3914$ = SubLFiles.defparameter("S#36725", (SubLObject)module0534.NIL);
        module0534.$g3915$ = SubLFiles.deflexical("S#36726", (SubLObject)module0534.NIL);
        module0534.$g3916$ = SubLFiles.deflexical("S#36727", module0534.$ic21$);
        module0534.$g3917$ = SubLFiles.deflexical("S#36728", (SubLObject)module0534.$ic29$);
        module0534.$g3918$ = SubLFiles.deflexical("S#36729", (SubLObject)module0534.$ic30$);
        return (SubLObject)module0534.NIL;
    }
    
    public static SubLObject f33272() {
        module0012.f416((SubLObject)module0534.$ic0$);
        module0012.f416((SubLObject)module0534.$ic1$);
        module0012.f419((SubLObject)module0534.$ic25$);
        module0012.f419((SubLObject)module0534.$ic26$);
        return (SubLObject)module0534.NIL;
    }
    
    public void declareFunctions() {
        f33270();
    }
    
    public void initializeVariables() {
        f33271();
    }
    
    public void runTopLevelForms() {
        f33272();
    }
    
    static {
        me = (SubLFile)new module0534();
        module0534.$g3914$ = null;
        module0534.$g3915$ = null;
        module0534.$g3916$ = null;
        module0534.$g3917$ = null;
        module0534.$g3918$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("CYC-COLLECTION-INTERSECTION-AFTER-ADDING");
        $ic1$ = SubLObjectFactory.makeSymbol("CYC-COLLECTION-INTERSECTION-2-AFTER-ADDING");
        $ic2$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14781", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10995", "CYC"));
        $ic4$ = SubLObjectFactory.makeKeyword("CODE");
        $ic5$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("collectionIntersection"));
        $ic6$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#36730", "CYC"));
        $ic7$ = SubLObjectFactory.makeKeyword("GENLS");
        $ic8$ = SubLObjectFactory.makeKeyword("FORWARD");
        $ic9$ = SubLObjectFactory.makeString("Computing #$genls between collection intersection narts...");
        $ic10$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CollectionIntersectionFn"));
        $ic11$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic12$ = SubLObjectFactory.makeString("~A");
        $ic13$ = SubLObjectFactory.makeSymbol("S#13637", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("GAF-ARG1");
        $ic15$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CollectionIntersection2Fn"));
        $ic16$ = SubLObjectFactory.makeSymbol("?NART");
        $ic17$ = SubLObjectFactory.makeString("~s did not contain a variable named ?NART");
        $ic18$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic19$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("HL"));
        $ic20$ = SubLObjectFactory.makeString("Found ~a narts for a total of ~a pairs.~%");
        $ic21$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $ic22$ = SubLObjectFactory.makeKeyword("GAF");
        $ic23$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic24$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("termOfUnit"));
        $ic25$ = SubLObjectFactory.makeSymbol("S#36710", "CYC");
        $ic26$ = SubLObjectFactory.makeSymbol("S#36711", "CYC");
        $ic27$ = SubLObjectFactory.makeString("Unexpected collection intersection nat ~s");
        $ic28$ = SubLObjectFactory.makeSymbol("S#12275", "CYC");
        $ic29$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("collectionIntersection")), (SubLObject)SubLObjectFactory.makeSymbol("?SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("?SPEC-CONSTITUENT-COLS")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("collectionIntersection")), (SubLObject)SubLObjectFactory.makeSymbol("?GENL"), (SubLObject)SubLObjectFactory.makeSymbol("?GENL-CONSTITUENT-COLS")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("forAll")), (SubLObject)SubLObjectFactory.makeSymbol("?GENL-CONSTIT-COL"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("elementOf")), (SubLObject)SubLObjectFactory.makeSymbol("?GENL-CONSTIT-COL"), (SubLObject)SubLObjectFactory.makeSymbol("?GENL-CONSTITUENT-COLS")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?SPEC-CONSTIT-COL"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("elementOf")), (SubLObject)SubLObjectFactory.makeSymbol("?SPEC-CONSTIT-COL"), (SubLObject)SubLObjectFactory.makeSymbol("?SPEC-CONSTITUENT-COLS")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeSymbol("?SPEC-CONSTIT-COL"), (SubLObject)SubLObjectFactory.makeSymbol("?GENL-CONSTIT-COL"))))))), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeSymbol("?SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("?GENL")));
        $ic30$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("collectionIntersection")), (SubLObject)SubLObjectFactory.makeSymbol("?GENL"), (SubLObject)SubLObjectFactory.makeSymbol("?GENL-CONSTITUENT-COLS")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?SPEC"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Collection"))), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("forAll")), (SubLObject)SubLObjectFactory.makeSymbol("?GENL-CONSTIT-COL"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("elementOf")), (SubLObject)SubLObjectFactory.makeSymbol("?GENL-CONSTIT-COL"), (SubLObject)SubLObjectFactory.makeSymbol("?GENL-CONSTITUENT-COLS")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeSymbol("?SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("?GENL-CONSTIT-COL"))))), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeSymbol("?SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("?GENL")));
        $ic31$ = SubLObjectFactory.makeKeyword("TRUE-MON");
        $ic32$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genls"));
        $ic33$ = SubLObjectFactory.makeSymbol("S#36723", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0534.class
	Total time: 402 ms
	
	Decompiled with Procyon 0.5.32.
*/