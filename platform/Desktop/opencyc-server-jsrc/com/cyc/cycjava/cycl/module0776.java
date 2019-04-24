package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0776 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0776";
    public static final String myFingerPrint = "f1744f7afba865ba5467c60e9f580f60666de89480326f93cba2a5a842e93799";
    private static SubLSymbol $g6229$;
    private static SubLSymbol $g6234$;
    private static SubLSymbol $g6235$;
    private static SubLSymbol $g6236$;
    private static SubLSymbol $g6237$;
    private static SubLSymbol $g6238$;
    private static SubLSymbol $g6239$;
    private static SubLSymbol $g6240$;
    private static SubLSymbol $g6231$;
    private static SubLSymbol $g6232$;
    private static SubLSymbol $g6233$;
    private static SubLSymbol $g6230$;
    private static final SubLSymbol $ic0$;
    private static final SubLObject $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLObject $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLString $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLString $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLString $ic13$;
    private static final SubLString $ic14$;
    private static final SubLString $ic15$;
    private static final SubLList $ic16$;
    private static final SubLString $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLList $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLList $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLObject $ic26$;
    private static final SubLObject $ic27$;
    private static final SubLObject $ic28$;
    private static final SubLObject $ic29$;
    private static final SubLObject $ic30$;
    private static final SubLObject $ic31$;
    private static final SubLObject $ic32$;
    private static final SubLObject $ic33$;
    private static final SubLObject $ic34$;
    private static final SubLObject $ic35$;
    private static final SubLObject $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLList $ic41$;
    private static final SubLList $ic42$;
    private static final SubLObject $ic43$;
    private static final SubLString $ic44$;
    private static final SubLString $ic45$;
    private static final SubLString $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLObject $ic48$;
    private static final SubLString $ic49$;
    
    public static SubLObject f49984() {
        final SubLObject var1 = module0776.$g6229$.getGlobalValue();
        if (module0776.NIL != var1) {
            module0034.f1818(var1);
        }
        return (SubLObject)module0776.NIL;
    }
    
    public static SubLObject f49985(SubLObject var2) {
        if (var2 == module0776.UNPROVIDED) {
            var2 = module0776.$g6230$.getGlobalValue();
        }
        return module0034.f1829(module0776.$g6229$.getGlobalValue(), (SubLObject)ConsesLow.list(var2), (SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED);
    }
    
    public static SubLObject f49986(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)module0776.NIL;
        final SubLObject var5 = module0776.$g6231$.getGlobalValue();
        final SubLObject var6 = module0137.$g1605$.currentBinding(var3);
        final SubLObject var7 = module0139.$g1636$.currentBinding(var3);
        try {
            module0137.$g1605$.bind(module0137.f8955(module0776.$ic1$), var3);
            module0139.$g1636$.bind(module0139.f9007(), var3);
            SubLObject var8_9 = var5;
            final SubLObject var8 = (SubLObject)module0776.$ic4$;
            final SubLObject var9 = module0056.f4145(var8);
            final SubLObject var6_12 = module0139.$g1635$.currentBinding(var3);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var3);
                final SubLObject var6_13 = module0147.$g2095$.currentBinding(var3);
                final SubLObject var7_15 = module0147.$g2094$.currentBinding(var3);
                final SubLObject var10 = module0147.$g2096$.currentBinding(var3);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var2), var3);
                    module0147.$g2094$.bind(module0147.f9546(var2), var3);
                    module0147.$g2096$.bind(module0147.f9549(var2), var3);
                    final SubLObject var11 = module0776.$ic5$;
                    final SubLObject var6_14 = module0141.$g1714$.currentBinding(var3);
                    final SubLObject var7_16 = module0141.$g1715$.currentBinding(var3);
                    try {
                        module0141.$g1714$.bind((module0776.NIL != var11) ? var11 : module0141.f9283(), var3);
                        module0141.$g1715$.bind((SubLObject)((module0776.NIL != var11) ? module0776.$ic6$ : module0141.$g1715$.getDynamicValue(var3)), var3);
                        if (module0776.NIL != var11 && module0776.NIL != module0136.f8864() && module0776.NIL == module0141.f9279(var11)) {
                            final SubLObject var12 = module0136.$g1591$.getDynamicValue(var3);
                            if (var12.eql((SubLObject)module0776.$ic7$)) {
                                module0136.f8870((SubLObject)module0776.ONE_INTEGER, (SubLObject)module0776.$ic8$, var11, (SubLObject)module0776.$ic9$, (SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED);
                            }
                            else if (var12.eql((SubLObject)module0776.$ic10$)) {
                                module0136.f8871((SubLObject)module0776.ONE_INTEGER, (SubLObject)module0776.$ic11$, (SubLObject)module0776.$ic8$, var11, (SubLObject)module0776.$ic9$, (SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED);
                            }
                            else if (var12.eql((SubLObject)module0776.$ic12$)) {
                                Errors.warn((SubLObject)module0776.$ic8$, var11, (SubLObject)module0776.$ic9$);
                            }
                            else {
                                Errors.warn((SubLObject)module0776.$ic13$, module0136.$g1591$.getDynamicValue(var3));
                                Errors.cerror((SubLObject)module0776.$ic11$, (SubLObject)module0776.$ic8$, var11, (SubLObject)module0776.$ic9$);
                            }
                        }
                        final SubLObject var6_15 = module0141.$g1670$.currentBinding(var3);
                        final SubLObject var7_17 = module0141.$g1671$.currentBinding(var3);
                        final SubLObject var16_23 = module0141.$g1672$.currentBinding(var3);
                        final SubLObject var13 = module0141.$g1674$.currentBinding(var3);
                        final SubLObject var14 = module0137.$g1605$.currentBinding(var3);
                        try {
                            module0141.$g1670$.bind(module0244.f15771(module0137.f8955(module0776.$ic1$)), var3);
                            module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955(module0776.$ic1$))), var3);
                            module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955(module0776.$ic1$))), var3);
                            module0141.$g1674$.bind((SubLObject)module0776.NIL, var3);
                            module0137.$g1605$.bind(module0244.f15771(module0137.f8955(module0776.$ic1$)), var3);
                            if (module0776.NIL != module0136.f8865() || module0776.NIL != module0244.f15795(var5, module0137.f8955((SubLObject)module0776.UNPROVIDED))) {
                                final SubLObject var6_16 = module0141.$g1677$.currentBinding(var3);
                                final SubLObject var7_18 = module0138.$g1619$.currentBinding(var3);
                                final SubLObject var16_24 = module0141.$g1674$.currentBinding(var3);
                                try {
                                    module0141.$g1677$.bind(module0141.f9210(), var3);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955(module0776.$ic1$))), var3);
                                    module0141.$g1674$.bind((SubLObject)module0776.NIL, var3);
                                    module0249.f16055(var8_9, (SubLObject)module0776.UNPROVIDED);
                                    while (module0776.NIL != var8_9) {
                                        final SubLObject var15 = var8_9;
                                        SubLObject var17;
                                        final SubLObject var16 = var17 = module0200.f12443(module0137.f8955(module0776.$ic1$));
                                        SubLObject var18 = (SubLObject)module0776.NIL;
                                        var18 = var17.first();
                                        while (module0776.NIL != var17) {
                                            final SubLObject var6_17 = module0137.$g1605$.currentBinding(var3);
                                            final SubLObject var7_19 = module0141.$g1674$.currentBinding(var3);
                                            try {
                                                module0137.$g1605$.bind(var18, var3);
                                                module0141.$g1674$.bind((SubLObject)((module0776.NIL != module0141.f9205((SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0776.NIL == module0141.$g1674$.getDynamicValue(var3)) : module0141.$g1674$.getDynamicValue(var3)), var3);
                                                final SubLObject var19 = module0228.f15229(var15);
                                                if (module0776.NIL != module0138.f8992(var19)) {
                                                    final SubLObject var20 = module0242.f15664(var19, module0137.f8955((SubLObject)module0776.UNPROVIDED));
                                                    if (module0776.NIL != var20) {
                                                        final SubLObject var21 = module0245.f15834(var20, module0244.f15780(module0137.f8955(module0776.$ic1$)), module0137.f8955((SubLObject)module0776.UNPROVIDED));
                                                        if (module0776.NIL != var21) {
                                                            SubLObject var22;
                                                            for (var22 = module0066.f4838(module0067.f4891(var21)); module0776.NIL == module0066.f4841(var22); var22 = module0066.f4840(var22)) {
                                                                var3.resetMultipleValues();
                                                                final SubLObject var39_40 = module0066.f4839(var22);
                                                                final SubLObject var23 = var3.secondMultipleValue();
                                                                var3.resetMultipleValues();
                                                                if (module0776.NIL != module0147.f9507(var39_40)) {
                                                                    final SubLObject var6_18 = module0138.$g1623$.currentBinding(var3);
                                                                    try {
                                                                        module0138.$g1623$.bind(var39_40, var3);
                                                                        SubLObject var38_43;
                                                                        for (var38_43 = module0066.f4838(module0067.f4891(var23)); module0776.NIL == module0066.f4841(var38_43); var38_43 = module0066.f4840(var38_43)) {
                                                                            var3.resetMultipleValues();
                                                                            final SubLObject var24 = module0066.f4839(var38_43);
                                                                            final SubLObject var25 = var3.secondMultipleValue();
                                                                            var3.resetMultipleValues();
                                                                            if (module0776.NIL != module0141.f9289(var24)) {
                                                                                final SubLObject var6_19 = module0138.$g1624$.currentBinding(var3);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var24, var3);
                                                                                    final SubLObject var26 = var25;
                                                                                    if (module0776.NIL != module0077.f5302(var26)) {
                                                                                        final SubLObject var27 = module0077.f5333(var26);
                                                                                        SubLObject var28;
                                                                                        SubLObject var29;
                                                                                        SubLObject var30;
                                                                                        SubLObject var31;
                                                                                        SubLObject var32;
                                                                                        for (var28 = module0032.f1741(var27), var29 = (SubLObject)module0776.NIL, var29 = module0032.f1742(var28, var27); module0776.NIL == module0032.f1744(var28, var29); var29 = module0032.f1743(var29)) {
                                                                                            var30 = module0032.f1745(var28, var29);
                                                                                            if (module0776.NIL != module0032.f1746(var29, var30) && module0776.NIL == module0249.f16059(var30, module0139.$g1636$.getDynamicValue(var3))) {
                                                                                                module0249.f16055(var30, module0139.$g1636$.getDynamicValue(var3));
                                                                                                if (module0776.NIL != module0173.f10955(var30)) {
                                                                                                    var31 = module0220.f14553(var30, module0776.$g6232$.getGlobalValue(), (SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED);
                                                                                                    var32 = module0220.f14562(var30, module0776.$g6233$.getGlobalValue(), (SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED);
                                                                                                    var4 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var30, var31, var32), var4);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var26.isList()) {
                                                                                        SubLObject var33 = var26;
                                                                                        SubLObject var34 = (SubLObject)module0776.NIL;
                                                                                        var34 = var33.first();
                                                                                        while (module0776.NIL != var33) {
                                                                                            if (module0776.NIL == module0249.f16059(var34, module0139.$g1636$.getDynamicValue(var3))) {
                                                                                                module0249.f16055(var34, module0139.$g1636$.getDynamicValue(var3));
                                                                                                if (module0776.NIL != module0173.f10955(var34)) {
                                                                                                    final SubLObject var35 = module0220.f14553(var34, module0776.$g6232$.getGlobalValue(), (SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED);
                                                                                                    final SubLObject var36 = module0220.f14562(var34, module0776.$g6233$.getGlobalValue(), (SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED);
                                                                                                    var4 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var34, var35, var36), var4);
                                                                                                }
                                                                                            }
                                                                                            var33 = var33.rest();
                                                                                            var34 = var33.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0776.$ic14$, var26);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var6_19, var3);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var38_43);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var6_18, var3);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var22);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0776.FIVE_INTEGER, (SubLObject)module0776.$ic15$, (SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED);
                                                    }
                                                    if (module0776.NIL != module0200.f12419(var19, module0137.f8955((SubLObject)module0776.UNPROVIDED))) {
                                                        SubLObject var37 = module0248.f15995(var19);
                                                        SubLObject var38 = (SubLObject)module0776.NIL;
                                                        var38 = var37.first();
                                                        while (module0776.NIL != var37) {
                                                            SubLObject var40;
                                                            final SubLObject var39 = var40 = var38;
                                                            SubLObject var41 = (SubLObject)module0776.NIL;
                                                            SubLObject var59_60 = (SubLObject)module0776.NIL;
                                                            SubLObject var42 = (SubLObject)module0776.NIL;
                                                            cdestructuring_bind.destructuring_bind_must_consp(var40, var39, (SubLObject)module0776.$ic16$);
                                                            var41 = var40.first();
                                                            var40 = var40.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var40, var39, (SubLObject)module0776.$ic16$);
                                                            var59_60 = var40.first();
                                                            var40 = var40.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var40, var39, (SubLObject)module0776.$ic16$);
                                                            var42 = var40.first();
                                                            var40 = var40.rest();
                                                            if (module0776.NIL == var40) {
                                                                if (module0776.NIL != module0147.f9507(var59_60)) {
                                                                    final SubLObject var6_20 = module0138.$g1623$.currentBinding(var3);
                                                                    try {
                                                                        module0138.$g1623$.bind(var59_60, var3);
                                                                        if (module0776.NIL != module0141.f9289(var42)) {
                                                                            final SubLObject var6_21 = module0138.$g1624$.currentBinding(var3);
                                                                            try {
                                                                                module0138.$g1624$.bind(var42, var3);
                                                                                final SubLObject var26;
                                                                                final SubLObject var43 = var26 = (SubLObject)ConsesLow.list(var41);
                                                                                if (module0776.NIL != module0077.f5302(var26)) {
                                                                                    final SubLObject var27 = module0077.f5333(var26);
                                                                                    SubLObject var28;
                                                                                    SubLObject var29;
                                                                                    SubLObject var30;
                                                                                    SubLObject var31;
                                                                                    SubLObject var32;
                                                                                    for (var28 = module0032.f1741(var27), var29 = (SubLObject)module0776.NIL, var29 = module0032.f1742(var28, var27); module0776.NIL == module0032.f1744(var28, var29); var29 = module0032.f1743(var29)) {
                                                                                        var30 = module0032.f1745(var28, var29);
                                                                                        if (module0776.NIL != module0032.f1746(var29, var30) && module0776.NIL == module0249.f16059(var30, module0139.$g1636$.getDynamicValue(var3))) {
                                                                                            module0249.f16055(var30, module0139.$g1636$.getDynamicValue(var3));
                                                                                            if (module0776.NIL != module0173.f10955(var30)) {
                                                                                                var31 = module0220.f14553(var30, module0776.$g6232$.getGlobalValue(), (SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED);
                                                                                                var32 = module0220.f14562(var30, module0776.$g6233$.getGlobalValue(), (SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED);
                                                                                                var4 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var30, var31, var32), var4);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var26.isList()) {
                                                                                    SubLObject var54_64 = var26;
                                                                                    SubLObject var34 = (SubLObject)module0776.NIL;
                                                                                    var34 = var54_64.first();
                                                                                    while (module0776.NIL != var54_64) {
                                                                                        if (module0776.NIL == module0249.f16059(var34, module0139.$g1636$.getDynamicValue(var3))) {
                                                                                            module0249.f16055(var34, module0139.$g1636$.getDynamicValue(var3));
                                                                                            if (module0776.NIL != module0173.f10955(var34)) {
                                                                                                final SubLObject var35 = module0220.f14553(var34, module0776.$g6232$.getGlobalValue(), (SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED);
                                                                                                final SubLObject var36 = module0220.f14562(var34, module0776.$g6233$.getGlobalValue(), (SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED);
                                                                                                var4 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var34, var35, var36), var4);
                                                                                            }
                                                                                        }
                                                                                        var54_64 = var54_64.rest();
                                                                                        var34 = var54_64.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)module0776.$ic14$, var26);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var6_21, var3);
                                                                            }
                                                                        }
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var6_20, var3);
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                cdestructuring_bind.cdestructuring_bind_error(var39, (SubLObject)module0776.$ic16$);
                                                            }
                                                            var37 = var37.rest();
                                                            var38 = var37.first();
                                                        }
                                                    }
                                                }
                                                else if (module0776.NIL != module0155.f9785(var19, (SubLObject)module0776.UNPROVIDED)) {
                                                    SubLObject var31_66;
                                                    final SubLObject var44 = var31_66 = ((module0776.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955(module0776.$ic1$)), module0141.$g1714$.getDynamicValue(var3), module0137.f8955((SubLObject)module0776.UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955(module0776.$ic1$)), module0141.$g1714$.getDynamicValue(var3), module0137.f8955((SubLObject)module0776.UNPROVIDED)));
                                                    SubLObject var45 = (SubLObject)module0776.NIL;
                                                    var45 = var31_66.first();
                                                    while (module0776.NIL != var31_66) {
                                                        final SubLObject var6_22 = module0138.$g1625$.currentBinding(var3);
                                                        try {
                                                            module0138.$g1625$.bind(var45, var3);
                                                            final SubLObject var47;
                                                            final SubLObject var46 = var47 = Functions.funcall(var45, var19);
                                                            if (module0776.NIL != module0077.f5302(var47)) {
                                                                final SubLObject var48 = module0077.f5333(var47);
                                                                SubLObject var49;
                                                                SubLObject var50;
                                                                SubLObject var51;
                                                                SubLObject var52;
                                                                SubLObject var53;
                                                                for (var49 = module0032.f1741(var48), var50 = (SubLObject)module0776.NIL, var50 = module0032.f1742(var49, var48); module0776.NIL == module0032.f1744(var49, var50); var50 = module0032.f1743(var50)) {
                                                                    var51 = module0032.f1745(var49, var50);
                                                                    if (module0776.NIL != module0032.f1746(var50, var51) && module0776.NIL == module0249.f16059(var51, module0139.$g1636$.getDynamicValue(var3))) {
                                                                        module0249.f16055(var51, module0139.$g1636$.getDynamicValue(var3));
                                                                        if (module0776.NIL != module0173.f10955(var51)) {
                                                                            var52 = module0220.f14553(var51, module0776.$g6232$.getGlobalValue(), (SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED);
                                                                            var53 = module0220.f14562(var51, module0776.$g6233$.getGlobalValue(), (SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED);
                                                                            var4 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var51, var52, var53), var4);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            else if (var47.isList()) {
                                                                SubLObject var54 = var47;
                                                                SubLObject var55 = (SubLObject)module0776.NIL;
                                                                var55 = var54.first();
                                                                while (module0776.NIL != var54) {
                                                                    if (module0776.NIL == module0249.f16059(var55, module0139.$g1636$.getDynamicValue(var3))) {
                                                                        module0249.f16055(var55, module0139.$g1636$.getDynamicValue(var3));
                                                                        if (module0776.NIL != module0173.f10955(var55)) {
                                                                            final SubLObject var56 = module0220.f14553(var55, module0776.$g6232$.getGlobalValue(), (SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED);
                                                                            final SubLObject var57 = module0220.f14562(var55, module0776.$g6233$.getGlobalValue(), (SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED);
                                                                            var4 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var55, var56, var57), var4);
                                                                        }
                                                                    }
                                                                    var54 = var54.rest();
                                                                    var55 = var54.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0776.$ic14$, var47);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var6_22, var3);
                                                        }
                                                        var31_66 = var31_66.rest();
                                                        var45 = var31_66.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var7_19, var3);
                                                module0137.$g1605$.rebind(var6_17, var3);
                                            }
                                            var17 = var17.rest();
                                            var18 = var17.first();
                                        }
                                        SubLObject var59;
                                        final SubLObject var58 = var59 = module0200.f12443(module0244.f15771(module0137.f8955(module0776.$ic1$)));
                                        SubLObject var60 = (SubLObject)module0776.NIL;
                                        var60 = var59.first();
                                        while (module0776.NIL != var59) {
                                            final SubLObject var6_23 = module0137.$g1605$.currentBinding(var3);
                                            final SubLObject var7_20 = module0141.$g1674$.currentBinding(var3);
                                            try {
                                                module0137.$g1605$.bind(var60, var3);
                                                module0141.$g1674$.bind((SubLObject)((module0776.NIL != module0141.f9205((SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0776.NIL == module0141.$g1674$.getDynamicValue(var3)) : module0141.$g1674$.getDynamicValue(var3)), var3);
                                                final SubLObject var61 = module0228.f15229(var8_9);
                                                if (module0776.NIL != module0138.f8992(var61)) {
                                                    final SubLObject var62 = module0242.f15664(var61, module0137.f8955((SubLObject)module0776.UNPROVIDED));
                                                    if (module0776.NIL != var62) {
                                                        final SubLObject var63 = module0245.f15834(var62, module0138.f8979(), module0137.f8955((SubLObject)module0776.UNPROVIDED));
                                                        if (module0776.NIL != var63) {
                                                            SubLObject var64;
                                                            for (var64 = module0066.f4838(module0067.f4891(var63)); module0776.NIL == module0066.f4841(var64); var64 = module0066.f4840(var64)) {
                                                                var3.resetMultipleValues();
                                                                final SubLObject var39_41 = module0066.f4839(var64);
                                                                final SubLObject var65 = var3.secondMultipleValue();
                                                                var3.resetMultipleValues();
                                                                if (module0776.NIL != module0147.f9507(var39_41)) {
                                                                    final SubLObject var6_24 = module0138.$g1623$.currentBinding(var3);
                                                                    try {
                                                                        module0138.$g1623$.bind(var39_41, var3);
                                                                        SubLObject var38_44;
                                                                        for (var38_44 = module0066.f4838(module0067.f4891(var65)); module0776.NIL == module0066.f4841(var38_44); var38_44 = module0066.f4840(var38_44)) {
                                                                            var3.resetMultipleValues();
                                                                            final SubLObject var66 = module0066.f4839(var38_44);
                                                                            final SubLObject var67 = var3.secondMultipleValue();
                                                                            var3.resetMultipleValues();
                                                                            if (module0776.NIL != module0141.f9289(var66)) {
                                                                                final SubLObject var6_25 = module0138.$g1624$.currentBinding(var3);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var66, var3);
                                                                                    final SubLObject var68 = var67;
                                                                                    if (module0776.NIL != module0077.f5302(var68)) {
                                                                                        final SubLObject var69 = module0077.f5333(var68);
                                                                                        SubLObject var70;
                                                                                        SubLObject var71;
                                                                                        SubLObject var72;
                                                                                        for (var70 = module0032.f1741(var69), var71 = (SubLObject)module0776.NIL, var71 = module0032.f1742(var70, var69); module0776.NIL == module0032.f1744(var70, var71); var71 = module0032.f1743(var71)) {
                                                                                            var72 = module0032.f1745(var70, var71);
                                                                                            if (module0776.NIL != module0032.f1746(var71, var72) && module0776.NIL == module0249.f16059(var72, (SubLObject)module0776.UNPROVIDED)) {
                                                                                                module0249.f16055(var72, (SubLObject)module0776.UNPROVIDED);
                                                                                                module0056.f4149(var72, var9);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var68.isList()) {
                                                                                        SubLObject var73 = var68;
                                                                                        SubLObject var74 = (SubLObject)module0776.NIL;
                                                                                        var74 = var73.first();
                                                                                        while (module0776.NIL != var73) {
                                                                                            if (module0776.NIL == module0249.f16059(var74, (SubLObject)module0776.UNPROVIDED)) {
                                                                                                module0249.f16055(var74, (SubLObject)module0776.UNPROVIDED);
                                                                                                module0056.f4149(var74, var9);
                                                                                            }
                                                                                            var73 = var73.rest();
                                                                                            var74 = var73.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0776.$ic14$, var68);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var6_25, var3);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var38_44);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var6_24, var3);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var64);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0776.FIVE_INTEGER, (SubLObject)module0776.$ic15$, (SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED);
                                                    }
                                                }
                                                else if (module0776.NIL != module0155.f9785(var61, (SubLObject)module0776.UNPROVIDED)) {
                                                    SubLObject var31_67;
                                                    final SubLObject var75 = var31_67 = ((module0776.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var3), module0137.f8955((SubLObject)module0776.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var3), module0137.f8955((SubLObject)module0776.UNPROVIDED)));
                                                    SubLObject var76 = (SubLObject)module0776.NIL;
                                                    var76 = var31_67.first();
                                                    while (module0776.NIL != var31_67) {
                                                        final SubLObject var6_26 = module0138.$g1625$.currentBinding(var3);
                                                        try {
                                                            module0138.$g1625$.bind(var76, var3);
                                                            final SubLObject var78;
                                                            final SubLObject var77 = var78 = Functions.funcall(var76, var61);
                                                            if (module0776.NIL != module0077.f5302(var78)) {
                                                                final SubLObject var79 = module0077.f5333(var78);
                                                                SubLObject var80;
                                                                SubLObject var81;
                                                                SubLObject var82;
                                                                for (var80 = module0032.f1741(var79), var81 = (SubLObject)module0776.NIL, var81 = module0032.f1742(var80, var79); module0776.NIL == module0032.f1744(var80, var81); var81 = module0032.f1743(var81)) {
                                                                    var82 = module0032.f1745(var80, var81);
                                                                    if (module0776.NIL != module0032.f1746(var81, var82) && module0776.NIL == module0249.f16059(var82, (SubLObject)module0776.UNPROVIDED)) {
                                                                        module0249.f16055(var82, (SubLObject)module0776.UNPROVIDED);
                                                                        module0056.f4149(var82, var9);
                                                                    }
                                                                }
                                                            }
                                                            else if (var78.isList()) {
                                                                SubLObject var83 = var78;
                                                                SubLObject var84 = (SubLObject)module0776.NIL;
                                                                var84 = var83.first();
                                                                while (module0776.NIL != var83) {
                                                                    if (module0776.NIL == module0249.f16059(var84, (SubLObject)module0776.UNPROVIDED)) {
                                                                        module0249.f16055(var84, (SubLObject)module0776.UNPROVIDED);
                                                                        module0056.f4149(var84, var9);
                                                                    }
                                                                    var83 = var83.rest();
                                                                    var84 = var83.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0776.$ic14$, var78);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var6_26, var3);
                                                        }
                                                        var31_67 = var31_67.rest();
                                                        var76 = var31_67.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var7_20, var3);
                                                module0137.$g1605$.rebind(var6_23, var3);
                                            }
                                            var59 = var59.rest();
                                            var60 = var59.first();
                                        }
                                        var8_9 = module0056.f4150(var9);
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var16_24, var3);
                                    module0138.$g1619$.rebind(var7_18, var3);
                                    module0141.$g1677$.rebind(var6_16, var3);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)module0776.TWO_INTEGER, (SubLObject)module0776.$ic17$, var5, module0244.f15748(module0137.f8955((SubLObject)module0776.UNPROVIDED)), (SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var14, var3);
                            module0141.$g1674$.rebind(var13, var3);
                            module0141.$g1672$.rebind(var16_23, var3);
                            module0141.$g1671$.rebind(var7_17, var3);
                            module0141.$g1670$.rebind(var6_15, var3);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var7_16, var3);
                        module0141.$g1714$.rebind(var6_14, var3);
                    }
                }
                finally {
                    module0147.$g2096$.rebind(var10, var3);
                    module0147.$g2094$.rebind(var7_15, var3);
                    module0147.$g2095$.rebind(var6_13, var3);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var3));
            }
            finally {
                module0139.$g1635$.rebind(var6_12, var3);
            }
            module0139.f9011(module0139.$g1636$.getDynamicValue(var3));
        }
        finally {
            module0139.$g1636$.rebind(var7, var3);
            module0137.$g1605$.rebind(var6, var3);
        }
        return var4;
    }
    
    public static SubLObject f49987(SubLObject var2) {
        if (var2 == module0776.UNPROVIDED) {
            var2 = module0776.$g6230$.getGlobalValue();
        }
        SubLObject var3 = module0776.$g6229$.getGlobalValue();
        if (module0776.NIL == var3) {
            var3 = module0034.f1934((SubLObject)module0776.$ic0$, (SubLObject)module0776.$ic18$, (SubLObject)module0776.NIL, (SubLObject)module0776.EQUAL, (SubLObject)module0776.ONE_INTEGER, (SubLObject)module0776.ZERO_INTEGER);
        }
        SubLObject var4 = module0034.f1814(var3, var2, (SubLObject)module0776.$ic19$);
        if (var4 == module0776.$ic19$) {
            var4 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f49986(var2)));
            module0034.f1816(var3, var2, var4, (SubLObject)module0776.UNPROVIDED);
        }
        return module0034.f1959(var4);
    }
    
    public static SubLObject f49988(final SubLObject var82, final SubLObject var83) {
        SubLObject var85;
        final SubLObject var84 = var85 = var82.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)module0776.$ic20$);
        final SubLObject var86 = var85.rest();
        var85 = var85.first();
        SubLObject var87 = (SubLObject)module0776.NIL;
        SubLObject var88 = (SubLObject)module0776.NIL;
        SubLObject var89 = (SubLObject)module0776.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)module0776.$ic20$);
        var87 = var85.first();
        var85 = var85.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)module0776.$ic20$);
        var88 = var85.first();
        var85 = var85.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)module0776.$ic20$);
        var89 = var85.first();
        var85 = var85.rest();
        final SubLObject var90 = (SubLObject)(var85.isCons() ? var85.first() : module0776.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var85, var84, (SubLObject)module0776.$ic20$);
        var85 = var85.rest();
        if (module0776.NIL == var85) {
            final SubLObject var91;
            var85 = (var91 = var86);
            final SubLObject var92 = (SubLObject)module0776.$ic21$;
            return (SubLObject)ConsesLow.list((SubLObject)module0776.$ic22$, (SubLObject)ConsesLow.list(var92, (SubLObject)module0776.$ic23$, var90), (SubLObject)ConsesLow.list((SubLObject)module0776.$ic24$, (SubLObject)ConsesLow.list(var87, var88, var89), var92, reader.bq_cons((SubLObject)module0776.$ic25$, ConsesLow.append(var91, (SubLObject)module0776.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var84, (SubLObject)module0776.$ic20$);
        return (SubLObject)module0776.NIL;
    }
    
    public static SubLObject f49989(final SubLObject var92) {
        final SubLThread var93 = SubLProcess.currentSubLThread();
        if (module0776.NIL == module0751.f46599()) {
            return (SubLObject)module0776.NIL;
        }
        final SubLObject var94 = module0228.f15230(module0756.f47487(var92, (SubLObject)module0776.UNPROVIDED));
        var93.resetMultipleValues();
        final SubLObject var95 = f49990(var94);
        final SubLObject var96 = var93.secondMultipleValue();
        final SubLObject var97 = var93.thirdMultipleValue();
        var93.resetMultipleValues();
        if (module0776.NIL != module0173.f10955(var95)) {
            final SubLObject var98 = f49991(var95);
            final SubLObject var99 = module0756.f47463(var96, (SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED);
            final SubLObject var100 = module0756.f47463(var97, (SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED);
            f49992(var98, var100, var99);
            module0756.f47507(var92, (SubLObject)ConsesLow.list(var99, var100), (SubLObject)module0776.ONE_INTEGER);
            module0758.f47878(var92, (SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED);
            module0756.f47569(var92, var95);
        }
        return module0756.f47467(var92);
    }
    
    public static SubLObject f49993(final SubLObject var93) {
        SubLObject var94 = (SubLObject)module0776.NIL;
        SubLObject var95 = (SubLObject)module0776.NIL;
        SubLObject var96 = (SubLObject)module0776.NIL;
        if (module0776.NIL == var94) {
            SubLObject var97 = f49987((SubLObject)module0776.UNPROVIDED);
            SubLObject var98 = (SubLObject)module0776.NIL;
            var98 = var97.first();
            while (module0776.NIL == var94 && module0776.NIL != var97) {
                SubLObject var100;
                final SubLObject var99 = var100 = var98;
                SubLObject var51_103 = (SubLObject)module0776.NIL;
                SubLObject var101 = (SubLObject)module0776.NIL;
                SubLObject var102 = (SubLObject)module0776.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var100, var99, (SubLObject)module0776.$ic41$);
                var51_103 = var100.first();
                var100 = var100.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var100, var99, (SubLObject)module0776.$ic41$);
                var101 = var100.first();
                var100 = var100.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var100, var99, (SubLObject)module0776.$ic41$);
                var102 = var100.first();
                var100 = var100.rest();
                if (module0776.NIL == var100) {
                    var101 = module0228.f15230(var101);
                    final SubLObject var103 = f49994(var101, var93, var102);
                    if (module0776.NIL != f49995(var103)) {
                        var95 = f49996(var103);
                        var96 = f49997(var103);
                        var94 = var51_103;
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var99, (SubLObject)module0776.$ic41$);
                }
                var97 = var97.rest();
                var98 = var97.first();
            }
        }
        return Values.values(var94, var95, var96);
    }
    
    public static SubLObject f49990(final SubLObject var93) {
        final SubLThread var94 = SubLProcess.currentSubLThread();
        final SubLObject var95 = module0034.$g879$.getDynamicValue(var94);
        SubLObject var96 = (SubLObject)module0776.NIL;
        if (module0776.NIL == var95) {
            return f49993(var93);
        }
        var96 = module0034.f1857(var95, (SubLObject)module0776.$ic40$, (SubLObject)module0776.UNPROVIDED);
        if (module0776.NIL == var96) {
            var96 = module0034.f1807(module0034.f1842(var95), (SubLObject)module0776.$ic40$, (SubLObject)module0776.ONE_INTEGER, (SubLObject)module0776.NIL, (SubLObject)module0776.EQUALP, (SubLObject)module0776.UNPROVIDED);
            module0034.f1860(var95, (SubLObject)module0776.$ic40$, var96);
        }
        SubLObject var97 = module0034.f1814(var96, var93, (SubLObject)module0776.$ic19$);
        if (var97 == module0776.$ic19$) {
            var97 = Values.arg2(var94.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f49993(var93)));
            module0034.f1816(var96, var93, var97, (SubLObject)module0776.UNPROVIDED);
        }
        return module0034.f1959(var97);
    }
    
    public static SubLObject f49998(final SubLObject var108) {
        final SubLObject var109 = module0756.f47463(var108, (SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED);
        f49989(var109);
        return module0756.f47480(var109, (SubLObject)module0776.UNPROVIDED);
    }
    
    public static SubLObject f49999(final SubLObject var108) {
        SubLObject var109 = (SubLObject)module0776.NIL;
        SubLObject var110 = f49987((SubLObject)module0776.UNPROVIDED);
        SubLObject var111 = (SubLObject)module0776.NIL;
        var111 = var110.first();
        while (module0776.NIL != var110) {
            SubLObject var113;
            final SubLObject var112 = var113 = var111;
            SubLObject var51_112 = (SubLObject)module0776.NIL;
            SubLObject var114 = (SubLObject)module0776.NIL;
            SubLObject var115 = (SubLObject)module0776.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var113, var112, (SubLObject)module0776.$ic41$);
            var51_112 = var113.first();
            var113 = var113.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var113, var112, (SubLObject)module0776.$ic41$);
            var114 = var113.first();
            var113 = var113.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var113, var112, (SubLObject)module0776.$ic41$);
            var115 = var113.first();
            var113 = var113.rest();
            if (module0776.NIL == var113) {
                var114 = module0228.f15230(var114);
                final SubLObject var116 = f49994(var114, var108, var115);
                if (module0776.NIL != f49995(var116)) {
                    final SubLObject var117 = f49991(var51_112);
                    final SubLObject var118 = module0756.f47463(f49996(var116), (SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED);
                    final SubLObject var119 = module0756.f47463(f49997(var116), (SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED);
                    final SubLObject var120 = module0756.f47463(var108, (SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED);
                    f49992(var117, var119, var118);
                    module0756.f47507(var120, (SubLObject)ConsesLow.list(var118, var119), (SubLObject)module0776.UNPROVIDED);
                    module0756.f47533(var120, (SubLObject)module0776.ONE_INTEGER);
                    module0758.f47878(var120, (SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED);
                    if (module0776.NIL != module0756.f47479(var120)) {
                        var109 = (SubLObject)ConsesLow.cons(module0756.f47480(var120, (SubLObject)module0776.UNPROVIDED), var109);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var112, (SubLObject)module0776.$ic41$);
            }
            var110 = var110.rest();
            var111 = var110.first();
        }
        return var109;
    }
    
    public static SubLObject f50000(final SubLObject var113) {
        return Equality.eq(f50001(var113), module0776.$g6234$.getGlobalValue());
    }
    
    public static SubLObject f50002(final SubLObject var113) {
        return Equality.eq(f50001(var113), module0776.$g6235$.getGlobalValue());
    }
    
    public static SubLObject f50003(final SubLObject var113) {
        return Equality.eq(f50004(var113), module0776.$g6239$.getGlobalValue());
    }
    
    public static SubLObject f50005(final SubLObject var113) {
        return Equality.eq(f50004(var113), module0776.$g6240$.getGlobalValue());
    }
    
    public static SubLObject f50006(final SubLObject var114) {
        return module0004.f104(var114, (SubLObject)ConsesLow.list(module0776.$g6240$.getGlobalValue(), module0776.$g6239$.getGlobalValue()), (SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED);
    }
    
    public static SubLObject f50007(final SubLObject var113) {
        return conses_high.member(f50001(var113), (SubLObject)ConsesLow.list(module0776.$g6238$.getGlobalValue(), module0776.$g6237$.getGlobalValue(), module0776.$g6236$.getGlobalValue()), (SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED);
    }
    
    public static SubLObject f50001(final SubLObject var113) {
        return module0205.f13365(var113);
    }
    
    public static SubLObject f50004(final SubLObject var113) {
        return module0205.f13277(var113, (SubLObject)module0776.UNPROVIDED);
    }
    
    public static SubLObject f50008(final SubLObject var113) {
        return module0205.f13368(var113, (SubLObject)module0776.UNPROVIDED);
    }
    
    public static SubLObject f50009(final SubLObject var115) {
        return var115.first();
    }
    
    public static SubLObject f50010(final SubLObject var115) {
        return var115.rest();
    }
    
    public static SubLObject f49995(final SubLObject var104) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var104.isList() && module0776.NIL != module0035.f1995(var104, (SubLObject)module0776.TWO_INTEGER, (SubLObject)module0776.UNPROVIDED));
    }
    
    public static SubLObject f49996(final SubLObject var104) {
        final SubLObject var105 = conses_high.assoc(module0776.$g6239$.getGlobalValue(), var104, (SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED);
        return f50010(var105);
    }
    
    public static SubLObject f49997(final SubLObject var104) {
        final SubLObject var105 = conses_high.assoc(module0776.$g6240$.getGlobalValue(), var104, (SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED);
        return f50010(var105);
    }
    
    public static SubLObject f49992(final SubLObject var53, final SubLObject var98, final SubLObject var97) {
        SubLObject var99 = (SubLObject)module0776.NIL;
        SubLObject var100 = (SubLObject)module0776.NIL;
        SubLObject var101 = (SubLObject)module0776.NIL;
        SubLObject var102 = (SubLObject)module0776.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var53, var53, (SubLObject)module0776.$ic42$);
        var99 = var53.first();
        SubLObject var103 = var53.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var103, var53, (SubLObject)module0776.$ic42$);
        var100 = var103.first();
        var103 = var103.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var103, var53, (SubLObject)module0776.$ic42$);
        var101 = var103.first();
        var103 = var103.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var103, var53, (SubLObject)module0776.$ic42$);
        var102 = var103.first();
        var103 = var103.rest();
        if (module0776.NIL == var103) {
            module0756.f47503(var98, (module0776.NIL != var99) ? var99 : module0776.$ic43$, (SubLObject)module0776.UNPROVIDED);
            module0756.f47503(var97, var100, (SubLObject)module0776.UNPROVIDED);
            module0756.f47785(var98, var101);
            module0756.f47785(var97, var102);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var53, (SubLObject)module0776.$ic42$);
        }
        return Values.values(var98, var97);
    }
    
    public static SubLObject f49991(final SubLObject var51) {
        final SubLObject var52 = module0220.f14563(var51, module0776.$g6233$.getGlobalValue(), module0776.$g6230$.getGlobalValue(), (SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED, (SubLObject)module0776.UNPROVIDED);
        return f50011(var52);
    }
    
    public static SubLObject f50011(final SubLObject var53) {
        SubLObject var54 = (SubLObject)module0776.NIL;
        SubLObject var55 = (SubLObject)module0776.NIL;
        SubLObject var56 = (SubLObject)module0776.NIL;
        SubLObject var57 = (SubLObject)module0776.NIL;
        SubLObject var58 = var53;
        SubLObject var59 = (SubLObject)module0776.NIL;
        var59 = var58.first();
        while (module0776.NIL != var58) {
            final SubLObject var60 = f50008(var59);
            if (module0776.NIL != f50000(var59)) {
                if (module0776.NIL != f50005(var59)) {
                    var54 = var60;
                }
                else if (module0776.NIL != f50003(var59)) {
                    var56 = var60;
                }
            }
            else if (module0776.NIL != f50002(var59)) {
                if (module0776.NIL != f50005(var59)) {
                    var55 = var60;
                }
                else if (module0776.NIL != f50003(var59)) {
                    var57 = var60;
                }
            }
            var58 = var58.rest();
            var59 = var58.first();
        }
        return (SubLObject)ConsesLow.list(var54, var55, var56, var57);
    }
    
    public static SubLObject f49994(SubLObject var52, final SubLObject var127, final SubLObject var53) {
        var52 = module0228.f15230(var52);
        if (module0776.NIL == module0202.f12715(var52) || module0776.NIL == module0202.f12715(var127) || module0776.NIL == module0035.f2004(var52, var127)) {
            return (SubLObject)module0776.NIL;
        }
        SubLObject var128 = (SubLObject)module0776.NIL;
        SubLObject var129 = (SubLObject)module0776.NIL;
        if (module0776.NIL == var129) {
            SubLObject var130 = (SubLObject)module0776.NIL;
            SubLObject var114_130 = (SubLObject)module0776.NIL;
            SubLObject var131 = (SubLObject)module0776.NIL;
            SubLObject var132_133 = (SubLObject)module0776.NIL;
            var130 = var52;
            var114_130 = var130.first();
            var131 = var127;
            var132_133 = var131.first();
            while (module0776.NIL == var129 && (module0776.NIL != var131 || module0776.NIL != var130)) {
                if (module0776.NIL != module0202.f12590(var114_130) || module0776.NIL != module0202.f12590(var132_133)) {
                    final SubLObject var132 = f49994(var114_130, var132_133, var53);
                    if (module0776.NIL != var132) {
                        if (var132.isList()) {
                            var128 = ConsesLow.append(var132, var128);
                        }
                    }
                    else {
                        var129 = (SubLObject)module0776.T;
                    }
                }
                else {
                    final SubLObject var132 = f50012(var114_130, var132_133, var53);
                    if (module0776.NIL != var132) {
                        if (var132.isCons()) {
                            var128 = (SubLObject)ConsesLow.cons(var132, var128);
                        }
                    }
                    else {
                        var129 = (SubLObject)module0776.T;
                    }
                }
                var130 = var130.rest();
                var114_130 = var130.first();
                var131 = var131.rest();
                var132_133 = var131.first();
            }
        }
        if (module0776.NIL != var129) {
            return (SubLObject)module0776.NIL;
        }
        return (SubLObject)((module0776.NIL != var128) ? var128 : module0776.T);
    }
    
    public static SubLObject f50012(final SubLObject var114, final SubLObject var132, final SubLObject var53) {
        if (module0776.NIL != f50006(var114)) {
            return (SubLObject)((module0776.NIL != f50013(var114, var132, var53)) ? ConsesLow.cons(var114, var132) : module0776.NIL);
        }
        if (var114.eql(var132)) {
            return (SubLObject)module0776.T;
        }
        return (SubLObject)module0776.NIL;
    }
    
    public static SubLObject f50013(final SubLObject var114, final SubLObject var132, final SubLObject var53) {
        SubLObject var133 = (SubLObject)module0776.NIL;
        if (module0776.NIL == var133) {
            SubLObject var134;
            SubLObject var135;
            for (var134 = var53, var135 = (SubLObject)module0776.NIL, var135 = var134.first(); module0776.NIL == var133 && module0776.NIL != var134; var133 = (SubLObject)SubLObjectFactory.makeBoolean(module0776.NIL != f50007(var135) && module0776.NIL != f50014(var135, var114) && module0776.NIL == f50015(var132, var135)), var134 = var134.rest(), var135 = var134.first()) {}
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0776.NIL == var133);
    }
    
    public static SubLObject f50015(final SubLObject var132, final SubLObject var113) {
        final SubLThread var133 = SubLProcess.currentSubLThread();
        if (module0776.NIL == f50007(var113)) {
            final SubLObject var134 = Sequences.cconcatenate((SubLObject)module0776.$ic44$, new SubLObject[] { module0006.f205((SubLObject)module0776.ONE_INTEGER), module0776.$ic45$, module0006.f203((SubLObject)module0776.$ic46$) });
            module0578.f35476(var134, (SubLObject)ConsesLow.list(var113));
        }
        SubLObject var135 = (SubLObject)module0776.T;
        final SubLObject var136 = f50008(var113);
        final SubLObject var137 = f50001(var113);
        if (var137.eql(module0776.$g6236$.getGlobalValue())) {
            return Equality.equal(var132, var136);
        }
        if (var137.eql(module0776.$g6237$.getGlobalValue())) {
            final SubLObject var138 = module0147.$g2094$.currentBinding(var133);
            final SubLObject var139 = module0147.$g2095$.currentBinding(var133);
            try {
                module0147.$g2094$.bind((SubLObject)module0776.$ic47$, var133);
                module0147.$g2095$.bind(module0776.$ic48$, var133);
                var135 = module0751.f46669(var132, var136, (SubLObject)module0776.UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var139, var133);
                module0147.$g2094$.rebind(var138, var133);
            }
        }
        else if (var137.eql(module0776.$g6238$.getGlobalValue())) {
            final SubLObject var138 = module0147.$g2094$.currentBinding(var133);
            final SubLObject var139 = module0147.$g2095$.currentBinding(var133);
            try {
                module0147.$g2094$.bind((SubLObject)module0776.$ic47$, var133);
                module0147.$g2095$.bind(module0776.$ic48$, var133);
                var135 = module0751.f46684(var132, var136, (SubLObject)module0776.UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var139, var133);
                module0147.$g2094$.rebind(var138, var133);
            }
        }
        else {
            final SubLObject var140 = Sequences.cconcatenate((SubLObject)module0776.$ic44$, new SubLObject[] { module0006.f205((SubLObject)module0776.ONE_INTEGER), module0776.$ic45$, module0006.f203((SubLObject)module0776.$ic49$) });
            module0578.f35476(var140, (SubLObject)ConsesLow.list(var137));
        }
        return var135;
    }
    
    public static SubLObject f50014(final SubLObject var113, final SubLObject var114) {
        return Equality.eq(f50004(var113), var114);
    }
    
    public static SubLObject f50016() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0776", "f49984", "S#54492", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0776", "f49985", "S#54493", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0776", "f49986", "S#54494", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0776", "f49987", "S#54495", 0, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0776", "f49988", "S#54496");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0776", "f49989", "S#54497", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0776", "f49993", "S#54498", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0776", "f49990", "S#54499", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0776", "f49998", "S#54500", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0776", "f49999", "S#54501", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0776", "f50000", "S#54502", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0776", "f50002", "S#54503", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0776", "f50003", "S#54504", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0776", "f50005", "S#54505", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0776", "f50006", "S#54506", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0776", "f50007", "S#54507", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0776", "f50001", "S#54508", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0776", "f50004", "S#54509", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0776", "f50008", "S#54510", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0776", "f50009", "S#54511", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0776", "f50010", "S#54512", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0776", "f49995", "S#54513", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0776", "f49996", "S#54514", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0776", "f49997", "S#54515", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0776", "f49992", "S#54516", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0776", "f49991", "S#54517", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0776", "f50011", "S#54518", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0776", "f49994", "S#54519", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0776", "f50012", "S#54520", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0776", "f50013", "S#54521", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0776", "f50015", "S#54522", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0776", "f50014", "S#54523", 2, 0, false);
        return (SubLObject)module0776.NIL;
    }
    
    public static SubLObject f50017() {
        module0776.$g6229$ = SubLFiles.deflexical("S#54524", (SubLObject)module0776.NIL);
        module0776.$g6234$ = SubLFiles.defconstant("S#54525", module0776.$ic26$);
        module0776.$g6235$ = SubLFiles.defconstant("S#54526", module0776.$ic27$);
        module0776.$g6236$ = SubLFiles.defconstant("S#54527", module0776.$ic28$);
        module0776.$g6237$ = SubLFiles.defconstant("S#54528", module0776.$ic29$);
        module0776.$g6238$ = SubLFiles.defconstant("S#54529", module0776.$ic30$);
        module0776.$g6239$ = SubLFiles.defconstant("S#54530", module0776.$ic31$);
        module0776.$g6240$ = SubLFiles.defconstant("S#54531", module0776.$ic32$);
        module0776.$g6231$ = SubLFiles.defconstant("S#54532", module0776.$ic33$);
        module0776.$g6232$ = SubLFiles.defconstant("S#54533", module0776.$ic34$);
        module0776.$g6233$ = SubLFiles.defconstant("S#54534", module0776.$ic35$);
        module0776.$g6230$ = SubLFiles.deflexical("S#54535", module0776.$ic36$);
        return (SubLObject)module0776.NIL;
    }
    
    public static SubLObject f50018() {
        module0034.f1909((SubLObject)module0776.$ic0$);
        module0762.f48147((SubLObject)module0776.$ic37$, (SubLObject)module0776.$ic38$, (SubLObject)module0776.$ic39$);
        module0034.f1895((SubLObject)module0776.$ic40$);
        return (SubLObject)module0776.NIL;
    }
    
    public void declareFunctions() {
        f50016();
    }
    
    public void initializeVariables() {
        f50017();
    }
    
    public void runTopLevelForms() {
        f50018();
    }
    
    static {
        me = (SubLFile)new module0776();
        module0776.$g6229$ = null;
        module0776.$g6234$ = null;
        module0776.$g6235$ = null;
        module0776.$g6236$ = null;
        module0776.$g6237$ = null;
        module0776.$g6238$ = null;
        module0776.$g6239$ = null;
        module0776.$g6240$ = null;
        module0776.$g6231$ = null;
        module0776.$g6232$ = null;
        module0776.$g6233$ = null;
        module0776.$g6230$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#54495", "CYC");
        $ic1$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic2$ = SubLObjectFactory.makeKeyword("BREADTH");
        $ic3$ = SubLObjectFactory.makeKeyword("QUEUE");
        $ic4$ = SubLObjectFactory.makeKeyword("STACK");
        $ic5$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("True-JustificationTruth"));
        $ic6$ = SubLObjectFactory.makeSymbol("S#11450", "CYC");
        $ic7$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic8$ = SubLObjectFactory.makeString("~A is not a ~A");
        $ic9$ = SubLObjectFactory.makeSymbol("S#11592", "CYC");
        $ic10$ = SubLObjectFactory.makeKeyword("CERROR");
        $ic11$ = SubLObjectFactory.makeString("continue anyway");
        $ic12$ = SubLObjectFactory.makeKeyword("WARN");
        $ic13$ = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic14$ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $ic15$ = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic16$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("US#4D5E436"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#1526883"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#15AA083"));
        $ic17$ = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic18$ = SubLObjectFactory.makeSymbol("S#54524", "CYC");
        $ic19$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic20$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#16577", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#54536", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#54537", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#8587", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic21$ = SubLObjectFactory.makeUninternedSymbol("US#15690D5");
        $ic22$ = SubLObjectFactory.makeSymbol("CSOME");
        $ic23$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#54495", "CYC"));
        $ic24$ = SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND");
        $ic25$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic26$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("NCPOSConstraintFn"));
        $ic27$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("NCPOSPredConstraintFn"));
        $ic28$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("NCEqualsConstraintFn"));
        $ic29$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("NCGenlsConstraintFn"));
        $ic30$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("NCIsaConstraintFn"));
        $ic31$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheNCModifier"));
        $ic32$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheNCHead"));
        $ic33$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("NounCompoundRule"));
        $ic34$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ncRuleTemplate"));
        $ic35$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ncRuleConstraint"));
        $ic36$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("GeneralLexiconMt"));
        $ic37$ = SubLObjectFactory.makeSymbol("S#54497", "CYC");
        $ic38$ = SubLObjectFactory.makeKeyword("COLLECTION-DENOTING-NAT");
        $ic39$ = SubLObjectFactory.makeKeyword("BEST");
        $ic40$ = SubLObjectFactory.makeSymbol("S#54499", "CYC");
        $ic41$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13097", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#33867", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#51680", "CYC"));
        $ic42$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#54538", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#54539", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#54540", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#54541", "CYC"));
        $ic43$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CountNoun"));
        $ic44$ = SubLObjectFactory.makeString("(PPH error level ");
        $ic45$ = SubLObjectFactory.makeString(") ");
        $ic46$ = SubLObjectFactory.makeString("~&~S isn't a semantic constraint.~%");
        $ic47$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic48$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic49$ = SubLObjectFactory.makeString("~&~S isn't a recognized noun-compound constraint function.~%");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0776.class
	Total time: 986 ms
	
	Decompiled with Procyon 0.5.32.
*/