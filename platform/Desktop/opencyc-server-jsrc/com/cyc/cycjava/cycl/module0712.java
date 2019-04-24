package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0712 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0712";
    public static final String myFingerPrint = "b79f556bd467d52be0573c28b47b2a6b86e73c8a757429395dfd59967c8339cb";
    public static SubLSymbol $g5632$;
    private static SubLSymbol $g5633$;
    private static SubLSymbol $g5634$;
    private static SubLSymbol $g5635$;
    private static SubLSymbol $g5636$;
    private static SubLSymbol $g5637$;
    private static SubLSymbol $g5638$;
    private static SubLSymbol $g5639$;
    private static SubLSymbol $g5640$;
    private static SubLSymbol $g5641$;
    private static SubLSymbol $g5642$;
    private static SubLSymbol $g5643$;
    private static SubLSymbol $g5644$;
    private static SubLSymbol $g5645$;
    private static SubLSymbol $g5646$;
    private static SubLSymbol $g5647$;
    private static SubLSymbol $g5648$;
    private static SubLSymbol $g5649$;
    private static SubLSymbol $g5650$;
    public static SubLSymbol $g5651$;
    public static SubLSymbol $g5652$;
    private static SubLSymbol $g5653$;
    private static final SubLString $ic0$;
    private static final SubLString $ic1$;
    private static final SubLString $ic2$;
    private static final SubLString $ic3$;
    private static final SubLString $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLList $ic7$;
    private static final SubLList $ic8$;
    private static final SubLList $ic9$;
    private static final SubLObject $ic10$;
    private static final SubLList $ic11$;
    private static final SubLList $ic12$;
    private static final SubLObject $ic13$;
    private static final SubLList $ic14$;
    private static final SubLList $ic15$;
    private static final SubLList $ic16$;
    private static final SubLString $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLList $ic20$;
    private static final SubLString $ic21$;
    private static final SubLString $ic22$;
    private static final SubLString $ic23$;
    private static final SubLString $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLInteger $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLString $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLList $ic32$;
    private static final SubLString $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLString $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLInteger $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLString $ic39$;
    private static final SubLString $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLObject $ic44$;
    private static final SubLObject $ic45$;
    private static final SubLObject $ic46$;
    private static final SubLObject $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLString $ic50$;
    private static final SubLList $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLObject $ic55$;
    private static final SubLList $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLObject $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLList $ic63$;
    private static final SubLObject $ic64$;
    private static final SubLObject $ic65$;
    private static final SubLString $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLString $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLString $ic71$;
    private static final SubLString $ic72$;
    private static final SubLString $ic73$;
    private static final SubLString $ic74$;
    private static final SubLString $ic75$;
    private static final SubLString $ic76$;
    private static final SubLString $ic77$;
    private static final SubLString $ic78$;
    private static final SubLString $ic79$;
    private static final SubLString $ic80$;
    private static final SubLString $ic81$;
    private static final SubLString $ic82$;
    private static final SubLString $ic83$;
    private static final SubLString $ic84$;
    private static final SubLString $ic85$;
    private static final SubLString $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLString $ic88$;
    private static final SubLString $ic89$;
    private static final SubLString $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLString $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLString $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLString $ic101$;
    private static final SubLObject $ic102$;
    private static final SubLString $ic103$;
    private static final SubLString $ic104$;
    private static final SubLString $ic105$;
    private static final SubLList $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLString $ic108$;
    private static final SubLString $ic109$;
    private static final SubLString $ic110$;
    private static final SubLString $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLString $ic113$;
    private static final SubLString $ic114$;
    private static final SubLString $ic115$;
    private static final SubLString $ic116$;
    private static final SubLString $ic117$;
    private static final SubLString $ic118$;
    private static final SubLString $ic119$;
    private static final SubLString $ic120$;
    private static final SubLString $ic121$;
    private static final SubLList $ic122$;
    private static final SubLString $ic123$;
    private static final SubLString $ic124$;
    private static final SubLString $ic125$;
    private static final SubLString $ic126$;
    private static final SubLString $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLList $ic129$;
    private static final SubLString $ic130$;
    private static final SubLString $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLString $ic133$;
    private static final SubLString $ic134$;
    private static final SubLString $ic135$;
    private static final SubLString $ic136$;
    private static final SubLString $ic137$;
    private static final SubLString $ic138$;
    private static final SubLString $ic139$;
    private static final SubLObject $ic140$;
    private static final SubLObject $ic141$;
    private static final SubLString $ic142$;
    private static final SubLString $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLList $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLList $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLSymbol $ic149$;
    private static final SubLList $ic150$;
    private static final SubLList $ic151$;
    private static final SubLString $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLString $ic154$;
    private static final SubLList $ic155$;
    private static final SubLList $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLString $ic159$;
    private static final SubLString $ic160$;
    private static final SubLString $ic161$;
    private static final SubLString $ic162$;
    private static final SubLString $ic163$;
    private static final SubLString $ic164$;
    private static final SubLSymbol $ic165$;
    private static final SubLString $ic166$;
    private static final SubLString $ic167$;
    private static final SubLString $ic168$;
    private static final SubLList $ic169$;
    private static final SubLSymbol $ic170$;
    private static final SubLList $ic171$;
    private static final SubLString $ic172$;
    private static final SubLString $ic173$;
    private static final SubLString $ic174$;
    private static final SubLList $ic175$;
    private static final SubLString $ic176$;
    private static final SubLString $ic177$;
    private static final SubLString $ic178$;
    private static final SubLString $ic179$;
    
    public static SubLObject f43657(final SubLObject var1) {
        return Sequences.cconcatenate((SubLObject)module0712.$ic0$, new SubLObject[] { var1, module0712.$ic1$ });
    }
    
    public static SubLObject f43658() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0712.NIL;
        if (module0712.NIL != module0710.$g5584$.getDynamicValue(var2) && module0712.NIL != Sequences.search((SubLObject)module0712.$ic2$, module0710.f43485((SubLObject)module0712.UNPROVIDED), (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED) && module0712.NIL != module0075.f5218(module0712.$g5632$.getGlobalValue()) && module0712.NIL == module0710.$g5586$.getDynamicValue(var2)) {
            var3 = module0038.f2953(module0712.$g5632$.getGlobalValue(), (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED);
        }
        return var3;
    }
    
    public static SubLObject f43659() {
        final SubLObject var3 = module0712.$g5639$.getGlobalValue();
        if (module0712.NIL != var3) {
            module0034.f1818(var3);
        }
        return (SubLObject)module0712.NIL;
    }
    
    public static SubLObject f43660() {
        return module0034.f1829(module0712.$g5639$.getGlobalValue(), (SubLObject)ConsesLow.list(module0712.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED);
    }
    
    public static SubLObject f43661() {
        return (SubLObject)ConsesLow.list(new SubLObject[] { module0712.$ic6$, module0712.$ic7$, module0712.$ic8$, module0712.$ic9$, reader.bq_cons(module0213.f13918(module0712.$ic10$), (SubLObject)module0712.$ic11$), module0712.$ic12$, reader.bq_cons(module0213.f13918(module0712.$ic13$), (SubLObject)module0712.$ic11$), module0712.$ic14$, module0712.$ic15$, module0712.$ic16$, reader.bq_cons(Sequences.cconcatenate(module0710.f43486(), (SubLObject)module0712.$ic17$), (SubLObject)module0712.$ic11$) });
    }
    
    public static SubLObject f43662() {
        SubLObject var4 = module0712.$g5639$.getGlobalValue();
        if (module0712.NIL == var4) {
            var4 = module0034.f1934((SubLObject)module0712.$ic5$, (SubLObject)module0712.$ic18$, (SubLObject)module0712.NIL, (SubLObject)module0712.EQL, (SubLObject)module0712.ZERO_INTEGER, (SubLObject)module0712.ZERO_INTEGER);
        }
        SubLObject var5 = module0034.f1810(var4, (SubLObject)module0712.UNPROVIDED);
        if (var5 == module0712.$ic19$) {
            var5 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f43661()));
            module0034.f1812(var4, var5, (SubLObject)module0712.UNPROVIDED);
        }
        return module0034.f1959(var5);
    }
    
    public static SubLObject f43663() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0712.NIL == module0024.f1253(module0712.$g5643$.getDynamicValue(var2))) {
            module0712.$g5643$.setDynamicValue(module0024.f1251(module0712.$g5641$.getGlobalValue(), (SubLObject)module0712.UNPROVIDED), var2);
        }
        return module0712.$g5643$.getDynamicValue(var2);
    }
    
    public static SubLObject f43664() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0712.NIL == module0024.f1253(module0712.$g5644$.getDynamicValue(var2))) {
            module0712.$g5644$.setDynamicValue(module0024.f1251(module0712.$g5642$.getGlobalValue(), (SubLObject)module0712.UNPROVIDED), var2);
        }
        return module0712.$g5644$.getDynamicValue(var2);
    }
    
    public static SubLObject f43665() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (!module0712.$g5645$.getDynamicValue(var2).isCons()) {
            module0712.$g5645$.setDynamicValue((SubLObject)ConsesLow.list(f43663(), f43664()), var2);
        }
        return module0712.$g5645$.getDynamicValue(var2);
    }
    
    public static SubLObject f43666(final SubLObject var6) {
        SubLObject var7 = (SubLObject)module0712.NIL;
        if (var6.isString()) {
            if (module0712.NIL == module0038.f2684(var6, (SubLObject)module0712.$ic23$) && module0712.NIL == module0038.f2684(var6, (SubLObject)module0712.$ic24$)) {
                return (SubLObject)module0712.NIL;
            }
            SubLObject var8 = f43665();
            SubLObject var9 = (SubLObject)module0712.NIL;
            var9 = var8.first();
            while (module0712.NIL != var8) {
                final SubLObject var10 = Mapping.mapcar((SubLObject)module0712.$ic25$, module0045.f3145(var9, var6, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED));
                if (var10.isVector()) {
                    final SubLObject var11 = var10;
                    final SubLObject var12 = (SubLObject)module0712.NIL;
                    SubLObject var13;
                    SubLObject var14;
                    SubLObject var15;
                    SubLObject var16;
                    for (var13 = Sequences.length(var11), var14 = (SubLObject)module0712.NIL, var14 = (SubLObject)module0712.ZERO_INTEGER; var14.numL(var13); var14 = Numbers.add(var14, (SubLObject)module0712.ONE_INTEGER)) {
                        var15 = ((module0712.NIL != var12) ? Numbers.subtract(var13, var14, (SubLObject)module0712.ONE_INTEGER) : var14);
                        var16 = Vectors.aref(var11, var15);
                        var7 = (SubLObject)ConsesLow.cons(var16, var7);
                    }
                }
                else {
                    SubLObject var8_17 = var10;
                    SubLObject var17 = (SubLObject)module0712.NIL;
                    var17 = var8_17.first();
                    while (module0712.NIL != var8_17) {
                        var7 = (SubLObject)ConsesLow.cons(var17, var7);
                        var8_17 = var8_17.rest();
                        var17 = var8_17.first();
                    }
                }
                var8 = var8.rest();
                var9 = var8.first();
            }
        }
        else {
            if (module0712.NIL == module0702.f42828(var6)) {
                return Values.values((SubLObject)module0712.NIL, (SubLObject)module0712.NIL);
            }
            final SubLObject var18 = module0702.f42830(var6);
            if (module0712.NIL == module0038.f2684(var18, (SubLObject)module0712.$ic23$) && module0712.NIL == module0038.f2684(var18, (SubLObject)module0712.$ic24$)) {
                return (SubLObject)module0712.NIL;
            }
            SubLObject var19 = f43665();
            SubLObject var20 = (SubLObject)module0712.NIL;
            var20 = var19.first();
            while (module0712.NIL != var19) {
                final SubLObject var21 = Mapping.mapcar((SubLObject)module0712.$ic25$, module0045.f3145(var20, var18, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED));
                if (var21.isVector()) {
                    final SubLObject var22 = var21;
                    final SubLObject var23 = (SubLObject)module0712.NIL;
                    SubLObject var24;
                    SubLObject var25;
                    SubLObject var26;
                    SubLObject var27;
                    for (var24 = Sequences.length(var22), var25 = (SubLObject)module0712.NIL, var25 = (SubLObject)module0712.ZERO_INTEGER; var25.numL(var24); var25 = Numbers.add(var25, (SubLObject)module0712.ONE_INTEGER)) {
                        var26 = ((module0712.NIL != var23) ? Numbers.subtract(var24, var25, (SubLObject)module0712.ONE_INTEGER) : var25);
                        var27 = Vectors.aref(var22, var26);
                        var7 = (SubLObject)ConsesLow.cons(var27, var7);
                    }
                }
                else {
                    SubLObject var8_18 = var21;
                    SubLObject var28 = (SubLObject)module0712.NIL;
                    var28 = var8_18.first();
                    while (module0712.NIL != var8_18) {
                        var7 = (SubLObject)ConsesLow.cons(var28, var7);
                        var8_18 = var8_18.rest();
                        var28 = var8_18.first();
                    }
                }
                var19 = var19.rest();
                var20 = var19.first();
            }
        }
        return Values.values(module0035.sublisp_boolean(var7), var7);
    }
    
    public static SubLObject f43667(final SubLObject var20, SubLObject var21, SubLObject var22, SubLObject var23) {
        if (var21 == module0712.UNPROVIDED) {
            var21 = module0711.$g5593$.getDynamicValue();
        }
        if (var22 == module0712.UNPROVIDED) {
            var22 = module0711.$g5588$.getDynamicValue();
        }
        if (var23 == module0712.UNPROVIDED) {
            var23 = module0710.$g5582$.getDynamicValue();
        }
        assert module0712.NIL != module0173.f10955(var20) : var20;
        return f43668(var20, var21, var22, var23);
    }
    
    public static SubLObject f43669(final SubLObject var24, SubLObject var21, SubLObject var22, SubLObject var23) {
        if (var21 == module0712.UNPROVIDED) {
            var21 = module0711.$g5593$.getDynamicValue();
        }
        if (var22 == module0712.UNPROVIDED) {
            var22 = module0711.$g5588$.getDynamicValue();
        }
        if (var23 == module0712.UNPROVIDED) {
            var23 = module0710.$g5582$.getDynamicValue();
        }
        final SubLThread var25 = SubLProcess.currentSubLThread();
        SubLObject var26 = (SubLObject)module0712.NIL;
        final SubLObject var27 = module0711.$g5588$.currentBinding(var25);
        try {
            module0711.$g5588$.bind(var22, var25);
            final SubLObject var28 = module0710.f43481(var23);
            var26 = Sequences.cconcatenate((module0712.NIL != var21) ? module0710.f43488(var28) : var28, module0711.f43588(var24, (SubLObject)module0712.T));
        }
        finally {
            module0711.$g5588$.rebind(var27, var25);
        }
        return var26;
    }
    
    public static SubLObject f43668(final SubLObject var24, SubLObject var21, SubLObject var22, SubLObject var23) {
        if (var21 == module0712.UNPROVIDED) {
            var21 = module0711.$g5593$.getDynamicValue();
        }
        if (var22 == module0712.UNPROVIDED) {
            var22 = module0711.$g5588$.getDynamicValue();
        }
        if (var23 == module0712.UNPROVIDED) {
            var23 = module0710.$g5582$.getDynamicValue();
        }
        final SubLThread var25 = SubLProcess.currentSubLThread();
        final SubLObject var26 = module0034.$g879$.getDynamicValue(var25);
        SubLObject var27 = (SubLObject)module0712.NIL;
        if (module0712.NIL == var26) {
            return f43669(var24, var21, var22, var23);
        }
        var27 = module0034.f1857(var26, (SubLObject)module0712.$ic27$, (SubLObject)module0712.UNPROVIDED);
        if (module0712.NIL == var27) {
            var27 = module0034.f1807(module0034.f1842(var26), (SubLObject)module0712.$ic27$, (SubLObject)module0712.FOUR_INTEGER, (SubLObject)module0712.$ic28$, (SubLObject)module0712.EQL, (SubLObject)module0712.UNPROVIDED);
            module0034.f1860(var26, (SubLObject)module0712.$ic27$, var27);
        }
        final SubLObject var28 = module0034.f1780(var24, var21, var22, var23);
        final SubLObject var29 = module0034.f1814(var27, var28, (SubLObject)module0712.UNPROVIDED);
        if (var29 != module0712.$ic19$) {
            SubLObject var30 = var29;
            SubLObject var31 = (SubLObject)module0712.NIL;
            var31 = var30.first();
            while (module0712.NIL != var30) {
                SubLObject var32 = var31.first();
                final SubLObject var33 = conses_high.second(var31);
                if (var24.eql(var32.first())) {
                    var32 = var32.rest();
                    if (var21.eql(var32.first())) {
                        var32 = var32.rest();
                        if (var22.eql(var32.first())) {
                            var32 = var32.rest();
                            if (module0712.NIL != var32 && module0712.NIL == var32.rest() && var23.eql(var32.first())) {
                                return module0034.f1959(var33);
                            }
                        }
                    }
                }
                var30 = var30.rest();
                var31 = var30.first();
            }
        }
        final SubLObject var34 = Values.arg2(var25.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f43669(var24, var21, var22, var23)));
        module0034.f1836(var27, var28, var29, var34, (SubLObject)ConsesLow.list(var24, var21, var22, var23));
        return module0034.f1959(var34);
    }
    
    public static SubLObject f43670(final SubLObject var20, SubLObject var21, SubLObject var22, SubLObject var23) {
        if (var21 == module0712.UNPROVIDED) {
            var21 = module0711.$g5593$.getDynamicValue();
        }
        if (var22 == module0712.UNPROVIDED) {
            var22 = module0711.$g5588$.getDynamicValue();
        }
        if (var23 == module0712.UNPROVIDED) {
            var23 = module0710.$g5582$.getDynamicValue();
        }
        assert module0712.NIL != module0173.f10955(var20) : var20;
        return f43671(var20, var21, var22, var23);
    }
    
    public static SubLObject f43672(final SubLObject var24, SubLObject var21, SubLObject var22, SubLObject var23) {
        if (var21 == module0712.UNPROVIDED) {
            var21 = module0711.$g5593$.getDynamicValue();
        }
        if (var22 == module0712.UNPROVIDED) {
            var22 = module0711.$g5588$.getDynamicValue();
        }
        if (var23 == module0712.UNPROVIDED) {
            var23 = module0710.$g5582$.getDynamicValue();
        }
        final SubLThread var25 = SubLProcess.currentSubLThread();
        if (module0712.NIL == Errors.$ignore_mustsP$.getDynamicValue(var25) && module0712.NIL == var22 && module0712.NIL == module0051.f3603(var23)) {
            Errors.error((SubLObject)module0712.$ic30$);
        }
        SubLObject var26 = (SubLObject)module0712.NIL;
        final SubLObject var27 = module0711.$g5588$.currentBinding(var25);
        final SubLObject var28 = module0710.$g5587$.currentBinding(var25);
        try {
            module0711.$g5588$.bind(var22, var25);
            module0710.$g5587$.bind(module0107.f7627(), var25);
            final SubLObject var29 = (module0712.NIL != var22) ? module0710.f43473(var23) : module0710.f43474(var23);
            var26 = Sequences.cconcatenate((module0712.NIL != var21) ? module0710.f43488(var29) : var29, module0711.f43588(var24, (SubLObject)module0712.T));
        }
        finally {
            module0710.$g5587$.rebind(var28, var25);
            module0711.$g5588$.rebind(var27, var25);
        }
        return var26;
    }
    
    public static SubLObject f43671(final SubLObject var24, SubLObject var21, SubLObject var22, SubLObject var23) {
        if (var21 == module0712.UNPROVIDED) {
            var21 = module0711.$g5593$.getDynamicValue();
        }
        if (var22 == module0712.UNPROVIDED) {
            var22 = module0711.$g5588$.getDynamicValue();
        }
        if (var23 == module0712.UNPROVIDED) {
            var23 = module0710.$g5582$.getDynamicValue();
        }
        final SubLThread var25 = SubLProcess.currentSubLThread();
        final SubLObject var26 = module0034.$g879$.getDynamicValue(var25);
        SubLObject var27 = (SubLObject)module0712.NIL;
        if (module0712.NIL == var26) {
            return f43672(var24, var21, var22, var23);
        }
        var27 = module0034.f1857(var26, (SubLObject)module0712.$ic29$, (SubLObject)module0712.UNPROVIDED);
        if (module0712.NIL == var27) {
            var27 = module0034.f1807(module0034.f1842(var26), (SubLObject)module0712.$ic29$, (SubLObject)module0712.FOUR_INTEGER, (SubLObject)module0712.$ic28$, (SubLObject)module0712.EQL, (SubLObject)module0712.UNPROVIDED);
            module0034.f1860(var26, (SubLObject)module0712.$ic29$, var27);
        }
        final SubLObject var28 = module0034.f1780(var24, var21, var22, var23);
        final SubLObject var29 = module0034.f1814(var27, var28, (SubLObject)module0712.UNPROVIDED);
        if (var29 != module0712.$ic19$) {
            SubLObject var30 = var29;
            SubLObject var31 = (SubLObject)module0712.NIL;
            var31 = var30.first();
            while (module0712.NIL != var30) {
                SubLObject var32 = var31.first();
                final SubLObject var33 = conses_high.second(var31);
                if (var24.eql(var32.first())) {
                    var32 = var32.rest();
                    if (var21.eql(var32.first())) {
                        var32 = var32.rest();
                        if (var22.eql(var32.first())) {
                            var32 = var32.rest();
                            if (module0712.NIL != var32 && module0712.NIL == var32.rest() && var23.eql(var32.first())) {
                                return module0034.f1959(var33);
                            }
                        }
                    }
                }
                var30 = var30.rest();
                var31 = var30.first();
            }
        }
        final SubLObject var34 = Values.arg2(var25.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f43672(var24, var21, var22, var23)));
        module0034.f1836(var27, var28, var29, var34, (SubLObject)ConsesLow.list(var24, var21, var22, var23));
        return module0034.f1959(var34);
    }
    
    public static SubLObject f43673(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var22 = (SubLObject)module0712.NIL;
        final SubLObject var23 = module0711.$g5595$.currentBinding(var21);
        final SubLObject var24 = module0711.$g5588$.currentBinding(var21);
        final SubLObject var25 = module0710.$g5582$.currentBinding(var21);
        final SubLObject var26 = module0711.$g5593$.currentBinding(var21);
        final SubLObject var27 = module0710.$g5584$.currentBinding(var21);
        final SubLObject var28 = module0710.$g5585$.currentBinding(var21);
        final SubLObject var29 = module0711.$g5600$.currentBinding(var21);
        try {
            module0711.$g5595$.bind((SubLObject)module0712.T, var21);
            module0711.$g5588$.bind((SubLObject)module0712.T, var21);
            module0710.$g5582$.bind((SubLObject)module0712.NIL, var21);
            module0711.$g5593$.bind((SubLObject)module0712.NIL, var21);
            module0710.$g5584$.bind((SubLObject)module0712.T, var21);
            module0710.$g5585$.bind((SubLObject)module0712.T, var21);
            module0711.$g5600$.bind((SubLObject)module0712.T, var21);
            var22 = f43671(var20, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED);
        }
        finally {
            module0711.$g5600$.rebind(var29, var21);
            module0710.$g5585$.rebind(var28, var21);
            module0710.$g5584$.rebind(var27, var21);
            module0711.$g5593$.rebind(var26, var21);
            module0710.$g5582$.rebind(var25, var21);
            module0711.$g5588$.rebind(var24, var21);
            module0711.$g5595$.rebind(var23, var21);
        }
        return var22;
    }
    
    public static SubLObject f43674(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var22 = (SubLObject)module0712.NIL;
        final SubLObject var23 = module0711.$g5595$.currentBinding(var21);
        final SubLObject var24 = module0711.$g5588$.currentBinding(var21);
        final SubLObject var25 = module0710.$g5582$.currentBinding(var21);
        final SubLObject var26 = module0711.$g5593$.currentBinding(var21);
        final SubLObject var27 = module0710.$g5584$.currentBinding(var21);
        final SubLObject var28 = module0710.$g5585$.currentBinding(var21);
        final SubLObject var29 = module0711.$g5600$.currentBinding(var21);
        try {
            module0711.$g5595$.bind((SubLObject)module0712.T, var21);
            module0711.$g5588$.bind((SubLObject)module0712.T, var21);
            module0710.$g5582$.bind((SubLObject)module0712.NIL, var21);
            module0711.$g5593$.bind((SubLObject)module0712.NIL, var21);
            module0710.$g5584$.bind((SubLObject)module0712.T, var21);
            module0710.$g5585$.bind((SubLObject)module0712.T, var21);
            module0711.$g5600$.bind((SubLObject)module0712.T, var21);
            var22 = f43670(var20, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED);
        }
        finally {
            module0711.$g5600$.rebind(var29, var21);
            module0710.$g5585$.rebind(var28, var21);
            module0710.$g5584$.rebind(var27, var21);
            module0711.$g5593$.rebind(var26, var21);
            module0710.$g5582$.rebind(var25, var21);
            module0711.$g5588$.rebind(var24, var21);
            module0711.$g5595$.rebind(var23, var21);
        }
        return var22;
    }
    
    public static SubLObject f43675(final SubLObject var20, SubLObject var42) {
        if (var42 == module0712.UNPROVIDED) {
            var42 = module0710.$g5582$.getDynamicValue();
        }
        final SubLThread var43 = SubLProcess.currentSubLThread();
        SubLObject var44 = (SubLObject)module0712.NIL;
        final SubLObject var45 = module0711.$g5595$.currentBinding(var43);
        final SubLObject var46 = module0711.$g5588$.currentBinding(var43);
        final SubLObject var47 = module0710.$g5582$.currentBinding(var43);
        final SubLObject var48 = module0711.$g5593$.currentBinding(var43);
        final SubLObject var49 = module0710.$g5584$.currentBinding(var43);
        final SubLObject var50 = module0710.$g5585$.currentBinding(var43);
        final SubLObject var51 = module0711.$g5600$.currentBinding(var43);
        try {
            module0711.$g5595$.bind((SubLObject)module0712.T, var43);
            module0711.$g5588$.bind((SubLObject)module0712.T, var43);
            module0710.$g5582$.bind(var42, var43);
            module0711.$g5593$.bind((SubLObject)module0712.NIL, var43);
            module0710.$g5584$.bind((SubLObject)module0712.T, var43);
            module0710.$g5585$.bind((SubLObject)module0712.T, var43);
            module0711.$g5600$.bind((SubLObject)module0712.T, var43);
            var44 = f43670(var20, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED);
        }
        finally {
            module0711.$g5600$.rebind(var51, var43);
            module0710.$g5585$.rebind(var50, var43);
            module0710.$g5584$.rebind(var49, var43);
            module0711.$g5593$.rebind(var48, var43);
            module0710.$g5582$.rebind(var47, var43);
            module0711.$g5588$.rebind(var46, var43);
            module0711.$g5595$.rebind(var45, var43);
        }
        return var44;
    }
    
    public static SubLObject f43676(final SubLObject var20, SubLObject var42) {
        if (var42 == module0712.UNPROVIDED) {
            var42 = module0710.$g5582$.getDynamicValue();
        }
        final SubLThread var43 = SubLProcess.currentSubLThread();
        SubLObject var44 = (SubLObject)module0712.NIL;
        final SubLObject var45 = module0711.$g5595$.currentBinding(var43);
        final SubLObject var46 = module0711.$g5588$.currentBinding(var43);
        final SubLObject var47 = module0710.$g5582$.currentBinding(var43);
        final SubLObject var48 = module0711.$g5593$.currentBinding(var43);
        final SubLObject var49 = module0710.$g5584$.currentBinding(var43);
        final SubLObject var50 = module0710.$g5585$.currentBinding(var43);
        final SubLObject var51 = module0711.$g5600$.currentBinding(var43);
        final SubLObject var52 = module0711.$g5588$.currentBinding(var43);
        final SubLObject var53 = module0710.$g5582$.currentBinding(var43);
        try {
            module0711.$g5595$.bind((SubLObject)module0712.T, var43);
            module0711.$g5588$.bind((SubLObject)module0712.T, var43);
            module0710.$g5582$.bind(var42, var43);
            module0711.$g5593$.bind((SubLObject)module0712.NIL, var43);
            module0710.$g5584$.bind((SubLObject)module0712.T, var43);
            module0710.$g5585$.bind((SubLObject)module0712.T, var43);
            module0711.$g5600$.bind((SubLObject)module0712.T, var43);
            module0711.$g5588$.bind((SubLObject)module0712.NIL, var43);
            module0710.$g5582$.bind(var42, var43);
            if (module0712.NIL == Errors.$ignore_mustsP$.getDynamicValue(var43) && module0712.NIL == module0051.f3603(var42)) {
                Errors.error((SubLObject)module0712.$ic33$, var42);
            }
            var44 = f43670(var20, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED);
        }
        finally {
            module0710.$g5582$.rebind(var53, var43);
            module0711.$g5588$.rebind(var52, var43);
            module0711.$g5600$.rebind(var51, var43);
            module0710.$g5585$.rebind(var50, var43);
            module0710.$g5584$.rebind(var49, var43);
            module0711.$g5593$.rebind(var48, var43);
            module0710.$g5582$.rebind(var47, var43);
            module0711.$g5588$.rebind(var46, var43);
            module0711.$g5595$.rebind(var45, var43);
        }
        return var44;
    }
    
    public static SubLObject f43677(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var22 = (SubLObject)module0712.NIL;
        final SubLObject var23 = module0711.$g5595$.currentBinding(var21);
        final SubLObject var24 = module0711.$g5588$.currentBinding(var21);
        final SubLObject var25 = module0710.$g5582$.currentBinding(var21);
        final SubLObject var26 = module0711.$g5593$.currentBinding(var21);
        final SubLObject var27 = module0710.$g5584$.currentBinding(var21);
        final SubLObject var28 = module0710.$g5585$.currentBinding(var21);
        final SubLObject var29 = module0711.$g5600$.currentBinding(var21);
        try {
            module0711.$g5595$.bind((SubLObject)module0712.T, var21);
            module0711.$g5588$.bind((SubLObject)module0712.T, var21);
            module0710.$g5582$.bind((SubLObject)module0712.NIL, var21);
            module0711.$g5593$.bind((SubLObject)module0712.NIL, var21);
            module0710.$g5584$.bind((SubLObject)module0712.T, var21);
            module0710.$g5585$.bind((SubLObject)module0712.T, var21);
            module0711.$g5600$.bind((SubLObject)module0712.T, var21);
            var22 = f43667(var20, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED);
        }
        finally {
            module0711.$g5600$.rebind(var29, var21);
            module0710.$g5585$.rebind(var28, var21);
            module0710.$g5584$.rebind(var27, var21);
            module0711.$g5593$.rebind(var26, var21);
            module0710.$g5582$.rebind(var25, var21);
            module0711.$g5588$.rebind(var24, var21);
            module0711.$g5595$.rebind(var23, var21);
        }
        return var22;
    }
    
    public static SubLObject f43678(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        final SubLObject var22 = module0711.$g5588$.currentBinding(var21);
        final SubLObject var23 = module0711.$g5593$.currentBinding(var21);
        final SubLObject var24 = module0710.$g5582$.currentBinding(var21);
        try {
            module0711.$g5588$.bind((SubLObject)module0712.NIL, var21);
            module0711.$g5593$.bind((SubLObject)module0712.T, var21);
            module0710.$g5582$.bind((SubLObject)module0712.NIL, var21);
            SubLObject var25 = (SubLObject)module0712.NIL;
            var25 = f43667(var20, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED);
            return var25;
        }
        finally {
            module0710.$g5582$.rebind(var24, var21);
            module0711.$g5593$.rebind(var23, var21);
            module0711.$g5588$.rebind(var22, var21);
        }
    }
    
    public static SubLObject f43679(final SubLObject var20, SubLObject var42) {
        if (var42 == module0712.UNPROVIDED) {
            var42 = module0710.$g5582$.getDynamicValue();
        }
        final SubLThread var43 = SubLProcess.currentSubLThread();
        SubLObject var44 = (SubLObject)module0712.NIL;
        final SubLObject var45 = module0711.$g5595$.currentBinding(var43);
        final SubLObject var46 = module0711.$g5588$.currentBinding(var43);
        final SubLObject var47 = module0710.$g5582$.currentBinding(var43);
        final SubLObject var48 = module0711.$g5593$.currentBinding(var43);
        final SubLObject var49 = module0710.$g5584$.currentBinding(var43);
        final SubLObject var50 = module0710.$g5585$.currentBinding(var43);
        final SubLObject var51 = module0711.$g5600$.currentBinding(var43);
        try {
            module0711.$g5595$.bind((SubLObject)module0712.T, var43);
            module0711.$g5588$.bind((SubLObject)module0712.T, var43);
            module0710.$g5582$.bind(var42, var43);
            module0711.$g5593$.bind((SubLObject)module0712.NIL, var43);
            module0710.$g5584$.bind((SubLObject)module0712.T, var43);
            module0710.$g5585$.bind((SubLObject)module0712.T, var43);
            module0711.$g5600$.bind((SubLObject)module0712.T, var43);
            var44 = f43667(var20, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED);
        }
        finally {
            module0711.$g5600$.rebind(var51, var43);
            module0710.$g5585$.rebind(var50, var43);
            module0710.$g5584$.rebind(var49, var43);
            module0711.$g5593$.rebind(var48, var43);
            module0710.$g5582$.rebind(var47, var43);
            module0711.$g5588$.rebind(var46, var43);
            module0711.$g5595$.rebind(var45, var43);
        }
        return var44;
    }
    
    public static SubLObject f43680(final SubLObject var20, SubLObject var42) {
        if (var42 == module0712.UNPROVIDED) {
            var42 = module0710.$g5582$.getDynamicValue();
        }
        final SubLThread var43 = SubLProcess.currentSubLThread();
        SubLObject var44 = (SubLObject)module0712.NIL;
        final SubLObject var45 = module0711.$g5595$.currentBinding(var43);
        final SubLObject var46 = module0711.$g5588$.currentBinding(var43);
        final SubLObject var47 = module0710.$g5582$.currentBinding(var43);
        final SubLObject var48 = module0711.$g5593$.currentBinding(var43);
        final SubLObject var49 = module0710.$g5584$.currentBinding(var43);
        final SubLObject var50 = module0710.$g5585$.currentBinding(var43);
        final SubLObject var51 = module0711.$g5600$.currentBinding(var43);
        final SubLObject var52 = module0711.$g5588$.currentBinding(var43);
        final SubLObject var53 = module0710.$g5582$.currentBinding(var43);
        try {
            module0711.$g5595$.bind((SubLObject)module0712.T, var43);
            module0711.$g5588$.bind((SubLObject)module0712.T, var43);
            module0710.$g5582$.bind(var42, var43);
            module0711.$g5593$.bind((SubLObject)module0712.NIL, var43);
            module0710.$g5584$.bind((SubLObject)module0712.T, var43);
            module0710.$g5585$.bind((SubLObject)module0712.T, var43);
            module0711.$g5600$.bind((SubLObject)module0712.T, var43);
            module0711.$g5588$.bind((SubLObject)module0712.NIL, var43);
            module0710.$g5582$.bind(var42, var43);
            if (module0712.NIL == Errors.$ignore_mustsP$.getDynamicValue(var43) && module0712.NIL == module0051.f3603(var42)) {
                Errors.error((SubLObject)module0712.$ic33$, var42);
            }
            var44 = f43667(var20, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED);
        }
        finally {
            module0710.$g5582$.rebind(var53, var43);
            module0711.$g5588$.rebind(var52, var43);
            module0711.$g5600$.rebind(var51, var43);
            module0710.$g5585$.rebind(var50, var43);
            module0710.$g5584$.rebind(var49, var43);
            module0711.$g5593$.rebind(var48, var43);
            module0710.$g5582$.rebind(var47, var43);
            module0711.$g5588$.rebind(var46, var43);
            module0711.$g5595$.rebind(var45, var43);
        }
        return var44;
    }
    
    public static SubLObject f43681() {
        final SubLObject var3 = module0712.$g5647$.getGlobalValue();
        if (module0712.NIL != var3) {
            module0034.f1818(var3);
        }
        return (SubLObject)module0712.NIL;
    }
    
    public static SubLObject f43682() {
        return module0034.f1829(module0712.$g5647$.getGlobalValue(), (SubLObject)ConsesLow.list(module0712.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED);
    }
    
    public static SubLObject f43683() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0077.f5313(Symbols.symbol_function((SubLObject)module0712.EQL), (SubLObject)module0712.$ic37$);
        final SubLObject var4 = module0712.$g5646$.getDynamicValue(var2);
        SubLObject var5 = (SubLObject)module0712.NIL;
        try {
            final SubLObject var6 = stream_macros.$stream_requires_locking$.currentBinding(var2);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0712.NIL, var2);
                var5 = compatibility.open_text(var4, (SubLObject)module0712.$ic38$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var6, var2);
            }
            if (!var5.isStream()) {
                Errors.error((SubLObject)module0712.$ic39$, var4);
            }
            final SubLObject var7 = var5;
            if (var7.isStream()) {
                final SubLObject var49_50 = var7;
                SubLObject var8 = (SubLObject)module0712.NIL;
                SubLObject var9 = (SubLObject)module0712.NIL;
                var8 = (SubLObject)module0712.ZERO_INTEGER;
                for (var9 = module0075.f5202(var49_50); module0712.NIL != var9; var9 = module0075.f5202(var49_50)) {
                    final SubLObject var10 = module0038.f2738(var9, (SubLObject)ConsesLow.list((SubLObject)Characters.CHAR_comma), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0712.$ic40$, (SubLObject)module0712.$ic40$)), (SubLObject)module0712.NIL, (SubLObject)module0712.NIL, (SubLObject)ConsesLow.list((SubLObject)Characters.CHAR_backslash), (SubLObject)module0712.UNPROVIDED);
                    final SubLObject var11 = reader.read_from_string(var10.first(), (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED);
                    final SubLObject var12 = module0213.f13917(var11);
                    if (module0712.NIL != module0173.f10955(var12)) {
                        module0077.f5326(var12, var3);
                    }
                    var8 = module0048.f_1X(var8);
                }
            }
        }
        finally {
            final SubLObject var13 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0712.T, var2);
                if (var5.isStream()) {
                    streams_high.close(var5, (SubLObject)module0712.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var13, var2);
            }
        }
        return var3;
    }
    
    public static SubLObject f43684() {
        SubLObject var4 = module0712.$g5647$.getGlobalValue();
        if (module0712.NIL == var4) {
            var4 = module0034.f1934((SubLObject)module0712.$ic36$, (SubLObject)module0712.$ic41$, (SubLObject)module0712.NIL, (SubLObject)module0712.EQL, (SubLObject)module0712.ZERO_INTEGER, (SubLObject)module0712.ZERO_INTEGER);
        }
        SubLObject var5 = module0034.f1810(var4, (SubLObject)module0712.UNPROVIDED);
        if (var5 == module0712.$ic19$) {
            var5 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f43683()));
            module0034.f1812(var4, var5, (SubLObject)module0712.UNPROVIDED);
        }
        return module0034.f1959(var5);
    }
    
    public static SubLObject f43685() {
        final SubLObject var3 = module0712.$g5648$.getGlobalValue();
        if (module0712.NIL != var3) {
            module0034.f1818(var3);
        }
        return (SubLObject)module0712.NIL;
    }
    
    public static SubLObject f43686() {
        return module0034.f1829(module0712.$g5648$.getGlobalValue(), (SubLObject)ConsesLow.list(module0712.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED);
    }
    
    public static SubLObject f43687() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0077.f5313(Symbols.symbol_function((SubLObject)module0712.EQUAL), (SubLObject)module0712.$ic37$);
        final SubLObject var4 = module0712.$g5646$.getDynamicValue(var2);
        SubLObject var5 = (SubLObject)module0712.NIL;
        try {
            final SubLObject var6 = stream_macros.$stream_requires_locking$.currentBinding(var2);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0712.NIL, var2);
                var5 = compatibility.open_text(var4, (SubLObject)module0712.$ic38$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var6, var2);
            }
            if (!var5.isStream()) {
                Errors.error((SubLObject)module0712.$ic39$, var4);
            }
            final SubLObject var7 = var5;
            if (var7.isStream()) {
                final SubLObject var49_57 = var7;
                SubLObject var8 = (SubLObject)module0712.NIL;
                SubLObject var9 = (SubLObject)module0712.NIL;
                var8 = (SubLObject)module0712.ZERO_INTEGER;
                for (var9 = module0075.f5202(var49_57); module0712.NIL != var9; var9 = module0075.f5202(var49_57)) {
                    final SubLObject var10 = module0038.f2738(var9, (SubLObject)ConsesLow.list((SubLObject)Characters.CHAR_comma), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0712.$ic40$, (SubLObject)module0712.$ic40$)), (SubLObject)module0712.NIL, (SubLObject)module0712.NIL, (SubLObject)ConsesLow.list((SubLObject)Characters.CHAR_backslash), (SubLObject)module0712.UNPROVIDED);
                    final SubLObject var11 = reader.read_from_string(var10.first(), (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED);
                    module0077.f5326(var11, var3);
                    var8 = module0048.f_1X(var8);
                }
            }
        }
        finally {
            final SubLObject var12 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0712.T, var2);
                if (var5.isStream()) {
                    streams_high.close(var5, (SubLObject)module0712.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var12, var2);
            }
        }
        return var3;
    }
    
    public static SubLObject f43688() {
        SubLObject var4 = module0712.$g5648$.getGlobalValue();
        if (module0712.NIL == var4) {
            var4 = module0034.f1934((SubLObject)module0712.$ic42$, (SubLObject)module0712.$ic43$, (SubLObject)module0712.NIL, (SubLObject)module0712.EQL, (SubLObject)module0712.ZERO_INTEGER, (SubLObject)module0712.ZERO_INTEGER);
        }
        SubLObject var5 = module0034.f1810(var4, (SubLObject)module0712.UNPROVIDED);
        if (var5 == module0712.$ic19$) {
            var5 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f43687()));
            module0034.f1812(var4, var5, (SubLObject)module0712.UNPROVIDED);
        }
        return module0034.f1959(var5);
    }
    
    public static SubLObject f43689(final SubLObject var20) {
        return module0077.f5320(module0213.f13918(var20), f43688());
    }
    
    public static SubLObject f43690(final SubLObject var58, final SubLObject var59, SubLObject var60) {
        if (var60 == module0712.UNPROVIDED) {
            var60 = module0587.$g4457$.getDynamicValue();
        }
        final SubLThread var61 = SubLProcess.currentSubLThread();
        final SubLObject var62 = module0220.f14565(var58, module0712.$ic44$, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED);
        SubLObject var63 = (SubLObject)module0712.NIL;
        final SubLObject var64 = module0711.$g5603$.currentBinding(var61);
        final SubLObject var65 = module0711.$g5602$.currentBinding(var61);
        final SubLObject var66 = module0711.$g5594$.currentBinding(var61);
        try {
            module0711.$g5603$.bind(var58, var61);
            module0711.$g5602$.bind((module0712.NIL != module0220.f14556(var58, module0712.$ic45$, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED)) ? module0220.f14556(var58, module0712.$ic45$, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED) : module0711.$g5602$.getDynamicValue(var61), var61);
            module0711.$g5594$.bind(var59, var61);
            SubLObject var67 = module0220.f14565(var58, module0712.$ic46$, (SubLObject)module0712.TWO_INTEGER, (SubLObject)module0712.ONE_INTEGER, (SubLObject)module0712.UNPROVIDED);
            SubLObject var68 = (SubLObject)module0712.NIL;
            var68 = var67.first();
            while (module0712.NIL != var67) {
                final SubLObject var69 = var68;
                if (module0712.NIL == conses_high.member(var69, var63, Symbols.symbol_function((SubLObject)module0712.EQL), Symbols.symbol_function((SubLObject)module0712.IDENTITY))) {
                    var63 = (SubLObject)ConsesLow.cons(var69, var63);
                }
                var67 = var67.rest();
                var68 = var67.first();
            }
            var67 = module0220.f14565(var58, module0712.$ic47$, (SubLObject)module0712.TWO_INTEGER, (SubLObject)module0712.ONE_INTEGER, (SubLObject)module0712.UNPROVIDED);
            var68 = (SubLObject)module0712.NIL;
            var68 = var67.first();
            while (module0712.NIL != var67) {
                final SubLObject var69 = var68;
                if (module0712.NIL == conses_high.member(var69, var63, Symbols.symbol_function((SubLObject)module0712.EQL), Symbols.symbol_function((SubLObject)module0712.IDENTITY))) {
                    var63 = (SubLObject)ConsesLow.cons(var69, var63);
                }
                var67 = var67.rest();
                var68 = var67.first();
            }
            var67 = var62;
            SubLObject var70 = (SubLObject)module0712.NIL;
            var70 = var67.first();
            while (module0712.NIL != var67) {
                SubLObject var8_65 = module0259.f16995(var70);
                SubLObject var71 = (SubLObject)module0712.NIL;
                var71 = var8_65.first();
                while (module0712.NIL != var8_65) {
                    final SubLObject var72 = var71;
                    if (module0712.NIL == conses_high.member(var72, var63, Symbols.symbol_function((SubLObject)module0712.EQL), Symbols.symbol_function((SubLObject)module0712.IDENTITY))) {
                        var63 = (SubLObject)ConsesLow.cons(var72, var63);
                    }
                    var8_65 = var8_65.rest();
                    var71 = var8_65.first();
                }
                var67 = var67.rest();
                var70 = var67.first();
            }
            return f43691(var63, var60, (SubLObject)module0712.UNPROVIDED);
        }
        finally {
            module0711.$g5594$.rebind(var66, var61);
            module0711.$g5602$.rebind(var65, var61);
            module0711.$g5603$.rebind(var64, var61);
        }
    }
    
    public static SubLObject f43692(SubLObject var60) {
        if (var60 == module0712.UNPROVIDED) {
            var60 = module0587.$g4457$.getDynamicValue();
        }
        final SubLThread var61 = SubLProcess.currentSubLThread();
        var61.resetMultipleValues();
        final SubLObject var62 = module0711.f43520(module0173.f10959());
        final SubLObject var63 = var61.secondMultipleValue();
        var61.resetMultipleValues();
        return f43693(var62, var63, var60, (SubLObject)module0712.UNPROVIDED);
    }
    
    public static SubLObject f43691(final SubLObject var62, SubLObject var60, SubLObject var68) {
        if (var60 == module0712.UNPROVIDED) {
            var60 = module0587.$g4457$.getDynamicValue();
        }
        if (var68 == module0712.UNPROVIDED) {
            var68 = (SubLObject)module0712.NIL;
        }
        final SubLThread var69 = SubLProcess.currentSubLThread();
        assert module0712.NIL != module0035.f2015(var62) : var62;
        SubLObject var70 = var62;
        SubLObject var71 = (SubLObject)module0712.NIL;
        var71 = var70.first();
        while (module0712.NIL != var70) {
            assert module0712.NIL != module0711.f43556(var71) : var71;
            var70 = var70.rest();
            var71 = var70.first();
        }
        if (var68.isFunctionSpec()) {
            SubLObject var72 = (SubLObject)module0712.NIL;
            final SubLObject var73 = module0711.$g5597$.currentBinding(var69);
            try {
                module0711.$g5597$.bind(module0078.f5367(module0035.remove_if_not((SubLObject)module0712.$ic26$, var62, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED), (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED), var69);
                SubLObject var74 = var62;
                SubLObject var75 = (SubLObject)module0712.NIL;
                var75 = var74.first();
                while (module0712.NIL != var74) {
                    final SubLObject var76 = Functions.funcall(var68, var75);
                    if (module0712.NIL != module0035.f2012(var76)) {
                        Errors.sublisp_break((SubLObject)module0712.$ic50$, new SubLObject[] { var75 });
                    }
                    SubLObject var8_73 = var76;
                    SubLObject var77 = (SubLObject)module0712.NIL;
                    var77 = var8_73.first();
                    while (module0712.NIL != var8_73) {
                        final SubLObject var78 = var77;
                        if (module0712.NIL == conses_high.member(var78, var72, Symbols.symbol_function((SubLObject)module0712.EQUAL), Symbols.symbol_function((SubLObject)module0712.IDENTITY))) {
                            var72 = (SubLObject)ConsesLow.cons(var78, var72);
                        }
                        var8_73 = var8_73.rest();
                        var77 = var8_73.first();
                    }
                    var74 = var74.rest();
                    var75 = var74.first();
                }
                module0711.f43497(var72);
                f43694(var72, module0710.$g5584$.getDynamicValue(var69), var60, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED);
            }
            finally {
                module0711.$g5597$.rebind(var73, var69);
            }
        }
        else {
            var69.resetMultipleValues();
            final SubLObject var79 = module0711.f43520(module0052.f3709(var62));
            final SubLObject var80 = var69.secondMultipleValue();
            var69.resetMultipleValues();
            f43693(var79, var80, var60, (SubLObject)module0712.UNPROVIDED);
        }
        return (SubLObject)module0712.NIL;
    }
    
    public static SubLObject f43695() {
        final SubLObject var3 = module0712.$g5650$.getGlobalValue();
        if (module0712.NIL != var3) {
            module0034.f1818(var3);
        }
        return (SubLObject)module0712.NIL;
    }
    
    public static SubLObject f43696() {
        return module0034.f1829(module0712.$g5650$.getGlobalValue(), (SubLObject)ConsesLow.list(module0712.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED);
    }
    
    public static SubLObject f43697() {
        return Sequences.delete_duplicates(Sequences.delete_if((SubLObject)module0712.$ic53$, module0035.delete_if_not((SubLObject)module0712.$ic54$, ConsesLow.append(module0259.f16847(module0712.$ic55$), (SubLObject)module0712.$ic56$), (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED), (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED), (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED);
    }
    
    public static SubLObject f43698() {
        SubLObject var4 = module0712.$g5650$.getGlobalValue();
        if (module0712.NIL == var4) {
            var4 = module0034.f1934((SubLObject)module0712.$ic52$, (SubLObject)module0712.$ic57$, (SubLObject)module0712.NIL, (SubLObject)module0712.EQL, (SubLObject)module0712.ZERO_INTEGER, (SubLObject)module0712.ZERO_INTEGER);
            module0034.f1953((SubLObject)module0712.$ic58$);
        }
        SubLObject var5 = module0034.f1810(var4, (SubLObject)module0712.UNPROVIDED);
        if (var5 == module0712.$ic19$) {
            var5 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f43697()));
            module0034.f1812(var4, var5, (SubLObject)module0712.UNPROVIDED);
        }
        return module0034.f1959(var5);
    }
    
    public static SubLObject f43699(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var22 = (SubLObject)module0712.NIL;
        final SubLObject var23 = module0147.$g2094$.currentBinding(var21);
        final SubLObject var24 = module0147.$g2095$.currentBinding(var21);
        try {
            module0147.$g2094$.bind((SubLObject)module0712.$ic59$, var21);
            module0147.$g2095$.bind(module0712.$ic60$, var21);
            SubLObject var25 = (SubLObject)module0712.$ic63$;
            SubLObject var26 = (SubLObject)module0712.NIL;
            var26 = var25.first();
            while (module0712.NIL != var25) {
                final SubLObject var27 = var26;
                if (module0712.NIL != module0158.f10010(var20, (SubLObject)module0712.ONE_INTEGER, var27)) {
                    final SubLObject var28 = module0158.f10011(var20, (SubLObject)module0712.ONE_INTEGER, var27);
                    SubLObject var29 = (SubLObject)module0712.NIL;
                    final SubLObject var30 = (SubLObject)module0712.NIL;
                    while (module0712.NIL == var29) {
                        final SubLObject var31 = module0052.f3695(var28, var30);
                        final SubLObject var32 = (SubLObject)SubLObjectFactory.makeBoolean(!var30.eql(var31));
                        if (module0712.NIL != var32) {
                            SubLObject var33 = (SubLObject)module0712.NIL;
                            try {
                                var33 = module0158.f10316(var31, (SubLObject)module0712.$ic61$, (SubLObject)module0712.$ic62$, (SubLObject)module0712.NIL);
                                SubLObject var80_85 = (SubLObject)module0712.NIL;
                                final SubLObject var81_86 = (SubLObject)module0712.NIL;
                                while (module0712.NIL == var80_85) {
                                    final SubLObject var34 = module0052.f3695(var33, var81_86);
                                    final SubLObject var83_88 = (SubLObject)SubLObjectFactory.makeBoolean(!var81_86.eql(var34));
                                    if (module0712.NIL != var83_88 && module0712.NIL == f43700(var34)) {
                                        final SubLObject var35 = module0178.f11285(var34);
                                        if (module0712.NIL == conses_high.member(var35, var22, Symbols.symbol_function((SubLObject)module0712.EQUAL), Symbols.symbol_function((SubLObject)module0712.IDENTITY))) {
                                            var22 = (SubLObject)ConsesLow.cons(var35, var22);
                                        }
                                    }
                                    var80_85 = (SubLObject)SubLObjectFactory.makeBoolean(module0712.NIL == var83_88);
                                }
                            }
                            finally {
                                final SubLObject var25_89 = Threads.$is_thread_performing_cleanupP$.currentBinding(var21);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0712.T, var21);
                                    if (module0712.NIL != var33) {
                                        module0158.f10319(var33);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var25_89, var21);
                                }
                            }
                        }
                        var29 = (SubLObject)SubLObjectFactory.makeBoolean(module0712.NIL == var32);
                    }
                }
                var25 = var25.rest();
                var26 = var25.first();
            }
            if (module0712.NIL != module0269.f17710(var20)) {
                var25 = module0256.f16529(module0259.f16857(var20, module0712.$g5649$.getDynamicValue(var21), (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED), (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED);
                SubLObject var36 = (SubLObject)module0712.NIL;
                var36 = var25.first();
                while (module0712.NIL != var25) {
                    final SubLObject var37 = module0202.f12768(module0712.$ic64$, var20, var36);
                    if (module0712.NIL == conses_high.member(var37, var22, Symbols.symbol_function((SubLObject)module0712.EQUAL), Symbols.symbol_function((SubLObject)module0712.IDENTITY))) {
                        var22 = (SubLObject)ConsesLow.cons(var37, var22);
                    }
                    var25 = var25.rest();
                    var36 = var25.first();
                }
                var22 = Sequences.delete_duplicates(ConsesLow.append(var22, f43701(var20)), Symbols.symbol_function((SubLObject)module0712.EQUAL), (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED);
            }
            else if (module0712.NIL != module0269.f17716(var20)) {
                var25 = module0256.f16529(module0259.f16857(var20, f43698(), (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED), (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED);
                SubLObject var36 = (SubLObject)module0712.NIL;
                var36 = var25.first();
                while (module0712.NIL != var25) {
                    final SubLObject var37 = module0202.f12768(module0712.$ic64$, var20, var36);
                    if (module0712.NIL == conses_high.member(var37, var22, Symbols.symbol_function((SubLObject)module0712.EQUAL), Symbols.symbol_function((SubLObject)module0712.IDENTITY))) {
                        var22 = (SubLObject)ConsesLow.cons(var37, var22);
                    }
                    var25 = var25.rest();
                    var36 = var25.first();
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var24, var21);
            module0147.$g2094$.rebind(var23, var21);
        }
        return var22;
    }
    
    public static SubLObject f43701(final SubLObject var20) {
        if (module0712.NIL == module0269.f17710(var20)) {
            return (SubLObject)module0712.NIL;
        }
        final SubLObject var21 = module0256.f16525(var20, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED);
        SubLObject var22 = (SubLObject)module0712.NIL;
        SubLObject var23 = var21;
        SubLObject var24 = (SubLObject)module0712.NIL;
        var24 = var23.first();
        while (module0712.NIL != var23) {
            var22 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module0712.$ic65$, var20, var24), var22);
            var23 = var23.rest();
            var24 = var23.first();
        }
        return var22;
    }
    
    public static SubLObject f43700(final SubLObject var87) {
        final SubLThread var88 = SubLProcess.currentSubLThread();
        if (module0712.NIL != module0035.find_if_not((SubLObject)module0712.$ic26$, module0178.f11330(var87), (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED)) {
            return (SubLObject)module0712.T;
        }
        if (module0712.NIL != module0269.f17710(module0178.f11334(var87)) && module0712.$ic64$.eql(module0178.f11333(var87)) && module0712.NIL == conses_high.member(module0178.f11335(var87), module0712.$g5649$.getDynamicValue(var88), (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED)) {
            return (SubLObject)module0712.T;
        }
        if (module0712.NIL != module0269.f17716(module0178.f11334(var87))) {
            return (SubLObject)SubLObjectFactory.makeBoolean((module0712.$ic64$.eql(module0178.f11333(var87)) && module0712.NIL == conses_high.member(module0178.f11335(var87), f43698(), (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED)) || (module0712.NIL != module0269.f17716(module0178.f11335(var87)) && module0712.NIL != module0167.f10813(module0178.f11335(var87))));
        }
        return (SubLObject)module0712.NIL;
    }
    
    public static SubLObject f43702(final SubLObject var45) {
        final SubLThread var46 = SubLProcess.currentSubLThread();
        final SubLObject var47 = module0077.f5313(Symbols.symbol_function((SubLObject)module0712.EQL), Sequences.length(var45));
        final SubLObject var48 = module0055.f4017();
        SubLObject var49 = var45;
        SubLObject var50 = (SubLObject)module0712.NIL;
        var50 = var49.first();
        while (module0712.NIL != var49) {
            module0055.f4021(var50, var48);
            var49 = var49.rest();
            var50 = var49.first();
        }
        while (module0712.NIL == module0055.f4019(var48)) {
            final SubLObject var51 = module0055.f4023(var48);
            module0077.f5326(var51, var47);
            if (module0712.NIL != module0269.f17710(var51)) {
                var46.resetMultipleValues();
                final SubLObject var52 = module0711.f43524(var51);
                final SubLObject var53 = var46.secondMultipleValue();
                var46.resetMultipleValues();
                if (module0712.NIL != var52) {
                    SubLObject var54 = var53;
                    SubLObject var55 = (SubLObject)module0712.NIL;
                    var55 = var54.first();
                    while (module0712.NIL != var54) {
                        if (module0712.NIL != module0077.f5326(var55, var47)) {
                            module0055.f4021(var55, var48);
                        }
                        var54 = var54.rest();
                        var55 = var54.first();
                    }
                }
            }
            SubLObject var56 = f43699(var51);
            SubLObject var57 = (SubLObject)module0712.NIL;
            var57 = var56.first();
            while (module0712.NIL != var56) {
                final SubLObject var58 = module0205.f13388(var57, (SubLObject)module0712.UNPROVIDED);
                if (module0712.NIL != module0077.f5326(var58, var47)) {
                    module0055.f4021(var58, var48);
                }
                var56 = var56.rest();
                var57 = var56.first();
            }
        }
        return module0077.f5312(var47);
    }
    
    public static SubLObject f43694(final SubLObject var71, SubLObject var99, SubLObject var60, SubLObject var100, SubLObject var26) {
        if (var99 == module0712.UNPROVIDED) {
            var99 = module0710.$g5584$.getDynamicValue();
        }
        if (var60 == module0712.UNPROVIDED) {
            var60 = module0587.$g4457$.getDynamicValue();
        }
        if (var100 == module0712.UNPROVIDED) {
            var100 = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (var26 == module0712.UNPROVIDED) {
            var26 = module0710.f43485((SubLObject)module0712.UNPROVIDED);
        }
        final SubLThread var101 = SubLProcess.currentSubLThread();
        final SubLObject var103;
        final SubLObject var102 = var103 = module0034.f1888();
        final SubLObject var104 = module0034.$g879$.currentBinding(var101);
        try {
            module0034.$g879$.bind(var103, var101);
            SubLObject var105 = (SubLObject)module0712.NIL;
            if (module0712.NIL != var103 && module0712.NIL == module0034.f1842(var103)) {
                var105 = module0034.f1869(var103);
                final SubLObject var106 = Threads.current_process();
                if (module0712.NIL == var105) {
                    module0034.f1873(var103, var106);
                }
                else if (!var105.eql(var106)) {
                    Errors.error((SubLObject)module0712.$ic66$);
                }
            }
            try {
                assert module0712.NIL != module0035.f2015(var71) : var71;
                SubLObject var107 = var71;
                SubLObject var108 = (SubLObject)module0712.NIL;
                var108 = var107.first();
                while (module0712.NIL != var107) {
                    assert module0712.NIL != module0711.f43522(var108) : var108;
                    var107 = var107.rest();
                    var108 = var107.first();
                }
            }
            finally {
                final SubLObject var25_105 = Threads.$is_thread_performing_cleanupP$.currentBinding(var101);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0712.T, var101);
                    if (Characters.CHAR_hash.eql(module0038.f2637(var26))) {
                        var26 = module0038.f2666(var26, (SubLObject)module0712.UNPROVIDED);
                    }
                    final SubLObject var109 = Sequences.remove_duplicates(Mapping.mapcar((SubLObject)module0712.$ic68$, var71), Symbols.symbol_function((SubLObject)module0712.EQUAL), (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED);
                    PrintLow.format(var100, (SubLObject)module0712.$ic69$, Sequences.length(var109), Sequences.length(var71));
                    final SubLObject var25_106 = module0710.$g5584$.currentBinding(var101);
                    final SubLObject var110 = module0710.$g5587$.currentBinding(var101);
                    final SubLObject var111 = module0711.$g5596$.currentBinding(var101);
                    try {
                        module0710.$g5584$.bind(var99, var101);
                        module0710.$g5587$.bind(var26, var101);
                        module0711.$g5596$.bind(module0711.f43552(var71), var101);
                        f43691(var109, var60, (SubLObject)module0712.UNPROVIDED);
                    }
                    finally {
                        module0711.$g5596$.rebind(var111, var101);
                        module0710.$g5587$.rebind(var110, var101);
                        module0710.$g5584$.rebind(var25_106, var101);
                    }
                    if (module0712.NIL != var103 && module0712.NIL == var105) {
                        module0034.f1873(var103, (SubLObject)module0712.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var25_105, var101);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var104, var101);
        }
        return var60;
    }
    
    public static SubLObject f43703(final SubLObject var107) {
        final SubLThread var108 = SubLProcess.currentSubLThread();
        SubLObject var109 = (SubLObject)module0712.NIL;
        try {
            final SubLObject var110 = stream_macros.$stream_requires_locking$.currentBinding(var108);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0712.NIL, var108);
                var109 = compatibility.open_text(var107, (SubLObject)module0712.$ic70$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var110, var108);
            }
            if (!var109.isStream()) {
                Errors.error((SubLObject)module0712.$ic39$, var107);
            }
            final SubLObject var60_109 = var109;
            f43692(var60_109);
        }
        finally {
            final SubLObject var111 = Threads.$is_thread_performing_cleanupP$.currentBinding(var108);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0712.T, var108);
                if (var109.isStream()) {
                    streams_high.close(var109, (SubLObject)module0712.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var111, var108);
            }
        }
        return var107;
    }
    
    public static SubLObject f43704(SubLObject var110) {
        final SubLThread var111 = SubLProcess.currentSubLThread();
        if (module0712.NIL == Filesys.directory_p(var110)) {
            Filesys.make_directory(var110, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED);
        }
        if (!module0038.f2637(var110).eql((SubLObject)Characters.CHAR_slash)) {
            var110 = Sequences.cconcatenate(var110, (SubLObject)module0712.$ic71$);
        }
        SubLObject var112 = (SubLObject)module0712.NIL;
        try {
            final SubLObject var113 = stream_macros.$stream_requires_locking$.currentBinding(var111);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0712.NIL, var111);
                var112 = compatibility.open_text(Sequences.cconcatenate(var110, (SubLObject)module0712.$ic72$), (SubLObject)module0712.$ic70$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var113, var111);
            }
            if (!var112.isStream()) {
                Errors.error((SubLObject)module0712.$ic39$, Sequences.cconcatenate(var110, (SubLObject)module0712.$ic72$));
            }
            final SubLObject var114 = var112;
            final SubLObject var115 = StreamsLow.$error_output$.currentBinding(var111);
            try {
                StreamsLow.$error_output$.bind(var114, var111);
                var111.resetMultipleValues();
                final SubLObject var116 = module0711.f43520(module0173.f10959());
                final SubLObject var117 = var111.secondMultipleValue();
                var111.resetMultipleValues();
                SubLObject var118 = (SubLObject)module0712.NIL;
                SubLObject var121;
                for (SubLObject var119 = (SubLObject)module0712.NIL; module0712.NIL == var119; var119 = (SubLObject)SubLObjectFactory.makeBoolean(module0712.NIL == var121)) {
                    var111.resetMultipleValues();
                    final SubLObject var120 = module0052.f3693(var116);
                    var121 = var111.secondMultipleValue();
                    var111.resetMultipleValues();
                    if (module0712.NIL != var121) {
                        var118 = (SubLObject)ConsesLow.cons(var120, var118);
                    }
                }
                var118 = Sequences.nreverse(var118);
                SubLObject var114_115 = (SubLObject)module0712.NIL;
                try {
                    final SubLObject var25_116 = stream_macros.$stream_requires_locking$.currentBinding(var111);
                    try {
                        stream_macros.$stream_requires_locking$.bind((SubLObject)module0712.NIL, var111);
                        var114_115 = compatibility.open_text(Sequences.cconcatenate(var110, (SubLObject)module0712.$ic73$), (SubLObject)module0712.$ic70$);
                    }
                    finally {
                        stream_macros.$stream_requires_locking$.rebind(var25_116, var111);
                    }
                    if (!var114_115.isStream()) {
                        Errors.error((SubLObject)module0712.$ic39$, Sequences.cconcatenate(var110, (SubLObject)module0712.$ic73$));
                    }
                    final SubLObject var60_117 = var114_115;
                    final SubLObject var25_117 = module0711.$g5616$.currentBinding(var111);
                    try {
                        module0711.$g5616$.bind(module0107.f7627(), var111);
                        PrintLow.format((SubLObject)module0712.T, (SubLObject)module0712.$ic74$);
                        final SubLObject var25_118 = module0711.$g5595$.currentBinding(var111);
                        final SubLObject var122 = module0711.$g5588$.currentBinding(var111);
                        final SubLObject var123 = module0710.$g5582$.currentBinding(var111);
                        final SubLObject var124 = module0711.$g5593$.currentBinding(var111);
                        final SubLObject var125 = module0710.$g5584$.currentBinding(var111);
                        final SubLObject var126 = module0710.$g5585$.currentBinding(var111);
                        final SubLObject var127 = module0711.$g5600$.currentBinding(var111);
                        final SubLObject var128 = module0711.$g5588$.currentBinding(var111);
                        final SubLObject var129 = module0710.$g5582$.currentBinding(var111);
                        try {
                            module0711.$g5595$.bind((SubLObject)module0712.T, var111);
                            module0711.$g5588$.bind((SubLObject)module0712.T, var111);
                            module0710.$g5582$.bind(module0710.$g5582$.getDynamicValue(var111), var111);
                            module0711.$g5593$.bind((SubLObject)module0712.NIL, var111);
                            module0710.$g5584$.bind((SubLObject)module0712.T, var111);
                            module0710.$g5585$.bind((SubLObject)module0712.T, var111);
                            module0711.$g5600$.bind((SubLObject)module0712.T, var111);
                            module0711.$g5588$.bind((SubLObject)module0712.NIL, var111);
                            module0710.$g5582$.bind(module0710.$g5582$.getDynamicValue(var111), var111);
                            if (module0712.NIL == Errors.$ignore_mustsP$.getDynamicValue(var111) && module0712.NIL == module0051.f3603(module0710.$g5582$.getDynamicValue(var111))) {
                                Errors.error((SubLObject)module0712.$ic33$, module0710.$g5582$.getDynamicValue(var111));
                            }
                            f43693(module0052.f3709(var118), var117, var60_117, var114);
                        }
                        finally {
                            module0710.$g5582$.rebind(var129, var111);
                            module0711.$g5588$.rebind(var128, var111);
                            module0711.$g5600$.rebind(var127, var111);
                            module0710.$g5585$.rebind(var126, var111);
                            module0710.$g5584$.rebind(var125, var111);
                            module0711.$g5593$.rebind(var124, var111);
                            module0710.$g5582$.rebind(var123, var111);
                            module0711.$g5588$.rebind(var122, var111);
                            module0711.$g5595$.rebind(var25_118, var111);
                        }
                        if (module0712.NIL != Filesys.directory_p(var110)) {
                            module0711.f43510(var110);
                        }
                    }
                    finally {
                        module0711.$g5616$.rebind(var25_117, var111);
                    }
                }
                finally {
                    final SubLObject var25_119 = Threads.$is_thread_performing_cleanupP$.currentBinding(var111);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0712.T, var111);
                        if (var114_115.isStream()) {
                            streams_high.close(var114_115, (SubLObject)module0712.UNPROVIDED);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var25_119, var111);
                    }
                }
                SubLObject var121_122 = (SubLObject)module0712.NIL;
                try {
                    final SubLObject var25_120 = stream_macros.$stream_requires_locking$.currentBinding(var111);
                    try {
                        stream_macros.$stream_requires_locking$.bind((SubLObject)module0712.NIL, var111);
                        var121_122 = compatibility.open_text(Sequences.cconcatenate(var110, (SubLObject)module0712.$ic75$), (SubLObject)module0712.$ic70$);
                    }
                    finally {
                        stream_macros.$stream_requires_locking$.rebind(var25_120, var111);
                    }
                    if (!var121_122.isStream()) {
                        Errors.error((SubLObject)module0712.$ic39$, Sequences.cconcatenate(var110, (SubLObject)module0712.$ic75$));
                    }
                    final SubLObject var60_118 = var121_122;
                    final SubLObject var25_121 = module0711.$g5616$.currentBinding(var111);
                    try {
                        module0711.$g5616$.bind(module0107.f7627(), var111);
                        PrintLow.format((SubLObject)module0712.T, (SubLObject)module0712.$ic76$);
                        final SubLObject var25_122 = module0711.$g5595$.currentBinding(var111);
                        final SubLObject var122 = module0711.$g5588$.currentBinding(var111);
                        final SubLObject var123 = module0710.$g5582$.currentBinding(var111);
                        final SubLObject var124 = module0711.$g5593$.currentBinding(var111);
                        final SubLObject var125 = module0710.$g5584$.currentBinding(var111);
                        final SubLObject var126 = module0710.$g5585$.currentBinding(var111);
                        final SubLObject var127 = module0711.$g5600$.currentBinding(var111);
                        try {
                            module0711.$g5595$.bind((SubLObject)module0712.T, var111);
                            module0711.$g5588$.bind((SubLObject)module0712.T, var111);
                            module0710.$g5582$.bind(module0710.$g5582$.getDynamicValue(var111), var111);
                            module0711.$g5593$.bind((SubLObject)module0712.NIL, var111);
                            module0710.$g5584$.bind((SubLObject)module0712.T, var111);
                            module0710.$g5585$.bind((SubLObject)module0712.T, var111);
                            module0711.$g5600$.bind((SubLObject)module0712.T, var111);
                            f43693(module0052.f3709(var118), var117, var60_118, var114);
                        }
                        finally {
                            module0711.$g5600$.rebind(var127, var111);
                            module0710.$g5585$.rebind(var126, var111);
                            module0710.$g5584$.rebind(var125, var111);
                            module0711.$g5593$.rebind(var124, var111);
                            module0710.$g5582$.rebind(var123, var111);
                            module0711.$g5588$.rebind(var122, var111);
                            module0711.$g5595$.rebind(var25_122, var111);
                        }
                        if (module0712.NIL != Filesys.directory_p((SubLObject)module0712.NIL)) {
                            module0711.f43510((SubLObject)module0712.NIL);
                        }
                    }
                    finally {
                        module0711.$g5616$.rebind(var25_121, var111);
                    }
                }
                finally {
                    final SubLObject var25_123 = Threads.$is_thread_performing_cleanupP$.currentBinding(var111);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0712.T, var111);
                        if (var121_122.isStream()) {
                            streams_high.close(var121_122, (SubLObject)module0712.UNPROVIDED);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var25_123, var111);
                    }
                }
                SubLObject var128_129 = (SubLObject)module0712.NIL;
                try {
                    final SubLObject var25_124 = stream_macros.$stream_requires_locking$.currentBinding(var111);
                    try {
                        stream_macros.$stream_requires_locking$.bind((SubLObject)module0712.NIL, var111);
                        var128_129 = compatibility.open_text(Sequences.cconcatenate(var110, (SubLObject)module0712.$ic77$), (SubLObject)module0712.$ic70$);
                    }
                    finally {
                        stream_macros.$stream_requires_locking$.rebind(var25_124, var111);
                    }
                    if (!var128_129.isStream()) {
                        Errors.error((SubLObject)module0712.$ic39$, Sequences.cconcatenate(var110, (SubLObject)module0712.$ic77$));
                    }
                    final SubLObject var60_119 = var128_129;
                    final SubLObject var25_125 = module0711.$g5616$.currentBinding(var111);
                    try {
                        module0711.$g5616$.bind(module0107.f7627(), var111);
                        PrintLow.format((SubLObject)module0712.T, (SubLObject)module0712.$ic78$);
                        final SubLObject var25_126 = module0711.$g5595$.currentBinding(var111);
                        final SubLObject var122 = module0711.$g5588$.currentBinding(var111);
                        final SubLObject var123 = module0710.$g5582$.currentBinding(var111);
                        final SubLObject var124 = module0711.$g5593$.currentBinding(var111);
                        final SubLObject var125 = module0710.$g5584$.currentBinding(var111);
                        final SubLObject var126 = module0710.$g5585$.currentBinding(var111);
                        final SubLObject var127 = module0711.$g5600$.currentBinding(var111);
                        try {
                            module0711.$g5595$.bind((SubLObject)module0712.T, var111);
                            module0711.$g5588$.bind((SubLObject)module0712.T, var111);
                            module0710.$g5582$.bind((SubLObject)module0712.NIL, var111);
                            module0711.$g5593$.bind((SubLObject)module0712.NIL, var111);
                            module0710.$g5584$.bind((SubLObject)module0712.T, var111);
                            module0710.$g5585$.bind((SubLObject)module0712.T, var111);
                            module0711.$g5600$.bind((SubLObject)module0712.T, var111);
                            f43693(module0052.f3709(var118), var117, var60_119, var114);
                        }
                        finally {
                            module0711.$g5600$.rebind(var127, var111);
                            module0710.$g5585$.rebind(var126, var111);
                            module0710.$g5584$.rebind(var125, var111);
                            module0711.$g5593$.rebind(var124, var111);
                            module0710.$g5582$.rebind(var123, var111);
                            module0711.$g5588$.rebind(var122, var111);
                            module0711.$g5595$.rebind(var25_126, var111);
                        }
                        if (module0712.NIL != Filesys.directory_p((SubLObject)module0712.NIL)) {
                            module0711.f43510((SubLObject)module0712.NIL);
                        }
                    }
                    finally {
                        module0711.$g5616$.rebind(var25_125, var111);
                    }
                }
                finally {
                    final SubLObject var25_127 = Threads.$is_thread_performing_cleanupP$.currentBinding(var111);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0712.T, var111);
                        if (var128_129.isStream()) {
                            streams_high.close(var128_129, (SubLObject)module0712.UNPROVIDED);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var25_127, var111);
                    }
                }
            }
            finally {
                StreamsLow.$error_output$.rebind(var115, var111);
            }
        }
        finally {
            final SubLObject var130 = Threads.$is_thread_performing_cleanupP$.currentBinding(var111);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0712.T, var111);
                if (var112.isStream()) {
                    streams_high.close(var112, (SubLObject)module0712.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var130, var111);
            }
        }
        return var110;
    }
    
    public static SubLObject f43705(SubLObject var110) {
        final SubLThread var111 = SubLProcess.currentSubLThread();
        if (module0712.NIL == Filesys.directory_p(var110)) {
            Filesys.make_directory(var110, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED);
        }
        if (!module0038.f2637(var110).eql((SubLObject)Characters.CHAR_slash)) {
            var110 = Sequences.cconcatenate(var110, (SubLObject)module0712.$ic71$);
        }
        SubLObject var112 = (SubLObject)module0712.NIL;
        try {
            final SubLObject var113 = stream_macros.$stream_requires_locking$.currentBinding(var111);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0712.NIL, var111);
                var112 = compatibility.open_text(Sequences.cconcatenate(var110, (SubLObject)module0712.$ic79$), (SubLObject)module0712.$ic70$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var113, var111);
            }
            if (!var112.isStream()) {
                Errors.error((SubLObject)module0712.$ic39$, Sequences.cconcatenate(var110, (SubLObject)module0712.$ic79$));
            }
            final SubLObject var114 = var112;
            final SubLObject var115 = StreamsLow.$error_output$.currentBinding(var111);
            try {
                StreamsLow.$error_output$.bind(var114, var111);
                var111.resetMultipleValues();
                final SubLObject var116 = module0711.f43520(module0173.f10959());
                final SubLObject var117 = var111.secondMultipleValue();
                var111.resetMultipleValues();
                SubLObject var118 = (SubLObject)module0712.NIL;
                SubLObject var121;
                for (SubLObject var119 = (SubLObject)module0712.NIL; module0712.NIL == var119; var119 = (SubLObject)SubLObjectFactory.makeBoolean(module0712.NIL == var121)) {
                    var111.resetMultipleValues();
                    final SubLObject var120 = module0052.f3693(var116);
                    var121 = var111.secondMultipleValue();
                    var111.resetMultipleValues();
                    if (module0712.NIL != var121) {
                        var118 = (SubLObject)ConsesLow.cons(var120, var118);
                    }
                }
                var118 = Sequences.nreverse(var118);
                SubLObject var136_137 = (SubLObject)module0712.NIL;
                try {
                    final SubLObject var25_138 = stream_macros.$stream_requires_locking$.currentBinding(var111);
                    try {
                        stream_macros.$stream_requires_locking$.bind((SubLObject)module0712.NIL, var111);
                        var136_137 = compatibility.open_text(Sequences.cconcatenate(var110, (SubLObject)module0712.$ic77$), (SubLObject)module0712.$ic70$);
                    }
                    finally {
                        stream_macros.$stream_requires_locking$.rebind(var25_138, var111);
                    }
                    if (!var136_137.isStream()) {
                        Errors.error((SubLObject)module0712.$ic39$, Sequences.cconcatenate(var110, (SubLObject)module0712.$ic77$));
                    }
                    final SubLObject var60_139 = var136_137;
                    final SubLObject var25_139 = module0711.$g5616$.currentBinding(var111);
                    try {
                        module0711.$g5616$.bind(module0107.f7627(), var111);
                        PrintLow.format((SubLObject)module0712.T, (SubLObject)module0712.$ic78$);
                        final SubLObject var25_140 = module0711.$g5595$.currentBinding(var111);
                        final SubLObject var122 = module0711.$g5588$.currentBinding(var111);
                        final SubLObject var123 = module0710.$g5582$.currentBinding(var111);
                        final SubLObject var124 = module0711.$g5593$.currentBinding(var111);
                        final SubLObject var125 = module0710.$g5584$.currentBinding(var111);
                        final SubLObject var126 = module0710.$g5585$.currentBinding(var111);
                        final SubLObject var127 = module0711.$g5600$.currentBinding(var111);
                        try {
                            module0711.$g5595$.bind((SubLObject)module0712.T, var111);
                            module0711.$g5588$.bind((SubLObject)module0712.T, var111);
                            module0710.$g5582$.bind((SubLObject)module0712.NIL, var111);
                            module0711.$g5593$.bind((SubLObject)module0712.NIL, var111);
                            module0710.$g5584$.bind((SubLObject)module0712.T, var111);
                            module0710.$g5585$.bind((SubLObject)module0712.T, var111);
                            module0711.$g5600$.bind((SubLObject)module0712.T, var111);
                            f43693(module0052.f3709(var118), var117, var60_139, var114);
                        }
                        finally {
                            module0711.$g5600$.rebind(var127, var111);
                            module0710.$g5585$.rebind(var126, var111);
                            module0710.$g5584$.rebind(var125, var111);
                            module0711.$g5593$.rebind(var124, var111);
                            module0710.$g5582$.rebind(var123, var111);
                            module0711.$g5588$.rebind(var122, var111);
                            module0711.$g5595$.rebind(var25_140, var111);
                        }
                        if (module0712.NIL != Filesys.directory_p((SubLObject)module0712.NIL)) {
                            module0711.f43510((SubLObject)module0712.NIL);
                        }
                    }
                    finally {
                        module0711.$g5616$.rebind(var25_139, var111);
                    }
                }
                finally {
                    final SubLObject var25_141 = Threads.$is_thread_performing_cleanupP$.currentBinding(var111);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0712.T, var111);
                        if (var136_137.isStream()) {
                            streams_high.close(var136_137, (SubLObject)module0712.UNPROVIDED);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var25_141, var111);
                    }
                }
            }
            finally {
                StreamsLow.$error_output$.rebind(var115, var111);
            }
        }
        finally {
            final SubLObject var128 = Threads.$is_thread_performing_cleanupP$.currentBinding(var111);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0712.T, var111);
                if (var112.isStream()) {
                    streams_high.close(var112, (SubLObject)module0712.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var128, var111);
            }
        }
        return var110;
    }
    
    public static SubLObject f43706(SubLObject var110) {
        final SubLThread var111 = SubLProcess.currentSubLThread();
        if (module0712.NIL == Filesys.directory_p(var110)) {
            Filesys.make_directory(var110, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED);
        }
        if (!module0038.f2637(var110).eql((SubLObject)Characters.CHAR_slash)) {
            var110 = Sequences.cconcatenate(var110, (SubLObject)module0712.$ic71$);
        }
        SubLObject var112 = (SubLObject)module0712.NIL;
        try {
            final SubLObject var113 = stream_macros.$stream_requires_locking$.currentBinding(var111);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0712.NIL, var111);
                var112 = compatibility.open_text(Sequences.cconcatenate(var110, (SubLObject)module0712.$ic72$), (SubLObject)module0712.$ic70$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var113, var111);
            }
            if (!var112.isStream()) {
                Errors.error((SubLObject)module0712.$ic39$, Sequences.cconcatenate(var110, (SubLObject)module0712.$ic72$));
            }
            final SubLObject var114 = var112;
            final SubLObject var115 = StreamsLow.$error_output$.currentBinding(var111);
            try {
                StreamsLow.$error_output$.bind(var114, var111);
                var111.resetMultipleValues();
                final SubLObject var116 = module0711.f43520(module0173.f10959());
                final SubLObject var117 = var111.secondMultipleValue();
                var111.resetMultipleValues();
                SubLObject var118 = (SubLObject)module0712.NIL;
                SubLObject var121;
                for (SubLObject var119 = (SubLObject)module0712.NIL; module0712.NIL == var119; var119 = (SubLObject)SubLObjectFactory.makeBoolean(module0712.NIL == var121)) {
                    var111.resetMultipleValues();
                    final SubLObject var120 = module0052.f3693(var116);
                    var121 = var111.secondMultipleValue();
                    var111.resetMultipleValues();
                    if (module0712.NIL != var121) {
                        var118 = (SubLObject)ConsesLow.cons(var120, var118);
                    }
                }
                var118 = Sequences.nreverse(var118);
                SubLObject var144_145 = (SubLObject)module0712.NIL;
                try {
                    final SubLObject var25_146 = stream_macros.$stream_requires_locking$.currentBinding(var111);
                    try {
                        stream_macros.$stream_requires_locking$.bind((SubLObject)module0712.NIL, var111);
                        var144_145 = compatibility.open_text(Sequences.cconcatenate(var110, (SubLObject)module0712.$ic73$), (SubLObject)module0712.$ic70$);
                    }
                    finally {
                        stream_macros.$stream_requires_locking$.rebind(var25_146, var111);
                    }
                    if (!var144_145.isStream()) {
                        Errors.error((SubLObject)module0712.$ic39$, Sequences.cconcatenate(var110, (SubLObject)module0712.$ic73$));
                    }
                    final SubLObject var60_147 = var144_145;
                    final SubLObject var25_147 = module0711.$g5616$.currentBinding(var111);
                    try {
                        module0711.$g5616$.bind(module0107.f7627(), var111);
                        PrintLow.format((SubLObject)module0712.T, (SubLObject)module0712.$ic74$);
                        final SubLObject var25_148 = module0711.$g5588$.currentBinding(var111);
                        final SubLObject var122 = module0710.$g5582$.currentBinding(var111);
                        try {
                            module0711.$g5588$.bind((SubLObject)module0712.NIL, var111);
                            module0710.$g5582$.bind(module0710.$g5582$.getDynamicValue(var111), var111);
                            if (module0712.NIL == Errors.$ignore_mustsP$.getDynamicValue(var111) && module0712.NIL == module0051.f3603(module0710.$g5582$.getDynamicValue(var111))) {
                                Errors.error((SubLObject)module0712.$ic33$, module0710.$g5582$.getDynamicValue(var111));
                            }
                            f43693(module0052.f3709(var118), var117, var60_147, var114);
                        }
                        finally {
                            module0710.$g5582$.rebind(var122, var111);
                            module0711.$g5588$.rebind(var25_148, var111);
                        }
                        if (module0712.NIL != Filesys.directory_p(var110)) {
                            module0711.f43510(var110);
                        }
                    }
                    finally {
                        module0711.$g5616$.rebind(var25_147, var111);
                    }
                }
                finally {
                    final SubLObject var25_149 = Threads.$is_thread_performing_cleanupP$.currentBinding(var111);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0712.T, var111);
                        if (var144_145.isStream()) {
                            streams_high.close(var144_145, (SubLObject)module0712.UNPROVIDED);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var25_149, var111);
                    }
                }
            }
            finally {
                StreamsLow.$error_output$.rebind(var115, var111);
            }
        }
        finally {
            final SubLObject var123 = Threads.$is_thread_performing_cleanupP$.currentBinding(var111);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0712.T, var111);
                if (var112.isStream()) {
                    streams_high.close(var112, (SubLObject)module0712.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var123, var111);
            }
        }
        return var110;
    }
    
    public static SubLObject f43707(final SubLObject var151, final SubLObject var110, final SubLObject var152) {
        final SubLThread var153 = SubLProcess.currentSubLThread();
        final SubLObject var154 = Sequences.cconcatenate(module0006.f203(var110), new SubLObject[] { module0006.f203(var152), module0712.$ic80$ });
        final SubLObject var155 = Sequences.cconcatenate(module0006.f203(var110), new SubLObject[] { module0006.f203(var152), module0712.$ic81$ });
        final SubLObject var156 = module0711.$g5588$.currentBinding(var153);
        final SubLObject var157 = module0710.$g5586$.currentBinding(var153);
        final SubLObject var158 = module0710.$g5592$.currentBinding(var153);
        final SubLObject var159 = module0710.$g5591$.currentBinding(var153);
        try {
            module0711.$g5588$.bind((SubLObject)module0712.NIL, var153);
            module0710.$g5586$.bind((SubLObject)module0712.T, var153);
            module0710.$g5592$.bind(module0710.f43473((SubLObject)module0712.UNPROVIDED), var153);
            module0710.$g5591$.bind((SubLObject)ConsesLow.list(reader.bq_cons((SubLObject)module0712.$ic82$, module0699.f42557()), reader.bq_cons((SubLObject)module0712.$ic83$, module0699.f42527()), reader.bq_cons((SubLObject)module0712.$ic84$, module0699.f42547()), reader.bq_cons((SubLObject)module0712.$ic85$, module0710.f43481((SubLObject)module0712.UNPROVIDED)), reader.bq_cons((SubLObject)module0712.$ic86$, module0710.f43473((SubLObject)module0712.UNPROVIDED))), var153);
            SubLObject var160 = (SubLObject)module0712.NIL;
            try {
                final SubLObject var25_156 = stream_macros.$stream_requires_locking$.currentBinding(var153);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0712.NIL, var153);
                    var160 = compatibility.open_text(var154, (SubLObject)module0712.$ic70$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var25_156, var153);
                }
                if (!var160.isStream()) {
                    Errors.error((SubLObject)module0712.$ic39$, var154);
                }
                final SubLObject var60_157 = var160;
                SubLObject var158_159 = (SubLObject)module0712.NIL;
                try {
                    final SubLObject var25_157 = stream_macros.$stream_requires_locking$.currentBinding(var153);
                    try {
                        stream_macros.$stream_requires_locking$.bind((SubLObject)module0712.NIL, var153);
                        var158_159 = compatibility.open_text(var155, (SubLObject)module0712.$ic70$);
                    }
                    finally {
                        stream_macros.$stream_requires_locking$.rebind(var25_157, var153);
                    }
                    if (!var158_159.isStream()) {
                        Errors.error((SubLObject)module0712.$ic39$, var155);
                    }
                    final SubLObject var161 = var158_159;
                    final SubLObject var25_158 = module0580.$g4361$.currentBinding(var153);
                    try {
                        module0580.$g4361$.bind((SubLObject)module0712.NIL, var153);
                        var153.resetMultipleValues();
                        final SubLObject var25_159 = module0580.$g4362$.currentBinding(var153);
                        try {
                            module0580.$g4362$.bind(module0580.f35560(), var153);
                            final SubLObject var162 = var153.secondMultipleValue();
                            var153.resetMultipleValues();
                            try {
                                var153.resetMultipleValues();
                                final SubLObject var25_160 = module0580.$g4358$.currentBinding(var153);
                                try {
                                    module0580.$g4358$.bind(module0580.f35544(), var153);
                                    final SubLObject var163 = var153.secondMultipleValue();
                                    var153.resetMultipleValues();
                                    final SubLObject var25_161 = module0580.$g4359$.currentBinding(var153);
                                    try {
                                        module0580.$g4359$.bind(module0580.f35545(), var153);
                                        final SubLObject var164 = module0580.$g4358$.getDynamicValue(var153);
                                        final SubLObject var25_162 = module0034.$g879$.currentBinding(var153);
                                        try {
                                            module0034.$g879$.bind(var164, var153);
                                            SubLObject var165 = (SubLObject)module0712.NIL;
                                            if (module0712.NIL != var164 && module0712.NIL == module0034.f1842(var164)) {
                                                var165 = module0034.f1869(var164);
                                                final SubLObject var166 = Threads.current_process();
                                                if (module0712.NIL == var165) {
                                                    module0034.f1873(var164, var166);
                                                }
                                                else if (!var165.eql(var166)) {
                                                    Errors.error((SubLObject)module0712.$ic66$);
                                                }
                                            }
                                            try {
                                                final SubLObject var167 = module0423.f29608(var151, (SubLObject)module0712.UNPROVIDED);
                                                f43694(var167, (SubLObject)module0712.NIL, var60_157, var161, module0710.f43473((SubLObject)module0712.UNPROVIDED));
                                            }
                                            finally {
                                                final SubLObject var25_163 = Threads.$is_thread_performing_cleanupP$.currentBinding(var153);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0712.T, var153);
                                                    if (module0712.NIL != var164 && module0712.NIL == var165) {
                                                        module0034.f1873(var164, (SubLObject)module0712.NIL);
                                                    }
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var25_163, var153);
                                                }
                                            }
                                        }
                                        finally {
                                            module0034.$g879$.rebind(var25_162, var153);
                                        }
                                    }
                                    finally {
                                        module0580.$g4359$.rebind(var25_161, var153);
                                    }
                                    if (var163 == module0712.$ic87$ && module0712.NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var153))) {
                                        module0034.f1891(module0580.$g4358$.getDynamicValue(var153));
                                    }
                                }
                                finally {
                                    module0580.$g4358$.rebind(var25_160, var153);
                                }
                            }
                            finally {
                                final SubLObject var25_164 = Threads.$is_thread_performing_cleanupP$.currentBinding(var153);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0712.T, var153);
                                    if (module0712.NIL == var162) {
                                        module0580.f35554(module0580.$g4362$.getDynamicValue(var153));
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var25_164, var153);
                                }
                            }
                        }
                        finally {
                            module0580.$g4362$.rebind(var25_159, var153);
                        }
                    }
                    finally {
                        module0580.$g4361$.rebind(var25_158, var153);
                    }
                }
                finally {
                    final SubLObject var25_165 = Threads.$is_thread_performing_cleanupP$.currentBinding(var153);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0712.T, var153);
                        if (var158_159.isStream()) {
                            streams_high.close(var158_159, (SubLObject)module0712.UNPROVIDED);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var25_165, var153);
                    }
                }
            }
            finally {
                final SubLObject var25_166 = Threads.$is_thread_performing_cleanupP$.currentBinding(var153);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0712.T, var153);
                    if (var160.isStream()) {
                        streams_high.close(var160, (SubLObject)module0712.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var25_166, var153);
                }
            }
        }
        finally {
            module0710.$g5591$.rebind(var159, var153);
            module0710.$g5592$.rebind(var158, var153);
            module0710.$g5586$.rebind(var157, var153);
            module0711.$g5588$.rebind(var156, var153);
        }
        return var154;
    }
    
    public static SubLObject f43708(final SubLObject var172, final SubLObject var173, SubLObject var60) {
        if (var60 == module0712.UNPROVIDED) {
            var60 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread var174 = SubLProcess.currentSubLThread();
        final SubLObject var175 = module0147.f9540(var173);
        final SubLObject var176 = module0147.$g2095$.currentBinding(var174);
        final SubLObject var177 = module0147.$g2094$.currentBinding(var174);
        final SubLObject var178 = module0147.$g2096$.currentBinding(var174);
        try {
            module0147.$g2095$.bind(module0147.f9545(var175), var174);
            module0147.$g2094$.bind(module0147.f9546(var175), var174);
            module0147.$g2096$.bind(module0147.f9549(var175), var174);
            final SubLObject var179 = (SubLObject)module0712.$ic88$;
            f43709(var172, var179, var60);
        }
        finally {
            module0147.$g2096$.rebind(var178, var174);
            module0147.$g2094$.rebind(var177, var174);
            module0147.$g2095$.rebind(var176, var174);
        }
        return (SubLObject)module0712.NIL;
    }
    
    public static SubLObject f43709(final SubLObject var172, final SubLObject var175, final SubLObject var60) {
        final SubLThread var176 = SubLProcess.currentSubLThread();
        PrintLow.format(var60, (SubLObject)module0712.$ic89$, var175, module0751.f46731(module0770.f49049(var172, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED)));
        final SubLObject var177 = Sequences.cconcatenate(var175, (SubLObject)module0712.$ic90$);
        final SubLObject var178 = module0077.f5313((SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED);
        final SubLObject var179 = module0077.f5313((SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED);
        SubLObject var180 = (SubLObject)module0712.$ic106$;
        SubLObject var181 = (SubLObject)module0712.NIL;
        var181 = var180.first();
        while (module0712.NIL != var180) {
            final SubLObject var182 = var181;
            final SubLObject var183 = (SubLObject)module0712.$ic93$;
            final SubLObject var184 = module0056.f4145(var183);
            SubLObject var185 = (SubLObject)module0712.NIL;
            final SubLObject var186 = module0139.$g1635$.currentBinding(var176);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var176);
                final SubLObject var187 = (SubLObject)module0712.NIL;
                final SubLObject var25_184 = module0141.$g1714$.currentBinding(var176);
                final SubLObject var188 = module0141.$g1715$.currentBinding(var176);
                try {
                    module0141.$g1714$.bind((module0712.NIL != var187) ? var187 : module0141.f9283(), var176);
                    module0141.$g1715$.bind((SubLObject)((module0712.NIL != var187) ? module0712.$ic94$ : module0141.$g1715$.getDynamicValue(var176)), var176);
                    if (module0712.NIL != var187 && module0712.NIL != module0136.f8864() && module0712.NIL == module0141.f9279(var187)) {
                        final SubLObject var189 = module0136.$g1591$.getDynamicValue(var176);
                        if (var189.eql((SubLObject)module0712.$ic95$)) {
                            module0136.f8870((SubLObject)module0712.ONE_INTEGER, (SubLObject)module0712.$ic96$, var187, (SubLObject)module0712.$ic97$, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED);
                        }
                        else if (var189.eql((SubLObject)module0712.$ic98$)) {
                            module0136.f8871((SubLObject)module0712.ONE_INTEGER, (SubLObject)module0712.$ic99$, (SubLObject)module0712.$ic96$, var187, (SubLObject)module0712.$ic97$, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED);
                        }
                        else if (var189.eql((SubLObject)module0712.$ic100$)) {
                            Errors.warn((SubLObject)module0712.$ic96$, var187, (SubLObject)module0712.$ic97$);
                        }
                        else {
                            Errors.warn((SubLObject)module0712.$ic101$, module0136.$g1591$.getDynamicValue(var176));
                            Errors.cerror((SubLObject)module0712.$ic99$, (SubLObject)module0712.$ic96$, var187, (SubLObject)module0712.$ic97$);
                        }
                    }
                    final SubLObject var25_185 = module0141.$g1670$.currentBinding(var176);
                    final SubLObject var35_187 = module0141.$g1671$.currentBinding(var176);
                    final SubLObject var190 = module0141.$g1672$.currentBinding(var176);
                    final SubLObject var191 = module0141.$g1674$.currentBinding(var176);
                    final SubLObject var192 = module0137.$g1605$.currentBinding(var176);
                    try {
                        module0141.$g1670$.bind(module0137.f8955(module0712.$ic102$), var176);
                        module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0712.$ic102$)), var176);
                        module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0712.$ic102$)), var176);
                        module0141.$g1674$.bind((SubLObject)module0712.NIL, var176);
                        module0137.$g1605$.bind(module0137.f8955(module0712.$ic102$), var176);
                        if (module0712.NIL != module0136.f8865() || module0712.NIL != module0244.f15795(var181, module0137.f8955((SubLObject)module0712.UNPROVIDED))) {
                            final SubLObject var25_186 = module0141.$g1677$.currentBinding(var176);
                            final SubLObject var35_188 = module0138.$g1619$.currentBinding(var176);
                            final SubLObject var37_190 = module0141.$g1674$.currentBinding(var176);
                            try {
                                module0141.$g1677$.bind(module0141.f9210(), var176);
                                module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955(module0712.$ic102$)), var176);
                                module0141.$g1674$.bind((SubLObject)module0712.NIL, var176);
                                module0249.f16055(var182, (SubLObject)module0712.UNPROVIDED);
                                for (var185 = (SubLObject)ConsesLow.list(var181, module0141.f9195()); module0712.NIL != var185; var185 = module0056.f4150(var184)) {
                                    final SubLObject var179_191 = var185.first();
                                    final SubLObject var193 = conses_high.second(var185);
                                    final SubLObject var194 = var179_191;
                                    final SubLObject var25_187 = module0141.$g1674$.currentBinding(var176);
                                    try {
                                        module0141.$g1674$.bind(var193, var176);
                                        final SubLObject var195 = var193;
                                        if (module0712.NIL != module0077.f5326(var194, var178)) {
                                            final SubLObject var197;
                                            final SubLObject var196 = var197 = module0226.f15068(var194, (SubLObject)module0712.UNPROVIDED);
                                            final SubLObject var198 = Numbers.subtract((SubLObject)module0712.THREE_INTEGER, var197);
                                            SubLObject var199 = (SubLObject)module0712.NIL;
                                            final SubLObject var200 = var194;
                                            if (module0712.NIL != module0158.f10010(var172, var198, var200)) {
                                                final SubLObject var201 = module0158.f10011(var172, var198, var200);
                                                SubLObject var202 = (SubLObject)module0712.NIL;
                                                final SubLObject var203 = (SubLObject)module0712.NIL;
                                                while (module0712.NIL == var202) {
                                                    final SubLObject var204 = module0052.f3695(var201, var203);
                                                    final SubLObject var205 = (SubLObject)SubLObjectFactory.makeBoolean(!var203.eql(var204));
                                                    if (module0712.NIL != var205) {
                                                        SubLObject var206 = (SubLObject)module0712.NIL;
                                                        try {
                                                            var206 = module0158.f10316(var204, (SubLObject)module0712.$ic61$, (SubLObject)module0712.$ic62$, (SubLObject)module0712.NIL);
                                                            SubLObject var80_200 = (SubLObject)module0712.NIL;
                                                            final SubLObject var81_201 = (SubLObject)module0712.NIL;
                                                            while (module0712.NIL == var80_200) {
                                                                final SubLObject var207 = module0052.f3695(var206, var81_201);
                                                                final SubLObject var83_203 = (SubLObject)SubLObjectFactory.makeBoolean(!var81_201.eql(var207));
                                                                if (module0712.NIL != var83_203) {
                                                                    var199 = module0178.f11331(var207, var197);
                                                                    if (module0712.NIL != module0077.f5326(var199, var179)) {
                                                                        f43709(var199, var177, var60);
                                                                    }
                                                                }
                                                                var80_200 = (SubLObject)SubLObjectFactory.makeBoolean(module0712.NIL == var83_203);
                                                            }
                                                        }
                                                        finally {
                                                            final SubLObject var25_188 = Threads.$is_thread_performing_cleanupP$.currentBinding(var176);
                                                            try {
                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0712.T, var176);
                                                                if (module0712.NIL != var206) {
                                                                    module0158.f10319(var206);
                                                                }
                                                            }
                                                            finally {
                                                                Threads.$is_thread_performing_cleanupP$.rebind(var25_188, var176);
                                                            }
                                                        }
                                                    }
                                                    var202 = (SubLObject)SubLObjectFactory.makeBoolean(module0712.NIL == var205);
                                                }
                                            }
                                        }
                                        SubLObject var8_206;
                                        final SubLObject var208 = var8_206 = module0200.f12443(module0137.f8955(module0712.$ic102$));
                                        SubLObject var209 = (SubLObject)module0712.NIL;
                                        var209 = var8_206.first();
                                        while (module0712.NIL != var8_206) {
                                            final SubLObject var25_189 = module0137.$g1605$.currentBinding(var176);
                                            final SubLObject var35_189 = module0141.$g1674$.currentBinding(var176);
                                            try {
                                                module0137.$g1605$.bind(var209, var176);
                                                module0141.$g1674$.bind((SubLObject)((module0712.NIL != module0141.f9205((SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0712.NIL == module0141.$g1674$.getDynamicValue(var176)) : module0141.$g1674$.getDynamicValue(var176)), var176);
                                                final SubLObject var210 = module0228.f15229(var179_191);
                                                if (module0712.NIL != module0138.f8992(var210)) {
                                                    final SubLObject var211 = module0242.f15664(var210, module0137.f8955((SubLObject)module0712.UNPROVIDED));
                                                    if (module0712.NIL != var211) {
                                                        final SubLObject var212 = module0245.f15834(var211, module0138.f8979(), module0137.f8955((SubLObject)module0712.UNPROVIDED));
                                                        if (module0712.NIL != var212) {
                                                            SubLObject var213;
                                                            for (var213 = module0066.f4838(module0067.f4891(var212)); module0712.NIL == module0066.f4841(var213); var213 = module0066.f4840(var213)) {
                                                                var176.resetMultipleValues();
                                                                final SubLObject var214 = module0066.f4839(var213);
                                                                final SubLObject var215 = var176.secondMultipleValue();
                                                                var176.resetMultipleValues();
                                                                if (module0712.NIL != module0147.f9507(var214)) {
                                                                    final SubLObject var25_190 = module0138.$g1623$.currentBinding(var176);
                                                                    try {
                                                                        module0138.$g1623$.bind(var214, var176);
                                                                        SubLObject var213_217;
                                                                        for (var213_217 = module0066.f4838(module0067.f4891(var215)); module0712.NIL == module0066.f4841(var213_217); var213_217 = module0066.f4840(var213_217)) {
                                                                            var176.resetMultipleValues();
                                                                            final SubLObject var216 = module0066.f4839(var213_217);
                                                                            final SubLObject var217 = var176.secondMultipleValue();
                                                                            var176.resetMultipleValues();
                                                                            if (module0712.NIL != module0141.f9289(var216)) {
                                                                                final SubLObject var25_191 = module0138.$g1624$.currentBinding(var176);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var216, var176);
                                                                                    final SubLObject var218 = var217;
                                                                                    if (module0712.NIL != module0077.f5302(var218)) {
                                                                                        final SubLObject var219 = module0077.f5333(var218);
                                                                                        SubLObject var220;
                                                                                        SubLObject var221;
                                                                                        SubLObject var222;
                                                                                        for (var220 = module0032.f1741(var219), var221 = (SubLObject)module0712.NIL, var221 = module0032.f1742(var220, var219); module0712.NIL == module0032.f1744(var220, var221); var221 = module0032.f1743(var221)) {
                                                                                            var222 = module0032.f1745(var220, var221);
                                                                                            if (module0712.NIL != module0032.f1746(var221, var222) && module0712.NIL == module0249.f16059(var222, (SubLObject)module0712.UNPROVIDED)) {
                                                                                                module0249.f16055(var222, (SubLObject)module0712.UNPROVIDED);
                                                                                                module0056.f4149((SubLObject)ConsesLow.list(var222, module0141.f9195()), var184);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var218.isList()) {
                                                                                        SubLObject var223 = var218;
                                                                                        SubLObject var224 = (SubLObject)module0712.NIL;
                                                                                        var224 = var223.first();
                                                                                        while (module0712.NIL != var223) {
                                                                                            if (module0712.NIL == module0249.f16059(var224, (SubLObject)module0712.UNPROVIDED)) {
                                                                                                module0249.f16055(var224, (SubLObject)module0712.UNPROVIDED);
                                                                                                module0056.f4149((SubLObject)ConsesLow.list(var224, module0141.f9195()), var184);
                                                                                            }
                                                                                            var223 = var223.rest();
                                                                                            var224 = var223.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0712.$ic103$, var218);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var25_191, var176);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var213_217);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var25_190, var176);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var213);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0712.FIVE_INTEGER, (SubLObject)module0712.$ic104$, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED);
                                                    }
                                                }
                                                else if (module0712.NIL != module0155.f9785(var210, (SubLObject)module0712.UNPROVIDED)) {
                                                    SubLObject var8_207;
                                                    final SubLObject var225 = var8_207 = ((module0712.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var176), module0137.f8955((SubLObject)module0712.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var176), module0137.f8955((SubLObject)module0712.UNPROVIDED)));
                                                    SubLObject var226 = (SubLObject)module0712.NIL;
                                                    var226 = var8_207.first();
                                                    while (module0712.NIL != var8_207) {
                                                        final SubLObject var25_192 = module0138.$g1625$.currentBinding(var176);
                                                        try {
                                                            module0138.$g1625$.bind(var226, var176);
                                                            final SubLObject var228;
                                                            final SubLObject var227 = var228 = Functions.funcall(var226, var210);
                                                            if (module0712.NIL != module0077.f5302(var228)) {
                                                                final SubLObject var229 = module0077.f5333(var228);
                                                                SubLObject var230;
                                                                SubLObject var231;
                                                                SubLObject var232;
                                                                for (var230 = module0032.f1741(var229), var231 = (SubLObject)module0712.NIL, var231 = module0032.f1742(var230, var229); module0712.NIL == module0032.f1744(var230, var231); var231 = module0032.f1743(var231)) {
                                                                    var232 = module0032.f1745(var230, var231);
                                                                    if (module0712.NIL != module0032.f1746(var231, var232) && module0712.NIL == module0249.f16059(var232, (SubLObject)module0712.UNPROVIDED)) {
                                                                        module0249.f16055(var232, (SubLObject)module0712.UNPROVIDED);
                                                                        module0056.f4149((SubLObject)ConsesLow.list(var232, module0141.f9195()), var184);
                                                                    }
                                                                }
                                                            }
                                                            else if (var228.isList()) {
                                                                SubLObject var233 = var228;
                                                                SubLObject var234 = (SubLObject)module0712.NIL;
                                                                var234 = var233.first();
                                                                while (module0712.NIL != var233) {
                                                                    if (module0712.NIL == module0249.f16059(var234, (SubLObject)module0712.UNPROVIDED)) {
                                                                        module0249.f16055(var234, (SubLObject)module0712.UNPROVIDED);
                                                                        module0056.f4149((SubLObject)ConsesLow.list(var234, module0141.f9195()), var184);
                                                                    }
                                                                    var233 = var233.rest();
                                                                    var234 = var233.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0712.$ic103$, var228);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var25_192, var176);
                                                        }
                                                        var8_207 = var8_207.rest();
                                                        var226 = var8_207.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var35_189, var176);
                                                module0137.$g1605$.rebind(var25_189, var176);
                                            }
                                            var8_206 = var8_206.rest();
                                            var209 = var8_206.first();
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var25_187, var176);
                                    }
                                }
                            }
                            finally {
                                module0141.$g1674$.rebind(var37_190, var176);
                                module0138.$g1619$.rebind(var35_188, var176);
                                module0141.$g1677$.rebind(var25_186, var176);
                            }
                        }
                        else {
                            module0136.f8872((SubLObject)module0712.TWO_INTEGER, (SubLObject)module0712.$ic105$, var181, module0244.f15748(module0137.f8955((SubLObject)module0712.UNPROVIDED)), (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED);
                        }
                    }
                    finally {
                        module0137.$g1605$.rebind(var192, var176);
                        module0141.$g1674$.rebind(var191, var176);
                        module0141.$g1672$.rebind(var190, var176);
                        module0141.$g1671$.rebind(var35_187, var176);
                        module0141.$g1670$.rebind(var25_185, var176);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var188, var176);
                    module0141.$g1714$.rebind(var25_184, var176);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var176));
            }
            finally {
                module0139.$g1635$.rebind(var186, var176);
            }
            var180 = var180.rest();
            var181 = var180.first();
        }
        return (SubLObject)module0712.NIL;
    }
    
    public static SubLObject f43710(final SubLObject var172, final SubLObject var173) {
        final SubLThread var174 = SubLProcess.currentSubLThread();
        final SubLObject var175 = module0077.f5313(Symbols.symbol_function((SubLObject)module0712.EQUAL), (SubLObject)module0712.UNPROVIDED);
        final SubLObject var176 = module0147.f9540(var173);
        final SubLObject var177 = module0147.$g2095$.currentBinding(var174);
        final SubLObject var178 = module0147.$g2094$.currentBinding(var174);
        final SubLObject var179 = module0147.$g2096$.currentBinding(var174);
        try {
            module0147.$g2095$.bind(module0147.f9545(var176), var174);
            module0147.$g2094$.bind(module0147.f9546(var176), var174);
            module0147.$g2096$.bind(module0147.f9549(var176), var174);
            f43711(var172, var175);
        }
        finally {
            module0147.$g2096$.rebind(var179, var174);
            module0147.$g2094$.rebind(var178, var174);
            module0147.$g2095$.rebind(var177, var174);
        }
        return var175;
    }
    
    public static SubLObject f43711(final SubLObject var172, final SubLObject var62) {
        final SubLThread var173 = SubLProcess.currentSubLThread();
        final SubLObject var174 = module0077.f5313((SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED);
        SubLObject var175 = (SubLObject)module0712.$ic106$;
        SubLObject var176 = (SubLObject)module0712.NIL;
        var176 = var175.first();
        while (module0712.NIL != var175) {
            final SubLObject var177 = var176;
            final SubLObject var178 = (SubLObject)module0712.$ic93$;
            final SubLObject var179 = module0056.f4145(var178);
            SubLObject var180 = (SubLObject)module0712.NIL;
            final SubLObject var181 = module0139.$g1635$.currentBinding(var173);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var173);
                final SubLObject var182 = (SubLObject)module0712.NIL;
                final SubLObject var25_231 = module0141.$g1714$.currentBinding(var173);
                final SubLObject var183 = module0141.$g1715$.currentBinding(var173);
                try {
                    module0141.$g1714$.bind((module0712.NIL != var182) ? var182 : module0141.f9283(), var173);
                    module0141.$g1715$.bind((SubLObject)((module0712.NIL != var182) ? module0712.$ic94$ : module0141.$g1715$.getDynamicValue(var173)), var173);
                    if (module0712.NIL != var182 && module0712.NIL != module0136.f8864() && module0712.NIL == module0141.f9279(var182)) {
                        final SubLObject var184 = module0136.$g1591$.getDynamicValue(var173);
                        if (var184.eql((SubLObject)module0712.$ic95$)) {
                            module0136.f8870((SubLObject)module0712.ONE_INTEGER, (SubLObject)module0712.$ic96$, var182, (SubLObject)module0712.$ic97$, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED);
                        }
                        else if (var184.eql((SubLObject)module0712.$ic98$)) {
                            module0136.f8871((SubLObject)module0712.ONE_INTEGER, (SubLObject)module0712.$ic99$, (SubLObject)module0712.$ic96$, var182, (SubLObject)module0712.$ic97$, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED);
                        }
                        else if (var184.eql((SubLObject)module0712.$ic100$)) {
                            Errors.warn((SubLObject)module0712.$ic96$, var182, (SubLObject)module0712.$ic97$);
                        }
                        else {
                            Errors.warn((SubLObject)module0712.$ic101$, module0136.$g1591$.getDynamicValue(var173));
                            Errors.cerror((SubLObject)module0712.$ic99$, (SubLObject)module0712.$ic96$, var182, (SubLObject)module0712.$ic97$);
                        }
                    }
                    final SubLObject var25_232 = module0141.$g1670$.currentBinding(var173);
                    final SubLObject var35_233 = module0141.$g1671$.currentBinding(var173);
                    final SubLObject var185 = module0141.$g1672$.currentBinding(var173);
                    final SubLObject var186 = module0141.$g1674$.currentBinding(var173);
                    final SubLObject var187 = module0137.$g1605$.currentBinding(var173);
                    try {
                        module0141.$g1670$.bind(module0137.f8955(module0712.$ic102$), var173);
                        module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0712.$ic102$)), var173);
                        module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0712.$ic102$)), var173);
                        module0141.$g1674$.bind((SubLObject)module0712.NIL, var173);
                        module0137.$g1605$.bind(module0137.f8955(module0712.$ic102$), var173);
                        if (module0712.NIL != module0136.f8865() || module0712.NIL != module0244.f15795(var176, module0137.f8955((SubLObject)module0712.UNPROVIDED))) {
                            final SubLObject var25_233 = module0141.$g1677$.currentBinding(var173);
                            final SubLObject var35_234 = module0138.$g1619$.currentBinding(var173);
                            final SubLObject var37_236 = module0141.$g1674$.currentBinding(var173);
                            try {
                                module0141.$g1677$.bind(module0141.f9210(), var173);
                                module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955(module0712.$ic102$)), var173);
                                module0141.$g1674$.bind((SubLObject)module0712.NIL, var173);
                                module0249.f16055(var177, (SubLObject)module0712.UNPROVIDED);
                                for (var180 = (SubLObject)ConsesLow.list(var176, module0141.f9195()); module0712.NIL != var180; var180 = module0056.f4150(var179)) {
                                    final SubLObject var179_237 = var180.first();
                                    final SubLObject var188 = conses_high.second(var180);
                                    final SubLObject var189 = var179_237;
                                    final SubLObject var25_234 = module0141.$g1674$.currentBinding(var173);
                                    try {
                                        module0141.$g1674$.bind(var188, var173);
                                        final SubLObject var190 = var188;
                                        if (module0712.NIL != module0077.f5326(var189, var174)) {
                                            final SubLObject var192;
                                            final SubLObject var191 = var192 = module0226.f15068(var189, (SubLObject)module0712.UNPROVIDED);
                                            final SubLObject var193 = Numbers.subtract((SubLObject)module0712.THREE_INTEGER, var192);
                                            SubLObject var194 = (SubLObject)module0712.NIL;
                                            final SubLObject var195 = var189;
                                            if (module0712.NIL != module0158.f10010(var172, var193, var195)) {
                                                final SubLObject var196 = module0158.f10011(var172, var193, var195);
                                                SubLObject var197 = (SubLObject)module0712.NIL;
                                                final SubLObject var198 = (SubLObject)module0712.NIL;
                                                while (module0712.NIL == var197) {
                                                    final SubLObject var199 = module0052.f3695(var196, var198);
                                                    final SubLObject var200 = (SubLObject)SubLObjectFactory.makeBoolean(!var198.eql(var199));
                                                    if (module0712.NIL != var200) {
                                                        SubLObject var201 = (SubLObject)module0712.NIL;
                                                        try {
                                                            var201 = module0158.f10316(var199, (SubLObject)module0712.$ic61$, (SubLObject)module0712.$ic62$, (SubLObject)module0712.NIL);
                                                            SubLObject var80_239 = (SubLObject)module0712.NIL;
                                                            final SubLObject var81_240 = (SubLObject)module0712.NIL;
                                                            while (module0712.NIL == var80_239) {
                                                                final SubLObject var202 = module0052.f3695(var201, var81_240);
                                                                final SubLObject var83_241 = (SubLObject)SubLObjectFactory.makeBoolean(!var81_240.eql(var202));
                                                                if (module0712.NIL != var83_241) {
                                                                    var194 = module0178.f11331(var202, var192);
                                                                    if (module0712.NIL != module0077.f5326(var194, var62)) {
                                                                        f43711(var194, var62);
                                                                    }
                                                                }
                                                                var80_239 = (SubLObject)SubLObjectFactory.makeBoolean(module0712.NIL == var83_241);
                                                            }
                                                        }
                                                        finally {
                                                            final SubLObject var25_235 = Threads.$is_thread_performing_cleanupP$.currentBinding(var173);
                                                            try {
                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0712.T, var173);
                                                                if (module0712.NIL != var201) {
                                                                    module0158.f10319(var201);
                                                                }
                                                            }
                                                            finally {
                                                                Threads.$is_thread_performing_cleanupP$.rebind(var25_235, var173);
                                                            }
                                                        }
                                                    }
                                                    var197 = (SubLObject)SubLObjectFactory.makeBoolean(module0712.NIL == var200);
                                                }
                                            }
                                        }
                                        SubLObject var8_243;
                                        final SubLObject var203 = var8_243 = module0200.f12443(module0137.f8955(module0712.$ic102$));
                                        SubLObject var204 = (SubLObject)module0712.NIL;
                                        var204 = var8_243.first();
                                        while (module0712.NIL != var8_243) {
                                            final SubLObject var25_236 = module0137.$g1605$.currentBinding(var173);
                                            final SubLObject var35_235 = module0141.$g1674$.currentBinding(var173);
                                            try {
                                                module0137.$g1605$.bind(var204, var173);
                                                module0141.$g1674$.bind((SubLObject)((module0712.NIL != module0141.f9205((SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0712.NIL == module0141.$g1674$.getDynamicValue(var173)) : module0141.$g1674$.getDynamicValue(var173)), var173);
                                                final SubLObject var205 = module0228.f15229(var179_237);
                                                if (module0712.NIL != module0138.f8992(var205)) {
                                                    final SubLObject var206 = module0242.f15664(var205, module0137.f8955((SubLObject)module0712.UNPROVIDED));
                                                    if (module0712.NIL != var206) {
                                                        final SubLObject var207 = module0245.f15834(var206, module0138.f8979(), module0137.f8955((SubLObject)module0712.UNPROVIDED));
                                                        if (module0712.NIL != var207) {
                                                            SubLObject var208;
                                                            for (var208 = module0066.f4838(module0067.f4891(var207)); module0712.NIL == module0066.f4841(var208); var208 = module0066.f4840(var208)) {
                                                                var173.resetMultipleValues();
                                                                final SubLObject var209 = module0066.f4839(var208);
                                                                final SubLObject var210 = var173.secondMultipleValue();
                                                                var173.resetMultipleValues();
                                                                if (module0712.NIL != module0147.f9507(var209)) {
                                                                    final SubLObject var25_237 = module0138.$g1623$.currentBinding(var173);
                                                                    try {
                                                                        module0138.$g1623$.bind(var209, var173);
                                                                        SubLObject var213_247;
                                                                        for (var213_247 = module0066.f4838(module0067.f4891(var210)); module0712.NIL == module0066.f4841(var213_247); var213_247 = module0066.f4840(var213_247)) {
                                                                            var173.resetMultipleValues();
                                                                            final SubLObject var211 = module0066.f4839(var213_247);
                                                                            final SubLObject var212 = var173.secondMultipleValue();
                                                                            var173.resetMultipleValues();
                                                                            if (module0712.NIL != module0141.f9289(var211)) {
                                                                                final SubLObject var25_238 = module0138.$g1624$.currentBinding(var173);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var211, var173);
                                                                                    final SubLObject var213 = var212;
                                                                                    if (module0712.NIL != module0077.f5302(var213)) {
                                                                                        final SubLObject var214 = module0077.f5333(var213);
                                                                                        SubLObject var215;
                                                                                        SubLObject var216;
                                                                                        SubLObject var217;
                                                                                        for (var215 = module0032.f1741(var214), var216 = (SubLObject)module0712.NIL, var216 = module0032.f1742(var215, var214); module0712.NIL == module0032.f1744(var215, var216); var216 = module0032.f1743(var216)) {
                                                                                            var217 = module0032.f1745(var215, var216);
                                                                                            if (module0712.NIL != module0032.f1746(var216, var217) && module0712.NIL == module0249.f16059(var217, (SubLObject)module0712.UNPROVIDED)) {
                                                                                                module0249.f16055(var217, (SubLObject)module0712.UNPROVIDED);
                                                                                                module0056.f4149((SubLObject)ConsesLow.list(var217, module0141.f9195()), var179);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var213.isList()) {
                                                                                        SubLObject var218 = var213;
                                                                                        SubLObject var219 = (SubLObject)module0712.NIL;
                                                                                        var219 = var218.first();
                                                                                        while (module0712.NIL != var218) {
                                                                                            if (module0712.NIL == module0249.f16059(var219, (SubLObject)module0712.UNPROVIDED)) {
                                                                                                module0249.f16055(var219, (SubLObject)module0712.UNPROVIDED);
                                                                                                module0056.f4149((SubLObject)ConsesLow.list(var219, module0141.f9195()), var179);
                                                                                            }
                                                                                            var218 = var218.rest();
                                                                                            var219 = var218.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0712.$ic103$, var213);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var25_238, var173);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var213_247);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var25_237, var173);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var208);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0712.FIVE_INTEGER, (SubLObject)module0712.$ic104$, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED);
                                                    }
                                                }
                                                else if (module0712.NIL != module0155.f9785(var205, (SubLObject)module0712.UNPROVIDED)) {
                                                    SubLObject var8_244;
                                                    final SubLObject var220 = var8_244 = ((module0712.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var173), module0137.f8955((SubLObject)module0712.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var173), module0137.f8955((SubLObject)module0712.UNPROVIDED)));
                                                    SubLObject var221 = (SubLObject)module0712.NIL;
                                                    var221 = var8_244.first();
                                                    while (module0712.NIL != var8_244) {
                                                        final SubLObject var25_239 = module0138.$g1625$.currentBinding(var173);
                                                        try {
                                                            module0138.$g1625$.bind(var221, var173);
                                                            final SubLObject var223;
                                                            final SubLObject var222 = var223 = Functions.funcall(var221, var205);
                                                            if (module0712.NIL != module0077.f5302(var223)) {
                                                                final SubLObject var224 = module0077.f5333(var223);
                                                                SubLObject var225;
                                                                SubLObject var226;
                                                                SubLObject var227;
                                                                for (var225 = module0032.f1741(var224), var226 = (SubLObject)module0712.NIL, var226 = module0032.f1742(var225, var224); module0712.NIL == module0032.f1744(var225, var226); var226 = module0032.f1743(var226)) {
                                                                    var227 = module0032.f1745(var225, var226);
                                                                    if (module0712.NIL != module0032.f1746(var226, var227) && module0712.NIL == module0249.f16059(var227, (SubLObject)module0712.UNPROVIDED)) {
                                                                        module0249.f16055(var227, (SubLObject)module0712.UNPROVIDED);
                                                                        module0056.f4149((SubLObject)ConsesLow.list(var227, module0141.f9195()), var179);
                                                                    }
                                                                }
                                                            }
                                                            else if (var223.isList()) {
                                                                SubLObject var228 = var223;
                                                                SubLObject var229 = (SubLObject)module0712.NIL;
                                                                var229 = var228.first();
                                                                while (module0712.NIL != var228) {
                                                                    if (module0712.NIL == module0249.f16059(var229, (SubLObject)module0712.UNPROVIDED)) {
                                                                        module0249.f16055(var229, (SubLObject)module0712.UNPROVIDED);
                                                                        module0056.f4149((SubLObject)ConsesLow.list(var229, module0141.f9195()), var179);
                                                                    }
                                                                    var228 = var228.rest();
                                                                    var229 = var228.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0712.$ic103$, var223);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var25_239, var173);
                                                        }
                                                        var8_244 = var8_244.rest();
                                                        var221 = var8_244.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var35_235, var173);
                                                module0137.$g1605$.rebind(var25_236, var173);
                                            }
                                            var8_243 = var8_243.rest();
                                            var204 = var8_243.first();
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var25_234, var173);
                                    }
                                }
                            }
                            finally {
                                module0141.$g1674$.rebind(var37_236, var173);
                                module0138.$g1619$.rebind(var35_234, var173);
                                module0141.$g1677$.rebind(var25_233, var173);
                            }
                        }
                        else {
                            module0136.f8872((SubLObject)module0712.TWO_INTEGER, (SubLObject)module0712.$ic105$, var176, module0244.f15748(module0137.f8955((SubLObject)module0712.UNPROVIDED)), (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED);
                        }
                    }
                    finally {
                        module0137.$g1605$.rebind(var187, var173);
                        module0141.$g1674$.rebind(var186, var173);
                        module0141.$g1672$.rebind(var185, var173);
                        module0141.$g1671$.rebind(var35_233, var173);
                        module0141.$g1670$.rebind(var25_232, var173);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var183, var173);
                    module0141.$g1714$.rebind(var25_231, var173);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var173));
            }
            finally {
                module0139.$g1635$.rebind(var181, var173);
            }
            var175 = var175.rest();
            var176 = var175.first();
        }
        return var62;
    }
    
    public static SubLObject f43712(final SubLObject var62, final SubLObject var173) {
        final SubLThread var174 = SubLProcess.currentSubLThread();
        final SubLObject var175 = module0077.f5313((SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED);
        final SubLObject var176 = module0147.f9540(var173);
        final SubLObject var177 = module0147.$g2095$.currentBinding(var174);
        final SubLObject var178 = module0147.$g2094$.currentBinding(var174);
        final SubLObject var179 = module0147.$g2096$.currentBinding(var174);
        try {
            module0147.$g2095$.bind(module0147.f9545(var176), var174);
            module0147.$g2094$.bind(module0147.f9546(var176), var174);
            module0147.$g2096$.bind(module0147.f9549(var176), var174);
            final SubLObject var180 = module0077.f5333(var62);
            SubLObject var181;
            SubLObject var182;
            SubLObject var183;
            for (var181 = module0032.f1741(var180), var182 = (SubLObject)module0712.NIL, var182 = module0032.f1742(var181, var180); module0712.NIL == module0032.f1744(var181, var182); var182 = module0032.f1743(var182)) {
                var183 = module0032.f1745(var181, var182);
                if (module0712.NIL != module0032.f1746(var182, var183)) {
                    f43713(var183, var62, var175);
                }
            }
        }
        finally {
            module0147.$g2096$.rebind(var179, var174);
            module0147.$g2094$.rebind(var178, var174);
            module0147.$g2095$.rebind(var177, var174);
        }
        return var175;
    }
    
    public static SubLObject f43713(final SubLObject var24, final SubLObject var62, final SubLObject var251) {
        final SubLObject var252 = (SubLObject)module0712.NIL;
        if (module0712.NIL != module0158.f10010(var24, (SubLObject)module0712.NIL, var252)) {
            final SubLObject var253 = module0158.f10011(var24, (SubLObject)module0712.NIL, var252);
            SubLObject var254 = (SubLObject)module0712.NIL;
            final SubLObject var255 = (SubLObject)module0712.NIL;
            while (module0712.NIL == var254) {
                final SubLObject var256 = module0052.f3695(var253, var255);
                final SubLObject var257 = (SubLObject)SubLObjectFactory.makeBoolean(!var255.eql(var256));
                if (module0712.NIL != var257) {
                    SubLObject var258 = (SubLObject)module0712.NIL;
                    try {
                        var258 = module0158.f10316(var256, (SubLObject)module0712.$ic61$, (SubLObject)module0712.NIL, (SubLObject)module0712.NIL);
                        SubLObject var80_252 = (SubLObject)module0712.NIL;
                        final SubLObject var81_253 = (SubLObject)module0712.NIL;
                        while (module0712.NIL == var80_252) {
                            final SubLObject var259 = module0052.f3695(var258, var81_253);
                            final SubLObject var83_254 = (SubLObject)SubLObjectFactory.makeBoolean(!var81_253.eql(var259));
                            if (module0712.NIL != var83_254) {
                                SubLObject var260 = (SubLObject)module0712.NIL;
                                final SubLObject var261 = module0205.f13207(var259, (SubLObject)module0712.$ic107$);
                                SubLObject var262;
                                SubLObject var263;
                                for (var262 = (SubLObject)module0712.NIL, var262 = var261; module0712.NIL == var260 && module0712.NIL != var262; var262 = var262.rest()) {
                                    var263 = var262.first();
                                    if (!var263.equal(var24) && !var263.isString() && !var263.isNumber() && module0712.NIL == module0077.f5320(var263, var62)) {
                                        var260 = (SubLObject)module0712.T;
                                    }
                                }
                                if (module0712.NIL == var260) {
                                    module0077.f5326(var259, var251);
                                }
                            }
                            var80_252 = (SubLObject)SubLObjectFactory.makeBoolean(module0712.NIL == var83_254);
                        }
                    }
                    finally {
                        final SubLObject var264 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0712.T);
                            if (module0712.NIL != var258) {
                                module0158.f10319(var258);
                            }
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var264);
                        }
                    }
                }
                var254 = (SubLObject)SubLObjectFactory.makeBoolean(module0712.NIL == var257);
            }
        }
        return var251;
    }
    
    public static SubLObject f43714(final SubLObject var71, final SubLObject var110, final SubLObject var152) {
        final SubLThread var153 = SubLProcess.currentSubLThread();
        final SubLObject var154 = Sequences.cconcatenate(module0006.f203(var110), new SubLObject[] { module0006.f203(var152), module0712.$ic80$ });
        final SubLObject var155 = Sequences.cconcatenate(module0006.f203(var110), new SubLObject[] { module0006.f203(var152), module0712.$ic81$ });
        final SubLObject var156 = module0710.$g5582$.currentBinding(var153);
        final SubLObject var157 = module0711.$g5588$.currentBinding(var153);
        final SubLObject var158 = module0710.$g5586$.currentBinding(var153);
        final SubLObject var159 = module0710.$g5592$.currentBinding(var153);
        final SubLObject var160 = module0710.$g5591$.currentBinding(var153);
        try {
            module0710.$g5582$.bind((SubLObject)module0712.NIL, var153);
            module0711.$g5588$.bind((SubLObject)module0712.T, var153);
            module0710.$g5586$.bind((SubLObject)module0712.T, var153);
            module0710.$g5592$.bind(module0710.f43473((SubLObject)module0712.UNPROVIDED), var153);
            module0710.$g5591$.bind((SubLObject)ConsesLow.list(reader.bq_cons((SubLObject)module0712.$ic82$, module0699.f42557()), reader.bq_cons((SubLObject)module0712.$ic83$, module0699.f42527()), reader.bq_cons((SubLObject)module0712.$ic84$, module0699.f42547()), reader.bq_cons((SubLObject)module0712.$ic85$, module0710.f43481((SubLObject)module0712.UNPROVIDED)), reader.bq_cons((SubLObject)module0712.$ic86$, module0710.f43473((SubLObject)module0712.UNPROVIDED))), var153);
            SubLObject var161 = (SubLObject)module0712.NIL;
            try {
                final SubLObject var25_260 = stream_macros.$stream_requires_locking$.currentBinding(var153);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0712.NIL, var153);
                    var161 = compatibility.open_text(var154, (SubLObject)module0712.$ic70$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var25_260, var153);
                }
                if (!var161.isStream()) {
                    Errors.error((SubLObject)module0712.$ic39$, var154);
                }
                final SubLObject var60_261 = var161;
                SubLObject var262_263 = (SubLObject)module0712.NIL;
                try {
                    final SubLObject var25_261 = stream_macros.$stream_requires_locking$.currentBinding(var153);
                    try {
                        stream_macros.$stream_requires_locking$.bind((SubLObject)module0712.NIL, var153);
                        var262_263 = compatibility.open_text(var155, (SubLObject)module0712.$ic70$);
                    }
                    finally {
                        stream_macros.$stream_requires_locking$.rebind(var25_261, var153);
                    }
                    if (!var262_263.isStream()) {
                        Errors.error((SubLObject)module0712.$ic39$, var155);
                    }
                    final SubLObject var162 = var262_263;
                    f43694(var71, (SubLObject)module0712.NIL, var60_261, var162, module0710.f43473((SubLObject)module0712.UNPROVIDED));
                }
                finally {
                    final SubLObject var25_262 = Threads.$is_thread_performing_cleanupP$.currentBinding(var153);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0712.T, var153);
                        if (var262_263.isStream()) {
                            streams_high.close(var262_263, (SubLObject)module0712.UNPROVIDED);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var25_262, var153);
                    }
                }
            }
            finally {
                final SubLObject var25_263 = Threads.$is_thread_performing_cleanupP$.currentBinding(var153);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0712.T, var153);
                    if (var161.isStream()) {
                        streams_high.close(var161, (SubLObject)module0712.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var25_263, var153);
                }
            }
        }
        finally {
            module0710.$g5591$.rebind(var160, var153);
            module0710.$g5592$.rebind(var159, var153);
            module0710.$g5586$.rebind(var158, var153);
            module0711.$g5588$.rebind(var157, var153);
            module0710.$g5582$.rebind(var156, var153);
        }
        return var154;
    }
    
    public static SubLObject f43693(final SubLObject var267, final SubLObject var76, SubLObject var60, SubLObject var100) {
        if (var60 == module0712.UNPROVIDED) {
            var60 = module0587.$g4457$.getDynamicValue();
        }
        if (var100 == module0712.UNPROVIDED) {
            var100 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread var268 = SubLProcess.currentSubLThread();
        PrintLow.format(var100, (SubLObject)module0712.$ic108$, var76);
        final SubLObject var270;
        final SubLObject var269 = var270 = module0034.f1854((SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED);
        final SubLObject var271 = module0034.$g879$.currentBinding(var268);
        try {
            module0034.$g879$.bind(var270, var268);
            SubLObject var272 = (SubLObject)module0712.NIL;
            if (module0712.NIL != var270 && module0712.NIL == module0034.f1842(var270)) {
                var272 = module0034.f1869(var270);
                final SubLObject var273 = Threads.current_process();
                if (module0712.NIL == var272) {
                    module0034.f1873(var270, var273);
                }
                else if (!var272.eql(var273)) {
                    Errors.error((SubLObject)module0712.$ic66$);
                }
            }
            try {
                final SubLObject var274 = module0139.$g1630$.getDynamicValue(var268);
                final SubLObject var25_270 = module0139.$g1631$.currentBinding(var268);
                final SubLObject var275 = module0139.$g1632$.currentBinding(var268);
                final SubLObject var276 = module0139.$g1630$.currentBinding(var268);
                final SubLObject var277 = StreamsLow.$error_output$.currentBinding(var268);
                try {
                    module0139.$g1631$.bind(module0139.f9015(var274, (SubLObject)module0712.FOUR_INTEGER), var268);
                    module0139.$g1632$.bind(module0139.f9016(var274), var268);
                    module0139.$g1630$.bind((SubLObject)module0712.T, var268);
                    StreamsLow.$error_output$.bind(var100, var268);
                    f43715(var60);
                    f43716(var60, (SubLObject)module0712.UNPROVIDED);
                    final SubLObject var25_271 = module0587.$g4457$.currentBinding(var268);
                    try {
                        module0587.$g4457$.bind(var60, var268);
                        module0601.f36746();
                    }
                    finally {
                        module0587.$g4457$.rebind(var25_271, var268);
                    }
                    SubLObject var278 = (SubLObject)module0712.ZERO_INTEGER;
                    SubLObject var279 = (SubLObject)module0712.ZERO_INTEGER;
                    final SubLObject var25_272 = StreamsLow.$standard_output$.currentBinding(var268);
                    try {
                        StreamsLow.$standard_output$.bind(var100, var268);
                        final SubLObject var280 = Sequences.cconcatenate((SubLObject)module0712.$ic109$, new SubLObject[] { module0006.f203(var76), module0712.$ic110$ });
                        final SubLObject var25_273 = module0012.$g75$.currentBinding(var268);
                        final SubLObject var35_277 = module0012.$g76$.currentBinding(var268);
                        final SubLObject var37_278 = module0012.$g77$.currentBinding(var268);
                        final SubLObject var38_279 = module0012.$g78$.currentBinding(var268);
                        try {
                            module0012.$g75$.bind((SubLObject)module0712.ZERO_INTEGER, var268);
                            module0012.$g76$.bind((SubLObject)module0712.NIL, var268);
                            module0012.$g77$.bind((SubLObject)module0712.T, var268);
                            module0012.$g78$.bind(Time.get_universal_time(), var268);
                            module0012.f478(var280);
                            final SubLObject var25_274 = module0711.$g5597$.currentBinding(var268);
                            try {
                                module0711.$g5597$.bind(module0077.f5313(Symbols.symbol_function((SubLObject)module0712.EQUAL), var76), var268);
                                SubLObject var281 = (SubLObject)module0712.NIL;
                                SubLObject var284;
                                for (SubLObject var282 = (SubLObject)module0712.NIL; module0712.NIL == var282; var282 = (SubLObject)SubLObjectFactory.makeBoolean(module0712.NIL == var284)) {
                                    var268.resetMultipleValues();
                                    final SubLObject var283 = module0052.f3693(var267);
                                    var284 = var268.secondMultipleValue();
                                    var268.resetMultipleValues();
                                    if (module0712.NIL != var284) {
                                        module0077.f5326(var283, module0711.$g5597$.getDynamicValue(var268));
                                        var281 = (SubLObject)ConsesLow.cons(var283, var281);
                                    }
                                }
                                final SubLObject var285 = module0052.f3709(Sequences.nreverse(var281));
                                SubLObject var288;
                                for (SubLObject var286 = (SubLObject)module0712.NIL; module0712.NIL == var286; var286 = (SubLObject)SubLObjectFactory.makeBoolean(module0712.NIL == var288)) {
                                    var268.resetMultipleValues();
                                    final SubLObject var287 = module0052.f3693(var285);
                                    var288 = var268.secondMultipleValue();
                                    var268.resetMultipleValues();
                                    if (module0712.NIL != var288) {
                                        var279 = Numbers.add(var279, f43717(var287, var60, var100));
                                        var278 = Numbers.add(var278, (SubLObject)module0712.ONE_INTEGER);
                                        module0012.note_percent_progress(var278, var76);
                                    }
                                }
                            }
                            finally {
                                module0711.$g5597$.rebind(var25_274, var268);
                            }
                            module0012.f479();
                        }
                        finally {
                            module0012.$g78$.rebind(var38_279, var268);
                            module0012.$g77$.rebind(var37_278, var268);
                            module0012.$g76$.rebind(var35_277, var268);
                            module0012.$g75$.rebind(var25_273, var268);
                        }
                        PrintLow.format(var100, (SubLObject)module0712.$ic111$, var278, var279);
                    }
                    finally {
                        StreamsLow.$standard_output$.rebind(var25_272, var268);
                    }
                    f43718(var60);
                }
                finally {
                    StreamsLow.$error_output$.rebind(var277, var268);
                    module0139.$g1630$.rebind(var276, var268);
                    module0139.$g1632$.rebind(var275, var268);
                    module0139.$g1631$.rebind(var25_270, var268);
                }
            }
            finally {
                final SubLObject var25_275 = Threads.$is_thread_performing_cleanupP$.currentBinding(var268);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0712.T, var268);
                    if (module0712.NIL != var270 && module0712.NIL == var272) {
                        module0034.f1873(var270, (SubLObject)module0712.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var25_275, var268);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var271, var268);
        }
        return (SubLObject)module0712.NIL;
    }
    
    public static SubLObject f43717(final SubLObject var24, SubLObject var60, SubLObject var100) {
        if (var60 == module0712.UNPROVIDED) {
            var60 = module0587.$g4457$.getDynamicValue();
        }
        if (var100 == module0712.UNPROVIDED) {
            var100 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread var101 = SubLProcess.currentSubLThread();
        SubLObject var102 = (SubLObject)module0712.NIL;
        SubLObject var103 = (SubLObject)module0712.NIL;
        SubLObject var104 = (SubLObject)module0712.NIL;
        final SubLObject var105 = StreamsLow.$error_output$.currentBinding(var101);
        try {
            StreamsLow.$error_output$.bind(var100, var101);
            try {
                var101.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var25_288 = Errors.$error_handler$.currentBinding(var101);
                try {
                    Errors.$error_handler$.bind((SubLObject)module0712.$ic112$, var101);
                    try {
                        var102 = module0711.f43512(var24);
                        var103 = f43719(var102);
                        if (module0712.NIL != module0004.f105(module0711.$g5601$.getDynamicValue(var101))) {
                            PrintLow.format(var100, (SubLObject)module0712.$ic113$, var24, Sequences.length(var102));
                        }
                        if (module0712.NIL == var103) {
                            f43720(var102, var60);
                        }
                    }
                    catch (Throwable var106) {
                        Errors.handleThrowable(var106, (SubLObject)module0712.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var25_288, var101);
                }
            }
            catch (Throwable var107) {
                var104 = Errors.handleThrowable(var107, module0003.$g3$.getGlobalValue());
            }
            finally {
                var101.throwStack.pop();
            }
            if (module0712.NIL != var104) {
                Errors.warn(var104);
            }
        }
        finally {
            StreamsLow.$error_output$.rebind(var105, var101);
        }
        return (SubLObject)((module0712.NIL != var103) ? module0712.ZERO_INTEGER : Sequences.length(var102));
    }
    
    public static SubLObject f43719(final SubLObject var285) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0712.NIL != module0035.f2012(var285) || (module0712.NIL != module0035.f1995(var285, (SubLObject)module0712.ONE_INTEGER, (SubLObject)module0712.UNPROVIDED) && module0699.f42535((SubLObject)module0712.$ic114$).equal(conses_high.second(var285.first()))));
    }
    
    public static SubLObject f43721(final SubLObject var20, SubLObject var60) {
        if (var60 == module0712.UNPROVIDED) {
            var60 = module0587.$g4457$.getDynamicValue();
        }
        final SubLObject var61 = module0711.f43512(var20);
        f43720(var61, var60);
        return (SubLObject)module0712.NIL;
    }
    
    public static SubLObject f43715(SubLObject var60) {
        if (var60 == module0712.UNPROVIDED) {
            var60 = module0587.$g4457$.getDynamicValue();
        }
        final SubLObject var61 = f43658();
        print_high.princ(f43722(module0035.sublisp_boolean(var61)), var60);
        if (module0712.NIL != module0038.f2611(var61)) {
            print_high.princ(f43723(), var60);
            print_high.princ(f43657(var61), var60);
        }
        return (SubLObject)module0712.NIL;
    }
    
    public static SubLObject f43718(SubLObject var60) {
        if (var60 == module0712.UNPROVIDED) {
            var60 = module0587.$g4457$.getDynamicValue();
        }
        return PrintLow.format(var60, (SubLObject)module0712.$ic115$, module0712.$g5633$.getGlobalValue());
    }
    
    public static SubLObject f43723() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return Sequences.cconcatenate((SubLObject)module0712.$ic117$, new SubLObject[] { module0006.f203(module0712.$g5651$.getDynamicValue(var2)), module0712.$ic118$ });
    }
    
    public static SubLObject f43722(final SubLObject var291) {
        final SubLThread var292 = SubLProcess.currentSubLThread();
        SubLObject var293 = (SubLObject)module0712.NIL;
        SubLObject var294 = (SubLObject)module0712.NIL;
        try {
            var294 = streams_high.make_private_string_output_stream();
            print_high.princ(Sequences.cconcatenate((SubLObject)module0712.$ic119$, new SubLObject[] { module0038.$g917$.getGlobalValue(), f43724(), module0712.$ic120$, module0710.f43485((SubLObject)module0712.UNPROVIDED), module0712.$ic40$, module0038.$g917$.getGlobalValue(), module0712.$ic121$, module0710.f43492(module0710.f43489()), module0712.$ic40$ }), var294);
            SubLObject var295 = module0710.$g5591$.getDynamicValue(var292);
            SubLObject var296 = (SubLObject)module0712.NIL;
            var296 = var295.first();
            while (module0712.NIL != var295) {
                SubLObject var298;
                final SubLObject var297 = var298 = var296;
                SubLObject var299 = (SubLObject)module0712.NIL;
                SubLObject var300 = (SubLObject)module0712.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var298, var297, (SubLObject)module0712.$ic122$);
                var299 = var298.first();
                var298 = (var300 = var298.rest());
                PrintLow.format(var294, (SubLObject)module0712.$ic123$, var299, (module0712.NIL != module0711.$g5593$.getDynamicValue(var292)) ? Sequences.cconcatenate((SubLObject)module0712.$ic124$, new SubLObject[] { var299, module0712.$ic125$ }) : var300);
                var295 = var295.rest();
                var296 = var295.first();
            }
            PrintLow.format(var294, (SubLObject)module0712.$ic126$);
            if (module0712.NIL != var291) {
                PrintLow.format(var294, (SubLObject)module0712.$ic127$);
            }
            var293 = streams_high.get_output_stream_string(var294);
        }
        finally {
            final SubLObject var301 = Threads.$is_thread_performing_cleanupP$.currentBinding(var292);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0712.T, var292);
                streams_high.close(var294, (SubLObject)module0712.UNPROVIDED);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var301, var292);
            }
        }
        return var293;
    }
    
    public static SubLObject f43724() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0712.NIL != module0711.$g5593$.getDynamicValue(var2)) {
            SubLObject var3 = (SubLObject)module0712.NIL;
            SubLObject var4 = (SubLObject)module0712.NIL;
            try {
                var4 = streams_high.make_private_string_output_stream();
                final SubLObject var5 = module0587.$g4457$.currentBinding(var2);
                try {
                    module0587.$g4457$.bind(var4, var2);
                    f43725(module0710.$g5591$.getDynamicValue(var2));
                }
                finally {
                    module0587.$g4457$.rebind(var5, var2);
                }
                var3 = streams_high.get_output_stream_string(var4);
            }
            finally {
                final SubLObject var6 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0712.T, var2);
                    streams_high.close(var4, (SubLObject)module0712.UNPROVIDED);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var6, var2);
                }
            }
            return var3;
        }
        return module0038.$g916$.getGlobalValue();
    }
    
    public static SubLObject f43720(final SubLObject var298, SubLObject var60) {
        if (var60 == module0712.UNPROVIDED) {
            var60 = module0587.$g4457$.getDynamicValue();
        }
        final SubLThread var299 = SubLProcess.currentSubLThread();
        assert module0712.NIL != module0035.f2013(var298) : var298;
        final SubLObject var300 = module0587.$g4461$.currentBinding(var299);
        try {
            module0587.$g4461$.bind(module0035.f2062(module0710.$g5591$.getDynamicValue(var299)), var299);
            SubLObject var301 = (SubLObject)module0712.NIL;
            SubLObject var302 = (SubLObject)module0712.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var298, var298, (SubLObject)module0712.$ic129$);
            var301 = var298.first();
            final SubLObject var303 = var302 = var298.rest();
            final SubLObject var25_302 = module0587.$g4457$.currentBinding(var299);
            try {
                module0587.$g4457$.bind(var60, var299);
                module0601.f36746();
                final SubLObject var304 = module0035.f2012(var302);
                f43726(var301, (SubLObject)module0712.ONE_INTEGER, var304, (SubLObject)module0712.UNPROVIDED);
                module0601.f36746();
                SubLObject var305 = var302;
                SubLObject var306 = (SubLObject)module0712.NIL;
                var306 = var305.first();
                while (module0712.NIL != var305) {
                    final SubLObject var307 = module0205.f13136(var306);
                    final SubLObject var308 = module0205.f13203(var307, (SubLObject)module0712.UNPROVIDED);
                    final SubLObject var309 = f43727(var308);
                    final SubLObject var310 = module0205.f13204(var306, (SubLObject)module0712.UNPROVIDED);
                    PrintLow.format(module0587.$g4457$.getDynamicValue(var299), (SubLObject)module0712.$ic115$, f43728((SubLObject)module0712.TWO_INTEGER));
                    f43729(var309, var310, (SubLObject)module0712.UNPROVIDED);
                    module0601.f36746();
                    var305 = var305.rest();
                    var306 = var305.first();
                }
                if (module0712.NIL == var304) {
                    PrintLow.format(module0587.$g4457$.getDynamicValue(var299), (SubLObject)module0712.$ic115$, f43730(var301, (SubLObject)module0712.ONE_INTEGER));
                }
            }
            finally {
                module0587.$g4457$.rebind(var25_302, var299);
            }
        }
        finally {
            module0587.$g4461$.rebind(var300, var299);
        }
        return (SubLObject)module0712.NIL;
    }
    
    public static SubLObject f43726(final SubLObject var24, final SubLObject var308, final SubLObject var309, SubLObject var60) {
        if (var60 == module0712.UNPROVIDED) {
            var60 = module0587.$g4457$.getDynamicValue();
        }
        final SubLThread var310 = SubLProcess.currentSubLThread();
        final SubLObject var311 = module0587.$g4457$.currentBinding(var310);
        try {
            module0587.$g4457$.bind(var60, var310);
            final SubLObject var312 = module0205.f13203(var24, (SubLObject)module0712.UNPROVIDED);
            final SubLObject var313 = f43727(var312);
            final SubLObject var314 = module0205.f13204(var24, (SubLObject)module0712.UNPROVIDED);
            SubLObject var315 = (SubLObject)module0712.NIL;
            if (module0712.NIL != module0038.f2684(var314, module0710.f43489()) && Characters.CHAR_hash.eql(module0038.f2637(module0710.f43489()))) {
                var315 = (SubLObject)ConsesLow.list(module0699.f42535((SubLObject)module0712.$ic130$), module0038.f2674(var314, module0710.f43489(), (SubLObject)module0712.UNPROVIDED));
            }
            else if (module0712.NIL == module0589.f35907(var314, (SubLObject)module0712.UNPROVIDED) && Characters.CHAR_hash.eql(module0038.f2637(module0710.f43489()))) {
                var315 = (SubLObject)ConsesLow.list(module0699.f42535((SubLObject)module0712.$ic130$), var314);
            }
            else {
                var315 = (SubLObject)ConsesLow.list(module0699.f42535((SubLObject)module0712.$ic131$), f43731(var314));
            }
            if (var315.first().equal(module0699.f42535((SubLObject)module0712.$ic130$))) {
                enforceType(conses_high.second(var315), module0712.$ic132$);
            }
            module0601.f36747(f43728(var308), (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED);
            module0601.f36758(var313, var315, var309, (SubLObject)module0712.UNPROVIDED);
        }
        finally {
            module0587.$g4457$.rebind(var311, var310);
        }
        return (SubLObject)module0712.NIL;
    }
    
    public static SubLObject f43727(final SubLObject var64) {
        if (module0712.NIL != module0038.f2684(var64, module0710.f43489())) {
            return module0038.f2674(var64, module0710.f43489(), (SubLObject)module0712.UNPROVIDED);
        }
        if (module0712.NIL == module0601.f36767(var64)) {
            Errors.error((SubLObject)module0712.$ic133$, var64, module0710.f43489());
            return (SubLObject)module0712.NIL;
        }
        return var64;
    }
    
    public static SubLObject f43731(final SubLObject var6) {
        return (module0712.NIL != module0038.f2684(var6, module0710.f43485((SubLObject)module0712.UNPROVIDED))) ? module0038.f2674(var6, module0710.f43485((SubLObject)module0712.UNPROVIDED), (SubLObject)module0712.UNPROVIDED) : module0710.f43492(var6);
    }
    
    public static SubLObject f43730(final SubLObject var24, final SubLObject var308) {
        final SubLObject var309 = module0205.f13203(var24, (SubLObject)module0712.UNPROVIDED);
        return Sequences.cconcatenate(module0006.f203(f43728(var308)), new SubLObject[] { module0712.$ic134$, module0006.f203(f43727(var309)), module0712.$ic135$, module0006.$g11$.getGlobalValue() });
    }
    
    public static SubLObject f43729(final SubLObject var312, SubLObject var313, SubLObject var60) {
        if (var60 == module0712.UNPROVIDED) {
            var60 = module0587.$g4457$.getDynamicValue();
        }
        final SubLThread var314 = SubLProcess.currentSubLThread();
        enforceType(var312, module0712.$ic132$);
        if (var313.isString() && module0712.NIL != Sequences.search((SubLObject)module0712.$ic136$, var313, Symbols.symbol_function((SubLObject)module0712.EQUALP), (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED)) {
            final SubLObject var315 = module0039.f3053(var313);
            if (module0712.NIL != var315) {
                var313 = var315;
            }
        }
        if (var313.isString() && module0712.NIL != Sequences.find((SubLObject)Characters.CHAR_less, var313, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED)) {
            var313 = module0038.f2659((SubLObject)module0712.$ic137$, (SubLObject)module0712.$ic138$, var313, Symbols.symbol_function((SubLObject)module0712.EQUALP));
        }
        final SubLObject var316 = module0587.$g4457$.currentBinding(var314);
        try {
            module0587.$g4457$.bind(var60, var314);
            f43732(var312, var313);
        }
        finally {
            module0587.$g4457$.rebind(var316, var314);
        }
        return (SubLObject)module0712.NIL;
    }
    
    public static SubLObject f43732(final SubLObject var312, final SubLObject var313) {
        SubLObject var314 = conses_high.copy_list(module0035.f2293(f43662(), var312, Symbols.symbol_function((SubLObject)module0712.EQUAL), (SubLObject)module0712.UNPROVIDED));
        if (var313.isString() && module0712.NIL != module0035.f2171(var312, module0712.$g5640$.getGlobalValue())) {
            module0601.f36758(var312, (SubLObject)ConsesLow.list((SubLObject)module0712.$ic139$, var313), (SubLObject)module0712.T, (SubLObject)module0712.UNPROVIDED);
        }
        else if (module0712.NIL != module0202.f12589(var313, module0712.$ic140$)) {
            module0601.f36758(var312, (SubLObject)ConsesLow.list((SubLObject)module0712.$ic139$, f43731(module0205.f13277(var313, (SubLObject)module0712.UNPROVIDED))), (SubLObject)module0712.T, (SubLObject)module0712.UNPROVIDED);
        }
        else if (module0712.NIL != module0202.f12589(var313, module0712.$ic141$)) {
            var314 = conses_high.putf(var314, (SubLObject)module0712.$ic142$, module0205.f13277(var313, (SubLObject)module0712.UNPROVIDED));
            module0601.f36758(var312, var314, (SubLObject)module0712.NIL, (SubLObject)module0712.UNPROVIDED);
            module0601.f36759(module0205.f13368(var313, (SubLObject)module0712.UNPROVIDED));
            module0601.f36760(var312);
        }
        else {
            module0601.f36758(var312, var314, (SubLObject)module0712.NIL, (SubLObject)module0712.UNPROVIDED);
            if (var312.equal((SubLObject)module0712.$ic143$)) {
                f43733(var313, (SubLObject)module0712.UNPROVIDED);
            }
            else if (Sequences.count_if((SubLObject)module0712.$ic144$, var313, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED).numG((SubLObject)module0712.FOUR_INTEGER)) {
                module0601.f36754(var313);
            }
            else {
                module0601.f36759(var313);
            }
            module0601.f36760(var312);
        }
        return (SubLObject)module0712.NIL;
    }
    
    public static SubLObject f43734(final SubLObject var316, final SubLObject var317) {
        SubLObject var319;
        final SubLObject var318 = var319 = var316.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var319, var318, (SubLObject)module0712.$ic145$);
        final SubLObject var320 = var319.rest();
        var319 = var319.first();
        final SubLObject var321 = (SubLObject)(var319.isCons() ? var319.first() : module0712.ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var319, var318, (SubLObject)module0712.$ic145$);
        var319 = var319.rest();
        if (module0712.NIL == var319) {
            final SubLObject var322;
            var319 = (var322 = var320);
            return (SubLObject)ConsesLow.listS((SubLObject)module0712.$ic146$, (SubLObject)ConsesLow.list((SubLObject)module0712.$ic147$, (SubLObject)ConsesLow.list((SubLObject)module0712.$ic148$, (SubLObject)ConsesLow.listS((SubLObject)module0712.$ic149$, var321, (SubLObject)module0712.$ic150$))), ConsesLow.append(var322, (SubLObject)module0712.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var318, (SubLObject)module0712.$ic145$);
        return (SubLObject)module0712.NIL;
    }
    
    public static SubLObject f43733(final SubLObject var323, SubLObject var60) {
        if (var60 == module0712.UNPROVIDED) {
            var60 = module0587.$g4457$.getDynamicValue();
        }
        final SubLThread var324 = SubLProcess.currentSubLThread();
        SubLObject var325 = (SubLObject)module0712.NIL;
        SubLObject var326 = (SubLObject)module0712.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var323, var323, (SubLObject)module0712.$ic151$);
        var325 = var323.first();
        SubLObject var327 = var323.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var327, var323, (SubLObject)module0712.$ic151$);
        var326 = var327.first();
        var327 = var327.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var327, var323, (SubLObject)module0712.$ic151$);
        final SubLObject var328 = var327.rest();
        var327 = var327.first();
        SubLObject var329 = (SubLObject)module0712.NIL;
        SubLObject var330 = (SubLObject)module0712.NIL;
        SubLObject var331 = (SubLObject)module0712.NIL;
        SubLObject var332 = (SubLObject)module0712.NIL;
        SubLObject var333 = (SubLObject)module0712.NIL;
        SubLObject var334 = (SubLObject)module0712.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var327, var323, (SubLObject)module0712.$ic151$);
        var329 = var327.first();
        var327 = var327.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var327, var323, (SubLObject)module0712.$ic151$);
        var330 = var327.first();
        var327 = var327.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var327, var323, (SubLObject)module0712.$ic151$);
        var331 = var327.first();
        var327 = var327.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var327, var323, (SubLObject)module0712.$ic151$);
        var332 = var327.first();
        var327 = var327.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var327, var323, (SubLObject)module0712.$ic151$);
        var333 = var327.first();
        var327 = var327.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var327, var323, (SubLObject)module0712.$ic151$);
        var334 = var327.first();
        var327 = var327.rest();
        if (module0712.NIL == var327) {
            var327 = var328;
            if (module0712.NIL == var327) {
                final SubLObject var335 = module0587.$g4457$.currentBinding(var324);
                try {
                    module0587.$g4457$.bind(var60, var324);
                    module0601.f36746();
                    f43726(var326, (SubLObject)module0712.THREE_INTEGER, (SubLObject)module0712.T, (SubLObject)module0712.UNPROVIDED);
                    final SubLObject var25_334 = module0601.$g4653$.currentBinding(var324);
                    final SubLObject var336 = module0601.$g4652$.currentBinding(var324);
                    try {
                        module0601.$g4653$.bind(Sequences.length(module0712.$g5634$.getGlobalValue()), var324);
                        module0601.$g4652$.bind(Numbers.multiply((SubLObject)module0712.TWO_INTEGER, module0601.$g4653$.getDynamicValue(var324)), var324);
                        final SubLObject var25_335 = module0601.$g4653$.currentBinding(var324);
                        final SubLObject var35_336 = module0601.$g4652$.currentBinding(var324);
                        try {
                            module0601.$g4653$.bind(Sequences.length(module0712.$g5634$.getGlobalValue()), var324);
                            module0601.$g4652$.bind(Numbers.multiply((SubLObject)module0712.THREE_INTEGER, module0601.$g4653$.getDynamicValue(var324)), var324);
                            module0601.f36746();
                            try {
                                final SubLObject var25_336 = module0601.$g4652$.currentBinding(var324);
                                final SubLObject var35_337 = module0601.$g4654$.currentBinding(var324);
                                try {
                                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var324), module0601.$g4652$.getDynamicValue(var324)), var324);
                                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var324), var324);
                                    module0601.f36758(var330, (SubLObject)module0712.NIL, (SubLObject)module0712.NIL, (SubLObject)module0712.NIL);
                                    module0601.f36746();
                                    f43732(var331, var332);
                                    module0601.f36746();
                                    f43732(var333, var334);
                                }
                                finally {
                                    module0601.$g4654$.rebind(var35_337, var324);
                                    module0601.$g4652$.rebind(var25_336, var324);
                                }
                            }
                            finally {
                                final SubLObject var25_337 = Threads.$is_thread_performing_cleanupP$.currentBinding(var324);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0712.T, var324);
                                    module0601.f36746();
                                    module0601.f36760(var330);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var25_337, var324);
                                }
                            }
                        }
                        finally {
                            module0601.$g4652$.rebind(var35_336, var324);
                            module0601.$g4653$.rebind(var25_335, var324);
                        }
                        module0601.f36746();
                    }
                    finally {
                        module0601.$g4652$.rebind(var336, var324);
                        module0601.$g4653$.rebind(var25_334, var324);
                    }
                }
                finally {
                    module0587.$g4457$.rebind(var335, var324);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var323, (SubLObject)module0712.$ic151$);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var323, (SubLObject)module0712.$ic151$);
        }
        return (SubLObject)module0712.NIL;
    }
    
    public static SubLObject f43728(final SubLObject var340) {
        if (var340.eql((SubLObject)module0712.ONE_INTEGER)) {
            return module0712.$g5634$.getGlobalValue();
        }
        if (var340.eql((SubLObject)module0712.TWO_INTEGER)) {
            return module0712.$g5635$.getGlobalValue();
        }
        if (var340.eql((SubLObject)module0712.THREE_INTEGER)) {
            return module0712.$g5636$.getGlobalValue();
        }
        if (var340.eql((SubLObject)module0712.FOUR_INTEGER)) {
            return module0712.$g5637$.getGlobalValue();
        }
        if (var340.eql((SubLObject)module0712.FIVE_INTEGER)) {
            return module0712.$g5638$.getGlobalValue();
        }
        return Errors.error((SubLObject)module0712.$ic152$);
    }
    
    public static SubLObject f43735(final SubLObject var341) {
        return var341;
    }
    
    public static SubLObject f43736(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        if (module0712.NIL == module0173.f10955(var20)) {
            return (SubLObject)module0712.NIL;
        }
        if (module0712.NIL != module0077.f5302(module0711.$g5597$.getDynamicValue(var21)) && module0712.NIL != module0077.f5320(var20, module0711.$g5597$.getDynamicValue(var21))) {
            return (SubLObject)module0712.T;
        }
        if (module0712.NIL != module0077.f5302(module0711.$g5597$.getDynamicValue(var21))) {
            return (SubLObject)module0712.NIL;
        }
        if (module0712.NIL != module0173.f10955(var20)) {
            f43737(var20);
            return (SubLObject)module0712.T;
        }
        return (SubLObject)module0712.NIL;
    }
    
    public static SubLObject f43738(final SubLObject var20) {
        Errors.warn((SubLObject)module0712.$ic154$, var20);
        return (SubLObject)module0712.NIL;
    }
    
    public static SubLObject f43737(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        final SubLObject var22 = module0034.$g879$.getDynamicValue(var21);
        SubLObject var23 = (SubLObject)module0712.NIL;
        if (module0712.NIL == var22) {
            return f43738(var20);
        }
        var23 = module0034.f1857(var22, (SubLObject)module0712.$ic153$, (SubLObject)module0712.UNPROVIDED);
        if (module0712.NIL == var23) {
            var23 = module0034.f1807(module0034.f1842(var22), (SubLObject)module0712.$ic153$, (SubLObject)module0712.ONE_INTEGER, (SubLObject)module0712.NIL, (SubLObject)module0712.EQL, (SubLObject)module0712.UNPROVIDED);
            module0034.f1860(var22, (SubLObject)module0712.$ic153$, var23);
        }
        SubLObject var24 = module0034.f1814(var23, var20, (SubLObject)module0712.$ic19$);
        if (var24 == module0712.$ic19$) {
            var24 = Values.arg2(var21.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f43738(var20)));
            module0034.f1816(var23, var20, var24, (SubLObject)module0712.UNPROVIDED);
        }
        return module0034.f1959(var24);
    }
    
    public static SubLObject f43739(final SubLObject var345) {
        return Sequences.find(var345, module0712.$g5653$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0712.EQUAL), (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED);
    }
    
    public static SubLObject f43740() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return module0035.remove_if_not((SubLObject)module0712.$ic157$, module0710.$g5591$.getDynamicValue(var2), Symbols.symbol_function((SubLObject)module0712.$ic158$), (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED);
    }
    
    public static SubLObject f43741() {
        SubLObject var346 = (SubLObject)module0712.NIL;
        SubLObject var347 = module0712.$g5653$.getGlobalValue();
        SubLObject var348 = (SubLObject)module0712.NIL;
        var348 = var347.first();
        while (module0712.NIL != var347) {
            var346 = (SubLObject)ConsesLow.cons(Sequences.cconcatenate((SubLObject)module0712.$ic159$, var348), var346);
            var346 = (SubLObject)ConsesLow.cons(Sequences.cconcatenate((SubLObject)module0712.$ic124$, new SubLObject[] { var348, module0712.$ic125$ }), var346);
            var347 = var347.rest();
            var348 = var347.first();
        }
        return Sequences.nreverse(var346);
    }
    
    public static SubLObject f43742(final SubLObject var107) {
        final SubLThread var108 = SubLProcess.currentSubLThread();
        SubLObject var109 = (SubLObject)module0712.NIL;
        try {
            final SubLObject var110 = stream_macros.$stream_requires_locking$.currentBinding(var108);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0712.NIL, var108);
                var109 = compatibility.open_text(var107, (SubLObject)module0712.$ic70$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var110, var108);
            }
            if (!var109.isStream()) {
                Errors.error((SubLObject)module0712.$ic39$, var107);
            }
            final SubLObject var60_348 = var109;
            f43743(var60_348);
        }
        finally {
            final SubLObject var111 = Threads.$is_thread_performing_cleanupP$.currentBinding(var108);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0712.T, var108);
                if (var109.isStream()) {
                    streams_high.close(var109, (SubLObject)module0712.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var111, var108);
            }
        }
        return var107;
    }
    
    public static SubLObject f43743(SubLObject var60) {
        if (var60 == module0712.UNPROVIDED) {
            var60 = module0587.$g4457$.getDynamicValue();
        }
        final SubLThread var61 = SubLProcess.currentSubLThread();
        final SubLObject var62 = module0587.$g4457$.currentBinding(var61);
        try {
            module0587.$g4457$.bind(var60, var61);
            module0601.f36751((SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED);
            final SubLObject var63 = f43740();
            f43725(var63);
            try {
                final SubLObject var25_350 = module0601.$g4652$.currentBinding(var61);
                final SubLObject var64 = module0601.$g4654$.currentBinding(var61);
                try {
                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var61), module0601.$g4652$.getDynamicValue(var61)), var61);
                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var61), var61);
                    module0601.f36758((SubLObject)module0712.$ic160$, (SubLObject)ConsesLow.listS((SubLObject)module0712.$ic161$, module0710.f43487(), (SubLObject)module0712.$ic162$, module0710.f43487(), f43741()), (SubLObject)module0712.NIL, (SubLObject)module0712.NIL);
                    f43716(var60, (SubLObject)module0712.T);
                }
                finally {
                    module0601.$g4654$.rebind(var64, var61);
                    module0601.$g4652$.rebind(var25_350, var61);
                }
            }
            finally {
                final SubLObject var25_351 = Threads.$is_thread_performing_cleanupP$.currentBinding(var61);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0712.T, var61);
                    module0601.f36746();
                    module0601.f36760((SubLObject)module0712.$ic160$);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var25_351, var61);
                }
            }
        }
        finally {
            module0587.$g4457$.rebind(var62, var61);
        }
        return (SubLObject)module0712.NIL;
    }
    
    public static SubLObject f43725(SubLObject var352) {
        if (var352 == module0712.UNPROVIDED) {
            var352 = (SubLObject)module0712.NIL;
        }
        final SubLThread var353 = SubLProcess.currentSubLThread();
        module0601.f36747((SubLObject)module0712.$ic163$, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED);
        if (module0712.NIL != module0035.f2013(var352)) {
            PrintLow.format(module0587.$g4457$.getDynamicValue(var353), (SubLObject)module0712.$ic164$);
            final SubLObject var354 = module0048.f3381(module0035.f2062(var352), Symbols.symbol_function((SubLObject)module0712.$ic165$));
            final SubLObject var355 = Sequences.cconcatenate((SubLObject)module0712.$ic166$, new SubLObject[] { print_high.princ_to_string(Sequences.length(var354)), module0712.$ic167$ });
            SubLObject var356 = var352;
            SubLObject var357 = (SubLObject)module0712.NIL;
            var357 = var356.first();
            while (module0712.NIL != var356) {
                SubLObject var359;
                final SubLObject var358 = var359 = var357;
                SubLObject var360 = (SubLObject)module0712.NIL;
                SubLObject var361 = (SubLObject)module0712.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var359, var358, (SubLObject)module0712.$ic122$);
                var360 = var359.first();
                var359 = (var361 = var359.rest());
                if (module0712.NIL == module0038.f2608(var360)) {
                    PrintLow.format(module0587.$g4457$.getDynamicValue(var353), var355, var360, var361);
                }
                var356 = var356.rest();
                var357 = var356.first();
            }
            module0601.f36747((SubLObject)module0712.$ic168$, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED);
        }
        module0601.f36747((SubLObject)module0712.$ic135$, (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED);
        module0601.f36746();
        return (SubLObject)module0712.NIL;
    }
    
    public static SubLObject f43716(SubLObject var60, SubLObject var357) {
        if (var60 == module0712.UNPROVIDED) {
            var60 = module0587.$g4457$.getDynamicValue();
        }
        if (var357 == module0712.UNPROVIDED) {
            var357 = (SubLObject)module0712.NIL;
        }
        final SubLThread var358 = SubLProcess.currentSubLThread();
        final SubLObject var359 = module0587.$g4457$.currentBinding(var358);
        try {
            module0587.$g4457$.bind(var60, var358);
            SubLObject var360 = module0712.$g5652$.getGlobalValue();
            SubLObject var361 = (SubLObject)module0712.NIL;
            var361 = var360.first();
            while (module0712.NIL != var360) {
                if (module0712.NIL == f43744(var361.first())) {
                    f43745(var361, var357);
                }
                var360 = var360.rest();
                var361 = var360.first();
            }
        }
        finally {
            module0587.$g4457$.rebind(var359, var358);
        }
        return (SubLObject)module0712.NIL;
    }
    
    public static SubLObject f43744(final SubLObject var359) {
        final SubLThread var360 = SubLProcess.currentSubLThread();
        SubLObject var361 = (SubLObject)module0712.NIL;
        if (module0712.NIL != module0107.f7629(module0711.$g5596$.getDynamicValue(var360))) {
            SubLObject var362;
            SubLObject var363;
            SubLObject var364;
            SubLObject var366;
            SubLObject var365;
            SubLObject var367;
            SubLObject var368;
            SubLObject var369;
            SubLObject var370;
            SubLObject var371;
            for (var362 = (SubLObject)module0712.NIL, var363 = (SubLObject)module0712.NIL, var363 = module0711.f43507((SubLObject)module0712.UNPROVIDED); module0712.NIL == var362 && module0712.NIL != var363; var363 = var363.rest()) {
                var364 = var363.first();
                var365 = (var366 = var364);
                var367 = (SubLObject)module0712.NIL;
                var368 = (SubLObject)module0712.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var366, var365, (SubLObject)module0712.$ic169$);
                var367 = var366.first();
                var366 = (var368 = var366.rest());
                if (module0712.NIL != module0038.f2673(var368, var359, (SubLObject)module0712.UNPROVIDED) && module0712.NIL != module0038.f2684(var368, module0710.f43486()) && module0712.NIL != module0035.f1995(var368, Numbers.add(Sequences.length(var359), Sequences.length(module0710.f43486()), (SubLObject)module0712.ONE_INTEGER), (SubLObject)module0712.UNPROVIDED)) {
                    for (var369 = module0066.f4838(module0067.f4891(module0711.$g5596$.getDynamicValue(var360))); module0712.NIL == var362 && module0712.NIL == module0066.f4841(var369); var369 = module0066.f4840(var369)) {
                        var360.resetMultipleValues();
                        var370 = module0066.f4839(var369);
                        var371 = var360.secondMultipleValue();
                        var360.resetMultipleValues();
                        if (module0712.NIL != Sequences.find(var367, var371, Symbols.symbol_function((SubLObject)module0712.EQUAL), Symbols.symbol_function((SubLObject)module0712.$ic170$), (SubLObject)module0712.UNPROVIDED, (SubLObject)module0712.UNPROVIDED)) {
                            var362 = (SubLObject)module0712.T;
                        }
                    }
                    module0066.f4842(var369);
                }
            }
            if (module0712.NIL == var362) {
                var361 = (SubLObject)module0712.T;
            }
        }
        return var361;
    }
    
    public static SubLObject f43745(final SubLObject var358, SubLObject var357) {
        if (var357 == module0712.UNPROVIDED) {
            var357 = (SubLObject)module0712.NIL;
        }
        final SubLThread var359 = SubLProcess.currentSubLThread();
        SubLObject var360 = (SubLObject)module0712.NIL;
        SubLObject var361 = (SubLObject)module0712.NIL;
        SubLObject var362 = (SubLObject)module0712.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var358, var358, (SubLObject)module0712.$ic171$);
        var360 = var358.first();
        SubLObject var363 = var358.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var363, var358, (SubLObject)module0712.$ic171$);
        var361 = var363.first();
        var363 = var363.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var363, var358, (SubLObject)module0712.$ic171$);
        var362 = var363.first();
        var363 = var363.rest();
        if (module0712.NIL == var363) {
            final SubLObject var364 = (module0712.NIL != var357) ? var360 : ((module0712.NIL != module0711.$g5593$.getDynamicValue(var359)) ? Sequences.cconcatenate((SubLObject)module0712.$ic124$, new SubLObject[] { module0710.f43486(), module0712.$ic125$, var360 }) : Sequences.cconcatenate(module0710.f43487(), var360));
            final SubLObject var365 = module0601.$g4653$.currentBinding(var359);
            final SubLObject var366 = module0601.$g4652$.currentBinding(var359);
            try {
                module0601.$g4653$.bind(Sequences.length(module0712.$g5634$.getGlobalValue()), var359);
                module0601.$g4652$.bind(Numbers.multiply((SubLObject)module0712.ONE_INTEGER, module0601.$g4653$.getDynamicValue(var359)), var359);
                module0601.f36746();
                try {
                    final SubLObject var25_372 = module0601.$g4652$.currentBinding(var359);
                    final SubLObject var35_373 = module0601.$g4654$.currentBinding(var359);
                    try {
                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var359), module0601.$g4652$.getDynamicValue(var359)), var359);
                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var359), var359);
                        module0601.f36758(module0708.f43012((SubLObject)module0712.$ic172$), (SubLObject)ConsesLow.list(module0699.f42535((SubLObject)((module0712.NIL != var357) ? module0712.$ic130$ : module0712.$ic131$)), var364), (SubLObject)module0712.NIL, (SubLObject)module0712.NIL);
                        module0601.f36746();
                        SubLObject var367 = module0699.f42555((SubLObject)module0712.$ic173$);
                        module0601.f36758(var367, reader.bq_cons(module0709.f43161((SubLObject)module0712.$ic174$), (SubLObject)module0712.$ic175$), (SubLObject)module0712.NIL, (SubLObject)module0712.UNPROVIDED);
                        module0601.f36761(var360, (SubLObject)module0712.UNPROVIDED);
                        module0601.f36760(var367);
                        module0601.f36746();
                        var367 = module0699.f42555((SubLObject)module0712.$ic176$);
                        module0601.f36758(var367, reader.bq_cons(module0709.f43161((SubLObject)module0712.$ic174$), (SubLObject)module0712.$ic175$), (SubLObject)module0712.NIL, (SubLObject)module0712.UNPROVIDED);
                        module0601.f36761(var361, (SubLObject)module0712.UNPROVIDED);
                        module0601.f36760(var367);
                        if (module0712.NIL != var362) {
                            module0601.f36746();
                            module0601.f36758(module0699.f42535((SubLObject)module0712.$ic177$), (SubLObject)ConsesLow.list(module0699.f42535((SubLObject)module0712.$ic178$), module0708.f43012((SubLObject)module0712.$ic179$)), (SubLObject)module0712.T, (SubLObject)module0712.UNPROVIDED);
                        }
                    }
                    finally {
                        module0601.$g4654$.rebind(var35_373, var359);
                        module0601.$g4652$.rebind(var25_372, var359);
                    }
                }
                finally {
                    final SubLObject var25_373 = Threads.$is_thread_performing_cleanupP$.currentBinding(var359);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0712.T, var359);
                        module0601.f36746();
                        module0601.f36760(module0708.f43012((SubLObject)module0712.$ic172$));
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var25_373, var359);
                    }
                }
            }
            finally {
                module0601.$g4652$.rebind(var366, var359);
                module0601.$g4653$.rebind(var365, var359);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var358, (SubLObject)module0712.$ic171$);
        }
        return (SubLObject)module0712.NIL;
    }
    
    public static SubLObject f43746() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43657", "S#47815", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43658", "S#47816", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43659", "S#47817", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43660", "S#47818", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43661", "S#47819", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43662", "S#47820", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43663", "S#47821", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43664", "S#47822", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43665", "S#47823", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43666", "S#46534", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43667", "S#47599", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43669", "S#47824", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43668", "S#47825", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43670", "S#47600", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43672", "S#47826", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43671", "S#39908", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43673", "S#47827", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43674", "S#44997", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43675", "S#44998", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43676", "S#44999", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43677", "S#45000", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43678", "S#47828", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43679", "S#45001", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43680", "S#45002", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43681", "S#47829", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43682", "S#47830", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43683", "S#47831", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43684", "S#47832", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43685", "S#47833", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43686", "S#47834", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43687", "S#47835", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43688", "S#47836", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43689", "S#47602", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43690", "S#47837", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43692", "S#47838", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43691", "S#47839", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43695", "S#47840", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43696", "S#47841", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43697", "S#47842", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43698", "S#47843", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43699", "S#47844", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43701", "S#47845", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43700", "S#47846", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43702", "S#47847", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43694", "S#47848", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43703", "S#47849", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43704", "S#47850", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43705", "S#47851", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43706", "S#47852", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43707", "S#47853", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43708", "S#47854", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43709", "S#47855", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43710", "S#47856", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43711", "S#47857", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43712", "S#47858", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43713", "S#47859", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43714", "S#47860", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43693", "S#47861", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43717", "S#47862", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43719", "S#47863", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43721", "S#47864", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43715", "S#47865", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43718", "S#47866", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43723", "S#47867", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43722", "S#47868", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43724", "S#47869", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43720", "S#47870", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43726", "S#47871", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43727", "S#47872", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43731", "S#47873", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43730", "S#47874", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43729", "S#47875", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43732", "S#47876", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0712", "f43734", "S#47877");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43733", "S#47878", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43728", "S#47879", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43735", "S#47880", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43736", "S#47601", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43738", "S#47881", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43737", "S#47882", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43739", "S#47883", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43740", "S#47884", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43741", "S#47885", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43742", "S#47886", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43743", "S#47887", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43725", "S#47888", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43716", "S#47889", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43744", "S#47890", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0712", "f43745", "S#47891", 1, 1, false);
        return (SubLObject)module0712.NIL;
    }
    
    public static SubLObject f43747() {
        module0712.$g5632$ = SubLFiles.deflexical("S#47892", (SubLObject)module0712.NIL);
        module0712.$g5633$ = SubLFiles.deflexical("S#47893", (SubLObject)module0712.$ic3$);
        module0712.$g5634$ = SubLFiles.deflexical("S#47894", (SubLObject)module0712.$ic4$);
        module0712.$g5635$ = SubLFiles.deflexical("S#47895", Sequences.cconcatenate(module0712.$g5634$.getGlobalValue(), module0712.$g5634$.getGlobalValue()));
        module0712.$g5636$ = SubLFiles.deflexical("S#47896", Sequences.cconcatenate(module0712.$g5635$.getGlobalValue(), module0712.$g5634$.getGlobalValue()));
        module0712.$g5637$ = SubLFiles.deflexical("S#47897", Sequences.cconcatenate(module0712.$g5636$.getGlobalValue(), module0712.$g5634$.getGlobalValue()));
        module0712.$g5638$ = SubLFiles.deflexical("S#47898", Sequences.cconcatenate(module0712.$g5637$.getGlobalValue(), module0712.$g5634$.getGlobalValue()));
        module0712.$g5639$ = SubLFiles.deflexical("S#47899", (SubLObject)module0712.NIL);
        module0712.$g5640$ = SubLFiles.deflexical("S#47900", (SubLObject)module0712.$ic20$);
        module0712.$g5641$ = SubLFiles.deflexical("S#47901", (SubLObject)module0712.$ic21$);
        module0712.$g5642$ = SubLFiles.deflexical("S#47902", (SubLObject)module0712.$ic22$);
        module0712.$g5643$ = SubLFiles.defparameter("S#47903", (SubLObject)module0712.NIL);
        module0712.$g5644$ = SubLFiles.defparameter("S#47904", (SubLObject)module0712.NIL);
        module0712.$g5645$ = SubLFiles.defparameter("S#47905", (SubLObject)module0712.NIL);
        module0712.$g5646$ = SubLFiles.defparameter("S#47906", (SubLObject)module0712.$ic35$);
        module0712.$g5647$ = SubLFiles.deflexical("S#47907", (SubLObject)module0712.NIL);
        module0712.$g5648$ = SubLFiles.deflexical("S#47908", (SubLObject)module0712.NIL);
        module0712.$g5649$ = SubLFiles.defparameter("S#47909", (SubLObject)module0712.$ic51$);
        module0712.$g5650$ = SubLFiles.deflexical("S#47910", (SubLObject)module0712.NIL);
        module0712.$g5651$ = SubLFiles.defparameter("S#47911", (SubLObject)module0712.$ic116$);
        module0712.$g5652$ = SubLFiles.deflexical("S#47912", (SubLObject)module0712.$ic155$);
        module0712.$g5653$ = SubLFiles.deflexical("S#47913", (SubLObject)module0712.$ic156$);
        return (SubLObject)module0712.NIL;
    }
    
    public static SubLObject f43748() {
        module0034.f1909((SubLObject)module0712.$ic5$);
        module0034.f1895((SubLObject)module0712.$ic27$);
        module0034.f1895((SubLObject)module0712.$ic29$);
        module0002.f35((SubLObject)module0712.$ic31$, (SubLObject)module0712.$ic32$);
        module0034.f1909((SubLObject)module0712.$ic36$);
        module0034.f1909((SubLObject)module0712.$ic42$);
        module0034.f1909((SubLObject)module0712.$ic52$);
        module0034.f1895((SubLObject)module0712.$ic153$);
        return (SubLObject)module0712.NIL;
    }
    
    public void declareFunctions() {
        f43746();
    }
    
    public void initializeVariables() {
        f43747();
    }
    
    public void runTopLevelForms() {
        f43748();
    }
    
    static {
        me = (SubLFile)new module0712();
        module0712.$g5632$ = null;
        module0712.$g5633$ = null;
        module0712.$g5634$ = null;
        module0712.$g5635$ = null;
        module0712.$g5636$ = null;
        module0712.$g5637$ = null;
        module0712.$g5638$ = null;
        module0712.$g5639$ = null;
        module0712.$g5640$ = null;
        module0712.$g5641$ = null;
        module0712.$g5642$ = null;
        module0712.$g5643$ = null;
        module0712.$g5644$ = null;
        module0712.$g5645$ = null;
        module0712.$g5646$ = null;
        module0712.$g5647$ = null;
        module0712.$g5648$ = null;
        module0712.$g5649$ = null;
        module0712.$g5650$ = null;
        module0712.$g5651$ = null;
        module0712.$g5652$ = null;
        module0712.$g5653$ = null;
        $ic0$ = SubLObjectFactory.makeString("   <rdfs:comment xml:lang=\"en\">");
        $ic1$ = SubLObjectFactory.makeString("\n        </rdfs:comment>\n    </owl:Ontology>\n");
        $ic2$ = SubLObjectFactory.makeString("opencyc");
        $ic3$ = SubLObjectFactory.makeString("</rdf:RDF>\n");
        $ic4$ = SubLObjectFactory.makeString("    ");
        $ic5$ = SubLObjectFactory.makeSymbol("S#47820", "CYC");
        $ic6$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:label"), (SubLObject)SubLObjectFactory.makeString("xml:lang"), (SubLObject)SubLObjectFactory.makeString("en"));
        $ic7$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("skos:prefLabel"), (SubLObject)SubLObjectFactory.makeString("xml:lang"), (SubLObject)SubLObjectFactory.makeString("en"));
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("skos:altLabel"), (SubLObject)SubLObjectFactory.makeString("xml:lang"), (SubLObject)SubLObjectFactory.makeString("en"));
        $ic9$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("prettyString"), (SubLObject)SubLObjectFactory.makeString("xml:lang"), (SubLObject)SubLObjectFactory.makeString("en"));
        $ic10$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("prettyString"));
        $ic11$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("xml:lang"), (SubLObject)SubLObjectFactory.makeString("en"));
        $ic12$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("nameString"), (SubLObject)SubLObjectFactory.makeString("xml:lang"), (SubLObject)SubLObjectFactory.makeString("en"));
        $ic13$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("nameString"));
        $ic14$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:comment"), (SubLObject)SubLObjectFactory.makeString("xml:lang"), (SubLObject)SubLObjectFactory.makeString("en"));
        $ic15$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("skos:definition"), (SubLObject)SubLObjectFactory.makeString("xml:lang"), (SubLObject)SubLObjectFactory.makeString("en"));
        $ic16$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:intersectionOf"), (SubLObject)SubLObjectFactory.makeString("rdf:parseType"), (SubLObject)SubLObjectFactory.makeString("Collection"));
        $ic17$ = SubLObjectFactory.makeString(":label");
        $ic18$ = SubLObjectFactory.makeSymbol("S#47899", "CYC");
        $ic19$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic20$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("broaderThan"), SubLObjectFactory.makeString("Mx4rZOAVeiYGEdqAAAACs2IMmw"), SubLObjectFactory.makeString("broaderTerm"), SubLObjectFactory.makeString("hasWikipediaArticle"), SubLObjectFactory.makeString("Mx4rI7tMQs31R_6Nz85QD-I0Fg"), SubLObjectFactory.makeString("rdf:type"), SubLObjectFactory.makeString("rdfs:subClassOf"), SubLObjectFactory.makeString("rdfs:subPropertyOf"), SubLObjectFactory.makeString("rdfs:domain"), SubLObjectFactory.makeString("rdfs:range"), SubLObjectFactory.makeString("owl:sameAs") });
        $ic21$ = SubLObjectFactory.makeString("http://sw.opencyc.org/[0-9/]*(concept|cyc)/(.*)");
        $ic22$ = SubLObjectFactory.makeString("http://sw.cyc.com/[0-9/]*(concept|cyc)/(.*)");
        $ic23$ = SubLObjectFactory.makeString("http://sw.opencyc.org");
        $ic24$ = SubLObjectFactory.makeString("http://sw.cyc.com");
        $ic25$ = SubLObjectFactory.makeSymbol("SECOND");
        $ic26$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic27$ = SubLObjectFactory.makeSymbol("S#47825", "CYC");
        $ic28$ = SubLObjectFactory.makeInteger(256);
        $ic29$ = SubLObjectFactory.makeSymbol("S#39908", "CYC");
        $ic30$ = SubLObjectFactory.makeString("OpenCyc URIs must either use a version date or external ID.");
        $ic31$ = SubLObjectFactory.makeSymbol("S#44997", "CYC");
        $ic32$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#47914", "CYC"));
        $ic33$ = SubLObjectFactory.makeString("Human-readable OWL export requires a valid (UNIVERSAL-DATE-P) version date. Got ~S");
        $ic34$ = SubLObjectFactory.makeSymbol("S#5859", "CYC");
        $ic35$ = SubLObjectFactory.makeString("data/caches/5019/fort-owl-names.csv");
        $ic36$ = SubLObjectFactory.makeSymbol("S#47832", "CYC");
        $ic37$ = SubLObjectFactory.makeInteger(200000);
        $ic38$ = SubLObjectFactory.makeKeyword("INPUT");
        $ic39$ = SubLObjectFactory.makeString("Unable to open ~S");
        $ic40$ = SubLObjectFactory.makeString("\"");
        $ic41$ = SubLObjectFactory.makeSymbol("S#47907", "CYC");
        $ic42$ = SubLObjectFactory.makeSymbol("S#47836", "CYC");
        $ic43$ = SubLObjectFactory.makeSymbol("S#47908", "CYC");
        $ic44$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("termTypeForOntology"));
        $ic45$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("contextOfPCW"));
        $ic46$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("synonymousExternalConcept"));
        $ic47$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("overlappingExternalConcept"));
        $ic48$ = SubLObjectFactory.makeSymbol("S#747", "CYC");
        $ic49$ = SubLObjectFactory.makeSymbol("S#47649", "CYC");
        $ic50$ = SubLObjectFactory.makeString("No asents for ~S.");
        $ic51$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("ExistingObjectType")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("ExistingStuffType")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("TemporalObjectType")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("TemporalStuffType")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("ObjectType")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("StuffType")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Collection")));
        $ic52$ = SubLObjectFactory.makeSymbol("S#47843", "CYC");
        $ic53$ = SubLObjectFactory.makeSymbol("S#19639", "CYC");
        $ic54$ = SubLObjectFactory.makeSymbol("S#11103", "CYC");
        $ic55$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("BinaryPredicateTypeByLogicalFeature"));
        $ic56$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("CoexistingObjectsPredicate")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("BinaryRolePredicate")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("ComplexTemporalPredicate")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("BinaryPredicate")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Predicate")));
        $ic57$ = SubLObjectFactory.makeSymbol("S#47910", "CYC");
        $ic58$ = SubLObjectFactory.makeSymbol("S#47840", "CYC");
        $ic59$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic60$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic61$ = SubLObjectFactory.makeKeyword("GAF");
        $ic62$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic63$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlPreds")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("arg1Isa")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("arg2Isa")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("arg1SometimesIsa")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("arg2SometimesIsa")));
        $ic64$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic65$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genls"));
        $ic66$ = SubLObjectFactory.makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic67$ = SubLObjectFactory.makeSymbol("S#47647", "CYC");
        $ic68$ = SubLObjectFactory.makeSymbol("ATOMIC-SENTENCE-ARG1");
        $ic69$ = SubLObjectFactory.makeString("~&Extracted ~D subject terms from ~D asents.~%");
        $ic70$ = SubLObjectFactory.makeKeyword("OUTPUT");
        $ic71$ = SubLObjectFactory.makeString("/");
        $ic72$ = SubLObjectFactory.makeString("log.txt");
        $ic73$ = SubLObjectFactory.makeString("owl-export-human-readable.owl");
        $ic74$ = SubLObjectFactory.makeString("~&Starting human-readable export...~%");
        $ic75$ = SubLObjectFactory.makeString("owl-export-versioned.owl");
        $ic76$ = SubLObjectFactory.makeString("~&Starting versioned export...~%");
        $ic77$ = SubLObjectFactory.makeString("owl-export-unversioned.owl");
        $ic78$ = SubLObjectFactory.makeString("~&Starting unversioned export...~%");
        $ic79$ = SubLObjectFactory.makeString("log-unversioned.txt");
        $ic80$ = SubLObjectFactory.makeString(".rdf");
        $ic81$ = SubLObjectFactory.makeString(".log");
        $ic82$ = SubLObjectFactory.makeString("skos");
        $ic83$ = SubLObjectFactory.makeString("rdf");
        $ic84$ = SubLObjectFactory.makeString("rdfs");
        $ic85$ = SubLObjectFactory.makeString("cyc");
        $ic86$ = SubLObjectFactory.makeString("oc");
        $ic87$ = SubLObjectFactory.makeKeyword("NEW");
        $ic88$ = SubLObjectFactory.makeString("");
        $ic89$ = SubLObjectFactory.makeString("~A~A~%");
        $ic90$ = SubLObjectFactory.makeString(" ");
        $ic91$ = SubLObjectFactory.makeKeyword("DEPTH");
        $ic92$ = SubLObjectFactory.makeKeyword("STACK");
        $ic93$ = SubLObjectFactory.makeKeyword("QUEUE");
        $ic94$ = SubLObjectFactory.makeSymbol("S#11450", "CYC");
        $ic95$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic96$ = SubLObjectFactory.makeString("~A is not a ~A");
        $ic97$ = SubLObjectFactory.makeSymbol("S#11592", "CYC");
        $ic98$ = SubLObjectFactory.makeKeyword("CERROR");
        $ic99$ = SubLObjectFactory.makeString("continue anyway");
        $ic100$ = SubLObjectFactory.makeKeyword("WARN");
        $ic101$ = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic102$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $ic103$ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $ic104$ = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic105$ = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic106$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("genls")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("geographicalSubRegions")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("geopoliticalSubdivision")));
        $ic107$ = SubLObjectFactory.makeKeyword("IGNORE");
        $ic108$ = SubLObjectFactory.makeString("~&Exporting ~D Terms from iterator.~%");
        $ic109$ = SubLObjectFactory.makeString("exporting ");
        $ic110$ = SubLObjectFactory.makeString(" terms to OWL");
        $ic111$ = SubLObjectFactory.makeString("~&Exported ~D Terms and ~D sentences.~%");
        $ic112$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic113$ = SubLObjectFactory.makeString("~&~S: ~D sentences.~%");
        $ic114$ = SubLObjectFactory.makeString("Description");
        $ic115$ = SubLObjectFactory.makeString("~a");
        $ic116$ = SubLObjectFactory.makeString("2.0.0");
        $ic117$ = SubLObjectFactory.makeString("        <owl:versionInfo>Version ");
        $ic118$ = SubLObjectFactory.makeString("</owl:versionInfo>\n     ");
        $ic119$ = SubLObjectFactory.makeString("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        $ic120$ = SubLObjectFactory.makeString("<rdf:RDF xml:base=\"");
        $ic121$ = SubLObjectFactory.makeString("    xmlns=\"");
        $ic122$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#10299", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#47557", "CYC"));
        $ic123$ = SubLObjectFactory.makeString("~%    xmlns:~A=~S");
        $ic124$ = SubLObjectFactory.makeString("&");
        $ic125$ = SubLObjectFactory.makeString(";");
        $ic126$ = SubLObjectFactory.makeString(">~%~%");
        $ic127$ = SubLObjectFactory.makeString("    <owl:Ontology rdf:about=\"\">~%");
        $ic128$ = SubLObjectFactory.makeSymbol("S#3341", "CYC");
        $ic129$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#47915", "CYC"));
        $ic130$ = SubLObjectFactory.makeString("ID");
        $ic131$ = SubLObjectFactory.makeString("about");
        $ic132$ = SubLObjectFactory.makeSymbol("S#39767", "CYC");
        $ic133$ = SubLObjectFactory.makeString("Invalid XML name: ~S~% Default namespace is ~S");
        $ic134$ = SubLObjectFactory.makeString("</");
        $ic135$ = SubLObjectFactory.makeString(">");
        $ic136$ = SubLObjectFactory.makeString("&u");
        $ic137$ = SubLObjectFactory.makeString("<p/>");
        $ic138$ = SubLObjectFactory.makeString("<p>");
        $ic139$ = SubLObjectFactory.makeString("rdf:resource");
        $ic140$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("OWLURIFn"));
        $ic141$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("OWLDatatypeFn"));
        $ic142$ = SubLObjectFactory.makeString("rdf:datatype");
        $ic143$ = SubLObjectFactory.makeString("owl:intersectionOf");
        $ic144$ = SubLObjectFactory.makeSymbol("S#40577", "CYC");
        $ic145$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#696", "CYC"), (SubLObject)module0712.ONE_INTEGER)), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic146$ = SubLObjectFactory.makeSymbol("CLET");
        $ic147$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#40602", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("S#47894", "CYC")));
        $ic148$ = SubLObjectFactory.makeSymbol("S#40601", "CYC");
        $ic149$ = SubLObjectFactory.makeSymbol("*");
        $ic150$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#40602", "CYC"));
        $ic151$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#47805", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#47916", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#47806", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#47917", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#47807", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#137", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#47808", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC")));
        $ic152$ = SubLObjectFactory.makeString("OWL indent level too high");
        $ic153$ = SubLObjectFactory.makeSymbol("S#47882", "CYC");
        $ic154$ = SubLObjectFactory.makeString("Assuming ~S is OK to export");
        $ic155$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("externalID"), (SubLObject)SubLObjectFactory.makeString("A unique, language-neutral, variable-sized identifier for a concept that can be used to refer unambiguously to that concept across OWL exports or across Cyc inference engines."), (SubLObject)module0712.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("label"), (SubLObject)SubLObjectFactory.makeString("A natural-language representation for a concept that is both human readable and readable by the Cyc inference engine. These terms are not guaranteed to refer to the same concept across time but are guaranteed to be consistent within a particular OWL export. Use \"cycAnnot:externalID\" for unambiguously referring to a concept across OWL exports or across Cyc inference engines."), (SubLObject)module0712.NIL));
        $ic156$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl"), (SubLObject)SubLObjectFactory.makeString("rdfs"), (SubLObject)SubLObjectFactory.makeString("rdf"));
        $ic157$ = SubLObjectFactory.makeSymbol("S#47883", "CYC");
        $ic158$ = SubLObjectFactory.makeSymbol("CAR");
        $ic159$ = SubLObjectFactory.makeString("xmlns:");
        $ic160$ = SubLObjectFactory.makeString("rdf:RDF");
        $ic161$ = SubLObjectFactory.makeString("xml:base");
        $ic162$ = SubLObjectFactory.makeString("xmlns");
        $ic163$ = SubLObjectFactory.makeString("<!DOCTYPE rdf:RDF");
        $ic164$ = SubLObjectFactory.makeString(" [~%");
        $ic165$ = SubLObjectFactory.makeSymbol("LENGTH");
        $ic166$ = SubLObjectFactory.makeString("     <!ENTITY ~");
        $ic167$ = SubLObjectFactory.makeString("A ~S >~%");
        $ic168$ = SubLObjectFactory.makeString("   ]");
        $ic169$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#42702", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#47918", "CYC"));
        $ic170$ = SubLObjectFactory.makeSymbol("ATOMIC-SENTENCE-PREDICATE");
        $ic171$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#47804", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("COMMENT"), (SubLObject)SubLObjectFactory.makeSymbol("S#47919", "CYC"));
        $ic172$ = SubLObjectFactory.makeString("AnnotationProperty");
        $ic173$ = SubLObjectFactory.makeString("label");
        $ic174$ = SubLObjectFactory.makeString("lang");
        $ic175$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("en"));
        $ic176$ = SubLObjectFactory.makeString("comment");
        $ic177$ = SubLObjectFactory.makeString("type");
        $ic178$ = SubLObjectFactory.makeString("resource");
        $ic179$ = SubLObjectFactory.makeString("FunctionalProperty");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0712.class
	Total time: 2409 ms
	
	Decompiled with Procyon 0.5.32.
*/