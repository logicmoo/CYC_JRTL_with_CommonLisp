package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0266 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0266";
    public static final String myFingerPrint = "4853475cc4239d76dcf629f9513298481ab70d7a887b8539edff9e497afd7182";
    private static SubLSymbol $g2525$;
    private static final SubLString $ic0$;
    private static final SubLString $ic1$;
    private static final SubLInteger $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLString $ic5$;
    private static final SubLString $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLObject $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLObject $ic14$;
    private static final SubLString $ic15$;
    private static final SubLList $ic16$;
    private static final SubLList $ic17$;
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
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLList $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLList $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLList $ic51$;
    private static final SubLList $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLObject $ic54$;
    private static final SubLSymbol $ic55$;
    
    public static SubLObject f17496(final SubLObject var1, final SubLObject var2) {
        if (NIL != module0134.f8773(var1)) {
            f17497(var1, var2);
        }
        else {
            module0134.f8815((SubLObject)ONE_INTEGER, (SubLObject)$ic0$, module0134.f8735(var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17497(final SubLObject var1, final SubLObject var2) {
        if (NIL != module0134.f8761(var1) && NIL != module0134.f8762(var1) && NIL != module0134.f8764(var1)) {
            f17498(var1, var2, module0134.f8754(var1));
        }
        else if (NIL != module0134.f8761(var1) && NIL != module0134.f8770(var1)) {
            f17499(var1, var2, module0134.f8754(var1));
        }
        else if (NIL != module0134.f8770(var1)) {
            f17500(var1, var2);
        }
        else if (NIL != module0134.f8771(var1)) {
            f17501(var1, var2);
        }
        else {
            module0134.f8815((SubLObject)ONE_INTEGER, (SubLObject)$ic1$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17502(final SubLObject var1, final SubLObject var2) {
        return (NIL != module0134.f8770(var1)) ? f17500(var1, var2) : f17501(var1, var2);
    }
    
    public static SubLObject f17503(final SubLObject var1, final SubLObject var2) {
        return (NIL != module0134.f8770(var1)) ? f17504(var1, var2) : f17505(var1, var2);
    }
    
    public static SubLObject f17506(final SubLObject var1, final SubLObject var2) {
        assert NIL != module0134.f8756(var1) : var1;
        return f17502(var1, var2);
    }
    
    public static SubLObject f17507(final SubLObject var1, final SubLObject var2) {
        assert NIL != module0134.f8758(var1) : var1;
        return f17503(var1, var2);
    }
    
    public static SubLObject f17500(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        return $g2525$.getDynamicValue(var3).isInteger() ? f17508(var1, var2, (SubLObject)T, (SubLObject)ZERO_INTEGER) : f17509(var1, var2, (SubLObject)T);
    }
    
    public static SubLObject f17504(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        return $g2525$.getDynamicValue(var3).isInteger() ? f17508(var1, var2, (SubLObject)NIL, (SubLObject)ZERO_INTEGER) : f17509(var1, var2, (SubLObject)NIL);
    }
    
    public static SubLObject f17501(final SubLObject var1, final SubLObject var2) {
        return f17510(var1, var2, (SubLObject)T);
    }
    
    public static SubLObject f17505(final SubLObject var1, final SubLObject var2) {
        return f17510(var1, var2, (SubLObject)NIL);
    }
    
    public static SubLObject f17509(final SubLObject var1, final SubLObject var2, final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        if ((NIL == module0134.f8756(var1) || NIL == module0134.f8766(var1)) && NIL != ((NIL != var4) ? makeBoolean(NIL == module0240.f15614(var1, var2)) : module0240.f15614(var1, var2))) {
            module0240.f15618(var1, var2, var4);
            if (NIL != module0134.f8756(var1) && NIL != module0241.f15631(var1, var2, (SubLObject)UNPROVIDED)) {
                module0241.f15636(var1, var2);
            }
            else {
                if (NIL != module0134.f8758(var1)) {
                    Functions.funcall(module0134.f8757(var1), var1, var2);
                }
                SubLObject var6 = module0134.f8741(var1);
                SubLObject var7 = (SubLObject)NIL;
                var7 = var6.first();
                while (NIL != var6) {
                    final SubLObject var8 = module0239.$g2445$.currentBinding(var5);
                    try {
                        module0239.$g2445$.bind(var7, var5);
                        if (NIL != module0244.f15730(var7)) {
                            final SubLObject var8_9 = module0228.f15229(var2);
                            final SubLObject var7_10 = module0141.$g1670$.currentBinding(var5);
                            final SubLObject var9 = module0141.$g1671$.currentBinding(var5);
                            final SubLObject var10 = module0141.$g1672$.currentBinding(var5);
                            final SubLObject var11 = module0141.$g1674$.currentBinding(var5);
                            final SubLObject var12 = module0137.$g1605$.currentBinding(var5);
                            final SubLObject var13 = module0141.$g1674$.currentBinding(var5);
                            try {
                                module0141.$g1670$.bind(module0137.f8955(var7), var5);
                                module0141.$g1671$.bind(module0244.f15739(module0137.f8955(var7)), var5);
                                module0141.$g1672$.bind(module0244.f15746(module0137.f8955(var7)), var5);
                                module0141.$g1674$.bind((SubLObject)NIL, var5);
                                module0137.$g1605$.bind(module0137.f8955(var7), var5);
                                module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var5)) : module0141.$g1674$.getDynamicValue(var5)), var5);
                                if (NIL != module0173.f10955(var8_9)) {
                                    final SubLObject var14 = module0242.f15664(var8_9, module0137.f8955(var7));
                                    if (NIL != var14) {
                                        if (NIL == module0237.$g2444$.getDynamicValue(var5)) {
                                            SubLObject var15 = module0133.f8715(module0134.f8746(var1));
                                            SubLObject var16 = (SubLObject)NIL;
                                            var16 = var15.first();
                                            while (NIL == module0237.$g2444$.getDynamicValue(var5) && NIL != var15) {
                                                final SubLObject var17 = module0244.f15782(var16, module0137.f8955(var7));
                                                final SubLObject var18 = module0245.f15834(var14, var17, module0137.f8955(var7));
                                                if (NIL != var18) {
                                                    SubLObject var19;
                                                    for (var19 = module0066.f4838(module0067.f4891(var18)); NIL == module0237.$g2444$.getDynamicValue(var5) && NIL == module0066.f4841(var19); var19 = module0066.f4840(var19)) {
                                                        var5.resetMultipleValues();
                                                        final SubLObject var20 = module0066.f4839(var19);
                                                        final SubLObject var21 = var5.secondMultipleValue();
                                                        var5.resetMultipleValues();
                                                        if (NIL != module0147.f9507(var20)) {
                                                            final SubLObject var7_11 = module0138.$g1623$.currentBinding(var5);
                                                            try {
                                                                module0138.$g1623$.bind(var20, var5);
                                                                SubLObject var21_25;
                                                                for (var21_25 = module0066.f4838(module0067.f4891(var21)); NIL == module0237.$g2444$.getDynamicValue(var5) && NIL == module0066.f4841(var21_25); var21_25 = module0066.f4840(var21_25)) {
                                                                    var5.resetMultipleValues();
                                                                    final SubLObject var22 = module0066.f4839(var21_25);
                                                                    final SubLObject var23 = var5.secondMultipleValue();
                                                                    var5.resetMultipleValues();
                                                                    if (NIL != module0141.f9289(var22)) {
                                                                        final SubLObject var7_12 = module0138.$g1624$.currentBinding(var5);
                                                                        try {
                                                                            module0138.$g1624$.bind(var22, var5);
                                                                            final SubLObject var24 = var23;
                                                                            if (NIL != module0077.f5302(var24)) {
                                                                                final SubLObject var25 = module0077.f5333(var24);
                                                                                SubLObject var26;
                                                                                SubLObject var27;
                                                                                SubLObject var28;
                                                                                SubLObject var29;
                                                                                for (var26 = module0032.f1741(var25), var27 = (SubLObject)NIL, var27 = module0032.f1742(var26, var25); NIL == module0237.$g2444$.getDynamicValue(var5) && NIL == module0032.f1744(var26, var27); var27 = module0032.f1743(var27)) {
                                                                                    var28 = module0032.f1745(var26, var27);
                                                                                    if (NIL != module0032.f1746(var27, var28)) {
                                                                                        var29 = module0239.f15595(var7, var2, var28, module0134.f8746(var1));
                                                                                        f17509(var1, var28, var4);
                                                                                        if (NIL != module0237.$g2444$.getDynamicValue(var5) && NIL != module0134.f8749(var1)) {
                                                                                            f17511(var1, var29);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            else if (var24.isList()) {
                                                                                if (NIL == module0237.$g2444$.getDynamicValue(var5)) {
                                                                                    SubLObject var17_35 = var24;
                                                                                    SubLObject var30 = (SubLObject)NIL;
                                                                                    var30 = var17_35.first();
                                                                                    while (NIL == module0237.$g2444$.getDynamicValue(var5) && NIL != var17_35) {
                                                                                        final SubLObject var31 = module0239.f15595(var7, var2, var30, module0134.f8746(var1));
                                                                                        f17509(var1, var30, var4);
                                                                                        if (NIL != module0237.$g2444$.getDynamicValue(var5) && NIL != module0134.f8749(var1)) {
                                                                                            f17511(var1, var31);
                                                                                        }
                                                                                        var17_35 = var17_35.rest();
                                                                                        var30 = var17_35.first();
                                                                                    }
                                                                                }
                                                                            }
                                                                            else {
                                                                                Errors.error((SubLObject)$ic5$, var24);
                                                                            }
                                                                        }
                                                                        finally {
                                                                            module0138.$g1624$.rebind(var7_12, var5);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var21_25);
                                                            }
                                                            finally {
                                                                module0138.$g1623$.rebind(var7_11, var5);
                                                            }
                                                        }
                                                    }
                                                    module0066.f4842(var19);
                                                }
                                                var15 = var15.rest();
                                                var16 = var15.first();
                                            }
                                        }
                                    }
                                    else {
                                        module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic6$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    }
                                }
                                else if (NIL != module0210.f13595(var8_9, (SubLObject)UNPROVIDED) && NIL == module0237.$g2444$.getDynamicValue(var5)) {
                                    SubLObject var32 = module0133.f8715(module0134.f8746(var1));
                                    SubLObject var33 = (SubLObject)NIL;
                                    var33 = var32.first();
                                    while (NIL == module0237.$g2444$.getDynamicValue(var5) && NIL != var32) {
                                        final SubLObject var34 = module0244.f15782(var33, module0137.f8955(var7));
                                        final SubLObject var35 = (NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(var34, module0141.$g1714$.getDynamicValue(var5), module0137.f8955(var7))) : module0244.f15760(var34, module0141.$g1714$.getDynamicValue(var5), module0137.f8955(var7));
                                        SubLObject var36;
                                        SubLObject var37;
                                        SubLObject var7_13;
                                        SubLObject var39;
                                        SubLObject var38;
                                        SubLObject var40;
                                        SubLObject var41;
                                        SubLObject var42;
                                        SubLObject var43;
                                        SubLObject var44;
                                        SubLObject var17_36;
                                        SubLObject var45;
                                        SubLObject var46;
                                        for (var36 = (SubLObject)NIL, var36 = var35; NIL == module0237.$g2444$.getDynamicValue(var5) && NIL != var36; var36 = var36.rest()) {
                                            var37 = var36.first();
                                            var7_13 = module0138.$g1625$.currentBinding(var5);
                                            try {
                                                module0138.$g1625$.bind(var37, var5);
                                                var38 = (var39 = Functions.funcall(var37, var8_9));
                                                if (NIL != module0077.f5302(var39)) {
                                                    var40 = module0077.f5333(var39);
                                                    for (var41 = module0032.f1741(var40), var42 = (SubLObject)NIL, var42 = module0032.f1742(var41, var40); NIL == module0237.$g2444$.getDynamicValue(var5) && NIL == module0032.f1744(var41, var42); var42 = module0032.f1743(var42)) {
                                                        var43 = module0032.f1745(var41, var42);
                                                        if (NIL != module0032.f1746(var42, var43)) {
                                                            var44 = module0239.f15595(var7, var2, var43, module0134.f8746(var1));
                                                            f17509(var1, var43, var4);
                                                            if (NIL != module0237.$g2444$.getDynamicValue(var5) && NIL != module0134.f8749(var1)) {
                                                                f17511(var1, var44);
                                                            }
                                                        }
                                                    }
                                                }
                                                else if (var39.isList()) {
                                                    if (NIL == module0237.$g2444$.getDynamicValue(var5)) {
                                                        var17_36 = var39;
                                                        var45 = (SubLObject)NIL;
                                                        var45 = var17_36.first();
                                                        while (NIL == module0237.$g2444$.getDynamicValue(var5) && NIL != var17_36) {
                                                            var46 = module0239.f15595(var7, var2, var45, module0134.f8746(var1));
                                                            f17509(var1, var45, var4);
                                                            if (NIL != module0237.$g2444$.getDynamicValue(var5) && NIL != module0134.f8749(var1)) {
                                                                f17511(var1, var46);
                                                            }
                                                            var17_36 = var17_36.rest();
                                                            var45 = var17_36.first();
                                                        }
                                                    }
                                                }
                                                else {
                                                    Errors.error((SubLObject)$ic5$, var39);
                                                }
                                            }
                                            finally {
                                                module0138.$g1625$.rebind(var7_13, var5);
                                            }
                                        }
                                        var32 = var32.rest();
                                        var33 = var32.first();
                                    }
                                }
                            }
                            finally {
                                module0141.$g1674$.rebind(var13, var5);
                                module0137.$g1605$.rebind(var12, var5);
                                module0141.$g1674$.rebind(var11, var5);
                                module0141.$g1672$.rebind(var10, var5);
                                module0141.$g1671$.rebind(var9, var5);
                                module0141.$g1670$.rebind(var7_10, var5);
                            }
                        }
                        else if (NIL != module0239.f15601(var7)) {
                            final SubLObject var47 = module0130.f8524((SubLObject)$ic7$);
                            final SubLObject var48 = module0130.f8523((SubLObject)$ic7$);
                            final SubLObject var7_14 = module0134.$g1584$.currentBinding(var5);
                            try {
                                module0134.$g1584$.bind((SubLObject)NIL, var5);
                                if (NIL == module0237.$g2444$.getDynamicValue(var5)) {
                                    SubLObject var49 = module0133.f8715(module0134.f8746(var1));
                                    SubLObject var50 = (SubLObject)NIL;
                                    var50 = var49.first();
                                    while (NIL == module0237.$g2444$.getDynamicValue(var5) && NIL != var49) {
                                        final SubLObject var51 = module0239.f15602(var50);
                                        final SubLObject var52 = module0107.f7613(var51);
                                        final SubLObject var7_15 = module0239.$g2446$.currentBinding(var5);
                                        SubLObject var53 = module0148.$g2099$.currentBinding(var5);
                                        try {
                                            module0239.$g2446$.bind(var7, var5);
                                            module0148.$g2099$.bind((SubLObject)$ic8$, var5);
                                            final SubLObject var54 = (SubLObject)NIL;
                                            if (NIL != module0158.f10010(var2, var51, var54)) {
                                                final SubLObject var55 = module0158.f10011(var2, var51, var54);
                                                SubLObject var56 = module0237.$g2444$.getDynamicValue(var5);
                                                final SubLObject var57 = (SubLObject)NIL;
                                                while (NIL == var56) {
                                                    final SubLObject var58 = module0052.f3695(var55, var57);
                                                    final SubLObject var59 = (SubLObject)makeBoolean(!var57.eql(var58));
                                                    if (NIL != var59) {
                                                        SubLObject var60 = (SubLObject)NIL;
                                                        try {
                                                            var60 = module0158.f10316(var58, (SubLObject)$ic9$, var47, (SubLObject)NIL);
                                                            SubLObject var50_55 = module0237.$g2444$.getDynamicValue(var5);
                                                            final SubLObject var51_56 = (SubLObject)NIL;
                                                            while (NIL == var50_55) {
                                                                final SubLObject var61 = module0052.f3695(var60, var51_56);
                                                                final SubLObject var53_58 = (SubLObject)makeBoolean(!var51_56.eql(var61));
                                                                if (NIL != var53_58 && (NIL == assertion_handles_oc.f11035(var61) || NIL != module0130.f8509(module0178.f11293(var61), var48))) {
                                                                    final SubLObject var62 = module0205.f13134(var61, var52, (SubLObject)UNPROVIDED);
                                                                    final SubLObject var63 = var61;
                                                                    f17509(var1, var62, var4);
                                                                    if (NIL != module0237.$g2444$.getDynamicValue(var5) && NIL != module0134.f8749(var1)) {
                                                                        f17511(var1, var63);
                                                                    }
                                                                }
                                                                var50_55 = (SubLObject)makeBoolean(NIL == var53_58 || NIL != module0237.$g2444$.getDynamicValue(var5));
                                                            }
                                                        }
                                                        finally {
                                                            final SubLObject var7_16 = Threads.$is_thread_performing_cleanupP$.currentBinding(var5);
                                                            try {
                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var5);
                                                                if (NIL != var60) {
                                                                    module0158.f10319(var60);
                                                                }
                                                            }
                                                            finally {
                                                                Threads.$is_thread_performing_cleanupP$.rebind(var7_16, var5);
                                                            }
                                                        }
                                                    }
                                                    var56 = (SubLObject)makeBoolean(NIL == var59 || NIL != module0237.$g2444$.getDynamicValue(var5));
                                                }
                                            }
                                        }
                                        finally {
                                            module0148.$g2099$.rebind(var53, var5);
                                            module0239.$g2446$.rebind(var7_15, var5);
                                        }
                                        if (NIL != module0134.f8807()) {
                                            final SubLObject var7_17 = module0134.$g1584$.currentBinding(var5);
                                            var53 = module0239.$g2446$.currentBinding(var5);
                                            final SubLObject var64 = module0148.$g2099$.currentBinding(var5);
                                            try {
                                                module0134.$g1584$.bind((SubLObject)T, var5);
                                                module0239.$g2446$.bind(var7, var5);
                                                module0148.$g2099$.bind((SubLObject)$ic8$, var5);
                                                final SubLObject var65 = (SubLObject)NIL;
                                                if (NIL != module0158.f10010(var2, var52, var65)) {
                                                    final SubLObject var66 = module0158.f10011(var2, var52, var65);
                                                    SubLObject var67 = module0237.$g2444$.getDynamicValue(var5);
                                                    final SubLObject var68 = (SubLObject)NIL;
                                                    while (NIL == var67) {
                                                        final SubLObject var69 = module0052.f3695(var66, var68);
                                                        final SubLObject var70 = (SubLObject)makeBoolean(!var68.eql(var69));
                                                        if (NIL != var70) {
                                                            SubLObject var71 = (SubLObject)NIL;
                                                            try {
                                                                var71 = module0158.f10316(var69, (SubLObject)$ic9$, var47, (SubLObject)NIL);
                                                                SubLObject var50_56 = module0237.$g2444$.getDynamicValue(var5);
                                                                final SubLObject var51_57 = (SubLObject)NIL;
                                                                while (NIL == var50_56) {
                                                                    final SubLObject var72 = module0052.f3695(var71, var51_57);
                                                                    final SubLObject var53_59 = (SubLObject)makeBoolean(!var51_57.eql(var72));
                                                                    if (NIL != var53_59 && (NIL == assertion_handles_oc.f11035(var72) || NIL != module0130.f8509(module0178.f11293(var72), var48))) {
                                                                        final SubLObject var73 = module0205.f13134(var72, var51, (SubLObject)UNPROVIDED);
                                                                        final SubLObject var74 = var72;
                                                                        f17509(var1, var73, var4);
                                                                        if (NIL != module0237.$g2444$.getDynamicValue(var5) && NIL != module0134.f8749(var1)) {
                                                                            f17511(var1, var74);
                                                                        }
                                                                    }
                                                                    var50_56 = (SubLObject)makeBoolean(NIL == var53_59 || NIL != module0237.$g2444$.getDynamicValue(var5));
                                                                }
                                                            }
                                                            finally {
                                                                final SubLObject var7_18 = Threads.$is_thread_performing_cleanupP$.currentBinding(var5);
                                                                try {
                                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var5);
                                                                    if (NIL != var71) {
                                                                        module0158.f10319(var71);
                                                                    }
                                                                }
                                                                finally {
                                                                    Threads.$is_thread_performing_cleanupP$.rebind(var7_18, var5);
                                                                }
                                                            }
                                                        }
                                                        var67 = (SubLObject)makeBoolean(NIL == var70 || NIL != module0237.$g2444$.getDynamicValue(var5));
                                                    }
                                                }
                                            }
                                            finally {
                                                module0148.$g2099$.rebind(var64, var5);
                                                module0239.$g2446$.rebind(var53, var5);
                                                module0134.$g1584$.rebind(var7_17, var5);
                                            }
                                        }
                                        var49 = var49.rest();
                                        var50 = var49.first();
                                    }
                                }
                            }
                            finally {
                                module0134.$g1584$.rebind(var7_14, var5);
                            }
                        }
                    }
                    finally {
                        module0239.$g2445$.rebind(var8, var5);
                    }
                    var6 = var6.rest();
                    var7 = var6.first();
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17508(final SubLObject var1, final SubLObject var2, final SubLObject var4, final SubLObject var65) {
        final SubLThread var66 = SubLProcess.currentSubLThread();
        return var65.numL($g2525$.getDynamicValue(var66)) ? f17512(var1, var2, var4, var65) : f17513(var1, var2, var4);
    }
    
    public static SubLObject f17512(final SubLObject var1, final SubLObject var2, final SubLObject var4, final SubLObject var65) {
        final SubLThread var66 = SubLProcess.currentSubLThread();
        if ((NIL == module0134.f8756(var1) || NIL == module0134.f8766(var1)) && NIL != ((NIL != var4) ? makeBoolean(NIL == module0240.f15614(var1, var2)) : module0240.f15614(var1, var2))) {
            module0240.f15618(var1, var2, var4);
            if (NIL != module0134.f8756(var1) && NIL != module0241.f15631(var1, var2, (SubLObject)UNPROVIDED)) {
                module0241.f15636(var1, var2);
            }
            else {
                if (NIL != module0134.f8758(var1)) {
                    Functions.funcall(module0134.f8757(var1), var1, var2);
                }
                SubLObject var67 = module0134.f8741(var1);
                SubLObject var68 = (SubLObject)NIL;
                var68 = var67.first();
                while (NIL != var67) {
                    final SubLObject var69 = module0239.$g2445$.currentBinding(var66);
                    try {
                        module0239.$g2445$.bind(var68, var66);
                        if (NIL != module0244.f15730(var68)) {
                            final SubLObject var8_66 = module0228.f15229(var2);
                            final SubLObject var7_67 = module0141.$g1670$.currentBinding(var66);
                            final SubLObject var70 = module0141.$g1671$.currentBinding(var66);
                            final SubLObject var71 = module0141.$g1672$.currentBinding(var66);
                            final SubLObject var72 = module0141.$g1674$.currentBinding(var66);
                            final SubLObject var73 = module0137.$g1605$.currentBinding(var66);
                            final SubLObject var74 = module0141.$g1674$.currentBinding(var66);
                            try {
                                module0141.$g1670$.bind(module0137.f8955(var68), var66);
                                module0141.$g1671$.bind(module0244.f15739(module0137.f8955(var68)), var66);
                                module0141.$g1672$.bind(module0244.f15746(module0137.f8955(var68)), var66);
                                module0141.$g1674$.bind((SubLObject)NIL, var66);
                                module0137.$g1605$.bind(module0137.f8955(var68), var66);
                                module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var66)) : module0141.$g1674$.getDynamicValue(var66)), var66);
                                if (NIL != module0173.f10955(var8_66)) {
                                    final SubLObject var75 = module0242.f15664(var8_66, module0137.f8955(var68));
                                    if (NIL != var75) {
                                        if (NIL == module0237.$g2444$.getDynamicValue(var66)) {
                                            SubLObject var76 = module0133.f8715(module0134.f8746(var1));
                                            SubLObject var77 = (SubLObject)NIL;
                                            var77 = var76.first();
                                            while (NIL == module0237.$g2444$.getDynamicValue(var66) && NIL != var76) {
                                                final SubLObject var78 = module0244.f15782(var77, module0137.f8955(var68));
                                                final SubLObject var79 = module0245.f15834(var75, var78, module0137.f8955(var68));
                                                if (NIL != var79) {
                                                    SubLObject var80;
                                                    for (var80 = module0066.f4838(module0067.f4891(var79)); NIL == module0237.$g2444$.getDynamicValue(var66) && NIL == module0066.f4841(var80); var80 = module0066.f4840(var80)) {
                                                        var66.resetMultipleValues();
                                                        final SubLObject var81 = module0066.f4839(var80);
                                                        final SubLObject var82 = var66.secondMultipleValue();
                                                        var66.resetMultipleValues();
                                                        if (NIL != module0147.f9507(var81)) {
                                                            final SubLObject var7_68 = module0138.$g1623$.currentBinding(var66);
                                                            try {
                                                                module0138.$g1623$.bind(var81, var66);
                                                                SubLObject var21_69;
                                                                for (var21_69 = module0066.f4838(module0067.f4891(var82)); NIL == module0237.$g2444$.getDynamicValue(var66) && NIL == module0066.f4841(var21_69); var21_69 = module0066.f4840(var21_69)) {
                                                                    var66.resetMultipleValues();
                                                                    final SubLObject var83 = module0066.f4839(var21_69);
                                                                    final SubLObject var84 = var66.secondMultipleValue();
                                                                    var66.resetMultipleValues();
                                                                    if (NIL != module0141.f9289(var83)) {
                                                                        final SubLObject var7_69 = module0138.$g1624$.currentBinding(var66);
                                                                        try {
                                                                            module0138.$g1624$.bind(var83, var66);
                                                                            final SubLObject var85 = var84;
                                                                            if (NIL != module0077.f5302(var85)) {
                                                                                final SubLObject var86 = module0077.f5333(var85);
                                                                                SubLObject var87;
                                                                                SubLObject var88;
                                                                                SubLObject var89;
                                                                                SubLObject var90;
                                                                                for (var87 = module0032.f1741(var86), var88 = (SubLObject)NIL, var88 = module0032.f1742(var87, var86); NIL == module0237.$g2444$.getDynamicValue(var66) && NIL == module0032.f1744(var87, var88); var88 = module0032.f1743(var88)) {
                                                                                    var89 = module0032.f1745(var87, var88);
                                                                                    if (NIL != module0032.f1746(var88, var89)) {
                                                                                        var90 = module0239.f15595(var68, var2, var89, module0134.f8746(var1));
                                                                                        f17508(var1, var89, var4, module0048.f_1X(var65));
                                                                                        if (NIL != module0237.$g2444$.getDynamicValue(var66) && NIL != module0134.f8749(var1)) {
                                                                                            f17511(var1, var90);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            else if (var85.isList()) {
                                                                                if (NIL == module0237.$g2444$.getDynamicValue(var66)) {
                                                                                    SubLObject var17_71 = var85;
                                                                                    SubLObject var91 = (SubLObject)NIL;
                                                                                    var91 = var17_71.first();
                                                                                    while (NIL == module0237.$g2444$.getDynamicValue(var66) && NIL != var17_71) {
                                                                                        final SubLObject var92 = module0239.f15595(var68, var2, var91, module0134.f8746(var1));
                                                                                        f17508(var1, var91, var4, module0048.f_1X(var65));
                                                                                        if (NIL != module0237.$g2444$.getDynamicValue(var66) && NIL != module0134.f8749(var1)) {
                                                                                            f17511(var1, var92);
                                                                                        }
                                                                                        var17_71 = var17_71.rest();
                                                                                        var91 = var17_71.first();
                                                                                    }
                                                                                }
                                                                            }
                                                                            else {
                                                                                Errors.error((SubLObject)$ic5$, var85);
                                                                            }
                                                                        }
                                                                        finally {
                                                                            module0138.$g1624$.rebind(var7_69, var66);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var21_69);
                                                            }
                                                            finally {
                                                                module0138.$g1623$.rebind(var7_68, var66);
                                                            }
                                                        }
                                                    }
                                                    module0066.f4842(var80);
                                                }
                                                var76 = var76.rest();
                                                var77 = var76.first();
                                            }
                                        }
                                    }
                                    else {
                                        module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic6$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    }
                                }
                                else if (NIL != module0210.f13595(var8_66, (SubLObject)UNPROVIDED) && NIL == module0237.$g2444$.getDynamicValue(var66)) {
                                    SubLObject var93 = module0133.f8715(module0134.f8746(var1));
                                    SubLObject var94 = (SubLObject)NIL;
                                    var94 = var93.first();
                                    while (NIL == module0237.$g2444$.getDynamicValue(var66) && NIL != var93) {
                                        final SubLObject var95 = module0244.f15782(var94, module0137.f8955(var68));
                                        final SubLObject var96 = (NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(var95, module0141.$g1714$.getDynamicValue(var66), module0137.f8955(var68))) : module0244.f15760(var95, module0141.$g1714$.getDynamicValue(var66), module0137.f8955(var68));
                                        SubLObject var97;
                                        SubLObject var98;
                                        SubLObject var7_70;
                                        SubLObject var100;
                                        SubLObject var99;
                                        SubLObject var101;
                                        SubLObject var102;
                                        SubLObject var103;
                                        SubLObject var104;
                                        SubLObject var105;
                                        SubLObject var17_72;
                                        SubLObject var106;
                                        SubLObject var107;
                                        for (var97 = (SubLObject)NIL, var97 = var96; NIL == module0237.$g2444$.getDynamicValue(var66) && NIL != var97; var97 = var97.rest()) {
                                            var98 = var97.first();
                                            var7_70 = module0138.$g1625$.currentBinding(var66);
                                            try {
                                                module0138.$g1625$.bind(var98, var66);
                                                var99 = (var100 = Functions.funcall(var98, var8_66));
                                                if (NIL != module0077.f5302(var100)) {
                                                    var101 = module0077.f5333(var100);
                                                    for (var102 = module0032.f1741(var101), var103 = (SubLObject)NIL, var103 = module0032.f1742(var102, var101); NIL == module0237.$g2444$.getDynamicValue(var66) && NIL == module0032.f1744(var102, var103); var103 = module0032.f1743(var103)) {
                                                        var104 = module0032.f1745(var102, var103);
                                                        if (NIL != module0032.f1746(var103, var104)) {
                                                            var105 = module0239.f15595(var68, var2, var104, module0134.f8746(var1));
                                                            f17508(var1, var104, var4, module0048.f_1X(var65));
                                                            if (NIL != module0237.$g2444$.getDynamicValue(var66) && NIL != module0134.f8749(var1)) {
                                                                f17511(var1, var105);
                                                            }
                                                        }
                                                    }
                                                }
                                                else if (var100.isList()) {
                                                    if (NIL == module0237.$g2444$.getDynamicValue(var66)) {
                                                        var17_72 = var100;
                                                        var106 = (SubLObject)NIL;
                                                        var106 = var17_72.first();
                                                        while (NIL == module0237.$g2444$.getDynamicValue(var66) && NIL != var17_72) {
                                                            var107 = module0239.f15595(var68, var2, var106, module0134.f8746(var1));
                                                            f17508(var1, var106, var4, module0048.f_1X(var65));
                                                            if (NIL != module0237.$g2444$.getDynamicValue(var66) && NIL != module0134.f8749(var1)) {
                                                                f17511(var1, var107);
                                                            }
                                                            var17_72 = var17_72.rest();
                                                            var106 = var17_72.first();
                                                        }
                                                    }
                                                }
                                                else {
                                                    Errors.error((SubLObject)$ic5$, var100);
                                                }
                                            }
                                            finally {
                                                module0138.$g1625$.rebind(var7_70, var66);
                                            }
                                        }
                                        var93 = var93.rest();
                                        var94 = var93.first();
                                    }
                                }
                            }
                            finally {
                                module0141.$g1674$.rebind(var74, var66);
                                module0137.$g1605$.rebind(var73, var66);
                                module0141.$g1674$.rebind(var72, var66);
                                module0141.$g1672$.rebind(var71, var66);
                                module0141.$g1671$.rebind(var70, var66);
                                module0141.$g1670$.rebind(var7_67, var66);
                            }
                        }
                        else if (NIL != module0239.f15601(var68)) {
                            final SubLObject var108 = module0130.f8524((SubLObject)$ic7$);
                            final SubLObject var109 = module0130.f8523((SubLObject)$ic7$);
                            final SubLObject var7_71 = module0134.$g1584$.currentBinding(var66);
                            try {
                                module0134.$g1584$.bind((SubLObject)NIL, var66);
                                if (NIL == module0237.$g2444$.getDynamicValue(var66)) {
                                    SubLObject var110 = module0133.f8715(module0134.f8746(var1));
                                    SubLObject var111 = (SubLObject)NIL;
                                    var111 = var110.first();
                                    while (NIL == module0237.$g2444$.getDynamicValue(var66) && NIL != var110) {
                                        final SubLObject var112 = module0239.f15602(var111);
                                        final SubLObject var113 = module0107.f7613(var112);
                                        final SubLObject var7_72 = module0239.$g2446$.currentBinding(var66);
                                        SubLObject var114 = module0148.$g2099$.currentBinding(var66);
                                        try {
                                            module0239.$g2446$.bind(var68, var66);
                                            module0148.$g2099$.bind((SubLObject)$ic8$, var66);
                                            final SubLObject var115 = (SubLObject)NIL;
                                            if (NIL != module0158.f10010(var2, var112, var115)) {
                                                final SubLObject var116 = module0158.f10011(var2, var112, var115);
                                                SubLObject var117 = module0237.$g2444$.getDynamicValue(var66);
                                                final SubLObject var118 = (SubLObject)NIL;
                                                while (NIL == var117) {
                                                    final SubLObject var119 = module0052.f3695(var116, var118);
                                                    final SubLObject var120 = (SubLObject)makeBoolean(!var118.eql(var119));
                                                    if (NIL != var120) {
                                                        SubLObject var121 = (SubLObject)NIL;
                                                        try {
                                                            var121 = module0158.f10316(var119, (SubLObject)$ic9$, var108, (SubLObject)NIL);
                                                            SubLObject var50_76 = module0237.$g2444$.getDynamicValue(var66);
                                                            final SubLObject var51_77 = (SubLObject)NIL;
                                                            while (NIL == var50_76) {
                                                                final SubLObject var122 = module0052.f3695(var121, var51_77);
                                                                final SubLObject var53_78 = (SubLObject)makeBoolean(!var51_77.eql(var122));
                                                                if (NIL != var53_78 && (NIL == assertion_handles_oc.f11035(var122) || NIL != module0130.f8509(module0178.f11293(var122), var109))) {
                                                                    final SubLObject var123 = module0205.f13134(var122, var113, (SubLObject)UNPROVIDED);
                                                                    final SubLObject var124 = var122;
                                                                    f17508(var1, var123, var4, module0048.f_1X(var65));
                                                                    if (NIL != module0237.$g2444$.getDynamicValue(var66) && NIL != module0134.f8749(var1)) {
                                                                        f17511(var1, var124);
                                                                    }
                                                                }
                                                                var50_76 = (SubLObject)makeBoolean(NIL == var53_78 || NIL != module0237.$g2444$.getDynamicValue(var66));
                                                            }
                                                        }
                                                        finally {
                                                            final SubLObject var7_73 = Threads.$is_thread_performing_cleanupP$.currentBinding(var66);
                                                            try {
                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var66);
                                                                if (NIL != var121) {
                                                                    module0158.f10319(var121);
                                                                }
                                                            }
                                                            finally {
                                                                Threads.$is_thread_performing_cleanupP$.rebind(var7_73, var66);
                                                            }
                                                        }
                                                    }
                                                    var117 = (SubLObject)makeBoolean(NIL == var120 || NIL != module0237.$g2444$.getDynamicValue(var66));
                                                }
                                            }
                                        }
                                        finally {
                                            module0148.$g2099$.rebind(var114, var66);
                                            module0239.$g2446$.rebind(var7_72, var66);
                                        }
                                        if (NIL != module0134.f8807()) {
                                            final SubLObject var7_74 = module0134.$g1584$.currentBinding(var66);
                                            var114 = module0239.$g2446$.currentBinding(var66);
                                            final SubLObject var125 = module0148.$g2099$.currentBinding(var66);
                                            try {
                                                module0134.$g1584$.bind((SubLObject)T, var66);
                                                module0239.$g2446$.bind(var68, var66);
                                                module0148.$g2099$.bind((SubLObject)$ic8$, var66);
                                                final SubLObject var126 = (SubLObject)NIL;
                                                if (NIL != module0158.f10010(var2, var113, var126)) {
                                                    final SubLObject var127 = module0158.f10011(var2, var113, var126);
                                                    SubLObject var128 = module0237.$g2444$.getDynamicValue(var66);
                                                    final SubLObject var129 = (SubLObject)NIL;
                                                    while (NIL == var128) {
                                                        final SubLObject var130 = module0052.f3695(var127, var129);
                                                        final SubLObject var131 = (SubLObject)makeBoolean(!var129.eql(var130));
                                                        if (NIL != var131) {
                                                            SubLObject var132 = (SubLObject)NIL;
                                                            try {
                                                                var132 = module0158.f10316(var130, (SubLObject)$ic9$, var108, (SubLObject)NIL);
                                                                SubLObject var50_77 = module0237.$g2444$.getDynamicValue(var66);
                                                                final SubLObject var51_78 = (SubLObject)NIL;
                                                                while (NIL == var50_77) {
                                                                    final SubLObject var133 = module0052.f3695(var132, var51_78);
                                                                    final SubLObject var53_79 = (SubLObject)makeBoolean(!var51_78.eql(var133));
                                                                    if (NIL != var53_79 && (NIL == assertion_handles_oc.f11035(var133) || NIL != module0130.f8509(module0178.f11293(var133), var109))) {
                                                                        final SubLObject var134 = module0205.f13134(var133, var112, (SubLObject)UNPROVIDED);
                                                                        final SubLObject var135 = var133;
                                                                        f17508(var1, var134, var4, module0048.f_1X(var65));
                                                                        if (NIL != module0237.$g2444$.getDynamicValue(var66) && NIL != module0134.f8749(var1)) {
                                                                            f17511(var1, var135);
                                                                        }
                                                                    }
                                                                    var50_77 = (SubLObject)makeBoolean(NIL == var53_79 || NIL != module0237.$g2444$.getDynamicValue(var66));
                                                                }
                                                            }
                                                            finally {
                                                                final SubLObject var7_75 = Threads.$is_thread_performing_cleanupP$.currentBinding(var66);
                                                                try {
                                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var66);
                                                                    if (NIL != var132) {
                                                                        module0158.f10319(var132);
                                                                    }
                                                                }
                                                                finally {
                                                                    Threads.$is_thread_performing_cleanupP$.rebind(var7_75, var66);
                                                                }
                                                            }
                                                        }
                                                        var128 = (SubLObject)makeBoolean(NIL == var131 || NIL != module0237.$g2444$.getDynamicValue(var66));
                                                    }
                                                }
                                            }
                                            finally {
                                                module0148.$g2099$.rebind(var125, var66);
                                                module0239.$g2446$.rebind(var114, var66);
                                                module0134.$g1584$.rebind(var7_74, var66);
                                            }
                                        }
                                        var110 = var110.rest();
                                        var111 = var110.first();
                                    }
                                }
                            }
                            finally {
                                module0134.$g1584$.rebind(var7_71, var66);
                            }
                        }
                    }
                    finally {
                        module0239.$g2445$.rebind(var69, var66);
                    }
                    var67 = var67.rest();
                    var68 = var67.first();
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17513(final SubLObject var1, final SubLObject var2, final SubLObject var4) {
        return f17514(var1, var2, var4, (SubLObject)$ic10$);
    }
    
    public static SubLObject f17510(final SubLObject var1, final SubLObject var2, final SubLObject var4) {
        return f17514(var1, var2, var4, (SubLObject)$ic11$);
    }
    
    public static SubLObject f17514(final SubLObject var1, SubLObject var2, final SubLObject var4, final SubLObject var85) {
        final SubLThread var86 = SubLProcess.currentSubLThread();
        final SubLObject var87 = module0056.f4145(var85);
        final SubLObject var88 = module0056.f4145(var85);
        while (NIL == module0237.$g2444$.getDynamicValue(var86) && NIL != var2) {
            if (NIL != ((NIL != var4) ? makeBoolean(NIL == module0240.f15614(var1, var2)) : module0240.f15614(var1, var2))) {
                module0240.f15618(var1, var2, var4);
                if (NIL != module0134.f8756(var1) && NIL != module0241.f15631(var1, var2, (SubLObject)UNPROVIDED)) {
                    module0241.f15636(var1, var2);
                }
                else {
                    if (NIL != module0134.f8758(var1)) {
                        Functions.funcall(module0134.f8757(var1), var1, var2);
                    }
                    if (NIL != module0134.f8749(var1)) {
                        final SubLObject var89 = module0056.f4145(var85);
                        f17515(var1, var2, var87, var89);
                        if (NIL != module0056.f4147(var89)) {
                            f17516(var88);
                        }
                        else {
                            module0056.f4149(var89, var88);
                        }
                    }
                    else {
                        f17517(var1, var2, var87);
                    }
                }
            }
            else if (NIL != module0134.f8749(var1)) {
                f17516(var88);
            }
            var2 = module0056.f4150(var87);
        }
        if (NIL != module0237.$g2444$.getDynamicValue(var86) && NIL != module0134.f8749(var1)) {
            while (NIL == module0056.f4147(var88)) {
                final SubLObject var89 = module0056.f4150(var88);
                final SubLObject var90 = module0056.f4150(var89);
                f17511(var1, var90);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17517(final SubLObject var1, final SubLObject var2, final SubLObject var89) {
        final SubLThread var90 = SubLProcess.currentSubLThread();
        SubLObject var91 = (SubLObject)ZERO_INTEGER;
        SubLObject var92 = module0134.f8741(var1);
        SubLObject var93 = (SubLObject)NIL;
        var93 = var92.first();
        while (NIL != var92) {
            final SubLObject var94 = module0239.$g2445$.currentBinding(var90);
            try {
                module0239.$g2445$.bind(var93, var90);
                if (NIL != module0244.f15730(var93)) {
                    final SubLObject var8_92 = module0228.f15229(var2);
                    final SubLObject var7_93 = module0141.$g1670$.currentBinding(var90);
                    final SubLObject var95 = module0141.$g1671$.currentBinding(var90);
                    final SubLObject var96 = module0141.$g1672$.currentBinding(var90);
                    final SubLObject var97 = module0141.$g1674$.currentBinding(var90);
                    final SubLObject var98 = module0137.$g1605$.currentBinding(var90);
                    final SubLObject var99 = module0141.$g1674$.currentBinding(var90);
                    try {
                        module0141.$g1670$.bind(module0137.f8955(var93), var90);
                        module0141.$g1671$.bind(module0244.f15739(module0137.f8955(var93)), var90);
                        module0141.$g1672$.bind(module0244.f15746(module0137.f8955(var93)), var90);
                        module0141.$g1674$.bind((SubLObject)NIL, var90);
                        module0137.$g1605$.bind(module0137.f8955(var93), var90);
                        module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var90)) : module0141.$g1674$.getDynamicValue(var90)), var90);
                        if (NIL != module0173.f10955(var8_92)) {
                            final SubLObject var100 = module0242.f15664(var8_92, module0137.f8955(var93));
                            if (NIL != var100) {
                                SubLObject var101 = module0133.f8715(module0134.f8746(var1));
                                SubLObject var102 = (SubLObject)NIL;
                                var102 = var101.first();
                                while (NIL != var101) {
                                    final SubLObject var103 = module0244.f15782(var102, module0137.f8955(var93));
                                    final SubLObject var104 = module0245.f15834(var100, var103, module0137.f8955(var93));
                                    if (NIL != var104) {
                                        SubLObject var105;
                                        for (var105 = module0066.f4838(module0067.f4891(var104)); NIL == module0066.f4841(var105); var105 = module0066.f4840(var105)) {
                                            var90.resetMultipleValues();
                                            final SubLObject var106 = module0066.f4839(var105);
                                            final SubLObject var107 = var90.secondMultipleValue();
                                            var90.resetMultipleValues();
                                            if (NIL != module0147.f9507(var106)) {
                                                final SubLObject var7_94 = module0138.$g1623$.currentBinding(var90);
                                                try {
                                                    module0138.$g1623$.bind(var106, var90);
                                                    SubLObject var21_95;
                                                    for (var21_95 = module0066.f4838(module0067.f4891(var107)); NIL == module0066.f4841(var21_95); var21_95 = module0066.f4840(var21_95)) {
                                                        var90.resetMultipleValues();
                                                        final SubLObject var108 = module0066.f4839(var21_95);
                                                        final SubLObject var109 = var90.secondMultipleValue();
                                                        var90.resetMultipleValues();
                                                        if (NIL != module0141.f9289(var108)) {
                                                            final SubLObject var7_95 = module0138.$g1624$.currentBinding(var90);
                                                            try {
                                                                module0138.$g1624$.bind(var108, var90);
                                                                final SubLObject var110 = var109;
                                                                if (NIL != module0077.f5302(var110)) {
                                                                    final SubLObject var111 = module0077.f5333(var110);
                                                                    SubLObject var112;
                                                                    SubLObject var113;
                                                                    SubLObject var114;
                                                                    for (var112 = module0032.f1741(var111), var113 = (SubLObject)NIL, var113 = module0032.f1742(var112, var111); NIL == module0032.f1744(var112, var113); var113 = module0032.f1743(var113)) {
                                                                        var114 = module0032.f1745(var112, var113);
                                                                        if (NIL != module0032.f1746(var113, var114)) {
                                                                            var91 = Numbers.add(var91, (SubLObject)ONE_INTEGER);
                                                                            if (NIL != var114) {
                                                                                module0056.f4149(var114, var89);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                else if (var110.isList()) {
                                                                    SubLObject var17_97 = var110;
                                                                    SubLObject var115 = (SubLObject)NIL;
                                                                    var115 = var17_97.first();
                                                                    while (NIL != var17_97) {
                                                                        var91 = Numbers.add(var91, (SubLObject)ONE_INTEGER);
                                                                        if (NIL != var115) {
                                                                            module0056.f4149(var115, var89);
                                                                        }
                                                                        var17_97 = var17_97.rest();
                                                                        var115 = var17_97.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)$ic5$, var110);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1624$.rebind(var7_95, var90);
                                                            }
                                                        }
                                                    }
                                                    module0066.f4842(var21_95);
                                                }
                                                finally {
                                                    module0138.$g1623$.rebind(var7_94, var90);
                                                }
                                            }
                                        }
                                        module0066.f4842(var105);
                                    }
                                    var101 = var101.rest();
                                    var102 = var101.first();
                                }
                            }
                            else {
                                module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic6$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                        }
                        else if (NIL != module0210.f13595(var8_92, (SubLObject)UNPROVIDED)) {
                            SubLObject var116 = module0133.f8715(module0134.f8746(var1));
                            SubLObject var117 = (SubLObject)NIL;
                            var117 = var116.first();
                            while (NIL != var116) {
                                final SubLObject var118 = module0244.f15782(var117, module0137.f8955(var93));
                                SubLObject var5_98;
                                final SubLObject var119 = var5_98 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(var118, module0141.$g1714$.getDynamicValue(var90), module0137.f8955(var93))) : module0244.f15760(var118, module0141.$g1714$.getDynamicValue(var90), module0137.f8955(var93)));
                                SubLObject var120 = (SubLObject)NIL;
                                var120 = var5_98.first();
                                while (NIL != var5_98) {
                                    final SubLObject var7_96 = module0138.$g1625$.currentBinding(var90);
                                    try {
                                        module0138.$g1625$.bind(var120, var90);
                                        final SubLObject var122;
                                        final SubLObject var121 = var122 = Functions.funcall(var120, var8_92);
                                        if (NIL != module0077.f5302(var122)) {
                                            final SubLObject var123 = module0077.f5333(var122);
                                            SubLObject var124;
                                            SubLObject var125;
                                            SubLObject var126;
                                            for (var124 = module0032.f1741(var123), var125 = (SubLObject)NIL, var125 = module0032.f1742(var124, var123); NIL == module0032.f1744(var124, var125); var125 = module0032.f1743(var125)) {
                                                var126 = module0032.f1745(var124, var125);
                                                if (NIL != module0032.f1746(var125, var126)) {
                                                    var91 = Numbers.add(var91, (SubLObject)ONE_INTEGER);
                                                    if (NIL != var126) {
                                                        module0056.f4149(var126, var89);
                                                    }
                                                }
                                            }
                                        }
                                        else if (var122.isList()) {
                                            SubLObject var17_98 = var122;
                                            SubLObject var127 = (SubLObject)NIL;
                                            var127 = var17_98.first();
                                            while (NIL != var17_98) {
                                                var91 = Numbers.add(var91, (SubLObject)ONE_INTEGER);
                                                if (NIL != var127) {
                                                    module0056.f4149(var127, var89);
                                                }
                                                var17_98 = var17_98.rest();
                                                var127 = var17_98.first();
                                            }
                                        }
                                        else {
                                            Errors.error((SubLObject)$ic5$, var122);
                                        }
                                    }
                                    finally {
                                        module0138.$g1625$.rebind(var7_96, var90);
                                    }
                                    var5_98 = var5_98.rest();
                                    var120 = var5_98.first();
                                }
                                var116 = var116.rest();
                                var117 = var116.first();
                            }
                        }
                    }
                    finally {
                        module0141.$g1674$.rebind(var99, var90);
                        module0137.$g1605$.rebind(var98, var90);
                        module0141.$g1674$.rebind(var97, var90);
                        module0141.$g1672$.rebind(var96, var90);
                        module0141.$g1671$.rebind(var95, var90);
                        module0141.$g1670$.rebind(var7_93, var90);
                    }
                }
                else if (NIL != module0239.f15601(var93)) {
                    final SubLObject var128 = module0130.f8524(module0134.f8742(var1));
                    final SubLObject var129 = module0130.f8523(module0134.f8742(var1));
                    final SubLObject var7_97 = module0134.$g1584$.currentBinding(var90);
                    try {
                        module0134.$g1584$.bind((SubLObject)NIL, var90);
                        SubLObject var130 = module0133.f8715(module0134.f8746(var1));
                        SubLObject var131 = (SubLObject)NIL;
                        var131 = var130.first();
                        while (NIL != var130) {
                            final SubLObject var132 = module0239.f15602(var131);
                            final SubLObject var133 = module0107.f7613(var132);
                            final SubLObject var7_98 = module0239.$g2446$.currentBinding(var90);
                            SubLObject var134 = module0148.$g2099$.currentBinding(var90);
                            try {
                                module0239.$g2446$.bind(var93, var90);
                                module0148.$g2099$.bind((SubLObject)$ic8$, var90);
                                final SubLObject var135 = (SubLObject)NIL;
                                if (NIL != module0158.f10010(var2, var132, var135)) {
                                    final SubLObject var136 = module0158.f10011(var2, var132, var135);
                                    SubLObject var137 = (SubLObject)NIL;
                                    final SubLObject var138 = (SubLObject)NIL;
                                    while (NIL == var137) {
                                        final SubLObject var139 = module0052.f3695(var136, var138);
                                        final SubLObject var140 = (SubLObject)makeBoolean(!var138.eql(var139));
                                        if (NIL != var140) {
                                            SubLObject var141 = (SubLObject)NIL;
                                            try {
                                                var141 = module0158.f10316(var139, (SubLObject)$ic9$, var128, (SubLObject)NIL);
                                                SubLObject var50_103 = (SubLObject)NIL;
                                                final SubLObject var51_104 = (SubLObject)NIL;
                                                while (NIL == var50_103) {
                                                    final SubLObject var142 = module0052.f3695(var141, var51_104);
                                                    final SubLObject var53_105 = (SubLObject)makeBoolean(!var51_104.eql(var142));
                                                    if (NIL != var53_105 && (NIL == assertion_handles_oc.f11035(var142) || NIL != module0130.f8509(module0178.f11293(var142), var129))) {
                                                        final SubLObject var143 = module0205.f13134(var142, var133, (SubLObject)UNPROVIDED);
                                                        final SubLObject var144 = var142;
                                                        var91 = Numbers.add(var91, (SubLObject)ONE_INTEGER);
                                                        if (NIL != var143) {
                                                            module0056.f4149(var143, var89);
                                                        }
                                                    }
                                                    var50_103 = (SubLObject)makeBoolean(NIL == var53_105);
                                                }
                                            }
                                            finally {
                                                final SubLObject var7_99 = Threads.$is_thread_performing_cleanupP$.currentBinding(var90);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var90);
                                                    if (NIL != var141) {
                                                        module0158.f10319(var141);
                                                    }
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var7_99, var90);
                                                }
                                            }
                                        }
                                        var137 = (SubLObject)makeBoolean(NIL == var140);
                                    }
                                }
                            }
                            finally {
                                module0148.$g2099$.rebind(var134, var90);
                                module0239.$g2446$.rebind(var7_98, var90);
                            }
                            if (NIL != module0134.f8807()) {
                                final SubLObject var7_100 = module0134.$g1584$.currentBinding(var90);
                                var134 = module0239.$g2446$.currentBinding(var90);
                                final SubLObject var145 = module0148.$g2099$.currentBinding(var90);
                                try {
                                    module0134.$g1584$.bind((SubLObject)T, var90);
                                    module0239.$g2446$.bind(var93, var90);
                                    module0148.$g2099$.bind((SubLObject)$ic8$, var90);
                                    final SubLObject var146 = (SubLObject)NIL;
                                    if (NIL != module0158.f10010(var2, var133, var146)) {
                                        final SubLObject var147 = module0158.f10011(var2, var133, var146);
                                        SubLObject var148 = (SubLObject)NIL;
                                        final SubLObject var149 = (SubLObject)NIL;
                                        while (NIL == var148) {
                                            final SubLObject var150 = module0052.f3695(var147, var149);
                                            final SubLObject var151 = (SubLObject)makeBoolean(!var149.eql(var150));
                                            if (NIL != var151) {
                                                SubLObject var152 = (SubLObject)NIL;
                                                try {
                                                    var152 = module0158.f10316(var150, (SubLObject)$ic9$, var128, (SubLObject)NIL);
                                                    SubLObject var50_104 = (SubLObject)NIL;
                                                    final SubLObject var51_105 = (SubLObject)NIL;
                                                    while (NIL == var50_104) {
                                                        final SubLObject var153 = module0052.f3695(var152, var51_105);
                                                        final SubLObject var53_106 = (SubLObject)makeBoolean(!var51_105.eql(var153));
                                                        if (NIL != var53_106 && (NIL == assertion_handles_oc.f11035(var153) || NIL != module0130.f8509(module0178.f11293(var153), var129))) {
                                                            final SubLObject var154 = module0205.f13134(var153, var132, (SubLObject)UNPROVIDED);
                                                            final SubLObject var155 = var153;
                                                            var91 = Numbers.add(var91, (SubLObject)ONE_INTEGER);
                                                            if (NIL != var154) {
                                                                module0056.f4149(var154, var89);
                                                            }
                                                        }
                                                        var50_104 = (SubLObject)makeBoolean(NIL == var53_106);
                                                    }
                                                }
                                                finally {
                                                    final SubLObject var7_101 = Threads.$is_thread_performing_cleanupP$.currentBinding(var90);
                                                    try {
                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var90);
                                                        if (NIL != var152) {
                                                            module0158.f10319(var152);
                                                        }
                                                    }
                                                    finally {
                                                        Threads.$is_thread_performing_cleanupP$.rebind(var7_101, var90);
                                                    }
                                                }
                                            }
                                            var148 = (SubLObject)makeBoolean(NIL == var151);
                                        }
                                    }
                                }
                                finally {
                                    module0148.$g2099$.rebind(var145, var90);
                                    module0239.$g2446$.rebind(var134, var90);
                                    module0134.$g1584$.rebind(var7_100, var90);
                                }
                            }
                            var130 = var130.rest();
                            var131 = var130.first();
                        }
                    }
                    finally {
                        module0134.$g1584$.rebind(var7_97, var90);
                    }
                }
            }
            finally {
                module0239.$g2445$.rebind(var94, var90);
            }
            var92 = var92.rest();
            var93 = var92.first();
        }
        return var91;
    }
    
    public static SubLObject f17515(final SubLObject var1, final SubLObject var2, final SubLObject var89, final SubLObject var88) {
        final SubLThread var90 = SubLProcess.currentSubLThread();
        SubLObject var91 = (SubLObject)ZERO_INTEGER;
        SubLObject var92 = module0134.f8741(var1);
        SubLObject var93 = (SubLObject)NIL;
        var93 = var92.first();
        while (NIL != var92) {
            final SubLObject var94 = module0239.$g2445$.currentBinding(var90);
            try {
                module0239.$g2445$.bind(var93, var90);
                if (NIL != module0244.f15730(var93)) {
                    final SubLObject var8_113 = module0228.f15229(var2);
                    final SubLObject var7_114 = module0141.$g1670$.currentBinding(var90);
                    final SubLObject var95 = module0141.$g1671$.currentBinding(var90);
                    final SubLObject var96 = module0141.$g1672$.currentBinding(var90);
                    final SubLObject var97 = module0141.$g1674$.currentBinding(var90);
                    final SubLObject var98 = module0137.$g1605$.currentBinding(var90);
                    final SubLObject var99 = module0141.$g1674$.currentBinding(var90);
                    try {
                        module0141.$g1670$.bind(module0137.f8955(var93), var90);
                        module0141.$g1671$.bind(module0244.f15739(module0137.f8955(var93)), var90);
                        module0141.$g1672$.bind(module0244.f15746(module0137.f8955(var93)), var90);
                        module0141.$g1674$.bind((SubLObject)NIL, var90);
                        module0137.$g1605$.bind(module0137.f8955(var93), var90);
                        module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var90)) : module0141.$g1674$.getDynamicValue(var90)), var90);
                        if (NIL != module0173.f10955(var8_113)) {
                            final SubLObject var100 = module0242.f15664(var8_113, module0137.f8955(var93));
                            if (NIL != var100) {
                                SubLObject var101 = module0133.f8715(module0134.f8746(var1));
                                SubLObject var102 = (SubLObject)NIL;
                                var102 = var101.first();
                                while (NIL != var101) {
                                    final SubLObject var103 = module0244.f15782(var102, module0137.f8955(var93));
                                    final SubLObject var104 = module0245.f15834(var100, var103, module0137.f8955(var93));
                                    if (NIL != var104) {
                                        SubLObject var105;
                                        for (var105 = module0066.f4838(module0067.f4891(var104)); NIL == module0066.f4841(var105); var105 = module0066.f4840(var105)) {
                                            var90.resetMultipleValues();
                                            final SubLObject var106 = module0066.f4839(var105);
                                            final SubLObject var107 = var90.secondMultipleValue();
                                            var90.resetMultipleValues();
                                            if (NIL != module0147.f9507(var106)) {
                                                final SubLObject var7_115 = module0138.$g1623$.currentBinding(var90);
                                                try {
                                                    module0138.$g1623$.bind(var106, var90);
                                                    SubLObject var21_116;
                                                    for (var21_116 = module0066.f4838(module0067.f4891(var107)); NIL == module0066.f4841(var21_116); var21_116 = module0066.f4840(var21_116)) {
                                                        var90.resetMultipleValues();
                                                        final SubLObject var108 = module0066.f4839(var21_116);
                                                        final SubLObject var109 = var90.secondMultipleValue();
                                                        var90.resetMultipleValues();
                                                        if (NIL != module0141.f9289(var108)) {
                                                            final SubLObject var7_116 = module0138.$g1624$.currentBinding(var90);
                                                            try {
                                                                module0138.$g1624$.bind(var108, var90);
                                                                final SubLObject var110 = var109;
                                                                if (NIL != module0077.f5302(var110)) {
                                                                    final SubLObject var111 = module0077.f5333(var110);
                                                                    SubLObject var112;
                                                                    SubLObject var113;
                                                                    SubLObject var114;
                                                                    SubLObject var115;
                                                                    for (var112 = module0032.f1741(var111), var113 = (SubLObject)NIL, var113 = module0032.f1742(var112, var111); NIL == module0032.f1744(var112, var113); var113 = module0032.f1743(var113)) {
                                                                        var114 = module0032.f1745(var112, var113);
                                                                        if (NIL != module0032.f1746(var113, var114)) {
                                                                            var115 = module0239.f15595(var93, var2, var114, module0134.f8746(var1));
                                                                            var91 = Numbers.add(var91, (SubLObject)ONE_INTEGER);
                                                                            module0056.f4149(var114, var89);
                                                                            module0056.f4149(var115, var88);
                                                                        }
                                                                    }
                                                                }
                                                                else if (var110.isList()) {
                                                                    SubLObject var17_118 = var110;
                                                                    SubLObject var116 = (SubLObject)NIL;
                                                                    var116 = var17_118.first();
                                                                    while (NIL != var17_118) {
                                                                        final SubLObject var117 = module0239.f15595(var93, var2, var116, module0134.f8746(var1));
                                                                        var91 = Numbers.add(var91, (SubLObject)ONE_INTEGER);
                                                                        module0056.f4149(var116, var89);
                                                                        module0056.f4149(var117, var88);
                                                                        var17_118 = var17_118.rest();
                                                                        var116 = var17_118.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)$ic5$, var110);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1624$.rebind(var7_116, var90);
                                                            }
                                                        }
                                                    }
                                                    module0066.f4842(var21_116);
                                                }
                                                finally {
                                                    module0138.$g1623$.rebind(var7_115, var90);
                                                }
                                            }
                                        }
                                        module0066.f4842(var105);
                                    }
                                    var101 = var101.rest();
                                    var102 = var101.first();
                                }
                            }
                            else {
                                module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic6$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                        }
                        else if (NIL != module0210.f13595(var8_113, (SubLObject)UNPROVIDED)) {
                            SubLObject var118 = module0133.f8715(module0134.f8746(var1));
                            SubLObject var119 = (SubLObject)NIL;
                            var119 = var118.first();
                            while (NIL != var118) {
                                final SubLObject var120 = module0244.f15782(var119, module0137.f8955(var93));
                                SubLObject var5_119;
                                final SubLObject var121 = var5_119 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(var120, module0141.$g1714$.getDynamicValue(var90), module0137.f8955(var93))) : module0244.f15760(var120, module0141.$g1714$.getDynamicValue(var90), module0137.f8955(var93)));
                                SubLObject var122 = (SubLObject)NIL;
                                var122 = var5_119.first();
                                while (NIL != var5_119) {
                                    final SubLObject var7_117 = module0138.$g1625$.currentBinding(var90);
                                    try {
                                        module0138.$g1625$.bind(var122, var90);
                                        final SubLObject var124;
                                        final SubLObject var123 = var124 = Functions.funcall(var122, var8_113);
                                        if (NIL != module0077.f5302(var124)) {
                                            final SubLObject var125 = module0077.f5333(var124);
                                            SubLObject var126;
                                            SubLObject var127;
                                            SubLObject var128;
                                            SubLObject var129;
                                            for (var126 = module0032.f1741(var125), var127 = (SubLObject)NIL, var127 = module0032.f1742(var126, var125); NIL == module0032.f1744(var126, var127); var127 = module0032.f1743(var127)) {
                                                var128 = module0032.f1745(var126, var127);
                                                if (NIL != module0032.f1746(var127, var128)) {
                                                    var129 = module0239.f15595(var93, var2, var128, module0134.f8746(var1));
                                                    var91 = Numbers.add(var91, (SubLObject)ONE_INTEGER);
                                                    module0056.f4149(var128, var89);
                                                    module0056.f4149(var129, var88);
                                                }
                                            }
                                        }
                                        else if (var124.isList()) {
                                            SubLObject var17_119 = var124;
                                            SubLObject var130 = (SubLObject)NIL;
                                            var130 = var17_119.first();
                                            while (NIL != var17_119) {
                                                final SubLObject var131 = module0239.f15595(var93, var2, var130, module0134.f8746(var1));
                                                var91 = Numbers.add(var91, (SubLObject)ONE_INTEGER);
                                                module0056.f4149(var130, var89);
                                                module0056.f4149(var131, var88);
                                                var17_119 = var17_119.rest();
                                                var130 = var17_119.first();
                                            }
                                        }
                                        else {
                                            Errors.error((SubLObject)$ic5$, var124);
                                        }
                                    }
                                    finally {
                                        module0138.$g1625$.rebind(var7_117, var90);
                                    }
                                    var5_119 = var5_119.rest();
                                    var122 = var5_119.first();
                                }
                                var118 = var118.rest();
                                var119 = var118.first();
                            }
                        }
                    }
                    finally {
                        module0141.$g1674$.rebind(var99, var90);
                        module0137.$g1605$.rebind(var98, var90);
                        module0141.$g1674$.rebind(var97, var90);
                        module0141.$g1672$.rebind(var96, var90);
                        module0141.$g1671$.rebind(var95, var90);
                        module0141.$g1670$.rebind(var7_114, var90);
                    }
                }
                else if (NIL != module0239.f15601(var93)) {
                    final SubLObject var132 = module0130.f8524(module0134.f8742(var1));
                    final SubLObject var133 = module0130.f8523(module0134.f8742(var1));
                    final SubLObject var7_118 = module0134.$g1584$.currentBinding(var90);
                    try {
                        module0134.$g1584$.bind((SubLObject)NIL, var90);
                        SubLObject var134 = module0133.f8715(module0134.f8746(var1));
                        SubLObject var135 = (SubLObject)NIL;
                        var135 = var134.first();
                        while (NIL != var134) {
                            final SubLObject var136 = module0239.f15602(var135);
                            final SubLObject var137 = module0107.f7613(var136);
                            final SubLObject var7_119 = module0239.$g2446$.currentBinding(var90);
                            SubLObject var138 = module0148.$g2099$.currentBinding(var90);
                            try {
                                module0239.$g2446$.bind(var93, var90);
                                module0148.$g2099$.bind((SubLObject)$ic8$, var90);
                                final SubLObject var139 = (SubLObject)NIL;
                                if (NIL != module0158.f10010(var2, var136, var139)) {
                                    final SubLObject var140 = module0158.f10011(var2, var136, var139);
                                    SubLObject var141 = (SubLObject)NIL;
                                    final SubLObject var142 = (SubLObject)NIL;
                                    while (NIL == var141) {
                                        final SubLObject var143 = module0052.f3695(var140, var142);
                                        final SubLObject var144 = (SubLObject)makeBoolean(!var142.eql(var143));
                                        if (NIL != var144) {
                                            SubLObject var145 = (SubLObject)NIL;
                                            try {
                                                var145 = module0158.f10316(var143, (SubLObject)$ic9$, var132, (SubLObject)NIL);
                                                SubLObject var50_124 = (SubLObject)NIL;
                                                final SubLObject var51_125 = (SubLObject)NIL;
                                                while (NIL == var50_124) {
                                                    final SubLObject var146 = module0052.f3695(var145, var51_125);
                                                    final SubLObject var53_126 = (SubLObject)makeBoolean(!var51_125.eql(var146));
                                                    if (NIL != var53_126 && (NIL == assertion_handles_oc.f11035(var146) || NIL != module0130.f8509(module0178.f11293(var146), var133))) {
                                                        final SubLObject var147 = module0205.f13134(var146, var137, (SubLObject)UNPROVIDED);
                                                        final SubLObject var148 = var146;
                                                        var91 = Numbers.add(var91, (SubLObject)ONE_INTEGER);
                                                        module0056.f4149(var147, var89);
                                                        module0056.f4149(var148, var88);
                                                    }
                                                    var50_124 = (SubLObject)makeBoolean(NIL == var53_126);
                                                }
                                            }
                                            finally {
                                                final SubLObject var7_120 = Threads.$is_thread_performing_cleanupP$.currentBinding(var90);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var90);
                                                    if (NIL != var145) {
                                                        module0158.f10319(var145);
                                                    }
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var7_120, var90);
                                                }
                                            }
                                        }
                                        var141 = (SubLObject)makeBoolean(NIL == var144);
                                    }
                                }
                            }
                            finally {
                                module0148.$g2099$.rebind(var138, var90);
                                module0239.$g2446$.rebind(var7_119, var90);
                            }
                            if (NIL != module0134.f8807()) {
                                final SubLObject var7_121 = module0134.$g1584$.currentBinding(var90);
                                var138 = module0239.$g2446$.currentBinding(var90);
                                final SubLObject var149 = module0148.$g2099$.currentBinding(var90);
                                try {
                                    module0134.$g1584$.bind((SubLObject)T, var90);
                                    module0239.$g2446$.bind(var93, var90);
                                    module0148.$g2099$.bind((SubLObject)$ic8$, var90);
                                    final SubLObject var150 = (SubLObject)NIL;
                                    if (NIL != module0158.f10010(var2, var137, var150)) {
                                        final SubLObject var151 = module0158.f10011(var2, var137, var150);
                                        SubLObject var152 = (SubLObject)NIL;
                                        final SubLObject var153 = (SubLObject)NIL;
                                        while (NIL == var152) {
                                            final SubLObject var154 = module0052.f3695(var151, var153);
                                            final SubLObject var155 = (SubLObject)makeBoolean(!var153.eql(var154));
                                            if (NIL != var155) {
                                                SubLObject var156 = (SubLObject)NIL;
                                                try {
                                                    var156 = module0158.f10316(var154, (SubLObject)$ic9$, var132, (SubLObject)NIL);
                                                    SubLObject var50_125 = (SubLObject)NIL;
                                                    final SubLObject var51_126 = (SubLObject)NIL;
                                                    while (NIL == var50_125) {
                                                        final SubLObject var157 = module0052.f3695(var156, var51_126);
                                                        final SubLObject var53_127 = (SubLObject)makeBoolean(!var51_126.eql(var157));
                                                        if (NIL != var53_127 && (NIL == assertion_handles_oc.f11035(var157) || NIL != module0130.f8509(module0178.f11293(var157), var133))) {
                                                            final SubLObject var158 = module0205.f13134(var157, var136, (SubLObject)UNPROVIDED);
                                                            final SubLObject var159 = var157;
                                                            var91 = Numbers.add(var91, (SubLObject)ONE_INTEGER);
                                                            module0056.f4149(var158, var89);
                                                            module0056.f4149(var159, var88);
                                                        }
                                                        var50_125 = (SubLObject)makeBoolean(NIL == var53_127);
                                                    }
                                                }
                                                finally {
                                                    final SubLObject var7_122 = Threads.$is_thread_performing_cleanupP$.currentBinding(var90);
                                                    try {
                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var90);
                                                        if (NIL != var156) {
                                                            module0158.f10319(var156);
                                                        }
                                                    }
                                                    finally {
                                                        Threads.$is_thread_performing_cleanupP$.rebind(var7_122, var90);
                                                    }
                                                }
                                            }
                                            var152 = (SubLObject)makeBoolean(NIL == var155);
                                        }
                                    }
                                }
                                finally {
                                    module0148.$g2099$.rebind(var149, var90);
                                    module0239.$g2446$.rebind(var138, var90);
                                    module0134.$g1584$.rebind(var7_121, var90);
                                }
                            }
                            var134 = var134.rest();
                            var135 = var134.first();
                        }
                    }
                    finally {
                        module0134.$g1584$.rebind(var7_118, var90);
                    }
                }
            }
            finally {
                module0239.$g2445$.rebind(var94, var90);
            }
            var92 = var92.rest();
            var93 = var92.first();
        }
        return var91;
    }
    
    public static SubLObject f17516(final SubLObject var87) {
        SubLObject var88 = (SubLObject)ZERO_INTEGER;
        if (NIL == module0056.f4147(var87)) {
            SubLObject var89 = module0056.f4151(var87);
            module0056.f4150(var89);
            if (NIL != module0056.f4147(var89)) {
                while (NIL == module0056.f4147(var87) && !module0056.f4143(var89).numG((SubLObject)ONE_INTEGER)) {
                    module0056.f4150(var87);
                    var88 = Numbers.add(var88, (SubLObject)ONE_INTEGER);
                    var89 = module0056.f4151(var87);
                }
            }
            if (var88.numG((SubLObject)ZERO_INTEGER) && NIL != module0056.f4135(var89)) {
                module0056.f4150(var89);
            }
        }
        return var88;
    }
    
    public static SubLObject f17511(final SubLObject var1, final SubLObject var34) {
        final SubLObject var35 = (NIL != assertion_handles_oc.f11035(var34)) ? module0178.f11332(var34) : module0205.f13136(module0191.f11961(var34));
        final SubLObject var36 = (SubLObject)(module0134.f8727(var1).isList() ? module0134.f8727(var1) : ConsesLow.list(module0134.f8727(var1)));
        if (NIL == module0004.f104(var35, var36, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            SubLObject var37 = (SubLObject)NIL;
            SubLObject var38 = (SubLObject)NIL;
            if (NIL == var37) {
                SubLObject var39 = var36;
                SubLObject var40 = (SubLObject)NIL;
                var40 = var39.first();
                while (NIL == var37 && NIL != var39) {
                    if (NIL != module0260.f17089(var35, var40, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        var37 = var40;
                    }
                    var39 = var39.rest();
                    var40 = var39.first();
                }
            }
            if (NIL == var38) {
                SubLObject var39 = var36;
                SubLObject var40 = (SubLObject)NIL;
                var40 = var39.first();
                while (NIL == var38 && NIL != var39) {
                    if (NIL != module0260.f17094(var35, var40, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        var38 = var40;
                    }
                    var39 = var39.rest();
                    var40 = var39.first();
                }
            }
            if (NIL != var37) {
                final SubLObject var41 = module0202.f12768($ic12$, var35, var37);
                final SubLObject var42 = module0191.f11990((SubLObject)$ic13$, var41, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0134.f8795(var1, var42, Symbols.symbol_function((SubLObject)EQUAL));
            }
            if (NIL != var38) {
                final SubLObject var41 = module0202.f12768($ic14$, var35, var38);
                final SubLObject var42 = module0191.f11990((SubLObject)$ic13$, var41, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0134.f8795(var1, var42, Symbols.symbol_function((SubLObject)EQUAL));
            }
        }
        module0134.f8795(var1, var34, Symbols.symbol_function((SubLObject)EQUAL));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17518(final SubLObject var1, final SubLObject var140) {
        SubLObject var141 = var140;
        SubLObject var142 = (SubLObject)NIL;
        var142 = var141.first();
        while (NIL != var141) {
            module0134.f8795(var1, var142, Symbols.symbol_function((SubLObject)EQUAL));
            var141 = var141.rest();
            var142 = var141.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17519(final SubLObject var1, final SubLObject var141) {
        final SubLThread var142 = SubLProcess.currentSubLThread();
        final SubLObject var143 = (SubLObject)(module0134.f8727(var1).isList() ? module0134.f8727(var1) : ConsesLow.list(module0134.f8727(var1)));
        final SubLObject var144 = module0147.$g2095$.getDynamicValue(var142);
        final SubLObject var145 = module0134.f8742(var1);
        final SubLObject var146 = module0138.f8989(var145);
        SubLObject var147 = (SubLObject)NIL;
        SubLObject var148 = var141;
        SubLObject var149 = (SubLObject)NIL;
        var149 = var148.first();
        while (NIL != var148) {
            if (NIL != module0191.f11950(var149)) {
                var147 = (SubLObject)ConsesLow.cons(var149, var147);
            }
            final SubLObject var150 = (SubLObject)((NIL != assertion_handles_oc.f11035(var149)) ? module0178.f11332(var149) : ((NIL != module0191.f11952(var149)) ? module0205.f13136(module0191.f11961(var149)) : ((NIL != module0202.f12590(var149)) ? module0205.f13136(var149) : NIL)));
            if (NIL == module0004.f104(var150, var143, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                SubLObject var151 = (SubLObject)NIL;
                SubLObject var152 = (SubLObject)NIL;
                if (NIL == var151) {
                    SubLObject var153 = var143;
                    SubLObject var154 = (SubLObject)NIL;
                    var154 = var153.first();
                    while (NIL == var151 && NIL != var153) {
                        if (NIL != module0260.f17089(var150, var154, var144, var146)) {
                            var151 = var154;
                        }
                        var153 = var153.rest();
                        var154 = var153.first();
                    }
                }
                if (NIL == var152) {
                    SubLObject var153 = var143;
                    SubLObject var154 = (SubLObject)NIL;
                    var154 = var153.first();
                    while (NIL == var152 && NIL != var153) {
                        if (NIL != module0260.f17094(var150, var154, var144, var146)) {
                            var152 = var154;
                        }
                        var153 = var153.rest();
                        var154 = var153.first();
                    }
                }
                if (NIL != var151) {
                    final SubLObject var155 = module0202.f12768($ic12$, var150, var151);
                    final SubLObject var156 = module0191.f11990((SubLObject)$ic13$, var155, var144, var145);
                    var147 = (SubLObject)ConsesLow.cons(var156, var147);
                }
                if (NIL != var152) {
                    final SubLObject var155 = module0202.f12768($ic14$, var150, var152);
                    final SubLObject var156 = module0191.f11990((SubLObject)$ic13$, var155, var144, var145);
                    var147 = (SubLObject)ConsesLow.cons(var156, var147);
                }
            }
            var148 = var148.rest();
            var149 = var148.first();
        }
        return module0035.f2269(Sequences.nreverse(var147), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17499(final SubLObject var1, final SubLObject var2, final SubLObject var65) {
        final SubLThread var66 = SubLProcess.currentSubLThread();
        final SubLObject var67 = module0241.f15640(var1, var2);
        module0240.f15618(var1, var2, var65);
        if (NIL != var67) {
            if (NIL != module0134.f8763(var1)) {
                module0134.f8794(var1, var2);
            }
            if (NIL != module0241.f15631(var1, var2, (SubLObject)UNPROVIDED)) {
                module0241.f15636(var1, var2);
            }
        }
        final SubLObject var68 = module0048.f_1_(var65);
        final SubLObject var69 = module0134.f8741(var1);
        final SubLObject var70 = module0134.f8746(var1);
        if (!var68.numL((SubLObject)ZERO_INTEGER)) {
            SubLObject var71 = var69;
            SubLObject var72 = (SubLObject)NIL;
            var72 = var71.first();
            while (NIL != var71) {
                final SubLObject var73 = module0239.$g2445$.currentBinding(var66);
                try {
                    module0239.$g2445$.bind(var72, var66);
                    if (NIL != module0244.f15730(var72)) {
                        final SubLObject var8_149 = module0228.f15229(var2);
                        final SubLObject var7_150 = module0141.$g1670$.currentBinding(var66);
                        final SubLObject var74 = module0141.$g1671$.currentBinding(var66);
                        final SubLObject var75 = module0141.$g1672$.currentBinding(var66);
                        final SubLObject var76 = module0141.$g1674$.currentBinding(var66);
                        final SubLObject var77 = module0137.$g1605$.currentBinding(var66);
                        final SubLObject var78 = module0141.$g1674$.currentBinding(var66);
                        try {
                            module0141.$g1670$.bind(module0137.f8955(var72), var66);
                            module0141.$g1671$.bind(module0244.f15739(module0137.f8955(var72)), var66);
                            module0141.$g1672$.bind(module0244.f15746(module0137.f8955(var72)), var66);
                            module0141.$g1674$.bind((SubLObject)NIL, var66);
                            module0137.$g1605$.bind(module0137.f8955(var72), var66);
                            module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var66)) : module0141.$g1674$.getDynamicValue(var66)), var66);
                            if (NIL != module0173.f10955(var8_149)) {
                                final SubLObject var79 = module0242.f15664(var8_149, module0137.f8955(var72));
                                if (NIL != var79) {
                                    if (NIL == module0237.$g2444$.getDynamicValue(var66)) {
                                        SubLObject var80 = module0133.f8715(var70);
                                        SubLObject var81 = (SubLObject)NIL;
                                        var81 = var80.first();
                                        while (NIL == module0237.$g2444$.getDynamicValue(var66) && NIL != var80) {
                                            final SubLObject var82 = module0244.f15782(var81, module0137.f8955(var72));
                                            final SubLObject var83 = module0245.f15834(var79, var82, module0137.f8955(var72));
                                            if (NIL != var83) {
                                                SubLObject var84;
                                                for (var84 = module0066.f4838(module0067.f4891(var83)); NIL == module0237.$g2444$.getDynamicValue(var66) && NIL == module0066.f4841(var84); var84 = module0066.f4840(var84)) {
                                                    var66.resetMultipleValues();
                                                    final SubLObject var85 = module0066.f4839(var84);
                                                    final SubLObject var86 = var66.secondMultipleValue();
                                                    var66.resetMultipleValues();
                                                    if (NIL != module0147.f9507(var85)) {
                                                        final SubLObject var7_151 = module0138.$g1623$.currentBinding(var66);
                                                        try {
                                                            module0138.$g1623$.bind(var85, var66);
                                                            SubLObject var21_152;
                                                            for (var21_152 = module0066.f4838(module0067.f4891(var86)); NIL == module0237.$g2444$.getDynamicValue(var66) && NIL == module0066.f4841(var21_152); var21_152 = module0066.f4840(var21_152)) {
                                                                var66.resetMultipleValues();
                                                                final SubLObject var87 = module0066.f4839(var21_152);
                                                                final SubLObject var88 = var66.secondMultipleValue();
                                                                var66.resetMultipleValues();
                                                                if (NIL != module0141.f9289(var87)) {
                                                                    final SubLObject var7_152 = module0138.$g1624$.currentBinding(var66);
                                                                    try {
                                                                        module0138.$g1624$.bind(var87, var66);
                                                                        final SubLObject var89 = var88;
                                                                        if (NIL != module0077.f5302(var89)) {
                                                                            final SubLObject var90 = module0077.f5333(var89);
                                                                            SubLObject var91;
                                                                            SubLObject var92;
                                                                            SubLObject var93;
                                                                            SubLObject var94;
                                                                            SubLObject var95;
                                                                            for (var91 = module0032.f1741(var90), var92 = (SubLObject)NIL, var92 = module0032.f1742(var91, var90); NIL == module0237.$g2444$.getDynamicValue(var66) && NIL == module0032.f1744(var91, var92); var92 = module0032.f1743(var92)) {
                                                                                var93 = module0032.f1745(var91, var92);
                                                                                if (NIL != module0032.f1746(var92, var93)) {
                                                                                    var94 = module0239.f15595(var72, var2, var93, var70);
                                                                                    f17520(var1, var93, var68);
                                                                                    if (NIL != module0134.f8765(var1)) {
                                                                                        var95 = module0239.f15593();
                                                                                        if (NIL != module0244.f15730(var95)) {
                                                                                            module0241.f15638(var1, module0244.f15736(module0137.f8955((SubLObject)UNPROVIDED)), var2, var93, module0134.f8746(var1), module0138.f8997());
                                                                                        }
                                                                                        else {
                                                                                            module0241.f15637(var1, var94);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        else if (var89.isList()) {
                                                                            if (NIL == module0237.$g2444$.getDynamicValue(var66)) {
                                                                                SubLObject var17_156 = var89;
                                                                                SubLObject var96 = (SubLObject)NIL;
                                                                                var96 = var17_156.first();
                                                                                while (NIL == module0237.$g2444$.getDynamicValue(var66) && NIL != var17_156) {
                                                                                    final SubLObject var97 = module0239.f15595(var72, var2, var96, var70);
                                                                                    f17520(var1, var96, var68);
                                                                                    if (NIL != module0134.f8765(var1)) {
                                                                                        final SubLObject var98 = module0239.f15593();
                                                                                        if (NIL != module0244.f15730(var98)) {
                                                                                            module0241.f15638(var1, module0244.f15736(module0137.f8955((SubLObject)UNPROVIDED)), var2, var96, module0134.f8746(var1), module0138.f8997());
                                                                                        }
                                                                                        else {
                                                                                            module0241.f15637(var1, var97);
                                                                                        }
                                                                                    }
                                                                                    var17_156 = var17_156.rest();
                                                                                    var96 = var17_156.first();
                                                                                }
                                                                            }
                                                                        }
                                                                        else {
                                                                            Errors.error((SubLObject)$ic5$, var89);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        module0138.$g1624$.rebind(var7_152, var66);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var21_152);
                                                        }
                                                        finally {
                                                            module0138.$g1623$.rebind(var7_151, var66);
                                                        }
                                                    }
                                                }
                                                module0066.f4842(var84);
                                            }
                                            var80 = var80.rest();
                                            var81 = var80.first();
                                        }
                                    }
                                }
                                else {
                                    module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic6$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                }
                            }
                            else if (NIL != module0210.f13595(var8_149, (SubLObject)UNPROVIDED) && NIL == module0237.$g2444$.getDynamicValue(var66)) {
                                SubLObject var99 = module0133.f8715(var70);
                                SubLObject var100 = (SubLObject)NIL;
                                var100 = var99.first();
                                while (NIL == module0237.$g2444$.getDynamicValue(var66) && NIL != var99) {
                                    final SubLObject var101 = module0244.f15782(var100, module0137.f8955(var72));
                                    final SubLObject var102 = (NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(var101, module0141.$g1714$.getDynamicValue(var66), module0137.f8955(var72))) : module0244.f15760(var101, module0141.$g1714$.getDynamicValue(var66), module0137.f8955(var72));
                                    SubLObject var103;
                                    SubLObject var104;
                                    SubLObject var7_153;
                                    SubLObject var106;
                                    SubLObject var105;
                                    SubLObject var107;
                                    SubLObject var108;
                                    SubLObject var109;
                                    SubLObject var110;
                                    SubLObject var111;
                                    SubLObject var112;
                                    SubLObject var17_157;
                                    SubLObject var113;
                                    SubLObject var114;
                                    SubLObject var115;
                                    for (var103 = (SubLObject)NIL, var103 = var102; NIL == module0237.$g2444$.getDynamicValue(var66) && NIL != var103; var103 = var103.rest()) {
                                        var104 = var103.first();
                                        var7_153 = module0138.$g1625$.currentBinding(var66);
                                        try {
                                            module0138.$g1625$.bind(var104, var66);
                                            var105 = (var106 = Functions.funcall(var104, var8_149));
                                            if (NIL != module0077.f5302(var106)) {
                                                var107 = module0077.f5333(var106);
                                                for (var108 = module0032.f1741(var107), var109 = (SubLObject)NIL, var109 = module0032.f1742(var108, var107); NIL == module0237.$g2444$.getDynamicValue(var66) && NIL == module0032.f1744(var108, var109); var109 = module0032.f1743(var109)) {
                                                    var110 = module0032.f1745(var108, var109);
                                                    if (NIL != module0032.f1746(var109, var110)) {
                                                        var111 = module0239.f15595(var72, var2, var110, var70);
                                                        f17520(var1, var110, var68);
                                                        if (NIL != module0134.f8765(var1)) {
                                                            var112 = module0239.f15593();
                                                            if (NIL != module0244.f15730(var112)) {
                                                                module0241.f15638(var1, module0244.f15736(module0137.f8955((SubLObject)UNPROVIDED)), var2, var110, module0134.f8746(var1), module0138.f8997());
                                                            }
                                                            else {
                                                                module0241.f15637(var1, var111);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            else if (var106.isList()) {
                                                if (NIL == module0237.$g2444$.getDynamicValue(var66)) {
                                                    var17_157 = var106;
                                                    var113 = (SubLObject)NIL;
                                                    var113 = var17_157.first();
                                                    while (NIL == module0237.$g2444$.getDynamicValue(var66) && NIL != var17_157) {
                                                        var114 = module0239.f15595(var72, var2, var113, var70);
                                                        f17520(var1, var113, var68);
                                                        if (NIL != module0134.f8765(var1)) {
                                                            var115 = module0239.f15593();
                                                            if (NIL != module0244.f15730(var115)) {
                                                                module0241.f15638(var1, module0244.f15736(module0137.f8955((SubLObject)UNPROVIDED)), var2, var113, module0134.f8746(var1), module0138.f8997());
                                                            }
                                                            else {
                                                                module0241.f15637(var1, var114);
                                                            }
                                                        }
                                                        var17_157 = var17_157.rest();
                                                        var113 = var17_157.first();
                                                    }
                                                }
                                            }
                                            else {
                                                Errors.error((SubLObject)$ic5$, var106);
                                            }
                                        }
                                        finally {
                                            module0138.$g1625$.rebind(var7_153, var66);
                                        }
                                    }
                                    var99 = var99.rest();
                                    var100 = var99.first();
                                }
                            }
                        }
                        finally {
                            module0141.$g1674$.rebind(var78, var66);
                            module0137.$g1605$.rebind(var77, var66);
                            module0141.$g1674$.rebind(var76, var66);
                            module0141.$g1672$.rebind(var75, var66);
                            module0141.$g1671$.rebind(var74, var66);
                            module0141.$g1670$.rebind(var7_150, var66);
                        }
                    }
                    else if (NIL != module0239.f15601(var72)) {
                        final SubLObject var116 = module0130.f8524((SubLObject)$ic7$);
                        final SubLObject var117 = module0130.f8523((SubLObject)$ic7$);
                        final SubLObject var7_154 = module0134.$g1584$.currentBinding(var66);
                        try {
                            module0134.$g1584$.bind((SubLObject)NIL, var66);
                            if (NIL == module0237.$g2444$.getDynamicValue(var66)) {
                                SubLObject var118 = module0133.f8715(var70);
                                SubLObject var119 = (SubLObject)NIL;
                                var119 = var118.first();
                                while (NIL == module0237.$g2444$.getDynamicValue(var66) && NIL != var118) {
                                    final SubLObject var120 = module0239.f15602(var119);
                                    final SubLObject var121 = module0107.f7613(var120);
                                    final SubLObject var7_155 = module0239.$g2446$.currentBinding(var66);
                                    SubLObject var122 = module0148.$g2099$.currentBinding(var66);
                                    try {
                                        module0239.$g2446$.bind(var72, var66);
                                        module0148.$g2099$.bind((SubLObject)$ic8$, var66);
                                        final SubLObject var123 = (SubLObject)NIL;
                                        if (NIL != module0158.f10010(var2, var120, var123)) {
                                            final SubLObject var124 = module0158.f10011(var2, var120, var123);
                                            SubLObject var125 = module0237.$g2444$.getDynamicValue(var66);
                                            final SubLObject var126 = (SubLObject)NIL;
                                            while (NIL == var125) {
                                                final SubLObject var127 = module0052.f3695(var124, var126);
                                                final SubLObject var128 = (SubLObject)makeBoolean(!var126.eql(var127));
                                                if (NIL != var128) {
                                                    SubLObject var129 = (SubLObject)NIL;
                                                    try {
                                                        var129 = module0158.f10316(var127, (SubLObject)$ic9$, var116, (SubLObject)NIL);
                                                        SubLObject var50_161 = module0237.$g2444$.getDynamicValue(var66);
                                                        final SubLObject var51_162 = (SubLObject)NIL;
                                                        while (NIL == var50_161) {
                                                            final SubLObject var130 = module0052.f3695(var129, var51_162);
                                                            final SubLObject var53_163 = (SubLObject)makeBoolean(!var51_162.eql(var130));
                                                            if (NIL != var53_163 && (NIL == assertion_handles_oc.f11035(var130) || NIL != module0130.f8509(module0178.f11293(var130), var117))) {
                                                                final SubLObject var131 = module0205.f13134(var130, var121, (SubLObject)UNPROVIDED);
                                                                final SubLObject var154_164 = var130;
                                                                f17520(var1, var131, var68);
                                                                if (NIL != module0134.f8765(var1)) {
                                                                    final SubLObject var132 = module0239.f15593();
                                                                    if (NIL != module0244.f15730(var132)) {
                                                                        module0241.f15638(var1, module0244.f15736(module0137.f8955((SubLObject)UNPROVIDED)), var2, var131, module0134.f8746(var1), module0138.f8997());
                                                                    }
                                                                    else {
                                                                        module0241.f15637(var1, var154_164);
                                                                    }
                                                                }
                                                            }
                                                            var50_161 = (SubLObject)makeBoolean(NIL == var53_163 || NIL != module0237.$g2444$.getDynamicValue(var66));
                                                        }
                                                    }
                                                    finally {
                                                        final SubLObject var7_156 = Threads.$is_thread_performing_cleanupP$.currentBinding(var66);
                                                        try {
                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var66);
                                                            if (NIL != var129) {
                                                                module0158.f10319(var129);
                                                            }
                                                        }
                                                        finally {
                                                            Threads.$is_thread_performing_cleanupP$.rebind(var7_156, var66);
                                                        }
                                                    }
                                                }
                                                var125 = (SubLObject)makeBoolean(NIL == var128 || NIL != module0237.$g2444$.getDynamicValue(var66));
                                            }
                                        }
                                    }
                                    finally {
                                        module0148.$g2099$.rebind(var122, var66);
                                        module0239.$g2446$.rebind(var7_155, var66);
                                    }
                                    if (NIL != module0134.f8807()) {
                                        final SubLObject var7_157 = module0134.$g1584$.currentBinding(var66);
                                        var122 = module0239.$g2446$.currentBinding(var66);
                                        final SubLObject var133 = module0148.$g2099$.currentBinding(var66);
                                        try {
                                            module0134.$g1584$.bind((SubLObject)T, var66);
                                            module0239.$g2446$.bind(var72, var66);
                                            module0148.$g2099$.bind((SubLObject)$ic8$, var66);
                                            final SubLObject var134 = (SubLObject)NIL;
                                            if (NIL != module0158.f10010(var2, var121, var134)) {
                                                final SubLObject var135 = module0158.f10011(var2, var121, var134);
                                                SubLObject var136 = module0237.$g2444$.getDynamicValue(var66);
                                                final SubLObject var137 = (SubLObject)NIL;
                                                while (NIL == var136) {
                                                    final SubLObject var138 = module0052.f3695(var135, var137);
                                                    final SubLObject var139 = (SubLObject)makeBoolean(!var137.eql(var138));
                                                    if (NIL != var139) {
                                                        SubLObject var140 = (SubLObject)NIL;
                                                        try {
                                                            var140 = module0158.f10316(var138, (SubLObject)$ic9$, var116, (SubLObject)NIL);
                                                            SubLObject var50_162 = module0237.$g2444$.getDynamicValue(var66);
                                                            final SubLObject var51_163 = (SubLObject)NIL;
                                                            while (NIL == var50_162) {
                                                                final SubLObject var141 = module0052.f3695(var140, var51_163);
                                                                final SubLObject var53_164 = (SubLObject)makeBoolean(!var51_163.eql(var141));
                                                                if (NIL != var53_164 && (NIL == assertion_handles_oc.f11035(var141) || NIL != module0130.f8509(module0178.f11293(var141), var117))) {
                                                                    final SubLObject var142 = module0205.f13134(var141, var120, (SubLObject)UNPROVIDED);
                                                                    final SubLObject var154_165 = var141;
                                                                    f17520(var1, var142, var68);
                                                                    if (NIL != module0134.f8765(var1)) {
                                                                        final SubLObject var143 = module0239.f15593();
                                                                        if (NIL != module0244.f15730(var143)) {
                                                                            module0241.f15638(var1, module0244.f15736(module0137.f8955((SubLObject)UNPROVIDED)), var2, var142, module0134.f8746(var1), module0138.f8997());
                                                                        }
                                                                        else {
                                                                            module0241.f15637(var1, var154_165);
                                                                        }
                                                                    }
                                                                }
                                                                var50_162 = (SubLObject)makeBoolean(NIL == var53_164 || NIL != module0237.$g2444$.getDynamicValue(var66));
                                                            }
                                                        }
                                                        finally {
                                                            final SubLObject var7_158 = Threads.$is_thread_performing_cleanupP$.currentBinding(var66);
                                                            try {
                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var66);
                                                                if (NIL != var140) {
                                                                    module0158.f10319(var140);
                                                                }
                                                            }
                                                            finally {
                                                                Threads.$is_thread_performing_cleanupP$.rebind(var7_158, var66);
                                                            }
                                                        }
                                                    }
                                                    var136 = (SubLObject)makeBoolean(NIL == var139 || NIL != module0237.$g2444$.getDynamicValue(var66));
                                                }
                                            }
                                        }
                                        finally {
                                            module0148.$g2099$.rebind(var133, var66);
                                            module0239.$g2446$.rebind(var122, var66);
                                            module0134.$g1584$.rebind(var7_157, var66);
                                        }
                                    }
                                    var118 = var118.rest();
                                    var119 = var118.first();
                                }
                            }
                        }
                        finally {
                            module0134.$g1584$.rebind(var7_154, var66);
                        }
                    }
                }
                finally {
                    module0239.$g2445$.rebind(var73, var66);
                }
                var71 = var71.rest();
                var72 = var71.first();
            }
        }
        if (NIL != var67 && NIL != module0134.f8764(var1) && NIL != module0134.f8766(var1)) {
            module0241.f15639(var1, var2, var67);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17520(final SubLObject var1, final SubLObject var2, final SubLObject var65) {
        final SubLThread var66 = SubLProcess.currentSubLThread();
        if (NIL == module0134.f8766(var1)) {
            final SubLObject var67 = module0241.f15631(var1, var2, (SubLObject)UNPROVIDED);
            if (NIL != var67) {
                module0241.f15636(var1, var2);
            }
            else if (NIL == module0240.f15622(var1, var2, var65)) {
                module0240.f15618(var1, var2, var65);
                if (NIL != module0134.f8763(var1)) {
                    module0134.f8794(var1, var2);
                }
                final SubLObject var68 = module0048.f_1_(var65);
                final SubLObject var69 = module0134.f8741(var1);
                final SubLObject var70 = module0134.f8746(var1);
                if (!var68.numL((SubLObject)ZERO_INTEGER)) {
                    SubLObject var71 = var69;
                    SubLObject var72 = (SubLObject)NIL;
                    var72 = var71.first();
                    while (NIL != var71) {
                        final SubLObject var73 = module0239.$g2445$.currentBinding(var66);
                        try {
                            module0239.$g2445$.bind(var72, var66);
                            if (NIL != module0244.f15730(var72)) {
                                final SubLObject var8_173 = module0228.f15229(var2);
                                final SubLObject var7_174 = module0141.$g1670$.currentBinding(var66);
                                final SubLObject var74 = module0141.$g1671$.currentBinding(var66);
                                final SubLObject var75 = module0141.$g1672$.currentBinding(var66);
                                final SubLObject var76 = module0141.$g1674$.currentBinding(var66);
                                final SubLObject var77 = module0137.$g1605$.currentBinding(var66);
                                final SubLObject var78 = module0141.$g1674$.currentBinding(var66);
                                try {
                                    module0141.$g1670$.bind(module0137.f8955(var72), var66);
                                    module0141.$g1671$.bind(module0244.f15739(module0137.f8955(var72)), var66);
                                    module0141.$g1672$.bind(module0244.f15746(module0137.f8955(var72)), var66);
                                    module0141.$g1674$.bind((SubLObject)NIL, var66);
                                    module0137.$g1605$.bind(module0137.f8955(var72), var66);
                                    module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var66)) : module0141.$g1674$.getDynamicValue(var66)), var66);
                                    if (NIL != module0173.f10955(var8_173)) {
                                        final SubLObject var79 = module0242.f15664(var8_173, module0137.f8955(var72));
                                        if (NIL != var79) {
                                            if (NIL == module0237.$g2444$.getDynamicValue(var66)) {
                                                SubLObject var80 = module0133.f8715(var70);
                                                SubLObject var81 = (SubLObject)NIL;
                                                var81 = var80.first();
                                                while (NIL == module0237.$g2444$.getDynamicValue(var66) && NIL != var80) {
                                                    final SubLObject var82 = module0244.f15782(var81, module0137.f8955(var72));
                                                    final SubLObject var83 = module0245.f15834(var79, var82, module0137.f8955(var72));
                                                    if (NIL != var83) {
                                                        SubLObject var84;
                                                        for (var84 = module0066.f4838(module0067.f4891(var83)); NIL == module0237.$g2444$.getDynamicValue(var66) && NIL == module0066.f4841(var84); var84 = module0066.f4840(var84)) {
                                                            var66.resetMultipleValues();
                                                            final SubLObject var85 = module0066.f4839(var84);
                                                            final SubLObject var86 = var66.secondMultipleValue();
                                                            var66.resetMultipleValues();
                                                            if (NIL != module0147.f9507(var85)) {
                                                                final SubLObject var7_175 = module0138.$g1623$.currentBinding(var66);
                                                                try {
                                                                    module0138.$g1623$.bind(var85, var66);
                                                                    SubLObject var21_176;
                                                                    for (var21_176 = module0066.f4838(module0067.f4891(var86)); NIL == module0237.$g2444$.getDynamicValue(var66) && NIL == module0066.f4841(var21_176); var21_176 = module0066.f4840(var21_176)) {
                                                                        var66.resetMultipleValues();
                                                                        final SubLObject var87 = module0066.f4839(var21_176);
                                                                        final SubLObject var88 = var66.secondMultipleValue();
                                                                        var66.resetMultipleValues();
                                                                        if (NIL != module0141.f9289(var87)) {
                                                                            final SubLObject var7_176 = module0138.$g1624$.currentBinding(var66);
                                                                            try {
                                                                                module0138.$g1624$.bind(var87, var66);
                                                                                final SubLObject var89 = var88;
                                                                                if (NIL != module0077.f5302(var89)) {
                                                                                    final SubLObject var90 = module0077.f5333(var89);
                                                                                    SubLObject var91;
                                                                                    SubLObject var92;
                                                                                    SubLObject var93;
                                                                                    SubLObject var94;
                                                                                    SubLObject var95;
                                                                                    for (var91 = module0032.f1741(var90), var92 = (SubLObject)NIL, var92 = module0032.f1742(var91, var90); NIL == module0237.$g2444$.getDynamicValue(var66) && NIL == module0032.f1744(var91, var92); var92 = module0032.f1743(var92)) {
                                                                                        var93 = module0032.f1745(var91, var92);
                                                                                        if (NIL != module0032.f1746(var92, var93)) {
                                                                                            var94 = module0239.f15595(var72, var2, var93, var70);
                                                                                            f17520(var1, var93, var68);
                                                                                            if (NIL != module0134.f8765(var1)) {
                                                                                                var95 = module0239.f15593();
                                                                                                if (NIL != module0244.f15730(var95)) {
                                                                                                    module0241.f15638(var1, module0244.f15736(module0137.f8955((SubLObject)UNPROVIDED)), var2, var93, module0134.f8746(var1), module0138.f8997());
                                                                                                }
                                                                                                else {
                                                                                                    module0241.f15637(var1, var94);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var89.isList()) {
                                                                                    if (NIL == module0237.$g2444$.getDynamicValue(var66)) {
                                                                                        SubLObject var17_178 = var89;
                                                                                        SubLObject var96 = (SubLObject)NIL;
                                                                                        var96 = var17_178.first();
                                                                                        while (NIL == module0237.$g2444$.getDynamicValue(var66) && NIL != var17_178) {
                                                                                            final SubLObject var97 = module0239.f15595(var72, var2, var96, var70);
                                                                                            f17520(var1, var96, var68);
                                                                                            if (NIL != module0134.f8765(var1)) {
                                                                                                final SubLObject var98 = module0239.f15593();
                                                                                                if (NIL != module0244.f15730(var98)) {
                                                                                                    module0241.f15638(var1, module0244.f15736(module0137.f8955((SubLObject)UNPROVIDED)), var2, var96, module0134.f8746(var1), module0138.f8997());
                                                                                                }
                                                                                                else {
                                                                                                    module0241.f15637(var1, var97);
                                                                                                }
                                                                                            }
                                                                                            var17_178 = var17_178.rest();
                                                                                            var96 = var17_178.first();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)$ic5$, var89);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var7_176, var66);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var21_176);
                                                                }
                                                                finally {
                                                                    module0138.$g1623$.rebind(var7_175, var66);
                                                                }
                                                            }
                                                        }
                                                        module0066.f4842(var84);
                                                    }
                                                    var80 = var80.rest();
                                                    var81 = var80.first();
                                                }
                                            }
                                        }
                                        else {
                                            module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic6$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                        }
                                    }
                                    else if (NIL != module0210.f13595(var8_173, (SubLObject)UNPROVIDED) && NIL == module0237.$g2444$.getDynamicValue(var66)) {
                                        SubLObject var99 = module0133.f8715(var70);
                                        SubLObject var100 = (SubLObject)NIL;
                                        var100 = var99.first();
                                        while (NIL == module0237.$g2444$.getDynamicValue(var66) && NIL != var99) {
                                            final SubLObject var101 = module0244.f15782(var100, module0137.f8955(var72));
                                            final SubLObject var102 = (NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(var101, module0141.$g1714$.getDynamicValue(var66), module0137.f8955(var72))) : module0244.f15760(var101, module0141.$g1714$.getDynamicValue(var66), module0137.f8955(var72));
                                            SubLObject var103;
                                            SubLObject var104;
                                            SubLObject var7_177;
                                            SubLObject var106;
                                            SubLObject var105;
                                            SubLObject var107;
                                            SubLObject var108;
                                            SubLObject var109;
                                            SubLObject var110;
                                            SubLObject var111;
                                            SubLObject var112;
                                            SubLObject var17_179;
                                            SubLObject var113;
                                            SubLObject var114;
                                            SubLObject var115;
                                            for (var103 = (SubLObject)NIL, var103 = var102; NIL == module0237.$g2444$.getDynamicValue(var66) && NIL != var103; var103 = var103.rest()) {
                                                var104 = var103.first();
                                                var7_177 = module0138.$g1625$.currentBinding(var66);
                                                try {
                                                    module0138.$g1625$.bind(var104, var66);
                                                    var105 = (var106 = Functions.funcall(var104, var8_173));
                                                    if (NIL != module0077.f5302(var106)) {
                                                        var107 = module0077.f5333(var106);
                                                        for (var108 = module0032.f1741(var107), var109 = (SubLObject)NIL, var109 = module0032.f1742(var108, var107); NIL == module0237.$g2444$.getDynamicValue(var66) && NIL == module0032.f1744(var108, var109); var109 = module0032.f1743(var109)) {
                                                            var110 = module0032.f1745(var108, var109);
                                                            if (NIL != module0032.f1746(var109, var110)) {
                                                                var111 = module0239.f15595(var72, var2, var110, var70);
                                                                f17520(var1, var110, var68);
                                                                if (NIL != module0134.f8765(var1)) {
                                                                    var112 = module0239.f15593();
                                                                    if (NIL != module0244.f15730(var112)) {
                                                                        module0241.f15638(var1, module0244.f15736(module0137.f8955((SubLObject)UNPROVIDED)), var2, var110, module0134.f8746(var1), module0138.f8997());
                                                                    }
                                                                    else {
                                                                        module0241.f15637(var1, var111);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    else if (var106.isList()) {
                                                        if (NIL == module0237.$g2444$.getDynamicValue(var66)) {
                                                            var17_179 = var106;
                                                            var113 = (SubLObject)NIL;
                                                            var113 = var17_179.first();
                                                            while (NIL == module0237.$g2444$.getDynamicValue(var66) && NIL != var17_179) {
                                                                var114 = module0239.f15595(var72, var2, var113, var70);
                                                                f17520(var1, var113, var68);
                                                                if (NIL != module0134.f8765(var1)) {
                                                                    var115 = module0239.f15593();
                                                                    if (NIL != module0244.f15730(var115)) {
                                                                        module0241.f15638(var1, module0244.f15736(module0137.f8955((SubLObject)UNPROVIDED)), var2, var113, module0134.f8746(var1), module0138.f8997());
                                                                    }
                                                                    else {
                                                                        module0241.f15637(var1, var114);
                                                                    }
                                                                }
                                                                var17_179 = var17_179.rest();
                                                                var113 = var17_179.first();
                                                            }
                                                        }
                                                    }
                                                    else {
                                                        Errors.error((SubLObject)$ic5$, var106);
                                                    }
                                                }
                                                finally {
                                                    module0138.$g1625$.rebind(var7_177, var66);
                                                }
                                            }
                                            var99 = var99.rest();
                                            var100 = var99.first();
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var78, var66);
                                    module0137.$g1605$.rebind(var77, var66);
                                    module0141.$g1674$.rebind(var76, var66);
                                    module0141.$g1672$.rebind(var75, var66);
                                    module0141.$g1671$.rebind(var74, var66);
                                    module0141.$g1670$.rebind(var7_174, var66);
                                }
                            }
                            else if (NIL != module0239.f15601(var72)) {
                                final SubLObject var116 = module0130.f8524((SubLObject)$ic7$);
                                final SubLObject var117 = module0130.f8523((SubLObject)$ic7$);
                                final SubLObject var7_178 = module0134.$g1584$.currentBinding(var66);
                                try {
                                    module0134.$g1584$.bind((SubLObject)NIL, var66);
                                    if (NIL == module0237.$g2444$.getDynamicValue(var66)) {
                                        SubLObject var118 = module0133.f8715(var70);
                                        SubLObject var119 = (SubLObject)NIL;
                                        var119 = var118.first();
                                        while (NIL == module0237.$g2444$.getDynamicValue(var66) && NIL != var118) {
                                            final SubLObject var120 = module0239.f15602(var119);
                                            final SubLObject var121 = module0107.f7613(var120);
                                            final SubLObject var7_179 = module0239.$g2446$.currentBinding(var66);
                                            SubLObject var122 = module0148.$g2099$.currentBinding(var66);
                                            try {
                                                module0239.$g2446$.bind(var72, var66);
                                                module0148.$g2099$.bind((SubLObject)$ic8$, var66);
                                                final SubLObject var123 = (SubLObject)NIL;
                                                if (NIL != module0158.f10010(var2, var120, var123)) {
                                                    final SubLObject var124 = module0158.f10011(var2, var120, var123);
                                                    SubLObject var125 = module0237.$g2444$.getDynamicValue(var66);
                                                    final SubLObject var126 = (SubLObject)NIL;
                                                    while (NIL == var125) {
                                                        final SubLObject var127 = module0052.f3695(var124, var126);
                                                        final SubLObject var128 = (SubLObject)makeBoolean(!var126.eql(var127));
                                                        if (NIL != var128) {
                                                            SubLObject var129 = (SubLObject)NIL;
                                                            try {
                                                                var129 = module0158.f10316(var127, (SubLObject)$ic9$, var116, (SubLObject)NIL);
                                                                SubLObject var50_183 = module0237.$g2444$.getDynamicValue(var66);
                                                                final SubLObject var51_184 = (SubLObject)NIL;
                                                                while (NIL == var50_183) {
                                                                    final SubLObject var130 = module0052.f3695(var129, var51_184);
                                                                    final SubLObject var53_185 = (SubLObject)makeBoolean(!var51_184.eql(var130));
                                                                    if (NIL != var53_185 && (NIL == assertion_handles_oc.f11035(var130) || NIL != module0130.f8509(module0178.f11293(var130), var117))) {
                                                                        final SubLObject var131 = module0205.f13134(var130, var121, (SubLObject)UNPROVIDED);
                                                                        final SubLObject var154_186 = var130;
                                                                        f17520(var1, var131, var68);
                                                                        if (NIL != module0134.f8765(var1)) {
                                                                            final SubLObject var132 = module0239.f15593();
                                                                            if (NIL != module0244.f15730(var132)) {
                                                                                module0241.f15638(var1, module0244.f15736(module0137.f8955((SubLObject)UNPROVIDED)), var2, var131, module0134.f8746(var1), module0138.f8997());
                                                                            }
                                                                            else {
                                                                                module0241.f15637(var1, var154_186);
                                                                            }
                                                                        }
                                                                    }
                                                                    var50_183 = (SubLObject)makeBoolean(NIL == var53_185 || NIL != module0237.$g2444$.getDynamicValue(var66));
                                                                }
                                                            }
                                                            finally {
                                                                final SubLObject var7_180 = Threads.$is_thread_performing_cleanupP$.currentBinding(var66);
                                                                try {
                                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var66);
                                                                    if (NIL != var129) {
                                                                        module0158.f10319(var129);
                                                                    }
                                                                }
                                                                finally {
                                                                    Threads.$is_thread_performing_cleanupP$.rebind(var7_180, var66);
                                                                }
                                                            }
                                                        }
                                                        var125 = (SubLObject)makeBoolean(NIL == var128 || NIL != module0237.$g2444$.getDynamicValue(var66));
                                                    }
                                                }
                                            }
                                            finally {
                                                module0148.$g2099$.rebind(var122, var66);
                                                module0239.$g2446$.rebind(var7_179, var66);
                                            }
                                            if (NIL != module0134.f8807()) {
                                                final SubLObject var7_181 = module0134.$g1584$.currentBinding(var66);
                                                var122 = module0239.$g2446$.currentBinding(var66);
                                                final SubLObject var133 = module0148.$g2099$.currentBinding(var66);
                                                try {
                                                    module0134.$g1584$.bind((SubLObject)T, var66);
                                                    module0239.$g2446$.bind(var72, var66);
                                                    module0148.$g2099$.bind((SubLObject)$ic8$, var66);
                                                    final SubLObject var134 = (SubLObject)NIL;
                                                    if (NIL != module0158.f10010(var2, var121, var134)) {
                                                        final SubLObject var135 = module0158.f10011(var2, var121, var134);
                                                        SubLObject var136 = module0237.$g2444$.getDynamicValue(var66);
                                                        final SubLObject var137 = (SubLObject)NIL;
                                                        while (NIL == var136) {
                                                            final SubLObject var138 = module0052.f3695(var135, var137);
                                                            final SubLObject var139 = (SubLObject)makeBoolean(!var137.eql(var138));
                                                            if (NIL != var139) {
                                                                SubLObject var140 = (SubLObject)NIL;
                                                                try {
                                                                    var140 = module0158.f10316(var138, (SubLObject)$ic9$, var116, (SubLObject)NIL);
                                                                    SubLObject var50_184 = module0237.$g2444$.getDynamicValue(var66);
                                                                    final SubLObject var51_185 = (SubLObject)NIL;
                                                                    while (NIL == var50_184) {
                                                                        final SubLObject var141 = module0052.f3695(var140, var51_185);
                                                                        final SubLObject var53_186 = (SubLObject)makeBoolean(!var51_185.eql(var141));
                                                                        if (NIL != var53_186 && (NIL == assertion_handles_oc.f11035(var141) || NIL != module0130.f8509(module0178.f11293(var141), var117))) {
                                                                            final SubLObject var142 = module0205.f13134(var141, var120, (SubLObject)UNPROVIDED);
                                                                            final SubLObject var154_187 = var141;
                                                                            f17520(var1, var142, var68);
                                                                            if (NIL != module0134.f8765(var1)) {
                                                                                final SubLObject var143 = module0239.f15593();
                                                                                if (NIL != module0244.f15730(var143)) {
                                                                                    module0241.f15638(var1, module0244.f15736(module0137.f8955((SubLObject)UNPROVIDED)), var2, var142, module0134.f8746(var1), module0138.f8997());
                                                                                }
                                                                                else {
                                                                                    module0241.f15637(var1, var154_187);
                                                                                }
                                                                            }
                                                                        }
                                                                        var50_184 = (SubLObject)makeBoolean(NIL == var53_186 || NIL != module0237.$g2444$.getDynamicValue(var66));
                                                                    }
                                                                }
                                                                finally {
                                                                    final SubLObject var7_182 = Threads.$is_thread_performing_cleanupP$.currentBinding(var66);
                                                                    try {
                                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var66);
                                                                        if (NIL != var140) {
                                                                            module0158.f10319(var140);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        Threads.$is_thread_performing_cleanupP$.rebind(var7_182, var66);
                                                                    }
                                                                }
                                                            }
                                                            var136 = (SubLObject)makeBoolean(NIL == var139 || NIL != module0237.$g2444$.getDynamicValue(var66));
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0148.$g2099$.rebind(var133, var66);
                                                    module0239.$g2446$.rebind(var122, var66);
                                                    module0134.$g1584$.rebind(var7_181, var66);
                                                }
                                            }
                                            var118 = var118.rest();
                                            var119 = var118.first();
                                        }
                                    }
                                }
                                finally {
                                    module0134.$g1584$.rebind(var7_178, var66);
                                }
                            }
                        }
                        finally {
                            module0239.$g2445$.rebind(var73, var66);
                        }
                        var71 = var71.rest();
                        var72 = var71.first();
                    }
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17498(final SubLObject var1, final SubLObject var2, final SubLObject var65) {
        final SubLThread var66 = SubLProcess.currentSubLThread();
        final SubLObject var67 = module0139.$g1630$.getDynamicValue(var66);
        final SubLObject var68 = module0139.$g1631$.currentBinding(var66);
        final SubLObject var69 = module0139.$g1632$.currentBinding(var66);
        final SubLObject var70 = module0139.$g1630$.currentBinding(var66);
        try {
            module0139.$g1631$.bind(module0139.f9015(var67, (SubLObject)SIX_INTEGER), var66);
            module0139.$g1632$.bind(module0139.f9016(var67), var66);
            module0139.$g1630$.bind((SubLObject)T, var66);
            final SubLObject var72;
            final SubLObject var71 = var72 = module0034.f1854((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var7_197 = module0034.$g879$.currentBinding(var66);
            try {
                module0034.$g879$.bind(var72, var66);
                SubLObject var73 = (SubLObject)NIL;
                if (NIL != var72 && NIL == module0034.f1842(var72)) {
                    var73 = module0034.f1869(var72);
                    final SubLObject var74 = Threads.current_process();
                    if (NIL == var73) {
                        module0034.f1873(var72, var74);
                    }
                    else if (!var73.eql(var74)) {
                        Errors.error((SubLObject)$ic15$);
                    }
                }
                try {
                    SubLObject var75;
                    for (var75 = (SubLObject)NIL, var75 = (SubLObject)ZERO_INTEGER; var75.numL(var65); var75 = Numbers.add(var75, (SubLObject)ONE_INTEGER)) {
                        module0134.f8798(var1);
                        f17521(var1, var2, module0048.f_1X(var75));
                    }
                }
                finally {
                    final SubLObject var7_198 = Threads.$is_thread_performing_cleanupP$.currentBinding(var66);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var66);
                        if (NIL != var72 && NIL == var73) {
                            module0034.f1873(var72, (SubLObject)NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var7_198, var66);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var7_197, var66);
            }
        }
        finally {
            module0139.$g1630$.rebind(var70, var66);
            module0139.$g1632$.rebind(var69, var66);
            module0139.$g1631$.rebind(var68, var66);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17521(final SubLObject var1, final SubLObject var2, final SubLObject var65) {
        final SubLThread var66 = SubLProcess.currentSubLThread();
        if (!var65.numE((SubLObject)ZERO_INTEGER) && NIL != module0240.f15623(var1, var2, var65)) {
            return (SubLObject)NIL;
        }
        final SubLObject var67 = module0241.f15631(var1, var2, (SubLObject)UNPROVIDED);
        SubLObject var68 = (SubLObject)NIL;
        SubLObject var69 = (SubLObject)NIL;
        SubLObject var70 = (SubLObject)NIL;
        SubLObject var71 = (SubLObject)NIL;
        if (NIL != var67) {
            if (NIL != module0134.f8768(var1) || NIL != module0134.f8769(var1)) {
                var68 = (SubLObject)T;
            }
            else if (NIL != module0134.f8767(var1)) {
                var68 = (SubLObject)T;
                if (NIL == module0134.f8776(var1)) {
                    module0241.f15636(var1, var2);
                }
                var71 = (SubLObject)T;
            }
        }
        if (NIL == module0134.f8756(var1) && NIL != module0134.f8776(var1)) {
            var68 = (SubLObject)T;
        }
        if (NIL == var71 && NIL == module0240.f15622(var1, var2, var65)) {
            module0240.f15618(var1, var2, var65);
            final SubLObject var72 = module0048.f_1_(var65);
            final SubLObject var73 = module0134.f8741(var1);
            final SubLObject var74 = module0134.f8746(var1);
            if (!var72.numL((SubLObject)ZERO_INTEGER)) {
                SubLObject var75 = var73;
                SubLObject var76 = (SubLObject)NIL;
                var76 = var75.first();
                while (NIL != var75) {
                    final SubLObject var77 = module0239.$g2445$.currentBinding(var66);
                    try {
                        module0239.$g2445$.bind(var76, var66);
                        if (NIL != module0244.f15730(var76)) {
                            final SubLObject var8_207 = module0228.f15229(var2);
                            final SubLObject var7_208 = module0141.$g1670$.currentBinding(var66);
                            final SubLObject var78 = module0141.$g1671$.currentBinding(var66);
                            final SubLObject var79 = module0141.$g1672$.currentBinding(var66);
                            final SubLObject var80 = module0141.$g1674$.currentBinding(var66);
                            final SubLObject var81 = module0137.$g1605$.currentBinding(var66);
                            final SubLObject var82 = module0141.$g1674$.currentBinding(var66);
                            try {
                                module0141.$g1670$.bind(module0137.f8955(var76), var66);
                                module0141.$g1671$.bind(module0244.f15739(module0137.f8955(var76)), var66);
                                module0141.$g1672$.bind(module0244.f15746(module0137.f8955(var76)), var66);
                                module0141.$g1674$.bind((SubLObject)NIL, var66);
                                module0137.$g1605$.bind(module0137.f8955(var76), var66);
                                module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var66)) : module0141.$g1674$.getDynamicValue(var66)), var66);
                                if (NIL != module0173.f10955(var8_207)) {
                                    final SubLObject var83 = module0242.f15664(var8_207, module0137.f8955(var76));
                                    if (NIL != var83) {
                                        if (NIL == module0237.$g2444$.getDynamicValue(var66)) {
                                            SubLObject var84 = module0133.f8715(var74);
                                            SubLObject var85 = (SubLObject)NIL;
                                            var85 = var84.first();
                                            while (NIL == module0237.$g2444$.getDynamicValue(var66) && NIL != var84) {
                                                final SubLObject var86 = module0244.f15782(var85, module0137.f8955(var76));
                                                final SubLObject var87 = module0245.f15834(var83, var86, module0137.f8955(var76));
                                                if (NIL != var87) {
                                                    SubLObject var88;
                                                    for (var88 = module0066.f4838(module0067.f4891(var87)); NIL == module0237.$g2444$.getDynamicValue(var66) && NIL == module0066.f4841(var88); var88 = module0066.f4840(var88)) {
                                                        var66.resetMultipleValues();
                                                        final SubLObject var89 = module0066.f4839(var88);
                                                        final SubLObject var90 = var66.secondMultipleValue();
                                                        var66.resetMultipleValues();
                                                        if (NIL != module0147.f9507(var89)) {
                                                            final SubLObject var7_209 = module0138.$g1623$.currentBinding(var66);
                                                            try {
                                                                module0138.$g1623$.bind(var89, var66);
                                                                SubLObject var21_210;
                                                                for (var21_210 = module0066.f4838(module0067.f4891(var90)); NIL == module0237.$g2444$.getDynamicValue(var66) && NIL == module0066.f4841(var21_210); var21_210 = module0066.f4840(var21_210)) {
                                                                    var66.resetMultipleValues();
                                                                    final SubLObject var91 = module0066.f4839(var21_210);
                                                                    final SubLObject var92 = var66.secondMultipleValue();
                                                                    var66.resetMultipleValues();
                                                                    if (NIL != module0141.f9289(var91)) {
                                                                        final SubLObject var7_210 = module0138.$g1624$.currentBinding(var66);
                                                                        try {
                                                                            module0138.$g1624$.bind(var91, var66);
                                                                            final SubLObject var93 = var92;
                                                                            if (NIL != module0077.f5302(var93)) {
                                                                                final SubLObject var94 = module0077.f5333(var93);
                                                                                SubLObject var95;
                                                                                SubLObject var96;
                                                                                SubLObject var97;
                                                                                SubLObject var98;
                                                                                SubLObject var99;
                                                                                for (var95 = module0032.f1741(var94), var96 = (SubLObject)NIL, var96 = module0032.f1742(var95, var94); NIL == module0237.$g2444$.getDynamicValue(var66) && NIL == module0032.f1744(var95, var96); var96 = module0032.f1743(var96)) {
                                                                                    var97 = module0032.f1745(var95, var96);
                                                                                    if (NIL != module0032.f1746(var96, var97)) {
                                                                                        var98 = module0239.f15595(var76, var2, var97, var74);
                                                                                        var70 = f17521(var1, var97, var72);
                                                                                        if (NIL != var70) {
                                                                                            var69 = (SubLObject)T;
                                                                                            module0240.f15619(var1, var97, var72);
                                                                                            var99 = module0239.f15593();
                                                                                            if (NIL != module0244.f15730(var99)) {
                                                                                                module0241.f15638(var1, module0239.f15593(), var2, var97, module0134.f8746(var1), module0138.f8997());
                                                                                            }
                                                                                            else {
                                                                                                module0241.f15637(var1, var98);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            else if (var93.isList()) {
                                                                                if (NIL == module0237.$g2444$.getDynamicValue(var66)) {
                                                                                    SubLObject var17_212 = var93;
                                                                                    SubLObject var100 = (SubLObject)NIL;
                                                                                    var100 = var17_212.first();
                                                                                    while (NIL == module0237.$g2444$.getDynamicValue(var66) && NIL != var17_212) {
                                                                                        final SubLObject var101 = module0239.f15595(var76, var2, var100, var74);
                                                                                        var70 = f17521(var1, var100, var72);
                                                                                        if (NIL != var70) {
                                                                                            var69 = (SubLObject)T;
                                                                                            module0240.f15619(var1, var100, var72);
                                                                                            final SubLObject var102 = module0239.f15593();
                                                                                            if (NIL != module0244.f15730(var102)) {
                                                                                                module0241.f15638(var1, module0239.f15593(), var2, var100, module0134.f8746(var1), module0138.f8997());
                                                                                            }
                                                                                            else {
                                                                                                module0241.f15637(var1, var101);
                                                                                            }
                                                                                        }
                                                                                        var17_212 = var17_212.rest();
                                                                                        var100 = var17_212.first();
                                                                                    }
                                                                                }
                                                                            }
                                                                            else {
                                                                                Errors.error((SubLObject)$ic5$, var93);
                                                                            }
                                                                        }
                                                                        finally {
                                                                            module0138.$g1624$.rebind(var7_210, var66);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var21_210);
                                                            }
                                                            finally {
                                                                module0138.$g1623$.rebind(var7_209, var66);
                                                            }
                                                        }
                                                    }
                                                    module0066.f4842(var88);
                                                }
                                                var84 = var84.rest();
                                                var85 = var84.first();
                                            }
                                        }
                                    }
                                    else {
                                        module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic6$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    }
                                }
                                else if (NIL != module0210.f13595(var8_207, (SubLObject)UNPROVIDED) && NIL == module0237.$g2444$.getDynamicValue(var66)) {
                                    SubLObject var103 = module0133.f8715(var74);
                                    SubLObject var104 = (SubLObject)NIL;
                                    var104 = var103.first();
                                    while (NIL == module0237.$g2444$.getDynamicValue(var66) && NIL != var103) {
                                        final SubLObject var105 = module0244.f15782(var104, module0137.f8955(var76));
                                        final SubLObject var106 = (NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(var105, module0141.$g1714$.getDynamicValue(var66), module0137.f8955(var76))) : module0244.f15760(var105, module0141.$g1714$.getDynamicValue(var66), module0137.f8955(var76));
                                        SubLObject var107;
                                        SubLObject var108;
                                        SubLObject var7_211;
                                        SubLObject var110;
                                        SubLObject var109;
                                        SubLObject var111;
                                        SubLObject var112;
                                        SubLObject var113;
                                        SubLObject var114;
                                        SubLObject var115;
                                        SubLObject var116;
                                        SubLObject var17_213;
                                        SubLObject var117;
                                        SubLObject var118;
                                        SubLObject var119;
                                        for (var107 = (SubLObject)NIL, var107 = var106; NIL == module0237.$g2444$.getDynamicValue(var66) && NIL != var107; var107 = var107.rest()) {
                                            var108 = var107.first();
                                            var7_211 = module0138.$g1625$.currentBinding(var66);
                                            try {
                                                module0138.$g1625$.bind(var108, var66);
                                                var109 = (var110 = Functions.funcall(var108, var8_207));
                                                if (NIL != module0077.f5302(var110)) {
                                                    var111 = module0077.f5333(var110);
                                                    for (var112 = module0032.f1741(var111), var113 = (SubLObject)NIL, var113 = module0032.f1742(var112, var111); NIL == module0237.$g2444$.getDynamicValue(var66) && NIL == module0032.f1744(var112, var113); var113 = module0032.f1743(var113)) {
                                                        var114 = module0032.f1745(var112, var113);
                                                        if (NIL != module0032.f1746(var113, var114)) {
                                                            var115 = module0239.f15595(var76, var2, var114, var74);
                                                            var70 = f17521(var1, var114, var72);
                                                            if (NIL != var70) {
                                                                var69 = (SubLObject)T;
                                                                module0240.f15619(var1, var114, var72);
                                                                var116 = module0239.f15593();
                                                                if (NIL != module0244.f15730(var116)) {
                                                                    module0241.f15638(var1, module0239.f15593(), var2, var114, module0134.f8746(var1), module0138.f8997());
                                                                }
                                                                else {
                                                                    module0241.f15637(var1, var115);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                else if (var110.isList()) {
                                                    if (NIL == module0237.$g2444$.getDynamicValue(var66)) {
                                                        var17_213 = var110;
                                                        var117 = (SubLObject)NIL;
                                                        var117 = var17_213.first();
                                                        while (NIL == module0237.$g2444$.getDynamicValue(var66) && NIL != var17_213) {
                                                            var118 = module0239.f15595(var76, var2, var117, var74);
                                                            var70 = f17521(var1, var117, var72);
                                                            if (NIL != var70) {
                                                                var69 = (SubLObject)T;
                                                                module0240.f15619(var1, var117, var72);
                                                                var119 = module0239.f15593();
                                                                if (NIL != module0244.f15730(var119)) {
                                                                    module0241.f15638(var1, module0239.f15593(), var2, var117, module0134.f8746(var1), module0138.f8997());
                                                                }
                                                                else {
                                                                    module0241.f15637(var1, var118);
                                                                }
                                                            }
                                                            var17_213 = var17_213.rest();
                                                            var117 = var17_213.first();
                                                        }
                                                    }
                                                }
                                                else {
                                                    Errors.error((SubLObject)$ic5$, var110);
                                                }
                                            }
                                            finally {
                                                module0138.$g1625$.rebind(var7_211, var66);
                                            }
                                        }
                                        var103 = var103.rest();
                                        var104 = var103.first();
                                    }
                                }
                            }
                            finally {
                                module0141.$g1674$.rebind(var82, var66);
                                module0137.$g1605$.rebind(var81, var66);
                                module0141.$g1674$.rebind(var80, var66);
                                module0141.$g1672$.rebind(var79, var66);
                                module0141.$g1671$.rebind(var78, var66);
                                module0141.$g1670$.rebind(var7_208, var66);
                            }
                        }
                        else if (NIL != module0239.f15601(var76)) {
                            final SubLObject var120 = module0130.f8524((SubLObject)$ic7$);
                            final SubLObject var121 = module0130.f8523((SubLObject)$ic7$);
                            final SubLObject var7_212 = module0134.$g1584$.currentBinding(var66);
                            try {
                                module0134.$g1584$.bind((SubLObject)NIL, var66);
                                if (NIL == module0237.$g2444$.getDynamicValue(var66)) {
                                    SubLObject var122 = module0133.f8715(var74);
                                    SubLObject var123 = (SubLObject)NIL;
                                    var123 = var122.first();
                                    while (NIL == module0237.$g2444$.getDynamicValue(var66) && NIL != var122) {
                                        final SubLObject var124 = module0239.f15602(var123);
                                        final SubLObject var125 = module0107.f7613(var124);
                                        final SubLObject var7_213 = module0239.$g2446$.currentBinding(var66);
                                        SubLObject var126 = module0148.$g2099$.currentBinding(var66);
                                        try {
                                            module0239.$g2446$.bind(var76, var66);
                                            module0148.$g2099$.bind((SubLObject)$ic8$, var66);
                                            final SubLObject var127 = (SubLObject)NIL;
                                            if (NIL != module0158.f10010(var2, var124, var127)) {
                                                final SubLObject var128 = module0158.f10011(var2, var124, var127);
                                                SubLObject var129 = module0237.$g2444$.getDynamicValue(var66);
                                                final SubLObject var130 = (SubLObject)NIL;
                                                while (NIL == var129) {
                                                    final SubLObject var131 = module0052.f3695(var128, var130);
                                                    final SubLObject var132 = (SubLObject)makeBoolean(!var130.eql(var131));
                                                    if (NIL != var132) {
                                                        SubLObject var133 = (SubLObject)NIL;
                                                        try {
                                                            var133 = module0158.f10316(var131, (SubLObject)$ic9$, var120, (SubLObject)NIL);
                                                            SubLObject var50_217 = module0237.$g2444$.getDynamicValue(var66);
                                                            final SubLObject var51_218 = (SubLObject)NIL;
                                                            while (NIL == var50_217) {
                                                                final SubLObject var134 = module0052.f3695(var133, var51_218);
                                                                final SubLObject var53_219 = (SubLObject)makeBoolean(!var51_218.eql(var134));
                                                                if (NIL != var53_219 && (NIL == assertion_handles_oc.f11035(var134) || NIL != module0130.f8509(module0178.f11293(var134), var121))) {
                                                                    final SubLObject var135 = module0205.f13134(var134, var125, (SubLObject)UNPROVIDED);
                                                                    final SubLObject var154_220 = var134;
                                                                    var70 = f17521(var1, var135, var72);
                                                                    if (NIL != var70) {
                                                                        var69 = (SubLObject)T;
                                                                        module0240.f15619(var1, var135, var72);
                                                                        final SubLObject var136 = module0239.f15593();
                                                                        if (NIL != module0244.f15730(var136)) {
                                                                            module0241.f15638(var1, module0239.f15593(), var2, var135, module0134.f8746(var1), module0138.f8997());
                                                                        }
                                                                        else {
                                                                            module0241.f15637(var1, var154_220);
                                                                        }
                                                                    }
                                                                }
                                                                var50_217 = (SubLObject)makeBoolean(NIL == var53_219 || NIL != module0237.$g2444$.getDynamicValue(var66));
                                                            }
                                                        }
                                                        finally {
                                                            final SubLObject var7_214 = Threads.$is_thread_performing_cleanupP$.currentBinding(var66);
                                                            try {
                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var66);
                                                                if (NIL != var133) {
                                                                    module0158.f10319(var133);
                                                                }
                                                            }
                                                            finally {
                                                                Threads.$is_thread_performing_cleanupP$.rebind(var7_214, var66);
                                                            }
                                                        }
                                                    }
                                                    var129 = (SubLObject)makeBoolean(NIL == var132 || NIL != module0237.$g2444$.getDynamicValue(var66));
                                                }
                                            }
                                        }
                                        finally {
                                            module0148.$g2099$.rebind(var126, var66);
                                            module0239.$g2446$.rebind(var7_213, var66);
                                        }
                                        if (NIL != module0134.f8807()) {
                                            final SubLObject var7_215 = module0134.$g1584$.currentBinding(var66);
                                            var126 = module0239.$g2446$.currentBinding(var66);
                                            final SubLObject var137 = module0148.$g2099$.currentBinding(var66);
                                            try {
                                                module0134.$g1584$.bind((SubLObject)T, var66);
                                                module0239.$g2446$.bind(var76, var66);
                                                module0148.$g2099$.bind((SubLObject)$ic8$, var66);
                                                final SubLObject var138 = (SubLObject)NIL;
                                                if (NIL != module0158.f10010(var2, var125, var138)) {
                                                    final SubLObject var139 = module0158.f10011(var2, var125, var138);
                                                    SubLObject var140 = module0237.$g2444$.getDynamicValue(var66);
                                                    final SubLObject var141 = (SubLObject)NIL;
                                                    while (NIL == var140) {
                                                        final SubLObject var142 = module0052.f3695(var139, var141);
                                                        final SubLObject var143 = (SubLObject)makeBoolean(!var141.eql(var142));
                                                        if (NIL != var143) {
                                                            SubLObject var144 = (SubLObject)NIL;
                                                            try {
                                                                var144 = module0158.f10316(var142, (SubLObject)$ic9$, var120, (SubLObject)NIL);
                                                                SubLObject var50_218 = module0237.$g2444$.getDynamicValue(var66);
                                                                final SubLObject var51_219 = (SubLObject)NIL;
                                                                while (NIL == var50_218) {
                                                                    final SubLObject var145 = module0052.f3695(var144, var51_219);
                                                                    final SubLObject var53_220 = (SubLObject)makeBoolean(!var51_219.eql(var145));
                                                                    if (NIL != var53_220 && (NIL == assertion_handles_oc.f11035(var145) || NIL != module0130.f8509(module0178.f11293(var145), var121))) {
                                                                        final SubLObject var146 = module0205.f13134(var145, var124, (SubLObject)UNPROVIDED);
                                                                        final SubLObject var154_221 = var145;
                                                                        var70 = f17521(var1, var146, var72);
                                                                        if (NIL != var70) {
                                                                            var69 = (SubLObject)T;
                                                                            module0240.f15619(var1, var146, var72);
                                                                            final SubLObject var147 = module0239.f15593();
                                                                            if (NIL != module0244.f15730(var147)) {
                                                                                module0241.f15638(var1, module0239.f15593(), var2, var146, module0134.f8746(var1), module0138.f8997());
                                                                            }
                                                                            else {
                                                                                module0241.f15637(var1, var154_221);
                                                                            }
                                                                        }
                                                                    }
                                                                    var50_218 = (SubLObject)makeBoolean(NIL == var53_220 || NIL != module0237.$g2444$.getDynamicValue(var66));
                                                                }
                                                            }
                                                            finally {
                                                                final SubLObject var7_216 = Threads.$is_thread_performing_cleanupP$.currentBinding(var66);
                                                                try {
                                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var66);
                                                                    if (NIL != var144) {
                                                                        module0158.f10319(var144);
                                                                    }
                                                                }
                                                                finally {
                                                                    Threads.$is_thread_performing_cleanupP$.rebind(var7_216, var66);
                                                                }
                                                            }
                                                        }
                                                        var140 = (SubLObject)makeBoolean(NIL == var143 || NIL != module0237.$g2444$.getDynamicValue(var66));
                                                    }
                                                }
                                            }
                                            finally {
                                                module0148.$g2099$.rebind(var137, var66);
                                                module0239.$g2446$.rebind(var126, var66);
                                                module0134.$g1584$.rebind(var7_215, var66);
                                            }
                                        }
                                        var122 = var122.rest();
                                        var123 = var122.first();
                                    }
                                }
                            }
                            finally {
                                module0134.$g1584$.rebind(var7_212, var66);
                            }
                        }
                    }
                    finally {
                        module0239.$g2445$.rebind(var77, var66);
                    }
                    var75 = var75.rest();
                    var76 = var75.first();
                }
            }
        }
        return (SubLObject)makeBoolean(NIL != var68 || NIL != var69);
    }
    
    public static SubLObject f17522(final SubLObject var228, final SubLObject var229) {
        SubLObject var231;
        final SubLObject var230 = var231 = var228.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var231, var230, (SubLObject)$ic16$);
        final SubLObject var232 = var231.rest();
        var231 = var231.first();
        SubLObject var233 = (SubLObject)NIL;
        SubLObject var234 = (SubLObject)NIL;
        SubLObject var235 = (SubLObject)NIL;
        SubLObject var236 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var231, var230, (SubLObject)$ic16$);
        var233 = var231.first();
        var231 = var231.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var231, var230, (SubLObject)$ic16$);
        var234 = var231.first();
        var231 = var231.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var231, var230, (SubLObject)$ic16$);
        var235 = var231.first();
        var231 = var231.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var231, var230, (SubLObject)$ic16$);
        var236 = var231.first();
        var231 = var231.rest();
        SubLObject var237 = (SubLObject)NIL;
        SubLObject var238 = var231;
        SubLObject var239 = (SubLObject)NIL;
        SubLObject var237_238 = (SubLObject)NIL;
        while (NIL != var238) {
            cdestructuring_bind.destructuring_bind_must_consp(var238, var230, (SubLObject)$ic16$);
            var237_238 = var238.first();
            var238 = var238.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var238, var230, (SubLObject)$ic16$);
            if (NIL == conses_high.member(var237_238, (SubLObject)$ic17$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var239 = (SubLObject)T;
            }
            if (var237_238 == $ic18$) {
                var237 = var238.first();
            }
            var238 = var238.rest();
        }
        if (NIL != var239 && NIL == var237) {
            cdestructuring_bind.cdestructuring_bind_error(var230, (SubLObject)$ic16$);
        }
        final SubLObject var240 = cdestructuring_bind.property_list_member((SubLObject)$ic19$, var231);
        final SubLObject var241 = (SubLObject)((NIL != var240) ? conses_high.cadr(var240) : NIL);
        final SubLObject var242 = cdestructuring_bind.property_list_member((SubLObject)$ic20$, var231);
        final SubLObject var243 = (SubLObject)((NIL != var242) ? conses_high.cadr(var242) : NIL);
        final SubLObject var244 = cdestructuring_bind.property_list_member((SubLObject)$ic21$, var231);
        final SubLObject var245 = (SubLObject)((NIL != var244) ? conses_high.cadr(var244) : NIL);
        final SubLObject var246 = cdestructuring_bind.property_list_member((SubLObject)$ic22$, var231);
        final SubLObject var247 = (SubLObject)((NIL != var246) ? conses_high.cadr(var246) : $ic23$);
        final SubLObject var248;
        var231 = (var248 = var232);
        final SubLObject var249 = (SubLObject)$ic24$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic25$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var249, (SubLObject)ConsesLow.list((SubLObject)$ic26$, var234, var235, var236, var241, var243, var247))), (SubLObject)ConsesLow.listS((SubLObject)$ic27$, (SubLObject)ConsesLow.list(var233, var249, (SubLObject)$ic21$, var245), ConsesLow.append(var248, (SubLObject)NIL)));
    }
    
    public static SubLObject f17523(final SubLObject var233, final SubLObject var2, final SubLObject var148, SubLObject var240, SubLObject var242, SubLObject var249, SubLObject var250) {
        if (var240 == UNPROVIDED) {
            var240 = (SubLObject)NIL;
        }
        if (var242 == UNPROVIDED) {
            var242 = (SubLObject)NIL;
        }
        if (var249 == UNPROVIDED) {
            var249 = (SubLObject)$ic28$;
        }
        if (var250 == UNPROVIDED) {
            var250 = (SubLObject)T;
        }
        final SubLObject var251 = module0134.f8737((SubLObject)ConsesLow.list(new SubLObject[] { $ic29$, ConsesLow.list(var233), $ic30$, $ic31$, $ic22$, var249, $ic32$, var148, $ic20$, var242, $ic33$, $ic34$, $ic35$, module0240.f15611() }));
        final SubLObject var252 = module0269.f17788(var233);
        return f17524(var251, var2, var240, var252, var250);
    }
    
    public static SubLObject f17525(final SubLObject var233, final SubLObject var2, final SubLObject var148, SubLObject var240) {
        if (var240 == UNPROVIDED) {
            var240 = (SubLObject)NIL;
        }
        return f17523(var233, var2, var148, var240, (SubLObject)NIL, (SubLObject)$ic28$, (SubLObject)NIL);
    }
    
    public static SubLObject f17524(final SubLObject var1, final SubLObject var252, final SubLObject var240, final SubLObject var251, final SubLObject var250) {
        final SubLObject var253 = f17526(var1, var252, var240, var251, var250);
        return module0052.f3689(var253, (SubLObject)$ic36$, (SubLObject)$ic37$, (SubLObject)$ic38$);
    }
    
    public static SubLObject f17526(final SubLObject var1, final SubLObject var252, final SubLObject var240, final SubLObject var251, final SubLObject var250) {
        final SubLThread var253 = SubLProcess.currentSubLThread();
        final SubLObject var254 = (NIL != module0134.f8770(var1)) ? module0056.f4145((SubLObject)$ic10$) : module0056.f4145((SubLObject)$ic11$);
        if (NIL == var250) {
            final SubLObject var255 = module0147.$g2095$.currentBinding(var253);
            final SubLObject var256 = module0147.$g2094$.currentBinding(var253);
            final SubLObject var257 = module0147.$g2096$.currentBinding(var253);
            try {
                module0147.$g2095$.bind(module0147.f9545(var240), var253);
                module0147.$g2094$.bind(module0147.f9546(var240), var253);
                module0147.$g2096$.bind(module0147.f9549(var240), var253);
                module0240.f15618(var1, var252, (SubLObject)$ic39$);
                final SubLObject var258 = module0134.f8741(var1).first();
                final SubLObject var259 = module0130.f8524(module0134.f8742(var1));
                final SubLObject var260 = module0130.f8523(module0134.f8742(var1));
                final SubLObject var7_255 = module0134.$g1584$.currentBinding(var253);
                try {
                    module0134.$g1584$.bind((SubLObject)NIL, var253);
                    SubLObject var261 = module0133.f8715(module0134.f8746(var1));
                    SubLObject var262 = (SubLObject)NIL;
                    var262 = var261.first();
                    while (NIL != var261) {
                        final SubLObject var263 = module0239.f15602(var262);
                        final SubLObject var264 = module0107.f7613(var263);
                        final SubLObject var7_256 = module0239.$g2446$.currentBinding(var253);
                        final SubLObject var11_257 = module0148.$g2099$.currentBinding(var253);
                        try {
                            module0239.$g2446$.bind(var258, var253);
                            module0148.$g2099$.bind((SubLObject)$ic8$, var253);
                            final SubLObject var265 = (SubLObject)NIL;
                            if (NIL != module0158.f10010(var252, var263, var265)) {
                                final SubLObject var266 = module0158.f10011(var252, var263, var265);
                                SubLObject var267 = (SubLObject)NIL;
                                final SubLObject var268 = (SubLObject)NIL;
                                while (NIL == var267) {
                                    final SubLObject var269 = module0052.f3695(var266, var268);
                                    final SubLObject var270 = (SubLObject)makeBoolean(!var268.eql(var269));
                                    if (NIL != var270) {
                                        SubLObject var271 = (SubLObject)NIL;
                                        try {
                                            var271 = module0158.f10316(var269, (SubLObject)$ic9$, var259, (SubLObject)NIL);
                                            SubLObject var50_258 = (SubLObject)NIL;
                                            final SubLObject var51_259 = (SubLObject)NIL;
                                            while (NIL == var50_258) {
                                                final SubLObject var272 = module0052.f3695(var271, var51_259);
                                                final SubLObject var53_260 = (SubLObject)makeBoolean(!var51_259.eql(var272));
                                                if (NIL != var53_260 && (NIL == assertion_handles_oc.f11035(var272) || NIL != module0130.f8509(module0178.f11293(var272), var260))) {
                                                    final SubLObject var273 = module0205.f13134(var272, var264, (SubLObject)UNPROVIDED);
                                                    final SubLObject var154_262 = var272;
                                                    module0240.f15618(var1, var273, (SubLObject)$ic39$);
                                                    f17517(var1, var273, var254);
                                                }
                                                var50_258 = (SubLObject)makeBoolean(NIL == var53_260);
                                            }
                                        }
                                        finally {
                                            final SubLObject var7_257 = Threads.$is_thread_performing_cleanupP$.currentBinding(var253);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var253);
                                                if (NIL != var271) {
                                                    module0158.f10319(var271);
                                                }
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var7_257, var253);
                                            }
                                        }
                                    }
                                    var267 = (SubLObject)makeBoolean(NIL == var270);
                                }
                            }
                        }
                        finally {
                            module0148.$g2099$.rebind(var11_257, var253);
                            module0239.$g2446$.rebind(var7_256, var253);
                        }
                        if (NIL != module0134.f8807()) {
                            final SubLObject var7_258 = module0134.$g1584$.currentBinding(var253);
                            final SubLObject var11_258 = module0239.$g2446$.currentBinding(var253);
                            final SubLObject var12_266 = module0148.$g2099$.currentBinding(var253);
                            try {
                                module0134.$g1584$.bind((SubLObject)T, var253);
                                module0239.$g2446$.bind(var258, var253);
                                module0148.$g2099$.bind((SubLObject)$ic8$, var253);
                                final SubLObject var274 = (SubLObject)NIL;
                                if (NIL != module0158.f10010(var252, var264, var274)) {
                                    final SubLObject var275 = module0158.f10011(var252, var264, var274);
                                    SubLObject var276 = (SubLObject)NIL;
                                    final SubLObject var277 = (SubLObject)NIL;
                                    while (NIL == var276) {
                                        final SubLObject var278 = module0052.f3695(var275, var277);
                                        final SubLObject var279 = (SubLObject)makeBoolean(!var277.eql(var278));
                                        if (NIL != var279) {
                                            SubLObject var280 = (SubLObject)NIL;
                                            try {
                                                var280 = module0158.f10316(var278, (SubLObject)$ic9$, var259, (SubLObject)NIL);
                                                SubLObject var50_259 = (SubLObject)NIL;
                                                final SubLObject var51_260 = (SubLObject)NIL;
                                                while (NIL == var50_259) {
                                                    final SubLObject var281 = module0052.f3695(var280, var51_260);
                                                    final SubLObject var53_261 = (SubLObject)makeBoolean(!var51_260.eql(var281));
                                                    if (NIL != var53_261 && (NIL == assertion_handles_oc.f11035(var281) || NIL != module0130.f8509(module0178.f11293(var281), var260))) {
                                                        final SubLObject var282 = module0205.f13134(var281, var263, (SubLObject)UNPROVIDED);
                                                        final SubLObject var154_263 = var281;
                                                        module0240.f15618(var1, var282, (SubLObject)$ic39$);
                                                        f17517(var1, var282, var254);
                                                    }
                                                    var50_259 = (SubLObject)makeBoolean(NIL == var53_261);
                                                }
                                            }
                                            finally {
                                                final SubLObject var7_259 = Threads.$is_thread_performing_cleanupP$.currentBinding(var253);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var253);
                                                    if (NIL != var280) {
                                                        module0158.f10319(var280);
                                                    }
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var7_259, var253);
                                                }
                                            }
                                        }
                                        var276 = (SubLObject)makeBoolean(NIL == var279);
                                    }
                                }
                            }
                            finally {
                                module0148.$g2099$.rebind(var12_266, var253);
                                module0239.$g2446$.rebind(var11_258, var253);
                                module0134.$g1584$.rebind(var7_258, var253);
                            }
                        }
                        var261 = var261.rest();
                        var262 = var261.first();
                    }
                }
                finally {
                    module0134.$g1584$.rebind(var7_255, var253);
                }
            }
            finally {
                module0147.$g2096$.rebind(var257, var253);
                module0147.$g2094$.rebind(var256, var253);
                module0147.$g2095$.rebind(var255, var253);
            }
        }
        else if (NIL == var251) {
            final SubLObject var255 = module0147.$g2095$.currentBinding(var253);
            final SubLObject var256 = module0147.$g2094$.currentBinding(var253);
            final SubLObject var257 = module0147.$g2096$.currentBinding(var253);
            try {
                module0147.$g2095$.bind(module0147.f9545(var240), var253);
                module0147.$g2094$.bind(module0147.f9546(var240), var253);
                module0147.$g2096$.bind(module0147.f9549(var240), var253);
                module0240.f15618(var1, var252, (SubLObject)$ic39$);
                f17517(var1, var252, var254);
            }
            finally {
                module0147.$g2096$.rebind(var257, var253);
                module0147.$g2094$.rebind(var256, var253);
                module0147.$g2095$.rebind(var255, var253);
            }
        }
        else {
            module0056.f4149(var252, var254);
        }
        return (SubLObject)ConsesLow.list(var1, var254, var240);
    }
    
    public static SubLObject f17527(final SubLObject var253) {
        SubLObject var254 = (SubLObject)NIL;
        SubLObject var255 = (SubLObject)NIL;
        SubLObject var256 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var253, var253, (SubLObject)$ic40$);
        var254 = var253.first();
        SubLObject var257 = var253.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var257, var253, (SubLObject)$ic40$);
        var255 = var257.first();
        var257 = var257.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var257, var253, (SubLObject)$ic40$);
        var256 = var257.first();
        var257 = var257.rest();
        if (NIL == var257) {
            return module0056.f4147(var255);
        }
        cdestructuring_bind.cdestructuring_bind_error(var253, (SubLObject)$ic40$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17528(final SubLObject var253) {
        final SubLThread var254 = SubLProcess.currentSubLThread();
        SubLObject var255 = (SubLObject)NIL;
        SubLObject var256 = (SubLObject)NIL;
        SubLObject var257 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var253, var253, (SubLObject)$ic40$);
        var255 = var253.first();
        SubLObject var258 = var253.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var258, var253, (SubLObject)$ic40$);
        var256 = var258.first();
        var258 = var258.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var258, var253, (SubLObject)$ic40$);
        var257 = var258.first();
        var258 = var258.rest();
        if (NIL == var258) {
            SubLObject var259 = (SubLObject)NIL;
            while (NIL == var259 && NIL == module0056.f4147(var256)) {
                final SubLObject var260 = module0056.f4150(var256);
                final SubLObject var261 = module0240.f15612(var255, var260);
                if (NIL == var261) {
                    module0240.f15618(var255, var260, (SubLObject)T);
                    final SubLObject var262 = var257;
                    final SubLObject var263 = module0147.$g2095$.currentBinding(var254);
                    final SubLObject var264 = module0147.$g2094$.currentBinding(var254);
                    final SubLObject var265 = module0147.$g2096$.currentBinding(var254);
                    try {
                        module0147.$g2095$.bind(module0147.f9545(var262), var254);
                        module0147.$g2094$.bind(module0147.f9546(var262), var254);
                        module0147.$g2096$.bind(module0147.f9549(var262), var254);
                        f17517(var255, var260, var256);
                    }
                    finally {
                        module0147.$g2096$.rebind(var265, var254);
                        module0147.$g2094$.rebind(var264, var254);
                        module0147.$g2095$.rebind(var263, var254);
                    }
                    var259 = var260;
                }
                else {
                    if (var261 != $ic39$) {
                        continue;
                    }
                    module0240.f15618(var255, var260, (SubLObject)T);
                    var259 = var260;
                }
            }
            return Values.values(var259, var253, Types.sublisp_null(var259));
        }
        cdestructuring_bind.cdestructuring_bind_error(var253, (SubLObject)$ic40$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17529(final SubLObject var253) {
        SubLObject var254 = (SubLObject)NIL;
        SubLObject var255 = (SubLObject)NIL;
        SubLObject var256 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var253, var253, (SubLObject)$ic40$);
        var254 = var253.first();
        SubLObject var257 = var253.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var257, var253, (SubLObject)$ic40$);
        var255 = var257.first();
        var257 = var257.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var257, var253, (SubLObject)$ic40$);
        var256 = var257.first();
        var257 = var257.rest();
        if (NIL == var257) {
            module0134.f8740(var254);
            module0056.f4146(var255);
            return (SubLObject)T;
        }
        cdestructuring_bind.cdestructuring_bind_error(var253, (SubLObject)$ic40$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17530(final SubLObject var233, final SubLObject var2, SubLObject var148, SubLObject var240, SubLObject var242) {
        if (var148 == UNPROVIDED) {
            var148 = module0134.f8799();
        }
        if (var240 == UNPROVIDED) {
            var240 = (SubLObject)NIL;
        }
        if (var242 == UNPROVIDED) {
            var242 = (SubLObject)NIL;
        }
        final SubLThread var243 = SubLProcess.currentSubLThread();
        SubLObject var244 = (SubLObject)NIL;
        final SubLObject var245 = f17523(var233, var2, var148, var240, var242, (SubLObject)$ic28$, (SubLObject)UNPROVIDED);
        SubLObject var248;
        for (SubLObject var246 = (SubLObject)NIL; NIL == var246; var246 = (SubLObject)makeBoolean(NIL == var248)) {
            var243.resetMultipleValues();
            final SubLObject var247 = module0052.f3693(var245);
            var248 = var243.secondMultipleValue();
            var243.resetMultipleValues();
            if (NIL != var248) {
                var244 = (SubLObject)ConsesLow.cons(var247, var244);
            }
        }
        return Sequences.nreverse(var244);
    }
    
    public static SubLObject f17531(final SubLObject var233, final SubLObject var2, SubLObject var240, SubLObject var242) {
        if (var240 == UNPROVIDED) {
            var240 = (SubLObject)NIL;
        }
        if (var242 == UNPROVIDED) {
            var242 = (SubLObject)NIL;
        }
        return f17530(var233, var2, (SubLObject)$ic41$, var240, var242);
    }
    
    public static SubLObject f17532(final SubLObject var233, final SubLObject var2, SubLObject var240, SubLObject var242) {
        if (var240 == UNPROVIDED) {
            var240 = (SubLObject)NIL;
        }
        if (var242 == UNPROVIDED) {
            var242 = (SubLObject)NIL;
        }
        return f17530(var233, var2, (SubLObject)$ic42$, var240, var242);
    }
    
    public static SubLObject f17533(final SubLObject var283, final SubLObject var2, final SubLObject var148, SubLObject var240, SubLObject var242) {
        if (var240 == UNPROVIDED) {
            var240 = (SubLObject)NIL;
        }
        if (var242 == UNPROVIDED) {
            var242 = (SubLObject)NIL;
        }
        final SubLThread var284 = SubLProcess.currentSubLThread();
        final SubLObject var285 = var240;
        final SubLObject var286 = module0147.$g2095$.currentBinding(var284);
        final SubLObject var287 = module0147.$g2094$.currentBinding(var284);
        final SubLObject var288 = module0147.$g2096$.currentBinding(var284);
        try {
            module0147.$g2095$.bind(module0147.f9545(var285), var284);
            module0147.$g2094$.bind(module0147.f9546(var285), var284);
            module0147.$g2096$.bind(module0147.f9549(var285), var284);
            final SubLObject var289 = module0134.f8737((SubLObject)ConsesLow.list(new SubLObject[] { $ic29$, ConsesLow.list(var283), $ic30$, $ic31$, $ic22$, $ic23$, $ic32$, var148, $ic33$, $ic34$, $ic35$, module0240.$g2447$.getDynamicValue(var284) }));
            module0237.f15575();
            f17502(var289, var2);
            module0134.f8740(var289);
        }
        finally {
            module0147.$g2096$.rebind(var288, var284);
            module0147.$g2094$.rebind(var287, var284);
            module0147.$g2095$.rebind(var286, var284);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17534(final SubLObject var283, final SubLObject var2, SubLObject var240, SubLObject var242) {
        if (var240 == UNPROVIDED) {
            var240 = (SubLObject)NIL;
        }
        if (var242 == UNPROVIDED) {
            var242 = (SubLObject)NIL;
        }
        f17533(var283, var2, (SubLObject)$ic41$, var240, var242);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17535(final SubLObject var283, final SubLObject var2, SubLObject var240, SubLObject var242) {
        if (var240 == UNPROVIDED) {
            var240 = (SubLObject)NIL;
        }
        if (var242 == UNPROVIDED) {
            var242 = (SubLObject)NIL;
        }
        f17533(var283, var2, (SubLObject)$ic42$, var240, var242);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17536(final SubLObject var233, final SubLObject var284, final SubLObject var285, SubLObject var240, SubLObject var242, SubLObject var250) {
        if (var240 == UNPROVIDED) {
            var240 = (SubLObject)NIL;
        }
        if (var242 == UNPROVIDED) {
            var242 = (SubLObject)NIL;
        }
        if (var250 == UNPROVIDED) {
            var250 = (SubLObject)NIL;
        }
        return (NIL != module0244.f15730(var233)) ? module0252.f16335(module0137.f8955(var233), var284, var285, var240, var242) : f17537(var233, var284, var285, var240, var242, var250);
    }
    
    public static SubLObject f17537(final SubLObject var233, final SubLObject var284, final SubLObject var285, SubLObject var240, SubLObject var242, SubLObject var250) {
        if (var240 == UNPROVIDED) {
            var240 = (SubLObject)NIL;
        }
        if (var242 == UNPROVIDED) {
            var242 = (SubLObject)NIL;
        }
        if (var250 == UNPROVIDED) {
            var250 = (SubLObject)NIL;
        }
        final SubLThread var286 = SubLProcess.currentSubLThread();
        SubLObject var287 = (SubLObject)NIL;
        final SubLObject var288 = var240;
        final SubLObject var289 = module0147.$g2095$.currentBinding(var286);
        final SubLObject var290 = module0147.$g2094$.currentBinding(var286);
        final SubLObject var291 = module0147.$g2096$.currentBinding(var286);
        try {
            module0147.$g2095$.bind(module0147.f9545(var288), var286);
            module0147.$g2094$.bind(module0147.f9546(var288), var286);
            module0147.$g2096$.bind(module0147.f9549(var288), var286);
            if (var284.equal(var285) && NIL != module0269.f17788(var233)) {
                var287 = (SubLObject)T;
            }
            else if (var284.equal(var285) && NIL != module0269.f17776(var233)) {
                var287 = (SubLObject)NIL;
            }
            else {
                final SubLObject var292 = module0134.f8804(var233);
                final SubLObject var293 = module0134.f8801(var292);
                final SubLObject var294 = (NIL != var293) ? var284 : var285;
                final SubLObject var295 = (NIL != var293) ? var285 : var284;
                final SubLObject var296 = module0134.f8737((SubLObject)ConsesLow.list(new SubLObject[] { $ic29$, ConsesLow.list(var233), $ic22$, $ic28$, $ic30$, $ic31$, $ic32$, var292, $ic20$, var242, $ic33$, $ic34$, $ic43$, T, $ic44$, ConsesLow.list(var295) }));
                module0237.f15575();
                final SubLObject var297 = (NIL != module0134.f8770(var296)) ? module0056.f4145((SubLObject)$ic10$) : module0056.f4145((SubLObject)$ic11$);
                final SubLObject var298 = (SubLObject)makeBoolean(NIL != var250 || NIL != module0269.f17788(var233));
                module0240.f15618(var296, var294, (SubLObject)$ic39$);
                f17538(var296, var294, var297, var298);
                for (SubLObject var299 = module0056.f4150(var297); NIL == module0237.$g2444$.getDynamicValue(var286) && NIL != var299; var299 = module0056.f4150(var297)) {
                    final SubLObject var300 = module0240.f15612(var296, var299);
                    if (NIL == var300) {
                        module0240.f15618(var296, var299, (SubLObject)T);
                        if (NIL == module0237.$g2444$.getDynamicValue(var286)) {
                            f17538(var296, var299, var297, (SubLObject)T);
                        }
                    }
                    else if (var300 == $ic39$) {
                        module0240.f15618(var296, var299, (SubLObject)T);
                    }
                }
                var287 = module0035.sublisp_boolean(module0134.f8743(var296));
                module0134.f8740(var296);
            }
        }
        finally {
            module0147.$g2096$.rebind(var291, var286);
            module0147.$g2094$.rebind(var290, var286);
            module0147.$g2095$.rebind(var289, var286);
        }
        return var287;
    }
    
    public static SubLObject f17538(final SubLObject var1, final SubLObject var2, final SubLObject var289, final SubLObject var288) {
        final SubLThread var290 = SubLProcess.currentSubLThread();
        final SubLObject var291 = module0134.f8741(var1).first();
        final SubLObject var292 = module0130.f8524(module0134.f8742(var1));
        final SubLObject var293 = module0130.f8523(module0134.f8742(var1));
        final SubLObject var294 = module0134.$g1584$.currentBinding(var290);
        try {
            module0134.$g1584$.bind((SubLObject)NIL, var290);
            if (NIL == module0237.$g2444$.getDynamicValue(var290)) {
                SubLObject var295 = module0133.f8715(module0134.f8746(var1));
                SubLObject var296 = (SubLObject)NIL;
                var296 = var295.first();
                while (NIL == module0237.$g2444$.getDynamicValue(var290) && NIL != var295) {
                    final SubLObject var297 = module0239.f15602(var296);
                    final SubLObject var298 = module0107.f7613(var297);
                    final SubLObject var7_290 = module0239.$g2446$.currentBinding(var290);
                    SubLObject var299 = module0148.$g2099$.currentBinding(var290);
                    try {
                        module0239.$g2446$.bind(var291, var290);
                        module0148.$g2099$.bind((SubLObject)$ic8$, var290);
                        final SubLObject var300 = (SubLObject)NIL;
                        if (NIL != module0158.f10010(var2, var297, var300)) {
                            final SubLObject var301 = module0158.f10011(var2, var297, var300);
                            SubLObject var302 = module0237.$g2444$.getDynamicValue(var290);
                            final SubLObject var303 = (SubLObject)NIL;
                            while (NIL == var302) {
                                final SubLObject var304 = module0052.f3695(var301, var303);
                                final SubLObject var305 = (SubLObject)makeBoolean(!var303.eql(var304));
                                if (NIL != var305) {
                                    SubLObject var306 = (SubLObject)NIL;
                                    try {
                                        var306 = module0158.f10316(var304, (SubLObject)$ic9$, var292, (SubLObject)NIL);
                                        SubLObject var50_291 = module0237.$g2444$.getDynamicValue(var290);
                                        final SubLObject var51_292 = (SubLObject)NIL;
                                        while (NIL == var50_291) {
                                            final SubLObject var307 = module0052.f3695(var306, var51_292);
                                            final SubLObject var53_293 = (SubLObject)makeBoolean(!var51_292.eql(var307));
                                            if (NIL != var53_293 && (NIL == assertion_handles_oc.f11035(var307) || NIL != module0130.f8509(module0178.f11293(var307), var293))) {
                                                final SubLObject var308 = module0205.f13134(var307, var298, (SubLObject)UNPROVIDED);
                                                final SubLObject var154_294 = var307;
                                                if (NIL != module0241.f15631(var1, var308, (SubLObject)UNPROVIDED) && NIL != var288) {
                                                    module0241.f15636(var1, var308);
                                                }
                                                else {
                                                    module0056.f4149(var308, var289);
                                                }
                                            }
                                            var50_291 = (SubLObject)makeBoolean(NIL == var53_293 || NIL != module0237.$g2444$.getDynamicValue(var290));
                                        }
                                    }
                                    finally {
                                        final SubLObject var7_291 = Threads.$is_thread_performing_cleanupP$.currentBinding(var290);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var290);
                                            if (NIL != var306) {
                                                module0158.f10319(var306);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var7_291, var290);
                                        }
                                    }
                                }
                                var302 = (SubLObject)makeBoolean(NIL == var305 || NIL != module0237.$g2444$.getDynamicValue(var290));
                            }
                        }
                    }
                    finally {
                        module0148.$g2099$.rebind(var299, var290);
                        module0239.$g2446$.rebind(var7_290, var290);
                    }
                    if (NIL != module0134.f8807()) {
                        final SubLObject var7_292 = module0134.$g1584$.currentBinding(var290);
                        var299 = module0239.$g2446$.currentBinding(var290);
                        final SubLObject var309 = module0148.$g2099$.currentBinding(var290);
                        try {
                            module0134.$g1584$.bind((SubLObject)T, var290);
                            module0239.$g2446$.bind(var291, var290);
                            module0148.$g2099$.bind((SubLObject)$ic8$, var290);
                            final SubLObject var310 = (SubLObject)NIL;
                            if (NIL != module0158.f10010(var2, var298, var310)) {
                                final SubLObject var311 = module0158.f10011(var2, var298, var310);
                                SubLObject var312 = module0237.$g2444$.getDynamicValue(var290);
                                final SubLObject var313 = (SubLObject)NIL;
                                while (NIL == var312) {
                                    final SubLObject var314 = module0052.f3695(var311, var313);
                                    final SubLObject var315 = (SubLObject)makeBoolean(!var313.eql(var314));
                                    if (NIL != var315) {
                                        SubLObject var316 = (SubLObject)NIL;
                                        try {
                                            var316 = module0158.f10316(var314, (SubLObject)$ic9$, var292, (SubLObject)NIL);
                                            SubLObject var50_292 = module0237.$g2444$.getDynamicValue(var290);
                                            final SubLObject var51_293 = (SubLObject)NIL;
                                            while (NIL == var50_292) {
                                                final SubLObject var317 = module0052.f3695(var316, var51_293);
                                                final SubLObject var53_294 = (SubLObject)makeBoolean(!var51_293.eql(var317));
                                                if (NIL != var53_294 && (NIL == assertion_handles_oc.f11035(var317) || NIL != module0130.f8509(module0178.f11293(var317), var293))) {
                                                    final SubLObject var318 = module0205.f13134(var317, var297, (SubLObject)UNPROVIDED);
                                                    final SubLObject var154_295 = var317;
                                                    if (NIL != module0241.f15631(var1, var318, (SubLObject)UNPROVIDED) && NIL != var288) {
                                                        module0241.f15636(var1, var318);
                                                    }
                                                    else {
                                                        module0056.f4149(var318, var289);
                                                    }
                                                }
                                                var50_292 = (SubLObject)makeBoolean(NIL == var53_294 || NIL != module0237.$g2444$.getDynamicValue(var290));
                                            }
                                        }
                                        finally {
                                            final SubLObject var7_293 = Threads.$is_thread_performing_cleanupP$.currentBinding(var290);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var290);
                                                if (NIL != var316) {
                                                    module0158.f10319(var316);
                                                }
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var7_293, var290);
                                            }
                                        }
                                    }
                                    var312 = (SubLObject)makeBoolean(NIL == var315 || NIL != module0237.$g2444$.getDynamicValue(var290));
                                }
                            }
                        }
                        finally {
                            module0148.$g2099$.rebind(var309, var290);
                            module0239.$g2446$.rebind(var299, var290);
                            module0134.$g1584$.rebind(var7_292, var290);
                        }
                    }
                    var295 = var295.rest();
                    var296 = var295.first();
                }
            }
        }
        finally {
            module0134.$g1584$.rebind(var294, var290);
        }
        return var289;
    }
    
    public static SubLObject f17539(final SubLObject var233, final SubLObject var284, final SubLObject var285, final SubLObject var302, final SubLObject var303, SubLObject var240, SubLObject var242) {
        if (var240 == UNPROVIDED) {
            var240 = (SubLObject)NIL;
        }
        if (var242 == UNPROVIDED) {
            var242 = (SubLObject)NIL;
        }
        final SubLThread var304 = SubLProcess.currentSubLThread();
        SubLObject var305 = (SubLObject)NIL;
        final SubLObject var306 = var240;
        final SubLObject var307 = module0147.$g2095$.currentBinding(var304);
        final SubLObject var308 = module0147.$g2094$.currentBinding(var304);
        final SubLObject var309 = module0147.$g2096$.currentBinding(var304);
        try {
            module0147.$g2095$.bind(module0147.f9545(var306), var304);
            module0147.$g2094$.bind(module0147.f9546(var306), var304);
            module0147.$g2096$.bind(module0147.f9549(var306), var304);
            if (NIL != module0244.f15730(var233)) {
                var305 = module0252.f16344(module0137.f8955(var233), var284, var285, var302, var303);
            }
            else if (var284.equal(var285) && NIL != module0269.f17788(var233)) {
                var305 = var285;
            }
            else if (var284.equal(var285) && NIL != module0269.f17776(var233)) {
                var305 = (SubLObject)NIL;
            }
            else {
                final SubLObject var310 = module0134.f8804(var233);
                final SubLObject var311 = module0134.f8803(var310);
                final SubLObject var312 = module0134.f8801(var310);
                final SubLObject var313 = (NIL != var312) ? var284 : var285;
                final SubLObject var314 = (NIL != var312) ? var285 : var284;
                var305 = f17540(var233, var313, var314, var310, var302, var303);
                if (NIL != var305) {
                    if (NIL != module0238.f15580(var305) && NIL != module0240.f15616(var305, var303)) {
                        module0240.f15617(var305, (SubLObject)T, var302);
                    }
                    final SubLObject var315 = module0134.f8737((SubLObject)ConsesLow.listS((SubLObject)$ic29$, new SubLObject[] { ConsesLow.list(var233), $ic22$, $ic23$, $ic30$, $ic31$, $ic32$, var311, $ic33$, $ic34$, $ic35$, var302, $ic45$, var303, $ic46$ }));
                    module0237.f15575();
                    f17507(var315, var314);
                    module0134.f8740(var315);
                }
            }
        }
        finally {
            module0147.$g2096$.rebind(var309, var304);
            module0147.$g2094$.rebind(var308, var304);
            module0147.$g2095$.rebind(var307, var304);
        }
        return var305;
    }
    
    public static SubLObject f17540(final SubLObject var233, final SubLObject var252, final SubLObject var287, final SubLObject var148, final SubLObject var302, final SubLObject var303) {
        final SubLObject var304 = module0134.f8737((SubLObject)ConsesLow.list(new SubLObject[] { $ic29$, ConsesLow.list(var233), $ic22$, $ic23$, $ic30$, $ic31$, $ic32$, var148, $ic33$, $ic34$, $ic35$, var302, $ic43$, T, $ic44$, var287, $ic47$, $ic48$, $ic45$, var303 }));
        module0237.f15575();
        f17506(var304, var252);
        return module0134.f8743(var304);
    }
    
    public static SubLObject f17541(final SubLObject var233, final SubLObject var2, final SubLObject var148, final SubLObject var305, final SubLObject var306) {
        final SubLObject var307 = module0134.f8737((SubLObject)ConsesLow.list(new SubLObject[] { $ic29$, ConsesLow.list(var233), $ic22$, $ic23$, $ic30$, $ic31$, $ic32$, var148, $ic33$, $ic34$, $ic35$, var305, $ic49$, var306 }));
        module0237.f15575();
        f17507(var307, var2);
        module0134.f8740(var307);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17542(final SubLObject var233, final SubLObject var284, final SubLObject var285, SubLObject var240, SubLObject var242) {
        if (var240 == UNPROVIDED) {
            var240 = (SubLObject)NIL;
        }
        if (var242 == UNPROVIDED) {
            var242 = (SubLObject)NIL;
        }
        return (NIL != module0244.f15730(var233)) ? module0252.f16349(module0137.f8955(var233), var284, var285, var240, var242, (SubLObject)UNPROVIDED) : f17543(var233, var284, var285, var240, var242);
    }
    
    public static SubLObject f17543(final SubLObject var233, final SubLObject var284, final SubLObject var285, SubLObject var240, SubLObject var242) {
        if (var240 == UNPROVIDED) {
            var240 = (SubLObject)NIL;
        }
        if (var242 == UNPROVIDED) {
            var242 = (SubLObject)NIL;
        }
        final SubLThread var286 = SubLProcess.currentSubLThread();
        SubLObject var287 = (SubLObject)NIL;
        final SubLObject var288 = var240;
        final SubLObject var289 = module0147.$g2095$.currentBinding(var286);
        final SubLObject var290 = module0147.$g2094$.currentBinding(var286);
        final SubLObject var291 = module0147.$g2096$.currentBinding(var286);
        try {
            module0147.$g2095$.bind(module0147.f9545(var288), var286);
            module0147.$g2094$.bind(module0147.f9546(var288), var286);
            module0147.$g2096$.bind(module0147.f9549(var288), var286);
            if (var284.equal(var285) && NIL != module0269.f17788(var233)) {
                var287 = (SubLObject)ConsesLow.list(module0191.f11990((SubLObject)$ic50$, module0202.f12768(var233, var284, var285), var240, var242));
            }
            else if (var284.equal(var285) && NIL != module0269.f17776(var233)) {
                var287 = (SubLObject)NIL;
            }
            else {
                final SubLObject var292 = module0134.f8804(var233);
                final SubLObject var293 = module0134.f8801(var292);
                final SubLObject var294 = (NIL != var293) ? var284 : var285;
                final SubLObject var295 = (NIL != var293) ? var285 : var284;
                final SubLObject var296 = module0134.f8737((SubLObject)ConsesLow.listS((SubLObject)$ic29$, new SubLObject[] { ConsesLow.list(var233), $ic22$, $ic28$, $ic30$, $ic31$, $ic32$, var292, $ic20$, var242, $ic33$, $ic34$, $ic43$, T, $ic44$, ConsesLow.list(var295), $ic51$ }));
                module0237.f15575();
                final SubLObject var297 = (NIL != module0134.f8770(var296)) ? module0056.f4145((SubLObject)$ic10$) : module0056.f4145((SubLObject)$ic11$);
                module0240.f15618(var296, var294, (SubLObject)$ic39$);
                f17544(var296, var294, (SubLObject)NIL, var297, (SubLObject)T);
                if (NIL == module0056.f4147(var297)) {
                    SubLObject var299;
                    final SubLObject var298 = var299 = module0056.f4150(var297);
                    SubLObject var300 = (SubLObject)NIL;
                    SubLObject var301 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var299, var298, (SubLObject)$ic52$);
                    var300 = var299.first();
                    var299 = var299.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var299, var298, (SubLObject)$ic52$);
                    var301 = var299.first();
                    var299 = var299.rest();
                    if (NIL == var299) {
                        while (NIL == module0237.$g2444$.getDynamicValue(var286) && NIL != var300) {
                            final SubLObject var302 = module0240.f15612(var296, var300);
                            if (NIL == var302) {
                                module0240.f15618(var296, var300, (SubLObject)T);
                                f17544(var296, var300, var301, var297, (SubLObject)T);
                            }
                            else if (var302 == $ic39$) {
                                module0240.f15618(var296, var300, (SubLObject)T);
                            }
                            final SubLObject var303 = module0056.f4150(var297);
                            var300 = var303.first();
                            var301 = conses_high.cadr(var303);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var298, (SubLObject)$ic52$);
                    }
                }
                var287 = module0134.f8743(var296);
                module0134.f8740(var296);
            }
        }
        finally {
            module0147.$g2096$.rebind(var291, var286);
            module0147.$g2094$.rebind(var290, var286);
            module0147.$g2095$.rebind(var289, var286);
        }
        return var287;
    }
    
    public static SubLObject f17544(final SubLObject var1, final SubLObject var2, final SubLObject var141, final SubLObject var289, final SubLObject var288) {
        final SubLThread var290 = SubLProcess.currentSubLThread();
        final SubLObject var291 = module0134.f8741(var1).first();
        final SubLObject var292 = module0130.f8524(module0134.f8742(var1));
        final SubLObject var293 = module0130.f8523(module0134.f8742(var1));
        final SubLObject var294 = module0134.$g1584$.currentBinding(var290);
        try {
            module0134.$g1584$.bind((SubLObject)NIL, var290);
            if (NIL == module0237.$g2444$.getDynamicValue(var290)) {
                SubLObject var295 = module0133.f8715(module0134.f8746(var1));
                SubLObject var296 = (SubLObject)NIL;
                var296 = var295.first();
                while (NIL == module0237.$g2444$.getDynamicValue(var290) && NIL != var295) {
                    final SubLObject var297 = module0239.f15602(var296);
                    final SubLObject var298 = module0107.f7613(var297);
                    final SubLObject var7_310 = module0239.$g2446$.currentBinding(var290);
                    SubLObject var299 = module0148.$g2099$.currentBinding(var290);
                    try {
                        module0239.$g2446$.bind(var291, var290);
                        module0148.$g2099$.bind((SubLObject)$ic8$, var290);
                        final SubLObject var300 = (SubLObject)NIL;
                        if (NIL != module0158.f10010(var2, var297, var300)) {
                            final SubLObject var301 = module0158.f10011(var2, var297, var300);
                            SubLObject var302 = module0237.$g2444$.getDynamicValue(var290);
                            final SubLObject var303 = (SubLObject)NIL;
                            while (NIL == var302) {
                                final SubLObject var304 = module0052.f3695(var301, var303);
                                final SubLObject var305 = (SubLObject)makeBoolean(!var303.eql(var304));
                                if (NIL != var305) {
                                    SubLObject var306 = (SubLObject)NIL;
                                    try {
                                        var306 = module0158.f10316(var304, (SubLObject)$ic9$, var292, (SubLObject)NIL);
                                        SubLObject var50_311 = module0237.$g2444$.getDynamicValue(var290);
                                        final SubLObject var51_312 = (SubLObject)NIL;
                                        while (NIL == var50_311) {
                                            final SubLObject var307 = module0052.f3695(var306, var51_312);
                                            final SubLObject var53_313 = (SubLObject)makeBoolean(!var51_312.eql(var307));
                                            if (NIL != var53_313 && (NIL == assertion_handles_oc.f11035(var307) || NIL != module0130.f8509(module0178.f11293(var307), var293))) {
                                                final SubLObject var308 = module0205.f13134(var307, var298, (SubLObject)UNPROVIDED);
                                                final SubLObject var154_314 = var307;
                                                if (NIL != module0241.f15631(var1, var308, (SubLObject)UNPROVIDED) && NIL != var288) {
                                                    final SubLObject var309 = f17519(var1, (SubLObject)ConsesLow.cons(var154_314, var141));
                                                    module0241.f15636(var1, var308);
                                                    f17518(var1, var309);
                                                }
                                                else {
                                                    module0056.f4149((SubLObject)ConsesLow.list(var308, (SubLObject)ConsesLow.cons(var154_314, var141)), var289);
                                                }
                                            }
                                            var50_311 = (SubLObject)makeBoolean(NIL == var53_313 || NIL != module0237.$g2444$.getDynamicValue(var290));
                                        }
                                    }
                                    finally {
                                        final SubLObject var7_311 = Threads.$is_thread_performing_cleanupP$.currentBinding(var290);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var290);
                                            if (NIL != var306) {
                                                module0158.f10319(var306);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var7_311, var290);
                                        }
                                    }
                                }
                                var302 = (SubLObject)makeBoolean(NIL == var305 || NIL != module0237.$g2444$.getDynamicValue(var290));
                            }
                        }
                    }
                    finally {
                        module0148.$g2099$.rebind(var299, var290);
                        module0239.$g2446$.rebind(var7_310, var290);
                    }
                    if (NIL != module0134.f8807()) {
                        final SubLObject var7_312 = module0134.$g1584$.currentBinding(var290);
                        var299 = module0239.$g2446$.currentBinding(var290);
                        final SubLObject var310 = module0148.$g2099$.currentBinding(var290);
                        try {
                            module0134.$g1584$.bind((SubLObject)T, var290);
                            module0239.$g2446$.bind(var291, var290);
                            module0148.$g2099$.bind((SubLObject)$ic8$, var290);
                            final SubLObject var311 = (SubLObject)NIL;
                            if (NIL != module0158.f10010(var2, var298, var311)) {
                                final SubLObject var312 = module0158.f10011(var2, var298, var311);
                                SubLObject var313 = module0237.$g2444$.getDynamicValue(var290);
                                final SubLObject var314 = (SubLObject)NIL;
                                while (NIL == var313) {
                                    final SubLObject var315 = module0052.f3695(var312, var314);
                                    final SubLObject var316 = (SubLObject)makeBoolean(!var314.eql(var315));
                                    if (NIL != var316) {
                                        SubLObject var317 = (SubLObject)NIL;
                                        try {
                                            var317 = module0158.f10316(var315, (SubLObject)$ic9$, var292, (SubLObject)NIL);
                                            SubLObject var50_312 = module0237.$g2444$.getDynamicValue(var290);
                                            final SubLObject var51_313 = (SubLObject)NIL;
                                            while (NIL == var50_312) {
                                                final SubLObject var318 = module0052.f3695(var317, var51_313);
                                                final SubLObject var53_314 = (SubLObject)makeBoolean(!var51_313.eql(var318));
                                                if (NIL != var53_314 && (NIL == assertion_handles_oc.f11035(var318) || NIL != module0130.f8509(module0178.f11293(var318), var293))) {
                                                    final SubLObject var319 = module0205.f13134(var318, var297, (SubLObject)UNPROVIDED);
                                                    final SubLObject var154_315 = var318;
                                                    if (NIL != module0241.f15631(var1, var319, (SubLObject)UNPROVIDED) && NIL != var288) {
                                                        final SubLObject var320 = f17519(var1, (SubLObject)ConsesLow.cons(var154_315, var141));
                                                        module0241.f15636(var1, var319);
                                                        f17518(var1, var320);
                                                    }
                                                    else {
                                                        module0056.f4149((SubLObject)ConsesLow.list(var319, (SubLObject)ConsesLow.cons(var154_315, var141)), var289);
                                                    }
                                                }
                                                var50_312 = (SubLObject)makeBoolean(NIL == var53_314 || NIL != module0237.$g2444$.getDynamicValue(var290));
                                            }
                                        }
                                        finally {
                                            final SubLObject var7_313 = Threads.$is_thread_performing_cleanupP$.currentBinding(var290);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var290);
                                                if (NIL != var317) {
                                                    module0158.f10319(var317);
                                                }
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var7_313, var290);
                                            }
                                        }
                                    }
                                    var313 = (SubLObject)makeBoolean(NIL == var316 || NIL != module0237.$g2444$.getDynamicValue(var290));
                                }
                            }
                        }
                        finally {
                            module0148.$g2099$.rebind(var310, var290);
                            module0239.$g2446$.rebind(var299, var290);
                            module0134.$g1584$.rebind(var7_312, var290);
                        }
                    }
                    var295 = var295.rest();
                    var296 = var295.first();
                }
            }
        }
        finally {
            module0134.$g1584$.rebind(var294, var290);
        }
        return var289;
    }
    
    public static SubLObject f17545(final SubLObject var233, final SubLObject var284, final SubLObject var285, SubLObject var242) {
        if (var242 == UNPROVIDED) {
            var242 = (SubLObject)NIL;
        }
        return (NIL != module0244.f15730(var233)) ? module0253.f16446(module0137.f8955(var233), var284, var285, var242) : f17546(var233, var284, var285, var242);
    }
    
    public static SubLObject f17546(final SubLObject var233, final SubLObject var284, final SubLObject var285, SubLObject var242) {
        if (var242 == UNPROVIDED) {
            var242 = (SubLObject)NIL;
        }
        final SubLThread var286 = SubLProcess.currentSubLThread();
        SubLObject var287 = (SubLObject)NIL;
        final SubLObject var288 = module0147.$g2094$.currentBinding(var286);
        final SubLObject var289 = module0147.$g2095$.currentBinding(var286);
        try {
            module0147.$g2094$.bind((SubLObject)$ic53$, var286);
            module0147.$g2095$.bind($ic54$, var286);
            if (var284.equal(var285) && NIL != module0269.f17788(var233)) {
                var287 = module0333.f22472(module0202.f12768(var233, var284, var285), (SubLObject)NIL);
            }
            else if (var284.equal(var285) && NIL != module0269.f17776(var233)) {
                var287 = (SubLObject)NIL;
            }
            else {
                final SubLObject var290 = module0134.f8804(var233);
                final SubLObject var291 = module0134.f8801(var290);
                final SubLObject var292 = (NIL != var291) ? var284 : var285;
                final SubLObject var293 = (NIL != var291) ? var285 : var284;
                final SubLObject var294 = module0134.f8737((SubLObject)ConsesLow.listS((SubLObject)$ic29$, new SubLObject[] { ConsesLow.list(var233), $ic22$, $ic28$, $ic30$, $ic31$, $ic32$, var290, $ic20$, var242, $ic33$, $ic34$, $ic43$, T, $ic44$, ConsesLow.list(var293), $ic51$ }));
                module0237.f15575();
                final SubLObject var295 = (NIL != module0134.f8770(var294)) ? module0056.f4145((SubLObject)$ic10$) : module0056.f4145((SubLObject)$ic11$);
                module0240.f15618(var294, var292, (SubLObject)$ic39$);
                f17547(var294, var292, (SubLObject)NIL, var295);
                if (NIL == module0056.f4147(var295)) {
                    SubLObject var297;
                    final SubLObject var296 = var297 = module0056.f4150(var295);
                    SubLObject var298 = (SubLObject)NIL;
                    SubLObject var299 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var297, var296, (SubLObject)$ic52$);
                    var298 = var297.first();
                    var297 = var297.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var297, var296, (SubLObject)$ic52$);
                    var299 = var297.first();
                    var297 = var297.rest();
                    if (NIL == var297) {
                        while (NIL == module0237.$g2444$.getDynamicValue(var286) && NIL != var298) {
                            final SubLObject var300 = module0240.f15612(var294, var298);
                            if (NIL == var300) {
                                module0240.f15618(var294, var298, (SubLObject)T);
                                f17547(var294, var298, var299, var295);
                            }
                            else if (var300 == $ic39$) {
                                module0240.f15618(var294, var298, (SubLObject)T);
                            }
                            final SubLObject var301 = module0056.f4150(var295);
                            var298 = var301.first();
                            var299 = conses_high.cadr(var301);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var296, (SubLObject)$ic52$);
                    }
                }
                var287 = module0134.f8743(var294);
                module0134.f8740(var294);
            }
        }
        finally {
            module0147.$g2095$.rebind(var289, var286);
            module0147.$g2094$.rebind(var288, var286);
        }
        return module0262.f17367(var287, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17547(final SubLObject var1, final SubLObject var2, final SubLObject var141, final SubLObject var289) {
        final SubLThread var290 = SubLProcess.currentSubLThread();
        if (NIL != f17548(var1, var141)) {
            final SubLObject var291 = module0134.f8741(var1).first();
            final SubLObject var292 = module0130.f8524(module0134.f8742(var1));
            final SubLObject var293 = module0130.f8523(module0134.f8742(var1));
            final SubLObject var294 = module0134.$g1584$.currentBinding(var290);
            try {
                module0134.$g1584$.bind((SubLObject)NIL, var290);
                if (NIL == module0237.$g2444$.getDynamicValue(var290)) {
                    SubLObject var295 = module0133.f8715(module0134.f8746(var1));
                    SubLObject var296 = (SubLObject)NIL;
                    var296 = var295.first();
                    while (NIL == module0237.$g2444$.getDynamicValue(var290) && NIL != var295) {
                        final SubLObject var297 = module0239.f15602(var296);
                        final SubLObject var298 = module0107.f7613(var297);
                        final SubLObject var7_325 = module0239.$g2446$.currentBinding(var290);
                        SubLObject var299 = module0148.$g2099$.currentBinding(var290);
                        try {
                            module0239.$g2446$.bind(var291, var290);
                            module0148.$g2099$.bind((SubLObject)$ic8$, var290);
                            final SubLObject var300 = (SubLObject)NIL;
                            if (NIL != module0158.f10010(var2, var297, var300)) {
                                final SubLObject var301 = module0158.f10011(var2, var297, var300);
                                SubLObject var302 = module0237.$g2444$.getDynamicValue(var290);
                                final SubLObject var303 = (SubLObject)NIL;
                                while (NIL == var302) {
                                    final SubLObject var304 = module0052.f3695(var301, var303);
                                    final SubLObject var305 = (SubLObject)makeBoolean(!var303.eql(var304));
                                    if (NIL != var305) {
                                        SubLObject var306 = (SubLObject)NIL;
                                        try {
                                            var306 = module0158.f10316(var304, (SubLObject)$ic9$, var292, (SubLObject)NIL);
                                            SubLObject var50_326 = module0237.$g2444$.getDynamicValue(var290);
                                            final SubLObject var51_327 = (SubLObject)NIL;
                                            while (NIL == var50_326) {
                                                final SubLObject var307 = module0052.f3695(var306, var51_327);
                                                final SubLObject var53_328 = (SubLObject)makeBoolean(!var51_327.eql(var307));
                                                if (NIL != var53_328 && (NIL == assertion_handles_oc.f11035(var307) || NIL != module0130.f8509(module0178.f11293(var307), var293))) {
                                                    final SubLObject var308 = module0205.f13134(var307, var298, (SubLObject)UNPROVIDED);
                                                    final SubLObject var309 = var307;
                                                    if (NIL != module0241.f15631(var1, var308, (SubLObject)UNPROVIDED)) {
                                                        final SubLObject var310 = f17519(var1, (SubLObject)ConsesLow.cons(var309, var141));
                                                        if (NIL == module0237.$g2444$.getDynamicValue(var290)) {
                                                            SubLObject var17_329 = module0333.f22440(var310);
                                                            SubLObject var311 = (SubLObject)NIL;
                                                            var311 = var17_329.first();
                                                            while (NIL == module0237.$g2444$.getDynamicValue(var290) && NIL != var17_329) {
                                                                module0134.f8795(var1, var311, (SubLObject)$ic55$);
                                                                if (NIL != module0132.f8596(var311)) {
                                                                    module0237.$g2444$.setDynamicValue((SubLObject)T, var290);
                                                                }
                                                                var17_329 = var17_329.rest();
                                                                var311 = var17_329.first();
                                                            }
                                                        }
                                                    }
                                                    else if (NIL != f17549(var1, var309)) {
                                                        module0056.f4149((SubLObject)ConsesLow.list(var308, (SubLObject)ConsesLow.cons(var309, var141)), var289);
                                                    }
                                                }
                                                var50_326 = (SubLObject)makeBoolean(NIL == var53_328 || NIL != module0237.$g2444$.getDynamicValue(var290));
                                            }
                                        }
                                        finally {
                                            final SubLObject var7_326 = Threads.$is_thread_performing_cleanupP$.currentBinding(var290);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var290);
                                                if (NIL != var306) {
                                                    module0158.f10319(var306);
                                                }
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var7_326, var290);
                                            }
                                        }
                                    }
                                    var302 = (SubLObject)makeBoolean(NIL == var305 || NIL != module0237.$g2444$.getDynamicValue(var290));
                                }
                            }
                        }
                        finally {
                            module0148.$g2099$.rebind(var299, var290);
                            module0239.$g2446$.rebind(var7_325, var290);
                        }
                        if (NIL != module0134.f8807()) {
                            final SubLObject var7_327 = module0134.$g1584$.currentBinding(var290);
                            var299 = module0239.$g2446$.currentBinding(var290);
                            final SubLObject var312 = module0148.$g2099$.currentBinding(var290);
                            try {
                                module0134.$g1584$.bind((SubLObject)T, var290);
                                module0239.$g2446$.bind(var291, var290);
                                module0148.$g2099$.bind((SubLObject)$ic8$, var290);
                                final SubLObject var313 = (SubLObject)NIL;
                                if (NIL != module0158.f10010(var2, var298, var313)) {
                                    final SubLObject var314 = module0158.f10011(var2, var298, var313);
                                    SubLObject var315 = module0237.$g2444$.getDynamicValue(var290);
                                    final SubLObject var316 = (SubLObject)NIL;
                                    while (NIL == var315) {
                                        final SubLObject var317 = module0052.f3695(var314, var316);
                                        final SubLObject var318 = (SubLObject)makeBoolean(!var316.eql(var317));
                                        if (NIL != var318) {
                                            SubLObject var319 = (SubLObject)NIL;
                                            try {
                                                var319 = module0158.f10316(var317, (SubLObject)$ic9$, var292, (SubLObject)NIL);
                                                SubLObject var50_327 = module0237.$g2444$.getDynamicValue(var290);
                                                final SubLObject var51_328 = (SubLObject)NIL;
                                                while (NIL == var50_327) {
                                                    final SubLObject var320 = module0052.f3695(var319, var51_328);
                                                    final SubLObject var53_329 = (SubLObject)makeBoolean(!var51_328.eql(var320));
                                                    if (NIL != var53_329 && (NIL == assertion_handles_oc.f11035(var320) || NIL != module0130.f8509(module0178.f11293(var320), var293))) {
                                                        final SubLObject var321 = module0205.f13134(var320, var297, (SubLObject)UNPROVIDED);
                                                        final SubLObject var322 = var320;
                                                        if (NIL != module0241.f15631(var1, var321, (SubLObject)UNPROVIDED)) {
                                                            final SubLObject var323 = f17519(var1, (SubLObject)ConsesLow.cons(var322, var141));
                                                            if (NIL == module0237.$g2444$.getDynamicValue(var290)) {
                                                                SubLObject var17_330 = module0333.f22440(var323);
                                                                SubLObject var324 = (SubLObject)NIL;
                                                                var324 = var17_330.first();
                                                                while (NIL == module0237.$g2444$.getDynamicValue(var290) && NIL != var17_330) {
                                                                    module0134.f8795(var1, var324, (SubLObject)$ic55$);
                                                                    if (NIL != module0132.f8596(var324)) {
                                                                        module0237.$g2444$.setDynamicValue((SubLObject)T, var290);
                                                                    }
                                                                    var17_330 = var17_330.rest();
                                                                    var324 = var17_330.first();
                                                                }
                                                            }
                                                        }
                                                        else if (NIL != f17549(var1, var322)) {
                                                            module0056.f4149((SubLObject)ConsesLow.list(var321, (SubLObject)ConsesLow.cons(var322, var141)), var289);
                                                        }
                                                    }
                                                    var50_327 = (SubLObject)makeBoolean(NIL == var53_329 || NIL != module0237.$g2444$.getDynamicValue(var290));
                                                }
                                            }
                                            finally {
                                                final SubLObject var7_328 = Threads.$is_thread_performing_cleanupP$.currentBinding(var290);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var290);
                                                    if (NIL != var319) {
                                                        module0158.f10319(var319);
                                                    }
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var7_328, var290);
                                                }
                                            }
                                        }
                                        var315 = (SubLObject)makeBoolean(NIL == var318 || NIL != module0237.$g2444$.getDynamicValue(var290));
                                    }
                                }
                            }
                            finally {
                                module0148.$g2099$.rebind(var312, var290);
                                module0239.$g2446$.rebind(var299, var290);
                                module0134.$g1584$.rebind(var7_327, var290);
                            }
                        }
                        var295 = var295.rest();
                        var296 = var295.first();
                    }
                }
            }
            finally {
                module0134.$g1584$.rebind(var294, var290);
            }
        }
        return var289;
    }
    
    public static SubLObject f17548(final SubLObject var1, final SubLObject var141) {
        SubLObject var142 = (SubLObject)NIL;
        if (NIL == var142) {
            SubLObject var143 = var141;
            SubLObject var144 = (SubLObject)NIL;
            var144 = var143.first();
            while (NIL == var142 && NIL != var143) {
                if (NIL == f17549(var1, var144)) {
                    var142 = (SubLObject)T;
                }
                var143 = var143.rest();
                var144 = var143.first();
            }
        }
        return (SubLObject)makeBoolean(NIL == var142);
    }
    
    public static SubLObject f17549(final SubLObject var1, final SubLObject var34) {
        if (NIL != assertion_handles_oc.f11035(var34)) {
            final SubLObject var35 = module0178.f11287(var34);
            final SubLObject var36 = module0134.f8743(var1);
            return (SubLObject)makeBoolean(NIL == module0035.f2171(var35, var36) && NIL == module0262.f17343(var35, var36, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f17550() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0266", "f17496", "S#10889", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0266", "f17497", "S#20033", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0266", "f17502", "S#20034", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0266", "f17503", "S#20035", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0266", "f17506", "S#20036", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0266", "f17507", "S#20037", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0266", "f17500", "S#20038", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0266", "f17504", "S#20039", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0266", "f17501", "S#20040", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0266", "f17505", "S#20041", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0266", "f17509", "S#20042", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0266", "f17508", "S#20043", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0266", "f17512", "S#20044", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0266", "f17513", "S#20045", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0266", "f17510", "S#20046", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0266", "f17514", "S#20047", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0266", "f17517", "S#20048", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0266", "f17515", "S#20049", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0266", "f17516", "S#20050", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0266", "f17511", "S#20051", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0266", "f17518", "S#20052", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0266", "f17519", "S#20053", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0266", "f17499", "S#20054", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0266", "f17520", "S#20055", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0266", "f17498", "S#20056", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0266", "f17521", "S#20057", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0266", "f17522", "S#20058");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0266", "f17523", "S#20059", 3, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0266", "f17525", "S#20060", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0266", "f17524", "S#20061", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0266", "f17526", "S#20062", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0266", "f17527", "S#20028", 1, 0, false);
        new $f17527$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0266", "f17528", "S#20029", 1, 0, false);
        new $f17528$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0266", "f17529", "S#20030", 1, 0, false);
        new $f17529$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0266", "f17530", "S#20063", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0266", "f17531", "S#20064", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0266", "f17532", "S#20065", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0266", "f17533", "S#20066", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0266", "f17534", "S#20067", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0266", "f17535", "S#20068", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0266", "f17536", "S#20069", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0266", "f17537", "S#20070", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0266", "f17538", "S#20071", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0266", "f17539", "S#20072", 5, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0266", "f17540", "S#20073", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0266", "f17541", "S#20074", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0266", "f17542", "S#20075", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0266", "f17543", "S#20076", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0266", "f17544", "S#20077", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0266", "f17545", "S#20078", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0266", "f17546", "S#20079", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0266", "f17547", "S#20080", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0266", "f17548", "S#20081", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0266", "f17549", "S#20082", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17551() {
        $g2525$ = SubLFiles.defparameter("S#20083", (SubLObject)$ic2$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17552() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f17550();
    }
    
    public void initializeVariables() {
        f17551();
    }
    
    public void runTopLevelForms() {
        f17552();
    }
    
    static {
        me = (SubLFile)new module0266();
        $g2525$ = null;
        $ic0$ = makeString("Unsupported search behavior. ~%~% ~A ~%");
        $ic1$ = makeString("Unsupported search conditions.");
        $ic2$ = makeInteger(24);
        $ic3$ = makeSymbol("S#10926", "CYC");
        $ic4$ = makeSymbol("S#10928", "CYC");
        $ic5$ = makeString("~A is neither SET-P nor LISTP.");
        $ic6$ = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic7$ = makeKeyword("TRUE-DEF");
        $ic8$ = makeSymbol("S#12336", "CYC");
        $ic9$ = makeKeyword("GAF");
        $ic10$ = makeKeyword("STACK");
        $ic11$ = makeKeyword("QUEUE");
        $ic12$ = constant_handles_oc.f8479((SubLObject)makeString("genlPreds"));
        $ic13$ = makeKeyword("GENLPREDS");
        $ic14$ = constant_handles_oc.f8479((SubLObject)makeString("genlInverse"));
        $ic15$ = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic16$ = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { makeSymbol("S#13149", "CYC"), makeSymbol("S#155", "CYC"), makeSymbol("S#9182", "CYC"), makeSymbol("S#5432", "CYC"), makeSymbol("&KEY"), makeSymbol("S#11445", "CYC"), makeSymbol("S#10995", "CYC"), makeSymbol("S#127", "CYC"), ConsesLow.list((SubLObject)makeSymbol("S#7779", "CYC"), (SubLObject)makeKeyword("DEPTH-FIRST")) }), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic17$ = ConsesLow.list((SubLObject)makeKeyword("MT"), (SubLObject)makeKeyword("TV"), (SubLObject)makeKeyword("DONE"), (SubLObject)makeKeyword("ORDER"));
        $ic18$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic19$ = makeKeyword("MT");
        $ic20$ = makeKeyword("TV");
        $ic21$ = makeKeyword("DONE");
        $ic22$ = makeKeyword("ORDER");
        $ic23$ = makeKeyword("DEPTH-FIRST");
        $ic24$ = makeUninternedSymbol("US#2A76813");
        $ic25$ = makeSymbol("CLET");
        $ic26$ = makeSymbol("S#20059", "CYC");
        $ic27$ = makeSymbol("S#5129", "CYC");
        $ic28$ = makeKeyword("BREADTH-FIRST");
        $ic29$ = makeKeyword("PREDICATES");
        $ic30$ = makeKeyword("TYPE");
        $ic31$ = makeKeyword("TRANSITIVE-REASONING");
        $ic32$ = makeKeyword("DIRECTION");
        $ic33$ = makeKeyword("MARKING");
        $ic34$ = makeKeyword("SIMPLE");
        $ic35$ = makeKeyword("MARKING-SPACE");
        $ic36$ = makeSymbol("S#20028", "CYC");
        $ic37$ = makeSymbol("S#20029", "CYC");
        $ic38$ = makeSymbol("S#20030", "CYC");
        $ic39$ = makeKeyword("START");
        $ic40$ = ConsesLow.list((SubLObject)makeSymbol("SEARCH"), (SubLObject)makeSymbol("S#20084", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"));
        $ic41$ = makeKeyword("BACKWARD");
        $ic42$ = makeKeyword("FORWARD");
        $ic43$ = makeKeyword("GOAL-SEARCH-P");
        $ic44$ = makeKeyword("GOAL");
        $ic45$ = makeKeyword("GOAL-SPACE");
        $ic46$ = ConsesLow.list((SubLObject)makeKeyword("MAP-FN"), (SubLObject)makeSymbol("S#18384", "CYC"));
        $ic47$ = makeKeyword("GOAL-FN");
        $ic48$ = makeSymbol("S#18395", "CYC");
        $ic49$ = makeKeyword("MAP-FN");
        $ic50$ = makeKeyword("REFLEXIVE");
        $ic51$ = ConsesLow.list((SubLObject)makeKeyword("JUSTIFY?"), (SubLObject)T);
        $ic52$ = ConsesLow.list((SubLObject)makeSymbol("S#9182", "CYC"), (SubLObject)makeSymbol("S#14510", "CYC"));
        $ic53$ = makeSymbol("S#12275", "CYC");
        $ic54$ = constant_handles_oc.f8479((SubLObject)makeString("InferencePSC"));
        $ic55$ = makeSymbol("HLMT-EQUAL");
    }
    
    public static final class $f17527$UnaryFunction extends UnaryFunction
    {
        public $f17527$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#20028"));
        }
        
        public SubLObject processItem(final SubLObject var274) {
            return f17527(var274);
        }
    }
    
    public static final class $f17528$UnaryFunction extends UnaryFunction
    {
        public $f17528$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#20029"));
        }
        
        public SubLObject processItem(final SubLObject var274) {
            return f17528(var274);
        }
    }
    
    public static final class $f17529$UnaryFunction extends UnaryFunction
    {
        public $f17529$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#20030"));
        }
        
        public SubLObject processItem(final SubLObject var274) {
            return f17529(var274);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 3983 ms
	
	Decompiled with Procyon 0.5.32.
*/