package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0251 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0251";
    public static final String myFingerPrint = "f16c118f07a3ffc3b8f891210433a8f5a0c9f946179b3debe718433901eaf3e5";
    private static final SubLSymbol $ic0$;
    private static final SubLObject $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLString $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLString $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLString $ic13$;
    private static final SubLObject $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLString $ic17$;
    private static final SubLString $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
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
    private static final SubLString $ic31$;
    private static final SubLSymbol $ic32$;
    
    public static SubLObject f16198(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0251.NIL != module0250.f16097()) {
            final SubLObject var3 = module0137.$g1605$.currentBinding(var2);
            try {
                module0137.$g1605$.bind(module0244.f15771(module0141.f9188()), var2);
                SubLObject var4 = var1;
                SubLObject var5 = (SubLObject)module0251.NIL;
                var5 = var4.first();
                while (module0251.NIL != var4) {
                    final SubLObject var3_6 = module0141.$g1674$.currentBinding(var2);
                    final SubLObject var6 = module0141.$g1683$.currentBinding(var2);
                    try {
                        module0141.$g1674$.bind((SubLObject)module0251.NIL, var2);
                        module0141.$g1683$.bind((SubLObject)module0251.NIL, var2);
                        f16199(var5);
                    }
                    finally {
                        module0141.$g1683$.rebind(var6, var2);
                        module0141.$g1674$.rebind(var3_6, var2);
                    }
                    var4 = var4.rest();
                    var5 = var4.first();
                }
            }
            finally {
                module0137.$g1605$.rebind(var3, var2);
            }
        }
        else {
            final SubLObject var3 = module0139.$g1635$.currentBinding(var2);
            try {
                module0139.$g1635$.bind(module0139.$g1636$.getDynamicValue(var2), var2);
                SubLObject var4 = var1;
                SubLObject var5 = (SubLObject)module0251.NIL;
                var5 = var4.first();
                while (module0251.NIL != var4) {
                    module0249.f16055(var5, (SubLObject)module0251.UNPROVIDED);
                    var4 = var4.rest();
                    var5 = var4.first();
                }
            }
            finally {
                module0139.$g1635$.rebind(var3, var2);
            }
        }
        return (SubLObject)module0251.NIL;
    }
    
    public static SubLObject f16200(final SubLObject var8) {
        return module0141.f9208();
    }
    
    public static SubLObject f16199(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        module0250.f16154(module0137.f8955((SubLObject)module0251.UNPROVIDED), module0244.f15782(f16200(module0137.f8955((SubLObject)module0251.UNPROVIDED)), module0137.f8955((SubLObject)module0251.UNPROVIDED)), module0141.f9293(), module0139.$g1636$.getDynamicValue(var10), (SubLObject)module0251.$ic0$, var9, module0141.f9185());
        return (SubLObject)module0251.NIL;
    }
    
    public static SubLObject f16201(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        final SubLObject var11 = module0244.f15775(module0141.f9188());
        if (module0251.NIL != module0244.f15752(module0141.f9188())) {
            SubLObject var12 = module0249.f16019(var9, (SubLObject)module0251.UNPROVIDED);
            SubLObject var13 = (SubLObject)module0251.NIL;
            var13 = var12.first();
            while (module0251.NIL != var12) {
                final SubLObject var14 = module0141.$g1673$.currentBinding(var10);
                final SubLObject var15 = module0141.$g1674$.currentBinding(var10);
                final SubLObject var16 = module0141.$g1693$.currentBinding(var10);
                try {
                    module0141.$g1673$.bind(module0244.f15746(module0137.f8955(var13)), var10);
                    module0141.$g1674$.bind(Equality.eql(var13, module0251.$ic1$), var10);
                    module0141.$g1693$.bind((SubLObject)((module0251.NIL != module0250.f16131()) ? module0251.$ic2$ : module0251.$ic3$), var10);
                    module0250.f16155(var11, module0244.f15780(var11), module0141.f9293(), module0139.$g1645$.getDynamicValue(var10), (SubLObject)module0251.$ic4$, var9);
                }
                finally {
                    module0141.$g1693$.rebind(var16, var10);
                    module0141.$g1674$.rebind(var15, var10);
                    module0141.$g1673$.rebind(var14, var10);
                }
                var12 = var12.rest();
                var13 = var12.first();
            }
        }
        else {
            final SubLObject var17 = module0141.$g1693$.currentBinding(var10);
            try {
                module0141.$g1693$.bind((SubLObject)((module0251.NIL != module0250.f16131()) ? module0251.$ic2$ : module0251.$ic3$), var10);
                module0250.f16155(var11, module0244.f15780(var11), module0141.f9293(), module0139.$g1645$.getDynamicValue(var10), (SubLObject)module0251.$ic4$, var9);
            }
            finally {
                module0141.$g1693$.rebind(var17, var10);
            }
        }
        return (SubLObject)module0251.NIL;
    }
    
    public static SubLObject f16202(final SubLObject var8, final SubLObject var9, SubLObject var12, SubLObject var13) {
        if (var12 == module0251.UNPROVIDED) {
            var12 = (SubLObject)module0251.NIL;
        }
        if (var13 == module0251.UNPROVIDED) {
            var13 = (SubLObject)module0251.NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        assert module0251.NIL != module0137.f8885(var8) : var8;
        final SubLObject var15 = module0141.$g1670$.currentBinding(var14);
        final SubLObject var16 = module0141.$g1671$.currentBinding(var14);
        final SubLObject var17 = module0141.$g1672$.currentBinding(var14);
        final SubLObject var18 = module0141.$g1674$.currentBinding(var14);
        final SubLObject var19 = module0137.$g1605$.currentBinding(var14);
        final SubLObject var20 = module0139.$g1644$.currentBinding(var14);
        try {
            module0141.$g1670$.bind(var8, var14);
            module0141.$g1671$.bind(module0244.f15739(var8), var14);
            module0141.$g1672$.bind(module0244.f15746(var8), var14);
            module0141.$g1674$.bind((SubLObject)module0251.NIL, var14);
            module0137.$g1605$.bind(var8, var14);
            module0139.$g1644$.bind((SubLObject)module0251.T, var14);
            final SubLObject var21 = var12;
            final SubLObject var3_18 = module0147.$g2095$.currentBinding(var14);
            final SubLObject var7_19 = module0147.$g2094$.currentBinding(var14);
            final SubLObject var11_20 = module0147.$g2096$.currentBinding(var14);
            try {
                module0147.$g2095$.bind(module0147.f9545(var21), var14);
                module0147.$g2094$.bind(module0147.f9546(var21), var14);
                module0147.$g2096$.bind(module0147.f9549(var21), var14);
                final SubLObject var22 = var13;
                final SubLObject var3_19 = module0141.$g1714$.currentBinding(var14);
                final SubLObject var7_20 = module0141.$g1715$.currentBinding(var14);
                try {
                    module0141.$g1714$.bind((module0251.NIL != var22) ? var22 : module0141.f9283(), var14);
                    module0141.$g1715$.bind((SubLObject)((module0251.NIL != var22) ? module0251.$ic6$ : module0141.$g1715$.getDynamicValue(var14)), var14);
                    if (module0251.NIL != var22 && module0251.NIL != module0136.f8864() && module0251.NIL == module0141.f9279(var22)) {
                        final SubLObject var23 = module0136.$g1591$.getDynamicValue(var14);
                        if (var23.eql((SubLObject)module0251.$ic7$)) {
                            module0136.f8870((SubLObject)module0251.ONE_INTEGER, (SubLObject)module0251.$ic8$, var22, (SubLObject)module0251.$ic9$, (SubLObject)module0251.UNPROVIDED, (SubLObject)module0251.UNPROVIDED, (SubLObject)module0251.UNPROVIDED);
                        }
                        else if (var23.eql((SubLObject)module0251.$ic10$)) {
                            module0136.f8871((SubLObject)module0251.ONE_INTEGER, (SubLObject)module0251.$ic11$, (SubLObject)module0251.$ic8$, var22, (SubLObject)module0251.$ic9$, (SubLObject)module0251.UNPROVIDED, (SubLObject)module0251.UNPROVIDED, (SubLObject)module0251.UNPROVIDED);
                        }
                        else if (var23.eql((SubLObject)module0251.$ic12$)) {
                            Errors.warn((SubLObject)module0251.$ic8$, var22, (SubLObject)module0251.$ic9$);
                        }
                        else {
                            Errors.warn((SubLObject)module0251.$ic13$, module0136.$g1591$.getDynamicValue(var14));
                            Errors.cerror((SubLObject)module0251.$ic11$, (SubLObject)module0251.$ic8$, var22, (SubLObject)module0251.$ic9$);
                        }
                    }
                    final SubLObject var3_20 = module0141.$g1710$.currentBinding(var14);
                    final SubLObject var7_21 = module0141.$g1677$.currentBinding(var14);
                    final SubLObject var11_21 = module0138.$g1619$.currentBinding(var14);
                    try {
                        module0141.$g1710$.bind(module0251.$ic14$, var14);
                        module0141.$g1677$.bind(module0141.f9208(), var14);
                        module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0251.UNPROVIDED)), var14);
                        final SubLObject var24 = module0139.f9036();
                        final SubLObject var3_21 = module0139.$g1635$.currentBinding(var14);
                        try {
                            module0139.$g1635$.bind((var24 == module0251.$ic15$) ? module0139.$g1635$.getDynamicValue(var14) : module0139.f9038(var24), var14);
                            final SubLObject var3_22 = module0139.$g1636$.currentBinding(var14);
                            try {
                                module0139.$g1636$.bind((var24 == module0251.$ic15$) ? module0139.$g1636$.getDynamicValue(var14) : module0139.f9038(var24), var14);
                                final SubLObject var3_23 = module0141.$g1685$.currentBinding(var14);
                                final SubLObject var7_22 = module0141.$g1686$.currentBinding(var14);
                                final SubLObject var11_22 = module0141.$g1683$.currentBinding(var14);
                                final SubLObject var14_34 = module0141.$g1684$.currentBinding(var14);
                                final SubLObject var15_35 = module0141.$g1674$.currentBinding(var14);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0251.NIL, var14);
                                    module0141.$g1686$.bind((SubLObject)module0251.NIL, var14);
                                    module0141.$g1683$.bind((SubLObject)module0251.NIL, var14);
                                    module0141.$g1684$.bind((SubLObject)module0251.NIL, var14);
                                    module0141.$g1674$.bind((SubLObject)module0251.NIL, var14);
                                    final SubLObject var25 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var26 = (SubLObject)module0251.NIL;
                                    try {
                                        var26 = ReadWriteLocks.rw_lock_seize_read_lock(var25);
                                        final SubLObject var3_24 = module0141.$g1665$.currentBinding(var14);
                                        final SubLObject var7_23 = module0139.$g1648$.currentBinding(var14);
                                        try {
                                            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var14);
                                            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var14)), var14);
                                            f16203(var9);
                                        }
                                        finally {
                                            module0139.$g1648$.rebind(var7_23, var14);
                                            module0141.$g1665$.rebind(var3_24, var14);
                                        }
                                    }
                                    finally {
                                        if (module0251.NIL != var26) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var25);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var15_35, var14);
                                    module0141.$g1684$.rebind(var14_34, var14);
                                    module0141.$g1683$.rebind(var11_22, var14);
                                    module0141.$g1686$.rebind(var7_22, var14);
                                    module0141.$g1685$.rebind(var3_23, var14);
                                }
                                if (var24 == module0251.$ic16$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var14));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var3_22, var14);
                            }
                            if (var24 == module0251.$ic16$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var14));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var3_21, var14);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var11_21, var14);
                        module0141.$g1677$.rebind(var7_21, var14);
                        module0141.$g1710$.rebind(var3_20, var14);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var7_20, var14);
                    module0141.$g1714$.rebind(var3_19, var14);
                }
            }
            finally {
                module0147.$g2096$.rebind(var11_20, var14);
                module0147.$g2094$.rebind(var7_19, var14);
                module0147.$g2095$.rebind(var3_18, var14);
            }
        }
        finally {
            module0139.$g1644$.rebind(var20, var14);
            module0137.$g1605$.rebind(var19, var14);
            module0141.$g1674$.rebind(var18, var14);
            module0141.$g1672$.rebind(var17, var14);
            module0141.$g1671$.rebind(var16, var14);
            module0141.$g1670$.rebind(var15, var14);
        }
        return (SubLObject)module0251.NIL;
    }
    
    public static SubLObject f16204(final SubLObject var8, final SubLObject var9, SubLObject var12, SubLObject var13) {
        if (var12 == module0251.UNPROVIDED) {
            var12 = (SubLObject)module0251.NIL;
        }
        if (var13 == module0251.UNPROVIDED) {
            var13 = (SubLObject)module0251.NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        assert module0251.NIL != module0137.f8885(var8) : var8;
        final SubLObject var15 = module0141.$g1670$.currentBinding(var14);
        final SubLObject var16 = module0141.$g1671$.currentBinding(var14);
        final SubLObject var17 = module0141.$g1672$.currentBinding(var14);
        final SubLObject var18 = module0141.$g1674$.currentBinding(var14);
        final SubLObject var19 = module0137.$g1605$.currentBinding(var14);
        final SubLObject var20 = module0139.$g1644$.currentBinding(var14);
        try {
            module0141.$g1670$.bind(var8, var14);
            module0141.$g1671$.bind(module0244.f15739(var8), var14);
            module0141.$g1672$.bind(module0244.f15746(var8), var14);
            module0141.$g1674$.bind((SubLObject)module0251.NIL, var14);
            module0137.$g1605$.bind(var8, var14);
            module0139.$g1644$.bind((SubLObject)module0251.T, var14);
            final SubLObject var21 = var12;
            final SubLObject var3_40 = module0147.$g2095$.currentBinding(var14);
            final SubLObject var7_41 = module0147.$g2094$.currentBinding(var14);
            final SubLObject var11_42 = module0147.$g2096$.currentBinding(var14);
            try {
                module0147.$g2095$.bind(module0147.f9545(var21), var14);
                module0147.$g2094$.bind(module0147.f9546(var21), var14);
                module0147.$g2096$.bind(module0147.f9549(var21), var14);
                final SubLObject var22 = var13;
                final SubLObject var3_41 = module0141.$g1714$.currentBinding(var14);
                final SubLObject var7_42 = module0141.$g1715$.currentBinding(var14);
                try {
                    module0141.$g1714$.bind((module0251.NIL != var22) ? var22 : module0141.f9283(), var14);
                    module0141.$g1715$.bind((SubLObject)((module0251.NIL != var22) ? module0251.$ic6$ : module0141.$g1715$.getDynamicValue(var14)), var14);
                    if (module0251.NIL != var22 && module0251.NIL != module0136.f8864() && module0251.NIL == module0141.f9279(var22)) {
                        final SubLObject var23 = module0136.$g1591$.getDynamicValue(var14);
                        if (var23.eql((SubLObject)module0251.$ic7$)) {
                            module0136.f8870((SubLObject)module0251.ONE_INTEGER, (SubLObject)module0251.$ic8$, var22, (SubLObject)module0251.$ic9$, (SubLObject)module0251.UNPROVIDED, (SubLObject)module0251.UNPROVIDED, (SubLObject)module0251.UNPROVIDED);
                        }
                        else if (var23.eql((SubLObject)module0251.$ic10$)) {
                            module0136.f8871((SubLObject)module0251.ONE_INTEGER, (SubLObject)module0251.$ic11$, (SubLObject)module0251.$ic8$, var22, (SubLObject)module0251.$ic9$, (SubLObject)module0251.UNPROVIDED, (SubLObject)module0251.UNPROVIDED, (SubLObject)module0251.UNPROVIDED);
                        }
                        else if (var23.eql((SubLObject)module0251.$ic12$)) {
                            Errors.warn((SubLObject)module0251.$ic8$, var22, (SubLObject)module0251.$ic9$);
                        }
                        else {
                            Errors.warn((SubLObject)module0251.$ic13$, module0136.$g1591$.getDynamicValue(var14));
                            Errors.cerror((SubLObject)module0251.$ic11$, (SubLObject)module0251.$ic8$, var22, (SubLObject)module0251.$ic9$);
                        }
                    }
                    final SubLObject var3_42 = module0141.$g1710$.currentBinding(var14);
                    final SubLObject var7_43 = module0141.$g1677$.currentBinding(var14);
                    final SubLObject var11_43 = module0138.$g1619$.currentBinding(var14);
                    try {
                        module0141.$g1710$.bind(module0251.$ic14$, var14);
                        module0141.$g1677$.bind(module0141.f9210(), var14);
                        module0138.$g1619$.bind(module0244.f15780(module0137.f8955((SubLObject)module0251.UNPROVIDED)), var14);
                        final SubLObject var24 = module0139.f9036();
                        final SubLObject var3_43 = module0139.$g1635$.currentBinding(var14);
                        try {
                            module0139.$g1635$.bind((var24 == module0251.$ic15$) ? module0139.$g1635$.getDynamicValue(var14) : module0139.f9038(var24), var14);
                            final SubLObject var3_44 = module0139.$g1636$.currentBinding(var14);
                            try {
                                module0139.$g1636$.bind((var24 == module0251.$ic15$) ? module0139.$g1636$.getDynamicValue(var14) : module0139.f9038(var24), var14);
                                final SubLObject var3_45 = module0141.$g1685$.currentBinding(var14);
                                final SubLObject var7_44 = module0141.$g1686$.currentBinding(var14);
                                final SubLObject var11_44 = module0141.$g1683$.currentBinding(var14);
                                final SubLObject var14_53 = module0141.$g1684$.currentBinding(var14);
                                final SubLObject var15_54 = module0141.$g1674$.currentBinding(var14);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0251.NIL, var14);
                                    module0141.$g1686$.bind((SubLObject)module0251.NIL, var14);
                                    module0141.$g1683$.bind((SubLObject)module0251.NIL, var14);
                                    module0141.$g1684$.bind((SubLObject)module0251.NIL, var14);
                                    module0141.$g1674$.bind((SubLObject)module0251.NIL, var14);
                                    final SubLObject var25 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var26 = (SubLObject)module0251.NIL;
                                    try {
                                        var26 = ReadWriteLocks.rw_lock_seize_read_lock(var25);
                                        final SubLObject var3_46 = module0141.$g1665$.currentBinding(var14);
                                        final SubLObject var7_45 = module0139.$g1648$.currentBinding(var14);
                                        try {
                                            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var14);
                                            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var14)), var14);
                                            f16203(var9);
                                        }
                                        finally {
                                            module0139.$g1648$.rebind(var7_45, var14);
                                            module0141.$g1665$.rebind(var3_46, var14);
                                        }
                                    }
                                    finally {
                                        if (module0251.NIL != var26) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var25);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var15_54, var14);
                                    module0141.$g1684$.rebind(var14_53, var14);
                                    module0141.$g1683$.rebind(var11_44, var14);
                                    module0141.$g1686$.rebind(var7_44, var14);
                                    module0141.$g1685$.rebind(var3_45, var14);
                                }
                                if (var24 == module0251.$ic16$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var14));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var3_44, var14);
                            }
                            if (var24 == module0251.$ic16$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var14));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var3_43, var14);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var11_43, var14);
                        module0141.$g1677$.rebind(var7_43, var14);
                        module0141.$g1710$.rebind(var3_42, var14);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var7_42, var14);
                    module0141.$g1714$.rebind(var3_41, var14);
                }
            }
            finally {
                module0147.$g2096$.rebind(var11_42, var14);
                module0147.$g2094$.rebind(var7_41, var14);
                module0147.$g2095$.rebind(var3_40, var14);
            }
        }
        finally {
            module0139.$g1644$.rebind(var20, var14);
            module0137.$g1605$.rebind(var19, var14);
            module0141.$g1674$.rebind(var18, var14);
            module0141.$g1672$.rebind(var17, var14);
            module0141.$g1671$.rebind(var16, var14);
            module0141.$g1670$.rebind(var15, var14);
        }
        return (SubLObject)module0251.NIL;
    }
    
    public static SubLObject f16203(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        if (module0251.NIL != module0136.f8865() || module0251.NIL != module0244.f15795(var9, module0137.f8955((SubLObject)module0251.UNPROVIDED))) {
            final SubLObject var11 = module0141.$g1693$.currentBinding(var10);
            try {
                module0141.$g1693$.bind((SubLObject)module0251.$ic0$, var10);
                module0250.f16162(module0141.f9171(), var9);
            }
            finally {
                module0141.$g1693$.rebind(var11, var10);
            }
        }
        else {
            module0136.f8872((SubLObject)module0251.TWO_INTEGER, (SubLObject)module0251.$ic17$, var9, module0244.f15748(module0137.f8955((SubLObject)module0251.UNPROVIDED)), (SubLObject)module0251.UNPROVIDED, (SubLObject)module0251.UNPROVIDED, (SubLObject)module0251.UNPROVIDED);
        }
        return (SubLObject)module0251.NIL;
    }
    
    public static SubLObject f16205(final SubLObject var9, final SubLObject var58) {
        final SubLThread var59 = SubLProcess.currentSubLThread();
        final SubLObject var60 = module0139.$g1635$.currentBinding(var59);
        try {
            module0139.$g1635$.bind(var58, var59);
            f16203(var9);
        }
        finally {
            module0139.$g1635$.rebind(var60, var59);
        }
        return (SubLObject)module0251.NIL;
    }
    
    public static SubLObject f16206(final SubLObject var8, final SubLObject var9, SubLObject var58, SubLObject var59) {
        if (var58 == module0251.UNPROVIDED) {
            var58 = module0139.$g1635$.getDynamicValue();
        }
        if (var59 == module0251.UNPROVIDED) {
            var59 = module0139.$g1636$.getDynamicValue();
        }
        final SubLThread var60 = SubLProcess.currentSubLThread();
        assert module0251.NIL != module0137.f8885(var8) : var8;
        final SubLObject var61 = module0139.$g1635$.currentBinding(var60);
        final SubLObject var62 = module0139.$g1636$.currentBinding(var60);
        final SubLObject var63 = module0139.$g1644$.currentBinding(var60);
        try {
            module0139.$g1635$.bind(var58, var60);
            module0139.$g1636$.bind(var59, var60);
            module0139.$g1644$.bind((SubLObject)module0251.T, var60);
            f16202(var8, var9, (SubLObject)module0251.UNPROVIDED, (SubLObject)module0251.UNPROVIDED);
        }
        finally {
            module0139.$g1644$.rebind(var63, var60);
            module0139.$g1636$.rebind(var62, var60);
            module0139.$g1635$.rebind(var61, var60);
        }
        return (SubLObject)module0251.NIL;
    }
    
    public static SubLObject f16207(final SubLObject var8, final SubLObject var9, SubLObject var58, SubLObject var59) {
        if (var58 == module0251.UNPROVIDED) {
            var58 = module0139.$g1635$.getDynamicValue();
        }
        if (var59 == module0251.UNPROVIDED) {
            var59 = module0139.$g1636$.getDynamicValue();
        }
        final SubLThread var60 = SubLProcess.currentSubLThread();
        assert module0251.NIL != module0137.f8885(var8) : var8;
        final SubLObject var61 = module0139.$g1635$.currentBinding(var60);
        final SubLObject var62 = module0139.$g1636$.currentBinding(var60);
        final SubLObject var63 = module0139.$g1644$.currentBinding(var60);
        try {
            module0139.$g1635$.bind(var58, var60);
            module0139.$g1636$.bind(var59, var60);
            module0139.$g1644$.bind((SubLObject)module0251.T, var60);
            Errors.warn((SubLObject)module0251.$ic18$, module0139.$g1635$.getDynamicValue(var60));
            f16204(var8, var9, (SubLObject)module0251.UNPROVIDED, (SubLObject)module0251.UNPROVIDED);
        }
        finally {
            module0139.$g1644$.rebind(var63, var60);
            module0139.$g1636$.rebind(var62, var60);
            module0139.$g1635$.rebind(var61, var60);
        }
        return (SubLObject)module0251.NIL;
    }
    
    public static SubLObject f16208(final SubLObject var8, final SubLObject var9, SubLObject var12, SubLObject var13) {
        if (var12 == module0251.UNPROVIDED) {
            var12 = (SubLObject)module0251.NIL;
        }
        if (var13 == module0251.UNPROVIDED) {
            var13 = (SubLObject)module0251.NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        assert module0251.NIL != module0137.f8885(var8) : var8;
        final SubLObject var15 = module0141.$g1670$.currentBinding(var14);
        final SubLObject var16 = module0141.$g1671$.currentBinding(var14);
        final SubLObject var17 = module0141.$g1672$.currentBinding(var14);
        final SubLObject var18 = module0141.$g1674$.currentBinding(var14);
        final SubLObject var19 = module0137.$g1605$.currentBinding(var14);
        final SubLObject var20 = module0139.$g1644$.currentBinding(var14);
        try {
            module0141.$g1670$.bind(var8, var14);
            module0141.$g1671$.bind(module0244.f15739(var8), var14);
            module0141.$g1672$.bind(module0244.f15746(var8), var14);
            module0141.$g1674$.bind((SubLObject)module0251.NIL, var14);
            module0137.$g1605$.bind(var8, var14);
            module0139.$g1644$.bind((SubLObject)module0251.T, var14);
            final SubLObject var21 = var12;
            final SubLObject var3_60 = module0147.$g2095$.currentBinding(var14);
            final SubLObject var7_61 = module0147.$g2094$.currentBinding(var14);
            final SubLObject var11_62 = module0147.$g2096$.currentBinding(var14);
            try {
                module0147.$g2095$.bind(module0147.f9545(var21), var14);
                module0147.$g2094$.bind(module0147.f9546(var21), var14);
                module0147.$g2096$.bind(module0147.f9549(var21), var14);
                final SubLObject var22 = var13;
                final SubLObject var3_61 = module0141.$g1714$.currentBinding(var14);
                final SubLObject var7_62 = module0141.$g1715$.currentBinding(var14);
                try {
                    module0141.$g1714$.bind((module0251.NIL != var22) ? var22 : module0141.f9283(), var14);
                    module0141.$g1715$.bind((SubLObject)((module0251.NIL != var22) ? module0251.$ic6$ : module0141.$g1715$.getDynamicValue(var14)), var14);
                    if (module0251.NIL != var22 && module0251.NIL != module0136.f8864() && module0251.NIL == module0141.f9279(var22)) {
                        final SubLObject var23 = module0136.$g1591$.getDynamicValue(var14);
                        if (var23.eql((SubLObject)module0251.$ic7$)) {
                            module0136.f8870((SubLObject)module0251.ONE_INTEGER, (SubLObject)module0251.$ic8$, var22, (SubLObject)module0251.$ic9$, (SubLObject)module0251.UNPROVIDED, (SubLObject)module0251.UNPROVIDED, (SubLObject)module0251.UNPROVIDED);
                        }
                        else if (var23.eql((SubLObject)module0251.$ic10$)) {
                            module0136.f8871((SubLObject)module0251.ONE_INTEGER, (SubLObject)module0251.$ic11$, (SubLObject)module0251.$ic8$, var22, (SubLObject)module0251.$ic9$, (SubLObject)module0251.UNPROVIDED, (SubLObject)module0251.UNPROVIDED, (SubLObject)module0251.UNPROVIDED);
                        }
                        else if (var23.eql((SubLObject)module0251.$ic12$)) {
                            Errors.warn((SubLObject)module0251.$ic8$, var22, (SubLObject)module0251.$ic9$);
                        }
                        else {
                            Errors.warn((SubLObject)module0251.$ic13$, module0136.$g1591$.getDynamicValue(var14));
                            Errors.cerror((SubLObject)module0251.$ic11$, (SubLObject)module0251.$ic8$, var22, (SubLObject)module0251.$ic9$);
                        }
                    }
                    final SubLObject var3_62 = module0141.$g1710$.currentBinding(var14);
                    final SubLObject var7_63 = module0141.$g1677$.currentBinding(var14);
                    final SubLObject var11_63 = module0138.$g1619$.currentBinding(var14);
                    try {
                        module0141.$g1710$.bind(module0251.$ic14$, var14);
                        module0141.$g1677$.bind(module0141.f9208(), var14);
                        module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0251.UNPROVIDED)), var14);
                        final SubLObject var24 = module0139.f9036();
                        final SubLObject var3_63 = module0139.$g1635$.currentBinding(var14);
                        try {
                            module0139.$g1635$.bind((var24 == module0251.$ic15$) ? module0139.$g1635$.getDynamicValue(var14) : module0139.f9038(var24), var14);
                            final SubLObject var3_64 = module0139.$g1636$.currentBinding(var14);
                            try {
                                module0139.$g1636$.bind((var24 == module0251.$ic15$) ? module0139.$g1636$.getDynamicValue(var14) : module0139.f9038(var24), var14);
                                final SubLObject var3_65 = module0141.$g1685$.currentBinding(var14);
                                final SubLObject var7_64 = module0141.$g1686$.currentBinding(var14);
                                final SubLObject var11_64 = module0141.$g1683$.currentBinding(var14);
                                final SubLObject var14_73 = module0141.$g1684$.currentBinding(var14);
                                final SubLObject var15_74 = module0141.$g1674$.currentBinding(var14);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0251.NIL, var14);
                                    module0141.$g1686$.bind((SubLObject)module0251.NIL, var14);
                                    module0141.$g1683$.bind((SubLObject)module0251.NIL, var14);
                                    module0141.$g1684$.bind((SubLObject)module0251.NIL, var14);
                                    module0141.$g1674$.bind((SubLObject)module0251.NIL, var14);
                                    final SubLObject var25 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var26 = (SubLObject)module0251.NIL;
                                    try {
                                        var26 = ReadWriteLocks.rw_lock_seize_read_lock(var25);
                                        final SubLObject var3_66 = module0141.$g1665$.currentBinding(var14);
                                        final SubLObject var7_65 = module0139.$g1648$.currentBinding(var14);
                                        try {
                                            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var14);
                                            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var14)), var14);
                                            f16209(var9);
                                        }
                                        finally {
                                            module0139.$g1648$.rebind(var7_65, var14);
                                            module0141.$g1665$.rebind(var3_66, var14);
                                        }
                                    }
                                    finally {
                                        if (module0251.NIL != var26) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var25);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var15_74, var14);
                                    module0141.$g1684$.rebind(var14_73, var14);
                                    module0141.$g1683$.rebind(var11_64, var14);
                                    module0141.$g1686$.rebind(var7_64, var14);
                                    module0141.$g1685$.rebind(var3_65, var14);
                                }
                                if (var24 == module0251.$ic16$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var14));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var3_64, var14);
                            }
                            if (var24 == module0251.$ic16$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var14));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var3_63, var14);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var11_63, var14);
                        module0141.$g1677$.rebind(var7_63, var14);
                        module0141.$g1710$.rebind(var3_62, var14);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var7_62, var14);
                    module0141.$g1714$.rebind(var3_61, var14);
                }
            }
            finally {
                module0147.$g2096$.rebind(var11_62, var14);
                module0147.$g2094$.rebind(var7_61, var14);
                module0147.$g2095$.rebind(var3_60, var14);
            }
        }
        finally {
            module0139.$g1644$.rebind(var20, var14);
            module0137.$g1605$.rebind(var19, var14);
            module0141.$g1674$.rebind(var18, var14);
            module0141.$g1672$.rebind(var17, var14);
            module0141.$g1671$.rebind(var16, var14);
            module0141.$g1670$.rebind(var15, var14);
        }
        return (SubLObject)module0251.NIL;
    }
    
    public static SubLObject f16209(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        if (module0251.NIL != module0244.f15762(module0141.f9188())) {
            module0250.f16157(module0141.f9188(), module0138.f8979(), module0141.f9285(), module0139.$g1635$.getDynamicValue(var10), (SubLObject)module0251.$ic19$, var9, (SubLObject)module0251.T, (SubLObject)module0251.UNPROVIDED);
        }
        else {
            f16203(var9);
        }
        return (SubLObject)module0251.NIL;
    }
    
    public static SubLObject f16210(final SubLObject var8, final SubLObject var9, SubLObject var12, SubLObject var13) {
        if (var12 == module0251.UNPROVIDED) {
            var12 = (SubLObject)module0251.NIL;
        }
        if (var13 == module0251.UNPROVIDED) {
            var13 = (SubLObject)module0251.NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        assert module0251.NIL != module0137.f8885(var8) : var8;
        final SubLObject var15 = module0141.$g1670$.currentBinding(var14);
        final SubLObject var16 = module0141.$g1671$.currentBinding(var14);
        final SubLObject var17 = module0141.$g1672$.currentBinding(var14);
        final SubLObject var18 = module0141.$g1674$.currentBinding(var14);
        final SubLObject var19 = module0137.$g1605$.currentBinding(var14);
        final SubLObject var20 = module0139.$g1644$.currentBinding(var14);
        try {
            module0141.$g1670$.bind(var8, var14);
            module0141.$g1671$.bind(module0244.f15739(var8), var14);
            module0141.$g1672$.bind(module0244.f15746(var8), var14);
            module0141.$g1674$.bind((SubLObject)module0251.NIL, var14);
            module0137.$g1605$.bind(var8, var14);
            module0139.$g1644$.bind((SubLObject)module0251.T, var14);
            final SubLObject var21 = var12;
            final SubLObject var3_77 = module0147.$g2095$.currentBinding(var14);
            final SubLObject var7_78 = module0147.$g2094$.currentBinding(var14);
            final SubLObject var11_79 = module0147.$g2096$.currentBinding(var14);
            try {
                module0147.$g2095$.bind(module0147.f9545(var21), var14);
                module0147.$g2094$.bind(module0147.f9546(var21), var14);
                module0147.$g2096$.bind(module0147.f9549(var21), var14);
                final SubLObject var22 = var13;
                final SubLObject var3_78 = module0141.$g1714$.currentBinding(var14);
                final SubLObject var7_79 = module0141.$g1715$.currentBinding(var14);
                try {
                    module0141.$g1714$.bind((module0251.NIL != var22) ? var22 : module0141.f9283(), var14);
                    module0141.$g1715$.bind((SubLObject)((module0251.NIL != var22) ? module0251.$ic6$ : module0141.$g1715$.getDynamicValue(var14)), var14);
                    if (module0251.NIL != var22 && module0251.NIL != module0136.f8864() && module0251.NIL == module0141.f9279(var22)) {
                        final SubLObject var23 = module0136.$g1591$.getDynamicValue(var14);
                        if (var23.eql((SubLObject)module0251.$ic7$)) {
                            module0136.f8870((SubLObject)module0251.ONE_INTEGER, (SubLObject)module0251.$ic8$, var22, (SubLObject)module0251.$ic9$, (SubLObject)module0251.UNPROVIDED, (SubLObject)module0251.UNPROVIDED, (SubLObject)module0251.UNPROVIDED);
                        }
                        else if (var23.eql((SubLObject)module0251.$ic10$)) {
                            module0136.f8871((SubLObject)module0251.ONE_INTEGER, (SubLObject)module0251.$ic11$, (SubLObject)module0251.$ic8$, var22, (SubLObject)module0251.$ic9$, (SubLObject)module0251.UNPROVIDED, (SubLObject)module0251.UNPROVIDED, (SubLObject)module0251.UNPROVIDED);
                        }
                        else if (var23.eql((SubLObject)module0251.$ic12$)) {
                            Errors.warn((SubLObject)module0251.$ic8$, var22, (SubLObject)module0251.$ic9$);
                        }
                        else {
                            Errors.warn((SubLObject)module0251.$ic13$, module0136.$g1591$.getDynamicValue(var14));
                            Errors.cerror((SubLObject)module0251.$ic11$, (SubLObject)module0251.$ic8$, var22, (SubLObject)module0251.$ic9$);
                        }
                    }
                    final SubLObject var3_79 = module0141.$g1710$.currentBinding(var14);
                    final SubLObject var7_80 = module0141.$g1677$.currentBinding(var14);
                    final SubLObject var11_80 = module0138.$g1619$.currentBinding(var14);
                    try {
                        module0141.$g1710$.bind(module0251.$ic14$, var14);
                        module0141.$g1677$.bind(module0141.f9208(), var14);
                        module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0251.UNPROVIDED)), var14);
                        final SubLObject var24 = module0139.f9036();
                        final SubLObject var3_80 = module0139.$g1635$.currentBinding(var14);
                        try {
                            module0139.$g1635$.bind((var24 == module0251.$ic15$) ? module0139.$g1635$.getDynamicValue(var14) : module0139.f9038(var24), var14);
                            final SubLObject var3_81 = module0139.$g1636$.currentBinding(var14);
                            try {
                                module0139.$g1636$.bind((var24 == module0251.$ic15$) ? module0139.$g1636$.getDynamicValue(var14) : module0139.f9038(var24), var14);
                                final SubLObject var3_82 = module0141.$g1685$.currentBinding(var14);
                                final SubLObject var7_81 = module0141.$g1686$.currentBinding(var14);
                                final SubLObject var11_81 = module0141.$g1683$.currentBinding(var14);
                                final SubLObject var14_90 = module0141.$g1684$.currentBinding(var14);
                                final SubLObject var15_91 = module0141.$g1674$.currentBinding(var14);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0251.NIL, var14);
                                    module0141.$g1686$.bind((SubLObject)module0251.NIL, var14);
                                    module0141.$g1683$.bind((SubLObject)module0251.NIL, var14);
                                    module0141.$g1684$.bind((SubLObject)module0251.NIL, var14);
                                    module0141.$g1674$.bind((SubLObject)module0251.NIL, var14);
                                    final SubLObject var25 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var26 = (SubLObject)module0251.NIL;
                                    try {
                                        var26 = ReadWriteLocks.rw_lock_seize_read_lock(var25);
                                        final SubLObject var3_83 = module0141.$g1665$.currentBinding(var14);
                                        final SubLObject var7_82 = module0139.$g1648$.currentBinding(var14);
                                        try {
                                            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var14);
                                            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var14)), var14);
                                            f16211(var9);
                                        }
                                        finally {
                                            module0139.$g1648$.rebind(var7_82, var14);
                                            module0141.$g1665$.rebind(var3_83, var14);
                                        }
                                    }
                                    finally {
                                        if (module0251.NIL != var26) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var25);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var15_91, var14);
                                    module0141.$g1684$.rebind(var14_90, var14);
                                    module0141.$g1683$.rebind(var11_81, var14);
                                    module0141.$g1686$.rebind(var7_81, var14);
                                    module0141.$g1685$.rebind(var3_82, var14);
                                }
                                if (var24 == module0251.$ic16$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var14));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var3_81, var14);
                            }
                            if (var24 == module0251.$ic16$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var14));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var3_80, var14);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var11_80, var14);
                        module0141.$g1677$.rebind(var7_80, var14);
                        module0141.$g1710$.rebind(var3_79, var14);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var7_79, var14);
                    module0141.$g1714$.rebind(var3_78, var14);
                }
            }
            finally {
                module0147.$g2096$.rebind(var11_79, var14);
                module0147.$g2094$.rebind(var7_78, var14);
                module0147.$g2095$.rebind(var3_77, var14);
            }
        }
        finally {
            module0139.$g1644$.rebind(var20, var14);
            module0137.$g1605$.rebind(var19, var14);
            module0141.$g1674$.rebind(var18, var14);
            module0141.$g1672$.rebind(var17, var14);
            module0141.$g1671$.rebind(var16, var14);
            module0141.$g1670$.rebind(var15, var14);
        }
        return (SubLObject)module0251.NIL;
    }
    
    public static SubLObject f16212(final SubLObject var8, final SubLObject var9, SubLObject var12, SubLObject var13) {
        if (var12 == module0251.UNPROVIDED) {
            var12 = (SubLObject)module0251.NIL;
        }
        if (var13 == module0251.UNPROVIDED) {
            var13 = (SubLObject)module0251.NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        assert module0251.NIL != module0137.f8885(var8) : var8;
        final SubLObject var15 = module0141.$g1670$.currentBinding(var14);
        final SubLObject var16 = module0141.$g1671$.currentBinding(var14);
        final SubLObject var17 = module0141.$g1672$.currentBinding(var14);
        final SubLObject var18 = module0141.$g1674$.currentBinding(var14);
        final SubLObject var19 = module0137.$g1605$.currentBinding(var14);
        final SubLObject var20 = module0139.$g1644$.currentBinding(var14);
        try {
            module0141.$g1670$.bind(var8, var14);
            module0141.$g1671$.bind(module0244.f15739(var8), var14);
            module0141.$g1672$.bind(module0244.f15746(var8), var14);
            module0141.$g1674$.bind((SubLObject)module0251.NIL, var14);
            module0137.$g1605$.bind(var8, var14);
            module0139.$g1644$.bind((SubLObject)module0251.T, var14);
            final SubLObject var21 = var12;
            final SubLObject var3_94 = module0147.$g2095$.currentBinding(var14);
            final SubLObject var7_95 = module0147.$g2094$.currentBinding(var14);
            final SubLObject var11_96 = module0147.$g2096$.currentBinding(var14);
            try {
                module0147.$g2095$.bind(module0147.f9545(var21), var14);
                module0147.$g2094$.bind(module0147.f9546(var21), var14);
                module0147.$g2096$.bind(module0147.f9549(var21), var14);
                final SubLObject var22 = var13;
                final SubLObject var3_95 = module0141.$g1714$.currentBinding(var14);
                final SubLObject var7_96 = module0141.$g1715$.currentBinding(var14);
                try {
                    module0141.$g1714$.bind((module0251.NIL != var22) ? var22 : module0141.f9283(), var14);
                    module0141.$g1715$.bind((SubLObject)((module0251.NIL != var22) ? module0251.$ic6$ : module0141.$g1715$.getDynamicValue(var14)), var14);
                    if (module0251.NIL != var22 && module0251.NIL != module0136.f8864() && module0251.NIL == module0141.f9279(var22)) {
                        final SubLObject var23 = module0136.$g1591$.getDynamicValue(var14);
                        if (var23.eql((SubLObject)module0251.$ic7$)) {
                            module0136.f8870((SubLObject)module0251.ONE_INTEGER, (SubLObject)module0251.$ic8$, var22, (SubLObject)module0251.$ic9$, (SubLObject)module0251.UNPROVIDED, (SubLObject)module0251.UNPROVIDED, (SubLObject)module0251.UNPROVIDED);
                        }
                        else if (var23.eql((SubLObject)module0251.$ic10$)) {
                            module0136.f8871((SubLObject)module0251.ONE_INTEGER, (SubLObject)module0251.$ic11$, (SubLObject)module0251.$ic8$, var22, (SubLObject)module0251.$ic9$, (SubLObject)module0251.UNPROVIDED, (SubLObject)module0251.UNPROVIDED, (SubLObject)module0251.UNPROVIDED);
                        }
                        else if (var23.eql((SubLObject)module0251.$ic12$)) {
                            Errors.warn((SubLObject)module0251.$ic8$, var22, (SubLObject)module0251.$ic9$);
                        }
                        else {
                            Errors.warn((SubLObject)module0251.$ic13$, module0136.$g1591$.getDynamicValue(var14));
                            Errors.cerror((SubLObject)module0251.$ic11$, (SubLObject)module0251.$ic8$, var22, (SubLObject)module0251.$ic9$);
                        }
                    }
                    final SubLObject var3_96 = module0141.$g1710$.currentBinding(var14);
                    final SubLObject var7_97 = module0141.$g1677$.currentBinding(var14);
                    final SubLObject var11_97 = module0138.$g1619$.currentBinding(var14);
                    try {
                        module0141.$g1710$.bind(module0251.$ic14$, var14);
                        module0141.$g1677$.bind(module0141.f9208(), var14);
                        module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0251.UNPROVIDED)), var14);
                        final SubLObject var24 = module0139.f9036();
                        final SubLObject var3_97 = module0139.$g1635$.currentBinding(var14);
                        try {
                            module0139.$g1635$.bind((var24 == module0251.$ic15$) ? module0139.$g1635$.getDynamicValue(var14) : module0139.f9038(var24), var14);
                            final SubLObject var3_98 = module0139.$g1636$.currentBinding(var14);
                            try {
                                module0139.$g1636$.bind((var24 == module0251.$ic15$) ? module0139.$g1636$.getDynamicValue(var14) : module0139.f9038(var24), var14);
                                final SubLObject var3_99 = module0141.$g1685$.currentBinding(var14);
                                final SubLObject var7_98 = module0141.$g1686$.currentBinding(var14);
                                final SubLObject var11_98 = module0141.$g1683$.currentBinding(var14);
                                final SubLObject var14_107 = module0141.$g1684$.currentBinding(var14);
                                final SubLObject var15_108 = module0141.$g1674$.currentBinding(var14);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0251.NIL, var14);
                                    module0141.$g1686$.bind((SubLObject)module0251.NIL, var14);
                                    module0141.$g1683$.bind((SubLObject)module0251.NIL, var14);
                                    module0141.$g1684$.bind((SubLObject)module0251.NIL, var14);
                                    module0141.$g1674$.bind((SubLObject)module0251.NIL, var14);
                                    final SubLObject var25 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var26 = (SubLObject)module0251.NIL;
                                    try {
                                        var26 = ReadWriteLocks.rw_lock_seize_read_lock(var25);
                                        final SubLObject var3_100 = module0141.$g1665$.currentBinding(var14);
                                        final SubLObject var7_99 = module0139.$g1648$.currentBinding(var14);
                                        try {
                                            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var14);
                                            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var14)), var14);
                                            f16211(var9);
                                        }
                                        finally {
                                            module0139.$g1648$.rebind(var7_99, var14);
                                            module0141.$g1665$.rebind(var3_100, var14);
                                        }
                                    }
                                    finally {
                                        if (module0251.NIL != var26) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var25);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var15_108, var14);
                                    module0141.$g1684$.rebind(var14_107, var14);
                                    module0141.$g1683$.rebind(var11_98, var14);
                                    module0141.$g1686$.rebind(var7_98, var14);
                                    module0141.$g1685$.rebind(var3_99, var14);
                                }
                                if (var24 == module0251.$ic16$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var14));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var3_98, var14);
                            }
                            if (var24 == module0251.$ic16$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var14));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var3_97, var14);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var11_97, var14);
                        module0141.$g1677$.rebind(var7_97, var14);
                        module0141.$g1710$.rebind(var3_96, var14);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var7_96, var14);
                    module0141.$g1714$.rebind(var3_95, var14);
                }
            }
            finally {
                module0147.$g2096$.rebind(var11_96, var14);
                module0147.$g2094$.rebind(var7_95, var14);
                module0147.$g2095$.rebind(var3_94, var14);
            }
        }
        finally {
            module0139.$g1644$.rebind(var20, var14);
            module0137.$g1605$.rebind(var19, var14);
            module0141.$g1674$.rebind(var18, var14);
            module0141.$g1672$.rebind(var17, var14);
            module0141.$g1671$.rebind(var16, var14);
            module0141.$g1670$.rebind(var15, var14);
        }
        return (SubLObject)module0251.NIL;
    }
    
    public static SubLObject f16211(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        if (module0251.NIL != module0136.f8865() || module0251.NIL != module0244.f15795(var9, module0137.f8955((SubLObject)module0251.UNPROVIDED))) {
            final SubLObject var11 = module0141.$g1669$.currentBinding(var10);
            final SubLObject var12 = module0141.$g1693$.currentBinding(var10);
            try {
                module0141.$g1669$.bind((SubLObject)module0251.T, var10);
                module0141.$g1693$.bind((SubLObject)module0251.$ic0$, var10);
                if (module0251.NIL != module0244.f15752(module0141.f9188())) {
                    SubLObject var13 = module0249.f16019(var9, (SubLObject)module0251.UNPROVIDED);
                    SubLObject var14 = (SubLObject)module0251.NIL;
                    var14 = var13.first();
                    while (module0251.NIL != var13) {
                        final SubLObject var3_111 = module0141.$g1673$.currentBinding(var10);
                        final SubLObject var7_112 = module0141.$g1674$.currentBinding(var10);
                        try {
                            module0141.$g1673$.bind(module0244.f15746(module0137.f8955(var14)), var10);
                            module0141.$g1674$.bind(Equality.eql(var14, module0251.$ic1$), var10);
                            module0250.f16162(module0141.f9171(), var9);
                        }
                        finally {
                            module0141.$g1674$.rebind(var7_112, var10);
                            module0141.$g1673$.rebind(var3_111, var10);
                        }
                        var13 = var13.rest();
                        var14 = var13.first();
                    }
                }
                else {
                    module0250.f16162(module0141.f9171(), var9);
                }
            }
            finally {
                module0141.$g1693$.rebind(var12, var10);
                module0141.$g1669$.rebind(var11, var10);
            }
        }
        else {
            module0136.f8872((SubLObject)module0251.TWO_INTEGER, (SubLObject)module0251.$ic17$, var9, module0244.f15748(module0137.f8955((SubLObject)module0251.UNPROVIDED)), (SubLObject)module0251.UNPROVIDED, (SubLObject)module0251.UNPROVIDED, (SubLObject)module0251.UNPROVIDED);
        }
        return (SubLObject)module0251.NIL;
    }
    
    public static SubLObject f16213(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        final SubLObject var11 = module0141.$g1669$.currentBinding(var10);
        final SubLObject var12 = module0141.$g1693$.currentBinding(var10);
        try {
            module0141.$g1669$.bind((SubLObject)module0251.T, var10);
            module0141.$g1693$.bind((SubLObject)module0251.$ic0$, var10);
            module0250.f16162(module0141.f9171(), var9);
        }
        finally {
            module0141.$g1693$.rebind(var12, var10);
            module0141.$g1669$.rebind(var11, var10);
        }
        return (SubLObject)module0251.NIL;
    }
    
    public static SubLObject f16214(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        if (module0251.NIL != module0244.f15762(module0141.f9188())) {
            if (module0251.NIL != module0244.f15752(module0141.f9188())) {
                SubLObject var11 = module0249.f16019(var9, (SubLObject)module0251.UNPROVIDED);
                SubLObject var12 = (SubLObject)module0251.NIL;
                var12 = var11.first();
                while (module0251.NIL != var11) {
                    final SubLObject var13 = module0141.$g1673$.currentBinding(var10);
                    final SubLObject var14 = module0141.$g1674$.currentBinding(var10);
                    try {
                        module0141.$g1673$.bind(module0244.f15746(module0137.f8955(var12)), var10);
                        module0141.$g1674$.bind(Equality.eql(var12, module0251.$ic1$), var10);
                        module0250.f16160(module0141.f9188(), module0138.f8979(), module0141.f9285(), module0139.$g1635$.getDynamicValue(var10), (SubLObject)module0251.$ic20$, var9, (SubLObject)module0251.UNPROVIDED);
                    }
                    finally {
                        module0141.$g1674$.rebind(var14, var10);
                        module0141.$g1673$.rebind(var13, var10);
                    }
                    var11 = var11.rest();
                    var12 = var11.first();
                }
            }
            else {
                module0250.f16160(module0141.f9188(), module0138.f8979(), module0141.f9285(), module0139.$g1635$.getDynamicValue(var10), (SubLObject)module0251.$ic20$, var9, (SubLObject)module0251.UNPROVIDED);
            }
        }
        else {
            f16211(var9);
        }
        return (SubLObject)module0251.NIL;
    }
    
    public static SubLObject f16215(final SubLObject var113, final SubLObject var9) {
        final SubLThread var114 = SubLProcess.currentSubLThread();
        final SubLObject var115 = (SubLObject)module0251.NIL;
        final SubLObject var116 = module0141.$g1669$.currentBinding(var114);
        try {
            module0141.$g1669$.bind((SubLObject)module0251.T, var114);
            final SubLObject var117 = (SubLObject)module0251.NIL;
            final SubLObject var3_115 = module0141.$g1714$.currentBinding(var114);
            final SubLObject var118 = module0141.$g1715$.currentBinding(var114);
            try {
                module0141.$g1714$.bind((module0251.NIL != var117) ? var117 : module0141.f9283(), var114);
                module0141.$g1715$.bind((SubLObject)((module0251.NIL != var117) ? module0251.$ic6$ : module0141.$g1715$.getDynamicValue(var114)), var114);
                if (module0251.NIL != var117 && module0251.NIL != module0136.f8864() && module0251.NIL == module0141.f9279(var117)) {
                    final SubLObject var119 = module0136.$g1591$.getDynamicValue(var114);
                    if (var119.eql((SubLObject)module0251.$ic7$)) {
                        module0136.f8870((SubLObject)module0251.ONE_INTEGER, (SubLObject)module0251.$ic8$, var117, (SubLObject)module0251.$ic9$, (SubLObject)module0251.UNPROVIDED, (SubLObject)module0251.UNPROVIDED, (SubLObject)module0251.UNPROVIDED);
                    }
                    else if (var119.eql((SubLObject)module0251.$ic10$)) {
                        module0136.f8871((SubLObject)module0251.ONE_INTEGER, (SubLObject)module0251.$ic11$, (SubLObject)module0251.$ic8$, var117, (SubLObject)module0251.$ic9$, (SubLObject)module0251.UNPROVIDED, (SubLObject)module0251.UNPROVIDED, (SubLObject)module0251.UNPROVIDED);
                    }
                    else if (var119.eql((SubLObject)module0251.$ic12$)) {
                        Errors.warn((SubLObject)module0251.$ic8$, var117, (SubLObject)module0251.$ic9$);
                    }
                    else {
                        Errors.warn((SubLObject)module0251.$ic13$, module0136.$g1591$.getDynamicValue(var114));
                        Errors.cerror((SubLObject)module0251.$ic11$, (SubLObject)module0251.$ic8$, var117, (SubLObject)module0251.$ic9$);
                    }
                }
                final SubLObject var3_116 = module0141.$g1710$.currentBinding(var114);
                final SubLObject var7_117 = module0141.$g1677$.currentBinding(var114);
                final SubLObject var120 = module0138.$g1619$.currentBinding(var114);
                try {
                    module0141.$g1710$.bind(module0251.$ic14$, var114);
                    module0141.$g1677$.bind(module0141.f9210(), var114);
                    module0138.$g1619$.bind(module0244.f15780(module0137.f8955((SubLObject)module0251.UNPROVIDED)), var114);
                    final SubLObject var121 = module0139.f9036();
                    final SubLObject var3_117 = module0139.$g1635$.currentBinding(var114);
                    try {
                        module0139.$g1635$.bind((var121 == module0251.$ic15$) ? module0139.$g1635$.getDynamicValue(var114) : module0139.f9038(var121), var114);
                        final SubLObject var3_118 = module0139.$g1636$.currentBinding(var114);
                        try {
                            module0139.$g1636$.bind((var121 == module0251.$ic15$) ? module0139.$g1636$.getDynamicValue(var114) : module0139.f9038(var121), var114);
                            final SubLObject var3_119 = module0141.$g1685$.currentBinding(var114);
                            final SubLObject var7_118 = module0141.$g1686$.currentBinding(var114);
                            final SubLObject var11_122 = module0141.$g1683$.currentBinding(var114);
                            final SubLObject var122 = module0141.$g1684$.currentBinding(var114);
                            final SubLObject var123 = module0141.$g1674$.currentBinding(var114);
                            try {
                                module0141.$g1685$.bind((SubLObject)module0251.NIL, var114);
                                module0141.$g1686$.bind((SubLObject)module0251.NIL, var114);
                                module0141.$g1683$.bind((SubLObject)module0251.NIL, var114);
                                module0141.$g1684$.bind((SubLObject)module0251.NIL, var114);
                                module0141.$g1674$.bind((SubLObject)module0251.NIL, var114);
                                final SubLObject var124 = module0138.$g1626$.getGlobalValue();
                                SubLObject var125 = (SubLObject)module0251.NIL;
                                try {
                                    var125 = ReadWriteLocks.rw_lock_seize_read_lock(var124);
                                    final SubLObject var3_120 = module0141.$g1665$.currentBinding(var114);
                                    final SubLObject var7_119 = module0139.$g1648$.currentBinding(var114);
                                    final SubLObject var11_123 = module0141.$g1694$.currentBinding(var114);
                                    final SubLObject var14_126 = module0141.$g1693$.currentBinding(var114);
                                    try {
                                        module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var114);
                                        module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var114)), var114);
                                        module0141.$g1694$.bind(var113, var114);
                                        module0141.$g1693$.bind((SubLObject)module0251.$ic21$, var114);
                                        if (module0251.NIL != module0244.f15752(module0141.f9188())) {
                                            SubLObject var126 = module0249.f16019(var9, (SubLObject)module0251.UNPROVIDED);
                                            SubLObject var127 = (SubLObject)module0251.NIL;
                                            var127 = var126.first();
                                            while (module0251.NIL != var126) {
                                                final SubLObject var3_121 = module0141.$g1673$.currentBinding(var114);
                                                final SubLObject var7_120 = module0141.$g1674$.currentBinding(var114);
                                                try {
                                                    module0141.$g1673$.bind(module0244.f15746(module0137.f8955(var127)), var114);
                                                    module0141.$g1674$.bind(Equality.eql(var127, module0251.$ic1$), var114);
                                                    module0250.f16162(module0141.f9171(), var9);
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var7_120, var114);
                                                    module0141.$g1673$.rebind(var3_121, var114);
                                                }
                                                var126 = var126.rest();
                                                var127 = var126.first();
                                            }
                                        }
                                        else {
                                            module0250.f16162(module0141.f9171(), var9);
                                        }
                                    }
                                    finally {
                                        module0141.$g1693$.rebind(var14_126, var114);
                                        module0141.$g1694$.rebind(var11_123, var114);
                                        module0139.$g1648$.rebind(var7_119, var114);
                                        module0141.$g1665$.rebind(var3_120, var114);
                                    }
                                }
                                finally {
                                    if (module0251.NIL != var125) {
                                        ReadWriteLocks.rw_lock_release_read_lock(var124);
                                    }
                                }
                            }
                            finally {
                                module0141.$g1674$.rebind(var123, var114);
                                module0141.$g1684$.rebind(var122, var114);
                                module0141.$g1683$.rebind(var11_122, var114);
                                module0141.$g1686$.rebind(var7_118, var114);
                                module0141.$g1685$.rebind(var3_119, var114);
                            }
                            if (var121 == module0251.$ic16$) {
                                module0139.f9012(module0139.$g1636$.getDynamicValue(var114));
                            }
                        }
                        finally {
                            module0139.$g1636$.rebind(var3_118, var114);
                        }
                        if (var121 == module0251.$ic16$) {
                            module0139.f9012(module0139.$g1635$.getDynamicValue(var114));
                        }
                    }
                    finally {
                        module0139.$g1635$.rebind(var3_117, var114);
                    }
                }
                finally {
                    module0138.$g1619$.rebind(var120, var114);
                    module0141.$g1677$.rebind(var7_117, var114);
                    module0141.$g1710$.rebind(var3_116, var114);
                }
            }
            finally {
                module0141.$g1715$.rebind(var118, var114);
                module0141.$g1714$.rebind(var3_115, var114);
            }
        }
        finally {
            module0141.$g1669$.rebind(var116, var114);
        }
        return var115;
    }
    
    public static SubLObject f16216(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        final SubLObject var11 = module0141.$g1669$.currentBinding(var10);
        final SubLObject var12 = module0141.$g1693$.currentBinding(var10);
        try {
            module0141.$g1669$.bind((SubLObject)module0251.T, var10);
            module0141.$g1693$.bind((SubLObject)module0251.$ic22$, var10);
            if (module0251.NIL != module0244.f15752(module0141.f9188())) {
                SubLObject var13 = module0249.f16019(var9, (SubLObject)module0251.UNPROVIDED);
                SubLObject var14 = (SubLObject)module0251.NIL;
                var14 = var13.first();
                while (module0251.NIL != var13) {
                    final SubLObject var3_129 = module0141.$g1673$.currentBinding(var10);
                    final SubLObject var7_130 = module0141.$g1674$.currentBinding(var10);
                    try {
                        module0141.$g1673$.bind(module0244.f15746(module0137.f8955(var14)), var10);
                        module0141.$g1674$.bind(Equality.eql(var14, module0251.$ic1$), var10);
                        module0250.f16162(module0141.f9171(), var9);
                    }
                    finally {
                        module0141.$g1674$.rebind(var7_130, var10);
                        module0141.$g1673$.rebind(var3_129, var10);
                    }
                    var13 = var13.rest();
                    var14 = var13.first();
                }
            }
            else {
                module0250.f16162(module0141.f9171(), var9);
            }
        }
        finally {
            module0141.$g1693$.rebind(var12, var10);
            module0141.$g1669$.rebind(var11, var10);
        }
        return (SubLObject)module0251.NIL;
    }
    
    public static SubLObject f16217(final SubLObject var9, final SubLObject var113) {
        final SubLThread var114 = SubLProcess.currentSubLThread();
        final SubLObject var115 = module0141.$g1669$.currentBinding(var114);
        final SubLObject var116 = module0141.$g1694$.currentBinding(var114);
        final SubLObject var117 = module0141.$g1693$.currentBinding(var114);
        try {
            module0141.$g1669$.bind((SubLObject)module0251.T, var114);
            module0141.$g1694$.bind(var113, var114);
            module0141.$g1693$.bind((SubLObject)module0251.$ic23$, var114);
            if (module0251.NIL != module0244.f15752(module0141.f9188())) {
                SubLObject var118 = module0249.f16019(var9, (SubLObject)module0251.UNPROVIDED);
                SubLObject var119 = (SubLObject)module0251.NIL;
                var119 = var118.first();
                while (module0251.NIL != var118) {
                    final SubLObject var3_131 = module0141.$g1673$.currentBinding(var114);
                    final SubLObject var7_132 = module0141.$g1674$.currentBinding(var114);
                    try {
                        module0141.$g1673$.bind(module0244.f15746(module0137.f8955(var119)), var114);
                        module0141.$g1674$.bind(Equality.eql(var119, module0251.$ic1$), var114);
                        module0250.f16162(module0141.f9171(), var9);
                    }
                    finally {
                        module0141.$g1674$.rebind(var7_132, var114);
                        module0141.$g1673$.rebind(var3_131, var114);
                    }
                    var118 = var118.rest();
                    var119 = var118.first();
                }
            }
            else {
                module0250.f16162(module0141.f9171(), var9);
            }
        }
        finally {
            module0141.$g1693$.rebind(var117, var114);
            module0141.$g1694$.rebind(var116, var114);
            module0141.$g1669$.rebind(var115, var114);
        }
        return (SubLObject)module0251.NIL;
    }
    
    public static SubLObject f16218(final SubLObject var9, final SubLObject var58) {
        final SubLThread var59 = SubLProcess.currentSubLThread();
        final SubLObject var60 = module0141.$g1669$.currentBinding(var59);
        final SubLObject var61 = module0139.$g1649$.currentBinding(var59);
        final SubLObject var62 = module0141.$g1693$.currentBinding(var59);
        try {
            module0141.$g1669$.bind((SubLObject)module0251.T, var59);
            module0139.$g1649$.bind(var58, var59);
            module0141.$g1693$.bind((SubLObject)module0251.$ic24$, var59);
            if (module0251.NIL != module0244.f15752(module0141.f9188())) {
                SubLObject var63 = module0249.f16019(var9, (SubLObject)module0251.UNPROVIDED);
                SubLObject var64 = (SubLObject)module0251.NIL;
                var64 = var63.first();
                while (module0251.NIL != var63) {
                    final SubLObject var3_133 = module0141.$g1673$.currentBinding(var59);
                    final SubLObject var7_134 = module0141.$g1674$.currentBinding(var59);
                    try {
                        module0141.$g1673$.bind(module0244.f15746(module0137.f8955(var64)), var59);
                        module0141.$g1674$.bind(Equality.eql(var64, module0251.$ic1$), var59);
                        module0250.f16162(module0141.f9171(), var9);
                    }
                    finally {
                        module0141.$g1674$.rebind(var7_134, var59);
                        module0141.$g1673$.rebind(var3_133, var59);
                    }
                    var63 = var63.rest();
                    var64 = var63.first();
                }
            }
            else {
                module0250.f16162(module0141.f9171(), var9);
            }
        }
        finally {
            module0141.$g1693$.rebind(var62, var59);
            module0139.$g1649$.rebind(var61, var59);
            module0141.$g1669$.rebind(var60, var59);
        }
        return (SubLObject)module0251.NIL;
    }
    
    public static SubLObject f16219(final SubLObject var9, final SubLObject var58) {
        final SubLThread var59 = SubLProcess.currentSubLThread();
        final SubLObject var60 = module0141.$g1669$.currentBinding(var59);
        final SubLObject var61 = module0139.$g1649$.currentBinding(var59);
        final SubLObject var62 = module0141.$g1693$.currentBinding(var59);
        try {
            module0141.$g1669$.bind((SubLObject)module0251.T, var59);
            module0139.$g1649$.bind(var58, var59);
            module0141.$g1693$.bind((SubLObject)module0251.$ic25$, var59);
            if (module0251.NIL != module0244.f15752(module0141.f9188())) {
                SubLObject var63 = module0249.f16019(var9, (SubLObject)module0251.UNPROVIDED);
                SubLObject var64 = (SubLObject)module0251.NIL;
                var64 = var63.first();
                while (module0251.NIL != var63) {
                    final SubLObject var3_135 = module0141.$g1673$.currentBinding(var59);
                    final SubLObject var7_136 = module0141.$g1674$.currentBinding(var59);
                    try {
                        module0141.$g1673$.bind(module0244.f15746(module0137.f8955(var64)), var59);
                        module0141.$g1674$.bind(Equality.eql(var64, module0251.$ic1$), var59);
                        module0250.f16162(module0141.f9171(), var9);
                    }
                    finally {
                        module0141.$g1674$.rebind(var7_136, var59);
                        module0141.$g1673$.rebind(var3_135, var59);
                    }
                    var63 = var63.rest();
                    var64 = var63.first();
                }
            }
            else {
                module0250.f16162(module0141.f9171(), var9);
            }
        }
        finally {
            module0141.$g1693$.rebind(var62, var59);
            module0139.$g1649$.rebind(var61, var59);
            module0141.$g1669$.rebind(var60, var59);
        }
        return (SubLObject)module0251.NIL;
    }
    
    public static SubLObject f16220(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        final SubLObject var11 = module0139.$g1638$.currentBinding(var10);
        final SubLObject var12 = module0139.$g1635$.currentBinding(var10);
        try {
            module0139.$g1638$.bind(module0139.$g1635$.getDynamicValue(var10), var10);
            module0139.$g1635$.bind(module0139.f9007(), var10);
            final SubLObject var3_137 = module0139.$g1644$.currentBinding(var10);
            final SubLObject var7_138 = module0141.$g1710$.currentBinding(var10);
            final SubLObject var13 = module0141.$g1677$.currentBinding(var10);
            final SubLObject var14 = module0138.$g1619$.currentBinding(var10);
            try {
                module0139.$g1644$.bind((SubLObject)module0251.T, var10);
                module0141.$g1710$.bind(module0251.$ic14$, var10);
                module0141.$g1677$.bind(module0141.f9208(), var10);
                module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0251.UNPROVIDED)), var10);
                final SubLObject var15 = module0139.f9036();
                final SubLObject var3_138 = module0139.$g1635$.currentBinding(var10);
                try {
                    module0139.$g1635$.bind((var15 == module0251.$ic15$) ? module0139.$g1635$.getDynamicValue(var10) : module0139.f9038(var15), var10);
                    final SubLObject var3_139 = module0139.$g1636$.currentBinding(var10);
                    try {
                        module0139.$g1636$.bind((var15 == module0251.$ic15$) ? module0139.$g1636$.getDynamicValue(var10) : module0139.f9038(var15), var10);
                        final SubLObject var3_140 = module0141.$g1685$.currentBinding(var10);
                        final SubLObject var7_139 = module0141.$g1686$.currentBinding(var10);
                        final SubLObject var11_143 = module0141.$g1683$.currentBinding(var10);
                        final SubLObject var14_144 = module0141.$g1684$.currentBinding(var10);
                        final SubLObject var16 = module0141.$g1674$.currentBinding(var10);
                        try {
                            module0141.$g1685$.bind((SubLObject)module0251.NIL, var10);
                            module0141.$g1686$.bind((SubLObject)module0251.NIL, var10);
                            module0141.$g1683$.bind((SubLObject)module0251.NIL, var10);
                            module0141.$g1684$.bind((SubLObject)module0251.NIL, var10);
                            module0141.$g1674$.bind((SubLObject)module0251.NIL, var10);
                            final SubLObject var17 = module0138.$g1626$.getGlobalValue();
                            SubLObject var18 = (SubLObject)module0251.NIL;
                            try {
                                var18 = ReadWriteLocks.rw_lock_seize_read_lock(var17);
                                final SubLObject var3_141 = module0141.$g1665$.currentBinding(var10);
                                final SubLObject var7_140 = module0139.$g1648$.currentBinding(var10);
                                try {
                                    module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var10);
                                    module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var10)), var10);
                                    f16209(var9);
                                    if (module0251.NIL != module0249.f16059(var9, (SubLObject)module0251.UNPROVIDED)) {
                                        final SubLObject var3_142 = module0138.$g1619$.currentBinding(var10);
                                        final SubLObject var7_141 = module0141.$g1677$.currentBinding(var10);
                                        try {
                                            module0138.$g1619$.bind(module0244.f15780(module0137.f8955((SubLObject)module0251.UNPROVIDED)), var10);
                                            module0141.$g1677$.bind(module0141.f9210(), var10);
                                            f16218(var9, module0139.$g1638$.getDynamicValue(var10));
                                        }
                                        finally {
                                            module0141.$g1677$.rebind(var7_141, var10);
                                            module0138.$g1619$.rebind(var3_142, var10);
                                        }
                                    }
                                    else {
                                        module0249.f16055(var9, module0139.$g1638$.getDynamicValue(var10));
                                    }
                                }
                                finally {
                                    module0139.$g1648$.rebind(var7_140, var10);
                                    module0141.$g1665$.rebind(var3_141, var10);
                                }
                            }
                            finally {
                                if (module0251.NIL != var18) {
                                    ReadWriteLocks.rw_lock_release_read_lock(var17);
                                }
                            }
                        }
                        finally {
                            module0141.$g1674$.rebind(var16, var10);
                            module0141.$g1684$.rebind(var14_144, var10);
                            module0141.$g1683$.rebind(var11_143, var10);
                            module0141.$g1686$.rebind(var7_139, var10);
                            module0141.$g1685$.rebind(var3_140, var10);
                        }
                        if (var15 == module0251.$ic16$) {
                            module0139.f9012(module0139.$g1636$.getDynamicValue(var10));
                        }
                    }
                    finally {
                        module0139.$g1636$.rebind(var3_139, var10);
                    }
                    if (var15 == module0251.$ic16$) {
                        module0139.f9012(module0139.$g1635$.getDynamicValue(var10));
                    }
                }
                finally {
                    module0139.$g1635$.rebind(var3_138, var10);
                }
            }
            finally {
                module0138.$g1619$.rebind(var14, var10);
                module0141.$g1677$.rebind(var13, var10);
                module0141.$g1710$.rebind(var7_138, var10);
                module0139.$g1644$.rebind(var3_137, var10);
            }
            module0139.f9011(module0139.$g1635$.getDynamicValue(var10));
        }
        finally {
            module0139.$g1635$.rebind(var12, var10);
            module0139.$g1638$.rebind(var11, var10);
        }
        return (SubLObject)module0251.NIL;
    }
    
    public static SubLObject f16221(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        final SubLObject var11 = module0139.$g1638$.currentBinding(var10);
        final SubLObject var12 = module0139.$g1635$.currentBinding(var10);
        try {
            module0139.$g1638$.bind(module0139.$g1635$.getDynamicValue(var10), var10);
            module0139.$g1635$.bind(module0139.f9007(), var10);
            final SubLObject var3_149 = module0139.$g1644$.currentBinding(var10);
            final SubLObject var7_150 = module0141.$g1710$.currentBinding(var10);
            final SubLObject var13 = module0141.$g1677$.currentBinding(var10);
            final SubLObject var14 = module0138.$g1619$.currentBinding(var10);
            try {
                module0139.$g1644$.bind((SubLObject)module0251.T, var10);
                module0141.$g1710$.bind(module0251.$ic14$, var10);
                module0141.$g1677$.bind(module0141.f9208(), var10);
                module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0251.UNPROVIDED)), var10);
                final SubLObject var15 = module0139.f9036();
                final SubLObject var3_150 = module0139.$g1635$.currentBinding(var10);
                try {
                    module0139.$g1635$.bind((var15 == module0251.$ic15$) ? module0139.$g1635$.getDynamicValue(var10) : module0139.f9038(var15), var10);
                    final SubLObject var3_151 = module0139.$g1636$.currentBinding(var10);
                    try {
                        module0139.$g1636$.bind((var15 == module0251.$ic15$) ? module0139.$g1636$.getDynamicValue(var10) : module0139.f9038(var15), var10);
                        final SubLObject var3_152 = module0141.$g1685$.currentBinding(var10);
                        final SubLObject var7_151 = module0141.$g1686$.currentBinding(var10);
                        final SubLObject var11_155 = module0141.$g1683$.currentBinding(var10);
                        final SubLObject var14_156 = module0141.$g1684$.currentBinding(var10);
                        final SubLObject var16 = module0141.$g1674$.currentBinding(var10);
                        try {
                            module0141.$g1685$.bind((SubLObject)module0251.NIL, var10);
                            module0141.$g1686$.bind((SubLObject)module0251.NIL, var10);
                            module0141.$g1683$.bind((SubLObject)module0251.NIL, var10);
                            module0141.$g1684$.bind((SubLObject)module0251.NIL, var10);
                            module0141.$g1674$.bind((SubLObject)module0251.NIL, var10);
                            final SubLObject var17 = module0138.$g1626$.getGlobalValue();
                            SubLObject var18 = (SubLObject)module0251.NIL;
                            try {
                                var18 = ReadWriteLocks.rw_lock_seize_read_lock(var17);
                                final SubLObject var3_153 = module0141.$g1665$.currentBinding(var10);
                                final SubLObject var7_152 = module0139.$g1648$.currentBinding(var10);
                                try {
                                    module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var10);
                                    module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var10)), var10);
                                    f16209(var9);
                                    if (module0251.NIL != module0249.f16059(var9, (SubLObject)module0251.UNPROVIDED)) {
                                        final SubLObject var3_154 = module0138.$g1619$.currentBinding(var10);
                                        final SubLObject var7_153 = module0141.$g1677$.currentBinding(var10);
                                        try {
                                            module0138.$g1619$.bind(module0244.f15780(module0137.f8955((SubLObject)module0251.UNPROVIDED)), var10);
                                            module0141.$g1677$.bind(module0141.f9210(), var10);
                                            f16219(var9, module0139.$g1638$.getDynamicValue(var10));
                                        }
                                        finally {
                                            module0141.$g1677$.rebind(var7_153, var10);
                                            module0138.$g1619$.rebind(var3_154, var10);
                                        }
                                    }
                                    else {
                                        module0249.f16063(var9, module0139.$g1638$.getDynamicValue(var10));
                                    }
                                }
                                finally {
                                    module0139.$g1648$.rebind(var7_152, var10);
                                    module0141.$g1665$.rebind(var3_153, var10);
                                }
                            }
                            finally {
                                if (module0251.NIL != var18) {
                                    ReadWriteLocks.rw_lock_release_read_lock(var17);
                                }
                            }
                        }
                        finally {
                            module0141.$g1674$.rebind(var16, var10);
                            module0141.$g1684$.rebind(var14_156, var10);
                            module0141.$g1683$.rebind(var11_155, var10);
                            module0141.$g1686$.rebind(var7_151, var10);
                            module0141.$g1685$.rebind(var3_152, var10);
                        }
                        if (var15 == module0251.$ic16$) {
                            module0139.f9012(module0139.$g1636$.getDynamicValue(var10));
                        }
                    }
                    finally {
                        module0139.$g1636$.rebind(var3_151, var10);
                    }
                    if (var15 == module0251.$ic16$) {
                        module0139.f9012(module0139.$g1635$.getDynamicValue(var10));
                    }
                }
                finally {
                    module0139.$g1635$.rebind(var3_150, var10);
                }
            }
            finally {
                module0138.$g1619$.rebind(var14, var10);
                module0141.$g1677$.rebind(var13, var10);
                module0141.$g1710$.rebind(var7_150, var10);
                module0139.$g1644$.rebind(var3_149, var10);
            }
            module0139.f9011(module0139.$g1635$.getDynamicValue(var10));
        }
        finally {
            module0139.$g1635$.rebind(var12, var10);
            module0139.$g1638$.rebind(var11, var10);
        }
        return (SubLObject)module0251.NIL;
    }
    
    public static SubLObject f16222(final SubLObject var8, final SubLObject var9, SubLObject var12, SubLObject var13) {
        if (var12 == module0251.UNPROVIDED) {
            var12 = (SubLObject)module0251.NIL;
        }
        if (var13 == module0251.UNPROVIDED) {
            var13 = (SubLObject)module0251.NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        assert module0251.NIL != module0137.f8885(var8) : var8;
        final SubLObject var15 = module0141.$g1670$.currentBinding(var14);
        final SubLObject var16 = module0141.$g1671$.currentBinding(var14);
        final SubLObject var17 = module0141.$g1672$.currentBinding(var14);
        final SubLObject var18 = module0141.$g1674$.currentBinding(var14);
        final SubLObject var19 = module0137.$g1605$.currentBinding(var14);
        final SubLObject var20 = module0139.$g1644$.currentBinding(var14);
        try {
            module0141.$g1670$.bind(module0244.f15769(var8), var14);
            module0141.$g1671$.bind(module0244.f15739(module0244.f15769(var8)), var14);
            module0141.$g1672$.bind(module0244.f15746(module0244.f15769(var8)), var14);
            module0141.$g1674$.bind((SubLObject)module0251.NIL, var14);
            module0137.$g1605$.bind(module0244.f15769(var8), var14);
            module0139.$g1644$.bind((SubLObject)module0251.T, var14);
            final SubLObject var21 = var12;
            final SubLObject var3_161 = module0147.$g2095$.currentBinding(var14);
            final SubLObject var7_162 = module0147.$g2094$.currentBinding(var14);
            final SubLObject var11_163 = module0147.$g2096$.currentBinding(var14);
            try {
                module0147.$g2095$.bind(module0147.f9545(var21), var14);
                module0147.$g2094$.bind(module0147.f9546(var21), var14);
                module0147.$g2096$.bind(module0147.f9549(var21), var14);
                final SubLObject var22 = var13;
                final SubLObject var3_162 = module0141.$g1714$.currentBinding(var14);
                final SubLObject var7_163 = module0141.$g1715$.currentBinding(var14);
                try {
                    module0141.$g1714$.bind((module0251.NIL != var22) ? var22 : module0141.f9283(), var14);
                    module0141.$g1715$.bind((SubLObject)((module0251.NIL != var22) ? module0251.$ic6$ : module0141.$g1715$.getDynamicValue(var14)), var14);
                    if (module0251.NIL != var22 && module0251.NIL != module0136.f8864() && module0251.NIL == module0141.f9279(var22)) {
                        final SubLObject var23 = module0136.$g1591$.getDynamicValue(var14);
                        if (var23.eql((SubLObject)module0251.$ic7$)) {
                            module0136.f8870((SubLObject)module0251.ONE_INTEGER, (SubLObject)module0251.$ic8$, var22, (SubLObject)module0251.$ic9$, (SubLObject)module0251.UNPROVIDED, (SubLObject)module0251.UNPROVIDED, (SubLObject)module0251.UNPROVIDED);
                        }
                        else if (var23.eql((SubLObject)module0251.$ic10$)) {
                            module0136.f8871((SubLObject)module0251.ONE_INTEGER, (SubLObject)module0251.$ic11$, (SubLObject)module0251.$ic8$, var22, (SubLObject)module0251.$ic9$, (SubLObject)module0251.UNPROVIDED, (SubLObject)module0251.UNPROVIDED, (SubLObject)module0251.UNPROVIDED);
                        }
                        else if (var23.eql((SubLObject)module0251.$ic12$)) {
                            Errors.warn((SubLObject)module0251.$ic8$, var22, (SubLObject)module0251.$ic9$);
                        }
                        else {
                            Errors.warn((SubLObject)module0251.$ic13$, module0136.$g1591$.getDynamicValue(var14));
                            Errors.cerror((SubLObject)module0251.$ic11$, (SubLObject)module0251.$ic8$, var22, (SubLObject)module0251.$ic9$);
                        }
                    }
                    final SubLObject var3_163 = module0141.$g1710$.currentBinding(var14);
                    final SubLObject var7_164 = module0141.$g1677$.currentBinding(var14);
                    final SubLObject var11_164 = module0138.$g1619$.currentBinding(var14);
                    try {
                        module0141.$g1710$.bind(module0251.$ic14$, var14);
                        module0141.$g1677$.bind(module0141.f9208(), var14);
                        module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0251.UNPROVIDED)), var14);
                        final SubLObject var24 = module0139.f9036();
                        final SubLObject var3_164 = module0139.$g1635$.currentBinding(var14);
                        try {
                            module0139.$g1635$.bind((var24 == module0251.$ic15$) ? module0139.$g1635$.getDynamicValue(var14) : module0139.f9038(var24), var14);
                            final SubLObject var3_165 = module0139.$g1636$.currentBinding(var14);
                            try {
                                module0139.$g1636$.bind((var24 == module0251.$ic15$) ? module0139.$g1636$.getDynamicValue(var14) : module0139.f9038(var24), var14);
                                final SubLObject var3_166 = module0141.$g1685$.currentBinding(var14);
                                final SubLObject var7_165 = module0141.$g1686$.currentBinding(var14);
                                final SubLObject var11_165 = module0141.$g1683$.currentBinding(var14);
                                final SubLObject var14_174 = module0141.$g1684$.currentBinding(var14);
                                final SubLObject var15_175 = module0141.$g1674$.currentBinding(var14);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0251.NIL, var14);
                                    module0141.$g1686$.bind((SubLObject)module0251.NIL, var14);
                                    module0141.$g1683$.bind((SubLObject)module0251.NIL, var14);
                                    module0141.$g1684$.bind((SubLObject)module0251.NIL, var14);
                                    module0141.$g1674$.bind((SubLObject)module0251.NIL, var14);
                                    final SubLObject var25 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var26 = (SubLObject)module0251.NIL;
                                    try {
                                        var26 = ReadWriteLocks.rw_lock_seize_read_lock(var25);
                                        f16223(var9);
                                    }
                                    finally {
                                        if (module0251.NIL != var26) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var25);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var15_175, var14);
                                    module0141.$g1684$.rebind(var14_174, var14);
                                    module0141.$g1683$.rebind(var11_165, var14);
                                    module0141.$g1686$.rebind(var7_165, var14);
                                    module0141.$g1685$.rebind(var3_166, var14);
                                }
                                if (var24 == module0251.$ic16$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var14));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var3_165, var14);
                            }
                            if (var24 == module0251.$ic16$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var14));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var3_164, var14);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var11_164, var14);
                        module0141.$g1677$.rebind(var7_164, var14);
                        module0141.$g1710$.rebind(var3_163, var14);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var7_163, var14);
                    module0141.$g1714$.rebind(var3_162, var14);
                }
            }
            finally {
                module0147.$g2096$.rebind(var11_163, var14);
                module0147.$g2094$.rebind(var7_162, var14);
                module0147.$g2095$.rebind(var3_161, var14);
            }
        }
        finally {
            module0139.$g1644$.rebind(var20, var14);
            module0137.$g1605$.rebind(var19, var14);
            module0141.$g1674$.rebind(var18, var14);
            module0141.$g1672$.rebind(var17, var14);
            module0141.$g1671$.rebind(var16, var14);
            module0141.$g1670$.rebind(var15, var14);
        }
        return (SubLObject)module0251.NIL;
    }
    
    public static SubLObject f16223(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        final SubLObject var11 = module0139.$g1637$.currentBinding(var10);
        final SubLObject var12 = module0139.$g1635$.currentBinding(var10);
        try {
            module0139.$g1637$.bind(module0139.$g1635$.getDynamicValue(var10), var10);
            module0139.$g1635$.bind(module0139.f9007(), var10);
            final SubLObject var3_176 = module0139.$g1636$.currentBinding(var10);
            final SubLObject var7_177 = module0141.$g1693$.currentBinding(var10);
            try {
                module0139.$g1636$.bind(module0139.$g1637$.getDynamicValue(var10), var10);
                module0141.$g1693$.bind((SubLObject)module0251.$ic0$, var10);
                module0250.f16182(var9);
            }
            finally {
                module0141.$g1693$.rebind(var7_177, var10);
                module0139.$g1636$.rebind(var3_176, var10);
            }
            module0139.f9011(module0139.$g1635$.getDynamicValue(var10));
        }
        finally {
            module0139.$g1635$.rebind(var12, var10);
            module0139.$g1637$.rebind(var11, var10);
        }
        return (SubLObject)module0251.NIL;
    }
    
    public static SubLObject f16224(final SubLObject var8, final SubLObject var9, SubLObject var12, SubLObject var13) {
        if (var12 == module0251.UNPROVIDED) {
            var12 = (SubLObject)module0251.NIL;
        }
        if (var13 == module0251.UNPROVIDED) {
            var13 = (SubLObject)module0251.NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        assert module0251.NIL != module0137.f8885(var8) : var8;
        final SubLObject var15 = module0141.$g1670$.currentBinding(var14);
        final SubLObject var16 = module0141.$g1671$.currentBinding(var14);
        final SubLObject var17 = module0141.$g1672$.currentBinding(var14);
        final SubLObject var18 = module0141.$g1674$.currentBinding(var14);
        final SubLObject var19 = module0137.$g1605$.currentBinding(var14);
        try {
            module0141.$g1670$.bind(module0244.f15769(var8), var14);
            module0141.$g1671$.bind(module0244.f15739(module0244.f15769(var8)), var14);
            module0141.$g1672$.bind(module0244.f15746(module0244.f15769(var8)), var14);
            module0141.$g1674$.bind((SubLObject)module0251.NIL, var14);
            module0137.$g1605$.bind(module0244.f15769(var8), var14);
            final SubLObject var20 = var12;
            final SubLObject var3_178 = module0147.$g2095$.currentBinding(var14);
            final SubLObject var7_179 = module0147.$g2094$.currentBinding(var14);
            final SubLObject var11_180 = module0147.$g2096$.currentBinding(var14);
            try {
                module0147.$g2095$.bind(module0147.f9545(var20), var14);
                module0147.$g2094$.bind(module0147.f9546(var20), var14);
                module0147.$g2096$.bind(module0147.f9549(var20), var14);
                final SubLObject var21 = var13;
                final SubLObject var3_179 = module0141.$g1714$.currentBinding(var14);
                final SubLObject var7_180 = module0141.$g1715$.currentBinding(var14);
                try {
                    module0141.$g1714$.bind((module0251.NIL != var21) ? var21 : module0141.f9283(), var14);
                    module0141.$g1715$.bind((SubLObject)((module0251.NIL != var21) ? module0251.$ic6$ : module0141.$g1715$.getDynamicValue(var14)), var14);
                    if (module0251.NIL != var21 && module0251.NIL != module0136.f8864() && module0251.NIL == module0141.f9279(var21)) {
                        final SubLObject var22 = module0136.$g1591$.getDynamicValue(var14);
                        if (var22.eql((SubLObject)module0251.$ic7$)) {
                            module0136.f8870((SubLObject)module0251.ONE_INTEGER, (SubLObject)module0251.$ic8$, var21, (SubLObject)module0251.$ic9$, (SubLObject)module0251.UNPROVIDED, (SubLObject)module0251.UNPROVIDED, (SubLObject)module0251.UNPROVIDED);
                        }
                        else if (var22.eql((SubLObject)module0251.$ic10$)) {
                            module0136.f8871((SubLObject)module0251.ONE_INTEGER, (SubLObject)module0251.$ic11$, (SubLObject)module0251.$ic8$, var21, (SubLObject)module0251.$ic9$, (SubLObject)module0251.UNPROVIDED, (SubLObject)module0251.UNPROVIDED, (SubLObject)module0251.UNPROVIDED);
                        }
                        else if (var22.eql((SubLObject)module0251.$ic12$)) {
                            Errors.warn((SubLObject)module0251.$ic8$, var21, (SubLObject)module0251.$ic9$);
                        }
                        else {
                            Errors.warn((SubLObject)module0251.$ic13$, module0136.$g1591$.getDynamicValue(var14));
                            Errors.cerror((SubLObject)module0251.$ic11$, (SubLObject)module0251.$ic8$, var21, (SubLObject)module0251.$ic9$);
                        }
                    }
                    final SubLObject var3_180 = module0141.$g1710$.currentBinding(var14);
                    final SubLObject var7_181 = module0141.$g1677$.currentBinding(var14);
                    final SubLObject var11_181 = module0138.$g1619$.currentBinding(var14);
                    try {
                        module0141.$g1710$.bind(module0251.$ic14$, var14);
                        module0141.$g1677$.bind(module0141.f9208(), var14);
                        module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0251.UNPROVIDED)), var14);
                        final SubLObject var23 = module0139.f9036();
                        final SubLObject var3_181 = module0139.$g1635$.currentBinding(var14);
                        try {
                            module0139.$g1635$.bind((var23 == module0251.$ic15$) ? module0139.$g1635$.getDynamicValue(var14) : module0139.f9038(var23), var14);
                            final SubLObject var3_182 = module0139.$g1636$.currentBinding(var14);
                            try {
                                module0139.$g1636$.bind((var23 == module0251.$ic15$) ? module0139.$g1636$.getDynamicValue(var14) : module0139.f9038(var23), var14);
                                final SubLObject var3_183 = module0141.$g1685$.currentBinding(var14);
                                final SubLObject var7_182 = module0141.$g1686$.currentBinding(var14);
                                final SubLObject var11_182 = module0141.$g1683$.currentBinding(var14);
                                final SubLObject var14_191 = module0141.$g1684$.currentBinding(var14);
                                final SubLObject var15_192 = module0141.$g1674$.currentBinding(var14);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0251.NIL, var14);
                                    module0141.$g1686$.bind((SubLObject)module0251.NIL, var14);
                                    module0141.$g1683$.bind((SubLObject)module0251.NIL, var14);
                                    module0141.$g1684$.bind((SubLObject)module0251.NIL, var14);
                                    module0141.$g1674$.bind((SubLObject)module0251.NIL, var14);
                                    final SubLObject var24 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var25 = (SubLObject)module0251.NIL;
                                    try {
                                        var25 = ReadWriteLocks.rw_lock_seize_read_lock(var24);
                                        f16225(var9);
                                    }
                                    finally {
                                        if (module0251.NIL != var25) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var24);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var15_192, var14);
                                    module0141.$g1684$.rebind(var14_191, var14);
                                    module0141.$g1683$.rebind(var11_182, var14);
                                    module0141.$g1686$.rebind(var7_182, var14);
                                    module0141.$g1685$.rebind(var3_183, var14);
                                }
                                if (var23 == module0251.$ic16$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var14));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var3_182, var14);
                            }
                            if (var23 == module0251.$ic16$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var14));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var3_181, var14);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var11_181, var14);
                        module0141.$g1677$.rebind(var7_181, var14);
                        module0141.$g1710$.rebind(var3_180, var14);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var7_180, var14);
                    module0141.$g1714$.rebind(var3_179, var14);
                }
            }
            finally {
                module0147.$g2096$.rebind(var11_180, var14);
                module0147.$g2094$.rebind(var7_179, var14);
                module0147.$g2095$.rebind(var3_178, var14);
            }
        }
        finally {
            module0137.$g1605$.rebind(var19, var14);
            module0141.$g1674$.rebind(var18, var14);
            module0141.$g1672$.rebind(var17, var14);
            module0141.$g1671$.rebind(var16, var14);
            module0141.$g1670$.rebind(var15, var14);
        }
        return (SubLObject)module0251.NIL;
    }
    
    public static SubLObject f16225(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        final SubLObject var11 = module0141.$g1669$.currentBinding(var10);
        final SubLObject var12 = module0139.$g1637$.currentBinding(var10);
        final SubLObject var13 = module0139.$g1635$.currentBinding(var10);
        try {
            module0141.$g1669$.bind((SubLObject)module0251.T, var10);
            module0139.$g1637$.bind(module0139.$g1635$.getDynamicValue(var10), var10);
            module0139.$g1635$.bind(module0139.f9007(), var10);
            final SubLObject var3_193 = module0139.$g1636$.currentBinding(var10);
            try {
                module0139.$g1636$.bind(module0139.f9007(), var10);
                final SubLObject var3_194 = module0139.$g1636$.currentBinding(var10);
                final SubLObject var7_195 = module0141.$g1693$.currentBinding(var10);
                try {
                    module0139.$g1636$.bind(module0139.$g1637$.getDynamicValue(var10), var10);
                    module0141.$g1693$.bind((SubLObject)module0251.$ic0$, var10);
                    module0250.f16182(var9);
                }
                finally {
                    module0141.$g1693$.rebind(var7_195, var10);
                    module0139.$g1636$.rebind(var3_194, var10);
                }
                module0139.f9011(module0139.$g1636$.getDynamicValue(var10));
            }
            finally {
                module0139.$g1636$.rebind(var3_193, var10);
            }
            module0139.f9011(module0139.$g1635$.getDynamicValue(var10));
        }
        finally {
            module0139.$g1635$.rebind(var13, var10);
            module0139.$g1637$.rebind(var12, var10);
            module0141.$g1669$.rebind(var11, var10);
        }
        return (SubLObject)module0251.NIL;
    }
    
    public static SubLObject f16226() {
        if (module0251.NIL != module0244.f15762(module0141.f9188())) {
            return (SubLObject)module0251.$ic26$;
        }
        if (module0251.NIL != module0244.f15770(module0141.f9188())) {
            return (SubLObject)module0251.$ic27$;
        }
        module0136.f8870((SubLObject)module0251.ONE_INTEGER, (SubLObject)module0251.$ic28$, module0141.f9188(), (SubLObject)module0251.UNPROVIDED, (SubLObject)module0251.UNPROVIDED, (SubLObject)module0251.UNPROVIDED, (SubLObject)module0251.UNPROVIDED);
        return (SubLObject)module0251.NIL;
    }
    
    public static SubLObject f16227(final SubLObject var8, final SubLObject var196, final SubLObject var197, SubLObject var12, SubLObject var13) {
        if (var12 == module0251.UNPROVIDED) {
            var12 = (SubLObject)module0251.NIL;
        }
        if (var13 == module0251.UNPROVIDED) {
            var13 = (SubLObject)module0251.NIL;
        }
        final SubLThread var198 = SubLProcess.currentSubLThread();
        assert module0251.NIL != module0137.f8885(var8) : var8;
        final SubLObject var199 = module0139.$g1646$.currentBinding(var198);
        final SubLObject var200 = module0141.$g1670$.currentBinding(var198);
        final SubLObject var201 = module0141.$g1671$.currentBinding(var198);
        final SubLObject var202 = module0141.$g1672$.currentBinding(var198);
        final SubLObject var203 = module0141.$g1674$.currentBinding(var198);
        final SubLObject var204 = module0137.$g1605$.currentBinding(var198);
        try {
            module0139.$g1646$.bind(module0139.$g1635$.getDynamicValue(var198), var198);
            module0141.$g1670$.bind(var8, var198);
            module0141.$g1671$.bind(module0244.f15739(var8), var198);
            module0141.$g1672$.bind(module0244.f15746(var8), var198);
            module0141.$g1674$.bind((SubLObject)module0251.NIL, var198);
            module0137.$g1605$.bind(var8, var198);
            final SubLObject var205 = var12;
            final SubLObject var3_198 = module0147.$g2095$.currentBinding(var198);
            final SubLObject var7_199 = module0147.$g2094$.currentBinding(var198);
            final SubLObject var11_200 = module0147.$g2096$.currentBinding(var198);
            try {
                module0147.$g2095$.bind(module0147.f9545(var205), var198);
                module0147.$g2094$.bind(module0147.f9546(var205), var198);
                module0147.$g2096$.bind(module0147.f9549(var205), var198);
                final SubLObject var206 = var13;
                final SubLObject var3_199 = module0141.$g1714$.currentBinding(var198);
                final SubLObject var7_200 = module0141.$g1715$.currentBinding(var198);
                try {
                    module0141.$g1714$.bind((module0251.NIL != var206) ? var206 : module0141.f9283(), var198);
                    module0141.$g1715$.bind((SubLObject)((module0251.NIL != var206) ? module0251.$ic6$ : module0141.$g1715$.getDynamicValue(var198)), var198);
                    if (module0251.NIL != var206 && module0251.NIL != module0136.f8864() && module0251.NIL == module0141.f9279(var206)) {
                        final SubLObject var207 = module0136.$g1591$.getDynamicValue(var198);
                        if (var207.eql((SubLObject)module0251.$ic7$)) {
                            module0136.f8870((SubLObject)module0251.ONE_INTEGER, (SubLObject)module0251.$ic8$, var206, (SubLObject)module0251.$ic9$, (SubLObject)module0251.UNPROVIDED, (SubLObject)module0251.UNPROVIDED, (SubLObject)module0251.UNPROVIDED);
                        }
                        else if (var207.eql((SubLObject)module0251.$ic10$)) {
                            module0136.f8871((SubLObject)module0251.ONE_INTEGER, (SubLObject)module0251.$ic11$, (SubLObject)module0251.$ic8$, var206, (SubLObject)module0251.$ic9$, (SubLObject)module0251.UNPROVIDED, (SubLObject)module0251.UNPROVIDED, (SubLObject)module0251.UNPROVIDED);
                        }
                        else if (var207.eql((SubLObject)module0251.$ic12$)) {
                            Errors.warn((SubLObject)module0251.$ic8$, var206, (SubLObject)module0251.$ic9$);
                        }
                        else {
                            Errors.warn((SubLObject)module0251.$ic13$, module0136.$g1591$.getDynamicValue(var198));
                            Errors.cerror((SubLObject)module0251.$ic11$, (SubLObject)module0251.$ic8$, var206, (SubLObject)module0251.$ic9$);
                        }
                    }
                    final SubLObject var3_200 = module0141.$g1710$.currentBinding(var198);
                    final SubLObject var7_201 = module0141.$g1677$.currentBinding(var198);
                    final SubLObject var11_201 = module0138.$g1619$.currentBinding(var198);
                    try {
                        module0141.$g1710$.bind(module0251.$ic14$, var198);
                        module0141.$g1677$.bind(module0141.f9208(), var198);
                        module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0251.UNPROVIDED)), var198);
                        final SubLObject var208 = module0139.f9036();
                        final SubLObject var3_201 = module0139.$g1635$.currentBinding(var198);
                        try {
                            module0139.$g1635$.bind((var208 == module0251.$ic15$) ? module0139.$g1635$.getDynamicValue(var198) : module0139.f9038(var208), var198);
                            final SubLObject var3_202 = module0139.$g1636$.currentBinding(var198);
                            try {
                                module0139.$g1636$.bind((var208 == module0251.$ic15$) ? module0139.$g1636$.getDynamicValue(var198) : module0139.f9038(var208), var198);
                                final SubLObject var3_203 = module0141.$g1685$.currentBinding(var198);
                                final SubLObject var7_202 = module0141.$g1686$.currentBinding(var198);
                                final SubLObject var11_202 = module0141.$g1683$.currentBinding(var198);
                                final SubLObject var14_211 = module0141.$g1684$.currentBinding(var198);
                                final SubLObject var15_212 = module0141.$g1674$.currentBinding(var198);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0251.NIL, var198);
                                    module0141.$g1686$.bind((SubLObject)module0251.NIL, var198);
                                    module0141.$g1683$.bind((SubLObject)module0251.NIL, var198);
                                    module0141.$g1684$.bind((SubLObject)module0251.NIL, var198);
                                    module0141.$g1674$.bind((SubLObject)module0251.NIL, var198);
                                    final SubLObject var209 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var210 = (SubLObject)module0251.NIL;
                                    try {
                                        var210 = ReadWriteLocks.rw_lock_seize_read_lock(var209);
                                        final SubLObject var3_204 = module0141.$g1665$.currentBinding(var198);
                                        final SubLObject var7_203 = module0139.$g1648$.currentBinding(var198);
                                        try {
                                            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var198);
                                            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var198)), var198);
                                            f16203(var196);
                                            final SubLObject var3_205 = module0138.$g1619$.currentBinding(var198);
                                            final SubLObject var7_204 = module0141.$g1693$.currentBinding(var198);
                                            try {
                                                module0138.$g1619$.bind(module0244.f15780(module0137.f8955((SubLObject)module0251.UNPROVIDED)), var198);
                                                module0141.$g1693$.bind(f16226(), var198);
                                                f16228(var197);
                                            }
                                            finally {
                                                module0141.$g1693$.rebind(var7_204, var198);
                                                module0138.$g1619$.rebind(var3_205, var198);
                                            }
                                        }
                                        finally {
                                            module0139.$g1648$.rebind(var7_203, var198);
                                            module0141.$g1665$.rebind(var3_204, var198);
                                        }
                                    }
                                    finally {
                                        if (module0251.NIL != var210) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var209);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var15_212, var198);
                                    module0141.$g1684$.rebind(var14_211, var198);
                                    module0141.$g1683$.rebind(var11_202, var198);
                                    module0141.$g1686$.rebind(var7_202, var198);
                                    module0141.$g1685$.rebind(var3_203, var198);
                                }
                                if (var208 == module0251.$ic16$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var198));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var3_202, var198);
                            }
                            if (var208 == module0251.$ic16$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var198));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var3_201, var198);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var11_201, var198);
                        module0141.$g1677$.rebind(var7_201, var198);
                        module0141.$g1710$.rebind(var3_200, var198);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var7_200, var198);
                    module0141.$g1714$.rebind(var3_199, var198);
                }
            }
            finally {
                module0147.$g2096$.rebind(var11_200, var198);
                module0147.$g2094$.rebind(var7_199, var198);
                module0147.$g2095$.rebind(var3_198, var198);
            }
        }
        finally {
            module0137.$g1605$.rebind(var204, var198);
            module0141.$g1674$.rebind(var203, var198);
            module0141.$g1672$.rebind(var202, var198);
            module0141.$g1671$.rebind(var201, var198);
            module0141.$g1670$.rebind(var200, var198);
            module0139.$g1646$.rebind(var199, var198);
        }
        return (SubLObject)module0251.NIL;
    }
    
    public static SubLObject f16228(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        SubLObject var11 = module0139.$g1635$.currentBinding(var10);
        final SubLObject var12 = module0141.$g1670$.currentBinding(var10);
        final SubLObject var13 = module0141.$g1671$.currentBinding(var10);
        final SubLObject var14 = module0141.$g1672$.currentBinding(var10);
        final SubLObject var15 = module0141.$g1674$.currentBinding(var10);
        final SubLObject var16 = module0137.$g1605$.currentBinding(var10);
        try {
            module0139.$g1635$.bind(module0139.$g1646$.getDynamicValue(var10), var10);
            module0141.$g1670$.bind(module0244.f15774(module0137.f8955((SubLObject)module0251.UNPROVIDED)), var10);
            module0141.$g1671$.bind(module0244.f15739(module0244.f15774(module0137.f8955((SubLObject)module0251.UNPROVIDED))), var10);
            module0141.$g1672$.bind(module0244.f15746(module0244.f15774(module0137.f8955((SubLObject)module0251.UNPROVIDED))), var10);
            module0141.$g1674$.bind((SubLObject)module0251.NIL, var10);
            module0137.$g1605$.bind(module0244.f15774(module0137.f8955((SubLObject)module0251.UNPROVIDED)), var10);
            f16220(var9);
        }
        finally {
            module0137.$g1605$.rebind(var16, var10);
            module0141.$g1674$.rebind(var15, var10);
            module0141.$g1672$.rebind(var14, var10);
            module0141.$g1671$.rebind(var13, var10);
            module0141.$g1670$.rebind(var12, var10);
            module0139.$g1635$.rebind(var11, var10);
        }
        var11 = module0141.$g1669$.currentBinding(var10);
        try {
            module0141.$g1669$.bind((SubLObject)module0251.T, var10);
            if (module0251.NIL != module0244.f15752(module0141.f9188())) {
                SubLObject var17 = module0249.f16019(var9, (SubLObject)module0251.UNPROVIDED);
                SubLObject var18 = (SubLObject)module0251.NIL;
                var18 = var17.first();
                while (module0251.NIL != var17) {
                    final SubLObject var3_217 = module0141.$g1673$.currentBinding(var10);
                    final SubLObject var19 = module0141.$g1674$.currentBinding(var10);
                    try {
                        module0141.$g1673$.bind(module0244.f15746(module0137.f8955(var18)), var10);
                        module0141.$g1674$.bind(Equality.eql(var18, module0251.$ic1$), var10);
                        module0250.f16154((module0251.NIL != module0244.f15770(module0141.f9188())) ? module0244.f15771(module0141.f9188()) : module0141.f9188(), module0138.f8979(), module0141.f9293(), module0139.$g1635$.getDynamicValue(var10), (SubLObject)module0251.$ic29$, var9, (SubLObject)module0251.T);
                    }
                    finally {
                        module0141.$g1674$.rebind(var19, var10);
                        module0141.$g1673$.rebind(var3_217, var10);
                    }
                    var17 = var17.rest();
                    var18 = var17.first();
                }
            }
            else {
                module0250.f16154((module0251.NIL != module0244.f15770(module0141.f9188())) ? module0244.f15771(module0141.f9188()) : module0141.f9188(), module0138.f8979(), module0141.f9293(), module0139.$g1635$.getDynamicValue(var10), (SubLObject)module0251.$ic29$, var9, (SubLObject)module0251.T);
            }
        }
        finally {
            module0141.$g1669$.rebind(var11, var10);
        }
        return (SubLObject)module0251.NIL;
    }
    
    public static SubLObject f16229(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        final SubLObject var11 = module0141.$g1669$.currentBinding(var10);
        try {
            module0141.$g1669$.bind((SubLObject)module0251.NIL, var10);
            if (module0251.NIL == module0249.f16059(var9, module0139.$g1646$.getDynamicValue(var10))) {
                module0250.f16154(module0137.f8955((SubLObject)module0251.UNPROVIDED), module0138.f8979(), module0141.f9293(), module0139.$g1636$.getDynamicValue(var10), (SubLObject)((module0251.NIL != module0244.f15770(module0141.f9188())) ? module0251.$ic30$ : module0251.$ic4$), var9, (SubLObject)module0251.NIL);
            }
        }
        finally {
            module0141.$g1669$.rebind(var11, var10);
        }
        return (SubLObject)module0251.NIL;
    }
    
    public static SubLObject f16230(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        module0249.f16055(var9, module0139.$g1646$.getDynamicValue(var10));
        module0250.f16157(module0141.f9188(), module0138.f8979(), module0141.f9293(), module0139.$g1636$.getDynamicValue(var10), (SubLObject)module0251.$ic4$, var9, (SubLObject)module0251.UNPROVIDED, (SubLObject)module0251.UNPROVIDED);
        return (SubLObject)module0251.NIL;
    }
    
    public static SubLObject f16231(final SubLObject var8, final SubLObject var9, final SubLObject var218, SubLObject var12, SubLObject var13) {
        if (var12 == module0251.UNPROVIDED) {
            var12 = (SubLObject)module0251.NIL;
        }
        if (var13 == module0251.UNPROVIDED) {
            var13 = (SubLObject)module0251.NIL;
        }
        assert module0251.NIL != module0137.f8885(var8) : var8;
        if (module0251.NIL != module0138.f8972(var218)) {
            f16232(var8, var9, var12, var13);
        }
        else if (module0251.NIL != module0138.f8975(var218)) {
            f16233(var8, var9, var12, var13);
        }
        else {
            module0136.f8870((SubLObject)module0251.ONE_INTEGER, (SubLObject)module0251.$ic31$, var218, (SubLObject)module0251.UNPROVIDED, (SubLObject)module0251.UNPROVIDED, (SubLObject)module0251.UNPROVIDED, (SubLObject)module0251.UNPROVIDED);
        }
        return (SubLObject)module0251.NIL;
    }
    
    public static SubLObject f16232(final SubLObject var8, final SubLObject var9, SubLObject var12, SubLObject var13) {
        if (var12 == module0251.UNPROVIDED) {
            var12 = (SubLObject)module0251.NIL;
        }
        if (var13 == module0251.UNPROVIDED) {
            var13 = (SubLObject)module0251.NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        assert module0251.NIL != module0137.f8885(var8) : var8;
        final SubLObject var15 = module0139.$g1635$.currentBinding(var14);
        try {
            module0139.$g1635$.bind(module0139.$g1659$.getDynamicValue(var14), var14);
            f16202(var8, var9, var12, var13);
        }
        finally {
            module0139.$g1635$.rebind(var15, var14);
        }
        return (SubLObject)module0251.NIL;
    }
    
    public static SubLObject f16233(final SubLObject var8, final SubLObject var9, SubLObject var12, SubLObject var13) {
        if (var12 == module0251.UNPROVIDED) {
            var12 = (SubLObject)module0251.NIL;
        }
        if (var13 == module0251.UNPROVIDED) {
            var13 = (SubLObject)module0251.NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        assert module0251.NIL != module0137.f8885(var8) : var8;
        final SubLObject var15 = module0139.$g1635$.currentBinding(var14);
        try {
            module0139.$g1635$.bind(module0139.$g1659$.getDynamicValue(var14), var14);
            f16204(var8, var9, var12, var13);
        }
        finally {
            module0139.$g1635$.rebind(var15, var14);
        }
        return (SubLObject)module0251.NIL;
    }
    
    public static SubLObject f16234(final SubLObject var8, final SubLObject var9, SubLObject var12, SubLObject var13) {
        if (var12 == module0251.UNPROVIDED) {
            var12 = (SubLObject)module0251.NIL;
        }
        if (var13 == module0251.UNPROVIDED) {
            var13 = (SubLObject)module0251.NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        assert module0251.NIL != module0137.f8885(var8) : var8;
        final SubLObject var15 = module0139.$g1635$.currentBinding(var14);
        try {
            module0139.$g1635$.bind(module0139.$g1659$.getDynamicValue(var14), var14);
            f16222(var8, var9, var12, var13);
        }
        finally {
            module0139.$g1635$.rebind(var15, var14);
        }
        return (SubLObject)module0251.NIL;
    }
    
    public static SubLObject f16235(final SubLObject var8, final SubLObject var9, SubLObject var12, SubLObject var13) {
        if (var12 == module0251.UNPROVIDED) {
            var12 = (SubLObject)module0251.NIL;
        }
        if (var13 == module0251.UNPROVIDED) {
            var13 = (SubLObject)module0251.NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        assert module0251.NIL != module0137.f8885(var8) : var8;
        final SubLObject var15 = module0139.$g1635$.currentBinding(var14);
        try {
            module0139.$g1635$.bind(module0139.$g1659$.getDynamicValue(var14), var14);
            f16224(var8, var9, var12, var13);
        }
        finally {
            module0139.$g1635$.rebind(var15, var14);
        }
        return (SubLObject)module0251.NIL;
    }
    
    public static SubLObject f16236(final SubLObject var8, final SubLObject var9, SubLObject var12, SubLObject var13) {
        if (var12 == module0251.UNPROVIDED) {
            var12 = (SubLObject)module0251.NIL;
        }
        if (var13 == module0251.UNPROVIDED) {
            var13 = (SubLObject)module0251.NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        assert module0251.NIL != module0137.f8885(var8) : var8;
        final SubLObject var15 = module0139.$g1635$.currentBinding(var14);
        try {
            module0139.$g1635$.bind(module0139.$g1659$.getDynamicValue(var14), var14);
            f16210(var8, var9, var12, var13);
        }
        finally {
            module0139.$g1635$.rebind(var15, var14);
        }
        return (SubLObject)module0251.NIL;
    }
    
    public static SubLObject f16237(final SubLObject var9, SubLObject var219) {
        if (var219 == module0251.UNPROVIDED) {
            var219 = (SubLObject)module0251.NIL;
        }
        final SubLThread var220 = SubLProcess.currentSubLThread();
        final SubLObject var221 = module0141.f9188();
        if (module0251.NIL != module0136.f8864() && module0251.NIL == module0137.f8933(var221)) {
            final SubLObject var222 = module0136.$g1591$.getDynamicValue(var220);
            if (var222.eql((SubLObject)module0251.$ic7$)) {
                module0136.f8870((SubLObject)module0251.ONE_INTEGER, (SubLObject)module0251.$ic8$, var221, (SubLObject)module0251.$ic32$, (SubLObject)module0251.UNPROVIDED, (SubLObject)module0251.UNPROVIDED, (SubLObject)module0251.UNPROVIDED);
            }
            else if (var222.eql((SubLObject)module0251.$ic10$)) {
                module0136.f8871((SubLObject)module0251.ONE_INTEGER, (SubLObject)module0251.$ic11$, (SubLObject)module0251.$ic8$, var221, (SubLObject)module0251.$ic32$, (SubLObject)module0251.UNPROVIDED, (SubLObject)module0251.UNPROVIDED, (SubLObject)module0251.UNPROVIDED);
            }
            else if (var222.eql((SubLObject)module0251.$ic12$)) {
                Errors.warn((SubLObject)module0251.$ic8$, var221, (SubLObject)module0251.$ic32$);
            }
            else {
                Errors.warn((SubLObject)module0251.$ic13$, module0136.$g1591$.getDynamicValue(var220));
                Errors.cerror((SubLObject)module0251.$ic11$, (SubLObject)module0251.$ic8$, var221, (SubLObject)module0251.$ic32$);
            }
        }
        f16236(var221, var9, (SubLObject)module0251.UNPROVIDED, (SubLObject)module0251.UNPROVIDED);
        return (SubLObject)module0251.NIL;
    }
    
    public static SubLObject f16238(final SubLObject var9, SubLObject var221) {
        if (var221 == module0251.UNPROVIDED) {
            var221 = module0139.$g1659$.getDynamicValue();
        }
        final SubLThread var222 = SubLProcess.currentSubLThread();
        final SubLObject var223 = module0139.$g1659$.currentBinding(var222);
        final SubLObject var224 = module0139.$g1635$.currentBinding(var222);
        try {
            module0139.$g1659$.bind(var221, var222);
            module0139.$g1635$.bind(module0139.$g1659$.getDynamicValue(var222), var222);
            module0249.f16036(var9, (SubLObject)module0251.UNPROVIDED);
        }
        finally {
            module0139.$g1635$.rebind(var224, var222);
            module0139.$g1659$.rebind(var223, var222);
        }
        return (SubLObject)module0251.NIL;
    }
    
    public static SubLObject f16239(final SubLObject var9, SubLObject var221) {
        if (var221 == module0251.UNPROVIDED) {
            var221 = module0139.$g1659$.getDynamicValue();
        }
        final SubLThread var222 = SubLProcess.currentSubLThread();
        SubLObject var223 = (SubLObject)module0251.NIL;
        final SubLObject var224 = module0139.$g1659$.currentBinding(var222);
        final SubLObject var225 = module0139.$g1635$.currentBinding(var222);
        try {
            module0139.$g1659$.bind(var221, var222);
            module0139.$g1635$.bind(module0139.$g1659$.getDynamicValue(var222), var222);
            var223 = module0249.f16020(var9, (SubLObject)module0251.UNPROVIDED);
        }
        finally {
            module0139.$g1635$.rebind(var225, var222);
            module0139.$g1659$.rebind(var224, var222);
        }
        return var223;
    }
    
    public static SubLObject f16240(final SubLObject var9, SubLObject var221) {
        if (var221 == module0251.UNPROVIDED) {
            var221 = module0139.$g1659$.getDynamicValue();
        }
        final SubLThread var222 = SubLProcess.currentSubLThread();
        SubLObject var223 = (SubLObject)module0251.NIL;
        final SubLObject var224 = module0139.$g1659$.currentBinding(var222);
        final SubLObject var225 = module0139.$g1635$.currentBinding(var222);
        try {
            module0139.$g1659$.bind(var221, var222);
            module0139.$g1635$.bind(module0139.$g1659$.getDynamicValue(var222), var222);
            var223 = module0249.f16020(var9, (SubLObject)module0251.UNPROVIDED);
        }
        finally {
            module0139.$g1635$.rebind(var225, var222);
            module0139.$g1659$.rebind(var224, var222);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0251.NIL == var223);
    }
    
    public static SubLObject f16241(final SubLObject var8, final SubLObject var9, SubLObject var12, SubLObject var13) {
        if (var12 == module0251.UNPROVIDED) {
            var12 = (SubLObject)module0251.NIL;
        }
        if (var13 == module0251.UNPROVIDED) {
            var13 = (SubLObject)module0251.NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        assert module0251.NIL != module0137.f8885(var8) : var8;
        final SubLObject var15 = module0139.$g1635$.currentBinding(var14);
        try {
            module0139.$g1635$.bind(module0139.$g1659$.getDynamicValue(var14), var14);
            f16208(var8, var9, var12, var13);
        }
        finally {
            module0139.$g1635$.rebind(var15, var14);
        }
        return (SubLObject)module0251.NIL;
    }
    
    public static SubLObject f16242() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0251", "f16198", "S#18937", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0251", "f16200", "S#18938", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0251", "f16199", "S#15384", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0251", "f16201", "S#18846", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0251", "f16202", "S#18939", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0251", "f16204", "S#18940", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0251", "f16203", "S#18936", 1, 0, false);
        new $f16203$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0251", "f16205", "S#18941", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0251", "f16206", "S#18942", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0251", "f16207", "S#18943", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0251", "f16208", "S#18944", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0251", "f16209", "S#18945", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0251", "f16210", "S#18946", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0251", "f16212", "S#18947", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0251", "f16211", "S#18948", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0251", "f16213", "S#18949", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0251", "f16214", "S#18950", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0251", "f16215", "S#18951", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0251", "f16216", "S#18952", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0251", "f16217", "S#18953", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0251", "f16218", "S#18954", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0251", "f16219", "S#18955", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0251", "f16220", "S#18956", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0251", "f16221", "S#18957", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0251", "f16222", "S#18958", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0251", "f16223", "S#18959", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0251", "f16224", "S#18960", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0251", "f16225", "S#18961", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0251", "f16226", "S#18962", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0251", "f16227", "S#18963", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0251", "f16228", "S#18964", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0251", "f16229", "S#18965", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0251", "f16230", "S#18966", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0251", "f16231", "S#18967", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0251", "f16232", "S#18968", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0251", "f16233", "S#18969", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0251", "f16234", "S#18970", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0251", "f16235", "S#18971", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0251", "f16236", "S#18972", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0251", "f16237", "S#18973", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0251", "f16238", "S#18974", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0251", "f16239", "S#18975", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0251", "f16240", "S#18976", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0251", "f16241", "S#18977", 2, 2, false);
        return (SubLObject)module0251.NIL;
    }
    
    public static SubLObject f16243() {
        return (SubLObject)module0251.NIL;
    }
    
    public static SubLObject f16244() {
        return (SubLObject)module0251.NIL;
    }
    
    public void declareFunctions() {
        f16242();
    }
    
    public void initializeVariables() {
        f16243();
    }
    
    public void runTopLevelForms() {
        f16244();
    }
    
    static {
        me = (SubLFile)new module0251();
        $ic0$ = SubLObjectFactory.makeSymbol("S#18847", "CYC");
        $ic1$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlInverse"));
        $ic2$ = SubLObjectFactory.makeSymbol("S#18882", "CYC");
        $ic3$ = SubLObjectFactory.makeSymbol("S#15382", "CYC");
        $ic4$ = SubLObjectFactory.makeSymbol("S#18886", "CYC");
        $ic5$ = SubLObjectFactory.makeSymbol("S#11099", "CYC");
        $ic6$ = SubLObjectFactory.makeSymbol("S#11450", "CYC");
        $ic7$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic8$ = SubLObjectFactory.makeString("~A is not a ~A");
        $ic9$ = SubLObjectFactory.makeSymbol("S#11592", "CYC");
        $ic10$ = SubLObjectFactory.makeKeyword("CERROR");
        $ic11$ = SubLObjectFactory.makeString("continue anyway");
        $ic12$ = SubLObjectFactory.makeKeyword("WARN");
        $ic13$ = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic14$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("True-JustificationTruth"));
        $ic15$ = SubLObjectFactory.makeKeyword("OLD");
        $ic16$ = SubLObjectFactory.makeKeyword("RESOURCE");
        $ic17$ = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic18$ = SubLObjectFactory.makeString("marking-space = ~S~%");
        $ic19$ = SubLObjectFactory.makeSymbol("S#18936", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#18949", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#18873", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("S#18870", "CYC");
        $ic23$ = SubLObjectFactory.makeSymbol("S#18845", "CYC");
        $ic24$ = SubLObjectFactory.makeSymbol("S#18817", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("S#18818", "CYC");
        $ic26$ = SubLObjectFactory.makeSymbol("S#18815", "CYC");
        $ic27$ = SubLObjectFactory.makeSymbol("S#18816", "CYC");
        $ic28$ = SubLObjectFactory.makeString("invalid module type ~a");
        $ic29$ = SubLObjectFactory.makeSymbol("S#18965", "CYC");
        $ic30$ = SubLObjectFactory.makeSymbol("S#18966", "CYC");
        $ic31$ = SubLObjectFactory.makeString("Error in direction ~a");
        $ic32$ = SubLObjectFactory.makeSymbol("S#11157", "CYC");
    }
    
    public static final class $f16203$UnaryFunction extends UnaryFunction
    {
        public $f16203$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#18936"));
        }
        
        public SubLObject processItem(final SubLObject var57) {
            return module0251.f16203(var57);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0251.class
	Total time: 1152 ms
	
	Decompiled with Procyon 0.5.32.
*/