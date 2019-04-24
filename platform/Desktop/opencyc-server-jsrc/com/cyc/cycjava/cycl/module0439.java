package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0439 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0439";
    public static final String myFingerPrint = "0487ecc17a4c3581d9933c502625297a4b0addca63de94772b27ec18ced01558";
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLList $ic2$;
    private static final SubLList $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLList $ic14$;
    private static final SubLList $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLList $ic19$;
    private static final SubLObject $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLObject $ic22$;
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
    private static final SubLString $ic33$;
    private static final SubLObject $ic34$;
    private static final SubLString $ic35$;
    private static final SubLString $ic36$;
    private static final SubLString $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLObject $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLList $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLList $ic52$;
    private static final SubLObject $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLList $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLList $ic57$;
    private static final SubLObject $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLList $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLList $ic62$;
    private static final SubLObject $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLList $ic65$;
    
    public static SubLObject f30674(final SubLObject var1) {
        return (SubLObject)ConsesLow.list(module0205.f13333(var1), module0205.f13388(var1, (SubLObject)module0439.UNPROVIDED), module0205.f13387(var1, (SubLObject)module0439.UNPROVIDED));
    }
    
    public static SubLObject f30675(final SubLObject var1) {
        return f30674(var1);
    }
    
    public static SubLObject f30676(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0439.$ic2$);
        final SubLObject var6 = var5.rest();
        var5 = var5.first();
        SubLObject var7 = (SubLObject)module0439.NIL;
        SubLObject var8 = (SubLObject)module0439.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0439.$ic2$);
        var7 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0439.$ic2$);
        var8 = var5.first();
        var5 = var5.rest();
        SubLObject var9 = (SubLObject)module0439.NIL;
        SubLObject var10 = var5;
        SubLObject var11 = (SubLObject)module0439.NIL;
        SubLObject var12_13 = (SubLObject)module0439.NIL;
        while (module0439.NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var4, (SubLObject)module0439.$ic2$);
            var12_13 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var4, (SubLObject)module0439.$ic2$);
            if (module0439.NIL == conses_high.member(var12_13, (SubLObject)module0439.$ic3$, (SubLObject)module0439.UNPROVIDED, (SubLObject)module0439.UNPROVIDED)) {
                var11 = (SubLObject)module0439.T;
            }
            if (var12_13 == module0439.$ic4$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (module0439.NIL != var11 && module0439.NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)module0439.$ic2$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0439.$ic5$, var5);
        final SubLObject var13 = (SubLObject)((module0439.NIL != var12) ? conses_high.cadr(var12) : module0439.NIL);
        final SubLObject var14;
        var5 = (var14 = var6);
        final SubLObject var15 = (SubLObject)module0439.$ic6$;
        return (SubLObject)ConsesLow.list((SubLObject)module0439.$ic7$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var15, var8)), (SubLObject)ConsesLow.list((SubLObject)module0439.$ic8$, (SubLObject)ConsesLow.list((SubLObject)module0439.$ic9$, var15), (SubLObject)ConsesLow.listS((SubLObject)module0439.$ic7$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var7, (SubLObject)ConsesLow.list((SubLObject)module0439.$ic10$, var15))), ConsesLow.append(var14, (SubLObject)module0439.NIL)), (SubLObject)ConsesLow.list((SubLObject)module0439.$ic11$, (SubLObject)ConsesLow.list(var7, (SubLObject)ConsesLow.list((SubLObject)module0439.$ic12$, var15), (SubLObject)module0439.$ic5$, var13), (SubLObject)ConsesLow.listS((SubLObject)module0439.$ic13$, (SubLObject)ConsesLow.list((SubLObject)module0439.EQUAL, var7, var15), ConsesLow.append(var14, (SubLObject)module0439.NIL)))));
    }
    
    public static SubLObject f30677(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0439.$ic14$);
        final SubLObject var6 = var5.rest();
        var5 = var5.first();
        SubLObject var7 = (SubLObject)module0439.NIL;
        SubLObject var8 = (SubLObject)module0439.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0439.$ic14$);
        var7 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0439.$ic14$);
        var8 = var5.first();
        var5 = var5.rest();
        SubLObject var9 = (SubLObject)module0439.NIL;
        SubLObject var10 = var5;
        SubLObject var11 = (SubLObject)module0439.NIL;
        SubLObject var24_25 = (SubLObject)module0439.NIL;
        while (module0439.NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var4, (SubLObject)module0439.$ic14$);
            var24_25 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var4, (SubLObject)module0439.$ic14$);
            if (module0439.NIL == conses_high.member(var24_25, (SubLObject)module0439.$ic15$, (SubLObject)module0439.UNPROVIDED, (SubLObject)module0439.UNPROVIDED)) {
                var11 = (SubLObject)module0439.T;
            }
            if (var24_25 == module0439.$ic4$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (module0439.NIL != var11 && module0439.NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)module0439.$ic14$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0439.$ic5$, var5);
        final SubLObject var13 = (SubLObject)((module0439.NIL != var12) ? conses_high.cadr(var12) : module0439.NIL);
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)module0439.$ic16$, var5);
        final SubLObject var15 = (SubLObject)((module0439.NIL != var14) ? conses_high.cadr(var14) : module0439.NIL);
        final SubLObject var16;
        var5 = (var16 = var6);
        final SubLObject var17 = (SubLObject)module0439.$ic17$;
        return (SubLObject)ConsesLow.list((SubLObject)module0439.$ic7$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var17, var8)), (SubLObject)ConsesLow.listS((SubLObject)module0439.$ic11$, (SubLObject)ConsesLow.list(var7, (SubLObject)ConsesLow.list((SubLObject)module0439.$ic18$, var17, (SubLObject)module0439.$ic19$, var15), (SubLObject)module0439.$ic5$, var13), ConsesLow.append(var16, (SubLObject)module0439.NIL)));
    }
    
    public static SubLObject f30678(final SubLObject var29) {
        SubLObject var30 = (SubLObject)module0439.NIL;
        SubLObject var31 = module0439.$ic20$;
        if (module0439.NIL != module0158.f10010(var29, (SubLObject)module0439.ONE_INTEGER, var31)) {
            final SubLObject var32 = module0158.f10011(var29, (SubLObject)module0439.ONE_INTEGER, var31);
            SubLObject var33 = (SubLObject)module0439.NIL;
            final SubLObject var34 = (SubLObject)module0439.NIL;
            while (module0439.NIL == var33) {
                final SubLObject var35 = module0052.f3695(var32, var34);
                final SubLObject var36 = (SubLObject)SubLObjectFactory.makeBoolean(!var34.eql(var35));
                if (module0439.NIL != var36) {
                    SubLObject var37 = (SubLObject)module0439.NIL;
                    try {
                        var37 = module0158.f10316(var35, (SubLObject)module0439.$ic21$, (SubLObject)module0439.NIL, (SubLObject)module0439.NIL);
                        SubLObject var33_38 = (SubLObject)module0439.NIL;
                        final SubLObject var34_39 = (SubLObject)module0439.NIL;
                        while (module0439.NIL == var33_38) {
                            final SubLObject var38 = module0052.f3695(var37, var34_39);
                            final SubLObject var36_41 = (SubLObject)SubLObjectFactory.makeBoolean(!var34_39.eql(var38));
                            if (module0439.NIL != var36_41) {
                                var30 = (SubLObject)ConsesLow.cons(var38, var30);
                            }
                            var33_38 = (SubLObject)SubLObjectFactory.makeBoolean(module0439.NIL == var36_41);
                        }
                    }
                    finally {
                        final SubLObject var39 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0439.T);
                            if (module0439.NIL != var37) {
                                module0158.f10319(var37);
                            }
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var39);
                        }
                    }
                }
                var33 = (SubLObject)SubLObjectFactory.makeBoolean(module0439.NIL == var36);
            }
        }
        var31 = module0439.$ic22$;
        if (module0439.NIL != module0158.f10010(var29, (SubLObject)module0439.ONE_INTEGER, var31)) {
            final SubLObject var32 = module0158.f10011(var29, (SubLObject)module0439.ONE_INTEGER, var31);
            SubLObject var33 = (SubLObject)module0439.NIL;
            final SubLObject var34 = (SubLObject)module0439.NIL;
            while (module0439.NIL == var33) {
                final SubLObject var35 = module0052.f3695(var32, var34);
                final SubLObject var36 = (SubLObject)SubLObjectFactory.makeBoolean(!var34.eql(var35));
                if (module0439.NIL != var36) {
                    SubLObject var37 = (SubLObject)module0439.NIL;
                    try {
                        var37 = module0158.f10316(var35, (SubLObject)module0439.$ic21$, (SubLObject)module0439.NIL, (SubLObject)module0439.NIL);
                        SubLObject var33_39 = (SubLObject)module0439.NIL;
                        final SubLObject var34_40 = (SubLObject)module0439.NIL;
                        while (module0439.NIL == var33_39) {
                            final SubLObject var38 = module0052.f3695(var37, var34_40);
                            final SubLObject var36_42 = (SubLObject)SubLObjectFactory.makeBoolean(!var34_40.eql(var38));
                            if (module0439.NIL != var36_42) {
                                var30 = (SubLObject)ConsesLow.cons(var38, var30);
                            }
                            var33_39 = (SubLObject)SubLObjectFactory.makeBoolean(module0439.NIL == var36_42);
                        }
                    }
                    finally {
                        final SubLObject var40 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0439.T);
                            if (module0439.NIL != var37) {
                                module0158.f10319(var37);
                            }
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var40);
                        }
                    }
                }
                var33 = (SubLObject)SubLObjectFactory.makeBoolean(module0439.NIL == var36);
            }
        }
        return Sequences.nreverse(var30);
    }
    
    public static SubLObject f30679(final SubLObject var1, final SubLObject var46) {
        return (module0439.NIL != module0193.f12105(var1)) ? f30680(var1, var46) : f30681(var1, var46);
    }
    
    public static SubLObject f30680(final SubLObject var1, final SubLObject var46) {
        return module0018.$g661$.getGlobalValue();
    }
    
    public static SubLObject f30681(final SubLObject var1, final SubLObject var46) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        SubLObject var48 = (SubLObject)module0439.ZERO_INTEGER;
        SubLObject var49 = module0205.f13281(var1, Symbols.symbol_function((SubLObject)module0439.$ic38$), (SubLObject)module0439.NIL);
        SubLObject var50 = (SubLObject)module0439.NIL;
        var50 = var49.first();
        while (module0439.NIL != var49) {
            final SubLObject var51 = module0205.f13333(var50);
            if (module0439.NIL != module0173.f10955(var51)) {
                final SubLObject var52 = var51;
                final SubLObject var53 = (SubLObject)module0439.$ic25$;
                final SubLObject var54 = module0056.f4145(var53);
                SubLObject var55 = (SubLObject)module0439.NIL;
                final SubLObject var56 = module0139.$g1635$.currentBinding(var47);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var47);
                    final SubLObject var57 = (SubLObject)module0439.NIL;
                    final SubLObject var42_58 = module0141.$g1714$.currentBinding(var47);
                    final SubLObject var58 = module0141.$g1715$.currentBinding(var47);
                    try {
                        module0141.$g1714$.bind((module0439.NIL != var57) ? var57 : module0141.f9283(), var47);
                        module0141.$g1715$.bind((SubLObject)((module0439.NIL != var57) ? module0439.$ic26$ : module0141.$g1715$.getDynamicValue(var47)), var47);
                        if (module0439.NIL != var57 && module0439.NIL != module0136.f8864() && module0439.NIL == module0141.f9279(var57)) {
                            final SubLObject var59 = module0136.$g1591$.getDynamicValue(var47);
                            if (var59.eql((SubLObject)module0439.$ic27$)) {
                                module0136.f8870((SubLObject)module0439.ONE_INTEGER, (SubLObject)module0439.$ic28$, var57, (SubLObject)module0439.$ic29$, (SubLObject)module0439.UNPROVIDED, (SubLObject)module0439.UNPROVIDED, (SubLObject)module0439.UNPROVIDED);
                            }
                            else if (var59.eql((SubLObject)module0439.$ic30$)) {
                                module0136.f8871((SubLObject)module0439.ONE_INTEGER, (SubLObject)module0439.$ic31$, (SubLObject)module0439.$ic28$, var57, (SubLObject)module0439.$ic29$, (SubLObject)module0439.UNPROVIDED, (SubLObject)module0439.UNPROVIDED, (SubLObject)module0439.UNPROVIDED);
                            }
                            else if (var59.eql((SubLObject)module0439.$ic32$)) {
                                Errors.warn((SubLObject)module0439.$ic28$, var57, (SubLObject)module0439.$ic29$);
                            }
                            else {
                                Errors.warn((SubLObject)module0439.$ic33$, module0136.$g1591$.getDynamicValue(var47));
                                Errors.cerror((SubLObject)module0439.$ic31$, (SubLObject)module0439.$ic28$, var57, (SubLObject)module0439.$ic29$);
                            }
                        }
                        final SubLObject var42_59 = module0141.$g1670$.currentBinding(var47);
                        final SubLObject var59_62 = module0141.$g1671$.currentBinding(var47);
                        final SubLObject var60 = module0141.$g1672$.currentBinding(var47);
                        final SubLObject var61 = module0141.$g1674$.currentBinding(var47);
                        final SubLObject var62 = module0137.$g1605$.currentBinding(var47);
                        try {
                            module0141.$g1670$.bind(module0137.f8955(module0439.$ic34$), var47);
                            module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0439.$ic34$)), var47);
                            module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0439.$ic34$)), var47);
                            module0141.$g1674$.bind((SubLObject)module0439.NIL, var47);
                            module0137.$g1605$.bind(module0137.f8955(module0439.$ic34$), var47);
                            if (module0439.NIL != module0136.f8865() || module0439.NIL != module0244.f15795(var51, module0137.f8955((SubLObject)module0439.UNPROVIDED))) {
                                final SubLObject var42_60 = module0141.$g1677$.currentBinding(var47);
                                final SubLObject var59_63 = module0138.$g1619$.currentBinding(var47);
                                final SubLObject var63_68 = module0141.$g1674$.currentBinding(var47);
                                try {
                                    module0141.$g1677$.bind(module0141.f9210(), var47);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955(module0439.$ic34$)), var47);
                                    module0141.$g1674$.bind((SubLObject)module0439.NIL, var47);
                                    module0249.f16055(var52, (SubLObject)module0439.UNPROVIDED);
                                    for (var55 = (SubLObject)ConsesLow.list(var51, module0141.f9195()); module0439.NIL != var55; var55 = module0056.f4150(var54)) {
                                        final SubLObject var53_69 = var55.first();
                                        final SubLObject var63 = conses_high.second(var55);
                                        final SubLObject var64 = var53_69;
                                        final SubLObject var42_61 = module0141.$g1674$.currentBinding(var47);
                                        try {
                                            module0141.$g1674$.bind(var63, var47);
                                            if (module0439.NIL != module0250.f16115(module0141.f9190(), var53_69)) {
                                                var48 = Numbers.add(var48, module0217.f14406(module0202.f12817((SubLObject)module0439.ZERO_INTEGER, var64, var50), var46, (SubLObject)module0439.UNPROVIDED));
                                            }
                                            SubLObject var50_74;
                                            final SubLObject var65 = var50_74 = module0200.f12443(module0137.f8955(module0439.$ic34$));
                                            SubLObject var66 = (SubLObject)module0439.NIL;
                                            var66 = var50_74.first();
                                            while (module0439.NIL != var50_74) {
                                                final SubLObject var42_62 = module0137.$g1605$.currentBinding(var47);
                                                final SubLObject var59_64 = module0141.$g1674$.currentBinding(var47);
                                                try {
                                                    module0137.$g1605$.bind(var66, var47);
                                                    module0141.$g1674$.bind((SubLObject)((module0439.NIL != module0141.f9205((SubLObject)module0439.UNPROVIDED, (SubLObject)module0439.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0439.NIL == module0141.$g1674$.getDynamicValue(var47)) : module0141.$g1674$.getDynamicValue(var47)), var47);
                                                    final SubLObject var67 = module0228.f15229(var53_69);
                                                    if (module0439.NIL != module0138.f8992(var67)) {
                                                        final SubLObject var68 = module0242.f15664(var67, module0137.f8955((SubLObject)module0439.UNPROVIDED));
                                                        if (module0439.NIL != var68) {
                                                            final SubLObject var69 = module0245.f15834(var68, module0138.f8979(), module0137.f8955((SubLObject)module0439.UNPROVIDED));
                                                            if (module0439.NIL != var69) {
                                                                SubLObject var70;
                                                                for (var70 = module0066.f4838(module0067.f4891(var69)); module0439.NIL == module0066.f4841(var70); var70 = module0066.f4840(var70)) {
                                                                    var47.resetMultipleValues();
                                                                    final SubLObject var71 = module0066.f4839(var70);
                                                                    final SubLObject var72 = var47.secondMultipleValue();
                                                                    var47.resetMultipleValues();
                                                                    if (module0439.NIL != module0147.f9507(var71)) {
                                                                        final SubLObject var42_63 = module0138.$g1623$.currentBinding(var47);
                                                                        try {
                                                                            module0138.$g1623$.bind(var71, var47);
                                                                            SubLObject var81_85;
                                                                            for (var81_85 = module0066.f4838(module0067.f4891(var72)); module0439.NIL == module0066.f4841(var81_85); var81_85 = module0066.f4840(var81_85)) {
                                                                                var47.resetMultipleValues();
                                                                                final SubLObject var73 = module0066.f4839(var81_85);
                                                                                final SubLObject var74 = var47.secondMultipleValue();
                                                                                var47.resetMultipleValues();
                                                                                if (module0439.NIL != module0141.f9289(var73)) {
                                                                                    final SubLObject var42_64 = module0138.$g1624$.currentBinding(var47);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var73, var47);
                                                                                        final SubLObject var75 = var74;
                                                                                        if (module0439.NIL != module0077.f5302(var75)) {
                                                                                            final SubLObject var76 = module0077.f5333(var75);
                                                                                            SubLObject var77;
                                                                                            SubLObject var78;
                                                                                            SubLObject var79;
                                                                                            for (var77 = module0032.f1741(var76), var78 = (SubLObject)module0439.NIL, var78 = module0032.f1742(var77, var76); module0439.NIL == module0032.f1744(var77, var78); var78 = module0032.f1743(var78)) {
                                                                                                var79 = module0032.f1745(var77, var78);
                                                                                                if (module0439.NIL != module0032.f1746(var78, var79) && module0439.NIL == module0249.f16059(var79, (SubLObject)module0439.UNPROVIDED)) {
                                                                                                    module0249.f16055(var79, (SubLObject)module0439.UNPROVIDED);
                                                                                                    module0056.f4149((SubLObject)ConsesLow.list(var79, module0141.f9195()), var54);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var75.isList()) {
                                                                                            SubLObject var80 = var75;
                                                                                            SubLObject var81 = (SubLObject)module0439.NIL;
                                                                                            var81 = var80.first();
                                                                                            while (module0439.NIL != var80) {
                                                                                                if (module0439.NIL == module0249.f16059(var81, (SubLObject)module0439.UNPROVIDED)) {
                                                                                                    module0249.f16055(var81, (SubLObject)module0439.UNPROVIDED);
                                                                                                    module0056.f4149((SubLObject)ConsesLow.list(var81, module0141.f9195()), var54);
                                                                                                }
                                                                                                var80 = var80.rest();
                                                                                                var81 = var80.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)module0439.$ic35$, var75);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var42_64, var47);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var81_85);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var42_63, var47);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var70);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)module0439.FIVE_INTEGER, (SubLObject)module0439.$ic36$, (SubLObject)module0439.UNPROVIDED, (SubLObject)module0439.UNPROVIDED, (SubLObject)module0439.UNPROVIDED, (SubLObject)module0439.UNPROVIDED, (SubLObject)module0439.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (module0439.NIL != module0155.f9785(var67, (SubLObject)module0439.UNPROVIDED)) {
                                                        SubLObject var50_75;
                                                        final SubLObject var82 = var50_75 = ((module0439.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var47), module0137.f8955((SubLObject)module0439.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var47), module0137.f8955((SubLObject)module0439.UNPROVIDED)));
                                                        SubLObject var83 = (SubLObject)module0439.NIL;
                                                        var83 = var50_75.first();
                                                        while (module0439.NIL != var50_75) {
                                                            final SubLObject var42_65 = module0138.$g1625$.currentBinding(var47);
                                                            try {
                                                                module0138.$g1625$.bind(var83, var47);
                                                                final SubLObject var85;
                                                                final SubLObject var84 = var85 = Functions.funcall(var83, var67);
                                                                if (module0439.NIL != module0077.f5302(var85)) {
                                                                    final SubLObject var86 = module0077.f5333(var85);
                                                                    SubLObject var87;
                                                                    SubLObject var88;
                                                                    SubLObject var89;
                                                                    for (var87 = module0032.f1741(var86), var88 = (SubLObject)module0439.NIL, var88 = module0032.f1742(var87, var86); module0439.NIL == module0032.f1744(var87, var88); var88 = module0032.f1743(var88)) {
                                                                        var89 = module0032.f1745(var87, var88);
                                                                        if (module0439.NIL != module0032.f1746(var88, var89) && module0439.NIL == module0249.f16059(var89, (SubLObject)module0439.UNPROVIDED)) {
                                                                            module0249.f16055(var89, (SubLObject)module0439.UNPROVIDED);
                                                                            module0056.f4149((SubLObject)ConsesLow.list(var89, module0141.f9195()), var54);
                                                                        }
                                                                    }
                                                                }
                                                                else if (var85.isList()) {
                                                                    SubLObject var90 = var85;
                                                                    SubLObject var91 = (SubLObject)module0439.NIL;
                                                                    var91 = var90.first();
                                                                    while (module0439.NIL != var90) {
                                                                        if (module0439.NIL == module0249.f16059(var91, (SubLObject)module0439.UNPROVIDED)) {
                                                                            module0249.f16055(var91, (SubLObject)module0439.UNPROVIDED);
                                                                            module0056.f4149((SubLObject)ConsesLow.list(var91, module0141.f9195()), var54);
                                                                        }
                                                                        var90 = var90.rest();
                                                                        var91 = var90.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)module0439.$ic35$, var85);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var42_65, var47);
                                                            }
                                                            var50_75 = var50_75.rest();
                                                            var83 = var50_75.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var59_64, var47);
                                                    module0137.$g1605$.rebind(var42_62, var47);
                                                }
                                                var50_74 = var50_74.rest();
                                                var66 = var50_74.first();
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var42_61, var47);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var63_68, var47);
                                    module0138.$g1619$.rebind(var59_63, var47);
                                    module0141.$g1677$.rebind(var42_60, var47);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)module0439.TWO_INTEGER, (SubLObject)module0439.$ic37$, var51, module0244.f15748(module0137.f8955((SubLObject)module0439.UNPROVIDED)), (SubLObject)module0439.UNPROVIDED, (SubLObject)module0439.UNPROVIDED, (SubLObject)module0439.UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var62, var47);
                            module0141.$g1674$.rebind(var61, var47);
                            module0141.$g1672$.rebind(var60, var47);
                            module0141.$g1671$.rebind(var59_62, var47);
                            module0141.$g1670$.rebind(var42_59, var47);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var58, var47);
                        module0141.$g1714$.rebind(var42_58, var47);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var47));
                }
                finally {
                    module0139.$g1635$.rebind(var56, var47);
                }
            }
            else {
                var48 = Numbers.add(var48, module0217.f14406(var50, var46, (SubLObject)module0439.UNPROVIDED));
            }
            var49 = var49.rest();
            var50 = var49.first();
        }
        return var48;
    }
    
    public static SubLObject f30682(final SubLObject var1, final SubLObject var99) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        SubLObject var101 = (SubLObject)module0439.NIL;
        final SubLObject var102 = module0205.f13333(var1);
        if (module0439.NIL != module0173.f10955(var102)) {
            final SubLObject var103 = var102;
            final SubLObject var104 = (SubLObject)module0439.$ic25$;
            final SubLObject var105 = module0056.f4145(var104);
            SubLObject var106 = (SubLObject)module0439.NIL;
            final SubLObject var107 = module0139.$g1635$.currentBinding(var100);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var100);
                final SubLObject var108 = (SubLObject)module0439.NIL;
                final SubLObject var42_101 = module0141.$g1714$.currentBinding(var100);
                final SubLObject var109 = module0141.$g1715$.currentBinding(var100);
                try {
                    module0141.$g1714$.bind((module0439.NIL != var108) ? var108 : module0141.f9283(), var100);
                    module0141.$g1715$.bind((SubLObject)((module0439.NIL != var108) ? module0439.$ic26$ : module0141.$g1715$.getDynamicValue(var100)), var100);
                    if (module0439.NIL != var108 && module0439.NIL != module0136.f8864() && module0439.NIL == module0141.f9279(var108)) {
                        final SubLObject var110 = module0136.$g1591$.getDynamicValue(var100);
                        if (var110.eql((SubLObject)module0439.$ic27$)) {
                            module0136.f8870((SubLObject)module0439.ONE_INTEGER, (SubLObject)module0439.$ic28$, var108, (SubLObject)module0439.$ic29$, (SubLObject)module0439.UNPROVIDED, (SubLObject)module0439.UNPROVIDED, (SubLObject)module0439.UNPROVIDED);
                        }
                        else if (var110.eql((SubLObject)module0439.$ic30$)) {
                            module0136.f8871((SubLObject)module0439.ONE_INTEGER, (SubLObject)module0439.$ic31$, (SubLObject)module0439.$ic28$, var108, (SubLObject)module0439.$ic29$, (SubLObject)module0439.UNPROVIDED, (SubLObject)module0439.UNPROVIDED, (SubLObject)module0439.UNPROVIDED);
                        }
                        else if (var110.eql((SubLObject)module0439.$ic32$)) {
                            Errors.warn((SubLObject)module0439.$ic28$, var108, (SubLObject)module0439.$ic29$);
                        }
                        else {
                            Errors.warn((SubLObject)module0439.$ic33$, module0136.$g1591$.getDynamicValue(var100));
                            Errors.cerror((SubLObject)module0439.$ic31$, (SubLObject)module0439.$ic28$, var108, (SubLObject)module0439.$ic29$);
                        }
                    }
                    final SubLObject var42_102 = module0141.$g1670$.currentBinding(var100);
                    final SubLObject var59_103 = module0141.$g1671$.currentBinding(var100);
                    final SubLObject var111 = module0141.$g1672$.currentBinding(var100);
                    final SubLObject var112 = module0141.$g1674$.currentBinding(var100);
                    final SubLObject var113 = module0137.$g1605$.currentBinding(var100);
                    try {
                        module0141.$g1670$.bind(module0137.f8955(module0439.$ic34$), var100);
                        module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0439.$ic34$)), var100);
                        module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0439.$ic34$)), var100);
                        module0141.$g1674$.bind((SubLObject)module0439.NIL, var100);
                        module0137.$g1605$.bind(module0137.f8955(module0439.$ic34$), var100);
                        if (module0439.NIL != module0136.f8865() || module0439.NIL != module0244.f15795(var102, module0137.f8955((SubLObject)module0439.UNPROVIDED))) {
                            final SubLObject var42_103 = module0141.$g1677$.currentBinding(var100);
                            final SubLObject var59_104 = module0138.$g1619$.currentBinding(var100);
                            final SubLObject var63_106 = module0141.$g1674$.currentBinding(var100);
                            try {
                                module0141.$g1677$.bind(module0141.f9210(), var100);
                                module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955(module0439.$ic34$)), var100);
                                module0141.$g1674$.bind((SubLObject)module0439.NIL, var100);
                                module0249.f16055(var103, (SubLObject)module0439.UNPROVIDED);
                                for (var106 = (SubLObject)ConsesLow.list(var102, module0141.f9195()); module0439.NIL != var106; var106 = module0056.f4150(var105)) {
                                    final SubLObject var53_107 = var106.first();
                                    final SubLObject var114 = conses_high.second(var106);
                                    final SubLObject var115 = var53_107;
                                    final SubLObject var42_104 = module0141.$g1674$.currentBinding(var100);
                                    try {
                                        module0141.$g1674$.bind(var114, var100);
                                        if (module0439.NIL != module0250.f16115(module0141.f9190(), var53_107)) {
                                            if (module0439.NIL != module0213.f14081(var115, var102)) {
                                                SubLObject var116 = module0205.f13281(var1, Symbols.symbol_function((SubLObject)module0439.$ic38$), (SubLObject)module0439.NIL);
                                                SubLObject var117 = (SubLObject)module0439.NIL;
                                                var117 = var116.first();
                                                while (module0439.NIL != var116) {
                                                    var101 = ConsesLow.append(var101, f30683(module0202.f12817((SubLObject)module0439.ZERO_INTEGER, var115, var117), var99));
                                                    var116 = var116.rest();
                                                    var117 = var116.first();
                                                }
                                            }
                                            else if (module0439.NIL != module0202.f12598(var1)) {
                                                final SubLObject var118 = f30674(var1);
                                                var101 = ConsesLow.append(var101, f30683(module0202.f12817((SubLObject)module0439.ZERO_INTEGER, var115, var118), var99));
                                            }
                                            else {
                                                SubLObject var116 = module0205.f13275(var1, (SubLObject)module0439.UNPROVIDED);
                                                SubLObject var117 = (SubLObject)module0439.NIL;
                                                var117 = var116.first();
                                                while (module0439.NIL != var116) {
                                                    if (!var117.equal(var1)) {
                                                        var101 = ConsesLow.append(var101, f30683(module0202.f12817((SubLObject)module0439.ZERO_INTEGER, var115, var117), var99));
                                                    }
                                                    var116 = var116.rest();
                                                    var117 = var116.first();
                                                }
                                            }
                                        }
                                        SubLObject var116;
                                        final SubLObject var119 = var116 = module0200.f12443(module0137.f8955(module0439.$ic34$));
                                        SubLObject var120 = (SubLObject)module0439.NIL;
                                        var120 = var116.first();
                                        while (module0439.NIL != var116) {
                                            final SubLObject var42_105 = module0137.$g1605$.currentBinding(var100);
                                            final SubLObject var59_105 = module0141.$g1674$.currentBinding(var100);
                                            try {
                                                module0137.$g1605$.bind(var120, var100);
                                                module0141.$g1674$.bind((SubLObject)((module0439.NIL != module0141.f9205((SubLObject)module0439.UNPROVIDED, (SubLObject)module0439.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0439.NIL == module0141.$g1674$.getDynamicValue(var100)) : module0141.$g1674$.getDynamicValue(var100)), var100);
                                                final SubLObject var121 = module0228.f15229(var53_107);
                                                if (module0439.NIL != module0138.f8992(var121)) {
                                                    final SubLObject var122 = module0242.f15664(var121, module0137.f8955((SubLObject)module0439.UNPROVIDED));
                                                    if (module0439.NIL != var122) {
                                                        final SubLObject var123 = module0245.f15834(var122, module0138.f8979(), module0137.f8955((SubLObject)module0439.UNPROVIDED));
                                                        if (module0439.NIL != var123) {
                                                            SubLObject var124;
                                                            for (var124 = module0066.f4838(module0067.f4891(var123)); module0439.NIL == module0066.f4841(var124); var124 = module0066.f4840(var124)) {
                                                                var100.resetMultipleValues();
                                                                final SubLObject var125 = module0066.f4839(var124);
                                                                final SubLObject var126 = var100.secondMultipleValue();
                                                                var100.resetMultipleValues();
                                                                if (module0439.NIL != module0147.f9507(var125)) {
                                                                    final SubLObject var42_106 = module0138.$g1623$.currentBinding(var100);
                                                                    try {
                                                                        module0138.$g1623$.bind(var125, var100);
                                                                        SubLObject var81_113;
                                                                        for (var81_113 = module0066.f4838(module0067.f4891(var126)); module0439.NIL == module0066.f4841(var81_113); var81_113 = module0066.f4840(var81_113)) {
                                                                            var100.resetMultipleValues();
                                                                            final SubLObject var127 = module0066.f4839(var81_113);
                                                                            final SubLObject var128 = var100.secondMultipleValue();
                                                                            var100.resetMultipleValues();
                                                                            if (module0439.NIL != module0141.f9289(var127)) {
                                                                                final SubLObject var42_107 = module0138.$g1624$.currentBinding(var100);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var127, var100);
                                                                                    final SubLObject var129 = var128;
                                                                                    if (module0439.NIL != module0077.f5302(var129)) {
                                                                                        final SubLObject var130 = module0077.f5333(var129);
                                                                                        SubLObject var131;
                                                                                        SubLObject var132;
                                                                                        SubLObject var133;
                                                                                        for (var131 = module0032.f1741(var130), var132 = (SubLObject)module0439.NIL, var132 = module0032.f1742(var131, var130); module0439.NIL == module0032.f1744(var131, var132); var132 = module0032.f1743(var132)) {
                                                                                            var133 = module0032.f1745(var131, var132);
                                                                                            if (module0439.NIL != module0032.f1746(var132, var133) && module0439.NIL == module0249.f16059(var133, (SubLObject)module0439.UNPROVIDED)) {
                                                                                                module0249.f16055(var133, (SubLObject)module0439.UNPROVIDED);
                                                                                                module0056.f4149((SubLObject)ConsesLow.list(var133, module0141.f9195()), var105);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var129.isList()) {
                                                                                        SubLObject var134 = var129;
                                                                                        SubLObject var135 = (SubLObject)module0439.NIL;
                                                                                        var135 = var134.first();
                                                                                        while (module0439.NIL != var134) {
                                                                                            if (module0439.NIL == module0249.f16059(var135, (SubLObject)module0439.UNPROVIDED)) {
                                                                                                module0249.f16055(var135, (SubLObject)module0439.UNPROVIDED);
                                                                                                module0056.f4149((SubLObject)ConsesLow.list(var135, module0141.f9195()), var105);
                                                                                            }
                                                                                            var134 = var134.rest();
                                                                                            var135 = var134.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0439.$ic35$, var129);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var42_107, var100);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var81_113);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var42_106, var100);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var124);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0439.FIVE_INTEGER, (SubLObject)module0439.$ic36$, (SubLObject)module0439.UNPROVIDED, (SubLObject)module0439.UNPROVIDED, (SubLObject)module0439.UNPROVIDED, (SubLObject)module0439.UNPROVIDED, (SubLObject)module0439.UNPROVIDED);
                                                    }
                                                }
                                                else if (module0439.NIL != module0155.f9785(var121, (SubLObject)module0439.UNPROVIDED)) {
                                                    SubLObject var50_115;
                                                    final SubLObject var136 = var50_115 = ((module0439.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var100), module0137.f8955((SubLObject)module0439.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var100), module0137.f8955((SubLObject)module0439.UNPROVIDED)));
                                                    SubLObject var137 = (SubLObject)module0439.NIL;
                                                    var137 = var50_115.first();
                                                    while (module0439.NIL != var50_115) {
                                                        final SubLObject var42_108 = module0138.$g1625$.currentBinding(var100);
                                                        try {
                                                            module0138.$g1625$.bind(var137, var100);
                                                            final SubLObject var139;
                                                            final SubLObject var138 = var139 = Functions.funcall(var137, var121);
                                                            if (module0439.NIL != module0077.f5302(var139)) {
                                                                final SubLObject var140 = module0077.f5333(var139);
                                                                SubLObject var141;
                                                                SubLObject var142;
                                                                SubLObject var143;
                                                                for (var141 = module0032.f1741(var140), var142 = (SubLObject)module0439.NIL, var142 = module0032.f1742(var141, var140); module0439.NIL == module0032.f1744(var141, var142); var142 = module0032.f1743(var142)) {
                                                                    var143 = module0032.f1745(var141, var142);
                                                                    if (module0439.NIL != module0032.f1746(var142, var143) && module0439.NIL == module0249.f16059(var143, (SubLObject)module0439.UNPROVIDED)) {
                                                                        module0249.f16055(var143, (SubLObject)module0439.UNPROVIDED);
                                                                        module0056.f4149((SubLObject)ConsesLow.list(var143, module0141.f9195()), var105);
                                                                    }
                                                                }
                                                            }
                                                            else if (var139.isList()) {
                                                                SubLObject var144 = var139;
                                                                SubLObject var145 = (SubLObject)module0439.NIL;
                                                                var145 = var144.first();
                                                                while (module0439.NIL != var144) {
                                                                    if (module0439.NIL == module0249.f16059(var145, (SubLObject)module0439.UNPROVIDED)) {
                                                                        module0249.f16055(var145, (SubLObject)module0439.UNPROVIDED);
                                                                        module0056.f4149((SubLObject)ConsesLow.list(var145, module0141.f9195()), var105);
                                                                    }
                                                                    var144 = var144.rest();
                                                                    var145 = var144.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0439.$ic35$, var139);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var42_108, var100);
                                                        }
                                                        var50_115 = var50_115.rest();
                                                        var137 = var50_115.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var59_105, var100);
                                                module0137.$g1605$.rebind(var42_105, var100);
                                            }
                                            var116 = var116.rest();
                                            var120 = var116.first();
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var42_104, var100);
                                    }
                                }
                            }
                            finally {
                                module0141.$g1674$.rebind(var63_106, var100);
                                module0138.$g1619$.rebind(var59_104, var100);
                                module0141.$g1677$.rebind(var42_103, var100);
                            }
                        }
                        else {
                            module0136.f8872((SubLObject)module0439.TWO_INTEGER, (SubLObject)module0439.$ic37$, var102, module0244.f15748(module0137.f8955((SubLObject)module0439.UNPROVIDED)), (SubLObject)module0439.UNPROVIDED, (SubLObject)module0439.UNPROVIDED, (SubLObject)module0439.UNPROVIDED);
                        }
                    }
                    finally {
                        module0137.$g1605$.rebind(var113, var100);
                        module0141.$g1674$.rebind(var112, var100);
                        module0141.$g1672$.rebind(var111, var100);
                        module0141.$g1671$.rebind(var59_103, var100);
                        module0141.$g1670$.rebind(var42_102, var100);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var109, var100);
                    module0141.$g1714$.rebind(var42_101, var100);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var100));
            }
            finally {
                module0139.$g1635$.rebind(var107, var100);
            }
        }
        else {
            SubLObject var146 = module0205.f13281(var1, Symbols.symbol_function((SubLObject)module0439.$ic38$), (SubLObject)module0439.NIL);
            SubLObject var147 = (SubLObject)module0439.NIL;
            var147 = var146.first();
            while (module0439.NIL != var146) {
                var101 = ConsesLow.append(var101, f30683(var147, var99));
                var146 = var146.rest();
                var147 = var146.first();
            }
        }
        return module0052.f3709(var101);
    }
    
    public static SubLObject f30683(final SubLObject var1, final SubLObject var99) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        SubLObject var101 = (SubLObject)module0439.NIL;
        final SubLObject var102 = module0349.f23449(var1, var99);
        final SubLObject var104;
        final SubLObject var103 = var104 = module0158.f10294(var102);
        if (var104.eql((SubLObject)module0439.$ic39$)) {
            var100.resetMultipleValues();
            final SubLObject var105 = module0158.f10297(var102);
            final SubLObject var106 = var100.secondMultipleValue();
            final SubLObject var107 = var100.thirdMultipleValue();
            var100.resetMultipleValues();
            if (module0439.NIL != var106) {
                if (module0439.NIL != var107) {
                    final SubLObject var108 = var107;
                    if (module0439.NIL != module0158.f10010(var105, var106, var108)) {
                        final SubLObject var109 = module0158.f10011(var105, var106, var108);
                        SubLObject var110 = (SubLObject)module0439.NIL;
                        final SubLObject var111 = (SubLObject)module0439.NIL;
                        while (module0439.NIL == var110) {
                            final SubLObject var112 = module0052.f3695(var109, var111);
                            final SubLObject var113 = (SubLObject)SubLObjectFactory.makeBoolean(!var111.eql(var112));
                            if (module0439.NIL != var113) {
                                SubLObject var114 = (SubLObject)module0439.NIL;
                                try {
                                    var114 = module0158.f10316(var112, (SubLObject)module0439.$ic21$, module0130.f8518(var99), (SubLObject)module0439.NIL);
                                    SubLObject var33_122 = (SubLObject)module0439.NIL;
                                    final SubLObject var34_123 = (SubLObject)module0439.NIL;
                                    while (module0439.NIL == var33_122) {
                                        final SubLObject var115 = module0052.f3695(var114, var34_123);
                                        final SubLObject var36_125 = (SubLObject)SubLObjectFactory.makeBoolean(!var34_123.eql(var115));
                                        if (module0439.NIL != var36_125 && module0439.NIL != module0351.f23568(var115)) {
                                            var100.resetMultipleValues();
                                            final SubLObject var116 = module0235.f15476(var1, module0178.f11285(var115), (SubLObject)module0439.T, (SubLObject)module0439.T);
                                            final SubLObject var117 = var100.secondMultipleValue();
                                            final SubLObject var118 = var100.thirdMultipleValue();
                                            var100.resetMultipleValues();
                                            if (module0439.NIL != var116) {
                                                var101 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var116, var115), var101);
                                            }
                                        }
                                        var33_122 = (SubLObject)SubLObjectFactory.makeBoolean(module0439.NIL == var36_125);
                                    }
                                }
                                finally {
                                    final SubLObject var119 = Threads.$is_thread_performing_cleanupP$.currentBinding(var100);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0439.T, var100);
                                        if (module0439.NIL != var114) {
                                            module0158.f10319(var114);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var119, var100);
                                    }
                                }
                            }
                            var110 = (SubLObject)SubLObjectFactory.makeBoolean(module0439.NIL == var113);
                        }
                    }
                }
                else {
                    final SubLObject var108 = (SubLObject)module0439.NIL;
                    if (module0439.NIL != module0158.f10010(var105, var106, var108)) {
                        final SubLObject var109 = module0158.f10011(var105, var106, var108);
                        SubLObject var110 = (SubLObject)module0439.NIL;
                        final SubLObject var111 = (SubLObject)module0439.NIL;
                        while (module0439.NIL == var110) {
                            final SubLObject var112 = module0052.f3695(var109, var111);
                            final SubLObject var113 = (SubLObject)SubLObjectFactory.makeBoolean(!var111.eql(var112));
                            if (module0439.NIL != var113) {
                                SubLObject var114 = (SubLObject)module0439.NIL;
                                try {
                                    var114 = module0158.f10316(var112, (SubLObject)module0439.$ic21$, module0130.f8518(var99), (SubLObject)module0439.NIL);
                                    SubLObject var33_123 = (SubLObject)module0439.NIL;
                                    final SubLObject var34_124 = (SubLObject)module0439.NIL;
                                    while (module0439.NIL == var33_123) {
                                        final SubLObject var115 = module0052.f3695(var114, var34_124);
                                        final SubLObject var36_126 = (SubLObject)SubLObjectFactory.makeBoolean(!var34_124.eql(var115));
                                        if (module0439.NIL != var36_126 && module0439.NIL != module0351.f23568(var115)) {
                                            var100.resetMultipleValues();
                                            final SubLObject var116 = module0235.f15476(var1, module0178.f11285(var115), (SubLObject)module0439.T, (SubLObject)module0439.T);
                                            final SubLObject var117 = var100.secondMultipleValue();
                                            final SubLObject var118 = var100.thirdMultipleValue();
                                            var100.resetMultipleValues();
                                            if (module0439.NIL != var116) {
                                                var101 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var116, var115), var101);
                                            }
                                        }
                                        var33_123 = (SubLObject)SubLObjectFactory.makeBoolean(module0439.NIL == var36_126);
                                    }
                                }
                                finally {
                                    final SubLObject var120 = Threads.$is_thread_performing_cleanupP$.currentBinding(var100);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0439.T, var100);
                                        if (module0439.NIL != var114) {
                                            module0158.f10319(var114);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var120, var100);
                                    }
                                }
                            }
                            var110 = (SubLObject)SubLObjectFactory.makeBoolean(module0439.NIL == var113);
                        }
                    }
                }
            }
            else if (module0439.NIL != var107) {
                final SubLObject var108 = var107;
                if (module0439.NIL != module0158.f10010(var105, (SubLObject)module0439.NIL, var108)) {
                    final SubLObject var109 = module0158.f10011(var105, (SubLObject)module0439.NIL, var108);
                    SubLObject var110 = (SubLObject)module0439.NIL;
                    final SubLObject var111 = (SubLObject)module0439.NIL;
                    while (module0439.NIL == var110) {
                        final SubLObject var112 = module0052.f3695(var109, var111);
                        final SubLObject var113 = (SubLObject)SubLObjectFactory.makeBoolean(!var111.eql(var112));
                        if (module0439.NIL != var113) {
                            SubLObject var114 = (SubLObject)module0439.NIL;
                            try {
                                var114 = module0158.f10316(var112, (SubLObject)module0439.$ic21$, module0130.f8518(var99), (SubLObject)module0439.NIL);
                                SubLObject var33_124 = (SubLObject)module0439.NIL;
                                final SubLObject var34_125 = (SubLObject)module0439.NIL;
                                while (module0439.NIL == var33_124) {
                                    final SubLObject var115 = module0052.f3695(var114, var34_125);
                                    final SubLObject var36_127 = (SubLObject)SubLObjectFactory.makeBoolean(!var34_125.eql(var115));
                                    if (module0439.NIL != var36_127 && module0439.NIL != module0351.f23568(var115)) {
                                        var100.resetMultipleValues();
                                        final SubLObject var116 = module0235.f15476(var1, module0178.f11285(var115), (SubLObject)module0439.T, (SubLObject)module0439.T);
                                        final SubLObject var117 = var100.secondMultipleValue();
                                        final SubLObject var118 = var100.thirdMultipleValue();
                                        var100.resetMultipleValues();
                                        if (module0439.NIL != var116) {
                                            var101 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var116, var115), var101);
                                        }
                                    }
                                    var33_124 = (SubLObject)SubLObjectFactory.makeBoolean(module0439.NIL == var36_127);
                                }
                            }
                            finally {
                                final SubLObject var121 = Threads.$is_thread_performing_cleanupP$.currentBinding(var100);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0439.T, var100);
                                    if (module0439.NIL != var114) {
                                        module0158.f10319(var114);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var121, var100);
                                }
                            }
                        }
                        var110 = (SubLObject)SubLObjectFactory.makeBoolean(module0439.NIL == var113);
                    }
                }
            }
            else {
                final SubLObject var108 = (SubLObject)module0439.NIL;
                if (module0439.NIL != module0158.f10010(var105, (SubLObject)module0439.NIL, var108)) {
                    final SubLObject var109 = module0158.f10011(var105, (SubLObject)module0439.NIL, var108);
                    SubLObject var110 = (SubLObject)module0439.NIL;
                    final SubLObject var111 = (SubLObject)module0439.NIL;
                    while (module0439.NIL == var110) {
                        final SubLObject var112 = module0052.f3695(var109, var111);
                        final SubLObject var113 = (SubLObject)SubLObjectFactory.makeBoolean(!var111.eql(var112));
                        if (module0439.NIL != var113) {
                            SubLObject var114 = (SubLObject)module0439.NIL;
                            try {
                                var114 = module0158.f10316(var112, (SubLObject)module0439.$ic21$, module0130.f8518(var99), (SubLObject)module0439.NIL);
                                SubLObject var33_125 = (SubLObject)module0439.NIL;
                                final SubLObject var34_126 = (SubLObject)module0439.NIL;
                                while (module0439.NIL == var33_125) {
                                    final SubLObject var115 = module0052.f3695(var114, var34_126);
                                    final SubLObject var36_128 = (SubLObject)SubLObjectFactory.makeBoolean(!var34_126.eql(var115));
                                    if (module0439.NIL != var36_128 && module0439.NIL != module0351.f23568(var115)) {
                                        var100.resetMultipleValues();
                                        final SubLObject var116 = module0235.f15476(var1, module0178.f11285(var115), (SubLObject)module0439.T, (SubLObject)module0439.T);
                                        final SubLObject var117 = var100.secondMultipleValue();
                                        final SubLObject var118 = var100.thirdMultipleValue();
                                        var100.resetMultipleValues();
                                        if (module0439.NIL != var116) {
                                            var101 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var116, var115), var101);
                                        }
                                    }
                                    var33_125 = (SubLObject)SubLObjectFactory.makeBoolean(module0439.NIL == var36_128);
                                }
                            }
                            finally {
                                final SubLObject var122 = Threads.$is_thread_performing_cleanupP$.currentBinding(var100);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0439.T, var100);
                                    if (module0439.NIL != var114) {
                                        module0158.f10319(var114);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var122, var100);
                                }
                            }
                        }
                        var110 = (SubLObject)SubLObjectFactory.makeBoolean(module0439.NIL == var113);
                    }
                }
            }
        }
        else if (var104.eql((SubLObject)module0439.$ic40$)) {
            final SubLObject var123 = module0158.f10299(var102);
            if (module0439.NIL != module0158.f10038(var123)) {
                final SubLObject var124 = (SubLObject)module0439.NIL;
                final SubLObject var125 = module0012.$g73$.currentBinding(var100);
                final SubLObject var126 = module0012.$g65$.currentBinding(var100);
                final SubLObject var127 = module0012.$g67$.currentBinding(var100);
                final SubLObject var128 = module0012.$g68$.currentBinding(var100);
                final SubLObject var129 = module0012.$g66$.currentBinding(var100);
                final SubLObject var130 = module0012.$g69$.currentBinding(var100);
                final SubLObject var131 = module0012.$g70$.currentBinding(var100);
                final SubLObject var132 = module0012.$silent_progressP$.currentBinding(var100);
                try {
                    module0012.$g73$.bind(Time.get_universal_time(), var100);
                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var100), var100);
                    module0012.$g67$.bind((SubLObject)module0439.ONE_INTEGER, var100);
                    module0012.$g68$.bind((SubLObject)module0439.ZERO_INTEGER, var100);
                    module0012.$g66$.bind((SubLObject)module0439.ZERO_INTEGER, var100);
                    module0012.$g69$.bind((SubLObject)module0439.ZERO_INTEGER, var100);
                    module0012.$g70$.bind((SubLObject)module0439.T, var100);
                    module0012.$silent_progressP$.bind((SubLObject)((module0439.NIL != var124) ? module0012.$silent_progressP$.getDynamicValue(var100) : module0439.T), var100);
                    module0012.f474(var124);
                    final SubLObject var133 = module0158.f10039(var123);
                    SubLObject var134 = (SubLObject)module0439.NIL;
                    final SubLObject var135 = (SubLObject)module0439.NIL;
                    while (module0439.NIL == var134) {
                        final SubLObject var136 = module0052.f3695(var133, var135);
                        final SubLObject var137 = (SubLObject)SubLObjectFactory.makeBoolean(!var135.eql(var136));
                        if (module0439.NIL != var137) {
                            module0012.f476();
                            SubLObject var138 = (SubLObject)module0439.NIL;
                            try {
                                var138 = module0158.f10316(var136, (SubLObject)module0439.$ic21$, module0130.f8518(var99), (SubLObject)module0439.NIL);
                                SubLObject var33_126 = (SubLObject)module0439.NIL;
                                final SubLObject var34_127 = (SubLObject)module0439.NIL;
                                while (module0439.NIL == var33_126) {
                                    final SubLObject var139 = module0052.f3695(var138, var34_127);
                                    final SubLObject var36_129 = (SubLObject)SubLObjectFactory.makeBoolean(!var34_127.eql(var139));
                                    if (module0439.NIL != var36_129 && module0439.NIL != module0351.f23568(var139)) {
                                        var100.resetMultipleValues();
                                        final SubLObject var140 = module0235.f15476(var1, module0178.f11285(var139), (SubLObject)module0439.T, (SubLObject)module0439.T);
                                        final SubLObject var141 = var100.secondMultipleValue();
                                        final SubLObject var142 = var100.thirdMultipleValue();
                                        var100.resetMultipleValues();
                                        if (module0439.NIL != var140) {
                                            var101 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var140, var139), var101);
                                        }
                                    }
                                    var33_126 = (SubLObject)SubLObjectFactory.makeBoolean(module0439.NIL == var36_129);
                                }
                            }
                            finally {
                                final SubLObject var42_147 = Threads.$is_thread_performing_cleanupP$.currentBinding(var100);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0439.T, var100);
                                    if (module0439.NIL != var138) {
                                        module0158.f10319(var138);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var42_147, var100);
                                }
                            }
                        }
                        var134 = (SubLObject)SubLObjectFactory.makeBoolean(module0439.NIL == var137);
                    }
                    module0012.f475();
                }
                finally {
                    module0012.$silent_progressP$.rebind(var132, var100);
                    module0012.$g70$.rebind(var131, var100);
                    module0012.$g69$.rebind(var130, var100);
                    module0012.$g66$.rebind(var129, var100);
                    module0012.$g68$.rebind(var128, var100);
                    module0012.$g67$.rebind(var127, var100);
                    module0012.$g65$.rebind(var126, var100);
                    module0012.$g73$.rebind(var125, var100);
                }
            }
        }
        else if (var104.eql((SubLObject)module0439.$ic41$)) {
            SubLObject var143 = module0218.f14453(module0158.f10301(var102), (SubLObject)module0439.UNPROVIDED);
            SubLObject var144 = (SubLObject)module0439.NIL;
            var144 = var143.first();
            while (module0439.NIL != var143) {
                if ((module0439.NIL == module0130.f8518(var99) || module0439.NIL != module0178.f11343(var144, module0130.f8518(var99))) && module0439.NIL != module0351.f23568(var144)) {
                    var100.resetMultipleValues();
                    final SubLObject var145 = module0235.f15476(var1, module0178.f11285(var144), (SubLObject)module0439.T, (SubLObject)module0439.T);
                    final SubLObject var146 = var100.secondMultipleValue();
                    final SubLObject var147 = var100.thirdMultipleValue();
                    var100.resetMultipleValues();
                    if (module0439.NIL != var145) {
                        var101 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var145, var144), var101);
                    }
                }
                var143 = var143.rest();
                var144 = var143.first();
            }
        }
        else {
            module0158.f10295(var102, var103);
        }
        return var101;
    }
    
    public static SubLObject f30684(final SubLObject var1, SubLObject var99) {
        if (var99 == module0439.UNPROVIDED) {
            var99 = (SubLObject)module0439.NIL;
        }
        return f30679(var1, (SubLObject)module0439.$ic42$);
    }
    
    public static SubLObject f30685(final SubLObject var1, SubLObject var99) {
        if (var99 == module0439.UNPROVIDED) {
            var99 = (SubLObject)module0439.NIL;
        }
        return f30679(var1, (SubLObject)module0439.$ic43$);
    }
    
    public static SubLObject f30686(final SubLObject var1) {
        if (module0439.NIL != module0435.f30612(var1, (SubLObject)module0439.$ic44$)) {
            return (SubLObject)module0439.$ic45$;
        }
        return (SubLObject)module0439.$ic46$;
    }
    
    public static SubLObject f30687(final SubLObject var1) {
        return f30682(var1, (SubLObject)module0439.$ic47$);
    }
    
    public static SubLObject f30688(final SubLObject var1) {
        return f30682(var1, (SubLObject)module0439.$ic44$);
    }
    
    public static SubLObject f30689(final SubLObject var124) {
        final SubLObject var125 = module0178.f11332(var124);
        return (SubLObject)ConsesLow.list(var124, module0435.f30617(var125, module0439.$ic48$));
    }
    
    public static SubLObject f30690(final SubLObject var1, SubLObject var99) {
        if (var99 == module0439.UNPROVIDED) {
            var99 = (SubLObject)module0439.NIL;
        }
        return f30679(var1, (SubLObject)module0439.$ic42$);
    }
    
    public static SubLObject f30691(final SubLObject var1, SubLObject var99) {
        if (var99 == module0439.UNPROVIDED) {
            var99 = (SubLObject)module0439.NIL;
        }
        return f30679(var1, (SubLObject)module0439.$ic43$);
    }
    
    public static SubLObject f30692(final SubLObject var1) {
        if (module0439.NIL != module0435.f30612(var1, (SubLObject)module0439.$ic44$)) {
            return (SubLObject)module0439.$ic45$;
        }
        return (SubLObject)module0439.$ic46$;
    }
    
    public static SubLObject f30693(final SubLObject var1) {
        return f30682(var1, (SubLObject)module0439.$ic47$);
    }
    
    public static SubLObject f30694(final SubLObject var1) {
        return f30682(var1, (SubLObject)module0439.$ic44$);
    }
    
    public static SubLObject f30695(final SubLObject var124) {
        final SubLObject var125 = module0178.f11332(var124);
        return (SubLObject)ConsesLow.list(var124, module0435.f30617(var125, module0439.$ic53$));
    }
    
    public static SubLObject f30696(final SubLObject var1, SubLObject var99) {
        if (var99 == module0439.UNPROVIDED) {
            var99 = (SubLObject)module0439.NIL;
        }
        return f30679(var1, (SubLObject)module0439.$ic42$);
    }
    
    public static SubLObject f30697(final SubLObject var1, SubLObject var99) {
        if (var99 == module0439.UNPROVIDED) {
            var99 = (SubLObject)module0439.NIL;
        }
        return f30679(var1, (SubLObject)module0439.$ic43$);
    }
    
    public static SubLObject f30698(final SubLObject var1) {
        if (module0439.NIL != module0435.f30612(var1, (SubLObject)module0439.$ic44$)) {
            return (SubLObject)module0439.$ic45$;
        }
        return (SubLObject)module0439.$ic46$;
    }
    
    public static SubLObject f30699(final SubLObject var1) {
        return f30682(var1, (SubLObject)module0439.$ic47$);
    }
    
    public static SubLObject f30700(final SubLObject var1) {
        return f30682(var1, (SubLObject)module0439.$ic44$);
    }
    
    public static SubLObject f30701(final SubLObject var124, final SubLObject var1) {
        final SubLObject var125 = module0178.f11332(var124);
        final SubLObject var126 = module0435.f30617(var125, module0439.$ic58$);
        SubLObject var127 = f30678(var125);
        final SubLObject var128 = module0178.f11332(var124);
        final SubLObject var129 = module0205.f13333(var1);
        if (module0439.NIL != module0173.f10955(var128) && module0439.NIL != module0173.f10955(var129) && module0439.NIL == module0213.f14081(var128, var129)) {
            var127 = (SubLObject)ConsesLow.cons(module0435.f30621(var128, var129), var127);
        }
        return ConsesLow.append((SubLObject)ConsesLow.list(var124, var126), var127);
    }
    
    public static SubLObject f30702(final SubLObject var1, SubLObject var99) {
        if (var99 == module0439.UNPROVIDED) {
            var99 = (SubLObject)module0439.NIL;
        }
        return f30679(var1, (SubLObject)module0439.$ic42$);
    }
    
    public static SubLObject f30703(final SubLObject var1) {
        if (module0439.NIL != module0435.f30612(var1, (SubLObject)module0439.$ic44$)) {
            return (SubLObject)module0439.$ic45$;
        }
        return (SubLObject)module0439.$ic46$;
    }
    
    public static SubLObject f30704(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0439.NIL;
        final SubLObject var4 = f30674(var1);
        final SubLObject var5 = module0349.f23449(var4, (SubLObject)module0439.$ic47$);
        final SubLObject var7;
        final SubLObject var6 = var7 = module0158.f10294(var5);
        if (var7.eql((SubLObject)module0439.$ic39$)) {
            var2.resetMultipleValues();
            final SubLObject var8 = module0158.f10297(var5);
            final SubLObject var9 = var2.secondMultipleValue();
            final SubLObject var10 = var2.thirdMultipleValue();
            var2.resetMultipleValues();
            if (module0439.NIL != var9) {
                if (module0439.NIL != var10) {
                    final SubLObject var11 = var10;
                    if (module0439.NIL != module0158.f10010(var8, var9, var11)) {
                        final SubLObject var12 = module0158.f10011(var8, var9, var11);
                        SubLObject var13 = (SubLObject)module0439.NIL;
                        final SubLObject var14 = (SubLObject)module0439.NIL;
                        while (module0439.NIL == var13) {
                            final SubLObject var15 = module0052.f3695(var12, var14);
                            final SubLObject var16 = (SubLObject)SubLObjectFactory.makeBoolean(!var14.eql(var15));
                            if (module0439.NIL != var16) {
                                SubLObject var17 = (SubLObject)module0439.NIL;
                                try {
                                    var17 = module0158.f10316(var15, (SubLObject)module0439.$ic21$, module0130.f8518((SubLObject)module0439.$ic47$), (SubLObject)module0439.NIL);
                                    SubLObject var33_155 = (SubLObject)module0439.NIL;
                                    final SubLObject var34_156 = (SubLObject)module0439.NIL;
                                    while (module0439.NIL == var33_155) {
                                        final SubLObject var18 = module0052.f3695(var17, var34_156);
                                        final SubLObject var36_157 = (SubLObject)SubLObjectFactory.makeBoolean(!var34_156.eql(var18));
                                        if (module0439.NIL != var36_157 && module0439.NIL != module0351.f23568(var18)) {
                                            var2.resetMultipleValues();
                                            final SubLObject var19 = module0235.f15476(var4, module0178.f11285(var18), (SubLObject)module0439.T, (SubLObject)module0439.T);
                                            final SubLObject var20 = var2.secondMultipleValue();
                                            final SubLObject var21 = var2.thirdMultipleValue();
                                            var2.resetMultipleValues();
                                            if (module0439.NIL != var19) {
                                                var3 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var19, var18), var3);
                                            }
                                        }
                                        var33_155 = (SubLObject)SubLObjectFactory.makeBoolean(module0439.NIL == var36_157);
                                    }
                                }
                                finally {
                                    final SubLObject var22 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0439.T, var2);
                                        if (module0439.NIL != var17) {
                                            module0158.f10319(var17);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var22, var2);
                                    }
                                }
                            }
                            var13 = (SubLObject)SubLObjectFactory.makeBoolean(module0439.NIL == var16);
                        }
                    }
                }
                else {
                    final SubLObject var11 = (SubLObject)module0439.NIL;
                    if (module0439.NIL != module0158.f10010(var8, var9, var11)) {
                        final SubLObject var12 = module0158.f10011(var8, var9, var11);
                        SubLObject var13 = (SubLObject)module0439.NIL;
                        final SubLObject var14 = (SubLObject)module0439.NIL;
                        while (module0439.NIL == var13) {
                            final SubLObject var15 = module0052.f3695(var12, var14);
                            final SubLObject var16 = (SubLObject)SubLObjectFactory.makeBoolean(!var14.eql(var15));
                            if (module0439.NIL != var16) {
                                SubLObject var17 = (SubLObject)module0439.NIL;
                                try {
                                    var17 = module0158.f10316(var15, (SubLObject)module0439.$ic21$, module0130.f8518((SubLObject)module0439.$ic47$), (SubLObject)module0439.NIL);
                                    SubLObject var33_156 = (SubLObject)module0439.NIL;
                                    final SubLObject var34_157 = (SubLObject)module0439.NIL;
                                    while (module0439.NIL == var33_156) {
                                        final SubLObject var18 = module0052.f3695(var17, var34_157);
                                        final SubLObject var36_158 = (SubLObject)SubLObjectFactory.makeBoolean(!var34_157.eql(var18));
                                        if (module0439.NIL != var36_158 && module0439.NIL != module0351.f23568(var18)) {
                                            var2.resetMultipleValues();
                                            final SubLObject var19 = module0235.f15476(var4, module0178.f11285(var18), (SubLObject)module0439.T, (SubLObject)module0439.T);
                                            final SubLObject var20 = var2.secondMultipleValue();
                                            final SubLObject var21 = var2.thirdMultipleValue();
                                            var2.resetMultipleValues();
                                            if (module0439.NIL != var19) {
                                                var3 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var19, var18), var3);
                                            }
                                        }
                                        var33_156 = (SubLObject)SubLObjectFactory.makeBoolean(module0439.NIL == var36_158);
                                    }
                                }
                                finally {
                                    final SubLObject var23 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0439.T, var2);
                                        if (module0439.NIL != var17) {
                                            module0158.f10319(var17);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var23, var2);
                                    }
                                }
                            }
                            var13 = (SubLObject)SubLObjectFactory.makeBoolean(module0439.NIL == var16);
                        }
                    }
                }
            }
            else if (module0439.NIL != var10) {
                final SubLObject var11 = var10;
                if (module0439.NIL != module0158.f10010(var8, (SubLObject)module0439.NIL, var11)) {
                    final SubLObject var12 = module0158.f10011(var8, (SubLObject)module0439.NIL, var11);
                    SubLObject var13 = (SubLObject)module0439.NIL;
                    final SubLObject var14 = (SubLObject)module0439.NIL;
                    while (module0439.NIL == var13) {
                        final SubLObject var15 = module0052.f3695(var12, var14);
                        final SubLObject var16 = (SubLObject)SubLObjectFactory.makeBoolean(!var14.eql(var15));
                        if (module0439.NIL != var16) {
                            SubLObject var17 = (SubLObject)module0439.NIL;
                            try {
                                var17 = module0158.f10316(var15, (SubLObject)module0439.$ic21$, module0130.f8518((SubLObject)module0439.$ic47$), (SubLObject)module0439.NIL);
                                SubLObject var33_157 = (SubLObject)module0439.NIL;
                                final SubLObject var34_158 = (SubLObject)module0439.NIL;
                                while (module0439.NIL == var33_157) {
                                    final SubLObject var18 = module0052.f3695(var17, var34_158);
                                    final SubLObject var36_159 = (SubLObject)SubLObjectFactory.makeBoolean(!var34_158.eql(var18));
                                    if (module0439.NIL != var36_159 && module0439.NIL != module0351.f23568(var18)) {
                                        var2.resetMultipleValues();
                                        final SubLObject var19 = module0235.f15476(var4, module0178.f11285(var18), (SubLObject)module0439.T, (SubLObject)module0439.T);
                                        final SubLObject var20 = var2.secondMultipleValue();
                                        final SubLObject var21 = var2.thirdMultipleValue();
                                        var2.resetMultipleValues();
                                        if (module0439.NIL != var19) {
                                            var3 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var19, var18), var3);
                                        }
                                    }
                                    var33_157 = (SubLObject)SubLObjectFactory.makeBoolean(module0439.NIL == var36_159);
                                }
                            }
                            finally {
                                final SubLObject var24 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0439.T, var2);
                                    if (module0439.NIL != var17) {
                                        module0158.f10319(var17);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var24, var2);
                                }
                            }
                        }
                        var13 = (SubLObject)SubLObjectFactory.makeBoolean(module0439.NIL == var16);
                    }
                }
            }
            else {
                final SubLObject var11 = (SubLObject)module0439.NIL;
                if (module0439.NIL != module0158.f10010(var8, (SubLObject)module0439.NIL, var11)) {
                    final SubLObject var12 = module0158.f10011(var8, (SubLObject)module0439.NIL, var11);
                    SubLObject var13 = (SubLObject)module0439.NIL;
                    final SubLObject var14 = (SubLObject)module0439.NIL;
                    while (module0439.NIL == var13) {
                        final SubLObject var15 = module0052.f3695(var12, var14);
                        final SubLObject var16 = (SubLObject)SubLObjectFactory.makeBoolean(!var14.eql(var15));
                        if (module0439.NIL != var16) {
                            SubLObject var17 = (SubLObject)module0439.NIL;
                            try {
                                var17 = module0158.f10316(var15, (SubLObject)module0439.$ic21$, module0130.f8518((SubLObject)module0439.$ic47$), (SubLObject)module0439.NIL);
                                SubLObject var33_158 = (SubLObject)module0439.NIL;
                                final SubLObject var34_159 = (SubLObject)module0439.NIL;
                                while (module0439.NIL == var33_158) {
                                    final SubLObject var18 = module0052.f3695(var17, var34_159);
                                    final SubLObject var36_160 = (SubLObject)SubLObjectFactory.makeBoolean(!var34_159.eql(var18));
                                    if (module0439.NIL != var36_160 && module0439.NIL != module0351.f23568(var18)) {
                                        var2.resetMultipleValues();
                                        final SubLObject var19 = module0235.f15476(var4, module0178.f11285(var18), (SubLObject)module0439.T, (SubLObject)module0439.T);
                                        final SubLObject var20 = var2.secondMultipleValue();
                                        final SubLObject var21 = var2.thirdMultipleValue();
                                        var2.resetMultipleValues();
                                        if (module0439.NIL != var19) {
                                            var3 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var19, var18), var3);
                                        }
                                    }
                                    var33_158 = (SubLObject)SubLObjectFactory.makeBoolean(module0439.NIL == var36_160);
                                }
                            }
                            finally {
                                final SubLObject var25 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0439.T, var2);
                                    if (module0439.NIL != var17) {
                                        module0158.f10319(var17);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var25, var2);
                                }
                            }
                        }
                        var13 = (SubLObject)SubLObjectFactory.makeBoolean(module0439.NIL == var16);
                    }
                }
            }
        }
        else if (var7.eql((SubLObject)module0439.$ic40$)) {
            final SubLObject var26 = module0158.f10299(var5);
            if (module0439.NIL != module0158.f10038(var26)) {
                final SubLObject var27 = (SubLObject)module0439.NIL;
                final SubLObject var28 = module0012.$g73$.currentBinding(var2);
                final SubLObject var29 = module0012.$g65$.currentBinding(var2);
                final SubLObject var30 = module0012.$g67$.currentBinding(var2);
                final SubLObject var31 = module0012.$g68$.currentBinding(var2);
                final SubLObject var32 = module0012.$g66$.currentBinding(var2);
                final SubLObject var33 = module0012.$g69$.currentBinding(var2);
                final SubLObject var34 = module0012.$g70$.currentBinding(var2);
                final SubLObject var35 = module0012.$silent_progressP$.currentBinding(var2);
                try {
                    module0012.$g73$.bind(Time.get_universal_time(), var2);
                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var2), var2);
                    module0012.$g67$.bind((SubLObject)module0439.ONE_INTEGER, var2);
                    module0012.$g68$.bind((SubLObject)module0439.ZERO_INTEGER, var2);
                    module0012.$g66$.bind((SubLObject)module0439.ZERO_INTEGER, var2);
                    module0012.$g69$.bind((SubLObject)module0439.ZERO_INTEGER, var2);
                    module0012.$g70$.bind((SubLObject)module0439.T, var2);
                    module0012.$silent_progressP$.bind((SubLObject)((module0439.NIL != var27) ? module0012.$silent_progressP$.getDynamicValue(var2) : module0439.T), var2);
                    module0012.f474(var27);
                    final SubLObject var36 = module0158.f10039(var26);
                    SubLObject var37 = (SubLObject)module0439.NIL;
                    final SubLObject var38 = (SubLObject)module0439.NIL;
                    while (module0439.NIL == var37) {
                        final SubLObject var39 = module0052.f3695(var36, var38);
                        final SubLObject var40 = (SubLObject)SubLObjectFactory.makeBoolean(!var38.eql(var39));
                        if (module0439.NIL != var40) {
                            module0012.f476();
                            SubLObject var41 = (SubLObject)module0439.NIL;
                            try {
                                var41 = module0158.f10316(var39, (SubLObject)module0439.$ic21$, module0130.f8518((SubLObject)module0439.$ic47$), (SubLObject)module0439.NIL);
                                SubLObject var33_159 = (SubLObject)module0439.NIL;
                                final SubLObject var34_160 = (SubLObject)module0439.NIL;
                                while (module0439.NIL == var33_159) {
                                    final SubLObject var42 = module0052.f3695(var41, var34_160);
                                    final SubLObject var36_161 = (SubLObject)SubLObjectFactory.makeBoolean(!var34_160.eql(var42));
                                    if (module0439.NIL != var36_161 && module0439.NIL != module0351.f23568(var42)) {
                                        var2.resetMultipleValues();
                                        final SubLObject var43 = module0235.f15476(var4, module0178.f11285(var42), (SubLObject)module0439.T, (SubLObject)module0439.T);
                                        final SubLObject var44 = var2.secondMultipleValue();
                                        final SubLObject var45 = var2.thirdMultipleValue();
                                        var2.resetMultipleValues();
                                        if (module0439.NIL != var43) {
                                            var3 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var43, var42), var3);
                                        }
                                    }
                                    var33_159 = (SubLObject)SubLObjectFactory.makeBoolean(module0439.NIL == var36_161);
                                }
                            }
                            finally {
                                final SubLObject var42_170 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0439.T, var2);
                                    if (module0439.NIL != var41) {
                                        module0158.f10319(var41);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var42_170, var2);
                                }
                            }
                        }
                        var37 = (SubLObject)SubLObjectFactory.makeBoolean(module0439.NIL == var40);
                    }
                    module0012.f475();
                }
                finally {
                    module0012.$silent_progressP$.rebind(var35, var2);
                    module0012.$g70$.rebind(var34, var2);
                    module0012.$g69$.rebind(var33, var2);
                    module0012.$g66$.rebind(var32, var2);
                    module0012.$g68$.rebind(var31, var2);
                    module0012.$g67$.rebind(var30, var2);
                    module0012.$g65$.rebind(var29, var2);
                    module0012.$g73$.rebind(var28, var2);
                }
            }
        }
        else if (var7.eql((SubLObject)module0439.$ic41$)) {
            SubLObject var46 = module0218.f14453(module0158.f10301(var5), (SubLObject)module0439.UNPROVIDED);
            SubLObject var47 = (SubLObject)module0439.NIL;
            var47 = var46.first();
            while (module0439.NIL != var46) {
                if ((module0439.NIL == module0130.f8518((SubLObject)module0439.$ic47$) || module0439.NIL != module0178.f11343(var47, module0130.f8518((SubLObject)module0439.$ic47$))) && module0439.NIL != module0351.f23568(var47)) {
                    var2.resetMultipleValues();
                    final SubLObject var48 = module0235.f15476(var4, module0178.f11285(var47), (SubLObject)module0439.T, (SubLObject)module0439.T);
                    final SubLObject var49 = var2.secondMultipleValue();
                    final SubLObject var50 = var2.thirdMultipleValue();
                    var2.resetMultipleValues();
                    if (module0439.NIL != var48) {
                        var3 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var48, var47), var3);
                    }
                }
                var46 = var46.rest();
                var47 = var46.first();
            }
        }
        else {
            module0158.f10295(var5, var6);
        }
        if (module0439.NIL != var3) {
            return module0052.f3709(var3);
        }
        return (SubLObject)module0439.NIL;
    }
    
    public static SubLObject f30705(final SubLObject var124) {
        final SubLObject var125 = module0178.f11332(var124);
        return (SubLObject)ConsesLow.list(var124, module0435.f30617(var125, module0439.$ic63$));
    }
    
    public static SubLObject f30706() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0439", "f30674", "S#33925", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0439", "f30675", "S#33926", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0439", "f30676", "S#33927");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0439", "f30677", "S#33928");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0439", "f30678", "S#33929", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0439", "f30679", "S#33930", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0439", "f30680", "S#33931", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0439", "f30681", "S#33932", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0439", "f30682", "S#33933", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0439", "f30683", "S#33934", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0439", "f30684", "S#33922", 1, 1, false);
        new $f30684$UnaryFunction();
        new $f30684$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0439", "f30685", "S#33935", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0439", "f30686", "S#33936", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0439", "f30687", "S#33923", 1, 0, false);
        new $f30687$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0439", "f30688", "S#33937", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0439", "f30689", "S#33924", 1, 0, false);
        new $f30689$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0439", "f30690", "S#33938", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0439", "f30691", "S#33939", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0439", "f30692", "S#33940", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0439", "f30693", "S#33941", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0439", "f30694", "S#33942", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0439", "f30695", "S#33943", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0439", "f30696", "S#33944", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0439", "f30697", "S#33945", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0439", "f30698", "S#33946", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0439", "f30699", "S#33947", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0439", "f30700", "S#33948", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0439", "f30701", "S#33949", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0439", "f30702", "S#33950", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0439", "f30703", "S#33951", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0439", "f30704", "S#33952", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0439", "f30705", "S#33953", 1, 0, false);
        return (SubLObject)module0439.NIL;
    }
    
    public static SubLObject f30707() {
        return (SubLObject)module0439.NIL;
    }
    
    public static SubLObject f30708() {
        module0002.f35((SubLObject)module0439.$ic0$, (SubLObject)module0439.$ic1$);
        module0340.f22941((SubLObject)module0439.$ic49$, (SubLObject)module0439.$ic50$);
        module0340.f22941((SubLObject)module0439.$ic51$, (SubLObject)module0439.$ic52$);
        module0340.f22941((SubLObject)module0439.$ic54$, (SubLObject)module0439.$ic55$);
        module0340.f22941((SubLObject)module0439.$ic56$, (SubLObject)module0439.$ic57$);
        module0340.f22941((SubLObject)module0439.$ic59$, (SubLObject)module0439.$ic60$);
        module0340.f22941((SubLObject)module0439.$ic61$, (SubLObject)module0439.$ic62$);
        module0340.f22941((SubLObject)module0439.$ic64$, (SubLObject)module0439.$ic65$);
        return (SubLObject)module0439.NIL;
    }
    
    public void declareFunctions() {
        f30706();
    }
    
    public void initializeVariables() {
        f30707();
    }
    
    public void runTopLevelForms() {
        f30708();
    }
    
    static {
        me = (SubLFile)new module0439();
        $ic0$ = SubLObjectFactory.makeSymbol("S#33926", "CYC");
        $ic1$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#33925", "CYC"));
        $ic2$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#33954", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#33955", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic4$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic5$ = SubLObjectFactory.makeKeyword("DONE");
        $ic6$ = SubLObjectFactory.makeUninternedSymbol("US#2750275");
        $ic7$ = SubLObjectFactory.makeSymbol("CLET");
        $ic8$ = SubLObjectFactory.makeSymbol("PIF");
        $ic9$ = SubLObjectFactory.makeSymbol("EL-BINARY-FORMULA-P");
        $ic10$ = SubLObjectFactory.makeSymbol("S#33925", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("DO-LIST");
        $ic12$ = SubLObjectFactory.makeSymbol("S#16158", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("PUNLESS");
        $ic14$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#33954", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#33955", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#33956", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic15$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"), (SubLObject)SubLObjectFactory.makeKeyword("PENETRATE-ARGS?"));
        $ic16$ = SubLObjectFactory.makeKeyword("PENETRATE-ARGS?");
        $ic17$ = SubLObjectFactory.makeUninternedSymbol("US#2750275");
        $ic18$ = SubLObjectFactory.makeSymbol("S#16159", "CYC");
        $ic19$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("S#15433", "CYC"));
        $ic20$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("commutativeInArgs"));
        $ic21$ = SubLObjectFactory.makeKeyword("GAF");
        $ic22$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("commutativeInArgsAndRest"));
        $ic23$ = SubLObjectFactory.makeKeyword("DEPTH");
        $ic24$ = SubLObjectFactory.makeKeyword("STACK");
        $ic25$ = SubLObjectFactory.makeKeyword("QUEUE");
        $ic26$ = SubLObjectFactory.makeSymbol("S#11450", "CYC");
        $ic27$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic28$ = SubLObjectFactory.makeString("~A is not a ~A");
        $ic29$ = SubLObjectFactory.makeSymbol("S#11592", "CYC");
        $ic30$ = SubLObjectFactory.makeKeyword("CERROR");
        $ic31$ = SubLObjectFactory.makeString("continue anyway");
        $ic32$ = SubLObjectFactory.makeKeyword("WARN");
        $ic33$ = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic34$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $ic35$ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $ic36$ = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic37$ = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic38$ = SubLObjectFactory.makeSymbol("S#15433", "CYC");
        $ic39$ = SubLObjectFactory.makeKeyword("GAF-ARG");
        $ic40$ = SubLObjectFactory.makeKeyword("PREDICATE-EXTENT");
        $ic41$ = SubLObjectFactory.makeKeyword("OVERLAP");
        $ic42$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic43$ = SubLObjectFactory.makeKeyword("FALSE");
        $ic44$ = SubLObjectFactory.makeKeyword("NEG");
        $ic45$ = SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE");
        $ic46$ = SubLObjectFactory.makeKeyword("INCOMPLETE");
        $ic47$ = SubLObjectFactory.makeKeyword("POS");
        $ic48$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("SymmetricBinaryPredicate"));
        $ic49$ = SubLObjectFactory.makeKeyword("REMOVAL-SYMMETRIC-LOOKUP-POS");
        $ic50$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("ARITY"), module0439.TWO_INTEGER, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26074", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#33922", "CYC"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#33923", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#18075", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"))), SubLObjectFactory.makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#33924", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<symmetric predicate> <whatever> <whatever>)\nfrom (<symmetric predicate> <arg2> <arg1>) assertion"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$bordersOn #$Canada #$UnitedStatesOfAmerica)") });
        $ic51$ = SubLObjectFactory.makeKeyword("REMOVAL-SYMMETRIC-LOOKUP-NEG");
        $ic52$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("ARITY"), module0439.TWO_INTEGER, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26074", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#33935", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#33936", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#33937", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#18075", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"))), SubLObjectFactory.makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#33924", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (<symmetric predicate> <whatever> <whatever>))\nfrom (#$not (<symmetric predicate> <arg2> <arg1>)) assertion") });
        $ic53$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CommutativePredicate"));
        $ic54$ = SubLObjectFactory.makeKeyword("REMOVAL-COMMUTATIVE-LOOKUP-POS");
        $ic55$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("ARITY"), module0439.NIL, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.listS((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26075", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#33938", "CYC"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#33941", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#18075", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"))), SubLObjectFactory.makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#33943", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<commutative predicate> . <args>)\nfrom (<commutative predicate> . <reordered args>) assertion"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$collinear <some point> <some other point> <some other other point>)") });
        $ic56$ = SubLObjectFactory.makeKeyword("REMOVAL-COMMUTATIVE-LOOKUP-NEG");
        $ic57$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("ARITY"), module0439.NIL, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.listS((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26075", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#33939", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#33940", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#33942", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#18075", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"))), SubLObjectFactory.makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#33943", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<commutative predicate> . <args>)\nfrom (<commutative predicate> . <reordered args>) assertion"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$collinear <some point> <some other point> <some other other point>))") });
        $ic58$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("PartiallyCommutativePredicate"));
        $ic59$ = SubLObjectFactory.makeKeyword("REMOVAL-PARTIALLY-COMMUTATIVE-LOOKUP-POS");
        $ic60$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("ARITY"), module0439.NIL, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.listS((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26076", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#33944", "CYC"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#33947", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#18075", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"))), SubLObjectFactory.makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#33949", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<partially commutative predicate> . <args>)\nfrom (<partially commutative predicate> . <reordered args>) assertion"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(distanceBetween PlanetEarth Sun ((Mega Mile) 93))\n    from \n    (distanceBetween Sun PlanetEarth ((Mega Mile) 93))") });
        $ic61$ = SubLObjectFactory.makeKeyword("REMOVAL-PARTIALLY-COMMUTATIVE-LOOKUP-NEG");
        $ic62$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("ARITY"), module0439.NIL, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.listS((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26076", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#33945", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#33946", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#33948", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#18075", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"))), SubLObjectFactory.makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#33949", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<partially commutative predicate> . <args>)\nfrom (<partially commutative predicate> . <reordered args>) assertion"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(not (distanceBetween PlanetEarth Sun (Inch 93)))\n    from \n    (not (distanceBetween Sun PlanetEarth (Inch 93)))") });
        $ic63$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("AsymmetricBinaryPredicate"));
        $ic64$ = SubLObjectFactory.makeKeyword("REMOVAL-ASYMMETRIC-LOOKUP");
        $ic65$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("ARITY"), module0439.TWO_INTEGER, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"))), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26095", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#33950", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#33951", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#33952", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#18075", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"))), SubLObjectFactory.makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#33953", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (<asymmetric predicate> <non-fort> <non-fort>))\nfrom (<asymmetric predicate> <arg2> <arg1>) assertion.\nNB: the case in which either arg is a FORT is subsumed by\nnegationInverse modules."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$northOf #$UnitedStatesOfAmerica #$Canada))") });
    }
    
    public static final class $f30684$UnaryFunction extends UnaryFunction
    {
        public $f30684$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#33922"));
        }
        
        public SubLObject processItem(final SubLObject var148) {
            return module0439.f30684(var148, (SubLObject)$f30684$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f30684$BinaryFunction extends BinaryFunction
    {
        public $f30684$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#33922"));
        }
        
        public SubLObject processItem(final SubLObject var148, final SubLObject var149) {
            return module0439.f30684(var148, var149);
        }
    }
    
    public static final class $f30687$UnaryFunction extends UnaryFunction
    {
        public $f30687$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#33923"));
        }
        
        public SubLObject processItem(final SubLObject var148) {
            return module0439.f30687(var148);
        }
    }
    
    public static final class $f30689$UnaryFunction extends UnaryFunction
    {
        public $f30689$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#33924"));
        }
        
        public SubLObject processItem(final SubLObject var148) {
            return module0439.f30689(var148);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0439.class
	Total time: 1327 ms
	
	Decompiled with Procyon 0.5.32.
*/