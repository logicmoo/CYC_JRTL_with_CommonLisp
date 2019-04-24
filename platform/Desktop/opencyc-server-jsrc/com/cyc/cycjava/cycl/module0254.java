package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0254 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0254";
    public static final String myFingerPrint = "44f60df21059bdfc97fd958808394bf243c982ff4b5874dbf66dac3cfab76211";
    private static final SubLSymbol $ic0$;
    private static final SubLObject $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLObject $ic9$;
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
    private static final SubLString $ic20$;
    private static final SubLString $ic21$;
    private static final SubLString $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLObject $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLString $ic28$;
    private static final SubLString $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    
    public static SubLObject f16458(final SubLObject var1) {
        assert module0254.NIL != module0137.f8885(var1) : var1;
        final SubLObject var2 = module0137.f8917(var1);
        if (var2.eql(module0254.$ic1$)) {
            return (SubLObject)module0254.$ic2$;
        }
        return (SubLObject)module0254.NIL;
    }
    
    public static SubLObject f16459(final SubLObject var1, final SubLObject var3, SubLObject var4, SubLObject var5) {
        if (var4 == module0254.UNPROVIDED) {
            var4 = (SubLObject)module0254.NIL;
        }
        if (var5 == module0254.UNPROVIDED) {
            var5 = (SubLObject)module0254.NIL;
        }
        assert module0254.NIL != module0137.f8885(var1) : var1;
        final SubLObject var6 = f16458(var1);
        SubLObject var7 = (SubLObject)module0254.NIL;
        if (module0254.NIL != var6) {
            var7 = Functions.funcall(var6, var3, var4);
        }
        return var7;
    }
    
    public static SubLObject f16460(final SubLObject var1) {
        assert module0254.NIL != module0137.f8885(var1) : var1;
        final SubLObject var2 = module0137.f8917(var1);
        if (var2.eql(module0254.$ic1$)) {
            return (SubLObject)module0254.$ic3$;
        }
        return (SubLObject)module0254.NIL;
    }
    
    public static SubLObject f16461(final SubLObject var1, final SubLObject var3, SubLObject var4, SubLObject var5) {
        if (var4 == module0254.UNPROVIDED) {
            var4 = (SubLObject)module0254.NIL;
        }
        if (var5 == module0254.UNPROVIDED) {
            var5 = (SubLObject)module0254.NIL;
        }
        assert module0254.NIL != module0137.f8885(var1) : var1;
        final SubLObject var6 = f16460(var1);
        SubLObject var7 = (SubLObject)module0254.NIL;
        if (module0254.NIL != var6) {
            var7 = Functions.funcall(var6, var3, var4);
        }
        return var7;
    }
    
    public static SubLObject f16462(final SubLObject var1) {
        assert module0254.NIL != module0137.f8885(var1) : var1;
        final SubLObject var2 = module0137.f8917(var1);
        if (var2.eql(module0254.$ic1$)) {
            return (SubLObject)module0254.$ic4$;
        }
        return (SubLObject)module0254.NIL;
    }
    
    public static SubLObject f16463(final SubLObject var1, final SubLObject var9, final SubLObject var10, SubLObject var4, SubLObject var5) {
        if (var4 == module0254.UNPROVIDED) {
            var4 = (SubLObject)module0254.NIL;
        }
        if (var5 == module0254.UNPROVIDED) {
            var5 = (SubLObject)module0254.NIL;
        }
        assert module0254.NIL != module0137.f8885(var1) : var1;
        final SubLObject var11 = f16462(var1);
        SubLObject var12 = (SubLObject)module0254.NIL;
        if (module0254.NIL != var11) {
            var12 = Functions.funcall(var11, var9, var10, var4);
        }
        return var12;
    }
    
    public static SubLObject f16464(final SubLObject var1) {
        assert module0254.NIL != module0137.f8885(var1) : var1;
        final SubLObject var2 = module0137.f8917(var1);
        if (var2.eql(module0254.$ic1$)) {
            return (SubLObject)module0254.$ic5$;
        }
        return (SubLObject)module0254.NIL;
    }
    
    public static SubLObject f16465(final SubLObject var1, final SubLObject var12, final SubLObject var10, SubLObject var4, SubLObject var5) {
        if (var4 == module0254.UNPROVIDED) {
            var4 = (SubLObject)module0254.NIL;
        }
        if (var5 == module0254.UNPROVIDED) {
            var5 = (SubLObject)module0254.NIL;
        }
        assert module0254.NIL != module0137.f8885(var1) : var1;
        final SubLObject var13 = f16464(var1);
        SubLObject var14 = (SubLObject)module0254.NIL;
        if (module0254.NIL != var13) {
            var14 = Functions.funcall(var13, var12, var10, var4);
        }
        return var14;
    }
    
    public static SubLObject f16466(final SubLObject var1) {
        assert module0254.NIL != module0137.f8885(var1) : var1;
        final SubLObject var2 = module0137.f8917(var1);
        if (var2.eql(module0254.$ic1$)) {
            return (SubLObject)module0254.$ic6$;
        }
        return (SubLObject)module0254.NIL;
    }
    
    public static SubLObject f16467(final SubLObject var1, final SubLObject var12, final SubLObject var14, SubLObject var4, SubLObject var5) {
        if (var4 == module0254.UNPROVIDED) {
            var4 = (SubLObject)module0254.NIL;
        }
        if (var5 == module0254.UNPROVIDED) {
            var5 = (SubLObject)module0254.NIL;
        }
        assert module0254.NIL != module0137.f8885(var1) : var1;
        final SubLObject var15 = f16466(var1);
        SubLObject var16 = (SubLObject)module0254.NIL;
        if (module0254.NIL != var15) {
            var16 = Functions.funcall(var15, var12, var14, var4);
        }
        return var16;
    }
    
    public static SubLObject f16468(final SubLObject var1) {
        assert module0254.NIL != module0137.f8885(var1) : var1;
        final SubLObject var2 = module0137.f8917(var1);
        if (var2.eql(module0254.$ic1$)) {
            return (SubLObject)module0254.$ic7$;
        }
        return (SubLObject)module0254.NIL;
    }
    
    public static SubLObject f16469(final SubLObject var1, final SubLObject var9, final SubLObject var10, SubLObject var4, SubLObject var5) {
        if (var4 == module0254.UNPROVIDED) {
            var4 = (SubLObject)module0254.NIL;
        }
        if (var5 == module0254.UNPROVIDED) {
            var5 = (SubLObject)module0254.NIL;
        }
        assert module0254.NIL != module0137.f8885(var1) : var1;
        final SubLObject var11 = f16468(var1);
        SubLObject var12 = (SubLObject)module0254.NIL;
        if (module0254.NIL != var11) {
            var12 = Functions.funcall(var11, var9, var10, var4);
        }
        return var12;
    }
    
    public static SubLObject f16470(final SubLObject var1, final SubLObject var3, SubLObject var4, SubLObject var5) {
        if (var4 == module0254.UNPROVIDED) {
            var4 = (SubLObject)module0254.NIL;
        }
        if (var5 == module0254.UNPROVIDED) {
            var5 = (SubLObject)module0254.NIL;
        }
        final SubLThread var6 = SubLProcess.currentSubLThread();
        assert module0254.NIL != module0137.f8885(var1) : var1;
        SubLObject var7 = (SubLObject)module0254.NIL;
        final SubLObject var8 = module0139.$g1646$.currentBinding(var6);
        try {
            module0139.$g1646$.bind(module0139.f9007(), var6);
            final SubLObject var18_19 = module0139.$g1647$.currentBinding(var6);
            try {
                module0139.$g1647$.bind(module0139.f9007(), var6);
                final SubLObject var18_20 = module0139.$g1656$.currentBinding(var6);
                final SubLObject var9 = module0139.$g1657$.currentBinding(var6);
                final SubLObject var10 = module0139.$g1655$.currentBinding(var6);
                final SubLObject var11 = module0141.$g1691$.currentBinding(var6);
                try {
                    module0139.$g1656$.bind(module0139.$g1646$.getDynamicValue(var6), var6);
                    module0139.$g1657$.bind(module0139.$g1647$.getDynamicValue(var6), var6);
                    module0139.$g1655$.bind((SubLObject)module0254.T, var6);
                    module0141.$g1691$.bind((SubLObject)module0254.NIL, var6);
                    try {
                        var7 = module0252.f16281(var1, var3, (SubLObject)module0254.$ic8$, var4, var5, (SubLObject)module0254.UNPROVIDED);
                    }
                    finally {
                        final SubLObject var18_21 = Threads.$is_thread_performing_cleanupP$.currentBinding(var6);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0254.T, var6);
                            var7 = module0141.$g1691$.getDynamicValue(var6);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var18_21, var6);
                        }
                    }
                }
                finally {
                    module0141.$g1691$.rebind(var11, var6);
                    module0139.$g1655$.rebind(var10, var6);
                    module0139.$g1657$.rebind(var9, var6);
                    module0139.$g1656$.rebind(var18_20, var6);
                }
                module0139.f9011(module0139.$g1647$.getDynamicValue(var6));
            }
            finally {
                module0139.$g1647$.rebind(var18_19, var6);
            }
            module0139.f9011(module0139.$g1646$.getDynamicValue(var6));
        }
        finally {
            module0139.$g1646$.rebind(var8, var6);
        }
        return var7;
    }
    
    public static SubLObject f16471(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = module0244.f15769(module0141.f9188());
        final SubLObject var6 = module0141.$g1670$.currentBinding(var4);
        final SubLObject var7 = module0141.$g1671$.currentBinding(var4);
        final SubLObject var8 = module0141.$g1672$.currentBinding(var4);
        final SubLObject var9 = module0141.$g1674$.currentBinding(var4);
        final SubLObject var10 = module0137.$g1605$.currentBinding(var4);
        final SubLObject var11 = module0141.$g1710$.currentBinding(var4);
        final SubLObject var12 = module0141.$g1677$.currentBinding(var4);
        final SubLObject var13 = module0138.$g1619$.currentBinding(var4);
        try {
            module0141.$g1670$.bind(var5, var4);
            module0141.$g1671$.bind(module0244.f15739(var5), var4);
            module0141.$g1672$.bind(module0244.f15746(var5), var4);
            module0141.$g1674$.bind((SubLObject)module0254.NIL, var4);
            module0137.$g1605$.bind(var5, var4);
            module0141.$g1710$.bind(module0254.$ic9$, var4);
            module0141.$g1677$.bind(module0141.f9208(), var4);
            module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0254.UNPROVIDED)), var4);
            final SubLObject var14 = module0139.f9036();
            final SubLObject var18_31 = module0139.$g1635$.currentBinding(var4);
            try {
                module0139.$g1635$.bind((var14 == module0254.$ic10$) ? module0139.$g1635$.getDynamicValue(var4) : module0139.f9038(var14), var4);
                final SubLObject var18_32 = module0139.$g1636$.currentBinding(var4);
                try {
                    module0139.$g1636$.bind((var14 == module0254.$ic10$) ? module0139.$g1636$.getDynamicValue(var4) : module0139.f9038(var14), var4);
                    final SubLObject var18_33 = module0141.$g1685$.currentBinding(var4);
                    final SubLObject var21_34 = module0141.$g1686$.currentBinding(var4);
                    final SubLObject var22_35 = module0141.$g1683$.currentBinding(var4);
                    final SubLObject var23_36 = module0141.$g1684$.currentBinding(var4);
                    final SubLObject var26_37 = module0141.$g1674$.currentBinding(var4);
                    try {
                        module0141.$g1685$.bind((SubLObject)module0254.NIL, var4);
                        module0141.$g1686$.bind((SubLObject)module0254.NIL, var4);
                        module0141.$g1683$.bind((SubLObject)module0254.NIL, var4);
                        module0141.$g1684$.bind((SubLObject)module0254.NIL, var4);
                        module0141.$g1674$.bind((SubLObject)module0254.NIL, var4);
                        final SubLObject var15 = module0138.$g1626$.getGlobalValue();
                        SubLObject var16 = (SubLObject)module0254.NIL;
                        try {
                            var16 = ReadWriteLocks.rw_lock_seize_read_lock(var15);
                            final SubLObject var18_34 = module0139.$g1635$.currentBinding(var4);
                            final SubLObject var21_35 = module0139.$g1636$.currentBinding(var4);
                            final SubLObject var22_36 = module0139.$g1644$.currentBinding(var4);
                            try {
                                module0139.$g1635$.bind(module0139.$g1656$.getDynamicValue(var4), var4);
                                module0139.$g1636$.bind(module0139.$g1657$.getDynamicValue(var4), var4);
                                module0139.$g1644$.bind((SubLObject)module0254.T, var4);
                                module0250.f16167(var3);
                            }
                            finally {
                                module0139.$g1644$.rebind(var22_36, var4);
                                module0139.$g1636$.rebind(var21_35, var4);
                                module0139.$g1635$.rebind(var18_34, var4);
                            }
                        }
                        finally {
                            if (module0254.NIL != var16) {
                                ReadWriteLocks.rw_lock_release_read_lock(var15);
                            }
                        }
                    }
                    finally {
                        module0141.$g1674$.rebind(var26_37, var4);
                        module0141.$g1684$.rebind(var23_36, var4);
                        module0141.$g1683$.rebind(var22_35, var4);
                        module0141.$g1686$.rebind(var21_34, var4);
                        module0141.$g1685$.rebind(var18_33, var4);
                    }
                    if (var14 == module0254.$ic11$) {
                        module0139.f9012(module0139.$g1636$.getDynamicValue(var4));
                    }
                }
                finally {
                    module0139.$g1636$.rebind(var18_32, var4);
                }
                if (var14 == module0254.$ic11$) {
                    module0139.f9012(module0139.$g1635$.getDynamicValue(var4));
                }
            }
            finally {
                module0139.$g1635$.rebind(var18_31, var4);
            }
        }
        finally {
            module0138.$g1619$.rebind(var13, var4);
            module0141.$g1677$.rebind(var12, var4);
            module0141.$g1710$.rebind(var11, var4);
            module0137.$g1605$.rebind(var10, var4);
            module0141.$g1674$.rebind(var9, var4);
            module0141.$g1672$.rebind(var8, var4);
            module0141.$g1671$.rebind(var7, var4);
            module0141.$g1670$.rebind(var6, var4);
        }
        return (SubLObject)module0254.NIL;
    }
    
    public static SubLObject f16472(final SubLObject var1, final SubLObject var3, SubLObject var4, SubLObject var5) {
        if (var4 == module0254.UNPROVIDED) {
            var4 = (SubLObject)module0254.NIL;
        }
        if (var5 == module0254.UNPROVIDED) {
            var5 = (SubLObject)module0254.NIL;
        }
        assert module0254.NIL != module0137.f8885(var1) : var1;
        final SubLObject var6 = module0252.f16248(var1, var3, var4, var5);
        SubLObject var7 = (SubLObject)module0254.NIL;
        SubLObject var8 = var6;
        SubLObject var9 = (SubLObject)module0254.NIL;
        var9 = var8.first();
        while (module0254.NIL != var8) {
            var7 = ConsesLow.append(f16459(var1, var9, var4, var5), var7);
            var8 = var8.rest();
            var9 = var8.first();
        }
        return Sequences.remove_duplicates(var7, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED);
    }
    
    public static SubLObject f16473(final SubLObject var1, final SubLObject var3, SubLObject var4, SubLObject var5) {
        if (var4 == module0254.UNPROVIDED) {
            var4 = (SubLObject)module0254.NIL;
        }
        if (var5 == module0254.UNPROVIDED) {
            var5 = (SubLObject)module0254.NIL;
        }
        final SubLThread var6 = SubLProcess.currentSubLThread();
        assert module0254.NIL != module0137.f8885(var1) : var1;
        final SubLObject var7 = module0244.f15769(module0244.f15771(var1));
        SubLObject var8 = (SubLObject)module0254.NIL;
        SubLObject var9 = (SubLObject)module0254.NIL;
        final SubLObject var10 = module0141.$g1670$.currentBinding(var6);
        final SubLObject var11 = module0141.$g1671$.currentBinding(var6);
        final SubLObject var12 = module0141.$g1672$.currentBinding(var6);
        final SubLObject var13 = module0141.$g1674$.currentBinding(var6);
        final SubLObject var14 = module0137.$g1605$.currentBinding(var6);
        try {
            module0141.$g1670$.bind(var1, var6);
            module0141.$g1671$.bind(module0244.f15739(var1), var6);
            module0141.$g1672$.bind(module0244.f15746(var1), var6);
            module0141.$g1674$.bind((SubLObject)module0254.NIL, var6);
            module0137.$g1605$.bind(var1, var6);
            final SubLObject var15 = var4;
            final SubLObject var18_48 = module0147.$g2095$.currentBinding(var6);
            final SubLObject var21_49 = module0147.$g2094$.currentBinding(var6);
            final SubLObject var22_50 = module0147.$g2096$.currentBinding(var6);
            try {
                module0147.$g2095$.bind(module0147.f9545(var15), var6);
                module0147.$g2094$.bind(module0147.f9546(var15), var6);
                module0147.$g2096$.bind(module0147.f9549(var15), var6);
                final SubLObject var16 = var5;
                final SubLObject var18_49 = module0141.$g1714$.currentBinding(var6);
                final SubLObject var21_50 = module0141.$g1715$.currentBinding(var6);
                try {
                    module0141.$g1714$.bind((module0254.NIL != var16) ? var16 : module0141.f9283(), var6);
                    module0141.$g1715$.bind((SubLObject)((module0254.NIL != var16) ? module0254.$ic12$ : module0141.$g1715$.getDynamicValue(var6)), var6);
                    if (module0254.NIL != var16 && module0254.NIL != module0136.f8864() && module0254.NIL == module0141.f9279(var16)) {
                        final SubLObject var17 = module0136.$g1591$.getDynamicValue(var6);
                        if (var17.eql((SubLObject)module0254.$ic13$)) {
                            module0136.f8870((SubLObject)module0254.ONE_INTEGER, (SubLObject)module0254.$ic14$, var16, (SubLObject)module0254.$ic15$, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED);
                        }
                        else if (var17.eql((SubLObject)module0254.$ic16$)) {
                            module0136.f8871((SubLObject)module0254.ONE_INTEGER, (SubLObject)module0254.$ic17$, (SubLObject)module0254.$ic14$, var16, (SubLObject)module0254.$ic15$, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED);
                        }
                        else if (var17.eql((SubLObject)module0254.$ic18$)) {
                            Errors.warn((SubLObject)module0254.$ic14$, var16, (SubLObject)module0254.$ic15$);
                        }
                        else {
                            Errors.warn((SubLObject)module0254.$ic19$, module0136.$g1591$.getDynamicValue(var6));
                            Errors.cerror((SubLObject)module0254.$ic17$, (SubLObject)module0254.$ic14$, var16, (SubLObject)module0254.$ic15$);
                        }
                    }
                    final SubLObject var18_50 = module0141.$g1710$.currentBinding(var6);
                    final SubLObject var21_51 = module0141.$g1677$.currentBinding(var6);
                    final SubLObject var22_51 = module0138.$g1619$.currentBinding(var6);
                    try {
                        module0141.$g1710$.bind(module0254.$ic9$, var6);
                        module0141.$g1677$.bind(module0141.f9208(), var6);
                        module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0254.UNPROVIDED)), var6);
                        final SubLObject var18 = module0139.f9036();
                        final SubLObject var18_51 = module0139.$g1635$.currentBinding(var6);
                        try {
                            module0139.$g1635$.bind((var18 == module0254.$ic10$) ? module0139.$g1635$.getDynamicValue(var6) : module0139.f9038(var18), var6);
                            final SubLObject var18_52 = module0139.$g1636$.currentBinding(var6);
                            try {
                                module0139.$g1636$.bind((var18 == module0254.$ic10$) ? module0139.$g1636$.getDynamicValue(var6) : module0139.f9038(var18), var6);
                                final SubLObject var18_53 = module0141.$g1685$.currentBinding(var6);
                                final SubLObject var21_52 = module0141.$g1686$.currentBinding(var6);
                                final SubLObject var22_52 = module0141.$g1683$.currentBinding(var6);
                                final SubLObject var23_62 = module0141.$g1684$.currentBinding(var6);
                                final SubLObject var26_63 = module0141.$g1674$.currentBinding(var6);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0254.NIL, var6);
                                    module0141.$g1686$.bind((SubLObject)module0254.NIL, var6);
                                    module0141.$g1683$.bind((SubLObject)module0254.NIL, var6);
                                    module0141.$g1684$.bind((SubLObject)module0254.NIL, var6);
                                    module0141.$g1674$.bind((SubLObject)module0254.NIL, var6);
                                    final SubLObject var19 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var20 = (SubLObject)module0254.NIL;
                                    try {
                                        var20 = ReadWriteLocks.rw_lock_seize_read_lock(var19);
                                        final SubLObject var18_54 = module0139.$g1644$.currentBinding(var6);
                                        try {
                                            module0139.$g1644$.bind((SubLObject)module0254.T, var6);
                                            SubLObject var22;
                                            final SubLObject var21 = var22 = module0200.f12443(var1);
                                            SubLObject var23 = (SubLObject)module0254.NIL;
                                            var23 = var22.first();
                                            while (module0254.NIL != var22) {
                                                final SubLObject var18_55 = module0137.$g1605$.currentBinding(var6);
                                                final SubLObject var21_53 = module0141.$g1674$.currentBinding(var6);
                                                try {
                                                    module0137.$g1605$.bind(var23, var6);
                                                    module0141.$g1674$.bind((SubLObject)((module0254.NIL != module0141.f9205((SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0254.NIL == module0141.$g1674$.getDynamicValue(var6)) : module0141.$g1674$.getDynamicValue(var6)), var6);
                                                    final SubLObject var69_70 = module0228.f15229(var3);
                                                    if (module0254.NIL != module0138.f8992(var69_70)) {
                                                        final SubLObject var24 = module0242.f15664(var69_70, module0137.f8955((SubLObject)module0254.UNPROVIDED));
                                                        if (module0254.NIL != var24) {
                                                            final SubLObject var25 = module0245.f15834(var24, module0138.f8979(), module0137.f8955((SubLObject)module0254.UNPROVIDED));
                                                            if (module0254.NIL != var25) {
                                                                SubLObject var26;
                                                                for (var26 = module0066.f4838(module0067.f4891(var25)); module0254.NIL == module0066.f4841(var26); var26 = module0066.f4840(var26)) {
                                                                    var6.resetMultipleValues();
                                                                    final SubLObject var74_75 = module0066.f4839(var26);
                                                                    final SubLObject var27 = var6.secondMultipleValue();
                                                                    var6.resetMultipleValues();
                                                                    if (module0254.NIL != module0147.f9507(var74_75)) {
                                                                        final SubLObject var18_56 = module0138.$g1623$.currentBinding(var6);
                                                                        try {
                                                                            module0138.$g1623$.bind(var74_75, var6);
                                                                            SubLObject var73_78;
                                                                            for (var73_78 = module0066.f4838(module0067.f4891(var27)); module0254.NIL == module0066.f4841(var73_78); var73_78 = module0066.f4840(var73_78)) {
                                                                                var6.resetMultipleValues();
                                                                                final SubLObject var79_80 = module0066.f4839(var73_78);
                                                                                final SubLObject var28 = var6.secondMultipleValue();
                                                                                var6.resetMultipleValues();
                                                                                if (module0254.NIL != module0141.f9289(var79_80)) {
                                                                                    final SubLObject var18_57 = module0138.$g1624$.currentBinding(var6);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var79_80, var6);
                                                                                        final SubLObject var29 = var28;
                                                                                        if (module0254.NIL != module0077.f5302(var29)) {
                                                                                            final SubLObject var30 = module0077.f5333(var29);
                                                                                            SubLObject var31;
                                                                                            SubLObject var32;
                                                                                            SubLObject var33;
                                                                                            SubLObject var18_58;
                                                                                            SubLObject var18_59;
                                                                                            SubLObject var21_54;
                                                                                            SubLObject var22_53;
                                                                                            SubLObject var23_63;
                                                                                            SubLObject var26_64;
                                                                                            SubLObject var18_60;
                                                                                            for (var31 = module0032.f1741(var30), var32 = (SubLObject)module0254.NIL, var32 = module0032.f1742(var31, var30); module0254.NIL == module0032.f1744(var31, var32); var32 = module0032.f1743(var32)) {
                                                                                                var33 = module0032.f1745(var31, var32);
                                                                                                if (module0254.NIL != module0032.f1746(var32, var33)) {
                                                                                                    var18_58 = module0141.$g1691$.currentBinding(var6);
                                                                                                    try {
                                                                                                        module0141.$g1691$.bind((SubLObject)module0254.NIL, var6);
                                                                                                        try {
                                                                                                            var18_59 = module0141.$g1670$.currentBinding(var6);
                                                                                                            var21_54 = module0141.$g1671$.currentBinding(var6);
                                                                                                            var22_53 = module0141.$g1672$.currentBinding(var6);
                                                                                                            var23_63 = module0141.$g1674$.currentBinding(var6);
                                                                                                            var26_64 = module0137.$g1605$.currentBinding(var6);
                                                                                                            try {
                                                                                                                module0141.$g1670$.bind(var7, var6);
                                                                                                                module0141.$g1671$.bind(module0244.f15739(var7), var6);
                                                                                                                module0141.$g1672$.bind(module0244.f15746(var7), var6);
                                                                                                                module0141.$g1674$.bind((SubLObject)module0254.NIL, var6);
                                                                                                                module0137.$g1605$.bind(var7, var6);
                                                                                                                module0250.f16167(var33);
                                                                                                            }
                                                                                                            finally {
                                                                                                                module0137.$g1605$.rebind(var26_64, var6);
                                                                                                                module0141.$g1674$.rebind(var23_63, var6);
                                                                                                                module0141.$g1672$.rebind(var22_53, var6);
                                                                                                                module0141.$g1671$.rebind(var21_54, var6);
                                                                                                                module0141.$g1670$.rebind(var18_59, var6);
                                                                                                            }
                                                                                                        }
                                                                                                        finally {
                                                                                                            var18_60 = Threads.$is_thread_performing_cleanupP$.currentBinding(var6);
                                                                                                            try {
                                                                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0254.T, var6);
                                                                                                                var9 = module0141.$g1691$.getDynamicValue(var6);
                                                                                                            }
                                                                                                            finally {
                                                                                                                Threads.$is_thread_performing_cleanupP$.rebind(var18_60, var6);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    finally {
                                                                                                        module0141.$g1691$.rebind(var18_58, var6);
                                                                                                    }
                                                                                                    var8 = ConsesLow.append(var9, var8);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var29.isList()) {
                                                                                            SubLObject var34 = var29;
                                                                                            SubLObject var35 = (SubLObject)module0254.NIL;
                                                                                            var35 = var34.first();
                                                                                            while (module0254.NIL != var34) {
                                                                                                final SubLObject var18_61 = module0141.$g1691$.currentBinding(var6);
                                                                                                try {
                                                                                                    module0141.$g1691$.bind((SubLObject)module0254.NIL, var6);
                                                                                                    try {
                                                                                                        final SubLObject var18_62 = module0141.$g1670$.currentBinding(var6);
                                                                                                        final SubLObject var21_55 = module0141.$g1671$.currentBinding(var6);
                                                                                                        final SubLObject var22_54 = module0141.$g1672$.currentBinding(var6);
                                                                                                        final SubLObject var23_64 = module0141.$g1674$.currentBinding(var6);
                                                                                                        final SubLObject var26_65 = module0137.$g1605$.currentBinding(var6);
                                                                                                        try {
                                                                                                            module0141.$g1670$.bind(var7, var6);
                                                                                                            module0141.$g1671$.bind(module0244.f15739(var7), var6);
                                                                                                            module0141.$g1672$.bind(module0244.f15746(var7), var6);
                                                                                                            module0141.$g1674$.bind((SubLObject)module0254.NIL, var6);
                                                                                                            module0137.$g1605$.bind(var7, var6);
                                                                                                            module0250.f16167(var35);
                                                                                                        }
                                                                                                        finally {
                                                                                                            module0137.$g1605$.rebind(var26_65, var6);
                                                                                                            module0141.$g1674$.rebind(var23_64, var6);
                                                                                                            module0141.$g1672$.rebind(var22_54, var6);
                                                                                                            module0141.$g1671$.rebind(var21_55, var6);
                                                                                                            module0141.$g1670$.rebind(var18_62, var6);
                                                                                                        }
                                                                                                    }
                                                                                                    finally {
                                                                                                        final SubLObject var18_63 = Threads.$is_thread_performing_cleanupP$.currentBinding(var6);
                                                                                                        try {
                                                                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0254.T, var6);
                                                                                                            var9 = module0141.$g1691$.getDynamicValue(var6);
                                                                                                        }
                                                                                                        finally {
                                                                                                            Threads.$is_thread_performing_cleanupP$.rebind(var18_63, var6);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                finally {
                                                                                                    module0141.$g1691$.rebind(var18_61, var6);
                                                                                                }
                                                                                                var8 = ConsesLow.append(var9, var8);
                                                                                                var34 = var34.rest();
                                                                                                var35 = var34.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)module0254.$ic20$, var29);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var18_57, var6);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var73_78);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var18_56, var6);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var26);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)module0254.FIVE_INTEGER, (SubLObject)module0254.$ic21$, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (module0254.NIL != module0155.f9785(var69_70, (SubLObject)module0254.UNPROVIDED)) {
                                                        SubLObject var44_104;
                                                        final SubLObject var36 = var44_104 = ((module0254.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var6), module0137.f8955((SubLObject)module0254.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var6), module0137.f8955((SubLObject)module0254.UNPROVIDED)));
                                                        SubLObject var37 = (SubLObject)module0254.NIL;
                                                        var37 = var44_104.first();
                                                        while (module0254.NIL != var44_104) {
                                                            final SubLObject var18_64 = module0138.$g1625$.currentBinding(var6);
                                                            try {
                                                                module0138.$g1625$.bind(var37, var6);
                                                                final SubLObject var39;
                                                                final SubLObject var38 = var39 = Functions.funcall(var37, var69_70);
                                                                if (module0254.NIL != module0077.f5302(var39)) {
                                                                    final SubLObject var40 = module0077.f5333(var39);
                                                                    SubLObject var41;
                                                                    SubLObject var42;
                                                                    SubLObject var43;
                                                                    SubLObject var18_65;
                                                                    SubLObject var18_66;
                                                                    SubLObject var21_56;
                                                                    SubLObject var22_55;
                                                                    SubLObject var23_65;
                                                                    SubLObject var26_66;
                                                                    SubLObject var18_67;
                                                                    for (var41 = module0032.f1741(var40), var42 = (SubLObject)module0254.NIL, var42 = module0032.f1742(var41, var40); module0254.NIL == module0032.f1744(var41, var42); var42 = module0032.f1743(var42)) {
                                                                        var43 = module0032.f1745(var41, var42);
                                                                        if (module0254.NIL != module0032.f1746(var42, var43)) {
                                                                            var18_65 = module0141.$g1691$.currentBinding(var6);
                                                                            try {
                                                                                module0141.$g1691$.bind((SubLObject)module0254.NIL, var6);
                                                                                try {
                                                                                    var18_66 = module0141.$g1670$.currentBinding(var6);
                                                                                    var21_56 = module0141.$g1671$.currentBinding(var6);
                                                                                    var22_55 = module0141.$g1672$.currentBinding(var6);
                                                                                    var23_65 = module0141.$g1674$.currentBinding(var6);
                                                                                    var26_66 = module0137.$g1605$.currentBinding(var6);
                                                                                    try {
                                                                                        module0141.$g1670$.bind(var7, var6);
                                                                                        module0141.$g1671$.bind(module0244.f15739(var7), var6);
                                                                                        module0141.$g1672$.bind(module0244.f15746(var7), var6);
                                                                                        module0141.$g1674$.bind((SubLObject)module0254.NIL, var6);
                                                                                        module0137.$g1605$.bind(var7, var6);
                                                                                        module0250.f16167(var43);
                                                                                    }
                                                                                    finally {
                                                                                        module0137.$g1605$.rebind(var26_66, var6);
                                                                                        module0141.$g1674$.rebind(var23_65, var6);
                                                                                        module0141.$g1672$.rebind(var22_55, var6);
                                                                                        module0141.$g1671$.rebind(var21_56, var6);
                                                                                        module0141.$g1670$.rebind(var18_66, var6);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    var18_67 = Threads.$is_thread_performing_cleanupP$.currentBinding(var6);
                                                                                    try {
                                                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0254.T, var6);
                                                                                        var9 = module0141.$g1691$.getDynamicValue(var6);
                                                                                    }
                                                                                    finally {
                                                                                        Threads.$is_thread_performing_cleanupP$.rebind(var18_67, var6);
                                                                                    }
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0141.$g1691$.rebind(var18_65, var6);
                                                                            }
                                                                            var8 = ConsesLow.append(var9, var8);
                                                                        }
                                                                    }
                                                                }
                                                                else if (var39.isList()) {
                                                                    SubLObject var44 = var39;
                                                                    SubLObject var45 = (SubLObject)module0254.NIL;
                                                                    var45 = var44.first();
                                                                    while (module0254.NIL != var44) {
                                                                        final SubLObject var18_68 = module0141.$g1691$.currentBinding(var6);
                                                                        try {
                                                                            module0141.$g1691$.bind((SubLObject)module0254.NIL, var6);
                                                                            try {
                                                                                final SubLObject var18_69 = module0141.$g1670$.currentBinding(var6);
                                                                                final SubLObject var21_57 = module0141.$g1671$.currentBinding(var6);
                                                                                final SubLObject var22_56 = module0141.$g1672$.currentBinding(var6);
                                                                                final SubLObject var23_66 = module0141.$g1674$.currentBinding(var6);
                                                                                final SubLObject var26_67 = module0137.$g1605$.currentBinding(var6);
                                                                                try {
                                                                                    module0141.$g1670$.bind(var7, var6);
                                                                                    module0141.$g1671$.bind(module0244.f15739(var7), var6);
                                                                                    module0141.$g1672$.bind(module0244.f15746(var7), var6);
                                                                                    module0141.$g1674$.bind((SubLObject)module0254.NIL, var6);
                                                                                    module0137.$g1605$.bind(var7, var6);
                                                                                    module0250.f16167(var45);
                                                                                }
                                                                                finally {
                                                                                    module0137.$g1605$.rebind(var26_67, var6);
                                                                                    module0141.$g1674$.rebind(var23_66, var6);
                                                                                    module0141.$g1672$.rebind(var22_56, var6);
                                                                                    module0141.$g1671$.rebind(var21_57, var6);
                                                                                    module0141.$g1670$.rebind(var18_69, var6);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                final SubLObject var18_70 = Threads.$is_thread_performing_cleanupP$.currentBinding(var6);
                                                                                try {
                                                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0254.T, var6);
                                                                                    var9 = module0141.$g1691$.getDynamicValue(var6);
                                                                                }
                                                                                finally {
                                                                                    Threads.$is_thread_performing_cleanupP$.rebind(var18_70, var6);
                                                                                }
                                                                            }
                                                                        }
                                                                        finally {
                                                                            module0141.$g1691$.rebind(var18_68, var6);
                                                                        }
                                                                        var8 = ConsesLow.append(var9, var8);
                                                                        var44 = var44.rest();
                                                                        var45 = var44.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)module0254.$ic20$, var39);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var18_64, var6);
                                                            }
                                                            var44_104 = var44_104.rest();
                                                            var37 = var44_104.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var21_53, var6);
                                                    module0137.$g1605$.rebind(var18_55, var6);
                                                }
                                                var22 = var22.rest();
                                                var23 = var22.first();
                                            }
                                        }
                                        finally {
                                            module0139.$g1644$.rebind(var18_54, var6);
                                        }
                                    }
                                    finally {
                                        if (module0254.NIL != var20) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var19);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var26_63, var6);
                                    module0141.$g1684$.rebind(var23_62, var6);
                                    module0141.$g1683$.rebind(var22_52, var6);
                                    module0141.$g1686$.rebind(var21_52, var6);
                                    module0141.$g1685$.rebind(var18_53, var6);
                                }
                                if (var18 == module0254.$ic11$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var6));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var18_52, var6);
                            }
                            if (var18 == module0254.$ic11$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var6));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var18_51, var6);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var22_51, var6);
                        module0141.$g1677$.rebind(var21_51, var6);
                        module0141.$g1710$.rebind(var18_50, var6);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var21_50, var6);
                    module0141.$g1714$.rebind(var18_49, var6);
                }
            }
            finally {
                module0147.$g2096$.rebind(var22_50, var6);
                module0147.$g2094$.rebind(var21_49, var6);
                module0147.$g2095$.rebind(var18_48, var6);
            }
        }
        finally {
            module0137.$g1605$.rebind(var14, var6);
            module0141.$g1674$.rebind(var13, var6);
            module0141.$g1672$.rebind(var12, var6);
            module0141.$g1671$.rebind(var11, var6);
            module0141.$g1670$.rebind(var10, var6);
        }
        return Sequences.remove_duplicates(var8, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED);
    }
    
    public static SubLObject f16474(final SubLObject var1, final SubLObject var3, SubLObject var4, SubLObject var5) {
        if (var4 == module0254.UNPROVIDED) {
            var4 = (SubLObject)module0254.NIL;
        }
        if (var5 == module0254.UNPROVIDED) {
            var5 = (SubLObject)module0254.NIL;
        }
        assert module0254.NIL != module0137.f8885(var1) : var1;
        final SubLObject var6 = module0248.f15931(var1, var3, var4, var5, (SubLObject)module0254.UNPROVIDED);
        SubLObject var7 = (SubLObject)module0254.NIL;
        SubLObject var8 = var6;
        SubLObject var9 = (SubLObject)module0254.NIL;
        var9 = var8.first();
        while (module0254.NIL != var8) {
            var7 = ConsesLow.append(f16459(module0244.f15771(var1), var9, var4, var5), var7);
            var8 = var8.rest();
            var9 = var8.first();
        }
        return Sequences.remove_duplicates(var7, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED);
    }
    
    public static SubLObject f16475(final SubLObject var1, final SubLObject var3, SubLObject var4, SubLObject var5) {
        if (var4 == module0254.UNPROVIDED) {
            var4 = (SubLObject)module0254.NIL;
        }
        if (var5 == module0254.UNPROVIDED) {
            var5 = (SubLObject)module0254.NIL;
        }
        assert module0254.NIL != module0137.f8885(var1) : var1;
        final SubLObject var6 = module0244.f15769(module0244.f15771(var1));
        final SubLObject var7 = module0252.f16245(var6, var3, var4, var5);
        SubLObject var8 = (SubLObject)module0254.NIL;
        var8 = module0252.f16254(var1, var7, var4, var5);
        return var8;
    }
    
    public static SubLObject f16476(final SubLObject var1, final SubLObject var3, SubLObject var4, SubLObject var5) {
        if (var4 == module0254.UNPROVIDED) {
            var4 = (SubLObject)module0254.NIL;
        }
        if (var5 == module0254.UNPROVIDED) {
            var5 = (SubLObject)module0254.NIL;
        }
        assert module0254.NIL != module0137.f8885(var1) : var1;
        final SubLObject var6 = module0244.f15771(var1);
        final SubLObject var7 = f16459(var6, var3, var4, var5);
        SubLObject var8 = (SubLObject)module0254.NIL;
        var8 = module0252.f16254(var1, var7, var4, var5);
        return var8;
    }
    
    public static SubLObject f16477(final SubLObject var1, final SubLObject var3, SubLObject var4, SubLObject var5) {
        if (var4 == module0254.UNPROVIDED) {
            var4 = (SubLObject)module0254.NIL;
        }
        if (var5 == module0254.UNPROVIDED) {
            var5 = (SubLObject)module0254.NIL;
        }
        final SubLThread var6 = SubLProcess.currentSubLThread();
        assert module0254.NIL != module0137.f8885(var1) : var1;
        SubLObject var7 = (SubLObject)module0254.NIL;
        final SubLObject var8 = module0141.$g1670$.currentBinding(var6);
        final SubLObject var9 = module0141.$g1671$.currentBinding(var6);
        final SubLObject var10 = module0141.$g1672$.currentBinding(var6);
        final SubLObject var11 = module0141.$g1674$.currentBinding(var6);
        final SubLObject var12 = module0137.$g1605$.currentBinding(var6);
        try {
            module0141.$g1670$.bind(var1, var6);
            module0141.$g1671$.bind(module0244.f15739(var1), var6);
            module0141.$g1672$.bind(module0244.f15746(var1), var6);
            module0141.$g1674$.bind((SubLObject)module0254.NIL, var6);
            module0137.$g1605$.bind(var1, var6);
            if (module0254.NIL != module0244.f15761(var1)) {
                SubLObject var13 = (SubLObject)module0254.NIL;
                SubLObject var14 = (SubLObject)module0254.NIL;
                SubLObject var15 = (SubLObject)module0254.NIL;
                var13 = module0252.f16247(var1, var3, var4, var5);
                var14 = f16470(var1, var3, var4, var5);
                var15 = (SubLObject)((module0254.NIL != module0258.f16731()) ? module0254.NIL : f16472(var1, var3, var4, var5));
                var7 = ConsesLow.append(var13, var14, var15);
            }
            else if (module0254.NIL != module0244.f15770(var1)) {
                SubLObject var13 = (SubLObject)module0254.NIL;
                SubLObject var16 = (SubLObject)module0254.NIL;
                SubLObject var17 = (SubLObject)module0254.NIL;
                var13 = module0252.f16247(var1, var3, var4, var5);
                var16 = f16473(var1, var3, var4, var5);
                var17 = (SubLObject)((module0254.NIL != module0258.f16731()) ? module0254.NIL : f16474(var1, var3, var4, var5));
                var7 = ConsesLow.append(var13, var16, var17);
            }
            else {
                module0136.f8870((SubLObject)module0254.ONE_INTEGER, (SubLObject)module0254.$ic22$, var1, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED);
            }
        }
        finally {
            module0137.$g1605$.rebind(var12, var6);
            module0141.$g1674$.rebind(var11, var6);
            module0141.$g1672$.rebind(var10, var6);
            module0141.$g1671$.rebind(var9, var6);
            module0141.$g1670$.rebind(var8, var6);
        }
        return Sequences.remove_duplicates(var7, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED);
    }
    
    public static SubLObject f16478(final SubLObject var1, final SubLObject var3, SubLObject var4, SubLObject var5) {
        if (var4 == module0254.UNPROVIDED) {
            var4 = (SubLObject)module0254.NIL;
        }
        if (var5 == module0254.UNPROVIDED) {
            var5 = (SubLObject)module0254.NIL;
        }
        final SubLThread var6 = SubLProcess.currentSubLThread();
        assert module0254.NIL != module0137.f8885(var1) : var1;
        SubLObject var7 = (SubLObject)module0254.NIL;
        final SubLObject var8 = module0141.$g1670$.currentBinding(var6);
        final SubLObject var9 = module0141.$g1671$.currentBinding(var6);
        final SubLObject var10 = module0141.$g1672$.currentBinding(var6);
        final SubLObject var11 = module0141.$g1674$.currentBinding(var6);
        final SubLObject var12 = module0137.$g1605$.currentBinding(var6);
        try {
            module0141.$g1670$.bind(var1, var6);
            module0141.$g1671$.bind(module0244.f15739(var1), var6);
            module0141.$g1672$.bind(module0244.f15746(var1), var6);
            module0141.$g1674$.bind((SubLObject)module0254.NIL, var6);
            module0137.$g1605$.bind(var1, var6);
            if (module0254.NIL != module0244.f15761(var1)) {
                SubLObject var13 = (SubLObject)module0254.NIL;
                SubLObject var14 = (SubLObject)module0254.NIL;
                SubLObject var15 = (SubLObject)module0254.NIL;
                var13 = module0252.f16249(var1, var3, var4, var5);
                var14 = module0252.f16245(module0244.f15769(module0141.f9188()), var3, var4, var5);
                var15 = (SubLObject)((module0254.NIL != module0258.f16731()) ? module0254.NIL : f16459(var1, var3, var4, var5));
                var7 = ConsesLow.append(var13, var14, var15);
            }
            else if (module0254.NIL != module0244.f15770(var1)) {
                SubLObject var13 = (SubLObject)module0254.NIL;
                SubLObject var16 = (SubLObject)module0254.NIL;
                SubLObject var17 = (SubLObject)module0254.NIL;
                var13 = module0252.f16249(var1, var3, var4, var5);
                var16 = f16475(var1, var3, var4, var5);
                var17 = (SubLObject)((module0254.NIL != module0258.f16731()) ? module0254.NIL : f16476(var1, var3, var4, var5));
                var7 = ConsesLow.append(var13, var16, var17);
            }
            else {
                module0136.f8870((SubLObject)module0254.ONE_INTEGER, (SubLObject)module0254.$ic22$, var1, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED);
            }
        }
        finally {
            module0137.$g1605$.rebind(var12, var6);
            module0141.$g1674$.rebind(var11, var6);
            module0141.$g1672$.rebind(var10, var6);
            module0141.$g1671$.rebind(var9, var6);
            module0141.$g1670$.rebind(var8, var6);
        }
        return Sequences.remove_duplicates(var7, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED);
    }
    
    public static SubLObject f16479(final SubLObject var1, final SubLObject var3, SubLObject var4, SubLObject var5) {
        if (var4 == module0254.UNPROVIDED) {
            var4 = (SubLObject)module0254.NIL;
        }
        if (var5 == module0254.UNPROVIDED) {
            var5 = (SubLObject)module0254.NIL;
        }
        assert module0254.NIL != module0137.f8885(var1) : var1;
        final SubLObject var6 = module0244.f15773(var1);
        SubLObject var7 = (SubLObject)module0254.NIL;
        SubLObject var8 = (SubLObject)module0254.NIL;
        var7 = module0252.f16245(var1, var3, var4, var5);
        var8 = (SubLObject)((module0254.NIL != module0258.f16731()) ? module0254.NIL : f16459(var6, var3, var4, var5));
        return conses_high.nunion(var7, var8, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED);
    }
    
    public static SubLObject f16480(final SubLObject var1, final SubLObject var3, SubLObject var4, SubLObject var5) {
        if (var4 == module0254.UNPROVIDED) {
            var4 = (SubLObject)module0254.NIL;
        }
        if (var5 == module0254.UNPROVIDED) {
            var5 = (SubLObject)module0254.NIL;
        }
        assert module0254.NIL != module0137.f8885(var1) : var1;
        final SubLObject var6 = module0244.f15773(var1);
        SubLObject var7 = (SubLObject)module0254.NIL;
        SubLObject var8 = (SubLObject)module0254.NIL;
        var7 = module0252.f16259(var1, var3, var4, var5);
        var8 = (SubLObject)((module0254.NIL != module0258.f16731()) ? module0254.NIL : f16461(var6, var3, var4, var5));
        return module0252.f16260(var6, ConsesLow.nconc(var7, var8), var4, var5, (SubLObject)module0254.UNPROVIDED);
    }
    
    public static SubLObject f16481(final SubLObject var1, final SubLObject var3, final SubLObject var137, SubLObject var4, SubLObject var5) {
        if (var4 == module0254.UNPROVIDED) {
            var4 = (SubLObject)module0254.NIL;
        }
        if (var5 == module0254.UNPROVIDED) {
            var5 = (SubLObject)module0254.NIL;
        }
        final SubLThread var138 = SubLProcess.currentSubLThread();
        assert module0254.NIL != module0137.f8885(var1) : var1;
        final SubLObject var139 = module0244.f15769(var1);
        SubLObject var140 = (SubLObject)module0254.NIL;
        if (module0254.NIL != var139) {
            final SubLObject var141 = module0141.$g1670$.currentBinding(var138);
            final SubLObject var142 = module0141.$g1671$.currentBinding(var138);
            final SubLObject var143 = module0141.$g1672$.currentBinding(var138);
            final SubLObject var144 = module0141.$g1674$.currentBinding(var138);
            final SubLObject var145 = module0137.$g1605$.currentBinding(var138);
            final SubLObject var146 = module0141.$g1664$.currentBinding(var138);
            try {
                module0141.$g1670$.bind(var139, var138);
                module0141.$g1671$.bind(module0244.f15739(var139), var138);
                module0141.$g1672$.bind(module0244.f15746(var139), var138);
                module0141.$g1674$.bind((SubLObject)module0254.NIL, var138);
                module0137.$g1605$.bind(var139, var138);
                module0141.$g1664$.bind((SubLObject)module0254.$ic23$, var138);
                final SubLObject var147 = var4;
                final SubLObject var18_138 = module0147.$g2095$.currentBinding(var138);
                final SubLObject var21_139 = module0147.$g2094$.currentBinding(var138);
                final SubLObject var22_140 = module0147.$g2096$.currentBinding(var138);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var147), var138);
                    module0147.$g2094$.bind(module0147.f9546(var147), var138);
                    module0147.$g2096$.bind(module0147.f9549(var147), var138);
                    final SubLObject var148 = var5;
                    final SubLObject var18_139 = module0141.$g1714$.currentBinding(var138);
                    final SubLObject var21_140 = module0141.$g1715$.currentBinding(var138);
                    try {
                        module0141.$g1714$.bind((module0254.NIL != var148) ? var148 : module0141.f9283(), var138);
                        module0141.$g1715$.bind((SubLObject)((module0254.NIL != var148) ? module0254.$ic12$ : module0141.$g1715$.getDynamicValue(var138)), var138);
                        if (module0254.NIL != var148 && module0254.NIL != module0136.f8864() && module0254.NIL == module0141.f9279(var148)) {
                            final SubLObject var149 = module0136.$g1591$.getDynamicValue(var138);
                            if (var149.eql((SubLObject)module0254.$ic13$)) {
                                module0136.f8870((SubLObject)module0254.ONE_INTEGER, (SubLObject)module0254.$ic14$, var148, (SubLObject)module0254.$ic15$, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED);
                            }
                            else if (var149.eql((SubLObject)module0254.$ic16$)) {
                                module0136.f8871((SubLObject)module0254.ONE_INTEGER, (SubLObject)module0254.$ic17$, (SubLObject)module0254.$ic14$, var148, (SubLObject)module0254.$ic15$, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED);
                            }
                            else if (var149.eql((SubLObject)module0254.$ic18$)) {
                                Errors.warn((SubLObject)module0254.$ic14$, var148, (SubLObject)module0254.$ic15$);
                            }
                            else {
                                Errors.warn((SubLObject)module0254.$ic19$, module0136.$g1591$.getDynamicValue(var138));
                                Errors.cerror((SubLObject)module0254.$ic17$, (SubLObject)module0254.$ic14$, var148, (SubLObject)module0254.$ic15$);
                            }
                        }
                        final SubLObject var18_140 = module0141.$g1710$.currentBinding(var138);
                        final SubLObject var21_141 = module0141.$g1677$.currentBinding(var138);
                        final SubLObject var22_141 = module0138.$g1619$.currentBinding(var138);
                        try {
                            module0141.$g1710$.bind(module0254.$ic9$, var138);
                            module0141.$g1677$.bind(module0141.f9210(), var138);
                            module0138.$g1619$.bind(module0244.f15780(module0137.f8955((SubLObject)module0254.UNPROVIDED)), var138);
                            final SubLObject var150 = module0139.f9036();
                            final SubLObject var18_141 = module0139.$g1635$.currentBinding(var138);
                            try {
                                module0139.$g1635$.bind((var150 == module0254.$ic10$) ? module0139.$g1635$.getDynamicValue(var138) : module0139.f9038(var150), var138);
                                final SubLObject var18_142 = module0139.$g1636$.currentBinding(var138);
                                try {
                                    module0139.$g1636$.bind((var150 == module0254.$ic10$) ? module0139.$g1636$.getDynamicValue(var138) : module0139.f9038(var150), var138);
                                    final SubLObject var18_143 = module0141.$g1685$.currentBinding(var138);
                                    final SubLObject var21_142 = module0141.$g1686$.currentBinding(var138);
                                    final SubLObject var22_142 = module0141.$g1683$.currentBinding(var138);
                                    final SubLObject var23_151 = module0141.$g1684$.currentBinding(var138);
                                    final SubLObject var26_152 = module0141.$g1674$.currentBinding(var138);
                                    try {
                                        module0141.$g1685$.bind((SubLObject)module0254.NIL, var138);
                                        module0141.$g1686$.bind((SubLObject)module0254.NIL, var138);
                                        module0141.$g1683$.bind((SubLObject)module0254.NIL, var138);
                                        module0141.$g1684$.bind((SubLObject)module0254.NIL, var138);
                                        module0141.$g1674$.bind((SubLObject)module0254.NIL, var138);
                                        final SubLObject var151 = module0138.$g1626$.getGlobalValue();
                                        SubLObject var152 = (SubLObject)module0254.NIL;
                                        try {
                                            var152 = ReadWriteLocks.rw_lock_seize_read_lock(var151);
                                            final SubLObject var153 = module0250.f16097();
                                            SubLObject var154 = (SubLObject)module0254.$ic24$;
                                            SubLObject var155 = module0139.$g1635$.getDynamicValue(var138);
                                            if (module0254.NIL != var153) {
                                                final SubLObject var18_144 = module0137.$g1605$.currentBinding(var138);
                                                final SubLObject var21_143 = module0141.$g1674$.currentBinding(var138);
                                                try {
                                                    module0137.$g1605$.bind(module0244.f15771(module0141.f9188()), var138);
                                                    module0141.$g1674$.bind((SubLObject)(module0244.f15736(module0141.f9188()).eql(module0254.$ic25$) ? module0254.T : module0141.$g1674$.getDynamicValue(var138)), var138);
                                                    module0251.f16199(var137);
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var21_143, var138);
                                                    module0137.$g1605$.rebind(var18_144, var138);
                                                }
                                                var154 = (SubLObject)module0254.$ic26$;
                                                var155 = module0139.$g1636$.getDynamicValue(var138);
                                            }
                                            final SubLObject var18_145 = module0141.$g1683$.currentBinding(var138);
                                            final SubLObject var21_144 = module0141.$g1674$.currentBinding(var138);
                                            final SubLObject var22_143 = module0141.$g1693$.currentBinding(var138);
                                            final SubLObject var23_152 = module0141.$g1688$.currentBinding(var138);
                                            final SubLObject var26_153 = module0139.$g1645$.currentBinding(var138);
                                            final SubLObject var27_164 = module0141.$g1691$.currentBinding(var138);
                                            try {
                                                module0141.$g1683$.bind((SubLObject)module0254.NIL, var138);
                                                module0141.$g1674$.bind((SubLObject)module0254.NIL, var138);
                                                module0141.$g1693$.bind(var154, var138);
                                                module0141.$g1688$.bind(var137, var138);
                                                module0139.$g1645$.bind(var155, var138);
                                                module0141.$g1691$.bind((SubLObject)module0254.NIL, var138);
                                                try {
                                                    final SubLObject var18_146 = module0139.$g1646$.currentBinding(var138);
                                                    try {
                                                        module0139.$g1646$.bind(module0139.f9007(), var138);
                                                        module0250.f16193(var3);
                                                        module0139.f9011(module0139.$g1646$.getDynamicValue(var138));
                                                    }
                                                    finally {
                                                        module0139.$g1646$.rebind(var18_146, var138);
                                                    }
                                                }
                                                finally {
                                                    final SubLObject var18_147 = Threads.$is_thread_performing_cleanupP$.currentBinding(var138);
                                                    try {
                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0254.T, var138);
                                                        var140 = module0141.$g1691$.getDynamicValue(var138);
                                                    }
                                                    finally {
                                                        Threads.$is_thread_performing_cleanupP$.rebind(var18_147, var138);
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1691$.rebind(var27_164, var138);
                                                module0139.$g1645$.rebind(var26_153, var138);
                                                module0141.$g1688$.rebind(var23_152, var138);
                                                module0141.$g1693$.rebind(var22_143, var138);
                                                module0141.$g1674$.rebind(var21_144, var138);
                                                module0141.$g1683$.rebind(var18_145, var138);
                                            }
                                        }
                                        finally {
                                            if (module0254.NIL != var152) {
                                                ReadWriteLocks.rw_lock_release_read_lock(var151);
                                            }
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var26_152, var138);
                                        module0141.$g1684$.rebind(var23_151, var138);
                                        module0141.$g1683$.rebind(var22_142, var138);
                                        module0141.$g1686$.rebind(var21_142, var138);
                                        module0141.$g1685$.rebind(var18_143, var138);
                                    }
                                    if (var150 == module0254.$ic11$) {
                                        module0139.f9012(module0139.$g1636$.getDynamicValue(var138));
                                    }
                                }
                                finally {
                                    module0139.$g1636$.rebind(var18_142, var138);
                                }
                                if (var150 == module0254.$ic11$) {
                                    module0139.f9012(module0139.$g1635$.getDynamicValue(var138));
                                }
                            }
                            finally {
                                module0139.$g1635$.rebind(var18_141, var138);
                            }
                        }
                        finally {
                            module0138.$g1619$.rebind(var22_141, var138);
                            module0141.$g1677$.rebind(var21_141, var138);
                            module0141.$g1710$.rebind(var18_140, var138);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var21_140, var138);
                        module0141.$g1714$.rebind(var18_139, var138);
                    }
                }
                finally {
                    module0147.$g2096$.rebind(var22_140, var138);
                    module0147.$g2094$.rebind(var21_139, var138);
                    module0147.$g2095$.rebind(var18_138, var138);
                }
            }
            finally {
                module0141.$g1664$.rebind(var146, var138);
                module0137.$g1605$.rebind(var145, var138);
                module0141.$g1674$.rebind(var144, var138);
                module0141.$g1672$.rebind(var143, var138);
                module0141.$g1671$.rebind(var142, var138);
                module0141.$g1670$.rebind(var141, var138);
            }
        }
        return var140;
    }
    
    public static SubLObject f16482(final SubLObject var1, final SubLObject var3, final SubLObject var137, SubLObject var4, SubLObject var5) {
        if (var4 == module0254.UNPROVIDED) {
            var4 = (SubLObject)module0254.NIL;
        }
        if (var5 == module0254.UNPROVIDED) {
            var5 = (SubLObject)module0254.NIL;
        }
        final SubLThread var138 = SubLProcess.currentSubLThread();
        assert module0254.NIL != module0137.f8885(var1) : var1;
        final SubLObject var139 = module0244.f15771(var1);
        final SubLObject var140 = module0244.f15769(var139);
        final SubLObject var141 = module0248.f15931(var1, var3, var4, var5, (SubLObject)module0254.UNPROVIDED);
        SubLObject var142 = (SubLObject)module0254.NIL;
        var142 = module0252.f16360(var140, var141, var137, var4, var5);
        if (module0254.NIL != module0141.f9168() && module0254.NIL != module0141.$g1692$.getDynamicValue(var138)) {
            module0141.f9180();
            final SubLObject var143 = conses_high.second(module0141.$g1692$.getDynamicValue(var138).first().first());
            module0141.$g1692$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0137.f8917(var1), var3, var143), (module0254.NIL != var4) ? var4 : module0147.$g2095$.getDynamicValue(var138), (module0254.NIL != var5) ? module0141.f9291(var5) : module0141.f9293()), module0141.$g1692$.getDynamicValue(var138)), var138);
        }
        return var142;
    }
    
    public static SubLObject f16483(final SubLObject var1, final SubLObject var3, final SubLObject var137, SubLObject var4, SubLObject var5) {
        if (var4 == module0254.UNPROVIDED) {
            var4 = (SubLObject)module0254.NIL;
        }
        if (var5 == module0254.UNPROVIDED) {
            var5 = (SubLObject)module0254.NIL;
        }
        assert module0254.NIL != module0137.f8885(var1) : var1;
        final SubLObject var138 = f16468(var1);
        SubLObject var139 = (SubLObject)module0254.NIL;
        if (module0254.NIL != var138) {
            final SubLObject var140 = module0077.f5323(module0252.f16248(var1, var3, var4, var5));
            SubLObject var141 = (SubLObject)module0254.NIL;
            if (module0254.NIL == var141) {
                SubLObject var142 = (SubLObject)ConsesLow.cons(var3, var140);
                SubLObject var143 = (SubLObject)module0254.NIL;
                var143 = var142.first();
                while (module0254.NIL == var141 && module0254.NIL != var142) {
                    var139 = Functions.funcall(var138, var143, var137, var4);
                    if (module0254.NIL != var139) {
                        if (!var3.eql(var143)) {
                            var139 = ConsesLow.nconc(module0250.f16108((SubLObject)module0254.$ic27$, var1, var143, var3, var4, var5, (SubLObject)module0254.NIL, (SubLObject)module0254.T), var139);
                        }
                        module0141.f9182();
                        var141 = (SubLObject)module0254.T;
                    }
                    var142 = var142.rest();
                    var143 = var142.first();
                }
            }
        }
        return var139;
    }
    
    public static SubLObject f16484(final SubLObject var1, final SubLObject var3, final SubLObject var137, SubLObject var4, SubLObject var5) {
        if (var4 == module0254.UNPROVIDED) {
            var4 = (SubLObject)module0254.NIL;
        }
        if (var5 == module0254.UNPROVIDED) {
            var5 = (SubLObject)module0254.NIL;
        }
        assert module0254.NIL != module0137.f8885(var1) : var1;
        final SubLObject var138 = f16462(var1);
        SubLObject var139 = (SubLObject)module0254.NIL;
        if (module0254.NIL != var138) {
            final SubLObject var140 = module0252.f16248(var1, var3, var4, var5);
            SubLObject var141 = (SubLObject)module0254.NIL;
            final SubLObject var142 = var140;
            if (module0254.NIL != module0077.f5302(var142)) {
                final SubLObject var143 = module0077.f5333(var142);
                SubLObject var144;
                SubLObject var145;
                SubLObject var146;
                for (var144 = module0032.f1741(var143), var145 = (SubLObject)module0254.NIL, var145 = module0032.f1742(var144, var143); module0254.NIL == var141 && module0254.NIL == module0032.f1744(var144, var145); var145 = module0032.f1743(var145)) {
                    var146 = module0032.f1745(var144, var145);
                    if (module0254.NIL != module0032.f1746(var145, var146)) {
                        var139 = Functions.funcall(var138, var146, var137, var4);
                        if (module0254.NIL != var139) {
                            var141 = (SubLObject)module0254.T;
                        }
                    }
                }
            }
            else if (var142.isList()) {
                if (module0254.NIL == var141) {
                    SubLObject var147 = var142;
                    SubLObject var148 = (SubLObject)module0254.NIL;
                    var148 = var147.first();
                    while (module0254.NIL == var141 && module0254.NIL != var147) {
                        var139 = Functions.funcall(var138, var148, var137, var4);
                        if (module0254.NIL != var139) {
                            var141 = (SubLObject)module0254.T;
                        }
                        var147 = var147.rest();
                        var148 = var147.first();
                    }
                }
            }
            else {
                Errors.error((SubLObject)module0254.$ic20$, var142);
            }
        }
        return var139;
    }
    
    public static SubLObject f16485(final SubLObject var1, final SubLObject var3, final SubLObject var137, SubLObject var4, SubLObject var5) {
        if (var4 == module0254.UNPROVIDED) {
            var4 = (SubLObject)module0254.NIL;
        }
        if (var5 == module0254.UNPROVIDED) {
            var5 = (SubLObject)module0254.NIL;
        }
        assert module0254.NIL != module0137.f8885(var1) : var1;
        final SubLObject var138 = module0244.f15771(var1);
        final SubLObject var139 = f16462(var138);
        final SubLObject var140 = module0248.f15931(var1, var3, var4, var5, (SubLObject)module0254.UNPROVIDED);
        SubLObject var141 = (SubLObject)module0254.NIL;
        final SubLObject var142 = var140;
        if (module0254.NIL != module0077.f5302(var142)) {
            final SubLObject var143 = module0077.f5333(var142);
            SubLObject var144;
            SubLObject var145;
            SubLObject var146;
            for (var144 = module0032.f1741(var143), var145 = (SubLObject)module0254.NIL, var145 = module0032.f1742(var144, var143); module0254.NIL == var141 && module0254.NIL == module0032.f1744(var144, var145); var145 = module0032.f1743(var145)) {
                var146 = module0032.f1745(var144, var145);
                if (module0254.NIL != module0032.f1746(var145, var146)) {
                    var141 = Functions.funcall(var139, var146, var137, var4);
                }
            }
        }
        else if (var142.isList()) {
            if (module0254.NIL == var141) {
                SubLObject var147;
                SubLObject var148;
                for (var147 = var142, var148 = (SubLObject)module0254.NIL, var148 = var147.first(); module0254.NIL == var141 && module0254.NIL != var147; var141 = Functions.funcall(var139, var148, var137, var4), var147 = var147.rest(), var148 = var147.first()) {}
            }
        }
        else {
            Errors.error((SubLObject)module0254.$ic20$, var142);
        }
        return var141;
    }
    
    public static SubLObject f16486(final SubLObject var1, final SubLObject var3, final SubLObject var137, SubLObject var4, SubLObject var5) {
        if (var4 == module0254.UNPROVIDED) {
            var4 = (SubLObject)module0254.NIL;
        }
        if (var5 == module0254.UNPROVIDED) {
            var5 = (SubLObject)module0254.NIL;
        }
        assert module0254.NIL != module0137.f8885(var1) : var1;
        final SubLObject var138 = module0244.f15771(var1);
        final SubLObject var139 = f16468(var138);
        final SubLObject var140 = module0248.f15931(var1, var3, var4, var5, (SubLObject)module0254.UNPROVIDED);
        SubLObject var141 = (SubLObject)module0254.NIL;
        SubLObject var142 = (SubLObject)module0254.NIL;
        final SubLObject var143 = var140;
        if (module0254.NIL != module0077.f5302(var143)) {
            final SubLObject var144 = module0077.f5333(var143);
            SubLObject var145;
            SubLObject var146;
            SubLObject var147;
            for (var145 = module0032.f1741(var144), var146 = (SubLObject)module0254.NIL, var146 = module0032.f1742(var145, var144); module0254.NIL == var141 && module0254.NIL == module0032.f1744(var145, var146); var146 = module0032.f1743(var146)) {
                var147 = module0032.f1745(var145, var146);
                if (module0254.NIL != module0032.f1746(var146, var147)) {
                    var141 = Functions.funcall(var139, var147, var137, var4);
                    if (module0254.NIL != var141) {
                        var142 = ConsesLow.nconc(module0250.f16108((SubLObject)module0254.$ic27$, var1, var3, var147, var4, var5, (SubLObject)module0254.NIL, (SubLObject)module0254.T), var141);
                        module0141.f9182();
                    }
                }
            }
        }
        else if (var143.isList()) {
            if (module0254.NIL == var141) {
                SubLObject var148 = var143;
                SubLObject var149 = (SubLObject)module0254.NIL;
                var149 = var148.first();
                while (module0254.NIL == var141 && module0254.NIL != var148) {
                    var141 = Functions.funcall(var139, var149, var137, var4);
                    if (module0254.NIL != var141) {
                        var142 = ConsesLow.nconc(module0250.f16108((SubLObject)module0254.$ic27$, var1, var3, var149, var4, var5, (SubLObject)module0254.NIL, (SubLObject)module0254.T), var141);
                        module0141.f9182();
                    }
                    var148 = var148.rest();
                    var149 = var148.first();
                }
            }
        }
        else {
            Errors.error((SubLObject)module0254.$ic20$, var143);
        }
        return var142;
    }
    
    public static SubLObject f16487(final SubLObject var1, final SubLObject var3, final SubLObject var137, SubLObject var4, SubLObject var5) {
        if (var4 == module0254.UNPROVIDED) {
            var4 = (SubLObject)module0254.NIL;
        }
        if (var5 == module0254.UNPROVIDED) {
            var5 = (SubLObject)module0254.NIL;
        }
        assert module0254.NIL != module0137.f8885(var1) : var1;
        if (module0254.NIL != module0252.f16335(var1, var3, var137, var4, var5)) {
            return (SubLObject)module0254.NIL;
        }
        return f16488(var1, var3, var137, var4, var5);
    }
    
    public static SubLObject f16488(final SubLObject var1, final SubLObject var3, final SubLObject var137, SubLObject var4, SubLObject var5) {
        if (var4 == module0254.UNPROVIDED) {
            var4 = (SubLObject)module0254.NIL;
        }
        if (var5 == module0254.UNPROVIDED) {
            var5 = (SubLObject)module0254.NIL;
        }
        final SubLThread var138 = SubLProcess.currentSubLThread();
        assert module0254.NIL != module0137.f8885(var1) : var1;
        SubLObject var139 = var5;
        SubLObject var140 = (SubLObject)module0254.NIL;
        if (module0254.NIL != module0141.f9281(var5)) {
            var139 = module0141.f9290(var5);
        }
        if (module0254.NIL != module0244.f15761(var1)) {
            var140 = module0252.f16347(var1, var137, var3, var4, var5);
            if (module0254.NIL == var140 && (module0254.NIL == module0141.f9168() || module0254.NIL == module0141.$g1692$.getDynamicValue(var138))) {
                var140 = f16481(var1, var3, var137, var4, var139);
            }
            if (module0254.NIL == var140 && (module0254.NIL == module0141.f9168() || module0254.NIL == module0141.$g1692$.getDynamicValue(var138)) && module0254.NIL == module0258.f16731()) {
                if (module0254.NIL != module0141.f9168()) {
                    final SubLObject var141 = module0141.$g1598$.currentBinding(var138);
                    final SubLObject var142 = module0141.$g1682$.currentBinding(var138);
                    try {
                        module0141.$g1598$.bind((SubLObject)module0254.NIL, var138);
                        module0141.$g1682$.bind((SubLObject)module0254.NIL, var138);
                        var140 = f16483(var1, var3, var137, var4, (SubLObject)module0254.UNPROVIDED);
                    }
                    finally {
                        module0141.$g1682$.rebind(var142, var138);
                        module0141.$g1598$.rebind(var141, var138);
                    }
                }
                else {
                    var140 = f16484(var1, var3, var137, var4, var139);
                }
            }
            return var140;
        }
        if (module0254.NIL != module0244.f15770(var1)) {
            var140 = module0252.f16347(var1, var137, var3, var4, var5);
            if (module0254.NIL == var140 && (module0254.NIL == module0141.f9168() || module0254.NIL == module0141.$g1692$.getDynamicValue(var138))) {
                var140 = f16482(var1, var3, var137, var4, var139);
            }
            if (module0254.NIL == var140 && (module0254.NIL == module0141.f9168() || module0254.NIL == module0141.$g1692$.getDynamicValue(var138)) && module0254.NIL == module0258.f16731()) {
                if (module0254.NIL != module0141.f9168()) {
                    final SubLObject var141 = module0141.$g1598$.currentBinding(var138);
                    final SubLObject var142 = module0141.$g1682$.currentBinding(var138);
                    try {
                        module0141.$g1598$.bind((SubLObject)module0254.NIL, var138);
                        module0141.$g1682$.bind((SubLObject)module0254.NIL, var138);
                        var140 = f16486(var1, var3, var137, var4, (SubLObject)module0254.UNPROVIDED);
                    }
                    finally {
                        module0141.$g1682$.rebind(var142, var138);
                        module0141.$g1598$.rebind(var141, var138);
                    }
                }
                else {
                    var140 = f16485(var1, var3, var137, var4, var139);
                }
            }
            return var140;
        }
        module0136.f8870((SubLObject)module0254.ONE_INTEGER, (SubLObject)module0254.$ic22$, var1, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED);
        return var140;
    }
    
    public static SubLObject f16489(final SubLObject var1, final SubLObject var3, final SubLObject var137, SubLObject var4, SubLObject var5) {
        if (var4 == module0254.UNPROVIDED) {
            var4 = (SubLObject)module0254.NIL;
        }
        if (var5 == module0254.UNPROVIDED) {
            var5 = (SubLObject)module0254.NIL;
        }
        final SubLThread var138 = SubLProcess.currentSubLThread();
        assert module0254.NIL != module0137.f8885(var1) : var1;
        SubLObject var139 = (SubLObject)module0254.NIL;
        if (module0254.NIL != module0244.f15761(var1)) {
            var139 = module0252.f16347(var1, var3, var137, var4, var5);
            if (module0254.NIL == var139 && (module0254.NIL == module0141.f9168() || module0254.NIL == module0141.$g1692$.getDynamicValue(var138))) {
                var139 = module0252.f16348(var1, var3, var137, var4, var5);
            }
            if (module0254.NIL == var139 && (module0254.NIL == module0141.f9168() || module0254.NIL == module0141.$g1692$.getDynamicValue(var138)) && module0254.NIL == module0258.f16731()) {
                if (module0254.NIL != module0141.f9168()) {
                    final SubLObject var140 = module0141.$g1598$.currentBinding(var138);
                    final SubLObject var141 = module0141.$g1682$.currentBinding(var138);
                    try {
                        module0141.$g1598$.bind((SubLObject)module0254.NIL, var138);
                        module0141.$g1682$.bind((SubLObject)module0254.NIL, var138);
                        var139 = f16469(var1, var3, var137, var4, var5);
                    }
                    finally {
                        module0141.$g1682$.rebind(var141, var138);
                        module0141.$g1598$.rebind(var140, var138);
                    }
                }
                else {
                    var139 = f16463(var1, var3, var137, var4, var5);
                }
                if (module0254.NIL != module0141.f9168()) {
                    module0141.f9182();
                }
            }
            return var139;
        }
        if (module0254.NIL != module0244.f15770(var1)) {
            var139 = module0252.f16347(var1, var137, var3, var4, var5);
            if (module0254.NIL == var139 && (module0254.NIL == module0141.f9168() || module0254.NIL == module0141.$g1692$.getDynamicValue(var138))) {
                var139 = f16482(var1, var137, var3, var4, var5);
            }
            if (module0254.NIL == var139 && (module0254.NIL == module0141.f9168() || module0254.NIL == module0141.$g1692$.getDynamicValue(var138)) && module0254.NIL == module0258.f16731()) {
                if (module0254.NIL != module0141.f9168()) {
                    final SubLObject var140 = module0141.$g1598$.currentBinding(var138);
                    final SubLObject var141 = module0141.$g1682$.currentBinding(var138);
                    try {
                        module0141.$g1598$.bind((SubLObject)module0254.NIL, var138);
                        module0141.$g1682$.bind((SubLObject)module0254.NIL, var138);
                        var139 = f16486(var1, var137, var3, var4, (SubLObject)module0254.UNPROVIDED);
                    }
                    finally {
                        module0141.$g1682$.rebind(var141, var138);
                        module0141.$g1598$.rebind(var140, var138);
                    }
                }
                else {
                    var139 = f16485(var1, var137, var3, var4, var5);
                }
            }
            return var139;
        }
        module0136.f8870((SubLObject)module0254.ONE_INTEGER, (SubLObject)module0254.$ic22$, var1, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED);
        return var139;
    }
    
    public static SubLObject f16490(final SubLObject var1, final SubLObject var9, final SubLObject var10, SubLObject var4, SubLObject var5) {
        if (var4 == module0254.UNPROVIDED) {
            var4 = (SubLObject)module0254.NIL;
        }
        if (var5 == module0254.UNPROVIDED) {
            var5 = (SubLObject)module0254.NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        assert module0254.NIL != module0137.f8885(var1) : var1;
        SubLObject var12 = (SubLObject)module0254.NIL;
        if (module0254.NIL != module0244.f15768(var1)) {
            var12 = module0252.f16335(var1, var9, var10, var4, var5);
            if (module0254.NIL == var12 && (module0254.NIL == module0141.f9168() || module0254.NIL == module0141.$g1692$.getDynamicValue(var11)) && module0254.NIL == module0258.f16731()) {
                final SubLObject var13 = module0244.f15773(var1);
                if (module0254.NIL != module0141.f9168()) {
                    final SubLObject var14 = module0141.$g1598$.currentBinding(var11);
                    final SubLObject var15 = module0141.$g1682$.currentBinding(var11);
                    try {
                        module0141.$g1598$.bind((SubLObject)module0254.NIL, var11);
                        module0141.$g1682$.bind((SubLObject)module0254.NIL, var11);
                        var12 = f16469(var13, var9, var10, var4, var5);
                    }
                    finally {
                        module0141.$g1682$.rebind(var15, var11);
                        module0141.$g1598$.rebind(var14, var11);
                    }
                }
                else {
                    var12 = f16463(var13, var9, var10, var4, var5);
                }
                if (module0254.NIL != module0141.f9168()) {
                    module0141.f9182();
                }
                return var12;
            }
        }
        else {
            module0136.f8870((SubLObject)module0254.ONE_INTEGER, (SubLObject)module0254.$ic28$, var1, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED);
        }
        return var12;
    }
    
    public static SubLObject f16491(final SubLObject var1, final SubLObject var171, final SubLObject var3, SubLObject var4, SubLObject var5) {
        if (var4 == module0254.UNPROVIDED) {
            var4 = (SubLObject)module0254.NIL;
        }
        if (var5 == module0254.UNPROVIDED) {
            var5 = (SubLObject)module0254.NIL;
        }
        final SubLThread var172 = SubLProcess.currentSubLThread();
        assert module0254.NIL != module0137.f8885(var1) : var1;
        SubLObject var173 = (SubLObject)module0254.NIL;
        if (module0254.NIL != module0244.f15761(var1)) {
            var173 = module0252.f16362(var1, var171, var3, var4, var5);
            if (module0254.NIL == var173 && (module0254.NIL == module0141.f9168() || module0254.NIL == module0141.$g1692$.getDynamicValue(var172))) {
                var173 = module0252.f16364(var1, var171, var3, var4, var5);
            }
            if (module0254.NIL == var173 && module0254.NIL == module0141.f9168() && module0254.NIL == module0258.f16731()) {
                var173 = f16465(var1, var171, var3, var4, var5);
            }
            return var173;
        }
        if (module0254.NIL != module0244.f15770(var1)) {
            var173 = module0252.f16362(var1, var171, var3, var4, var5);
            if (module0254.NIL == var173 && (module0254.NIL == module0141.f9168() || module0254.NIL == module0141.$g1692$.getDynamicValue(var172))) {
                if (module0254.NIL != module0077.f5302(var171)) {
                    final SubLObject var174 = module0077.f5333(var171);
                    SubLObject var175;
                    SubLObject var176;
                    SubLObject var177;
                    for (var175 = module0032.f1741(var174), var176 = (SubLObject)module0254.NIL, var176 = module0032.f1742(var175, var174); module0254.NIL == var173 && module0254.NIL == module0032.f1744(var175, var176); var176 = module0032.f1743(var176)) {
                        var177 = module0032.f1745(var175, var176);
                        if (module0254.NIL != module0032.f1746(var176, var177)) {
                            var173 = f16482(var1, var3, var177, var4, var5);
                            if (module0254.NIL != module0141.f9168()) {
                                var173 = module0141.$g1692$.getDynamicValue(var172);
                            }
                        }
                    }
                }
                else if (var171.isList()) {
                    if (module0254.NIL == var173) {
                        SubLObject var178 = var171;
                        SubLObject var179 = (SubLObject)module0254.NIL;
                        var179 = var178.first();
                        while (module0254.NIL == var173 && module0254.NIL != var178) {
                            var173 = f16482(var1, var3, var179, var4, var5);
                            if (module0254.NIL != module0141.f9168()) {
                                var173 = module0141.$g1692$.getDynamicValue(var172);
                            }
                            var178 = var178.rest();
                            var179 = var178.first();
                        }
                    }
                }
                else {
                    Errors.error((SubLObject)module0254.$ic20$, var171);
                }
            }
            if (module0254.NIL == var173 && module0254.NIL == module0141.f9168() && module0254.NIL == module0258.f16731()) {
                if (module0254.NIL != module0077.f5302(var171)) {
                    final SubLObject var174 = module0077.f5333(var171);
                    SubLObject var175;
                    SubLObject var176;
                    SubLObject var177;
                    for (var175 = module0032.f1741(var174), var176 = (SubLObject)module0254.NIL, var176 = module0032.f1742(var175, var174); module0254.NIL == var173 && module0254.NIL == module0032.f1744(var175, var176); var176 = module0032.f1743(var176)) {
                        var177 = module0032.f1745(var175, var176);
                        if (module0254.NIL != module0032.f1746(var176, var177)) {
                            var173 = f16485(var1, var3, var177, var4, var5);
                        }
                    }
                }
                else if (var171.isList()) {
                    if (module0254.NIL == var173) {
                        SubLObject var178;
                        SubLObject var179;
                        for (var178 = var171, var179 = (SubLObject)module0254.NIL, var179 = var178.first(); module0254.NIL == var173 && module0254.NIL != var178; var173 = f16485(var1, var3, var179, var4, var5), var178 = var178.rest(), var179 = var178.first()) {}
                    }
                }
                else {
                    Errors.error((SubLObject)module0254.$ic20$, var171);
                }
            }
        }
        else {
            module0136.f8870((SubLObject)module0254.ONE_INTEGER, (SubLObject)module0254.$ic22$, var1, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED);
        }
        return var173;
    }
    
    public static SubLObject f16492(final SubLObject var1, final SubLObject var3, final SubLObject var171, SubLObject var4, SubLObject var5) {
        if (var4 == module0254.UNPROVIDED) {
            var4 = (SubLObject)module0254.NIL;
        }
        if (var5 == module0254.UNPROVIDED) {
            var5 = (SubLObject)module0254.NIL;
        }
        final SubLThread var172 = SubLProcess.currentSubLThread();
        assert module0254.NIL != module0137.f8885(var1) : var1;
        SubLObject var173 = (SubLObject)module0254.NIL;
        if (module0254.NIL != module0244.f15761(var1)) {
            var173 = module0252.f16355(var1, var3, var171, var4, var5);
            if (module0254.NIL == var173 && (module0254.NIL == module0141.f9168() || module0254.NIL == module0141.$g1692$.getDynamicValue(var172))) {
                var173 = module0252.f16357(var1, var3, var171, var4, var5);
            }
            if (module0254.NIL == var173 && module0254.NIL == module0141.f9168() && module0254.NIL == module0258.f16731()) {
                var173 = f16465(var1, var171, var3, var4, var5);
            }
            return var173;
        }
        if (module0254.NIL != module0244.f15770(var1)) {
            var173 = module0252.f16355(var1, var3, var171, var4, var5);
            if (module0254.NIL == var173 && (module0254.NIL == module0141.f9168() || module0254.NIL == module0141.$g1692$.getDynamicValue(var172))) {
                if (module0254.NIL != module0077.f5302(var171)) {
                    final SubLObject var174 = module0077.f5333(var171);
                    SubLObject var175;
                    SubLObject var176;
                    SubLObject var177;
                    for (var175 = module0032.f1741(var174), var176 = (SubLObject)module0254.NIL, var176 = module0032.f1742(var175, var174); module0254.NIL == var173 && module0254.NIL == module0032.f1744(var175, var176); var176 = module0032.f1743(var176)) {
                        var177 = module0032.f1745(var175, var176);
                        if (module0254.NIL != module0032.f1746(var176, var177)) {
                            var173 = f16482(var1, var3, var177, var4, var5);
                            if (module0254.NIL != module0141.f9168()) {
                                var173 = module0141.$g1692$.getDynamicValue(var172);
                            }
                        }
                    }
                }
                else if (var171.isList()) {
                    if (module0254.NIL == var173) {
                        SubLObject var178 = var171;
                        SubLObject var179 = (SubLObject)module0254.NIL;
                        var179 = var178.first();
                        while (module0254.NIL == var173 && module0254.NIL != var178) {
                            var173 = f16482(var1, var3, var179, var4, var5);
                            if (module0254.NIL != module0141.f9168()) {
                                var173 = module0141.$g1692$.getDynamicValue(var172);
                            }
                            var178 = var178.rest();
                            var179 = var178.first();
                        }
                    }
                }
                else {
                    Errors.error((SubLObject)module0254.$ic20$, var171);
                }
            }
            if (module0254.NIL == var173 && module0254.NIL == module0141.f9168() && module0254.NIL == module0258.f16731()) {
                if (module0254.NIL != module0077.f5302(var171)) {
                    final SubLObject var174 = module0077.f5333(var171);
                    SubLObject var175;
                    SubLObject var176;
                    SubLObject var177;
                    for (var175 = module0032.f1741(var174), var176 = (SubLObject)module0254.NIL, var176 = module0032.f1742(var175, var174); module0254.NIL == var173 && module0254.NIL == module0032.f1744(var175, var176); var176 = module0032.f1743(var176)) {
                        var177 = module0032.f1745(var175, var176);
                        if (module0254.NIL != module0032.f1746(var176, var177)) {
                            var173 = f16485(var1, var3, var177, var4, var5);
                        }
                    }
                }
                else if (var171.isList()) {
                    if (module0254.NIL == var173) {
                        SubLObject var178;
                        SubLObject var179;
                        for (var178 = var171, var179 = (SubLObject)module0254.NIL, var179 = var178.first(); module0254.NIL == var173 && module0254.NIL != var178; var173 = f16485(var1, var3, var179, var4, var5), var178 = var178.rest(), var179 = var178.first()) {}
                    }
                }
                else {
                    Errors.error((SubLObject)module0254.$ic20$, var171);
                }
            }
        }
        else {
            module0136.f8870((SubLObject)module0254.ONE_INTEGER, (SubLObject)module0254.$ic22$, var1, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED);
        }
        return var173;
    }
    
    public static SubLObject f16493(final SubLObject var1, final SubLObject var171, final SubLObject var3, SubLObject var4, SubLObject var5) {
        if (var4 == module0254.UNPROVIDED) {
            var4 = (SubLObject)module0254.NIL;
        }
        if (var5 == module0254.UNPROVIDED) {
            var5 = (SubLObject)module0254.NIL;
        }
        final SubLThread var172 = SubLProcess.currentSubLThread();
        assert module0254.NIL != module0137.f8885(var1) : var1;
        SubLObject var173 = (SubLObject)module0254.NIL;
        SubLObject var174 = (SubLObject)module0254.NIL;
        if (module0254.NIL != module0244.f15761(var1)) {
            var173 = module0252.f16368(var1, var171, var3, var4, var5);
            if (module0254.NIL == var173 && (module0254.NIL == module0141.f9168() || module0254.NIL == module0141.$g1692$.getDynamicValue(var172))) {
                var173 = module0252.f16369(var1, var171, var3, var4, var5);
            }
            if (module0254.NIL == var173 && module0254.NIL == module0141.f9168() && module0254.NIL == module0258.f16731()) {
                if (module0254.NIL != module0077.f5302(var3)) {
                    final SubLObject var175 = module0077.f5333(var3);
                    SubLObject var176;
                    SubLObject var177;
                    SubLObject var178;
                    for (var176 = module0032.f1741(var175), var177 = (SubLObject)module0254.NIL, var177 = module0032.f1742(var176, var175); module0254.NIL == var174 && module0254.NIL == module0032.f1744(var176, var177); var177 = module0032.f1743(var177)) {
                        var178 = module0032.f1745(var176, var177);
                        if (module0254.NIL != module0032.f1746(var177, var178) && module0254.NIL == f16463(var1, var178, var3, var4, var5)) {
                            var174 = (SubLObject)module0254.T;
                        }
                    }
                }
                else if (var3.isList()) {
                    if (module0254.NIL == var174) {
                        SubLObject var179 = var3;
                        SubLObject var180 = (SubLObject)module0254.NIL;
                        var180 = var179.first();
                        while (module0254.NIL == var174 && module0254.NIL != var179) {
                            if (module0254.NIL == f16463(var1, var180, var3, var4, var5)) {
                                var174 = (SubLObject)module0254.T;
                            }
                            var179 = var179.rest();
                            var180 = var179.first();
                        }
                    }
                }
                else {
                    Errors.error((SubLObject)module0254.$ic20$, var3);
                }
                var173 = (SubLObject)SubLObjectFactory.makeBoolean(module0254.NIL == var174);
            }
            return var173;
        }
        if (module0254.NIL != module0244.f15770(var1)) {
            var173 = module0252.f16368(var1, var171, var3, var4, var5);
            if (module0254.NIL == var173 && (module0254.NIL == module0141.f9168() || module0254.NIL == module0141.$g1692$.getDynamicValue(var172))) {
                if (module0254.NIL != module0141.f9168()) {
                    module0136.f8870((SubLObject)module0254.ONE_INTEGER, (SubLObject)module0254.$ic29$, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED);
                }
                if (module0254.NIL != module0077.f5302(var171)) {
                    final SubLObject var175 = module0077.f5333(var171);
                    SubLObject var176;
                    SubLObject var177;
                    SubLObject var178;
                    for (var176 = module0032.f1741(var175), var177 = (SubLObject)module0254.NIL, var177 = module0032.f1742(var176, var175); module0254.NIL == var174 && module0254.NIL == module0032.f1744(var176, var177); var177 = module0032.f1743(var177)) {
                        var178 = module0032.f1745(var176, var177);
                        if (module0254.NIL != module0032.f1746(var177, var178) && module0254.NIL == f16482(var1, var178, var3, var4, var5)) {
                            var174 = (SubLObject)module0254.T;
                        }
                    }
                }
                else if (var171.isList()) {
                    if (module0254.NIL == var174) {
                        SubLObject var179 = var171;
                        SubLObject var180 = (SubLObject)module0254.NIL;
                        var180 = var179.first();
                        while (module0254.NIL == var174 && module0254.NIL != var179) {
                            if (module0254.NIL == f16482(var1, var180, var3, var4, var5)) {
                                var174 = (SubLObject)module0254.T;
                            }
                            var179 = var179.rest();
                            var180 = var179.first();
                        }
                    }
                }
                else {
                    Errors.error((SubLObject)module0254.$ic20$, var171);
                }
                var173 = (SubLObject)SubLObjectFactory.makeBoolean(module0254.NIL == var174);
            }
            if (module0254.NIL == var173 && module0254.NIL == module0141.f9168() && module0254.NIL == module0258.f16731()) {
                if (module0254.NIL != module0077.f5302(var171)) {
                    final SubLObject var175 = module0077.f5333(var171);
                    SubLObject var176;
                    SubLObject var177;
                    SubLObject var178;
                    for (var176 = module0032.f1741(var175), var177 = (SubLObject)module0254.NIL, var177 = module0032.f1742(var176, var175); module0254.NIL == var174 && module0254.NIL == module0032.f1744(var176, var177); var177 = module0032.f1743(var177)) {
                        var178 = module0032.f1745(var176, var177);
                        if (module0254.NIL != module0032.f1746(var177, var178) && module0254.NIL == f16485(var1, var178, var3, var4, var5)) {
                            var174 = (SubLObject)module0254.T;
                        }
                    }
                }
                else if (var171.isList()) {
                    if (module0254.NIL == var174) {
                        SubLObject var179 = var171;
                        SubLObject var180 = (SubLObject)module0254.NIL;
                        var180 = var179.first();
                        while (module0254.NIL == var174 && module0254.NIL != var179) {
                            if (module0254.NIL == f16485(var1, var180, var3, var4, var5)) {
                                var174 = (SubLObject)module0254.T;
                            }
                            var179 = var179.rest();
                            var180 = var179.first();
                        }
                    }
                }
                else {
                    Errors.error((SubLObject)module0254.$ic20$, var171);
                }
                var173 = (SubLObject)SubLObjectFactory.makeBoolean(module0254.NIL == var174);
            }
            return var173;
        }
        module0136.f8870((SubLObject)module0254.ONE_INTEGER, (SubLObject)module0254.$ic22$, var1, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED);
        return var173;
    }
    
    public static SubLObject f16494(final SubLObject var1, final SubLObject var171, final SubLObject var3, SubLObject var4, SubLObject var5) {
        if (var4 == module0254.UNPROVIDED) {
            var4 = (SubLObject)module0254.NIL;
        }
        if (var5 == module0254.UNPROVIDED) {
            var5 = (SubLObject)module0254.NIL;
        }
        assert module0254.NIL != module0137.f8885(var1) : var1;
        SubLObject var172 = (SubLObject)module0254.NIL;
        if (module0254.NIL != module0244.f15768(var1)) {
            var172 = module0252.f16360(var1, var171, var3, var4, var5);
            if (module0254.NIL == var172 && module0254.NIL == module0141.f9168() && module0254.NIL == module0258.f16731()) {
                final SubLObject var173 = module0244.f15773(var1);
                var172 = f16465(var173, var171, var3, var4, var5);
            }
            return var172;
        }
        module0136.f8870((SubLObject)module0254.ONE_INTEGER, (SubLObject)module0254.$ic28$, var1, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED);
        return var172;
    }
    
    public static SubLObject f16495(final SubLObject var1, final SubLObject var12, final SubLObject var14, SubLObject var4, SubLObject var5) {
        if (var4 == module0254.UNPROVIDED) {
            var4 = (SubLObject)module0254.NIL;
        }
        if (var5 == module0254.UNPROVIDED) {
            var5 = (SubLObject)module0254.NIL;
        }
        assert module0254.NIL != module0137.f8885(var1) : var1;
        SubLObject var15 = (SubLObject)module0254.NIL;
        if (module0254.NIL != module0244.f15768(var1)) {
            var15 = module0252.f16370(var1, var12, var14, var4, var5);
            if (module0254.NIL == var15 && module0254.NIL == module0141.f9168() && module0254.NIL == module0258.f16731()) {
                final SubLObject var16 = module0244.f15773(var1);
                if (module0254.NIL != module0077.f5302(var14)) {
                    final SubLObject var17 = module0077.f5333(var14);
                    SubLObject var18;
                    SubLObject var19;
                    SubLObject var20;
                    for (var18 = module0032.f1741(var17), var19 = (SubLObject)module0254.NIL, var19 = module0032.f1742(var18, var17); module0254.NIL == var15 && module0254.NIL == module0032.f1744(var18, var19); var19 = module0032.f1743(var19)) {
                        var20 = module0032.f1745(var18, var19);
                        if (module0254.NIL != module0032.f1746(var19, var20)) {
                            var15 = f16465(var16, var12, var20, var4, var5);
                        }
                    }
                }
                else if (var14.isList()) {
                    if (module0254.NIL == var15) {
                        SubLObject var21;
                        SubLObject var22;
                        for (var21 = var14, var22 = (SubLObject)module0254.NIL, var22 = var21.first(); module0254.NIL == var15 && module0254.NIL != var21; var15 = f16465(var16, var12, var22, var4, var5), var21 = var21.rest(), var22 = var21.first()) {}
                    }
                }
                else {
                    Errors.error((SubLObject)module0254.$ic20$, var14);
                }
            }
            return var15;
        }
        module0136.f8870((SubLObject)module0254.ONE_INTEGER, (SubLObject)module0254.$ic28$, var1, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED, (SubLObject)module0254.UNPROVIDED);
        return var15;
    }
    
    public static SubLObject f16496(final SubLObject var1, final SubLObject var9, final SubLObject var10, SubLObject var4, SubLObject var5, SubLObject var173) {
        if (var4 == module0254.UNPROVIDED) {
            var4 = (SubLObject)module0254.NIL;
        }
        if (var5 == module0254.UNPROVIDED) {
            var5 = (SubLObject)module0254.NIL;
        }
        if (var173 == module0254.UNPROVIDED) {
            var173 = (SubLObject)module0254.NIL;
        }
        assert module0254.NIL != module0137.f8885(var1) : var1;
        return module0250.f16108((SubLObject)module0254.$ic30$, var1, var9, var10, var4, var5, var173, (SubLObject)module0254.NIL);
    }
    
    public static SubLObject f16497(final SubLObject var1, final SubLObject var9, final SubLObject var10, SubLObject var4, SubLObject var5, SubLObject var173) {
        if (var4 == module0254.UNPROVIDED) {
            var4 = (SubLObject)module0254.NIL;
        }
        if (var5 == module0254.UNPROVIDED) {
            var5 = (SubLObject)module0254.NIL;
        }
        if (var173 == module0254.UNPROVIDED) {
            var173 = (SubLObject)module0254.NIL;
        }
        assert module0254.NIL != module0137.f8885(var1) : var1;
        return module0250.f16108((SubLObject)module0254.$ic31$, var1, var9, var10, var4, var5, var173, (SubLObject)module0254.NIL);
    }
    
    public static SubLObject f16498(final SubLObject var1, final SubLObject var9, final SubLObject var10, SubLObject var4, SubLObject var5, SubLObject var173) {
        if (var4 == module0254.UNPROVIDED) {
            var4 = (SubLObject)module0254.NIL;
        }
        if (var5 == module0254.UNPROVIDED) {
            var5 = (SubLObject)module0254.NIL;
        }
        if (var173 == module0254.UNPROVIDED) {
            var173 = (SubLObject)module0254.NIL;
        }
        assert module0254.NIL != module0137.f8885(var1) : var1;
        return module0250.f16108((SubLObject)module0254.$ic32$, var1, var9, var10, var4, var5, var173, (SubLObject)module0254.NIL);
    }
    
    public static SubLObject f16499() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0254", "f16458", "S#19201", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0254", "f16459", "S#19202", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0254", "f16460", "S#19203", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0254", "f16461", "S#19204", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0254", "f16462", "S#19205", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0254", "f16463", "S#19206", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0254", "f16464", "S#19207", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0254", "f16465", "S#19208", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0254", "f16466", "S#19209", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0254", "f16467", "S#19210", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0254", "f16468", "S#19211", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0254", "f16469", "S#19212", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0254", "f16470", "S#19213", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0254", "f16471", "S#19214", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0254", "f16472", "S#19215", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0254", "f16473", "S#19216", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0254", "f16474", "S#19217", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0254", "f16475", "S#19218", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0254", "f16476", "S#19219", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0254", "f16477", "S#19220", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0254", "f16478", "S#19221", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0254", "f16479", "S#19222", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0254", "f16480", "S#19223", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0254", "f16481", "S#19224", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0254", "f16482", "S#19225", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0254", "f16483", "S#19226", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0254", "f16484", "S#19227", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0254", "f16485", "S#19228", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0254", "f16486", "S#19229", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0254", "f16487", "S#19230", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0254", "f16488", "S#19112", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0254", "f16489", "S#19231", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0254", "f16490", "S#19111", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0254", "f16491", "S#19232", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0254", "f16492", "S#19233", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0254", "f16493", "S#19234", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0254", "f16494", "S#19235", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0254", "f16495", "S#19236", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0254", "f16496", "S#19237", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0254", "f16497", "S#19238", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0254", "f16498", "S#19239", 3, 3, false);
        return (SubLObject)module0254.NIL;
    }
    
    public static SubLObject f16500() {
        return (SubLObject)module0254.NIL;
    }
    
    public static SubLObject f16501() {
        return (SubLObject)module0254.NIL;
    }
    
    public void declareFunctions() {
        f16499();
    }
    
    public void initializeVariables() {
        f16500();
    }
    
    public void runTopLevelForms() {
        f16501();
    }
    
    static {
        me = (SubLFile)new module0254();
        $ic0$ = SubLObjectFactory.makeSymbol("S#11099", "CYC");
        $ic1$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genls"));
        $ic2$ = SubLObjectFactory.makeSymbol("S#19240", "CYC");
        $ic3$ = SubLObjectFactory.makeSymbol("S#19241", "CYC");
        $ic4$ = SubLObjectFactory.makeSymbol("SDC?");
        $ic5$ = SubLObjectFactory.makeSymbol("ANY-SDC-WRT?");
        $ic6$ = SubLObjectFactory.makeSymbol("S#19242", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#19243", "CYC");
        $ic8$ = SubLObjectFactory.makeSymbol("S#19214", "CYC");
        $ic9$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("True-JustificationTruth"));
        $ic10$ = SubLObjectFactory.makeKeyword("OLD");
        $ic11$ = SubLObjectFactory.makeKeyword("RESOURCE");
        $ic12$ = SubLObjectFactory.makeSymbol("S#11450", "CYC");
        $ic13$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic14$ = SubLObjectFactory.makeString("~A is not a ~A");
        $ic15$ = SubLObjectFactory.makeSymbol("S#11592", "CYC");
        $ic16$ = SubLObjectFactory.makeKeyword("CERROR");
        $ic17$ = SubLObjectFactory.makeString("continue anyway");
        $ic18$ = SubLObjectFactory.makeKeyword("WARN");
        $ic19$ = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic20$ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $ic21$ = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic22$ = SubLObjectFactory.makeString("Method only valid for simple and transfer-through modules, not ~a");
        $ic23$ = SubLObjectFactory.makeKeyword("BOOLEAN");
        $ic24$ = SubLObjectFactory.makeSymbol("S#15382", "CYC");
        $ic25$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("negationInverse"));
        $ic26$ = SubLObjectFactory.makeSymbol("S#15385", "CYC");
        $ic27$ = SubLObjectFactory.makeSymbol("S#19074", "CYC");
        $ic28$ = SubLObjectFactory.makeString("Method only valid for disjoins modules, not ~a");
        $ic29$ = SubLObjectFactory.makeString("Boolean methods using ALL are currently unsupported for justifications.");
        $ic30$ = SubLObjectFactory.makeSymbol("S#19112", "CYC");
        $ic31$ = SubLObjectFactory.makeSymbol("S#19231", "CYC");
        $ic32$ = SubLObjectFactory.makeSymbol("S#19111", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0254.class
	Total time: 1446 ms
	
	Decompiled with Procyon 0.5.32.
*/