package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0258 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0258";
    public static final String myFingerPrint = "5ff939e3c4ae68efa87b7c1431d11e8ce4b206dd6e8d126224faae579982db4a";
    public static SubLSymbol $g2487$;
    public static SubLSymbol $g2488$;
    public static SubLSymbol $g2489$;
    private static SubLSymbol $g2490$;
    private static SubLSymbol $g2491$;
    private static SubLSymbol $g2492$;
    private static SubLSymbol $g2493$;
    private static SubLSymbol $g2494$;
    private static SubLSymbol $g2495$;
    private static SubLSymbol $g2496$;
    private static SubLSymbol $g2497$;
    private static SubLSymbol $g2498$;
    public static SubLSymbol $g2499$;
    public static SubLSymbol $g2500$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLString $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLString $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLString $ic12$;
    private static final SubLObject $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLObject $ic16$;
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
    private static final SubLInteger $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLObject $ic33$;
    private static final SubLObject $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLObject $ic39$;
    private static final SubLList $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    
    public static SubLObject f16731() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g2489$.getDynamicValue(var1);
    }
    
    public static SubLObject f16732(final SubLObject var2) {
        return (NIL != module0018.f981()) ? module0269.f17799(var2) : module0269.f17796(var2);
    }
    
    public static SubLObject f16733(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.list((SubLObject)$ic0$, (SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic0$, (SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic0$, (SubLObject)$ic3$, (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)$ic4$, ConsesLow.append(var7, (SubLObject)NIL)))));
    }
    
    public static SubLObject f16734(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.list((SubLObject)$ic0$, (SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic0$, (SubLObject)$ic1$, (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)$ic3$, ConsesLow.append(var7, (SubLObject)NIL))));
    }
    
    public static SubLObject f16735(final SubLObject var10, final SubLObject var11, SubLObject var12, SubLObject var13) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        final SubLObject var17 = var12;
        final SubLObject var18 = module0147.$g2095$.currentBinding(var14);
        final SubLObject var19 = module0147.$g2094$.currentBinding(var14);
        final SubLObject var20 = module0147.$g2096$.currentBinding(var14);
        try {
            module0147.$g2095$.bind(module0147.f9545(var17), var14);
            module0147.$g2094$.bind(module0147.f9546(var17), var14);
            module0147.$g2096$.bind(module0147.f9549(var17), var14);
            final SubLObject var21 = var13;
            final SubLObject var17_21 = module0141.$g1714$.currentBinding(var14);
            final SubLObject var18_22 = module0141.$g1715$.currentBinding(var14);
            try {
                module0141.$g1714$.bind((NIL != var21) ? var21 : module0141.f9283(), var14);
                module0141.$g1715$.bind((SubLObject)((NIL != var21) ? $ic5$ : module0141.$g1715$.getDynamicValue(var14)), var14);
                if (NIL != var21 && NIL != module0136.f8864() && NIL == module0141.f9279(var21)) {
                    final SubLObject var22 = module0136.$g1591$.getDynamicValue(var14);
                    if (var22.eql((SubLObject)$ic6$)) {
                        module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic7$, var21, (SubLObject)$ic8$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    else if (var22.eql((SubLObject)$ic9$)) {
                        module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic10$, (SubLObject)$ic7$, var21, (SubLObject)$ic8$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    else if (var22.eql((SubLObject)$ic11$)) {
                        Errors.warn((SubLObject)$ic7$, var21, (SubLObject)$ic8$);
                    }
                    else {
                        Errors.warn((SubLObject)$ic12$, module0136.$g1591$.getDynamicValue(var14));
                        Errors.cerror((SubLObject)$ic10$, (SubLObject)$ic7$, var21, (SubLObject)$ic8$);
                    }
                }
                final SubLObject var17_22 = $g2490$.currentBinding(var14);
                try {
                    $g2490$.bind(module0139.f9007(), var14);
                    final SubLObject var17_23 = $g2491$.currentBinding(var14);
                    try {
                        $g2491$.bind(module0139.f9007(), var14);
                        final SubLObject var17_24 = $g2492$.currentBinding(var14);
                        try {
                            $g2492$.bind(module0139.f9007(), var14);
                            final SubLObject var17_25 = $g2493$.currentBinding(var14);
                            try {
                                $g2493$.bind(module0139.f9007(), var14);
                                f16736(var10, var11);
                                final SubLObject var17_26 = module0141.$g1670$.currentBinding(var14);
                                final SubLObject var18_23 = module0141.$g1671$.currentBinding(var14);
                                final SubLObject var19_30 = module0141.$g1672$.currentBinding(var14);
                                SubLObject var23 = module0141.$g1674$.currentBinding(var14);
                                SubLObject var24 = module0137.$g1605$.currentBinding(var14);
                                SubLObject var25 = module0141.$g1665$.currentBinding(var14);
                                SubLObject var26 = module0139.$g1648$.currentBinding(var14);
                                try {
                                    module0141.$g1670$.bind(module0137.f8955($ic13$), var14);
                                    module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic13$)), var14);
                                    module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic13$)), var14);
                                    module0141.$g1674$.bind((SubLObject)NIL, var14);
                                    module0137.$g1605$.bind(module0137.f8955($ic13$), var14);
                                    module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var14);
                                    module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var14)), var14);
                                    var16 = (SubLObject)makeBoolean(NIL != module0249.f16059(var10, $g2491$.getDynamicValue(var14)) || NIL != module0249.f16059(var11, $g2490$.getDynamicValue(var14)));
                                }
                                finally {
                                    module0139.$g1648$.rebind(var26, var14);
                                    module0141.$g1665$.rebind(var25, var14);
                                    module0137.$g1605$.rebind(var24, var14);
                                    module0141.$g1674$.rebind(var23, var14);
                                    module0141.$g1672$.rebind(var19_30, var14);
                                    module0141.$g1671$.rebind(var18_23, var14);
                                    module0141.$g1670$.rebind(var17_26, var14);
                                }
                                if (NIL == var16) {
                                    if (NIL != $g2487$.getDynamicValue(var14)) {
                                        final SubLObject var17_27 = module0141.$g1670$.currentBinding(var14);
                                        final SubLObject var18_24 = module0141.$g1671$.currentBinding(var14);
                                        final SubLObject var19_31 = module0141.$g1672$.currentBinding(var14);
                                        var23 = module0141.$g1674$.currentBinding(var14);
                                        var24 = module0137.$g1605$.currentBinding(var14);
                                        var25 = module0141.$g1665$.currentBinding(var14);
                                        var26 = module0139.$g1648$.currentBinding(var14);
                                        try {
                                            module0141.$g1670$.bind(module0137.f8955($ic13$), var14);
                                            module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic13$)), var14);
                                            module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic13$)), var14);
                                            module0141.$g1674$.bind((SubLObject)NIL, var14);
                                            module0137.$g1605$.bind(module0137.f8955($ic13$), var14);
                                            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var14);
                                            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var14)), var14);
                                            if (NIL == var16) {
                                                SubLObject var27 = (SubLObject)NIL;
                                                try {
                                                    var14.throwStack.push($ic14$);
                                                    final SubLObject var28 = $g2491$.getDynamicValue(var14);
                                                    SubLObject var29 = (SubLObject)NIL;
                                                    SubLObject var30 = (SubLObject)NIL;
                                                    final Iterator var31 = Hashtables.getEntrySetIterator(var28);
                                                    try {
                                                        while (Hashtables.iteratorHasNext(var31)) {
                                                            final Map.Entry var32 = Hashtables.iteratorNextEntry(var31);
                                                            var29 = Hashtables.getEntryKey(var32);
                                                            var30 = Hashtables.getEntryValue(var32);
                                                            module0005.f153(var16);
                                                            final SubLObject var33 = f16737(var29, (SubLObject)UNPROVIDED);
                                                            if (NIL == var16) {
                                                                SubLObject var34 = var33;
                                                                SubLObject var35 = (SubLObject)NIL;
                                                                var35 = var34.first();
                                                                while (NIL == var16 && NIL != var34) {
                                                                    if (NIL != module0249.f16059(var35, $g2490$.getDynamicValue(var14))) {
                                                                        var16 = (SubLObject)T;
                                                                    }
                                                                    var34 = var34.rest();
                                                                    var35 = var34.first();
                                                                }
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        Hashtables.releaseEntrySetIterator(var31);
                                                    }
                                                }
                                                catch (Throwable var36) {
                                                    var27 = Errors.handleThrowable(var36, (SubLObject)$ic14$);
                                                }
                                                finally {
                                                    var14.throwStack.pop();
                                                }
                                            }
                                        }
                                        finally {
                                            module0139.$g1648$.rebind(var26, var14);
                                            module0141.$g1665$.rebind(var25, var14);
                                            module0137.$g1605$.rebind(var24, var14);
                                            module0141.$g1674$.rebind(var23, var14);
                                            module0141.$g1672$.rebind(var19_31, var14);
                                            module0141.$g1671$.rebind(var18_24, var14);
                                            module0141.$g1670$.rebind(var17_27, var14);
                                        }
                                    }
                                    if (NIL == var16) {
                                        var15 = f16738(var11);
                                        if (NIL == var15) {
                                            var15 = f16739(var10);
                                        }
                                    }
                                }
                                module0139.f9011($g2493$.getDynamicValue(var14));
                            }
                            finally {
                                $g2493$.rebind(var17_25, var14);
                            }
                            module0139.f9011($g2492$.getDynamicValue(var14));
                        }
                        finally {
                            $g2492$.rebind(var17_24, var14);
                        }
                        module0139.f9011($g2491$.getDynamicValue(var14));
                    }
                    finally {
                        $g2491$.rebind(var17_23, var14);
                    }
                    module0139.f9011($g2490$.getDynamicValue(var14));
                }
                finally {
                    $g2490$.rebind(var17_22, var14);
                }
            }
            finally {
                module0141.$g1715$.rebind(var18_22, var14);
                module0141.$g1714$.rebind(var17_21, var14);
            }
        }
        finally {
            module0147.$g2096$.rebind(var20, var14);
            module0147.$g2094$.rebind(var19, var14);
            module0147.$g2095$.rebind(var18, var14);
        }
        return var15;
    }
    
    public static SubLObject f16740(SubLObject var48, final SubLObject var11, SubLObject var12, SubLObject var13) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLThread var49 = SubLProcess.currentSubLThread();
        SubLObject var50 = (SubLObject)NIL;
        SubLObject var51 = (SubLObject)NIL;
        SubLObject var52 = (SubLObject)NIL;
        final SubLObject var53 = var12;
        final SubLObject var54 = module0147.$g2095$.currentBinding(var49);
        final SubLObject var55 = module0147.$g2094$.currentBinding(var49);
        final SubLObject var56 = module0147.$g2096$.currentBinding(var49);
        try {
            module0147.$g2095$.bind(module0147.f9545(var53), var49);
            module0147.$g2094$.bind(module0147.f9546(var53), var49);
            module0147.$g2096$.bind(module0147.f9549(var53), var49);
            final SubLObject var57 = var13;
            final SubLObject var17_50 = module0141.$g1714$.currentBinding(var49);
            final SubLObject var18_51 = module0141.$g1715$.currentBinding(var49);
            try {
                module0141.$g1714$.bind((NIL != var57) ? var57 : module0141.f9283(), var49);
                module0141.$g1715$.bind((SubLObject)((NIL != var57) ? $ic5$ : module0141.$g1715$.getDynamicValue(var49)), var49);
                if (NIL != var57 && NIL != module0136.f8864() && NIL == module0141.f9279(var57)) {
                    final SubLObject var58 = module0136.$g1591$.getDynamicValue(var49);
                    if (var58.eql((SubLObject)$ic6$)) {
                        module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic7$, var57, (SubLObject)$ic8$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    else if (var58.eql((SubLObject)$ic9$)) {
                        module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic10$, (SubLObject)$ic7$, var57, (SubLObject)$ic8$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    else if (var58.eql((SubLObject)$ic11$)) {
                        Errors.warn((SubLObject)$ic7$, var57, (SubLObject)$ic8$);
                    }
                    else {
                        Errors.warn((SubLObject)$ic12$, module0136.$g1591$.getDynamicValue(var49));
                        Errors.cerror((SubLObject)$ic10$, (SubLObject)$ic7$, var57, (SubLObject)$ic8$);
                    }
                }
                final SubLObject var17_51 = $g2490$.currentBinding(var49);
                try {
                    $g2490$.bind(module0139.f9007(), var49);
                    final SubLObject var17_52 = $g2491$.currentBinding(var49);
                    try {
                        $g2491$.bind(module0139.f9007(), var49);
                        final SubLObject var17_53 = $g2492$.currentBinding(var49);
                        try {
                            $g2492$.bind(module0139.f9007(), var49);
                            final SubLObject var17_54 = $g2493$.currentBinding(var49);
                            try {
                                $g2493$.bind(module0139.f9007(), var49);
                                var48 = f16741(var48, var11);
                                if (NIL == var48) {
                                    var52 = (SubLObject)T;
                                }
                                if (NIL == var52) {
                                    if (NIL != $g2487$.getDynamicValue(var49)) {
                                        final SubLObject var17_55 = module0141.$g1670$.currentBinding(var49);
                                        final SubLObject var18_52 = module0141.$g1671$.currentBinding(var49);
                                        final SubLObject var19_58 = module0141.$g1672$.currentBinding(var49);
                                        final SubLObject var59 = module0141.$g1674$.currentBinding(var49);
                                        final SubLObject var60 = module0137.$g1605$.currentBinding(var49);
                                        final SubLObject var61 = module0141.$g1665$.currentBinding(var49);
                                        final SubLObject var62 = module0139.$g1648$.currentBinding(var49);
                                        try {
                                            module0141.$g1670$.bind(module0137.f8955($ic13$), var49);
                                            module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic13$)), var49);
                                            module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic13$)), var49);
                                            module0141.$g1674$.bind((SubLObject)NIL, var49);
                                            module0137.$g1605$.bind(module0137.f8955($ic13$), var49);
                                            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var49);
                                            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var49)), var49);
                                            if (NIL == var52) {
                                                SubLObject var63 = (SubLObject)NIL;
                                                try {
                                                    var49.throwStack.push($ic14$);
                                                    final SubLObject var64 = $g2491$.getDynamicValue(var49);
                                                    SubLObject var65 = (SubLObject)NIL;
                                                    SubLObject var66 = (SubLObject)NIL;
                                                    final Iterator var67 = Hashtables.getEntrySetIterator(var64);
                                                    try {
                                                        while (Hashtables.iteratorHasNext(var67)) {
                                                            final Map.Entry var68 = Hashtables.iteratorNextEntry(var67);
                                                            var65 = Hashtables.getEntryKey(var68);
                                                            var66 = Hashtables.getEntryValue(var68);
                                                            module0005.f153(var52);
                                                            final SubLObject var69 = f16737(var65, (SubLObject)UNPROVIDED);
                                                            if (NIL == var52) {
                                                                SubLObject var70 = var69;
                                                                SubLObject var71 = (SubLObject)NIL;
                                                                var71 = var70.first();
                                                                while (NIL == var52 && NIL != var70) {
                                                                    if (NIL != module0249.f16059(var71, $g2490$.getDynamicValue(var49))) {
                                                                        var52 = (SubLObject)T;
                                                                    }
                                                                    var70 = var70.rest();
                                                                    var71 = var70.first();
                                                                }
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        Hashtables.releaseEntrySetIterator(var67);
                                                    }
                                                }
                                                catch (Throwable var72) {
                                                    var63 = Errors.handleThrowable(var72, (SubLObject)$ic14$);
                                                }
                                                finally {
                                                    var49.throwStack.pop();
                                                }
                                            }
                                        }
                                        finally {
                                            module0139.$g1648$.rebind(var62, var49);
                                            module0141.$g1665$.rebind(var61, var49);
                                            module0137.$g1605$.rebind(var60, var49);
                                            module0141.$g1674$.rebind(var59, var49);
                                            module0141.$g1672$.rebind(var19_58, var49);
                                            module0141.$g1671$.rebind(var18_52, var49);
                                            module0141.$g1670$.rebind(var17_55, var49);
                                        }
                                    }
                                    if (NIL == var52) {
                                        var50 = f16738(var11);
                                        if (NIL == var50) {
                                            var49.resetMultipleValues();
                                            final SubLObject var59_60 = f16742(var48);
                                            final SubLObject var61_62 = var49.secondMultipleValue();
                                            var49.resetMultipleValues();
                                            var50 = var59_60;
                                            var51 = var61_62;
                                        }
                                    }
                                }
                                module0139.f9011($g2493$.getDynamicValue(var49));
                            }
                            finally {
                                $g2493$.rebind(var17_54, var49);
                            }
                            module0139.f9011($g2492$.getDynamicValue(var49));
                        }
                        finally {
                            $g2492$.rebind(var17_53, var49);
                        }
                        module0139.f9011($g2491$.getDynamicValue(var49));
                    }
                    finally {
                        $g2491$.rebind(var17_52, var49);
                    }
                    module0139.f9011($g2490$.getDynamicValue(var49));
                }
                finally {
                    $g2490$.rebind(var17_51, var49);
                }
            }
            finally {
                module0141.$g1715$.rebind(var18_51, var49);
                module0141.$g1714$.rebind(var17_50, var49);
            }
        }
        finally {
            module0147.$g2096$.rebind(var56, var49);
            module0147.$g2094$.rebind(var55, var49);
            module0147.$g2095$.rebind(var54, var49);
        }
        return Values.values(var50, var51);
    }
    
    public static SubLObject f16736(final SubLObject var10, final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        module0251.f16206(module0137.f8955($ic13$), var11, $g2491$.getDynamicValue(var12), (SubLObject)UNPROVIDED);
        final SubLObject var13 = module0139.$g1636$.currentBinding(var12);
        try {
            module0139.$g1636$.bind(module0139.f9007(), var12);
            module0252.f16271(module0137.f8955($ic13$), var10, (SubLObject)$ic15$, $g2490$.getDynamicValue(var12), (SubLObject)UNPROVIDED);
            module0139.f9011(module0139.$g1636$.getDynamicValue(var12));
        }
        finally {
            module0139.$g1636$.rebind(var13, var12);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16741(final SubLObject var48, final SubLObject var11) {
        final SubLThread var49 = SubLProcess.currentSubLThread();
        module0251.f16206(module0137.f8955($ic13$), var11, $g2491$.getDynamicValue(var49), (SubLObject)UNPROVIDED);
        SubLObject var50 = (SubLObject)NIL;
        final SubLObject var51 = module0141.$g1670$.currentBinding(var49);
        final SubLObject var52 = module0141.$g1671$.currentBinding(var49);
        final SubLObject var53 = module0141.$g1672$.currentBinding(var49);
        final SubLObject var54 = module0141.$g1674$.currentBinding(var49);
        final SubLObject var55 = module0137.$g1605$.currentBinding(var49);
        final SubLObject var56 = module0141.$g1665$.currentBinding(var49);
        final SubLObject var57 = module0139.$g1648$.currentBinding(var49);
        final SubLObject var58 = module0139.$g1636$.currentBinding(var49);
        try {
            module0141.$g1670$.bind(module0137.f8955($ic13$), var49);
            module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic13$)), var49);
            module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic13$)), var49);
            module0141.$g1674$.bind((SubLObject)NIL, var49);
            module0137.$g1605$.bind(module0137.f8955($ic13$), var49);
            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var49);
            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var49)), var49);
            module0139.$g1636$.bind(module0139.f9007(), var49);
            SubLObject var59 = var48;
            SubLObject var60 = (SubLObject)NIL;
            var60 = var59.first();
            while (NIL != var59) {
                if (NIL == module0249.f16059(var60, $g2491$.getDynamicValue(var49)) && NIL == module0256.f16576(var60, var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    module0252.f16271(module0137.f8955($ic13$), var60, (SubLObject)$ic15$, $g2490$.getDynamicValue(var49), (SubLObject)UNPROVIDED);
                    var50 = (SubLObject)ConsesLow.cons(var60, var50);
                }
                var59 = var59.rest();
                var60 = var59.first();
            }
            module0139.f9011(module0139.$g1636$.getDynamicValue(var49));
        }
        finally {
            module0139.$g1636$.rebind(var58, var49);
            module0139.$g1648$.rebind(var57, var49);
            module0141.$g1665$.rebind(var56, var49);
            module0137.$g1605$.rebind(var55, var49);
            module0141.$g1674$.rebind(var54, var49);
            module0141.$g1672$.rebind(var53, var49);
            module0141.$g1671$.rebind(var52, var49);
            module0141.$g1670$.rebind(var51, var49);
        }
        return var50;
    }
    
    public static SubLObject f16743(final SubLObject var66) {
        final SubLThread var67 = SubLProcess.currentSubLThread();
        if (NIL == module0249.f16059(var66, $g2491$.getDynamicValue(var67))) {
            module0251.f16206(module0137.f8955($ic16$), var66, $g2492$.getDynamicValue(var67), (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16738(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = f16744(var11, (SubLObject)UNPROVIDED);
        SubLObject var16 = (SubLObject)NIL;
        var16 = var15.first();
        while (NIL != var15) {
            if (NIL != module0249.f16020(var16, $g2490$.getDynamicValue(var12))) {
                var14 = (SubLObject)ConsesLow.cons(var16, var14);
            }
            var15 = var15.rest();
            var16 = var15.first();
        }
        var13 = module0252.f16282(module0137.f8955($ic13$), var11, (SubLObject)$ic17$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != var14) {
            if (NIL != module0030.f1594($g2493$.getDynamicValue(var12))) {
                module0030.f1599(var13, var14, $g2493$.getDynamicValue(var12));
            }
            else {
                final SubLObject var17 = $g2493$.getDynamicValue(var12);
                SubLObject var18 = (SubLObject)NIL;
                SubLObject var19 = (SubLObject)NIL;
                final Iterator var20 = Hashtables.getEntrySetIterator(var17);
                try {
                    while (Hashtables.iteratorHasNext(var20)) {
                        final Map.Entry var21 = Hashtables.iteratorNextEntry(var20);
                        var18 = Hashtables.getEntryKey(var21);
                        var19 = Hashtables.getEntryValue(var21);
                        SubLObject var22 = (SubLObject)NIL;
                        SubLObject var23 = var19;
                        SubLObject var24 = (SubLObject)NIL;
                        var24 = var23.first();
                        while (NIL != var23) {
                            var22 = (SubLObject)ConsesLow.cons(conses_high.nunion(var24, var14, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var22);
                            var23 = var23.rest();
                            var24 = var23.first();
                        }
                        Hashtables.sethash(var18, $g2493$.getDynamicValue(var12), var22);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var20);
                }
            }
            return (SubLObject)NIL;
        }
        return var13;
    }
    
    public static SubLObject f16745(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        SubLObject var42 = (SubLObject)NIL;
        if (NIL == module0249.f16059(var40, $g2490$.getDynamicValue(var41))) {
            final SubLObject var43 = $g2494$.currentBinding(var41);
            try {
                $g2494$.bind(var40, var41);
                var42 = module0252.f16282(module0137.f8955($ic16$), var40, (SubLObject)$ic18$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            finally {
                $g2494$.rebind(var43, var41);
            }
            return var42;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16746(final SubLObject var69) {
        if (NIL != f16747(var69)) {
            return f16748(var69);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16749() {
        final SubLObject var72 = $g2495$.getGlobalValue();
        if (NIL != var72) {
            module0034.f1818(var72);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16750(final SubLObject var69) {
        return module0034.f1829($g2495$.getGlobalValue(), (SubLObject)ConsesLow.list(var69), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f16751(final SubLObject var69) {
        return f16747(var69);
    }
    
    public static SubLObject f16752(final SubLObject var69) {
        SubLObject var70 = $g2495$.getGlobalValue();
        if (NIL == var70) {
            var70 = module0034.f1934((SubLObject)$ic19$, (SubLObject)$ic20$, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)ONE_INTEGER, (SubLObject)SIXTEEN_INTEGER);
        }
        SubLObject var71 = module0034.f1814(var70, var69, (SubLObject)$ic21$);
        if (var71 == $ic21$) {
            var71 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f16751(var69)));
            module0034.f1816(var70, var69, var71, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var71);
    }
    
    public static SubLObject f16747(final SubLObject var69) {
        final SubLThread var70 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL != module0249.f16059(var69, $g2492$.getDynamicValue(var70)) && NIL != f16732(var69));
    }
    
    public static SubLObject f16748(final SubLObject var69) {
        final SubLThread var70 = SubLProcess.currentSubLThread();
        final SubLObject var71 = f16744($g2494$.getDynamicValue(var70), (SubLObject)UNPROVIDED);
        SubLObject var72 = (SubLObject)NIL;
        SubLObject var73 = var71;
        SubLObject var74 = (SubLObject)NIL;
        var74 = var73.first();
        while (NIL != var73) {
            if (NIL != module0249.f16059(var74, $g2490$.getDynamicValue(var70))) {
                var72 = (SubLObject)ConsesLow.cons(var74, var72);
            }
            var73 = var73.rest();
            var74 = var73.first();
        }
        if (NIL != var72) {
            module0030.f1599(var69, var72, $g2493$.getDynamicValue(var70));
            return (SubLObject)NIL;
        }
        return var69;
    }
    
    public static SubLObject f16739(final SubLObject var10) {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        SubLObject var12 = (SubLObject)NIL;
        if (NIL == var12) {
            SubLObject var13 = (SubLObject)NIL;
            try {
                var11.throwStack.push($ic14$);
                final SubLObject var14 = $g2493$.getDynamicValue(var11);
                SubLObject var15 = (SubLObject)NIL;
                SubLObject var16 = (SubLObject)NIL;
                final Iterator var17 = Hashtables.getEntrySetIterator(var14);
                try {
                    while (Hashtables.iteratorHasNext(var17)) {
                        final Map.Entry var18 = Hashtables.iteratorNextEntry(var17);
                        var15 = Hashtables.getEntryKey(var18);
                        var16 = Hashtables.getEntryValue(var18);
                        module0005.f153(var12);
                        if (NIL == var12) {
                            SubLObject var19 = var16;
                            SubLObject var20 = (SubLObject)NIL;
                            var20 = var19.first();
                            while (NIL == var12 && NIL != var19) {
                                if (NIL != f16753(var10, var15, var20)) {
                                    var12 = var15;
                                }
                                var19 = var19.rest();
                                var20 = var19.first();
                            }
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var17);
                }
            }
            catch (Throwable var21) {
                var13 = Errors.handleThrowable(var21, (SubLObject)$ic14$);
            }
            finally {
                var11.throwStack.pop();
            }
        }
        return var12;
    }
    
    public static SubLObject f16742(final SubLObject var48) {
        final SubLThread var49 = SubLProcess.currentSubLThread();
        SubLObject var50 = (SubLObject)NIL;
        SubLObject var51 = (SubLObject)NIL;
        if (NIL == var50) {
            SubLObject var52 = var48;
            SubLObject var53 = (SubLObject)NIL;
            var53 = var52.first();
            while (NIL == var50 && NIL != var52) {
                if (NIL == var50) {
                    SubLObject var54 = (SubLObject)NIL;
                    try {
                        var49.throwStack.push($ic14$);
                        final SubLObject var55 = $g2493$.getDynamicValue(var49);
                        SubLObject var56 = (SubLObject)NIL;
                        SubLObject var57 = (SubLObject)NIL;
                        final Iterator var58 = Hashtables.getEntrySetIterator(var55);
                        try {
                            while (Hashtables.iteratorHasNext(var58)) {
                                final Map.Entry var59 = Hashtables.iteratorNextEntry(var58);
                                var56 = Hashtables.getEntryKey(var59);
                                var57 = Hashtables.getEntryValue(var59);
                                module0005.f153(var50);
                                SubLObject var60 = var57;
                                SubLObject var61 = (SubLObject)NIL;
                                var61 = var60.first();
                                while (NIL != var60) {
                                    if (NIL != f16753(var53, var56, var61)) {
                                        var50 = var56;
                                        var51 = (SubLObject)ConsesLow.cons(var53, var51);
                                    }
                                    var60 = var60.rest();
                                    var61 = var60.first();
                                }
                            }
                        }
                        finally {
                            Hashtables.releaseEntrySetIterator(var58);
                        }
                    }
                    catch (Throwable var62) {
                        var54 = Errors.handleThrowable(var62, (SubLObject)$ic14$);
                    }
                    finally {
                        var49.throwStack.pop();
                    }
                }
                var52 = var52.rest();
                var53 = var52.first();
            }
        }
        return Values.values(var50, var51);
    }
    
    public static SubLObject f16753(final SubLObject var77, final SubLObject var78, final SubLObject var44) {
        final SubLThread var79 = SubLProcess.currentSubLThread();
        SubLObject var80 = (SubLObject)NIL;
        final SubLObject var81 = $g2490$.currentBinding(var79);
        try {
            $g2490$.bind(module0139.f9007(), var79);
            final SubLObject var17_79 = $g2490$.currentBinding(var79);
            try {
                $g2490$.bind(module0139.f9007(), var79);
                final SubLObject var17_80 = $g2492$.currentBinding(var79);
                try {
                    $g2492$.bind(module0139.f9007(), var79);
                    final SubLObject var17_81 = module0137.$g1605$.currentBinding(var79);
                    try {
                        module0137.$g1605$.bind(module0137.f8955($ic13$), var79);
                        module0249.f16082(var44, $g2490$.getDynamicValue(var79));
                        var80 = f16754(var77, var78);
                    }
                    finally {
                        module0137.$g1605$.rebind(var17_81, var79);
                    }
                    module0139.f9011($g2492$.getDynamicValue(var79));
                }
                finally {
                    $g2492$.rebind(var17_80, var79);
                }
                module0139.f9011($g2490$.getDynamicValue(var79));
            }
            finally {
                $g2490$.rebind(var17_79, var79);
            }
            module0139.f9011($g2490$.getDynamicValue(var79));
        }
        finally {
            $g2490$.rebind(var81, var79);
        }
        return var80;
    }
    
    public static SubLObject f16754(final SubLObject var77, final SubLObject var82) {
        final SubLThread var83 = SubLProcess.currentSubLThread();
        SubLObject var84 = (SubLObject)NIL;
        final SubLObject var85 = $g2496$.currentBinding(var83);
        try {
            $g2496$.bind(var82, var83);
            var84 = module0252.f16284(module0137.f8955($ic13$), var77, (SubLObject)$ic22$, $g2490$.getDynamicValue(var83), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            $g2496$.rebind(var85, var83);
        }
        return var84;
    }
    
    public static SubLObject f16755(final SubLObject var77) {
        final SubLThread var78 = SubLProcess.currentSubLThread();
        SubLObject var79 = (SubLObject)NIL;
        var79 = module0252.f16342(module0137.f8955($ic16$), var77, $g2496$.getDynamicValue(var78), $g2492$.getDynamicValue(var78), (SubLObject)UNPROVIDED);
        return var79;
    }
    
    public static SubLObject f16756(final SubLObject var2, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        return f16757(var2, var12);
    }
    
    public static SubLObject f16757(final SubLObject var2, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        final SubLThread var13 = SubLProcess.currentSubLThread();
        SubLObject var14 = (SubLObject)NIL;
        final SubLObject var15 = var12;
        final SubLObject var16 = module0147.$g2095$.currentBinding(var13);
        final SubLObject var17 = module0147.$g2094$.currentBinding(var13);
        final SubLObject var18 = module0147.$g2096$.currentBinding(var13);
        try {
            module0147.$g2095$.bind(module0147.f9545(var15), var13);
            module0147.$g2094$.bind(module0147.f9546(var15), var13);
            module0147.$g2096$.bind(module0147.f9549(var15), var13);
            var14 = f16758(var2);
        }
        finally {
            module0147.$g2096$.rebind(var18, var13);
            module0147.$g2094$.rebind(var17, var13);
            module0147.$g2095$.rebind(var16, var13);
        }
        return var14;
    }
    
    public static SubLObject f16759(final SubLObject var2, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        final SubLThread var13 = SubLProcess.currentSubLThread();
        SubLObject var14 = (SubLObject)NIL;
        final SubLObject var15 = var12;
        final SubLObject var16 = module0147.$g2095$.currentBinding(var13);
        final SubLObject var17 = module0147.$g2094$.currentBinding(var13);
        final SubLObject var18 = module0147.$g2096$.currentBinding(var13);
        try {
            module0147.$g2095$.bind(module0147.f9545(var15), var13);
            module0147.$g2094$.bind(module0147.f9546(var15), var13);
            module0147.$g2096$.bind(module0147.f9549(var15), var13);
            var14 = f16760(var2);
        }
        finally {
            module0147.$g2096$.rebind(var18, var13);
            module0147.$g2094$.rebind(var17, var13);
            module0147.$g2095$.rebind(var16, var13);
        }
        return var14;
    }
    
    public static SubLObject f16758(final SubLObject var2) {
        return module0256.f16538(f16760(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f16760(final SubLObject var2) {
        final SubLObject var3 = f16761(var2, (SubLObject)UNPROVIDED);
        SubLObject var4 = module0259.f16856(var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6;
        var4 = (var6 = module0256.f16569(var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        SubLObject var7 = (SubLObject)NIL;
        var7 = var6.first();
        while (NIL != var6) {
            if (NIL != f16735(var2, var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var5 = (SubLObject)ConsesLow.cons(var7, var5);
            }
            var6 = var6.rest();
            var7 = var6.first();
        }
        return var5;
    }
    
    public static SubLObject f16762(final SubLObject var2, final SubLObject var83, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        SubLObject var84 = (SubLObject)NIL;
        SubLObject var85 = module0256.f16531(var2, var12, (SubLObject)UNPROVIDED);
        SubLObject var86 = (SubLObject)NIL;
        var86 = var85.first();
        while (NIL != var85) {
            if (NIL != module0259.f16854(var86, var83, var12, (SubLObject)UNPROVIDED)) {
                var84 = (SubLObject)ConsesLow.cons(var86, var84);
            }
            var85 = var85.rest();
            var86 = var85.first();
        }
        return var84;
    }
    
    public static SubLObject f16763(final SubLObject var2, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        return f16764(var2, var12);
    }
    
    public static SubLObject f16764(final SubLObject var2, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        return module0256.f16538(f16761(var2, var12), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f16761(final SubLObject var2, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        final SubLThread var13 = SubLProcess.currentSubLThread();
        SubLObject var14 = (SubLObject)NIL;
        final SubLObject var15 = module0141.$g1691$.currentBinding(var13);
        try {
            module0141.$g1691$.bind((SubLObject)NIL, var13);
            try {
                final SubLObject var17_88 = module0139.$g1646$.currentBinding(var13);
                try {
                    module0139.$g1646$.bind(module0139.f9007(), var13);
                    module0256.f16585((SubLObject)$ic23$, var2, var12, (SubLObject)UNPROVIDED);
                    module0139.f9011(module0139.$g1646$.getDynamicValue(var13));
                }
                finally {
                    module0139.$g1646$.rebind(var17_88, var13);
                }
            }
            finally {
                final SubLObject var17_89 = Threads.$is_thread_performing_cleanupP$.currentBinding(var13);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var13);
                    var14 = module0141.$g1691$.getDynamicValue(var13);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var17_89, var13);
                }
            }
        }
        finally {
            module0141.$g1691$.rebind(var15, var13);
        }
        return var14;
    }
    
    public static SubLObject f16765(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0139.$g1635$.currentBinding(var3);
        final SubLObject var5 = module0139.$g1644$.currentBinding(var3);
        try {
            module0139.$g1635$.bind(module0139.$g1646$.getDynamicValue(var3), var3);
            module0139.$g1644$.bind((SubLObject)T, var3);
            module0259.f16852((SubLObject)$ic24$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0139.$g1644$.rebind(var5, var3);
            module0139.$g1635$.rebind(var4, var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16766(final SubLObject var90) {
        final SubLThread var91 = SubLProcess.currentSubLThread();
        if (NIL != f16732(var90)) {
            module0141.$g1691$.setDynamicValue((SubLObject)ConsesLow.cons(var90, module0141.$g1691$.getDynamicValue(var91)), var91);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16767(final SubLObject var2, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        return f16768(var2, module0147.f9552(var12));
    }
    
    public static SubLObject f16769() {
        final SubLObject var72 = $g2497$.getGlobalValue();
        if (NIL != var72) {
            module0034.f1818(var72);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16770(final SubLObject var2, final SubLObject var91) {
        return module0034.f1829($g2497$.getGlobalValue(), (SubLObject)ConsesLow.list(var2, var91), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f16771(final SubLObject var2, final SubLObject var91) {
        final SubLObject var92 = (SubLObject)((NIL != module0269.f17707(var91)) ? var91 : NIL);
        return module0259.f16861((SubLObject)$ic26$, var2, var92, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f16768(final SubLObject var2, final SubLObject var91) {
        SubLObject var92 = $g2497$.getGlobalValue();
        if (NIL == var92) {
            var92 = module0034.f1934((SubLObject)$ic25$, (SubLObject)$ic27$, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)TWO_INTEGER, (SubLObject)$ic28$);
        }
        final SubLObject var93 = module0034.f1782(var2, var91);
        final SubLObject var94 = module0034.f1814(var92, var93, (SubLObject)UNPROVIDED);
        if (var94 != $ic21$) {
            SubLObject var95 = var94;
            SubLObject var96 = (SubLObject)NIL;
            var96 = var95.first();
            while (NIL != var95) {
                SubLObject var97 = var96.first();
                final SubLObject var98 = conses_high.second(var96);
                if (var2.eql(var97.first())) {
                    var97 = var97.rest();
                    if (NIL != var97 && NIL == var97.rest() && var91.eql(var97.first())) {
                        return module0034.f1959(var98);
                    }
                }
                var95 = var95.rest();
                var96 = var95.first();
            }
        }
        final SubLObject var99 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f16771(var2, var91)));
        module0034.f1836(var92, var93, var94, var99, (SubLObject)ConsesLow.list(var2, var91));
        return module0034.f1959(var99);
    }
    
    public static SubLObject f16772(final SubLObject var99, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        SubLObject var100 = (SubLObject)NIL;
        SubLObject var101 = module0259.f16855(var99, var12, (SubLObject)UNPROVIDED);
        SubLObject var102 = (SubLObject)NIL;
        var102 = var101.first();
        while (NIL != var101) {
            if (NIL != f16732(var102)) {
                var100 = (SubLObject)ConsesLow.cons(var102, var100);
            }
            var101 = var101.rest();
            var102 = var101.first();
        }
        return var100;
    }
    
    public static SubLObject f16773(final SubLObject var2, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        return f16774(var2, var12);
    }
    
    public static SubLObject f16774(final SubLObject var2, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        if (NIL != module0210.f13593(var2, (SubLObject)UNPROVIDED)) {
            return f16774(module0172.f10921(var2), var12);
        }
        if (NIL != module0269.f17705(var2)) {
            return module0259.f16871((SubLObject)$ic26$, var2, var12, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16775(final SubLObject var2, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        final SubLThread var13 = SubLProcess.currentSubLThread();
        SubLObject var14 = (SubLObject)NIL;
        final SubLObject var15 = module0139.$g1635$.currentBinding(var13);
        try {
            module0139.$g1635$.bind(module0139.f9007(), var13);
            var14 = f16774(var2, var12);
            module0139.f9011(module0139.$g1635$.getDynamicValue(var13));
        }
        finally {
            module0139.$g1635$.rebind(var15, var13);
        }
        return var14;
    }
    
    public static SubLObject f16776(final SubLObject var2, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        if (NIL != module0210.f13593(var2, (SubLObject)UNPROVIDED)) {
            return f16774(module0172.f10921(var2), var12);
        }
        if (NIL != module0269.f17705(var2)) {
            return module0256.f16591(Symbols.symbol_function((SubLObject)$ic29$), var2, var12, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16777(final SubLObject var10, final SubLObject var11, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        final SubLThread var13 = SubLProcess.currentSubLThread();
        if (NIL != module0210.f13593(var10, (SubLObject)UNPROVIDED)) {
            return f16777(module0172.f10921(var10), var11, var12);
        }
        if (NIL != module0210.f13593(var11, (SubLObject)UNPROVIDED)) {
            return f16777(var10, module0172.f10921(var11), var12);
        }
        if (NIL == module0269.f17705(var10)) {
            return (SubLObject)NIL;
        }
        if (NIL == module0269.f17705(var11)) {
            return (SubLObject)NIL;
        }
        SubLObject var14 = (SubLObject)NIL;
        final SubLObject var15 = var12;
        final SubLObject var16 = module0147.$g2095$.currentBinding(var13);
        final SubLObject var17 = module0147.$g2094$.currentBinding(var13);
        final SubLObject var18 = module0147.$g2096$.currentBinding(var13);
        try {
            module0147.$g2095$.bind(module0147.f9545(var15), var13);
            module0147.$g2094$.bind(module0147.f9546(var15), var13);
            module0147.$g2096$.bind(module0147.f9549(var15), var13);
            var14 = f16778(var10, var11);
        }
        finally {
            module0147.$g2096$.rebind(var18, var13);
            module0147.$g2094$.rebind(var17, var13);
            module0147.$g2095$.rebind(var16, var13);
        }
        return var14;
    }
    
    public static SubLObject f16778(final SubLObject var10, final SubLObject var11) {
        if (NIL != f16731()) {
            return (SubLObject)NIL;
        }
        if (NIL == f16779(var10, var11, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        if (NIL != f16780(var10, var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        if (NIL != f16780(var11, var10, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        if (NIL != f16781(var10, var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f16782(final SubLObject var48, final SubLObject var11, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        final SubLThread var49 = SubLProcess.currentSubLThread();
        if (NIL != var48 && NIL != module0269.f17705(var11) && NIL == f16731()) {
            var49.resetMultipleValues();
            final SubLObject var50 = f16740(var48, var11, var12, (SubLObject)UNPROVIDED);
            final SubLObject var51 = var49.secondMultipleValue();
            var49.resetMultipleValues();
            SubLObject var52 = var48;
            SubLObject var53 = (SubLObject)NIL;
            var53 = var52.first();
            while (NIL != var52) {
                if (NIL == f16780(var53, var11, var12, (SubLObject)UNPROVIDED)) {
                    if (NIL == f16780(var11, var53, var12, (SubLObject)UNPROVIDED)) {
                        if (NIL != f16781(var53, var11, var12, (SubLObject)UNPROVIDED)) {
                            return (SubLObject)NIL;
                        }
                    }
                }
                var52 = var52.rest();
                var53 = var52.first();
            }
            return module0035.sublisp_boolean(var50);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16783(final SubLObject var48, final SubLObject var11, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        if (NIL != var48 && NIL != module0269.f17705(var11) && NIL == f16731()) {
            SubLObject var49 = (SubLObject)NIL;
            if (NIL == var49) {
                SubLObject var50 = var48;
                SubLObject var51 = (SubLObject)NIL;
                var51 = var50.first();
                while (NIL == var49 && NIL != var50) {
                    if (NIL != f16779(var51, var11, var12)) {
                        if (NIL == f16780(var51, var11, var12, (SubLObject)UNPROVIDED)) {
                            if (NIL == f16780(var11, var51, var12, (SubLObject)UNPROVIDED)) {
                                if (NIL != f16781(var51, var11, var12, (SubLObject)UNPROVIDED)) {
                                    return (SubLObject)NIL;
                                }
                                var49 = (SubLObject)T;
                            }
                        }
                    }
                    var50 = var50.rest();
                    var51 = var50.first();
                }
            }
            return var49;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16784(final SubLObject var48, final SubLObject var106, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        final SubLThread var107 = SubLProcess.currentSubLThread();
        final SubLObject var108 = f16785(var48, var12);
        if (NIL != var108) {
            SubLObject var109 = (SubLObject)NIL;
            SubLObject var110 = (SubLObject)NIL;
            SubLObject var111 = (SubLObject)NIL;
            if (NIL == var109) {
                SubLObject var112 = f16785(var106, var12);
                SubLObject var113 = (SubLObject)NIL;
                var113 = var112.first();
                while (NIL == var109 && NIL != var112) {
                    var107.resetMultipleValues();
                    final SubLObject var111_112 = f16782(var108, var113, var12);
                    final SubLObject var113_114 = var107.secondMultipleValue();
                    var107.resetMultipleValues();
                    var109 = var111_112;
                    var110 = var113_114;
                    if (NIL != var109) {
                        var111 = var113;
                    }
                    var112 = var112.rest();
                    var113 = var112.first();
                }
            }
            return module0035.sublisp_boolean(var109);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16786(final SubLObject var48, final SubLObject var106, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        SubLObject var107 = (SubLObject)NIL;
        if (NIL == var107) {
            SubLObject var108 = f16785(var48, var12);
            SubLObject var109 = (SubLObject)NIL;
            var109 = var108.first();
            while (NIL == var107 && NIL != var108) {
                if (NIL == var107) {
                    SubLObject var45_117 = f16785(var106, var12);
                    SubLObject var110 = (SubLObject)NIL;
                    var110 = var45_117.first();
                    while (NIL == var107 && NIL != var45_117) {
                        if (NIL != f16777(var109, var110, var12)) {
                            var107 = (SubLObject)ConsesLow.list(var109, var110);
                        }
                        var45_117 = var45_117.rest();
                        var110 = var45_117.first();
                    }
                }
                var108 = var108.rest();
                var109 = var108.first();
            }
        }
        return var107;
    }
    
    public static SubLObject f16744(final SubLObject var90, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        if (NIL != module0018.f981()) {
            return (SubLObject)NIL;
        }
        return f16787(var90, var12);
    }
    
    public static SubLObject f16787(final SubLObject var90, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        final SubLThread var91 = SubLProcess.currentSubLThread();
        return module0035.f2272(ConsesLow.nconc(f16737(var90, var12), (SubLObject)((NIL != $g2488$.getDynamicValue(var91)) ? f16788(var90, var12) : NIL)));
    }
    
    public static SubLObject f16789() {
        final SubLObject var72 = $g2498$.getGlobalValue();
        if (NIL != var72) {
            module0034.f1818(var72);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16790(final SubLObject var90) {
        return module0034.f1829($g2498$.getGlobalValue(), (SubLObject)ConsesLow.list(var90), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f16791(final SubLObject var90) {
        return f16787(var90, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f16792(final SubLObject var90) {
        SubLObject var91 = $g2498$.getGlobalValue();
        if (NIL == var91) {
            var91 = module0034.f1934((SubLObject)$ic30$, (SubLObject)$ic31$, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)ONE_INTEGER, (SubLObject)SIXTEEN_INTEGER);
        }
        SubLObject var92 = module0034.f1814(var91, var90, (SubLObject)$ic21$);
        if (var92 == $ic21$) {
            var92 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f16791(var90)));
            module0034.f1816(var91, var90, var92, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var92);
    }
    
    public static SubLObject f16793(final SubLObject var90, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        return f16794(var90, var12);
    }
    
    public static SubLObject f16794(final SubLObject var90, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        return module0252.f16279(module0137.f8955($ic13$), var90, (SubLObject)$ic32$, var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f16795(final SubLObject var90) {
        final SubLThread var91 = SubLProcess.currentSubLThread();
        module0141.$g1691$.setDynamicValue(ConsesLow.nconc(module0141.$g1691$.getDynamicValue(var91), f16737(var90, (SubLObject)UNPROVIDED)), var91);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16737(final SubLObject var90, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        return conses_high.nunion(conses_high.nunion(module0220.f14566(var90, $ic33$, var12, (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED), module0220.f14566(var90, $ic33$, var12, (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), conses_high.nunion(module0220.f14566(var90, $ic34$, var12, (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED), module0220.f14566(var90, $ic34$, var12, (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f16796(final SubLObject var10, final SubLObject var11, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(NIL != module0220.f14582($ic33$, var10, var11, var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != module0220.f14582($ic33$, var11, var10, var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != module0220.f14582($ic34$, var10, var11, var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != module0220.f14582($ic34$, var11, var10, var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f16788(final SubLObject var90, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        return module0256.f16550(module0256.f16634(var90, var12, (SubLObject)UNPROVIDED), var12, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f16797(final SubLObject var10, final SubLObject var11, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(NIL != f16798(var10, var11, var12) || NIL != f16799(var10, var11, var12));
    }
    
    public static SubLObject f16798(final SubLObject var10, final SubLObject var11, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        final SubLThread var13 = SubLProcess.currentSubLThread();
        if (NIL != $g2487$.getDynamicValue(var13)) {
            return f16800(var10, var11, var12);
        }
        return f16796(var10, var11, var12);
    }
    
    public static SubLObject f16800(final SubLObject var10, final SubLObject var11, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        return Types.booleanp(f16801(var10, var11, var12));
    }
    
    public static SubLObject f16801(final SubLObject var10, final SubLObject var11, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        final SubLThread var13 = SubLProcess.currentSubLThread();
        SubLObject var14 = (SubLObject)NIL;
        final SubLObject var15 = module0139.f9008();
        final SubLObject var16 = module0139.$g1630$.currentBinding(var13);
        final SubLObject var17 = module0139.$g1659$.currentBinding(var13);
        try {
            module0139.$g1630$.bind((SubLObject)NIL, var13);
            module0139.$g1659$.bind(module0139.f9007(), var13);
            final SubLObject var17_119 = module0139.$g1639$.currentBinding(var13);
            final SubLObject var18_120 = module0139.$g1630$.currentBinding(var13);
            try {
                module0139.$g1639$.bind(module0139.$g1659$.getDynamicValue(var13), var13);
                module0139.$g1630$.bind(var15, var13);
                module0251.f16202(module0137.f8955($ic13$), var10, var12, (SubLObject)UNPROVIDED);
                final SubLObject var118_121 = module0139.f9008();
                final SubLObject var17_120 = module0139.$g1630$.currentBinding(var13);
                final SubLObject var18_121 = module0139.$g1659$.currentBinding(var13);
                try {
                    module0139.$g1630$.bind((SubLObject)NIL, var13);
                    module0139.$g1659$.bind(module0139.f9007(), var13);
                    final SubLObject var17_121 = module0139.$g1640$.currentBinding(var13);
                    final SubLObject var18_122 = module0139.$g1630$.currentBinding(var13);
                    try {
                        module0139.$g1640$.bind(module0139.$g1659$.getDynamicValue(var13), var13);
                        module0139.$g1630$.bind(var118_121, var13);
                        module0251.f16202(module0137.f8955($ic13$), var11, var12, (SubLObject)UNPROVIDED);
                        final SubLObject var18 = Hashtables.hash_table_count(module0139.$g1639$.getDynamicValue(var13)).numG(Hashtables.hash_table_count(module0139.$g1640$.getDynamicValue(var13))) ? module0139.$g1640$.getDynamicValue(var13) : module0139.$g1639$.getDynamicValue(var13);
                        final SubLObject var17_122 = module0139.$g1660$.currentBinding(var13);
                        try {
                            module0139.$g1660$.bind(var18.eql(module0139.$g1639$.getDynamicValue(var13)) ? module0139.$g1640$.getDynamicValue(var13) : module0139.$g1639$.getDynamicValue(var13), var13);
                            if (NIL == var14) {
                                SubLObject var19 = (SubLObject)NIL;
                                try {
                                    var13.throwStack.push($ic14$);
                                    SubLObject var20 = (SubLObject)NIL;
                                    SubLObject var21 = (SubLObject)NIL;
                                    final Iterator var22 = Hashtables.getEntrySetIterator(var18);
                                    try {
                                        while (Hashtables.iteratorHasNext(var22)) {
                                            final Map.Entry var23 = Hashtables.iteratorNextEntry(var22);
                                            var20 = Hashtables.getEntryKey(var23);
                                            var21 = Hashtables.getEntryValue(var23);
                                            module0005.f153(var14);
                                            var14 = f16802(var20);
                                        }
                                    }
                                    finally {
                                        Hashtables.releaseEntrySetIterator(var22);
                                    }
                                }
                                catch (Throwable var24) {
                                    var19 = Errors.handleThrowable(var24, (SubLObject)$ic14$);
                                }
                                finally {
                                    var13.throwStack.pop();
                                }
                            }
                        }
                        finally {
                            module0139.$g1660$.rebind(var17_122, var13);
                        }
                    }
                    finally {
                        module0139.$g1630$.rebind(var18_122, var13);
                        module0139.$g1640$.rebind(var17_121, var13);
                    }
                    module0139.f9011(module0139.$g1659$.getDynamicValue(var13));
                }
                finally {
                    module0139.$g1659$.rebind(var18_121, var13);
                    module0139.$g1630$.rebind(var17_120, var13);
                }
            }
            finally {
                module0139.$g1630$.rebind(var18_120, var13);
                module0139.$g1639$.rebind(var17_119, var13);
            }
            module0139.f9011(module0139.$g1659$.getDynamicValue(var13));
        }
        finally {
            module0139.$g1659$.rebind(var17, var13);
            module0139.$g1630$.rebind(var16, var13);
        }
        return var14;
    }
    
    public static SubLObject f16802(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)NIL;
        final SubLObject var5 = module0018.$g584$.currentBinding(var3);
        try {
            module0018.$g584$.bind((SubLObject)NIL, var3);
            final SubLObject var17_129 = module0018.$g590$.currentBinding(var3);
            try {
                module0018.$g590$.bind((SubLObject)TWO_INTEGER, var3);
                module0219.f14477(Symbols.symbol_function((SubLObject)$ic35$), var2, (SubLObject)ONE_INTEGER, $ic33$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0219.f14477(Symbols.symbol_function((SubLObject)$ic35$), var2, (SubLObject)ONE_INTEGER, $ic34$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            finally {
                module0018.$g590$.rebind(var17_129, var3);
            }
            if (NIL == module0018.$g584$.getDynamicValue(var3)) {
                final SubLObject var17_130 = module0018.$g590$.currentBinding(var3);
                try {
                    module0018.$g590$.bind((SubLObject)ONE_INTEGER, var3);
                    module0219.f14477(Symbols.symbol_function((SubLObject)$ic35$), var2, (SubLObject)TWO_INTEGER, $ic33$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0219.f14477(Symbols.symbol_function((SubLObject)$ic35$), var2, (SubLObject)TWO_INTEGER, $ic34$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                finally {
                    module0018.$g590$.rebind(var17_130, var3);
                }
            }
            if (NIL != module0018.$g584$.getDynamicValue(var3)) {
                var4 = (SubLObject)ConsesLow.list(var2, module0018.$g584$.getDynamicValue(var3));
            }
        }
        finally {
            module0018.$g584$.rebind(var5, var3);
        }
        return var4;
    }
    
    public static SubLObject f16803(final SubLObject var131) {
        final SubLThread var132 = SubLProcess.currentSubLThread();
        final SubLObject var133 = module0178.f11331(var131, module0018.$g590$.getDynamicValue(var132));
        if (NIL != module0251.f16239(var133, module0139.$g1660$.getDynamicValue(var132))) {
            module0018.$g584$.setDynamicValue(var133, var132);
            module0012.f425();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16799(final SubLObject var10, final SubLObject var11, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        final SubLThread var13 = SubLProcess.currentSubLThread();
        if (NIL != $g2488$.getDynamicValue(var13)) {
            return f16804(var10, var11, var12);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16804(final SubLObject var10, final SubLObject var11, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        return module0256.f16640(var10, var11, var12);
    }
    
    public static SubLObject f16805(final SubLObject var99, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        SubLObject var100 = (SubLObject)NIL;
        SubLObject var101 = var99;
        SubLObject var102 = (SubLObject)NIL;
        var102 = var101.first();
        while (NIL != var101) {
            if (NIL != f16774(var102, var12)) {
                var100 = (SubLObject)ConsesLow.cons(var102, var100);
            }
            var101 = var101.rest();
            var102 = var101.first();
        }
        return Sequences.nreverse(var100);
    }
    
    public static SubLObject f16785(final SubLObject var99, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        SubLObject var100 = (SubLObject)NIL;
        SubLObject var101 = var99;
        SubLObject var102 = (SubLObject)NIL;
        var102 = var101.first();
        while (NIL != var101) {
            if (NIL != f16776(var102, var12)) {
                var100 = (SubLObject)ConsesLow.cons(var102, var100);
            }
            var101 = var101.rest();
            var102 = var101.first();
        }
        return Sequences.nreverse(var100);
    }
    
    public static SubLObject f16780(final SubLObject var10, final SubLObject var11, SubLObject var12, SubLObject var131) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        if (var131 == UNPROVIDED) {
            var131 = module0138.$g1627$.getDynamicValue();
        }
        if (NIL != module0018.f981()) {
            return (SubLObject)NIL;
        }
        if (NIL != var131) {
            final SubLObject var132 = module0178.f11303(var131);
            final SubLObject var133 = module0178.f11292(var131);
            final SubLObject var134 = module0178.f11287(var131);
            final SubLObject var135 = conses_high.second(var132);
            final SubLObject var136 = conses_high.third(var132);
            return (SubLObject)makeBoolean(NIL != module0202.f12865(var132) && var133 == $ic36$ && NIL != module0147.f9507(var134) && NIL != module0256.f16576(var10, var135, var12, (SubLObject)UNPROVIDED) && NIL != module0256.f16576(var136, var11, var12, (SubLObject)UNPROVIDED));
        }
        if (NIL != module0151.f9690() && NIL != module0018.f981()) {
            final SubLObject var137 = module0152.f9723();
            return (SubLObject)makeBoolean(NIL != module0202.f12865(var137) && NIL == module0202.f12592(var137) && NIL != module0173.f10955(module0202.f12834(var137, (SubLObject)UNPROVIDED)) && NIL != module0173.f10955(module0202.f12835(var137, (SubLObject)UNPROVIDED)) && NIL != module0256.f16576(var10, module0202.f12834(var137, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL != module0256.f16576(module0202.f12835(var137, (SubLObject)UNPROVIDED), var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16781(final SubLObject var10, final SubLObject var11, SubLObject var12, SubLObject var131) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        if (var131 == UNPROVIDED) {
            var131 = module0138.$g1627$.getDynamicValue();
        }
        if (NIL != module0018.f981()) {
            return (SubLObject)NIL;
        }
        if (NIL != var131) {
            final SubLObject var132 = module0178.f11303(var131);
            final SubLObject var133 = module0178.f11292(var131);
            final SubLObject var134 = module0178.f11287(var131);
            final SubLObject var135 = conses_high.second(var132);
            final SubLObject var136 = conses_high.third(var132);
            return (SubLObject)makeBoolean(NIL != module0202.f12859(var132) && var133 == $ic36$ && NIL != module0147.f9507(var134) && NIL != module0256.f16576(var136, var10, var12, (SubLObject)UNPROVIDED) && NIL != module0256.f16576(var136, var11, var12, (SubLObject)UNPROVIDED));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16806(final SubLObject var10, final SubLObject var11, SubLObject var12, SubLObject var138) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        if (var138 == UNPROVIDED) {
            var138 = (SubLObject)NIL;
        }
        if (var138 == $ic37$) {
            return f16807(f16806(var10, var11, var12, (SubLObject)UNPROVIDED));
        }
        return f16808(var10, var11, var12);
    }
    
    public static SubLObject f16807(final SubLObject var139) {
        SubLObject var140 = (SubLObject)NIL;
        SubLObject var141 = var139;
        SubLObject var142 = (SubLObject)NIL;
        var142 = var141.first();
        while (NIL != var141) {
            if (NIL != module0191.f11952(var142)) {
                var140 = (SubLObject)ConsesLow.cons(var142, var140);
            }
            else {
                final SubLObject var143 = var142.first();
                SubLObject var144 = (SubLObject)NIL;
                if (NIL != var143) {
                    var144 = module0217.f14427(var143, (SubLObject)UNPROVIDED);
                }
                if (NIL != var144) {
                    var140 = (SubLObject)ConsesLow.cons(var144, var140);
                }
                else {
                    var140 = (SubLObject)ConsesLow.cons(module0191.f11990((SubLObject)$ic38$, var142.first(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var140);
                }
            }
            var141 = var141.rest();
            var142 = var141.first();
        }
        return Sequences.nreverse(var140);
    }
    
    public static SubLObject f16808(final SubLObject var10, final SubLObject var11, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        if (NIL == module0173.f10955(var10)) {
            final SubLObject var13 = module0172.f10921(var10);
            if (NIL != var13) {
                return f16808(var13, var11, var12);
            }
            return (SubLObject)NIL;
        }
        else if (NIL == module0173.f10955(var11)) {
            final SubLObject var14 = module0172.f10921(var11);
            if (NIL != var14) {
                return f16808(var10, var14, var12);
            }
            return (SubLObject)NIL;
        }
        else {
            final SubLObject var15 = f16735(var10, var11, var12, (SubLObject)UNPROVIDED);
            if (NIL == var15) {
                return (SubLObject)NIL;
            }
            if (NIL != module0256.f16576(var10, var11, var12, (SubLObject)UNPROVIDED)) {
                return (SubLObject)NIL;
            }
            if (NIL != module0256.f16576(var11, var10, var12, (SubLObject)UNPROVIDED)) {
                return (SubLObject)NIL;
            }
            if (NIL != f16780(var10, var11, var12, (SubLObject)UNPROVIDED)) {
                return (SubLObject)NIL;
            }
            if (NIL != f16780(var11, var10, var12, (SubLObject)UNPROVIDED)) {
                return (SubLObject)NIL;
            }
            if (NIL != f16781(var10, var11, var12, (SubLObject)UNPROVIDED)) {
                return (SubLObject)NIL;
            }
            return ConsesLow.nconc(f16809(var10, var15, var12), f16809(var11, var15, var12), module0259.f16916(var15, $ic39$, var12));
        }
    }
    
    public static SubLObject f16809(final SubLObject var2, final SubLObject var83, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        final SubLObject var84 = module0256.f16643(var2, var83, var12, (SubLObject)UNPROVIDED);
        if (var84.eql(var2)) {
            return module0259.f16916(var2, var83, var12);
        }
        return ConsesLow.nconc(module0256.f16628(var2, var84, var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), module0259.f16916(var84, var83, var12));
    }
    
    public static SubLObject f16810(final SubLObject var10, final SubLObject var11, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        SubLObject var13 = f16811(var10, var11, var12);
        if (NIL == var13) {
            var13 = f16812(var10, var11, var12);
        }
        return var13;
    }
    
    public static SubLObject f16811(final SubLObject var10, final SubLObject var11, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        final SubLThread var13 = SubLProcess.currentSubLThread();
        if (NIL != $g2487$.getDynamicValue(var13)) {
            return f16813(var10, var11, var12);
        }
        return f16814(var10, var11, var12);
    }
    
    public static SubLObject f16814(final SubLObject var10, final SubLObject var11, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        if (NIL != module0220.f14582($ic33$, var10, var11, var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0202.f12768($ic33$, var10, var11), (SubLObject)$ic36$));
        }
        if (NIL != module0220.f14582($ic33$, var11, var10, var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0202.f12768($ic33$, var11, var10), (SubLObject)$ic36$));
        }
        if (NIL != module0220.f14582($ic34$, var10, var11, var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0202.f12768($ic34$, var10, var11), (SubLObject)$ic36$));
        }
        if (NIL != module0220.f14582($ic34$, var11, var10, var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0202.f12768($ic34$, var11, var10), (SubLObject)$ic36$));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16813(final SubLObject var10, final SubLObject var11, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        final SubLObject var13 = module0256.f16648(var10, var11);
        final SubLObject var14 = var13.eql(var10) ? var11 : var10;
        final SubLObject var15 = f16801(var13, var14, var12);
        if (NIL != var15) {
            SubLObject var17;
            final SubLObject var16 = var17 = var15;
            SubLObject var18 = (SubLObject)NIL;
            SubLObject var19 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)$ic40$);
            var18 = var17.first();
            var17 = var17.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)$ic40$);
            var19 = var17.first();
            var17 = var17.rest();
            if (NIL == var17) {
                return ConsesLow.nconc((SubLObject)(var18.eql(var13) ? NIL : module0256.f16628(var13, var18, var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)), (SubLObject)(var19.eql(var14) ? NIL : module0256.f16628(var14, var19, var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)), f16814(var18, var19, var12));
            }
            cdestructuring_bind.cdestructuring_bind_error(var16, (SubLObject)$ic40$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16812(final SubLObject var10, final SubLObject var11, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        final SubLThread var13 = SubLProcess.currentSubLThread();
        if (NIL != $g2488$.getDynamicValue(var13)) {
            return f16815(var10, var11, var12);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16815(final SubLObject var10, final SubLObject var11, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        final SubLObject var14;
        final SubLObject var13 = var14 = module0256.f16641(var10, var11, var12, (SubLObject)UNPROVIDED);
        if (var14.eql((SubLObject)$ic41$)) {
            return module0256.f16628(var13, var11, var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (var14.eql((SubLObject)$ic42$)) {
            return module0256.f16628(var13, var10, var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return ConsesLow.nconc(module0256.f16628(var13, var10, var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), module0256.f16628(var13, var11, var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f16779(final SubLObject var10, final SubLObject var11, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        return module0035.sublisp_boolean(f16735(var10, var11, var12, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f16816(final SubLObject var48, final SubLObject var11, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        return module0035.sublisp_boolean(f16740(var48, var11, var12, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f16817(final SubLObject var154, final SubLObject var155, SubLObject var67, SubLObject var105, SubLObject var156, SubLObject var157, SubLObject var158) {
        if (var67 == UNPROVIDED) {
            var67 = (SubLObject)NIL;
        }
        if (var105 == UNPROVIDED) {
            var105 = (SubLObject)NIL;
        }
        if (var156 == UNPROVIDED) {
            var156 = (SubLObject)NIL;
        }
        if (var157 == UNPROVIDED) {
            var157 = (SubLObject)NIL;
        }
        if (var158 == UNPROVIDED) {
            var158 = (SubLObject)NIL;
        }
        final SubLThread var159 = SubLProcess.currentSubLThread();
        if ($g2499$.getDynamicValue(var159).numGE(var154)) {
            Errors.cerror((SubLObject)$ic10$, var155, new SubLObject[] { var67, var105, var156, var157, var158 });
        }
        else if (Numbers.add((SubLObject)TWO_INTEGER, module0144.$g1797$.getDynamicValue(var159)).numGE(var154)) {
            Errors.warn(var155, new SubLObject[] { var67, var105, var156, var157, var158 });
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16818() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16731", "S#19200", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16732", "S#19421", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0258", "f16733", "S#19422");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0258", "f16734", "S#19423");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16735", "S#19424", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16740", "S#19425", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16736", "S#19426", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16741", "S#19427", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16743", "S#19416", 1, 0, false);
        new $f16743$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16738", "S#19428", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16745", "S#19417", 1, 0, false);
        new $f16745$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16746", "S#19418", 1, 0, false);
        new $f16746$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16749", "S#19429", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16750", "S#19430", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16751", "S#19431", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16752", "S#19432", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16747", "S#19433", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16748", "S#19434", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16739", "S#19435", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16742", "S#19436", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16753", "S#19437", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16754", "S#19438", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16755", "S#19439", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16756", "SDC", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16757", "S#19241", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16759", "S#19240", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16758", "S#19440", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16760", "S#19441", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16762", "S#19442", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16763", "S#19443", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16764", "S#19444", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16761", "S#19445", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16765", "S#19446", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16766", "S#19447", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16767", "S#19448", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16769", "S#19449", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16770", "S#19450", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16771", "S#19451", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16768", "S#19452", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16772", "S#19453", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16773", "S#19454", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16774", "S#19455", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16775", "S#19456", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16776", "S#19457", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16777", "SDC?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16778", "S#19458", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16782", "ANY-SDC-WRT?", 2, 1, false);
        new $f16782$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16783", "S#19459", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16784", "S#19242", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16786", "S#19460", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16744", "S#19461", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16787", "S#19462", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16789", "S#19463", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16790", "S#19464", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16791", "S#19465", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16792", "S#19466", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16793", "S#19467", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16794", "S#19468", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16795", "S#19469", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16737", "S#19470", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16796", "S#19471", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16788", "S#19472", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16797", "S#19473", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16798", "S#19474", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16800", "S#19475", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16801", "S#19476", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16802", "S#19477", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16803", "S#19478", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16799", "S#19479", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16804", "S#19480", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16805", "S#19481", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16785", "S#19482", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16780", "S#19483", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16781", "S#19484", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16806", "S#19243", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16807", "S#19485", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16808", "S#19486", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16809", "S#19487", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16810", "S#19488", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16811", "S#19489", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16814", "S#19490", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16813", "S#19491", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16812", "S#19492", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16815", "S#19493", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16779", "S#19494", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16816", "S#19495", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0258", "f16817", "S#19496", 2, 5, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16819() {
        $g2487$ = SubLFiles.defparameter("*SDC-EXCEPTION-TRANSFERS-THRU-SPECS?*", (SubLObject)NIL);
        $g2488$ = SubLFiles.defparameter("*SDC-COMMON-SPEC-EXCEPTION?*", (SubLObject)NIL);
        $g2489$ = SubLFiles.defparameter("S#19497", (SubLObject)NIL);
        $g2490$ = SubLFiles.defparameter("S#19498", (SubLObject)NIL);
        $g2491$ = SubLFiles.defparameter("S#19499", (SubLObject)NIL);
        $g2492$ = SubLFiles.defparameter("S#19500", (SubLObject)NIL);
        $g2493$ = SubLFiles.defparameter("S#19501", (SubLObject)NIL);
        $g2494$ = SubLFiles.defparameter("S#19502", (SubLObject)NIL);
        $g2495$ = SubLFiles.deflexical("S#19503", (SubLObject)NIL);
        $g2496$ = SubLFiles.defparameter("S#19504", (SubLObject)NIL);
        $g2497$ = SubLFiles.deflexical("S#19505", (SubLObject)NIL);
        $g2498$ = SubLFiles.deflexical("S#19506", (SubLObject)NIL);
        $g2499$ = SubLFiles.defvar("S#19507", (SubLObject)ONE_INTEGER);
        $g2500$ = SubLFiles.defvar("S#19508", (SubLObject)ONE_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16820() {
        module0034.f1909((SubLObject)$ic19$);
        module0034.f1909((SubLObject)$ic25$);
        module0034.f1909((SubLObject)$ic30$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f16818();
    }
    
    public void initializeVariables() {
        f16819();
    }
    
    public void runTopLevelForms() {
        f16820();
    }
    
    static {
        me = (SubLFile)new module0258();
        $g2487$ = null;
        $g2488$ = null;
        $g2489$ = null;
        $g2490$ = null;
        $g2491$ = null;
        $g2492$ = null;
        $g2493$ = null;
        $g2494$ = null;
        $g2495$ = null;
        $g2496$ = null;
        $g2497$ = null;
        $g2498$ = null;
        $g2499$ = null;
        $g2500$ = null;
        $ic0$ = makeSymbol("S#11279", "CYC");
        $ic1$ = makeSymbol("S#19498", "CYC");
        $ic2$ = makeSymbol("S#19499", "CYC");
        $ic3$ = makeSymbol("S#19500", "CYC");
        $ic4$ = makeSymbol("S#19501", "CYC");
        $ic5$ = makeSymbol("S#11450", "CYC");
        $ic6$ = makeKeyword("ERROR");
        $ic7$ = makeString("~A is not a ~A");
        $ic8$ = makeSymbol("S#11592", "CYC");
        $ic9$ = makeKeyword("CERROR");
        $ic10$ = makeString("continue anyway");
        $ic11$ = makeKeyword("WARN");
        $ic12$ = makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic13$ = constant_handles_oc.f8479((SubLObject)makeString("genls"));
        $ic14$ = makeKeyword("DO-HASH-TABLE");
        $ic15$ = makeSymbol("S#19416", "CYC");
        $ic16$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic17$ = makeSymbol("S#19417", "CYC");
        $ic18$ = makeSymbol("S#19418", "CYC");
        $ic19$ = makeSymbol("S#19432", "CYC");
        $ic20$ = makeSymbol("S#19503", "CYC");
        $ic21$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic22$ = makeSymbol("S#19439", "CYC");
        $ic23$ = makeSymbol("S#19446", "CYC");
        $ic24$ = makeSymbol("S#19447", "CYC");
        $ic25$ = makeSymbol("S#19452", "CYC");
        $ic26$ = makeSymbol("S#19421", "CYC");
        $ic27$ = makeSymbol("S#19505", "CYC");
        $ic28$ = makeInteger(512);
        $ic29$ = makeSymbol("S#19456", "CYC");
        $ic30$ = makeSymbol("S#19466", "CYC");
        $ic31$ = makeSymbol("S#19506", "CYC");
        $ic32$ = makeSymbol("S#19469", "CYC");
        $ic33$ = constant_handles_oc.f8479((SubLObject)makeString("siblingDisjointExceptions"));
        $ic34$ = constant_handles_oc.f8479((SubLObject)makeString("rewriteOf"));
        $ic35$ = makeSymbol("S#19478", "CYC");
        $ic36$ = makeKeyword("TRUE");
        $ic37$ = makeKeyword("ASSERTION");
        $ic38$ = makeKeyword("OPAQUE");
        $ic39$ = constant_handles_oc.f8479((SubLObject)makeString("SiblingDisjointCollectionType"));
        $ic40$ = ConsesLow.list((SubLObject)makeSymbol("S#19509", "CYC"), (SubLObject)makeSymbol("S#19510", "CYC"));
        $ic41$ = makeSymbol("S#19412", "CYC");
        $ic42$ = makeSymbol("S#19413", "CYC");
    }
    
    public static final class $f16743$UnaryFunction extends UnaryFunction
    {
        public $f16743$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#19416"));
        }
        
        public SubLObject processItem(final SubLObject var67) {
            return f16743(var67);
        }
    }
    
    public static final class $f16745$UnaryFunction extends UnaryFunction
    {
        public $f16745$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#19417"));
        }
        
        public SubLObject processItem(final SubLObject var67) {
            return f16745(var67);
        }
    }
    
    public static final class $f16746$UnaryFunction extends UnaryFunction
    {
        public $f16746$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#19418"));
        }
        
        public SubLObject processItem(final SubLObject var67) {
            return f16746(var67);
        }
    }
    
    public static final class $f16782$BinaryFunction extends BinaryFunction
    {
        public $f16782$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("ANY-SDC-WRT?"));
        }
        
        public SubLObject processItem(final SubLObject var67, final SubLObject var105) {
            return f16782(var67, var105, (SubLObject)$f16782$BinaryFunction.UNPROVIDED);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 727 ms
	
	Decompiled with Procyon 0.5.32.
*/