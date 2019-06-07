package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0308 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0308";
    public static final String myFingerPrint = "b0dc0201e0d64d34c8816fc7a97b0222523e786fe29bae26f8216c2e0fea54a7";
    public static SubLSymbol $g2788$;
    private static SubLSymbol $g2789$;
    private static SubLSymbol $g2790$;
    private static SubLSymbol $g2791$;
    private static final SubLSymbol $ic0$;
    private static final SubLInteger $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLObject $ic4$;
    private static final SubLObject $ic5$;
    private static final SubLObject $ic6$;
    private static final SubLObject $ic7$;
    private static final SubLObject $ic8$;
    private static final SubLList $ic9$;
    private static final SubLObject $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLObject $ic12$;
    private static final SubLObject $ic13$;
    private static final SubLObject $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLString $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLString $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    private static final SubLList $ic28$;
    private static final SubLString $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    
    public static SubLObject f20901(final SubLObject var1) {
        return module0004.f104(var1, $g2789$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f20902(final SubLObject var2) {
        return module0222.f14635($ic4$, var2, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f20903(final SubLObject var2) {
        return module0222.f14635($ic5$, var2, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f20904(final SubLObject var2) {
        return module0222.f14635($ic6$, var2, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f20905(final SubLObject var2) {
        return module0222.f14635($ic7$, var2, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f20906(final SubLObject var2) {
        return module0222.f14635($ic8$, var2, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f20907(final SubLObject var2, final SubLObject var3, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)NIL;
        final SubLObject var7 = var4;
        final SubLObject var8 = module0147.$g2095$.currentBinding(var5);
        final SubLObject var9 = module0147.$g2094$.currentBinding(var5);
        final SubLObject var10 = module0147.$g2096$.currentBinding(var5);
        try {
            module0147.$g2095$.bind(module0147.f9545(var7), var5);
            module0147.$g2094$.bind(module0147.f9546(var7), var5);
            module0147.$g2096$.bind(module0147.f9549(var7), var5);
            var6 = f20908(var2, var3);
        }
        finally {
            module0147.$g2096$.rebind(var10, var5);
            module0147.$g2094$.rebind(var9, var5);
            module0147.$g2095$.rebind(var8, var5);
        }
        return var6;
    }
    
    public static SubLObject f20908(final SubLObject var2, final SubLObject var3) {
        final SubLObject var4 = f20909(var2);
        final SubLObject var5 = ConsesLow.nth(module0048.f_1_(var3), var4);
        return f20910(var5);
    }
    
    public static SubLObject f20910(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        if (NIL == module0173.f10955(var12)) {
            SubLObject var14 = var12;
            SubLObject var15 = (SubLObject)NIL;
            var15 = var14.first();
            while (NIL != var14) {
                if (NIL == module0173.f10955(var15)) {
                    SubLObject var17;
                    final SubLObject var16 = var17 = var15;
                    SubLObject var18 = (SubLObject)NIL;
                    SubLObject var19 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)$ic9$);
                    var18 = var17.first();
                    var17 = (var19 = var17.rest());
                    SubLObject var20 = (SubLObject)NIL;
                    if (NIL == var20) {
                        SubLObject var21 = var19;
                        SubLObject var22 = (SubLObject)NIL;
                        var22 = var21.first();
                        while (NIL == var20 && NIL != var21) {
                            if (NIL != module0147.f9507(var22)) {
                                var20 = var18;
                            }
                            var21 = var21.rest();
                            var22 = var21.first();
                        }
                    }
                    final SubLObject var23 = var20;
                    if (NIL != var23) {
                        var13 = (SubLObject)ConsesLow.cons(var23, var13);
                    }
                }
                else {
                    final SubLObject var24 = var15;
                    if (NIL != module0147.f9507($ic10$)) {
                        var13 = (SubLObject)ConsesLow.cons(var24, var13);
                    }
                }
                var14 = var14.rest();
                var15 = var14.first();
            }
        }
        else if (NIL != module0147.f9507($ic10$)) {
            var13 = (SubLObject)ConsesLow.cons(var12, var13);
        }
        return Sequences.nreverse(var13);
    }
    
    public static SubLObject f20909(final SubLObject var2) {
        return Hashtables.gethash_without_values(var2, $g2788$.getGlobalValue(), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f20911() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)ZERO_INTEGER;
        final SubLObject var7 = module0147.$g2094$.currentBinding(var5);
        final SubLObject var8 = module0147.$g2095$.currentBinding(var5);
        try {
            module0147.$g2094$.bind((SubLObject)$ic11$, var5);
            module0147.$g2095$.bind($ic12$, var5);
            final SubLObject var9 = $ic13$;
            final SubLObject var8_25 = module0137.$g1605$.currentBinding(var5);
            final SubLObject var9_26 = module0139.$g1636$.currentBinding(var5);
            try {
                module0137.$g1605$.bind(module0137.f8955($ic14$), var5);
                module0139.$g1636$.bind(module0139.f9007(), var5);
                SubLObject var27_28 = var9;
                final SubLObject var10 = (SubLObject)$ic17$;
                final SubLObject var11 = module0056.f4145(var10);
                final SubLObject var8_26 = module0139.$g1635$.currentBinding(var5);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var5);
                    final SubLObject var12 = (SubLObject)NIL;
                    final SubLObject var8_27 = module0141.$g1714$.currentBinding(var5);
                    final SubLObject var9_27 = module0141.$g1715$.currentBinding(var5);
                    try {
                        module0141.$g1714$.bind((NIL != var12) ? var12 : module0141.f9283(), var5);
                        module0141.$g1715$.bind((SubLObject)((NIL != var12) ? $ic18$ : module0141.$g1715$.getDynamicValue(var5)), var5);
                        if (NIL != var12 && NIL != module0136.f8864() && NIL == module0141.f9279(var12)) {
                            final SubLObject var13 = module0136.$g1591$.getDynamicValue(var5);
                            if (var13.eql((SubLObject)$ic19$)) {
                                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic20$, var12, (SubLObject)$ic21$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var13.eql((SubLObject)$ic22$)) {
                                module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic23$, (SubLObject)$ic20$, var12, (SubLObject)$ic21$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var13.eql((SubLObject)$ic24$)) {
                                Errors.warn((SubLObject)$ic20$, var12, (SubLObject)$ic21$);
                            }
                            else {
                                Errors.warn((SubLObject)$ic25$, module0136.$g1591$.getDynamicValue(var5));
                                Errors.cerror((SubLObject)$ic23$, (SubLObject)$ic20$, var12, (SubLObject)$ic21$);
                            }
                        }
                        final SubLObject var8_28 = module0141.$g1670$.currentBinding(var5);
                        final SubLObject var9_28 = module0141.$g1671$.currentBinding(var5);
                        final SubLObject var14 = module0141.$g1672$.currentBinding(var5);
                        final SubLObject var15 = module0141.$g1674$.currentBinding(var5);
                        final SubLObject var16 = module0137.$g1605$.currentBinding(var5);
                        try {
                            module0141.$g1670$.bind(module0244.f15771(module0137.f8955($ic14$)), var5);
                            module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955($ic14$))), var5);
                            module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955($ic14$))), var5);
                            module0141.$g1674$.bind((SubLObject)NIL, var5);
                            module0137.$g1605$.bind(module0244.f15771(module0137.f8955($ic14$)), var5);
                            if (NIL != module0136.f8865() || NIL != module0244.f15795(var9, module0137.f8955((SubLObject)UNPROVIDED))) {
                                final SubLObject var8_29 = module0141.$g1677$.currentBinding(var5);
                                final SubLObject var9_29 = module0138.$g1619$.currentBinding(var5);
                                final SubLObject var10_42 = module0141.$g1674$.currentBinding(var5);
                                try {
                                    module0141.$g1677$.bind(module0141.f9210(), var5);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955($ic14$))), var5);
                                    module0141.$g1674$.bind((SubLObject)NIL, var5);
                                    module0249.f16055(var27_28, (SubLObject)UNPROVIDED);
                                    while (NIL != var27_28) {
                                        final SubLObject var17 = var27_28;
                                        SubLObject var19;
                                        final SubLObject var18 = var19 = module0200.f12443(module0137.f8955($ic14$));
                                        SubLObject var20 = (SubLObject)NIL;
                                        var20 = var19.first();
                                        while (NIL != var19) {
                                            final SubLObject var8_30 = module0137.$g1605$.currentBinding(var5);
                                            final SubLObject var9_30 = module0141.$g1674$.currentBinding(var5);
                                            try {
                                                module0137.$g1605$.bind(var20, var5);
                                                module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var5)) : module0141.$g1674$.getDynamicValue(var5)), var5);
                                                final SubLObject var21 = module0228.f15229(var17);
                                                if (NIL != module0138.f8992(var21)) {
                                                    final SubLObject var22 = module0242.f15664(var21, module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var22) {
                                                        final SubLObject var23 = module0245.f15834(var22, module0244.f15780(module0137.f8955($ic14$)), module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var23) {
                                                            SubLObject var24;
                                                            for (var24 = module0066.f4838(module0067.f4891(var23)); NIL == module0066.f4841(var24); var24 = module0066.f4840(var24)) {
                                                                var5.resetMultipleValues();
                                                                final SubLObject var25 = module0066.f4839(var24);
                                                                final SubLObject var26 = var5.secondMultipleValue();
                                                                var5.resetMultipleValues();
                                                                if (NIL != module0147.f9507(var25)) {
                                                                    final SubLObject var8_31 = module0138.$g1623$.currentBinding(var5);
                                                                    try {
                                                                        module0138.$g1623$.bind(var25, var5);
                                                                        SubLObject var51_55;
                                                                        for (var51_55 = module0066.f4838(module0067.f4891(var26)); NIL == module0066.f4841(var51_55); var51_55 = module0066.f4840(var51_55)) {
                                                                            var5.resetMultipleValues();
                                                                            final SubLObject var27 = module0066.f4839(var51_55);
                                                                            final SubLObject var28 = var5.secondMultipleValue();
                                                                            var5.resetMultipleValues();
                                                                            if (NIL != module0141.f9289(var27)) {
                                                                                final SubLObject var8_32 = module0138.$g1624$.currentBinding(var5);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var27, var5);
                                                                                    final SubLObject var29 = var28;
                                                                                    if (NIL != module0077.f5302(var29)) {
                                                                                        final SubLObject var30 = module0077.f5333(var29);
                                                                                        SubLObject var31;
                                                                                        SubLObject var32;
                                                                                        SubLObject var33;
                                                                                        for (var31 = module0032.f1741(var30), var32 = (SubLObject)NIL, var32 = module0032.f1742(var31, var30); NIL == module0032.f1744(var31, var32); var32 = module0032.f1743(var32)) {
                                                                                            var33 = module0032.f1745(var31, var32);
                                                                                            if (NIL != module0032.f1746(var32, var33) && NIL == module0249.f16059(var33, module0139.$g1636$.getDynamicValue(var5))) {
                                                                                                module0249.f16055(var33, module0139.$g1636$.getDynamicValue(var5));
                                                                                                if (NIL != module0173.f10955(var33)) {
                                                                                                    f20912(var33);
                                                                                                    var6 = Numbers.add(var6, (SubLObject)ONE_INTEGER);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var29.isList()) {
                                                                                        SubLObject var34 = var29;
                                                                                        SubLObject var35 = (SubLObject)NIL;
                                                                                        var35 = var34.first();
                                                                                        while (NIL != var34) {
                                                                                            if (NIL == module0249.f16059(var35, module0139.$g1636$.getDynamicValue(var5))) {
                                                                                                module0249.f16055(var35, module0139.$g1636$.getDynamicValue(var5));
                                                                                                if (NIL != module0173.f10955(var35)) {
                                                                                                    f20912(var35);
                                                                                                    var6 = Numbers.add(var6, (SubLObject)ONE_INTEGER);
                                                                                                }
                                                                                            }
                                                                                            var34 = var34.rest();
                                                                                            var35 = var34.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)$ic26$, var29);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var8_32, var5);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var51_55);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var8_31, var5);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var24);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic27$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                    }
                                                    if (NIL != module0200.f12419(var21, module0137.f8955((SubLObject)UNPROVIDED))) {
                                                        SubLObject var36 = module0248.f15995(var21);
                                                        SubLObject var37 = (SubLObject)NIL;
                                                        var37 = var36.first();
                                                        while (NIL != var36) {
                                                            SubLObject var39;
                                                            final SubLObject var38 = var39 = var37;
                                                            SubLObject var40 = (SubLObject)NIL;
                                                            SubLObject var41 = (SubLObject)NIL;
                                                            SubLObject var42 = (SubLObject)NIL;
                                                            cdestructuring_bind.destructuring_bind_must_consp(var39, var38, (SubLObject)$ic28$);
                                                            var40 = var39.first();
                                                            var39 = var39.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var39, var38, (SubLObject)$ic28$);
                                                            var41 = var39.first();
                                                            var39 = var39.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var39, var38, (SubLObject)$ic28$);
                                                            var42 = var39.first();
                                                            var39 = var39.rest();
                                                            if (NIL == var39) {
                                                                if (NIL != module0147.f9507(var41)) {
                                                                    final SubLObject var8_33 = module0138.$g1623$.currentBinding(var5);
                                                                    try {
                                                                        module0138.$g1623$.bind(var41, var5);
                                                                        if (NIL != module0141.f9289(var42)) {
                                                                            final SubLObject var8_34 = module0138.$g1624$.currentBinding(var5);
                                                                            try {
                                                                                module0138.$g1624$.bind(var42, var5);
                                                                                final SubLObject var29;
                                                                                final SubLObject var43 = var29 = (SubLObject)ConsesLow.list(var40);
                                                                                if (NIL != module0077.f5302(var29)) {
                                                                                    final SubLObject var30 = module0077.f5333(var29);
                                                                                    SubLObject var31;
                                                                                    SubLObject var32;
                                                                                    SubLObject var33;
                                                                                    for (var31 = module0032.f1741(var30), var32 = (SubLObject)NIL, var32 = module0032.f1742(var31, var30); NIL == module0032.f1744(var31, var32); var32 = module0032.f1743(var32)) {
                                                                                        var33 = module0032.f1745(var31, var32);
                                                                                        if (NIL != module0032.f1746(var32, var33) && NIL == module0249.f16059(var33, module0139.$g1636$.getDynamicValue(var5))) {
                                                                                            module0249.f16055(var33, module0139.$g1636$.getDynamicValue(var5));
                                                                                            if (NIL != module0173.f10955(var33)) {
                                                                                                f20912(var33);
                                                                                                var6 = Numbers.add(var6, (SubLObject)ONE_INTEGER);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var29.isList()) {
                                                                                    SubLObject var21_72 = var29;
                                                                                    SubLObject var35 = (SubLObject)NIL;
                                                                                    var35 = var21_72.first();
                                                                                    while (NIL != var21_72) {
                                                                                        if (NIL == module0249.f16059(var35, module0139.$g1636$.getDynamicValue(var5))) {
                                                                                            module0249.f16055(var35, module0139.$g1636$.getDynamicValue(var5));
                                                                                            if (NIL != module0173.f10955(var35)) {
                                                                                                f20912(var35);
                                                                                                var6 = Numbers.add(var6, (SubLObject)ONE_INTEGER);
                                                                                            }
                                                                                        }
                                                                                        var21_72 = var21_72.rest();
                                                                                        var35 = var21_72.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)$ic26$, var29);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var8_34, var5);
                                                                            }
                                                                        }
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var8_33, var5);
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                cdestructuring_bind.cdestructuring_bind_error(var38, (SubLObject)$ic28$);
                                                            }
                                                            var36 = var36.rest();
                                                            var37 = var36.first();
                                                        }
                                                    }
                                                }
                                                else if (NIL != module0155.f9785(var21, (SubLObject)UNPROVIDED)) {
                                                    SubLObject var14_74;
                                                    final SubLObject var44 = var14_74 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955($ic14$)), module0141.$g1714$.getDynamicValue(var5), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955($ic14$)), module0141.$g1714$.getDynamicValue(var5), module0137.f8955((SubLObject)UNPROVIDED)));
                                                    SubLObject var45 = (SubLObject)NIL;
                                                    var45 = var14_74.first();
                                                    while (NIL != var14_74) {
                                                        final SubLObject var8_35 = module0138.$g1625$.currentBinding(var5);
                                                        try {
                                                            module0138.$g1625$.bind(var45, var5);
                                                            final SubLObject var47;
                                                            final SubLObject var46 = var47 = Functions.funcall(var45, var21);
                                                            if (NIL != module0077.f5302(var47)) {
                                                                final SubLObject var48 = module0077.f5333(var47);
                                                                SubLObject var49;
                                                                SubLObject var50;
                                                                SubLObject var51;
                                                                for (var49 = module0032.f1741(var48), var50 = (SubLObject)NIL, var50 = module0032.f1742(var49, var48); NIL == module0032.f1744(var49, var50); var50 = module0032.f1743(var50)) {
                                                                    var51 = module0032.f1745(var49, var50);
                                                                    if (NIL != module0032.f1746(var50, var51) && NIL == module0249.f16059(var51, module0139.$g1636$.getDynamicValue(var5))) {
                                                                        module0249.f16055(var51, module0139.$g1636$.getDynamicValue(var5));
                                                                        if (NIL != module0173.f10955(var51)) {
                                                                            f20912(var51);
                                                                            var6 = Numbers.add(var6, (SubLObject)ONE_INTEGER);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            else if (var47.isList()) {
                                                                SubLObject var52 = var47;
                                                                SubLObject var53 = (SubLObject)NIL;
                                                                var53 = var52.first();
                                                                while (NIL != var52) {
                                                                    if (NIL == module0249.f16059(var53, module0139.$g1636$.getDynamicValue(var5))) {
                                                                        module0249.f16055(var53, module0139.$g1636$.getDynamicValue(var5));
                                                                        if (NIL != module0173.f10955(var53)) {
                                                                            f20912(var53);
                                                                            var6 = Numbers.add(var6, (SubLObject)ONE_INTEGER);
                                                                        }
                                                                    }
                                                                    var52 = var52.rest();
                                                                    var53 = var52.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)$ic26$, var47);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var8_35, var5);
                                                        }
                                                        var14_74 = var14_74.rest();
                                                        var45 = var14_74.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var9_30, var5);
                                                module0137.$g1605$.rebind(var8_30, var5);
                                            }
                                            var19 = var19.rest();
                                            var20 = var19.first();
                                        }
                                        SubLObject var55;
                                        final SubLObject var54 = var55 = module0200.f12443(module0244.f15771(module0137.f8955($ic14$)));
                                        SubLObject var56 = (SubLObject)NIL;
                                        var56 = var55.first();
                                        while (NIL != var55) {
                                            final SubLObject var8_36 = module0137.$g1605$.currentBinding(var5);
                                            final SubLObject var9_31 = module0141.$g1674$.currentBinding(var5);
                                            try {
                                                module0137.$g1605$.bind(var56, var5);
                                                module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var5)) : module0141.$g1674$.getDynamicValue(var5)), var5);
                                                final SubLObject var57 = module0228.f15229(var27_28);
                                                if (NIL != module0138.f8992(var57)) {
                                                    final SubLObject var58 = module0242.f15664(var57, module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var58) {
                                                        final SubLObject var59 = module0245.f15834(var58, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var59) {
                                                            SubLObject var60;
                                                            for (var60 = module0066.f4838(module0067.f4891(var59)); NIL == module0066.f4841(var60); var60 = module0066.f4840(var60)) {
                                                                var5.resetMultipleValues();
                                                                final SubLObject var61 = module0066.f4839(var60);
                                                                final SubLObject var62 = var5.secondMultipleValue();
                                                                var5.resetMultipleValues();
                                                                if (NIL != module0147.f9507(var61)) {
                                                                    final SubLObject var8_37 = module0138.$g1623$.currentBinding(var5);
                                                                    try {
                                                                        module0138.$g1623$.bind(var61, var5);
                                                                        SubLObject var51_56;
                                                                        for (var51_56 = module0066.f4838(module0067.f4891(var62)); NIL == module0066.f4841(var51_56); var51_56 = module0066.f4840(var51_56)) {
                                                                            var5.resetMultipleValues();
                                                                            final SubLObject var63 = module0066.f4839(var51_56);
                                                                            final SubLObject var64 = var5.secondMultipleValue();
                                                                            var5.resetMultipleValues();
                                                                            if (NIL != module0141.f9289(var63)) {
                                                                                final SubLObject var8_38 = module0138.$g1624$.currentBinding(var5);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var63, var5);
                                                                                    final SubLObject var65 = var64;
                                                                                    if (NIL != module0077.f5302(var65)) {
                                                                                        final SubLObject var66 = module0077.f5333(var65);
                                                                                        SubLObject var67;
                                                                                        SubLObject var68;
                                                                                        SubLObject var69;
                                                                                        for (var67 = module0032.f1741(var66), var68 = (SubLObject)NIL, var68 = module0032.f1742(var67, var66); NIL == module0032.f1744(var67, var68); var68 = module0032.f1743(var68)) {
                                                                                            var69 = module0032.f1745(var67, var68);
                                                                                            if (NIL != module0032.f1746(var68, var69) && NIL == module0249.f16059(var69, (SubLObject)UNPROVIDED)) {
                                                                                                module0249.f16055(var69, (SubLObject)UNPROVIDED);
                                                                                                module0056.f4149(var69, var11);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var65.isList()) {
                                                                                        SubLObject var70 = var65;
                                                                                        SubLObject var71 = (SubLObject)NIL;
                                                                                        var71 = var70.first();
                                                                                        while (NIL != var70) {
                                                                                            if (NIL == module0249.f16059(var71, (SubLObject)UNPROVIDED)) {
                                                                                                module0249.f16055(var71, (SubLObject)UNPROVIDED);
                                                                                                module0056.f4149(var71, var11);
                                                                                            }
                                                                                            var70 = var70.rest();
                                                                                            var71 = var70.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)$ic26$, var65);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var8_38, var5);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var51_56);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var8_37, var5);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var60);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic27$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                    }
                                                }
                                                else if (NIL != module0155.f9785(var57, (SubLObject)UNPROVIDED)) {
                                                    SubLObject var14_75;
                                                    final SubLObject var72 = var14_75 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var5), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var5), module0137.f8955((SubLObject)UNPROVIDED)));
                                                    SubLObject var73 = (SubLObject)NIL;
                                                    var73 = var14_75.first();
                                                    while (NIL != var14_75) {
                                                        final SubLObject var8_39 = module0138.$g1625$.currentBinding(var5);
                                                        try {
                                                            module0138.$g1625$.bind(var73, var5);
                                                            final SubLObject var75;
                                                            final SubLObject var74 = var75 = Functions.funcall(var73, var57);
                                                            if (NIL != module0077.f5302(var75)) {
                                                                final SubLObject var76 = module0077.f5333(var75);
                                                                SubLObject var77;
                                                                SubLObject var78;
                                                                SubLObject var79;
                                                                for (var77 = module0032.f1741(var76), var78 = (SubLObject)NIL, var78 = module0032.f1742(var77, var76); NIL == module0032.f1744(var77, var78); var78 = module0032.f1743(var78)) {
                                                                    var79 = module0032.f1745(var77, var78);
                                                                    if (NIL != module0032.f1746(var78, var79) && NIL == module0249.f16059(var79, (SubLObject)UNPROVIDED)) {
                                                                        module0249.f16055(var79, (SubLObject)UNPROVIDED);
                                                                        module0056.f4149(var79, var11);
                                                                    }
                                                                }
                                                            }
                                                            else if (var75.isList()) {
                                                                SubLObject var80 = var75;
                                                                SubLObject var81 = (SubLObject)NIL;
                                                                var81 = var80.first();
                                                                while (NIL != var80) {
                                                                    if (NIL == module0249.f16059(var81, (SubLObject)UNPROVIDED)) {
                                                                        module0249.f16055(var81, (SubLObject)UNPROVIDED);
                                                                        module0056.f4149(var81, var11);
                                                                    }
                                                                    var80 = var80.rest();
                                                                    var81 = var80.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)$ic26$, var75);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var8_39, var5);
                                                        }
                                                        var14_75 = var14_75.rest();
                                                        var73 = var14_75.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var9_31, var5);
                                                module0137.$g1605$.rebind(var8_36, var5);
                                            }
                                            var55 = var55.rest();
                                            var56 = var55.first();
                                        }
                                        var27_28 = module0056.f4150(var11);
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var10_42, var5);
                                    module0138.$g1619$.rebind(var9_29, var5);
                                    module0141.$g1677$.rebind(var8_29, var5);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic29$, var9, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var16, var5);
                            module0141.$g1674$.rebind(var15, var5);
                            module0141.$g1672$.rebind(var14, var5);
                            module0141.$g1671$.rebind(var9_28, var5);
                            module0141.$g1670$.rebind(var8_28, var5);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var9_27, var5);
                        module0141.$g1714$.rebind(var8_27, var5);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var5));
                }
                finally {
                    module0139.$g1635$.rebind(var8_26, var5);
                }
                module0139.f9011(module0139.$g1636$.getDynamicValue(var5));
            }
            finally {
                module0139.$g1636$.rebind(var9_26, var5);
                module0137.$g1605$.rebind(var8_25, var5);
            }
        }
        finally {
            module0147.$g2095$.rebind(var8, var5);
            module0147.$g2094$.rebind(var7, var5);
        }
        f20913();
        return var6;
    }
    
    public static SubLObject f20914(final SubLObject var87, final SubLObject var3) {
        return (SubLObject)makeBoolean(NIL != $g2791$.getGlobalValue() && NIL != f20915(var3) && NIL != f20901(var87));
    }
    
    public static SubLObject f20915(final SubLObject var1) {
        return (SubLObject)makeBoolean(var1.isInteger() && var1.numGE((SubLObject)ONE_INTEGER) && var1.numLE((SubLObject)SIX_INTEGER));
    }
    
    public static SubLObject f20912(final SubLObject var2) {
        final SubLObject var3 = f20916(var2);
        final SubLObject var4 = f20917(var2, var3);
        f20918(var2, var4);
        return var4;
    }
    
    public static SubLObject f20917(final SubLObject var2, final SubLObject var88) {
        final SubLThread var89 = SubLProcess.currentSubLThread();
        SubLObject var90 = (SubLObject)NIL;
        final SubLObject var91 = module0147.$g2094$.currentBinding(var89);
        final SubLObject var92 = module0147.$g2095$.currentBinding(var89);
        try {
            module0147.$g2094$.bind((SubLObject)$ic11$, var89);
            module0147.$g2095$.bind($ic12$, var89);
            SubLObject var93 = $g2789$.getGlobalValue();
            SubLObject var94 = (SubLObject)NIL;
            var94 = var93.first();
            while (NIL != var93) {
                final SubLObject var95 = f20919(var94);
                if (var95.numLE(var88)) {
                    final SubLObject var96 = f20920(var2, var94);
                    var90 = (SubLObject)ConsesLow.cons(var96, var90);
                }
                var93 = var93.rest();
                var94 = var93.first();
            }
        }
        finally {
            module0147.$g2095$.rebind(var92, var89);
            module0147.$g2094$.rebind(var91, var89);
        }
        var90 = Sequences.nreverse(var90);
        return var90;
    }
    
    public static SubLObject f20920(final SubLObject var2, final SubLObject var87) {
        SubLObject var88 = (SubLObject)NIL;
        if (NIL != module0158.f10010(var2, (SubLObject)ONE_INTEGER, var87)) {
            final SubLObject var89 = module0158.f10011(var2, (SubLObject)ONE_INTEGER, var87);
            SubLObject var90 = (SubLObject)NIL;
            final SubLObject var91 = (SubLObject)NIL;
            while (NIL == var90) {
                final SubLObject var92 = module0052.f3695(var89, var91);
                final SubLObject var93 = (SubLObject)makeBoolean(!var91.eql(var92));
                if (NIL != var93) {
                    SubLObject var94 = (SubLObject)NIL;
                    try {
                        var94 = module0158.f10316(var92, (SubLObject)$ic30$, (SubLObject)$ic31$, (SubLObject)NIL);
                        SubLObject var94_99 = (SubLObject)NIL;
                        final SubLObject var95_100 = (SubLObject)NIL;
                        while (NIL == var94_99) {
                            final SubLObject var95 = module0052.f3695(var94, var95_100);
                            final SubLObject var97_102 = (SubLObject)makeBoolean(!var95_100.eql(var95));
                            if (NIL != var97_102 && NIL != module0226.f15088(var95, (SubLObject)$ic31$)) {
                                final SubLObject var96 = module0178.f11335(var95);
                                final SubLObject var97 = module0178.f11287(var95);
                                if (NIL != module0173.f10955(var96)) {
                                    var88 = module0035.f2313(var88, var96, var97, Symbols.symbol_function((SubLObject)EQL));
                                }
                            }
                            var94_99 = (SubLObject)makeBoolean(NIL == var97_102);
                        }
                    }
                    finally {
                        final SubLObject var98 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                            if (NIL != var94) {
                                module0158.f10319(var94);
                            }
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var98);
                        }
                    }
                }
                var90 = (SubLObject)makeBoolean(NIL == var93);
            }
        }
        SubLObject var99;
        SubLObject var100;
        SubLObject var102;
        SubLObject var101;
        SubLObject var103;
        SubLObject var104;
        for (var99 = (SubLObject)NIL, var99 = var88; !var99.isAtom(); var99 = var99.rest()) {
            var100 = var99.first();
            var101 = (var102 = var100);
            var103 = (SubLObject)NIL;
            var104 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var102, var101, (SubLObject)$ic9$);
            var103 = var102.first();
            var102 = (var104 = var102.rest());
            if (NIL != module0035.f1997(var104) && $ic10$.eql(var104.first())) {
                ConsesLow.rplaca(var99, var103);
            }
        }
        if (NIL != module0035.f1997(var88) && NIL != module0173.f10955(var88.first())) {
            var88 = var88.first();
        }
        return var88;
    }
    
    public static SubLObject f20918(final SubLObject var2, final SubLObject var11) {
        return Hashtables.sethash(var2, $g2788$.getGlobalValue(), var11);
    }
    
    public static SubLObject f20916(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = $g2790$.getGlobalValue();
        SubLObject var5 = (SubLObject)NIL;
        var5 = var4.first();
        while (NIL != var4) {
            final SubLObject var6 = var5;
            if (NIL != module0158.f10010(var2, (SubLObject)ONE_INTEGER, var6)) {
                final SubLObject var7 = module0158.f10011(var2, (SubLObject)ONE_INTEGER, var6);
                SubLObject var8 = var3;
                final SubLObject var9 = (SubLObject)NIL;
                while (NIL == var8) {
                    final SubLObject var10 = module0052.f3695(var7, var9);
                    final SubLObject var11 = (SubLObject)makeBoolean(!var9.eql(var10));
                    if (NIL != var11) {
                        SubLObject var12 = (SubLObject)NIL;
                        try {
                            var12 = module0158.f10316(var10, (SubLObject)$ic30$, (SubLObject)$ic31$, (SubLObject)NIL);
                            SubLObject var94_106 = var3;
                            final SubLObject var95_107 = (SubLObject)NIL;
                            while (NIL == var94_106) {
                                final SubLObject var13 = module0052.f3695(var12, var95_107);
                                final SubLObject var97_108 = (SubLObject)makeBoolean(!var95_107.eql(var13));
                                if (NIL != var97_108) {
                                    var3 = f20919(var5);
                                }
                                var94_106 = (SubLObject)makeBoolean(NIL == var97_108 || NIL != var3);
                            }
                        }
                        finally {
                            final SubLObject var14 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                if (NIL != var12) {
                                    module0158.f10319(var12);
                                }
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var14);
                            }
                        }
                    }
                    var8 = (SubLObject)makeBoolean(NIL == var11 || NIL != var3);
                }
            }
            var4 = var4.rest();
            var5 = var4.first();
        }
        return (SubLObject)((NIL != var3) ? var3 : ZERO_INTEGER);
    }
    
    public static SubLObject f20919(final SubLObject var87) {
        return module0226.f14914(var87);
    }
    
    public static SubLObject f20921(final SubLObject var109, final SubLObject var110) {
        return f20922(var110);
    }
    
    public static SubLObject f20923(final SubLObject var109, final SubLObject var110) {
        return f20922(var110);
    }
    
    public static SubLObject f20922(final SubLObject var111) {
        assert NIL != module0178.f11284(var111) : var111;
        final SubLObject var112 = module0178.f11332(var111);
        assert NIL != f20901(var112) : var112;
        final SubLObject var113 = module0178.f11334(var111);
        if (NIL != module0173.f10955(var113)) {
            f20912(var113);
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20913() {
        $g2791$.setGlobalValue((SubLObject)T);
        return (SubLObject)T;
    }
    
    public static SubLObject f20924() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0308", "f20901", "S#23531", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0308", "f20902", "S#17588", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0308", "f20903", "S#17584", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0308", "f20904", "S#17592", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0308", "f20905", "S#17591", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0308", "f20906", "S#17585", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0308", "f20907", "S#17590", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0308", "f20908", "S#22685", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0308", "f20910", "S#23532", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0308", "f20909", "S#23533", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0308", "f20911", "S#23534", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0308", "f20914", "S#17589", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0308", "f20915", "S#23535", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0308", "f20912", "S#23536", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0308", "f20917", "S#23537", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0308", "f20920", "S#23538", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0308", "f20918", "S#23539", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0308", "f20916", "S#23540", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0308", "f20919", "S#23541", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0308", "f20921", "CYC-ADD-TO-ARG-TYPE-CACHE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0308", "f20923", "CYC-REMOVE-FROM-ARG-TYPE-CACHE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0308", "f20922", "S#23542", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0308", "f20913", "S#23543", 0, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20925() {
        $g2788$ = SubLFiles.deflexical("S#23544", (NIL != Symbols.boundp((SubLObject)$ic0$)) ? $g2788$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)$ic1$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g2789$ = SubLFiles.deflexical("S#23545", (SubLObject)$ic2$);
        $g2790$ = SubLFiles.deflexical("S#23546", Sequences.reverse($g2789$.getGlobalValue()));
        $g2791$ = SubLFiles.deflexical("S#23547", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic3$)) ? $g2791$.getGlobalValue() : NIL));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20926() {
        module0003.f57((SubLObject)$ic0$);
        module0003.f57((SubLObject)$ic3$);
        module0012.f416((SubLObject)$ic32$);
        module0012.f416((SubLObject)$ic33$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f20924();
    }
    
    public void initializeVariables() {
        f20925();
    }
    
    public void runTopLevelForms() {
        f20926();
    }
    
    static {
        me = (SubLFile)new module0308();
        $g2788$ = null;
        $g2789$ = null;
        $g2790$ = null;
        $g2791$ = null;
        $ic0$ = makeSymbol("S#23544", "CYC");
        $ic1$ = makeInteger(1024);
        $ic2$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("arg1Isa")), constant_handles_oc.f8479((SubLObject)makeString("arg2Isa")), constant_handles_oc.f8479((SubLObject)makeString("arg3Isa")), constant_handles_oc.f8479((SubLObject)makeString("arg4Isa")), constant_handles_oc.f8479((SubLObject)makeString("arg5Isa")), constant_handles_oc.f8479((SubLObject)makeString("arg6Isa")));
        $ic3$ = makeSymbol("S#23547", "CYC");
        $ic4$ = constant_handles_oc.f8479((SubLObject)makeString("argsIsa"));
        $ic5$ = constant_handles_oc.f8479((SubLObject)makeString("argAndRestIsa"));
        $ic6$ = constant_handles_oc.f8479((SubLObject)makeString("argAndRestGenl"));
        $ic7$ = constant_handles_oc.f8479((SubLObject)makeString("argsQuotedIsa"));
        $ic8$ = constant_handles_oc.f8479((SubLObject)makeString("argAndRestQuotedIsa"));
        $ic9$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#12455", "CYC"), (SubLObject)makeSymbol("S#12701", "CYC"));
        $ic10$ = constant_handles_oc.f8479((SubLObject)makeString("UniversalVocabularyMt"));
        $ic11$ = makeSymbol("S#12274", "CYC");
        $ic12$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic13$ = constant_handles_oc.f8479((SubLObject)makeString("Relation"));
        $ic14$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic15$ = makeKeyword("BREADTH");
        $ic16$ = makeKeyword("QUEUE");
        $ic17$ = makeKeyword("STACK");
        $ic18$ = makeSymbol("S#11450", "CYC");
        $ic19$ = makeKeyword("ERROR");
        $ic20$ = makeString("~A is not a ~A");
        $ic21$ = makeSymbol("S#11592", "CYC");
        $ic22$ = makeKeyword("CERROR");
        $ic23$ = makeString("continue anyway");
        $ic24$ = makeKeyword("WARN");
        $ic25$ = makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic26$ = makeString("~A is neither SET-P nor LISTP.");
        $ic27$ = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic28$ = ConsesLow.list((SubLObject)makeUninternedSymbol("US#4D5E436"), (SubLObject)makeUninternedSymbol("US#1526883"), (SubLObject)makeUninternedSymbol("US#15AA083"));
        $ic29$ = makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic30$ = makeKeyword("GAF");
        $ic31$ = makeKeyword("TRUE");
        $ic32$ = makeSymbol("CYC-ADD-TO-ARG-TYPE-CACHE");
        $ic33$ = makeSymbol("CYC-REMOVE-FROM-ARG-TYPE-CACHE");
        $ic34$ = makeSymbol("S#11995", "CYC");
        $ic35$ = makeSymbol("S#23531", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 909 ms
	
	Decompiled with Procyon 0.5.32.
*/