package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0252 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0252";
    public static final String myFingerPrint = "32ccf10020b8601461d3a65080bc4bc211baa5178a988b8b7c9ee3a99946c40e";
    private static SubLSymbol $g2471$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLString $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLString $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLString $ic8$;
    private static final SubLObject $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLObject $ic14$;
    private static final SubLString $ic15$;
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
    private static final SubLObject $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLString $ic42$;
    private static final SubLString $ic43$;
    private static final SubLString $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLObject $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLString $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLString $ic56$;
    
    public static SubLObject f16245(final SubLObject var1, final SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var5 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        SubLObject var6 = (SubLObject)module0252.NIL;
        final SubLObject var7 = module0141.$g1670$.currentBinding(var5);
        final SubLObject var8 = module0141.$g1671$.currentBinding(var5);
        final SubLObject var9 = module0141.$g1672$.currentBinding(var5);
        final SubLObject var10 = module0141.$g1674$.currentBinding(var5);
        final SubLObject var11 = module0137.$g1605$.currentBinding(var5);
        try {
            module0141.$g1670$.bind(var1, var5);
            module0141.$g1671$.bind(module0244.f15739(var1), var5);
            module0141.$g1672$.bind(module0244.f15746(var1), var5);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var5);
            module0137.$g1605$.bind(var1, var5);
            final SubLObject var12 = var3;
            final SubLObject var7_13 = module0147.$g2095$.currentBinding(var5);
            final SubLObject var8_14 = module0147.$g2094$.currentBinding(var5);
            final SubLObject var9_15 = module0147.$g2096$.currentBinding(var5);
            try {
                module0147.$g2095$.bind(module0147.f9545(var12), var5);
                module0147.$g2094$.bind(module0147.f9546(var12), var5);
                module0147.$g2096$.bind(module0147.f9549(var12), var5);
                final SubLObject var13 = var4;
                final SubLObject var7_14 = module0141.$g1714$.currentBinding(var5);
                final SubLObject var8_15 = module0141.$g1715$.currentBinding(var5);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var13) ? var13 : module0141.f9283(), var5);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var13) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var5)), var5);
                    if (module0252.NIL != var13 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var13)) {
                        final SubLObject var14 = module0136.$g1591$.getDynamicValue(var5);
                        if (var14.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var13, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var14.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var13, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var14.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var13, (SubLObject)module0252.$ic4$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var5));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var13, (SubLObject)module0252.$ic4$);
                        }
                    }
                    final SubLObject var7_15 = module0141.$g1710$.currentBinding(var5);
                    final SubLObject var8_16 = module0141.$g1677$.currentBinding(var5);
                    final SubLObject var9_16 = module0138.$g1619$.currentBinding(var5);
                    try {
                        module0141.$g1710$.bind(module0252.$ic9$, var5);
                        module0141.$g1677$.bind(module0141.f9208(), var5);
                        module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var5);
                        final SubLObject var15 = module0139.f9036();
                        final SubLObject var7_16 = module0139.$g1635$.currentBinding(var5);
                        try {
                            module0139.$g1635$.bind((var15 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var5) : module0139.f9038(var15), var5);
                            final SubLObject var7_17 = module0139.$g1636$.currentBinding(var5);
                            try {
                                module0139.$g1636$.bind((var15 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var5) : module0139.f9038(var15), var5);
                                final SubLObject var7_18 = module0141.$g1685$.currentBinding(var5);
                                final SubLObject var8_17 = module0141.$g1686$.currentBinding(var5);
                                final SubLObject var9_17 = module0141.$g1683$.currentBinding(var5);
                                final SubLObject var10_29 = module0141.$g1684$.currentBinding(var5);
                                final SubLObject var11_30 = module0141.$g1674$.currentBinding(var5);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var5);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var5);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var5);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var5);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var5);
                                    final SubLObject var16 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var17 = (SubLObject)module0252.NIL;
                                    try {
                                        var17 = ReadWriteLocks.rw_lock_seize_read_lock(var16);
                                        final SubLObject var7_19 = module0141.$g1665$.currentBinding(var5);
                                        final SubLObject var8_18 = module0139.$g1648$.currentBinding(var5);
                                        final SubLObject var9_18 = module0141.$g1693$.currentBinding(var5);
                                        try {
                                            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var5);
                                            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var5)), var5);
                                            module0141.$g1693$.bind((SubLObject)module0252.$ic11$, var5);
                                            var6 = f16246(var2);
                                        }
                                        finally {
                                            module0141.$g1693$.rebind(var9_18, var5);
                                            module0139.$g1648$.rebind(var8_18, var5);
                                            module0141.$g1665$.rebind(var7_19, var5);
                                        }
                                    }
                                    finally {
                                        if (module0252.NIL != var17) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var16);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_30, var5);
                                    module0141.$g1684$.rebind(var10_29, var5);
                                    module0141.$g1683$.rebind(var9_17, var5);
                                    module0141.$g1686$.rebind(var8_17, var5);
                                    module0141.$g1685$.rebind(var7_18, var5);
                                }
                                if (var15 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var5));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_17, var5);
                            }
                            if (var15 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var5));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_16, var5);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_16, var5);
                        module0141.$g1677$.rebind(var8_16, var5);
                        module0141.$g1710$.rebind(var7_15, var5);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_15, var5);
                    module0141.$g1714$.rebind(var7_14, var5);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_15, var5);
                module0147.$g2094$.rebind(var8_14, var5);
                module0147.$g2095$.rebind(var7_13, var5);
            }
        }
        finally {
            module0137.$g1605$.rebind(var11, var5);
            module0141.$g1674$.rebind(var10, var5);
            module0141.$g1672$.rebind(var9, var5);
            module0141.$g1671$.rebind(var8, var5);
            module0141.$g1670$.rebind(var7, var5);
        }
        return var6;
    }
    
    public static SubLObject f16247(final SubLObject var1, final SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var5 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        SubLObject var6 = (SubLObject)module0252.NIL;
        final SubLObject var7 = module0141.$g1670$.currentBinding(var5);
        final SubLObject var8 = module0141.$g1671$.currentBinding(var5);
        final SubLObject var9 = module0141.$g1672$.currentBinding(var5);
        final SubLObject var10 = module0141.$g1674$.currentBinding(var5);
        final SubLObject var11 = module0137.$g1605$.currentBinding(var5);
        try {
            module0141.$g1670$.bind(var1, var5);
            module0141.$g1671$.bind(module0244.f15739(var1), var5);
            module0141.$g1672$.bind(module0244.f15746(var1), var5);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var5);
            module0137.$g1605$.bind(var1, var5);
            final SubLObject var12 = var3;
            final SubLObject var7_36 = module0147.$g2095$.currentBinding(var5);
            final SubLObject var8_37 = module0147.$g2094$.currentBinding(var5);
            final SubLObject var9_38 = module0147.$g2096$.currentBinding(var5);
            try {
                module0147.$g2095$.bind(module0147.f9545(var12), var5);
                module0147.$g2094$.bind(module0147.f9546(var12), var5);
                module0147.$g2096$.bind(module0147.f9549(var12), var5);
                final SubLObject var13 = var4;
                final SubLObject var7_37 = module0141.$g1714$.currentBinding(var5);
                final SubLObject var8_38 = module0141.$g1715$.currentBinding(var5);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var13) ? var13 : module0141.f9284(), var5);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var13) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var5)), var5);
                    if (module0252.NIL != var13 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9281(var13)) {
                        final SubLObject var14 = module0136.$g1591$.getDynamicValue(var5);
                        if (var14.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var13, (SubLObject)module0252.$ic13$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var14.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var13, (SubLObject)module0252.$ic13$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var14.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var13, (SubLObject)module0252.$ic13$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var5));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var13, (SubLObject)module0252.$ic13$);
                        }
                    }
                    final SubLObject var7_38 = module0141.$g1710$.currentBinding(var5);
                    final SubLObject var8_39 = module0141.$g1677$.currentBinding(var5);
                    final SubLObject var9_39 = module0138.$g1619$.currentBinding(var5);
                    try {
                        module0141.$g1710$.bind(module0252.$ic14$, var5);
                        module0141.$g1677$.bind(module0141.f9208(), var5);
                        module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var5);
                        final SubLObject var15 = module0139.f9036();
                        final SubLObject var7_39 = module0139.$g1635$.currentBinding(var5);
                        try {
                            module0139.$g1635$.bind((var15 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var5) : module0139.f9038(var15), var5);
                            final SubLObject var7_40 = module0139.$g1636$.currentBinding(var5);
                            try {
                                module0139.$g1636$.bind((var15 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var5) : module0139.f9038(var15), var5);
                                final SubLObject var7_41 = module0141.$g1685$.currentBinding(var5);
                                final SubLObject var8_40 = module0141.$g1686$.currentBinding(var5);
                                final SubLObject var9_40 = module0141.$g1683$.currentBinding(var5);
                                final SubLObject var10_50 = module0141.$g1684$.currentBinding(var5);
                                final SubLObject var11_51 = module0141.$g1674$.currentBinding(var5);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var5);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var5);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var5);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var5);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var5);
                                    final SubLObject var16 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var17 = (SubLObject)module0252.NIL;
                                    try {
                                        var17 = ReadWriteLocks.rw_lock_seize_read_lock(var16);
                                        final SubLObject var7_42 = module0141.$g1665$.currentBinding(var5);
                                        final SubLObject var8_41 = module0139.$g1648$.currentBinding(var5);
                                        final SubLObject var9_41 = module0141.$g1693$.currentBinding(var5);
                                        try {
                                            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var5);
                                            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var5)), var5);
                                            module0141.$g1693$.bind((SubLObject)module0252.$ic11$, var5);
                                            var6 = f16246(var2);
                                        }
                                        finally {
                                            module0141.$g1693$.rebind(var9_41, var5);
                                            module0139.$g1648$.rebind(var8_41, var5);
                                            module0141.$g1665$.rebind(var7_42, var5);
                                        }
                                    }
                                    finally {
                                        if (module0252.NIL != var17) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var16);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_51, var5);
                                    module0141.$g1684$.rebind(var10_50, var5);
                                    module0141.$g1683$.rebind(var9_40, var5);
                                    module0141.$g1686$.rebind(var8_40, var5);
                                    module0141.$g1685$.rebind(var7_41, var5);
                                }
                                if (var15 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var5));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_40, var5);
                            }
                            if (var15 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var5));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_39, var5);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_39, var5);
                        module0141.$g1677$.rebind(var8_39, var5);
                        module0141.$g1710$.rebind(var7_38, var5);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_38, var5);
                    module0141.$g1714$.rebind(var7_37, var5);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_38, var5);
                module0147.$g2094$.rebind(var8_37, var5);
                module0147.$g2095$.rebind(var7_36, var5);
            }
        }
        finally {
            module0137.$g1605$.rebind(var11, var5);
            module0141.$g1674$.rebind(var10, var5);
            module0141.$g1672$.rebind(var9, var5);
            module0141.$g1671$.rebind(var8, var5);
            module0141.$g1670$.rebind(var7, var5);
        }
        return var6;
    }
    
    public static SubLObject f16248(final SubLObject var1, final SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var5 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        SubLObject var6 = (SubLObject)module0252.NIL;
        final SubLObject var7 = module0141.$g1670$.currentBinding(var5);
        final SubLObject var8 = module0141.$g1671$.currentBinding(var5);
        final SubLObject var9 = module0141.$g1672$.currentBinding(var5);
        final SubLObject var10 = module0141.$g1674$.currentBinding(var5);
        final SubLObject var11 = module0137.$g1605$.currentBinding(var5);
        try {
            module0141.$g1670$.bind(var1, var5);
            module0141.$g1671$.bind(module0244.f15739(var1), var5);
            module0141.$g1672$.bind(module0244.f15746(var1), var5);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var5);
            module0137.$g1605$.bind(var1, var5);
            final SubLObject var12 = var3;
            final SubLObject var7_55 = module0147.$g2095$.currentBinding(var5);
            final SubLObject var8_56 = module0147.$g2094$.currentBinding(var5);
            final SubLObject var9_57 = module0147.$g2096$.currentBinding(var5);
            try {
                module0147.$g2095$.bind(module0147.f9545(var12), var5);
                module0147.$g2094$.bind(module0147.f9546(var12), var5);
                module0147.$g2096$.bind(module0147.f9549(var12), var5);
                final SubLObject var13 = var4;
                final SubLObject var7_56 = module0141.$g1714$.currentBinding(var5);
                final SubLObject var8_57 = module0141.$g1715$.currentBinding(var5);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var13) ? var13 : module0141.f9283(), var5);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var13) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var5)), var5);
                    if (module0252.NIL != var13 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var13)) {
                        final SubLObject var14 = module0136.$g1591$.getDynamicValue(var5);
                        if (var14.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var13, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var14.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var13, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var14.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var13, (SubLObject)module0252.$ic4$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var5));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var13, (SubLObject)module0252.$ic4$);
                        }
                    }
                    final SubLObject var7_57 = module0141.$g1710$.currentBinding(var5);
                    final SubLObject var8_58 = module0141.$g1677$.currentBinding(var5);
                    final SubLObject var9_58 = module0138.$g1619$.currentBinding(var5);
                    try {
                        module0141.$g1710$.bind(module0252.$ic9$, var5);
                        module0141.$g1677$.bind(module0141.f9210(), var5);
                        module0138.$g1619$.bind(module0244.f15780(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var5);
                        final SubLObject var15 = module0139.f9036();
                        final SubLObject var7_58 = module0139.$g1635$.currentBinding(var5);
                        try {
                            module0139.$g1635$.bind((var15 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var5) : module0139.f9038(var15), var5);
                            final SubLObject var7_59 = module0139.$g1636$.currentBinding(var5);
                            try {
                                module0139.$g1636$.bind((var15 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var5) : module0139.f9038(var15), var5);
                                final SubLObject var7_60 = module0141.$g1685$.currentBinding(var5);
                                final SubLObject var8_59 = module0141.$g1686$.currentBinding(var5);
                                final SubLObject var9_59 = module0141.$g1683$.currentBinding(var5);
                                final SubLObject var10_68 = module0141.$g1684$.currentBinding(var5);
                                final SubLObject var11_69 = module0141.$g1674$.currentBinding(var5);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var5);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var5);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var5);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var5);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var5);
                                    final SubLObject var16 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var17 = (SubLObject)module0252.NIL;
                                    try {
                                        var17 = ReadWriteLocks.rw_lock_seize_read_lock(var16);
                                        final SubLObject var7_61 = module0141.$g1665$.currentBinding(var5);
                                        final SubLObject var8_60 = module0139.$g1648$.currentBinding(var5);
                                        final SubLObject var9_60 = module0141.$g1693$.currentBinding(var5);
                                        try {
                                            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var5);
                                            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var5)), var5);
                                            module0141.$g1693$.bind((SubLObject)module0252.$ic11$, var5);
                                            var6 = f16246(var2);
                                        }
                                        finally {
                                            module0141.$g1693$.rebind(var9_60, var5);
                                            module0139.$g1648$.rebind(var8_60, var5);
                                            module0141.$g1665$.rebind(var7_61, var5);
                                        }
                                    }
                                    finally {
                                        if (module0252.NIL != var17) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var16);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_69, var5);
                                    module0141.$g1684$.rebind(var10_68, var5);
                                    module0141.$g1683$.rebind(var9_59, var5);
                                    module0141.$g1686$.rebind(var8_59, var5);
                                    module0141.$g1685$.rebind(var7_60, var5);
                                }
                                if (var15 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var5));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_59, var5);
                            }
                            if (var15 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var5));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_58, var5);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_58, var5);
                        module0141.$g1677$.rebind(var8_58, var5);
                        module0141.$g1710$.rebind(var7_57, var5);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_57, var5);
                    module0141.$g1714$.rebind(var7_56, var5);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_57, var5);
                module0147.$g2094$.rebind(var8_56, var5);
                module0147.$g2095$.rebind(var7_55, var5);
            }
        }
        finally {
            module0137.$g1605$.rebind(var11, var5);
            module0141.$g1674$.rebind(var10, var5);
            module0141.$g1672$.rebind(var9, var5);
            module0141.$g1671$.rebind(var8, var5);
            module0141.$g1670$.rebind(var7, var5);
        }
        return var6;
    }
    
    public static SubLObject f16249(final SubLObject var1, final SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var5 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        SubLObject var6 = (SubLObject)module0252.NIL;
        final SubLObject var7 = module0141.$g1670$.currentBinding(var5);
        final SubLObject var8 = module0141.$g1671$.currentBinding(var5);
        final SubLObject var9 = module0141.$g1672$.currentBinding(var5);
        final SubLObject var10 = module0141.$g1674$.currentBinding(var5);
        final SubLObject var11 = module0137.$g1605$.currentBinding(var5);
        try {
            module0141.$g1670$.bind(var1, var5);
            module0141.$g1671$.bind(module0244.f15739(var1), var5);
            module0141.$g1672$.bind(module0244.f15746(var1), var5);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var5);
            module0137.$g1605$.bind(var1, var5);
            final SubLObject var12 = var3;
            final SubLObject var7_73 = module0147.$g2095$.currentBinding(var5);
            final SubLObject var8_74 = module0147.$g2094$.currentBinding(var5);
            final SubLObject var9_75 = module0147.$g2096$.currentBinding(var5);
            try {
                module0147.$g2095$.bind(module0147.f9545(var12), var5);
                module0147.$g2094$.bind(module0147.f9546(var12), var5);
                module0147.$g2096$.bind(module0147.f9549(var12), var5);
                final SubLObject var13 = var4;
                final SubLObject var7_74 = module0141.$g1714$.currentBinding(var5);
                final SubLObject var8_75 = module0141.$g1715$.currentBinding(var5);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var13) ? var13 : module0141.f9284(), var5);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var13) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var5)), var5);
                    if (module0252.NIL != var13 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9281(var13)) {
                        final SubLObject var14 = module0136.$g1591$.getDynamicValue(var5);
                        if (var14.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var13, (SubLObject)module0252.$ic13$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var14.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var13, (SubLObject)module0252.$ic13$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var14.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var13, (SubLObject)module0252.$ic13$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var5));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var13, (SubLObject)module0252.$ic13$);
                        }
                    }
                    final SubLObject var7_75 = module0141.$g1710$.currentBinding(var5);
                    final SubLObject var8_76 = module0141.$g1677$.currentBinding(var5);
                    final SubLObject var9_76 = module0138.$g1619$.currentBinding(var5);
                    try {
                        module0141.$g1710$.bind(module0252.$ic14$, var5);
                        module0141.$g1677$.bind(module0141.f9210(), var5);
                        module0138.$g1619$.bind(module0244.f15780(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var5);
                        final SubLObject var15 = module0139.f9036();
                        final SubLObject var7_76 = module0139.$g1635$.currentBinding(var5);
                        try {
                            module0139.$g1635$.bind((var15 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var5) : module0139.f9038(var15), var5);
                            final SubLObject var7_77 = module0139.$g1636$.currentBinding(var5);
                            try {
                                module0139.$g1636$.bind((var15 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var5) : module0139.f9038(var15), var5);
                                final SubLObject var7_78 = module0141.$g1685$.currentBinding(var5);
                                final SubLObject var8_77 = module0141.$g1686$.currentBinding(var5);
                                final SubLObject var9_77 = module0141.$g1683$.currentBinding(var5);
                                final SubLObject var10_86 = module0141.$g1684$.currentBinding(var5);
                                final SubLObject var11_87 = module0141.$g1674$.currentBinding(var5);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var5);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var5);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var5);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var5);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var5);
                                    final SubLObject var16 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var17 = (SubLObject)module0252.NIL;
                                    try {
                                        var17 = ReadWriteLocks.rw_lock_seize_read_lock(var16);
                                        final SubLObject var7_79 = module0141.$g1665$.currentBinding(var5);
                                        final SubLObject var8_78 = module0139.$g1648$.currentBinding(var5);
                                        final SubLObject var9_78 = module0141.$g1693$.currentBinding(var5);
                                        try {
                                            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var5);
                                            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var5)), var5);
                                            module0141.$g1693$.bind((SubLObject)module0252.$ic11$, var5);
                                            var6 = f16246(var2);
                                        }
                                        finally {
                                            module0141.$g1693$.rebind(var9_78, var5);
                                            module0139.$g1648$.rebind(var8_78, var5);
                                            module0141.$g1665$.rebind(var7_79, var5);
                                        }
                                    }
                                    finally {
                                        if (module0252.NIL != var17) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var16);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_87, var5);
                                    module0141.$g1684$.rebind(var10_86, var5);
                                    module0141.$g1683$.rebind(var9_77, var5);
                                    module0141.$g1686$.rebind(var8_77, var5);
                                    module0141.$g1685$.rebind(var7_78, var5);
                                }
                                if (var15 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var5));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_77, var5);
                            }
                            if (var15 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var5));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_76, var5);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_76, var5);
                        module0141.$g1677$.rebind(var8_76, var5);
                        module0141.$g1710$.rebind(var7_75, var5);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_75, var5);
                    module0141.$g1714$.rebind(var7_74, var5);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_75, var5);
                module0147.$g2094$.rebind(var8_74, var5);
                module0147.$g2095$.rebind(var7_73, var5);
            }
        }
        finally {
            module0137.$g1605$.rebind(var11, var5);
            module0141.$g1674$.rebind(var10, var5);
            module0141.$g1672$.rebind(var9, var5);
            module0141.$g1671$.rebind(var8, var5);
            module0141.$g1670$.rebind(var7, var5);
        }
        return var6;
    }
    
    public static SubLObject f16246(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)module0252.NIL;
        final SubLObject var5 = module0141.$g1691$.currentBinding(var3);
        try {
            module0141.$g1691$.bind((SubLObject)module0252.NIL, var3);
            try {
                if (module0252.NIL != module0136.f8865() || module0252.NIL != module0244.f15795(var2, module0137.f8955((SubLObject)module0252.UNPROVIDED))) {
                    final SubLObject var7_91 = module0141.$g1669$.currentBinding(var3);
                    try {
                        module0141.$g1669$.bind((SubLObject)module0252.NIL, var3);
                        module0250.f16162(module0141.f9171(), var2);
                    }
                    finally {
                        module0141.$g1669$.rebind(var7_91, var3);
                    }
                }
                else {
                    module0136.f8872((SubLObject)module0252.TWO_INTEGER, (SubLObject)module0252.$ic15$, var2, module0244.f15748(module0137.f8955((SubLObject)module0252.UNPROVIDED)), (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                }
            }
            finally {
                final SubLObject var7_92 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0252.T, var3);
                    var4 = module0141.$g1691$.getDynamicValue(var3);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var7_92, var3);
                }
            }
        }
        finally {
            module0141.$g1691$.rebind(var5, var3);
        }
        return var4;
    }
    
    public static SubLObject f16250(final SubLObject var1, final SubLObject var2, final SubLObject var93, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var94 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        SubLObject var95 = (SubLObject)module0252.NIL;
        final SubLObject var96 = module0141.$g1670$.currentBinding(var94);
        final SubLObject var97 = module0141.$g1671$.currentBinding(var94);
        final SubLObject var98 = module0141.$g1672$.currentBinding(var94);
        final SubLObject var99 = module0141.$g1674$.currentBinding(var94);
        final SubLObject var100 = module0137.$g1605$.currentBinding(var94);
        try {
            module0141.$g1670$.bind(var1, var94);
            module0141.$g1671$.bind(module0244.f15739(var1), var94);
            module0141.$g1672$.bind(module0244.f15746(var1), var94);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var94);
            module0137.$g1605$.bind(var1, var94);
            final SubLObject var101 = var3;
            final SubLObject var7_94 = module0147.$g2095$.currentBinding(var94);
            final SubLObject var8_95 = module0147.$g2094$.currentBinding(var94);
            final SubLObject var9_96 = module0147.$g2096$.currentBinding(var94);
            try {
                module0147.$g2095$.bind(module0147.f9545(var101), var94);
                module0147.$g2094$.bind(module0147.f9546(var101), var94);
                module0147.$g2096$.bind(module0147.f9549(var101), var94);
                final SubLObject var102 = var4;
                final SubLObject var7_95 = module0141.$g1714$.currentBinding(var94);
                final SubLObject var8_96 = module0141.$g1715$.currentBinding(var94);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var102) ? var102 : module0141.f9283(), var94);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var102) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var94)), var94);
                    if (module0252.NIL != var102 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var102)) {
                        final SubLObject var103 = module0136.$g1591$.getDynamicValue(var94);
                        if (var103.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var102, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var103.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var102, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var103.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var102, (SubLObject)module0252.$ic4$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var94));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var102, (SubLObject)module0252.$ic4$);
                        }
                    }
                    final SubLObject var7_96 = module0141.$g1710$.currentBinding(var94);
                    final SubLObject var8_97 = module0141.$g1677$.currentBinding(var94);
                    final SubLObject var9_97 = module0138.$g1619$.currentBinding(var94);
                    try {
                        module0141.$g1710$.bind(module0252.$ic9$, var94);
                        module0141.$g1677$.bind(module0141.f9208(), var94);
                        module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var94);
                        final SubLObject var104 = module0139.f9036();
                        final SubLObject var7_97 = module0139.$g1635$.currentBinding(var94);
                        try {
                            module0139.$g1635$.bind((var104 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var94) : module0139.f9038(var104), var94);
                            final SubLObject var7_98 = module0139.$g1636$.currentBinding(var94);
                            try {
                                module0139.$g1636$.bind((var104 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var94) : module0139.f9038(var104), var94);
                                final SubLObject var7_99 = module0141.$g1685$.currentBinding(var94);
                                final SubLObject var8_98 = module0141.$g1686$.currentBinding(var94);
                                final SubLObject var9_98 = module0141.$g1683$.currentBinding(var94);
                                final SubLObject var10_107 = module0141.$g1684$.currentBinding(var94);
                                final SubLObject var11_108 = module0141.$g1674$.currentBinding(var94);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var94);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var94);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var94);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var94);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var94);
                                    final SubLObject var105 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var106 = (SubLObject)module0252.NIL;
                                    try {
                                        var106 = ReadWriteLocks.rw_lock_seize_read_lock(var105);
                                        final SubLObject var7_100 = module0141.$g1665$.currentBinding(var94);
                                        final SubLObject var8_99 = module0139.$g1648$.currentBinding(var94);
                                        final SubLObject var9_99 = module0141.$g1694$.currentBinding(var94);
                                        final SubLObject var10_108 = module0141.$g1693$.currentBinding(var94);
                                        try {
                                            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var94);
                                            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var94)), var94);
                                            module0141.$g1694$.bind(var93, var94);
                                            module0141.$g1693$.bind((SubLObject)module0252.$ic16$, var94);
                                            var95 = f16246(var2);
                                        }
                                        finally {
                                            module0141.$g1693$.rebind(var10_108, var94);
                                            module0141.$g1694$.rebind(var9_99, var94);
                                            module0139.$g1648$.rebind(var8_99, var94);
                                            module0141.$g1665$.rebind(var7_100, var94);
                                        }
                                    }
                                    finally {
                                        if (module0252.NIL != var106) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var105);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_108, var94);
                                    module0141.$g1684$.rebind(var10_107, var94);
                                    module0141.$g1683$.rebind(var9_98, var94);
                                    module0141.$g1686$.rebind(var8_98, var94);
                                    module0141.$g1685$.rebind(var7_99, var94);
                                }
                                if (var104 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var94));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_98, var94);
                            }
                            if (var104 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var94));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_97, var94);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_97, var94);
                        module0141.$g1677$.rebind(var8_97, var94);
                        module0141.$g1710$.rebind(var7_96, var94);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_96, var94);
                    module0141.$g1714$.rebind(var7_95, var94);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_96, var94);
                module0147.$g2094$.rebind(var8_95, var94);
                module0147.$g2095$.rebind(var7_94, var94);
            }
        }
        finally {
            module0137.$g1605$.rebind(var100, var94);
            module0141.$g1674$.rebind(var99, var94);
            module0141.$g1672$.rebind(var98, var94);
            module0141.$g1671$.rebind(var97, var94);
            module0141.$g1670$.rebind(var96, var94);
        }
        return var95;
    }
    
    public static SubLObject f16251(final SubLObject var1, final SubLObject var2, final SubLObject var93, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var94 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        SubLObject var95 = (SubLObject)module0252.NIL;
        final SubLObject var96 = module0141.$g1670$.currentBinding(var94);
        final SubLObject var97 = module0141.$g1671$.currentBinding(var94);
        final SubLObject var98 = module0141.$g1672$.currentBinding(var94);
        final SubLObject var99 = module0141.$g1674$.currentBinding(var94);
        final SubLObject var100 = module0137.$g1605$.currentBinding(var94);
        try {
            module0141.$g1670$.bind(var1, var94);
            module0141.$g1671$.bind(module0244.f15739(var1), var94);
            module0141.$g1672$.bind(module0244.f15746(var1), var94);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var94);
            module0137.$g1605$.bind(var1, var94);
            final SubLObject var101 = var3;
            final SubLObject var7_113 = module0147.$g2095$.currentBinding(var94);
            final SubLObject var8_114 = module0147.$g2094$.currentBinding(var94);
            final SubLObject var9_115 = module0147.$g2096$.currentBinding(var94);
            try {
                module0147.$g2095$.bind(module0147.f9545(var101), var94);
                module0147.$g2094$.bind(module0147.f9546(var101), var94);
                module0147.$g2096$.bind(module0147.f9549(var101), var94);
                final SubLObject var102 = var4;
                final SubLObject var7_114 = module0141.$g1714$.currentBinding(var94);
                final SubLObject var8_115 = module0141.$g1715$.currentBinding(var94);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var102) ? var102 : module0141.f9283(), var94);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var102) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var94)), var94);
                    if (module0252.NIL != var102 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var102)) {
                        final SubLObject var103 = module0136.$g1591$.getDynamicValue(var94);
                        if (var103.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var102, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var103.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var102, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var103.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var102, (SubLObject)module0252.$ic4$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var94));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var102, (SubLObject)module0252.$ic4$);
                        }
                    }
                    final SubLObject var7_115 = module0141.$g1710$.currentBinding(var94);
                    final SubLObject var8_116 = module0141.$g1677$.currentBinding(var94);
                    final SubLObject var9_116 = module0138.$g1619$.currentBinding(var94);
                    try {
                        module0141.$g1710$.bind(module0252.$ic9$, var94);
                        module0141.$g1677$.bind(module0141.f9210(), var94);
                        module0138.$g1619$.bind(module0244.f15780(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var94);
                        final SubLObject var104 = module0139.f9036();
                        final SubLObject var7_116 = module0139.$g1635$.currentBinding(var94);
                        try {
                            module0139.$g1635$.bind((var104 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var94) : module0139.f9038(var104), var94);
                            final SubLObject var7_117 = module0139.$g1636$.currentBinding(var94);
                            try {
                                module0139.$g1636$.bind((var104 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var94) : module0139.f9038(var104), var94);
                                final SubLObject var7_118 = module0141.$g1685$.currentBinding(var94);
                                final SubLObject var8_117 = module0141.$g1686$.currentBinding(var94);
                                final SubLObject var9_117 = module0141.$g1683$.currentBinding(var94);
                                final SubLObject var10_126 = module0141.$g1684$.currentBinding(var94);
                                final SubLObject var11_127 = module0141.$g1674$.currentBinding(var94);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var94);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var94);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var94);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var94);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var94);
                                    final SubLObject var105 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var106 = (SubLObject)module0252.NIL;
                                    try {
                                        var106 = ReadWriteLocks.rw_lock_seize_read_lock(var105);
                                        final SubLObject var7_119 = module0141.$g1665$.currentBinding(var94);
                                        final SubLObject var8_118 = module0139.$g1648$.currentBinding(var94);
                                        final SubLObject var9_118 = module0141.$g1694$.currentBinding(var94);
                                        final SubLObject var10_127 = module0141.$g1693$.currentBinding(var94);
                                        try {
                                            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var94);
                                            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var94)), var94);
                                            module0141.$g1694$.bind(var93, var94);
                                            module0141.$g1693$.bind((SubLObject)module0252.$ic16$, var94);
                                            var95 = f16246(var2);
                                        }
                                        finally {
                                            module0141.$g1693$.rebind(var10_127, var94);
                                            module0141.$g1694$.rebind(var9_118, var94);
                                            module0139.$g1648$.rebind(var8_118, var94);
                                            module0141.$g1665$.rebind(var7_119, var94);
                                        }
                                    }
                                    finally {
                                        if (module0252.NIL != var106) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var105);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_127, var94);
                                    module0141.$g1684$.rebind(var10_126, var94);
                                    module0141.$g1683$.rebind(var9_117, var94);
                                    module0141.$g1686$.rebind(var8_117, var94);
                                    module0141.$g1685$.rebind(var7_118, var94);
                                }
                                if (var104 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var94));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_117, var94);
                            }
                            if (var104 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var94));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_116, var94);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_116, var94);
                        module0141.$g1677$.rebind(var8_116, var94);
                        module0141.$g1710$.rebind(var7_115, var94);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_115, var94);
                    module0141.$g1714$.rebind(var7_114, var94);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_115, var94);
                module0147.$g2094$.rebind(var8_114, var94);
                module0147.$g2095$.rebind(var7_113, var94);
            }
        }
        finally {
            module0137.$g1605$.rebind(var100, var94);
            module0141.$g1674$.rebind(var99, var94);
            module0141.$g1672$.rebind(var98, var94);
            module0141.$g1671$.rebind(var97, var94);
            module0141.$g1670$.rebind(var96, var94);
        }
        return var95;
    }
    
    public static SubLObject f16252(final SubLObject var1, final SubLObject var132, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var133 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        SubLObject var134 = (SubLObject)module0252.NIL;
        final SubLObject var135 = module0141.$g1670$.currentBinding(var133);
        final SubLObject var136 = module0141.$g1671$.currentBinding(var133);
        final SubLObject var137 = module0141.$g1672$.currentBinding(var133);
        final SubLObject var138 = module0141.$g1674$.currentBinding(var133);
        final SubLObject var139 = module0137.$g1605$.currentBinding(var133);
        try {
            module0141.$g1670$.bind(var1, var133);
            module0141.$g1671$.bind(module0244.f15739(var1), var133);
            module0141.$g1672$.bind(module0244.f15746(var1), var133);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var133);
            module0137.$g1605$.bind(var1, var133);
            final SubLObject var140 = var3;
            final SubLObject var7_133 = module0147.$g2095$.currentBinding(var133);
            final SubLObject var8_134 = module0147.$g2094$.currentBinding(var133);
            final SubLObject var9_135 = module0147.$g2096$.currentBinding(var133);
            try {
                module0147.$g2095$.bind(module0147.f9545(var140), var133);
                module0147.$g2094$.bind(module0147.f9546(var140), var133);
                module0147.$g2096$.bind(module0147.f9549(var140), var133);
                final SubLObject var141 = var4;
                final SubLObject var7_134 = module0141.$g1714$.currentBinding(var133);
                final SubLObject var8_135 = module0141.$g1715$.currentBinding(var133);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var141) ? var141 : module0141.f9283(), var133);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var141) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var133)), var133);
                    if (module0252.NIL != var141 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var141)) {
                        final SubLObject var142 = module0136.$g1591$.getDynamicValue(var133);
                        if (var142.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var141, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var142.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var141, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var142.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var141, (SubLObject)module0252.$ic4$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var133));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var141, (SubLObject)module0252.$ic4$);
                        }
                    }
                    final SubLObject var7_135 = module0141.$g1710$.currentBinding(var133);
                    final SubLObject var8_136 = module0141.$g1677$.currentBinding(var133);
                    final SubLObject var9_136 = module0138.$g1619$.currentBinding(var133);
                    try {
                        module0141.$g1710$.bind(module0252.$ic9$, var133);
                        module0141.$g1677$.bind(module0141.f9208(), var133);
                        module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var133);
                        final SubLObject var143 = module0139.f9036();
                        final SubLObject var7_136 = module0139.$g1635$.currentBinding(var133);
                        try {
                            module0139.$g1635$.bind((var143 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var133) : module0139.f9038(var143), var133);
                            final SubLObject var7_137 = module0139.$g1636$.currentBinding(var133);
                            try {
                                module0139.$g1636$.bind((var143 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var133) : module0139.f9038(var143), var133);
                                final SubLObject var7_138 = module0141.$g1685$.currentBinding(var133);
                                final SubLObject var8_137 = module0141.$g1686$.currentBinding(var133);
                                final SubLObject var9_137 = module0141.$g1683$.currentBinding(var133);
                                final SubLObject var10_146 = module0141.$g1684$.currentBinding(var133);
                                final SubLObject var11_147 = module0141.$g1674$.currentBinding(var133);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var133);
                                    final SubLObject var144 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var145 = (SubLObject)module0252.NIL;
                                    try {
                                        var145 = ReadWriteLocks.rw_lock_seize_read_lock(var144);
                                        final SubLObject var7_139 = module0141.$g1665$.currentBinding(var133);
                                        final SubLObject var8_138 = module0139.$g1648$.currentBinding(var133);
                                        final SubLObject var9_138 = module0141.$g1693$.currentBinding(var133);
                                        try {
                                            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var133);
                                            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var133)), var133);
                                            module0141.$g1693$.bind((SubLObject)module0252.$ic11$, var133);
                                            var134 = f16253(var132);
                                        }
                                        finally {
                                            module0141.$g1693$.rebind(var9_138, var133);
                                            module0139.$g1648$.rebind(var8_138, var133);
                                            module0141.$g1665$.rebind(var7_139, var133);
                                        }
                                    }
                                    finally {
                                        if (module0252.NIL != var145) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var144);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_147, var133);
                                    module0141.$g1684$.rebind(var10_146, var133);
                                    module0141.$g1683$.rebind(var9_137, var133);
                                    module0141.$g1686$.rebind(var8_137, var133);
                                    module0141.$g1685$.rebind(var7_138, var133);
                                }
                                if (var143 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var133));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_137, var133);
                            }
                            if (var143 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var133));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_136, var133);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_136, var133);
                        module0141.$g1677$.rebind(var8_136, var133);
                        module0141.$g1710$.rebind(var7_135, var133);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_135, var133);
                    module0141.$g1714$.rebind(var7_134, var133);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_135, var133);
                module0147.$g2094$.rebind(var8_134, var133);
                module0147.$g2095$.rebind(var7_133, var133);
            }
        }
        finally {
            module0137.$g1605$.rebind(var139, var133);
            module0141.$g1674$.rebind(var138, var133);
            module0141.$g1672$.rebind(var137, var133);
            module0141.$g1671$.rebind(var136, var133);
            module0141.$g1670$.rebind(var135, var133);
        }
        return var134;
    }
    
    public static SubLObject f16254(final SubLObject var1, final SubLObject var132, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var133 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        SubLObject var134 = (SubLObject)module0252.NIL;
        final SubLObject var135 = module0141.$g1670$.currentBinding(var133);
        final SubLObject var136 = module0141.$g1671$.currentBinding(var133);
        final SubLObject var137 = module0141.$g1672$.currentBinding(var133);
        final SubLObject var138 = module0141.$g1674$.currentBinding(var133);
        final SubLObject var139 = module0137.$g1605$.currentBinding(var133);
        try {
            module0141.$g1670$.bind(var1, var133);
            module0141.$g1671$.bind(module0244.f15739(var1), var133);
            module0141.$g1672$.bind(module0244.f15746(var1), var133);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var133);
            module0137.$g1605$.bind(var1, var133);
            final SubLObject var140 = var3;
            final SubLObject var7_151 = module0147.$g2095$.currentBinding(var133);
            final SubLObject var8_152 = module0147.$g2094$.currentBinding(var133);
            final SubLObject var9_153 = module0147.$g2096$.currentBinding(var133);
            try {
                module0147.$g2095$.bind(module0147.f9545(var140), var133);
                module0147.$g2094$.bind(module0147.f9546(var140), var133);
                module0147.$g2096$.bind(module0147.f9549(var140), var133);
                final SubLObject var141 = var4;
                final SubLObject var7_152 = module0141.$g1714$.currentBinding(var133);
                final SubLObject var8_153 = module0141.$g1715$.currentBinding(var133);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var141) ? var141 : module0141.f9283(), var133);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var141) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var133)), var133);
                    if (module0252.NIL != var141 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var141)) {
                        final SubLObject var142 = module0136.$g1591$.getDynamicValue(var133);
                        if (var142.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var141, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var142.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var141, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var142.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var141, (SubLObject)module0252.$ic4$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var133));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var141, (SubLObject)module0252.$ic4$);
                        }
                    }
                    final SubLObject var7_153 = module0141.$g1710$.currentBinding(var133);
                    final SubLObject var8_154 = module0141.$g1677$.currentBinding(var133);
                    final SubLObject var9_154 = module0138.$g1619$.currentBinding(var133);
                    try {
                        module0141.$g1710$.bind(module0252.$ic9$, var133);
                        module0141.$g1677$.bind(module0141.f9210(), var133);
                        module0138.$g1619$.bind(module0244.f15780(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var133);
                        final SubLObject var143 = module0139.f9036();
                        final SubLObject var7_154 = module0139.$g1635$.currentBinding(var133);
                        try {
                            module0139.$g1635$.bind((var143 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var133) : module0139.f9038(var143), var133);
                            final SubLObject var7_155 = module0139.$g1636$.currentBinding(var133);
                            try {
                                module0139.$g1636$.bind((var143 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var133) : module0139.f9038(var143), var133);
                                final SubLObject var7_156 = module0141.$g1685$.currentBinding(var133);
                                final SubLObject var8_155 = module0141.$g1686$.currentBinding(var133);
                                final SubLObject var9_155 = module0141.$g1683$.currentBinding(var133);
                                final SubLObject var10_164 = module0141.$g1684$.currentBinding(var133);
                                final SubLObject var11_165 = module0141.$g1674$.currentBinding(var133);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var133);
                                    final SubLObject var144 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var145 = (SubLObject)module0252.NIL;
                                    try {
                                        var145 = ReadWriteLocks.rw_lock_seize_read_lock(var144);
                                        final SubLObject var7_157 = module0141.$g1665$.currentBinding(var133);
                                        final SubLObject var8_156 = module0139.$g1648$.currentBinding(var133);
                                        final SubLObject var9_156 = module0141.$g1693$.currentBinding(var133);
                                        try {
                                            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var133);
                                            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var133)), var133);
                                            module0141.$g1693$.bind((SubLObject)module0252.$ic11$, var133);
                                            var134 = f16253(var132);
                                        }
                                        finally {
                                            module0141.$g1693$.rebind(var9_156, var133);
                                            module0139.$g1648$.rebind(var8_156, var133);
                                            module0141.$g1665$.rebind(var7_157, var133);
                                        }
                                    }
                                    finally {
                                        if (module0252.NIL != var145) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var144);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_165, var133);
                                    module0141.$g1684$.rebind(var10_164, var133);
                                    module0141.$g1683$.rebind(var9_155, var133);
                                    module0141.$g1686$.rebind(var8_155, var133);
                                    module0141.$g1685$.rebind(var7_156, var133);
                                }
                                if (var143 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var133));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_155, var133);
                            }
                            if (var143 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var133));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_154, var133);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_154, var133);
                        module0141.$g1677$.rebind(var8_154, var133);
                        module0141.$g1710$.rebind(var7_153, var133);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_153, var133);
                    module0141.$g1714$.rebind(var7_152, var133);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_153, var133);
                module0147.$g2094$.rebind(var8_152, var133);
                module0147.$g2095$.rebind(var7_151, var133);
            }
        }
        finally {
            module0137.$g1605$.rebind(var139, var133);
            module0141.$g1674$.rebind(var138, var133);
            module0141.$g1672$.rebind(var137, var133);
            module0141.$g1671$.rebind(var136, var133);
            module0141.$g1670$.rebind(var135, var133);
        }
        return var134;
    }
    
    public static SubLObject f16253(final SubLObject var132) {
        final SubLThread var133 = SubLProcess.currentSubLThread();
        final SubLObject var134 = module0141.f9171();
        SubLObject var135 = (SubLObject)module0252.NIL;
        final SubLObject var136 = module0141.$g1664$.currentBinding(var133);
        final SubLObject var137 = module0141.$g1691$.currentBinding(var133);
        try {
            module0141.$g1664$.bind((SubLObject)module0252.$ic17$, var133);
            module0141.$g1691$.bind((SubLObject)module0252.NIL, var133);
            try {
                SubLObject var138 = var132;
                SubLObject var139 = (SubLObject)module0252.NIL;
                var139 = var138.first();
                while (module0252.NIL != var138) {
                    if (module0252.NIL != module0136.f8865() || module0252.NIL != module0244.f15795(var139, module0137.f8955((SubLObject)module0252.UNPROVIDED))) {
                        final SubLObject var7_171 = module0141.$g1674$.currentBinding(var133);
                        final SubLObject var8_172 = module0141.$g1683$.currentBinding(var133);
                        try {
                            module0141.$g1674$.bind((SubLObject)module0252.NIL, var133);
                            module0141.$g1683$.bind((SubLObject)module0252.NIL, var133);
                            module0250.f16162(var134, var139);
                        }
                        finally {
                            module0141.$g1683$.rebind(var8_172, var133);
                            module0141.$g1674$.rebind(var7_171, var133);
                        }
                    }
                    else {
                        module0136.f8872((SubLObject)module0252.TWO_INTEGER, (SubLObject)module0252.$ic15$, var139, module0244.f15748(module0137.f8955((SubLObject)module0252.UNPROVIDED)), (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                    }
                    var138 = var138.rest();
                    var139 = var138.first();
                }
            }
            finally {
                final SubLObject var7_172 = Threads.$is_thread_performing_cleanupP$.currentBinding(var133);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0252.T, var133);
                    var135 = module0141.$g1691$.getDynamicValue(var133);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var7_172, var133);
                }
            }
        }
        finally {
            module0141.$g1691$.rebind(var137, var133);
            module0141.$g1664$.rebind(var136, var133);
        }
        return var135;
    }
    
    public static SubLObject f16255(final SubLObject var2) {
        if (module0252.NIL != module0248.f15924(var2)) {
            module0250.f16117(var2);
        }
        return (SubLObject)module0252.NIL;
    }
    
    public static SubLObject f16256(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)module0252.NIL;
        final SubLObject var5 = module0141.$g1693$.currentBinding(var3);
        final SubLObject var6 = module0141.$g1665$.currentBinding(var3);
        final SubLObject var7 = module0139.$g1648$.currentBinding(var3);
        try {
            module0141.$g1693$.bind((SubLObject)module0252.$ic18$, var3);
            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var3);
            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var3)), var3);
            var4 = f16246(var2);
        }
        finally {
            module0139.$g1648$.rebind(var7, var3);
            module0141.$g1665$.rebind(var6, var3);
            module0141.$g1693$.rebind(var5, var3);
        }
        return var4;
    }
    
    public static SubLObject f16257(final SubLObject var1, final SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)module0252.NIL;
        final SubLObject var7 = module0141.$g1670$.currentBinding(var5);
        final SubLObject var8 = module0141.$g1671$.currentBinding(var5);
        final SubLObject var9 = module0141.$g1672$.currentBinding(var5);
        final SubLObject var10 = module0141.$g1674$.currentBinding(var5);
        final SubLObject var11 = module0137.$g1605$.currentBinding(var5);
        try {
            module0141.$g1670$.bind(var1, var5);
            module0141.$g1671$.bind(module0244.f15739(var1), var5);
            module0141.$g1672$.bind(module0244.f15746(var1), var5);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var5);
            module0137.$g1605$.bind(var1, var5);
            final SubLObject var12 = var3;
            final SubLObject var7_174 = module0147.$g2095$.currentBinding(var5);
            final SubLObject var8_175 = module0147.$g2094$.currentBinding(var5);
            final SubLObject var9_176 = module0147.$g2096$.currentBinding(var5);
            try {
                module0147.$g2095$.bind(module0147.f9545(var12), var5);
                module0147.$g2094$.bind(module0147.f9546(var12), var5);
                module0147.$g2096$.bind(module0147.f9549(var12), var5);
                final SubLObject var13 = var4;
                final SubLObject var7_175 = module0141.$g1714$.currentBinding(var5);
                final SubLObject var8_176 = module0141.$g1715$.currentBinding(var5);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var13) ? var13 : module0141.f9283(), var5);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var13) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var5)), var5);
                    if (module0252.NIL != var13 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var13)) {
                        final SubLObject var14 = module0136.$g1591$.getDynamicValue(var5);
                        if (var14.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var13, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var14.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var13, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var14.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var13, (SubLObject)module0252.$ic4$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var5));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var13, (SubLObject)module0252.$ic4$);
                        }
                    }
                    final SubLObject var7_176 = module0141.$g1710$.currentBinding(var5);
                    final SubLObject var8_177 = module0141.$g1677$.currentBinding(var5);
                    final SubLObject var9_177 = module0138.$g1619$.currentBinding(var5);
                    try {
                        module0141.$g1710$.bind(module0252.$ic9$, var5);
                        module0141.$g1677$.bind(module0141.f9210(), var5);
                        module0138.$g1619$.bind(module0244.f15780(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var5);
                        final SubLObject var15 = module0139.f9036();
                        final SubLObject var7_177 = module0139.$g1635$.currentBinding(var5);
                        try {
                            module0139.$g1635$.bind((var15 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var5) : module0139.f9038(var15), var5);
                            final SubLObject var7_178 = module0139.$g1636$.currentBinding(var5);
                            try {
                                module0139.$g1636$.bind((var15 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var5) : module0139.f9038(var15), var5);
                                final SubLObject var7_179 = module0141.$g1685$.currentBinding(var5);
                                final SubLObject var8_178 = module0141.$g1686$.currentBinding(var5);
                                final SubLObject var9_178 = module0141.$g1683$.currentBinding(var5);
                                final SubLObject var10_187 = module0141.$g1684$.currentBinding(var5);
                                final SubLObject var11_188 = module0141.$g1674$.currentBinding(var5);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var5);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var5);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var5);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var5);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var5);
                                    final SubLObject var16 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var17 = (SubLObject)module0252.NIL;
                                    try {
                                        var17 = ReadWriteLocks.rw_lock_seize_read_lock(var16);
                                        var6 = f16256(var2);
                                    }
                                    finally {
                                        if (module0252.NIL != var17) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var16);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_188, var5);
                                    module0141.$g1684$.rebind(var10_187, var5);
                                    module0141.$g1683$.rebind(var9_178, var5);
                                    module0141.$g1686$.rebind(var8_178, var5);
                                    module0141.$g1685$.rebind(var7_179, var5);
                                }
                                if (var15 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var5));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_178, var5);
                            }
                            if (var15 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var5));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_177, var5);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_177, var5);
                        module0141.$g1677$.rebind(var8_177, var5);
                        module0141.$g1710$.rebind(var7_176, var5);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_176, var5);
                    module0141.$g1714$.rebind(var7_175, var5);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_176, var5);
                module0147.$g2094$.rebind(var8_175, var5);
                module0147.$g2095$.rebind(var7_174, var5);
            }
        }
        finally {
            module0137.$g1605$.rebind(var11, var5);
            module0141.$g1674$.rebind(var10, var5);
            module0141.$g1672$.rebind(var9, var5);
            module0141.$g1671$.rebind(var8, var5);
            module0141.$g1670$.rebind(var7, var5);
        }
        return var6;
    }
    
    public static SubLObject f16258(final SubLObject var1, final SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var5 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        SubLObject var6 = (SubLObject)module0252.NIL;
        final SubLObject var7 = module0141.$g1670$.currentBinding(var5);
        final SubLObject var8 = module0141.$g1671$.currentBinding(var5);
        final SubLObject var9 = module0141.$g1672$.currentBinding(var5);
        final SubLObject var10 = module0141.$g1674$.currentBinding(var5);
        final SubLObject var11 = module0137.$g1605$.currentBinding(var5);
        try {
            module0141.$g1670$.bind(var1, var5);
            module0141.$g1671$.bind(module0244.f15739(var1), var5);
            module0141.$g1672$.bind(module0244.f15746(var1), var5);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var5);
            module0137.$g1605$.bind(var1, var5);
            final SubLObject var12 = var3;
            final SubLObject var7_189 = module0147.$g2095$.currentBinding(var5);
            final SubLObject var8_190 = module0147.$g2094$.currentBinding(var5);
            final SubLObject var9_191 = module0147.$g2096$.currentBinding(var5);
            try {
                module0147.$g2095$.bind(module0147.f9545(var12), var5);
                module0147.$g2094$.bind(module0147.f9546(var12), var5);
                module0147.$g2096$.bind(module0147.f9549(var12), var5);
                final SubLObject var13 = var4;
                final SubLObject var7_190 = module0141.$g1714$.currentBinding(var5);
                final SubLObject var8_191 = module0141.$g1715$.currentBinding(var5);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var13) ? var13 : module0141.f9283(), var5);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var13) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var5)), var5);
                    if (module0252.NIL != var13 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var13)) {
                        final SubLObject var14 = module0136.$g1591$.getDynamicValue(var5);
                        if (var14.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var13, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var14.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var13, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var14.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var13, (SubLObject)module0252.$ic4$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var5));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var13, (SubLObject)module0252.$ic4$);
                        }
                    }
                    final SubLObject var7_191 = module0141.$g1710$.currentBinding(var5);
                    final SubLObject var8_192 = module0141.$g1677$.currentBinding(var5);
                    final SubLObject var9_192 = module0138.$g1619$.currentBinding(var5);
                    try {
                        module0141.$g1710$.bind(module0252.$ic9$, var5);
                        module0141.$g1677$.bind(module0141.f9208(), var5);
                        module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var5);
                        final SubLObject var15 = module0139.f9036();
                        final SubLObject var7_192 = module0139.$g1635$.currentBinding(var5);
                        try {
                            module0139.$g1635$.bind((var15 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var5) : module0139.f9038(var15), var5);
                            final SubLObject var7_193 = module0139.$g1636$.currentBinding(var5);
                            try {
                                module0139.$g1636$.bind((var15 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var5) : module0139.f9038(var15), var5);
                                final SubLObject var7_194 = module0141.$g1685$.currentBinding(var5);
                                final SubLObject var8_193 = module0141.$g1686$.currentBinding(var5);
                                final SubLObject var9_193 = module0141.$g1683$.currentBinding(var5);
                                final SubLObject var10_202 = module0141.$g1684$.currentBinding(var5);
                                final SubLObject var11_203 = module0141.$g1674$.currentBinding(var5);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var5);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var5);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var5);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var5);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var5);
                                    final SubLObject var16 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var17 = (SubLObject)module0252.NIL;
                                    try {
                                        var17 = ReadWriteLocks.rw_lock_seize_read_lock(var16);
                                        var6 = f16256(var2);
                                    }
                                    finally {
                                        if (module0252.NIL != var17) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var16);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_203, var5);
                                    module0141.$g1684$.rebind(var10_202, var5);
                                    module0141.$g1683$.rebind(var9_193, var5);
                                    module0141.$g1686$.rebind(var8_193, var5);
                                    module0141.$g1685$.rebind(var7_194, var5);
                                }
                                if (var15 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var5));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_193, var5);
                            }
                            if (var15 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var5));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_192, var5);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_192, var5);
                        module0141.$g1677$.rebind(var8_192, var5);
                        module0141.$g1710$.rebind(var7_191, var5);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_191, var5);
                    module0141.$g1714$.rebind(var7_190, var5);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_191, var5);
                module0147.$g2094$.rebind(var8_190, var5);
                module0147.$g2095$.rebind(var7_189, var5);
            }
        }
        finally {
            module0137.$g1605$.rebind(var11, var5);
            module0141.$g1674$.rebind(var10, var5);
            module0141.$g1672$.rebind(var9, var5);
            module0141.$g1671$.rebind(var8, var5);
            module0141.$g1670$.rebind(var7, var5);
        }
        return var6;
    }
    
    public static SubLObject f16259(final SubLObject var1, final SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var5 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        SubLObject var6 = (SubLObject)module0252.NIL;
        final SubLObject var7 = module0141.$g1670$.currentBinding(var5);
        final SubLObject var8 = module0141.$g1671$.currentBinding(var5);
        final SubLObject var9 = module0141.$g1672$.currentBinding(var5);
        final SubLObject var10 = module0141.$g1674$.currentBinding(var5);
        final SubLObject var11 = module0137.$g1605$.currentBinding(var5);
        try {
            module0141.$g1670$.bind(var1, var5);
            module0141.$g1671$.bind(module0244.f15739(var1), var5);
            module0141.$g1672$.bind(module0244.f15746(var1), var5);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var5);
            module0137.$g1605$.bind(var1, var5);
            final SubLObject var12 = var3;
            final SubLObject var7_204 = module0147.$g2095$.currentBinding(var5);
            final SubLObject var8_205 = module0147.$g2094$.currentBinding(var5);
            final SubLObject var9_206 = module0147.$g2096$.currentBinding(var5);
            try {
                module0147.$g2095$.bind(module0147.f9545(var12), var5);
                module0147.$g2094$.bind(module0147.f9546(var12), var5);
                module0147.$g2096$.bind(module0147.f9549(var12), var5);
                final SubLObject var13 = var4;
                final SubLObject var7_205 = module0141.$g1714$.currentBinding(var5);
                final SubLObject var8_206 = module0141.$g1715$.currentBinding(var5);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var13) ? var13 : module0141.f9283(), var5);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var13) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var5)), var5);
                    if (module0252.NIL != var13 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var13)) {
                        final SubLObject var14 = module0136.$g1591$.getDynamicValue(var5);
                        if (var14.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var13, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var14.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var13, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var14.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var13, (SubLObject)module0252.$ic4$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var5));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var13, (SubLObject)module0252.$ic4$);
                        }
                    }
                    final SubLObject var7_206 = module0141.$g1710$.currentBinding(var5);
                    final SubLObject var8_207 = module0141.$g1677$.currentBinding(var5);
                    final SubLObject var9_207 = module0138.$g1619$.currentBinding(var5);
                    try {
                        module0141.$g1710$.bind(module0252.$ic9$, var5);
                        module0141.$g1677$.bind(module0141.f9208(), var5);
                        module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var5);
                        final SubLObject var15 = module0139.f9036();
                        final SubLObject var7_207 = module0139.$g1635$.currentBinding(var5);
                        try {
                            module0139.$g1635$.bind((var15 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var5) : module0139.f9038(var15), var5);
                            final SubLObject var7_208 = module0139.$g1636$.currentBinding(var5);
                            try {
                                module0139.$g1636$.bind((var15 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var5) : module0139.f9038(var15), var5);
                                final SubLObject var7_209 = module0141.$g1685$.currentBinding(var5);
                                final SubLObject var8_208 = module0141.$g1686$.currentBinding(var5);
                                final SubLObject var9_208 = module0141.$g1683$.currentBinding(var5);
                                final SubLObject var10_217 = module0141.$g1684$.currentBinding(var5);
                                final SubLObject var11_218 = module0141.$g1674$.currentBinding(var5);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var5);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var5);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var5);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var5);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var5);
                                    final SubLObject var16 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var17 = (SubLObject)module0252.NIL;
                                    try {
                                        var17 = ReadWriteLocks.rw_lock_seize_read_lock(var16);
                                        final SubLObject var7_210 = module0141.$g1693$.currentBinding(var5);
                                        final SubLObject var8_209 = module0141.$g1691$.currentBinding(var5);
                                        try {
                                            module0141.$g1693$.bind((SubLObject)module0252.$ic11$, var5);
                                            module0141.$g1691$.bind((SubLObject)module0252.NIL, var5);
                                            try {
                                                if (module0252.NIL != module0136.f8865() || module0252.NIL != module0244.f15795(var2, module0137.f8955((SubLObject)module0252.UNPROVIDED))) {
                                                    var6 = module0250.f16182(var2);
                                                }
                                                else {
                                                    module0136.f8872((SubLObject)module0252.TWO_INTEGER, (SubLObject)module0252.$ic15$, var2, module0244.f15748(module0137.f8955((SubLObject)module0252.UNPROVIDED)), (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                                }
                                            }
                                            finally {
                                                final SubLObject var7_211 = Threads.$is_thread_performing_cleanupP$.currentBinding(var5);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0252.T, var5);
                                                    var6 = module0141.$g1691$.getDynamicValue(var5);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var7_211, var5);
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1691$.rebind(var8_209, var5);
                                            module0141.$g1693$.rebind(var7_210, var5);
                                        }
                                    }
                                    finally {
                                        if (module0252.NIL != var17) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var16);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_218, var5);
                                    module0141.$g1684$.rebind(var10_217, var5);
                                    module0141.$g1683$.rebind(var9_208, var5);
                                    module0141.$g1686$.rebind(var8_208, var5);
                                    module0141.$g1685$.rebind(var7_209, var5);
                                }
                                if (var15 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var5));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_208, var5);
                            }
                            if (var15 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var5));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_207, var5);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_207, var5);
                        module0141.$g1677$.rebind(var8_207, var5);
                        module0141.$g1710$.rebind(var7_206, var5);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_206, var5);
                    module0141.$g1714$.rebind(var7_205, var5);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_206, var5);
                module0147.$g2094$.rebind(var8_205, var5);
                module0147.$g2095$.rebind(var7_204, var5);
            }
        }
        finally {
            module0137.$g1605$.rebind(var11, var5);
            module0141.$g1674$.rebind(var10, var5);
            module0141.$g1672$.rebind(var9, var5);
            module0141.$g1671$.rebind(var8, var5);
            module0141.$g1670$.rebind(var7, var5);
        }
        var6 = f16260(module0244.f15774(var1), var6, var3, var4, (SubLObject)module0252.UNPROVIDED);
        return var6;
    }
    
    public static SubLObject f16261(final SubLObject var1, final SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var5 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        SubLObject var6 = (SubLObject)module0252.NIL;
        final SubLObject var7 = module0141.$g1670$.currentBinding(var5);
        final SubLObject var8 = module0141.$g1671$.currentBinding(var5);
        final SubLObject var9 = module0141.$g1672$.currentBinding(var5);
        final SubLObject var10 = module0141.$g1674$.currentBinding(var5);
        final SubLObject var11 = module0137.$g1605$.currentBinding(var5);
        try {
            module0141.$g1670$.bind(var1, var5);
            module0141.$g1671$.bind(module0244.f15739(var1), var5);
            module0141.$g1672$.bind(module0244.f15746(var1), var5);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var5);
            module0137.$g1605$.bind(var1, var5);
            final SubLObject var12 = var3;
            final SubLObject var7_222 = module0147.$g2095$.currentBinding(var5);
            final SubLObject var8_223 = module0147.$g2094$.currentBinding(var5);
            final SubLObject var9_224 = module0147.$g2096$.currentBinding(var5);
            try {
                module0147.$g2095$.bind(module0147.f9545(var12), var5);
                module0147.$g2094$.bind(module0147.f9546(var12), var5);
                module0147.$g2096$.bind(module0147.f9549(var12), var5);
                final SubLObject var13 = var4;
                final SubLObject var7_223 = module0141.$g1714$.currentBinding(var5);
                final SubLObject var8_224 = module0141.$g1715$.currentBinding(var5);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var13) ? var13 : module0141.f9284(), var5);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var13) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var5)), var5);
                    if (module0252.NIL != var13 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9281(var13)) {
                        final SubLObject var14 = module0136.$g1591$.getDynamicValue(var5);
                        if (var14.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var13, (SubLObject)module0252.$ic13$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var14.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var13, (SubLObject)module0252.$ic13$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var14.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var13, (SubLObject)module0252.$ic13$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var5));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var13, (SubLObject)module0252.$ic13$);
                        }
                    }
                    final SubLObject var7_224 = module0141.$g1710$.currentBinding(var5);
                    final SubLObject var8_225 = module0141.$g1677$.currentBinding(var5);
                    final SubLObject var9_225 = module0138.$g1619$.currentBinding(var5);
                    try {
                        module0141.$g1710$.bind(module0252.$ic14$, var5);
                        module0141.$g1677$.bind(module0141.f9210(), var5);
                        module0138.$g1619$.bind(module0244.f15780(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var5);
                        final SubLObject var15 = module0139.f9036();
                        final SubLObject var7_225 = module0139.$g1635$.currentBinding(var5);
                        try {
                            module0139.$g1635$.bind((var15 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var5) : module0139.f9038(var15), var5);
                            final SubLObject var7_226 = module0139.$g1636$.currentBinding(var5);
                            try {
                                module0139.$g1636$.bind((var15 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var5) : module0139.f9038(var15), var5);
                                final SubLObject var7_227 = module0141.$g1685$.currentBinding(var5);
                                final SubLObject var8_226 = module0141.$g1686$.currentBinding(var5);
                                final SubLObject var9_226 = module0141.$g1683$.currentBinding(var5);
                                final SubLObject var10_235 = module0141.$g1684$.currentBinding(var5);
                                final SubLObject var11_236 = module0141.$g1674$.currentBinding(var5);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var5);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var5);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var5);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var5);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var5);
                                    final SubLObject var16 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var17 = (SubLObject)module0252.NIL;
                                    try {
                                        var17 = ReadWriteLocks.rw_lock_seize_read_lock(var16);
                                        final SubLObject var7_228 = module0141.$g1693$.currentBinding(var5);
                                        final SubLObject var8_227 = module0141.$g1691$.currentBinding(var5);
                                        try {
                                            module0141.$g1693$.bind((SubLObject)module0252.$ic11$, var5);
                                            module0141.$g1691$.bind((SubLObject)module0252.NIL, var5);
                                            try {
                                                if (module0252.NIL != module0136.f8865() || module0252.NIL != module0244.f15795(var2, module0137.f8955((SubLObject)module0252.UNPROVIDED))) {
                                                    var6 = module0250.f16182(var2);
                                                }
                                                else {
                                                    module0136.f8872((SubLObject)module0252.TWO_INTEGER, (SubLObject)module0252.$ic15$, var2, module0244.f15748(module0137.f8955((SubLObject)module0252.UNPROVIDED)), (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                                }
                                            }
                                            finally {
                                                final SubLObject var7_229 = Threads.$is_thread_performing_cleanupP$.currentBinding(var5);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0252.T, var5);
                                                    var6 = module0141.$g1691$.getDynamicValue(var5);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var7_229, var5);
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1691$.rebind(var8_227, var5);
                                            module0141.$g1693$.rebind(var7_228, var5);
                                        }
                                    }
                                    finally {
                                        if (module0252.NIL != var17) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var16);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_236, var5);
                                    module0141.$g1684$.rebind(var10_235, var5);
                                    module0141.$g1683$.rebind(var9_226, var5);
                                    module0141.$g1686$.rebind(var8_226, var5);
                                    module0141.$g1685$.rebind(var7_227, var5);
                                }
                                if (var15 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var5));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_226, var5);
                            }
                            if (var15 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var5));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_225, var5);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_225, var5);
                        module0141.$g1677$.rebind(var8_225, var5);
                        module0141.$g1710$.rebind(var7_224, var5);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_224, var5);
                    module0141.$g1714$.rebind(var7_223, var5);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_224, var5);
                module0147.$g2094$.rebind(var8_223, var5);
                module0147.$g2095$.rebind(var7_222, var5);
            }
        }
        finally {
            module0137.$g1605$.rebind(var11, var5);
            module0141.$g1674$.rebind(var10, var5);
            module0141.$g1672$.rebind(var9, var5);
            module0141.$g1671$.rebind(var8, var5);
            module0141.$g1670$.rebind(var7, var5);
        }
        var6 = f16262(module0244.f15774(var1), var6, var3, var4);
        return var6;
    }
    
    public static SubLObject f16263(final SubLObject var1, final SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        assert module0252.NIL != module0137.f8885(var1) : var1;
        final SubLObject var5 = module0244.f15774(var1);
        SubLObject var6 = (SubLObject)module0252.NIL;
        SubLObject var7 = (SubLObject)module0252.NIL;
        SubLObject var8 = (SubLObject)module0252.NIL;
        var7 = f16257(var5, var2, var3, var4);
        var6 = f16261(var1, var2, var3, var4);
        var8 = f16262(var5, ConsesLow.append(var7, var6), var3, var4);
        return var8;
    }
    
    public static SubLObject f16264(final SubLObject var1, final SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        assert module0252.NIL != module0137.f8885(var1) : var1;
        return f16263(var1, var2, var3, var4);
    }
    
    public static SubLObject f16265(final SubLObject var1, final SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var5 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        SubLObject var6 = (SubLObject)module0252.NIL;
        final SubLObject var7 = module0141.$g1670$.currentBinding(var5);
        final SubLObject var8 = module0141.$g1671$.currentBinding(var5);
        final SubLObject var9 = module0141.$g1672$.currentBinding(var5);
        final SubLObject var10 = module0141.$g1674$.currentBinding(var5);
        final SubLObject var11 = module0137.$g1605$.currentBinding(var5);
        try {
            module0141.$g1670$.bind(var1, var5);
            module0141.$g1671$.bind(module0244.f15739(var1), var5);
            module0141.$g1672$.bind(module0244.f15746(var1), var5);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var5);
            module0137.$g1605$.bind(var1, var5);
            final SubLObject var12 = var3;
            final SubLObject var7_243 = module0147.$g2095$.currentBinding(var5);
            final SubLObject var8_244 = module0147.$g2094$.currentBinding(var5);
            final SubLObject var9_245 = module0147.$g2096$.currentBinding(var5);
            try {
                module0147.$g2095$.bind(module0147.f9545(var12), var5);
                module0147.$g2094$.bind(module0147.f9546(var12), var5);
                module0147.$g2096$.bind(module0147.f9549(var12), var5);
                final SubLObject var13 = var4;
                final SubLObject var7_244 = module0141.$g1714$.currentBinding(var5);
                final SubLObject var8_245 = module0141.$g1715$.currentBinding(var5);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var13) ? var13 : module0141.f9283(), var5);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var13) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var5)), var5);
                    if (module0252.NIL != var13 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var13)) {
                        final SubLObject var14 = module0136.$g1591$.getDynamicValue(var5);
                        if (var14.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var13, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var14.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var13, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var14.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var13, (SubLObject)module0252.$ic4$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var5));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var13, (SubLObject)module0252.$ic4$);
                        }
                    }
                    final SubLObject var7_245 = module0141.$g1710$.currentBinding(var5);
                    final SubLObject var8_246 = module0141.$g1677$.currentBinding(var5);
                    final SubLObject var9_246 = module0138.$g1619$.currentBinding(var5);
                    try {
                        module0141.$g1710$.bind(module0252.$ic9$, var5);
                        module0141.$g1677$.bind(module0141.f9208(), var5);
                        module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var5);
                        final SubLObject var15 = module0139.f9036();
                        final SubLObject var7_246 = module0139.$g1635$.currentBinding(var5);
                        try {
                            module0139.$g1635$.bind((var15 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var5) : module0139.f9038(var15), var5);
                            final SubLObject var7_247 = module0139.$g1636$.currentBinding(var5);
                            try {
                                module0139.$g1636$.bind((var15 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var5) : module0139.f9038(var15), var5);
                                final SubLObject var7_248 = module0141.$g1685$.currentBinding(var5);
                                final SubLObject var8_247 = module0141.$g1686$.currentBinding(var5);
                                final SubLObject var9_247 = module0141.$g1683$.currentBinding(var5);
                                final SubLObject var10_256 = module0141.$g1684$.currentBinding(var5);
                                final SubLObject var11_257 = module0141.$g1674$.currentBinding(var5);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var5);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var5);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var5);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var5);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var5);
                                    final SubLObject var16 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var17 = (SubLObject)module0252.NIL;
                                    try {
                                        var17 = ReadWriteLocks.rw_lock_seize_read_lock(var16);
                                        final SubLObject var7_249 = module0141.$g1694$.currentBinding(var5);
                                        final SubLObject var8_248 = module0141.$g1693$.currentBinding(var5);
                                        final SubLObject var9_248 = module0141.$g1691$.currentBinding(var5);
                                        try {
                                            module0141.$g1694$.bind(Symbols.symbol_function((SubLObject)module0252.IDENTITY), var5);
                                            module0141.$g1693$.bind((SubLObject)module0252.$ic19$, var5);
                                            module0141.$g1691$.bind((SubLObject)module0252.NIL, var5);
                                            try {
                                                if (module0252.NIL != module0136.f8865() || module0252.NIL != module0244.f15795(var2, module0137.f8955((SubLObject)module0252.UNPROVIDED))) {
                                                    var6 = module0250.f16184(var2);
                                                }
                                                else {
                                                    module0136.f8872((SubLObject)module0252.TWO_INTEGER, (SubLObject)module0252.$ic15$, var2, module0244.f15748(module0137.f8955((SubLObject)module0252.UNPROVIDED)), (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                                }
                                            }
                                            finally {
                                                final SubLObject var7_250 = Threads.$is_thread_performing_cleanupP$.currentBinding(var5);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0252.T, var5);
                                                    var6 = module0141.$g1691$.getDynamicValue(var5);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var7_250, var5);
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1691$.rebind(var9_248, var5);
                                            module0141.$g1693$.rebind(var8_248, var5);
                                            module0141.$g1694$.rebind(var7_249, var5);
                                        }
                                    }
                                    finally {
                                        if (module0252.NIL != var17) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var16);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_257, var5);
                                    module0141.$g1684$.rebind(var10_256, var5);
                                    module0141.$g1683$.rebind(var9_247, var5);
                                    module0141.$g1686$.rebind(var8_247, var5);
                                    module0141.$g1685$.rebind(var7_248, var5);
                                }
                                if (var15 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var5));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_247, var5);
                            }
                            if (var15 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var5));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_246, var5);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_246, var5);
                        module0141.$g1677$.rebind(var8_246, var5);
                        module0141.$g1710$.rebind(var7_245, var5);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_245, var5);
                    module0141.$g1714$.rebind(var7_244, var5);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_245, var5);
                module0147.$g2094$.rebind(var8_244, var5);
                module0147.$g2095$.rebind(var7_243, var5);
            }
        }
        finally {
            module0137.$g1605$.rebind(var11, var5);
            module0141.$g1674$.rebind(var10, var5);
            module0141.$g1672$.rebind(var9, var5);
            module0141.$g1671$.rebind(var8, var5);
            module0141.$g1670$.rebind(var7, var5);
        }
        return var6;
    }
    
    public static SubLObject f16266(final SubLObject var1, final SubLObject var262, SubLObject var263, SubLObject var3, SubLObject var4) {
        if (var263 == module0252.UNPROVIDED) {
            var263 = (SubLObject)module0252.ONE_INTEGER;
        }
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var264 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        SubLObject var265 = (SubLObject)module0252.NIL;
        final SubLObject var266 = module0141.$g1670$.currentBinding(var264);
        final SubLObject var267 = module0141.$g1671$.currentBinding(var264);
        final SubLObject var268 = module0141.$g1672$.currentBinding(var264);
        final SubLObject var269 = module0141.$g1674$.currentBinding(var264);
        final SubLObject var270 = module0137.$g1605$.currentBinding(var264);
        try {
            module0141.$g1670$.bind(var1, var264);
            module0141.$g1671$.bind(module0244.f15739(var1), var264);
            module0141.$g1672$.bind(module0244.f15746(var1), var264);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var264);
            module0137.$g1605$.bind(var1, var264);
            final SubLObject var271 = var3;
            final SubLObject var7_264 = module0147.$g2095$.currentBinding(var264);
            final SubLObject var8_265 = module0147.$g2094$.currentBinding(var264);
            final SubLObject var9_266 = module0147.$g2096$.currentBinding(var264);
            try {
                module0147.$g2095$.bind(module0147.f9545(var271), var264);
                module0147.$g2094$.bind(module0147.f9546(var271), var264);
                module0147.$g2096$.bind(module0147.f9549(var271), var264);
                final SubLObject var272 = var4;
                final SubLObject var7_265 = module0141.$g1714$.currentBinding(var264);
                final SubLObject var8_266 = module0141.$g1715$.currentBinding(var264);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var272) ? var272 : module0141.f9283(), var264);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var272) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var264)), var264);
                    if (module0252.NIL != var272 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var272)) {
                        final SubLObject var273 = module0136.$g1591$.getDynamicValue(var264);
                        if (var273.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var272, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var273.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var272, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var273.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var272, (SubLObject)module0252.$ic4$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var264));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var272, (SubLObject)module0252.$ic4$);
                        }
                    }
                    final SubLObject var7_266 = module0141.$g1710$.currentBinding(var264);
                    final SubLObject var8_267 = module0141.$g1677$.currentBinding(var264);
                    final SubLObject var9_267 = module0138.$g1619$.currentBinding(var264);
                    try {
                        module0141.$g1710$.bind(module0252.$ic9$, var264);
                        module0141.$g1677$.bind(module0141.f9210(), var264);
                        module0138.$g1619$.bind(module0244.f15780(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var264);
                        final SubLObject var274 = module0139.f9036();
                        final SubLObject var7_267 = module0139.$g1635$.currentBinding(var264);
                        try {
                            module0139.$g1635$.bind((var274 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var264) : module0139.f9038(var274), var264);
                            final SubLObject var7_268 = module0139.$g1636$.currentBinding(var264);
                            try {
                                module0139.$g1636$.bind((var274 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var264) : module0139.f9038(var274), var264);
                                final SubLObject var7_269 = module0141.$g1685$.currentBinding(var264);
                                final SubLObject var8_268 = module0141.$g1686$.currentBinding(var264);
                                final SubLObject var9_268 = module0141.$g1683$.currentBinding(var264);
                                final SubLObject var10_277 = module0141.$g1684$.currentBinding(var264);
                                final SubLObject var11_278 = module0141.$g1674$.currentBinding(var264);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var264);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var264);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var264);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var264);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var264);
                                    final SubLObject var275 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var276 = (SubLObject)module0252.NIL;
                                    try {
                                        var276 = ReadWriteLocks.rw_lock_seize_read_lock(var275);
                                        if (module0252.NIL != module0136.f8865() || module0252.NIL != module0244.f15795(var262, module0137.f8955((SubLObject)module0252.UNPROVIDED))) {
                                            var265 = f16267(var262, var263, (SubLObject)module0252.UNPROVIDED);
                                        }
                                        else {
                                            module0136.f8872((SubLObject)module0252.TWO_INTEGER, (SubLObject)module0252.$ic15$, var262, module0244.f15748(module0137.f8955((SubLObject)module0252.UNPROVIDED)), (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                        }
                                    }
                                    finally {
                                        if (module0252.NIL != var276) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var275);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_278, var264);
                                    module0141.$g1684$.rebind(var10_277, var264);
                                    module0141.$g1683$.rebind(var9_268, var264);
                                    module0141.$g1686$.rebind(var8_268, var264);
                                    module0141.$g1685$.rebind(var7_269, var264);
                                }
                                if (var274 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var264));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_268, var264);
                            }
                            if (var274 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var264));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_267, var264);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_267, var264);
                        module0141.$g1677$.rebind(var8_267, var264);
                        module0141.$g1710$.rebind(var7_266, var264);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_266, var264);
                    module0141.$g1714$.rebind(var7_265, var264);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_266, var264);
                module0147.$g2094$.rebind(var8_265, var264);
                module0147.$g2095$.rebind(var7_264, var264);
            }
        }
        finally {
            module0137.$g1605$.rebind(var270, var264);
            module0141.$g1674$.rebind(var269, var264);
            module0141.$g1672$.rebind(var268, var264);
            module0141.$g1671$.rebind(var267, var264);
            module0141.$g1670$.rebind(var266, var264);
        }
        return var265;
    }
    
    public static SubLObject f16268(final SubLObject var1, final SubLObject var279, final SubLObject var262, SubLObject var263, SubLObject var3, SubLObject var4) {
        if (var263 == module0252.UNPROVIDED) {
            var263 = (SubLObject)module0252.ONE_INTEGER;
        }
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var280 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        SubLObject var281 = (SubLObject)module0252.NIL;
        final SubLObject var282 = module0141.$g1670$.currentBinding(var280);
        final SubLObject var283 = module0141.$g1671$.currentBinding(var280);
        final SubLObject var284 = module0141.$g1672$.currentBinding(var280);
        final SubLObject var285 = module0141.$g1674$.currentBinding(var280);
        final SubLObject var286 = module0137.$g1605$.currentBinding(var280);
        try {
            module0141.$g1670$.bind(var1, var280);
            module0141.$g1671$.bind(module0244.f15739(var1), var280);
            module0141.$g1672$.bind(module0244.f15746(var1), var280);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var280);
            module0137.$g1605$.bind(var1, var280);
            final SubLObject var287 = var3;
            final SubLObject var7_280 = module0147.$g2095$.currentBinding(var280);
            final SubLObject var8_281 = module0147.$g2094$.currentBinding(var280);
            final SubLObject var9_282 = module0147.$g2096$.currentBinding(var280);
            try {
                module0147.$g2095$.bind(module0147.f9545(var287), var280);
                module0147.$g2094$.bind(module0147.f9546(var287), var280);
                module0147.$g2096$.bind(module0147.f9549(var287), var280);
                final SubLObject var288 = var4;
                final SubLObject var7_281 = module0141.$g1714$.currentBinding(var280);
                final SubLObject var8_282 = module0141.$g1715$.currentBinding(var280);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var288) ? var288 : module0141.f9283(), var280);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var288) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var280)), var280);
                    if (module0252.NIL != var288 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var288)) {
                        final SubLObject var289 = module0136.$g1591$.getDynamicValue(var280);
                        if (var289.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var288, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var289.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var288, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var289.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var288, (SubLObject)module0252.$ic4$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var280));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var288, (SubLObject)module0252.$ic4$);
                        }
                    }
                    final SubLObject var7_282 = module0141.$g1710$.currentBinding(var280);
                    final SubLObject var8_283 = module0141.$g1677$.currentBinding(var280);
                    final SubLObject var9_283 = module0138.$g1619$.currentBinding(var280);
                    try {
                        module0141.$g1710$.bind(module0252.$ic9$, var280);
                        module0141.$g1677$.bind(module0141.f9210(), var280);
                        module0138.$g1619$.bind(module0244.f15780(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var280);
                        final SubLObject var290 = module0139.f9036();
                        final SubLObject var7_283 = module0139.$g1635$.currentBinding(var280);
                        try {
                            module0139.$g1635$.bind((var290 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var280) : module0139.f9038(var290), var280);
                            final SubLObject var7_284 = module0139.$g1636$.currentBinding(var280);
                            try {
                                module0139.$g1636$.bind((var290 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var280) : module0139.f9038(var290), var280);
                                final SubLObject var7_285 = module0141.$g1685$.currentBinding(var280);
                                final SubLObject var8_284 = module0141.$g1686$.currentBinding(var280);
                                final SubLObject var9_284 = module0141.$g1683$.currentBinding(var280);
                                final SubLObject var10_293 = module0141.$g1684$.currentBinding(var280);
                                final SubLObject var11_294 = module0141.$g1674$.currentBinding(var280);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var280);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var280);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var280);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var280);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var280);
                                    final SubLObject var291 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var292 = (SubLObject)module0252.NIL;
                                    try {
                                        var292 = ReadWriteLocks.rw_lock_seize_read_lock(var291);
                                        if (module0252.NIL != module0136.f8865() || module0252.NIL != module0244.f15795(var262, module0137.f8955((SubLObject)module0252.UNPROVIDED))) {
                                            final SubLObject var7_286 = module0139.$g1647$.currentBinding(var280);
                                            try {
                                                module0139.$g1647$.bind(module0139.f9007(), var280);
                                                module0251.f16227(var1, var279, var262, var3, var4);
                                                final SubLObject var7_287 = module0141.$g1670$.currentBinding(var280);
                                                final SubLObject var8_285 = module0141.$g1671$.currentBinding(var280);
                                                final SubLObject var9_285 = module0141.$g1672$.currentBinding(var280);
                                                final SubLObject var10_294 = module0141.$g1674$.currentBinding(var280);
                                                final SubLObject var11_295 = module0137.$g1605$.currentBinding(var280);
                                                try {
                                                    module0141.$g1670$.bind(module0244.f15774(var1), var280);
                                                    module0141.$g1671$.bind(module0244.f15739(module0244.f15774(var1)), var280);
                                                    module0141.$g1672$.bind(module0244.f15746(module0244.f15774(var1)), var280);
                                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var280);
                                                    module0137.$g1605$.bind(module0244.f15774(var1), var280);
                                                    module0251.f16221(var262);
                                                }
                                                finally {
                                                    module0137.$g1605$.rebind(var11_295, var280);
                                                    module0141.$g1674$.rebind(var10_294, var280);
                                                    module0141.$g1672$.rebind(var9_285, var280);
                                                    module0141.$g1671$.rebind(var8_285, var280);
                                                    module0141.$g1670$.rebind(var7_287, var280);
                                                }
                                                var281 = f16267(var262, var263, (SubLObject)module0252.T);
                                                module0139.f9011(module0139.$g1647$.getDynamicValue(var280));
                                            }
                                            finally {
                                                module0139.$g1647$.rebind(var7_286, var280);
                                            }
                                        }
                                        else {
                                            module0136.f8872((SubLObject)module0252.TWO_INTEGER, (SubLObject)module0252.$ic15$, var262, module0244.f15748(module0137.f8955((SubLObject)module0252.UNPROVIDED)), (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                        }
                                    }
                                    finally {
                                        if (module0252.NIL != var292) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var291);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_294, var280);
                                    module0141.$g1684$.rebind(var10_293, var280);
                                    module0141.$g1683$.rebind(var9_284, var280);
                                    module0141.$g1686$.rebind(var8_284, var280);
                                    module0141.$g1685$.rebind(var7_285, var280);
                                }
                                if (var290 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var280));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_284, var280);
                            }
                            if (var290 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var280));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_283, var280);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_283, var280);
                        module0141.$g1677$.rebind(var8_283, var280);
                        module0141.$g1710$.rebind(var7_282, var280);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_282, var280);
                    module0141.$g1714$.rebind(var7_281, var280);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_282, var280);
                module0147.$g2094$.rebind(var8_281, var280);
                module0147.$g2095$.rebind(var7_280, var280);
            }
        }
        finally {
            module0137.$g1605$.rebind(var286, var280);
            module0141.$g1674$.rebind(var285, var280);
            module0141.$g1672$.rebind(var284, var280);
            module0141.$g1671$.rebind(var283, var280);
            module0141.$g1670$.rebind(var282, var280);
        }
        return var281;
    }
    
    public static SubLObject f16267(final SubLObject var262, final SubLObject var263, SubLObject var301) {
        if (var301 == module0252.UNPROVIDED) {
            var301 = (SubLObject)module0252.NIL;
        }
        final SubLThread var302 = SubLProcess.currentSubLThread();
        SubLObject var303 = (SubLObject)module0252.NIL;
        final SubLObject var304 = module0141.$g1693$.currentBinding(var302);
        try {
            module0141.$g1693$.bind(module0250.f16186(var301), var302);
            final SubLObject var305 = module0055.f4021(var262, module0055.f4017());
            final SubLObject var7_303 = module0141.$g1702$.currentBinding(var302);
            final SubLObject var306 = module0141.$g1665$.currentBinding(var302);
            final SubLObject var307 = module0138.$g1622$.currentBinding(var302);
            try {
                module0141.$g1702$.bind((SubLObject)ConsesLow.list(var305), var302);
                module0141.$g1665$.bind((SubLObject)((module0252.NIL != module0244.f15770(module0137.f8955((SubLObject)module0252.UNPROVIDED))) ? module0252.$ic20$ : module0252.$ic21$), var302);
                module0138.$g1622$.bind((SubLObject)module0252.T, var302);
                SubLObject var308;
                SubLObject var7_304;
                SubLObject var309;
                SubLObject var307_308;
                SubLObject var310;
                SubLObject var7_305;
                for (var308 = (SubLObject)module0252.NIL, var308 = (SubLObject)module0252.ZERO_INTEGER; var308.numL(var263); var308 = Numbers.add(var308, (SubLObject)module0252.ONE_INTEGER)) {
                    var7_304 = module0141.$g1685$.currentBinding(var302);
                    try {
                        module0141.$g1685$.bind((SubLObject)module0252.NIL, var302);
                        var309 = (SubLObject)module0252.NIL;
                        while (module0252.NIL != module0141.$g1702$.getDynamicValue(var302) && module0252.NIL == var309) {
                            var307_308 = module0141.$g1702$.getDynamicValue(var302).first();
                            var310 = module0055.f4020(var307_308).first();
                            var7_305 = module0141.$g1701$.currentBinding(var302);
                            try {
                                module0141.$g1701$.bind(module0055.f4017(), var302);
                                module0249.f16063(var310, (SubLObject)module0252.UNPROVIDED);
                                var309 = f16246(var310);
                                if (module0252.NIL != var309) {
                                    var303 = (SubLObject)ConsesLow.cons(var309, var303);
                                }
                                if (module0252.NIL != var309) {
                                    ConsesLow.rplacd(conses_high.last(module0141.$g1702$.getDynamicValue(var302), (SubLObject)module0252.UNPROVIDED), (SubLObject)ConsesLow.list(var307_308, module0141.$g1701$.getDynamicValue(var302)));
                                    module0141.$g1702$.setDynamicValue(module0141.$g1702$.getDynamicValue(var302).rest(), var302);
                                }
                                else {
                                    module0055.f4023(var307_308);
                                }
                            }
                            finally {
                                module0141.$g1701$.rebind(var7_305, var302);
                            }
                            module0141.$g1702$.setDynamicValue(Sequences.remove_if((SubLObject)module0252.$ic22$, module0141.$g1702$.getDynamicValue(var302), (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED), var302);
                        }
                    }
                    finally {
                        module0141.$g1685$.rebind(var7_304, var302);
                    }
                }
            }
            finally {
                module0138.$g1622$.rebind(var307, var302);
                module0141.$g1665$.rebind(var306, var302);
                module0141.$g1702$.rebind(var7_303, var302);
            }
        }
        finally {
            module0141.$g1693$.rebind(var304, var302);
        }
        return var303;
    }
    
    public static SubLObject f16269(final SubLObject var1, final SubLObject var2, final SubLObject var310, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var311 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        final SubLObject var312 = module0141.$g1670$.currentBinding(var311);
        final SubLObject var313 = module0141.$g1671$.currentBinding(var311);
        final SubLObject var314 = module0141.$g1672$.currentBinding(var311);
        final SubLObject var315 = module0141.$g1674$.currentBinding(var311);
        final SubLObject var316 = module0137.$g1605$.currentBinding(var311);
        try {
            module0141.$g1670$.bind(var1, var311);
            module0141.$g1671$.bind(module0244.f15739(var1), var311);
            module0141.$g1672$.bind(module0244.f15746(var1), var311);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var311);
            module0137.$g1605$.bind(var1, var311);
            final SubLObject var317 = var3;
            final SubLObject var7_311 = module0147.$g2095$.currentBinding(var311);
            final SubLObject var8_312 = module0147.$g2094$.currentBinding(var311);
            final SubLObject var9_313 = module0147.$g2096$.currentBinding(var311);
            try {
                module0147.$g2095$.bind(module0147.f9545(var317), var311);
                module0147.$g2094$.bind(module0147.f9546(var317), var311);
                module0147.$g2096$.bind(module0147.f9549(var317), var311);
                final SubLObject var318 = var4;
                final SubLObject var7_312 = module0141.$g1714$.currentBinding(var311);
                final SubLObject var8_313 = module0141.$g1715$.currentBinding(var311);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var318) ? var318 : module0141.f9283(), var311);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var318) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var311)), var311);
                    if (module0252.NIL != var318 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var318)) {
                        final SubLObject var319 = module0136.$g1591$.getDynamicValue(var311);
                        if (var319.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var318, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var319.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var318, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var319.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var318, (SubLObject)module0252.$ic4$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var311));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var318, (SubLObject)module0252.$ic4$);
                        }
                    }
                    final SubLObject var7_313 = module0141.$g1710$.currentBinding(var311);
                    final SubLObject var8_314 = module0141.$g1677$.currentBinding(var311);
                    final SubLObject var9_314 = module0138.$g1619$.currentBinding(var311);
                    try {
                        module0141.$g1710$.bind(module0252.$ic9$, var311);
                        module0141.$g1677$.bind(module0141.f9208(), var311);
                        module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var311);
                        final SubLObject var320 = module0139.f9036();
                        final SubLObject var7_314 = module0139.$g1635$.currentBinding(var311);
                        try {
                            module0139.$g1635$.bind((var320 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var311) : module0139.f9038(var320), var311);
                            final SubLObject var7_315 = module0139.$g1636$.currentBinding(var311);
                            try {
                                module0139.$g1636$.bind((var320 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var311) : module0139.f9038(var320), var311);
                                final SubLObject var7_316 = module0141.$g1685$.currentBinding(var311);
                                final SubLObject var8_315 = module0141.$g1686$.currentBinding(var311);
                                final SubLObject var9_315 = module0141.$g1683$.currentBinding(var311);
                                final SubLObject var10_324 = module0141.$g1684$.currentBinding(var311);
                                final SubLObject var11_325 = module0141.$g1674$.currentBinding(var311);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var311);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var311);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var311);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var311);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var311);
                                    final SubLObject var321 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var322 = (SubLObject)module0252.NIL;
                                    try {
                                        var322 = ReadWriteLocks.rw_lock_seize_read_lock(var321);
                                        if (module0252.NIL != module0136.f8864() && !var310.isFunctionSpec()) {
                                            final SubLObject var323 = module0136.$g1591$.getDynamicValue(var311);
                                            if (var323.eql((SubLObject)module0252.$ic2$)) {
                                                module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var310, (SubLObject)module0252.$ic23$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                            }
                                            else if (var323.eql((SubLObject)module0252.$ic5$)) {
                                                module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var310, (SubLObject)module0252.$ic23$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                            }
                                            else if (var323.eql((SubLObject)module0252.$ic7$)) {
                                                Errors.warn((SubLObject)module0252.$ic3$, var310, (SubLObject)module0252.$ic23$);
                                            }
                                            else {
                                                Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var311));
                                                Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var310, (SubLObject)module0252.$ic23$);
                                            }
                                        }
                                        final SubLObject var7_317 = module0141.$g1665$.currentBinding(var311);
                                        final SubLObject var8_316 = module0139.$g1648$.currentBinding(var311);
                                        final SubLObject var9_316 = module0141.$g1694$.currentBinding(var311);
                                        final SubLObject var10_325 = module0141.$g1693$.currentBinding(var311);
                                        final SubLObject var11_326 = module0141.$g1664$.currentBinding(var311);
                                        try {
                                            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var311);
                                            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var311)), var311);
                                            module0141.$g1694$.bind(var310, var311);
                                            module0141.$g1693$.bind((SubLObject)module0252.$ic24$, var311);
                                            module0141.$g1664$.bind((SubLObject)module0252.$ic17$, var311);
                                            if (module0252.NIL != module0136.f8865() || module0252.NIL != module0244.f15795(var2, module0137.f8955((SubLObject)module0252.UNPROVIDED))) {
                                                module0250.f16162(module0141.f9171(), var2);
                                            }
                                            else {
                                                module0136.f8872((SubLObject)module0252.TWO_INTEGER, (SubLObject)module0252.$ic15$, var2, module0244.f15748(module0137.f8955((SubLObject)module0252.UNPROVIDED)), (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                            }
                                        }
                                        finally {
                                            module0141.$g1664$.rebind(var11_326, var311);
                                            module0141.$g1693$.rebind(var10_325, var311);
                                            module0141.$g1694$.rebind(var9_316, var311);
                                            module0139.$g1648$.rebind(var8_316, var311);
                                            module0141.$g1665$.rebind(var7_317, var311);
                                        }
                                    }
                                    finally {
                                        if (module0252.NIL != var322) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var321);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_325, var311);
                                    module0141.$g1684$.rebind(var10_324, var311);
                                    module0141.$g1683$.rebind(var9_315, var311);
                                    module0141.$g1686$.rebind(var8_315, var311);
                                    module0141.$g1685$.rebind(var7_316, var311);
                                }
                                if (var320 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var311));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_315, var311);
                            }
                            if (var320 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var311));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_314, var311);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_314, var311);
                        module0141.$g1677$.rebind(var8_314, var311);
                        module0141.$g1710$.rebind(var7_313, var311);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_313, var311);
                    module0141.$g1714$.rebind(var7_312, var311);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_313, var311);
                module0147.$g2094$.rebind(var8_312, var311);
                module0147.$g2095$.rebind(var7_311, var311);
            }
        }
        finally {
            module0137.$g1605$.rebind(var316, var311);
            module0141.$g1674$.rebind(var315, var311);
            module0141.$g1672$.rebind(var314, var311);
            module0141.$g1671$.rebind(var313, var311);
            module0141.$g1670$.rebind(var312, var311);
        }
        return (SubLObject)module0252.NIL;
    }
    
    public static SubLObject f16270(final SubLObject var1, final SubLObject var2, final SubLObject var331, final SubLObject var332, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var333 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        final SubLObject var334 = module0141.$g1670$.currentBinding(var333);
        final SubLObject var335 = module0141.$g1671$.currentBinding(var333);
        final SubLObject var336 = module0141.$g1672$.currentBinding(var333);
        final SubLObject var337 = module0141.$g1674$.currentBinding(var333);
        final SubLObject var338 = module0137.$g1605$.currentBinding(var333);
        try {
            module0141.$g1670$.bind(var1, var333);
            module0141.$g1671$.bind(module0244.f15739(var1), var333);
            module0141.$g1672$.bind(module0244.f15746(var1), var333);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var333);
            module0137.$g1605$.bind(var1, var333);
            final SubLObject var339 = var3;
            final SubLObject var7_333 = module0147.$g2095$.currentBinding(var333);
            final SubLObject var8_334 = module0147.$g2094$.currentBinding(var333);
            final SubLObject var9_335 = module0147.$g2096$.currentBinding(var333);
            try {
                module0147.$g2095$.bind(module0147.f9545(var339), var333);
                module0147.$g2094$.bind(module0147.f9546(var339), var333);
                module0147.$g2096$.bind(module0147.f9549(var339), var333);
                final SubLObject var340 = var4;
                final SubLObject var7_334 = module0141.$g1714$.currentBinding(var333);
                final SubLObject var8_335 = module0141.$g1715$.currentBinding(var333);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var340) ? var340 : module0141.f9283(), var333);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var340) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var333)), var333);
                    if (module0252.NIL != var340 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var340)) {
                        final SubLObject var341 = module0136.$g1591$.getDynamicValue(var333);
                        if (var341.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var340, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var341.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var340, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var341.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var340, (SubLObject)module0252.$ic4$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var333));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var340, (SubLObject)module0252.$ic4$);
                        }
                    }
                    final SubLObject var7_335 = module0141.$g1710$.currentBinding(var333);
                    final SubLObject var8_336 = module0141.$g1677$.currentBinding(var333);
                    final SubLObject var9_336 = module0138.$g1619$.currentBinding(var333);
                    try {
                        module0141.$g1710$.bind(module0252.$ic9$, var333);
                        module0141.$g1677$.bind(module0141.f9208(), var333);
                        module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var333);
                        final SubLObject var342 = module0139.f9036();
                        final SubLObject var7_336 = module0139.$g1635$.currentBinding(var333);
                        try {
                            module0139.$g1635$.bind((var342 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var333) : module0139.f9038(var342), var333);
                            final SubLObject var7_337 = module0139.$g1636$.currentBinding(var333);
                            try {
                                module0139.$g1636$.bind((var342 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var333) : module0139.f9038(var342), var333);
                                final SubLObject var7_338 = module0141.$g1685$.currentBinding(var333);
                                final SubLObject var8_337 = module0141.$g1686$.currentBinding(var333);
                                final SubLObject var9_337 = module0141.$g1683$.currentBinding(var333);
                                final SubLObject var10_346 = module0141.$g1684$.currentBinding(var333);
                                final SubLObject var11_347 = module0141.$g1674$.currentBinding(var333);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var333);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var333);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var333);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var333);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var333);
                                    final SubLObject var343 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var344 = (SubLObject)module0252.NIL;
                                    try {
                                        var344 = ReadWriteLocks.rw_lock_seize_read_lock(var343);
                                        if (module0252.NIL != module0136.f8864() && !var331.isFunctionSpec()) {
                                            final SubLObject var345 = module0136.$g1591$.getDynamicValue(var333);
                                            if (var345.eql((SubLObject)module0252.$ic2$)) {
                                                module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var331, (SubLObject)module0252.$ic23$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                            }
                                            else if (var345.eql((SubLObject)module0252.$ic5$)) {
                                                module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var331, (SubLObject)module0252.$ic23$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                            }
                                            else if (var345.eql((SubLObject)module0252.$ic7$)) {
                                                Errors.warn((SubLObject)module0252.$ic3$, var331, (SubLObject)module0252.$ic23$);
                                            }
                                            else {
                                                Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var333));
                                                Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var331, (SubLObject)module0252.$ic23$);
                                            }
                                        }
                                        if (module0252.NIL != module0136.f8864() && !var332.isFunctionSpec()) {
                                            final SubLObject var345 = module0136.$g1591$.getDynamicValue(var333);
                                            if (var345.eql((SubLObject)module0252.$ic2$)) {
                                                module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var332, (SubLObject)module0252.$ic23$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                            }
                                            else if (var345.eql((SubLObject)module0252.$ic5$)) {
                                                module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var332, (SubLObject)module0252.$ic23$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                            }
                                            else if (var345.eql((SubLObject)module0252.$ic7$)) {
                                                Errors.warn((SubLObject)module0252.$ic3$, var332, (SubLObject)module0252.$ic23$);
                                            }
                                            else {
                                                Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var333));
                                                Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var332, (SubLObject)module0252.$ic23$);
                                            }
                                        }
                                        final SubLObject var7_339 = module0141.$g1665$.currentBinding(var333);
                                        final SubLObject var8_338 = module0139.$g1648$.currentBinding(var333);
                                        final SubLObject var9_338 = module0141.$g1694$.currentBinding(var333);
                                        final SubLObject var10_347 = module0141.$g1696$.currentBinding(var333);
                                        final SubLObject var11_348 = module0141.$g1693$.currentBinding(var333);
                                        final SubLObject var346 = module0141.$g1664$.currentBinding(var333);
                                        try {
                                            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var333);
                                            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var333)), var333);
                                            module0141.$g1694$.bind(var331, var333);
                                            module0141.$g1696$.bind(var332, var333);
                                            module0141.$g1693$.bind((SubLObject)module0252.$ic25$, var333);
                                            module0141.$g1664$.bind((SubLObject)module0252.$ic17$, var333);
                                            if (module0252.NIL != module0136.f8865() || module0252.NIL != module0244.f15795(var2, module0137.f8955((SubLObject)module0252.UNPROVIDED))) {
                                                module0250.f16162(module0141.f9171(), var2);
                                            }
                                            else {
                                                module0136.f8872((SubLObject)module0252.TWO_INTEGER, (SubLObject)module0252.$ic15$, var2, module0244.f15748(module0137.f8955((SubLObject)module0252.UNPROVIDED)), (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                            }
                                        }
                                        finally {
                                            module0141.$g1664$.rebind(var346, var333);
                                            module0141.$g1693$.rebind(var11_348, var333);
                                            module0141.$g1696$.rebind(var10_347, var333);
                                            module0141.$g1694$.rebind(var9_338, var333);
                                            module0139.$g1648$.rebind(var8_338, var333);
                                            module0141.$g1665$.rebind(var7_339, var333);
                                        }
                                    }
                                    finally {
                                        if (module0252.NIL != var344) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var343);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_347, var333);
                                    module0141.$g1684$.rebind(var10_346, var333);
                                    module0141.$g1683$.rebind(var9_337, var333);
                                    module0141.$g1686$.rebind(var8_337, var333);
                                    module0141.$g1685$.rebind(var7_338, var333);
                                }
                                if (var342 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var333));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_337, var333);
                            }
                            if (var342 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var333));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_336, var333);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_336, var333);
                        module0141.$g1677$.rebind(var8_336, var333);
                        module0141.$g1710$.rebind(var7_335, var333);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_335, var333);
                    module0141.$g1714$.rebind(var7_334, var333);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_335, var333);
                module0147.$g2094$.rebind(var8_334, var333);
                module0147.$g2095$.rebind(var7_333, var333);
            }
        }
        finally {
            module0137.$g1605$.rebind(var338, var333);
            module0141.$g1674$.rebind(var337, var333);
            module0141.$g1672$.rebind(var336, var333);
            module0141.$g1671$.rebind(var335, var333);
            module0141.$g1670$.rebind(var334, var333);
        }
        return (SubLObject)module0252.NIL;
    }
    
    public static SubLObject f16271(final SubLObject var1, final SubLObject var2, final SubLObject var331, SubLObject var354, SubLObject var355) {
        if (var354 == module0252.UNPROVIDED) {
            var354 = module0139.$g1635$.getDynamicValue();
        }
        if (var355 == module0252.UNPROVIDED) {
            var355 = module0139.$g1636$.getDynamicValue();
        }
        final SubLThread var356 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        final SubLObject var357 = module0139.$g1635$.currentBinding(var356);
        final SubLObject var358 = module0139.$g1636$.currentBinding(var356);
        final SubLObject var359 = module0139.$g1644$.currentBinding(var356);
        try {
            module0139.$g1635$.bind(var354, var356);
            module0139.$g1636$.bind(var355, var356);
            module0139.$g1644$.bind((SubLObject)module0252.T, var356);
            f16269(var1, var2, var331, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
        }
        finally {
            module0139.$g1644$.rebind(var359, var356);
            module0139.$g1636$.rebind(var358, var356);
            module0139.$g1635$.rebind(var357, var356);
        }
        return (SubLObject)module0252.NIL;
    }
    
    public static SubLObject f16272(final SubLObject var1, final SubLObject var2, final SubLObject var310, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var311 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        final SubLObject var312 = module0141.$g1670$.currentBinding(var311);
        final SubLObject var313 = module0141.$g1671$.currentBinding(var311);
        final SubLObject var314 = module0141.$g1672$.currentBinding(var311);
        final SubLObject var315 = module0141.$g1674$.currentBinding(var311);
        final SubLObject var316 = module0137.$g1605$.currentBinding(var311);
        try {
            module0141.$g1670$.bind(var1, var311);
            module0141.$g1671$.bind(module0244.f15739(var1), var311);
            module0141.$g1672$.bind(module0244.f15746(var1), var311);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var311);
            module0137.$g1605$.bind(var1, var311);
            final SubLObject var317 = var3;
            final SubLObject var7_356 = module0147.$g2095$.currentBinding(var311);
            final SubLObject var8_357 = module0147.$g2094$.currentBinding(var311);
            final SubLObject var9_358 = module0147.$g2096$.currentBinding(var311);
            try {
                module0147.$g2095$.bind(module0147.f9545(var317), var311);
                module0147.$g2094$.bind(module0147.f9546(var317), var311);
                module0147.$g2096$.bind(module0147.f9549(var317), var311);
                final SubLObject var318 = var4;
                final SubLObject var7_357 = module0141.$g1714$.currentBinding(var311);
                final SubLObject var8_358 = module0141.$g1715$.currentBinding(var311);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var318) ? var318 : module0141.f9283(), var311);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var318) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var311)), var311);
                    if (module0252.NIL != var318 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var318)) {
                        final SubLObject var319 = module0136.$g1591$.getDynamicValue(var311);
                        if (var319.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var318, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var319.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var318, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var319.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var318, (SubLObject)module0252.$ic4$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var311));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var318, (SubLObject)module0252.$ic4$);
                        }
                    }
                    final SubLObject var7_358 = module0141.$g1710$.currentBinding(var311);
                    final SubLObject var8_359 = module0141.$g1677$.currentBinding(var311);
                    final SubLObject var9_359 = module0138.$g1619$.currentBinding(var311);
                    try {
                        module0141.$g1710$.bind(module0252.$ic9$, var311);
                        module0141.$g1677$.bind(module0141.f9210(), var311);
                        module0138.$g1619$.bind(module0244.f15780(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var311);
                        final SubLObject var320 = module0139.f9036();
                        final SubLObject var7_359 = module0139.$g1635$.currentBinding(var311);
                        try {
                            module0139.$g1635$.bind((var320 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var311) : module0139.f9038(var320), var311);
                            final SubLObject var7_360 = module0139.$g1636$.currentBinding(var311);
                            try {
                                module0139.$g1636$.bind((var320 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var311) : module0139.f9038(var320), var311);
                                final SubLObject var7_361 = module0141.$g1685$.currentBinding(var311);
                                final SubLObject var8_360 = module0141.$g1686$.currentBinding(var311);
                                final SubLObject var9_360 = module0141.$g1683$.currentBinding(var311);
                                final SubLObject var10_369 = module0141.$g1684$.currentBinding(var311);
                                final SubLObject var11_370 = module0141.$g1674$.currentBinding(var311);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var311);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var311);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var311);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var311);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var311);
                                    final SubLObject var321 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var322 = (SubLObject)module0252.NIL;
                                    try {
                                        var322 = ReadWriteLocks.rw_lock_seize_read_lock(var321);
                                        if (module0252.NIL != module0136.f8864() && !var310.isFunctionSpec()) {
                                            final SubLObject var323 = module0136.$g1591$.getDynamicValue(var311);
                                            if (var323.eql((SubLObject)module0252.$ic2$)) {
                                                module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var310, (SubLObject)module0252.$ic23$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                            }
                                            else if (var323.eql((SubLObject)module0252.$ic5$)) {
                                                module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var310, (SubLObject)module0252.$ic23$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                            }
                                            else if (var323.eql((SubLObject)module0252.$ic7$)) {
                                                Errors.warn((SubLObject)module0252.$ic3$, var310, (SubLObject)module0252.$ic23$);
                                            }
                                            else {
                                                Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var311));
                                                Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var310, (SubLObject)module0252.$ic23$);
                                            }
                                        }
                                        final SubLObject var7_362 = module0141.$g1665$.currentBinding(var311);
                                        final SubLObject var8_361 = module0139.$g1648$.currentBinding(var311);
                                        final SubLObject var9_361 = module0141.$g1694$.currentBinding(var311);
                                        final SubLObject var10_370 = module0141.$g1693$.currentBinding(var311);
                                        final SubLObject var11_371 = module0141.$g1664$.currentBinding(var311);
                                        try {
                                            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var311);
                                            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var311)), var311);
                                            module0141.$g1694$.bind(var310, var311);
                                            module0141.$g1693$.bind((SubLObject)module0252.$ic24$, var311);
                                            module0141.$g1664$.bind((SubLObject)module0252.$ic17$, var311);
                                            if (module0252.NIL != module0136.f8865() || module0252.NIL != module0244.f15795(var2, module0137.f8955((SubLObject)module0252.UNPROVIDED))) {
                                                module0250.f16162(module0141.f9171(), var2);
                                            }
                                            else {
                                                module0136.f8872((SubLObject)module0252.TWO_INTEGER, (SubLObject)module0252.$ic15$, var2, module0244.f15748(module0137.f8955((SubLObject)module0252.UNPROVIDED)), (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                            }
                                        }
                                        finally {
                                            module0141.$g1664$.rebind(var11_371, var311);
                                            module0141.$g1693$.rebind(var10_370, var311);
                                            module0141.$g1694$.rebind(var9_361, var311);
                                            module0139.$g1648$.rebind(var8_361, var311);
                                            module0141.$g1665$.rebind(var7_362, var311);
                                        }
                                    }
                                    finally {
                                        if (module0252.NIL != var322) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var321);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_370, var311);
                                    module0141.$g1684$.rebind(var10_369, var311);
                                    module0141.$g1683$.rebind(var9_360, var311);
                                    module0141.$g1686$.rebind(var8_360, var311);
                                    module0141.$g1685$.rebind(var7_361, var311);
                                }
                                if (var320 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var311));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_360, var311);
                            }
                            if (var320 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var311));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_359, var311);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_359, var311);
                        module0141.$g1677$.rebind(var8_359, var311);
                        module0141.$g1710$.rebind(var7_358, var311);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_358, var311);
                    module0141.$g1714$.rebind(var7_357, var311);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_358, var311);
                module0147.$g2094$.rebind(var8_357, var311);
                module0147.$g2095$.rebind(var7_356, var311);
            }
        }
        finally {
            module0137.$g1605$.rebind(var316, var311);
            module0141.$g1674$.rebind(var315, var311);
            module0141.$g1672$.rebind(var314, var311);
            module0141.$g1671$.rebind(var313, var311);
            module0141.$g1670$.rebind(var312, var311);
        }
        return (SubLObject)module0252.NIL;
    }
    
    public static SubLObject f16273(final SubLObject var1, final SubLObject var2, final SubLObject var310, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var311 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        final SubLObject var312 = module0141.$g1670$.currentBinding(var311);
        final SubLObject var313 = module0141.$g1671$.currentBinding(var311);
        final SubLObject var314 = module0141.$g1672$.currentBinding(var311);
        final SubLObject var315 = module0141.$g1674$.currentBinding(var311);
        final SubLObject var316 = module0137.$g1605$.currentBinding(var311);
        try {
            module0141.$g1670$.bind(var1, var311);
            module0141.$g1671$.bind(module0244.f15739(var1), var311);
            module0141.$g1672$.bind(module0244.f15746(var1), var311);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var311);
            module0137.$g1605$.bind(var1, var311);
            final SubLObject var317 = var3;
            final SubLObject var7_376 = module0147.$g2095$.currentBinding(var311);
            final SubLObject var8_377 = module0147.$g2094$.currentBinding(var311);
            final SubLObject var9_378 = module0147.$g2096$.currentBinding(var311);
            try {
                module0147.$g2095$.bind(module0147.f9545(var317), var311);
                module0147.$g2094$.bind(module0147.f9546(var317), var311);
                module0147.$g2096$.bind(module0147.f9549(var317), var311);
                final SubLObject var318 = var4;
                final SubLObject var7_377 = module0141.$g1714$.currentBinding(var311);
                final SubLObject var8_378 = module0141.$g1715$.currentBinding(var311);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var318) ? var318 : module0141.f9283(), var311);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var318) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var311)), var311);
                    if (module0252.NIL != var318 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var318)) {
                        final SubLObject var319 = module0136.$g1591$.getDynamicValue(var311);
                        if (var319.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var318, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var319.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var318, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var319.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var318, (SubLObject)module0252.$ic4$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var311));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var318, (SubLObject)module0252.$ic4$);
                        }
                    }
                    final SubLObject var7_378 = module0141.$g1710$.currentBinding(var311);
                    final SubLObject var8_379 = module0141.$g1677$.currentBinding(var311);
                    final SubLObject var9_379 = module0138.$g1619$.currentBinding(var311);
                    try {
                        module0141.$g1710$.bind(module0252.$ic9$, var311);
                        module0141.$g1677$.bind(module0141.f9210(), var311);
                        module0138.$g1619$.bind(module0244.f15780(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var311);
                        final SubLObject var320 = module0139.f9036();
                        final SubLObject var7_379 = module0139.$g1635$.currentBinding(var311);
                        try {
                            module0139.$g1635$.bind((var320 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var311) : module0139.f9038(var320), var311);
                            final SubLObject var7_380 = module0139.$g1636$.currentBinding(var311);
                            try {
                                module0139.$g1636$.bind((var320 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var311) : module0139.f9038(var320), var311);
                                final SubLObject var7_381 = module0141.$g1685$.currentBinding(var311);
                                final SubLObject var8_380 = module0141.$g1686$.currentBinding(var311);
                                final SubLObject var9_380 = module0141.$g1683$.currentBinding(var311);
                                final SubLObject var10_389 = module0141.$g1684$.currentBinding(var311);
                                final SubLObject var11_390 = module0141.$g1674$.currentBinding(var311);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var311);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var311);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var311);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var311);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var311);
                                    final SubLObject var321 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var322 = (SubLObject)module0252.NIL;
                                    try {
                                        var322 = ReadWriteLocks.rw_lock_seize_read_lock(var321);
                                        if (module0252.NIL != module0136.f8864() && !var310.isFunctionSpec()) {
                                            final SubLObject var323 = module0136.$g1591$.getDynamicValue(var311);
                                            if (var323.eql((SubLObject)module0252.$ic2$)) {
                                                module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var310, (SubLObject)module0252.$ic23$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                            }
                                            else if (var323.eql((SubLObject)module0252.$ic5$)) {
                                                module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var310, (SubLObject)module0252.$ic23$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                            }
                                            else if (var323.eql((SubLObject)module0252.$ic7$)) {
                                                Errors.warn((SubLObject)module0252.$ic3$, var310, (SubLObject)module0252.$ic23$);
                                            }
                                            else {
                                                Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var311));
                                                Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var310, (SubLObject)module0252.$ic23$);
                                            }
                                        }
                                        final SubLObject var7_382 = module0141.$g1672$.currentBinding(var311);
                                        final SubLObject var8_381 = module0141.$g1665$.currentBinding(var311);
                                        final SubLObject var9_381 = module0139.$g1648$.currentBinding(var311);
                                        final SubLObject var10_390 = module0141.$g1694$.currentBinding(var311);
                                        final SubLObject var11_391 = module0141.$g1693$.currentBinding(var311);
                                        final SubLObject var324 = module0141.$g1664$.currentBinding(var311);
                                        try {
                                            module0141.$g1672$.bind((SubLObject)module0252.NIL, var311);
                                            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var311);
                                            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var311)), var311);
                                            module0141.$g1694$.bind(var310, var311);
                                            module0141.$g1693$.bind((SubLObject)module0252.$ic24$, var311);
                                            module0141.$g1664$.bind((SubLObject)module0252.$ic17$, var311);
                                            if (module0252.NIL != module0136.f8865() || module0252.NIL != module0244.f15795(var2, module0137.f8955((SubLObject)module0252.UNPROVIDED))) {
                                                module0250.f16162(module0141.f9171(), var2);
                                            }
                                            else {
                                                module0136.f8872((SubLObject)module0252.TWO_INTEGER, (SubLObject)module0252.$ic15$, var2, module0244.f15748(module0137.f8955((SubLObject)module0252.UNPROVIDED)), (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                            }
                                        }
                                        finally {
                                            module0141.$g1664$.rebind(var324, var311);
                                            module0141.$g1693$.rebind(var11_391, var311);
                                            module0141.$g1694$.rebind(var10_390, var311);
                                            module0139.$g1648$.rebind(var9_381, var311);
                                            module0141.$g1665$.rebind(var8_381, var311);
                                            module0141.$g1672$.rebind(var7_382, var311);
                                        }
                                    }
                                    finally {
                                        if (module0252.NIL != var322) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var321);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_390, var311);
                                    module0141.$g1684$.rebind(var10_389, var311);
                                    module0141.$g1683$.rebind(var9_380, var311);
                                    module0141.$g1686$.rebind(var8_380, var311);
                                    module0141.$g1685$.rebind(var7_381, var311);
                                }
                                if (var320 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var311));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_380, var311);
                            }
                            if (var320 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var311));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_379, var311);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_379, var311);
                        module0141.$g1677$.rebind(var8_379, var311);
                        module0141.$g1710$.rebind(var7_378, var311);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_378, var311);
                    module0141.$g1714$.rebind(var7_377, var311);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_378, var311);
                module0147.$g2094$.rebind(var8_377, var311);
                module0147.$g2095$.rebind(var7_376, var311);
            }
        }
        finally {
            module0137.$g1605$.rebind(var316, var311);
            module0141.$g1674$.rebind(var315, var311);
            module0141.$g1672$.rebind(var314, var311);
            module0141.$g1671$.rebind(var313, var311);
            module0141.$g1670$.rebind(var312, var311);
        }
        return (SubLObject)module0252.NIL;
    }
    
    public static SubLObject f16274(final SubLObject var1, final SubLObject var132, final SubLObject var310, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var311 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        final SubLObject var312 = module0141.$g1670$.currentBinding(var311);
        final SubLObject var313 = module0141.$g1671$.currentBinding(var311);
        final SubLObject var314 = module0141.$g1672$.currentBinding(var311);
        final SubLObject var315 = module0141.$g1674$.currentBinding(var311);
        final SubLObject var316 = module0137.$g1605$.currentBinding(var311);
        try {
            module0141.$g1670$.bind(var1, var311);
            module0141.$g1671$.bind(module0244.f15739(var1), var311);
            module0141.$g1672$.bind(module0244.f15746(var1), var311);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var311);
            module0137.$g1605$.bind(var1, var311);
            final SubLObject var317 = var3;
            final SubLObject var7_396 = module0147.$g2095$.currentBinding(var311);
            final SubLObject var8_397 = module0147.$g2094$.currentBinding(var311);
            final SubLObject var9_398 = module0147.$g2096$.currentBinding(var311);
            try {
                module0147.$g2095$.bind(module0147.f9545(var317), var311);
                module0147.$g2094$.bind(module0147.f9546(var317), var311);
                module0147.$g2096$.bind(module0147.f9549(var317), var311);
                final SubLObject var318 = var4;
                final SubLObject var7_397 = module0141.$g1714$.currentBinding(var311);
                final SubLObject var8_398 = module0141.$g1715$.currentBinding(var311);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var318) ? var318 : module0141.f9283(), var311);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var318) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var311)), var311);
                    if (module0252.NIL != var318 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var318)) {
                        final SubLObject var319 = module0136.$g1591$.getDynamicValue(var311);
                        if (var319.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var318, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var319.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var318, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var319.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var318, (SubLObject)module0252.$ic4$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var311));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var318, (SubLObject)module0252.$ic4$);
                        }
                    }
                    final SubLObject var7_398 = module0141.$g1710$.currentBinding(var311);
                    final SubLObject var8_399 = module0141.$g1677$.currentBinding(var311);
                    final SubLObject var9_399 = module0138.$g1619$.currentBinding(var311);
                    try {
                        module0141.$g1710$.bind(module0252.$ic9$, var311);
                        module0141.$g1677$.bind(module0141.f9208(), var311);
                        module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var311);
                        final SubLObject var320 = module0139.f9036();
                        final SubLObject var7_399 = module0139.$g1635$.currentBinding(var311);
                        try {
                            module0139.$g1635$.bind((var320 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var311) : module0139.f9038(var320), var311);
                            final SubLObject var7_400 = module0139.$g1636$.currentBinding(var311);
                            try {
                                module0139.$g1636$.bind((var320 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var311) : module0139.f9038(var320), var311);
                                final SubLObject var7_401 = module0141.$g1685$.currentBinding(var311);
                                final SubLObject var8_400 = module0141.$g1686$.currentBinding(var311);
                                final SubLObject var9_400 = module0141.$g1683$.currentBinding(var311);
                                final SubLObject var10_409 = module0141.$g1684$.currentBinding(var311);
                                final SubLObject var11_410 = module0141.$g1674$.currentBinding(var311);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var311);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var311);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var311);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var311);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var311);
                                    final SubLObject var321 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var322 = (SubLObject)module0252.NIL;
                                    try {
                                        var322 = ReadWriteLocks.rw_lock_seize_read_lock(var321);
                                        if (module0252.NIL != module0136.f8864() && !var310.isFunctionSpec()) {
                                            final SubLObject var323 = module0136.$g1591$.getDynamicValue(var311);
                                            if (var323.eql((SubLObject)module0252.$ic2$)) {
                                                module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var310, (SubLObject)module0252.$ic23$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                            }
                                            else if (var323.eql((SubLObject)module0252.$ic5$)) {
                                                module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var310, (SubLObject)module0252.$ic23$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                            }
                                            else if (var323.eql((SubLObject)module0252.$ic7$)) {
                                                Errors.warn((SubLObject)module0252.$ic3$, var310, (SubLObject)module0252.$ic23$);
                                            }
                                            else {
                                                Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var311));
                                                Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var310, (SubLObject)module0252.$ic23$);
                                            }
                                        }
                                        final SubLObject var7_402 = module0141.$g1665$.currentBinding(var311);
                                        final SubLObject var8_401 = module0139.$g1648$.currentBinding(var311);
                                        final SubLObject var9_401 = module0141.$g1694$.currentBinding(var311);
                                        final SubLObject var10_410 = module0141.$g1693$.currentBinding(var311);
                                        final SubLObject var11_411 = module0141.$g1664$.currentBinding(var311);
                                        try {
                                            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var311);
                                            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var311)), var311);
                                            module0141.$g1694$.bind(var310, var311);
                                            module0141.$g1693$.bind((SubLObject)module0252.$ic24$, var311);
                                            module0141.$g1664$.bind((SubLObject)module0252.$ic17$, var311);
                                            final SubLObject var324 = module0141.f9171();
                                            SubLObject var325 = var132;
                                            SubLObject var326 = (SubLObject)module0252.NIL;
                                            var326 = var325.first();
                                            while (module0252.NIL != var325) {
                                                if (module0252.NIL != module0136.f8865() || module0252.NIL != module0244.f15795(var326, module0137.f8955((SubLObject)module0252.UNPROVIDED))) {
                                                    final SubLObject var7_403 = module0141.$g1674$.currentBinding(var311);
                                                    final SubLObject var8_402 = module0141.$g1683$.currentBinding(var311);
                                                    try {
                                                        module0141.$g1674$.bind((SubLObject)module0252.NIL, var311);
                                                        module0141.$g1683$.bind((SubLObject)module0252.NIL, var311);
                                                        module0250.f16162(var324, var326);
                                                    }
                                                    finally {
                                                        module0141.$g1683$.rebind(var8_402, var311);
                                                        module0141.$g1674$.rebind(var7_403, var311);
                                                    }
                                                }
                                                else {
                                                    module0136.f8872((SubLObject)module0252.TWO_INTEGER, (SubLObject)module0252.$ic15$, var326, module0244.f15748(module0137.f8955((SubLObject)module0252.UNPROVIDED)), (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                                }
                                                var325 = var325.rest();
                                                var326 = var325.first();
                                            }
                                        }
                                        finally {
                                            module0141.$g1664$.rebind(var11_411, var311);
                                            module0141.$g1693$.rebind(var10_410, var311);
                                            module0141.$g1694$.rebind(var9_401, var311);
                                            module0139.$g1648$.rebind(var8_401, var311);
                                            module0141.$g1665$.rebind(var7_402, var311);
                                        }
                                    }
                                    finally {
                                        if (module0252.NIL != var322) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var321);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_410, var311);
                                    module0141.$g1684$.rebind(var10_409, var311);
                                    module0141.$g1683$.rebind(var9_400, var311);
                                    module0141.$g1686$.rebind(var8_400, var311);
                                    module0141.$g1685$.rebind(var7_401, var311);
                                }
                                if (var320 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var311));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_400, var311);
                            }
                            if (var320 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var311));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_399, var311);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_399, var311);
                        module0141.$g1677$.rebind(var8_399, var311);
                        module0141.$g1710$.rebind(var7_398, var311);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_398, var311);
                    module0141.$g1714$.rebind(var7_397, var311);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_398, var311);
                module0147.$g2094$.rebind(var8_397, var311);
                module0147.$g2095$.rebind(var7_396, var311);
            }
        }
        finally {
            module0137.$g1605$.rebind(var316, var311);
            module0141.$g1674$.rebind(var315, var311);
            module0141.$g1672$.rebind(var314, var311);
            module0141.$g1671$.rebind(var313, var311);
            module0141.$g1670$.rebind(var312, var311);
        }
        return (SubLObject)module0252.NIL;
    }
    
    public static SubLObject f16275(final SubLObject var1, final SubLObject var132, final SubLObject var310, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var311 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        final SubLObject var312 = module0141.$g1670$.currentBinding(var311);
        final SubLObject var313 = module0141.$g1671$.currentBinding(var311);
        final SubLObject var314 = module0141.$g1672$.currentBinding(var311);
        final SubLObject var315 = module0141.$g1674$.currentBinding(var311);
        final SubLObject var316 = module0137.$g1605$.currentBinding(var311);
        try {
            module0141.$g1670$.bind(var1, var311);
            module0141.$g1671$.bind(module0244.f15739(var1), var311);
            module0141.$g1672$.bind(module0244.f15746(var1), var311);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var311);
            module0137.$g1605$.bind(var1, var311);
            final SubLObject var317 = var3;
            final SubLObject var7_418 = module0147.$g2095$.currentBinding(var311);
            final SubLObject var8_419 = module0147.$g2094$.currentBinding(var311);
            final SubLObject var9_420 = module0147.$g2096$.currentBinding(var311);
            try {
                module0147.$g2095$.bind(module0147.f9545(var317), var311);
                module0147.$g2094$.bind(module0147.f9546(var317), var311);
                module0147.$g2096$.bind(module0147.f9549(var317), var311);
                final SubLObject var318 = var4;
                final SubLObject var7_419 = module0141.$g1714$.currentBinding(var311);
                final SubLObject var8_420 = module0141.$g1715$.currentBinding(var311);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var318) ? var318 : module0141.f9283(), var311);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var318) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var311)), var311);
                    if (module0252.NIL != var318 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var318)) {
                        final SubLObject var319 = module0136.$g1591$.getDynamicValue(var311);
                        if (var319.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var318, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var319.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var318, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var319.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var318, (SubLObject)module0252.$ic4$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var311));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var318, (SubLObject)module0252.$ic4$);
                        }
                    }
                    final SubLObject var7_420 = module0141.$g1710$.currentBinding(var311);
                    final SubLObject var8_421 = module0141.$g1677$.currentBinding(var311);
                    final SubLObject var9_421 = module0138.$g1619$.currentBinding(var311);
                    try {
                        module0141.$g1710$.bind(module0252.$ic9$, var311);
                        module0141.$g1677$.bind(module0141.f9210(), var311);
                        module0138.$g1619$.bind(module0244.f15780(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var311);
                        final SubLObject var320 = module0139.f9036();
                        final SubLObject var7_421 = module0139.$g1635$.currentBinding(var311);
                        try {
                            module0139.$g1635$.bind((var320 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var311) : module0139.f9038(var320), var311);
                            final SubLObject var7_422 = module0139.$g1636$.currentBinding(var311);
                            try {
                                module0139.$g1636$.bind((var320 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var311) : module0139.f9038(var320), var311);
                                final SubLObject var7_423 = module0141.$g1685$.currentBinding(var311);
                                final SubLObject var8_422 = module0141.$g1686$.currentBinding(var311);
                                final SubLObject var9_422 = module0141.$g1683$.currentBinding(var311);
                                final SubLObject var10_431 = module0141.$g1684$.currentBinding(var311);
                                final SubLObject var11_432 = module0141.$g1674$.currentBinding(var311);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var311);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var311);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var311);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var311);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var311);
                                    final SubLObject var321 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var322 = (SubLObject)module0252.NIL;
                                    try {
                                        var322 = ReadWriteLocks.rw_lock_seize_read_lock(var321);
                                        if (module0252.NIL != module0136.f8864() && !var310.isFunctionSpec()) {
                                            final SubLObject var323 = module0136.$g1591$.getDynamicValue(var311);
                                            if (var323.eql((SubLObject)module0252.$ic2$)) {
                                                module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var310, (SubLObject)module0252.$ic23$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                            }
                                            else if (var323.eql((SubLObject)module0252.$ic5$)) {
                                                module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var310, (SubLObject)module0252.$ic23$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                            }
                                            else if (var323.eql((SubLObject)module0252.$ic7$)) {
                                                Errors.warn((SubLObject)module0252.$ic3$, var310, (SubLObject)module0252.$ic23$);
                                            }
                                            else {
                                                Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var311));
                                                Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var310, (SubLObject)module0252.$ic23$);
                                            }
                                        }
                                        final SubLObject var7_424 = module0141.$g1665$.currentBinding(var311);
                                        final SubLObject var8_423 = module0139.$g1648$.currentBinding(var311);
                                        final SubLObject var9_423 = module0141.$g1694$.currentBinding(var311);
                                        final SubLObject var10_432 = module0141.$g1693$.currentBinding(var311);
                                        final SubLObject var11_433 = module0141.$g1664$.currentBinding(var311);
                                        try {
                                            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var311);
                                            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var311)), var311);
                                            module0141.$g1694$.bind(var310, var311);
                                            module0141.$g1693$.bind((SubLObject)module0252.$ic24$, var311);
                                            module0141.$g1664$.bind((SubLObject)module0252.$ic17$, var311);
                                            final SubLObject var324 = module0141.f9171();
                                            SubLObject var325 = var132;
                                            SubLObject var326 = (SubLObject)module0252.NIL;
                                            var326 = var325.first();
                                            while (module0252.NIL != var325) {
                                                if (module0252.NIL != module0136.f8865() || module0252.NIL != module0244.f15795(var326, module0137.f8955((SubLObject)module0252.UNPROVIDED))) {
                                                    final SubLObject var7_425 = module0141.$g1674$.currentBinding(var311);
                                                    final SubLObject var8_424 = module0141.$g1683$.currentBinding(var311);
                                                    try {
                                                        module0141.$g1674$.bind((SubLObject)module0252.NIL, var311);
                                                        module0141.$g1683$.bind((SubLObject)module0252.NIL, var311);
                                                        module0250.f16162(var324, var326);
                                                    }
                                                    finally {
                                                        module0141.$g1683$.rebind(var8_424, var311);
                                                        module0141.$g1674$.rebind(var7_425, var311);
                                                    }
                                                }
                                                else {
                                                    module0136.f8872((SubLObject)module0252.TWO_INTEGER, (SubLObject)module0252.$ic15$, var326, module0244.f15748(module0137.f8955((SubLObject)module0252.UNPROVIDED)), (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                                }
                                                var325 = var325.rest();
                                                var326 = var325.first();
                                            }
                                        }
                                        finally {
                                            module0141.$g1664$.rebind(var11_433, var311);
                                            module0141.$g1693$.rebind(var10_432, var311);
                                            module0141.$g1694$.rebind(var9_423, var311);
                                            module0139.$g1648$.rebind(var8_423, var311);
                                            module0141.$g1665$.rebind(var7_424, var311);
                                        }
                                    }
                                    finally {
                                        if (module0252.NIL != var322) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var321);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_432, var311);
                                    module0141.$g1684$.rebind(var10_431, var311);
                                    module0141.$g1683$.rebind(var9_422, var311);
                                    module0141.$g1686$.rebind(var8_422, var311);
                                    module0141.$g1685$.rebind(var7_423, var311);
                                }
                                if (var320 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var311));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_422, var311);
                            }
                            if (var320 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var311));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_421, var311);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_421, var311);
                        module0141.$g1677$.rebind(var8_421, var311);
                        module0141.$g1710$.rebind(var7_420, var311);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_420, var311);
                    module0141.$g1714$.rebind(var7_419, var311);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_420, var311);
                module0147.$g2094$.rebind(var8_419, var311);
                module0147.$g2095$.rebind(var7_418, var311);
            }
        }
        finally {
            module0137.$g1605$.rebind(var316, var311);
            module0141.$g1674$.rebind(var315, var311);
            module0141.$g1672$.rebind(var314, var311);
            module0141.$g1671$.rebind(var313, var311);
            module0141.$g1670$.rebind(var312, var311);
        }
        return (SubLObject)module0252.NIL;
    }
    
    public static SubLObject f16276(final SubLObject var1, final SubLObject var132, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var133 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        final SubLObject var134 = module0141.$g1670$.currentBinding(var133);
        final SubLObject var135 = module0141.$g1671$.currentBinding(var133);
        final SubLObject var136 = module0141.$g1672$.currentBinding(var133);
        final SubLObject var137 = module0141.$g1674$.currentBinding(var133);
        final SubLObject var138 = module0137.$g1605$.currentBinding(var133);
        try {
            module0141.$g1670$.bind(var1, var133);
            module0141.$g1671$.bind(module0244.f15739(var1), var133);
            module0141.$g1672$.bind(module0244.f15746(var1), var133);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var133);
            module0137.$g1605$.bind(var1, var133);
            final SubLObject var139 = var3;
            final SubLObject var7_440 = module0147.$g2095$.currentBinding(var133);
            final SubLObject var8_441 = module0147.$g2094$.currentBinding(var133);
            final SubLObject var9_442 = module0147.$g2096$.currentBinding(var133);
            try {
                module0147.$g2095$.bind(module0147.f9545(var139), var133);
                module0147.$g2094$.bind(module0147.f9546(var139), var133);
                module0147.$g2096$.bind(module0147.f9549(var139), var133);
                final SubLObject var140 = var4;
                final SubLObject var7_441 = module0141.$g1714$.currentBinding(var133);
                final SubLObject var8_442 = module0141.$g1715$.currentBinding(var133);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var140) ? var140 : module0141.f9283(), var133);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var140) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var133)), var133);
                    if (module0252.NIL != var140 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var140)) {
                        final SubLObject var141 = module0136.$g1591$.getDynamicValue(var133);
                        if (var141.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var140, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var141.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var140, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var141.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var140, (SubLObject)module0252.$ic4$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var133));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var140, (SubLObject)module0252.$ic4$);
                        }
                    }
                    final SubLObject var7_442 = module0141.$g1710$.currentBinding(var133);
                    final SubLObject var8_443 = module0141.$g1677$.currentBinding(var133);
                    final SubLObject var9_443 = module0138.$g1619$.currentBinding(var133);
                    try {
                        module0141.$g1710$.bind(module0252.$ic9$, var133);
                        module0141.$g1677$.bind(module0141.f9210(), var133);
                        module0138.$g1619$.bind(module0244.f15780(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var133);
                        final SubLObject var142 = module0139.f9036();
                        final SubLObject var7_443 = module0139.$g1635$.currentBinding(var133);
                        try {
                            module0139.$g1635$.bind((var142 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var133) : module0139.f9038(var142), var133);
                            final SubLObject var7_444 = module0139.$g1636$.currentBinding(var133);
                            try {
                                module0139.$g1636$.bind((var142 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var133) : module0139.f9038(var142), var133);
                                final SubLObject var7_445 = module0141.$g1685$.currentBinding(var133);
                                final SubLObject var8_444 = module0141.$g1686$.currentBinding(var133);
                                final SubLObject var9_444 = module0141.$g1683$.currentBinding(var133);
                                final SubLObject var10_453 = module0141.$g1684$.currentBinding(var133);
                                final SubLObject var11_454 = module0141.$g1674$.currentBinding(var133);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var133);
                                    final SubLObject var143 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var144 = (SubLObject)module0252.NIL;
                                    try {
                                        var144 = ReadWriteLocks.rw_lock_seize_read_lock(var143);
                                        final SubLObject var7_446 = module0141.$g1672$.currentBinding(var133);
                                        final SubLObject var8_445 = module0141.$g1665$.currentBinding(var133);
                                        final SubLObject var9_445 = module0139.$g1648$.currentBinding(var133);
                                        final SubLObject var10_454 = module0141.$g1693$.currentBinding(var133);
                                        final SubLObject var11_455 = module0141.$g1664$.currentBinding(var133);
                                        try {
                                            module0141.$g1672$.bind((SubLObject)module0252.NIL, var133);
                                            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var133);
                                            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var133)), var133);
                                            module0141.$g1693$.bind((SubLObject)module0252.$ic11$, var133);
                                            module0141.$g1664$.bind((SubLObject)module0252.$ic17$, var133);
                                            final SubLObject var145 = module0141.f9171();
                                            SubLObject var146 = var132;
                                            SubLObject var147 = (SubLObject)module0252.NIL;
                                            var147 = var146.first();
                                            while (module0252.NIL != var146) {
                                                if (module0252.NIL != module0136.f8865() || module0252.NIL != module0244.f15795(var147, module0137.f8955((SubLObject)module0252.UNPROVIDED))) {
                                                    module0250.f16162(var145, var147);
                                                }
                                                else {
                                                    module0136.f8872((SubLObject)module0252.TWO_INTEGER, (SubLObject)module0252.$ic15$, var147, module0244.f15748(module0137.f8955((SubLObject)module0252.UNPROVIDED)), (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                                }
                                                var146 = var146.rest();
                                                var147 = var146.first();
                                            }
                                        }
                                        finally {
                                            module0141.$g1664$.rebind(var11_455, var133);
                                            module0141.$g1693$.rebind(var10_454, var133);
                                            module0139.$g1648$.rebind(var9_445, var133);
                                            module0141.$g1665$.rebind(var8_445, var133);
                                            module0141.$g1672$.rebind(var7_446, var133);
                                        }
                                    }
                                    finally {
                                        if (module0252.NIL != var144) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var143);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_454, var133);
                                    module0141.$g1684$.rebind(var10_453, var133);
                                    module0141.$g1683$.rebind(var9_444, var133);
                                    module0141.$g1686$.rebind(var8_444, var133);
                                    module0141.$g1685$.rebind(var7_445, var133);
                                }
                                if (var142 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var133));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_444, var133);
                            }
                            if (var142 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var133));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_443, var133);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_443, var133);
                        module0141.$g1677$.rebind(var8_443, var133);
                        module0141.$g1710$.rebind(var7_442, var133);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_442, var133);
                    module0141.$g1714$.rebind(var7_441, var133);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_442, var133);
                module0147.$g2094$.rebind(var8_441, var133);
                module0147.$g2095$.rebind(var7_440, var133);
            }
        }
        finally {
            module0137.$g1605$.rebind(var138, var133);
            module0141.$g1674$.rebind(var137, var133);
            module0141.$g1672$.rebind(var136, var133);
            module0141.$g1671$.rebind(var135, var133);
            module0141.$g1670$.rebind(var134, var133);
        }
        return (SubLObject)module0252.NIL;
    }
    
    public static SubLObject f16277(final SubLObject var1, final SubLObject var132, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var133 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        final SubLObject var134 = module0141.$g1670$.currentBinding(var133);
        final SubLObject var135 = module0141.$g1671$.currentBinding(var133);
        final SubLObject var136 = module0141.$g1672$.currentBinding(var133);
        final SubLObject var137 = module0141.$g1674$.currentBinding(var133);
        final SubLObject var138 = module0137.$g1605$.currentBinding(var133);
        try {
            module0141.$g1670$.bind(var1, var133);
            module0141.$g1671$.bind(module0244.f15739(var1), var133);
            module0141.$g1672$.bind(module0244.f15746(var1), var133);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var133);
            module0137.$g1605$.bind(var1, var133);
            final SubLObject var139 = var3;
            final SubLObject var7_460 = module0147.$g2095$.currentBinding(var133);
            final SubLObject var8_461 = module0147.$g2094$.currentBinding(var133);
            final SubLObject var9_462 = module0147.$g2096$.currentBinding(var133);
            try {
                module0147.$g2095$.bind(module0147.f9545(var139), var133);
                module0147.$g2094$.bind(module0147.f9546(var139), var133);
                module0147.$g2096$.bind(module0147.f9549(var139), var133);
                final SubLObject var140 = var4;
                final SubLObject var7_461 = module0141.$g1714$.currentBinding(var133);
                final SubLObject var8_462 = module0141.$g1715$.currentBinding(var133);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var140) ? var140 : module0141.f9283(), var133);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var140) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var133)), var133);
                    if (module0252.NIL != var140 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var140)) {
                        final SubLObject var141 = module0136.$g1591$.getDynamicValue(var133);
                        if (var141.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var140, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var141.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var140, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var141.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var140, (SubLObject)module0252.$ic4$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var133));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var140, (SubLObject)module0252.$ic4$);
                        }
                    }
                    final SubLObject var7_462 = module0141.$g1710$.currentBinding(var133);
                    final SubLObject var8_463 = module0141.$g1677$.currentBinding(var133);
                    final SubLObject var9_463 = module0138.$g1619$.currentBinding(var133);
                    try {
                        module0141.$g1710$.bind(module0252.$ic9$, var133);
                        module0141.$g1677$.bind(module0141.f9210(), var133);
                        module0138.$g1619$.bind(module0244.f15780(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var133);
                        final SubLObject var142 = module0139.f9036();
                        final SubLObject var7_463 = module0139.$g1635$.currentBinding(var133);
                        try {
                            module0139.$g1635$.bind((var142 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var133) : module0139.f9038(var142), var133);
                            final SubLObject var7_464 = module0139.$g1636$.currentBinding(var133);
                            try {
                                module0139.$g1636$.bind((var142 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var133) : module0139.f9038(var142), var133);
                                final SubLObject var7_465 = module0141.$g1685$.currentBinding(var133);
                                final SubLObject var8_464 = module0141.$g1686$.currentBinding(var133);
                                final SubLObject var9_464 = module0141.$g1683$.currentBinding(var133);
                                final SubLObject var10_473 = module0141.$g1684$.currentBinding(var133);
                                final SubLObject var11_474 = module0141.$g1674$.currentBinding(var133);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var133);
                                    final SubLObject var143 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var144 = (SubLObject)module0252.NIL;
                                    try {
                                        var144 = ReadWriteLocks.rw_lock_seize_read_lock(var143);
                                        final SubLObject var7_466 = module0141.$g1672$.currentBinding(var133);
                                        final SubLObject var8_465 = module0141.$g1665$.currentBinding(var133);
                                        final SubLObject var9_465 = module0139.$g1648$.currentBinding(var133);
                                        final SubLObject var10_474 = module0141.$g1693$.currentBinding(var133);
                                        final SubLObject var11_475 = module0141.$g1682$.currentBinding(var133);
                                        final SubLObject var145 = module0141.$g1681$.currentBinding(var133);
                                        final SubLObject var146 = module0141.$g1664$.currentBinding(var133);
                                        try {
                                            module0141.$g1672$.bind((SubLObject)module0252.NIL, var133);
                                            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var133);
                                            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var133)), var133);
                                            module0141.$g1693$.bind((SubLObject)module0252.NIL, var133);
                                            module0141.$g1682$.bind((SubLObject)module0252.T, var133);
                                            module0141.$g1681$.bind((SubLObject)module0252.$ic26$, var133);
                                            module0141.$g1664$.bind((SubLObject)module0252.$ic17$, var133);
                                            final SubLObject var147 = module0141.f9171();
                                            SubLObject var148 = var132;
                                            SubLObject var149 = (SubLObject)module0252.NIL;
                                            var149 = var148.first();
                                            while (module0252.NIL != var148) {
                                                if (module0252.NIL != module0136.f8865() || module0252.NIL != module0244.f15795(var149, module0137.f8955((SubLObject)module0252.UNPROVIDED))) {
                                                    module0250.f16162(var147, var149);
                                                }
                                                else {
                                                    module0136.f8872((SubLObject)module0252.TWO_INTEGER, (SubLObject)module0252.$ic15$, var149, module0244.f15748(module0137.f8955((SubLObject)module0252.UNPROVIDED)), (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                                }
                                                var148 = var148.rest();
                                                var149 = var148.first();
                                            }
                                        }
                                        finally {
                                            module0141.$g1664$.rebind(var146, var133);
                                            module0141.$g1681$.rebind(var145, var133);
                                            module0141.$g1682$.rebind(var11_475, var133);
                                            module0141.$g1693$.rebind(var10_474, var133);
                                            module0139.$g1648$.rebind(var9_465, var133);
                                            module0141.$g1665$.rebind(var8_465, var133);
                                            module0141.$g1672$.rebind(var7_466, var133);
                                        }
                                    }
                                    finally {
                                        if (module0252.NIL != var144) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var143);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_474, var133);
                                    module0141.$g1684$.rebind(var10_473, var133);
                                    module0141.$g1683$.rebind(var9_464, var133);
                                    module0141.$g1686$.rebind(var8_464, var133);
                                    module0141.$g1685$.rebind(var7_465, var133);
                                }
                                if (var142 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var133));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_464, var133);
                            }
                            if (var142 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var133));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_463, var133);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_463, var133);
                        module0141.$g1677$.rebind(var8_463, var133);
                        module0141.$g1710$.rebind(var7_462, var133);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_462, var133);
                    module0141.$g1714$.rebind(var7_461, var133);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_462, var133);
                module0147.$g2094$.rebind(var8_461, var133);
                module0147.$g2095$.rebind(var7_460, var133);
            }
        }
        finally {
            module0137.$g1605$.rebind(var138, var133);
            module0141.$g1674$.rebind(var137, var133);
            module0141.$g1672$.rebind(var136, var133);
            module0141.$g1671$.rebind(var135, var133);
            module0141.$g1670$.rebind(var134, var133);
        }
        return (SubLObject)module0252.NIL;
    }
    
    public static SubLObject f16278(final SubLObject var1, final SubLObject var132, final SubLObject var331, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var332 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        final SubLObject var333 = module0141.$g1670$.currentBinding(var332);
        final SubLObject var334 = module0141.$g1671$.currentBinding(var332);
        final SubLObject var335 = module0141.$g1672$.currentBinding(var332);
        final SubLObject var336 = module0141.$g1674$.currentBinding(var332);
        final SubLObject var337 = module0137.$g1605$.currentBinding(var332);
        try {
            module0141.$g1670$.bind(var1, var332);
            module0141.$g1671$.bind(module0244.f15739(var1), var332);
            module0141.$g1672$.bind(module0244.f15746(var1), var332);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var332);
            module0137.$g1605$.bind(var1, var332);
            final SubLObject var338 = var3;
            final SubLObject var7_481 = module0147.$g2095$.currentBinding(var332);
            final SubLObject var8_482 = module0147.$g2094$.currentBinding(var332);
            final SubLObject var9_483 = module0147.$g2096$.currentBinding(var332);
            try {
                module0147.$g2095$.bind(module0147.f9545(var338), var332);
                module0147.$g2094$.bind(module0147.f9546(var338), var332);
                module0147.$g2096$.bind(module0147.f9549(var338), var332);
                final SubLObject var339 = var4;
                final SubLObject var7_482 = module0141.$g1714$.currentBinding(var332);
                final SubLObject var8_483 = module0141.$g1715$.currentBinding(var332);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var339) ? var339 : module0141.f9283(), var332);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var339) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var332)), var332);
                    if (module0252.NIL != var339 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var339)) {
                        final SubLObject var340 = module0136.$g1591$.getDynamicValue(var332);
                        if (var340.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var339, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var340.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var339, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var340.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var339, (SubLObject)module0252.$ic4$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var332));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var339, (SubLObject)module0252.$ic4$);
                        }
                    }
                    final SubLObject var7_483 = module0141.$g1710$.currentBinding(var332);
                    final SubLObject var8_484 = module0141.$g1677$.currentBinding(var332);
                    final SubLObject var9_484 = module0138.$g1619$.currentBinding(var332);
                    try {
                        module0141.$g1710$.bind(module0252.$ic9$, var332);
                        module0141.$g1677$.bind(module0141.f9210(), var332);
                        module0138.$g1619$.bind(module0244.f15780(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var332);
                        final SubLObject var341 = module0139.f9036();
                        final SubLObject var7_484 = module0139.$g1635$.currentBinding(var332);
                        try {
                            module0139.$g1635$.bind((var341 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var332) : module0139.f9038(var341), var332);
                            final SubLObject var7_485 = module0139.$g1636$.currentBinding(var332);
                            try {
                                module0139.$g1636$.bind((var341 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var332) : module0139.f9038(var341), var332);
                                final SubLObject var7_486 = module0141.$g1685$.currentBinding(var332);
                                final SubLObject var8_485 = module0141.$g1686$.currentBinding(var332);
                                final SubLObject var9_485 = module0141.$g1683$.currentBinding(var332);
                                final SubLObject var10_494 = module0141.$g1684$.currentBinding(var332);
                                final SubLObject var11_495 = module0141.$g1674$.currentBinding(var332);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var332);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var332);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var332);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var332);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var332);
                                    final SubLObject var342 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var343 = (SubLObject)module0252.NIL;
                                    try {
                                        var343 = ReadWriteLocks.rw_lock_seize_read_lock(var342);
                                        if (module0252.NIL != module0136.f8864() && !var331.isFunctionSpec()) {
                                            final SubLObject var344 = module0136.$g1591$.getDynamicValue(var332);
                                            if (var344.eql((SubLObject)module0252.$ic2$)) {
                                                module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var331, (SubLObject)module0252.$ic23$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                            }
                                            else if (var344.eql((SubLObject)module0252.$ic5$)) {
                                                module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var331, (SubLObject)module0252.$ic23$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                            }
                                            else if (var344.eql((SubLObject)module0252.$ic7$)) {
                                                Errors.warn((SubLObject)module0252.$ic3$, var331, (SubLObject)module0252.$ic23$);
                                            }
                                            else {
                                                Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var332));
                                                Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var331, (SubLObject)module0252.$ic23$);
                                            }
                                        }
                                        final SubLObject var7_487 = module0141.$g1672$.currentBinding(var332);
                                        final SubLObject var8_486 = module0141.$g1665$.currentBinding(var332);
                                        final SubLObject var9_486 = module0139.$g1648$.currentBinding(var332);
                                        final SubLObject var10_495 = module0141.$g1693$.currentBinding(var332);
                                        final SubLObject var11_496 = module0141.$g1664$.currentBinding(var332);
                                        try {
                                            module0141.$g1672$.bind(var331, var332);
                                            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var332);
                                            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var332)), var332);
                                            module0141.$g1693$.bind((SubLObject)module0252.$ic11$, var332);
                                            module0141.$g1664$.bind((SubLObject)module0252.$ic17$, var332);
                                            final SubLObject var345 = module0141.f9171();
                                            SubLObject var346 = var132;
                                            SubLObject var347 = (SubLObject)module0252.NIL;
                                            var347 = var346.first();
                                            while (module0252.NIL != var346) {
                                                if (module0252.NIL != module0136.f8865() || module0252.NIL != module0244.f15795(var347, module0137.f8955((SubLObject)module0252.UNPROVIDED))) {
                                                    module0250.f16162(var345, var347);
                                                }
                                                else {
                                                    module0136.f8872((SubLObject)module0252.TWO_INTEGER, (SubLObject)module0252.$ic15$, var347, module0244.f15748(module0137.f8955((SubLObject)module0252.UNPROVIDED)), (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                                }
                                                var346 = var346.rest();
                                                var347 = var346.first();
                                            }
                                        }
                                        finally {
                                            module0141.$g1664$.rebind(var11_496, var332);
                                            module0141.$g1693$.rebind(var10_495, var332);
                                            module0139.$g1648$.rebind(var9_486, var332);
                                            module0141.$g1665$.rebind(var8_486, var332);
                                            module0141.$g1672$.rebind(var7_487, var332);
                                        }
                                    }
                                    finally {
                                        if (module0252.NIL != var343) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var342);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_495, var332);
                                    module0141.$g1684$.rebind(var10_494, var332);
                                    module0141.$g1683$.rebind(var9_485, var332);
                                    module0141.$g1686$.rebind(var8_485, var332);
                                    module0141.$g1685$.rebind(var7_486, var332);
                                }
                                if (var341 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var332));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_485, var332);
                            }
                            if (var341 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var332));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_484, var332);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_484, var332);
                        module0141.$g1677$.rebind(var8_484, var332);
                        module0141.$g1710$.rebind(var7_483, var332);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_483, var332);
                    module0141.$g1714$.rebind(var7_482, var332);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_483, var332);
                module0147.$g2094$.rebind(var8_482, var332);
                module0147.$g2095$.rebind(var7_481, var332);
            }
        }
        finally {
            module0137.$g1605$.rebind(var337, var332);
            module0141.$g1674$.rebind(var336, var332);
            module0141.$g1672$.rebind(var335, var332);
            module0141.$g1671$.rebind(var334, var332);
            module0141.$g1670$.rebind(var333, var332);
        }
        return (SubLObject)module0252.NIL;
    }
    
    public static SubLObject f16279(final SubLObject var1, final SubLObject var2, final SubLObject var310, SubLObject var3, SubLObject var4, SubLObject var501) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        if (var501 == module0252.UNPROVIDED) {
            var501 = (SubLObject)module0252.NIL;
        }
        final SubLThread var502 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        final SubLObject var503 = (module0252.NIL != var501) ? var501 : module0141.$g1695$.getDynamicValue(var502);
        SubLObject var504 = (SubLObject)module0252.NIL;
        final SubLObject var505 = module0141.$g1670$.currentBinding(var502);
        final SubLObject var506 = module0141.$g1671$.currentBinding(var502);
        final SubLObject var507 = module0141.$g1672$.currentBinding(var502);
        final SubLObject var508 = module0141.$g1674$.currentBinding(var502);
        final SubLObject var509 = module0137.$g1605$.currentBinding(var502);
        try {
            module0141.$g1670$.bind(var1, var502);
            module0141.$g1671$.bind(module0244.f15739(var1), var502);
            module0141.$g1672$.bind(module0244.f15746(var1), var502);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var502);
            module0137.$g1605$.bind(var1, var502);
            final SubLObject var510 = var3;
            final SubLObject var7_503 = module0147.$g2095$.currentBinding(var502);
            final SubLObject var8_504 = module0147.$g2094$.currentBinding(var502);
            final SubLObject var9_505 = module0147.$g2096$.currentBinding(var502);
            try {
                module0147.$g2095$.bind(module0147.f9545(var510), var502);
                module0147.$g2094$.bind(module0147.f9546(var510), var502);
                module0147.$g2096$.bind(module0147.f9549(var510), var502);
                final SubLObject var511 = var4;
                final SubLObject var7_504 = module0141.$g1714$.currentBinding(var502);
                final SubLObject var8_505 = module0141.$g1715$.currentBinding(var502);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var511) ? var511 : module0141.f9283(), var502);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var511) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var502)), var502);
                    if (module0252.NIL != var511 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var511)) {
                        final SubLObject var512 = module0136.$g1591$.getDynamicValue(var502);
                        if (var512.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var511, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var512.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var511, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var512.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var511, (SubLObject)module0252.$ic4$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var502));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var511, (SubLObject)module0252.$ic4$);
                        }
                    }
                    final SubLObject var7_505 = module0141.$g1710$.currentBinding(var502);
                    final SubLObject var8_506 = module0141.$g1677$.currentBinding(var502);
                    final SubLObject var9_506 = module0138.$g1619$.currentBinding(var502);
                    try {
                        module0141.$g1710$.bind(module0252.$ic9$, var502);
                        module0141.$g1677$.bind(module0141.f9208(), var502);
                        module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var502);
                        final SubLObject var513 = module0139.f9036();
                        final SubLObject var7_506 = module0139.$g1635$.currentBinding(var502);
                        try {
                            module0139.$g1635$.bind((var513 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var502) : module0139.f9038(var513), var502);
                            final SubLObject var7_507 = module0139.$g1636$.currentBinding(var502);
                            try {
                                module0139.$g1636$.bind((var513 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var502) : module0139.f9038(var513), var502);
                                final SubLObject var7_508 = module0141.$g1685$.currentBinding(var502);
                                final SubLObject var8_507 = module0141.$g1686$.currentBinding(var502);
                                final SubLObject var9_507 = module0141.$g1683$.currentBinding(var502);
                                final SubLObject var10_516 = module0141.$g1684$.currentBinding(var502);
                                final SubLObject var11_517 = module0141.$g1674$.currentBinding(var502);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var502);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var502);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var502);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var502);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var502);
                                    final SubLObject var514 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var515 = (SubLObject)module0252.NIL;
                                    try {
                                        var515 = ReadWriteLocks.rw_lock_seize_read_lock(var514);
                                        if (module0252.NIL != module0136.f8864() && !var310.isFunctionSpec()) {
                                            final SubLObject var516 = module0136.$g1591$.getDynamicValue(var502);
                                            if (var516.eql((SubLObject)module0252.$ic2$)) {
                                                module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var310, (SubLObject)module0252.$ic23$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                            }
                                            else if (var516.eql((SubLObject)module0252.$ic5$)) {
                                                module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var310, (SubLObject)module0252.$ic23$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                            }
                                            else if (var516.eql((SubLObject)module0252.$ic7$)) {
                                                Errors.warn((SubLObject)module0252.$ic3$, var310, (SubLObject)module0252.$ic23$);
                                            }
                                            else {
                                                Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var502));
                                                Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var310, (SubLObject)module0252.$ic23$);
                                            }
                                        }
                                        final SubLObject var7_509 = module0141.$g1665$.currentBinding(var502);
                                        final SubLObject var8_508 = module0139.$g1648$.currentBinding(var502);
                                        try {
                                            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var502);
                                            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var502)), var502);
                                            var504 = f16280(var2, var310, var503);
                                        }
                                        finally {
                                            module0139.$g1648$.rebind(var8_508, var502);
                                            module0141.$g1665$.rebind(var7_509, var502);
                                        }
                                    }
                                    finally {
                                        if (module0252.NIL != var515) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var514);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_517, var502);
                                    module0141.$g1684$.rebind(var10_516, var502);
                                    module0141.$g1683$.rebind(var9_507, var502);
                                    module0141.$g1686$.rebind(var8_507, var502);
                                    module0141.$g1685$.rebind(var7_508, var502);
                                }
                                if (var513 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var502));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_507, var502);
                            }
                            if (var513 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var502));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_506, var502);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_506, var502);
                        module0141.$g1677$.rebind(var8_506, var502);
                        module0141.$g1710$.rebind(var7_505, var502);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_505, var502);
                    module0141.$g1714$.rebind(var7_504, var502);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_505, var502);
                module0147.$g2094$.rebind(var8_504, var502);
                module0147.$g2095$.rebind(var7_503, var502);
            }
        }
        finally {
            module0137.$g1605$.rebind(var509, var502);
            module0141.$g1674$.rebind(var508, var502);
            module0141.$g1672$.rebind(var507, var502);
            module0141.$g1671$.rebind(var506, var502);
            module0141.$g1670$.rebind(var505, var502);
        }
        return var504;
    }
    
    public static SubLObject f16281(final SubLObject var1, final SubLObject var2, final SubLObject var310, SubLObject var3, SubLObject var4, SubLObject var501) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        if (var501 == module0252.UNPROVIDED) {
            var501 = (SubLObject)module0252.NIL;
        }
        final SubLThread var502 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        final SubLObject var503 = (module0252.NIL != var501) ? var501 : module0141.$g1695$.getDynamicValue(var502);
        SubLObject var504 = (SubLObject)module0252.NIL;
        final SubLObject var505 = module0141.$g1670$.currentBinding(var502);
        final SubLObject var506 = module0141.$g1671$.currentBinding(var502);
        final SubLObject var507 = module0141.$g1672$.currentBinding(var502);
        final SubLObject var508 = module0141.$g1674$.currentBinding(var502);
        final SubLObject var509 = module0137.$g1605$.currentBinding(var502);
        try {
            module0141.$g1670$.bind(var1, var502);
            module0141.$g1671$.bind(module0244.f15739(var1), var502);
            module0141.$g1672$.bind(module0244.f15746(var1), var502);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var502);
            module0137.$g1605$.bind(var1, var502);
            final SubLObject var510 = var3;
            final SubLObject var7_520 = module0147.$g2095$.currentBinding(var502);
            final SubLObject var8_521 = module0147.$g2094$.currentBinding(var502);
            final SubLObject var9_522 = module0147.$g2096$.currentBinding(var502);
            try {
                module0147.$g2095$.bind(module0147.f9545(var510), var502);
                module0147.$g2094$.bind(module0147.f9546(var510), var502);
                module0147.$g2096$.bind(module0147.f9549(var510), var502);
                final SubLObject var511 = var4;
                final SubLObject var7_521 = module0141.$g1714$.currentBinding(var502);
                final SubLObject var8_522 = module0141.$g1715$.currentBinding(var502);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var511) ? var511 : module0141.f9283(), var502);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var511) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var502)), var502);
                    if (module0252.NIL != var511 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var511)) {
                        final SubLObject var512 = module0136.$g1591$.getDynamicValue(var502);
                        if (var512.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var511, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var512.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var511, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var512.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var511, (SubLObject)module0252.$ic4$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var502));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var511, (SubLObject)module0252.$ic4$);
                        }
                    }
                    final SubLObject var7_522 = module0141.$g1710$.currentBinding(var502);
                    final SubLObject var8_523 = module0141.$g1677$.currentBinding(var502);
                    final SubLObject var9_523 = module0138.$g1619$.currentBinding(var502);
                    try {
                        module0141.$g1710$.bind(module0252.$ic9$, var502);
                        module0141.$g1677$.bind(module0141.f9210(), var502);
                        module0138.$g1619$.bind(module0244.f15780(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var502);
                        final SubLObject var513 = module0139.f9036();
                        final SubLObject var7_523 = module0139.$g1635$.currentBinding(var502);
                        try {
                            module0139.$g1635$.bind((var513 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var502) : module0139.f9038(var513), var502);
                            final SubLObject var7_524 = module0139.$g1636$.currentBinding(var502);
                            try {
                                module0139.$g1636$.bind((var513 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var502) : module0139.f9038(var513), var502);
                                final SubLObject var7_525 = module0141.$g1685$.currentBinding(var502);
                                final SubLObject var8_524 = module0141.$g1686$.currentBinding(var502);
                                final SubLObject var9_524 = module0141.$g1683$.currentBinding(var502);
                                final SubLObject var10_533 = module0141.$g1684$.currentBinding(var502);
                                final SubLObject var11_534 = module0141.$g1674$.currentBinding(var502);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var502);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var502);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var502);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var502);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var502);
                                    final SubLObject var514 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var515 = (SubLObject)module0252.NIL;
                                    try {
                                        var515 = ReadWriteLocks.rw_lock_seize_read_lock(var514);
                                        if (module0252.NIL != module0136.f8864() && !var310.isFunctionSpec()) {
                                            final SubLObject var516 = module0136.$g1591$.getDynamicValue(var502);
                                            if (var516.eql((SubLObject)module0252.$ic2$)) {
                                                module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var310, (SubLObject)module0252.$ic23$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                            }
                                            else if (var516.eql((SubLObject)module0252.$ic5$)) {
                                                module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var310, (SubLObject)module0252.$ic23$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                            }
                                            else if (var516.eql((SubLObject)module0252.$ic7$)) {
                                                Errors.warn((SubLObject)module0252.$ic3$, var310, (SubLObject)module0252.$ic23$);
                                            }
                                            else {
                                                Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var502));
                                                Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var310, (SubLObject)module0252.$ic23$);
                                            }
                                        }
                                        final SubLObject var7_526 = module0141.$g1665$.currentBinding(var502);
                                        final SubLObject var8_525 = module0139.$g1648$.currentBinding(var502);
                                        try {
                                            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var502);
                                            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var502)), var502);
                                            var504 = f16280(var2, var310, var503);
                                        }
                                        finally {
                                            module0139.$g1648$.rebind(var8_525, var502);
                                            module0141.$g1665$.rebind(var7_526, var502);
                                        }
                                    }
                                    finally {
                                        if (module0252.NIL != var515) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var514);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_534, var502);
                                    module0141.$g1684$.rebind(var10_533, var502);
                                    module0141.$g1683$.rebind(var9_524, var502);
                                    module0141.$g1686$.rebind(var8_524, var502);
                                    module0141.$g1685$.rebind(var7_525, var502);
                                }
                                if (var513 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var502));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_524, var502);
                            }
                            if (var513 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var502));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_523, var502);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_523, var502);
                        module0141.$g1677$.rebind(var8_523, var502);
                        module0141.$g1710$.rebind(var7_522, var502);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_522, var502);
                    module0141.$g1714$.rebind(var7_521, var502);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_522, var502);
                module0147.$g2094$.rebind(var8_521, var502);
                module0147.$g2095$.rebind(var7_520, var502);
            }
        }
        finally {
            module0137.$g1605$.rebind(var509, var502);
            module0141.$g1674$.rebind(var508, var502);
            module0141.$g1672$.rebind(var507, var502);
            module0141.$g1671$.rebind(var506, var502);
            module0141.$g1670$.rebind(var505, var502);
        }
        return var504;
    }
    
    public static SubLObject f16280(final SubLObject var2, final SubLObject var310, final SubLObject var501) {
        final SubLThread var502 = SubLProcess.currentSubLThread();
        SubLObject var503 = (SubLObject)module0252.NIL;
        final SubLObject var504 = module0141.$g1694$.currentBinding(var502);
        final SubLObject var505 = module0141.$g1695$.currentBinding(var502);
        final SubLObject var506 = module0141.$g1693$.currentBinding(var502);
        try {
            module0141.$g1694$.bind(var310, var502);
            module0141.$g1695$.bind(var501, var502);
            module0141.$g1693$.bind((SubLObject)module0252.$ic27$, var502);
            var503 = f16246(var2);
        }
        finally {
            module0141.$g1693$.rebind(var506, var502);
            module0141.$g1695$.rebind(var505, var502);
            module0141.$g1694$.rebind(var504, var502);
        }
        return var503;
    }
    
    public static SubLObject f16282(final SubLObject var1, final SubLObject var2, final SubLObject var331, SubLObject var3, SubLObject var4, SubLObject var501) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        if (var501 == module0252.UNPROVIDED) {
            var501 = (SubLObject)module0252.NIL;
        }
        final SubLThread var502 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        final SubLObject var503 = (module0252.NIL != var501) ? var501 : module0141.$g1695$.getDynamicValue(var502);
        SubLObject var504 = (SubLObject)module0252.NIL;
        final SubLObject var505 = module0141.$g1670$.currentBinding(var502);
        final SubLObject var506 = module0141.$g1671$.currentBinding(var502);
        final SubLObject var507 = module0141.$g1672$.currentBinding(var502);
        final SubLObject var508 = module0141.$g1674$.currentBinding(var502);
        final SubLObject var509 = module0137.$g1605$.currentBinding(var502);
        try {
            module0141.$g1670$.bind(var1, var502);
            module0141.$g1671$.bind(module0244.f15739(var1), var502);
            module0141.$g1672$.bind(module0244.f15746(var1), var502);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var502);
            module0137.$g1605$.bind(var1, var502);
            final SubLObject var510 = var3;
            final SubLObject var7_537 = module0147.$g2095$.currentBinding(var502);
            final SubLObject var8_538 = module0147.$g2094$.currentBinding(var502);
            final SubLObject var9_539 = module0147.$g2096$.currentBinding(var502);
            try {
                module0147.$g2095$.bind(module0147.f9545(var510), var502);
                module0147.$g2094$.bind(module0147.f9546(var510), var502);
                module0147.$g2096$.bind(module0147.f9549(var510), var502);
                final SubLObject var511 = var4;
                final SubLObject var7_538 = module0141.$g1714$.currentBinding(var502);
                final SubLObject var8_539 = module0141.$g1715$.currentBinding(var502);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var511) ? var511 : module0141.f9283(), var502);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var511) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var502)), var502);
                    if (module0252.NIL != var511 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var511)) {
                        final SubLObject var512 = module0136.$g1591$.getDynamicValue(var502);
                        if (var512.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var511, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var512.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var511, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var512.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var511, (SubLObject)module0252.$ic4$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var502));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var511, (SubLObject)module0252.$ic4$);
                        }
                    }
                    final SubLObject var7_539 = module0141.$g1710$.currentBinding(var502);
                    final SubLObject var8_540 = module0141.$g1677$.currentBinding(var502);
                    final SubLObject var9_540 = module0138.$g1619$.currentBinding(var502);
                    try {
                        module0141.$g1710$.bind(module0252.$ic9$, var502);
                        module0141.$g1677$.bind(module0141.f9208(), var502);
                        module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var502);
                        final SubLObject var513 = module0139.f9036();
                        final SubLObject var7_540 = module0139.$g1635$.currentBinding(var502);
                        try {
                            module0139.$g1635$.bind((var513 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var502) : module0139.f9038(var513), var502);
                            final SubLObject var7_541 = module0139.$g1636$.currentBinding(var502);
                            try {
                                module0139.$g1636$.bind((var513 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var502) : module0139.f9038(var513), var502);
                                final SubLObject var7_542 = module0141.$g1685$.currentBinding(var502);
                                final SubLObject var8_541 = module0141.$g1686$.currentBinding(var502);
                                final SubLObject var9_541 = module0141.$g1683$.currentBinding(var502);
                                final SubLObject var10_550 = module0141.$g1684$.currentBinding(var502);
                                final SubLObject var11_551 = module0141.$g1674$.currentBinding(var502);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var502);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var502);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var502);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var502);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var502);
                                    final SubLObject var514 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var515 = (SubLObject)module0252.NIL;
                                    try {
                                        var515 = ReadWriteLocks.rw_lock_seize_read_lock(var514);
                                        if (module0252.NIL != module0136.f8864() && !var331.isFunctionSpec()) {
                                            final SubLObject var516 = module0136.$g1591$.getDynamicValue(var502);
                                            if (var516.eql((SubLObject)module0252.$ic2$)) {
                                                module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var331, (SubLObject)module0252.$ic23$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                            }
                                            else if (var516.eql((SubLObject)module0252.$ic5$)) {
                                                module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var331, (SubLObject)module0252.$ic23$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                            }
                                            else if (var516.eql((SubLObject)module0252.$ic7$)) {
                                                Errors.warn((SubLObject)module0252.$ic3$, var331, (SubLObject)module0252.$ic23$);
                                            }
                                            else {
                                                Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var502));
                                                Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var331, (SubLObject)module0252.$ic23$);
                                            }
                                        }
                                        final SubLObject var7_543 = module0141.$g1665$.currentBinding(var502);
                                        final SubLObject var8_542 = module0139.$g1648$.currentBinding(var502);
                                        try {
                                            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var502);
                                            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var502)), var502);
                                            var504 = f16283(var2, var331, var503);
                                        }
                                        finally {
                                            module0139.$g1648$.rebind(var8_542, var502);
                                            module0141.$g1665$.rebind(var7_543, var502);
                                        }
                                    }
                                    finally {
                                        if (module0252.NIL != var515) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var514);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_551, var502);
                                    module0141.$g1684$.rebind(var10_550, var502);
                                    module0141.$g1683$.rebind(var9_541, var502);
                                    module0141.$g1686$.rebind(var8_541, var502);
                                    module0141.$g1685$.rebind(var7_542, var502);
                                }
                                if (var513 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var502));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_541, var502);
                            }
                            if (var513 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var502));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_540, var502);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_540, var502);
                        module0141.$g1677$.rebind(var8_540, var502);
                        module0141.$g1710$.rebind(var7_539, var502);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_539, var502);
                    module0141.$g1714$.rebind(var7_538, var502);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_539, var502);
                module0147.$g2094$.rebind(var8_538, var502);
                module0147.$g2095$.rebind(var7_537, var502);
            }
        }
        finally {
            module0137.$g1605$.rebind(var509, var502);
            module0141.$g1674$.rebind(var508, var502);
            module0141.$g1672$.rebind(var507, var502);
            module0141.$g1671$.rebind(var506, var502);
            module0141.$g1670$.rebind(var505, var502);
        }
        return var504;
    }
    
    public static SubLObject f16284(final SubLObject var1, final SubLObject var2, final SubLObject var331, SubLObject var354, SubLObject var355, SubLObject var501) {
        if (var354 == module0252.UNPROVIDED) {
            var354 = module0139.$g1635$.getDynamicValue();
        }
        if (var355 == module0252.UNPROVIDED) {
            var355 = module0139.$g1636$.getDynamicValue();
        }
        if (var501 == module0252.UNPROVIDED) {
            var501 = (SubLObject)module0252.NIL;
        }
        final SubLThread var502 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        final SubLObject var503 = (module0252.NIL != var501) ? var501 : module0141.$g1695$.getDynamicValue(var502);
        SubLObject var504 = (SubLObject)module0252.NIL;
        final SubLObject var505 = module0141.$g1670$.currentBinding(var502);
        final SubLObject var506 = module0141.$g1671$.currentBinding(var502);
        final SubLObject var507 = module0141.$g1672$.currentBinding(var502);
        final SubLObject var508 = module0141.$g1674$.currentBinding(var502);
        final SubLObject var509 = module0137.$g1605$.currentBinding(var502);
        final SubLObject var510 = module0139.$g1635$.currentBinding(var502);
        final SubLObject var511 = module0139.$g1636$.currentBinding(var502);
        final SubLObject var512 = module0141.$g1710$.currentBinding(var502);
        final SubLObject var513 = module0141.$g1677$.currentBinding(var502);
        final SubLObject var514 = module0138.$g1619$.currentBinding(var502);
        final SubLObject var515 = module0141.$g1685$.currentBinding(var502);
        final SubLObject var516 = module0141.$g1686$.currentBinding(var502);
        final SubLObject var517 = module0141.$g1683$.currentBinding(var502);
        final SubLObject var518 = module0141.$g1684$.currentBinding(var502);
        final SubLObject var519 = module0141.$g1674$.currentBinding(var502);
        try {
            module0141.$g1670$.bind(var1, var502);
            module0141.$g1671$.bind(module0244.f15739(var1), var502);
            module0141.$g1672$.bind(module0244.f15746(var1), var502);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var502);
            module0137.$g1605$.bind(var1, var502);
            module0139.$g1635$.bind(var354, var502);
            module0139.$g1636$.bind(var355, var502);
            module0141.$g1710$.bind(module0252.$ic9$, var502);
            module0141.$g1677$.bind(module0141.f9208(), var502);
            module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var502);
            module0141.$g1685$.bind((SubLObject)module0252.NIL, var502);
            module0141.$g1686$.bind((SubLObject)module0252.NIL, var502);
            module0141.$g1683$.bind((SubLObject)module0252.NIL, var502);
            module0141.$g1684$.bind((SubLObject)module0252.NIL, var502);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var502);
            final SubLObject var520 = module0138.$g1626$.getGlobalValue();
            SubLObject var521 = (SubLObject)module0252.NIL;
            try {
                var521 = ReadWriteLocks.rw_lock_seize_read_lock(var520);
                final SubLObject var7_562 = module0141.$g1665$.currentBinding(var502);
                final SubLObject var8_563 = module0139.$g1648$.currentBinding(var502);
                try {
                    module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var502);
                    module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var502)), var502);
                    var504 = f16283(var2, var331, var503);
                }
                finally {
                    module0139.$g1648$.rebind(var8_563, var502);
                    module0141.$g1665$.rebind(var7_562, var502);
                }
            }
            finally {
                if (module0252.NIL != var521) {
                    ReadWriteLocks.rw_lock_release_read_lock(var520);
                }
            }
        }
        finally {
            module0141.$g1674$.rebind(var519, var502);
            module0141.$g1684$.rebind(var518, var502);
            module0141.$g1683$.rebind(var517, var502);
            module0141.$g1686$.rebind(var516, var502);
            module0141.$g1685$.rebind(var515, var502);
            module0138.$g1619$.rebind(var514, var502);
            module0141.$g1677$.rebind(var513, var502);
            module0141.$g1710$.rebind(var512, var502);
            module0139.$g1636$.rebind(var511, var502);
            module0139.$g1635$.rebind(var510, var502);
            module0137.$g1605$.rebind(var509, var502);
            module0141.$g1674$.rebind(var508, var502);
            module0141.$g1672$.rebind(var507, var502);
            module0141.$g1671$.rebind(var506, var502);
            module0141.$g1670$.rebind(var505, var502);
        }
        return var504;
    }
    
    public static SubLObject f16285(final SubLObject var1, final SubLObject var2, final SubLObject var331, SubLObject var3, SubLObject var4, SubLObject var501) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        if (var501 == module0252.UNPROVIDED) {
            var501 = (SubLObject)module0252.NIL;
        }
        final SubLThread var502 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        final SubLObject var503 = (module0252.NIL != var501) ? var501 : module0141.$g1695$.getDynamicValue(var502);
        SubLObject var504 = (SubLObject)module0252.NIL;
        final SubLObject var505 = module0141.$g1670$.currentBinding(var502);
        final SubLObject var506 = module0141.$g1671$.currentBinding(var502);
        final SubLObject var507 = module0141.$g1672$.currentBinding(var502);
        final SubLObject var508 = module0141.$g1674$.currentBinding(var502);
        final SubLObject var509 = module0137.$g1605$.currentBinding(var502);
        try {
            module0141.$g1670$.bind(var1, var502);
            module0141.$g1671$.bind(module0244.f15739(var1), var502);
            module0141.$g1672$.bind(module0244.f15746(var1), var502);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var502);
            module0137.$g1605$.bind(var1, var502);
            final SubLObject var510 = var3;
            final SubLObject var7_564 = module0147.$g2095$.currentBinding(var502);
            final SubLObject var8_565 = module0147.$g2094$.currentBinding(var502);
            final SubLObject var9_566 = module0147.$g2096$.currentBinding(var502);
            try {
                module0147.$g2095$.bind(module0147.f9545(var510), var502);
                module0147.$g2094$.bind(module0147.f9546(var510), var502);
                module0147.$g2096$.bind(module0147.f9549(var510), var502);
                final SubLObject var511 = var4;
                final SubLObject var7_565 = module0141.$g1714$.currentBinding(var502);
                final SubLObject var8_566 = module0141.$g1715$.currentBinding(var502);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var511) ? var511 : module0141.f9283(), var502);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var511) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var502)), var502);
                    if (module0252.NIL != var511 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var511)) {
                        final SubLObject var512 = module0136.$g1591$.getDynamicValue(var502);
                        if (var512.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var511, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var512.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var511, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var512.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var511, (SubLObject)module0252.$ic4$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var502));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var511, (SubLObject)module0252.$ic4$);
                        }
                    }
                    final SubLObject var7_566 = module0141.$g1710$.currentBinding(var502);
                    final SubLObject var8_567 = module0141.$g1677$.currentBinding(var502);
                    final SubLObject var9_567 = module0138.$g1619$.currentBinding(var502);
                    try {
                        module0141.$g1710$.bind(module0252.$ic9$, var502);
                        module0141.$g1677$.bind(module0141.f9210(), var502);
                        module0138.$g1619$.bind(module0244.f15780(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var502);
                        final SubLObject var513 = module0139.f9036();
                        final SubLObject var7_567 = module0139.$g1635$.currentBinding(var502);
                        try {
                            module0139.$g1635$.bind((var513 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var502) : module0139.f9038(var513), var502);
                            final SubLObject var7_568 = module0139.$g1636$.currentBinding(var502);
                            try {
                                module0139.$g1636$.bind((var513 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var502) : module0139.f9038(var513), var502);
                                final SubLObject var7_569 = module0141.$g1685$.currentBinding(var502);
                                final SubLObject var8_568 = module0141.$g1686$.currentBinding(var502);
                                final SubLObject var9_568 = module0141.$g1683$.currentBinding(var502);
                                final SubLObject var10_577 = module0141.$g1684$.currentBinding(var502);
                                final SubLObject var11_578 = module0141.$g1674$.currentBinding(var502);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var502);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var502);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var502);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var502);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var502);
                                    final SubLObject var514 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var515 = (SubLObject)module0252.NIL;
                                    try {
                                        var515 = ReadWriteLocks.rw_lock_seize_read_lock(var514);
                                        if (module0252.NIL != module0136.f8864() && !var331.isFunctionSpec()) {
                                            final SubLObject var516 = module0136.$g1591$.getDynamicValue(var502);
                                            if (var516.eql((SubLObject)module0252.$ic2$)) {
                                                module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var331, (SubLObject)module0252.$ic23$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                            }
                                            else if (var516.eql((SubLObject)module0252.$ic5$)) {
                                                module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var331, (SubLObject)module0252.$ic23$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                            }
                                            else if (var516.eql((SubLObject)module0252.$ic7$)) {
                                                Errors.warn((SubLObject)module0252.$ic3$, var331, (SubLObject)module0252.$ic23$);
                                            }
                                            else {
                                                Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var502));
                                                Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var331, (SubLObject)module0252.$ic23$);
                                            }
                                        }
                                        final SubLObject var7_570 = module0141.$g1665$.currentBinding(var502);
                                        final SubLObject var8_569 = module0139.$g1648$.currentBinding(var502);
                                        try {
                                            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var502);
                                            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var502)), var502);
                                            var504 = f16283(var2, var331, var503);
                                        }
                                        finally {
                                            module0139.$g1648$.rebind(var8_569, var502);
                                            module0141.$g1665$.rebind(var7_570, var502);
                                        }
                                    }
                                    finally {
                                        if (module0252.NIL != var515) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var514);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_578, var502);
                                    module0141.$g1684$.rebind(var10_577, var502);
                                    module0141.$g1683$.rebind(var9_568, var502);
                                    module0141.$g1686$.rebind(var8_568, var502);
                                    module0141.$g1685$.rebind(var7_569, var502);
                                }
                                if (var513 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var502));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_568, var502);
                            }
                            if (var513 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var502));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_567, var502);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_567, var502);
                        module0141.$g1677$.rebind(var8_567, var502);
                        module0141.$g1710$.rebind(var7_566, var502);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_566, var502);
                    module0141.$g1714$.rebind(var7_565, var502);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_566, var502);
                module0147.$g2094$.rebind(var8_565, var502);
                module0147.$g2095$.rebind(var7_564, var502);
            }
        }
        finally {
            module0137.$g1605$.rebind(var509, var502);
            module0141.$g1674$.rebind(var508, var502);
            module0141.$g1672$.rebind(var507, var502);
            module0141.$g1671$.rebind(var506, var502);
            module0141.$g1670$.rebind(var505, var502);
        }
        return var504;
    }
    
    public static SubLObject f16286(final SubLObject var1, final SubLObject var2, final SubLObject var331, SubLObject var3, SubLObject var4, SubLObject var501) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        if (var501 == module0252.UNPROVIDED) {
            var501 = module0141.$g1695$.getDynamicValue();
        }
        final SubLThread var502 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        SubLObject var503 = (SubLObject)module0252.NIL;
        final SubLObject var504 = module0141.$g1670$.currentBinding(var502);
        final SubLObject var505 = module0141.$g1671$.currentBinding(var502);
        final SubLObject var506 = module0141.$g1672$.currentBinding(var502);
        final SubLObject var507 = module0141.$g1674$.currentBinding(var502);
        final SubLObject var508 = module0137.$g1605$.currentBinding(var502);
        try {
            module0141.$g1670$.bind(var1, var502);
            module0141.$g1671$.bind(module0244.f15739(var1), var502);
            module0141.$g1672$.bind(module0244.f15746(var1), var502);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var502);
            module0137.$g1605$.bind(var1, var502);
            final SubLObject var509 = var3;
            final SubLObject var7_581 = module0147.$g2095$.currentBinding(var502);
            final SubLObject var8_582 = module0147.$g2094$.currentBinding(var502);
            final SubLObject var9_583 = module0147.$g2096$.currentBinding(var502);
            try {
                module0147.$g2095$.bind(module0147.f9545(var509), var502);
                module0147.$g2094$.bind(module0147.f9546(var509), var502);
                module0147.$g2096$.bind(module0147.f9549(var509), var502);
                final SubLObject var510 = var4;
                final SubLObject var7_582 = module0141.$g1714$.currentBinding(var502);
                final SubLObject var8_583 = module0141.$g1715$.currentBinding(var502);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var510) ? var510 : module0141.f9283(), var502);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var510) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var502)), var502);
                    if (module0252.NIL != var510 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var510)) {
                        final SubLObject var511 = module0136.$g1591$.getDynamicValue(var502);
                        if (var511.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var510, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var511.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var510, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var511.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var510, (SubLObject)module0252.$ic4$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var502));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var510, (SubLObject)module0252.$ic4$);
                        }
                    }
                    final SubLObject var7_583 = module0141.$g1710$.currentBinding(var502);
                    final SubLObject var8_584 = module0141.$g1677$.currentBinding(var502);
                    final SubLObject var9_584 = module0138.$g1619$.currentBinding(var502);
                    try {
                        module0141.$g1710$.bind(module0252.$ic9$, var502);
                        module0141.$g1677$.bind(module0141.f9208(), var502);
                        module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var502);
                        final SubLObject var512 = module0139.f9036();
                        final SubLObject var7_584 = module0139.$g1635$.currentBinding(var502);
                        try {
                            module0139.$g1635$.bind((var512 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var502) : module0139.f9038(var512), var502);
                            final SubLObject var7_585 = module0139.$g1636$.currentBinding(var502);
                            try {
                                module0139.$g1636$.bind((var512 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var502) : module0139.f9038(var512), var502);
                                final SubLObject var7_586 = module0141.$g1685$.currentBinding(var502);
                                final SubLObject var8_585 = module0141.$g1686$.currentBinding(var502);
                                final SubLObject var9_585 = module0141.$g1683$.currentBinding(var502);
                                final SubLObject var10_594 = module0141.$g1684$.currentBinding(var502);
                                final SubLObject var11_595 = module0141.$g1674$.currentBinding(var502);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var502);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var502);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var502);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var502);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var502);
                                    final SubLObject var513 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var514 = (SubLObject)module0252.NIL;
                                    try {
                                        var514 = ReadWriteLocks.rw_lock_seize_read_lock(var513);
                                        if (module0252.NIL != module0136.f8864() && !var331.isFunctionSpec()) {
                                            final SubLObject var515 = module0136.$g1591$.getDynamicValue(var502);
                                            if (var515.eql((SubLObject)module0252.$ic2$)) {
                                                module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var331, (SubLObject)module0252.$ic23$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                            }
                                            else if (var515.eql((SubLObject)module0252.$ic5$)) {
                                                module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var331, (SubLObject)module0252.$ic23$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                            }
                                            else if (var515.eql((SubLObject)module0252.$ic7$)) {
                                                Errors.warn((SubLObject)module0252.$ic3$, var331, (SubLObject)module0252.$ic23$);
                                            }
                                            else {
                                                Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var502));
                                                Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var331, (SubLObject)module0252.$ic23$);
                                            }
                                        }
                                        final SubLObject var7_587 = module0141.$g1672$.currentBinding(var502);
                                        final SubLObject var8_586 = module0141.$g1665$.currentBinding(var502);
                                        final SubLObject var9_586 = module0139.$g1648$.currentBinding(var502);
                                        try {
                                            module0141.$g1672$.bind((SubLObject)module0252.NIL, var502);
                                            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var502);
                                            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var502)), var502);
                                            var503 = f16283(var2, var331, var501);
                                        }
                                        finally {
                                            module0139.$g1648$.rebind(var9_586, var502);
                                            module0141.$g1665$.rebind(var8_586, var502);
                                            module0141.$g1672$.rebind(var7_587, var502);
                                        }
                                    }
                                    finally {
                                        if (module0252.NIL != var514) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var513);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_595, var502);
                                    module0141.$g1684$.rebind(var10_594, var502);
                                    module0141.$g1683$.rebind(var9_585, var502);
                                    module0141.$g1686$.rebind(var8_585, var502);
                                    module0141.$g1685$.rebind(var7_586, var502);
                                }
                                if (var512 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var502));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_585, var502);
                            }
                            if (var512 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var502));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_584, var502);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_584, var502);
                        module0141.$g1677$.rebind(var8_584, var502);
                        module0141.$g1710$.rebind(var7_583, var502);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_583, var502);
                    module0141.$g1714$.rebind(var7_582, var502);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_583, var502);
                module0147.$g2094$.rebind(var8_582, var502);
                module0147.$g2095$.rebind(var7_581, var502);
            }
        }
        finally {
            module0137.$g1605$.rebind(var508, var502);
            module0141.$g1674$.rebind(var507, var502);
            module0141.$g1672$.rebind(var506, var502);
            module0141.$g1671$.rebind(var505, var502);
            module0141.$g1670$.rebind(var504, var502);
        }
        return var503;
    }
    
    public static SubLObject f16287(final SubLObject var1, final SubLObject var2, final SubLObject var331, SubLObject var3, SubLObject var4, SubLObject var501) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        if (var501 == module0252.UNPROVIDED) {
            var501 = module0141.$g1695$.getDynamicValue();
        }
        final SubLThread var502 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        SubLObject var503 = (SubLObject)module0252.NIL;
        final SubLObject var504 = module0141.$g1670$.currentBinding(var502);
        final SubLObject var505 = module0141.$g1671$.currentBinding(var502);
        final SubLObject var506 = module0141.$g1672$.currentBinding(var502);
        final SubLObject var507 = module0141.$g1674$.currentBinding(var502);
        final SubLObject var508 = module0137.$g1605$.currentBinding(var502);
        try {
            module0141.$g1670$.bind(var1, var502);
            module0141.$g1671$.bind(module0244.f15739(var1), var502);
            module0141.$g1672$.bind(module0244.f15746(var1), var502);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var502);
            module0137.$g1605$.bind(var1, var502);
            final SubLObject var509 = var3;
            final SubLObject var7_599 = module0147.$g2095$.currentBinding(var502);
            final SubLObject var8_600 = module0147.$g2094$.currentBinding(var502);
            final SubLObject var9_601 = module0147.$g2096$.currentBinding(var502);
            try {
                module0147.$g2095$.bind(module0147.f9545(var509), var502);
                module0147.$g2094$.bind(module0147.f9546(var509), var502);
                module0147.$g2096$.bind(module0147.f9549(var509), var502);
                final SubLObject var510 = var4;
                final SubLObject var7_600 = module0141.$g1714$.currentBinding(var502);
                final SubLObject var8_601 = module0141.$g1715$.currentBinding(var502);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var510) ? var510 : module0141.f9283(), var502);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var510) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var502)), var502);
                    if (module0252.NIL != var510 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var510)) {
                        final SubLObject var511 = module0136.$g1591$.getDynamicValue(var502);
                        if (var511.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var510, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var511.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var510, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var511.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var510, (SubLObject)module0252.$ic4$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var502));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var510, (SubLObject)module0252.$ic4$);
                        }
                    }
                    final SubLObject var7_601 = module0141.$g1710$.currentBinding(var502);
                    final SubLObject var8_602 = module0141.$g1677$.currentBinding(var502);
                    final SubLObject var9_602 = module0138.$g1619$.currentBinding(var502);
                    try {
                        module0141.$g1710$.bind(module0252.$ic9$, var502);
                        module0141.$g1677$.bind(module0141.f9210(), var502);
                        module0138.$g1619$.bind(module0244.f15780(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var502);
                        final SubLObject var512 = module0139.f9036();
                        final SubLObject var7_602 = module0139.$g1635$.currentBinding(var502);
                        try {
                            module0139.$g1635$.bind((var512 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var502) : module0139.f9038(var512), var502);
                            final SubLObject var7_603 = module0139.$g1636$.currentBinding(var502);
                            try {
                                module0139.$g1636$.bind((var512 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var502) : module0139.f9038(var512), var502);
                                final SubLObject var7_604 = module0141.$g1685$.currentBinding(var502);
                                final SubLObject var8_603 = module0141.$g1686$.currentBinding(var502);
                                final SubLObject var9_603 = module0141.$g1683$.currentBinding(var502);
                                final SubLObject var10_612 = module0141.$g1684$.currentBinding(var502);
                                final SubLObject var11_613 = module0141.$g1674$.currentBinding(var502);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var502);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var502);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var502);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var502);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var502);
                                    final SubLObject var513 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var514 = (SubLObject)module0252.NIL;
                                    try {
                                        var514 = ReadWriteLocks.rw_lock_seize_read_lock(var513);
                                        if (module0252.NIL != module0136.f8864() && !var331.isFunctionSpec()) {
                                            final SubLObject var515 = module0136.$g1591$.getDynamicValue(var502);
                                            if (var515.eql((SubLObject)module0252.$ic2$)) {
                                                module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var331, (SubLObject)module0252.$ic23$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                            }
                                            else if (var515.eql((SubLObject)module0252.$ic5$)) {
                                                module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var331, (SubLObject)module0252.$ic23$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                            }
                                            else if (var515.eql((SubLObject)module0252.$ic7$)) {
                                                Errors.warn((SubLObject)module0252.$ic3$, var331, (SubLObject)module0252.$ic23$);
                                            }
                                            else {
                                                Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var502));
                                                Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var331, (SubLObject)module0252.$ic23$);
                                            }
                                        }
                                        final SubLObject var7_605 = module0141.$g1672$.currentBinding(var502);
                                        final SubLObject var8_604 = module0141.$g1665$.currentBinding(var502);
                                        final SubLObject var9_604 = module0139.$g1648$.currentBinding(var502);
                                        try {
                                            module0141.$g1672$.bind((SubLObject)module0252.NIL, var502);
                                            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var502);
                                            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var502)), var502);
                                            var503 = f16283(var2, var331, var501);
                                        }
                                        finally {
                                            module0139.$g1648$.rebind(var9_604, var502);
                                            module0141.$g1665$.rebind(var8_604, var502);
                                            module0141.$g1672$.rebind(var7_605, var502);
                                        }
                                    }
                                    finally {
                                        if (module0252.NIL != var514) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var513);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_613, var502);
                                    module0141.$g1684$.rebind(var10_612, var502);
                                    module0141.$g1683$.rebind(var9_603, var502);
                                    module0141.$g1686$.rebind(var8_603, var502);
                                    module0141.$g1685$.rebind(var7_604, var502);
                                }
                                if (var512 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var502));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_603, var502);
                            }
                            if (var512 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var502));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_602, var502);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_602, var502);
                        module0141.$g1677$.rebind(var8_602, var502);
                        module0141.$g1710$.rebind(var7_601, var502);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_601, var502);
                    module0141.$g1714$.rebind(var7_600, var502);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_601, var502);
                module0147.$g2094$.rebind(var8_600, var502);
                module0147.$g2095$.rebind(var7_599, var502);
            }
        }
        finally {
            module0137.$g1605$.rebind(var508, var502);
            module0141.$g1674$.rebind(var507, var502);
            module0141.$g1672$.rebind(var506, var502);
            module0141.$g1671$.rebind(var505, var502);
            module0141.$g1670$.rebind(var504, var502);
        }
        return var503;
    }
    
    public static SubLObject f16283(final SubLObject var2, final SubLObject var93, final SubLObject var501) {
        final SubLThread var502 = SubLProcess.currentSubLThread();
        SubLObject var503 = (SubLObject)module0252.NIL;
        final SubLObject var504 = module0141.$g1694$.currentBinding(var502);
        final SubLObject var505 = module0141.$g1695$.currentBinding(var502);
        final SubLObject var506 = module0141.$g1693$.currentBinding(var502);
        try {
            module0141.$g1694$.bind(var93, var502);
            module0141.$g1695$.bind(var501, var502);
            module0141.$g1693$.bind((SubLObject)module0252.$ic19$, var502);
            var503 = f16246(var2);
        }
        finally {
            module0141.$g1693$.rebind(var506, var502);
            module0141.$g1695$.rebind(var505, var502);
            module0141.$g1694$.rebind(var504, var502);
        }
        return var503;
    }
    
    public static SubLObject f16288(final SubLObject var1, final SubLObject var2, final SubLObject var331, SubLObject var3, SubLObject var4, SubLObject var501) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        if (var501 == module0252.UNPROVIDED) {
            var501 = module0141.$g1695$.getDynamicValue();
        }
        final SubLThread var502 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        SubLObject var503 = (SubLObject)module0252.NIL;
        final SubLObject var504 = module0141.$g1670$.currentBinding(var502);
        final SubLObject var505 = module0141.$g1671$.currentBinding(var502);
        final SubLObject var506 = module0141.$g1672$.currentBinding(var502);
        final SubLObject var507 = module0141.$g1674$.currentBinding(var502);
        final SubLObject var508 = module0137.$g1605$.currentBinding(var502);
        try {
            module0141.$g1670$.bind(var1, var502);
            module0141.$g1671$.bind(module0244.f15739(var1), var502);
            module0141.$g1672$.bind(module0244.f15746(var1), var502);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var502);
            module0137.$g1605$.bind(var1, var502);
            final SubLObject var509 = var3;
            final SubLObject var7_617 = module0147.$g2095$.currentBinding(var502);
            final SubLObject var8_618 = module0147.$g2094$.currentBinding(var502);
            final SubLObject var9_619 = module0147.$g2096$.currentBinding(var502);
            try {
                module0147.$g2095$.bind(module0147.f9545(var509), var502);
                module0147.$g2094$.bind(module0147.f9546(var509), var502);
                module0147.$g2096$.bind(module0147.f9549(var509), var502);
                final SubLObject var510 = var4;
                final SubLObject var7_618 = module0141.$g1714$.currentBinding(var502);
                final SubLObject var8_619 = module0141.$g1715$.currentBinding(var502);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var510) ? var510 : module0141.f9283(), var502);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var510) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var502)), var502);
                    if (module0252.NIL != var510 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var510)) {
                        final SubLObject var511 = module0136.$g1591$.getDynamicValue(var502);
                        if (var511.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var510, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var511.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var510, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var511.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var510, (SubLObject)module0252.$ic4$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var502));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var510, (SubLObject)module0252.$ic4$);
                        }
                    }
                    final SubLObject var7_619 = module0141.$g1710$.currentBinding(var502);
                    final SubLObject var8_620 = module0141.$g1677$.currentBinding(var502);
                    final SubLObject var9_620 = module0138.$g1619$.currentBinding(var502);
                    try {
                        module0141.$g1710$.bind(module0252.$ic9$, var502);
                        module0141.$g1677$.bind(module0141.f9208(), var502);
                        module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var502);
                        final SubLObject var512 = module0139.f9036();
                        final SubLObject var7_620 = module0139.$g1635$.currentBinding(var502);
                        try {
                            module0139.$g1635$.bind((var512 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var502) : module0139.f9038(var512), var502);
                            final SubLObject var7_621 = module0139.$g1636$.currentBinding(var502);
                            try {
                                module0139.$g1636$.bind((var512 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var502) : module0139.f9038(var512), var502);
                                final SubLObject var7_622 = module0141.$g1685$.currentBinding(var502);
                                final SubLObject var8_621 = module0141.$g1686$.currentBinding(var502);
                                final SubLObject var9_621 = module0141.$g1683$.currentBinding(var502);
                                final SubLObject var10_630 = module0141.$g1684$.currentBinding(var502);
                                final SubLObject var11_631 = module0141.$g1674$.currentBinding(var502);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var502);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var502);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var502);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var502);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var502);
                                    final SubLObject var513 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var514 = (SubLObject)module0252.NIL;
                                    try {
                                        var514 = ReadWriteLocks.rw_lock_seize_read_lock(var513);
                                        if (module0252.NIL != module0136.f8864() && !var331.isFunctionSpec()) {
                                            final SubLObject var515 = module0136.$g1591$.getDynamicValue(var502);
                                            if (var515.eql((SubLObject)module0252.$ic2$)) {
                                                module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var331, (SubLObject)module0252.$ic23$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                            }
                                            else if (var515.eql((SubLObject)module0252.$ic5$)) {
                                                module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var331, (SubLObject)module0252.$ic23$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                            }
                                            else if (var515.eql((SubLObject)module0252.$ic7$)) {
                                                Errors.warn((SubLObject)module0252.$ic3$, var331, (SubLObject)module0252.$ic23$);
                                            }
                                            else {
                                                Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var502));
                                                Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var331, (SubLObject)module0252.$ic23$);
                                            }
                                        }
                                        final SubLObject var7_623 = module0141.$g1672$.currentBinding(var502);
                                        final SubLObject var8_622 = module0141.$g1665$.currentBinding(var502);
                                        final SubLObject var9_622 = module0139.$g1648$.currentBinding(var502);
                                        try {
                                            module0141.$g1672$.bind((SubLObject)module0252.NIL, var502);
                                            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var502);
                                            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var502)), var502);
                                            var503 = f16289(var2, var331, var501);
                                        }
                                        finally {
                                            module0139.$g1648$.rebind(var9_622, var502);
                                            module0141.$g1665$.rebind(var8_622, var502);
                                            module0141.$g1672$.rebind(var7_623, var502);
                                        }
                                    }
                                    finally {
                                        if (module0252.NIL != var514) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var513);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_631, var502);
                                    module0141.$g1684$.rebind(var10_630, var502);
                                    module0141.$g1683$.rebind(var9_621, var502);
                                    module0141.$g1686$.rebind(var8_621, var502);
                                    module0141.$g1685$.rebind(var7_622, var502);
                                }
                                if (var512 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var502));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_621, var502);
                            }
                            if (var512 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var502));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_620, var502);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_620, var502);
                        module0141.$g1677$.rebind(var8_620, var502);
                        module0141.$g1710$.rebind(var7_619, var502);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_619, var502);
                    module0141.$g1714$.rebind(var7_618, var502);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_619, var502);
                module0147.$g2094$.rebind(var8_618, var502);
                module0147.$g2095$.rebind(var7_617, var502);
            }
        }
        finally {
            module0137.$g1605$.rebind(var508, var502);
            module0141.$g1674$.rebind(var507, var502);
            module0141.$g1672$.rebind(var506, var502);
            module0141.$g1671$.rebind(var505, var502);
            module0141.$g1670$.rebind(var504, var502);
        }
        return var503;
    }
    
    public static SubLObject f16290(final SubLObject var1, final SubLObject var2, final SubLObject var331, SubLObject var3, SubLObject var4, SubLObject var501) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        if (var501 == module0252.UNPROVIDED) {
            var501 = module0141.$g1695$.getDynamicValue();
        }
        final SubLThread var502 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        SubLObject var503 = (SubLObject)module0252.NIL;
        final SubLObject var504 = module0141.$g1670$.currentBinding(var502);
        final SubLObject var505 = module0141.$g1671$.currentBinding(var502);
        final SubLObject var506 = module0141.$g1672$.currentBinding(var502);
        final SubLObject var507 = module0141.$g1674$.currentBinding(var502);
        final SubLObject var508 = module0137.$g1605$.currentBinding(var502);
        try {
            module0141.$g1670$.bind(var1, var502);
            module0141.$g1671$.bind(module0244.f15739(var1), var502);
            module0141.$g1672$.bind(module0244.f15746(var1), var502);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var502);
            module0137.$g1605$.bind(var1, var502);
            final SubLObject var509 = var3;
            final SubLObject var7_635 = module0147.$g2095$.currentBinding(var502);
            final SubLObject var8_636 = module0147.$g2094$.currentBinding(var502);
            final SubLObject var9_637 = module0147.$g2096$.currentBinding(var502);
            try {
                module0147.$g2095$.bind(module0147.f9545(var509), var502);
                module0147.$g2094$.bind(module0147.f9546(var509), var502);
                module0147.$g2096$.bind(module0147.f9549(var509), var502);
                final SubLObject var510 = var4;
                final SubLObject var7_636 = module0141.$g1714$.currentBinding(var502);
                final SubLObject var8_637 = module0141.$g1715$.currentBinding(var502);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var510) ? var510 : module0141.f9283(), var502);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var510) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var502)), var502);
                    if (module0252.NIL != var510 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var510)) {
                        final SubLObject var511 = module0136.$g1591$.getDynamicValue(var502);
                        if (var511.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var510, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var511.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var510, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var511.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var510, (SubLObject)module0252.$ic4$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var502));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var510, (SubLObject)module0252.$ic4$);
                        }
                    }
                    final SubLObject var7_637 = module0141.$g1710$.currentBinding(var502);
                    final SubLObject var8_638 = module0141.$g1677$.currentBinding(var502);
                    final SubLObject var9_638 = module0138.$g1619$.currentBinding(var502);
                    try {
                        module0141.$g1710$.bind(module0252.$ic9$, var502);
                        module0141.$g1677$.bind(module0141.f9210(), var502);
                        module0138.$g1619$.bind(module0244.f15780(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var502);
                        final SubLObject var512 = module0139.f9036();
                        final SubLObject var7_638 = module0139.$g1635$.currentBinding(var502);
                        try {
                            module0139.$g1635$.bind((var512 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var502) : module0139.f9038(var512), var502);
                            final SubLObject var7_639 = module0139.$g1636$.currentBinding(var502);
                            try {
                                module0139.$g1636$.bind((var512 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var502) : module0139.f9038(var512), var502);
                                final SubLObject var7_640 = module0141.$g1685$.currentBinding(var502);
                                final SubLObject var8_639 = module0141.$g1686$.currentBinding(var502);
                                final SubLObject var9_639 = module0141.$g1683$.currentBinding(var502);
                                final SubLObject var10_648 = module0141.$g1684$.currentBinding(var502);
                                final SubLObject var11_649 = module0141.$g1674$.currentBinding(var502);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var502);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var502);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var502);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var502);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var502);
                                    final SubLObject var513 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var514 = (SubLObject)module0252.NIL;
                                    try {
                                        var514 = ReadWriteLocks.rw_lock_seize_read_lock(var513);
                                        if (module0252.NIL != module0136.f8864() && !var331.isFunctionSpec()) {
                                            final SubLObject var515 = module0136.$g1591$.getDynamicValue(var502);
                                            if (var515.eql((SubLObject)module0252.$ic2$)) {
                                                module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var331, (SubLObject)module0252.$ic23$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                            }
                                            else if (var515.eql((SubLObject)module0252.$ic5$)) {
                                                module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var331, (SubLObject)module0252.$ic23$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                            }
                                            else if (var515.eql((SubLObject)module0252.$ic7$)) {
                                                Errors.warn((SubLObject)module0252.$ic3$, var331, (SubLObject)module0252.$ic23$);
                                            }
                                            else {
                                                Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var502));
                                                Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var331, (SubLObject)module0252.$ic23$);
                                            }
                                        }
                                        final SubLObject var7_641 = module0141.$g1672$.currentBinding(var502);
                                        final SubLObject var8_640 = module0141.$g1665$.currentBinding(var502);
                                        final SubLObject var9_640 = module0139.$g1648$.currentBinding(var502);
                                        try {
                                            module0141.$g1672$.bind((SubLObject)module0252.NIL, var502);
                                            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var502);
                                            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var502)), var502);
                                            var503 = f16289(var2, var331, var501);
                                        }
                                        finally {
                                            module0139.$g1648$.rebind(var9_640, var502);
                                            module0141.$g1665$.rebind(var8_640, var502);
                                            module0141.$g1672$.rebind(var7_641, var502);
                                        }
                                    }
                                    finally {
                                        if (module0252.NIL != var514) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var513);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_649, var502);
                                    module0141.$g1684$.rebind(var10_648, var502);
                                    module0141.$g1683$.rebind(var9_639, var502);
                                    module0141.$g1686$.rebind(var8_639, var502);
                                    module0141.$g1685$.rebind(var7_640, var502);
                                }
                                if (var512 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var502));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_639, var502);
                            }
                            if (var512 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var502));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_638, var502);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_638, var502);
                        module0141.$g1677$.rebind(var8_638, var502);
                        module0141.$g1710$.rebind(var7_637, var502);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_637, var502);
                    module0141.$g1714$.rebind(var7_636, var502);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_637, var502);
                module0147.$g2094$.rebind(var8_636, var502);
                module0147.$g2095$.rebind(var7_635, var502);
            }
        }
        finally {
            module0137.$g1605$.rebind(var508, var502);
            module0141.$g1674$.rebind(var507, var502);
            module0141.$g1672$.rebind(var506, var502);
            module0141.$g1671$.rebind(var505, var502);
            module0141.$g1670$.rebind(var504, var502);
        }
        return var503;
    }
    
    public static SubLObject f16289(final SubLObject var2, final SubLObject var93, final SubLObject var501) {
        final SubLThread var502 = SubLProcess.currentSubLThread();
        SubLObject var503 = (SubLObject)module0252.NIL;
        final SubLObject var504 = module0141.$g1694$.currentBinding(var502);
        final SubLObject var505 = module0141.$g1695$.currentBinding(var502);
        final SubLObject var506 = module0141.$g1693$.currentBinding(var502);
        try {
            module0141.$g1694$.bind(var93, var502);
            module0141.$g1695$.bind(var501, var502);
            module0141.$g1693$.bind((SubLObject)module0252.$ic28$, var502);
            var503 = f16246(var2);
        }
        finally {
            module0141.$g1693$.rebind(var506, var502);
            module0141.$g1695$.rebind(var505, var502);
            module0141.$g1694$.rebind(var504, var502);
        }
        return var503;
    }
    
    public static SubLObject f16291(final SubLObject var1, final SubLObject var2, final SubLObject var331, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var332 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        SubLObject var333 = (SubLObject)module0252.NIL;
        final SubLObject var334 = module0141.$g1670$.currentBinding(var332);
        final SubLObject var335 = module0141.$g1671$.currentBinding(var332);
        final SubLObject var336 = module0141.$g1672$.currentBinding(var332);
        final SubLObject var337 = module0141.$g1674$.currentBinding(var332);
        final SubLObject var338 = module0137.$g1605$.currentBinding(var332);
        try {
            module0141.$g1670$.bind(var1, var332);
            module0141.$g1671$.bind(module0244.f15739(var1), var332);
            module0141.$g1672$.bind(module0244.f15746(var1), var332);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var332);
            module0137.$g1605$.bind(var1, var332);
            final SubLObject var339 = var3;
            final SubLObject var7_653 = module0147.$g2095$.currentBinding(var332);
            final SubLObject var8_654 = module0147.$g2094$.currentBinding(var332);
            final SubLObject var9_655 = module0147.$g2096$.currentBinding(var332);
            try {
                module0147.$g2095$.bind(module0147.f9545(var339), var332);
                module0147.$g2094$.bind(module0147.f9546(var339), var332);
                module0147.$g2096$.bind(module0147.f9549(var339), var332);
                final SubLObject var340 = var4;
                final SubLObject var7_654 = module0141.$g1714$.currentBinding(var332);
                final SubLObject var8_655 = module0141.$g1715$.currentBinding(var332);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var340) ? var340 : module0141.f9283(), var332);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var340) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var332)), var332);
                    if (module0252.NIL != var340 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var340)) {
                        final SubLObject var341 = module0136.$g1591$.getDynamicValue(var332);
                        if (var341.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var340, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var341.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var340, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var341.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var340, (SubLObject)module0252.$ic4$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var332));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var340, (SubLObject)module0252.$ic4$);
                        }
                    }
                    final SubLObject var7_655 = module0141.$g1710$.currentBinding(var332);
                    final SubLObject var8_656 = module0141.$g1677$.currentBinding(var332);
                    final SubLObject var9_656 = module0138.$g1619$.currentBinding(var332);
                    try {
                        module0141.$g1710$.bind(module0252.$ic9$, var332);
                        module0141.$g1677$.bind(module0141.f9208(), var332);
                        module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var332);
                        final SubLObject var342 = module0139.f9036();
                        final SubLObject var7_656 = module0139.$g1635$.currentBinding(var332);
                        try {
                            module0139.$g1635$.bind((var342 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var332) : module0139.f9038(var342), var332);
                            final SubLObject var7_657 = module0139.$g1636$.currentBinding(var332);
                            try {
                                module0139.$g1636$.bind((var342 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var332) : module0139.f9038(var342), var332);
                                final SubLObject var7_658 = module0141.$g1685$.currentBinding(var332);
                                final SubLObject var8_657 = module0141.$g1686$.currentBinding(var332);
                                final SubLObject var9_657 = module0141.$g1683$.currentBinding(var332);
                                final SubLObject var10_666 = module0141.$g1684$.currentBinding(var332);
                                final SubLObject var11_667 = module0141.$g1674$.currentBinding(var332);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var332);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var332);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var332);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var332);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var332);
                                    final SubLObject var343 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var344 = (SubLObject)module0252.NIL;
                                    try {
                                        var344 = ReadWriteLocks.rw_lock_seize_read_lock(var343);
                                        if (module0252.NIL != module0136.f8864() && !var331.isFunctionSpec()) {
                                            final SubLObject var345 = module0136.$g1591$.getDynamicValue(var332);
                                            if (var345.eql((SubLObject)module0252.$ic2$)) {
                                                module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var331, (SubLObject)module0252.$ic23$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                            }
                                            else if (var345.eql((SubLObject)module0252.$ic5$)) {
                                                module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var331, (SubLObject)module0252.$ic23$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                            }
                                            else if (var345.eql((SubLObject)module0252.$ic7$)) {
                                                Errors.warn((SubLObject)module0252.$ic3$, var331, (SubLObject)module0252.$ic23$);
                                            }
                                            else {
                                                Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var332));
                                                Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var331, (SubLObject)module0252.$ic23$);
                                            }
                                        }
                                        final SubLObject var7_659 = module0141.$g1665$.currentBinding(var332);
                                        final SubLObject var8_658 = module0139.$g1648$.currentBinding(var332);
                                        try {
                                            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var332);
                                            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var332)), var332);
                                            var333 = f16292(var2, var331);
                                        }
                                        finally {
                                            module0139.$g1648$.rebind(var8_658, var332);
                                            module0141.$g1665$.rebind(var7_659, var332);
                                        }
                                    }
                                    finally {
                                        if (module0252.NIL != var344) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var343);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_667, var332);
                                    module0141.$g1684$.rebind(var10_666, var332);
                                    module0141.$g1683$.rebind(var9_657, var332);
                                    module0141.$g1686$.rebind(var8_657, var332);
                                    module0141.$g1685$.rebind(var7_658, var332);
                                }
                                if (var342 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var332));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_657, var332);
                            }
                            if (var342 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var332));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_656, var332);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_656, var332);
                        module0141.$g1677$.rebind(var8_656, var332);
                        module0141.$g1710$.rebind(var7_655, var332);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_655, var332);
                    module0141.$g1714$.rebind(var7_654, var332);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_655, var332);
                module0147.$g2094$.rebind(var8_654, var332);
                module0147.$g2095$.rebind(var7_653, var332);
            }
        }
        finally {
            module0137.$g1605$.rebind(var338, var332);
            module0141.$g1674$.rebind(var337, var332);
            module0141.$g1672$.rebind(var336, var332);
            module0141.$g1671$.rebind(var335, var332);
            module0141.$g1670$.rebind(var334, var332);
        }
        return var333;
    }
    
    public static SubLObject f16293(final SubLObject var1, final SubLObject var2, final SubLObject var331, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var332 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        SubLObject var333 = (SubLObject)module0252.NIL;
        final SubLObject var334 = module0141.$g1670$.currentBinding(var332);
        final SubLObject var335 = module0141.$g1671$.currentBinding(var332);
        final SubLObject var336 = module0141.$g1672$.currentBinding(var332);
        final SubLObject var337 = module0141.$g1674$.currentBinding(var332);
        final SubLObject var338 = module0137.$g1605$.currentBinding(var332);
        try {
            module0141.$g1670$.bind(var1, var332);
            module0141.$g1671$.bind(module0244.f15739(var1), var332);
            module0141.$g1672$.bind(module0244.f15746(var1), var332);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var332);
            module0137.$g1605$.bind(var1, var332);
            final SubLObject var339 = var3;
            final SubLObject var7_670 = module0147.$g2095$.currentBinding(var332);
            final SubLObject var8_671 = module0147.$g2094$.currentBinding(var332);
            final SubLObject var9_672 = module0147.$g2096$.currentBinding(var332);
            try {
                module0147.$g2095$.bind(module0147.f9545(var339), var332);
                module0147.$g2094$.bind(module0147.f9546(var339), var332);
                module0147.$g2096$.bind(module0147.f9549(var339), var332);
                final SubLObject var340 = var4;
                final SubLObject var7_671 = module0141.$g1714$.currentBinding(var332);
                final SubLObject var8_672 = module0141.$g1715$.currentBinding(var332);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var340) ? var340 : module0141.f9283(), var332);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var340) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var332)), var332);
                    if (module0252.NIL != var340 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var340)) {
                        final SubLObject var341 = module0136.$g1591$.getDynamicValue(var332);
                        if (var341.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var340, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var341.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var340, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var341.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var340, (SubLObject)module0252.$ic4$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var332));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var340, (SubLObject)module0252.$ic4$);
                        }
                    }
                    final SubLObject var7_672 = module0141.$g1710$.currentBinding(var332);
                    final SubLObject var8_673 = module0141.$g1677$.currentBinding(var332);
                    final SubLObject var9_673 = module0138.$g1619$.currentBinding(var332);
                    try {
                        module0141.$g1710$.bind(module0252.$ic9$, var332);
                        module0141.$g1677$.bind(module0141.f9210(), var332);
                        module0138.$g1619$.bind(module0244.f15780(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var332);
                        final SubLObject var342 = module0139.f9036();
                        final SubLObject var7_673 = module0139.$g1635$.currentBinding(var332);
                        try {
                            module0139.$g1635$.bind((var342 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var332) : module0139.f9038(var342), var332);
                            final SubLObject var7_674 = module0139.$g1636$.currentBinding(var332);
                            try {
                                module0139.$g1636$.bind((var342 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var332) : module0139.f9038(var342), var332);
                                final SubLObject var7_675 = module0141.$g1685$.currentBinding(var332);
                                final SubLObject var8_674 = module0141.$g1686$.currentBinding(var332);
                                final SubLObject var9_674 = module0141.$g1683$.currentBinding(var332);
                                final SubLObject var10_683 = module0141.$g1684$.currentBinding(var332);
                                final SubLObject var11_684 = module0141.$g1674$.currentBinding(var332);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var332);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var332);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var332);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var332);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var332);
                                    final SubLObject var343 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var344 = (SubLObject)module0252.NIL;
                                    try {
                                        var344 = ReadWriteLocks.rw_lock_seize_read_lock(var343);
                                        if (module0252.NIL != module0136.f8864() && !var331.isFunctionSpec()) {
                                            final SubLObject var345 = module0136.$g1591$.getDynamicValue(var332);
                                            if (var345.eql((SubLObject)module0252.$ic2$)) {
                                                module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var331, (SubLObject)module0252.$ic23$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                            }
                                            else if (var345.eql((SubLObject)module0252.$ic5$)) {
                                                module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var331, (SubLObject)module0252.$ic23$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                            }
                                            else if (var345.eql((SubLObject)module0252.$ic7$)) {
                                                Errors.warn((SubLObject)module0252.$ic3$, var331, (SubLObject)module0252.$ic23$);
                                            }
                                            else {
                                                Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var332));
                                                Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var331, (SubLObject)module0252.$ic23$);
                                            }
                                        }
                                        final SubLObject var7_676 = module0141.$g1665$.currentBinding(var332);
                                        final SubLObject var8_675 = module0139.$g1648$.currentBinding(var332);
                                        try {
                                            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var332);
                                            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var332)), var332);
                                            var333 = f16292(var2, var331);
                                        }
                                        finally {
                                            module0139.$g1648$.rebind(var8_675, var332);
                                            module0141.$g1665$.rebind(var7_676, var332);
                                        }
                                    }
                                    finally {
                                        if (module0252.NIL != var344) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var343);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_684, var332);
                                    module0141.$g1684$.rebind(var10_683, var332);
                                    module0141.$g1683$.rebind(var9_674, var332);
                                    module0141.$g1686$.rebind(var8_674, var332);
                                    module0141.$g1685$.rebind(var7_675, var332);
                                }
                                if (var342 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var332));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_674, var332);
                            }
                            if (var342 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var332));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_673, var332);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_673, var332);
                        module0141.$g1677$.rebind(var8_673, var332);
                        module0141.$g1710$.rebind(var7_672, var332);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_672, var332);
                    module0141.$g1714$.rebind(var7_671, var332);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_672, var332);
                module0147.$g2094$.rebind(var8_671, var332);
                module0147.$g2095$.rebind(var7_670, var332);
            }
        }
        finally {
            module0137.$g1605$.rebind(var338, var332);
            module0141.$g1674$.rebind(var337, var332);
            module0141.$g1672$.rebind(var336, var332);
            module0141.$g1671$.rebind(var335, var332);
            module0141.$g1670$.rebind(var334, var332);
        }
        return var333;
    }
    
    public static SubLObject f16292(final SubLObject var2, final SubLObject var331) {
        final SubLThread var332 = SubLProcess.currentSubLThread();
        SubLObject var333 = (SubLObject)module0252.NIL;
        final SubLObject var334 = module0141.$g1693$.currentBinding(var332);
        final SubLObject var335 = module0141.$g1694$.currentBinding(var332);
        try {
            module0141.$g1693$.bind((SubLObject)module0252.$ic29$, var332);
            module0141.$g1694$.bind(var331, var332);
            var333 = f16246(var2);
        }
        finally {
            module0141.$g1694$.rebind(var335, var332);
            module0141.$g1693$.rebind(var334, var332);
        }
        return var333;
    }
    
    public static SubLObject f16294(final SubLObject var1, final SubLObject var2, final SubLObject var331, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var332 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        SubLObject var333 = (SubLObject)module0252.NIL;
        final SubLObject var334 = module0141.$g1670$.currentBinding(var332);
        final SubLObject var335 = module0141.$g1671$.currentBinding(var332);
        final SubLObject var336 = module0141.$g1672$.currentBinding(var332);
        final SubLObject var337 = module0141.$g1674$.currentBinding(var332);
        final SubLObject var338 = module0137.$g1605$.currentBinding(var332);
        try {
            module0141.$g1670$.bind(var1, var332);
            module0141.$g1671$.bind(module0244.f15739(var1), var332);
            module0141.$g1672$.bind(module0244.f15746(var1), var332);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var332);
            module0137.$g1605$.bind(var1, var332);
            final SubLObject var339 = var3;
            final SubLObject var7_687 = module0147.$g2095$.currentBinding(var332);
            final SubLObject var8_688 = module0147.$g2094$.currentBinding(var332);
            final SubLObject var9_689 = module0147.$g2096$.currentBinding(var332);
            try {
                module0147.$g2095$.bind(module0147.f9545(var339), var332);
                module0147.$g2094$.bind(module0147.f9546(var339), var332);
                module0147.$g2096$.bind(module0147.f9549(var339), var332);
                final SubLObject var340 = var4;
                final SubLObject var7_688 = module0141.$g1714$.currentBinding(var332);
                final SubLObject var8_689 = module0141.$g1715$.currentBinding(var332);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var340) ? var340 : module0141.f9283(), var332);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var340) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var332)), var332);
                    if (module0252.NIL != var340 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var340)) {
                        final SubLObject var341 = module0136.$g1591$.getDynamicValue(var332);
                        if (var341.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var340, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var341.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var340, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var341.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var340, (SubLObject)module0252.$ic4$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var332));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var340, (SubLObject)module0252.$ic4$);
                        }
                    }
                    final SubLObject var7_689 = module0141.$g1710$.currentBinding(var332);
                    final SubLObject var8_690 = module0141.$g1677$.currentBinding(var332);
                    final SubLObject var9_690 = module0138.$g1619$.currentBinding(var332);
                    try {
                        module0141.$g1710$.bind(module0252.$ic9$, var332);
                        module0141.$g1677$.bind(module0141.f9208(), var332);
                        module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var332);
                        final SubLObject var342 = module0139.f9036();
                        final SubLObject var7_690 = module0139.$g1635$.currentBinding(var332);
                        try {
                            module0139.$g1635$.bind((var342 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var332) : module0139.f9038(var342), var332);
                            final SubLObject var7_691 = module0139.$g1636$.currentBinding(var332);
                            try {
                                module0139.$g1636$.bind((var342 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var332) : module0139.f9038(var342), var332);
                                final SubLObject var7_692 = module0141.$g1685$.currentBinding(var332);
                                final SubLObject var8_691 = module0141.$g1686$.currentBinding(var332);
                                final SubLObject var9_691 = module0141.$g1683$.currentBinding(var332);
                                final SubLObject var10_700 = module0141.$g1684$.currentBinding(var332);
                                final SubLObject var11_701 = module0141.$g1674$.currentBinding(var332);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var332);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var332);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var332);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var332);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var332);
                                    final SubLObject var343 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var344 = (SubLObject)module0252.NIL;
                                    try {
                                        var344 = ReadWriteLocks.rw_lock_seize_read_lock(var343);
                                        if (module0252.NIL != module0136.f8864() && !var331.isFunctionSpec()) {
                                            final SubLObject var345 = module0136.$g1591$.getDynamicValue(var332);
                                            if (var345.eql((SubLObject)module0252.$ic2$)) {
                                                module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var331, (SubLObject)module0252.$ic23$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                            }
                                            else if (var345.eql((SubLObject)module0252.$ic5$)) {
                                                module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var331, (SubLObject)module0252.$ic23$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                            }
                                            else if (var345.eql((SubLObject)module0252.$ic7$)) {
                                                Errors.warn((SubLObject)module0252.$ic3$, var331, (SubLObject)module0252.$ic23$);
                                            }
                                            else {
                                                Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var332));
                                                Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var331, (SubLObject)module0252.$ic23$);
                                            }
                                        }
                                        final SubLObject var7_693 = module0141.$g1665$.currentBinding(var332);
                                        final SubLObject var8_692 = module0139.$g1648$.currentBinding(var332);
                                        try {
                                            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var332);
                                            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var332)), var332);
                                            var333 = f16295(var2, var331);
                                        }
                                        finally {
                                            module0139.$g1648$.rebind(var8_692, var332);
                                            module0141.$g1665$.rebind(var7_693, var332);
                                        }
                                    }
                                    finally {
                                        if (module0252.NIL != var344) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var343);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_701, var332);
                                    module0141.$g1684$.rebind(var10_700, var332);
                                    module0141.$g1683$.rebind(var9_691, var332);
                                    module0141.$g1686$.rebind(var8_691, var332);
                                    module0141.$g1685$.rebind(var7_692, var332);
                                }
                                if (var342 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var332));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_691, var332);
                            }
                            if (var342 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var332));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_690, var332);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_690, var332);
                        module0141.$g1677$.rebind(var8_690, var332);
                        module0141.$g1710$.rebind(var7_689, var332);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_689, var332);
                    module0141.$g1714$.rebind(var7_688, var332);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_689, var332);
                module0147.$g2094$.rebind(var8_688, var332);
                module0147.$g2095$.rebind(var7_687, var332);
            }
        }
        finally {
            module0137.$g1605$.rebind(var338, var332);
            module0141.$g1674$.rebind(var337, var332);
            module0141.$g1672$.rebind(var336, var332);
            module0141.$g1671$.rebind(var335, var332);
            module0141.$g1670$.rebind(var334, var332);
        }
        return var333;
    }
    
    public static SubLObject f16296(final SubLObject var1, final SubLObject var2, final SubLObject var331, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var332 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        SubLObject var333 = (SubLObject)module0252.NIL;
        final SubLObject var334 = module0141.$g1670$.currentBinding(var332);
        final SubLObject var335 = module0141.$g1671$.currentBinding(var332);
        final SubLObject var336 = module0141.$g1672$.currentBinding(var332);
        final SubLObject var337 = module0141.$g1674$.currentBinding(var332);
        final SubLObject var338 = module0137.$g1605$.currentBinding(var332);
        try {
            module0141.$g1670$.bind(var1, var332);
            module0141.$g1671$.bind(module0244.f15739(var1), var332);
            module0141.$g1672$.bind(module0244.f15746(var1), var332);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var332);
            module0137.$g1605$.bind(var1, var332);
            final SubLObject var339 = var3;
            final SubLObject var7_704 = module0147.$g2095$.currentBinding(var332);
            final SubLObject var8_705 = module0147.$g2094$.currentBinding(var332);
            final SubLObject var9_706 = module0147.$g2096$.currentBinding(var332);
            try {
                module0147.$g2095$.bind(module0147.f9545(var339), var332);
                module0147.$g2094$.bind(module0147.f9546(var339), var332);
                module0147.$g2096$.bind(module0147.f9549(var339), var332);
                final SubLObject var340 = var4;
                final SubLObject var7_705 = module0141.$g1714$.currentBinding(var332);
                final SubLObject var8_706 = module0141.$g1715$.currentBinding(var332);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var340) ? var340 : module0141.f9283(), var332);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var340) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var332)), var332);
                    if (module0252.NIL != var340 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var340)) {
                        final SubLObject var341 = module0136.$g1591$.getDynamicValue(var332);
                        if (var341.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var340, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var341.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var340, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var341.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var340, (SubLObject)module0252.$ic4$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var332));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var340, (SubLObject)module0252.$ic4$);
                        }
                    }
                    final SubLObject var7_706 = module0141.$g1710$.currentBinding(var332);
                    final SubLObject var8_707 = module0141.$g1677$.currentBinding(var332);
                    final SubLObject var9_707 = module0138.$g1619$.currentBinding(var332);
                    try {
                        module0141.$g1710$.bind(module0252.$ic9$, var332);
                        module0141.$g1677$.bind(module0141.f9210(), var332);
                        module0138.$g1619$.bind(module0244.f15780(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var332);
                        final SubLObject var342 = module0139.f9036();
                        final SubLObject var7_707 = module0139.$g1635$.currentBinding(var332);
                        try {
                            module0139.$g1635$.bind((var342 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var332) : module0139.f9038(var342), var332);
                            final SubLObject var7_708 = module0139.$g1636$.currentBinding(var332);
                            try {
                                module0139.$g1636$.bind((var342 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var332) : module0139.f9038(var342), var332);
                                final SubLObject var7_709 = module0141.$g1685$.currentBinding(var332);
                                final SubLObject var8_708 = module0141.$g1686$.currentBinding(var332);
                                final SubLObject var9_708 = module0141.$g1683$.currentBinding(var332);
                                final SubLObject var10_717 = module0141.$g1684$.currentBinding(var332);
                                final SubLObject var11_718 = module0141.$g1674$.currentBinding(var332);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var332);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var332);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var332);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var332);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var332);
                                    final SubLObject var343 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var344 = (SubLObject)module0252.NIL;
                                    try {
                                        var344 = ReadWriteLocks.rw_lock_seize_read_lock(var343);
                                        if (module0252.NIL != module0136.f8864() && !var331.isFunctionSpec()) {
                                            final SubLObject var345 = module0136.$g1591$.getDynamicValue(var332);
                                            if (var345.eql((SubLObject)module0252.$ic2$)) {
                                                module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var331, (SubLObject)module0252.$ic23$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                            }
                                            else if (var345.eql((SubLObject)module0252.$ic5$)) {
                                                module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var331, (SubLObject)module0252.$ic23$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                            }
                                            else if (var345.eql((SubLObject)module0252.$ic7$)) {
                                                Errors.warn((SubLObject)module0252.$ic3$, var331, (SubLObject)module0252.$ic23$);
                                            }
                                            else {
                                                Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var332));
                                                Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var331, (SubLObject)module0252.$ic23$);
                                            }
                                        }
                                        final SubLObject var7_710 = module0141.$g1665$.currentBinding(var332);
                                        final SubLObject var8_709 = module0139.$g1648$.currentBinding(var332);
                                        try {
                                            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var332);
                                            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var332)), var332);
                                            var333 = f16295(var2, var331);
                                        }
                                        finally {
                                            module0139.$g1648$.rebind(var8_709, var332);
                                            module0141.$g1665$.rebind(var7_710, var332);
                                        }
                                    }
                                    finally {
                                        if (module0252.NIL != var344) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var343);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_718, var332);
                                    module0141.$g1684$.rebind(var10_717, var332);
                                    module0141.$g1683$.rebind(var9_708, var332);
                                    module0141.$g1686$.rebind(var8_708, var332);
                                    module0141.$g1685$.rebind(var7_709, var332);
                                }
                                if (var342 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var332));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_708, var332);
                            }
                            if (var342 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var332));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_707, var332);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_707, var332);
                        module0141.$g1677$.rebind(var8_707, var332);
                        module0141.$g1710$.rebind(var7_706, var332);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_706, var332);
                    module0141.$g1714$.rebind(var7_705, var332);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_706, var332);
                module0147.$g2094$.rebind(var8_705, var332);
                module0147.$g2095$.rebind(var7_704, var332);
            }
        }
        finally {
            module0137.$g1605$.rebind(var338, var332);
            module0141.$g1674$.rebind(var337, var332);
            module0141.$g1672$.rebind(var336, var332);
            module0141.$g1671$.rebind(var335, var332);
            module0141.$g1670$.rebind(var334, var332);
        }
        return var333;
    }
    
    public static SubLObject f16295(final SubLObject var2, final SubLObject var331) {
        final SubLThread var332 = SubLProcess.currentSubLThread();
        SubLObject var333 = (SubLObject)module0252.NIL;
        final SubLObject var334 = module0141.$g1693$.currentBinding(var332);
        final SubLObject var335 = module0141.$g1694$.currentBinding(var332);
        try {
            module0141.$g1693$.bind((SubLObject)module0252.$ic30$, var332);
            module0141.$g1694$.bind(var331, var332);
            var333 = f16246(var2);
        }
        finally {
            module0141.$g1694$.rebind(var335, var332);
            module0141.$g1693$.rebind(var334, var332);
        }
        return var333;
    }
    
    public static SubLObject f16297(final SubLObject var132) {
        final SubLThread var133 = SubLProcess.currentSubLThread();
        final SubLObject var134 = module0035.f2269(var132, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
        SubLObject var135 = (SubLObject)module0252.NIL;
        SubLObject var136 = var134;
        SubLObject var137 = (SubLObject)module0252.NIL;
        var137 = var136.first();
        while (module0252.NIL != var136) {
            if (module0252.NIL == module0249.f16059(var137, (SubLObject)module0252.UNPROVIDED)) {
                module0251.f16209(var137);
                if (module0252.NIL != module0249.f16059(var137, (SubLObject)module0252.UNPROVIDED)) {
                    final SubLObject var138 = module0138.$g1619$.currentBinding(var133);
                    try {
                        module0138.$g1619$.bind(module0138.f8980(), var133);
                        module0251.f16211(var137);
                    }
                    finally {
                        module0138.$g1619$.rebind(var138, var133);
                    }
                }
            }
            var136 = var136.rest();
            var137 = var136.first();
        }
        var136 = var134;
        var137 = (SubLObject)module0252.NIL;
        var137 = var136.first();
        while (module0252.NIL != var136) {
            if (module0252.NIL == module0249.f16059(var137, (SubLObject)module0252.UNPROVIDED)) {
                var135 = (SubLObject)ConsesLow.cons(var137, var135);
            }
            var136 = var136.rest();
            var137 = var136.first();
        }
        return var135;
    }
    
    public static SubLObject f16298(final SubLObject var1, final SubLObject var132, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var133 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        if (module0252.NIL != module0035.f1994(var132, (SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.UNPROVIDED)) {
            return var132;
        }
        SubLObject var134 = (SubLObject)module0252.NIL;
        final SubLObject var135 = module0141.$g1670$.currentBinding(var133);
        final SubLObject var136 = module0141.$g1671$.currentBinding(var133);
        final SubLObject var137 = module0141.$g1672$.currentBinding(var133);
        final SubLObject var138 = module0141.$g1674$.currentBinding(var133);
        final SubLObject var139 = module0137.$g1605$.currentBinding(var133);
        try {
            module0141.$g1670$.bind(var1, var133);
            module0141.$g1671$.bind(module0244.f15739(var1), var133);
            module0141.$g1672$.bind(module0244.f15746(var1), var133);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var133);
            module0137.$g1605$.bind(var1, var133);
            final SubLObject var140 = var3;
            final SubLObject var7_722 = module0147.$g2095$.currentBinding(var133);
            final SubLObject var8_723 = module0147.$g2094$.currentBinding(var133);
            final SubLObject var9_724 = module0147.$g2096$.currentBinding(var133);
            try {
                module0147.$g2095$.bind(module0147.f9545(var140), var133);
                module0147.$g2094$.bind(module0147.f9546(var140), var133);
                module0147.$g2096$.bind(module0147.f9549(var140), var133);
                final SubLObject var141 = var4;
                final SubLObject var7_723 = module0141.$g1714$.currentBinding(var133);
                final SubLObject var8_724 = module0141.$g1715$.currentBinding(var133);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var141) ? var141 : module0141.f9283(), var133);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var141) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var133)), var133);
                    if (module0252.NIL != var141 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var141)) {
                        final SubLObject var142 = module0136.$g1591$.getDynamicValue(var133);
                        if (var142.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var141, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var142.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var141, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var142.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var141, (SubLObject)module0252.$ic4$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var133));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var141, (SubLObject)module0252.$ic4$);
                        }
                    }
                    final SubLObject var7_724 = module0141.$g1710$.currentBinding(var133);
                    final SubLObject var8_725 = module0141.$g1677$.currentBinding(var133);
                    final SubLObject var9_725 = module0138.$g1619$.currentBinding(var133);
                    try {
                        module0141.$g1710$.bind(module0252.$ic9$, var133);
                        module0141.$g1677$.bind(module0141.f9210(), var133);
                        module0138.$g1619$.bind(module0244.f15780(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var133);
                        final SubLObject var143 = module0139.f9036();
                        final SubLObject var7_725 = module0139.$g1635$.currentBinding(var133);
                        try {
                            module0139.$g1635$.bind((var143 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var133) : module0139.f9038(var143), var133);
                            final SubLObject var7_726 = module0139.$g1636$.currentBinding(var133);
                            try {
                                module0139.$g1636$.bind((var143 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var133) : module0139.f9038(var143), var133);
                                final SubLObject var7_727 = module0141.$g1685$.currentBinding(var133);
                                final SubLObject var8_726 = module0141.$g1686$.currentBinding(var133);
                                final SubLObject var9_726 = module0141.$g1683$.currentBinding(var133);
                                final SubLObject var10_735 = module0141.$g1684$.currentBinding(var133);
                                final SubLObject var11_736 = module0141.$g1674$.currentBinding(var133);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var133);
                                    final SubLObject var144 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var145 = (SubLObject)module0252.NIL;
                                    try {
                                        var145 = ReadWriteLocks.rw_lock_seize_read_lock(var144);
                                        final SubLObject var7_728 = module0141.$g1665$.currentBinding(var133);
                                        final SubLObject var8_727 = module0139.$g1648$.currentBinding(var133);
                                        try {
                                            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var133);
                                            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var133)), var133);
                                            var134 = f16297(var132);
                                        }
                                        finally {
                                            module0139.$g1648$.rebind(var8_727, var133);
                                            module0141.$g1665$.rebind(var7_728, var133);
                                        }
                                    }
                                    finally {
                                        if (module0252.NIL != var145) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var144);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_736, var133);
                                    module0141.$g1684$.rebind(var10_735, var133);
                                    module0141.$g1683$.rebind(var9_726, var133);
                                    module0141.$g1686$.rebind(var8_726, var133);
                                    module0141.$g1685$.rebind(var7_727, var133);
                                }
                                if (var143 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var133));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_726, var133);
                            }
                            if (var143 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var133));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_725, var133);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_725, var133);
                        module0141.$g1677$.rebind(var8_725, var133);
                        module0141.$g1710$.rebind(var7_724, var133);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_724, var133);
                    module0141.$g1714$.rebind(var7_723, var133);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_724, var133);
                module0147.$g2094$.rebind(var8_723, var133);
                module0147.$g2095$.rebind(var7_722, var133);
            }
        }
        finally {
            module0137.$g1605$.rebind(var139, var133);
            module0141.$g1674$.rebind(var138, var133);
            module0141.$g1672$.rebind(var137, var133);
            module0141.$g1671$.rebind(var136, var133);
            module0141.$g1670$.rebind(var135, var133);
        }
        return var134;
    }
    
    public static SubLObject f16299(final SubLObject var132) {
        final SubLThread var133 = SubLProcess.currentSubLThread();
        SubLObject var134 = (SubLObject)module0252.NIL;
        final SubLObject var135 = module0139.$g1646$.currentBinding(var133);
        try {
            module0139.$g1646$.bind(module0139.f9007(), var133);
            final SubLObject var7_740 = module0139.$g1647$.currentBinding(var133);
            try {
                module0139.$g1647$.bind(module0139.f9007(), var133);
                module0249.f16084(var132);
                SubLObject var136 = var132;
                SubLObject var137 = (SubLObject)module0252.NIL;
                var137 = var136.first();
                while (module0252.NIL != var136) {
                    if (module0252.NIL == module0035.f2428(var137, var134, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED)) {
                        final SubLObject var138 = module0139.f9036();
                        final SubLObject var7_741 = module0139.$g1635$.currentBinding(var133);
                        try {
                            module0139.$g1635$.bind((var138 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var133) : module0139.f9038(var138), var133);
                            final SubLObject var7_742 = module0139.$g1636$.currentBinding(var133);
                            try {
                                module0139.$g1636$.bind((var138 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var133) : module0139.f9038(var138), var133);
                                final SubLObject var7_743 = module0141.$g1685$.currentBinding(var133);
                                final SubLObject var139 = module0141.$g1686$.currentBinding(var133);
                                final SubLObject var140 = module0141.$g1683$.currentBinding(var133);
                                final SubLObject var141 = module0141.$g1684$.currentBinding(var133);
                                final SubLObject var142 = module0141.$g1674$.currentBinding(var133);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var133);
                                    final SubLObject var143 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var144 = (SubLObject)module0252.NIL;
                                    try {
                                        var144 = ReadWriteLocks.rw_lock_seize_read_lock(var143);
                                        module0251.f16209(var137);
                                        if (module0252.NIL != module0249.f16059(var137, (SubLObject)module0252.UNPROVIDED)) {
                                            final SubLObject var7_744 = module0138.$g1619$.currentBinding(var133);
                                            try {
                                                module0138.$g1619$.bind(module0138.f8980(), var133);
                                                SubLObject var145 = (SubLObject)module0252.NIL;
                                                final SubLObject var7_745 = module0141.$g1691$.currentBinding(var133);
                                                try {
                                                    module0141.$g1691$.bind((SubLObject)module0252.NIL, var133);
                                                    try {
                                                        module0251.f16217(var137, (SubLObject)module0252.$ic31$);
                                                    }
                                                    finally {
                                                        final SubLObject var7_746 = Threads.$is_thread_performing_cleanupP$.currentBinding(var133);
                                                        try {
                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0252.T, var133);
                                                            var145 = module0141.$g1691$.getDynamicValue(var133);
                                                        }
                                                        finally {
                                                            Threads.$is_thread_performing_cleanupP$.rebind(var7_746, var133);
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1691$.rebind(var7_745, var133);
                                                }
                                                if (module0252.NIL != var145) {
                                                    var134 = (SubLObject)ConsesLow.cons(var145, var134);
                                                }
                                            }
                                            finally {
                                                module0138.$g1619$.rebind(var7_744, var133);
                                            }
                                        }
                                    }
                                    finally {
                                        if (module0252.NIL != var144) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var143);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var142, var133);
                                    module0141.$g1684$.rebind(var141, var133);
                                    module0141.$g1683$.rebind(var140, var133);
                                    module0141.$g1686$.rebind(var139, var133);
                                    module0141.$g1685$.rebind(var7_743, var133);
                                }
                                if (var138 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var133));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_742, var133);
                            }
                            if (var138 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var133));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_741, var133);
                        }
                    }
                    var136 = var136.rest();
                    var137 = var136.first();
                }
                module0139.f9011(module0139.$g1647$.getDynamicValue(var133));
            }
            finally {
                module0139.$g1647$.rebind(var7_740, var133);
            }
            module0139.f9011(module0139.$g1646$.getDynamicValue(var133));
        }
        finally {
            module0139.$g1646$.rebind(var135, var133);
        }
        return var134;
    }
    
    public static SubLObject f16300(final SubLObject var1, final SubLObject var132, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var133 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        final SubLObject var134 = module0035.f2269(var132, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
        SubLObject var135 = (SubLObject)module0252.NIL;
        SubLObject var136 = (SubLObject)module0252.NIL;
        SubLObject var137 = (SubLObject)module0252.NIL;
        if (module0252.NIL != module0035.f1994(var134, (SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.UNPROVIDED)) {
            return var134;
        }
        final SubLObject var138 = module0141.$g1670$.currentBinding(var133);
        final SubLObject var139 = module0141.$g1671$.currentBinding(var133);
        final SubLObject var140 = module0141.$g1672$.currentBinding(var133);
        final SubLObject var141 = module0141.$g1674$.currentBinding(var133);
        final SubLObject var142 = module0137.$g1605$.currentBinding(var133);
        try {
            module0141.$g1670$.bind(var1, var133);
            module0141.$g1671$.bind(module0244.f15739(var1), var133);
            module0141.$g1672$.bind(module0244.f15746(var1), var133);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var133);
            module0137.$g1605$.bind(var1, var133);
            final SubLObject var143 = var3;
            final SubLObject var7_749 = module0147.$g2095$.currentBinding(var133);
            final SubLObject var8_750 = module0147.$g2094$.currentBinding(var133);
            final SubLObject var9_751 = module0147.$g2096$.currentBinding(var133);
            try {
                module0147.$g2095$.bind(module0147.f9545(var143), var133);
                module0147.$g2094$.bind(module0147.f9546(var143), var133);
                module0147.$g2096$.bind(module0147.f9549(var143), var133);
                final SubLObject var144 = var4;
                final SubLObject var7_750 = module0141.$g1714$.currentBinding(var133);
                final SubLObject var8_751 = module0141.$g1715$.currentBinding(var133);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var144) ? var144 : module0141.f9283(), var133);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var144) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var133)), var133);
                    if (module0252.NIL != var144 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var144)) {
                        final SubLObject var145 = module0136.$g1591$.getDynamicValue(var133);
                        if (var145.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var144, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var145.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var144, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var145.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var144, (SubLObject)module0252.$ic4$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var133));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var144, (SubLObject)module0252.$ic4$);
                        }
                    }
                    final SubLObject var7_751 = module0141.$g1710$.currentBinding(var133);
                    final SubLObject var8_752 = module0141.$g1677$.currentBinding(var133);
                    final SubLObject var9_752 = module0138.$g1619$.currentBinding(var133);
                    try {
                        module0141.$g1710$.bind(module0252.$ic9$, var133);
                        module0141.$g1677$.bind(module0141.f9208(), var133);
                        module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var133);
                        final SubLObject var146 = module0139.f9036();
                        final SubLObject var7_752 = module0139.$g1635$.currentBinding(var133);
                        try {
                            module0139.$g1635$.bind((var146 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var133) : module0139.f9038(var146), var133);
                            final SubLObject var7_753 = module0139.$g1636$.currentBinding(var133);
                            try {
                                module0139.$g1636$.bind((var146 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var133) : module0139.f9038(var146), var133);
                                final SubLObject var7_754 = module0141.$g1685$.currentBinding(var133);
                                final SubLObject var8_753 = module0141.$g1686$.currentBinding(var133);
                                final SubLObject var9_753 = module0141.$g1683$.currentBinding(var133);
                                final SubLObject var10_762 = module0141.$g1684$.currentBinding(var133);
                                final SubLObject var11_763 = module0141.$g1674$.currentBinding(var133);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var133);
                                    final SubLObject var147 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var148 = (SubLObject)module0252.NIL;
                                    try {
                                        var148 = ReadWriteLocks.rw_lock_seize_read_lock(var147);
                                        final SubLObject var7_755 = module0141.$g1665$.currentBinding(var133);
                                        final SubLObject var8_754 = module0139.$g1648$.currentBinding(var133);
                                        try {
                                            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var133);
                                            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var133)), var133);
                                            var135 = f16299(var134);
                                            SubLObject var149 = var134;
                                            SubLObject var150 = (SubLObject)module0252.NIL;
                                            var150 = var149.first();
                                            while (module0252.NIL != var149) {
                                                final SubLObject var23_766 = module0139.f9036();
                                                final SubLObject var7_756 = module0139.$g1635$.currentBinding(var133);
                                                try {
                                                    module0139.$g1635$.bind((var23_766 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var133) : module0139.f9038(var23_766), var133);
                                                    final SubLObject var7_757 = module0139.$g1636$.currentBinding(var133);
                                                    try {
                                                        module0139.$g1636$.bind((var23_766 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var133) : module0139.f9038(var23_766), var133);
                                                        final SubLObject var7_758 = module0141.$g1685$.currentBinding(var133);
                                                        final SubLObject var8_755 = module0141.$g1686$.currentBinding(var133);
                                                        final SubLObject var9_754 = module0141.$g1683$.currentBinding(var133);
                                                        final SubLObject var10_763 = module0141.$g1684$.currentBinding(var133);
                                                        final SubLObject var11_764 = module0141.$g1674$.currentBinding(var133);
                                                        try {
                                                            module0141.$g1685$.bind((SubLObject)module0252.NIL, var133);
                                                            module0141.$g1686$.bind((SubLObject)module0252.NIL, var133);
                                                            module0141.$g1683$.bind((SubLObject)module0252.NIL, var133);
                                                            module0141.$g1684$.bind((SubLObject)module0252.NIL, var133);
                                                            module0141.$g1674$.bind((SubLObject)module0252.NIL, var133);
                                                            final SubLObject var31_774 = module0138.$g1626$.getGlobalValue();
                                                            SubLObject var32_775 = (SubLObject)module0252.NIL;
                                                            try {
                                                                var32_775 = ReadWriteLocks.rw_lock_seize_read_lock(var31_774);
                                                                final SubLObject var151 = conses_high.member(var150, var135, (SubLObject)module0252.$ic32$, (SubLObject)module0252.UNPROVIDED).first();
                                                                SubLObject var152 = (SubLObject)module0252.NIL;
                                                                var152 = ((module0252.NIL != var151) ? conses_high.set_difference(var134, var151, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED) : Sequences.remove(var150, var134, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED));
                                                                if (module0252.NIL == module0004.f104(var150, var136, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED)) {
                                                                    var136 = ConsesLow.nconc(conses_high.copy_list(var151), var136);
                                                                    if (module0252.NIL == f16301(var150, var152)) {
                                                                        if (module0252.NIL != var151) {
                                                                            var137 = ConsesLow.nconc(conses_high.copy_list(var151), var137);
                                                                        }
                                                                        else {
                                                                            var137 = (SubLObject)ConsesLow.cons(var150, var137);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            finally {
                                                                if (module0252.NIL != var32_775) {
                                                                    ReadWriteLocks.rw_lock_release_read_lock(var31_774);
                                                                }
                                                            }
                                                        }
                                                        finally {
                                                            module0141.$g1674$.rebind(var11_764, var133);
                                                            module0141.$g1684$.rebind(var10_763, var133);
                                                            module0141.$g1683$.rebind(var9_754, var133);
                                                            module0141.$g1686$.rebind(var8_755, var133);
                                                            module0141.$g1685$.rebind(var7_758, var133);
                                                        }
                                                        if (var23_766 == module0252.$ic12$) {
                                                            module0139.f9012(module0139.$g1636$.getDynamicValue(var133));
                                                        }
                                                    }
                                                    finally {
                                                        module0139.$g1636$.rebind(var7_757, var133);
                                                    }
                                                    if (var23_766 == module0252.$ic12$) {
                                                        module0139.f9012(module0139.$g1635$.getDynamicValue(var133));
                                                    }
                                                }
                                                finally {
                                                    module0139.$g1635$.rebind(var7_756, var133);
                                                }
                                                var149 = var149.rest();
                                                var150 = var149.first();
                                            }
                                        }
                                        finally {
                                            module0139.$g1648$.rebind(var8_754, var133);
                                            module0141.$g1665$.rebind(var7_755, var133);
                                        }
                                    }
                                    finally {
                                        if (module0252.NIL != var148) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var147);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_763, var133);
                                    module0141.$g1684$.rebind(var10_762, var133);
                                    module0141.$g1683$.rebind(var9_753, var133);
                                    module0141.$g1686$.rebind(var8_753, var133);
                                    module0141.$g1685$.rebind(var7_754, var133);
                                }
                                if (var146 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var133));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_753, var133);
                            }
                            if (var146 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var133));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_752, var133);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_752, var133);
                        module0141.$g1677$.rebind(var8_752, var133);
                        module0141.$g1710$.rebind(var7_751, var133);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_751, var133);
                    module0141.$g1714$.rebind(var7_750, var133);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_751, var133);
                module0147.$g2094$.rebind(var8_750, var133);
                module0147.$g2095$.rebind(var7_749, var133);
            }
        }
        finally {
            module0137.$g1605$.rebind(var142, var133);
            module0141.$g1674$.rebind(var141, var133);
            module0141.$g1672$.rebind(var140, var133);
            module0141.$g1671$.rebind(var139, var133);
            module0141.$g1670$.rebind(var138, var133);
        }
        return var137;
    }
    
    public static SubLObject f16302(final SubLObject var132) {
        final SubLObject var133 = Numbers.subtract(Sequences.length(var132), (SubLObject)module0252.ONE_INTEGER);
        SubLObject var134 = (SubLObject)module0252.ZERO_INTEGER;
        SubLObject var135 = (SubLObject)module0252.ZERO_INTEGER;
        SubLObject var136 = var132;
        SubLObject var137 = (SubLObject)module0252.NIL;
        var137 = var136.first();
        while (module0252.NIL != var136) {
            var135 = Numbers.add(var135, module0549.f33901(var137));
            var134 = Numbers.add(var134, var133, module0549.f33899(var137));
            var136 = var136.rest();
            var137 = var136.first();
        }
        if (var134.numL(var135)) {
            return (SubLObject)module0252.$ic33$;
        }
        return (SubLObject)module0252.$ic34$;
    }
    
    public static SubLObject f16262(final SubLObject var1, SubLObject var132, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var133 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        var132 = module0035.f2269(var132, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
        if (module0252.NIL != module0035.f1994(var132, (SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.UNPROVIDED)) {
            return var132;
        }
        SubLObject var134 = (SubLObject)module0252.NIL;
        final SubLObject var135 = module0141.$g1670$.currentBinding(var133);
        final SubLObject var136 = module0141.$g1671$.currentBinding(var133);
        final SubLObject var137 = module0141.$g1672$.currentBinding(var133);
        final SubLObject var138 = module0141.$g1674$.currentBinding(var133);
        final SubLObject var139 = module0137.$g1605$.currentBinding(var133);
        try {
            module0141.$g1670$.bind(var1, var133);
            module0141.$g1671$.bind(module0244.f15739(var1), var133);
            module0141.$g1672$.bind(module0244.f15746(var1), var133);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var133);
            module0137.$g1605$.bind(var1, var133);
            final SubLObject var140 = var3;
            final SubLObject var7_781 = module0147.$g2095$.currentBinding(var133);
            final SubLObject var8_782 = module0147.$g2094$.currentBinding(var133);
            final SubLObject var9_783 = module0147.$g2096$.currentBinding(var133);
            try {
                module0147.$g2095$.bind(module0147.f9545(var140), var133);
                module0147.$g2094$.bind(module0147.f9546(var140), var133);
                module0147.$g2096$.bind(module0147.f9549(var140), var133);
                final SubLObject var141 = var4;
                final SubLObject var7_782 = module0141.$g1714$.currentBinding(var133);
                final SubLObject var8_783 = module0141.$g1715$.currentBinding(var133);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var141) ? var141 : module0141.f9283(), var133);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var141) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var133)), var133);
                    if (module0252.NIL != var141 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var141)) {
                        final SubLObject var142 = module0136.$g1591$.getDynamicValue(var133);
                        if (var142.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var141, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var142.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var141, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var142.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var141, (SubLObject)module0252.$ic4$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var133));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var141, (SubLObject)module0252.$ic4$);
                        }
                    }
                    final SubLObject var7_783 = module0141.$g1710$.currentBinding(var133);
                    final SubLObject var8_784 = module0141.$g1677$.currentBinding(var133);
                    final SubLObject var9_784 = module0138.$g1619$.currentBinding(var133);
                    try {
                        module0141.$g1710$.bind(module0252.$ic9$, var133);
                        module0141.$g1677$.bind(module0141.f9208(), var133);
                        module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var133);
                        final SubLObject var143 = module0139.f9036();
                        final SubLObject var7_784 = module0139.$g1635$.currentBinding(var133);
                        try {
                            module0139.$g1635$.bind((var143 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var133) : module0139.f9038(var143), var133);
                            final SubLObject var7_785 = module0139.$g1636$.currentBinding(var133);
                            try {
                                module0139.$g1636$.bind((var143 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var133) : module0139.f9038(var143), var133);
                                final SubLObject var7_786 = module0141.$g1685$.currentBinding(var133);
                                final SubLObject var8_785 = module0141.$g1686$.currentBinding(var133);
                                final SubLObject var9_785 = module0141.$g1683$.currentBinding(var133);
                                final SubLObject var10_794 = module0141.$g1684$.currentBinding(var133);
                                final SubLObject var11_795 = module0141.$g1674$.currentBinding(var133);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var133);
                                    final SubLObject var144 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var145 = (SubLObject)module0252.NIL;
                                    try {
                                        var145 = ReadWriteLocks.rw_lock_seize_read_lock(var144);
                                        final SubLObject var7_787 = module0141.$g1665$.currentBinding(var133);
                                        final SubLObject var8_786 = module0139.$g1648$.currentBinding(var133);
                                        try {
                                            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var133);
                                            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var133)), var133);
                                            var134 = f16297(var132);
                                        }
                                        finally {
                                            module0139.$g1648$.rebind(var8_786, var133);
                                            module0141.$g1665$.rebind(var7_787, var133);
                                        }
                                    }
                                    finally {
                                        if (module0252.NIL != var145) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var144);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_795, var133);
                                    module0141.$g1684$.rebind(var10_794, var133);
                                    module0141.$g1683$.rebind(var9_785, var133);
                                    module0141.$g1686$.rebind(var8_785, var133);
                                    module0141.$g1685$.rebind(var7_786, var133);
                                }
                                if (var143 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var133));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_785, var133);
                            }
                            if (var143 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var133));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_784, var133);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_784, var133);
                        module0141.$g1677$.rebind(var8_784, var133);
                        module0141.$g1710$.rebind(var7_783, var133);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_783, var133);
                    module0141.$g1714$.rebind(var7_782, var133);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_783, var133);
                module0147.$g2094$.rebind(var8_782, var133);
                module0147.$g2095$.rebind(var7_781, var133);
            }
        }
        finally {
            module0137.$g1605$.rebind(var139, var133);
            module0141.$g1674$.rebind(var138, var133);
            module0141.$g1672$.rebind(var137, var133);
            module0141.$g1671$.rebind(var136, var133);
            module0141.$g1670$.rebind(var135, var133);
        }
        return var134;
    }
    
    public static SubLObject f16260(final SubLObject var1, SubLObject var132, SubLObject var3, SubLObject var4, SubLObject var798) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        if (var798 == module0252.UNPROVIDED) {
            var798 = (SubLObject)module0252.NIL;
        }
        assert module0252.NIL != module0137.f8885(var1) : var1;
        var132 = module0035.f2269(var132, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
        if (module0252.NIL != module0035.f1997(var132)) {
            return var132;
        }
        final SubLObject var800;
        final SubLObject var799 = var800 = ((module0252.NIL != var798) ? var798 : f16302(var132));
        if (var800.eql((SubLObject)module0252.$ic34$)) {
            return f16298(var1, var132, var3, var4);
        }
        if (var800.eql((SubLObject)module0252.$ic33$)) {
            return f16300(var1, var132, var3, var4);
        }
        return (SubLObject)module0252.NIL;
    }
    
    public static SubLObject f16303(final SubLObject var1, final SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        assert module0252.NIL != module0137.f8885(var1) : var1;
        if (module0252.NIL == module0244.f15795(var2, var1)) {
            return (SubLObject)module0252.NIL;
        }
        final SubLObject var5 = module0248.f15931(var1, var2, var3, var4, (SubLObject)module0252.UNPROVIDED);
        if (module0252.NIL == var5) {
            final SubLObject var6 = module0244.f15749(var1);
            return (SubLObject)((module0252.NIL != var6) ? ConsesLow.list(var6) : module0252.NIL);
        }
        return f16262(module0244.f15774(var1), var5, var3, var4);
    }
    
    public static SubLObject f16304(final SubLObject var1, final SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        assert module0252.NIL != module0137.f8885(var1) : var1;
        if (module0252.NIL == module0244.f15795(var2, var1)) {
            return (SubLObject)module0252.NIL;
        }
        final SubLObject var5 = module0248.f15931(var1, var2, var3, var4, (SubLObject)module0252.UNPROVIDED);
        return f16260(module0244.f15774(var1), var5, var3, var4, (SubLObject)module0252.UNPROVIDED);
    }
    
    public static SubLObject f16305(final SubLObject var1, final SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        assert module0252.NIL != module0137.f8885(var1) : var1;
        if (module0252.NIL == module0244.f15795(var2, var1)) {
            return (SubLObject)module0252.NIL;
        }
        final SubLObject var5 = module0248.f15932(var1, var2, var3, var4, (SubLObject)module0252.UNPROVIDED);
        return f16262(module0244.f15774(var1), var5, var3, var4);
    }
    
    public static SubLObject f16306(final SubLObject var1, final SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        assert module0252.NIL != module0137.f8885(var1) : var1;
        if (module0252.NIL == module0244.f15795(var2, var1)) {
            return (SubLObject)module0252.NIL;
        }
        final SubLObject var5 = module0248.f15932(var1, var2, var3, var4, (SubLObject)module0252.UNPROVIDED);
        return f16260(module0244.f15774(var1), var5, var3, var4, (SubLObject)module0252.UNPROVIDED);
    }
    
    public static SubLObject f16307(final SubLObject var1, final SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        assert module0252.NIL != module0137.f8885(var1) : var1;
        if (module0252.NIL == module0244.f15795(var2, var1)) {
            return (SubLObject)module0252.NIL;
        }
        final SubLObject var5 = module0248.f15933(var1, var2, var3, var4, (SubLObject)module0252.UNPROVIDED);
        return f16262(module0244.f15774(var1), var5, var3, var4);
    }
    
    public static SubLObject f16308(final SubLObject var1, final SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        assert module0252.NIL != module0137.f8885(var1) : var1;
        if (module0252.NIL == module0244.f15795(var2, var1)) {
            return (SubLObject)module0252.NIL;
        }
        final SubLObject var5 = module0248.f15933(var1, var2, var3, var4, (SubLObject)module0252.UNPROVIDED);
        return f16260(module0244.f15774(var1), var5, var3, var4, (SubLObject)module0252.UNPROVIDED);
    }
    
    public static SubLObject f16309(final SubLObject var1, final SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        assert module0252.NIL != module0137.f8885(var1) : var1;
        if (module0252.NIL == module0244.f15795(var2, var1)) {
            return (SubLObject)module0252.NIL;
        }
        final SubLObject var5 = module0248.f15935(var1, var2, var3, var4, (SubLObject)module0252.UNPROVIDED);
        return f16262(module0244.f15774(var1), var5, var3, var4);
    }
    
    public static SubLObject f16310(final SubLObject var1, final SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        assert module0252.NIL != module0137.f8885(var1) : var1;
        if (module0252.NIL == module0244.f15795(var2, var1)) {
            return (SubLObject)module0252.NIL;
        }
        final SubLObject var5 = module0248.f15935(var1, var2, var3, var4, (SubLObject)module0252.UNPROVIDED);
        return f16260(module0244.f15774(var1), var5, var3, var4, (SubLObject)module0252.UNPROVIDED);
    }
    
    public static SubLObject f16311(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0139.$g1635$.currentBinding(var3);
        final SubLObject var5 = module0139.$g1636$.currentBinding(var3);
        try {
            module0139.$g1635$.bind(module0139.$g1646$.getDynamicValue(var3), var3);
            module0139.$g1636$.bind(module0139.$g1647$.getDynamicValue(var3), var3);
            if (module0252.NIL != module0249.f16059(var2, (SubLObject)module0252.UNPROVIDED)) {
                module0141.$g1691$.setDynamicValue((SubLObject)ConsesLow.cons(var2, module0141.$g1691$.getDynamicValue(var3)), var3);
                module0141.f9239();
            }
            else {
                module0141.f9240();
            }
        }
        finally {
            module0139.$g1636$.rebind(var5, var3);
            module0139.$g1635$.rebind(var4, var3);
        }
        return (SubLObject)module0252.NIL;
    }
    
    public static SubLObject f16312(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)module0252.NIL;
        final SubLObject var5 = module0141.$g1665$.currentBinding(var3);
        final SubLObject var6 = module0139.$g1648$.currentBinding(var3);
        final SubLObject var7 = module0141.$g1693$.currentBinding(var3);
        try {
            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var3);
            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var3)), var3);
            module0141.$g1693$.bind((SubLObject)module0252.$ic35$, var3);
            var4 = f16246(var2);
        }
        finally {
            module0141.$g1693$.rebind(var7, var3);
            module0139.$g1648$.rebind(var6, var3);
            module0141.$g1665$.rebind(var5, var3);
        }
        return var4;
    }
    
    public static SubLObject f16313(SubLObject var132, SubLObject var807) {
        if (var807 == module0252.UNPROVIDED) {
            var807 = (SubLObject)module0252.NIL;
        }
        final SubLThread var808 = SubLProcess.currentSubLThread();
        if (module0252.NIL != module0077.f5302(var132)) {
            var132 = module0077.f5312(var132);
        }
        if (module0252.NIL != module0077.f5302(var807)) {
            var807 = module0077.f5312(var807);
        }
        final SubLObject var809 = module0244.f15770(module0137.f8955((SubLObject)module0252.UNPROVIDED));
        final SubLObject var810 = var132.first();
        final SubLObject var811 = (module0252.NIL != var809) ? module0244.f15774(module0137.f8955((SubLObject)module0252.UNPROVIDED)) : module0137.$g1605$.getDynamicValue(var808);
        final SubLObject var812 = module0250.f16095(var811, module0141.f9211(), module0141.f9285());
        SubLObject var813 = (SubLObject)module0252.NIL;
        SubLObject var814 = (SubLObject)module0252.NIL;
        SubLObject var815 = (SubLObject)module0252.NIL;
        if (module0252.NIL == module0035.f1997(var132)) {
            final SubLObject var816 = module0139.$g1646$.currentBinding(var808);
            try {
                module0139.$g1646$.bind(module0139.f9007(), var808);
                final SubLObject var7_814 = module0139.$g1635$.currentBinding(var808);
                try {
                    module0139.$g1635$.bind(module0139.$g1646$.getDynamicValue(var808), var808);
                    module0251.f16203(var810);
                    final SubLObject var7_815 = module0139.$g1635$.currentBinding(var808);
                    try {
                        module0139.$g1635$.bind(module0139.f9007(), var808);
                        if (module0252.NIL == var814) {
                            SubLObject var817 = var132.rest();
                            SubLObject var818 = (SubLObject)module0252.NIL;
                            var818 = var817.first();
                            while (module0252.NIL == var814 && module0252.NIL != var817) {
                                var813 = f16312(var818);
                                final SubLObject var7_816 = module0141.$g1686$.currentBinding(var808);
                                try {
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var808);
                                    if (module0252.NIL != var813) {
                                        final SubLObject var7_817 = module0141.$g1670$.currentBinding(var808);
                                        final SubLObject var819 = module0141.$g1671$.currentBinding(var808);
                                        final SubLObject var820 = module0141.$g1672$.currentBinding(var808);
                                        final SubLObject var821 = module0141.$g1674$.currentBinding(var808);
                                        final SubLObject var822 = module0137.$g1605$.currentBinding(var808);
                                        final SubLObject var823 = module0141.$g1665$.currentBinding(var808);
                                        try {
                                            module0141.$g1670$.bind(var811, var808);
                                            module0141.$g1671$.bind(module0244.f15739(var811), var808);
                                            module0141.$g1672$.bind(module0244.f15746(var811), var808);
                                            module0141.$g1674$.bind((SubLObject)module0252.NIL, var808);
                                            module0137.$g1605$.bind(var811, var808);
                                            module0141.$g1665$.bind(var812, var808);
                                            module0249.f16088(module0139.$g1646$.getDynamicValue(var808));
                                            final SubLObject var7_818 = module0139.$g1635$.currentBinding(var808);
                                            try {
                                                module0139.$g1635$.bind(module0139.$g1646$.getDynamicValue(var808), var808);
                                                SubLObject var824 = var813;
                                                SubLObject var825 = (SubLObject)module0252.NIL;
                                                var825 = var824.first();
                                                while (module0252.NIL != var824) {
                                                    final SubLObject var7_819 = module0141.$g1674$.currentBinding(var808);
                                                    try {
                                                        module0141.$g1674$.bind((SubLObject)module0252.NIL, var808);
                                                        module0251.f16203(var825);
                                                    }
                                                    finally {
                                                        module0141.$g1674$.rebind(var7_819, var808);
                                                    }
                                                    var824 = var824.rest();
                                                    var825 = var824.first();
                                                }
                                            }
                                            finally {
                                                module0139.$g1635$.rebind(var7_818, var808);
                                            }
                                            final SubLObject var7_820 = module0138.$g1619$.currentBinding(var808);
                                            try {
                                                module0138.$g1619$.bind(module0138.f8980(), var808);
                                                SubLObject var824 = var813;
                                                SubLObject var825 = (SubLObject)module0252.NIL;
                                                var825 = var824.first();
                                                while (module0252.NIL != var824) {
                                                    module0251.f16211(var825);
                                                    var824 = var824.rest();
                                                    var825 = var824.first();
                                                }
                                            }
                                            finally {
                                                module0138.$g1619$.rebind(var7_820, var808);
                                            }
                                        }
                                        finally {
                                            module0141.$g1665$.rebind(var823, var808);
                                            module0137.$g1605$.rebind(var822, var808);
                                            module0141.$g1674$.rebind(var821, var808);
                                            module0141.$g1672$.rebind(var820, var808);
                                            module0141.$g1671$.rebind(var819, var808);
                                            module0141.$g1670$.rebind(var7_817, var808);
                                        }
                                    }
                                    else {
                                        var814 = (SubLObject)module0252.T;
                                    }
                                }
                                finally {
                                    module0141.$g1686$.rebind(var7_816, var808);
                                }
                                var817 = var817.rest();
                                var818 = var817.first();
                            }
                        }
                        module0139.f9011(module0139.$g1635$.getDynamicValue(var808));
                    }
                    finally {
                        module0139.$g1635$.rebind(var7_815, var808);
                    }
                    if (module0252.NIL == var814) {
                        final SubLObject var826 = module0139.$g1646$.getDynamicValue(var808);
                        SubLObject var827 = (SubLObject)module0252.NIL;
                        SubLObject var828 = (SubLObject)module0252.NIL;
                        final Iterator var829 = Hashtables.getEntrySetIterator(var826);
                        try {
                            while (Hashtables.iteratorHasNext(var829)) {
                                final Map.Entry var830 = Hashtables.iteratorNextEntry(var829);
                                var827 = Hashtables.getEntryKey(var830);
                                var828 = Hashtables.getEntryValue(var830);
                                if (module0252.NIL != module0249.f16059(var827, module0139.$g1646$.getDynamicValue(var808))) {
                                    var815 = (SubLObject)ConsesLow.cons(var827, var815);
                                }
                            }
                        }
                        finally {
                            Hashtables.releaseEntrySetIterator(var829);
                        }
                        if (module0252.NIL != var807) {
                            var815 = module0076.f5290(var807, var815, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                    }
                }
                finally {
                    module0139.$g1635$.rebind(var7_814, var808);
                }
                module0139.f9011(module0139.$g1646$.getDynamicValue(var808));
            }
            finally {
                module0139.$g1646$.rebind(var816, var808);
            }
            return var815;
        }
        if (module0252.NIL != var807) {
            return conses_high.intersection(var132, var807, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
        }
        return var132;
    }
    
    public static SubLObject f16314(final SubLObject var1, final SubLObject var132, SubLObject var807, SubLObject var3, SubLObject var4) {
        if (var807 == module0252.UNPROVIDED) {
            var807 = (SubLObject)module0252.NIL;
        }
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        assert module0252.NIL != module0137.f8885(var1) : var1;
        final SubLObject var808 = f16315(var1, var132, var807, var3, var4);
        return f16262(module0244.f15774(var1), var808, var3, var4);
    }
    
    public static SubLObject f16316(final SubLObject var1, final SubLObject var132, SubLObject var807, SubLObject var3, SubLObject var4, SubLObject var798) {
        if (var807 == module0252.UNPROVIDED) {
            var807 = (SubLObject)module0252.NIL;
        }
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        if (var798 == module0252.UNPROVIDED) {
            var798 = (SubLObject)module0252.NIL;
        }
        assert module0252.NIL != module0137.f8885(var1) : var1;
        final SubLObject var808 = f16262(var1, var132, var3, var4);
        final SubLObject var809 = f16317(var1, var808, var807, var3, var4);
        return f16260(module0244.f15774(var1), var809, var3, var4, var798);
    }
    
    public static SubLObject f16318(final SubLObject var1, final SubLObject var132, SubLObject var807, SubLObject var3, SubLObject var4) {
        if (var807 == module0252.UNPROVIDED) {
            var807 = (SubLObject)module0252.NIL;
        }
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        assert module0252.NIL != module0137.f8885(var1) : var1;
        final SubLObject var808 = f16316(var1, var132, var807, var3, var4, (SubLObject)module0252.UNPROVIDED);
        final SubLObject var809 = ConsesLow.append(var132, var807);
        SubLObject var810 = (SubLObject)module0252.NIL;
        var810 = f16319(var1, var808, var809, var3, var4);
        return var810;
    }
    
    public static SubLObject f16319(final SubLObject var1, final SubLObject var132, final SubLObject var831, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var832 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        if (module0252.NIL == module0035.f2002(var132, (SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.UNPROVIDED)) {
            return var132;
        }
        SubLObject var833 = (SubLObject)module0252.NIL;
        final SubLObject var834 = module0139.$g1659$.currentBinding(var832);
        try {
            module0139.$g1659$.bind(module0139.f9007(), var832);
            final SubLObject var7_832 = module0141.$g1670$.currentBinding(var832);
            final SubLObject var835 = module0141.$g1671$.currentBinding(var832);
            final SubLObject var836 = module0141.$g1672$.currentBinding(var832);
            final SubLObject var837 = module0141.$g1674$.currentBinding(var832);
            final SubLObject var838 = module0137.$g1605$.currentBinding(var832);
            final SubLObject var839 = module0139.$g1644$.currentBinding(var832);
            try {
                module0141.$g1670$.bind(var1, var832);
                module0141.$g1671$.bind(module0244.f15739(var1), var832);
                module0141.$g1672$.bind(module0244.f15746(var1), var832);
                module0141.$g1674$.bind((SubLObject)module0252.NIL, var832);
                module0137.$g1605$.bind(var1, var832);
                module0139.$g1644$.bind((SubLObject)module0252.T, var832);
                final SubLObject var840 = var3;
                final SubLObject var7_833 = module0147.$g2095$.currentBinding(var832);
                final SubLObject var8_834 = module0147.$g2094$.currentBinding(var832);
                final SubLObject var9_835 = module0147.$g2096$.currentBinding(var832);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var840), var832);
                    module0147.$g2094$.bind(module0147.f9546(var840), var832);
                    module0147.$g2096$.bind(module0147.f9549(var840), var832);
                    final SubLObject var841 = var4;
                    final SubLObject var7_834 = module0141.$g1714$.currentBinding(var832);
                    final SubLObject var8_835 = module0141.$g1715$.currentBinding(var832);
                    try {
                        module0141.$g1714$.bind((module0252.NIL != var841) ? var841 : module0141.f9283(), var832);
                        module0141.$g1715$.bind((SubLObject)((module0252.NIL != var841) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var832)), var832);
                        if (module0252.NIL != var841 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var841)) {
                            final SubLObject var842 = module0136.$g1591$.getDynamicValue(var832);
                            if (var842.eql((SubLObject)module0252.$ic2$)) {
                                module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var841, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                            }
                            else if (var842.eql((SubLObject)module0252.$ic5$)) {
                                module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var841, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                            }
                            else if (var842.eql((SubLObject)module0252.$ic7$)) {
                                Errors.warn((SubLObject)module0252.$ic3$, var841, (SubLObject)module0252.$ic4$);
                            }
                            else {
                                Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var832));
                                Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var841, (SubLObject)module0252.$ic4$);
                            }
                        }
                        final SubLObject var7_835 = module0141.$g1710$.currentBinding(var832);
                        final SubLObject var8_836 = module0141.$g1677$.currentBinding(var832);
                        final SubLObject var9_836 = module0138.$g1619$.currentBinding(var832);
                        try {
                            module0141.$g1710$.bind(module0252.$ic9$, var832);
                            module0141.$g1677$.bind(module0141.f9208(), var832);
                            module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var832);
                            final SubLObject var843 = module0139.f9036();
                            final SubLObject var7_836 = module0139.$g1635$.currentBinding(var832);
                            try {
                                module0139.$g1635$.bind((var843 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var832) : module0139.f9038(var843), var832);
                                final SubLObject var7_837 = module0139.$g1636$.currentBinding(var832);
                                try {
                                    module0139.$g1636$.bind((var843 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var832) : module0139.f9038(var843), var832);
                                    final SubLObject var7_838 = module0141.$g1685$.currentBinding(var832);
                                    final SubLObject var8_837 = module0141.$g1686$.currentBinding(var832);
                                    final SubLObject var9_837 = module0141.$g1683$.currentBinding(var832);
                                    final SubLObject var10_846 = module0141.$g1684$.currentBinding(var832);
                                    final SubLObject var11_847 = module0141.$g1674$.currentBinding(var832);
                                    try {
                                        module0141.$g1685$.bind((SubLObject)module0252.NIL, var832);
                                        module0141.$g1686$.bind((SubLObject)module0252.NIL, var832);
                                        module0141.$g1683$.bind((SubLObject)module0252.NIL, var832);
                                        module0141.$g1684$.bind((SubLObject)module0252.NIL, var832);
                                        module0141.$g1674$.bind((SubLObject)module0252.NIL, var832);
                                        final SubLObject var844 = module0138.$g1626$.getGlobalValue();
                                        SubLObject var845 = (SubLObject)module0252.NIL;
                                        try {
                                            var845 = ReadWriteLocks.rw_lock_seize_read_lock(var844);
                                            final SubLObject var7_839 = module0141.$g1665$.currentBinding(var832);
                                            final SubLObject var8_838 = module0139.$g1648$.currentBinding(var832);
                                            try {
                                                module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var832);
                                                module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var832)), var832);
                                                SubLObject var846 = var132;
                                                SubLObject var847 = (SubLObject)module0252.NIL;
                                                var847 = var846.first();
                                                while (module0252.NIL != var846) {
                                                    if (module0252.NIL == module0251.f16239(var847, (SubLObject)module0252.UNPROVIDED)) {
                                                        final SubLObject var7_840 = module0139.$g1635$.currentBinding(var832);
                                                        try {
                                                            module0139.$g1635$.bind(module0139.f9007(), var832);
                                                            module0251.f16209(var847);
                                                            if (module0252.NIL != module0249.f16059(var847, (SubLObject)module0252.UNPROVIDED)) {
                                                                SubLObject var848 = (SubLObject)module0252.NIL;
                                                                SubLObject var849 = (SubLObject)module0252.NIL;
                                                                final SubLObject var7_841 = module0141.$g1691$.currentBinding(var832);
                                                                try {
                                                                    module0141.$g1691$.bind((SubLObject)module0252.NIL, var832);
                                                                    try {
                                                                        final SubLObject var7_842 = module0138.$g1619$.currentBinding(var832);
                                                                        try {
                                                                            module0138.$g1619$.bind(module0138.f8980(), var832);
                                                                            module0251.f16216(var847);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1619$.rebind(var7_842, var832);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        final SubLObject var7_843 = Threads.$is_thread_performing_cleanupP$.currentBinding(var832);
                                                                        try {
                                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0252.T, var832);
                                                                            var848 = module0141.$g1691$.getDynamicValue(var832);
                                                                        }
                                                                        finally {
                                                                            Threads.$is_thread_performing_cleanupP$.rebind(var7_843, var832);
                                                                        }
                                                                    }
                                                                }
                                                                finally {
                                                                    module0141.$g1691$.rebind(var7_841, var832);
                                                                }
                                                                SubLObject var170_856 = var848;
                                                                SubLObject var850 = (SubLObject)module0252.NIL;
                                                                var850 = var170_856.first();
                                                                while (module0252.NIL != var170_856) {
                                                                    module0251.f16238(var850, (SubLObject)module0252.UNPROVIDED);
                                                                    if (module0252.NIL != module0004.f104(var850, var831, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED)) {
                                                                        var849 = (SubLObject)module0252.T;
                                                                        var833 = (SubLObject)ConsesLow.cons(var850, var833);
                                                                    }
                                                                    var170_856 = var170_856.rest();
                                                                    var850 = var170_856.first();
                                                                }
                                                                if (module0252.NIL == var849) {
                                                                    var833 = (SubLObject)ConsesLow.cons(var847, var833);
                                                                }
                                                            }
                                                            else {
                                                                var833 = (SubLObject)ConsesLow.cons(var847, var833);
                                                            }
                                                            module0139.f9011(module0139.$g1635$.getDynamicValue(var832));
                                                        }
                                                        finally {
                                                            module0139.$g1635$.rebind(var7_840, var832);
                                                        }
                                                    }
                                                    var846 = var846.rest();
                                                    var847 = var846.first();
                                                }
                                            }
                                            finally {
                                                module0139.$g1648$.rebind(var8_838, var832);
                                                module0141.$g1665$.rebind(var7_839, var832);
                                            }
                                        }
                                        finally {
                                            if (module0252.NIL != var845) {
                                                ReadWriteLocks.rw_lock_release_read_lock(var844);
                                            }
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var11_847, var832);
                                        module0141.$g1684$.rebind(var10_846, var832);
                                        module0141.$g1683$.rebind(var9_837, var832);
                                        module0141.$g1686$.rebind(var8_837, var832);
                                        module0141.$g1685$.rebind(var7_838, var832);
                                    }
                                    if (var843 == module0252.$ic12$) {
                                        module0139.f9012(module0139.$g1636$.getDynamicValue(var832));
                                    }
                                }
                                finally {
                                    module0139.$g1636$.rebind(var7_837, var832);
                                }
                                if (var843 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1635$.getDynamicValue(var832));
                                }
                            }
                            finally {
                                module0139.$g1635$.rebind(var7_836, var832);
                            }
                        }
                        finally {
                            module0138.$g1619$.rebind(var9_836, var832);
                            module0141.$g1677$.rebind(var8_836, var832);
                            module0141.$g1710$.rebind(var7_835, var832);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var8_835, var832);
                        module0141.$g1714$.rebind(var7_834, var832);
                    }
                }
                finally {
                    module0147.$g2096$.rebind(var9_835, var832);
                    module0147.$g2094$.rebind(var8_834, var832);
                    module0147.$g2095$.rebind(var7_833, var832);
                }
            }
            finally {
                module0139.$g1644$.rebind(var839, var832);
                module0137.$g1605$.rebind(var838, var832);
                module0141.$g1674$.rebind(var837, var832);
                module0141.$g1672$.rebind(var836, var832);
                module0141.$g1671$.rebind(var835, var832);
                module0141.$g1670$.rebind(var7_832, var832);
            }
            module0139.f9011(module0139.$g1659$.getDynamicValue(var832));
        }
        finally {
            module0139.$g1659$.rebind(var834, var832);
        }
        return var833;
    }
    
    public static SubLObject f16315(final SubLObject var1, SubLObject var132, SubLObject var807, SubLObject var3, SubLObject var4) {
        if (var807 == module0252.UNPROVIDED) {
            var807 = (SubLObject)module0252.NIL;
        }
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var808 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        var132 = module0035.f2269(var132, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
        SubLObject var809 = (SubLObject)module0252.NIL;
        if (module0252.NIL == var132) {
            return (SubLObject)module0252.NIL;
        }
        if (module0252.NIL == module0035.f1997(var132)) {
            final SubLObject var810 = module0141.$g1670$.currentBinding(var808);
            final SubLObject var811 = module0141.$g1671$.currentBinding(var808);
            final SubLObject var812 = module0141.$g1672$.currentBinding(var808);
            final SubLObject var813 = module0141.$g1674$.currentBinding(var808);
            final SubLObject var814 = module0137.$g1605$.currentBinding(var808);
            try {
                module0141.$g1670$.bind(var1, var808);
                module0141.$g1671$.bind(module0244.f15739(var1), var808);
                module0141.$g1672$.bind(module0244.f15746(var1), var808);
                module0141.$g1674$.bind((SubLObject)module0252.NIL, var808);
                module0137.$g1605$.bind(var1, var808);
                final SubLObject var815 = var3;
                final SubLObject var7_858 = module0147.$g2095$.currentBinding(var808);
                final SubLObject var8_859 = module0147.$g2094$.currentBinding(var808);
                final SubLObject var9_860 = module0147.$g2096$.currentBinding(var808);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var815), var808);
                    module0147.$g2094$.bind(module0147.f9546(var815), var808);
                    module0147.$g2096$.bind(module0147.f9549(var815), var808);
                    final SubLObject var816 = var4;
                    final SubLObject var7_859 = module0141.$g1714$.currentBinding(var808);
                    final SubLObject var8_860 = module0141.$g1715$.currentBinding(var808);
                    try {
                        module0141.$g1714$.bind((module0252.NIL != var816) ? var816 : module0141.f9283(), var808);
                        module0141.$g1715$.bind((SubLObject)((module0252.NIL != var816) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var808)), var808);
                        if (module0252.NIL != var816 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var816)) {
                            final SubLObject var817 = module0136.$g1591$.getDynamicValue(var808);
                            if (var817.eql((SubLObject)module0252.$ic2$)) {
                                module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var816, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                            }
                            else if (var817.eql((SubLObject)module0252.$ic5$)) {
                                module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var816, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                            }
                            else if (var817.eql((SubLObject)module0252.$ic7$)) {
                                Errors.warn((SubLObject)module0252.$ic3$, var816, (SubLObject)module0252.$ic4$);
                            }
                            else {
                                Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var808));
                                Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var816, (SubLObject)module0252.$ic4$);
                            }
                        }
                        final SubLObject var7_860 = module0141.$g1710$.currentBinding(var808);
                        final SubLObject var8_861 = module0141.$g1677$.currentBinding(var808);
                        final SubLObject var9_861 = module0138.$g1619$.currentBinding(var808);
                        try {
                            module0141.$g1710$.bind(module0252.$ic9$, var808);
                            module0141.$g1677$.bind(module0141.f9208(), var808);
                            module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var808);
                            final SubLObject var818 = module0139.f9036();
                            final SubLObject var7_861 = module0139.$g1635$.currentBinding(var808);
                            try {
                                module0139.$g1635$.bind((var818 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var808) : module0139.f9038(var818), var808);
                                final SubLObject var7_862 = module0139.$g1636$.currentBinding(var808);
                                try {
                                    module0139.$g1636$.bind((var818 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var808) : module0139.f9038(var818), var808);
                                    final SubLObject var7_863 = module0141.$g1685$.currentBinding(var808);
                                    final SubLObject var8_862 = module0141.$g1686$.currentBinding(var808);
                                    final SubLObject var9_862 = module0141.$g1683$.currentBinding(var808);
                                    final SubLObject var10_871 = module0141.$g1684$.currentBinding(var808);
                                    final SubLObject var11_872 = module0141.$g1674$.currentBinding(var808);
                                    try {
                                        module0141.$g1685$.bind((SubLObject)module0252.NIL, var808);
                                        module0141.$g1686$.bind((SubLObject)module0252.NIL, var808);
                                        module0141.$g1683$.bind((SubLObject)module0252.NIL, var808);
                                        module0141.$g1684$.bind((SubLObject)module0252.NIL, var808);
                                        module0141.$g1674$.bind((SubLObject)module0252.NIL, var808);
                                        final SubLObject var819 = module0138.$g1626$.getGlobalValue();
                                        SubLObject var820 = (SubLObject)module0252.NIL;
                                        try {
                                            var820 = ReadWriteLocks.rw_lock_seize_read_lock(var819);
                                            final SubLObject var7_864 = module0141.$g1665$.currentBinding(var808);
                                            final SubLObject var8_863 = module0139.$g1648$.currentBinding(var808);
                                            try {
                                                module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var808);
                                                module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var808)), var808);
                                                var809 = f16313(var132, var807);
                                            }
                                            finally {
                                                module0139.$g1648$.rebind(var8_863, var808);
                                                module0141.$g1665$.rebind(var7_864, var808);
                                            }
                                        }
                                        finally {
                                            if (module0252.NIL != var820) {
                                                ReadWriteLocks.rw_lock_release_read_lock(var819);
                                            }
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var11_872, var808);
                                        module0141.$g1684$.rebind(var10_871, var808);
                                        module0141.$g1683$.rebind(var9_862, var808);
                                        module0141.$g1686$.rebind(var8_862, var808);
                                        module0141.$g1685$.rebind(var7_863, var808);
                                    }
                                    if (var818 == module0252.$ic12$) {
                                        module0139.f9012(module0139.$g1636$.getDynamicValue(var808));
                                    }
                                }
                                finally {
                                    module0139.$g1636$.rebind(var7_862, var808);
                                }
                                if (var818 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1635$.getDynamicValue(var808));
                                }
                            }
                            finally {
                                module0139.$g1635$.rebind(var7_861, var808);
                            }
                        }
                        finally {
                            module0138.$g1619$.rebind(var9_861, var808);
                            module0141.$g1677$.rebind(var8_861, var808);
                            module0141.$g1710$.rebind(var7_860, var808);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var8_860, var808);
                        module0141.$g1714$.rebind(var7_859, var808);
                    }
                }
                finally {
                    module0147.$g2096$.rebind(var9_860, var808);
                    module0147.$g2094$.rebind(var8_859, var808);
                    module0147.$g2095$.rebind(var7_858, var808);
                }
            }
            finally {
                module0137.$g1605$.rebind(var814, var808);
                module0141.$g1674$.rebind(var813, var808);
                module0141.$g1672$.rebind(var812, var808);
                module0141.$g1671$.rebind(var811, var808);
                module0141.$g1670$.rebind(var810, var808);
            }
        }
        else if (module0252.NIL == var807) {
            if (module0252.NIL != module0244.f15770(var1)) {
                var809 = f16303(var1, var132.first(), var3, var4);
            }
            else {
                var809 = var132;
            }
        }
        else {
            var809 = f16320(var1, var132.first(), var807, var3, var4, (SubLObject)module0252.UNPROVIDED);
        }
        return var809;
    }
    
    public static SubLObject f16317(final SubLObject var1, SubLObject var132, SubLObject var807, SubLObject var3, SubLObject var4) {
        if (var807 == module0252.UNPROVIDED) {
            var807 = (SubLObject)module0252.NIL;
        }
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var808 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        SubLObject var809 = (SubLObject)module0252.NIL;
        var132 = module0035.f2269(var132, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
        if (module0252.NIL == var132) {
            return (SubLObject)module0252.NIL;
        }
        if (module0252.NIL == module0035.f1997(var132)) {
            final SubLObject var810 = module0141.$g1670$.currentBinding(var808);
            final SubLObject var811 = module0141.$g1671$.currentBinding(var808);
            final SubLObject var812 = module0141.$g1672$.currentBinding(var808);
            final SubLObject var813 = module0141.$g1674$.currentBinding(var808);
            final SubLObject var814 = module0137.$g1605$.currentBinding(var808);
            try {
                module0141.$g1670$.bind(var1, var808);
                module0141.$g1671$.bind(module0244.f15739(var1), var808);
                module0141.$g1672$.bind(module0244.f15746(var1), var808);
                module0141.$g1674$.bind((SubLObject)module0252.NIL, var808);
                module0137.$g1605$.bind(var1, var808);
                final SubLObject var815 = var3;
                final SubLObject var7_875 = module0147.$g2095$.currentBinding(var808);
                final SubLObject var8_876 = module0147.$g2094$.currentBinding(var808);
                final SubLObject var9_877 = module0147.$g2096$.currentBinding(var808);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var815), var808);
                    module0147.$g2094$.bind(module0147.f9546(var815), var808);
                    module0147.$g2096$.bind(module0147.f9549(var815), var808);
                    final SubLObject var816 = var4;
                    final SubLObject var7_876 = module0141.$g1714$.currentBinding(var808);
                    final SubLObject var8_877 = module0141.$g1715$.currentBinding(var808);
                    try {
                        module0141.$g1714$.bind((module0252.NIL != var816) ? var816 : module0141.f9283(), var808);
                        module0141.$g1715$.bind((SubLObject)((module0252.NIL != var816) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var808)), var808);
                        if (module0252.NIL != var816 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var816)) {
                            final SubLObject var817 = module0136.$g1591$.getDynamicValue(var808);
                            if (var817.eql((SubLObject)module0252.$ic2$)) {
                                module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var816, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                            }
                            else if (var817.eql((SubLObject)module0252.$ic5$)) {
                                module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var816, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                            }
                            else if (var817.eql((SubLObject)module0252.$ic7$)) {
                                Errors.warn((SubLObject)module0252.$ic3$, var816, (SubLObject)module0252.$ic4$);
                            }
                            else {
                                Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var808));
                                Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var816, (SubLObject)module0252.$ic4$);
                            }
                        }
                        final SubLObject var7_877 = module0141.$g1710$.currentBinding(var808);
                        final SubLObject var8_878 = module0141.$g1677$.currentBinding(var808);
                        final SubLObject var9_878 = module0138.$g1619$.currentBinding(var808);
                        try {
                            module0141.$g1710$.bind(module0252.$ic9$, var808);
                            module0141.$g1677$.bind(module0141.f9210(), var808);
                            module0138.$g1619$.bind(module0244.f15780(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var808);
                            final SubLObject var818 = module0139.f9036();
                            final SubLObject var7_878 = module0139.$g1635$.currentBinding(var808);
                            try {
                                module0139.$g1635$.bind((var818 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var808) : module0139.f9038(var818), var808);
                                final SubLObject var7_879 = module0139.$g1636$.currentBinding(var808);
                                try {
                                    module0139.$g1636$.bind((var818 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var808) : module0139.f9038(var818), var808);
                                    final SubLObject var7_880 = module0141.$g1685$.currentBinding(var808);
                                    final SubLObject var8_879 = module0141.$g1686$.currentBinding(var808);
                                    final SubLObject var9_879 = module0141.$g1683$.currentBinding(var808);
                                    final SubLObject var10_888 = module0141.$g1684$.currentBinding(var808);
                                    final SubLObject var11_889 = module0141.$g1674$.currentBinding(var808);
                                    try {
                                        module0141.$g1685$.bind((SubLObject)module0252.NIL, var808);
                                        module0141.$g1686$.bind((SubLObject)module0252.NIL, var808);
                                        module0141.$g1683$.bind((SubLObject)module0252.NIL, var808);
                                        module0141.$g1684$.bind((SubLObject)module0252.NIL, var808);
                                        module0141.$g1674$.bind((SubLObject)module0252.NIL, var808);
                                        final SubLObject var819 = module0138.$g1626$.getGlobalValue();
                                        SubLObject var820 = (SubLObject)module0252.NIL;
                                        try {
                                            var820 = ReadWriteLocks.rw_lock_seize_read_lock(var819);
                                            final SubLObject var7_881 = module0141.$g1665$.currentBinding(var808);
                                            final SubLObject var8_880 = module0139.$g1648$.currentBinding(var808);
                                            try {
                                                module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var808);
                                                module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var808)), var808);
                                                var809 = f16313(var132, var807);
                                            }
                                            finally {
                                                module0139.$g1648$.rebind(var8_880, var808);
                                                module0141.$g1665$.rebind(var7_881, var808);
                                            }
                                        }
                                        finally {
                                            if (module0252.NIL != var820) {
                                                ReadWriteLocks.rw_lock_release_read_lock(var819);
                                            }
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var11_889, var808);
                                        module0141.$g1684$.rebind(var10_888, var808);
                                        module0141.$g1683$.rebind(var9_879, var808);
                                        module0141.$g1686$.rebind(var8_879, var808);
                                        module0141.$g1685$.rebind(var7_880, var808);
                                    }
                                    if (var818 == module0252.$ic12$) {
                                        module0139.f9012(module0139.$g1636$.getDynamicValue(var808));
                                    }
                                }
                                finally {
                                    module0139.$g1636$.rebind(var7_879, var808);
                                }
                                if (var818 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1635$.getDynamicValue(var808));
                                }
                            }
                            finally {
                                module0139.$g1635$.rebind(var7_878, var808);
                            }
                        }
                        finally {
                            module0138.$g1619$.rebind(var9_878, var808);
                            module0141.$g1677$.rebind(var8_878, var808);
                            module0141.$g1710$.rebind(var7_877, var808);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var8_877, var808);
                        module0141.$g1714$.rebind(var7_876, var808);
                    }
                }
                finally {
                    module0147.$g2096$.rebind(var9_877, var808);
                    module0147.$g2094$.rebind(var8_876, var808);
                    module0147.$g2095$.rebind(var7_875, var808);
                }
            }
            finally {
                module0137.$g1605$.rebind(var814, var808);
                module0141.$g1674$.rebind(var813, var808);
                module0141.$g1672$.rebind(var812, var808);
                module0141.$g1671$.rebind(var811, var808);
                module0141.$g1670$.rebind(var810, var808);
            }
        }
        else if (module0252.NIL == var807) {
            if (module0252.NIL != module0244.f15770(var1)) {
                var809 = f16308(var1, var132.first(), var3, var4);
            }
            else {
                var809 = var132;
            }
        }
        else {
            var809 = f16321(var1, var132.first(), var807, var3, var4);
        }
        return var809;
    }
    
    public static SubLObject f16320(final SubLObject var1, final SubLObject var2, final SubLObject var807, SubLObject var3, SubLObject var4, SubLObject var892) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        if (var892 == module0252.UNPROVIDED) {
            var892 = (SubLObject)module0252.NIL;
        }
        final SubLThread var893 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        SubLObject var894 = (SubLObject)module0252.NIL;
        final SubLObject var895 = module0141.$g1670$.currentBinding(var893);
        final SubLObject var896 = module0141.$g1671$.currentBinding(var893);
        final SubLObject var897 = module0141.$g1672$.currentBinding(var893);
        final SubLObject var898 = module0141.$g1674$.currentBinding(var893);
        final SubLObject var899 = module0137.$g1605$.currentBinding(var893);
        try {
            module0141.$g1670$.bind(var1, var893);
            module0141.$g1671$.bind(module0244.f15739(var1), var893);
            module0141.$g1672$.bind(module0244.f15746(var1), var893);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var893);
            module0137.$g1605$.bind(var1, var893);
            final SubLObject var900 = var3;
            final SubLObject var7_893 = module0147.$g2095$.currentBinding(var893);
            final SubLObject var8_894 = module0147.$g2094$.currentBinding(var893);
            final SubLObject var9_895 = module0147.$g2096$.currentBinding(var893);
            try {
                module0147.$g2095$.bind(module0147.f9545(var900), var893);
                module0147.$g2094$.bind(module0147.f9546(var900), var893);
                module0147.$g2096$.bind(module0147.f9549(var900), var893);
                final SubLObject var901 = var4;
                final SubLObject var7_894 = module0141.$g1714$.currentBinding(var893);
                final SubLObject var8_895 = module0141.$g1715$.currentBinding(var893);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var901) ? var901 : module0141.f9283(), var893);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var901) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var893)), var893);
                    if (module0252.NIL != var901 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var901)) {
                        final SubLObject var902 = module0136.$g1591$.getDynamicValue(var893);
                        if (var902.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var901, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var902.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var901, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var902.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var901, (SubLObject)module0252.$ic4$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var893));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var901, (SubLObject)module0252.$ic4$);
                        }
                    }
                    final SubLObject var7_895 = module0141.$g1710$.currentBinding(var893);
                    final SubLObject var8_896 = module0141.$g1677$.currentBinding(var893);
                    final SubLObject var9_896 = module0138.$g1619$.currentBinding(var893);
                    try {
                        module0141.$g1710$.bind(module0252.$ic9$, var893);
                        module0141.$g1677$.bind(module0141.f9208(), var893);
                        module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var893);
                        final SubLObject var903 = module0139.f9036();
                        final SubLObject var7_896 = module0139.$g1635$.currentBinding(var893);
                        try {
                            module0139.$g1635$.bind((var903 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var893) : module0139.f9038(var903), var893);
                            final SubLObject var7_897 = module0139.$g1636$.currentBinding(var893);
                            try {
                                module0139.$g1636$.bind((var903 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var893) : module0139.f9038(var903), var893);
                                final SubLObject var7_898 = module0141.$g1685$.currentBinding(var893);
                                final SubLObject var8_897 = module0141.$g1686$.currentBinding(var893);
                                final SubLObject var9_897 = module0141.$g1683$.currentBinding(var893);
                                final SubLObject var10_906 = module0141.$g1684$.currentBinding(var893);
                                final SubLObject var11_907 = module0141.$g1674$.currentBinding(var893);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var893);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var893);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var893);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var893);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var893);
                                    final SubLObject var904 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var905 = (SubLObject)module0252.NIL;
                                    try {
                                        var905 = ReadWriteLocks.rw_lock_seize_read_lock(var904);
                                        final SubLObject var7_899 = module0141.$g1665$.currentBinding(var893);
                                        final SubLObject var8_898 = module0139.$g1648$.currentBinding(var893);
                                        try {
                                            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var893);
                                            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var893)), var893);
                                            if (module0252.NIL != var892) {
                                                module0249.f16055(var892, (SubLObject)module0252.UNPROVIDED);
                                            }
                                            module0251.f16203(var2);
                                            if (module0252.NIL != var892) {
                                                module0249.f16063(var892, (SubLObject)module0252.UNPROVIDED);
                                            }
                                            SubLObject var906 = var807;
                                            SubLObject var907 = (SubLObject)module0252.NIL;
                                            var907 = var906.first();
                                            while (module0252.NIL != var906) {
                                                final SubLObject var7_900 = module0141.$g1674$.currentBinding(var893);
                                                try {
                                                    module0141.$g1674$.bind((SubLObject)(module0137.f8917(var1).eql(module0252.$ic36$) ? module0252.T : module0252.NIL), var893);
                                                    if (module0252.NIL != module0249.f16061(var907)) {
                                                        var894 = (SubLObject)ConsesLow.cons(var907, var894);
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var7_900, var893);
                                                }
                                                var906 = var906.rest();
                                                var907 = var906.first();
                                            }
                                        }
                                        finally {
                                            module0139.$g1648$.rebind(var8_898, var893);
                                            module0141.$g1665$.rebind(var7_899, var893);
                                        }
                                    }
                                    finally {
                                        if (module0252.NIL != var905) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var904);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_907, var893);
                                    module0141.$g1684$.rebind(var10_906, var893);
                                    module0141.$g1683$.rebind(var9_897, var893);
                                    module0141.$g1686$.rebind(var8_897, var893);
                                    module0141.$g1685$.rebind(var7_898, var893);
                                }
                                if (var903 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var893));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_897, var893);
                            }
                            if (var903 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var893));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_896, var893);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_896, var893);
                        module0141.$g1677$.rebind(var8_896, var893);
                        module0141.$g1710$.rebind(var7_895, var893);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_895, var893);
                    module0141.$g1714$.rebind(var7_894, var893);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_895, var893);
                module0147.$g2094$.rebind(var8_894, var893);
                module0147.$g2095$.rebind(var7_893, var893);
            }
        }
        finally {
            module0137.$g1605$.rebind(var899, var893);
            module0141.$g1674$.rebind(var898, var893);
            module0141.$g1672$.rebind(var897, var893);
            module0141.$g1671$.rebind(var896, var893);
            module0141.$g1670$.rebind(var895, var893);
        }
        return var894;
    }
    
    public static SubLObject f16322(final SubLObject var1, final SubLObject var132, final SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        assert module0252.NIL != module0137.f8885(var1) : var1;
        return (SubLObject)module0252.NIL;
    }
    
    public static SubLObject f16323(final SubLObject var1, final SubLObject var2, final SubLObject var807, final SubLObject var892, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        assert module0252.NIL != module0137.f8885(var1) : var1;
        return f16320(var1, var2, var807, var3, var4, var892);
    }
    
    public static SubLObject f16321(final SubLObject var1, final SubLObject var2, final SubLObject var807, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var808 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        SubLObject var809 = (SubLObject)module0252.NIL;
        final SubLObject var810 = module0141.$g1670$.currentBinding(var808);
        final SubLObject var811 = module0141.$g1671$.currentBinding(var808);
        final SubLObject var812 = module0141.$g1672$.currentBinding(var808);
        final SubLObject var813 = module0141.$g1674$.currentBinding(var808);
        final SubLObject var814 = module0137.$g1605$.currentBinding(var808);
        try {
            module0141.$g1670$.bind(var1, var808);
            module0141.$g1671$.bind(module0244.f15739(var1), var808);
            module0141.$g1672$.bind(module0244.f15746(var1), var808);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var808);
            module0137.$g1605$.bind(var1, var808);
            final SubLObject var815 = var3;
            final SubLObject var7_912 = module0147.$g2095$.currentBinding(var808);
            final SubLObject var8_913 = module0147.$g2094$.currentBinding(var808);
            final SubLObject var9_914 = module0147.$g2096$.currentBinding(var808);
            try {
                module0147.$g2095$.bind(module0147.f9545(var815), var808);
                module0147.$g2094$.bind(module0147.f9546(var815), var808);
                module0147.$g2096$.bind(module0147.f9549(var815), var808);
                final SubLObject var816 = var4;
                final SubLObject var7_913 = module0141.$g1714$.currentBinding(var808);
                final SubLObject var8_914 = module0141.$g1715$.currentBinding(var808);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var816) ? var816 : module0141.f9283(), var808);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var816) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var808)), var808);
                    if (module0252.NIL != var816 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var816)) {
                        final SubLObject var817 = module0136.$g1591$.getDynamicValue(var808);
                        if (var817.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var816, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var817.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var816, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var817.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var816, (SubLObject)module0252.$ic4$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var808));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var816, (SubLObject)module0252.$ic4$);
                        }
                    }
                    final SubLObject var7_914 = module0141.$g1710$.currentBinding(var808);
                    final SubLObject var8_915 = module0141.$g1677$.currentBinding(var808);
                    final SubLObject var9_915 = module0138.$g1619$.currentBinding(var808);
                    try {
                        module0141.$g1710$.bind(module0252.$ic9$, var808);
                        module0141.$g1677$.bind(module0141.f9210(), var808);
                        module0138.$g1619$.bind(module0244.f15780(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var808);
                        final SubLObject var818 = module0139.f9036();
                        final SubLObject var7_915 = module0139.$g1635$.currentBinding(var808);
                        try {
                            module0139.$g1635$.bind((var818 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var808) : module0139.f9038(var818), var808);
                            final SubLObject var7_916 = module0139.$g1636$.currentBinding(var808);
                            try {
                                module0139.$g1636$.bind((var818 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var808) : module0139.f9038(var818), var808);
                                final SubLObject var7_917 = module0141.$g1685$.currentBinding(var808);
                                final SubLObject var8_916 = module0141.$g1686$.currentBinding(var808);
                                final SubLObject var9_916 = module0141.$g1683$.currentBinding(var808);
                                final SubLObject var10_925 = module0141.$g1684$.currentBinding(var808);
                                final SubLObject var11_926 = module0141.$g1674$.currentBinding(var808);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var808);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var808);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var808);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var808);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var808);
                                    final SubLObject var819 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var820 = (SubLObject)module0252.NIL;
                                    try {
                                        var820 = ReadWriteLocks.rw_lock_seize_read_lock(var819);
                                        final SubLObject var7_918 = module0141.$g1665$.currentBinding(var808);
                                        final SubLObject var8_917 = module0139.$g1648$.currentBinding(var808);
                                        try {
                                            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var808);
                                            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var808)), var808);
                                            module0251.f16203(var2);
                                            SubLObject var821 = var807;
                                            SubLObject var822 = (SubLObject)module0252.NIL;
                                            var822 = var821.first();
                                            while (module0252.NIL != var821) {
                                                if (module0252.NIL != module0249.f16061(var822)) {
                                                    var809 = (SubLObject)ConsesLow.cons(var822, var809);
                                                }
                                                var821 = var821.rest();
                                                var822 = var821.first();
                                            }
                                        }
                                        finally {
                                            module0139.$g1648$.rebind(var8_917, var808);
                                            module0141.$g1665$.rebind(var7_918, var808);
                                        }
                                    }
                                    finally {
                                        if (module0252.NIL != var820) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var819);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_926, var808);
                                    module0141.$g1684$.rebind(var10_925, var808);
                                    module0141.$g1683$.rebind(var9_916, var808);
                                    module0141.$g1686$.rebind(var8_916, var808);
                                    module0141.$g1685$.rebind(var7_917, var808);
                                }
                                if (var818 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var808));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_916, var808);
                            }
                            if (var818 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var808));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_915, var808);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_915, var808);
                        module0141.$g1677$.rebind(var8_915, var808);
                        module0141.$g1710$.rebind(var7_914, var808);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_914, var808);
                    module0141.$g1714$.rebind(var7_913, var808);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_914, var808);
                module0147.$g2094$.rebind(var8_913, var808);
                module0147.$g2095$.rebind(var7_912, var808);
            }
        }
        finally {
            module0137.$g1605$.rebind(var814, var808);
            module0141.$g1674$.rebind(var813, var808);
            module0141.$g1672$.rebind(var812, var808);
            module0141.$g1671$.rebind(var811, var808);
            module0141.$g1670$.rebind(var810, var808);
        }
        return var809;
    }
    
    public static SubLObject f16324(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)module0252.NIL;
        final SubLObject var5 = module0141.$g1691$.currentBinding(var3);
        try {
            module0141.$g1691$.bind((SubLObject)module0252.NIL, var3);
            try {
                final SubLObject var7_929 = module0141.$g1665$.currentBinding(var3);
                final SubLObject var6 = module0139.$g1648$.currentBinding(var3);
                final SubLObject var7 = module0141.$g1694$.currentBinding(var3);
                final SubLObject var8 = module0141.$g1693$.currentBinding(var3);
                try {
                    module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var3);
                    module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var3)), var3);
                    module0141.$g1694$.bind((SubLObject)module0252.$ic31$, var3);
                    module0141.$g1693$.bind((SubLObject)module0252.$ic19$, var3);
                    var4 = f16246(var2);
                }
                finally {
                    module0141.$g1693$.rebind(var8, var3);
                    module0141.$g1694$.rebind(var7, var3);
                    module0139.$g1648$.rebind(var6, var3);
                    module0141.$g1665$.rebind(var7_929, var3);
                }
            }
            finally {
                final SubLObject var7_930 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0252.T, var3);
                    var4 = module0141.$g1691$.getDynamicValue(var3);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var7_930, var3);
                }
            }
        }
        finally {
            module0141.$g1691$.rebind(var5, var3);
        }
        return var4;
    }
    
    public static SubLObject f16325(final SubLObject var931, final SubLObject var932) {
        final SubLThread var933 = SubLProcess.currentSubLThread();
        SubLObject var934 = (SubLObject)module0252.NIL;
        final SubLObject var935 = module0139.$g1646$.currentBinding(var933);
        try {
            module0139.$g1646$.bind(module0139.f9007(), var933);
            final SubLObject var7_933 = module0139.$g1647$.currentBinding(var933);
            try {
                module0139.$g1647$.bind(module0139.f9007(), var933);
                final SubLObject var7_934 = module0139.$g1635$.currentBinding(var933);
                final SubLObject var936 = module0139.$g1636$.currentBinding(var933);
                try {
                    module0139.$g1635$.bind(module0139.$g1646$.getDynamicValue(var933), var933);
                    module0139.$g1636$.bind(module0139.$g1647$.getDynamicValue(var933), var933);
                    module0251.f16203(var931);
                    final SubLObject var7_935 = module0139.$g1635$.currentBinding(var933);
                    try {
                        module0139.$g1635$.bind(module0139.f9007(), var933);
                        final SubLObject var7_936 = module0139.$g1636$.currentBinding(var933);
                        try {
                            module0139.$g1636$.bind(module0139.f9007(), var933);
                            var934 = f16324(var932);
                            module0139.f9011(module0139.$g1636$.getDynamicValue(var933));
                        }
                        finally {
                            module0139.$g1636$.rebind(var7_936, var933);
                        }
                        module0139.f9011(module0139.$g1635$.getDynamicValue(var933));
                    }
                    finally {
                        module0139.$g1635$.rebind(var7_935, var933);
                    }
                }
                finally {
                    module0139.$g1636$.rebind(var936, var933);
                    module0139.$g1635$.rebind(var7_934, var933);
                }
                module0139.f9011(module0139.$g1647$.getDynamicValue(var933));
            }
            finally {
                module0139.$g1647$.rebind(var7_933, var933);
            }
            module0139.f9011(module0139.$g1646$.getDynamicValue(var933));
        }
        finally {
            module0139.$g1646$.rebind(var935, var933);
        }
        return var934;
    }
    
    public static SubLObject f16326(final SubLObject var1, final SubLObject var931, final SubLObject var932, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var933 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        SubLObject var934 = (SubLObject)module0252.NIL;
        final SubLObject var935 = module0141.$g1670$.currentBinding(var933);
        final SubLObject var936 = module0141.$g1671$.currentBinding(var933);
        final SubLObject var937 = module0141.$g1672$.currentBinding(var933);
        final SubLObject var938 = module0141.$g1674$.currentBinding(var933);
        final SubLObject var939 = module0137.$g1605$.currentBinding(var933);
        try {
            module0141.$g1670$.bind(var1, var933);
            module0141.$g1671$.bind(module0244.f15739(var1), var933);
            module0141.$g1672$.bind(module0244.f15746(var1), var933);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var933);
            module0137.$g1605$.bind(var1, var933);
            final SubLObject var940 = var3;
            final SubLObject var7_937 = module0147.$g2095$.currentBinding(var933);
            final SubLObject var8_938 = module0147.$g2094$.currentBinding(var933);
            final SubLObject var9_939 = module0147.$g2096$.currentBinding(var933);
            try {
                module0147.$g2095$.bind(module0147.f9545(var940), var933);
                module0147.$g2094$.bind(module0147.f9546(var940), var933);
                module0147.$g2096$.bind(module0147.f9549(var940), var933);
                final SubLObject var941 = var4;
                final SubLObject var7_938 = module0141.$g1714$.currentBinding(var933);
                final SubLObject var8_939 = module0141.$g1715$.currentBinding(var933);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var941) ? var941 : module0141.f9283(), var933);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var941) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var933)), var933);
                    if (module0252.NIL != var941 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var941)) {
                        final SubLObject var942 = module0136.$g1591$.getDynamicValue(var933);
                        if (var942.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var941, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var942.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var941, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var942.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var941, (SubLObject)module0252.$ic4$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var933));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var941, (SubLObject)module0252.$ic4$);
                        }
                    }
                    final SubLObject var7_939 = module0141.$g1710$.currentBinding(var933);
                    final SubLObject var8_940 = module0141.$g1677$.currentBinding(var933);
                    final SubLObject var9_940 = module0138.$g1619$.currentBinding(var933);
                    try {
                        module0141.$g1710$.bind(module0252.$ic9$, var933);
                        module0141.$g1677$.bind(module0141.f9210(), var933);
                        module0138.$g1619$.bind(module0244.f15780(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var933);
                        final SubLObject var943 = module0139.f9036();
                        final SubLObject var7_940 = module0139.$g1635$.currentBinding(var933);
                        try {
                            module0139.$g1635$.bind((var943 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var933) : module0139.f9038(var943), var933);
                            final SubLObject var7_941 = module0139.$g1636$.currentBinding(var933);
                            try {
                                module0139.$g1636$.bind((var943 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var933) : module0139.f9038(var943), var933);
                                final SubLObject var7_942 = module0141.$g1685$.currentBinding(var933);
                                final SubLObject var8_941 = module0141.$g1686$.currentBinding(var933);
                                final SubLObject var9_941 = module0141.$g1683$.currentBinding(var933);
                                final SubLObject var10_950 = module0141.$g1684$.currentBinding(var933);
                                final SubLObject var11_951 = module0141.$g1674$.currentBinding(var933);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var933);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var933);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var933);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var933);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var933);
                                    final SubLObject var944 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var945 = (SubLObject)module0252.NIL;
                                    try {
                                        var945 = ReadWriteLocks.rw_lock_seize_read_lock(var944);
                                        var934 = f16325(var931, var932);
                                    }
                                    finally {
                                        if (module0252.NIL != var945) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var944);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_951, var933);
                                    module0141.$g1684$.rebind(var10_950, var933);
                                    module0141.$g1683$.rebind(var9_941, var933);
                                    module0141.$g1686$.rebind(var8_941, var933);
                                    module0141.$g1685$.rebind(var7_942, var933);
                                }
                                if (var943 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var933));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_941, var933);
                            }
                            if (var943 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var933));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_940, var933);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_940, var933);
                        module0141.$g1677$.rebind(var8_940, var933);
                        module0141.$g1710$.rebind(var7_939, var933);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_939, var933);
                    module0141.$g1714$.rebind(var7_938, var933);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_939, var933);
                module0147.$g2094$.rebind(var8_938, var933);
                module0147.$g2095$.rebind(var7_937, var933);
            }
        }
        finally {
            module0137.$g1605$.rebind(var939, var933);
            module0141.$g1674$.rebind(var938, var933);
            module0141.$g1672$.rebind(var937, var933);
            module0141.$g1671$.rebind(var936, var933);
            module0141.$g1670$.rebind(var935, var933);
        }
        return var934;
    }
    
    public static SubLObject f16327(final SubLObject var1, final SubLObject var931, final SubLObject var932, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var933 = SubLProcess.currentSubLThread();
        SubLObject var934 = (SubLObject)module0252.NIL;
        final SubLObject var935 = module0141.$g1670$.currentBinding(var933);
        final SubLObject var936 = module0141.$g1671$.currentBinding(var933);
        final SubLObject var937 = module0141.$g1672$.currentBinding(var933);
        final SubLObject var938 = module0141.$g1674$.currentBinding(var933);
        final SubLObject var939 = module0137.$g1605$.currentBinding(var933);
        try {
            module0141.$g1670$.bind(var1, var933);
            module0141.$g1671$.bind(module0244.f15739(var1), var933);
            module0141.$g1672$.bind(module0244.f15746(var1), var933);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var933);
            module0137.$g1605$.bind(var1, var933);
            final SubLObject var940 = var3;
            final SubLObject var7_952 = module0147.$g2095$.currentBinding(var933);
            final SubLObject var8_953 = module0147.$g2094$.currentBinding(var933);
            final SubLObject var9_954 = module0147.$g2096$.currentBinding(var933);
            try {
                module0147.$g2095$.bind(module0147.f9545(var940), var933);
                module0147.$g2094$.bind(module0147.f9546(var940), var933);
                module0147.$g2096$.bind(module0147.f9549(var940), var933);
                final SubLObject var941 = var4;
                final SubLObject var7_953 = module0141.$g1714$.currentBinding(var933);
                final SubLObject var8_954 = module0141.$g1715$.currentBinding(var933);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var941) ? var941 : module0141.f9283(), var933);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var941) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var933)), var933);
                    if (module0252.NIL != var941 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var941)) {
                        final SubLObject var942 = module0136.$g1591$.getDynamicValue(var933);
                        if (var942.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var941, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var942.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var941, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var942.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var941, (SubLObject)module0252.$ic4$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var933));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var941, (SubLObject)module0252.$ic4$);
                        }
                    }
                    final SubLObject var7_954 = module0141.$g1710$.currentBinding(var933);
                    final SubLObject var8_955 = module0141.$g1677$.currentBinding(var933);
                    final SubLObject var9_955 = module0138.$g1619$.currentBinding(var933);
                    try {
                        module0141.$g1710$.bind(module0252.$ic9$, var933);
                        module0141.$g1677$.bind(module0141.f9208(), var933);
                        module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var933);
                        final SubLObject var943 = module0139.f9036();
                        final SubLObject var7_955 = module0139.$g1635$.currentBinding(var933);
                        try {
                            module0139.$g1635$.bind((var943 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var933) : module0139.f9038(var943), var933);
                            final SubLObject var7_956 = module0139.$g1636$.currentBinding(var933);
                            try {
                                module0139.$g1636$.bind((var943 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var933) : module0139.f9038(var943), var933);
                                final SubLObject var7_957 = module0141.$g1685$.currentBinding(var933);
                                final SubLObject var8_956 = module0141.$g1686$.currentBinding(var933);
                                final SubLObject var9_956 = module0141.$g1683$.currentBinding(var933);
                                final SubLObject var10_965 = module0141.$g1684$.currentBinding(var933);
                                final SubLObject var11_966 = module0141.$g1674$.currentBinding(var933);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var933);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var933);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var933);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var933);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var933);
                                    final SubLObject var944 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var945 = (SubLObject)module0252.NIL;
                                    try {
                                        var945 = ReadWriteLocks.rw_lock_seize_read_lock(var944);
                                        var934 = f16325(var931, var932);
                                    }
                                    finally {
                                        if (module0252.NIL != var945) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var944);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_966, var933);
                                    module0141.$g1684$.rebind(var10_965, var933);
                                    module0141.$g1683$.rebind(var9_956, var933);
                                    module0141.$g1686$.rebind(var8_956, var933);
                                    module0141.$g1685$.rebind(var7_957, var933);
                                }
                                if (var943 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var933));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_956, var933);
                            }
                            if (var943 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var933));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_955, var933);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_955, var933);
                        module0141.$g1677$.rebind(var8_955, var933);
                        module0141.$g1710$.rebind(var7_954, var933);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_954, var933);
                    module0141.$g1714$.rebind(var7_953, var933);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_954, var933);
                module0147.$g2094$.rebind(var8_953, var933);
                module0147.$g2095$.rebind(var7_952, var933);
            }
        }
        finally {
            module0137.$g1605$.rebind(var939, var933);
            module0141.$g1674$.rebind(var938, var933);
            module0141.$g1672$.rebind(var937, var933);
            module0141.$g1671$.rebind(var936, var933);
            module0141.$g1670$.rebind(var935, var933);
        }
        return var934;
    }
    
    public static SubLObject f16328(final SubLObject var1, final SubLObject var132, final SubLObject var967, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var968 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        SubLObject var969 = (SubLObject)module0252.NIL;
        final SubLObject var970 = module0141.$g1670$.currentBinding(var968);
        final SubLObject var971 = module0141.$g1671$.currentBinding(var968);
        final SubLObject var972 = module0141.$g1672$.currentBinding(var968);
        final SubLObject var973 = module0141.$g1674$.currentBinding(var968);
        final SubLObject var974 = module0137.$g1605$.currentBinding(var968);
        try {
            module0141.$g1670$.bind(var1, var968);
            module0141.$g1671$.bind(module0244.f15739(var1), var968);
            module0141.$g1672$.bind(module0244.f15746(var1), var968);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var968);
            module0137.$g1605$.bind(var1, var968);
            final SubLObject var975 = var3;
            final SubLObject var7_968 = module0147.$g2095$.currentBinding(var968);
            final SubLObject var8_969 = module0147.$g2094$.currentBinding(var968);
            final SubLObject var9_970 = module0147.$g2096$.currentBinding(var968);
            try {
                module0147.$g2095$.bind(module0147.f9545(var975), var968);
                module0147.$g2094$.bind(module0147.f9546(var975), var968);
                module0147.$g2096$.bind(module0147.f9549(var975), var968);
                final SubLObject var976 = var4;
                final SubLObject var7_969 = module0141.$g1714$.currentBinding(var968);
                final SubLObject var8_970 = module0141.$g1715$.currentBinding(var968);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var976) ? var976 : module0141.f9283(), var968);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var976) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var968)), var968);
                    if (module0252.NIL != var976 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var976)) {
                        final SubLObject var977 = module0136.$g1591$.getDynamicValue(var968);
                        if (var977.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var976, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var977.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var976, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var977.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var976, (SubLObject)module0252.$ic4$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var968));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var976, (SubLObject)module0252.$ic4$);
                        }
                    }
                    final SubLObject var7_970 = module0141.$g1710$.currentBinding(var968);
                    final SubLObject var8_971 = module0141.$g1677$.currentBinding(var968);
                    final SubLObject var9_971 = module0138.$g1619$.currentBinding(var968);
                    try {
                        module0141.$g1710$.bind(module0252.$ic9$, var968);
                        module0141.$g1677$.bind(module0141.f9208(), var968);
                        module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var968);
                        final SubLObject var978 = module0139.f9036();
                        final SubLObject var7_971 = module0139.$g1635$.currentBinding(var968);
                        try {
                            module0139.$g1635$.bind((var978 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var968) : module0139.f9038(var978), var968);
                            final SubLObject var7_972 = module0139.$g1636$.currentBinding(var968);
                            try {
                                module0139.$g1636$.bind((var978 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var968) : module0139.f9038(var978), var968);
                                final SubLObject var7_973 = module0141.$g1685$.currentBinding(var968);
                                final SubLObject var8_972 = module0141.$g1686$.currentBinding(var968);
                                final SubLObject var9_972 = module0141.$g1683$.currentBinding(var968);
                                final SubLObject var10_981 = module0141.$g1684$.currentBinding(var968);
                                final SubLObject var11_982 = module0141.$g1674$.currentBinding(var968);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var968);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var968);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var968);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var968);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var968);
                                    final SubLObject var979 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var980 = (SubLObject)module0252.NIL;
                                    try {
                                        var980 = ReadWriteLocks.rw_lock_seize_read_lock(var979);
                                        final SubLObject var7_974 = module0141.$g1665$.currentBinding(var968);
                                        final SubLObject var8_973 = module0139.$g1648$.currentBinding(var968);
                                        try {
                                            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var968);
                                            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var968)), var968);
                                            var969 = f16329(var132, var967);
                                        }
                                        finally {
                                            module0139.$g1648$.rebind(var8_973, var968);
                                            module0141.$g1665$.rebind(var7_974, var968);
                                        }
                                    }
                                    finally {
                                        if (module0252.NIL != var980) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var979);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_982, var968);
                                    module0141.$g1684$.rebind(var10_981, var968);
                                    module0141.$g1683$.rebind(var9_972, var968);
                                    module0141.$g1686$.rebind(var8_972, var968);
                                    module0141.$g1685$.rebind(var7_973, var968);
                                }
                                if (var978 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var968));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_972, var968);
                            }
                            if (var978 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var968));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_971, var968);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_971, var968);
                        module0141.$g1677$.rebind(var8_971, var968);
                        module0141.$g1710$.rebind(var7_970, var968);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_970, var968);
                    module0141.$g1714$.rebind(var7_969, var968);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_970, var968);
                module0147.$g2094$.rebind(var8_969, var968);
                module0147.$g2095$.rebind(var7_968, var968);
            }
        }
        finally {
            module0137.$g1605$.rebind(var974, var968);
            module0141.$g1674$.rebind(var973, var968);
            module0141.$g1672$.rebind(var972, var968);
            module0141.$g1671$.rebind(var971, var968);
            module0141.$g1670$.rebind(var970, var968);
        }
        return var969;
    }
    
    public static SubLObject f16329(final SubLObject var132, final SubLObject var967) {
        final SubLThread var968 = SubLProcess.currentSubLThread();
        SubLObject var969 = (SubLObject)module0252.NIL;
        SubLObject var970 = var132;
        SubLObject var971 = (SubLObject)module0252.NIL;
        var971 = var970.first();
        while (module0252.NIL != var970) {
            final SubLObject var972 = module0141.$g1674$.currentBinding(var968);
            final SubLObject var973 = module0141.$g1683$.currentBinding(var968);
            try {
                module0141.$g1674$.bind((SubLObject)module0252.NIL, var968);
                module0141.$g1683$.bind((SubLObject)module0252.NIL, var968);
                module0251.f16203(var971);
            }
            finally {
                module0141.$g1683$.rebind(var973, var968);
                module0141.$g1674$.rebind(var972, var968);
            }
            var970 = var970.rest();
            var971 = var970.first();
        }
        var970 = var967;
        SubLObject var974 = (SubLObject)module0252.NIL;
        var974 = var970.first();
        while (module0252.NIL != var970) {
            if (module0252.NIL == module0249.f16059(var974, (SubLObject)module0252.UNPROVIDED)) {
                var969 = (SubLObject)ConsesLow.cons(var974, var969);
            }
            var970 = var970.rest();
            var974 = var970.first();
        }
        return var969;
    }
    
    public static SubLObject f16330(final SubLObject var1, final SubLObject var931, final SubLObject var932, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var933 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        SubLObject var934 = (SubLObject)module0252.NIL;
        final SubLObject var935 = module0141.$g1670$.currentBinding(var933);
        final SubLObject var936 = module0141.$g1671$.currentBinding(var933);
        final SubLObject var937 = module0141.$g1672$.currentBinding(var933);
        final SubLObject var938 = module0141.$g1674$.currentBinding(var933);
        final SubLObject var939 = module0137.$g1605$.currentBinding(var933);
        try {
            module0141.$g1670$.bind(var1, var933);
            module0141.$g1671$.bind(module0244.f15739(var1), var933);
            module0141.$g1672$.bind(module0244.f15746(var1), var933);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var933);
            module0137.$g1605$.bind(var1, var933);
            final SubLObject var940 = var3;
            final SubLObject var7_986 = module0147.$g2095$.currentBinding(var933);
            final SubLObject var8_987 = module0147.$g2094$.currentBinding(var933);
            final SubLObject var9_988 = module0147.$g2096$.currentBinding(var933);
            try {
                module0147.$g2095$.bind(module0147.f9545(var940), var933);
                module0147.$g2094$.bind(module0147.f9546(var940), var933);
                module0147.$g2096$.bind(module0147.f9549(var940), var933);
                final SubLObject var941 = var4;
                final SubLObject var7_987 = module0141.$g1714$.currentBinding(var933);
                final SubLObject var8_988 = module0141.$g1715$.currentBinding(var933);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var941) ? var941 : module0141.f9283(), var933);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var941) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var933)), var933);
                    if (module0252.NIL != var941 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var941)) {
                        final SubLObject var942 = module0136.$g1591$.getDynamicValue(var933);
                        if (var942.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var941, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var942.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var941, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var942.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var941, (SubLObject)module0252.$ic4$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var933));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var941, (SubLObject)module0252.$ic4$);
                        }
                    }
                    final SubLObject var7_988 = module0141.$g1710$.currentBinding(var933);
                    final SubLObject var8_989 = module0141.$g1677$.currentBinding(var933);
                    final SubLObject var9_989 = module0138.$g1619$.currentBinding(var933);
                    try {
                        module0141.$g1710$.bind(module0252.$ic9$, var933);
                        module0141.$g1677$.bind(module0141.f9208(), var933);
                        module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var933);
                        final SubLObject var943 = module0139.f9036();
                        final SubLObject var7_989 = module0139.$g1635$.currentBinding(var933);
                        try {
                            module0139.$g1635$.bind((var943 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var933) : module0139.f9038(var943), var933);
                            final SubLObject var7_990 = module0139.$g1636$.currentBinding(var933);
                            try {
                                module0139.$g1636$.bind((var943 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var933) : module0139.f9038(var943), var933);
                                final SubLObject var7_991 = module0141.$g1685$.currentBinding(var933);
                                final SubLObject var8_990 = module0141.$g1686$.currentBinding(var933);
                                final SubLObject var9_990 = module0141.$g1683$.currentBinding(var933);
                                final SubLObject var10_999 = module0141.$g1684$.currentBinding(var933);
                                final SubLObject var11_1000 = module0141.$g1674$.currentBinding(var933);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var933);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var933);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var933);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var933);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var933);
                                    final SubLObject var944 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var945 = (SubLObject)module0252.NIL;
                                    try {
                                        var945 = ReadWriteLocks.rw_lock_seize_read_lock(var944);
                                        final SubLObject var7_992 = module0141.$g1665$.currentBinding(var933);
                                        final SubLObject var8_991 = module0139.$g1648$.currentBinding(var933);
                                        try {
                                            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var933);
                                            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var933)), var933);
                                            var934 = f16331(var931, var932);
                                        }
                                        finally {
                                            module0139.$g1648$.rebind(var8_991, var933);
                                            module0141.$g1665$.rebind(var7_992, var933);
                                        }
                                    }
                                    finally {
                                        if (module0252.NIL != var945) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var944);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_1000, var933);
                                    module0141.$g1684$.rebind(var10_999, var933);
                                    module0141.$g1683$.rebind(var9_990, var933);
                                    module0141.$g1686$.rebind(var8_990, var933);
                                    module0141.$g1685$.rebind(var7_991, var933);
                                }
                                if (var943 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var933));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_990, var933);
                            }
                            if (var943 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var933));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_989, var933);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_989, var933);
                        module0141.$g1677$.rebind(var8_989, var933);
                        module0141.$g1710$.rebind(var7_988, var933);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_988, var933);
                    module0141.$g1714$.rebind(var7_987, var933);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_988, var933);
                module0147.$g2094$.rebind(var8_987, var933);
                module0147.$g2095$.rebind(var7_986, var933);
            }
        }
        finally {
            module0137.$g1605$.rebind(var939, var933);
            module0141.$g1674$.rebind(var938, var933);
            module0141.$g1672$.rebind(var937, var933);
            module0141.$g1671$.rebind(var936, var933);
            module0141.$g1670$.rebind(var935, var933);
        }
        return var934;
    }
    
    public static SubLObject f16331(final SubLObject var931, final SubLObject var932) {
        final SubLThread var933 = SubLProcess.currentSubLThread();
        SubLObject var934 = (SubLObject)module0252.NIL;
        module0251.f16203(var931);
        final SubLObject var935 = module0141.$g1683$.currentBinding(var933);
        final SubLObject var936 = module0141.$g1691$.currentBinding(var933);
        try {
            module0141.$g1683$.bind((SubLObject)module0252.NIL, var933);
            module0141.$g1691$.bind((SubLObject)module0252.NIL, var933);
            try {
                final SubLObject var7_1003 = module0138.$g1619$.currentBinding(var933);
                try {
                    module0138.$g1619$.bind(module0138.f8980(), var933);
                    module0251.f16216(var932);
                }
                finally {
                    module0138.$g1619$.rebind(var7_1003, var933);
                }
            }
            finally {
                final SubLObject var7_1004 = Threads.$is_thread_performing_cleanupP$.currentBinding(var933);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0252.T, var933);
                    var934 = module0141.$g1691$.getDynamicValue(var933);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var7_1004, var933);
                }
            }
        }
        finally {
            module0141.$g1691$.rebind(var936, var933);
            module0141.$g1683$.rebind(var935, var933);
        }
        return var934;
    }
    
    public static SubLObject f16332(final SubLObject var1, final SubLObject var2, final SubLObject var132, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var133 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        SubLObject var134 = (SubLObject)module0252.NIL;
        if (module0252.NIL != var132) {
            final SubLObject var135 = module0141.$g1670$.currentBinding(var133);
            final SubLObject var136 = module0141.$g1671$.currentBinding(var133);
            final SubLObject var137 = module0141.$g1672$.currentBinding(var133);
            final SubLObject var138 = module0141.$g1674$.currentBinding(var133);
            final SubLObject var139 = module0137.$g1605$.currentBinding(var133);
            try {
                module0141.$g1670$.bind(var1, var133);
                module0141.$g1671$.bind(module0244.f15739(var1), var133);
                module0141.$g1672$.bind(module0244.f15746(var1), var133);
                module0141.$g1674$.bind((SubLObject)module0252.NIL, var133);
                module0137.$g1605$.bind(var1, var133);
                final SubLObject var140 = var3;
                final SubLObject var7_1005 = module0147.$g2095$.currentBinding(var133);
                final SubLObject var8_1006 = module0147.$g2094$.currentBinding(var133);
                final SubLObject var9_1007 = module0147.$g2096$.currentBinding(var133);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var140), var133);
                    module0147.$g2094$.bind(module0147.f9546(var140), var133);
                    module0147.$g2096$.bind(module0147.f9549(var140), var133);
                    final SubLObject var141 = var4;
                    final SubLObject var7_1006 = module0141.$g1714$.currentBinding(var133);
                    final SubLObject var8_1007 = module0141.$g1715$.currentBinding(var133);
                    try {
                        module0141.$g1714$.bind((module0252.NIL != var141) ? var141 : module0141.f9283(), var133);
                        module0141.$g1715$.bind((SubLObject)((module0252.NIL != var141) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var133)), var133);
                        if (module0252.NIL != var141 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var141)) {
                            final SubLObject var142 = module0136.$g1591$.getDynamicValue(var133);
                            if (var142.eql((SubLObject)module0252.$ic2$)) {
                                module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var141, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                            }
                            else if (var142.eql((SubLObject)module0252.$ic5$)) {
                                module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var141, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                            }
                            else if (var142.eql((SubLObject)module0252.$ic7$)) {
                                Errors.warn((SubLObject)module0252.$ic3$, var141, (SubLObject)module0252.$ic4$);
                            }
                            else {
                                Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var133));
                                Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var141, (SubLObject)module0252.$ic4$);
                            }
                        }
                        final SubLObject var7_1007 = module0141.$g1710$.currentBinding(var133);
                        final SubLObject var8_1008 = module0141.$g1677$.currentBinding(var133);
                        final SubLObject var9_1008 = module0138.$g1619$.currentBinding(var133);
                        try {
                            module0141.$g1710$.bind(module0252.$ic9$, var133);
                            module0141.$g1677$.bind(module0141.f9208(), var133);
                            module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var133);
                            final SubLObject var143 = module0139.f9036();
                            final SubLObject var7_1008 = module0139.$g1635$.currentBinding(var133);
                            try {
                                module0139.$g1635$.bind((var143 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var133) : module0139.f9038(var143), var133);
                                final SubLObject var7_1009 = module0139.$g1636$.currentBinding(var133);
                                try {
                                    module0139.$g1636$.bind((var143 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var133) : module0139.f9038(var143), var133);
                                    final SubLObject var7_1010 = module0141.$g1685$.currentBinding(var133);
                                    final SubLObject var8_1009 = module0141.$g1686$.currentBinding(var133);
                                    final SubLObject var9_1009 = module0141.$g1683$.currentBinding(var133);
                                    final SubLObject var10_1018 = module0141.$g1684$.currentBinding(var133);
                                    final SubLObject var11_1019 = module0141.$g1674$.currentBinding(var133);
                                    try {
                                        module0141.$g1685$.bind((SubLObject)module0252.NIL, var133);
                                        module0141.$g1686$.bind((SubLObject)module0252.NIL, var133);
                                        module0141.$g1683$.bind((SubLObject)module0252.NIL, var133);
                                        module0141.$g1684$.bind((SubLObject)module0252.NIL, var133);
                                        module0141.$g1674$.bind((SubLObject)module0252.NIL, var133);
                                        final SubLObject var144 = module0138.$g1626$.getGlobalValue();
                                        SubLObject var145 = (SubLObject)module0252.NIL;
                                        try {
                                            var145 = ReadWriteLocks.rw_lock_seize_read_lock(var144);
                                            final SubLObject var7_1011 = module0141.$g1665$.currentBinding(var133);
                                            final SubLObject var8_1010 = module0139.$g1648$.currentBinding(var133);
                                            try {
                                                module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var133);
                                                module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var133)), var133);
                                                var134 = f16333(var2, var132);
                                            }
                                            finally {
                                                module0139.$g1648$.rebind(var8_1010, var133);
                                                module0141.$g1665$.rebind(var7_1011, var133);
                                            }
                                        }
                                        finally {
                                            if (module0252.NIL != var145) {
                                                ReadWriteLocks.rw_lock_release_read_lock(var144);
                                            }
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var11_1019, var133);
                                        module0141.$g1684$.rebind(var10_1018, var133);
                                        module0141.$g1683$.rebind(var9_1009, var133);
                                        module0141.$g1686$.rebind(var8_1009, var133);
                                        module0141.$g1685$.rebind(var7_1010, var133);
                                    }
                                    if (var143 == module0252.$ic12$) {
                                        module0139.f9012(module0139.$g1636$.getDynamicValue(var133));
                                    }
                                }
                                finally {
                                    module0139.$g1636$.rebind(var7_1009, var133);
                                }
                                if (var143 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1635$.getDynamicValue(var133));
                                }
                            }
                            finally {
                                module0139.$g1635$.rebind(var7_1008, var133);
                            }
                        }
                        finally {
                            module0138.$g1619$.rebind(var9_1008, var133);
                            module0141.$g1677$.rebind(var8_1008, var133);
                            module0141.$g1710$.rebind(var7_1007, var133);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var8_1007, var133);
                        module0141.$g1714$.rebind(var7_1006, var133);
                    }
                }
                finally {
                    module0147.$g2096$.rebind(var9_1007, var133);
                    module0147.$g2094$.rebind(var8_1006, var133);
                    module0147.$g2095$.rebind(var7_1005, var133);
                }
            }
            finally {
                module0137.$g1605$.rebind(var139, var133);
                module0141.$g1674$.rebind(var138, var133);
                module0141.$g1672$.rebind(var137, var133);
                module0141.$g1671$.rebind(var136, var133);
                module0141.$g1670$.rebind(var135, var133);
            }
        }
        return var134;
    }
    
    public static SubLObject f16334(final SubLObject var1, final SubLObject var2, final SubLObject var132, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var133 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        SubLObject var134 = (SubLObject)module0252.NIL;
        if (module0252.NIL != var132) {
            if (module0252.NIL != module0035.f2370((SubLObject)module0252.$ic37$, var132, (SubLObject)module0252.UNPROVIDED) && Functions.apply((SubLObject)module0252.$ic38$, Mapping.mapcar((SubLObject)module0252.$ic39$, var132)).numL(module0549.f33901(var2))) {
                SubLObject var135 = var132;
                SubLObject var136 = (SubLObject)module0252.NIL;
                var136 = var135.first();
                while (module0252.NIL != var135) {
                    if (module0252.NIL != f16335(var1, var136, var2, var3, var4)) {
                        var134 = (SubLObject)ConsesLow.cons(var136, var134);
                    }
                    var135 = var135.rest();
                    var136 = var135.first();
                }
            }
            else {
                final SubLObject var137 = module0141.$g1670$.currentBinding(var133);
                final SubLObject var138 = module0141.$g1671$.currentBinding(var133);
                final SubLObject var139 = module0141.$g1672$.currentBinding(var133);
                final SubLObject var140 = module0141.$g1674$.currentBinding(var133);
                final SubLObject var141 = module0137.$g1605$.currentBinding(var133);
                try {
                    module0141.$g1670$.bind(var1, var133);
                    module0141.$g1671$.bind(module0244.f15739(var1), var133);
                    module0141.$g1672$.bind(module0244.f15746(var1), var133);
                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var133);
                    module0137.$g1605$.bind(var1, var133);
                    final SubLObject var142 = var3;
                    final SubLObject var7_1023 = module0147.$g2095$.currentBinding(var133);
                    final SubLObject var8_1024 = module0147.$g2094$.currentBinding(var133);
                    final SubLObject var9_1025 = module0147.$g2096$.currentBinding(var133);
                    try {
                        module0147.$g2095$.bind(module0147.f9545(var142), var133);
                        module0147.$g2094$.bind(module0147.f9546(var142), var133);
                        module0147.$g2096$.bind(module0147.f9549(var142), var133);
                        final SubLObject var143 = var4;
                        final SubLObject var7_1024 = module0141.$g1714$.currentBinding(var133);
                        final SubLObject var8_1025 = module0141.$g1715$.currentBinding(var133);
                        try {
                            module0141.$g1714$.bind((module0252.NIL != var143) ? var143 : module0141.f9283(), var133);
                            module0141.$g1715$.bind((SubLObject)((module0252.NIL != var143) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var133)), var133);
                            if (module0252.NIL != var143 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var143)) {
                                final SubLObject var144 = module0136.$g1591$.getDynamicValue(var133);
                                if (var144.eql((SubLObject)module0252.$ic2$)) {
                                    module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var143, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                }
                                else if (var144.eql((SubLObject)module0252.$ic5$)) {
                                    module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var143, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                }
                                else if (var144.eql((SubLObject)module0252.$ic7$)) {
                                    Errors.warn((SubLObject)module0252.$ic3$, var143, (SubLObject)module0252.$ic4$);
                                }
                                else {
                                    Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var133));
                                    Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var143, (SubLObject)module0252.$ic4$);
                                }
                            }
                            final SubLObject var7_1025 = module0141.$g1710$.currentBinding(var133);
                            final SubLObject var8_1026 = module0141.$g1677$.currentBinding(var133);
                            final SubLObject var9_1026 = module0138.$g1619$.currentBinding(var133);
                            try {
                                module0141.$g1710$.bind(module0252.$ic9$, var133);
                                module0141.$g1677$.bind(module0141.f9210(), var133);
                                module0138.$g1619$.bind(module0244.f15780(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var133);
                                final SubLObject var145 = module0139.f9036();
                                final SubLObject var7_1026 = module0139.$g1635$.currentBinding(var133);
                                try {
                                    module0139.$g1635$.bind((var145 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var133) : module0139.f9038(var145), var133);
                                    final SubLObject var7_1027 = module0139.$g1636$.currentBinding(var133);
                                    try {
                                        module0139.$g1636$.bind((var145 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var133) : module0139.f9038(var145), var133);
                                        final SubLObject var7_1028 = module0141.$g1685$.currentBinding(var133);
                                        final SubLObject var8_1027 = module0141.$g1686$.currentBinding(var133);
                                        final SubLObject var9_1027 = module0141.$g1683$.currentBinding(var133);
                                        final SubLObject var10_1036 = module0141.$g1684$.currentBinding(var133);
                                        final SubLObject var11_1037 = module0141.$g1674$.currentBinding(var133);
                                        try {
                                            module0141.$g1685$.bind((SubLObject)module0252.NIL, var133);
                                            module0141.$g1686$.bind((SubLObject)module0252.NIL, var133);
                                            module0141.$g1683$.bind((SubLObject)module0252.NIL, var133);
                                            module0141.$g1684$.bind((SubLObject)module0252.NIL, var133);
                                            module0141.$g1674$.bind((SubLObject)module0252.NIL, var133);
                                            final SubLObject var146 = module0138.$g1626$.getGlobalValue();
                                            SubLObject var147 = (SubLObject)module0252.NIL;
                                            try {
                                                var147 = ReadWriteLocks.rw_lock_seize_read_lock(var146);
                                                final SubLObject var7_1029 = module0141.$g1665$.currentBinding(var133);
                                                final SubLObject var8_1028 = module0139.$g1648$.currentBinding(var133);
                                                try {
                                                    module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var133);
                                                    module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var133)), var133);
                                                    var134 = f16333(var2, var132);
                                                }
                                                finally {
                                                    module0139.$g1648$.rebind(var8_1028, var133);
                                                    module0141.$g1665$.rebind(var7_1029, var133);
                                                }
                                            }
                                            finally {
                                                if (module0252.NIL != var147) {
                                                    ReadWriteLocks.rw_lock_release_read_lock(var146);
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var11_1037, var133);
                                            module0141.$g1684$.rebind(var10_1036, var133);
                                            module0141.$g1683$.rebind(var9_1027, var133);
                                            module0141.$g1686$.rebind(var8_1027, var133);
                                            module0141.$g1685$.rebind(var7_1028, var133);
                                        }
                                        if (var145 == module0252.$ic12$) {
                                            module0139.f9012(module0139.$g1636$.getDynamicValue(var133));
                                        }
                                    }
                                    finally {
                                        module0139.$g1636$.rebind(var7_1027, var133);
                                    }
                                    if (var145 == module0252.$ic12$) {
                                        module0139.f9012(module0139.$g1635$.getDynamicValue(var133));
                                    }
                                }
                                finally {
                                    module0139.$g1635$.rebind(var7_1026, var133);
                                }
                            }
                            finally {
                                module0138.$g1619$.rebind(var9_1026, var133);
                                module0141.$g1677$.rebind(var8_1026, var133);
                                module0141.$g1710$.rebind(var7_1025, var133);
                            }
                        }
                        finally {
                            module0141.$g1715$.rebind(var8_1025, var133);
                            module0141.$g1714$.rebind(var7_1024, var133);
                        }
                    }
                    finally {
                        module0147.$g2096$.rebind(var9_1025, var133);
                        module0147.$g2094$.rebind(var8_1024, var133);
                        module0147.$g2095$.rebind(var7_1023, var133);
                    }
                }
                finally {
                    module0137.$g1605$.rebind(var141, var133);
                    module0141.$g1674$.rebind(var140, var133);
                    module0141.$g1672$.rebind(var139, var133);
                    module0141.$g1671$.rebind(var138, var133);
                    module0141.$g1670$.rebind(var137, var133);
                }
            }
        }
        return var134;
    }
    
    public static SubLObject f16333(final SubLObject var2, final SubLObject var132) {
        SubLObject var133 = (SubLObject)module0252.NIL;
        if (module0252.NIL != var132) {
            module0251.f16203(var2);
            SubLObject var134 = var132;
            SubLObject var135 = (SubLObject)module0252.NIL;
            var135 = var134.first();
            while (module0252.NIL != var134) {
                if (module0252.NIL != module0249.f16061(var135)) {
                    var133 = (SubLObject)ConsesLow.cons(var135, var133);
                }
                var134 = var134.rest();
                var135 = var134.first();
            }
        }
        return var133;
    }
    
    public static SubLObject f16336(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        module0250.f16154(module0137.f8955((SubLObject)module0252.UNPROVIDED), module0138.f8979(), module0141.f9285(), module0139.$g1635$.getDynamicValue(var3), (SubLObject)module0252.$ic40$, var2, (SubLObject)module0252.UNPROVIDED);
        return (SubLObject)module0252.NIL;
    }
    
    public static SubLObject f16337(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        module0141.f9240();
        SubLObject var4 = (SubLObject)module0252.NIL;
        if (module0252.NIL == module0141.f9264(var2)) {
            final SubLObject var5 = module0141.$g1691$.currentBinding(var3);
            try {
                module0141.$g1691$.bind((SubLObject)module0252.NIL, var3);
                try {
                    final SubLObject var7_1041 = module0141.$g1685$.currentBinding(var3);
                    final SubLObject var6 = module0141.$g1686$.currentBinding(var3);
                    try {
                        module0141.$g1685$.bind((SubLObject)module0252.NIL, var3);
                        module0141.$g1686$.bind((SubLObject)module0252.NIL, var3);
                        module0250.f16154(module0137.f8955((SubLObject)module0252.UNPROVIDED), module0138.f8980(), module0141.f9285(), module0139.$g1636$.getDynamicValue(var3), (SubLObject)module0252.$ic41$, var2, (SubLObject)module0252.UNPROVIDED);
                    }
                    finally {
                        module0141.$g1686$.rebind(var6, var3);
                        module0141.$g1685$.rebind(var7_1041, var3);
                    }
                }
                finally {
                    final SubLObject var7_1042 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0252.T, var3);
                        var4 = module0141.$g1691$.getDynamicValue(var3);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var7_1042, var3);
                    }
                }
            }
            finally {
                module0141.$g1691$.rebind(var5, var3);
            }
        }
        if (module0252.NIL != var4) {
            module0141.f9239();
        }
        else {
            module0141.$g1691$.setDynamicValue((SubLObject)ConsesLow.cons(var2, module0141.$g1691$.getDynamicValue(var3)), var3);
        }
        return (SubLObject)module0252.NIL;
    }
    
    public static SubLObject f16338(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        module0141.f9240();
        if (module0252.NIL != module0249.f16059(var2, module0139.$g1646$.getDynamicValue(var3))) {
            module0141.$g1691$.setDynamicValue((SubLObject)module0252.T, var3);
            module0141.$g1685$.setDynamicValue((SubLObject)module0252.T, var3);
        }
        else if (module0252.NIL != module0141.f9264(var2)) {
            module0141.f9239();
        }
        return (SubLObject)module0252.NIL;
    }
    
    public static SubLObject f16339(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)module0252.NIL;
        final SubLObject var5 = module0139.$g1646$.currentBinding(var3);
        try {
            module0139.$g1646$.bind(module0139.f9007(), var3);
            final SubLObject var7_1043 = module0139.$g1635$.currentBinding(var3);
            try {
                module0139.$g1635$.bind(module0139.$g1646$.getDynamicValue(var3), var3);
                final SubLObject var7_1044 = module0138.$g1619$.currentBinding(var3);
                try {
                    module0138.$g1619$.bind(module0138.f8980(), var3);
                    module0251.f16209(var2);
                }
                finally {
                    module0138.$g1619$.rebind(var7_1044, var3);
                }
                if (module0252.NIL != module0249.f16059(var2, (SubLObject)module0252.UNPROVIDED)) {
                    module0251.f16211(var2);
                }
            }
            finally {
                module0139.$g1635$.rebind(var7_1043, var3);
            }
            final SubLObject var7_1045 = module0141.$g1698$.currentBinding(var3);
            final SubLObject var6 = module0141.$g1691$.currentBinding(var3);
            try {
                module0141.$g1698$.bind(var2, var3);
                module0141.$g1691$.bind((SubLObject)module0252.NIL, var3);
                try {
                    f16336(var2);
                }
                finally {
                    final SubLObject var7_1046 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0252.T, var3);
                        var4 = module0141.$g1691$.getDynamicValue(var3);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var7_1046, var3);
                    }
                }
            }
            finally {
                module0141.$g1691$.rebind(var6, var3);
                module0141.$g1698$.rebind(var7_1045, var3);
            }
            module0139.f9011(module0139.$g1646$.getDynamicValue(var3));
        }
        finally {
            module0139.$g1646$.rebind(var5, var3);
        }
        return var4;
    }
    
    public static SubLObject f16340(final SubLObject var1, final SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var5 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        SubLObject var6 = (SubLObject)module0252.NIL;
        final SubLObject var7 = module0141.$g1670$.currentBinding(var5);
        final SubLObject var8 = module0141.$g1671$.currentBinding(var5);
        final SubLObject var9 = module0141.$g1672$.currentBinding(var5);
        final SubLObject var10 = module0141.$g1674$.currentBinding(var5);
        final SubLObject var11 = module0137.$g1605$.currentBinding(var5);
        try {
            module0141.$g1670$.bind(var1, var5);
            module0141.$g1671$.bind(module0244.f15739(var1), var5);
            module0141.$g1672$.bind(module0244.f15746(var1), var5);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var5);
            module0137.$g1605$.bind(var1, var5);
            final SubLObject var12 = var3;
            final SubLObject var7_1047 = module0147.$g2095$.currentBinding(var5);
            final SubLObject var8_1048 = module0147.$g2094$.currentBinding(var5);
            final SubLObject var9_1049 = module0147.$g2096$.currentBinding(var5);
            try {
                module0147.$g2095$.bind(module0147.f9545(var12), var5);
                module0147.$g2094$.bind(module0147.f9546(var12), var5);
                module0147.$g2096$.bind(module0147.f9549(var12), var5);
                final SubLObject var13 = var4;
                final SubLObject var7_1048 = module0141.$g1714$.currentBinding(var5);
                final SubLObject var8_1049 = module0141.$g1715$.currentBinding(var5);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var13) ? var13 : module0141.f9283(), var5);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var13) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var5)), var5);
                    if (module0252.NIL != var13 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var13)) {
                        final SubLObject var14 = module0136.$g1591$.getDynamicValue(var5);
                        if (var14.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var13, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var14.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var13, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var14.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var13, (SubLObject)module0252.$ic4$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var5));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var13, (SubLObject)module0252.$ic4$);
                        }
                    }
                    final SubLObject var7_1049 = module0141.$g1710$.currentBinding(var5);
                    final SubLObject var8_1050 = module0141.$g1677$.currentBinding(var5);
                    final SubLObject var9_1050 = module0138.$g1619$.currentBinding(var5);
                    try {
                        module0141.$g1710$.bind(module0252.$ic9$, var5);
                        module0141.$g1677$.bind(module0141.f9210(), var5);
                        module0138.$g1619$.bind(module0244.f15780(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var5);
                        final SubLObject var15 = module0139.f9036();
                        final SubLObject var7_1050 = module0139.$g1635$.currentBinding(var5);
                        try {
                            module0139.$g1635$.bind((var15 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var5) : module0139.f9038(var15), var5);
                            final SubLObject var7_1051 = module0139.$g1636$.currentBinding(var5);
                            try {
                                module0139.$g1636$.bind((var15 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var5) : module0139.f9038(var15), var5);
                                final SubLObject var7_1052 = module0141.$g1685$.currentBinding(var5);
                                final SubLObject var8_1051 = module0141.$g1686$.currentBinding(var5);
                                final SubLObject var9_1051 = module0141.$g1683$.currentBinding(var5);
                                final SubLObject var10_1060 = module0141.$g1684$.currentBinding(var5);
                                final SubLObject var11_1061 = module0141.$g1674$.currentBinding(var5);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var5);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var5);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var5);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var5);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var5);
                                    final SubLObject var16 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var17 = (SubLObject)module0252.NIL;
                                    try {
                                        var17 = ReadWriteLocks.rw_lock_seize_read_lock(var16);
                                        final SubLObject var7_1053 = module0141.$g1665$.currentBinding(var5);
                                        final SubLObject var8_1052 = module0139.$g1648$.currentBinding(var5);
                                        try {
                                            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var5);
                                            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var5)), var5);
                                            var6 = f16339(var2);
                                        }
                                        finally {
                                            module0139.$g1648$.rebind(var8_1052, var5);
                                            module0141.$g1665$.rebind(var7_1053, var5);
                                        }
                                    }
                                    finally {
                                        if (module0252.NIL != var17) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var16);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_1061, var5);
                                    module0141.$g1684$.rebind(var10_1060, var5);
                                    module0141.$g1683$.rebind(var9_1051, var5);
                                    module0141.$g1686$.rebind(var8_1051, var5);
                                    module0141.$g1685$.rebind(var7_1052, var5);
                                }
                                if (var15 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var5));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_1051, var5);
                            }
                            if (var15 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var5));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_1050, var5);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_1050, var5);
                        module0141.$g1677$.rebind(var8_1050, var5);
                        module0141.$g1710$.rebind(var7_1049, var5);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_1049, var5);
                    module0141.$g1714$.rebind(var7_1048, var5);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_1049, var5);
                module0147.$g2094$.rebind(var8_1048, var5);
                module0147.$g2095$.rebind(var7_1047, var5);
            }
        }
        finally {
            module0137.$g1605$.rebind(var11, var5);
            module0141.$g1674$.rebind(var10, var5);
            module0141.$g1672$.rebind(var9, var5);
            module0141.$g1671$.rebind(var8, var5);
            module0141.$g1670$.rebind(var7, var5);
        }
        return var6;
    }
    
    public static SubLObject f16335(final SubLObject var1, final SubLObject var931, final SubLObject var932, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var933 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        final SubLObject var934 = module0137.f8917(var1);
        SubLObject var935 = (SubLObject)module0252.NIL;
        if (module0252.NIL != module0268.f17615(var934, var931, var932)) {
            final SubLObject var936 = var3;
            SubLObject var937 = module0147.$g2095$.currentBinding(var933);
            final SubLObject var938 = module0147.$g2094$.currentBinding(var933);
            final SubLObject var939 = module0147.$g2096$.currentBinding(var933);
            try {
                module0147.$g2095$.bind(module0147.f9545(var936), var933);
                module0147.$g2094$.bind(module0147.f9546(var936), var933);
                module0147.$g2096$.bind(module0147.f9549(var936), var933);
                var935 = module0268.f17617(var934, var931, var932, (SubLObject)module0252.UNPROVIDED);
            }
            finally {
                module0147.$g2096$.rebind(var939, var933);
                module0147.$g2094$.rebind(var938, var933);
                module0147.$g2095$.rebind(var937, var933);
            }
            if (module0252.NIL != module0252.$g2471$.getDynamicValue(var933)) {
                SubLObject var940 = (SubLObject)module0252.NIL;
                var937 = module0139.$g1635$.currentBinding(var933);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var933);
                    final SubLObject var7_1066 = module0141.$g1670$.currentBinding(var933);
                    final SubLObject var941 = module0141.$g1671$.currentBinding(var933);
                    final SubLObject var942 = module0141.$g1672$.currentBinding(var933);
                    final SubLObject var943 = module0141.$g1674$.currentBinding(var933);
                    final SubLObject var944 = module0137.$g1605$.currentBinding(var933);
                    try {
                        module0141.$g1670$.bind(var1, var933);
                        module0141.$g1671$.bind(module0244.f15739(var1), var933);
                        module0141.$g1672$.bind(module0244.f15746(var1), var933);
                        module0141.$g1674$.bind((SubLObject)module0252.NIL, var933);
                        module0137.$g1605$.bind(var1, var933);
                        final SubLObject var945 = var3;
                        final SubLObject var7_1067 = module0147.$g2095$.currentBinding(var933);
                        final SubLObject var8_1068 = module0147.$g2094$.currentBinding(var933);
                        final SubLObject var9_1069 = module0147.$g2096$.currentBinding(var933);
                        try {
                            module0147.$g2095$.bind(module0147.f9545(var945), var933);
                            module0147.$g2094$.bind(module0147.f9546(var945), var933);
                            module0147.$g2096$.bind(module0147.f9549(var945), var933);
                            final SubLObject var946 = var4;
                            final SubLObject var7_1068 = module0141.$g1714$.currentBinding(var933);
                            final SubLObject var8_1069 = module0141.$g1715$.currentBinding(var933);
                            try {
                                module0141.$g1714$.bind((module0252.NIL != var946) ? var946 : module0141.f9283(), var933);
                                module0141.$g1715$.bind((SubLObject)((module0252.NIL != var946) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var933)), var933);
                                if (module0252.NIL != var946 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var946)) {
                                    final SubLObject var947 = module0136.$g1591$.getDynamicValue(var933);
                                    if (var947.eql((SubLObject)module0252.$ic2$)) {
                                        module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var946, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                    }
                                    else if (var947.eql((SubLObject)module0252.$ic5$)) {
                                        module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var946, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                    }
                                    else if (var947.eql((SubLObject)module0252.$ic7$)) {
                                        Errors.warn((SubLObject)module0252.$ic3$, var946, (SubLObject)module0252.$ic4$);
                                    }
                                    else {
                                        Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var933));
                                        Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var946, (SubLObject)module0252.$ic4$);
                                    }
                                }
                                final SubLObject var7_1069 = module0141.$g1710$.currentBinding(var933);
                                final SubLObject var8_1070 = module0141.$g1677$.currentBinding(var933);
                                final SubLObject var9_1070 = module0138.$g1619$.currentBinding(var933);
                                try {
                                    module0141.$g1710$.bind(module0252.$ic9$, var933);
                                    module0141.$g1677$.bind(module0141.f9208(), var933);
                                    module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var933);
                                    final SubLObject var948 = module0139.f9036();
                                    final SubLObject var7_1070 = module0139.$g1635$.currentBinding(var933);
                                    try {
                                        module0139.$g1635$.bind((var948 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var933) : module0139.f9038(var948), var933);
                                        final SubLObject var7_1071 = module0139.$g1636$.currentBinding(var933);
                                        try {
                                            module0139.$g1636$.bind((var948 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var933) : module0139.f9038(var948), var933);
                                            final SubLObject var7_1072 = module0141.$g1685$.currentBinding(var933);
                                            final SubLObject var8_1071 = module0141.$g1686$.currentBinding(var933);
                                            final SubLObject var9_1071 = module0141.$g1683$.currentBinding(var933);
                                            final SubLObject var10_1080 = module0141.$g1684$.currentBinding(var933);
                                            final SubLObject var11_1081 = module0141.$g1674$.currentBinding(var933);
                                            try {
                                                module0141.$g1685$.bind((SubLObject)module0252.NIL, var933);
                                                module0141.$g1686$.bind((SubLObject)module0252.NIL, var933);
                                                module0141.$g1683$.bind((SubLObject)module0252.NIL, var933);
                                                module0141.$g1684$.bind((SubLObject)module0252.NIL, var933);
                                                module0141.$g1674$.bind((SubLObject)module0252.NIL, var933);
                                                final SubLObject var949 = module0138.$g1626$.getGlobalValue();
                                                SubLObject var950 = (SubLObject)module0252.NIL;
                                                try {
                                                    var950 = ReadWriteLocks.rw_lock_seize_read_lock(var949);
                                                    var940 = f16341(var931, var932);
                                                }
                                                finally {
                                                    if (module0252.NIL != var950) {
                                                        ReadWriteLocks.rw_lock_release_read_lock(var949);
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var11_1081, var933);
                                                module0141.$g1684$.rebind(var10_1080, var933);
                                                module0141.$g1683$.rebind(var9_1071, var933);
                                                module0141.$g1686$.rebind(var8_1071, var933);
                                                module0141.$g1685$.rebind(var7_1072, var933);
                                            }
                                            if (var948 == module0252.$ic12$) {
                                                module0139.f9012(module0139.$g1636$.getDynamicValue(var933));
                                            }
                                        }
                                        finally {
                                            module0139.$g1636$.rebind(var7_1071, var933);
                                        }
                                        if (var948 == module0252.$ic12$) {
                                            module0139.f9012(module0139.$g1635$.getDynamicValue(var933));
                                        }
                                    }
                                    finally {
                                        module0139.$g1635$.rebind(var7_1070, var933);
                                    }
                                }
                                finally {
                                    module0138.$g1619$.rebind(var9_1070, var933);
                                    module0141.$g1677$.rebind(var8_1070, var933);
                                    module0141.$g1710$.rebind(var7_1069, var933);
                                }
                            }
                            finally {
                                module0141.$g1715$.rebind(var8_1069, var933);
                                module0141.$g1714$.rebind(var7_1068, var933);
                            }
                        }
                        finally {
                            module0147.$g2096$.rebind(var9_1069, var933);
                            module0147.$g2094$.rebind(var8_1068, var933);
                            module0147.$g2095$.rebind(var7_1067, var933);
                        }
                    }
                    finally {
                        module0137.$g1605$.rebind(var944, var933);
                        module0141.$g1674$.rebind(var943, var933);
                        module0141.$g1672$.rebind(var942, var933);
                        module0141.$g1671$.rebind(var941, var933);
                        module0141.$g1670$.rebind(var7_1066, var933);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var933));
                }
                finally {
                    module0139.$g1635$.rebind(var937, var933);
                }
                if (!var935.equal(var940)) {
                    PrintLow.format((SubLObject)module0252.T, (SubLObject)module0252.$ic42$, var935, var940);
                    PrintLow.format((SubLObject)module0252.T, (SubLObject)module0252.$ic43$, new SubLObject[] { var935, var3, var934, var931, var932 });
                    PrintLow.format((SubLObject)module0252.T, (SubLObject)module0252.$ic44$, new SubLObject[] { var940, var934, var3, var4, var931, var932 });
                }
            }
        }
        else {
            final SubLObject var951 = module0139.$g1635$.currentBinding(var933);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var933);
                final SubLObject var7_1073 = module0141.$g1670$.currentBinding(var933);
                final SubLObject var938 = module0141.$g1671$.currentBinding(var933);
                final SubLObject var939 = module0141.$g1672$.currentBinding(var933);
                final SubLObject var952 = module0141.$g1674$.currentBinding(var933);
                final SubLObject var953 = module0137.$g1605$.currentBinding(var933);
                try {
                    module0141.$g1670$.bind(var1, var933);
                    module0141.$g1671$.bind(module0244.f15739(var1), var933);
                    module0141.$g1672$.bind(module0244.f15746(var1), var933);
                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var933);
                    module0137.$g1605$.bind(var1, var933);
                    final SubLObject var954 = var3;
                    final SubLObject var7_1074 = module0147.$g2095$.currentBinding(var933);
                    final SubLObject var8_1072 = module0147.$g2094$.currentBinding(var933);
                    final SubLObject var9_1072 = module0147.$g2096$.currentBinding(var933);
                    try {
                        module0147.$g2095$.bind(module0147.f9545(var954), var933);
                        module0147.$g2094$.bind(module0147.f9546(var954), var933);
                        module0147.$g2096$.bind(module0147.f9549(var954), var933);
                        final SubLObject var955 = var4;
                        final SubLObject var7_1075 = module0141.$g1714$.currentBinding(var933);
                        final SubLObject var8_1073 = module0141.$g1715$.currentBinding(var933);
                        try {
                            module0141.$g1714$.bind((module0252.NIL != var955) ? var955 : module0141.f9283(), var933);
                            module0141.$g1715$.bind((SubLObject)((module0252.NIL != var955) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var933)), var933);
                            if (module0252.NIL != var955 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var955)) {
                                final SubLObject var956 = module0136.$g1591$.getDynamicValue(var933);
                                if (var956.eql((SubLObject)module0252.$ic2$)) {
                                    module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var955, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                }
                                else if (var956.eql((SubLObject)module0252.$ic5$)) {
                                    module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var955, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                                }
                                else if (var956.eql((SubLObject)module0252.$ic7$)) {
                                    Errors.warn((SubLObject)module0252.$ic3$, var955, (SubLObject)module0252.$ic4$);
                                }
                                else {
                                    Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var933));
                                    Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var955, (SubLObject)module0252.$ic4$);
                                }
                            }
                            final SubLObject var7_1076 = module0141.$g1710$.currentBinding(var933);
                            final SubLObject var8_1074 = module0141.$g1677$.currentBinding(var933);
                            final SubLObject var9_1073 = module0138.$g1619$.currentBinding(var933);
                            try {
                                module0141.$g1710$.bind(module0252.$ic9$, var933);
                                module0141.$g1677$.bind(module0141.f9208(), var933);
                                module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var933);
                                final SubLObject var957 = module0139.f9036();
                                final SubLObject var7_1077 = module0139.$g1635$.currentBinding(var933);
                                try {
                                    module0139.$g1635$.bind((var957 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var933) : module0139.f9038(var957), var933);
                                    final SubLObject var7_1078 = module0139.$g1636$.currentBinding(var933);
                                    try {
                                        module0139.$g1636$.bind((var957 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var933) : module0139.f9038(var957), var933);
                                        final SubLObject var7_1079 = module0141.$g1685$.currentBinding(var933);
                                        final SubLObject var8_1075 = module0141.$g1686$.currentBinding(var933);
                                        final SubLObject var9_1074 = module0141.$g1683$.currentBinding(var933);
                                        final SubLObject var10_1081 = module0141.$g1684$.currentBinding(var933);
                                        final SubLObject var11_1082 = module0141.$g1674$.currentBinding(var933);
                                        try {
                                            module0141.$g1685$.bind((SubLObject)module0252.NIL, var933);
                                            module0141.$g1686$.bind((SubLObject)module0252.NIL, var933);
                                            module0141.$g1683$.bind((SubLObject)module0252.NIL, var933);
                                            module0141.$g1684$.bind((SubLObject)module0252.NIL, var933);
                                            module0141.$g1674$.bind((SubLObject)module0252.NIL, var933);
                                            final SubLObject var958 = module0138.$g1626$.getGlobalValue();
                                            SubLObject var959 = (SubLObject)module0252.NIL;
                                            try {
                                                var959 = ReadWriteLocks.rw_lock_seize_read_lock(var958);
                                                var935 = f16341(var931, var932);
                                            }
                                            finally {
                                                if (module0252.NIL != var959) {
                                                    ReadWriteLocks.rw_lock_release_read_lock(var958);
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var11_1082, var933);
                                            module0141.$g1684$.rebind(var10_1081, var933);
                                            module0141.$g1683$.rebind(var9_1074, var933);
                                            module0141.$g1686$.rebind(var8_1075, var933);
                                            module0141.$g1685$.rebind(var7_1079, var933);
                                        }
                                        if (var957 == module0252.$ic12$) {
                                            module0139.f9012(module0139.$g1636$.getDynamicValue(var933));
                                        }
                                    }
                                    finally {
                                        module0139.$g1636$.rebind(var7_1078, var933);
                                    }
                                    if (var957 == module0252.$ic12$) {
                                        module0139.f9012(module0139.$g1635$.getDynamicValue(var933));
                                    }
                                }
                                finally {
                                    module0139.$g1635$.rebind(var7_1077, var933);
                                }
                            }
                            finally {
                                module0138.$g1619$.rebind(var9_1073, var933);
                                module0141.$g1677$.rebind(var8_1074, var933);
                                module0141.$g1710$.rebind(var7_1076, var933);
                            }
                        }
                        finally {
                            module0141.$g1715$.rebind(var8_1073, var933);
                            module0141.$g1714$.rebind(var7_1075, var933);
                        }
                    }
                    finally {
                        module0147.$g2096$.rebind(var9_1072, var933);
                        module0147.$g2094$.rebind(var8_1072, var933);
                        module0147.$g2095$.rebind(var7_1074, var933);
                    }
                }
                finally {
                    module0137.$g1605$.rebind(var953, var933);
                    module0141.$g1674$.rebind(var952, var933);
                    module0141.$g1672$.rebind(var939, var933);
                    module0141.$g1671$.rebind(var938, var933);
                    module0141.$g1670$.rebind(var7_1073, var933);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var933));
            }
            finally {
                module0139.$g1635$.rebind(var951, var933);
            }
        }
        return var935;
    }
    
    public static SubLObject f16342(final SubLObject var1, final SubLObject var2, final SubLObject var985, SubLObject var354, SubLObject var355) {
        if (var354 == module0252.UNPROVIDED) {
            var354 = module0139.$g1635$.getDynamicValue();
        }
        if (var355 == module0252.UNPROVIDED) {
            var355 = module0139.$g1636$.getDynamicValue();
        }
        final SubLThread var986 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        SubLObject var987 = (SubLObject)module0252.NIL;
        final SubLObject var988 = module0141.$g1670$.currentBinding(var986);
        final SubLObject var989 = module0141.$g1671$.currentBinding(var986);
        final SubLObject var990 = module0141.$g1672$.currentBinding(var986);
        final SubLObject var991 = module0141.$g1674$.currentBinding(var986);
        final SubLObject var992 = module0137.$g1605$.currentBinding(var986);
        final SubLObject var993 = module0139.$g1635$.currentBinding(var986);
        final SubLObject var994 = module0139.$g1636$.currentBinding(var986);
        final SubLObject var995 = module0139.$g1644$.currentBinding(var986);
        final SubLObject var996 = module0141.$g1710$.currentBinding(var986);
        final SubLObject var997 = module0141.$g1677$.currentBinding(var986);
        final SubLObject var998 = module0138.$g1619$.currentBinding(var986);
        try {
            module0141.$g1670$.bind(var1, var986);
            module0141.$g1671$.bind(module0244.f15739(var1), var986);
            module0141.$g1672$.bind(module0244.f15746(var1), var986);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var986);
            module0137.$g1605$.bind(var1, var986);
            module0139.$g1635$.bind(var354, var986);
            module0139.$g1636$.bind(var355, var986);
            module0139.$g1644$.bind((SubLObject)module0252.T, var986);
            module0141.$g1710$.bind(module0252.$ic9$, var986);
            module0141.$g1677$.bind(module0141.f9208(), var986);
            module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var986);
            final SubLObject var999 = module0139.f9036();
            final SubLObject var7_1098 = module0139.$g1635$.currentBinding(var986);
            try {
                module0139.$g1635$.bind((var999 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var986) : module0139.f9038(var999), var986);
                final SubLObject var7_1099 = module0139.$g1636$.currentBinding(var986);
                try {
                    module0139.$g1636$.bind((var999 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var986) : module0139.f9038(var999), var986);
                    final SubLObject var7_1100 = module0141.$g1685$.currentBinding(var986);
                    final SubLObject var8_1101 = module0141.$g1686$.currentBinding(var986);
                    final SubLObject var9_1102 = module0141.$g1683$.currentBinding(var986);
                    final SubLObject var10_1103 = module0141.$g1684$.currentBinding(var986);
                    final SubLObject var11_1104 = module0141.$g1674$.currentBinding(var986);
                    try {
                        module0141.$g1685$.bind((SubLObject)module0252.NIL, var986);
                        module0141.$g1686$.bind((SubLObject)module0252.NIL, var986);
                        module0141.$g1683$.bind((SubLObject)module0252.NIL, var986);
                        module0141.$g1684$.bind((SubLObject)module0252.NIL, var986);
                        module0141.$g1674$.bind((SubLObject)module0252.NIL, var986);
                        final SubLObject var1000 = module0138.$g1626$.getGlobalValue();
                        SubLObject var1001 = (SubLObject)module0252.NIL;
                        try {
                            var1001 = ReadWriteLocks.rw_lock_seize_read_lock(var1000);
                            var987 = f16341(var2, var985);
                        }
                        finally {
                            if (module0252.NIL != var1001) {
                                ReadWriteLocks.rw_lock_release_read_lock(var1000);
                            }
                        }
                    }
                    finally {
                        module0141.$g1674$.rebind(var11_1104, var986);
                        module0141.$g1684$.rebind(var10_1103, var986);
                        module0141.$g1683$.rebind(var9_1102, var986);
                        module0141.$g1686$.rebind(var8_1101, var986);
                        module0141.$g1685$.rebind(var7_1100, var986);
                    }
                    if (var999 == module0252.$ic12$) {
                        module0139.f9012(module0139.$g1636$.getDynamicValue(var986));
                    }
                }
                finally {
                    module0139.$g1636$.rebind(var7_1099, var986);
                }
                if (var999 == module0252.$ic12$) {
                    module0139.f9012(module0139.$g1635$.getDynamicValue(var986));
                }
            }
            finally {
                module0139.$g1635$.rebind(var7_1098, var986);
            }
        }
        finally {
            module0138.$g1619$.rebind(var998, var986);
            module0141.$g1677$.rebind(var997, var986);
            module0141.$g1710$.rebind(var996, var986);
            module0139.$g1644$.rebind(var995, var986);
            module0139.$g1636$.rebind(var994, var986);
            module0139.$g1635$.rebind(var993, var986);
            module0137.$g1605$.rebind(var992, var986);
            module0141.$g1674$.rebind(var991, var986);
            module0141.$g1672$.rebind(var990, var986);
            module0141.$g1671$.rebind(var989, var986);
            module0141.$g1670$.rebind(var988, var986);
        }
        return var987;
    }
    
    public static SubLObject f16343(final SubLObject var1, final SubLObject var931, final SubLObject var932, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var933 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        SubLObject var934 = (SubLObject)module0252.NIL;
        final SubLObject var935 = module0141.$g1598$.currentBinding(var933);
        final SubLObject var936 = module0141.$g1682$.currentBinding(var933);
        final SubLObject var937 = module0139.$g1644$.currentBinding(var933);
        try {
            module0141.$g1598$.bind((SubLObject)module0252.NIL, var933);
            module0141.$g1682$.bind((SubLObject)module0252.NIL, var933);
            module0139.$g1644$.bind((SubLObject)module0252.NIL, var933);
            var934 = f16335(var1, var931, var932, var3, var4);
        }
        finally {
            module0139.$g1644$.rebind(var937, var933);
            module0141.$g1682$.rebind(var936, var933);
            module0141.$g1598$.rebind(var935, var933);
        }
        return var934;
    }
    
    public static SubLObject f16344(final SubLObject var1, final SubLObject var2, final SubLObject var985, final SubLObject var1105, final SubLObject var1106) {
        final SubLThread var1107 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        SubLObject var1108 = (SubLObject)module0252.NIL;
        final SubLObject var1109 = module0141.$g1705$.currentBinding(var1107);
        final SubLObject var1110 = module0139.$g1635$.currentBinding(var1107);
        final SubLObject var1111 = module0139.$g1644$.currentBinding(var1107);
        final SubLObject var1112 = module0141.$g1670$.currentBinding(var1107);
        final SubLObject var1113 = module0141.$g1671$.currentBinding(var1107);
        final SubLObject var1114 = module0141.$g1672$.currentBinding(var1107);
        final SubLObject var1115 = module0141.$g1674$.currentBinding(var1107);
        final SubLObject var1116 = module0137.$g1605$.currentBinding(var1107);
        try {
            module0141.$g1705$.bind(var1106, var1107);
            module0139.$g1635$.bind(var1105, var1107);
            module0139.$g1644$.bind((SubLObject)module0252.T, var1107);
            module0141.$g1670$.bind(var1, var1107);
            module0141.$g1671$.bind(module0244.f15739(var1), var1107);
            module0141.$g1672$.bind(module0244.f15746(var1), var1107);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var1107);
            module0137.$g1605$.bind(var1, var1107);
            final SubLObject var7_1107 = module0141.$g1710$.currentBinding(var1107);
            final SubLObject var8_1108 = module0141.$g1677$.currentBinding(var1107);
            final SubLObject var9_1109 = module0138.$g1619$.currentBinding(var1107);
            try {
                module0141.$g1710$.bind(module0252.$ic9$, var1107);
                module0141.$g1677$.bind(module0141.f9208(), var1107);
                module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var1107);
                final SubLObject var1117 = module0139.f9036();
                final SubLObject var7_1108 = module0139.$g1635$.currentBinding(var1107);
                try {
                    module0139.$g1635$.bind((var1117 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var1107) : module0139.f9038(var1117), var1107);
                    final SubLObject var7_1109 = module0139.$g1636$.currentBinding(var1107);
                    try {
                        module0139.$g1636$.bind((var1117 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var1107) : module0139.f9038(var1117), var1107);
                        final SubLObject var7_1110 = module0141.$g1685$.currentBinding(var1107);
                        final SubLObject var8_1109 = module0141.$g1686$.currentBinding(var1107);
                        final SubLObject var9_1110 = module0141.$g1683$.currentBinding(var1107);
                        final SubLObject var10_1115 = module0141.$g1684$.currentBinding(var1107);
                        final SubLObject var11_1116 = module0141.$g1674$.currentBinding(var1107);
                        try {
                            module0141.$g1685$.bind((SubLObject)module0252.NIL, var1107);
                            module0141.$g1686$.bind((SubLObject)module0252.NIL, var1107);
                            module0141.$g1683$.bind((SubLObject)module0252.NIL, var1107);
                            module0141.$g1684$.bind((SubLObject)module0252.NIL, var1107);
                            module0141.$g1674$.bind((SubLObject)module0252.NIL, var1107);
                            final SubLObject var1118 = module0138.$g1626$.getGlobalValue();
                            SubLObject var1119 = (SubLObject)module0252.NIL;
                            try {
                                var1119 = ReadWriteLocks.rw_lock_seize_read_lock(var1118);
                                final SubLObject var7_1111 = module0141.$g1704$.currentBinding(var1107);
                                try {
                                    module0141.$g1704$.bind((SubLObject)module0252.T, var1107);
                                    var1108 = f16341(var2, var985);
                                }
                                finally {
                                    module0141.$g1704$.rebind(var7_1111, var1107);
                                }
                            }
                            finally {
                                if (module0252.NIL != var1119) {
                                    ReadWriteLocks.rw_lock_release_read_lock(var1118);
                                }
                            }
                        }
                        finally {
                            module0141.$g1674$.rebind(var11_1116, var1107);
                            module0141.$g1684$.rebind(var10_1115, var1107);
                            module0141.$g1683$.rebind(var9_1110, var1107);
                            module0141.$g1686$.rebind(var8_1109, var1107);
                            module0141.$g1685$.rebind(var7_1110, var1107);
                        }
                        if (var1117 == module0252.$ic12$) {
                            module0139.f9012(module0139.$g1636$.getDynamicValue(var1107));
                        }
                    }
                    finally {
                        module0139.$g1636$.rebind(var7_1109, var1107);
                    }
                    if (var1117 == module0252.$ic12$) {
                        module0139.f9012(module0139.$g1635$.getDynamicValue(var1107));
                    }
                }
                finally {
                    module0139.$g1635$.rebind(var7_1108, var1107);
                }
            }
            finally {
                module0138.$g1619$.rebind(var9_1109, var1107);
                module0141.$g1677$.rebind(var8_1108, var1107);
                module0141.$g1710$.rebind(var7_1107, var1107);
            }
            if (module0252.NIL != var1108) {
                if (module0252.NIL != module0138.f8992(var1108) && module0252.NIL != module0249.f16056(var1108)) {
                    module0249.f16055(var1108, var1105);
                }
                module0251.f16215((SubLObject)module0252.$ic45$, var985);
            }
        }
        finally {
            module0137.$g1605$.rebind(var1116, var1107);
            module0141.$g1674$.rebind(var1115, var1107);
            module0141.$g1672$.rebind(var1114, var1107);
            module0141.$g1671$.rebind(var1113, var1107);
            module0141.$g1670$.rebind(var1112, var1107);
            module0139.$g1644$.rebind(var1111, var1107);
            module0139.$g1635$.rebind(var1110, var1107);
            module0141.$g1705$.rebind(var1109, var1107);
        }
        return var1108;
    }
    
    public static SubLObject f16345(final SubLObject var1, final SubLObject var931, final SubLObject var932, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var933 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        SubLObject var934 = (SubLObject)module0252.NIL;
        final SubLObject var935 = module0141.$g1670$.currentBinding(var933);
        final SubLObject var936 = module0141.$g1671$.currentBinding(var933);
        final SubLObject var937 = module0141.$g1672$.currentBinding(var933);
        final SubLObject var938 = module0141.$g1674$.currentBinding(var933);
        final SubLObject var939 = module0137.$g1605$.currentBinding(var933);
        try {
            module0141.$g1670$.bind(var1, var933);
            module0141.$g1671$.bind(module0244.f15739(var1), var933);
            module0141.$g1672$.bind(module0244.f15746(var1), var933);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var933);
            module0137.$g1605$.bind(var1, var933);
            final SubLObject var940 = var3;
            final SubLObject var7_1118 = module0147.$g2095$.currentBinding(var933);
            final SubLObject var8_1119 = module0147.$g2094$.currentBinding(var933);
            final SubLObject var9_1120 = module0147.$g2096$.currentBinding(var933);
            try {
                module0147.$g2095$.bind(module0147.f9545(var940), var933);
                module0147.$g2094$.bind(module0147.f9546(var940), var933);
                module0147.$g2096$.bind(module0147.f9549(var940), var933);
                final SubLObject var941 = var4;
                final SubLObject var7_1119 = module0141.$g1714$.currentBinding(var933);
                final SubLObject var8_1120 = module0141.$g1715$.currentBinding(var933);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var941) ? var941 : module0141.f9283(), var933);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var941) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var933)), var933);
                    if (module0252.NIL != var941 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var941)) {
                        final SubLObject var942 = module0136.$g1591$.getDynamicValue(var933);
                        if (var942.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var941, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var942.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var941, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var942.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var941, (SubLObject)module0252.$ic4$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var933));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var941, (SubLObject)module0252.$ic4$);
                        }
                    }
                    final SubLObject var7_1120 = module0141.$g1710$.currentBinding(var933);
                    final SubLObject var8_1121 = module0141.$g1677$.currentBinding(var933);
                    final SubLObject var9_1121 = module0138.$g1619$.currentBinding(var933);
                    try {
                        module0141.$g1710$.bind(module0252.$ic9$, var933);
                        module0141.$g1677$.bind(module0141.f9210(), var933);
                        module0138.$g1619$.bind(module0244.f15780(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var933);
                        final SubLObject var943 = module0139.f9036();
                        final SubLObject var7_1121 = module0139.$g1635$.currentBinding(var933);
                        try {
                            module0139.$g1635$.bind((var943 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var933) : module0139.f9038(var943), var933);
                            final SubLObject var7_1122 = module0139.$g1636$.currentBinding(var933);
                            try {
                                module0139.$g1636$.bind((var943 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var933) : module0139.f9038(var943), var933);
                                final SubLObject var7_1123 = module0141.$g1685$.currentBinding(var933);
                                final SubLObject var8_1122 = module0141.$g1686$.currentBinding(var933);
                                final SubLObject var9_1122 = module0141.$g1683$.currentBinding(var933);
                                final SubLObject var10_1131 = module0141.$g1684$.currentBinding(var933);
                                final SubLObject var11_1132 = module0141.$g1674$.currentBinding(var933);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var933);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var933);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var933);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var933);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var933);
                                    final SubLObject var944 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var945 = (SubLObject)module0252.NIL;
                                    try {
                                        var945 = ReadWriteLocks.rw_lock_seize_read_lock(var944);
                                        var934 = f16341(var931, var932);
                                    }
                                    finally {
                                        if (module0252.NIL != var945) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var944);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_1132, var933);
                                    module0141.$g1684$.rebind(var10_1131, var933);
                                    module0141.$g1683$.rebind(var9_1122, var933);
                                    module0141.$g1686$.rebind(var8_1122, var933);
                                    module0141.$g1685$.rebind(var7_1123, var933);
                                }
                                if (var943 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var933));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_1122, var933);
                            }
                            if (var943 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var933));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_1121, var933);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_1121, var933);
                        module0141.$g1677$.rebind(var8_1121, var933);
                        module0141.$g1710$.rebind(var7_1120, var933);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_1120, var933);
                    module0141.$g1714$.rebind(var7_1119, var933);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_1120, var933);
                module0147.$g2094$.rebind(var8_1119, var933);
                module0147.$g2095$.rebind(var7_1118, var933);
            }
        }
        finally {
            module0137.$g1605$.rebind(var939, var933);
            module0141.$g1674$.rebind(var938, var933);
            module0141.$g1672$.rebind(var937, var933);
            module0141.$g1671$.rebind(var936, var933);
            module0141.$g1670$.rebind(var935, var933);
        }
        return var934;
    }
    
    public static SubLObject f16346(final SubLObject var1, final SubLObject var931, final SubLObject var932, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var933 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        SubLObject var934 = (SubLObject)module0252.NIL;
        final SubLObject var935 = module0141.$g1670$.currentBinding(var933);
        final SubLObject var936 = module0141.$g1671$.currentBinding(var933);
        final SubLObject var937 = module0141.$g1672$.currentBinding(var933);
        final SubLObject var938 = module0141.$g1674$.currentBinding(var933);
        final SubLObject var939 = module0137.$g1605$.currentBinding(var933);
        try {
            module0141.$g1670$.bind(var1, var933);
            module0141.$g1671$.bind(module0244.f15739(var1), var933);
            module0141.$g1672$.bind(module0244.f15746(var1), var933);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var933);
            module0137.$g1605$.bind(var1, var933);
            final SubLObject var940 = var3;
            final SubLObject var7_1133 = module0147.$g2095$.currentBinding(var933);
            final SubLObject var8_1134 = module0147.$g2094$.currentBinding(var933);
            final SubLObject var9_1135 = module0147.$g2096$.currentBinding(var933);
            try {
                module0147.$g2095$.bind(module0147.f9545(var940), var933);
                module0147.$g2094$.bind(module0147.f9546(var940), var933);
                module0147.$g2096$.bind(module0147.f9549(var940), var933);
                final SubLObject var941 = var4;
                final SubLObject var7_1134 = module0141.$g1714$.currentBinding(var933);
                final SubLObject var8_1135 = module0141.$g1715$.currentBinding(var933);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var941) ? var941 : module0141.f9284(), var933);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var941) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var933)), var933);
                    if (module0252.NIL != var941 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9281(var941)) {
                        final SubLObject var942 = module0136.$g1591$.getDynamicValue(var933);
                        if (var942.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var941, (SubLObject)module0252.$ic13$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var942.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var941, (SubLObject)module0252.$ic13$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var942.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var941, (SubLObject)module0252.$ic13$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var933));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var941, (SubLObject)module0252.$ic13$);
                        }
                    }
                    final SubLObject var7_1135 = module0141.$g1710$.currentBinding(var933);
                    final SubLObject var8_1136 = module0141.$g1677$.currentBinding(var933);
                    final SubLObject var9_1136 = module0138.$g1619$.currentBinding(var933);
                    try {
                        module0141.$g1710$.bind(module0252.$ic14$, var933);
                        module0141.$g1677$.bind(module0141.f9208(), var933);
                        module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var933);
                        final SubLObject var943 = module0139.f9036();
                        final SubLObject var7_1136 = module0139.$g1635$.currentBinding(var933);
                        try {
                            module0139.$g1635$.bind((var943 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var933) : module0139.f9038(var943), var933);
                            final SubLObject var7_1137 = module0139.$g1636$.currentBinding(var933);
                            try {
                                module0139.$g1636$.bind((var943 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var933) : module0139.f9038(var943), var933);
                                final SubLObject var7_1138 = module0141.$g1685$.currentBinding(var933);
                                final SubLObject var8_1137 = module0141.$g1686$.currentBinding(var933);
                                final SubLObject var9_1137 = module0141.$g1683$.currentBinding(var933);
                                final SubLObject var10_1146 = module0141.$g1684$.currentBinding(var933);
                                final SubLObject var11_1147 = module0141.$g1674$.currentBinding(var933);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var933);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var933);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var933);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var933);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var933);
                                    final SubLObject var944 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var945 = (SubLObject)module0252.NIL;
                                    try {
                                        var945 = ReadWriteLocks.rw_lock_seize_read_lock(var944);
                                        var934 = f16341(var931, var932);
                                    }
                                    finally {
                                        if (module0252.NIL != var945) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var944);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_1147, var933);
                                    module0141.$g1684$.rebind(var10_1146, var933);
                                    module0141.$g1683$.rebind(var9_1137, var933);
                                    module0141.$g1686$.rebind(var8_1137, var933);
                                    module0141.$g1685$.rebind(var7_1138, var933);
                                }
                                if (var943 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var933));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_1137, var933);
                            }
                            if (var943 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var933));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_1136, var933);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_1136, var933);
                        module0141.$g1677$.rebind(var8_1136, var933);
                        module0141.$g1710$.rebind(var7_1135, var933);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_1135, var933);
                    module0141.$g1714$.rebind(var7_1134, var933);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_1135, var933);
                module0147.$g2094$.rebind(var8_1134, var933);
                module0147.$g2095$.rebind(var7_1133, var933);
            }
        }
        finally {
            module0137.$g1605$.rebind(var939, var933);
            module0141.$g1674$.rebind(var938, var933);
            module0141.$g1672$.rebind(var937, var933);
            module0141.$g1671$.rebind(var936, var933);
            module0141.$g1670$.rebind(var935, var933);
        }
        return var934;
    }
    
    public static SubLObject f16347(final SubLObject var1, final SubLObject var931, final SubLObject var932, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var933 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        SubLObject var934 = (SubLObject)module0252.NIL;
        final SubLObject var935 = module0141.$g1670$.currentBinding(var933);
        final SubLObject var936 = module0141.$g1671$.currentBinding(var933);
        final SubLObject var937 = module0141.$g1672$.currentBinding(var933);
        final SubLObject var938 = module0141.$g1674$.currentBinding(var933);
        final SubLObject var939 = module0137.$g1605$.currentBinding(var933);
        try {
            module0141.$g1670$.bind(var1, var933);
            module0141.$g1671$.bind(module0244.f15739(var1), var933);
            module0141.$g1672$.bind(module0244.f15746(var1), var933);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var933);
            module0137.$g1605$.bind(var1, var933);
            final SubLObject var940 = var3;
            final SubLObject var7_1148 = module0147.$g2095$.currentBinding(var933);
            final SubLObject var8_1149 = module0147.$g2094$.currentBinding(var933);
            final SubLObject var9_1150 = module0147.$g2096$.currentBinding(var933);
            try {
                module0147.$g2095$.bind(module0147.f9545(var940), var933);
                module0147.$g2094$.bind(module0147.f9546(var940), var933);
                module0147.$g2096$.bind(module0147.f9549(var940), var933);
                final SubLObject var941 = var4;
                final SubLObject var7_1149 = module0141.$g1714$.currentBinding(var933);
                final SubLObject var8_1150 = module0141.$g1715$.currentBinding(var933);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var941) ? var941 : module0141.f9284(), var933);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var941) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var933)), var933);
                    if (module0252.NIL != var941 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9281(var941)) {
                        final SubLObject var942 = module0136.$g1591$.getDynamicValue(var933);
                        if (var942.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var941, (SubLObject)module0252.$ic13$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var942.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var941, (SubLObject)module0252.$ic13$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var942.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var941, (SubLObject)module0252.$ic13$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var933));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var941, (SubLObject)module0252.$ic13$);
                        }
                    }
                    final SubLObject var7_1150 = module0141.$g1710$.currentBinding(var933);
                    final SubLObject var8_1151 = module0141.$g1677$.currentBinding(var933);
                    final SubLObject var9_1151 = module0138.$g1619$.currentBinding(var933);
                    try {
                        module0141.$g1710$.bind(module0252.$ic14$, var933);
                        module0141.$g1677$.bind(module0141.f9210(), var933);
                        module0138.$g1619$.bind(module0244.f15780(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var933);
                        final SubLObject var943 = module0139.f9036();
                        final SubLObject var7_1151 = module0139.$g1635$.currentBinding(var933);
                        try {
                            module0139.$g1635$.bind((var943 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var933) : module0139.f9038(var943), var933);
                            final SubLObject var7_1152 = module0139.$g1636$.currentBinding(var933);
                            try {
                                module0139.$g1636$.bind((var943 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var933) : module0139.f9038(var943), var933);
                                final SubLObject var7_1153 = module0141.$g1685$.currentBinding(var933);
                                final SubLObject var8_1152 = module0141.$g1686$.currentBinding(var933);
                                final SubLObject var9_1152 = module0141.$g1683$.currentBinding(var933);
                                final SubLObject var10_1161 = module0141.$g1684$.currentBinding(var933);
                                final SubLObject var11_1162 = module0141.$g1674$.currentBinding(var933);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var933);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var933);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var933);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var933);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var933);
                                    final SubLObject var944 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var945 = (SubLObject)module0252.NIL;
                                    try {
                                        var945 = ReadWriteLocks.rw_lock_seize_read_lock(var944);
                                        var934 = f16341(var931, var932);
                                    }
                                    finally {
                                        if (module0252.NIL != var945) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var944);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_1162, var933);
                                    module0141.$g1684$.rebind(var10_1161, var933);
                                    module0141.$g1683$.rebind(var9_1152, var933);
                                    module0141.$g1686$.rebind(var8_1152, var933);
                                    module0141.$g1685$.rebind(var7_1153, var933);
                                }
                                if (var943 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var933));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_1152, var933);
                            }
                            if (var943 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var933));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_1151, var933);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_1151, var933);
                        module0141.$g1677$.rebind(var8_1151, var933);
                        module0141.$g1710$.rebind(var7_1150, var933);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_1150, var933);
                    module0141.$g1714$.rebind(var7_1149, var933);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_1150, var933);
                module0147.$g2094$.rebind(var8_1149, var933);
                module0147.$g2095$.rebind(var7_1148, var933);
            }
        }
        finally {
            module0137.$g1605$.rebind(var939, var933);
            module0141.$g1674$.rebind(var938, var933);
            module0141.$g1672$.rebind(var937, var933);
            module0141.$g1671$.rebind(var936, var933);
            module0141.$g1670$.rebind(var935, var933);
        }
        return var934;
    }
    
    public static SubLObject f16341(final SubLObject var931, final SubLObject var932) {
        final SubLThread var933 = SubLProcess.currentSubLThread();
        module0413.f28802();
        SubLObject var934 = (SubLObject)module0252.NIL;
        final SubLObject var935 = module0141.$g1664$.currentBinding(var933);
        final SubLObject var936 = module0141.$g1665$.currentBinding(var933);
        final SubLObject var937 = module0139.$g1648$.currentBinding(var933);
        try {
            module0141.$g1664$.bind((SubLObject)module0252.$ic46$, var933);
            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var933);
            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var933)), var933);
            final SubLObject var938 = module0250.f16097();
            SubLObject var939 = (SubLObject)module0252.$ic47$;
            SubLObject var940 = module0139.$g1635$.getDynamicValue(var933);
            if (module0252.NIL != var938) {
                final SubLObject var7_1167 = module0137.$g1605$.currentBinding(var933);
                final SubLObject var8_1168 = module0141.$g1674$.currentBinding(var933);
                try {
                    module0137.$g1605$.bind(module0244.f15771(module0141.f9188()), var933);
                    module0141.$g1674$.bind((SubLObject)(module0244.f15736(module0141.f9188()).eql(module0252.$ic48$) ? module0252.T : module0141.$g1674$.getDynamicValue(var933)), var933);
                    module0251.f16199(var932);
                }
                finally {
                    module0141.$g1674$.rebind(var8_1168, var933);
                    module0137.$g1605$.rebind(var7_1167, var933);
                }
                var939 = (SubLObject)module0252.$ic49$;
                var940 = module0139.$g1636$.getDynamicValue(var933);
            }
            final SubLObject var7_1168 = module0141.$g1683$.currentBinding(var933);
            final SubLObject var8_1169 = module0141.$g1674$.currentBinding(var933);
            final SubLObject var9_1171 = module0141.$g1693$.currentBinding(var933);
            final SubLObject var941 = module0141.$g1688$.currentBinding(var933);
            final SubLObject var942 = module0139.$g1645$.currentBinding(var933);
            final SubLObject var943 = module0141.$g1669$.currentBinding(var933);
            try {
                module0141.$g1683$.bind((SubLObject)module0252.NIL, var933);
                module0141.$g1674$.bind((SubLObject)module0252.NIL, var933);
                module0141.$g1693$.bind(var939, var933);
                module0141.$g1688$.bind(var932, var933);
                module0139.$g1645$.bind(var940, var933);
                module0141.$g1669$.bind((SubLObject)module0252.NIL, var933);
                var934 = f16246(var931);
            }
            finally {
                module0141.$g1669$.rebind(var943, var933);
                module0139.$g1645$.rebind(var942, var933);
                module0141.$g1688$.rebind(var941, var933);
                module0141.$g1693$.rebind(var9_1171, var933);
                module0141.$g1674$.rebind(var8_1169, var933);
                module0141.$g1683$.rebind(var7_1168, var933);
            }
        }
        finally {
            module0139.$g1648$.rebind(var937, var933);
            module0141.$g1665$.rebind(var936, var933);
            module0141.$g1664$.rebind(var935, var933);
        }
        if (module0252.NIL != var934) {
            module0413.f28804();
        }
        return var934;
    }
    
    public static SubLObject f16348(final SubLObject var1, final SubLObject var931, final SubLObject var932, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        assert module0252.NIL != module0137.f8885(var1) : var1;
        final SubLObject var933 = module0244.f15769(var1);
        SubLObject var934 = (SubLObject)module0252.NIL;
        var934 = f16335(var933, var931, var932, var3, var4);
        return var934;
    }
    
    public static SubLObject f16349(final SubLObject var1, final SubLObject var931, final SubLObject var932, SubLObject var3, SubLObject var4, SubLObject var169) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        if (var169 == module0252.UNPROVIDED) {
            var169 = (SubLObject)module0252.NIL;
        }
        assert module0252.NIL != module0137.f8885(var1) : var1;
        return module0250.f16108((SubLObject)module0252.$ic50$, var1, var931, var932, var3, var4, var169, (SubLObject)module0252.T);
    }
    
    public static SubLObject f16350(final SubLObject var1, final SubLObject var931, final SubLObject var932, SubLObject var3, SubLObject var4, SubLObject var169) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        if (var169 == module0252.UNPROVIDED) {
            var169 = (SubLObject)module0252.NIL;
        }
        assert module0252.NIL != module0137.f8885(var1) : var1;
        return module0250.f16108((SubLObject)module0252.$ic51$, var1, var931, var932, var3, var4, var169, (SubLObject)module0252.NIL);
    }
    
    public static SubLObject f16351(final SubLObject var1, final SubLObject var931, final SubLObject var932, SubLObject var3, SubLObject var4, SubLObject var169) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        if (var169 == module0252.UNPROVIDED) {
            var169 = (SubLObject)module0252.NIL;
        }
        final SubLThread var933 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        SubLObject var934 = (SubLObject)module0252.NIL;
        if (module0252.NIL != module0141.f9279(var4) || (module0252.NIL == var4 && module0252.NIL != module0141.f9279(module0141.$g1714$.getDynamicValue(var933)))) {
            if (module0252.NIL != module0244.f15761(var1) || module0252.NIL != module0244.f15770(var1)) {
                var934 = (SubLObject)module0252.$ic50$;
            }
            else if (module0252.NIL != module0244.f15768(var1)) {
                var934 = (SubLObject)module0252.$ic52$;
            }
            else if (module0252.NIL != module0244.f15733(var1)) {}
        }
        else if (module0252.NIL != module0141.f9281(var4) || (module0252.NIL == var4 && module0252.NIL != module0141.f9281(module0141.$g1714$.getDynamicValue(var933)))) {
            if (module0252.NIL != module0244.f15761(var1) || module0252.NIL != module0244.f15770(var1)) {
                var934 = (SubLObject)module0252.$ic53$;
            }
            else if (module0252.NIL != module0244.f15768(var1)) {
                var934 = (SubLObject)module0252.$ic51$;
            }
            else if (module0252.NIL != module0244.f15733(var1)) {}
        }
        else {
            module0136.f8870((SubLObject)module0252.THREE_INTEGER, (SubLObject)module0252.$ic54$, var4, module0141.$g1714$.getDynamicValue(var933), (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
        }
        if (module0252.NIL != var934) {
            return module0250.f16108(var934, var1, var931, var932, var3, var4, var169, (SubLObject)module0252.UNPROVIDED);
        }
        return (SubLObject)module0252.NIL;
    }
    
    public static SubLObject f16352(final SubLObject var1, final SubLObject var2, final SubLObject var132, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var133 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        if (module0252.NIL == var132) {
            return (SubLObject)module0252.NIL;
        }
        SubLObject var134 = (SubLObject)module0252.NIL;
        final SubLObject var135 = module0141.$g1670$.currentBinding(var133);
        final SubLObject var136 = module0141.$g1671$.currentBinding(var133);
        final SubLObject var137 = module0141.$g1672$.currentBinding(var133);
        final SubLObject var138 = module0141.$g1674$.currentBinding(var133);
        final SubLObject var139 = module0137.$g1605$.currentBinding(var133);
        try {
            module0141.$g1670$.bind(var1, var133);
            module0141.$g1671$.bind(module0244.f15739(var1), var133);
            module0141.$g1672$.bind(module0244.f15746(var1), var133);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var133);
            module0137.$g1605$.bind(var1, var133);
            final SubLObject var140 = var3;
            final SubLObject var7_1174 = module0147.$g2095$.currentBinding(var133);
            final SubLObject var8_1175 = module0147.$g2094$.currentBinding(var133);
            final SubLObject var9_1176 = module0147.$g2096$.currentBinding(var133);
            try {
                module0147.$g2095$.bind(module0147.f9545(var140), var133);
                module0147.$g2094$.bind(module0147.f9546(var140), var133);
                module0147.$g2096$.bind(module0147.f9549(var140), var133);
                final SubLObject var141 = var4;
                final SubLObject var7_1175 = module0141.$g1714$.currentBinding(var133);
                final SubLObject var8_1176 = module0141.$g1715$.currentBinding(var133);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var141) ? var141 : module0141.f9283(), var133);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var141) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var133)), var133);
                    if (module0252.NIL != var141 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var141)) {
                        final SubLObject var142 = module0136.$g1591$.getDynamicValue(var133);
                        if (var142.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var141, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var142.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var141, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var142.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var141, (SubLObject)module0252.$ic4$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var133));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var141, (SubLObject)module0252.$ic4$);
                        }
                    }
                    final SubLObject var7_1176 = module0141.$g1710$.currentBinding(var133);
                    final SubLObject var8_1177 = module0141.$g1677$.currentBinding(var133);
                    final SubLObject var9_1177 = module0138.$g1619$.currentBinding(var133);
                    try {
                        module0141.$g1710$.bind(module0252.$ic9$, var133);
                        module0141.$g1677$.bind(module0141.f9208(), var133);
                        module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var133);
                        final SubLObject var143 = module0139.f9036();
                        final SubLObject var7_1177 = module0139.$g1635$.currentBinding(var133);
                        try {
                            module0139.$g1635$.bind((var143 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var133) : module0139.f9038(var143), var133);
                            final SubLObject var7_1178 = module0139.$g1636$.currentBinding(var133);
                            try {
                                module0139.$g1636$.bind((var143 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var133) : module0139.f9038(var143), var133);
                                final SubLObject var7_1179 = module0141.$g1685$.currentBinding(var133);
                                final SubLObject var8_1178 = module0141.$g1686$.currentBinding(var133);
                                final SubLObject var9_1178 = module0141.$g1683$.currentBinding(var133);
                                final SubLObject var10_1187 = module0141.$g1684$.currentBinding(var133);
                                final SubLObject var11_1188 = module0141.$g1674$.currentBinding(var133);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var133);
                                    final SubLObject var144 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var145 = (SubLObject)module0252.NIL;
                                    try {
                                        var145 = ReadWriteLocks.rw_lock_seize_read_lock(var144);
                                        var134 = f16301(var2, var132);
                                    }
                                    finally {
                                        if (module0252.NIL != var145) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var144);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_1188, var133);
                                    module0141.$g1684$.rebind(var10_1187, var133);
                                    module0141.$g1683$.rebind(var9_1178, var133);
                                    module0141.$g1686$.rebind(var8_1178, var133);
                                    module0141.$g1685$.rebind(var7_1179, var133);
                                }
                                if (var143 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var133));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_1178, var133);
                            }
                            if (var143 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var133));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_1177, var133);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_1177, var133);
                        module0141.$g1677$.rebind(var8_1177, var133);
                        module0141.$g1710$.rebind(var7_1176, var133);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_1176, var133);
                    module0141.$g1714$.rebind(var7_1175, var133);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_1176, var133);
                module0147.$g2094$.rebind(var8_1175, var133);
                module0147.$g2095$.rebind(var7_1174, var133);
            }
        }
        finally {
            module0137.$g1605$.rebind(var139, var133);
            module0141.$g1674$.rebind(var138, var133);
            module0141.$g1672$.rebind(var137, var133);
            module0141.$g1671$.rebind(var136, var133);
            module0141.$g1670$.rebind(var135, var133);
        }
        return var134;
    }
    
    public static SubLObject f16353(final SubLObject var1, final SubLObject var2, final SubLObject var132, SubLObject var3, SubLObject var4, SubLObject var169) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        if (var169 == module0252.UNPROVIDED) {
            var169 = (SubLObject)module0252.NIL;
        }
        assert module0252.NIL != module0137.f8885(var1) : var1;
        return module0250.f16108((SubLObject)module0252.$ic55$, var1, var2, var132, var3, var4, var169, (SubLObject)module0252.T);
    }
    
    public static SubLObject f16354(final SubLObject var1, final SubLObject var2, final SubLObject var132, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var133 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        SubLObject var134 = (SubLObject)module0252.NIL;
        final SubLObject var135 = module0141.$g1670$.currentBinding(var133);
        final SubLObject var136 = module0141.$g1671$.currentBinding(var133);
        final SubLObject var137 = module0141.$g1672$.currentBinding(var133);
        final SubLObject var138 = module0141.$g1674$.currentBinding(var133);
        final SubLObject var139 = module0137.$g1605$.currentBinding(var133);
        try {
            module0141.$g1670$.bind(var1, var133);
            module0141.$g1671$.bind(module0244.f15739(var1), var133);
            module0141.$g1672$.bind(module0244.f15746(var1), var133);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var133);
            module0137.$g1605$.bind(var1, var133);
            final SubLObject var140 = var3;
            final SubLObject var7_1189 = module0147.$g2095$.currentBinding(var133);
            final SubLObject var8_1190 = module0147.$g2094$.currentBinding(var133);
            final SubLObject var9_1191 = module0147.$g2096$.currentBinding(var133);
            try {
                module0147.$g2095$.bind(module0147.f9545(var140), var133);
                module0147.$g2094$.bind(module0147.f9546(var140), var133);
                module0147.$g2096$.bind(module0147.f9549(var140), var133);
                final SubLObject var141 = var4;
                final SubLObject var7_1190 = module0141.$g1714$.currentBinding(var133);
                final SubLObject var8_1191 = module0141.$g1715$.currentBinding(var133);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var141) ? var141 : module0141.f9283(), var133);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var141) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var133)), var133);
                    if (module0252.NIL != var141 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var141)) {
                        final SubLObject var142 = module0136.$g1591$.getDynamicValue(var133);
                        if (var142.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var141, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var142.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var141, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var142.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var141, (SubLObject)module0252.$ic4$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var133));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var141, (SubLObject)module0252.$ic4$);
                        }
                    }
                    final SubLObject var7_1191 = module0141.$g1710$.currentBinding(var133);
                    final SubLObject var8_1192 = module0141.$g1677$.currentBinding(var133);
                    final SubLObject var9_1192 = module0138.$g1619$.currentBinding(var133);
                    try {
                        module0141.$g1710$.bind(module0252.$ic9$, var133);
                        module0141.$g1677$.bind(module0141.f9210(), var133);
                        module0138.$g1619$.bind(module0244.f15780(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var133);
                        final SubLObject var143 = module0139.f9036();
                        final SubLObject var7_1192 = module0139.$g1635$.currentBinding(var133);
                        try {
                            module0139.$g1635$.bind((var143 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var133) : module0139.f9038(var143), var133);
                            final SubLObject var7_1193 = module0139.$g1636$.currentBinding(var133);
                            try {
                                module0139.$g1636$.bind((var143 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var133) : module0139.f9038(var143), var133);
                                final SubLObject var7_1194 = module0141.$g1685$.currentBinding(var133);
                                final SubLObject var8_1193 = module0141.$g1686$.currentBinding(var133);
                                final SubLObject var9_1193 = module0141.$g1683$.currentBinding(var133);
                                final SubLObject var10_1202 = module0141.$g1684$.currentBinding(var133);
                                final SubLObject var11_1203 = module0141.$g1674$.currentBinding(var133);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var133);
                                    final SubLObject var144 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var145 = (SubLObject)module0252.NIL;
                                    try {
                                        var145 = ReadWriteLocks.rw_lock_seize_read_lock(var144);
                                        var134 = f16301(var2, var132);
                                    }
                                    finally {
                                        if (module0252.NIL != var145) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var144);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_1203, var133);
                                    module0141.$g1684$.rebind(var10_1202, var133);
                                    module0141.$g1683$.rebind(var9_1193, var133);
                                    module0141.$g1686$.rebind(var8_1193, var133);
                                    module0141.$g1685$.rebind(var7_1194, var133);
                                }
                                if (var143 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var133));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_1193, var133);
                            }
                            if (var143 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var133));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_1192, var133);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_1192, var133);
                        module0141.$g1677$.rebind(var8_1192, var133);
                        module0141.$g1710$.rebind(var7_1191, var133);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_1191, var133);
                    module0141.$g1714$.rebind(var7_1190, var133);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_1191, var133);
                module0147.$g2094$.rebind(var8_1190, var133);
                module0147.$g2095$.rebind(var7_1189, var133);
            }
        }
        finally {
            module0137.$g1605$.rebind(var139, var133);
            module0141.$g1674$.rebind(var138, var133);
            module0141.$g1672$.rebind(var137, var133);
            module0141.$g1671$.rebind(var136, var133);
            module0141.$g1670$.rebind(var135, var133);
        }
        return var134;
    }
    
    public static SubLObject f16355(final SubLObject var1, final SubLObject var2, final SubLObject var132, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var133 = SubLProcess.currentSubLThread();
        SubLObject var134 = (SubLObject)module0252.NIL;
        final SubLObject var135 = module0141.$g1670$.currentBinding(var133);
        final SubLObject var136 = module0141.$g1671$.currentBinding(var133);
        final SubLObject var137 = module0141.$g1672$.currentBinding(var133);
        final SubLObject var138 = module0141.$g1674$.currentBinding(var133);
        final SubLObject var139 = module0137.$g1605$.currentBinding(var133);
        try {
            module0141.$g1670$.bind(var1, var133);
            module0141.$g1671$.bind(module0244.f15739(var1), var133);
            module0141.$g1672$.bind(module0244.f15746(var1), var133);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var133);
            module0137.$g1605$.bind(var1, var133);
            final SubLObject var140 = var3;
            final SubLObject var7_1204 = module0147.$g2095$.currentBinding(var133);
            final SubLObject var8_1205 = module0147.$g2094$.currentBinding(var133);
            final SubLObject var9_1206 = module0147.$g2096$.currentBinding(var133);
            try {
                module0147.$g2095$.bind(module0147.f9545(var140), var133);
                module0147.$g2094$.bind(module0147.f9546(var140), var133);
                module0147.$g2096$.bind(module0147.f9549(var140), var133);
                final SubLObject var141 = var4;
                final SubLObject var7_1205 = module0141.$g1714$.currentBinding(var133);
                final SubLObject var8_1206 = module0141.$g1715$.currentBinding(var133);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var141) ? var141 : module0141.f9284(), var133);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var141) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var133)), var133);
                    if (module0252.NIL != var141 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9281(var141)) {
                        final SubLObject var142 = module0136.$g1591$.getDynamicValue(var133);
                        if (var142.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var141, (SubLObject)module0252.$ic13$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var142.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var141, (SubLObject)module0252.$ic13$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var142.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var141, (SubLObject)module0252.$ic13$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var133));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var141, (SubLObject)module0252.$ic13$);
                        }
                    }
                    final SubLObject var7_1206 = module0141.$g1710$.currentBinding(var133);
                    final SubLObject var8_1207 = module0141.$g1677$.currentBinding(var133);
                    final SubLObject var9_1207 = module0138.$g1619$.currentBinding(var133);
                    try {
                        module0141.$g1710$.bind(module0252.$ic14$, var133);
                        module0141.$g1677$.bind(module0141.f9208(), var133);
                        module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var133);
                        final SubLObject var143 = module0139.f9036();
                        final SubLObject var7_1207 = module0139.$g1635$.currentBinding(var133);
                        try {
                            module0139.$g1635$.bind((var143 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var133) : module0139.f9038(var143), var133);
                            final SubLObject var7_1208 = module0139.$g1636$.currentBinding(var133);
                            try {
                                module0139.$g1636$.bind((var143 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var133) : module0139.f9038(var143), var133);
                                final SubLObject var7_1209 = module0141.$g1685$.currentBinding(var133);
                                final SubLObject var8_1208 = module0141.$g1686$.currentBinding(var133);
                                final SubLObject var9_1208 = module0141.$g1683$.currentBinding(var133);
                                final SubLObject var10_1217 = module0141.$g1684$.currentBinding(var133);
                                final SubLObject var11_1218 = module0141.$g1674$.currentBinding(var133);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var133);
                                    final SubLObject var144 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var145 = (SubLObject)module0252.NIL;
                                    try {
                                        var145 = ReadWriteLocks.rw_lock_seize_read_lock(var144);
                                        var134 = f16301(var2, var132);
                                    }
                                    finally {
                                        if (module0252.NIL != var145) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var144);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_1218, var133);
                                    module0141.$g1684$.rebind(var10_1217, var133);
                                    module0141.$g1683$.rebind(var9_1208, var133);
                                    module0141.$g1686$.rebind(var8_1208, var133);
                                    module0141.$g1685$.rebind(var7_1209, var133);
                                }
                                if (var143 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var133));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_1208, var133);
                            }
                            if (var143 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var133));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_1207, var133);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_1207, var133);
                        module0141.$g1677$.rebind(var8_1207, var133);
                        module0141.$g1710$.rebind(var7_1206, var133);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_1206, var133);
                    module0141.$g1714$.rebind(var7_1205, var133);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_1206, var133);
                module0147.$g2094$.rebind(var8_1205, var133);
                module0147.$g2095$.rebind(var7_1204, var133);
            }
        }
        finally {
            module0137.$g1605$.rebind(var139, var133);
            module0141.$g1674$.rebind(var138, var133);
            module0141.$g1672$.rebind(var137, var133);
            module0141.$g1671$.rebind(var136, var133);
            module0141.$g1670$.rebind(var135, var133);
        }
        return var134;
    }
    
    public static SubLObject f16356(final SubLObject var132) {
        final SubLThread var133 = SubLProcess.currentSubLThread();
        final SubLObject var134 = module0141.$g1670$.currentBinding(var133);
        final SubLObject var135 = module0141.$g1671$.currentBinding(var133);
        final SubLObject var136 = module0141.$g1672$.currentBinding(var133);
        final SubLObject var137 = module0141.$g1674$.currentBinding(var133);
        final SubLObject var138 = module0137.$g1605$.currentBinding(var133);
        final SubLObject var139 = module0141.$g1677$.currentBinding(var133);
        final SubLObject var140 = module0138.$g1619$.currentBinding(var133);
        final SubLObject var141 = module0141.$g1665$.currentBinding(var133);
        final SubLObject var142 = module0139.$g1648$.currentBinding(var133);
        final SubLObject var143 = module0139.$g1635$.currentBinding(var133);
        try {
            module0141.$g1670$.bind(module0244.f15775(module0141.f9188()), var133);
            module0141.$g1671$.bind(module0244.f15739(module0244.f15775(module0141.f9188())), var133);
            module0141.$g1672$.bind(module0244.f15746(module0244.f15775(module0141.f9188())), var133);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var133);
            module0137.$g1605$.bind(module0244.f15775(module0141.f9188()), var133);
            module0141.$g1677$.bind(module0141.f9208(), var133);
            module0138.$g1619$.bind(module0244.f15778(module0141.f9188()), var133);
            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var133);
            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var133)), var133);
            module0139.$g1635$.bind(module0139.$g1646$.getDynamicValue(var133), var133);
            SubLObject var144 = var132;
            SubLObject var145 = (SubLObject)module0252.NIL;
            var145 = var144.first();
            while (module0252.NIL != var144) {
                final SubLObject var7_1219 = module0141.$g1674$.currentBinding(var133);
                try {
                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var133);
                    module0251.f16203(var145);
                }
                finally {
                    module0141.$g1674$.rebind(var7_1219, var133);
                }
                var144 = var144.rest();
                var145 = var144.first();
            }
        }
        finally {
            module0139.$g1635$.rebind(var143, var133);
            module0139.$g1648$.rebind(var142, var133);
            module0141.$g1665$.rebind(var141, var133);
            module0138.$g1619$.rebind(var140, var133);
            module0141.$g1677$.rebind(var139, var133);
            module0137.$g1605$.rebind(var138, var133);
            module0141.$g1674$.rebind(var137, var133);
            module0141.$g1672$.rebind(var136, var133);
            module0141.$g1671$.rebind(var135, var133);
            module0141.$g1670$.rebind(var134, var133);
        }
        return (SubLObject)module0252.NIL;
    }
    
    public static SubLObject f16301(final SubLObject var2, final SubLObject var132) {
        final SubLThread var133 = SubLProcess.currentSubLThread();
        SubLObject var134 = (SubLObject)module0252.NIL;
        final SubLObject var135 = module0141.$g1665$.currentBinding(var133);
        final SubLObject var136 = module0139.$g1648$.currentBinding(var133);
        final SubLObject var137 = module0139.$g1646$.currentBinding(var133);
        try {
            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var133);
            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var133)), var133);
            module0139.$g1646$.bind(module0139.f9007(), var133);
            final SubLObject var7_1220 = module0139.$g1647$.currentBinding(var133);
            try {
                module0139.$g1647$.bind(module0139.f9007(), var133);
                if (module0252.NIL != module0250.f16097()) {
                    f16356(var132);
                }
                else {
                    module0249.f16085(var132);
                }
                final SubLObject var7_1221 = module0139.$g1645$.currentBinding(var133);
                final SubLObject var8_1222 = module0141.$g1688$.currentBinding(var133);
                final SubLObject var9_1223 = module0141.$g1693$.currentBinding(var133);
                final SubLObject var138 = module0141.$g1664$.currentBinding(var133);
                try {
                    module0139.$g1645$.bind(module0139.$g1646$.getDynamicValue(var133), var133);
                    module0141.$g1688$.bind(var132, var133);
                    module0141.$g1693$.bind((SubLObject)module0252.$ic49$, var133);
                    module0141.$g1664$.bind((SubLObject)module0252.$ic46$, var133);
                    var134 = f16246(var2);
                }
                finally {
                    module0141.$g1664$.rebind(var138, var133);
                    module0141.$g1693$.rebind(var9_1223, var133);
                    module0141.$g1688$.rebind(var8_1222, var133);
                    module0139.$g1645$.rebind(var7_1221, var133);
                }
                module0139.f9011(module0139.$g1647$.getDynamicValue(var133));
            }
            finally {
                module0139.$g1647$.rebind(var7_1220, var133);
            }
            module0139.f9011(module0139.$g1646$.getDynamicValue(var133));
        }
        finally {
            module0139.$g1646$.rebind(var137, var133);
            module0139.$g1648$.rebind(var136, var133);
            module0141.$g1665$.rebind(var135, var133);
        }
        return var134;
    }
    
    public static SubLObject f16357(final SubLObject var1, final SubLObject var2, final SubLObject var132, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        assert module0252.NIL != module0137.f8885(var1) : var1;
        return f16352(module0244.f15769(var1), var2, var132, var3, var4);
    }
    
    public static SubLObject f16358(final SubLObject var1, final SubLObject var2, final SubLObject var132, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var133 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        SubLObject var134 = (SubLObject)module0252.NIL;
        final SubLObject var135 = module0141.$g1670$.currentBinding(var133);
        final SubLObject var136 = module0141.$g1671$.currentBinding(var133);
        final SubLObject var137 = module0141.$g1672$.currentBinding(var133);
        final SubLObject var138 = module0141.$g1674$.currentBinding(var133);
        final SubLObject var139 = module0137.$g1605$.currentBinding(var133);
        try {
            module0141.$g1670$.bind(var1, var133);
            module0141.$g1671$.bind(module0244.f15739(var1), var133);
            module0141.$g1672$.bind(module0244.f15746(var1), var133);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var133);
            module0137.$g1605$.bind(var1, var133);
            final SubLObject var140 = var3;
            final SubLObject var7_1224 = module0147.$g2095$.currentBinding(var133);
            final SubLObject var8_1225 = module0147.$g2094$.currentBinding(var133);
            final SubLObject var9_1226 = module0147.$g2096$.currentBinding(var133);
            try {
                module0147.$g2095$.bind(module0147.f9545(var140), var133);
                module0147.$g2094$.bind(module0147.f9546(var140), var133);
                module0147.$g2096$.bind(module0147.f9549(var140), var133);
                final SubLObject var141 = var4;
                final SubLObject var7_1225 = module0141.$g1714$.currentBinding(var133);
                final SubLObject var8_1226 = module0141.$g1715$.currentBinding(var133);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var141) ? var141 : module0141.f9283(), var133);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var141) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var133)), var133);
                    if (module0252.NIL != var141 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var141)) {
                        final SubLObject var142 = module0136.$g1591$.getDynamicValue(var133);
                        if (var142.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var141, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var142.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var141, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var142.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var141, (SubLObject)module0252.$ic4$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var133));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var141, (SubLObject)module0252.$ic4$);
                        }
                    }
                    final SubLObject var7_1226 = module0141.$g1710$.currentBinding(var133);
                    final SubLObject var8_1227 = module0141.$g1677$.currentBinding(var133);
                    final SubLObject var9_1227 = module0138.$g1619$.currentBinding(var133);
                    try {
                        module0141.$g1710$.bind(module0252.$ic9$, var133);
                        module0141.$g1677$.bind(module0141.f9208(), var133);
                        module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var133);
                        final SubLObject var143 = module0139.f9036();
                        final SubLObject var7_1227 = module0139.$g1635$.currentBinding(var133);
                        try {
                            module0139.$g1635$.bind((var143 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var133) : module0139.f9038(var143), var133);
                            final SubLObject var7_1228 = module0139.$g1636$.currentBinding(var133);
                            try {
                                module0139.$g1636$.bind((var143 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var133) : module0139.f9038(var143), var133);
                                final SubLObject var7_1229 = module0141.$g1685$.currentBinding(var133);
                                final SubLObject var8_1228 = module0141.$g1686$.currentBinding(var133);
                                final SubLObject var9_1228 = module0141.$g1683$.currentBinding(var133);
                                final SubLObject var10_1237 = module0141.$g1684$.currentBinding(var133);
                                final SubLObject var11_1238 = module0141.$g1674$.currentBinding(var133);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var133);
                                    final SubLObject var144 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var145 = (SubLObject)module0252.NIL;
                                    try {
                                        var145 = ReadWriteLocks.rw_lock_seize_read_lock(var144);
                                        var134 = f16359(var2, var132);
                                    }
                                    finally {
                                        if (module0252.NIL != var145) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var144);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_1238, var133);
                                    module0141.$g1684$.rebind(var10_1237, var133);
                                    module0141.$g1683$.rebind(var9_1228, var133);
                                    module0141.$g1686$.rebind(var8_1228, var133);
                                    module0141.$g1685$.rebind(var7_1229, var133);
                                }
                                if (var143 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var133));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_1228, var133);
                            }
                            if (var143 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var133));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_1227, var133);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_1227, var133);
                        module0141.$g1677$.rebind(var8_1227, var133);
                        module0141.$g1710$.rebind(var7_1226, var133);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_1226, var133);
                    module0141.$g1714$.rebind(var7_1225, var133);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_1226, var133);
                module0147.$g2094$.rebind(var8_1225, var133);
                module0147.$g2095$.rebind(var7_1224, var133);
            }
        }
        finally {
            module0137.$g1605$.rebind(var139, var133);
            module0141.$g1674$.rebind(var138, var133);
            module0141.$g1672$.rebind(var137, var133);
            module0141.$g1671$.rebind(var136, var133);
            module0141.$g1670$.rebind(var135, var133);
        }
        return var134;
    }
    
    public static SubLObject f16359(final SubLObject var2, final SubLObject var132) {
        final SubLThread var133 = SubLProcess.currentSubLThread();
        SubLObject var134 = (SubLObject)module0252.NIL;
        final SubLObject var135 = module0141.$g1665$.currentBinding(var133);
        final SubLObject var136 = module0139.$g1648$.currentBinding(var133);
        try {
            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var133);
            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var133)), var133);
            module0251.f16203(var2);
            final SubLObject var7_1240 = module0141.$g1683$.currentBinding(var133);
            try {
                module0141.$g1683$.bind((SubLObject)module0252.NIL, var133);
                if (module0252.NIL != module0077.f5302(var132)) {
                    final SubLObject var137 = module0077.f5333(var132);
                    SubLObject var138;
                    SubLObject var139;
                    SubLObject var140;
                    for (var138 = module0032.f1741(var137), var139 = (SubLObject)module0252.NIL, var139 = module0032.f1742(var138, var137); module0252.NIL == var134 && module0252.NIL == module0032.f1744(var138, var139); var139 = module0032.f1743(var139)) {
                        var140 = module0032.f1745(var138, var139);
                        if (module0252.NIL != module0032.f1746(var139, var140) && module0252.NIL == module0249.f16061(var140)) {
                            var134 = (SubLObject)module0252.T;
                        }
                    }
                }
                else if (var132.isList()) {
                    if (module0252.NIL == var134) {
                        SubLObject var141 = var132;
                        SubLObject var142 = (SubLObject)module0252.NIL;
                        var142 = var141.first();
                        while (module0252.NIL == var134 && module0252.NIL != var141) {
                            if (module0252.NIL == module0249.f16061(var142)) {
                                var134 = (SubLObject)module0252.T;
                            }
                            var141 = var141.rest();
                            var142 = var141.first();
                        }
                    }
                }
                else {
                    Errors.error((SubLObject)module0252.$ic56$, var132);
                }
            }
            finally {
                module0141.$g1683$.rebind(var7_1240, var133);
            }
        }
        finally {
            module0139.$g1648$.rebind(var136, var133);
            module0141.$g1665$.rebind(var135, var133);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0252.NIL == var134);
    }
    
    public static SubLObject f16360(final SubLObject var1, final SubLObject var132, final SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var133 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        final SubLObject var134 = module0137.f8917(var1);
        SubLObject var135 = (SubLObject)module0252.NIL;
        if (module0252.NIL != module0268.f17616(var134, var132, var2)) {
            final SubLObject var136 = var3;
            final SubLObject var137 = module0147.$g2095$.currentBinding(var133);
            final SubLObject var138 = module0147.$g2094$.currentBinding(var133);
            final SubLObject var139 = module0147.$g2096$.currentBinding(var133);
            try {
                module0147.$g2095$.bind(module0147.f9545(var136), var133);
                module0147.$g2094$.bind(module0147.f9546(var136), var133);
                module0147.$g2096$.bind(module0147.f9549(var136), var133);
                if (module0252.NIL != module0077.f5302(var132)) {
                    final SubLObject var140 = module0077.f5333(var132);
                    SubLObject var141;
                    SubLObject var142;
                    SubLObject var143;
                    for (var141 = module0032.f1741(var140), var142 = (SubLObject)module0252.NIL, var142 = module0032.f1742(var141, var140); module0252.NIL == var135 && module0252.NIL == module0032.f1744(var141, var142); var142 = module0032.f1743(var142)) {
                        var143 = module0032.f1745(var141, var142);
                        if (module0252.NIL != module0032.f1746(var142, var143)) {
                            var135 = module0268.f17617(var134, var143, var2, (SubLObject)module0252.UNPROVIDED);
                        }
                    }
                }
                else if (var132.isList()) {
                    if (module0252.NIL == var135) {
                        SubLObject var144;
                        SubLObject var145;
                        for (var144 = var132, var145 = (SubLObject)module0252.NIL, var145 = var144.first(); module0252.NIL == var135 && module0252.NIL != var144; var135 = module0268.f17617(var134, var145, var2, (SubLObject)module0252.UNPROVIDED), var144 = var144.rest(), var145 = var144.first()) {}
                    }
                }
                else {
                    Errors.error((SubLObject)module0252.$ic56$, var132);
                }
            }
            finally {
                module0147.$g2096$.rebind(var139, var133);
                module0147.$g2094$.rebind(var138, var133);
                module0147.$g2095$.rebind(var137, var133);
            }
        }
        else {
            final SubLObject var146 = module0141.$g1670$.currentBinding(var133);
            final SubLObject var147 = module0141.$g1671$.currentBinding(var133);
            final SubLObject var148 = module0141.$g1672$.currentBinding(var133);
            final SubLObject var149 = module0141.$g1674$.currentBinding(var133);
            final SubLObject var150 = module0137.$g1605$.currentBinding(var133);
            try {
                module0141.$g1670$.bind(var1, var133);
                module0141.$g1671$.bind(module0244.f15739(var1), var133);
                module0141.$g1672$.bind(module0244.f15746(var1), var133);
                module0141.$g1674$.bind((SubLObject)module0252.NIL, var133);
                module0137.$g1605$.bind(var1, var133);
                final SubLObject var151 = var3;
                final SubLObject var7_1246 = module0147.$g2095$.currentBinding(var133);
                final SubLObject var8_1247 = module0147.$g2094$.currentBinding(var133);
                final SubLObject var9_1248 = module0147.$g2096$.currentBinding(var133);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var151), var133);
                    module0147.$g2094$.bind(module0147.f9546(var151), var133);
                    module0147.$g2096$.bind(module0147.f9549(var151), var133);
                    final SubLObject var152 = var4;
                    final SubLObject var7_1247 = module0141.$g1714$.currentBinding(var133);
                    final SubLObject var8_1248 = module0141.$g1715$.currentBinding(var133);
                    try {
                        module0141.$g1714$.bind((module0252.NIL != var152) ? var152 : module0141.f9283(), var133);
                        module0141.$g1715$.bind((SubLObject)((module0252.NIL != var152) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var133)), var133);
                        if (module0252.NIL != var152 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var152)) {
                            final SubLObject var153 = module0136.$g1591$.getDynamicValue(var133);
                            if (var153.eql((SubLObject)module0252.$ic2$)) {
                                module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var152, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                            }
                            else if (var153.eql((SubLObject)module0252.$ic5$)) {
                                module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var152, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                            }
                            else if (var153.eql((SubLObject)module0252.$ic7$)) {
                                Errors.warn((SubLObject)module0252.$ic3$, var152, (SubLObject)module0252.$ic4$);
                            }
                            else {
                                Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var133));
                                Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var152, (SubLObject)module0252.$ic4$);
                            }
                        }
                        final SubLObject var7_1248 = module0141.$g1710$.currentBinding(var133);
                        final SubLObject var8_1249 = module0141.$g1677$.currentBinding(var133);
                        final SubLObject var9_1249 = module0138.$g1619$.currentBinding(var133);
                        try {
                            module0141.$g1710$.bind(module0252.$ic9$, var133);
                            module0141.$g1677$.bind(module0141.f9208(), var133);
                            module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var133);
                            final SubLObject var154 = module0139.f9036();
                            final SubLObject var7_1249 = module0139.$g1635$.currentBinding(var133);
                            try {
                                module0139.$g1635$.bind((var154 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var133) : module0139.f9038(var154), var133);
                                final SubLObject var7_1250 = module0139.$g1636$.currentBinding(var133);
                                try {
                                    module0139.$g1636$.bind((var154 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var133) : module0139.f9038(var154), var133);
                                    final SubLObject var7_1251 = module0141.$g1685$.currentBinding(var133);
                                    final SubLObject var8_1250 = module0141.$g1686$.currentBinding(var133);
                                    final SubLObject var9_1250 = module0141.$g1683$.currentBinding(var133);
                                    final SubLObject var10_1259 = module0141.$g1684$.currentBinding(var133);
                                    final SubLObject var11_1260 = module0141.$g1674$.currentBinding(var133);
                                    try {
                                        module0141.$g1685$.bind((SubLObject)module0252.NIL, var133);
                                        module0141.$g1686$.bind((SubLObject)module0252.NIL, var133);
                                        module0141.$g1683$.bind((SubLObject)module0252.NIL, var133);
                                        module0141.$g1684$.bind((SubLObject)module0252.NIL, var133);
                                        module0141.$g1674$.bind((SubLObject)module0252.NIL, var133);
                                        final SubLObject var155 = module0138.$g1626$.getGlobalValue();
                                        SubLObject var156 = (SubLObject)module0252.NIL;
                                        try {
                                            var156 = ReadWriteLocks.rw_lock_seize_read_lock(var155);
                                            var135 = f16361(var132, var2);
                                        }
                                        finally {
                                            if (module0252.NIL != var156) {
                                                ReadWriteLocks.rw_lock_release_read_lock(var155);
                                            }
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var11_1260, var133);
                                        module0141.$g1684$.rebind(var10_1259, var133);
                                        module0141.$g1683$.rebind(var9_1250, var133);
                                        module0141.$g1686$.rebind(var8_1250, var133);
                                        module0141.$g1685$.rebind(var7_1251, var133);
                                    }
                                    if (var154 == module0252.$ic12$) {
                                        module0139.f9012(module0139.$g1636$.getDynamicValue(var133));
                                    }
                                }
                                finally {
                                    module0139.$g1636$.rebind(var7_1250, var133);
                                }
                                if (var154 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1635$.getDynamicValue(var133));
                                }
                            }
                            finally {
                                module0139.$g1635$.rebind(var7_1249, var133);
                            }
                        }
                        finally {
                            module0138.$g1619$.rebind(var9_1249, var133);
                            module0141.$g1677$.rebind(var8_1249, var133);
                            module0141.$g1710$.rebind(var7_1248, var133);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var8_1248, var133);
                        module0141.$g1714$.rebind(var7_1247, var133);
                    }
                }
                finally {
                    module0147.$g2096$.rebind(var9_1248, var133);
                    module0147.$g2094$.rebind(var8_1247, var133);
                    module0147.$g2095$.rebind(var7_1246, var133);
                }
            }
            finally {
                module0137.$g1605$.rebind(var150, var133);
                module0141.$g1674$.rebind(var149, var133);
                module0141.$g1672$.rebind(var148, var133);
                module0141.$g1671$.rebind(var147, var133);
                module0141.$g1670$.rebind(var146, var133);
            }
        }
        return var135;
    }
    
    public static SubLObject f16362(final SubLObject var1, final SubLObject var132, final SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var133 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        SubLObject var134 = (SubLObject)module0252.NIL;
        final SubLObject var135 = module0141.$g1670$.currentBinding(var133);
        final SubLObject var136 = module0141.$g1671$.currentBinding(var133);
        final SubLObject var137 = module0141.$g1672$.currentBinding(var133);
        final SubLObject var138 = module0141.$g1674$.currentBinding(var133);
        final SubLObject var139 = module0137.$g1605$.currentBinding(var133);
        try {
            module0141.$g1670$.bind(var1, var133);
            module0141.$g1671$.bind(module0244.f15739(var1), var133);
            module0141.$g1672$.bind(module0244.f15746(var1), var133);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var133);
            module0137.$g1605$.bind(var1, var133);
            final SubLObject var140 = var3;
            final SubLObject var7_1261 = module0147.$g2095$.currentBinding(var133);
            final SubLObject var8_1262 = module0147.$g2094$.currentBinding(var133);
            final SubLObject var9_1263 = module0147.$g2096$.currentBinding(var133);
            try {
                module0147.$g2095$.bind(module0147.f9545(var140), var133);
                module0147.$g2094$.bind(module0147.f9546(var140), var133);
                module0147.$g2096$.bind(module0147.f9549(var140), var133);
                final SubLObject var141 = var4;
                final SubLObject var7_1262 = module0141.$g1714$.currentBinding(var133);
                final SubLObject var8_1263 = module0141.$g1715$.currentBinding(var133);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var141) ? var141 : module0141.f9284(), var133);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var141) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var133)), var133);
                    if (module0252.NIL != var141 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9281(var141)) {
                        final SubLObject var142 = module0136.$g1591$.getDynamicValue(var133);
                        if (var142.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var141, (SubLObject)module0252.$ic13$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var142.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var141, (SubLObject)module0252.$ic13$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var142.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var141, (SubLObject)module0252.$ic13$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var133));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var141, (SubLObject)module0252.$ic13$);
                        }
                    }
                    final SubLObject var7_1263 = module0141.$g1710$.currentBinding(var133);
                    final SubLObject var8_1264 = module0141.$g1677$.currentBinding(var133);
                    final SubLObject var9_1264 = module0138.$g1619$.currentBinding(var133);
                    try {
                        module0141.$g1710$.bind(module0252.$ic14$, var133);
                        module0141.$g1677$.bind(module0141.f9210(), var133);
                        module0138.$g1619$.bind(module0244.f15780(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var133);
                        final SubLObject var143 = module0139.f9036();
                        final SubLObject var7_1264 = module0139.$g1635$.currentBinding(var133);
                        try {
                            module0139.$g1635$.bind((var143 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var133) : module0139.f9038(var143), var133);
                            final SubLObject var7_1265 = module0139.$g1636$.currentBinding(var133);
                            try {
                                module0139.$g1636$.bind((var143 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var133) : module0139.f9038(var143), var133);
                                final SubLObject var7_1266 = module0141.$g1685$.currentBinding(var133);
                                final SubLObject var8_1265 = module0141.$g1686$.currentBinding(var133);
                                final SubLObject var9_1265 = module0141.$g1683$.currentBinding(var133);
                                final SubLObject var10_1274 = module0141.$g1684$.currentBinding(var133);
                                final SubLObject var11_1275 = module0141.$g1674$.currentBinding(var133);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var133);
                                    final SubLObject var144 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var145 = (SubLObject)module0252.NIL;
                                    try {
                                        var145 = ReadWriteLocks.rw_lock_seize_read_lock(var144);
                                        var134 = f16361(var132, var2);
                                    }
                                    finally {
                                        if (module0252.NIL != var145) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var144);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_1275, var133);
                                    module0141.$g1684$.rebind(var10_1274, var133);
                                    module0141.$g1683$.rebind(var9_1265, var133);
                                    module0141.$g1686$.rebind(var8_1265, var133);
                                    module0141.$g1685$.rebind(var7_1266, var133);
                                }
                                if (var143 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var133));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_1265, var133);
                            }
                            if (var143 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var133));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_1264, var133);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_1264, var133);
                        module0141.$g1677$.rebind(var8_1264, var133);
                        module0141.$g1710$.rebind(var7_1263, var133);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_1263, var133);
                    module0141.$g1714$.rebind(var7_1262, var133);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_1263, var133);
                module0147.$g2094$.rebind(var8_1262, var133);
                module0147.$g2095$.rebind(var7_1261, var133);
            }
        }
        finally {
            module0137.$g1605$.rebind(var139, var133);
            module0141.$g1674$.rebind(var138, var133);
            module0141.$g1672$.rebind(var137, var133);
            module0141.$g1671$.rebind(var136, var133);
            module0141.$g1670$.rebind(var135, var133);
        }
        return var134;
    }
    
    public static SubLObject f16363(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0141.$g1670$.currentBinding(var3);
        final SubLObject var5 = module0141.$g1671$.currentBinding(var3);
        final SubLObject var6 = module0141.$g1672$.currentBinding(var3);
        final SubLObject var7 = module0141.$g1674$.currentBinding(var3);
        final SubLObject var8 = module0137.$g1605$.currentBinding(var3);
        final SubLObject var9 = module0141.$g1714$.currentBinding(var3);
        final SubLObject var10 = module0141.$g1677$.currentBinding(var3);
        final SubLObject var11 = module0138.$g1619$.currentBinding(var3);
        final SubLObject var12 = module0141.$g1665$.currentBinding(var3);
        final SubLObject var13 = module0139.$g1648$.currentBinding(var3);
        final SubLObject var14 = module0139.$g1635$.currentBinding(var3);
        try {
            module0141.$g1670$.bind(module0244.f15775(module0141.f9188()), var3);
            module0141.$g1671$.bind(module0244.f15739(module0244.f15775(module0141.f9188())), var3);
            module0141.$g1672$.bind(module0244.f15746(module0244.f15775(module0141.f9188())), var3);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var3);
            module0137.$g1605$.bind(module0244.f15775(module0141.f9188()), var3);
            module0141.$g1714$.bind(module0141.f9293(), var3);
            module0141.$g1677$.bind(module0141.f9208(), var3);
            module0138.$g1619$.bind(module0244.f15778(module0141.f9188()), var3);
            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var3);
            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var3)), var3);
            module0139.$g1635$.bind(module0139.$g1646$.getDynamicValue(var3), var3);
            module0251.f16203(var2);
        }
        finally {
            module0139.$g1635$.rebind(var14, var3);
            module0139.$g1648$.rebind(var13, var3);
            module0141.$g1665$.rebind(var12, var3);
            module0138.$g1619$.rebind(var11, var3);
            module0141.$g1677$.rebind(var10, var3);
            module0141.$g1714$.rebind(var9, var3);
            module0137.$g1605$.rebind(var8, var3);
            module0141.$g1674$.rebind(var7, var3);
            module0141.$g1672$.rebind(var6, var3);
            module0141.$g1671$.rebind(var5, var3);
            module0141.$g1670$.rebind(var4, var3);
        }
        return (SubLObject)module0252.NIL;
    }
    
    public static SubLObject f16361(final SubLObject var132, final SubLObject var2) {
        final SubLThread var133 = SubLProcess.currentSubLThread();
        SubLObject var134 = (SubLObject)module0252.NIL;
        final SubLObject var135 = module0141.$g1664$.currentBinding(var133);
        final SubLObject var136 = module0141.$g1665$.currentBinding(var133);
        final SubLObject var137 = module0139.$g1648$.currentBinding(var133);
        final SubLObject var138 = module0141.$g1688$.currentBinding(var133);
        try {
            module0141.$g1664$.bind((SubLObject)module0252.$ic46$, var133);
            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var133);
            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var133)), var133);
            module0141.$g1688$.bind(var2, var133);
            if (module0252.NIL != module0250.f16097()) {
                final SubLObject var7_1276 = module0139.$g1646$.currentBinding(var133);
                try {
                    module0139.$g1646$.bind(module0139.f9007(), var133);
                    f16363(var2);
                    final SubLObject var7_1277 = module0139.$g1645$.currentBinding(var133);
                    final SubLObject var8_1278 = module0141.$g1693$.currentBinding(var133);
                    try {
                        module0139.$g1645$.bind(module0139.$g1646$.getDynamicValue(var133), var133);
                        module0141.$g1693$.bind((SubLObject)module0252.$ic49$, var133);
                        if (module0252.NIL != module0077.f5302(var132)) {
                            final SubLObject var139 = module0077.f5333(var132);
                            SubLObject var140;
                            SubLObject var141;
                            SubLObject var142;
                            for (var140 = module0032.f1741(var139), var141 = (SubLObject)module0252.NIL, var141 = module0032.f1742(var140, var139); module0252.NIL == module0141.$g1685$.getDynamicValue(var133) && module0252.NIL == module0032.f1744(var140, var141); var141 = module0032.f1743(var141)) {
                                var142 = module0032.f1745(var140, var141);
                                if (module0252.NIL != module0032.f1746(var141, var142)) {
                                    var134 = f16246(var142);
                                }
                            }
                        }
                        else if (var132.isList()) {
                            if (module0252.NIL == module0141.$g1685$.getDynamicValue(var133)) {
                                SubLObject var143 = var132;
                                SubLObject var144 = (SubLObject)module0252.NIL;
                                var144 = var143.first();
                                while (module0252.NIL == module0141.$g1685$.getDynamicValue(var133) && module0252.NIL != var143) {
                                    var134 = f16246(var144);
                                    var143 = var143.rest();
                                    var144 = var143.first();
                                }
                            }
                        }
                        else {
                            Errors.error((SubLObject)module0252.$ic56$, var132);
                        }
                    }
                    finally {
                        module0141.$g1693$.rebind(var8_1278, var133);
                        module0139.$g1645$.rebind(var7_1277, var133);
                    }
                    module0139.f9011(module0139.$g1646$.getDynamicValue(var133));
                }
                finally {
                    module0139.$g1646$.rebind(var7_1276, var133);
                }
            }
            else {
                final SubLObject var7_1278 = module0141.$g1693$.currentBinding(var133);
                try {
                    module0141.$g1693$.bind((SubLObject)module0252.$ic47$, var133);
                    if (module0252.NIL != module0077.f5302(var132)) {
                        final SubLObject var145 = module0077.f5333(var132);
                        SubLObject var144;
                        SubLObject var146;
                        SubLObject var147;
                        for (var146 = module0032.f1741(var145), var147 = (SubLObject)module0252.NIL, var147 = module0032.f1742(var146, var145); module0252.NIL == module0141.$g1685$.getDynamicValue(var133) && module0252.NIL == module0032.f1744(var146, var147); var147 = module0032.f1743(var147)) {
                            var144 = module0032.f1745(var146, var147);
                            if (module0252.NIL != module0032.f1746(var147, var144)) {
                                var134 = f16246(var144);
                            }
                        }
                    }
                    else if (var132.isList()) {
                        if (module0252.NIL == module0141.$g1685$.getDynamicValue(var133)) {
                            SubLObject var148 = var132;
                            SubLObject var149 = (SubLObject)module0252.NIL;
                            var149 = var148.first();
                            while (module0252.NIL == module0141.$g1685$.getDynamicValue(var133) && module0252.NIL != var148) {
                                var134 = f16246(var149);
                                var148 = var148.rest();
                                var149 = var148.first();
                            }
                        }
                    }
                    else {
                        Errors.error((SubLObject)module0252.$ic56$, var132);
                    }
                }
                finally {
                    module0141.$g1693$.rebind(var7_1278, var133);
                }
            }
        }
        finally {
            module0141.$g1688$.rebind(var138, var133);
            module0139.$g1648$.rebind(var137, var133);
            module0141.$g1665$.rebind(var136, var133);
            module0141.$g1664$.rebind(var135, var133);
        }
        return var134;
    }
    
    public static SubLObject f16364(final SubLObject var1, final SubLObject var132, final SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        assert module0252.NIL != module0137.f8885(var1) : var1;
        return f16360(module0244.f15769(var1), var132, var2, var3, var4);
    }
    
    public static SubLObject f16365(final SubLObject var1, final SubLObject var132, final SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var133 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        SubLObject var134 = (SubLObject)module0252.NIL;
        final SubLObject var135 = module0141.$g1670$.currentBinding(var133);
        final SubLObject var136 = module0141.$g1671$.currentBinding(var133);
        final SubLObject var137 = module0141.$g1672$.currentBinding(var133);
        final SubLObject var138 = module0141.$g1674$.currentBinding(var133);
        final SubLObject var139 = module0137.$g1605$.currentBinding(var133);
        try {
            module0141.$g1670$.bind(var1, var133);
            module0141.$g1671$.bind(module0244.f15739(var1), var133);
            module0141.$g1672$.bind(module0244.f15746(var1), var133);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var133);
            module0137.$g1605$.bind(var1, var133);
            final SubLObject var140 = var3;
            final SubLObject var7_1281 = module0147.$g2095$.currentBinding(var133);
            final SubLObject var8_1282 = module0147.$g2094$.currentBinding(var133);
            final SubLObject var9_1283 = module0147.$g2096$.currentBinding(var133);
            try {
                module0147.$g2095$.bind(module0147.f9545(var140), var133);
                module0147.$g2094$.bind(module0147.f9546(var140), var133);
                module0147.$g2096$.bind(module0147.f9549(var140), var133);
                final SubLObject var141 = var4;
                final SubLObject var7_1282 = module0141.$g1714$.currentBinding(var133);
                final SubLObject var8_1283 = module0141.$g1715$.currentBinding(var133);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var141) ? var141 : module0141.f9283(), var133);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var141) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var133)), var133);
                    if (module0252.NIL != var141 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var141)) {
                        final SubLObject var142 = module0136.$g1591$.getDynamicValue(var133);
                        if (var142.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var141, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var142.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var141, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var142.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var141, (SubLObject)module0252.$ic4$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var133));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var141, (SubLObject)module0252.$ic4$);
                        }
                    }
                    final SubLObject var7_1283 = module0141.$g1710$.currentBinding(var133);
                    final SubLObject var8_1284 = module0141.$g1677$.currentBinding(var133);
                    final SubLObject var9_1284 = module0138.$g1619$.currentBinding(var133);
                    try {
                        module0141.$g1710$.bind(module0252.$ic9$, var133);
                        module0141.$g1677$.bind(module0141.f9208(), var133);
                        module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var133);
                        final SubLObject var143 = module0139.f9036();
                        final SubLObject var7_1284 = module0139.$g1635$.currentBinding(var133);
                        try {
                            module0139.$g1635$.bind((var143 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var133) : module0139.f9038(var143), var133);
                            final SubLObject var7_1285 = module0139.$g1636$.currentBinding(var133);
                            try {
                                module0139.$g1636$.bind((var143 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var133) : module0139.f9038(var143), var133);
                                final SubLObject var7_1286 = module0141.$g1685$.currentBinding(var133);
                                final SubLObject var8_1285 = module0141.$g1686$.currentBinding(var133);
                                final SubLObject var9_1285 = module0141.$g1683$.currentBinding(var133);
                                final SubLObject var10_1294 = module0141.$g1684$.currentBinding(var133);
                                final SubLObject var11_1295 = module0141.$g1674$.currentBinding(var133);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var133);
                                    final SubLObject var144 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var145 = (SubLObject)module0252.NIL;
                                    try {
                                        var145 = ReadWriteLocks.rw_lock_seize_read_lock(var144);
                                        var134 = f16366(var132, var2);
                                    }
                                    finally {
                                        if (module0252.NIL != var145) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var144);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_1295, var133);
                                    module0141.$g1684$.rebind(var10_1294, var133);
                                    module0141.$g1683$.rebind(var9_1285, var133);
                                    module0141.$g1686$.rebind(var8_1285, var133);
                                    module0141.$g1685$.rebind(var7_1286, var133);
                                }
                                if (var143 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var133));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_1285, var133);
                            }
                            if (var143 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var133));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_1284, var133);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_1284, var133);
                        module0141.$g1677$.rebind(var8_1284, var133);
                        module0141.$g1710$.rebind(var7_1283, var133);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_1283, var133);
                    module0141.$g1714$.rebind(var7_1282, var133);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_1283, var133);
                module0147.$g2094$.rebind(var8_1282, var133);
                module0147.$g2095$.rebind(var7_1281, var133);
            }
        }
        finally {
            module0137.$g1605$.rebind(var139, var133);
            module0141.$g1674$.rebind(var138, var133);
            module0141.$g1672$.rebind(var137, var133);
            module0141.$g1671$.rebind(var136, var133);
            module0141.$g1670$.rebind(var135, var133);
        }
        return var134;
    }
    
    public static SubLObject f16367(final SubLObject var1, final SubLObject var132, final SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var133 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        SubLObject var134 = (SubLObject)module0252.NIL;
        final SubLObject var135 = module0141.$g1670$.currentBinding(var133);
        final SubLObject var136 = module0141.$g1671$.currentBinding(var133);
        final SubLObject var137 = module0141.$g1672$.currentBinding(var133);
        final SubLObject var138 = module0141.$g1674$.currentBinding(var133);
        final SubLObject var139 = module0137.$g1605$.currentBinding(var133);
        try {
            module0141.$g1670$.bind(var1, var133);
            module0141.$g1671$.bind(module0244.f15739(var1), var133);
            module0141.$g1672$.bind(module0244.f15746(var1), var133);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var133);
            module0137.$g1605$.bind(var1, var133);
            final SubLObject var140 = var3;
            final SubLObject var7_1296 = module0147.$g2095$.currentBinding(var133);
            final SubLObject var8_1297 = module0147.$g2094$.currentBinding(var133);
            final SubLObject var9_1298 = module0147.$g2096$.currentBinding(var133);
            try {
                module0147.$g2095$.bind(module0147.f9545(var140), var133);
                module0147.$g2094$.bind(module0147.f9546(var140), var133);
                module0147.$g2096$.bind(module0147.f9549(var140), var133);
                final SubLObject var141 = var4;
                final SubLObject var7_1297 = module0141.$g1714$.currentBinding(var133);
                final SubLObject var8_1298 = module0141.$g1715$.currentBinding(var133);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var141) ? var141 : module0141.f9284(), var133);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var141) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var133)), var133);
                    if (module0252.NIL != var141 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9281(var141)) {
                        final SubLObject var142 = module0136.$g1591$.getDynamicValue(var133);
                        if (var142.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var141, (SubLObject)module0252.$ic13$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var142.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var141, (SubLObject)module0252.$ic13$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var142.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var141, (SubLObject)module0252.$ic13$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var133));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var141, (SubLObject)module0252.$ic13$);
                        }
                    }
                    final SubLObject var7_1298 = module0141.$g1710$.currentBinding(var133);
                    final SubLObject var8_1299 = module0141.$g1677$.currentBinding(var133);
                    final SubLObject var9_1299 = module0138.$g1619$.currentBinding(var133);
                    try {
                        module0141.$g1710$.bind(module0252.$ic14$, var133);
                        module0141.$g1677$.bind(module0141.f9208(), var133);
                        module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var133);
                        final SubLObject var143 = module0139.f9036();
                        final SubLObject var7_1299 = module0139.$g1635$.currentBinding(var133);
                        try {
                            module0139.$g1635$.bind((var143 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var133) : module0139.f9038(var143), var133);
                            final SubLObject var7_1300 = module0139.$g1636$.currentBinding(var133);
                            try {
                                module0139.$g1636$.bind((var143 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var133) : module0139.f9038(var143), var133);
                                final SubLObject var7_1301 = module0141.$g1685$.currentBinding(var133);
                                final SubLObject var8_1300 = module0141.$g1686$.currentBinding(var133);
                                final SubLObject var9_1300 = module0141.$g1683$.currentBinding(var133);
                                final SubLObject var10_1309 = module0141.$g1684$.currentBinding(var133);
                                final SubLObject var11_1310 = module0141.$g1674$.currentBinding(var133);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var133);
                                    final SubLObject var144 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var145 = (SubLObject)module0252.NIL;
                                    try {
                                        var145 = ReadWriteLocks.rw_lock_seize_read_lock(var144);
                                        var134 = f16366(var132, var2);
                                    }
                                    finally {
                                        if (module0252.NIL != var145) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var144);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_1310, var133);
                                    module0141.$g1684$.rebind(var10_1309, var133);
                                    module0141.$g1683$.rebind(var9_1300, var133);
                                    module0141.$g1686$.rebind(var8_1300, var133);
                                    module0141.$g1685$.rebind(var7_1301, var133);
                                }
                                if (var143 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var133));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_1300, var133);
                            }
                            if (var143 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var133));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_1299, var133);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_1299, var133);
                        module0141.$g1677$.rebind(var8_1299, var133);
                        module0141.$g1710$.rebind(var7_1298, var133);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_1298, var133);
                    module0141.$g1714$.rebind(var7_1297, var133);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_1298, var133);
                module0147.$g2094$.rebind(var8_1297, var133);
                module0147.$g2095$.rebind(var7_1296, var133);
            }
        }
        finally {
            module0137.$g1605$.rebind(var139, var133);
            module0141.$g1674$.rebind(var138, var133);
            module0141.$g1672$.rebind(var137, var133);
            module0141.$g1671$.rebind(var136, var133);
            module0141.$g1670$.rebind(var135, var133);
        }
        return var134;
    }
    
    public static SubLObject f16368(final SubLObject var1, final SubLObject var132, final SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var133 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        SubLObject var134 = (SubLObject)module0252.NIL;
        final SubLObject var135 = module0141.$g1670$.currentBinding(var133);
        final SubLObject var136 = module0141.$g1671$.currentBinding(var133);
        final SubLObject var137 = module0141.$g1672$.currentBinding(var133);
        final SubLObject var138 = module0141.$g1674$.currentBinding(var133);
        final SubLObject var139 = module0137.$g1605$.currentBinding(var133);
        try {
            module0141.$g1670$.bind(var1, var133);
            module0141.$g1671$.bind(module0244.f15739(var1), var133);
            module0141.$g1672$.bind(module0244.f15746(var1), var133);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var133);
            module0137.$g1605$.bind(var1, var133);
            final SubLObject var140 = var3;
            final SubLObject var7_1311 = module0147.$g2095$.currentBinding(var133);
            final SubLObject var8_1312 = module0147.$g2094$.currentBinding(var133);
            final SubLObject var9_1313 = module0147.$g2096$.currentBinding(var133);
            try {
                module0147.$g2095$.bind(module0147.f9545(var140), var133);
                module0147.$g2094$.bind(module0147.f9546(var140), var133);
                module0147.$g2096$.bind(module0147.f9549(var140), var133);
                final SubLObject var141 = var4;
                final SubLObject var7_1312 = module0141.$g1714$.currentBinding(var133);
                final SubLObject var8_1313 = module0141.$g1715$.currentBinding(var133);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var141) ? var141 : module0141.f9284(), var133);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var141) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var133)), var133);
                    if (module0252.NIL != var141 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9281(var141)) {
                        final SubLObject var142 = module0136.$g1591$.getDynamicValue(var133);
                        if (var142.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var141, (SubLObject)module0252.$ic13$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var142.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var141, (SubLObject)module0252.$ic13$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var142.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var141, (SubLObject)module0252.$ic13$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var133));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var141, (SubLObject)module0252.$ic13$);
                        }
                    }
                    final SubLObject var7_1313 = module0141.$g1710$.currentBinding(var133);
                    final SubLObject var8_1314 = module0141.$g1677$.currentBinding(var133);
                    final SubLObject var9_1314 = module0138.$g1619$.currentBinding(var133);
                    try {
                        module0141.$g1710$.bind(module0252.$ic14$, var133);
                        module0141.$g1677$.bind(module0141.f9210(), var133);
                        module0138.$g1619$.bind(module0244.f15780(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var133);
                        final SubLObject var143 = module0139.f9036();
                        final SubLObject var7_1314 = module0139.$g1635$.currentBinding(var133);
                        try {
                            module0139.$g1635$.bind((var143 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var133) : module0139.f9038(var143), var133);
                            final SubLObject var7_1315 = module0139.$g1636$.currentBinding(var133);
                            try {
                                module0139.$g1636$.bind((var143 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var133) : module0139.f9038(var143), var133);
                                final SubLObject var7_1316 = module0141.$g1685$.currentBinding(var133);
                                final SubLObject var8_1315 = module0141.$g1686$.currentBinding(var133);
                                final SubLObject var9_1315 = module0141.$g1683$.currentBinding(var133);
                                final SubLObject var10_1324 = module0141.$g1684$.currentBinding(var133);
                                final SubLObject var11_1325 = module0141.$g1674$.currentBinding(var133);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var133);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var133);
                                    final SubLObject var144 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var145 = (SubLObject)module0252.NIL;
                                    try {
                                        var145 = ReadWriteLocks.rw_lock_seize_read_lock(var144);
                                        var134 = f16366(var132, var2);
                                    }
                                    finally {
                                        if (module0252.NIL != var145) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var144);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_1325, var133);
                                    module0141.$g1684$.rebind(var10_1324, var133);
                                    module0141.$g1683$.rebind(var9_1315, var133);
                                    module0141.$g1686$.rebind(var8_1315, var133);
                                    module0141.$g1685$.rebind(var7_1316, var133);
                                }
                                if (var143 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var133));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_1315, var133);
                            }
                            if (var143 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var133));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_1314, var133);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_1314, var133);
                        module0141.$g1677$.rebind(var8_1314, var133);
                        module0141.$g1710$.rebind(var7_1313, var133);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_1313, var133);
                    module0141.$g1714$.rebind(var7_1312, var133);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_1313, var133);
                module0147.$g2094$.rebind(var8_1312, var133);
                module0147.$g2095$.rebind(var7_1311, var133);
            }
        }
        finally {
            module0137.$g1605$.rebind(var139, var133);
            module0141.$g1674$.rebind(var138, var133);
            module0141.$g1672$.rebind(var137, var133);
            module0141.$g1671$.rebind(var136, var133);
            module0141.$g1670$.rebind(var135, var133);
        }
        return var134;
    }
    
    public static SubLObject f16366(final SubLObject var132, final SubLObject var2) {
        final SubLThread var133 = SubLProcess.currentSubLThread();
        SubLObject var134 = (SubLObject)module0252.NIL;
        final SubLObject var135 = module0141.$g1665$.currentBinding(var133);
        final SubLObject var136 = module0139.$g1648$.currentBinding(var133);
        try {
            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var133);
            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var133)), var133);
            SubLObject var137 = var132;
            SubLObject var138 = (SubLObject)module0252.NIL;
            var138 = var137.first();
            while (module0252.NIL != var137) {
                final SubLObject var7_1327 = module0141.$g1683$.currentBinding(var133);
                final SubLObject var8_1328 = module0141.$g1674$.currentBinding(var133);
                try {
                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var133);
                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var133);
                    module0251.f16203(var138);
                }
                finally {
                    module0141.$g1674$.rebind(var8_1328, var133);
                    module0141.$g1683$.rebind(var7_1327, var133);
                }
                var137 = var137.rest();
                var138 = var137.first();
            }
            final SubLObject var7_1328 = module0138.$g1619$.currentBinding(var133);
            try {
                module0138.$g1619$.bind(module0138.f8980(), var133);
                module0251.f16211(var2);
            }
            finally {
                module0138.$g1619$.rebind(var7_1328, var133);
            }
            if (module0252.NIL != module0077.f5302(var132)) {
                final SubLObject var139 = module0077.f5333(var132);
                SubLObject var140;
                SubLObject var141;
                SubLObject var142;
                for (var140 = module0032.f1741(var139), var141 = (SubLObject)module0252.NIL, var141 = module0032.f1742(var140, var139); module0252.NIL == var134 && module0252.NIL == module0032.f1744(var140, var141); var141 = module0032.f1743(var141)) {
                    var142 = module0032.f1745(var140, var141);
                    if (module0252.NIL != module0032.f1746(var141, var142) && module0252.NIL != module0249.f16061(var142)) {
                        var134 = (SubLObject)module0252.T;
                    }
                }
            }
            else if (var132.isList()) {
                if (module0252.NIL == var134) {
                    SubLObject var143 = var132;
                    SubLObject var144 = (SubLObject)module0252.NIL;
                    var144 = var143.first();
                    while (module0252.NIL == var134 && module0252.NIL != var143) {
                        if (module0252.NIL != module0249.f16061(var144)) {
                            var134 = (SubLObject)module0252.T;
                        }
                        var143 = var143.rest();
                        var144 = var143.first();
                    }
                }
            }
            else {
                Errors.error((SubLObject)module0252.$ic56$, var132);
            }
        }
        finally {
            module0139.$g1648$.rebind(var136, var133);
            module0141.$g1665$.rebind(var135, var133);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0252.NIL == var134);
    }
    
    public static SubLObject f16369(final SubLObject var1, final SubLObject var132, final SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        assert module0252.NIL != module0137.f8885(var1) : var1;
        return f16365(module0244.f15769(var1), var132, var2, var3, var4);
    }
    
    public static SubLObject f16370(final SubLObject var1, final SubLObject var1330, final SubLObject var1331, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var1332 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        SubLObject var1333 = (SubLObject)module0252.NIL;
        final SubLObject var1334 = module0141.$g1670$.currentBinding(var1332);
        final SubLObject var1335 = module0141.$g1671$.currentBinding(var1332);
        final SubLObject var1336 = module0141.$g1672$.currentBinding(var1332);
        final SubLObject var1337 = module0141.$g1674$.currentBinding(var1332);
        final SubLObject var1338 = module0137.$g1605$.currentBinding(var1332);
        try {
            module0141.$g1670$.bind(var1, var1332);
            module0141.$g1671$.bind(module0244.f15739(var1), var1332);
            module0141.$g1672$.bind(module0244.f15746(var1), var1332);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var1332);
            module0137.$g1605$.bind(var1, var1332);
            final SubLObject var1339 = var3;
            final SubLObject var7_1332 = module0147.$g2095$.currentBinding(var1332);
            final SubLObject var8_1333 = module0147.$g2094$.currentBinding(var1332);
            final SubLObject var9_1334 = module0147.$g2096$.currentBinding(var1332);
            try {
                module0147.$g2095$.bind(module0147.f9545(var1339), var1332);
                module0147.$g2094$.bind(module0147.f9546(var1339), var1332);
                module0147.$g2096$.bind(module0147.f9549(var1339), var1332);
                final SubLObject var1340 = var4;
                final SubLObject var7_1333 = module0141.$g1714$.currentBinding(var1332);
                final SubLObject var8_1334 = module0141.$g1715$.currentBinding(var1332);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var1340) ? var1340 : module0141.f9283(), var1332);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var1340) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var1332)), var1332);
                    if (module0252.NIL != var1340 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var1340)) {
                        final SubLObject var1341 = module0136.$g1591$.getDynamicValue(var1332);
                        if (var1341.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var1340, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var1341.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var1340, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var1341.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var1340, (SubLObject)module0252.$ic4$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var1332));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var1340, (SubLObject)module0252.$ic4$);
                        }
                    }
                    final SubLObject var7_1334 = module0141.$g1710$.currentBinding(var1332);
                    final SubLObject var8_1335 = module0141.$g1677$.currentBinding(var1332);
                    final SubLObject var9_1335 = module0138.$g1619$.currentBinding(var1332);
                    try {
                        module0141.$g1710$.bind(module0252.$ic9$, var1332);
                        module0141.$g1677$.bind(module0141.f9208(), var1332);
                        module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var1332);
                        final SubLObject var1342 = module0139.f9036();
                        final SubLObject var7_1335 = module0139.$g1635$.currentBinding(var1332);
                        try {
                            module0139.$g1635$.bind((var1342 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var1332) : module0139.f9038(var1342), var1332);
                            final SubLObject var7_1336 = module0139.$g1636$.currentBinding(var1332);
                            try {
                                module0139.$g1636$.bind((var1342 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var1332) : module0139.f9038(var1342), var1332);
                                final SubLObject var7_1337 = module0141.$g1685$.currentBinding(var1332);
                                final SubLObject var8_1336 = module0141.$g1686$.currentBinding(var1332);
                                final SubLObject var9_1336 = module0141.$g1683$.currentBinding(var1332);
                                final SubLObject var10_1345 = module0141.$g1684$.currentBinding(var1332);
                                final SubLObject var11_1346 = module0141.$g1674$.currentBinding(var1332);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var1332);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var1332);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var1332);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var1332);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var1332);
                                    final SubLObject var1343 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var1344 = (SubLObject)module0252.NIL;
                                    try {
                                        var1344 = ReadWriteLocks.rw_lock_seize_read_lock(var1343);
                                        var1333 = f16371(var1330, var1331);
                                    }
                                    finally {
                                        if (module0252.NIL != var1344) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var1343);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_1346, var1332);
                                    module0141.$g1684$.rebind(var10_1345, var1332);
                                    module0141.$g1683$.rebind(var9_1336, var1332);
                                    module0141.$g1686$.rebind(var8_1336, var1332);
                                    module0141.$g1685$.rebind(var7_1337, var1332);
                                }
                                if (var1342 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var1332));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_1336, var1332);
                            }
                            if (var1342 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var1332));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_1335, var1332);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_1335, var1332);
                        module0141.$g1677$.rebind(var8_1335, var1332);
                        module0141.$g1710$.rebind(var7_1334, var1332);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_1334, var1332);
                    module0141.$g1714$.rebind(var7_1333, var1332);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_1334, var1332);
                module0147.$g2094$.rebind(var8_1333, var1332);
                module0147.$g2095$.rebind(var7_1332, var1332);
            }
        }
        finally {
            module0137.$g1605$.rebind(var1338, var1332);
            module0141.$g1674$.rebind(var1337, var1332);
            module0141.$g1672$.rebind(var1336, var1332);
            module0141.$g1671$.rebind(var1335, var1332);
            module0141.$g1670$.rebind(var1334, var1332);
        }
        return var1333;
    }
    
    public static SubLObject f16371(final SubLObject var1330, final SubLObject var1331) {
        final SubLThread var1332 = SubLProcess.currentSubLThread();
        SubLObject var1333 = (SubLObject)module0252.NIL;
        final SubLObject var1334 = module0141.$g1664$.currentBinding(var1332);
        final SubLObject var1335 = module0141.$g1665$.currentBinding(var1332);
        final SubLObject var1336 = module0139.$g1648$.currentBinding(var1332);
        final SubLObject var1337 = module0141.$g1688$.currentBinding(var1332);
        final SubLObject var1338 = module0139.$g1646$.currentBinding(var1332);
        try {
            module0141.$g1664$.bind((SubLObject)module0252.$ic46$, var1332);
            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var1332);
            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var1332)), var1332);
            module0141.$g1688$.bind(var1331, var1332);
            module0139.$g1646$.bind(module0139.f9007(), var1332);
            if (module0252.NIL != module0250.f16097()) {
                f16356(var1331);
            }
            else {
                module0249.f16084(var1331);
            }
            if (module0252.NIL != module0077.f5302(var1330)) {
                final SubLObject var1339 = module0077.f5333(var1330);
                SubLObject var1340;
                SubLObject var1341;
                SubLObject var1342;
                SubLObject var7_1347;
                SubLObject var8_1348;
                SubLObject var9_1349;
                for (var1340 = module0032.f1741(var1339), var1341 = (SubLObject)module0252.NIL, var1341 = module0032.f1742(var1340, var1339); module0252.NIL == module0141.$g1685$.getDynamicValue(var1332) && module0252.NIL == module0032.f1744(var1340, var1341); var1341 = module0032.f1743(var1341)) {
                    var1342 = module0032.f1745(var1340, var1341);
                    if (module0252.NIL != module0032.f1746(var1341, var1342)) {
                        var7_1347 = module0139.$g1645$.currentBinding(var1332);
                        var8_1348 = module0141.$g1693$.currentBinding(var1332);
                        var9_1349 = module0141.$g1683$.currentBinding(var1332);
                        try {
                            module0139.$g1645$.bind(module0139.$g1646$.getDynamicValue(var1332), var1332);
                            module0141.$g1693$.bind((SubLObject)module0252.$ic49$, var1332);
                            module0141.$g1683$.bind((SubLObject)module0252.NIL, var1332);
                            var1333 = f16246(var1342);
                        }
                        finally {
                            module0141.$g1683$.rebind(var9_1349, var1332);
                            module0141.$g1693$.rebind(var8_1348, var1332);
                            module0139.$g1645$.rebind(var7_1347, var1332);
                        }
                    }
                }
            }
            else if (var1330.isList()) {
                if (module0252.NIL == module0141.$g1685$.getDynamicValue(var1332)) {
                    SubLObject var1343 = var1330;
                    SubLObject var1344 = (SubLObject)module0252.NIL;
                    var1344 = var1343.first();
                    while (module0252.NIL == module0141.$g1685$.getDynamicValue(var1332) && module0252.NIL != var1343) {
                        final SubLObject var7_1348 = module0139.$g1645$.currentBinding(var1332);
                        final SubLObject var8_1349 = module0141.$g1693$.currentBinding(var1332);
                        final SubLObject var9_1350 = module0141.$g1683$.currentBinding(var1332);
                        try {
                            module0139.$g1645$.bind(module0139.$g1646$.getDynamicValue(var1332), var1332);
                            module0141.$g1693$.bind((SubLObject)module0252.$ic49$, var1332);
                            module0141.$g1683$.bind((SubLObject)module0252.NIL, var1332);
                            var1333 = f16246(var1344);
                        }
                        finally {
                            module0141.$g1683$.rebind(var9_1350, var1332);
                            module0141.$g1693$.rebind(var8_1349, var1332);
                            module0139.$g1645$.rebind(var7_1348, var1332);
                        }
                        var1343 = var1343.rest();
                        var1344 = var1343.first();
                    }
                }
            }
            else {
                Errors.error((SubLObject)module0252.$ic56$, var1330);
            }
            module0139.f9011(module0139.$g1646$.getDynamicValue(var1332));
        }
        finally {
            module0139.$g1646$.rebind(var1338, var1332);
            module0141.$g1688$.rebind(var1337, var1332);
            module0139.$g1648$.rebind(var1336, var1332);
            module0141.$g1665$.rebind(var1335, var1332);
            module0141.$g1664$.rebind(var1334, var1332);
        }
        return var1333;
    }
    
    public static SubLObject f16372(final SubLObject var1, final SubLObject var1330, final SubLObject var1331, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        final SubLThread var1332 = SubLProcess.currentSubLThread();
        assert module0252.NIL != module0137.f8885(var1) : var1;
        SubLObject var1333 = (SubLObject)module0252.NIL;
        final SubLObject var1334 = module0141.$g1670$.currentBinding(var1332);
        final SubLObject var1335 = module0141.$g1671$.currentBinding(var1332);
        final SubLObject var1336 = module0141.$g1672$.currentBinding(var1332);
        final SubLObject var1337 = module0141.$g1674$.currentBinding(var1332);
        final SubLObject var1338 = module0137.$g1605$.currentBinding(var1332);
        try {
            module0141.$g1670$.bind(var1, var1332);
            module0141.$g1671$.bind(module0244.f15739(var1), var1332);
            module0141.$g1672$.bind(module0244.f15746(var1), var1332);
            module0141.$g1674$.bind((SubLObject)module0252.NIL, var1332);
            module0137.$g1605$.bind(var1, var1332);
            final SubLObject var1339 = var3;
            final SubLObject var7_1353 = module0147.$g2095$.currentBinding(var1332);
            final SubLObject var8_1354 = module0147.$g2094$.currentBinding(var1332);
            final SubLObject var9_1355 = module0147.$g2096$.currentBinding(var1332);
            try {
                module0147.$g2095$.bind(module0147.f9545(var1339), var1332);
                module0147.$g2094$.bind(module0147.f9546(var1339), var1332);
                module0147.$g2096$.bind(module0147.f9549(var1339), var1332);
                final SubLObject var1340 = var4;
                final SubLObject var7_1354 = module0141.$g1714$.currentBinding(var1332);
                final SubLObject var8_1355 = module0141.$g1715$.currentBinding(var1332);
                try {
                    module0141.$g1714$.bind((module0252.NIL != var1340) ? var1340 : module0141.f9283(), var1332);
                    module0141.$g1715$.bind((SubLObject)((module0252.NIL != var1340) ? module0252.$ic1$ : module0141.$g1715$.getDynamicValue(var1332)), var1332);
                    if (module0252.NIL != var1340 && module0252.NIL != module0136.f8864() && module0252.NIL == module0141.f9279(var1340)) {
                        final SubLObject var1341 = module0136.$g1591$.getDynamicValue(var1332);
                        if (var1341.eql((SubLObject)module0252.$ic2$)) {
                            module0136.f8870((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic3$, var1340, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var1341.eql((SubLObject)module0252.$ic5$)) {
                            module0136.f8871((SubLObject)module0252.ONE_INTEGER, (SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var1340, (SubLObject)module0252.$ic4$, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                        }
                        else if (var1341.eql((SubLObject)module0252.$ic7$)) {
                            Errors.warn((SubLObject)module0252.$ic3$, var1340, (SubLObject)module0252.$ic4$);
                        }
                        else {
                            Errors.warn((SubLObject)module0252.$ic8$, module0136.$g1591$.getDynamicValue(var1332));
                            Errors.cerror((SubLObject)module0252.$ic6$, (SubLObject)module0252.$ic3$, var1340, (SubLObject)module0252.$ic4$);
                        }
                    }
                    final SubLObject var7_1355 = module0141.$g1710$.currentBinding(var1332);
                    final SubLObject var8_1356 = module0141.$g1677$.currentBinding(var1332);
                    final SubLObject var9_1356 = module0138.$g1619$.currentBinding(var1332);
                    try {
                        module0141.$g1710$.bind(module0252.$ic9$, var1332);
                        module0141.$g1677$.bind(module0141.f9208(), var1332);
                        module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0252.UNPROVIDED)), var1332);
                        final SubLObject var1342 = module0139.f9036();
                        final SubLObject var7_1356 = module0139.$g1635$.currentBinding(var1332);
                        try {
                            module0139.$g1635$.bind((var1342 == module0252.$ic10$) ? module0139.$g1635$.getDynamicValue(var1332) : module0139.f9038(var1342), var1332);
                            final SubLObject var7_1357 = module0139.$g1636$.currentBinding(var1332);
                            try {
                                module0139.$g1636$.bind((var1342 == module0252.$ic10$) ? module0139.$g1636$.getDynamicValue(var1332) : module0139.f9038(var1342), var1332);
                                final SubLObject var7_1358 = module0141.$g1685$.currentBinding(var1332);
                                final SubLObject var8_1357 = module0141.$g1686$.currentBinding(var1332);
                                final SubLObject var9_1357 = module0141.$g1683$.currentBinding(var1332);
                                final SubLObject var10_1366 = module0141.$g1684$.currentBinding(var1332);
                                final SubLObject var11_1367 = module0141.$g1674$.currentBinding(var1332);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0252.NIL, var1332);
                                    module0141.$g1686$.bind((SubLObject)module0252.NIL, var1332);
                                    module0141.$g1683$.bind((SubLObject)module0252.NIL, var1332);
                                    module0141.$g1684$.bind((SubLObject)module0252.NIL, var1332);
                                    module0141.$g1674$.bind((SubLObject)module0252.NIL, var1332);
                                    final SubLObject var1343 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var1344 = (SubLObject)module0252.NIL;
                                    try {
                                        var1344 = ReadWriteLocks.rw_lock_seize_read_lock(var1343);
                                        var1333 = f16373(var1330, var1331);
                                    }
                                    finally {
                                        if (module0252.NIL != var1344) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var1343);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var11_1367, var1332);
                                    module0141.$g1684$.rebind(var10_1366, var1332);
                                    module0141.$g1683$.rebind(var9_1357, var1332);
                                    module0141.$g1686$.rebind(var8_1357, var1332);
                                    module0141.$g1685$.rebind(var7_1358, var1332);
                                }
                                if (var1342 == module0252.$ic12$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var1332));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_1357, var1332);
                            }
                            if (var1342 == module0252.$ic12$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var1332));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_1356, var1332);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var9_1356, var1332);
                        module0141.$g1677$.rebind(var8_1356, var1332);
                        module0141.$g1710$.rebind(var7_1355, var1332);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_1355, var1332);
                    module0141.$g1714$.rebind(var7_1354, var1332);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_1355, var1332);
                module0147.$g2094$.rebind(var8_1354, var1332);
                module0147.$g2095$.rebind(var7_1353, var1332);
            }
        }
        finally {
            module0137.$g1605$.rebind(var1338, var1332);
            module0141.$g1674$.rebind(var1337, var1332);
            module0141.$g1672$.rebind(var1336, var1332);
            module0141.$g1671$.rebind(var1335, var1332);
            module0141.$g1670$.rebind(var1334, var1332);
        }
        return var1333;
    }
    
    public static SubLObject f16373(final SubLObject var1330, final SubLObject var1331) {
        final SubLThread var1332 = SubLProcess.currentSubLThread();
        SubLObject var1333 = var1331;
        SubLObject var1334 = (SubLObject)module0252.NIL;
        final SubLObject var1335 = module0141.$g1665$.currentBinding(var1332);
        final SubLObject var1336 = module0139.$g1648$.currentBinding(var1332);
        try {
            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var1332);
            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var1332)), var1332);
            SubLObject var1337 = var1330;
            SubLObject var1338 = (SubLObject)module0252.NIL;
            var1338 = var1337.first();
            while (module0252.NIL != var1337) {
                final SubLObject var7_1368 = module0139.$g1635$.currentBinding(var1332);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var1332);
                    final SubLObject var7_1369 = module0139.$g1636$.currentBinding(var1332);
                    try {
                        module0139.$g1636$.bind(module0139.f9007(), var1332);
                        final SubLObject var7_1370 = module0141.$g1674$.currentBinding(var1332);
                        try {
                            module0141.$g1674$.bind((SubLObject)module0252.NIL, var1332);
                            module0251.f16203(var1338);
                        }
                        finally {
                            module0141.$g1674$.rebind(var7_1370, var1332);
                        }
                        SubLObject var170_1371 = var1331;
                        SubLObject var1339 = (SubLObject)module0252.NIL;
                        var1339 = var170_1371.first();
                        while (module0252.NIL != var170_1371) {
                            if (module0252.NIL == module0249.f16061(var1339)) {
                                var1333 = Sequences.remove(var1339, var1333, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED, (SubLObject)module0252.UNPROVIDED);
                            }
                            var170_1371 = var170_1371.rest();
                            var1339 = var170_1371.first();
                        }
                        module0139.f9011(module0139.$g1636$.getDynamicValue(var1332));
                    }
                    finally {
                        module0139.$g1636$.rebind(var7_1369, var1332);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var1332));
                }
                finally {
                    module0139.$g1635$.rebind(var7_1368, var1332);
                }
                var1337 = var1337.rest();
                var1338 = var1337.first();
            }
            var1334 = module0035.sublisp_boolean(var1333);
        }
        finally {
            module0139.$g1648$.rebind(var1336, var1332);
            module0141.$g1665$.rebind(var1335, var1332);
        }
        return var1334;
    }
    
    public static SubLObject f16374(final SubLObject var1, final SubLObject var1330, final SubLObject var1331, SubLObject var3, SubLObject var4) {
        if (var3 == module0252.UNPROVIDED) {
            var3 = (SubLObject)module0252.NIL;
        }
        if (var4 == module0252.UNPROVIDED) {
            var4 = (SubLObject)module0252.NIL;
        }
        assert module0252.NIL != module0137.f8885(var1) : var1;
        SubLObject var1332 = (SubLObject)module0252.NIL;
        if (module0252.NIL != module0077.f5302(var1330)) {
            final SubLObject var1333 = module0077.f5333(var1330);
            SubLObject var1334;
            SubLObject var1335;
            SubLObject var1336;
            for (var1334 = module0032.f1741(var1333), var1335 = (SubLObject)module0252.NIL, var1335 = module0032.f1742(var1334, var1333); module0252.NIL == var1332 && module0252.NIL == module0032.f1744(var1334, var1335); var1335 = module0032.f1743(var1335)) {
                var1336 = module0032.f1745(var1334, var1335);
                if (module0252.NIL != module0032.f1746(var1335, var1336) && module0252.NIL != f16358(var1, var1336, var1331, var3, var4)) {
                    var1332 = (SubLObject)module0252.T;
                }
            }
        }
        else if (var1330.isList()) {
            if (module0252.NIL == var1332) {
                SubLObject var1337 = var1330;
                SubLObject var1338 = (SubLObject)module0252.NIL;
                var1338 = var1337.first();
                while (module0252.NIL == var1332 && module0252.NIL != var1337) {
                    if (module0252.NIL != f16358(var1, var1338, var1331, var3, var4)) {
                        var1332 = (SubLObject)module0252.T;
                    }
                    var1337 = var1337.rest();
                    var1338 = var1337.first();
                }
            }
        }
        else {
            Errors.error((SubLObject)module0252.$ic56$, var1330);
        }
        return var1332;
    }
    
    public static SubLObject f16375() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16245", "S#18983", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16247", "S#18984", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16248", "S#18985", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16249", "S#18986", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16246", "S#18987", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16250", "S#18988", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16251", "S#18989", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16252", "S#18990", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16254", "S#18991", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16253", "S#18992", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16255", "S#18848", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16256", "S#18993", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16257", "S#18994", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16258", "S#18995", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16259", "S#18996", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16261", "S#18997", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16263", "S#18998", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16264", "S#18999", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16265", "S#19000", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16266", "S#19001", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16268", "S#19002", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16267", "S#19003", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16269", "S#19004", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16270", "S#19005", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16271", "S#19006", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16272", "S#19007", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16273", "S#19008", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16274", "S#19009", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16275", "S#19010", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16276", "S#19011", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16277", "S#19012", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16278", "S#19013", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16279", "S#19014", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16281", "S#19015", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16280", "S#19016", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16282", "S#18851", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16284", "S#19017", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16285", "S#19018", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16286", "S#19019", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16287", "S#19020", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16283", "S#19021", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16288", "S#19022", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16290", "S#19023", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16289", "S#19024", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16291", "S#19025", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16293", "S#19026", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16292", "S#19027", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16294", "S#19028", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16296", "S#19029", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16295", "S#19030", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16297", "S#19031", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16298", "S#19032", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16299", "S#19033", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16300", "S#19034", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16302", "S#19035", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16262", "S#19036", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16260", "S#19037", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16303", "S#19038", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16304", "S#19039", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16305", "S#19040", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16306", "S#19041", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16307", "S#19042", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16308", "S#19043", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16309", "S#19044", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16310", "S#19045", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16311", "S#18978", 1, 0, false);
        new $f16311$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16312", "S#19046", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16313", "S#19047", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16314", "S#19048", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16316", "S#19049", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16318", "S#19050", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16319", "S#19051", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16315", "S#19052", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16317", "S#19053", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16320", "S#19054", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16322", "S#19055", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16323", "S#19056", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16321", "S#19057", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16324", "S#19058", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16325", "S#19059", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16326", "S#19060", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16327", "S#19061", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16328", "S#19062", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16329", "S#19063", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16330", "S#19064", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16331", "S#19065", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16332", "S#19066", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16334", "S#19067", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16333", "S#19068", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16336", "S#19069", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16337", "S#19070", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16338", "S#19071", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16339", "S#19072", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16340", "S#19073", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16335", "S#19074", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16342", "S#19075", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16343", "S#19076", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16344", "S#19077", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16345", "S#19078", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16346", "S#19079", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16347", "S#19080", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16341", "S#19081", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16348", "S#19082", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16349", "S#19083", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16350", "S#19084", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16351", "S#19085", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16352", "S#19086", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16353", "S#19087", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16354", "S#19088", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16355", "S#19089", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16356", "S#19090", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16301", "S#19091", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16357", "S#19092", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16358", "S#19093", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16359", "S#19094", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16360", "S#19095", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16362", "S#19096", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16363", "S#19097", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16361", "S#19098", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16364", "S#19099", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16365", "S#19100", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16367", "S#19101", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16368", "S#19102", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16366", "S#19103", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16369", "S#19104", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16370", "S#19105", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16371", "S#19106", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16372", "S#19107", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16373", "S#19108", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0252", "f16374", "S#19109", 3, 2, false);
        return (SubLObject)module0252.NIL;
    }
    
    public static SubLObject f16376() {
        module0252.$g2471$ = SubLFiles.defparameter("S#19110", (SubLObject)module0252.NIL);
        return (SubLObject)module0252.NIL;
    }
    
    public static SubLObject f16377() {
        return (SubLObject)module0252.NIL;
    }
    
    public void declareFunctions() {
        f16375();
    }
    
    public void initializeVariables() {
        f16376();
    }
    
    public void runTopLevelForms() {
        f16377();
    }
    
    static {
        me = (SubLFile)new module0252();
        module0252.$g2471$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#11099", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#11450", "CYC");
        $ic2$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic3$ = SubLObjectFactory.makeString("~A is not a ~A");
        $ic4$ = SubLObjectFactory.makeSymbol("S#11592", "CYC");
        $ic5$ = SubLObjectFactory.makeKeyword("CERROR");
        $ic6$ = SubLObjectFactory.makeString("continue anyway");
        $ic7$ = SubLObjectFactory.makeKeyword("WARN");
        $ic8$ = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic9$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("True-JustificationTruth"));
        $ic10$ = SubLObjectFactory.makeKeyword("OLD");
        $ic11$ = SubLObjectFactory.makeSymbol("S#18870", "CYC");
        $ic12$ = SubLObjectFactory.makeKeyword("RESOURCE");
        $ic13$ = SubLObjectFactory.makeSymbol("S#11593", "CYC");
        $ic14$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("False-JustificationTruth"));
        $ic15$ = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic16$ = SubLObjectFactory.makeSymbol("S#18872", "CYC");
        $ic17$ = SubLObjectFactory.makeKeyword("CLOSURE");
        $ic18$ = SubLObjectFactory.makeSymbol("S#18848", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#18876", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#15389", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#15390", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("S#4672", "CYC");
        $ic23$ = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $ic24$ = SubLObjectFactory.makeSymbol("S#18873", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("S#18874", "CYC");
        $ic26$ = SubLObjectFactory.makeSymbol("S#11668", "CYC");
        $ic27$ = SubLObjectFactory.makeSymbol("S#18875", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("S#18877", "CYC");
        $ic29$ = SubLObjectFactory.makeSymbol("S#18845", "CYC");
        $ic30$ = SubLObjectFactory.makeSymbol("S#18871", "CYC");
        $ic31$ = SubLObjectFactory.makeSymbol("S#18772", "CYC");
        $ic32$ = SubLObjectFactory.makeSymbol("MEMBER?");
        $ic33$ = SubLObjectFactory.makeKeyword("FORWARD");
        $ic34$ = SubLObjectFactory.makeKeyword("BACKWARD");
        $ic35$ = SubLObjectFactory.makeSymbol("S#18978", "CYC");
        $ic36$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genlInverse"));
        $ic37$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic38$ = SubLObjectFactory.makeSymbol("+");
        $ic39$ = SubLObjectFactory.makeSymbol("GENL-CARDINALITY");
        $ic40$ = SubLObjectFactory.makeSymbol("S#19070", "CYC");
        $ic41$ = SubLObjectFactory.makeSymbol("S#19071", "CYC");
        $ic42$ = SubLObjectFactory.makeString("~&sbhl-predicate-relation-p: cache ~S differs from sbhl ~S!~%");
        $ic43$ = SubLObjectFactory.makeString("~&     cached: ~S (clet (cached-result) (possibly-with-sbhl-mt-relevance ~S (csetq cached-result (sbhl-cached-predicate-relation-p ~S ~S ~S))) cached-result)~%");
        $ic44$ = SubLObjectFactory.makeString("~& non-cached: ~S (clet (non-cached-result) (with-new-sbhl-space (with-sbhl-search-module (get-sbhl-module ~S) (with-sbhl-forward-true-search ~S ~S (csetq non-cached-result (sbhl-path-from-node-to-node-p ~S ~S))))) non-cached-result)~%");
        $ic45$ = SubLObjectFactory.makeSymbol("S#18808", "CYC");
        $ic46$ = SubLObjectFactory.makeKeyword("BOOLEAN");
        $ic47$ = SubLObjectFactory.makeSymbol("S#15382", "CYC");
        $ic48$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("negationInverse"));
        $ic49$ = SubLObjectFactory.makeSymbol("S#15385", "CYC");
        $ic50$ = SubLObjectFactory.makeSymbol("S#19074", "CYC");
        $ic51$ = SubLObjectFactory.makeSymbol("S#19079", "CYC");
        $ic52$ = SubLObjectFactory.makeSymbol("S#19111", "CYC");
        $ic53$ = SubLObjectFactory.makeSymbol("S#19112", "CYC");
        $ic54$ = SubLObjectFactory.makeString("Invalid TV argument ~a, or *sbhl-tv* ~a");
        $ic55$ = SubLObjectFactory.makeSymbol("S#19086", "CYC");
        $ic56$ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
    }
    
    public static final class $f16311$UnaryFunction extends UnaryFunction
    {
        public $f16311$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#18978"));
        }
        
        public SubLObject processItem(final SubLObject var805) {
            return module0252.f16311(var805);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0252.class
	Total time: 8498 ms
	
	Decompiled with Procyon 0.5.32.
*/