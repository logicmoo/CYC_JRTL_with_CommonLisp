package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0481 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0481";
    public static final String myFingerPrint = "6401bd338e5210a70c84ed3cf12131ae1ef3e48c9fcbc595dd787b85d9bc8bc4";
    public static SubLSymbol $g3697$;
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLObject $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLString $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLString $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLString $ic23$;
    private static final SubLObject $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLString $ic27$;
    private static final SubLString $ic28$;
    private static final SubLString $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLList $ic31$;
    private static final SubLList $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLList $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLList $ic37$;
    private static final SubLList $ic38$;
    private static final SubLList $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLObject $ic51$;
    
    public static SubLObject f31822(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic1$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic1$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic1$);
        var7 = var4.first();
        var4 = var4.rest();
        final SubLObject var8 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic1$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var9;
            var4 = (var9 = var5);
            final SubLObject var10 = (SubLObject)$ic2$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, var7), (SubLObject)ConsesLow.list((SubLObject)$ic5$, (SubLObject)ConsesLow.list(var10, $ic6$, (SubLObject)NIL, (SubLObject)NIL, var8), (SubLObject)ConsesLow.listS((SubLObject)$ic7$, (SubLObject)ConsesLow.list(new SubLObject[] { var6, var7, $ic8$, TWO_INTEGER, $ic9$, var10, $ic10$, $ic11$, $ic12$, var8 }), ConsesLow.append(var9, (SubLObject)NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic1$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31823(final SubLObject var11, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        final SubLObject var13 = f31824(var11);
        if (NIL != var13) {
            final SubLObject var14 = f31825(var11);
            module0347.f23330(var14, var13, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31826(final SubLObject var11, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        final SubLThread var13 = SubLProcess.currentSubLThread();
        SubLObject var14 = (SubLObject)NIL;
        if (NIL != $g3697$.getGlobalValue()) {
            final SubLObject var15 = module0205.f13333(var11);
            if (NIL != module0212.f13762(var15) && NIL == var14) {
                final SubLObject var16 = $ic6$;
                final SubLObject var17 = (SubLObject)$ic15$;
                final SubLObject var18 = module0056.f4145(var17);
                SubLObject var19 = (SubLObject)NIL;
                final SubLObject var20 = module0139.$g1635$.currentBinding(var13);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var13);
                    final SubLObject var21 = (SubLObject)NIL;
                    final SubLObject var22_24 = module0141.$g1714$.currentBinding(var13);
                    final SubLObject var22 = module0141.$g1715$.currentBinding(var13);
                    try {
                        module0141.$g1714$.bind((NIL != var21) ? var21 : module0141.f9283(), var13);
                        module0141.$g1715$.bind((SubLObject)((NIL != var21) ? $ic16$ : module0141.$g1715$.getDynamicValue(var13)), var13);
                        if (NIL != var21 && NIL != module0136.f8864() && NIL == module0141.f9279(var21)) {
                            final SubLObject var23 = module0136.$g1591$.getDynamicValue(var13);
                            if (var23.eql((SubLObject)$ic17$)) {
                                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic18$, var21, (SubLObject)$ic19$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var23.eql((SubLObject)$ic20$)) {
                                module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic21$, (SubLObject)$ic18$, var21, (SubLObject)$ic19$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var23.eql((SubLObject)$ic22$)) {
                                Errors.warn((SubLObject)$ic18$, var21, (SubLObject)$ic19$);
                            }
                            else {
                                Errors.warn((SubLObject)$ic23$, module0136.$g1591$.getDynamicValue(var13));
                                Errors.cerror((SubLObject)$ic21$, (SubLObject)$ic18$, var21, (SubLObject)$ic19$);
                            }
                        }
                        final SubLObject var22_25 = module0141.$g1670$.currentBinding(var13);
                        final SubLObject var25_28 = module0141.$g1671$.currentBinding(var13);
                        final SubLObject var24 = module0141.$g1672$.currentBinding(var13);
                        final SubLObject var25 = module0141.$g1674$.currentBinding(var13);
                        final SubLObject var26 = module0137.$g1605$.currentBinding(var13);
                        try {
                            module0141.$g1670$.bind(module0137.f8955($ic24$), var13);
                            module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic24$)), var13);
                            module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic24$)), var13);
                            module0141.$g1674$.bind((SubLObject)NIL, var13);
                            module0137.$g1605$.bind(module0137.f8955($ic24$), var13);
                            if (NIL != module0136.f8865() || NIL != module0244.f15795($ic6$, module0137.f8955((SubLObject)UNPROVIDED))) {
                                final SubLObject var22_26 = module0141.$g1677$.currentBinding(var13);
                                final SubLObject var25_29 = module0138.$g1619$.currentBinding(var13);
                                final SubLObject var29_34 = module0141.$g1674$.currentBinding(var13);
                                try {
                                    module0141.$g1677$.bind(module0141.f9210(), var13);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955($ic24$)), var13);
                                    module0141.$g1674$.bind((SubLObject)NIL, var13);
                                    module0249.f16055(var16, (SubLObject)UNPROVIDED);
                                    for (var19 = (SubLObject)ConsesLow.list($ic6$, module0141.f9195()); NIL != var19 && NIL == var14; var19 = module0056.f4150(var18)) {
                                        final SubLObject var18_35 = var19.first();
                                        final SubLObject var27 = conses_high.second(var19);
                                        final SubLObject var28 = var18_35;
                                        final SubLObject var22_27 = module0141.$g1674$.currentBinding(var13);
                                        try {
                                            module0141.$g1674$.bind(var27, var13);
                                            if (NIL != module0250.f16115(module0141.f9190(), var18_35)) {
                                                final SubLObject var29 = var28;
                                                if (NIL != module0158.f10010(var15, (SubLObject)TWO_INTEGER, var29)) {
                                                    final SubLObject var30 = module0158.f10011(var15, (SubLObject)TWO_INTEGER, var29);
                                                    SubLObject var31 = var14;
                                                    final SubLObject var32 = (SubLObject)NIL;
                                                    while (NIL == var31) {
                                                        final SubLObject var33 = module0052.f3695(var30, var32);
                                                        final SubLObject var34 = (SubLObject)makeBoolean(!var32.eql(var33));
                                                        if (NIL != var34) {
                                                            SubLObject var35 = (SubLObject)NIL;
                                                            try {
                                                                var35 = module0158.f10316(var33, (SubLObject)$ic25$, (SubLObject)$ic11$, (SubLObject)NIL);
                                                                SubLObject var41_46 = var14;
                                                                final SubLObject var42_47 = (SubLObject)NIL;
                                                                while (NIL == var41_46) {
                                                                    final SubLObject var36 = module0052.f3695(var35, var42_47);
                                                                    final SubLObject var44_48 = (SubLObject)makeBoolean(!var42_47.eql(var36));
                                                                    if (NIL != var44_48) {
                                                                        SubLObject var37 = (SubLObject)NIL;
                                                                        final SubLObject var38 = module0178.f11336(var36);
                                                                        SubLObject var39 = (SubLObject)ZERO_INTEGER;
                                                                        final SubLObject var40 = module0205.f13207(var11, (SubLObject)$ic26$);
                                                                        SubLObject var41;
                                                                        SubLObject var42;
                                                                        for (var41 = (SubLObject)NIL, var41 = var40; NIL == var37 && NIL != var41; var41 = var41.rest()) {
                                                                            var42 = var41.first();
                                                                            var39 = Numbers.add(var39, (SubLObject)ONE_INTEGER);
                                                                            if (var39.eql(var38)) {
                                                                                var37 = (SubLObject)makeBoolean(NIL == module0193.f12105(var42) || (NIL == module0167.f10813(var42) && NIL == module0210.f13576(var42, (SubLObject)UNPROVIDED)));
                                                                            }
                                                                            else {
                                                                                var37 = (SubLObject)makeBoolean(NIL == module0193.f12105(var42));
                                                                            }
                                                                        }
                                                                        if (NIL == var37) {
                                                                            var14 = (SubLObject)T;
                                                                        }
                                                                    }
                                                                    var41_46 = (SubLObject)makeBoolean(NIL == var44_48 || NIL != var14);
                                                                }
                                                            }
                                                            finally {
                                                                final SubLObject var22_28 = Threads.$is_thread_performing_cleanupP$.currentBinding(var13);
                                                                try {
                                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var13);
                                                                    if (NIL != var35) {
                                                                        module0158.f10319(var35);
                                                                    }
                                                                }
                                                                finally {
                                                                    Threads.$is_thread_performing_cleanupP$.rebind(var22_28, var13);
                                                                }
                                                            }
                                                        }
                                                        var31 = (SubLObject)makeBoolean(NIL == var34 || NIL != var14);
                                                    }
                                                }
                                            }
                                            final SubLObject var43 = module0200.f12443(module0137.f8955($ic24$));
                                            SubLObject var44;
                                            SubLObject var45;
                                            SubLObject var22_29;
                                            SubLObject var25_30;
                                            SubLObject var46;
                                            SubLObject var47;
                                            SubLObject var48;
                                            SubLObject var49;
                                            SubLObject var50;
                                            SubLObject var51;
                                            SubLObject var22_30;
                                            SubLObject var63_67;
                                            SubLObject var52;
                                            SubLObject var53;
                                            SubLObject var22_31;
                                            SubLObject var54;
                                            SubLObject var55;
                                            SubLObject var56;
                                            SubLObject var57;
                                            SubLObject var58;
                                            SubLObject var59;
                                            SubLObject var60;
                                            SubLObject var61;
                                            SubLObject var53_78;
                                            SubLObject var62;
                                            SubLObject var22_32;
                                            SubLObject var64;
                                            SubLObject var63;
                                            SubLObject var65;
                                            SubLObject var66;
                                            SubLObject var67;
                                            SubLObject var68;
                                            SubLObject var69;
                                            SubLObject var70;
                                            for (var44 = (SubLObject)NIL, var44 = var43; NIL == var14 && NIL != var44; var44 = var44.rest()) {
                                                var45 = var44.first();
                                                var22_29 = module0137.$g1605$.currentBinding(var13);
                                                var25_30 = module0141.$g1674$.currentBinding(var13);
                                                try {
                                                    module0137.$g1605$.bind(var45, var13);
                                                    module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var13)) : module0141.$g1674$.getDynamicValue(var13)), var13);
                                                    var46 = module0228.f15229(var18_35);
                                                    if (NIL != module0138.f8992(var46)) {
                                                        var47 = module0242.f15664(var46, module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var47) {
                                                            var48 = module0245.f15834(var47, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                            if (NIL != var48) {
                                                                for (var49 = module0066.f4838(module0067.f4891(var48)); NIL == var14 && NIL == module0066.f4841(var49); var49 = module0066.f4840(var49)) {
                                                                    var13.resetMultipleValues();
                                                                    var50 = module0066.f4839(var49);
                                                                    var51 = var13.secondMultipleValue();
                                                                    var13.resetMultipleValues();
                                                                    if (NIL != module0147.f9507(var50)) {
                                                                        var22_30 = module0138.$g1623$.currentBinding(var13);
                                                                        try {
                                                                            module0138.$g1623$.bind(var50, var13);
                                                                            for (var63_67 = module0066.f4838(module0067.f4891(var51)); NIL == var14 && NIL == module0066.f4841(var63_67); var63_67 = module0066.f4840(var63_67)) {
                                                                                var13.resetMultipleValues();
                                                                                var52 = module0066.f4839(var63_67);
                                                                                var53 = var13.secondMultipleValue();
                                                                                var13.resetMultipleValues();
                                                                                if (NIL != module0141.f9289(var52)) {
                                                                                    var22_31 = module0138.$g1624$.currentBinding(var13);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var52, var13);
                                                                                        var54 = var53;
                                                                                        if (NIL != module0077.f5302(var54)) {
                                                                                            var55 = module0077.f5333(var54);
                                                                                            for (var56 = module0032.f1741(var55), var57 = (SubLObject)NIL, var57 = module0032.f1742(var56, var55); NIL == var14 && NIL == module0032.f1744(var56, var57); var57 = module0032.f1743(var57)) {
                                                                                                var58 = module0032.f1745(var56, var57);
                                                                                                if (NIL != module0032.f1746(var57, var58) && NIL == module0249.f16059(var58, (SubLObject)UNPROVIDED)) {
                                                                                                    module0249.f16055(var58, (SubLObject)UNPROVIDED);
                                                                                                    module0056.f4149((SubLObject)ConsesLow.list(var58, module0141.f9195()), var18);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var54.isList()) {
                                                                                            if (NIL == var14) {
                                                                                                var59 = var54;
                                                                                                var60 = (SubLObject)NIL;
                                                                                                var60 = var59.first();
                                                                                                while (NIL == var14 && NIL != var59) {
                                                                                                    if (NIL == module0249.f16059(var60, (SubLObject)UNPROVIDED)) {
                                                                                                        module0249.f16055(var60, (SubLObject)UNPROVIDED);
                                                                                                        module0056.f4149((SubLObject)ConsesLow.list(var60, module0141.f9195()), var18);
                                                                                                    }
                                                                                                    var59 = var59.rest();
                                                                                                    var60 = var59.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)$ic27$, var54);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var22_31, var13);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var63_67);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var22_30, var13);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var49);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic28$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                        }
                                                    }
                                                    else if (NIL != module0155.f9785(var46, (SubLObject)UNPROVIDED)) {
                                                        var61 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var13), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var13), module0137.f8955((SubLObject)UNPROVIDED)));
                                                        for (var53_78 = (SubLObject)NIL, var53_78 = var61; NIL == var14 && NIL != var53_78; var53_78 = var53_78.rest()) {
                                                            var62 = var53_78.first();
                                                            var22_32 = module0138.$g1625$.currentBinding(var13);
                                                            try {
                                                                module0138.$g1625$.bind(var62, var13);
                                                                var63 = (var64 = Functions.funcall(var62, var46));
                                                                if (NIL != module0077.f5302(var64)) {
                                                                    var65 = module0077.f5333(var64);
                                                                    for (var66 = module0032.f1741(var65), var67 = (SubLObject)NIL, var67 = module0032.f1742(var66, var65); NIL == var14 && NIL == module0032.f1744(var66, var67); var67 = module0032.f1743(var67)) {
                                                                        var68 = module0032.f1745(var66, var67);
                                                                        if (NIL != module0032.f1746(var67, var68) && NIL == module0249.f16059(var68, (SubLObject)UNPROVIDED)) {
                                                                            module0249.f16055(var68, (SubLObject)UNPROVIDED);
                                                                            module0056.f4149((SubLObject)ConsesLow.list(var68, module0141.f9195()), var18);
                                                                        }
                                                                    }
                                                                }
                                                                else if (var64.isList()) {
                                                                    if (NIL == var14) {
                                                                        var69 = var64;
                                                                        var70 = (SubLObject)NIL;
                                                                        var70 = var69.first();
                                                                        while (NIL == var14 && NIL != var69) {
                                                                            if (NIL == module0249.f16059(var70, (SubLObject)UNPROVIDED)) {
                                                                                module0249.f16055(var70, (SubLObject)UNPROVIDED);
                                                                                module0056.f4149((SubLObject)ConsesLow.list(var70, module0141.f9195()), var18);
                                                                            }
                                                                            var69 = var69.rest();
                                                                            var70 = var69.first();
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)$ic27$, var64);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var22_32, var13);
                                                            }
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var25_30, var13);
                                                    module0137.$g1605$.rebind(var22_29, var13);
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var22_27, var13);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var29_34, var13);
                                    module0138.$g1619$.rebind(var25_29, var13);
                                    module0141.$g1677$.rebind(var22_26, var13);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic29$, $ic6$, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var26, var13);
                            module0141.$g1674$.rebind(var25, var13);
                            module0141.$g1672$.rebind(var24, var13);
                            module0141.$g1671$.rebind(var25_28, var13);
                            module0141.$g1670$.rebind(var22_25, var13);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var22, var13);
                        module0141.$g1714$.rebind(var22_24, var13);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var13));
                }
                finally {
                    module0139.$g1635$.rebind(var20, var13);
                }
            }
        }
        return var14;
    }
    
    public static SubLObject f31827(final SubLObject var11, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        final SubLThread var13 = SubLProcess.currentSubLThread();
        if (NIL != module0212.f13762(module0205.f13132(var11))) {
            final SubLObject var14 = $ic6$;
            final SubLObject var15 = (SubLObject)$ic15$;
            final SubLObject var16 = module0056.f4145(var15);
            SubLObject var17 = (SubLObject)NIL;
            final SubLObject var18 = module0139.$g1635$.currentBinding(var13);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var13);
                final SubLObject var19 = (SubLObject)NIL;
                final SubLObject var22_81 = module0141.$g1714$.currentBinding(var13);
                final SubLObject var20 = module0141.$g1715$.currentBinding(var13);
                try {
                    module0141.$g1714$.bind((NIL != var19) ? var19 : module0141.f9283(), var13);
                    module0141.$g1715$.bind((SubLObject)((NIL != var19) ? $ic16$ : module0141.$g1715$.getDynamicValue(var13)), var13);
                    if (NIL != var19 && NIL != module0136.f8864() && NIL == module0141.f9279(var19)) {
                        final SubLObject var21 = module0136.$g1591$.getDynamicValue(var13);
                        if (var21.eql((SubLObject)$ic17$)) {
                            module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic18$, var19, (SubLObject)$ic19$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        else if (var21.eql((SubLObject)$ic20$)) {
                            module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic21$, (SubLObject)$ic18$, var19, (SubLObject)$ic19$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        else if (var21.eql((SubLObject)$ic22$)) {
                            Errors.warn((SubLObject)$ic18$, var19, (SubLObject)$ic19$);
                        }
                        else {
                            Errors.warn((SubLObject)$ic23$, module0136.$g1591$.getDynamicValue(var13));
                            Errors.cerror((SubLObject)$ic21$, (SubLObject)$ic18$, var19, (SubLObject)$ic19$);
                        }
                    }
                    final SubLObject var22_82 = module0141.$g1670$.currentBinding(var13);
                    final SubLObject var25_83 = module0141.$g1671$.currentBinding(var13);
                    final SubLObject var22 = module0141.$g1672$.currentBinding(var13);
                    final SubLObject var23 = module0141.$g1674$.currentBinding(var13);
                    final SubLObject var24 = module0137.$g1605$.currentBinding(var13);
                    try {
                        module0141.$g1670$.bind(module0137.f8955($ic24$), var13);
                        module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic24$)), var13);
                        module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic24$)), var13);
                        module0141.$g1674$.bind((SubLObject)NIL, var13);
                        module0137.$g1605$.bind(module0137.f8955($ic24$), var13);
                        if (NIL != module0136.f8865() || NIL != module0244.f15795($ic6$, module0137.f8955((SubLObject)UNPROVIDED))) {
                            final SubLObject var22_83 = module0141.$g1677$.currentBinding(var13);
                            final SubLObject var25_84 = module0138.$g1619$.currentBinding(var13);
                            final SubLObject var29_86 = module0141.$g1674$.currentBinding(var13);
                            try {
                                module0141.$g1677$.bind(module0141.f9210(), var13);
                                module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955($ic24$)), var13);
                                module0141.$g1674$.bind((SubLObject)NIL, var13);
                                module0249.f16055(var14, (SubLObject)UNPROVIDED);
                                for (var17 = (SubLObject)ConsesLow.list($ic6$, module0141.f9195()); NIL != var17; var17 = module0056.f4150(var16)) {
                                    final SubLObject var18_87 = var17.first();
                                    final SubLObject var25 = conses_high.second(var17);
                                    final SubLObject var26 = var18_87;
                                    final SubLObject var22_84 = module0141.$g1674$.currentBinding(var13);
                                    try {
                                        module0141.$g1674$.bind(var25, var13);
                                        if (NIL != module0250.f16115(module0141.f9190(), var18_87)) {
                                            final SubLObject var27 = var26;
                                            if (NIL != module0158.f10010(module0205.f13132(var11), (SubLObject)TWO_INTEGER, var27)) {
                                                final SubLObject var28 = module0158.f10011(module0205.f13132(var11), (SubLObject)TWO_INTEGER, var27);
                                                SubLObject var29 = (SubLObject)NIL;
                                                final SubLObject var30 = (SubLObject)NIL;
                                                while (NIL == var29) {
                                                    final SubLObject var31 = module0052.f3695(var28, var30);
                                                    final SubLObject var32 = (SubLObject)makeBoolean(!var30.eql(var31));
                                                    if (NIL != var32) {
                                                        SubLObject var33 = (SubLObject)NIL;
                                                        try {
                                                            var33 = module0158.f10316(var31, (SubLObject)$ic25$, (SubLObject)$ic11$, (SubLObject)NIL);
                                                            SubLObject var41_89 = (SubLObject)NIL;
                                                            final SubLObject var42_90 = (SubLObject)NIL;
                                                            while (NIL == var41_89) {
                                                                final SubLObject var34 = module0052.f3695(var33, var42_90);
                                                                final SubLObject var44_91 = (SubLObject)makeBoolean(!var42_90.eql(var34));
                                                                if (NIL != var44_91) {
                                                                    SubLObject var36;
                                                                    final SubLObject var35 = var36 = module0178.f11330(var34);
                                                                    SubLObject var37 = (SubLObject)NIL;
                                                                    SubLObject var38 = (SubLObject)NIL;
                                                                    SubLObject var39 = (SubLObject)NIL;
                                                                    cdestructuring_bind.destructuring_bind_must_consp(var36, var35, (SubLObject)$ic32$);
                                                                    var37 = var36.first();
                                                                    var36 = var36.rest();
                                                                    cdestructuring_bind.destructuring_bind_must_consp(var36, var35, (SubLObject)$ic32$);
                                                                    var38 = var36.first();
                                                                    var36 = var36.rest();
                                                                    cdestructuring_bind.destructuring_bind_must_consp(var36, var35, (SubLObject)$ic32$);
                                                                    var39 = var36.first();
                                                                    var36 = var36.rest();
                                                                    if (NIL == var36) {
                                                                        final SubLObject var40 = module0202.f12683(var37, module0035.f2131(module0048.f_1_(var39), module0205.f13207(var11, (SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED);
                                                                        if (NIL != module0274.f18172(var40, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                                                            final SubLObject var41 = module0285.f18993(var40, (SubLObject)UNPROVIDED);
                                                                            final SubLObject var42 = module0205.f13134(var11, var39, (SubLObject)UNPROVIDED);
                                                                            var13.resetMultipleValues();
                                                                            final SubLObject var43 = module0235.f15474(var42, var41, (SubLObject)T, (SubLObject)T);
                                                                            final SubLObject var44 = var13.secondMultipleValue();
                                                                            var13.resetMultipleValues();
                                                                            if (NIL != var43) {
                                                                                final SubLObject var45 = module0202.f12817(var39, var41, var11);
                                                                                final SubLObject var46 = f31825(var45);
                                                                                module0347.f23330(var46, var43, var44);
                                                                            }
                                                                        }
                                                                    }
                                                                    else {
                                                                        cdestructuring_bind.cdestructuring_bind_error(var35, (SubLObject)$ic32$);
                                                                    }
                                                                }
                                                                var41_89 = (SubLObject)makeBoolean(NIL == var44_91);
                                                            }
                                                        }
                                                        finally {
                                                            final SubLObject var22_85 = Threads.$is_thread_performing_cleanupP$.currentBinding(var13);
                                                            try {
                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var13);
                                                                if (NIL != var33) {
                                                                    module0158.f10319(var33);
                                                                }
                                                            }
                                                            finally {
                                                                Threads.$is_thread_performing_cleanupP$.rebind(var22_85, var13);
                                                            }
                                                        }
                                                    }
                                                    var29 = (SubLObject)makeBoolean(NIL == var32);
                                                }
                                            }
                                        }
                                        SubLObject var48;
                                        final SubLObject var47 = var48 = module0200.f12443(module0137.f8955($ic24$));
                                        SubLObject var49 = (SubLObject)NIL;
                                        var49 = var48.first();
                                        while (NIL != var48) {
                                            final SubLObject var22_86 = module0137.$g1605$.currentBinding(var13);
                                            final SubLObject var25_85 = module0141.$g1674$.currentBinding(var13);
                                            try {
                                                module0137.$g1605$.bind(var49, var13);
                                                module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var13)) : module0141.$g1674$.getDynamicValue(var13)), var13);
                                                final SubLObject var50 = module0228.f15229(var18_87);
                                                if (NIL != module0138.f8992(var50)) {
                                                    final SubLObject var51 = module0242.f15664(var50, module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var51) {
                                                        final SubLObject var52 = module0245.f15834(var51, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var52) {
                                                            SubLObject var53;
                                                            for (var53 = module0066.f4838(module0067.f4891(var52)); NIL == module0066.f4841(var53); var53 = module0066.f4840(var53)) {
                                                                var13.resetMultipleValues();
                                                                final SubLObject var54 = module0066.f4839(var53);
                                                                final SubLObject var55 = var13.secondMultipleValue();
                                                                var13.resetMultipleValues();
                                                                if (NIL != module0147.f9507(var54)) {
                                                                    final SubLObject var22_87 = module0138.$g1623$.currentBinding(var13);
                                                                    try {
                                                                        module0138.$g1623$.bind(var54, var13);
                                                                        SubLObject var63_104;
                                                                        for (var63_104 = module0066.f4838(module0067.f4891(var55)); NIL == module0066.f4841(var63_104); var63_104 = module0066.f4840(var63_104)) {
                                                                            var13.resetMultipleValues();
                                                                            final SubLObject var56 = module0066.f4839(var63_104);
                                                                            final SubLObject var57 = var13.secondMultipleValue();
                                                                            var13.resetMultipleValues();
                                                                            if (NIL != module0141.f9289(var56)) {
                                                                                final SubLObject var22_88 = module0138.$g1624$.currentBinding(var13);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var56, var13);
                                                                                    final SubLObject var58 = var57;
                                                                                    if (NIL != module0077.f5302(var58)) {
                                                                                        final SubLObject var59 = module0077.f5333(var58);
                                                                                        SubLObject var60;
                                                                                        SubLObject var61;
                                                                                        SubLObject var62;
                                                                                        for (var60 = module0032.f1741(var59), var61 = (SubLObject)NIL, var61 = module0032.f1742(var60, var59); NIL == module0032.f1744(var60, var61); var61 = module0032.f1743(var61)) {
                                                                                            var62 = module0032.f1745(var60, var61);
                                                                                            if (NIL != module0032.f1746(var61, var62) && NIL == module0249.f16059(var62, (SubLObject)UNPROVIDED)) {
                                                                                                module0249.f16055(var62, (SubLObject)UNPROVIDED);
                                                                                                module0056.f4149((SubLObject)ConsesLow.list(var62, module0141.f9195()), var16);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var58.isList()) {
                                                                                        SubLObject var63 = var58;
                                                                                        SubLObject var64 = (SubLObject)NIL;
                                                                                        var64 = var63.first();
                                                                                        while (NIL != var63) {
                                                                                            if (NIL == module0249.f16059(var64, (SubLObject)UNPROVIDED)) {
                                                                                                module0249.f16055(var64, (SubLObject)UNPROVIDED);
                                                                                                module0056.f4149((SubLObject)ConsesLow.list(var64, module0141.f9195()), var16);
                                                                                            }
                                                                                            var63 = var63.rest();
                                                                                            var64 = var63.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)$ic27$, var58);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var22_88, var13);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var63_104);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var22_87, var13);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var53);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic28$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                    }
                                                }
                                                else if (NIL != module0155.f9785(var50, (SubLObject)UNPROVIDED)) {
                                                    SubLObject var100_106;
                                                    final SubLObject var65 = var100_106 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var13), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var13), module0137.f8955((SubLObject)UNPROVIDED)));
                                                    SubLObject var66 = (SubLObject)NIL;
                                                    var66 = var100_106.first();
                                                    while (NIL != var100_106) {
                                                        final SubLObject var22_89 = module0138.$g1625$.currentBinding(var13);
                                                        try {
                                                            module0138.$g1625$.bind(var66, var13);
                                                            final SubLObject var68;
                                                            final SubLObject var67 = var68 = Functions.funcall(var66, var50);
                                                            if (NIL != module0077.f5302(var68)) {
                                                                final SubLObject var69 = module0077.f5333(var68);
                                                                SubLObject var70;
                                                                SubLObject var71;
                                                                SubLObject var72;
                                                                for (var70 = module0032.f1741(var69), var71 = (SubLObject)NIL, var71 = module0032.f1742(var70, var69); NIL == module0032.f1744(var70, var71); var71 = module0032.f1743(var71)) {
                                                                    var72 = module0032.f1745(var70, var71);
                                                                    if (NIL != module0032.f1746(var71, var72) && NIL == module0249.f16059(var72, (SubLObject)UNPROVIDED)) {
                                                                        module0249.f16055(var72, (SubLObject)UNPROVIDED);
                                                                        module0056.f4149((SubLObject)ConsesLow.list(var72, module0141.f9195()), var16);
                                                                    }
                                                                }
                                                            }
                                                            else if (var68.isList()) {
                                                                SubLObject var73 = var68;
                                                                SubLObject var74 = (SubLObject)NIL;
                                                                var74 = var73.first();
                                                                while (NIL != var73) {
                                                                    if (NIL == module0249.f16059(var74, (SubLObject)UNPROVIDED)) {
                                                                        module0249.f16055(var74, (SubLObject)UNPROVIDED);
                                                                        module0056.f4149((SubLObject)ConsesLow.list(var74, module0141.f9195()), var16);
                                                                    }
                                                                    var73 = var73.rest();
                                                                    var74 = var73.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)$ic27$, var68);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var22_89, var13);
                                                        }
                                                        var100_106 = var100_106.rest();
                                                        var66 = var100_106.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var25_85, var13);
                                                module0137.$g1605$.rebind(var22_86, var13);
                                            }
                                            var48 = var48.rest();
                                            var49 = var48.first();
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var22_84, var13);
                                    }
                                }
                            }
                            finally {
                                module0141.$g1674$.rebind(var29_86, var13);
                                module0138.$g1619$.rebind(var25_84, var13);
                                module0141.$g1677$.rebind(var22_83, var13);
                            }
                        }
                        else {
                            module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic29$, $ic6$, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                    }
                    finally {
                        module0137.$g1605$.rebind(var24, var13);
                        module0141.$g1674$.rebind(var23, var13);
                        module0141.$g1672$.rebind(var22, var13);
                        module0141.$g1671$.rebind(var25_83, var13);
                        module0141.$g1670$.rebind(var22_82, var13);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var20, var13);
                    module0141.$g1714$.rebind(var22_81, var13);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var13));
            }
            finally {
                module0139.$g1635$.rebind(var18, var13);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31828(final SubLObject var11, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        final SubLThread var13 = SubLProcess.currentSubLThread();
        SubLObject var14 = (SubLObject)NIL;
        if (NIL != $g3697$.getGlobalValue()) {
            final SubLObject var15 = module0205.f13333(var11);
            if (NIL != module0212.f13762(var15) && NIL == var14) {
                final SubLObject var16 = $ic6$;
                final SubLObject var17 = (SubLObject)$ic15$;
                final SubLObject var18 = module0056.f4145(var17);
                SubLObject var19 = (SubLObject)NIL;
                final SubLObject var20 = module0139.$g1635$.currentBinding(var13);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var13);
                    final SubLObject var21 = (SubLObject)NIL;
                    final SubLObject var22_108 = module0141.$g1714$.currentBinding(var13);
                    final SubLObject var22 = module0141.$g1715$.currentBinding(var13);
                    try {
                        module0141.$g1714$.bind((NIL != var21) ? var21 : module0141.f9283(), var13);
                        module0141.$g1715$.bind((SubLObject)((NIL != var21) ? $ic16$ : module0141.$g1715$.getDynamicValue(var13)), var13);
                        if (NIL != var21 && NIL != module0136.f8864() && NIL == module0141.f9279(var21)) {
                            final SubLObject var23 = module0136.$g1591$.getDynamicValue(var13);
                            if (var23.eql((SubLObject)$ic17$)) {
                                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic18$, var21, (SubLObject)$ic19$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var23.eql((SubLObject)$ic20$)) {
                                module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic21$, (SubLObject)$ic18$, var21, (SubLObject)$ic19$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var23.eql((SubLObject)$ic22$)) {
                                Errors.warn((SubLObject)$ic18$, var21, (SubLObject)$ic19$);
                            }
                            else {
                                Errors.warn((SubLObject)$ic23$, module0136.$g1591$.getDynamicValue(var13));
                                Errors.cerror((SubLObject)$ic21$, (SubLObject)$ic18$, var21, (SubLObject)$ic19$);
                            }
                        }
                        final SubLObject var22_109 = module0141.$g1670$.currentBinding(var13);
                        final SubLObject var25_110 = module0141.$g1671$.currentBinding(var13);
                        final SubLObject var24 = module0141.$g1672$.currentBinding(var13);
                        final SubLObject var25 = module0141.$g1674$.currentBinding(var13);
                        final SubLObject var26 = module0137.$g1605$.currentBinding(var13);
                        try {
                            module0141.$g1670$.bind(module0137.f8955($ic24$), var13);
                            module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic24$)), var13);
                            module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic24$)), var13);
                            module0141.$g1674$.bind((SubLObject)NIL, var13);
                            module0137.$g1605$.bind(module0137.f8955($ic24$), var13);
                            if (NIL != module0136.f8865() || NIL != module0244.f15795($ic6$, module0137.f8955((SubLObject)UNPROVIDED))) {
                                final SubLObject var22_110 = module0141.$g1677$.currentBinding(var13);
                                final SubLObject var25_111 = module0138.$g1619$.currentBinding(var13);
                                final SubLObject var29_113 = module0141.$g1674$.currentBinding(var13);
                                try {
                                    module0141.$g1677$.bind(module0141.f9210(), var13);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955($ic24$)), var13);
                                    module0141.$g1674$.bind((SubLObject)NIL, var13);
                                    module0249.f16055(var16, (SubLObject)UNPROVIDED);
                                    for (var19 = (SubLObject)ConsesLow.list($ic6$, module0141.f9195()); NIL != var19 && NIL == var14; var19 = module0056.f4150(var18)) {
                                        final SubLObject var18_114 = var19.first();
                                        final SubLObject var27 = conses_high.second(var19);
                                        final SubLObject var28 = var18_114;
                                        final SubLObject var22_111 = module0141.$g1674$.currentBinding(var13);
                                        try {
                                            module0141.$g1674$.bind(var27, var13);
                                            if (NIL != module0250.f16115(module0141.f9190(), var18_114)) {
                                                final SubLObject var29 = var28;
                                                if (NIL != module0158.f10010(var15, (SubLObject)TWO_INTEGER, var29)) {
                                                    final SubLObject var30 = module0158.f10011(var15, (SubLObject)TWO_INTEGER, var29);
                                                    SubLObject var31 = var14;
                                                    final SubLObject var32 = (SubLObject)NIL;
                                                    while (NIL == var31) {
                                                        final SubLObject var33 = module0052.f3695(var30, var32);
                                                        final SubLObject var34 = (SubLObject)makeBoolean(!var32.eql(var33));
                                                        if (NIL != var34) {
                                                            SubLObject var35 = (SubLObject)NIL;
                                                            try {
                                                                var35 = module0158.f10316(var33, (SubLObject)$ic25$, (SubLObject)$ic11$, (SubLObject)NIL);
                                                                SubLObject var41_116 = var14;
                                                                final SubLObject var42_117 = (SubLObject)NIL;
                                                                while (NIL == var41_116) {
                                                                    final SubLObject var36 = module0052.f3695(var35, var42_117);
                                                                    final SubLObject var44_118 = (SubLObject)makeBoolean(!var42_117.eql(var36));
                                                                    if (NIL != var44_118) {
                                                                        SubLObject var37 = (SubLObject)NIL;
                                                                        final SubLObject var38 = module0178.f11336(var36);
                                                                        SubLObject var39 = (SubLObject)ZERO_INTEGER;
                                                                        final SubLObject var40 = module0205.f13207(var11, (SubLObject)$ic26$);
                                                                        SubLObject var41;
                                                                        SubLObject var42;
                                                                        for (var41 = (SubLObject)NIL, var41 = var40; NIL == var37 && NIL != var41; var41 = var41.rest()) {
                                                                            var42 = var41.first();
                                                                            var39 = Numbers.add(var39, (SubLObject)ONE_INTEGER);
                                                                            if (var39.eql(var38)) {
                                                                                var37 = module0193.f12105(var42);
                                                                            }
                                                                            else {
                                                                                var37 = (SubLObject)makeBoolean(NIL == module0193.f12105(var42));
                                                                            }
                                                                        }
                                                                        if (NIL == var37) {
                                                                            var14 = (SubLObject)T;
                                                                        }
                                                                    }
                                                                    var41_116 = (SubLObject)makeBoolean(NIL == var44_118 || NIL != var14);
                                                                }
                                                            }
                                                            finally {
                                                                final SubLObject var22_112 = Threads.$is_thread_performing_cleanupP$.currentBinding(var13);
                                                                try {
                                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var13);
                                                                    if (NIL != var35) {
                                                                        module0158.f10319(var35);
                                                                    }
                                                                }
                                                                finally {
                                                                    Threads.$is_thread_performing_cleanupP$.rebind(var22_112, var13);
                                                                }
                                                            }
                                                        }
                                                        var31 = (SubLObject)makeBoolean(NIL == var34 || NIL != var14);
                                                    }
                                                }
                                            }
                                            final SubLObject var43 = module0200.f12443(module0137.f8955($ic24$));
                                            SubLObject var44;
                                            SubLObject var45;
                                            SubLObject var22_113;
                                            SubLObject var25_112;
                                            SubLObject var46;
                                            SubLObject var47;
                                            SubLObject var48;
                                            SubLObject var49;
                                            SubLObject var50;
                                            SubLObject var51;
                                            SubLObject var22_114;
                                            SubLObject var63_123;
                                            SubLObject var52;
                                            SubLObject var53;
                                            SubLObject var22_115;
                                            SubLObject var54;
                                            SubLObject var55;
                                            SubLObject var56;
                                            SubLObject var57;
                                            SubLObject var58;
                                            SubLObject var59;
                                            SubLObject var60;
                                            SubLObject var61;
                                            SubLObject var53_125;
                                            SubLObject var62;
                                            SubLObject var22_116;
                                            SubLObject var64;
                                            SubLObject var63;
                                            SubLObject var65;
                                            SubLObject var66;
                                            SubLObject var67;
                                            SubLObject var68;
                                            SubLObject var69;
                                            SubLObject var70;
                                            for (var44 = (SubLObject)NIL, var44 = var43; NIL == var14 && NIL != var44; var44 = var44.rest()) {
                                                var45 = var44.first();
                                                var22_113 = module0137.$g1605$.currentBinding(var13);
                                                var25_112 = module0141.$g1674$.currentBinding(var13);
                                                try {
                                                    module0137.$g1605$.bind(var45, var13);
                                                    module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var13)) : module0141.$g1674$.getDynamicValue(var13)), var13);
                                                    var46 = module0228.f15229(var18_114);
                                                    if (NIL != module0138.f8992(var46)) {
                                                        var47 = module0242.f15664(var46, module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var47) {
                                                            var48 = module0245.f15834(var47, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                            if (NIL != var48) {
                                                                for (var49 = module0066.f4838(module0067.f4891(var48)); NIL == var14 && NIL == module0066.f4841(var49); var49 = module0066.f4840(var49)) {
                                                                    var13.resetMultipleValues();
                                                                    var50 = module0066.f4839(var49);
                                                                    var51 = var13.secondMultipleValue();
                                                                    var13.resetMultipleValues();
                                                                    if (NIL != module0147.f9507(var50)) {
                                                                        var22_114 = module0138.$g1623$.currentBinding(var13);
                                                                        try {
                                                                            module0138.$g1623$.bind(var50, var13);
                                                                            for (var63_123 = module0066.f4838(module0067.f4891(var51)); NIL == var14 && NIL == module0066.f4841(var63_123); var63_123 = module0066.f4840(var63_123)) {
                                                                                var13.resetMultipleValues();
                                                                                var52 = module0066.f4839(var63_123);
                                                                                var53 = var13.secondMultipleValue();
                                                                                var13.resetMultipleValues();
                                                                                if (NIL != module0141.f9289(var52)) {
                                                                                    var22_115 = module0138.$g1624$.currentBinding(var13);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var52, var13);
                                                                                        var54 = var53;
                                                                                        if (NIL != module0077.f5302(var54)) {
                                                                                            var55 = module0077.f5333(var54);
                                                                                            for (var56 = module0032.f1741(var55), var57 = (SubLObject)NIL, var57 = module0032.f1742(var56, var55); NIL == var14 && NIL == module0032.f1744(var56, var57); var57 = module0032.f1743(var57)) {
                                                                                                var58 = module0032.f1745(var56, var57);
                                                                                                if (NIL != module0032.f1746(var57, var58) && NIL == module0249.f16059(var58, (SubLObject)UNPROVIDED)) {
                                                                                                    module0249.f16055(var58, (SubLObject)UNPROVIDED);
                                                                                                    module0056.f4149((SubLObject)ConsesLow.list(var58, module0141.f9195()), var18);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var54.isList()) {
                                                                                            if (NIL == var14) {
                                                                                                var59 = var54;
                                                                                                var60 = (SubLObject)NIL;
                                                                                                var60 = var59.first();
                                                                                                while (NIL == var14 && NIL != var59) {
                                                                                                    if (NIL == module0249.f16059(var60, (SubLObject)UNPROVIDED)) {
                                                                                                        module0249.f16055(var60, (SubLObject)UNPROVIDED);
                                                                                                        module0056.f4149((SubLObject)ConsesLow.list(var60, module0141.f9195()), var18);
                                                                                                    }
                                                                                                    var59 = var59.rest();
                                                                                                    var60 = var59.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)$ic27$, var54);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var22_115, var13);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var63_123);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var22_114, var13);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var49);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic28$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                        }
                                                    }
                                                    else if (NIL != module0155.f9785(var46, (SubLObject)UNPROVIDED)) {
                                                        var61 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var13), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var13), module0137.f8955((SubLObject)UNPROVIDED)));
                                                        for (var53_125 = (SubLObject)NIL, var53_125 = var61; NIL == var14 && NIL != var53_125; var53_125 = var53_125.rest()) {
                                                            var62 = var53_125.first();
                                                            var22_116 = module0138.$g1625$.currentBinding(var13);
                                                            try {
                                                                module0138.$g1625$.bind(var62, var13);
                                                                var63 = (var64 = Functions.funcall(var62, var46));
                                                                if (NIL != module0077.f5302(var64)) {
                                                                    var65 = module0077.f5333(var64);
                                                                    for (var66 = module0032.f1741(var65), var67 = (SubLObject)NIL, var67 = module0032.f1742(var66, var65); NIL == var14 && NIL == module0032.f1744(var66, var67); var67 = module0032.f1743(var67)) {
                                                                        var68 = module0032.f1745(var66, var67);
                                                                        if (NIL != module0032.f1746(var67, var68) && NIL == module0249.f16059(var68, (SubLObject)UNPROVIDED)) {
                                                                            module0249.f16055(var68, (SubLObject)UNPROVIDED);
                                                                            module0056.f4149((SubLObject)ConsesLow.list(var68, module0141.f9195()), var18);
                                                                        }
                                                                    }
                                                                }
                                                                else if (var64.isList()) {
                                                                    if (NIL == var14) {
                                                                        var69 = var64;
                                                                        var70 = (SubLObject)NIL;
                                                                        var70 = var69.first();
                                                                        while (NIL == var14 && NIL != var69) {
                                                                            if (NIL == module0249.f16059(var70, (SubLObject)UNPROVIDED)) {
                                                                                module0249.f16055(var70, (SubLObject)UNPROVIDED);
                                                                                module0056.f4149((SubLObject)ConsesLow.list(var70, module0141.f9195()), var18);
                                                                            }
                                                                            var69 = var69.rest();
                                                                            var70 = var69.first();
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)$ic27$, var64);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var22_116, var13);
                                                            }
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var25_112, var13);
                                                    module0137.$g1605$.rebind(var22_113, var13);
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var22_111, var13);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var29_113, var13);
                                    module0138.$g1619$.rebind(var25_111, var13);
                                    module0141.$g1677$.rebind(var22_110, var13);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic29$, $ic6$, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var26, var13);
                            module0141.$g1674$.rebind(var25, var13);
                            module0141.$g1672$.rebind(var24, var13);
                            module0141.$g1671$.rebind(var25_110, var13);
                            module0141.$g1670$.rebind(var22_109, var13);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var22, var13);
                        module0141.$g1714$.rebind(var22_108, var13);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var13));
                }
                finally {
                    module0139.$g1635$.rebind(var20, var13);
                }
            }
        }
        return var14;
    }
    
    public static SubLObject f31825(final SubLObject var11) {
        final SubLObject var12 = module0191.f11990((SubLObject)$ic35$, var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var12;
    }
    
    public static SubLObject f31824(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        if (NIL != module0212.f13762(module0205.f13132(var11)) && NIL == var14) {
            final SubLObject var15 = $ic6$;
            final SubLObject var16 = (SubLObject)$ic15$;
            final SubLObject var17 = module0056.f4145(var16);
            SubLObject var18 = (SubLObject)NIL;
            final SubLObject var19 = module0139.$g1635$.currentBinding(var12);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var12);
                final SubLObject var20 = (SubLObject)NIL;
                final SubLObject var22_130 = module0141.$g1714$.currentBinding(var12);
                final SubLObject var21 = module0141.$g1715$.currentBinding(var12);
                try {
                    module0141.$g1714$.bind((NIL != var20) ? var20 : module0141.f9283(), var12);
                    module0141.$g1715$.bind((SubLObject)((NIL != var20) ? $ic16$ : module0141.$g1715$.getDynamicValue(var12)), var12);
                    if (NIL != var20 && NIL != module0136.f8864() && NIL == module0141.f9279(var20)) {
                        final SubLObject var22 = module0136.$g1591$.getDynamicValue(var12);
                        if (var22.eql((SubLObject)$ic17$)) {
                            module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic18$, var20, (SubLObject)$ic19$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        else if (var22.eql((SubLObject)$ic20$)) {
                            module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic21$, (SubLObject)$ic18$, var20, (SubLObject)$ic19$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        else if (var22.eql((SubLObject)$ic22$)) {
                            Errors.warn((SubLObject)$ic18$, var20, (SubLObject)$ic19$);
                        }
                        else {
                            Errors.warn((SubLObject)$ic23$, module0136.$g1591$.getDynamicValue(var12));
                            Errors.cerror((SubLObject)$ic21$, (SubLObject)$ic18$, var20, (SubLObject)$ic19$);
                        }
                    }
                    final SubLObject var22_131 = module0141.$g1670$.currentBinding(var12);
                    final SubLObject var25_132 = module0141.$g1671$.currentBinding(var12);
                    final SubLObject var23 = module0141.$g1672$.currentBinding(var12);
                    final SubLObject var24 = module0141.$g1674$.currentBinding(var12);
                    final SubLObject var25 = module0137.$g1605$.currentBinding(var12);
                    try {
                        module0141.$g1670$.bind(module0137.f8955($ic24$), var12);
                        module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic24$)), var12);
                        module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic24$)), var12);
                        module0141.$g1674$.bind((SubLObject)NIL, var12);
                        module0137.$g1605$.bind(module0137.f8955($ic24$), var12);
                        if (NIL != module0136.f8865() || NIL != module0244.f15795($ic6$, module0137.f8955((SubLObject)UNPROVIDED))) {
                            final SubLObject var22_132 = module0141.$g1677$.currentBinding(var12);
                            final SubLObject var25_133 = module0138.$g1619$.currentBinding(var12);
                            final SubLObject var29_135 = module0141.$g1674$.currentBinding(var12);
                            try {
                                module0141.$g1677$.bind(module0141.f9210(), var12);
                                module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955($ic24$)), var12);
                                module0141.$g1674$.bind((SubLObject)NIL, var12);
                                module0249.f16055(var15, (SubLObject)UNPROVIDED);
                                for (var18 = (SubLObject)ConsesLow.list($ic6$, module0141.f9195()); NIL != var18 && NIL == var14; var18 = module0056.f4150(var17)) {
                                    final SubLObject var18_136 = var18.first();
                                    final SubLObject var26 = conses_high.second(var18);
                                    final SubLObject var27 = var18_136;
                                    final SubLObject var22_133 = module0141.$g1674$.currentBinding(var12);
                                    try {
                                        module0141.$g1674$.bind(var26, var12);
                                        if (NIL != module0250.f16115(module0141.f9190(), var18_136)) {
                                            final SubLObject var28 = var27;
                                            if (NIL != module0158.f10010(module0205.f13132(var11), (SubLObject)TWO_INTEGER, var28)) {
                                                final SubLObject var29 = module0158.f10011(module0205.f13132(var11), (SubLObject)TWO_INTEGER, var28);
                                                SubLObject var30 = var14;
                                                final SubLObject var31 = (SubLObject)NIL;
                                                while (NIL == var30) {
                                                    final SubLObject var32 = module0052.f3695(var29, var31);
                                                    final SubLObject var33 = (SubLObject)makeBoolean(!var31.eql(var32));
                                                    if (NIL != var33) {
                                                        SubLObject var34 = (SubLObject)NIL;
                                                        try {
                                                            var34 = module0158.f10316(var32, (SubLObject)$ic25$, (SubLObject)$ic11$, (SubLObject)NIL);
                                                            SubLObject var41_138 = var14;
                                                            final SubLObject var42_139 = (SubLObject)NIL;
                                                            while (NIL == var41_138) {
                                                                final SubLObject var35 = module0052.f3695(var34, var42_139);
                                                                final SubLObject var44_140 = (SubLObject)makeBoolean(!var42_139.eql(var35));
                                                                if (NIL != var44_140) {
                                                                    SubLObject var37;
                                                                    final SubLObject var36 = var37 = module0178.f11330(var35);
                                                                    SubLObject var38 = (SubLObject)NIL;
                                                                    SubLObject var39 = (SubLObject)NIL;
                                                                    SubLObject var40 = (SubLObject)NIL;
                                                                    cdestructuring_bind.destructuring_bind_must_consp(var37, var36, (SubLObject)$ic32$);
                                                                    var38 = var37.first();
                                                                    var37 = var37.rest();
                                                                    cdestructuring_bind.destructuring_bind_must_consp(var37, var36, (SubLObject)$ic32$);
                                                                    var39 = var37.first();
                                                                    var37 = var37.rest();
                                                                    cdestructuring_bind.destructuring_bind_must_consp(var37, var36, (SubLObject)$ic32$);
                                                                    var40 = var37.first();
                                                                    var37 = var37.rest();
                                                                    if (NIL == var37) {
                                                                        final SubLObject var41 = module0202.f12683(var38, module0035.f2131(module0048.f_1_(var40), module0205.f13207(var11, (SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED);
                                                                        if (NIL != module0274.f18172(var41, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                                                            final SubLObject var42 = module0205.f13134(var11, var40, (SubLObject)UNPROVIDED);
                                                                            var12.resetMultipleValues();
                                                                            final SubLObject var43 = module0235.f15474(var41, var42, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                                            final SubLObject var44 = var12.secondMultipleValue();
                                                                            var12.resetMultipleValues();
                                                                            if (NIL != var43) {
                                                                                var13 = var43;
                                                                                var14 = (SubLObject)ConsesLow.cons(var35, var44);
                                                                            }
                                                                        }
                                                                    }
                                                                    else {
                                                                        cdestructuring_bind.cdestructuring_bind_error(var36, (SubLObject)$ic32$);
                                                                    }
                                                                }
                                                                var41_138 = (SubLObject)makeBoolean(NIL == var44_140 || NIL != var14);
                                                            }
                                                        }
                                                        finally {
                                                            final SubLObject var22_134 = Threads.$is_thread_performing_cleanupP$.currentBinding(var12);
                                                            try {
                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var12);
                                                                if (NIL != var34) {
                                                                    module0158.f10319(var34);
                                                                }
                                                            }
                                                            finally {
                                                                Threads.$is_thread_performing_cleanupP$.rebind(var22_134, var12);
                                                            }
                                                        }
                                                    }
                                                    var30 = (SubLObject)makeBoolean(NIL == var33 || NIL != var14);
                                                }
                                            }
                                        }
                                        final SubLObject var45 = module0200.f12443(module0137.f8955($ic24$));
                                        SubLObject var46;
                                        SubLObject var47;
                                        SubLObject var22_135;
                                        SubLObject var25_134;
                                        SubLObject var48;
                                        SubLObject var49;
                                        SubLObject var50;
                                        SubLObject var51;
                                        SubLObject var52;
                                        SubLObject var53;
                                        SubLObject var22_136;
                                        SubLObject var63_149;
                                        SubLObject var54;
                                        SubLObject var55;
                                        SubLObject var22_137;
                                        SubLObject var56;
                                        SubLObject var57;
                                        SubLObject var58;
                                        SubLObject var59;
                                        SubLObject var60;
                                        SubLObject var61;
                                        SubLObject var62;
                                        SubLObject var63;
                                        SubLObject var53_151;
                                        SubLObject var64;
                                        SubLObject var22_138;
                                        SubLObject var66;
                                        SubLObject var65;
                                        SubLObject var67;
                                        SubLObject var68;
                                        SubLObject var69;
                                        SubLObject var70;
                                        SubLObject var71;
                                        SubLObject var72;
                                        for (var46 = (SubLObject)NIL, var46 = var45; NIL == var14 && NIL != var46; var46 = var46.rest()) {
                                            var47 = var46.first();
                                            var22_135 = module0137.$g1605$.currentBinding(var12);
                                            var25_134 = module0141.$g1674$.currentBinding(var12);
                                            try {
                                                module0137.$g1605$.bind(var47, var12);
                                                module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var12)) : module0141.$g1674$.getDynamicValue(var12)), var12);
                                                var48 = module0228.f15229(var18_136);
                                                if (NIL != module0138.f8992(var48)) {
                                                    var49 = module0242.f15664(var48, module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var49) {
                                                        var50 = module0245.f15834(var49, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var50) {
                                                            for (var51 = module0066.f4838(module0067.f4891(var50)); NIL == var14 && NIL == module0066.f4841(var51); var51 = module0066.f4840(var51)) {
                                                                var12.resetMultipleValues();
                                                                var52 = module0066.f4839(var51);
                                                                var53 = var12.secondMultipleValue();
                                                                var12.resetMultipleValues();
                                                                if (NIL != module0147.f9507(var52)) {
                                                                    var22_136 = module0138.$g1623$.currentBinding(var12);
                                                                    try {
                                                                        module0138.$g1623$.bind(var52, var12);
                                                                        for (var63_149 = module0066.f4838(module0067.f4891(var53)); NIL == var14 && NIL == module0066.f4841(var63_149); var63_149 = module0066.f4840(var63_149)) {
                                                                            var12.resetMultipleValues();
                                                                            var54 = module0066.f4839(var63_149);
                                                                            var55 = var12.secondMultipleValue();
                                                                            var12.resetMultipleValues();
                                                                            if (NIL != module0141.f9289(var54)) {
                                                                                var22_137 = module0138.$g1624$.currentBinding(var12);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var54, var12);
                                                                                    var56 = var55;
                                                                                    if (NIL != module0077.f5302(var56)) {
                                                                                        var57 = module0077.f5333(var56);
                                                                                        for (var58 = module0032.f1741(var57), var59 = (SubLObject)NIL, var59 = module0032.f1742(var58, var57); NIL == var14 && NIL == module0032.f1744(var58, var59); var59 = module0032.f1743(var59)) {
                                                                                            var60 = module0032.f1745(var58, var59);
                                                                                            if (NIL != module0032.f1746(var59, var60) && NIL == module0249.f16059(var60, (SubLObject)UNPROVIDED)) {
                                                                                                module0249.f16055(var60, (SubLObject)UNPROVIDED);
                                                                                                module0056.f4149((SubLObject)ConsesLow.list(var60, module0141.f9195()), var17);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var56.isList()) {
                                                                                        if (NIL == var14) {
                                                                                            var61 = var56;
                                                                                            var62 = (SubLObject)NIL;
                                                                                            var62 = var61.first();
                                                                                            while (NIL == var14 && NIL != var61) {
                                                                                                if (NIL == module0249.f16059(var62, (SubLObject)UNPROVIDED)) {
                                                                                                    module0249.f16055(var62, (SubLObject)UNPROVIDED);
                                                                                                    module0056.f4149((SubLObject)ConsesLow.list(var62, module0141.f9195()), var17);
                                                                                                }
                                                                                                var61 = var61.rest();
                                                                                                var62 = var61.first();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)$ic27$, var56);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var22_137, var12);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var63_149);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var22_136, var12);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var51);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic28$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                    }
                                                }
                                                else if (NIL != module0155.f9785(var48, (SubLObject)UNPROVIDED)) {
                                                    var63 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var12), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var12), module0137.f8955((SubLObject)UNPROVIDED)));
                                                    for (var53_151 = (SubLObject)NIL, var53_151 = var63; NIL == var14 && NIL != var53_151; var53_151 = var53_151.rest()) {
                                                        var64 = var53_151.first();
                                                        var22_138 = module0138.$g1625$.currentBinding(var12);
                                                        try {
                                                            module0138.$g1625$.bind(var64, var12);
                                                            var65 = (var66 = Functions.funcall(var64, var48));
                                                            if (NIL != module0077.f5302(var66)) {
                                                                var67 = module0077.f5333(var66);
                                                                for (var68 = module0032.f1741(var67), var69 = (SubLObject)NIL, var69 = module0032.f1742(var68, var67); NIL == var14 && NIL == module0032.f1744(var68, var69); var69 = module0032.f1743(var69)) {
                                                                    var70 = module0032.f1745(var68, var69);
                                                                    if (NIL != module0032.f1746(var69, var70) && NIL == module0249.f16059(var70, (SubLObject)UNPROVIDED)) {
                                                                        module0249.f16055(var70, (SubLObject)UNPROVIDED);
                                                                        module0056.f4149((SubLObject)ConsesLow.list(var70, module0141.f9195()), var17);
                                                                    }
                                                                }
                                                            }
                                                            else if (var66.isList()) {
                                                                if (NIL == var14) {
                                                                    var71 = var66;
                                                                    var72 = (SubLObject)NIL;
                                                                    var72 = var71.first();
                                                                    while (NIL == var14 && NIL != var71) {
                                                                        if (NIL == module0249.f16059(var72, (SubLObject)UNPROVIDED)) {
                                                                            module0249.f16055(var72, (SubLObject)UNPROVIDED);
                                                                            module0056.f4149((SubLObject)ConsesLow.list(var72, module0141.f9195()), var17);
                                                                        }
                                                                        var71 = var71.rest();
                                                                        var72 = var71.first();
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)$ic27$, var66);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var22_138, var12);
                                                        }
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var25_134, var12);
                                                module0137.$g1605$.rebind(var22_135, var12);
                                            }
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var22_133, var12);
                                    }
                                }
                            }
                            finally {
                                module0141.$g1674$.rebind(var29_135, var12);
                                module0138.$g1619$.rebind(var25_133, var12);
                                module0141.$g1677$.rebind(var22_132, var12);
                            }
                        }
                        else {
                            module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic29$, $ic6$, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                    }
                    finally {
                        module0137.$g1605$.rebind(var25, var12);
                        module0141.$g1674$.rebind(var24, var12);
                        module0141.$g1672$.rebind(var23, var12);
                        module0141.$g1671$.rebind(var25_132, var12);
                        module0141.$g1670$.rebind(var22_131, var12);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var21, var12);
                    module0141.$g1714$.rebind(var22_130, var12);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var12));
            }
            finally {
                module0139.$g1635$.rebind(var19, var12);
            }
        }
        return Values.values(var13, var14);
    }
    
    public static SubLObject f31829(final SubLObject var153) {
        final SubLObject var154 = module0191.f11967(var153);
        final SubLObject var155 = Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)ONE_INTEGER), f31824(var154));
        return var155;
    }
    
    public static SubLObject f31830(final SubLObject var153) {
        final SubLObject var154 = module0191.f11967(var153);
        return module0035.sublisp_boolean(f31824(var154));
    }
    
    public static SubLObject f31831(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic38$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic38$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic38$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic38$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var162_163 = (SubLObject)NIL;
        while (NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic38$);
            var162_163 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic38$);
            if (NIL == conses_high.member(var162_163, (SubLObject)$ic39$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var11 = (SubLObject)T;
            }
            if (var162_163 == $ic40$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (NIL != var11 && NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic38$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic12$, var4);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : NIL);
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)$ic41$, var4);
        final SubLObject var15 = (SubLObject)((NIL != var14) ? conses_high.cadr(var14) : NIL);
        final SubLObject var16;
        var4 = (var16 = var5);
        if (NIL != var15) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic42$, (SubLObject)ConsesLow.list(var15, var8, $ic6$, (SubLObject)$ic8$, (SubLObject)TWO_INTEGER, (SubLObject)$ic12$, var13), (SubLObject)ConsesLow.list((SubLObject)$ic43$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic44$, var15)), (SubLObject)ConsesLow.list(var7, (SubLObject)ConsesLow.list((SubLObject)$ic45$, var15))), (SubLObject)ConsesLow.listS((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic46$, var6), ConsesLow.append(var16, (SubLObject)NIL))));
        }
        final SubLObject var167_168 = (SubLObject)$ic47$;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic48$, (SubLObject)ConsesLow.list(var6, var7, var8, (SubLObject)$ic12$, var13, (SubLObject)$ic41$, var167_168), ConsesLow.append(var16, (SubLObject)NIL));
    }
    
    public static SubLObject f31832(final SubLObject var11, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        final SubLThread var13 = SubLProcess.currentSubLThread();
        final SubLObject var14 = module0205.f13333(var11);
        SubLObject var15 = (SubLObject)NIL;
        if (NIL != module0212.f13762(var14)) {
            SubLObject var16 = module0148.$g2099$.currentBinding(var13);
            SubLObject var17 = module0148.$g2097$.currentBinding(var13);
            try {
                module0148.$g2099$.bind((SubLObject)$ic49$, var13);
                module0148.$g2097$.bind($ic6$, var13);
                final SubLObject var18 = (SubLObject)NIL;
                if (NIL != module0158.f10010(var14, (SubLObject)TWO_INTEGER, var18)) {
                    final SubLObject var19 = module0158.f10011(var14, (SubLObject)TWO_INTEGER, var18);
                    SubLObject var20 = var15;
                    final SubLObject var21 = (SubLObject)NIL;
                    while (NIL == var20) {
                        final SubLObject var22 = module0052.f3695(var19, var21);
                        final SubLObject var23 = (SubLObject)makeBoolean(!var21.eql(var22));
                        if (NIL != var23) {
                            SubLObject var24 = (SubLObject)NIL;
                            try {
                                var24 = module0158.f10316(var22, (SubLObject)$ic25$, (SubLObject)$ic11$, (SubLObject)NIL);
                                SubLObject var41_170 = var15;
                                final SubLObject var42_171 = (SubLObject)NIL;
                                while (NIL == var41_170) {
                                    final SubLObject var25 = module0052.f3695(var24, var42_171);
                                    final SubLObject var44_173 = (SubLObject)makeBoolean(!var42_171.eql(var25));
                                    if (NIL != var44_173) {
                                        final SubLObject var26 = module0178.f11334(var25);
                                        final SubLObject var27 = module0178.f11336(var25);
                                        if (NIL != module0269.f17770(var26)) {
                                            SubLObject var28 = (SubLObject)NIL;
                                            SubLObject var29 = (SubLObject)ZERO_INTEGER;
                                            final SubLObject var30 = module0205.f13207(var11, (SubLObject)$ic26$);
                                            SubLObject var31;
                                            SubLObject var32;
                                            for (var31 = (SubLObject)NIL, var31 = var30; NIL == var28 && NIL != var31; var31 = var31.rest()) {
                                                var32 = var31.first();
                                                var29 = Numbers.add(var29, (SubLObject)ONE_INTEGER);
                                                if (!var27.eql(var29) && NIL == module0193.f12105(var32)) {
                                                    var28 = (SubLObject)T;
                                                }
                                            }
                                            if (NIL == var28) {
                                                var15 = (SubLObject)T;
                                            }
                                        }
                                    }
                                    var41_170 = (SubLObject)makeBoolean(NIL == var44_173 || NIL != var15);
                                }
                            }
                            finally {
                                final SubLObject var22_176 = Threads.$is_thread_performing_cleanupP$.currentBinding(var13);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var13);
                                    if (NIL != var24) {
                                        module0158.f10319(var24);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var22_176, var13);
                                }
                            }
                        }
                        var20 = (SubLObject)makeBoolean(NIL == var23 || NIL != var15);
                    }
                }
            }
            finally {
                module0148.$g2097$.rebind(var17, var13);
                module0148.$g2099$.rebind(var16, var13);
            }
            if (NIL != module0221.f14609($ic6$)) {
                var16 = module0148.$g2099$.currentBinding(var13);
                var17 = module0148.$g2097$.currentBinding(var13);
                try {
                    module0148.$g2099$.bind((SubLObject)$ic50$, var13);
                    module0148.$g2097$.bind($ic6$, var13);
                    final SubLObject var18 = (SubLObject)NIL;
                    if (NIL != module0158.f10010(var14, module0225.f14782((SubLObject)TWO_INTEGER), var18)) {
                        final SubLObject var19 = module0158.f10011(var14, module0225.f14782((SubLObject)TWO_INTEGER), var18);
                        SubLObject var20 = var15;
                        final SubLObject var21 = (SubLObject)NIL;
                        while (NIL == var20) {
                            final SubLObject var22 = module0052.f3695(var19, var21);
                            final SubLObject var23 = (SubLObject)makeBoolean(!var21.eql(var22));
                            if (NIL != var23) {
                                SubLObject var24 = (SubLObject)NIL;
                                try {
                                    var24 = module0158.f10316(var22, (SubLObject)$ic25$, (SubLObject)$ic11$, (SubLObject)NIL);
                                    SubLObject var41_171 = var15;
                                    final SubLObject var42_172 = (SubLObject)NIL;
                                    while (NIL == var41_171) {
                                        final SubLObject var25 = module0052.f3695(var24, var42_172);
                                        final SubLObject var44_174 = (SubLObject)makeBoolean(!var42_172.eql(var25));
                                        if (NIL != var44_174) {
                                            final SubLObject var22_177 = module0221.$g2399$.currentBinding(var13);
                                            try {
                                                module0221.$g2399$.bind((SubLObject)makeBoolean(NIL == module0221.$g2399$.getDynamicValue(var13)), var13);
                                                final SubLObject var33 = module0178.f11334(var25);
                                                final SubLObject var34 = module0178.f11336(var25);
                                                if (NIL != module0269.f17770(var33)) {
                                                    SubLObject var35 = (SubLObject)NIL;
                                                    SubLObject var36 = (SubLObject)ZERO_INTEGER;
                                                    final SubLObject var37 = module0205.f13207(var11, (SubLObject)$ic26$);
                                                    SubLObject var38;
                                                    SubLObject var39;
                                                    for (var38 = (SubLObject)NIL, var38 = var37; NIL == var35 && NIL != var38; var38 = var38.rest()) {
                                                        var39 = var38.first();
                                                        var36 = Numbers.add(var36, (SubLObject)ONE_INTEGER);
                                                        if (!var34.eql(var36) && NIL == module0193.f12105(var39)) {
                                                            var35 = (SubLObject)T;
                                                        }
                                                    }
                                                    if (NIL == var35) {
                                                        var15 = (SubLObject)T;
                                                    }
                                                }
                                            }
                                            finally {
                                                module0221.$g2399$.rebind(var22_177, var13);
                                            }
                                        }
                                        var41_171 = (SubLObject)makeBoolean(NIL == var44_174 || NIL != var15);
                                    }
                                }
                                finally {
                                    final SubLObject var22_178 = Threads.$is_thread_performing_cleanupP$.currentBinding(var13);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var13);
                                        if (NIL != var24) {
                                            module0158.f10319(var24);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var22_178, var13);
                                    }
                                }
                            }
                            var20 = (SubLObject)makeBoolean(NIL == var23 || NIL != var15);
                        }
                    }
                }
                finally {
                    module0148.$g2097$.rebind(var17, var13);
                    module0148.$g2099$.rebind(var16, var13);
                }
            }
        }
        return var15;
    }
    
    public static SubLObject f31833(final SubLObject var11, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        final SubLThread var13 = SubLProcess.currentSubLThread();
        final SubLObject var14 = module0205.f13333(var11);
        SubLObject var15 = module0148.$g2099$.currentBinding(var13);
        SubLObject var16 = module0148.$g2097$.currentBinding(var13);
        try {
            module0148.$g2099$.bind((SubLObject)$ic49$, var13);
            module0148.$g2097$.bind($ic6$, var13);
            final SubLObject var17 = (SubLObject)NIL;
            if (NIL != module0158.f10010(var14, (SubLObject)TWO_INTEGER, var17)) {
                final SubLObject var18 = module0158.f10011(var14, (SubLObject)TWO_INTEGER, var17);
                SubLObject var19 = (SubLObject)NIL;
                final SubLObject var20 = (SubLObject)NIL;
                while (NIL == var19) {
                    final SubLObject var21 = module0052.f3695(var18, var20);
                    final SubLObject var22 = (SubLObject)makeBoolean(!var20.eql(var21));
                    if (NIL != var22) {
                        SubLObject var23 = (SubLObject)NIL;
                        try {
                            var23 = module0158.f10316(var21, (SubLObject)$ic25$, (SubLObject)$ic11$, (SubLObject)NIL);
                            SubLObject var41_182 = (SubLObject)NIL;
                            final SubLObject var42_183 = (SubLObject)NIL;
                            while (NIL == var41_182) {
                                final SubLObject var24 = module0052.f3695(var23, var42_183);
                                final SubLObject var44_184 = (SubLObject)makeBoolean(!var42_183.eql(var24));
                                if (NIL != var44_184) {
                                    final SubLObject var25 = module0178.f11334(var24);
                                    final SubLObject var26 = module0178.f11336(var24);
                                    if (NIL != module0269.f17770(var25)) {
                                        SubLObject var27 = (SubLObject)NIL;
                                        SubLObject var28 = (SubLObject)NIL;
                                        SubLObject var29 = (SubLObject)NIL;
                                        SubLObject var30 = (SubLObject)ZERO_INTEGER;
                                        final SubLObject var31 = module0205.f13207(var11, (SubLObject)$ic26$);
                                        SubLObject var32;
                                        SubLObject var33;
                                        for (var32 = (SubLObject)NIL, var32 = var31; NIL == var29 && NIL != var32; var32 = var32.rest()) {
                                            var33 = var32.first();
                                            var30 = Numbers.add(var30, (SubLObject)ONE_INTEGER);
                                            if (var26.eql(var30)) {
                                                var28 = var33;
                                            }
                                            else if (NIL != module0193.f12105(var33)) {
                                                var27 = (SubLObject)ConsesLow.cons(var33, var27);
                                            }
                                            else {
                                                var29 = (SubLObject)T;
                                            }
                                        }
                                        if (NIL == var29) {
                                            final SubLObject var34 = module0202.f12683(var25, Sequences.nreverse(var27), (SubLObject)UNPROVIDED);
                                            var13.resetMultipleValues();
                                            final SubLObject var35 = module0229.f15243(var34);
                                            final SubLObject var36 = var13.secondMultipleValue();
                                            var13.resetMultipleValues();
                                            if (NIL != var36) {
                                                var13.resetMultipleValues();
                                                final SubLObject var37 = module0235.f15474(var28, var35, (SubLObject)T, (SubLObject)T);
                                                final SubLObject var38 = var13.secondMultipleValue();
                                                var13.resetMultipleValues();
                                                if (NIL != var37) {
                                                    final SubLObject var39 = module0202.f12768($ic51$, var35, var34);
                                                    final SubLObject var40 = module0438.f30664(var39, (SubLObject)UNPROVIDED);
                                                    module0347.f23330(var24, var37, ConsesLow.append((SubLObject)ConsesLow.list(var40), var38));
                                                }
                                            }
                                        }
                                    }
                                }
                                var41_182 = (SubLObject)makeBoolean(NIL == var44_184);
                            }
                        }
                        finally {
                            final SubLObject var22_192 = Threads.$is_thread_performing_cleanupP$.currentBinding(var13);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var13);
                                if (NIL != var23) {
                                    module0158.f10319(var23);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var22_192, var13);
                            }
                        }
                    }
                    var19 = (SubLObject)makeBoolean(NIL == var22);
                }
            }
        }
        finally {
            module0148.$g2097$.rebind(var16, var13);
            module0148.$g2099$.rebind(var15, var13);
        }
        if (NIL != module0221.f14609($ic6$)) {
            var15 = module0148.$g2099$.currentBinding(var13);
            var16 = module0148.$g2097$.currentBinding(var13);
            try {
                module0148.$g2099$.bind((SubLObject)$ic50$, var13);
                module0148.$g2097$.bind($ic6$, var13);
                final SubLObject var17 = (SubLObject)NIL;
                if (NIL != module0158.f10010(var14, module0225.f14782((SubLObject)TWO_INTEGER), var17)) {
                    final SubLObject var18 = module0158.f10011(var14, module0225.f14782((SubLObject)TWO_INTEGER), var17);
                    SubLObject var19 = (SubLObject)NIL;
                    final SubLObject var20 = (SubLObject)NIL;
                    while (NIL == var19) {
                        final SubLObject var21 = module0052.f3695(var18, var20);
                        final SubLObject var22 = (SubLObject)makeBoolean(!var20.eql(var21));
                        if (NIL != var22) {
                            SubLObject var23 = (SubLObject)NIL;
                            try {
                                var23 = module0158.f10316(var21, (SubLObject)$ic25$, (SubLObject)$ic11$, (SubLObject)NIL);
                                SubLObject var41_183 = (SubLObject)NIL;
                                final SubLObject var42_184 = (SubLObject)NIL;
                                while (NIL == var41_183) {
                                    final SubLObject var24 = module0052.f3695(var23, var42_184);
                                    final SubLObject var44_185 = (SubLObject)makeBoolean(!var42_184.eql(var24));
                                    if (NIL != var44_185) {
                                        final SubLObject var22_193 = module0221.$g2399$.currentBinding(var13);
                                        try {
                                            module0221.$g2399$.bind((SubLObject)makeBoolean(NIL == module0221.$g2399$.getDynamicValue(var13)), var13);
                                            final SubLObject var41 = module0178.f11334(var24);
                                            final SubLObject var42 = module0178.f11336(var24);
                                            if (NIL != module0269.f17770(var41)) {
                                                SubLObject var43 = (SubLObject)NIL;
                                                SubLObject var44 = (SubLObject)NIL;
                                                SubLObject var45 = (SubLObject)NIL;
                                                SubLObject var46 = (SubLObject)ZERO_INTEGER;
                                                final SubLObject var47 = module0205.f13207(var11, (SubLObject)$ic26$);
                                                SubLObject var48;
                                                SubLObject var49;
                                                for (var48 = (SubLObject)NIL, var48 = var47; NIL == var45 && NIL != var48; var48 = var48.rest()) {
                                                    var49 = var48.first();
                                                    var46 = Numbers.add(var46, (SubLObject)ONE_INTEGER);
                                                    if (var42.eql(var46)) {
                                                        var44 = var49;
                                                    }
                                                    else if (NIL != module0193.f12105(var49)) {
                                                        var43 = (SubLObject)ConsesLow.cons(var49, var43);
                                                    }
                                                    else {
                                                        var45 = (SubLObject)T;
                                                    }
                                                }
                                                if (NIL == var45) {
                                                    final SubLObject var50 = module0202.f12683(var41, Sequences.nreverse(var43), (SubLObject)UNPROVIDED);
                                                    var13.resetMultipleValues();
                                                    final SubLObject var51 = module0229.f15243(var50);
                                                    final SubLObject var52 = var13.secondMultipleValue();
                                                    var13.resetMultipleValues();
                                                    if (NIL != var52) {
                                                        var13.resetMultipleValues();
                                                        final SubLObject var53 = module0235.f15474(var44, var51, (SubLObject)T, (SubLObject)T);
                                                        final SubLObject var54 = var13.secondMultipleValue();
                                                        var13.resetMultipleValues();
                                                        if (NIL != var53) {
                                                            final SubLObject var55 = module0202.f12768($ic51$, var51, var50);
                                                            final SubLObject var56 = module0438.f30664(var55, (SubLObject)UNPROVIDED);
                                                            module0347.f23330(var24, var53, ConsesLow.append((SubLObject)ConsesLow.list(var56), var54));
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        finally {
                                            module0221.$g2399$.rebind(var22_193, var13);
                                        }
                                    }
                                    var41_183 = (SubLObject)makeBoolean(NIL == var44_185);
                                }
                            }
                            finally {
                                final SubLObject var22_194 = Threads.$is_thread_performing_cleanupP$.currentBinding(var13);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var13);
                                    if (NIL != var23) {
                                        module0158.f10319(var23);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var22_194, var13);
                                }
                            }
                        }
                        var19 = (SubLObject)makeBoolean(NIL == var22);
                    }
                }
            }
            finally {
                module0148.$g2097$.rebind(var16, var13);
                module0148.$g2099$.rebind(var15, var13);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31834() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0481", "f31822", "S#35160");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0481", "f31823", "S#35161", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0481", "f31826", "S#29812", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0481", "f31827", "S#35162", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0481", "f31828", "S#35159", 1, 1, false);
        new $f31828$UnaryFunction();
        new $f31828$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0481", "f31825", "S#35163", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0481", "f31824", "S#35164", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0481", "f31829", "S#25116", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0481", "f31830", "S#25115", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0481", "f31831", "S#35165");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0481", "f31832", "S#29811", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0481", "f31833", "S#35166", 1, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31835() {
        $g3697$ = SubLFiles.deflexical("S#35167", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic0$)) ? $g3697$.getGlobalValue() : NIL));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31836() {
        module0003.f57((SubLObject)$ic0$);
        module0340.f22941((SubLObject)$ic30$, (SubLObject)$ic31$);
        module0340.f22941((SubLObject)$ic33$, (SubLObject)$ic34$);
        module0340.f22941((SubLObject)$ic36$, (SubLObject)$ic37$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f31834();
    }
    
    public void initializeVariables() {
        f31835();
    }
    
    public void runTopLevelForms() {
        f31836();
    }
    
    static {
        me = (SubLFile)new module0481();
        $g3697$ = null;
        $ic0$ = makeSymbol("S#35167", "CYC");
        $ic1$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#35168", "CYC"), (SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#8587", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic2$ = makeUninternedSymbol("US#1BA98DF");
        $ic3$ = makeSymbol("PWHEN");
        $ic4$ = makeSymbol("INDEXED-TERM-P");
        $ic5$ = makeSymbol("S#15323", "CYC");
        $ic6$ = constant_handles_oc.f8479((SubLObject)makeString("functionCorrespondingPredicate-Canonical"));
        $ic7$ = makeSymbol("DO-GAF-ARG-INDEX");
        $ic8$ = makeKeyword("INDEX");
        $ic9$ = makeKeyword("PREDICATE");
        $ic10$ = makeKeyword("TRUTH");
        $ic11$ = makeKeyword("TRUE");
        $ic12$ = makeKeyword("DONE");
        $ic13$ = makeKeyword("DEPTH");
        $ic14$ = makeKeyword("STACK");
        $ic15$ = makeKeyword("QUEUE");
        $ic16$ = makeSymbol("S#11450", "CYC");
        $ic17$ = makeKeyword("ERROR");
        $ic18$ = makeString("~A is not a ~A");
        $ic19$ = makeSymbol("S#11592", "CYC");
        $ic20$ = makeKeyword("CERROR");
        $ic21$ = makeString("continue anyway");
        $ic22$ = makeKeyword("WARN");
        $ic23$ = makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic24$ = constant_handles_oc.f8479((SubLObject)makeString("genlPreds"));
        $ic25$ = makeKeyword("GAF");
        $ic26$ = makeKeyword("IGNORE");
        $ic27$ = makeString("~A is neither SET-P nor LISTP.");
        $ic28$ = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic29$ = makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic30$ = makeKeyword("REMOVAL-FCP-CHECK");
        $ic31$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED"), makeSymbol("S#29812", "CYC"), makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("EXPAND"), makeSymbol("S#35161", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(<functional-pred> . <args>)\n    with all ARGS fully bound\n    using only the KB GAF indexing and explicit assertions"), makeKeyword("EXAMPLE"), makeString("(#$territoryOf #$France (#$TerritoryFn #$France))") });
        $ic32$ = ConsesLow.list((SubLObject)makeSymbol("S#168", "CYC"), (SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#15200", "CYC"));
        $ic33$ = makeKeyword("REMOVAL-FCP-FIND-NAT");
        $ic34$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED"), makeSymbol("S#35159", "CYC"), makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("EXPAND"), makeSymbol("S#35162", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(<functional-pred> . <args>)\n    with only NAT arg not fully bound\n    using only the KB GAF indexing and explicit assertions"), makeKeyword("EXAMPLE"), makeString("(#$territoryOf #$France ?TERRITORY)\n    (#$anatomicalPartOfType #$AbrahamLincoln #$Head-AnimalBodyPart ?HEAD)\n    (#$intervalEndedBy ?INTERVAL #$WorldWarII)") });
        $ic35$ = makeKeyword("FCP");
        $ic36$ = makeKeyword("REMOVAL-EVALUATABLE-FCP-UNIFY");
        $ic37$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED"), makeSymbol("S#29811", "CYC"), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("EXPAND"), makeSymbol("S#35166", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(<functional-pred> . <args>)\n    with all ARGS fully bound except possibly the functional arg"), makeKeyword("EXAMPLE"), makeString("(#$commonResidue (#$Degree-UnitOfAngularMeasure 450) ?X)") });
        $ic38$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("S#15200", "CYC"), (SubLObject)makeSymbol("S#717", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC"), (SubLObject)makeSymbol("S#35169", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic39$ = ConsesLow.list((SubLObject)makeKeyword("DONE"), (SubLObject)makeKeyword("SUPPORT-ASSERTION"));
        $ic40$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic41$ = makeKeyword("SUPPORT-ASSERTION");
        $ic42$ = makeSymbol("S#12705", "CYC");
        $ic43$ = makeSymbol("CLET");
        $ic44$ = makeSymbol("GAF-ARG1");
        $ic45$ = makeSymbol("GAF-ARG3");
        $ic46$ = makeSymbol("S#17597", "CYC");
        $ic47$ = makeUninternedSymbol("US#29C4457");
        $ic48$ = makeSymbol("S#35165", "CYC");
        $ic49$ = makeSymbol("S#12347", "CYC");
        $ic50$ = makeSymbol("S#12348", "CYC");
        $ic51$ = constant_handles_oc.f8479((SubLObject)makeString("evaluate"));
    }
    
    public static final class $f31828$UnaryFunction extends UnaryFunction
    {
        public $f31828$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#35159"));
        }
        
        public SubLObject processItem(final SubLObject var127) {
            return f31828(var127, (SubLObject)$f31828$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f31828$BinaryFunction extends BinaryFunction
    {
        public $f31828$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#35159"));
        }
        
        public SubLObject processItem(final SubLObject var127, final SubLObject var128) {
            return f31828(var127, var128);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 1915 ms
	
	Decompiled with Procyon 0.5.32.
*/