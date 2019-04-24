package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0440 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0440";
    public static final String myFingerPrint = "8a8fffc2b2b58d90094f83594640163dceed1a28a8ec33d0340f5958f0417bbb";
    private static SubLSymbol $g3543$;
    private static SubLSymbol $g3544$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLObject $ic2$;
    private static final SubLObject $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLObject $ic8$;
    private static final SubLSymbol $ic9$;
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
    private static final SubLObject $ic20$;
    private static final SubLString $ic21$;
    private static final SubLString $ic22$;
    private static final SubLString $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLList $ic27$;
    private static final SubLSymbol $ic28$;
    
    public static SubLObject f30709(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0440.UNPROVIDED) {
            var2 = (SubLObject)module0440.NIL;
        }
        if (var3 == module0440.UNPROVIDED) {
            var3 = (SubLObject)module0440.$ic0$;
        }
        return module0191.f11990((SubLObject)module0440.$ic1$, module0202.f12768(module0440.$ic2$, var1, module0440.$ic3$), var2, var3);
    }
    
    public static SubLObject f30710(final SubLObject var4) {
        return module0313.f21137(var4);
    }
    
    public static SubLObject f30711(final SubLObject var1, final SubLObject var5, final SubLObject var6, SubLObject var2, SubLObject var3) {
        if (var2 == module0440.UNPROVIDED) {
            var2 = (SubLObject)module0440.NIL;
        }
        if (var3 == module0440.UNPROVIDED) {
            var3 = (SubLObject)module0440.$ic0$;
        }
        return module0266.f17537(var1, var5, var6, var2, var3, (SubLObject)module0440.T);
    }
    
    public static SubLObject f30712(final SubLObject var1, final SubLObject var5, final SubLObject var6, SubLObject var2, SubLObject var3) {
        if (var2 == module0440.UNPROVIDED) {
            var2 = (SubLObject)module0440.NIL;
        }
        if (var3 == module0440.UNPROVIDED) {
            var3 = (SubLObject)module0440.$ic0$;
        }
        return module0266.f17537(var1, var5, var6, var2, var3, (SubLObject)module0440.NIL);
    }
    
    public static SubLObject f30713(final SubLObject var1, final SubLObject var5, final SubLObject var6, SubLObject var2, SubLObject var3) {
        if (var2 == module0440.UNPROVIDED) {
            var2 = (SubLObject)module0440.NIL;
        }
        if (var3 == module0440.UNPROVIDED) {
            var3 = (SubLObject)module0440.$ic0$;
        }
        final SubLObject var7 = f30709(var1, var2, var3);
        final SubLObject var8 = module0266.f17543(var1, var5, var6, var2, var3);
        return (SubLObject)((module0440.NIL != var8) ? ConsesLow.cons(var7, var8) : module0440.NIL);
    }
    
    public static SubLObject f30714(final SubLObject var9, SubLObject var10) {
        if (var10 == module0440.UNPROVIDED) {
            var10 = (SubLObject)module0440.NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        final SubLObject var12 = module0205.f13333(var9);
        final SubLObject var13 = module0205.f13387(var9, (SubLObject)module0440.UNPROVIDED);
        SubLObject var14 = (SubLObject)module0440.ZERO_INTEGER;
        final SubLObject var15 = module0137.f8955(module0440.$ic8$);
        final SubLObject var16 = var12;
        final SubLObject var17 = (SubLObject)module0440.$ic11$;
        final SubLObject var18 = module0056.f4145(var17);
        SubLObject var19 = (SubLObject)module0440.NIL;
        final SubLObject var20 = module0139.$g1635$.currentBinding(var11);
        try {
            module0139.$g1635$.bind(module0139.f9007(), var11);
            final SubLObject var21 = (SubLObject)module0440.NIL;
            final SubLObject var19_21 = module0141.$g1714$.currentBinding(var11);
            final SubLObject var22 = module0141.$g1715$.currentBinding(var11);
            try {
                module0141.$g1714$.bind((module0440.NIL != var21) ? var21 : module0141.f9283(), var11);
                module0141.$g1715$.bind((SubLObject)((module0440.NIL != var21) ? module0440.$ic12$ : module0141.$g1715$.getDynamicValue(var11)), var11);
                if (module0440.NIL != var21 && module0440.NIL != module0136.f8864() && module0440.NIL == module0141.f9279(var21)) {
                    final SubLObject var23 = module0136.$g1591$.getDynamicValue(var11);
                    if (var23.eql((SubLObject)module0440.$ic13$)) {
                        module0136.f8870((SubLObject)module0440.ONE_INTEGER, (SubLObject)module0440.$ic14$, var21, (SubLObject)module0440.$ic15$, (SubLObject)module0440.UNPROVIDED, (SubLObject)module0440.UNPROVIDED, (SubLObject)module0440.UNPROVIDED);
                    }
                    else if (var23.eql((SubLObject)module0440.$ic16$)) {
                        module0136.f8871((SubLObject)module0440.ONE_INTEGER, (SubLObject)module0440.$ic17$, (SubLObject)module0440.$ic14$, var21, (SubLObject)module0440.$ic15$, (SubLObject)module0440.UNPROVIDED, (SubLObject)module0440.UNPROVIDED, (SubLObject)module0440.UNPROVIDED);
                    }
                    else if (var23.eql((SubLObject)module0440.$ic18$)) {
                        Errors.warn((SubLObject)module0440.$ic14$, var21, (SubLObject)module0440.$ic15$);
                    }
                    else {
                        Errors.warn((SubLObject)module0440.$ic19$, module0136.$g1591$.getDynamicValue(var11));
                        Errors.cerror((SubLObject)module0440.$ic17$, (SubLObject)module0440.$ic14$, var21, (SubLObject)module0440.$ic15$);
                    }
                }
                final SubLObject var19_22 = module0141.$g1670$.currentBinding(var11);
                final SubLObject var22_25 = module0141.$g1671$.currentBinding(var11);
                final SubLObject var24 = module0141.$g1672$.currentBinding(var11);
                final SubLObject var25 = module0141.$g1674$.currentBinding(var11);
                final SubLObject var26 = module0137.$g1605$.currentBinding(var11);
                try {
                    module0141.$g1670$.bind(var15, var11);
                    module0141.$g1671$.bind(module0244.f15739(var15), var11);
                    module0141.$g1672$.bind(module0244.f15746(var15), var11);
                    module0141.$g1674$.bind((SubLObject)module0440.NIL, var11);
                    module0137.$g1605$.bind(var15, var11);
                    if (module0440.NIL != module0136.f8865() || module0440.NIL != module0244.f15795(var12, module0137.f8955((SubLObject)module0440.UNPROVIDED))) {
                        final SubLObject var19_23 = module0141.$g1677$.currentBinding(var11);
                        final SubLObject var22_26 = module0138.$g1619$.currentBinding(var11);
                        final SubLObject var26_31 = module0141.$g1674$.currentBinding(var11);
                        try {
                            module0141.$g1677$.bind(module0141.f9210(), var11);
                            module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), var15), var11);
                            module0141.$g1674$.bind((SubLObject)module0440.NIL, var11);
                            module0249.f16055(var16, (SubLObject)module0440.UNPROVIDED);
                            for (var19 = (SubLObject)ConsesLow.list(var12, module0141.f9195()); module0440.NIL != var19; var19 = module0056.f4150(var18)) {
                                final SubLObject var15_32 = var19.first();
                                final SubLObject var27 = conses_high.second(var19);
                                final SubLObject var28 = var15_32;
                                final SubLObject var19_24 = module0141.$g1674$.currentBinding(var11);
                                try {
                                    module0141.$g1674$.bind(var27, var11);
                                    final SubLObject var29 = var27;
                                    if (module0440.NIL != var29) {
                                        if (var28.eql(module0440.$ic20$)) {
                                            var14 = Numbers.add(var14, module0549.f33901(var13));
                                        }
                                        else {
                                            var14 = Numbers.add(var14, module0217.f14221(var13, (SubLObject)module0440.TWO_INTEGER, var28, (SubLObject)module0440.UNPROVIDED));
                                        }
                                    }
                                    else if (var28.eql(module0440.$ic20$)) {
                                        var14 = Numbers.add(var14, module0549.f33899(var13));
                                    }
                                    else {
                                        var14 = Numbers.add(var14, module0217.f14221(var13, (SubLObject)module0440.ONE_INTEGER, var28, (SubLObject)module0440.UNPROVIDED));
                                    }
                                    SubLObject var31;
                                    final SubLObject var30 = var31 = module0200.f12443(var15);
                                    SubLObject var32 = (SubLObject)module0440.NIL;
                                    var32 = var31.first();
                                    while (module0440.NIL != var31) {
                                        final SubLObject var19_25 = module0137.$g1605$.currentBinding(var11);
                                        final SubLObject var22_27 = module0141.$g1674$.currentBinding(var11);
                                        try {
                                            module0137.$g1605$.bind(var32, var11);
                                            module0141.$g1674$.bind((SubLObject)((module0440.NIL != module0141.f9205((SubLObject)module0440.UNPROVIDED, (SubLObject)module0440.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0440.NIL == module0141.$g1674$.getDynamicValue(var11)) : module0141.$g1674$.getDynamicValue(var11)), var11);
                                            final SubLObject var33 = module0228.f15229(var15_32);
                                            if (module0440.NIL != module0138.f8992(var33)) {
                                                final SubLObject var34 = module0242.f15664(var33, module0137.f8955((SubLObject)module0440.UNPROVIDED));
                                                if (module0440.NIL != var34) {
                                                    final SubLObject var35 = module0245.f15834(var34, module0138.f8979(), module0137.f8955((SubLObject)module0440.UNPROVIDED));
                                                    if (module0440.NIL != var35) {
                                                        SubLObject var36;
                                                        for (var36 = module0066.f4838(module0067.f4891(var35)); module0440.NIL == module0066.f4841(var36); var36 = module0066.f4840(var36)) {
                                                            var11.resetMultipleValues();
                                                            final SubLObject var37 = module0066.f4839(var36);
                                                            final SubLObject var38 = var11.secondMultipleValue();
                                                            var11.resetMultipleValues();
                                                            if (module0440.NIL != module0147.f9507(var37)) {
                                                                final SubLObject var19_26 = module0138.$g1623$.currentBinding(var11);
                                                                try {
                                                                    module0138.$g1623$.bind(var37, var11);
                                                                    SubLObject var45_49;
                                                                    for (var45_49 = module0066.f4838(module0067.f4891(var38)); module0440.NIL == module0066.f4841(var45_49); var45_49 = module0066.f4840(var45_49)) {
                                                                        var11.resetMultipleValues();
                                                                        final SubLObject var39 = module0066.f4839(var45_49);
                                                                        final SubLObject var40 = var11.secondMultipleValue();
                                                                        var11.resetMultipleValues();
                                                                        if (module0440.NIL != module0141.f9289(var39)) {
                                                                            final SubLObject var19_27 = module0138.$g1624$.currentBinding(var11);
                                                                            try {
                                                                                module0138.$g1624$.bind(var39, var11);
                                                                                final SubLObject var41 = var40;
                                                                                if (module0440.NIL != module0077.f5302(var41)) {
                                                                                    final SubLObject var42 = module0077.f5333(var41);
                                                                                    SubLObject var43;
                                                                                    SubLObject var44;
                                                                                    SubLObject var45;
                                                                                    for (var43 = module0032.f1741(var42), var44 = (SubLObject)module0440.NIL, var44 = module0032.f1742(var43, var42); module0440.NIL == module0032.f1744(var43, var44); var44 = module0032.f1743(var44)) {
                                                                                        var45 = module0032.f1745(var43, var44);
                                                                                        if (module0440.NIL != module0032.f1746(var44, var45) && module0440.NIL == module0249.f16059(var45, (SubLObject)module0440.UNPROVIDED)) {
                                                                                            module0249.f16055(var45, (SubLObject)module0440.UNPROVIDED);
                                                                                            module0056.f4149((SubLObject)ConsesLow.list(var45, module0141.f9195()), var18);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var41.isList()) {
                                                                                    SubLObject var46 = var41;
                                                                                    SubLObject var47 = (SubLObject)module0440.NIL;
                                                                                    var47 = var46.first();
                                                                                    while (module0440.NIL != var46) {
                                                                                        if (module0440.NIL == module0249.f16059(var47, (SubLObject)module0440.UNPROVIDED)) {
                                                                                            module0249.f16055(var47, (SubLObject)module0440.UNPROVIDED);
                                                                                            module0056.f4149((SubLObject)ConsesLow.list(var47, module0141.f9195()), var18);
                                                                                        }
                                                                                        var46 = var46.rest();
                                                                                        var47 = var46.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)module0440.$ic21$, var41);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var19_27, var11);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var45_49);
                                                                }
                                                                finally {
                                                                    module0138.$g1623$.rebind(var19_26, var11);
                                                                }
                                                            }
                                                        }
                                                        module0066.f4842(var36);
                                                    }
                                                }
                                                else {
                                                    module0136.f8870((SubLObject)module0440.FIVE_INTEGER, (SubLObject)module0440.$ic22$, (SubLObject)module0440.UNPROVIDED, (SubLObject)module0440.UNPROVIDED, (SubLObject)module0440.UNPROVIDED, (SubLObject)module0440.UNPROVIDED, (SubLObject)module0440.UNPROVIDED);
                                                }
                                            }
                                            else if (module0440.NIL != module0155.f9785(var33, (SubLObject)module0440.UNPROVIDED)) {
                                                SubLObject var38_60;
                                                final SubLObject var48 = var38_60 = ((module0440.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var11), module0137.f8955((SubLObject)module0440.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var11), module0137.f8955((SubLObject)module0440.UNPROVIDED)));
                                                SubLObject var49 = (SubLObject)module0440.NIL;
                                                var49 = var38_60.first();
                                                while (module0440.NIL != var38_60) {
                                                    final SubLObject var19_28 = module0138.$g1625$.currentBinding(var11);
                                                    try {
                                                        module0138.$g1625$.bind(var49, var11);
                                                        final SubLObject var51;
                                                        final SubLObject var50 = var51 = Functions.funcall(var49, var33);
                                                        if (module0440.NIL != module0077.f5302(var51)) {
                                                            final SubLObject var52 = module0077.f5333(var51);
                                                            SubLObject var53;
                                                            SubLObject var54;
                                                            SubLObject var55;
                                                            for (var53 = module0032.f1741(var52), var54 = (SubLObject)module0440.NIL, var54 = module0032.f1742(var53, var52); module0440.NIL == module0032.f1744(var53, var54); var54 = module0032.f1743(var54)) {
                                                                var55 = module0032.f1745(var53, var54);
                                                                if (module0440.NIL != module0032.f1746(var54, var55) && module0440.NIL == module0249.f16059(var55, (SubLObject)module0440.UNPROVIDED)) {
                                                                    module0249.f16055(var55, (SubLObject)module0440.UNPROVIDED);
                                                                    module0056.f4149((SubLObject)ConsesLow.list(var55, module0141.f9195()), var18);
                                                                }
                                                            }
                                                        }
                                                        else if (var51.isList()) {
                                                            SubLObject var56 = var51;
                                                            SubLObject var57 = (SubLObject)module0440.NIL;
                                                            var57 = var56.first();
                                                            while (module0440.NIL != var56) {
                                                                if (module0440.NIL == module0249.f16059(var57, (SubLObject)module0440.UNPROVIDED)) {
                                                                    module0249.f16055(var57, (SubLObject)module0440.UNPROVIDED);
                                                                    module0056.f4149((SubLObject)ConsesLow.list(var57, module0141.f9195()), var18);
                                                                }
                                                                var56 = var56.rest();
                                                                var57 = var56.first();
                                                            }
                                                        }
                                                        else {
                                                            Errors.error((SubLObject)module0440.$ic21$, var51);
                                                        }
                                                    }
                                                    finally {
                                                        module0138.$g1625$.rebind(var19_28, var11);
                                                    }
                                                    var38_60 = var38_60.rest();
                                                    var49 = var38_60.first();
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var22_27, var11);
                                            module0137.$g1605$.rebind(var19_25, var11);
                                        }
                                        var31 = var31.rest();
                                        var32 = var31.first();
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var19_24, var11);
                                }
                            }
                        }
                        finally {
                            module0141.$g1674$.rebind(var26_31, var11);
                            module0138.$g1619$.rebind(var22_26, var11);
                            module0141.$g1677$.rebind(var19_23, var11);
                        }
                    }
                    else {
                        module0136.f8872((SubLObject)module0440.TWO_INTEGER, (SubLObject)module0440.$ic23$, var12, module0244.f15748(module0137.f8955((SubLObject)module0440.UNPROVIDED)), (SubLObject)module0440.UNPROVIDED, (SubLObject)module0440.UNPROVIDED, (SubLObject)module0440.UNPROVIDED);
                    }
                }
                finally {
                    module0137.$g1605$.rebind(var26, var11);
                    module0141.$g1674$.rebind(var25, var11);
                    module0141.$g1672$.rebind(var24, var11);
                    module0141.$g1671$.rebind(var22_25, var11);
                    module0141.$g1670$.rebind(var19_22, var11);
                }
            }
            finally {
                module0141.$g1715$.rebind(var22, var11);
                module0141.$g1714$.rebind(var19_21, var11);
            }
            module0139.f9011(module0139.$g1635$.getDynamicValue(var11));
        }
        finally {
            module0139.$g1635$.rebind(var20, var11);
        }
        return Numbers.max(module0440.$g3544$.getDynamicValue(var11), var14);
    }
    
    public static SubLObject f30715(final SubLObject var1, final SubLObject var5) {
        final SubLObject var6 = module0266.f17525(var1, var5, (SubLObject)module0440.$ic24$, (SubLObject)module0440.UNPROVIDED);
        if (module0440.NIL != module0269.f17776(var1)) {
            return module0052.f3781(var6, (SubLObject)module0440.$ic25$, (SubLObject)ConsesLow.list(var5));
        }
        return var6;
    }
    
    public static SubLObject f30716(final SubLObject var9, SubLObject var10) {
        if (var10 == module0440.UNPROVIDED) {
            var10 = (SubLObject)module0440.NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        final SubLObject var12 = module0205.f13333(var9);
        final SubLObject var13 = module0205.f13388(var9, (SubLObject)module0440.UNPROVIDED);
        SubLObject var14 = (SubLObject)module0440.ZERO_INTEGER;
        final SubLObject var15 = module0137.f8955(module0440.$ic8$);
        final SubLObject var16 = var12;
        final SubLObject var17 = (SubLObject)module0440.$ic11$;
        final SubLObject var18 = module0056.f4145(var17);
        SubLObject var19 = (SubLObject)module0440.NIL;
        final SubLObject var20 = module0139.$g1635$.currentBinding(var11);
        try {
            module0139.$g1635$.bind(module0139.f9007(), var11);
            final SubLObject var21 = (SubLObject)module0440.NIL;
            final SubLObject var19_64 = module0141.$g1714$.currentBinding(var11);
            final SubLObject var22 = module0141.$g1715$.currentBinding(var11);
            try {
                module0141.$g1714$.bind((module0440.NIL != var21) ? var21 : module0141.f9283(), var11);
                module0141.$g1715$.bind((SubLObject)((module0440.NIL != var21) ? module0440.$ic12$ : module0141.$g1715$.getDynamicValue(var11)), var11);
                if (module0440.NIL != var21 && module0440.NIL != module0136.f8864() && module0440.NIL == module0141.f9279(var21)) {
                    final SubLObject var23 = module0136.$g1591$.getDynamicValue(var11);
                    if (var23.eql((SubLObject)module0440.$ic13$)) {
                        module0136.f8870((SubLObject)module0440.ONE_INTEGER, (SubLObject)module0440.$ic14$, var21, (SubLObject)module0440.$ic15$, (SubLObject)module0440.UNPROVIDED, (SubLObject)module0440.UNPROVIDED, (SubLObject)module0440.UNPROVIDED);
                    }
                    else if (var23.eql((SubLObject)module0440.$ic16$)) {
                        module0136.f8871((SubLObject)module0440.ONE_INTEGER, (SubLObject)module0440.$ic17$, (SubLObject)module0440.$ic14$, var21, (SubLObject)module0440.$ic15$, (SubLObject)module0440.UNPROVIDED, (SubLObject)module0440.UNPROVIDED, (SubLObject)module0440.UNPROVIDED);
                    }
                    else if (var23.eql((SubLObject)module0440.$ic18$)) {
                        Errors.warn((SubLObject)module0440.$ic14$, var21, (SubLObject)module0440.$ic15$);
                    }
                    else {
                        Errors.warn((SubLObject)module0440.$ic19$, module0136.$g1591$.getDynamicValue(var11));
                        Errors.cerror((SubLObject)module0440.$ic17$, (SubLObject)module0440.$ic14$, var21, (SubLObject)module0440.$ic15$);
                    }
                }
                final SubLObject var19_65 = module0141.$g1670$.currentBinding(var11);
                final SubLObject var22_66 = module0141.$g1671$.currentBinding(var11);
                final SubLObject var24 = module0141.$g1672$.currentBinding(var11);
                final SubLObject var25 = module0141.$g1674$.currentBinding(var11);
                final SubLObject var26 = module0137.$g1605$.currentBinding(var11);
                try {
                    module0141.$g1670$.bind(var15, var11);
                    module0141.$g1671$.bind(module0244.f15739(var15), var11);
                    module0141.$g1672$.bind(module0244.f15746(var15), var11);
                    module0141.$g1674$.bind((SubLObject)module0440.NIL, var11);
                    module0137.$g1605$.bind(var15, var11);
                    if (module0440.NIL != module0136.f8865() || module0440.NIL != module0244.f15795(var12, module0137.f8955((SubLObject)module0440.UNPROVIDED))) {
                        final SubLObject var19_66 = module0141.$g1677$.currentBinding(var11);
                        final SubLObject var22_67 = module0138.$g1619$.currentBinding(var11);
                        final SubLObject var26_69 = module0141.$g1674$.currentBinding(var11);
                        try {
                            module0141.$g1677$.bind(module0141.f9208(), var11);
                            module0138.$g1619$.bind(module0244.f15782(module0141.f9208(), var15), var11);
                            module0141.$g1674$.bind((SubLObject)module0440.NIL, var11);
                            module0249.f16055(var16, (SubLObject)module0440.UNPROVIDED);
                            for (var19 = (SubLObject)ConsesLow.list(var12, module0141.f9195()); module0440.NIL != var19; var19 = module0056.f4150(var18)) {
                                final SubLObject var15_70 = var19.first();
                                final SubLObject var27 = conses_high.second(var19);
                                final SubLObject var28 = var15_70;
                                final SubLObject var19_67 = module0141.$g1674$.currentBinding(var11);
                                try {
                                    module0141.$g1674$.bind(var27, var11);
                                    final SubLObject var29 = var27;
                                    if (module0440.NIL != var29) {
                                        if (var28.eql(module0440.$ic20$)) {
                                            var14 = Numbers.add(var14, module0549.f33899(var13));
                                        }
                                        else {
                                            var14 = Numbers.add(var14, module0217.f14221(var13, (SubLObject)module0440.ONE_INTEGER, var28, (SubLObject)module0440.UNPROVIDED));
                                        }
                                    }
                                    else if (var28.eql(module0440.$ic20$)) {
                                        var14 = Numbers.add(var14, module0549.f33901(var13));
                                    }
                                    else {
                                        var14 = Numbers.add(var14, module0217.f14221(var13, (SubLObject)module0440.TWO_INTEGER, var28, (SubLObject)module0440.UNPROVIDED));
                                    }
                                    SubLObject var31;
                                    final SubLObject var30 = var31 = module0200.f12443(var15);
                                    SubLObject var32 = (SubLObject)module0440.NIL;
                                    var32 = var31.first();
                                    while (module0440.NIL != var31) {
                                        final SubLObject var19_68 = module0137.$g1605$.currentBinding(var11);
                                        final SubLObject var22_68 = module0141.$g1674$.currentBinding(var11);
                                        try {
                                            module0137.$g1605$.bind(var32, var11);
                                            module0141.$g1674$.bind((SubLObject)((module0440.NIL != module0141.f9205((SubLObject)module0440.UNPROVIDED, (SubLObject)module0440.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0440.NIL == module0141.$g1674$.getDynamicValue(var11)) : module0141.$g1674$.getDynamicValue(var11)), var11);
                                            final SubLObject var33 = module0228.f15229(var15_70);
                                            if (module0440.NIL != module0138.f8992(var33)) {
                                                final SubLObject var34 = module0242.f15664(var33, module0137.f8955((SubLObject)module0440.UNPROVIDED));
                                                if (module0440.NIL != var34) {
                                                    final SubLObject var35 = module0245.f15834(var34, module0138.f8979(), module0137.f8955((SubLObject)module0440.UNPROVIDED));
                                                    if (module0440.NIL != var35) {
                                                        SubLObject var36;
                                                        for (var36 = module0066.f4838(module0067.f4891(var35)); module0440.NIL == module0066.f4841(var36); var36 = module0066.f4840(var36)) {
                                                            var11.resetMultipleValues();
                                                            final SubLObject var37 = module0066.f4839(var36);
                                                            final SubLObject var38 = var11.secondMultipleValue();
                                                            var11.resetMultipleValues();
                                                            if (module0440.NIL != module0147.f9507(var37)) {
                                                                final SubLObject var19_69 = module0138.$g1623$.currentBinding(var11);
                                                                try {
                                                                    module0138.$g1623$.bind(var37, var11);
                                                                    SubLObject var45_75;
                                                                    for (var45_75 = module0066.f4838(module0067.f4891(var38)); module0440.NIL == module0066.f4841(var45_75); var45_75 = module0066.f4840(var45_75)) {
                                                                        var11.resetMultipleValues();
                                                                        final SubLObject var39 = module0066.f4839(var45_75);
                                                                        final SubLObject var40 = var11.secondMultipleValue();
                                                                        var11.resetMultipleValues();
                                                                        if (module0440.NIL != module0141.f9289(var39)) {
                                                                            final SubLObject var19_70 = module0138.$g1624$.currentBinding(var11);
                                                                            try {
                                                                                module0138.$g1624$.bind(var39, var11);
                                                                                final SubLObject var41 = var40;
                                                                                if (module0440.NIL != module0077.f5302(var41)) {
                                                                                    final SubLObject var42 = module0077.f5333(var41);
                                                                                    SubLObject var43;
                                                                                    SubLObject var44;
                                                                                    SubLObject var45;
                                                                                    for (var43 = module0032.f1741(var42), var44 = (SubLObject)module0440.NIL, var44 = module0032.f1742(var43, var42); module0440.NIL == module0032.f1744(var43, var44); var44 = module0032.f1743(var44)) {
                                                                                        var45 = module0032.f1745(var43, var44);
                                                                                        if (module0440.NIL != module0032.f1746(var44, var45) && module0440.NIL == module0249.f16059(var45, (SubLObject)module0440.UNPROVIDED)) {
                                                                                            module0249.f16055(var45, (SubLObject)module0440.UNPROVIDED);
                                                                                            module0056.f4149((SubLObject)ConsesLow.list(var45, module0141.f9195()), var18);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var41.isList()) {
                                                                                    SubLObject var46 = var41;
                                                                                    SubLObject var47 = (SubLObject)module0440.NIL;
                                                                                    var47 = var46.first();
                                                                                    while (module0440.NIL != var46) {
                                                                                        if (module0440.NIL == module0249.f16059(var47, (SubLObject)module0440.UNPROVIDED)) {
                                                                                            module0249.f16055(var47, (SubLObject)module0440.UNPROVIDED);
                                                                                            module0056.f4149((SubLObject)ConsesLow.list(var47, module0141.f9195()), var18);
                                                                                        }
                                                                                        var46 = var46.rest();
                                                                                        var47 = var46.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)module0440.$ic21$, var41);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var19_70, var11);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var45_75);
                                                                }
                                                                finally {
                                                                    module0138.$g1623$.rebind(var19_69, var11);
                                                                }
                                                            }
                                                        }
                                                        module0066.f4842(var36);
                                                    }
                                                }
                                                else {
                                                    module0136.f8870((SubLObject)module0440.FIVE_INTEGER, (SubLObject)module0440.$ic22$, (SubLObject)module0440.UNPROVIDED, (SubLObject)module0440.UNPROVIDED, (SubLObject)module0440.UNPROVIDED, (SubLObject)module0440.UNPROVIDED, (SubLObject)module0440.UNPROVIDED);
                                                }
                                            }
                                            else if (module0440.NIL != module0155.f9785(var33, (SubLObject)module0440.UNPROVIDED)) {
                                                SubLObject var38_77;
                                                final SubLObject var48 = var38_77 = ((module0440.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var11), module0137.f8955((SubLObject)module0440.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var11), module0137.f8955((SubLObject)module0440.UNPROVIDED)));
                                                SubLObject var49 = (SubLObject)module0440.NIL;
                                                var49 = var38_77.first();
                                                while (module0440.NIL != var38_77) {
                                                    final SubLObject var19_71 = module0138.$g1625$.currentBinding(var11);
                                                    try {
                                                        module0138.$g1625$.bind(var49, var11);
                                                        final SubLObject var51;
                                                        final SubLObject var50 = var51 = Functions.funcall(var49, var33);
                                                        if (module0440.NIL != module0077.f5302(var51)) {
                                                            final SubLObject var52 = module0077.f5333(var51);
                                                            SubLObject var53;
                                                            SubLObject var54;
                                                            SubLObject var55;
                                                            for (var53 = module0032.f1741(var52), var54 = (SubLObject)module0440.NIL, var54 = module0032.f1742(var53, var52); module0440.NIL == module0032.f1744(var53, var54); var54 = module0032.f1743(var54)) {
                                                                var55 = module0032.f1745(var53, var54);
                                                                if (module0440.NIL != module0032.f1746(var54, var55) && module0440.NIL == module0249.f16059(var55, (SubLObject)module0440.UNPROVIDED)) {
                                                                    module0249.f16055(var55, (SubLObject)module0440.UNPROVIDED);
                                                                    module0056.f4149((SubLObject)ConsesLow.list(var55, module0141.f9195()), var18);
                                                                }
                                                            }
                                                        }
                                                        else if (var51.isList()) {
                                                            SubLObject var56 = var51;
                                                            SubLObject var57 = (SubLObject)module0440.NIL;
                                                            var57 = var56.first();
                                                            while (module0440.NIL != var56) {
                                                                if (module0440.NIL == module0249.f16059(var57, (SubLObject)module0440.UNPROVIDED)) {
                                                                    module0249.f16055(var57, (SubLObject)module0440.UNPROVIDED);
                                                                    module0056.f4149((SubLObject)ConsesLow.list(var57, module0141.f9195()), var18);
                                                                }
                                                                var56 = var56.rest();
                                                                var57 = var56.first();
                                                            }
                                                        }
                                                        else {
                                                            Errors.error((SubLObject)module0440.$ic21$, var51);
                                                        }
                                                    }
                                                    finally {
                                                        module0138.$g1625$.rebind(var19_71, var11);
                                                    }
                                                    var38_77 = var38_77.rest();
                                                    var49 = var38_77.first();
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var22_68, var11);
                                            module0137.$g1605$.rebind(var19_68, var11);
                                        }
                                        var31 = var31.rest();
                                        var32 = var31.first();
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var19_67, var11);
                                }
                            }
                        }
                        finally {
                            module0141.$g1674$.rebind(var26_69, var11);
                            module0138.$g1619$.rebind(var22_67, var11);
                            module0141.$g1677$.rebind(var19_66, var11);
                        }
                    }
                    else {
                        module0136.f8872((SubLObject)module0440.TWO_INTEGER, (SubLObject)module0440.$ic23$, var12, module0244.f15748(module0137.f8955((SubLObject)module0440.UNPROVIDED)), (SubLObject)module0440.UNPROVIDED, (SubLObject)module0440.UNPROVIDED, (SubLObject)module0440.UNPROVIDED);
                    }
                }
                finally {
                    module0137.$g1605$.rebind(var26, var11);
                    module0141.$g1674$.rebind(var25, var11);
                    module0141.$g1672$.rebind(var24, var11);
                    module0141.$g1671$.rebind(var22_66, var11);
                    module0141.$g1670$.rebind(var19_65, var11);
                }
            }
            finally {
                module0141.$g1715$.rebind(var22, var11);
                module0141.$g1714$.rebind(var19_64, var11);
            }
            module0139.f9011(module0139.$g1635$.getDynamicValue(var11));
        }
        finally {
            module0139.$g1635$.rebind(var20, var11);
        }
        return Numbers.max(module0440.$g3544$.getDynamicValue(var11), var14);
    }
    
    public static SubLObject f30717(final SubLObject var1, final SubLObject var6) {
        final SubLObject var7 = module0266.f17525(var1, var6, (SubLObject)module0440.$ic28$, (SubLObject)module0440.UNPROVIDED);
        if (module0440.NIL != module0269.f17776(var1)) {
            return module0052.f3781(var7, (SubLObject)module0440.$ic25$, (SubLObject)ConsesLow.list(var6));
        }
        return var7;
    }
    
    public static SubLObject f30718(final SubLObject var1, final SubLObject var6) {
        return module0266.f17531(var1, var6, (SubLObject)module0440.UNPROVIDED, (SubLObject)module0440.UNPROVIDED);
    }
    
    public static SubLObject f30719() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0440", "f30709", "S#18841", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0440", "f30710", "S#33957", 1, 0, false);
        new $f30710$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0440", "f30711", "S#33960", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0440", "f30712", "S#24938", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0440", "f30713", "S#24939", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0440", "f30714", "S#33958", 1, 1, false);
        new $f30714$UnaryFunction();
        new $f30714$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0440", "f30715", "S#33959", 2, 0, false);
        new $f30715$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0440", "f30716", "S#33961", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0440", "f30717", "S#33962", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0440", "f30718", "S#33963", 2, 0, false);
        return (SubLObject)module0440.NIL;
    }
    
    public static SubLObject f30720() {
        module0440.$g3543$ = SubLFiles.defparameter("S#33964", module0018.$g661$.getGlobalValue());
        module0440.$g3544$ = SubLFiles.defparameter("S#33965", (SubLObject)module0440.FOUR_INTEGER);
        return (SubLObject)module0440.NIL;
    }
    
    public static SubLObject f30721() {
        module0340.f22941((SubLObject)module0440.$ic4$, (SubLObject)module0440.$ic5$);
        module0340.f22941((SubLObject)module0440.$ic6$, (SubLObject)module0440.$ic7$);
        module0340.f22941((SubLObject)module0440.$ic26$, (SubLObject)module0440.$ic27$);
        return (SubLObject)module0440.NIL;
    }
    
    public void declareFunctions() {
        f30719();
    }
    
    public void initializeVariables() {
        f30720();
    }
    
    public void runTopLevelForms() {
        f30721();
    }
    
    static {
        me = (SubLFile)new module0440();
        module0440.$g3543$ = null;
        module0440.$g3544$ = null;
        $ic0$ = SubLObjectFactory.makeKeyword("TRUE-DEF");
        $ic1$ = SubLObjectFactory.makeKeyword("ISA");
        $ic2$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic3$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TransitiveBinaryPredicate"));
        $ic4$ = SubLObjectFactory.makeKeyword("REMOVAL-TRANSITIVE-CHECK");
        $ic5$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("ARITY"), module0440.TWO_INTEGER, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#33957", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#33957", "CYC"))), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26077", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#33964", "CYC"), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#750", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#751", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#24938", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#750", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#751", "CYC")))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("TRANSITIVITY"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<transitive predicate> <fort> <fort>))\nusing general transitivity graph walking of KB assertions"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$geographicalSubRegions #$ContinentOfEurope #$CityOfParisFrance)") });
        $ic6$ = SubLObjectFactory.makeKeyword("REMOVAL-TRANSITIVE-ARG1-WALK");
        $ic7$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("ARITY"), module0440.TWO_INTEGER, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#33957", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26077", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#33958", "CYC"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#717", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#750", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#717", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#750", "CYC")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#33959", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#717", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#750", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#717", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#750", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("TRANSITIVITY"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<transitive predicate> <fort> <variable>))\nusing general transitivity graph walking of KB assertions\nstarting from <arg1>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$geographicalSubRegions #$ContinentOfEurope ?SUB)") });
        $ic8$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $ic9$ = SubLObjectFactory.makeKeyword("DEPTH");
        $ic10$ = SubLObjectFactory.makeKeyword("STACK");
        $ic11$ = SubLObjectFactory.makeKeyword("QUEUE");
        $ic12$ = SubLObjectFactory.makeSymbol("S#11450", "CYC");
        $ic13$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic14$ = SubLObjectFactory.makeString("~A is not a ~A");
        $ic15$ = SubLObjectFactory.makeSymbol("S#11592", "CYC");
        $ic16$ = SubLObjectFactory.makeKeyword("CERROR");
        $ic17$ = SubLObjectFactory.makeString("continue anyway");
        $ic18$ = SubLObjectFactory.makeKeyword("WARN");
        $ic19$ = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic20$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genls"));
        $ic21$ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $ic22$ = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic23$ = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic24$ = SubLObjectFactory.makeKeyword("FORWARD");
        $ic25$ = SubLObjectFactory.makeSymbol("S#24887", "CYC");
        $ic26$ = SubLObjectFactory.makeKeyword("REMOVAL-TRANSITIVE-ARG2-WALK");
        $ic27$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("ARITY"), module0440.TWO_INTEGER, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#33957", "CYC"))), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26077", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#33961", "CYC"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#717", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#751", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#717", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#751", "CYC")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#33962", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#717", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#751", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#717", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#751", "CYC"))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("TRANSITIVITY"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<transitive predicate> <variable> <fort>))\nusing general transitivity graph walking of KB assertions\nstarting from <arg2>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$geographicalSubRegions ?SUPER #$CityOfParisFrance)") });
        $ic28$ = SubLObjectFactory.makeKeyword("BACKWARD");
    }
    
    public static final class $f30710$UnaryFunction extends UnaryFunction
    {
        public $f30710$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#33957"));
        }
        
        public SubLObject processItem(final SubLObject var5) {
            return module0440.f30710(var5);
        }
    }
    
    public static final class $f30714$UnaryFunction extends UnaryFunction
    {
        public $f30714$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#33958"));
        }
        
        public SubLObject processItem(final SubLObject var5) {
            return module0440.f30714(var5, (SubLObject)$f30714$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f30714$BinaryFunction extends BinaryFunction
    {
        public $f30714$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#33958"));
        }
        
        public SubLObject processItem(final SubLObject var5, final SubLObject var6) {
            return module0440.f30714(var5, var6);
        }
    }
    
    public static final class $f30715$BinaryFunction extends BinaryFunction
    {
        public $f30715$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#33959"));
        }
        
        public SubLObject processItem(final SubLObject var5, final SubLObject var6) {
            return module0440.f30715(var5, var6);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0440.class
	Total time: 614 ms
	
	Decompiled with Procyon 0.5.32.
*/