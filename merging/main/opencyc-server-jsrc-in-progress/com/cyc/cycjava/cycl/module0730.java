package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0730 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0730";
    public static final String myFingerPrint = "f6cf185802043e4ad7e1a30d5a6dc19f1c659bc2e8eddf509320eb64ad305336";
    private static SubLSymbol $g5741$;
    private static SubLSymbol $g5742$;
    private static SubLSymbol $g5743$;
    private static SubLSymbol $g5744$;
    private static SubLSymbol $g5745$;
    private static SubLSymbol $g5746$;
    private static SubLSymbol $g5747$;
    private static SubLSymbol $g5748$;
    private static SubLSymbol $g5749$;
    private static SubLSymbol $g5750$;
    private static SubLSymbol $g5751$;
    private static SubLSymbol $g5752$;
    private static SubLSymbol $g5753$;
    private static SubLSymbol $g5754$;
    private static SubLSymbol $g5756$;
    private static final SubLString $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLString $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLString $ic8$;
    private static final SubLList $ic9$;
    private static final SubLList $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLString $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLObject $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLString $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLString $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLString $ic26$;
    private static final SubLObject $ic27$;
    private static final SubLString $ic28$;
    private static final SubLString $ic29$;
    private static final SubLString $ic30$;
    private static final SubLObject $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLObject $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLObject $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLInteger $ic49$;
    private static final SubLList $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLList $ic55$;
    private static final SubLList $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLInteger $ic62$;
    private static final SubLList $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLObject $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLInteger $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLObject $ic80$;
    private static final SubLObject $ic81$;
    private static final SubLObject $ic82$;
    private static final SubLString $ic83$;
    private static final SubLObject $ic84$;
    private static final SubLString $ic85$;
    private static final SubLObject $ic86$;
    private static final SubLObject $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLObject $ic90$;
    private static final SubLString $ic91$;
    private static final SubLObject $ic92$;
    private static final SubLString $ic93$;
    private static final SubLObject $ic94$;
    private static final SubLObject $ic95$;
    private static final SubLObject $ic96$;
    private static final SubLString $ic97$;
    private static final SubLObject $ic98$;
    private static final SubLString $ic99$;
    private static final SubLObject $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLObject $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLObject $ic106$;
    private static final SubLObject $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLObject $ic109$;
    private static final SubLObject $ic110$;
    private static final SubLObject $ic111$;
    private static final SubLObject $ic112$;
    private static final SubLObject $ic113$;
    private static final SubLObject $ic114$;
    private static final SubLObject $ic115$;
    private static final SubLInteger $ic116$;
    private static final SubLObject $ic117$;
    private static final SubLObject $ic118$;
    private static final SubLList $ic119$;
    private static final SubLList $ic120$;
    private static final SubLObject $ic121$;
    private static final SubLObject $ic122$;
    private static final SubLObject $ic123$;
    private static final SubLObject $ic124$;
    private static final SubLObject $ic125$;
    private static final SubLObject $ic126$;
    private static final SubLObject $ic127$;
    private static final SubLObject $ic128$;
    private static final SubLObject $ic129$;
    private static final SubLString $ic130$;
    private static final SubLString $ic131$;
    private static final SubLList $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLObject $ic134$;
    private static final SubLList $ic135$;
    private static final SubLString $ic136$;
    private static final SubLString $ic137$;
    private static final SubLInteger $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLString $ic140$;
    private static final SubLString $ic141$;
    private static final SubLString $ic142$;
    private static final SubLString $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLString $ic145$;
    private static final SubLString $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLString $ic149$;
    private static final SubLList $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLString $ic152$;
    
    public static SubLObject f44559() {
        if (NIL == $g5741$.getGlobalValue()) {
            $g5741$.setGlobalValue(constants_high_oc.f10746(Guids.string_to_guid((SubLObject)$ic3$)));
        }
        return $g5741$.getGlobalValue();
    }
    
    public static SubLObject f44560(final SubLObject var1, SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var2 == UNPROVIDED) {
            var2 = module0584.$g4389$.getDynamicValue();
        }
        if (var3 == UNPROVIDED) {
            var3 = module0584.$g4396$.getDynamicValue();
        }
        if (var4 == UNPROVIDED) {
            var4 = module0584.$g4390$.getDynamicValue();
        }
        assert NIL != Types.stringp(var1) : var1;
        assert NIL != module0584.f35771(var4) : var4;
        SubLObject var5 = module0738.f45743(var1, var2, var3, (SubLObject)UNPROVIDED);
        if (NIL != module0731.f44731(var5, var4)) {
            var5 = module0279.f18561(ConsesLow.append(var5, module0788.f50497(var1)));
        }
        return var5;
    }
    
    public static SubLObject f44561(final SubLObject var6, SubLObject var7, SubLObject var8, SubLObject var9) {
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)$ic11$;
        }
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)NIL;
        }
        if (var9 == UNPROVIDED) {
            var9 = module0584.$g4396$.getDynamicValue();
        }
        final SubLThread var10 = SubLProcess.currentSubLThread();
        assert NIL != module0731.f44719(var6) : var6;
        SubLObject var11 = (SubLObject)NIL;
        final SubLObject var12 = $g5743$.currentBinding(var10);
        try {
            $g5743$.bind((SubLObject)NIL, var10);
            var11 = f44562(var6, var7, var8, var9, (SubLObject)UNPROVIDED);
        }
        finally {
            $g5743$.rebind(var12, var10);
        }
        return var11;
    }
    
    public static SubLObject f44563(final SubLObject var6, SubLObject var7, SubLObject var8, SubLObject var9) {
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)$ic11$;
        }
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)NIL;
        }
        if (var9 == UNPROVIDED) {
            var9 = module0584.$g4396$.getDynamicValue();
        }
        final SubLThread var10 = SubLProcess.currentSubLThread();
        assert NIL != module0731.f44719(var6) : var6;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        final SubLObject var13 = $g5743$.currentBinding(var10);
        try {
            $g5743$.bind((SubLObject)T, var10);
            var10.resetMultipleValues();
            final SubLObject var14_15 = f44562(var6, var7, var8, var9, (SubLObject)UNPROVIDED);
            final SubLObject var16_17 = var10.secondMultipleValue();
            var10.resetMultipleValues();
            var11 = var14_15;
            var12 = var16_17;
        }
        finally {
            $g5743$.rebind(var13, var10);
        }
        return Values.values(var11, var12);
    }
    
    public static SubLObject f44564(final SubLObject var6, final SubLObject var13, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = module0584.f35776();
        }
        final SubLThread var19 = SubLProcess.currentSubLThread();
        assert NIL != module0731.f44719(var6) : var6;
        assert NIL != module0731.f44690(var13, (SubLObject)UNPROVIDED) : var13;
        SubLObject var20 = (SubLObject)NIL;
        SubLObject var21 = (SubLObject)NIL;
        final SubLObject var23;
        final SubLObject var22 = var23 = module0034.f1888();
        final SubLObject var24 = module0034.$g879$.currentBinding(var19);
        try {
            module0034.$g879$.bind(var23, var19);
            SubLObject var25 = (SubLObject)NIL;
            if (NIL != var23 && NIL == module0034.f1842(var23)) {
                var25 = module0034.f1869(var23);
                final SubLObject var26 = Threads.current_process();
                if (NIL == var25) {
                    module0034.f1873(var23, var26);
                }
                else if (!var25.eql(var26)) {
                    Errors.error((SubLObject)$ic14$);
                }
            }
            try {
                final SubLObject var12_25 = $g5743$.currentBinding(var19);
                try {
                    $g5743$.bind((SubLObject)NIL, var19);
                    var19.resetMultipleValues();
                    final SubLObject var26_27 = f44565(var6, var13, var18, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    final SubLObject var28_29 = var19.secondMultipleValue();
                    var19.resetMultipleValues();
                    var20 = var26_27;
                    var21 = var28_29;
                }
                finally {
                    $g5743$.rebind(var12_25, var19);
                }
            }
            finally {
                final SubLObject var12_26 = Threads.$is_thread_performing_cleanupP$.currentBinding(var19);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var19);
                    if (NIL != var23 && NIL == var25) {
                        module0034.f1873(var23, (SubLObject)NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var12_26, var19);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var24, var19);
        }
        return Values.values(var20, var21);
    }
    
    public static SubLObject f44566(final SubLObject var6, final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        SubLObject var15 = (SubLObject)NIL;
        final SubLObject var16 = $g5745$.currentBinding(var14);
        try {
            $g5745$.bind((SubLObject)T, var14);
            var15 = f44564(var6, var13, module0147.f9552((SubLObject)UNPROVIDED));
        }
        finally {
            $g5745$.rebind(var16, var14);
        }
        return var15;
    }
    
    public static SubLObject f44567(final SubLObject var6, final SubLObject var13, SubLObject var9) {
        if (var9 == UNPROVIDED) {
            var9 = module0584.$g4396$.getDynamicValue();
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        assert NIL != module0731.f44719(var6) : var6;
        assert NIL != module0731.f44690(var13, (SubLObject)UNPROVIDED) : var13;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        final SubLObject var18;
        final SubLObject var17 = var18 = module0034.f1888();
        final SubLObject var19 = module0034.$g879$.currentBinding(var14);
        try {
            module0034.$g879$.bind(var18, var14);
            SubLObject var20 = (SubLObject)NIL;
            if (NIL != var18 && NIL == module0034.f1842(var18)) {
                var20 = module0034.f1869(var18);
                final SubLObject var21 = Threads.current_process();
                if (NIL == var20) {
                    module0034.f1873(var18, var21);
                }
                else if (!var20.eql(var21)) {
                    Errors.error((SubLObject)$ic14$);
                }
            }
            try {
                final SubLObject var12_33 = $g5743$.currentBinding(var14);
                try {
                    $g5743$.bind((SubLObject)T, var14);
                    final SubLObject var22 = var9;
                    final SubLObject var12_34 = module0147.$g2095$.currentBinding(var14);
                    final SubLObject var23 = module0147.$g2094$.currentBinding(var14);
                    final SubLObject var24 = module0147.$g2096$.currentBinding(var14);
                    try {
                        module0147.$g2095$.bind(module0147.f9545(var22), var14);
                        module0147.$g2094$.bind(module0147.f9546(var22), var14);
                        module0147.$g2096$.bind(module0147.f9549(var22), var14);
                        var14.resetMultipleValues();
                        final SubLObject var38_39 = f44565(var6, var13, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        final SubLObject var40_41 = var14.secondMultipleValue();
                        var14.resetMultipleValues();
                        var15 = var38_39;
                        var16 = var40_41;
                    }
                    finally {
                        module0147.$g2096$.rebind(var24, var14);
                        module0147.$g2094$.rebind(var23, var14);
                        module0147.$g2095$.rebind(var12_34, var14);
                    }
                }
                finally {
                    $g5743$.rebind(var12_33, var14);
                }
            }
            finally {
                final SubLObject var12_35 = Threads.$is_thread_performing_cleanupP$.currentBinding(var14);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var14);
                    if (NIL != var18 && NIL == var20) {
                        module0034.f1873(var18, (SubLObject)NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var12_35, var14);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var19, var14);
        }
        return Values.values(var15, var16);
    }
    
    public static SubLObject f44568(final SubLObject var43, final SubLObject var44, final SubLObject var45, SubLObject var9) {
        if (var9 == UNPROVIDED) {
            var9 = module0584.$g4396$.getDynamicValue();
        }
        final SubLObject var46 = module0078.f5369(var45, (SubLObject)UNPROVIDED);
        return f44569(var43, var44, var9, var46);
    }
    
    public static SubLObject f44569(final SubLObject var43, final SubLObject var13, final SubLObject var9, final SubLObject var46) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        SubLObject var48 = (SubLObject)NIL;
        SubLObject var49 = (SubLObject)NIL;
        if (NIL != module0731.f44695(var13, var9) && NIL == var49) {
            final SubLObject var50 = (SubLObject)$ic17$;
            final SubLObject var51 = module0056.f4145(var50);
            SubLObject var52 = (SubLObject)NIL;
            final SubLObject var53 = module0139.$g1635$.currentBinding(var47);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var47);
                final SubLObject var12_53 = module0147.$g2095$.currentBinding(var47);
                final SubLObject var54 = module0147.$g2094$.currentBinding(var47);
                final SubLObject var55 = module0147.$g2096$.currentBinding(var47);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var9), var47);
                    module0147.$g2094$.bind(module0147.f9546(var9), var47);
                    module0147.$g2096$.bind(module0147.f9549(var9), var47);
                    final SubLObject var56 = $ic18$;
                    final SubLObject var12_54 = module0141.$g1714$.currentBinding(var47);
                    final SubLObject var36_56 = module0141.$g1715$.currentBinding(var47);
                    try {
                        module0141.$g1714$.bind((NIL != var56) ? var56 : module0141.f9283(), var47);
                        module0141.$g1715$.bind((SubLObject)((NIL != var56) ? $ic19$ : module0141.$g1715$.getDynamicValue(var47)), var47);
                        if (NIL != var56 && NIL != module0136.f8864() && NIL == module0141.f9279(var56)) {
                            final SubLObject var57 = module0136.$g1591$.getDynamicValue(var47);
                            if (var57.eql((SubLObject)$ic20$)) {
                                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic21$, var56, (SubLObject)$ic22$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var57.eql((SubLObject)$ic23$)) {
                                module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic24$, (SubLObject)$ic21$, var56, (SubLObject)$ic22$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var57.eql((SubLObject)$ic25$)) {
                                Errors.warn((SubLObject)$ic21$, var56, (SubLObject)$ic22$);
                            }
                            else {
                                Errors.warn((SubLObject)$ic26$, module0136.$g1591$.getDynamicValue(var47));
                                Errors.cerror((SubLObject)$ic24$, (SubLObject)$ic21$, var56, (SubLObject)$ic22$);
                            }
                        }
                        final SubLObject var12_55 = module0141.$g1670$.currentBinding(var47);
                        final SubLObject var36_57 = module0141.$g1671$.currentBinding(var47);
                        final SubLObject var37_60 = module0141.$g1672$.currentBinding(var47);
                        final SubLObject var58 = module0141.$g1674$.currentBinding(var47);
                        final SubLObject var59 = module0137.$g1605$.currentBinding(var47);
                        try {
                            module0141.$g1670$.bind(module0137.f8955($ic27$), var47);
                            module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic27$)), var47);
                            module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic27$)), var47);
                            module0141.$g1674$.bind((SubLObject)NIL, var47);
                            module0137.$g1605$.bind(module0137.f8955($ic27$), var47);
                            if (NIL != module0136.f8865() || NIL != module0244.f15795(var13, module0137.f8955((SubLObject)UNPROVIDED))) {
                                final SubLObject var12_56 = module0141.$g1677$.currentBinding(var47);
                                final SubLObject var36_58 = module0138.$g1619$.currentBinding(var47);
                                final SubLObject var37_61 = module0141.$g1674$.currentBinding(var47);
                                try {
                                    module0141.$g1677$.bind(module0141.f9210(), var47);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955($ic27$)), var47);
                                    module0141.$g1674$.bind((SubLObject)NIL, var47);
                                    module0249.f16055(var13, (SubLObject)UNPROVIDED);
                                    for (var52 = (SubLObject)ConsesLow.list(var13, module0141.f9195()); NIL != var52 && NIL == var49; var52 = module0056.f4150(var51)) {
                                        final SubLObject var49_66 = var52.first();
                                        final SubLObject var60 = conses_high.second(var52);
                                        final SubLObject var61 = var49_66;
                                        final SubLObject var12_57 = module0141.$g1674$.currentBinding(var47);
                                        try {
                                            module0141.$g1674$.bind(var60, var47);
                                            if (NIL != module0250.f16115(module0141.f9190(), var49_66)) {
                                                var49 = f44570(var43, var61, var9);
                                            }
                                            final SubLObject var62 = module0200.f12443(module0137.f8955($ic27$));
                                            SubLObject var63;
                                            SubLObject var64;
                                            SubLObject var12_58;
                                            SubLObject var36_59;
                                            SubLObject var65;
                                            SubLObject var66;
                                            SubLObject var67;
                                            SubLObject var68;
                                            SubLObject var79_80;
                                            SubLObject var69;
                                            SubLObject var12_59;
                                            SubLObject var78_83;
                                            SubLObject var70;
                                            SubLObject var71;
                                            SubLObject var12_60;
                                            SubLObject var72;
                                            SubLObject var73;
                                            SubLObject var74;
                                            SubLObject var75;
                                            SubLObject var76;
                                            SubLObject var77;
                                            SubLObject var78;
                                            SubLObject var79;
                                            SubLObject var71_94;
                                            SubLObject var80;
                                            SubLObject var12_61;
                                            SubLObject var82;
                                            SubLObject var81;
                                            SubLObject var83;
                                            SubLObject var84;
                                            SubLObject var85;
                                            SubLObject var86;
                                            SubLObject var87;
                                            SubLObject var88;
                                            for (var63 = (SubLObject)NIL, var63 = var62; NIL == var49 && NIL != var63; var63 = var63.rest()) {
                                                var64 = var63.first();
                                                var12_58 = module0137.$g1605$.currentBinding(var47);
                                                var36_59 = module0141.$g1674$.currentBinding(var47);
                                                try {
                                                    module0137.$g1605$.bind(var64, var47);
                                                    module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var47)) : module0141.$g1674$.getDynamicValue(var47)), var47);
                                                    var65 = module0228.f15229(var49_66);
                                                    if (NIL != module0138.f8992(var65)) {
                                                        var66 = module0242.f15664(var65, module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var66) {
                                                            var67 = module0245.f15834(var66, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                            if (NIL != var67) {
                                                                for (var68 = module0066.f4838(module0067.f4891(var67)); NIL == var49 && NIL == module0066.f4841(var68); var68 = module0066.f4840(var68)) {
                                                                    var47.resetMultipleValues();
                                                                    var79_80 = module0066.f4839(var68);
                                                                    var69 = var47.secondMultipleValue();
                                                                    var47.resetMultipleValues();
                                                                    if (NIL != module0147.f9507(var79_80)) {
                                                                        var12_59 = module0138.$g1623$.currentBinding(var47);
                                                                        try {
                                                                            module0138.$g1623$.bind(var79_80, var47);
                                                                            for (var78_83 = module0066.f4838(module0067.f4891(var69)); NIL == var49 && NIL == module0066.f4841(var78_83); var78_83 = module0066.f4840(var78_83)) {
                                                                                var47.resetMultipleValues();
                                                                                var70 = module0066.f4839(var78_83);
                                                                                var71 = var47.secondMultipleValue();
                                                                                var47.resetMultipleValues();
                                                                                if (NIL != module0141.f9289(var70)) {
                                                                                    var12_60 = module0138.$g1624$.currentBinding(var47);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var70, var47);
                                                                                        var72 = var71;
                                                                                        if (NIL != module0077.f5302(var72)) {
                                                                                            var73 = module0077.f5333(var72);
                                                                                            for (var74 = module0032.f1741(var73), var75 = (SubLObject)NIL, var75 = module0032.f1742(var74, var73); NIL == var49 && NIL == module0032.f1744(var74, var75); var75 = module0032.f1743(var75)) {
                                                                                                var76 = module0032.f1745(var74, var75);
                                                                                                if (NIL != module0032.f1746(var75, var76) && NIL == module0249.f16059(var76, (SubLObject)UNPROVIDED)) {
                                                                                                    module0249.f16055(var76, (SubLObject)UNPROVIDED);
                                                                                                    module0056.f4149((SubLObject)ConsesLow.list(var76, module0141.f9195()), var51);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var72.isList()) {
                                                                                            if (NIL == var49) {
                                                                                                var77 = var72;
                                                                                                var78 = (SubLObject)NIL;
                                                                                                var78 = var77.first();
                                                                                                while (NIL == var49 && NIL != var77) {
                                                                                                    if (NIL == module0249.f16059(var78, (SubLObject)UNPROVIDED)) {
                                                                                                        module0249.f16055(var78, (SubLObject)UNPROVIDED);
                                                                                                        module0056.f4149((SubLObject)ConsesLow.list(var78, module0141.f9195()), var51);
                                                                                                    }
                                                                                                    var77 = var77.rest();
                                                                                                    var78 = var77.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)$ic28$, var72);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var12_60, var47);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var78_83);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var12_59, var47);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var68);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic29$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                        }
                                                    }
                                                    else if (NIL != module0155.f9785(var65, (SubLObject)UNPROVIDED)) {
                                                        var79 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var47), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var47), module0137.f8955((SubLObject)UNPROVIDED)));
                                                        for (var71_94 = (SubLObject)NIL, var71_94 = var79; NIL == var49 && NIL != var71_94; var71_94 = var71_94.rest()) {
                                                            var80 = var71_94.first();
                                                            var12_61 = module0138.$g1625$.currentBinding(var47);
                                                            try {
                                                                module0138.$g1625$.bind(var80, var47);
                                                                var81 = (var82 = Functions.funcall(var80, var65));
                                                                if (NIL != module0077.f5302(var82)) {
                                                                    var83 = module0077.f5333(var82);
                                                                    for (var84 = module0032.f1741(var83), var85 = (SubLObject)NIL, var85 = module0032.f1742(var84, var83); NIL == var49 && NIL == module0032.f1744(var84, var85); var85 = module0032.f1743(var85)) {
                                                                        var86 = module0032.f1745(var84, var85);
                                                                        if (NIL != module0032.f1746(var85, var86) && NIL == module0249.f16059(var86, (SubLObject)UNPROVIDED)) {
                                                                            module0249.f16055(var86, (SubLObject)UNPROVIDED);
                                                                            module0056.f4149((SubLObject)ConsesLow.list(var86, module0141.f9195()), var51);
                                                                        }
                                                                    }
                                                                }
                                                                else if (var82.isList()) {
                                                                    if (NIL == var49) {
                                                                        var87 = var82;
                                                                        var88 = (SubLObject)NIL;
                                                                        var88 = var87.first();
                                                                        while (NIL == var49 && NIL != var87) {
                                                                            if (NIL == module0249.f16059(var88, (SubLObject)UNPROVIDED)) {
                                                                                module0249.f16055(var88, (SubLObject)UNPROVIDED);
                                                                                module0056.f4149((SubLObject)ConsesLow.list(var88, module0141.f9195()), var51);
                                                                            }
                                                                            var87 = var87.rest();
                                                                            var88 = var87.first();
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)$ic28$, var82);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var12_61, var47);
                                                            }
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var36_59, var47);
                                                    module0137.$g1605$.rebind(var12_58, var47);
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var12_57, var47);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var37_61, var47);
                                    module0138.$g1619$.rebind(var36_58, var47);
                                    module0141.$g1677$.rebind(var12_56, var47);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic30$, var13, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var59, var47);
                            module0141.$g1674$.rebind(var58, var47);
                            module0141.$g1672$.rebind(var37_60, var47);
                            module0141.$g1671$.rebind(var36_57, var47);
                            module0141.$g1670$.rebind(var12_55, var47);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var36_56, var47);
                        module0141.$g1714$.rebind(var12_54, var47);
                    }
                }
                finally {
                    module0147.$g2096$.rebind(var55, var47);
                    module0147.$g2094$.rebind(var54, var47);
                    module0147.$g2095$.rebind(var12_53, var47);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var47));
            }
            finally {
                module0139.$g1635$.rebind(var53, var47);
            }
        }
        if (NIL == var49) {
            module0077.f5326(var13, var46);
            if (NIL == var48) {
                SubLObject var89 = module0220.f14566(var13, $ic31$, var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                SubLObject var90 = (SubLObject)NIL;
                var90 = var89.first();
                while (NIL == var48 && NIL != var89) {
                    var48 = (SubLObject)makeBoolean(NIL == module0731.f44695(var90, (SubLObject)UNPROVIDED) || NIL != module0077.f5320(var90, var46) || NIL != f44569(var43, var90, var9, var46));
                    module0077.f5326(var90, var46);
                    var89 = var89.rest();
                    var90 = var89.first();
                }
            }
        }
        return var48;
    }
    
    public static SubLObject f44570(final SubLObject var43, final SubLObject var13, final SubLObject var9) {
        return module0220.f14548(var43, var13, var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f44571(final SubLObject var43, final SubLObject var13, SubLObject var9) {
        if (var9 == UNPROVIDED) {
            var9 = module0584.$g4396$.getDynamicValue();
        }
        final SubLThread var44 = SubLProcess.currentSubLThread();
        assert NIL != module0731.f44719(var43) : var43;
        assert NIL != module0731.f44690(var13, (SubLObject)UNPROVIDED) : var13;
        SubLObject var45 = (SubLObject)NIL;
        final SubLObject var46 = $g5743$.currentBinding(var44);
        try {
            $g5743$.bind((SubLObject)T, var44);
            var45 = f44572(var43, var13, var9);
        }
        finally {
            $g5743$.rebind(var46, var44);
        }
        return var45;
    }
    
    public static SubLObject f44573(final SubLObject var43, final SubLObject var13, SubLObject var9) {
        if (var9 == UNPROVIDED) {
            var9 = module0584.$g4396$.getDynamicValue();
        }
        final SubLThread var44 = SubLProcess.currentSubLThread();
        assert NIL != module0731.f44719(var43) : var43;
        assert NIL != module0731.f44690(var13, (SubLObject)UNPROVIDED) : var13;
        SubLObject var45 = (SubLObject)NIL;
        final SubLObject var46 = $g5743$.currentBinding(var44);
        try {
            $g5743$.bind((SubLObject)NIL, var44);
            var45 = f44572(var43, var13, var9);
        }
        finally {
            $g5743$.rebind(var46, var44);
        }
        return var45;
    }
    
    public static SubLObject f44574(final SubLObject var6, final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        assert NIL != Types.listp(var7) : var7;
        SubLObject var9 = (SubLObject)NIL;
        final SubLObject var10 = $g5745$.currentBinding(var8);
        try {
            $g5745$.bind((SubLObject)T, var8);
            var9 = f44561(var6, var7, (SubLObject)NIL, (SubLObject)NIL);
        }
        finally {
            $g5745$.rebind(var10, var8);
        }
        return var9;
    }
    
    public static SubLObject f44575(final SubLObject var6, SubLObject var7, SubLObject var8, SubLObject var3) {
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)$ic11$;
        }
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = module0584.$g4396$.getDynamicValue();
        }
        final SubLThread var9 = SubLProcess.currentSubLThread();
        SubLObject var10 = (SubLObject)NIL;
        final SubLObject var11 = (SubLObject)T;
        final SubLObject var12 = $g5743$.currentBinding(var9);
        try {
            $g5743$.bind((SubLObject)NIL, var9);
            var10 = f44562(var6, var7, var8, var3, var11);
        }
        finally {
            $g5743$.rebind(var12, var9);
        }
        return var10;
    }
    
    public static SubLObject f44562(SubLObject var6, final SubLObject var7, final SubLObject var8, SubLObject var9, SubLObject var98) {
        if (var9 == UNPROVIDED) {
            var9 = module0584.$g4396$.getDynamicValue();
        }
        if (var98 == UNPROVIDED) {
            var98 = $g5746$.getDynamicValue();
        }
        final SubLThread var99 = SubLProcess.currentSubLThread();
        if (NIL != module0202.f12659(var6)) {
            final SubLObject var100 = module0172.f10921(var6);
            var6 = ((NIL != var100) ? var100 : var6);
        }
        if (NIL != module0173.f10955(var6) && NIL == module0731.f44764(var6, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        final SubLObject var101 = (var7 == $ic11$) ? module0731.f44657() : var7;
        final SubLObject var102 = (NIL != var98 || NIL == $g5743$.getDynamicValue(var99)) ? var101 : Sort.sort(f44576(conses_high.copy_list(var101), var8), (SubLObject)$ic33$, (SubLObject)UNPROVIDED);
        SubLObject var103 = (SubLObject)NIL;
        SubLObject var104 = (SubLObject)NIL;
        final SubLObject var105 = $g5747$.currentBinding(var99);
        try {
            $g5747$.bind((SubLObject)T, var99);
            final SubLObject var107;
            final SubLObject var106 = var107 = module0034.f1888();
            final SubLObject var12_104 = module0034.$g879$.currentBinding(var99);
            try {
                module0034.$g879$.bind(var107, var99);
                SubLObject var108 = (SubLObject)NIL;
                if (NIL != var107 && NIL == module0034.f1842(var107)) {
                    var108 = module0034.f1869(var107);
                    final SubLObject var109 = Threads.current_process();
                    if (NIL == var108) {
                        module0034.f1873(var107, var109);
                    }
                    else if (!var108.eql(var109)) {
                        Errors.error((SubLObject)$ic14$);
                    }
                }
                try {
                    final SubLObject var110 = var9;
                    final SubLObject var12_105 = module0147.$g2095$.currentBinding(var99);
                    final SubLObject var111 = module0147.$g2094$.currentBinding(var99);
                    final SubLObject var112 = module0147.$g2096$.currentBinding(var99);
                    try {
                        module0147.$g2095$.bind(module0147.f9545(var110), var99);
                        module0147.$g2094$.bind(module0147.f9546(var110), var99);
                        module0147.$g2096$.bind(module0147.f9549(var110), var99);
                        if (NIL == var104) {
                            SubLObject var113 = var102;
                            SubLObject var114 = (SubLObject)NIL;
                            var114 = var113.first();
                            while (NIL == var104 && NIL != var113) {
                                if (NIL != module0731.f44690(var114, (SubLObject)UNPROVIDED)) {
                                    final SubLObject var115 = f44565(var6, var114, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    if (NIL != var115) {
                                        var103 = ConsesLow.append(var103, var115);
                                        var104 = $g5743$.getDynamicValue(var99);
                                    }
                                }
                                var113 = var113.rest();
                                var114 = var113.first();
                            }
                        }
                        if (var7 == $ic11$ && NIL == var104 && NIL == var104) {
                            SubLObject var113 = module0731.f44743(var6, module0584.$g4389$.getDynamicValue(var99), var9);
                            SubLObject var116 = (SubLObject)NIL;
                            var116 = var113.first();
                            while (NIL == var104 && NIL != var113) {
                                if (NIL == module0004.f104(var116, var103, $g5742$.getGlobalValue(), (SubLObject)$ic34$)) {
                                    var103 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var116, module0584.$g4425$.getGlobalValue()), var103);
                                    var104 = $g5743$.getDynamicValue(var99);
                                }
                                var113 = var113.rest();
                                var116 = var113.first();
                            }
                        }
                    }
                    finally {
                        module0147.$g2096$.rebind(var112, var99);
                        module0147.$g2094$.rebind(var111, var99);
                        module0147.$g2095$.rebind(var12_105, var99);
                    }
                }
                finally {
                    final SubLObject var12_106 = Threads.$is_thread_performing_cleanupP$.currentBinding(var99);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var99);
                        if (NIL != var107 && NIL == var108) {
                            module0034.f1873(var107, (SubLObject)NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var12_106, var99);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var12_104, var99);
            }
        }
        finally {
            $g5747$.rebind(var105, var99);
        }
        return f44577(var103, $g5743$.getDynamicValue(var99), $g5745$.getDynamicValue(var99), $g5747$.getDynamicValue(var99), var98);
    }
    
    public static SubLObject f44576(final SubLObject var7, final SubLObject var8) {
        if (NIL == var7) {
            return (SubLObject)NIL;
        }
        if (NIL == var8) {
            return var7;
        }
        return f44578(var7, var8);
    }
    
    public static SubLObject f44579() {
        final SubLObject var109 = $g5748$.getGlobalValue();
        if (NIL != var109) {
            module0034.f1818(var109);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44580(final SubLObject var7, final SubLObject var8) {
        return module0034.f1829($g5748$.getGlobalValue(), (SubLObject)ConsesLow.list(var7, var8), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f44581(final SubLObject var7, final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        SubLObject var10 = (SubLObject)NIL;
        final SubLObject var11 = module0147.$g2094$.currentBinding(var9);
        final SubLObject var12 = module0147.$g2095$.currentBinding(var9);
        try {
            module0147.$g2094$.bind((SubLObject)$ic36$, var9);
            module0147.$g2095$.bind(module0584.$g4396$.getDynamicValue(var9), var9);
            final SubLObject var13 = Sequences.delete_duplicates(module0035.f2119(Mapping.mapcar((SubLObject)$ic37$, var7)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var14 = (SubLObject)NIL;
            SubLObject var15 = var13;
            SubLObject var16 = (SubLObject)NIL;
            var16 = var15.first();
            while (NIL != var15) {
                if (NIL == module0731.f44683((SubLObject)ConsesLow.cons(var16, var8), (SubLObject)UNPROVIDED)) {
                    final SubLObject var17 = var16;
                    if (NIL == conses_high.member(var17, var14, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                        var14 = (SubLObject)ConsesLow.cons(var17, var14);
                    }
                }
                var15 = var15.rest();
                var16 = var15.first();
            }
            var10 = f44582(var14, (SubLObject)UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var12, var9);
            module0147.$g2094$.rebind(var11, var9);
        }
        return var10;
    }
    
    public static SubLObject f44578(final SubLObject var7, final SubLObject var8) {
        SubLObject var9 = $g5748$.getGlobalValue();
        if (NIL == var9) {
            var9 = module0034.f1934((SubLObject)$ic35$, (SubLObject)$ic38$, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)TWO_INTEGER, (SubLObject)SIXTEEN_INTEGER);
        }
        final SubLObject var10 = module0034.f1782(var7, var8);
        final SubLObject var11 = module0034.f1814(var9, var10, (SubLObject)UNPROVIDED);
        if (var11 != $ic39$) {
            SubLObject var12 = var11;
            SubLObject var13 = (SubLObject)NIL;
            var13 = var12.first();
            while (NIL != var12) {
                SubLObject var14 = var13.first();
                final SubLObject var15 = conses_high.second(var13);
                if (var7.equal(var14.first())) {
                    var14 = var14.rest();
                    if (NIL != var14 && NIL == var14.rest() && var8.equal(var14.first())) {
                        return module0034.f1959(var15);
                    }
                }
                var12 = var12.rest();
                var13 = var12.first();
            }
        }
        final SubLObject var16 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f44581(var7, var8)));
        module0034.f1836(var9, var10, var11, var16, (SubLObject)ConsesLow.list(var7, var8));
        return module0034.f1959(var16);
    }
    
    public static SubLObject f44582(final SubLObject var101, SubLObject var122) {
        if (var122 == UNPROVIDED) {
            var122 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        if (!var101.isList()) {
            return (SubLObject)NIL;
        }
        SubLObject var123 = (SubLObject)NIL;
        SubLObject var124 = var101;
        SubLObject var125 = (SubLObject)NIL;
        var125 = var124.first();
        while (NIL != var124) {
            final SubLObject var126 = Sequences.remove(var125, var101, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL == module0004.f104(Functions.funcall(var122, var125), var126, (SubLObject)$ic40$, var122)) {
                var123 = (SubLObject)ConsesLow.cons(var125, var123);
            }
            var124 = var124.rest();
            var125 = var124.first();
        }
        return var123;
    }
    
    public static SubLObject f44583() {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        return $g5750$.getDynamicValue(var10);
    }
    
    public static SubLObject f44584() {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        return Numbers.numLE(module0077.f5311($g5749$.getDynamicValue(var10)), (SubLObject)ONE_INTEGER);
    }
    
    public static SubLObject f44585(final SubLObject var13, final SubLObject var43, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = module0584.f35776();
        }
        final SubLThread var44 = SubLProcess.currentSubLThread();
        SubLObject var45 = (SubLObject)NIL;
        if (NIL != module0212.f13762(var43)) {
            if (NIL != module0147.f9491(var18, (SubLObject)$ic41$)) {
                final SubLObject var46 = module0147.$g2094$.currentBinding(var44);
                final SubLObject var47 = module0147.$g2095$.currentBinding(var44);
                try {
                    module0147.$g2094$.bind((SubLObject)$ic41$, var44);
                    module0147.$g2095$.bind($ic42$, var44);
                    if (NIL == var45) {
                        SubLObject var48 = f44586(var13, var18);
                        SubLObject var49 = (SubLObject)NIL;
                        var49 = var48.first();
                        while (NIL == var45 && NIL != var48) {
                            if (NIL != module0220.f14548(var43, var49, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                var45 = (SubLObject)T;
                            }
                            var48 = var48.rest();
                            var49 = var48.first();
                        }
                    }
                }
                finally {
                    module0147.$g2095$.rebind(var47, var44);
                    module0147.$g2094$.rebind(var46, var44);
                }
            }
            else if (NIL != module0147.f9491(var18, (SubLObject)$ic43$)) {
                final SubLObject var46 = module0147.$g2094$.currentBinding(var44);
                final SubLObject var47 = module0147.$g2095$.currentBinding(var44);
                try {
                    module0147.$g2094$.bind((SubLObject)$ic43$, var44);
                    module0147.$g2095$.bind($ic44$, var44);
                    if (NIL == var45) {
                        SubLObject var48 = f44586(var13, var18);
                        SubLObject var49 = (SubLObject)NIL;
                        var49 = var48.first();
                        while (NIL == var45 && NIL != var48) {
                            if (NIL != module0220.f14548(var43, var49, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                var45 = (SubLObject)T;
                            }
                            var48 = var48.rest();
                            var49 = var48.first();
                        }
                    }
                }
                finally {
                    module0147.$g2095$.rebind(var47, var44);
                    module0147.$g2094$.rebind(var46, var44);
                }
            }
            else if (NIL != module0161.f10488(var18)) {
                final SubLObject var46 = module0147.$g2094$.currentBinding(var44);
                final SubLObject var47 = module0147.$g2096$.currentBinding(var44);
                try {
                    module0147.$g2094$.bind((SubLObject)$ic45$, var44);
                    module0147.$g2096$.bind(module0161.f10522(var18), var44);
                    if (NIL == var45) {
                        SubLObject var48 = f44586(var13, var18);
                        SubLObject var49 = (SubLObject)NIL;
                        var49 = var48.first();
                        while (NIL == var45 && NIL != var48) {
                            if (NIL != module0220.f14548(var43, var49, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                var45 = (SubLObject)T;
                            }
                            var48 = var48.rest();
                            var49 = var48.first();
                        }
                    }
                }
                finally {
                    module0147.$g2096$.rebind(var47, var44);
                    module0147.$g2094$.rebind(var46, var44);
                }
            }
            else {
                final SubLObject var46 = module0147.$g2094$.currentBinding(var44);
                final SubLObject var47 = module0147.$g2095$.currentBinding(var44);
                try {
                    module0147.$g2094$.bind((SubLObject)$ic36$, var44);
                    module0147.$g2095$.bind(var18, var44);
                    if (NIL == var45) {
                        SubLObject var48 = f44586(var13, var18);
                        SubLObject var49 = (SubLObject)NIL;
                        var49 = var48.first();
                        while (NIL == var45 && NIL != var48) {
                            if (NIL != module0220.f14548(var43, var49, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                var45 = (SubLObject)T;
                            }
                            var48 = var48.rest();
                            var49 = var48.first();
                        }
                    }
                }
                finally {
                    module0147.$g2095$.rebind(var47, var44);
                    module0147.$g2094$.rebind(var46, var44);
                }
            }
        }
        return var45;
    }
    
    public static SubLObject f44587(final SubLObject var13, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = module0584.f35776();
        }
        final SubLThread var19 = SubLProcess.currentSubLThread();
        SubLObject var20 = (SubLObject)NIL;
        if (NIL != module0147.f9491(var18, (SubLObject)$ic41$)) {
            final SubLObject var21 = module0147.$g2094$.currentBinding(var19);
            final SubLObject var22 = module0147.$g2095$.currentBinding(var19);
            try {
                module0147.$g2094$.bind((SubLObject)$ic41$, var19);
                module0147.$g2095$.bind($ic42$, var19);
                var20 = Sort.sort(module0260.f17032(var13, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)$ic47$), (SubLObject)$ic48$);
            }
            finally {
                module0147.$g2095$.rebind(var22, var19);
                module0147.$g2094$.rebind(var21, var19);
            }
        }
        else if (NIL != module0147.f9491(var18, (SubLObject)$ic43$)) {
            final SubLObject var21 = module0147.$g2094$.currentBinding(var19);
            final SubLObject var22 = module0147.$g2095$.currentBinding(var19);
            try {
                module0147.$g2094$.bind((SubLObject)$ic43$, var19);
                module0147.$g2095$.bind($ic44$, var19);
                var20 = Sort.sort(module0260.f17032(var13, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)$ic47$), (SubLObject)$ic48$);
            }
            finally {
                module0147.$g2095$.rebind(var22, var19);
                module0147.$g2094$.rebind(var21, var19);
            }
        }
        else if (NIL != module0161.f10488(var18)) {
            final SubLObject var21 = module0147.$g2094$.currentBinding(var19);
            final SubLObject var22 = module0147.$g2096$.currentBinding(var19);
            try {
                module0147.$g2094$.bind((SubLObject)$ic45$, var19);
                module0147.$g2096$.bind(module0161.f10522(var18), var19);
                var20 = Sort.sort(module0260.f17032(var13, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)$ic47$), (SubLObject)$ic48$);
            }
            finally {
                module0147.$g2096$.rebind(var22, var19);
                module0147.$g2094$.rebind(var21, var19);
            }
        }
        else {
            final SubLObject var21 = module0147.$g2094$.currentBinding(var19);
            final SubLObject var22 = module0147.$g2095$.currentBinding(var19);
            try {
                module0147.$g2094$.bind((SubLObject)$ic36$, var19);
                module0147.$g2095$.bind(var18, var19);
                var20 = Sort.sort(module0260.f17032(var13, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)$ic47$), (SubLObject)$ic48$);
            }
            finally {
                module0147.$g2095$.rebind(var22, var19);
                module0147.$g2094$.rebind(var21, var19);
            }
        }
        return var20;
    }
    
    public static SubLObject f44586(final SubLObject var13, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = module0584.f35776();
        }
        final SubLThread var19 = SubLProcess.currentSubLThread();
        final SubLObject var20 = module0034.$g879$.getDynamicValue(var19);
        SubLObject var21 = (SubLObject)NIL;
        if (NIL == var20) {
            return f44587(var13, var18);
        }
        var21 = module0034.f1857(var20, (SubLObject)$ic46$, (SubLObject)UNPROVIDED);
        if (NIL == var21) {
            var21 = module0034.f1807(module0034.f1842(var20), (SubLObject)$ic46$, (SubLObject)TWO_INTEGER, (SubLObject)$ic49$, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var20, (SubLObject)$ic46$, var21);
        }
        final SubLObject var22 = module0034.f1782(var13, var18);
        final SubLObject var23 = module0034.f1814(var21, var22, (SubLObject)UNPROVIDED);
        if (var23 != $ic39$) {
            SubLObject var24 = var23;
            SubLObject var25 = (SubLObject)NIL;
            var25 = var24.first();
            while (NIL != var24) {
                SubLObject var26 = var25.first();
                final SubLObject var27 = conses_high.second(var25);
                if (var13.equal(var26.first())) {
                    var26 = var26.rest();
                    if (NIL != var26 && NIL == var26.rest() && var18.equal(var26.first())) {
                        return module0034.f1959(var27);
                    }
                }
                var24 = var24.rest();
                var25 = var24.first();
            }
        }
        final SubLObject var28 = Values.arg2(var19.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f44587(var13, var18)));
        module0034.f1836(var21, var22, var23, var28, (SubLObject)ConsesLow.list(var13, var18));
        return module0034.f1959(var28);
    }
    
    public static SubLObject f44588(final SubLObject var130, final SubLObject var131) {
        SubLObject var133;
        final SubLObject var132 = var133 = var130.rest();
        SubLObject var134 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var133, var132, (SubLObject)$ic50$);
        var134 = var133.first();
        final SubLObject var135;
        var133 = (var135 = var133.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic51$, (SubLObject)ConsesLow.list((SubLObject)$ic52$, reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)$ic53$, (SubLObject)ConsesLow.listS((SubLObject)$ic54$, var134, (SubLObject)$ic55$)), (SubLObject)$ic56$), reader.bq_cons((SubLObject)$ic57$, ConsesLow.append(var135, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic58$, (SubLObject)$ic53$, (SubLObject)ConsesLow.listS((SubLObject)$ic59$, var134, (SubLObject)$ic55$)))))));
    }
    
    public static SubLObject f44589(SubLObject var6, final SubLObject var13, SubLObject var18, SubLObject var136, SubLObject var137, SubLObject var138, SubLObject var98) {
        if (var18 == UNPROVIDED) {
            var18 = module0147.f9552((SubLObject)UNPROVIDED);
        }
        if (var136 == UNPROVIDED) {
            var136 = $g5743$.getDynamicValue();
        }
        if (var137 == UNPROVIDED) {
            var137 = $g5745$.getDynamicValue();
        }
        if (var138 == UNPROVIDED) {
            var138 = $g5747$.getDynamicValue();
        }
        if (var98 == UNPROVIDED) {
            var98 = $g5746$.getDynamicValue();
        }
        final SubLThread var139 = SubLProcess.currentSubLThread();
        if (NIL != module0202.f12659(var6)) {
            final SubLObject var140 = module0172.f10921(var6);
            var6 = ((NIL != var140) ? var140 : var6);
        }
        SubLObject var141 = (SubLObject)NIL;
        final SubLObject var142 = $g5747$.currentBinding(var139);
        final SubLObject var143 = module0148.$g2099$.currentBinding(var139);
        try {
            $g5747$.bind((SubLObject)T, var139);
            module0148.$g2099$.bind((SubLObject)$ic61$, var139);
            if (NIL != module0147.f9491(var18, (SubLObject)$ic41$)) {
                final SubLObject var12_139 = module0147.$g2094$.currentBinding(var139);
                final SubLObject var36_140 = module0147.$g2095$.currentBinding(var139);
                try {
                    module0147.$g2094$.bind((SubLObject)$ic41$, var139);
                    module0147.$g2095$.bind($ic42$, var139);
                    var141 = f44590(var6, var13, var18, var136, var137, $g5744$.getDynamicValue(var139), $g5742$.getGlobalValue());
                }
                finally {
                    module0147.$g2095$.rebind(var36_140, var139);
                    module0147.$g2094$.rebind(var12_139, var139);
                }
            }
            else if (NIL != module0147.f9491(var18, (SubLObject)$ic43$)) {
                final SubLObject var12_140 = module0147.$g2094$.currentBinding(var139);
                final SubLObject var36_141 = module0147.$g2095$.currentBinding(var139);
                try {
                    module0147.$g2094$.bind((SubLObject)$ic43$, var139);
                    module0147.$g2095$.bind($ic44$, var139);
                    var141 = f44590(var6, var13, var18, var136, var137, $g5744$.getDynamicValue(var139), $g5742$.getGlobalValue());
                }
                finally {
                    module0147.$g2095$.rebind(var36_141, var139);
                    module0147.$g2094$.rebind(var12_140, var139);
                }
            }
            else if (NIL != module0161.f10488(var18)) {
                final SubLObject var12_141 = module0147.$g2094$.currentBinding(var139);
                final SubLObject var36_142 = module0147.$g2096$.currentBinding(var139);
                try {
                    module0147.$g2094$.bind((SubLObject)$ic45$, var139);
                    module0147.$g2096$.bind(module0161.f10522(var18), var139);
                    var141 = f44590(var6, var13, var18, var136, var137, $g5744$.getDynamicValue(var139), $g5742$.getGlobalValue());
                }
                finally {
                    module0147.$g2096$.rebind(var36_142, var139);
                    module0147.$g2094$.rebind(var12_141, var139);
                }
            }
            else {
                final SubLObject var12_142 = module0147.$g2094$.currentBinding(var139);
                final SubLObject var36_143 = module0147.$g2095$.currentBinding(var139);
                try {
                    module0147.$g2094$.bind((SubLObject)$ic36$, var139);
                    module0147.$g2095$.bind(var18, var139);
                    var141 = f44590(var6, var13, var18, var136, var137, $g5744$.getDynamicValue(var139), $g5742$.getGlobalValue());
                }
                finally {
                    module0147.$g2095$.rebind(var36_143, var139);
                    module0147.$g2094$.rebind(var12_142, var139);
                }
            }
        }
        finally {
            module0148.$g2099$.rebind(var143, var139);
            $g5747$.rebind(var142, var139);
        }
        return f44577(var141, var136, var137, var138, var98);
    }
    
    public static SubLObject f44565(final SubLObject var6, final SubLObject var13, SubLObject var18, SubLObject var136, SubLObject var137, SubLObject var138, SubLObject var98) {
        if (var18 == UNPROVIDED) {
            var18 = module0147.f9552((SubLObject)UNPROVIDED);
        }
        if (var136 == UNPROVIDED) {
            var136 = $g5743$.getDynamicValue();
        }
        if (var137 == UNPROVIDED) {
            var137 = $g5745$.getDynamicValue();
        }
        if (var138 == UNPROVIDED) {
            var138 = $g5747$.getDynamicValue();
        }
        if (var98 == UNPROVIDED) {
            var98 = $g5746$.getDynamicValue();
        }
        final SubLThread var139 = SubLProcess.currentSubLThread();
        final SubLObject var140 = module0034.$g879$.getDynamicValue(var139);
        SubLObject var141 = (SubLObject)NIL;
        if (NIL == var140) {
            return f44589(var6, var13, var18, var136, var137, var138, var98);
        }
        var141 = module0034.f1857(var140, (SubLObject)$ic60$, (SubLObject)UNPROVIDED);
        if (NIL == var141) {
            var141 = module0034.f1807(module0034.f1842(var140), (SubLObject)$ic60$, (SubLObject)SEVEN_INTEGER, (SubLObject)$ic62$, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var140, (SubLObject)$ic60$, var141);
        }
        final SubLObject var142 = module0034.f1777(var6, var13, var18, var136, var137, var138, var98);
        final SubLObject var143 = module0034.f1814(var141, var142, (SubLObject)UNPROVIDED);
        if (var143 != $ic39$) {
            SubLObject var144 = var143;
            SubLObject var145 = (SubLObject)NIL;
            var145 = var144.first();
            while (NIL != var144) {
                SubLObject var146 = var145.first();
                final SubLObject var147 = conses_high.second(var145);
                if (var6.equal(var146.first())) {
                    var146 = var146.rest();
                    if (var13.equal(var146.first())) {
                        var146 = var146.rest();
                        if (var18.equal(var146.first())) {
                            var146 = var146.rest();
                            if (var136.equal(var146.first())) {
                                var146 = var146.rest();
                                if (var137.equal(var146.first())) {
                                    var146 = var146.rest();
                                    if (var138.equal(var146.first())) {
                                        var146 = var146.rest();
                                        if (NIL != var146 && NIL == var146.rest() && var98.equal(var146.first())) {
                                            return module0034.f1959(var147);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var144 = var144.rest();
                var145 = var144.first();
            }
        }
        final SubLObject var148 = Values.arg2(var139.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f44589(var6, var13, var18, var136, var137, var138, var98)));
        module0034.f1836(var141, var142, var143, var148, (SubLObject)ConsesLow.list(var6, var13, var18, var136, var137, var138, var98));
        return module0034.f1959(var148);
    }
    
    public static SubLObject f44591(final SubLObject var1, SubLObject var13, SubLObject var147) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        if (var147 == UNPROVIDED) {
            var147 = (SubLObject)NIL;
        }
        return ConsesLow.append((SubLObject)ConsesLow.list(var1, var13), var147);
    }
    
    public static SubLObject f44592(final SubLObject var148) {
        return var148.first();
    }
    
    public static SubLObject f44593(final SubLObject var148) {
        return conses_high.second(var148);
    }
    
    public static SubLObject f44594(final SubLObject var148) {
        return var148.rest().rest();
    }
    
    public static SubLObject f44595(final SubLObject var148) {
        SubLObject var149 = (SubLObject)NIL;
        SubLObject var150 = (SubLObject)NIL;
        SubLObject var151 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var148, var148, (SubLObject)$ic63$);
        var149 = var148.first();
        SubLObject var152 = var148.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var152, var148, (SubLObject)$ic63$);
        var150 = var152.first();
        var152 = (var151 = var152.rest());
        return (SubLObject)ConsesLow.cons(var149, var151);
    }
    
    public static SubLObject f44577(final SubLObject var102, SubLObject var136, SubLObject var137, SubLObject var138, SubLObject var98) {
        if (var136 == UNPROVIDED) {
            var136 = $g5743$.getDynamicValue();
        }
        if (var137 == UNPROVIDED) {
            var137 = $g5745$.getDynamicValue();
        }
        if (var138 == UNPROVIDED) {
            var138 = $g5747$.getDynamicValue();
        }
        if (var98 == UNPROVIDED) {
            var98 = (SubLObject)NIL;
        }
        if (NIL != var138) {
            return var102;
        }
        if (NIL != var136) {
            final SubLObject var139 = var102.first();
            return Values.values(f44592(var139), f44593(var139));
        }
        if (NIL != var137) {
            return Mapping.mapcar((SubLObject)$ic64$, var102);
        }
        SubLObject var140 = (SubLObject)NIL;
        SubLObject var141 = (SubLObject)NIL;
        SubLObject var142 = var102;
        SubLObject var143 = (SubLObject)NIL;
        var143 = var142.first();
        while (NIL != var142) {
            final SubLObject var144 = f44592(var143);
            if (NIL == module0004.f104(var144, var140, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
                var140 = (SubLObject)ConsesLow.cons(var144, var140);
                var141 = (SubLObject)ConsesLow.cons(f44593(var143), var141);
            }
            var142 = var142.rest();
            var143 = var142.first();
        }
        return (NIL != var98) ? Values.values(Sequences.nreverse(var140), Sequences.nreverse(var141)) : Values.values(var140, var141);
    }
    
    public static SubLObject f44590(final SubLObject var6, final SubLObject var13, final SubLObject var18, final SubLObject var136, final SubLObject var137, final SubLObject var155, final SubLObject var156) {
        final SubLThread var157 = SubLProcess.currentSubLThread();
        SubLObject var158 = (SubLObject)NIL;
        final SubLObject var159 = module0077.f5326((SubLObject)ConsesLow.list(var6, var13, var18), $g5749$.getDynamicValue(var157));
        final SubLObject var160 = $g5750$.currentBinding(var157);
        try {
            $g5750$.bind((SubLObject)makeBoolean(NIL != $g5750$.getDynamicValue(var157) || NIL == var159), var157);
            try {
                var158 = (SubLObject)((NIL != module0212.f13762(var6)) ? f44596(var6, var13, var18, var136, var137, var155, var156) : NIL);
            }
            finally {
                final SubLObject var12_158 = Threads.$is_thread_performing_cleanupP$.currentBinding(var157);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var157);
                    if (NIL != var159) {
                        module0077.f5327((SubLObject)ConsesLow.list(var6, var13, var18), $g5749$.getDynamicValue(var157));
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var12_158, var157);
                }
            }
        }
        finally {
            $g5750$.rebind(var160, var157);
        }
        var158 = Mapping.mapcar((SubLObject)$ic65$, var158);
        if (NIL == var136) {
            var158 = Sequences.delete_duplicates(var158, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var158 = f44597(var158);
            var158 = f44598(var158, var156);
        }
        return var158;
    }
    
    public static SubLObject f44599(final SubLObject var148) {
        return ConsesLow.rplaca(var148, module0209.f13552(var148.first()));
    }
    
    public static SubLObject f44600(final SubLObject var6, final SubLObject var13, final SubLObject var9, final SubLObject var136, final SubLObject var137) {
        final SubLObject var138 = (SubLObject)$ic66$;
        final SubLObject var139 = (SubLObject)$ic67$;
        final SubLObject var140 = (SubLObject)NIL;
        final SubLObject var141 = (SubLObject)ConsesLow.list((SubLObject)$ic68$, (SubLObject)THREE_INTEGER, (SubLObject)$ic69$, (SubLObject)((NIL != var136 || NIL == var140) ? ONE_INTEGER : NIL), (SubLObject)$ic70$, (SubLObject)$ic71$, (SubLObject)$ic72$, (SubLObject)((NIL != var137) ? $ic73$ : $ic74$));
        final SubLObject var142 = (SubLObject)ConsesLow.list($ic75$, (SubLObject)ConsesLow.list(var139, var6, var138), (SubLObject)ConsesLow.list($ic27$, var139, var13));
        final SubLObject var143 = module0409.f28506(var142, var9, var141);
        SubLObject var144 = (SubLObject)NIL;
        SubLObject var145 = var143;
        SubLObject var146 = (SubLObject)NIL;
        var146 = var145.first();
        while (NIL != var145) {
            final SubLObject var147 = (NIL != var137) ? var146.first() : var146;
            final SubLObject var148 = (SubLObject)((NIL != var137) ? conses_high.second(var146) : NIL);
            final SubLObject var149 = module0233.f15369(var138, var147);
            final SubLObject var150 = module0233.f15369(var139, var147);
            if (var149.isString() && NIL != var150) {
                var144 = (SubLObject)ConsesLow.cons(f44591(var149, var150, var148), var144);
            }
            var145 = var145.rest();
            var146 = var145.first();
        }
        return var144;
    }
    
    public static SubLObject f44596(final SubLObject var6, final SubLObject var13, final SubLObject var18, final SubLObject var136, final SubLObject var137, final SubLObject var155, final SubLObject var156) {
        final SubLThread var157 = SubLProcess.currentSubLThread();
        var157.resetMultipleValues();
        SubLObject var158 = f44601(var6, var13, var18, var136, var137, var155);
        SubLObject var159 = var157.secondMultipleValue();
        var157.resetMultipleValues();
        var159 = (SubLObject)makeBoolean(NIL != var159 || NIL != f44583());
        if (NIL == var159) {
            if (NIL != module0147.f9491(var18, (SubLObject)$ic41$)) {
                final SubLObject var160 = module0147.$g2094$.currentBinding(var157);
                final SubLObject var161 = module0147.$g2095$.currentBinding(var157);
                try {
                    module0147.$g2094$.bind((SubLObject)$ic41$, var157);
                    module0147.$g2095$.bind($ic42$, var157);
                    final SubLObject var162 = f44602(var6, var13, var18, var136, var137, var155, var156);
                    var158 = ConsesLow.append(var158, var162);
                }
                finally {
                    module0147.$g2095$.rebind(var161, var157);
                    module0147.$g2094$.rebind(var160, var157);
                }
            }
            else if (NIL != module0147.f9491(var18, (SubLObject)$ic43$)) {
                final SubLObject var160 = module0147.$g2094$.currentBinding(var157);
                final SubLObject var161 = module0147.$g2095$.currentBinding(var157);
                try {
                    module0147.$g2094$.bind((SubLObject)$ic43$, var157);
                    module0147.$g2095$.bind($ic44$, var157);
                    final SubLObject var162 = f44602(var6, var13, var18, var136, var137, var155, var156);
                    var158 = ConsesLow.append(var158, var162);
                }
                finally {
                    module0147.$g2095$.rebind(var161, var157);
                    module0147.$g2094$.rebind(var160, var157);
                }
            }
            else if (NIL != module0161.f10488(var18)) {
                final SubLObject var160 = module0147.$g2094$.currentBinding(var157);
                final SubLObject var161 = module0147.$g2096$.currentBinding(var157);
                try {
                    module0147.$g2094$.bind((SubLObject)$ic45$, var157);
                    module0147.$g2096$.bind(module0161.f10522(var18), var157);
                    final SubLObject var162 = f44602(var6, var13, var18, var136, var137, var155, var156);
                    var158 = ConsesLow.append(var158, var162);
                }
                finally {
                    module0147.$g2096$.rebind(var161, var157);
                    module0147.$g2094$.rebind(var160, var157);
                }
            }
            else {
                final SubLObject var160 = module0147.$g2094$.currentBinding(var157);
                final SubLObject var161 = module0147.$g2095$.currentBinding(var157);
                try {
                    module0147.$g2094$.bind((SubLObject)$ic36$, var157);
                    module0147.$g2095$.bind(var18, var157);
                    final SubLObject var162 = f44602(var6, var13, var18, var136, var137, var155, var156);
                    var158 = ConsesLow.append(var158, var162);
                }
                finally {
                    module0147.$g2095$.rebind(var161, var157);
                    module0147.$g2094$.rebind(var160, var157);
                }
            }
        }
        return var158;
    }
    
    public static SubLObject f44598(final SubLObject var102, final SubLObject var156) {
        return module0035.f2153(var102, var156, Symbols.symbol_function((SubLObject)$ic76$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f44603(final SubLObject var6, final SubLObject var13, final SubLObject var18, final SubLObject var136, final SubLObject var137, final SubLObject var155, final SubLObject var156) {
        final SubLThread var157 = SubLProcess.currentSubLThread();
        SubLObject var158 = (SubLObject)NIL;
        SubLObject var159 = (SubLObject)NIL;
        if (NIL != module0147.f9491(var18, (SubLObject)$ic41$)) {
            final SubLObject var160 = module0147.$g2094$.currentBinding(var157);
            final SubLObject var161 = module0147.$g2095$.currentBinding(var157);
            try {
                module0147.$g2094$.bind((SubLObject)$ic41$, var157);
                module0147.$g2095$.bind($ic42$, var157);
                final SubLObject var162 = f44604(var13, var6);
                if (NIL == var159) {
                    SubLObject var163 = var162;
                    SubLObject var164 = (SubLObject)NIL;
                    var164 = var163.first();
                    while (NIL == var159 && NIL != var163) {
                        if (NIL != module0731.f44690(var164, (SubLObject)UNPROVIDED)) {
                            SubLObject var165 = f44590(var6, var164, var18, var136, var137, var155, var156);
                            if (NIL != var165) {
                                if (NIL != $g5745$.getDynamicValue(var157) && NIL != f44584()) {
                                    SubLObject var166 = (SubLObject)NIL;
                                    SubLObject var167 = var165;
                                    SubLObject var168 = (SubLObject)NIL;
                                    var168 = var167.first();
                                    while (NIL != var167) {
                                        var166 = (SubLObject)ConsesLow.cons(f44591(f44592(var168), f44593(var168), (SubLObject)ConsesLow.cons(module0435.f30621(f44593(var168), var13), f44594(var168))), var166);
                                        var167 = var167.rest();
                                        var168 = var167.first();
                                    }
                                    var165 = Sequences.nreverse(var166);
                                }
                                if (NIL != var136) {
                                    var158 = var165;
                                    var159 = (SubLObject)T;
                                }
                                else {
                                    var158 = ConsesLow.append(var158, var165);
                                }
                            }
                        }
                        var163 = var163.rest();
                        var164 = var163.first();
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var161, var157);
                module0147.$g2094$.rebind(var160, var157);
            }
        }
        else if (NIL != module0147.f9491(var18, (SubLObject)$ic43$)) {
            final SubLObject var160 = module0147.$g2094$.currentBinding(var157);
            final SubLObject var161 = module0147.$g2095$.currentBinding(var157);
            try {
                module0147.$g2094$.bind((SubLObject)$ic43$, var157);
                module0147.$g2095$.bind($ic44$, var157);
                final SubLObject var162 = f44604(var13, var6);
                if (NIL == var159) {
                    SubLObject var163 = var162;
                    SubLObject var164 = (SubLObject)NIL;
                    var164 = var163.first();
                    while (NIL == var159 && NIL != var163) {
                        if (NIL != module0731.f44690(var164, (SubLObject)UNPROVIDED)) {
                            SubLObject var165 = f44590(var6, var164, var18, var136, var137, var155, var156);
                            if (NIL != var165) {
                                if (NIL != $g5745$.getDynamicValue(var157) && NIL != f44584()) {
                                    SubLObject var166 = (SubLObject)NIL;
                                    SubLObject var167 = var165;
                                    SubLObject var168 = (SubLObject)NIL;
                                    var168 = var167.first();
                                    while (NIL != var167) {
                                        var166 = (SubLObject)ConsesLow.cons(f44591(f44592(var168), f44593(var168), (SubLObject)ConsesLow.cons(module0435.f30621(f44593(var168), var13), f44594(var168))), var166);
                                        var167 = var167.rest();
                                        var168 = var167.first();
                                    }
                                    var165 = Sequences.nreverse(var166);
                                }
                                if (NIL != var136) {
                                    var158 = var165;
                                    var159 = (SubLObject)T;
                                }
                                else {
                                    var158 = ConsesLow.append(var158, var165);
                                }
                            }
                        }
                        var163 = var163.rest();
                        var164 = var163.first();
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var161, var157);
                module0147.$g2094$.rebind(var160, var157);
            }
        }
        else if (NIL != module0161.f10488(var18)) {
            final SubLObject var160 = module0147.$g2094$.currentBinding(var157);
            final SubLObject var161 = module0147.$g2096$.currentBinding(var157);
            try {
                module0147.$g2094$.bind((SubLObject)$ic45$, var157);
                module0147.$g2096$.bind(module0161.f10522(var18), var157);
                final SubLObject var162 = f44604(var13, var6);
                if (NIL == var159) {
                    SubLObject var163 = var162;
                    SubLObject var164 = (SubLObject)NIL;
                    var164 = var163.first();
                    while (NIL == var159 && NIL != var163) {
                        if (NIL != module0731.f44690(var164, (SubLObject)UNPROVIDED)) {
                            SubLObject var165 = f44590(var6, var164, var18, var136, var137, var155, var156);
                            if (NIL != var165) {
                                if (NIL != $g5745$.getDynamicValue(var157) && NIL != f44584()) {
                                    SubLObject var166 = (SubLObject)NIL;
                                    SubLObject var167 = var165;
                                    SubLObject var168 = (SubLObject)NIL;
                                    var168 = var167.first();
                                    while (NIL != var167) {
                                        var166 = (SubLObject)ConsesLow.cons(f44591(f44592(var168), f44593(var168), (SubLObject)ConsesLow.cons(module0435.f30621(f44593(var168), var13), f44594(var168))), var166);
                                        var167 = var167.rest();
                                        var168 = var167.first();
                                    }
                                    var165 = Sequences.nreverse(var166);
                                }
                                if (NIL != var136) {
                                    var158 = var165;
                                    var159 = (SubLObject)T;
                                }
                                else {
                                    var158 = ConsesLow.append(var158, var165);
                                }
                            }
                        }
                        var163 = var163.rest();
                        var164 = var163.first();
                    }
                }
            }
            finally {
                module0147.$g2096$.rebind(var161, var157);
                module0147.$g2094$.rebind(var160, var157);
            }
        }
        else {
            final SubLObject var160 = module0147.$g2094$.currentBinding(var157);
            final SubLObject var161 = module0147.$g2095$.currentBinding(var157);
            try {
                module0147.$g2094$.bind((SubLObject)$ic36$, var157);
                module0147.$g2095$.bind(var18, var157);
                final SubLObject var162 = f44604(var13, var6);
                if (NIL == var159) {
                    SubLObject var163 = var162;
                    SubLObject var164 = (SubLObject)NIL;
                    var164 = var163.first();
                    while (NIL == var159 && NIL != var163) {
                        if (NIL != module0731.f44690(var164, (SubLObject)UNPROVIDED)) {
                            SubLObject var165 = f44590(var6, var164, var18, var136, var137, var155, var156);
                            if (NIL != var165) {
                                if (NIL != $g5745$.getDynamicValue(var157) && NIL != f44584()) {
                                    SubLObject var166 = (SubLObject)NIL;
                                    SubLObject var167 = var165;
                                    SubLObject var168 = (SubLObject)NIL;
                                    var168 = var167.first();
                                    while (NIL != var167) {
                                        var166 = (SubLObject)ConsesLow.cons(f44591(f44592(var168), f44593(var168), (SubLObject)ConsesLow.cons(module0435.f30621(f44593(var168), var13), f44594(var168))), var166);
                                        var167 = var167.rest();
                                        var168 = var167.first();
                                    }
                                    var165 = Sequences.nreverse(var166);
                                }
                                if (NIL != var136) {
                                    var158 = var165;
                                    var159 = (SubLObject)T;
                                }
                                else {
                                    var158 = ConsesLow.append(var158, var165);
                                }
                            }
                        }
                        var163 = var163.rest();
                        var164 = var163.first();
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var161, var157);
                module0147.$g2094$.rebind(var160, var157);
            }
        }
        return var158;
    }
    
    public static SubLObject f44602(final SubLObject var6, final SubLObject var13, final SubLObject var18, final SubLObject var136, final SubLObject var137, final SubLObject var155, final SubLObject var156) {
        final SubLThread var157 = SubLProcess.currentSubLThread();
        final SubLObject var158 = module0034.$g879$.getDynamicValue(var157);
        SubLObject var159 = (SubLObject)NIL;
        if (NIL == var158) {
            return f44603(var6, var13, var18, var136, var137, var155, var156);
        }
        var159 = module0034.f1857(var158, (SubLObject)$ic77$, (SubLObject)UNPROVIDED);
        if (NIL == var159) {
            var159 = module0034.f1807(module0034.f1842(var158), (SubLObject)$ic77$, (SubLObject)SEVEN_INTEGER, (SubLObject)$ic78$, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var158, (SubLObject)$ic77$, var159);
        }
        final SubLObject var160 = module0034.f1777(var6, var13, var18, var136, var137, var155, var156);
        final SubLObject var161 = module0034.f1814(var159, var160, (SubLObject)UNPROVIDED);
        if (var161 != $ic39$) {
            SubLObject var162 = var161;
            SubLObject var163 = (SubLObject)NIL;
            var163 = var162.first();
            while (NIL != var162) {
                SubLObject var164 = var163.first();
                final SubLObject var165 = conses_high.second(var163);
                if (var6.equal(var164.first())) {
                    var164 = var164.rest();
                    if (var13.equal(var164.first())) {
                        var164 = var164.rest();
                        if (var18.equal(var164.first())) {
                            var164 = var164.rest();
                            if (var136.equal(var164.first())) {
                                var164 = var164.rest();
                                if (var137.equal(var164.first())) {
                                    var164 = var164.rest();
                                    if (var155.equal(var164.first())) {
                                        var164 = var164.rest();
                                        if (NIL != var164 && NIL == var164.rest() && var156.equal(var164.first())) {
                                            return module0034.f1959(var165);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var162 = var162.rest();
                var163 = var162.first();
            }
        }
        final SubLObject var166 = Values.arg2(var157.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f44603(var6, var13, var18, var136, var137, var155, var156)));
        module0034.f1836(var159, var160, var161, var166, (SubLObject)ConsesLow.list(var6, var13, var18, var136, var137, var155, var156));
        return module0034.f1959(var166);
    }
    
    public static SubLObject f44601(final SubLObject var6, final SubLObject var13, final SubLObject var18, final SubLObject var136, final SubLObject var137, final SubLObject var155) {
        final SubLThread var156 = SubLProcess.currentSubLThread();
        SubLObject var157 = (SubLObject)NIL;
        SubLObject var158 = (SubLObject)NIL;
        if (NIL != module0147.f9491(var18, (SubLObject)$ic41$)) {
            final SubLObject var159 = module0147.$g2094$.currentBinding(var156);
            final SubLObject var160 = module0147.$g2095$.currentBinding(var156);
            try {
                module0147.$g2094$.bind((SubLObject)$ic41$, var156);
                module0147.$g2095$.bind($ic42$, var156);
                SubLObject var161 = module0219.f14509(var6, (SubLObject)ONE_INTEGER, var13, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var161 = Sort.sort(var161, (SubLObject)$ic79$, (SubLObject)UNPROVIDED);
                if (NIL == var158) {
                    SubLObject var162 = var161;
                    SubLObject var163 = (SubLObject)NIL;
                    var163 = var162.first();
                    while (NIL == var158 && NIL != var162) {
                        final SubLObject var164 = module0178.f11335(var163);
                        final SubLObject var165 = (SubLObject)((NIL != var137) ? ConsesLow.list(var164, var13, var163) : ConsesLow.list(var164, var13));
                        var157 = (SubLObject)ConsesLow.cons(var165, var157);
                        if (NIL != var136) {
                            var158 = (SubLObject)T;
                        }
                        var162 = var162.rest();
                        var163 = var162.first();
                    }
                }
                var157 = Sequences.nreverse(var157);
                if (NIL == var158) {
                    if (NIL == var161 && NIL != var155) {
                        if (NIL == f44585(var13, var6, var18)) {
                            if (NIL != ((NIL != constant_handles_oc.f8463($ic80$, (SubLObject)UNPROVIDED)) ? module0731.f44702(var13, $ic80$, (SubLObject)UNPROVIDED) : makeBoolean(NIL != constant_handles_oc.f8463($ic81$, (SubLObject)UNPROVIDED) && NIL != module0731.f44702(var13, $ic81$, (SubLObject)UNPROVIDED))) && NIL != ((NIL != module0161.f10481(var18)) ? module0731.f44644(var18, $ic82$) : module0147.f9507($ic82$))) {
                                if (NIL == var158) {
                                    SubLObject var162 = f44565(var6, $ic84$, var18, var136, var137, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    SubLObject var166 = (SubLObject)NIL;
                                    var166 = var162.first();
                                    while (NIL == var158 && NIL != var162) {
                                        if (NIL != var166) {
                                            final SubLObject var167 = f44592(var166);
                                            final SubLObject var168 = Sequences.cconcatenate((SubLObject)$ic83$, var167);
                                            var157 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var168, var13), var157);
                                            var158 = var136;
                                        }
                                        var162 = var162.rest();
                                        var166 = var162.first();
                                    }
                                }
                            }
                            else if (NIL != constant_handles_oc.f8463(f44559(), (SubLObject)UNPROVIDED) && NIL != module0731.f44702(var13, f44559(), (SubLObject)UNPROVIDED) && NIL != ((NIL != module0161.f10481(var18)) ? module0731.f44644(var18, $ic82$) : module0147.f9507($ic82$))) {
                                final SubLObject var169 = f44605(var13);
                                if (var169.isString() && NIL == var158) {
                                    SubLObject var170 = f44565(var6, $ic86$, var18, var136, var137, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    SubLObject var171 = (SubLObject)NIL;
                                    var171 = var170.first();
                                    while (NIL == var158 && NIL != var170) {
                                        if (NIL != var171) {
                                            final SubLObject var172 = f44592(var171);
                                            final SubLObject var173 = Sequences.cconcatenate(var169, new SubLObject[] { $ic85$, var172 });
                                            var157 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var173, var13), var157);
                                            var158 = var136;
                                        }
                                        var170 = var170.rest();
                                        var171 = var170.first();
                                    }
                                }
                            }
                            else if (NIL != module0731.f44695(var13, (SubLObject)UNPROVIDED) && NIL == var158) {
                                SubLObject var162 = f44572(var6, var13, var18);
                                SubLObject var174 = (SubLObject)NIL;
                                var174 = var162.first();
                                while (NIL == var158 && NIL != var162) {
                                    if (NIL != var174) {
                                        var157 = (SubLObject)ConsesLow.cons(var174, var157);
                                        var158 = var136;
                                    }
                                    var162 = var162.rest();
                                    var174 = var162.first();
                                }
                            }
                        }
                    }
                }
                if (NIL == var158 && NIL != module0584.$g4402$.getDynamicValue(var156)) {
                    SubLObject var175 = (SubLObject)NIL;
                    final SubLObject var176 = $ic87$;
                    if (NIL != module0158.f10010(var6, (SubLObject)NIL, var176)) {
                        final SubLObject var177 = module0158.f10011(var6, (SubLObject)NIL, var176);
                        SubLObject var178 = (SubLObject)NIL;
                        final SubLObject var179 = (SubLObject)NIL;
                        while (NIL == var178) {
                            final SubLObject var180 = module0052.f3695(var177, var179);
                            final SubLObject var181 = (SubLObject)makeBoolean(!var179.eql(var180));
                            if (NIL != var181) {
                                SubLObject var182 = (SubLObject)NIL;
                                try {
                                    var182 = module0158.f10316(var180, (SubLObject)$ic88$, (SubLObject)$ic89$, (SubLObject)NIL);
                                    SubLObject var185_190 = (SubLObject)NIL;
                                    final SubLObject var186_191 = (SubLObject)NIL;
                                    while (NIL == var185_190) {
                                        final SubLObject var183 = module0052.f3695(var182, var186_191);
                                        final SubLObject var188_193 = (SubLObject)makeBoolean(!var186_191.eql(var183));
                                        if (NIL != var188_193) {
                                            final SubLObject var184 = module0178.f11335(var183);
                                            if (var184.eql(var13) || var184.eql(module0731.f44691(var13))) {
                                                var175 = (SubLObject)ConsesLow.cons(var183, var175);
                                            }
                                        }
                                        var185_190 = (SubLObject)makeBoolean(NIL == var188_193);
                                    }
                                }
                                finally {
                                    final SubLObject var12_195 = Threads.$is_thread_performing_cleanupP$.currentBinding(var156);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var156);
                                        if (NIL != var182) {
                                            module0158.f10319(var182);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var12_195, var156);
                                    }
                                }
                            }
                            var178 = (SubLObject)makeBoolean(NIL == var181);
                        }
                    }
                    var175 = Sort.sort(var175, (SubLObject)$ic79$, (SubLObject)UNPROVIDED);
                    if (NIL == var158) {
                        SubLObject var185 = var175;
                        SubLObject var186 = (SubLObject)NIL;
                        var186 = var185.first();
                        while (NIL == var158 && NIL != var185) {
                            final SubLObject var187 = (SubLObject)THREE_INTEGER;
                            final SubLObject var188 = module0178.f11331(var186, var187);
                            SubLObject var189 = (SubLObject)ConsesLow.list(var188, var13);
                            if (NIL != var137) {
                                var189 = ConsesLow.append(var189, (SubLObject)ConsesLow.list(var186));
                            }
                            var157 = (SubLObject)ConsesLow.cons(var189, var157);
                            if (NIL != var136) {
                                var158 = (SubLObject)T;
                            }
                            var185 = var185.rest();
                            var186 = var185.first();
                        }
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var160, var156);
                module0147.$g2094$.rebind(var159, var156);
            }
        }
        else if (NIL != module0147.f9491(var18, (SubLObject)$ic43$)) {
            final SubLObject var159 = module0147.$g2094$.currentBinding(var156);
            final SubLObject var160 = module0147.$g2095$.currentBinding(var156);
            try {
                module0147.$g2094$.bind((SubLObject)$ic43$, var156);
                module0147.$g2095$.bind($ic44$, var156);
                SubLObject var161 = module0219.f14509(var6, (SubLObject)ONE_INTEGER, var13, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var161 = Sort.sort(var161, (SubLObject)$ic79$, (SubLObject)UNPROVIDED);
                if (NIL == var158) {
                    SubLObject var162 = var161;
                    SubLObject var163 = (SubLObject)NIL;
                    var163 = var162.first();
                    while (NIL == var158 && NIL != var162) {
                        final SubLObject var164 = module0178.f11335(var163);
                        final SubLObject var165 = (SubLObject)((NIL != var137) ? ConsesLow.list(var164, var13, var163) : ConsesLow.list(var164, var13));
                        var157 = (SubLObject)ConsesLow.cons(var165, var157);
                        if (NIL != var136) {
                            var158 = (SubLObject)T;
                        }
                        var162 = var162.rest();
                        var163 = var162.first();
                    }
                }
                var157 = Sequences.nreverse(var157);
                if (NIL == var158) {
                    if (NIL == var161 && NIL != var155) {
                        if (NIL == f44585(var13, var6, var18)) {
                            if (NIL != ((NIL != constant_handles_oc.f8463($ic80$, (SubLObject)UNPROVIDED)) ? module0731.f44702(var13, $ic80$, (SubLObject)UNPROVIDED) : makeBoolean(NIL != constant_handles_oc.f8463($ic81$, (SubLObject)UNPROVIDED) && NIL != module0731.f44702(var13, $ic81$, (SubLObject)UNPROVIDED))) && NIL != ((NIL != module0161.f10481(var18)) ? module0731.f44644(var18, $ic82$) : module0147.f9507($ic82$))) {
                                if (NIL == var158) {
                                    SubLObject var162 = f44565(var6, $ic84$, var18, var136, var137, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    SubLObject var166 = (SubLObject)NIL;
                                    var166 = var162.first();
                                    while (NIL == var158 && NIL != var162) {
                                        if (NIL != var166) {
                                            final SubLObject var167 = f44592(var166);
                                            final SubLObject var168 = Sequences.cconcatenate((SubLObject)$ic83$, var167);
                                            var157 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var168, var13), var157);
                                            var158 = var136;
                                        }
                                        var162 = var162.rest();
                                        var166 = var162.first();
                                    }
                                }
                            }
                            else if (NIL != constant_handles_oc.f8463(f44559(), (SubLObject)UNPROVIDED) && NIL != module0731.f44702(var13, f44559(), (SubLObject)UNPROVIDED) && NIL != ((NIL != module0161.f10481(var18)) ? module0731.f44644(var18, $ic82$) : module0147.f9507($ic82$))) {
                                final SubLObject var169 = f44605(var13);
                                if (var169.isString() && NIL == var158) {
                                    SubLObject var170 = f44565(var6, $ic86$, var18, var136, var137, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    SubLObject var171 = (SubLObject)NIL;
                                    var171 = var170.first();
                                    while (NIL == var158 && NIL != var170) {
                                        if (NIL != var171) {
                                            final SubLObject var172 = f44592(var171);
                                            final SubLObject var173 = Sequences.cconcatenate(var169, new SubLObject[] { $ic85$, var172 });
                                            var157 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var173, var13), var157);
                                            var158 = var136;
                                        }
                                        var170 = var170.rest();
                                        var171 = var170.first();
                                    }
                                }
                            }
                            else if (NIL != module0731.f44695(var13, (SubLObject)UNPROVIDED) && NIL == var158) {
                                SubLObject var162 = f44572(var6, var13, var18);
                                SubLObject var174 = (SubLObject)NIL;
                                var174 = var162.first();
                                while (NIL == var158 && NIL != var162) {
                                    if (NIL != var174) {
                                        var157 = (SubLObject)ConsesLow.cons(var174, var157);
                                        var158 = var136;
                                    }
                                    var162 = var162.rest();
                                    var174 = var162.first();
                                }
                            }
                        }
                    }
                }
                if (NIL == var158 && NIL != module0584.$g4402$.getDynamicValue(var156)) {
                    SubLObject var175 = (SubLObject)NIL;
                    final SubLObject var176 = $ic87$;
                    if (NIL != module0158.f10010(var6, (SubLObject)NIL, var176)) {
                        final SubLObject var177 = module0158.f10011(var6, (SubLObject)NIL, var176);
                        SubLObject var178 = (SubLObject)NIL;
                        final SubLObject var179 = (SubLObject)NIL;
                        while (NIL == var178) {
                            final SubLObject var180 = module0052.f3695(var177, var179);
                            final SubLObject var181 = (SubLObject)makeBoolean(!var179.eql(var180));
                            if (NIL != var181) {
                                SubLObject var182 = (SubLObject)NIL;
                                try {
                                    var182 = module0158.f10316(var180, (SubLObject)$ic88$, (SubLObject)$ic89$, (SubLObject)NIL);
                                    SubLObject var185_191 = (SubLObject)NIL;
                                    final SubLObject var186_192 = (SubLObject)NIL;
                                    while (NIL == var185_191) {
                                        final SubLObject var183 = module0052.f3695(var182, var186_192);
                                        final SubLObject var188_194 = (SubLObject)makeBoolean(!var186_192.eql(var183));
                                        if (NIL != var188_194) {
                                            final SubLObject var184 = module0178.f11335(var183);
                                            if (var184.eql(var13) || var184.eql(module0731.f44691(var13))) {
                                                var175 = (SubLObject)ConsesLow.cons(var183, var175);
                                            }
                                        }
                                        var185_191 = (SubLObject)makeBoolean(NIL == var188_194);
                                    }
                                }
                                finally {
                                    final SubLObject var12_196 = Threads.$is_thread_performing_cleanupP$.currentBinding(var156);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var156);
                                        if (NIL != var182) {
                                            module0158.f10319(var182);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var12_196, var156);
                                    }
                                }
                            }
                            var178 = (SubLObject)makeBoolean(NIL == var181);
                        }
                    }
                    var175 = Sort.sort(var175, (SubLObject)$ic79$, (SubLObject)UNPROVIDED);
                    if (NIL == var158) {
                        SubLObject var185 = var175;
                        SubLObject var186 = (SubLObject)NIL;
                        var186 = var185.first();
                        while (NIL == var158 && NIL != var185) {
                            final SubLObject var187 = (SubLObject)THREE_INTEGER;
                            final SubLObject var188 = module0178.f11331(var186, var187);
                            SubLObject var189 = (SubLObject)ConsesLow.list(var188, var13);
                            if (NIL != var137) {
                                var189 = ConsesLow.append(var189, (SubLObject)ConsesLow.list(var186));
                            }
                            var157 = (SubLObject)ConsesLow.cons(var189, var157);
                            if (NIL != var136) {
                                var158 = (SubLObject)T;
                            }
                            var185 = var185.rest();
                            var186 = var185.first();
                        }
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var160, var156);
                module0147.$g2094$.rebind(var159, var156);
            }
        }
        else if (NIL != module0161.f10488(var18)) {
            final SubLObject var159 = module0147.$g2094$.currentBinding(var156);
            final SubLObject var160 = module0147.$g2096$.currentBinding(var156);
            try {
                module0147.$g2094$.bind((SubLObject)$ic45$, var156);
                module0147.$g2096$.bind(module0161.f10522(var18), var156);
                SubLObject var161 = module0219.f14509(var6, (SubLObject)ONE_INTEGER, var13, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var161 = Sort.sort(var161, (SubLObject)$ic79$, (SubLObject)UNPROVIDED);
                if (NIL == var158) {
                    SubLObject var162 = var161;
                    SubLObject var163 = (SubLObject)NIL;
                    var163 = var162.first();
                    while (NIL == var158 && NIL != var162) {
                        final SubLObject var164 = module0178.f11335(var163);
                        final SubLObject var165 = (SubLObject)((NIL != var137) ? ConsesLow.list(var164, var13, var163) : ConsesLow.list(var164, var13));
                        var157 = (SubLObject)ConsesLow.cons(var165, var157);
                        if (NIL != var136) {
                            var158 = (SubLObject)T;
                        }
                        var162 = var162.rest();
                        var163 = var162.first();
                    }
                }
                var157 = Sequences.nreverse(var157);
                if (NIL == var158) {
                    if (NIL == var161 && NIL != var155) {
                        if (NIL == f44585(var13, var6, var18)) {
                            if (NIL != ((NIL != constant_handles_oc.f8463($ic80$, (SubLObject)UNPROVIDED)) ? module0731.f44702(var13, $ic80$, (SubLObject)UNPROVIDED) : makeBoolean(NIL != constant_handles_oc.f8463($ic81$, (SubLObject)UNPROVIDED) && NIL != module0731.f44702(var13, $ic81$, (SubLObject)UNPROVIDED))) && NIL != ((NIL != module0161.f10481(var18)) ? module0731.f44644(var18, $ic82$) : module0147.f9507($ic82$))) {
                                if (NIL == var158) {
                                    SubLObject var162 = f44565(var6, $ic84$, var18, var136, var137, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    SubLObject var166 = (SubLObject)NIL;
                                    var166 = var162.first();
                                    while (NIL == var158 && NIL != var162) {
                                        if (NIL != var166) {
                                            final SubLObject var167 = f44592(var166);
                                            final SubLObject var168 = Sequences.cconcatenate((SubLObject)$ic83$, var167);
                                            var157 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var168, var13), var157);
                                            var158 = var136;
                                        }
                                        var162 = var162.rest();
                                        var166 = var162.first();
                                    }
                                }
                            }
                            else if (NIL != constant_handles_oc.f8463(f44559(), (SubLObject)UNPROVIDED) && NIL != module0731.f44702(var13, f44559(), (SubLObject)UNPROVIDED) && NIL != ((NIL != module0161.f10481(var18)) ? module0731.f44644(var18, $ic82$) : module0147.f9507($ic82$))) {
                                final SubLObject var169 = f44605(var13);
                                if (var169.isString() && NIL == var158) {
                                    SubLObject var170 = f44565(var6, $ic86$, var18, var136, var137, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    SubLObject var171 = (SubLObject)NIL;
                                    var171 = var170.first();
                                    while (NIL == var158 && NIL != var170) {
                                        if (NIL != var171) {
                                            final SubLObject var172 = f44592(var171);
                                            final SubLObject var173 = Sequences.cconcatenate(var169, new SubLObject[] { $ic85$, var172 });
                                            var157 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var173, var13), var157);
                                            var158 = var136;
                                        }
                                        var170 = var170.rest();
                                        var171 = var170.first();
                                    }
                                }
                            }
                            else if (NIL != module0731.f44695(var13, (SubLObject)UNPROVIDED) && NIL == var158) {
                                SubLObject var162 = f44572(var6, var13, var18);
                                SubLObject var174 = (SubLObject)NIL;
                                var174 = var162.first();
                                while (NIL == var158 && NIL != var162) {
                                    if (NIL != var174) {
                                        var157 = (SubLObject)ConsesLow.cons(var174, var157);
                                        var158 = var136;
                                    }
                                    var162 = var162.rest();
                                    var174 = var162.first();
                                }
                            }
                        }
                    }
                }
                if (NIL == var158 && NIL != module0584.$g4402$.getDynamicValue(var156)) {
                    SubLObject var175 = (SubLObject)NIL;
                    final SubLObject var176 = $ic87$;
                    if (NIL != module0158.f10010(var6, (SubLObject)NIL, var176)) {
                        final SubLObject var177 = module0158.f10011(var6, (SubLObject)NIL, var176);
                        SubLObject var178 = (SubLObject)NIL;
                        final SubLObject var179 = (SubLObject)NIL;
                        while (NIL == var178) {
                            final SubLObject var180 = module0052.f3695(var177, var179);
                            final SubLObject var181 = (SubLObject)makeBoolean(!var179.eql(var180));
                            if (NIL != var181) {
                                SubLObject var182 = (SubLObject)NIL;
                                try {
                                    var182 = module0158.f10316(var180, (SubLObject)$ic88$, (SubLObject)$ic89$, (SubLObject)NIL);
                                    SubLObject var185_192 = (SubLObject)NIL;
                                    final SubLObject var186_193 = (SubLObject)NIL;
                                    while (NIL == var185_192) {
                                        final SubLObject var183 = module0052.f3695(var182, var186_193);
                                        final SubLObject var188_195 = (SubLObject)makeBoolean(!var186_193.eql(var183));
                                        if (NIL != var188_195) {
                                            final SubLObject var184 = module0178.f11335(var183);
                                            if (var184.eql(var13) || var184.eql(module0731.f44691(var13))) {
                                                var175 = (SubLObject)ConsesLow.cons(var183, var175);
                                            }
                                        }
                                        var185_192 = (SubLObject)makeBoolean(NIL == var188_195);
                                    }
                                }
                                finally {
                                    final SubLObject var12_197 = Threads.$is_thread_performing_cleanupP$.currentBinding(var156);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var156);
                                        if (NIL != var182) {
                                            module0158.f10319(var182);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var12_197, var156);
                                    }
                                }
                            }
                            var178 = (SubLObject)makeBoolean(NIL == var181);
                        }
                    }
                    var175 = Sort.sort(var175, (SubLObject)$ic79$, (SubLObject)UNPROVIDED);
                    if (NIL == var158) {
                        SubLObject var185 = var175;
                        SubLObject var186 = (SubLObject)NIL;
                        var186 = var185.first();
                        while (NIL == var158 && NIL != var185) {
                            final SubLObject var187 = (SubLObject)THREE_INTEGER;
                            final SubLObject var188 = module0178.f11331(var186, var187);
                            SubLObject var189 = (SubLObject)ConsesLow.list(var188, var13);
                            if (NIL != var137) {
                                var189 = ConsesLow.append(var189, (SubLObject)ConsesLow.list(var186));
                            }
                            var157 = (SubLObject)ConsesLow.cons(var189, var157);
                            if (NIL != var136) {
                                var158 = (SubLObject)T;
                            }
                            var185 = var185.rest();
                            var186 = var185.first();
                        }
                    }
                }
            }
            finally {
                module0147.$g2096$.rebind(var160, var156);
                module0147.$g2094$.rebind(var159, var156);
            }
        }
        else {
            final SubLObject var159 = module0147.$g2094$.currentBinding(var156);
            final SubLObject var160 = module0147.$g2095$.currentBinding(var156);
            try {
                module0147.$g2094$.bind((SubLObject)$ic36$, var156);
                module0147.$g2095$.bind(var18, var156);
                SubLObject var161 = module0219.f14509(var6, (SubLObject)ONE_INTEGER, var13, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var161 = Sort.sort(var161, (SubLObject)$ic79$, (SubLObject)UNPROVIDED);
                if (NIL == var158) {
                    SubLObject var162 = var161;
                    SubLObject var163 = (SubLObject)NIL;
                    var163 = var162.first();
                    while (NIL == var158 && NIL != var162) {
                        final SubLObject var164 = module0178.f11335(var163);
                        final SubLObject var165 = (SubLObject)((NIL != var137) ? ConsesLow.list(var164, var13, var163) : ConsesLow.list(var164, var13));
                        var157 = (SubLObject)ConsesLow.cons(var165, var157);
                        if (NIL != var136) {
                            var158 = (SubLObject)T;
                        }
                        var162 = var162.rest();
                        var163 = var162.first();
                    }
                }
                var157 = Sequences.nreverse(var157);
                if (NIL == var158) {
                    if (NIL == var161 && NIL != var155) {
                        if (NIL == f44585(var13, var6, var18)) {
                            if (NIL != ((NIL != constant_handles_oc.f8463($ic80$, (SubLObject)UNPROVIDED)) ? module0731.f44702(var13, $ic80$, (SubLObject)UNPROVIDED) : makeBoolean(NIL != constant_handles_oc.f8463($ic81$, (SubLObject)UNPROVIDED) && NIL != module0731.f44702(var13, $ic81$, (SubLObject)UNPROVIDED))) && NIL != ((NIL != module0161.f10481(var18)) ? module0731.f44644(var18, $ic82$) : module0147.f9507($ic82$))) {
                                if (NIL == var158) {
                                    SubLObject var162 = f44565(var6, $ic84$, var18, var136, var137, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    SubLObject var166 = (SubLObject)NIL;
                                    var166 = var162.first();
                                    while (NIL == var158 && NIL != var162) {
                                        if (NIL != var166) {
                                            final SubLObject var167 = f44592(var166);
                                            final SubLObject var168 = Sequences.cconcatenate((SubLObject)$ic83$, var167);
                                            var157 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var168, var13), var157);
                                            var158 = var136;
                                        }
                                        var162 = var162.rest();
                                        var166 = var162.first();
                                    }
                                }
                            }
                            else if (NIL != constant_handles_oc.f8463(f44559(), (SubLObject)UNPROVIDED) && NIL != module0731.f44702(var13, f44559(), (SubLObject)UNPROVIDED) && NIL != ((NIL != module0161.f10481(var18)) ? module0731.f44644(var18, $ic82$) : module0147.f9507($ic82$))) {
                                final SubLObject var169 = f44605(var13);
                                if (var169.isString() && NIL == var158) {
                                    SubLObject var170 = f44565(var6, $ic86$, var18, var136, var137, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    SubLObject var171 = (SubLObject)NIL;
                                    var171 = var170.first();
                                    while (NIL == var158 && NIL != var170) {
                                        if (NIL != var171) {
                                            final SubLObject var172 = f44592(var171);
                                            final SubLObject var173 = Sequences.cconcatenate(var169, new SubLObject[] { $ic85$, var172 });
                                            var157 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var173, var13), var157);
                                            var158 = var136;
                                        }
                                        var170 = var170.rest();
                                        var171 = var170.first();
                                    }
                                }
                            }
                            else if (NIL != module0731.f44695(var13, (SubLObject)UNPROVIDED) && NIL == var158) {
                                SubLObject var162 = f44572(var6, var13, var18);
                                SubLObject var174 = (SubLObject)NIL;
                                var174 = var162.first();
                                while (NIL == var158 && NIL != var162) {
                                    if (NIL != var174) {
                                        var157 = (SubLObject)ConsesLow.cons(var174, var157);
                                        var158 = var136;
                                    }
                                    var162 = var162.rest();
                                    var174 = var162.first();
                                }
                            }
                        }
                    }
                }
                if (NIL == var158 && NIL != module0584.$g4402$.getDynamicValue(var156)) {
                    SubLObject var175 = (SubLObject)NIL;
                    final SubLObject var176 = $ic87$;
                    if (NIL != module0158.f10010(var6, (SubLObject)NIL, var176)) {
                        final SubLObject var177 = module0158.f10011(var6, (SubLObject)NIL, var176);
                        SubLObject var178 = (SubLObject)NIL;
                        final SubLObject var179 = (SubLObject)NIL;
                        while (NIL == var178) {
                            final SubLObject var180 = module0052.f3695(var177, var179);
                            final SubLObject var181 = (SubLObject)makeBoolean(!var179.eql(var180));
                            if (NIL != var181) {
                                SubLObject var182 = (SubLObject)NIL;
                                try {
                                    var182 = module0158.f10316(var180, (SubLObject)$ic88$, (SubLObject)$ic89$, (SubLObject)NIL);
                                    SubLObject var185_193 = (SubLObject)NIL;
                                    final SubLObject var186_194 = (SubLObject)NIL;
                                    while (NIL == var185_193) {
                                        final SubLObject var183 = module0052.f3695(var182, var186_194);
                                        final SubLObject var188_196 = (SubLObject)makeBoolean(!var186_194.eql(var183));
                                        if (NIL != var188_196) {
                                            final SubLObject var184 = module0178.f11335(var183);
                                            if (var184.eql(var13) || var184.eql(module0731.f44691(var13))) {
                                                var175 = (SubLObject)ConsesLow.cons(var183, var175);
                                            }
                                        }
                                        var185_193 = (SubLObject)makeBoolean(NIL == var188_196);
                                    }
                                }
                                finally {
                                    final SubLObject var12_198 = Threads.$is_thread_performing_cleanupP$.currentBinding(var156);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var156);
                                        if (NIL != var182) {
                                            module0158.f10319(var182);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var12_198, var156);
                                    }
                                }
                            }
                            var178 = (SubLObject)makeBoolean(NIL == var181);
                        }
                    }
                    var175 = Sort.sort(var175, (SubLObject)$ic79$, (SubLObject)UNPROVIDED);
                    if (NIL == var158) {
                        SubLObject var185 = var175;
                        SubLObject var186 = (SubLObject)NIL;
                        var186 = var185.first();
                        while (NIL == var158 && NIL != var185) {
                            final SubLObject var187 = (SubLObject)THREE_INTEGER;
                            final SubLObject var188 = module0178.f11331(var186, var187);
                            SubLObject var189 = (SubLObject)ConsesLow.list(var188, var13);
                            if (NIL != var137) {
                                var189 = ConsesLow.append(var189, (SubLObject)ConsesLow.list(var186));
                            }
                            var157 = (SubLObject)ConsesLow.cons(var189, var157);
                            if (NIL != var136) {
                                var158 = (SubLObject)T;
                            }
                            var185 = var185.rest();
                            var186 = var185.first();
                        }
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var160, var156);
                module0147.$g2094$.rebind(var159, var156);
            }
        }
        return Values.values(var157, var158);
    }
    
    public static SubLObject f44605(final SubLObject var13) {
        if (var13.eql($ic90$)) {
            return (SubLObject)$ic91$;
        }
        if (var13.eql($ic92$)) {
            return (SubLObject)$ic93$;
        }
        if (var13.eql($ic94$) || var13.eql($ic95$) || var13.eql($ic96$)) {
            return (SubLObject)$ic97$;
        }
        if (var13.eql($ic98$)) {
            return (SubLObject)$ic99$;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44606(final SubLObject var209, final SubLObject var210, SubLObject var211) {
        if (var211 == UNPROVIDED) {
            var211 = (SubLObject)NIL;
        }
        final SubLObject var212 = f44607(var211);
        if (NIL == assertion_handles_oc.f11035(var209)) {
            return (SubLObject)NIL;
        }
        if (NIL == assertion_handles_oc.f11035(var210)) {
            return (SubLObject)T;
        }
        if (NIL != module0222.f14635(var212, var209, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED) && NIL == module0222.f14635(var212, var210, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED)) {
            return (SubLObject)T;
        }
        if (NIL != module0222.f14635(var212, var210, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED) && NIL == module0222.f14635(var212, var209, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0222.f14635($ic100$, var209, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED) && NIL == module0222.f14635($ic100$, var210, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0222.f14635($ic100$, var210, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED) && NIL == module0222.f14635($ic100$, var209, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED)) {
            return (SubLObject)T;
        }
        if (NIL != var211 && NIL != f44606(var209, var210, (SubLObject)NIL)) {
            return (SubLObject)T;
        }
        if (NIL != var211 && NIL != f44606(var210, var209, (SubLObject)NIL)) {
            return (SubLObject)NIL;
        }
        return f44608(var209, var210);
    }
    
    public static SubLObject f44608(final SubLObject var209, final SubLObject var210) {
        if (NIL != f44609(var210) && NIL == f44609(var209)) {
            return (SubLObject)T;
        }
        if (NIL != f44609(var209) && NIL == f44609(var210)) {
            return (SubLObject)NIL;
        }
        if ($ic101$ == module0178.f11293(var209) && $ic102$ == module0178.f11293(var210)) {
            return (SubLObject)T;
        }
        if ($ic101$ == module0178.f11293(var210) && $ic102$ == module0178.f11293(var209)) {
            return (SubLObject)NIL;
        }
        if (!module0178.f11287(var209).equal(module0178.f11287(var210)) && NIL != module0731.f44644(module0178.f11287(var209), module0178.f11287(var210))) {
            return (SubLObject)T;
        }
        if (!module0178.f11287(var209).equal(module0178.f11287(var210)) && NIL != module0731.f44644(module0178.f11287(var210), module0178.f11287(var209))) {
            return (SubLObject)NIL;
        }
        if (NIL != module0178.f11375(var209) && NIL == module0178.f11375(var210)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44609(final SubLObject var213) {
        return (SubLObject)makeBoolean(NIL != assertion_handles_oc.f11035(var213) && module0205.f13132(var213).eql($ic87$));
    }
    
    public static SubLObject f44607(final SubLObject var211) {
        if (var211.eql((SubLObject)$ic103$)) {
            return $ic104$;
        }
        if (var211.eql((SubLObject)$ic105$)) {
            return $ic106$;
        }
        return $ic107$;
    }
    
    public static SubLObject f44597(final SubLObject var102) {
        return Sort.sort(var102, (SubLObject)$ic33$, Symbols.symbol_function((SubLObject)$ic108$));
    }
    
    public static SubLObject f44604(final SubLObject var13, final SubLObject var6) {
        final SubLObject var15;
        final SubLObject var14 = var15 = module0220.f14565(var13, $ic27$, (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
        return Sort.sort(module0035.remove_if_not((SubLObject)$ic13$, var15, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)$ic33$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f44610(final SubLObject var215, final SubLObject var216, SubLObject var9) {
        if (var9 == UNPROVIDED) {
            var9 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var217 = SubLProcess.currentSubLThread();
        SubLObject var218 = (SubLObject)NIL;
        final SubLObject var219 = module0147.f9540(var9);
        final SubLObject var220 = module0147.$g2095$.currentBinding(var217);
        final SubLObject var221 = module0147.$g2094$.currentBinding(var217);
        final SubLObject var222 = module0147.$g2096$.currentBinding(var217);
        try {
            module0147.$g2095$.bind(module0147.f9545(var219), var217);
            module0147.$g2094$.bind(module0147.f9546(var219), var217);
            module0147.$g2096$.bind(module0147.f9549(var219), var217);
            if (NIL != module0731.f44702(var215, $ic109$, (SubLObject)UNPROVIDED) && NIL != module0731.f44702(var216, $ic109$, (SubLObject)UNPROVIDED)) {
                var218 = f44611(var215, var216, var9);
            }
            else if (NIL != module0731.f44695(var216, (SubLObject)UNPROVIDED) && NIL == module0731.f44695(var215, (SubLObject)UNPROVIDED)) {
                var218 = (SubLObject)T;
            }
            else if (NIL != module0731.f44702(var215, $ic110$, (SubLObject)UNPROVIDED) && NIL == module0731.f44702(var216, $ic110$, (SubLObject)UNPROVIDED)) {
                var218 = (SubLObject)T;
            }
            else if (NIL != module0731.f44702(var216, $ic111$, (SubLObject)UNPROVIDED) && NIL == module0731.f44702(var215, $ic111$, (SubLObject)UNPROVIDED)) {
                var218 = (SubLObject)T;
            }
            else if (NIL != module0731.f44702(var215, $ic112$, (SubLObject)UNPROVIDED) && NIL == module0731.f44702(var216, $ic112$, (SubLObject)UNPROVIDED)) {
                var218 = (SubLObject)T;
            }
            else if (NIL != module0731.f44713(module0731.f44691(var216), $ic113$, (SubLObject)UNPROVIDED) && NIL == module0731.f44713(module0731.f44691(var215), $ic113$, (SubLObject)UNPROVIDED)) {
                var218 = (SubLObject)T;
            }
            else if (NIL != module0731.f44713(module0731.f44691(var215), $ic114$, (SubLObject)UNPROVIDED) && NIL != module0731.f44713(module0731.f44691(var216), $ic115$, (SubLObject)UNPROVIDED)) {
                var218 = (SubLObject)T;
            }
        }
        finally {
            module0147.$g2096$.rebind(var222, var217);
            module0147.$g2094$.rebind(var221, var217);
            module0147.$g2095$.rebind(var220, var217);
        }
        return var218;
    }
    
    public static SubLObject f44612(final SubLObject var215, final SubLObject var216, SubLObject var9) {
        if (var9 == UNPROVIDED) {
            var9 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var217 = SubLProcess.currentSubLThread();
        final SubLObject var218 = module0034.$g879$.getDynamicValue(var217);
        SubLObject var219 = (SubLObject)NIL;
        if (NIL == var218) {
            return f44610(var215, var216, var9);
        }
        var219 = module0034.f1857(var218, (SubLObject)$ic33$, (SubLObject)UNPROVIDED);
        if (NIL == var219) {
            var219 = module0034.f1807(module0034.f1842(var218), (SubLObject)$ic33$, (SubLObject)THREE_INTEGER, (SubLObject)$ic116$, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var218, (SubLObject)$ic33$, var219);
        }
        final SubLObject var220 = module0034.f1781(var215, var216, var9);
        final SubLObject var221 = module0034.f1814(var219, var220, (SubLObject)UNPROVIDED);
        if (var221 != $ic39$) {
            SubLObject var222 = var221;
            SubLObject var223 = (SubLObject)NIL;
            var223 = var222.first();
            while (NIL != var222) {
                SubLObject var224 = var223.first();
                final SubLObject var225 = conses_high.second(var223);
                if (var215.equal(var224.first())) {
                    var224 = var224.rest();
                    if (var216.equal(var224.first())) {
                        var224 = var224.rest();
                        if (NIL != var224 && NIL == var224.rest() && var9.equal(var224.first())) {
                            return module0034.f1959(var225);
                        }
                    }
                }
                var222 = var222.rest();
                var223 = var222.first();
            }
        }
        final SubLObject var226 = Values.arg2(var217.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f44610(var215, var216, var9)));
        module0034.f1836(var219, var220, var221, var226, (SubLObject)ConsesLow.list(var215, var216, var9));
        return module0034.f1959(var226);
    }
    
    public static SubLObject f44611(final SubLObject var215, final SubLObject var216, SubLObject var9) {
        if (var9 == UNPROVIDED) {
            var9 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var217 = SubLProcess.currentSubLThread();
        SubLObject var218 = (SubLObject)NIL;
        final SubLObject var219 = module0147.f9540(var9);
        final SubLObject var220 = module0147.$g2095$.currentBinding(var217);
        final SubLObject var221 = module0147.$g2094$.currentBinding(var217);
        final SubLObject var222 = module0147.$g2096$.currentBinding(var217);
        try {
            module0147.$g2095$.bind(module0147.f9545(var219), var217);
            module0147.$g2094$.bind(module0147.f9546(var219), var217);
            module0147.$g2096$.bind(module0147.f9549(var219), var217);
            final SubLObject var223 = module0731.f44702(var215, $ic117$, (SubLObject)UNPROVIDED);
            final SubLObject var224 = module0731.f44702(var216, $ic117$, (SubLObject)UNPROVIDED);
            var218 = (SubLObject)((NIL != var223) ? ((NIL != var224) ? f44613(var215, var216, var9) : NIL) : ((NIL != var224) ? T : f44614(var215, var216, var9)));
        }
        finally {
            module0147.$g2096$.rebind(var222, var217);
            module0147.$g2094$.rebind(var221, var217);
            module0147.$g2095$.rebind(var220, var217);
        }
        return var218;
    }
    
    public static SubLObject f44613(final SubLObject var215, final SubLObject var216, SubLObject var9) {
        if (var9 == UNPROVIDED) {
            var9 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var217 = SubLProcess.currentSubLThread();
        SubLObject var218 = (SubLObject)NIL;
        final SubLObject var219 = module0147.f9540(var9);
        final SubLObject var220 = module0147.$g2095$.currentBinding(var217);
        final SubLObject var221 = module0147.$g2094$.currentBinding(var217);
        final SubLObject var222 = module0147.$g2096$.currentBinding(var217);
        try {
            module0147.$g2095$.bind(module0147.f9545(var219), var217);
            module0147.$g2094$.bind(module0147.f9546(var219), var217);
            module0147.$g2096$.bind(module0147.f9549(var219), var217);
            final SubLObject var223 = module0731.f44702(var215, $ic118$, (SubLObject)UNPROVIDED);
            final SubLObject var224 = module0731.f44702(var216, $ic118$, (SubLObject)UNPROVIDED);
            if (NIL != var223 && NIL == var224) {
                var218 = (SubLObject)T;
            }
            else if (NIL != var224 && NIL == var223) {
                var218 = (SubLObject)NIL;
            }
            else {
                final SubLObject var225 = module0731.f44702(var215, f44559(), (SubLObject)UNPROVIDED);
                final SubLObject var226 = module0731.f44702(var216, f44559(), (SubLObject)UNPROVIDED);
                if (NIL != var225 && NIL == var226) {
                    var218 = (SubLObject)NIL;
                }
                else if (NIL != var226 && NIL == var225) {
                    var218 = (SubLObject)T;
                }
            }
        }
        finally {
            module0147.$g2096$.rebind(var222, var217);
            module0147.$g2094$.rebind(var221, var217);
            module0147.$g2095$.rebind(var220, var217);
        }
        return var218;
    }
    
    public static SubLObject f44614(final SubLObject var215, final SubLObject var216, SubLObject var9) {
        if (var9 == UNPROVIDED) {
            var9 = module0147.$g2095$.getDynamicValue();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44615() {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        return $g5752$.getDynamicValue(var10);
    }
    
    public static SubLObject f44616(final SubLObject var130, final SubLObject var131) {
        SubLObject var133;
        final SubLObject var132 = var133 = var130.rest();
        SubLObject var134 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var133, var132, (SubLObject)$ic50$);
        var134 = var133.first();
        final SubLObject var135;
        var133 = (var135 = var133.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic51$, (SubLObject)ConsesLow.listS((SubLObject)$ic52$, reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)$ic53$, (SubLObject)ConsesLow.listS((SubLObject)$ic54$, var134, (SubLObject)$ic119$)), (SubLObject)$ic120$), ConsesLow.append(var135, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic58$, (SubLObject)$ic53$, (SubLObject)ConsesLow.listS((SubLObject)$ic59$, var134, (SubLObject)$ic119$))))));
    }
    
    public static SubLObject f44572(final SubLObject var43, final SubLObject var13, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = module0584.f35776();
        }
        final SubLThread var44 = SubLProcess.currentSubLThread();
        SubLObject var45 = (SubLObject)NIL;
        SubLObject var46 = (SubLObject)NIL;
        SubLObject var47 = (SubLObject)NIL;
        final SubLObject var48 = module0077.f5326((SubLObject)ConsesLow.list(var43, var13, var18), $g5751$.getDynamicValue(var44));
        final SubLObject var49 = $g5747$.currentBinding(var44);
        final SubLObject var50 = $g5752$.currentBinding(var44);
        try {
            $g5747$.bind((SubLObject)T, var44);
            $g5752$.bind((SubLObject)makeBoolean(NIL != $g5752$.getDynamicValue(var44) || NIL == var48), var44);
            if (NIL != module0147.f9491(var18, (SubLObject)$ic41$)) {
                final SubLObject var12_227 = module0147.$g2094$.currentBinding(var44);
                final SubLObject var36_228 = module0147.$g2095$.currentBinding(var44);
                try {
                    module0147.$g2094$.bind((SubLObject)$ic41$, var44);
                    module0147.$g2095$.bind($ic42$, var44);
                    if (NIL != module0731.f44713(module0731.f44691(var13), $ic113$, module0147.$g2095$.getDynamicValue(var44))) {
                        final SubLObject var51 = module0732.f44949(var13);
                        final SubLObject var52 = (SubLObject)(var51.eql(var13) ? NIL : f44565(var43, var51, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                        if (NIL == var46) {
                            SubLObject var53 = var52;
                            SubLObject var54 = (SubLObject)NIL;
                            var54 = var53.first();
                            while (NIL == var46 && NIL != var53) {
                                final SubLObject var55 = f44592(var54);
                                final SubLObject var56 = module0038.f2782(var55, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                final SubLObject var57 = f44591(var56, var13, f44594(var54));
                                var45 = (SubLObject)ConsesLow.cons(var57, var45);
                                var46 = $g5743$.getDynamicValue(var44);
                                var53 = var53.rest();
                                var54 = var53.first();
                            }
                        }
                    }
                    if (NIL != f44617(var13)) {
                        final SubLObject var58 = f44618(var43, var13, var18);
                        if (NIL != var58) {
                            var45 = ConsesLow.append(var45, var58);
                            var46 = $g5743$.getDynamicValue(var44);
                        }
                    }
                    else if (NIL != module0731.f44690(var13, (NIL != module0161.f10481(var18)) ? var18 : $ic44$)) {
                        if (NIL != f44615()) {
                            var47 = (SubLObject)T;
                        }
                        if (NIL == var46) {
                            SubLObject var59 = module0728.f44455(var13);
                            SubLObject var60 = (SubLObject)NIL;
                            var60 = var59.first();
                            while (NIL == var46 && NIL != var59) {
                                final SubLObject var61 = module0178.f11335(var60);
                                final SubLObject var62 = module0178.f11336(var60);
                                final SubLObject var12_228 = $g5744$.currentBinding(var44);
                                try {
                                    $g5744$.bind((SubLObject)makeBoolean(NIL != $g5744$.getDynamicValue(var44) && NIL == var47), var44);
                                    if (NIL == var46) {
                                        SubLObject var92_239 = f44565(var43, var61, var18, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                        SubLObject var63 = (SubLObject)NIL;
                                        var63 = var92_239.first();
                                        while (NIL == var46 && NIL != var92_239) {
                                            final SubLObject var64 = f44592(var63);
                                            final SubLObject var65 = f44594(var63);
                                            final SubLObject var66 = module0728.f44459(var64, var62);
                                            final SubLObject var67 = (SubLObject)((NIL != module0191.f11950(var60)) ? ConsesLow.cons(var60, var65) : var65);
                                            final SubLObject var68 = f44591(var66, var13, var67);
                                            var45 = (SubLObject)ConsesLow.cons(var68, var45);
                                            var46 = $g5743$.getDynamicValue(var44);
                                            var92_239 = var92_239.rest();
                                            var63 = var92_239.first();
                                        }
                                    }
                                }
                                finally {
                                    $g5744$.rebind(var12_228, var44);
                                }
                                var59 = var59.rest();
                                var60 = var59.first();
                            }
                        }
                    }
                }
                finally {
                    module0147.$g2095$.rebind(var36_228, var44);
                    module0147.$g2094$.rebind(var12_227, var44);
                }
            }
            else if (NIL != module0147.f9491(var18, (SubLObject)$ic43$)) {
                final SubLObject var12_229 = module0147.$g2094$.currentBinding(var44);
                final SubLObject var36_229 = module0147.$g2095$.currentBinding(var44);
                try {
                    module0147.$g2094$.bind((SubLObject)$ic43$, var44);
                    module0147.$g2095$.bind($ic44$, var44);
                    if (NIL != module0731.f44713(module0731.f44691(var13), $ic113$, module0147.$g2095$.getDynamicValue(var44))) {
                        final SubLObject var51 = module0732.f44949(var13);
                        final SubLObject var52 = (SubLObject)(var51.eql(var13) ? NIL : f44565(var43, var51, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                        if (NIL == var46) {
                            SubLObject var53 = var52;
                            SubLObject var54 = (SubLObject)NIL;
                            var54 = var53.first();
                            while (NIL == var46 && NIL != var53) {
                                final SubLObject var55 = f44592(var54);
                                final SubLObject var56 = module0038.f2782(var55, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                final SubLObject var57 = f44591(var56, var13, f44594(var54));
                                var45 = (SubLObject)ConsesLow.cons(var57, var45);
                                var46 = $g5743$.getDynamicValue(var44);
                                var53 = var53.rest();
                                var54 = var53.first();
                            }
                        }
                    }
                    if (NIL != f44617(var13)) {
                        final SubLObject var58 = f44618(var43, var13, var18);
                        if (NIL != var58) {
                            var45 = ConsesLow.append(var45, var58);
                            var46 = $g5743$.getDynamicValue(var44);
                        }
                    }
                    else if (NIL != module0731.f44690(var13, (NIL != module0161.f10481(var18)) ? var18 : $ic44$)) {
                        if (NIL != f44615()) {
                            var47 = (SubLObject)T;
                        }
                        if (NIL == var46) {
                            SubLObject var59 = module0728.f44455(var13);
                            SubLObject var60 = (SubLObject)NIL;
                            var60 = var59.first();
                            while (NIL == var46 && NIL != var59) {
                                final SubLObject var61 = module0178.f11335(var60);
                                final SubLObject var62 = module0178.f11336(var60);
                                final SubLObject var12_230 = $g5744$.currentBinding(var44);
                                try {
                                    $g5744$.bind((SubLObject)makeBoolean(NIL != $g5744$.getDynamicValue(var44) && NIL == var47), var44);
                                    if (NIL == var46) {
                                        SubLObject var92_240 = f44565(var43, var61, var18, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                        SubLObject var63 = (SubLObject)NIL;
                                        var63 = var92_240.first();
                                        while (NIL == var46 && NIL != var92_240) {
                                            final SubLObject var64 = f44592(var63);
                                            final SubLObject var65 = f44594(var63);
                                            final SubLObject var66 = module0728.f44459(var64, var62);
                                            final SubLObject var67 = (SubLObject)((NIL != module0191.f11950(var60)) ? ConsesLow.cons(var60, var65) : var65);
                                            final SubLObject var68 = f44591(var66, var13, var67);
                                            var45 = (SubLObject)ConsesLow.cons(var68, var45);
                                            var46 = $g5743$.getDynamicValue(var44);
                                            var92_240 = var92_240.rest();
                                            var63 = var92_240.first();
                                        }
                                    }
                                }
                                finally {
                                    $g5744$.rebind(var12_230, var44);
                                }
                                var59 = var59.rest();
                                var60 = var59.first();
                            }
                        }
                    }
                }
                finally {
                    module0147.$g2095$.rebind(var36_229, var44);
                    module0147.$g2094$.rebind(var12_229, var44);
                }
            }
            else if (NIL != module0161.f10488(var18)) {
                final SubLObject var12_231 = module0147.$g2094$.currentBinding(var44);
                final SubLObject var36_230 = module0147.$g2096$.currentBinding(var44);
                try {
                    module0147.$g2094$.bind((SubLObject)$ic45$, var44);
                    module0147.$g2096$.bind(module0161.f10522(var18), var44);
                    if (NIL != module0731.f44713(module0731.f44691(var13), $ic113$, module0147.$g2095$.getDynamicValue(var44))) {
                        final SubLObject var51 = module0732.f44949(var13);
                        final SubLObject var52 = (SubLObject)(var51.eql(var13) ? NIL : f44565(var43, var51, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                        if (NIL == var46) {
                            SubLObject var53 = var52;
                            SubLObject var54 = (SubLObject)NIL;
                            var54 = var53.first();
                            while (NIL == var46 && NIL != var53) {
                                final SubLObject var55 = f44592(var54);
                                final SubLObject var56 = module0038.f2782(var55, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                final SubLObject var57 = f44591(var56, var13, f44594(var54));
                                var45 = (SubLObject)ConsesLow.cons(var57, var45);
                                var46 = $g5743$.getDynamicValue(var44);
                                var53 = var53.rest();
                                var54 = var53.first();
                            }
                        }
                    }
                    if (NIL != f44617(var13)) {
                        final SubLObject var58 = f44618(var43, var13, var18);
                        if (NIL != var58) {
                            var45 = ConsesLow.append(var45, var58);
                            var46 = $g5743$.getDynamicValue(var44);
                        }
                    }
                    else if (NIL != module0731.f44690(var13, (NIL != module0161.f10481(var18)) ? var18 : $ic44$)) {
                        if (NIL != f44615()) {
                            var47 = (SubLObject)T;
                        }
                        if (NIL == var46) {
                            SubLObject var59 = module0728.f44455(var13);
                            SubLObject var60 = (SubLObject)NIL;
                            var60 = var59.first();
                            while (NIL == var46 && NIL != var59) {
                                final SubLObject var61 = module0178.f11335(var60);
                                final SubLObject var62 = module0178.f11336(var60);
                                final SubLObject var12_232 = $g5744$.currentBinding(var44);
                                try {
                                    $g5744$.bind((SubLObject)makeBoolean(NIL != $g5744$.getDynamicValue(var44) && NIL == var47), var44);
                                    if (NIL == var46) {
                                        SubLObject var92_241 = f44565(var43, var61, var18, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                        SubLObject var63 = (SubLObject)NIL;
                                        var63 = var92_241.first();
                                        while (NIL == var46 && NIL != var92_241) {
                                            final SubLObject var64 = f44592(var63);
                                            final SubLObject var65 = f44594(var63);
                                            final SubLObject var66 = module0728.f44459(var64, var62);
                                            final SubLObject var67 = (SubLObject)((NIL != module0191.f11950(var60)) ? ConsesLow.cons(var60, var65) : var65);
                                            final SubLObject var68 = f44591(var66, var13, var67);
                                            var45 = (SubLObject)ConsesLow.cons(var68, var45);
                                            var46 = $g5743$.getDynamicValue(var44);
                                            var92_241 = var92_241.rest();
                                            var63 = var92_241.first();
                                        }
                                    }
                                }
                                finally {
                                    $g5744$.rebind(var12_232, var44);
                                }
                                var59 = var59.rest();
                                var60 = var59.first();
                            }
                        }
                    }
                }
                finally {
                    module0147.$g2096$.rebind(var36_230, var44);
                    module0147.$g2094$.rebind(var12_231, var44);
                }
            }
            else {
                final SubLObject var12_233 = module0147.$g2094$.currentBinding(var44);
                final SubLObject var36_231 = module0147.$g2095$.currentBinding(var44);
                try {
                    module0147.$g2094$.bind((SubLObject)$ic36$, var44);
                    module0147.$g2095$.bind(var18, var44);
                    if (NIL != module0731.f44713(module0731.f44691(var13), $ic113$, module0147.$g2095$.getDynamicValue(var44))) {
                        final SubLObject var51 = module0732.f44949(var13);
                        final SubLObject var52 = (SubLObject)(var51.eql(var13) ? NIL : f44565(var43, var51, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                        if (NIL == var46) {
                            SubLObject var53 = var52;
                            SubLObject var54 = (SubLObject)NIL;
                            var54 = var53.first();
                            while (NIL == var46 && NIL != var53) {
                                final SubLObject var55 = f44592(var54);
                                final SubLObject var56 = module0038.f2782(var55, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                final SubLObject var57 = f44591(var56, var13, f44594(var54));
                                var45 = (SubLObject)ConsesLow.cons(var57, var45);
                                var46 = $g5743$.getDynamicValue(var44);
                                var53 = var53.rest();
                                var54 = var53.first();
                            }
                        }
                    }
                    if (NIL != f44617(var13)) {
                        final SubLObject var58 = f44618(var43, var13, var18);
                        if (NIL != var58) {
                            var45 = ConsesLow.append(var45, var58);
                            var46 = $g5743$.getDynamicValue(var44);
                        }
                    }
                    else if (NIL != module0731.f44690(var13, (NIL != module0161.f10481(var18)) ? var18 : $ic44$)) {
                        if (NIL != f44615()) {
                            var47 = (SubLObject)T;
                        }
                        if (NIL == var46) {
                            SubLObject var59 = module0728.f44455(var13);
                            SubLObject var60 = (SubLObject)NIL;
                            var60 = var59.first();
                            while (NIL == var46 && NIL != var59) {
                                final SubLObject var61 = module0178.f11335(var60);
                                final SubLObject var62 = module0178.f11336(var60);
                                final SubLObject var12_234 = $g5744$.currentBinding(var44);
                                try {
                                    $g5744$.bind((SubLObject)makeBoolean(NIL != $g5744$.getDynamicValue(var44) && NIL == var47), var44);
                                    if (NIL == var46) {
                                        SubLObject var92_242 = f44565(var43, var61, var18, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                        SubLObject var63 = (SubLObject)NIL;
                                        var63 = var92_242.first();
                                        while (NIL == var46 && NIL != var92_242) {
                                            final SubLObject var64 = f44592(var63);
                                            final SubLObject var65 = f44594(var63);
                                            final SubLObject var66 = module0728.f44459(var64, var62);
                                            final SubLObject var67 = (SubLObject)((NIL != module0191.f11950(var60)) ? ConsesLow.cons(var60, var65) : var65);
                                            final SubLObject var68 = f44591(var66, var13, var67);
                                            var45 = (SubLObject)ConsesLow.cons(var68, var45);
                                            var46 = $g5743$.getDynamicValue(var44);
                                            var92_242 = var92_242.rest();
                                            var63 = var92_242.first();
                                        }
                                    }
                                }
                                finally {
                                    $g5744$.rebind(var12_234, var44);
                                }
                                var59 = var59.rest();
                                var60 = var59.first();
                            }
                        }
                    }
                }
                finally {
                    module0147.$g2095$.rebind(var36_231, var44);
                    module0147.$g2094$.rebind(var12_233, var44);
                }
            }
            if (NIL != var48) {
                module0077.f5327((SubLObject)ConsesLow.list(var43, var13, var18), $g5751$.getDynamicValue(var44));
            }
        }
        finally {
            $g5752$.rebind(var50, var44);
            $g5747$.rebind(var49, var44);
        }
        return f44577(var45, $g5743$.getDynamicValue(var44), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f44618(final SubLObject var43, final SubLObject var13, final SubLObject var18) {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        SubLObject var45 = (SubLObject)NIL;
        SubLObject var46 = (SubLObject)NIL;
        final SubLObject var47 = f44619(var13);
        final SubLObject var48 = f44565(var43, var47, var18, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL == var46) {
            SubLObject var49 = var48;
            SubLObject var50 = (SubLObject)NIL;
            var50 = var49.first();
            while (NIL == var46 && NIL != var49) {
                final SubLObject var51 = f44592(var50);
                final SubLObject var52 = module0728.f44456(var13, var47, var51, var18);
                final SubLObject var53 = ConsesLow.append((SubLObject)ConsesLow.list(var52, var13), f44594(var50));
                var45 = (SubLObject)ConsesLow.cons(var53, var45);
                var46 = $g5743$.getDynamicValue(var44);
                var49 = var49.rest();
                var50 = var49.first();
            }
        }
        return var45;
    }
    
    public static SubLObject f44617(final SubLObject var13) {
        return (SubLObject)makeBoolean(NIL != module0731.f44695(var13, (SubLObject)UNPROVIDED) && (NIL != module0731.f44702(var13, $ic121$, (SubLObject)UNPROVIDED) || NIL != module0731.f44702(var13, $ic122$, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f44619(final SubLObject var44) {
        if (NIL != module0731.f44702(var44, $ic122$, (SubLObject)UNPROVIDED)) {
            return $ic123$;
        }
        if (NIL != module0731.f44702(var44, $ic121$, (SubLObject)UNPROVIDED)) {
            return $ic124$;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44620(final SubLObject var1, final SubLObject var13) {
        return (SubLObject)makeBoolean(NIL != f44621(var1) || (NIL != f44622(var13) && NIL != f44623(var1, var13)));
    }
    
    public static SubLObject f44621(final SubLObject var1) {
        return module0035.sublisp_boolean(module0731.f44809(var1, $ic125$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f44624(final SubLObject var13) {
        return (SubLObject)makeBoolean(NIL != module0731.f44702(var13, $ic126$, (SubLObject)UNPROVIDED) || NIL != module0731.f44702(var13, $ic127$, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f44622(final SubLObject var13) {
        return (SubLObject)makeBoolean(NIL != module0731.f44702(var13, $ic128$, (SubLObject)UNPROVIDED) || NIL != module0731.f44702(var13, $ic129$, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f44623(final SubLObject var1, final SubLObject var13) {
        SubLObject var14 = (SubLObject)NIL;
        if (var13.eql($ic129$)) {
            var14 = Types.sublisp_null(module0731.f44730(module0728.f44459(module0038.f2621(var1, (SubLObject)$ic130$, (SubLObject)UNPROVIDED), (SubLObject)$ic131$), $ic127$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        else if (var13.eql($ic128$)) {
            var14 = Types.sublisp_null(module0731.f44730(module0728.f44459(module0038.f2621(var1, (SubLObject)$ic130$, (SubLObject)UNPROVIDED), (SubLObject)$ic131$), $ic126$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        return var14;
    }
    
    public static SubLObject f44625() {
        if (NIL != module0035.f2370((SubLObject)$ic133$, $g5753$.getGlobalValue(), (SubLObject)UNPROVIDED)) {
            module0131.f8549();
        }
        else {
            module0131.f8550();
        }
        return module0131.f8548();
    }
    
    public static SubLObject f44626() {
        f44627();
        return (SubLObject)T;
    }
    
    public static SubLObject f44627() {
        module0731.f44773();
        f44628();
        module0584.f35788();
        module0584.f35816();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44628() {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        if (NIL != module0018.f971()) {
            module0584.$g4396$.setDynamicValue((SubLObject)NIL, var10);
            if (NIL == module0584.$g4396$.getDynamicValue(var10)) {
                SubLObject var11 = (SubLObject)$ic135$;
                SubLObject var12 = (SubLObject)NIL;
                var12 = var11.first();
                while (NIL == module0584.$g4396$.getDynamicValue(var10) && NIL != var11) {
                    final SubLObject var13 = constants_high_oc.f10737(var12);
                    if (NIL != constant_handles_oc.f8463(var13, (SubLObject)UNPROVIDED)) {
                        final SubLObject var14 = module0162.f10628(module0161.f10518((SubLObject)ConsesLow.list(var13, $ic134$)));
                        module0584.$g4396$.setDynamicValue((NIL != module0161.f10571(var14, (SubLObject)UNPROVIDED)) ? var14 : var13, var10);
                    }
                    var11 = var11.rest();
                    var12 = var11.first();
                }
            }
        }
        return module0584.$g4396$.getDynamicValue(var10);
    }
    
    public static SubLObject f44629() {
        module0584.f35816();
        module0018.f983();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44630(final SubLObject var260) {
        return module0075.f5176(var260, (SubLObject)$ic136$, (SubLObject)$ic137$);
    }
    
    public static SubLObject f44631() {
        module0737.f45552((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0018.f983();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44632() {
        return (SubLObject)makeBoolean(NIL != module0584.$g4429$.getGlobalValue() && NIL != module0584.$g4428$.getGlobalValue() && NIL != module0584.$g4427$.getGlobalValue() && NIL != module0737.f45538() && NIL == module0737.f45545(module0737.f45538()) && NIL != nl_trie_completion_oc.$g5755$.getGlobalValue());
    }
    
    public static SubLObject f44633(final SubLObject var260) {
        final SubLThread var261 = SubLProcess.currentSubLThread();
        final SubLObject var262 = f44630(var260);
        final SubLObject var263 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(var261);
        final SubLObject var264 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(var261);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind((SubLObject)$ic138$, var261);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(var261), var261);
            final SubLObject var265 = f44634(var260);
            final SubLObject var266 = f44635(var260);
            SubLObject var267 = (SubLObject)NIL;
            try {
                var267 = module0095.f6845(var265, var266, (SubLObject)$ic139$, (SubLObject)$ic138$, (SubLObject)$ic138$, (SubLObject)UNPROVIDED);
                dumper_oc.f38021(module0095.f6852(var267));
                final SubLObject var268 = (SubLObject)$ic140$;
                final SubLObject var12_266 = module0012.$g73$.currentBinding(var261);
                final SubLObject var36_267 = module0012.$g65$.currentBinding(var261);
                final SubLObject var269 = module0012.$g67$.currentBinding(var261);
                final SubLObject var270 = module0012.$g68$.currentBinding(var261);
                final SubLObject var271 = module0012.$g66$.currentBinding(var261);
                final SubLObject var272 = module0012.$g69$.currentBinding(var261);
                final SubLObject var273 = module0012.$g70$.currentBinding(var261);
                final SubLObject var274 = module0012.$silent_progressP$.currentBinding(var261);
                try {
                    module0012.$g73$.bind(Time.get_universal_time(), var261);
                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var261), var261);
                    module0012.$g67$.bind((SubLObject)ONE_INTEGER, var261);
                    module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var261);
                    module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var261);
                    module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var261);
                    module0012.$g70$.bind((SubLObject)T, var261);
                    module0012.$silent_progressP$.bind((SubLObject)((NIL != var268) ? module0012.$silent_progressP$.getDynamicValue(var261) : T), var261);
                    module0012.f474(var268);
                    SubLObject var275 = (SubLObject)NIL;
                    try {
                        var275 = compatibility.open_binary(var262, (SubLObject)$ic139$);
                        if (!var275.isStream()) {
                            Errors.error((SubLObject)$ic141$, var262);
                        }
                        final SubLObject var272_273 = var275;
                        module0740.f45870(var272_273);
                        module0737.f45585(var272_273, var267);
                        module0737.f45582(var272_273);
                    }
                    finally {
                        final SubLObject var12_267 = Threads.$is_thread_performing_cleanupP$.currentBinding(var261);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var261);
                            if (var275.isStream()) {
                                streams_high.close(var275, (SubLObject)UNPROVIDED);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var12_267, var261);
                        }
                    }
                    module0012.f475();
                }
                finally {
                    module0012.$silent_progressP$.rebind(var274, var261);
                    module0012.$g70$.rebind(var273, var261);
                    module0012.$g69$.rebind(var272, var261);
                    module0012.$g66$.rebind(var271, var261);
                    module0012.$g68$.rebind(var270, var261);
                    module0012.$g67$.rebind(var269, var261);
                    module0012.$g65$.rebind(var36_267, var261);
                    module0012.$g73$.rebind(var12_266, var261);
                }
            }
            finally {
                final SubLObject var12_268 = Threads.$is_thread_performing_cleanupP$.currentBinding(var261);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var261);
                    if (NIL != module0095.f6844(var267)) {
                        module0095.f6849(var267);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var12_268, var261);
                }
            }
            dumper_oc.f37914(var266);
            dumper_oc.f37914(var265);
        }
        finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(var264, var261);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(var263, var261);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44636(SubLObject var260) {
        if (var260 == UNPROVIDED) {
            var260 = (SubLObject)NIL;
        }
        final SubLThread var261 = SubLProcess.currentSubLThread();
        if (NIL == var260) {
            var260 = dumper_oc.f37915((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        final SubLObject var262 = f44630(var260);
        if (NIL == Filesys.probe_file(var262)) {
            Errors.warn((SubLObject)$ic142$, var262);
        }
        else {
            final SubLObject var263 = (SubLObject)$ic143$;
            final SubLObject var264 = module0012.$g73$.currentBinding(var261);
            final SubLObject var265 = module0012.$g65$.currentBinding(var261);
            final SubLObject var266 = module0012.$g67$.currentBinding(var261);
            final SubLObject var267 = module0012.$g68$.currentBinding(var261);
            final SubLObject var268 = module0012.$g66$.currentBinding(var261);
            final SubLObject var269 = module0012.$g69$.currentBinding(var261);
            final SubLObject var270 = module0012.$g70$.currentBinding(var261);
            final SubLObject var271 = module0012.$silent_progressP$.currentBinding(var261);
            try {
                module0012.$g73$.bind(Time.get_universal_time(), var261);
                module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var261), var261);
                module0012.$g67$.bind((SubLObject)ONE_INTEGER, var261);
                module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var261);
                module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var261);
                module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var261);
                module0012.$g70$.bind((SubLObject)T, var261);
                module0012.$silent_progressP$.bind((SubLObject)((NIL != var263) ? module0012.$silent_progressP$.getDynamicValue(var261) : T), var261);
                module0012.f474(var263);
                final SubLObject var12_276 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(var261);
                final SubLObject var36_277 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(var261);
                try {
                    StreamsLow.$stream_initial_input_buffer_size$.bind((SubLObject)$ic138$, var261);
                    StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(var261), var261);
                    SubLObject var272 = (SubLObject)NIL;
                    try {
                        var272 = compatibility.open_binary(var262, (SubLObject)$ic144$);
                        if (!var272.isStream()) {
                            Errors.error((SubLObject)$ic141$, var262);
                        }
                        final SubLObject var272_279 = var272;
                        module0740.f45869(var272_279);
                        final SubLObject var12_277 = module0021.$g750$.currentBinding(var261);
                        try {
                            module0021.$g750$.bind(f44637(), var261);
                            module0737.f45579(var272_279);
                            final SubLObject var273 = f44634(var260);
                            final SubLObject var274 = f44635(var260);
                            if (NIL != module0075.f5218(var273) && NIL != module0075.f5218(var274)) {
                                module0737.f45584(var273, var274, (SubLObject)UNPROVIDED);
                            }
                            dumper_oc.f37914(var274);
                            dumper_oc.f37914(var273);
                            module0737.f45581(var272_279);
                        }
                        finally {
                            module0021.$g750$.rebind(var12_277, var261);
                        }
                        if (NIL != $g5754$.getDynamicValue(var261)) {
                            module0738.f45830((SubLObject)UNPROVIDED);
                        }
                        module0018.f983();
                    }
                    finally {
                        final SubLObject var12_278 = Threads.$is_thread_performing_cleanupP$.currentBinding(var261);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var261);
                            if (var272.isStream()) {
                                streams_high.close(var272, (SubLObject)UNPROVIDED);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var12_278, var261);
                        }
                    }
                }
                finally {
                    StreamsLow.$stream_initial_output_buffer_size$.rebind(var36_277, var261);
                    StreamsLow.$stream_initial_input_buffer_size$.rebind(var12_276, var261);
                }
                module0012.f475();
            }
            finally {
                module0012.$silent_progressP$.rebind(var271, var261);
                module0012.$g70$.rebind(var270, var261);
                module0012.$g69$.rebind(var269, var261);
                module0012.$g66$.rebind(var268, var261);
                module0012.$g68$.rebind(var267, var261);
                module0012.$g67$.rebind(var266, var261);
                module0012.$g65$.rebind(var265, var261);
                module0012.$g73$.rebind(var264, var261);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44634(SubLObject var260) {
        if (var260 == UNPROVIDED) {
            var260 = (SubLObject)NIL;
        }
        return dumper_oc.f37916((SubLObject)$ic145$, var260, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f44635(SubLObject var260) {
        if (var260 == UNPROVIDED) {
            var260 = (SubLObject)NIL;
        }
        return dumper_oc.f37916((SubLObject)$ic146$, var260, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f44638(SubLObject var260) {
        if (var260 == UNPROVIDED) {
            var260 = (SubLObject)NIL;
        }
        if (NIL == var260) {
            var260 = dumper_oc.f37915((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return f44633(var260);
    }
    
    public static SubLObject f44639() {
        $g5756$.setGlobalValue((SubLObject)T);
        return module0035.sublisp_boolean($g5756$.getGlobalValue());
    }
    
    public static SubLObject f44640() {
        $g5756$.setGlobalValue((SubLObject)NIL);
        return module0035.sublisp_boolean($g5756$.getGlobalValue());
    }
    
    public static SubLObject f44637() {
        if (NIL == $g5756$.getGlobalValue()) {
            return (SubLObject)T;
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f44641() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44559", "S#48765", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44560", "WORDS-OF-STRING", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44561", "STRINGS-OF-WORD-UNIT", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44563", "S#48766", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44564", "S#39911", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44566", "S#48767", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44567", "S#48596", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44568", "S#48768", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44569", "S#48769", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44570", "S#48770", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44571", "GENERATE-REGULAR-STRING", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44573", "S#48771", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44574", "S#48772", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44575", "ORDERED-STRINGS-OF-WORD-UNIT", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44562", "S#48773", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44576", "S#48774", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44579", "S#48775", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44580", "S#48776", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44581", "S#48777", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44578", "S#48778", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44582", "S#48779", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44583", "S#48780", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44584", "S#48781", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44585", "S#48782", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44587", "S#48783", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44586", "S#48784", 1, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0730", "f44588", "S#48785");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44589", "S#48786", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44565", "S#48787", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44591", "S#48788", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44592", "S#48789", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44593", "S#48790", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44594", "S#48791", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44595", "S#48749", 1, 0, false);
        new $f44595$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44577", "S#48792", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44590", "S#48793", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44599", "S#48794", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44600", "S#48795", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44596", "S#48796", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44598", "S#48797", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44603", "S#48798", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44602", "S#48799", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44601", "S#48800", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44605", "S#48801", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44606", "S#48802", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44608", "S#48803", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44609", "S#48804", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44607", "S#48805", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44597", "S#48806", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44604", "S#48807", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44610", "S#48808", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44612", "S#48752", 2, 1, false);
        new $f44612$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44611", "S#48809", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44613", "S#48810", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44614", "S#48811", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44615", "S#48812", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0730", "f44616", "S#48813");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44572", "S#48814", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44618", "S#48815", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44617", "S#48816", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44619", "S#48817", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44620", "S#48818", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44621", "S#48819", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44624", "S#48589", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44622", "S#48590", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44623", "S#48820", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44625", "S#41516", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44626", "S#41491", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44627", "S#48821", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44628", "S#48822", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44629", "S#41487", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44630", "S#48823", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44631", "S#41493", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44632", "S#41492", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44633", "S#41488", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44636", "S#41490", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44634", "S#48824", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44635", "S#48825", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44638", "S#48826", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44639", "MUST-USE-STATIC-MEMORY-FOR-NL-TRIE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44640", "MAY-USE-DYNAMIC-MEMORY-FOR-NL-TRIE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0730", "f44637", "S#48827", 0, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44642() {
        $g5741$ = SubLFiles.deflexical("S#48828", (SubLObject)NIL);
        $g5742$ = SubLFiles.deflexical("S#48829", Symbols.symbol_function((SubLObject)EQUAL));
        $g5743$ = SubLFiles.defparameter("S#48830", (SubLObject)NIL);
        $g5744$ = SubLFiles.defparameter("S#48831", (SubLObject)T);
        $g5745$ = SubLFiles.defparameter("S#48832", (SubLObject)NIL);
        $g5746$ = SubLFiles.defparameter("S#48833", (SubLObject)T);
        $g5747$ = SubLFiles.defparameter("S#48834", (SubLObject)NIL);
        $g5748$ = SubLFiles.deflexical("S#48835", (SubLObject)NIL);
        $g5749$ = SubLFiles.defparameter("S#48836", module0077.f5313((SubLObject)EQUAL, (SubLObject)UNPROVIDED));
        $g5750$ = SubLFiles.defparameter("S#48837", (SubLObject)NIL);
        $g5751$ = SubLFiles.defparameter("S#48838", module0077.f5313((SubLObject)EQUAL, (SubLObject)UNPROVIDED));
        $g5752$ = SubLFiles.defparameter("S#48839", (SubLObject)NIL);
        $g5753$ = SubLFiles.deflexical("S#48840", (SubLObject)$ic132$);
        $g5754$ = SubLFiles.defparameter("S#48841", (SubLObject)NIL);
        $g5756$ = SubLFiles.deflexical("S#48842", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic147$)) ? $g5756$.getGlobalValue() : NIL));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44643() {
        module0584.$g4427$.setGlobalValue((SubLObject)$ic0$);
        module0584.f35817((SubLObject)$ic1$, (SubLObject)$ic2$);
        module0012.f368((SubLObject)$ic6$, (SubLObject)$ic7$, (SubLObject)$ic8$, (SubLObject)$ic9$, (SubLObject)$ic10$);
        module0034.f1909((SubLObject)$ic35$);
        module0034.f1895((SubLObject)$ic46$);
        module0034.f1895((SubLObject)$ic60$);
        module0034.f1895((SubLObject)$ic77$);
        module0034.f1895((SubLObject)$ic33$);
        module0003.f57((SubLObject)$ic147$);
        module0012.f368((SubLObject)$ic148$, (SubLObject)NIL, (SubLObject)$ic149$, (SubLObject)NIL, (SubLObject)$ic150$);
        module0012.f368((SubLObject)$ic151$, (SubLObject)NIL, (SubLObject)$ic152$, (SubLObject)NIL, (SubLObject)$ic150$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f44641();
    }
    
    public void initializeVariables() {
        f44642();
    }
    
    public void runTopLevelForms() {
        f44643();
    }
    
    static {
        me = (SubLFile)new module0730();
        $g5741$ = null;
        $g5742$ = null;
        $g5743$ = null;
        $g5744$ = null;
        $g5745$ = null;
        $g5746$ = null;
        $g5747$ = null;
        $g5748$ = null;
        $g5749$ = null;
        $g5750$ = null;
        $g5751$ = null;
        $g5752$ = null;
        $g5753$ = null;
        $g5754$ = null;
        $g5756$ = null;
        $ic0$ = makeString("$Revision: 138966 $");
        $ic1$ = makeSymbol("*LEXICON-CACHE-CODE-REVISION*");
        $ic2$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("1.193"), (SubLObject)makeString("1.194")), (SubLObject)ConsesLow.list((SubLObject)makeString("1.194"), (SubLObject)makeString("1.195")), (SubLObject)ConsesLow.list((SubLObject)makeString("1.195"), (SubLObject)makeString("1.196")), (SubLObject)ConsesLow.list((SubLObject)makeString("1.197"), (SubLObject)makeString("1.198")), (SubLObject)ConsesLow.list((SubLObject)makeString("1.198"), (SubLObject)makeString("1.199")), (SubLObject)ConsesLow.list((SubLObject)makeString("1.199"), (SubLObject)makeString("1.200")));
        $ic3$ = makeString("d2c1a460-aa6e-11d8-8d3f-0002b3a84f94");
        $ic4$ = makeSymbol("STRINGP");
        $ic5$ = makeSymbol("S#39431", "CYC");
        $ic6$ = makeSymbol("WORDS-OF-STRING");
        $ic7$ = ConsesLow.list((SubLObject)makeSymbol("STRING"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#48843", "CYC"), (SubLObject)makeSymbol("S#39485", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#48844", "CYC"), (SubLObject)makeSymbol("*LEXICON-LOOKUP-MT*")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#48845", "CYC"), (SubLObject)makeSymbol("S#39486", "CYC")));
        $ic8$ = makeString("@return LISTP; of word units associated with STRING.\n@param STRING stringp\n@param MISSPELLINGS? boolean; Should we include misspellings?\n@param LOOKUP-MT hlmt-p; Which mt should we look from?\n@param PARSE-MORPHOLOGICALLY: :ALWAYS or :NEVER or :AS-FALLBACK;\n                               Do we attempt to parse STRING as a complex (multi-morpheme) word?");
        $ic9$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("STRING"), (SubLObject)makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#48845", "CYC"), (SubLObject)makeSymbol("S#39431", "CYC")));
        $ic10$ = ConsesLow.list((SubLObject)makeSymbol("LISTP"));
        $ic11$ = makeKeyword("ALL");
        $ic12$ = makeSymbol("S#48745", "CYC");
        $ic13$ = makeSymbol("S#39429", "CYC");
        $ic14$ = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic15$ = makeKeyword("DEPTH");
        $ic16$ = makeKeyword("STACK");
        $ic17$ = makeKeyword("QUEUE");
        $ic18$ = constant_handles_oc.f8479((SubLObject)makeString("True-JustificationTruth"));
        $ic19$ = makeSymbol("S#11450", "CYC");
        $ic20$ = makeKeyword("ERROR");
        $ic21$ = makeString("~A is not a ~A");
        $ic22$ = makeSymbol("S#11592", "CYC");
        $ic23$ = makeKeyword("CERROR");
        $ic24$ = makeString("continue anyway");
        $ic25$ = makeKeyword("WARN");
        $ic26$ = makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic27$ = constant_handles_oc.f8479((SubLObject)makeString("genlPreds"));
        $ic28$ = makeString("~A is neither SET-P nor LISTP.");
        $ic29$ = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic30$ = makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic31$ = constant_handles_oc.f8479((SubLObject)makeString("regularSuffix"));
        $ic32$ = makeSymbol("LISTP");
        $ic33$ = makeSymbol("S#48752", "CYC");
        $ic34$ = makeSymbol("S#48789", "CYC");
        $ic35$ = makeSymbol("S#48778", "CYC");
        $ic36$ = makeSymbol("S#12278", "CYC");
        $ic37$ = makeSymbol("ALL-SPEC-PREDICATES");
        $ic38$ = makeSymbol("S#48835", "CYC");
        $ic39$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic40$ = makeSymbol("S#15517", "CYC");
        $ic41$ = makeSymbol("S#12274", "CYC");
        $ic42$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic43$ = makeSymbol("S#12275", "CYC");
        $ic44$ = constant_handles_oc.f8479((SubLObject)makeString("InferencePSC"));
        $ic45$ = makeSymbol("S#12280", "CYC");
        $ic46$ = makeSymbol("S#48784", "CYC");
        $ic47$ = makeSymbol(">");
        $ic48$ = makeSymbol("NUM-PREDICATE-EXTENT-INDEX");
        $ic49$ = makeInteger(64);
        $ic50$ = ConsesLow.list((SubLObject)makeSymbol("S#105", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic51$ = makeSymbol("PROGN");
        $ic52$ = makeSymbol("CLET");
        $ic53$ = makeSymbol("S#48846", "CYC");
        $ic54$ = makeSymbol("SET-ADD");
        $ic55$ = ConsesLow.list((SubLObject)makeSymbol("S#48836", "CYC"));
        $ic56$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#48837", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("COR"), (SubLObject)makeSymbol("S#48837", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("CNOT"), (SubLObject)makeSymbol("S#48846", "CYC")))));
        $ic57$ = makeSymbol("CUNWIND-PROTECT");
        $ic58$ = makeSymbol("PWHEN");
        $ic59$ = makeSymbol("S#6942", "CYC");
        $ic60$ = makeSymbol("S#48787", "CYC");
        $ic61$ = makeSymbol("S#12343", "CYC");
        $ic62$ = makeInteger(1000);
        $ic63$ = ConsesLow.listS((SubLObject)makeSymbol("STRING"), (SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#14510", "CYC"));
        $ic64$ = makeSymbol("S#48749", "CYC");
        $ic65$ = makeSymbol("S#48794", "CYC");
        $ic66$ = makeSymbol("?STRING");
        $ic67$ = makeSymbol("?PRED");
        $ic68$ = makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $ic69$ = makeKeyword("MAX-NUMBER");
        $ic70$ = makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL");
        $ic71$ = makeKeyword("NONE");
        $ic72$ = makeKeyword("RETURN");
        $ic73$ = makeKeyword("BINDINGS-AND-SUPPORTS");
        $ic74$ = makeKeyword("BINDINGS");
        $ic75$ = constant_handles_oc.f8479((SubLObject)makeString("and"));
        $ic76$ = makeSymbol("FIRST");
        $ic77$ = makeSymbol("S#48799", "CYC");
        $ic78$ = makeInteger(200);
        $ic79$ = makeSymbol("S#48802", "CYC");
        $ic80$ = constant_handles_oc.f8479((SubLObject)makeString("simpleFuture-Generic"));
        $ic81$ = constant_handles_oc.f8479((SubLObject)makeString("futureTense-Generic"));
        $ic82$ = constant_handles_oc.f8479((SubLObject)makeString("EnglishMt"));
        $ic83$ = makeString("will ");
        $ic84$ = constant_handles_oc.f8479((SubLObject)makeString("infinitive"));
        $ic85$ = makeString(" ");
        $ic86$ = constant_handles_oc.f8479((SubLObject)makeString("perfect"));
        $ic87$ = constant_handles_oc.f8479((SubLObject)makeString("abbreviationForLexicalWord"));
        $ic88$ = makeKeyword("GAF");
        $ic89$ = makeKeyword("TRUE");
        $ic90$ = constant_handles_oc.f8479((SubLObject)makeString("futurePerfect-Universal"));
        $ic91$ = makeString("will have");
        $ic92$ = constant_handles_oc.f8479((SubLObject)makeString("pastPerfect-Universal"));
        $ic93$ = makeString("had");
        $ic94$ = constant_handles_oc.f8479((SubLObject)makeString("firstPersonSg-PresentPerfect"));
        $ic95$ = constant_handles_oc.f8479((SubLObject)makeString("secondPersonSg-PresentPerfect"));
        $ic96$ = constant_handles_oc.f8479((SubLObject)makeString("pluralVerb-PresentPerfect"));
        $ic97$ = makeString("have");
        $ic98$ = constant_handles_oc.f8479((SubLObject)makeString("thirdPersonSg-PresentPerfect"));
        $ic99$ = makeString("has");
        $ic100$ = constant_handles_oc.f8479((SubLObject)makeString("dispreferredLexification"));
        $ic101$ = makeKeyword("MONOTONIC");
        $ic102$ = makeKeyword("DEFAULT");
        $ic103$ = makeKeyword("TERSE");
        $ic104$ = constant_handles_oc.f8479((SubLObject)makeString("genStringAssertion-Terse"));
        $ic105$ = makeKeyword("PRECISE");
        $ic106$ = constant_handles_oc.f8479((SubLObject)makeString("genStringAssertion-Precise"));
        $ic107$ = constant_handles_oc.f8479((SubLObject)makeString("genStringAssertion"));
        $ic108$ = makeSymbol("SECOND");
        $ic109$ = constant_handles_oc.f8479((SubLObject)makeString("verbStrings"));
        $ic110$ = constant_handles_oc.f8479((SubLObject)makeString("simpleNounStrings"));
        $ic111$ = constant_handles_oc.f8479((SubLObject)makeString("plural-Generic"));
        $ic112$ = constant_handles_oc.f8479((SubLObject)makeString("singular-Generic"));
        $ic113$ = constant_handles_oc.f8479((SubLObject)makeString("ProperNoun"));
        $ic114$ = constant_handles_oc.f8479((SubLObject)makeString("CountNoun-Generic"));
        $ic115$ = constant_handles_oc.f8479((SubLObject)makeString("MassNoun-Generic"));
        $ic116$ = makeInteger(400);
        $ic117$ = constant_handles_oc.f8479((SubLObject)makeString("tensed"));
        $ic118$ = constant_handles_oc.f8479((SubLObject)makeString("presentTense-Generic"));
        $ic119$ = ConsesLow.list((SubLObject)makeSymbol("S#48838", "CYC"));
        $ic120$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#48834", "CYC"), (SubLObject)T), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#48839", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("COR"), (SubLObject)makeSymbol("S#48839", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("CNOT"), (SubLObject)makeSymbol("S#48846", "CYC")))));
        $ic121$ = constant_handles_oc.f8479((SubLObject)makeString("adverbStrings"));
        $ic122$ = constant_handles_oc.f8479((SubLObject)makeString("adjStrings"));
        $ic123$ = constant_handles_oc.f8479((SubLObject)makeString("regularDegree"));
        $ic124$ = constant_handles_oc.f8479((SubLObject)makeString("regularAdverb"));
        $ic125$ = constant_handles_oc.f8479((SubLObject)makeString("Noun"));
        $ic126$ = constant_handles_oc.f8479((SubLObject)makeString("comparativeDegree"));
        $ic127$ = constant_handles_oc.f8479((SubLObject)makeString("comparativeAdverb"));
        $ic128$ = constant_handles_oc.f8479((SubLObject)makeString("superlativeDegree"));
        $ic129$ = constant_handles_oc.f8479((SubLObject)makeString("superlativeAdverb"));
        $ic130$ = makeString("est");
        $ic131$ = makeString("er");
        $ic132$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("LexicalWord")), constant_handles_oc.f8479((SubLObject)makeString("nameString")), constant_handles_oc.f8479((SubLObject)makeString("termStrings")), constant_handles_oc.f8479((SubLObject)makeString("GeneralLexiconMt")), constant_handles_oc.f8479((SubLObject)makeString("AllLexicalMicrotheoryPSC")));
        $ic133$ = makeSymbol("VALID-CONSTANT?");
        $ic134$ = constant_handles_oc.f8479((SubLObject)makeString("AnytimePSC"));
        $ic135$ = ConsesLow.list((SubLObject)makeString("AllEnglishValidatedLexicalMicrotheoryPSC"), (SubLObject)makeString("AllEnglishLexicalMicrotheoryPSC"), (SubLObject)makeString("EnglishMt"), (SubLObject)makeString("BaseKB"));
        $ic136$ = makeString("lexicon-cache");
        $ic137$ = makeString("cfasl");
        $ic138$ = makeInteger(4000000);
        $ic139$ = makeKeyword("OUTPUT");
        $ic140$ = makeString("Dumping lexicon cache...");
        $ic141$ = makeString("Unable to open ~S");
        $ic142$ = makeString("CFASL file ~s not found");
        $ic143$ = makeString("Loading lexicon cache...");
        $ic144$ = makeKeyword("INPUT");
        $ic145$ = makeString("nl-trie-contents");
        $ic146$ = makeString("nl-trie-contents-index");
        $ic147$ = makeSymbol("S#48842", "CYC");
        $ic148$ = makeSymbol("MUST-USE-STATIC-MEMORY-FOR-NL-TRIE");
        $ic149$ = makeString("Instruct the loader to use static memory when loading the NL trie.");
        $ic150$ = ConsesLow.list((SubLObject)makeSymbol("BOOLEANP"));
        $ic151$ = makeSymbol("MAY-USE-DYNAMIC-MEMORY-FOR-NL-TRIE");
        $ic152$ = makeString("Instruct the loader to leave it up to the implementation whether to\n   use dynamic or static memory when loading the NL trie");
    }
    
    public static final class $f44595$UnaryFunction extends UnaryFunction
    {
        public $f44595$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#48749"));
        }
        
        public SubLObject processItem(final SubLObject var151) {
            return f44595(var151);
        }
    }
    
    public static final class $f44612$BinaryFunction extends BinaryFunction
    {
        public $f44612$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#48752"));
        }
        
        public SubLObject processItem(final SubLObject var151, final SubLObject var217) {
            return f44612(var151, var217, (SubLObject)$f44612$BinaryFunction.UNPROVIDED);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 2268 ms
	
	Decompiled with Procyon 0.5.32.
*/