package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0634 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0634";
    public static final String myFingerPrint = "b99531f535b5ed50bd2b5865f41dae5e7da6902f11faab58a4875f01953c40ed";
    private static final SubLSymbol $ic0$;
    private static final SubLObject $ic1$;
    private static final SubLObject $ic2$;
    private static final SubLObject $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLObject $ic7$;
    private static final SubLObject $ic8$;
    private static final SubLObject $ic9$;
    private static final SubLObject $ic10$;
    private static final SubLObject $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLList $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLObject $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLObject $ic25$;
    private static final SubLObject $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLString $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLString $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLString $ic37$;
    private static final SubLString $ic38$;
    private static final SubLString $ic39$;
    private static final SubLList $ic40$;
    private static final SubLString $ic41$;
    private static final SubLObject $ic42$;
    
    public static SubLObject f38755(final SubLObject var1) {
        return var1;
    }
    
    public static SubLObject f38756(final SubLObject var1) {
        return (SubLObject)module0634.$ic0$;
    }
    
    public static SubLObject f38757(final SubLObject var1) {
        final SubLObject var2 = module0161.f10526(module0632.f38705(), module0634.$ic1$, module0634.$ic2$);
        final SubLObject var3 = module0220.f14557(var1, module0634.$ic3$, var2, (SubLObject)module0634.UNPROVIDED, (SubLObject)module0634.UNPROVIDED, (SubLObject)module0634.UNPROVIDED);
        if (module0634.NIL != var3) {
            final SubLObject var4 = module0226.f15167(var3);
            return var4;
        }
        return (SubLObject)module0634.NIL;
    }
    
    public static SubLObject f38758(final SubLObject var3) {
        assert module0634.NIL != module0173.f10955(var3) : var3;
        final SubLObject var4 = (SubLObject)module0634.$ic5$;
        return module0035.remove_if_not((SubLObject)module0634.$ic6$, module0220.f14566(var3, module0634.$ic3$, var4, (SubLObject)module0634.TWO_INTEGER, (SubLObject)module0634.ONE_INTEGER, (SubLObject)module0634.UNPROVIDED), (SubLObject)module0634.UNPROVIDED, (SubLObject)module0634.UNPROVIDED, (SubLObject)module0634.UNPROVIDED, (SubLObject)module0634.UNPROVIDED);
    }
    
    public static SubLObject f38759(final SubLObject var1) {
        final SubLObject var2 = module0161.f10526(module0632.f38705(), module0634.$ic1$, module0634.$ic2$);
        final SubLObject var3 = module0220.f14557(var1, module0634.$ic7$, var2, (SubLObject)module0634.UNPROVIDED, (SubLObject)module0634.UNPROVIDED, (SubLObject)module0634.UNPROVIDED);
        return var3;
    }
    
    public static SubLObject f38760(final SubLObject var6) {
        final SubLObject var7 = module0161.f10526(module0634.$ic8$, module0634.$ic1$, module0634.$ic2$);
        return module0259.f16854(var6, module0634.$ic9$, var7, (SubLObject)module0634.UNPROVIDED);
    }
    
    public static SubLObject f38761(final SubLObject var1) {
        return (SubLObject)module0634.T;
    }
    
    public static SubLObject f38762(final SubLObject var1) {
        return (SubLObject)module0634.NIL;
    }
    
    public static SubLObject f38763(final SubLObject var1) {
        return (SubLObject)module0634.NIL;
    }
    
    public static SubLObject f38764(final SubLObject var1) {
        return module0226.f15076(var1, module0632.f38705());
    }
    
    public static SubLObject f38765(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0634.NIL != module0173.f10955(var1) && module0634.NIL != module0259.f16854(var1, module0634.$ic10$, module0632.f38705(), (SubLObject)module0634.UNPROVIDED));
    }
    
    public static SubLObject f38766(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0634.NIL != module0173.f10955(var1) && module0634.NIL != module0259.f16854(var1, module0634.$ic11$, module0632.f38705(), (SubLObject)module0634.UNPROVIDED));
    }
    
    public static SubLObject f38767(final SubLObject var1, final SubLObject var7, final SubLObject var8, final SubLObject var9, final SubLObject var10, final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        SubLObject var13 = (SubLObject)module0634.NIL;
        SubLObject var14 = (SubLObject)module0634.NIL;
        if (module0634.NIL != var8) {
            var14 = conses_high.putf(var14, (SubLObject)module0634.$ic12$, (SubLObject)module0634.T);
        }
        if (module0634.NIL != var9) {
            var14 = conses_high.putf(var14, (SubLObject)module0634.$ic13$, (SubLObject)module0634.T);
        }
        final SubLObject var15 = module0018.$g738$.currentBinding(var12);
        try {
            module0018.$g738$.bind((SubLObject)((module0634.NIL != var8) ? module0634.NIL : module0018.$g738$.getDynamicValue(var12)), var12);
            final SubLObject var16 = module0424.f29726(var1, (SubLObject)module0634.$ic14$, module0424.$g3450$.getDynamicValue(var12), var14, (SubLObject)module0634.T, (SubLObject)module0634.UNPROVIDED);
            f38768(var16, var11, var10, var7);
            var13 = f38769(var16);
            module0029.f1550(var13, var11, var10, var7);
        }
        finally {
            module0018.$g738$.rebind(var15, var12);
        }
        return var13;
    }
    
    public static SubLObject f38768(final SubLObject var16, final SubLObject var11, final SubLObject var10, final SubLObject var7) {
        if (var7 == module0634.$ic15$) {
            print_high.print(var16, var11);
            streams_high.terpri(var11);
        }
        return (SubLObject)module0634.NIL;
    }
    
    public static SubLObject f38770(final SubLObject var17) {
        return f38771(var17, (SubLObject)module0634.NIL);
    }
    
    public static SubLObject f38772(final SubLObject var17) {
        return f38771(var17, (SubLObject)module0634.T);
    }
    
    public static SubLObject f38771(final SubLObject var17, final SubLObject var18) {
        SubLObject var19 = (SubLObject)module0634.NIL;
        SubLObject var21;
        final SubLObject var20 = var21 = module0424.f29708(var17);
        SubLObject var22 = (SubLObject)module0634.NIL;
        var22 = var21.first();
        while (module0634.NIL != var21) {
            final SubLObject var23 = f38773(var22, var18);
            var19 = (SubLObject)ConsesLow.cons(var23, var19);
            var21 = var21.rest();
            var22 = var21.first();
        }
        return Sequences.nreverse(var19);
    }
    
    public static SubLObject f38769(final SubLObject var16) {
        return f38773(var16, (SubLObject)module0634.NIL);
    }
    
    public static SubLObject f38773(final SubLObject var16, final SubLObject var18) {
        final SubLObject var19 = (SubLObject)module0634.$ic16$;
        final SubLObject var20 = module0424.f29669(var16);
        SubLObject var21 = module0424.f29671(var16);
        final SubLObject var22 = module0424.f29670(var16);
        final SubLObject var23 = module0424.f29635(var22);
        if (module0634.NIL != var18) {
            final SubLObject var24 = var21;
            if (var24.eql((SubLObject)module0634.$ic17$)) {
                if (module0634.NIL != f38765(var20)) {
                    var21 = (SubLObject)module0634.$ic18$;
                }
                else {
                    var21 = (SubLObject)module0634.$ic19$;
                }
            }
            else if (var24.eql((SubLObject)module0634.$ic20$)) {
                if (module0634.NIL != f38765(var20)) {
                    var21 = (SubLObject)module0634.$ic21$;
                }
                else {
                    var21 = (SubLObject)module0634.$ic22$;
                }
            }
        }
        return module0029.f1535(var19, var20, var21, var23);
    }
    
    public static SubLObject f38774() {
        return f38775(module0634.$ic23$);
    }
    
    public static SubLObject f38776() {
        return f38775(module0634.$ic10$);
    }
    
    public static SubLObject f38777() {
        return f38775(module0634.$ic11$);
    }
    
    public static SubLObject f38775(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        SubLObject var30 = (SubLObject)module0634.ZERO_INTEGER;
        final SubLObject var31 = module0147.$g2094$.currentBinding(var29);
        final SubLObject var32 = module0147.$g2095$.currentBinding(var29);
        try {
            module0147.$g2094$.bind((SubLObject)module0634.$ic24$, var29);
            module0147.$g2095$.bind(module0634.$ic25$, var29);
            final SubLObject var15_32 = module0137.$g1605$.currentBinding(var29);
            final SubLObject var30_33 = module0139.$g1636$.currentBinding(var29);
            try {
                module0137.$g1605$.bind(module0137.f8955(module0634.$ic26$), var29);
                module0139.$g1636$.bind(module0139.f9007(), var29);
                SubLObject var34_35 = var28;
                final SubLObject var33 = (SubLObject)module0634.$ic29$;
                final SubLObject var34 = module0056.f4145(var33);
                final SubLObject var15_33 = module0139.$g1635$.currentBinding(var29);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var29);
                    final SubLObject var35 = (SubLObject)module0634.NIL;
                    final SubLObject var15_34 = module0141.$g1714$.currentBinding(var29);
                    final SubLObject var30_34 = module0141.$g1715$.currentBinding(var29);
                    try {
                        module0141.$g1714$.bind((module0634.NIL != var35) ? var35 : module0141.f9283(), var29);
                        module0141.$g1715$.bind((SubLObject)((module0634.NIL != var35) ? module0634.$ic30$ : module0141.$g1715$.getDynamicValue(var29)), var29);
                        if (module0634.NIL != var35 && module0634.NIL != module0136.f8864() && module0634.NIL == module0141.f9279(var35)) {
                            final SubLObject var36 = module0136.$g1591$.getDynamicValue(var29);
                            if (var36.eql((SubLObject)module0634.$ic31$)) {
                                module0136.f8870((SubLObject)module0634.ONE_INTEGER, (SubLObject)module0634.$ic32$, var35, (SubLObject)module0634.$ic33$, (SubLObject)module0634.UNPROVIDED, (SubLObject)module0634.UNPROVIDED, (SubLObject)module0634.UNPROVIDED);
                            }
                            else if (var36.eql((SubLObject)module0634.$ic34$)) {
                                module0136.f8871((SubLObject)module0634.ONE_INTEGER, (SubLObject)module0634.$ic35$, (SubLObject)module0634.$ic32$, var35, (SubLObject)module0634.$ic33$, (SubLObject)module0634.UNPROVIDED, (SubLObject)module0634.UNPROVIDED, (SubLObject)module0634.UNPROVIDED);
                            }
                            else if (var36.eql((SubLObject)module0634.$ic36$)) {
                                Errors.warn((SubLObject)module0634.$ic32$, var35, (SubLObject)module0634.$ic33$);
                            }
                            else {
                                Errors.warn((SubLObject)module0634.$ic37$, module0136.$g1591$.getDynamicValue(var29));
                                Errors.cerror((SubLObject)module0634.$ic35$, (SubLObject)module0634.$ic32$, var35, (SubLObject)module0634.$ic33$);
                            }
                        }
                        final SubLObject var15_35 = module0141.$g1670$.currentBinding(var29);
                        final SubLObject var30_35 = module0141.$g1671$.currentBinding(var29);
                        final SubLObject var37 = module0141.$g1672$.currentBinding(var29);
                        final SubLObject var38 = module0141.$g1674$.currentBinding(var29);
                        final SubLObject var39 = module0137.$g1605$.currentBinding(var29);
                        try {
                            module0141.$g1670$.bind(module0244.f15771(module0137.f8955(module0634.$ic26$)), var29);
                            module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955(module0634.$ic26$))), var29);
                            module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955(module0634.$ic26$))), var29);
                            module0141.$g1674$.bind((SubLObject)module0634.NIL, var29);
                            module0137.$g1605$.bind(module0244.f15771(module0137.f8955(module0634.$ic26$)), var29);
                            if (module0634.NIL != module0136.f8865() || module0634.NIL != module0244.f15795(var28, module0137.f8955((SubLObject)module0634.UNPROVIDED))) {
                                final SubLObject var15_36 = module0141.$g1677$.currentBinding(var29);
                                final SubLObject var30_36 = module0138.$g1619$.currentBinding(var29);
                                final SubLObject var44_49 = module0141.$g1674$.currentBinding(var29);
                                try {
                                    module0141.$g1677$.bind(module0141.f9210(), var29);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955(module0634.$ic26$))), var29);
                                    module0141.$g1674$.bind((SubLObject)module0634.NIL, var29);
                                    module0249.f16055(var34_35, (SubLObject)module0634.UNPROVIDED);
                                    while (module0634.NIL != var34_35) {
                                        final SubLObject var40 = var34_35;
                                        SubLObject var42;
                                        final SubLObject var41 = var42 = module0200.f12443(module0137.f8955(module0634.$ic26$));
                                        SubLObject var43 = (SubLObject)module0634.NIL;
                                        var43 = var42.first();
                                        while (module0634.NIL != var42) {
                                            final SubLObject var15_37 = module0137.$g1605$.currentBinding(var29);
                                            final SubLObject var30_37 = module0141.$g1674$.currentBinding(var29);
                                            try {
                                                module0137.$g1605$.bind(var43, var29);
                                                module0141.$g1674$.bind((SubLObject)((module0634.NIL != module0141.f9205((SubLObject)module0634.UNPROVIDED, (SubLObject)module0634.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0634.NIL == module0141.$g1674$.getDynamicValue(var29)) : module0141.$g1674$.getDynamicValue(var29)), var29);
                                                final SubLObject var44 = module0228.f15229(var40);
                                                if (module0634.NIL != module0138.f8992(var44)) {
                                                    final SubLObject var45 = module0242.f15664(var44, module0137.f8955((SubLObject)module0634.UNPROVIDED));
                                                    if (module0634.NIL != var45) {
                                                        final SubLObject var46 = module0245.f15834(var45, module0244.f15780(module0137.f8955(module0634.$ic26$)), module0137.f8955((SubLObject)module0634.UNPROVIDED));
                                                        if (module0634.NIL != var46) {
                                                            SubLObject var47;
                                                            for (var47 = module0066.f4838(module0067.f4891(var46)); module0634.NIL == module0066.f4841(var47); var47 = module0066.f4840(var47)) {
                                                                var29.resetMultipleValues();
                                                                final SubLObject var48 = module0066.f4839(var47);
                                                                final SubLObject var49 = var29.secondMultipleValue();
                                                                var29.resetMultipleValues();
                                                                if (module0634.NIL != module0147.f9507(var48)) {
                                                                    final SubLObject var15_38 = module0138.$g1623$.currentBinding(var29);
                                                                    try {
                                                                        module0138.$g1623$.bind(var48, var29);
                                                                        SubLObject var58_62;
                                                                        for (var58_62 = module0066.f4838(module0067.f4891(var49)); module0634.NIL == module0066.f4841(var58_62); var58_62 = module0066.f4840(var58_62)) {
                                                                            var29.resetMultipleValues();
                                                                            final SubLObject var50 = module0066.f4839(var58_62);
                                                                            final SubLObject var51 = var29.secondMultipleValue();
                                                                            var29.resetMultipleValues();
                                                                            if (module0634.NIL != module0141.f9289(var50)) {
                                                                                final SubLObject var15_39 = module0138.$g1624$.currentBinding(var29);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var50, var29);
                                                                                    final SubLObject var52 = var51;
                                                                                    if (module0634.NIL != module0077.f5302(var52)) {
                                                                                        final SubLObject var53 = module0077.f5333(var52);
                                                                                        SubLObject var54;
                                                                                        SubLObject var55;
                                                                                        SubLObject var56;
                                                                                        for (var54 = module0032.f1741(var53), var55 = (SubLObject)module0634.NIL, var55 = module0032.f1742(var54, var53); module0634.NIL == module0032.f1744(var54, var55); var55 = module0032.f1743(var55)) {
                                                                                            var56 = module0032.f1745(var54, var55);
                                                                                            if (module0634.NIL != module0032.f1746(var55, var56) && module0634.NIL == module0249.f16059(var56, module0139.$g1636$.getDynamicValue(var29))) {
                                                                                                module0249.f16055(var56, module0139.$g1636$.getDynamicValue(var29));
                                                                                                if (module0634.NIL != module0173.f10955(var56) && module0634.NIL != f38778(var56)) {
                                                                                                    var30 = Numbers.add(var30, (SubLObject)module0634.ONE_INTEGER);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var52.isList()) {
                                                                                        SubLObject var57 = var52;
                                                                                        SubLObject var58 = (SubLObject)module0634.NIL;
                                                                                        var58 = var57.first();
                                                                                        while (module0634.NIL != var57) {
                                                                                            if (module0634.NIL == module0249.f16059(var58, module0139.$g1636$.getDynamicValue(var29))) {
                                                                                                module0249.f16055(var58, module0139.$g1636$.getDynamicValue(var29));
                                                                                                if (module0634.NIL != module0173.f10955(var58) && module0634.NIL != f38778(var58)) {
                                                                                                    var30 = Numbers.add(var30, (SubLObject)module0634.ONE_INTEGER);
                                                                                                }
                                                                                            }
                                                                                            var57 = var57.rest();
                                                                                            var58 = var57.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0634.$ic38$, var52);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var15_39, var29);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var58_62);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var15_38, var29);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var47);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0634.FIVE_INTEGER, (SubLObject)module0634.$ic39$, (SubLObject)module0634.UNPROVIDED, (SubLObject)module0634.UNPROVIDED, (SubLObject)module0634.UNPROVIDED, (SubLObject)module0634.UNPROVIDED, (SubLObject)module0634.UNPROVIDED);
                                                    }
                                                    if (module0634.NIL != module0200.f12419(var44, module0137.f8955((SubLObject)module0634.UNPROVIDED))) {
                                                        SubLObject var59 = module0248.f15995(var44);
                                                        SubLObject var60 = (SubLObject)module0634.NIL;
                                                        var60 = var59.first();
                                                        while (module0634.NIL != var59) {
                                                            SubLObject var62;
                                                            final SubLObject var61 = var62 = var60;
                                                            SubLObject var63 = (SubLObject)module0634.NIL;
                                                            SubLObject var64 = (SubLObject)module0634.NIL;
                                                            SubLObject var65 = (SubLObject)module0634.NIL;
                                                            cdestructuring_bind.destructuring_bind_must_consp(var62, var61, (SubLObject)module0634.$ic40$);
                                                            var63 = var62.first();
                                                            var62 = var62.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var62, var61, (SubLObject)module0634.$ic40$);
                                                            var64 = var62.first();
                                                            var62 = var62.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var62, var61, (SubLObject)module0634.$ic40$);
                                                            var65 = var62.first();
                                                            var62 = var62.rest();
                                                            if (module0634.NIL == var62) {
                                                                if (module0634.NIL != module0147.f9507(var64)) {
                                                                    final SubLObject var15_40 = module0138.$g1623$.currentBinding(var29);
                                                                    try {
                                                                        module0138.$g1623$.bind(var64, var29);
                                                                        if (module0634.NIL != module0141.f9289(var65)) {
                                                                            final SubLObject var15_41 = module0138.$g1624$.currentBinding(var29);
                                                                            try {
                                                                                module0138.$g1624$.bind(var65, var29);
                                                                                final SubLObject var52;
                                                                                final SubLObject var66 = var52 = (SubLObject)ConsesLow.list(var63);
                                                                                if (module0634.NIL != module0077.f5302(var52)) {
                                                                                    final SubLObject var53 = module0077.f5333(var52);
                                                                                    SubLObject var54;
                                                                                    SubLObject var55;
                                                                                    SubLObject var56;
                                                                                    for (var54 = module0032.f1741(var53), var55 = (SubLObject)module0634.NIL, var55 = module0032.f1742(var54, var53); module0634.NIL == module0032.f1744(var54, var55); var55 = module0032.f1743(var55)) {
                                                                                        var56 = module0032.f1745(var54, var55);
                                                                                        if (module0634.NIL != module0032.f1746(var55, var56) && module0634.NIL == module0249.f16059(var56, module0139.$g1636$.getDynamicValue(var29))) {
                                                                                            module0249.f16055(var56, module0139.$g1636$.getDynamicValue(var29));
                                                                                            if (module0634.NIL != module0173.f10955(var56) && module0634.NIL != f38778(var56)) {
                                                                                                var30 = Numbers.add(var30, (SubLObject)module0634.ONE_INTEGER);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var52.isList()) {
                                                                                    SubLObject var70_79 = var52;
                                                                                    SubLObject var58 = (SubLObject)module0634.NIL;
                                                                                    var58 = var70_79.first();
                                                                                    while (module0634.NIL != var70_79) {
                                                                                        if (module0634.NIL == module0249.f16059(var58, module0139.$g1636$.getDynamicValue(var29))) {
                                                                                            module0249.f16055(var58, module0139.$g1636$.getDynamicValue(var29));
                                                                                            if (module0634.NIL != module0173.f10955(var58) && module0634.NIL != f38778(var58)) {
                                                                                                var30 = Numbers.add(var30, (SubLObject)module0634.ONE_INTEGER);
                                                                                            }
                                                                                        }
                                                                                        var70_79 = var70_79.rest();
                                                                                        var58 = var70_79.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)module0634.$ic38$, var52);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var15_41, var29);
                                                                            }
                                                                        }
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var15_40, var29);
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                cdestructuring_bind.cdestructuring_bind_error(var61, (SubLObject)module0634.$ic40$);
                                                            }
                                                            var59 = var59.rest();
                                                            var60 = var59.first();
                                                        }
                                                    }
                                                }
                                                else if (module0634.NIL != module0155.f9785(var44, (SubLObject)module0634.UNPROVIDED)) {
                                                    SubLObject var21_81;
                                                    final SubLObject var67 = var21_81 = ((module0634.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955(module0634.$ic26$)), module0141.$g1714$.getDynamicValue(var29), module0137.f8955((SubLObject)module0634.UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955(module0634.$ic26$)), module0141.$g1714$.getDynamicValue(var29), module0137.f8955((SubLObject)module0634.UNPROVIDED)));
                                                    SubLObject var68 = (SubLObject)module0634.NIL;
                                                    var68 = var21_81.first();
                                                    while (module0634.NIL != var21_81) {
                                                        final SubLObject var15_42 = module0138.$g1625$.currentBinding(var29);
                                                        try {
                                                            module0138.$g1625$.bind(var68, var29);
                                                            final SubLObject var70;
                                                            final SubLObject var69 = var70 = Functions.funcall(var68, var44);
                                                            if (module0634.NIL != module0077.f5302(var70)) {
                                                                final SubLObject var71 = module0077.f5333(var70);
                                                                SubLObject var72;
                                                                SubLObject var73;
                                                                SubLObject var74;
                                                                for (var72 = module0032.f1741(var71), var73 = (SubLObject)module0634.NIL, var73 = module0032.f1742(var72, var71); module0634.NIL == module0032.f1744(var72, var73); var73 = module0032.f1743(var73)) {
                                                                    var74 = module0032.f1745(var72, var73);
                                                                    if (module0634.NIL != module0032.f1746(var73, var74) && module0634.NIL == module0249.f16059(var74, module0139.$g1636$.getDynamicValue(var29))) {
                                                                        module0249.f16055(var74, module0139.$g1636$.getDynamicValue(var29));
                                                                        if (module0634.NIL != module0173.f10955(var74) && module0634.NIL != f38778(var74)) {
                                                                            var30 = Numbers.add(var30, (SubLObject)module0634.ONE_INTEGER);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            else if (var70.isList()) {
                                                                SubLObject var75 = var70;
                                                                SubLObject var76 = (SubLObject)module0634.NIL;
                                                                var76 = var75.first();
                                                                while (module0634.NIL != var75) {
                                                                    if (module0634.NIL == module0249.f16059(var76, module0139.$g1636$.getDynamicValue(var29))) {
                                                                        module0249.f16055(var76, module0139.$g1636$.getDynamicValue(var29));
                                                                        if (module0634.NIL != module0173.f10955(var76) && module0634.NIL != f38778(var76)) {
                                                                            var30 = Numbers.add(var30, (SubLObject)module0634.ONE_INTEGER);
                                                                        }
                                                                    }
                                                                    var75 = var75.rest();
                                                                    var76 = var75.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0634.$ic38$, var70);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var15_42, var29);
                                                        }
                                                        var21_81 = var21_81.rest();
                                                        var68 = var21_81.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var30_37, var29);
                                                module0137.$g1605$.rebind(var15_37, var29);
                                            }
                                            var42 = var42.rest();
                                            var43 = var42.first();
                                        }
                                        SubLObject var78;
                                        final SubLObject var77 = var78 = module0200.f12443(module0244.f15771(module0137.f8955(module0634.$ic26$)));
                                        SubLObject var79 = (SubLObject)module0634.NIL;
                                        var79 = var78.first();
                                        while (module0634.NIL != var78) {
                                            final SubLObject var15_43 = module0137.$g1605$.currentBinding(var29);
                                            final SubLObject var30_38 = module0141.$g1674$.currentBinding(var29);
                                            try {
                                                module0137.$g1605$.bind(var79, var29);
                                                module0141.$g1674$.bind((SubLObject)((module0634.NIL != module0141.f9205((SubLObject)module0634.UNPROVIDED, (SubLObject)module0634.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0634.NIL == module0141.$g1674$.getDynamicValue(var29)) : module0141.$g1674$.getDynamicValue(var29)), var29);
                                                final SubLObject var80 = module0228.f15229(var34_35);
                                                if (module0634.NIL != module0138.f8992(var80)) {
                                                    final SubLObject var81 = module0242.f15664(var80, module0137.f8955((SubLObject)module0634.UNPROVIDED));
                                                    if (module0634.NIL != var81) {
                                                        final SubLObject var82 = module0245.f15834(var81, module0138.f8979(), module0137.f8955((SubLObject)module0634.UNPROVIDED));
                                                        if (module0634.NIL != var82) {
                                                            SubLObject var83;
                                                            for (var83 = module0066.f4838(module0067.f4891(var82)); module0634.NIL == module0066.f4841(var83); var83 = module0066.f4840(var83)) {
                                                                var29.resetMultipleValues();
                                                                final SubLObject var84 = module0066.f4839(var83);
                                                                final SubLObject var85 = var29.secondMultipleValue();
                                                                var29.resetMultipleValues();
                                                                if (module0634.NIL != module0147.f9507(var84)) {
                                                                    final SubLObject var15_44 = module0138.$g1623$.currentBinding(var29);
                                                                    try {
                                                                        module0138.$g1623$.bind(var84, var29);
                                                                        SubLObject var58_63;
                                                                        for (var58_63 = module0066.f4838(module0067.f4891(var85)); module0634.NIL == module0066.f4841(var58_63); var58_63 = module0066.f4840(var58_63)) {
                                                                            var29.resetMultipleValues();
                                                                            final SubLObject var86 = module0066.f4839(var58_63);
                                                                            final SubLObject var87 = var29.secondMultipleValue();
                                                                            var29.resetMultipleValues();
                                                                            if (module0634.NIL != module0141.f9289(var86)) {
                                                                                final SubLObject var15_45 = module0138.$g1624$.currentBinding(var29);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var86, var29);
                                                                                    final SubLObject var88 = var87;
                                                                                    if (module0634.NIL != module0077.f5302(var88)) {
                                                                                        final SubLObject var89 = module0077.f5333(var88);
                                                                                        SubLObject var90;
                                                                                        SubLObject var91;
                                                                                        SubLObject var92;
                                                                                        for (var90 = module0032.f1741(var89), var91 = (SubLObject)module0634.NIL, var91 = module0032.f1742(var90, var89); module0634.NIL == module0032.f1744(var90, var91); var91 = module0032.f1743(var91)) {
                                                                                            var92 = module0032.f1745(var90, var91);
                                                                                            if (module0634.NIL != module0032.f1746(var91, var92) && module0634.NIL == module0249.f16059(var92, (SubLObject)module0634.UNPROVIDED)) {
                                                                                                module0249.f16055(var92, (SubLObject)module0634.UNPROVIDED);
                                                                                                module0056.f4149(var92, var34);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var88.isList()) {
                                                                                        SubLObject var93 = var88;
                                                                                        SubLObject var94 = (SubLObject)module0634.NIL;
                                                                                        var94 = var93.first();
                                                                                        while (module0634.NIL != var93) {
                                                                                            if (module0634.NIL == module0249.f16059(var94, (SubLObject)module0634.UNPROVIDED)) {
                                                                                                module0249.f16055(var94, (SubLObject)module0634.UNPROVIDED);
                                                                                                module0056.f4149(var94, var34);
                                                                                            }
                                                                                            var93 = var93.rest();
                                                                                            var94 = var93.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0634.$ic38$, var88);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var15_45, var29);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var58_63);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var15_44, var29);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var83);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0634.FIVE_INTEGER, (SubLObject)module0634.$ic39$, (SubLObject)module0634.UNPROVIDED, (SubLObject)module0634.UNPROVIDED, (SubLObject)module0634.UNPROVIDED, (SubLObject)module0634.UNPROVIDED, (SubLObject)module0634.UNPROVIDED);
                                                    }
                                                }
                                                else if (module0634.NIL != module0155.f9785(var80, (SubLObject)module0634.UNPROVIDED)) {
                                                    SubLObject var21_82;
                                                    final SubLObject var95 = var21_82 = ((module0634.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var29), module0137.f8955((SubLObject)module0634.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var29), module0137.f8955((SubLObject)module0634.UNPROVIDED)));
                                                    SubLObject var96 = (SubLObject)module0634.NIL;
                                                    var96 = var21_82.first();
                                                    while (module0634.NIL != var21_82) {
                                                        final SubLObject var15_46 = module0138.$g1625$.currentBinding(var29);
                                                        try {
                                                            module0138.$g1625$.bind(var96, var29);
                                                            final SubLObject var98;
                                                            final SubLObject var97 = var98 = Functions.funcall(var96, var80);
                                                            if (module0634.NIL != module0077.f5302(var98)) {
                                                                final SubLObject var99 = module0077.f5333(var98);
                                                                SubLObject var100;
                                                                SubLObject var101;
                                                                SubLObject var102;
                                                                for (var100 = module0032.f1741(var99), var101 = (SubLObject)module0634.NIL, var101 = module0032.f1742(var100, var99); module0634.NIL == module0032.f1744(var100, var101); var101 = module0032.f1743(var101)) {
                                                                    var102 = module0032.f1745(var100, var101);
                                                                    if (module0634.NIL != module0032.f1746(var101, var102) && module0634.NIL == module0249.f16059(var102, (SubLObject)module0634.UNPROVIDED)) {
                                                                        module0249.f16055(var102, (SubLObject)module0634.UNPROVIDED);
                                                                        module0056.f4149(var102, var34);
                                                                    }
                                                                }
                                                            }
                                                            else if (var98.isList()) {
                                                                SubLObject var103 = var98;
                                                                SubLObject var104 = (SubLObject)module0634.NIL;
                                                                var104 = var103.first();
                                                                while (module0634.NIL != var103) {
                                                                    if (module0634.NIL == module0249.f16059(var104, (SubLObject)module0634.UNPROVIDED)) {
                                                                        module0249.f16055(var104, (SubLObject)module0634.UNPROVIDED);
                                                                        module0056.f4149(var104, var34);
                                                                    }
                                                                    var103 = var103.rest();
                                                                    var104 = var103.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0634.$ic38$, var98);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var15_46, var29);
                                                        }
                                                        var21_82 = var21_82.rest();
                                                        var96 = var21_82.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var30_38, var29);
                                                module0137.$g1605$.rebind(var15_43, var29);
                                            }
                                            var78 = var78.rest();
                                            var79 = var78.first();
                                        }
                                        var34_35 = module0056.f4150(var34);
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var44_49, var29);
                                    module0138.$g1619$.rebind(var30_36, var29);
                                    module0141.$g1677$.rebind(var15_36, var29);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)module0634.TWO_INTEGER, (SubLObject)module0634.$ic41$, var28, module0244.f15748(module0137.f8955((SubLObject)module0634.UNPROVIDED)), (SubLObject)module0634.UNPROVIDED, (SubLObject)module0634.UNPROVIDED, (SubLObject)module0634.UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var39, var29);
                            module0141.$g1674$.rebind(var38, var29);
                            module0141.$g1672$.rebind(var37, var29);
                            module0141.$g1671$.rebind(var30_35, var29);
                            module0141.$g1670$.rebind(var15_35, var29);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var30_34, var29);
                        module0141.$g1714$.rebind(var15_34, var29);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var29));
                }
                finally {
                    module0139.$g1635$.rebind(var15_33, var29);
                }
                module0139.f9011(module0139.$g1636$.getDynamicValue(var29));
            }
            finally {
                module0139.$g1636$.rebind(var30_33, var29);
                module0137.$g1605$.rebind(var15_32, var29);
            }
        }
        finally {
            module0147.$g2095$.rebind(var32, var29);
            module0147.$g2094$.rebind(var31, var29);
        }
        return var30;
    }
    
    public static SubLObject f38778(final SubLObject var1) {
        return (SubLObject)((module0634.NIL != module0259.f16976(var1, module0634.$ic42$)) ? module0634.NIL : f38779(var1));
    }
    
    public static SubLObject f38779(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = f38755(var1);
        return module0029.f1506(module0029.$g836$.getDynamicValue(var2), var3);
    }
    
    public static SubLObject f38780() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0634", "f38755", "S#2634", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0634", "f38756", "S#2641", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0634", "f38757", "S#2648", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0634", "f38758", "S#42475", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0634", "f38759", "S#2663", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0634", "f38760", "S#42476", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0634", "f38761", "S#2655", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0634", "f38762", "S#2670", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0634", "f38763", "S#2677", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0634", "f38764", "S#2662", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0634", "f38765", "S#33255", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0634", "f38766", "S#42477", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0634", "f38767", "S#9335", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0634", "f38768", "S#42478", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0634", "f38770", "S#42479", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0634", "f38772", "S#42480", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0634", "f38771", "S#42481", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0634", "f38769", "S#42482", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0634", "f38773", "S#42483", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0634", "f38774", "S#42484", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0634", "f38776", "S#42485", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0634", "f38777", "LOAD-ALL-KB-CONTENT-POST-BUILD-TESTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0634", "f38775", "S#42486", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0634", "f38778", "S#42487", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0634", "f38779", "S#42488", 1, 0, false);
        return (SubLObject)module0634.NIL;
    }
    
    public static SubLObject f38781() {
        return (SubLObject)module0634.NIL;
    }
    
    public static SubLObject f38782() {
        return (SubLObject)module0634.NIL;
    }
    
    public void declareFunctions() {
        f38780();
    }
    
    public void initializeVariables() {
        f38781();
    }
    
    public void runTopLevelForms() {
        f38782();
    }
    
    static {
        me = (SubLFile)new module0634();
        $ic0$ = SubLObjectFactory.makeKeyword("FULL");
        $ic1$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Now"));
        $ic2$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Null-TimeParameter"));
        $ic3$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("testResponsibleCyclist"));
        $ic4$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic5$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("MtSpace")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("TestVocabularyMt")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("MtTimeDimFn")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Now"))));
        $ic6$ = SubLObjectFactory.makeSymbol("S#2628", "CYC");
        $ic7$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("testResponsibleProject"));
        $ic8$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CycorpBusinessDatabaseMt"));
        $ic9$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("OngoingStatus"));
        $ic10$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("KBContentRegressionTest"));
        $ic11$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("KBContentPostBuildTest"));
        $ic12$ = SubLObjectFactory.makeKeyword("BROWSABLE?");
        $ic13$ = SubLObjectFactory.makeKeyword("BLOCK?");
        $ic14$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TOTAL-TIME"));
        $ic15$ = SubLObjectFactory.makeKeyword("VERBOSE");
        $ic16$ = SubLObjectFactory.makeKeyword("KCT");
        $ic17$ = SubLObjectFactory.makeKeyword("SUCCESS");
        $ic18$ = SubLObjectFactory.makeKeyword("REGRESSION-SUCCESS");
        $ic19$ = SubLObjectFactory.makeKeyword("NON-REGRESSION-SUCCESS");
        $ic20$ = SubLObjectFactory.makeKeyword("FAILURE");
        $ic21$ = SubLObjectFactory.makeKeyword("REGRESSION-FAILURE");
        $ic22$ = SubLObjectFactory.makeKeyword("NON-REGRESSION-FAILURE");
        $ic23$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("KBContentTest-FullySpecified"));
        $ic24$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic25$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic26$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic27$ = SubLObjectFactory.makeKeyword("BREADTH");
        $ic28$ = SubLObjectFactory.makeKeyword("QUEUE");
        $ic29$ = SubLObjectFactory.makeKeyword("STACK");
        $ic30$ = SubLObjectFactory.makeSymbol("S#11450", "CYC");
        $ic31$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic32$ = SubLObjectFactory.makeString("~A is not a ~A");
        $ic33$ = SubLObjectFactory.makeSymbol("S#11592", "CYC");
        $ic34$ = SubLObjectFactory.makeKeyword("CERROR");
        $ic35$ = SubLObjectFactory.makeString("continue anyway");
        $ic36$ = SubLObjectFactory.makeKeyword("WARN");
        $ic37$ = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic38$ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $ic39$ = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic40$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("US#4D5E436"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#1526883"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#15AA083"));
        $ic41$ = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic42$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("HLPrototypicalTerm"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0634.class
	Total time: 848 ms
	
	Decompiled with Procyon 0.5.32.
*/