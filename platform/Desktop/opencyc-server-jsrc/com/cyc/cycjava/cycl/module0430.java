package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0430 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0430";
    public static final String myFingerPrint = "2b411b76e458d076a67868768a57c87f0c3daa5318645109ee6759493777db16";
    private static SubLSymbol $g3504$;
    private static SubLSymbol $g3505$;
    private static SubLSymbol $g3506$;
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
    private static final SubLSymbol $ic14$;
    private static final SubLString $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLString $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLString $ic20$;
    private static final SubLString $ic21$;
    private static final SubLString $ic22$;
    private static final SubLList $ic23$;
    private static final SubLString $ic24$;
    private static final SubLSymbol $ic25$;
    
    public static SubLObject f30426() {
        final SubLObject var1 = module0430.$g3504$.getGlobalValue();
        if (module0430.NIL != var1) {
            module0034.f1818(var1);
        }
        return (SubLObject)module0430.NIL;
    }
    
    public static SubLObject f30427(final SubLObject var2) {
        return module0034.f1829(module0430.$g3504$.getGlobalValue(), (SubLObject)ConsesLow.list(var2), (SubLObject)module0430.UNPROVIDED, (SubLObject)module0430.UNPROVIDED);
    }
    
    public static SubLObject f30428(final SubLObject var2) {
        if (module0430.NIL != module0202.f12589(var2, module0430.$ic1$)) {
            return module0256.f16552(module0205.f13203(var2, (SubLObject)module0430.UNPROVIDED), module0429.$g3496$.getGlobalValue(), (SubLObject)module0430.UNPROVIDED);
        }
        assert module0430.NIL != module0173.f10955(var2) : var2;
        return module0259.f16846(var2, module0429.$g3496$.getGlobalValue(), (SubLObject)module0430.UNPROVIDED);
    }
    
    public static SubLObject f30429(final SubLObject var2) {
        SubLObject var3 = module0430.$g3504$.getGlobalValue();
        if (module0430.NIL == var3) {
            var3 = module0034.f1934((SubLObject)module0430.$ic0$, (SubLObject)module0430.$ic3$, (SubLObject)module0430.NIL, (SubLObject)module0430.EQ, (SubLObject)module0430.ONE_INTEGER, (SubLObject)module0430.ZERO_INTEGER);
        }
        SubLObject var4 = module0034.f1814(var3, var2, (SubLObject)module0430.$ic4$);
        if (var4 == module0430.$ic4$) {
            var4 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f30428(var2)));
            module0034.f1816(var3, var2, var4, (SubLObject)module0430.UNPROVIDED);
        }
        return module0034.f1959(var4);
    }
    
    public static SubLObject f30430() {
        final SubLObject var1 = module0430.$g3505$.getGlobalValue();
        if (module0430.NIL != var1) {
            module0034.f1818(var1);
        }
        return (SubLObject)module0430.NIL;
    }
    
    public static SubLObject f30431(final SubLObject var2) {
        return module0034.f1829(module0430.$g3505$.getGlobalValue(), (SubLObject)ConsesLow.list(var2), (SubLObject)module0430.UNPROVIDED, (SubLObject)module0430.UNPROVIDED);
    }
    
    public static SubLObject f30432(final SubLObject var2) {
        if (module0430.NIL != module0202.f12589(var2, module0430.$ic1$)) {
            return module0256.f16580((SubLObject)module0430.$ic6$, module0205.f13203(var2, (SubLObject)module0430.UNPROVIDED), module0429.$g3496$.getGlobalValue(), (SubLObject)module0430.UNPROVIDED);
        }
        assert module0430.NIL != module0173.f10955(var2) : var2;
        return module0259.f16862((SubLObject)module0430.$ic6$, var2, module0429.$g3496$.getGlobalValue(), (SubLObject)module0430.UNPROVIDED);
    }
    
    public static SubLObject f30433(final SubLObject var2) {
        SubLObject var3 = module0430.$g3505$.getGlobalValue();
        if (module0430.NIL == var3) {
            var3 = module0034.f1934((SubLObject)module0430.$ic5$, (SubLObject)module0430.$ic7$, (SubLObject)module0430.NIL, (SubLObject)module0430.EQ, (SubLObject)module0430.ONE_INTEGER, (SubLObject)module0430.ZERO_INTEGER);
        }
        SubLObject var4 = module0034.f1814(var3, var2, (SubLObject)module0430.$ic4$);
        if (var4 == module0430.$ic4$) {
            var4 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f30432(var2)));
            module0034.f1816(var3, var2, var4, (SubLObject)module0430.UNPROVIDED);
        }
        return module0034.f1959(var4);
    }
    
    public static SubLObject f30434() {
        final SubLObject var1 = module0430.$g3506$.getGlobalValue();
        if (module0430.NIL != var1) {
            module0034.f1818(var1);
        }
        return (SubLObject)module0430.NIL;
    }
    
    public static SubLObject f30435() {
        return module0034.f1829(module0430.$g3506$.getGlobalValue(), (SubLObject)ConsesLow.list(module0430.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)module0430.UNPROVIDED, (SubLObject)module0430.UNPROVIDED);
    }
    
    public static SubLObject f30436() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)module0430.NIL;
        final SubLObject var7 = module0147.f9540(module0429.$g3496$.getGlobalValue());
        final SubLObject var8 = module0147.$g2095$.currentBinding(var5);
        final SubLObject var9 = module0147.$g2094$.currentBinding(var5);
        final SubLObject var10 = module0147.$g2096$.currentBinding(var5);
        try {
            module0147.$g2095$.bind(module0147.f9545(var7), var5);
            module0147.$g2094$.bind(module0147.f9546(var7), var5);
            module0147.$g2096$.bind(module0147.f9549(var7), var5);
            final SubLObject var11 = module0429.$g3494$.getGlobalValue();
            final SubLObject var8_12 = module0137.$g1605$.currentBinding(var5);
            final SubLObject var9_13 = module0139.$g1636$.currentBinding(var5);
            try {
                module0137.$g1605$.bind(module0137.f8955(module0430.$ic9$), var5);
                module0139.$g1636$.bind(module0139.f9007(), var5);
                SubLObject var14_15 = var11;
                final SubLObject var12 = (SubLObject)module0430.$ic12$;
                final SubLObject var13 = module0056.f4145(var12);
                final SubLObject var8_13 = module0139.$g1635$.currentBinding(var5);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var5);
                    final SubLObject var14 = (SubLObject)module0430.NIL;
                    final SubLObject var8_14 = module0141.$g1714$.currentBinding(var5);
                    final SubLObject var9_14 = module0141.$g1715$.currentBinding(var5);
                    try {
                        module0141.$g1714$.bind((module0430.NIL != var14) ? var14 : module0141.f9283(), var5);
                        module0141.$g1715$.bind((SubLObject)((module0430.NIL != var14) ? module0430.$ic13$ : module0141.$g1715$.getDynamicValue(var5)), var5);
                        if (module0430.NIL != var14 && module0430.NIL != module0136.f8864() && module0430.NIL == module0141.f9279(var14)) {
                            final SubLObject var15 = module0136.$g1591$.getDynamicValue(var5);
                            if (var15.eql((SubLObject)module0430.$ic14$)) {
                                module0136.f8870((SubLObject)module0430.ONE_INTEGER, (SubLObject)module0430.$ic15$, var14, (SubLObject)module0430.$ic16$, (SubLObject)module0430.UNPROVIDED, (SubLObject)module0430.UNPROVIDED, (SubLObject)module0430.UNPROVIDED);
                            }
                            else if (var15.eql((SubLObject)module0430.$ic17$)) {
                                module0136.f8871((SubLObject)module0430.ONE_INTEGER, (SubLObject)module0430.$ic18$, (SubLObject)module0430.$ic15$, var14, (SubLObject)module0430.$ic16$, (SubLObject)module0430.UNPROVIDED, (SubLObject)module0430.UNPROVIDED, (SubLObject)module0430.UNPROVIDED);
                            }
                            else if (var15.eql((SubLObject)module0430.$ic19$)) {
                                Errors.warn((SubLObject)module0430.$ic15$, var14, (SubLObject)module0430.$ic16$);
                            }
                            else {
                                Errors.warn((SubLObject)module0430.$ic20$, module0136.$g1591$.getDynamicValue(var5));
                                Errors.cerror((SubLObject)module0430.$ic18$, (SubLObject)module0430.$ic15$, var14, (SubLObject)module0430.$ic16$);
                            }
                        }
                        final SubLObject var8_15 = module0141.$g1670$.currentBinding(var5);
                        final SubLObject var9_15 = module0141.$g1671$.currentBinding(var5);
                        final SubLObject var10_25 = module0141.$g1672$.currentBinding(var5);
                        final SubLObject var16 = module0141.$g1674$.currentBinding(var5);
                        final SubLObject var17 = module0137.$g1605$.currentBinding(var5);
                        try {
                            module0141.$g1670$.bind(module0244.f15771(module0137.f8955(module0430.$ic9$)), var5);
                            module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955(module0430.$ic9$))), var5);
                            module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955(module0430.$ic9$))), var5);
                            module0141.$g1674$.bind((SubLObject)module0430.NIL, var5);
                            module0137.$g1605$.bind(module0244.f15771(module0137.f8955(module0430.$ic9$)), var5);
                            if (module0430.NIL != module0136.f8865() || module0430.NIL != module0244.f15795(var11, module0137.f8955((SubLObject)module0430.UNPROVIDED))) {
                                final SubLObject var8_16 = module0141.$g1677$.currentBinding(var5);
                                final SubLObject var9_16 = module0138.$g1619$.currentBinding(var5);
                                final SubLObject var10_26 = module0141.$g1674$.currentBinding(var5);
                                try {
                                    module0141.$g1677$.bind(module0141.f9210(), var5);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955(module0430.$ic9$))), var5);
                                    module0141.$g1674$.bind((SubLObject)module0430.NIL, var5);
                                    module0249.f16055(var14_15, (SubLObject)module0430.UNPROVIDED);
                                    while (module0430.NIL != var14_15) {
                                        final SubLObject var18 = var14_15;
                                        SubLObject var20;
                                        final SubLObject var19 = var20 = module0200.f12443(module0137.f8955(module0430.$ic9$));
                                        SubLObject var21 = (SubLObject)module0430.NIL;
                                        var21 = var20.first();
                                        while (module0430.NIL != var20) {
                                            final SubLObject var8_17 = module0137.$g1605$.currentBinding(var5);
                                            final SubLObject var9_17 = module0141.$g1674$.currentBinding(var5);
                                            try {
                                                module0137.$g1605$.bind(var21, var5);
                                                module0141.$g1674$.bind((SubLObject)((module0430.NIL != module0141.f9205((SubLObject)module0430.UNPROVIDED, (SubLObject)module0430.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0430.NIL == module0141.$g1674$.getDynamicValue(var5)) : module0141.$g1674$.getDynamicValue(var5)), var5);
                                                final SubLObject var22 = module0228.f15229(var18);
                                                if (module0430.NIL != module0138.f8992(var22)) {
                                                    final SubLObject var23 = module0242.f15664(var22, module0137.f8955((SubLObject)module0430.UNPROVIDED));
                                                    if (module0430.NIL != var23) {
                                                        final SubLObject var24 = module0245.f15834(var23, module0244.f15780(module0137.f8955(module0430.$ic9$)), module0137.f8955((SubLObject)module0430.UNPROVIDED));
                                                        if (module0430.NIL != var24) {
                                                            SubLObject var25;
                                                            for (var25 = module0066.f4838(module0067.f4891(var24)); module0430.NIL == module0066.f4841(var25); var25 = module0066.f4840(var25)) {
                                                                var5.resetMultipleValues();
                                                                final SubLObject var26 = module0066.f4839(var25);
                                                                final SubLObject var27 = var5.secondMultipleValue();
                                                                var5.resetMultipleValues();
                                                                if (module0430.NIL != module0147.f9507(var26)) {
                                                                    final SubLObject var8_18 = module0138.$g1623$.currentBinding(var5);
                                                                    try {
                                                                        module0138.$g1623$.bind(var26, var5);
                                                                        SubLObject var40_44;
                                                                        for (var40_44 = module0066.f4838(module0067.f4891(var27)); module0430.NIL == module0066.f4841(var40_44); var40_44 = module0066.f4840(var40_44)) {
                                                                            var5.resetMultipleValues();
                                                                            final SubLObject var28 = module0066.f4839(var40_44);
                                                                            final SubLObject var29 = var5.secondMultipleValue();
                                                                            var5.resetMultipleValues();
                                                                            if (module0430.NIL != module0141.f9289(var28)) {
                                                                                final SubLObject var8_19 = module0138.$g1624$.currentBinding(var5);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var28, var5);
                                                                                    final SubLObject var30 = var29;
                                                                                    if (module0430.NIL != module0077.f5302(var30)) {
                                                                                        final SubLObject var31 = module0077.f5333(var30);
                                                                                        SubLObject var32;
                                                                                        SubLObject var33;
                                                                                        SubLObject var34;
                                                                                        for (var32 = module0032.f1741(var31), var33 = (SubLObject)module0430.NIL, var33 = module0032.f1742(var32, var31); module0430.NIL == module0032.f1744(var32, var33); var33 = module0032.f1743(var33)) {
                                                                                            var34 = module0032.f1745(var32, var33);
                                                                                            if (module0430.NIL != module0032.f1746(var33, var34) && module0430.NIL == module0249.f16059(var34, module0139.$g1636$.getDynamicValue(var5))) {
                                                                                                module0249.f16055(var34, module0139.$g1636$.getDynamicValue(var5));
                                                                                                if (module0430.NIL != module0173.f10955(var34) && !module0429.f30408(var34).eql(module0429.$g3494$.getGlobalValue())) {
                                                                                                    var6 = (SubLObject)ConsesLow.cons(var34, var6);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var30.isList()) {
                                                                                        SubLObject var35 = var30;
                                                                                        SubLObject var36 = (SubLObject)module0430.NIL;
                                                                                        var36 = var35.first();
                                                                                        while (module0430.NIL != var35) {
                                                                                            if (module0430.NIL == module0249.f16059(var36, module0139.$g1636$.getDynamicValue(var5))) {
                                                                                                module0249.f16055(var36, module0139.$g1636$.getDynamicValue(var5));
                                                                                                if (module0430.NIL != module0173.f10955(var36) && !module0429.f30408(var36).eql(module0429.$g3494$.getGlobalValue())) {
                                                                                                    var6 = (SubLObject)ConsesLow.cons(var36, var6);
                                                                                                }
                                                                                            }
                                                                                            var35 = var35.rest();
                                                                                            var36 = var35.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0430.$ic21$, var30);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var8_19, var5);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var40_44);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var8_18, var5);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var25);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0430.FIVE_INTEGER, (SubLObject)module0430.$ic22$, (SubLObject)module0430.UNPROVIDED, (SubLObject)module0430.UNPROVIDED, (SubLObject)module0430.UNPROVIDED, (SubLObject)module0430.UNPROVIDED, (SubLObject)module0430.UNPROVIDED);
                                                    }
                                                    if (module0430.NIL != module0200.f12419(var22, module0137.f8955((SubLObject)module0430.UNPROVIDED))) {
                                                        SubLObject var37 = module0248.f15995(var22);
                                                        SubLObject var38 = (SubLObject)module0430.NIL;
                                                        var38 = var37.first();
                                                        while (module0430.NIL != var37) {
                                                            SubLObject var40;
                                                            final SubLObject var39 = var40 = var38;
                                                            SubLObject var41 = (SubLObject)module0430.NIL;
                                                            SubLObject var42 = (SubLObject)module0430.NIL;
                                                            SubLObject var43 = (SubLObject)module0430.NIL;
                                                            cdestructuring_bind.destructuring_bind_must_consp(var40, var39, (SubLObject)module0430.$ic23$);
                                                            var41 = var40.first();
                                                            var40 = var40.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var40, var39, (SubLObject)module0430.$ic23$);
                                                            var42 = var40.first();
                                                            var40 = var40.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var40, var39, (SubLObject)module0430.$ic23$);
                                                            var43 = var40.first();
                                                            var40 = var40.rest();
                                                            if (module0430.NIL == var40) {
                                                                if (module0430.NIL != module0147.f9507(var42)) {
                                                                    final SubLObject var8_20 = module0138.$g1623$.currentBinding(var5);
                                                                    try {
                                                                        module0138.$g1623$.bind(var42, var5);
                                                                        if (module0430.NIL != module0141.f9289(var43)) {
                                                                            final SubLObject var8_21 = module0138.$g1624$.currentBinding(var5);
                                                                            try {
                                                                                module0138.$g1624$.bind(var43, var5);
                                                                                final SubLObject var30;
                                                                                final SubLObject var44 = var30 = (SubLObject)ConsesLow.list(var41);
                                                                                if (module0430.NIL != module0077.f5302(var30)) {
                                                                                    final SubLObject var31 = module0077.f5333(var30);
                                                                                    SubLObject var32;
                                                                                    SubLObject var33;
                                                                                    SubLObject var34;
                                                                                    for (var32 = module0032.f1741(var31), var33 = (SubLObject)module0430.NIL, var33 = module0032.f1742(var32, var31); module0430.NIL == module0032.f1744(var32, var33); var33 = module0032.f1743(var33)) {
                                                                                        var34 = module0032.f1745(var32, var33);
                                                                                        if (module0430.NIL != module0032.f1746(var33, var34) && module0430.NIL == module0249.f16059(var34, module0139.$g1636$.getDynamicValue(var5))) {
                                                                                            module0249.f16055(var34, module0139.$g1636$.getDynamicValue(var5));
                                                                                            if (module0430.NIL != module0173.f10955(var34) && !module0429.f30408(var34).eql(module0429.$g3494$.getGlobalValue())) {
                                                                                                var6 = (SubLObject)ConsesLow.cons(var34, var6);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var30.isList()) {
                                                                                    SubLObject var53_62 = var30;
                                                                                    SubLObject var36 = (SubLObject)module0430.NIL;
                                                                                    var36 = var53_62.first();
                                                                                    while (module0430.NIL != var53_62) {
                                                                                        if (module0430.NIL == module0249.f16059(var36, module0139.$g1636$.getDynamicValue(var5))) {
                                                                                            module0249.f16055(var36, module0139.$g1636$.getDynamicValue(var5));
                                                                                            if (module0430.NIL != module0173.f10955(var36) && !module0429.f30408(var36).eql(module0429.$g3494$.getGlobalValue())) {
                                                                                                var6 = (SubLObject)ConsesLow.cons(var36, var6);
                                                                                            }
                                                                                        }
                                                                                        var53_62 = var53_62.rest();
                                                                                        var36 = var53_62.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)module0430.$ic21$, var30);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var8_21, var5);
                                                                            }
                                                                        }
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var8_20, var5);
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                cdestructuring_bind.cdestructuring_bind_error(var39, (SubLObject)module0430.$ic23$);
                                                            }
                                                            var37 = var37.rest();
                                                            var38 = var37.first();
                                                        }
                                                    }
                                                }
                                                else if (module0430.NIL != module0155.f9785(var22, (SubLObject)module0430.UNPROVIDED)) {
                                                    SubLObject var33_64;
                                                    final SubLObject var45 = var33_64 = ((module0430.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955(module0430.$ic9$)), module0141.$g1714$.getDynamicValue(var5), module0137.f8955((SubLObject)module0430.UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955(module0430.$ic9$)), module0141.$g1714$.getDynamicValue(var5), module0137.f8955((SubLObject)module0430.UNPROVIDED)));
                                                    SubLObject var46 = (SubLObject)module0430.NIL;
                                                    var46 = var33_64.first();
                                                    while (module0430.NIL != var33_64) {
                                                        final SubLObject var8_22 = module0138.$g1625$.currentBinding(var5);
                                                        try {
                                                            module0138.$g1625$.bind(var46, var5);
                                                            final SubLObject var48;
                                                            final SubLObject var47 = var48 = Functions.funcall(var46, var22);
                                                            if (module0430.NIL != module0077.f5302(var48)) {
                                                                final SubLObject var49 = module0077.f5333(var48);
                                                                SubLObject var50;
                                                                SubLObject var51;
                                                                SubLObject var52;
                                                                for (var50 = module0032.f1741(var49), var51 = (SubLObject)module0430.NIL, var51 = module0032.f1742(var50, var49); module0430.NIL == module0032.f1744(var50, var51); var51 = module0032.f1743(var51)) {
                                                                    var52 = module0032.f1745(var50, var51);
                                                                    if (module0430.NIL != module0032.f1746(var51, var52) && module0430.NIL == module0249.f16059(var52, module0139.$g1636$.getDynamicValue(var5))) {
                                                                        module0249.f16055(var52, module0139.$g1636$.getDynamicValue(var5));
                                                                        if (module0430.NIL != module0173.f10955(var52) && !module0429.f30408(var52).eql(module0429.$g3494$.getGlobalValue())) {
                                                                            var6 = (SubLObject)ConsesLow.cons(var52, var6);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            else if (var48.isList()) {
                                                                SubLObject var53 = var48;
                                                                SubLObject var54 = (SubLObject)module0430.NIL;
                                                                var54 = var53.first();
                                                                while (module0430.NIL != var53) {
                                                                    if (module0430.NIL == module0249.f16059(var54, module0139.$g1636$.getDynamicValue(var5))) {
                                                                        module0249.f16055(var54, module0139.$g1636$.getDynamicValue(var5));
                                                                        if (module0430.NIL != module0173.f10955(var54) && !module0429.f30408(var54).eql(module0429.$g3494$.getGlobalValue())) {
                                                                            var6 = (SubLObject)ConsesLow.cons(var54, var6);
                                                                        }
                                                                    }
                                                                    var53 = var53.rest();
                                                                    var54 = var53.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0430.$ic21$, var48);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var8_22, var5);
                                                        }
                                                        var33_64 = var33_64.rest();
                                                        var46 = var33_64.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var9_17, var5);
                                                module0137.$g1605$.rebind(var8_17, var5);
                                            }
                                            var20 = var20.rest();
                                            var21 = var20.first();
                                        }
                                        SubLObject var56;
                                        final SubLObject var55 = var56 = module0200.f12443(module0244.f15771(module0137.f8955(module0430.$ic9$)));
                                        SubLObject var57 = (SubLObject)module0430.NIL;
                                        var57 = var56.first();
                                        while (module0430.NIL != var56) {
                                            final SubLObject var8_23 = module0137.$g1605$.currentBinding(var5);
                                            final SubLObject var9_18 = module0141.$g1674$.currentBinding(var5);
                                            try {
                                                module0137.$g1605$.bind(var57, var5);
                                                module0141.$g1674$.bind((SubLObject)((module0430.NIL != module0141.f9205((SubLObject)module0430.UNPROVIDED, (SubLObject)module0430.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0430.NIL == module0141.$g1674$.getDynamicValue(var5)) : module0141.$g1674$.getDynamicValue(var5)), var5);
                                                final SubLObject var58 = module0228.f15229(var14_15);
                                                if (module0430.NIL != module0138.f8992(var58)) {
                                                    final SubLObject var59 = module0242.f15664(var58, module0137.f8955((SubLObject)module0430.UNPROVIDED));
                                                    if (module0430.NIL != var59) {
                                                        final SubLObject var60 = module0245.f15834(var59, module0138.f8979(), module0137.f8955((SubLObject)module0430.UNPROVIDED));
                                                        if (module0430.NIL != var60) {
                                                            SubLObject var61;
                                                            for (var61 = module0066.f4838(module0067.f4891(var60)); module0430.NIL == module0066.f4841(var61); var61 = module0066.f4840(var61)) {
                                                                var5.resetMultipleValues();
                                                                final SubLObject var62 = module0066.f4839(var61);
                                                                final SubLObject var63 = var5.secondMultipleValue();
                                                                var5.resetMultipleValues();
                                                                if (module0430.NIL != module0147.f9507(var62)) {
                                                                    final SubLObject var8_24 = module0138.$g1623$.currentBinding(var5);
                                                                    try {
                                                                        module0138.$g1623$.bind(var62, var5);
                                                                        SubLObject var40_45;
                                                                        for (var40_45 = module0066.f4838(module0067.f4891(var63)); module0430.NIL == module0066.f4841(var40_45); var40_45 = module0066.f4840(var40_45)) {
                                                                            var5.resetMultipleValues();
                                                                            final SubLObject var64 = module0066.f4839(var40_45);
                                                                            final SubLObject var65 = var5.secondMultipleValue();
                                                                            var5.resetMultipleValues();
                                                                            if (module0430.NIL != module0141.f9289(var64)) {
                                                                                final SubLObject var8_25 = module0138.$g1624$.currentBinding(var5);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var64, var5);
                                                                                    final SubLObject var66 = var65;
                                                                                    if (module0430.NIL != module0077.f5302(var66)) {
                                                                                        final SubLObject var67 = module0077.f5333(var66);
                                                                                        SubLObject var68;
                                                                                        SubLObject var69;
                                                                                        SubLObject var70;
                                                                                        for (var68 = module0032.f1741(var67), var69 = (SubLObject)module0430.NIL, var69 = module0032.f1742(var68, var67); module0430.NIL == module0032.f1744(var68, var69); var69 = module0032.f1743(var69)) {
                                                                                            var70 = module0032.f1745(var68, var69);
                                                                                            if (module0430.NIL != module0032.f1746(var69, var70) && module0430.NIL == module0249.f16059(var70, (SubLObject)module0430.UNPROVIDED)) {
                                                                                                module0249.f16055(var70, (SubLObject)module0430.UNPROVIDED);
                                                                                                module0056.f4149(var70, var13);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var66.isList()) {
                                                                                        SubLObject var71 = var66;
                                                                                        SubLObject var72 = (SubLObject)module0430.NIL;
                                                                                        var72 = var71.first();
                                                                                        while (module0430.NIL != var71) {
                                                                                            if (module0430.NIL == module0249.f16059(var72, (SubLObject)module0430.UNPROVIDED)) {
                                                                                                module0249.f16055(var72, (SubLObject)module0430.UNPROVIDED);
                                                                                                module0056.f4149(var72, var13);
                                                                                            }
                                                                                            var71 = var71.rest();
                                                                                            var72 = var71.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0430.$ic21$, var66);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var8_25, var5);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var40_45);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var8_24, var5);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var61);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0430.FIVE_INTEGER, (SubLObject)module0430.$ic22$, (SubLObject)module0430.UNPROVIDED, (SubLObject)module0430.UNPROVIDED, (SubLObject)module0430.UNPROVIDED, (SubLObject)module0430.UNPROVIDED, (SubLObject)module0430.UNPROVIDED);
                                                    }
                                                }
                                                else if (module0430.NIL != module0155.f9785(var58, (SubLObject)module0430.UNPROVIDED)) {
                                                    SubLObject var33_65;
                                                    final SubLObject var73 = var33_65 = ((module0430.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var5), module0137.f8955((SubLObject)module0430.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var5), module0137.f8955((SubLObject)module0430.UNPROVIDED)));
                                                    SubLObject var74 = (SubLObject)module0430.NIL;
                                                    var74 = var33_65.first();
                                                    while (module0430.NIL != var33_65) {
                                                        final SubLObject var8_26 = module0138.$g1625$.currentBinding(var5);
                                                        try {
                                                            module0138.$g1625$.bind(var74, var5);
                                                            final SubLObject var76;
                                                            final SubLObject var75 = var76 = Functions.funcall(var74, var58);
                                                            if (module0430.NIL != module0077.f5302(var76)) {
                                                                final SubLObject var77 = module0077.f5333(var76);
                                                                SubLObject var78;
                                                                SubLObject var79;
                                                                SubLObject var80;
                                                                for (var78 = module0032.f1741(var77), var79 = (SubLObject)module0430.NIL, var79 = module0032.f1742(var78, var77); module0430.NIL == module0032.f1744(var78, var79); var79 = module0032.f1743(var79)) {
                                                                    var80 = module0032.f1745(var78, var79);
                                                                    if (module0430.NIL != module0032.f1746(var79, var80) && module0430.NIL == module0249.f16059(var80, (SubLObject)module0430.UNPROVIDED)) {
                                                                        module0249.f16055(var80, (SubLObject)module0430.UNPROVIDED);
                                                                        module0056.f4149(var80, var13);
                                                                    }
                                                                }
                                                            }
                                                            else if (var76.isList()) {
                                                                SubLObject var81 = var76;
                                                                SubLObject var82 = (SubLObject)module0430.NIL;
                                                                var82 = var81.first();
                                                                while (module0430.NIL != var81) {
                                                                    if (module0430.NIL == module0249.f16059(var82, (SubLObject)module0430.UNPROVIDED)) {
                                                                        module0249.f16055(var82, (SubLObject)module0430.UNPROVIDED);
                                                                        module0056.f4149(var82, var13);
                                                                    }
                                                                    var81 = var81.rest();
                                                                    var82 = var81.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0430.$ic21$, var76);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var8_26, var5);
                                                        }
                                                        var33_65 = var33_65.rest();
                                                        var74 = var33_65.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var9_18, var5);
                                                module0137.$g1605$.rebind(var8_23, var5);
                                            }
                                            var56 = var56.rest();
                                            var57 = var56.first();
                                        }
                                        var14_15 = module0056.f4150(var13);
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var10_26, var5);
                                    module0138.$g1619$.rebind(var9_16, var5);
                                    module0141.$g1677$.rebind(var8_16, var5);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)module0430.TWO_INTEGER, (SubLObject)module0430.$ic24$, var11, module0244.f15748(module0137.f8955((SubLObject)module0430.UNPROVIDED)), (SubLObject)module0430.UNPROVIDED, (SubLObject)module0430.UNPROVIDED, (SubLObject)module0430.UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var17, var5);
                            module0141.$g1674$.rebind(var16, var5);
                            module0141.$g1672$.rebind(var10_25, var5);
                            module0141.$g1671$.rebind(var9_15, var5);
                            module0141.$g1670$.rebind(var8_15, var5);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var9_14, var5);
                        module0141.$g1714$.rebind(var8_14, var5);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var5));
                }
                finally {
                    module0139.$g1635$.rebind(var8_13, var5);
                }
                module0139.f9011(module0139.$g1636$.getDynamicValue(var5));
            }
            finally {
                module0139.$g1636$.rebind(var9_13, var5);
                module0137.$g1605$.rebind(var8_12, var5);
            }
        }
        finally {
            module0147.$g2096$.rebind(var10, var5);
            module0147.$g2094$.rebind(var9, var5);
            module0147.$g2095$.rebind(var8, var5);
        }
        return Sequences.nreverse(var6);
    }
    
    public static SubLObject f30437() {
        SubLObject var3 = module0430.$g3506$.getGlobalValue();
        if (module0430.NIL == var3) {
            var3 = module0034.f1934((SubLObject)module0430.$ic8$, (SubLObject)module0430.$ic25$, (SubLObject)module0430.NIL, (SubLObject)module0430.EQ, (SubLObject)module0430.ZERO_INTEGER, (SubLObject)module0430.ZERO_INTEGER);
        }
        SubLObject var4 = module0034.f1810(var3, (SubLObject)module0430.UNPROVIDED);
        if (var4 == module0430.$ic4$) {
            var4 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f30436()));
            module0034.f1812(var3, var4, (SubLObject)module0430.UNPROVIDED);
        }
        return module0034.f1959(var4);
    }
    
    public static SubLObject f30438() {
        f30426();
        f30430();
        f30434();
        return (SubLObject)module0430.NIL;
    }
    
    public static SubLObject f30439() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0430", "f30426", "S#33663", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0430", "f30427", "S#33664", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0430", "f30428", "S#33665", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0430", "f30429", "S#33603", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0430", "f30430", "S#33666", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0430", "f30431", "S#33667", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0430", "f30432", "S#33668", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0430", "f30433", "S#33604", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0430", "f30434", "S#33669", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0430", "f30435", "S#33670", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0430", "f30436", "S#33671", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0430", "f30437", "S#33602", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0430", "f30438", "S#33672", 0, 0, false);
        return (SubLObject)module0430.NIL;
    }
    
    public static SubLObject f30440() {
        module0430.$g3504$ = SubLFiles.deflexical("S#33673", (SubLObject)module0430.NIL);
        module0430.$g3505$ = SubLFiles.deflexical("S#33674", (SubLObject)module0430.NIL);
        module0430.$g3506$ = SubLFiles.deflexical("S#33675", (SubLObject)module0430.NIL);
        return (SubLObject)module0430.NIL;
    }
    
    public static SubLObject f30441() {
        module0034.f1909((SubLObject)module0430.$ic0$);
        module0034.f1909((SubLObject)module0430.$ic5$);
        module0034.f1909((SubLObject)module0430.$ic8$);
        return (SubLObject)module0430.NIL;
    }
    
    public void declareFunctions() {
        f30439();
    }
    
    public void initializeVariables() {
        f30440();
    }
    
    public void runTopLevelForms() {
        f30441();
    }
    
    static {
        me = (SubLFile)new module0430();
        module0430.$g3504$ = null;
        module0430.$g3505$ = null;
        module0430.$g3506$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#33603", "CYC");
        $ic1$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("SpecsFn"));
        $ic2$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic3$ = SubLObjectFactory.makeSymbol("S#33673", "CYC");
        $ic4$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic5$ = SubLObjectFactory.makeSymbol("S#33604", "CYC");
        $ic6$ = SubLObjectFactory.makeSymbol("S#33645", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#33674", "CYC");
        $ic8$ = SubLObjectFactory.makeSymbol("S#33602", "CYC");
        $ic9$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic10$ = SubLObjectFactory.makeKeyword("BREADTH");
        $ic11$ = SubLObjectFactory.makeKeyword("QUEUE");
        $ic12$ = SubLObjectFactory.makeKeyword("STACK");
        $ic13$ = SubLObjectFactory.makeSymbol("S#11450", "CYC");
        $ic14$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic15$ = SubLObjectFactory.makeString("~A is not a ~A");
        $ic16$ = SubLObjectFactory.makeSymbol("S#11592", "CYC");
        $ic17$ = SubLObjectFactory.makeKeyword("CERROR");
        $ic18$ = SubLObjectFactory.makeString("continue anyway");
        $ic19$ = SubLObjectFactory.makeKeyword("WARN");
        $ic20$ = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic21$ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $ic22$ = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic23$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("US#4D5E436"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#1526883"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#15AA083"));
        $ic24$ = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic25$ = SubLObjectFactory.makeSymbol("S#33675", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0430.class
	Total time: 840 ms
	
	Decompiled with Procyon 0.5.32.
*/