package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0253 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0253";
    public static final String myFingerPrint = "d9e878c866ace4bac79da620a3ea294156fb1d863530e23e40f65c634ca9b9e3";
    public static SubLSymbol $g2472$;
    public static SubLSymbol $g2473$;
    public static SubLSymbol $g2474$;
    public static SubLSymbol $g2475$;
    public static SubLSymbol $g2476$;
    public static SubLSymbol $g2477$;
    public static SubLSymbol $g2478$;
    public static SubLSymbol $g2479$;
    public static SubLSymbol $g2480$;
    public static SubLSymbol $g2481$;
    public static SubLSymbol $g2482$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLList $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
    private static final SubLList $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
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
    private static final SubLList $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLObject $ic29$;
    private static final SubLObject $ic30$;
    private static final SubLString $ic31$;
    private static final SubLString $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLObject $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLString $ic42$;
    private static final SubLList $ic43$;
    private static final SubLString $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLString $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLString $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLString $ic52$;
    private static final SubLObject $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLObject $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLObject $ic60$;
    private static final SubLObject $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLString $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    
    public static SubLObject f16378(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.listS((SubLObject)$ic3$, var5, (SubLObject)$ic4$))), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f16379(final SubLObject var5, final SubLObject var7) {
        return (SubLObject)((NIL != var5) ? ((NIL != module0004.f104(var5, var7, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED)) ? var7 : ConsesLow.cons(var5, var7)) : var7);
    }
    
    public static SubLObject f16380(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic1$, (SubLObject)$ic6$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f16381() {
        return (SubLObject)$ic7$;
    }
    
    public static SubLObject f16382() {
        return (SubLObject)$ic8$;
    }
    
    public static SubLObject f16383(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic9$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic10$, (SubLObject)ConsesLow.listS((SubLObject)$ic11$, (SubLObject)ConsesLow.listS((SubLObject)EQ, var5, (SubLObject)$ic12$), (SubLObject)$ic13$)), (SubLObject)ConsesLow.list((SubLObject)$ic14$, (SubLObject)ConsesLow.listS((SubLObject)$ic11$, (SubLObject)ConsesLow.listS((SubLObject)EQ, var5, (SubLObject)$ic12$), (SubLObject)$ic15$))), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f16384() {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        if (NIL != module0141.f9195()) {
            return $g2474$.getDynamicValue(var13);
        }
        return $g2473$.getDynamicValue(var13);
    }
    
    public static SubLObject f16385(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (NIL != module0141.f9195()) {
            return Hashtables.gethash(var14, $g2474$.getDynamicValue(var15), (SubLObject)UNPROVIDED);
        }
        return Hashtables.gethash(var14, $g2473$.getDynamicValue(var15), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f16386(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        final SubLObject var16 = f16384();
        SubLObject var17 = (SubLObject)NIL;
        SubLObject var18 = f16385(var14);
        SubLObject var19 = (SubLObject)NIL;
        var19 = var18.first();
        while (NIL != var18) {
            if (NIL != module0035.f1976($g2472$.getDynamicValue(var15), var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var17 = (SubLObject)ConsesLow.cons(var19, var17);
            }
            var18 = var18.rest();
            var19 = var18.first();
        }
        var18 = var17;
        var19 = (SubLObject)NIL;
        var19 = var18.first();
        while (NIL != var18) {
            module0030.f1613(var14, var19, var16, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            var18 = var18.rest();
            var19 = var18.first();
        }
        module0030.f1599(var14, $g2472$.getDynamicValue(var15), var16);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16387(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        SubLObject var16 = (SubLObject)NIL;
        if (NIL == var16) {
            SubLObject var17 = f16385(var14);
            SubLObject var18 = (SubLObject)NIL;
            var18 = var17.first();
            while (NIL == var16 && NIL != var17) {
                if (NIL != conses_high.subsetp(var18, $g2472$.getDynamicValue(var15), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var16 = (SubLObject)T;
                }
                var17 = var17.rest();
                var18 = var17.first();
            }
        }
        return var16;
    }
    
    public static SubLObject f16388(final SubLObject var14, final SubLObject var21) {
        if (NIL != module0173.f10955(var14) || NIL != (var14.isCons() ? module0172.f10921(var14) : NIL)) {
            return module0138.f8997();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16389() {
        $g2479$.setDynamicValue((SubLObject)T);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16390(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic1$, (SubLObject)$ic16$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f16391() {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        return $g2479$.getDynamicValue(var13);
    }
    
    public static SubLObject f16392(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic17$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic18$, var5)), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f16393() {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        return $g2480$.getDynamicValue(var13);
    }
    
    public static SubLObject f16394() {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        return Types.sublisp_null($g2480$.getDynamicValue(var13));
    }
    
    public static SubLObject f16395(final SubLObject var14) {
        final SubLObject var15 = f16393();
        if (NIL != var15) {
            final SubLObject var16 = var15;
            if (var16.eql((SubLObject)$ic19$)) {
                f16396(var14);
            }
            else if (var16.eql((SubLObject)$ic20$)) {
                f16397(var14);
            }
            else if (var16.eql((SubLObject)$ic21$)) {
                f16398(var14);
            }
            else if (var16.eql((SubLObject)$ic22$)) {
                f16399(var14);
            }
            else if (var16.eql((SubLObject)$ic23$)) {
                f16400(var14);
            }
            else if (var16.eql((SubLObject)$ic24$)) {
                f16401(var14);
            }
            else if (var16.eql((SubLObject)$ic25$)) {
                f16402(var14);
            }
            else if (var16.eql((SubLObject)$ic26$)) {
                f16403(var14);
            }
            else {
                Functions.funcall(var15, var14);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16404() {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        return $g2481$.getDynamicValue(var13);
    }
    
    public static SubLObject f16405(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic27$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic28$, var5)), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f16406(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (NIL == f16394()) {
            return (SubLObject)NIL;
        }
        final SubLObject var16 = module0141.f9190();
        SubLObject var17 = (SubLObject)T;
        if (NIL != var16) {
            var17 = Functions.funcall(var16);
        }
        if (NIL != var17) {
            return Equality.eql(var14, $g2481$.getDynamicValue(var15));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16407(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        final SubLObject var16 = module0137.f8917(module0141.f9188());
        SubLObject var17 = (SubLObject)NIL;
        if (var16.eql($ic29$)) {
            final SubLObject var18 = module0141.$g1674$.currentBinding(var15);
            try {
                module0141.$g1674$.bind((SubLObject)makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var15)), var15);
                var17 = module0249.f16059(var14, (SubLObject)UNPROVIDED);
            }
            finally {
                module0141.$g1674$.rebind(var18, var15);
            }
        }
        else {
            var17 = module0249.f16059(var14, (SubLObject)UNPROVIDED);
        }
        return var17;
    }
    
    public static SubLObject f16408(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        final SubLObject var16 = module0137.f8917(module0141.f9188());
        SubLObject var17 = (SubLObject)NIL;
        if (var16.eql($ic30$) || var16.eql($ic29$)) {
            final SubLObject var18 = module0141.$g1674$.currentBinding(var15);
            try {
                module0141.$g1674$.bind((SubLObject)makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var15)), var15);
                var17 = module0249.f16059(var14, (SubLObject)UNPROVIDED);
            }
            finally {
                module0141.$g1674$.rebind(var18, var15);
            }
        }
        else {
            var17 = module0249.f16059(var14, (SubLObject)UNPROVIDED);
        }
        return var17;
    }
    
    public static SubLObject f16409(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (NIL == f16387(var14)) {
            f16386(var14);
            f16395(var14);
            if (NIL == f16406(var14)) {
                SubLObject var17;
                final SubLObject var16 = var17 = module0200.f12443(module0137.f8955((SubLObject)UNPROVIDED));
                SubLObject var18 = (SubLObject)NIL;
                var18 = var17.first();
                while (NIL != var17) {
                    final SubLObject var19 = module0137.$g1605$.currentBinding(var15);
                    final SubLObject var20 = module0141.$g1674$.currentBinding(var15);
                    try {
                        module0137.$g1605$.bind(var18, var15);
                        module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var15)) : module0141.$g1674$.getDynamicValue(var15)), var15);
                        final SubLObject var39_40 = module0228.f15229(var14);
                        if (NIL != module0138.f8992(var39_40)) {
                            final SubLObject var21 = module0242.f15664(var39_40, module0137.f8955((SubLObject)UNPROVIDED));
                            if (NIL != var21) {
                                final SubLObject var22 = module0245.f15834(var21, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                if (NIL != var22) {
                                    SubLObject var23;
                                    for (var23 = module0066.f4838(module0067.f4891(var22)); NIL == module0066.f4841(var23); var23 = module0066.f4840(var23)) {
                                        var15.resetMultipleValues();
                                        final SubLObject var24 = module0066.f4839(var23);
                                        final SubLObject var25 = var15.secondMultipleValue();
                                        var15.resetMultipleValues();
                                        if (NIL != module0147.f9507(var24)) {
                                            final SubLObject var35_46 = module0138.$g1623$.currentBinding(var15);
                                            try {
                                                module0138.$g1623$.bind(var24, var15);
                                                SubLObject var43_47;
                                                for (var43_47 = module0066.f4838(module0067.f4891(var25)); NIL == module0066.f4841(var43_47); var43_47 = module0066.f4840(var43_47)) {
                                                    var15.resetMultipleValues();
                                                    final SubLObject var26 = module0066.f4839(var43_47);
                                                    final SubLObject var27 = var15.secondMultipleValue();
                                                    var15.resetMultipleValues();
                                                    if (NIL != module0141.f9289(var26)) {
                                                        final SubLObject var35_47 = module0138.$g1624$.currentBinding(var15);
                                                        try {
                                                            module0138.$g1624$.bind(var26, var15);
                                                            final SubLObject var28 = var27;
                                                            if (NIL != module0077.f5302(var28)) {
                                                                final SubLObject var29 = module0077.f5333(var28);
                                                                SubLObject var30;
                                                                SubLObject var31;
                                                                SubLObject var32;
                                                                SubLObject var35_48;
                                                                for (var30 = module0032.f1741(var29), var31 = (SubLObject)NIL, var31 = module0032.f1742(var30, var29); NIL == module0032.f1744(var30, var31); var31 = module0032.f1743(var31)) {
                                                                    var32 = module0032.f1745(var30, var31);
                                                                    if (NIL != module0032.f1746(var31, var32)) {
                                                                        var35_48 = $g2472$.currentBinding(var15);
                                                                        try {
                                                                            $g2472$.bind(f16379(f16388(var14, var32), $g2472$.getDynamicValue(var15)), var15);
                                                                            f16409(var32);
                                                                        }
                                                                        finally {
                                                                            $g2472$.rebind(var35_48, var15);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            else if (var28.isList()) {
                                                                SubLObject var33 = var28;
                                                                SubLObject var34 = (SubLObject)NIL;
                                                                var34 = var33.first();
                                                                while (NIL != var33) {
                                                                    final SubLObject var35_49 = $g2472$.currentBinding(var15);
                                                                    try {
                                                                        $g2472$.bind(f16379(f16388(var14, var34), $g2472$.getDynamicValue(var15)), var15);
                                                                        f16409(var34);
                                                                    }
                                                                    finally {
                                                                        $g2472$.rebind(var35_49, var15);
                                                                    }
                                                                    var33 = var33.rest();
                                                                    var34 = var33.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)$ic31$, var28);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1624$.rebind(var35_47, var15);
                                                        }
                                                    }
                                                }
                                                module0066.f4842(var43_47);
                                            }
                                            finally {
                                                module0138.$g1623$.rebind(var35_46, var15);
                                            }
                                        }
                                    }
                                    module0066.f4842(var23);
                                }
                            }
                            else {
                                module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic32$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                        }
                        else if (NIL != module0155.f9785(var39_40, (SubLObject)UNPROVIDED)) {
                            SubLObject var17_58;
                            final SubLObject var35 = var17_58 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var15), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var15), module0137.f8955((SubLObject)UNPROVIDED)));
                            SubLObject var36 = (SubLObject)NIL;
                            var36 = var17_58.first();
                            while (NIL != var17_58) {
                                final SubLObject var35_50 = module0138.$g1625$.currentBinding(var15);
                                try {
                                    module0138.$g1625$.bind(var36, var15);
                                    final SubLObject var38;
                                    final SubLObject var37 = var38 = Functions.funcall(var36, var39_40);
                                    if (NIL != module0077.f5302(var38)) {
                                        final SubLObject var39 = module0077.f5333(var38);
                                        SubLObject var40;
                                        SubLObject var41;
                                        SubLObject var42;
                                        SubLObject var35_51;
                                        for (var40 = module0032.f1741(var39), var41 = (SubLObject)NIL, var41 = module0032.f1742(var40, var39); NIL == module0032.f1744(var40, var41); var41 = module0032.f1743(var41)) {
                                            var42 = module0032.f1745(var40, var41);
                                            if (NIL != module0032.f1746(var41, var42)) {
                                                var35_51 = $g2472$.currentBinding(var15);
                                                try {
                                                    $g2472$.bind(f16379(f16388(var14, var42), $g2472$.getDynamicValue(var15)), var15);
                                                    f16409(var42);
                                                }
                                                finally {
                                                    $g2472$.rebind(var35_51, var15);
                                                }
                                            }
                                        }
                                    }
                                    else if (var38.isList()) {
                                        SubLObject var43 = var38;
                                        SubLObject var44 = (SubLObject)NIL;
                                        var44 = var43.first();
                                        while (NIL != var43) {
                                            final SubLObject var35_52 = $g2472$.currentBinding(var15);
                                            try {
                                                $g2472$.bind(f16379(f16388(var14, var44), $g2472$.getDynamicValue(var15)), var15);
                                                f16409(var44);
                                            }
                                            finally {
                                                $g2472$.rebind(var35_52, var15);
                                            }
                                            var43 = var43.rest();
                                            var44 = var43.first();
                                        }
                                    }
                                    else {
                                        Errors.error((SubLObject)$ic31$, var38);
                                    }
                                }
                                finally {
                                    module0138.$g1625$.rebind(var35_50, var15);
                                }
                                var17_58 = var17_58.rest();
                                var36 = var17_58.first();
                            }
                        }
                    }
                    finally {
                        module0141.$g1674$.rebind(var20, var15);
                        module0137.$g1605$.rebind(var19, var15);
                    }
                    var17 = var17.rest();
                    var18 = var17.first();
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16410(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (NIL != f16407(var14) && NIL == f16387(var14)) {
            f16386(var14);
            f16395(var14);
            if (NIL == f16406(var14)) {
                SubLObject var17;
                final SubLObject var16 = var17 = module0200.f12443(module0137.f8955((SubLObject)UNPROVIDED));
                SubLObject var18 = (SubLObject)NIL;
                var18 = var17.first();
                while (NIL != var17) {
                    final SubLObject var19 = module0137.$g1605$.currentBinding(var15);
                    final SubLObject var20 = module0141.$g1674$.currentBinding(var15);
                    try {
                        module0137.$g1605$.bind(var18, var15);
                        module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var15)) : module0141.$g1674$.getDynamicValue(var15)), var15);
                        final SubLObject var39_63 = module0228.f15229(var14);
                        if (NIL != module0138.f8992(var39_63)) {
                            final SubLObject var21 = module0242.f15664(var39_63, module0137.f8955((SubLObject)UNPROVIDED));
                            if (NIL != var21) {
                                final SubLObject var22 = module0245.f15834(var21, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                if (NIL != var22) {
                                    SubLObject var23;
                                    for (var23 = module0066.f4838(module0067.f4891(var22)); NIL == module0066.f4841(var23); var23 = module0066.f4840(var23)) {
                                        var15.resetMultipleValues();
                                        final SubLObject var24 = module0066.f4839(var23);
                                        final SubLObject var25 = var15.secondMultipleValue();
                                        var15.resetMultipleValues();
                                        if (NIL != module0147.f9507(var24)) {
                                            final SubLObject var35_64 = module0138.$g1623$.currentBinding(var15);
                                            try {
                                                module0138.$g1623$.bind(var24, var15);
                                                SubLObject var43_65;
                                                for (var43_65 = module0066.f4838(module0067.f4891(var25)); NIL == module0066.f4841(var43_65); var43_65 = module0066.f4840(var43_65)) {
                                                    var15.resetMultipleValues();
                                                    final SubLObject var26 = module0066.f4839(var43_65);
                                                    final SubLObject var27 = var15.secondMultipleValue();
                                                    var15.resetMultipleValues();
                                                    if (NIL != module0141.f9289(var26)) {
                                                        final SubLObject var35_65 = module0138.$g1624$.currentBinding(var15);
                                                        try {
                                                            module0138.$g1624$.bind(var26, var15);
                                                            final SubLObject var28 = var27;
                                                            if (NIL != module0077.f5302(var28)) {
                                                                final SubLObject var29 = module0077.f5333(var28);
                                                                SubLObject var30;
                                                                SubLObject var31;
                                                                SubLObject var32;
                                                                SubLObject var35_66;
                                                                for (var30 = module0032.f1741(var29), var31 = (SubLObject)NIL, var31 = module0032.f1742(var30, var29); NIL == module0032.f1744(var30, var31); var31 = module0032.f1743(var31)) {
                                                                    var32 = module0032.f1745(var30, var31);
                                                                    if (NIL != module0032.f1746(var31, var32)) {
                                                                        var35_66 = $g2472$.currentBinding(var15);
                                                                        try {
                                                                            $g2472$.bind(f16379(f16388(var14, var32), $g2472$.getDynamicValue(var15)), var15);
                                                                            f16410(var32);
                                                                        }
                                                                        finally {
                                                                            $g2472$.rebind(var35_66, var15);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            else if (var28.isList()) {
                                                                SubLObject var33 = var28;
                                                                SubLObject var34 = (SubLObject)NIL;
                                                                var34 = var33.first();
                                                                while (NIL != var33) {
                                                                    final SubLObject var35_67 = $g2472$.currentBinding(var15);
                                                                    try {
                                                                        $g2472$.bind(f16379(f16388(var14, var34), $g2472$.getDynamicValue(var15)), var15);
                                                                        f16410(var34);
                                                                    }
                                                                    finally {
                                                                        $g2472$.rebind(var35_67, var15);
                                                                    }
                                                                    var33 = var33.rest();
                                                                    var34 = var33.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)$ic31$, var28);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1624$.rebind(var35_65, var15);
                                                        }
                                                    }
                                                }
                                                module0066.f4842(var43_65);
                                            }
                                            finally {
                                                module0138.$g1623$.rebind(var35_64, var15);
                                            }
                                        }
                                    }
                                    module0066.f4842(var23);
                                }
                            }
                            else {
                                module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic32$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                        }
                        else if (NIL != module0155.f9785(var39_63, (SubLObject)UNPROVIDED)) {
                            SubLObject var17_69;
                            final SubLObject var35 = var17_69 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var15), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var15), module0137.f8955((SubLObject)UNPROVIDED)));
                            SubLObject var36 = (SubLObject)NIL;
                            var36 = var17_69.first();
                            while (NIL != var17_69) {
                                final SubLObject var35_68 = module0138.$g1625$.currentBinding(var15);
                                try {
                                    module0138.$g1625$.bind(var36, var15);
                                    final SubLObject var38;
                                    final SubLObject var37 = var38 = Functions.funcall(var36, var39_63);
                                    if (NIL != module0077.f5302(var38)) {
                                        final SubLObject var39 = module0077.f5333(var38);
                                        SubLObject var40;
                                        SubLObject var41;
                                        SubLObject var42;
                                        SubLObject var35_69;
                                        for (var40 = module0032.f1741(var39), var41 = (SubLObject)NIL, var41 = module0032.f1742(var40, var39); NIL == module0032.f1744(var40, var41); var41 = module0032.f1743(var41)) {
                                            var42 = module0032.f1745(var40, var41);
                                            if (NIL != module0032.f1746(var41, var42)) {
                                                var35_69 = $g2472$.currentBinding(var15);
                                                try {
                                                    $g2472$.bind(f16379(f16388(var14, var42), $g2472$.getDynamicValue(var15)), var15);
                                                    f16410(var42);
                                                }
                                                finally {
                                                    $g2472$.rebind(var35_69, var15);
                                                }
                                            }
                                        }
                                    }
                                    else if (var38.isList()) {
                                        SubLObject var43 = var38;
                                        SubLObject var44 = (SubLObject)NIL;
                                        var44 = var43.first();
                                        while (NIL != var43) {
                                            final SubLObject var35_70 = $g2472$.currentBinding(var15);
                                            try {
                                                $g2472$.bind(f16379(f16388(var14, var44), $g2472$.getDynamicValue(var15)), var15);
                                                f16410(var44);
                                            }
                                            finally {
                                                $g2472$.rebind(var35_70, var15);
                                            }
                                            var43 = var43.rest();
                                            var44 = var43.first();
                                        }
                                    }
                                    else {
                                        Errors.error((SubLObject)$ic31$, var38);
                                    }
                                }
                                finally {
                                    module0138.$g1625$.rebind(var35_68, var15);
                                }
                                var17_69 = var17_69.rest();
                                var36 = var17_69.first();
                            }
                        }
                    }
                    finally {
                        module0141.$g1674$.rebind(var20, var15);
                        module0137.$g1605$.rebind(var19, var15);
                    }
                    var17 = var17.rest();
                    var18 = var17.first();
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16411(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        SubLObject var17;
        final SubLObject var16 = var17 = module0200.f12443(module0137.f8955((SubLObject)UNPROVIDED));
        SubLObject var18 = (SubLObject)NIL;
        var18 = var17.first();
        while (NIL != var17) {
            final SubLObject var19 = module0137.$g1605$.currentBinding(var15);
            final SubLObject var20 = module0141.$g1674$.currentBinding(var15);
            try {
                module0137.$g1605$.bind(var18, var15);
                module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var15)) : module0141.$g1674$.getDynamicValue(var15)), var15);
                final SubLObject var39_73 = module0228.f15229(var14);
                if (NIL != module0138.f8992(var39_73)) {
                    final SubLObject var21 = module0242.f15664(var39_73, module0137.f8955((SubLObject)UNPROVIDED));
                    if (NIL != var21) {
                        final SubLObject var22 = module0245.f15834(var21, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                        if (NIL != var22) {
                            SubLObject var23;
                            for (var23 = module0066.f4838(module0067.f4891(var22)); NIL == module0066.f4841(var23); var23 = module0066.f4840(var23)) {
                                var15.resetMultipleValues();
                                final SubLObject var24 = module0066.f4839(var23);
                                final SubLObject var25 = var15.secondMultipleValue();
                                var15.resetMultipleValues();
                                if (NIL != module0147.f9507(var24)) {
                                    final SubLObject var35_74 = module0138.$g1623$.currentBinding(var15);
                                    try {
                                        module0138.$g1623$.bind(var24, var15);
                                        SubLObject var43_75;
                                        for (var43_75 = module0066.f4838(module0067.f4891(var25)); NIL == module0066.f4841(var43_75); var43_75 = module0066.f4840(var43_75)) {
                                            var15.resetMultipleValues();
                                            final SubLObject var26 = module0066.f4839(var43_75);
                                            final SubLObject var27 = var15.secondMultipleValue();
                                            var15.resetMultipleValues();
                                            if (NIL != module0141.f9289(var26)) {
                                                final SubLObject var35_75 = module0138.$g1624$.currentBinding(var15);
                                                try {
                                                    module0138.$g1624$.bind(var26, var15);
                                                    final SubLObject var28 = var27;
                                                    if (NIL != module0077.f5302(var28)) {
                                                        final SubLObject var29 = module0077.f5333(var28);
                                                        SubLObject var30;
                                                        SubLObject var31;
                                                        SubLObject var32;
                                                        SubLObject var35_76;
                                                        for (var30 = module0032.f1741(var29), var31 = (SubLObject)NIL, var31 = module0032.f1742(var30, var29); NIL == module0032.f1744(var30, var31); var31 = module0032.f1743(var31)) {
                                                            var32 = module0032.f1745(var30, var31);
                                                            if (NIL != module0032.f1746(var31, var32)) {
                                                                var35_76 = $g2472$.currentBinding(var15);
                                                                try {
                                                                    $g2472$.bind(f16379(f16388(var14, var32), $g2472$.getDynamicValue(var15)), var15);
                                                                    f16395(var32);
                                                                }
                                                                finally {
                                                                    $g2472$.rebind(var35_76, var15);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    else if (var28.isList()) {
                                                        SubLObject var33 = var28;
                                                        SubLObject var34 = (SubLObject)NIL;
                                                        var34 = var33.first();
                                                        while (NIL != var33) {
                                                            final SubLObject var35_77 = $g2472$.currentBinding(var15);
                                                            try {
                                                                $g2472$.bind(f16379(f16388(var14, var34), $g2472$.getDynamicValue(var15)), var15);
                                                                f16395(var34);
                                                            }
                                                            finally {
                                                                $g2472$.rebind(var35_77, var15);
                                                            }
                                                            var33 = var33.rest();
                                                            var34 = var33.first();
                                                        }
                                                    }
                                                    else {
                                                        Errors.error((SubLObject)$ic31$, var28);
                                                    }
                                                }
                                                finally {
                                                    module0138.$g1624$.rebind(var35_75, var15);
                                                }
                                            }
                                        }
                                        module0066.f4842(var43_75);
                                    }
                                    finally {
                                        module0138.$g1623$.rebind(var35_74, var15);
                                    }
                                }
                            }
                            module0066.f4842(var23);
                        }
                    }
                    else {
                        module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic32$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                }
                else if (NIL != module0155.f9785(var39_73, (SubLObject)UNPROVIDED)) {
                    SubLObject var17_79;
                    final SubLObject var35 = var17_79 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var15), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var15), module0137.f8955((SubLObject)UNPROVIDED)));
                    SubLObject var36 = (SubLObject)NIL;
                    var36 = var17_79.first();
                    while (NIL != var17_79) {
                        final SubLObject var35_78 = module0138.$g1625$.currentBinding(var15);
                        try {
                            module0138.$g1625$.bind(var36, var15);
                            final SubLObject var38;
                            final SubLObject var37 = var38 = Functions.funcall(var36, var39_73);
                            if (NIL != module0077.f5302(var38)) {
                                final SubLObject var39 = module0077.f5333(var38);
                                SubLObject var40;
                                SubLObject var41;
                                SubLObject var42;
                                SubLObject var35_79;
                                for (var40 = module0032.f1741(var39), var41 = (SubLObject)NIL, var41 = module0032.f1742(var40, var39); NIL == module0032.f1744(var40, var41); var41 = module0032.f1743(var41)) {
                                    var42 = module0032.f1745(var40, var41);
                                    if (NIL != module0032.f1746(var41, var42)) {
                                        var35_79 = $g2472$.currentBinding(var15);
                                        try {
                                            $g2472$.bind(f16379(f16388(var14, var42), $g2472$.getDynamicValue(var15)), var15);
                                            f16395(var42);
                                        }
                                        finally {
                                            $g2472$.rebind(var35_79, var15);
                                        }
                                    }
                                }
                            }
                            else if (var38.isList()) {
                                SubLObject var43 = var38;
                                SubLObject var44 = (SubLObject)NIL;
                                var44 = var43.first();
                                while (NIL != var43) {
                                    final SubLObject var35_80 = $g2472$.currentBinding(var15);
                                    try {
                                        $g2472$.bind(f16379(f16388(var14, var44), $g2472$.getDynamicValue(var15)), var15);
                                        f16395(var44);
                                    }
                                    finally {
                                        $g2472$.rebind(var35_80, var15);
                                    }
                                    var43 = var43.rest();
                                    var44 = var43.first();
                                }
                            }
                            else {
                                Errors.error((SubLObject)$ic31$, var38);
                            }
                        }
                        finally {
                            module0138.$g1625$.rebind(var35_78, var15);
                        }
                        var17_79 = var17_79.rest();
                        var36 = var17_79.first();
                    }
                }
            }
            finally {
                module0141.$g1674$.rebind(var20, var15);
                module0137.$g1605$.rebind(var19, var15);
            }
            var17 = var17.rest();
            var18 = var17.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16412(final SubLObject var14) {
        if (NIL != f16408(var14)) {
            f16411(var14);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16413(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        SubLObject var17;
        final SubLObject var16 = var17 = module0200.f12443(module0137.f8955((SubLObject)UNPROVIDED));
        SubLObject var18 = (SubLObject)NIL;
        var18 = var17.first();
        while (NIL != var17) {
            final SubLObject var19 = module0137.$g1605$.currentBinding(var15);
            final SubLObject var20 = module0141.$g1674$.currentBinding(var15);
            try {
                module0137.$g1605$.bind(var18, var15);
                module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var15)) : module0141.$g1674$.getDynamicValue(var15)), var15);
                final SubLObject var39_83 = module0228.f15229(var14);
                if (NIL != module0138.f8992(var39_83)) {
                    final SubLObject var21 = module0242.f15664(var39_83, module0137.f8955((SubLObject)UNPROVIDED));
                    if (NIL != var21) {
                        final SubLObject var22 = module0245.f15834(var21, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                        if (NIL != var22) {
                            SubLObject var23;
                            for (var23 = module0066.f4838(module0067.f4891(var22)); NIL == module0066.f4841(var23); var23 = module0066.f4840(var23)) {
                                var15.resetMultipleValues();
                                final SubLObject var24 = module0066.f4839(var23);
                                final SubLObject var25 = var15.secondMultipleValue();
                                var15.resetMultipleValues();
                                if (NIL != module0147.f9507(var24)) {
                                    final SubLObject var35_84 = module0138.$g1623$.currentBinding(var15);
                                    try {
                                        module0138.$g1623$.bind(var24, var15);
                                        SubLObject var43_85;
                                        for (var43_85 = module0066.f4838(module0067.f4891(var25)); NIL == module0066.f4841(var43_85); var43_85 = module0066.f4840(var43_85)) {
                                            var15.resetMultipleValues();
                                            final SubLObject var26 = module0066.f4839(var43_85);
                                            final SubLObject var27 = var15.secondMultipleValue();
                                            var15.resetMultipleValues();
                                            if (NIL != module0141.f9289(var26)) {
                                                final SubLObject var35_85 = module0138.$g1624$.currentBinding(var15);
                                                try {
                                                    module0138.$g1624$.bind(var26, var15);
                                                    final SubLObject var28 = var27;
                                                    if (NIL != module0077.f5302(var28)) {
                                                        final SubLObject var29 = module0077.f5333(var28);
                                                        SubLObject var30;
                                                        SubLObject var31;
                                                        SubLObject var32;
                                                        SubLObject var35_86;
                                                        for (var30 = module0032.f1741(var29), var31 = (SubLObject)NIL, var31 = module0032.f1742(var30, var29); NIL == module0032.f1744(var30, var31); var31 = module0032.f1743(var31)) {
                                                            var32 = module0032.f1745(var30, var31);
                                                            if (NIL != module0032.f1746(var31, var32)) {
                                                                var35_86 = $g2472$.currentBinding(var15);
                                                                try {
                                                                    $g2472$.bind(f16379(f16388(var14, var32), $g2472$.getDynamicValue(var15)), var15);
                                                                    if (NIL == f16387(var32)) {
                                                                        f16386(var32);
                                                                        f16395(var32);
                                                                    }
                                                                }
                                                                finally {
                                                                    $g2472$.rebind(var35_86, var15);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    else if (var28.isList()) {
                                                        SubLObject var33 = var28;
                                                        SubLObject var34 = (SubLObject)NIL;
                                                        var34 = var33.first();
                                                        while (NIL != var33) {
                                                            final SubLObject var35_87 = $g2472$.currentBinding(var15);
                                                            try {
                                                                $g2472$.bind(f16379(f16388(var14, var34), $g2472$.getDynamicValue(var15)), var15);
                                                                if (NIL == f16387(var34)) {
                                                                    f16386(var34);
                                                                    f16395(var34);
                                                                }
                                                            }
                                                            finally {
                                                                $g2472$.rebind(var35_87, var15);
                                                            }
                                                            var33 = var33.rest();
                                                            var34 = var33.first();
                                                        }
                                                    }
                                                    else {
                                                        Errors.error((SubLObject)$ic31$, var28);
                                                    }
                                                }
                                                finally {
                                                    module0138.$g1624$.rebind(var35_85, var15);
                                                }
                                            }
                                        }
                                        module0066.f4842(var43_85);
                                    }
                                    finally {
                                        module0138.$g1623$.rebind(var35_84, var15);
                                    }
                                }
                            }
                            module0066.f4842(var23);
                        }
                    }
                    else {
                        module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic32$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                }
                else if (NIL != module0155.f9785(var39_83, (SubLObject)UNPROVIDED)) {
                    SubLObject var17_89;
                    final SubLObject var35 = var17_89 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var15), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var15), module0137.f8955((SubLObject)UNPROVIDED)));
                    SubLObject var36 = (SubLObject)NIL;
                    var36 = var17_89.first();
                    while (NIL != var17_89) {
                        final SubLObject var35_88 = module0138.$g1625$.currentBinding(var15);
                        try {
                            module0138.$g1625$.bind(var36, var15);
                            final SubLObject var38;
                            final SubLObject var37 = var38 = Functions.funcall(var36, var39_83);
                            if (NIL != module0077.f5302(var38)) {
                                final SubLObject var39 = module0077.f5333(var38);
                                SubLObject var40;
                                SubLObject var41;
                                SubLObject var42;
                                SubLObject var35_89;
                                for (var40 = module0032.f1741(var39), var41 = (SubLObject)NIL, var41 = module0032.f1742(var40, var39); NIL == module0032.f1744(var40, var41); var41 = module0032.f1743(var41)) {
                                    var42 = module0032.f1745(var40, var41);
                                    if (NIL != module0032.f1746(var41, var42)) {
                                        var35_89 = $g2472$.currentBinding(var15);
                                        try {
                                            $g2472$.bind(f16379(f16388(var14, var42), $g2472$.getDynamicValue(var15)), var15);
                                            if (NIL == f16387(var42)) {
                                                f16386(var42);
                                                f16395(var42);
                                            }
                                        }
                                        finally {
                                            $g2472$.rebind(var35_89, var15);
                                        }
                                    }
                                }
                            }
                            else if (var38.isList()) {
                                SubLObject var43 = var38;
                                SubLObject var44 = (SubLObject)NIL;
                                var44 = var43.first();
                                while (NIL != var43) {
                                    final SubLObject var35_90 = $g2472$.currentBinding(var15);
                                    try {
                                        $g2472$.bind(f16379(f16388(var14, var44), $g2472$.getDynamicValue(var15)), var15);
                                        if (NIL == f16387(var44)) {
                                            f16386(var44);
                                            f16395(var44);
                                        }
                                    }
                                    finally {
                                        $g2472$.rebind(var35_90, var15);
                                    }
                                    var43 = var43.rest();
                                    var44 = var43.first();
                                }
                            }
                            else {
                                Errors.error((SubLObject)$ic31$, var38);
                            }
                        }
                        finally {
                            module0138.$g1625$.rebind(var35_88, var15);
                        }
                        var17_89 = var17_89.rest();
                        var36 = var17_89.first();
                    }
                }
            }
            finally {
                module0141.$g1674$.rebind(var20, var15);
                module0137.$g1605$.rebind(var19, var15);
            }
            var17 = var17.rest();
            var18 = var17.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16414(final SubLObject var93, final SubLObject var94, final SubLObject var95, final SubLObject var96, final SubLObject var27, final SubLObject var14) {
        final SubLThread var97 = SubLProcess.currentSubLThread();
        assert NIL != module0137.f8885(var93) : var93;
        final SubLObject var98 = module0137.$g1605$.currentBinding(var97);
        final SubLObject var99 = module0138.$g1619$.currentBinding(var97);
        final SubLObject var100 = module0141.$g1714$.currentBinding(var97);
        final SubLObject var101 = $g2473$.currentBinding(var97);
        final SubLObject var102 = $g2474$.currentBinding(var97);
        final SubLObject var103 = $g2480$.currentBinding(var97);
        try {
            module0137.$g1605$.bind(var93, var97);
            module0138.$g1619$.bind(var94, var97);
            module0141.$g1714$.bind(var95, var97);
            $g2473$.bind((var96 == $ic7$) ? $g2475$.getDynamicValue(var97) : $g2477$.getDynamicValue(var97), var97);
            $g2474$.bind((var96 == $ic7$) ? $g2476$.getDynamicValue(var97) : $g2478$.getDynamicValue(var97), var97);
            $g2480$.bind(var27, var97);
            f16409(var14);
        }
        finally {
            $g2480$.rebind(var103, var97);
            $g2474$.rebind(var102, var97);
            $g2473$.rebind(var101, var97);
            module0141.$g1714$.rebind(var100, var97);
            module0138.$g1619$.rebind(var99, var97);
            module0137.$g1605$.rebind(var98, var97);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16415(final SubLObject var93, final SubLObject var94, final SubLObject var95, final SubLObject var101, final SubLObject var102, final SubLObject var27, final SubLObject var14) {
        final SubLThread var103 = SubLProcess.currentSubLThread();
        assert NIL != module0137.f8885(var93) : var93;
        final SubLObject var104 = module0137.$g1605$.currentBinding(var103);
        final SubLObject var105 = module0138.$g1619$.currentBinding(var103);
        final SubLObject var106 = module0141.$g1714$.currentBinding(var103);
        final SubLObject var107 = $g2473$.currentBinding(var103);
        final SubLObject var108 = $g2474$.currentBinding(var103);
        final SubLObject var109 = module0139.$g1635$.currentBinding(var103);
        final SubLObject var110 = $g2480$.currentBinding(var103);
        try {
            module0137.$g1605$.bind(var93, var103);
            module0138.$g1619$.bind(var94, var103);
            module0141.$g1714$.bind(var95, var103);
            $g2473$.bind((var101 == $ic7$) ? $g2475$.getDynamicValue(var103) : $g2477$.getDynamicValue(var103), var103);
            $g2474$.bind((var101 == $ic7$) ? $g2476$.getDynamicValue(var103) : $g2478$.getDynamicValue(var103), var103);
            module0139.$g1635$.bind(var102, var103);
            $g2480$.bind(var27, var103);
            f16410(var14);
        }
        finally {
            $g2480$.rebind(var110, var103);
            module0139.$g1635$.rebind(var109, var103);
            $g2474$.rebind(var108, var103);
            $g2473$.rebind(var107, var103);
            module0141.$g1714$.rebind(var106, var103);
            module0138.$g1619$.rebind(var105, var103);
            module0137.$g1605$.rebind(var104, var103);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16416(final SubLObject var93, final SubLObject var94, final SubLObject var95, final SubLObject var27, final SubLObject var14) {
        final SubLThread var96 = SubLProcess.currentSubLThread();
        assert NIL != module0137.f8885(var93) : var93;
        final SubLObject var97 = module0137.$g1605$.currentBinding(var96);
        final SubLObject var98 = module0138.$g1619$.currentBinding(var96);
        final SubLObject var99 = module0141.$g1714$.currentBinding(var96);
        final SubLObject var100 = $g2480$.currentBinding(var96);
        try {
            module0137.$g1605$.bind(var93, var96);
            module0138.$g1619$.bind(var94, var96);
            module0141.$g1714$.bind(var95, var96);
            $g2480$.bind(var27, var96);
            f16411(var14);
        }
        finally {
            $g2480$.rebind(var100, var96);
            module0141.$g1714$.rebind(var99, var96);
            module0138.$g1619$.rebind(var98, var96);
            module0137.$g1605$.rebind(var97, var96);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16417(final SubLObject var93, final SubLObject var94, final SubLObject var95, final SubLObject var102, final SubLObject var27, final SubLObject var14) {
        final SubLThread var103 = SubLProcess.currentSubLThread();
        assert NIL != module0137.f8885(var93) : var93;
        final SubLObject var104 = module0137.$g1605$.currentBinding(var103);
        final SubLObject var105 = module0138.$g1619$.currentBinding(var103);
        final SubLObject var106 = module0141.$g1714$.currentBinding(var103);
        final SubLObject var107 = module0139.$g1635$.currentBinding(var103);
        final SubLObject var108 = $g2480$.currentBinding(var103);
        try {
            module0137.$g1605$.bind(var93, var103);
            module0138.$g1619$.bind(var94, var103);
            module0141.$g1714$.bind(var95, var103);
            module0139.$g1635$.bind(var102, var103);
            $g2480$.bind(var27, var103);
            f16412(var14);
        }
        finally {
            $g2480$.rebind(var108, var103);
            module0139.$g1635$.rebind(var107, var103);
            module0141.$g1714$.rebind(var106, var103);
            module0138.$g1619$.rebind(var105, var103);
            module0137.$g1605$.rebind(var104, var103);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16418(final SubLObject var93, final SubLObject var94, final SubLObject var95, final SubLObject var101, final SubLObject var27, final SubLObject var14) {
        final SubLThread var102 = SubLProcess.currentSubLThread();
        assert NIL != module0137.f8885(var93) : var93;
        final SubLObject var103 = module0137.$g1605$.currentBinding(var102);
        final SubLObject var104 = module0138.$g1619$.currentBinding(var102);
        final SubLObject var105 = module0141.$g1714$.currentBinding(var102);
        final SubLObject var106 = $g2473$.currentBinding(var102);
        final SubLObject var107 = $g2474$.currentBinding(var102);
        final SubLObject var108 = $g2480$.currentBinding(var102);
        try {
            module0137.$g1605$.bind(var93, var102);
            module0138.$g1619$.bind(var94, var102);
            module0141.$g1714$.bind(var95, var102);
            $g2473$.bind((var101 == $ic7$) ? $g2475$.getDynamicValue(var102) : $g2477$.getDynamicValue(var102), var102);
            $g2474$.bind((var101 == $ic7$) ? $g2476$.getDynamicValue(var102) : $g2478$.getDynamicValue(var102), var102);
            $g2480$.bind(var27, var102);
            f16413(var14);
        }
        finally {
            $g2480$.rebind(var108, var102);
            $g2474$.rebind(var107, var102);
            $g2473$.rebind(var106, var102);
            module0141.$g1714$.rebind(var105, var102);
            module0138.$g1619$.rebind(var104, var102);
            module0137.$g1605$.rebind(var103, var102);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16419(final SubLObject var14) {
        f16414(module0141.f9188(), module0138.f8979(), module0141.f9293(), f16381(), (SubLObject)NIL, var14);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16420(final SubLObject var14) {
        f16414(module0141.f9188(), module0138.f8980(), module0141.f9293(), f16381(), (SubLObject)$ic19$, var14);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16396(final SubLObject var14) {
        f16416(module0141.f9188(), module0244.f15782(module0141.f9211(), module0141.f9188()), module0141.f9294(), (SubLObject)$ic20$, var14);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16397(final SubLObject var14) {
        f16414(module0141.f9188(), module0138.f8980(), module0141.f9293(), f16382(), (SubLObject)NIL, var14);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16421(final SubLObject var14) {
        f16416(module0141.f9188(), module0244.f15778(module0141.f9188()), module0141.f9285(), (SubLObject)$ic21$, var14);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16398(final SubLObject var14) {
        f16414(module0244.f15771(module0141.f9188()), (NIL != module0141.f9278()) ? module0138.f8979() : module0138.f8980(), module0141.f9293(), f16381(), (SubLObject)NIL, var14);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16422(final SubLObject var14) {
        final SubLObject var15 = module0244.f15771(module0137.f8955((SubLObject)UNPROVIDED));
        f16414(var15, (NIL != module0141.f9278()) ? module0244.f15780(var15) : module0244.f15778(var15), module0141.f9293(), f16381(), (SubLObject)$ic22$, var14);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16399(final SubLObject var14) {
        f16418(module0141.f9188(), module0244.f15780(module0141.f9188()), (NIL != module0141.f9278()) ? module0141.f9293() : module0141.f9294(), f16382(), (SubLObject)NIL, var14);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16423(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        final SubLObject var16 = module0141.$g1693$.currentBinding(var15);
        try {
            module0141.$g1693$.bind((SubLObject)$ic34$, var15);
            module0250.f16182(var14);
        }
        finally {
            module0141.$g1693$.rebind(var16, var15);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16424(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        final SubLObject var16 = module0139.$g1646$.currentBinding(var15);
        try {
            module0139.$g1646$.bind(module0139.f9007(), var15);
            final SubLObject var35_105 = module0139.$g1647$.currentBinding(var15);
            try {
                module0139.$g1647$.bind(module0139.f9007(), var15);
                final SubLObject var35_106 = module0139.$g1635$.currentBinding(var15);
                final SubLObject var17 = module0139.$g1636$.currentBinding(var15);
                try {
                    module0139.$g1635$.bind(module0139.$g1646$.getDynamicValue(var15), var15);
                    module0139.$g1636$.bind(module0139.$g1647$.getDynamicValue(var15), var15);
                    f16423(f16404());
                    final SubLObject var18 = module0244.f15773(module0137.f8955((SubLObject)UNPROVIDED));
                    f16414(var18, module0244.f15778(var18), module0141.f9293(), f16381(), (SubLObject)$ic23$, var14);
                }
                finally {
                    module0139.$g1636$.rebind(var17, var15);
                    module0139.$g1635$.rebind(var35_106, var15);
                }
                module0139.f9011(module0139.$g1647$.getDynamicValue(var15));
            }
            finally {
                module0139.$g1647$.rebind(var35_105, var15);
            }
            module0139.f9011(module0139.$g1646$.getDynamicValue(var15));
        }
        finally {
            module0139.$g1646$.rebind(var16, var15);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16400(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        f16417(module0141.f9188(), module0138.f8977(), module0141.f9293(), module0139.$g1647$.getDynamicValue(var15), (SubLObject)$ic24$, var14);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16401(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        final SubLObject var16 = module0244.f15773(module0137.f8955((SubLObject)UNPROVIDED));
        f16415(f16425(), module0244.f15780(var16), module0141.f9293(), f16382(), module0139.$g1646$.getDynamicValue(var15), (SubLObject)NIL, var14);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16425() {
        if (NIL == module0244.f15752(module0141.f9188())) {
            return module0137.f8955((SubLObject)UNPROVIDED);
        }
        if (NIL != module0141.f9195()) {
            return module0137.f8955($ic30$);
        }
        return module0137.f8955($ic35$);
    }
    
    public static SubLObject f16426(final SubLObject var14) {
        final SubLObject var15 = module0244.f15773(module0137.f8955((SubLObject)UNPROVIDED));
        f16414(var15, module0244.f15780(var15), module0141.f9293(), f16381(), (SubLObject)$ic25$, var14);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16402(final SubLObject var14) {
        final SubLObject var15 = module0244.f15773(module0137.f8955((SubLObject)UNPROVIDED));
        f16414(var15, module0244.f15778(var15), module0141.f9293(), f16382(), (SubLObject)NIL, var14);
        f16416(module0141.f9188(), module0138.f8977(), module0141.f9294(), (SubLObject)$ic26$, var14);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16403(final SubLObject var14) {
        final SubLObject var15 = module0244.f15773(module0137.f8955((SubLObject)UNPROVIDED));
        f16414(var15, module0244.f15778(var15), module0141.f9293(), f16382(), (SubLObject)NIL, var14);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16427(final SubLObject var93, final SubLObject var107, final SubLObject var95) {
        assert NIL != module0137.f8885(var93) : var93;
        if (NIL != module0244.f15761(var93)) {
            if (NIL != module0141.f9279(var95)) {
                return (SubLObject)$ic36$;
            }
            return (SubLObject)$ic37$;
        }
        else if (NIL != module0244.f15770(var93)) {
            if (NIL != module0141.f9207(var107)) {
                return (SubLObject)$ic38$;
            }
            return (SubLObject)$ic39$;
        }
        else {
            if (NIL == module0244.f15768(var93)) {
                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic42$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                return (SubLObject)NIL;
            }
            if (NIL != module0141.f9279(var95)) {
                return (SubLObject)$ic40$;
            }
            return (SubLObject)$ic41$;
        }
    }
    
    public static SubLObject f16428() {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        return $g2482$.getDynamicValue(var13);
    }
    
    public static SubLObject f16429(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic1$, (SubLObject)$ic43$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f16430(final SubLObject var14) {
        final SubLObject var16;
        final SubLObject var15 = var16 = f16428();
        if (var16.eql((SubLObject)$ic36$)) {
            f16419(var14);
        }
        else if (var16.eql((SubLObject)$ic37$)) {
            f16420(var14);
        }
        else if (var16.eql((SubLObject)$ic38$)) {
            f16421(var14);
        }
        else if (var16.eql((SubLObject)$ic39$)) {
            f16422(var14);
        }
        else if (var16.eql((SubLObject)$ic40$)) {
            f16424(var14);
        }
        else if (var16.eql((SubLObject)$ic41$)) {
            f16426(var14);
        }
        else {
            module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic44$, var15, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16431() {
        final SubLObject var111;
        final SubLObject var110 = var111 = f16428();
        if (var111.eql((SubLObject)$ic36$)) {
            return f16381();
        }
        if (var111.eql((SubLObject)$ic37$)) {
            return f16382();
        }
        if (var111.eql((SubLObject)$ic38$)) {
            return f16381();
        }
        if (var111.eql((SubLObject)$ic39$)) {
            return f16382();
        }
        if (var111.eql((SubLObject)$ic40$)) {
            return f16382();
        }
        if (var111.eql((SubLObject)$ic41$)) {
            return f16382();
        }
        module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic44$, var110, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16432(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        SubLObject var16 = (SubLObject)NIL;
        final SubLObject var17 = $g2473$.currentBinding(var15);
        final SubLObject var18 = $g2474$.currentBinding(var15);
        try {
            $g2473$.bind((f16431() == $ic7$) ? $g2475$.getDynamicValue(var15) : $g2477$.getDynamicValue(var15), var15);
            $g2474$.bind((f16431() == $ic7$) ? $g2476$.getDynamicValue(var15) : $g2478$.getDynamicValue(var15), var15);
            if (module0137.f8917(module0141.f9188()).eql($ic30$) || module0137.f8917(module0141.f9188()).eql($ic29$)) {
                var16 = Hashtables.gethash(var14, $g2474$.getDynamicValue(var15), (SubLObject)UNPROVIDED);
            }
            else {
                var16 = Hashtables.gethash(var14, $g2473$.getDynamicValue(var15), (SubLObject)UNPROVIDED);
            }
        }
        finally {
            $g2474$.rebind(var18, var15);
            $g2473$.rebind(var17, var15);
        }
        return var16;
    }
    
    public static SubLObject f16433() {
        return f16432(f16404());
    }
    
    public static SubLObject f16434(final SubLObject var93, final SubLObject var14, final SubLObject var111, SubLObject var95) {
        if (var95 == UNPROVIDED) {
            var95 = (SubLObject)NIL;
        }
        final SubLThread var112 = SubLProcess.currentSubLThread();
        assert NIL != module0137.f8885(var93) : var93;
        SubLObject var113 = (SubLObject)NIL;
        final SubLObject var114 = module0141.$g1670$.currentBinding(var112);
        final SubLObject var115 = module0141.$g1671$.currentBinding(var112);
        final SubLObject var116 = module0141.$g1672$.currentBinding(var112);
        final SubLObject var117 = module0141.$g1674$.currentBinding(var112);
        final SubLObject var118 = module0137.$g1605$.currentBinding(var112);
        try {
            module0141.$g1670$.bind(var93, var112);
            module0141.$g1671$.bind(module0244.f15739(var93), var112);
            module0141.$g1672$.bind(module0244.f15746(var93), var112);
            module0141.$g1674$.bind((SubLObject)NIL, var112);
            module0137.$g1605$.bind(var93, var112);
            final SubLObject var119 = var95;
            final SubLObject var35_113 = module0141.$g1714$.currentBinding(var112);
            final SubLObject var38_114 = module0141.$g1715$.currentBinding(var112);
            try {
                module0141.$g1714$.bind((NIL != var119) ? var119 : module0141.f9283(), var112);
                module0141.$g1715$.bind((SubLObject)((NIL != var119) ? $ic45$ : module0141.$g1715$.getDynamicValue(var112)), var112);
                if (NIL != var119 && NIL != module0136.f8864() && NIL == module0141.f9279(var119)) {
                    final SubLObject var120 = module0136.$g1591$.getDynamicValue(var112);
                    if (var120.eql((SubLObject)$ic46$)) {
                        module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic47$, var119, (SubLObject)$ic48$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    else if (var120.eql((SubLObject)$ic49$)) {
                        module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic50$, (SubLObject)$ic47$, var119, (SubLObject)$ic48$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    else if (var120.eql((SubLObject)$ic51$)) {
                        Errors.warn((SubLObject)$ic47$, var119, (SubLObject)$ic48$);
                    }
                    else {
                        Errors.warn((SubLObject)$ic52$, module0136.$g1591$.getDynamicValue(var112));
                        Errors.cerror((SubLObject)$ic50$, (SubLObject)$ic47$, var119, (SubLObject)$ic48$);
                    }
                }
                final SubLObject var35_114 = module0141.$g1710$.currentBinding(var112);
                final SubLObject var38_115 = module0141.$g1677$.currentBinding(var112);
                final SubLObject var97_117 = module0138.$g1619$.currentBinding(var112);
                try {
                    module0141.$g1710$.bind($ic53$, var112);
                    module0141.$g1677$.bind(module0141.f9208(), var112);
                    module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)UNPROVIDED)), var112);
                    final SubLObject var121 = module0139.f9036();
                    final SubLObject var35_115 = module0139.$g1635$.currentBinding(var112);
                    try {
                        module0139.$g1635$.bind((var121 == $ic54$) ? module0139.$g1635$.getDynamicValue(var112) : module0139.f9038(var121), var112);
                        final SubLObject var35_116 = module0139.$g1636$.currentBinding(var112);
                        try {
                            module0139.$g1636$.bind((var121 == $ic54$) ? module0139.$g1636$.getDynamicValue(var112) : module0139.f9038(var121), var112);
                            final SubLObject var35_117 = module0141.$g1685$.currentBinding(var112);
                            final SubLObject var38_116 = module0141.$g1686$.currentBinding(var112);
                            final SubLObject var97_118 = module0141.$g1683$.currentBinding(var112);
                            final SubLObject var98_124 = module0141.$g1684$.currentBinding(var112);
                            final SubLObject var99_125 = module0141.$g1674$.currentBinding(var112);
                            try {
                                module0141.$g1685$.bind((SubLObject)NIL, var112);
                                module0141.$g1686$.bind((SubLObject)NIL, var112);
                                module0141.$g1683$.bind((SubLObject)NIL, var112);
                                module0141.$g1684$.bind((SubLObject)NIL, var112);
                                module0141.$g1674$.bind((SubLObject)NIL, var112);
                                final SubLObject var122 = module0138.$g1626$.getGlobalValue();
                                SubLObject var123 = (SubLObject)NIL;
                                try {
                                    var123 = ReadWriteLocks.rw_lock_seize_read_lock(var122);
                                    var113 = f16435(var14, var111);
                                }
                                finally {
                                    if (NIL != var123) {
                                        ReadWriteLocks.rw_lock_release_read_lock(var122);
                                    }
                                }
                            }
                            finally {
                                module0141.$g1674$.rebind(var99_125, var112);
                                module0141.$g1684$.rebind(var98_124, var112);
                                module0141.$g1683$.rebind(var97_118, var112);
                                module0141.$g1686$.rebind(var38_116, var112);
                                module0141.$g1685$.rebind(var35_117, var112);
                            }
                            if (var121 == $ic55$) {
                                module0139.f9012(module0139.$g1636$.getDynamicValue(var112));
                            }
                        }
                        finally {
                            module0139.$g1636$.rebind(var35_116, var112);
                        }
                        if (var121 == $ic55$) {
                            module0139.f9012(module0139.$g1635$.getDynamicValue(var112));
                        }
                    }
                    finally {
                        module0139.$g1635$.rebind(var35_115, var112);
                    }
                }
                finally {
                    module0138.$g1619$.rebind(var97_117, var112);
                    module0141.$g1677$.rebind(var38_115, var112);
                    module0141.$g1710$.rebind(var35_114, var112);
                }
            }
            finally {
                module0141.$g1715$.rebind(var38_114, var112);
                module0141.$g1714$.rebind(var35_113, var112);
            }
        }
        finally {
            module0137.$g1605$.rebind(var118, var112);
            module0141.$g1674$.rebind(var117, var112);
            module0141.$g1672$.rebind(var116, var112);
            module0141.$g1671$.rebind(var115, var112);
            module0141.$g1670$.rebind(var114, var112);
        }
        return var113;
    }
    
    public static SubLObject f16436(final SubLObject var93, final SubLObject var14, final SubLObject var111, SubLObject var95) {
        if (var95 == UNPROVIDED) {
            var95 = (SubLObject)NIL;
        }
        final SubLThread var112 = SubLProcess.currentSubLThread();
        assert NIL != module0137.f8885(var93) : var93;
        SubLObject var113 = (SubLObject)NIL;
        final SubLObject var114 = module0141.$g1670$.currentBinding(var112);
        final SubLObject var115 = module0141.$g1671$.currentBinding(var112);
        final SubLObject var116 = module0141.$g1672$.currentBinding(var112);
        final SubLObject var117 = module0141.$g1674$.currentBinding(var112);
        final SubLObject var118 = module0137.$g1605$.currentBinding(var112);
        try {
            module0141.$g1670$.bind(var93, var112);
            module0141.$g1671$.bind(module0244.f15739(var93), var112);
            module0141.$g1672$.bind(module0244.f15746(var93), var112);
            module0141.$g1674$.bind((SubLObject)NIL, var112);
            module0137.$g1605$.bind(var93, var112);
            final SubLObject var119 = var95;
            final SubLObject var35_128 = module0141.$g1714$.currentBinding(var112);
            final SubLObject var38_129 = module0141.$g1715$.currentBinding(var112);
            try {
                module0141.$g1714$.bind((NIL != var119) ? var119 : module0141.f9283(), var112);
                module0141.$g1715$.bind((SubLObject)((NIL != var119) ? $ic45$ : module0141.$g1715$.getDynamicValue(var112)), var112);
                if (NIL != var119 && NIL != module0136.f8864() && NIL == module0141.f9279(var119)) {
                    final SubLObject var120 = module0136.$g1591$.getDynamicValue(var112);
                    if (var120.eql((SubLObject)$ic46$)) {
                        module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic47$, var119, (SubLObject)$ic48$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    else if (var120.eql((SubLObject)$ic49$)) {
                        module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic50$, (SubLObject)$ic47$, var119, (SubLObject)$ic48$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    else if (var120.eql((SubLObject)$ic51$)) {
                        Errors.warn((SubLObject)$ic47$, var119, (SubLObject)$ic48$);
                    }
                    else {
                        Errors.warn((SubLObject)$ic52$, module0136.$g1591$.getDynamicValue(var112));
                        Errors.cerror((SubLObject)$ic50$, (SubLObject)$ic47$, var119, (SubLObject)$ic48$);
                    }
                }
                final SubLObject var35_129 = module0141.$g1710$.currentBinding(var112);
                final SubLObject var38_130 = module0141.$g1677$.currentBinding(var112);
                final SubLObject var97_132 = module0138.$g1619$.currentBinding(var112);
                try {
                    module0141.$g1710$.bind($ic53$, var112);
                    module0141.$g1677$.bind(module0141.f9210(), var112);
                    module0138.$g1619$.bind(module0244.f15780(module0137.f8955((SubLObject)UNPROVIDED)), var112);
                    final SubLObject var121 = module0139.f9036();
                    final SubLObject var35_130 = module0139.$g1635$.currentBinding(var112);
                    try {
                        module0139.$g1635$.bind((var121 == $ic54$) ? module0139.$g1635$.getDynamicValue(var112) : module0139.f9038(var121), var112);
                        final SubLObject var35_131 = module0139.$g1636$.currentBinding(var112);
                        try {
                            module0139.$g1636$.bind((var121 == $ic54$) ? module0139.$g1636$.getDynamicValue(var112) : module0139.f9038(var121), var112);
                            final SubLObject var35_132 = module0141.$g1685$.currentBinding(var112);
                            final SubLObject var38_131 = module0141.$g1686$.currentBinding(var112);
                            final SubLObject var97_133 = module0141.$g1683$.currentBinding(var112);
                            final SubLObject var98_138 = module0141.$g1684$.currentBinding(var112);
                            final SubLObject var99_139 = module0141.$g1674$.currentBinding(var112);
                            try {
                                module0141.$g1685$.bind((SubLObject)NIL, var112);
                                module0141.$g1686$.bind((SubLObject)NIL, var112);
                                module0141.$g1683$.bind((SubLObject)NIL, var112);
                                module0141.$g1684$.bind((SubLObject)NIL, var112);
                                module0141.$g1674$.bind((SubLObject)NIL, var112);
                                final SubLObject var122 = module0138.$g1626$.getGlobalValue();
                                SubLObject var123 = (SubLObject)NIL;
                                try {
                                    var123 = ReadWriteLocks.rw_lock_seize_read_lock(var122);
                                    var113 = f16435(var14, var111);
                                }
                                finally {
                                    if (NIL != var123) {
                                        ReadWriteLocks.rw_lock_release_read_lock(var122);
                                    }
                                }
                            }
                            finally {
                                module0141.$g1674$.rebind(var99_139, var112);
                                module0141.$g1684$.rebind(var98_138, var112);
                                module0141.$g1683$.rebind(var97_133, var112);
                                module0141.$g1686$.rebind(var38_131, var112);
                                module0141.$g1685$.rebind(var35_132, var112);
                            }
                            if (var121 == $ic55$) {
                                module0139.f9012(module0139.$g1636$.getDynamicValue(var112));
                            }
                        }
                        finally {
                            module0139.$g1636$.rebind(var35_131, var112);
                        }
                        if (var121 == $ic55$) {
                            module0139.f9012(module0139.$g1635$.getDynamicValue(var112));
                        }
                    }
                    finally {
                        module0139.$g1635$.rebind(var35_130, var112);
                    }
                }
                finally {
                    module0138.$g1619$.rebind(var97_132, var112);
                    module0141.$g1677$.rebind(var38_130, var112);
                    module0141.$g1710$.rebind(var35_129, var112);
                }
            }
            finally {
                module0141.$g1715$.rebind(var38_129, var112);
                module0141.$g1714$.rebind(var35_128, var112);
            }
        }
        finally {
            module0137.$g1605$.rebind(var118, var112);
            module0141.$g1674$.rebind(var117, var112);
            module0141.$g1672$.rebind(var116, var112);
            module0141.$g1671$.rebind(var115, var112);
            module0141.$g1670$.rebind(var114, var112);
        }
        return var113;
    }
    
    public static SubLObject f16437(final SubLObject var93, final SubLObject var14, final SubLObject var111, SubLObject var95) {
        if (var95 == UNPROVIDED) {
            var95 = (SubLObject)NIL;
        }
        final SubLThread var112 = SubLProcess.currentSubLThread();
        assert NIL != module0137.f8885(var93) : var93;
        SubLObject var113 = (SubLObject)NIL;
        final SubLObject var114 = module0141.$g1670$.currentBinding(var112);
        final SubLObject var115 = module0141.$g1671$.currentBinding(var112);
        final SubLObject var116 = module0141.$g1672$.currentBinding(var112);
        final SubLObject var117 = module0141.$g1674$.currentBinding(var112);
        final SubLObject var118 = module0137.$g1605$.currentBinding(var112);
        try {
            module0141.$g1670$.bind(var93, var112);
            module0141.$g1671$.bind(module0244.f15739(var93), var112);
            module0141.$g1672$.bind(module0244.f15746(var93), var112);
            module0141.$g1674$.bind((SubLObject)NIL, var112);
            module0137.$g1605$.bind(var93, var112);
            final SubLObject var119 = var95;
            final SubLObject var35_141 = module0141.$g1714$.currentBinding(var112);
            final SubLObject var38_142 = module0141.$g1715$.currentBinding(var112);
            try {
                module0141.$g1714$.bind((NIL != var119) ? var119 : module0141.f9284(), var112);
                module0141.$g1715$.bind((SubLObject)((NIL != var119) ? $ic45$ : module0141.$g1715$.getDynamicValue(var112)), var112);
                if (NIL != var119 && NIL != module0136.f8864() && NIL == module0141.f9281(var119)) {
                    final SubLObject var120 = module0136.$g1591$.getDynamicValue(var112);
                    if (var120.eql((SubLObject)$ic46$)) {
                        module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic47$, var119, (SubLObject)$ic56$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    else if (var120.eql((SubLObject)$ic49$)) {
                        module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic50$, (SubLObject)$ic47$, var119, (SubLObject)$ic56$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    else if (var120.eql((SubLObject)$ic51$)) {
                        Errors.warn((SubLObject)$ic47$, var119, (SubLObject)$ic56$);
                    }
                    else {
                        Errors.warn((SubLObject)$ic52$, module0136.$g1591$.getDynamicValue(var112));
                        Errors.cerror((SubLObject)$ic50$, (SubLObject)$ic47$, var119, (SubLObject)$ic56$);
                    }
                }
                final SubLObject var35_142 = module0141.$g1710$.currentBinding(var112);
                final SubLObject var38_143 = module0141.$g1677$.currentBinding(var112);
                final SubLObject var97_145 = module0138.$g1619$.currentBinding(var112);
                try {
                    module0141.$g1710$.bind($ic57$, var112);
                    module0141.$g1677$.bind(module0141.f9208(), var112);
                    module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)UNPROVIDED)), var112);
                    final SubLObject var121 = module0139.f9036();
                    final SubLObject var35_143 = module0139.$g1635$.currentBinding(var112);
                    try {
                        module0139.$g1635$.bind((var121 == $ic54$) ? module0139.$g1635$.getDynamicValue(var112) : module0139.f9038(var121), var112);
                        final SubLObject var35_144 = module0139.$g1636$.currentBinding(var112);
                        try {
                            module0139.$g1636$.bind((var121 == $ic54$) ? module0139.$g1636$.getDynamicValue(var112) : module0139.f9038(var121), var112);
                            final SubLObject var35_145 = module0141.$g1685$.currentBinding(var112);
                            final SubLObject var38_144 = module0141.$g1686$.currentBinding(var112);
                            final SubLObject var97_146 = module0141.$g1683$.currentBinding(var112);
                            final SubLObject var98_151 = module0141.$g1684$.currentBinding(var112);
                            final SubLObject var99_152 = module0141.$g1674$.currentBinding(var112);
                            try {
                                module0141.$g1685$.bind((SubLObject)NIL, var112);
                                module0141.$g1686$.bind((SubLObject)NIL, var112);
                                module0141.$g1683$.bind((SubLObject)NIL, var112);
                                module0141.$g1684$.bind((SubLObject)NIL, var112);
                                module0141.$g1674$.bind((SubLObject)NIL, var112);
                                final SubLObject var122 = module0138.$g1626$.getGlobalValue();
                                SubLObject var123 = (SubLObject)NIL;
                                try {
                                    var123 = ReadWriteLocks.rw_lock_seize_read_lock(var122);
                                    var113 = f16435(var14, var111);
                                }
                                finally {
                                    if (NIL != var123) {
                                        ReadWriteLocks.rw_lock_release_read_lock(var122);
                                    }
                                }
                            }
                            finally {
                                module0141.$g1674$.rebind(var99_152, var112);
                                module0141.$g1684$.rebind(var98_151, var112);
                                module0141.$g1683$.rebind(var97_146, var112);
                                module0141.$g1686$.rebind(var38_144, var112);
                                module0141.$g1685$.rebind(var35_145, var112);
                            }
                            if (var121 == $ic55$) {
                                module0139.f9012(module0139.$g1636$.getDynamicValue(var112));
                            }
                        }
                        finally {
                            module0139.$g1636$.rebind(var35_144, var112);
                        }
                        if (var121 == $ic55$) {
                            module0139.f9012(module0139.$g1635$.getDynamicValue(var112));
                        }
                    }
                    finally {
                        module0139.$g1635$.rebind(var35_143, var112);
                    }
                }
                finally {
                    module0138.$g1619$.rebind(var97_145, var112);
                    module0141.$g1677$.rebind(var38_143, var112);
                    module0141.$g1710$.rebind(var35_142, var112);
                }
            }
            finally {
                module0141.$g1715$.rebind(var38_142, var112);
                module0141.$g1714$.rebind(var35_141, var112);
            }
        }
        finally {
            module0137.$g1605$.rebind(var118, var112);
            module0141.$g1674$.rebind(var117, var112);
            module0141.$g1672$.rebind(var116, var112);
            module0141.$g1671$.rebind(var115, var112);
            module0141.$g1670$.rebind(var114, var112);
        }
        return var113;
    }
    
    public static SubLObject f16438(final SubLObject var93, final SubLObject var14, final SubLObject var111, SubLObject var95) {
        if (var95 == UNPROVIDED) {
            var95 = (SubLObject)NIL;
        }
        final SubLThread var112 = SubLProcess.currentSubLThread();
        assert NIL != module0137.f8885(var93) : var93;
        SubLObject var113 = (SubLObject)NIL;
        final SubLObject var114 = module0141.$g1670$.currentBinding(var112);
        final SubLObject var115 = module0141.$g1671$.currentBinding(var112);
        final SubLObject var116 = module0141.$g1672$.currentBinding(var112);
        final SubLObject var117 = module0141.$g1674$.currentBinding(var112);
        final SubLObject var118 = module0137.$g1605$.currentBinding(var112);
        try {
            module0141.$g1670$.bind(var93, var112);
            module0141.$g1671$.bind(module0244.f15739(var93), var112);
            module0141.$g1672$.bind(module0244.f15746(var93), var112);
            module0141.$g1674$.bind((SubLObject)NIL, var112);
            module0137.$g1605$.bind(var93, var112);
            final SubLObject var119 = var95;
            final SubLObject var35_153 = module0141.$g1714$.currentBinding(var112);
            final SubLObject var38_154 = module0141.$g1715$.currentBinding(var112);
            try {
                module0141.$g1714$.bind((NIL != var119) ? var119 : module0141.f9284(), var112);
                module0141.$g1715$.bind((SubLObject)((NIL != var119) ? $ic45$ : module0141.$g1715$.getDynamicValue(var112)), var112);
                if (NIL != var119 && NIL != module0136.f8864() && NIL == module0141.f9281(var119)) {
                    final SubLObject var120 = module0136.$g1591$.getDynamicValue(var112);
                    if (var120.eql((SubLObject)$ic46$)) {
                        module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic47$, var119, (SubLObject)$ic56$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    else if (var120.eql((SubLObject)$ic49$)) {
                        module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic50$, (SubLObject)$ic47$, var119, (SubLObject)$ic56$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    else if (var120.eql((SubLObject)$ic51$)) {
                        Errors.warn((SubLObject)$ic47$, var119, (SubLObject)$ic56$);
                    }
                    else {
                        Errors.warn((SubLObject)$ic52$, module0136.$g1591$.getDynamicValue(var112));
                        Errors.cerror((SubLObject)$ic50$, (SubLObject)$ic47$, var119, (SubLObject)$ic56$);
                    }
                }
                final SubLObject var35_154 = module0141.$g1710$.currentBinding(var112);
                final SubLObject var38_155 = module0141.$g1677$.currentBinding(var112);
                final SubLObject var97_157 = module0138.$g1619$.currentBinding(var112);
                try {
                    module0141.$g1710$.bind($ic57$, var112);
                    module0141.$g1677$.bind(module0141.f9210(), var112);
                    module0138.$g1619$.bind(module0244.f15780(module0137.f8955((SubLObject)UNPROVIDED)), var112);
                    final SubLObject var121 = module0139.f9036();
                    final SubLObject var35_155 = module0139.$g1635$.currentBinding(var112);
                    try {
                        module0139.$g1635$.bind((var121 == $ic54$) ? module0139.$g1635$.getDynamicValue(var112) : module0139.f9038(var121), var112);
                        final SubLObject var35_156 = module0139.$g1636$.currentBinding(var112);
                        try {
                            module0139.$g1636$.bind((var121 == $ic54$) ? module0139.$g1636$.getDynamicValue(var112) : module0139.f9038(var121), var112);
                            final SubLObject var35_157 = module0141.$g1685$.currentBinding(var112);
                            final SubLObject var38_156 = module0141.$g1686$.currentBinding(var112);
                            final SubLObject var97_158 = module0141.$g1683$.currentBinding(var112);
                            final SubLObject var98_163 = module0141.$g1684$.currentBinding(var112);
                            final SubLObject var99_164 = module0141.$g1674$.currentBinding(var112);
                            try {
                                module0141.$g1685$.bind((SubLObject)NIL, var112);
                                module0141.$g1686$.bind((SubLObject)NIL, var112);
                                module0141.$g1683$.bind((SubLObject)NIL, var112);
                                module0141.$g1684$.bind((SubLObject)NIL, var112);
                                module0141.$g1674$.bind((SubLObject)NIL, var112);
                                final SubLObject var122 = module0138.$g1626$.getGlobalValue();
                                SubLObject var123 = (SubLObject)NIL;
                                try {
                                    var123 = ReadWriteLocks.rw_lock_seize_read_lock(var122);
                                    var113 = f16435(var14, var111);
                                }
                                finally {
                                    if (NIL != var123) {
                                        ReadWriteLocks.rw_lock_release_read_lock(var122);
                                    }
                                }
                            }
                            finally {
                                module0141.$g1674$.rebind(var99_164, var112);
                                module0141.$g1684$.rebind(var98_163, var112);
                                module0141.$g1683$.rebind(var97_158, var112);
                                module0141.$g1686$.rebind(var38_156, var112);
                                module0141.$g1685$.rebind(var35_157, var112);
                            }
                            if (var121 == $ic55$) {
                                module0139.f9012(module0139.$g1636$.getDynamicValue(var112));
                            }
                        }
                        finally {
                            module0139.$g1636$.rebind(var35_156, var112);
                        }
                        if (var121 == $ic55$) {
                            module0139.f9012(module0139.$g1635$.getDynamicValue(var112));
                        }
                    }
                    finally {
                        module0139.$g1635$.rebind(var35_155, var112);
                    }
                }
                finally {
                    module0138.$g1619$.rebind(var97_157, var112);
                    module0141.$g1677$.rebind(var38_155, var112);
                    module0141.$g1710$.rebind(var35_154, var112);
                }
            }
            finally {
                module0141.$g1715$.rebind(var38_154, var112);
                module0141.$g1714$.rebind(var35_153, var112);
            }
        }
        finally {
            module0137.$g1605$.rebind(var118, var112);
            module0141.$g1674$.rebind(var117, var112);
            module0141.$g1672$.rebind(var116, var112);
            module0141.$g1671$.rebind(var115, var112);
            module0141.$g1670$.rebind(var114, var112);
        }
        return var113;
    }
    
    public static SubLObject f16435(final SubLObject var165, final SubLObject var166) {
        final SubLThread var167 = SubLProcess.currentSubLThread();
        SubLObject var168 = (SubLObject)NIL;
        if (var165.equal(var166)) {
            var168 = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0132.$g1543$.getGlobalValue()));
        }
        else {
            final SubLObject var169 = module0141.$g1664$.currentBinding(var167);
            final SubLObject var170 = module0147.$g2094$.currentBinding(var167);
            final SubLObject var171 = module0147.$g2095$.currentBinding(var167);
            final SubLObject var172 = $g2475$.currentBinding(var167);
            final SubLObject var173 = $g2476$.currentBinding(var167);
            final SubLObject var174 = $g2477$.currentBinding(var167);
            final SubLObject var175 = $g2478$.currentBinding(var167);
            final SubLObject var176 = $g2481$.currentBinding(var167);
            final SubLObject var177 = $g2482$.currentBinding(var167);
            try {
                module0141.$g1664$.bind((SubLObject)$ic58$, var167);
                module0147.$g2094$.bind((SubLObject)$ic59$, var167);
                module0147.$g2095$.bind($ic60$, var167);
                $g2475$.bind(module0139.f9010(), var167);
                $g2476$.bind(module0139.f9010(), var167);
                $g2477$.bind(module0139.f9010(), var167);
                $g2478$.bind(module0139.f9010(), var167);
                $g2481$.bind(var166, var167);
                $g2482$.bind(f16427(module0141.f9188(), module0141.f9211(), module0141.f9285()), var167);
                f16430(var165);
                var168 = f16433();
            }
            finally {
                $g2482$.rebind(var177, var167);
                $g2481$.rebind(var176, var167);
                $g2478$.rebind(var175, var167);
                $g2477$.rebind(var174, var167);
                $g2476$.rebind(var173, var167);
                $g2475$.rebind(var172, var167);
                module0147.$g2095$.rebind(var171, var167);
                module0147.$g2094$.rebind(var170, var167);
                module0141.$g1664$.rebind(var169, var167);
            }
        }
        return var168;
    }
    
    public static SubLObject f16439(final SubLObject var169) {
        SubLObject var170 = (SubLObject)NIL;
        SubLObject var171 = var169;
        SubLObject var172 = (SubLObject)NIL;
        var172 = var171.first();
        while (NIL != var171) {
            var172 = module0132.f8602(var172);
            final SubLObject var173 = module0252.f16262(module0137.f8955($ic61$), var172, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var174 = (SubLObject)NIL;
            if (NIL == var174) {
                SubLObject var175 = var170;
                SubLObject var176 = (SubLObject)NIL;
                var176 = var175.first();
                while (NIL == var174 && NIL != var175) {
                    if (NIL != conses_high.subsetp(var176, var173, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        var174 = (SubLObject)T;
                    }
                    if (NIL == var174 && NIL != conses_high.subsetp(var173, var176, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        var170 = Sequences.remove(var176, var170, (SubLObject)EQUAL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    var175 = var175.rest();
                    var176 = var175.first();
                }
            }
            if (NIL == var174) {
                var170 = (SubLObject)ConsesLow.cons(var173, var170);
            }
            var171 = var171.rest();
            var172 = var171.first();
        }
        return var170;
    }
    
    public static SubLObject f16440(final SubLObject var93, final SubLObject var14, final SubLObject var111, SubLObject var95) {
        if (var95 == UNPROVIDED) {
            var95 = (SubLObject)NIL;
        }
        assert NIL != module0137.f8885(var93) : var93;
        return f16439(f16434(var93, var14, var111, var95));
    }
    
    public static SubLObject f16441(final SubLObject var93, final SubLObject var14, final SubLObject var111, SubLObject var95) {
        if (var95 == UNPROVIDED) {
            var95 = (SubLObject)NIL;
        }
        assert NIL != module0137.f8885(var93) : var93;
        return f16439(f16436(var93, var14, var111, var95));
    }
    
    public static SubLObject f16442(final SubLObject var93, final SubLObject var14, final SubLObject var111, SubLObject var95) {
        if (var95 == UNPROVIDED) {
            var95 = (SubLObject)NIL;
        }
        assert NIL != module0137.f8885(var93) : var93;
        return f16439(f16437(var93, var14, var111, var95));
    }
    
    public static SubLObject f16443(final SubLObject var93, final SubLObject var14, final SubLObject var111, SubLObject var95) {
        if (var95 == UNPROVIDED) {
            var95 = (SubLObject)NIL;
        }
        assert NIL != module0137.f8885(var93) : var93;
        return f16439(f16438(var93, var14, var111, var95));
    }
    
    public static SubLObject f16444(final SubLObject var173) {
        return module0252.f16316(module0137.f8955($ic61$), var173, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f16445(final SubLObject var175) {
        final SubLThread var176 = SubLProcess.currentSubLThread();
        SubLObject var177 = (SubLObject)NIL;
        final SubLObject var178 = $g2479$.currentBinding(var176);
        try {
            $g2479$.bind((SubLObject)NIL, var176);
            var177 = module0252.f16260(module0137.f8955($ic61$), Sequences.creduce((SubLObject)$ic62$, Sequences.delete((SubLObject)NIL, Mapping.mapcar((SubLObject)$ic63$, var175), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)ZERO_INTEGER, (SubLObject)NIL, (SubLObject)NIL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL != f16391()) {
                module0136.f8872((SubLObject)ONE_INTEGER, (SubLObject)$ic64$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        finally {
            $g2479$.rebind(var178, var176);
        }
        return var177;
    }
    
    public static SubLObject f16446(final SubLObject var93, final SubLObject var14, final SubLObject var111, SubLObject var95) {
        if (var95 == UNPROVIDED) {
            var95 = (SubLObject)NIL;
        }
        assert NIL != module0137.f8885(var93) : var93;
        return f16445(f16440(var93, var14, var111, var95));
    }
    
    public static SubLObject f16447(final SubLObject var93, final SubLObject var14, final SubLObject var111, SubLObject var95) {
        if (var95 == UNPROVIDED) {
            var95 = (SubLObject)NIL;
        }
        assert NIL != module0137.f8885(var93) : var93;
        return f16445(f16441(var93, var14, var111, var95));
    }
    
    public static SubLObject f16448(final SubLObject var93, final SubLObject var14, final SubLObject var111, SubLObject var95) {
        if (var95 == UNPROVIDED) {
            var95 = (SubLObject)NIL;
        }
        assert NIL != module0137.f8885(var93) : var93;
        return f16445(f16442(var93, var14, var111, var95));
    }
    
    public static SubLObject f16449(final SubLObject var93, final SubLObject var14, final SubLObject var111, SubLObject var95) {
        if (var95 == UNPROVIDED) {
            var95 = (SubLObject)NIL;
        }
        assert NIL != module0137.f8885(var93) : var93;
        return f16445(f16443(var93, var14, var111, var95));
    }
    
    public static SubLObject f16450(final SubLObject var93, final SubLObject var14, final SubLObject var111, SubLObject var176, SubLObject var95) {
        if (var176 == UNPROVIDED) {
            var176 = (SubLObject)NIL;
        }
        if (var95 == UNPROVIDED) {
            var95 = (SubLObject)NIL;
        }
        final SubLThread var177 = SubLProcess.currentSubLThread();
        assert NIL != module0137.f8885(var93) : var93;
        final SubLObject var178 = f16440(var93, var14, var111, var95);
        SubLObject var179 = (NIL != var176) ? var176 : module0139.f9010();
        if (NIL == var178) {
            return (SubLObject)$ic65$;
        }
        final SubLObject var180 = module0147.$g2094$.currentBinding(var177);
        final SubLObject var181 = module0147.$g2095$.currentBinding(var177);
        try {
            module0147.$g2094$.bind((SubLObject)$ic59$, var177);
            module0147.$g2095$.bind($ic60$, var177);
            var179 = f16451(module0137.f8955($ic61$), var178, var179, (SubLObject)NIL, var95);
        }
        finally {
            module0147.$g2095$.rebind(var181, var177);
            module0147.$g2094$.rebind(var180, var177);
        }
        return var179;
    }
    
    public static SubLObject f16451(final SubLObject var93, final SubLObject var179, final SubLObject var180, SubLObject var5, SubLObject var95) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        if (var95 == UNPROVIDED) {
            var95 = (SubLObject)NIL;
        }
        final SubLThread var181 = SubLProcess.currentSubLThread();
        assert NIL != module0137.f8885(var93) : var93;
        final SubLObject var182 = module0141.$g1670$.currentBinding(var181);
        final SubLObject var183 = module0141.$g1671$.currentBinding(var181);
        final SubLObject var184 = module0141.$g1672$.currentBinding(var181);
        final SubLObject var185 = module0141.$g1674$.currentBinding(var181);
        final SubLObject var186 = module0137.$g1605$.currentBinding(var181);
        try {
            module0141.$g1670$.bind(var93, var181);
            module0141.$g1671$.bind(module0244.f15739(var93), var181);
            module0141.$g1672$.bind(module0244.f15746(var93), var181);
            module0141.$g1674$.bind((SubLObject)NIL, var181);
            module0137.$g1605$.bind(var93, var181);
            final SubLObject var187 = var5;
            final SubLObject var35_182 = module0147.$g2095$.currentBinding(var181);
            final SubLObject var38_183 = module0147.$g2094$.currentBinding(var181);
            final SubLObject var97_184 = module0147.$g2096$.currentBinding(var181);
            try {
                module0147.$g2095$.bind(module0147.f9545(var187), var181);
                module0147.$g2094$.bind(module0147.f9546(var187), var181);
                module0147.$g2096$.bind(module0147.f9549(var187), var181);
                final SubLObject var188 = var95;
                final SubLObject var35_183 = module0141.$g1714$.currentBinding(var181);
                final SubLObject var38_184 = module0141.$g1715$.currentBinding(var181);
                try {
                    module0141.$g1714$.bind((NIL != var188) ? var188 : module0141.f9283(), var181);
                    module0141.$g1715$.bind((SubLObject)((NIL != var188) ? $ic45$ : module0141.$g1715$.getDynamicValue(var181)), var181);
                    if (NIL != var188 && NIL != module0136.f8864() && NIL == module0141.f9279(var188)) {
                        final SubLObject var189 = module0136.$g1591$.getDynamicValue(var181);
                        if (var189.eql((SubLObject)$ic46$)) {
                            module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic47$, var188, (SubLObject)$ic48$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        else if (var189.eql((SubLObject)$ic49$)) {
                            module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic50$, (SubLObject)$ic47$, var188, (SubLObject)$ic48$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        else if (var189.eql((SubLObject)$ic51$)) {
                            Errors.warn((SubLObject)$ic47$, var188, (SubLObject)$ic48$);
                        }
                        else {
                            Errors.warn((SubLObject)$ic52$, module0136.$g1591$.getDynamicValue(var181));
                            Errors.cerror((SubLObject)$ic50$, (SubLObject)$ic47$, var188, (SubLObject)$ic48$);
                        }
                    }
                    final SubLObject var35_184 = module0141.$g1710$.currentBinding(var181);
                    final SubLObject var38_185 = module0141.$g1677$.currentBinding(var181);
                    final SubLObject var97_185 = module0138.$g1619$.currentBinding(var181);
                    try {
                        module0141.$g1710$.bind($ic53$, var181);
                        module0141.$g1677$.bind(module0141.f9210(), var181);
                        module0138.$g1619$.bind(module0244.f15780(module0137.f8955((SubLObject)UNPROVIDED)), var181);
                        final SubLObject var190 = module0139.f9036();
                        final SubLObject var35_185 = module0139.$g1635$.currentBinding(var181);
                        try {
                            module0139.$g1635$.bind((var190 == $ic54$) ? module0139.$g1635$.getDynamicValue(var181) : module0139.f9038(var190), var181);
                            final SubLObject var35_186 = module0139.$g1636$.currentBinding(var181);
                            try {
                                module0139.$g1636$.bind((var190 == $ic54$) ? module0139.$g1636$.getDynamicValue(var181) : module0139.f9038(var190), var181);
                                final SubLObject var35_187 = module0141.$g1685$.currentBinding(var181);
                                final SubLObject var38_186 = module0141.$g1686$.currentBinding(var181);
                                final SubLObject var97_186 = module0141.$g1683$.currentBinding(var181);
                                final SubLObject var98_195 = module0141.$g1684$.currentBinding(var181);
                                final SubLObject var99_196 = module0141.$g1674$.currentBinding(var181);
                                try {
                                    module0141.$g1685$.bind((SubLObject)NIL, var181);
                                    module0141.$g1686$.bind((SubLObject)NIL, var181);
                                    module0141.$g1683$.bind((SubLObject)NIL, var181);
                                    module0141.$g1684$.bind((SubLObject)NIL, var181);
                                    module0141.$g1674$.bind((SubLObject)NIL, var181);
                                    final SubLObject var191 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var192 = (SubLObject)NIL;
                                    try {
                                        var192 = ReadWriteLocks.rw_lock_seize_read_lock(var191);
                                        f16452(var179, var180);
                                    }
                                    finally {
                                        if (NIL != var192) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var191);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var99_196, var181);
                                    module0141.$g1684$.rebind(var98_195, var181);
                                    module0141.$g1683$.rebind(var97_186, var181);
                                    module0141.$g1686$.rebind(var38_186, var181);
                                    module0141.$g1685$.rebind(var35_187, var181);
                                }
                                if (var190 == $ic55$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var181));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var35_186, var181);
                            }
                            if (var190 == $ic55$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var181));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var35_185, var181);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var97_185, var181);
                        module0141.$g1677$.rebind(var38_185, var181);
                        module0141.$g1710$.rebind(var35_184, var181);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var38_184, var181);
                    module0141.$g1714$.rebind(var35_183, var181);
                }
            }
            finally {
                module0147.$g2096$.rebind(var97_184, var181);
                module0147.$g2094$.rebind(var38_183, var181);
                module0147.$g2095$.rebind(var35_182, var181);
            }
        }
        finally {
            module0137.$g1605$.rebind(var186, var181);
            module0141.$g1674$.rebind(var185, var181);
            module0141.$g1672$.rebind(var184, var181);
            module0141.$g1671$.rebind(var183, var181);
            module0141.$g1670$.rebind(var182, var181);
        }
        return var180;
    }
    
    public static SubLObject f16452(final SubLObject var179, final SubLObject var197) {
        final SubLThread var198 = SubLProcess.currentSubLThread();
        SubLObject var199 = f16453(module0035.f2269(var179, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
        final SubLObject var200 = (NIL != module0244.f15770(module0137.f8955((SubLObject)UNPROVIDED))) ? module0244.f15774(module0137.f8955((SubLObject)UNPROVIDED)) : module0137.f8955((SubLObject)UNPROVIDED);
        final SubLObject var201 = module0250.f16095(var200, module0141.f9211(), module0141.f9285());
        if (NIL != var179) {
            if (NIL != module0035.f1997(var179)) {
                final SubLObject var202 = module0141.$g1670$.currentBinding(var198);
                final SubLObject var203 = module0141.$g1671$.currentBinding(var198);
                final SubLObject var204 = module0141.$g1672$.currentBinding(var198);
                final SubLObject var205 = module0141.$g1674$.currentBinding(var198);
                final SubLObject var206 = module0137.$g1605$.currentBinding(var198);
                final SubLObject var207 = module0141.$g1665$.currentBinding(var198);
                try {
                    module0141.$g1670$.bind(var200, var198);
                    module0141.$g1671$.bind(module0244.f15739(var200), var198);
                    module0141.$g1672$.bind(module0244.f15746(var200), var198);
                    module0141.$g1674$.bind((SubLObject)NIL, var198);
                    module0137.$g1605$.bind(var200, var198);
                    module0141.$g1665$.bind(var201, var198);
                    module0251.f16205(var179.first(), var197);
                }
                finally {
                    module0141.$g1665$.rebind(var207, var198);
                    module0137.$g1605$.rebind(var206, var198);
                    module0141.$g1674$.rebind(var205, var198);
                    module0141.$g1672$.rebind(var204, var198);
                    module0141.$g1671$.rebind(var203, var198);
                    module0141.$g1670$.rebind(var202, var198);
                }
            }
            else {
                SubLObject var208 = (SubLObject)NIL;
                SubLObject var209 = (SubLObject)NIL;
                if (NIL != module0249.f16089(var197)) {
                    final SubLObject var210 = var179.first();
                    var199 = var179.rest();
                    module0251.f16205(var210, var197);
                }
                final SubLObject var211 = module0139.$g1646$.currentBinding(var198);
                final SubLObject var212 = module0139.$g1635$.currentBinding(var198);
                try {
                    module0139.$g1646$.bind(var197, var198);
                    module0139.$g1635$.bind(module0139.f9007(), var198);
                    if (NIL == var208) {
                        SubLObject var213 = var199;
                        SubLObject var214 = (SubLObject)NIL;
                        var214 = var213.first();
                        while (NIL == var208 && NIL != var213) {
                            var209 = module0252.f16312(var214);
                            final SubLObject var35_204 = module0141.$g1686$.currentBinding(var198);
                            try {
                                module0141.$g1686$.bind((SubLObject)NIL, var198);
                                if (NIL != var209) {
                                    final SubLObject var35_205 = module0141.$g1670$.currentBinding(var198);
                                    final SubLObject var38_206 = module0141.$g1671$.currentBinding(var198);
                                    final SubLObject var215 = module0141.$g1672$.currentBinding(var198);
                                    final SubLObject var216 = module0141.$g1674$.currentBinding(var198);
                                    final SubLObject var217 = module0137.$g1605$.currentBinding(var198);
                                    final SubLObject var218 = module0141.$g1665$.currentBinding(var198);
                                    try {
                                        module0141.$g1670$.bind(var200, var198);
                                        module0141.$g1671$.bind(module0244.f15739(var200), var198);
                                        module0141.$g1672$.bind(module0244.f15746(var200), var198);
                                        module0141.$g1674$.bind((SubLObject)NIL, var198);
                                        module0137.$g1605$.bind(var200, var198);
                                        module0141.$g1665$.bind(var201, var198);
                                        module0139.f9058();
                                        final SubLObject var35_206 = module0139.$g1635$.currentBinding(var198);
                                        try {
                                            module0139.$g1635$.bind(module0139.$g1646$.getDynamicValue(var198), var198);
                                            SubLObject var219 = var209;
                                            SubLObject var220 = (SubLObject)NIL;
                                            var220 = var219.first();
                                            while (NIL != var219) {
                                                module0251.f16203(var220);
                                                var219 = var219.rest();
                                                var220 = var219.first();
                                            }
                                        }
                                        finally {
                                            module0139.$g1635$.rebind(var35_206, var198);
                                        }
                                        final SubLObject var35_207 = module0138.$g1619$.currentBinding(var198);
                                        try {
                                            module0138.$g1619$.bind(module0138.f8980(), var198);
                                            SubLObject var219 = var209;
                                            SubLObject var220 = (SubLObject)NIL;
                                            var220 = var219.first();
                                            while (NIL != var219) {
                                                module0251.f16211(var220);
                                                var219 = var219.rest();
                                                var220 = var219.first();
                                            }
                                        }
                                        finally {
                                            module0138.$g1619$.rebind(var35_207, var198);
                                        }
                                    }
                                    finally {
                                        module0141.$g1665$.rebind(var218, var198);
                                        module0137.$g1605$.rebind(var217, var198);
                                        module0141.$g1674$.rebind(var216, var198);
                                        module0141.$g1672$.rebind(var215, var198);
                                        module0141.$g1671$.rebind(var38_206, var198);
                                        module0141.$g1670$.rebind(var35_205, var198);
                                    }
                                }
                                else {
                                    module0139.f9058();
                                    var208 = (SubLObject)T;
                                }
                            }
                            finally {
                                module0141.$g1686$.rebind(var35_204, var198);
                            }
                            var213 = var213.rest();
                            var214 = var213.first();
                        }
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var198));
                }
                finally {
                    module0139.$g1635$.rebind(var212, var198);
                    module0139.$g1646$.rebind(var211, var198);
                }
            }
        }
        return var197;
    }
    
    public static SubLObject f16453(final SubLObject var179, SubLObject var93) {
        if (var93 == UNPROVIDED) {
            var93 = (SubLObject)NIL;
        }
        final SubLThread var180 = SubLProcess.currentSubLThread();
        SubLObject var181 = (SubLObject)NIL;
        if (NIL != var93) {
            final SubLObject var182 = module0137.$g1605$.currentBinding(var180);
            try {
                module0137.$g1605$.bind(var93, var180);
                var181 = Sort.sort(var179, (SubLObject)$ic66$, (SubLObject)UNPROVIDED);
            }
            finally {
                module0137.$g1605$.rebind(var182, var180);
            }
        }
        else {
            var181 = Sort.sort(var179, (SubLObject)$ic66$, (SubLObject)UNPROVIDED);
        }
        return var181;
    }
    
    public static SubLObject f16454(final SubLObject var165, final SubLObject var166) {
        return Numbers.numL(module0244.f15786(module0244.f15736(module0137.f8955((SubLObject)UNPROVIDED)), var165), module0244.f15786(module0244.f15736(module0137.f8955((SubLObject)UNPROVIDED)), var166));
    }
    
    public static SubLObject f16455() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0253", "f16378", "S#19114");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16379", "S#19115", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0253", "f16380", "S#19116");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16381", "S#19117", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16382", "S#19118", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0253", "f16383", "S#19119");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16384", "S#19120", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16385", "S#19121", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16386", "S#19122", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16387", "S#19123", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16388", "S#18853", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16389", "S#18606", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0253", "f16390", "S#19124");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16391", "S#19125", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0253", "f16392", "S#19126");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16393", "S#19127", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16394", "S#19128", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16395", "S#19129", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16404", "S#19130", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0253", "f16405", "S#19131");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16406", "S#19132", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16407", "S#19133", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16408", "S#19134", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16409", "S#19135", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16410", "S#19136", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16411", "S#19137", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16412", "S#19138", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16413", "S#19139", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16414", "S#19140", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16415", "S#19141", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16416", "S#19142", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16417", "S#19143", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16418", "S#19144", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16419", "S#19145", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16420", "S#19146", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16396", "S#19147", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16397", "S#19148", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16421", "S#19149", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16398", "S#19150", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16422", "S#19151", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16399", "S#19152", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16423", "S#19153", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16424", "S#19154", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16400", "S#19155", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16401", "S#19156", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16425", "S#19157", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16426", "S#19158", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16402", "S#19159", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16403", "S#19160", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16427", "S#19161", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16428", "S#19162", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0253", "f16429", "S#19163");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16430", "S#19164", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16431", "S#19165", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16432", "S#19166", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16433", "S#19167", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16434", "S#19168", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16436", "S#19169", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16437", "S#19170", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16438", "S#19171", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16435", "S#19172", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16439", "S#19173", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16440", "S#19174", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16441", "S#19175", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16442", "S#19176", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16443", "S#19177", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16444", "S#19113", 1, 0, false);
        new $f16444$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16445", "S#19178", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16446", "S#19179", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16447", "S#19180", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16448", "S#19181", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16449", "S#19182", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16450", "S#19183", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16451", "S#19184", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16452", "S#19185", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16453", "S#19186", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0253", "f16454", "S#19187", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16456() {
        $g2472$ = SubLFiles.defparameter("S#19188", (SubLObject)NIL);
        $g2473$ = SubLFiles.defparameter("S#19189", (SubLObject)NIL);
        $g2474$ = SubLFiles.defparameter("S#19190", (SubLObject)NIL);
        $g2475$ = SubLFiles.defparameter("S#19191", (SubLObject)NIL);
        $g2476$ = SubLFiles.defparameter("S#19192", (SubLObject)NIL);
        $g2477$ = SubLFiles.defparameter("S#19193", (SubLObject)NIL);
        $g2478$ = SubLFiles.defparameter("S#19194", (SubLObject)NIL);
        $g2479$ = SubLFiles.defparameter("S#19195", (SubLObject)NIL);
        $g2480$ = SubLFiles.defparameter("S#19196", (SubLObject)NIL);
        $g2481$ = SubLFiles.defparameter("S#19197", (SubLObject)NIL);
        $g2482$ = SubLFiles.defparameter("S#19198", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16457() {
        module0002.f50((SubLObject)$ic3$, (SubLObject)$ic5$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f16455();
    }
    
    public void initializeVariables() {
        f16456();
    }
    
    public void runTopLevelForms() {
        f16457();
    }
    
    static {
        me = (SubLFile)new module0253();
        $g2472$ = null;
        $g2473$ = null;
        $g2474$ = null;
        $g2475$ = null;
        $g2476$ = null;
        $g2477$ = null;
        $g2478$ = null;
        $g2479$ = null;
        $g2480$ = null;
        $g2481$ = null;
        $g2482$ = null;
        $ic0$ = ConsesLow.list((SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic1$ = makeSymbol("CLET");
        $ic2$ = makeSymbol("S#19188", "CYC");
        $ic3$ = makeSymbol("S#19115", "CYC");
        $ic4$ = ConsesLow.list((SubLObject)makeSymbol("S#19188", "CYC"));
        $ic5$ = makeSymbol("S#19114", "CYC");
        $ic6$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#19191", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11278", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#19192", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11278", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#19193", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11278", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#19194", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11278", "CYC"))));
        $ic7$ = makeKeyword("PRIMARY");
        $ic8$ = makeKeyword("SECONDARY");
        $ic9$ = ConsesLow.list((SubLObject)makeSymbol("S#19199", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic10$ = makeSymbol("S#19189", "CYC");
        $ic11$ = makeSymbol("FIF");
        $ic12$ = ConsesLow.list((SubLObject)makeKeyword("PRIMARY"));
        $ic13$ = ConsesLow.list((SubLObject)makeSymbol("S#19191", "CYC"), (SubLObject)makeSymbol("S#19193", "CYC"));
        $ic14$ = makeSymbol("S#19190", "CYC");
        $ic15$ = ConsesLow.list((SubLObject)makeSymbol("S#19192", "CYC"), (SubLObject)makeSymbol("S#19194", "CYC"));
        $ic16$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#19195", "CYC"), (SubLObject)NIL));
        $ic17$ = ConsesLow.list((SubLObject)makeSymbol("S#11675", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic18$ = makeSymbol("S#19196", "CYC");
        $ic19$ = makeSymbol("S#19147", "CYC");
        $ic20$ = makeSymbol("S#19148", "CYC");
        $ic21$ = makeSymbol("S#19150", "CYC");
        $ic22$ = makeSymbol("S#19152", "CYC");
        $ic23$ = makeSymbol("S#19155", "CYC");
        $ic24$ = makeSymbol("S#19156", "CYC");
        $ic25$ = makeSymbol("S#19159", "CYC");
        $ic26$ = makeSymbol("S#19160", "CYC");
        $ic27$ = ConsesLow.list((SubLObject)makeSymbol("S#9182", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic28$ = makeSymbol("S#19197", "CYC");
        $ic29$ = constant_handles_oc.f8479((SubLObject)makeString("negationInverse"));
        $ic30$ = constant_handles_oc.f8479((SubLObject)makeString("genlInverse"));
        $ic31$ = makeString("~A is neither SET-P nor LISTP.");
        $ic32$ = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic33$ = makeSymbol("S#11099", "CYC");
        $ic34$ = makeSymbol("S#18847", "CYC");
        $ic35$ = constant_handles_oc.f8479((SubLObject)makeString("genlPreds"));
        $ic36$ = makeSymbol("S#19145", "CYC");
        $ic37$ = makeSymbol("S#19146", "CYC");
        $ic38$ = makeSymbol("S#19149", "CYC");
        $ic39$ = makeSymbol("S#19151", "CYC");
        $ic40$ = makeSymbol("S#19154", "CYC");
        $ic41$ = makeSymbol("S#19158", "CYC");
        $ic42$ = makeString("Search behavior not recognized. Sorry.");
        $ic43$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#19198", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#19161", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11495", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11518", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11588", "CYC")))));
        $ic44$ = makeString("Unsupported what mts behavior ~a");
        $ic45$ = makeSymbol("S#11450", "CYC");
        $ic46$ = makeKeyword("ERROR");
        $ic47$ = makeString("~A is not a ~A");
        $ic48$ = makeSymbol("S#11592", "CYC");
        $ic49$ = makeKeyword("CERROR");
        $ic50$ = makeString("continue anyway");
        $ic51$ = makeKeyword("WARN");
        $ic52$ = makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic53$ = constant_handles_oc.f8479((SubLObject)makeString("True-JustificationTruth"));
        $ic54$ = makeKeyword("OLD");
        $ic55$ = makeKeyword("RESOURCE");
        $ic56$ = makeSymbol("S#11593", "CYC");
        $ic57$ = constant_handles_oc.f8479((SubLObject)makeString("False-JustificationTruth"));
        $ic58$ = makeKeyword("WHAT-MTS");
        $ic59$ = makeSymbol("S#12274", "CYC");
        $ic60$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic61$ = constant_handles_oc.f8479((SubLObject)makeString("genlMt"));
        $ic62$ = makeSymbol("UNION");
        $ic63$ = makeSymbol("S#19113", "CYC");
        $ic64$ = makeString("Mts might not be valid because initial node was a NAUT which used complicated link generation.");
        $ic65$ = makeKeyword("NONE");
        $ic66$ = makeSymbol("S#19187", "CYC");
    }
    
    public static final class $f16444$UnaryFunction extends UnaryFunction
    {
        public $f16444$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#19113"));
        }
        
        public SubLObject processItem(final SubLObject var174) {
            return f16444(var174);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 1078 ms
	
	Decompiled with Procyon 0.5.32.
*/