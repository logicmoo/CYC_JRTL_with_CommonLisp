package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0248 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0248";
    public static final String myFingerPrint = "12f7d36e3fb8581143bb642be1ac98cbfc6df1345556475325126436e7d2ea5e";
    public static SubLSymbol $g2467$;
    public static SubLSymbol $g2468$;
    private static SubLSymbol $g2469$;
    private static SubLSymbol $g2470$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLString $ic3$;
    private static final SubLString $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLString $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLString $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLString $ic13$;
    private static final SubLObject $ic14$;
    private static final SubLString $ic15$;
    private static final SubLString $ic16$;
    private static final SubLObject $ic17$;
    private static final SubLString $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLString $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLObject $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLObject $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLString $ic32$;
    private static final SubLList $ic33$;
    private static final SubLString $ic34$;
    private static final SubLString $ic35$;
    private static final SubLString $ic36$;
    private static final SubLString $ic37$;
    private static final SubLString $ic38$;
    private static final SubLString $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLInteger $ic41$;
    private static final SubLObject $ic42$;
    private static final SubLObject $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLList $ic45$;
    private static final SubLList $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLList $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLList $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLList $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLObject $ic68$;
    private static final SubLList $ic69$;
    private static final SubLList $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLList $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLList $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLList $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLInteger $ic89$;
    private static final SubLString $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLList $ic93$;
    private static final SubLList $ic94$;
    private static final SubLList $ic95$;
    private static final SubLSymbol $ic96$;
    
    
    public static SubLObject f15916(final SubLObject var1, final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0248.NIL;
        final SubLObject var4 = module0242.f15664(var1, module0137.f8955((SubLObject)module0248.UNPROVIDED));
        var3 = module0245.f15834(var4, var2, module0137.f8955((SubLObject)module0248.UNPROVIDED));
        return var3;
    }
    
    public static SubLObject f15917(final SubLObject var1) {
        return f15916(var1, (SubLObject)module0248.$ic0$);
    }
    
    public static SubLObject f15918(final SubLObject var1) {
        return f15916(var1, (SubLObject)module0248.$ic1$);
    }
    
    public static SubLObject f15919(final SubLObject var1) {
        return f15916(var1, (SubLObject)module0248.$ic2$);
    }
    
    public static SubLObject f15920(final SubLObject var1, final SubLObject var2, final SubLObject var5, final SubLObject var6) {
        final SubLObject var7 = f15916(var1, var2);
        if (module0248.NIL != var7) {
            final SubLObject var8 = module0245.f15844(var7, var5);
            if (module0248.NIL != var8) {
                return module0245.f15852(var8, var6);
            }
        }
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f15921(final SubLObject var1, final SubLObject var5, final SubLObject var6) {
        return f15920(var1, module0244.f15778(module0137.f8955((SubLObject)module0248.UNPROVIDED)), var5, var6);
    }
    
    public static SubLObject f15922(final SubLObject var1, final SubLObject var5, final SubLObject var6) {
        return f15920(var1, module0244.f15780(module0137.f8955((SubLObject)module0248.UNPROVIDED)), var5, var6);
    }
    
    public static SubLObject f15923(final SubLObject var9, final SubLObject var1, final SubLObject var2, final SubLObject var5, final SubLObject var6) {
        final SubLObject var10 = f15916(var1, var2);
        if (module0248.NIL != var10) {
            final SubLObject var11 = module0245.f15844(var10, var5);
            if (module0248.NIL != var11) {
                return module0004.f104(var9, module0245.f15852(var11, var6), (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED);
            }
        }
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f15924(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0248.NIL;
        final SubLObject var4 = module0200.f12443(module0137.f8955((SubLObject)module0248.UNPROVIDED));
        SubLObject var5;
        SubLObject var6;
        SubLObject var7;
        SubLObject var8;
        SubLObject var17_18;
        SubLObject var9;
        SubLObject var10;
        SubLObject var11;
        SubLObject var12;
        SubLObject var13;
        SubLObject var15_24;
        SubLObject var21_25;
        SubLObject var14;
        SubLObject var15;
        SubLObject var15_25;
        SubLObject var16;
        SubLObject var17;
        SubLObject var18;
        SubLObject var19;
        SubLObject var20;
        SubLObject var21;
        SubLObject var22;
        SubLObject var23;
        SubLObject var13_35;
        SubLObject var24;
        SubLObject var15_26;
        SubLObject var26;
        SubLObject var25;
        SubLObject var27;
        SubLObject var28;
        SubLObject var29;
        SubLObject var30;
        SubLObject var31;
        SubLObject var32;
        for (var5 = (SubLObject)module0248.NIL, var5 = var4; module0248.NIL == var3 && module0248.NIL != var5; var5 = var5.rest()) {
            var6 = var5.first();
            var7 = module0137.$g1605$.currentBinding(var2);
            var8 = module0141.$g1674$.currentBinding(var2);
            try {
                module0137.$g1605$.bind(var6, var2);
                module0141.$g1674$.bind((SubLObject)((module0248.NIL != module0141.f9205((SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0248.NIL == module0141.$g1674$.getDynamicValue(var2)) : module0141.$g1674$.getDynamicValue(var2)), var2);
                var17_18 = module0228.f15229(var1);
                if (module0248.NIL != module0138.f8992(var17_18)) {
                    var9 = module0242.f15664(var17_18, module0137.f8955((SubLObject)module0248.UNPROVIDED));
                    if (module0248.NIL != var9) {
                        var10 = module0245.f15834(var9, module0138.f8979(), module0137.f8955((SubLObject)module0248.UNPROVIDED));
                        if (module0248.NIL != var10) {
                            for (var11 = module0066.f4838(module0067.f4891(var10)); module0248.NIL == var3 && module0248.NIL == module0066.f4841(var11); var11 = module0066.f4840(var11)) {
                                var2.resetMultipleValues();
                                var12 = module0066.f4839(var11);
                                var13 = var2.secondMultipleValue();
                                var2.resetMultipleValues();
                                if (module0248.NIL != module0147.f9507(var12)) {
                                    var15_24 = module0138.$g1623$.currentBinding(var2);
                                    try {
                                        module0138.$g1623$.bind(var12, var2);
                                        for (var21_25 = module0066.f4838(module0067.f4891(var13)); module0248.NIL == var3 && module0248.NIL == module0066.f4841(var21_25); var21_25 = module0066.f4840(var21_25)) {
                                            var2.resetMultipleValues();
                                            var14 = module0066.f4839(var21_25);
                                            var15 = var2.secondMultipleValue();
                                            var2.resetMultipleValues();
                                            if (module0248.NIL != module0141.f9289(var14)) {
                                                var15_25 = module0138.$g1624$.currentBinding(var2);
                                                try {
                                                    module0138.$g1624$.bind(var14, var2);
                                                    var16 = var15;
                                                    if (module0248.NIL != module0077.f5302(var16)) {
                                                        var17 = module0077.f5333(var16);
                                                        for (var18 = module0032.f1741(var17), var19 = (SubLObject)module0248.NIL, var19 = module0032.f1742(var18, var17); module0248.NIL == var3 && module0248.NIL == module0032.f1744(var18, var19); var19 = module0032.f1743(var19)) {
                                                            var20 = module0032.f1745(var18, var19);
                                                            if (module0248.NIL != module0032.f1746(var19, var20) && module0248.NIL != var20) {
                                                                var3 = (SubLObject)module0248.T;
                                                            }
                                                        }
                                                    }
                                                    else if (var16.isList()) {
                                                        if (module0248.NIL == var3) {
                                                            var21 = var16;
                                                            var22 = (SubLObject)module0248.NIL;
                                                            var22 = var21.first();
                                                            while (module0248.NIL == var3 && module0248.NIL != var21) {
                                                                if (module0248.NIL != var22) {
                                                                    var3 = (SubLObject)module0248.T;
                                                                }
                                                                var21 = var21.rest();
                                                                var22 = var21.first();
                                                            }
                                                        }
                                                    }
                                                    else {
                                                        Errors.error((SubLObject)module0248.$ic3$, var16);
                                                    }
                                                }
                                                finally {
                                                    module0138.$g1624$.rebind(var15_25, var2);
                                                }
                                            }
                                        }
                                        module0066.f4842(var21_25);
                                    }
                                    finally {
                                        module0138.$g1623$.rebind(var15_24, var2);
                                    }
                                }
                            }
                            module0066.f4842(var11);
                        }
                    }
                    else {
                        module0136.f8870((SubLObject)module0248.FIVE_INTEGER, (SubLObject)module0248.$ic4$, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED);
                    }
                }
                else if (module0248.NIL != module0155.f9785(var17_18, (SubLObject)module0248.UNPROVIDED)) {
                    var23 = ((module0248.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var2), module0137.f8955((SubLObject)module0248.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var2), module0137.f8955((SubLObject)module0248.UNPROVIDED)));
                    for (var13_35 = (SubLObject)module0248.NIL, var13_35 = var23; module0248.NIL == var3 && module0248.NIL != var13_35; var13_35 = var13_35.rest()) {
                        var24 = var13_35.first();
                        var15_26 = module0138.$g1625$.currentBinding(var2);
                        try {
                            module0138.$g1625$.bind(var24, var2);
                            var25 = (var26 = Functions.funcall(var24, var17_18));
                            if (module0248.NIL != module0077.f5302(var26)) {
                                var27 = module0077.f5333(var26);
                                for (var28 = module0032.f1741(var27), var29 = (SubLObject)module0248.NIL, var29 = module0032.f1742(var28, var27); module0248.NIL == var3 && module0248.NIL == module0032.f1744(var28, var29); var29 = module0032.f1743(var29)) {
                                    var30 = module0032.f1745(var28, var29);
                                    if (module0248.NIL != module0032.f1746(var29, var30) && module0248.NIL != var30) {
                                        var3 = (SubLObject)module0248.T;
                                    }
                                }
                            }
                            else if (var26.isList()) {
                                if (module0248.NIL == var3) {
                                    var31 = var26;
                                    var32 = (SubLObject)module0248.NIL;
                                    var32 = var31.first();
                                    while (module0248.NIL == var3 && module0248.NIL != var31) {
                                        if (module0248.NIL != var32) {
                                            var3 = (SubLObject)module0248.T;
                                        }
                                        var31 = var31.rest();
                                        var32 = var31.first();
                                    }
                                }
                            }
                            else {
                                Errors.error((SubLObject)module0248.$ic3$, var26);
                            }
                        }
                        finally {
                            module0138.$g1625$.rebind(var15_26, var2);
                        }
                    }
                }
            }
            finally {
                module0141.$g1674$.rebind(var8, var2);
                module0137.$g1605$.rebind(var7, var2);
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0248.NIL == var3);
    }
    
    public static SubLObject f15925(final SubLObject var38, final SubLObject var1) {
        assert module0248.NIL != module0137.f8885(var38) : var38;
        if (module0248.NIL != module0244.f15779(var38)) {
            return module0035.f2272(ConsesLow.nconc(f15926(var38, var1), f15927(var38, var1)));
        }
        return f15926(var38, var1);
    }
    
    public static SubLObject f15926(final SubLObject var38, final SubLObject var1) {
        assert module0248.NIL != module0137.f8885(var38) : var38;
        return module0245.f15843(var1, module0244.f15778(var38), var38);
    }
    
    public static SubLObject f15927(final SubLObject var38, final SubLObject var1) {
        assert module0248.NIL != module0137.f8885(var38) : var38;
        return module0245.f15843(var1, module0244.f15780(var38), var38);
    }
    
    public static SubLObject f15928(final SubLObject var1, final SubLObject var2) {
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f15929(final SubLObject var38, final SubLObject var1, final SubLObject var2, SubLObject var5, SubLObject var6, SubLObject var39) {
        if (var5 == module0248.UNPROVIDED) {
            var5 = (SubLObject)module0248.NIL;
        }
        if (var6 == module0248.UNPROVIDED) {
            var6 = (SubLObject)module0248.NIL;
        }
        if (var39 == module0248.UNPROVIDED) {
            var39 = (SubLObject)module0248.NIL;
        }
        final SubLThread var40 = SubLProcess.currentSubLThread();
        assert module0248.NIL != module0137.f8885(var38) : var38;
        SubLObject var41 = (SubLObject)module0248.NIL;
        final SubLObject var42 = module0137.$g1605$.currentBinding(var40);
        try {
            module0137.$g1605$.bind(var38, var40);
            final SubLObject var43 = var5;
            final SubLObject var15_41 = module0147.$g2095$.currentBinding(var40);
            final SubLObject var44 = module0147.$g2094$.currentBinding(var40);
            final SubLObject var45 = module0147.$g2096$.currentBinding(var40);
            try {
                module0147.$g2095$.bind(module0147.f9545(var43), var40);
                module0147.$g2094$.bind(module0147.f9546(var43), var40);
                module0147.$g2096$.bind(module0147.f9549(var43), var40);
                final SubLObject var46 = var6;
                final SubLObject var15_42 = module0141.$g1714$.currentBinding(var40);
                final SubLObject var16_45 = module0141.$g1715$.currentBinding(var40);
                try {
                    module0141.$g1714$.bind((module0248.NIL != var46) ? var46 : module0141.$g1714$.getDynamicValue(var40), var40);
                    module0141.$g1715$.bind((SubLObject)((module0248.NIL != var46) ? module0248.$ic6$ : module0141.$g1715$.getDynamicValue(var40)), var40);
                    if (module0248.NIL != var46 && module0248.NIL != module0136.f8864() && module0248.NIL == module0141.f9282(var46)) {
                        final SubLObject var47 = module0136.$g1591$.getDynamicValue(var40);
                        if (var47.eql((SubLObject)module0248.$ic7$)) {
                            module0136.f8870((SubLObject)module0248.ONE_INTEGER, (SubLObject)module0248.$ic8$, var46, (SubLObject)module0248.$ic9$, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED);
                        }
                        else if (var47.eql((SubLObject)module0248.$ic10$)) {
                            module0136.f8871((SubLObject)module0248.ONE_INTEGER, (SubLObject)module0248.$ic11$, (SubLObject)module0248.$ic8$, var46, (SubLObject)module0248.$ic9$, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED);
                        }
                        else if (var47.eql((SubLObject)module0248.$ic12$)) {
                            Errors.warn((SubLObject)module0248.$ic8$, var46, (SubLObject)module0248.$ic9$);
                        }
                        else {
                            Errors.warn((SubLObject)module0248.$ic13$, module0136.$g1591$.getDynamicValue(var40));
                            Errors.cerror((SubLObject)module0248.$ic11$, (SubLObject)module0248.$ic8$, var46, (SubLObject)module0248.$ic9$);
                        }
                    }
                    if (module0248.NIL != var39) {
                        var41 = f15928(var1, var2);
                    }
                    else {
                        final SubLObject var17_47 = module0228.f15229(var1);
                        if (module0248.NIL != module0138.f8992(var17_47)) {
                            final SubLObject var48 = module0242.f15664(var17_47, var38);
                            if (module0248.NIL != var48) {
                                final SubLObject var49 = module0245.f15834(var48, var2, var38);
                                if (module0248.NIL != var49) {
                                    SubLObject var50;
                                    for (var50 = module0066.f4838(module0067.f4891(var49)); module0248.NIL == module0066.f4841(var50); var50 = module0066.f4840(var50)) {
                                        var40.resetMultipleValues();
                                        final SubLObject var22_48 = module0066.f4839(var50);
                                        final SubLObject var51 = var40.secondMultipleValue();
                                        var40.resetMultipleValues();
                                        if (module0248.NIL != module0147.f9507(var22_48)) {
                                            final SubLObject var15_43 = module0138.$g1623$.currentBinding(var40);
                                            try {
                                                module0138.$g1623$.bind(var22_48, var40);
                                                SubLObject var21_50;
                                                for (var21_50 = module0066.f4838(module0067.f4891(var51)); module0248.NIL == module0066.f4841(var21_50); var21_50 = module0066.f4840(var21_50)) {
                                                    var40.resetMultipleValues();
                                                    final SubLObject var26_51 = module0066.f4839(var21_50);
                                                    final SubLObject var52 = var40.secondMultipleValue();
                                                    var40.resetMultipleValues();
                                                    if (module0248.NIL != module0141.f9289(var26_51)) {
                                                        final SubLObject var15_44 = module0138.$g1624$.currentBinding(var40);
                                                        try {
                                                            module0138.$g1624$.bind(var26_51, var40);
                                                            var41 = ConsesLow.nconc(var52.isList() ? conses_high.copy_list(var52) : module0077.f5312(var52), var41);
                                                        }
                                                        finally {
                                                            module0138.$g1624$.rebind(var15_44, var40);
                                                        }
                                                    }
                                                }
                                                module0066.f4842(var21_50);
                                            }
                                            finally {
                                                module0138.$g1623$.rebind(var15_43, var40);
                                            }
                                        }
                                    }
                                    module0066.f4842(var50);
                                }
                            }
                            else {
                                module0136.f8870((SubLObject)module0248.FIVE_INTEGER, (SubLObject)module0248.$ic4$, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED);
                            }
                        }
                        else if (module0248.NIL != module0155.f9785(var17_47, (SubLObject)module0248.UNPROVIDED)) {
                            SubLObject var54;
                            final SubLObject var53 = var54 = ((module0248.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(var2, module0141.$g1714$.getDynamicValue(var40), var38)) : module0244.f15760(var2, module0141.$g1714$.getDynamicValue(var40), var38));
                            SubLObject var55 = (SubLObject)module0248.NIL;
                            var55 = var54.first();
                            while (module0248.NIL != var54) {
                                final SubLObject var15_45 = module0138.$g1625$.currentBinding(var40);
                                try {
                                    module0138.$g1625$.bind(var55, var40);
                                    final SubLObject var56 = Functions.funcall(var55, var17_47);
                                    var41 = ConsesLow.nconc(var56.isList() ? conses_high.copy_list(var56) : module0077.f5312(var56), var41);
                                }
                                finally {
                                    module0138.$g1625$.rebind(var15_45, var40);
                                }
                                var54 = var54.rest();
                                var55 = var54.first();
                            }
                        }
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var16_45, var40);
                    module0141.$g1714$.rebind(var15_42, var40);
                }
            }
            finally {
                module0147.$g2096$.rebind(var45, var40);
                module0147.$g2094$.rebind(var44, var40);
                module0147.$g2095$.rebind(var15_41, var40);
            }
        }
        finally {
            module0137.$g1605$.rebind(var42, var40);
        }
        return module0035.f2269(var41, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED);
    }
    
    public static SubLObject f15930(final SubLObject var38, final SubLObject var1, final SubLObject var2, SubLObject var5, SubLObject var6) {
        if (var5 == module0248.UNPROVIDED) {
            var5 = (SubLObject)module0248.NIL;
        }
        if (var6 == module0248.UNPROVIDED) {
            var6 = (SubLObject)module0248.NIL;
        }
        final SubLThread var39 = SubLProcess.currentSubLThread();
        assert module0248.NIL != module0137.f8885(var38) : var38;
        SubLObject var40 = (SubLObject)module0248.NIL;
        final SubLObject var41 = module0137.$g1605$.currentBinding(var39);
        try {
            module0137.$g1605$.bind(var38, var39);
            final SubLObject var42 = var5;
            final SubLObject var15_56 = module0147.$g2095$.currentBinding(var39);
            final SubLObject var43 = module0147.$g2094$.currentBinding(var39);
            final SubLObject var44 = module0147.$g2096$.currentBinding(var39);
            try {
                module0147.$g2095$.bind(module0147.f9545(var42), var39);
                module0147.$g2094$.bind(module0147.f9546(var42), var39);
                module0147.$g2096$.bind(module0147.f9549(var42), var39);
                final SubLObject var45 = var6;
                final SubLObject var15_57 = module0141.$g1714$.currentBinding(var39);
                final SubLObject var16_58 = module0141.$g1715$.currentBinding(var39);
                try {
                    module0141.$g1714$.bind((module0248.NIL != var45) ? var45 : module0141.$g1714$.getDynamicValue(var39), var39);
                    module0141.$g1715$.bind((SubLObject)((module0248.NIL != var45) ? module0248.$ic6$ : module0141.$g1715$.getDynamicValue(var39)), var39);
                    if (module0248.NIL != var45 && module0248.NIL != module0136.f8864() && module0248.NIL == module0141.f9282(var45)) {
                        final SubLObject var46 = module0136.$g1591$.getDynamicValue(var39);
                        if (var46.eql((SubLObject)module0248.$ic7$)) {
                            module0136.f8870((SubLObject)module0248.ONE_INTEGER, (SubLObject)module0248.$ic8$, var45, (SubLObject)module0248.$ic9$, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED);
                        }
                        else if (var46.eql((SubLObject)module0248.$ic10$)) {
                            module0136.f8871((SubLObject)module0248.ONE_INTEGER, (SubLObject)module0248.$ic11$, (SubLObject)module0248.$ic8$, var45, (SubLObject)module0248.$ic9$, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED);
                        }
                        else if (var46.eql((SubLObject)module0248.$ic12$)) {
                            Errors.warn((SubLObject)module0248.$ic8$, var45, (SubLObject)module0248.$ic9$);
                        }
                        else {
                            Errors.warn((SubLObject)module0248.$ic13$, module0136.$g1591$.getDynamicValue(var39));
                            Errors.cerror((SubLObject)module0248.$ic11$, (SubLObject)module0248.$ic8$, var45, (SubLObject)module0248.$ic9$);
                        }
                    }
                    final SubLObject var17_59 = module0228.f15229(var1);
                    if (module0248.NIL != module0138.f8992(var17_59)) {
                        final SubLObject var47 = module0242.f15664(var17_59, var38);
                        if (module0248.NIL != var47) {
                            final SubLObject var48 = module0245.f15834(var47, var2, var38);
                            if (module0248.NIL != var48) {
                                SubLObject var49;
                                for (var49 = module0066.f4838(module0067.f4891(var48)); module0248.NIL == module0066.f4841(var49); var49 = module0066.f4840(var49)) {
                                    var39.resetMultipleValues();
                                    final SubLObject var22_60 = module0066.f4839(var49);
                                    final SubLObject var50 = var39.secondMultipleValue();
                                    var39.resetMultipleValues();
                                    if (module0248.NIL != module0147.f9507(var22_60)) {
                                        final SubLObject var15_58 = module0138.$g1623$.currentBinding(var39);
                                        try {
                                            module0138.$g1623$.bind(var22_60, var39);
                                            SubLObject var21_62;
                                            for (var21_62 = module0066.f4838(module0067.f4891(var50)); module0248.NIL == module0066.f4841(var21_62); var21_62 = module0066.f4840(var21_62)) {
                                                var39.resetMultipleValues();
                                                final SubLObject var26_63 = module0066.f4839(var21_62);
                                                final SubLObject var51 = var39.secondMultipleValue();
                                                var39.resetMultipleValues();
                                                if (module0248.NIL != module0141.f9289(var26_63)) {
                                                    final SubLObject var15_59 = module0138.$g1624$.currentBinding(var39);
                                                    try {
                                                        module0138.$g1624$.bind(var26_63, var39);
                                                        var40 = module0035.sublisp_boolean(var51);
                                                    }
                                                    finally {
                                                        module0138.$g1624$.rebind(var15_59, var39);
                                                    }
                                                }
                                            }
                                            module0066.f4842(var21_62);
                                        }
                                        finally {
                                            module0138.$g1623$.rebind(var15_58, var39);
                                        }
                                    }
                                }
                                module0066.f4842(var49);
                            }
                        }
                        else {
                            module0136.f8870((SubLObject)module0248.FIVE_INTEGER, (SubLObject)module0248.$ic4$, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED);
                        }
                    }
                    else if (module0248.NIL != module0155.f9785(var17_59, (SubLObject)module0248.UNPROVIDED)) {
                        SubLObject var53;
                        final SubLObject var52 = var53 = ((module0248.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(var2, module0141.$g1714$.getDynamicValue(var39), var38)) : module0244.f15760(var2, module0141.$g1714$.getDynamicValue(var39), var38));
                        SubLObject var54 = (SubLObject)module0248.NIL;
                        var54 = var53.first();
                        while (module0248.NIL != var53) {
                            final SubLObject var15_60 = module0138.$g1625$.currentBinding(var39);
                            try {
                                module0138.$g1625$.bind(var54, var39);
                                final SubLObject var55 = Functions.funcall(var54, var17_59);
                                var40 = module0035.sublisp_boolean(var55);
                            }
                            finally {
                                module0138.$g1625$.rebind(var15_60, var39);
                            }
                            var53 = var53.rest();
                            var54 = var53.first();
                        }
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var16_58, var39);
                    module0141.$g1714$.rebind(var15_57, var39);
                }
            }
            finally {
                module0147.$g2096$.rebind(var44, var39);
                module0147.$g2094$.rebind(var43, var39);
                module0147.$g2095$.rebind(var15_56, var39);
            }
        }
        finally {
            module0137.$g1605$.rebind(var41, var39);
        }
        return var40;
    }
    
    public static SubLObject f15931(final SubLObject var38, final SubLObject var1, SubLObject var5, SubLObject var6, SubLObject var39) {
        if (var5 == module0248.UNPROVIDED) {
            var5 = (SubLObject)module0248.NIL;
        }
        if (var6 == module0248.UNPROVIDED) {
            var6 = (SubLObject)module0248.NIL;
        }
        if (var39 == module0248.UNPROVIDED) {
            var39 = (SubLObject)module0248.NIL;
        }
        assert module0248.NIL != module0137.f8885(var38) : var38;
        final SubLObject var40 = module0244.f15778(var38);
        if (module0248.NIL != module0141.f9279(var6)) {
            return f15929(var38, var1, var40, var5, var6, var39);
        }
        if (module0248.NIL == var6) {
            return f15929(var38, var1, var40, var5, module0248.$ic14$, var39);
        }
        module0136.f8870((SubLObject)module0248.ONE_INTEGER, (SubLObject)module0248.$ic15$, var6, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED);
        module0136.f8870((SubLObject)module0248.ONE_INTEGER, (SubLObject)module0248.$ic16$, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED);
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f15932(final SubLObject var38, final SubLObject var1, SubLObject var5, SubLObject var6, SubLObject var39) {
        if (var5 == module0248.UNPROVIDED) {
            var5 = (SubLObject)module0248.NIL;
        }
        if (var6 == module0248.UNPROVIDED) {
            var6 = (SubLObject)module0248.NIL;
        }
        if (var39 == module0248.UNPROVIDED) {
            var39 = (SubLObject)module0248.NIL;
        }
        assert module0248.NIL != module0137.f8885(var38) : var38;
        final SubLObject var40 = module0244.f15778(var38);
        if (module0248.NIL != module0141.f9281(var6)) {
            return f15929(var38, var1, var40, var5, var6, var39);
        }
        if (module0248.NIL == var6) {
            return f15929(var38, var1, var40, var5, module0248.$ic17$, var39);
        }
        module0136.f8870((SubLObject)module0248.ONE_INTEGER, (SubLObject)module0248.$ic18$, var6, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED);
        module0136.f8870((SubLObject)module0248.ONE_INTEGER, (SubLObject)module0248.$ic16$, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED);
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f15933(final SubLObject var38, final SubLObject var1, SubLObject var5, SubLObject var6, SubLObject var39) {
        if (var5 == module0248.UNPROVIDED) {
            var5 = (SubLObject)module0248.NIL;
        }
        if (var6 == module0248.UNPROVIDED) {
            var6 = (SubLObject)module0248.NIL;
        }
        if (var39 == module0248.UNPROVIDED) {
            var39 = (SubLObject)module0248.NIL;
        }
        assert module0248.NIL != module0137.f8885(var38) : var38;
        final SubLObject var40 = module0244.f15780(var38);
        if (module0248.NIL != module0141.f9279(var6)) {
            return f15929(var38, var1, var40, var5, var6, var39);
        }
        if (module0248.NIL == var6) {
            return f15929(var38, var1, var40, var5, module0248.$ic14$, var39);
        }
        module0136.f8870((SubLObject)module0248.ONE_INTEGER, (SubLObject)module0248.$ic15$, var6, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED);
        module0136.f8870((SubLObject)module0248.ONE_INTEGER, (SubLObject)module0248.$ic16$, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED);
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f15934(final SubLObject var38, final SubLObject var1, SubLObject var5, SubLObject var6) {
        if (var5 == module0248.UNPROVIDED) {
            var5 = (SubLObject)module0248.NIL;
        }
        if (var6 == module0248.UNPROVIDED) {
            var6 = (SubLObject)module0248.NIL;
        }
        assert module0248.NIL != module0137.f8885(var38) : var38;
        final SubLObject var39 = module0244.f15780(var38);
        if (module0248.NIL != module0141.f9279(var6)) {
            return f15930(var38, var1, var39, var5, var6);
        }
        if (module0248.NIL == var6) {
            return f15930(var38, var1, var39, var5, module0248.$ic14$);
        }
        module0136.f8870((SubLObject)module0248.ONE_INTEGER, (SubLObject)module0248.$ic15$, var6, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED);
        module0136.f8870((SubLObject)module0248.ONE_INTEGER, (SubLObject)module0248.$ic16$, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED);
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f15935(final SubLObject var38, final SubLObject var1, SubLObject var5, SubLObject var6, SubLObject var39) {
        if (var5 == module0248.UNPROVIDED) {
            var5 = (SubLObject)module0248.NIL;
        }
        if (var6 == module0248.UNPROVIDED) {
            var6 = (SubLObject)module0248.NIL;
        }
        if (var39 == module0248.UNPROVIDED) {
            var39 = (SubLObject)module0248.NIL;
        }
        assert module0248.NIL != module0137.f8885(var38) : var38;
        final SubLObject var40 = module0244.f15780(var38);
        if (module0248.NIL != module0141.f9281(var6)) {
            return f15929(var38, var1, var40, var5, var6, var39);
        }
        if (module0248.NIL == var6) {
            return f15929(var38, var1, var40, var5, module0248.$ic17$, var39);
        }
        module0136.f8870((SubLObject)module0248.ONE_INTEGER, (SubLObject)module0248.$ic18$, var6, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED);
        module0136.f8870((SubLObject)module0248.ONE_INTEGER, (SubLObject)module0248.$ic16$, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED);
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f15936(final SubLObject var38, final SubLObject var1, final SubLObject var5) {
        final SubLThread var39 = SubLProcess.currentSubLThread();
        assert module0248.NIL != module0137.f8885(var38) : var38;
        SubLObject var40 = (SubLObject)module0248.NIL;
        final SubLObject var41 = module0137.$g1605$.currentBinding(var39);
        try {
            module0137.$g1605$.bind(var38, var39);
            final SubLObject var42 = module0242.f15664(var1, var38);
            if (module0248.NIL != var42) {
                SubLObject var43 = module0244.f15784(var38);
                SubLObject var44 = (SubLObject)module0248.NIL;
                var44 = var43.first();
                while (module0248.NIL != var43) {
                    final SubLObject var45 = module0245.f15834(var42, var44, var38);
                    if (module0248.NIL != var45 && module0248.NIL != module0138.f8972(var44)) {
                        final SubLObject var46 = module0245.f15844(var45, var5);
                        if (module0248.NIL != var46) {
                            SubLObject var47;
                            for (var47 = module0066.f4838(module0067.f4891(var46)); module0248.NIL == module0066.f4841(var47); var47 = module0066.f4840(var47)) {
                                var39.resetMultipleValues();
                                final SubLObject var48 = module0066.f4839(var47);
                                final SubLObject var49 = var39.secondMultipleValue();
                                var39.resetMultipleValues();
                                if (module0248.NIL != module0141.f9279(var48)) {
                                    final SubLObject var50 = var49;
                                    if (module0248.NIL != module0077.f5302(var50)) {
                                        final SubLObject var51 = module0077.f5333(var50);
                                        SubLObject var52;
                                        SubLObject var53;
                                        SubLObject var54;
                                        for (var52 = module0032.f1741(var51), var53 = (SubLObject)module0248.NIL, var53 = module0032.f1742(var52, var51); module0248.NIL == module0032.f1744(var52, var53); var53 = module0032.f1743(var53)) {
                                            var54 = module0032.f1745(var52, var53);
                                            if (module0248.NIL != module0032.f1746(var53, var54)) {
                                                var40 = (SubLObject)ConsesLow.cons(var54, var40);
                                            }
                                        }
                                    }
                                    else if (var50.isList()) {
                                        SubLObject var55 = var50;
                                        SubLObject var56 = (SubLObject)module0248.NIL;
                                        var56 = var55.first();
                                        while (module0248.NIL != var55) {
                                            var40 = (SubLObject)ConsesLow.cons(var56, var40);
                                            var55 = var55.rest();
                                            var56 = var55.first();
                                        }
                                    }
                                    else {
                                        Errors.error((SubLObject)module0248.$ic3$, var50);
                                    }
                                }
                            }
                            module0066.f4842(var47);
                        }
                    }
                    var43 = var43.rest();
                    var44 = var43.first();
                }
            }
        }
        finally {
            module0137.$g1605$.rebind(var41, var39);
        }
        return module0035.f2269(var40, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED);
    }
    
    public static SubLObject f15937(final SubLObject var38, final SubLObject var1, SubLObject var5, SubLObject var6) {
        if (var5 == module0248.UNPROVIDED) {
            var5 = (SubLObject)module0248.NIL;
        }
        if (var6 == module0248.UNPROVIDED) {
            var6 = (SubLObject)module0248.NIL;
        }
        assert module0248.NIL != module0137.f8885(var38) : var38;
        final SubLObject var39 = f15933(var38, var1, var5, var6, (SubLObject)module0248.UNPROVIDED);
        SubLObject var40 = (SubLObject)module0248.NIL;
        final SubLObject var41 = var39;
        if (module0248.NIL != module0077.f5302(var41)) {
            final SubLObject var42 = module0077.f5333(var41);
            SubLObject var43;
            SubLObject var44;
            SubLObject var45;
            for (var43 = module0032.f1741(var42), var44 = (SubLObject)module0248.NIL, var44 = module0032.f1742(var43, var42); module0248.NIL == module0032.f1744(var43, var44); var44 = module0032.f1743(var44)) {
                var45 = module0032.f1745(var43, var44);
                if (module0248.NIL != module0032.f1746(var44, var45)) {
                    var40 = ConsesLow.nconc(f15931(var38, var45, var5, var6, (SubLObject)module0248.UNPROVIDED), var40);
                }
            }
        }
        else if (var41.isList()) {
            SubLObject var46 = var41;
            SubLObject var47 = (SubLObject)module0248.NIL;
            var47 = var46.first();
            while (module0248.NIL != var46) {
                var40 = ConsesLow.nconc(f15931(var38, var47, var5, var6, (SubLObject)module0248.UNPROVIDED), var40);
                var46 = var46.rest();
                var47 = var46.first();
            }
        }
        else {
            Errors.error((SubLObject)module0248.$ic3$, var41);
        }
        var40 = Sequences.remove(var1, var40, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED);
        return Sequences.remove_duplicates(var40, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED);
    }
    
    public static SubLObject f15938(final SubLObject var38, final SubLObject var1, SubLObject var5, SubLObject var6) {
        if (var5 == module0248.UNPROVIDED) {
            var5 = (SubLObject)module0248.NIL;
        }
        if (var6 == module0248.UNPROVIDED) {
            var6 = (SubLObject)module0248.NIL;
        }
        assert module0248.NIL != module0137.f8885(var38) : var38;
        final SubLObject var39 = f15931(var38, var1, var5, var6, (SubLObject)module0248.UNPROVIDED);
        SubLObject var40 = (SubLObject)module0248.NIL;
        final SubLObject var41 = var39;
        if (module0248.NIL != module0077.f5302(var41)) {
            final SubLObject var42 = module0077.f5333(var41);
            SubLObject var43;
            SubLObject var44;
            SubLObject var45;
            for (var43 = module0032.f1741(var42), var44 = (SubLObject)module0248.NIL, var44 = module0032.f1742(var43, var42); module0248.NIL == module0032.f1744(var43, var44); var44 = module0032.f1743(var44)) {
                var45 = module0032.f1745(var43, var44);
                if (module0248.NIL != module0032.f1746(var44, var45)) {
                    var40 = ConsesLow.nconc(f15933(var38, var45, var5, var6, (SubLObject)module0248.UNPROVIDED), var40);
                }
            }
        }
        else if (var41.isList()) {
            SubLObject var46 = var41;
            SubLObject var47 = (SubLObject)module0248.NIL;
            var47 = var46.first();
            while (module0248.NIL != var46) {
                var40 = ConsesLow.nconc(f15933(var38, var47, var5, var6, (SubLObject)module0248.UNPROVIDED), var40);
                var46 = var46.rest();
                var47 = var46.first();
            }
        }
        else {
            Errors.error((SubLObject)module0248.$ic3$, var41);
        }
        var40 = Sequences.remove(var1, var40, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED);
        return Sequences.remove_duplicates(var40, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED);
    }
    
    public static SubLObject f15939(final SubLObject var2, final SubLObject var5, final SubLObject var6, final SubLObject var1, SubLObject var38) {
        if (var38 == module0248.UNPROVIDED) {
            var38 = (SubLObject)module0248.NIL;
        }
        if (module0248.NIL != var38 && !module0248.areAssertionsDisabledFor(me) && module0248.NIL == module0137.f8885(var38)) {
            throw new AssertionError(var38);
        }
        SubLObject var39 = (SubLObject)module0248.NIL;
        var39 = module0245.f15828(var2, module0245.f15838(var5, module0245.f15849(var6, var1)), var38);
        return var39;
    }
    
    public static SubLObject f15940(final SubLObject var71, final SubLObject var72, final SubLObject var2, final SubLObject var5, final SubLObject var6, final SubLObject var38) {
        if (module0248.NIL != var38 && !module0248.areAssertionsDisabledFor(me) && module0248.NIL == module0137.f8885(var38)) {
            throw new AssertionError(var38);
        }
        module0242.f15665(var71, f15939(var2, var5, var6, var72, var38), var38);
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f15941(final SubLObject var73, final SubLObject var5, final SubLObject var2, final SubLObject var6, final SubLObject var1) {
        final SubLObject var74 = module0245.f15834(var73, var2, module0137.f8955((SubLObject)module0248.UNPROVIDED));
        if (module0248.NIL != var74) {
            final SubLObject var75 = module0245.f15844(var74, var5);
            if (module0248.NIL != var75) {
                module0245.f15850(var75, var6, var1);
            }
            else {
                module0245.f15845(var74, var5, module0245.f15849(var6, var1));
            }
        }
        else {
            module0245.f15836(var73, var2, module0245.f15838(var5, module0245.f15849(var6, var1)), module0137.f8955((SubLObject)module0248.UNPROVIDED));
        }
        return var73;
    }
    
    public static SubLObject f15942(final SubLObject var71, final SubLObject var72, final SubLObject var5, final SubLObject var6) {
        if (module0248.NIL != module0138.f8992(var71) && module0248.NIL != module0138.f8992(var72)) {
            if (var6 != module0248.$ic19$) {
                final SubLObject var73 = module0137.f8955((SubLObject)module0248.UNPROVIDED);
                if (module0248.NIL == module0244.f15772(var73) || !var71.equal(var72)) {
                    final SubLObject var74 = module0244.f15744(var73);
                    final SubLObject var75 = var74.eql((SubLObject)module0248.ONE_INTEGER) ? var71 : var72;
                    final SubLObject var76 = var74.eql((SubLObject)module0248.ONE_INTEGER) ? var72 : var71;
                    final SubLObject var77 = module0244.f15778(var73);
                    final SubLObject var78 = module0244.f15780(var73);
                    final SubLObject var79 = module0242.f15664(var75, var73);
                    final SubLObject var80 = module0138.$g1626$.getGlobalValue();
                    SubLObject var81 = (SubLObject)module0248.NIL;
                    try {
                        var81 = ReadWriteLocks.rw_lock_seize_write_lock(var80);
                        if (module0248.NIL != var79) {
                            final SubLObject var82 = f15921(var75, var5, var6);
                            if (module0248.NIL == module0077.f5322(var76, var82)) {
                                f15941(var79, var5, var77, var6, var76);
                                module0242.f15666(var75, var79, var73);
                            }
                        }
                        else {
                            f15940(var75, var76, var77, var5, var6, var73);
                        }
                        final SubLObject var83 = module0242.f15664(var76, var73);
                        if (module0248.NIL != var83) {
                            final SubLObject var84 = f15922(var76, var5, var6);
                            if (module0248.NIL == module0077.f5322(var75, var84)) {
                                f15941(var83, var5, var78, var6, var75);
                                module0242.f15666(var76, var83, var73);
                            }
                        }
                        else {
                            f15940(var76, var75, var78, var5, var6, var73);
                        }
                    }
                    finally {
                        if (module0248.NIL != var81) {
                            ReadWriteLocks.rw_lock_release_write_lock(var80);
                        }
                    }
                }
            }
        }
        else if (module0248.NIL != f15943(var71, var72)) {
            final SubLObject var85 = module0138.$g1626$.getGlobalValue();
            SubLObject var86 = (SubLObject)module0248.NIL;
            try {
                var86 = ReadWriteLocks.rw_lock_seize_write_lock(var85);
                f15944(var71, var72, var5, var6);
            }
            finally {
                if (module0248.NIL != var86) {
                    ReadWriteLocks.rw_lock_release_write_lock(var85);
                }
            }
        }
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f15945() {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        f15946();
        final SubLObject var11 = module0174.f11010();
        final SubLObject var12 = (SubLObject)module0248.$ic20$;
        final SubLObject var13 = module0065.f4733(var11);
        SubLObject var14 = (SubLObject)module0248.ZERO_INTEGER;
        assert module0248.NIL != Types.stringp(var12) : var12;
        final SubLObject var15 = module0012.$g75$.currentBinding(var10);
        final SubLObject var16 = module0012.$g76$.currentBinding(var10);
        final SubLObject var17 = module0012.$g77$.currentBinding(var10);
        final SubLObject var18 = module0012.$g78$.currentBinding(var10);
        try {
            module0012.$g75$.bind((SubLObject)module0248.ZERO_INTEGER, var10);
            module0012.$g76$.bind((SubLObject)module0248.NIL, var10);
            module0012.$g77$.bind((SubLObject)module0248.T, var10);
            module0012.$g78$.bind(Time.get_universal_time(), var10);
            module0012.f478(var12);
            final SubLObject var90_91 = var11;
            if (module0248.NIL == module0065.f4772(var90_91, (SubLObject)module0248.$ic22$)) {
                final SubLObject var92_93 = var90_91;
                if (module0248.NIL == module0065.f4775(var92_93, (SubLObject)module0248.$ic22$)) {
                    final SubLObject var19 = module0065.f4740(var92_93);
                    final SubLObject var20 = (SubLObject)module0248.NIL;
                    SubLObject var21;
                    SubLObject var22;
                    SubLObject var23;
                    SubLObject var24;
                    SubLObject var25;
                    SubLObject var15_101;
                    SubLObject var26;
                    SubLObject var27;
                    SubLObject var28;
                    SubLObject var29;
                    for (var21 = Sequences.length(var19), var22 = (SubLObject)module0248.NIL, var22 = (SubLObject)module0248.ZERO_INTEGER; var22.numL(var21); var22 = Numbers.add(var22, (SubLObject)module0248.ONE_INTEGER)) {
                        var23 = ((module0248.NIL != var20) ? Numbers.subtract(var21, var22, (SubLObject)module0248.ONE_INTEGER) : var22);
                        var24 = Vectors.aref(var19, var23);
                        if (module0248.NIL == module0065.f4749(var24) || module0248.NIL == module0065.f4773((SubLObject)module0248.$ic22$)) {
                            if (module0248.NIL != module0065.f4749(var24)) {
                                var24 = (SubLObject)module0248.$ic22$;
                            }
                            module0012.note_percent_progress(var14, var13);
                            var14 = Numbers.add(var14, (SubLObject)module0248.ONE_INTEGER);
                            if (module0248.NIL != module0178.f11284(var24)) {
                                var25 = module0178.f11331(var24, (SubLObject)module0248.ZERO_INTEGER);
                                if (module0248.NIL != module0244.f15734(var25)) {
                                    var15_101 = module0137.$g1605$.currentBinding(var10);
                                    try {
                                        module0137.$g1605$.bind(module0137.f8955(var25), var10);
                                        var26 = f15947(var24);
                                        var27 = module0178.f11287(var24);
                                        var28 = module0178.f11331(var24, (SubLObject)module0248.ONE_INTEGER);
                                        var29 = module0178.f11331(var24, (SubLObject)module0248.TWO_INTEGER);
                                        f15942(var28, var29, var27, var26);
                                    }
                                    finally {
                                        module0137.$g1605$.rebind(var15_101, var10);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject var103_104 = var90_91;
                if (module0248.NIL == module0065.f4777(var103_104) || module0248.NIL == module0065.f4773((SubLObject)module0248.$ic22$)) {
                    final SubLObject var30 = module0065.f4738(var103_104);
                    SubLObject var31 = module0065.f4739(var103_104);
                    final SubLObject var32 = module0065.f4734(var103_104);
                    final SubLObject var33 = (SubLObject)((module0248.NIL != module0065.f4773((SubLObject)module0248.$ic22$)) ? module0248.NIL : module0248.$ic22$);
                    while (var31.numL(var32)) {
                        final SubLObject var34 = Hashtables.gethash_without_values(var31, var30, var33);
                        if (module0248.NIL == module0065.f4773((SubLObject)module0248.$ic22$) || module0248.NIL == module0065.f4749(var34)) {
                            module0012.note_percent_progress(var14, var13);
                            var14 = Numbers.add(var14, (SubLObject)module0248.ONE_INTEGER);
                            if (module0248.NIL != module0178.f11284(var34)) {
                                final SubLObject var35 = module0178.f11331(var34, (SubLObject)module0248.ZERO_INTEGER);
                                if (module0248.NIL != module0244.f15734(var35)) {
                                    final SubLObject var15_102 = module0137.$g1605$.currentBinding(var10);
                                    try {
                                        module0137.$g1605$.bind(module0137.f8955(var35), var10);
                                        final SubLObject var36 = f15947(var34);
                                        final SubLObject var37 = module0178.f11287(var34);
                                        final SubLObject var38 = module0178.f11331(var34, (SubLObject)module0248.ONE_INTEGER);
                                        final SubLObject var39 = module0178.f11331(var34, (SubLObject)module0248.TWO_INTEGER);
                                        f15942(var38, var39, var37, var36);
                                    }
                                    finally {
                                        module0137.$g1605$.rebind(var15_102, var10);
                                    }
                                }
                            }
                        }
                        var31 = Numbers.add(var31, (SubLObject)module0248.ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var18, var10);
            module0012.$g77$.rebind(var17, var10);
            module0012.$g76$.rebind(var16, var10);
            module0012.$g75$.rebind(var15, var10);
        }
        module0242.f15644();
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f15948(final SubLObject var38) {
        final SubLThread var39 = SubLProcess.currentSubLThread();
        assert module0248.NIL != module0137.f8885(var38) : var38;
        module0244.f15725(var38);
        final SubLObject var40 = module0137.f8917(var38);
        final SubLObject var41 = module0147.$g2094$.currentBinding(var39);
        final SubLObject var42 = module0147.$g2095$.currentBinding(var39);
        final SubLObject var43 = module0137.$g1605$.currentBinding(var39);
        try {
            module0147.$g2094$.bind((SubLObject)module0248.$ic23$, var39);
            module0147.$g2095$.bind(module0248.$ic24$, var39);
            module0137.$g1605$.bind(var38, var39);
            final SubLObject var44 = var40;
            if (module0248.NIL != module0158.f10038(var44)) {
                final SubLObject var45 = Sequences.cconcatenate((SubLObject)module0248.$ic25$, new SubLObject[] { module0006.f203(var40), module0248.$ic26$ });
                final SubLObject var15_111 = module0012.$g73$.currentBinding(var39);
                final SubLObject var16_112 = module0012.$g65$.currentBinding(var39);
                final SubLObject var42_113 = module0012.$g67$.currentBinding(var39);
                final SubLObject var46 = module0012.$g68$.currentBinding(var39);
                final SubLObject var47 = module0012.$g66$.currentBinding(var39);
                final SubLObject var48 = module0012.$g69$.currentBinding(var39);
                final SubLObject var49 = module0012.$g70$.currentBinding(var39);
                final SubLObject var50 = module0012.$silent_progressP$.currentBinding(var39);
                try {
                    module0012.$g73$.bind(Time.get_universal_time(), var39);
                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var39), var39);
                    module0012.$g67$.bind((SubLObject)module0248.ONE_INTEGER, var39);
                    module0012.$g68$.bind((SubLObject)module0248.ZERO_INTEGER, var39);
                    module0012.$g66$.bind((SubLObject)module0248.ZERO_INTEGER, var39);
                    module0012.$g69$.bind((SubLObject)module0248.ZERO_INTEGER, var39);
                    module0012.$g70$.bind((SubLObject)module0248.T, var39);
                    module0012.$silent_progressP$.bind((SubLObject)((module0248.NIL != var45) ? module0012.$silent_progressP$.getDynamicValue(var39) : module0248.T), var39);
                    module0012.f474(var45);
                    final SubLObject var51 = module0158.f10039(var44);
                    SubLObject var52 = (SubLObject)module0248.NIL;
                    final SubLObject var53 = (SubLObject)module0248.NIL;
                    while (module0248.NIL == var52) {
                        final SubLObject var54 = module0052.f3695(var51, var53);
                        final SubLObject var55 = (SubLObject)SubLObjectFactory.makeBoolean(!var53.eql(var54));
                        if (module0248.NIL != var55) {
                            module0012.f476();
                            SubLObject var56 = (SubLObject)module0248.NIL;
                            try {
                                var56 = module0158.f10316(var54, (SubLObject)module0248.$ic27$, (SubLObject)module0248.NIL, (SubLObject)module0248.NIL);
                                SubLObject var119_124 = (SubLObject)module0248.NIL;
                                final SubLObject var120_125 = (SubLObject)module0248.NIL;
                                while (module0248.NIL == var119_124) {
                                    final SubLObject var57 = module0052.f3695(var56, var120_125);
                                    final SubLObject var122_126 = (SubLObject)SubLObjectFactory.makeBoolean(!var120_125.eql(var57));
                                    if (module0248.NIL != var122_126) {
                                        final SubLObject var58 = f15947(var57);
                                        final SubLObject var59 = module0178.f11287(var57);
                                        final SubLObject var60 = module0178.f11331(var57, (SubLObject)module0248.ONE_INTEGER);
                                        final SubLObject var61 = module0178.f11331(var57, (SubLObject)module0248.TWO_INTEGER);
                                        f15942(var60, var61, var59, var58);
                                    }
                                    var119_124 = (SubLObject)SubLObjectFactory.makeBoolean(module0248.NIL == var122_126);
                                }
                            }
                            finally {
                                final SubLObject var15_112 = Threads.$is_thread_performing_cleanupP$.currentBinding(var39);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0248.T, var39);
                                    if (module0248.NIL != var56) {
                                        module0158.f10319(var56);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var15_112, var39);
                                }
                            }
                        }
                        var52 = (SubLObject)SubLObjectFactory.makeBoolean(module0248.NIL == var55);
                    }
                    module0012.f475();
                }
                finally {
                    module0012.$silent_progressP$.rebind(var50, var39);
                    module0012.$g70$.rebind(var49, var39);
                    module0012.$g69$.rebind(var48, var39);
                    module0012.$g66$.rebind(var47, var39);
                    module0012.$g68$.rebind(var46, var39);
                    module0012.$g67$.rebind(var42_113, var39);
                    module0012.$g65$.rebind(var16_112, var39);
                    module0012.$g73$.rebind(var15_111, var39);
                }
            }
        }
        finally {
            module0137.$g1605$.rebind(var43, var39);
            module0147.$g2095$.rebind(var42, var39);
            module0147.$g2094$.rebind(var41, var39);
        }
        module0242.f15644();
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f15947(final SubLObject var99) {
        final SubLObject var100 = module0178.f11292(var99);
        final SubLObject var101 = module0178.f11293(var99);
        return module0138.f8988(var100, var101);
    }
    
    public static SubLObject f15949() {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        f15950();
        module0327.f22101((SubLObject)module0248.$ic28$, (SubLObject)module0248.$ic29$, module0324.f21943(module0248.$ic30$), module0324.f21943(module0612.$g2464$.getGlobalValue()), module0327.$g2465$.getGlobalValue());
        module0327.f22101((SubLObject)module0248.$ic28$, (SubLObject)module0248.$ic29$, module0324.f21944(module0248.$ic30$), module0324.f21944(module0612.$g2466$.getGlobalValue()), module0327.$g2465$.getGlobalValue());
        module0327.f22101((SubLObject)module0248.$ic28$, (SubLObject)module0248.$ic31$, module0324.f21943(module0248.$ic30$), module0324.f21944(module0248.$ic30$), module0327.$g2465$.getGlobalValue());
        final SubLObject var11 = module0018.$g673$.currentBinding(var10);
        try {
            module0018.$g673$.bind((SubLObject)module0248.T, var10);
            final SubLObject var12 = module0174.f11010();
            final SubLObject var13 = (SubLObject)module0248.$ic32$;
            final SubLObject var14 = module0065.f4733(var12);
            SubLObject var15 = (SubLObject)module0248.ZERO_INTEGER;
            assert module0248.NIL != Types.stringp(var13) : var13;
            final SubLObject var15_130 = module0012.$g75$.currentBinding(var10);
            final SubLObject var16 = module0012.$g76$.currentBinding(var10);
            final SubLObject var17 = module0012.$g77$.currentBinding(var10);
            final SubLObject var18 = module0012.$g78$.currentBinding(var10);
            try {
                module0012.$g75$.bind((SubLObject)module0248.ZERO_INTEGER, var10);
                module0012.$g76$.bind((SubLObject)module0248.NIL, var10);
                module0012.$g77$.bind((SubLObject)module0248.T, var10);
                module0012.$g78$.bind(Time.get_universal_time(), var10);
                module0012.f478(var13);
                final SubLObject var90_131 = var12;
                if (module0248.NIL == module0065.f4772(var90_131, (SubLObject)module0248.$ic22$)) {
                    final SubLObject var92_132 = var90_131;
                    if (module0248.NIL == module0065.f4775(var92_132, (SubLObject)module0248.$ic22$)) {
                        final SubLObject var19 = module0065.f4740(var92_132);
                        final SubLObject var20 = (SubLObject)module0248.NIL;
                        SubLObject var21;
                        SubLObject var22;
                        SubLObject var23;
                        SubLObject var24;
                        SubLObject var25;
                        for (var21 = Sequences.length(var19), var22 = (SubLObject)module0248.NIL, var22 = (SubLObject)module0248.ZERO_INTEGER; var22.numL(var21); var22 = Numbers.add(var22, (SubLObject)module0248.ONE_INTEGER)) {
                            var23 = ((module0248.NIL != var20) ? Numbers.subtract(var21, var22, (SubLObject)module0248.ONE_INTEGER) : var22);
                            var24 = Vectors.aref(var19, var23);
                            if (module0248.NIL == module0065.f4749(var24) || module0248.NIL == module0065.f4773((SubLObject)module0248.$ic22$)) {
                                if (module0248.NIL != module0065.f4749(var24)) {
                                    var24 = (SubLObject)module0248.$ic22$;
                                }
                                module0012.note_percent_progress(var15, var14);
                                var15 = Numbers.add(var15, (SubLObject)module0248.ONE_INTEGER);
                                if (module0248.NIL != module0178.f11284(var24)) {
                                    var25 = module0178.f11332(var24);
                                    if (module0248.NIL != module0324.f21954(var25)) {
                                        module0327.f22093((SubLObject)module0248.NIL, var24, (SubLObject)module0248.NIL);
                                    }
                                }
                            }
                        }
                    }
                    final SubLObject var103_133 = var90_131;
                    if (module0248.NIL == module0065.f4777(var103_133) || module0248.NIL == module0065.f4773((SubLObject)module0248.$ic22$)) {
                        final SubLObject var26 = module0065.f4738(var103_133);
                        SubLObject var27 = module0065.f4739(var103_133);
                        final SubLObject var28 = module0065.f4734(var103_133);
                        final SubLObject var29 = (SubLObject)((module0248.NIL != module0065.f4773((SubLObject)module0248.$ic22$)) ? module0248.NIL : module0248.$ic22$);
                        while (var27.numL(var28)) {
                            final SubLObject var30 = Hashtables.gethash_without_values(var27, var26, var29);
                            if (module0248.NIL == module0065.f4773((SubLObject)module0248.$ic22$) || module0248.NIL == module0065.f4749(var30)) {
                                module0012.note_percent_progress(var15, var14);
                                var15 = Numbers.add(var15, (SubLObject)module0248.ONE_INTEGER);
                                if (module0248.NIL != module0178.f11284(var30)) {
                                    final SubLObject var31 = module0178.f11332(var30);
                                    if (module0248.NIL != module0324.f21954(var31)) {
                                        module0327.f22093((SubLObject)module0248.NIL, var30, (SubLObject)module0248.NIL);
                                    }
                                }
                            }
                            var27 = Numbers.add(var27, (SubLObject)module0248.ONE_INTEGER);
                        }
                    }
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var18, var10);
                module0012.$g77$.rebind(var17, var10);
                module0012.$g76$.rebind(var16, var10);
                module0012.$g75$.rebind(var15_130, var10);
            }
        }
        finally {
            module0018.$g673$.rebind(var11, var10);
        }
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f15951(final SubLObject var1, SubLObject var5, SubLObject var38) {
        if (var5 == module0248.UNPROVIDED) {
            var5 = (SubLObject)module0248.NIL;
        }
        if (var38 == module0248.UNPROVIDED) {
            var38 = module0137.f8955((SubLObject)module0248.UNPROVIDED);
        }
        final SubLThread var39 = SubLProcess.currentSubLThread();
        assert module0248.NIL != module0137.f8885(var38) : var38;
        final SubLObject var40 = module0137.f8917(var38);
        final SubLObject var41 = module0219.f14509(var1, (SubLObject)module0248.ONE_INTEGER, var40, var5, (SubLObject)module0248.NIL);
        final SubLObject var42 = module0219.f14509(var1, (SubLObject)module0248.TWO_INTEGER, var40, var5, (SubLObject)module0248.NIL);
        final SubLObject var43 = ConsesLow.nconc(var41, var42);
        final SubLObject var44 = module0137.$g1605$.currentBinding(var39);
        try {
            module0137.$g1605$.bind(var38, var39);
            SubLObject var45 = var43;
            SubLObject var46 = (SubLObject)module0248.NIL;
            var46 = var45.first();
            while (module0248.NIL != var45) {
                final SubLObject var47 = f15947(var46);
                final SubLObject var5_137 = module0178.f11287(var46);
                final SubLObject var48 = module0178.f11331(var46, (SubLObject)module0248.ONE_INTEGER);
                final SubLObject var49 = module0178.f11331(var46, (SubLObject)module0248.TWO_INTEGER);
                f15942(var48, var49, var5_137, var47);
                var45 = var45.rest();
                var46 = var45.first();
            }
        }
        finally {
            module0137.$g1605$.rebind(var44, var39);
        }
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f15952(final SubLObject var38) {
        final SubLThread var39 = SubLProcess.currentSubLThread();
        assert module0248.NIL != module0137.f8885(var38) : var38;
        final SubLObject var40 = module0147.$g2094$.currentBinding(var39);
        final SubLObject var41 = module0147.$g2095$.currentBinding(var39);
        try {
            module0147.$g2094$.bind((SubLObject)module0248.$ic23$, var39);
            module0147.$g2095$.bind(module0248.$ic24$, var39);
            final SubLObject var42 = module0219.f14512(module0244.f15736(var38), (SubLObject)module0248.NIL, (SubLObject)module0248.NIL);
            final SubLObject var15_139 = module0137.$g1605$.currentBinding(var39);
            try {
                module0137.$g1605$.bind(var38, var39);
                SubLObject var43 = var42;
                SubLObject var44 = (SubLObject)module0248.NIL;
                var44 = var43.first();
                while (module0248.NIL != var43) {
                    final SubLObject var45 = f15947(var44);
                    final SubLObject var46 = module0178.f11287(var44);
                    final SubLObject var47 = module0178.f11331(var44, (SubLObject)module0248.ONE_INTEGER);
                    final SubLObject var48 = module0178.f11331(var44, (SubLObject)module0248.TWO_INTEGER);
                    f15942(var47, var48, var46, var45);
                    var43 = var43.rest();
                    var44 = var43.first();
                }
            }
            finally {
                module0137.$g1605$.rebind(var15_139, var39);
            }
        }
        finally {
            module0147.$g2095$.rebind(var41, var39);
            module0147.$g2094$.rebind(var40, var39);
        }
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f15953(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0147.$g2094$.currentBinding(var2);
        final SubLObject var4 = module0147.$g2095$.currentBinding(var2);
        try {
            module0147.$g2094$.bind((SubLObject)module0248.$ic23$, var2);
            module0147.$g2095$.bind(module0248.$ic24$, var2);
            SubLObject var5 = module0137.f8931();
            SubLObject var6 = (SubLObject)module0248.NIL;
            var6 = var5.first();
            while (module0248.NIL != var5) {
                SubLObject var8;
                final SubLObject var7 = var8 = var6;
                SubLObject var9 = (SubLObject)module0248.NIL;
                SubLObject var10 = (SubLObject)module0248.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)module0248.$ic33$);
                var9 = var8.first();
                var8 = (var10 = var8.rest());
                if (module0248.NIL == module0244.f15733(var10)) {
                    final SubLObject var38_145 = var10;
                    f15951(var1, (SubLObject)module0248.NIL, var38_145);
                }
                var5 = var5.rest();
                var6 = var5.first();
            }
        }
        finally {
            module0147.$g2095$.rebind(var4, var2);
            module0147.$g2094$.rebind(var3, var2);
        }
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f15954(final SubLObject var146) {
        if (module0248.NIL != module0077.f5302(var146)) {
            final SubLObject var147 = module0077.f5333(var146);
            SubLObject var148;
            SubLObject var149;
            SubLObject var150;
            for (var148 = module0032.f1741(var147), var149 = (SubLObject)module0248.NIL, var149 = module0032.f1742(var148, var147); module0248.NIL == module0032.f1744(var148, var149); var149 = module0032.f1743(var149)) {
                var150 = module0032.f1745(var148, var149);
                if (module0248.NIL != module0032.f1746(var149, var150)) {
                    f15953(var150);
                }
            }
        }
        else if (var146.isList()) {
            SubLObject var151 = var146;
            SubLObject var152 = (SubLObject)module0248.NIL;
            var152 = var151.first();
            while (module0248.NIL != var151) {
                f15953(var152);
                var151 = var151.rest();
                var152 = var151.first();
            }
        }
        else {
            Errors.error((SubLObject)module0248.$ic3$, var146);
        }
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f15955(final SubLObject var1) {
        f15953(var1);
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f15956(final SubLObject var71, final SubLObject var72, final SubLObject var5, final SubLObject var6) {
        final SubLThread var73 = SubLProcess.currentSubLThread();
        f15942(var71, var72, var5, var6);
        if (var6 != module0248.$ic19$ && (module0248.NIL == module0244.f15772(module0137.f8955((SubLObject)module0248.UNPROVIDED)) || !var71.equal(var72))) {
            if (module0136.$g1592$.getDynamicValue(var73).numGE((SubLObject)module0248.FIVE_INTEGER)) {
                module0136.f8869((SubLObject)module0248.FIVE_INTEGER, (SubLObject)module0248.$ic34$, module0217.f14421((SubLObject)ConsesLow.list(module0244.f15736(module0137.f8955((SubLObject)module0248.UNPROVIDED)), var71, var72), var5), var6, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED);
            }
            if (module0136.$g1593$.getDynamicValue(var73).numGE((SubLObject)module0248.FIVE_INTEGER)) {
                final SubLObject var74 = module0137.f8955((SubLObject)module0248.UNPROVIDED);
                final SubLObject var75 = module0244.f15744(var74);
                final SubLObject var76 = var75.eql((SubLObject)module0248.ONE_INTEGER) ? var71 : var72;
                final SubLObject var77 = var75.eql((SubLObject)module0248.ONE_INTEGER) ? var72 : var71;
                if (module0248.NIL == module0077.f5322(var77, f15920(var76, module0244.f15778(var74), var5, var6))) {
                    module0136.f8870((SubLObject)module0248.THREE_INTEGER, (SubLObject)module0248.$ic35$, var77, var71, var72, var5, var6);
                }
                if (module0248.NIL == module0077.f5322(var76, f15920(var77, module0244.f15780(var74), var5, var6))) {
                    module0136.f8870((SubLObject)module0248.THREE_INTEGER, (SubLObject)module0248.$ic36$, var76, var71, var72, var5, var6);
                }
            }
        }
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f15957(final SubLObject var147, final SubLObject var99, final SubLObject var38) {
        final SubLThread var148 = SubLProcess.currentSubLThread();
        assert module0248.NIL != module0137.f8885(var38) : var38;
        final SubLObject var149 = module0138.$g1628$.currentBinding(var148);
        final SubLObject var150 = module0138.$g1627$.currentBinding(var148);
        try {
            module0138.$g1628$.bind(var147, var148);
            module0138.$g1627$.bind(var99, var148);
            final SubLObject var151 = f15947(var99);
            final SubLObject var152 = module0178.f11287(var99);
            final SubLObject var153 = module0178.f11331(var99, (SubLObject)module0248.ONE_INTEGER);
            final SubLObject var154 = module0178.f11331(var99, (SubLObject)module0248.TWO_INTEGER);
            final SubLObject var15_148 = module0137.$g1605$.currentBinding(var148);
            try {
                module0137.$g1605$.bind(var38, var148);
                f15956(var153, var154, var152, var151);
            }
            finally {
                module0137.$g1605$.rebind(var15_148, var148);
            }
        }
        finally {
            module0138.$g1627$.rebind(var150, var148);
            module0138.$g1628$.rebind(var149, var148);
        }
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f15958(final SubLObject var1, final SubLObject var149, SubLObject var38) {
        if (var38 == module0248.UNPROVIDED) {
            var38 = (SubLObject)module0248.NIL;
        }
        if (module0248.NIL != var38 && !module0248.areAssertionsDisabledFor(me) && module0248.NIL == module0137.f8885(var38)) {
            throw new AssertionError(var38);
        }
        module0242.f15665(var1, var149, var38);
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f15959(final SubLObject var1, final SubLObject var2, final SubLObject var5, final SubLObject var6, final SubLObject var9, SubLObject var38) {
        if (var38 == module0248.UNPROVIDED) {
            var38 = (SubLObject)module0248.NIL;
        }
        if (module0248.NIL != var38 && !module0248.areAssertionsDisabledFor(me) && module0248.NIL == module0137.f8885(var38)) {
            throw new AssertionError(var38);
        }
        if (module0248.NIL != f15923(var9, var1, var2, var5, var6)) {
            module0245.f15857(module0245.f15851(var1, var2, var5, var38), var6, var9);
        }
        else {
            module0136.f8870((SubLObject)module0248.THREE_INTEGER, (SubLObject)module0248.$ic37$, var9, var1, var2, var5, var6);
        }
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f15960(final SubLObject var1, final SubLObject var5, final SubLObject var6, final SubLObject var9, SubLObject var38) {
        if (var38 == module0248.UNPROVIDED) {
            var38 = (SubLObject)module0248.NIL;
        }
        if (module0248.NIL != var38 && !module0248.areAssertionsDisabledFor(me) && module0248.NIL == module0137.f8885(var38)) {
            throw new AssertionError(var38);
        }
        final SubLObject var39 = module0244.f15778(module0137.f8955((SubLObject)module0248.UNPROVIDED));
        final SubLObject var40 = module0244.f15780(module0137.f8955((SubLObject)module0248.UNPROVIDED));
        module0136.f8869((SubLObject)module0248.THREE_INTEGER, (SubLObject)module0248.$ic38$, var9, var1, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED);
        f15959(var1, var39, var5, var6, var9, var38);
        module0136.f8869((SubLObject)module0248.THREE_INTEGER, (SubLObject)module0248.$ic39$, var1, var9, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED);
        f15959(var9, var40, var5, var6, var1, var38);
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f15961(final SubLObject var71, final SubLObject var72, final SubLObject var5, final SubLObject var6) {
        final SubLObject var73 = module0137.f8955((SubLObject)module0248.UNPROVIDED);
        final SubLObject var74 = module0244.f15778(var73);
        final SubLObject var75 = module0244.f15780(var73);
        final SubLObject var76 = module0242.f15664(var71, var73);
        final SubLObject var77 = module0242.f15664(var72, var73);
        final SubLObject var78 = (SubLObject)((module0248.NIL != var76) ? module0245.f15834(var76, var74, var73) : module0248.NIL);
        final SubLObject var79 = (SubLObject)((module0248.NIL != var77) ? module0245.f15834(var77, var75, var73) : module0248.NIL);
        final SubLObject var80 = (SubLObject)((module0248.NIL != var78) ? module0245.f15844(var78, var5) : module0248.NIL);
        final SubLObject var81 = (SubLObject)((module0248.NIL != var79) ? module0245.f15844(var79, var5) : module0248.NIL);
        if (module0248.NIL != module0245.f15853(var72, var6, var80)) {
            module0245.f15857(var80, var6, var72);
            if (module0248.NIL != module0247.f15903(var6, var80)) {
                module0245.f15858(var80, var6);
            }
            if (module0248.NIL != module0247.f15905(var5, var78)) {
                module0245.f15848(var78, var5);
            }
            if (module0248.NIL != module0247.f15907(var74, var76)) {
                module0245.f15837(var76, var74, var73);
            }
            if (module0248.NIL != module0247.f15908(var71, var73)) {
                module0242.f15667(var71, var73);
            }
            else {
                module0242.f15666(var71, var76, var73);
            }
        }
        if (module0248.NIL != module0245.f15853(var71, var6, var81)) {
            module0245.f15857(var81, var6, var71);
            if (module0248.NIL != module0247.f15903(var6, var81)) {
                module0245.f15858(var81, var6);
            }
            if (module0248.NIL != module0247.f15905(var5, var79)) {
                module0245.f15848(var79, var5);
            }
            if (module0248.NIL != module0247.f15907(var75, var77)) {
                module0245.f15837(var77, var75, var73);
            }
            if (module0248.NIL != module0247.f15908(var72, var73)) {
                module0242.f15667(var72, var73);
            }
            else {
                module0242.f15666(var72, var77, var73);
            }
        }
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f15962(final SubLObject var147, final SubLObject var99, final SubLObject var38) {
        final SubLThread var148 = SubLProcess.currentSubLThread();
        assert module0248.NIL != module0137.f8885(var38) : var38;
        if (module0248.NIL == module0226.f15088(var99, module0178.f11292(var99))) {
            final SubLObject var149 = f15947(var99);
            final SubLObject var150 = module0178.f11287(var99);
            final SubLObject var151 = module0178.f11331(var99, (SubLObject)module0248.ONE_INTEGER);
            final SubLObject var152 = module0178.f11331(var99, (SubLObject)module0248.TWO_INTEGER);
            final SubLObject var153 = module0137.$g1605$.currentBinding(var148);
            try {
                module0137.$g1605$.bind(var38, var148);
                if (module0248.NIL != f15943(var151, var152)) {
                    f15963(var151, var152, var150, var149);
                }
                else {
                    f15961(var151, var152, var150, var149);
                }
            }
            finally {
                module0137.$g1605$.rebind(var153, var148);
            }
        }
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f15964(final SubLObject var99, SubLObject var156) {
        if (module0248.NIL != module0178.f11284(var99)) {
            final SubLObject var157 = f15947(var99);
            var156 = module0138.f8989(var156);
            if (!var157.eql(var156)) {
                final SubLObject var158 = module0178.f11332(var99);
                if (module0248.NIL != module0244.f15730(var158)) {
                    f15965(var99, var156, module0137.f8955(var158));
                }
            }
        }
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f15965(final SubLObject var99, final SubLObject var156, final SubLObject var38) {
        final SubLThread var157 = SubLProcess.currentSubLThread();
        final SubLObject var158 = f15947(var99);
        final SubLObject var159 = module0178.f11287(var99);
        final SubLObject var160 = module0178.f11331(var99, (SubLObject)module0248.ONE_INTEGER);
        final SubLObject var161 = module0178.f11331(var99, (SubLObject)module0248.TWO_INTEGER);
        final SubLObject var162 = module0137.$g1605$.currentBinding(var157);
        try {
            module0137.$g1605$.bind(var38, var157);
            if (module0248.NIL != f15943(var160, var161)) {
                f15963(var160, var161, var159, var156);
            }
            else {
                f15961(var160, var161, var159, var156);
            }
            f15956(var160, var161, var159, var158);
        }
        finally {
            module0137.$g1605$.rebind(var162, var157);
        }
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f15966() {
        module0248.$g2467$.setGlobalValue(Hashtables.make_hash_table((SubLObject)module0248.$ic41$, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED));
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f15967() {
        if (module0248.$g2467$.getGlobalValue().isHashtable()) {
            Hashtables.clrhash(module0248.$g2467$.getGlobalValue());
        }
        else {
            f15966();
        }
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f15968(final SubLObject var158) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0248.$g2467$.getGlobalValue().isHashtable() && module0248.NIL != module0035.sublisp_boolean(Hashtables.gethash(var158, module0248.$g2467$.getGlobalValue(), (SubLObject)module0248.UNPROVIDED)));
    }
    
    public static SubLObject f15944(final SubLObject var71, final SubLObject var72, final SubLObject var5, final SubLObject var6) {
        module0030.f1600(var71, (SubLObject)ConsesLow.list(var72, var5, var6), module0248.$g2467$.getGlobalValue(), (SubLObject)module0248.EQUAL);
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f15963(final SubLObject var71, final SubLObject var72, final SubLObject var5, final SubLObject var6) {
        final SubLObject var73 = (SubLObject)ConsesLow.list(var72, var5, var6);
        module0030.f1613(var71, var73, module0248.$g2467$.getGlobalValue(), (SubLObject)module0248.EQUAL, (SubLObject)module0248.UNPROVIDED);
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f15943(final SubLObject var71, final SubLObject var72) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0244.f15736(module0137.f8955((SubLObject)module0248.UNPROVIDED)).eql(module0248.$ic42$) && module0248.NIL != module0138.f8992(var71) && module0248.NIL != module0202.f12659(var72));
    }
    
    public static SubLObject f15969(final SubLObject var158, SubLObject var5, SubLObject var6) {
        if (var5 == module0248.UNPROVIDED) {
            var5 = (SubLObject)module0248.NIL;
        }
        if (var6 == module0248.UNPROVIDED) {
            var6 = (SubLObject)module0248.NIL;
        }
        final SubLThread var159 = SubLProcess.currentSubLThread();
        final SubLObject var160 = module0137.f8955(module0248.$ic43$);
        SubLObject var161 = (SubLObject)module0248.NIL;
        final SubLObject var162 = var5;
        final SubLObject var163 = module0147.$g2095$.currentBinding(var159);
        final SubLObject var164 = module0147.$g2094$.currentBinding(var159);
        final SubLObject var165 = module0147.$g2096$.currentBinding(var159);
        try {
            module0147.$g2095$.bind(module0147.f9545(var162), var159);
            module0147.$g2094$.bind(module0147.f9546(var162), var159);
            module0147.$g2096$.bind(module0147.f9549(var162), var159);
            final SubLObject var166 = var6;
            final SubLObject var15_161 = module0141.$g1714$.currentBinding(var159);
            final SubLObject var16_162 = module0141.$g1715$.currentBinding(var159);
            try {
                module0141.$g1714$.bind((module0248.NIL != var166) ? var166 : module0141.f9283(), var159);
                module0141.$g1715$.bind((SubLObject)((module0248.NIL != var166) ? module0248.$ic6$ : module0141.$g1715$.getDynamicValue(var159)), var159);
                if (module0248.NIL != var166 && module0248.NIL != module0136.f8864() && module0248.NIL == module0141.f9279(var166)) {
                    final SubLObject var167 = module0136.$g1591$.getDynamicValue(var159);
                    if (var167.eql((SubLObject)module0248.$ic7$)) {
                        module0136.f8870((SubLObject)module0248.ONE_INTEGER, (SubLObject)module0248.$ic8$, var166, (SubLObject)module0248.$ic44$, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED);
                    }
                    else if (var167.eql((SubLObject)module0248.$ic10$)) {
                        module0136.f8871((SubLObject)module0248.ONE_INTEGER, (SubLObject)module0248.$ic11$, (SubLObject)module0248.$ic8$, var166, (SubLObject)module0248.$ic44$, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED);
                    }
                    else if (var167.eql((SubLObject)module0248.$ic12$)) {
                        Errors.warn((SubLObject)module0248.$ic8$, var166, (SubLObject)module0248.$ic44$);
                    }
                    else {
                        Errors.warn((SubLObject)module0248.$ic13$, module0136.$g1591$.getDynamicValue(var159));
                        Errors.cerror((SubLObject)module0248.$ic11$, (SubLObject)module0248.$ic8$, var166, (SubLObject)module0248.$ic44$);
                    }
                }
                final SubLObject var15_162 = module0137.$g1605$.currentBinding(var159);
                try {
                    module0137.$g1605$.bind(var160, var159);
                    SubLObject var168 = Hashtables.gethash(var158, module0248.$g2467$.getGlobalValue(), (SubLObject)module0248.UNPROVIDED);
                    SubLObject var169 = (SubLObject)module0248.NIL;
                    var169 = var168.first();
                    while (module0248.NIL != var168) {
                        SubLObject var171;
                        final SubLObject var170 = var171 = var169;
                        SubLObject var172 = (SubLObject)module0248.NIL;
                        SubLObject var173 = (SubLObject)module0248.NIL;
                        SubLObject var174 = (SubLObject)module0248.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var171, var170, (SubLObject)module0248.$ic45$);
                        var172 = var171.first();
                        var171 = var171.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var171, var170, (SubLObject)module0248.$ic45$);
                        var173 = var171.first();
                        var171 = var171.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var171, var170, (SubLObject)module0248.$ic45$);
                        var174 = var171.first();
                        var171 = var171.rest();
                        if (module0248.NIL == var171) {
                            if (module0248.NIL != module0147.f9507(var173) && module0248.NIL != module0141.f9289(var174)) {
                                var161 = (SubLObject)ConsesLow.cons(var172, var161);
                                SubLObject var54_170;
                                final SubLObject var175 = var54_170 = ((module0248.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8971(), module0141.$g1714$.getDynamicValue(var159), var160)) : module0244.f15760(module0138.f8971(), module0141.$g1714$.getDynamicValue(var159), var160));
                                SubLObject var176 = (SubLObject)module0248.NIL;
                                var176 = var54_170.first();
                                while (module0248.NIL != var54_170) {
                                    final SubLObject var15_163 = module0138.$g1625$.currentBinding(var159);
                                    try {
                                        module0138.$g1625$.bind(var176, var159);
                                        final SubLObject var178;
                                        final SubLObject var177 = var178 = Functions.funcall(var176, var172);
                                        if (module0248.NIL != module0077.f5302(var178)) {
                                            final SubLObject var179 = module0077.f5333(var178);
                                            SubLObject var180;
                                            SubLObject var181;
                                            SubLObject var182;
                                            for (var180 = module0032.f1741(var179), var181 = (SubLObject)module0248.NIL, var181 = module0032.f1742(var180, var179); module0248.NIL == module0032.f1744(var180, var181); var181 = module0032.f1743(var181)) {
                                                var182 = module0032.f1745(var180, var181);
                                                if (module0248.NIL != module0032.f1746(var181, var182)) {
                                                    var161 = (SubLObject)ConsesLow.cons(var182, var161);
                                                }
                                            }
                                        }
                                        else if (var178.isList()) {
                                            SubLObject var183 = var178;
                                            SubLObject var184 = (SubLObject)module0248.NIL;
                                            var184 = var183.first();
                                            while (module0248.NIL != var183) {
                                                var161 = (SubLObject)ConsesLow.cons(var184, var161);
                                                var183 = var183.rest();
                                                var184 = var183.first();
                                            }
                                        }
                                        else {
                                            Errors.error((SubLObject)module0248.$ic3$, var178);
                                        }
                                    }
                                    finally {
                                        module0138.$g1625$.rebind(var15_163, var159);
                                    }
                                    var54_170 = var54_170.rest();
                                    var176 = var54_170.first();
                                }
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var170, (SubLObject)module0248.$ic45$);
                        }
                        var168 = var168.rest();
                        var169 = var168.first();
                    }
                }
                finally {
                    module0137.$g1605$.rebind(var15_162, var159);
                }
            }
            finally {
                module0141.$g1715$.rebind(var16_162, var159);
                module0141.$g1714$.rebind(var15_161, var159);
            }
        }
        finally {
            module0147.$g2096$.rebind(var165, var159);
            module0147.$g2094$.rebind(var164, var159);
            module0147.$g2095$.rebind(var163, var159);
        }
        return Sequences.delete_duplicates(var161, (SubLObject)module0248.EQUAL, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED);
    }
    
    public static SubLObject f15970(final SubLObject var172, SubLObject var5, SubLObject var6) {
        if (var5 == module0248.UNPROVIDED) {
            var5 = (SubLObject)module0248.NIL;
        }
        if (var6 == module0248.UNPROVIDED) {
            var6 = (SubLObject)module0248.NIL;
        }
        SubLObject var173 = (SubLObject)module0248.NIL;
        SubLObject var174 = var172;
        SubLObject var175 = (SubLObject)module0248.NIL;
        var175 = var174.first();
        while (module0248.NIL != var174) {
            var173 = ConsesLow.nconc(f15969(var175, var5, var6), var173);
            var174 = var174.rest();
            var175 = var174.first();
        }
        return Sequences.delete_duplicates(var173, (SubLObject)module0248.EQUAL, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED);
    }
    
    public static SubLObject f15971(final SubLObject var173, final SubLObject var174) {
        SubLObject var176;
        final SubLObject var175 = var176 = var173.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var176, var175, (SubLObject)module0248.$ic46$);
        final SubLObject var177 = var176.rest();
        var176 = var176.first();
        SubLObject var178 = (SubLObject)module0248.NIL;
        SubLObject var179 = (SubLObject)module0248.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var176, var175, (SubLObject)module0248.$ic46$);
        var178 = var176.first();
        var176 = var176.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var176, var175, (SubLObject)module0248.$ic46$);
        var179 = var176.first();
        var176 = var176.rest();
        final SubLObject var180 = (SubLObject)(var176.isCons() ? var176.first() : module0248.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var176, var175, (SubLObject)module0248.$ic46$);
        var176 = var176.rest();
        final SubLObject var181 = (SubLObject)(var176.isCons() ? var176.first() : module0248.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var176, var175, (SubLObject)module0248.$ic46$);
        var176 = var176.rest();
        if (module0248.NIL == var176) {
            final SubLObject var182;
            var176 = (var182 = var177);
            final SubLObject var183 = (SubLObject)module0248.$ic47$;
            final SubLObject var184 = (SubLObject)module0248.$ic48$;
            final SubLObject var185 = (SubLObject)module0248.$ic49$;
            final SubLObject var186 = (SubLObject)module0248.$ic50$;
            final SubLObject var187 = (SubLObject)module0248.$ic51$;
            return (SubLObject)ConsesLow.list((SubLObject)module0248.$ic52$, (SubLObject)ConsesLow.list(reader.bq_cons(var183, (SubLObject)module0248.$ic53$)), (SubLObject)ConsesLow.list((SubLObject)module0248.$ic54$, var180, (SubLObject)ConsesLow.list((SubLObject)module0248.$ic55$, var181, (SubLObject)ConsesLow.list((SubLObject)module0248.$ic56$, var183, (SubLObject)ConsesLow.list((SubLObject)module0248.$ic57$, (SubLObject)ConsesLow.list(var184, (SubLObject)ConsesLow.listS((SubLObject)module0248.$ic58$, var179, (SubLObject)module0248.$ic59$)), (SubLObject)ConsesLow.list((SubLObject)module0248.$ic60$, (SubLObject)ConsesLow.list(var185, var186, var187), var184, (SubLObject)ConsesLow.list((SubLObject)module0248.$ic61$, (SubLObject)ConsesLow.list((SubLObject)module0248.$ic62$, (SubLObject)ConsesLow.list((SubLObject)module0248.$ic63$, var186), (SubLObject)ConsesLow.list((SubLObject)module0248.$ic64$, var187)), (SubLObject)ConsesLow.listS((SubLObject)module0248.$ic52$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var178, var185)), ConsesLow.append(var182, (SubLObject)module0248.NIL)), (SubLObject)ConsesLow.listS((SubLObject)module0248.$ic65$, (SubLObject)ConsesLow.list(var178, var185, (SubLObject)module0248.$ic66$, var183), ConsesLow.append(var182, (SubLObject)module0248.NIL)))))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var175, (SubLObject)module0248.$ic46$);
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f15972() {
        module0248.$g2468$.setGlobalValue(Hashtables.make_hash_table((SubLObject)module0248.$ic41$, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED));
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f15973() {
        if (module0248.$g2468$.getGlobalValue().isHashtable()) {
            Hashtables.clrhash(module0248.$g2468$.getGlobalValue());
        }
        else {
            f15972();
        }
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f15974(final SubLObject var158) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0248.$g2468$.getGlobalValue().isHashtable() && module0248.NIL != module0035.sublisp_boolean(Hashtables.gethash(var158, module0248.$g2468$.getGlobalValue(), (SubLObject)module0248.UNPROVIDED)));
    }
    
    public static SubLObject f15975(final SubLObject var71, final SubLObject var72, final SubLObject var5, final SubLObject var6) {
        module0030.f1600(var71, (SubLObject)ConsesLow.list(var72, var5, var6), module0248.$g2468$.getGlobalValue(), (SubLObject)module0248.EQUAL);
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f15976(final SubLObject var71, final SubLObject var72, final SubLObject var5, final SubLObject var6) {
        final SubLObject var73 = (SubLObject)ConsesLow.list(var72, var5, var6);
        module0030.f1613(var71, var73, module0248.$g2468$.getGlobalValue(), (SubLObject)module0248.EQUAL, (SubLObject)module0248.UNPROVIDED);
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f15977(final SubLObject var71, final SubLObject var72) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0244.f15736(module0137.f8955((SubLObject)module0248.UNPROVIDED)).eql(module0248.$ic68$) && module0248.NIL != module0138.f8992(var71) && module0248.NIL != module0202.f12659(var72));
    }
    
    public static SubLObject f15978(final SubLObject var158, SubLObject var5, SubLObject var6) {
        if (var5 == module0248.UNPROVIDED) {
            var5 = (SubLObject)module0248.NIL;
        }
        if (var6 == module0248.UNPROVIDED) {
            var6 = (SubLObject)module0248.NIL;
        }
        final SubLThread var159 = SubLProcess.currentSubLThread();
        final SubLObject var160 = module0137.f8955(module0248.$ic43$);
        SubLObject var161 = (SubLObject)module0248.NIL;
        final SubLObject var162 = var5;
        final SubLObject var163 = module0147.$g2095$.currentBinding(var159);
        final SubLObject var164 = module0147.$g2094$.currentBinding(var159);
        final SubLObject var165 = module0147.$g2096$.currentBinding(var159);
        try {
            module0147.$g2095$.bind(module0147.f9545(var162), var159);
            module0147.$g2094$.bind(module0147.f9546(var162), var159);
            module0147.$g2096$.bind(module0147.f9549(var162), var159);
            final SubLObject var166 = var6;
            final SubLObject var15_180 = module0141.$g1714$.currentBinding(var159);
            final SubLObject var16_181 = module0141.$g1715$.currentBinding(var159);
            try {
                module0141.$g1714$.bind((module0248.NIL != var166) ? var166 : module0141.f9283(), var159);
                module0141.$g1715$.bind((SubLObject)((module0248.NIL != var166) ? module0248.$ic6$ : module0141.$g1715$.getDynamicValue(var159)), var159);
                if (module0248.NIL != var166 && module0248.NIL != module0136.f8864() && module0248.NIL == module0141.f9279(var166)) {
                    final SubLObject var167 = module0136.$g1591$.getDynamicValue(var159);
                    if (var167.eql((SubLObject)module0248.$ic7$)) {
                        module0136.f8870((SubLObject)module0248.ONE_INTEGER, (SubLObject)module0248.$ic8$, var166, (SubLObject)module0248.$ic44$, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED);
                    }
                    else if (var167.eql((SubLObject)module0248.$ic10$)) {
                        module0136.f8871((SubLObject)module0248.ONE_INTEGER, (SubLObject)module0248.$ic11$, (SubLObject)module0248.$ic8$, var166, (SubLObject)module0248.$ic44$, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED);
                    }
                    else if (var167.eql((SubLObject)module0248.$ic12$)) {
                        Errors.warn((SubLObject)module0248.$ic8$, var166, (SubLObject)module0248.$ic44$);
                    }
                    else {
                        Errors.warn((SubLObject)module0248.$ic13$, module0136.$g1591$.getDynamicValue(var159));
                        Errors.cerror((SubLObject)module0248.$ic11$, (SubLObject)module0248.$ic8$, var166, (SubLObject)module0248.$ic44$);
                    }
                }
                final SubLObject var15_181 = module0137.$g1605$.currentBinding(var159);
                try {
                    module0137.$g1605$.bind(var160, var159);
                    SubLObject var168 = Hashtables.gethash(var158, module0248.$g2468$.getGlobalValue(), (SubLObject)module0248.UNPROVIDED);
                    SubLObject var169 = (SubLObject)module0248.NIL;
                    var169 = var168.first();
                    while (module0248.NIL != var168) {
                        SubLObject var171;
                        final SubLObject var170 = var171 = var169;
                        SubLObject var172 = (SubLObject)module0248.NIL;
                        SubLObject var173 = (SubLObject)module0248.NIL;
                        SubLObject var174 = (SubLObject)module0248.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var171, var170, (SubLObject)module0248.$ic69$);
                        var172 = var171.first();
                        var171 = var171.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var171, var170, (SubLObject)module0248.$ic69$);
                        var173 = var171.first();
                        var171 = var171.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var171, var170, (SubLObject)module0248.$ic69$);
                        var174 = var171.first();
                        var171 = var171.rest();
                        if (module0248.NIL == var171) {
                            if (module0248.NIL != module0147.f9507(var173) && module0248.NIL != module0141.f9289(var174)) {
                                var161 = (SubLObject)ConsesLow.cons(var172, var161);
                                SubLObject var54_188;
                                final SubLObject var175 = var54_188 = ((module0248.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8971(), module0141.$g1714$.getDynamicValue(var159), var160)) : module0244.f15760(module0138.f8971(), module0141.$g1714$.getDynamicValue(var159), var160));
                                SubLObject var176 = (SubLObject)module0248.NIL;
                                var176 = var54_188.first();
                                while (module0248.NIL != var54_188) {
                                    final SubLObject var15_182 = module0138.$g1625$.currentBinding(var159);
                                    try {
                                        module0138.$g1625$.bind(var176, var159);
                                        final SubLObject var178;
                                        final SubLObject var177 = var178 = Functions.funcall(var176, var172);
                                        if (module0248.NIL != module0077.f5302(var178)) {
                                            final SubLObject var179 = module0077.f5333(var178);
                                            SubLObject var180;
                                            SubLObject var181;
                                            SubLObject var182;
                                            for (var180 = module0032.f1741(var179), var181 = (SubLObject)module0248.NIL, var181 = module0032.f1742(var180, var179); module0248.NIL == module0032.f1744(var180, var181); var181 = module0032.f1743(var181)) {
                                                var182 = module0032.f1745(var180, var181);
                                                if (module0248.NIL != module0032.f1746(var181, var182)) {
                                                    var161 = (SubLObject)ConsesLow.cons(var182, var161);
                                                }
                                            }
                                        }
                                        else if (var178.isList()) {
                                            SubLObject var183 = var178;
                                            SubLObject var184 = (SubLObject)module0248.NIL;
                                            var184 = var183.first();
                                            while (module0248.NIL != var183) {
                                                var161 = (SubLObject)ConsesLow.cons(var184, var161);
                                                var183 = var183.rest();
                                                var184 = var183.first();
                                            }
                                        }
                                        else {
                                            Errors.error((SubLObject)module0248.$ic3$, var178);
                                        }
                                    }
                                    finally {
                                        module0138.$g1625$.rebind(var15_182, var159);
                                    }
                                    var54_188 = var54_188.rest();
                                    var176 = var54_188.first();
                                }
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var170, (SubLObject)module0248.$ic69$);
                        }
                        var168 = var168.rest();
                        var169 = var168.first();
                    }
                }
                finally {
                    module0137.$g1605$.rebind(var15_181, var159);
                }
            }
            finally {
                module0141.$g1715$.rebind(var16_181, var159);
                module0141.$g1714$.rebind(var15_180, var159);
            }
        }
        finally {
            module0147.$g2096$.rebind(var165, var159);
            module0147.$g2094$.rebind(var164, var159);
            module0147.$g2095$.rebind(var163, var159);
        }
        return Sequences.delete_duplicates(var161, (SubLObject)module0248.EQUAL, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED);
    }
    
    public static SubLObject f15979(final SubLObject var172, SubLObject var5, SubLObject var6) {
        if (var5 == module0248.UNPROVIDED) {
            var5 = (SubLObject)module0248.NIL;
        }
        if (var6 == module0248.UNPROVIDED) {
            var6 = (SubLObject)module0248.NIL;
        }
        SubLObject var173 = (SubLObject)module0248.NIL;
        SubLObject var174 = var172;
        SubLObject var175 = (SubLObject)module0248.NIL;
        var175 = var174.first();
        while (module0248.NIL != var174) {
            var173 = ConsesLow.nconc(f15969(var175, var5, var6), var173);
            var174 = var174.rest();
            var175 = var174.first();
        }
        return Sequences.delete_duplicates(var173, (SubLObject)module0248.EQUAL, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED);
    }
    
    public static SubLObject f15980(final SubLObject var173, final SubLObject var174) {
        SubLObject var176;
        final SubLObject var175 = var176 = var173.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var176, var175, (SubLObject)module0248.$ic70$);
        final SubLObject var177 = var176.rest();
        var176 = var176.first();
        SubLObject var178 = (SubLObject)module0248.NIL;
        SubLObject var179 = (SubLObject)module0248.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var176, var175, (SubLObject)module0248.$ic70$);
        var178 = var176.first();
        var176 = var176.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var176, var175, (SubLObject)module0248.$ic70$);
        var179 = var176.first();
        var176 = var176.rest();
        final SubLObject var180 = (SubLObject)(var176.isCons() ? var176.first() : module0248.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var176, var175, (SubLObject)module0248.$ic70$);
        var176 = var176.rest();
        final SubLObject var181 = (SubLObject)(var176.isCons() ? var176.first() : module0248.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var176, var175, (SubLObject)module0248.$ic70$);
        var176 = var176.rest();
        if (module0248.NIL == var176) {
            final SubLObject var182;
            var176 = (var182 = var177);
            final SubLObject var183 = (SubLObject)module0248.$ic71$;
            final SubLObject var184 = (SubLObject)module0248.$ic72$;
            final SubLObject var185 = (SubLObject)module0248.$ic73$;
            final SubLObject var186 = (SubLObject)module0248.$ic74$;
            final SubLObject var187 = (SubLObject)module0248.$ic75$;
            return (SubLObject)ConsesLow.list((SubLObject)module0248.$ic52$, (SubLObject)ConsesLow.list(reader.bq_cons(var183, (SubLObject)module0248.$ic53$)), (SubLObject)ConsesLow.list((SubLObject)module0248.$ic54$, var180, (SubLObject)ConsesLow.list((SubLObject)module0248.$ic55$, var181, (SubLObject)ConsesLow.list((SubLObject)module0248.$ic56$, var183, (SubLObject)ConsesLow.list((SubLObject)module0248.$ic57$, (SubLObject)ConsesLow.list(var184, (SubLObject)ConsesLow.listS((SubLObject)module0248.$ic58$, var179, (SubLObject)module0248.$ic76$)), (SubLObject)ConsesLow.list((SubLObject)module0248.$ic60$, (SubLObject)ConsesLow.list(var185, var186, var187), var184, (SubLObject)ConsesLow.list((SubLObject)module0248.$ic61$, (SubLObject)ConsesLow.list((SubLObject)module0248.$ic62$, (SubLObject)ConsesLow.list((SubLObject)module0248.$ic63$, var186), (SubLObject)ConsesLow.list((SubLObject)module0248.$ic64$, var187)), (SubLObject)ConsesLow.listS((SubLObject)module0248.$ic52$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var178, var185)), ConsesLow.append(var182, (SubLObject)module0248.NIL)), (SubLObject)ConsesLow.listS((SubLObject)module0248.$ic65$, (SubLObject)ConsesLow.list(var178, var185, (SubLObject)module0248.$ic66$, var183), ConsesLow.append(var182, (SubLObject)module0248.NIL)))))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var175, (SubLObject)module0248.$ic70$);
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f15981(final SubLObject var173, final SubLObject var174) {
        SubLObject var176;
        final SubLObject var175 = var176 = var173.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var176, var175, (SubLObject)module0248.$ic79$);
        final SubLObject var177 = var176.rest();
        var176 = var176.first();
        SubLObject var178 = (SubLObject)module0248.NIL;
        SubLObject var179 = (SubLObject)module0248.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var176, var175, (SubLObject)module0248.$ic79$);
        var178 = var176.first();
        var176 = var176.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var176, var175, (SubLObject)module0248.$ic79$);
        var179 = var176.first();
        var176 = var176.rest();
        final SubLObject var180 = (SubLObject)(var176.isCons() ? var176.first() : module0248.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var176, var175, (SubLObject)module0248.$ic79$);
        var176 = var176.rest();
        final SubLObject var181 = (SubLObject)(var176.isCons() ? var176.first() : module0248.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var176, var175, (SubLObject)module0248.$ic79$);
        var176 = var176.rest();
        final SubLObject var182 = (SubLObject)(var176.isCons() ? var176.first() : module0248.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var176, var175, (SubLObject)module0248.$ic79$);
        var176 = var176.rest();
        if (module0248.NIL == var176) {
            final SubLObject var183;
            var176 = (var183 = var177);
            final SubLObject var184 = (SubLObject)module0248.$ic80$;
            final SubLObject var185 = (SubLObject)module0248.$ic81$;
            final SubLObject var186 = (SubLObject)module0248.$ic82$;
            return (SubLObject)ConsesLow.list((SubLObject)module0248.$ic83$, var180, (SubLObject)ConsesLow.list((SubLObject)module0248.$ic84$, var181, (SubLObject)ConsesLow.list((SubLObject)module0248.$ic85$, (SubLObject)ConsesLow.list(var184, (SubLObject)ConsesLow.listS((SubLObject)module0248.$ic86$, var179, (SubLObject)module0248.$ic87$), var182), (SubLObject)ConsesLow.list((SubLObject)module0248.$ic60$, (SubLObject)ConsesLow.list(var178, var185, var186), var184, (SubLObject)ConsesLow.listS((SubLObject)module0248.$ic61$, (SubLObject)ConsesLow.list((SubLObject)module0248.$ic62$, (SubLObject)ConsesLow.list((SubLObject)module0248.$ic63$, var185), (SubLObject)ConsesLow.list((SubLObject)module0248.$ic64$, var186)), ConsesLow.append(var183, (SubLObject)module0248.NIL))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var175, (SubLObject)module0248.$ic79$);
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f15982(final SubLObject var202) {
        assert module0248.NIL != Types.hash_table_p(var202) : var202;
        module0248.$g2469$.setGlobalValue(var202);
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f15983(final SubLObject var202) {
        assert module0248.NIL != Types.hash_table_p(var202) : var202;
        module0248.$g2470$.setGlobalValue(var202);
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f15984() {
        return module0248.$g2469$.getGlobalValue();
    }
    
    public static SubLObject f15985() {
        return module0248.$g2470$.getGlobalValue();
    }
    
    public static SubLObject f15986() {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0248.NIL != module0107.f7628(module0248.$g2469$.getGlobalValue()) || module0248.NIL != module0107.f7628(module0248.$g2470$.getGlobalValue()));
    }
    
    public static SubLObject f15987() {
        module0248.$g2469$.setGlobalValue(Hashtables.make_hash_table((SubLObject)module0248.$ic89$, Symbols.symbol_function((SubLObject)module0248.EQUAL), (SubLObject)module0248.UNPROVIDED));
        module0248.$g2470$.setGlobalValue(Hashtables.make_hash_table((SubLObject)module0248.$ic89$, Symbols.symbol_function((SubLObject)module0248.EQL), (SubLObject)module0248.UNPROVIDED));
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f15988() {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        f15987();
        SubLObject var11 = (SubLObject)module0248.ZERO_INTEGER;
        final SubLObject var12 = module0147.$g2094$.currentBinding(var10);
        final SubLObject var13 = module0147.$g2095$.currentBinding(var10);
        try {
            module0147.$g2094$.bind((SubLObject)module0248.$ic23$, var10);
            module0147.$g2095$.bind(module0248.$ic24$, var10);
            final SubLObject var14 = module0248.$ic42$;
            if (module0248.NIL != module0158.f10038(var14)) {
                final SubLObject var15 = (SubLObject)module0248.$ic90$;
                final SubLObject var15_204 = module0012.$g73$.currentBinding(var10);
                final SubLObject var16_205 = module0012.$g65$.currentBinding(var10);
                final SubLObject var16 = module0012.$g67$.currentBinding(var10);
                final SubLObject var17 = module0012.$g68$.currentBinding(var10);
                final SubLObject var18 = module0012.$g66$.currentBinding(var10);
                final SubLObject var19 = module0012.$g69$.currentBinding(var10);
                final SubLObject var20 = module0012.$g70$.currentBinding(var10);
                final SubLObject var21 = module0012.$silent_progressP$.currentBinding(var10);
                try {
                    module0012.$g73$.bind(Time.get_universal_time(), var10);
                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var10), var10);
                    module0012.$g67$.bind((SubLObject)module0248.ONE_INTEGER, var10);
                    module0012.$g68$.bind((SubLObject)module0248.ZERO_INTEGER, var10);
                    module0012.$g66$.bind((SubLObject)module0248.ZERO_INTEGER, var10);
                    module0012.$g69$.bind((SubLObject)module0248.ZERO_INTEGER, var10);
                    module0012.$g70$.bind((SubLObject)module0248.T, var10);
                    module0012.$silent_progressP$.bind((SubLObject)((module0248.NIL != var15) ? module0012.$silent_progressP$.getDynamicValue(var10) : module0248.T), var10);
                    module0012.f474(var15);
                    final SubLObject var22 = module0158.f10039(var14);
                    SubLObject var23 = (SubLObject)module0248.NIL;
                    final SubLObject var24 = (SubLObject)module0248.NIL;
                    while (module0248.NIL == var23) {
                        final SubLObject var25 = module0052.f3695(var22, var24);
                        final SubLObject var26 = (SubLObject)SubLObjectFactory.makeBoolean(!var24.eql(var25));
                        if (module0248.NIL != var26) {
                            module0012.f476();
                            SubLObject var27 = (SubLObject)module0248.NIL;
                            try {
                                var27 = module0158.f10316(var25, (SubLObject)module0248.$ic27$, (SubLObject)module0248.$ic91$, (SubLObject)module0248.NIL);
                                SubLObject var119_206 = (SubLObject)module0248.NIL;
                                final SubLObject var120_207 = (SubLObject)module0248.NIL;
                                while (module0248.NIL == var119_206) {
                                    final SubLObject var28 = module0052.f3695(var27, var120_207);
                                    final SubLObject var122_209 = (SubLObject)SubLObjectFactory.makeBoolean(!var120_207.eql(var28));
                                    if (module0248.NIL != var122_209) {
                                        final SubLObject var29 = module0178.f11334(var28);
                                        if (module0248.NIL != module0173.f10956(var29)) {
                                            f15989(var28);
                                            var11 = Numbers.add(var11, (SubLObject)module0248.ONE_INTEGER);
                                        }
                                    }
                                    var119_206 = (SubLObject)SubLObjectFactory.makeBoolean(module0248.NIL == var122_209);
                                }
                            }
                            finally {
                                final SubLObject var15_205 = Threads.$is_thread_performing_cleanupP$.currentBinding(var10);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0248.T, var10);
                                    if (module0248.NIL != var27) {
                                        module0158.f10319(var27);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var15_205, var10);
                                }
                            }
                        }
                        var23 = (SubLObject)SubLObjectFactory.makeBoolean(module0248.NIL == var26);
                    }
                    module0012.f475();
                }
                finally {
                    module0012.$silent_progressP$.rebind(var21, var10);
                    module0012.$g70$.rebind(var20, var10);
                    module0012.$g69$.rebind(var19, var10);
                    module0012.$g66$.rebind(var18, var10);
                    module0012.$g68$.rebind(var17, var10);
                    module0012.$g67$.rebind(var16, var10);
                    module0012.$g65$.rebind(var16_205, var10);
                    module0012.$g73$.rebind(var15_204, var10);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var13, var10);
            module0147.$g2094$.rebind(var12, var10);
        }
        return var11;
    }
    
    public static SubLObject f15990(final SubLObject var198, final SubLObject var211, SubLObject var5, SubLObject var6) {
        if (var5 == module0248.UNPROVIDED) {
            var5 = (SubLObject)module0248.NIL;
        }
        if (var6 == module0248.UNPROVIDED) {
            var6 = (SubLObject)module0248.NIL;
        }
        final SubLThread var212 = SubLProcess.currentSubLThread();
        assert module0248.NIL != module0173.f10956(var198) : var198;
        SubLObject var213 = (SubLObject)module0248.NIL;
        final SubLObject var214 = var5;
        final SubLObject var215 = module0147.$g2095$.currentBinding(var212);
        final SubLObject var216 = module0147.$g2094$.currentBinding(var212);
        final SubLObject var217 = module0147.$g2096$.currentBinding(var212);
        try {
            module0147.$g2095$.bind(module0147.f9545(var214), var212);
            module0147.$g2094$.bind(module0147.f9546(var214), var212);
            module0147.$g2096$.bind(module0147.f9549(var214), var212);
            final SubLObject var218 = var6;
            final SubLObject var15_213 = module0141.$g1714$.currentBinding(var212);
            final SubLObject var16_214 = module0141.$g1715$.currentBinding(var212);
            try {
                module0141.$g1714$.bind((module0248.NIL != var218) ? var218 : module0141.$g1714$.getDynamicValue(var212), var212);
                module0141.$g1715$.bind((SubLObject)((module0248.NIL != var218) ? module0248.$ic6$ : module0141.$g1715$.getDynamicValue(var212)), var212);
                if (module0248.NIL != var218 && module0248.NIL != module0136.f8864() && module0248.NIL == module0141.f9282(var218)) {
                    final SubLObject var219 = module0136.$g1591$.getDynamicValue(var212);
                    if (var219.eql((SubLObject)module0248.$ic7$)) {
                        module0136.f8870((SubLObject)module0248.ONE_INTEGER, (SubLObject)module0248.$ic8$, var218, (SubLObject)module0248.$ic9$, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED);
                    }
                    else if (var219.eql((SubLObject)module0248.$ic10$)) {
                        module0136.f8871((SubLObject)module0248.ONE_INTEGER, (SubLObject)module0248.$ic11$, (SubLObject)module0248.$ic8$, var218, (SubLObject)module0248.$ic9$, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED);
                    }
                    else if (var219.eql((SubLObject)module0248.$ic12$)) {
                        Errors.warn((SubLObject)module0248.$ic8$, var218, (SubLObject)module0248.$ic9$);
                    }
                    else {
                        Errors.warn((SubLObject)module0248.$ic13$, module0136.$g1591$.getDynamicValue(var212));
                        Errors.cerror((SubLObject)module0248.$ic11$, (SubLObject)module0248.$ic8$, var218, (SubLObject)module0248.$ic9$);
                    }
                }
                if (module0248.NIL == var213) {
                    SubLObject var220 = Hashtables.gethash_without_values(var198, f15984(), (SubLObject)module0248.UNPROVIDED);
                    SubLObject var221 = (SubLObject)module0248.NIL;
                    var221 = var220.first();
                    while (module0248.NIL == var213 && module0248.NIL != var220) {
                        SubLObject var223;
                        final SubLObject var222 = var223 = var221;
                        SubLObject var224 = (SubLObject)module0248.NIL;
                        SubLObject var225 = (SubLObject)module0248.NIL;
                        SubLObject var226 = (SubLObject)module0248.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var223, var222, (SubLObject)module0248.$ic93$);
                        var224 = var223.first();
                        var223 = var223.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var223, var222, (SubLObject)module0248.$ic93$);
                        var225 = var223.first();
                        var223 = var223.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var223, var222, (SubLObject)module0248.$ic93$);
                        var226 = var223.first();
                        var223 = var223.rest();
                        if (module0248.NIL == var223) {
                            if (module0248.NIL != module0147.f9507(var225) && module0248.NIL != module0141.f9289(var226) && module0248.NIL != module0256.f16596(var224, var211, var5, var6)) {
                                var213 = (SubLObject)module0248.T;
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var222, (SubLObject)module0248.$ic93$);
                        }
                        var220 = var220.rest();
                        var221 = var220.first();
                    }
                }
            }
            finally {
                module0141.$g1715$.rebind(var16_214, var212);
                module0141.$g1714$.rebind(var15_213, var212);
            }
        }
        finally {
            module0147.$g2096$.rebind(var217, var212);
            module0147.$g2094$.rebind(var216, var212);
            module0147.$g2095$.rebind(var215, var212);
        }
        return var213;
    }
    
    public static SubLObject f15991(final SubLObject var198, final SubLObject var221, SubLObject var5, SubLObject var6) {
        if (var5 == module0248.UNPROVIDED) {
            var5 = (SubLObject)module0248.NIL;
        }
        if (var6 == module0248.UNPROVIDED) {
            var6 = (SubLObject)module0248.NIL;
        }
        assert module0248.NIL != module0173.f10956(var198) : var198;
        SubLObject var222 = var221;
        SubLObject var223 = (SubLObject)module0248.NIL;
        var223 = var222.first();
        while (module0248.NIL != var222) {
            if (module0248.NIL != f15990(var198, var223, var5, var6)) {
                return (SubLObject)module0248.T;
            }
            var222 = var222.rest();
            var223 = var222.first();
        }
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f15992(final SubLObject var198, final SubLObject var221, SubLObject var5, SubLObject var6) {
        if (var5 == module0248.UNPROVIDED) {
            var5 = (SubLObject)module0248.NIL;
        }
        if (var6 == module0248.UNPROVIDED) {
            var6 = (SubLObject)module0248.NIL;
        }
        assert module0248.NIL != module0173.f10956(var198) : var198;
        SubLObject var222 = var221;
        SubLObject var223 = (SubLObject)module0248.NIL;
        var223 = var222.first();
        while (module0248.NIL != var222) {
            if (module0248.NIL == f15990(var198, var223, var5, var6)) {
                return (SubLObject)module0248.NIL;
            }
            var222 = var222.rest();
            var223 = var222.first();
        }
        return (SubLObject)module0248.T;
    }
    
    public static SubLObject f15993(final SubLObject var198, SubLObject var5, SubLObject var6) {
        if (var5 == module0248.UNPROVIDED) {
            var5 = (SubLObject)module0248.NIL;
        }
        if (var6 == module0248.UNPROVIDED) {
            var6 = (SubLObject)module0248.NIL;
        }
        final SubLThread var199 = SubLProcess.currentSubLThread();
        SubLObject var200 = (SubLObject)module0248.NIL;
        final SubLObject var201 = var5;
        final SubLObject var202 = module0147.$g2095$.currentBinding(var199);
        final SubLObject var203 = module0147.$g2094$.currentBinding(var199);
        final SubLObject var204 = module0147.$g2096$.currentBinding(var199);
        try {
            module0147.$g2095$.bind(module0147.f9545(var201), var199);
            module0147.$g2094$.bind(module0147.f9546(var201), var199);
            module0147.$g2096$.bind(module0147.f9549(var201), var199);
            final SubLObject var205 = var6;
            final SubLObject var15_222 = module0141.$g1714$.currentBinding(var199);
            final SubLObject var16_223 = module0141.$g1715$.currentBinding(var199);
            try {
                module0141.$g1714$.bind((module0248.NIL != var205) ? var205 : module0141.$g1714$.getDynamicValue(var199), var199);
                module0141.$g1715$.bind((SubLObject)((module0248.NIL != var205) ? module0248.$ic6$ : module0141.$g1715$.getDynamicValue(var199)), var199);
                if (module0248.NIL != var205 && module0248.NIL != module0136.f8864() && module0248.NIL == module0141.f9282(var205)) {
                    final SubLObject var206 = module0136.$g1591$.getDynamicValue(var199);
                    if (var206.eql((SubLObject)module0248.$ic7$)) {
                        module0136.f8870((SubLObject)module0248.ONE_INTEGER, (SubLObject)module0248.$ic8$, var205, (SubLObject)module0248.$ic9$, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED);
                    }
                    else if (var206.eql((SubLObject)module0248.$ic10$)) {
                        module0136.f8871((SubLObject)module0248.ONE_INTEGER, (SubLObject)module0248.$ic11$, (SubLObject)module0248.$ic8$, var205, (SubLObject)module0248.$ic9$, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED, (SubLObject)module0248.UNPROVIDED);
                    }
                    else if (var206.eql((SubLObject)module0248.$ic12$)) {
                        Errors.warn((SubLObject)module0248.$ic8$, var205, (SubLObject)module0248.$ic9$);
                    }
                    else {
                        Errors.warn((SubLObject)module0248.$ic13$, module0136.$g1591$.getDynamicValue(var199));
                        Errors.cerror((SubLObject)module0248.$ic11$, (SubLObject)module0248.$ic8$, var205, (SubLObject)module0248.$ic9$);
                    }
                }
                SubLObject var207 = Hashtables.gethash_without_values(var198, f15984(), (SubLObject)module0248.UNPROVIDED);
                SubLObject var208 = (SubLObject)module0248.NIL;
                var208 = var207.first();
                while (module0248.NIL != var207) {
                    SubLObject var210;
                    final SubLObject var209 = var210 = var208;
                    SubLObject var211 = (SubLObject)module0248.NIL;
                    SubLObject var212 = (SubLObject)module0248.NIL;
                    SubLObject var213 = (SubLObject)module0248.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var210, var209, (SubLObject)module0248.$ic94$);
                    var211 = var210.first();
                    var210 = var210.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var210, var209, (SubLObject)module0248.$ic94$);
                    var212 = var210.first();
                    var210 = var210.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var210, var209, (SubLObject)module0248.$ic94$);
                    var213 = var210.first();
                    var210 = var210.rest();
                    if (module0248.NIL == var210) {
                        if (module0248.NIL != module0147.f9507(var212) && module0248.NIL != module0141.f9289(var213)) {
                            var200 = (SubLObject)ConsesLow.cons(var211, var200);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var209, (SubLObject)module0248.$ic94$);
                    }
                    var207 = var207.rest();
                    var208 = var207.first();
                }
            }
            finally {
                module0141.$g1715$.rebind(var16_223, var199);
                module0141.$g1714$.rebind(var15_222, var199);
            }
        }
        finally {
            module0147.$g2096$.rebind(var204, var199);
            module0147.$g2094$.rebind(var203, var199);
            module0147.$g2095$.rebind(var202, var199);
        }
        return var200;
    }
    
    public static SubLObject f15994(final SubLObject var198, SubLObject var5, SubLObject var6) {
        if (var5 == module0248.UNPROVIDED) {
            var5 = (SubLObject)module0248.NIL;
        }
        if (var6 == module0248.UNPROVIDED) {
            var6 = (SubLObject)module0248.NIL;
        }
        assert module0248.NIL != module0173.f10956(var198) : var198;
        return module0256.f16550(f15993(var198, var5, var6), var5, var6);
    }
    
    public static SubLObject f15995(final SubLObject var211) {
        return Hashtables.gethash_without_values(var211, module0248.$g2470$.getGlobalValue(), (SubLObject)module0248.UNPROVIDED);
    }
    
    public static SubLObject f15996(final SubLObject var208) {
        final SubLObject var209 = module0178.f11334(var208);
        if (module0248.NIL != module0173.f10956(var209) && module0248.NIL != module0211.f13635(var208)) {
            f15989(var208);
            return (SubLObject)module0248.T;
        }
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f15997(final SubLObject var208) {
        final SubLObject var209 = module0178.f11334(var208);
        if (module0248.NIL != module0173.f10956(var209) && module0248.NIL != module0211.f13635(var208)) {
            f15998(var208);
            return (SubLObject)module0248.T;
        }
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f15989(final SubLObject var208) {
        final SubLObject var209 = module0178.f11334(var208);
        final SubLObject var210 = module0178.f11335(var208);
        final SubLObject var211 = module0178.f11287(var208);
        final SubLObject var212 = f15947(var208);
        final SubLObject var213 = (SubLObject)ConsesLow.list(var210, var211, var212);
        final SubLObject var214 = (SubLObject)ConsesLow.list(var209, var211, var212);
        module0030.f1600(var209, var213, module0248.$g2469$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0248.EQUAL));
        module0030.f1600(var210, var214, module0248.$g2470$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0248.EQUAL));
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f15998(final SubLObject var208) {
        final SubLObject var209 = module0178.f11334(var208);
        final SubLObject var210 = module0178.f11335(var208);
        final SubLObject var211 = module0178.f11287(var208);
        final SubLObject var212 = f15947(var208);
        final SubLObject var213 = (SubLObject)ConsesLow.list(var210, var211, var212);
        final SubLObject var214 = (SubLObject)ConsesLow.list(var209, var211, var212);
        module0030.f1613(var209, var213, module0248.$g2469$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0248.EQUAL), (SubLObject)module0248.UNPROVIDED);
        module0030.f1613(var210, var214, module0248.$g2470$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0248.EQUAL), (SubLObject)module0248.UNPROVIDED);
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f15999(final SubLObject var1, final SubLObject var5, SubLObject var38) {
        if (var38 == module0248.UNPROVIDED) {
            var38 = (SubLObject)module0248.NIL;
        }
        module0245.f15847(var1, var5, var38);
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f16000(final SubLObject var1, SubLObject var38) {
        if (var38 == module0248.UNPROVIDED) {
            var38 = (SubLObject)module0248.NIL;
        }
        module0242.f15667(var1, var38);
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f16001(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = module0137.f8931();
        SubLObject var4 = (SubLObject)module0248.NIL;
        var4 = var3.first();
        while (module0248.NIL != var3) {
            SubLObject var6;
            final SubLObject var5 = var6 = var4;
            SubLObject var7 = (SubLObject)module0248.NIL;
            SubLObject var8 = (SubLObject)module0248.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0248.$ic95$);
            var7 = var6.first();
            var6 = (var8 = var6.rest());
            final SubLObject var9 = module0137.$g1605$.currentBinding(var2);
            try {
                module0137.$g1605$.bind(var8, var2);
                f16000(var1, (SubLObject)module0248.UNPROVIDED);
            }
            finally {
                module0137.$g1605$.rebind(var9, var2);
            }
            var3 = var3.rest();
            var4 = var3.first();
        }
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f16002(final SubLObject var1, final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        SubLObject var7 = module0137.f8931();
        SubLObject var8 = (SubLObject)module0248.NIL;
        var8 = var7.first();
        while (module0248.NIL != var7) {
            SubLObject var10;
            final SubLObject var9 = var10 = var8;
            SubLObject var11 = (SubLObject)module0248.NIL;
            SubLObject var12 = (SubLObject)module0248.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)module0248.$ic95$);
            var11 = var10.first();
            var10 = (var12 = var10.rest());
            final SubLObject var13 = module0137.$g1605$.currentBinding(var6);
            try {
                module0137.$g1605$.bind(var12, var6);
                f15999(var1, var5, (SubLObject)module0248.UNPROVIDED);
            }
            finally {
                module0137.$g1605$.rebind(var13, var6);
            }
            var7 = var7.rest();
            var8 = var7.first();
        }
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f16003(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = module0137.f8931();
        SubLObject var4 = (SubLObject)module0248.NIL;
        var4 = var3.first();
        while (module0248.NIL != var3) {
            SubLObject var6;
            final SubLObject var5 = var6 = var4;
            SubLObject var7 = (SubLObject)module0248.NIL;
            SubLObject var8 = (SubLObject)module0248.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0248.$ic95$);
            var7 = var6.first();
            var6 = (var8 = var6.rest());
            final SubLObject var9 = module0137.$g1605$.currentBinding(var2);
            try {
                module0137.$g1605$.bind(var8, var2);
                final SubLObject var10 = module0242.f15664(var1, var8);
                if (module0248.NIL != var10) {
                    SubLObject var54_233 = module0244.f15784(var8);
                    SubLObject var11 = (SubLObject)module0248.NIL;
                    var11 = var54_233.first();
                    while (module0248.NIL != var54_233) {
                        final SubLObject var12 = module0245.f15834(var10, var11, var8);
                        if (module0248.NIL != var12) {
                            SubLObject var13;
                            for (var13 = module0066.f4838(module0067.f4891(var12)); module0248.NIL == module0066.f4841(var13); var13 = module0066.f4840(var13)) {
                                var2.resetMultipleValues();
                                final SubLObject var14 = module0066.f4839(var13);
                                final SubLObject var15 = var2.secondMultipleValue();
                                var2.resetMultipleValues();
                                SubLObject var21_236;
                                for (var21_236 = module0066.f4838(module0067.f4891(var15)); module0248.NIL == module0066.f4841(var21_236); var21_236 = module0066.f4840(var21_236)) {
                                    var2.resetMultipleValues();
                                    final SubLObject var16 = module0066.f4839(var21_236);
                                    final SubLObject var17 = var2.secondMultipleValue();
                                    var2.resetMultipleValues();
                                    final SubLObject var18 = var17;
                                    if (module0248.NIL != module0077.f5302(var18)) {
                                        final SubLObject var19 = module0077.f5333(var18);
                                        SubLObject var20;
                                        SubLObject var21;
                                        SubLObject var22;
                                        for (var20 = module0032.f1741(var19), var21 = (SubLObject)module0248.NIL, var21 = module0032.f1742(var20, var19); module0248.NIL == module0032.f1744(var20, var21); var21 = module0032.f1743(var21)) {
                                            var22 = module0032.f1745(var20, var21);
                                            if (module0248.NIL != module0032.f1746(var21, var22)) {
                                                f15961(var1, var22, var14, var16);
                                            }
                                        }
                                    }
                                    else if (var18.isList()) {
                                        SubLObject var23 = var18;
                                        SubLObject var24 = (SubLObject)module0248.NIL;
                                        var24 = var23.first();
                                        while (module0248.NIL != var23) {
                                            f15961(var1, var24, var14, var16);
                                            var23 = var23.rest();
                                            var24 = var23.first();
                                        }
                                    }
                                    else {
                                        Errors.error((SubLObject)module0248.$ic3$, var18);
                                    }
                                }
                                module0066.f4842(var21_236);
                            }
                            module0066.f4842(var13);
                        }
                        var54_233 = var54_233.rest();
                        var11 = var54_233.first();
                    }
                }
            }
            finally {
                module0137.$g1605$.rebind(var9, var2);
            }
            var3 = var3.rest();
            var4 = var3.first();
        }
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f16004(final SubLObject var38) {
        assert module0248.NIL != module0137.f8885(var38) : var38;
        module0242.f15647(module0244.f15766(var38));
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f16005() {
        SubLObject var54 = module0137.f8931();
        SubLObject var55 = (SubLObject)module0248.NIL;
        var55 = var54.first();
        while (module0248.NIL != var54) {
            SubLObject var57;
            final SubLObject var56 = var57 = var55;
            SubLObject var58 = (SubLObject)module0248.NIL;
            SubLObject var59 = (SubLObject)module0248.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var57, var56, (SubLObject)module0248.$ic95$);
            var58 = var57.first();
            var57 = (var59 = var57.rest());
            final SubLObject var60 = module0137.f8919(var59);
            module0242.f15647(var60);
            var54 = var54.rest();
            var55 = var54.first();
        }
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f15946() {
        SubLObject var54 = module0137.f8931();
        SubLObject var55 = (SubLObject)module0248.NIL;
        var55 = var54.first();
        while (module0248.NIL != var54) {
            SubLObject var57;
            final SubLObject var56 = var57 = var55;
            SubLObject var58 = (SubLObject)module0248.NIL;
            SubLObject var59 = (SubLObject)module0248.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var57, var56, (SubLObject)module0248.$ic95$);
            var58 = var57.first();
            var57 = (var59 = var57.rest());
            final SubLObject var60 = module0137.f8919(var59);
            if (module0248.NIL != module0244.f15732(var59)) {
                module0242.f15647(var60);
            }
            var54 = var54.rest();
            var55 = var54.first();
        }
        f15967();
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f15950() {
        Hashtables.clrhash(module0142.$g1720$.getGlobalValue());
        Hashtables.clrhash(module0142.$g1721$.getGlobalValue());
        Hashtables.clrhash(module0142.$g1722$.getGlobalValue());
        module0142.$g1723$.setGlobalValue((SubLObject)module0248.NIL);
        SubLObject var54 = module0137.f8931();
        SubLObject var55 = (SubLObject)module0248.NIL;
        var55 = var54.first();
        while (module0248.NIL != var54) {
            SubLObject var57;
            final SubLObject var56 = var57 = var55;
            SubLObject var58 = (SubLObject)module0248.NIL;
            SubLObject var59 = (SubLObject)module0248.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var57, var56, (SubLObject)module0248.$ic95$);
            var58 = var57.first();
            var57 = (var59 = var57.rest());
            final SubLObject var60 = module0137.f8919(var59);
            if (module0248.NIL == module0244.f15732(var59)) {
                module0242.f15647(var60);
            }
            var54 = var54.rest();
            var55 = var54.first();
        }
        module0323.f21861();
        module0323.f21875();
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f16006(final SubLObject var38, final SubLObject var1, SubLObject var5) {
        if (var5 == module0248.UNPROVIDED) {
            var5 = module0147.$g2095$.getDynamicValue();
        }
        assert module0248.NIL != module0137.f8885(var38) : var38;
        return module0220.f14548(var1, module0137.f8917(var38), var5, (SubLObject)module0248.ONE_INTEGER, (SubLObject)module0248.$ic91$);
    }
    
    public static SubLObject f16007(final SubLObject var38, final SubLObject var1, SubLObject var5) {
        if (var5 == module0248.UNPROVIDED) {
            var5 = module0147.$g2095$.getDynamicValue();
        }
        assert module0248.NIL != module0137.f8885(var38) : var38;
        if (module0248.NIL != module0244.f15779(var38)) {
            return module0220.f14566(var1, module0137.f8917(var38), var5, (SubLObject)module0248.ONE_INTEGER, (SubLObject)module0248.TWO_INTEGER, (SubLObject)module0248.$ic91$);
        }
        return ConsesLow.nconc(module0220.f14566(var1, module0137.f8917(var38), var5, (SubLObject)module0248.ONE_INTEGER, (SubLObject)module0248.TWO_INTEGER, (SubLObject)module0248.$ic91$), module0220.f14566(var1, module0137.f8917(var38), var5, (SubLObject)module0248.TWO_INTEGER, (SubLObject)module0248.ONE_INTEGER, (SubLObject)module0248.$ic91$));
    }
    
    public static SubLObject f16008(final SubLObject var38, final SubLObject var1, SubLObject var5) {
        if (var5 == module0248.UNPROVIDED) {
            var5 = module0147.$g2095$.getDynamicValue();
        }
        assert module0248.NIL != module0137.f8885(var38) : var38;
        if (module0248.NIL != module0244.f15779(var38)) {
            return module0220.f14566(var1, module0137.f8917(var38), var5, (SubLObject)module0248.ONE_INTEGER, (SubLObject)module0248.TWO_INTEGER, (SubLObject)module0248.$ic96$);
        }
        return ConsesLow.nconc(module0220.f14566(var1, module0137.f8917(var38), var5, (SubLObject)module0248.ONE_INTEGER, (SubLObject)module0248.TWO_INTEGER, (SubLObject)module0248.$ic96$), module0220.f14566(var1, module0137.f8917(var38), var5, (SubLObject)module0248.TWO_INTEGER, (SubLObject)module0248.ONE_INTEGER, (SubLObject)module0248.$ic96$));
    }
    
    public static SubLObject f16009(final SubLObject var38, final SubLObject var1, SubLObject var5) {
        if (var5 == module0248.UNPROVIDED) {
            var5 = module0147.$g2095$.getDynamicValue();
        }
        assert module0248.NIL != module0137.f8885(var38) : var38;
        return module0220.f14566(var1, module0137.f8917(var38), var5, (SubLObject)module0248.TWO_INTEGER, (SubLObject)module0248.ONE_INTEGER, (SubLObject)module0248.$ic91$);
    }
    
    public static SubLObject f16010(final SubLObject var38, final SubLObject var1, SubLObject var5) {
        if (var5 == module0248.UNPROVIDED) {
            var5 = module0147.$g2095$.getDynamicValue();
        }
        assert module0248.NIL != module0137.f8885(var38) : var38;
        return module0220.f14566(var1, module0137.f8917(var38), var5, (SubLObject)module0248.TWO_INTEGER, (SubLObject)module0248.ONE_INTEGER, (SubLObject)module0248.$ic96$);
    }
    
    public static SubLObject f16011(final SubLObject var38, final SubLObject var1, SubLObject var5) {
        if (var5 == module0248.UNPROVIDED) {
            var5 = module0147.$g2095$.getDynamicValue();
        }
        assert module0248.NIL != module0137.f8885(var38) : var38;
        if (module0248.NIL != module0244.f15779(var38)) {
            return module0226.f15087(var1, module0137.f8917(var38), var5, (SubLObject)module0248.ONE_INTEGER, (SubLObject)module0248.TWO_INTEGER, (SubLObject)module0248.$ic91$);
        }
        return ConsesLow.nconc(module0226.f15087(var1, module0137.f8917(var38), var5, (SubLObject)module0248.ONE_INTEGER, (SubLObject)module0248.TWO_INTEGER, (SubLObject)module0248.$ic91$), module0226.f15087(var1, module0137.f8917(var38), var5, (SubLObject)module0248.TWO_INTEGER, (SubLObject)module0248.ONE_INTEGER, (SubLObject)module0248.$ic91$));
    }
    
    public static SubLObject f16012(final SubLObject var38, final SubLObject var1, SubLObject var5) {
        if (var5 == module0248.UNPROVIDED) {
            var5 = module0147.$g2095$.getDynamicValue();
        }
        assert module0248.NIL != module0137.f8885(var38) : var38;
        if (module0248.NIL != module0244.f15779(var38)) {
            return module0226.f15087(var1, module0137.f8917(var38), var5, (SubLObject)module0248.ONE_INTEGER, (SubLObject)module0248.TWO_INTEGER, (SubLObject)module0248.$ic96$);
        }
        return ConsesLow.nconc(module0226.f15087(var1, module0137.f8917(var38), var5, (SubLObject)module0248.ONE_INTEGER, (SubLObject)module0248.TWO_INTEGER, (SubLObject)module0248.$ic96$), module0226.f15087(var1, module0137.f8917(var38), var5, (SubLObject)module0248.TWO_INTEGER, (SubLObject)module0248.ONE_INTEGER, (SubLObject)module0248.$ic96$));
    }
    
    public static SubLObject f16013(final SubLObject var38, final SubLObject var1, SubLObject var5) {
        if (var5 == module0248.UNPROVIDED) {
            var5 = module0147.$g2095$.getDynamicValue();
        }
        assert module0248.NIL != module0137.f8885(var38) : var38;
        return module0226.f15087(var1, module0137.f8917(var38), var5, (SubLObject)module0248.TWO_INTEGER, (SubLObject)module0248.ONE_INTEGER, (SubLObject)module0248.$ic91$);
    }
    
    public static SubLObject f16014(final SubLObject var38, final SubLObject var1, SubLObject var5) {
        if (var5 == module0248.UNPROVIDED) {
            var5 = module0147.$g2095$.getDynamicValue();
        }
        assert module0248.NIL != module0137.f8885(var38) : var38;
        return module0226.f15087(var1, module0137.f8917(var38), var5, (SubLObject)module0248.TWO_INTEGER, (SubLObject)module0248.ONE_INTEGER, (SubLObject)module0248.$ic96$);
    }
    
    public static SubLObject f16015() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15916", "S#18662", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15917", "S#18663", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15918", "S#18664", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15919", "S#18665", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15920", "S#18666", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15921", "S#18667", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15922", "S#18668", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15923", "S#18669", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15924", "S#18670", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15925", "S#18671", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15926", "S#18672", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15927", "S#18673", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15928", "S#18674", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15929", "S#18675", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15930", "S#18676", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15931", "S#18677", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15932", "S#18678", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15933", "S#18679", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15934", "S#18680", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15935", "S#18681", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15936", "S#18682", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15937", "S#18683", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15938", "S#18684", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15939", "S#18685", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15940", "S#18686", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15941", "S#18687", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15942", "S#18688", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15945", "S#18689", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15948", "S#18690", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15947", "S#18691", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15949", "S#18692", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15951", "S#18693", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15952", "S#18694", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15953", "S#18695", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15954", "S#18696", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15955", "S#18697", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15956", "S#18698", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15957", "S#18699", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15958", "S#18700", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15959", "S#18701", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15960", "S#18702", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15961", "S#18703", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15962", "S#18704", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15964", "S#18705", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15965", "S#18706", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15966", "S#18707", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15967", "S#18708", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15968", "S#18709", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15944", "S#18710", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15963", "S#18711", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15943", "S#18712", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15969", "S#18713", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15970", "S#18714", 1, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0248", "f15971", "S#18715");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15972", "S#18716", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15973", "S#18717", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15974", "S#18718", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15975", "S#18719", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15976", "S#18720", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15977", "S#18721", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15978", "S#18722", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15979", "S#18723", 1, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0248", "f15980", "S#18724");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0248", "f15981", "S#18725");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15982", "S#18726", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15983", "S#18727", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15984", "S#18728", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15985", "S#18729", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15986", "S#16684", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15987", "S#18730", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15988", "S#16685", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15990", "S#18731", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15991", "S#18732", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15992", "S#18733", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15993", "S#18734", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15994", "S#18735", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15995", "S#15368", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15996", "S#18736", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15997", "S#18737", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15989", "S#18738", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15998", "S#18739", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15999", "S#18740", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f16000", "S#18741", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f16001", "S#18742", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f16002", "S#18743", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f16003", "S#18744", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f16004", "S#18745", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f16005", "S#18746", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15946", "S#18747", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f15950", "S#18748", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f16006", "S#18749", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f16007", "S#18750", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f16008", "S#18751", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f16009", "S#18752", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f16010", "S#18753", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f16011", "S#18754", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f16012", "S#18755", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f16013", "S#18756", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0248", "f16014", "S#18757", 2, 1, false);
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f16016() {
        module0248.$g2467$ = SubLFiles.deflexical("S#18758", (SubLObject)((module0248.NIL != Symbols.boundp((SubLObject)module0248.$ic40$)) ? module0248.$g2467$.getGlobalValue() : module0248.NIL));
        module0248.$g2468$ = SubLFiles.deflexical("S#18759", (SubLObject)((module0248.NIL != Symbols.boundp((SubLObject)module0248.$ic67$)) ? module0248.$g2468$.getGlobalValue() : module0248.NIL));
        module0248.$g2469$ = SubLFiles.deflexical("S#18760", (module0248.NIL != Symbols.boundp((SubLObject)module0248.$ic77$)) ? module0248.$g2469$.getGlobalValue() : module0107.f7627());
        module0248.$g2470$ = SubLFiles.deflexical("S#18761", (module0248.NIL != Symbols.boundp((SubLObject)module0248.$ic78$)) ? module0248.$g2470$.getGlobalValue() : module0107.f7627());
        return (SubLObject)module0248.NIL;
    }
    
    public static SubLObject f16017() {
        module0003.f57((SubLObject)module0248.$ic40$);
        module0003.f57((SubLObject)module0248.$ic67$);
        module0003.f57((SubLObject)module0248.$ic77$);
        module0003.f57((SubLObject)module0248.$ic78$);
        return (SubLObject)module0248.NIL;
    }
    
    public void declareFunctions() {
        f16015();
    }
    
    public void initializeVariables() {
        f16016();
    }
    
    public void runTopLevelForms() {
        f16017();
    }
    
    static {
        me = (SubLFile)new module0248();
        module0248.$g2467$ = null;
        module0248.$g2468$ = null;
        module0248.$g2469$ = null;
        module0248.$g2470$ = null;
        $ic0$ = SubLObjectFactory.makeKeyword("PREDICATE");
        $ic1$ = SubLObjectFactory.makeKeyword("INVERSE");
        $ic2$ = SubLObjectFactory.makeKeyword("LINK");
        $ic3$ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $ic4$ = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic5$ = SubLObjectFactory.makeSymbol("S#11099", "CYC");
        $ic6$ = SubLObjectFactory.makeSymbol("S#11450", "CYC");
        $ic7$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic8$ = SubLObjectFactory.makeString("~A is not a ~A");
        $ic9$ = SubLObjectFactory.makeSymbol("S#11585", "CYC");
        $ic10$ = SubLObjectFactory.makeKeyword("CERROR");
        $ic11$ = SubLObjectFactory.makeString("continue anyway");
        $ic12$ = SubLObjectFactory.makeKeyword("WARN");
        $ic13$ = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic14$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("True-JustificationTruth"));
        $ic15$ = SubLObjectFactory.makeString("tv, ~a, does not satisfy sbhl-true-tv-p");
        $ic16$ = SubLObjectFactory.makeString("sbhl-link-nodes never called.");
        $ic17$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("False-JustificationTruth"));
        $ic18$ = SubLObjectFactory.makeString("tv, ~a, does not satisfy sbhl-false-tv-p");
        $ic19$ = SubLObjectFactory.makeKeyword("UNKNOWN");
        $ic20$ = SubLObjectFactory.makeString("Initializing all SBHL Graph Links");
        $ic21$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic22$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic23$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic24$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic25$ = SubLObjectFactory.makeString("Initializing ");
        $ic26$ = SubLObjectFactory.makeString(" SBHL Graph Links");
        $ic27$ = SubLObjectFactory.makeKeyword("GAF");
        $ic28$ = SubLObjectFactory.makeKeyword("DEFINITIONAL");
        $ic29$ = SubLObjectFactory.makeKeyword("COORDINATE");
        $ic30$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Always-TimeInterval"));
        $ic31$ = SubLObjectFactory.makeKeyword("WEAK");
        $ic32$ = SubLObjectFactory.makeString("Initializing SBHL Time Links");
        $ic33$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeUninternedSymbol("US#3165895"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#12F0EC7"));
        $ic34$ = SubLObjectFactory.makeString("adding sbhl links for: ~a with truth ~a.~%");
        $ic35$ = SubLObjectFactory.makeString("Link node, ~a, not present in forward links after performing (store-in-sbhl-graph ~a ~a ~a ~a). ~%");
        $ic36$ = SubLObjectFactory.makeString("Link node, ~a, not present in backward links after performing (store-in-sbhl-graph ~a ~a ~a ~a). ~%");
        $ic37$ = SubLObjectFactory.makeString("Cannot remove link node, ~a, not within links specified by node ~a, direction ~a, mt ~a, tv ~a, within *sbhl-module*~%");
        $ic38$ = SubLObjectFactory.makeString("Removing ~a from ~a forward direction link");
        $ic39$ = SubLObjectFactory.makeString("Removing ~a from ~a backward direction link");
        $ic40$ = SubLObjectFactory.makeSymbol("S#18758", "CYC");
        $ic41$ = SubLObjectFactory.makeInteger(200);
        $ic42$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic43$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genls"));
        $ic44$ = SubLObjectFactory.makeSymbol("S#11592", "CYC");
        $ic45$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#18762", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#18763", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#18764", "CYC"));
        $ic46$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#15396", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10995", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic47$ = SubLObjectFactory.makeUninternedSymbol("US#12F0EC7");
        $ic48$ = SubLObjectFactory.makeUninternedSymbol("US#15B20FB");
        $ic49$ = SubLObjectFactory.makeUninternedSymbol("US#30670C2");
        $ic50$ = SubLObjectFactory.makeUninternedSymbol("US#35B6E1E");
        $ic51$ = SubLObjectFactory.makeUninternedSymbol("US#35BE29E");
        $ic52$ = SubLObjectFactory.makeSymbol("CLET");
        $ic53$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11102", "CYC"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("genls"))));
        $ic54$ = SubLObjectFactory.makeSymbol("S#11611", "CYC");
        $ic55$ = SubLObjectFactory.makeSymbol("S#11609", "CYC");
        $ic56$ = SubLObjectFactory.makeSymbol("S#11176", "CYC");
        $ic57$ = SubLObjectFactory.makeSymbol("CDOLIST");
        $ic58$ = SubLObjectFactory.makeSymbol("GETHASH");
        $ic59$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#18758", "CYC"));
        $ic60$ = SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND");
        $ic61$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic62$ = SubLObjectFactory.makeSymbol("CAND");
        $ic63$ = SubLObjectFactory.makeSymbol("RELEVANT-MT?");
        $ic64$ = SubLObjectFactory.makeSymbol("S#11591", "CYC");
        $ic65$ = SubLObjectFactory.makeSymbol("S#15243", "CYC");
        $ic66$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11219", "CYC"));
        $ic67$ = SubLObjectFactory.makeSymbol("S#18759", "CYC");
        $ic68$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("quotedIsa"));
        $ic69$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#18762", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#18765", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#18766", "CYC"));
        $ic70$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#15400", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10995", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic71$ = SubLObjectFactory.makeUninternedSymbol("US#12F0EC7");
        $ic72$ = SubLObjectFactory.makeUninternedSymbol("US#6A538CA");
        $ic73$ = SubLObjectFactory.makeUninternedSymbol("US#30670C2");
        $ic74$ = SubLObjectFactory.makeUninternedSymbol("US#3FCACC8");
        $ic75$ = SubLObjectFactory.makeUninternedSymbol("US#2FCACC9");
        $ic76$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#18759", "CYC"));
        $ic77$ = SubLObjectFactory.makeSymbol("S#18760", "CYC");
        $ic78$ = SubLObjectFactory.makeSymbol("S#18761", "CYC");
        $ic79$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#18767", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#18768", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10995", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#8587", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic80$ = SubLObjectFactory.makeUninternedSymbol("US#15B20FB");
        $ic81$ = SubLObjectFactory.makeUninternedSymbol("US#4A5C20A");
        $ic82$ = SubLObjectFactory.makeUninternedSymbol("US#785C208");
        $ic83$ = SubLObjectFactory.makeSymbol("S#11680", "CYC");
        $ic84$ = SubLObjectFactory.makeSymbol("S#11608", "CYC");
        $ic85$ = SubLObjectFactory.makeSymbol("CSOME");
        $ic86$ = SubLObjectFactory.makeSymbol("GETHASH-WITHOUT-VALUES");
        $ic87$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#18728", "CYC")));
        $ic88$ = SubLObjectFactory.makeSymbol("HASH-TABLE-P");
        $ic89$ = SubLObjectFactory.makeInteger(256);
        $ic90$ = SubLObjectFactory.makeString("Rebuilding non-fort #$isa tables...");
        $ic91$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic92$ = SubLObjectFactory.makeSymbol("S#13758", "CYC");
        $ic93$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#18769", "CYC"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#4A5C20A"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#785C208"));
        $ic94$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12455", "CYC"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#4A5C20A"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#785C208"));
        $ic95$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeUninternedSymbol("US#3165895"), (SubLObject)SubLObjectFactory.makeSymbol("S#205", "CYC"));
        $ic96$ = SubLObjectFactory.makeKeyword("FALSE");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0248.class
	Total time: 1147 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/